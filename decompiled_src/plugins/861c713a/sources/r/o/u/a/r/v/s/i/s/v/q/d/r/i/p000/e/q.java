package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.q  reason: invalid package */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/q.class */
public abstract class q extends Task {
    @Inject
    protected /* synthetic */ SquireVardorvisConfig t;
    @Inject
    protected /* synthetic */ SquireVardorvis s;
    @Inject
    protected /* synthetic */ Client w;
    private static /* synthetic */ int[] lIlIIlllllIIl;

    public int E() {
        return lIllllIIlIlIlll(this.w.isInInstancedRegion() ? 1 : 0) ? WorldPoint.fromLocalInstance(this.w, this.w.getLocalPlayer().getLocalLocation()).getRegionID() : this.w.getLocalPlayer().getWorldLocation().getRegionID();
    }

    private static void lIllllIIlIlIlII() {
        lIlIIlllllIIl = new int[2];
        lIlIIlllllIIl[0] = ((((28 + 221) - 130) + 115) ^ (((89 + 85) - 149) + 113)) & (((((35 + 69) - 7) + 139) ^ (((1 + 44) - (-64)) + 31)) ^ (-" ".length()));
        lIlIIlllllIIl[1] = " ".length();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean P() {
        return h(this.t.bank().E());
    }

    private static boolean lIllllIIlIlIllI(int i, int i2) {
        return i == i2;
    }

    protected abstract boolean l();

    private static boolean lIllllIIlIlIlll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean h(int i) {
        if (lIllllIIlIlIllI(E(), i)) {
            ?? r0 = lIlIIlllllIIl[1];
            "".length();
            return (-((193 ^ 146) ^ (98 ^ 53))) >= 0 ? ((38 ^ 93) ^ (194 ^ 147)) & (((191 ^ 144) ^ (61 ^ 56)) ^ (-" ".length())) : r0;
        }
        return lIlIIlllllIIl[0];
    }

    static {
        lIllllIIlIlIlII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean run() {
        return lIllllIIlIlIlIl(this.s.h() ? 1 : 0) ? lIlIIlllllIIl[0] : l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BankLoadout Q() {
        return (BankLoadout) this.t.bankLoadout().selected(BankLoadout.class);
    }

    private static boolean lIllllIIlIlIlIl(int i) {
        return i == 0;
    }
}
