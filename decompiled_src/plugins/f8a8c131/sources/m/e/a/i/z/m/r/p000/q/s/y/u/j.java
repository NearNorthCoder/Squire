package m.e.a.i.z.m.r.p000.q.s.y.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.j  reason: invalid package */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/j.class */
class j extends HashMap<String, Integer> {
    private static /* synthetic */ int[] lIllIIIlIIlIl;
    private static /* synthetic */ String[] lIllIIIlIIlII;

    private static String llIIIlIIllIIlll(String llllllllllllllIllIIlIlllllIlIlII, String llllllllllllllIllIIlIlllllIlIIll) {
        try {
            SecretKeySpec llllllllllllllIllIIlIlllllIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIlllllIlIIll.getBytes(StandardCharsets.UTF_8)), lIllIIIlIIlIl[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIIIlIIlIl[3], llllllllllllllIllIIlIlllllIlIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIlllllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIlllllIlIlIl) {
            llllllllllllllIllIIlIlllllIlIlIl.printStackTrace();
            return null;
        }
    }

    private static void llIIIlIIllIlIII() {
        lIllIIIlIIlII = new String[lIllIIIlIIlIl[35]];
        lIllIIIlIIlII[lIllIIIlIIlIl[0]] = llIIIlIIllIIlIl("Ni0sHhENJ2EZCgA4", "lLAqc");
        lIllIIIlIIlII[lIllIIIlIIlIl[2]] = llIIIlIIllIIllI("pso9qwKBmVO4WGT8P8jMJQXXuXHf2spV", "oHdjS");
        lIllIIIlIIlII[lIllIIIlIIlIl[3]] = llIIIlIIllIIlll("5GnKa99QjNot6rqQi/IljEzkp7K3e3Im", "uzQup");
        lIllIIIlIIlII[lIllIIIlIIlIl[4]] = llIIIlIIllIIlIl("EQAVJCJiFhExOy4RAzEuJBI=", "BtpEO");
        lIllIIIlIIlII[lIllIIIlIIlIl[5]] = llIIIlIIllIIlIl("Awc1Jz8rGjV0OywJIzBodQ==", "DhQTH");
        lIllIIIlIIlII[lIllIIIlIIlIl[7]] = llIIIlIIllIIlIl("HxouAB43By5TGjAUOBdJag==", "XuJsi");
        lIllIIIlIIlII[lIllIIIlIIlIl[8]] = llIIIlIIllIIllI("fhwYcgIFaXBm1UO+VgWWN8A3K2hp4bhI", "QrWst");
        lIllIIIlIIlII[lIllIIIlIIlIl[9]] = llIIIlIIllIIlIl("MxcoKBQ=", "pxAFg");
        lIllIIIlIIlII[lIllIIIlIIlIl[10]] = llIIIlIIllIIllI("QkdYq+TxpaFg/srptmFKGw==", "ZNKcy");
        lIllIIIlIIlII[lIllIIIlIIlIl[12]] = llIIIlIIllIIllI("gMGMXJ7mEpCzSMuebSfkOg==", "Bywpy");
        lIllIIIlIIlII[lIllIIIlIIlIl[14]] = llIIIlIIllIIlll("/fSzZuHZegPNBF0ep/ziqq6PY4NEDDe4", "BtCif");
        lIllIIIlIIlII[lIllIIIlIIlIl[16]] = llIIIlIIllIIlIl("ABEjKQU9BGI0AycMLSpEYEw=", "SeBDl");
        lIllIIIlIIlII[lIllIIIlIIlIl[18]] = llIIIlIIllIIlIl("Bj4TJR87K1I4GSEjHSZeZ2M=", "UJrHv");
        lIllIIIlIIlII[lIllIIIlIIlIl[20]] = llIIIlIIllIIlIl("NiUmDxoLMGcSHBE4KAxbVHg=", "eQGbs");
        lIllIIIlIIlII[lIllIIIlIIlIl[22]] = llIIIlIIllIIlIl("GQI4NkQ7GzcnASkYMio=", "KwVSd");
        lIllIIIlIIlII[lIllIIIlIIlIl[24]] = llIIIlIIllIIlll("RZki4j2dRorTvxL5lDb4bw==", "TbFPE");
        lIllIIIlIIlII[lIllIIIlIIlIl[25]] = llIIIlIIllIIlIl("EAALIFQuGgsiBzUaFyE=", "BueEt");
        lIllIIIlIIlII[lIllIIIlIIlIl[26]] = llIIIlIIllIIlll("p1wPG7+NHPYVCeOSyp0wtw==", "RvzAr");
        lIllIIIlIIlII[lIllIIIlIIlIl[27]] = llIIIlIIllIIllI("EdolzNT2LtPaPza3rzPt7w==", "EYxfA");
        lIllIIIlIIlII[lIllIIIlIIlIl[28]] = llIIIlIIllIIlll("mD1WsLwA93BcLRC0NBFsvQ==", "zKZQn");
        lIllIIIlIIlII[lIllIIIlIIlIl[30]] = llIIIlIIllIIlIl("LyUtLDVCNiIh", "bDCXT");
        lIllIIIlIIlII[lIllIIIlIIlIl[31]] = llIIIlIIllIIlIl("EB0sKA8=", "CuMZd");
        lIllIIIlIIlII[lIllIIIlIIlIl[33]] = llIIIlIIllIIlll("EeDhgIh0PRC5xIYX3lzYTg==", "AEHhr");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j() {
        put(lIllIIIlIIlII[lIllIIIlIIlIl[0]], Integer.valueOf(lIllIIIlIIlIl[1]));
        "".length();
        put(lIllIIIlIIlII[lIllIIIlIIlIl[2]], Integer.valueOf(lIllIIIlIIlIl[1]));
        "".length();
        put(lIllIIIlIIlII[lIllIIIlIIlIl[3]], Integer.valueOf(lIllIIIlIIlIl[1]));
        "".length();
        put(lIllIIIlIIlII[lIllIIIlIIlIl[4]], Integer.valueOf(lIllIIIlIIlIl[1]));
        "".length();
        put(lIllIIIlIIlII[lIllIIIlIIlIl[5]], Integer.valueOf(lIllIIIlIIlIl[6]));
        "".length();
        put(lIllIIIlIIlII[lIllIIIlIIlIl[7]], Integer.valueOf(lIllIIIlIIlIl[6]));
        "".length();
        put(lIllIIIlIIlII[lIllIIIlIIlIl[8]], Integer.valueOf(lIllIIIlIIlIl[6]));
        "".length();
        put(lIllIIIlIIlII[lIllIIIlIIlIl[9]], Integer.valueOf(lIllIIIlIIlIl[2]));
        "".length();
        put(lIllIIIlIIlII[lIllIIIlIIlIl[10]], Integer.valueOf(lIllIIIlIIlIl[11]));
        "".length();
        put(lIllIIIlIIlII[lIllIIIlIIlIl[12]], Integer.valueOf(lIllIIIlIIlIl[13]));
        "".length();
        put(lIllIIIlIIlII[lIllIIIlIIlIl[14]], Integer.valueOf(lIllIIIlIIlIl[15]));
        "".length();
        put(lIllIIIlIIlII[lIllIIIlIIlIl[16]], Integer.valueOf(lIllIIIlIIlIl[17]));
        "".length();
        put(lIllIIIlIIlII[lIllIIIlIIlIl[18]], Integer.valueOf(lIllIIIlIIlIl[19]));
        "".length();
        put(lIllIIIlIIlII[lIllIIIlIIlIl[20]], Integer.valueOf(lIllIIIlIIlIl[21]));
        "".length();
        put(lIllIIIlIIlII[lIllIIIlIIlIl[22]], Integer.valueOf(lIllIIIlIIlIl[23]));
        "".length();
        put(lIllIIIlIIlII[lIllIIIlIIlIl[24]], Integer.valueOf(lIllIIIlIIlIl[23]));
        "".length();
        put(lIllIIIlIIlII[lIllIIIlIIlIl[25]], Integer.valueOf(lIllIIIlIIlIl[23]));
        "".length();
        put(lIllIIIlIIlII[lIllIIIlIIlIl[26]], Integer.valueOf(lIllIIIlIIlIl[23]));
        "".length();
        put(lIllIIIlIIlII[lIllIIIlIIlIl[27]], Integer.valueOf(lIllIIIlIIlIl[23]));
        "".length();
        put(lIllIIIlIIlII[lIllIIIlIIlIl[28]], Integer.valueOf(lIllIIIlIIlIl[29]));
        "".length();
        put(lIllIIIlIIlII[lIllIIIlIIlIl[30]], Integer.valueOf(lIllIIIlIIlIl[29]));
        "".length();
        put(lIllIIIlIIlII[lIllIIIlIIlIl[31]], Integer.valueOf(lIllIIIlIIlIl[32]));
        "".length();
        put(lIllIIIlIIlII[lIllIIIlIIlIl[33]], Integer.valueOf(lIllIIIlIIlIl[34]));
        "".length();
    }

    private static String llIIIlIIllIIllI(String llllllllllllllIllIIlIllllllIIIIl, String llllllllllllllIllIIlIllllllIIIII) {
        try {
            SecretKeySpec llllllllllllllIllIIlIllllllIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIllllllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlIllllllIIIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlIllllllIIIll.init(lIllIIIlIIlIl[3], llllllllllllllIllIIlIllllllIIlII);
            return new String(llllllllllllllIllIIlIllllllIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIllllllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIllllllIIIlI) {
            llllllllllllllIllIIlIllllllIIIlI.printStackTrace();
            return null;
        }
    }

    private static void llIIIlIIllIlIIl() {
        lIllIIIlIIlIl = new int[36];
        lIllIIIlIIlIl[0] = ((144 ^ 129) ^ (75 ^ 124)) & (((234 ^ 199) ^ (76 ^ 71)) ^ (-" ".length()));
        lIllIIIlIIlIl[1] = (-" ".length()) & (-1) & Integer.MAX_VALUE;
        lIllIIIlIIlIl[2] = " ".length();
        lIllIIIlIIlIl[3] = "  ".length();
        lIllIIIlIIlIl[4] = "   ".length();
        lIllIIIlIIlIl[5] = (51 ^ 83) ^ (34 ^ 70);
        lIllIIIlIIlIl[6] = (-" ".length()) & (-1) & 2147483646;
        lIllIIIlIIlIl[7] = 161 ^ 164;
        lIllIIIlIIlIl[8] = 136 ^ 142;
        lIllIIIlIIlIl[9] = 127 ^ 120;
        lIllIIIlIIlIl[10] = 28 ^ 20;
        lIllIIIlIIlIl[11] = (-4871) & 122870;
        lIllIIIlIIlIl[12] = (30 ^ 91) ^ (4 ^ 72);
        lIllIIIlIIlIl[13] = (-((-708) & 16331)) & (-16385) & 131007;
        lIllIIIlIIlIl[14] = (((27 + 154) - 23) + 10) ^ (((153 + 107) - 146) + 48);
        lIllIIIlIIlIl[15] = (-18561) & 10018559;
        lIllIIIlIIlIl[16] = (51 ^ 71) ^ (((63 + 41) - 9) + 32);
        lIllIIIlIIlIl[17] = (-((-1537) & 20354)) & (-8193) & 10027007;
        lIllIIIlIIlIl[18] = 31 ^ 19;
        lIllIIIlIIlIl[19] = (-((-9017) & 27579)) & (-1) & 10018559;
        lIllIIIlIIlIl[20] = (((24 + 77) - 27) + 71) ^ (((124 + 59) - 62) + 35);
        lIllIIIlIIlIl[21] = (-18561) & 10018556;
        lIllIIIlIIlIl[22] = (((73 + 8) - 46) + 123) ^ (((72 + 104) - 54) + 22);
        lIllIIIlIIlIl[23] = (-22557) & 122556;
        lIllIIIlIIlIl[24] = 141 ^ 130;
        lIllIIIlIIlIl[25] = (63 ^ 114) ^ (100 ^ 57);
        lIllIIIlIIlIl[26] = (((82 + 117) - 178) + 145) ^ (((166 + 178) - 262) + 101);
        lIllIIIlIIlIl[27] = 136 ^ 154;
        lIllIIIlIIlIl[28] = (223 ^ 172) ^ (164 ^ 196);
        lIllIIIlIIlIl[29] = (-((-23505) & 24539)) & (-34) & 131067;
        lIllIIIlIIlIl[30] = 40 ^ 60;
        lIllIIIlIIlIl[31] = (110 ^ 71) ^ (138 ^ 182);
        lIllIIIlIIlIl[32] = (-9362) & 126361;
        lIllIIIlIIlIl[33] = (248 ^ 184) ^ (68 ^ 18);
        lIllIIIlIIlIl[34] = (-8213) & 28212;
        lIllIIIlIIlIl[35] = (58 ^ 9) ^ (184 ^ 156);
    }

    private static boolean llIIIlIIllIlIlI(int i, int i2) {
        return i < i2;
    }

    private static String llIIIlIIllIIlIl(String llllllllllllllIllIIlIlllllIIIlII, String llllllllllllllIllIIlIlllllIIIIll) {
        String llllllllllllllIllIIlIlllllIIIlII2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIlIlllllIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIIlIlllllIIIIIl = llllllllllllllIllIIlIlllllIIIIll.toCharArray();
        int llllllllllllllIllIIlIlllllIIIIII = lIllIIIlIIlIl[0];
        char[] charArray = llllllllllllllIllIIlIlllllIIIlII2.toCharArray();
        int length = charArray.length;
        int i = lIllIIIlIIlIl[0];
        while (llIIIlIIllIlIlI(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIllIIlIlllllIIIIIl[llllllllllllllIllIIlIlllllIIIIII % llllllllllllllIllIIlIlllllIIIIIl.length]));
            "".length();
            llllllllllllllIllIIlIlllllIIIIII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        llIIIlIIllIlIIl();
        llIIIlIIllIlIII();
    }
}
