/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package gg.squire.vardorvis.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
import gg.squire.vardorvis.tasks.VardorvisTaskBase;
import gg.squire.vardorvis.tasks.VardorvisManager;
import gg.squire.vardorvis.tasks.VardorvisManager;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.h;

@TaskDesc(name="Dodging Axe", priority=5000, blocking=true)
public class DodgingAxeTask
extends VardorvisTaskBase {
    private  boolean Y;

    @Inject
    protected DodgingAxeTask(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, e e2, b b2, Client client) {
        super(squireVardorvis, squireVardorvisConfig, e2, b2, client);
        this.Y = lIlIlIIIlllll[0];
    }

    private static boolean lIllllIllIllIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIllllIllIllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllllIllIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllllIllIlIlll(int n2) {
        return n2 > 0;
    }

    static {
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.w.lIllllIllIlIllI();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean l() {
        w var1;
        int n2 = Static.getClient().getTickCount();
        this.u.C().removeIf(h2 -> {
            boolean bl;
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.w.lIllllIllIllIll(h2.G(), n2)) {
                bl = lIlIlIIIlllll[1];

                }
            } else {
                bl = lIlIlIIIlllll[0];
            }
            return bl;
        });

        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.w.lIllllIllIlIlll(this.u.C().size()) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.w.lIllllIllIllIII(this.u.C().get((int)r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.w.lIlIlIIIlllll[0]).W, n2)) {
            void var2;
            h h3 = this.u.C().get(lIlIlIIIlllll[0]);
            this.Y = h3.Y;
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.w.lIllllIllIllIIl(h3.X)) {
                Movement.setDestination((WorldPoint)q);
            }
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.w.lIllllIllIllIII(var2.X, lIlIlIIIlllll[1])) {
                Movement.setDestination((WorldPoint)r);
            }
            var1.u.C().remove(lIlIlIIIlllll[0]);

            return lIlIlIIIlllll[1];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.w.lIllllIllIllIlI(var1.x.getWorldLocation().equals((Object)p) ? 1 : 0)) {
            var1.Y = lIlIlIIIlllll[0];
            return lIlIlIIIlllll[0];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.w.lIllllIllIllIIl(var1.Y ? 1 : 0) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.w.lIllllIllIllIll(var1.v.v(), lIlIlIIIlllll[2])) {
            return lIlIlIIIlllll[0];
        }
        Movement.setDestination((WorldPoint)p);
        return lIlIlIIIlllll[1];
    }

    private static boolean lIllllIllIllIlI(int n2) {
        return n2 != 0;
    }

}

