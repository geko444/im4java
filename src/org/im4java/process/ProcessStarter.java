/**************************************************************************
/* This class implements the processing of os-commands using Runtime.exec()
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

package org.im4java.process;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedList;

/**
   This class implements the processing of os-commands using Runtime.exec().
   The class does not use the newer ProcessBuilder, since it has no
   knowledge about the valid os-arguments of the generated command.

   @version $Revision: 1.14 $
   @author  $Author: bablokb $
*/

public class ProcessStarter {

  //////////////////////////////////////////////////////////////////////////////

  /**
     Buffer size of process input-stream (used for reading the
     output (sic!) of the process). Currently 64KB.
  */

  public static final int BUFFER_SIZE=65536;

  //////////////////////////////////////////////////////////////////////////////

  /**
     The InputProvider for the ProcessStarter (if used as a pipe).
  */

  private InputProvider iInputProvider = null;

  //////////////////////////////////////////////////////////////////////////////

  /**
     The OutputConsumer for the ProcessStarter (if used as a pipe).
  */

  private OutputConsumer iOutputConsumer = null;

  //////////////////////////////////////////////////////////////////////////////

  /**
     The ErrorConsumer for the stderr of the ProcessStarter.
  */

  private ErrorConsumer iErrorConsumer = null;

   //////////////////////////////////////////////////////////////////////////////

  /**
     Constructor.
  */

  protected ProcessStarter() {
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Set the InputProvider for the ProcessStarter (if used as a pipe).
  */

  public void setInputProvider(InputProvider pInputProvider) {
    iInputProvider = pInputProvider;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Set the OutputConsumer for the ProcessStarter (if used as a pipe).
  */

  public void setOutputConsumer(OutputConsumer pOutputConsumer) {
    iOutputConsumer = pOutputConsumer;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Set the ErrorConsumer for the stderr of the ProcessStarter.
  */

  public void setErrorConsumer(ErrorConsumer pErrorConsumer) {
    iErrorConsumer = pErrorConsumer;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Pipe input to the command. This is done asynchronously.
  */

  private void processInput(OutputStream pOutputStream) throws IOException {
	  final BufferedOutputStream bos = 
		  new BufferedOutputStream(pOutputStream,BUFFER_SIZE);
    (new Thread() {
	public void run() {
	  try {
	    iInputProvider.provideInput(bos);
	  } catch (IOException iex) {
	    // we do nothing, since we are in an asynchronous thread anyway
	  }
	}
      }).run();
    bos.close();
    if (pOutputStream != null) {
      pOutputStream.close();
    }
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Let the OutputConsumer process the output of the command.
  */

  private void processOutput(InputStream pInputStream, 
		  OutputConsumer pConsumer) throws IOException{
    BufferedInputStream bis = new BufferedInputStream(pInputStream,BUFFER_SIZE);
    pConsumer.consumeOutput(bis);
    bis.close();
    if (pInputStream != null) {
      pInputStream.close();
    }
  }
  
  //////////////////////////////////////////////////////////////////////////////

  /**
     Let the ErrorConsumer process the stderr-stream.
  */

  private void processError(InputStream pInputStream, 
		  ErrorConsumer pConsumer) throws IOException{
    BufferedInputStream bis = new BufferedInputStream(pInputStream,BUFFER_SIZE);
    pConsumer.consumeError(bis);
    bis.close();
    if (pInputStream != null) {
      pInputStream.close();
    }
  }
 
 
  //////////////////////////////////////////////////////////////////////////////
  
  /**
       Execute the command.
   */	
  
  public int run(LinkedList<String> pArgs) 
                      throws IOException, InterruptedException {

   // create process using a ProcessBuilder
    ProcessBuilder builder = new ProcessBuilder(pArgs);
    Process process = builder.start();

    if (iInputProvider != null) {
      processInput(process.getOutputStream());
    }
    if (iOutputConsumer != null) {
      processOutput(process.getInputStream(),iOutputConsumer);
    }
    if (iErrorConsumer != null) {
        processError(process.getErrorStream(),iErrorConsumer);
    }
    
    process.waitFor();
    int rc=process.exitValue();
     
    // just to be on the safe side
    try {
      process.getInputStream().close();
      process.getOutputStream().close();
      process.getErrorStream().close();
    } catch (Exception e) {
    }
    return rc;
  }

}
