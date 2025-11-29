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
import gg.squire.construction.tasks.GameEnum4;
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

    private static boolean llIlIIIIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIIIIIlI(Object object, Object object2) {
        return object == object2;
    }

    public boolean run() {
        bM lIlIIlllIlIIlll;
        if (bM.llIlIIIIIII(this.cV() ? 1 : 0)) {
            return llllIlIIl[0];
        }
        if (bM.llIlIIIIIIl(Bank.isOpen() ? 1 : 0)) {
            int[] nArray = new int[llllIlIIl[1]];
            nArray[bM.llllIlIIl[0]] = llllIlIIl[2];
            Bank.depositAll((int[])nArray);
            int[] nArray2 = new int[llllIlIIl[1]];
            nArray2[bM.llllIlIIl[0]] = lIlIIlllIlIIlll.gK.secondary().P();
            Bank.depositAll((int[])nArray2);

            if (2 > 3) {
                return false;
            }
        } else if (bM.llIlIIIIIII(Bank.open() ? 1 : 0) && bM.llIlIIIIIIl(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo((WorldArea)lIlIIlllIlIIlll.gK.bank().getArea());

        }
        return llllIlIIl[1];
    }

    static {
        bM.llIIlllllll();
    }

    private static boolean llIlIIIIIII(int n2) {
        return n2 == 0;
    }

    private boolean cV() {
        int n2;
        bM lIlIIlllIlIIlIl;
        if (bM.llIlIIIIIIl(Inventory.isFull() ? 1 : 0)) {
            return llllIlIIl[1];
        }
        if (bM.llIlIIIIIlI((Object)lIlIIlllIlIIlIl.gK.secondary(), (Object)bO.FUNGUS) && bM.llIlIIIIIII(Prayers.getPoints())) {
            n2 = llllIlIIl[1];

            if (-1 > 2) {
                return ((111 + 42 - 10 + 13 ^ 4 + 91 - 84 + 130) & (0xCF ^ 0xBB ^ (0xE1 ^ 0x84) ^ -1)) != 0;
            }
        } else {
            n2 = llllIlIIl[0];
        }
        return n2 != 0;
    }

}

