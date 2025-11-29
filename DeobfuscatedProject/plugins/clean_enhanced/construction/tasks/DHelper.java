/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 */
package gg.squire.construction.tasks;

import gg.squire.construction.tasks.BHelper;
import gg.squire.construction.tasks.GameEnum20;
import gg.squire.construction.tasks.GameEnum9;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.NPC;

public class DHelper {
    private  e V;
    private  int Z;
    private final  NPC R;
    private  e Y;
    private static final  int O;
    private final  List<i> Q;
    private static final  int N;
    private  long X;
    private  int T;
    private static  int[] lIIllIlll;
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

    public void DHelper(int n2) {
        this.W = n2;
    }

    private static void var1() {
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

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    public i B() {
        return this.U;
    }

    public DHelper(NPC nPC) {
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
        if (d.var3(n2, lIIllIlll[2])) {
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
        d.var1();
        O = lIIllIlll[5];
        N = lIIllIlll[0];
        P = lIIllIlll[7];
    }

    private static boolean var4(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    public i a(int n2, int n3) {
        void var5;
        void var6;
        int n4 = this.S + n2;
        if (d.var2(n4)) {
            return i.SPAWNING;
        }
        if (d.var2((int)((var6 - lIIllIlll[1]) % lIIllIlll[3]))) {
            return i.TRIPLE;
        }
        if (d.var2((int)(var6 % lIIllIlll[4])) && d.var4((int)var5, lIIllIlll[5])) {
            return i.GHOSTS;
        }
        if (d.var2((int)(var6 % lIIllIlll[6])) && d.var4((int)var5, lIIllIlll[7])) {
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

    private static boolean var3(int n2, int n3) {
        return n2 != n3;
    }

    public void a(int n2, e e2) {
        this.T = n2;
        this.V = e2;
    }
}

