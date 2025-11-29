/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.account.LocalPlayer
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.vardorvis.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.account.LocalPlayer;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import gg.squire.vardorvis.tasks.VardorvisManager;
import gg.squire.vardorvis.tasks.VardorvisManager;

@TaskDesc(name="Looting", blocking=true, priority=50000)
public class LootingTask
extends Task {
    private final  SquireVardorvis at;
    
    private  e l;
    private final  SquireVardorvisConfig au;

    private static void var3() {
        var2 = new int[6];
        B.var2[0] = (0xF7 ^ 0xC4) & ~(0x5B ^ 0x68);
        B.var2[1] = 1;
        B.var2[2] = 2;
        B.var2[3] = 3;
        B.var2[4] = 0 ^ 0x5F ^ (0xDB ^ 0x80);
        B.var2[5] = 0x62 ^ 0x57 ^ (0x3B ^ 6);
    }

    @Inject
    public LootingTask(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig) {
        this.au = squireVardorvisConfig;
        this.at = squireVardorvis;
        this.l = squireVardorvis.j();
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (B.var4(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return var2[0];
        }
        TileItem var11 = TileItems.getNearest(tileItem -> g.Q.contains(tileItem.getName()));
        if (B.var12(var11)) {
            if (B.var4(LocalPlayer.getAccountType().isIronman() ? 1 : 0) && B.var4(LocalPlayer.getAccountType().isGroupIronman() ? 1 : 0)) {
                return var2[0];
            }
            var11 = TileItems.getNearest(tileItem -> tileItem.getName().startsWith(var1[var2[3]]));
            if (B.var12(var11)) {
                return var2[0];
            }
        }
        if (B.var13(Inventory.isFull() ? 1 : 0)) {
            Item var14 = Inventory.getFirst(item -> {
                String[] stringArray = new String[var2[1]];
                stringArray[B.var2[0]] = var1[var2[2]];
                return item.hasAction(stringArray);
            });
            if (B.var12(var14)) {
                B var15;
                var15.at.c(var2[1]);
                return var2[0];
            }
            var14.interact(var1[var2[0]]);
            return var2[1];
        }
        var1_1.interact(var1[var2[1]]);
        return var2[1];
    }

    private static boolean var13(int n2) {
        return n2 != 0;
    }

    private static void var16() {
        var1 = new String[var2[4]];
        B.var1[B.var2[0]] = "Eat";
        B.var1[B.var2[1]] = "Take";
        B.var1[B.var2[2]] = "Eat";
        B.var1[B.var2[3]] = "Super combat potion";
    }

    private static boolean var12(Object object) {
        return object == null;
    }

    static {
        B.var3();
        B.var16();
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }
}

