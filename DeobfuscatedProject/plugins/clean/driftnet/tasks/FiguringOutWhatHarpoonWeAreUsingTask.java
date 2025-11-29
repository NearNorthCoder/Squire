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
        g.llIlIIllIlIlII();
    }

    public boolean run() {
        g var1;
        if (g.llIlIIllIlIlIl(this.B.d().isEmpty() ? 1 : 0)) {
            return lIlIIIIIlIll[0];
        }
        var1.B.a(var1.B.a());
        if (g.llIlIIllIlIlIl(var1.B.d().isEmpty() ? 1 : 0)) {
            var1.B.b();
        }
        return lIlIIIIIlIll[1];
    }

    private static boolean llIlIIllIlIlIl(int n) {
        return n == 0;
    }

    @Inject
    public FiguringOutWhatHarpoonWeAreUsingTask(SquireDriftNet squireDriftNet, Client client) {
        this.B = squireDriftNet;
        this.C = client;
    }

}

