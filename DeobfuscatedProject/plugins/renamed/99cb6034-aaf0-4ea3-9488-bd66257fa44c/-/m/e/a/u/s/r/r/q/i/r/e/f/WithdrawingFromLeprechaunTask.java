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

import -.m.e.a.u.s.r.r.q.i.r.e.f.KEnum;
import -.m.e.a.u.s.r.r.q.i.r.e.f.L_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.az_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.h_Unknown;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.util.Iterator;
import java.util.Map;
import net.runelite.api.Client;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/* TASK: Withdrawing from leprechaun -> WithdrawingfromleprechaunTask */
@TaskDesc(name="Withdrawing from leprechaun", priority=10, blocking=true)
public class WithdrawingFromLeprechaunTask
extends az_Unknown {
    private final /* synthetic */ h cB;
    private static /* synthetic */ int[] llIIIlIIlIlI;

    private static boolean llllIlIIIIlllI(int n2, int n3) {
        return n2 > n3;
    }

    public boolean run() {
        int var5;
        int n2;
        aT var1;
        if (aT.llllIlIIIIlIll(this.cB.K() ? 1 : 0)) {
            return llIIIlIIlIlI[0];
        }
        if (!aT.llllIlIIIIllII(var1.bR.v()) || aT.llllIlIIIIllIl((Object)var1.bR.v().aL(), (Object)P.GRAPES)) {
            return llIIIlIIlIlI[0];
        }
        Map<K, Integer> var4 = var1.bR.A();
        int[] nArray = new int[llIIIlIIlIlI[1]];
        nArray[aT.llIIIlIIlIlI[0]] = llIIIlIIlIlI[2];
        nArray[aT.llIIIlIIlIlI[3]] = llIIIlIIlIlI[4];
        nArray[aT.llIIIlIIlIlI[5]] = llIIIlIIlIlI[6];
        if (aT.llllIlIIIIlllI(Inventory.getCount((int[])nArray), llIIIlIIlIlI[7])) {
            n2 = llIIIlIIlIlI[3];
            0;
            if (-3 >= 0) {
                return false;
            }
        } else {
            n2 = var5 = llIIIlIIlIlI[0];
        }
        if (aT.llllIlIIIIllll(var4.isEmpty() ? 1 : 0) && aT.llllIlIIIIlIll(var5)) {
            return llIIIlIIlIlI[0];
        }
        if (aT.llllIlIIIIlIll(var1.cB.G() ? 1 : 0)) {
            if (aT.llllIlIIIIlIll(Movement.shouldWalk() ? 1 : 0)) {
                return llIIIlIIlIlI[3];
            }
            if (aT.llllIlIIIIllll(Inventory.contains(item -> L.bq.contains(item.getId())) ? 1 : 0)) {
                var1.cB.J();
                0;
                return llIIIlIIlIlI[3];
            }
            var1.cB.L();
            return llIIIlIIlIlI[3];
        }
        if (aT.llllIlIIIIllll(var5)) {
            var1.cB.g(K.ULTRA_COMPOST, llIIIlIIlIlI[8]);
            var1.cB.g(K.COMPOST, llIIIlIIlIlI[8]);
            var1.cB.g(K.SUPER_COMPOST, llIIIlIIlIlI[8]);
            return llIIIlIIlIlI[3];
        }
        int[] nArray2 = new int[llIIIlIIlIlI[3]];
        nArray2[aT.llIIIlIIlIlI[0]] = llIIIlIIlIlI[9];
        if (aT.llllIlIIIIllll(Inventory.contains((int[])nArray2) ? 1 : 0) && aT.llllIlIIIIlIll(var4.containsKey((Object)K.EMPTY_BUCKET) ? 1 : 0)) {
            var1.cB.g(K.EMPTY_BUCKET, llIIIlIIlIlI[8]);
            return llIIIlIIlIlI[3];
        }
        Iterator<K> var2 = var4.keySet().iterator();
        while (aT.llllIlIIIIllll(var2.hasNext() ? 1 : 0)) {
            K var3 = var2.next();
            var1.cB.h(var3, var4.get((Object)var3));
            0;
            if (2 != 0) continue;
            return false;
        }
        return llIIIlIIlIlI[3];
    }

    private static void llllIlIIIIlIlI() {
        llIIIlIIlIlI = new int[10];
        aT.llIIIlIIlIlI[0] = (0 ^ 0x36) & ~(0x42 ^ 0x74);
        aT.llIIIlIIlIlI[1] = 3;
        aT.llIIIlIIlIlI[2] = -(0xFFFF9E9D & 0x6D77) & (0xFFFFFFFF & 0x5FFF);
        aT.llIIIlIIlIlI[3] = 1;
        aT.llIIIlIIlIlI[4] = -(0xFFFFFD4B & 0x6AFE) & (0xFFFFFFDB & Short.MAX_VALUE);
        aT.llIIIlIIlIlI[5] = 2;
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

