/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.ItemComposition
 *  net.runelite.client.game.ItemManager
 */
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

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
    private static /* synthetic */ int[] lIIIIIIlIIl;
    private static /* synthetic */ ItemManager M;
    private static /* synthetic */ String[] lIIIIIIlIII;

    private static boolean llIllIlllIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIllIlllIlII(Object object) {
        return object != null;
    }

    static {
        c.llIllIlllIIlI();
        c.llIllIlllIIIl();
    }

    private static String llIllIllIllll(String lllllllllllllllllIIlllllIIlIIlII, String lllllllllllllllllIIlllllIIlIIlIl) {
        try {
            SecretKeySpec lllllllllllllllllIIlllllIIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIIlllllIIlIIlIl.getBytes(StandardCharsets.UTF_8)), lIIIIIIlIIl[16]), "DES");
            Cipher lllllllllllllllllIIlllllIIlIlIII = Cipher.getInstance("DES");
            lllllllllllllllllIIlllllIIlIlIII.init(lIIIIIIlIIl[5], lllllllllllllllllIIlllllIIlIlIIl);
            return new String(lllllllllllllllllIIlllllIIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIIlllllIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIIlllllIIlIIlll) {
            lllllllllllllllllIIlllllIIlIIlll.printStackTrace();
            return null;
        }
    }

    private static void llIllIlllIIIl() {
        lIIIIIIlIII = new String[lIIIIIIlIIl[37]];
        c.lIIIIIIlIII[c.lIIIIIIlIIl[1]] = c."Ring of wealth (5)";
        c.lIIIIIIlIII[c.lIIIIIIlIIl[3]] = c."Molten glass";
        c.lIIIIIIlIII[c.lIIIIIIlIIl[5]] = c."Nature rune";
        c.lIIIIIIlIII[c.lIIIIIIlIIl[7]] = c."Maple longbow (u)";
        c.lIIIIIIlIII[c.lIIIIIIlIIl[9]] = c."Uncharged toxic trident";
        c.lIIIIIIlIII[c.lIIIIIIlIIl[10]] = c."Molten glass";
        c.lIIIIIIlIII[c.lIIIIIIlIIl[12]] = c."Bones";
        c.lIIIIIIlIII[c.lIIIIIIlIIl[14]] = c."Magic logs";
        c.lIIIIIIlIII[c.lIIIIIIlIIl[16]] = c."Climbing boots";
        c.lIIIIIIlIII[c.lIIIIIIlIIl[18]] = c."Lockpick";
        c.lIIIIIIlIII[c.lIIIIIIlIIl[20]] = c."Poison";
        c.lIIIIIIlIII[c.lIIIIIIlIIl[22]] = c."Varrock teleport";
        c.lIIIIIIlIII[c.lIIIIIIlIIl[24]] = c."Falador teleport";
        c.lIIIIIIlIII[c.lIIIIIIlIIl[26]] = c."Camelot teleport";
        c.lIIIIIIlIII[c.lIIIIIIlIIl[28]] = c."Ardougne teleport";
        c.lIIIIIIlIII[c.lIIIIIIlIIl[30]] = c."West ardougne teleport";
        c.lIIIIIIlIII[c.lIIIIIIlIIl[32]] = c."Cheese";
        c.lIIIIIIlIII[c.lIIIIIIlIIl[33]] = c."GET";
        c.lIIIIIIlIII[c.lIIIIIIlIIl[35]] = c."<title>(.*?) - OSRS Wiki</title>";
        c.lIIIIIIlIII[c.lIIIIIIlIIl[36]] = c."Unknown Item";
    }

    private static boolean llIllIlllIlIl(int n2) {
        return n2 != 0;
    }

    private static void llIllIlllIIlI() {
        lIIIIIIlIIl = new int[38];
        c.lIIIIIIlIIl[0] = -(0xFFFFFA33 & 0x55EF) & (0xFFFFFEFE & 0x7FEF);
        c.lIIIIIIlIIl[1] = (0x83 ^ 0xAE) & ~(0xBD ^ 0x90);
        c.lIIIIIIlIIl[2] = -(0xFFFFF8D9 & 0x7F27) & (0xFFFFFEEF & Short.MAX_VALUE);
        c.lIIIIIIlIIl[3] = 1;
        c.lIIIIIIlIIl[4] = 0xFFFFDE7D & 0x23B3;
        c.lIIIIIIlIIl[5] = 2;
        c.lIIIIIIlIIl[6] = 0x34 ^ 0xA;
        c.lIIIIIIlIIl[7] = 3;
        c.lIIIIIIlIIl[8] = 0xFFFFBAFF & 0x7764;
        c.lIIIIIIlIIl[9] = 0x87 ^ 0x83;
        c.lIIIIIIlIIl[10] = 0x84 ^ 0x81;
        c.lIIIIIIlIIl[11] = 0xFFFFEF1F & 0x12EE;
        c.lIIIIIIlIIl[12] = 0xA1 ^ 0xA7;
        c.lIIIIIIlIIl[13] = 0xFFFF9DF9 & 0x67EF;
        c.lIIIIIIlIIl[14] = 0xE ^ 0x24 ^ (0xBA ^ 0x97);
        c.lIIIIIIlIIl[15] = 0xFFFF9C69 & 0x6FB7;
        c.lIIIIIIlIIl[16] = 0x67 ^ 0x6F;
        c.lIIIIIIlIIl[17] = 0xFFFFBFF7 & 0x45FB;
        c.lIIIIIIlIIl[18] = 0x6E ^ 0x67;
        c.lIIIIIIlIIl[19] = 0xFFFFF375 & 0xD9B;
        c.lIIIIIIlIIl[20] = 0xB9 ^ 0xC0 ^ (0x28 ^ 0x5B);
        c.lIIIIIIlIIl[21] = 0xFFFFBF67 & 0x5FDF;
        c.lIIIIIIlIIl[22] = 0x4D ^ 0x39 ^ 85 + 66 - 145 + 121;
        c.lIIIIIIlIIl[23] = 0xFFFFBF5D & 0x5FEB;
        c.lIIIIIIlIIl[24] = 0x3F ^ 0x33;
        c.lIIIIIIlIIl[25] = -(0xFFFFEE27 & 0x51DE) & (0xFFFFFF6F & 0x5FDF);
        c.lIIIIIIlIIl[26] = 106 + 42 - 111 + 114 ^ 3 + 153 - 5 + 3;
        c.lIIIIIIlIIl[27] = 0xFFFF9F4B & Short.MAX_VALUE;
        c.lIIIIIIlIIl[28] = 191 + 73 - 136 + 75 ^ 14 + 157 - 36 + 62;
        c.lIIIIIIlIIl[29] = 0xFFFFEFA7 & 0x5CFF;
        c.lIIIIIIlIIl[30] = 0xE1 ^ 0x85 ^ (0x3E ^ 0x55);
        c.lIIIIIIlIIl[31] = 0xFFFFAFC9 & 0x57F7;
        c.lIIIIIIlIIl[32] = 0xBD ^ 0xC7 ^ (0xD ^ 0x67);
        c.lIIIIIIlIIl[33] = 0 ^ 0x11;
        c.lIIIIIIlIIl[34] = 115 + 77 - 68 + 76;
        c.lIIIIIIlIIl[35] = 60 + 50 - -24 + 25 ^ 59 + 36 - -34 + 12;
        c.lIIIIIIlIIl[36] = 0x4D ^ 0 ^ (0xEF ^ 0xB1);
        c.lIIIIIIlIIl[37] = 0xF ^ 0x4B ^ (0xC2 ^ 0x92);
    }

    public static String c(int n2) {
        int lllllllllllllllllIIlllllIllIlIIl;
        if (c.llIllIlllIIll(n2, lIIIIIIlIIl[0])) {
            return lIIIIIIlIII[lIIIIIIlIIl[1]];
        }
        if (c.llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[2])) {
            return lIIIIIIlIII[lIIIIIIlIIl[3]];
        }
        if (c.llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[4])) {
            return lIIIIIIlIII[lIIIIIIlIIl[5]];
        }
        if (c.llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[6])) {
            return lIIIIIIlIII[lIIIIIIlIIl[7]];
        }
        if (c.llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[8])) {
            return lIIIIIIlIII[lIIIIIIlIIl[9]];
        }
        if (c.llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[2])) {
            return lIIIIIIlIII[lIIIIIIlIIl[10]];
        }
        if (c.llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[11])) {
            return lIIIIIIlIII[lIIIIIIlIIl[12]];
        }
        if (c.llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[13])) {
            return lIIIIIIlIII[lIIIIIIlIIl[14]];
        }
        if (c.llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[15])) {
            return lIIIIIIlIII[lIIIIIIlIIl[16]];
        }
        if (c.llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[17])) {
            return lIIIIIIlIII[lIIIIIIlIIl[18]];
        }
        if (c.llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[19])) {
            return lIIIIIIlIII[lIIIIIIlIIl[20]];
        }
        if (c.llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[21])) {
            return lIIIIIIlIII[lIIIIIIlIIl[22]];
        }
        if (c.llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[23])) {
            return lIIIIIIlIII[lIIIIIIlIIl[24]];
        }
        if (c.llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[25])) {
            return lIIIIIIlIII[lIIIIIIlIIl[26]];
        }
        if (c.llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[27])) {
            return lIIIIIIlIII[lIIIIIIlIIl[28]];
        }
        if (c.llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[29])) {
            return lIIIIIIlIII[lIIIIIIlIIl[30]];
        }
        if (c.llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[31])) {
            return lIIIIIIlIII[lIIIIIIlIIl[32]];
        }
        String lllllllllllllllllIIlllllIllIlIII = "https://oldschool.runescape.wiki/w/Special:Lookup?type=item&id=" + lllllllllllllllllIIlllllIllIlIIl;
        try {
            URL lllllllllllllllllIIlllllIllIIlll = new URL(lllllllllllllllllIIlllllIllIlIII);
            HttpURLConnection lllllllllllllllllIIlllllIllIIllI = (HttpURLConnection)lllllllllllllllllIIlllllIllIIlll.openConnection();
            lllllllllllllllllIIlllllIllIIllI.setRequestMethod(lIIIIIIlIII[lIIIIIIlIIl[33]]);
            int lllllllllllllllllIIlllllIllIIlIl = lllllllllllllllllIIlllllIllIIllI.getResponseCode();
            if (c.llIllIlllIIll(lllllllllllllllllIIlllllIllIIlIl, lIIIIIIlIIl[34])) {
                String lllllllllllllllllIIlllllIllIIIll;
                BufferedReader lllllllllllllllllIIlllllIllIIlII = new BufferedReader(new InputStreamReader(lllllllllllllllllIIlllllIllIIllI.getInputStream()));
                StringBuilder lllllllllllllllllIIlllllIllIIIlI = new StringBuilder();
                while (c.llIllIlllIlII(lllllllllllllllllIIlllllIllIIIll = lllllllllllllllllIIlllllIllIIlII.readLine())) {
                    lllllllllllllllllIIlllllIllIIIlI.append(lllllllllllllllllIIlllllIllIIIll);
                    0;
                    0;
                    if (3 == 3) continue;
                    return null;
                }
                lllllllllllllllllIIlllllIllIIlII.close();
                String lllllllllllllllllIIlllllIllIIIIl = c.b(String.valueOf(lllllllllllllllllIIlllllIllIIIlI));
                return lllllllllllllllllIIlllllIllIIIIl;
            }
            0;
        }
        catch (IOException lllllllllllllllllIIlllllIllIIlll) {
            lllllllllllllllllIIlllllIllIIlll.printStackTrace();
        }
        if (((0xBE ^ 0xA5) & ~(0xA4 ^ 0xBF)) > 1) {
            return null;
        }
        return null;
    }

    public String d(int n2) {
        String string;
        ItemComposition itemComposition = M.getItemComposition(n2);
        if (c.llIllIlllIlII(itemComposition)) {
            string = itemComposition.getName();
            0;
            if (((0xB1 ^ 0xAA) & ~(0x6C ^ 0x77)) > 0) {
                return null;
            }
        } else {
            string = lIIIIIIlIII[lIIIIIIlIIl[36]];
        }
        return string;
    }

    public c(ItemManager itemManager) {
        0;
        M = itemManager;
    }

    private static boolean llIllIlllIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static String b(String string) {
        String string2 = null;
        String string3 = lIIIIIIlIII[lIIIIIIlIIl[35]];
        Pattern pattern = Pattern.compile(string3);
        Matcher matcher = pattern.matcher(string);
        if (c.llIllIlllIlIl(matcher.find() ? 1 : 0)) {
            string2 = matcher.group(lIIIIIIlIIl[3]);
        }
        return string2;
    }

    private static String llIllIllIlllI(String lllllllllllllllllIIlllllIlIIlIIl, String lllllllllllllllllIIlllllIlIIlIII) {
        try {
            SecretKeySpec lllllllllllllllllIIlllllIlIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIIlllllIlIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIIlllllIlIIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllIIlllllIlIIllIl.init(lIIIIIIlIIl[5], lllllllllllllllllIIlllllIlIIlllI);
            return new String(lllllllllllllllllIIlllllIlIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIIlllllIlIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIIlllllIlIIllII) {
            lllllllllllllllllIIlllllIlIIllII.printStackTrace();
            return null;
        }
    }

    private static String llIllIlllIIII(String lllllllllllllllllIIlllllIIllIllI, String lllllllllllllllllIIlllllIIlllIlI) {
        lllllllllllllllllIIlllllIIllIllI = new String(Base64.getDecoder().decode(lllllllllllllllllIIlllllIIllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIIlllllIIlllIIl = new StringBuilder();
        char[] lllllllllllllllllIIlllllIIlllIII = lllllllllllllllllIIlllllIIlllIlI.toCharArray();
        int lllllllllllllllllIIlllllIIllIlll = lIIIIIIlIIl[1];
        char[] lllllllllllllllllIIlllllIIllIIIl = lllllllllllllllllIIlllllIIllIllI.toCharArray();
        int lllllllllllllllllIIlllllIIllIIII = lllllllllllllllllIIlllllIIllIIIl.length;
        int lllllllllllllllllIIlllllIIlIllll = lIIIIIIlIIl[1];
        while (c.llIllIlllIllI(lllllllllllllllllIIlllllIIlIllll, lllllllllllllllllIIlllllIIllIIII)) {
            char lllllllllllllllllIIlllllIIllllII = lllllllllllllllllIIlllllIIllIIIl[lllllllllllllllllIIlllllIIlIllll];
            lllllllllllllllllIIlllllIIlllIIl.append((char)(lllllllllllllllllIIlllllIIllllII ^ lllllllllllllllllIIlllllIIlllIII[lllllllllllllllllIIlllllIIllIlll % lllllllllllllllllIIlllllIIlllIII.length]));
            0;
            ++lllllllllllllllllIIlllllIIllIlll;
            ++lllllllllllllllllIIlllllIIlIllll;
            0;
            if (-(0x31 ^ 0x35) <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIIlllllIIlllIIl);
    }
}

