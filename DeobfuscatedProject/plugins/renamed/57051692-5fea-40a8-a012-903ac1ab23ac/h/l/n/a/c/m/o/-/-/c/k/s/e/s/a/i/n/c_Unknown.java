/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.ItemComposition
 *  net.runelite.client.game.ItemManager
 */
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.ItemComposition;
import net.runelite.client.game.ItemManager;

public class c_Unknown {
    private static /* synthetic */ ItemManager M;
    private static /* synthetic */ int[] lIllIlIllI;
    private static /* synthetic */ String[] lIllIlIIll;

    public static String c(int n2) {
        int var25;
        if (c.lIIllIIllIIll(n2, lIllIlIllI[0])) {
            return lIllIlIIll[lIllIlIllI[1]];
        }
        if (c.lIIllIIllIIll(var25, lIllIlIllI[2])) {
            return lIllIlIIll[lIllIlIllI[3]];
        }
        if (c.lIIllIIllIIll(var25, lIllIlIllI[4])) {
            return lIllIlIIll[lIllIlIllI[5]];
        }
        if (c.lIIllIIllIIll(var25, lIllIlIllI[6])) {
            return lIllIlIIll[lIllIlIllI[7]];
        }
        if (c.lIIllIIllIIll(var25, lIllIlIllI[8])) {
            return lIllIlIIll[lIllIlIllI[9]];
        }
        if (c.lIIllIIllIIll(var25, lIllIlIllI[2])) {
            return lIllIlIIll[lIllIlIllI[10]];
        }
        if (c.lIIllIIllIIll(var25, lIllIlIllI[4])) {
            return lIllIlIIll[lIllIlIllI[11]];
        }
        if (c.lIIllIIllIIll(var25, lIllIlIllI[6])) {
            return lIllIlIIll[lIllIlIllI[12]];
        }
        if (c.lIIllIIllIIll(var25, lIllIlIllI[13])) {
            return lIllIlIIll[lIllIlIllI[14]];
        }
        if (c.lIIllIIllIIll(var25, lIllIlIllI[15])) {
            return lIllIlIIll[lIllIlIllI[16]];
        }
        if (c.lIIllIIllIIll(var25, lIllIlIllI[17])) {
            return lIllIlIIll[lIllIlIllI[18]];
        }
        if (c.lIIllIIllIIll(var25, lIllIlIllI[19])) {
            return lIllIlIIll[lIllIlIllI[20]];
        }
        if (c.lIIllIIllIIll(var25, lIllIlIllI[21])) {
            return lIllIlIIll[lIllIlIllI[22]];
        }
        if (c.lIIllIIllIIll(var25, lIllIlIllI[23])) {
            return lIllIlIIll[lIllIlIllI[24]];
        }
        if (c.lIIllIIllIIll(var25, lIllIlIllI[25])) {
            return lIllIlIIll[lIllIlIllI[26]];
        }
        if (c.lIIllIIllIIll(var25, lIllIlIllI[27])) {
            return lIllIlIIll[lIllIlIllI[28]];
        }
        if (c.lIIllIIllIIll(var25, lIllIlIllI[29])) {
            return lIllIlIIll[lIllIlIllI[30]];
        }
        if (c.lIIllIIllIIll(var25, lIllIlIllI[31])) {
            return lIllIlIIll[lIllIlIllI[32]];
        }
        if (c.lIIllIIllIIll(var25, lIllIlIllI[33])) {
            return lIllIlIIll[lIllIlIllI[34]];
        }
        String var1 = "https://oldschool.runescape.wiki/w/Special:Lookup?type=item&id=" + var25;
        try {
            URL var16 = new URL(var1);
            HttpURLConnection var21 = (HttpURLConnection)var16.openConnection();
            var21.setRequestMethod(lIllIlIIll[lIllIlIllI[35]]);
            int var12 = var21.getResponseCode();
            if (c.lIIllIIllIIll(var12, lIllIlIllI[36])) {
                String var7;
                BufferedReader var8 = new BufferedReader(new InputStreamReader(var21.getInputStream()));
                StringBuilder var17 = new StringBuilder();
                while (c.lIIllIIllIlII(var7 = var8.readLine())) {
                    var17.append(var7);
                    0;
                    0;
                    if (((38 + 100 - -7 + 3 ^ 109 + 107 - 198 + 147) & (0x51 ^ 3 ^ (0x4D ^ 0x2E) ^ -1)) == 0) continue;
                    return null;
                }
                var8.close();
                String var14 = c.b(String.valueOf(var17));
                return var14;
            }
            0;
        }
        catch (IOException var16) {
            var16.printStackTrace();
        }
        if (((0x22 ^ 0x3F) & ~(0x99 ^ 0x84)) >= (0x48 ^ 0x4C)) {
            return null;
        }
        return null;
    }

    private static String lIIllIIlIIIll(String var9, String var18) {
        try {
            SecretKeySpec var28 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), lIllIlIllI[14]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(lIllIlIllI[5], var28);
            return new String(var15.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIIllIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIllIIllIlII(Object object) {
        return object != null;
    }

    public c(ItemManager itemManager) {
        0;
        M = itemManager;
    }

    private static boolean lIIllIIllIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIllIIllIIIl() {
        lIllIlIIll = new String[lIllIlIllI[39]];
        c.lIllIlIIll[c.lIllIlIllI[1]] = c."Ring of wealth (5)";
        c.lIllIlIIll[c.lIllIlIllI[3]] = c."Molten glass";
        c.lIllIlIIll[c.lIllIlIllI[5]] = c."Nature rune";
        c.lIllIlIIll[c.lIllIlIllI[7]] = c."Maple longbow (u)";
        c.lIllIlIIll[c.lIllIlIllI[9]] = c."Uncharged toxic trident";
        c.lIllIlIIll[c.lIllIlIllI[10]] = c."Molten glass";
        c.lIllIlIIll[c.lIllIlIllI[11]] = c."Nature rune";
        c.lIllIlIIll[c.lIllIlIllI[12]] = c."Maple longbow (u)";
        c.lIllIlIIll[c.lIllIlIllI[14]] = c."Bones";
        c.lIllIlIIll[c.lIllIlIllI[16]] = c."Magic logs";
        c.lIllIlIIll[c.lIllIlIllI[18]] = c."Climbing boots";
        c.lIllIlIIll[c.lIllIlIllI[20]] = c."Lockpick";
        c.lIllIlIIll[c.lIllIlIllI[22]] = c."Poison";
        c.lIllIlIIll[c.lIllIlIllI[24]] = c."Varrock teleport";
        c.lIllIlIIll[c.lIllIlIllI[26]] = c."Falador teleport";
        c.lIllIlIIll[c.lIllIlIllI[28]] = c."Camelot teleport";
        c.lIllIlIIll[c.lIllIlIllI[30]] = c."Ardougne teleport";
        c.lIllIlIIll[c.lIllIlIllI[32]] = c."West ardougne teleport";
        c.lIllIlIIll[c.lIllIlIllI[34]] = c."Cheese";
        c.lIllIlIIll[c.lIllIlIllI[35]] = c."GET";
        c.lIllIlIIll[c.lIllIlIllI[37]] = c."<title>(.*?) - OSRS Wiki</title>";
        c.lIllIlIIll[c.lIllIlIllI[38]] = c."Unknown Item";
    }

    private static void lIIllIIllIIlI() {
        lIllIlIllI = new int[40];
        c.lIllIlIllI[0] = -(0xFFFFDABA & 0x3577) & (0xFFFFBEFF & 0x7FFD);
        c.lIllIlIllI[1] = (0xCE ^ 0x86) & ~(0xFA ^ 0xB2);
        c.lIllIlIllI[2] = -(0xFFFFDB5D & 0x7CB3) & (0xFFFFDEFF & Short.MAX_VALUE);
        c.lIllIlIllI[3] = 1;
        c.lIllIlIllI[4] = -(0xFFFFE51F & 0x7FEB) & (0xFFFFE7FB & 0x7F3F);
        c.lIllIlIllI[5] = 2;
        c.lIllIlIllI[6] = 0x57 ^ 0x3C ^ (0x56 ^ 3);
        c.lIllIlIllI[7] = 3;
        c.lIllIlIllI[8] = 0xFFFFFFF5 & 0x326E;
        c.lIllIlIllI[9] = 144 + 36 - 92 + 66 ^ 95 + 53 - 51 + 61;
        c.lIllIlIllI[10] = 0x9A ^ 0x9F;
        c.lIllIlIllI[11] = 67 + 135 - 100 + 56 ^ 127 + 80 - 93 + 38;
        c.lIllIlIllI[12] = 0x2F ^ 0x28;
        c.lIllIlIllI[13] = -(0xFFFFFFD3 & 0x69FD) & (0xFFFFFFFF & 0x6BDE);
        c.lIllIlIllI[14] = 0x35 ^ 0x3D;
        c.lIllIlIllI[15] = -(0xFFFFEAD9 & 0x3727) & (0xFFFFEFEB & 0x37FD);
        c.lIllIlIllI[16] = 0x95 ^ 0x9C;
        c.lIllIlIllI[17] = 0xFFFFAC29 & 0x5FF7;
        c.lIllIlIllI[18] = 0x14 ^ 0x6D ^ (0xE2 ^ 0x91);
        c.lIllIlIllI[19] = -(0xFFFFED7D & 0x7A87) & (0xFFFFEDFF & 0x7FF7);
        c.lIllIlIllI[20] = 0xA2 ^ 0xA9;
        c.lIllIlIllI[21] = -(0xFFFFABAF & 0x5ED3) & (0xFFFFDBB3 & 0x2FDF);
        c.lIllIlIllI[22] = 0x76 ^ 0x20 ^ (0xFA ^ 0xA0);
        c.lIllIlIllI[23] = -(0xFFFFBF49 & 0x60B7) & (0xFFFFBF5F & 0x7FE7);
        c.lIllIlIllI[24] = 0x87 ^ 0x8A;
        c.lIllIlIllI[25] = 0xFFFFFF5F & 0x1FE9;
        c.lIllIlIllI[26] = 0xAE ^ 0xA0;
        c.lIllIlIllI[27] = -(0xFFFFF4FD & 0x6BA7) & (0xFFFFFFEE & Short.MAX_VALUE);
        c.lIllIlIllI[28] = 0x26 ^ 0x3F ^ (0x2B ^ 0x3D);
        c.lIllIlIllI[29] = -(0x31 ^ 0x24) & (0xFFFFFFDF & 0x1F7F);
        c.lIllIlIllI[30] = 0x28 ^ 0x38;
        c.lIllIlIllI[31] = 0xFFFFCFF7 & 0x7CAF;
        c.lIllIlIllI[32] = 0xB4 ^ 0xA5;
        c.lIllIlIllI[33] = 0xFFFFDFDF & 0x27E1;
        c.lIllIlIllI[34] = 65 + 143 - 185 + 122 ^ 42 + 72 - 60 + 77;
        c.lIllIlIllI[35] = 0x8B ^ 0x98;
        c.lIllIlIllI[36] = (0x66 ^ 0x54) + (112 + 31 - 73 + 91) - (0xFD ^ 0xB9) + (0x52 ^ 0x6B);
        c.lIllIlIllI[37] = 0xA5 ^ 0xBC ^ (1 ^ 0xC);
        c.lIllIlIllI[38] = 0xAD ^ 0xC2 ^ (0xF9 ^ 0x83);
        c.lIllIlIllI[39] = 0x3F ^ 0x1F ^ (0x5A ^ 0x6C);
    }

    private static boolean lIIllIIllIlIl(int n2) {
        return n2 != 0;
    }

    private static String b(String string) {
        String string2 = null;
        String string3 = lIllIlIIll[lIllIlIllI[37]];
        Pattern pattern = Pattern.compile(string3);
        Matcher matcher = pattern.matcher(string);
        if (c.lIIllIIllIlIl(matcher.find() ? 1 : 0)) {
            string2 = matcher.group(lIllIlIllI[3]);
        }
        return string2;
    }

    static {
        c.lIIllIIllIIlI();
        c.lIIllIIllIIIl();
    }

    private static String lIIllIIlIIlII(String var3, String var26) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var26.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lIllIlIllI[5], var6);
            return new String(var2.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    public String d(int n2) {
        String string;
        ItemComposition itemComposition = M.getItemComposition(n2);
        if (c.lIIllIIllIlII(itemComposition)) {
            string = itemComposition.getName();
            0;
            if (((0x3E ^ 0x32) & ~(0x6C ^ 0x60)) != 0) {
                return null;
            }
        } else {
            string = lIllIlIIll[lIllIlIllI[38]];
        }
        return string;
    }

    private static String lIIllIIlIIIlI(String var23, String var10) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var24 = new StringBuilder();
        char[] var27 = var10.toCharArray();
        int var4 = lIllIlIllI[1];
        char[] var13 = var23.toCharArray();
        int var19 = var13.length;
        int var11 = lIllIlIllI[1];
        while (c.lIIllIIllIllI(var11, var19)) {
            char var22 = var13[var11];
            var24.append((char)(var22 ^ var27[var4 % var27.length]));
            0;
            ++var4;
            ++var11;
            0;
            if (((23 + 67 - 72 + 134 ^ 57 + 103 - 36 + 27) & (146 + 125 - 103 + 4 ^ 148 + 102 - 120 + 33 ^ -1)) == ((0xE9 ^ 0xAD ^ (0x1F ^ 0x56)) & (0x78 ^ 0x12 ^ (0xA7 ^ 0xC0) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var24);
    }
}

