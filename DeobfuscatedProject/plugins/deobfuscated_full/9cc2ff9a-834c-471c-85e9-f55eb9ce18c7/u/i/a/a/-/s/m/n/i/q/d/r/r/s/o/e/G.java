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
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.d;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.j;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.l;

/* TASK: Returning back to starting tile -> ReturningbacktostartingtileTask */
@TaskDesc(name="Returning back to starting tile", blocking=true)
public class G
extends Task {
    private static /* synthetic */ int[] lIIlIIllllllI;
    private final /* synthetic */ l aN;
    private final /* synthetic */ g aM;
    private final /* synthetic */ d aO;

    public boolean run() {
        G var2;
        if (G.lIlIlIlIllIllIl(this.aM.m() ? 1 : 0)) {
            return lIIlIIllllllI[0];
        }
        j var3 = var2.aM.t();
        if (G.lIlIlIlIllIlllI(var3) && G.lIlIlIlIllIllll(var3.B() ? 1 : 0)) {
            return lIIlIIllllllI[0];
        }
        if (G.lIlIlIlIllIllll(var2.aM.l() ? 1 : 0)) {
            return lIIlIIllllllI[0];
        }
        if (G.lIlIlIlIlllIIII(var2.aM.k(), lIIlIIllllllI[1]) && (!G.lIlIlIlIllIllIl(var2.aM.o() ? 1 : 0) || G.lIlIlIlIllIllll(var2.aO.i().isPresent() ? 1 : 0))) {
            return lIIlIIllllllI[0];
        }
        WorldPoint var1 = var2.aN.N();
        if (G.lIlIlIlIllIllll(Movement.shouldWalk() ? 1 : 0) && G.lIlIlIlIllIllIl(var1.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walk((WorldPoint)var1);
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
    public G(g g2, l l2, d d2) {
        this.aM = g2;
        this.aN = l2;
        this.aO = d2;
    }

    private static boolean lIlIlIlIllIlllI(Object object) {
        return object != null;
    }

    private static void lIlIlIlIllIllII() {
        lIIlIIllllllI = new int[3];
        G.lIIlIIllllllI[0] = (41 + 21 - 36 + 132 ^ 83 + 44 - 88 + 92) & (0x5C ^ 0x62 ^ (0xE5 ^ 0xC6) ^ -1);
        G.lIIlIIllllllI[1] = 0x62 ^ 0x7C ^ (0x5E ^ 0x4A);
        G.lIIlIIllllllI[2] = 1;
    }

    static {
        G.lIlIlIlIllIllII();
    }

    private static boolean lIlIlIlIllIllll(int n2) {
        return n2 != 0;
    }
}

