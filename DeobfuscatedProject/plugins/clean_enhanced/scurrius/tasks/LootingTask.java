/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.scurrius.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import gg.squire.scurrius.tasks.ScurriusManager;
import gg.squire.scurrius.tasks.ScurriusManager;

@TaskDesc(name="Looting", blocking=true, priority=50000)
public class LootingTask
extends Task {
    private final  SquireScurriusConfig aj;

    private  b c;
    private final  SquireScurrius ai;

    private static void var3() {
        var2 = new int[7];
        v.var2[0] = (0xE5 ^ 0x9E ^ (0x85 ^ 0xA0)) & (242 + 19 - 34 + 24 ^ 118 + 122 - 214 + 139 ^ -1);
        v.var2[1] = 1;
        v.var2[2] = 2;
        v.var2[3] = 3;
        v.var2[4] = 0xAC ^ 0x8B ^ (0x47 ^ 0x64);
        v.var2[5] = 0x1A ^ 0x1F;
        v.var2[6] = 0x1A ^ 0x12;
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public LootingTask(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.aj = squireScurriusConfig;
        this.ai = squireScurrius;
        this.c = squireScurrius.n();
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    private static void var7() {
        var1 = new String[var2[5]];
        v.var1[v.var2[0]] = "Scurrius";
        v.var1[v.var2[1]] = "Drop";
        v.var1[v.var2[2]] = "Eat";
        v.var1[v.var2[3]] = "Take";
        v.var1[v.var2[4]] = "Eat";
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static String var14(String var15, String var16) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var18 = var16.toCharArray();
        int var19 = var2[0];
        char[] var20 = var15.toCharArray();
        int var21 = var20.length;
        int var22 = var2[0];
        while (v.var5(var22, var21)) {
            char var23 = var20[var22];
            var17.append((char)(var23 ^ var18[var19 % var18.length]));
            0;
            ++var19;
            ++var22;
            0;
            if ((77 + 24 - -24 + 74 ^ 129 + 30 - -22 + 13) > 0) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    private static boolean var24(int n2) {
        return n2 == 0;
    }

    static {
        v.var3();
        v.var7();
    }

        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }

    private static boolean var31(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        TileItem var32;
        v var33;
        if (v.var24(this.ai.c() ? 1 : 0)) {
            return var2[0];
        }
        String[] stringArray = new String[var2[1]];
        stringArray[v.var2[0]] = var1[var2[0]];
        NPC var34 = NPCs.getNearest((String[])stringArray);
        if (v.var31(var34)) {
            return var2[0];
        }
        TileItem var35 = TileItems.getNearest(tileItem -> {
            boolean bl;
            if (!v.var24(d.v.contains(tileItem.getName()) ? 1 : 0) || v.var6(this.aj.lootBoosting() ? 1 : 0) && v.var6(d.y.contains(tileItem.getName()) ? 1 : 0)) {
                bl = var2[1];
                0;
                if (-(0x5E ^ 0x5A ^ (0x94 ^ 0x88) & ~(0x76 ^ 0x6A)) > 0) {
                    return ((0xCE ^ 0xA0 ^ (0xAD ^ 0x86)) & (193 + 80 - 219 + 146 ^ 27 + 113 - 107 + 108 ^ -1)) != 0;
                }
            } else {
                bl = var2[0];
            }
            return bl;
        });
        if (v.var4(var35)) {
            var32 = TileItems.getNearest(tileItem -> d.w.contains(tileItem.getName()));
            if (!v.var31(var32) || v.var6(Inventory.isFull() ? 1 : 0)) {
                return var2[0];
            }
            var35 = var32;
        }
        if (v.var6(Inventory.isFull() ? 1 : 0)) {
            var32 = Inventory.getFirst(item -> d.z.contains(item.getName()));
            if (v.var31(var32)) {
                var32.interact(var1[var2[1]]);
                return var2[1];
            }
            Item var36 = Inventory.getFirst(item -> {
                String[] stringArray = new String[var2[1]];
                stringArray[v.var2[0]] = var1[var2[4]];
                return item.hasAction(stringArray);
            });
            if (v.var4(var36)) {
                var33.ai.e(var2[1]);
                return var2[0];
            }
            var36.interact(var1[var2[2]]);
            return var2[1];
        }
        var2_2.interact(var1[var2[3]]);
        return var2[1];
    }
}

