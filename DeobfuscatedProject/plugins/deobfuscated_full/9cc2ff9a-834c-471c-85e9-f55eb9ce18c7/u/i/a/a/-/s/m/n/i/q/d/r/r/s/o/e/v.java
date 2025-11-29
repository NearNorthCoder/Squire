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
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.l;

/* TASK: Recovering from getting stuck on a tile -> RecoveringfromgettingstuckonatileTask */
@TaskDesc(name="Recovering from getting stuck on a tile", priority=10)
public class v
extends Task {
    private final /* synthetic */ g ak;
    private static /* synthetic */ int[] lIIlIlIIlIIlI;
    private final /* synthetic */ l al;

    @Inject
    public v(g g2, l l2) {
        this.ak = g2;
        this.al = l2;
    }

    private static boolean lIlIlIllIllIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIllIlllIIl(int n2) {
        return n2 != 0;
    }

    private static void lIlIlIllIllIllI() {
        lIIlIlIIlIIlI = new int[2];
        v.lIIlIlIIlIIlI[0] = (0x8F ^ 0xC5 ^ (0x92 ^ 0xBB)) & (0x94 ^ 0x8E ^ (0xC8 ^ 0xB1) ^ -1);
        v.lIIlIlIIlIIlI[1] = 1;
    }

    private static boolean lIlIlIllIlllIII(Object object) {
        return object == null;
    }

    static {
        v.lIlIlIllIllIllI();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        v var1;
        if (v.lIlIlIllIllIlll(this.ak.m() ? 1 : 0)) {
            return lIIlIlIIlIIlI[0];
        }
        if (v.lIlIlIllIllIlll(var1.ak.l() ? 1 : 0)) {
            return lIIlIlIIlIIlI[0];
        }
        if (!v.lIlIlIllIlllIII(var1.al.M()) || v.lIlIlIllIlllIIl(Players.getLocal().isMoving() ? 1 : 0)) {
            return lIIlIlIIlIIlI[0];
        }
        WorldPoint var2 = var1.al.Q();
        if (v.lIlIlIllIlllIII(var2)) {
            return lIIlIlIIlIIlI[0];
        }
        Movement.walkTo((WorldPoint)var1_1);
        0;
        return lIIlIlIIlIIlI[1];
    }
}

