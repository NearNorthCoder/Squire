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
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.ad;
import a.u.i.-.l.r.h.z.s.r.u.q.e.k;
import a.u.i.-.l.r.h.z.s.r.u.q.e.v;
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

/* TASK: Dodging Melee -> DodgingmeleeTask */
@TaskDesc(name="Dodging Melee", priority=30, blocking=true)
public class U
extends ad {
    private /* synthetic */ int at;
    private static final /* synthetic */ List<Integer> as;
    private static /* synthetic */ int[] lIllIIllllIll;

    private static void llIIIlllIIIllII() {
        lIllIIllllIll = new int[20];
        U.lIllIIllllIll[0] = (69 + 21 - -83 + 40 ^ 160 + 93 - 115 + 55) & (0x43 ^ 0x78 ^ (0x2B ^ 4) ^ -1);
        U.lIllIIllllIll[1] = -1;
        U.lIllIIllllIll[2] = -3;
        U.lIllIIllllIll[3] = -2;
        U.lIllIIllllIll[4] = 1;
        U.lIllIIllllIll[5] = 3;
        U.lIllIIllllIll[6] = 0xA4 ^ 0xA1;
        U.lIllIIllllIll[7] = 0x92 ^ 0x9A;
        U.lIllIIllllIll[8] = -(0xFFFFCAF9 & 0x752F) & (0xFFFFD7FF & 0x6FBF);
        U.lIllIIllllIll[9] = -(0xFFFFF37E & 0x2CA5) & (0xFFFFE7BB & 0x3FFF);
        U.lIllIIllllIll[10] = 2;
        U.lIllIIllllIll[11] = 0xFFFF867C & 0x7FEB;
        U.lIllIIllllIll[12] = 0xFFFFFF6B & 0x6FD;
        U.lIllIIllllIll[13] = 0x9A ^ 0x9E;
        U.lIllIIllllIll[14] = -(0xFFFFEBEF & 0x3C11) & (0xFFFFAFFF & Short.MAX_VALUE);
        U.lIllIIllllIll[15] = 0xFFFFC86C & 0x3F93;
        U.lIllIIllllIll[16] = 0x7E ^ 0x58 ^ (0x8C ^ 0xAC);
        U.lIllIIllllIll[17] = 0xFFFF89FF & 0x7FBC;
        U.lIllIIllllIll[18] = 0x44 ^ 0x43;
        U.lIllIIllllIll[19] = -(0xFFFFFF72 & 0x168F) & (0xFFFF9FF7 & Short.MAX_VALUE);
    }

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
        WorldPoint var5;
        WorldPoint var2;
        void var3;
        U var4;
        NPC nPC = this.az.W();
        if (U.llIIIlllIIIllIl(nPC)) {
            return lIllIIllllIll[0];
        }
        if (U.llIIIlllIIIlllI(var4.az.U() ? 1 : 0)) {
            return lIllIIllllIll[0];
        }
        int var6 = var3.getOrientation() + Players.getLocal().getOrientation();
        WorldPoint var1 = var4.ai();
        if (U.llIIIlllIIIllll((Object)var4.C(), (Object)k.MAGMA_CENTER_NW)) {
            var2 = var1.dx(lIllIIllllIll[1]).dy(lIllIIllllIll[2]);
            0;
            if (1 > (3 + 99 - 27 + 72 ^ 98 + 20 - 117 + 150)) {
                return ((0x71 ^ 0x7C ^ (0x53 ^ 0x3E)) & (93 + 139 - 119 + 89 ^ 62 + 36 - 4 + 76 ^ -1)) != 0;
            }
        } else {
            var2 = var1.dx(lIllIIllllIll[3]);
        }
        if (U.llIIIlllIIlIIII(Math.min((var5 = Players.getLocal().getWorldLocation()).distanceTo(var1), var5.distanceTo(var2)))) {
            if (U.llIIIlllIIIlllI(Players.getLocal().isMoving() ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var1);
                0;
                return lIllIIllllIll[4];
            }
            return lIllIIllllIll[0];
        }
        if (U.llIIIlllIIIlllI(as.contains(var6) ? 1 : 0)) {
            var4.at = var4.aB.getTickCount() + lIllIIllllIll[4];
            return lIllIIllllIll[4];
        }
        if (U.llIIIlllIIlIIIl(var4.aB.getTickCount() - var4.at)) {
            return lIllIIllllIll[4];
        }
        var4.sleep(Rand.nextInt((int)lIllIIllllIll[5], (int)lIllIIllllIll[6]));
        if (U.llIIIlllIIlIIlI(var1.equals((Object)var5) ? 1 : 0)) {
            Movement.walk((WorldPoint)var2);
            0;
            if (2 < 0) {
                return false;
            }
        } else {
            Movement.walk((WorldPoint)var1);
        }
        return lIllIIllllIll[4];
    }

    private static boolean llIIIlllIIIlllI(int n2) {
        return n2 == 0;
    }

    @Inject
    protected U(v v2, Client client, SquireZulrahConfig squireZulrahConfig) {
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

