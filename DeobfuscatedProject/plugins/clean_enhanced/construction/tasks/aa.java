/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 */
package gg.squire.construction.tasks;

import net.runelite.api.NPC;

public class aa {
    public static final  int cw;
    private static  int[] lIIIllIII;
    private final  NPC cx;

    public boolean bc() {
        int n2;
        if ((this.cx != null) && (!(this.cx.isDead( == 0) ? 1 : 0) || (this.cx.getAnimation() == 0))) {
            n2 = 1;
            0;
            if (((0x43 ^ 0x6C) & ~(0x80 ^ 0xAF)) >= (0x20 ^ 0x24)) {
                return ((0x96 ^ 0x8C) & ~(0xB7 ^ 0xAD)) != 0;
            }
        } else {
            n2 = 2;
        }
        return n2 != 0;
    }

    public boolean bb() {
        int n2;
        if ((this.cx != null) && (this.cx.isDead( == 0) ? 1 : 0) && (this.cx.getAnimation() != 0)) {
            n2 = 1;
            0;
            if ((0x2B ^ 0x2F) == ((0x4F ^ 0x5B) & ~(0 ^ 0x14))) {
                return ((6 ^ 0x10) & ~(0xAD ^ 0xBB)) != 0;
            }
        } else {
            n2 = 2;
        }
        return n2 != 0;
    }

    public aa(NPC nPC) {
        this.cx = nPC;
    }

    public NPC y() {
        return this.cx;
    }

    static {
        aa.var1();
        cw = 0;
    }

}

