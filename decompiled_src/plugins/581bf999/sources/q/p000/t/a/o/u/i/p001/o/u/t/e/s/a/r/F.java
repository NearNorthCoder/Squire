package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.F  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/F.class */
public class F {
    private /* synthetic */ String bo;
    private /* synthetic */ List<H> bu = new ArrayList();
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

    public F a(String str, String str2) {
        this.bq = new I(this, str, str2);
        return this;
    }

    public K aC() {
        return this.br;
    }

    public String az() {
        return this.bo;
    }

    public F g(String str) {
        this.br = new K(this, str);
        return this;
    }

    public String ay() {
        return this.bn;
    }

    public G aE() {
        return this.bt;
    }

    public F a(String str, String str2, boolean z) {
        this.bu.add(new H(this, str, str2, z));
        "".length();
        return this;
    }

    public I aB() {
        return this.bq;
    }

    public Color aA() {
        return this.bp;
    }

    public F a(String str, String str2, String str3) {
        this.bt = new G(this, str, str2, str3);
        return this;
    }

    public List<H> aF() {
        return this.bu;
    }

    public String ax() {
        return this.bm;
    }

    public F e(String str) {
        this.bn = str;
        return this;
    }

    public F h(String str) {
        this.bs = new J(this, str);
        return this;
    }

    public J aD() {
        return this.bs;
    }

    public F f(String str) {
        this.bo = str;
        return this;
    }

    public F d(String str) {
        this.bm = str;
        return this;
    }
}
