/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.minigames.tasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class J {
    
    private  int bP;
    private  int bO;
    private  double bQ;
    private  int bN;
    private static final  List<J> bM;

    public int ao() {
        return this.bP;
    }

    static {
        J.llIIlllllIllII();
        bM = new ArrayList<J>();
        bM.add(new J(lIIllIllIIll[0], lIIllIllIIll[1], lIIllIllIIll[2], 56.2));

        bM.add(new J(lIIllIllIIll[3], lIIllIllIIll[4], lIIllIllIIll[5], 17.5));

        bM.add(new J(lIIllIllIIll[6], lIIllIllIIll[7], lIIllIllIIll[8], 30.0));

        bM.add(new J(lIIllIllIIll[9], lIIllIllIIll[10], lIIllIllIIll[11], 37.5));

        bM.add(new J(lIIllIllIIll[12], lIIllIllIIll[13], lIIllIllIIll[14], 50.0));

    }

    public double ap() {
        return this.bQ;
    }

    public static J o(int n2) {
        Iterator<J> var1 = bM.iterator();
        while (J.llIIlllllIllIl(var1.hasNext() ? 1 : 0)) {
            int var2;
            J var3 = var1.next();
            if (!J.llIIlllllIlllI(var3.am(), var2) || J.llIIlllllIllll(var3.an(), var2)) {
                return var3;
            }

            if (((0xE0 ^ 0x87 ^ (0x61 ^ 0x22)) & (0x78 ^ 0x1F ^ (0xA ^ 0x49) ^ -1)) == 0) continue;
            return null;
        }
        return null;
    }

    private static boolean llIIlllllIllIl(int n2) {
        return n2 != 0;
    }

    public int am() {
        return this.bN;
    }

    public int an() {
        return this.bO;
    }

    private static boolean llIIlllllIllll(int n2, int n3) {
        return n2 == n3;
    }

    public J(int n2, int n3, int n4, double d2) {
        this.bN = n2;
        this.bO = n3;
        this.bP = n4;
        this.bQ = d2;
    }

    private static boolean llIIlllllIlllI(int n2, int n3) {
        return n2 != n3;
    }
}

