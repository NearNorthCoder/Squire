/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.GameEnum6;
import gg.squire.zulrah.tasks.ZulrahManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Dodging Melee", priority=30, blocking=true)
public class DodgingMeleeTask
extends ad {
    private  int at;
    private static final  List<Integer> as;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean ac() {
        WorldPoint var2;
        WorldPoint var3;
        void var4;
        U var5;
        NPC nPC = this.az.W();
        if nPC == null {
            return 0;
        }
        if ((var5.az.DodgingMeleeTask( == 0) ? 1 : 0)) {
            return 0;
        }
        int var6 = var4.getOrientation() + Players.getLocal().getOrientation();
        WorldPoint var7 = var5.ai();
        if (((Object)var5.C() == (Object)var5.C()2)k.MAGMA_CENTER_NW)) {
            var3 = var7.dx(1).dy(2);
            0;
            if (1 > (3 + 99 - 27 + 72 ^ 98 + 20 - 117 + 150)) {
                return ((0x71 ^ 0x7C ^ (0x53 ^ 0x3E)) & (93 + 139 - 119 + 89 ^ 62 + 36 - 4 + 76 ^ -1)) != 0;
            }
        } else {
            var3 = var7.dx(3);
        }
        if ((Math.min((var2 = Players.getLocal( > 0).getWorldLocation()).distanceTo(var7), var2.distanceTo(var3)))) {
            if ((Players.getLocal( == 0).isMoving() ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var7);
                0;
                return 4;
            }
            return 0;
        }
        if ((as.contains(var6 == 0) ? 1 : 0)) {
            var5.at = var5.aB.getTickCount() + 4;
            return 4;
        }
        if ((var5.aB.getTickCount( <= 0) - var5.at)) {
            return 4;
        }
        var5.sleep(Rand.nextInt((int)5, (int)6));
        if ((var7.equals(ObjectllllllllllllllIllIIlIIIIllIIIlII) ? 1 : 0)) {
            Movement.walk((WorldPoint)var3);
            0;
            if (2 < 0) {
                return ((0x1F ^ 0x11) & ~(0x56 ^ 0x58)) != 0;
            }
        } else {
            Movement.walk((WorldPoint)var7);
        }
        return 4;
    }

    @Inject
    protected DodgingMeleeTask(v v2, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(v2, client, squireZulrahConfig);
    }

    static {
        U.var8();
        Integer[] integerArray = new Integer[7];
        integerArray[0] = 8;
        integerArray[4] = 9;
        integerArray[U.var1[10]] = var1[11];
        integerArray[5] = var1[12];
        integerArray[U.var1[13]] = var1[14];
        integerArray[6] = var1[15];
        integerArray[U.var1[16]] = var1[17];
        integerArray[U.var1[18]] = var1[19];
        as = Arrays.asList(integerArray);
    }

}

