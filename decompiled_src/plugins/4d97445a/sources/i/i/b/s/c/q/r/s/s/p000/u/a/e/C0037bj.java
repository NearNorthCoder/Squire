package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.basics.questing.SquireQuestHelperConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
@TaskDesc(name = "Banking for items", priority = 100, blocking = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bj  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bj.class */
public class C0037bj extends Task {
    private final /* synthetic */ SquireQuestHelperConfig fM;
    private static /* synthetic */ int[] lIlIIIlIl;
    private final /* synthetic */ SquireQuestHelper fL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!lIIIlllIlll(this.fM.useBank() ? 1 : 0) || lIIIllllIII(this.fL.isEnabled() ? 1 : 0)) {
            return lIlIIIlIl[0];
        }
        List<Integer> cH = this.fL.cH();
        if (lIIIlllIlll(cH.isEmpty() ? 1 : 0)) {
            return lIlIIIlIl[0];
        }
        if (lIIIlllIlll(Bank.isOpen() ? 1 : 0)) {
            cH.stream().filter(i2 -> {
                int[] iArr = new int[lIlIIIlIl[1]];
                iArr[lIlIIIlIl[0]] = i2;
                return Bank.contains(iArr);
            }).findAny().ifPresent(num -> {
                Bank.withdraw(num.intValue(), lIlIIIlIl[1], Bank.WithdrawMode.ITEM);
            });
            return lIlIIIlIl[1];
        } else if (lIIIlllIlll(Bank.open() ? 1 : 0)) {
            return lIlIIIlIl[1];
        } else {
            BankLocation nearestCommon = BankLocation.getNearestCommon();
            if (lIIIllllIIl(nearestCommon)) {
                if (lIIIlllIlll(Movement.shouldWalk() ? 1 : 0)) {
                    Movement.walkTo(nearestCommon.getArea().getCenter());
                    "".length();
                }
                return lIlIIIlIl[1];
            }
            return lIlIIIlIl[0];
        }
    }

    private static boolean lIIIlllIlll(int i2) {
        return i2 != 0;
    }

    private static boolean lIIIllllIIl(Object obj) {
        return obj != null;
    }

    @Inject
    public C0037bj(SquireQuestHelper squireQuestHelper, SquireQuestHelperConfig squireQuestHelperConfig) {
        this.fL = squireQuestHelper;
        this.fM = squireQuestHelperConfig;
    }

    static {
        lIIIlllIllI();
    }

    private static void lIIIlllIllI() {
        lIlIIIlIl = new int[2];
        lIlIIIlIl[0] = ((117 ^ 120) ^ (47 ^ 15)) & (((((145 + 109) - 184) + 78) ^ (((40 + 149) - 104) + 100)) ^ (-" ".length()));
        lIlIIIlIl[1] = " ".length();
    }

    private static boolean lIIIllllIII(int i2) {
        return i2 == 0;
    }
}
