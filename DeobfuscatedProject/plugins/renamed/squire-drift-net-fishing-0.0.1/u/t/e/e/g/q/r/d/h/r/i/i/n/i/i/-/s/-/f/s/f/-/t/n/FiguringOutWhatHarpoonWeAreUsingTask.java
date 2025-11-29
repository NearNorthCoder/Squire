/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 */
package u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.driftnet.SquireDriftNet;
import javax.inject.Inject;
import net.runelite.api.Client;

/* TASK: Figuring out what harpoon we are using -> FiguringoutwhatharpoonweareusingTask */
@TaskDesc(name="Figuring out what harpoon we are using", priority=0x7FFFFFFF, blocking=true)
public class FiguringOutWhatHarpoonWeAreUsingTask
extends Task {
    private static /* synthetic */ int[] lIlIIIIIlIll;
    private final /* synthetic */ Client C;
    private final /* synthetic */ SquireDriftNet B;

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
    public g(SquireDriftNet squireDriftNet, Client client) {
        this.B = squireDriftNet;
        this.C = client;
    }

    private static void llIlIIllIlIlII() {
        lIlIIIIIlIll = new int[2];
        g.lIlIIIIIlIll[0] = 1 & (1 ^ -1);
        g.lIlIIIIIlIll[1] = 1;
    }
}

