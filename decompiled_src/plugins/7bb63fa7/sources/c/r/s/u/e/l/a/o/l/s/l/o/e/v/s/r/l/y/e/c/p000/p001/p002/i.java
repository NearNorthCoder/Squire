package c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002;

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
/* renamed from: c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.i  reason: invalid package */
/* loaded from: 7bb63fa7-229b-499f-b77f-e1768cbbcc1e.jar:c/r/s/u/e/l/a/o/l/s/l/o/e/v/s/r/l/y/e/c/-/-/-/i.class */
public class i {
    private static /* synthetic */ String[] llIIl;
    private static /* synthetic */ int[] llIlI;
    private static /* synthetic */ ItemManager ag;

    private static boolean lIIIIIlI(Object obj) {
        return obj != null;
    }

    private static boolean lIIIIIIl(int i, int i2) {
        return i == i2;
    }

    private static void llllllI() {
        llIIl = new String[llIlI[35]];
        llIIl[llIlI[1]] = llllIll("Jj0hDk8bMm8eChU4OwFPXGFm", "tTOio");
        llIIl[llIlI[3]] = lllllII("OeFqC+a+4E9g2sr3A0vAkg==", "NQrJq");
        llIIl[llIlI[5]] = lllllIl("RTnlkC+KmV85qqK/+f+olA==", "JeRDl");
        llIIl[llIlI[7]] = lllllII("fpekw3NHD4Hcsv3PuRXEvoq1yVXWkFxw", "djZUF");
        llIIl[llIlI[9]] = lllllII("kg3wTsRyxL3CUrAHqMBEv971iC65R/I5", "xgQom");
        llIIl[llIlI[10]] = llllIll("KAoKGyALRQEDJBYW", "eefoE");
        llIIl[llIlI[12]] = lllllIl("YkfUJV9JXFA=", "NChDY");
        llIIl[llIlI[14]] = lllllIl("CnSjyeyaAmYN7gODsTwhIw==", "usbaT");
        llIIl[llIlI[16]] = lllllIl("xm9+6mICDIeu0VR88NeglA==", "vawru");
        llIIl[llIlI[18]] = lllllII("sHoTPUoAJQ95fp9Kq7P1Mw==", "uKYPu");
        llIIl[llIlI[20]] = lllllII("oF5SoL+ZHiA=", "WKtYW");
        llIIl[llIlI[22]] = lllllIl("zNN4aYCgp8oSONNmJbN5QPdl8LeyF9zK", "TEJtU");
        llIIl[llIlI[24]] = lllllIl("9PuvUTrn1ms3uNw9G0pcAcHFmPnjKps0", "SeGfo");
        llIIl[llIlI[26]] = lllllIl("RPFKn3ydw2MFL18o3aHLocv993DPcLCM", "GwbPx");
        llIIl[llIlI[28]] = lllllIl("3Ogms+OFnix4KQtT4gqcM2jMmMFcy+8V", "ylWjf");
        llIIl[llIlI[30]] = llllIll("AjIAP2g0JRckPTI5Fms8MDsWOycnIw==", "UWsKH");
        llIIl[llIlI[31]] = lllllII("a/YGOBNTMic=", "eUifE");
        llIIl[llIlI[33]] = lllllIl("Q3ECg1IJv6LGMhekZxz8WOGjU2iJsAUblUKYuaxWD0m0OGy2a+M2+g==", "iExsu");
        llIIl[llIlI[34]] = lllllII("kq9epzpy68mtl8VQJyqLhw==", "GrxAj");
    }

    public static String a(int i) {
        if (lIIIIIIl(i, llIlI[0])) {
            return llIIl[llIlI[1]];
        }
        if (lIIIIIIl(i, llIlI[2])) {
            return llIIl[llIlI[3]];
        }
        if (lIIIIIIl(i, llIlI[4])) {
            return llIIl[llIlI[5]];
        }
        if (lIIIIIIl(i, llIlI[6])) {
            return llIIl[llIlI[7]];
        }
        if (lIIIIIIl(i, llIlI[8])) {
            return llIIl[llIlI[9]];
        }
        if (lIIIIIIl(i, llIlI[2])) {
            return llIIl[llIlI[10]];
        }
        if (lIIIIIIl(i, llIlI[11])) {
            return llIIl[llIlI[12]];
        }
        if (lIIIIIIl(i, llIlI[13])) {
            return llIIl[llIlI[14]];
        }
        if (lIIIIIIl(i, llIlI[15])) {
            return llIIl[llIlI[16]];
        }
        if (lIIIIIIl(i, llIlI[17])) {
            return llIIl[llIlI[18]];
        }
        if (lIIIIIIl(i, llIlI[19])) {
            return llIIl[llIlI[20]];
        }
        if (lIIIIIIl(i, llIlI[21])) {
            return llIIl[llIlI[22]];
        }
        if (lIIIIIIl(i, llIlI[23])) {
            return llIIl[llIlI[24]];
        }
        if (lIIIIIIl(i, llIlI[25])) {
            return llIIl[llIlI[26]];
        }
        if (lIIIIIIl(i, llIlI[27])) {
            return llIIl[llIlI[28]];
        }
        if (lIIIIIIl(i, llIlI[29])) {
            return llIIl[llIlI[30]];
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://oldschool.runescape.wiki/w/Special:Lookup?type=item&id=" + i).openConnection();
            httpURLConnection.setRequestMethod(llIIl[llIlI[31]]);
            int llllIlllIllIlll = httpURLConnection.getResponseCode();
            if (!lIIIIIIl(llllIlllIllIlll, llIlI[32])) {
                "".length();
                return "  ".length() <= 0 ? null : null;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            do {
                String readLine = bufferedReader.readLine();
                if (!lIIIIIlI(readLine)) {
                    bufferedReader.close();
                    return c(String.valueOf(sb));
                }
                sb.append(readLine);
                "".length();
                "".length();
            } while ("  ".length() >= 0);
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String c(String str) {
        String str2 = null;
        Matcher matcher = Pattern.compile(llIIl[llIlI[33]]).matcher(str);
        if (lIIIIIll(matcher.find() ? 1 : 0)) {
            str2 = matcher.group(llIlI[3]);
        }
        return str2;
    }

    static {
        lIIIIIII();
        llllllI();
    }

    private static String lllllIl(String llllIlllIIlllIl, String llllIlllIIlllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIlllIIlllII.getBytes(StandardCharsets.UTF_8)), llIlI[16]), "DES");
            Cipher llllIlllIIlllll = Cipher.getInstance("DES");
            llllIlllIIlllll.init(llIlI[5], secretKeySpec);
            return new String(llllIlllIIlllll.doFinal(Base64.getDecoder().decode(llllIlllIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIlllIIllllI) {
            llllIlllIIllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIll(int i) {
        return i != 0;
    }

    private static boolean lIIIlIII(int i, int i2) {
        return i < i2;
    }

    private static void lIIIIIII() {
        llIlI = new int[36];
        llIlI[0] = (-((-8937) & 25579)) & (-34) & 28655;
        llIlI[1] = ((((139 + 99) - 48) + 14) ^ (((135 + 119) - 237) + 134)) & (((88 ^ 72) ^ (11 ^ 64)) ^ (-" ".length()));
        llIlI[2] = (-((-1779) & 30707)) & (-2065) & 32767;
        llIlI[3] = " ".length();
        llIlI[4] = (-((-163) & 23983)) & (-131) & 24511;
        llIlI[5] = "  ".length();
        llIlI[6] = 15 ^ 49;
        llIlI[7] = "   ".length();
        llIlI[8] = (-16667) & 29566;
        llIlI[9] = (214 ^ 146) ^ (95 ^ 31);
        llIlI[10] = 120 ^ 125;
        llIlI[11] = (-27650) & 28175;
        llIlI[12] = 76 ^ 74;
        llIlI[13] = (-26631) & 28143;
        llIlI[14] = 104 ^ 111;
        llIlI[15] = (-((-4097) & 29647)) & (-1) & 28655;
        llIlI[16] = 137 ^ 129;
        llIlI[17] = (-10249) & 11771;
        llIlI[18] = (125 ^ 67) ^ (166 ^ 145);
        llIlI[19] = (-((-769) & 24557)) & (-8705) & 32765;
        llIlI[20] = 188 ^ 182;
        llIlI[21] = (-((-7781) & 24317)) & (-8225) & 32767;
        llIlI[22] = (((46 + 102) - 110) + 89) ^ (236 ^ 152);
        llIlI[23] = (-16533) & 24541;
        llIlI[24] = 48 ^ 60;
        llIlI[25] = (-24722) & 32731;
        llIlI[26] = 83 ^ 94;
        llIlI[27] = (-((-5199) & 29951)) & (-5) & 32767;
        llIlI[28] = 42 ^ 36;
        llIlI[29] = (-4433) & 24055;
        llIlI[30] = 110 ^ 97;
        llIlI[31] = (((80 + 107) - 146) + 104) ^ (((91 + 123) - 211) + 126);
        llIlI[32] = (((113 ^ 92) + (92 ^ 119)) - (-(39 ^ 26))) + (94 ^ 109);
        llIlI[33] = 24 ^ 9;
        llIlI[34] = (((169 + 31) - 28) + 3) ^ (((17 + 167) - 22) + 27);
        llIlI[35] = 90 ^ 73;
    }

    public i(ItemManager itemManager) {
        "".length();
        ag = itemManager;
    }

    private static String llllIll(String llllIlllIIIIIII, String llllIllIlllllll) {
        String str = new String(Base64.getDecoder().decode(llllIlllIIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllIllIlllllIl = llllIllIlllllll.toCharArray();
        int llllIllIlllllII = llIlI[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIlI[1];
        while (lIIIlIII(i, length)) {
            char llllIllIlllIIll = charArray[i];
            sb.append((char) (llllIllIlllIIll ^ llllIllIlllllIl[llllIllIlllllII % llllIllIlllllIl.length]));
            "".length();
            llllIllIlllllII++;
            i++;
            "".length();
            if ((((((152 + 178) - 290) + 163) ^ (((57 + 142) - 122) + 119)) & (((117 ^ 90) ^ (179 ^ 147)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public String b(int i) {
        ItemComposition itemComposition = ag.getItemComposition(i);
        if (lIIIIIlI(itemComposition)) {
            String name = itemComposition.getName();
            "".length();
            if ((((81 ^ 102) ^ (221 ^ 168)) & (((151 ^ 183) ^ (124 ^ 30)) ^ (-" ".length()))) < 0) {
                return null;
            }
            return name;
        }
        return llIIl[llIlI[34]];
    }

    private static String lllllII(String llllIlllIIlIIII, String llllIlllIIIllll) {
        try {
            SecretKeySpec llllIlllIIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIlllIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllIlllIIlIIlI = Cipher.getInstance("Blowfish");
            llllIlllIIlIIlI.init(llIlI[5], llllIlllIIlIIll);
            return new String(llllIlllIIlIIlI.doFinal(Base64.getDecoder().decode(llllIlllIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIlllIIlIIIl) {
            llllIlllIIlIIIl.printStackTrace();
            return null;
        }
    }
}
