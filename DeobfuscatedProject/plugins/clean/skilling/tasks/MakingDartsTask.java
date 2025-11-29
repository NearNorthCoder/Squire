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
import gg.squire.skilling.tasks.GameEnum19;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Making darts")
public class MakingDartsTask
extends SkillingTaskBase {
    private final  int[] w;

    private static boolean lIlIllIlIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(lllIIIlIlll[2], lllIIIlIlll[5], this.j.dart().D(), lllIIIlIlll[5]);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean h() {
        I var1;
        j j2 = this.j.dart();
        int[] nArray = new int[lllIIIlIlll[3]];
        nArray[I.lllIIIlIlll[1]] = j2.D();
        Item item = Inventory.getFirst((int[])nArray);
        if (I.lIlIllIlIIIllI(item)) {
            return lllIIIlIlll[1];
        }
        Item var2 = Inventory.getFirst((int[])var1.w);
        if (I.lIlIllIlIIIllI(var2)) {
            return lllIIIlIlll[1];
        }
        int var3 = lllIIIlIlll[1];
        while (I.lIlIllIlIIIlll(var3, lllIIIlIlll[6])) {
            void var4;
            var2.useOn((Item)var4);
            ++var3;

            if (((0x2A ^ 0x3A) & ~(0x8E ^ 0x9E)) >= 0) continue;
            return false;
        }
        return lllIIIlIlll[3];
    }

    static {
        I.lIlIllIlIIIlIl();
    }

    @Inject
    public MakingDartsTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.DARTS);
        int[] nArray = new int[lllIIIlIlll[0]];
        nArray[I.lllIIIlIlll[1]] = lllIIIlIlll[2];
        nArray[I.lllIIIlIlll[3]] = lllIIIlIlll[4];
        this.w = nArray;
    }

    private static boolean lIlIllIlIIIllI(Object object) {
        return object == null;
    }

    @Override
    public int i() {
        return lllIIIlIlll[1];
    }
}

