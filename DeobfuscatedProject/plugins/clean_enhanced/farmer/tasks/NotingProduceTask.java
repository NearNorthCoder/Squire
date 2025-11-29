/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.LHelper;
import -.m.e.a.u.s.r.r.q.i.r.e.f.az;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.FarmerManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Noting produce", priority=20, blocking=true)
public class NotingProduceTask
extends az {
    
    private final  h cR;
    private  boolean cS;

    static {
        be.var2();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        int n2;
        be var3;
        void var4;
        WorldPoint worldPoint = this.bR.u();
        if ((Inventory.contains(item -> L.bq.contains(item.getId( == 0))) ? 1 : 0)) {
            this.cS = 0;
            0;
            if (((0xAA ^ 0x8A) & ~(0x72 ^ 0x52)) == -1) {
                return ((0xD9 ^ 0x94) & ~(1 ^ 0x4C)) != 0;
            }
        } else if (!(Inventory.isFull( == 0) ? 1 : 0) || !var4 != null || (var4.isInScene(var3.bT == 0) ? 1 : 0)) {
            var3.cS = 1;
        }
        if ((var3.cR.K( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var3.cS != 0) && (var3.cR.J( != 0) ? 1 : 0)) {
            n2 = 1;
            0;
            if (-1 > 1) {
                return ((0xEB ^ 0xA3 ^ (0x36 ^ 0x38)) & (68 + 124 - 98 + 155 ^ 68 + 121 - 86 + 88 ^ -1)) != 0;
            }
        } else {
            n2 = 0;
        }
        return n2 != 0;
    }

    @Inject
    public NotingProduceTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client, h h2) {
        super(f2, squireFarmerConfig, client);
        this.cR = h2;
    }

}

