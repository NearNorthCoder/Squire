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
package gg.squire.corp.tasks;

import gg.squire.corp.tasks.CorpTaskBase;
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
public class LootingItemTask
extends CorpTaskBase {

    static {
        p.lllIIIllIllIIl();
        p.lllIIIllIllIII();
    }

    private static boolean lllIIIllIllIll(Object object) {
        return object == null;
    }

    private static void lllIIIllIllIII() {
        lIllIIIIIIlI = new String[lIllIIIIIIll[2]];
        p.lIllIIIIIIlI[p.lIllIIIIIIll[0]] = "Drop";
        p.lIllIIIIIIlI[p.lIllIIIIIIll[1]] = "Take";
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        p var2;
        if (p.lllIIIllIllIlI(this.g() ? 1 : 0)) {
            return lIllIIIIIIll[0];
        }
        TileItem var3 = TileItems.getNearest(tileItem -> {
            int n2;
            if (p.lllIIIllIlllIl(tileItem.getQuantity() * Prices.getItemPrice((int)tileItem.getId()), this.o.lootThreshold()) && p.lllIIIllIlllII(Reachable.isInteractable((Locatable)tileItem) ? 1 : 0)) {
                n2 = lIllIIIIIIll[1];

                if (-1 > 2) {
                    return ((0x1C ^ 0x5B ^ (0x36 ^ 0x2D)) & (203 + 180 - 255 + 117 ^ 33 + 25 - 49 + 160 ^ -1)) != 0;
                }
            } else {
                n2 = lIllIIIIIIll[0];
            }
            return n2 != 0;
        });
        if (p.lllIIIllIllIll(var3)) {
            return lIllIIIIIIll[0];
        }
        if (p.lllIIIllIlllII(Inventory.isFull() ? 1 : 0)) {
            Item var4 = Inventory.getAll(Item::isTradable).stream().min(Comparator.comparingInt(item -> item.getQuantity() * Prices.getItemPrice((int)item.getId()))).orElse(null);
            if (p.lllIIIllIllIll(var4)) {
                return lIllIIIIIIll[0];
            }
            if (p.lllIIIllIlllIl(Prices.getItemPrice((int)var4.getId()) * var4.getQuantity(), Prices.getItemPrice((int)var3.getId()) * var3.getQuantity())) {
                return lIllIIIIIIll[0];
            }
            var4.interact(lIllIIIIIIlI[lIllIIIIIIll[0]]);
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

