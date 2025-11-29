/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import net.runelite.api.NPC;

public class aa {
    public static final /* synthetic */ int cw;
    private static /* synthetic */ int[] lIIIllIII;
    private final /* synthetic */ NPC cx;

    private static void llllIIlIII() {
        lIIIllIII = new int[3];
        aa.lIIIllIII[0] = -(0xFFFF9FFD & 0x792F) & (0xFFFF9FFF & 0x7DFE);
        aa.lIIIllIII[1] = " ".length();
        aa.lIIIllIII[2] = (0x87 ^ 0x94) & ~(0x5B ^ 0x48);
    }

    public boolean bc() {
        int n2;
        if (aa.llllIIlIIl(this.cx) && (!aa.llllIIlIlI(this.cx.isDead() ? 1 : 0) || aa.llllIIllII(this.cx.getAnimation(), lIIIllIII[0]))) {
            n2 = lIIIllIII[1];
            "".length();
            if (((0x43 ^ 0x6C) & ~(0x80 ^ 0xAF)) >= (0x20 ^ 0x24)) {
                return ((0x96 ^ 0x8C) & ~(0xB7 ^ 0xAD)) != 0;
            }
        } else {
            n2 = lIIIllIII[2];
        }
        return n2 != 0;
    }

    public boolean bb() {
        int n2;
        if (aa.llllIIlIIl(this.cx) && aa.llllIIlIlI(this.cx.isDead() ? 1 : 0) && aa.llllIIlIll(this.cx.getAnimation(), lIIIllIII[0])) {
            n2 = lIIIllIII[1];
            "".length();
            if ((0x2B ^ 0x2F) == ((0x4F ^ 0x5B) & ~(0 ^ 0x14))) {
                return ((6 ^ 0x10) & ~(0xAD ^ 0xBB)) != 0;
            }
        } else {
            n2 = lIIIllIII[2];
        }
        return n2 != 0;
    }

    public aa(NPC nPC) {
        this.cx = nPC;
    }

    private static boolean llllIIlIll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llllIIlIIl(Object object) {
        return object != null;
    }

    public NPC y() {
        return this.cx;
    }

    static {
        aa.llllIIlIII();
        cw = lIIIllIII[0];
    }

    private static boolean llllIIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean llllIIllII(int n2, int n3) {
        return n2 == n3;
    }
}

