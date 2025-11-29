/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Production
 */
package gg.squire.skilling.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import javax.inject.Inject;
import gg.squire.skilling.tasks.SkillingManager;
import gg.squire.skilling.tasks.GameEnum4;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="Cutting Gems")
public class CuttingGemsTask
extends SkillingManager {

    private static boolean var2(int n2, int n3) {
        return n2 == n3;
    }

    static {
        y.var3();
    }

    @Inject
    public CuttingGemsTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.GEM_CUTTING);
    }

    @Override
    public int i() {
        return var1[5];
    }

    private static boolean var4(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean h() {
        y var5;
        if (y.var6(Production.isOpen() ? 1 : 0)) {
            Production.chooseOption((int)this.j.cuttingProduct().C());
            this.sleep(this.i());
            return var1[1];
        }
        int[] nArray = new int[var1[1]];
        nArray[y.var1[2]] = var5.j.cuttingProduct().z();
        if (y.var2(Inventory.getCount((int[])nArray), var1[1]) && y.var4(var5.i.e(), var1[3])) {
            int[] nArray2 = new int[var1[1]];
            nArray2[y.var1[2]] = var1[0];
            int[] nArray3 = new int[var1[1]];
            nArray3[y.var1[2]] = var5.j.cuttingProduct().z();
            Inventory.getFirst((int[])nArray2).useOn(Inventory.getFirst((int[])nArray3));
            var5.sleep(var1[4]);
            return var1[1];
        }
        int[] nArray4 = new int[var1[1]];
        nArray4[y.var1[2]] = var1[0];
        int[] nArray5 = new int[var1[1]];
        nArray5[y.var1[2]] = this.j.cuttingProduct().z();
        Inventory.getFirst((int[])nArray4).useOn(Inventory.getFirst((int[])nArray5));
        this.sleep(var1[1]);
        return var1[1];
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(var1[0], var1[1], this.j.cuttingProduct().z(), var1[1]);
    }

    private static void var3() {
        var1 = new int[6];
        y.var1[0] = -(0xFFFFFDAD & 0x4273) & (0xFFFFFFFF & 0x46FB);
        y.var1[1] = 1;
        y.var1[2] = (0x6E ^ 0x26) & ~(0x51 ^ 0x19);
        y.var1[3] = 0x1A ^ 0x3C ^ (0x8E ^ 0xA2);
        y.var1[4] = 0xA0 ^ 0x9C ^ (0x1D ^ 0x24);
        y.var1[5] = 77 + 114 - 36 + 41 ^ 95 + 10 - -70 + 17;
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }
}

