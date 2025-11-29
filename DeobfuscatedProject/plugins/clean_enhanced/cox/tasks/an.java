/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class an {
    private  ar df;
    private  as de;
    private  ao dg;
    private  List<ap> dh;
    private  String db;
    private  String da;
    private  Color dc;
    private  String cZ;
    private  aq dd;

    public an j(String string) {
        this.df = new ar(this, string);
        return this;
    }

    public String cD() {
        return this.cZ;
    }

    public an a(String string, String string2, boolean bl2) {
        this.dh.add(new ap(this, string, string2, bl2));
        0;
        return this;
    }

    public an a(String string, String string2, String string3) {
        this.dg = new ao(this, string, string2, string3);
        return this;
    }

    public an() {
        this.dh = new ArrayList<ap>();
    }

    public aq cH() {
        return this.dd;
    }

    public String cF() {
        return this.db;
    }

    public as cI() {
        return this.de;
    }

    public an f(String string) {
        this.cZ = string;
        return this;
    }

    public ao cK() {
        return this.dg;
    }

    public an g(String string) {
        this.da = string;
        return this;
    }

    public Color cG() {
        return this.dc;
    }

    public String cE() {
        return this.da;
    }

    public an a(Color color) {
        this.dc = color;
        return this;
    }

    public an h(String string) {
        this.db = string;
        return this;
    }

    public an i(String string) {
        this.de = new as(this, string);
        return this;
    }

    public ar cJ() {
        return this.df;
    }

    public List<ap> cL() {
        return this.dh;
    }

    public an a(String string, String string2) {
        this.dd = new aq(this, string, string2);
        return this;
    }
}

