package i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i;

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
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.c  reason: invalid package and case insensitive filesystem */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/c.class */
public class C0002c {
    private static /* synthetic */ ItemManager M;
    private static /* synthetic */ String[] lIIlIIIIIllII;
    private static /* synthetic */ int[] lIIlIIIIIllIl;

    public String d(int i2) {
        ItemComposition itemComposition = M.getItemComposition(i2);
        if (lIlIIlllIlllllI(itemComposition)) {
            String name = itemComposition.getName();
            "".length();
            if (0 != 0) {
                return null;
            }
            return name;
        }
        return lIIlIIIIIllII[lIIlIIIIIllIl[36]];
    }

    private static String lIlIIlllIlllIIl(String llllllllllllllIlllllllIlIIllIIIl, String llllllllllllllIlllllllIlIIllIIII) {
        try {
            SecretKeySpec llllllllllllllIlllllllIlIIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllllIlIIllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllllllIlIIllIIll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllllllIlIIllIIll.init(lIIlIIIIIllIl[5], llllllllllllllIlllllllIlIIllIlII);
            return new String(llllllllllllllIlllllllIlIIllIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllllIlIIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllllIlIIllIIlI) {
            llllllllllllllIlllllllIlIIllIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlllIlllllI(Object obj) {
        return obj != null;
    }

    public static String c(int i2) {
        if (lIlIIlllIllllIl(i2, lIIlIIIIIllIl[0])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[1]];
        }
        if (lIlIIlllIllllIl(i2, lIIlIIIIIllIl[2])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[3]];
        }
        if (lIlIIlllIllllIl(i2, lIIlIIIIIllIl[4])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[5]];
        }
        if (lIlIIlllIllllIl(i2, lIIlIIIIIllIl[6])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[7]];
        }
        if (lIlIIlllIllllIl(i2, lIIlIIIIIllIl[8])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[9]];
        }
        if (lIlIIlllIllllIl(i2, lIIlIIIIIllIl[2])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[10]];
        }
        if (lIlIIlllIllllIl(i2, lIIlIIIIIllIl[11])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[12]];
        }
        if (lIlIIlllIllllIl(i2, lIIlIIIIIllIl[13])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[14]];
        }
        if (lIlIIlllIllllIl(i2, lIIlIIIIIllIl[15])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[16]];
        }
        if (lIlIIlllIllllIl(i2, lIIlIIIIIllIl[17])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[18]];
        }
        if (lIlIIlllIllllIl(i2, lIIlIIIIIllIl[19])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[20]];
        }
        if (lIlIIlllIllllIl(i2, lIIlIIIIIllIl[21])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[22]];
        }
        if (lIlIIlllIllllIl(i2, lIIlIIIIIllIl[23])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[24]];
        }
        if (lIlIIlllIllllIl(i2, lIIlIIIIIllIl[25])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[26]];
        }
        if (lIlIIlllIllllIl(i2, lIIlIIIIIllIl[27])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[28]];
        }
        if (lIlIIlllIllllIl(i2, lIIlIIIIIllIl[29])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[30]];
        }
        if (lIlIIlllIllllIl(i2, lIIlIIIIIllIl[31])) {
            return lIIlIIIIIllII[lIIlIIIIIllIl[32]];
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://oldschool.runescape.wiki/w/Special:Lookup?type=item&id=" + i2).openConnection();
            httpURLConnection.setRequestMethod(lIIlIIIIIllII[lIIlIIIIIllIl[33]]);
            if (!lIlIIlllIllllIl(httpURLConnection.getResponseCode(), lIIlIIIIIllIl[34])) {
                "".length();
                return (-"  ".length()) >= 0 ? null : null;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            do {
                String readLine = bufferedReader.readLine();
                if (!lIlIIlllIlllllI(readLine)) {
                    bufferedReader.close();
                    return b(String.valueOf(sb));
                }
                sb.append(readLine);
                "".length();
                "".length();
            } while ((true ^ true) ^ (true ^ true));
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlllIllllll(int i2) {
        return i2 != 0;
    }

    private static boolean lIlIIllllIIIIII(int i2, int i3) {
        return i2 < i3;
    }

    private static String lIlIIlllIlllIlI(String llllllllllllllIlllllllIlIIlIIlII, String llllllllllllllIlllllllIlIIlIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllllIlIIlIIIll.getBytes(StandardCharsets.UTF_8)), lIIlIIIIIllIl[16]), "DES");
            Cipher llllllllllllllIlllllllIlIIlIIllI = Cipher.getInstance("DES");
            llllllllllllllIlllllllIlIIlIIllI.init(lIIlIIIIIllIl[5], secretKeySpec);
            return new String(llllllllllllllIlllllllIlIIlIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllllIlIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllllIlIIlIIlIl) {
            llllllllllllllIlllllllIlIIlIIlIl.printStackTrace();
            return null;
        }
    }

    private static String b(String str) {
        String str2 = null;
        Matcher matcher = Pattern.compile(lIIlIIIIIllII[lIIlIIIIIllIl[35]]).matcher(str);
        if (lIlIIlllIllllll(matcher.find() ? 1 : 0)) {
            str2 = matcher.group(lIIlIIIIIllIl[3]);
        }
        return str2;
    }

    private static String lIlIIlllIlllIII(String llllllllllllllIlllllllIlIlIIIllI, String llllllllllllllIlllllllIlIlIIIlIl) {
        String llllllllllllllIlllllllIlIlIIIllI2 = new String(Base64.getDecoder().decode(llllllllllllllIlllllllIlIlIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllllllIlIlIIIlII = new StringBuilder();
        char[] llllllllllllllIlllllllIlIlIIIIll = llllllllllllllIlllllllIlIlIIIlIl.toCharArray();
        int llllllllllllllIlllllllIlIlIIIIlI = lIIlIIIIIllIl[1];
        char[] charArray = llllllllllllllIlllllllIlIlIIIllI2.toCharArray();
        int length = charArray.length;
        int llllllllllllllIlllllllIlIIlllIlI = lIIlIIIIIllIl[1];
        while (lIlIIllllIIIIII(llllllllllllllIlllllllIlIIlllIlI, length)) {
            llllllllllllllIlllllllIlIlIIIlII.append((char) (charArray[llllllllllllllIlllllllIlIIlllIlI] ^ llllllllllllllIlllllllIlIlIIIIll[llllllllllllllIlllllllIlIlIIIIlI % llllllllllllllIlllllllIlIlIIIIll.length]));
            "".length();
            llllllllllllllIlllllllIlIlIIIIlI++;
            llllllllllllllIlllllllIlIIlllIlI++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllllllIlIlIIIlII);
    }

    private static void lIlIIlllIllllII() {
        lIIlIIIIIllIl = new int[38];
        lIIlIIIIIllIl[0] = (-16657) & 28636;
        lIIlIIIIIllIl[1] = ((((31 + 35) - 22) + 127) ^ (((117 + 33) - 58) + 38)) & (((((78 + 120) - 55) + 19) ^ (((0 + 56) - (-26)) + 57)) ^ (-" ".length()));
        lIIlIIIIIllIl[2] = (-((-1131) & 11387)) & (-1) & 12031;
        lIIlIIIIIllIl[3] = " ".length();
        lIIlIIIIIllIl[4] = (-((-9519) & 13615)) & (-26627) & 31283;
        lIIlIIIIIllIl[5] = "  ".length();
        lIIlIIIIIllIl[6] = (((169 + 116) - 232) + 132) ^ (((129 + 41) - 52) + 17);
        lIIlIIIIIllIl[7] = "   ".length();
        lIIlIIIIIllIl[8] = (-16667) & 29566;
        lIIlIIIIIllIl[9] = (86 ^ 29) ^ (202 ^ 133);
        lIIlIIIIIllIl[10] = 112 ^ 117;
        lIIlIIIIIllIl[11] = (-193) & 718;
        lIIlIIIIIllIl[12] = (((118 + 55) - 119) + 77) ^ (((29 + 93) - 32) + 43);
        lIIlIIIIIllIl[13] = (-((-21901) & 30607)) & (-20481) & 30699;
        lIIlIIIIIllIl[14] = 24 ^ 31;
        lIIlIIIIIllIl[15] = (-((-6465) & 31199)) & (-4609) & 32447;
        lIIlIIIIIllIl[16] = 187 ^ 179;
        lIIlIIIIIllIl[17] = (-((-6665) & 31245)) & (-2561) & 28663;
        lIIlIIIIIllIl[18] = (((129 + 40) - (-19)) + 0) ^ (((75 + 180) - 79) + 5);
        lIIlIIIIIllIl[19] = (-((-12577) & 32621)) & (-8323) & 28639;
        lIIlIIIIIllIl[20] = (47 ^ 64) ^ (204 ^ 169);
        lIIlIIIIIllIl[21] = (-161) & 8167;
        lIIlIIIIIllIl[22] = (((41 + 176) - 156) + 143) ^ (((170 + 117) - 195) + 107);
        lIIlIIIIIllIl[23] = (-(((92 + 145) - 189) + 119)) & (-16401) & 24575;
        lIIlIIIIIllIl[24] = 164 ^ 168;
        lIIlIIIIIllIl[25] = (-((-13101) & 29613)) & (-8213) & 32734;
        lIIlIIIIIllIl[26] = 36 ^ 41;
        lIIlIIIIIllIl[27] = (-(((0 + 69) - (-82)) + 10)) & (-8209) & 16379;
        lIIlIIIIIllIl[28] = (((52 + 52) - (-22)) + 46) ^ (((125 + 55) - 77) + 59);
        lIIlIIIIIllIl[29] = (-((-1185) & 9897)) & (-1) & 28335;
        lIIlIIIIIllIl[30] = (160 ^ 179) ^ (76 ^ 80);
        lIIlIIIIIllIl[31] = (-30769) & 32753;
        lIIlIIIIIllIl[32] = 148 ^ 132;
        lIIlIIIIIllIl[33] = 110 ^ 127;
        lIIlIIIIIllIl[34] = ((158 + 28) - 162) + 176;
        lIIlIIIIIllIl[35] = 74 ^ 88;
        lIIlIIIIIllIl[36] = (((144 + 86) - 173) + 104) ^ (((116 + 170) - 165) + 57);
        lIIlIIIIIllIl[37] = (117 ^ 126) ^ (57 ^ 38);
    }

    public C0002c(ItemManager itemManager) {
        "".length();
        M = itemManager;
    }

    static {
        lIlIIlllIllllII();
        lIlIIlllIlllIll();
    }

    private static void lIlIIlllIlllIll() {
        lIIlIIIIIllII = new String[lIIlIIIIIllIl[37]];
        lIIlIIIIIllII[lIIlIIIIIllIl[1]] = lIlIIlllIlllIII("Fh4kLm8rEWo+KiUbPiFvbEJj", "DwJIO");
        lIIlIIIIIllII[lIIlIIIIIllIl[3]] = lIlIIlllIlllIIl("wZt0QCLOvW+RZfPuAjUoeg==", "nvWju");
        lIIlIIIIIllII[lIIlIIIIIllIl[5]] = lIlIIlllIlllIIl("NC4r5lXNuuG32bXgpX0K+g==", "PDSoO");
        lIIlIIIIIllII[lIIlIIIIIllIl[7]] = lIlIIlllIlllIII("Nxs7ASBaFiQDIhgVPE1tD1M=", "zzKmE");
        lIIlIIIIIllII[lIIlIIIIIllIl[9]] = lIlIIlllIlllIIl("7UDsMZHN3GpGn8lvkdeeCpNJZBS4sk70", "WWWjH");
        lIIlIIIIIllII[lIIlIIIIIllIl[10]] = lIlIIlllIlllIlI("KQ9Lyi1DDPkiaFGHXwesoA==", "HPsAu");
        lIIlIIIIIllII[lIIlIIIIIllIl[12]] = lIlIIlllIlllIII("DxcbMTA=", "MxuTC");
        lIIlIIIIIllII[lIIlIIIIIllIl[14]] = lIlIIlllIlllIlI("VBgJT2B6SW2SrY2h/j2p2g==", "bgtXn");
        lIIlIIIIIllII[lIIlIIIIIllIl[16]] = lIlIIlllIlllIlI("vm8yh9cg6XKnV8pcS41E3A==", "VHtTp");
        lIIlIIIIIllII[lIIlIIIIIllIl[18]] = lIlIIlllIlllIII("OSssMjocJyQ=", "uDOYJ");
        lIIlIIIIIllII[lIIlIIIIIllIl[20]] = lIlIIlllIlllIlI("/vGfaHS/QX0=", "VeqUU");
        lIIlIIIIIllII[lIIlIIIIIllIl[22]] = lIlIIlllIlllIII("BCYfMAgxLE02Aj4iHS0VJg==", "RGmBg");
        lIIlIIIIIllII[lIIlIIIIIllIl[24]] = lIlIIlllIlllIII("LxMeJxYGAFIyFwUXAikAHQ==", "irrFr");
        lIIlIIIIIllII[lIIlIIIIIllIl[26]] = lIlIIlllIlllIlI("Ruj0uEm7wKxSuoRO+fv3UR8GboZ1CQ0E", "xoPbN");
        lIIlIIIIIllII[lIIlIIIIIllIl[28]] = lIlIIlllIlllIIl("RpYJ1MCTaSV1x3C5ndp/SBaeLDFBhSq+", "tYHOG");
        lIIlIIIIIllII[lIIlIIIIIllIl[30]] = lIlIIlllIlllIII("AwkSDXA1HgUWJTMCBFkkMQAECT8mGA==", "TlayP");
        lIIlIIIIIllII[lIIlIIIIIllIl[32]] = lIlIIlllIlllIII("DhwLLyIo", "MtnJQ");
        lIIlIIIIIllII[lIIlIIIIIllIl[33]] = lIlIIlllIlllIIl("VKD9xsVHV84=", "VrPYp");
        lIIlIIIIIllII[lIIlIIIIIllIl[35]] = lIlIIlllIlllIlI("Uu4b/LIyqSuQL07jIci9w6cMHH4HTImLA2q/815k/Rjxwv3qk9FKTA==", "CPCXX");
        lIIlIIIIIllII[lIIlIIIIIllIl[36]] = lIlIIlllIlllIlI("ZJ2fHMQGW93qAXUxMVRT/Q==", "lyELN");
    }

    private static boolean lIlIIlllIllllIl(int i2, int i3) {
        return i2 == i3;
    }
}
