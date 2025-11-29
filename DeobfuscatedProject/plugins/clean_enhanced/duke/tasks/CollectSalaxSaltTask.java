/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
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
import gg.squire.duke.tasks.DukeManager;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Collect Salax Salt", priority=80, blocking=true)
public class CollectSalaxSaltTask
extends Task {
    private final  a bG;
    private final  SquireDukeSucellus bF;

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
            if (2 > ((0xAB ^ 0x87) & ~(0x49 ^ 0x65))) continue;
            return null;
        }
        return String.valueOf(var6);
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    @Inject
    public CollectSalaxSaltTask(SquireDukeSucellus squireDukeSucellus) {
        this.bF = squireDukeSucellus;
        this.bG = squireDukeSucellus.s();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        NPC var19;
        if ((this.bG.x( != 0))) {
            return 0;
        }
        TileObject var20 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var2[5]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = var2[6];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 1;
                    0;
                    if ((0x99 ^ 0x9D) == (0x6D ^ 0x69)) return n2 != 0;
                    return (3 & ~3) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var20 == null {
            return 0;
        }
        Player var21 = Players.getLocal();
        if var21 == null {
            return 0;
        }
        String[] stringArray = new String[1];
        stringArray[0] = var2[0];
        Item var22 = Inventory.getFirst((String[])stringArray);
        if (var22 != null && (var22.getQuantity() >= 2)) {
            return 0;
        }
        String[] stringArray2 = new String[1];
        stringArray2[0] = var2[1];
        TileObject var23 = TileObjects.getNearest((String[])stringArray2);
        if var23 == null {
            return 0;
        }
        if ((e.illlllllllllllllIllIIIIIIlllIllII.contains((Locatable)var21) ? 1 : 0) && (var19 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getId( != null) == e.I) && (nPC.getGraphic() != 4)) {
                n2 = 1;
                0;
                if (-(5 ^ 1) >= 0) {
                    return ((0xB9 ^ 0x93) & ~(0x47 ^ 0x6D)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        }))) {
            return 1;
        }
        var4_4.interact(var2[3]);
        return 1;
    }

}

