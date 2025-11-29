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
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamansPlugin;
import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.c;

/* TASK: Stopping plugin -> StoppingpluginTask */
@TaskDesc(name="Stopping plugin", priority=8, register=true)
public class j
extends Task {
    private final /* synthetic */ c Q;
    private static /* synthetic */ int[] lIIlIllllIIIl;
    private static final /* synthetic */ Logger O;
    private final /* synthetic */ SquireShamansPlugin P;

    @Inject
    public j(SquireShamansPlugin squireShamansPlugin, c c2) {
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
        O = LoggerFactory.getLogger(j.class);
    }

    private static boolean lIlIllIlllllIll(int n2) {
        return n2 == 0;
    }

    private static void lIlIllIlllllIlI() {
        lIIlIllllIIIl = new int[2];
        j.lIIlIllllIIIl[0] = (0xE ^ 0x42 ^ (0x6D ^ 0x32)) & (0xE ^ 0x31 ^ (0x84 ^ 0xA8) ^ -1);
        j.lIIlIllllIIIl[1] = 1;
    }
}

