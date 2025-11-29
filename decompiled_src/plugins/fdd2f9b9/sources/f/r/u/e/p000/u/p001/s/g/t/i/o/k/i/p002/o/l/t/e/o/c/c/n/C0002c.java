package f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n;

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
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.c  reason: invalid package and case insensitive filesystem */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/c.class */
public class C0002c {
    private static /* synthetic */ int[] lIIllIIlII;
    private static /* synthetic */ ItemManager N;
    private static /* synthetic */ String[] lIIllIIIll;

    private static String b(String str) {
        String str2 = null;
        Matcher matcher = Pattern.compile(lIIllIIIll[lIIllIIlII[37]]).matcher(str);
        if (lIIIIIIllIllI(matcher.find() ? 1 : 0)) {
            str2 = matcher.group(lIIllIIlII[3]);
        }
        return str2;
    }

    private static boolean lIIIIIIllIllI(int i) {
        return i != 0;
    }

    public static String c(int i) {
        if (lIIIIIIllIlII(i, lIIllIIlII[0])) {
            return lIIllIIIll[lIIllIIlII[1]];
        }
        if (lIIIIIIllIlII(i, lIIllIIlII[2])) {
            return lIIllIIIll[lIIllIIlII[3]];
        }
        if (lIIIIIIllIlII(i, lIIllIIlII[4])) {
            return lIIllIIIll[lIIllIIlII[5]];
        }
        if (lIIIIIIllIlII(i, lIIllIIlII[6])) {
            return lIIllIIIll[lIIllIIlII[7]];
        }
        if (lIIIIIIllIlII(i, lIIllIIlII[8])) {
            return lIIllIIIll[lIIllIIlII[9]];
        }
        if (lIIIIIIllIlII(i, lIIllIIlII[2])) {
            return lIIllIIIll[lIIllIIlII[10]];
        }
        if (lIIIIIIllIlII(i, lIIllIIlII[4])) {
            return lIIllIIIll[lIIllIIlII[11]];
        }
        if (lIIIIIIllIlII(i, lIIllIIlII[6])) {
            return lIIllIIIll[lIIllIIlII[12]];
        }
        if (lIIIIIIllIlII(i, lIIllIIlII[13])) {
            return lIIllIIIll[lIIllIIlII[14]];
        }
        if (lIIIIIIllIlII(i, lIIllIIlII[15])) {
            return lIIllIIIll[lIIllIIlII[16]];
        }
        if (lIIIIIIllIlII(i, lIIllIIlII[17])) {
            return lIIllIIIll[lIIllIIlII[18]];
        }
        if (lIIIIIIllIlII(i, lIIllIIlII[19])) {
            return lIIllIIIll[lIIllIIlII[20]];
        }
        if (lIIIIIIllIlII(i, lIIllIIlII[21])) {
            return lIIllIIIll[lIIllIIlII[22]];
        }
        if (lIIIIIIllIlII(i, lIIllIIlII[23])) {
            return lIIllIIIll[lIIllIIlII[24]];
        }
        if (lIIIIIIllIlII(i, lIIllIIlII[25])) {
            return lIIllIIIll[lIIllIIlII[26]];
        }
        if (lIIIIIIllIlII(i, lIIllIIlII[27])) {
            return lIIllIIIll[lIIllIIlII[28]];
        }
        if (lIIIIIIllIlII(i, lIIllIIlII[29])) {
            return lIIllIIIll[lIIllIIlII[30]];
        }
        if (lIIIIIIllIlII(i, lIIllIIlII[31])) {
            return lIIllIIIll[lIIllIIlII[32]];
        }
        if (lIIIIIIllIlII(i, lIIllIIlII[33])) {
            return lIIllIIIll[lIIllIIlII[34]];
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://oldschool.runescape.wiki/w/Special:Lookup?type=item&id=" + i).openConnection();
            httpURLConnection.setRequestMethod(lIIllIIIll[lIIllIIlII[35]]);
            if (!lIIIIIIllIlII(httpURLConnection.getResponseCode(), lIIllIIlII[36])) {
                "".length();
                return (true ^ true) & ((true ^ true) ^ true) ? null : null;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            do {
                String readLine = bufferedReader.readLine();
                if (!lIIIIIIllIlIl(readLine)) {
                    bufferedReader.close();
                    return b(String.valueOf(sb));
                }
                sb.append(readLine);
                "".length();
                "".length();
            } while ((-" ".length()) <= "  ".length());
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String lIIIIIIllIIIl(String llllllllllllllllllllllIIIIIlIllI, String llllllllllllllllllllllIIIIIlIlIl) {
        String llllllllllllllllllllllIIIIIlIllI2 = new String(Base64.getDecoder().decode(llllllllllllllllllllllIIIIIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllllllIIIIIlIlII = new StringBuilder();
        char[] charArray = llllllllllllllllllllllIIIIIlIlIl.toCharArray();
        int llllllllllllllllllllllIIIIIlIIlI = lIIllIIlII[1];
        char[] charArray2 = llllllllllllllllllllllIIIIIlIllI2.toCharArray();
        int length = charArray2.length;
        int llllllllllllllllllllllIIIIIIlIlI = lIIllIIlII[1];
        while (lIIIIIIllIlll(llllllllllllllllllllllIIIIIIlIlI, length)) {
            char llllllllllllllllllllllIIIIIlIlll = charArray2[llllllllllllllllllllllIIIIIIlIlI];
            llllllllllllllllllllllIIIIIlIlII.append((char) (llllllllllllllllllllllIIIIIlIlll ^ charArray[llllllllllllllllllllllIIIIIlIIlI % charArray.length]));
            "".length();
            llllllllllllllllllllllIIIIIlIIlI++;
            llllllllllllllllllllllIIIIIIlIlI++;
            "".length();
            if ((-(54 ^ 50)) > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllllllIIIIIlIlII);
    }

    public C0002c(ItemManager itemManager) {
        "".length();
        N = itemManager;
    }

    private static boolean lIIIIIIllIlIl(Object obj) {
        return obj != null;
    }

    private static String lIIIIIIllIIII(String llllllllllllllllllllllIIIIllIIll, String llllllllllllllllllllllIIIIllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllllIIIIllIIlI.getBytes(StandardCharsets.UTF_8)), lIIllIIlII[14]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllIIlII[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllllllIIIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllllIIIIllIlII) {
            llllllllllllllllllllllIIIIllIlII.printStackTrace();
            return null;
        }
    }

    private static String lIIIIIIlIllll(String llllllllllllllllllllllIIIIlIIllI, String llllllllllllllllllllllIIIIlIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllllIIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllIIlII[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllllllIIIIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllllIIIIlIIlll) {
            llllllllllllllllllllllIIIIlIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIllIlll(int i, int i2) {
        return i < i2;
    }

    private static void lIIIIIIllIIlI() {
        lIIllIIIll = new String[lIIllIIlII[39]];
        lIIllIIIll[lIIllIIlII[1]] = lIIIIIIlIllll("xyV26g0o2TRWij7eH5mevlw0x8X1mMHi", "zNEpB");
        lIIllIIIll[lIIllIIlII[3]] = lIIIIIIlIllll("8nxPpQ1swOGGhNh/9XqJIQ==", "wgGoh");
        lIIllIIIll[lIIllIIlII[5]] = lIIIIIIllIIII("43h87Vtr/CXgi9+3GsSuiw==", "AOJUf");
        lIIllIIIll[lIIllIIlII[7]] = lIIIIIIllIIII("pGDaZC6L4wy7Q7H3ZqwXKF8qbE1Pufm5", "zmJOL");
        lIIllIIIll[lIIllIIlII[9]] = lIIIIIIllIIIl("PQMHIikaCgEuaBwCHCMrSBkWIywNAxA=", "hmdJH");
        lIIllIIIll[lIIllIIlII[10]] = lIIIIIIllIIII("7Y0p4IlYvmuEFg0N8e+B4A==", "vYMJL");
        lIIllIIIll[lIIllIIlII[11]] = lIIIIIIllIIIl("FBcdIDY/VhsgKj8=", "ZviUD");
        lIIllIIIll[lIIllIIlII[12]] = lIIIIIIlIllll("8+Fq+jaiti+sHsAaTzl5f5s7ulRy8Yb0", "VCAQF");
        lIIllIIIll[lIIllIIlII[14]] = lIIIIIIlIllll("4aAQaXINEa8=", "YLDTs");
        lIIllIIIll[lIIllIIlII[16]] = lIIIIIIllIIII("iypt/KKumaALuGvptEgBeg==", "wIqLb");
        lIIllIIIll[lIIllIIlII[18]] = lIIIIIIlIllll("8amGN5V7vuFc98RCMT7O6w==", "xdYWd");
        lIIllIIIll[lIIllIIlII[20]] = lIIIIIIlIllll("TS+SvjEIJREHf22z7V6+Ng==", "tVUrE");
        lIIllIIIll[lIIllIIlII[22]] = lIIIIIIllIIIl("IgkcHAEc", "rfuon");
        lIIllIIIll[lIIllIIlII[24]] = lIIIIIIllIIII("ouHQ0JICAKRKxH1pw9Xmr1rypDGEOewq", "qMLrf");
        lIIllIIIll[lIIllIIlII[26]] = lIIIIIIllIIII("eydncGgmffS2qkARU/xeAE240HHq2Axv", "WDNgP");
        lIIllIIIll[lIIllIIlII[28]] = lIIIIIIlIllll("yk71NSn4oUR0YGEqe2S5oyJAJ2lr+ID5", "PapNh");
        lIIllIIIll[lIIllIIlII[30]] = lIIIIIIlIllll("bXXzbj0UHaphd8fSg/hm0GQKQ6hem2a4", "GuFUY");
        lIIllIIIll[lIIllIIlII[32]] = lIIIIIIllIIII("eghyyihc/HGeEfhjO8hsgS8JmhzOyE/c", "mGlpG");
        lIIllIIIll[lIIllIIlII[34]] = lIIIIIIlIllll("tGDCEBZ9KbQ=", "SJTyQ");
        lIIllIIIll[lIIllIIlII[35]] = lIIIIIIlIllll("pCua8Ln6Djs=", "ldCKL");
        lIIllIIIll[lIIllIIlII[37]] = lIIIIIIlIllll("YdifAxlrq7d236XBpS655rXbj56f/jD7BnZvnYirbdMlGp975q7qCg==", "CmmfO");
        lIIllIIIll[lIIllIIlII[38]] = lIIIIIIllIIIl("ACAoJzwiIGMAJzAj", "UNCIS");
    }

    private static void lIIIIIIllIIll() {
        lIIllIIlII = new int[40];
        lIIllIIlII[0] = (-"  ".length()) & (-16433) & 28413;
        lIIllIIlII[1] = (133 ^ 187) & ((126 ^ 64) ^ (-1));
        lIIllIIlII[2] = (-((-16967) & 31575)) & (-1) & 16383;
        lIIllIIlII[3] = " ".length();
        lIIllIIlII[4] = (-13385) & 13945;
        lIIllIIlII[5] = "  ".length();
        lIIllIIlII[6] = 9 ^ 55;
        lIIllIIlII[7] = "   ".length();
        lIIllIIlII[8] = (-19482) & 32381;
        lIIllIIlII[9] = 140 ^ 136;
        lIIllIIlII[10] = 110 ^ 107;
        lIIllIIlII[11] = 95 ^ 89;
        lIIllIIlII[12] = (233 ^ 153) ^ (193 ^ 182);
        lIIllIIlII[13] = (-31218) & 31743;
        lIIllIIlII[14] = 129 ^ 137;
        lIIllIIlII[15] = (-8199) & 9711;
        lIIllIIlII[16] = 32 ^ 41;
        lIIllIIlII[17] = (-((-6471) & 31183)) & (-4947) & 32763;
        lIIllIIlII[18] = (18 ^ 126) ^ (21 ^ 115);
        lIIllIIlII[19] = (-((-9719) & 32759)) & (-9) & 24571;
        lIIllIIlII[20] = 33 ^ 42;
        lIIllIIlII[21] = (-(226 ^ 197)) & (-13321) & 13631;
        lIIllIIlII[22] = 85 ^ 89;
        lIIllIIlII[23] = (-24721) & 32727;
        lIIllIIlII[24] = (((32 + 73) - 51) + 74) ^ (((63 + 54) - 30) + 54);
        lIIllIIlII[25] = (-((-15129) & 31675)) & (-8213) & 32767;
        lIIllIIlII[26] = 17 ^ 31;
        lIIllIIlII[27] = (-((-3821) & 28414)) & (-165) & 32767;
        lIIllIIlII[28] = (64 ^ 113) ^ (255 ^ 193);
        lIIllIIlII[29] = (-((-579) & 25335)) & (-1) & 32767;
        lIIllIIlII[30] = 103 ^ 119;
        lIIllIIlII[31] = (-((-24583) & 25119)) & (-4353) & 24511;
        lIIllIIlII[32] = (84 ^ 121) ^ (134 ^ 186);
        lIIllIIlII[33] = (-14397) & 16381;
        lIIllIIlII[34] = (80 ^ 38) ^ (48 ^ 84);
        lIIllIIlII[35] = (125 ^ 47) ^ (76 ^ 13);
        lIIllIIlII[36] = ((1 + 145) - 104) + 158;
        lIIllIIlII[37] = 175 ^ 187;
        lIIllIIlII[38] = 100 ^ 113;
        lIIllIIlII[39] = 57 ^ 47;
    }

    private static boolean lIIIIIIllIlII(int i, int i2) {
        return i == i2;
    }

    static {
        lIIIIIIllIIll();
        lIIIIIIllIIlI();
    }

    public String d(int i) {
        ItemComposition itemComposition = N.getItemComposition(i);
        if (lIIIIIIllIlIl(itemComposition)) {
            String name = itemComposition.getName();
            "".length();
            if (((16 ^ 46) & ((159 ^ 161) ^ (-1))) < 0) {
                return null;
            }
            return name;
        }
        return lIIllIIIll[lIIllIIlII[38]];
    }
}
