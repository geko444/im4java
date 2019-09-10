/**************************************************************************
/* This class implements a test of the Info-class.
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

package org.im4java.test;

import java.util.*;
import org.im4java.core.*;

/**
   This class implements a test of the Info-class.

   @version $Revision: 1.9 $
   @author  $Author: bablokb $
 
   @since 1.0.0
 */

public class TestCase8 extends AbstractTestCase {

  //////////////////////////////////////////////////////////////////////////////

  /**
     Return the description of the test.
  */

  public String getDescription() {
    return "info";
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Main method. Just calls AbstractTestCase.runTest(), which catches and
     prints exceptions.
  */

  public static void main(String[] args) {
    TestCase8 tc = new TestCase8();
    tc.runTest(args);
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Run the test.
  */

  public void run() throws Exception {
    System.err.println(" 8. Testing info ...");

    // use first parameter as input image
    String imgName = iImageDir+"multi-scene.gif";
    if (iArgs != null && iArgs.length > 0) {
      imgName = iArgs[0];
    }

    // create and output complete information
    Info imageInfo = new Info(imgName);

    // dump all that is available
    Enumeration<String> props = imageInfo.getPropertyNames();
    if (props == null) {
      return;
    }

    System.out.println("\n==================================");
    System.out.println("complete info (all attributes)");
    System.out.println("==================================\n");

    while (props.hasMoreElements()) {
      String prop=props.nextElement();
      System.out.println(prop+"="+imageInfo.getProperty(prop));
    }
    System.out.println("\n==================================");
    System.out.println("some attributes for every scene");
    System.out.println("==================================\n");

    int n = imageInfo.getSceneCount();
    for (int i=0; i<n; ++i) {
      System.out.println(i+": geometry=" + imageInfo.getProperty("Geometry",i));
      System.out.println(i+": page geometry=" + 
			 imageInfo.getProperty("Page geometry",i));
    }

    System.out.println("\n==================================");
    System.out.println("basic information from complete info");
    System.out.println("==================================\n");

    // check that basic information is also available
    dumpBasicInfo(imageInfo);
    System.out.println("\n==================================");
    System.out.println("basic information (base only)");
    System.out.println("==================================\n");

    // create and output basic information
    imageInfo = new Info(imgName,true);
    dumpBasicInfo(imageInfo);
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Dump all the basic image-information
  */

  private void dumpBasicInfo(Info pImageInfo) throws InfoException {
    System.out.println("Format: " + pImageInfo.getImageFormat());
    System.out.println("Width: " + pImageInfo.getImageWidth());
    System.out.println("Height: " + pImageInfo.getImageHeight());
    System.out.println("Geometry: " + pImageInfo.getImageGeometry());
    System.out.println("PageWidth: " + pImageInfo.getPageWidth());
    System.out.println("PageHeight: " + pImageInfo.getPageHeight());
    System.out.println("PageGeometry: " + pImageInfo.getPageGeometry());
    System.out.println("Depth: " + pImageInfo.getImageDepth());
    System.out.println("Class: " + pImageInfo.getImageClass());

    // and the same for all scenes
    int n = pImageInfo.getSceneCount();
    for (int i=0; i<n; ++i) {
      System.out.println("--------------- " + i + " -------------------");
      System.out.println("Format: " + pImageInfo.getImageFormat(i));
      System.out.println("Width: " + pImageInfo.getImageWidth(i));
      System.out.println("Height: " + pImageInfo.getImageHeight(i));
      System.out.println("Geometry: " + pImageInfo.getImageGeometry(i));
      System.out.println("PageWidth: " + pImageInfo.getPageWidth(i));
      System.out.println("PageHeight: " + pImageInfo.getPageHeight(i));
      System.out.println("PageGeometry: " + pImageInfo.getPageGeometry(i));
      System.out.println("Depth: " + pImageInfo.getImageDepth(i));
      System.out.println("Class: " + pImageInfo.getImageClass(i));
    }
  }
}