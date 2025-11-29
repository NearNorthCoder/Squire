/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.M;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.a;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.b;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.c;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.d;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.e;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.h;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.i;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.j;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.k;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.l;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.m;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.o;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.w;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.minigames.SquireBlastFurnaceConfig;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

@Singleton
public class D {
    private /* synthetic */ w aD;
    private final /* synthetic */ d aB;
    private /* synthetic */ h aC;
    private final /* synthetic */ Set<Predicate<String>> aA;
    @Inject
    private /* synthetic */ SquireBlastFurnaceConfig i;
    @Inject
    private /* synthetic */ o j;

    public h X() {
        return this.aC;
    }

    private static boolean llIlIIIIIIIIll(Object object) {
        return object != null;
    }

    public w S() {
        D var2;
        if (D.llIlIIIIIIIIlI(this.aC)) {
            return null;
        }
        M.bX = null;
        if (D.llIlIIIIIIIIll(var2.aB.a(var2.j))) {
            return var2.aB.a(var2.j);
        }
        this.aD = this.aC.a(this.j);
        return this.aD;
    }

    public D() {
        this.aA = new HashSet<Predicate<String>>();
        this.aB = new d();
    }

    public void T() {
        this.aC = null;
        this.aD = null;
    }

    public void V() {
        h h2 = this.U();
        if (!D.llIlIIIIIIIIll(h2) || D.llIlIIIIIIIIll(this.aC) && D.llIlIIIIIIIlIl(this.aC.getClass().isInstance(h2) ? 1 : 0)) {
            return;
        }
        this.T();
        this.aC = h2;
    }

    private static boolean llIlIIIIIIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIIIIIIIIlI(Object object) {
        return object == null;
    }

    private static boolean llIlIIIIIIIlII(int n2) {
        return n2 == 0;
    }

    public boolean a(w w2) {
        return this.aA.stream().anyMatch(predicate -> predicate.test(w2.J()));
    }

    private h U() {
        D var1;
        if (!D.llIlIIIIIIIlII(this.i.barChoice().equals((Object)c.GOLD) ? 1 : 0) || D.llIlIIIIIIIlIl(this.aC instanceof e)) {
            if (D.llIlIIIIIIIlII(var1.i.hybrid() ? 1 : 0)) {
                return new e();
            }
            if (!D.llIlIIIIIIIlII(var1.i.hybridChoice().equals((Object)c.MITHRIL) ? 1 : 0) || D.llIlIIIIIIIlIl(var1.aC instanceof i)) {
                return new j();
            }
            if (!D.llIlIIIIIIIlII(var1.i.hybridChoice().equals((Object)c.ADAMANTITE) ? 1 : 0) || D.llIlIIIIIIIlIl(var1.aC instanceof a)) {
                return new b();
            }
            if (!D.llIlIIIIIIIlII(var1.i.hybridChoice().equals((Object)c.RUNITE) ? 1 : 0) || D.llIlIIIIIIIlIl(var1.aC instanceof k)) {
                return new l();
            }
            return new e();
        }
        if (D.llIlIIIIIIIlIl(var1.i.barChoice().equals((Object)c.STEEL) ? 1 : 0)) {
            return new m();
        }
        if (D.llIlIIIIIIIlIl(var1.i.barChoice().equals((Object)c.MITHRIL) ? 1 : 0)) {
            return new i();
        }
        if (D.llIlIIIIIIIlIl(var1.i.barChoice().equals((Object)c.ADAMANTITE) ? 1 : 0)) {
            return new a();
        }
        if (D.llIlIIIIIIIlIl(var1.i.barChoice().equals((Object)c.RUNITE) ? 1 : 0)) {
            return new k();
        }
        return null;
    }

    public w Y() {
        return this.aD;
    }

    public Set<Predicate<String>> W() {
        return this.aA;
    }
}

