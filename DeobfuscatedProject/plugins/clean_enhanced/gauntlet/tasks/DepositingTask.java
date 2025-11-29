/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.DepositBox
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.DepositBox;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Depositing", priority=25, blocking=true)
public class DepositingTask
extends GauntletTaskBase {

    @Inject
    public DepositingTask(c c2) {
        d[] dArray = new d[var1[0]];
        dArray[Y.var1[1]] = d.OUTSIDE;
        super(c2, dArray);
    }

    private static boolean var2(int n2, int n3) {
        return n2 >= n3;
    }

    private static void var3() {
        var1 = new int[6];
        Y.var1[0] = 1;
        Y.var1[1] = (0x8C ^ 0x83) & ~(0x6A ^ 0x65);
        Y.var1[2] = 0x51 ^ 0x4B ^ 1;
        Y.var1[3] = 2;
        Y.var1[4] = 0x34 ^ 0x19 ^ (0x7E ^ 0x59);
        Y.var1[5] = 0xFFFFBCF7 & 0xCFFE;
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var2_2;
        if (Y.var5(this.ba.h().deposit() ? 1 : 0)) {
            return var1[1];
        }
        int var6 = Inventory.getFreeSlots();
        if (Y.var2(var6, var1[2])) {
            return var1[1];
        }
        if (Y.var7(DepositBox.isOpen() ? 1 : 0)) {
            Y var8;
            DepositBox.depositInventory();
            DepositBox.close();
            var8.sleep(var1[3]);
            return var1[0];
        }
        if (Y.var2(var6, var1[4])) {
            return var1[1];
        }
        int[] nArray = new int[var1[0]];
        nArray[Y.var1[1]] = var1[5];
        TileObject var9 = TileObjects.getNearest((int[])nArray);
        if (Y.var4(var9)) {
            return var1[1];
        }
        var2_2.interact(var1[1]);
        return var1[0];
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }

    static {
        Y.var3();
    }
}

