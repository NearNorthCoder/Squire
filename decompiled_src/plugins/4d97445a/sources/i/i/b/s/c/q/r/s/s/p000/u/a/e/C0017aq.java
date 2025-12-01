package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.ectofuntus.SquireEcto;
import gg.squire.basics.ectofuntus.SquireEctoConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
@TaskDesc(name = "Traverse to bank", priority = 10)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aq  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aq.class */
public class C0017aq extends Task {
    private final /* synthetic */ SquireEcto da;
    private final /* synthetic */ SquireEctoConfig db;
    private static /* synthetic */ int[] lllIIlIl;
    private /* synthetic */ BankLocation dc;

    private static boolean llIIlIlIlI(int i2, int i3) {
        return i2 > i3;
    }

    static {
        llIIlIIlll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    public boolean run() {
        if (!llIIlIlIII(this.da.r() ? 1 : 0) && !llIIlIlIIl(Bank.isOpen() ? 1 : 0)) {
            if (llIIlIlIlI(Movement.getRunEnergy(), lllIIlIl[1]) && llIIlIlIII(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
            }
            if (!llIIlIlIII(this.db.bankItem().bq() ? 1 : 0)) {
                if (llIIlIlIlI(Players.getLocal().distanceTo(this.db.bankItem().bt()), lllIIlIl[4])) {
                    Movement.setDestination(this.db.bankItem().bt());
                    return lllIIlIl[3];
                }
                return Bank.open();
            }
            Item first = Inventory.getFirst(this.db.bankItem().br());
            if (llIIlIlIll(first)) {
                return lllIIlIl[0];
            }
            first.interact(this.db.bankItem().bs());
            sleep(lllIIlIl[2]);
            return lllIIlIl[3];
        }
        return lllIIlIl[0];
    }

    private static void llIIlIIlll() {
        lllIIlIl = new int[5];
        lllIIlIl[0] = (34 ^ 108) & ((216 ^ 150) ^ (-1));
        lllIIlIl[1] = 119 ^ 99;
        lllIIlIl[2] = "  ".length();
        lllIIlIl[3] = " ".length();
        lllIIlIl[4] = (((40 + 110) - 26) + 5) ^ (((52 + 104) - 148) + 126);
    }

    private static boolean llIIlIlIll(Object obj) {
        return obj == null;
    }

    @Inject
    public C0017aq(SquireEcto squireEcto, SquireEctoConfig squireEctoConfig) {
        this.da = squireEcto;
        this.db = squireEctoConfig;
    }

    private static boolean llIIlIlIII(int i2) {
        return i2 == 0;
    }

    private static boolean llIIlIlIIl(int i2) {
        return i2 != 0;
    }
}
