/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.items.Inventory
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.H;
import -.m.e.a.u.s.r.r.q.i.r.e.f.N;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aN;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import -.m.e.a.u.s.r.r.q.i.r.e.f.au;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f;
import -.m.e.a.u.s.r.r.q.i.r.e.f.n;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Harvesting the compost bin", priority=30, blocking=true)
public class aQ
extends aN {
    private static /* synthetic */ int[] lIllllIIlllI;

    private static boolean lllIlllIIlIllI(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public boolean b(TileObject tileObject) {
        Item lllllllllllllllIlIllIIlIlIIlIIll;
        Item item;
        if (aQ.lllIlllIIlIlll(this.bS.bottomless() ? 1 : 0)) {
            int[] nArray = new int[lIllllIIlllI[1]];
            nArray[aQ.lIllllIIlllI[0]] = lIllllIIlllI[2];
            item = Inventory.getFirst((int[])nArray);
            "".length();
            if ((0x3F ^ 0x3B) != (0x94 ^ 0x90)) {
                return ((0x5E ^ 0x61) & ~(0x8D ^ 0xB2)) != 0;
            }
        } else {
            int[] nArray = new int[lIllllIIlllI[1]];
            nArray[aQ.lIllllIIlllI[0]] = lIllllIIlllI[3];
            lllllllllllllllIlIllIIlIlIIlIIll = Inventory.getFirst((int[])nArray);
        }
        if (aQ.lllIlllIIllIII(lllllllllllllllIlIllIIlIlIIlIIll)) {
            return lIllllIIlllI[0];
        }
        item.useOn(tileObject);
        return lIllllIIlllI[1];
    }

    private static boolean lllIlllIIlIlII(Object object) {
        return object != null;
    }

    private static boolean lllIlllIIllIII(Object object) {
        return object == null;
    }

    private static boolean lllIlllIIlIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lllIlllIIlIlIl(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean I(N n2) {
        boolean bl;
        void lllllllllllllllIlIllIIlIlIIllIll;
        an an2 = n2.aI();
        au au2 = an2.aY();
        H h2 = H.c(au2);
        if (!aQ.lllIlllIIlIlII((Object)h2) || aQ.lllIlllIIlIlIl((Object)h2, (Object)this.bS.compostType())) {
            return lIllllIIlllI[0];
        }
        if (aQ.lllIlllIIlIllI((Object)lllllllllllllllIlIllIIlIlIIllIll.aZ(), (Object)n.HARVESTABLE)) {
            bl = lIllllIIlllI[1];
            "".length();
            if (((0x71 ^ 0x57 ^ (0x5E ^ 0x43)) & (0x64 ^ 0x2C ^ (0x48 ^ 0x3B) ^ -" ".length())) == "   ".length()) {
                return ((138 + 18 - 110 + 118 ^ 129 + 158 - 201 + 92) & (66 + 82 - 47 + 66 ^ 108 + 141 - 112 + 40 ^ -" ".length())) != 0;
            }
        } else {
            bl = lIllllIIlllI[0];
        }
        return bl;
    }

    static {
        aQ.lllIlllIIlIIll();
    }

    @Inject
    public aQ(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client);
    }

    private static void lllIlllIIlIIll() {
        lIllllIIlllI = new int[4];
        aQ.lIllllIIlllI[0] = (139 + 6 - -2 + 9 ^ 136 + 70 - 160 + 146) & (140 + 152 - 139 + 86 ^ 15 + 173 - 125 + 116 ^ -" ".length());
        aQ.lIllllIIlllI[1] = " ".length();
        aQ.lIllllIIlllI[2] = 0xFFFFFBFD & 0x5DD7;
        aQ.lIllllIIlllI[3] = 0xFFFFBFDF & 0x47A5;
    }
}

