/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 */
package gg.squire.cox.tasks;

import net.runelite.api.NPC;

public class q {
    
    private  NPC bA;
    private  boolean bC;

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        boolean bl2;
        q var1;
        void var2;
        if (q.llIllIIlIllllI(object, this)) {
            return lIlIIlIllIIl[1];
        }
        if (q.llIllIIlIlllll(var2 instanceof q)) {
            return lIlIIlIllIIl[0];
        }
        q var3 = (q)var2;
        if (q.llIllIIllIIIII(var3.aP().getIndex(), var1.aP().getIndex())) {
            bl2 = lIlIIlIllIIl[1];

        } else {
            bl2 = lIlIIlIllIIl[0];
        }
        return bl2;
    }

    private static boolean llIllIIlIllllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIllIIlIlllll(int n2) {
        return n2 == 0;
    }

    public void g(boolean bl2) {
        this.bC = bl2;
    }

    public boolean aR() {
        return this.bC;
    }

    static {
        q.llIllIIlIlllIl();
    }

    public void a(NPC nPC) {
        this.bA = nPC;
    }

    public q(NPC nPC) {
        this.bA = nPC;
        this.bC = lIlIIlIllIIl[0];
    }

    public NPC aP() {
        return this.bA;
    }

    private static boolean llIllIIllIIIII(int n2, int n3) {
        return n2 == n3;
    }
}

