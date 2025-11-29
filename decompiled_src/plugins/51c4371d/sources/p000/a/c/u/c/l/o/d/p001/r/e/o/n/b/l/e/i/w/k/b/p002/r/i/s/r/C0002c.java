package p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r;

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
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.c  reason: invalid package and case insensitive filesystem */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/c.class */
public class C0002c {
    private static /* synthetic */ ItemManager N;
    private static /* synthetic */ String[] lllIIllI;
    private static /* synthetic */ int[] lllIIlll;

    private static boolean lIlllllIllI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllllllIII(int i) {
        return i != 0;
    }

    public C0002c(ItemManager itemManager) {
        "".length();
        N = itemManager;
    }

    static {
        lIlllllIlIl();
        lIlllllIIll();
    }

    private static void lIlllllIIll() {
        lllIIllI = new String[lllIIlll[39]];
        lllIIllI[lllIIlll[1]] = lIlllllIIII("E/AWs1Nvc4+nKfkHVvFEJAllPIKWJGJp", "BCXHB");
        lllIIllI[lllIIlll[3]] = lIlllllIIIl("Jgo5FQgFRTINDBgW", "keUam");
        lllIIllI[lllIIlll[5]] = lIlllllIIII("0JcVGXhCQTiCwMhNLMRWdA==", "OtrMd");
        lllIIllI[lllIIlll[7]] = lIlllllIIII("g/hiBJGIlg9qjyVUpK0bJP5uL8Qk/6J9", "duAyK");
        lllIIllI[lllIIlll[9]] = lIlllllIIlI("QRu0p5zmw5vDX2yMzwWDAE9wYvl/ORaw", "CHRLf");
        lllIIllI[lllIIlll[10]] = lIlllllIIII("Vu0fqQ7GTV+THB1HleeOIw==", "hPKRT");
        lllIIllI[lllIIlll[11]] = lIlllllIIIl("CxkeFxwgWBgXACA=", "Exjbn");
        lllIIllI[lllIIlll[12]] = lIlllllIIIl("JQgUHSFIBQsfIwoGE1FsHUA=", "hidqD");
        lllIIllI[lllIIlll[14]] = lIlllllIIlI("wGvQ8PA4emY=", "yzJeG");
        lllIIllI[lllIIlll[16]] = lIlllllIIIl("NA4VDSBZAx0DMA==", "yordC");
        lllIIllI[lllIIlll[18]] = lIlllllIIlI("nvpJMvuTg8Yo5bJOrOP0Ww==", "htZQF");
        lllIIllI[lllIIlll[20]] = lIlllllIIII("aHJA1cBGSUdylPogZzBbIA==", "laaGa");
        lllIIllI[lllIIlll[22]] = lIlllllIIlI("+2NO0xZzeCo=", "Ieptq");
        lllIIllI[lllIIlll[24]] = lIlllllIIlI("Hb0iwx/pOZYef5hN4Cw/yDCuex0mfJ5H", "UsWmY");
        lllIIllI[lllIIlll[26]] = lIlllllIIlI("Tknv90SRtlJuNyIToRvfJvi0B6was2P1", "fjxaD");
        lllIIllI[lllIIlll[28]] = lIlllllIIlI("7csqm0xitxqtQrvcTRxnsjQ668gV8u/4", "cFUYM");
        lllIIllI[lllIIlll[30]] = lIlllllIIIl("BTcuIwEjKy9sACEpLzwbNjE=", "DEJLt");
        lllIIllI[lllIIlll[32]] = lIlllllIIII("jSq/ebxg5ZZJVrRbX9YUlNhCcV89wItw", "ApntA");
        lllIIllI[lllIIlll[34]] = lIlllllIIIl("MxkjLhwV", "pqFKo");
        lllIIllI[lllIIlll[35]] = lIlllllIIII("TsaVwGyeg4g=", "utOTI");
        lllIIllI[lllIIlll[37]] = lIlllllIIlI("7ztePaVXvSocFaH3G579q1Cus/6vTQ4cDyhCUFwsDcE/KJxf1cRZ7A==", "tEhla");
        lllIIllI[lllIIlll[38]] = lIlllllIIIl("DyI7Pz8tInAYJD8h", "ZLPQP");
    }

    private static String lIlllllIIlI(String lIlIIIIIllllllI, String lIlIIIIIlllllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIIIIlllllll.getBytes(StandardCharsets.UTF_8)), lllIIlll[14]), "DES");
            Cipher lIlIIIIlIIIIIlI = Cipher.getInstance("DES");
            lIlIIIIlIIIIIlI.init(lllIIlll[5], secretKeySpec);
            return new String(lIlIIIIlIIIIIlI.doFinal(Base64.getDecoder().decode(lIlIIIIIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIIIIlllllII) {
            lIlIIIIIlllllII.printStackTrace();
            return null;
        }
    }

    private static void lIlllllIlIl() {
        lllIIlll = new int[40];
        lllIIlll[0] = (-((-705) & 21492)) & (-1) & 32767;
        lllIIlll[1] = (146 ^ 184) & ((139 ^ 161) ^ (-1));
        lllIIlll[2] = (-24577) & 26351;
        lllIIlll[3] = " ".length();
        lllIIlll[4] = (-((-51) & 31231)) & (-1025) & 32765;
        lllIIlll[5] = "  ".length();
        lllIIlll[6] = 117 ^ 75;
        lllIIlll[7] = "   ".length();
        lllIIlll[8] = (-((-4929) & 24538)) & (-3) & 32511;
        lllIIlll[9] = (126 ^ 35) ^ (211 ^ 138);
        lllIIlll[10] = (44 ^ 28) ^ (141 ^ 184);
        lllIIlll[11] = (97 ^ 100) ^ "   ".length();
        lllIIlll[12] = (46 ^ 59) ^ (118 ^ 100);
        lllIIlll[13] = (-7378) & 7903;
        lllIIlll[14] = (227 ^ 138) ^ (218 ^ 187);
        lllIIlll[15] = (-((-481) & 20965)) & (-3) & 21999;
        lllIIlll[16] = (5 ^ 13) ^ " ".length();
        lllIIlll[17] = (-523) & 3627;
        lllIIlll[18] = (((99 + 27) - 120) + 128) ^ (((138 + 117) - 225) + 110);
        lllIIlll[19] = (-((-4147) & 12863)) & (-18433) & 28671;
        lllIIlll[20] = 51 ^ 56;
        lllIIlll[21] = (-23235) & 23507;
        lllIIlll[22] = 186 ^ 182;
        lllIIlll[23] = (-16393) & 24399;
        lllIIlll[24] = 51 ^ 62;
        lllIIlll[25] = (-165) & 8173;
        lllIIlll[26] = (215 ^ 153) ^ (117 ^ 53);
        lllIIlll[27] = (-8321) & 16330;
        lllIIlll[28] = (109 ^ 119) ^ (51 ^ 38);
        lllIIlll[29] = (-((-12611) & 29159)) & (-17) & 24575;
        lllIIlll[30] = 154 ^ 138;
        lllIIlll[31] = (-4937) & 24559;
        lllIIlll[32] = (((97 + 75) - 126) + 90) ^ (((86 + 86) - 169) + 150);
        lllIIlll[33] = (-((-10989) & 31471)) & (-10293) & 32759;
        lllIIlll[34] = 131 ^ 145;
        lllIIlll[35] = 35 ^ 48;
        lllIIlll[36] = (((46 ^ 31) + (((24 + 94) - 5) + 35)) - (-" ".length())) + "  ".length();
        lllIIlll[37] = (((127 + 44) - 31) + 16) ^ (((97 + 106) - 104) + 37);
        lllIIlll[38] = (((134 + 42) - 122) + 92) ^ (((9 + 57) - 63) + 132);
        lllIIlll[39] = (181 ^ 140) ^ (190 ^ 145);
    }

    private static boolean lIlllllIlll(Object obj) {
        return obj != null;
    }

    public String d(int i) {
        ItemComposition itemComposition = N.getItemComposition(i);
        if (lIlllllIlll(itemComposition)) {
            String name = itemComposition.getName();
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
            return name;
        }
        return lllIIllI[lllIIlll[38]];
    }

    public static String c(int i) {
        if (lIlllllIllI(i, lllIIlll[0])) {
            return lllIIllI[lllIIlll[1]];
        }
        if (lIlllllIllI(i, lllIIlll[2])) {
            return lllIIllI[lllIIlll[3]];
        }
        if (lIlllllIllI(i, lllIIlll[4])) {
            return lllIIllI[lllIIlll[5]];
        }
        if (lIlllllIllI(i, lllIIlll[6])) {
            return lllIIllI[lllIIlll[7]];
        }
        if (lIlllllIllI(i, lllIIlll[8])) {
            return lllIIllI[lllIIlll[9]];
        }
        if (lIlllllIllI(i, lllIIlll[2])) {
            return lllIIllI[lllIIlll[10]];
        }
        if (lIlllllIllI(i, lllIIlll[4])) {
            return lllIIllI[lllIIlll[11]];
        }
        if (lIlllllIllI(i, lllIIlll[6])) {
            return lllIIllI[lllIIlll[12]];
        }
        if (lIlllllIllI(i, lllIIlll[13])) {
            return lllIIllI[lllIIlll[14]];
        }
        if (lIlllllIllI(i, lllIIlll[15])) {
            return lllIIllI[lllIIlll[16]];
        }
        if (lIlllllIllI(i, lllIIlll[17])) {
            return lllIIllI[lllIIlll[18]];
        }
        if (lIlllllIllI(i, lllIIlll[19])) {
            return lllIIllI[lllIIlll[20]];
        }
        if (lIlllllIllI(i, lllIIlll[21])) {
            return lllIIllI[lllIIlll[22]];
        }
        if (lIlllllIllI(i, lllIIlll[23])) {
            return lllIIllI[lllIIlll[24]];
        }
        if (lIlllllIllI(i, lllIIlll[25])) {
            return lllIIllI[lllIIlll[26]];
        }
        if (lIlllllIllI(i, lllIIlll[27])) {
            return lllIIllI[lllIIlll[28]];
        }
        if (lIlllllIllI(i, lllIIlll[29])) {
            return lllIIllI[lllIIlll[30]];
        }
        if (lIlllllIllI(i, lllIIlll[31])) {
            return lllIIllI[lllIIlll[32]];
        }
        if (lIlllllIllI(i, lllIIlll[33])) {
            return lllIIllI[lllIIlll[34]];
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://oldschool.runescape.wiki/w/Special:Lookup?type=item&id=" + i).openConnection();
            httpURLConnection.setRequestMethod(lllIIllI[lllIIlll[35]]);
            if (!lIlllllIllI(httpURLConnection.getResponseCode(), lllIIlll[36])) {
                "".length();
                return " ".length() == 0 ? null : null;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            do {
                String readLine = bufferedReader.readLine();
                if (!lIlllllIlll(readLine)) {
                    bufferedReader.close();
                    return b(String.valueOf(sb));
                }
                sb.append(readLine);
                "".length();
                "".length();
            } while ("   ".length() != (4 ^ 0));
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String lIlllllIIIl(String lIlIIIIIllIIIll, String lIlIIIIIllIIIlI) {
        String lIlIIIIIllIIIll2 = new String(Base64.getDecoder().decode(lIlIIIIIllIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIIIIIllIIIIl = new StringBuilder();
        char[] charArray = lIlIIIIIllIIIlI.toCharArray();
        int lIlIIIIIlIlllll = lllIIlll[1];
        char[] charArray2 = lIlIIIIIllIIIll2.toCharArray();
        int lIlIIIIIlIllIII = charArray2.length;
        int i = lllIIlll[1];
        while (lIllllllIIl(i, lIlIIIIIlIllIII)) {
            char lIlIIIIIllIIlII = charArray2[i];
            lIlIIIIIllIIIIl.append((char) (lIlIIIIIllIIlII ^ charArray[lIlIIIIIlIlllll % charArray.length]));
            "".length();
            lIlIIIIIlIlllll++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(lIlIIIIIllIIIIl);
    }

    private static String b(String str) {
        String str2 = null;
        Matcher matcher = Pattern.compile(lllIIllI[lllIIlll[37]]).matcher(str);
        if (lIllllllIII(matcher.find() ? 1 : 0)) {
            str2 = matcher.group(lllIIlll[3]);
        }
        return str2;
    }

    private static String lIlllllIIII(String lIlIIIIIlllIIll, String lIlIIIIIlllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIIIIlllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIIIIIlllIlIl = Cipher.getInstance("Blowfish");
            lIlIIIIIlllIlIl.init(lllIIlll[5], secretKeySpec);
            return new String(lIlIIIIIlllIlIl.doFinal(Base64.getDecoder().decode(lIlIIIIIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIIIIlllIlII) {
            lIlIIIIIlllIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllllIIl(int i, int i2) {
        return i < i2;
    }
}
