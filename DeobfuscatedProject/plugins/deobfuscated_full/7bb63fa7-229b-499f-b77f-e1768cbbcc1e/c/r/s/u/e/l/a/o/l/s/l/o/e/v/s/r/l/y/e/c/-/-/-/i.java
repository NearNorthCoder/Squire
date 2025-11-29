/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.ItemComposition
 *  net.runelite.client.game.ItemManager
 */
package c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-;

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

public class i {
    private static /* synthetic */ String[] llIIl;
    private static /* synthetic */ int[] llIlI;
    private static /* synthetic */ ItemManager ag;

    private static boolean lIIIIIlI(Object object) {
        return object != null;
    }

    private static boolean lIIIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void llllllI() {
        llIIl = new String[llIlI[35]];
        i.llIIl[i.llIlI[1]] = i."Ring of wealth (5)";
        i.llIIl[i.llIlI[3]] = i."Molten glass";
        i.llIIl[i.llIlI[5]] = i."Nature rune";
        i.llIIl[i.llIlI[7]] = i."Maple longbow (u)";
        i.llIIl[i.llIlI[9]] = i."Uncharged toxic trident";
        i.llIIl[i.llIlI[10]] = i."Molten glass";
        i.llIIl[i.llIlI[12]] = i."Bones";
        i.llIIl[i.llIlI[14]] = i."Magic logs";
        i.llIIl[i.llIlI[16]] = i."Climbing boots";
        i.llIIl[i.llIlI[18]] = i."Lockpick";
        i.llIIl[i.llIlI[20]] = i."Poison";
        i.llIIl[i.llIlI[22]] = i."Varrock teleport";
        i.llIIl[i.llIlI[24]] = i."Falador teleport";
        i.llIIl[i.llIlI[26]] = i."Camelot teleport";
        i.llIIl[i.llIlI[28]] = i."Ardougne teleport";
        i.llIIl[i.llIlI[30]] = i."West ardougne teleport";
        i.llIIl[i.llIlI[31]] = i."GET";
        i.llIIl[i.llIlI[33]] = i."<title>(.*?) - OSRS Wiki</title>";
        i.llIIl[i.llIlI[34]] = i."Unknown Item";
    }

    public static String a(int n2) {
        int llllIlllIlllIll;
        if (i.lIIIIIIl(n2, llIlI[0])) {
            return llIIl[llIlI[1]];
        }
        if (i.lIIIIIIl(llllIlllIlllIll, llIlI[2])) {
            return llIIl[llIlI[3]];
        }
        if (i.lIIIIIIl(llllIlllIlllIll, llIlI[4])) {
            return llIIl[llIlI[5]];
        }
        if (i.lIIIIIIl(llllIlllIlllIll, llIlI[6])) {
            return llIIl[llIlI[7]];
        }
        if (i.lIIIIIIl(llllIlllIlllIll, llIlI[8])) {
            return llIIl[llIlI[9]];
        }
        if (i.lIIIIIIl(llllIlllIlllIll, llIlI[2])) {
            return llIIl[llIlI[10]];
        }
        if (i.lIIIIIIl(llllIlllIlllIll, llIlI[11])) {
            return llIIl[llIlI[12]];
        }
        if (i.lIIIIIIl(llllIlllIlllIll, llIlI[13])) {
            return llIIl[llIlI[14]];
        }
        if (i.lIIIIIIl(llllIlllIlllIll, llIlI[15])) {
            return llIIl[llIlI[16]];
        }
        if (i.lIIIIIIl(llllIlllIlllIll, llIlI[17])) {
            return llIIl[llIlI[18]];
        }
        if (i.lIIIIIIl(llllIlllIlllIll, llIlI[19])) {
            return llIIl[llIlI[20]];
        }
        if (i.lIIIIIIl(llllIlllIlllIll, llIlI[21])) {
            return llIIl[llIlI[22]];
        }
        if (i.lIIIIIIl(llllIlllIlllIll, llIlI[23])) {
            return llIIl[llIlI[24]];
        }
        if (i.lIIIIIIl(llllIlllIlllIll, llIlI[25])) {
            return llIIl[llIlI[26]];
        }
        if (i.lIIIIIIl(llllIlllIlllIll, llIlI[27])) {
            return llIIl[llIlI[28]];
        }
        if (i.lIIIIIIl(llllIlllIlllIll, llIlI[29])) {
            return llIIl[llIlI[30]];
        }
        String llllIlllIlllIlI = "https://oldschool.runescape.wiki/w/Special:Lookup?type=item&id=" + llllIlllIlllIll;
        try {
            URL llllIlllIlllIIl = new URL(llllIlllIlllIlI);
            HttpURLConnection llllIlllIlllIII = (HttpURLConnection)llllIlllIlllIIl.openConnection();
            llllIlllIlllIII.setRequestMethod(llIIl[llIlI[31]]);
            int llllIlllIllIlll = llllIlllIlllIII.getResponseCode();
            if (i.lIIIIIIl(llllIlllIllIlll, llIlI[32])) {
                String llllIlllIllIlIl;
                BufferedReader llllIlllIllIllI = new BufferedReader(new InputStreamReader(llllIlllIlllIII.getInputStream()));
                StringBuilder llllIlllIllIlII = new StringBuilder();
                while (i.lIIIIIlI(llllIlllIllIlIl = llllIlllIllIllI.readLine())) {
                    llllIlllIllIlII.append(llllIlllIllIlIl);
                    0;
                    0;
                    if (2 >= 0) continue;
                    return null;
                }
                llllIlllIllIllI.close();
                String llllIlllIllIIll = i.c(String.valueOf(llllIlllIllIlII));
                return llllIlllIllIIll;
            }
            0;
        }
        catch (IOException llllIlllIlllIIl) {
            llllIlllIlllIIl.printStackTrace();
        }
        if (2 <= 0) {
            return null;
        }
        return null;
    }

    private static String c(String string) {
        String string2 = null;
        String string3 = llIIl[llIlI[33]];
        Pattern pattern = Pattern.compile(string3);
        Matcher matcher = pattern.matcher(string);
        if (i.lIIIIIll(matcher.find() ? 1 : 0)) {
            string2 = matcher.group(llIlI[3]);
        }
        return string2;
    }

    static {
        i.lIIIIIII();
        i.llllllI();
    }

    private static String lllllIl(String llllIlllIIlllIl, String llllIlllIIlllII) {
        try {
            SecretKeySpec llllIlllIlIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIlllIIlllII.getBytes(StandardCharsets.UTF_8)), llIlI[16]), "DES");
            Cipher llllIlllIIlllll = Cipher.getInstance("DES");
            llllIlllIIlllll.init(llIlI[5], llllIlllIlIIIII);
            return new String(llllIlllIIlllll.doFinal(Base64.getDecoder().decode(llllIlllIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIlllIIllllI) {
            llllIlllIIllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIIIII() {
        llIlI = new int[36];
        i.llIlI[0] = -(0xFFFFDD17 & 0x63EB) & (0xFFFFFFDE & 0x6FEF);
        i.llIlI[1] = (139 + 99 - 48 + 14 ^ 135 + 119 - 237 + 134) & (0x58 ^ 0x48 ^ (0xB ^ 0x40) ^ -1);
        i.llIlI[2] = -(0xFFFFF90D & 0x77F3) & (0xFFFFF7EF & Short.MAX_VALUE);
        i.llIlI[3] = 1;
        i.llIlI[4] = -(0xFFFFFF5D & 0x5DAF) & (0xFFFFFF7D & 0x5FBF);
        i.llIlI[5] = 2;
        i.llIlI[6] = 0xF ^ 0x31;
        i.llIlI[7] = 3;
        i.llIlI[8] = 0xFFFFBEE5 & 0x737E;
        i.llIlI[9] = 0xD6 ^ 0x92 ^ (0x5F ^ 0x1F);
        i.llIlI[10] = 0x78 ^ 0x7D;
        i.llIlI[11] = 0xFFFF93FE & 0x6E0F;
        i.llIlI[12] = 0x4C ^ 0x4A;
        i.llIlI[13] = 0xFFFF97F9 & 0x6DEF;
        i.llIlI[14] = 0x68 ^ 0x6F;
        i.llIlI[15] = -(0xFFFFEFFF & 0x73CF) & (0xFFFFFFFF & 0x6FEF);
        i.llIlI[16] = 0x89 ^ 0x81;
        i.llIlI[17] = 0xFFFFD7F7 & 0x2DFB;
        i.llIlI[18] = 0x7D ^ 0x43 ^ (0xA6 ^ 0x91);
        i.llIlI[19] = -(0xFFFFFCFF & 0x5FED) & (0xFFFFDDFF & 0x7FFD);
        i.llIlI[20] = 0xBC ^ 0xB6;
        i.llIlI[21] = -(0xFFFFE19B & 0x5EFD) & (0xFFFFDFDF & Short.MAX_VALUE);
        i.llIlI[22] = 46 + 102 - 110 + 89 ^ (0xEC ^ 0x98);
        i.llIlI[23] = 0xFFFFBF6B & 0x5FDD;
        i.llIlI[24] = 0x30 ^ 0x3C;
        i.llIlI[25] = 0xFFFF9F6E & 0x7FDB;
        i.llIlI[26] = 0x53 ^ 0x5E;
        i.llIlI[27] = -(0xFFFFEBB1 & 0x74FF) & (0xFFFFFFFB & Short.MAX_VALUE);
        i.llIlI[28] = 0x2A ^ 0x24;
        i.llIlI[29] = 0xFFFFEEAF & 0x5DF7;
        i.llIlI[30] = 0x6E ^ 0x61;
        i.llIlI[31] = 80 + 107 - 146 + 104 ^ 91 + 123 - 211 + 126;
        i.llIlI[32] = (0x71 ^ 0x5C) + (0x5C ^ 0x77) - -(0x27 ^ 0x1A) + (0x5E ^ 0x6D);
        i.llIlI[33] = 0x18 ^ 9;
        i.llIlI[34] = 169 + 31 - 28 + 3 ^ 17 + 167 - 22 + 27;
        i.llIlI[35] = 0x5A ^ 0x49;
    }

    public i(ItemManager itemManager) {
        0;
        ag = itemManager;
    }

    private static String llllIll(String llllIlllIIIIIII, String llllIllIllllIlI) {
        llllIlllIIIIIII = new String(Base64.getDecoder().decode(llllIlllIIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllIllIllllllI = new StringBuilder();
        char[] llllIllIlllllIl = llllIllIllllIlI.toCharArray();
        int llllIllIlllllII = llIlI[1];
        char[] llllIllIlllIllI = llllIlllIIIIIII.toCharArray();
        int llllIllIlllIlIl = llllIllIlllIllI.length;
        int llllIllIlllIlII = llIlI[1];
        while (i.lIIIlIII(llllIllIlllIlII, llllIllIlllIlIl)) {
            char llllIlllIIIIIIl = llllIllIlllIllI[llllIllIlllIlII];
            llllIllIllllllI.append((char)(llllIlllIIIIIIl ^ llllIllIlllllIl[llllIllIlllllII % llllIllIlllllIl.length]));
            0;
            ++llllIllIlllllII;
            ++llllIllIlllIlII;
            0;
            if (((152 + 178 - 290 + 163 ^ 57 + 142 - 122 + 119) & (0x75 ^ 0x5A ^ (0xB3 ^ 0x93) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(llllIllIllllllI);
    }

    public String b(int n2) {
        String string;
        ItemComposition itemComposition = ag.getItemComposition(n2);
        if (i.lIIIIIlI(itemComposition)) {
            string = itemComposition.getName();
            0;
            if (((0x51 ^ 0x66 ^ (0xDD ^ 0xA8)) & (0x97 ^ 0xB7 ^ (0x7C ^ 0x1E) ^ -1)) < 0) {
                return null;
            }
        } else {
            string = llIIl[llIlI[34]];
        }
        return string;
    }

    private static String lllllII(String llllIlllIIIlllI, String llllIlllIIIllIl) {
        try {
            SecretKeySpec llllIlllIIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIlllIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllIlllIIlIIlI = Cipher.getInstance("Blowfish");
            llllIlllIIlIIlI.init(llIlI[5], llllIlllIIlIIll);
            return new String(llllIlllIIlIIlI.doFinal(Base64.getDecoder().decode(llllIlllIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIlllIIlIIIl) {
            llllIlllIIlIIIl.printStackTrace();
            return null;
        }
    }
}

