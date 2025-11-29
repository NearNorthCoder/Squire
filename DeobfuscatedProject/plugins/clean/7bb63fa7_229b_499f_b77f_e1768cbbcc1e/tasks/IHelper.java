/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.ItemComposition
 *  net.runelite.client.game.ItemManager
 */
package gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks;

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

public class IHelper {

    private static  ItemManager ag;

    private static boolean lIIIIIlI(Object object) {
        return object != null;
    }

    private static boolean lIIIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void llllllI() {
        llIIl = new String[llIlI[35]];
        i.llIIl[i.llIlI[1]] = "Ring of wealth (5)";
        i.llIIl[i.llIlI[3]] = "Molten glass";
        i.llIIl[i.llIlI[5]] = "Nature rune";
        i.llIIl[i.llIlI[7]] = "Maple longbow (u)";
        i.llIIl[i.llIlI[9]] = "Uncharged toxic trident";
        i.llIIl[i.llIlI[10]] = "Molten glass";
        i.llIIl[i.llIlI[12]] = "Bones";
        i.llIIl[i.llIlI[14]] = "Magic logs";
        i.llIIl[i.llIlI[16]] = "Climbing boots";
        i.llIIl[i.llIlI[18]] = "Lockpick";
        i.llIIl[i.llIlI[20]] = "Poison";
        i.llIIl[i.llIlI[22]] = "Varrock teleport";
        i.llIIl[i.llIlI[24]] = "Falador teleport";
        i.llIIl[i.llIlI[26]] = "Camelot teleport";
        i.llIIl[i.llIlI[28]] = "Ardougne teleport";
        i.llIIl[i.llIlI[30]] = "West ardougne teleport";
        i.llIIl[i.llIlI[31]] = "GET";
        i.llIIl[i.llIlI[33]] = "<title>(.*?) - OSRS Wiki</title>";
        i.llIIl[i.llIlI[34]] = "Unknown Item";
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

                    if (2 >= 0) continue;
                    return null;
                }
                llllIlllIllIllI.close();
                String llllIlllIllIIll = i.c(String.valueOf(llllIlllIllIlII));
                return llllIlllIllIIll;
            }

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

    private static boolean lIIIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    public IHelper(ItemManager itemManager) {

        ag = itemManager;
    }

        return String.valueOf(llllIllIllllllI);
    }

    public String b(int n2) {
        String string;
        ItemComposition itemComposition = ag.getItemComposition(n2);
        if (i.lIIIIIlI(itemComposition)) {
            string = itemComposition.getName();

            if (((0x51 ^ 0x66 ^ (0xDD ^ 0xA8)) & (0x97 ^ 0xB7 ^ (0x7C ^ 0x1E) ^ -1)) < 0) {
                return null;
            }
        } else {
            string = llIIl[llIlI[34]];
        }
        return string;
    }

}

