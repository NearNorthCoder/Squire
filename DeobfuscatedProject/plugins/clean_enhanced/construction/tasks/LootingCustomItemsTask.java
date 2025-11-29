/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import gg.squire.basics.loot.LooterConfig;
import gg.squire.basics.loot.SquireLooter;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Iterator;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Looting custom items")
public class LootingCustomItemsTask
extends Task {
    private static  String[] lllllIll;
    private final  SquireLooter eA;
    private final  LooterConfig eB;
    private static  int[] llllllII;

        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static String var7(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = 0;
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = 0;
        while (var15 < var14) {
            char var16 = var13[var15];
            var10.append((char)(var16 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var10);
    }

    @Inject
    public LootingCustomItemsTask(SquireLooter squireLooter, LooterConfig looterConfig) {
        this.eA = squireLooter;
        this.eB = looterConfig;
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private int[] ce() {
        void var2_2;
        aL var23;
        if ((this.eB.custom( != 0).isEmpty() ? 1 : 0)) {
            return new int[0];
        }
        String[] var24 = var23.eB.custom().split(lllllIll[3]);
        int[] var25 = new int[var24.length];
        int var26 = 0;
        while (var26 < var24.length) {
            var25[var26] = Integer.parseInt(var24[var26].trim());
            ++var26;
            0;
            if ((0x19 ^ 0x1D) != 1) continue;
            return null;
        }
        return var2_2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean y(int n2) {
        void var27;
        int[] nArray = this.ce();
        int n3 = nArray.length;
        int var28 = 0;
        while ((var28 < (int)var27)) {
            void var29;
            void var30;
            void var31 = var30[var28];
            if (((int)var31 == (int)var29)) {
                return 1;
            }
            ++var28;
            0;
            if (1 > 0) continue;
            return ((3 ^ (0x8D ^ 0xAD)) & (127 + 4 - 109 + 127 ^ 121 + 46 - 10 + 25 ^ -1)) != 0;
        }
        return 0;
    }

    public boolean run() {
        Iterator<aH> var32 = this.eA.p().iterator();
        while ((var32.hasNext( != 0) ? 1 : 0)) {
            aL var33;
            aH var34 = var32.next();
            if ((var33.y(var34.P( == 0)) ? 1 : 0)) {
                0;
                if null == null continue;
                return ((0x42 ^ 0x52) & ~(0xA4 ^ 0xB4)) != 0;
            }
            TileItem var35 = TileItems.getNearest(tileItem -> {
                int n2;
                if ((tileItem.getId() == var34.P()) && (tileItem.getWorldLocation( != 0).equals((Object)var34.cd()) ? 1 : 0)) {
                    n2 = 1;
                    0;
                    if (-1 >= 3) {
                        return ((0x7D ^ 3 ^ (0xEB ^ 0x80)) & (0xB3 ^ 0xAC ^ (0xAF ^ 0xA5) ^ -1)) != 0;
                    }
                } else {
                    n2 = 0;
                }
                return n2 != 0;
            });
            if var35 == null {
                return 0;
            }
            if ((var35.distanceTo(Players.getLocal().getWorldLocation()) > var33.eB.lootRange())) {
                return 0;
            }
            if ((Inventory.isFull( != 0) ? 1 : 0)) {
                Item var36;
                if ((var35.isStackable( != 0) ? 1 : 0)) {
                    int[] nArray = new int[1];
                    nArray[0] = var35.getId();
                    if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
                        var35.interact(lllllIll[0]);
                    }
                }
                if ((var36 = Inventory.getFirst(item -> {
                    String[] stringArray = new String[1];
                    stringArray[0] = lllllIll[4];
                    return item.hasActionstringArray == null;
                }))) {
                    return 0;
                }
                var36.interact(lllllIll[1]);
                return 1;
            }
            var35.interact(lllllIll[2]);
            System.out.println("[SQUIRE] - Item Price: " + Prices.getItemPrice((int)var35.getId()) * var35.getQuantity() + " : Item Name " + var35.getName());
            return 1;
        }
        return 0;
    }
}

