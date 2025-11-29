/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.ItemComposition
 *  net.runelite.client.game.ItemManager
 */
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

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
    private static /* synthetic */ ItemManager O;
    private static /* synthetic */ int[] lIIIIIIlll;
    private static /* synthetic */ String[] lIIIIIIllI;

    public c(ItemManager itemManager) {
        0;
        O = itemManager;
    }

    private static boolean llIlllIIIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIlllIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    public static String c(int n2) {
        int lIIlIIlIIIlII;
        if (c.llIlllIIIlII(n2, lIIIIIIlll[0])) {
            return lIIIIIIllI[lIIIIIIlll[1]];
        }
        if (c.llIlllIIIlII(lIIlIIlIIIlII, lIIIIIIlll[2])) {
            return lIIIIIIllI[lIIIIIIlll[3]];
        }
        if (c.llIlllIIIlII(lIIlIIlIIIlII, lIIIIIIlll[4])) {
            return lIIIIIIllI[lIIIIIIlll[5]];
        }
        if (c.llIlllIIIlII(lIIlIIlIIIlII, lIIIIIIlll[6])) {
            return lIIIIIIllI[lIIIIIIlll[7]];
        }
        if (c.llIlllIIIlII(lIIlIIlIIIlII, lIIIIIIlll[8])) {
            return lIIIIIIllI[lIIIIIIlll[9]];
        }
        if (c.llIlllIIIlII(lIIlIIlIIIlII, lIIIIIIlll[2])) {
            return lIIIIIIllI[lIIIIIIlll[10]];
        }
        if (c.llIlllIIIlII(lIIlIIlIIIlII, lIIIIIIlll[4])) {
            return lIIIIIIllI[lIIIIIIlll[11]];
        }
        if (c.llIlllIIIlII(lIIlIIlIIIlII, lIIIIIIlll[6])) {
            return lIIIIIIllI[lIIIIIIlll[12]];
        }
        if (c.llIlllIIIlII(lIIlIIlIIIlII, lIIIIIIlll[13])) {
            return lIIIIIIllI[lIIIIIIlll[14]];
        }
        if (c.llIlllIIIlII(lIIlIIlIIIlII, lIIIIIIlll[15])) {
            return lIIIIIIllI[lIIIIIIlll[16]];
        }
        if (c.llIlllIIIlII(lIIlIIlIIIlII, lIIIIIIlll[17])) {
            return lIIIIIIllI[lIIIIIIlll[18]];
        }
        if (c.llIlllIIIlII(lIIlIIlIIIlII, lIIIIIIlll[19])) {
            return lIIIIIIllI[lIIIIIIlll[20]];
        }
        if (c.llIlllIIIlII(lIIlIIlIIIlII, lIIIIIIlll[21])) {
            return lIIIIIIllI[lIIIIIIlll[22]];
        }
        if (c.llIlllIIIlII(lIIlIIlIIIlII, lIIIIIIlll[23])) {
            return lIIIIIIllI[lIIIIIIlll[24]];
        }
        if (c.llIlllIIIlII(lIIlIIlIIIlII, lIIIIIIlll[25])) {
            return lIIIIIIllI[lIIIIIIlll[26]];
        }
        if (c.llIlllIIIlII(lIIlIIlIIIlII, lIIIIIIlll[27])) {
            return lIIIIIIllI[lIIIIIIlll[28]];
        }
        if (c.llIlllIIIlII(lIIlIIlIIIlII, lIIIIIIlll[29])) {
            return lIIIIIIllI[lIIIIIIlll[30]];
        }
        if (c.llIlllIIIlII(lIIlIIlIIIlII, lIIIIIIlll[31])) {
            return lIIIIIIllI[lIIIIIIlll[32]];
        }
        if (c.llIlllIIIlII(lIIlIIlIIIlII, lIIIIIIlll[33])) {
            return lIIIIIIllI[lIIIIIIlll[34]];
        }
        String lIIlIIlIIIIll = "https://oldschool.runescape.wiki/w/Special:Lookup?type=item&id=" + lIIlIIlIIIlII;
        try {
            URL lIIlIIlIIIIlI = new URL(lIIlIIlIIIIll);
            HttpURLConnection lIIlIIlIIIIIl = (HttpURLConnection)lIIlIIlIIIIlI.openConnection();
            lIIlIIlIIIIIl.setRequestMethod(lIIIIIIllI[lIIIIIIlll[35]]);
            int lIIlIIlIIIIII = lIIlIIlIIIIIl.getResponseCode();
            if (c.llIlllIIIlII(lIIlIIlIIIIII, lIIIIIIlll[36])) {
                String lIIlIIIlllllI;
                BufferedReader lIIlIIIllllll = new BufferedReader(new InputStreamReader(lIIlIIlIIIIIl.getInputStream()));
                StringBuilder lIIlIIIllllIl = new StringBuilder();
                while (c.llIlllIIIlIl(lIIlIIIlllllI = lIIlIIIllllll.readLine())) {
                    lIIlIIIllllIl.append(lIIlIIIlllllI);
                    0;
                    0;
                    if (-3 <= 0) continue;
                    return null;
                }
                lIIlIIIllllll.close();
                String lIIlIIIllllII = c.b(String.valueOf(lIIlIIIllllIl));
                return lIIlIIIllllII;
            }
            0;
        }
        catch (IOException lIIlIIlIIIIlI) {
            lIIlIIlIIIIlI.printStackTrace();
        }
        if (((0xB4 ^ 0x95) & ~(0x45 ^ 0x64)) >= (0x45 ^ 0x41)) {
            return null;
        }
        return null;
    }

    private static String llIllIllllll(String lIIlIIIIIIlII, String lIIlIIIIIIIll) {
        lIIlIIIIIIlII = new String(Base64.getDecoder().decode(lIIlIIIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIlIIIIIIlll = new StringBuilder();
        char[] lIIlIIIIIIllI = lIIlIIIIIIIll.toCharArray();
        int lIIlIIIIIIlIl = lIIIIIIlll[1];
        char[] lIIIlllllllll = lIIlIIIIIIlII.toCharArray();
        int lIIIllllllllI = lIIIlllllllll.length;
        int lIIIlllllllIl = lIIIIIIlll[1];
        while (c.llIlllIIIlll(lIIIlllllllIl, lIIIllllllllI)) {
            char lIIlIIIIIlIlI = lIIIlllllllll[lIIIlllllllIl];
            lIIlIIIIIIlll.append((char)(lIIlIIIIIlIlI ^ lIIlIIIIIIllI[lIIlIIIIIIlIl % lIIlIIIIIIllI.length]));
            0;
            ++lIIlIIIIIIlIl;
            ++lIIIlllllllIl;
            0;
            if (((2 ^ 0x59) & ~(0xEB ^ 0xB0)) <= 0) continue;
            return null;
        }
        return String.valueOf(lIIlIIIIIIlll);
    }

    private static String llIlllIIIIIl(String lIIlIIIIllIIl, String lIIlIIIIllIII) {
        try {
            SecretKeySpec lIIlIIIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIIIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlIIIIllIll = Cipher.getInstance("Blowfish");
            lIIlIIIIllIll.init(lIIIIIIlll[5], lIIlIIIIlllII);
            return new String(lIIlIIIIllIll.doFinal(Base64.getDecoder().decode(lIIlIIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIIIIllIlI) {
            lIIlIIIIllIlI.printStackTrace();
            return null;
        }
    }

    public String d(int n2) {
        String string;
        ItemComposition itemComposition = O.getItemComposition(n2);
        if (c.llIlllIIIlIl(itemComposition)) {
            string = itemComposition.getName();
            0;
            if (2 > 2) {
                return null;
            }
        } else {
            string = lIIIIIIllI[lIIIIIIlll[38]];
        }
        return string;
    }

    private static boolean llIlllIIIlIl(Object object) {
        return object != null;
    }

    private static String llIlllIIIIII(String lIIlIIIlIIlII, String lIIlIIIlIIIll) {
        try {
            SecretKeySpec lIIlIIIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlIIIlIIIll.getBytes(StandardCharsets.UTF_8)), lIIIIIIlll[14]), "DES");
            Cipher lIIlIIIlIlIII = Cipher.getInstance("DES");
            lIIlIIIlIlIII.init(lIIIIIIlll[5], lIIlIIIlIlIIl);
            return new String(lIIlIIIlIlIII.doFinal(Base64.getDecoder().decode(lIIlIIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIIIlIIlll) {
            lIIlIIIlIIlll.printStackTrace();
            return null;
        }
    }

    private static String b(String string) {
        String string2 = null;
        String string3 = lIIIIIIllI[lIIIIIIlll[37]];
        Pattern pattern = Pattern.compile(string3);
        Matcher matcher = pattern.matcher(string);
        if (c.llIlllIIIllI(matcher.find() ? 1 : 0)) {
            string2 = matcher.group(lIIIIIIlll[3]);
        }
        return string2;
    }

    private static void llIlllIIIIll() {
        lIIIIIIlll = new int[40];
        c.lIIIIIIlll[0] = 0xFFFFEEFE & 0x3FCD;
        c.lIIIIIIlll[1] = (0x84 ^ 0x98) & ~(7 ^ 0x1B);
        c.lIIIIIIlll[2] = -(0xFFFFF25D & 0x1DA3) & (0xFFFF97FF & 0x7EEF);
        c.lIIIIIIlll[3] = 1;
        c.lIIIIIIlll[4] = 0xFFFFEA39 & 0x17F7;
        c.lIIIIIIlll[5] = 2;
        c.lIIIIIIlll[6] = 0x37 ^ 9;
        c.lIIIIIIlll[7] = 3;
        c.lIIIIIIlll[8] = -(0xFFFFF67F & 0x4991) & (0xFFFFFB7C & 0x76F7);
        c.lIIIIIIlll[9] = 0x57 ^ 0x26 ^ (0x1A ^ 0x6F);
        c.lIIIIIIlll[10] = 0x44 ^ 0x41;
        c.lIIIIIIlll[11] = 2 ^ 0x20 ^ (0x79 ^ 0x5D);
        c.lIIIIIIlll[12] = 0x3E ^ 0x39;
        c.lIIIIIIlll[13] = 0xFFFFD30F & 0x2EFE;
        c.lIIIIIIlll[14] = 0xA9 ^ 0xA1;
        c.lIIIIIIlll[15] = 0xFFFFA5FD & 0x5FEB;
        c.lIIIIIIlll[16] = 0x90 ^ 0x99;
        c.lIIIIIIlll[17] = 0xFFFFFCF9 & 0xF27;
        c.lIIIIIIlll[18] = 122 + 22 - 91 + 85 ^ 86 + 28 - 54 + 68;
        c.lIIIIIIlll[19] = -(0xFFFFFFCD & 0x7A3B) & (0xFFFFFFFB & Short.MAX_VALUE);
        c.lIIIIIIlll[20] = 0xA7 ^ 0xAC;
        c.lIIIIIIlll[21] = -(0xFFFFFED5 & 0x576F) & (0xFFFFDFFF & 0x7755);
        c.lIIIIIIlll[22] = 0x47 ^ 0x10 ^ (0xF5 ^ 0xAE);
        c.lIIIIIIlll[23] = -1 & (0xFFFFBF4F & 0x5FF7);
        c.lIIIIIIlll[24] = 0x3F ^ 0x32;
        c.lIIIIIIlll[25] = -(0xFFFFEEFF & 0x7107) & (0xFFFFFF4F & Short.MAX_VALUE);
        c.lIIIIIIlll[26] = 0x99 ^ 0x97;
        c.lIIIIIIlll[27] = -(0xFFFFF2DF & 0x4D35) & (0xFFFFFFDF & 0x5F7E);
        c.lIIIIIIlll[28] = 0xE ^ 0x65 ^ (0x62 ^ 6);
        c.lIIIIIIlll[29] = -(0xFFFFFF8F & 0x60F5) & (0xFFFFFFFF & 0x7FCF);
        c.lIIIIIIlll[30] = 0x30 ^ 0x20;
        c.lIIIIIIlll[31] = -(0xFFFF873D & 0x79CB) & (0xFFFFDDEF & 0x6FBF);
        c.lIIIIIIlll[32] = 0x15 ^ 4;
        c.lIIIIIIlll[33] = -(0xFFFFCF75 & 0x38BB) & (0xFFFFCFF5 & 0x3FFB);
        c.lIIIIIIlll[34] = 0xD ^ 0x5A ^ (0xCD ^ 0x88);
        c.lIIIIIIlll[35] = 0x90 ^ 0x83;
        c.lIIIIIIlll[36] = (0xFD ^ 0xA1) + (71 + 16 - -31 + 15) - (0xA6 ^ 0xC5) + (0x8E ^ 0xC4);
        c.lIIIIIIlll[37] = 0x92 ^ 0x86;
        c.lIIIIIIlll[38] = 0x95 ^ 0x80;
        c.lIIIIIIlll[39] = 112 + 22 - 82 + 86 ^ 75 + 110 - 94 + 65;
    }

    private static void llIlllIIIIlI() {
        lIIIIIIllI = new String[lIIIIIIlll[39]];
        c.lIIIIIIllI[c.lIIIIIIlll[1]] = c."Ring of wealth (5)";
        c.lIIIIIIllI[c.lIIIIIIlll[3]] = c."Molten glass";
        c.lIIIIIIllI[c.lIIIIIIlll[5]] = c."Nature rune";
        c.lIIIIIIllI[c.lIIIIIIlll[7]] = c."Maple longbow (u)";
        c.lIIIIIIllI[c.lIIIIIIlll[9]] = c."Uncharged toxic trident";
        c.lIIIIIIllI[c.lIIIIIIlll[10]] = c."Molten glass";
        c.lIIIIIIllI[c.lIIIIIIlll[11]] = c."Nature rune";
        c.lIIIIIIllI[c.lIIIIIIlll[12]] = c."Maple longbow (u)";
        c.lIIIIIIllI[c.lIIIIIIlll[14]] = c."Bones";
        c.lIIIIIIllI[c.lIIIIIIlll[16]] = c."Magic logs";
        c.lIIIIIIllI[c.lIIIIIIlll[18]] = c."Climbing boots";
        c.lIIIIIIllI[c.lIIIIIIlll[20]] = c."Lockpick";
        c.lIIIIIIllI[c.lIIIIIIlll[22]] = c."Poison";
        c.lIIIIIIllI[c.lIIIIIIlll[24]] = c."Varrock teleport";
        c.lIIIIIIllI[c.lIIIIIIlll[26]] = c."Falador teleport";
        c.lIIIIIIllI[c.lIIIIIIlll[28]] = c."Camelot teleport";
        c.lIIIIIIllI[c.lIIIIIIlll[30]] = c."Ardougne teleport";
        c.lIIIIIIllI[c.lIIIIIIlll[32]] = c."West ardougne teleport";
        c.lIIIIIIllI[c.lIIIIIIlll[34]] = c."Cheese";
        c.lIIIIIIllI[c.lIIIIIIlll[35]] = c."GET";
        c.lIIIIIIllI[c.lIIIIIIlll[37]] = c."<title>(.*?) - OSRS Wiki</title>";
        c.lIIIIIIllI[c.lIIIIIIlll[38]] = c."Unknown Item";
    }

    static {
        c.llIlllIIIIll();
        c.llIlllIIIIlI();
    }

    private static boolean llIlllIIIllI(int n2) {
        return n2 != 0;
    }
}

