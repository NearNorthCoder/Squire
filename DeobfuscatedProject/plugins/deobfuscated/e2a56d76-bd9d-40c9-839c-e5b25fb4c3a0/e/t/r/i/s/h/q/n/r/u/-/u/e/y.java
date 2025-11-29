/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import e.t.r.i.s.h.q.n.r.u.-.u.e.a;
import e.t.r.i.s.h.q.n.r.u.-.u.e.e;
import e.t.r.i.s.h.q.n.r.u.-.u.e.j;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Setting Pitfall Trap")
public class y
extends j {
    private static /* synthetic */ int[] lllIlllIllIl;
    private static /* synthetic */ String[] lllIlllIlIll;

    private static boolean lIIIllIllllIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIllIlllIllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIllIlllIlllI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean x() {
        void var1_1;
        int[] nArray = new int[lllIlllIllIl[0]];
        nArray[y.lllIlllIllIl[1]] = lllIlllIllIl[2];
        if (y.lIIIllIlllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lllIlllIllIl[1];
        }
        TileObject lllllllllllllllIIlIlllIIlIlIlIIl = TileObjects.getNearest(tileObject -> {
            int n2;
            if (y.lIIIllIlllIllll(lllIlllIlIll[lllIlllIllIl[0]].equalsIgnoreCase(tileObject.getName()) ? 1 : 0)) {
                String[] stringArray = new String[lllIlllIllIl[0]];
                stringArray[y.lllIlllIllIl[1]] = lllIlllIlIll[lllIlllIllIl[3]];
                if (y.lIIIllIlllIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIlllIllIl[0];
                    0;
                    if (null == null) return n2 != 0;
                    return ((0x3C ^ 5 ^ (0x5C ^ 0x2E)) & (0x9B ^ 0xB8 ^ (0xC0 ^ 0xA8) ^ -1)) != 0;
                }
            }
            n2 = lllIlllIllIl[1];
            return n2 != 0;
        });
        if (y.lIIIllIlllIlllI(lllllllllllllllIIlIlllIIlIlIlIIl)) {
            return lllIlllIllIl[1];
        }
        var1_1.interact(lllIlllIlIll[lllIlllIllIl[1]]);
        return lllIlllIllIl[0];
    }

    @Inject
    public y(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.PITFALL);
    }

    private static void lIIIllIlllIlIII() {
        lllIlllIlIll = new String[lllIlllIllIl[4]];
        y.lllIlllIlIll[y.lllIlllIllIl[1]] = y."Trap";
        y.lllIlllIlIll[y.lllIlllIllIl[0]] = y."Pit";
        y.lllIlllIlIll[y.lllIlllIllIl[3]] = y."Trap";
    }

    private static String lIIIllIlllIIllI(String lllllllllllllllIIlIlllIIlIIlIlll, String lllllllllllllllIIlIlllIIlIIllIll) {
        lllllllllllllllIIlIlllIIlIIlIlll = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlllIIlIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlllIIlIIllIlI = new StringBuilder();
        char[] lllllllllllllllIIlIlllIIlIIllIIl = lllllllllllllllIIlIlllIIlIIllIll.toCharArray();
        int lllllllllllllllIIlIlllIIlIIllIII = lllIlllIllIl[1];
        char[] lllllllllllllllIIlIlllIIlIIlIIlI = lllllllllllllllIIlIlllIIlIIlIlll.toCharArray();
        int lllllllllllllllIIlIlllIIlIIlIIIl = lllllllllllllllIIlIlllIIlIIlIIlI.length;
        int lllllllllllllllIIlIlllIIlIIlIIII = lllIlllIllIl[1];
        while (y.lIIIllIllllIIII(lllllllllllllllIIlIlllIIlIIlIIII, lllllllllllllllIIlIlllIIlIIlIIIl)) {
            char lllllllllllllllIIlIlllIIlIIlllIl = lllllllllllllllIIlIlllIIlIIlIIlI[lllllllllllllllIIlIlllIIlIIlIIII];
            lllllllllllllllIIlIlllIIlIIllIlI.append((char)(lllllllllllllllIIlIlllIIlIIlllIl ^ lllllllllllllllIIlIlllIIlIIllIIl[lllllllllllllllIIlIlllIIlIIllIII % lllllllllllllllIIlIlllIIlIIllIIl.length]));
            0;
            ++lllllllllllllllIIlIlllIIlIIllIII;
            ++lllllllllllllllIIlIlllIIlIIlIIII;
            0;
            if (-1 <= 2) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIlllIIlIIllIlI);
    }

    static {
        y.lIIIllIlllIllII();
        y.lIIIllIlllIlIII();
    }

    private static boolean lIIIllIlllIllll(int n2) {
        return n2 != 0;
    }

    private static void lIIIllIlllIllII() {
        lllIlllIllIl = new int[5];
        y.lllIlllIllIl[0] = 1;
        y.lllIlllIllIl[1] = (0x15 ^ 0x1D) & ~(0xB7 ^ 0xBF);
        y.lllIlllIllIl[2] = 0xFFFF87F7 & 0x7DEF;
        y.lllIlllIllIl[3] = 2;
        y.lllIlllIllIl[4] = 3;
    }
}

