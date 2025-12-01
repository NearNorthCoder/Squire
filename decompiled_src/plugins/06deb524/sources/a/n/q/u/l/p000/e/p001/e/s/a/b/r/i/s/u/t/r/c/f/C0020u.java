package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import net.runelite.api.Item;
import net.unethicalite.api.items.Bank;
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.u  reason: invalid package and case insensitive filesystem */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/u.class */
public class C0020u extends w {
    private final /* synthetic */ int[] au;
    private static /* synthetic */ int[] lIIlllIIIllI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.w
    public boolean c(C0014o c0014o) {
        Item first = Bank.getFirst(this.au);
        if (llIlIIIIIIlIll(first)) {
            return lIIlllIIIllI[0];
        }
        Bank.withdrawAll(first.getId(), Bank.WithdrawMode.DEFAULT);
        return lIIlllIIIllI[1];
    }

    public C0020u(String str, int... iArr) {
        super(str);
        this.au = iArr;
    }

    private static boolean llIlIIIIIIlIll(Object obj) {
        return obj == null;
    }

    public int[] I() {
        return this.au;
    }

    static {
        llIlIIIIIIlIlI();
    }

    private static void llIlIIIIIIlIlI() {
        lIIlllIIIllI = new int[2];
        lIIlllIIIllI[0] = (113 ^ 35) & ((122 ^ 40) ^ (-1));
        lIIlllIIIllI[1] = " ".length();
    }
}
