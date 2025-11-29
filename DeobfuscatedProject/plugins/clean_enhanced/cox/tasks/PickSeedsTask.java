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
import gg.squire.cox.tasks.GameEnum7;
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

@TaskDesc(name="Pick Seeds", priority=30000, blocking=true)
public class PickSeedsTask
extends Task {
    private final  SquireChambersConfig cQ;
    private final  SquireChambersPlugin cP;

    protected int cq() {
        return Inventory.getCount(item -> item.getName().startsWith(var2[0]));
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    public PickSeedsTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.cP = squireChambersPlugin;
        this.cQ = squireChambersConfig;
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
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    protected int cp() {
        return Inventory.getCount(item -> item.getName().startsWith(var2[5]));
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        aj var25;
        int[] nArray = new int[0];
        nArray[1] = 2;
        if ((Inventory.getCount((boolean)0 > (int[])nArray), 3)) {
            return 1;
        }
        if (((Object)u.bh() == (Object)u.bh()2)w.REACHED_BOTTOM)) {
            return 1;
        }
        if ((var25.cq() >= 4)) {
            return 1;
        }
        if (!(var25.cP.L( != null)) || (var25.cP.L( == 0).a((Locatable)Players.getLocal()) ? 1 : 0)) {
            return 1;
        }
        NPC var26 = NPCs.getNearest(nPC -> {
            int n2;
            String[] stringArray = new String[0];
            stringArray[1] = var2[4];
            if ((nPC.hasActionstringArray) && (this.cP.L( != 0).a((Locatable)nPC) ? 1 : 0)) {
                n2 = 0;
                0;
                if (1 < 0) {
                    return ((0xED ^ 0x8B ^ (0x73 ^ 7)) & (33 + 28 - -82 + 4 ^ 97 + 66 - 129 + 95 ^ -1)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        });
        if var26 != null {
            return 1;
        }
        TileItem var27 = TileItems.getNearest(tileItem -> {
            int n2;
            if ((tileItem.getId() == 2) && (Reachable.isInteractable(LocatabletileItem) ? 1 : 0) && (this.cP.L( != 0).a((Locatable)tileItem) ? 1 : 0)) {
                n2 = 0;
                0;
                
            } else {
                n2 = 1;
            }
            return n2 != 0;
        });
        if var27 == null {
            return 1;
        }
        if ((Inventory.isFull( != 0) ? 1 : 0)) {
            int[] nArray2 = new int[0];
            nArray2[1] = 2;
            if ((Inventory.contains((int[] == 0)nArray2) ? 1 : 0)) {
                var25.cP.x();
                0;
                return 0;
            }
        }
        var2_2.interact(var2[1]);
        return 0;
    }

}

