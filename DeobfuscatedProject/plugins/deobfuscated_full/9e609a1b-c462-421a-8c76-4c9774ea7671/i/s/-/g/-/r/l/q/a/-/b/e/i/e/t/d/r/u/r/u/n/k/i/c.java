/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.ItemComposition
 *  net.runelite.client.game.ItemManager
 */
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

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

public class c {
    private static /* synthetic */ ItemManager M;
    private static /* synthetic */ String[] lIIlIIIIIllII;
    private static /* synthetic */ int[] lIIlIIIIIllIl;

    public String d(int n2) {
        String string;
        ItemComposition itemComposition = M.getItemComposition(n2);
        if (c.lIlIIlllIlllllI(itemComposition)) {
            string = itemComposition.getName();
            0;
            
            }
        } else {
            string = lIIlIIIIIllII[lIIlIIIIIllIl[36]];
        }
        return string;
    }

    private static String lIlIIlllIlllIIl(String var7, String var13) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lIIlIIIIIllIl[5], var16);
            return new String(var8.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlllIlllllI(Object object) {
        return object != null;
    }

    public static String c(int n2) {
        int var12;
        if (c.lIlIIlllIllllIl(n2, lIIlIIIIIllIl[0])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[1]];
        }
        if (c.lIlIIlllIllllIl(var12, lIIlIIIIIllIl[2])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[3]];
        }
        if (c.lIlIIlllIllllIl(var12, lIIlIIIIIllIl[4])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[5]];
        }
        if (c.lIlIIlllIllllIl(var12, lIIlIIIIIllIl[6])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[7]];
        }
        if (c.lIlIIlllIllllIl(var12, lIIlIIIIIllIl[8])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[9]];
        }
        if (c.lIlIIlllIllllIl(var12, lIIlIIIIIllIl[2])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[10]];
        }
        if (c.lIlIIlllIllllIl(var12, lIIlIIIIIllIl[11])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[12]];
        }
        if (c.lIlIIlllIllllIl(var12, lIIlIIIIIllIl[13])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[14]];
        }
        if (c.lIlIIlllIllllIl(var12, lIIlIIIIIllIl[15])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[16]];
        }
        if (c.lIlIIlllIllllIl(var12, lIIlIIIIIllIl[17])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[18]];
        }
        if (c.lIlIIlllIllllIl(var12, lIIlIIIIIllIl[19])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[20]];
        }
        if (c.lIlIIlllIllllIl(var12, lIIlIIIIIllIl[21])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[22]];
        }
        if (c.lIlIIlllIllllIl(var12, lIIlIIIIIllIl[23])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[24]];
        }
        if (c.lIlIIlllIllllIl(var12, lIIlIIIIIllIl[25])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[26]];
        }
        if (c.lIlIIlllIllllIl(var12, lIIlIIIIIllIl[27])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[28]];
        }
        if (c.lIlIIlllIllllIl(var12, lIIlIIIIIllIl[29])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[30]];
        }
        if (c.lIlIIlllIllllIl(var12, lIIlIIIIIllIl[31])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[32]];
        }
        String var3 = "https://oldschool.runescape.wiki/w/Special:Lookup?type=item&id=" + var12;
        try {
            URL var2 = new URL(var3);
            HttpURLConnection var11 = (HttpURLConnection)var2.openConnection();
            var11.setRequestMethod(lIIlIIIIIllII[lIIlIIIIIllIl[33]]);
            int var24 = var11.getResponseCode();
            if (c.lIlIIlllIllllIl(var24, lIIlIIIIIllIl[34])) {
                String var1;
                BufferedReader var21 = new BufferedReader(new InputStreamReader(var11.getInputStream()));
                StringBuilder var19 = new StringBuilder();
                while (c.lIlIIlllIlllllI(var1 = var21.readLine())) {
                    var19.append(var1);
                    0;
                    0;
                    if ((0x53 ^ 9 ^ (0x73 ^ 0x2C)) != 0) continue;
                    return null;
                }
                var21.close();
                String var25 = c.b(String.valueOf(var19));
                return var25;
            }
            0;
        }
        catch (IOException var2) {
            var2.printStackTrace();
        }
        if (-2 >= 0) {
            return null;
        }
        return null;
    }

    private static boolean lIlIIlllIllllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIllllIIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIIlllIlllIlI(String var6, String var5) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lIIlIIIIIllIl[16]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(lIIlIIIIIllIl[5], var4);
            return new String(var15.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static String b(String string) {
        String string2 = null;
        String string3 = lIIlIIIIIllII[lIIlIIIIIllIl[35]];
        Pattern pattern = Pattern.compile(string3);
        Matcher matcher = pattern.matcher(string);
        if (c.lIlIIlllIllllll(matcher.find() ? 1 : 0)) {
            string2 = matcher.group(lIIlIIIIIllIl[3]);
        }
        return string2;
    }

    private static String lIlIIlllIlllIII(String var23, String var17) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var28 = var17.toCharArray();
        int var27 = lIIlIIIIIllIl[1];
        char[] var22 = var23.toCharArray();
        int var9 = var22.length;
        int var26 = lIIlIIIIIllIl[1];
        while (c.lIlIIllllIIIIII(var26, var9)) {
            char var20 = var22[var26];
            var14.append((char)(var20 ^ var28[var27 % var28.length]));
            0;
            ++var27;
            ++var26;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static void lIlIIlllIllllII() {
        lIIlIIIIIllIl = new int[38];
        c.lIIlIIIIIllIl[0] = 0xFFFFBEEF & 0x6FDC;
        c.lIIlIIIIIllIl[1] = (31 + 35 - 22 + 127 ^ 117 + 33 - 58 + 38) & (78 + 120 - 55 + 19 ^ 0 + 56 - -26 + 57 ^ -1);
        c.lIIlIIIIIllIl[2] = -(0xFFFFFB95 & 0x2C7B) & (0xFFFFFFFF & 0x2EFF);
        c.lIIlIIIIIllIl[3] = 1;
        c.lIIlIIIIIllIl[4] = -(0xFFFFDAD1 & 0x352F) & (0xFFFF97FD & 0x7A33);
        c.lIIlIIIIIllIl[5] = 2;
        c.lIIlIIIIIllIl[6] = 169 + 116 - 232 + 132 ^ 129 + 41 - 52 + 17;
        c.lIIlIIIIIllIl[7] = 3;
        c.lIIlIIIIIllIl[8] = 0xFFFFBEE5 & 0x737E;
        c.lIIlIIIIIllIl[9] = 0x56 ^ 0x1D ^ (0xCA ^ 0x85);
        c.lIIlIIIIIllIl[10] = 0x70 ^ 0x75;
        c.lIIlIIIIIllIl[11] = 0xFFFFFF3F & 0x2CE;
        c.lIIlIIIIIllIl[12] = 118 + 55 - 119 + 77 ^ 29 + 93 - 32 + 43;
        c.lIIlIIIIIllIl[13] = -(0xFFFFAA73 & 0x778F) & (0xFFFFAFFF & 0x77EB);
        c.lIIlIIIIIllIl[14] = 0x18 ^ 0x1F;
        c.lIIlIIIIIllIl[15] = -(0xFFFFE6BF & 0x79DF) & (0xFFFFEDFF & 0x7EBF);
        c.lIIlIIIIIllIl[16] = 0xBB ^ 0xB3;
        c.lIIlIIIIIllIl[17] = -(0xFFFFE5F7 & 0x7A0D) & (0xFFFFF5FF & 0x6FF7);
        c.lIIlIIIIIllIl[18] = 129 + 40 - -19 + 0 ^ 75 + 180 - 79 + 5;
        c.lIIlIIIIIllIl[19] = -(0xFFFFCEDF & 0x7F6D) & (0xFFFFDF7D & 0x6FDF);
        c.lIIlIIIIIllIl[20] = 0x2F ^ 0x40 ^ (0xCC ^ 0xA9);
        c.lIIlIIIIIllIl[21] = 0xFFFFFF5F & 0x1FE7;
        c.lIIlIIIIIllIl[22] = 41 + 176 - 156 + 143 ^ 170 + 117 - 195 + 107;
        c.lIIlIIIIIllIl[23] = -(92 + 145 - 189 + 119) & (0xFFFFBFEF & 0x5FFF);
        c.lIIlIIIIIllIl[24] = 0xA4 ^ 0xA8;
        c.lIIlIIIIIllIl[25] = -(0xFFFFCCD3 & 0x73AD) & (0xFFFFDFEB & 0x7FDE);
        c.lIIlIIIIIllIl[26] = 0x24 ^ 0x29;
        c.lIIlIIIIIllIl[27] = -(0 + 69 - -82 + 10) & (0xFFFFDFEF & 0x3FFB);
        c.lIIlIIIIIllIl[28] = 52 + 52 - -22 + 46 ^ 125 + 55 - 77 + 59;
        c.lIIlIIIIIllIl[29] = -(0xFFFFFB5F & 0x26A9) & (0xFFFFFFFF & 0x6EAF);
        c.lIIlIIIIIllIl[30] = 0xA0 ^ 0xB3 ^ (0x4C ^ 0x50);
        c.lIIlIIIIIllIl[31] = 0xFFFF87CF & 0x7FF1;
        c.lIIlIIIIIllIl[32] = 0x94 ^ 0x84;
        c.lIIlIIIIIllIl[33] = 0x6E ^ 0x7F;
        c.lIIlIIIIIllIl[34] = 158 + 28 - 162 + 176;
        c.lIIlIIIIIllIl[35] = 0x4A ^ 0x58;
        c.lIIlIIIIIllIl[36] = 144 + 86 - 173 + 104 ^ 116 + 170 - 165 + 57;
        c.lIIlIIIIIllIl[37] = 0x75 ^ 0x7E ^ (0x39 ^ 0x26);
    }

    public c(ItemManager itemManager) {
        0;
        M = itemManager;
    }

    static {
        c.lIlIIlllIllllII();
        c.lIlIIlllIlllIll();
    }

    private static void lIlIIlllIlllIll() {
        lIIlIIIIIllII = new String[lIIlIIIIIllIl[37]];
        c.lIIlIIIIIllII[c.lIIlIIIIIllIl[1]] = c."Ring of wealth (5)";
        c.lIIlIIIIIllII[c.lIIlIIIIIllIl[3]] = c."Molten glass";
        c.lIIlIIIIIllII[c.lIIlIIIIIllIl[5]] = c."Nature rune";
        c.lIIlIIIIIllII[c.lIIlIIIIIllIl[7]] = c."Maple longbow (u)";
        c.lIIlIIIIIllII[c.lIIlIIIIIllIl[9]] = c."Uncharged toxic trident";
        c.lIIlIIIIIllII[c.lIIlIIIIIllIl[10]] = c."Molten glass";
        c.lIIlIIIIIllII[c.lIIlIIIIIllIl[12]] = c."Bones";
        c.lIIlIIIIIllII[c.lIIlIIIIIllIl[14]] = c."Magic logs";
        c.lIIlIIIIIllII[c.lIIlIIIIIllIl[16]] = c."Climbing boots";
        c.lIIlIIIIIllII[c.lIIlIIIIIllIl[18]] = c."Lockpick";
        c.lIIlIIIIIllII[c.lIIlIIIIIllIl[20]] = c."Poison";
        c.lIIlIIIIIllII[c.lIIlIIIIIllIl[22]] = c."Varrock teleport";
        c.lIIlIIIIIllII[c.lIIlIIIIIllIl[24]] = c."Falador teleport";
        c.lIIlIIIIIllII[c.lIIlIIIIIllIl[26]] = c."Camelot teleport";
        c.lIIlIIIIIllII[c.lIIlIIIIIllIl[28]] = c."Ardougne teleport";
        c.lIIlIIIIIllII[c.lIIlIIIIIllIl[30]] = c."West ardougne teleport";
        c.lIIlIIIIIllII[c.lIIlIIIIIllIl[32]] = c."Cheese";
        c.lIIlIIIIIllII[c.lIIlIIIIIllIl[33]] = c."GET";
        c.lIIlIIIIIllII[c.lIIlIIIIIllIl[35]] = c."<title>(.*?) - OSRS Wiki</title>";
        c.lIIlIIIIIllII[c.lIIlIIIIIllIl[36]] = c."Unknown Item";
    }

    private static boolean lIlIIlllIllllIl(int n2, int n3) {
        return n2 == n3;
    }
}

