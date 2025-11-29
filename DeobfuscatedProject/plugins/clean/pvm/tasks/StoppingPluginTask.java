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
import gg.squire.pvm.tasks.CHelper;

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
        j var1;
        if (j.lIlIllIlllllIll(this.P.i() ? 1 : 0)) {
            return lIIlIllllIIIl[0];
        }
        if (j.lIlIllIlllllIll(var1.Q.s() ? 1 : 0)) {
            return lIIlIllllIIIl[0];
        }
        this.P.forceStop();
        return lIIlIllllIIIl[1];
    }

    static {
        j.lIlIllIlllllIlI();
        O = LoggerFactory.getLogger(StoppingPluginTask.class);
    }

    private static boolean lIlIllIlllllIll(int n2) {
        return n2 == 0;
    }

}

