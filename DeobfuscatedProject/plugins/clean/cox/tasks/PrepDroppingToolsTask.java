/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxTaskBase;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Prep Dropping Tools", priority=21000, blocking=true)
public class PrepDroppingToolsTask
extends CoxTaskBase {

    private static boolean llIlIlIIIIllll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean dY() {
        if (!aZ.llIlIlIIIIlllI(this.cq(), this.el) || aZ.llIlIlIIIIllll(this.cp(), this.ee())) {
            return lIlIIIIIlIlI[0];
        }
        int[] nArray = new int[lIlIIIIIlIlI[1]];
        nArray[aZ.lIlIIIIIlIlI[0]] = lIlIIIIIlIlI[2];
        nArray[aZ.lIlIIIIIlIlI[3]] = lIlIIIIIlIlI[4];
        nArray[aZ.lIlIIIIIlIlI[5]] = lIlIIIIIlIlI[6];
        nArray[aZ.lIlIIIIIlIlI[7]] = lIlIIIIIlIlI[8];
        nArray[aZ.lIlIIIIIlIlI[9]] = lIlIIIIIlIlI[10];
        nArray[aZ.lIlIIIIIlIlI[11]] = lIlIIIIIlIlI[12];
        nArray[aZ.lIlIIIIIlIlI[13]] = lIlIIIIIlIlI[14];
        nArray[aZ.lIlIIIIIlIlI[15]] = lIlIIIIIlIlI[16];
        nArray[aZ.lIlIIIIIlIlI[17]] = lIlIIIIIlIlI[18];
        nArray[aZ.lIlIIIIIlIlI[19]] = lIlIIIIIlIlI[20];
        if (aZ.llIlIlIIIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIlIIIIIlIlI[0];
        }
        int[] nArray2 = new int[lIlIIIIIlIlI[1]];
        nArray2[aZ.lIlIIIIIlIlI[0]] = lIlIIIIIlIlI[2];
        nArray2[aZ.lIlIIIIIlIlI[3]] = lIlIIIIIlIlI[4];
        nArray2[aZ.lIlIIIIIlIlI[5]] = lIlIIIIIlIlI[6];
        nArray2[aZ.lIlIIIIIlIlI[7]] = lIlIIIIIlIlI[8];
        nArray2[aZ.lIlIIIIIlIlI[9]] = lIlIIIIIlIlI[10];
        nArray2[aZ.lIlIIIIIlIlI[11]] = lIlIIIIIlIlI[12];
        nArray2[aZ.lIlIIIIIlIlI[13]] = lIlIIIIIlIlI[14];
        nArray2[aZ.lIlIIIIIlIlI[15]] = lIlIIIIIlIlI[16];
        nArray2[aZ.lIlIIIIIlIlI[17]] = lIlIIIIIlIlI[18];
        nArray2[aZ.lIlIIIIIlIlI[19]] = lIlIIIIIlIlI[20];
        Inventory.dropAll((int[])nArray2);

        return lIlIIIIIlIlI[3];
    }

    static {
        aZ.llIlIlIIIIllIl();
    }

    private static boolean llIlIlIIIlIIII(int n2) {
        return n2 == 0;
    }

    @Inject
    protected PrepDroppingToolsTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static boolean llIlIlIIIIlllI(int n2, int n3) {
        return n2 >= n3;
    }
}

