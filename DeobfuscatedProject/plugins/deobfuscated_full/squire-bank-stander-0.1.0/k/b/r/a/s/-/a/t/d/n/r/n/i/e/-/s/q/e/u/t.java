/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Bank
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import javax.inject.Inject;
import net.unethicalite.api.items.Bank;

/* TASK: Banking -> BankingTask */
@TaskDesc(name="Banking")
public class t
extends Task {
    private static /* synthetic */ int[] lllIIIIIlll;
    private final /* synthetic */ SquireBankStander q;
    private final /* synthetic */ BankStanderConfig p;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        t var1;
        if (t.lIlIllIIIlIlll(Bank.isOpen() ? 1 : 0)) {
            return lllIIIIIlll[0];
        }
        InventorySetup var2 = var1.q.a();
        if (t.lIlIllIIIllIII(var2)) {
            return lllIIIIIlll[0];
        }
        if (t.lIlIllIIIllIIl(var2.matchesInventory() ? 1 : 0)) {
            if (t.lIlIllIIIllIIl(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            return lllIIIIIlll[0];
        }
        var1_1.withdraw();
        0;
        this.sleep(lllIIIIIlll[1]);
        return lllIIIIIlll[1];
    }

    @Inject
    public t(BankStanderConfig bankStanderConfig, SquireBankStander squireBankStander) {
        this.p = bankStanderConfig;
        this.q = squireBankStander;
    }

    private static boolean lIlIllIIIlIlll(int n2) {
        return n2 == 0;
    }

    static {
        t.lIlIllIIIlIllI();
    }

    private static void lIlIllIIIlIllI() {
        lllIIIIIlll = new int[2];
        t.lllIIIIIlll[0] = (0x79 ^ 0x7E) & ~(0xC4 ^ 0xC3);
        t.lllIIIIIlll[1] = 1;
    }

    private static boolean lIlIllIIIllIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIIIllIII(Object object) {
        return object == null;
    }
}

