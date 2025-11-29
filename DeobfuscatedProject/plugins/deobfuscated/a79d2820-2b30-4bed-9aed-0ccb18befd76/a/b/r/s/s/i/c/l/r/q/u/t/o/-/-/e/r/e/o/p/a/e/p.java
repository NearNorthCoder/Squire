/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e;

import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.a;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Comparator;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Looting item", priority=100, blocking=true)
public class p
extends a {
    private static /* synthetic */ String[] lIllIIIIIIlI;
    private static /* synthetic */ int[] lIllIIIIIIll;

    private static void lllIIIllIllIIl() {
        lIllIIIIIIll = new int[3];
        p.lIllIIIIIIll[0] = (0x18 ^ 0x5B) & ~(0x73 ^ 0x30);
        p.lIllIIIIIIll[1] = 1;
        p.lIllIIIIIIll[2] = 2;
    }

    static {
        p.lllIIIllIllIIl();
        p.lllIIIllIllIII();
    }

    private static boolean lllIIIllIllIll(Object object) {
        return object == null;
    }

    private static void lllIIIllIllIII() {
        lIllIIIIIIlI = new String[lIllIIIIIIll[2]];
        p.lIllIIIIIIlI[p.lIllIIIIIIll[0]] = p."Drop";
        p.lIllIIIIIIlI[p.lIllIIIIIIll[1]] = p."Take";
    }

    private static String lllIIIllIlIlll(String lllllllllllllllIllIIIlIlIllIIIll, String lllllllllllllllIllIIIlIlIlIlllIl) {
        lllllllllllllllIllIIIlIlIllIIIll = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIlIlIllIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIIlIlIllIIIIl = new StringBuilder();
        char[] lllllllllllllllIllIIIlIlIllIIIII = lllllllllllllllIllIIIlIlIlIlllIl.toCharArray();
        int lllllllllllllllIllIIIlIlIlIlllll = lIllIIIIIIll[0];
        char[] lllllllllllllllIllIIIlIlIlIllIIl = lllllllllllllllIllIIIlIlIllIIIll.toCharArray();
        int lllllllllllllllIllIIIlIlIlIllIII = lllllllllllllllIllIIIlIlIlIllIIl.length;
        int lllllllllllllllIllIIIlIlIlIlIlll = lIllIIIIIIll[0];
        while (p.lllIIIllIllllI(lllllllllllllllIllIIIlIlIlIlIlll, lllllllllllllllIllIIIlIlIlIllIII)) {
            char lllllllllllllllIllIIIlIlIllIIlII = lllllllllllllllIllIIIlIlIlIllIIl[lllllllllllllllIllIIIlIlIlIlIlll];
            lllllllllllllllIllIIIlIlIllIIIIl.append((char)(lllllllllllllllIllIIIlIlIllIIlII ^ lllllllllllllllIllIIIlIlIllIIIII[lllllllllllllllIllIIIlIlIlIlllll % lllllllllllllllIllIIIlIlIllIIIII.length]));
            0;
            ++lllllllllllllllIllIIIlIlIlIlllll;
            ++lllllllllllllllIllIIIlIlIlIlIlll;
            0;
            if (1 >= 1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIIIlIlIllIIIIl);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        p lllllllllllllllIllIIIlIlIlllIlII;
        if (p.lllIIIllIllIlI(this.g() ? 1 : 0)) {
            return lIllIIIIIIll[0];
        }
        TileItem lllllllllllllllIllIIIlIlIlllIIll = TileItems.getNearest(tileItem -> {
            int n2;
            if (p.lllIIIllIlllIl(tileItem.getQuantity() * Prices.getItemPrice((int)tileItem.getId()), this.o.lootThreshold()) && p.lllIIIllIlllII(Reachable.isInteractable((Locatable)tileItem) ? 1 : 0)) {
                n2 = lIllIIIIIIll[1];
                0;
                if (-1 > 2) {
                    return ((0x1C ^ 0x5B ^ (0x36 ^ 0x2D)) & (203 + 180 - 255 + 117 ^ 33 + 25 - 49 + 160 ^ -1)) != 0;
                }
            } else {
                n2 = lIllIIIIIIll[0];
            }
            return n2 != 0;
        });
        if (p.lllIIIllIllIll(lllllllllllllllIllIIIlIlIlllIIll)) {
            return lIllIIIIIIll[0];
        }
        if (p.lllIIIllIlllII(Inventory.isFull() ? 1 : 0)) {
            Item lllllllllllllllIllIIIlIlIlllIIlI = Inventory.getAll(Item::isTradable).stream().min(Comparator.comparingInt(item -> item.getQuantity() * Prices.getItemPrice((int)item.getId()))).orElse(null);
            if (p.lllIIIllIllIll(lllllllllllllllIllIIIlIlIlllIIlI)) {
                return lIllIIIIIIll[0];
            }
            if (p.lllIIIllIlllIl(Prices.getItemPrice((int)lllllllllllllllIllIIIlIlIlllIIlI.getId()) * lllllllllllllllIllIIIlIlIlllIIlI.getQuantity(), Prices.getItemPrice((int)lllllllllllllllIllIIIlIlIlllIIll.getId()) * lllllllllllllllIllIIIlIlIlllIIll.getQuantity())) {
                return lIllIIIIIIll[0];
            }
            lllllllllllllllIllIIIlIlIlllIIlI.interact(lIllIIIIIIlI[lIllIIIIIIll[0]]);
        }
        var1_1.interact(lIllIIIIIIlI[lIllIIIIIIll[1]]);
        return lIllIIIIIIll[1];
    }

    private static boolean lllIIIllIllIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIIllIlllII(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIIllIlllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIIIllIllllI(int n2, int n3) {
        return n2 < n3;
    }
}

