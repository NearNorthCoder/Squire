package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.c  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/c.class */
public class C0016c {
    private static /* synthetic */ int[] lllIIllIII;
    private static /* synthetic */ ItemManager M;
    private static /* synthetic */ String[] lllIIlIlll;

    private static boolean llIIIIIlllllI(int i, int i2) {
        return i < i2;
    }

    private static String b(String str) {
        String str2 = null;
        Matcher matcher = Pattern.compile(lllIIlIlll[lllIIllIII[35]]).matcher(str);
        if (llIIIIIllllIl(matcher.find() ? 1 : 0)) {
            str2 = matcher.group(lllIIllIII[3]);
        }
        return str2;
    }

    private static String llIIIIIlllIII(String lllllllllllllllllIlllIlIIlIIlIIl, String lllllllllllllllllIlllIlIIlIIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIlIIlIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlllIlIIlIIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlllIlIIlIIlIll.init(lllIIllIII[5], secretKeySpec);
            return new String(lllllllllllllllllIlllIlIIlIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIlIIlIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlllIlIIlIIlIlI) {
            lllllllllllllllllIlllIlIIlIIlIlI.printStackTrace();
            return null;
        }
    }

    static {
        llIIIIIlllIlI();
        llIIIIIlllIIl();
    }

    private static String llIIIIIllIlll(String lllllllllllllllllIlllIlIIIlllIIl, String lllllllllllllllllIlllIlIIIlllIII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllIlllIlIIIlllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllllIlllIlIIIllIllI = lllllllllllllllllIlllIlIIIlllIII.toCharArray();
        int lllllllllllllllllIlllIlIIIllIlIl = lllIIllIII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIIllIII[1];
        while (llIIIIIlllllI(i, length)) {
            char lllllllllllllllllIlllIlIIIlllIlI = charArray[i];
            sb.append((char) (lllllllllllllllllIlllIlIIIlllIlI ^ lllllllllllllllllIlllIlIIIllIllI[lllllllllllllllllIlllIlIIIllIlIl % lllllllllllllllllIlllIlIIIllIllI.length]));
            "".length();
            lllllllllllllllllIlllIlIIIllIlIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String llIIIIIllIllI(String lllllllllllllllllIlllIlIIlIlIllI, String lllllllllllllllllIlllIlIIlIlIlIl) {
        try {
            SecretKeySpec lllllllllllllllllIlllIlIIlIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIlIIlIlIlIl.getBytes(StandardCharsets.UTF_8)), lllIIllIII[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIllIII[5], lllllllllllllllllIlllIlIIlIllIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIlIIlIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlllIlIIlIlIlll) {
            lllllllllllllllllIlllIlIIlIlIlll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIllllII(Object obj) {
        return obj != null;
    }

    public C0016c(ItemManager itemManager) {
        "".length();
        M = itemManager;
    }

    private static void llIIIIIlllIlI() {
        lllIIllIII = new int[38];
        lllIIllIII[0] = (-4353) & 16332;
        lllIIllIII[1] = ((49 ^ 36) ^ (48 ^ 109)) & (((97 ^ 40) ^ " ".length()) ^ (-" ".length()));
        lllIIllIII[2] = (-((-1601) & 5969)) & (-1) & 6143;
        lllIIllIII[3] = " ".length();
        lllIIllIII[4] = (-24909) & 25469;
        lllIIllIII[5] = "  ".length();
        lllIIllIII[6] = (8 ^ 32) ^ (110 ^ 120);
        lllIIllIII[7] = "   ".length();
        lllIIllIII[8] = (-(206 ^ 197)) & (-1170) & 14079;
        lllIIllIII[9] = (32 ^ 121) ^ (196 ^ 153);
        lllIIllIII[10] = 130 ^ 135;
        lllIIllIII[11] = (-29970) & 30495;
        lllIIllIII[12] = (107 ^ 125) ^ (149 ^ 133);
        lllIIllIII[13] = (-513) & 2025;
        lllIIllIII[14] = (126 ^ 105) ^ (39 ^ 55);
        lllIIllIII[15] = (-((-19569) & 32507)) & (-81) & 16123;
        lllIIllIII[16] = 164 ^ 172;
        lllIIllIII[17] = (-((-9463) & 31991)) & (-8201) & 32251;
        lllIIllIII[18] = (208 ^ 139) ^ (213 ^ 135);
        lllIIllIII[19] = (-28677) & 28949;
        lllIIllIII[20] = (49 ^ 35) ^ (17 ^ 9);
        lllIIllIII[21] = (-(219 ^ 194)) & (-24609) & 32639;
        lllIIllIII[22] = 154 ^ 145;
        lllIIllIII[23] = (-24739) & 32747;
        lllIIllIII[24] = 184 ^ 180;
        lllIIllIII[25] = (-24578) & 32587;
        lllIIllIII[26] = (250 ^ 131) ^ (39 ^ 83);
        lllIIllIII[27] = (-((-22419) & 30647)) & (-1) & 16239;
        lllIIllIII[28] = 29 ^ 19;
        lllIIllIII[29] = (-12561) & 32183;
        lllIIllIII[30] = 68 ^ 75;
        lllIIllIII[31] = (-((-3977) & 32655)) & (-2057) & 32719;
        lllIIllIII[32] = (((62 + 42) - 3) + 41) ^ (((140 + 96) - 231) + 153);
        lllIIllIII[33] = (((27 + 42) - 39) + 109) ^ (((140 + 151) - 215) + 78);
        lllIIllIII[34] = (((88 ^ 28) + (((111 + 182) - 248) + 142)) - (((104 + 85) - 115) + 144)) + ((68 + 107) - 151) + 139;
        lllIIllIII[35] = (203 ^ 130) ^ (27 ^ 64);
        lllIIllIII[36] = (39 ^ 5) ^ (156 ^ 173);
        lllIIllIII[37] = (253 ^ 149) ^ (99 ^ 31);
    }

    private static void llIIIIIlllIIl() {
        lllIIlIlll = new String[lllIIllIII[37]];
        lllIIlIlll[lllIIllIII[1]] = llIIIIIllIllI("QL2lg7Y95h1qudwBM7H0ytATfM0xd82x", "tmWEw");
        lllIIlIlll[lllIIllIII[3]] = llIIIIIllIlll("PQgGBBQeRw0cEAMU", "pgjpq");
        lllIIlIlll[lllIIllIII[5]] = llIIIIIllIlll("Kg4eEAIBTxgQHgE=", "dojep");
        lllIIlIlll[lllIIllIII[7]] = llIIIIIllIlll("ICYBFTBNKx4XMg8oBll9GG4=", "mGqyU");
        lllIIlIlll[lllIIllIII[9]] = llIIIIIllIllI("Vjzv0idaGJGn6EdMaJHZkxKklWSyWcbV", "JnglI");
        lllIIlIlll[lllIIllIII[10]] = llIIIIIllIlll("DgMuIQ8tTCU5CzAf", "ClBUj");
        lllIIlIlll[lllIIllIII[12]] = llIIIIIllIllI("cY9gr7mondE=", "zQhuw");
        lllIIlIlll[lllIIllIII[14]] = llIIIIIllIlll("Cy0vBjJmICcIIg==", "FLHoQ");
        lllIIlIlll[lllIIllIII[16]] = llIIIIIllIlll("NAITIygeAB1uKBgBDj0=", "wnzNJ");
        lllIIlIlll[lllIIllIII[18]] = llIIIIIllIlll("JwQpPgECCCE=", "kkJUq");
        lllIIlIlll[lllIIllIII[20]] = llIIIIIllIllI("2dnoOir1M7U=", "NmzNV");
        lllIIlIlll[lllIIllIII[22]] = llIIIIIllIllI("aCD7SrpYfnd+Zbeqgtz7Yi/YcHrrf0dy", "LJKAO");
        lllIIlIlll[lllIIllIII[24]] = llIIIIIllIlll("IQsvEDYIGGMFNwsPMx4gEw==", "gjCqR");
        lllIIlIlll[lllIIllIII[26]] = llIIIIIllIllI("1WvDHo5u9ZQY0i51owypPdcj1MBNAf53", "gCfTl");
        lllIIlIlll[lllIIllIII[28]] = llIIIIIllIlll("LxoRCDwJBhBHPQsEEBcmHBw=", "nhugI");
        lllIIlIlll[lllIIllIII[30]] = llIIIIIllIlll("PA8gGE0KGDcDGAwENkwZDgY2HAIZHg==", "kjSlm");
        lllIIlIlll[lllIIllIII[32]] = llIIIIIllIlll("LB0kHQoK", "ouAxy");
        lllIIlIlll[lllIIllIII[33]] = llIIIIIlllIII("xxb5sTgoUeg=", "soBQv");
        lllIIlIlll[lllIIllIII[35]] = llIIIIIllIllI("qIExFyw54nTEfZ+r4uNmv8mUgt8w5tgjTnFeErdhG/dtFOSv4mgo8Q==", "zeiqh");
        lllIIlIlll[lllIIllIII[36]] = llIIIIIllIllI("HaQSWPDChy5KG0yYb5F6sA==", "QJvgO");
    }

    private static boolean llIIIIIllllIl(int i) {
        return i != 0;
    }

    private static boolean llIIIIIlllIll(int i, int i2) {
        return i == i2;
    }

    public String d(int i) {
        ItemComposition itemComposition = M.getItemComposition(i);
        if (llIIIIIllllII(itemComposition)) {
            String name = itemComposition.getName();
            "".length();
            if ("  ".length() < " ".length()) {
                return null;
            }
            return name;
        }
        return lllIIlIlll[lllIIllIII[36]];
    }

    public static String c(int i) {
        if (llIIIIIlllIll(i, lllIIllIII[0])) {
            return lllIIlIlll[lllIIllIII[1]];
        }
        if (llIIIIIlllIll(i, lllIIllIII[2])) {
            return lllIIlIlll[lllIIllIII[3]];
        }
        if (llIIIIIlllIll(i, lllIIllIII[4])) {
            return lllIIlIlll[lllIIllIII[5]];
        }
        if (llIIIIIlllIll(i, lllIIllIII[6])) {
            return lllIIlIlll[lllIIllIII[7]];
        }
        if (llIIIIIlllIll(i, lllIIllIII[8])) {
            return lllIIlIlll[lllIIllIII[9]];
        }
        if (llIIIIIlllIll(i, lllIIllIII[2])) {
            return lllIIlIlll[lllIIllIII[10]];
        }
        if (llIIIIIlllIll(i, lllIIllIII[11])) {
            return lllIIlIlll[lllIIllIII[12]];
        }
        if (llIIIIIlllIll(i, lllIIllIII[13])) {
            return lllIIlIlll[lllIIllIII[14]];
        }
        if (llIIIIIlllIll(i, lllIIllIII[15])) {
            return lllIIlIlll[lllIIllIII[16]];
        }
        if (llIIIIIlllIll(i, lllIIllIII[17])) {
            return lllIIlIlll[lllIIllIII[18]];
        }
        if (llIIIIIlllIll(i, lllIIllIII[19])) {
            return lllIIlIlll[lllIIllIII[20]];
        }
        if (llIIIIIlllIll(i, lllIIllIII[21])) {
            return lllIIlIlll[lllIIllIII[22]];
        }
        if (llIIIIIlllIll(i, lllIIllIII[23])) {
            return lllIIlIlll[lllIIllIII[24]];
        }
        if (llIIIIIlllIll(i, lllIIllIII[25])) {
            return lllIIlIlll[lllIIllIII[26]];
        }
        if (llIIIIIlllIll(i, lllIIllIII[27])) {
            return lllIIlIlll[lllIIllIII[28]];
        }
        if (llIIIIIlllIll(i, lllIIllIII[29])) {
            return lllIIlIlll[lllIIllIII[30]];
        }
        if (llIIIIIlllIll(i, lllIIllIII[31])) {
            return lllIIlIlll[lllIIllIII[32]];
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://oldschool.runescape.wiki/w/Special:Lookup?type=item&id=" + i).openConnection();
            httpURLConnection.setRequestMethod(lllIIlIlll[lllIIllIII[33]]);
            int lllllllllllllllllIlllIlIIlllIIII = httpURLConnection.getResponseCode();
            if (!llIIIIIlllIll(lllllllllllllllllIlllIlIIlllIIII, lllIIllIII[34])) {
                "".length();
                return 0 != 0 ? null : null;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            do {
                String readLine = bufferedReader.readLine();
                if (!llIIIIIllllII(readLine)) {
                    bufferedReader.close();
                    return b(String.valueOf(sb));
                }
                sb.append(readLine);
                "".length();
                "".length();
            } while ((true ^ true) != ((true ^ true) & ((true ^ true) ^ true)));
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
