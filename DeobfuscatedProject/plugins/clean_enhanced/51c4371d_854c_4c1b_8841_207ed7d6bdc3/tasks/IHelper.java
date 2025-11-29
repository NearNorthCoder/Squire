/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks;

public class IHelper {
    public static  int bx;
    public static  int by;
    private static  int[] llIlllIl;
    public static  int bw;

    private static void var1() {
        llIlllIl = new int[3];
        i.llIlllIl[0] = -(0xFFFFFA34 & 0xDCF) & (0xFFFFFEB7 & 0x3FFB);
        i.llIlllIl[1] = -(0xFFFFF4F7 & 0x1BBE) & (0xFFFFFFFF & 0x1F8FD);
        i.llIlllIl[2] = -(0xFFFFA3FD & 0x7D16) & (0xFFFFF7F7 & 0x98BF9B);
    }

    static {
        i.var1();
        bw = llIlllIl[0];
        bx = llIlllIl[1];
        by = llIlllIl[2];
    }
}

