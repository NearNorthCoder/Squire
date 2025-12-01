package r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i;

import com.google.inject.Inject;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;
/* renamed from: r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.i  reason: invalid package */
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:r/e/s/w/e/-/i/h/p/s/r/r/e/q/u/i/i.class */
public abstract class i extends f {
    @Inject
    protected /* synthetic */ C0000a f;
    private static /* synthetic */ int[] lIlIlllIIIlll;

    private static boolean llIIIIlIIIIlIII(int i) {
        return i == 0;
    }

    private static void llIIIIlIIIIIllI() {
        lIlIlllIIIlll = new int[3];
        lIlIlllIIIlll[0] = " ".length();
        lIlIlllIIIlll[1] = ((((50 + 2) - 25) + 166) ^ (((14 + 92) - 14) + 68)) & (((144 ^ 139) ^ (46 ^ 84)) ^ (-" ".length()));
        lIlIlllIIIlll[2] = (((13 + 53) - (-60)) + 22) ^ (((124 + 106) - 195) + 117);
    }

    private static boolean llIIIIlIIIIIlll(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BankLoadout o() {
        return (BankLoadout) this.i.bankLoadout().selected(BankLoadout.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    public boolean run() {
        if (llIIIIlIIIIIlll(n() ? 1 : 0) && llIIIIlIIIIIlll(((BankLoadout) this.i.bankLoadout().selected(BankLoadout.class)).needsToBank() ? 1 : 0)) {
            this.f.a(lIlIlllIIIlll[0]);
        }
        return llIIIIlIIIIlIII(this.f.b() ? 1 : 0) ? lIlIlllIIIlll[1] : p();
    }

    protected abstract boolean p();

    private static boolean llIIIIlIIIIlIIl(int i, int i2) {
        return i < i2;
    }

    static {
        llIIIIlIIIIIllI();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean n() {
        if (llIIIIlIIIIIlll(this.p.c(this.i.bank().d()) ? 1 : 0) && llIIIIlIIIIlIIl(this.i.bank().m().distanceTo(Players.getLocal()), lIlIlllIIIlll[2])) {
            ?? r0 = lIlIlllIIIlll[0];
            "".length();
            return "   ".length() < "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIlllIIIlll[1];
    }
}
