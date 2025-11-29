/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.game.Vars
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import net.unethicalite.api.game.Vars;

public class v_Unknown {
    private static /* synthetic */ int[] lIlIlIIlIlll;

    public static boolean br() {
        boolean bl2;
        if (v.llIlllIlIIlIII(Vars.getBit((int)lIlIlIIlIlll[2]), lIlIlIIlIlll[3])) {
            bl2 = lIlIlIIlIlll[3];
            0;
            
            }
        } else {
            bl2 = lIlIlIIlIlll[4];
        }
        return bl2;
    }

    public static int bu() {
        return Vars.getBit((int)lIlIlIIlIlll[7]);
    }

    public static int bt() {
        return Vars.getBit((int)lIlIlIIlIlll[6]);
    }

    private static void llIlllIlIIIlll() {
        lIlIlIIlIlll = new int[9];
        v.lIlIlIIlIlll[0] = -(0xFFFFEF67 & 0x78FD) & (0xFFFFFDFF & 0x6FF7);
        v.lIlIlIIlIlll[1] = -(0xFFFFEFC7 & 0x583E) & (0xFFFFFF7F & 0x5DB5);
        v.lIlIlIIlIlll[2] = 0xFFFFD76F & 0x3DBF;
        v.lIlIlIIlIlll[3] = 1;
        v.lIlIlIIlIlll[4] = (0xF2 ^ 0xBF) & ~(0x28 ^ 0x65);
        v.lIlIlIIlIlll[5] = -(0xFFFFF39F & 0x5C63) & (0xFFFFFFFF & Short.MAX_VALUE);
        v.lIlIlIIlIlll[6] = -(0xFFFFFCDF & 0x6367) & (0xFFFFF57F & Short.MAX_VALUE);
        v.lIlIlIIlIlll[7] = 0xFFFF9DB7 & 0x777A;
        v.lIlIlIIlIlll[8] = -(0xFFFFEEC5 & 0x73FB) & (0xFFFFF7F3 & Short.MAX_VALUE);
    }

    public static int bq() {
        return Vars.getBit((int)lIlIlIIlIlll[1]);
    }

    static {
        v.llIlllIlIIIlll();
    }

    public static int bs() {
        return Vars.getBit((int)lIlIlIIlIlll[5]);
    }

    private static boolean llIlllIlIIlIII(int n2, int n3) {
        return n2 == n3;
    }

    public static int bp() {
        return Vars.getVarp((int)lIlIlIIlIlll[0]);
    }

    public static int bv() {
        return Vars.getBit((int)lIlIlIIlIlll[8]);
    }
}

