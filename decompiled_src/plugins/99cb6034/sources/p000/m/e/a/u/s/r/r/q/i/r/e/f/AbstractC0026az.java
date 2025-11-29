package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import gg.squire.client.plugins.fw.Task;
import gg.squire.farmer.SquireFarmerConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.az  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/az.class */
public abstract class AbstractC0026az extends Task {
    private static /* synthetic */ int[] lIlllIllIIlI;
    protected final /* synthetic */ SquireFarmerConfig bS;
    protected final /* synthetic */ Client bT;
    protected final /* synthetic */ C0031f bR;

    private static boolean lllIllIIllIllI(int i) {
        return i != 0;
    }

    @Inject
    public AbstractC0026az(C0031f c0031f, SquireFarmerConfig squireFarmerConfig, Client client) {
        this.bR = c0031f;
        this.bS = squireFarmerConfig;
        this.bT = client;
    }

    private static void lllIllIIllIlIl() {
        lIlllIllIIlI = new int[2];
        lIlllIllIIlI[0] = " ".length();
        lIlllIllIIlI[1] = (54 ^ 103) & ((101 ^ 52) ^ (-1));
    }

    static {
        lllIllIIllIlIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean sleeping() {
        if (!lllIllIIllIllI(this.bR.t() ? 1 : 0) || lllIllIIllIllI(super.sleeping() ? 1 : 0)) {
            ?? r0 = lIlllIllIIlI[0];
            "".length();
            return (-(48 ^ 52)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlllIllIIlI[1];
    }
}
