/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.saradomin.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import gg.squire.saradomin.tasks.SaradominManager;
import gg.squire.saradomin.tasks.SaradominManager;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.j;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.l;

@TaskDesc(name="Returning back to starting tile", blocking=true)
public class ReturningBackToStartingTileTask
extends Task {
    
    private final  l aN;
    private final  g aM;
    private final  d aO;

    public boolean run() {
        G var1;
        if (G.lIlIlIlIllIllIl(this.aM.m() ? 1 : 0)) {
            return lIIlIIllllllI[0];
        }
        j var2 = var1.aM.t();
        if (G.lIlIlIlIllIlllI(var2) && G.lIlIlIlIllIllll(var2.B() ? 1 : 0)) {
            return lIIlIIllllllI[0];
        }
        if (G.lIlIlIlIllIllll(var1.aM.l() ? 1 : 0)) {
            return lIIlIIllllllI[0];
        }
        if (G.lIlIlIlIlllIIII(var1.aM.k(), lIIlIIllllllI[1]) && (!G.lIlIlIlIllIllIl(var1.aM.o() ? 1 : 0) || G.lIlIlIlIllIllll(var1.aO.i().isPresent() ? 1 : 0))) {
            return lIIlIIllllllI[0];
        }
        WorldPoint var3 = var1.aN.N();
        if (G.lIlIlIlIllIllll(Movement.shouldWalk() ? 1 : 0) && G.lIlIlIlIllIllIl(var3.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walk((WorldPoint)var3);
        }
        return lIIlIIllllllI[2];
    }

    private static boolean lIlIlIlIllIllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIlIlllIIII(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public ReturningBackToStartingTileTask(g g2, l l2, d d2) {
        this.aM = g2;
        this.aN = l2;
        this.aO = d2;
    }

    private static boolean lIlIlIlIllIlllI(Object object) {
        return object != null;
    }

    static {
        G.lIlIlIlIllIllII();
    }

    private static boolean lIlIlIlIllIllll(int n2) {
        return n2 != 0;
    }
}

