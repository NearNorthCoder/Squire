/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.jshell;

import java.util.Map;
import jdk.jshell.execution.DirectExecutionControl;
import jdk.jshell.spi.ExecutionControl;
import jdk.jshell.spi.ExecutionControlProvider;
import jdk.jshell.spi.ExecutionEnv;

public class RLShellExecutionControl
extends DirectExecutionControl
implements ExecutionControlProvider {
    @Override
    public String name() {
        return this.getClass().getName();
    }

    @Override
    public ExecutionControl generate(ExecutionEnv env, Map<String, String> parameters) throws Throwable {
        return this;
    }
}

