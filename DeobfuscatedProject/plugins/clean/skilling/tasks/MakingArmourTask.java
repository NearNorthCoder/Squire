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
import gg.squire.skilling.tasks.SkillingTaskBase;
import gg.squire.skilling.tasks.GameEnum9;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="Making Armour")
public class MakingArmourTask
extends SkillingTaskBase {

    static {
        D.lIlIllIIlIllll();
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(lllIIIIllll[0], lllIIIIllll[1], this.j.armourProduct().l(), this.j.armourProduct().n());
    }

    @Override
    public boolean h() {
        if (D.lIlIllIIllIIII(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            this.sleep(this.i());
            return lllIIIIllll[1];
        }
        int[] nArray = new int[lllIIIIllll[1]];
        nArray[D.lllIIIIllll[2]] = this.j.armourProduct().l();
        int[] nArray2 = new int[lllIIIIllll[1]];
        nArray2[D.lllIIIIllll[2]] = lllIIIIllll[0];
        Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray2));
        return lllIIIIllll[1];
    }

    @Override
    public int i() {
        return lllIIIIllll[3];
    }

    @Inject
    public MakingArmourTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.ARMOUR);
    }

    private static boolean lIlIllIIllIIII(int n2) {
        return n2 != 0;
    }
}

