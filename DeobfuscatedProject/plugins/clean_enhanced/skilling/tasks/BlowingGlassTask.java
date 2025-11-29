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

@TaskDesc(name="Blowing glass")
public class BlowingGlassTask
extends SkillingManager {

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(var1[0], var1[1], var1[2], var1[1]);
    }

    static {
        A.var3();
    }

    @Override
    public int i() {
        return var1[4];
    }

    @Inject
    public BlowingGlassTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.GLASS_BLOWING);
    }

    @Override
    public boolean h() {
        if (A.var2(Production.isOpen() ? 1 : 0)) {
            Production.chooseOption((int)this.j.glassProduct().C());
            this.sleep(this.i());
            return var1[1];
        }
        int[] nArray = new int[var1[1]];
        nArray[A.var1[3]] = var1[0];
        int[] nArray2 = new int[var1[1]];
        nArray2[A.var1[3]] = var1[2];
        Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray2));
        return var1[1];
    }

    private static void var3() {
        var1 = new int[5];
        A.var1[0] = -(0xFFFFFD5B & 0x4AA7) & (0xFFFFEEFF & 0x5FFB);
        A.var1[1] = 1;
        A.var1[2] = -(0xFFFFFD59 & 0x7BA7) & (0xFFFFFFEF & Short.MAX_VALUE);
        A.var1[3] = (0x10 ^ 1 ^ (0xDD ^ 0x81)) & (0x71 ^ 0x21 ^ (0x39 ^ 0x24) ^ -1);
        A.var1[4] = 9 ^ 0xD;
    }
}

