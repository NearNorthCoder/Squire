package q.s.p000.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import net.unethicalite.api.items.Bank;
/* renamed from: q.s.-.i.r.e.r.w.r.s.o.u.b.a.i  reason: invalid package */
/* loaded from: 3b638005-922a-492f-9405-93e6a5194477.jar:q/s/-/i/r/e/r/w/r/s/o/u/b/a/i.class */
public abstract class i extends Task {
    protected final /* synthetic */ SquireBarrowsConfig H;
    private static /* synthetic */ int[] llllIlIIIlI;
    protected final /* synthetic */ a I;
    protected final /* synthetic */ SquireBarrows G;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    public boolean run() {
        if (!lIllIlIlIIlIlI(this.H.useBank() ? 1 : 0) && !lIllIlIlIIlIlI(this.G.u() ? 1 : 0) && !lIllIlIlIIlIlI(Bank.isOpen() ? 1 : 0)) {
            return K();
        }
        return llllIlIIIlI[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public i(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        this.G = squireBarrows;
        this.H = squireBarrowsConfig;
        this.I = squireBarrows.t();
    }

    private static void lIllIlIlIIlIIl() {
        llllIlIIIlI = new int[1];
        llllIlIIIlI[0] = ((4 ^ 119) ^ (45 ^ 97)) & (((160 ^ 157) ^ "  ".length()) ^ (-" ".length()));
    }

    static {
        lIllIlIlIIlIIl();
    }

    public abstract boolean K();

    private static boolean lIllIlIlIIlIlI(int i) {
        return i == 0;
    }
}
