/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.ItemComposition
 *  net.runelite.client.game.ItemManager
 */
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

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
    private static /* synthetic */ ItemManager N;
    private static /* synthetic */ String[] lllIIllI;
    private static /* synthetic */ int[] lllIIlll;

    private static boolean lIlllllIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllllllIII(int n2) {
        return n2 != 0;
    }

    public c(ItemManager itemManager) {
        0;
        N = itemManager;
    }

    static {
        c.lIlllllIlIl();
        c.lIlllllIIll();
    }

    private static void lIlllllIIll() {
        lllIIllI = new String[lllIIlll[39]];
        c.lllIIllI[c.lllIIlll[1]] = c."Ring of wealth (5)";
        c.lllIIllI[c.lllIIlll[3]] = c."Molten glass";
        c.lllIIllI[c.lllIIlll[5]] = c."Nature rune";
        c.lllIIllI[c.lllIIlll[7]] = c."Maple longbow (u)";
        c.lllIIllI[c.lllIIlll[9]] = c."Uncharged toxic trident";
        c.lllIIllI[c.lllIIlll[10]] = c."Molten glass";
        c.lllIIllI[c.lllIIlll[11]] = c."Nature rune";
        c.lllIIllI[c.lllIIlll[12]] = c."Maple longbow (u)";
        c.lllIIllI[c.lllIIlll[14]] = c."Bones";
        c.lllIIllI[c.lllIIlll[16]] = c."Magic logs";
        c.lllIIllI[c.lllIIlll[18]] = c."Climbing boots";
        c.lllIIllI[c.lllIIlll[20]] = c."Lockpick";
        c.lllIIllI[c.lllIIlll[22]] = c."Poison";
        c.lllIIllI[c.lllIIlll[24]] = c."Varrock teleport";
        c.lllIIllI[c.lllIIlll[26]] = c."Falador teleport";
        c.lllIIllI[c.lllIIlll[28]] = c."Camelot teleport";
        c.lllIIllI[c.lllIIlll[30]] = c."Ardougne teleport";
        c.lllIIllI[c.lllIIlll[32]] = c."West ardougne teleport";
        c.lllIIllI[c.lllIIlll[34]] = c."Cheese";
        c.lllIIllI[c.lllIIlll[35]] = c."GET";
        c.lllIIllI[c.lllIIlll[37]] = c."<title>(.*?) - OSRS Wiki</title>";
        c.lllIIllI[c.lllIIlll[38]] = c."Unknown Item";
    }

    private static String lIlllllIIlI(String lIlIIIIlIIIIIII, String lIlIIIIIlllllll) {
        try {
            SecretKeySpec lIlIIIIlIIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIIIIlllllll.getBytes(StandardCharsets.UTF_8)), lllIIlll[14]), "DES");
            Cipher lIlIIIIlIIIIIlI = Cipher.getInstance("DES");
            lIlIIIIlIIIIIlI.init(lllIIlll[5], lIlIIIIlIIIIIll);
            return new String(lIlIIIIlIIIIIlI.doFinal(Base64.getDecoder().decode(lIlIIIIlIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIIIlIIIIIIl) {
            lIlIIIIlIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static void lIlllllIlIl() {
        lllIIlll = new int[40];
        c.lllIIlll[0] = -(0xFFFFFD3F & 0x53F4) & (0xFFFFFFFF & Short.MAX_VALUE);
        c.lllIIlll[1] = (0x92 ^ 0xB8) & ~(0x8B ^ 0xA1);
        c.lllIIlll[2] = 0xFFFF9FFF & 0x66EF;
        c.lllIIlll[3] = 1;
        c.lllIIlll[4] = -(0xFFFFFFCD & 0x79FF) & (0xFFFFFBFF & 0x7FFD);
        c.lllIIlll[5] = 2;
        c.lllIIlll[6] = 0x75 ^ 0x4B;
        c.lllIIlll[7] = 3;
        c.lllIIlll[8] = -(0xFFFFECBF & 0x5FDA) & (0xFFFFFFFD & 0x7EFF);
        c.lllIIlll[9] = 0x7E ^ 0x23 ^ (0xD3 ^ 0x8A);
        c.lllIIlll[10] = 0x2C ^ 0x1C ^ (0x8D ^ 0xB8);
        c.lllIIlll[11] = 0x61 ^ 0x64 ^ 3;
        c.lllIIlll[12] = 0x2E ^ 0x3B ^ (0x76 ^ 0x64);
        c.lllIIlll[13] = 0xFFFFE32E & 0x1EDF;
        c.lllIIlll[14] = 0xE3 ^ 0x8A ^ (0xDA ^ 0xBB);
        c.lllIIlll[15] = -(0xFFFFFE1F & 0x51E5) & (0xFFFFFFFD & 0x55EF);
        c.lllIIlll[16] = 5 ^ 0xD ^ 1;
        c.lllIIlll[17] = 0xFFFFFDF5 & 0xE2B;
        c.lllIIlll[18] = 99 + 27 - 120 + 128 ^ 138 + 117 - 225 + 110;
        c.lllIIlll[19] = -(0xFFFFEFCD & 0x323F) & (0xFFFFB7FF & 0x6FFF);
        c.lllIIlll[20] = 0x33 ^ 0x38;
        c.lllIIlll[21] = 0xFFFFA53D & 0x5BD3;
        c.lllIIlll[22] = 0xBA ^ 0xB6;
        c.lllIIlll[23] = 0xFFFFBFF7 & 0x5F4F;
        c.lllIIlll[24] = 0x33 ^ 0x3E;
        c.lllIIlll[25] = 0xFFFFFF5B & 0x1FED;
        c.lllIIlll[26] = 0xD7 ^ 0x99 ^ (0x75 ^ 0x35);
        c.lllIIlll[27] = 0xFFFFDF7F & 0x3FCA;
        c.lllIIlll[28] = 0x6D ^ 0x77 ^ (0x33 ^ 0x26);
        c.lllIIlll[29] = -(0xFFFFCEBD & 0x71E7) & (0xFFFFFFEF & 0x5FFF);
        c.lllIIlll[30] = 0x9A ^ 0x8A;
        c.lllIIlll[31] = 0xFFFFECB7 & 0x5FEF;
        c.lllIIlll[32] = 97 + 75 - 126 + 90 ^ 86 + 86 - 169 + 150;
        c.lllIIlll[33] = -(0xFFFFD513 & 0x7AEF) & (0xFFFFD7CB & 0x7FF7);
        c.lllIIlll[34] = 0x83 ^ 0x91;
        c.lllIIlll[35] = 0x23 ^ 0x30;
        c.lllIIlll[36] = (0x2E ^ 0x1F) + (24 + 94 - 5 + 35) - -1 + 2;
        c.lllIIlll[37] = 127 + 44 - 31 + 16 ^ 97 + 106 - 104 + 37;
        c.lllIIlll[38] = 134 + 42 - 122 + 92 ^ 9 + 57 - 63 + 132;
        c.lllIIlll[39] = 0xB5 ^ 0x8C ^ (0xBE ^ 0x91);
    }

    private static boolean lIlllllIlll(Object object) {
        return object != null;
    }

    public String d(int n2) {
        String string;
        ItemComposition itemComposition = N.getItemComposition(n2);
        if (c.lIlllllIlll(itemComposition)) {
            string = itemComposition.getName();
            0;
            if (3 == 0) {
                return null;
            }
        } else {
            string = lllIIllI[lllIIlll[38]];
        }
        return string;
    }

    public static String c(int n2) {
        int lIlIIIIlIIllllI;
        if (c.lIlllllIllI(n2, lllIIlll[0])) {
            return lllIIllI[lllIIlll[1]];
        }
        if (c.lIlllllIllI(lIlIIIIlIIllllI, lllIIlll[2])) {
            return lllIIllI[lllIIlll[3]];
        }
        if (c.lIlllllIllI(lIlIIIIlIIllllI, lllIIlll[4])) {
            return lllIIllI[lllIIlll[5]];
        }
        if (c.lIlllllIllI(lIlIIIIlIIllllI, lllIIlll[6])) {
            return lllIIllI[lllIIlll[7]];
        }
        if (c.lIlllllIllI(lIlIIIIlIIllllI, lllIIlll[8])) {
            return lllIIllI[lllIIlll[9]];
        }
        if (c.lIlllllIllI(lIlIIIIlIIllllI, lllIIlll[2])) {
            return lllIIllI[lllIIlll[10]];
        }
        if (c.lIlllllIllI(lIlIIIIlIIllllI, lllIIlll[4])) {
            return lllIIllI[lllIIlll[11]];
        }
        if (c.lIlllllIllI(lIlIIIIlIIllllI, lllIIlll[6])) {
            return lllIIllI[lllIIlll[12]];
        }
        if (c.lIlllllIllI(lIlIIIIlIIllllI, lllIIlll[13])) {
            return lllIIllI[lllIIlll[14]];
        }
        if (c.lIlllllIllI(lIlIIIIlIIllllI, lllIIlll[15])) {
            return lllIIllI[lllIIlll[16]];
        }
        if (c.lIlllllIllI(lIlIIIIlIIllllI, lllIIlll[17])) {
            return lllIIllI[lllIIlll[18]];
        }
        if (c.lIlllllIllI(lIlIIIIlIIllllI, lllIIlll[19])) {
            return lllIIllI[lllIIlll[20]];
        }
        if (c.lIlllllIllI(lIlIIIIlIIllllI, lllIIlll[21])) {
            return lllIIllI[lllIIlll[22]];
        }
        if (c.lIlllllIllI(lIlIIIIlIIllllI, lllIIlll[23])) {
            return lllIIllI[lllIIlll[24]];
        }
        if (c.lIlllllIllI(lIlIIIIlIIllllI, lllIIlll[25])) {
            return lllIIllI[lllIIlll[26]];
        }
        if (c.lIlllllIllI(lIlIIIIlIIllllI, lllIIlll[27])) {
            return lllIIllI[lllIIlll[28]];
        }
        if (c.lIlllllIllI(lIlIIIIlIIllllI, lllIIlll[29])) {
            return lllIIllI[lllIIlll[30]];
        }
        if (c.lIlllllIllI(lIlIIIIlIIllllI, lllIIlll[31])) {
            return lllIIllI[lllIIlll[32]];
        }
        if (c.lIlllllIllI(lIlIIIIlIIllllI, lllIIlll[33])) {
            return lllIIllI[lllIIlll[34]];
        }
        String lIlIIIIlIIlllIl = "https://oldschool.runescape.wiki/w/Special:Lookup?type=item&id=" + lIlIIIIlIIllllI;
        try {
            URL lIlIIIIlIIlllII = new URL(lIlIIIIlIIlllIl);
            HttpURLConnection lIlIIIIlIIllIll = (HttpURLConnection)lIlIIIIlIIlllII.openConnection();
            lIlIIIIlIIllIll.setRequestMethod(lllIIllI[lllIIlll[35]]);
            int lIlIIIIlIIllIlI = lIlIIIIlIIllIll.getResponseCode();
            if (c.lIlllllIllI(lIlIIIIlIIllIlI, lllIIlll[36])) {
                String lIlIIIIlIIllIII;
                BufferedReader lIlIIIIlIIllIIl = new BufferedReader(new InputStreamReader(lIlIIIIlIIllIll.getInputStream()));
                StringBuilder lIlIIIIlIIlIlll = new StringBuilder();
                while (c.lIlllllIlll(lIlIIIIlIIllIII = lIlIIIIlIIllIIl.readLine())) {
                    lIlIIIIlIIlIlll.append(lIlIIIIlIIllIII);
                    0;
                    0;
                    if (3 != (4 ^ 0)) continue;
                    return null;
                }
                lIlIIIIlIIllIIl.close();
                String lIlIIIIlIIlIllI = c.b(String.valueOf(lIlIIIIlIIlIlll));
                return lIlIIIIlIIlIllI;
            }
            0;
        }
        catch (IOException lIlIIIIlIIlllII) {
            lIlIIIIlIIlllII.printStackTrace();
        }
        if (1 == 0) {
            return null;
        }
        return null;
    }

    private static String lIlllllIIIl(String lIlIIIIIlIllllI, String lIlIIIIIllIIIlI) {
        lIlIIIIIlIllllI = new String(Base64.getDecoder().decode(lIlIIIIIlIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIIIIIllIIIIl = new StringBuilder();
        char[] lIlIIIIIllIIIII = lIlIIIIIllIIIlI.toCharArray();
        int lIlIIIIIlIlllll = lllIIlll[1];
        char[] lIlIIIIIlIllIIl = lIlIIIIIlIllllI.toCharArray();
        int lIlIIIIIlIllIII = lIlIIIIIlIllIIl.length;
        int lIlIIIIIlIlIlll = lllIIlll[1];
        while (c.lIllllllIIl(lIlIIIIIlIlIlll, lIlIIIIIlIllIII)) {
            char lIlIIIIIllIIlII = lIlIIIIIlIllIIl[lIlIIIIIlIlIlll];
            lIlIIIIIllIIIIl.append((char)(lIlIIIIIllIIlII ^ lIlIIIIIllIIIII[lIlIIIIIlIlllll % lIlIIIIIllIIIII.length]));
            0;
            ++lIlIIIIIlIlllll;
            ++lIlIIIIIlIlIlll;
            0;
            if (((0x98 ^ 0x8D) & ~(0x4B ^ 0x5E)) == 0) continue;
            return null;
        }
        return String.valueOf(lIlIIIIIllIIIIl);
    }

    private static String b(String string) {
        String string2 = null;
        String string3 = lllIIllI[lllIIlll[37]];
        Pattern pattern = Pattern.compile(string3);
        Matcher matcher = pattern.matcher(string);
        if (c.lIllllllIII(matcher.find() ? 1 : 0)) {
            string2 = matcher.group(lllIIlll[3]);
        }
        return string2;
    }

    private static String lIlllllIIII(String lIlIIIIIlllIIIl, String lIlIIIIIlllIIII) {
        try {
            SecretKeySpec lIlIIIIIlllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIIIIlllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIIIIIlllIlIl = Cipher.getInstance("Blowfish");
            lIlIIIIIlllIlIl.init(lllIIlll[5], lIlIIIIIlllIllI);
            return new String(lIlIIIIIlllIlIl.doFinal(Base64.getDecoder().decode(lIlIIIIIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIIIIlllIlII) {
            lIlIIIIIlllIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllllIIl(int n2, int n3) {
        return n2 < n3;
    }
}

