/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.pvm.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import gg.squire.pvm.tasks.GameEnum;

@TaskDesc(name="Grabbing DWH", priority=100, blocking=true)
public class GrabbingDwhTask
extends Task {
    
    private final  SquireShamanConfig aE;

    private static void var3() {
        var1 = new int[11];
        y.var1[0] = (0xEA ^ 0xB1) & ~(9 ^ 0x52);
        y.var1[1] = 2;
        y.var1[2] = 0xFFFFFF9B & 0x356C;
        y.var1[3] = 1;
        y.var1[4] = 0xFFFFD37F & 0x7DB1;
        y.var1[5] = 3;
        y.var1[6] = 0x62 ^ 0x66;
        y.var1[7] = 0x7E ^ 0x7B;
        y.var1[8] = 0x7B ^ 0x7D;
        y.var1[9] = 0x4C ^ 0x4B;
        y.var1[10] = 0x6E ^ 0x5A ^ (0xB9 ^ 0x85);
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean var10(Object object) {
        return object == null;
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    private static String var13(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var17 = var15.toCharArray();
        int var18 = var1[0];
        char[] var19 = var14.toCharArray();
        int var20 = var19.length;
        int var21 = var1[0];
        while (y.var22(var21, var20)) {
            char var23 = var19[var21];
            var16.append((char)(var23 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var21;
            0;
            if (((5 ^ 0x10) & ~(8 ^ 0x1D)) <= (0x2C ^ 0x28)) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    static {
        y.var3();
        y.var24();
    }

    private static boolean var25(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        g g2 = this.aE.room();
        Player player = Players.getLocal();
        if (y.var12(g2.x().contains((Locatable)player) ? 1 : 0)) {
            return var1[0];
        }
        int[] nArray = new int[var1[1]];
        nArray[y.var1[0]] = var1[2];
        nArray[y.var1[3]] = var1[4];
        TileItem var26 = TileItems.getNearest((int[])nArray);
        if (y.var10(var26)) {
            return var1[0];
        }
        if (y.var11(Inventory.isFull() ? 1 : 0)) {
            Item var27 = Inventory.getFirst(item -> item.hasAction(var2[var1[8]]::equals));
            if (y.var25(var27)) {
                var27.interact(var2[var1[0]]);
                0;
                if (1 >= 3) {
                    return ((0xF2 ^ 0xBE) & ~(0xDD ^ 0x91)) != 0;
                }
            } else {
                Item var28 = Inventory.getFirst(item -> item.hasAction(var2[var1[7]]::equals));
                if (y.var25(var28)) {
                    var28.interact(var2[var1[3]]);
                    0;
                    if (((137 + 43 - 33 + 28 ^ 103 + 1 - 89 + 125) & (49 + 58 - 27 + 76 ^ 105 + 174 - 120 + 32 ^ -1)) != 0) {
                        return ((0xB ^ 0x2C ^ (0x94 ^ 0xBB)) & (0xEE ^ 0x9B ^ (0x36 ^ 0x4B) ^ -1)) != 0;
                    }
                } else {
                    Item var29 = Inventory.getFirst(item -> {
                        String[] stringArray = new String[var1[3]];
                        stringArray[y.var1[0]] = var2[var1[6]];
                        return item.hasAction(stringArray);
                    });
                    if (y.var25(var29)) {
                        var29.interact(var2[var1[1]]);
                        0;
                        if (3 != 3) {
                            return ((0x34 ^ 0x7C ^ (0xEF ^ 0x8D)) & (0xDC ^ 0xAF ^ (0x4B ^ 0x12) ^ -1)) != 0;
                        }
                    } else {
                        return var1[0];
                    }
                }
            }
        }
        var3_3.interact(var2[var1[5]]);
        return var1[3];
    }

    private static boolean var22(int n2, int n3) {
        return n2 < n3;
    }

    private static void var24() {
        var2 = new String[var1[9]];
        y.var2[y.var1[0]] = "Eat";
        y.var2[y.var1[3]] = "Drop";
        y.var2[y.var1[1]] = "Drop";
        y.var2[y.var1[5]] = "Take";
        y.var2[y.var1[6]] = "Drop";
        y.var2[y.var1[7]] = "Drink";
        y.var2[y.var1[8]] = "Eat";
    }

        catch (Exception var35) {
            var35.printStackTrace();
            return null;
        }
    }

    @Inject
    public GrabbingDwhTask(SquireShamanConfig squireShamanConfig) {
        this.aE = squireShamanConfig;
    }
}

