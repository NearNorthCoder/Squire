package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.a  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/a.class */
public class C0000a extends HashMap<Integer, String> {
    private static /* synthetic */ int[] lllIllIlIIII;
    private static /* synthetic */ String[] lllIllIIllll;

    private static String lIIIllIlIIIlIII(String lllllllllllllllIIllIIllllIllIllI, String lllllllllllllllIIllIIllllIllIIll) {
        try {
            SecretKeySpec lllllllllllllllIIllIIllllIlllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIllllIllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIllllIlllIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIllllIlllIII.init(lllIllIlIIII[5], lllllllllllllllIIllIIllllIlllIIl);
            return new String(lllllllllllllllIIllIIllllIlllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIllllIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIllllIllIlll) {
            lllllllllllllllIIllIIllllIllIlll.printStackTrace();
            return null;
        }
    }

    public C0000a() {
        put(Integer.valueOf(lllIllIlIIII[0]), lllIllIIllll[lllIllIlIIII[1]]);
        "".length();
        put(Integer.valueOf(lllIllIlIIII[2]), lllIllIIllll[lllIllIlIIII[3]]);
        "".length();
        put(Integer.valueOf(lllIllIlIIII[4]), lllIllIIllll[lllIllIlIIII[5]]);
        "".length();
        put(Integer.valueOf(lllIllIlIIII[6]), lllIllIIllll[lllIllIlIIII[7]]);
        "".length();
        put(Integer.valueOf(lllIllIlIIII[8]), lllIllIIllll[lllIllIlIIII[9]]);
        "".length();
        put(Integer.valueOf(lllIllIlIIII[10]), lllIllIIllll[lllIllIlIIII[11]]);
        "".length();
        put(Integer.valueOf(lllIllIlIIII[12]), lllIllIIllll[lllIllIlIIII[13]]);
        "".length();
        put(Integer.valueOf(lllIllIlIIII[14]), lllIllIIllll[lllIllIlIIII[15]]);
        "".length();
        put(Integer.valueOf(lllIllIlIIII[16]), lllIllIIllll[lllIllIlIIII[17]]);
        "".length();
        put(Integer.valueOf(lllIllIlIIII[18]), lllIllIIllll[lllIllIlIIII[19]]);
        "".length();
        put(Integer.valueOf(lllIllIlIIII[20]), lllIllIIllll[lllIllIlIIII[21]]);
        "".length();
        put(Integer.valueOf(lllIllIlIIII[22]), lllIllIIllll[lllIllIlIIII[23]]);
        "".length();
    }

    private static boolean lIIIllIlIIIllII(int i, int i2) {
        return i < i2;
    }

    private static void lIIIllIlIIIlIlI() {
        lllIllIIllll = new String[lllIllIlIIII[24]];
        lllIllIIllll[lllIllIlIIII[1]] = lIIIllIlIIIIlll("kD4UTupxXVujRC0X6r0TRA==", "fKVmD");
        lllIllIIllll[lllIllIlIIII[3]] = lIIIllIlIIIlIII("UeokXBOwLVuLk01yA2hQzQ==", "BOdXW");
        lllIllIIllll[lllIllIlIIII[5]] = lIIIllIlIIIlIII("5VUN3nYQzdS8RU4gkyWNXg==", "NjKpN");
        lllIllIIllll[lllIllIlIIII[7]] = lIIIllIlIIIlIIl("JgY/EhIfDD4S", "hiMfz");
        lllIllIIllll[lllIllIlIIII[9]] = lIIIllIlIIIlIII("eNsapwss7aSVkyAXwRFkAw==", "DvOMe");
        lllIllIIllll[lllIllIlIIII[11]] = lIIIllIlIIIlIIl("Fyg9PQchJjs9", "DGHIo");
        lllIllIIllll[lllIllIlIIII[13]] = lIIIllIlIIIlIII("qTw4DYp1J/m93Z1qL9Z3rA==", "byoTk");
        lllIllIIllll[lllIllIlIIII[15]] = lIIIllIlIIIlIIl("BSkIJj48Iwkm", "KFzRV");
        lllIllIIllll[lllIllIlIIII[17]] = lIIIllIlIIIlIIl("HRgtPQs5Eis9", "NwXIc");
        lllIllIIllll[lllIllIlIIII[19]] = lIIIllIlIIIlIIl("JicdEAMQKRsQ", "uHhdk");
        lllIllIIllll[lllIllIlIIII[21]] = lIIIllIlIIIlIII("NU1lLDxIZXemHWVvBgoJ7w==", "SOEUw");
        lllIllIIllll[lllIllIlIIII[23]] = lIIIllIlIIIlIIl("IhgRFiAbEhAW", "lwcbH");
    }

    private static void lIIIllIlIIIlIll() {
        lllIllIlIIII = new int[25];
        lllIllIlIIII[0] = (-((-10027) & 32558)) & (-513) & 32479;
        lllIllIlIIII[1] = ((144 ^ 136) ^ (232 ^ 191)) & (((176 ^ 155) ^ (223 ^ 187)) ^ (-" ".length()));
        lllIllIlIIII[2] = (-((-29381) & 29669)) & (-18433) & 28159;
        lllIllIlIIII[3] = " ".length();
        lllIllIlIIII[4] = (-((-15746) & 32667)) & (-6401) & 32763;
        lllIllIlIIII[5] = "  ".length();
        lllIllIlIIII[6] = (-" ".length()) & (-19201) & 28645;
        lllIllIlIIII[7] = "   ".length();
        lllIllIlIIII[8] = (-6917) & 16351;
        lllIllIlIIII[9] = (46 ^ 49) ^ (76 ^ 87);
        lllIllIlIIII[10] = (-2338) & 11775;
        lllIllIlIIII[11] = "  ".length() ^ (103 ^ 96);
        lllIllIlIIII[12] = (-23303) & 32743;
        lllIllIlIIII[13] = 15 ^ 9;
        lllIllIlIIII[14] = (-2322) & 11765;
        lllIllIlIIII[15] = (216 ^ 193) ^ (99 ^ 125);
        lllIllIlIIII[16] = (-290) & 9723;
        lllIllIlIIII[17] = 92 ^ 84;
        lllIllIlIIII[18] = (-((-9289) & 28267)) & (-257) & 28671;
        lllIllIlIIII[19] = (31 ^ 9) ^ (188 ^ 163);
        lllIllIlIIII[20] = (-((-25745) & 28054)) & (-521) & 12269;
        lllIllIlIIII[21] = (200 ^ 173) ^ (81 ^ 62);
        lllIllIlIIII[22] = (-18713) & 28155;
        lllIllIlIIII[23] = (208 ^ 133) ^ (98 ^ 60);
        lllIllIlIIII[24] = (133 ^ 158) ^ (47 ^ 56);
    }

    private static String lIIIllIlIIIIlll(String lllllllllllllllIIllIIlllllIIIIll, String lllllllllllllllIIllIIlllllIIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlllllIIIIlI.getBytes(StandardCharsets.UTF_8)), lllIllIlIIII[17]), "DES");
            Cipher lllllllllllllllIIllIIlllllIIIlIl = Cipher.getInstance("DES");
            lllllllllllllllIIllIIlllllIIIlIl.init(lllIllIlIIII[5], secretKeySpec);
            return new String(lllllllllllllllIIllIIlllllIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlllllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIlllllIIIlII) {
            lllllllllllllllIIllIIlllllIIIlII.printStackTrace();
            return null;
        }
    }

    static {
        lIIIllIlIIIlIll();
        lIIIllIlIIIlIlI();
    }

    private static String lIIIllIlIIIlIIl(String lllllllllllllllIIllIIlllllIllIII, String lllllllllllllllIIllIIlllllIlIlll) {
        String lllllllllllllllIIllIIlllllIllIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIlllllIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIllIIlllllIlIlIl = lllllllllllllllIIllIIlllllIlIlll.toCharArray();
        int lllllllllllllllIIllIIlllllIlIlII = lllIllIlIIII[1];
        char[] charArray = lllllllllllllllIIllIIlllllIllIII2.toCharArray();
        int lllllllllllllllIIllIIlllllIIllIl = charArray.length;
        int i = lllIllIlIIII[1];
        while (lIIIllIlIIIllII(i, lllllllllllllllIIllIIlllllIIllIl)) {
            char lllllllllllllllIIllIIlllllIllIIl = charArray[i];
            sb.append((char) (lllllllllllllllIIllIIlllllIllIIl ^ lllllllllllllllIIllIIlllllIlIlIl[lllllllllllllllIIllIIlllllIlIlII % lllllllllllllllIIllIIlllllIlIlIl.length]));
            "".length();
            lllllllllllllllIIllIIlllllIlIlII++;
            i++;
            "".length();
            if (((((47 + 117) - 27) + 39) ^ (((162 + 143) - 153) + 28)) == (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
