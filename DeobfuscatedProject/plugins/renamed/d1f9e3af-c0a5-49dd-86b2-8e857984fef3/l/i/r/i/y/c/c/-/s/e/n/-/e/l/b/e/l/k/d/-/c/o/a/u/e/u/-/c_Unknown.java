/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.ItemComposition
 *  net.runelite.client.game.ItemManager
 */
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

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
    private static /* synthetic */ String[] lIllIIIIl;
    private static /* synthetic */ int[] lIllIIIlI;

    private static boolean lIIlIlIlIIlI(int n2, int n3) {
        return n2 == n3;
    }

    public static String c(int n2) {
        int llIllllIlIlIlI;
        if (c.lIIlIlIlIIlI(n2, lIllIIIlI[0])) {
            return lIllIIIIl[lIllIIIlI[1]];
        }
        if (c.lIIlIlIlIIlI(llIllllIlIlIlI, lIllIIIlI[2])) {
            return lIllIIIIl[lIllIIIlI[3]];
        }
        if (c.lIIlIlIlIIlI(llIllllIlIlIlI, lIllIIIlI[4])) {
            return lIllIIIIl[lIllIIIlI[5]];
        }
        if (c.lIIlIlIlIIlI(llIllllIlIlIlI, lIllIIIlI[6])) {
            return lIllIIIIl[lIllIIIlI[7]];
        }
        if (c.lIIlIlIlIIlI(llIllllIlIlIlI, lIllIIIlI[8])) {
            return lIllIIIIl[lIllIIIlI[9]];
        }
        if (c.lIIlIlIlIIlI(llIllllIlIlIlI, lIllIIIlI[2])) {
            return lIllIIIIl[lIllIIIlI[10]];
        }
        if (c.lIIlIlIlIIlI(llIllllIlIlIlI, lIllIIIlI[4])) {
            return lIllIIIIl[lIllIIIlI[11]];
        }
        if (c.lIIlIlIlIIlI(llIllllIlIlIlI, lIllIIIlI[6])) {
            return lIllIIIIl[lIllIIIlI[12]];
        }
        if (c.lIIlIlIlIIlI(llIllllIlIlIlI, lIllIIIlI[13])) {
            return lIllIIIIl[lIllIIIlI[14]];
        }
        if (c.lIIlIlIlIIlI(llIllllIlIlIlI, lIllIIIlI[15])) {
            return lIllIIIIl[lIllIIIlI[16]];
        }
        if (c.lIIlIlIlIIlI(llIllllIlIlIlI, lIllIIIlI[17])) {
            return lIllIIIIl[lIllIIIlI[18]];
        }
        if (c.lIIlIlIlIIlI(llIllllIlIlIlI, lIllIIIlI[19])) {
            return lIllIIIIl[lIllIIIlI[20]];
        }
        if (c.lIIlIlIlIIlI(llIllllIlIlIlI, lIllIIIlI[21])) {
            return lIllIIIIl[lIllIIIlI[22]];
        }
        if (c.lIIlIlIlIIlI(llIllllIlIlIlI, lIllIIIlI[23])) {
            return lIllIIIIl[lIllIIIlI[24]];
        }
        if (c.lIIlIlIlIIlI(llIllllIlIlIlI, lIllIIIlI[25])) {
            return lIllIIIIl[lIllIIIlI[26]];
        }
        if (c.lIIlIlIlIIlI(llIllllIlIlIlI, lIllIIIlI[27])) {
            return lIllIIIIl[lIllIIIlI[28]];
        }
        if (c.lIIlIlIlIIlI(llIllllIlIlIlI, lIllIIIlI[29])) {
            return lIllIIIIl[lIllIIIlI[30]];
        }
        if (c.lIIlIlIlIIlI(llIllllIlIlIlI, lIllIIIlI[31])) {
            return lIllIIIIl[lIllIIIlI[32]];
        }
        if (c.lIIlIlIlIIlI(llIllllIlIlIlI, lIllIIIlI[33])) {
            return lIllIIIIl[lIllIIIlI[34]];
        }
        String llIllllIlIlIIl = "https://oldschool.runescape.wiki/w/Special:Lookup?type=item&id=" + llIllllIlIlIlI;
        try {
            URL llIllllIlIlIII = new URL(llIllllIlIlIIl);
            HttpURLConnection llIllllIlIIlll = (HttpURLConnection)llIllllIlIlIII.openConnection();
            llIllllIlIIlll.setRequestMethod(lIllIIIIl[lIllIIIlI[35]]);
            int llIllllIlIIllI = llIllllIlIIlll.getResponseCode();
            if (c.lIIlIlIlIIlI(llIllllIlIIllI, lIllIIIlI[36])) {
                String llIllllIlIIlII;
                BufferedReader llIllllIlIIlIl = new BufferedReader(new InputStreamReader(llIllllIlIIlll.getInputStream()));
                StringBuilder llIllllIlIIIll = new StringBuilder();
                while (c.lIIlIlIlIIll(llIllllIlIIlII = llIllllIlIIlIl.readLine())) {
                    llIllllIlIIIll.append(llIllllIlIIlII);
                    0;
                    0;
                    if (((0xD7 ^ 0x87) & ~(0x3B ^ 0x6B)) == 0) continue;
                    return null;
                }
                llIllllIlIIlIl.close();
                String llIllllIlIIIlI = c.b(String.valueOf(llIllllIlIIIll));
                return llIllllIlIIIlI;
            }
            0;
        }
        catch (IOException llIllllIlIlIII) {
            llIllllIlIlIII.printStackTrace();
        }
        if (2 >= 3) {
            return null;
        }
        return null;
    }

    private static String lIIlIlIIlllI(String llIlllIllIllll, String llIlllIllIlIIl) {
        llIlllIllIllll = new String(Base64.getDecoder().decode(llIlllIllIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlllIllIllIl = new StringBuilder();
        char[] llIlllIllIllII = llIlllIllIlIIl.toCharArray();
        int llIlllIllIlIll = lIllIIIlI[1];
        char[] llIlllIllIIlIl = llIlllIllIllll.toCharArray();
        int llIlllIllIIlII = llIlllIllIIlIl.length;
        int llIlllIllIIIll = lIllIIIlI[1];
        while (c.lIIlIlIlIlIl(llIlllIllIIIll, llIlllIllIIlII)) {
            char llIlllIlllIIII = llIlllIllIIlIl[llIlllIllIIIll];
            llIlllIllIllIl.append((char)(llIlllIlllIIII ^ llIlllIllIllII[llIlllIllIlIll % llIlllIllIllII.length]));
            0;
            ++llIlllIllIlIll;
            ++llIlllIllIIIll;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(llIlllIllIllIl);
    }

    public String d(int n2) {
        String string;
        ItemComposition itemComposition = N.getItemComposition(n2);
        if (c.lIIlIlIlIIll(itemComposition)) {
            string = itemComposition.getName();
            0;
            if ((0xA9 ^ 0xAC) == 0) {
                return null;
            }
        } else {
            string = lIllIIIIl[lIllIIIlI[38]];
        }
        return string;
    }

    private static boolean lIIlIlIlIIll(Object object) {
        return object != null;
    }

    private static String lIIlIlIIllll(String llIlllIlllllll, String llIlllIlllllII) {
        try {
            SecretKeySpec llIllllIIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlllIlllllII.getBytes(StandardCharsets.UTF_8)), lIllIIIlI[14]), "DES");
            Cipher llIllllIIIIIIl = Cipher.getInstance("DES");
            llIllllIIIIIIl.init(lIllIIIlI[5], llIllllIIIIIlI);
            return new String(llIllllIIIIIIl.doFinal(Base64.getDecoder().decode(llIlllIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIllllIIIIIII) {
            llIllllIIIIIII.printStackTrace();
            return null;
        }
    }

    private static String b(String string) {
        String string2 = null;
        String string3 = lIllIIIIl[lIllIIIlI[37]];
        Pattern pattern = Pattern.compile(string3);
        Matcher matcher = pattern.matcher(string);
        if (c.lIIlIlIlIlII(matcher.find() ? 1 : 0)) {
            string2 = matcher.group(lIllIIIlI[3]);
        }
        return string2;
    }

    static {
        c.lIIlIlIlIIIl();
        c.lIIlIlIlIIII();
    }

    private static void lIIlIlIlIIIl() {
        lIllIIIlI = new int[40];
        c.lIllIIIlI[0] = 0xFFFFFEDD & 0x2FEE;
        c.lIllIIIlI[1] = (0x7B ^ 0x22 ^ (0x81 ^ 0x85)) & (179 + 7 - 38 + 44 ^ 11 + 56 - -78 + 12 ^ -1);
        c.lIllIIIlI[2] = -(0xFFFFFA55 & 0x75BB) & (0xFFFFF6FF & Short.MAX_VALUE);
        c.lIllIIIlI[3] = 1;
        c.lIllIIIlI[4] = -(0xFFFFEFDB & 0x7D25) & (0xFFFFFFB7 & 0x6F79);
        c.lIllIIIlI[5] = 2;
        c.lIllIIIlI[6] = 0xB0 ^ 0x8E;
        c.lIllIIIlI[7] = 3;
        c.lIllIIIlI[8] = 0xFFFFBAF5 & 0x776E;
        c.lIllIIIlI[9] = 0x45 ^ 0x41;
        c.lIllIIIlI[10] = 0xE ^ 0xB;
        c.lIllIIIlI[11] = 0x36 ^ 0x27 ^ (0x21 ^ 0x36);
        c.lIllIIIlI[12] = 0x76 ^ 0x33 ^ (0xE1 ^ 0xA3);
        c.lIllIIIlI[13] = -(0xFFFFEDF6 & 0x7A7B) & (0xFFFFEFFF & 0x7A7F);
        c.lIllIIIlI[14] = 0x5E ^ 0x56;
        c.lIllIIIlI[15] = 0xFFFFCFFB & 0x35ED;
        c.lIllIIIlI[16] = 32 + 50 - 53 + 118 ^ 73 + 18 - 42 + 105;
        c.lIllIIIlI[17] = -(0xFFFFF797 & 0x79EF) & (0xFFFFFDE7 & 0x7FBF);
        c.lIllIIIlI[18] = 0x71 ^ 0x32 ^ (0x33 ^ 0x7A);
        c.lIllIIIlI[19] = -(0xFFFFEFC3 & 0x5A3D) & (0xFFFFEFF7 & 0x5FFB);
        c.lIllIIIlI[20] = 0xCF ^ 0x89 ^ (0xE2 ^ 0xAF);
        c.lIllIIIlI[21] = -(0xFFFFEAAD & 0x777F) & (0xFFFFEFFD & 0x733F);
        c.lIllIIIlI[22] = 2 + 66 - 37 + 101 ^ 30 + 18 - 18 + 106;
        c.lIllIIIlI[23] = -(0xFFFFED89 & 0x527F) & (0xFFFFFF6F & 0x5FDF);
        c.lIllIIIlI[24] = 0x3F ^ 0x32;
        c.lIllIIIlI[25] = 0xFFFFFFDF & 0x1F69;
        c.lIllIIIlI[26] = 32 + 140 - 1 + 9 ^ 148 + 99 - 132 + 71;
        c.lIllIIIlI[27] = 0xFFFFBFDF & 0x5F6A;
        c.lIllIIIlI[28] = 0x8D ^ 0x82;
        c.lIllIIIlI[29] = 0xFFFFDF4B & 0x3FFF;
        c.lIllIIIlI[30] = 0xAB ^ 0x8D ^ (0x50 ^ 0x66);
        c.lIllIIIlI[31] = -(0xFFFFFA47 & 0x37B9) & (0xFFFFFEF7 & 0x7FAF);
        c.lIllIIIlI[32] = 0x2F ^ 0x57 ^ (0xFB ^ 0x92);
        c.lIllIIIlI[33] = -(0xFFFFB8B5 & 0x675B) & (0xFFFFFFDB & 0x27F5);
        c.lIllIIIlI[34] = 0xB0 ^ 0xA2;
        c.lIllIIIlI[35] = 15 + 118 - 132 + 153 ^ 129 + 48 - 130 + 90;
        c.lIllIIIlI[36] = 36 + 173 - 90 + 81;
        c.lIllIIIlI[37] = 0x85 ^ 0x91;
        c.lIllIIIlI[38] = 0x50 ^ 0x16 ^ (0x67 ^ 0x34);
        c.lIllIIIlI[39] = 0xF9 ^ 0x99 ^ (0x20 ^ 0x56);
    }

    public c(ItemManager itemManager) {
        0;
        N = itemManager;
    }

    private static void lIIlIlIlIIII() {
        lIllIIIIl = new String[lIllIIIlI[39]];
        c.lIllIIIIl[c.lIllIIIlI[1]] = c."Ring of wealth (5)";
        c.lIllIIIIl[c.lIllIIIlI[3]] = c."Molten glass";
        c.lIllIIIIl[c.lIllIIIlI[5]] = c."Nature rune";
        c.lIllIIIIl[c.lIllIIIlI[7]] = c."Maple longbow (u)";
        c.lIllIIIIl[c.lIllIIIlI[9]] = c."Uncharged toxic trident";
        c.lIllIIIIl[c.lIllIIIlI[10]] = c."Molten glass";
        c.lIllIIIIl[c.lIllIIIlI[11]] = c."Nature rune";
        c.lIllIIIIl[c.lIllIIIlI[12]] = c."Maple longbow (u)";
        c.lIllIIIIl[c.lIllIIIlI[14]] = c."Bones";
        c.lIllIIIIl[c.lIllIIIlI[16]] = c."Magic logs";
        c.lIllIIIIl[c.lIllIIIlI[18]] = c."Climbing boots";
        c.lIllIIIIl[c.lIllIIIlI[20]] = c."Lockpick";
        c.lIllIIIIl[c.lIllIIIlI[22]] = c."Poison";
        c.lIllIIIIl[c.lIllIIIlI[24]] = c."Varrock teleport";
        c.lIllIIIIl[c.lIllIIIlI[26]] = c."Falador teleport";
        c.lIllIIIIl[c.lIllIIIlI[28]] = c."Camelot teleport";
        c.lIllIIIIl[c.lIllIIIlI[30]] = c."Ardougne teleport";
        c.lIllIIIIl[c.lIllIIIlI[32]] = c."West ardougne teleport";
        c.lIllIIIIl[c.lIllIIIlI[34]] = c."Cheese";
        c.lIllIIIIl[c.lIllIIIlI[35]] = c."GET";
        c.lIllIIIIl[c.lIllIIIlI[37]] = c."<title>(.*?) - OSRS Wiki</title>";
        c.lIllIIIIl[c.lIllIIIlI[38]] = c."Unknown Item";
    }

    private static String lIIlIlIIllIl(String llIllllIIIlIlI, String llIllllIIIlIll) {
        try {
            SecretKeySpec llIllllIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllllIIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIllllIIIlllI = Cipher.getInstance("Blowfish");
            llIllllIIIlllI.init(lIllIIIlI[5], llIllllIIIllll);
            return new String(llIllllIIIlllI.doFinal(Base64.getDecoder().decode(llIllllIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIllllIIIllIl) {
            llIllllIIIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIlIlIlII(int n2) {
        return n2 != 0;
    }
}

