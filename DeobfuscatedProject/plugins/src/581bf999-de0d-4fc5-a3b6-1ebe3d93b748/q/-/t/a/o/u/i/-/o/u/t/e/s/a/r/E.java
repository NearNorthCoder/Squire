/*
 * Decompiled with CFR 0.152.
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.F;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.G;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.H;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.I;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.J;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.K;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.L;

public class E {
    private /* synthetic */ List<F> bl;
    private /* synthetic */ boolean bk;
    private static /* synthetic */ String[] llIlIlIllII;
    private /* synthetic */ String bi;
    private static /* synthetic */ int[] llIlIlIllIl;
    private /* synthetic */ String bj;
    private /* synthetic */ String bh;

    private static boolean lIlIIlllIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public void d(boolean bl2) {
        this.bk = bl2;
    }

    /*
     * WARNING - void declaration
     */
    public L aw() {
        void var1_1;
        E llllllllllllllllIIllIIlIlllIIIll;
        if (E.lIlIIlllIIlllI(this.bh) && E.lIlIIlllIIllll(this.bl.isEmpty() ? 1 : 0)) {
            throw new IllegalArgumentException(llIlIlIllII[llIlIlIllIl[0]]);
        }
        L llllllllllllllllIIllIIlIlllIIIlI = new L();
        llllllllllllllllIIllIIlIlllIIIlI.a(llIlIlIllII[llIlIlIllIl[1]], llllllllllllllllIIllIIlIlllIIIll.bh);
        llllllllllllllllIIllIIlIlllIIIlI.a(llIlIlIllII[llIlIlIllIl[2]], llllllllllllllllIIllIIlIlllIIIll.bi);
        llllllllllllllllIIllIIlIlllIIIlI.a(llIlIlIllII[llIlIlIllIl[3]], llllllllllllllllIIllIIlIlllIIIll.bj);
        llllllllllllllllIIllIIlIlllIIIlI.a(llIlIlIllII[llIlIlIllIl[4]], llllllllllllllllIIllIIlIlllIIIll.bk);
        if (E.lIlIIlllIlIIII(llllllllllllllllIIllIIlIlllIIIll.bl.isEmpty() ? 1 : 0)) {
            ArrayList<L> llllllllllllllllIIllIIlIlllIIIIl = new ArrayList<L>();
            Iterator<F> llllllllllllllllIIllIIlIlllIIIII = llllllllllllllllIIllIIlIlllIIIll.bl.iterator();
            while (E.lIlIIlllIIllll(llllllllllllllllIIllIIlIlllIIIII.hasNext() ? 1 : 0)) {
                Object llllllllllllllllIIllIIlIllIllIII;
                Object llllllllllllllllIIllIIlIllIlllIl;
                F llllllllllllllllIIllIIlIllIlllll = llllllllllllllllIIllIIlIlllIIIII.next();
                L llllllllllllllllIIllIIlIllIllllI = new L();
                llllllllllllllllIIllIIlIllIllllI.a(llIlIlIllII[llIlIlIllIl[5]], llllllllllllllllIIllIIlIllIlllll.ax());
                llllllllllllllllIIllIIlIllIllllI.a(llIlIlIllII[llIlIlIllIl[6]], llllllllllllllllIIllIIlIllIlllll.ay());
                llllllllllllllllIIllIIlIllIllllI.a(llIlIlIllII[llIlIlIllIl[7]], llllllllllllllllIIllIIlIllIlllll.az());
                if (E.lIlIIlllIlIIIl(llllllllllllllllIIllIIlIllIlllll.aA())) {
                    llllllllllllllllIIllIIlIllIlllIl = llllllllllllllllIIllIIlIllIlllll.aA();
                    int llllllllllllllllIIllIIlIllIlllII = ((Color)llllllllllllllllIIllIIlIllIlllIl).getRed();
                    llllllllllllllllIIllIIlIllIlllII = (llllllllllllllllIIllIIlIllIlllII << llIlIlIllIl[8]) + ((Color)llllllllllllllllIIllIIlIllIlllIl).getGreen();
                    llllllllllllllllIIllIIlIllIlllII = (llllllllllllllllIIllIIlIllIlllII << llIlIlIllIl[8]) + ((Color)llllllllllllllllIIllIIlIllIlllIl).getBlue();
                    llllllllllllllllIIllIIlIllIllllI.a(llIlIlIllII[llIlIlIllIl[8]], llllllllllllllllIIllIIlIllIlllII);
                }
                llllllllllllllllIIllIIlIllIlllIl = llllllllllllllllIIllIIlIllIlllll.aB();
                J llllllllllllllllIIllIIlIllIlllII = llllllllllllllllIIllIIlIllIlllll.aD();
                K llllllllllllllllIIllIIlIllIllIll = llllllllllllllllIIllIIlIllIlllll.aC();
                G llllllllllllllllIIllIIlIllIllIlI = llllllllllllllllIIllIIlIllIlllll.aE();
                List<H> llllllllllllllllIIllIIlIllIllIIl = llllllllllllllllIIllIIlIllIlllll.aF();
                if (E.lIlIIlllIlIIIl(llllllllllllllllIIllIIlIllIlllIl)) {
                    llllllllllllllllIIllIIlIllIllIII = new L();
                    ((L)llllllllllllllllIIllIIlIllIllIII).a(llIlIlIllII[llIlIlIllIl[9]], ((I)llllllllllllllllIIllIIlIllIlllIl).aJ());
                    ((L)llllllllllllllllIIllIIlIllIllIII).a(llIlIlIllII[llIlIlIllIl[10]], ((I)llllllllllllllllIIllIIlIllIlllIl).aG());
                    llllllllllllllllIIllIIlIllIllllI.a(llIlIlIllII[llIlIlIllIl[11]], llllllllllllllllIIllIIlIllIllIII);
                }
                if (E.lIlIIlllIlIIIl(llllllllllllllllIIllIIlIllIlllII)) {
                    llllllllllllllllIIllIIlIllIllIII = new L();
                    ((L)llllllllllllllllIIllIIlIllIllIII).a(llIlIlIllII[llIlIlIllIl[12]], llllllllllllllllIIllIIlIllIlllII.az());
                    llllllllllllllllIIllIIlIllIllllI.a(llIlIlIllII[llIlIlIllIl[13]], llllllllllllllllIIllIIlIllIllIII);
                }
                if (E.lIlIIlllIlIIIl(llllllllllllllllIIllIIlIllIllIll)) {
                    llllllllllllllllIIllIIlIllIllIII = new L();
                    ((L)llllllllllllllllIIllIIlIllIllIII).a(llIlIlIllII[llIlIlIllIl[14]], llllllllllllllllIIllIIlIllIllIll.az());
                    llllllllllllllllIIllIIlIllIllllI.a(llIlIlIllII[llIlIlIllIl[15]], llllllllllllllllIIllIIlIllIllIII);
                }
                if (E.lIlIIlllIlIIIl(llllllllllllllllIIllIIlIllIllIlI)) {
                    llllllllllllllllIIllIIlIllIllIII = new L();
                    ((L)llllllllllllllllIIllIIlIllIllIII).a(llIlIlIllII[llIlIlIllIl[16]], llllllllllllllllIIllIIlIllIllIlI.l());
                    ((L)llllllllllllllllIIllIIlIllIllIII).a(llIlIlIllII[llIlIlIllIl[17]], llllllllllllllllIIllIIlIllIllIlI.az());
                    ((L)llllllllllllllllIIllIIlIllIllIII).a(llIlIlIllII[llIlIlIllIl[18]], llllllllllllllllIIllIIlIllIllIlI.aG());
                    llllllllllllllllIIllIIlIllIllllI.a(llIlIlIllII[llIlIlIllIl[19]], llllllllllllllllIIllIIlIllIllIII);
                }
                llllllllllllllllIIllIIlIllIllIII = new ArrayList();
                Iterator<H> llllllllllllllllIIllIIlIllIlIlll = llllllllllllllllIIllIIlIllIllIIl.iterator();
                while (E.lIlIIlllIIllll(llllllllllllllllIIllIIlIllIlIlll.hasNext() ? 1 : 0)) {
                    H llllllllllllllllIIllIIlIllIlIllI = llllllllllllllllIIllIIlIllIlIlll.next();
                    L llllllllllllllllIIllIIlIllIlIlIl = new L();
                    llllllllllllllllIIllIIlIllIlIlIl.a(llIlIlIllII[llIlIlIllIl[20]], llllllllllllllllIIllIIlIllIlIllI.l());
                    llllllllllllllllIIllIIlIllIlIlIl.a(llIlIlIllII[llIlIlIllIl[21]], llllllllllllllllIIllIIlIllIlIllI.aH());
                    llllllllllllllllIIllIIlIllIlIlIl.a(llIlIlIllII[llIlIlIllIl[22]], llllllllllllllllIIllIIlIllIlIllI.aI());
                    llllllllllllllllIIllIIlIllIllIII.add(llllllllllllllllIIllIIlIllIlIlIl);
                    "".length();
                    "".length();
                    if ("   ".length() != "  ".length()) continue;
                    return null;
                }
                llllllllllllllllIIllIIlIllIllllI.a(llIlIlIllII[llIlIlIllIl[23]], llllllllllllllllIIllIIlIllIllIII.toArray());
                llllllllllllllllIIllIIlIlllIIIIl.add(llllllllllllllllIIllIIlIllIllllI);
                "".length();
                "".length();
                if (((233 + 166 - 374 + 212 ^ 104 + 119 - 222 + 184) & (0x23 ^ 0x14 ^ (0x51 ^ 0x32) ^ -" ".length())) == ((0x4C ^ 0x15 ^ (0x64 ^ 0x18)) & (11 + 42 - -39 + 50 ^ 66 + 118 - 135 + 122 ^ -" ".length()))) continue;
                return null;
            }
            llllllllllllllllIIllIIlIlllIIIlI.a(llIlIlIllII[llIlIlIllIl[24]], llllllllllllllllIIllIIlIlllIIIIl.toArray());
        }
        return var1_1;
    }

    private static String lIlIIlllIIlIIl(String llllllllllllllllIIllIIlIlIlIIllI, String llllllllllllllllIIllIIlIlIlIIlIl) {
        try {
            SecretKeySpec llllllllllllllllIIllIIlIlIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIlIlIlIIlIl.getBytes(StandardCharsets.UTF_8)), llIlIlIllIl[8]), "DES");
            Cipher llllllllllllllllIIllIIlIlIlIlIlI = Cipher.getInstance("DES");
            llllllllllllllllIIllIIlIlIlIlIlI.init(llIlIlIllIl[2], llllllllllllllllIIllIIlIlIlIlIll);
            return new String(llllllllllllllllIIllIIlIlIlIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIlIlIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllIIlIlIlIlIIl) {
            llllllllllllllllIIllIIlIlIlIlIIl.printStackTrace();
            return null;
        }
    }

    public void a(F f2) {
        this.bl.add(f2);
        "".length();
    }

    public void c(String string) {
        this.bj = string;
    }

    static {
        E.lIlIIlllIIllIl();
        E.lIlIIlllIIllII();
    }

    private static void lIlIIlllIIllII() {
        llIlIlIllII = new String[llIlIlIllIl[25]];
        E.llIlIlIllII[E.llIlIlIllIl[0]] = E.lIlIIlllIIlIIl("ib8kYMtZW0VlZTnCyPxeZRxtR98/M5bQazBZ3Jzx1oUxvFRwZbjgb07wfe7Irwo7", "qwEVm");
        E.llIlIlIllII[E.llIlIlIllIl[1]] = E.lIlIIlllIIlIlI("JSkKMzEoMg==", "FFdGT");
        E.llIlIlIllII[E.llIlIlIllIl[2]] = E.lIlIIlllIIlIll("616l96LmR0R/EJSGdMUr6A==", "dBZBZ");
        E.llIlIlIllII[E.llIlIlIllIl[3]] = E.lIlIIlllIIlIIl("Ih7pZwUAFkzaE0FtoSQi/A==", "fNjvP");
        E.llIlIlIllII[E.llIlIlIllIl[4]] = E.lIlIIlllIIlIIl("ffLobqYfg08=", "OITeT");
        E.llIlIlIllII[E.llIlIlIllIl[5]] = E.lIlIIlllIIlIlI("OAwQLgc=", "LedBb");
        E.llIlIlIllII[E.llIlIlIllIl[6]] = E.lIlIIlllIIlIIl("QO32UGHgAKxTtWurAc/VJg==", "RLuBS");
        E.llIlIlIllII[E.llIlIlIllIl[7]] = E.lIlIIlllIIlIlI("HhQU", "kfxCx");
        E.llIlIlIllII[E.llIlIlIllIl[8]] = E.lIlIIlllIIlIll("WTzdMU8hLi0=", "DZbVk");
        E.llIlIlIllII[E.llIlIlIllIl[9]] = E.lIlIIlllIIlIlI("AicCAg==", "vBzvC");
        E.llIlIlIllII[E.llIlIlIllIl[10]] = E.lIlIIlllIIlIlI("BQ0YIzAZHBs=", "lnwMo");
        E.llIlIlIllII[E.llIlIlIllIl[11]] = E.lIlIIlllIIlIll("22A/T1JM6HY=", "LMDCm");
        E.llIlIlIllII[E.llIlIlIllIl[12]] = E.lIlIIlllIIlIlI("LAYg", "YtLID");
        E.llIlIlIllII[E.llIlIlIllIl[13]] = E.lIlIIlllIIlIIl("1O0tRoKREHw=", "HMxPl");
        E.llIlIlIllII[E.llIlIlIllIl[14]] = E.lIlIIlllIIlIlI("Ix0U", "VoxMO");
        E.llIlIlIllII[E.llIlIlIllIl[15]] = E.lIlIIlllIIlIll("pHaV7Olc65ieLqBJihqhiQ==", "obebC");
        E.llIlIlIllII[E.llIlIlIllIl[16]] = E.lIlIIlllIIlIll("Kr0Whpxd+nY=", "YYTGT");
        E.llIlIlIllII[E.llIlIlIllIl[17]] = E.lIlIIlllIIlIll("DREc092rX1Q=", "KRtQS");
        E.llIlIlIllII[E.llIlIlIllIl[18]] = E.lIlIIlllIIlIll("m+I63NWRH47RSwP2w9byCA==", "sMdrm");
        E.llIlIlIllII[E.llIlIlIllIl[19]] = E.lIlIIlllIIlIIl("h54Rurchqps=", "qIhMY");
        E.llIlIlIllII[E.llIlIlIllIl[20]] = E.lIlIIlllIIlIlI("FCYOPw==", "zGcZE");
        E.llIlIlIllII[E.llIlIlIllIl[21]] = E.lIlIIlllIIlIll("5kydaP+quKg=", "RISmf");
        E.llIlIlIllII[E.llIlIlIllIl[22]] = E.lIlIIlllIIlIIl("3PPShM0o4dI=", "rQzru");
        E.llIlIlIllII[E.llIlIlIllIl[23]] = E.lIlIIlllIIlIlI("EiwtPisH", "tEHRO");
        E.llIlIlIllII[E.llIlIlIllIl[24]] = E.lIlIIlllIIlIll("HqYgxbXYfUc=", "YRDSr");
    }

    private static void lIlIIlllIIllIl() {
        llIlIlIllIl = new int[26];
        E.llIlIlIllIl[0] = (0xCA ^ 0x9A) & ~(0x48 ^ 0x18);
        E.llIlIlIllIl[1] = " ".length();
        E.llIlIlIllIl[2] = "  ".length();
        E.llIlIlIllIl[3] = "   ".length();
        E.llIlIlIllIl[4] = 84 + 133 - 161 + 87 ^ 78 + 129 - 200 + 132;
        E.llIlIlIllIl[5] = 0x60 ^ 0x65;
        E.llIlIlIllIl[6] = 162 + 130 - 264 + 145 ^ 142 + 61 - 168 + 136;
        E.llIlIlIllIl[7] = 0x64 ^ 0x30 ^ (0x70 ^ 0x23);
        E.llIlIlIllIl[8] = 116 + 143 - 214 + 109 ^ 124 + 104 - 204 + 122;
        E.llIlIlIllIl[9] = 0x53 ^ 0x61 ^ (0xA7 ^ 0x9C);
        E.llIlIlIllIl[10] = 0x62 ^ 1 ^ (0x51 ^ 0x38);
        E.llIlIlIllIl[11] = 0xB5 ^ 0xBE;
        E.llIlIlIllIl[12] = 0xB7 ^ 0xC2 ^ (0xBC ^ 0xC5);
        E.llIlIlIllIl[13] = 0x58 ^ 0x56 ^ "   ".length();
        E.llIlIlIllIl[14] = 0x20 ^ 0x2E;
        E.llIlIlIllIl[15] = 0xB5 ^ 0xBA;
        E.llIlIlIllIl[16] = 115 + 81 - 192 + 146 ^ 120 + 31 - 80 + 63;
        E.llIlIlIllIl[17] = 0x81 ^ 0x90;
        E.llIlIlIllIl[18] = 0xD6 ^ 0xC4;
        E.llIlIlIllIl[19] = 0x57 ^ 0x44;
        E.llIlIlIllIl[20] = 0x6C ^ 0x61 ^ (0x26 ^ 0x3F);
        E.llIlIlIllIl[21] = 0x6E ^ 0x7B;
        E.llIlIlIllIl[22] = 0x2D ^ 0x3B;
        E.llIlIlIllIl[23] = 0xE3 ^ 0x9F ^ (0x32 ^ 0x59);
        E.llIlIlIllIl[24] = 0x5E ^ 0x46;
        E.llIlIlIllIl[25] = 0x40 ^ 0x51 ^ (0x25 ^ 0x2D);
    }

    private static boolean lIlIIlllIIllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIlllIlIIII(int n2) {
        return n2 == 0;
    }

    public E() {
        this.bl = new ArrayList<F>();
    }

    private static boolean lIlIIlllIlIIIl(Object object) {
        return object != null;
    }

    public void b(String string) {
        this.bi = string;
    }

    private static boolean lIlIIlllIIlllI(Object object) {
        return object == null;
    }

    private static String lIlIIlllIIlIlI(String llllllllllllllllIIllIIlIlIlllIII, String llllllllllllllllIIllIIlIlIllIlll) {
        llllllllllllllllIIllIIlIlIlllIII = new String(Base64.getDecoder().decode(llllllllllllllllIIllIIlIlIlllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIllIIlIlIlllIll = new StringBuilder();
        char[] llllllllllllllllIIllIIlIlIlllIlI = llllllllllllllllIIllIIlIlIllIlll.toCharArray();
        int llllllllllllllllIIllIIlIlIlllIIl = llIlIlIllIl[0];
        char[] llllllllllllllllIIllIIlIlIllIIll = llllllllllllllllIIllIIlIlIlllIII.toCharArray();
        int llllllllllllllllIIllIIlIlIllIIlI = llllllllllllllllIIllIIlIlIllIIll.length;
        int llllllllllllllllIIllIIlIlIllIIIl = llIlIlIllIl[0];
        while (E.lIlIIlllIlIIlI(llllllllllllllllIIllIIlIlIllIIIl, llllllllllllllllIIllIIlIlIllIIlI)) {
            char llllllllllllllllIIllIIlIlIlllllI = llllllllllllllllIIllIIlIlIllIIll[llllllllllllllllIIllIIlIlIllIIIl];
            llllllllllllllllIIllIIlIlIlllIll.append((char)(llllllllllllllllIIllIIlIlIlllllI ^ llllllllllllllllIIllIIlIlIlllIlI[llllllllllllllllIIllIIlIlIlllIIl % llllllllllllllllIIllIIlIlIlllIlI.length]));
            "".length();
            ++llllllllllllllllIIllIIlIlIlllIIl;
            ++llllllllllllllllIIllIIlIlIllIIIl;
            "".length();
            if (((0x15 ^ 0 ^ (0xE6 ^ 0xA5)) & (77 + 76 - 32 + 23 ^ 113 + 109 - 109 + 85 ^ -" ".length())) == 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIllIIlIlIlllIll);
    }

    public void a(String string) {
        this.bh = string;
    }

    private static String lIlIIlllIIlIll(String llllllllllllllllIIllIIlIllIIlIll, String llllllllllllllllIIllIIlIllIIllII) {
        try {
            SecretKeySpec llllllllllllllllIIllIIlIllIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIlIllIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIllIIlIllIIllll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIllIIlIllIIllll.init(llIlIlIllIl[2], llllllllllllllllIIllIIlIllIlIIII);
            return new String(llllllllllllllllIIllIIlIllIIllll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIlIllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllIIlIllIIlllI) {
            llllllllllllllllIIllIIlIllIIlllI.printStackTrace();
            return null;
        }
    }
}

