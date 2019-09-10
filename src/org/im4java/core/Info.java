/**************************************************************************
/* This class implements an image-information object.
/*
/* Copyright (c) 2009 by Bernhard Bablok (mail@bablokb.de)
/*
/* This program is free software; you can redistribute it and/or modify
/* it under the terms of the GNU Library General Public License as published
/* by  the Free Software Foundation; either version 2 of the License or
/* (at your option) any later version.
/*
/* This program is distributed in the hope that it will be useful, but
/* WITHOUT ANY WARRANTY; without even the implied warranty of
/* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
/* GNU Library General Public License for more details.
/*
/* You should have received a copy of the GNU Library General Public License
/* along with this program; see the file COPYING.LIB.  If not, write to
/* the Free Software Foundation Inc., 59 Temple Place - Suite 330,
/* Boston, MA  02111-1307 USA
/**************************************************************************/

package org.im4java.core;

import java.util.*;
import java.io.*;

import org.im4java.process.ArrayListOutputConsumer;

/**
   This class implements an image-information object.

   <p>The class just calls "identify -verbose" and parses the output.</p>
   
   @version $Revision: 1.12 $
   @author  $Author: bablokb $
 
   @since 0.95
*/

public class  Info {

  //////////////////////////////////////////////////////////////////////////////

  /**
     Internal hashtable with image-attributes. For images with multiple
     scenes, this hashtable holds the attributes of the last scene.
  */

  private Hashtable<String,String> iAttributes = null;

  //////////////////////////////////////////////////////////////////////////////

  /**
     List of hashtables with image-attributes. Ther is one element for every
     scene in the image.

     @since 1.3.0
  */

  private LinkedList<Hashtable<String,String>> iAttribList = 
                                     new LinkedList<Hashtable<String,String>>();

  //////////////////////////////////////////////////////////////////////////////

  /**
     Current value of indentation level
  */

  private int iOldIndent=0;

  //////////////////////////////////////////////////////////////////////////////

  /**
     Current value of attribute-prefix
  */

  private String iPrefix="";

  //////////////////////////////////////////////////////////////////////////////

  /**
     This contstructor will automatically parse the full output
     of identify -verbose.
 
     @param pImage  Source image
     @since 0.95
  */

  public Info(String pImage) throws InfoException {
    getCompleteInfo(pImage);
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     This constructor creates an Info-object with basic or complete
     image-information (depending on the second argument).
 
     @param pImage  Source image
     @param basic   Set to true for basic information, to false for complete info
     @since 1.2.0
  */

  public Info(String pImage, boolean basic) throws InfoException {

    if (!basic) {
      getCompleteInfo(pImage);
    } else {
      getBaseInfo(pImage);
    }
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Query complete image-information.
 
     @param pImage  Source image
     @since 1.2.0
  */

  private void getCompleteInfo(String pImage) throws InfoException {
    IMOperation op = new IMOperation();
    op.verbose();
    op.addImage(pImage);

    try {
      IdentifyCmd identify = new IdentifyCmd();
      ArrayListOutputConsumer output = new ArrayListOutputConsumer();
      identify.setOutputConsumer(output);
      identify.run(op);
      ArrayList<String> cmdOutput = output.getOutput();
      for (String line:cmdOutput) {
	parseLine(line);
      }

      // finish and add last hashtable to linked-list
      addBaseInfo();
      iAttribList.add(iAttributes);
      
    } catch (Exception ex) {
      throw new InfoException(ex);
    }
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add basic info to complete-info.

     @since 1.3.0
  */

  private void addBaseInfo() {
    // complete output does not include width, height, depth
    String[] dim = iAttributes.get("Geometry").split("x|\\+");
    iAttributes.put("Width",dim[0]);
    iAttributes.put("Height",dim[1]);
    dim = iAttributes.get("Page geometry").split("x|\\+");
    iAttributes.put("PageWidth",dim[0]);
    iAttributes.put("PageHeight",dim[1]);
    iAttributes.put("PageGeometry",iAttributes.get("Page geometry"));
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Parse line of identify-output
  */

  private void parseLine(String pLine) {
    // structure:
    //    indent attribute: value

    int indent = pLine.indexOf(pLine.trim())/2;
    if (indent == 0) {
      // start of a new scene
      if (iAttributes != null) {
	addBaseInfo();
	iAttribList.add(iAttributes);
      }
      iAttributes = new Hashtable<String,String>();
    }

    String[] parts = pLine.trim().split(": ",2);

    // check indentation level and remove prefix if necessary
    if (indent < iOldIndent) {
      // remove tokens from iPrefix
      int colonIndex=iPrefix.length()-1;
      for (int i=0;i<iOldIndent-indent;++i) {
	colonIndex = iPrefix.lastIndexOf(':',colonIndex-1);
      }
      if (colonIndex == -1) {
	iPrefix="";
      } else {
	iPrefix=iPrefix.substring(0,colonIndex+1);
      }
    }
    iOldIndent = indent;

    // add a new attribute or increase prefix
    if (parts.length == 1) {
      // no value => add attribute to attribute-prefix
      iPrefix=iPrefix+parts[0];
    } else {
      // value => add (key,value) to attributes
      iAttributes.put(iPrefix+parts[0],parts[1]);
    }
  }


  //////////////////////////////////////////////////////////////////////////////

  /**
     Query basic image-information.
 
     @param pImage  Source image
     @since 1.2.0
  */

  private void getBaseInfo(String pImage) throws InfoException {
    // create operation
    IMOperation op = new IMOperation();
    op.ping();
    op.format("%m\n%w\n%h\n%g\n%W\n%H\n%G\n%z\n%r");
    op.addImage(pImage);

    try {
      // execute ...
      IdentifyCmd identify = new IdentifyCmd();
      ArrayListOutputConsumer output = new ArrayListOutputConsumer();
      identify.setOutputConsumer(output);
      identify.run(op);

      // ... and parse result
      ArrayList<String> cmdOutput = output.getOutput();
      Iterator<String> iter = cmdOutput.iterator();

      iAttributes = new Hashtable<String,String>();
      iAttributes.put("Format",iter.next());
      iAttributes.put("Width",iter.next());
      iAttributes.put("Height",iter.next());
      iAttributes.put("Geometry",iter.next());
      iAttributes.put("PageWidth",iter.next());
      iAttributes.put("PageHeight",iter.next());
      iAttributes.put("PageGeometry",iter.next());
      iAttributes.put("Depth",iter.next());
      iAttributes.put("Class",iter.next());
      iAttribList.add(iAttributes);
    } catch (Exception ex) {
      throw new InfoException(ex);
    }
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Return the image format.
  */

  public String getImageFormat() {
    return iAttributes.get("Format");
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Return the image format for the given scene.

     @param pSceneNr Scene-number (zero-based)

     @since 1.3.0
  */

  public String getImageFormat(int pSceneNr) {
    return iAttribList.get(pSceneNr).get("Format");
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Return the image width.
  */

  public int getImageWidth() throws InfoException {
    return getImageWidth(iAttribList.size()-1);
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Return the image width for the given scene.

     @param pSceneNr Scene-number (zero-based)

     @since 1.3.0
  */

  public int getImageWidth(int pSceneNr) throws InfoException {
    try {
      return Integer.parseInt(iAttribList.get(pSceneNr).get("Width"));
    } catch (NumberFormatException ex) {
      throw new InfoException(ex);
    }
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Return the image height.
  */

  public int getImageHeight() throws InfoException {
    return getImageHeight(iAttribList.size()-1);
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Return the image height for the given scene.

     @param pSceneNr Scene-number (zero-based)

     @since 1.3.0
  */

  public int getImageHeight(int pSceneNr) throws InfoException {
    try {
      return Integer.parseInt(iAttribList.get(pSceneNr).get("Height"));
    } catch (NumberFormatException ex) {
      throw new InfoException(ex);
    }
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Return the image geometry.
  */

  public String getImageGeometry() {
    return iAttributes.get("Geometry");
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Return the image geometry for the given scene.

     @param pSceneNr Scene-number (zero-based)

     @since 1.3.0
  */

  public String getImageGeometry(int pSceneNr) {
    return iAttribList.get(pSceneNr).get("Geometry");
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Return the image depth. Note that this method just returns an integer
     (e.g. 8 or 16), and not a string ("8-bit") like getProperty("Depth")
     does.

     @since 1.3.0
  */

  public int getImageDepth() throws InfoException {
    return getImageDepth(iAttribList.size()-1);
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Return the image depth. Note that this method just returns an integer
     (e.g. 8 or 16), and not a string ("8-bit") like getProperty("Depth")
     does.

     @param pSceneNr Scene-number (zero-based)

     @since 1.3.0
  */

  public int getImageDepth(int pSceneNr) throws InfoException {
    String[] depth = iAttribList.get(pSceneNr).get("Depth").split("-|/",2);
    try {
      return Integer.parseInt(depth[0]);
    } catch (NumberFormatException ex) {
      throw new InfoException(ex);
    }
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Return the image class.
  */

  public String getImageClass() {
    return iAttributes.get("Class");
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Return the image class for the given scene.

     @param pSceneNr Scene-number (zero-based)

     @since 1.3.0
  */

  public String getImageClass(int pSceneNr) {
    return iAttribList.get(pSceneNr).get("Class");
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Return the page width.

     @since 1.3.0
  */

  public int getPageWidth() throws InfoException {
    return getPageWidth(iAttribList.size()-1);
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Return the page width for the given scene.

     @param pSceneNr Scene-number (zero-based)

     @since 1.3.0
  */

  public int getPageWidth(int pSceneNr) throws InfoException {
    try {
      return Integer.parseInt(iAttribList.get(pSceneNr).get("PageWidth"));
    } catch (NumberFormatException ex) {
      throw new InfoException(ex);
    }
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Return the page height.

     @since 1.3.0
  */

  public int getPageHeight() throws InfoException {
    return getPageHeight(iAttribList.size()-1);
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Return the page height for the given scene.

     @param pSceneNr Scene-number (zero-based)

     @since 1.3.0
  */

  public int getPageHeight(int pSceneNr) throws InfoException {
    try {
      return Integer.parseInt(iAttribList.get(pSceneNr).get("PageHeight"));
    } catch (NumberFormatException ex) {
      throw new InfoException(ex);
    }
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Return the page geometry.

     @since 1.3.0
  */

  public String getPageGeometry() {
    return iAttributes.get("PageGeometry");
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Return the page geometry for the given scene.

     @param pSceneNr Scene-number (zero-based)

     @since 1.3.0
  */

  public String getPageGeometry(int pSceneNr) {
    return iAttribList.get(pSceneNr).get("PageGeometry");
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Return the given property.
  */

  public String getProperty(String pPropertyName) {
    return iAttributes.get(pPropertyName);
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Return the given property of the given scene.

     @param pPropertyName Name of the property
     @param pSceneNr Scene-number (zero-based)

     @since 1.3.0
  */

  public String getProperty(String pPropertyName, int pSceneNr) {
    return iAttribList.get(pSceneNr).get(pPropertyName);
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Return the number of scenes.

     @since 1.3.0
  */

  public int getSceneCount() {
    return iAttribList.size();
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Return an enumeration of all properties.
  */

  public Enumeration<String> getPropertyNames() {
    return iAttributes.keys();
  }
}
