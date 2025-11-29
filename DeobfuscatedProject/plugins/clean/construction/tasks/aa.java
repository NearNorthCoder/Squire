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
    
    private final  NPC cx;

    public boolean bc() {
        int n2;
        if (aa.llllIIlIIl(this.cx) && (!aa.llllIIlIlI(this.cx.isDead() ? 1 : 0) || aa.llllIIllII(this.cx.getAnimation(), lIIIllIII[0]))) {
            n2 = lIIIllIII[1];

            if (((0x43 ^ 0x6C) & ~(0x80 ^ 0xAF)) >= (0x20 ^ 0x24)) {
                return false;
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

            if ((0x2B ^ 0x2F) == ((0x4F ^ 0x5B) & ~(0 ^ 0x14))) {
                return false;
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

