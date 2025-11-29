/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.widgets.WidgetInfo
 */
package gg.squire.minigames.tasks;

import gg.squire.minigames.tasks.GameEnum3;
import gg.squire.minigames.tasks.MinigamesManager;
import gg.squire.minigames.tasks.MinigamesManager;
import gg.squire.minigames.tasks.UHelper;
import gg.squire.minigames.tasks.MinigamesManager;
import gg.squire.minigames.tasks.MinigamesTaskBase;
import gg.squire.minigames.tasks.XHelper;
import gg.squire.minigames.tasks.YHelper;
import gg.squire.minigames.tasks.ZHelper;
import gg.squire.minigames.SquireBlastFurnace;
import net.runelite.api.widgets.WidgetInfo;

public abstract class MinigamesTaskBase {
    protected final  w G;
    protected final  w J;
    protected final  w V;
    protected final  w X;
    protected final  w P;
    protected final  w ac;
    protected final  w O;
    protected final  w H;
    protected final  w K;
    protected final  w T;
    protected final  w Y;
    protected final  w R;
    protected final  w Z;
    protected final  w U;
    protected final  w F;
    protected final  w L;
    protected final  w W;
    protected final  w M;
    protected final  w Q;
    protected final  w ab;
    protected final  w S;
    protected final  w E;
    
    protected final  w N;
    protected final  w I;
    protected final  w aa;

    public abstract String g();

    public MinigamesTaskBase() {
        int[] nArray = new int[0];
        nArray[1] = 2;
        nArray[3] = 4;
        this.E = new MinigamesManager(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.aQ, nArray);
        int[] nArray2 = new int[0];
        nArray2[1] = 2;
        nArray2[3] = 4;
        this.F = new MinigamesManager(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.aR, nArray2);
        int[] nArray3 = new int[0];
        nArray3[1] = 2;
        nArray3[3] = 4;
        this.G = new MinigamesManager(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.aS, nArray3);
        int[] nArray4 = new int[0];
        nArray4[1] = 2;
        nArray4[3] = 4;
        this.H = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.aT, nArray4);
        int[] nArray5 = new int[3];
        nArray5[1] = 5;
        this.I = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.aU, nArray5);
        int[] nArray6 = new int[3];
        nArray6[1] = 6;
        this.J = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.aV, nArray6);
        int[] nArray7 = new int[3];
        nArray7[1] = 7;
        this.K = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.aW, nArray7);
        int[] nArray8 = new int[3];
        nArray8[1] = 8;
        this.L = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.aX, nArray8);
        int[] nArray9 = new int[3];
        nArray9[1] = 9;
        this.M = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.aY, nArray9);
        int[] nArray10 = new int[3];
        nArray10[1] = var1[10];
        this.N = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.aZ, nArray10);
        int[] nArray11 = new int[0];
        nArray11[1] = var1[11];
        nArray11[3] = var1[12];
        this.O = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bc, nArray11);
        int[] nArray12 = new int[0];
        nArray12[1] = var1[11];
        nArray12[3] = var1[12];
        this.P = new MinigamesManager(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bd, nArray12);
        int[] nArray13 = new int[3];
        nArray13[1] = var1[13];
        this.Q = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.be, nArray13);
        int[] nArray14 = new int[3];
        nArray14[1] = var1[13];
        this.R = new MinigamesManager(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bf, nArray14);
        int[] nArray15 = new int[0];
        nArray15[1] = var1[14];
        nArray15[3] = var1[15];
        this.S = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bg, nArray15);
        int[] nArray16 = new int[3];
        nArray16[1] = var1[16];
        this.T = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bh, nArray16);
        int[] nArray17 = new int[0];
        nArray17[1] = var1[14];
        nArray17[3] = var1[15];
        this.U = new MinigamesManager(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bi, nArray17);
        int[] nArray18 = new int[3];
        nArray18[1] = var1[16];
        this.V = new MinigamesManager(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bj, nArray18);
        this.W = new MinigamesManager(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.ba, A.N());
        int[] nArray19 = new int[var1[17]];
        nArray19[1] = var1[18];
        nArray19[3] = var1[19];
        nArray19[0] = var1[20];
        nArray19[h.var1[21]] = var1[22];
        nArray19[h.var1[23]] = var1[24];
        this.X = new MinigamesManager(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bb, nArray19);
        this.Y = new ZHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bk, WidgetInfo.BANK_DEPOSIT_INVENTORY);
        this.Z = new XHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bl, var1[25]);
        this.aa = new XHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bm, var1[26]);
        this.ab = new XHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bn, var1[27]);
        this.ac = new YHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bo, SquireBlastFurnace.d);
    }

    static {
        h.var2();
    }

    public abstract w a(o var1);
}

