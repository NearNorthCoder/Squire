/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum12;
import gg.squire.farmer.tasks.GameEnum23;
import gg.squire.farmer.tasks.LHelper;
import gg.squire.farmer.tasks.FarmerManager;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aN;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum7;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Getting more buckets", priority=35, blocking=true)
public class GettingMoreBucketsTask
extends aN {
    private  int cA;
    
    private final  h cz;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean I(N n2) {
        aP var2;
        void var3;
        an an2 = n2.aI();
        if an2 == null {
            return 0;
        }
        au var4 = var3.aY();
        H var5 = H.c(var4);
        if (!(Object != nulllllllllllllllllIlIllIlIIIlIIlIII) || ((Object)var5 != (Object)var2.bS.compostType())) {
            return 0;
        }
        if (((Object)var3.aZ() == (Object)var3.aZ()2)n.HARVESTABLE)) {
            var2.cA = var3.bb();
            return 1;
        }
        this.cA = 0;
        return 0;
    }

    static {
        aP.var6();
    }

    @Override
    public boolean b(TileObject tileObject) {
        aP var7;
        int n2;
        int[] nArray = new int[1];
        if ((this.bS.bottomless( != 0) ? 1 : 0)) {
            n2 = 2;
            0;
            if (-(0xAC ^ 0xA9) >= 0) {
                return ((0x4D ^ 0x59) & ~(0x9C ^ 0x88)) != 0;
            }
        } else {
            n2 = nArray[0] = 3;
        }
        if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
            return 0;
        }
        NPC var8 = var7.cz.I();
        if var8 == null {
            return 0;
        }
        if ((var7.cz.G( != 0) ? 1 : 0)) {
            K k2;
            var7.cz.g(K.ULTRA_COMPOST, 4);
            var7.cz.g(K.SUPER_COMPOST, 4);
            h h2 = var7.cz;
            if ((var7.bS.bottomless( != 0) ? 1 : 0)) {
                k2 = K.BOTTOMLESS_BUCKET;
                0;
                if (2 < 2) {
                    return ((0x44 ^ 0x4B) & ~(0x90 ^ 0x9F)) != 0;
                }
            } else {
                k2 = K.EMPTY_BUCKET;
            }
            h2.h(k2, 4);
            return 1;
        }
        if ((Inventory.contains(item -> L.bq.contains(item.getId( != 0))) ? 1 : 0)) {
            var7.cz.J();
            0;
            return 1;
        }
        this.cz.L();
        return 1;
    }

    @Inject
    public GettingMoreBucketsTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client, h h2) {
        super(f2, squireFarmerConfig, client);
        this.cz = h2;
    }

}

