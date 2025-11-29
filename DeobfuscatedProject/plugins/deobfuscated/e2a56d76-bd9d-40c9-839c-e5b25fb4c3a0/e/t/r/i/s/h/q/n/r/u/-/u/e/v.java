/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import e.t.r.i.s.h.q.n.r.u.-.u.e.a;
import e.t.r.i.s.h.q.n.r.u.-.u.e.x;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Getting a log")
public class v
extends x {
    private static /* synthetic */ int[] lllIllIlIlIl;
    private static /* synthetic */ String[] lllIllIlIlII;

    private static String lIIIllIlIlIllII(String lllllllllllllllIIlIlllIllllllllI, String lllllllllllllllIIlIllllIIIIIIIlI) {
        lllllllllllllllIIlIlllIllllllllI = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlllIllllllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllllIIIIIIIIl = new StringBuilder();
        char[] lllllllllllllllIIlIllllIIIIIIIII = lllllllllllllllIIlIllllIIIIIIIlI.toCharArray();
        int lllllllllllllllIIlIlllIlllllllll = lllIllIlIlIl[0];
        char[] lllllllllllllllIIlIlllIllllllIIl = lllllllllllllllIIlIlllIllllllllI.toCharArray();
        int lllllllllllllllIIlIlllIllllllIII = lllllllllllllllIIlIlllIllllllIIl.length;
        int lllllllllllllllIIlIlllIlllllIlll = lllIllIlIlIl[0];
        while (v.lIIIllIlIllIIll(lllllllllllllllIIlIlllIlllllIlll, lllllllllllllllIIlIlllIllllllIII)) {
            char lllllllllllllllIIlIllllIIIIIIlII = lllllllllllllllIIlIlllIllllllIIl[lllllllllllllllIIlIlllIlllllIlll];
            lllllllllllllllIIlIllllIIIIIIIIl.append((char)(lllllllllllllllIIlIllllIIIIIIlII ^ lllllllllllllllIIlIllllIIIIIIIII[lllllllllllllllIIlIlllIlllllllll % lllllllllllllllIIlIllllIIIIIIIII.length]));
            0;
            ++lllllllllllllllIIlIlllIlllllllll;
            ++lllllllllllllllIIlIlllIlllllIlll;
            0;
            if ((77 + 18 - 71 + 169 ^ 67 + 1 - -46 + 83) > 1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIllllIIIIIIIIl);
    }

    private static boolean lIIIllIlIllIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIllIlIllIIlI(int n2) {
        return n2 != 0;
    }

    @Inject
    public v(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig);
    }

    static {
        v.lIIIllIlIlIlllI();
        v.lIIIllIlIlIllIl();
    }

    private static boolean lIIIllIlIlIllll(Object object) {
        return object != null;
    }

    private static boolean lIIIllIlIllIIII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean x() {
        TileObject lllllllllllllllIIlIllllIIIIlIIII;
        NPC nPC;
        TileObject tileObject2 = this.G();
        if (v.lIIIllIlIlIllll(tileObject2)) {
            void lllllllllllllllIIlIllllIIIIlIIIl;
            nPC = this.E();
            if (v.lIIIllIlIllIIII(nPC) && v.lIIIllIlIllIIII(nPC = this.D())) {
                return lllIllIlIlIl[0];
            }
            if (v.lIIIllIlIllIIIl(((GameObject)lllllllllllllllIIlIllllIIIIlIIIl).getWorldArea().contains(lllllllllllllllIIlIllllIIIIlIIII.getWorldLocation()) ? 1 : 0)) {
                return lllIllIlIlIl[0];
            }
        }
        int[] nArray = new int[lllIllIlIlIl[1]];
        nArray[v.lllIllIlIlIl[0]] = lllIllIlIlIl[2];
        if (v.lIIIllIlIllIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lllIllIlIlIl[0];
        }
        lllllllllllllllIIlIllllIIIIlIIII = TileObjects.getNearest(tileObject -> {
            int n2;
            if (v.lIIIllIlIllIIlI(lllIllIlIlII[lllIllIlIlIl[1]].equalsIgnoreCase(tileObject.getName()) ? 1 : 0)) {
                String[] stringArray = new String[lllIllIlIlIl[1]];
                stringArray[v.lllIllIlIlIl[0]] = lllIllIlIlII[lllIllIlIlIl[3]];
                if (v.lIIIllIlIllIIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIllIlIlIl[1];
                    0;
                    if (null == null) return n2 != 0;
                    return ((0xA3 ^ 0xAE) & ~(0x79 ^ 0x74)) != 0;
                }
            }
            n2 = lllIllIlIlIl[0];
            return n2 != 0;
        });
        if (v.lIIIllIlIllIIII(lllllllllllllllIIlIllllIIIIlIIII)) {
            return lllIllIlIlIl[0];
        }
        nPC.interact(lllIllIlIlII[lllIllIlIlIl[0]]);
        return lllIllIlIlIl[1];
    }

    private static void lIIIllIlIlIllIl() {
        lllIllIlIlII = new String[lllIllIlIlIl[4]];
        v.lllIllIlIlII[v.lllIllIlIlIl[0]] = v."Chop down";
        v.lllIllIlIlII[v.lllIllIlIlIl[1]] = v."Tree";
        v.lllIllIlIlII[v.lllIllIlIlIl[3]] = v."Chop down";
    }

    private static boolean lIIIllIlIllIIIl(int n2) {
        return n2 == 0;
    }

    private static void lIIIllIlIlIlllI() {
        lllIllIlIlIl = new int[5];
        v.lllIllIlIlIl[0] = (0xE ^ 0x61 ^ (0x69 ^ 0x59)) & (6 ^ 0x7C ^ (0x9A ^ 0xBF) ^ -1);
        v.lllIllIlIlIl[1] = 1;
        v.lllIllIlIlIl[2] = -(0xFFFFE5EB & 0x5A1D) & (0xFFFFF7EF & 0x4DFF);
        v.lllIllIlIlIl[3] = 2;
        v.lllIllIlIlIl[4] = 3;
    }
}

