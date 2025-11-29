/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 */
package r.r.s.u.-.s.i.e.u.u.r.i.q.c.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;

public class d_Unknown {
    public static /* synthetic */ int G;
    public static /* synthetic */ int B;
    public static /* synthetic */ List<Integer> E;
    private static /* synthetic */ int[] lIIlIllIIlIIl;
    public static /* synthetic */ int C;
    public static /* synthetic */ int A;
    private static /* synthetic */ String[] lIIlIllIIIllI;
    public static /* synthetic */ WorldPoint H;
    public static /* synthetic */ List<String> v;
    public static /* synthetic */ List<String> y;
    public static /* synthetic */ int D;
    public static /* synthetic */ List<String> x;
    public static /* synthetic */ List<String> z;
    public static /* synthetic */ WorldArea F;
    public static /* synthetic */ List<String> w;

    static {
        d.lIlIllIIllIlllI();
        d.lIlIllIIllIllIl();
        String[] stringArray = new String[lIIlIllIIlIIl[0]];
        stringArray[d.lIIlIllIIlIIl[1]] = lIIlIllIIIllI[lIIlIllIIlIIl[1]];
        stringArray[d.lIIlIllIIlIIl[2]] = lIIlIllIIIllI[lIIlIllIIlIIl[2]];
        stringArray[d.lIIlIllIIlIIl[3]] = lIIlIllIIIllI[lIIlIllIIlIIl[3]];
        stringArray[d.lIIlIllIIlIIl[4]] = lIIlIllIIIllI[lIIlIllIIlIIl[4]];
        stringArray[d.lIIlIllIIlIIl[5]] = lIIlIllIIIllI[lIIlIllIIlIIl[5]];
        stringArray[d.lIIlIllIIlIIl[6]] = lIIlIllIIIllI[lIIlIllIIlIIl[6]];
        stringArray[d.lIIlIllIIlIIl[7]] = lIIlIllIIIllI[lIIlIllIIlIIl[7]];
        stringArray[d.lIIlIllIIlIIl[8]] = lIIlIllIIIllI[lIIlIllIIlIIl[8]];
        stringArray[d.lIIlIllIIlIIl[9]] = lIIlIllIIIllI[lIIlIllIIlIIl[9]];
        stringArray[d.lIIlIllIIlIIl[10]] = lIIlIllIIIllI[lIIlIllIIlIIl[10]];
        stringArray[d.lIIlIllIIlIIl[11]] = lIIlIllIIIllI[lIIlIllIIlIIl[11]];
        stringArray[d.lIIlIllIIlIIl[12]] = lIIlIllIIIllI[lIIlIllIIlIIl[12]];
        stringArray[d.lIIlIllIIlIIl[13]] = lIIlIllIIIllI[lIIlIllIIlIIl[13]];
        v = List.of(stringArray);
        w = List.of(lIIlIllIIIllI[lIIlIllIIlIIl[0]], lIIlIllIIIllI[lIIlIllIIlIIl[14]], lIIlIllIIIllI[lIIlIllIIlIIl[15]], lIIlIllIIIllI[lIIlIllIIlIIl[16]]);
        x = List.of(lIIlIllIIIllI[lIIlIllIIlIIl[17]], lIIlIllIIIllI[lIIlIllIIlIIl[18]], lIIlIllIIIllI[lIIlIllIIlIIl[19]], lIIlIllIIIllI[lIIlIllIIlIIl[20]], lIIlIllIIIllI[lIIlIllIIlIIl[21]], lIIlIllIIIllI[lIIlIllIIlIIl[22]]);
        y = List.of(lIIlIllIIIllI[lIIlIllIIlIIl[23]], lIIlIllIIIllI[lIIlIllIIlIIl[24]]);
        z = List.of(lIIlIllIIIllI[lIIlIllIIlIIl[25]]);
        A = lIIlIllIIlIIl[26];
        B = lIIlIllIIlIIl[27];
        C = lIIlIllIIlIIl[28];
        D = lIIlIllIIlIIl[29];
        E = List.of(Integer.valueOf(C), Integer.valueOf(D));
        F = new WorldArea(new WorldPoint(lIIlIllIIlIIl[30], lIIlIllIIlIIl[31], lIIlIllIIlIIl[1]), new WorldPoint(lIIlIllIIlIIl[32], lIIlIllIIlIIl[33], lIIlIllIIlIIl[1]));
        G = lIIlIllIIlIIl[34];
        H = new WorldPoint(lIIlIllIIlIIl[35], lIIlIllIIlIIl[36], lIIlIllIIlIIl[1]);
    }

    private static String lIlIllIIllIIIlI(String var13, String var7) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lIIlIllIIlIIl[3], var6);
            return new String(var3.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static String lIlIllIIllIIlII(String var8, String var15) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var11 = var15.toCharArray();
        int var10 = lIIlIllIIlIIl[1];
        char[] var4 = var8.toCharArray();
        int var9 = var4.length;
        int var14 = lIIlIllIIlIIl[1];
        while (d.lIlIllIIllIllll(var14, var9)) {
            char var12 = var4[var14];
            var16.append((char)(var12 ^ var11[var10 % var11.length]));
            0;
            ++var10;
            ++var14;
            0;
            if (((0x74 ^ 0x15 ^ (0xFA ^ 0xB4)) & (166 + 9 - 146 + 140 ^ 99 + 116 - 130 + 49 ^ -1)) >= 0) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    private static void lIlIllIIllIllIl() {
        lIIlIllIIIllI = new String[lIIlIllIIlIIl[37]];
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[1]] = d."Scurrius' spine";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[2]] = d."Rune chainbody";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[3]] = d."Rune battleaxe";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[4]] = d."Rune full helm";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[5]] = d."Rune med helm";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[6]] = d."Rune sq shield";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[7]] = d."Chaos rune";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[8]] = d."Death rune";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[9]] = d."Rune arrow";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[10]] = d."Coins";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[11]] = d."Prayer potion(4)";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[12]] = d."Law rune";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[13]] = d."Adamant platebody";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[0]] = d."Trout";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[14]] = d."Shark";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[15]] = d."Tuna";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[16]] = d."Lobster";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[17]] = d."Rune chainbody";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[18]] = d."Rune battleaxe";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[19]] = d."Rune full helm";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[20]] = d."Rune med helm";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[21]] = d."Rune sq shield";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[22]] = d."Adamant platebody";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[23]] = d."Super strength(1)";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[24]] = d."Ranging potion(1)";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[25]] = d."Vial";
    }

    private static boolean lIlIllIIllIllll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIllIIllIlllI() {
        lIIlIllIIlIIl = new int[38];
        d.lIIlIllIIlIIl[0] = 0x71 ^ 0x7C;
        d.lIIlIllIIlIIl[1] = (0xAF ^ 0xBF ^ (0x13 ^ 0x5F)) & (0x20 ^ 0x11 ^ (0xD4 ^ 0xB9) ^ -1);
        d.lIIlIllIIlIIl[2] = 1;
        d.lIIlIllIIlIIl[3] = 2;
        d.lIIlIllIIlIIl[4] = 3;
        d.lIIlIllIIlIIl[5] = 0x26 ^ 0x22;
        d.lIIlIllIIlIIl[6] = 3 ^ 6;
        d.lIIlIllIIlIIl[7] = 0x17 ^ 0x11;
        d.lIIlIllIIlIIl[8] = 0x5F ^ 0x58;
        d.lIIlIllIIlIIl[9] = 0xC ^ 4;
        d.lIIlIllIIlIIl[10] = 0x26 ^ 0x2D ^ 2;
        d.lIIlIllIIlIIl[11] = 0x51 ^ 0x11 ^ (0xD5 ^ 0x9F);
        d.lIIlIllIIlIIl[12] = 0xFF ^ 0xA7 ^ (0xEF ^ 0xBC);
        d.lIIlIllIIlIIl[13] = 0x6A ^ 0x66;
        d.lIIlIllIIlIIl[14] = 0xBB ^ 0xB5;
        d.lIIlIllIIlIIl[15] = 0x26 ^ 0x29;
        d.lIIlIllIIlIIl[16] = 149 + 64 - 119 + 78 ^ 128 + 78 - 181 + 163;
        d.lIIlIllIIlIIl[17] = 0x57 ^ 0x46;
        d.lIIlIllIIlIIl[18] = 0x50 ^ 0x42;
        d.lIIlIllIIlIIl[19] = 0x76 ^ 0x65;
        d.lIIlIllIIlIIl[20] = 35 + 179 - 178 + 155 ^ 46 + 74 - 5 + 56;
        d.lIIlIllIIlIIl[21] = 0xF ^ 0x12 ^ (0x1A ^ 0x12);
        d.lIIlIllIIlIIl[22] = 0x5C ^ 0x1D ^ (0xD1 ^ 0x86);
        d.lIIlIllIIlIIl[23] = 0x88 ^ 0x9F;
        d.lIIlIllIIlIIl[24] = 0xB6 ^ 0xBC ^ (0x3C ^ 0x2E);
        d.lIIlIllIIlIIl[25] = 0x50 ^ 0x49;
        d.lIIlIllIIlIIl[26] = 0xFFFFFDAF & 0xBF76;
        d.lIIlIllIIlIIl[27] = 0xFFFFEAFD & 0x1F56;
        d.lIIlIllIIlIIl[28] = -(0xFFFFFE4F & 0x65B5) & (0xFFFFEFF7 & 0x7E5E);
        d.lIIlIllIIlIIl[29] = -(0xFFFFFC87 & 0x73FD) & (0xFFFFFBFD & 0x7ED6);
        d.lIIlIllIIlIIl[30] = -(0xFFFFFBDB & 0x5727) & (0xFFFFDFDF & 0x7FFB);
        d.lIIlIllIIlIIl[31] = 0xFFFFEE9F & 0x37E2;
        d.lIIlIllIIlIIl[32] = 0xFFFFBCEE & 0x4FFD;
        d.lIIlIllIIlIIl[33] = 0xFFFFE7B7 & 0x3EDD;
        d.lIIlIllIIlIIl[34] = -(0xFFFF87CE & 0x7F7F) & (0xFFFFFFFF & 0x2F7F);
        d.lIIlIllIIlIIl[35] = -(0xFFFFF5C6 & 0x2EBB) & (0xFFFFBEFF & 0x6FAF);
        d.lIIlIllIIlIIl[36] = 0xFFFF9D8B & 0x6EFF;
        d.lIIlIllIIlIIl[37] = 101 + 48 - 125 + 116 ^ 125 + 139 - 204 + 90;
    }

    private static String lIlIllIIllIIIll(String var2, String var18) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), lIIlIllIIlIIl[9]), "DES");
            Cipher var19 = Cipher.getInstance("DES");
            var19.init(lIIlIllIIlIIl[3], var17);
            return new String(var19.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }
}

