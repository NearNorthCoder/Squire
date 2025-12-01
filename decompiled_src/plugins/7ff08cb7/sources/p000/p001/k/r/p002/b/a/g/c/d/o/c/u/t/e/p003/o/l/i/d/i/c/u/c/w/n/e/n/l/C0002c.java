package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

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
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.c  reason: invalid package and case insensitive filesystem */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/c.class */
public class C0002c {
    private static /* synthetic */ ItemManager O;
    private static /* synthetic */ int[] lIIIIIIlll;
    private static /* synthetic */ String[] lIIIIIIllI;

    public C0002c(ItemManager itemManager) {
        "".length();
        O = itemManager;
    }

    private static boolean llIlllIIIlII(int i, int i2) {
        return i == i2;
    }

    private static boolean llIlllIIIlll(int i, int i2) {
        return i < i2;
    }

    public static String c(int i) {
        if (llIlllIIIlII(i, lIIIIIIlll[0])) {
            return lIIIIIIllI[lIIIIIIlll[1]];
        }
        if (llIlllIIIlII(i, lIIIIIIlll[2])) {
            return lIIIIIIllI[lIIIIIIlll[3]];
        }
        if (llIlllIIIlII(i, lIIIIIIlll[4])) {
            return lIIIIIIllI[lIIIIIIlll[5]];
        }
        if (llIlllIIIlII(i, lIIIIIIlll[6])) {
            return lIIIIIIllI[lIIIIIIlll[7]];
        }
        if (llIlllIIIlII(i, lIIIIIIlll[8])) {
            return lIIIIIIllI[lIIIIIIlll[9]];
        }
        if (llIlllIIIlII(i, lIIIIIIlll[2])) {
            return lIIIIIIllI[lIIIIIIlll[10]];
        }
        if (llIlllIIIlII(i, lIIIIIIlll[4])) {
            return lIIIIIIllI[lIIIIIIlll[11]];
        }
        if (llIlllIIIlII(i, lIIIIIIlll[6])) {
            return lIIIIIIllI[lIIIIIIlll[12]];
        }
        if (llIlllIIIlII(i, lIIIIIIlll[13])) {
            return lIIIIIIllI[lIIIIIIlll[14]];
        }
        if (llIlllIIIlII(i, lIIIIIIlll[15])) {
            return lIIIIIIllI[lIIIIIIlll[16]];
        }
        if (llIlllIIIlII(i, lIIIIIIlll[17])) {
            return lIIIIIIllI[lIIIIIIlll[18]];
        }
        if (llIlllIIIlII(i, lIIIIIIlll[19])) {
            return lIIIIIIllI[lIIIIIIlll[20]];
        }
        if (llIlllIIIlII(i, lIIIIIIlll[21])) {
            return lIIIIIIllI[lIIIIIIlll[22]];
        }
        if (llIlllIIIlII(i, lIIIIIIlll[23])) {
            return lIIIIIIllI[lIIIIIIlll[24]];
        }
        if (llIlllIIIlII(i, lIIIIIIlll[25])) {
            return lIIIIIIllI[lIIIIIIlll[26]];
        }
        if (llIlllIIIlII(i, lIIIIIIlll[27])) {
            return lIIIIIIllI[lIIIIIIlll[28]];
        }
        if (llIlllIIIlII(i, lIIIIIIlll[29])) {
            return lIIIIIIllI[lIIIIIIlll[30]];
        }
        if (llIlllIIIlII(i, lIIIIIIlll[31])) {
            return lIIIIIIllI[lIIIIIIlll[32]];
        }
        if (llIlllIIIlII(i, lIIIIIIlll[33])) {
            return lIIIIIIllI[lIIIIIIlll[34]];
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://oldschool.runescape.wiki/w/Special:Lookup?type=item&id=" + i).openConnection();
            httpURLConnection.setRequestMethod(lIIIIIIllI[lIIIIIIlll[35]]);
            if (!llIlllIIIlII(httpURLConnection.getResponseCode(), lIIIIIIlll[36])) {
                "".length();
                return ((180 ^ 149) & ((69 ^ 100) ^ (-1))) >= (69 ^ 65) ? null : null;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            do {
                String readLine = bufferedReader.readLine();
                if (!llIlllIIIlIl(readLine)) {
                    bufferedReader.close();
                    return b(String.valueOf(sb));
                }
                sb.append(readLine);
                "".length();
                "".length();
            } while ((-"   ".length()) <= 0);
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String llIllIllllll(String lIIlIIIIIlIIl, String lIIlIIIIIlIII) {
        String lIIlIIIIIlIIl2 = new String(Base64.getDecoder().decode(lIIlIIIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lIIlIIIIIIllI = lIIlIIIIIlIII.toCharArray();
        int lIIlIIIIIIlIl = lIIIIIIlll[1];
        char[] charArray = lIIlIIIIIlIIl2.toCharArray();
        int length = charArray.length;
        int i = lIIIIIIlll[1];
        while (llIlllIIIlll(i, length)) {
            sb.append((char) (charArray[i] ^ lIIlIIIIIIllI[lIIlIIIIIIlIl % lIIlIIIIIIllI.length]));
            "".length();
            lIIlIIIIIIlIl++;
            i++;
            "".length();
            if (((2 ^ 89) & ((235 ^ 176) ^ (-1))) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String llIlllIIIIIl(String lIIlIIIIlIlll, String lIIlIIIIllIII) {
        try {
            SecretKeySpec lIIlIIIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIIIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIIIIlll[5], lIIlIIIIlllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIlIIIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlIIIIllIlI) {
            lIIlIIIIllIlI.printStackTrace();
            return null;
        }
    }

    public String d(int i) {
        ItemComposition itemComposition = O.getItemComposition(i);
        if (llIlllIIIlIl(itemComposition)) {
            String name = itemComposition.getName();
            "".length();
            if ("  ".length() > "  ".length()) {
                return null;
            }
            return name;
        }
        return lIIIIIIllI[lIIIIIIlll[38]];
    }

    private static boolean llIlllIIIlIl(Object obj) {
        return obj != null;
    }

    private static String llIlllIIIIII(String lIIlIIIlIIllI, String lIIlIIIlIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), lIIIIIIlll[14]), "DES");
            Cipher lIIlIIIlIlIII = Cipher.getInstance("DES");
            lIIlIIIlIlIII.init(lIIIIIIlll[5], secretKeySpec);
            return new String(lIIlIIIlIlIII.doFinal(Base64.getDecoder().decode(lIIlIIIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlIIIlIIlll) {
            lIIlIIIlIIlll.printStackTrace();
            return null;
        }
    }

    private static String b(String str) {
        String str2 = null;
        Matcher matcher = Pattern.compile(lIIIIIIllI[lIIIIIIlll[37]]).matcher(str);
        if (llIlllIIIllI(matcher.find() ? 1 : 0)) {
            str2 = matcher.group(lIIIIIIlll[3]);
        }
        return str2;
    }

    private static void llIlllIIIIll() {
        lIIIIIIlll = new int[40];
        lIIIIIIlll[0] = (-4354) & 16333;
        lIIIIIIlll[1] = (132 ^ 152) & ((7 ^ 27) ^ (-1));
        lIIIIIIlll[2] = (-((-3491) & 7587)) & (-26625) & 32495;
        lIIIIIIlll[3] = " ".length();
        lIIIIIIlll[4] = (-5575) & 6135;
        lIIIIIIlll[5] = "  ".length();
        lIIIIIIlll[6] = 55 ^ 9;
        lIIIIIIlll[7] = "   ".length();
        lIIIIIIlll[8] = (-((-2433) & 18833)) & (-1156) & 30455;
        lIIIIIIlll[9] = (87 ^ 38) ^ (26 ^ 111);
        lIIIIIIlll[10] = 68 ^ 65;
        lIIIIIIlll[11] = (2 ^ 32) ^ (121 ^ 93);
        lIIIIIIlll[12] = 62 ^ 57;
        lIIIIIIlll[13] = (-11505) & 12030;
        lIIIIIIlll[14] = 169 ^ 161;
        lIIIIIIlll[15] = (-23043) & 24555;
        lIIIIIIlll[16] = 144 ^ 153;
        lIIIIIIlll[17] = (-775) & 3879;
        lIIIIIIlll[18] = (((122 + 22) - 91) + 85) ^ (((86 + 28) - 54) + 68);
        lIIIIIIlll[19] = (-((-51) & 31291)) & (-5) & 32767;
        lIIIIIIlll[20] = 167 ^ 172;
        lIIIIIIlll[21] = (-((-299) & 22383)) & (-8193) & 30549;
        lIIIIIIlll[22] = (71 ^ 16) ^ (245 ^ 174);
        lIIIIIIlll[23] = (-" ".length()) & (-16561) & 24567;
        lIIIIIIlll[24] = 63 ^ 50;
        lIIIIIIlll[25] = (-((-4353) & 28935)) & (-177) & 32767;
        lIIIIIIlll[26] = 153 ^ 151;
        lIIIIIIlll[27] = (-((-3361) & 19765)) & (-33) & 24446;
        lIIIIIIlll[28] = (14 ^ 101) ^ (98 ^ 6);
        lIIIIIIlll[29] = (-((-113) & 24821)) & (-1) & 32719;
        lIIIIIIlll[30] = 48 ^ 32;
        lIIIIIIlll[31] = (-((-30915) & 31179)) & (-8721) & 28607;
        lIIIIIIlll[32] = 21 ^ 4;
        lIIIIIIlll[33] = (-((-12427) & 14523)) & (-12299) & 16379;
        lIIIIIIlll[34] = (13 ^ 90) ^ (205 ^ 136);
        lIIIIIIlll[35] = 144 ^ 131;
        lIIIIIIlll[36] = (((253 ^ 161) + (((71 + 16) - (-31)) + 15)) - (166 ^ 197)) + (142 ^ 196);
        lIIIIIIlll[37] = 146 ^ 134;
        lIIIIIIlll[38] = 149 ^ 128;
        lIIIIIIlll[39] = (((112 + 22) - 82) + 86) ^ (((75 + 110) - 94) + 65);
    }

    private static void llIlllIIIIlI() {
        lIIIIIIllI = new String[lIIIIIIlll[39]];
        lIIIIIIllI[lIIIIIIlll[1]] = llIllIllllll("GgoJJFYnBUc0EykPEytWYFZO", "HcgCv");
        lIIIIIIllI[lIIIIIIlll[3]] = llIlllIIIIII("gG3025yr3w6FuShu8td+lw==", "AEPzX");
        lIIIIIIllI[lIIIIIIlll[5]] = llIlllIIIIII("zU+PDBOIS2gMMNqqhlBurw==", "gWwso");
        lIIIIIIllI[lIIIIIIlll[7]] = llIlllIIIIII("FHBJ2NuBHwimaI3XmVeD1AB+p34TlL4t", "YOlmd");
        lIIIIIIllI[lIIIIIIlll[9]] = llIllIllllll("FDcsIzczPiovdjU2NyI1YS09IjIkNzs=", "AYOKV");
        lIIIIIIllI[lIIIIIIlll[10]] = llIlllIIIIII("Il+PktdaNpBDZx9T3H7WNQ==", "fcqxY");
        lIIIIIIllI[lIIIIIIlll[11]] = llIlllIIIIII("uI72YEHor+Sym4IVMXN7wA==", "dZJQy");
        lIIIIIIllI[lIIIIIIlll[12]] = llIllIllllll("NTQxPxFYOS49Exo6NnNcDXw=", "xUASt");
        lIIIIIIllI[lIIIIIIlll[14]] = llIllIllllll("CRYlPxU=", "KyKZf");
        lIIIIIIllI[lIIIIIIlll[16]] = llIllIllllll("CgoJJilnBwEoOQ==", "GknOJ");
        lIIIIIIllI[lIIIIIIlll[18]] = llIllIllllll("BAYgISwuBC5sLCgFPT8=", "GjILN");
        lIIIIIIllI[lIIIIIIlll[20]] = llIlllIIIIII("bKLAuqZPbm7Wde/GJaHvQA==", "iFlKu");
        lIIIIIIllI[lIIIIIIlll[22]] = llIllIllllll("PSgkPzoD", "mGMLU");
        lIIIIIIllI[lIIIIIIlll[24]] = llIllIllllll("ICAgASgVKnIHIhokIhw1Ag==", "vARsG");
        lIIIIIIllI[lIIIIIIlll[26]] = llIlllIIIIIl("KTb7+1WFV3xeeaxiNr88N0cOt7Z9O4g3", "LJQcW");
        lIIIIIIllI[lIIIIIIlll[28]] = llIlllIIIIII("xay6/UxN915K+NbSJ4bSuaGbo4Yq5E7R", "CTUEx");
        lIIIIIIllI[lIIIIIIlll[30]] = llIlllIIIIII("gCGcHHex9qxzmfQhlbvqtO7VUmxdlk1V", "Fwtau");
        lIIIIIIllI[lIIIIIIlll[32]] = llIllIllllll("IggwGXkUHycCLBIDJk0tEAEmHTYHGQ==", "umCmY");
        lIIIIIIllI[lIIIIIIlll[34]] = llIlllIIIIII("Wl1/kdUnNzY=", "xBlRC");
        lIIIIIIllI[lIIIIIIlll[35]] = llIllIllllll("LyI7", "hgotm");
        lIIIIIIllI[lIIIIIIlll[37]] = llIlllIIIIIl("/PRsAxZKhV/SVixirRWSCfeqdr4tTf1XMDIDc/1eduEopAGVf8qvBQ==", "gjIeQ");
        lIIIIIIllI[lIIIIIIlll[38]] = llIllIllllll("FzwTJjU1PFgBLic/", "BRxHZ");
    }

    static {
        llIlllIIIIll();
        llIlllIIIIlI();
    }

    private static boolean llIlllIIIllI(int i) {
        return i != 0;
    }
}
