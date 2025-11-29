/*
 * Decompiled with CFR 0.152.
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.G;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.H;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.I;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.J;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.K;

public class F {
    private /* synthetic */ String bo;
    private /* synthetic */ List<H> bu;
    private /* synthetic */ J bs;
    private /* synthetic */ I bq;
    private /* synthetic */ Color bp;
    private /* synthetic */ String bm;
    private /* synthetic */ String bn;
    private /* synthetic */ K br;
    private /* synthetic */ G bt;

    public F a(Color color) {
        this.bp = color;
        return this;
    }

    public F a(String string, String string2) {
        this.bq = new I(this, string, string2);
        return this;
    }

    public K aC() {
        return this.br;
    }

    public String az() {
        return this.bo;
    }

    public F g(String string) {
        this.br = new K(this, string);
        return this;
    }

    public String ay() {
        return this.bn;
    }

    public G aE() {
        return this.bt;
    }

    public F() {
        this.bu = new ArrayList<H>();
    }

    public F a(String string, String string2, boolean bl2) {
        this.bu.add(new H(this, string, string2, bl2));
        "".length();
        return this;
    }

    public I aB() {
        return this.bq;
    }

    public Color aA() {
        return this.bp;
    }

    public F a(String string, String string2, String string3) {
        this.bt = new G(this, string, string2, string3);
        return this;
    }

    public List<H> aF() {
        return this.bu;
    }

    public String ax() {
        return this.bm;
    }

    public F e(String string) {
        this.bn = string;
        return this;
    }

    public F h(String string) {
        this.bs = new J(this, string);
        return this;
    }

    public J aD() {
        return this.bs;
    }

    public F f(String string) {
        this.bo = string;
        return this;
    }

    public F d(String string) {
        this.bm = string;
        return this;
    }
}

