/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.construction.tasks;

import net.runelite.api.coords.WorldPoint;

public class aH {
    private  int ae;
    
    private  WorldPoint eo;

    public String toString() {
        return "LootTarget(location=" + this.cd() + ", id=" + this.P() + ")";
    }

    private static boolean lIIlIlllIl(Object object) {
        return object != null;
    }

    public int P() {
        return this.ae;
    }

    private static boolean lIIlIllIIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlIllIlI(int n2) {
        return n2 == 0;
    }

    public void i(WorldPoint worldPoint) {
        this.eo = worldPoint;
    }

    public void f(int n2) {
        this.ae = n2;
    }

    public WorldPoint cd() {
        return this.eo;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n2;
        int n3 = lIlIlIII[2];
        int n4 = lIlIlIII[0];
        n4 = n4 * lIlIlIII[2] + this.P();
        WorldPoint worldPoint = this.cd();
        int n5 = n4 * lIlIlIII[2];
        if (aH.lIIlIlllII(worldPoint)) {
            n2 = lIlIlIII[3];

            if (-1 > (0x3F ^ 0x3B)) {
                return (0xF8 ^ 0xAD) & ~(0x47 ^ 0x12);
            }
        } else {
            void llIlllllllllllI;
            n2 = llIlllllllllllI.hashCode();
        }
        n4 = n5 + n2;
        return n4;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block10: {
            block11: {
                WorldPoint lllIIIIIIIIIllI;
                WorldPoint lllIIIIIIIIIlll;
                block9: {
                    aH lllIIIIIIIIlIlI;
                    void lllIIIIIIIIlIIl;
                    if (aH.lIIlIllIIl(object, this)) {
                        return lIlIlIII[0];
                    }
                    if (aH.lIIlIllIlI(lllIIIIIIIIlIIl instanceof aH)) {
                        return lIlIlIII[1];
                    }
                    aH lllIIIIIIIIlIII = (aH)lllIIIIIIIIlIIl;
                    if (aH.lIIlIllIlI(lllIIIIIIIIlIII.a(lllIIIIIIIIlIlI) ? 1 : 0)) {
                        return lIlIlIII[1];
                    }
                    if (aH.lIIlIllIll(lllIIIIIIIIlIlI.P(), lllIIIIIIIIlIII.P())) {
                        return lIlIlIII[1];
                    }
                    lllIIIIIIIIIlll = lllIIIIIIIIlIlI.cd();
                    lllIIIIIIIIIllI = lllIIIIIIIIlIII.cd();
                    if (!aH.lIIlIlllII(lllIIIIIIIIIlll)) break block9;
                    if (!aH.lIIlIlllIl(lllIIIIIIIIIllI)) break block10;

                    if (2 <= 0) {
                        return false;
                    }
                    break block11;
                }
                if (!aH.lIIlIllIlI(lllIIIIIIIIIlll.equals(lllIIIIIIIIIllI) ? 1 : 0)) break block10;
            }
            return lIlIlIII[1];
        }
        return lIlIlIII[0];
    }

    private static boolean lIIlIllIll(int n2, int n3) {
        return n2 != n3;
    }

    protected boolean a(Object object) {
        return object instanceof aH;
    }

    private static boolean lIIlIlllII(Object object) {
        return object == null;
    }

    static {
        aH.lIIlIllIII();
    }
}

