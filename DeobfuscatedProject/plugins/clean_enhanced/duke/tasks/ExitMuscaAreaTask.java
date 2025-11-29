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
import gg.squire.duke.tasks.HHelper;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Exit Musca Area", priority=97, blocking=true)
public class ExitMuscaAreaTask
extends Task {
    
    final  a bC;
    final  SquireDukeSucellus bB;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if ((this.bC.w( != 0))) {
            return 0;
        }
        TileObject var9 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var2[1]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = var2[3];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 1;
                    0;
                    if (((34 + 145 - 58 + 31 ^ 126 + 90 - 99 + 21) & (0x95 ^ 0xB4 ^ (0x82 ^ 0xB1) ^ -1)) < (0xD0 ^ 0x92 ^ (0x41 ^ 7))) return n2 != 0;
                    return ((0x2E ^ 0x1E ^ (0x52 ^ 0x39)) & (0x2A ^ 0x62 ^ (0x2B ^ 0x38) ^ -1)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var9 == null {
            return 0;
        }
        Player var10 = Players.getLocal();
        if var10 == null {
            return 0;
        }
        if ((h.illlllllllllllllIlIlllllIllIIlllI.contains((Locatable)var10) ? 1 : 0)) {
            return 0;
        }
        String[] stringArray = new String[1];
        stringArray[0] = var2[0];
        Item var11 = Inventory.getFirst((String[])stringArray);
        if (!var11 != null || (var11.getQuantity() < 2)) {
            return 0;
        }
        if ((h.tlllllllllllllllIlIlllllIllIIlllI.contains((Locatable)var10) ? 1 : 0) && (h.f(var9 == 0).equals((Object)var10.getWorldLocation()) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)h.f(var9));
            return 1;
        }
        Movement.setDestination((WorldPoint)h.j((TileObject)var1_1));
        return 1;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = 0;
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = 0;
        while (var20 < var19) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if (2 < 3) continue;
            return null;
        }
        return String.valueOf(var15);
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    @Inject
    public ExitMuscaAreaTask(SquireDukeSucellus squireDukeSucellus) {
        this.bB = squireDukeSucellus;
        this.bC = squireDukeSucellus.s();
    }

}

