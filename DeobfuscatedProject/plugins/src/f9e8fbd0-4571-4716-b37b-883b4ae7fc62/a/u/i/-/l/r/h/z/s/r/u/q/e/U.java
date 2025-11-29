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

@TaskDesc(name="Dodging Melee", priority=30, blocking=true)
public class U
extends ad {
    private /* synthetic */ int at;
    private static final /* synthetic */ List<Integer> as;
    private static /* synthetic */ int[] lIllIIllllIll;

    private static void llIIIlllIIIllII() {
        lIllIIllllIll = new int[20];
        U.lIllIIllllIll[0] = (69 + 21 - -83 + 40 ^ 160 + 93 - 115 + 55) & (0x43 ^ 0x78 ^ (0x2B ^ 4) ^ -" ".length());
        U.lIllIIllllIll[1] = -" ".length();
        U.lIllIIllllIll[2] = -"   ".length();
        U.lIllIIllllIll[3] = -"  ".length();
        U.lIllIIllllIll[4] = " ".length();
        U.lIllIIllllIll[5] = "   ".length();
        U.lIllIIllllIll[6] = 0xA4 ^ 0xA1;
        U.lIllIIllllIll[7] = 0x92 ^ 0x9A;
        U.lIllIIllllIll[8] = -(0xFFFFCAF9 & 0x752F) & (0xFFFFD7FF & 0x6FBF);
        U.lIllIIllllIll[9] = -(0xFFFFF37E & 0x2CA5) & (0xFFFFE7BB & 0x3FFF);
        U.lIllIIllllIll[10] = "  ".length();
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
        WorldPoint llllllllllllllIllIIlIIIIllIIIlII;
        WorldPoint llllllllllllllIllIIlIIIIllIIIlIl;
        void llllllllllllllIllIIlIIIIllIIlIII;
        U llllllllllllllIllIIlIIIIllIIlIIl;
        NPC nPC = this.az.W();
        if (U.llIIIlllIIIllIl(nPC)) {
            return lIllIIllllIll[0];
        }
        if (U.llIIIlllIIIlllI(llllllllllllllIllIIlIIIIllIIlIIl.az.U() ? 1 : 0)) {
            return lIllIIllllIll[0];
        }
        int llllllllllllllIllIIlIIIIllIIIlll = llllllllllllllIllIIlIIIIllIIlIII.getOrientation() + Players.getLocal().getOrientation();
        WorldPoint llllllllllllllIllIIlIIIIllIIIllI = llllllllllllllIllIIlIIIIllIIlIIl.ai();
        if (U.llIIIlllIIIllll((Object)llllllllllllllIllIIlIIIIllIIlIIl.C(), (Object)k.MAGMA_CENTER_NW)) {
            llllllllllllllIllIIlIIIIllIIIlIl = llllllllllllllIllIIlIIIIllIIIllI.dx(lIllIIllllIll[1]).dy(lIllIIllllIll[2]);
            "".length();
            if (" ".length() > (3 + 99 - 27 + 72 ^ 98 + 20 - 117 + 150)) {
                return ((0x71 ^ 0x7C ^ (0x53 ^ 0x3E)) & (93 + 139 - 119 + 89 ^ 62 + 36 - 4 + 76 ^ -" ".length())) != 0;
            }
        } else {
            llllllllllllllIllIIlIIIIllIIIlIl = llllllllllllllIllIIlIIIIllIIIllI.dx(lIllIIllllIll[3]);
        }
        if (U.llIIIlllIIlIIII(Math.min((llllllllllllllIllIIlIIIIllIIIlII = Players.getLocal().getWorldLocation()).distanceTo(llllllllllllllIllIIlIIIIllIIIllI), llllllllllllllIllIIlIIIIllIIIlII.distanceTo(llllllllllllllIllIIlIIIIllIIIlIl)))) {
            if (U.llIIIlllIIIlllI(Players.getLocal().isMoving() ? 1 : 0)) {
                Movement.walkTo((WorldPoint)llllllllllllllIllIIlIIIIllIIIllI);
                "".length();
                return lIllIIllllIll[4];
            }
            return lIllIIllllIll[0];
        }
        if (U.llIIIlllIIIlllI(as.contains(llllllllllllllIllIIlIIIIllIIIlll) ? 1 : 0)) {
            llllllllllllllIllIIlIIIIllIIlIIl.at = llllllllllllllIllIIlIIIIllIIlIIl.aB.getTickCount() + lIllIIllllIll[4];
            return lIllIIllllIll[4];
        }
        if (U.llIIIlllIIlIIIl(llllllllllllllIllIIlIIIIllIIlIIl.aB.getTickCount() - llllllllllllllIllIIlIIIIllIIlIIl.at)) {
            return lIllIIllllIll[4];
        }
        llllllllllllllIllIIlIIIIllIIlIIl.sleep(Rand.nextInt((int)lIllIIllllIll[5], (int)lIllIIllllIll[6]));
        if (U.llIIIlllIIlIIlI(llllllllllllllIllIIlIIIIllIIIllI.equals((Object)llllllllllllllIllIIlIIIIllIIIlII) ? 1 : 0)) {
            Movement.walk((WorldPoint)llllllllllllllIllIIlIIIIllIIIlIl);
            "".length();
            if ("  ".length() < 0) {
                return ((0x1F ^ 0x11) & ~(0x56 ^ 0x58)) != 0;
            }
        } else {
            Movement.walk((WorldPoint)llllllllllllllIllIIlIIIIllIIIllI);
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

