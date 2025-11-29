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
import gg.squire.duke.tasks.BHelper;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Collect Arder Mushroom", priority=88, blocking=true)
public class CollectArderMushroomTask
extends Task {
    private final  a bq;
    private final  SquireDukeSucellus bp;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 0;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 0;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (((0xB4 ^ 0x92 ^ (0x2D ^ 0x12)) & (182 + 45 - 86 + 43 ^ 15 + 36 - -98 + 12 ^ -1)) != 2) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    @Inject
    public CollectArderMushroomTask(SquireDukeSucellus squireDukeSucellus) {
        this.bp = squireDukeSucellus;
        this.bq = squireDukeSucellus.s();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        if ((this.bq.v( != 0))) {
            return 0;
        }
        TileObject var19 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var2[4]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = var2[5];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 1;
                    0;
                    if (-(132 + 71 - 26 + 22 ^ 127 + 103 - 121 + 86) <= 0) return n2 != 0;
                    return ((100 + 200 - 84 + 4 ^ 2 + 118 - 23 + 92) & (87 + 141 - 179 + 152 ^ 132 + 127 - 220 + 129 ^ -1)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var19 == null {
            return 0;
        }
        Player var20 = Players.getLocal();
        if var20 == null {
            return 0;
        }
        if ((b.b(var19 == 0).contains((Locatable)var20) ? 1 : 0)) {
            return 0;
        }
        String[] stringArray = new String[1];
        stringArray[0] = var2[0];
        Item var21 = Inventory.getFirst((String[])stringArray);
        if (var21 != null && (var21.getQuantity() >= 2)) {
            return 0;
        }
        String[] stringArray2 = new String[1];
        stringArray2[0] = var2[1];
        TileObject var22 = TileObjects.getNearest((String[])stringArray2);
        if var22 == null {
            return 0;
        }
        var4_4.interact(var2[3]);
        return 1;
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }
}

