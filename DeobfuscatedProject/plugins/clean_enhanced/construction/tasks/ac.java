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
    private static  int[] lIIIIlIl;

    public NPC y() {
        return this.cB;
    }

    public ac(NPC nPC) {
        this.cB = nPC;
    }

    private static boolean var1(int n2, int n3) {
        return n2 == n3;
    }

    public boolean bc() {
        int n2;
        if (ac.var2(this.cB) && (!ac.var3(this.cB.isDead() ? 1 : 0) || ac.var1(this.cB.getAnimation(), 0))) {
            n2 = 1;
            0;
            if null != null {
                return ((0x31 ^ 0) & ~(0x9E ^ 0xAF)) != 0;
            }
        } else {
            n2 = 2;
        }
        return n2 != 0;
    }

    private static boolean var4(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var2(Object object) {
        return object != null;
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    public boolean bb() {
        int n2;
        if (ac.var2(this.cB) && ac.var3(this.cB.isDead() ? 1 : 0) && ac.var4(this.cB.getAnimation(), 0)) {
            n2 = 1;
            0;
            
        } else {
            n2 = 2;
        }
        return n2 != 0;
    }
}

