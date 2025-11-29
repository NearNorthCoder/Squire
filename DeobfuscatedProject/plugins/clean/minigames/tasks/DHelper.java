/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 */
package gg.squire.minigames.tasks;

import gg.squire.minigames.tasks.MinigamesManager;
import gg.squire.minigames.tasks.AHelper;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.b;
import gg.squire.minigames.tasks.GameEnum14;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.d;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.e;
import gg.squire.minigames.tasks.MinigamesTaskBase;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.i;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.j;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.k;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.l;
import gg.squire.minigames.tasks.MHelper;
import gg.squire.minigames.tasks.OHelper;
import gg.squire.minigames.tasks.MinigamesTaskBase;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.minigames.SquireBlastFurnaceConfig;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

@Singleton
public class DHelper {
    private  w aD;
    private final  d aB;
    private  h aC;
    private final  Set<Predicate<String>> aA;
    @Inject
    private  SquireBlastFurnaceConfig i;
    @Inject
    private  o j;

    public h X() {
        return this.aC;
    }

    private static boolean llIlIIIIIIIIll(Object object) {
        return object != null;
    }

    public w S() {
        D var1;
        if (D.llIlIIIIIIIIlI(this.aC)) {
            return null;
        }
        M.bX = null;
        if (D.llIlIIIIIIIIll(var1.aB.a(var1.j))) {
            return var1.aB.a(var1.j);
        }
        this.aD = this.aC.a(this.j);
        return this.aD;
    }

    public DHelper() {
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
        D var2;
        if (!D.llIlIIIIIIIlII(this.i.barChoice().equals((Object)c.GOLD) ? 1 : 0) || D.llIlIIIIIIIlIl(this.aC instanceof e)) {
            if (D.llIlIIIIIIIlII(var2.i.hybrid() ? 1 : 0)) {
                return new e();
            }
            if (!D.llIlIIIIIIIlII(var2.i.hybridChoice().equals((Object)c.MITHRIL) ? 1 : 0) || D.llIlIIIIIIIlIl(var2.aC instanceof i)) {
                return new j();
            }
            if (!D.llIlIIIIIIIlII(var2.i.hybridChoice().equals((Object)c.ADAMANTITE) ? 1 : 0) || D.llIlIIIIIIIlIl(var2.aC instanceof a)) {
                return new b();
            }
            if (!D.llIlIIIIIIIlII(var2.i.hybridChoice().equals((Object)c.RUNITE) ? 1 : 0) || D.llIlIIIIIIIlIl(var2.aC instanceof k)) {
                return new l();
            }
            return new e();
        }
        if (D.llIlIIIIIIIlIl(var2.i.barChoice().equals((Object)c.STEEL) ? 1 : 0)) {
            return new MHelper();
        }
        if (D.llIlIIIIIIIlIl(var2.i.barChoice().equals((Object)c.MITHRIL) ? 1 : 0)) {
            return new i();
        }
        if (D.llIlIIIIIIIlIl(var2.i.barChoice().equals((Object)c.ADAMANTITE) ? 1 : 0)) {
            return new AHelper();
        }
        if (D.llIlIIIIIIIlIl(var2.i.barChoice().equals((Object)c.RUNITE) ? 1 : 0)) {
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

