/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.ItemComposition
 *  net.runelite.client.game.ItemManager
 */
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

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
    private static /* synthetic */ int[] lllIIllIII;
    private static /* synthetic */ ItemManager M;
    private static /* synthetic */ String[] lllIIlIlll;

    private static boolean llIIIIIlllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String b(String string) {
        String string2 = null;
        String string3 = lllIIlIlll[lllIIllIII[35]];
        Pattern pattern = Pattern.compile(string3);
        Matcher matcher = pattern.matcher(string);
        if (c.llIIIIIllllIl(matcher.find() ? 1 : 0)) {
            string2 = matcher.group(lllIIllIII[3]);
        }
        return string2;
    }

    private static String llIIIIIlllIII(String var1, String var23) {
        try {
            SecretKeySpec var26 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var23.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(lllIIllIII[5], var26);
            return new String(var11.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    static {
        c.llIIIIIlllIlI();
        c.llIIIIIlllIIl();
    }

    private static String llIIIIIllIlll(String var24, String var21) {
        var24 = new String(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var8 = var21.toCharArray();
        int var5 = lllIIllIII[1];
        char[] var19 = var24.toCharArray();
        int var17 = var19.length;
        int var16 = lllIIllIII[1];
        while (c.llIIIIIlllllI(var16, var17)) {
            char var2 = var19[var16];
            var9.append((char)(var2 ^ var8[var5 % var8.length]));
            0;
            ++var5;
            ++var16;
            0;
            
            return null;
        }
        return String.valueOf(var9);
    }

    private static String llIIIIIllIllI(String var20, String var18) {
        try {
            SecretKeySpec var28 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), lllIIllIII[16]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(lllIIllIII[5], var28);
            return new String(var15.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIllllII(Object object) {
        return object != null;
    }

    public c(ItemManager itemManager) {
        0;
        M = itemManager;
    }

    private static void llIIIIIlllIlI() {
        lllIIllIII = new int[38];
        c.lllIIllIII[0] = 0xFFFFEEFF & 0x3FCC;
        c.lllIIllIII[1] = (0x31 ^ 0x24 ^ (0x30 ^ 0x6D)) & (0x61 ^ 0x28 ^ 1 ^ -1);
        c.lllIIllIII[2] = -(0xFFFFF9BF & 0x1751) & (0xFFFFFFFF & 0x17FF);
        c.lllIIllIII[3] = 1;
        c.lllIIllIII[4] = 0xFFFF9EB3 & 0x637D;
        c.lllIIllIII[5] = 2;
        c.lllIIllIII[6] = 8 ^ 0x20 ^ (0x6E ^ 0x78);
        c.lllIIllIII[7] = 3;
        c.lllIIllIII[8] = -(0xCE ^ 0xC5) & (0xFFFFFB6E & 0x36FF);
        c.lllIIllIII[9] = 0x20 ^ 0x79 ^ (0xC4 ^ 0x99);
        c.lllIIllIII[10] = 0x82 ^ 0x87;
        c.lllIIllIII[11] = 0xFFFF8AEE & 0x771F;
        c.lllIIllIII[12] = 0x6B ^ 0x7D ^ (0x95 ^ 0x85);
        c.lllIIllIII[13] = 0xFFFFFDFF & 0x7E9;
        c.lllIIllIII[14] = 0x7E ^ 0x69 ^ (0x27 ^ 0x37);
        c.lllIIllIII[15] = -(0xFFFFB38F & 0x7EFB) & (0xFFFFFFAF & 0x3EFB);
        c.lllIIllIII[16] = 0xA4 ^ 0xAC;
        c.lllIIllIII[17] = -(0xFFFFDB09 & 0x7CF7) & (0xFFFFDFF7 & 0x7DFB);
        c.lllIIllIII[18] = 0xD0 ^ 0x8B ^ (0xD5 ^ 0x87);
        c.lllIIllIII[19] = 0xFFFF8FFB & 0x7115;
        c.lllIIllIII[20] = 0x31 ^ 0x23 ^ (0x11 ^ 9);
        c.lllIIllIII[21] = -(0xDB ^ 0xC2) & (0xFFFF9FDF & 0x7F7F);
        c.lllIIllIII[22] = 0x9A ^ 0x91;
        c.lllIIllIII[23] = 0xFFFF9F5D & 0x7FEB;
        c.lllIIllIII[24] = 0xB8 ^ 0xB4;
        c.lllIIllIII[25] = 0xFFFF9FFE & 0x7F4B;
        c.lllIIllIII[26] = 0xFA ^ 0x83 ^ (0x27 ^ 0x53);
        c.lllIIllIII[27] = -(0xFFFFA86D & 0x77B7) & (0xFFFFFFFF & 0x3F6F);
        c.lllIIllIII[28] = 0x1D ^ 0x13;
        c.lllIIllIII[29] = 0xFFFFCEEF & 0x7DB7;
        c.lllIIllIII[30] = 0x44 ^ 0x4B;
        c.lllIIllIII[31] = -(0xFFFFF077 & 0x7F8F) & (0xFFFFF7F7 & 0x7FCF);
        c.lllIIllIII[32] = 62 + 42 - 3 + 41 ^ 140 + 96 - 231 + 153;
        c.lllIIllIII[33] = 27 + 42 - 39 + 109 ^ 140 + 151 - 215 + 78;
        c.lllIIllIII[34] = (0x58 ^ 0x1C) + (111 + 182 - 248 + 142) - (104 + 85 - 115 + 144) + (68 + 107 - 151 + 139);
        c.lllIIllIII[35] = 0xCB ^ 0x82 ^ (0x1B ^ 0x40);
        c.lllIIllIII[36] = 0x27 ^ 5 ^ (0x9C ^ 0xAD);
        c.lllIIllIII[37] = 0xFD ^ 0x95 ^ (0x63 ^ 0x1F);
    }

    private static void llIIIIIlllIIl() {
        lllIIlIlll = new String[lllIIllIII[37]];
        c.lllIIlIlll[c.lllIIllIII[1]] = c."Ring of wealth (5)";
        c.lllIIlIlll[c.lllIIllIII[3]] = c."Molten glass";
        c.lllIIlIlll[c.lllIIllIII[5]] = c."Nature rune";
        c.lllIIlIlll[c.lllIIllIII[7]] = c."Maple longbow (u)";
        c.lllIIlIlll[c.lllIIllIII[9]] = c."Uncharged toxic trident";
        c.lllIIlIlll[c.lllIIllIII[10]] = c."Molten glass";
        c.lllIIlIlll[c.lllIIllIII[12]] = c."Bones";
        c.lllIIlIlll[c.lllIIllIII[14]] = c."Magic logs";
        c.lllIIlIlll[c.lllIIllIII[16]] = c."Climbing boots";
        c.lllIIlIlll[c.lllIIllIII[18]] = c."Lockpick";
        c.lllIIlIlll[c.lllIIllIII[20]] = c."Poison";
        c.lllIIlIlll[c.lllIIllIII[22]] = c."Varrock teleport";
        c.lllIIlIlll[c.lllIIllIII[24]] = c."Falador teleport";
        c.lllIIlIlll[c.lllIIllIII[26]] = c."Camelot teleport";
        c.lllIIlIlll[c.lllIIllIII[28]] = c."Ardougne teleport";
        c.lllIIlIlll[c.lllIIllIII[30]] = c."West ardougne teleport";
        c.lllIIlIlll[c.lllIIllIII[32]] = c."Cheese";
        c.lllIIlIlll[c.lllIIllIII[33]] = c."GET";
        c.lllIIlIlll[c.lllIIllIII[35]] = c."<title>(.*?) - OSRS Wiki</title>";
        c.lllIIlIlll[c.lllIIllIII[36]] = c."Unknown Item";
    }

    private static boolean llIIIIIllllIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIIlllIll(int n2, int n3) {
        return n2 == n3;
    }

    public String d(int n2) {
        String string;
        ItemComposition itemComposition = M.getItemComposition(n2);
        if (c.llIIIIIllllII(itemComposition)) {
            string = itemComposition.getName();
            0;
            if (2 < 1) {
                return null;
            }
        } else {
            string = lllIIlIlll[lllIIllIII[36]];
        }
        return string;
    }

    public static String c(int n2) {
        int var25;
        if (c.llIIIIIlllIll(n2, lllIIllIII[0])) {
            return lllIIlIlll[lllIIllIII[1]];
        }
        if (c.llIIIIIlllIll(var25, lllIIllIII[2])) {
            return lllIIlIlll[lllIIllIII[3]];
        }
        if (c.llIIIIIlllIll(var25, lllIIllIII[4])) {
            return lllIIlIlll[lllIIllIII[5]];
        }
        if (c.llIIIIIlllIll(var25, lllIIllIII[6])) {
            return lllIIlIlll[lllIIllIII[7]];
        }
        if (c.llIIIIIlllIll(var25, lllIIllIII[8])) {
            return lllIIlIlll[lllIIllIII[9]];
        }
        if (c.llIIIIIlllIll(var25, lllIIllIII[2])) {
            return lllIIlIlll[lllIIllIII[10]];
        }
        if (c.llIIIIIlllIll(var25, lllIIllIII[11])) {
            return lllIIlIlll[lllIIllIII[12]];
        }
        if (c.llIIIIIlllIll(var25, lllIIllIII[13])) {
            return lllIIlIlll[lllIIllIII[14]];
        }
        if (c.llIIIIIlllIll(var25, lllIIllIII[15])) {
            return lllIIlIlll[lllIIllIII[16]];
        }
        if (c.llIIIIIlllIll(var25, lllIIllIII[17])) {
            return lllIIlIlll[lllIIllIII[18]];
        }
        if (c.llIIIIIlllIll(var25, lllIIllIII[19])) {
            return lllIIlIlll[lllIIllIII[20]];
        }
        if (c.llIIIIIlllIll(var25, lllIIllIII[21])) {
            return lllIIlIlll[lllIIllIII[22]];
        }
        if (c.llIIIIIlllIll(var25, lllIIllIII[23])) {
            return lllIIlIlll[lllIIllIII[24]];
        }
        if (c.llIIIIIlllIll(var25, lllIIllIII[25])) {
            return lllIIlIlll[lllIIllIII[26]];
        }
        if (c.llIIIIIlllIll(var25, lllIIllIII[27])) {
            return lllIIlIlll[lllIIllIII[28]];
        }
        if (c.llIIIIIlllIll(var25, lllIIllIII[29])) {
            return lllIIlIlll[lllIIllIII[30]];
        }
        if (c.llIIIIIlllIll(var25, lllIIllIII[31])) {
            return lllIIlIlll[lllIIllIII[32]];
        }
        String var4 = "https://oldschool.runescape.wiki/w/Special:Lookup?type=item&id=" + var25;
        try {
            URL var27 = new URL(var4);
            HttpURLConnection var7 = (HttpURLConnection)var27.openConnection();
            var7.setRequestMethod(lllIIlIlll[lllIIllIII[33]]);
            int var13 = var7.getResponseCode();
            if (c.llIIIIIlllIll(var13, lllIIllIII[34])) {
                String var22;
                BufferedReader var10 = new BufferedReader(new InputStreamReader(var7.getInputStream()));
                StringBuilder var6 = new StringBuilder();
                while (c.llIIIIIllllII(var22 = var10.readLine())) {
                    var6.append(var22);
                    0;
                    0;
                    if ((0x69 ^ 0x6D) != ((0xF7 ^ 0xA8) & ~(0x22 ^ 0x7D))) continue;
                    return null;
                }
                var10.close();
                String var14 = c.b(String.valueOf(var6));
                return var14;
            }
            0;
        }
        catch (IOException var27) {
            var27.printStackTrace();
        }
        
        }
        return null;
    }
}

