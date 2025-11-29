package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Returning to Start", priority = 2147483510)
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.G  reason: invalid package */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/G.class */
public class G extends AbstractC0000a {
    private static /* synthetic */ int[] lIIlllIIllIlI;

    private static boolean lIllIIllIIIllll(int i) {
        return i != 0;
    }

    static {
        lIllIIllIIIlllI();
    }

    private static boolean lIllIIllIIlIIII(Object obj) {
        return obj != null;
    }

    @Inject
    public G(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static void lIllIIllIIIlllI() {
        lIIlllIIllIlI = new int[2];
        lIIlllIIllIlI[0] = (24 ^ 8) & ((95 ^ 79) ^ (-1));
        lIIlllIIllIlI[1] = " ".length();
    }

    private static boolean lIllIIllIIlIIIl(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    @Override // s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.AbstractC0000a
    public boolean l() {
        if (lIllIIllIIIllll(this.o.j() ? 1 : 0)) {
            return lIIlllIIllIlI[0];
        }
        if (lIllIIllIIIllll(Bank.isOpen() ? 1 : 0)) {
            Bank.close();
            return lIIlllIIllIlI[1];
        }
        Player local = Players.getLocal();
        if (!lIllIIllIIlIIII(local) || lIllIIllIIIllll(Inventory.isFull() ? 1 : 0)) {
            return lIIlllIIllIlI[0];
        }
        if (!lIllIIllIIlIIII(a(this.p.pickpocketTarget())) && !lIllIIllIIlIIIl(local.getWorldLocation().distanceTo(this.o.f()), this.p.wanderRange())) {
            if (lIllIIllIIIllll(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo(this.o.f());
                "".length();
            }
            return lIIlllIIllIlI[1];
        }
        return lIIlllIIllIlI[0];
    }
}
