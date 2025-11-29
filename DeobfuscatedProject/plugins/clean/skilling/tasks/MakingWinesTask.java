/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.entities.Players
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
import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="Making wines")
public class MakingWinesTask
extends SkillingTaskBase {

    private static boolean lIlIllllIllIll(int n2, int n3) {
        return n2 == n3;
    }

    static {
        w.lIlIllllIllIlI();
    }

    private static boolean lIlIllllIlllII(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean h() {
        if (w.lIlIllllIllIll(Players.getLocal().getAnimation(), lllIlIIllII[3])) {
            return lllIlIIllII[4];
        }
        if (w.lIlIllllIlllII(Production.isOpen() ? 1 : 0)) {
            w var1;
            Production.choosePreviousOption();
            var1.sleep(var1.i());
            return lllIlIIllII[1];
        }
        int[] nArray = new int[lllIlIIllII[1]];
        nArray[w.lllIlIIllII[4]] = lllIlIIllII[0];
        Item item = Inventory.getFirst((int[])nArray);
        int[] nArray2 = new int[lllIlIIllII[1]];
        nArray2[w.lllIlIIllII[4]] = lllIlIIllII[2];
        Item item2 = Inventory.getFirst((int[])nArray2);
        item.useOn(item2);
        return lllIlIIllII[1];
    }

    @Override
    public int i() {
        return lllIlIIllII[5];
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(lllIlIIllII[0], lllIlIIllII[1], lllIlIIllII[2], lllIlIIllII[1]);
    }

    @Inject
    public MakingWinesTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.WINES);
    }

}

