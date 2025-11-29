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

import gg.squire.farmer.tasks.GameEnum23;
import gg.squire.farmer.tasks.GameEnum63;
import -.m.e.a.u.s.r.r.q.i.r.e.f.L;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.FarmerTaskBase;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum13;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Getting more buckets", priority=35, blocking=true)
public class GettingMoreBucketsTask
extends FarmerTaskBase {
    private  int cA;
    
    private final  h cz;

    private static boolean lllIllIlIllIll(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean I(N n2) {
        aP var1;
        void var2;
        an an2 = n2.aI();
        if (aP.lllIllIlIllIIl(an2)) {
            return lIllllIIIIII[0];
        }
        au var3 = var2.aY();
        H var4 = H.c(var3);
        if (!aP.lllIllIlIllIlI((Object)var4) || aP.lllIllIlIllIll((Object)var4, (Object)var1.bS.compostType())) {
            return lIllllIIIIII[0];
        }
        if (aP.lllIllIlIlllII((Object)var2.aZ(), (Object)n.HARVESTABLE)) {
            var1.cA = var2.bb();
            return lIllllIIIIII[1];
        }
        this.cA = lIllllIIIIII[0];
        return lIllllIIIIII[0];
    }

    static {
        aP.lllIllIlIllIII();
    }

    @Override
    public boolean b(TileObject tileObject) {
        aP var5;
        int n2;
        int[] nArray = new int[lIllllIIIIII[1]];
        if (aP.lllIllIlIlllIl(this.bS.bottomless() ? 1 : 0)) {
            n2 = lIllllIIIIII[2];

            if (-(0xAC ^ 0xA9) >= 0) {
                return false;
            }
        } else {
            n2 = nArray[aP.lIllllIIIIII[0]] = lIllllIIIIII[3];
        }
        if (aP.lllIllIlIlllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIllllIIIIII[0];
        }
        NPC var6 = var5.cz.I();
        if (aP.lllIllIlIllIIl(var6)) {
            return lIllllIIIIII[0];
        }
        if (aP.lllIllIlIlllIl(var5.cz.G() ? 1 : 0)) {
            K k2;
            var5.cz.g(K.ULTRA_COMPOST, lIllllIIIIII[4]);
            var5.cz.g(K.SUPER_COMPOST, lIllllIIIIII[4]);
            h h2 = var5.cz;
            if (aP.lllIllIlIlllIl(var5.bS.bottomless() ? 1 : 0)) {
                k2 = K.BOTTOMLESS_BUCKET;

                if (2 < 2) {
                    return false;
                }
            } else {
                k2 = K.EMPTY_BUCKET;
            }
            h2.h(k2, lIllllIIIIII[4]);
            return lIllllIIIIII[1];
        }
        if (aP.lllIllIlIlllIl(Inventory.contains(item -> L.bq.contains(item.getId())) ? 1 : 0)) {
            var5.cz.J();

            return lIllllIIIIII[1];
        }
        this.cz.L();
        return lIllllIIIIII[1];
    }

    private static boolean lllIllIlIllIlI(Object object) {
        return object != null;
    }

    private static boolean lllIllIlIllIIl(Object object) {
        return object == null;
    }

    private static boolean lllIllIlIlllIl(int n2) {
        return n2 != 0;
    }

    @Inject
    public GettingMoreBucketsTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client, h h2) {
        super(f2, squireFarmerConfig, client);
        this.cz = h2;
    }

    private static boolean lllIllIlIlllII(Object object, Object object2) {
        return object == object2;
    }
}

