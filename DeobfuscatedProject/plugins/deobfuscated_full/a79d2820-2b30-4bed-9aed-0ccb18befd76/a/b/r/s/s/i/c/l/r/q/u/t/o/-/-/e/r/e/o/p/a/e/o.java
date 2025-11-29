/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.movement.pathfinder.TeleportLoader
 */
package a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e;

import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.m;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.corp.SquireCorp;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;

/* TASK: Teleporting to house -> TeleportingtohouseTask */
@TaskDesc(name="Teleporting to house")
public class o
extends m {
    private static /* synthetic */ int[] lIllIIIIlIll;
    @Inject
    private /* synthetic */ SquireCorp p;

    public boolean run() {
        o var1;
        if (a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.o.lllIIIllllIIII(this.p.d() ? 1 : 0)) {
            if (a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.o.lllIIIllllIIIl(this.g() ? 1 : 0)) {
                return lIllIIIIlIll[0];
            }
            if (a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.o.lllIIIllllIIIl(var1.p.c() ? 1 : 0)) {
                return lIllIIIIlIll[0];
            }
            if (a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.o.lllIIIllllIIIl(var1.p.b() ? 1 : 0)) {
                return lIllIIIIlIll[0];
            }
        }
        if (a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.o.lllIIIllllIIIl(var1.l() ? 1 : 0)) {
            return lIllIIIIlIll[0];
        }
        TeleportLoader.enterHouse();
        0;
        return lIllIIIIlIll[1];
    }

    static {
        a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.o.lllIIIlllIllll();
    }

    private static void lllIIIlllIllll() {
        lIllIIIIlIll = new int[2];
        a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.o.lIllIIIIlIll[0] = (125 + 31 - 136 + 113 ^ 101 + 23 - 60 + 118) & (0x37 ^ 0xC ^ (0xA2 ^ 0xAA) ^ -1);
        a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.o.lIllIIIIlIll[1] = 1;
    }

    private static boolean lllIIIllllIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIIllllIIIl(int n2) {
        return n2 != 0;
    }
}

