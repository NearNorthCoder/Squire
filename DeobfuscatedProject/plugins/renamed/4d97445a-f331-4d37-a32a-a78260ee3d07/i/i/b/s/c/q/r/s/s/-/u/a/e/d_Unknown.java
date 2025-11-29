/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import i.i.b.s.c.q.r.s.s.-.u.a.e.B_Unknown;
import i.i.b.s.c.q.r.s.s.-.u.a.e.EEnum;
import i.i.b.s.c.q.r.s.s.-.u.a.e.IEnum;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.NPC;

public class d_Unknown {
    private /* synthetic */ e V;
    private /* synthetic */ int Z;
    private final /* synthetic */ NPC R;
    private /* synthetic */ e Y;
    private static final /* synthetic */ int O;
    private final /* synthetic */ List<i> Q;
    private static final /* synthetic */ int N;
    private /* synthetic */ long X;
    private /* synthetic */ int T;
    private static /* synthetic */ int[] lIIllIlll;
    private /* synthetic */ i U;
    private static final /* synthetic */ int P;
    private /* synthetic */ int W;
    private /* synthetic */ int S;

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

    private static void lIIIlIIIlII() {
        lIIllIlll = new int[8];
        d.lIIllIlll[0] = -(0xFFFFF767 & 0x39BB) & (0xFFFFB3FE & 0x7F7B);
        d.lIIllIlll[1] = 1;
        d.lIIllIlll[2] = -1;
        d.lIIllIlll[3] = 0x9C ^ 0x96;
        d.lIIllIlll[4] = 0x54 ^ 0x12 ^ (2 ^ 0x43);
        d.lIIllIlll[5] = 0xFFFFF19F & 0xFF0;
        d.lIIllIlll[6] = 0x11 ^ 0x14;
        d.lIIllIlll[7] = 190 + 73 - 215 + 152;
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

