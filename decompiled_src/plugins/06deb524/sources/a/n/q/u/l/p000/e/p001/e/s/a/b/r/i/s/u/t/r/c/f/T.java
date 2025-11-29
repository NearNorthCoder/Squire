package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.w;
import gg.squire.client.plugins.fw.Task;
import gg.squire.minigames.SquireBlastFurnace;
import java.util.function.Predicate;
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.T  reason: invalid package */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/T.class */
public abstract class T<T extends w> extends Task {
    protected final /* synthetic */ Predicate<String> ce;
    protected final /* synthetic */ Class<T> cc;
    protected final /* synthetic */ D cd;
    protected final /* synthetic */ SquireBlastFurnace cb;
    private static /* synthetic */ int[] lIIllIllIIII;

    public abstract boolean a(T t, C0014o c0014o);

    public T(SquireBlastFurnace squireBlastFurnace, Class<T> cls, Predicate<String> predicate) {
        this.cb = squireBlastFurnace;
        this.cd = squireBlastFurnace.b();
        this.cc = cls;
        this.ce = predicate;
        this.cd.W().add(predicate);
        "".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    public boolean run() {
        w S = this.cd.S();
        if (llIIlllllIIllI(this.cc.isInstance(S) ? 1 : 0)) {
            return lIIllIllIIII[0];
        }
        if (llIIlllllIIlll(this.ce) && llIIlllllIIllI(this.ce.test(S.J()) ? 1 : 0)) {
            return lIIllIllIIII[0];
        }
        return a(this.cc.cast(S), this.cb.a());
    }

    static {
        llIIlllllIIlII();
    }

    private static void llIIlllllIIlII() {
        lIIllIllIIII = new int[1];
        lIIllIllIIII[0] = (94 ^ 23) & ((62 ^ 119) ^ (-1));
    }

    private static boolean llIIlllllIIlll(Object obj) {
        return obj != null;
    }

    public T(SquireBlastFurnace squireBlastFurnace, Class<T> cls) {
        this.cb = squireBlastFurnace;
        this.cd = squireBlastFurnace.b();
        this.cc = cls;
        this.ce = null;
    }

    private static boolean llIIlllllIIllI(int i) {
        return i == 0;
    }
}
