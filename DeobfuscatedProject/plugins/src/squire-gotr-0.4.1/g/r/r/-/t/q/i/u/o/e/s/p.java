/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package g.r.r.-.t.q.i.u.o.e.s;

import g.r.r.-.t.q.i.u.o.e.s.c;
import g.r.r.-.t.q.i.u.o.e.s.h;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Crafting runes", priority=5, blocking=true)
public class p
extends h {
    private static /* synthetic */ String[] llIIllllllIl;
    private static /* synthetic */ int[] llIIlllllllI;

    private static boolean llllllllllIlIl(int n2) {
        return n2 <= 0;
    }

    static {
        p.llllllllllIlII();
        p.llllllllllIIIl();
    }

    private static boolean llllllllllIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lllllllllllIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        void var2_2;
        p lllllllllllllllIlIIlIlIllllIlIll;
        int lllllllllllllllIlIIlIlIllllIlIlI;
        int n2;
        int[] nArray = new int[llIIlllllllI[2]];
        nArray[p.llIIlllllllI[1]] = llIIlllllllI[3];
        if (!p.llllllllllIlIl(Inventory.getCount((int[])nArray)) || p.llllllllllIllI(this.aV.S(), Static.getClient().getTickCount())) {
            n2 = llIIlllllllI[2];
            "".length();
            if (" ".length() < 0) {
                return ((187 + 68 - 215 + 171 ^ 9 + 69 - 77 + 138) & (0xD0 ^ 0xA9 ^ (0x14 ^ 0x35) ^ -" ".length())) != 0;
            }
        } else {
            n2 = llIIlllllllI[1];
        }
        if (!p.llllllllllIlll(lllllllllllllllIlIIlIlIllllIlIlI = n2) || p.llllllllllIlll(lllllllllllllllIlIIlIlIllllIlIll.aV.g() ? 1 : 0)) {
            return llIIlllllllI[1];
        }
        String[] stringArray = new String[llIIlllllllI[2]];
        stringArray[p.llIIlllllllI[1]] = llIIllllllIl[llIIlllllllI[1]];
        TileObject lllllllllllllllIlIIlIlIllllIlIIl = TileObjects.getNearest((String[])stringArray);
        if (p.lllllllllllIII(lllllllllllllllIlIIlIlIllllIlIIl)) {
            return llIIlllllllI[1];
        }
        if (p.llllllllllIlll(lllllllllllllllIlIIlIlIllllIlIll.b((GameObject)lllllllllllllllIlIIlIlIllllIlIIl) ? 1 : 0)) {
            return llIIlllllllI[2];
        }
        var2_2.interact(llIIllllllIl[llIIlllllllI[2]]);
        return llIIlllllllI[2];
    }

    private static void llllllllllIIIl() {
        llIIllllllIl = new String[llIIlllllllI[0]];
        p.llIIllllllIl[p.llIIlllllllI[1]] = p.llllllllllIIII("CSAwFD8=", "HLDuM");
        p.llIIllllllIl[p.llIIlllllllI[2]] = p.llllllllllIIII("CCIEIBFmIhAoAA==", "KPeFe");
    }

    private static boolean llllllllllIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllllllllllIII(Object object) {
        return object == null;
    }

    private static String llllllllllIIII(String lllllllllllllllIlIIlIlIlllIllllI, String lllllllllllllllIlIIlIlIlllIllIII) {
        lllllllllllllllIlIIlIlIlllIllllI = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIlllIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIlIlllIlllII = new StringBuilder();
        char[] lllllllllllllllIlIIlIlIlllIllIll = lllllllllllllllIlIIlIlIlllIllIII.toCharArray();
        int lllllllllllllllIlIIlIlIlllIllIlI = llIIlllllllI[1];
        char[] lllllllllllllllIlIIlIlIlllIlIlII = lllllllllllllllIlIIlIlIlllIllllI.toCharArray();
        int lllllllllllllllIlIIlIlIlllIlIIll = lllllllllllllllIlIIlIlIlllIlIlII.length;
        int lllllllllllllllIlIIlIlIlllIlIIlI = llIIlllllllI[1];
        while (p.lllllllllllIIl(lllllllllllllllIlIIlIlIlllIlIIlI, lllllllllllllllIlIIlIlIlllIlIIll)) {
            char lllllllllllllllIlIIlIlIlllIlllll = lllllllllllllllIlIIlIlIlllIlIlII[lllllllllllllllIlIIlIlIlllIlIIlI];
            lllllllllllllllIlIIlIlIlllIlllII.append((char)(lllllllllllllllIlIIlIlIlllIlllll ^ lllllllllllllllIlIIlIlIlllIllIll[lllllllllllllllIlIIlIlIlllIllIlI % lllllllllllllllIlIIlIlIlllIllIll.length]));
            "".length();
            ++lllllllllllllllIlIIlIlIlllIllIlI;
            ++lllllllllllllllIlIIlIlIlllIlIIlI;
            "".length();
            if ("   ".length() >= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIlIlIlllIlllII);
    }

    @Inject
    public p(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIlllllllI[0]];
        cArray[p.llIIlllllllI[1]] = c.ACTIVE;
        cArray[p.llIIlllllllI[2]] = c.FINISHING;
        super(squireGOTRPlugin, cArray);
    }

    private static void llllllllllIlII() {
        llIIlllllllI = new int[4];
        p.llIIlllllllI[0] = "  ".length();
        p.llIIlllllllI[1] = (0x22 ^ 0x38) & ~(0x81 ^ 0x9B);
        p.llIIlllllllI[2] = " ".length();
        p.llIIlllllllI[3] = 0xFFFFE9FF & 0x7EFF;
    }
}

