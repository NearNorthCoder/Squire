package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

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
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.c  reason: invalid package and case insensitive filesystem */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/c.class */
public class C0002c {
    private static /* synthetic */ ItemManager N;
    private static /* synthetic */ String[] lIllIIIIl;
    private static /* synthetic */ int[] lIllIIIlI;

    private static boolean lIIlIlIlIIlI(int i, int i2) {
        return i == i2;
    }

    public static String c(int i) {
        if (lIIlIlIlIIlI(i, lIllIIIlI[0])) {
            return lIllIIIIl[lIllIIIlI[1]];
        }
        if (lIIlIlIlIIlI(i, lIllIIIlI[2])) {
            return lIllIIIIl[lIllIIIlI[3]];
        }
        if (lIIlIlIlIIlI(i, lIllIIIlI[4])) {
            return lIllIIIIl[lIllIIIlI[5]];
        }
        if (lIIlIlIlIIlI(i, lIllIIIlI[6])) {
            return lIllIIIIl[lIllIIIlI[7]];
        }
        if (lIIlIlIlIIlI(i, lIllIIIlI[8])) {
            return lIllIIIIl[lIllIIIlI[9]];
        }
        if (lIIlIlIlIIlI(i, lIllIIIlI[2])) {
            return lIllIIIIl[lIllIIIlI[10]];
        }
        if (lIIlIlIlIIlI(i, lIllIIIlI[4])) {
            return lIllIIIIl[lIllIIIlI[11]];
        }
        if (lIIlIlIlIIlI(i, lIllIIIlI[6])) {
            return lIllIIIIl[lIllIIIlI[12]];
        }
        if (lIIlIlIlIIlI(i, lIllIIIlI[13])) {
            return lIllIIIIl[lIllIIIlI[14]];
        }
        if (lIIlIlIlIIlI(i, lIllIIIlI[15])) {
            return lIllIIIIl[lIllIIIlI[16]];
        }
        if (lIIlIlIlIIlI(i, lIllIIIlI[17])) {
            return lIllIIIIl[lIllIIIlI[18]];
        }
        if (lIIlIlIlIIlI(i, lIllIIIlI[19])) {
            return lIllIIIIl[lIllIIIlI[20]];
        }
        if (lIIlIlIlIIlI(i, lIllIIIlI[21])) {
            return lIllIIIIl[lIllIIIlI[22]];
        }
        if (lIIlIlIlIIlI(i, lIllIIIlI[23])) {
            return lIllIIIIl[lIllIIIlI[24]];
        }
        if (lIIlIlIlIIlI(i, lIllIIIlI[25])) {
            return lIllIIIIl[lIllIIIlI[26]];
        }
        if (lIIlIlIlIIlI(i, lIllIIIlI[27])) {
            return lIllIIIIl[lIllIIIlI[28]];
        }
        if (lIIlIlIlIIlI(i, lIllIIIlI[29])) {
            return lIllIIIIl[lIllIIIlI[30]];
        }
        if (lIIlIlIlIIlI(i, lIllIIIlI[31])) {
            return lIllIIIIl[lIllIIIlI[32]];
        }
        if (lIIlIlIlIIlI(i, lIllIIIlI[33])) {
            return lIllIIIIl[lIllIIIlI[34]];
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://oldschool.runescape.wiki/w/Special:Lookup?type=item&id=" + i).openConnection();
            httpURLConnection.setRequestMethod(lIllIIIIl[lIllIIIlI[35]]);
            int llIllllIlIIllI = httpURLConnection.getResponseCode();
            if (!lIIlIlIlIIlI(llIllllIlIIllI, lIllIIIlI[36])) {
                "".length();
                return "  ".length() >= "   ".length() ? null : null;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            do {
                String llIllllIlIIlII = bufferedReader.readLine();
                if (!lIIlIlIlIIll(llIllllIlIIlII)) {
                    bufferedReader.close();
                    return b(String.valueOf(sb));
                }
                sb.append(llIllllIlIIlII);
                "".length();
                "".length();
            } while (!((true ^ true) & ((true ^ true) ^ true)));
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String lIIlIlIIlllI(String llIlllIllIllll, String llIlllIllIlllI) {
        String str = new String(Base64.getDecoder().decode(llIlllIllIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llIlllIllIlllI.toCharArray();
        int llIlllIllIlIll = lIllIIIlI[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIIIlI[1];
        while (lIIlIlIlIlIl(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llIlllIllIlIll % charArray.length]));
            "".length();
            llIlllIllIlIll++;
            i++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public String d(int i) {
        ItemComposition itemComposition = N.getItemComposition(i);
        if (lIIlIlIlIIll(itemComposition)) {
            String name = itemComposition.getName();
            "".length();
            if (true ^ true) {
                return name;
            }
            return null;
        }
        return lIllIIIIl[lIllIIIlI[38]];
    }

    private static boolean lIIlIlIlIIll(Object obj) {
        return obj != null;
    }

    private static String lIIlIlIIllll(String llIlllIlllllll, String llIlllIllllllI) {
        try {
            SecretKeySpec llIllllIIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlllIllllllI.getBytes(StandardCharsets.UTF_8)), lIllIIIlI[14]), "DES");
            Cipher llIllllIIIIIIl = Cipher.getInstance("DES");
            llIllllIIIIIIl.init(lIllIIIlI[5], llIllllIIIIIlI);
            return new String(llIllllIIIIIIl.doFinal(Base64.getDecoder().decode(llIlllIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIllllIIIIIII) {
            llIllllIIIIIII.printStackTrace();
            return null;
        }
    }

    private static String b(String str) {
        String str2 = null;
        Matcher matcher = Pattern.compile(lIllIIIIl[lIllIIIlI[37]]).matcher(str);
        if (lIIlIlIlIlII(matcher.find() ? 1 : 0)) {
            str2 = matcher.group(lIllIIIlI[3]);
        }
        return str2;
    }

    static {
        lIIlIlIlIIIl();
        lIIlIlIlIIII();
    }

    private static void lIIlIlIlIIIl() {
        lIllIIIlI = new int[40];
        lIllIIIlI[0] = (-291) & 12270;
        lIllIIIlI[1] = ((123 ^ 34) ^ (129 ^ 133)) & (((((179 + 7) - 38) + 44) ^ (((11 + 56) - (-78)) + 12)) ^ (-" ".length()));
        lIllIIIlI[2] = (-((-1451) & 30139)) & (-2305) & 32767;
        lIllIIIlI[3] = " ".length();
        lIllIIIlI[4] = (-((-4133) & 32037)) & (-73) & 28537;
        lIllIIIlI[5] = "  ".length();
        lIllIIIlI[6] = 176 ^ 142;
        lIllIIIlI[7] = "   ".length();
        lIllIIIlI[8] = (-17675) & 30574;
        lIllIIIlI[9] = 69 ^ 65;
        lIllIIIlI[10] = 14 ^ 11;
        lIllIIIlI[11] = (54 ^ 39) ^ (33 ^ 54);
        lIllIIIlI[12] = (118 ^ 51) ^ (225 ^ 163);
        lIllIIIlI[13] = (-((-4618) & 31355)) & (-4097) & 31359;
        lIllIIIlI[14] = 94 ^ 86;
        lIllIIIlI[15] = (-12293) & 13805;
        lIllIIIlI[16] = (((32 + 50) - 53) + 118) ^ (((73 + 18) - 42) + 105);
        lIllIIIlI[17] = (-((-2153) & 31215)) & (-537) & 32703;
        lIllIIIlI[18] = (113 ^ 50) ^ (51 ^ 122);
        lIllIIIlI[19] = (-((-4157) & 23101)) & (-4105) & 24571;
        lIllIIIlI[20] = (207 ^ 137) ^ (226 ^ 175);
        lIllIIIlI[21] = (-((-5459) & 30591)) & (-4099) & 29503;
        lIllIIIlI[22] = (((2 + 66) - 37) + 101) ^ (((30 + 18) - 18) + 106);
        lIllIIIlI[23] = (-((-4727) & 21119)) & (-145) & 24543;
        lIllIIIlI[24] = 63 ^ 50;
        lIllIIIlI[25] = (-33) & 8041;
        lIllIIIlI[26] = (((32 + 140) - 1) + 9) ^ (((148 + 99) - 132) + 71);
        lIllIIIlI[27] = (-16417) & 24426;
        lIllIIIlI[28] = 141 ^ 130;
        lIllIIIlI[29] = (-8373) & 16383;
        lIllIIIlI[30] = (171 ^ 141) ^ (80 ^ 102);
        lIllIIIlI[31] = (-((-1465) & 14265)) & (-265) & 32687;
        lIllIIIlI[32] = (47 ^ 87) ^ (251 ^ 146);
        lIllIIIlI[33] = (-((-18251) & 26459)) & (-37) & 10229;
        lIllIIIlI[34] = 176 ^ 162;
        lIllIIIlI[35] = (((15 + 118) - 132) + 153) ^ (((129 + 48) - 130) + 90);
        lIllIIIlI[36] = ((36 + 173) - 90) + 81;
        lIllIIIlI[37] = 133 ^ 145;
        lIllIIIlI[38] = (80 ^ 22) ^ (103 ^ 52);
        lIllIIIlI[39] = (249 ^ 153) ^ (32 ^ 86);
    }

    public C0002c(ItemManager itemManager) {
        "".length();
        N = itemManager;
    }

    private static void lIIlIlIlIIII() {
        lIllIIIIl = new String[lIllIIIlI[39]];
        lIllIIIIl[lIllIIIlI[1]] = lIIlIlIIllIl("EJt4WqDJUToSnR7Mw/F+loXPM7LghXp2", "RtLsd");
        lIllIIIIl[lIllIIIlI[3]] = lIIlIlIIllIl("EQHAe98JFGU3olAtT0g3uA==", "oJBwU");
        lIllIIIIl[lIllIIIlI[5]] = lIIlIlIIlllI("CjQiLwQhdSQvGCE=", "DUVZv");
        lIllIIIIl[lIllIIIlI[7]] = lIIlIlIIllll("tUBKjJctjk5nNpxdP9mRuIRGC4zYTZkO", "kjxee");
        lIllIIIIl[lIllIIIlI[9]] = lIIlIlIIllIl("Y1VfoLtH2PW7wbbAmxcMOw8ZKKhEZGh1", "rSxBJ");
        lIllIIIIl[lIllIIIlI[10]] = lIIlIlIIllIl("RA5F32Vu+Fza00UOK8M3TQ==", "nOitI");
        lIllIIIIl[lIllIIIlI[11]] = lIIlIlIIlllI("AhAEPCopUQI8Nik=", "LqpIX");
        lIllIIIIl[lIllIIIlI[12]] = lIIlIlIIlllI("IyoAGQ5OJx8bDAwkB1VDG2I=", "nKpuk");
        lIllIIIIl[lIllIIIlI[14]] = lIIlIlIIllll("7AhV4mqN3Ho=", "pjERz");
        lIllIIIIl[lIllIIIlI[16]] = lIIlIlIIllIl("U1FD9gxc3xk40lnBVjJLyw==", "uNKVu");
        lIllIIIIl[lIllIIIlI[18]] = lIIlIlIIlllI("AgcIJykoBQZqKS4EFTk=", "AkaJK");
        lIllIIIIl[lIllIIIlI[20]] = lIIlIlIIlllI("OTgiBiAcNCo=", "uWAmP");
        lIllIIIIl[lIllIIIlI[22]] = lIIlIlIIlllI("BSIOAyI7", "UMgpM");
        lIllIIIIl[lIllIIIlI[24]] = lIIlIlIIlllI("OSk1Ox0MI2c9FwMtNyYAGw==", "oHGIr");
        lIllIIIIl[lIllIIIlI[26]] = lIIlIlIIllIl("qSIvcxZcRyylyWRPjNEavnBZzt3CtA7W", "Yzyvh");
        lIllIIIIl[lIllIIIlI[28]] = lIIlIlIIllll("TM62fWheOnJTuduoHxxDMlqPEVAFiZ5T", "icJmY");
        lIllIIIIl[lIllIIIlI[30]] = lIIlIlIIllll("JWoyuAHip3RqWJk9ltLHH8R+1HejkYrS", "LBPIM");
        lIllIIIIl[lIllIIIlI[32]] = lIIlIlIIllll("dlx0xMntaLB+c1c7PD+hexJGgcEMhDby", "bmYoQ");
        lIllIIIIl[lIllIIIlI[34]] = lIIlIlIIllIl("+FmXROfLoSA=", "FCkTN");
        lIllIIIIl[lIllIIIlI[35]] = lIIlIlIIlllI("KSc6", "nbnmU");
        lIllIIIIl[lIllIIIlI[37]] = lIIlIlIIllIl("88aoGYw4g45MmIT/AILb1nbQy4m4ZGDBm5sdl6VuplGxTtRQsyfR0w==", "UVkeb");
        lIllIIIIl[lIllIIIlI[38]] = lIIlIlIIllll("qfFWobxdMQV9E+qwGYE45w==", "wirjp");
    }

    private static String lIIlIlIIllIl(String llIllllIIIllII, String llIllllIIIlIll) {
        try {
            SecretKeySpec llIllllIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllllIIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIIlI[5], llIllllIIIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIllllIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIllllIIIllIl) {
            llIllllIIIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIlIlIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIlIlIlII(int i) {
        return i != 0;
    }
}
