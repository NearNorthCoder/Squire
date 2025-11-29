/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.construction.tasks;

import java.awt.Color;

public final class B {
    private static final  Color aV;
    private static final  Color aW;
    private static final  Color aU;
    
    private static final  Color aT;

    static {
        B.lIIlllIlIll();
        aT = new Color(lIllIlIII[4], lIllIlIII[5], lIllIlIII[6], lIllIlIII[7]);
        aU = new Color(lIllIlIII[8], lIllIlIII[8], lIllIlIII[8], lIllIlIII[7]);
        aV = new Color(lIllIlIII[1], lIllIlIII[9], lIllIlIII[8], lIllIlIII[7]);
        aW = new Color(lIllIlIII[10], lIllIlIII[1], lIllIlIII[1], lIllIlIII[7]);
    }

    /*
     * WARNING - void declaration
     */
    public static int a(int n2, int n3, int n4) {
        int n5;
        int lIllllIIlllIlll;
        if (!B.lIIlllIllII(n2) || !B.lIIlllIllIl(n3) || B.lIIlllIlllI(n4, lIllIlIII[0])) {
            return lIllIlIII[0];
        }
        int lIllllIIlllIlII = lIllIlIII[1];
        if (B.lIIlllIllIl(lIllllIIlllIlll)) {
            void lIllllIIlllIIlI;
            void lIllllIIlllIlIl;
            void lIllllIIlllIllI;
            int lIllllIIlllIIll = lIllIlIII[2];
            if (B.lIIlllIllll((int)lIllllIIlllIllI, lIllIlIII[2])) {
                if (B.lIIlllIllll(lIllllIIlllIlll, lIllIlIII[2])) {
                    lIllllIIlllIIll = (lIllllIIlllIlIl * (lIllllIIlllIlll - lIllIlIII[2]) + lIllllIIlllIllI - lIllIlIII[3]) / (lIllllIIlllIllI - lIllIlIII[2]);
                }
                if (B.lIIlllIllll((int)(lIllllIIlllIIlI = (lIllllIIlllIlIl * lIllllIIlllIlll - lIllIlIII[2]) / (lIllllIIlllIllI - lIllIlIII[2])), (int)lIllllIIlllIlIl)) {
                    lIllllIIlllIIlI = lIllllIIlllIlIl;

                    }
                }
            } else {
                lIllllIIlllIIlI = lIllllIIlllIlIl;
            }
            n5 = (lIllllIIlllIIll + lIllllIIlllIIlI + lIllIlIII[2]) / lIllIlIII[3];
        }
        return n5;
    }

    private static boolean lIIlllIllII(int n2) {
        return n2 >= 0;
    }

    private static boolean lIIlllIllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlllIlllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlllIllIl(int n2) {
        return n2 > 0;
    }

    private B() {
    }
}

