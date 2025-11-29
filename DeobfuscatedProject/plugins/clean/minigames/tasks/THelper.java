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
package gg.squire.minigames.tasks;

import gg.squire.minigames.tasks.MinigamesManager;
import gg.squire.minigames.SquireBlastFurnaceConfig;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

public class THelper {
    private static final  WorldPoint ar;
    @Inject
    private  SquireBlastFurnaceConfig i;
    @Inject
    private  H at;
    private  boolean as;

    private static boolean llIIlllIIIlIII(Object object) {
        return object == null;
    }

    public THelper() {
        this.as = lIIllIIIllII[0];
    }

    private static boolean llIIlllIIIllII(int n2) {
        return n2 > 0;
    }

    public boolean H() {
        return this.as;
    }

    public boolean G() {
        boolean bl;
        t var1;
        if (t.llIIlllIIIlIll(this.i.useStams() ? 1 : 0)) {
            return lIIllIIIllII[2];
        }
        if (t.llIIlllIIIllII(t.llIIlllIIIlIlI((double)Movement.getRunEnergy() - var1.at.aj(), var1.i.requireStaminaThreshold()))) {
            bl = lIIllIIIllII[2];

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
        void var2;
        Player player = Players.getLocal();
        if (t.llIIlllIIIlIII(player)) {
            return lIIllIIIllII[0];
        }
        WorldPoint var3 = var2.getWorldLocation();
        if (t.llIIlllIIIlIIl(var3.distanceTo(ar), lIIllIIIllII[1])) {
            bl = lIIllIIIllII[2];

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

