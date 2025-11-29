/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 */
package gg.squire.driftnet.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.driftnet.SquireDriftNet;
import javax.inject.Inject;
import net.runelite.api.Client;

@TaskDesc(name="Figuring out what harpoon we are using", priority=0x7FFFFFFF, blocking=true)
public class FiguringOutWhatHarpoonWeAreUsingTask
extends Task {
    
    private final  Client C;
    private final  SquireDriftNet B;

    static {
        g.var2();
    }

    public boolean run() {
        g var3;
        if ((this.B.d( == 0).isEmpty() ? 1 : 0)) {
            return 0;
        }
        var3.B.a(var3.B.a());
        if ((var3.B.d( == 0).isEmpty() ? 1 : 0)) {
            var3.B.b();
        }
        return 1;
    }

    @Inject
    public FiguringOutWhatHarpoonWeAreUsingTask(SquireDriftNet squireDriftNet, Client client) {
        this.B = squireDriftNet;
        this.C = client;
    }
}

