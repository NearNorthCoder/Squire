/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Manage Overloads", priority=30000, blocking=true)
public class ManageOverloadsTask
extends Task {
    private final  SquireChambersConfig cO;
    
    private final  SquireChambersPlugin cN;

    protected int cq() {
        return Inventory.getCount(item -> item.getName().startsWith(var1[2]));
    }

    @Inject
    public ManageOverloadsTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.cN = squireChambersPlugin;
        this.cO = squireChambersConfig;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 1;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 1;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    protected int cp() {
        return Inventory.getCount(item -> item.getName().startsWith(var1[4]));
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        ai var19;
        if (!(u.bg() <= 0) || (Players.getLocal( == 0).getPlane())) {
            return 1;
        }
        int[] nArray = new int[2];
        nArray[1] = 3;
        if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
            return 1;
        }
        NPC var20 = NPCs.getNearest(nPC -> {
            int n2;
            String[] stringArray = new String[2];
            stringArray[1] = var1[5];
            if ((nPC.hasActionstringArray) && (this.cN.L( != 0).a((Locatable)nPC) ? 1 : 0)) {
                n2 = 2;
                0;
                if (2 >= (0xA8 ^ 0xB5 ^ (0x5F ^ 0x46))) {
                    return ((12 + 71 - -28 + 55 ^ 66 + 66 - 40 + 43) & (96 + 163 - 58 + 30 ^ 26 + 186 - 62 + 48 ^ -1)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        });
        if var20 != null {
            return 1;
        }
        TileItem var21 = TileItems.getNearest(tileItem -> {
            int n2;
            if ((tileItem.getId() == 3) && (Reachable.isInteractable(LocatabletileItem) ? 1 : 0) && (this.cN.L( != 0).a((Locatable)tileItem) ? 1 : 0)) {
                n2 = 2;
                0;
                if (1 != 1) {
                    return ((0xA7 ^ 0x81) & ~(0x1C ^ 0x3A)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        });
        if var21 == null {
            return 1;
        }
        if ((Inventory.isFull( != 0) ? 1 : 0)) {
            var19.cN.x();
            0;
            return 2;
        }
        var2_2.interact(var1[1]);
        return 2;
    }

}

