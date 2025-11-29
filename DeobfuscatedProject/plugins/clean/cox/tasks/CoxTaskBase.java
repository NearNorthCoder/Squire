/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxManager;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import gg.squire.cox.SquireChambersPlugin;
import java.util.List;

public abstract class CoxTaskBase {
    protected  List<n> ab;
    protected  SquireChambersPlugin v;
    protected  int am;
    protected  a aa;
    protected  n ak;

    public abstract boolean bN();

    public CoxTaskBase(SquireChambersPlugin squireChambersPlugin, int n2) {
        this.v = squireChambersPlugin;
        this.aa = squireChambersPlugin.C();
        this.am = n2;
        this.ab = squireChambersPlugin.D();
        this.ak = this.ab.get(n2);
    }
}

