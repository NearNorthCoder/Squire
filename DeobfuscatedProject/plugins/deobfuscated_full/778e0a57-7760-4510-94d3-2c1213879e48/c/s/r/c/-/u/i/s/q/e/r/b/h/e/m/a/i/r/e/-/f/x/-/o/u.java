/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Singleton
 *  net.unethicalite.api.game.Vars
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.F;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.v;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.w;
import com.google.inject.Singleton;
import net.unethicalite.api.game.Vars;

@Singleton
public class u {
    private static final /* synthetic */ int bG;
    private static /* synthetic */ int[] lIlIlIllllll;
    private static final /* synthetic */ int bF;
    private static final /* synthetic */ int bE;

    private static boolean llIllllllIIlII(int n2) {
        return n2 != 0;
    }

    static {
        u.llIllllllIIIIl();
        bG = lIlIlIllllll[0];
        bE = lIlIlIllllll[3];
        bF = lIlIlIllllll[6];
    }

    public static boolean bf() {
        boolean bl2;
        if (u.llIllllllIIIll((Object)u.bh(), (Object)w.WAITING_FOR_LEADER_TO_START)) {
            bl2 = lIlIlIllllll[1];
            0;
            if (2 <= 0) {
                return false;
            }
        } else {
            bl2 = lIlIlIllllll[2];
        }
        return bl2;
    }

    public static int bj() {
        return Vars.getBit((int)lIlIlIllllll[5]);
    }

    public static F bi() {
        int n2 = lIlIlIllllll[4];
        switch (n2) {
            case 1: {
                return F.SMALL;
            }
            case 2: {
                return F.MEDIUM;
            }
            case 3: {
                return F.LARGE;
            }
            case 4: {
                return F.MASSIVE;
            }
        }
        return F.TINY;
    }

    private static boolean llIllllllIIIll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llIllllllIIlIl(int n2, int n3) {
        return n2 != n3;
    }

    private static void llIllllllIIIIl() {
        lIlIlIllllll = new int[10];
        u.lIlIlIllllll[0] = 0xFFFFD7FF & 0x3D38;
        u.lIlIlIllllll[1] = 1;
        u.lIlIlIllllll[2] = (0x5D ^ 0x6E) & ~(0xF1 ^ 0xC2);
        u.lIlIlIllllll[3] = 0xFFFFD5B3 & 0x3F7D;
        u.lIlIlIllllll[4] = -1;
        u.lIlIlIllllll[5] = -(0xFFFFFF53 & 0x27AE) & (0xFFFFFFF7 & 0x3FFB);
        u.lIlIlIllllll[6] = 0xFFFF9AF3 & 0x7DFD;
        u.lIlIlIllllll[7] = 0xFFFF9FE8 & 0x7537;
        u.lIlIlIllllll[8] = -(0xFFFFCBB6 & 0x7C5B) & (0xFFFFDFFF & 0x7D3F);
        u.lIlIlIllllll[9] = 0xFFFFBFB7 & 0x557F;
    }

    private static boolean llIllllllIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    public static int bo() {
        return Vars.getBit((int)lIlIlIllllll[8]);
    }

    public static boolean bn() {
        boolean bl2;
        if (u.llIllllllIIlIl(v.bp(), lIlIlIllllll[4])) {
            bl2 = lIlIlIllllll[1];
            0;
            
            }
        } else {
            bl2 = lIlIlIllllll[2];
        }
        return bl2;
    }

    public static boolean bl() {
        boolean bl2;
        if (u.llIllllllIIIlI(Vars.getBit((int)lIlIlIllllll[7]), lIlIlIllllll[1])) {
            bl2 = lIlIlIllllll[1];
            0;
            if (-3 > 0) {
                return ((0x95 ^ 0x9F ^ (0xA8 ^ 0x88)) & (125 + 121 - 162 + 58 ^ 145 + 0 - 141 + 160 ^ -1)) != 0;
            }
        } else {
            bl2 = lIlIlIllllll[2];
        }
        return bl2;
    }

    public static w bh() {
        switch (u.bg()) {
            case 0: {
                return w.WAITING_FOR_LEADER_TO_START;
            }
            case 1: {
                return w.EXPLORING_UPPER_LEVEL;
            }
            case 2: {
                if (u.llIllllllIIlII(u.bk() ? 1 : 0)) {
                    return w.REACHED_MIDDLE_LEVEL;
                }
                return w.REACHED_LOWER_LEVEL;
            }
            case 3: {
                return w.REACHED_LOWER_LEVEL;
            }
            case 4: {
                return w.REACHED_BOTTOM;
            }
        }
        return w.GET_OUT;
    }

    public static boolean bm() {
        boolean bl2;
        if (u.llIllllllIIIlI(v.bq(), lIlIlIllllll[1])) {
            bl2 = lIlIlIllllll[1];
            0;
            if ((0 ^ 0x5F ^ (0x5F ^ 4)) == 1) {
                return ((0xC4 ^ 0x99 ^ (0x7A ^ 0x3B)) & (140 + 31 - 94 + 88 ^ 37 + 61 - -83 + 4 ^ -1)) != 0;
            }
        } else {
            bl2 = lIlIlIllllll[2];
        }
        return bl2;
    }

    public static boolean bk() {
        boolean bl2;
        if (u.llIllllllIIIlI(Vars.getBit((int)lIlIlIllllll[6]), lIlIlIllllll[1])) {
            bl2 = lIlIlIllllll[1];
            0;
            if (((139 + 155 - 185 + 57 ^ 47 + 27 - -54 + 14) & (0xE2 ^ 0x9E ^ (0xE3 ^ 0xB7) ^ -1)) != 0) {
                return ((0xF ^ 0x5F ^ (0x52 ^ 0x1B)) & (92 + 6 - -13 + 17 ^ 116 + 141 - 253 + 149 ^ -1)) != 0;
            }
        } else {
            bl2 = lIlIlIllllll[2];
        }
        return bl2;
    }

    public static boolean be() {
        boolean bl2;
        if (u.llIllllllIIIlI(Vars.getBit((int)lIlIlIllllll[0]), lIlIlIllllll[1])) {
            bl2 = lIlIlIllllll[1];
            0;
            if (((0xAE ^ 0x9E) & ~(0x64 ^ 0x54)) != 0) {
                return false;
            }
        } else {
            bl2 = lIlIlIllllll[2];
        }
        return bl2;
    }

    public static int U() {
        return Vars.getBit((int)lIlIlIllllll[9]);
    }

    public static int bg() {
        return Vars.getBit((int)lIlIlIllllll[3]);
    }
}

