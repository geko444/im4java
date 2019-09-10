/**************************************************************************
/* This class wraps the IM command mogrify.
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

import org.im4java.core.ImageCommand;

/**
   This class wraps the IM command mogrify.

   @version $Revision: 1.6 $
   @author  $Author: bablokb $
 
   @since 0.95
*/

public class MogrifyCmd extends ImageCommand {

 //////////////////////////////////////////////////////////////////////////////

  /**
     Constructor.
  */

  public  MogrifyCmd() {
    super();
    if (!Boolean.getBoolean("im4java.useGM")) {
      setCommand("mogrify");
    } else {
      setCommand("gm","mogrify");
    }
  }

 //////////////////////////////////////////////////////////////////////////////

  /**
     Constructor with option to use GraphicsMagick.
  */

  public  MogrifyCmd(boolean useGM) {
    super();
    if (useGM) {
      setCommand("gm","mogrify");
    } else {
      setCommand("mogrify");
    }
  }
}
