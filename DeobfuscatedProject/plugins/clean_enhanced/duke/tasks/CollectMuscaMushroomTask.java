/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.duke.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.tasks.DukeManager;
import gg.squire.duke.tasks.HHelper;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Collect Musca Mushroom", priority=98, blocking=true)
public class CollectMuscaMushroomTask
extends Task {
    
    private final  a by;
    
    private final  SquireDukeSucellus bx;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        if ((this.by.w( != 0))) {
            return 0;
        }
        TileObject var3 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var1[4]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = var1[5];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 1;
                    0;
                    if (((0x44 ^ 0x1D) & ~(0xE3 ^ 0xBA)) >= -1) return n2 != 0;
                    return ((0x85 ^ 0x82) & ~(0x3F ^ 0x38)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var3 == null {
            return 0;
        }
        Player var4 = Players.getLocal();
        if var4 == null {
            return 0;
        }
        if ((h.t(var3 == 0).contains((Locatable)var4) ? 1 : 0)) {
            return 0;
        }
        String[] stringArray = new String[1];
        stringArray[0] = var1[0];
        Item var5 = Inventory.getFirst((String[])stringArray);
        if (var5 != null && (var5.getQuantity() >= 2)) {
            return 0;
        }
        String[] stringArray2 = new String[1];
        stringArray2[0] = var1[1];
        TileObject var6 = TileObjects.getNearest((String[])stringArray2);
        if var6 == null {
            return 0;
        }
        var4_4.interact(var1[3]);
        return 1;
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

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    @Inject
    public CollectMuscaMushroomTask(SquireDukeSucellus squireDukeSucellus) {
        this.bx = squireDukeSucellus;
        this.by = squireDukeSucellus.s();
    }
}

