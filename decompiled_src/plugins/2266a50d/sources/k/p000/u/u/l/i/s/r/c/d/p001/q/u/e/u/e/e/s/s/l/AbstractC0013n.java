package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.n  reason: invalid package and case insensitive filesystem */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/n.class */
public abstract class AbstractC0013n extends Task {
    @Inject
    protected /* synthetic */ SquireDukeSucellusConfig ae;
    private static /* synthetic */ int[] lIllIlIIlIII;
    @Inject
    protected /* synthetic */ Client x;
    @Inject
    protected /* synthetic */ SquireDukeSucellus w;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean g(int i) {
        if (lllIIlllIIIIII(G(), i)) {
            ?? r0 = lIllIlIIlIII[1];
            "".length();
            return 0 != 0 ? ((252 ^ 132) ^ (75 ^ 123)) & (((((80 + 187) - 265) + 214) ^ (((12 + 48) - (-3)) + 81)) ^ (-" ".length())) : r0;
        }
        return lIllIlIIlIII[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BankLoadout Q() {
        return (BankLoadout) this.ae.bankLoadout().selected(BankLoadout.class);
    }

    static {
        lllIIllIlllllI();
    }

    private static boolean lllIIlllIIIIIl(int i) {
        return i != 0;
    }

    private static void lllIIllIlllllI() {
        lIllIlIIlIII = new int[2];
        lIllIlIIlIII[0] = ((36 ^ 57) ^ (24 ^ 14)) & (((25 ^ 5) ^ (85 ^ 66)) ^ (-" ".length()));
        lIllIlIIlIII[1] = " ".length();
    }

    public int G() {
        return lllIIlllIIIIIl(this.x.isInInstancedRegion() ? 1 : 0) ? WorldPoint.fromLocalInstance(this.x, this.x.getLocalPlayer().getLocalLocation()).getRegionID() : this.x.getLocalPlayer().getWorldLocation().getRegionID();
    }

    private static boolean lllIIlllIIIIII(int i, int i2) {
        return i == i2;
    }

    protected abstract boolean R();

    private static boolean lllIIllIllllll(int i) {
        return i == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean P() {
        return g(this.ae.bank().G());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean run() {
        return lllIIllIllllll(this.w.p() ? 1 : 0) ? lIllIlIIlIII[0] : R();
    }
}
