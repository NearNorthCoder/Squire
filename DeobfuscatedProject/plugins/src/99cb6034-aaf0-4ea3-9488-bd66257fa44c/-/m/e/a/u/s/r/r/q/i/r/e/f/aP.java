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

import -.m.e.a.u.s.r.r.q.i.r.e.f.H;
import -.m.e.a.u.s.r.r.q.i.r.e.f.K;
import -.m.e.a.u.s.r.r.q.i.r.e.f.L;
import -.m.e.a.u.s.r.r.q.i.r.e.f.N;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aN;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import -.m.e.a.u.s.r.r.q.i.r.e.f.au;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f;
import -.m.e.a.u.s.r.r.q.i.r.e.f.h;
import -.m.e.a.u.s.r.r.q.i.r.e.f.n;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Getting more buckets", priority=35, blocking=true)
public class aP
extends aN {
    private /* synthetic */ int cA;
    private static /* synthetic */ int[] lIllllIIIIII;
    private final /* synthetic */ h cz;

    private static void lllIllIlIllIII() {
        lIllllIIIIII = new int[5];
        aP.lIllllIIIIII[0] = (0x2F ^ 5) & ~(0xA9 ^ 0x83);
        aP.lIllllIIIIII[1] = " ".length();
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
        aP lllllllllllllllIlIllIlIIIlIIllII;
        void lllllllllllllllIlIllIlIIIlIIlIlI;
        an an2 = n2.aI();
        if (aP.lllIllIlIllIIl(an2)) {
            return lIllllIIIIII[0];
        }
        au lllllllllllllllIlIllIlIIIlIIlIIl = lllllllllllllllIlIllIlIIIlIIlIlI.aY();
        H lllllllllllllllIlIllIlIIIlIIlIII = H.c(lllllllllllllllIlIllIlIIIlIIlIIl);
        if (!aP.lllIllIlIllIlI((Object)lllllllllllllllIlIllIlIIIlIIlIII) || aP.lllIllIlIllIll((Object)lllllllllllllllIlIllIlIIIlIIlIII, (Object)lllllllllllllllIlIllIlIIIlIIllII.bS.compostType())) {
            return lIllllIIIIII[0];
        }
        if (aP.lllIllIlIlllII((Object)lllllllllllllllIlIllIlIIIlIIlIlI.aZ(), (Object)n.HARVESTABLE)) {
            lllllllllllllllIlIllIlIIIlIIllII.cA = lllllllllllllllIlIllIlIIIlIIlIlI.bb();
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
        aP lllllllllllllllIlIllIlIIIlIIIlIl;
        int n2;
        int[] nArray = new int[lIllllIIIIII[1]];
        if (aP.lllIllIlIlllIl(this.bS.bottomless() ? 1 : 0)) {
            n2 = lIllllIIIIII[2];
            "".length();
            if (-(0xAC ^ 0xA9) >= 0) {
                return ((0x4D ^ 0x59) & ~(0x9C ^ 0x88)) != 0;
            }
        } else {
            n2 = nArray[aP.lIllllIIIIII[0]] = lIllllIIIIII[3];
        }
        if (aP.lllIllIlIlllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIllllIIIIII[0];
        }
        NPC lllllllllllllllIlIllIlIIIlIIIlII = lllllllllllllllIlIllIlIIIlIIIlIl.cz.I();
        if (aP.lllIllIlIllIIl(lllllllllllllllIlIllIlIIIlIIIlII)) {
            return lIllllIIIIII[0];
        }
        if (aP.lllIllIlIlllIl(lllllllllllllllIlIllIlIIIlIIIlIl.cz.G() ? 1 : 0)) {
            K k2;
            lllllllllllllllIlIllIlIIIlIIIlIl.cz.g(K.ULTRA_COMPOST, lIllllIIIIII[4]);
            lllllllllllllllIlIllIlIIIlIIIlIl.cz.g(K.SUPER_COMPOST, lIllllIIIIII[4]);
            h h2 = lllllllllllllllIlIllIlIIIlIIIlIl.cz;
            if (aP.lllIllIlIlllIl(lllllllllllllllIlIllIlIIIlIIIlIl.bS.bottomless() ? 1 : 0)) {
                k2 = K.BOTTOMLESS_BUCKET;
                "".length();
                if ("  ".length() < "  ".length()) {
                    return ((0x44 ^ 0x4B) & ~(0x90 ^ 0x9F)) != 0;
                }
            } else {
                k2 = K.EMPTY_BUCKET;
            }
            h2.h(k2, lIllllIIIIII[4]);
            return lIllllIIIIII[1];
        }
        if (aP.lllIllIlIlllIl(Inventory.contains(item -> L.bq.contains(item.getId())) ? 1 : 0)) {
            lllllllllllllllIlIllIlIIIlIIIlIl.cz.J();
            "".length();
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

