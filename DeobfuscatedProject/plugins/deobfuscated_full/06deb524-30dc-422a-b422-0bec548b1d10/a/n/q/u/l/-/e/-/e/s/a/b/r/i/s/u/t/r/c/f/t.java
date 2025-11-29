/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.H;
import gg.squire.minigames.SquireBlastFurnaceConfig;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

public class t {
    private static final /* synthetic */ WorldPoint ar;
    @Inject
    private /* synthetic */ SquireBlastFurnaceConfig i;
    @Inject
    private /* synthetic */ H at;
    private /* synthetic */ boolean as;
    private static /* synthetic */ int[] lIIllIIIllII;

    private static boolean llIIlllIIIlIII(Object object) {
        return object == null;
    }

    public t() {
        this.as = lIIllIIIllII[0];
    }

    private static boolean llIIlllIIIllII(int n2) {
        return n2 > 0;
    }

    public boolean H() {
        return this.as;
    }

    private static void llIIlllIIIIlll() {
        lIIllIIIllII = new int[5];
        t.lIIllIIIllII[0] = (0x5D ^ 0x41) & ~(0x6D ^ 0x71);
        t.lIIllIIIllII[1] = 2;
        t.lIIllIIIllII[2] = 1;
        t.lIIllIIIllII[3] = -(0xFFFFFD67 & 0x7AF9) & (0xFFFFFFF6 & Short.MAX_VALUE);
        t.lIIllIIIllII[4] = 0xFFFFF76F & 0x1BF7;
    }

    public boolean G() {
        boolean bl;
        t var3;
        if (t.llIIlllIIIlIll(this.i.useStams() ? 1 : 0)) {
            return lIIllIIIllII[2];
        }
        if (t.llIIlllIIIllII(t.llIIlllIIIlIlI((double)Movement.getRunEnergy() - var3.at.aj(), var3.i.requireStaminaThreshold()))) {
            bl = lIIllIIIllII[2];
            0;
            if ((0x4C ^ 0x48) <= 1) {
                return false;
            }
        } else {
            bl = lIIllIIIllII[0];
        }
        return bl;
    }

    static {
        t.llIIlllIIIIlll();
        ar = new WorldPoint(lIIllIIIllII[3], lIIllIIIllII[4], lIIllIIIllII[0]);
    }

    /*
     * WARNING - void declaration
     */
    public boolean F() {
        boolean bl;
        void var1;
        Player player = Players.getLocal();
        if (t.llIIlllIIIlIII(player)) {
            return lIIllIIIllII[0];
        }
        WorldPoint var2 = var1.getWorldLocation();
        if (t.llIIlllIIIlIIl(var2.distanceTo(ar), lIIllIIIllII[1])) {
            bl = lIIllIIIllII[2];
            0;
            if (2 < ((4 ^ 0x3F ^ (0xA0 ^ 0xC4)) & (129 + 217 - 215 + 88 ^ 26 + 79 - 16 + 43 ^ -1))) {
                return (3 & (3 ^ -1)) != 0;
            }
        } else {
            bl = lIIllIIIllII[0];
        }
        return bl;
    }

    private static int llIIlllIIIlIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static boolean llIIlllIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIlllIIIlIll(int n2) {
        return n2 == 0;
    }

    public t a(boolean bl) {
        this.as = bl;
        return this;
    }
}

