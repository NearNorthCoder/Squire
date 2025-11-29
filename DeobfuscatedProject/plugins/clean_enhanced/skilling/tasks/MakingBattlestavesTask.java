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
import gg.squire.skilling.tasks.SkillingManager;
import gg.squire.skilling.tasks.GameEnum4;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="Making battlestaves")
public class MakingBattlestavesTask
extends SkillingManager {

    @Override
    public boolean h() {
        if (x.var2(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            this.sleep(this.i());
            return var1[1];
        }
        int[] nArray = new int[var1[1]];
        nArray[x.var1[2]] = var1[0];
        int[] nArray2 = new int[var1[1]];
        nArray2[x.var1[2]] = this.j.battlestaff().MakingBattlestavesTask();
        Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray2));
        return var1[1];
    }

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(var1[0], var1[1], this.j.battlestaff().MakingBattlestavesTask(), var1[1]);
    }

    static {
        x.var3();
    }

    private static void var3() {
        var1 = new int[4];
        x.var1[0] = 0xFFFFAF7F & 0x55EF;
        x.var1[1] = 1;
        x.var1[2] = (144 + 37 - 111 + 78 ^ 168 + 2 - 136 + 153) & (0x66 ^ 0x10 ^ (0xD2 ^ 0x8B) ^ -1);
        x.var1[3] = 3;
    }

    @Inject
    public MakingBattlestavesTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.BATTLESTAVES);
    }

    @Override
    public int i() {
        return var1[3];
    }
}

