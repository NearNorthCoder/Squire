/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.construction.tasks;

import java.time.Instant;

public class h {
    
    private  int ag;
    private  String ac;
    private  Instant ad;
    private  int af;
    private  int ae;

    public void a(Instant instant) {
        this.ad = instant;
    }

    private static boolean lIIlllIlIl(int n2, int n3) {
        return n2 != n3;
    }

    public String N() {
        return this.ac;
    }

    static {
        h.lIIlllIIlI();
    }

    private static boolean lIIlllIlll(Object object) {
        return object != null;
    }

    public int Q() {
        return this.af;
    }

    private static boolean lIIlllIlII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n2;
        h llIllllIlIlIIII;
        int n3;
        int n4 = lIlIllll[2];
        int n5 = lIlIllll[0];
        n5 = n5 * lIlIllll[2] + this.P();
        n5 = n5 * lIlIllll[2] + this.Q();
        n5 = n5 * lIlIllll[2] + this.R();
        String string = this.N();
        int n6 = n5 * lIlIllll[2];
        if (h.lIIlllIllI(string)) {
            n3 = lIlIllll[3];

            if (1 >= (8 + 82 - -16 + 35 ^ 41 + 84 - 75 + 87)) {
                return (0x87 ^ 0xAC ^ (0x37 ^ 0x7D)) & (0x52 ^ 0x47 ^ (0x71 ^ 5) ^ -1);
            }
        } else {
            void llIllllIlIIllIl;
            n3 = llIllllIlIIllIl.hashCode();
        }
        int llIllllIlIIlllI = n6 + n3;
        Instant llIllllIlIIllII = llIllllIlIlIIII.O();
        int n7 = llIllllIlIIlllI * lIlIllll[2];
        if (h.lIIlllIllI(llIllllIlIIllII)) {
            n2 = lIlIllll[3];

        } else {
            n2 = ((Object)llIllllIlIIllII).hashCode();
        }
        n5 = n7 + n2;
        return n5;
    }

    public void f(int n2) {
        this.ae = n2;
    }

    private static boolean lIIlllIIll(Object object, Object object2) {
        return object == object2;
    }

    protected boolean a(Object object) {
        return object instanceof h;
    }

    public Instant O() {
        return this.ad;
    }

    public int R() {
        return this.ag;
    }

    public String toString() {
        return "LootTarget(itemName=" + this.N() + ", dropTime=" + this.O() + ", id=" + this.P() + ", itemValue=" + this.Q() + ", alchValue=" + this.R() + ")";
    }

    private static boolean lIIlllIllI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block20: {
            block21: {
                Instant llIllllIlIlIllI;
                Instant llIllllIlIlIlll;
                block19: {
                    h llIllllIlIlllII;
                    h llIllllIlIllIlI;
                    block17: {
                        block18: {
                            String llIllllIlIllIII;
                            String llIllllIlIllIIl;
                            block16: {
                                void llIllllIlIllIll;
                                if (h.lIIlllIIll(object, this)) {
                                    return lIlIllll[0];
                                }
                                if (h.lIIlllIlII(llIllllIlIllIll instanceof h)) {
                                    return lIlIllll[1];
                                }
                                llIllllIlIllIlI = (h)llIllllIlIllIll;
                                if (h.lIIlllIlII(llIllllIlIllIlI.a(llIllllIlIlllII) ? 1 : 0)) {
                                    return lIlIllll[1];
                                }
                                if (h.lIIlllIlIl(llIllllIlIlllII.P(), llIllllIlIllIlI.P())) {
                                    return lIlIllll[1];
                                }
                                if (h.lIIlllIlIl(llIllllIlIlllII.Q(), llIllllIlIllIlI.Q())) {
                                    return lIlIllll[1];
                                }
                                if (h.lIIlllIlIl(llIllllIlIlllII.R(), llIllllIlIllIlI.R())) {
                                    return lIlIllll[1];
                                }
                                llIllllIlIllIIl = llIllllIlIlllII.N();
                                llIllllIlIllIII = llIllllIlIllIlI.N();
                                if (!h.lIIlllIllI(llIllllIlIllIIl)) break block16;
                                if (!h.lIIlllIlll(llIllllIlIllIII)) break block17;

                                if (-1 > 3) {
                                    return ((109 + 4 - -41 + 91 ^ 168 + 62 - 173 + 125) & (0xAB ^ 0x8B ^ (0xF9 ^ 0x9A) ^ -1)) != 0;
                                }
                                break block18;
                            }
                            if (!h.lIIlllIlII(llIllllIlIllIIl.equals(llIllllIlIllIII) ? 1 : 0)) break block17;
                        }
                        return lIlIllll[1];
                    }
                    llIllllIlIlIlll = llIllllIlIlllII.O();
                    llIllllIlIlIllI = llIllllIlIllIlI.O();
                    if (!h.lIIlllIllI(llIllllIlIlIlll)) break block19;
                    if (!h.lIIlllIlll(llIllllIlIlIllI)) break block20;

                    if ((0xBB ^ 0xBF) < -1) {
                        return false;
                    }
                    break block21;
                }
                if (!h.lIIlllIlII(((Object)llIllllIlIlIlll).equals(llIllllIlIlIllI) ? 1 : 0)) break block20;
            }
            return lIlIllll[1];
        }
        return lIlIllll[0];
    }

    public void a(String string) {
        this.ac = string;
    }

    public void g(int n2) {
        this.af = n2;
    }

    public int P() {
        return this.ae;
    }

    public void h(int n2) {
        this.ag = n2;
    }

}

