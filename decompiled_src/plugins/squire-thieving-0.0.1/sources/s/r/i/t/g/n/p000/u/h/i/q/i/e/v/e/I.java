package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThievingConfig;
import javax.inject.Inject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
@TaskDesc(name = "Banking (Stalls)", priority = 5, blocking = true)
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.I  reason: invalid package */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/I.class */
public class I extends Task {
    private static /* synthetic */ int[] lIIllIlllllIl;
    private final /* synthetic */ SquireThievingConfig aJ;

    static {
        lIllIIlIIIIIIll();
    }

    private static boolean lIllIIlIIIIIlIl(int i) {
        return i == 0;
    }

    @Inject
    public I(SquireThievingConfig squireThievingConfig) {
        this.aJ = squireThievingConfig;
    }

    private static boolean lIllIIlIIIIIllI(int i) {
        return i != 0;
    }

    private static void lIllIIlIIIIIIll() {
        lIIllIlllllIl = new int[3];
        lIIllIlllllIl[0] = (22 ^ 19) & ((52 ^ 49) ^ (-1));
        lIIllIlllllIl[1] = " ".length();
        lIIllIlllllIl[2] = 52 ^ 62;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    public boolean run() {
        if (!lIllIIlIIIIIlII(this.aJ.method(), EnumC0001b.STALLS) && !lIllIIlIIIIIlIl(Inventory.isFull() ? 1 : 0)) {
            if (lIllIIlIIIIIllI(Bank.isOpen() ? 1 : 0)) {
                Bank.depositInventory();
                Bank.close();
                return lIIllIlllllIl[1];
            } else if (lIllIIlIIIIIlIl(Movement.shouldWalk() ? 1 : 0)) {
                return lIIllIlllllIl[1];
            } else {
                BankLocation nearest = BankLocation.getNearest();
                if (lIllIIlIIIIIlll(nearest.getArea().distanceTo(Players.getLocal()), lIIllIlllllIl[2])) {
                    Movement.walkTo(nearest.getArea().getCenter());
                    "".length();
                    return lIIllIlllllIl[1];
                }
                Bank.open();
                "".length();
                return lIIllIlllllIl[1];
            }
        }
        return lIIllIlllllIl[0];
    }

    private static boolean lIllIIlIIIIIlll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIllIIlIIIIIlII(Object obj, Object obj2) {
        return obj != obj2;
    }
}
