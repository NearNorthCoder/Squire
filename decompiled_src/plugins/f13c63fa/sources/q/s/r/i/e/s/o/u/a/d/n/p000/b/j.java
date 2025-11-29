package q.s.r.i.e.s.o.u.a.d.n.p000.b;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: q.s.r.i.e.s.o.u.a.d.n.-.b.j  reason: invalid package */
/* loaded from: f13c63fa-3e76-4035-9dfa-e833a382cd4c.jar:q/s/r/i/e/s/o/u/a/d/n/-/b/j.class */
class j extends HashMap<String, Integer> {
    private static /* synthetic */ String[] lllIIIlIIlI;
    private static /* synthetic */ int[] lllIIIlIllI;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j() {
        put(lllIIIlIIlI[lllIIIlIllI[0]], Integer.valueOf(lllIIIlIllI[1]));
        "".length();
        put(lllIIIlIIlI[lllIIIlIllI[2]], Integer.valueOf(lllIIIlIllI[1]));
        "".length();
        put(lllIIIlIIlI[lllIIIlIllI[3]], Integer.valueOf(lllIIIlIllI[1]));
        "".length();
        put(lllIIIlIIlI[lllIIIlIllI[4]], Integer.valueOf(lllIIIlIllI[1]));
        "".length();
        put(lllIIIlIIlI[lllIIIlIllI[5]], Integer.valueOf(lllIIIlIllI[6]));
        "".length();
        put(lllIIIlIIlI[lllIIIlIllI[7]], Integer.valueOf(lllIIIlIllI[6]));
        "".length();
        put(lllIIIlIIlI[lllIIIlIllI[8]], Integer.valueOf(lllIIIlIllI[6]));
        "".length();
        put(lllIIIlIIlI[lllIIIlIllI[9]], Integer.valueOf(lllIIIlIllI[2]));
        "".length();
        put(lllIIIlIIlI[lllIIIlIllI[10]], Integer.valueOf(lllIIIlIllI[11]));
        "".length();
        put(lllIIIlIIlI[lllIIIlIllI[12]], Integer.valueOf(lllIIIlIllI[13]));
        "".length();
        put(lllIIIlIIlI[lllIIIlIllI[14]], Integer.valueOf(lllIIIlIllI[15]));
        "".length();
        put(lllIIIlIIlI[lllIIIlIllI[16]], Integer.valueOf(lllIIIlIllI[17]));
        "".length();
        put(lllIIIlIIlI[lllIIIlIllI[18]], Integer.valueOf(lllIIIlIllI[19]));
        "".length();
        put(lllIIIlIIlI[lllIIIlIllI[20]], Integer.valueOf(lllIIIlIllI[21]));
        "".length();
        put(lllIIIlIIlI[lllIIIlIllI[22]], Integer.valueOf(lllIIIlIllI[23]));
        "".length();
        put(lllIIIlIIlI[lllIIIlIllI[24]], Integer.valueOf(lllIIIlIllI[23]));
        "".length();
        put(lllIIIlIIlI[lllIIIlIllI[25]], Integer.valueOf(lllIIIlIllI[23]));
        "".length();
        put(lllIIIlIIlI[lllIIIlIllI[26]], Integer.valueOf(lllIIIlIllI[23]));
        "".length();
        put(lllIIIlIIlI[lllIIIlIllI[27]], Integer.valueOf(lllIIIlIllI[23]));
        "".length();
        put(lllIIIlIIlI[lllIIIlIllI[28]], Integer.valueOf(lllIIIlIllI[29]));
        "".length();
        put(lllIIIlIIlI[lllIIIlIllI[30]], Integer.valueOf(lllIIIlIllI[31]));
        "".length();
        put(lllIIIlIIlI[lllIIIlIllI[32]], Integer.valueOf(lllIIIlIllI[33]));
        "".length();
        put(lllIIIlIIlI[lllIIIlIllI[34]], Integer.valueOf(lllIIIlIllI[35]));
        "".length();
        put(lllIIIlIIlI[lllIIIlIllI[36]], Integer.valueOf(lllIIIlIllI[37]));
        "".length();
        put(lllIIIlIIlI[lllIIIlIllI[38]], Integer.valueOf(lllIIIlIllI[37]));
        "".length();
        put(lllIIIlIIlI[lllIIIlIllI[39]], Integer.valueOf(lllIIIlIllI[40]));
        "".length();
        put(lllIIIlIIlI[lllIIIlIllI[41]], Integer.valueOf(lllIIIlIllI[42]));
        "".length();
        put(lllIIIlIIlI[lllIIIlIllI[43]], Integer.valueOf(lllIIIlIllI[44]));
        "".length();
        put(lllIIIlIIlI[lllIIIlIllI[45]], Integer.valueOf(lllIIIlIllI[46]));
        "".length();
    }

    private static boolean lIlIllIllllIII(int i, int i2) {
        return i < i2;
    }

    private static String lIlIllIllIlIIl(String llllllllllllllllIIlIIlllIIIIllII, String llllllllllllllllIIlIIlllIIIIlIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlllIIIIlIll.getBytes(StandardCharsets.UTF_8)), lllIIIlIllI[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIlIllI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlllIIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIlllIIIIlIII) {
            llllllllllllllllIIlIIlllIIIIlIII.printStackTrace();
            return null;
        }
    }

    static {
        lIlIllIlllIlll();
        lIlIllIlllIIll();
    }

    private static void lIlIllIlllIlll() {
        lllIIIlIllI = new int[48];
        lllIIIlIllI[0] = (140 ^ 157) & ((144 ^ 129) ^ (-1));
        lllIIIlIllI[1] = (-" ".length()) & (-1) & Integer.MAX_VALUE;
        lllIIIlIllI[2] = " ".length();
        lllIIIlIllI[3] = "  ".length();
        lllIIIlIllI[4] = "   ".length();
        lllIIIlIllI[5] = (((174 + 99) - 219) + 135) ^ (((14 + 88) - 46) + 129);
        lllIIIlIllI[6] = (-" ".length()) & (-1) & 2147483646;
        lllIIIlIllI[7] = 187 ^ 190;
        lllIIIlIllI[8] = 170 ^ 172;
        lllIIIlIllI[9] = 123 ^ 124;
        lllIIIlIllI[10] = 139 ^ 131;
        lllIIIlIllI[11] = (-12296) & 130295;
        lllIIIlIllI[12] = 163 ^ 170;
        lllIIIlIllI[13] = (-((-561) & 12918)) & (-3331) & 114687;
        lllIIIlIllI[14] = (4 ^ 33) ^ (83 ^ 124);
        lllIIIlIllI[15] = (-10625) & 10010623;
        lllIIIlIllI[16] = 151 ^ 156;
        lllIIIlIllI[17] = (-18818) & 10018815;
        lllIIIlIllI[18] = 70 ^ 74;
        lllIIIlIllI[19] = (-259) & 10000255;
        lllIIIlIllI[20] = (((8 + 130) - 16) + 51) ^ (((150 + 88) - 152) + 74);
        lllIIIlIllI[21] = (-((-4627) & 15251)) & (-3) & 10010622;
        lllIIIlIllI[22] = (175 ^ 196) ^ (217 ^ 188);
        lllIIIlIllI[23] = (-28768) & 128767;
        lllIIIlIllI[24] = 148 ^ 155;
        lllIIIlIllI[25] = 20 ^ 4;
        lllIIIlIllI[26] = 66 ^ 83;
        lllIIIlIllI[27] = (37 ^ 84) ^ (67 ^ 32);
        lllIIIlIllI[28] = 7 ^ 20;
        lllIIIlIllI[29] = (-((-2563) & 15078)) & (-5) & 129519;
        lllIIIlIllI[30] = 87 ^ 67;
        lllIIIlIllI[31] = (-6) & 97005;
        lllIIIlIllI[32] = (((17 + 42) - 5) + 79) ^ (((89 + 142) - 106) + 19);
        lllIIIlIllI[33] = (-((-30659) & 32723)) & (-67) & 98130;
        lllIIIlIllI[34] = 121 ^ 111;
        lllIIIlIllI[35] = (-((-28266) & 32493)) & (-69) & 98295;
        lllIIIlIllI[36] = (34 ^ 76) ^ (23 ^ 110);
        lllIIIlIllI[37] = (-4136) & 97135;
        lllIIIlIllI[38] = (44 ^ 122) ^ (53 ^ 123);
        lllIIIlIllI[39] = 79 ^ 86;
        lllIIIlIllI[40] = (-24628) & 32627;
        lllIIIlIllI[41] = (((19 + 142) - 77) + 85) ^ (((42 + 105) - 119) + 151);
        lllIIIlIllI[42] = (-3090) & 4089;
        lllIIIlIllI[43] = "  ".length() ^ (136 ^ 145);
        lllIIIlIllI[44] = (-((-6713) & 31613)) & (-4617) & 30716;
        lllIIIlIllI[45] = 165 ^ 185;
        lllIIIlIllI[46] = (-15584) & 16383;
        lllIIIlIllI[47] = (87 ^ 83) ^ (112 ^ 105);
    }

    private static void lIlIllIlllIIll() {
        lllIIIlIIlI = new String[lllIIIlIllI[47]];
        lllIIIlIIlI[lllIIIlIllI[0]] = lIlIllIllIlIII("ISQ7CwkQZTYHAxAxJQMHFyA=", "cEUof");
        lllIIIlIIlI[lllIIIlIllI[2]] = lIlIllIllIlIIl("ne260tb2lmIGPobZkC3FFQ==", "trJNy");
        lllIIIlIIlI[lllIIIlIllI[3]] = lIlIllIllIlIII("MTk9Kx4AeDsmHQc=", "sXSOq");
        lllIIIlIIlI[lllIIIlIllI[4]] = lIlIllIllIlIIl("eC59EvUYFvxRVtWhd9Ol+A==", "DktPP");
        lllIIIlIIlI[lllIIIlIllI[5]] = lIlIllIllIlIIl("u9zJEFmCaqsx2LlpbHcylVFEHe6uRHWf", "nBRBS");
        lllIIIlIIlI[lllIIIlIllI[7]] = lIlIllIllIlIII("Mj0rNjIaICtlNh0zPSFlRw==", "uROEE");
        lllIIIlIIlI[lllIIIlIllI[8]] = lIlIllIllIlIIl("f9VuCk1oh+mnNDkB6lF70edyWvQQM6D3", "uzmPg");
        lllIIIlIIlI[lllIIIlIllI[9]] = lIlIllIllIlIlI("/f/KTGEuIaA=", "XorlX");
        lllIIIlIIlI[lllIIIlIllI[10]] = lIlIllIllIlIlI("gRtGnb3Z6MmkwXlHKKLYog==", "xKubF");
        lllIIIlIIlI[lllIIIlIllI[12]] = lIlIllIllIlIlI("KKw2QnXA6UazRBz2dJ31AB0An2jHkN6d", "bjvkg");
        lllIIIlIIlI[lllIIIlIllI[14]] = lIlIllIllIlIII("CwI1FwE2F3QKBywfOxRAbF8=", "XvTzh");
        lllIIIlIIlI[lllIIIlIllI[16]] = lIlIllIllIlIIl("XQtygtdzPmz87O3cLbTeqNlZ+z8eFnhZ", "Tkgxx");
        lllIIIlIIlI[lllIIIlIllI[18]] = lIlIllIllIlIIl("vmUoH36mZmalsl5/J/0wxuvX3s1uP0gW", "KKkui");
        lllIIIlIIlI[lllIIIlIllI[20]] = lIlIllIllIlIlI("Bbm5FHX9cdoqBWloSVMqFAnJESMj7vai", "smZNq");
        lllIIIlIIlI[lllIIIlIllI[22]] = lIlIllIllIlIII("JzkfIVoFIBAwHxcjFT0=", "uLqDz");
        lllIIIlIIlI[lllIIIlIllI[24]] = lIlIllIllIlIIl("7gbW9TTF5T+SDH1poWvulA==", "bQzmA");
        lllIIIlIIlI[lllIIIlIllI[25]] = lIlIllIllIlIlI("9B4Cn0Kzfx/trYLzGFaTOQ==", "MPein");
        lllIIIlIIlI[lllIIIlIllI[26]] = lIlIllIllIlIlI("872Kab7xQYJ5Dz2h0Uhx/g==", "sQbzT");
        lllIIIlIIlI[lllIIIlIllI[27]] = lIlIllIllIlIIl("FghlRH4pE05RidVKrZAPwQ==", "dEzLQ");
        lllIIIlIIlI[lllIIIlIllI[28]] = lIlIllIllIlIII("EioUAQ8=", "ABusd");
        lllIIIlIIlI[lllIIIlIllI[30]] = lIlIllIllIlIII("CwERPCIhSQg/OikdFw==", "HixPN");
        lllIIIlIIlI[lllIIIlIllI[32]] = lIlIllIllIlIIl("cXr6aO/ajHbjCPvUH2yVqQ==", "bHajb");
        lllIIIlIIlI[lllIIIlIllI[34]] = lIlIllIllIlIIl("GeAwM5HUT44=", "THjla");
        lllIIIlIIlI[lllIIIlIllI[36]] = lIlIllIllIlIII("EwI+Kz8=", "QmPNL");
        lllIIIlIIlI[lllIIIlIllI[38]] = lIlIllIllIlIIl("xcmdfCnO44Gb67eC9lO9uQ==", "fynbu");
        lllIIIlIIlI[lllIIIlIllI[39]] = lIlIllIllIlIlI("uNvj1uIZQai7iBECMoOQUQ==", "kHKuW");
        lllIIIlIIlI[lllIIIlIllI[41]] = lIlIllIllIlIlI("N8yKIrkutEx5U9lLoxiIbg==", "mNOYV");
        lllIIIlIIlI[lllIIIlIllI[43]] = lIlIllIllIlIlI("ippbvJ7HKa0=", "ofqEZ");
        lllIIIlIIlI[lllIIIlIllI[45]] = lIlIllIllIlIIl("F0ULYd4A3AGxyMf0bN/lAA==", "TBhxD");
    }

    private static String lIlIllIllIlIlI(String llllllllllllllllIIlIIlllIIIllIIl, String llllllllllllllllIIlIIlllIIIllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlllIIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIIlIllI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlllIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIlllIIIllIlI) {
            llllllllllllllllIIlIIlllIIIllIlI.printStackTrace();
            return null;
        }
    }

    private static String lIlIllIllIlIII(String llllllllllllllllIIlIIllIllllllII, String llllllllllllllllIIlIIllIlllllIll) {
        String llllllllllllllllIIlIIllIllllllII2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIllIllllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIIlIIllIlllllIll.toCharArray();
        int llllllllllllllllIIlIIllIlllllIII = lllIIIlIllI[0];
        char[] charArray2 = llllllllllllllllIIlIIllIllllllII2.toCharArray();
        int length = charArray2.length;
        int i = lllIIIlIllI[0];
        while (lIlIllIllllIII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllllIIlIIllIlllllIII % charArray.length]));
            "".length();
            llllllllllllllllIIlIIllIlllllIII++;
            i++;
            "".length();
            if ((-"   ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
