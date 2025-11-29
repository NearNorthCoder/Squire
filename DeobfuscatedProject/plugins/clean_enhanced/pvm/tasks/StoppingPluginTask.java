/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.pvm.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamansPlugin;
import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.pvm.tasks.PvmManager;

@TaskDesc(name="Stopping plugin", priority=8, register=true)
public class StoppingPluginTask
extends Task {
    private final  c Q;
    
    private static final  Logger O;
    private final  SquireShamansPlugin P;

    @Inject
    public StoppingPluginTask(SquireShamansPlugin squireShamansPlugin, c c2) {
        this.P = squireShamansPlugin;
        this.Q = c2;
    }

    public boolean run() {
        j var2;
        if (j.var3(this.P.i() ? 1 : 0)) {
            return var1[0];
        }
        if (j.var3(var2.Q.s() ? 1 : 0)) {
            return var1[0];
        }
        this.P.forceStop();
        return var1[1];
    }

    static {
        j.var4();
        O = LoggerFactory.getLogger(StoppingPluginTask.class);
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static void var4() {
        var1 = new int[2];
        j.var1[0] = (0xE ^ 0x42 ^ (0x6D ^ 0x32)) & (0xE ^ 0x31 ^ (0x84 ^ 0xA8) ^ -1);
        j.var1[1] = 1;
    }
}

