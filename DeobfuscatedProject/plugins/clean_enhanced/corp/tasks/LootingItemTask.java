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

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            
            return null;
        }
        return String.valueOf(var6);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        p var13;
        if ((this.g( == 0) ? 1 : 0)) {
            return 0;
        }
        TileItem var14 = TileItems.getNearest(tileItem -> {
            int n2;
            if ((tileItem.getQuantity() * Prices.getItemPrice((int)tileItem.getId()) > this.o.lootThreshold()) && (Reachable.isInteractable(LocatabletileItem) ? 1 : 0)) {
                n2 = 1;
                0;
                if (-1 > 2) {
                    return ((0x1C ^ 0x5B ^ (0x36 ^ 0x2D)) & (203 + 180 - 255 + 117 ^ 33 + 25 - 49 + 160 ^ -1)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if var14 == null {
            return 0;
        }
        if ((Inventory.isFull( != 0) ? 1 : 0)) {
            Item var15 = Inventory.getAll(Item::isTradable).stream().min(Comparator.comparingInt(item -> item.getQuantity() * Prices.getItemPrice((int)item.getId()))).orElse(null);
            if var15 == null {
                return 0;
            }
            if ((Prices.getItemPrice((int)var15.getId()) * var15.getQuantity() > Prices.getItemPrice((int)var14.getId()) * var14.getQuantity())) {
                return 0;
            }
            var15.interact(var1[0]);
        }
        var1_1.interact(var1[1]);
        return 1;
    }

}

