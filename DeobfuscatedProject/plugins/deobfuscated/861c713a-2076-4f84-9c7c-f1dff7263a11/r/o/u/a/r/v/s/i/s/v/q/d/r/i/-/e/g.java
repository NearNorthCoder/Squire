/*
 * Decompiled with CFR 0.152.
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class g {
    public static /* synthetic */ int T;
    public static /* synthetic */ int S;
    public static /* synthetic */ List<String> Q;
    public static /* synthetic */ int R;
    public static /* synthetic */ int V;
    private static /* synthetic */ String[] lIlIlIIIlIIII;
    public static /* synthetic */ List<Integer> P;
    public static /* synthetic */ int U;
    private static /* synthetic */ int[] lIlIlIIIlIIIl;

    private static String lIllllIlIlIIIII(String llllllllllllllIllIllIIIllIllIlII, String llllllllllllllIllIllIIIllIllIIll) {
        llllllllllllllIllIllIIIllIllIlII = new String(Base64.getDecoder().decode(llllllllllllllIllIllIIIllIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIllIIIllIllIIlI = new StringBuilder();
        char[] llllllllllllllIllIllIIIllIllIIIl = llllllllllllllIllIllIIIllIllIIll.toCharArray();
        int llllllllllllllIllIllIIIllIllIIII = lIlIlIIIlIIIl[3];
        char[] llllllllllllllIllIllIIIllIlIlIlI = llllllllllllllIllIllIIIllIllIlII.toCharArray();
        int llllllllllllllIllIllIIIllIlIlIIl = llllllllllllllIllIllIIIllIlIlIlI.length;
        int llllllllllllllIllIllIIIllIlIlIII = lIlIlIIIlIIIl[3];
        while (g.lIllllIlIlIIlIl(llllllllllllllIllIllIIIllIlIlIII, llllllllllllllIllIllIIIllIlIlIIl)) {
            char llllllllllllllIllIllIIIllIllIlIl = llllllllllllllIllIllIIIllIlIlIlI[llllllllllllllIllIllIIIllIlIlIII];
            llllllllllllllIllIllIIIllIllIIlI.append((char)(llllllllllllllIllIllIIIllIllIlIl ^ llllllllllllllIllIllIIIllIllIIIl[llllllllllllllIllIllIIIllIllIIII % llllllllllllllIllIllIIIllIllIIIl.length]));
            0;
            ++llllllllllllllIllIllIIIllIllIIII;
            ++llllllllllllllIllIllIIIllIlIlIII;
            0;
            if (((0x17 ^ 0x4A ^ (0x4A ^ 0x52)) & (180 + 157 - 245 + 104 ^ 33 + 45 - -36 + 15 ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIllIIIllIllIIlI);
    }

    static {
        g.lIllllIlIlIIlII();
        g.lIllllIlIlIIIll();
        P = List.of(Integer.valueOf(lIlIlIIIlIIIl[0]), Integer.valueOf(lIlIlIIIlIIIl[1]));
        String[] stringArray = new String[lIlIlIIIlIIIl[2]];
        stringArray[g.lIlIlIIIlIIIl[3]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[3]];
        stringArray[g.lIlIlIIIlIIIl[4]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[4]];
        stringArray[g.lIlIlIIIlIIIl[5]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[5]];
        stringArray[g.lIlIlIIIlIIIl[6]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[6]];
        stringArray[g.lIlIlIIIlIIIl[7]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[7]];
        stringArray[g.lIlIlIIIlIIIl[8]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[8]];
        stringArray[g.lIlIlIIIlIIIl[9]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[9]];
        stringArray[g.lIlIlIIIlIIIl[10]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[10]];
        stringArray[g.lIlIlIIIlIIIl[11]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[11]];
        stringArray[g.lIlIlIIIlIIIl[12]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[12]];
        stringArray[g.lIlIlIIIlIIIl[13]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[13]];
        stringArray[g.lIlIlIIIlIIIl[14]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[14]];
        stringArray[g.lIlIlIIIlIIIl[15]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[15]];
        stringArray[g.lIlIlIIIlIIIl[16]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[16]];
        stringArray[g.lIlIlIIIlIIIl[17]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[17]];
        stringArray[g.lIlIlIIIlIIIl[18]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[18]];
        stringArray[g.lIlIlIIIlIIIl[19]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[19]];
        stringArray[g.lIlIlIIIlIIIl[20]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[20]];
        stringArray[g.lIlIlIIIlIIIl[21]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[21]];
        stringArray[g.lIlIlIIIlIIIl[22]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[22]];
        stringArray[g.lIlIlIIIlIIIl[23]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[23]];
        stringArray[g.lIlIlIIIlIIIl[24]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[24]];
        stringArray[g.lIlIlIIIlIIIl[25]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[25]];
        stringArray[g.lIlIlIIIlIIIl[26]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[26]];
        stringArray[g.lIlIlIIIlIIIl[27]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[27]];
        stringArray[g.lIlIlIIIlIIIl[28]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[28]];
        stringArray[g.lIlIlIIIlIIIl[29]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[29]];
        stringArray[g.lIlIlIIIlIIIl[30]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[30]];
        stringArray[g.lIlIlIIIlIIIl[31]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[31]];
        stringArray[g.lIlIlIIIlIIIl[32]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[32]];
        stringArray[g.lIlIlIIIlIIIl[33]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[33]];
        stringArray[g.lIlIlIIIlIIIl[34]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[34]];
        stringArray[g.lIlIlIIIlIIIl[35]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[35]];
        stringArray[g.lIlIlIIIlIIIl[36]] = lIlIlIIIlIIII[lIlIlIIIlIIIl[36]];
        Q = List.of(stringArray);
        R = lIlIlIIIlIIIl[37];
        S = lIlIlIIIlIIIl[38];
        T = lIlIlIIIlIIIl[39];
        U = lIlIlIIIlIIIl[40];
        V = lIlIlIIIlIIIl[0];
    }

    private static void lIllllIlIlIIIll() {
        lIlIlIIIlIIII = new String[lIlIlIIIlIIIl[2]];
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[3]] = g."Chromium ingot";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[4]] = g."Ultor vestige";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[5]] = g."Executioner's axe head";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[6]] = g."Virtus mask";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[7]] = g."Virtus robe top";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[8]] = g."Virtus robe bottom";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[9]] = g."Blood quartz";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[10]] = g."Onyx bolts (e)";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[11]] = g."Coal";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[12]] = g."Adamantite ore";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[13]] = g."Rune javelin heads";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[14]] = g."Dragon javelin heads";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[15]] = g."Uncut ruby";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[16]] = g."Uncut diamond";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[17]] = g."Runite ore";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[18]] = g."Dragon dart tip";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[19]] = g."Pure essence";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[20]] = g."Iron ore";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[21]] = g."Mithril ore";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[22]] = g."Silver ore";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[23]] = g."Sapphire";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[24]] = g."Emerald";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[25]] = g."Ruby";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[26]] = g."Bronze bar";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[27]] = g."Raw shark";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[28]] = g."Lava rune";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[29]] = g."Blood rune";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[30]] = g."Soul rune";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[31]] = g."Mind rune";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[32]] = g."Fire rune";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[33]] = g."Awakener's orb";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[34]] = g."Strangled tablet";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[35]] = g."Tuna potato";
        g.lIlIlIIIlIIII[g.lIlIlIIIlIIIl[36]] = g."Prayer potion(3)";
    }

    private static boolean lIllllIlIlIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllllIlIlIIIIl(String llllllllllllllIllIllIIIllIIlIIlI, String llllllllllllllIllIllIIIllIIIllll) {
        try {
            SecretKeySpec llllllllllllllIllIllIIIllIIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIIllIIIllll.getBytes(StandardCharsets.UTF_8)), lIlIlIIIlIIIl[11]), "DES");
            Cipher llllllllllllllIllIllIIIllIIlIlII = Cipher.getInstance("DES");
            llllllllllllllIllIllIIIllIIlIlII.init(lIlIlIIIlIIIl[5], llllllllllllllIllIllIIIllIIlIlIl);
            return new String(llllllllllllllIllIllIIIllIIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIIllIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIllIIIllIIlIIll) {
            llllllllllllllIllIllIIIllIIlIIll.printStackTrace();
            return null;
        }
    }

    private static void lIllllIlIlIIlII() {
        lIlIlIIIlIIIl = new int[41];
        g.lIlIlIIIlIIIl[0] = 0xFFFFAFD1 & 0x7FEF;
        g.lIlIlIIIlIIIl[1] = 0xFFFFBFEF & 0x6FD3;
        g.lIlIlIIIlIIIl[2] = 0x40 ^ 0x27 ^ (0x31 ^ 0x74);
        g.lIlIlIIIlIIIl[3] = (0x31 ^ 0xC ^ (0xA4 ^ 0x95)) & (75 + 121 - 126 + 116 ^ 86 + 61 - 46 + 81 ^ -1);
        g.lIlIlIIIlIIIl[4] = 1;
        g.lIlIlIIIlIIIl[5] = 2;
        g.lIlIlIIIlIIIl[6] = 3;
        g.lIlIlIIIlIIIl[7] = 0x45 ^ 0x41;
        g.lIlIlIIIlIIIl[8] = 0x5E ^ 0x5B;
        g.lIlIlIIIlIIIl[9] = 0x4E ^ 0x48;
        g.lIlIlIIIlIIIl[10] = 0xB5 ^ 0xB2;
        g.lIlIlIIIlIIIl[11] = 0x5B ^ 0x6C ^ (0x81 ^ 0xBE);
        g.lIlIlIIIlIIIl[12] = 0x2E ^ 0x27;
        g.lIlIlIIIlIIIl[13] = 0x35 ^ 0x3F;
        g.lIlIlIIIlIIIl[14] = 0x12 ^ 0x19;
        g.lIlIlIIIlIIIl[15] = 114 + 105 - 96 + 9 ^ 23 + 80 - -24 + 9;
        g.lIlIlIIIlIIIl[16] = 6 ^ 0x72 ^ (0x78 ^ 1);
        g.lIlIlIIIlIIIl[17] = 0x75 ^ 0x7B;
        g.lIlIlIIIlIIIl[18] = 88 + 86 - 153 + 145 ^ 87 + 155 - 135 + 62;
        g.lIlIlIIIlIIIl[19] = 0x80 ^ 0x90;
        g.lIlIlIIIlIIIl[20] = 0x85 ^ 0xB7 ^ (0x63 ^ 0x40);
        g.lIlIlIIIlIIIl[21] = 0x31 ^ 0x5F ^ (0xF7 ^ 0x8B);
        g.lIlIlIIIlIIIl[22] = 0xE5 ^ 0x92 ^ (0xC3 ^ 0xA7);
        g.lIlIlIIIlIIIl[23] = 0x52 ^ 0x25 ^ (0xFF ^ 0x9C);
        g.lIlIlIIIlIIIl[24] = 0x20 ^ 0x1B ^ (0x51 ^ 0x7F);
        g.lIlIlIIIlIIIl[25] = 0xBA ^ 0xAC;
        g.lIlIlIIIlIIIl[26] = 0x40 ^ 0x57;
        g.lIlIlIIIlIIIl[27] = 0xAC ^ 0xB4;
        g.lIlIlIIIlIIIl[28] = 5 ^ 0x1C;
        g.lIlIlIIIlIIIl[29] = 0x78 ^ 0x62;
        g.lIlIlIIIlIIIl[30] = 0xBC ^ 0xA7;
        g.lIlIlIIIlIIIl[31] = 0xE4 ^ 0xB0 ^ (0x1C ^ 0x54);
        g.lIlIlIIIlIIIl[32] = 0xBC ^ 0xA1;
        g.lIlIlIIIlIIIl[33] = 0x65 ^ 0x26 ^ (0x14 ^ 0x49);
        g.lIlIlIIIlIIIl[34] = 0x1E ^ 1;
        g.lIlIlIIIlIIIl[35] = 0x40 ^ 0x60;
        g.lIlIlIIIlIIIl[36] = 0x8C ^ 0xAC ^ 1;
        g.lIlIlIIIlIIIl[37] = 0xFFFFBFBF & 0xFD66;
        g.lIlIlIIIlIIIl[38] = 0xFFFF99DF & 0x6FF9;
        g.lIlIlIIIlIIIl[39] = -(0xFFFFA79D & 0x5C73) & (0xFFFFFFFF & 0xBDFF);
        g.lIlIlIIIlIIIl[40] = 0xFFFFE6F9 & 0x7F67;
    }

    private static String lIllllIlIlIIIlI(String llllllllllllllIllIllIIIllIIlllll, String llllllllllllllIllIllIIIllIIlllII) {
        try {
            SecretKeySpec llllllllllllllIllIllIIIllIlIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIIllIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIllIIIllIlIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIllIIIllIlIIIIl.init(lIlIlIIIlIIIl[5], llllllllllllllIllIllIIIllIlIIIlI);
            return new String(llllllllllllllIllIllIIIllIlIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIIllIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIllIIIllIlIIIII) {
            llllllllllllllIllIllIIIllIlIIIII.printStackTrace();
            return null;
        }
    }
}

