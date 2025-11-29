package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.minigames.SquireBlastFurnaceConfig;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
@Singleton
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.D  reason: invalid package */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/D.class */
public class D {
    private /* synthetic */ w aD;
    private /* synthetic */ AbstractC0007h aC;
    @Inject
    private /* synthetic */ SquireBlastFurnaceConfig i;
    @Inject
    private /* synthetic */ C0014o j;
    private final /* synthetic */ Set<Predicate<String>> aA = new HashSet();
    private final /* synthetic */ C0003d aB = new C0003d();

    public AbstractC0007h X() {
        return this.aC;
    }

    private static boolean llIlIIIIIIIIll(Object obj) {
        return obj != null;
    }

    public w S() {
        if (llIlIIIIIIIIlI(this.aC)) {
            return null;
        }
        M.bX = null;
        if (llIlIIIIIIIIll(this.aB.a(this.j))) {
            return this.aB.a(this.j);
        }
        w a2 = this.aC.a(this.j);
        this.aD = a2;
        return a2;
    }

    public void T() {
        this.aC = null;
        this.aD = null;
    }

    public void V() {
        AbstractC0007h U = U();
        if (llIlIIIIIIIIll(U)) {
            if (llIlIIIIIIIIll(this.aC) && llIlIIIIIIIlIl(this.aC.getClass().isInstance(U) ? 1 : 0)) {
                return;
            }
            T();
            this.aC = U;
        }
    }

    private static boolean llIlIIIIIIIlIl(int i) {
        return i != 0;
    }

    private static boolean llIlIIIIIIIIlI(Object obj) {
        return obj == null;
    }

    private static boolean llIlIIIIIIIlII(int i) {
        return i == 0;
    }

    public boolean a(w wVar) {
        return this.aA.stream().anyMatch(predicate -> {
            return predicate.test(wVar.J());
        });
    }

    private AbstractC0007h U() {
        if (!llIlIIIIIIIlII(this.i.barChoice().equals(EnumC0002c.GOLD) ? 1 : 0) || llIlIIIIIIIlIl(this.aC instanceof C0004e ? 1 : 0)) {
            return llIlIIIIIIIlII(this.i.hybrid() ? 1 : 0) ? new C0004e() : (!llIlIIIIIIIlII(this.i.hybridChoice().equals(EnumC0002c.MITHRIL) ? 1 : 0) || llIlIIIIIIIlIl(this.aC instanceof C0008i ? 1 : 0)) ? new C0009j() : (!llIlIIIIIIIlII(this.i.hybridChoice().equals(EnumC0002c.ADAMANTITE) ? 1 : 0) || llIlIIIIIIIlIl(this.aC instanceof C0000a ? 1 : 0)) ? new C0001b() : (!llIlIIIIIIIlII(this.i.hybridChoice().equals(EnumC0002c.RUNITE) ? 1 : 0) || llIlIIIIIIIlIl(this.aC instanceof C0010k ? 1 : 0)) ? new C0011l() : new C0004e();
        } else if (llIlIIIIIIIlIl(this.i.barChoice().equals(EnumC0002c.STEEL) ? 1 : 0)) {
            return new C0012m();
        } else {
            if (llIlIIIIIIIlIl(this.i.barChoice().equals(EnumC0002c.MITHRIL) ? 1 : 0)) {
                return new C0008i();
            }
            if (llIlIIIIIIIlIl(this.i.barChoice().equals(EnumC0002c.ADAMANTITE) ? 1 : 0)) {
                return new C0000a();
            }
            if (llIlIIIIIIIlIl(this.i.barChoice().equals(EnumC0002c.RUNITE) ? 1 : 0)) {
                return new C0010k();
            }
            return null;
        }
    }

    public w Y() {
        return this.aD;
    }

    public Set<Predicate<String>> W() {
        return this.aA;
    }
}
