/**************************************************************************
/* This class adds all the JPT methods to an Operation.
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

/**
   This class adds all the JPT methods to an Operation.

   @version $Revision: 1.12 $
   @author  $Author: bablokb $
*/

public class JPTOps extends Operation {

  //////////////////////////////////////////////////////////////////////////////

  /**
     Constructor.
  */

  protected JPTOps() {
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -copy (see documentation of the underlying tool for details).
  */

  public JPTOps copy() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-copy");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -copy (see documentation of the underlying tool for details).
  */

  public JPTOps copy(String pCopyType) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-copy");

    if (pCopyType != null) {
      buf.append(pCopyType.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -optimize (see documentation of the underlying tool for details).
  */

  public JPTOps optimize() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-optimize");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -progressive (see documentation of the underlying tool for details).
  */

  public JPTOps progressive() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-progressive");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -crop (see documentation of the underlying tool for details).
  */

  public JPTOps crop() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-crop");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -crop (see documentation of the underlying tool for details).
  */

  public JPTOps crop(Integer pWidth) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-crop");

    if (pWidth != null) {
      buf.append(pWidth.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -crop (see documentation of the underlying tool for details).
  */

  public JPTOps crop(Integer pWidth, Integer pHeight) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-crop");

    if (pWidth != null) {
      buf.append(pWidth.toString());
    }
    buf.append("x");
    if (pHeight != null) {
      buf.append(pHeight.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -crop (see documentation of the underlying tool for details).
  */

  public JPTOps crop(Integer pWidth, Integer pHeight, Integer pXoffset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-crop");

    if (pWidth != null) {
      buf.append(pWidth.toString());
    }
    buf.append("x");
    if (pHeight != null) {
      buf.append(pHeight.toString());
    }
    oper="+";
    if (pXoffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (pXoffset != null) {
      buf.append(pXoffset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -crop (see documentation of the underlying tool for details).
  */

  public JPTOps crop(Integer pWidth, Integer pHeight, Integer pXoffset, Integer pYoffset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-crop");

    if (pWidth != null) {
      buf.append(pWidth.toString());
    }
    buf.append("x");
    if (pHeight != null) {
      buf.append(pHeight.toString());
    }
    oper="+";
    if (pXoffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (pXoffset != null) {
      buf.append(pXoffset.toString());
    }
    oper="+";
    if (pYoffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (pYoffset != null) {
      buf.append(pYoffset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -grayscale (see documentation of the underlying tool for details).
  */

  public JPTOps grayscale() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-grayscale");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -flip (see documentation of the underlying tool for details).
  */

  public JPTOps flip() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-flip");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -flip (see documentation of the underlying tool for details).
  */

  public JPTOps flip(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-flip");

    if (type != null) {
      buf.append(type.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -perfect (see documentation of the underlying tool for details).
  */

  public JPTOps perfect() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-perfect");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -rotate (see documentation of the underlying tool for details).
  */

  public JPTOps rotate() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-rotate");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -rotate (see documentation of the underlying tool for details).
  */

  public JPTOps rotate(Double pDegrees) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-rotate");

    if (pDegrees != null) {
      buf.append(pDegrees.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -transpose (see documentation of the underlying tool for details).
  */

  public JPTOps transpose() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-transpose");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -transverse (see documentation of the underlying tool for details).
  */

  public JPTOps transverse() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-transverse");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -trim (see documentation of the underlying tool for details).
  */

  public JPTOps trim() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-trim");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -restart (see documentation of the underlying tool for details).
  */

  public JPTOps restart() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-restart");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -restart (see documentation of the underlying tool for details).
  */

  public JPTOps restart(Integer pNumber) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-restart");

    if (pNumber != null) {
      buf.append(pNumber.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -maxmemory (see documentation of the underlying tool for details).
  */

  public JPTOps maxmemory() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-maxmemory");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -maxmemory (see documentation of the underlying tool for details).
  */

  public JPTOps maxmemory(Integer pSize) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-maxmemory");

    if (pSize != null) {
      buf.append(pSize.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -outfile (see documentation of the underlying tool for details).
  */

  public JPTOps outfile() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-outfile");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -outfile (see documentation of the underlying tool for details).
  */

  public JPTOps outfile(String pFilename) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-outfile");

    if (pFilename != null) {
      buf.append(pFilename.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -verbose (see documentation of the underlying tool for details).
  */

  public JPTOps verbose() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-verbose");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -debug (see documentation of the underlying tool for details).
  */

  public JPTOps debug() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-debug");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -scans (see documentation of the underlying tool for details).
  */

  public JPTOps scans() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-scans");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -scans (see documentation of the underlying tool for details).
  */

  public JPTOps scans(String pFilename) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-scans");

    if (pFilename != null) {
      buf.append(pFilename.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }


}
