/**************************************************************************
/* This class wraps the jpegtran command.
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
   This class wraps the jpegtran command.

   @version $Revision: 1.2 $
   @author  $Author: bablokb $
 
   @since 0.96
*/

public class JpegtranCmd extends ImageCommand {

 //////////////////////////////////////////////////////////////////////////////

  /**
     Constructor.
  */

  public  JpegtranCmd() {
    super("jpegtran");
  }
}
