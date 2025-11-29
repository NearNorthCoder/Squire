/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.widgets.WidgetInfo
 */
package gg.squire.minigames.tasks;

import gg.squire.minigames.tasks.GameEnum21;
import gg.squire.minigames.tasks.IHelper;
import gg.squire.minigames.tasks.OHelper;
import gg.squire.minigames.tasks.UHelper;
import gg.squire.minigames.tasks.VHelper;
import gg.squire.minigames.tasks.MinigamesTaskBase;
import gg.squire.minigames.tasks.XHelper;
import gg.squire.minigames.tasks.YHelper;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.z;
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
        int[] nArray = new int[lIIlllIIlIII[0]];
        nArray[h.lIIlllIIlIII[1]] = lIIlllIIlIII[2];
        nArray[h.lIIlllIIlIII[3]] = lIIlllIIlIII[4];
        this.E = new VHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.aQ, nArray);
        int[] nArray2 = new int[lIIlllIIlIII[0]];
        nArray2[h.lIIlllIIlIII[1]] = lIIlllIIlIII[2];
        nArray2[h.lIIlllIIlIII[3]] = lIIlllIIlIII[4];
        this.F = new VHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.aR, nArray2);
        int[] nArray3 = new int[lIIlllIIlIII[0]];
        nArray3[h.lIIlllIIlIII[1]] = lIIlllIIlIII[2];
        nArray3[h.lIIlllIIlIII[3]] = lIIlllIIlIII[4];
        this.G = new VHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.aS, nArray3);
        int[] nArray4 = new int[lIIlllIIlIII[0]];
        nArray4[h.lIIlllIIlIII[1]] = lIIlllIIlIII[2];
        nArray4[h.lIIlllIIlIII[3]] = lIIlllIIlIII[4];
        this.H = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.aT, nArray4);
        int[] nArray5 = new int[lIIlllIIlIII[3]];
        nArray5[h.lIIlllIIlIII[1]] = lIIlllIIlIII[5];
        this.I = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.aU, nArray5);
        int[] nArray6 = new int[lIIlllIIlIII[3]];
        nArray6[h.lIIlllIIlIII[1]] = lIIlllIIlIII[6];
        this.J = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.aV, nArray6);
        int[] nArray7 = new int[lIIlllIIlIII[3]];
        nArray7[h.lIIlllIIlIII[1]] = lIIlllIIlIII[7];
        this.K = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.aW, nArray7);
        int[] nArray8 = new int[lIIlllIIlIII[3]];
        nArray8[h.lIIlllIIlIII[1]] = lIIlllIIlIII[8];
        this.L = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.aX, nArray8);
        int[] nArray9 = new int[lIIlllIIlIII[3]];
        nArray9[h.lIIlllIIlIII[1]] = lIIlllIIlIII[9];
        this.M = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.aY, nArray9);
        int[] nArray10 = new int[lIIlllIIlIII[3]];
        nArray10[h.lIIlllIIlIII[1]] = lIIlllIIlIII[10];
        this.N = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.aZ, nArray10);
        int[] nArray11 = new int[lIIlllIIlIII[0]];
        nArray11[h.lIIlllIIlIII[1]] = lIIlllIIlIII[11];
        nArray11[h.lIIlllIIlIII[3]] = lIIlllIIlIII[12];
        this.O = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bc, nArray11);
        int[] nArray12 = new int[lIIlllIIlIII[0]];
        nArray12[h.lIIlllIIlIII[1]] = lIIlllIIlIII[11];
        nArray12[h.lIIlllIIlIII[3]] = lIIlllIIlIII[12];
        this.P = new VHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bd, nArray12);
        int[] nArray13 = new int[lIIlllIIlIII[3]];
        nArray13[h.lIIlllIIlIII[1]] = lIIlllIIlIII[13];
        this.Q = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.be, nArray13);
        int[] nArray14 = new int[lIIlllIIlIII[3]];
        nArray14[h.lIIlllIIlIII[1]] = lIIlllIIlIII[13];
        this.R = new VHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bf, nArray14);
        int[] nArray15 = new int[lIIlllIIlIII[0]];
        nArray15[h.lIIlllIIlIII[1]] = lIIlllIIlIII[14];
        nArray15[h.lIIlllIIlIII[3]] = lIIlllIIlIII[15];
        this.S = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bg, nArray15);
        int[] nArray16 = new int[lIIlllIIlIII[3]];
        nArray16[h.lIIlllIIlIII[1]] = lIIlllIIlIII[16];
        this.T = new UHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bh, nArray16);
        int[] nArray17 = new int[lIIlllIIlIII[0]];
        nArray17[h.lIIlllIIlIII[1]] = lIIlllIIlIII[14];
        nArray17[h.lIIlllIIlIII[3]] = lIIlllIIlIII[15];
        this.U = new VHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bi, nArray17);
        int[] nArray18 = new int[lIIlllIIlIII[3]];
        nArray18[h.lIIlllIIlIII[1]] = lIIlllIIlIII[16];
        this.V = new VHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bj, nArray18);
        this.W = new VHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.ba, A.N());
        int[] nArray19 = new int[lIIlllIIlIII[17]];
        nArray19[h.lIIlllIIlIII[1]] = lIIlllIIlIII[18];
        nArray19[h.lIIlllIIlIII[3]] = lIIlllIIlIII[19];
        nArray19[h.lIIlllIIlIII[0]] = lIIlllIIlIII[20];
        nArray19[h.lIIlllIIlIII[21]] = lIIlllIIlIII[22];
        nArray19[h.lIIlllIIlIII[23]] = lIIlllIIlIII[24];
        this.X = new VHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bb, nArray19);
        this.Y = new z(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bk, WidgetInfo.BANK_DEPOSIT_INVENTORY);
        this.Z = new XHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bl, lIIlllIIlIII[25]);
        this.aa = new XHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bm, lIIlllIIlIII[26]);
        this.ab = new XHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bn, lIIlllIIlIII[27]);
        this.ac = new YHelper(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bo, SquireBlastFurnace.d);
    }

    static {
        h.llIlIIIIIIllII();
    }

    public abstract w a(o var1);
}

