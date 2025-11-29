/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 */
package m.e.a.i.z.m.r.-.q.s.y.u;

import net.runelite.api.NPC;

public class d_Unknown {
    public static final /* synthetic */ int l;
    private final /* synthetic */ NPC m;
    private static /* synthetic */ int[] lIllIIllIIlII;

    private static boolean llIIIllIlIIIIll(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIllIlIIIIlI(Object object) {
        return object != null;
    }

    public boolean l() {
        int n2;
        if (d.llIIIllIlIIIIlI(this.m) && (!d.llIIIllIlIIIIll(this.m.isDead() ? 1 : 0) || d.llIIIllIlIIIlIl(this.m.getAnimation(), lIllIIllIIlII[0]))) {
            n2 = lIllIIllIIlII[1];
            0;
            if (1 <= ((0x9C ^ 0x80) & ~(0x94 ^ 0x88))) {
                return false;
            }
        } else {
            n2 = lIllIIllIIlII[2];
        }
        return n2 != 0;
    }

    public boolean k() {
        int n2;
        if (d.llIIIllIlIIIIlI(this.m) && d.llIIIllIlIIIIll(this.m.isDead() ? 1 : 0) && d.llIIIllIlIIIlII(this.m.getAnimation(), lIllIIllIIlII[0])) {
            n2 = lIllIIllIIlII[1];
            0;
            if ((0xB2 ^ 0xA2 ^ (0xD6 ^ 0xC3)) <= 0) {
                return ((34 + 66 - -83 + 25 ^ 106 + 105 - 192 + 110) & (0xE8 ^ 0xB7 ^ (0x1A ^ 0x14) ^ -1)) != 0;
            }
        } else {
            n2 = lIllIIllIIlII[2];
        }
        return n2 != 0;
    }

    static {
        d.llIIIllIlIIIIIl();
        l = lIllIIllIIlII[0];
    }

    private static void llIIIllIlIIIIIl() {
        lIllIIllIIlII = new int[3];
        d.lIllIIllIIlII[0] = -(0xFFFFF31F & 0x6CF3) & (0xFFFFFB3F & 0x7FF7);
        d.lIllIIllIIlII[1] = 1;
        d.lIllIIllIIlII[2] = (0xD9 ^ 0xC6 ^ (0x67 ^ 0x56)) & (0xE7 ^ 0x89 ^ (0x17 ^ 0x57) ^ -1);
    }

    private static boolean llIIIllIlIIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    public d(NPC nPC) {
        this.m = nPC;
    }

    public NPC m() {
        return this.m;
    }

    private static boolean llIIIllIlIIIlII(int n2, int n3) {
        return n2 != n3;
    }
}

