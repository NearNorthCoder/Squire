/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 */
package gg.squire.zammy.tasks;

import net.runelite.api.NPC;

public class DHelper {
    public static final  int l;
    private final  NPC m;

    public boolean l() {
        int n2;
        if ((this.m != null) && (!(this.m.isDead( == 0) ? 1 : 0) || (this.m.getAnimation() == 0))) {
            n2 = 1;
            0;
            if (1 <= ((0x9C ^ 0x80) & ~(0x94 ^ 0x88))) {
                return ((0xBD ^ 0x97) & ~(0x65 ^ 0x4F)) != 0;
            }
        } else {
            n2 = 2;
        }
        return n2 != 0;
    }

    public boolean k() {
        int n2;
        if ((this.m != null) && (this.m.isDead( == 0) ? 1 : 0) && (this.m.getAnimation() != 0)) {
            n2 = 1;
            0;
            if ((0xB2 ^ 0xA2 ^ (0xD6 ^ 0xC3)) <= 0) {
                return ((34 + 66 - -83 + 25 ^ 106 + 105 - 192 + 110) & (0xE8 ^ 0xB7 ^ (0x1A ^ 0x14) ^ -1)) != 0;
            }
        } else {
            n2 = 2;
        }
        return n2 != 0;
    }

    static {
        d.var2();
        l = 0;
    }

    public DHelper(NPC nPC) {
        this.m = nPC;
    }

    public NPC m() {
        return this.m;
    }

}

