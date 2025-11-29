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

@TaskDesc(name="Looting and burying bones", blocking=true, priority=10000)
public class LootingAndBuryingBonesTask
extends Task {
    private final  SquireScurriusConfig ah;
    private  b c;

    private final  SquireScurrius ag;

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    static {
        u.var4();
        u.var5();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        u var6;
        if (u.var7(this.ah.lootBigBones() ? 1 : 0)) {
            return var2[0];
        }
        if (u.var7(var6.ag.c() ? 1 : 0)) {
            return var2[0];
        }
        String[] stringArray = new String[var2[1]];
        stringArray[u.var2[0]] = var1[var2[0]];
        NPC var8 = NPCs.getNearest((String[])stringArray);
        if (u.var9(var8)) {
            return var2[0];
        }
        int[] nArray = new int[var2[1]];
        nArray[u.var2[0]] = var2[2];
        Item var10 = Inventory.getFirst((int[])nArray);
        if (u.var9(var10)) {
            var10.interact(var1[var2[1]]);
            return var2[1];
        }
        TileItem var11 = TileItems.getNearest(tileItem -> tileItem.getName().equals(var1[var2[7]]));
        if (u.var12(var11)) {
            return var2[0];
        }
        if (u.var3(Inventory.isFull() ? 1 : 0)) {
            Item var13 = Inventory.getFirst(item -> d.z.contains(item.getName()));
            if (u.var9(var13)) {
                var13.interact(var1[var2[3]]);
                return var2[1];
            }
            Item var14 = Inventory.getFirst(item -> {
                String[] stringArray = new String[var2[1]];
                stringArray[u.var2[0]] = var1[var2[6]];
                return item.hasAction(stringArray);
            });
            if (u.var12(var14)) {
                var6.ag.e(var2[1]);
                return var2[0];
            }
            var14.interact(var1[var2[4]]);
            return var2[1];
        }
        var3_3.interact(var1[var2[5]]);
        return var2[1];
    }

    private static boolean var9(Object object) {
        return object != null;
    }

    @Inject
    public LootingAndBuryingBonesTask(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.ah = squireScurriusConfig;
        this.ag = squireScurrius;
        this.c = squireScurrius.n();
    }

    private static boolean var7(int n2) {
        return n2 == 0;
    }

    private static void var5() {
        var1 = new String[var2[8]];
        u.var1[u.var2[0]] = "Scurrius";
        u.var1[u.var2[1]] = "Bury";
        u.var1[u.var2[3]] = "Drop";
        u.var1[u.var2[4]] = "Eat";
        u.var1[u.var2[5]] = "Take";
        u.var1[u.var2[6]] = "Eat";
        u.var1[u.var2[7]] = "Big bones";
    }

    private static boolean var12(Object object) {
        return object == null;
    }

    private static void var4() {
        var2 = new int[10];
        u.var2[0] = (0x58 ^ 0x1D) & ~(0x50 ^ 0x15);
        u.var2[1] = 1;
        u.var2[2] = 0xFFFFF637 & 0xBDC;
        u.var2[3] = 2;
        u.var2[4] = 3;
        u.var2[5] = 0x41 ^ 0x45;
        u.var2[6] = 0x5E ^ 0x5B;
        u.var2[7] = 0x9D ^ 0x9B;
        u.var2[8] = 0x6D ^ 0x6A;
        u.var2[9] = 0x3C ^ 0x34;
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private static String var27(String var28, String var29) {
        var28 = new String(Base64.getDecoder().decode(var28.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var30 = new StringBuilder();
        char[] var31 = var29.toCharArray();
        int var32 = var2[0];
        char[] var33 = var28.toCharArray();
        int var34 = var33.length;
        int var35 = var2[0];
        while (u.var36(var35, var34)) {
            char var37 = var33[var35];
            var30.append((char)(var37 ^ var31[var32 % var31.length]));
            0;
            ++var32;
            ++var35;
            0;
            if (1 < (0x6E ^ 0x6A)) continue;
            return null;
        }
        return String.valueOf(var30);
    }

    private static boolean var36(int n2, int n3) {
        return n2 < n3;
    }
}

