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
        r.var3();
        r.var4();
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var1[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var1[0];
        while (r.var5(var14, var13)) {
            char var15 = var12[var14];
            var9.append((char)(var15 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if ((5 ^ 0) > 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static boolean var16(int n2) {
        return n2 != 0;
    }

    private static void var4() {
        var2 = new String[var1[1]];
        r.var2[r.var1[0]] = "Fill";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean M() {
        void var1_1;
        r var17;
        if (r.var16(this.T.e() ? 1 : 0)) {
            return var1[0];
        }
        if (r.var16(var17.aq.u() ? 1 : 0)) {
            return var1[0];
        }
        if (r.var16(Bank.isOpen() ? 1 : 0)) {
            return var1[0];
        }
        int[] nArray = new int[var1[1]];
        nArray[r.var1[0]] = var1[2];
        TileObject var18 = TileObjects.getNearest((int[])nArray);
        if (r.var19(var18)) {
            return var1[0];
        }
        int[] nArray2 = new int[var1[1]];
        nArray2[r.var1[0]] = var17.V.primaryBar().v();
        if (r.var20(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[var1[1]];
            nArray3[r.var1[0]] = var17.V.secondaryBar().v();
            if (r.var20(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return var1[0];
            }
        }
        if (r.var16(Production.isOpen() ? 1 : 0)) {
            int[] nArray4 = new int[var1[1]];
            nArray4[r.var1[0]] = var17.V.primaryBar().v();
            if (r.var16(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                Production.chooseOption((int)var17.V.primaryBar().w());
                var17.sleep(var1[3]);
                return var1[1];
            }
            int[] nArray5 = new int[var1[1]];
            nArray5[r.var1[0]] = var17.V.secondaryBar().v();
            if (r.var16(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                Production.chooseOption((int)var17.V.secondaryBar().w());
                var17.sleep(var1[3]);
                return var1[1];
            }
        }
        var1_1.interact(var2[var1[0]]);
        return var1[1];
    }

    @Inject
    public FillingCrucibleTask(a a2, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        super(a2, squireGiantsFoundry, squireGiantsConfig);
    }

    private static boolean var20(int n2) {
        return n2 == 0;
    }

    private static void var3() {
        var1 = new int[4];
        r.var1[0] = (0x18 ^ 0x32) & ~(0x3E ^ 0x14);
        r.var1[1] = 1;
        r.var1[2] = -(0xFFFFDDF6 & 0x631D) & (0xFFFFFFFF & 0xEFFB);
        r.var1[3] = 1 ^ 5;
    }

    private static boolean var19(Object object) {
        return object == null;
    }
}

