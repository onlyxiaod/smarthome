/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.model.script.actions;

import java.io.IOException;

import org.eclipse.smarthome.io.net.exec.ExecUtil;

/**
 * This class provides static methods that can be used in automation rules for
 * executing commands on command line.
 *
 * @author Pauli Anttila
 *
 */
public class Exec {

    /**
     * <p>
     * Executes <code>commandLine</code>. Sometimes (especially observed on MacOS) the commandLine isn't executed
     * properly. In that cases another exec-method is to be used. To accomplish this please use the special delimiter '
     * <code>@@</code>'. If <code>commandLine</code> contains this delimiter it is split into a String[] array and the
     * special exec-method is used.
     * </p>
     * <p>
     * A possible {@link IOException} gets logged but no further processing is done.
     * </p>
     *
     * @param commandLine
     *            the command line to execute
     * @see http://www.peterfriese.de/running-applescript-from-java/
     */
    static public void executeCommandLine(String commandLine) {
        ExecUtil.executeCommandLine(commandLine);
    }

    /**
     * <p>
     * Executes <code>commandLine</code>. Sometimes (especially observed on MacOS) the commandLine isn't executed
     * properly. In that cases another exec-method is to be used. To accomplish this please use the special delimiter '
     * <code>@@</code>'. If <code>commandLine</code> contains this delimiter it is split into a String[] array and the
     * special exec-method is used.
     * </p>
     * <p>
     * A possible {@link IOException} gets logged but no further processing is done.
     * </p>
     *
     * @param commandLine
     *            the command line to execute
     * @param timeout
     *            timeout for execution in milliseconds
     * @return response data from executed command line
     */
    static public String executeCommandLine(String commandLine, int timeout) {
        return ExecUtil.executeCommandLineAndWaitResponse(commandLine, timeout);
    }

}
