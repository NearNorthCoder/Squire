/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.ItemComposition
 *  net.runelite.client.game.ItemManager
 */
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

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
    private static /* synthetic */ int[] lIIllIIlII;
    private static /* synthetic */ ItemManager N;
    private static /* synthetic */ String[] lIIllIIIll;

    private static String b(String string) {
        String string2 = null;
        String string3 = lIIllIIIll[lIIllIIlII[37]];
        Pattern pattern = Pattern.compile(string3);
        Matcher matcher = pattern.matcher(string);
        if (c.lIIIIIIllIllI(matcher.find() ? 1 : 0)) {
            string2 = matcher.group(lIIllIIlII[3]);
        }
        return string2;
    }

    private static boolean lIIIIIIllIllI(int n2) {
        return n2 != 0;
    }

    public static String c(int n2) {
        int llllllllllllllllllllllIIIlIlIIIl;
        if (c.lIIIIIIllIlII(n2, lIIllIIlII[0])) {
            return lIIllIIIll[lIIllIIlII[1]];
        }
        if (c.lIIIIIIllIlII(llllllllllllllllllllllIIIlIlIIIl, lIIllIIlII[2])) {
            return lIIllIIIll[lIIllIIlII[3]];
        }
        if (c.lIIIIIIllIlII(llllllllllllllllllllllIIIlIlIIIl, lIIllIIlII[4])) {
            return lIIllIIIll[lIIllIIlII[5]];
        }
        if (c.lIIIIIIllIlII(llllllllllllllllllllllIIIlIlIIIl, lIIllIIlII[6])) {
            return lIIllIIIll[lIIllIIlII[7]];
        }
        if (c.lIIIIIIllIlII(llllllllllllllllllllllIIIlIlIIIl, lIIllIIlII[8])) {
            return lIIllIIIll[lIIllIIlII[9]];
        }
        if (c.lIIIIIIllIlII(llllllllllllllllllllllIIIlIlIIIl, lIIllIIlII[2])) {
            return lIIllIIIll[lIIllIIlII[10]];
        }
        if (c.lIIIIIIllIlII(llllllllllllllllllllllIIIlIlIIIl, lIIllIIlII[4])) {
            return lIIllIIIll[lIIllIIlII[11]];
        }
        if (c.lIIIIIIllIlII(llllllllllllllllllllllIIIlIlIIIl, lIIllIIlII[6])) {
            return lIIllIIIll[lIIllIIlII[12]];
        }
        if (c.lIIIIIIllIlII(llllllllllllllllllllllIIIlIlIIIl, lIIllIIlII[13])) {
            return lIIllIIIll[lIIllIIlII[14]];
        }
        if (c.lIIIIIIllIlII(llllllllllllllllllllllIIIlIlIIIl, lIIllIIlII[15])) {
            return lIIllIIIll[lIIllIIlII[16]];
        }
        if (c.lIIIIIIllIlII(llllllllllllllllllllllIIIlIlIIIl, lIIllIIlII[17])) {
            return lIIllIIIll[lIIllIIlII[18]];
        }
        if (c.lIIIIIIllIlII(llllllllllllllllllllllIIIlIlIIIl, lIIllIIlII[19])) {
            return lIIllIIIll[lIIllIIlII[20]];
        }
        if (c.lIIIIIIllIlII(llllllllllllllllllllllIIIlIlIIIl, lIIllIIlII[21])) {
            return lIIllIIIll[lIIllIIlII[22]];
        }
        if (c.lIIIIIIllIlII(llllllllllllllllllllllIIIlIlIIIl, lIIllIIlII[23])) {
            return lIIllIIIll[lIIllIIlII[24]];
        }
        if (c.lIIIIIIllIlII(llllllllllllllllllllllIIIlIlIIIl, lIIllIIlII[25])) {
            return lIIllIIIll[lIIllIIlII[26]];
        }
        if (c.lIIIIIIllIlII(llllllllllllllllllllllIIIlIlIIIl, lIIllIIlII[27])) {
            return lIIllIIIll[lIIllIIlII[28]];
        }
        if (c.lIIIIIIllIlII(llllllllllllllllllllllIIIlIlIIIl, lIIllIIlII[29])) {
            return lIIllIIIll[lIIllIIlII[30]];
        }
        if (c.lIIIIIIllIlII(llllllllllllllllllllllIIIlIlIIIl, lIIllIIlII[31])) {
            return lIIllIIIll[lIIllIIlII[32]];
        }
        if (c.lIIIIIIllIlII(llllllllllllllllllllllIIIlIlIIIl, lIIllIIlII[33])) {
            return lIIllIIIll[lIIllIIlII[34]];
        }
        String llllllllllllllllllllllIIIlIlIIII = "https://oldschool.runescape.wiki/w/Special:Lookup?type=item&id=" + llllllllllllllllllllllIIIlIlIIIl;
        try {
            URL llllllllllllllllllllllIIIlIIllll = new URL(llllllllllllllllllllllIIIlIlIIII);
            HttpURLConnection llllllllllllllllllllllIIIlIIlllI = (HttpURLConnection)llllllllllllllllllllllIIIlIIllll.openConnection();
            llllllllllllllllllllllIIIlIIlllI.setRequestMethod(lIIllIIIll[lIIllIIlII[35]]);
            int llllllllllllllllllllllIIIlIIllIl = llllllllllllllllllllllIIIlIIlllI.getResponseCode();
            if (c.lIIIIIIllIlII(llllllllllllllllllllllIIIlIIllIl, lIIllIIlII[36])) {
                String llllllllllllllllllllllIIIlIIlIll;
                BufferedReader llllllllllllllllllllllIIIlIIllII = new BufferedReader(new InputStreamReader(llllllllllllllllllllllIIIlIIlllI.getInputStream()));
                StringBuilder llllllllllllllllllllllIIIlIIlIlI = new StringBuilder();
                while (c.lIIIIIIllIlIl(llllllllllllllllllllllIIIlIIlIll = llllllllllllllllllllllIIIlIIllII.readLine())) {
                    llllllllllllllllllllllIIIlIIlIlI.append(llllllllllllllllllllllIIIlIIlIll);
                    0;
                    0;
                    if (-1 <= 2) continue;
                    return null;
                }
                llllllllllllllllllllllIIIlIIllII.close();
                String llllllllllllllllllllllIIIlIIlIIl = c.b(String.valueOf(llllllllllllllllllllllIIIlIIlIlI));
                return llllllllllllllllllllllIIIlIIlIIl;
            }
            0;
        }
        catch (IOException llllllllllllllllllllllIIIlIIllll) {
            llllllllllllllllllllllIIIlIIllll.printStackTrace();
        }
        if (((0x67 ^ 0x45) & ~(0x37 ^ 0x15)) != 0) {
            return null;
        }
        return null;
    }

    private static String lIIIIIIllIIIl(String llllllllllllllllllllllIIIIIlIIIl, String llllllllllllllllllllllIIIIIlIIII) {
        llllllllllllllllllllllIIIIIlIIIl = new String(Base64.getDecoder().decode(llllllllllllllllllllllIIIIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllllllIIIIIlIlII = new StringBuilder();
        char[] llllllllllllllllllllllIIIIIlIIll = llllllllllllllllllllllIIIIIlIIII.toCharArray();
        int llllllllllllllllllllllIIIIIlIIlI = lIIllIIlII[1];
        char[] llllllllllllllllllllllIIIIIIllII = llllllllllllllllllllllIIIIIlIIIl.toCharArray();
        int llllllllllllllllllllllIIIIIIlIll = llllllllllllllllllllllIIIIIIllII.length;
        int llllllllllllllllllllllIIIIIIlIlI = lIIllIIlII[1];
        while (c.lIIIIIIllIlll(llllllllllllllllllllllIIIIIIlIlI, llllllllllllllllllllllIIIIIIlIll)) {
            char llllllllllllllllllllllIIIIIlIlll = llllllllllllllllllllllIIIIIIllII[llllllllllllllllllllllIIIIIIlIlI];
            llllllllllllllllllllllIIIIIlIlII.append((char)(llllllllllllllllllllllIIIIIlIlll ^ llllllllllllllllllllllIIIIIlIIll[llllllllllllllllllllllIIIIIlIIlI % llllllllllllllllllllllIIIIIlIIll.length]));
            0;
            ++llllllllllllllllllllllIIIIIlIIlI;
            ++llllllllllllllllllllllIIIIIIlIlI;
            0;
            if (-(0x36 ^ 0x32) <= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllllllIIIIIlIlII);
    }

    public c(ItemManager itemManager) {
        0;
        N = itemManager;
    }

    private static boolean lIIIIIIllIlIl(Object object) {
        return object != null;
    }

    private static String lIIIIIIllIIII(String llllllllllllllllllllllIIIIllIIIl, String llllllllllllllllllllllIIIIllIIII) {
        try {
            SecretKeySpec llllllllllllllllllllllIIIIllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllllIIIIllIIII.getBytes(StandardCharsets.UTF_8)), lIIllIIlII[14]), "DES");
            Cipher llllllllllllllllllllllIIIIllIlIl = Cipher.getInstance("DES");
            llllllllllllllllllllllIIIIllIlIl.init(lIIllIIlII[5], llllllllllllllllllllllIIIIllIllI);
            return new String(llllllllllllllllllllllIIIIllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllllllIIIIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllllllIIIIllIlII) {
            llllllllllllllllllllllIIIIllIlII.printStackTrace();
            return null;
        }
    }

    private static String lIIIIIIlIllll(String llllllllllllllllllllllIIIIlIIllI, String llllllllllllllllllllllIIIIlIIlIl) {
        try {
            SecretKeySpec llllllllllllllllllllllIIIIlIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllllIIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllllllIIIIlIlIII = Cipher.getInstance("Blowfish");
            llllllllllllllllllllllIIIIlIlIII.init(lIIllIIlII[5], llllllllllllllllllllllIIIIlIlIIl);
            return new String(llllllllllllllllllllllIIIIlIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllllllllllIIIIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllllllIIIIlIIlll) {
            llllllllllllllllllllllIIIIlIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIllIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIIIIllIIlI() {
        lIIllIIIll = new String[lIIllIIlII[39]];
        c.lIIllIIIll[c.lIIllIIlII[1]] = c."Ring of wealth (5)";
        c.lIIllIIIll[c.lIIllIIlII[3]] = c."Molten glass";
        c.lIIllIIIll[c.lIIllIIlII[5]] = c."Nature rune";
        c.lIIllIIIll[c.lIIllIIlII[7]] = c."Maple longbow (u)";
        c.lIIllIIIll[c.lIIllIIlII[9]] = c."Uncharged toxic trident";
        c.lIIllIIIll[c.lIIllIIlII[10]] = c."Molten glass";
        c.lIIllIIIll[c.lIIllIIlII[11]] = c."Nature rune";
        c.lIIllIIIll[c.lIIllIIlII[12]] = c."Maple longbow (u)";
        c.lIIllIIIll[c.lIIllIIlII[14]] = c."Bones";
        c.lIIllIIIll[c.lIIllIIlII[16]] = c."Magic logs";
        c.lIIllIIIll[c.lIIllIIlII[18]] = c."Climbing boots";
        c.lIIllIIIll[c.lIIllIIlII[20]] = c."Lockpick";
        c.lIIllIIIll[c.lIIllIIlII[22]] = c."Poison";
        c.lIIllIIIll[c.lIIllIIlII[24]] = c."Varrock teleport";
        c.lIIllIIIll[c.lIIllIIlII[26]] = c."Falador teleport";
        c.lIIllIIIll[c.lIIllIIlII[28]] = c."Camelot teleport";
        c.lIIllIIIll[c.lIIllIIlII[30]] = c."Ardougne teleport";
        c.lIIllIIIll[c.lIIllIIlII[32]] = c."West ardougne teleport";
        c.lIIllIIIll[c.lIIllIIlII[34]] = c."Cheese";
        c.lIIllIIIll[c.lIIllIIlII[35]] = c."GET";
        c.lIIllIIIll[c.lIIllIIlII[37]] = c."<title>(.*?) - OSRS Wiki</title>";
        c.lIIllIIIll[c.lIIllIIlII[38]] = c."Unknown Item";
    }

    private static void lIIIIIIllIIll() {
        lIIllIIlII = new int[40];
        c.lIIllIIlII[0] = -2 & (0xFFFFBFCF & 0x6EFD);
        c.lIIllIIlII[1] = (0x85 ^ 0xBB) & ~(0x7E ^ 0x40);
        c.lIIllIIlII[2] = -(0xFFFFBDB9 & 0x7B57) & (0xFFFFFFFF & 0x3FFF);
        c.lIIllIIlII[3] = 1;
        c.lIIllIIlII[4] = 0xFFFFCBB7 & 0x3679;
        c.lIIllIIlII[5] = 2;
        c.lIIllIIlII[6] = 9 ^ 0x37;
        c.lIIllIIlII[7] = 3;
        c.lIIllIIlII[8] = 0xFFFFB3E6 & 0x7E7D;
        c.lIIllIIlII[9] = 0x8C ^ 0x88;
        c.lIIllIIlII[10] = 0x6E ^ 0x6B;
        c.lIIllIIlII[11] = 0x5F ^ 0x59;
        c.lIIllIIlII[12] = 0xE9 ^ 0x99 ^ (0xC1 ^ 0xB6);
        c.lIIllIIlII[13] = 0xFFFF860E & 0x7BFF;
        c.lIIllIIlII[14] = 0x81 ^ 0x89;
        c.lIIllIIlII[15] = 0xFFFFDFF9 & 0x25EF;
        c.lIIllIIlII[16] = 0x20 ^ 0x29;
        c.lIIllIIlII[17] = -(0xFFFFE6B9 & 0x79CF) & (0xFFFFECAD & 0x7FFB);
        c.lIIllIIlII[18] = 0x12 ^ 0x7E ^ (0x15 ^ 0x73);
        c.lIIllIIlII[19] = -(0xFFFFDA09 & 0x7FF7) & (0xFFFFFFF7 & 0x5FFB);
        c.lIIllIIlII[20] = 0x21 ^ 0x2A;
        c.lIIllIIlII[21] = -(0xE2 ^ 0xC5) & (0xFFFFCBF7 & 0x353F);
        c.lIIllIIlII[22] = 0x55 ^ 0x59;
        c.lIIllIIlII[23] = 0xFFFF9F6F & 0x7FD7;
        c.lIIllIIlII[24] = 32 + 73 - 51 + 74 ^ 63 + 54 - 30 + 54;
        c.lIIllIIlII[25] = -(0xFFFFC4E7 & 0x7BBB) & (0xFFFFDFEB & Short.MAX_VALUE);
        c.lIIllIIlII[26] = 0x11 ^ 0x1F;
        c.lIIllIIlII[27] = -(0xFFFFF113 & 0x6EFE) & (0xFFFFFF5B & Short.MAX_VALUE);
        c.lIIllIIlII[28] = 0x40 ^ 0x71 ^ (0xFF ^ 0xC1);
        c.lIIllIIlII[29] = -(0xFFFFFDBD & 0x62F7) & (0xFFFFFFFF & Short.MAX_VALUE);
        c.lIIllIIlII[30] = 0x67 ^ 0x77;
        c.lIIllIIlII[31] = -(0xFFFF9FF9 & 0x621F) & (0xFFFFEEFF & 0x5FBF);
        c.lIIllIIlII[32] = 0x54 ^ 0x79 ^ (0x86 ^ 0xBA);
        c.lIIllIIlII[33] = 0xFFFFC7C3 & 0x3FFD;
        c.lIIllIIlII[34] = 0x50 ^ 0x26 ^ (0x30 ^ 0x54);
        c.lIIllIIlII[35] = 0x7D ^ 0x2F ^ (0x4C ^ 0xD);
        c.lIIllIIlII[36] = 1 + 145 - 104 + 158;
        c.lIIllIIlII[37] = 0xAF ^ 0xBB;
        c.lIIllIIlII[38] = 0x64 ^ 0x71;
        c.lIIllIIlII[39] = 0x39 ^ 0x2F;
    }

    private static boolean lIIIIIIllIlII(int n2, int n3) {
        return n2 == n3;
    }

    static {
        c.lIIIIIIllIIll();
        c.lIIIIIIllIIlI();
    }

    public String d(int n2) {
        String string;
        ItemComposition itemComposition = N.getItemComposition(n2);
        if (c.lIIIIIIllIlIl(itemComposition)) {
            string = itemComposition.getName();
            0;
            if (((0x10 ^ 0x2E) & ~(0x9F ^ 0xA1)) < 0) {
                return null;
            }
        } else {
            string = lIIllIIIll[lIIllIIlII[38]];
        }
        return string;
    }
}

