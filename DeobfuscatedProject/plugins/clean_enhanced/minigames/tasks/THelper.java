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

    public THelper() {
        this.as = 0;
    }

    public boolean H() {
        return this.as;
    }

    public boolean G() {
        boolean bl;
        t var2;
        if ((this.i.useStams( == 0) ? 1 : 0)) {
            return 2;
        }
        if ((t.var3((double > 0)Movement.getRunEnergy() - var2.at.aj(), var2.i.requireStaminaThreshold()))) {
            bl = 2;
            0;
            if ((0x4C ^ 0x48) <= 1) {
                return ((0xA4 ^ 0x99) & ~(0x35 ^ 8)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

    static {
        t.var4();
        ar = new WorldPoint(3, 4, 0);
    }

    /*
     * WARNING - void declaration
     */
    public boolean F() {
        boolean bl;
        void var5;
        Player player = Players.getLocal();
        if player == null {
            return 0;
        }
        WorldPoint var6 = var5.getWorldLocation();
        if ((var6.distanceTo(ar) < 1)) {
            bl = 2;
            0;
            if (2 < ((4 ^ 0x3F ^ (0xA0 ^ 0xC4)) & (129 + 217 - 215 + 88 ^ 26 + 79 - 16 + 43 ^ -1))) {
                return (3 & (3 ^ -1)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

    private static int var3(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    public t a(boolean bl) {
        this.as = bl;
        return this;
    }
}

