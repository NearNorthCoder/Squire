/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 */
package gg.squire.construction.tasks;

import i.i.b.s.c.q.r.s.s.-.u.a.e.B;
import gg.squire.construction.tasks.GameEnum93;
import gg.squire.construction.tasks.GameEnum49;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.NPC;

public class d {
    private  e V;
    private  int Z;
    private final  NPC R;
    private  e Y;
    private static final  int O;
    private final  List<i> Q;
    private static final  int N;
    private  long X;
    private  int T;
    
    private  i U;
    private static final  int P;
    private  int W;
    private  int S;

    public e F() {
        return this.Y;
    }

    public int A() {
        return this.T;
    }

    public void a(e e2) {
        this.Y = e2;
    }

    public void d(int n2) {
        this.W = n2;
    }

    public int z() {
        return this.S;
    }

    public e C() {
        return this.V;
    }

    private static boolean lIIIlIIIllI(int n2) {
        return n2 == 0;
    }

    public i B() {
        return this.U;
    }

    public d(NPC nPC) {
        this.R = nPC;
        this.Q = new ArrayList<i>();
        this.U = i.SPAWNING;
        this.Z = lIIllIlll[0];
    }

    public void a(long l2) {
        this.X = l2;
    }

    public NPC y() {
        return this.R;
    }

    public int w() {
        int n2 = B.a(this.R.getHealthRatio(), this.R.getHealthScale(), lIIllIlll[0]);
        if (d.lIIIlIIIlIl(n2, lIIllIlll[2])) {
            this.Z = n2;
        }
        return this.Z;
    }

    public List<i> x() {
        return this.Q;
    }

    public void b(i i2) {
        this.S += lIIllIlll[1];
        this.U = i2;
    }

    static {
        d.lIIIlIIIlII();
        O = lIIllIlll[5];
        N = lIIllIlll[0];
        P = lIIllIlll[7];
    }

    private static boolean lIIIlIIIlll(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    public i a(int n2, int n3) {
        void llIIIlIlIllllll;
        void llIIIlIlIlllllI;
        int n4 = this.S + n2;
        if (d.lIIIlIIIllI(n4)) {
            return i.SPAWNING;
        }
        if (d.lIIIlIIIllI((int)((llIIIlIlIlllllI - lIIllIlll[1]) % lIIllIlll[3]))) {
            return i.TRIPLE;
        }
        if (d.lIIIlIIIllI((int)(llIIIlIlIlllllI % lIIllIlll[4])) && d.lIIIlIIIlll((int)llIIIlIlIllllll, lIIllIlll[5])) {
            return i.GHOSTS;
        }
        if (d.lIIIlIIIllI((int)(llIIIlIlIlllllI % lIIllIlll[6])) && d.lIIIlIIIlll((int)llIIIlIlIllllll, lIIllIlll[7])) {
            return i.LAVA;
        }
        return i.AUTO;
    }

    public long E() {
        return this.X;
    }

    public int D() {
        return this.W;
    }

    private static boolean lIIIlIIIlIl(int n2, int n3) {
        return n2 != n3;
    }

    public void a(int n2, e e2) {
        this.T = n2;
        this.V = e2;
    }
}

