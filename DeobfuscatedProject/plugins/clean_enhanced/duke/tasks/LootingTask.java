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
package gg.squire.duke.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import gg.squire.duke.tasks.DukeManager;
import gg.squire.duke.tasks.DukeManager;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.account.LocalPlayer;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Looting", blocking=true, priority=5000)
public class LootingTask
extends Task {
    private final  SquireDukeSucellus aV;
    
    private final  SquireDukeSucellusConfig aW;
    private  a u;

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
            if (((0x64 ^ 0x54 ^ (0x4C ^ 0x36)) & (43 + 64 - -104 + 32 ^ 57 + 124 - 36 + 40 ^ -1)) < (167 + 42 - 84 + 70 ^ 148 + 122 - 181 + 110)) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    @Inject
    public LootingTask(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aW = squireDukeSucellusConfig;
        this.aV = squireDukeSucellus;
        this.u = squireDukeSucellus.s();
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        y var19;
        if ((Static.getClient( == 0).isInInstancedRegion() ? 1 : 0)) {
            return 0;
        }
        TileItem var20 = TileItems.getNearest(tileItem -> e.S.contains(tileItem.getName()));
        if var20 == null {
            if ((LocalPlayer.getAccountType( == 0).isIronman() ? 1 : 0) && (LocalPlayer.getAccountType( == 0).isGroupIronman() ? 1 : 0)) {
                var19.aV.f(0);
                return 0;
            }
            var20 = TileItems.getNearest(tileItem -> e.T.contains(tileItem.getName()));
            if var20 == null {
                var19.aV.f(0);
                return 0;
            }
        }
        if ((Inventory.isFull( != 0) ? 1 : 0)) {
            Item var21 = Inventory.getFirst(item -> {
                String[] stringArray = new String[1];
                stringArray[0] = var2[2];
                return item.hasAction(stringArray);
            });
            if var21 == null {
                var19.aV.f(0);
                var19.aV.g(1);
                return 0;
            }
            var21.interact(var2[0]);
            return 1;
        }
        var1_1.interact(var2[1]);
        return 1;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

}

