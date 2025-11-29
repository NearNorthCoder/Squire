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
import gg.squire.vardorvis.tasks.HHelper;

@TaskDesc(name="Dodging Axe", priority=5000, blocking=true)
public class DodgingAxeTask
extends VardorvisTaskBase {
    private  boolean Y;

    @Inject
    protected DodgingAxeTask(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, e e2, b b2, Client client) {
        super(squireVardorvis, squireVardorvisConfig, e2, b2, client);
        this.Y = var1[0];
    }

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    private static boolean var3(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var5(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean l() {
        w var7;
        int n2 = Static.getClient().getTickCount();
        this.u.C().removeIf(h2 -> {
            boolean bl;
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.w.var4(h2.G(), n2)) {
                bl = var1[1];
                0;
                if null != null {
                    return ((0xC ^ 0x6D ^ (0xFA ^ 0xA3) & ~(0x4B ^ 0x12)) & (0x7F ^ 0x39 ^ (7 ^ 0x20) ^ -1)) != 0;
                }
            } else {
                bl = var1[0];
            }
            return bl;
        });
        0;
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.w.var5(this.u.C().size()) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.w.var3(this.u.C().get((int)r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.w.var1[0]).W, n2)) {
            void var8;
            h h3 = this.u.C().get(var1[0]);
            this.Y = h3.Y;
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.w.var2(h3.X)) {
                Movement.setDestination((WorldPoint)q);
            }
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.w.var3(var8.X, var1[1])) {
                Movement.setDestination((WorldPoint)r);
            }
            var7.u.C().remove(var1[0]);
            0;
            return var1[1];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.w.var9(var7.x.getWorldLocation().equals((Object)p) ? 1 : 0)) {
            var7.Y = var1[0];
            return var1[0];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.w.var2(var7.Y) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.w.var4(var7.v.v(), var1[2])) {
            return var1[0];
        }
        Movement.setDestination((WorldPoint)p);
        return var1[1];
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

    private static void var6() {
        var1 = new int[3];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.w.var1[0] = (0x83 ^ 0xA6) & ~(0x31 ^ 0x14);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.w.var1[1] = 1;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.w.var1[2] = 2;
    }
}

