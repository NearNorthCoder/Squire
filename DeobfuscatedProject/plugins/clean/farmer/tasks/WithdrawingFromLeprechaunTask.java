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
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum63;
import -.m.e.a.u.s.r.r.q.i.r.e.f.L;
import gg.squire.farmer.tasks.GameEnum19;
import gg.squire.farmer.tasks.FarmerTaskBase;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.FarmerManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.util.Iterator;
import java.util.Map;
import net.runelite.api.Client;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Withdrawing from leprechaun", priority=10, blocking=true)
public class WithdrawingFromLeprechaunTask
extends FarmerTaskBase {
    private final  h cB;

    private static boolean llllIlIIIIlllI(int n2, int n3) {
        return n2 > n3;
    }

    public boolean run() {
        int var1;
        int n2;
        aT var2;
        if (aT.llllIlIIIIlIll(this.cB.K() ? 1 : 0)) {
            return llIIIlIIlIlI[0];
        }
        if (!aT.llllIlIIIIllII(var2.bR.v()) || aT.llllIlIIIIllIl((Object)var2.bR.v().aL(), (Object)P.GRAPES)) {
            return llIIIlIIlIlI[0];
        }
        Map<K, Integer> var3 = var2.bR.A();
        int[] nArray = new int[llIIIlIIlIlI[1]];
        nArray[aT.llIIIlIIlIlI[0]] = llIIIlIIlIlI[2];
        nArray[aT.llIIIlIIlIlI[3]] = llIIIlIIlIlI[4];
        nArray[aT.llIIIlIIlIlI[5]] = llIIIlIIlIlI[6];
        if (aT.llllIlIIIIlllI(Inventory.getCount((int[])nArray), llIIIlIIlIlI[7])) {
            n2 = llIIIlIIlIlI[3];

        } else {
            n2 = var1 = llIIIlIIlIlI[0];
        }
        if (aT.llllIlIIIIllll(var3.isEmpty() ? 1 : 0) && aT.llllIlIIIIlIll(var1)) {
            return llIIIlIIlIlI[0];
        }
        if (aT.llllIlIIIIlIll(var2.cB.G() ? 1 : 0)) {
            if (aT.llllIlIIIIlIll(Movement.shouldWalk() ? 1 : 0)) {
                return llIIIlIIlIlI[3];
            }
            if (aT.llllIlIIIIllll(Inventory.contains(item -> L.bq.contains(item.getId())) ? 1 : 0)) {
                var2.cB.J();

                return llIIIlIIlIlI[3];
            }
            var2.cB.L();
            return llIIIlIIlIlI[3];
        }
        if (aT.llllIlIIIIllll(var1)) {
            var2.cB.g(K.ULTRA_COMPOST, llIIIlIIlIlI[8]);
            var2.cB.g(K.COMPOST, llIIIlIIlIlI[8]);
            var2.cB.g(K.SUPER_COMPOST, llIIIlIIlIlI[8]);
            return llIIIlIIlIlI[3];
        }
        int[] nArray2 = new int[llIIIlIIlIlI[3]];
        nArray2[aT.llIIIlIIlIlI[0]] = llIIIlIIlIlI[9];
        if (aT.llllIlIIIIllll(Inventory.contains((int[])nArray2) ? 1 : 0) && aT.llllIlIIIIlIll(var3.containsKey((Object)K.EMPTY_BUCKET) ? 1 : 0)) {
            var2.cB.g(K.EMPTY_BUCKET, llIIIlIIlIlI[8]);
            return llIIIlIIlIlI[3];
        }
        Iterator<K> var4 = var3.keySet().iterator();
        while (aT.llllIlIIIIllll(var4.hasNext() ? 1 : 0)) {
            K var5 = var4.next();
            var2.cB.h(var5, var3.get((Object)var5));

            if (2 != 0) continue;
            return false;
        }
        return llIIIlIIlIlI[3];
    }

    private static boolean llllIlIIIIlIll(int n2) {
        return n2 == 0;
    }

    @Inject
    public WithdrawingFromLeprechaunTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client, h h2) {
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

