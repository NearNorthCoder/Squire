/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.movement.pathfinder.TeleportLoader
 */
package gg.squire.corp.tasks;

import gg.squire.corp.tasks.CorpTaskBase;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.corp.SquireCorp;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;

@TaskDesc(name="Teleporting to house")
public class TeleportingToHouseTask
extends CorpTaskBase {
    
    @Inject
    private  SquireCorp p;

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

        return lIllIIIIlIll[1];
    }

    static {
        a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.o.lllIIIlllIllll();
    }

    private static boolean lllIIIllllIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIIllllIIIl(int n2) {
        return n2 != 0;
    }
}

