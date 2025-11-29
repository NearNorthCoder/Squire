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
import gg.squire.gauntlet.tasks.GameEnum38;
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
        d[] dArray = new d[llIlIIIlIIII[0]];
        dArray[Y.llIlIIIlIIII[1]] = d.OUTSIDE;
        super(c2, dArray);
    }

    private static boolean lIIIIIIlIIIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIIIIlIIIlIII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var2_2;
        if (Y.lIIIIIIlIIIIlIl(this.ba.h().deposit() ? 1 : 0)) {
            return llIlIIIlIIII[1];
        }
        int var1 = Inventory.getFreeSlots();
        if (Y.lIIIIIIlIIIIllI(var1, llIlIIIlIIII[2])) {
            return llIlIIIlIIII[1];
        }
        if (Y.lIIIIIIlIIIIlll(DepositBox.isOpen() ? 1 : 0)) {
            Y var2;
            DepositBox.depositInventory();
            DepositBox.close();
            var2.sleep(llIlIIIlIIII[3]);
            return llIlIIIlIIII[0];
        }
        if (Y.lIIIIIIlIIIIllI(var1, llIlIIIlIIII[4])) {
            return llIlIIIlIIII[1];
        }
        int[] nArray = new int[llIlIIIlIIII[0]];
        nArray[Y.llIlIIIlIIII[1]] = llIlIIIlIIII[5];
        TileObject var3 = TileObjects.getNearest((int[])nArray);
        if (Y.lIIIIIIlIIIlIII(var3)) {
            return llIlIIIlIIII[1];
        }
        var2_2.interact(llIlIIIlIIII[1]);
        return llIlIIIlIIII[0];
    }

    private static boolean lIIIIIIlIIIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIIIlIIIIlll(int n2) {
        return n2 != 0;
    }

    static {
        Y.lIIIIIIlIIIIlII();
    }
}

