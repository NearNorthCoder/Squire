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

import gg.squire.farmer.tasks.GameEnum23;
import gg.squire.farmer.tasks.LHelper;
import gg.squire.farmer.tasks.GameEnum10;
import -.m.e.a.u.s.r.r.q.i.r.e.f.az;
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
extends az {
    private final  h cB;

    public boolean run() {
        int var2;
        int n2;
        aT var3;
        if ((this.cB.K( == 0) ? 1 : 0)) {
            return 0;
        }
        if (!(var3.bR.v( != null)) || ((Object)var3.bR.v().aL() == (Object)var3.bR.v().aL()2)P.GRAPES)) {
            return 0;
        }
        Map<K, Integer> var4 = var3.bR.A();
        int[] nArray = new int[1];
        nArray[0] = 2;
        nArray[3] = 4;
        nArray[5] = 6;
        if ((Inventory.getCount((int[])nArray) > 7)) {
            n2 = 3;
            0;
            if (-3 >= 0) {
                return ((0x77 ^ 0x24) & ~(0xC3 ^ 0x90)) != 0;
            }
        } else {
            n2 = var2 = 0;
        }
        if ((var4.isEmpty( != 0) ? 1 : 0) && (var2 == 0)) {
            return 0;
        }
        if ((var3.cB.G( == 0) ? 1 : 0)) {
            if ((Movement.shouldWalk( == 0) ? 1 : 0)) {
                return 3;
            }
            if ((Inventory.contains(item -> L.bq.contains(item.getId( != 0))) ? 1 : 0)) {
                var3.cB.J();
                0;
                return 3;
            }
            var3.cB.L();
            return 3;
        }
        if var2 {
            var3.cB.g(K.ULTRA_COMPOST, 8);
            var3.cB.g(K.COMPOST, 8);
            var3.cB.g(K.SUPER_COMPOST, 8);
            return 3;
        }
        int[] nArray2 = new int[3];
        nArray2[0] = 9;
        if ((Inventory.contains((int[] != 0)nArray2) ? 1 : 0) && (var4.containsKey((Object == 0)K.EMPTY_BUCKET) ? 1 : 0)) {
            var3.cB.g(K.EMPTY_BUCKET, 8);
            return 3;
        }
        Iterator<K> var5 = var4.keySet().iterator();
        while ((var5.hasNext( != 0) ? 1 : 0)) {
            K var6 = var5.next();
            var3.cB.h(var6, var4.get((Object)var6));
            0;
            if (2 != 0) continue;
            return ((0x37 ^ 0x38) & ~(0x6A ^ 0x65)) != 0;
        }
        return 3;
    }

    @Inject
    public WithdrawingFromLeprechaunTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client, h h2) {
        super(f2, squireFarmerConfig, client);
        this.cB = h2;
    }

    static {
        aT.var7();
    }

}

