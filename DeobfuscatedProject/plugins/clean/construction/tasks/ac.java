/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 */
package gg.squire.construction.tasks;

import net.runelite.api.NPC;

public class ac {
    public static final  int cA;
    private final  NPC cB;

    public NPC y() {
        return this.cB;
    }

    public ac(NPC nPC) {
        this.cB = nPC;
    }

    private static boolean lIIIIIIIll(int n2, int n3) {
        return n2 == n3;
    }

    static {
        ac.lllllllll();
        cA = lIIIIlIl[0];
    }

    public boolean bc() {
        int n2;
        if (ac.lIIIIIIIII(this.cB) && (!ac.lIIIIIIIIl(this.cB.isDead() ? 1 : 0) || ac.lIIIIIIIll(this.cB.getAnimation(), lIIIIlIl[0]))) {
            n2 = lIIIIlIl[1];

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

            if (2 == 0) {
                return (2 & ~2) != 0;
            }
        } else {
            n2 = lIIIIlIl[2];
        }
        return n2 != 0;
    }
}

