/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.ConfigManager
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.N;
import -.m.e.a.u.s.r.r.q.i.r.e.f.P;
import -.m.e.a.u.s.r.r.q.i.r.e.f.ap;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aq;
import -.m.e.a.u.s.r.r.q.i.r.e.f.ar;
import -.m.e.a.u.s.r.r.q.i.r.e.f.as;
import -.m.e.a.u.s.r.r.q.i.r.e.f.at;
import -.m.e.a.u.s.r.r.q.i.r.e.f.av;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aw;
import -.m.e.a.u.s.r.r.q.i.r.e.f.ax;
import -.m.e.a.u.s.r.r.q.i.r.e.f.p;
import -.m.e.a.u.s.r.r.q.i.r.e.f.y;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.config.ConfigManager;

public final class x {
    private final /* synthetic */ boolean aX;
    private final /* synthetic */ at aY;
    private final /* synthetic */ ap aZ;
    private final /* synthetic */ ap ba;
    private final /* synthetic */ as bd;
    private final /* synthetic */ aq bc;
    private static /* synthetic */ String[] llIIIIllllll;
    private final /* synthetic */ ar bb;
    private final /* synthetic */ ax be;
    private static /* synthetic */ int[] llIIIlIIIIll;
    private final /* synthetic */ Boolean bf;

    public Boolean ar() {
        return this.bf;
    }

    /*
     * WARNING - void declaration
     */
    private aw D(N n2) {
        P p2 = n2.aL();
        switch (y.bg[p2.ordinal()]) {
            case 1: {
                x lllllllllllllllIlIlIlIIlIllIIlll;
                return lllllllllllllllIlIlIlIIlIllIIlll.bb;
            }
            case 2: {
                x lllllllllllllllIlIlIlIIlIllIIlll;
                return lllllllllllllllIlIlIlIIlIllIIlll.aY;
            }
            case 3: {
                void lllllllllllllllIlIlIlIIlIllIIllI;
                x lllllllllllllllIlIlIlIIlIllIIlll;
                if (x.llllIIlllllIII(lllllllllllllllIlIlIlIIlIllIIllI.ac())) {
                    return null;
                }
                if (x.llllIIllllIlll(lllllllllllllllIlIlIlIIlIllIIllI.ac().contains(llIIIIllllll[llIIIlIIIIll[10]]) ? 1 : 0)) {
                    return lllllllllllllllIlIlIlIIlIllIIlll.aZ;
                }
                return lllllllllllllllIlIlIlIIlIllIIlll.ba;
            }
            case 4: {
                x lllllllllllllllIlIlIlIIlIllIIlll;
                return lllllllllllllllIlIlIlIIlIllIIlll.bc;
            }
            case 5: {
                x lllllllllllllllIlIlIlIIlIllIIlll;
                return lllllllllllllllIlIlIlIIlIllIIlll.be;
            }
            case 6: {
                x lllllllllllllllIlIlIlIIlIllIIlll;
                return lllllllllllllllIlIlIlIIlIllIIlll.bd;
            }
        }
        return null;
    }

    public boolean ai() {
        int n2;
        if (x.llllIIllllIllI(this.bf) && x.llllIIllllIlll(this.bf.booleanValue() ? 1 : 0)) {
            n2 = llIIIlIIIIll[1];
            0;
            if (1 == 0) {
                return ((31 + 65 - 82 + 161 ^ 94 + 103 - 68 + 58) & (0x47 ^ 0x2E ^ (0x16 ^ 0x6B) ^ -1)) != 0;
            }
        } else {
            n2 = llIIIlIIIIll[0];
        }
        return n2 != 0;
    }

    private static boolean llllIIllllllII(int n2, int n3) {
        return n2 < n3;
    }

    private static void llllIIllllIlIl() {
        llIIIlIIIIll = new int[17];
        x.llIIIlIIIIll[0] = (1 + 168 - -31 + 17 ^ 88 + 89 - 35 + 1) & (0x22 ^ 0x3B ^ (0x4F ^ 0) ^ -1);
        x.llIIIlIIIIll[1] = 1;
        x.llIIIlIIIIll[2] = 2;
        x.llIIIlIIIIll[3] = 3;
        x.llIIIlIIIIll[4] = 0x5F ^ 0x5B;
        x.llIIIlIIIIll[5] = 0xCE ^ 0xBF ^ (0x49 ^ 0x3D);
        x.llIIIlIIIIll[6] = 0x68 ^ 0x2C ^ (0x7D ^ 0x3F);
        x.llIIIlIIIIll[7] = 80 + 45 - -20 + 5 ^ 20 + 63 - -31 + 31;
        x.llIIIlIIIIll[8] = 0x51 ^ 0x59;
        x.llIIIlIIIIll[9] = 0x91 ^ 0x98;
        x.llIIIlIIIIll[10] = 0xE1 ^ 0xC7 ^ (0x83 ^ 0xAF);
        x.llIIIlIIIIll[11] = 133 + 14 - 25 + 37 ^ 45 + 25 - 3 + 81;
        x.llIIIlIIIIll[12] = 74 + 43 - -28 + 36 ^ 133 + 121 - 138 + 26;
        x.llIIIlIIIIll[13] = 0x4A ^ 5;
        x.llIIIlIIIIll[14] = 0x7D ^ 0x1C;
        x.llIIIlIIIIll[15] = 0x95 ^ 0xBE;
        x.llIIIlIIIIll[16] = 0x43 ^ 0x6C ^ (0x4B ^ 0x68);
    }

    public boolean aj() {
        return this.aX;
    }

    private static boolean llllIIlllllIlI(int n2) {
        return n2 == 0;
    }

    private static boolean llllIIlllllIIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llllIIllllIllI(Object object) {
        return object != null;
    }

    public int hashCode() {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        x lllllllllllllllIlIlIlIIlIIlIIlIl;
        int n10;
        int n11 = llIIIlIIIIll[12];
        int n12 = llIIIlIIIIll[1];
        int n13 = n12 * llIIIlIIIIll[12];
        if (x.llllIIllllIlll(this.aj() ? 1 : 0)) {
            n10 = llIIIlIIIIll[13];
            0;
            if (null != null) {
                return (0x76 ^ 0x3A) & ~(0xC3 ^ 0x8F);
            }
        } else {
            n10 = llIIIlIIIIll[14];
        }
        int lllllllllllllllIlIlIlIIlIIlIIIll = n13 + n10;
        Boolean lllllllllllllllIlIlIlIIlIIlIIIlI = lllllllllllllllIlIlIlIIlIIlIIlIl.ar();
        int n14 = lllllllllllllllIlIlIlIIlIIlIIIll * llIIIlIIIIll[12];
        if (x.llllIIlllllIII(lllllllllllllllIlIlIlIIlIIlIIIlI)) {
            n9 = llIIIlIIIIll[15];
            0;
            if (((0x27 ^ 0x11) & ~(0xC ^ 0x3A)) < 0) {
                return (0xD0 ^ 0x93) & ~(0x66 ^ 0x25);
            }
        } else {
            n9 = ((Object)lllllllllllllllIlIlIlIIlIIlIIIlI).hashCode();
        }
        lllllllllllllllIlIlIlIIlIIlIIIll = n14 + n9;
        at lllllllllllllllIlIlIlIIlIIlIIIIl = lllllllllllllllIlIlIlIIlIIlIIlIl.ak();
        int n15 = lllllllllllllllIlIlIlIIlIIlIIIll * llIIIlIIIIll[12];
        if (x.llllIIlllllIII(lllllllllllllllIlIlIlIIlIIlIIIIl)) {
            n8 = llIIIlIIIIll[15];
            0;
            if (2 < 2) {
                return (0xB8 ^ 0x9F) & ~(0x30 ^ 0x17);
            }
        } else {
            n8 = lllllllllllllllIlIlIlIIlIIlIIIIl.hashCode();
        }
        lllllllllllllllIlIlIlIIlIIlIIIll = n15 + n8;
        ap lllllllllllllllIlIlIlIIlIIlIIIII = lllllllllllllllIlIlIlIIlIIlIIlIl.al();
        int n16 = lllllllllllllllIlIlIlIIlIIlIIIll * llIIIlIIIIll[12];
        if (x.llllIIlllllIII(lllllllllllllllIlIlIlIIlIIlIIIII)) {
            n7 = llIIIlIIIIll[15];
            0;
            if (3 >= (0x38 ^ 0x3C)) {
                return (0x89 ^ 0xC1) & ~(0xE3 ^ 0xAB);
            }
        } else {
            n7 = lllllllllllllllIlIlIlIIlIIlIIIII.hashCode();
        }
        lllllllllllllllIlIlIlIIlIIlIIIll = n16 + n7;
        ap lllllllllllllllIlIlIlIIlIIIlllll = lllllllllllllllIlIlIlIIlIIlIIlIl.am();
        int n17 = lllllllllllllllIlIlIlIIlIIlIIIll * llIIIlIIIIll[12];
        if (x.llllIIlllllIII(lllllllllllllllIlIlIlIIlIIIlllll)) {
            n6 = llIIIlIIIIll[15];
            0;
            if (null != null) {
                return (0x22 ^ 0x12) & ~(0xB7 ^ 0x87);
            }
        } else {
            n6 = lllllllllllllllIlIlIlIIlIIIlllll.hashCode();
        }
        lllllllllllllllIlIlIlIIlIIlIIIll = n17 + n6;
        ar lllllllllllllllIlIlIlIIlIIIllllI = lllllllllllllllIlIlIlIIlIIlIIlIl.an();
        int n18 = lllllllllllllllIlIlIlIIlIIlIIIll * llIIIlIIIIll[12];
        if (x.llllIIlllllIII(lllllllllllllllIlIlIlIIlIIIllllI)) {
            n5 = llIIIlIIIIll[15];
            0;
            if (2 < ((0xA6 ^ 0xAB) & ~(0xE ^ 3))) {
                return (0xB3 ^ 0xA6) & ~(0x45 ^ 0x50);
            }
        } else {
            n5 = lllllllllllllllIlIlIlIIlIIIllllI.hashCode();
        }
        lllllllllllllllIlIlIlIIlIIlIIIll = n18 + n5;
        aq lllllllllllllllIlIlIlIIlIIIlllIl = lllllllllllllllIlIlIlIIlIIlIIlIl.ao();
        int n19 = lllllllllllllllIlIlIlIIlIIlIIIll * llIIIlIIIIll[12];
        if (x.llllIIlllllIII(lllllllllllllllIlIlIlIIlIIIlllIl)) {
            n4 = llIIIlIIIIll[15];
            0;
            if (((0x8A ^ 0x94) & ~(0x34 ^ 0x2A)) != 0) {
                return (0x72 ^ 0x45) & ~(0x5F ^ 0x68);
            }
        } else {
            n4 = lllllllllllllllIlIlIlIIlIIIlllIl.hashCode();
        }
        lllllllllllllllIlIlIlIIlIIlIIIll = n19 + n4;
        as lllllllllllllllIlIlIlIIlIIIlllII = lllllllllllllllIlIlIlIIlIIlIIlIl.ap();
        int n20 = lllllllllllllllIlIlIlIIlIIlIIIll * llIIIlIIIIll[12];
        if (x.llllIIlllllIII(lllllllllllllllIlIlIlIIlIIIlllII)) {
            n3 = llIIIlIIIIll[15];
            0;
            if (null != null) {
                return (61 + 104 - 94 + 154 ^ 35 + 97 - 0 + 31) & (0x97 ^ 0x80 ^ (5 ^ 0x50) ^ -1);
            }
        } else {
            n3 = lllllllllllllllIlIlIlIIlIIIlllII.hashCode();
        }
        lllllllllllllllIlIlIlIIlIIlIIIll = n20 + n3;
        ax lllllllllllllllIlIlIlIIlIIIllIll = lllllllllllllllIlIlIlIIlIIlIIlIl.aq();
        int n21 = lllllllllllllllIlIlIlIIlIIlIIIll * llIIIlIIIIll[12];
        if (x.llllIIlllllIII(lllllllllllllllIlIlIlIIlIIIllIll)) {
            n2 = llIIIlIIIIll[15];
            0;
            if (3 <= 1) {
                return (194 + 92 - 129 + 38 ^ 127 + 101 - 217 + 122) & (0xB3 ^ 0xBD ^ (0xC0 ^ 0x88) ^ -1);
            }
        } else {
            n2 = lllllllllllllllIlIlIlIIlIIIllIll.hashCode();
        }
        n12 = n21 + n2;
        return n12;
    }

    public aq ao() {
        return this.bc;
    }

    private static <T> T a(ConfigManager configManager, String string, String string2, Class<T> clazz) {
        String string3 = string + "." + string2;
        return (T)configManager.getConfiguration(llIIIIllllll[llIIIlIIIIll[9]], string3, clazz);
    }

    public as ap() {
        return this.bd;
    }

    private static boolean llllIIllllIlll(int n2) {
        return n2 != 0;
    }

    public String toString() {
        return "LocationProfile(enabled=" + this.aj() + ", herbType=" + String.valueOf(this.ak()) + ", north=" + String.valueOf(this.al()) + ", south=" + String.valueOf(this.am()) + ", flower=" + String.valueOf(this.an()) + ", bush=" + String.valueOf(this.ao()) + ", grape=" + String.valueOf(this.ap()) + ", seaweed=" + String.valueOf(this.aq()) + ", bin=" + this.ar() + ")";
    }

    public ap am() {
        return this.ba;
    }

    public ax aq() {
        return this.be;
    }

    public av C(N n2) {
        return this.a(this.D(n2));
    }

    private static void llllIIlllIllII() {
        llIIIIllllll = new String[llIIIlIIIIll[16]];
        x.llIIIIllllll[x.llIIIlIIIIll[0]] = x."enabled";
        x.llIIIIllllll[x.llIIIlIIIIll[1]] = x."herb";
        x.llIIIIllllll[x.llIIIlIIIIll[2]] = x."flower";
        x.llIIIIllllll[x.llIIIlIIIIll[3]] = x."allotment.north";
        x.llIIIIllllll[x.llIIIlIIIIll[4]] = x."allotment.south";
        x.llIIIIllllll[x.llIIIlIIIIll[5]] = x."bush";
        x.llIIIIllllll[x.llIIIlIIIIll[6]] = x."seaweed";
        x.llIIIIllllll[x.llIIIlIIIIll[7]] = x."grapes";
        x.llIIIIllllll[x.llIIIlIIIIll[8]] = x."bins";
        x.llIIIIllllll[x.llIIIlIIIIll[9]] = x."squirefarmer";
        x.llIIIIllllll[x.llIIIlIIIIll[10]] = x."North";
        x.llIIIIllllll[x.llIIIlIIIIll[11]] = x."North";
    }

    public boolean F(N n2) {
        int n3;
        aw aw2 = this.D(n2);
        if (x.llllIIllllIlll(this.aX ? 1 : 0) && x.llllIIllllIllI(aw2) && x.llllIIllllIllI((Object)aw2.bf())) {
            n3 = llIIIlIIIIll[1];
            0;
            if (1 > 2) {
                return ((120 + 101 - 134 + 81 ^ 136 + 71 - 176 + 108) & (0xED ^ 0xC5 ^ (0xAA ^ 0xA1) ^ -1)) != 0;
            }
        } else {
            n3 = llIIIlIIIIll[0];
        }
        return n3 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean E(N n2) {
        int n3;
        void lllllllllllllllIlIlIlIIlIlIlllIl;
        x lllllllllllllllIlIlIlIIlIlIlllll;
        P p2 = n2.aL();
        if (x.llllIIlllllIIl((Object)p2, (Object)P.ALLOTMENT)) {
            boolean bl;
            if (x.llllIIllllIlll(n2.ac().contains(llIIIIllllll[llIIIlIIIIll[11]]) ? 1 : 0)) {
                boolean bl2;
                if (x.llllIIllllIllI(this.aZ)) {
                    bl2 = llIIIlIIIIll[1];
                    0;
                    if (((0x54 ^ 0x76) & ~(0x28 ^ 0xA)) != 0) {
                        return ((0xF4 ^ 0xC0) & ~(9 ^ 0x3D)) != 0;
                    }
                } else {
                    bl2 = llIIIlIIIIll[0];
                }
                return bl2;
            }
            if (x.llllIIllllIllI(lllllllllllllllIlIlIlIIlIlIlllll.ba)) {
                bl = llIIIlIIIIll[1];
                0;
                if ((0xA1 ^ 0xA5) <= ((0x4C ^ 0x60) & ~(0x79 ^ 0x55))) {
                    return ((0x23 ^ 0x69) & ~(0x25 ^ 0x6F)) != 0;
                }
            } else {
                bl = llIIIlIIIIll[0];
            }
            return bl;
        }
        if (x.llllIIlllllIIl(lllllllllllllllIlIlIlIIlIlIlllIl, (Object)P.HERB) && !x.llllIIlllllIII(lllllllllllllllIlIlIlIIlIlIlllll.aY) || x.llllIIlllllIIl(lllllllllllllllIlIlIlIIlIlIlllIl, (Object)P.FLOWER) && !x.llllIIlllllIII(lllllllllllllllIlIlIlIIlIlIlllll.bb) || x.llllIIlllllIIl(lllllllllllllllIlIlIlIIlIlIlllIl, (Object)P.BUSH) && !x.llllIIlllllIII(lllllllllllllllIlIlIlIIlIlIlllll.bc) || x.llllIIlllllIIl(lllllllllllllllIlIlIlIIlIlIlllIl, (Object)P.GRAPES) && !x.llllIIlllllIII(lllllllllllllllIlIlIlIIlIlIlllll.bd) || x.llllIIlllllIIl(lllllllllllllllIlIlIlIIlIlIlllIl, (Object)P.SEAWEED) && x.llllIIllllIllI(lllllllllllllllIlIlIlIIlIlIlllll.be)) {
            n3 = llIIIlIIIIll[1];
            0;
            if (2 < 0) {
                return ((0xCF ^ 0x83) & ~(0xC1 ^ 0x8D)) != 0;
            }
        } else {
            n3 = llIIIlIIIIll[0];
        }
        return n3 != 0;
    }

    private static String llllIIlllIIlll(String lllllllllllllllIlIlIlIIIlllIllII, String lllllllllllllllIlIlIlIIIlllIllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlIlIIIllllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIIIlllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIlIIIllllIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIlIIIllllIIII.init(llIIIlIIIIll[2], lllllllllllllllIlIlIlIIIllllIIIl);
            return new String(lllllllllllllllIlIlIlIIIllllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIIIlllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIlIIIlllIllll) {
            lllllllllllllllIlIlIlIIIlllIllll.printStackTrace();
            return null;
        }
    }

    private static String llllIIlllIlIII(String lllllllllllllllIlIlIlIIlIIIlIIIl, String lllllllllllllllIlIlIlIIlIIIlIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIlIlIIlIIIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIIlIIIlIIII.getBytes(StandardCharsets.UTF_8)), llIIIlIIIIll[8]), "DES");
            Cipher lllllllllllllllIlIlIlIIlIIIlIlIl = Cipher.getInstance("DES");
            lllllllllllllllIlIlIlIIlIIIlIlIl.init(llIIIlIIIIll[2], lllllllllllllllIlIlIlIIlIIIlIllI);
            return new String(lllllllllllllllIlIlIlIIlIIIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIIlIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIlIIlIIIlIlII) {
            lllllllllllllllIlIlIlIIlIIIlIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llllIIlllllIII(Object object) {
        return object == null;
    }

    public ar an() {
        return this.bb;
    }

    private static boolean llllIIlllllIll(int n2, int n3) {
        return n2 != n3;
    }

    public x(boolean bl, at at2, ap ap2, ap ap3, ar ar2, aq aq2, as as2, ax ax2, Boolean bl2) {
        this.aX = bl;
        this.aY = at2;
        this.aZ = ap2;
        this.ba = ap3;
        this.bb = ar2;
        this.bc = aq2;
        this.bd = as2;
        this.be = ax2;
        this.bf = bl2;
    }

    private static String llllIIlllIlIIl(String lllllllllllllllIlIlIlIIlIIIIIIll, String lllllllllllllllIlIlIlIIlIIIIIIlI) {
        lllllllllllllllIlIlIlIIlIIIIIIll = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlIIlIIIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIlIIlIIIIIIIl = new StringBuilder();
        char[] lllllllllllllllIlIlIlIIlIIIIIIII = lllllllllllllllIlIlIlIIlIIIIIIlI.toCharArray();
        int lllllllllllllllIlIlIlIIIllllllll = llIIIlIIIIll[0];
        char[] lllllllllllllllIlIlIlIIIlllllIIl = lllllllllllllllIlIlIlIIlIIIIIIll.toCharArray();
        int lllllllllllllllIlIlIlIIIlllllIII = lllllllllllllllIlIlIlIIIlllllIIl.length;
        int lllllllllllllllIlIlIlIIIllllIlll = llIIIlIIIIll[0];
        while (x.llllIIllllllII(lllllllllllllllIlIlIlIIIllllIlll, lllllllllllllllIlIlIlIIIlllllIII)) {
            char lllllllllllllllIlIlIlIIlIIIIIlII = lllllllllllllllIlIlIlIIIlllllIIl[lllllllllllllllIlIlIlIIIllllIlll];
            lllllllllllllllIlIlIlIIlIIIIIIIl.append((char)(lllllllllllllllIlIlIlIIlIIIIIlII ^ lllllllllllllllIlIlIlIIlIIIIIIII[lllllllllllllllIlIlIlIIIllllllll % lllllllllllllllIlIlIlIIlIIIIIIII.length]));
            0;
            ++lllllllllllllllIlIlIlIIIllllllll;
            ++lllllllllllllllIlIlIlIIIllllIlll;
            0;
            if (-1 != 2) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlIlIIlIIIIIIIl);
    }

    public ap al() {
        return this.aZ;
    }

    public static x a(ConfigManager configManager, p p2) {
        String string = p2.toString().toLowerCase();
        boolean bl = x.a(configManager, string, llIIIIllllll[llIIIlIIIIll[0]], Boolean.TYPE);
        at at2 = x.a(configManager, string, llIIIIllllll[llIIIlIIIIll[1]], at.class);
        ar ar2 = x.a(configManager, string, llIIIIllllll[llIIIlIIIIll[2]], ar.class);
        ap ap2 = x.a(configManager, string, llIIIIllllll[llIIIlIIIIll[3]], ap.class);
        ap ap3 = x.a(configManager, string, llIIIIllllll[llIIIlIIIIll[4]], ap.class);
        aq aq2 = x.a(configManager, string, llIIIIllllll[llIIIlIIIIll[5]], aq.class);
        ax ax2 = x.a(configManager, string, llIIIIllllll[llIIIlIIIIll[6]], ax.class);
        as as2 = x.a(configManager, string, llIIIIllllll[llIIIlIIIIll[7]], as.class);
        Boolean bl2 = x.a(configManager, string, llIIIIllllll[llIIIlIIIIll[8]], Boolean.class);
        return new x(bl, at2, ap2, ap3, ar2, aq2, as2, ax2, bl2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block65: {
            block66: {
                ax lllllllllllllllIlIlIlIIlIIllIIIl;
                ax lllllllllllllllIlIlIlIIlIIllIIlI;
                block64: {
                    x lllllllllllllllIlIlIlIIlIlIIIIll;
                    x lllllllllllllllIlIlIlIIlIlIIIIIl;
                    block62: {
                        block63: {
                            as lllllllllllllllIlIlIlIIlIIllIIll;
                            as lllllllllllllllIlIlIlIIlIIllIlII;
                            block61: {
                                block59: {
                                    block60: {
                                        aq lllllllllllllllIlIlIlIIlIIllIlIl;
                                        aq lllllllllllllllIlIlIlIIlIIllIllI;
                                        block58: {
                                            block56: {
                                                block57: {
                                                    ar lllllllllllllllIlIlIlIIlIIllIlll;
                                                    ar lllllllllllllllIlIlIlIIlIIlllIII;
                                                    block55: {
                                                        block53: {
                                                            block54: {
                                                                ap lllllllllllllllIlIlIlIIlIIlllIIl;
                                                                ap lllllllllllllllIlIlIlIIlIIlllIlI;
                                                                block52: {
                                                                    block50: {
                                                                        block51: {
                                                                            ap lllllllllllllllIlIlIlIIlIIlllIll;
                                                                            ap lllllllllllllllIlIlIlIIlIIllllII;
                                                                            block49: {
                                                                                block47: {
                                                                                    block48: {
                                                                                        at lllllllllllllllIlIlIlIIlIIllllIl;
                                                                                        at lllllllllllllllIlIlIlIIlIIlllllI;
                                                                                        block46: {
                                                                                            block44: {
                                                                                                block45: {
                                                                                                    Boolean lllllllllllllllIlIlIlIIlIIllllll;
                                                                                                    Boolean lllllllllllllllIlIlIlIIlIlIIIIII;
                                                                                                    block43: {
                                                                                                        void lllllllllllllllIlIlIlIIlIlIIIIlI;
                                                                                                        if (x.llllIIlllllIIl(object, this)) {
                                                                                                            return llIIIlIIIIll[1];
                                                                                                        }
                                                                                                        if (x.llllIIlllllIlI(lllllllllllllllIlIlIlIIlIlIIIIlI instanceof x)) {
                                                                                                            return llIIIlIIIIll[0];
                                                                                                        }
                                                                                                        lllllllllllllllIlIlIlIIlIlIIIIIl = (x)lllllllllllllllIlIlIlIIlIlIIIIlI;
                                                                                                        if (x.llllIIlllllIll(lllllllllllllllIlIlIlIIlIlIIIIll.aj() ? 1 : 0, lllllllllllllllIlIlIlIIlIlIIIIIl.aj() ? 1 : 0)) {
                                                                                                            return llIIIlIIIIll[0];
                                                                                                        }
                                                                                                        lllllllllllllllIlIlIlIIlIlIIIIII = lllllllllllllllIlIlIlIIlIlIIIIll.ar();
                                                                                                        lllllllllllllllIlIlIlIIlIIllllll = lllllllllllllllIlIlIlIIlIlIIIIIl.ar();
                                                                                                        if (!x.llllIIlllllIII(lllllllllllllllIlIlIlIIlIlIIIIII)) break block43;
                                                                                                        if (!x.llllIIllllIllI(lllllllllllllllIlIlIlIIlIIllllll)) break block44;
                                                                                                        0;
                                                                                                        if (((0x61 ^ 0x7B) & ~(0x71 ^ 0x6B)) != 0) {
                                                                                                            return ((0x4C ^ 0x49) & ~(5 ^ 0)) != 0;
                                                                                                        }
                                                                                                        break block45;
                                                                                                    }
                                                                                                    if (!x.llllIIlllllIlI(((Object)lllllllllllllllIlIlIlIIlIlIIIIII).equals(lllllllllllllllIlIlIlIIlIIllllll) ? 1 : 0)) break block44;
                                                                                                }
                                                                                                return llIIIlIIIIll[0];
                                                                                            }
                                                                                            lllllllllllllllIlIlIlIIlIIlllllI = lllllllllllllllIlIlIlIIlIlIIIIll.ak();
                                                                                            lllllllllllllllIlIlIlIIlIIllllIl = lllllllllllllllIlIlIlIIlIlIIIIIl.ak();
                                                                                            if (!x.llllIIlllllIII(lllllllllllllllIlIlIlIIlIIlllllI)) break block46;
                                                                                            if (!x.llllIIllllIllI(lllllllllllllllIlIlIlIIlIIllllIl)) break block47;
                                                                                            0;
                                                                                            if (1 <= ((0xE1 ^ 0xB1) & ~(0xDD ^ 0x8D))) {
                                                                                                return ((0x38 ^ 0x15) & ~(0xBA ^ 0x97)) != 0;
                                                                                            }
                                                                                            break block48;
                                                                                        }
                                                                                        if (!x.llllIIlllllIlI(lllllllllllllllIlIlIlIIlIIlllllI.equals(lllllllllllllllIlIlIlIIlIIllllIl) ? 1 : 0)) break block47;
                                                                                    }
                                                                                    return llIIIlIIIIll[0];
                                                                                }
                                                                                lllllllllllllllIlIlIlIIlIIllllII = lllllllllllllllIlIlIlIIlIlIIIIll.al();
                                                                                lllllllllllllllIlIlIlIIlIIlllIll = lllllllllllllllIlIlIlIIlIlIIIIIl.al();
                                                                                if (!x.llllIIlllllIII(lllllllllllllllIlIlIlIIlIIllllII)) break block49;
                                                                                if (!x.llllIIllllIllI(lllllllllllllllIlIlIlIIlIIlllIll)) break block50;
                                                                                0;
                                                                                if (null != null) {
                                                                                    return ((44 + 79 - 107 + 193 ^ 34 + 6 - -90 + 49) & (1 ^ (0xF1 ^ 0x92) ^ -1)) != 0;
                                                                                }
                                                                                break block51;
                                                                            }
                                                                            if (!x.llllIIlllllIlI(lllllllllllllllIlIlIlIIlIIllllII.equals(lllllllllllllllIlIlIlIIlIIlllIll) ? 1 : 0)) break block50;
                                                                        }
                                                                        return llIIIlIIIIll[0];
                                                                    }
                                                                    lllllllllllllllIlIlIlIIlIIlllIlI = lllllllllllllllIlIlIlIIlIlIIIIll.am();
                                                                    lllllllllllllllIlIlIlIIlIIlllIIl = lllllllllllllllIlIlIlIIlIlIIIIIl.am();
                                                                    if (!x.llllIIlllllIII(lllllllllllllllIlIlIlIIlIIlllIlI)) break block52;
                                                                    if (!x.llllIIllllIllI(lllllllllllllllIlIlIlIIlIIlllIIl)) break block53;
                                                                    0;
                                                                    if (1 < 1) {
                                                                        return ((22 + 16 - -50 + 45 ^ 150 + 70 - 129 + 89) & (0xF7 ^ 0xB5 ^ (0xF7 ^ 0x84) ^ -1)) != 0;
                                                                    }
                                                                    break block54;
                                                                }
                                                                if (!x.llllIIlllllIlI(lllllllllllllllIlIlIlIIlIIlllIlI.equals(lllllllllllllllIlIlIlIIlIIlllIIl) ? 1 : 0)) break block53;
                                                            }
                                                            return llIIIlIIIIll[0];
                                                        }
                                                        lllllllllllllllIlIlIlIIlIIlllIII = lllllllllllllllIlIlIlIIlIlIIIIll.an();
                                                        lllllllllllllllIlIlIlIIlIIllIlll = lllllllllllllllIlIlIlIIlIlIIIIIl.an();
                                                        if (!x.llllIIlllllIII(lllllllllllllllIlIlIlIIlIIlllIII)) break block55;
                                                        if (!x.llllIIllllIllI(lllllllllllllllIlIlIlIIlIIllIlll)) break block56;
                                                        0;
                                                        if (3 <= 0) {
                                                            return ((0x8D ^ 0x80 ^ (0x9A ^ 0xC4)) & (96 + 157 - 227 + 166 ^ 97 + 78 - 158 + 130 ^ -1)) != 0;
                                                        }
                                                        break block57;
                                                    }
                                                    if (!x.llllIIlllllIlI(lllllllllllllllIlIlIlIIlIIlllIII.equals(lllllllllllllllIlIlIlIIlIIllIlll) ? 1 : 0)) break block56;
                                                }
                                                return llIIIlIIIIll[0];
                                            }
                                            lllllllllllllllIlIlIlIIlIIllIllI = lllllllllllllllIlIlIlIIlIlIIIIll.ao();
                                            lllllllllllllllIlIlIlIIlIIllIlIl = lllllllllllllllIlIlIlIIlIlIIIIIl.ao();
                                            if (!x.llllIIlllllIII(lllllllllllllllIlIlIlIIlIIllIllI)) break block58;
                                            if (!x.llllIIllllIllI(lllllllllllllllIlIlIlIIlIIllIlIl)) break block59;
                                            0;
                                            if (3 <= 0) {
                                                return ((0xB8 ^ 0x91) & ~(0x6A ^ 0x43)) != 0;
                                            }
                                            break block60;
                                        }
                                        if (!x.llllIIlllllIlI(lllllllllllllllIlIlIlIIlIIllIllI.equals(lllllllllllllllIlIlIlIIlIIllIlIl) ? 1 : 0)) break block59;
                                    }
                                    return llIIIlIIIIll[0];
                                }
                                lllllllllllllllIlIlIlIIlIIllIlII = lllllllllllllllIlIlIlIIlIlIIIIll.ap();
                                lllllllllllllllIlIlIlIIlIIllIIll = lllllllllllllllIlIlIlIIlIlIIIIIl.ap();
                                if (!x.llllIIlllllIII(lllllllllllllllIlIlIlIIlIIllIlII)) break block61;
                                if (!x.llllIIllllIllI(lllllllllllllllIlIlIlIIlIIllIIll)) break block62;
                                0;
                                if (null != null) {
                                    return ((0xE1 ^ 0xB2 ^ (0xB ^ 0x48)) & (0xB9 ^ 0x87 ^ (0x72 ^ 0x5C) ^ -1)) != 0;
                                }
                                break block63;
                            }
                            if (!x.llllIIlllllIlI(lllllllllllllllIlIlIlIIlIIllIlII.equals(lllllllllllllllIlIlIlIIlIIllIIll) ? 1 : 0)) break block62;
                        }
                        return llIIIlIIIIll[0];
                    }
                    lllllllllllllllIlIlIlIIlIIllIIlI = lllllllllllllllIlIlIlIIlIlIIIIll.aq();
                    lllllllllllllllIlIlIlIIlIIllIIIl = lllllllllllllllIlIlIlIIlIlIIIIIl.aq();
                    if (!x.llllIIlllllIII(lllllllllllllllIlIlIlIIlIIllIIlI)) break block64;
                    if (!x.llllIIllllIllI(lllllllllllllllIlIlIlIIlIIllIIIl)) break block65;
                    0;
                    if (3 == (0x1E ^ 0x65 ^ 18 + 70 - -1 + 38)) {
                        return ((223 + 118 - 285 + 179 ^ 54 + 73 - 0 + 64) & (207 + 143 - 150 + 17 ^ 118 + 17 - 35 + 41 ^ -1)) != 0;
                    }
                    break block66;
                }
                if (!x.llllIIlllllIlI(lllllllllllllllIlIlIlIIlIIllIIlI.equals(lllllllllllllllIlIlIlIIlIIllIIIl) ? 1 : 0)) break block65;
            }
            return llIIIlIIIIll[0];
        }
        return llIIIlIIIIll[1];
    }

    /*
     * WARNING - void declaration
     */
    private av a(aw aw2) {
        av av2;
        if (x.llllIIlllllIII(aw2)) {
            av2 = null;
            0;
            if ((119 + 90 - 111 + 51 ^ 50 + 96 - 127 + 126) <= 0) {
                return null;
            }
        } else {
            void lllllllllllllllIlIlIlIIlIllIIIll;
            av2 = lllllllllllllllIlIlIlIIlIllIIIll.bf();
        }
        return av2;
    }

    static {
        x.llllIIllllIlIl();
        x.llllIIlllIllII();
    }

    public at ak() {
        return this.aY;
    }
}

