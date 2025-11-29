/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.pathfinder.TeleportLoader
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.fishing.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import gg.squire.fishing.tasks.GameEnum;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Banking through butler", priority=100, blocking=true)
public class BankingThroughButlerTask
extends Task {
    private final  SquireFisherConfig S;
    
    private final  Client T;

    private void p() {
    }

    @Inject
    public BankingThroughButlerTask(SquireFisherConfig squireFisherConfig, Client client) {
        this.S = squireFisherConfig;
        this.T = client;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        void var2_2;
        k var3;
        if (!(this.S.butlerBanking( != 0) ? 1 : 0) || ((Object)this.S.fish() != (Object)this.S.fish()2)f.KARAMBWAN)) {
            return 0;
        }
        if ((Inventory.isFull( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var3.T.isInInstancedRegion( == 0) ? 1 : 0)) {
            TeleportLoader.enterHouse();
            0;
            return 1;
        }
        if ((Dialog.isOpen( != 0) ? 1 : 0)) {
            if ((Dialog.isEnterInputOpen( != 0) ? 1 : 0)) {
                Dialog.enterAmount((int)2);
                0;
                if (((0x68 ^ 0x4C) & ~(0x15 ^ 0x31)) != 0) {
                    return ((0x34 ^ 0) & ~(0x10 ^ 0x24)) != 0;
                }
            } else if ((Dialog.canContinue( != 0) ? 1 : 0)) {
                Dialog.continueSpace();
                0;
                if null != null {
                    return ((175 + 93 - 154 + 118 ^ 149 + 126 - 103 + 2) & (5 + 74 - 4 + 179 ^ 118 + 44 - 112 + 134 ^ -1)) != 0;
                }
            } else if ((Dialog.isViewingOptions( != 0) ? 1 : 0)) {
                Dialog.chooseOption((int)1);
                0;
            }
            return 1;
        }
        String[] stringArray = new String[1];
        stringArray[0] = var2[0];
        NPC var4 = NPCs.getNearest((String[])stringArray);
        if ((Widgets.get(int != null3, (int)0))) {
            if (!var4 != null || (var4.distanceTo((Locatable)Players.getLocal()) > var4.distanceTo((Locatable)Players.getLocal())2)) {
                Widgets.get((int)3, (int)5).interact(var2[1]);
                0;
                if (-2 >= 0) {
                    return ((158 + 219 - 206 + 65 ^ 139 + 3 - 94 + 129) & (0x4E ^ 0x5E ^ (0x73 ^ 0x3E) ^ -1)) != 0;
                }
            }
        } else {
            Widgets.get((int)6, (int)7).interact(var2[8]);
        }
        if (!var4 != null || (var4.distanceTo((Locatable)Players.getLocal()) > var4.distanceTo((Locatable)Players.getLocal())2)) {
            return 1;
        }
        int[] nArray = new int[1];
        nArray[0] = 9;
        Item var5 = Inventory.getFirst((int[])nArray);
        if var5 == null {
            return 0;
        }
        var2_2.useOn((Actor)var1_1);
        return 1;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

}

