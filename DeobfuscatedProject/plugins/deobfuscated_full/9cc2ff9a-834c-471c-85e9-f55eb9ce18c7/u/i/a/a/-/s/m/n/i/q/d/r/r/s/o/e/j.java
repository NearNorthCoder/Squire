/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 */
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

import net.runelite.api.NPC;

public class j {
    private final /* synthetic */ NPC x;
    private static /* synthetic */ int[] lIIlIlIlIIlll;
    public static final /* synthetic */ int w;

    public boolean B() {
        int n2;
        if (j.lIlIlIlllllllIl(this.x) && (!j.lIlIlIllllllllI(this.x.isDead() ? 1 : 0) || j.lIlIllIIIIIIIII(this.x.getAnimation(), lIIlIlIlIIlll[0]))) {
            n2 = lIIlIlIlIIlll[1];
            0;
            
            }
        } else {
            n2 = lIIlIlIlIIlll[2];
        }
        return n2 != 0;
    }

    private static boolean lIlIlIlllllllIl(Object object) {
        return object != null;
    }

    public boolean A() {
        int n2;
        if (j.lIlIlIlllllllIl(this.x) && j.lIlIlIllllllllI(this.x.isDead() ? 1 : 0) && j.lIlIlIlllllllll(this.x.getAnimation(), lIIlIlIlIIlll[0])) {
            n2 = lIIlIlIlIIlll[1];
            0;
            if (3 <= 2) {
                return false;
            }
        } else {
            n2 = lIIlIlIlIIlll[2];
        }
        return n2 != 0;
    }

    private static boolean lIlIlIllllllllI(int n2) {
        return n2 == 0;
    }

    public j(NPC nPC) {
        this.x = nPC;
    }

    private static void lIlIlIlllllllII() {
        lIIlIlIlIIlll = new int[3];
        j.lIIlIlIlIIlll[0] = 0xFFFF9FB8 & 0x7B7F;
        j.lIIlIlIlIIlll[1] = 1;
        j.lIIlIlIlIIlll[2] = (0x29 ^ 0x71) & ~(0x1C ^ 0x44);
    }

    private static boolean lIlIlIlllllllll(int n2, int n3) {
        return n2 != n3;
    }

    public NPC C() {
        return this.x;
    }

    private static boolean lIlIllIIIIIIIII(int n2, int n3) {
        return n2 == n3;
    }

    static {
        j.lIlIlIlllllllII();
        w = lIIlIlIlIIlll[0];
    }
}

