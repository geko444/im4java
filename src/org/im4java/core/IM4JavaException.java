/**************************************************************************
/* This class is the base class of all  -exceptions.
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

/**
   This class is the base class of all im4java -exceptions.

   @version $Revision: 1.5 $
   @author  $Author: bablokb $
 
   @since 0.95
*/

public class IM4JavaException extends Exception {

 //////////////////////////////////////////////////////////////////////////////

  /**
     Constructor.
  */

  public IM4JavaException() {
    super();
  }

 //////////////////////////////////////////////////////////////////////////////

  /**
     Constructor.
  */

  public IM4JavaException(String pMessage) {
    super(pMessage);
  }

 //////////////////////////////////////////////////////////////////////////////

  /**
     Constructor.
  */

  public IM4JavaException(String pMessage, Throwable pCause) {
    super(pMessage,pCause);
  }

 //////////////////////////////////////////////////////////////////////////////

  /**
     Constructor.
  */

  public IM4JavaException(Throwable pCause) {
    super(pCause);
  }

}
