package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

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
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.c  reason: invalid package and case insensitive filesystem */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/c.class */
public class C0002c {
    private static /* synthetic */ int[] lIIIIIIlIIl;
    private static /* synthetic */ ItemManager M;
    private static /* synthetic */ String[] lIIIIIIlIII;

    private static boolean llIllIlllIllI(int i, int i2) {
        return i < i2;
    }

    private static boolean llIllIlllIlII(Object obj) {
        return obj != null;
    }

    static {
        llIllIlllIIlI();
        llIllIlllIIIl();
    }

    private static String llIllIllIllll(String lllllllllllllllllIIlllllIIlIIllI, String lllllllllllllllllIIlllllIIlIIlIl) {
        try {
            SecretKeySpec lllllllllllllllllIIlllllIIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIIlllllIIlIIlIl.getBytes(StandardCharsets.UTF_8)), lIIIIIIlIIl[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIIlIIl[5], lllllllllllllllllIIlllllIIlIlIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIIlllllIIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIIlllllIIlIIlll) {
            lllllllllllllllllIIlllllIIlIIlll.printStackTrace();
            return null;
        }
    }

    private static void llIllIlllIIIl() {
        lIIIIIIlIII = new String[lIIIIIIlIIl[37]];
        lIIIIIIlIII[lIIIIIIlIIl[1]] = llIllIllIlllI("TtlI/WdZL+PmuvdL8I2rcb0Y/I1GigUm", "cGVDI");
        lIIIIIIlIII[lIIIIIIlIIl[3]] = llIllIllIlllI("aSb42Jcwc8j/9/fqy9Zpng==", "TUbFE");
        lIIIIIIlIII[lIIIIIIlIIl[5]] = llIllIllIllll("2RoxUjohEJ7ufpHEnG2Owg==", "TtwOe");
        lIIIIIIlIII[lIIIIIIlIIl[7]] = llIllIllIlllI("h1tCEZ9IB26Xgfh/tRuerbrGeuqqj3TO", "pTxnJ");
        lIIIIIIlIII[lIIIIIIlIIl[9]] = llIllIllIllll("jXFgj4f8WXDk6O47MJvg/KeQs34pwSIa", "WZwdb");
        lIIIIIIlIII[lIIIIIIlIIl[10]] = llIllIllIlllI("IoNSpd+zTUoqQuEeSZw43Q==", "ecnlL");
        lIIIIIIlIII[lIIIIIIlIIl[12]] = llIllIllIllll("WlJujkLERYg=", "WBaGX");
        lIIIIIIlIII[lIIIIIIlIIl[14]] = llIllIllIllll("pyKouvlY5AdGy89TBPs+DQ==", "FkYVo");
        lIIIIIIlIII[lIIIIIIlIIl[16]] = llIllIlllIIII("LiQoNQEEJiZ4AQInNSs=", "mHAXc");
        lIIIIIIlIII[lIIIIIIlIIl[18]] = llIllIllIllll("2pkFlsVrdkjIHf8TTXJkbQ==", "elTAA");
        lIIIIIIlIII[lIIIIIIlIIl[20]] = llIllIllIlllI("S5CS0CPYQc8=", "vFhxN");
        lIIIIIIlIII[lIIIIIIlIIl[22]] = llIllIllIllll("hKZmie4FCdOTS5/U8yWmNogVNk+y9XPl", "yaCjF");
        lIIIIIIlIII[lIIIIIIlIIl[24]] = llIllIlllIIII("MhY6NA0bBXYhDBgSJjobAA==", "twVUi");
        lIIIIIIlIII[lIIIIIIlIIl[26]] = llIllIllIlllI("/uzLEz88KoJ/LHUv4mp2gmg1qTLHk6TS", "ZiMOf");
        lIIIIIIlIII[lIIIIIIlIIl[28]] = llIllIllIlllI("FGJILfqWyGpLMWnvVTDBX4ZEJPVffC5c", "faNNC");
        lIIIIIIlIII[lIIIIIIlIIl[30]] = llIllIlllIIII("IgIqM2MUFT0oNhIJPGc3EAs8NywHEw==", "ugYGC");
        lIIIIIIlIII[lIIIIIIlIIl[32]] = llIllIlllIIII("FQoREioz", "VbtwY");
        lIIIIIIlIII[lIIIIIIlIIl[33]] = llIllIllIllll("oexNtROGSjM=", "kqVKc");
        lIIIIIIlIII[lIIIIIIlIIl[35]] = llIllIllIllll("tHPd5EMr7cXYL5TK4FnPXDIySGg9HO+OkX7QEqOykxmsEUYc0OEotg==", "qbFlF");
        lIIIIIIlIII[lIIIIIIlIIl[36]] = llIllIllIllll("cOYNOzDmabtvt6VgrwjXMw==", "ykOew");
    }

    private static boolean llIllIlllIlIl(int i) {
        return i != 0;
    }

    private static void llIllIlllIIlI() {
        lIIIIIIlIIl = new int[38];
        lIIIIIIlIIl[0] = (-((-1485) & 21999)) & (-258) & 32751;
        lIIIIIIlIIl[1] = (131 ^ 174) & ((189 ^ 144) ^ (-1));
        lIIIIIIlIIl[2] = (-((-1831) & 32551)) & (-273) & 32767;
        lIIIIIIlIIl[3] = " ".length();
        lIIIIIIlIIl[4] = (-8579) & 9139;
        lIIIIIIlIIl[5] = "  ".length();
        lIIIIIIlIIl[6] = 52 ^ 10;
        lIIIIIIlIIl[7] = "   ".length();
        lIIIIIIlIIl[8] = (-17665) & 30564;
        lIIIIIIlIIl[9] = 135 ^ 131;
        lIIIIIIlIIl[10] = 132 ^ 129;
        lIIIIIIlIIl[11] = (-4321) & 4846;
        lIIIIIIlIIl[12] = 161 ^ 167;
        lIIIIIIlIIl[13] = (-25095) & 26607;
        lIIIIIIlIIl[14] = (14 ^ 36) ^ (186 ^ 151);
        lIIIIIIlIIl[15] = (-25495) & 28599;
        lIIIIIIlIIl[16] = 103 ^ 111;
        lIIIIIIlIIl[17] = (-16393) & 17915;
        lIIIIIIlIIl[18] = 110 ^ 103;
        lIIIIIIlIIl[19] = (-3211) & 3483;
        lIIIIIIlIIl[20] = (185 ^ 192) ^ (40 ^ 91);
        lIIIIIIlIIl[21] = (-16537) & 24543;
        lIIIIIIlIIl[22] = (77 ^ 57) ^ (((85 + 66) - 145) + 121);
        lIIIIIIlIIl[23] = (-16547) & 24555;
        lIIIIIIlIIl[24] = 63 ^ 51;
        lIIIIIIlIIl[25] = (-((-4569) & 20958)) & (-145) & 24543;
        lIIIIIIlIIl[26] = (((106 + 42) - 111) + 114) ^ (((3 + 153) - 5) + 3);
        lIIIIIIlIIl[27] = (-24757) & 32767;
        lIIIIIIlIIl[28] = (((191 + 73) - 136) + 75) ^ (((14 + 157) - 36) + 62);
        lIIIIIIlIIl[29] = (-4185) & 23807;
        lIIIIIIlIIl[30] = (225 ^ 133) ^ (62 ^ 85);
        lIIIIIIlIIl[31] = (-20535) & 22519;
        lIIIIIIlIIl[32] = (189 ^ 199) ^ (13 ^ 103);
        lIIIIIIlIIl[33] = 0 ^ 17;
        lIIIIIIlIIl[34] = ((115 + 77) - 68) + 76;
        lIIIIIIlIIl[35] = (((60 + 50) - (-24)) + 25) ^ (((59 + 36) - (-34)) + 12);
        lIIIIIIlIIl[36] = (77 ^ 0) ^ (239 ^ 177);
        lIIIIIIlIIl[37] = (15 ^ 75) ^ (194 ^ 146);
    }

    public static String c(int lllllllllllllllllIIlllllIllIlIIl) {
        if (llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[0])) {
            return lIIIIIIlIII[lIIIIIIlIIl[1]];
        }
        if (llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[2])) {
            return lIIIIIIlIII[lIIIIIIlIIl[3]];
        }
        if (llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[4])) {
            return lIIIIIIlIII[lIIIIIIlIIl[5]];
        }
        if (llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[6])) {
            return lIIIIIIlIII[lIIIIIIlIIl[7]];
        }
        if (llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[8])) {
            return lIIIIIIlIII[lIIIIIIlIIl[9]];
        }
        if (llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[2])) {
            return lIIIIIIlIII[lIIIIIIlIIl[10]];
        }
        if (llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[11])) {
            return lIIIIIIlIII[lIIIIIIlIIl[12]];
        }
        if (llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[13])) {
            return lIIIIIIlIII[lIIIIIIlIIl[14]];
        }
        if (llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[15])) {
            return lIIIIIIlIII[lIIIIIIlIIl[16]];
        }
        if (llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[17])) {
            return lIIIIIIlIII[lIIIIIIlIIl[18]];
        }
        if (llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[19])) {
            return lIIIIIIlIII[lIIIIIIlIIl[20]];
        }
        if (llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[21])) {
            return lIIIIIIlIII[lIIIIIIlIIl[22]];
        }
        if (llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[23])) {
            return lIIIIIIlIII[lIIIIIIlIIl[24]];
        }
        if (llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[25])) {
            return lIIIIIIlIII[lIIIIIIlIIl[26]];
        }
        if (llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[27])) {
            return lIIIIIIlIII[lIIIIIIlIIl[28]];
        }
        if (llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[29])) {
            return lIIIIIIlIII[lIIIIIIlIIl[30]];
        }
        if (llIllIlllIIll(lllllllllllllllllIIlllllIllIlIIl, lIIIIIIlIIl[31])) {
            return lIIIIIIlIII[lIIIIIIlIIl[32]];
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://oldschool.runescape.wiki/w/Special:Lookup?type=item&id=" + lllllllllllllllllIIlllllIllIlIIl).openConnection();
            httpURLConnection.setRequestMethod(lIIIIIIlIII[lIIIIIIlIIl[33]]);
            if (!llIllIlllIIll(httpURLConnection.getResponseCode(), lIIIIIIlIIl[34])) {
                "".length();
                return ((190 ^ 165) & ((164 ^ 191) ^ (-1))) > " ".length() ? null : null;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            do {
                String readLine = bufferedReader.readLine();
                if (!llIllIlllIlII(readLine)) {
                    bufferedReader.close();
                    return b(String.valueOf(sb));
                }
                sb.append(readLine);
                "".length();
                "".length();
            } while ("   ".length() == "   ".length());
            return null;
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public String d(int i) {
        ItemComposition itemComposition = M.getItemComposition(i);
        if (llIllIlllIlII(itemComposition)) {
            String name = itemComposition.getName();
            "".length();
            if (((177 ^ 170) & ((108 ^ 119) ^ (-1))) > 0) {
                return null;
            }
            return name;
        }
        return lIIIIIIlIII[lIIIIIIlIIl[36]];
    }

    public C0002c(ItemManager itemManager) {
        "".length();
        M = itemManager;
    }

    private static boolean llIllIlllIIll(int i, int i2) {
        return i == i2;
    }

    private static String b(String str) {
        String str2 = null;
        Matcher matcher = Pattern.compile(lIIIIIIlIII[lIIIIIIlIIl[35]]).matcher(str);
        if (llIllIlllIlIl(matcher.find() ? 1 : 0)) {
            str2 = matcher.group(lIIIIIIlIIl[3]);
        }
        return str2;
    }

    private static String llIllIllIlllI(String lllllllllllllllllIIlllllIlIIlIll, String lllllllllllllllllIIlllllIlIIlIlI) {
        try {
            SecretKeySpec lllllllllllllllllIIlllllIlIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIIlllllIlIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIIlllllIlIIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllIIlllllIlIIllIl.init(lIIIIIIlIIl[5], lllllllllllllllllIIlllllIlIIlllI);
            return new String(lllllllllllllllllIIlllllIlIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIIlllllIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIIlllllIlIIllII) {
            lllllllllllllllllIIlllllIlIIllII.printStackTrace();
            return null;
        }
    }

    private static String llIllIlllIIII(String lllllllllllllllllIIlllllIIlllIll, String lllllllllllllllllIIlllllIIlllIlI) {
        String lllllllllllllllllIIlllllIIlllIll2 = new String(Base64.getDecoder().decode(lllllllllllllllllIIlllllIIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllllIIlllllIIlllIII = lllllllllllllllllIIlllllIIlllIlI.toCharArray();
        int lllllllllllllllllIIlllllIIllIlll = lIIIIIIlIIl[1];
        char[] charArray = lllllllllllllllllIIlllllIIlllIll2.toCharArray();
        int length = charArray.length;
        int i = lIIIIIIlIIl[1];
        while (llIllIlllIllI(i, length)) {
            char lllllllllllllllllIIlllllIIllllII = charArray[i];
            sb.append((char) (lllllllllllllllllIIlllllIIllllII ^ lllllllllllllllllIIlllllIIlllIII[lllllllllllllllllIIlllllIIllIlll % lllllllllllllllllIIlllllIIlllIII.length]));
            "".length();
            lllllllllllllllllIIlllllIIllIlll++;
            i++;
            "".length();
            if ((-(49 ^ 53)) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
