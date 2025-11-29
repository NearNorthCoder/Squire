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

@TaskDesc(name="Making Armour")
public class MakingArmourTask
extends SkillingManager {

    static {
        D.var2();
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(var1[0], var1[1], this.j.armourProduct().l(), this.j.armourProduct().n());
    }

    @Override
    public boolean h() {
        if (D.var3(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            this.sleep(this.i());
            return var1[1];
        }
        int[] nArray = new int[var1[1]];
        nArray[D.var1[2]] = this.j.armourProduct().l();
        int[] nArray2 = new int[var1[1]];
        nArray2[D.var1[2]] = var1[0];
        Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray2));
        return var1[1];
    }

    @Override
    public int i() {
        return var1[3];
    }

    private static void var2() {
        var1 = new int[4];
        D.var1[0] = -(0xFFFF9143 & 0x7FBF) & (0xFFFFF7DF & 0x1FE7);
        D.var1[1] = 1;
        D.var1[2] = (0xC8 ^ 0x9F) & ~(0xC2 ^ 0x95);
        D.var1[3] = 0xEC ^ 0xA6 ^ (0x5E ^ 0x10);
    }

    @Inject
    public MakingArmourTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.ARMOUR);
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }
}

