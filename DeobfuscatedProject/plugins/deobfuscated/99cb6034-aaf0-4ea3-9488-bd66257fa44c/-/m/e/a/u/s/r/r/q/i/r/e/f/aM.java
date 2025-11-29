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

import -.m.e.a.u.s.r.r.q.i.r.e.f.N;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aN;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import -.m.e.a.u.s.r.r.q.i.r.e.f.au;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f;
import -.m.e.a.u.s.r.r.q.i.r.e.f.n;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Applying volcanic ash", priority=30, blocking=true)
public class aM
extends aN {
    private static /* synthetic */ int[] lIlllIlIlIlI;
    private static /* synthetic */ String[] lIlllIlIlIIl;

    private static void lllIllIIIlllIl() {
        lIlllIlIlIlI = new int[5];
        aM.lIlllIlIlIlI[0] = (114 + 145 - 174 + 66 ^ 119 + 122 - 67 + 7) & (29 + 13 - -62 + 58 ^ 15 + 44 - -66 + 3 ^ -1);
        aM.lIlllIlIlIlI[1] = 1;
        aM.lIlllIlIlIlI[2] = 0x67 ^ 0xB ^ (0x1F ^ 0x41);
        aM.lIlllIlIlIlI[3] = 0x4A ^ 0x53;
        aM.lIlllIlIlIlI[4] = -(0xFFFF8CDF & 0x7B29) & (0xFFFFFE7F & 0x5DFE);
    }

    private static boolean lllIllIIlIIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lllIllIIIllllI(int n2) {
        return n2 == 0;
    }

    private static boolean lllIllIIIlllll(Object object, Object object2) {
        return object == object2;
    }

    private static String lllIllIIIllIll(String lllllllllllllllIlIllIlIllIlIllIl, String lllllllllllllllIlIllIlIllIlIllII) {
        lllllllllllllllIlIllIlIllIlIllIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIlIllIlIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllIlIllIlIlIll = new StringBuilder();
        char[] lllllllllllllllIlIllIlIllIlIlIlI = lllllllllllllllIlIllIlIllIlIllII.toCharArray();
        int lllllllllllllllIlIllIlIllIlIlIIl = lIlllIlIlIlI[0];
        char[] lllllllllllllllIlIllIlIllIlIIIll = lllllllllllllllIlIllIlIllIlIllIl.toCharArray();
        int lllllllllllllllIlIllIlIllIlIIIlI = lllllllllllllllIlIllIlIllIlIIIll.length;
        int lllllllllllllllIlIllIlIllIlIIIIl = lIlllIlIlIlI[0];
        while (aM.lllIllIIlIIIll(lllllllllllllllIlIllIlIllIlIIIIl, lllllllllllllllIlIllIlIllIlIIIlI)) {
            char lllllllllllllllIlIllIlIllIlIlllI = lllllllllllllllIlIllIlIllIlIIIll[lllllllllllllllIlIllIlIllIlIIIIl];
            lllllllllllllllIlIllIlIllIlIlIll.append((char)(lllllllllllllllIlIllIlIllIlIlllI ^ lllllllllllllllIlIllIlIllIlIlIlI[lllllllllllllllIlIllIlIllIlIlIIl % lllllllllllllllIlIllIlIllIlIlIlI.length]));
            0;
            ++lllllllllllllllIlIllIlIllIlIlIIl;
            ++lllllllllllllllIlIllIlIllIlIIIIl;
            0;
            if (3 >= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIllIlIllIlIlIll);
    }

    @Inject
    public aM(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client);
    }

    private static boolean lllIllIIlIIIII(Object object, Object object2) {
        return object != object2;
    }

    private static void lllIllIIIlllII() {
        lIlllIlIlIIl = new String[lIlllIlIlIlI[1]];
        aM.lIlllIlIlIIl[aM.lIlllIlIlIlI[0]] = aM."Giant";
    }

    private static boolean lllIllIIlIIIIl(Object object) {
        return object == null;
    }

    static {
        aM.lllIllIIIlllIl();
        aM.lllIllIIIlllII();
    }

    private static boolean lllIllIIlIIIll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean b(TileObject tileObject) {
        void lllllllllllllllIlIllIlIllIlllIll;
        int lllllllllllllllIlIllIlIllIlllIlI;
        int n2;
        void lllllllllllllllIlIllIlIllIllllII;
        Item item2 = Inventory.getFirst(item -> {
            boolean bl;
            if (aM.lllIllIIlIIlII(item.getId(), lIlllIlIlIlI[4])) {
                bl = lIlllIlIlIlI[1];
                0;
                if ((0x23 ^ 0x27) <= ((0x78 ^ 0x5D) & ~(0x71 ^ 0x54))) {
                    return ((0xC9 ^ 0x81) & ~(0xFB ^ 0xB3)) != 0;
                }
            } else {
                bl = lIlllIlIlIlI[0];
            }
            return bl;
        });
        if (aM.lllIllIIlIIIIl(item2)) {
            return lIlllIlIlIlI[0];
        }
        if (aM.lllIllIIlIIIlI(lllllllllllllllIlIllIlIllIllllII.getName().contains(lIlllIlIlIIl[lIlllIlIlIlI[0]]) ? 1 : 0)) {
            n2 = lIlllIlIlIlI[2];
            0;
            if (null != null) {
                return ((22 + 8 - -25 + 101 ^ 118 + 38 - 1 + 27) & (0x95 ^ 0x93 ^ (0xEC ^ 0xC0) ^ -1)) != 0;
            }
        } else {
            n2 = lllllllllllllllIlIllIlIllIlllIlI = lIlllIlIlIlI[3];
        }
        if (aM.lllIllIIlIIIll(lllllllllllllllIlIllIlIllIlllIll.getQuantity(), lllllllllllllllIlIllIlIllIlllIlI)) {
            return lIlllIlIlIlI[0];
        }
        item2.useOn(tileObject);
        return lIlllIlIlIlI[1];
    }

    private static boolean lllIllIIlIIlII(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean I(N n2) {
        int n3;
        void lllllllllllllllIlIllIlIlllIIIIlI;
        if (aM.lllIllIIIllllI(this.bS.applyVolcanicAsh() ? 1 : 0)) {
            return lIlllIlIlIlI[0];
        }
        an lllllllllllllllIlIllIlIlllIIIIIl = lllllllllllllllIlIllIlIlllIIIIlI.aI();
        au lllllllllllllllIlIllIlIlllIIIIII = lllllllllllllllIlIllIlIlllIIIIIl.aY();
        if (aM.lllIllIIIlllll((Object)lllllllllllllllIlIllIlIlllIIIIIl.aZ(), (Object)n.HARVESTABLE) && (!aM.lllIllIIlIIIII((Object)lllllllllllllllIlIllIlIlllIIIIII, (Object)au.SUPERCOMPOST) || aM.lllIllIIIlllll((Object)lllllllllllllllIlIllIlIlllIIIIII, (Object)au.GIANT_SUPERCOMPOST))) {
            n3 = lIlllIlIlIlI[1];
            0;
            if (1 <= 0) {
                return ((0x27 ^ 0x49 ^ (0x37 ^ 0x6A)) & (82 + 58 - 72 + 80 ^ 71 + 45 - -24 + 27 ^ -1)) != 0;
            }
        } else {
            n3 = lIlllIlIlIlI[0];
        }
        return n3 != 0;
    }
}

