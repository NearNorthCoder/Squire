/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.K;
import -.m.e.a.u.s.r.r.q.i.r.e.f.L;
import -.m.e.a.u.s.r.r.q.i.r.e.f.P;
import -.m.e.a.u.s.r.r.q.i.r.e.f.az;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f;
import -.m.e.a.u.s.r.r.q.i.r.e.f.h;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.util.Iterator;
import java.util.Map;
import net.runelite.api.Client;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Withdrawing from leprechaun", priority=10, blocking=true)
public class aT
extends az {
    private final /* synthetic */ h cB;
    private static /* synthetic */ int[] llIIIlIIlIlI;

    private static boolean llllIlIIIIlllI(int n2, int n3) {
        return n2 > n3;
    }

    public boolean run() {
        int lllllllllllllllIlIlIlIIIlIlIllIl;
        int n2;
        aT lllllllllllllllIlIlIlIIIlIlIllll;
        if (aT.llllIlIIIIlIll(this.cB.K() ? 1 : 0)) {
            return llIIIlIIlIlI[0];
        }
        if (!aT.llllIlIIIIllII(lllllllllllllllIlIlIlIIIlIlIllll.bR.v()) || aT.llllIlIIIIllIl((Object)lllllllllllllllIlIlIlIIIlIlIllll.bR.v().aL(), (Object)P.GRAPES)) {
            return llIIIlIIlIlI[0];
        }
        Map<K, Integer> lllllllllllllllIlIlIlIIIlIlIlllI = lllllllllllllllIlIlIlIIIlIlIllll.bR.A();
        int[] nArray = new int[llIIIlIIlIlI[1]];
        nArray[aT.llIIIlIIlIlI[0]] = llIIIlIIlIlI[2];
        nArray[aT.llIIIlIIlIlI[3]] = llIIIlIIlIlI[4];
        nArray[aT.llIIIlIIlIlI[5]] = llIIIlIIlIlI[6];
        if (aT.llllIlIIIIlllI(Inventory.getCount((int[])nArray), llIIIlIIlIlI[7])) {
            n2 = llIIIlIIlIlI[3];
            "".length();
            if (-"   ".length() >= 0) {
                return ((0x77 ^ 0x24) & ~(0xC3 ^ 0x90)) != 0;
            }
        } else {
            n2 = lllllllllllllllIlIlIlIIIlIlIllIl = llIIIlIIlIlI[0];
        }
        if (aT.llllIlIIIIllll(lllllllllllllllIlIlIlIIIlIlIlllI.isEmpty() ? 1 : 0) && aT.llllIlIIIIlIll(lllllllllllllllIlIlIlIIIlIlIllIl)) {
            return llIIIlIIlIlI[0];
        }
        if (aT.llllIlIIIIlIll(lllllllllllllllIlIlIlIIIlIlIllll.cB.G() ? 1 : 0)) {
            if (aT.llllIlIIIIlIll(Movement.shouldWalk() ? 1 : 0)) {
                return llIIIlIIlIlI[3];
            }
            if (aT.llllIlIIIIllll(Inventory.contains(item -> L.bq.contains(item.getId())) ? 1 : 0)) {
                lllllllllllllllIlIlIlIIIlIlIllll.cB.J();
                "".length();
                return llIIIlIIlIlI[3];
            }
            lllllllllllllllIlIlIlIIIlIlIllll.cB.L();
            return llIIIlIIlIlI[3];
        }
        if (aT.llllIlIIIIllll(lllllllllllllllIlIlIlIIIlIlIllIl)) {
            lllllllllllllllIlIlIlIIIlIlIllll.cB.g(K.ULTRA_COMPOST, llIIIlIIlIlI[8]);
            lllllllllllllllIlIlIlIIIlIlIllll.cB.g(K.COMPOST, llIIIlIIlIlI[8]);
            lllllllllllllllIlIlIlIIIlIlIllll.cB.g(K.SUPER_COMPOST, llIIIlIIlIlI[8]);
            return llIIIlIIlIlI[3];
        }
        int[] nArray2 = new int[llIIIlIIlIlI[3]];
        nArray2[aT.llIIIlIIlIlI[0]] = llIIIlIIlIlI[9];
        if (aT.llllIlIIIIllll(Inventory.contains((int[])nArray2) ? 1 : 0) && aT.llllIlIIIIlIll(lllllllllllllllIlIlIlIIIlIlIlllI.containsKey((Object)K.EMPTY_BUCKET) ? 1 : 0)) {
            lllllllllllllllIlIlIlIIIlIlIllll.cB.g(K.EMPTY_BUCKET, llIIIlIIlIlI[8]);
            return llIIIlIIlIlI[3];
        }
        Iterator<K> lllllllllllllllIlIlIlIIIlIlIllII = lllllllllllllllIlIlIlIIIlIlIlllI.keySet().iterator();
        while (aT.llllIlIIIIllll(lllllllllllllllIlIlIlIIIlIlIllII.hasNext() ? 1 : 0)) {
            K lllllllllllllllIlIlIlIIIlIlIlIll = lllllllllllllllIlIlIlIIIlIlIllII.next();
            lllllllllllllllIlIlIlIIIlIlIllll.cB.h(lllllllllllllllIlIlIlIIIlIlIlIll, lllllllllllllllIlIlIlIIIlIlIlllI.get((Object)lllllllllllllllIlIlIlIIIlIlIlIll));
            "".length();
            if ("  ".length() != 0) continue;
            return ((0x37 ^ 0x38) & ~(0x6A ^ 0x65)) != 0;
        }
        return llIIIlIIlIlI[3];
    }

    private static void llllIlIIIIlIlI() {
        llIIIlIIlIlI = new int[10];
        aT.llIIIlIIlIlI[0] = (0 ^ 0x36) & ~(0x42 ^ 0x74);
        aT.llIIIlIIlIlI[1] = "   ".length();
        aT.llIIIlIIlIlI[2] = -(0xFFFF9E9D & 0x6D77) & (0xFFFFFFFF & 0x5FFF);
        aT.llIIIlIIlIlI[3] = " ".length();
        aT.llIIIlIIlIlI[4] = -(0xFFFFFD4B & 0x6AFE) & (0xFFFFFFDB & Short.MAX_VALUE);
        aT.llIIIlIIlIlI[5] = "  ".length();
        aT.llIIIlIIlIlI[6] = -(0xFFFFEF9D & 0x386E) & (0xFFFFFFDF & 0x3FBB);
        aT.llIIIlIIlIlI[7] = 0x61 ^ 0x20 ^ (0x72 ^ 0x37);
        aT.llIIIlIIlIlI[8] = 0xFFFFFFFF & Integer.MAX_VALUE;
        aT.llIIIlIIlIlI[9] = 0xFFFF879D & 0x7FE7;
    }

    private static boolean llllIlIIIIlIll(int n2) {
        return n2 == 0;
    }

    @Inject
    public aT(f f2, SquireFarmerConfig squireFarmerConfig, Client client, h h2) {
        super(f2, squireFarmerConfig, client);
        this.cB = h2;
    }

    private static boolean llllIlIIIIllIl(Object object, Object object2) {
        return object == object2;
    }

    static {
        aT.llllIlIIIIlIlI();
    }

    private static boolean llllIlIIIIllII(Object object) {
        return object != null;
    }

    private static boolean llllIlIIIIllll(int n2) {
        return n2 != 0;
    }
}

