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
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.HEnum;
import -.m.e.a.u.s.r.r.q.i.r.e.f.KEnum;
import -.m.e.a.u.s.r.r.q.i.r.e.f.L_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.N_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aN_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.h_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.NEnum;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;

/* TASK: Getting more buckets -> GettingmorebucketsTask */
@TaskDesc(name="Getting more buckets", priority=35, blocking=true)
public class GettingMoreBucketsTask
extends aN_Unknown {
    private /* synthetic */ int cA;
    private static /* synthetic */ int[] lIllllIIIIII;
    private final /* synthetic */ h cz;

    private static void lllIllIlIllIII() {
        lIllllIIIIII = new int[5];
        aP.lIllllIIIIII[0] = (0x2F ^ 5) & ~(0xA9 ^ 0x83);
        aP.lIllllIIIIII[1] = 1;
        aP.lIllllIIIIII[2] = 0xFFFFDBDF & 0x7DF5;
        aP.lIllllIIIIII[3] = 0xFFFFBFE7 & 0x479D;
        aP.lIllllIIIIII[4] = 0xFFFFFFFF & Integer.MAX_VALUE;
    }

    private static boolean lllIllIlIllIll(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean I(N n2) {
        aP var1;
        void var4;
        an an2 = n2.aI();
        if (aP.lllIllIlIllIIl(an2)) {
            return lIllllIIIIII[0];
        }
        au var5 = var4.aY();
        H var2 = H.c(var5);
        if (!aP.lllIllIlIllIlI((Object)var2) || aP.lllIllIlIllIll((Object)var2, (Object)var1.bS.compostType())) {
            return lIllllIIIIII[0];
        }
        if (aP.lllIllIlIlllII((Object)var4.aZ(), (Object)n.HARVESTABLE)) {
            var1.cA = var4.bb();
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
        aP var3;
        int n2;
        int[] nArray = new int[lIllllIIIIII[1]];
        if (aP.lllIllIlIlllIl(this.bS.bottomless() ? 1 : 0)) {
            n2 = lIllllIIIIII[2];
            0;
            if (-(0xAC ^ 0xA9) >= 0) {
                return false;
            }
        } else {
            n2 = nArray[aP.lIllllIIIIII[0]] = lIllllIIIIII[3];
        }
        if (aP.lllIllIlIlllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIllllIIIIII[0];
        }
        NPC var6 = var3.cz.I();
        if (aP.lllIllIlIllIIl(var6)) {
            return lIllllIIIIII[0];
        }
        if (aP.lllIllIlIlllIl(var3.cz.G() ? 1 : 0)) {
            K k2;
            var3.cz.g(K.ULTRA_COMPOST, lIllllIIIIII[4]);
            var3.cz.g(K.SUPER_COMPOST, lIllllIIIIII[4]);
            h h2 = var3.cz;
            if (aP.lllIllIlIlllIl(var3.bS.bottomless() ? 1 : 0)) {
                k2 = K.BOTTOMLESS_BUCKET;
                0;
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
            var3.cz.J();
            0;
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
    public aP(f f2, SquireFarmerConfig squireFarmerConfig, Client client, h h2) {
        super(f2, squireFarmerConfig, client);
        this.cz = h2;
    }

    private static boolean lllIllIlIlllII(Object object, Object object2) {
        return object == object2;
    }
}

