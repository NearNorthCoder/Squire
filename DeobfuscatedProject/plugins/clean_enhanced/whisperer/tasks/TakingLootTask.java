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
package gg.squire.whisperer.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.List;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import gg.squire.whisperer.tasks.WhispererTaskBase;

@TaskDesc(name="Taking loot", priority=10, blocking=true)
public class TakingLootTask
extends WhispererTaskBase {
    
    private static final  int aa;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private boolean e(int n2) {
        boolean bl;
        if ((Inventory.getFreeSlots() <= n2)) {
            bl = 1;
            0;
            if (-1 >= (0x8D ^ 0x89)) {
                return ((0x7C ^ 0x48) & ~(0x78 ^ 0x4C)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

    @Override
    public boolean p() {
        return 0;
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = 0;
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = 0;
        while (var23 < var22) {
            char var24 = var21[var23];
            var18.append((char)(var24 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    static {
        s.var25();
        s.var26();
        aa = 8;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean run() {
        void var2_2;
        Item var27;
        s var28;
        if ((this.W.g( == 0) ? 1 : 0)) {
            return 0;
        }
        List var29 = TileItems.getAll(tileItem -> {
            boolean bl;
            TileItem var30;
            if (!((tileItem.isTradable( != 0) ? 1 : 0) && (Prices.getItemPrice((int)tileItem.getId()) * tileItem.getQuantity() <= 8) && (tileItem.getName( == 0).toLowerCase().contains(var1[9]) ? 1 : 0) && !(tileItem.getName( != 0).toLowerCase().contains(var1[var2[10]]) ? 1 : 0) || !(Reachable.isInteractable(LocatablellllllllllllllIllIlIIIlIIlIllIlI) ? 1 : 0))) {
                bl = 1;
                0;
                if ((0x9E ^ 0x9A) > (0xC6 ^ 0xC2)) {
                    return ((0x93 ^ 0xBE) & ~(0x9D ^ 0xB0)) != 0;
                }
            } else {
                bl = 0;
            }
            return bl;
        });
        if ((var29.isEmpty( != 0) ? 1 : 0)) {
            return 0;
        }
        TileItem var31 = var29.stream().max(Comparator.comparingInt(tileItem -> {
            int n2;
            if ((tileItem.isTradable( == 0) ? 1 : 0)) {
                n2 = 7;
                0;
                if (1 > 2) {
                    return (0x9C ^ 0x94) & ~(0x7F ^ 0x77);
                }
            } else {
                TileItem var32;
                n2 = Prices.getItemPrice((int)var32.getId()) * var32.getQuantity();
            }
            return n2;
        })).orElse(null);
        if ((!(var31.getName( == 0).toLowerCase().contains(var1[0]) ? 1 : 0) || (var31.getName( != 0).toLowerCase().contains(var1[1]) ? 1 : 0)) && (var28.e2)) {
            return 0;
        }
        if ((var28.e1) && (var27 = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[1];
            stringArray[0] = var1[4];
            if ((item.hasAction(stringArray != null != 0) ? 1 : 0) && (!(item.getName( == 0).toLowerCase().contains(var1[5]) ? 1 : 0) || (item.getName( != 0).toLowerCase().contains(var1[6]) ? 1 : 0))) {
                n2 = 1;
                0;
                if (-(0x42 ^ 0x46) > 0) {
                    return ((0x14 ^ 0x2C) & ~(0x8F ^ 0xB7)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        }))) {
            var27.interact(var1[2]);
        }
        var2_2.interact(var1[3]);
        return 1;
    }

}

