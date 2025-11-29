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

import -.m.e.a.u.s.r.r.q.i.r.e.f.L;
import gg.squire.farmer.tasks.FarmerTaskBase;
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
extends FarmerTaskBase {
    
    private final  h cR;
    private  boolean cS;

    private static boolean llllIIIlllIIlI(int n2) {
        return n2 == 0;
    }

    static {
        be.llllIIIlllIIIl();
    }

    private static boolean llllIIIlllIlII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        int n2;
        be var1;
        void var2;
        WorldPoint worldPoint = this.bR.u();
        if (be.llllIIIlllIIlI(Inventory.contains(item -> L.bq.contains(item.getId())) ? 1 : 0)) {
            this.cS = llIIIIIlllII[0];

            if (((0xAA ^ 0x8A) & ~(0x72 ^ 0x52)) == -1) {
                return false;
            }
        } else if (!be.llllIIIlllIIlI(Inventory.isFull() ? 1 : 0) || !be.llllIIIlllIIll(var2) || be.llllIIIlllIIlI(var2.isInScene(var1.bT) ? 1 : 0)) {
            var1.cS = llIIIIIlllII[1];
        }
        if (be.llllIIIlllIIlI(var1.cR.K() ? 1 : 0)) {
            return llIIIIIlllII[0];
        }
        if (be.llllIIIlllIlII(var1.cS ? 1 : 0) && be.llllIIIlllIlII(var1.cR.J() ? 1 : 0)) {
            n2 = llIIIIIlllII[1];

            if (-1 > 1) {
                return ((0xEB ^ 0xA3 ^ (0x36 ^ 0x38)) & (68 + 124 - 98 + 155 ^ 68 + 121 - 86 + 88 ^ -1)) != 0;
            }
        } else {
            n2 = llIIIIIlllII[0];
        }
        return n2 != 0;
    }

    @Inject
    public NotingProduceTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client, h h2) {
        super(f2, squireFarmerConfig, client);
        this.cR = h2;
    }

    private static boolean llllIIIlllIIll(Object object) {
        return object != null;
    }
}

