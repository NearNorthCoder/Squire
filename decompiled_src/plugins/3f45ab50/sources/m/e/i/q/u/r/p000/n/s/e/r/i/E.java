package m.e.i.q.u.r.p000.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Walking to hopper", priority = 10, blocking = true)
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.E  reason: invalid package */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/E.class */
public class E extends C {
    private static /* synthetic */ int[] llllllIllllI;

    private static boolean lIIlIlIIlllIIll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    @Override // m.e.i.q.u.r.p000.n.s.e.r.i.C
    public boolean t() {
        if (!lIIlIlIIlllIIlI(this.Z.I() ? 1 : 0) && !lIIlIlIIlllIIlI(this.Z.K() ? 1 : 0)) {
            Player local = Players.getLocal();
            if (lIIlIlIIlllIIll(local)) {
                return llllllIllllI[0];
            }
            if (lIIlIlIIlllIlII(Dialog.isOpen() ? 1 : 0) && lIIlIlIIlllIlII(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
            TileObject x = x();
            if (!lIIlIlIIlllIIll(x) && !lIIlIlIIlllIlIl(x.distanceTo(local.getWorldLocation()), llllllIllllI[1])) {
                if (lIIlIlIIlllIlII(Movement.shouldWalk() ? 1 : 0)) {
                    Movement.walkTo(x);
                    "".length();
                }
                return llllllIllllI[2];
            }
            return llllllIllllI[0];
        }
        return llllllIllllI[0];
    }

    private static boolean lIIlIlIIlllIlII(int i) {
        return i != 0;
    }

    @Inject
    public E(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t) {
        super(squireMinerConfig, squireMiner, t);
    }

    private static boolean lIIlIlIIlllIlIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIlIIlllIIlI(int i) {
        return i == 0;
    }

    private static void lIIlIlIIlllIIIl() {
        llllllIllllI = new int[3];
        llllllIllllI[0] = (148 ^ 177) & ((73 ^ 108) ^ (-1));
        llllllIllllI[1] = "   ".length();
        llllllIllllI[2] = " ".length();
    }

    static {
        lIIlIlIIlllIIIl();
    }
}
