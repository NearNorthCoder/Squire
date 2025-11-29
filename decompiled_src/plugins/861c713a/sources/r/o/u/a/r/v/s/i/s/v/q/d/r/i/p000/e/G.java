package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
@TaskDesc(name = "Grabbing fairy ring item [DEATH]", priority = Integer.MAX_VALUE, blocking = true)
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.G  reason: invalid package */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/G.class */
public class G extends E {
    private static /* synthetic */ int[] lIlIlIIlIlIll;
    private /* synthetic */ BankLocation ay;

    private static boolean lIllllIlllllIll(int i) {
        return i != 0;
    }

    private static boolean lIllllIllllllII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    @Override // r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.E
    public boolean l() {
        if (lIllllIlllllIll(X() ? 1 : 0)) {
            return lIlIlIIlIlIll[0];
        }
        if (lIllllIllllllII(this.ay)) {
            this.ay = BankLocation.getNearest();
        }
        if (lIllllIlllllIll(this.ay.getArea().contains(Players.getLocal()) ? 1 : 0)) {
            if (lIllllIlllllIll(Bank.isOpen() ? 1 : 0)) {
                Bank.withdraw(lIlIlIIlIlIll[1], lIlIlIIlIlIll[2], Bank.WithdrawMode.DEFAULT);
                return lIlIlIIlIlIll[2];
            } else if (lIllllIlllllIll(Bank.open() ? 1 : 0)) {
                return lIlIlIIlIlIll[2];
            }
        }
        Movement.walkTo(this.ay.getArea());
        "".length();
        return lIlIlIIlIlIll[2];
    }

    private static void lIllllIlllllIlI() {
        lIlIlIIlIlIll = new int[3];
        lIlIlIIlIlIll[0] = ((((140 + 167) - 103) + 3) ^ (((3 + 58) - 40) + 177)) & (((85 ^ 104) ^ (190 ^ 138)) ^ (-" ".length()));
        lIlIlIIlIlIll[1] = (-((-25090) & 26125)) & (-4241) & 6047;
        lIlIlIIlIlIll[2] = " ".length();
    }

    static {
        lIllllIlllllIlI();
    }
}
