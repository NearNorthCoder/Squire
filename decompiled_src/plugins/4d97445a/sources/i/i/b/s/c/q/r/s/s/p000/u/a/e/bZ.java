package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bZ  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bZ.class */
public class bZ {
    public static /* synthetic */ String[] hm;
    private static /* synthetic */ String[] llllIIlII;
    public static /* synthetic */ String[] hn;
    public static /* synthetic */ String[] hl;
    private static /* synthetic */ int[] llllIIlIl;

    private static void llIIllllIll() {
        llllIIlIl = new int[32];
        llllIIlIl[0] = (171 ^ 147) ^ (146 ^ 185);
        llllIIlIl[1] = (44 ^ 18) & ((175 ^ 145) ^ (-1));
        llllIIlIl[2] = " ".length();
        llllIIlIl[3] = "  ".length();
        llllIIlIl[4] = "   ".length();
        llllIIlIl[5] = (((57 + 144) - 136) + 102) ^ (((123 + 103) - 88) + 25);
        llllIIlIl[6] = (((81 + 108) - 132) + 110) ^ (((31 + 52) - (-65)) + 14);
        llllIIlIl[7] = (88 ^ 92) ^ "  ".length();
        llllIIlIl[8] = (254 ^ 142) ^ (233 ^ 158);
        llllIIlIl[9] = (((6 + 137) - (-2)) + 21) ^ (((81 + 160) - 194) + 127);
        llllIIlIl[10] = (217 ^ 164) ^ (92 ^ 40);
        llllIIlIl[11] = 151 ^ 157;
        llllIIlIl[12] = 160 ^ 171;
        llllIIlIl[13] = 115 ^ 127;
        llllIIlIl[14] = (156 ^ 167) ^ (95 ^ 105);
        llllIIlIl[15] = (((66 + 25) - (-17)) + 59) ^ (((97 + 152) - 136) + 56);
        llllIIlIl[16] = 206 ^ 193;
        llllIIlIl[17] = (((1 + 162) - 62) + 81) ^ (((3 + 67) - 8) + 104);
        llllIIlIl[18] = (((132 + 32) - 143) + 191) ^ (((40 + 48) - (-17)) + 92);
        llllIIlIl[19] = (((68 + 11) - 31) + 91) ^ (((60 + 35) - 56) + 114);
        llllIIlIl[20] = (((95 + 119) - 108) + 107) ^ (((132 + 177) - 249) + 133);
        llllIIlIl[21] = 27 ^ 14;
        llllIIlIl[22] = 94 ^ 72;
        llllIIlIl[23] = (114 ^ 41) ^ (203 ^ 135);
        llllIIlIl[24] = (107 ^ 0) ^ (113 ^ 2);
        llllIIlIl[25] = (((81 + 70) - 118) + 128) ^ (((148 + 128) - 214) + 122);
        llllIIlIl[26] = 109 ^ 119;
        llllIIlIl[27] = (104 ^ 10) ^ (112 ^ 9);
        llllIIlIl[28] = (79 ^ 120) ^ (151 ^ 188);
        llllIIlIl[29] = (((13 + 81) - 78) + 128) ^ (((101 + 94) - 137) + 83);
        llllIIlIl[30] = 17 ^ 15;
        llllIIlIl[31] = 46 ^ 49;
    }

    static {
        llIIllllIll();
        llIIllllIlI();
        String[] strArr = new String[llllIIlIl[0]];
        strArr[llllIIlIl[1]] = llllIIlII[llllIIlIl[1]];
        strArr[llllIIlIl[2]] = llllIIlII[llllIIlIl[2]];
        strArr[llllIIlIl[3]] = llllIIlII[llllIIlIl[3]];
        strArr[llllIIlIl[4]] = llllIIlII[llllIIlIl[4]];
        strArr[llllIIlIl[5]] = llllIIlII[llllIIlIl[5]];
        strArr[llllIIlIl[6]] = llllIIlII[llllIIlIl[6]];
        strArr[llllIIlIl[7]] = llllIIlII[llllIIlIl[7]];
        strArr[llllIIlIl[8]] = llllIIlII[llllIIlIl[8]];
        strArr[llllIIlIl[9]] = llllIIlII[llllIIlIl[9]];
        strArr[llllIIlIl[10]] = llllIIlII[llllIIlIl[10]];
        strArr[llllIIlIl[11]] = llllIIlII[llllIIlIl[11]];
        strArr[llllIIlIl[12]] = llllIIlII[llllIIlIl[12]];
        strArr[llllIIlIl[13]] = llllIIlII[llllIIlIl[13]];
        strArr[llllIIlIl[14]] = llllIIlII[llllIIlIl[14]];
        strArr[llllIIlIl[15]] = llllIIlII[llllIIlIl[15]];
        strArr[llllIIlIl[16]] = llllIIlII[llllIIlIl[16]];
        strArr[llllIIlIl[17]] = llllIIlII[llllIIlIl[17]];
        strArr[llllIIlIl[18]] = llllIIlII[llllIIlIl[18]];
        strArr[llllIIlIl[19]] = llllIIlII[llllIIlIl[19]];
        hl = strArr;
        String[] strArr2 = new String[llllIIlIl[5]];
        strArr2[llllIIlIl[1]] = llllIIlII[llllIIlIl[0]];
        strArr2[llllIIlIl[2]] = llllIIlII[llllIIlIl[20]];
        strArr2[llllIIlIl[3]] = llllIIlII[llllIIlIl[21]];
        strArr2[llllIIlIl[4]] = llllIIlII[llllIIlIl[22]];
        hm = strArr2;
        String[] strArr3 = new String[llllIIlIl[9]];
        strArr3[llllIIlIl[1]] = llllIIlII[llllIIlIl[23]];
        strArr3[llllIIlIl[2]] = llllIIlII[llllIIlIl[24]];
        strArr3[llllIIlIl[3]] = llllIIlII[llllIIlIl[25]];
        strArr3[llllIIlIl[4]] = llllIIlII[llllIIlIl[26]];
        strArr3[llllIIlIl[5]] = llllIIlII[llllIIlIl[27]];
        strArr3[llllIIlIl[6]] = llllIIlII[llllIIlIl[28]];
        strArr3[llllIIlIl[7]] = llllIIlII[llllIIlIl[29]];
        strArr3[llllIIlIl[8]] = llllIIlII[llllIIlIl[30]];
        hn = strArr3;
    }

    private static String llIIllllIII(String lIlIIllllIIIIlI, String lIlIIllllIIIIIl) {
        String str = new String(Base64.getDecoder().decode(lIlIIllllIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIIllllIIIIII = new StringBuilder();
        char[] charArray = lIlIIllllIIIIIl.toCharArray();
        int lIlIIlllIlllllI = llllIIlIl[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = llllIIlIl[1];
        while (llIIlllllII(i2, length)) {
            lIlIIllllIIIIII.append((char) (charArray2[i2] ^ charArray[lIlIIlllIlllllI % charArray.length]));
            "".length();
            lIlIIlllIlllllI++;
            i2++;
            "".length();
            if ((-" ".length()) > " ".length()) {
                return null;
            }
        }
        return String.valueOf(lIlIIllllIIIIII);
    }

    private static boolean llIIlllllII(int i2, int i3) {
        return i2 < i3;
    }

    private static String llIIlllIlll(String lIlIIllllIlIIII, String lIlIIllllIlIIIl) {
        try {
            SecretKeySpec lIlIIllllIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIllllIlIIIl.getBytes(StandardCharsets.UTF_8)), llllIIlIl[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIlIl[3], lIlIIllllIlIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIIllllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIllllIlIIll) {
            lIlIIllllIlIIll.printStackTrace();
            return null;
        }
    }

    private static String llIIllllIIl(String lIlIIllllIlllll, String lIlIIllllIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIllllIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIlIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIIllllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIlllllIIIII) {
            lIlIIlllllIIIII.printStackTrace();
            return null;
        }
    }

    private static void llIIllllIlI() {
        llllIIlII = new String[llllIIlIl[31]];
        llllIIlII[llllIIlIl[1]] = llIIlllIlll("caiKieafNaQ=", "hTXQJ");
        llllIIlII[llllIIlIl[2]] = llIIlllIlll("QMw8nveGiC/Ooi67M1hylg==", "ilUjn");
        llllIIlII[llllIIlIl[3]] = llIIlllIlll("SvnCiKaVWGA=", "fdDgo");
        llllIIlII[llllIIlIl[4]] = llIIllllIII("BA8mPgwTBi0=", "pjHJm");
        llllIIlII[llllIIlIl[5]] = llIIllllIIl("9XXUY0j5TZo=", "TkyMQ");
        llllIIlII[llllIIlIl[6]] = llIIlllIlll("2Mn0kJH2w3nm8dndyGDHfg==", "MhcPf");
        llllIIlII[llllIIlIl[7]] = llIIllllIII("NCoFOhw=", "WFdMo");
        llllIIlII[llllIIlIl[8]] = llIIllllIII("IzICBxI5Nw==", "KSnew");
        llllIIlII[llllIIlIl[9]] = llIIlllIlll("S0yHLOJRerk=", "dWjmr");
        llllIIlII[llllIIlIl[10]] = llIIllllIIl("OVObBkbiCcc=", "hozRJ");
        llllIIlII[llllIIlIl[11]] = llIIllllIIl("vmi54MQQK05qq2CoXmJi+g==", "BBCMz");
        llllIIlII[llllIIlIl[12]] = llIIllllIII("Mj8tFhY=", "AOHwd");
        llllIIlII[llllIIlIl[13]] = llIIlllIlll("1+CLwEwfXBk=", "IUtxW");
        llllIIlII[llllIIlIl[14]] = llIIllllIIl("1tJSLYLN+qU=", "DEGGV");
        llllIIlII[llllIIlIl[15]] = llIIlllIlll("75bGxBsttno=", "jCLxG");
        llllIIlII[llllIIlIl[16]] = llIIllllIIl("sLzCc4PyHvc=", "nOExf");
        llllIIlII[llllIIlIl[17]] = llIIllllIIl("PbfxohX5p+0=", "HDqsw");
        llllIIlII[llllIIlIl[18]] = llIIlllIlll("cu72HeE8KME=", "WhUwf");
        llllIIlII[llllIIlIl[19]] = llIIllllIII("LgYIJBwhSRo=", "JniVs");
        llllIIlII[llllIIlIl[0]] = llIIlllIlll("3sGLkRPAO8E=", "uxVsB");
        llllIIlII[llllIIlIl[20]] = llIIllllIIl("ZQ6p5nHESI0=", "MYIsv");
        llllIIlII[llllIIlIl[21]] = llIIllllIII("DR8EMwoLHw==", "nmkIc");
        llllIIlII[llllIIlIl[22]] = llIIllllIII("IDo/NhwhPA==", "SYZFh");
        llllIIlII[llllIIlIl[23]] = llIIllllIIl("dt1fudI36jE=", "fbTVe");
        llllIIlII[llllIIlIl[24]] = llIIlllIlll("ENq+a1RKKqE=", "PYgru");
        llllIIlII[llllIIlIl[25]] = llIIllllIII("LCwcByM=", "GBuaF");
        llllIIlII[llllIIlIl[26]] = llIIllllIII("FR0wKjYPFDog", "auBEA");
        llllIIlII[llllIIlIl[27]] = llIIlllIlll("J/3YZ73UGLfNnVDrCgcYoA==", "PGllX");
        llllIIlII[llllIIlIl[28]] = llIIllllIIl("lUA7nQUVSzymc5qJiPJXnQ==", "ySoUe");
        llllIIlII[llllIIlIl[29]] = llIIllllIIl("gDa6MyM43yJnrwOwxuuQUQ==", "LMXOO");
        llllIIlII[llllIIlIl[30]] = llIIlllIlll("ssMj3/fTijB2KtekTyu4ug==", "WfnrV");
    }
}
