/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Production
 */
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GiantsfoundryManager;
import gg.squire.giantsfoundry.tasks.BHelper;
import gg.squire.giantsfoundry.tasks.GiantsfoundryTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.giantsfoundry.SquireGiantsConfig;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="Filling crucible", priority=150)
public class FillingCrucibleTask
extends GiantsfoundryTaskBase {

    @Inject
    private  b aq;

    static {
        r.lIIIIIllllIlIIl();
        r.lIIIIIllllIlIII();
    }

    private static boolean lIIIIIllllIllIl(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    private static boolean lIIIIIllllIlIlI(int n2) {
        return n2 != 0;
    }

    private static void lIIIIIllllIlIII() {
        llIlIllIllIl = new String[llIlIllIlllI[1]];
        r.llIlIllIllIl[r.llIlIllIlllI[0]] = "Fill";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean M() {
        void var1_1;
        r var2;
        if (r.lIIIIIllllIlIlI(this.T.e() ? 1 : 0)) {
            return llIlIllIlllI[0];
        }
        if (r.lIIIIIllllIlIlI(var2.aq.u() ? 1 : 0)) {
            return llIlIllIlllI[0];
        }
        if (r.lIIIIIllllIlIlI(Bank.isOpen() ? 1 : 0)) {
            return llIlIllIlllI[0];
        }
        int[] nArray = new int[llIlIllIlllI[1]];
        nArray[r.llIlIllIlllI[0]] = llIlIllIlllI[2];
        TileObject var3 = TileObjects.getNearest((int[])nArray);
        if (r.lIIIIIllllIlIll(var3)) {
            return llIlIllIlllI[0];
        }
        int[] nArray2 = new int[llIlIllIlllI[1]];
        nArray2[r.llIlIllIlllI[0]] = var2.V.primaryBar().v();
        if (r.lIIIIIllllIllII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[llIlIllIlllI[1]];
            nArray3[r.llIlIllIlllI[0]] = var2.V.secondaryBar().v();
            if (r.lIIIIIllllIllII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return llIlIllIlllI[0];
            }
        }
        if (r.lIIIIIllllIlIlI(Production.isOpen() ? 1 : 0)) {
            int[] nArray4 = new int[llIlIllIlllI[1]];
            nArray4[r.llIlIllIlllI[0]] = var2.V.primaryBar().v();
            if (r.lIIIIIllllIlIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                Production.chooseOption((int)var2.V.primaryBar().w());
                var2.sleep(llIlIllIlllI[3]);
                return llIlIllIlllI[1];
            }
            int[] nArray5 = new int[llIlIllIlllI[1]];
            nArray5[r.llIlIllIlllI[0]] = var2.V.secondaryBar().v();
            if (r.lIIIIIllllIlIlI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                Production.chooseOption((int)var2.V.secondaryBar().w());
                var2.sleep(llIlIllIlllI[3]);
                return llIlIllIlllI[1];
            }
        }
        var1_1.interact(llIlIllIllIl[llIlIllIlllI[0]]);
        return llIlIllIlllI[1];
    }

    @Inject
    public FillingCrucibleTask(a a2, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        super(a2, squireGiantsFoundry, squireGiantsConfig);
    }

    private static boolean lIIIIIllllIllII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIIllllIlIll(Object object) {
        return object == null;
    }
}

