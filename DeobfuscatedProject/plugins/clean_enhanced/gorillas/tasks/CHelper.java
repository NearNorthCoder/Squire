/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.HeadIcon
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.rs.api.RSNPCComposition
 */
package gg.squire.gorillas.tasks;

import com.google.inject.Inject;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.HeadIcon;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.rs.api.RSNPCComposition;
import gg.squire.gorillas.tasks.GameEnum3;

public class CHelper {
    private  NPC t;
    public static final  int m;
    private  int v;
    private  int x;
    public static final  int p;
    private  int D;
    private  boolean E;
    private  boolean G;
    private  HeadIcon H;
    private  boolean z;
    private  boolean C;
    public static final  int r;
    public static final  int n;
    private  int I;
    private  WorldArea y;
    private  Actor B;
    private  int w;
    public static final  d[] l;
    private  Actor A;
    public static final  int s;
    private  List<d> u;
    public static final  int q;
    
    private  boolean F;
    public static final  int o;

    public void CHelper(boolean bl) {
        this.E = bl;
    }

    static {
        c.var2();
        q = 4;
        p = 5;
        r = 6;
        s = 7;
        n = 8;
        m = 9;
        o = 1;
        d[] dArray = new d[1];
        dArray[3] = d.MELEE;
        dArray[c.var1[10]] = d.RANGED;
        dArray[c.var1[11]] = d.MAGIC;
        l = dArray;
    }

    public boolean z() {
        return this.G;
    }

    @Inject
    public CHelper(NPC nPC) {
        this.t = nPC;
        this.u = Arrays.asList(l);
        this.w = 0;
        this.v = 1;
        this.D = 2;
    }

    public boolean x() {
        return this.E;
    }

    public void b(boolean bl) {
        this.C = bl;
    }

    public void b(Actor actor) {
        this.B = actor;
    }

    public WorldArea r() {
        return this.y;
    }

    public void a(List<d> list) {
        this.u = list;
    }

    public int w() {
        return this.D;
    }

    public void a(WorldArea worldArea) {
        this.y = worldArea;
    }

    public HeadIcon A() {
        return this.H;
    }

    public boolean s() {
        return this.z;
    }

    public void f(int n2) {
        this.I = n2;
    }

    public NPC m() {
        return this.t;
    }

    public Actor t() {
        return this.A;
    }

    public void a(HeadIcon headIcon) {
        this.H = headIcon;
    }

    public Actor u() {
        return this.B;
    }

    public void d(int n2) {
        this.x = n2;
    }

    public void a(Actor actor) {
        this.A = actor;
    }

    public void e(int n2) {
        this.D = n2;
    }

    public List<d> n() {
        return this.u;
    }

    public void b(int n2) {
        this.v = n2;
    }

    public int B() {
        return this.I;
    }

    public void CHelper(int n2) {
        this.w = n2;
    }

    public boolean y() {
        return this.F;
    }

    public int p() {
        return this.w;
    }

    public HeadIcon l() {
        RSNPCComposition rSNPCComposition = (RSNPCComposition)this.t.getComposition();
        if rSNPCComposition != null {
            short[] sArray = rSNPCComposition.getRsOverheadIcons();
            return HeadIcon.values()[sArray[3]];
        }
        return null;
    }

    public void a(boolean bl) {
        this.z = bl;
    }

    public int o() {
        return this.v;
    }

    public void d(boolean bl) {
        this.F = bl;
    }

    public void e(boolean bl) {
        this.G = bl;
    }

    public boolean v() {
        return this.C;
    }

    public int q() {
        return this.x;
    }
}

