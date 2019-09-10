/**************************************************************************
/* This class adds all the UFRaw methods to an Operation.
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
   This class adds all the UFRaw methods to an Operation.

   @version $Revision: 1.12 $
   @author  $Author: bablokb $
*/

public class UFRawOps extends Operation {

  //////////////////////////////////////////////////////////////////////////////

  /**
     Constructor.
  */

  protected UFRawOps() {
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --conf= (see documentation of the underlying tool for details).
  */

  public UFRawOps conf(String pFile) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--conf=");

    if (pFile != null) {
      buf.append(pFile.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --wb= (see documentation of the underlying tool for details).
  */

  public UFRawOps wb(String pType) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--wb=");

    if (pType != null) {
      buf.append(pType.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --temperature= (see documentation of the underlying tool for details).
  */

  public UFRawOps temperature(Integer pTemp) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--temperature=");

    if (pTemp != null) {
      buf.append(pTemp.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --green= (see documentation of the underlying tool for details).
  */

  public UFRawOps green(Double pFactor) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--green=");

    if (pFactor != null) {
      buf.append(pFactor.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --base-curve= (see documentation of the underlying tool for details).
  */

  public UFRawOps baseCurve(String pType) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--base-curve=");

    if (pType != null) {
      buf.append(pType.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --base-curve-file= (see documentation of the underlying tool for details).
  */

  public UFRawOps baseCurveFile(String pBaseCurveFile) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--base-curve-file=");

    if (pBaseCurveFile != null) {
      buf.append(pBaseCurveFile.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --curve= (see documentation of the underlying tool for details).
  */

  public UFRawOps curve(String pCurveType) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--curve=");

    if (pCurveType != null) {
      buf.append(pCurveType.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --curve-file= (see documentation of the underlying tool for details).
  */

  public UFRawOps curveFile(String pCurveFile) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--curve-file=");

    if (pCurveFile != null) {
      buf.append(pCurveFile.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --restore= (see documentation of the underlying tool for details).
  */

  public UFRawOps restore(String pType) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--restore=");

    if (pType != null) {
      buf.append(pType.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --clip= (see documentation of the underlying tool for details).
  */

  public UFRawOps clip(String pType) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--clip=");

    if (pType != null) {
      buf.append(pType.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --gamma= (see documentation of the underlying tool for details).
  */

  public UFRawOps gamma(Double pGamma) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--gamma=");

    if (pGamma != null) {
      buf.append(pGamma.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --linearity= (see documentation of the underlying tool for details).
  */

  public UFRawOps linearity(Double pLinearity) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--linearity=");

    if (pLinearity != null) {
      buf.append(pLinearity.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --contrast= (see documentation of the underlying tool for details).
  */

  public UFRawOps contrast(Double pContrast) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--contrast=");

    if (pContrast != null) {
      buf.append(pContrast.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --saturation= (see documentation of the underlying tool for details).
  */

  public UFRawOps saturation(Double pSaturation) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--saturation=");

    if (pSaturation != null) {
      buf.append(pSaturation.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --wavelet-denoising-threshold= (see documentation of the underlying tool for details).
  */

  public UFRawOps waveletDenoisingThreshold(Double pThreshold) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--wavelet-denoising-threshold=");

    if (pThreshold != null) {
      buf.append(pThreshold.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --exposure= (see documentation of the underlying tool for details).
  */

  public UFRawOps exposure(String pAuto) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--exposure=");

    if (pAuto != null) {
      buf.append(pAuto.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --exposure= (see documentation of the underlying tool for details).
  */

  public UFRawOps exposure(Double pExposure) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--exposure=");

    if (pExposure != null) {
      buf.append(pExposure.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --black-point= (see documentation of the underlying tool for details).
  */

  public UFRawOps blackPoint(String pAuto) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--black-point=");

    if (pAuto != null) {
      buf.append(pAuto.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --black-point= (see documentation of the underlying tool for details).
  */

  public UFRawOps blackPoint(Double pBlack) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--black-point=");

    if (pBlack != null) {
      buf.append(pBlack.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --interpolation= (see documentation of the underlying tool for details).
  */

  public UFRawOps interpolation(String pType) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--interpolation=");

    if (pType != null) {
      buf.append(pType.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --grayscale= (see documentation of the underlying tool for details).
  */

  public UFRawOps grayscale(String pType) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--grayscale=");

    if (pType != null) {
      buf.append(pType.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --shrink= (see documentation of the underlying tool for details).
  */

  public UFRawOps shrink(Double pFactor) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--shrink=");

    if (pFactor != null) {
      buf.append(pFactor.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --size= (see documentation of the underlying tool for details).
  */

  public UFRawOps size(Integer pSize) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--size=");

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
     --out-type= (see documentation of the underlying tool for details).
  */

  public UFRawOps outType(String pType) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--out-type=");

    if (pType != null) {
      buf.append(pType.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --out-depth= (see documentation of the underlying tool for details).
  */

  public UFRawOps outDepth(Integer pDepth) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--out-depth=");

    if (pDepth != null) {
      buf.append(pDepth.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --create-id= (see documentation of the underlying tool for details).
  */

  public UFRawOps createId(String pType) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--create-id=");

    if (pType != null) {
      buf.append(pType.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --compression= (see documentation of the underlying tool for details).
  */

  public UFRawOps compression(Integer Value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--compression=");

    if (Value != null) {
      buf.append(Value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --exif (see documentation of the underlying tool for details).
  */

  public UFRawOps exif() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("--exif");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --noexif (see documentation of the underlying tool for details).
  */

  public UFRawOps noexif() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("--noexif");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --zip (see documentation of the underlying tool for details).
  */

  public UFRawOps zip() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("--zip");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --nozip (see documentation of the underlying tool for details).
  */

  public UFRawOps nozip() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("--nozip");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --embedded-image (see documentation of the underlying tool for details).
  */

  public UFRawOps embeddedImage() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("--embedded-image");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --rotate= (see documentation of the underlying tool for details).
  */

  public UFRawOps rotate(String pType) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--rotate=");

    if (pType != null) {
      buf.append(pType.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --crop-left= (see documentation of the underlying tool for details).
  */

  public UFRawOps cropLeft(Integer pCount) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--crop-left=");

    if (pCount != null) {
      buf.append(pCount.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --crop-right= (see documentation of the underlying tool for details).
  */

  public UFRawOps cropRight(Integer pCount) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--crop-right=");

    if (pCount != null) {
      buf.append(pCount.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --crop-top= (see documentation of the underlying tool for details).
  */

  public UFRawOps cropTop(Integer pCount) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--crop-top=");

    if (pCount != null) {
      buf.append(pCount.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --crop-bottom= (see documentation of the underlying tool for details).
  */

  public UFRawOps cropBottom(Integer pCount) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--crop-bottom=");

    if (pCount != null) {
      buf.append(pCount.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --out-path= (see documentation of the underlying tool for details).
  */

  public UFRawOps outPath(String pPath) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--out-path=");

    if (pPath != null) {
      buf.append(pPath.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --output= (see documentation of the underlying tool for details).
  */

  public UFRawOps output(String pFilename) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--output=");

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
     --darkframe= (see documentation of the underlying tool for details).
  */

  public UFRawOps darkframe(String pFilename) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("--darkframe=");

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
     --overwrite (see documentation of the underlying tool for details).
  */

  public UFRawOps overwrite() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("--overwrite");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     --silent (see documentation of the underlying tool for details).
  */

  public UFRawOps silent() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("--silent");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }


}
