/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Production
 */
package gg.squire.skilling.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import gg.squire.skilling.tasks.SkillingTaskBase;
import gg.squire.skilling.tasks.GameEnum9;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="Making battlestaves")
public class MakingBattlestavesTask
extends SkillingTaskBase {

    @Override
    public boolean h() {
        if (x.lIlIllIlllIlII(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            this.sleep(this.i());
            return lllIIlIIlII[1];
        }
        int[] nArray = new int[lllIIlIIlII[1]];
        nArray[x.lllIIlIIlII[2]] = lllIIlIIlII[0];
        int[] nArray2 = new int[lllIIlIIlII[1]];
        nArray2[x.lllIIlIIlII[2]] = this.j.battlestaff().MakingBattlestavesTask();
        Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray2));
        return lllIIlIIlII[1];
    }

    private static boolean lIlIllIlllIlII(int n2) {
        return n2 != 0;
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(lllIIlIIlII[0], lllIIlIIlII[1], this.j.battlestaff().MakingBattlestavesTask(), lllIIlIIlII[1]);
    }

    static {
        x.lIlIllIlllIIll();
    }

    @Inject
    public MakingBattlestavesTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.BATTLESTAVES);
    }

    @Override
    public int i() {
        return lllIIlIIlII[3];
    }
}

