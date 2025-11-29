/*
 * Decompiled with CFR 0.152.
 */
package -.r.u.q.e.s.o.t.a.i;

import java.util.List;

public class b {
    private static /* synthetic */ int[] lIIllllIllIlI;
    public static final /* synthetic */ int q;
    public static final /* synthetic */ List<Integer> r;
    public static final /* synthetic */ int s;

    private static void lIllIlIIllIIlII() {
        lIIllllIllIlI = new int[4];
        b.lIIllllIllIlI[0] = -(0xFFFFBDAF & 0x737B) & (0xFFFFFBAF & 0x3DFF);
        b.lIIllllIllIlI[1] = 0xFFFFBFF7 & 0x6DDD;
        b.lIIllllIllIlI[2] = 0xFFFFE9DF & 0x1EAB;
        b.lIIllllIllIlI[3] = -(0xFFFFEF7A & 0x54A7) & (0xFFFFEDEF & 0x5EBD);
    }

    static {
        b.lIllIlIIllIIlII();
        q = lIIllllIllIlI[0];
        s = lIIllllIllIlI[1];
        r = List.of(Integer.valueOf(lIIllllIllIlI[2]), Integer.valueOf(lIIllllIllIlI[3]));
    }
}

