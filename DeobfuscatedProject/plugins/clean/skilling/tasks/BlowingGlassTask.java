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

@TaskDesc(name="Blowing glass")
public class BlowingGlassTask
extends SkillingTaskBase {

    private static boolean lIlIlllIlIlIIl(int n2) {
        return n2 != 0;
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(lllIIlllIIl[0], lllIIlllIIl[1], lllIIlllIIl[2], lllIIlllIIl[1]);
    }

    static {
        A.lIlIlllIlIlIII();
    }

    @Override
    public int i() {
        return lllIIlllIIl[4];
    }

    @Inject
    public BlowingGlassTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.GLASS_BLOWING);
    }

    @Override
    public boolean h() {
        if (A.lIlIlllIlIlIIl(Production.isOpen() ? 1 : 0)) {
            Production.chooseOption((int)this.j.glassProduct().C());
            this.sleep(this.i());
            return lllIIlllIIl[1];
        }
        int[] nArray = new int[lllIIlllIIl[1]];
        nArray[A.lllIIlllIIl[3]] = lllIIlllIIl[0];
        int[] nArray2 = new int[lllIIlllIIl[1]];
        nArray2[A.lllIIlllIIl[3]] = lllIIlllIIl[2];
        Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray2));
        return lllIIlllIIl[1];
    }

}

