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

public class c {
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

    private static String llIIIIIlllIII(String lllllllllllllllllIlllIlIIlIIlIIl, String lllllllllllllllllIlllIlIIlIIIllI) {
        try {
            SecretKeySpec lllllllllllllllllIlllIlIIlIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIlIIlIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlllIlIIlIIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlllIlIIlIIlIll.init(lllIIllIII[5], lllllllllllllllllIlllIlIIlIIllII);
            return new String(lllllllllllllllllIlllIlIIlIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIlIIlIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlllIlIIlIIlIlI) {
            lllllllllllllllllIlllIlIIlIIlIlI.printStackTrace();
            return null;
        }
    }

    static {
        c.llIIIIIlllIlI();
        c.llIIIIIlllIIl();
    }

    private static String llIIIIIllIlll(String lllllllllllllllllIlllIlIIIlllIIl, String lllllllllllllllllIlllIlIIIllIIll) {
        lllllllllllllllllIlllIlIIIlllIIl = new String(Base64.getDecoder().decode(lllllllllllllllllIlllIlIIIlllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlllIlIIIllIlll = new StringBuilder();
        char[] lllllllllllllllllIlllIlIIIllIllI = lllllllllllllllllIlllIlIIIllIIll.toCharArray();
        int lllllllllllllllllIlllIlIIIllIlIl = lllIIllIII[1];
        char[] lllllllllllllllllIlllIlIIIlIllll = lllllllllllllllllIlllIlIIIlllIIl.toCharArray();
        int lllllllllllllllllIlllIlIIIlIlllI = lllllllllllllllllIlllIlIIIlIllll.length;
        int lllllllllllllllllIlllIlIIIlIllIl = lllIIllIII[1];
        while (c.llIIIIIlllllI(lllllllllllllllllIlllIlIIIlIllIl, lllllllllllllllllIlllIlIIIlIlllI)) {
            char lllllllllllllllllIlllIlIIIlllIlI = lllllllllllllllllIlllIlIIIlIllll[lllllllllllllllllIlllIlIIIlIllIl];
            lllllllllllllllllIlllIlIIIllIlll.append((char)(lllllllllllllllllIlllIlIIIlllIlI ^ lllllllllllllllllIlllIlIIIllIllI[lllllllllllllllllIlllIlIIIllIlIl % lllllllllllllllllIlllIlIIIllIllI.length]));
            "".length();
            ++lllllllllllllllllIlllIlIIIllIlIl;
            ++lllllllllllllllllIlllIlIIIlIllIl;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIlllIlIIIllIlll);
    }

    private static String llIIIIIllIllI(String lllllllllllllllllIlllIlIIlIlIlII, String lllllllllllllllllIlllIlIIlIlIIll) {
        try {
            SecretKeySpec lllllllllllllllllIlllIlIIlIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIlIIlIlIIll.getBytes(StandardCharsets.UTF_8)), lllIIllIII[16]), "DES");
            Cipher lllllllllllllllllIlllIlIIlIllIII = Cipher.getInstance("DES");
            lllllllllllllllllIlllIlIIlIllIII.init(lllIIllIII[5], lllllllllllllllllIlllIlIIlIllIIl);
            return new String(lllllllllllllllllIlllIlIIlIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIlIIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlllIlIIlIlIlll) {
            lllllllllllllllllIlllIlIIlIlIlll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIllllII(Object object) {
        return object != null;
    }

    public c(ItemManager itemManager) {
        "".length();
        M = itemManager;
    }

    private static void llIIIIIlllIlI() {
        lllIIllIII = new int[38];
        c.lllIIllIII[0] = 0xFFFFEEFF & 0x3FCC;
        c.lllIIllIII[1] = (0x31 ^ 0x24 ^ (0x30 ^ 0x6D)) & (0x61 ^ 0x28 ^ " ".length() ^ -" ".length());
        c.lllIIllIII[2] = -(0xFFFFF9BF & 0x1751) & (0xFFFFFFFF & 0x17FF);
        c.lllIIllIII[3] = " ".length();
        c.lllIIllIII[4] = 0xFFFF9EB3 & 0x637D;
        c.lllIIllIII[5] = "  ".length();
        c.lllIIllIII[6] = 8 ^ 0x20 ^ (0x6E ^ 0x78);
        c.lllIIllIII[7] = "   ".length();
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
        c.lllIIlIlll[c.lllIIllIII[1]] = c.llIIIIIllIllI("QL2lg7Y95h1qudwBM7H0ytATfM0xd82x", "tmWEw");
        c.lllIIlIlll[c.lllIIllIII[3]] = c.llIIIIIllIlll("PQgGBBQeRw0cEAMU", "pgjpq");
        c.lllIIlIlll[c.lllIIllIII[5]] = c.llIIIIIllIlll("Kg4eEAIBTxgQHgE=", "dojep");
        c.lllIIlIlll[c.lllIIllIII[7]] = c.llIIIIIllIlll("ICYBFTBNKx4XMg8oBll9GG4=", "mGqyU");
        c.lllIIlIlll[c.lllIIllIII[9]] = c.llIIIIIllIllI("Vjzv0idaGJGn6EdMaJHZkxKklWSyWcbV", "JnglI");
        c.lllIIlIlll[c.lllIIllIII[10]] = c.llIIIIIllIlll("DgMuIQ8tTCU5CzAf", "ClBUj");
        c.lllIIlIlll[c.lllIIllIII[12]] = c.llIIIIIllIllI("cY9gr7mondE=", "zQhuw");
        c.lllIIlIlll[c.lllIIllIII[14]] = c.llIIIIIllIlll("Cy0vBjJmICcIIg==", "FLHoQ");
        c.lllIIlIlll[c.lllIIllIII[16]] = c.llIIIIIllIlll("NAITIygeAB1uKBgBDj0=", "wnzNJ");
        c.lllIIlIlll[c.lllIIllIII[18]] = c.llIIIIIllIlll("JwQpPgECCCE=", "kkJUq");
        c.lllIIlIlll[c.lllIIllIII[20]] = c.llIIIIIllIllI("2dnoOir1M7U=", "NmzNV");
        c.lllIIlIlll[c.lllIIllIII[22]] = c.llIIIIIllIllI("aCD7SrpYfnd+Zbeqgtz7Yi/YcHrrf0dy", "LJKAO");
        c.lllIIlIlll[c.lllIIllIII[24]] = c.llIIIIIllIlll("IQsvEDYIGGMFNwsPMx4gEw==", "gjCqR");
        c.lllIIlIlll[c.lllIIllIII[26]] = c.llIIIIIllIllI("1WvDHo5u9ZQY0i51owypPdcj1MBNAf53", "gCfTl");
        c.lllIIlIlll[c.lllIIllIII[28]] = c.llIIIIIllIlll("LxoRCDwJBhBHPQsEEBcmHBw=", "nhugI");
        c.lllIIlIlll[c.lllIIllIII[30]] = c.llIIIIIllIlll("PA8gGE0KGDcDGAwENkwZDgY2HAIZHg==", "kjSlm");
        c.lllIIlIlll[c.lllIIllIII[32]] = c.llIIIIIllIlll("LB0kHQoK", "ouAxy");
        c.lllIIlIlll[c.lllIIllIII[33]] = c.llIIIIIlllIII("xxb5sTgoUeg=", "soBQv");
        c.lllIIlIlll[c.lllIIllIII[35]] = c.llIIIIIllIllI("qIExFyw54nTEfZ+r4uNmv8mUgt8w5tgjTnFeErdhG/dtFOSv4mgo8Q==", "zeiqh");
        c.lllIIlIlll[c.lllIIllIII[36]] = c.llIIIIIllIllI("HaQSWPDChy5KG0yYb5F6sA==", "QJvgO");
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
            "".length();
            if ("  ".length() < " ".length()) {
                return null;
            }
        } else {
            string = lllIIlIlll[lllIIllIII[36]];
        }
        return string;
    }

    public static String c(int n2) {
        int lllllllllllllllllIlllIlIIlllIlII;
        if (c.llIIIIIlllIll(n2, lllIIllIII[0])) {
            return lllIIlIlll[lllIIllIII[1]];
        }
        if (c.llIIIIIlllIll(lllllllllllllllllIlllIlIIlllIlII, lllIIllIII[2])) {
            return lllIIlIlll[lllIIllIII[3]];
        }
        if (c.llIIIIIlllIll(lllllllllllllllllIlllIlIIlllIlII, lllIIllIII[4])) {
            return lllIIlIlll[lllIIllIII[5]];
        }
        if (c.llIIIIIlllIll(lllllllllllllllllIlllIlIIlllIlII, lllIIllIII[6])) {
            return lllIIlIlll[lllIIllIII[7]];
        }
        if (c.llIIIIIlllIll(lllllllllllllllllIlllIlIIlllIlII, lllIIllIII[8])) {
            return lllIIlIlll[lllIIllIII[9]];
        }
        if (c.llIIIIIlllIll(lllllllllllllllllIlllIlIIlllIlII, lllIIllIII[2])) {
            return lllIIlIlll[lllIIllIII[10]];
        }
        if (c.llIIIIIlllIll(lllllllllllllllllIlllIlIIlllIlII, lllIIllIII[11])) {
            return lllIIlIlll[lllIIllIII[12]];
        }
        if (c.llIIIIIlllIll(lllllllllllllllllIlllIlIIlllIlII, lllIIllIII[13])) {
            return lllIIlIlll[lllIIllIII[14]];
        }
        if (c.llIIIIIlllIll(lllllllllllllllllIlllIlIIlllIlII, lllIIllIII[15])) {
            return lllIIlIlll[lllIIllIII[16]];
        }
        if (c.llIIIIIlllIll(lllllllllllllllllIlllIlIIlllIlII, lllIIllIII[17])) {
            return lllIIlIlll[lllIIllIII[18]];
        }
        if (c.llIIIIIlllIll(lllllllllllllllllIlllIlIIlllIlII, lllIIllIII[19])) {
            return lllIIlIlll[lllIIllIII[20]];
        }
        if (c.llIIIIIlllIll(lllllllllllllllllIlllIlIIlllIlII, lllIIllIII[21])) {
            return lllIIlIlll[lllIIllIII[22]];
        }
        if (c.llIIIIIlllIll(lllllllllllllllllIlllIlIIlllIlII, lllIIllIII[23])) {
            return lllIIlIlll[lllIIllIII[24]];
        }
        if (c.llIIIIIlllIll(lllllllllllllllllIlllIlIIlllIlII, lllIIllIII[25])) {
            return lllIIlIlll[lllIIllIII[26]];
        }
        if (c.llIIIIIlllIll(lllllllllllllllllIlllIlIIlllIlII, lllIIllIII[27])) {
            return lllIIlIlll[lllIIllIII[28]];
        }
        if (c.llIIIIIlllIll(lllllllllllllllllIlllIlIIlllIlII, lllIIllIII[29])) {
            return lllIIlIlll[lllIIllIII[30]];
        }
        if (c.llIIIIIlllIll(lllllllllllllllllIlllIlIIlllIlII, lllIIllIII[31])) {
            return lllIIlIlll[lllIIllIII[32]];
        }
        String lllllllllllllllllIlllIlIIlllIIll = "https://oldschool.runescape.wiki/w/Special:Lookup?type=item&id=" + lllllllllllllllllIlllIlIIlllIlII;
        try {
            URL lllllllllllllllllIlllIlIIlllIIlI = new URL(lllllllllllllllllIlllIlIIlllIIll);
            HttpURLConnection lllllllllllllllllIlllIlIIlllIIIl = (HttpURLConnection)lllllllllllllllllIlllIlIIlllIIlI.openConnection();
            lllllllllllllllllIlllIlIIlllIIIl.setRequestMethod(lllIIlIlll[lllIIllIII[33]]);
            int lllllllllllllllllIlllIlIIlllIIII = lllllllllllllllllIlllIlIIlllIIIl.getResponseCode();
            if (c.llIIIIIlllIll(lllllllllllllllllIlllIlIIlllIIII, lllIIllIII[34])) {
                String lllllllllllllllllIlllIlIIllIlllI;
                BufferedReader lllllllllllllllllIlllIlIIllIllll = new BufferedReader(new InputStreamReader(lllllllllllllllllIlllIlIIlllIIIl.getInputStream()));
                StringBuilder lllllllllllllllllIlllIlIIllIllIl = new StringBuilder();
                while (c.llIIIIIllllII(lllllllllllllllllIlllIlIIllIlllI = lllllllllllllllllIlllIlIIllIllll.readLine())) {
                    lllllllllllllllllIlllIlIIllIllIl.append(lllllllllllllllllIlllIlIIllIlllI);
                    "".length();
                    "".length();
                    if ((0x69 ^ 0x6D) != ((0xF7 ^ 0xA8) & ~(0x22 ^ 0x7D))) continue;
                    return null;
                }
                lllllllllllllllllIlllIlIIllIllll.close();
                String lllllllllllllllllIlllIlIIllIllII = c.b(String.valueOf(lllllllllllllllllIlllIlIIllIllIl));
                return lllllllllllllllllIlllIlIIllIllII;
            }
            "".length();
        }
        catch (IOException lllllllllllllllllIlllIlIIlllIIlI) {
            lllllllllllllllllIlllIlIIlllIIlI.printStackTrace();
        }
        if (null != null) {
            return null;
        }
        return null;
    }
}

