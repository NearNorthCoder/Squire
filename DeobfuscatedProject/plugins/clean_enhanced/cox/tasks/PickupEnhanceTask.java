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

import gg.squire.cox.tasks.GameEnum8;
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

@TaskDesc(name="Pickup enhance", priority=30000, blocking=true)
public class PickupEnhanceTask
extends Task {
    private final  SquireChambersConfig cM;
    
    private final  SquireChambersPlugin cL;

    protected int cp() {
        return Inventory.getCount(item -> item.getName().startsWith(var1[3]));
    }

    @Inject
    public PickupEnhanceTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.cL = squireChambersPlugin;
        this.cM = squireChambersConfig;
    }

    protected int cq() {
        return Inventory.getCount(item -> item.getName().startsWith(var1[2]));
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        ah var3;
        if (!(this.cL.C( != null)) || (this.cL.C( == 0).e().contains((Object)N.VESPULA) ? 1 : 0)) {
            return 0;
        }
        if (!(u.bg() <= 1) || (Players.getLocal( == 0).getPlane())) {
            return 0;
        }
        if ((Inventory.contains(item -> item.getName( != 0).toLowerCase().contains(var1[1])) ? 1 : 0)) {
            return 0;
        }
        NPC var4 = NPCs.getNearest(nPC -> {
            int n2;
            String[] stringArray = new String[2];
            stringArray[0] = var1[5];
            if ((nPC.hasActionstringArray) && (this.cL.L( != 0).a((Locatable)nPC) ? 1 : 0)) {
                n2 = 2;
                0;
                if (((0x50 ^ 0x7D) & ~(0x94 ^ 0xB9)) < ((0x85 ^ 0xC1) & ~(0xD5 ^ 0x91))) {
                    return ((0x6B ^ 0x46) & ~(0x2E ^ 3)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if var4 != null {
            return 0;
        }
        TileItem var5 = TileItems.getNearest(tileItem -> {
            int n2;
            if ((tileItem.getId() == 4) && (Reachable.isInteractable(LocatabletileItem) ? 1 : 0) && (this.cL.L( != 0).a((Locatable)tileItem) ? 1 : 0)) {
                n2 = 2;
                0;
                if null != null {
                    return ((0xE6 ^ 0xAC ^ 29 + 40 - 10 + 68) & (3 + 98 - -21 + 15 ^ 103 + 136 - 105 + 54 ^ -1)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if var5 == null {
            return 0;
        }
        if ((Inventory.isFull( != 0) ? 1 : 0)) {
            var3.cL.x();
            0;
            return 2;
        }
        var2_2.interact(var1[0]);
        return 2;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
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
            if (((96 + 138 - 116 + 39 ^ 92 + 166 - 123 + 55) & (146 + 130 - 114 + 8 ^ 57 + 136 - 119 + 63 ^ -1)) == ((0x28 ^ 0x5C ^ (2 ^ 0x7C)) & (0x38 ^ 0x1D ^ (0x4A ^ 0x65) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var15);
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

}

