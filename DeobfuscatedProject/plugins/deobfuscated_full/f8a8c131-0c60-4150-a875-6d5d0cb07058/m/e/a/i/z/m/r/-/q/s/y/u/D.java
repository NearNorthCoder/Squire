/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package m.e.a.i.z.m.r.-.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import m.e.a.i.z.m.r.-.q.s.y.u.c;
import m.e.a.i.z.m.r.-.q.s.y.u.d;
import m.e.a.i.z.m.r.-.q.s.y.u.l;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

/* TASK: Moving to starting tile -> MovingtostartingtileTask */
@TaskDesc(name="Moving to starting tile")
public class D
extends Task {
    private final /* synthetic */ l aG;
    private final /* synthetic */ c aH;
    private static /* synthetic */ int[] lIllIIIlIlIIl;

    @Inject
    public D(l l2, c c2) {
        this.aG = l2;
        this.aH = c2;
    }

    private static boolean llIIIlIIlllIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIlIIlllIIll(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIlIIlllIllI(int n2, int n3) {
        return n2 > n3;
    }

    static {
        D.llIIIlIIlllIIlI();
    }

    private static boolean llIIIlIIlllIlII(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        D var2;
        if (D.llIIIlIIlllIIll(this.aG.B() ? 1 : 0)) {
            return lIllIIIlIlIIl[0];
        }
        d var4 = var2.aG.I();
        if (D.llIIIlIIlllIlII(var4) && D.llIIIlIIlllIlIl(var4.l() ? 1 : 0)) {
            return lIllIIIlIlIIl[0];
        }
        if (D.llIIIlIIlllIlIl(var2.aG.A() ? 1 : 0)) {
            return lIllIIIlIlIIl[0];
        }
        if (D.llIIIlIIlllIlIl(var2.aG.D() ? 1 : 0) && D.llIIIlIIlllIllI(var2.aG.z(), lIllIIIlIlIIl[1])) {
            return lIllIIIlIlIIl[0];
        }
        Player var3 = Players.getLocal();
        if (D.llIIIlIIlllIlIl(var3.isMoving() ? 1 : 0)) {
            return lIllIIIlIlIIl[0];
        }
        WorldPoint var1 = var2.aH.i();
        if (D.llIIIlIIlllIlIl(var3.getWorldLocation().equals((Object)var1) ? 1 : 0)) {
            return lIllIIIlIlIIl[0];
        }
        Movement.walkTo((WorldPoint)var3_3);
        0;
        return lIllIIIlIlIIl[2];
    }

    private static void llIIIlIIlllIIlI() {
        lIllIIIlIlIIl = new int[3];
        D.lIllIIIlIlIIl[0] = (0xC5 ^ 0xA0 ^ (0x21 ^ 0x40)) & (104 + 112 - 157 + 104 ^ 43 + 153 - 160 + 131 ^ -1);
        D.lIllIIIlIlIIl[1] = 0x13 ^ 0x19;
        D.lIllIIIlIlIIl[2] = 1;
    }
}

