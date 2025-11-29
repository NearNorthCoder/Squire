/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import net.runelite.api.NPC;

public class q {
    private static /* synthetic */ int[] lIlIIlIllIIl;
    private /* synthetic */ NPC bA;
    private /* synthetic */ boolean bC;

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        boolean bl2;
        q lllllllllllllllIllIllIIlllIllIIl;
        void lllllllllllllllIllIllIIlllIllIII;
        if (q.llIllIIlIllllI(object, this)) {
            return lIlIIlIllIIl[1];
        }
        if (q.llIllIIlIlllll(lllllllllllllllIllIllIIlllIllIII instanceof q)) {
            return lIlIIlIllIIl[0];
        }
        q lllllllllllllllIllIllIIlllIlIlll = (q)lllllllllllllllIllIllIIlllIllIII;
        if (q.llIllIIllIIIII(lllllllllllllllIllIllIIlllIlIlll.aP().getIndex(), lllllllllllllllIllIllIIlllIllIIl.aP().getIndex())) {
            bl2 = lIlIIlIllIIl[1];
            "".length();
            if (-"  ".length() >= 0) {
                return ((0x5E ^ 9 ^ (0xE5 ^ 0x9C)) & (0x6C ^ 0x17 ^ (0x17 ^ 0x42) ^ -" ".length())) != 0;
            }
        } else {
            bl2 = lIlIIlIllIIl[0];
        }
        return bl2;
    }

    private static boolean llIllIIlIllllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIllIIlIlllll(int n2) {
        return n2 == 0;
    }

    private static void llIllIIlIlllIl() {
        lIlIIlIllIIl = new int[2];
        q.lIlIIlIllIIl[0] = (0xF2 ^ 0xAC) & ~(0x63 ^ 0x3D);
        q.lIlIIlIllIIl[1] = " ".length();
    }

    public void g(boolean bl2) {
        this.bC = bl2;
    }

    public boolean aR() {
        return this.bC;
    }

    static {
        q.llIllIIlIlllIl();
    }

    public void a(NPC nPC) {
        this.bA = nPC;
    }

    public q(NPC nPC) {
        this.bA = nPC;
        this.bC = lIlIIlIllIIl[0];
    }

    public NPC aP() {
        return this.bA;
    }

    private static boolean llIllIIllIIIII(int n2, int n3) {
        return n2 == n3;
    }
}

