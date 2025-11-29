/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
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
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="Stringing bows", register=true)
public class StringingBowsTask
extends SkillingTaskBase {

    @Inject
    public StringingBowsTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.STRING_BOWS);
    }

    @Override
    public int i() {
        return lllIIllllIl[3];
    }

    private static boolean lIlIlllIllIIIl(int n2) {
        return n2 != 0;
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(this.j.stringableBow().z(), lllIIllllIl[0], lllIIllllIl[1], lllIIllllIl[0]);
    }

    static {
        J.lIlIlllIllIIII();
    }

    @Override
    public boolean h() {
        if (J.lIlIlllIllIIIl(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            this.sleep(this.i());
            return lllIIllllIl[0];
        }
        int[] nArray = new int[lllIIllllIl[0]];
        nArray[J.lllIIllllIl[2]] = this.j.stringableBow().z();
        Item item = Inventory.getFirst((int[])nArray);
        int[] nArray2 = new int[lllIIllllIl[0]];
        nArray2[J.lllIIllllIl[2]] = lllIIllllIl[1];
        item.useOn(Inventory.getFirst((int[])nArray2));
        return lllIIllllIl[0];
    }
}

