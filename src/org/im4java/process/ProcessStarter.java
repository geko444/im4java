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
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;

/**
   This class implements the processing of os-commands using a
   ProcessBuilder. 

   @version $Revision: 1.20 $
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
     Static global search path for executables.
  */

  private static String iGlobalSearchPath = null;

  //////////////////////////////////////////////////////////////////////////////

  /**
     Per instance search path for executables.
  */

  private String iSearchPath = null;

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


  ////////////////////////////////////////////////////////////////////////////
  
  /**
    Execution-mode. If true, run asynchronously.
  */
  
  private boolean iAsyncMode = false;

  ////////////////////////////////////////////////////////////////////////////
  
  /**
    The ProcessListeners for this ProcessStarter.
  */
  private LinkedList<ProcessListener> iProcessListener;
  
  //////////////////////////////////////////////////////////////////////////////

  /**
     Constructor.
  */

  protected ProcessStarter() {
    iProcessListener = new LinkedList<ProcessListener>();
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
   * Add a ProcessListener to this ProcessStarter.
   * 
   @param pProcessListener the ProcessListener to add
   */
  public void addProcessListener(ProcessListener pProcessListener) {
    iProcessListener.add(pProcessListener);
  }

  /////////////////////////////////////////////////////////////////////////////
  
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
  
  protected int run(final LinkedList<String> pArgs) 
                                      throws IOException, InterruptedException {
    if (! iAsyncMode) {
      Process pr = startProcess(pArgs);
      return waitForProcess(pr);
    } else {
      Runnable r = new Runnable() {
        public void run() {
          int rc;
          ProcessEvent pe = new ProcessEvent();
          try {
            Process pr = startProcess(pArgs);
	    for (ProcessListener pl:iProcessListener) {
	      pl.processStarted(pr);
	    }
            rc = waitForProcess(pr);
            pe.setReturnCode(rc);
          } catch (Exception e) {
            pe.setException(e);
          }
          for (ProcessListener pl:iProcessListener) {
            pl.processTerminated(pe);
          }
        }
      };
      (new Thread(r)).start();
      return 0;
    }
  }

  //////////////////////////////////////////////////////////////////////////////
  
  /**
       Execute the command.
   */	
  
  private Process startProcess(LinkedList<String> pArgs) 
                      throws IOException, InterruptedException {

    // if a global or per object search path is set, resolve the
    // the executable

    if (iSearchPath != null) {
      String cmd = pArgs.getFirst();
      cmd = searchForCmd(cmd,iSearchPath);
      pArgs.set(0,cmd);
    } else if (iGlobalSearchPath != null) {
      String cmd = pArgs.getFirst();
      cmd = searchForCmd(cmd,iGlobalSearchPath);
      pArgs.set(0,cmd);
    }
    ProcessBuilder builder = new ProcessBuilder(pArgs);
    return builder.start();
  }

  //////////////////////////////////////////////////////////////////////////////
  
  /**
       Perform process input/output and wait for process to terminate.
   */	
  
  private int waitForProcess(Process pProcess) 
                      throws IOException, InterruptedException {

    if (iInputProvider != null) {
      processInput(pProcess.getOutputStream());
    }
    if (iOutputConsumer != null) {
      processOutput(pProcess.getInputStream(),iOutputConsumer);
    }
    if (iErrorConsumer != null) {
        processError(pProcess.getErrorStream(),iErrorConsumer);
    }
    
    pProcess.waitFor();
    int rc=pProcess.exitValue();
     
    // just to be on the safe side
    try {
      pProcess.getInputStream().close();
      pProcess.getOutputStream().close();
      pProcess.getErrorStream().close();
    } catch (Exception e) {
    }
    return rc;
  }

  /////////////////////////////////////////////////////////////////////////////
  
  /**
     Set the async-execution mode.

     @param pAsyncMode the iAsyncMode to set
  */
  public void setAsyncMode(boolean pAsyncMode) {
    iAsyncMode = pAsyncMode;
  }

  ////////////////////////////////////////////////////////////////////////////
  
  /**
     Query the async-execution mode.

     @return the iAsyncMode
  */
  public boolean isAsyncMode() {
    return iAsyncMode;
  }

  /////////////////////////////////////////////////////////////////////////////
  
  /**
     Set the global (static) search path. You can override this search path
     on a per object basis.

     @param pGlobalSearchPath the global search path
  */

  public static void setGlobalSearchPath(String pGlobalSearchPath) {
    iGlobalSearchPath = pGlobalSearchPath;
  }

  /////////////////////////////////////////////////////////////////////////////
  
  /**
     Query the global (static) search path.

     @param pGlobalSearchPath the global search path
  */

  public static String getGlobalSearchPath() {
    return iGlobalSearchPath;
  }

  /////////////////////////////////////////////////////////////////////////////
  
  /**
     Set the per object search path. This overrides the global search path
     (if set).

     @param pSearchPath the search path
  */

  public void setSearchPath(String pSearchPath) {
    iSearchPath = pSearchPath;
  }

  /////////////////////////////////////////////////////////////////////////////
  
  /**
     Query the per object search path.

     @param pSearchPath the  search path
  */

  public String getSearchPath() {
    return iSearchPath;
  }

  /////////////////////////////////////////////////////////////////////////////
  
  /**
     Query the per object search path.

     @param pSearchPath the  search path
  */

  public String searchForCmd(String pCmd, String pPath)
                                   throws IOException, FileNotFoundException {
    // check is pCmd is absolute
    if ((new File(pCmd)).isAbsolute()) {
      return pCmd;
    }

    // special processing on windows-systems.
    // File.pathSeparator is hopefully more robust than 
    // System.getProperty("os.name") ?!
    boolean isWindows=File.pathSeparator.equals(";");

    String dirs[] = pPath.split(File.pathSeparator);
    for (int i=0; i<dirs.length; ++i) {
      if (isWindows) {
	// try thre typical extensions
	File cmd = new File(dirs[i],pCmd+".exe");
	if (cmd.exists()) {
	  return cmd.getCanonicalPath();
	} 
        cmd = new File(dirs[i],pCmd+".cmd");
	if (cmd.exists()) {
	  return cmd.getCanonicalPath();
	} 
	cmd = new File(dirs[i],pCmd+".bat");
	if (cmd.exists()) {
	  return cmd.getCanonicalPath();
	} 
      } else {
	File cmd = new File(dirs[i],pCmd);
	if (cmd.exists()) {
	  return cmd.getCanonicalPath();
	}
      }
    }
    throw new FileNotFoundException(pCmd);
  }
}
