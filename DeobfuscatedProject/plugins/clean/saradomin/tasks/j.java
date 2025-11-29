/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 */
package gg.squire.saradomin.tasks;

import net.runelite.api.NPC;

public class j {
    private final  NPC x;
    
    public static final  int w;

    public boolean B() {
        int n2;
        if (j.lIlIlIlllllllIl(this.x) && (!j.lIlIlIllllllllI(this.x.isDead() ? 1 : 0) || j.lIlIllIIIIIIIII(this.x.getAnimation(), lIIlIlIlIIlll[0]))) {
            n2 = lIIlIlIlIIlll[1];

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

