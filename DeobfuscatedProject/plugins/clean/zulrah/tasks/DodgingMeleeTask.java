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

import gg.squire.zulrah.tasks.ZulrahTaskBase;
import gg.squire.zulrah.tasks.GameEnum24;
import gg.squire.zulrah.tasks.ZulrahManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.util.Arrays;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Dodging Melee", priority=30, blocking=true)
public class DodgingMeleeTask
extends ZulrahTaskBase {
    private  int at;
    private static final  List<Integer> as;

    private static boolean llIIIlllIIIllll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIIIlllIIlIIIl(int n2) {
        return n2 <= 0;
    }

    private static boolean llIIIlllIIlIIII(int n2) {
        return n2 > 0;
    }

    private static boolean llIIIlllIIlIIlI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean ac() {
        WorldPoint var1;
        WorldPoint var2;
        void var3;
        U var4;
        NPC nPC = this.az.W();
        if (U.llIIIlllIIIllIl(nPC)) {
            return lIllIIllllIll[0];
        }
        if (U.llIIIlllIIIlllI(var4.az.DodgingMeleeTask() ? 1 : 0)) {
            return lIllIIllllIll[0];
        }
        int var5 = var3.getOrientation() + Players.getLocal().getOrientation();
        WorldPoint var6 = var4.ai();
        if (U.llIIIlllIIIllll((Object)var4.C(), (Object)k.MAGMA_CENTER_NW)) {
            var2 = var6.dx(lIllIIllllIll[1]).dy(lIllIIllllIll[2]);

            if (1 > (3 + 99 - 27 + 72 ^ 98 + 20 - 117 + 150)) {
                return ((0x71 ^ 0x7C ^ (0x53 ^ 0x3E)) & (93 + 139 - 119 + 89 ^ 62 + 36 - 4 + 76 ^ -1)) != 0;
            }
        } else {
            var2 = var6.dx(lIllIIllllIll[3]);
        }
        if (U.llIIIlllIIlIIII(Math.min((var1 = Players.getLocal().getWorldLocation()).distanceTo(var6), var1.distanceTo(var2)))) {
            if (U.llIIIlllIIIlllI(Players.getLocal().isMoving() ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var6);

                return lIllIIllllIll[4];
            }
            return lIllIIllllIll[0];
        }
        if (U.llIIIlllIIIlllI(as.contains(var5) ? 1 : 0)) {
            var4.at = var4.aB.getTickCount() + lIllIIllllIll[4];
            return lIllIIllllIll[4];
        }
        if (U.llIIIlllIIlIIIl(var4.aB.getTickCount() - var4.at)) {
            return lIllIIllllIll[4];
        }
        var4.sleep(Rand.nextInt((int)lIllIIllllIll[5], (int)lIllIIllllIll[6]));
        if (U.llIIIlllIIlIIlI(var6.equals((Object)var1) ? 1 : 0)) {
            Movement.walk((WorldPoint)var2);

            if (2 < 0) {
                return false;
            }
        } else {
            Movement.walk((WorldPoint)var6);
        }
        return lIllIIllllIll[4];
    }

    private static boolean llIIIlllIIIlllI(int n2) {
        return n2 == 0;
    }

    @Inject
    protected DodgingMeleeTask(v v2, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(v2, client, squireZulrahConfig);
    }

    static {
        U.llIIIlllIIIllII();
        Integer[] integerArray = new Integer[lIllIIllllIll[7]];
        integerArray[U.lIllIIllllIll[0]] = lIllIIllllIll[8];
        integerArray[U.lIllIIllllIll[4]] = lIllIIllllIll[9];
        integerArray[U.lIllIIllllIll[10]] = lIllIIllllIll[11];
        integerArray[U.lIllIIllllIll[5]] = lIllIIllllIll[12];
        integerArray[U.lIllIIllllIll[13]] = lIllIIllllIll[14];
        integerArray[U.lIllIIllllIll[6]] = lIllIIllllIll[15];
        integerArray[U.lIllIIllllIll[16]] = lIllIIllllIll[17];
        integerArray[U.lIllIIllllIll[18]] = lIllIIllllIll[19];
        as = Arrays.asList(integerArray);
    }

    private static boolean llIIIlllIIIllIl(Object object) {
        return object == null;
    }
}

