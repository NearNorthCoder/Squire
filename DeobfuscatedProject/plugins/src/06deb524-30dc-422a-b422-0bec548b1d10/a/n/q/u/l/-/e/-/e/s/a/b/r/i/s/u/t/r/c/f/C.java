/*
 * Decompiled with CFR 0.152.
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class C
extends Enum<C> {
    public static final /* synthetic */ /* enum */ C CAPE;
    private static /* synthetic */ int[] lIIllIIlIIII;
    public static final /* synthetic */ /* enum */ C HEAD;
    public final /* synthetic */ int boost;
    public static final /* synthetic */ /* enum */ C BODY;
    public static final /* synthetic */ /* enum */ C BOOTS;
    private static final /* synthetic */ C[] $VALUES;
    private static /* synthetic */ String[] lIIllIIIllll;
    public static final /* synthetic */ /* enum */ C LEGS;
    public static final /* synthetic */ /* enum */ C GLOVES;
    public final /* synthetic */ int[] items;

    private static boolean llIIlllIIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIlllIIIllll(String lllllllllllllllIlllIlllllIllIIll, String lllllllllllllllIlllIlllllIllIlII) {
        try {
            SecretKeySpec lllllllllllllllIlllIlllllIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlllllIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlllllIllIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlllllIllIlll.init(lIIllIIlIIII[5], lllllllllllllllIlllIlllllIlllIII);
            return new String(lllllllllllllllIlllIlllllIllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlllllIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlllllIllIllI) {
            lllllllllllllllIlllIlllllIllIllI.printStackTrace();
            return null;
        }
    }

    public static C[] values() {
        return (C[])$VALUES.clone();
    }

    private static void llIIlllIIlIIlI() {
        lIIllIIIllll = new String[lIIllIIlIIII[13]];
        C.lIIllIIIllll[C.lIIllIIlIIII[0]] = C.llIIlllIIIllll("0h7IRyUR1CA=", "FGvDk");
        C.lIIllIIIllll[C.lIIllIIlIIII[3]] = C.llIIlllIIIllll("7mVx5By4Lsc=", "SekYT");
        C.lIIllIIIllll[C.lIIllIIlIIII[5]] = C.llIIlllIIlIIII("DSwDCQ==", "AiDZz");
        C.lIIllIIIllll[C.lIIllIIlIIII[7]] = C.llIIlllIIlIIIl("Efe3o/fpdYU=", "RtBpx");
        C.lIIllIIIllll[C.lIIllIIlIIII[9]] = C.llIIlllIIlIIIl("tJFE0uDdiA0=", "NFvFj");
        C.lIIllIIIllll[C.lIIllIIlIIII[11]] = C.llIIlllIIIllll("iyr3v7jTuKs=", "AIYaJ");
    }

    static {
        C.llIIlllIIlIIll();
        C.llIIlllIIlIIlI();
        int[] nArray = new int[lIIllIIlIIII[1]];
        nArray[C.lIIllIIlIIII[0]] = lIIllIIlIIII[2];
        nArray[C.lIIllIIlIIII[3]] = lIIllIIlIIII[4];
        nArray[C.lIIllIIlIIII[5]] = lIIllIIlIIII[6];
        nArray[C.lIIllIIlIIII[7]] = lIIllIIlIIII[8];
        nArray[C.lIIllIIlIIII[9]] = lIIllIIlIIII[10];
        nArray[C.lIIllIIlIIII[11]] = lIIllIIlIIII[12];
        nArray[C.lIIllIIlIIII[13]] = lIIllIIlIIII[14];
        nArray[C.lIIllIIlIIII[15]] = lIIllIIlIIII[16];
        nArray[C.lIIllIIlIIII[17]] = lIIllIIlIIII[18];
        nArray[C.lIIllIIlIIII[19]] = lIIllIIlIIII[20];
        nArray[C.lIIllIIlIIII[21]] = lIIllIIlIIII[22];
        nArray[C.lIIllIIlIIII[23]] = lIIllIIlIIII[24];
        nArray[C.lIIllIIlIIII[25]] = lIIllIIlIIII[26];
        nArray[C.lIIllIIlIIII[27]] = lIIllIIlIIII[28];
        nArray[C.lIIllIIlIIII[29]] = lIIllIIlIIII[30];
        nArray[C.lIIllIIlIIII[31]] = lIIllIIlIIII[32];
        nArray[C.lIIllIIlIIII[33]] = lIIllIIlIIII[34];
        nArray[C.lIIllIIlIIII[35]] = lIIllIIlIIII[36];
        nArray[C.lIIllIIlIIII[37]] = lIIllIIlIIII[38];
        HEAD = new C(nArray, lIIllIIlIIII[7]);
        int[] nArray2 = new int[lIIllIIlIIII[1]];
        nArray2[C.lIIllIIlIIII[0]] = lIIllIIlIIII[39];
        nArray2[C.lIIllIIlIIII[3]] = lIIllIIlIIII[40];
        nArray2[C.lIIllIIlIIII[5]] = lIIllIIlIIII[41];
        nArray2[C.lIIllIIlIIII[7]] = lIIllIIlIIII[42];
        nArray2[C.lIIllIIlIIII[9]] = lIIllIIlIIII[43];
        nArray2[C.lIIllIIlIIII[11]] = lIIllIIlIIII[44];
        nArray2[C.lIIllIIlIIII[13]] = lIIllIIlIIII[45];
        nArray2[C.lIIllIIlIIII[15]] = lIIllIIlIIII[46];
        nArray2[C.lIIllIIlIIII[17]] = lIIllIIlIIII[47];
        nArray2[C.lIIllIIlIIII[19]] = lIIllIIlIIII[48];
        nArray2[C.lIIllIIlIIII[21]] = lIIllIIlIIII[49];
        nArray2[C.lIIllIIlIIII[23]] = lIIllIIlIIII[50];
        nArray2[C.lIIllIIlIIII[25]] = lIIllIIlIIII[51];
        nArray2[C.lIIllIIlIIII[27]] = lIIllIIlIIII[52];
        nArray2[C.lIIllIIlIIII[29]] = lIIllIIlIIII[53];
        nArray2[C.lIIllIIlIIII[31]] = lIIllIIlIIII[54];
        nArray2[C.lIIllIIlIIII[33]] = lIIllIIlIIII[55];
        nArray2[C.lIIllIIlIIII[35]] = lIIllIIlIIII[56];
        nArray2[C.lIIllIIlIIII[37]] = lIIllIIlIIII[57];
        BODY = new C(nArray2, lIIllIIlIIII[9]);
        int[] nArray3 = new int[lIIllIIlIIII[1]];
        nArray3[C.lIIllIIlIIII[0]] = lIIllIIlIIII[58];
        nArray3[C.lIIllIIlIIII[3]] = lIIllIIlIIII[59];
        nArray3[C.lIIllIIlIIII[5]] = lIIllIIlIIII[60];
        nArray3[C.lIIllIIlIIII[7]] = lIIllIIlIIII[61];
        nArray3[C.lIIllIIlIIII[9]] = lIIllIIlIIII[62];
        nArray3[C.lIIllIIlIIII[11]] = lIIllIIlIIII[63];
        nArray3[C.lIIllIIlIIII[13]] = lIIllIIlIIII[64];
        nArray3[C.lIIllIIlIIII[15]] = lIIllIIlIIII[65];
        nArray3[C.lIIllIIlIIII[17]] = lIIllIIlIIII[66];
        nArray3[C.lIIllIIlIIII[19]] = lIIllIIlIIII[67];
        nArray3[C.lIIllIIlIIII[21]] = lIIllIIlIIII[68];
        nArray3[C.lIIllIIlIIII[23]] = lIIllIIlIIII[69];
        nArray3[C.lIIllIIlIIII[25]] = lIIllIIlIIII[70];
        nArray3[C.lIIllIIlIIII[27]] = lIIllIIlIIII[71];
        nArray3[C.lIIllIIlIIII[29]] = lIIllIIlIIII[72];
        nArray3[C.lIIllIIlIIII[31]] = lIIllIIlIIII[73];
        nArray3[C.lIIllIIlIIII[33]] = lIIllIIlIIII[74];
        nArray3[C.lIIllIIlIIII[35]] = lIIllIIlIIII[75];
        nArray3[C.lIIllIIlIIII[37]] = lIIllIIlIIII[76];
        LEGS = new C(nArray3, lIIllIIlIIII[9]);
        int[] nArray4 = new int[lIIllIIlIIII[1]];
        nArray4[C.lIIllIIlIIII[0]] = lIIllIIlIIII[77];
        nArray4[C.lIIllIIlIIII[3]] = lIIllIIlIIII[78];
        nArray4[C.lIIllIIlIIII[5]] = lIIllIIlIIII[79];
        nArray4[C.lIIllIIlIIII[7]] = lIIllIIlIIII[80];
        nArray4[C.lIIllIIlIIII[9]] = lIIllIIlIIII[81];
        nArray4[C.lIIllIIlIIII[11]] = lIIllIIlIIII[82];
        nArray4[C.lIIllIIlIIII[13]] = lIIllIIlIIII[83];
        nArray4[C.lIIllIIlIIII[15]] = lIIllIIlIIII[84];
        nArray4[C.lIIllIIlIIII[17]] = lIIllIIlIIII[85];
        nArray4[C.lIIllIIlIIII[19]] = lIIllIIlIIII[86];
        nArray4[C.lIIllIIlIIII[21]] = lIIllIIlIIII[87];
        nArray4[C.lIIllIIlIIII[23]] = lIIllIIlIIII[88];
        nArray4[C.lIIllIIlIIII[25]] = lIIllIIlIIII[89];
        nArray4[C.lIIllIIlIIII[27]] = lIIllIIlIIII[90];
        nArray4[C.lIIllIIlIIII[29]] = lIIllIIlIIII[91];
        nArray4[C.lIIllIIlIIII[31]] = lIIllIIlIIII[92];
        nArray4[C.lIIllIIlIIII[33]] = lIIllIIlIIII[93];
        nArray4[C.lIIllIIlIIII[35]] = lIIllIIlIIII[94];
        nArray4[C.lIIllIIlIIII[37]] = lIIllIIlIIII[95];
        GLOVES = new C(nArray4, lIIllIIlIIII[7]);
        int[] nArray5 = new int[lIIllIIlIIII[1]];
        nArray5[C.lIIllIIlIIII[0]] = lIIllIIlIIII[96];
        nArray5[C.lIIllIIlIIII[3]] = lIIllIIlIIII[97];
        nArray5[C.lIIllIIlIIII[5]] = lIIllIIlIIII[98];
        nArray5[C.lIIllIIlIIII[7]] = lIIllIIlIIII[99];
        nArray5[C.lIIllIIlIIII[9]] = lIIllIIlIIII[100];
        nArray5[C.lIIllIIlIIII[11]] = lIIllIIlIIII[101];
        nArray5[C.lIIllIIlIIII[13]] = lIIllIIlIIII[102];
        nArray5[C.lIIllIIlIIII[15]] = lIIllIIlIIII[103];
        nArray5[C.lIIllIIlIIII[17]] = lIIllIIlIIII[104];
        nArray5[C.lIIllIIlIIII[19]] = lIIllIIlIIII[105];
        nArray5[C.lIIllIIlIIII[21]] = lIIllIIlIIII[106];
        nArray5[C.lIIllIIlIIII[23]] = lIIllIIlIIII[107];
        nArray5[C.lIIllIIlIIII[25]] = lIIllIIlIIII[108];
        nArray5[C.lIIllIIlIIII[27]] = lIIllIIlIIII[109];
        nArray5[C.lIIllIIlIIII[29]] = lIIllIIlIIII[110];
        nArray5[C.lIIllIIlIIII[31]] = lIIllIIlIIII[111];
        nArray5[C.lIIllIIlIIII[33]] = lIIllIIlIIII[112];
        nArray5[C.lIIllIIlIIII[35]] = lIIllIIlIIII[113];
        nArray5[C.lIIllIIlIIII[37]] = lIIllIIlIIII[114];
        BOOTS = new C(nArray5, lIIllIIlIIII[7]);
        int[] nArray6 = new int[lIIllIIlIIII[115]];
        nArray6[C.lIIllIIlIIII[0]] = lIIllIIlIIII[116];
        nArray6[C.lIIllIIlIIII[3]] = lIIllIIlIIII[117];
        nArray6[C.lIIllIIlIIII[5]] = lIIllIIlIIII[118];
        nArray6[C.lIIllIIlIIII[7]] = lIIllIIlIIII[119];
        nArray6[C.lIIllIIlIIII[9]] = lIIllIIlIIII[120];
        nArray6[C.lIIllIIlIIII[11]] = lIIllIIlIIII[121];
        nArray6[C.lIIllIIlIIII[13]] = lIIllIIlIIII[122];
        nArray6[C.lIIllIIlIIII[15]] = lIIllIIlIIII[123];
        nArray6[C.lIIllIIlIIII[17]] = lIIllIIlIIII[124];
        nArray6[C.lIIllIIlIIII[19]] = lIIllIIlIIII[125];
        nArray6[C.lIIllIIlIIII[21]] = lIIllIIlIIII[126];
        nArray6[C.lIIllIIlIIII[23]] = lIIllIIlIIII[127];
        nArray6[C.lIIllIIlIIII[25]] = lIIllIIlIIII[128];
        nArray6[C.lIIllIIlIIII[27]] = lIIllIIlIIII[129];
        nArray6[C.lIIllIIlIIII[29]] = lIIllIIlIIII[130];
        nArray6[C.lIIllIIlIIII[31]] = lIIllIIlIIII[131];
        nArray6[C.lIIllIIlIIII[33]] = lIIllIIlIIII[132];
        nArray6[C.lIIllIIlIIII[35]] = lIIllIIlIIII[133];
        nArray6[C.lIIllIIlIIII[37]] = lIIllIIlIIII[134];
        nArray6[C.lIIllIIlIIII[1]] = lIIllIIlIIII[135];
        nArray6[C.lIIllIIlIIII[136]] = lIIllIIlIIII[137];
        nArray6[C.lIIllIIlIIII[138]] = lIIllIIlIIII[139];
        CAPE = new C(nArray6, lIIllIIlIIII[7]);
        C[] cArray = new C[lIIllIIlIIII[13]];
        cArray[C.lIIllIIlIIII[0]] = HEAD;
        cArray[C.lIIllIIlIIII[3]] = BODY;
        cArray[C.lIIllIIlIIII[5]] = LEGS;
        cArray[C.lIIllIIlIIII[7]] = GLOVES;
        cArray[C.lIIllIIlIIII[9]] = BOOTS;
        cArray[C.lIIllIIlIIII[11]] = CAPE;
        $VALUES = cArray;
    }

    private C(int[] nArray, int n3) {
        this.items = nArray;
        this.boost = n3;
    }

    private static String llIIlllIIlIIII(String lllllllllllllllIlllIlllllIlIIlIl, String lllllllllllllllIlllIlllllIlIIlII) {
        lllllllllllllllIlllIlllllIlIIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlllllIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIlllllIlIIIll = new StringBuilder();
        char[] lllllllllllllllIlllIlllllIlIIIlI = lllllllllllllllIlllIlllllIlIIlII.toCharArray();
        int lllllllllllllllIlllIlllllIlIIIIl = lIIllIIlIIII[0];
        char[] lllllllllllllllIlllIlllllIIllIll = lllllllllllllllIlllIlllllIlIIlIl.toCharArray();
        int lllllllllllllllIlllIlllllIIllIlI = lllllllllllllllIlllIlllllIIllIll.length;
        int lllllllllllllllIlllIlllllIIllIIl = lIIllIIlIIII[0];
        while (C.llIIlllIIlIlII(lllllllllllllllIlllIlllllIIllIIl, lllllllllllllllIlllIlllllIIllIlI)) {
            char lllllllllllllllIlllIlllllIlIIllI = lllllllllllllllIlllIlllllIIllIll[lllllllllllllllIlllIlllllIIllIIl];
            lllllllllllllllIlllIlllllIlIIIll.append((char)(lllllllllllllllIlllIlllllIlIIllI ^ lllllllllllllllIlllIlllllIlIIIlI[lllllllllllllllIlllIlllllIlIIIIl % lllllllllllllllIlllIlllllIlIIIlI.length]));
            "".length();
            ++lllllllllllllllIlllIlllllIlIIIIl;
            ++lllllllllllllllIlllIlllllIIllIIl;
            "".length();
            if ((0x1F ^ 0x2F ^ (0x72 ^ 0x46)) > " ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIlllllIlIIIll);
    }

    public static C valueOf(String string) {
        return Enum.valueOf(C.class, string);
    }

    private static String llIIlllIIlIIIl(String lllllllllllllllIlllIlllllIIIlllI, String lllllllllllllllIlllIlllllIIIllIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIlllllIIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlllllIIIllIl.getBytes(StandardCharsets.UTF_8)), lIIllIIlIIII[17]), "DES");
            Cipher lllllllllllllllIlllIlllllIIlIIlI = Cipher.getInstance("DES");
            lllllllllllllllIlllIlllllIIlIIlI.init(lIIllIIlIIII[5], lllllllllllllllIlllIlllllIIlIIll);
            return new String(lllllllllllllllIlllIlllllIIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlllllIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlllllIIlIIIl) {
            lllllllllllllllIlllIlllllIIlIIIl.printStackTrace();
            return null;
        }
    }

    private static void llIIlllIIlIIll() {
        lIIllIIlIIII = new int[140];
        C.lIIllIIlIIII[0] = (2 + 113 - 18 + 85 ^ 53 + 92 - 45 + 70) & (0x3E ^ 0x5B ^ (0xC7 ^ 0xBE) ^ -" ".length());
        C.lIIllIIlIIII[1] = 0x7A ^ 0x69;
        C.lIIllIIlIIII[2] = -(0xFFFFD293 & 0x6DED) & (0xFFFFFFDB & 0x6EEF);
        C.lIIllIIlIIII[3] = " ".length();
        C.lIIllIIlIIII[4] = -(0xFFFFD8BD & 0x67F3) & (0xFFFFFDFF & 0x77BB);
        C.lIIllIIlIIII[5] = "  ".length();
        C.lIIllIIlIIII[6] = 0xFFFFF7CD & 0x3D3E;
        C.lIIllIIlIIII[7] = "   ".length();
        C.lIIllIIlIIII[8] = -(121 + 101 - 150 + 65) & (0xFFFFF7BF & 0x3DDF);
        C.lIIllIIlIIII[9] = 0x1F ^ 0x1B;
        C.lIIllIIlIIII[10] = -(0xFFFFD7FC & 0x2AE7) & (0xFFFFB7FB & Short.MAX_VALUE);
        C.lIIllIIlIIII[11] = 0x93 ^ 0x96;
        C.lIIllIIlIIII[12] = 0xFFFFBDAB & 0x7777;
        C.lIIllIIlIIII[13] = 0xC8 ^ 0x89 ^ (0xDF ^ 0x98);
        C.lIIllIIlIIII[14] = -(0xFFFFDFD5 & 0x6AEE) & (0xFFFFFFE7 & Short.MAX_VALUE);
        C.lIIllIIlIIII[15] = 0 ^ 7;
        C.lIIllIIlIIII[16] = 0xFFFFBD2F & 0x77FF;
        C.lIIllIIlIIII[17] = 0xA1 ^ 0xA9;
        C.lIIllIIlIIII[18] = 0xFFFFB5F2 & 0x7F3D;
        C.lIIllIIlIIII[19] = 4 + 150 - 122 + 134 ^ 92 + 25 - 106 + 164;
        C.lIIllIIlIIII[20] = 0xFFFFF73B & 0x3DFF;
        C.lIIllIIlIIII[21] = 0xB4 ^ 0xBE;
        C.lIIllIIlIIII[22] = 0xFFFFFD3E & 0x37FD;
        C.lIIllIIlIIII[23] = 0x65 ^ 0x6E;
        C.lIIllIIlIIII[24] = -(0xFFFFDA9D & 0x2FFB) & (0xFFFFFFFB & 0x3FFF);
        C.lIIllIIlIIII[25] = 0xC8 ^ 0xC4;
        C.lIIllIIlIIII[26] = -(0xFFFFCBCF & 0x763C) & (0xFFFFFF6F & 0x77FF);
        C.lIIllIIlIIII[27] = 111 + 22 - 84 + 91 ^ 80 + 90 - 154 + 113;
        C.lIIllIIlIIII[28] = 0xFFFFDEDF & 0x7365;
        C.lIIllIIlIIII[29] = 0x8C ^ 0x82;
        C.lIIllIIlIIII[30] = 0xFFFFDBE7 & 0x765F;
        C.lIIllIIlIIII[31] = 0x66 ^ 0x6A ^ "   ".length();
        C.lIIllIIlIIII[32] = 0xFFFFF2B7 & 0x6DEF;
        C.lIIllIIlIIII[33] = 0x9F ^ 0x8F;
        C.lIIllIIlIIII[34] = 0xFFFFE9BD & 0x76EB;
        C.lIIllIIlIIII[35] = 0x2B ^ 0x3A;
        C.lIIllIIlIIII[36] = 0xFFFFF5ED & 0x6BFF;
        C.lIIllIIlIIII[37] = 0x47 ^ 0x55;
        C.lIIllIIlIIII[38] = -(0xFFFFBD2B & 0x46D5) & (0xFFFFE5FF & 0x7FEF);
        C.lIIllIIlIIII[39] = 0xFFFFAFDF & 0x7E6F;
        C.lIIllIIlIIII[40] = 0xFFFFB5AF & 0x7F5F;
        C.lIIllIIlIIII[41] = 0xFFFFB77A & 0x7D95;
        C.lIIllIIlIIII[42] = 0xFFFFF7FB & 0x3D1F;
        C.lIIllIIlIIII[43] = -(0xFFFF8CE7 & 0x7BD9) & (0xFFFFFFDF & 0x3DFC);
        C.lIIllIIlIIII[44] = -(0xFFFFFC7D & 0x4B8B) & (0xFFFFFF6F & 0x7DBF);
        C.lIIllIIlIIII[45] = -(0xF8 ^ 0xBB) & (0xFFFFB5FA & 0x7F6F);
        C.lIIllIIlIIII[46] = 0xFFFFFDFB & 0x3737;
        C.lIIllIIlIIII[47] = 0xFFFFBFFD & 0x7536;
        C.lIIllIIlIIII[48] = 0xFFFFB7FF & 0x7D3F;
        C.lIIllIIlIIII[49] = -(0xFFFFEFBF & 0x5ACC) & (0xFFFFFFDB & 0x7FEF);
        C.lIIllIIlIIII[50] = -(48 + 68 - 103 + 116) & (0xFFFFF5FF & 0x3FE7);
        C.lIIllIIlIIII[51] = 0xFFFFF5F8 & 0x3F6F;
        C.lIIllIIlIIII[52] = -(0xFFFFDDF9 & 0x2BB7) & (0xFFFFFBFF & 0x5FFB);
        C.lIIllIIlIIII[53] = -(0xFFFFE5FF & 0x3BA1) & (0xFFFFFBFF & 0x77ED);
        C.lIIllIIlIIII[54] = -(0xFFFF9B77 & 0x6FC9) & (0xFFFFFFFF & 0x6BED);
        C.lIIllIIlIIII[55] = 0xFFFFF5EF & 0x6ABF;
        C.lIIllIIlIIII[56] = -(0xFFFFBE8D & 0x577B) & (0xFFFFFFFB & 0x77FF);
        C.lIIllIIlIIII[57] = 0xFFFFEDF5 & 0x73FF;
        C.lIIllIIlIIII[58] = 0xFFFFFFD5 & 0x2E7B;
        C.lIIllIIlIIII[59] = 0xFFFFFF37 & 0x35D9;
        C.lIIllIIlIIII[60] = 0xFFFFF79E & 0x3D73;
        C.lIIllIIlIIII[61] = 0xFFFFBF3D & 0x75DF;
        C.lIIllIIlIIII[62] = -(15 + 63 - -15 + 101) & (0xFFFFB7DF & 0x7DFF);
        C.lIIllIIlIIII[63] = 0xFFFFF57F & 0x3FA9;
        C.lIIllIIlIIII[64] = 0xFFFFF52B & 0x3FFE;
        C.lIIllIIlIIII[65] = -(7 ^ 0x44) & (0xFFFFFFF7 & 0x357F);
        C.lIIllIIlIIII[66] = 0xFFFFBDBE & 0x7777;
        C.lIIllIIlIIII[67] = -(0xFFFFFB6D & 0xE93) & (0xFFFFFF43 & 0x3FFD);
        C.lIIllIIlIIII[68] = 0xFFFFFF4A & 0x35F7;
        C.lIIllIIlIIII[69] = 0xFFFFF769 & 0x3DFF;
        C.lIIllIIlIIII[70] = 0xFFFFBD7E & 0x77EB;
        C.lIIllIIlIIII[71] = 0xFFFFFA5E & 0x57EF;
        C.lIIllIIlIIII[72] = -(0xFFFFEBDF & 0x35AF) & (0xFFFFFFFE & 0x73DF);
        C.lIIllIIlIIII[73] = -(0xFFFFD91B & 0x3FEF) & (0xFFFFFBBF & 0x7DFA);
        C.lIIllIIlIIII[74] = 0xFFFFE4BA & 0x7BF7;
        C.lIIllIIlIIII[75] = 0xFFFFFFFF & 0x61F6;
        C.lIIllIIlIIII[76] = 0xFFFFFBFC & 0x65FB;
        C.lIIllIIlIIII[77] = -(0xA7 ^ 0xAE) & (0xFFFFAF7F & 0x7EDB);
        C.lIIllIIlIIII[78] = 0xFFFFB513 & Short.MAX_VALUE;
        C.lIIllIIlIIII[79] = -(0xFFFFC3FE & 0x7E6D) & (0xFFFFFFFF & 0x777F);
        C.lIIllIIlIIII[80] = -(0xFFFFEEEB & 0x1935) & (0xFFFFFF3F & 0x3DFF);
        C.lIIllIIlIIII[81] = 0xFFFFB760 & 0x7DBF;
        C.lIIllIIlIIII[82] = -(0xFFFFDDD5 & 0x6A3B) & (0xFFFFFD3B & Short.MAX_VALUE);
        C.lIIllIIlIIII[83] = 0xFFFFFD3F & 0x37EC;
        C.lIIllIIlIIII[84] = -(0xFFFFFE67 & 0x4999) & (0xFFFFFDBF & 0x7F77);
        C.lIIllIIlIIII[85] = 0xFFFFFD39 & 0x37FE;
        C.lIIllIIlIIII[86] = 0xFFFFB557 & 0x7FEB;
        C.lIIllIIlIIII[87] = -(0xFFFFD6FB & 0x693F) & (0xFFFFFD7E & 0x77FF);
        C.lIIllIIlIIII[88] = -(0xFFFFAE95 & 0x5B7B) & (0xFFFFFF7B & 0x3FFF);
        C.lIIllIIlIIII[89] = 0xFFFFB56F & 0x7FFC;
        C.lIIllIIlIIII[90] = 0xFFFFD3F3 & 0x7E5D;
        C.lIIllIIlIIII[91] = -(0xFFFFBECD & 0x65BB) & (0xFFFFFEFB & 0x77DF);
        C.lIIllIIlIIII[92] = -(0xFFFF9DE5 & 0x675F) & (0xFFFFEFFF & 0x75F7);
        C.lIIllIIlIIII[93] = -(0xFFFFA76B & 0x5F9F) & (0xFFFFEFFF & 0x77BF);
        C.lIIllIIlIIII[94] = -(0xFFFFF3D3 & 0x1C2D) & (0xFFFFF7FB & 0x79FD);
        C.lIIllIIlIIII[95] = -(0xFFFFBFB1 & 0x504F) & (0xFFFFFBFF & 0x75FB);
        C.lIIllIIlIIII[96] = -(0xFFFFF38B & 0x1C75) & (0xFFFFFE7D & 0x3FD7);
        C.lIIllIIlIIII[97] = -(0xFFFFF2CB & 0x4FFD) & (0xFFFFF7FD & 0x7FDF);
        C.lIIllIIlIIII[98] = 0xFFFFBD9F & 0x7776;
        C.lIIllIIlIIII[99] = 0xFFFFBFFF & 0x7521;
        C.lIIllIIlIIII[100] = 0xFFFFF5FF & 0x3F22;
        C.lIIllIIlIIII[101] = -(64 + 144 - 94 + 97) & (0xFFFFF7FF & 0x3DFF);
        C.lIIllIIlIIII[102] = -(0xFFFFCF9F & 0x7AF1) & (0xFFFFFFFE & 0x7FBF);
        C.lIIllIIlIIII[103] = 0xFFFFBDFF & 0x7739;
        C.lIIllIIlIIII[104] = 0xFFFFB7FB & 0x7D3E;
        C.lIIllIIlIIII[105] = -(0xFFFF99FF & 0x6EA1) & (0xFFFFFFE7 & 0x3DFD);
        C.lIIllIIlIIII[106] = 0xFFFFBFCF & 0x7576;
        C.lIIllIIlIIII[107] = 0xFFFFFFEF & 0x357D;
        C.lIIllIIlIIII[108] = 0xFFFFFF6E & 0x35FF;
        C.lIIllIIlIIII[109] = 0xFFFFF6D6 & 0x5B7D;
        C.lIIllIIlIIII[110] = 0xFFFFF2F6 & 0x5F5F;
        C.lIIllIIlIIII[111] = -(0xFFFFBF5F & 0x57E2) & (0xFFFFF7FF & 0x7FF7);
        C.lIIllIIlIIII[112] = -(0xFFFFEDE7 & 0x175F) & (0xFFFFF7FF & 0x6DFE);
        C.lIIllIIlIIII[113] = -"   ".length() & (0xFFFFF9FE & 0x67FF);
        C.lIIllIIlIIII[114] = 0xFFFFF7FE & 0x69FF;
        C.lIIllIIlIIII[115] = 103 + 75 - 108 + 61 ^ 89 + 49 - 74 + 85;
        C.lIIllIIlIIII[116] = -(0xFFFFBDBB & 0x52F5) & (0xFFFFBEFF & 0x7FFD);
        C.lIIllIIlIIII[117] = 0xFFFFF7CD & 0x3D3F;
        C.lIIllIIlIIII[118] = 0xFFFFF76E & 0x3D9F;
        C.lIIllIIlIIII[119] = -(0xFFFFF1D1 & 0x4EEF) & (0xFFFFFFDB & 0x75FD);
        C.lIIllIIlIIII[120] = 0xFFFFBF9A & 0x757F;
        C.lIIllIIlIIII[121] = -(0xFFFFCA4B & 0x3FBF) & (0xFFFFFFAF & 0x3F7F);
        C.lIIllIIlIIII[122] = -(0xFFFFDBFB & 0x6C8E) & (0xFFFFFDEF & 0x7FBF);
        C.lIIllIIlIIII[123] = 0xFFFFB779 & 0x7DB7;
        C.lIIllIIlIIII[124] = 0xFFFFF77E & 0x3DB3;
        C.lIIllIIlIIII[125] = 0xFFFFB77F & 0x7DBD;
        C.lIIllIIlIIII[126] = 0xFFFFFDFE & 0x373F;
        C.lIIllIIlIIII[127] = -(0xFFFFEB8B & 0x5EF5) & (0xFFFFFFE5 & Short.MAX_VALUE);
        C.lIIllIIlIIII[128] = -(0xFFFFAAEF & 0x5F9A) & (0xFFFFFFEF & 0x3FFF);
        C.lIIllIIlIIII[129] = 0xFFFFDE7F & 0x73C8;
        C.lIIllIIlIIII[130] = 0xFFFFD6CB & 0x7B7E;
        C.lIIllIIlIIII[131] = 0xFFFFFCAE & 0x63FB;
        C.lIIllIIlIIII[132] = 0xFFFFF9FE & 0x66AD;
        C.lIIllIIlIIII[133] = 0xFFFFF9F2 & 0x67FD;
        C.lIIllIIlIIII[134] = 0xFFFFF7FB & 0x69F6;
        C.lIIllIIlIIII[135] = -(0xFFFFD9DF & 0x7FF5) & (0xFFFFFFFF & Short.MAX_VALUE);
        C.lIIllIIlIIII[136] = 0x91 ^ 0x85;
        C.lIIllIIlIIII[137] = 0xFFFFA6FD & 0x7F2E;
        C.lIIllIIlIIII[138] = 0x13 ^ 0xD ^ (0x9B ^ 0x90);
        C.lIIllIIlIIII[139] = -(0xFFFFFFA7 & 0xC5B) & (0xFFFFFFF2 & 0x3FEF);
    }
}

