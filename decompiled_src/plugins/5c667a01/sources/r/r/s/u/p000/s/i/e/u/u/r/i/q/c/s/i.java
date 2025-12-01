package r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;
/* renamed from: r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.i  reason: invalid package */
/* loaded from: 5c667a01-93f1-4288-83c1-de3f0a449bc2.jar:r/r/s/u/-/s/i/e/u/u/r/i/q/c/s/i.class */
public abstract class i extends Task {
    @Inject
    protected /* synthetic */ SquireScurriusConfig b;
    @Inject
    protected /* synthetic */ SquireScurrius a;
    private static /* synthetic */ int[] lIIlIllIlIIIl;
    @Inject
    protected /* synthetic */ Client d;

    private static boolean lIlIllIlIIlIIII(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean s() {
        if (lIlIllIlIIIlllI(d(this.b.bank().q()) ? 1 : 0) && lIlIllIlIIIllll(Players.getLocal().distanceTo(this.b.bank().r()), lIIlIllIlIIIl[1])) {
            ?? r0 = lIIlIllIlIIIl[2];
            "".length();
            return "  ".length() > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIlIllIlIIIl[0];
    }

    private static boolean lIlIllIlIIIllll(int i, int i2) {
        return i < i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BankLoadout t() {
        return (BankLoadout) this.b.bankLoadout().selected(BankLoadout.class);
    }

    protected abstract boolean a();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean d(int i) {
        if (lIlIllIlIIlIIII(q(), i)) {
            ?? r0 = lIIlIllIlIIIl[2];
            "".length();
            return (-" ".length()) > (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIlIllIlIIIl[0];
    }

    private static void lIlIllIlIIIllII() {
        lIIlIllIlIIIl = new int[3];
        lIIlIllIlIIIl[0] = (23 ^ 15) & ((29 ^ 5) ^ (-1));
        lIIlIllIlIIIl[1] = (((14 + 146) - 130) + 124) ^ (((33 + 86) - (-29)) + 0);
        lIIlIllIlIIIl[2] = " ".length();
    }

    public int q() {
        return lIlIllIlIIIlllI(this.d.isInInstancedRegion() ? 1 : 0) ? WorldPoint.fromLocalInstance(this.d, this.d.getLocalPlayer().getLocalLocation()).getRegionID() : this.d.getLocalPlayer().getWorldLocation().getRegionID();
    }

    static {
        lIlIllIlIIIllII();
    }

    private static boolean lIlIllIlIIIllIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean run() {
        return lIlIllIlIIIllIl(this.a.m() ? 1 : 0) ? lIIlIllIlIIIl[0] : a();
    }

    private static boolean lIlIllIlIIIlllI(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean c() {
        if (!lIlIllIlIIIlllI(this.d.isInInstancedRegion() ? 1 : 0) && !lIlIllIlIIIlllI(d.F.contains(Players.getLocal()) ? 1 : 0)) {
            return lIIlIllIlIIIl[0];
        }
        return lIIlIllIlIIIl[2];
    }
}
