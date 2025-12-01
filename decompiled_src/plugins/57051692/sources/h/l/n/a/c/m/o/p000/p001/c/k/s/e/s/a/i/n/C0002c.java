package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

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
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.c  reason: invalid package and case insensitive filesystem */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/c.class */
public class C0002c {
    private static /* synthetic */ ItemManager M;
    private static /* synthetic */ int[] lIllIlIllI;
    private static /* synthetic */ String[] lIllIlIIll;

    public static String c(int i) {
        if (lIIllIIllIIll(i, lIllIlIllI[0])) {
            return lIllIlIIll[lIllIlIllI[1]];
        }
        if (lIIllIIllIIll(i, lIllIlIllI[2])) {
            return lIllIlIIll[lIllIlIllI[3]];
        }
        if (lIIllIIllIIll(i, lIllIlIllI[4])) {
            return lIllIlIIll[lIllIlIllI[5]];
        }
        if (lIIllIIllIIll(i, lIllIlIllI[6])) {
            return lIllIlIIll[lIllIlIllI[7]];
        }
        if (lIIllIIllIIll(i, lIllIlIllI[8])) {
            return lIllIlIIll[lIllIlIllI[9]];
        }
        if (lIIllIIllIIll(i, lIllIlIllI[2])) {
            return lIllIlIIll[lIllIlIllI[10]];
        }
        if (lIIllIIllIIll(i, lIllIlIllI[4])) {
            return lIllIlIIll[lIllIlIllI[11]];
        }
        if (lIIllIIllIIll(i, lIllIlIllI[6])) {
            return lIllIlIIll[lIllIlIllI[12]];
        }
        if (lIIllIIllIIll(i, lIllIlIllI[13])) {
            return lIllIlIIll[lIllIlIllI[14]];
        }
        if (lIIllIIllIIll(i, lIllIlIllI[15])) {
            return lIllIlIIll[lIllIlIllI[16]];
        }
        if (lIIllIIllIIll(i, lIllIlIllI[17])) {
            return lIllIlIIll[lIllIlIllI[18]];
        }
        if (lIIllIIllIIll(i, lIllIlIllI[19])) {
            return lIllIlIIll[lIllIlIllI[20]];
        }
        if (lIIllIIllIIll(i, lIllIlIllI[21])) {
            return lIllIlIIll[lIllIlIllI[22]];
        }
        if (lIIllIIllIIll(i, lIllIlIllI[23])) {
            return lIllIlIIll[lIllIlIllI[24]];
        }
        if (lIIllIIllIIll(i, lIllIlIllI[25])) {
            return lIllIlIIll[lIllIlIllI[26]];
        }
        if (lIIllIIllIIll(i, lIllIlIllI[27])) {
            return lIllIlIIll[lIllIlIllI[28]];
        }
        if (lIIllIIllIIll(i, lIllIlIllI[29])) {
            return lIllIlIIll[lIllIlIllI[30]];
        }
        if (lIIllIIllIIll(i, lIllIlIllI[31])) {
            return lIllIlIIll[lIllIlIllI[32]];
        }
        if (lIIllIIllIIll(i, lIllIlIllI[33])) {
            return lIllIlIIll[lIllIlIllI[34]];
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://oldschool.runescape.wiki/w/Special:Lookup?type=item&id=" + i).openConnection();
            httpURLConnection.setRequestMethod(lIllIlIIll[lIllIlIllI[35]]);
            int lllllllllllllllllllIIIlIIIllllll = httpURLConnection.getResponseCode();
            if (!lIIllIIllIIll(lllllllllllllllllllIIIlIIIllllll, lIllIlIllI[36])) {
                "".length();
                return ((34 ^ 63) & ((153 ^ 132) ^ (-1))) >= (72 ^ 76) ? null : null;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            do {
                String readLine = bufferedReader.readLine();
                if (!lIIllIIllIlII(readLine)) {
                    bufferedReader.close();
                    String lllllllllllllllllllIIIlIIIlllIll = b(String.valueOf(sb));
                    return lllllllllllllllllllIIIlIIIlllIll;
                }
                sb.append(readLine);
                "".length();
                "".length();
            } while ((((((38 + 100) - (-7)) + 3) ^ (((109 + 107) - 198) + 147)) & (((81 ^ 3) ^ (77 ^ 46)) ^ (-" ".length()))) == 0);
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String lIIllIIlIIIll(String lllllllllllllllllllIIIlIIIIIIIII, String lllllllllllllllllllIIIIlllllllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIIlllllllll.getBytes(StandardCharsets.UTF_8)), lIllIlIllI[14]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIlIllI[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIlIIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIIlIIIIIIIIl) {
            lllllllllllllllllllIIIlIIIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIIllIIll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIllIIllIlII(Object obj) {
        return obj != null;
    }

    public C0002c(ItemManager itemManager) {
        "".length();
        M = itemManager;
    }

    private static boolean lIIllIIllIllI(int i, int i2) {
        return i < i2;
    }

    private static void lIIllIIllIIIl() {
        lIllIlIIll = new String[lIllIlIllI[39]];
        lIllIlIIll[lIllIlIllI[1]] = lIIllIIlIIIlI("PwUcFGsCClIELgwABhtrRVlb", "mlrsK");
        lIllIlIIll[lIllIlIllI[3]] = lIIllIIlIIIll("K5/tcnCzhUha0Sd0F8Y8vw==", "jtCEf");
        lIllIlIIll[lIllIlIllI[5]] = lIIllIIlIIlII("4fu2IcZia/imICZLCn2Krg==", "nfkli");
        lIllIlIIll[lIllIlIllI[7]] = lIIllIIlIIlII("TEC8GLYwhuw+6KaKYNLOZdCYBK3jcegH", "gCrMS");
        lIllIlIIll[lIllIlIllI[9]] = lIIllIIlIIlII("zeXH8R/bC4JlwK6CvnZ9yQEbKFElOYCK", "rmKfV");
        lIllIlIIll[lIllIlIllI[10]] = lIIllIIlIIlII("1ZuRo2xmccWJlraVBZWsTg==", "IgSiH");
        lIllIlIIll[lIllIlIllI[11]] = lIIllIIlIIIll("FOO8pZMjR/+bivj8DVCYVw==", "JpkKj");
        lIllIlIIll[lIllIlIllI[12]] = lIIllIIlIIlII("+G7mTD+JV3LgRZyL8y0VAHeN3ZEr3wfc", "ywTjH");
        lIllIlIIll[lIllIlIllI[14]] = lIIllIIlIIlII("8ScLhcYa18w=", "QmmOU");
        lIllIlIIll[lIllIlIllI[16]] = lIIllIIlIIIlI("BBMhHyZpHikRNg==", "IrFvE");
        lIllIlIIll[lIllIlIllI[18]] = lIIllIIlIIIll("8VQ0wV/FM1blBTeFOUn6Dg==", "MvQbJ");
        lIllIlIIll[lIllIlIllI[20]] = lIIllIIlIIlII("JO7iOpmpWGknk5AqrRkrtA==", "dJeEs");
        lIllIlIIll[lIllIlIllI[22]] = lIIllIIlIIIll("p4MLgNEfTtQ=", "cPHgK");
        lIllIlIIll[lIllIlIllI[24]] = lIIllIIlIIIll("uPLL9qeddKQDjc4agwpfIvhDIluitC+A", "kNkfT");
        lIllIlIIll[lIllIlIllI[26]] = lIIllIIlIIIlI("JDsqGzENKGYOMA4/NhUnFg==", "bZFzU");
        lIllIlIIll[lIllIlIllI[28]] = lIIllIIlIIlII("X3rBotvtdMKdQmpEzJI6UGilPHXJj6/B", "zNIjT");
        lIllIlIIll[lIllIlIllI[30]] = lIIllIIlIIIll("AdF4V+rnr4UKvu593TaZBbqcbXcKRJID", "wkJMP");
        lIllIlIIll[lIllIlIllI[32]] = lIIllIIlIIlII("xIXllkGJoHq+GX9sVsXobPBd2xShPBSU", "GbwNA");
        lIllIlIIll[lIllIlIllI[34]] = lIIllIIlIIlII("l2fm8bMfJHQ=", "xCuIb");
        lIllIlIIll[lIllIlIllI[35]] = lIIllIIlIIlII("hyHgIibfxLg=", "minFo");
        lIllIlIIll[lIllIlIllI[37]] = lIIllIIlIIIlI("RT88AQ4cdX1bSEZidVhCNhgHJkIuIj4cXlY/PAEOHHU=", "yKUub");
        lIllIlIIll[lIllIlIllI[38]] = lIIllIIlIIIll("KmUo6HLPbk1SgqqKSD5MdA==", "KGzZr");
    }

    private static void lIIllIIllIIlI() {
        lIllIlIllI = new int[40];
        lIllIlIllI[0] = (-((-9542) & 13687)) & (-16641) & 32765;
        lIllIlIllI[1] = (206 ^ 134) & ((250 ^ 178) ^ (-1));
        lIllIlIllI[2] = (-((-9379) & 31923)) & (-8449) & 32767;
        lIllIlIllI[3] = " ".length();
        lIllIlIllI[4] = (-((-6881) & 32747)) & (-6149) & 32575;
        lIllIlIllI[5] = "  ".length();
        lIllIlIllI[6] = (87 ^ 60) ^ (86 ^ 3);
        lIllIlIllI[7] = "   ".length();
        lIllIlIllI[8] = (-11) & 12910;
        lIllIlIllI[9] = (((144 + 36) - 92) + 66) ^ (((95 + 53) - 51) + 61);
        lIllIlIllI[10] = 154 ^ 159;
        lIllIlIllI[11] = (((67 + 135) - 100) + 56) ^ (((127 + 80) - 93) + 38);
        lIllIlIllI[12] = 47 ^ 40;
        lIllIlIllI[13] = (-((-45) & 27133)) & (-1) & 27614;
        lIllIlIllI[14] = 53 ^ 61;
        lIllIlIllI[15] = (-((-5415) & 14119)) & (-4117) & 14333;
        lIllIlIllI[16] = 149 ^ 156;
        lIllIlIllI[17] = (-21463) & 24567;
        lIllIlIllI[18] = (20 ^ 109) ^ (226 ^ 145);
        lIllIlIllI[19] = (-((-4739) & 31367)) & (-4609) & 32759;
        lIllIlIllI[20] = 162 ^ 169;
        lIllIlIllI[21] = (-((-21585) & 24275)) & (-9293) & 12255;
        lIllIlIllI[22] = (118 ^ 32) ^ (250 ^ 160);
        lIllIlIllI[23] = (-((-16567) & 24759)) & (-16545) & 32743;
        lIllIlIllI[24] = 135 ^ 138;
        lIllIlIllI[25] = (-161) & 8169;
        lIllIlIllI[26] = 174 ^ 160;
        lIllIlIllI[27] = (-((-2819) & 27559)) & (-18) & 32767;
        lIllIlIllI[28] = (38 ^ 63) ^ (43 ^ 61);
        lIllIlIllI[29] = (-(49 ^ 36)) & (-33) & 8063;
        lIllIlIllI[30] = 40 ^ 56;
        lIllIlIllI[31] = (-12297) & 31919;
        lIllIlIllI[32] = 180 ^ 165;
        lIllIlIllI[33] = (-8225) & 10209;
        lIllIlIllI[34] = (((65 + 143) - 185) + 122) ^ (((42 + 72) - 60) + 77);
        lIllIlIllI[35] = 139 ^ 152;
        lIllIlIllI[36] = (((102 ^ 84) + (((112 + 31) - 73) + 91)) - (253 ^ 185)) + (82 ^ 107);
        lIllIlIllI[37] = (165 ^ 188) ^ (1 ^ 12);
        lIllIlIllI[38] = (173 ^ 194) ^ (249 ^ 131);
        lIllIlIllI[39] = (63 ^ 31) ^ (90 ^ 108);
    }

    private static boolean lIIllIIllIlIl(int i) {
        return i != 0;
    }

    private static String b(String str) {
        String str2 = null;
        Matcher matcher = Pattern.compile(lIllIlIIll[lIllIlIllI[37]]).matcher(str);
        if (lIIllIIllIlIl(matcher.find() ? 1 : 0)) {
            str2 = matcher.group(lIllIlIllI[3]);
        }
        return str2;
    }

    static {
        lIIllIIllIIlI();
        lIIllIIllIIIl();
    }

    private static String lIIllIIlIIlII(String lllllllllllllllllllIIIlIIIIIllIl, String lllllllllllllllllllIIIlIIIIIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIlIIIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIlIllI[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIlIIIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIIlIIIIIlllI) {
            lllllllllllllllllllIIIlIIIIIlllI.printStackTrace();
            return null;
        }
    }

    public String d(int i) {
        ItemComposition itemComposition = M.getItemComposition(i);
        if (lIIllIIllIlII(itemComposition)) {
            String name = itemComposition.getName();
            "".length();
            if ((true ^ true) && ((true ^ true) ^ true)) {
                return null;
            }
            return name;
        }
        return lIllIlIIll[lIllIlIllI[38]];
    }

    private static String lIIllIIlIIIlI(String lllllllllllllllllllIIIlIIIlIIIlI, String lllllllllllllllllllIIIlIIIlIIIIl) {
        String lllllllllllllllllllIIIlIIIlIIIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllllllIIIlIIIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllllIIIlIIIlIIIIl.toCharArray();
        int lllllllllllllllllllIIIlIIIIllllI = lIllIlIllI[1];
        char[] charArray2 = lllllllllllllllllllIIIlIIIlIIIlI2.toCharArray();
        int lllllllllllllllllllIIIlIIIIlIlll = charArray2.length;
        int i = lIllIlIllI[1];
        while (lIIllIIllIllI(i, lllllllllllllllllllIIIlIIIIlIlll)) {
            char lllllllllllllllllllIIIlIIIlIIIll = charArray2[i];
            sb.append((char) (lllllllllllllllllllIIIlIIIlIIIll ^ charArray[lllllllllllllllllllIIIlIIIIllllI % charArray.length]));
            "".length();
            lllllllllllllllllllIIIlIIIIllllI++;
            i++;
            "".length();
            if ((((((23 + 67) - 72) + 134) ^ (((57 + 103) - 36) + 27)) & (((((146 + 125) - 103) + 4) ^ (((148 + 102) - 120) + 33)) ^ (-" ".length()))) != (((233 ^ 173) ^ (31 ^ 86)) & (((120 ^ 18) ^ (167 ^ 192)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
