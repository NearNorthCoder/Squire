package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.i  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/i.class */
class C0012i extends HashMap<String, Integer> {
    private static /* synthetic */ String[] llllIIIllIll;
    private static /* synthetic */ int[] llllIIIlllII;

    private static String lIIIllllIIllllI(String lllllllllllllllIIlIlllllIllIIIll, String lllllllllllllllIIlIlllllIllIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllllIllIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllllIllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIIlllII[3], lllllllllllllllIIlIlllllIllIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllllIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlllllIllIIlII) {
            lllllllllllllllIIlIlllllIllIIlII.printStackTrace();
            return null;
        }
    }

    private static void lIIIllllIIlllll() {
        llllIIIllIll = new String[llllIIIlllII[53]];
        llllIIIllIll[llllIIIlllII[0]] = lIIIllllIIlllII("86BVzbufJYSflUw2EseATw==", "GhMdO");
        llllIIIllIll[llllIIIlllII[2]] = lIIIllllIIlllIl("Dhk2FBE0HjMOCmAEZwYKIhYzQRAiGyo=", "GwGax");
        llllIIIllIll[llllIIIlllII[3]] = lIIIllllIIlllII("HvRGe6LqfY5Q45jPxhxCvNQ6v4DPwHve", "uyLKU");
        llllIIIllIll[llllIIIlllII[4]] = lIIIllllIIlllIl("PRQcLQUHExk3HlMJTSgAFQ4IKwcdCBk=", "tzmXl");
        llllIIIllIll[llllIIIlllII[5]] = lIIIllllIIlllII("YYo4HvYnw7UfstapZyrTZtlnxfwwgxzw", "qTMgI");
        llllIIIllIll[llllIIIlllII[6]] = lIIIllllIIlllII("/oNiPsC3Opwhg6wdbw1HRA==", "xiCVc");
        llllIIIllIll[llllIIIlllII[7]] = lIIIllllIIlllII("0wpZilOzl4EDoR/HoR0/Xg==", "gwMrH");
        llllIIIllIll[llllIIIlllII[8]] = lIIIllllIIllllI("fmRXAHSc3Q/+yZDu1/ug9g==", "AgCpx");
        llllIIIllIll[llllIIIlllII[9]] = lIIIllllIIlllII("jw3Btj1yZVTrfezSqc6hlw==", "CKLHQ");
        llllIIIllIll[llllIIIlllII[10]] = lIIIllllIIlllII("qcdZs4AEHb4L1h3pKMB5IA==", "Sihmi");
        llllIIIllIll[llllIIIlllII[11]] = lIIIllllIIlllII("y4G0FJ6FZ2HQFX9ZonMj8Q==", "tXwrl");
        llllIIIllIll[llllIIIlllII[13]] = lIIIllllIIlllIl("Cy0vAXE7IigLPSRhcgE9ITU/TQ==", "HAZdQ");
        llllIIIllIll[llllIIIlllII[14]] = lIIIllllIIllllI("677cz32YHcY=", "qIsJq");
        llllIIIllIll[llllIIIlllII[15]] = lIIIllllIIlllIl("KSU0FB4IKjILFFo4MAEe", "zKUdz");
        llllIIIllIll[llllIIIlllII[17]] = lIIIllllIIlllIl("BzYZBTkwYxgeKA==", "UCwlM");
        llllIIIllIll[llllIIIlllII[19]] = lIIIllllIIllllI("JZB3iLQi+/o6cXlK+GrXjg==", "HBzVM");
        llllIIIllIll[llllIIIlllII[21]] = lIIIllllIIlllIl("IAMWBHkBGQ0N", "slchY");
        llllIIIllIll[llllIIIlllII[23]] = lIIIllllIIllllI("G8vDmKoYPPFBia2Iql2l7g==", "ddeEQ");
        llllIIIllIll[llllIIIlllII[25]] = lIIIllllIIlllIl("DhMrBy1qBD8dIA==", "JvJsE");
        llllIIIllIll[llllIIIlllII[27]] = lIIIllllIIlllIl("IxYBIiAIVwciPAg=", "mwuWR");
        llllIIIllIll[llllIIIlllII[28]] = lIIIllllIIllllI("urokb2RLUntKIrPLbo4gb4o3yglLVfH6", "oNTca");
        llllIIIllIll[llllIIIlllII[30]] = lIIIllllIIlllIl("AD8HPVIzOBs3BQ==", "RJiXr");
        llllIIIllIll[llllIIIlllII[31]] = lIIIllllIIlllIl("Py8yHCJSIjoSMg==", "rNUuA");
        llllIIIllIll[llllIIIlllII[33]] = lIIIllllIIlllIl("Cz8lBjNsOSMZOTgiIA==", "LMLkJ");
        llllIIIllIll[llllIIIlllII[35]] = lIIIllllIIlllIl("BAshKjNjGikjKy0NISkv", "CyHGJ");
        llllIIIllIll[llllIIIlllII[36]] = lIIIllllIIllllI("zjdYglUncn8VFSYYVa/azw==", "UAxvm");
        llllIIIllIll[llllIIIlllII[38]] = lIIIllllIIlllIl("MgsqGT8=", "acKkT");
        llllIIIllIll[llllIIIlllII[40]] = lIIIllllIIlllII("DuW++WApNcE=", "xKTdX");
        llllIIIllIll[llllIIIlllII[41]] = lIIIllllIIlllII("KhILQqAEIU41PwtiOa7RlxSEswoCKYL8", "QsrCP");
        llllIIIllIll[llllIIIlllII[42]] = lIIIllllIIlllII("flPjrQQEcQLsEB7/taqLDQ==", "pAYBP");
        llllIIIllIll[llllIIIlllII[43]] = lIIIllllIIllllI("/b1ElWeYtC7825en6ut+tQ==", "ngpAj");
        llllIIIllIll[llllIIIlllII[44]] = lIIIllllIIlllIl("NjoPIlAeJwY=", "qUcFp");
        llllIIIllIll[llllIIIlllII[46]] = lIIIllllIIlllIl("FCIvBgA5ISAEAw==", "WCAho");
        llllIIIllIll[llllIIIlllII[48]] = lIIIllllIIlllIl("OSkCBw==", "zFckt");
        llllIIIllIll[llllIIIlllII[50]] = lIIIllllIIllllI("Y3Q7YFvxAIBwwFCF69NIiw==", "tmVvx");
        llllIIIllIll[llllIIIlllII[51]] = lIIIllllIIlllII("8kIX8oU+FCqNxd8MY5+Tvg==", "yAnZV");
    }

    private static String lIIIllllIIlllIl(String lllllllllllllllIIlIllllllIIIIlIl, String lllllllllllllllIIlIllllllIIIIlII) {
        String lllllllllllllllIIlIllllllIIIIlIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllllllIIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllllllIIIIIll = new StringBuilder();
        char[] lllllllllllllllIIlIllllllIIIIIlI = lllllllllllllllIIlIllllllIIIIlII.toCharArray();
        int lllllllllllllllIIlIllllllIIIIIIl = llllIIIlllII[0];
        char[] charArray = lllllllllllllllIIlIllllllIIIIlIl2.toCharArray();
        int length = charArray.length;
        int i = llllIIIlllII[0];
        while (lIIIllllIlIIIIl(i, length)) {
            char lllllllllllllllIIlIllllllIIIIllI = charArray[i];
            lllllllllllllllIIlIllllllIIIIIll.append((char) (lllllllllllllllIIlIllllllIIIIllI ^ lllllllllllllllIIlIllllllIIIIIlI[lllllllllllllllIIlIllllllIIIIIIl % lllllllllllllllIIlIllllllIIIIIlI.length]));
            "".length();
            lllllllllllllllIIlIllllllIIIIIIl++;
            i++;
            "".length();
            if ((-" ".length()) == " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIllllllIIIIIll);
    }

    private static boolean lIIIllllIlIIIIl(int i, int i2) {
        return i < i2;
    }

    private static void lIIIllllIlIIIII() {
        llllIIIlllII = new int[54];
        llllIIIlllII[0] = "  ".length() & ("  ".length() ^ (-1));
        llllIIIlllII[1] = (-1) & Integer.MAX_VALUE;
        llllIIIlllII[2] = " ".length();
        llllIIIlllII[3] = "  ".length();
        llllIIIlllII[4] = "   ".length();
        llllIIIlllII[5] = 64 ^ 68;
        llllIIIlllII[6] = 26 ^ 31;
        llllIIIlllII[7] = (253 ^ 139) ^ (71 ^ 55);
        llllIIIlllII[8] = (193 ^ 135) ^ (38 ^ 103);
        llllIIIlllII[9] = 180 ^ 188;
        llllIIIlllII[10] = 127 ^ 118;
        llllIIIlllII[11] = 43 ^ 33;
        llllIIIlllII[12] = (-131) & 2147383778;
        llllIIIlllII[13] = 102 ^ 109;
        llllIIIlllII[14] = (7 ^ 93) ^ (94 ^ 8);
        llllIIIlllII[15] = 3 ^ 14;
        llllIIIlllII[16] = (-592) & 30591;
        llllIIIlllII[17] = 205 ^ 195;
        llllIIIlllII[18] = (-4111) & 16110;
        llllIIIlllII[19] = (((3 + 8) - (-176)) + 3) ^ (((32 + 45) - (-66)) + 34);
        llllIIIlllII[20] = (-(((16 + 126) - 36) + 24)) & (-16403) & 16831;
        llllIIIlllII[21] = (((149 + 13) - 76) + 128) ^ (((53 + 182) - 114) + 77);
        llllIIIlllII[22] = ((190 + 171) - 320) + 209;
        llllIIIlllII[23] = (((119 + 88) - 170) + 173) ^ (((140 + 118) - 69) + 6);
        llllIIIlllII[24] = 91 ^ 63;
        llllIIIlllII[25] = 166 ^ 180;
        llllIIIlllII[26] = ((139 + 18) - 126) + 194;
        llllIIIlllII[27] = (((89 + 145) - 150) + 131) ^ (((30 + 191) - 191) + 166);
        llllIIIlllII[28] = (120 ^ 77) ^ (151 ^ 182);
        llllIIIlllII[29] = (-((-4387) & 30139)) & (-2) & 32253;
        llllIIIlllII[30] = 162 ^ 183;
        llllIIIlllII[31] = (34 ^ 22) ^ (10 ^ 40);
        llllIIIlllII[32] = (-14359) & 15358;
        llllIIIlllII[33] = (((144 + 77) - 203) + 139) ^ (((105 + 90) - 192) + 135);
        llllIIIlllII[34] = (-((-3843) & 24399)) & (-8194) & 32749;
        llllIIIlllII[35] = 44 ^ 52;
        llllIIIlllII[36] = (((65 + 117) - 170) + 145) ^ (((13 + 93) - (-20)) + 6);
        llllIIIlllII[37] = (-21) & 20020;
        llllIIIlllII[38] = (((164 + 117) - 243) + 128) ^ (((116 + 81) - 27) + 18);
        llllIIIlllII[39] = (-((-12809) & 30317)) & (-258) & 32765;
        llllIIIlllII[40] = (64 ^ 3) ^ (252 ^ 164);
        llllIIIlllII[41] = 112 ^ 108;
        llllIIIlllII[42] = 136 ^ 149;
        llllIIIlllII[43] = (4 ^ 22) ^ (74 ^ 70);
        llllIIIlllII[44] = 7 ^ 24;
        llllIIIlllII[45] = ((3 + 174) - 157) + 180;
        llllIIIlllII[46] = 132 ^ 164;
        llllIIIlllII[47] = ((4 + 31) - (-90)) + 25;
        llllIIIlllII[48] = 140 ^ 173;
        llllIIIlllII[49] = ((142 + 20) - 152) + 185;
        llllIIIlllII[50] = 70 ^ 100;
        llllIIIlllII[51] = (((102 + 162) - 160) + 65) ^ (((62 + 135) - 170) + 111);
        llllIIIlllII[52] = (-4620) & 5119;
        llllIIIlllII[53] = 174 ^ 138;
    }

    static {
        lIIIllllIlIIIII();
        lIIIllllIIlllll();
    }

    private static String lIIIllllIIlllII(String lllllllllllllllIIlIlllllIlllIIII, String lllllllllllllllIIlIlllllIllIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllllIllIllll.getBytes(StandardCharsets.UTF_8)), llllIIIlllII[9]), "DES");
            Cipher lllllllllllllllIIlIlllllIlllIIlI = Cipher.getInstance("DES");
            lllllllllllllllIIlIlllllIlllIIlI.init(llllIIIlllII[3], secretKeySpec);
            return new String(lllllllllllllllIIlIlllllIlllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllllIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlllllIlllIIIl) {
            lllllllllllllllIIlIlllllIlllIIIl.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0012i() {
        put(llllIIIllIll[llllIIIlllII[0]], Integer.valueOf(llllIIIlllII[1]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[2]], Integer.valueOf(llllIIIlllII[1]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[3]], Integer.valueOf(llllIIIlllII[1]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[4]], Integer.valueOf(llllIIIlllII[1]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[5]], Integer.valueOf(llllIIIlllII[1]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[6]], Integer.valueOf(llllIIIlllII[1]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[7]], Integer.valueOf(llllIIIlllII[1]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[8]], Integer.valueOf(llllIIIlllII[1]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[9]], Integer.valueOf(llllIIIlllII[1]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[10]], Integer.valueOf(llllIIIlllII[1]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[11]], Integer.valueOf(llllIIIlllII[1]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[13]], Integer.valueOf(llllIIIlllII[12]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[14]], Integer.valueOf(llllIIIlllII[2]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[15]], Integer.valueOf(llllIIIlllII[16]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[17]], Integer.valueOf(llllIIIlllII[18]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[19]], Integer.valueOf(llllIIIlllII[20]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[21]], Integer.valueOf(llllIIIlllII[22]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[23]], Integer.valueOf(llllIIIlllII[24]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[25]], Integer.valueOf(llllIIIlllII[26]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[27]], Integer.valueOf(llllIIIlllII[24]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[28]], Integer.valueOf(llllIIIlllII[29]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[30]], Integer.valueOf(llllIIIlllII[24]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[31]], Integer.valueOf(llllIIIlllII[32]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[33]], Integer.valueOf(llllIIIlllII[34]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[35]], Integer.valueOf(llllIIIlllII[34]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[36]], Integer.valueOf(llllIIIlllII[37]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[38]], Integer.valueOf(llllIIIlllII[39]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[40]], Integer.valueOf(llllIIIlllII[39]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[41]], Integer.valueOf(llllIIIlllII[29]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[42]], Integer.valueOf(llllIIIlllII[32]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[43]], Integer.valueOf(llllIIIlllII[24]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[44]], Integer.valueOf(llllIIIlllII[45]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[46]], Integer.valueOf(llllIIIlllII[47]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[48]], Integer.valueOf(llllIIIlllII[49]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[50]], Integer.valueOf(llllIIIlllII[32]));
        "".length();
        put(llllIIIllIll[llllIIIlllII[51]], Integer.valueOf(llllIIIlllII[52]));
        "".length();
    }
}
