/**************************************************************************
/* This class wraps the IM command identify.
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.im4java.process.OutputConsumer;

/**
   This class wraps the IM command identify.

   @version $Revision: 1.10 $
   @author  $Author: bablokb $
*/

public class IdentifyCmd extends ImageCommand implements OutputConsumer {

 //////////////////////////////////////////////////////////////////////////////

  /**
     Output of identify command.
  */

  private ArrayList<String> iOutputLines = new ArrayList<String>();

 //////////////////////////////////////////////////////////////////////////////

  /**
     Constructor. This saves the output into an internal field (array-list).
  */

  public  IdentifyCmd() {
    super("identify");
   	setOutputConsumer(this);
  }

  //////////////////////////////////////////////////////////////////////////////
  
  /**
     Return array with output-lines.
  */

  public ArrayList<String> getOutput() {
    return iOutputLines;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Execute the command (replace given placeholders).
  */

  public void run(Operation pOperation, Object... images) 
                    throws IOException, InterruptedException, IM4JavaException {
    iOutputLines.clear();
    super.run(pOperation,images);
  }

///////////////////////////////////////////////////////////////////////////////

/**
 * Read command output and save in an internal field.
  @see org.im4java.process.OutputConsumer#consumeOutput(java.io.InputStream)
*/


  public void consumeOutput(InputStream pInputStream) throws IOException {
	  InputStreamReader isr = new InputStreamReader(pInputStream);
	  BufferedReader reader = new BufferedReader(isr);
	  String line;
	  while ((line=reader.readLine()) != null) {
		  iOutputLines.add(line);
	  }
	  reader.close();
  }
}
