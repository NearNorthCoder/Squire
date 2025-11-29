package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.e  reason: invalid package and case insensitive filesystem */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/e.class */
class C0004e extends HashMap<String, Integer> {
    private static /* synthetic */ String[] lIIlIlIIlIlll;
    private static /* synthetic */ int[] lIIlIlIIllIII;

    private static String lIlIlIlllIIIIII(String llllllllllllllIlllllIIIIIIIIlIIl, String llllllllllllllIlllllIIIIIIIIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIIIIIIIlIII.getBytes(StandardCharsets.UTF_8)), lIIlIlIIllIII[10]), "DES");
            Cipher llllllllllllllIlllllIIIIIIIIlIll = Cipher.getInstance("DES");
            llllllllllllllIlllllIIIIIIIIlIll.init(lIIlIlIIllIII[3], secretKeySpec);
            return new String(llllllllllllllIlllllIIIIIIIIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIIIIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllIIIIIIIIlIlI) {
            llllllllllllllIlllllIIIIIIIIlIlI.printStackTrace();
            return null;
        }
    }

    static {
        lIlIlIlllIIIIll();
        lIlIlIlllIIIIlI();
    }

    private static boolean lIlIlIlllIIIlII(int i, int i2) {
        return i < i2;
    }

    private static void lIlIlIlllIIIIll() {
        lIIlIlIIllIII = new int[48];
        lIIlIlIIllIII[0] = (227 ^ 187) & ((35 ^ 123) ^ (-1));
        lIIlIlIIllIII[1] = (-1) & Integer.MAX_VALUE;
        lIIlIlIIllIII[2] = " ".length();
        lIIlIlIIllIII[3] = "  ".length();
        lIIlIlIIllIII[4] = "   ".length();
        lIIlIlIIllIII[5] = (117 ^ 48) ^ (127 ^ 62);
        lIIlIlIIllIII[6] = (-" ".length()) & (-2) & Integer.MAX_VALUE;
        lIIlIlIIllIII[7] = "   ".length() ^ (73 ^ 79);
        lIIlIlIIllIII[8] = 76 ^ 74;
        lIIlIlIIllIII[9] = (((127 + 51) - 162) + 165) ^ (((113 + 28) - 30) + 67);
        lIIlIlIIllIII[10] = (((181 + 17) - 56) + 41) ^ (((117 + 116) - 87) + 45);
        lIIlIlIIllIII[11] = (-((-594) & 14931)) & (-33) & 16119;
        lIIlIlIIllIII[12] = 70 ^ 79;
        lIIlIlIIllIII[13] = (-((-14105) & 16283)) & (-12545) & 32222;
        lIIlIlIIllIII[14] = (21 ^ 3) ^ (130 ^ 158);
        lIIlIlIIllIII[15] = (-13065) & 131064;
        lIIlIlIIllIII[16] = (81 ^ 125) ^ (34 ^ 5);
        lIIlIlIIllIII[17] = (-((-131) & 10627)) & (-1096) & 110591;
        lIIlIlIIllIII[18] = 109 ^ 97;
        lIIlIlIIllIII[19] = (-((-26929) & 27445)) & (-4356) & 79871;
        lIIlIlIIllIII[20] = 180 ^ 185;
        lIIlIlIIllIII[21] = (-24961) & 10024959;
        lIIlIlIIllIII[22] = (206 ^ 190) ^ (10 ^ 116);
        lIIlIlIIllIII[23] = (-8321) & 10008318;
        lIIlIlIIllIII[24] = "  ".length() ^ (100 ^ 105);
        lIIlIlIIllIII[25] = (-((-17637) & 19943)) & (-16513) & 10018815;
        lIIlIlIIllIII[26] = 108 ^ 124;
        lIIlIlIIllIII[27] = (-((-25701) & 28007)) & (-24706) & 10027007;
        lIIlIlIIllIII[28] = (((93 + 40) - (-27)) + 19) ^ (((99 + 19) - (-16)) + 28);
        lIIlIlIIllIII[29] = (-((-1185) & 32190)) & (-1) & 131005;
        lIIlIlIIllIII[30] = (225 ^ 145) ^ (61 ^ 95);
        lIIlIlIIllIII[31] = (148 ^ 193) ^ (93 ^ 27);
        lIIlIlIIllIII[32] = 27 ^ 15;
        lIIlIlIIllIII[33] = (135 ^ 138) ^ (142 ^ 150);
        lIIlIlIIllIII[34] = 57 ^ 47;
        lIIlIlIIllIII[35] = 134 ^ 145;
        lIIlIlIIllIII[36] = (103 ^ 107) ^ (120 ^ 108);
        lIIlIlIIllIII[37] = (-((-4643) & 5674)) & (-9) & 131039;
        lIIlIlIIllIII[38] = (72 ^ 84) ^ (133 ^ 128);
        lIIlIlIIllIII[39] = (90 ^ 1) ^ (101 ^ 36);
        lIIlIlIIllIII[40] = 114 ^ 105;
        lIIlIlIIllIII[41] = (-8211) & 125210;
        lIIlIlIIllIII[42] = (9 ^ 124) ^ (121 ^ 16);
        lIIlIlIIllIII[43] = 3 ^ 30;
        lIIlIlIIllIII[44] = (-((-555) & 13183)) & (-641) & 98268;
        lIIlIlIIllIII[45] = (54 ^ 97) ^ (33 ^ 104);
        lIIlIlIIllIII[46] = (-283) & 20282;
        lIIlIlIIllIII[47] = 101 ^ 122;
    }

    private static String lIlIlIllIllllll(String llllllllllllllIlllllIIIIIIIllllI, String llllllllllllllIlllllIIIIIIIlllIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllllIIIIIIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllllIIIIIIIlllIl.toCharArray();
        int llllllllllllllIlllllIIIIIIIllIlI = lIIlIlIIllIII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIlIlIIllIII[0];
        while (lIlIlIlllIIIlII(i, length)) {
            char llllllllllllllIlllllIIIIIIIlllll = charArray2[i];
            sb.append((char) (llllllllllllllIlllllIIIIIIIlllll ^ charArray[llllllllllllllIlllllIIIIIIIllIlI % charArray.length]));
            "".length();
            llllllllllllllIlllllIIIIIIIllIlI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIlIlIlllIIIIIl(String llllllllllllllIlllllIIIIIIlIllII, String llllllllllllllIlllllIIIIIIlIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIIIIIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIlIIllIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIIIIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllIIIIIIlIllll) {
            llllllllllllllIlllllIIIIIIlIllll.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIlllIIIIlI() {
        lIIlIlIIlIlll = new String[lIIlIlIIllIII[47]];
        lIIlIlIIlIlll[lIIlIlIIllIII[0]] = lIlIlIllIllllll("FjAdMTcqPAY+cy04AyQ=", "EQoPS");
        lIIlIlIIlIlll[lIIlIlIIllIII[2]] = lIlIlIlllIIIIII("wnlegxVEu2qTak/pkxJtITpmWmHC5pUs", "oVkMQ");
        lIIlIlIIlIlll[lIIlIlIIllIII[3]] = lIlIlIllIllllll("IhkRBSoeFQoKbgIPDBYq", "qxcdN");
        lIIlIlIIlIlll[lIIlIlIIllIII[4]] = lIlIlIlllIIIIIl("oz8berwEI0bcuvSv1qReKwHo4Xq1c0es", "lpCtw");
        lIIlIlIIlIlll[lIIlIlIIllIII[5]] = lIlIlIlllIIIIII("bHoQw9TOl//AbVZ6ecD3DNFNb+ms4yAX", "ddbhk");
        lIIlIlIIlIlll[lIIlIlIIllIII[7]] = lIlIlIlllIIIIII("52W2s3ew+fD0AtvkOnOz2qiVDmfmGGgG", "hGuDn");
        lIIlIlIIlIlll[lIIlIlIIllIII[8]] = lIlIlIlllIIIIIl("uAYKB3ZgniozAX8A3NVHSu/JImWOCagL", "pWCIP");
        lIIlIlIIlIlll[lIIlIlIIllIII[9]] = lIlIlIlllIIIIIl("11YK22Z+lMM=", "gadDZ");
        lIIlIlIIlIlll[lIIlIlIIllIII[10]] = lIlIlIlllIIIIIl("g/gvwZobH83MeYaJiwCaNw==", "HGqEe");
        lIIlIlIIlIlll[lIIlIlIIllIII[12]] = lIlIlIllIllllll("IAcnJRoKCg==", "dnFHu");
        lIIlIlIIlIlll[lIIlIlIIllIII[14]] = lIlIlIlllIIIIII("JRsXQA6RcF0xIfyRO7fC9A==", "pLTwE");
        lIIlIlIIlIlll[lIIlIlIIllIII[16]] = lIlIlIllIllllll("IBoLJxdHGgMkDxUaQj0LAgw=", "ghbJn");
        lIIlIlIIlIlll[lIIlIlIIllIII[18]] = lIlIlIlllIIIIII("Ulb99ZfKBGJHdzuD3QSh5g==", "XGkek");
        lIIlIlIIlIlll[lIIlIlIIllIII[20]] = lIlIlIlllIIIIII("N6pxYzGRe0gdB6dDUwXlSqmoawIezl4z", "pJGAz");
        lIIlIlIIlIlll[lIIlIlIIllIII[22]] = lIlIlIlllIIIIII("/1Q6bfcAZKx56GndMbDt9KgUvE0QE4T0", "zzIdK");
        lIIlIlIIlIlll[lIIlIlIIllIII[24]] = lIlIlIlllIIIIIl("4dkLHdwa6PTIwP/GqSNSMfR4AHHwHADE", "tYvnl");
        lIIlIlIIlIlll[lIIlIlIIllIII[26]] = lIlIlIllIllllll("OSUMGAMEME0FBR44AhtCW3g=", "jQmuj");
        lIIlIlIIlIlll[lIIlIlIIllIII[28]] = lIlIlIlllIIIIIl("jEReEYdBk2LcVw9ZJqbD5w==", "mkfCh");
        lIIlIlIIlIlll[lIIlIlIIllIII[30]] = lIlIlIllIllllll("GhkaPHh6BFQqLyceEA==", "HltYX");
        lIIlIlIIlIlll[lIIlIlIIllIII[31]] = lIlIlIlllIIIIIl("s7Y9em3XUG90k7QrfAtCtw==", "zDuuG");
        lIIlIlIIlIlll[lIIlIlIIllIII[32]] = lIlIlIllIllllll("JzovAk0FJiIMDA0q", "uOAgm");
        lIIlIlIIlIlll[lIIlIlIIllIII[33]] = lIlIlIlllIIIIII("I+gEGqbACLcTFaRTzpRT5Q==", "eGkyG");
        lIIlIlIIlIlll[lIIlIlIIllIII[34]] = lIlIlIlllIIIIII("H0U5QkIZpWVXaMwhnKYtVA==", "RPOJQ");
        lIIlIlIIlIlll[lIIlIlIIllIII[35]] = lIlIlIlllIIIIII("saPOT2pfCrl/3VWCIuxLgq36xaoqUdTD", "UbqXm");
        lIIlIlIIlIlll[lIIlIlIIllIII[36]] = lIlIlIlllIIIIIl("9nnqTpuHOnG0aet3gtgTpg==", "ihOoo");
        lIIlIlIIlIlll[lIIlIlIIllIII[38]] = lIlIlIlllIIIIIl("qceJpEB+7YWDKx+1Hkth8Isy++dFX5Tx", "ausar");
        lIIlIlIIlIlll[lIIlIlIIllIII[39]] = lIlIlIlllIIIIII("p1+6qs96v8j2rU6fHqDbZw==", "OzeBu");
        lIIlIlIIlIlll[lIIlIlIIllIII[40]] = lIlIlIlllIIIIIl("dmNk52B31kk=", "iRctz");
        lIIlIlIIlIlll[lIIlIlIIllIII[42]] = lIlIlIlllIIIIII("Ph2JLUWcphakl70urFk5Gw==", "RvWNC");
        lIIlIlIIlIlll[lIIlIlIIllIII[43]] = lIlIlIlllIIIIIl("CST97F9UP1I=", "QTNcW");
        lIIlIlIIlIlll[lIIlIlIIllIII[45]] = lIlIlIlllIIIIII("ZWTXGoOcL8zHkF6Gswax1Q==", "txiFv");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0004e() {
        put(lIIlIlIIlIlll[lIIlIlIIllIII[0]], Integer.valueOf(lIIlIlIIllIII[1]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[2]], Integer.valueOf(lIIlIlIIllIII[1]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[3]], Integer.valueOf(lIIlIlIIllIII[1]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[4]], Integer.valueOf(lIIlIlIIllIII[1]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[5]], Integer.valueOf(lIIlIlIIllIII[6]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[7]], Integer.valueOf(lIIlIlIIllIII[6]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[8]], Integer.valueOf(lIIlIlIIllIII[6]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[9]], Integer.valueOf(lIIlIlIIllIII[2]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[10]], Integer.valueOf(lIIlIlIIllIII[11]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[12]], Integer.valueOf(lIIlIlIIllIII[13]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[14]], Integer.valueOf(lIIlIlIIllIII[15]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[16]], Integer.valueOf(lIIlIlIIllIII[17]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[18]], Integer.valueOf(lIIlIlIIllIII[19]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[20]], Integer.valueOf(lIIlIlIIllIII[21]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[22]], Integer.valueOf(lIIlIlIIllIII[23]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[24]], Integer.valueOf(lIIlIlIIllIII[25]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[26]], Integer.valueOf(lIIlIlIIllIII[27]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[28]], Integer.valueOf(lIIlIlIIllIII[29]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[30]], Integer.valueOf(lIIlIlIIllIII[29]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[31]], Integer.valueOf(lIIlIlIIllIII[29]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[32]], Integer.valueOf(lIIlIlIIllIII[29]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[33]], Integer.valueOf(lIIlIlIIllIII[29]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[34]], Integer.valueOf(lIIlIlIIllIII[29]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[35]], Integer.valueOf(lIIlIlIIllIII[29]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[36]], Integer.valueOf(lIIlIlIIllIII[37]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[38]], Integer.valueOf(lIIlIlIIllIII[37]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[39]], Integer.valueOf(lIIlIlIIllIII[37]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[40]], Integer.valueOf(lIIlIlIIllIII[41]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[42]], Integer.valueOf(lIIlIlIIllIII[17]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[43]], Integer.valueOf(lIIlIlIIllIII[44]));
        "".length();
        put(lIIlIlIIlIlll[lIIlIlIIllIII[45]], Integer.valueOf(lIIlIlIIllIII[46]));
        "".length();
    }
}
