/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 */
package gg.squire.zammy.tasks;

import net.runelite.api.NPC;

public class d {
    public static final  int l;
    private final  NPC m;

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

