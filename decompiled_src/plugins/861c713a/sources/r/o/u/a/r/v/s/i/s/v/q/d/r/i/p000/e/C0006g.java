package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.g  reason: invalid package and case insensitive filesystem */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/g.class */
public class C0006g {
    public static /* synthetic */ int T;
    public static /* synthetic */ int S;
    public static /* synthetic */ List<String> Q;
    public static /* synthetic */ int R;
    public static /* synthetic */ int V;
    private static /* synthetic */ String[] lIlIlIIIlIIII;
    public static /* synthetic */ List<Integer> P;
    public static /* synthetic */ int U;
    private static /* synthetic */ int[] lIlIlIIIlIIIl;

    private static String lIllllIlIlIIIII(String llllllllllllllIllIllIIIllIlIllll, String llllllllllllllIllIllIIIllIllIIll) {
        String llllllllllllllIllIllIIIllIlIllll2 = new String(Base64.getDecoder().decode(llllllllllllllIllIllIIIllIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIllIIIllIllIIll.toCharArray();
        int llllllllllllllIllIllIIIllIllIIII = lIlIlIIIlIIIl[3];
        char[] charArray2 = llllllllllllllIllIllIIIllIlIllll2.toCharArray();
        int length = charArray2.length;
        int i = lIlIlIIIlIIIl[3];
        while (lIllllIlIlIIlIl(i, length)) {
            char llllllllllllllIllIllIIIllIllIlIl = charArray2[i];
            sb.append((char) (llllllllllllllIllIllIIIllIllIlIl ^ charArray[llllllllllllllIllIllIIIllIllIIII % charArray.length]));
            "".length();
            llllllllllllllIllIllIIIllIllIIII++;
            i++;
            "".length();
            if ((((23 ^ 74) ^ (74 ^ 82)) & (((((180 + 157) - 245) + 104) ^ (((33 + 45) - (-36)) + 15)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIllllIlIlIIlII();
        lIllllIlIlIIIll();
        P = List.of(Integer.valueOf(lIlIlIIIlIIIl[0]), Integer.valueOf(lIlIlIIIlIIIl[1]));
        String[] strArr = new String[lIlIlIIIlIIIl[2]];
        strArr[lIlIlIIIlIIIl[3]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[3]];
        strArr[lIlIlIIIlIIIl[4]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[4]];
        strArr[lIlIlIIIlIIIl[5]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[5]];
        strArr[lIlIlIIIlIIIl[6]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[6]];
        strArr[lIlIlIIIlIIIl[7]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[7]];
        strArr[lIlIlIIIlIIIl[8]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[8]];
        strArr[lIlIlIIIlIIIl[9]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[9]];
        strArr[lIlIlIIIlIIIl[10]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[10]];
        strArr[lIlIlIIIlIIIl[11]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[11]];
        strArr[lIlIlIIIlIIIl[12]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[12]];
        strArr[lIlIlIIIlIIIl[13]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[13]];
        strArr[lIlIlIIIlIIIl[14]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[14]];
        strArr[lIlIlIIIlIIIl[15]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[15]];
        strArr[lIlIlIIIlIIIl[16]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[16]];
        strArr[lIlIlIIIlIIIl[17]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[17]];
        strArr[lIlIlIIIlIIIl[18]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[18]];
        strArr[lIlIlIIIlIIIl[19]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[19]];
        strArr[lIlIlIIIlIIIl[20]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[20]];
        strArr[lIlIlIIIlIIIl[21]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[21]];
        strArr[lIlIlIIIlIIIl[22]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[22]];
        strArr[lIlIlIIIlIIIl[23]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[23]];
        strArr[lIlIlIIIlIIIl[24]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[24]];
        strArr[lIlIlIIIlIIIl[25]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[25]];
        strArr[lIlIlIIIlIIIl[26]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[26]];
        strArr[lIlIlIIIlIIIl[27]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[27]];
        strArr[lIlIlIIIlIIIl[28]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[28]];
        strArr[lIlIlIIIlIIIl[29]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[29]];
        strArr[lIlIlIIIlIIIl[30]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[30]];
        strArr[lIlIlIIIlIIIl[31]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[31]];
        strArr[lIlIlIIIlIIIl[32]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[32]];
        strArr[lIlIlIIIlIIIl[33]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[33]];
        strArr[lIlIlIIIlIIIl[34]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[34]];
        strArr[lIlIlIIIlIIIl[35]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[35]];
        strArr[lIlIlIIIlIIIl[36]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[36]];
        Q = List.of((Object[]) strArr);
        R = lIlIlIIIlIIIl[37];
        S = lIlIlIIIlIIIl[38];
        T = lIlIlIIIlIIIl[39];
        U = lIlIlIIIlIIIl[40];
        V = lIlIlIIIlIIIl[0];
    }

    private static void lIllllIlIlIIIll() {
        lIlIlIIIlIIII = new String[lIlIlIIIlIIIl[2]];
        lIlIlIIIlIIII[lIlIlIIIlIIIl[3]] = lIllllIlIlIIIII("NwUEKQ8dGBtmCxoKGTI=", "tmvFb");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[4]] = lIllllIlIlIIIII("EDYdADtlLAwcPSw9DA==", "EZioI");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[5]] = lIllllIlIlIIIII("CgAvJzo7ESUqKj1fOWQuNx1qLCouHA==", "OxJDO");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[6]] = lIllllIlIlIIIII("Bjk7NSIjcCQgJDs=", "PPIAW");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[7]] = lIllllIlIlIIIIl("0vuXpBoDa8iwrU6tlS01oQ==", "fmNHU");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[8]] = lIllllIlIlIIIIl("XKQzzeGN7lL4tgisO6ESsEVqjFmJR+vy", "mJIez");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[9]] = lIllllIlIlIIIIl("MX//3tv4oFRvb5vcw+cRRg==", "rLXqH");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[10]] = lIllllIlIlIIIIl("ZIpMYhHe20EdR6cICiUYRQ==", "SqMoo");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[11]] = lIllllIlIlIIIIl("3a1WM2FG2oI=", "ZzBSY");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[12]] = lIllllIlIlIIIIl("BJ35x1nezyV8f+ZngrjApw==", "OVlNR");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[13]] = lIllllIlIlIIIIl("nubYaGdw7/psvlJ5TieMhkdsoPnihwIM", "SkfOb");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[14]] = lIllllIlIlIIIII("NCgFMBkeeg42ABU2DTlWGD8FMwU=", "pZdWv");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[15]] = lIllllIlIlIIIIl("ytuR0tbkUbAuMdSoD+YQrg==", "rklfN");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[16]] = lIllllIlIlIIIIl("EtTJkmVkvxmNsuzmzM074A==", "WxyZZ");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[17]] = lIllllIlIlIIIIl("wrydBWAt2qWfEu/v3AqeUA==", "JvHMB");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[18]] = lIllllIlIlIIIII("BwEMKAgtUwkuFTdTGSYX", "CsmOg");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[19]] = lIllllIlIlIIIII("AC0iEFA1KyMQHjM9", "PXPup");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[20]] = lIllllIlIlIIIII("ECIKGkw2IgA=", "YPetl");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[21]] = lIllllIlIlIIIIl("eREzCHK2O0CLepdfWsfiXg==", "SgkLm");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[22]] = lIllllIlIlIIIlI("SX97d7pQjhvkDLWbPstKmA==", "LppOv");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[23]] = lIllllIlIlIIIII("AyIFOAE5MRA=", "PCuHi");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[24]] = lIllllIlIlIIIlI("aRTm0p9WcWo=", "wClpr");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[25]] = lIllllIlIlIIIlI("YfnSTsnkzUk=", "yVPDf");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[26]] = lIllllIlIlIIIIl("7RwM9D1R5yxvBwmYZb5JdQ==", "UFYqB");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[27]] = lIllllIlIlIIIIl("EhxIVGOJ5x/6zoWJH5jRoQ==", "eeqii");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[28]] = lIllllIlIlIIIII("IgIfO3YcFgc/", "nciZV");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[29]] = lIllllIlIlIIIIl("vKtLSsVmc/ioef7u7VfH+Q==", "haebl");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[30]] = lIllllIlIlIIIlI("08ueP3a3juxhqOsS5xoUGA==", "WEaRX");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[31]] = lIllllIlIlIIIII("KwEAIFcUHQAh", "fhnDw");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[32]] = lIllllIlIlIIIIl("jFJTn7EAAG/6SItH4+fBig==", "kRZOj");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[33]] = lIllllIlIlIIIII("KTQLHBUGJhhQA0gsGBU=", "hCjwp");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[34]] = lIllllIlIlIIIlI("oF0qWMF7YaUy67oTIuwDVS6+f4iIdiwQ", "tAxaY");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[35]] = lIllllIlIlIIIII("PA82OUcYFSw5Ewc=", "hzXXg");
        lIlIlIIIlIIII[lIlIlIIIlIIIl[36]] = lIllllIlIlIIIIl("LVOHfFn1hJHlXDe3EFq3AS+/qKtMGYvQ", "gQSvg");
    }

    private static boolean lIllllIlIlIIlIl(int i, int i2) {
        return i < i2;
    }

    private static String lIllllIlIlIIIIl(String llllllllllllllIllIllIIIllIIlIIII, String llllllllllllllIllIllIIIllIIlIIIl) {
        try {
            SecretKeySpec llllllllllllllIllIllIIIllIIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIIllIIlIIIl.getBytes(StandardCharsets.UTF_8)), lIlIlIIIlIIIl[11]), "DES");
            Cipher llllllllllllllIllIllIIIllIIlIlII = Cipher.getInstance("DES");
            llllllllllllllIllIllIIIllIIlIlII.init(lIlIlIIIlIIIl[5], llllllllllllllIllIllIIIllIIlIlIl);
            return new String(llllllllllllllIllIllIIIllIIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIIllIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIllIIIllIIlIIll) {
            llllllllllllllIllIllIIIllIIlIIll.printStackTrace();
            return null;
        }
    }

    private static void lIllllIlIlIIlII() {
        lIlIlIIIlIIIl = new int[41];
        lIlIlIIIlIIIl[0] = (-20527) & 32751;
        lIlIlIIIlIIIl[1] = (-16401) & 28627;
        lIlIlIIIlIIIl[2] = (64 ^ 39) ^ (49 ^ 116);
        lIlIlIIIlIIIl[3] = ((49 ^ 12) ^ (164 ^ 149)) & (((((75 + 121) - 126) + 116) ^ (((86 + 61) - 46) + 81)) ^ (-" ".length()));
        lIlIlIIIlIIIl[4] = " ".length();
        lIlIlIIIlIIIl[5] = "  ".length();
        lIlIlIIIlIIIl[6] = "   ".length();
        lIlIlIIIlIIIl[7] = 69 ^ 65;
        lIlIlIIIlIIIl[8] = 94 ^ 91;
        lIlIlIIIlIIIl[9] = 78 ^ 72;
        lIlIlIIIlIIIl[10] = 181 ^ 178;
        lIlIlIIIlIIIl[11] = (91 ^ 108) ^ (129 ^ 190);
        lIlIlIIIlIIIl[12] = 46 ^ 39;
        lIlIlIIIlIIIl[13] = 53 ^ 63;
        lIlIlIIIlIIIl[14] = 18 ^ 25;
        lIlIlIIIlIIIl[15] = (((114 + 105) - 96) + 9) ^ (((23 + 80) - (-24)) + 9);
        lIlIlIIIlIIIl[16] = (6 ^ 114) ^ (120 ^ 1);
        lIlIlIIIlIIIl[17] = 117 ^ 123;
        lIlIlIIIlIIIl[18] = (((88 + 86) - 153) + 145) ^ (((87 + 155) - 135) + 62);
        lIlIlIIIlIIIl[19] = 128 ^ 144;
        lIlIlIIIlIIIl[20] = (133 ^ 183) ^ (99 ^ 64);
        lIlIlIIIlIIIl[21] = (49 ^ 95) ^ (247 ^ 139);
        lIlIlIIIlIIIl[22] = (229 ^ 146) ^ (195 ^ 167);
        lIlIlIIIlIIIl[23] = (82 ^ 37) ^ (255 ^ 156);
        lIlIlIIIlIIIl[24] = (32 ^ 27) ^ (81 ^ 127);
        lIlIlIIIlIIIl[25] = 186 ^ 172;
        lIlIlIIIlIIIl[26] = 64 ^ 87;
        lIlIlIIIlIIIl[27] = 172 ^ 180;
        lIlIlIIIlIIIl[28] = 5 ^ 28;
        lIlIlIIIlIIIl[29] = 120 ^ 98;
        lIlIlIIIlIIIl[30] = 188 ^ 167;
        lIlIlIIIlIIIl[31] = (228 ^ 176) ^ (28 ^ 84);
        lIlIlIIIlIIIl[32] = 188 ^ 161;
        lIlIlIIIlIIIl[33] = (101 ^ 38) ^ (20 ^ 73);
        lIlIlIIIlIIIl[34] = 30 ^ 1;
        lIlIlIIIlIIIl[35] = 64 ^ 96;
        lIlIlIIIlIIIl[36] = (140 ^ 172) ^ " ".length();
        lIlIlIIIlIIIl[37] = (-16449) & 64870;
        lIlIlIIIlIIIl[38] = (-26145) & 28665;
        lIlIlIIIlIIIl[39] = (-((-22627) & 23667)) & (-1) & 48639;
        lIlIlIIIlIIIl[40] = (-6407) & 32615;
    }

    private static String lIllllIlIlIIIlI(String llllllllllllllIllIllIIIllIIlllll, String llllllllllllllIllIllIIIllIIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIIllIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIllIIIllIlIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIllIIIllIlIIIIl.init(lIlIlIIIlIIIl[5], secretKeySpec);
            return new String(llllllllllllllIllIllIIIllIlIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIIllIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIllIIIllIlIIIII) {
            llllllllllllllIllIllIIIllIlIIIII.printStackTrace();
            return null;
        }
    }
}
