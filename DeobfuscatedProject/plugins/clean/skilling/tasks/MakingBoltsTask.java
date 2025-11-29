/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.skilling.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import gg.squire.skilling.tasks.SkillingTaskBase;
import gg.squire.skilling.tasks.GameEnum9;
import gg.squire.skilling.tasks.GameEnum13;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Making bolts")
public class MakingBoltsTask
extends SkillingTaskBase {
    
    private final  int[] v;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean h() {
        G var1;
        g g2 = this.j.bolt();
        int[] nArray = new int[lllIIlIlIll[3]];
        nArray[G.lllIIlIlIll[1]] = g2.y();
        Item item = Inventory.getFirst((int[])nArray);
        if (G.lIlIlllIIIIIII(item)) {
            return lllIIlIlIll[1];
        }
        Item var2 = Inventory.getFirst((int[])var1.v);
        if (G.lIlIlllIIIIIII(var2)) {
            return lllIIlIlIll[1];
        }
        int var3 = lllIIlIlIll[1];
        while (G.lIlIlllIIIIIIl(var3, lllIIlIlIll[6])) {
            void var4;
            var2.useOn((Item)var4);
            ++var3;

            if ((0x2A ^ 0x2E) >= 0) continue;
            return false;
        }
        return lllIIlIlIll[3];
    }

    private static boolean lIlIlllIIIIIII(Object object) {
        return object == null;
    }

    @Inject
    public MakingBoltsTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.BOLTS);
        int[] nArray = new int[lllIIlIlIll[0]];
        nArray[G.lllIIlIlIll[1]] = lllIIlIlIll[2];
        nArray[G.lllIIlIlIll[3]] = lllIIlIlIll[4];
        this.v = nArray;
    }

    static {
        G.lIlIllIlllllll();
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(lllIIlIlIll[2], lllIIlIlIll[5], this.j.bolt().y(), lllIIlIlIll[5]);
    }

    private static boolean lIlIlllIIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public int i() {
        return lllIIlIlIll[1];
    }
}

