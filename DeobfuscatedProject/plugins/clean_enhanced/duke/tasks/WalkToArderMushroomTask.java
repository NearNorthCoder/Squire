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
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
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
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Walk To Arder Mushroom", priority=89, blocking=true)
public class WalkToArderMushroomTask
extends Task {

    final  a bw;
    final  SquireDukeSucellus bv;

    @Inject
    public WalkToArderMushroomTask(SquireDukeSucellus squireDukeSucellus) {
        this.bv = squireDukeSucellus;
        this.bw = squireDukeSucellus.s();
    }

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
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if ((this.bw.v( != 0))) {
            return 0;
        }
        TileObject var13 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var2[1]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = var2[3];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 1;
                    0;
                    if (3 >= 3) return n2 != 0;
                    return ((162 + 107 - 121 + 54 ^ 30 + 19 - -75 + 29) & (0x59 ^ 0x4B ^ (0x11 ^ 0x50) ^ -1)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var13 == null {
            return 0;
        }
        Player var14 = Players.getLocal();
        if var14 == null {
            return 0;
        }
        if ((b.blllllllllllllllIllIIIIIIIllIlIlI.contains((Locatable)var14) ? 1 : 0)) {
            return 0;
        }
        String[] stringArray = new String[1];
        stringArray[0] = var2[0];
        Item var15 = Inventory.getFirst((String[])stringArray);
        if (var15 != null && (var15.getQuantity() >= 2)) {
            return 0;
        }
        if (!(b.d(var13 == 0).contains((Locatable)var14) ? 1 : 0) || (b.glllllllllllllllIllIIIIIIIllIlIlI.equals((Object)var14.getWorldLocation()) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)b.e(var13));
            return 1;
        }
        Movement.setDestination((WorldPoint)b.g((TileObject)var1_1));
        return 1;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }
}

