/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 */
package q.s.r.i.e.s.o.u.a.d.n.-.b;

import net.runelite.api.NPC;

public class a {
    private static /* synthetic */ int[] llIllllIllI;
    public static final /* synthetic */ int f;
    private final /* synthetic */ NPC g;

    public boolean a() {
        int n2;
        if (a.lIlIllIIIIllIl(this.g) && a.lIlIllIIIIlllI(this.g.isDead() ? 1 : 0) && a.lIlIllIIIIllll(this.g.getAnimation(), llIllllIllI[0])) {
            n2 = llIllllIllI[1];
            "".length();
            if (null != null) {
                return ((0xF4 ^ 0xA6) & ~(0x3C ^ 0x6E)) != 0;
            }
        } else {
            n2 = llIllllIllI[2];
        }
        return n2 != 0;
    }

    private static boolean lIlIllIIIIlllI(int n2) {
        return n2 == 0;
    }

    public a(NPC nPC) {
        this.g = nPC;
    }

    private static void lIlIllIIIIllII() {
        llIllllIllI = new int[3];
        a.llIllllIllI[0] = -(0xFFFFEFD9 & 0x54B7) & (0xFFFFFFFD & 0x5FFE);
        a.llIllllIllI[1] = " ".length();
        a.llIllllIllI[2] = (0x40 ^ 0x63 ^ (0x22 ^ 6)) & (16 + 23 - 38 + 160 ^ 161 + 44 - 42 + 3 ^ -" ".length());
    }

    public NPC c() {
        return this.g;
    }

    static {
        a.lIlIllIIIIllII();
        f = llIllllIllI[0];
    }

    private static boolean lIlIllIIIIllIl(Object object) {
        return object != null;
    }

    private static boolean lIlIllIIIIllll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIllIIIlIIII(int n2, int n3) {
        return n2 == n3;
    }

    public boolean b() {
        int n2;
        if (a.lIlIllIIIIllIl(this.g) && (!a.lIlIllIIIIlllI(this.g.isDead() ? 1 : 0) || a.lIlIllIIIlIIII(this.g.getAnimation(), llIllllIllI[0]))) {
            n2 = llIllllIllI[1];
            "".length();
            if ("   ".length() < 0) {
                return ((0 + 33 - -21 + 74 ^ 53 + 61 - 47 + 126) & (144 + 40 - 117 + 129 ^ 107 + 71 - 116 + 71 ^ -" ".length())) != 0;
            }
        } else {
            n2 = llIllllIllI[2];
        }
        return n2 != 0;
    }
}

