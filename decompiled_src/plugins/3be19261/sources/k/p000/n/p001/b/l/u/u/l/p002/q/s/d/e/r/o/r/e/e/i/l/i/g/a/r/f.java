package k.p000.n.p001.b.l.u.u.l.p002.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import net.runelite.api.Player;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
@TaskDesc(name = "Banking for items")
/* renamed from: k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.f  reason: invalid package */
/* loaded from: 3be19261-31a6-42fb-a6f1-3e9f39e6a450.jar:k/-/n/-/b/l/u/u/l/-/q/s/d/e/r/o/r/e/e/i/l/i/g/a/r/f.class */
public class f extends Task {
    private final /* synthetic */ SquireBlueDragonKillerConfig w;
    private /* synthetic */ Player y;
    private static /* synthetic */ int[] lIIlllIllIll;
    private final /* synthetic */ SquireBlueDragonKiller x;

    private static boolean llIlIIIlIIllIl(int i) {
        return i == 0;
    }

    private static void llIlIIIlIIllII() {
        lIIlllIllIll = new int[3];
        lIIlllIllIll[0] = (187 ^ 159) & ((187 ^ 159) ^ (-1));
        lIIlllIllIll[1] = " ".length();
        lIIlllIllIll[2] = 182 ^ 179;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    public boolean run() {
        if (llIlIIIlIIllIl(this.x.h() ? 1 : 0)) {
            return lIIlllIllIll[0];
        }
        this.y = Players.getLocal();
        if (!llIlIIIlIIlllI(this.y) && !llIlIIIlIIllIl(this.w.bankLocation().getArea().contains(this.y) ? 1 : 0)) {
            if (llIlIIIlIIllIl(Bank.isOpen() ? 1 : 0)) {
                Bank.open();
                "".length();
                return lIIlllIllIll[1];
            }
            BankLoadout bankLoadout = (BankLoadout) this.w.loadout().selected(BankLoadout.class);
            if (llIlIIIlIIllIl(bankLoadout.needsToBank() ? 1 : 0)) {
                this.x.a((boolean) lIIlllIllIll[0]);
                return lIIlllIllIll[0];
            }
            BankLoadouts.withdrawWithRetries(bankLoadout, lIIlllIllIll[2]);
            "".length();
            return lIIlllIllIll[1];
        }
        return lIIlllIllIll[0];
    }

    @Inject
    public f(SquireBlueDragonKillerConfig squireBlueDragonKillerConfig, SquireBlueDragonKiller squireBlueDragonKiller) {
        this.w = squireBlueDragonKillerConfig;
        this.x = squireBlueDragonKiller;
    }

    private static boolean llIlIIIlIIlllI(Object obj) {
        return obj == null;
    }

    static {
        llIlIIIlIIllII();
    }
}
