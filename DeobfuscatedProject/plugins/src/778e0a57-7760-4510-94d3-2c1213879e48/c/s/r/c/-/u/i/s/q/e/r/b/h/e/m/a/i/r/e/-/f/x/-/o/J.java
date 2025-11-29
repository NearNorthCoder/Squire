/*
 * Decompiled with CFR 0.152.
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import gg.squire.cox.SquireChambersPlugin;
import java.util.List;

public abstract class J {
    protected /* synthetic */ List<n> ab;
    protected /* synthetic */ SquireChambersPlugin v;
    protected /* synthetic */ int am;
    protected /* synthetic */ a aa;
    protected /* synthetic */ n ak;

    public abstract boolean bN();

    public J(SquireChambersPlugin squireChambersPlugin, int n2) {
        this.v = squireChambersPlugin;
        this.aa = squireChambersPlugin.C();
        this.am = n2;
        this.ab = squireChambersPlugin.D();
        this.ak = this.ab.get(n2);
    }
}

