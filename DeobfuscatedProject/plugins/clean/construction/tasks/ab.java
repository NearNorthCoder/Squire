/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 */
package gg.squire.construction.tasks;

import net.runelite.api.NPC;

public class ab {
    
    private final  NPC cz;
    public static final  int cy;

    private static boolean lIIlllllIIl(Object object) {
        return object != null;
    }

    private static boolean lIIlllllIlI(int n2) {
        return n2 == 0;
    }

    public boolean bc() {
        int n2;
        if (ab.lIIlllllIIl(this.cz) && (!ab.lIIlllllIlI(this.cz.isDead() ? 1 : 0) || ab.lIIllllllII(this.cz.getAnimation(), lIllIllll[0]))) {
            n2 = lIllIllll[1];

            if (((0xF3 ^ 0x8D ^ (0xFD ^ 0xBD)) & (0xD2 ^ 0xB7 ^ (0xCE ^ 0x95) ^ -1)) > ((95 + 175 - 104 + 84 ^ 67 + 56 - 44 + 75) & (7 ^ 0xD ^ (0 ^ 0x6A) ^ -1))) {
                return ((0x71 ^ 0x57 ^ (0x76 ^ 0x40)) & (175 + 4 - 67 + 64 ^ 33 + 81 - 101 + 147 ^ -1)) != 0;
            }
        } else {
            n2 = lIllIllll[2];
        }
        return n2 != 0;
    }

    private static boolean lIIllllllII(int n2, int n3) {
        return n2 == n3;
    }

    static {
        ab.lIIlllllIII();
        cy = lIllIllll[0];
    }

    public ab(NPC nPC) {
        this.cz = nPC;
    }

    private static boolean lIIlllllIll(int n2, int n3) {
        return n2 != n3;
    }

    public boolean bb() {
        int n2;
        if (ab.lIIlllllIIl(this.cz) && ab.lIIlllllIlI(this.cz.isDead() ? 1 : 0) && ab.lIIlllllIll(this.cz.getAnimation(), lIllIllll[0])) {
            n2 = lIllIllll[1];

            if (1 <= 0) {
                return false;
            }
        } else {
            n2 = lIllIllll[2];
        }
        return n2 != 0;
    }

    public NPC y() {
        return this.cz;
    }
}

