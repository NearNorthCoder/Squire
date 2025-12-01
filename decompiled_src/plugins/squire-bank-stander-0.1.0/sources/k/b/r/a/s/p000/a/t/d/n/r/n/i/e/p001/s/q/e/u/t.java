package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import javax.inject.Inject;
import net.unethicalite.api.items.Bank;
@TaskDesc(name = "Banking")
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.t  reason: invalid package */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/t.class */
public class t extends Task {
    private static /* synthetic */ int[] lllIIIIIlll;
    private final /* synthetic */ SquireBankStander q;
    private final /* synthetic */ BankStanderConfig p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    public boolean run() {
        if (lIlIllIIIlIlll(Bank.isOpen() ? 1 : 0)) {
            return lllIIIIIlll[0];
        }
        InventorySetup a = this.q.a();
        if (lIlIllIIIllIII(a)) {
            return lllIIIIIlll[0];
        }
        if (lIlIllIIIllIIl(a.matchesInventory() ? 1 : 0)) {
            if (lIlIllIIIllIIl(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            return lllIIIIIlll[0];
        }
        a.withdraw();
        "".length();
        sleep(lllIIIIIlll[1]);
        return lllIIIIIlll[1];
    }

    @Inject
    public t(BankStanderConfig bankStanderConfig, SquireBankStander squireBankStander) {
        this.p = bankStanderConfig;
        this.q = squireBankStander;
    }

    private static boolean lIlIllIIIlIlll(int i) {
        return i == 0;
    }

    static {
        lIlIllIIIlIllI();
    }

    private static void lIlIllIIIlIllI() {
        lllIIIIIlll = new int[2];
        lllIIIIIlll[0] = (121 ^ 126) & ((196 ^ 195) ^ (-1));
        lllIIIIIlll[1] = " ".length();
    }

    private static boolean lIlIllIIIllIIl(int i) {
        return i != 0;
    }

    private static boolean lIlIllIIIllIII(Object obj) {
        return obj == null;
    }
}
