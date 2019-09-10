/**************************************************************************
/* This class adds all the GM methods to an Operation.
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
   This class adds all the GM methods to an Operation.

   @version $Revision: 1.12 $
   @author  $Author: bablokb $
*/

public class GMOps extends Operation {

  //////////////////////////////////////////////////////////////////////////////

  /**
     Constructor.
  */

  protected GMOps() {
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -adjoin (see documentation of the underlying tool for details).
  */

  public GMOps adjoin() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-adjoin");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +adjoin (see documentation of the underlying tool for details).
  */

  public GMOps p_adjoin() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+adjoin");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -affine (see documentation of the underlying tool for details).
  */

  public GMOps affine() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-affine");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -affine (see documentation of the underlying tool for details).
  */

  public GMOps affine(Double sx) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-affine");

    if (sx != null) {
      buf.append(sx.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -affine (see documentation of the underlying tool for details).
  */

  public GMOps affine(Double sx, Double rx) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-affine");

    if (sx != null) {
      buf.append(sx.toString());
    }
    buf.append(",");
    if (rx != null) {
      buf.append(rx.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -affine (see documentation of the underlying tool for details).
  */

  public GMOps affine(Double sx, Double rx, Double ry) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-affine");

    if (sx != null) {
      buf.append(sx.toString());
    }
    buf.append(",");
    if (rx != null) {
      buf.append(rx.toString());
    }
    buf.append(",");
    if (ry != null) {
      buf.append(ry.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -affine (see documentation of the underlying tool for details).
  */

  public GMOps affine(Double sx, Double rx, Double ry, Double sy) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-affine");

    if (sx != null) {
      buf.append(sx.toString());
    }
    buf.append(",");
    if (rx != null) {
      buf.append(rx.toString());
    }
    buf.append(",");
    if (ry != null) {
      buf.append(ry.toString());
    }
    buf.append(",");
    if (sy != null) {
      buf.append(sy.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -affine (see documentation of the underlying tool for details).
  */

  public GMOps affine(Double sx, Double rx, Double ry, Double sy, Double tx) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-affine");

    if (sx != null) {
      buf.append(sx.toString());
    }
    buf.append(",");
    if (rx != null) {
      buf.append(rx.toString());
    }
    buf.append(",");
    if (ry != null) {
      buf.append(ry.toString());
    }
    buf.append(",");
    if (sy != null) {
      buf.append(sy.toString());
    }
    buf.append(",");
    if (tx != null) {
      buf.append(tx.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -affine (see documentation of the underlying tool for details).
  */

  public GMOps affine(Double sx, Double rx, Double ry, Double sy, Double tx, Double ty) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-affine");

    if (sx != null) {
      buf.append(sx.toString());
    }
    buf.append(",");
    if (rx != null) {
      buf.append(rx.toString());
    }
    buf.append(",");
    if (ry != null) {
      buf.append(ry.toString());
    }
    buf.append(",");
    if (sy != null) {
      buf.append(sy.toString());
    }
    buf.append(",");
    if (tx != null) {
      buf.append(tx.toString());
    }
    buf.append(",");
    if (ty != null) {
      buf.append(ty.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -antialias (see documentation of the underlying tool for details).
  */

  public GMOps antialias() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-antialias");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +antialias (see documentation of the underlying tool for details).
  */

  public GMOps p_antialias() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+antialias");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -append (see documentation of the underlying tool for details).
  */

  public GMOps append() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-append");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +append (see documentation of the underlying tool for details).
  */

  public GMOps p_append() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+append");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -authenticate (see documentation of the underlying tool for details).
  */

  public GMOps authenticate() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-authenticate");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -authenticate (see documentation of the underlying tool for details).
  */

  public GMOps authenticate(String password) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-authenticate");

    if (password != null) {
      buf.append(password.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -average (see documentation of the underlying tool for details).
  */

  public GMOps average() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-average");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -backdrop (see documentation of the underlying tool for details).
  */

  public GMOps backdrop() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-backdrop");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -background (see documentation of the underlying tool for details).
  */

  public GMOps background() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-background");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -background (see documentation of the underlying tool for details).
  */

  public GMOps background(String color) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-background");

    if (color != null) {
      buf.append(color.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -blue-primary (see documentation of the underlying tool for details).
  */

  public GMOps bluePrimary() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-blue-primary");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -blue-primary (see documentation of the underlying tool for details).
  */

  public GMOps bluePrimary(Double x) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-blue-primary");

    if (x != null) {
      buf.append(x.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -blue-primary (see documentation of the underlying tool for details).
  */

  public GMOps bluePrimary(Double x, Double y) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-blue-primary");

    if (x != null) {
      buf.append(x.toString());
    }
    buf.append(",");
    if (y != null) {
      buf.append(y.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -blur (see documentation of the underlying tool for details).
  */

  public GMOps blur() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-blur");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -blur (see documentation of the underlying tool for details).
  */

  public GMOps blur(Double radius) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-blur");

    if (radius != null) {
      buf.append(radius.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -blur (see documentation of the underlying tool for details).
  */

  public GMOps blur(Double radius, Double sigma) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-blur");

    if (radius != null) {
      buf.append(radius.toString());
    }
    buf.append("x");
    if (sigma != null) {
      buf.append(sigma.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -bordercolor (see documentation of the underlying tool for details).
  */

  public GMOps bordercolor() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-bordercolor");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -bordercolor (see documentation of the underlying tool for details).
  */

  public GMOps bordercolor(String color) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-bordercolor");

    if (color != null) {
      buf.append(color.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -borderwidth (see documentation of the underlying tool for details).
  */

  public GMOps borderwidth() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-borderwidth");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -borderwidth (see documentation of the underlying tool for details).
  */

  public GMOps borderwidth(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-borderwidth");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -borderwidth (see documentation of the underlying tool for details).
  */

  public GMOps borderwidth(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-borderwidth");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -borderwidth (see documentation of the underlying tool for details).
  */

  public GMOps borderwidth(Integer width, Integer height, Integer x) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-borderwidth");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -borderwidth (see documentation of the underlying tool for details).
  */

  public GMOps borderwidth(Integer width, Integer height, Integer x, Integer y) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-borderwidth");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -borderwidth (see documentation of the underlying tool for details).
  */

  public GMOps borderwidth(Integer width, Integer height, Integer x, Integer y, Boolean percent) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-borderwidth");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
    }
    if (percent != null) {
      if (percent.booleanValue())
        buf.append("%");
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +borderwidth (see documentation of the underlying tool for details).
  */

  public GMOps p_borderwidth() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+borderwidth");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -border (see documentation of the underlying tool for details).
  */

  public GMOps border(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-border");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -border (see documentation of the underlying tool for details).
  */

  public GMOps border(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-border");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -box (see documentation of the underlying tool for details).
  */

  public GMOps box() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-box");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -box (see documentation of the underlying tool for details).
  */

  public GMOps box(String pColor) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-box");

    if (pColor != null) {
      buf.append(pColor.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -channel (see documentation of the underlying tool for details).
  */

  public GMOps channel() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-channel");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -channel (see documentation of the underlying tool for details).
  */

  public GMOps channel(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-channel");

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
     -charcoal (see documentation of the underlying tool for details).
  */

  public GMOps charcoal() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-charcoal");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -charcoal (see documentation of the underlying tool for details).
  */

  public GMOps charcoal(Integer factor) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-charcoal");

    if (factor != null) {
      buf.append(factor.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -chop (see documentation of the underlying tool for details).
  */

  public GMOps chop() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-chop");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -chop (see documentation of the underlying tool for details).
  */

  public GMOps chop(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-chop");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -chop (see documentation of the underlying tool for details).
  */

  public GMOps chop(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-chop");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -chop (see documentation of the underlying tool for details).
  */

  public GMOps chop(Integer width, Integer height, Integer x) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-chop");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -chop (see documentation of the underlying tool for details).
  */

  public GMOps chop(Integer width, Integer height, Integer x, Integer y) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-chop");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -chop (see documentation of the underlying tool for details).
  */

  public GMOps chop(Integer width, Integer height, Integer x, Integer y, Boolean percent) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-chop");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
    }
    if (percent != null) {
      if (percent.booleanValue())
        buf.append("%");
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -clip (see documentation of the underlying tool for details).
  */

  public GMOps clip() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-clip");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -clippath (see documentation of the underlying tool for details).
  */

  public GMOps clippath() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-clippath");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -coalesce (see documentation of the underlying tool for details).
  */

  public GMOps coalesce() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-coalesce");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -colorize (see documentation of the underlying tool for details).
  */

  public GMOps colorize() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-colorize");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -colorize (see documentation of the underlying tool for details).
  */

  public GMOps colorize(Integer red) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-colorize");

    if (red != null) {
      buf.append(red.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -colorize (see documentation of the underlying tool for details).
  */

  public GMOps colorize(Integer red, Integer blue) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-colorize");

    if (red != null) {
      buf.append(red.toString());
    }
    buf.append("/");
    if (blue != null) {
      buf.append(blue.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -colorize (see documentation of the underlying tool for details).
  */

  public GMOps colorize(Integer red, Integer blue, Integer green) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-colorize");

    if (red != null) {
      buf.append(red.toString());
    }
    buf.append("/");
    if (blue != null) {
      buf.append(blue.toString());
    }
    buf.append("/");
    if (green != null) {
      buf.append(green.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -colors (see documentation of the underlying tool for details).
  */

  public GMOps colors() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-colors");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -colors (see documentation of the underlying tool for details).
  */

  public GMOps colors(Integer value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-colors");

    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -colorspace (see documentation of the underlying tool for details).
  */

  public GMOps colorspace() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-colorspace");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -colorspace (see documentation of the underlying tool for details).
  */

  public GMOps colorspace(String value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-colorspace");

    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -comment (see documentation of the underlying tool for details).
  */

  public GMOps comment() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-comment");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -comment (see documentation of the underlying tool for details).
  */

  public GMOps comment(String text) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-comment");

    if (text != null) {
      buf.append(text.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +compress (see documentation of the underlying tool for details).
  */

  public GMOps p_compress() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+compress");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -compress (see documentation of the underlying tool for details).
  */

  public GMOps compress() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-compress");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -compress (see documentation of the underlying tool for details).
  */

  public GMOps compress(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-compress");

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
     -contrast (see documentation of the underlying tool for details).
  */

  public GMOps contrast() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-contrast");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +contrast (see documentation of the underlying tool for details).
  */

  public GMOps p_contrast() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+contrast");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -crop (see documentation of the underlying tool for details).
  */

  public GMOps crop() {

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

  public GMOps crop(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-crop");

    if (width != null) {
      buf.append(width.toString());
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

  public GMOps crop(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-crop");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
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

  public GMOps crop(Integer width, Integer height, Integer x) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-crop");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
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

  public GMOps crop(Integer width, Integer height, Integer x, Integer y) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-crop");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
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

  public GMOps crop(Integer width, Integer height, Integer x, Integer y, Character special) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-crop");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
    }
    if (special != null) {
      buf.append(special.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -cycle (see documentation of the underlying tool for details).
  */

  public GMOps cycle() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-cycle");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -cycle (see documentation of the underlying tool for details).
  */

  public GMOps cycle(Integer amount) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-cycle");

    if (amount != null) {
      buf.append(amount.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +debug (see documentation of the underlying tool for details).
  */

  public GMOps p_debug() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+debug");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -debug (see documentation of the underlying tool for details).
  */

  public GMOps debug() {

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
     -debug (see documentation of the underlying tool for details).
  */

  public GMOps debug(String events) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-debug");

    if (events != null) {
      buf.append(events.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -deconstruct (see documentation of the underlying tool for details).
  */

  public GMOps deconstruct() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-deconstruct");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -define (see documentation of the underlying tool for details).
  */

  public GMOps define() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-define");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -define (see documentation of the underlying tool for details).
  */

  public GMOps define(String keyValue) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-define");

    if (keyValue != null) {
      buf.append(keyValue.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +define (see documentation of the underlying tool for details).
  */

  public GMOps p_define() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+define");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +define (see documentation of the underlying tool for details).
  */

  public GMOps p_define(String keyValue) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+define");

    if (keyValue != null) {
      buf.append(keyValue.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -delay (see documentation of the underlying tool for details).
  */

  public GMOps delay() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-delay");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -delay (see documentation of the underlying tool for details).
  */

  public GMOps delay(Integer ticks) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-delay");

    if (ticks != null) {
      buf.append(ticks.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -delay (see documentation of the underlying tool for details).
  */

  public GMOps delay(Integer ticks, Integer ticksPerSecond) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-delay");

    if (ticks != null) {
      buf.append(ticks.toString());
    }
    buf.append("x");
    if (ticksPerSecond != null) {
      buf.append(ticksPerSecond.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -delay (see documentation of the underlying tool for details).
  */

  public GMOps delay(Integer ticks, Integer ticksPerSecond, Character special) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-delay");

    if (ticks != null) {
      buf.append(ticks.toString());
    }
    buf.append("x");
    if (ticksPerSecond != null) {
      buf.append(ticksPerSecond.toString());
    }
    if (special != null) {
      buf.append(special.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -density (see documentation of the underlying tool for details).
  */

  public GMOps density() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-density");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -density (see documentation of the underlying tool for details).
  */

  public GMOps density(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-density");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -density (see documentation of the underlying tool for details).
  */

  public GMOps density(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-density");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -depth (see documentation of the underlying tool for details).
  */

  public GMOps depth() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-depth");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -depth (see documentation of the underlying tool for details).
  */

  public GMOps depth(Integer value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-depth");

    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -despeckle (see documentation of the underlying tool for details).
  */

  public GMOps despeckle() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-despeckle");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -display (see documentation of the underlying tool for details).
  */

  public GMOps display() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-display");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -display (see documentation of the underlying tool for details).
  */

  public GMOps display(String host) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-display");

    if (host != null) {
      buf.append(host.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -display (see documentation of the underlying tool for details).
  */

  public GMOps display(String host, Integer display) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-display");

    if (host != null) {
      buf.append(host.toString());
    }
    buf.append(":");
    if (display != null) {
      buf.append(display.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -display (see documentation of the underlying tool for details).
  */

  public GMOps display(String host, Integer display, Integer screen) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-display");

    if (host != null) {
      buf.append(host.toString());
    }
    buf.append(":");
    if (display != null) {
      buf.append(display.toString());
    }
    buf.append(".");
    if (screen != null) {
      buf.append(screen.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -dispose (see documentation of the underlying tool for details).
  */

  public GMOps dispose() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-dispose");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -dispose (see documentation of the underlying tool for details).
  */

  public GMOps dispose(String method) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-dispose");

    if (method != null) {
      buf.append(method.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +dither (see documentation of the underlying tool for details).
  */

  public GMOps p_dither() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+dither");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -dither (see documentation of the underlying tool for details).
  */

  public GMOps dither() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-dither");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -dither (see documentation of the underlying tool for details).
  */

  public GMOps dither(String method) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-dither");

    if (method != null) {
      buf.append(method.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -draw (see documentation of the underlying tool for details).
  */

  public GMOps draw() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-draw");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -draw (see documentation of the underlying tool for details).
  */

  public GMOps draw(String string) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-draw");

    if (string != null) {
      buf.append(string.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -edge (see documentation of the underlying tool for details).
  */

  public GMOps edge() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-edge");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -edge (see documentation of the underlying tool for details).
  */

  public GMOps edge(Double radius) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-edge");

    if (radius != null) {
      buf.append(radius.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -emboss (see documentation of the underlying tool for details).
  */

  public GMOps emboss() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-emboss");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -emboss (see documentation of the underlying tool for details).
  */

  public GMOps emboss(Double radius) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-emboss");

    if (radius != null) {
      buf.append(radius.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -encoding (see documentation of the underlying tool for details).
  */

  public GMOps encoding() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-encoding");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -encoding (see documentation of the underlying tool for details).
  */

  public GMOps encoding(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-encoding");

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
     +endian (see documentation of the underlying tool for details).
  */

  public GMOps p_endian() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+endian");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -endian (see documentation of the underlying tool for details).
  */

  public GMOps endian() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-endian");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -endian (see documentation of the underlying tool for details).
  */

  public GMOps endian(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-endian");

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
     -enhance (see documentation of the underlying tool for details).
  */

  public GMOps enhance() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-enhance");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -equalize (see documentation of the underlying tool for details).
  */

  public GMOps equalize() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-equalize");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -fill (see documentation of the underlying tool for details).
  */

  public GMOps fill() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-fill");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -fill (see documentation of the underlying tool for details).
  */

  public GMOps fill(String color) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-fill");

    if (color != null) {
      buf.append(color.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -filter (see documentation of the underlying tool for details).
  */

  public GMOps filter() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-filter");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -filter (see documentation of the underlying tool for details).
  */

  public GMOps filter(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-filter");

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
     -flatten (see documentation of the underlying tool for details).
  */

  public GMOps flatten() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-flatten");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -flip (see documentation of the underlying tool for details).
  */

  public GMOps flip() {

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
     -flop (see documentation of the underlying tool for details).
  */

  public GMOps flop() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-flop");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -font (see documentation of the underlying tool for details).
  */

  public GMOps font() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-font");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -font (see documentation of the underlying tool for details).
  */

  public GMOps font(String name) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-font");

    if (name != null) {
      buf.append(name.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -frame (see documentation of the underlying tool for details).
  */

  public GMOps frame() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-frame");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -frame (see documentation of the underlying tool for details).
  */

  public GMOps frame(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-frame");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -frame (see documentation of the underlying tool for details).
  */

  public GMOps frame(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-frame");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -frame (see documentation of the underlying tool for details).
  */

  public GMOps frame(Integer width, Integer height, Integer outerBevelWidth) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-frame");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (outerBevelWidth.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (outerBevelWidth != null) {
      buf.append(outerBevelWidth.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -frame (see documentation of the underlying tool for details).
  */

  public GMOps frame(Integer width, Integer height, Integer outerBevelWidth, Integer innerBevelWidth) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-frame");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (outerBevelWidth.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (outerBevelWidth != null) {
      buf.append(outerBevelWidth.toString());
    }
    oper="+";
    if (innerBevelWidth.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (innerBevelWidth != null) {
      buf.append(innerBevelWidth.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +frame (see documentation of the underlying tool for details).
  */

  public GMOps p_frame() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+frame");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -fuzz (see documentation of the underlying tool for details).
  */

  public GMOps fuzz() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-fuzz");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -fuzz (see documentation of the underlying tool for details).
  */

  public GMOps fuzz(Double distance) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-fuzz");

    if (distance != null) {
      buf.append(distance.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -fuzz (see documentation of the underlying tool for details).
  */

  public GMOps fuzz(Double distance, Boolean percent) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-fuzz");

    if (distance != null) {
      buf.append(distance.toString());
    }
    if (percent != null) {
      if (percent.booleanValue())
        buf.append("%");
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -gamma (see documentation of the underlying tool for details).
  */

  public GMOps gamma() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-gamma");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -gamma (see documentation of the underlying tool for details).
  */

  public GMOps gamma(Double value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-gamma");

    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +gamma (see documentation of the underlying tool for details).
  */

  public GMOps p_gamma() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+gamma");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +gamma (see documentation of the underlying tool for details).
  */

  public GMOps p_gamma(Double value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+gamma");

    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -gaussian (see documentation of the underlying tool for details).
  */

  public GMOps gaussian() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-gaussian");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -gaussian (see documentation of the underlying tool for details).
  */

  public GMOps gaussian(Double radius) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-gaussian");

    if (radius != null) {
      buf.append(radius.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -gaussian (see documentation of the underlying tool for details).
  */

  public GMOps gaussian(Double radius, Double sigma) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-gaussian");

    if (radius != null) {
      buf.append(radius.toString());
    }
    buf.append("x");
    if (sigma != null) {
      buf.append(sigma.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -geometry (see documentation of the underlying tool for details).
  */

  public GMOps geometry() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-geometry");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -geometry (see documentation of the underlying tool for details).
  */

  public GMOps geometry(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-geometry");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -geometry (see documentation of the underlying tool for details).
  */

  public GMOps geometry(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-geometry");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -geometry (see documentation of the underlying tool for details).
  */

  public GMOps geometry(Integer width, Integer height, Integer x) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-geometry");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -geometry (see documentation of the underlying tool for details).
  */

  public GMOps geometry(Integer width, Integer height, Integer x, Integer y) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-geometry");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -gravity (see documentation of the underlying tool for details).
  */

  public GMOps gravity() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-gravity");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -gravity (see documentation of the underlying tool for details).
  */

  public GMOps gravity(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-gravity");

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
     -green-primary (see documentation of the underlying tool for details).
  */

  public GMOps greenPrimary() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-green-primary");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -green-primary (see documentation of the underlying tool for details).
  */

  public GMOps greenPrimary(Double x) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-green-primary");

    if (x != null) {
      buf.append(x.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -green-primary (see documentation of the underlying tool for details).
  */

  public GMOps greenPrimary(Double x, Double y) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-green-primary");

    if (x != null) {
      buf.append(x.toString());
    }
    buf.append(",");
    if (y != null) {
      buf.append(y.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -help (see documentation of the underlying tool for details).
  */

  public GMOps help() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-help");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -implode (see documentation of the underlying tool for details).
  */

  public GMOps implode() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-implode");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -implode (see documentation of the underlying tool for details).
  */

  public GMOps implode(Double factor) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-implode");

    if (factor != null) {
      buf.append(factor.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -intent (see documentation of the underlying tool for details).
  */

  public GMOps intent() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-intent");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -intent (see documentation of the underlying tool for details).
  */

  public GMOps intent(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-intent");

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
     -interlace (see documentation of the underlying tool for details).
  */

  public GMOps interlace() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-interlace");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -interlace (see documentation of the underlying tool for details).
  */

  public GMOps interlace(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-interlace");

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
     +label (see documentation of the underlying tool for details).
  */

  public GMOps p_label() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+label");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -label (see documentation of the underlying tool for details).
  */

  public GMOps label() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-label");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -label (see documentation of the underlying tool for details).
  */

  public GMOps label(String name) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-label");

    if (name != null) {
      buf.append(name.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -lat (see documentation of the underlying tool for details).
  */

  public GMOps lat() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-lat");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -lat (see documentation of the underlying tool for details).
  */

  public GMOps lat(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-lat");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -lat (see documentation of the underlying tool for details).
  */

  public GMOps lat(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-lat");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -lat (see documentation of the underlying tool for details).
  */

  public GMOps lat(Integer width, Integer height, Integer offset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-lat");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (offset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (offset != null) {
      buf.append(offset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -lat (see documentation of the underlying tool for details).
  */

  public GMOps lat(Integer width, Integer height, Integer offset, Boolean percent) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-lat");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (offset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (offset != null) {
      buf.append(offset.toString());
    }
    if (percent != null) {
      if (percent.booleanValue())
        buf.append("%");
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -level (see documentation of the underlying tool for details).
  */

  public GMOps level() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-level");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -level (see documentation of the underlying tool for details).
  */

  public GMOps level(Double black_point) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-level");

    if (black_point != null) {
      buf.append(black_point.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -level (see documentation of the underlying tool for details).
  */

  public GMOps level(Double black_point, Double white_point) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-level");

    if (black_point != null) {
      buf.append(black_point.toString());
    }
    buf.append(",");
    if (white_point != null) {
      buf.append(white_point.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -level (see documentation of the underlying tool for details).
  */

  public GMOps level(Double black_point, Double white_point, Boolean percent) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-level");

    if (black_point != null) {
      buf.append(black_point.toString());
    }
    buf.append(",");
    if (white_point != null) {
      buf.append(white_point.toString());
    }
    if (percent != null) {
      if (percent.booleanValue())
        buf.append("%");
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -level (see documentation of the underlying tool for details).
  */

  public GMOps level(Double black_point, Double white_point, Boolean percent, Double gamma) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-level");

    if (black_point != null) {
      buf.append(black_point.toString());
    }
    buf.append(",");
    if (white_point != null) {
      buf.append(white_point.toString());
    }
    if (percent != null) {
      if (percent.booleanValue())
        buf.append("%");
    }
    buf.append(",");
    if (gamma != null) {
      buf.append(gamma.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -limit (see documentation of the underlying tool for details).
  */

  public GMOps limit() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-limit");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -limit (see documentation of the underlying tool for details).
  */

  public GMOps limit(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-limit");

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
     -list (see documentation of the underlying tool for details).
  */

  public GMOps list() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-list");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -list (see documentation of the underlying tool for details).
  */

  public GMOps list(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-list");

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
     -log (see documentation of the underlying tool for details).
  */

  public GMOps log() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-log");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -log (see documentation of the underlying tool for details).
  */

  public GMOps log(String text) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-log");

    if (text != null) {
      buf.append(text.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -loop (see documentation of the underlying tool for details).
  */

  public GMOps loop() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-loop");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -loop (see documentation of the underlying tool for details).
  */

  public GMOps loop(Integer iterations) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-loop");

    if (iterations != null) {
      buf.append(iterations.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +map (see documentation of the underlying tool for details).
  */

  public GMOps p_map() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+map");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -map (see documentation of the underlying tool for details).
  */

  public GMOps map() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-map");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -map (see documentation of the underlying tool for details).
  */

  public GMOps map(String filename) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-map");

    if (filename != null) {
      buf.append(filename.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +mask (see documentation of the underlying tool for details).
  */

  public GMOps p_mask() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+mask");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -mask (see documentation of the underlying tool for details).
  */

  public GMOps mask() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-mask");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -mask (see documentation of the underlying tool for details).
  */

  public GMOps mask(String filename) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-mask");

    if (filename != null) {
      buf.append(filename.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -matte (see documentation of the underlying tool for details).
  */

  public GMOps matte() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-matte");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +matte (see documentation of the underlying tool for details).
  */

  public GMOps p_matte() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+matte");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -median (see documentation of the underlying tool for details).
  */

  public GMOps median() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-median");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -median (see documentation of the underlying tool for details).
  */

  public GMOps median(Double radius) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-median");

    if (radius != null) {
      buf.append(radius.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -modulate (see documentation of the underlying tool for details).
  */

  public GMOps modulate() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-modulate");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -modulate (see documentation of the underlying tool for details).
  */

  public GMOps modulate(Double brightness) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-modulate");

    if (brightness != null) {
      buf.append(brightness.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -modulate (see documentation of the underlying tool for details).
  */

  public GMOps modulate(Double brightness, Double saturation) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-modulate");

    if (brightness != null) {
      buf.append(brightness.toString());
    }
    buf.append(",");
    if (saturation != null) {
      buf.append(saturation.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -modulate (see documentation of the underlying tool for details).
  */

  public GMOps modulate(Double brightness, Double saturation, Double hue) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-modulate");

    if (brightness != null) {
      buf.append(brightness.toString());
    }
    buf.append(",");
    if (saturation != null) {
      buf.append(saturation.toString());
    }
    buf.append(",");
    if (hue != null) {
      buf.append(hue.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -monitor (see documentation of the underlying tool for details).
  */

  public GMOps monitor() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-monitor");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -monochrome (see documentation of the underlying tool for details).
  */

  public GMOps monochrome() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-monochrome");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -morph (see documentation of the underlying tool for details).
  */

  public GMOps morph() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-morph");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -morph (see documentation of the underlying tool for details).
  */

  public GMOps morph(Integer frames) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-morph");

    if (frames != null) {
      buf.append(frames.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -mosaic (see documentation of the underlying tool for details).
  */

  public GMOps mosaic() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-mosaic");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -negate (see documentation of the underlying tool for details).
  */

  public GMOps negate() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-negate");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +negate (see documentation of the underlying tool for details).
  */

  public GMOps p_negate() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+negate");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -noise (see documentation of the underlying tool for details).
  */

  public GMOps noise() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-noise");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -noise (see documentation of the underlying tool for details).
  */

  public GMOps noise(Double radius) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-noise");

    if (radius != null) {
      buf.append(radius.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +noise (see documentation of the underlying tool for details).
  */

  public GMOps p_noise() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+noise");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +noise (see documentation of the underlying tool for details).
  */

  public GMOps p_noise(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+noise");

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
     -noop (see documentation of the underlying tool for details).
  */

  public GMOps noop() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-noop");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -normalize (see documentation of the underlying tool for details).
  */

  public GMOps normalize() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-normalize");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -opaque (see documentation of the underlying tool for details).
  */

  public GMOps opaque() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-opaque");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -opaque (see documentation of the underlying tool for details).
  */

  public GMOps opaque(String color) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-opaque");

    if (color != null) {
      buf.append(color.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -operator (see documentation of the underlying tool for details).
  */

  public GMOps operator() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-operator");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -operator (see documentation of the underlying tool for details).
  */

  public GMOps operator(String channel) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-operator");

    if (channel != null) {
      buf.append(channel.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -operator (see documentation of the underlying tool for details).
  */

  public GMOps operator(String channel, String operator) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-operator");

    if (channel != null) {
      buf.append(channel.toString());
    }
    iCmdArgs.add(buf.toString());
    buf.setLength(0);
    if (operator != null) {
      buf.append(operator.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -operator (see documentation of the underlying tool for details).
  */

  public GMOps operator(String channel, String operator, Double rvalue) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-operator");

    if (channel != null) {
      buf.append(channel.toString());
    }
    iCmdArgs.add(buf.toString());
    buf.setLength(0);
    if (operator != null) {
      buf.append(operator.toString());
    }
    iCmdArgs.add(buf.toString());
    buf.setLength(0);
    if (rvalue != null) {
      buf.append(rvalue.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -operator (see documentation of the underlying tool for details).
  */

  public GMOps operator(String channel, String operator, Double rvalue, Boolean percent) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-operator");

    if (channel != null) {
      buf.append(channel.toString());
    }
    iCmdArgs.add(buf.toString());
    buf.setLength(0);
    if (operator != null) {
      buf.append(operator.toString());
    }
    iCmdArgs.add(buf.toString());
    buf.setLength(0);
    if (rvalue != null) {
      buf.append(rvalue.toString());
    }
    if (percent != null) {
      if (percent.booleanValue())
        buf.append("%");
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -ordered-dither (see documentation of the underlying tool for details).
  */

  public GMOps orderedDither() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-ordered-dither");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -ordered-dither (see documentation of the underlying tool for details).
  */

  public GMOps orderedDither(String channelType) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-ordered-dither");

    if (channelType != null) {
      buf.append(channelType.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -ordered-dither (see documentation of the underlying tool for details).
  */

  public GMOps orderedDither(String channelType, Integer N) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-ordered-dither");

    if (channelType != null) {
      buf.append(channelType.toString());
    }
    iCmdArgs.add(buf.toString());
    buf.setLength(0);
    if (N != null) {
      buf.append(N.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -output-directory (see documentation of the underlying tool for details).
  */

  public GMOps outputDirectory() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-output-directory");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -output-directory (see documentation of the underlying tool for details).
  */

  public GMOps outputDirectory(String pDirectory) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-output-directory");

    if (pDirectory != null) {
      buf.append(pDirectory.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +page (see documentation of the underlying tool for details).
  */

  public GMOps p_page() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+page");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -page (see documentation of the underlying tool for details).
  */

  public GMOps page() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-page");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -page (see documentation of the underlying tool for details).
  */

  public GMOps page(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-page");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -page (see documentation of the underlying tool for details).
  */

  public GMOps page(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-page");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -page (see documentation of the underlying tool for details).
  */

  public GMOps page(Integer width, Integer height, Integer x) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-page");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -page (see documentation of the underlying tool for details).
  */

  public GMOps page(Integer width, Integer height, Integer x, Integer y) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-page");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -page (see documentation of the underlying tool for details).
  */

  public GMOps page(Integer width, Integer height, Integer x, Integer y, Character special) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-page");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
    }
    if (special != null) {
      buf.append(special.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -paint (see documentation of the underlying tool for details).
  */

  public GMOps paint() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-paint");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -paint (see documentation of the underlying tool for details).
  */

  public GMOps paint(Double radius) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-paint");

    if (radius != null) {
      buf.append(radius.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -pause (see documentation of the underlying tool for details).
  */

  public GMOps pause() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-pause");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -pause (see documentation of the underlying tool for details).
  */

  public GMOps pause(Integer pSeconds) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-pause");

    if (pSeconds != null) {
      buf.append(pSeconds.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -pen (see documentation of the underlying tool for details).
  */

  public GMOps pen() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-pen");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -pen (see documentation of the underlying tool for details).
  */

  public GMOps pen(String pColor) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-pen");

    if (pColor != null) {
      buf.append(pColor.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -ping (see documentation of the underlying tool for details).
  */

  public GMOps ping() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-ping");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +ping (see documentation of the underlying tool for details).
  */

  public GMOps p_ping() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+ping");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -pointsize (see documentation of the underlying tool for details).
  */

  public GMOps pointsize() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-pointsize");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -pointsize (see documentation of the underlying tool for details).
  */

  public GMOps pointsize(Integer value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-pointsize");

    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -preview (see documentation of the underlying tool for details).
  */

  public GMOps preview() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-preview");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -preview (see documentation of the underlying tool for details).
  */

  public GMOps preview(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-preview");

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
     -process (see documentation of the underlying tool for details).
  */

  public GMOps process() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-process");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -process (see documentation of the underlying tool for details).
  */

  public GMOps process(String pCommand) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-process");

    if (pCommand != null) {
      buf.append(pCommand.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -profile (see documentation of the underlying tool for details).
  */

  public GMOps profile() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-profile");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -profile (see documentation of the underlying tool for details).
  */

  public GMOps profile(String filename) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-profile");

    if (filename != null) {
      buf.append(filename.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +profile (see documentation of the underlying tool for details).
  */

  public GMOps p_profile() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+profile");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +profile (see documentation of the underlying tool for details).
  */

  public GMOps p_profile(String profileName) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+profile");

    if (profileName != null) {
      buf.append(profileName.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +progress (see documentation of the underlying tool for details).
  */

  public GMOps p_progress() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+progress");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -quality (see documentation of the underlying tool for details).
  */

  public GMOps quality() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-quality");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -quality (see documentation of the underlying tool for details).
  */

  public GMOps quality(Double value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-quality");

    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -raise (see documentation of the underlying tool for details).
  */

  public GMOps raise() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-raise");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -raise (see documentation of the underlying tool for details).
  */

  public GMOps raise(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-raise");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -raise (see documentation of the underlying tool for details).
  */

  public GMOps raise(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-raise");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +raise (see documentation of the underlying tool for details).
  */

  public GMOps p_raise() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+raise");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +raise (see documentation of the underlying tool for details).
  */

  public GMOps p_raise(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+raise");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +raise (see documentation of the underlying tool for details).
  */

  public GMOps p_raise(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+raise");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -random-threshold (see documentation of the underlying tool for details).
  */

  public GMOps randomThreshold() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-random-threshold");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -random-threshold (see documentation of the underlying tool for details).
  */

  public GMOps randomThreshold(String channelType) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-random-threshold");

    if (channelType != null) {
      buf.append(channelType.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -random-threshold (see documentation of the underlying tool for details).
  */

  public GMOps randomThreshold(String channelType, Double low) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-random-threshold");

    if (channelType != null) {
      buf.append(channelType.toString());
    }
    iCmdArgs.add(buf.toString());
    buf.setLength(0);
    if (low != null) {
      buf.append(low.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -random-threshold (see documentation of the underlying tool for details).
  */

  public GMOps randomThreshold(String channelType, Double low, Double high) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-random-threshold");

    if (channelType != null) {
      buf.append(channelType.toString());
    }
    iCmdArgs.add(buf.toString());
    buf.setLength(0);
    if (low != null) {
      buf.append(low.toString());
    }
    buf.append("x");
    if (high != null) {
      buf.append(high.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -red-primary (see documentation of the underlying tool for details).
  */

  public GMOps redPrimary() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-red-primary");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -red-primary (see documentation of the underlying tool for details).
  */

  public GMOps redPrimary(Double x) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-red-primary");

    if (x != null) {
      buf.append(x.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -red-primary (see documentation of the underlying tool for details).
  */

  public GMOps redPrimary(Double x, Double y) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-red-primary");

    if (x != null) {
      buf.append(x.toString());
    }
    buf.append(",");
    if (y != null) {
      buf.append(y.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -region (see documentation of the underlying tool for details).
  */

  public GMOps region() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-region");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -region (see documentation of the underlying tool for details).
  */

  public GMOps region(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-region");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -region (see documentation of the underlying tool for details).
  */

  public GMOps region(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-region");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -region (see documentation of the underlying tool for details).
  */

  public GMOps region(Integer width, Integer height, Integer x) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-region");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -region (see documentation of the underlying tool for details).
  */

  public GMOps region(Integer width, Integer height, Integer x, Integer y) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-region");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +remap (see documentation of the underlying tool for details).
  */

  public GMOps p_remap() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+remap");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -render (see documentation of the underlying tool for details).
  */

  public GMOps render() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-render");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +render (see documentation of the underlying tool for details).
  */

  public GMOps p_render() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+render");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -resample (see documentation of the underlying tool for details).
  */

  public GMOps resample() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-resample");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -resample (see documentation of the underlying tool for details).
  */

  public GMOps resample(Integer horizontal) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-resample");

    if (horizontal != null) {
      buf.append(horizontal.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -resample (see documentation of the underlying tool for details).
  */

  public GMOps resample(Integer horizontal, Integer vertical) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-resample");

    if (horizontal != null) {
      buf.append(horizontal.toString());
    }
    buf.append("x");
    if (vertical != null) {
      buf.append(vertical.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -resize (see documentation of the underlying tool for details).
  */

  public GMOps resize() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-resize");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -resize (see documentation of the underlying tool for details).
  */

  public GMOps resize(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-resize");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -resize (see documentation of the underlying tool for details).
  */

  public GMOps resize(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-resize");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -resize (see documentation of the underlying tool for details).
  */

  public GMOps resize(Integer width, Integer height, Character special) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-resize");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (special != null) {
      buf.append(special.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -roll (see documentation of the underlying tool for details).
  */

  public GMOps roll() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-roll");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -roll (see documentation of the underlying tool for details).
  */

  public GMOps roll(Integer x) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-roll");

    if (x != null) {
      buf.append(x.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -roll (see documentation of the underlying tool for details).
  */

  public GMOps roll(Integer x, Integer y) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-roll");

    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -rotate (see documentation of the underlying tool for details).
  */

  public GMOps rotate() {

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

  public GMOps rotate(Double degrees) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-rotate");

    if (degrees != null) {
      buf.append(degrees.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -rotate (see documentation of the underlying tool for details).
  */

  public GMOps rotate(Double degrees, Character special) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-rotate");

    if (degrees != null) {
      buf.append(degrees.toString());
    }
    if (special != null) {
      buf.append(special.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sample (see documentation of the underlying tool for details).
  */

  public GMOps sample() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sample");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sample (see documentation of the underlying tool for details).
  */

  public GMOps sample(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sample");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sample (see documentation of the underlying tool for details).
  */

  public GMOps sample(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sample");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sample (see documentation of the underlying tool for details).
  */

  public GMOps sample(Integer width, Integer height, Integer xOffset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sample");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (xOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (xOffset != null) {
      buf.append(xOffset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sample (see documentation of the underlying tool for details).
  */

  public GMOps sample(Integer width, Integer height, Integer xOffset, Integer yOffset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sample");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (xOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (xOffset != null) {
      buf.append(xOffset.toString());
    }
    oper="+";
    if (yOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (yOffset != null) {
      buf.append(yOffset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sampling-factor (see documentation of the underlying tool for details).
  */

  public GMOps samplingFactor() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sampling-factor");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sampling-factor (see documentation of the underlying tool for details).
  */

  public GMOps samplingFactor(Double horizontalFactor) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sampling-factor");

    if (horizontalFactor != null) {
      buf.append(horizontalFactor.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sampling-factor (see documentation of the underlying tool for details).
  */

  public GMOps samplingFactor(Double horizontalFactor, Double verticalFactor) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sampling-factor");

    if (horizontalFactor != null) {
      buf.append(horizontalFactor.toString());
    }
    buf.append("x");
    if (verticalFactor != null) {
      buf.append(verticalFactor.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -scale (see documentation of the underlying tool for details).
  */

  public GMOps scale() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-scale");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -scale (see documentation of the underlying tool for details).
  */

  public GMOps scale(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-scale");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -scale (see documentation of the underlying tool for details).
  */

  public GMOps scale(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-scale");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -scale (see documentation of the underlying tool for details).
  */

  public GMOps scale(Integer width, Integer height, Integer xOffset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-scale");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (xOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (xOffset != null) {
      buf.append(xOffset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -scale (see documentation of the underlying tool for details).
  */

  public GMOps scale(Integer width, Integer height, Integer xOffset, Integer yOffset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-scale");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (xOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (xOffset != null) {
      buf.append(xOffset.toString());
    }
    oper="+";
    if (yOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (yOffset != null) {
      buf.append(yOffset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -scene (see documentation of the underlying tool for details).
  */

  public GMOps scene() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-scene");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -scene (see documentation of the underlying tool for details).
  */

  public GMOps scene(Integer value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-scene");

    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -seed (see documentation of the underlying tool for details).
  */

  public GMOps seed() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-seed");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -segment (see documentation of the underlying tool for details).
  */

  public GMOps segment() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-segment");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -segment (see documentation of the underlying tool for details).
  */

  public GMOps segment(Integer clusterThreshold) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-segment");

    if (clusterThreshold != null) {
      buf.append(clusterThreshold.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -segment (see documentation of the underlying tool for details).
  */

  public GMOps segment(Integer clusterThreshold, Double smoothingThreshold) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-segment");

    if (clusterThreshold != null) {
      buf.append(clusterThreshold.toString());
    }
    buf.append("x");
    if (smoothingThreshold != null) {
      buf.append(smoothingThreshold.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -set (see documentation of the underlying tool for details).
  */

  public GMOps set() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-set");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -set (see documentation of the underlying tool for details).
  */

  public GMOps set(String attribute) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-set");

    if (attribute != null) {
      buf.append(attribute.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -set (see documentation of the underlying tool for details).
  */

  public GMOps set(String attribute, String value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-set");

    if (attribute != null) {
      buf.append(attribute.toString());
    }
    iCmdArgs.add(buf.toString());
    buf.setLength(0);
    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -shade (see documentation of the underlying tool for details).
  */

  public GMOps shade() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-shade");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -shade (see documentation of the underlying tool for details).
  */

  public GMOps shade(Double azimuth) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-shade");

    if (azimuth != null) {
      buf.append(azimuth.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -shade (see documentation of the underlying tool for details).
  */

  public GMOps shade(Double azimuth, Double elevation) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-shade");

    if (azimuth != null) {
      buf.append(azimuth.toString());
    }
    buf.append("x");
    if (elevation != null) {
      buf.append(elevation.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +shade (see documentation of the underlying tool for details).
  */

  public GMOps p_shade() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+shade");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +shade (see documentation of the underlying tool for details).
  */

  public GMOps p_shade(Double azimuth) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+shade");

    if (azimuth != null) {
      buf.append(azimuth.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +shade (see documentation of the underlying tool for details).
  */

  public GMOps p_shade(Double azimuth, Double elevation) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+shade");

    if (azimuth != null) {
      buf.append(azimuth.toString());
    }
    buf.append("x");
    if (elevation != null) {
      buf.append(elevation.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sharpen (see documentation of the underlying tool for details).
  */

  public GMOps sharpen() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sharpen");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sharpen (see documentation of the underlying tool for details).
  */

  public GMOps sharpen(Double radius) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sharpen");

    if (radius != null) {
      buf.append(radius.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sharpen (see documentation of the underlying tool for details).
  */

  public GMOps sharpen(Double radius, Double sigma) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sharpen");

    if (radius != null) {
      buf.append(radius.toString());
    }
    buf.append("x");
    if (sigma != null) {
      buf.append(sigma.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -shave (see documentation of the underlying tool for details).
  */

  public GMOps shave() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-shave");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -shave (see documentation of the underlying tool for details).
  */

  public GMOps shave(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-shave");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -shave (see documentation of the underlying tool for details).
  */

  public GMOps shave(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-shave");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -shave (see documentation of the underlying tool for details).
  */

  public GMOps shave(Integer width, Integer height, Boolean percent) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-shave");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (percent != null) {
      if (percent.booleanValue())
        buf.append("%");
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -shear (see documentation of the underlying tool for details).
  */

  public GMOps shear() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-shear");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -shear (see documentation of the underlying tool for details).
  */

  public GMOps shear(Double xDegrees) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-shear");

    if (xDegrees != null) {
      buf.append(xDegrees.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -shear (see documentation of the underlying tool for details).
  */

  public GMOps shear(Double xDegrees, Double yDegrees) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-shear");

    if (xDegrees != null) {
      buf.append(xDegrees.toString());
    }
    buf.append("x");
    if (yDegrees != null) {
      buf.append(yDegrees.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -size (see documentation of the underlying tool for details).
  */

  public GMOps size() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-size");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -size (see documentation of the underlying tool for details).
  */

  public GMOps size(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-size");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -size (see documentation of the underlying tool for details).
  */

  public GMOps size(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-size");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -size (see documentation of the underlying tool for details).
  */

  public GMOps size(Integer width, Integer height, Integer offset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-size");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (offset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (offset != null) {
      buf.append(offset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -solarize (see documentation of the underlying tool for details).
  */

  public GMOps solarize() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-solarize");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -solarize (see documentation of the underlying tool for details).
  */

  public GMOps solarize(Double threshold) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-solarize");

    if (threshold != null) {
      buf.append(threshold.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -spread (see documentation of the underlying tool for details).
  */

  public GMOps spread() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-spread");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -spread (see documentation of the underlying tool for details).
  */

  public GMOps spread(Integer amount) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-spread");

    if (amount != null) {
      buf.append(amount.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -stroke (see documentation of the underlying tool for details).
  */

  public GMOps stroke() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-stroke");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -stroke (see documentation of the underlying tool for details).
  */

  public GMOps stroke(String color) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-stroke");

    if (color != null) {
      buf.append(color.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -strokewidth (see documentation of the underlying tool for details).
  */

  public GMOps strokewidth() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-strokewidth");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -strokewidth (see documentation of the underlying tool for details).
  */

  public GMOps strokewidth(Integer value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-strokewidth");

    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -swirl (see documentation of the underlying tool for details).
  */

  public GMOps swirl() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-swirl");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -swirl (see documentation of the underlying tool for details).
  */

  public GMOps swirl(Double degrees) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-swirl");

    if (degrees != null) {
      buf.append(degrees.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -texture (see documentation of the underlying tool for details).
  */

  public GMOps texture() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-texture");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -texture (see documentation of the underlying tool for details).
  */

  public GMOps texture(String filename) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-texture");

    if (filename != null) {
      buf.append(filename.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -threshold (see documentation of the underlying tool for details).
  */

  public GMOps threshold() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-threshold");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -threshold (see documentation of the underlying tool for details).
  */

  public GMOps threshold(Integer value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-threshold");

    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -threshold (see documentation of the underlying tool for details).
  */

  public GMOps threshold(Integer value, Boolean percent) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-threshold");

    if (value != null) {
      buf.append(value.toString());
    }
    if (percent != null) {
      if (percent.booleanValue())
        buf.append("%");
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -tile (see documentation of the underlying tool for details).
  */

  public GMOps tile() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-tile");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -tile (see documentation of the underlying tool for details).
  */

  public GMOps tile(String filename) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-tile");

    if (filename != null) {
      buf.append(filename.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -transform (see documentation of the underlying tool for details).
  */

  public GMOps transform() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-transform");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -transparent (see documentation of the underlying tool for details).
  */

  public GMOps transparent() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-transparent");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -transparent (see documentation of the underlying tool for details).
  */

  public GMOps transparent(String color) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-transparent");

    if (color != null) {
      buf.append(color.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -treedepth (see documentation of the underlying tool for details).
  */

  public GMOps treedepth() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-treedepth");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -treedepth (see documentation of the underlying tool for details).
  */

  public GMOps treedepth(Integer value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-treedepth");

    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -trim (see documentation of the underlying tool for details).
  */

  public GMOps trim() {

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
     -type (see documentation of the underlying tool for details).
  */

  public GMOps type() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-type");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -type (see documentation of the underlying tool for details).
  */

  public GMOps type(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-type");

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
     -undercolor (see documentation of the underlying tool for details).
  */

  public GMOps undercolor() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-undercolor");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -undercolor (see documentation of the underlying tool for details).
  */

  public GMOps undercolor(String color) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-undercolor");

    if (color != null) {
      buf.append(color.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -units (see documentation of the underlying tool for details).
  */

  public GMOps units() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-units");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -units (see documentation of the underlying tool for details).
  */

  public GMOps units(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-units");

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
     -unsharp (see documentation of the underlying tool for details).
  */

  public GMOps unsharp() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-unsharp");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -unsharp (see documentation of the underlying tool for details).
  */

  public GMOps unsharp(Double radius) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-unsharp");

    if (radius != null) {
      buf.append(radius.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -unsharp (see documentation of the underlying tool for details).
  */

  public GMOps unsharp(Double radius, Double sigma) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-unsharp");

    if (radius != null) {
      buf.append(radius.toString());
    }
    buf.append("x");
    if (sigma != null) {
      buf.append(sigma.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -unsharp (see documentation of the underlying tool for details).
  */

  public GMOps unsharp(Double radius, Double sigma, Double amount) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-unsharp");

    if (radius != null) {
      buf.append(radius.toString());
    }
    buf.append("x");
    if (sigma != null) {
      buf.append(sigma.toString());
    }
    oper="+";
    if (amount.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (amount != null) {
      buf.append(amount.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -unsharp (see documentation of the underlying tool for details).
  */

  public GMOps unsharp(Double radius, Double sigma, Double amount, Double threshold) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-unsharp");

    if (radius != null) {
      buf.append(radius.toString());
    }
    buf.append("x");
    if (sigma != null) {
      buf.append(sigma.toString());
    }
    oper="+";
    if (amount.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (amount != null) {
      buf.append(amount.toString());
    }
    oper="+";
    if (threshold.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (threshold != null) {
      buf.append(threshold.toString());
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

  public GMOps verbose() {

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
     -version (see documentation of the underlying tool for details).
  */

  public GMOps version() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-version");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -view (see documentation of the underlying tool for details).
  */

  public GMOps view() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-view");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -view (see documentation of the underlying tool for details).
  */

  public GMOps view(String text) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-view");

    if (text != null) {
      buf.append(text.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -virtual-pixel (see documentation of the underlying tool for details).
  */

  public GMOps virtualPixel() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-virtual-pixel");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -virtual-pixel (see documentation of the underlying tool for details).
  */

  public GMOps virtualPixel(String method) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-virtual-pixel");

    if (method != null) {
      buf.append(method.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -wave (see documentation of the underlying tool for details).
  */

  public GMOps wave() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-wave");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -wave (see documentation of the underlying tool for details).
  */

  public GMOps wave(Double amplitude) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-wave");

    if (amplitude != null) {
      buf.append(amplitude.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -wave (see documentation of the underlying tool for details).
  */

  public GMOps wave(Double amplitude, Double wavelength) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-wave");

    if (amplitude != null) {
      buf.append(amplitude.toString());
    }
    buf.append("x");
    if (wavelength != null) {
      buf.append(wavelength.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -white-point (see documentation of the underlying tool for details).
  */

  public GMOps whitePoint() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-white-point");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -white-point (see documentation of the underlying tool for details).
  */

  public GMOps whitePoint(Double x) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-white-point");

    if (x != null) {
      buf.append(x.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -white-point (see documentation of the underlying tool for details).
  */

  public GMOps whitePoint(Double x, Double y) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-white-point");

    if (x != null) {
      buf.append(x.toString());
    }
    buf.append(",");
    if (y != null) {
      buf.append(y.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -write (see documentation of the underlying tool for details).
  */

  public GMOps write() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-write");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -write (see documentation of the underlying tool for details).
  */

  public GMOps write(String filename) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-write");

    if (filename != null) {
      buf.append(filename.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +write (see documentation of the underlying tool for details).
  */

  public GMOps p_write() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+write");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +write (see documentation of the underlying tool for details).
  */

  public GMOps p_write(String filename) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+write");

    if (filename != null) {
      buf.append(filename.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }


}
