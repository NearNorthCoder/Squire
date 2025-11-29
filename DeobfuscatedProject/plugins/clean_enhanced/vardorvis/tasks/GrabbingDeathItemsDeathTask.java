/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.vardorvis.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvisConfig;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Inventory;
import gg.squire.vardorvis.tasks.VardorvisTaskBase;

@TaskDesc(name="Grabbing death items [DEATH]", priority=0x7FFFFFFF, blocking=true)
public class GrabbingDeathItemsDeathTask
extends VardorvisTaskBase {
    @Inject
    private  SquireVardorvisConfig t;
    
    private static final  int ax;

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    static {
        F.var5();
        F.var6();
        ax = var1[2];
    }

    private static void var5() {
        var1 = new int[4];
        F.var1[0] = (2 ^ 0x2B ^ (0x13 ^ 0x7B)) & (5 ^ 0x77 ^ (0x12 ^ 0x21) ^ -1);
        F.var1[1] = 1;
        F.var1[2] = 0xFFFFB693 & 0x6FEC;
        F.var1[3] = 2;
    }

    private static void var6() {
        var2 = new String[var1[1]];
        F.var2[F.var1[0]] = "Loot";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean l() {
        void var2_2;
        F var7;
        Player player = Players.getLocal();
        if (F.var4(av.contains((Locatable)player) ? 1 : 0)) {
            return var1[0];
        }
        int[] nArray = new int[var1[1]];
        nArray[F.var1[0]] = var1[2];
        NPC var8 = NPCs.getNearest((int[])nArray);
        if (F.var9(var8)) {
            var7.aw.d(var1[0]);
            var7.aw.c(var1[1]);
            return var1[0];
        }
        if (F.var3(Inventory.isFull() ? 1 : 0)) {
            Gear.swapTo((EquipmentSetup)((BankLoadout)var7.t.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup());
            0;
            return var1[1];
        }
        var2_2.interact(var2[var1[0]]);
        return var1[1];
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean var9(Object object) {
        return object == null;
    }
}

