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

   @version $Revision: 1.1 $
   @author  $Author: bablokb $
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
    Info imageInfo = new Info(iImageDir+"firelily.jpg");
    Enumeration<String> props = imageInfo.getPropertyNames();
    if (props == null) {
      return;
    }
    while (props.hasMoreElements()) {
      String prop=props.nextElement();
      System.out.println(prop+"="+imageInfo.getProperty(prop));
    }
  }
}