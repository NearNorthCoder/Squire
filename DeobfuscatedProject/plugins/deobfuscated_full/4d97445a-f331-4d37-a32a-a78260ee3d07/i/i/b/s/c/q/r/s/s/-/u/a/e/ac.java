/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import net.runelite.api.NPC;

public class ac {
    public static final /* synthetic */ int cA;
    private final /* synthetic */ NPC cB;
    private static /* synthetic */ int[] lIIIIlIl;

    public NPC y() {
        return this.cB;
    }

    public ac(NPC nPC) {
        this.cB = nPC;
    }

    private static boolean lIIIIIIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static void lllllllll() {
        lIIIIlIl = new int[3];
        ac.lIIIIlIl[0] = -(0xFFFFF3AE & 0x7F5B) & (0xFFFFF7DF & 0x7FFB);
        ac.lIIIIlIl[1] = 1;
        ac.lIIIIlIl[2] = (0x2A ^ 0x74) & ~(0x40 ^ 0x1E);
    }

    static {
        ac.lllllllll();
        cA = lIIIIlIl[0];
    }

    public boolean bc() {
        int n2;
        if (ac.lIIIIIIIII(this.cB) && (!ac.lIIIIIIIIl(this.cB.isDead() ? 1 : 0) || ac.lIIIIIIIll(this.cB.getAnimation(), lIIIIlIl[0]))) {
            n2 = lIIIIlIl[1];
            0;
            
            }
        } else {
            n2 = lIIIIlIl[2];
        }
        return n2 != 0;
    }

    private static boolean lIIIIIIIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIIIIIIII(Object object) {
        return object != null;
    }

    private static boolean lIIIIIIIIl(int n2) {
        return n2 == 0;
    }

    public boolean bb() {
        int n2;
        if (ac.lIIIIIIIII(this.cB) && ac.lIIIIIIIIl(this.cB.isDead() ? 1 : 0) && ac.lIIIIIIIlI(this.cB.getAnimation(), lIIIIlIl[0])) {
            n2 = lIIIIlIl[1];
            0;
            if (2 == 0) {
                return (2 & ~2) != 0;
            }
        } else {
            n2 = lIIIIlIl[2];
        }
        return n2 != 0;
    }
}

