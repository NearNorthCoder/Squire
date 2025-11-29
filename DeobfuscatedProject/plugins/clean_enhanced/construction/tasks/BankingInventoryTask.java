/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.construction.tasks;

import gg.squire.basics.secondaries.SecondariesConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.tasks.GameEnum2;
import javax.inject.Inject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Banking Inventory")
public class BankingInventoryTask
extends Task {
    @Inject
    private  SecondariesConfig gK;
    private static  int[] llllIlIIl;

    public boolean run() {
        bM var1;
        if ((this.cV( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((Bank.isOpen( != 0) ? 1 : 0)) {
            int[] nArray = new int[1];
            nArray[0] = 2;
            Bank.depositAll((int[])nArray);
            int[] nArray2 = new int[1];
            nArray2[0] = var1.gK.secondary().P();
            Bank.depositAll((int[])nArray2);
            0;
            if (2 > 3) {
                return ((0x3D ^ 0x76) & ~(0xC1 ^ 0x8A)) != 0;
            }
        } else if ((Bank.open( == 0) ? 1 : 0) && (Movement.shouldWalk( != 0) ? 1 : 0)) {
            Movement.walkTo((WorldArea)var1.gK.bank().getArea());
            0;
        }
        return 1;
    }

    static {
        bM.var2();
    }

    private boolean cV() {
        int n2;
        bM var3;
        if ((Inventory.isFull( != 0) ? 1 : 0)) {
            return 1;
        }
        if (((Object)var3.gK.secondary() == (Object)var3.gK.secondary()2)bO.FUNGUS) && (Prayers.getPoints( == 0))) {
            n2 = 1;
            0;
            if (-1 > 2) {
                return ((111 + 42 - 10 + 13 ^ 4 + 91 - 84 + 130) & (0xCF ^ 0xBB ^ (0xE1 ^ 0x84) ^ -1)) != 0;
            }
        } else {
            n2 = 0;
        }
        return n2 != 0;
    }
}

