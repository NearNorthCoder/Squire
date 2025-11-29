/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 */
package gg.squire.bandos.tasks;

import net.runelite.api.NPC;

public class AHelper {
    
    public static final  int f;
    private final  NPC g;

    public boolean AHelper() {
        int n2;
        if (a.lIlIllIIIIllIl(this.g) && a.lIlIllIIIIlllI(this.g.isDead() ? 1 : 0) && a.lIlIllIIIIllll(this.g.getAnimation(), llIllllIllI[0])) {
            n2 = llIllllIllI[1];

            }
        } else {
            n2 = llIllllIllI[2];
        }
        return n2 != 0;
    }

    private static boolean lIlIllIIIIlllI(int n2) {
        return n2 == 0;
    }

    public AHelper(NPC nPC) {
        this.g = nPC;
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

            if (3 < 0) {
                return false;
            }
        } else {
            n2 = llIllllIllI[2];
        }
        return n2 != 0;
    }
}

