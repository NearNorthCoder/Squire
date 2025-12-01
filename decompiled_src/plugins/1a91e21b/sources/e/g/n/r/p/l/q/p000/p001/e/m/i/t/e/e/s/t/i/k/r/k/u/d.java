package e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.d  reason: invalid package */
/* loaded from: 1a91e21b-fcbe-4432-8f0e-1258958a8366.jar:e/g/n/r/p/l/q/-/-/e/m/i/t/e/e/s/t/i/k/r/k/u/d.class */
public final class d {
    private static final /* synthetic */ d[] $VALUES;
    public static final /* synthetic */ d LOBSTER;
    public static final /* synthetic */ d XP_TOME;
    private static /* synthetic */ int[] lIIllIIllIIIl;
    private final /* synthetic */ List<Integer> rewardIds;
    public static final /* synthetic */ d WATERMELON_SEED;
    public static final /* synthetic */ d PURE_ESSENCE;
    private static /* synthetic */ String[] lIIllIIlIllll;
    public static final /* synthetic */ d SILVER_BAR;
    public static final /* synthetic */ d BOW_STRING;
    public static final /* synthetic */ d COAL_AND_IRON;
    private final /* synthetic */ int interfaceId;
    private final /* synthetic */ String name;
    public static final /* synthetic */ d HERB;

    private static String lIlIllllllIlllI(String llllllllllllllIllllIIIIlIIlIlIII, String llllllllllllllIllllIIIIlIIlIIlll) {
        try {
            SecretKeySpec llllllllllllllIllllIIIIlIIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIlIIlIIlll.getBytes(StandardCharsets.UTF_8)), lIIllIIllIIIl[11]), "DES");
            Cipher llllllllllllllIllllIIIIlIIlIlIlI = Cipher.getInstance("DES");
            llllllllllllllIllllIIIIlIIlIlIlI.init(lIIllIIllIIIl[2], llllllllllllllIllllIIIIlIIlIlIll);
            return new String(llllllllllllllIllllIIIIlIIlIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIlIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIIlIIlIlIIl) {
            llllllllllllllIllllIIIIlIIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIlllllllIIll() {
        lIIllIIllIIIl = new int[20];
        lIIllIIllIIIl[0] = ((124 ^ 11) ^ (132 ^ 190)) & (((73 ^ 56) ^ (100 ^ 88)) ^ (-" ".length()));
        lIIllIIllIIIl[1] = " ".length();
        lIIllIIllIIIl[2] = "  ".length();
        lIIllIIllIIIl[3] = "   ".length();
        lIIllIIllIIIl[4] = (81 ^ 19) ^ (128 ^ 198);
        lIIllIIllIIIl[5] = 191 ^ 186;
        lIIllIIllIIIl[6] = (((128 + 40) - 120) + 143) ^ (((138 + 133) - 129) + 43);
        lIIllIIllIIIl[7] = (-8193) & 11242;
        lIIllIIllIIIl[8] = (((199 ^ 167) + (6 ^ 53)) - (114 ^ 15)) + ((158 + 160) - 138) + 4;
        lIIllIIllIIIl[9] = ((178 + 122) - 197) + 101;
        lIIllIIllIIIl[10] = 21 ^ 18;
        lIIllIIllIIIl[11] = 120 ^ 112;
        lIIllIIllIIIl[12] = (119 ^ 114) ^ (188 ^ 176);
        lIIllIIllIIIl[13] = 146 ^ 152;
        lIIllIIllIIIl[14] = 85 ^ 94;
        lIIllIIllIIIl[15] = 181 ^ 185;
        lIIllIIllIIIl[16] = 119 ^ 122;
        lIIllIIllIIIl[17] = (8 ^ 80) ^ (55 ^ 97);
        lIIllIIllIIIl[18] = (((10 + 70) - (-4)) + 90) ^ (((62 + 122) - 137) + 114);
        lIIllIIllIIIl[19] = (87 ^ 33) ^ (49 ^ 87);
    }

    private static String lIlIllllllIllll(String llllllllllllllIllllIIIIlIIllIlIl, String llllllllllllllIllllIIIIlIIllIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIlIIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIIIlIIllIlll = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIIIlIIllIlll.init(lIIllIIllIIIl[2], secretKeySpec);
            return new String(llllllllllllllIllllIIIIlIIllIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIlIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIIlIIllIllI) {
            llllllllllllllIllllIIIIlIIllIllI.printStackTrace();
            return null;
        }
    }

    private static String lIlIllllllIllIl(String llllllllllllllIllllIIIIlIIIllIII, String llllllllllllllIllllIIIIlIIIlIlll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllllIIIIlIIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllllIIIIlIIIlIlll.toCharArray();
        int llllllllllllllIllllIIIIlIIIlIlII = lIIllIIllIIIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIllIIllIIIl[0];
        while (lIlIlllllllIlII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllIllllIIIIlIIIlIlII % charArray.length]));
            "".length();
            llllllllllllllIllllIIIIlIIIlIlII++;
            i++;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public String y() {
        return this.name;
    }

    private d(String str, int i, int i2, List list, String str2) {
        this.interfaceId = i2;
        this.rewardIds = list;
        this.name = str2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public List<Integer> w() {
        return this.rewardIds;
    }

    private static void lIlIlllllllIIlI() {
        lIIllIIlIllll = new String[lIIllIIllIIIl[19]];
        lIIllIIlIllll[lIIllIIllIIIl[0]] = lIlIllllllIllIl("Hjg8KDwLPj0oLQ0o", "Nmnmc");
        lIIllIIlIllll[lIIllIIllIIIl[1]] = lIlIllllllIlllI("PcKVBPq/lHMoviHNekz1fA==", "aaYlX");
        lIIllIIlIllll[lIIllIIllIIIl[2]] = lIlIllllllIllll("Bcum+xFcphKs0XZ1NrUypg==", "dRfKK");
        lIIllIIlIllll[lIIllIIllIIIl[3]] = lIlIllllllIllIl("Jx40WAMRAyoWFw==", "eqCxp");
        lIIllIIlIllll[lIIllIIllIIIl[4]] = lIlIllllllIlllI("sThju1cn7oubwHx5WFJtpQ==", "GHxip");
        lIIllIIlIllll[lIIllIIllIIIl[5]] = lIlIllllllIllll("qzsOI06ucjwtWLHP89nXQg==", "bThTZ");
        lIIllIIlIllll[lIIllIIllIIIl[6]] = lIlIllllllIlllI("JcuiLicBj+U=", "opUjC");
        lIIllIIlIllll[lIIllIIllIIIl[10]] = lIlIllllllIllIl("Ox0CJzo=", "sxpEI");
        lIIllIIlIllll[lIIllIIllIIIl[11]] = lIlIllllllIllll("8tibqOyB8suRkQ48lz1rfw==", "bFHkN");
        lIIllIIlIllll[lIIllIIllIIIl[12]] = lIlIllllllIlllI("L5yrT3a66ww=", "WWnlT");
        lIIllIIlIllll[lIIllIIllIIIl[13]] = lIlIllllllIllll("puNRouNeuS5WCbOU25w1+Q==", "whqMq");
        lIIllIIlIllll[lIIllIIllIIIl[14]] = lIlIllllllIllll("h461GjyslXmsORR2OegJXA==", "XpRHG");
        lIIllIIlIllll[lIIllIIllIIIl[15]] = lIlIllllllIllIl("AyQmKzoKOQ==", "Okdxn");
        lIIllIIlIllll[lIIllIIllIIIl[16]] = lIlIllllllIllIl("BAs2RDo5CDIQMyQ=", "VjAdV");
        lIIllIIlIllll[lIIllIIllIIIl[17]] = lIlIllllllIllIl("Kzg+HCA+LQ==", "shaHo");
        lIIllIIlIllll[lIIllIIllIIIl[18]] = lIlIllllllIllIl("Ki0+DjscaD0AJB07", "xHIoI");
    }

    private static boolean lIlIlllllllIlII(int i, int i2) {
        return i < i2;
    }

    public int x() {
        return this.interfaceId;
    }

    static {
        lIlIlllllllIIll();
        lIlIlllllllIIlI();
        PURE_ESSENCE = new d(lIIllIIlIllll[lIIllIIllIIIl[0]], lIIllIIllIIIl[0], lIIllIIllIIIl[0], new ArrayList<Integer>() { // from class: e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.e
            private static /* synthetic */ int[] lIIllIlIIIlIl;

            static {
                lIllIIIIIllIllI();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                add(Integer.valueOf(lIIllIlIIIlIl[0]));
                "".length();
            }

            private static void lIllIIIIIllIllI() {
                lIIllIlIIIlIl = new int[1];
                lIIllIlIIIlIl[0] = (-((-7729) & 32443)) & (-117) & 32767;
            }
        }, lIIllIIlIllll[lIIllIIllIIIl[1]]);
        BOW_STRING = new d(lIIllIIlIllll[lIIllIIllIIIl[2]], lIIllIIllIIIl[1], lIIllIIllIIIl[1], new ArrayList<Integer>() { // from class: e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.f
            private static /* synthetic */ int[] lIIllIlIllIlI;

            private static void lIllIIIIlllIlII() {
                lIIllIlIllIlI = new int[1];
                lIIllIlIllIlI[0] = (-((-1121) & 30053)) & (-10) & 30719;
            }

            static {
                lIllIIIIlllIlII();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                add(Integer.valueOf(lIIllIlIllIlI[0]));
                "".length();
            }
        }, lIIllIIlIllll[lIIllIIllIIIl[3]]);
        SILVER_BAR = new d(lIIllIIlIllll[lIIllIIllIIIl[4]], lIIllIIllIIIl[2], lIIllIIllIIIl[2], new ArrayList<Integer>() { // from class: e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.g
            private static /* synthetic */ int[] lIIllIlIlIIlI;

            private static void lIllIIIIlIlllll() {
                lIIllIlIlIIlI = new int[1];
                lIIllIlIlIIlI[0] = (-29825) & 32180;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                add(Integer.valueOf(lIIllIlIlIIlI[0]));
                "".length();
            }

            static {
                lIllIIIIlIlllll();
            }
        }, lIIllIIlIllll[lIIllIIllIIIl[5]]);
        HERB = new d(lIIllIIlIllll[lIIllIIllIIIl[6]], lIIllIIllIIIl[3], lIIllIIllIIIl[3], List.of(Integer.valueOf(lIIllIIllIIIl[7]), Integer.valueOf(lIIllIIllIIIl[8]), Integer.valueOf(lIIllIIllIIIl[9])), lIIllIIlIllll[lIIllIIllIIIl[10]]);
        COAL_AND_IRON = new d(lIIllIIlIllll[lIIllIIllIIIl[11]], lIIllIIllIIIl[4], lIIllIIllIIIl[4], new ArrayList<Integer>() { // from class: e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.h
            private static /* synthetic */ int[] lIIllIIlllIII;

            private static void lIlIlllllllllIl() {
                lIIllIIlllIII = new int[2];
                lIIllIIlllIII[0] = (-30737) & 31190;
                lIIllIIlllIII[1] = (-31239) & 31679;
            }

            static {
                lIlIlllllllllIl();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                add(Integer.valueOf(lIIllIIlllIII[0]));
                "".length();
                add(Integer.valueOf(lIIllIIlllIII[1]));
                "".length();
            }
        }, lIIllIIlIllll[lIIllIIllIIIl[12]]);
        WATERMELON_SEED = new d(lIIllIIlIllll[lIIllIIllIIIl[13]], lIIllIIllIIIl[5], lIIllIIllIIIl[5], new ArrayList<Integer>() { // from class: e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.i
            private static /* synthetic */ int[] lIIllIlIlllII;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                add(Integer.valueOf(lIIllIlIlllII[0]));
                "".length();
            }

            static {
                lIllIIIIlllIlIl();
            }

            private static void lIllIIIIlllIlIl() {
                lIIllIlIlllII = new int[1];
                lIIllIlIlllII[0] = (-((-21611) & 30063)) & (-18449) & 32221;
            }
        }, lIIllIIlIllll[lIIllIIllIIIl[14]]);
        LOBSTER = new d(lIIllIIlIllll[lIIllIIllIIIl[15]], lIIllIIllIIIl[6], lIIllIIllIIIl[6], new ArrayList<Integer>() { // from class: e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.j
            private static /* synthetic */ int[] lIIllIlIIIlll;

            private static void lIllIIIIIllIlll() {
                lIIllIlIIIlll = new int[1];
                lIIllIlIIIlll[0] = (-25094) & 25471;
            }

            static {
                lIllIIIIIllIlll();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                add(Integer.valueOf(lIIllIlIIIlll[0]));
                "".length();
            }
        }, lIIllIIlIllll[lIIllIIllIIIl[16]]);
        XP_TOME = new d(lIIllIIlIllll[lIIllIIllIIIl[17]], lIIllIIllIIIl[10], lIIllIIllIIIl[10], new ArrayList<Integer>() { // from class: e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.k
            private static /* synthetic */ int[] lIIllIIlIlllI;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                add(Integer.valueOf(lIIllIIlIlllI[0]));
                "".length();
                add(Integer.valueOf(lIIllIIlIlllI[1]));
                "".length();
                add(Integer.valueOf(lIIllIIlIlllI[2]));
                "".length();
                add(Integer.valueOf(lIIllIIlIlllI[3]));
                "".length();
                add(Integer.valueOf(lIIllIIlIlllI[4]));
                "".length();
                add(Integer.valueOf(lIIllIIlIlllI[5]));
                "".length();
                add(Integer.valueOf(lIIllIIlIlllI[6]));
                "".length();
            }

            static {
                lIlIllllllIlIll();
            }

            private static void lIlIllllllIlIll() {
                lIIllIIlIlllI = new int[7];
                lIIllIIlIlllI[0] = (-((-5229) & 30061)) & (-1) & 32614;
                lIIllIIlIlllI[1] = (-16641) & 24431;
                lIIllIIlIlllI[2] = (-((-5225) & 29933)) & (-275) & 32767;
                lIIllIIlIlllI[3] = (-24962) & 32755;
                lIIllIIlIlllI[4] = (-145) & 7923;
                lIIllIIlIlllI[5] = (-8449) & 16236;
                lIIllIIlIlllI[6] = (-(((121 + 9) - 32) + 33)) & (-16649) & 24575;
            }
        }, lIIllIIlIllll[lIIllIIllIIIl[18]]);
        d[] dVarArr = new d[lIIllIIllIIIl[11]];
        dVarArr[lIIllIIllIIIl[0]] = PURE_ESSENCE;
        dVarArr[lIIllIIllIIIl[1]] = BOW_STRING;
        dVarArr[lIIllIIllIIIl[2]] = SILVER_BAR;
        dVarArr[lIIllIIllIIIl[3]] = HERB;
        dVarArr[lIIllIIllIIIl[4]] = COAL_AND_IRON;
        dVarArr[lIIllIIllIIIl[5]] = WATERMELON_SEED;
        dVarArr[lIIllIIllIIIl[6]] = LOBSTER;
        dVarArr[lIIllIIllIIIl[10]] = XP_TOME;
        $VALUES = dVarArr;
    }
}
