package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.E  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/E.class */
public class E {
    private /* synthetic */ List<F> bl = new ArrayList();
    private /* synthetic */ boolean bk;
    private static /* synthetic */ String[] llIlIlIllII;
    private /* synthetic */ String bi;
    private static /* synthetic */ int[] llIlIlIllIl;
    private /* synthetic */ String bj;
    private /* synthetic */ String bh;

    private static boolean lIlIIlllIlIIlI(int i, int i2) {
        return i < i2;
    }

    public void d(boolean z) {
        this.bk = z;
    }

    public L aw() {
        if (lIlIIlllIIlllI(this.bh) && lIlIIlllIIllll(this.bl.isEmpty() ? 1 : 0)) {
            throw new IllegalArgumentException(llIlIlIllII[llIlIlIllIl[0]]);
        }
        L l = new L();
        l.a(llIlIlIllII[llIlIlIllIl[1]], this.bh);
        l.a(llIlIlIllII[llIlIlIllIl[2]], this.bi);
        l.a(llIlIlIllII[llIlIlIllIl[3]], this.bj);
        l.a(llIlIlIllII[llIlIlIllIl[4]], Boolean.valueOf(this.bk));
        if (lIlIIlllIlIIII(this.bl.isEmpty() ? 1 : 0)) {
            ArrayList arrayList = new ArrayList();
            for (F f : this.bl) {
                L l2 = new L();
                l2.a(llIlIlIllII[llIlIlIllIl[5]], f.ax());
                l2.a(llIlIlIllII[llIlIlIllIl[6]], f.ay());
                l2.a(llIlIlIllII[llIlIlIllIl[7]], f.az());
                if (lIlIIlllIlIIIl(f.aA())) {
                    Color aA = f.aA();
                    l2.a(llIlIlIllII[llIlIlIllIl[8]], Integer.valueOf((((aA.getRed() << llIlIlIllIl[8]) + aA.getGreen()) << llIlIlIllIl[8]) + aA.getBlue()));
                }
                I aB = f.aB();
                J aD = f.aD();
                K aC = f.aC();
                G aE = f.aE();
                List<H> aF = f.aF();
                if (lIlIIlllIlIIIl(aB)) {
                    L l3 = new L();
                    l3.a(llIlIlIllII[llIlIlIllIl[9]], aB.aJ());
                    l3.a(llIlIlIllII[llIlIlIllIl[10]], aB.aG());
                    l2.a(llIlIlIllII[llIlIlIllIl[11]], l3);
                }
                if (lIlIIlllIlIIIl(aD)) {
                    L l4 = new L();
                    l4.a(llIlIlIllII[llIlIlIllIl[12]], aD.az());
                    l2.a(llIlIlIllII[llIlIlIllIl[13]], l4);
                }
                if (lIlIIlllIlIIIl(aC)) {
                    L l5 = new L();
                    l5.a(llIlIlIllII[llIlIlIllIl[14]], aC.az());
                    l2.a(llIlIlIllII[llIlIlIllIl[15]], l5);
                }
                if (lIlIIlllIlIIIl(aE)) {
                    L l6 = new L();
                    l6.a(llIlIlIllII[llIlIlIllIl[16]], aE.l());
                    l6.a(llIlIlIllII[llIlIlIllIl[17]], aE.az());
                    l6.a(llIlIlIllII[llIlIlIllIl[18]], aE.aG());
                    l2.a(llIlIlIllII[llIlIlIllIl[19]], l6);
                }
                ArrayList arrayList2 = new ArrayList();
                for (H h : aF) {
                    L l7 = new L();
                    l7.a(llIlIlIllII[llIlIlIllIl[20]], h.l());
                    l7.a(llIlIlIllII[llIlIlIllIl[21]], h.aH());
                    l7.a(llIlIlIllII[llIlIlIllIl[22]], Boolean.valueOf(h.aI()));
                    arrayList2.add(l7);
                    "".length();
                    "".length();
                    if ("   ".length() == "  ".length()) {
                        return null;
                    }
                }
                l2.a(llIlIlIllII[llIlIlIllIl[23]], arrayList2.toArray());
                arrayList.add(l2);
                "".length();
                "".length();
                if ((((((233 + 166) - 374) + 212) ^ (((104 + 119) - 222) + 184)) & (((35 ^ 20) ^ (81 ^ 50)) ^ (-" ".length()))) != (((76 ^ 21) ^ (100 ^ 24)) & (((((11 + 42) - (-39)) + 50) ^ (((66 + 118) - 135) + 122)) ^ (-" ".length())))) {
                    return null;
                }
            }
            l.a(llIlIlIllII[llIlIlIllIl[24]], arrayList.toArray());
        }
        return l;
    }

    private static String lIlIIlllIIlIIl(String llllllllllllllllIIllIIlIlIlIlIII, String llllllllllllllllIIllIIlIlIlIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIlIlIlIIlll.getBytes(StandardCharsets.UTF_8)), llIlIlIllIl[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIlIllIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIlIlIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIIlIlIlIlIIl) {
            llllllllllllllllIIllIIlIlIlIlIIl.printStackTrace();
            return null;
        }
    }

    public void a(F f) {
        this.bl.add(f);
        "".length();
    }

    public void c(String str) {
        this.bj = str;
    }

    static {
        lIlIIlllIIllIl();
        lIlIIlllIIllII();
    }

    private static void lIlIIlllIIllII() {
        llIlIlIllII = new String[llIlIlIllIl[25]];
        llIlIlIllII[llIlIlIllIl[0]] = lIlIIlllIIlIIl("ib8kYMtZW0VlZTnCyPxeZRxtR98/M5bQazBZ3Jzx1oUxvFRwZbjgb07wfe7Irwo7", "qwEVm");
        llIlIlIllII[llIlIlIllIl[1]] = lIlIIlllIIlIlI("JSkKMzEoMg==", "FFdGT");
        llIlIlIllII[llIlIlIllIl[2]] = lIlIIlllIIlIll("616l96LmR0R/EJSGdMUr6A==", "dBZBZ");
        llIlIlIllII[llIlIlIllIl[3]] = lIlIIlllIIlIIl("Ih7pZwUAFkzaE0FtoSQi/A==", "fNjvP");
        llIlIlIllII[llIlIlIllIl[4]] = lIlIIlllIIlIIl("ffLobqYfg08=", "OITeT");
        llIlIlIllII[llIlIlIllIl[5]] = lIlIIlllIIlIlI("OAwQLgc=", "LedBb");
        llIlIlIllII[llIlIlIllIl[6]] = lIlIIlllIIlIIl("QO32UGHgAKxTtWurAc/VJg==", "RLuBS");
        llIlIlIllII[llIlIlIllIl[7]] = lIlIIlllIIlIlI("HhQU", "kfxCx");
        llIlIlIllII[llIlIlIllIl[8]] = lIlIIlllIIlIll("WTzdMU8hLi0=", "DZbVk");
        llIlIlIllII[llIlIlIllIl[9]] = lIlIIlllIIlIlI("AicCAg==", "vBzvC");
        llIlIlIllII[llIlIlIllIl[10]] = lIlIIlllIIlIlI("BQ0YIzAZHBs=", "lnwMo");
        llIlIlIllII[llIlIlIllIl[11]] = lIlIIlllIIlIll("22A/T1JM6HY=", "LMDCm");
        llIlIlIllII[llIlIlIllIl[12]] = lIlIIlllIIlIlI("LAYg", "YtLID");
        llIlIlIllII[llIlIlIllIl[13]] = lIlIIlllIIlIIl("1O0tRoKREHw=", "HMxPl");
        llIlIlIllII[llIlIlIllIl[14]] = lIlIIlllIIlIlI("Ix0U", "VoxMO");
        llIlIlIllII[llIlIlIllIl[15]] = lIlIIlllIIlIll("pHaV7Olc65ieLqBJihqhiQ==", "obebC");
        llIlIlIllII[llIlIlIllIl[16]] = lIlIIlllIIlIll("Kr0Whpxd+nY=", "YYTGT");
        llIlIlIllII[llIlIlIllIl[17]] = lIlIIlllIIlIll("DREc092rX1Q=", "KRtQS");
        llIlIlIllII[llIlIlIllIl[18]] = lIlIIlllIIlIll("m+I63NWRH47RSwP2w9byCA==", "sMdrm");
        llIlIlIllII[llIlIlIllIl[19]] = lIlIIlllIIlIIl("h54Rurchqps=", "qIhMY");
        llIlIlIllII[llIlIlIllIl[20]] = lIlIIlllIIlIlI("FCYOPw==", "zGcZE");
        llIlIlIllII[llIlIlIllIl[21]] = lIlIIlllIIlIll("5kydaP+quKg=", "RISmf");
        llIlIlIllII[llIlIlIllIl[22]] = lIlIIlllIIlIIl("3PPShM0o4dI=", "rQzru");
        llIlIlIllII[llIlIlIllIl[23]] = lIlIIlllIIlIlI("EiwtPisH", "tEHRO");
        llIlIlIllII[llIlIlIllIl[24]] = lIlIIlllIIlIll("HqYgxbXYfUc=", "YRDSr");
    }

    private static void lIlIIlllIIllIl() {
        llIlIlIllIl = new int[26];
        llIlIlIllIl[0] = (202 ^ 154) & ((72 ^ 24) ^ (-1));
        llIlIlIllIl[1] = " ".length();
        llIlIlIllIl[2] = "  ".length();
        llIlIlIllIl[3] = "   ".length();
        llIlIlIllIl[4] = (((84 + 133) - 161) + 87) ^ (((78 + 129) - 200) + 132);
        llIlIlIllIl[5] = 96 ^ 101;
        llIlIlIllIl[6] = (((162 + 130) - 264) + 145) ^ (((142 + 61) - 168) + 136);
        llIlIlIllIl[7] = (100 ^ 48) ^ (112 ^ 35);
        llIlIlIllIl[8] = (((116 + 143) - 214) + 109) ^ (((124 + 104) - 204) + 122);
        llIlIlIllIl[9] = (83 ^ 97) ^ (167 ^ 156);
        llIlIlIllIl[10] = (98 ^ 1) ^ (81 ^ 56);
        llIlIlIllIl[11] = 181 ^ 190;
        llIlIlIllIl[12] = (183 ^ 194) ^ (188 ^ 197);
        llIlIlIllIl[13] = (88 ^ 86) ^ "   ".length();
        llIlIlIllIl[14] = 32 ^ 46;
        llIlIlIllIl[15] = 181 ^ 186;
        llIlIlIllIl[16] = (((115 + 81) - 192) + 146) ^ (((120 + 31) - 80) + 63);
        llIlIlIllIl[17] = 129 ^ 144;
        llIlIlIllIl[18] = 214 ^ 196;
        llIlIlIllIl[19] = 87 ^ 68;
        llIlIlIllIl[20] = (108 ^ 97) ^ (38 ^ 63);
        llIlIlIllIl[21] = 110 ^ 123;
        llIlIlIllIl[22] = 45 ^ 59;
        llIlIlIllIl[23] = (227 ^ 159) ^ (50 ^ 89);
        llIlIlIllIl[24] = 94 ^ 70;
        llIlIlIllIl[25] = (64 ^ 81) ^ (37 ^ 45);
    }

    private static boolean lIlIIlllIIllll(int i) {
        return i != 0;
    }

    private static boolean lIlIIlllIlIIII(int i) {
        return i == 0;
    }

    private static boolean lIlIIlllIlIIIl(Object obj) {
        return obj != null;
    }

    public void b(String str) {
        this.bi = str;
    }

    private static boolean lIlIIlllIIlllI(Object obj) {
        return obj == null;
    }

    private static String lIlIIlllIIlIlI(String llllllllllllllllIIllIIlIlIllllIl, String llllllllllllllllIIllIIlIlIllllII) {
        String llllllllllllllllIIllIIlIlIllllIl2 = new String(Base64.getDecoder().decode(llllllllllllllllIIllIIlIlIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIIllIIlIlIlllIlI = llllllllllllllllIIllIIlIlIllllII.toCharArray();
        int llllllllllllllllIIllIIlIlIlllIIl = llIlIlIllIl[0];
        char[] charArray = llllllllllllllllIIllIIlIlIllllIl2.toCharArray();
        int length = charArray.length;
        int llllllllllllllllIIllIIlIlIllIIIl = llIlIlIllIl[0];
        while (lIlIIlllIlIIlI(llllllllllllllllIIllIIlIlIllIIIl, length)) {
            char llllllllllllllllIIllIIlIlIlllllI = charArray[llllllllllllllllIIllIIlIlIllIIIl];
            sb.append((char) (llllllllllllllllIIllIIlIlIlllllI ^ llllllllllllllllIIllIIlIlIlllIlI[llllllllllllllllIIllIIlIlIlllIIl % llllllllllllllllIIllIIlIlIlllIlI.length]));
            "".length();
            llllllllllllllllIIllIIlIlIlllIIl++;
            llllllllllllllllIIllIIlIlIllIIIl++;
            "".length();
            if ((((21 ^ 0) ^ (230 ^ 165)) & (((((77 + 76) - 32) + 23) ^ (((113 + 109) - 109) + 85)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public void a(String str) {
        this.bh = str;
    }

    private static String lIlIIlllIIlIll(String llllllllllllllllIIllIIlIllIIllIl, String llllllllllllllllIIllIIlIllIIllII) {
        try {
            SecretKeySpec llllllllllllllllIIllIIlIllIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIlIllIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIlIllIl[2], llllllllllllllllIIllIIlIllIlIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIlIllIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIIlIllIIlllI) {
            llllllllllllllllIIllIIlIllIIlllI.printStackTrace();
            return null;
        }
    }
}
