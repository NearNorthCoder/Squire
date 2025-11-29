package s.h.p000.m.a.n.u.r.i.s.q.a.s.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: s.h.-.m.a.n.u.r.i.s.q.a.s.e.b  reason: invalid package and case insensitive filesystem */
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:s/h/-/m/a/n/u/r/i/s/q/a/s/e/b.class */
class C0001b extends HashMap<String, Integer> {
    private static /* synthetic */ int[] lIIlIllllllII;
    private static /* synthetic */ String[] lIIlIllllIlII;

    private static String lIlIlllIIIlIIlI(String llllllllllllllIllllIIlllIIlIIIlI, String llllllllllllllIllllIIlllIIlIIIIl) {
        try {
            SecretKeySpec llllllllllllllIllllIIlllIIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIlllIIlIIIIl.getBytes(StandardCharsets.UTF_8)), lIIlIllllllII[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIllllllII[3], llllllllllllllIllllIIlllIIlIIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIlllIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIlllIIlIIIll) {
            llllllllllllllIllllIIlllIIlIIIll.printStackTrace();
            return null;
        }
    }

    private static String lIlIlllIIIIlIII(String llllllllllllllIllllIIllIllllllIl, String llllllllllllllIllllIIllIllllllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIllIllllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIllIllllllll = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIllIllllllll.init(lIIlIllllllII[3], secretKeySpec);
            return new String(llllllllllllllIllllIIllIllllllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIllIllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIllIlllllllI) {
            llllllllllllllIllllIIllIlllllllI.printStackTrace();
            return null;
        }
    }

    static {
        lIlIlllIIIllllI();
        lIlIlllIIIlllII();
    }

    private static void lIlIlllIIIllllI() {
        lIIlIllllllII = new int[48];
        lIIlIllllllII[0] = ((((87 + 196) - 192) + 126) ^ (((86 + 89) - 73) + 27)) & (((37 ^ 45) ^ (255 ^ 175)) ^ (-" ".length()));
        lIIlIllllllII[1] = (-1) & Integer.MAX_VALUE;
        lIIlIllllllII[2] = " ".length();
        lIIlIllllllII[3] = "  ".length();
        lIIlIllllllII[4] = "   ".length();
        lIIlIllllllII[5] = 123 ^ 127;
        lIIlIllllllII[6] = (-" ".length()) & (-1) & 2147483646;
        lIIlIllllllII[7] = 0 ^ 5;
        lIIlIllllllII[8] = (206 ^ 151) ^ (31 ^ 64);
        lIIlIllllllII[9] = (9 ^ 6) ^ (175 ^ 167);
        lIIlIllllllII[10] = 174 ^ 166;
        lIIlIllllllII[11] = (-((-27969) & 32582)) & (-1) & 122613;
        lIIlIllllllII[12] = (218 ^ 197) ^ (83 ^ 69);
        lIIlIllllllII[13] = (-((-539) & 23387)) & (-8196) & 130043;
        lIIlIllllllII[14] = (((4 + 108) - 44) + 111) ^ (((120 + 118) - 230) + 177);
        lIIlIllllllII[15] = (-24833) & 10024831;
        lIIlIllllllII[16] = 65 ^ 74;
        lIIlIllllllII[17] = (-26881) & 10026878;
        lIIlIllllllII[18] = (18 ^ 32) ^ (58 ^ 4);
        lIIlIllllllII[19] = (-16641) & 10016637;
        lIIlIllllllII[20] = 93 ^ 80;
        lIIlIllllllII[21] = (-((-22361) & 30555)) & (-2433) & 10010622;
        lIIlIllllllII[22] = 179 ^ 189;
        lIIlIllllllII[23] = (-((-3601) & 28254)) & (-2307) & 126959;
        lIIlIllllllII[24] = (((96 + 39) - 84) + 133) ^ (((72 + 112) - 157) + 156);
        lIIlIllllllII[25] = 72 ^ 88;
        lIIlIllllllII[26] = 121 ^ 104;
        lIIlIllllllII[27] = 72 ^ 90;
        lIIlIllllllII[28] = (163 ^ 167) ^ (69 ^ 82);
        lIIlIllllllII[29] = (-((-3073) & 15992)) & (-1) & 129919;
        lIIlIllllllII[30] = 89 ^ 77;
        lIIlIllllllII[31] = (-((-18529) & 19816)) & (-1) & 98287;
        lIIlIllllllII[32] = 24 ^ 13;
        lIIlIllllllII[33] = (-2139) & 98138;
        lIIlIllllllII[34] = (63 ^ 121) ^ (210 ^ 130);
        lIIlIllllllII[35] = (-((-19281) & 23515)) & (-69) & 98302;
        lIIlIllllllII[36] = 12 ^ 27;
        lIIlIllllllII[37] = (-((-15112) & 16319)) & (-1) & 94207;
        lIIlIllllllII[38] = 14 ^ 22;
        lIIlIllllllII[39] = 222 ^ 199;
        lIIlIllllllII[40] = (-16407) & 24406;
        lIIlIllllllII[41] = 184 ^ 162;
        lIIlIllllllII[42] = (-13316) & 14315;
        lIIlIllllllII[43] = (123 ^ 105) ^ (188 ^ 181);
        lIIlIllllllII[44] = (-((-3172) & 11891)) & (-4353) & 14271;
        lIIlIllllllII[45] = 157 ^ 129;
        lIIlIllllllII[46] = (-12292) & 13091;
        lIIlIllllllII[47] = (102 ^ 17) ^ (15 ^ 101);
    }

    private static boolean lIlIlllIIlIIIIl(int i, int i2) {
        return i < i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0001b() {
        put(lIIlIllllIlII[lIIlIllllllII[0]], Integer.valueOf(lIIlIllllllII[1]));
        "".length();
        put(lIIlIllllIlII[lIIlIllllllII[2]], Integer.valueOf(lIIlIllllllII[1]));
        "".length();
        put(lIIlIllllIlII[lIIlIllllllII[3]], Integer.valueOf(lIIlIllllllII[1]));
        "".length();
        put(lIIlIllllIlII[lIIlIllllllII[4]], Integer.valueOf(lIIlIllllllII[1]));
        "".length();
        put(lIIlIllllIlII[lIIlIllllllII[5]], Integer.valueOf(lIIlIllllllII[6]));
        "".length();
        put(lIIlIllllIlII[lIIlIllllllII[7]], Integer.valueOf(lIIlIllllllII[6]));
        "".length();
        put(lIIlIllllIlII[lIIlIllllllII[8]], Integer.valueOf(lIIlIllllllII[6]));
        "".length();
        put(lIIlIllllIlII[lIIlIllllllII[9]], Integer.valueOf(lIIlIllllllII[2]));
        "".length();
        put(lIIlIllllIlII[lIIlIllllllII[10]], Integer.valueOf(lIIlIllllllII[11]));
        "".length();
        put(lIIlIllllIlII[lIIlIllllllII[12]], Integer.valueOf(lIIlIllllllII[13]));
        "".length();
        put(lIIlIllllIlII[lIIlIllllllII[14]], Integer.valueOf(lIIlIllllllII[15]));
        "".length();
        put(lIIlIllllIlII[lIIlIllllllII[16]], Integer.valueOf(lIIlIllllllII[17]));
        "".length();
        put(lIIlIllllIlII[lIIlIllllllII[18]], Integer.valueOf(lIIlIllllllII[19]));
        "".length();
        put(lIIlIllllIlII[lIIlIllllllII[20]], Integer.valueOf(lIIlIllllllII[21]));
        "".length();
        put(lIIlIllllIlII[lIIlIllllllII[22]], Integer.valueOf(lIIlIllllllII[23]));
        "".length();
        put(lIIlIllllIlII[lIIlIllllllII[24]], Integer.valueOf(lIIlIllllllII[23]));
        "".length();
        put(lIIlIllllIlII[lIIlIllllllII[25]], Integer.valueOf(lIIlIllllllII[23]));
        "".length();
        put(lIIlIllllIlII[lIIlIllllllII[26]], Integer.valueOf(lIIlIllllllII[23]));
        "".length();
        put(lIIlIllllIlII[lIIlIllllllII[27]], Integer.valueOf(lIIlIllllllII[23]));
        "".length();
        put(lIIlIllllIlII[lIIlIllllllII[28]], Integer.valueOf(lIIlIllllllII[29]));
        "".length();
        put(lIIlIllllIlII[lIIlIllllllII[30]], Integer.valueOf(lIIlIllllllII[31]));
        "".length();
        put(lIIlIllllIlII[lIIlIllllllII[32]], Integer.valueOf(lIIlIllllllII[33]));
        "".length();
        put(lIIlIllllIlII[lIIlIllllllII[34]], Integer.valueOf(lIIlIllllllII[35]));
        "".length();
        put(lIIlIllllIlII[lIIlIllllllII[36]], Integer.valueOf(lIIlIllllllII[37]));
        "".length();
        put(lIIlIllllIlII[lIIlIllllllII[38]], Integer.valueOf(lIIlIllllllII[37]));
        "".length();
        put(lIIlIllllIlII[lIIlIllllllII[39]], Integer.valueOf(lIIlIllllllII[40]));
        "".length();
        put(lIIlIllllIlII[lIIlIllllllII[41]], Integer.valueOf(lIIlIllllllII[42]));
        "".length();
        put(lIIlIllllIlII[lIIlIllllllII[43]], Integer.valueOf(lIIlIllllllII[44]));
        "".length();
        put(lIIlIllllIlII[lIIlIllllllII[45]], Integer.valueOf(lIIlIllllllII[46]));
        "".length();
    }

    private static String lIlIlllIIIIIlll(String llllllllllllllIllllIIlllIIIlIIlI, String llllllllllllllIllllIIlllIIIlIIIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllllIIlllIIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllllIIlllIIIlIIIl.toCharArray();
        int llllllllllllllIllllIIlllIIIIlllI = lIIlIllllllII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIlIllllllII[0];
        while (lIlIlllIIlIIIIl(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllIllllIIlllIIIIlllI % charArray.length]));
            "".length();
            llllllllllllllIllllIIlllIIIIlllI++;
            i++;
            "".length();
            if ((-" ".length()) >= ((196 ^ 158) ^ (96 ^ 62))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIlIlllIIIlllII() {
        lIIlIllllIlII = new String[lIIlIllllllII[47]];
        lIIlIllllIlII[lIIlIllllllII[0]] = lIlIlllIIIIIlll("LBs9CQwdWjAFBh0OIwECGh8=", "nzSmc");
        lIIlIllllIlII[lIIlIllllllII[2]] = lIlIlllIIIIIlll("FTEqAgUkcDAHGSQ1MBU=", "WPDfj");
        lIIlIllllIlII[lIIlIllllllII[3]] = lIlIlllIIIIlIII("WbnI6GzhNJRDSEPuaBcQfg==", "rMHrA");
        lIIlIllllIlII[lIIlIllllllII[4]] = lIlIlllIIIIIlll("BREULx40UBgkHjMD", "GpzKq");
        lIIlIllllIlII[lIIlIllllllII[5]] = lIlIlllIIIIlIII("BmMlJyFDMHS96koR38kV7D6ayeN2Kd96", "dflma");
        lIIlIllllIlII[lIIlIllllllII[7]] = lIlIlllIIIIlIII("k1S0Z9m4PP9PEVVzUJZNMCC50eeY664g", "XxpNA");
        lIIlIllllIlII[lIIlIllllllII[8]] = lIlIlllIIIIlIII("Byj5EWnBomesKQSSrKi7JH+tK14jK25g", "RbPiN");
        lIIlIllllIlII[lIIlIllllllII[9]] = lIlIlllIIIIIlll("LyYfDDk=", "lIvbJ");
        lIIlIllllIlII[lIIlIllllllII[10]] = lIlIlllIIIIlIII("Kp2toQcTB9U7CTdf2oJ/uA==", "KxroW");
        lIIlIllllIlII[lIIlIllllllII[12]] = lIlIlllIIIIlIII("TrxV0bXsE2zX44jMtEE+KwQ/+shRCseO", "dIEEZ");
        lIIlIllllIlII[lIIlIllllllII[14]] = lIlIlllIIIIlIII("N+gZ17q7U1eeGcNQcImMaE0ypLnEjPk7", "yKHfq");
        lIIlIllllIlII[lIIlIllllllII[16]] = lIlIlllIIIIIlll("GiIoPw4nN2kiCD0/JjxPen8=", "IVIRg");
        lIIlIllllIlII[lIIlIllllllII[18]] = lIlIlllIIIlIIlI("ludoc7WucYUQ3dwrDAHxrUqUIhkreGwC", "Tleco");
        lIIlIllllIlII[lIIlIllllllII[20]] = lIlIlllIIIIlIII("xnNflnntWVZ+v1FN6ZrodZ/UR4buNu82", "dDckQ");
        lIIlIllllIlII[lIIlIllllllII[22]] = lIlIlllIIIIIlll("GC8kJG86Nis1Kig1Ljg=", "JZJAO");
        lIIlIllllIlII[lIIlIllllllII[24]] = lIlIlllIIIIIlll("MBg6BHVQBXQSIg0fMA==", "bmTaU");
        lIIlIllllIlII[lIIlIllllllII[25]] = lIlIlllIIIIIlll("Fh0XLnAoBxcsIzMHCy8=", "DhyKP");
        lIIlIllllIlII[lIIlIllllllII[26]] = lIlIlllIIIlIIlI("R014A5uNgZbbitO0puED9Q==", "ACeKq");
        lIIlIllllIlII[lIIlIllllllII[27]] = lIlIlllIIIIlIII("jKJ/WfDlsrKitdtaA8QZ7A==", "ndrBM");
        lIIlIllllIlII[lIIlIllllllII[28]] = lIlIlllIIIlIIlI("osBE+ngrVJg=", "tHLKC");
        lIIlIllllIlII[lIIlIllllllII[30]] = lIlIlllIIIlIIlI("Dah6AxUi1aC1MBkrgndsBA==", "UzYpx");
        lIIlIllllIlII[lIIlIllllllII[32]] = lIlIlllIIIIlIII("hPAcSddK0Dg1ACuWS0VBKg==", "ghyTN");
        lIIlIllllIlII[lIIlIllllllII[34]] = lIlIlllIIIIlIII("SUDmQgLjScM=", "ILlfK");
        lIIlIllllIlII[lIIlIllllllII[36]] = lIlIlllIIIIlIII("3yUMUqVBIS4=", "XBYWx");
        lIIlIllllIlII[lIIlIllllllII[38]] = lIlIlllIIIlIIlI("K03hd2hcZnVN8tHvfnPVBw==", "ednWP");
        lIIlIllllIlII[lIIlIllllllII[39]] = lIlIlllIIIIlIII("K6FUH1Al7FcGEweDStRQ/A==", "Xkymq");
        lIIlIllllIlII[lIIlIllllllII[41]] = lIlIlllIIIlIIlI("hZneR9hAI2+VOkp4QoFW9g==", "owaiV");
        lIIlIllllIlII[lIIlIllllllII[43]] = lIlIlllIIIIIlll("CiQxOw==", "IKPWn");
        lIIlIllllIlII[lIIlIllllllII[45]] = lIlIlllIIIlIIlI("P/6j198Q2XpP2wUWxLPe6g==", "nQGiS");
    }
}
