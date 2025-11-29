package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.c  reason: invalid package and case insensitive filesystem */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/c.class */
class C0002c extends HashMap<String, Integer> {
    private static /* synthetic */ String[] lIIlIlIIIllII;
    private static /* synthetic */ int[] lIIlIlIIIllIl;
    final /* synthetic */ C0001b j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0002c(C0001b c0001b) {
        this.j = c0001b;
        put(lIIlIlIIIllII[lIIlIlIIIllIl[0]], Integer.valueOf(lIIlIlIIIllIl[1]));
        "".length();
        put(lIIlIlIIIllII[lIIlIlIIIllIl[2]], Integer.valueOf(lIIlIlIIIllIl[1]));
        "".length();
        put(lIIlIlIIIllII[lIIlIlIIIllIl[3]], Integer.valueOf(lIIlIlIIIllIl[1]));
        "".length();
        put(lIIlIlIIIllII[lIIlIlIIIllIl[4]], Integer.valueOf(lIIlIlIIIllIl[5]));
        "".length();
        put(lIIlIlIIIllII[lIIlIlIIIllIl[6]], Integer.valueOf(lIIlIlIIIllIl[7]));
        "".length();
        put(lIIlIlIIIllII[lIIlIlIIIllIl[8]], Integer.valueOf(lIIlIlIIIllIl[9]));
        "".length();
        put(lIIlIlIIIllII[lIIlIlIIIllIl[10]], Integer.valueOf(lIIlIlIIIllIl[11]));
        "".length();
        put(lIIlIlIIIllII[lIIlIlIIIllIl[12]], Integer.valueOf(lIIlIlIIIllIl[13]));
        "".length();
        put(lIIlIlIIIllII[lIIlIlIIIllIl[14]], Integer.valueOf(lIIlIlIIIllIl[14]));
        "".length();
        put(lIIlIlIIIllII[lIIlIlIIIllIl[15]], Integer.valueOf(lIIlIlIIIllIl[14]));
        "".length();
    }

    private static void lIlIlIllIIlllII() {
        lIIlIlIIIllII = new String[lIIlIlIIIllIl[16]];
        lIIlIlIIIllII[lIIlIlIIIllIl[0]] = lIlIlIllIIllIIl("arj90Ad9Hx7ELWDlLqLKkQ==", "ITPGm");
        lIIlIlIIIllII[lIIlIlIIIllIl[2]] = lIlIlIllIIllIlI("JgodFxRLGRIa", "kkscu");
        lIIlIlIIIllII[lIIlIlIIIllIl[3]] = lIlIlIllIIllIlI("Fx4bCSE2SwYNIQ==", "DkvdD");
        lIIlIlIIIllII[lIIlIlIIIllIl[4]] = lIlIlIllIIllIIl("HbAU7si+51g=", "BAxAO");
        lIIlIlIIIllII[lIIlIlIIIllIl[6]] = lIlIlIllIIllIll("CgaSIw/pRMiJgwzOWaEJuLJ6iZdPMDoF", "oZYfi");
        lIIlIlIIIllII[lIIlIlIIIllIl[8]] = lIlIlIllIIllIlI("HikFGC46NQM=", "SFksH");
        lIIlIlIIIllII[lIIlIlIIIllIl[10]] = lIlIlIllIIllIlI("LD0fCR0GdQYKBQ4hGQ==", "oUveq");
        lIIlIlIIIllII[lIIlIlIIIllIl[12]] = lIlIlIllIIllIlI("OzAKEHMScRUDPh40FFYjGjQ=", "sQfvS");
        lIIlIlIIIllII[lIIlIlIIIllIl[14]] = lIlIlIllIIllIll("a3PUP2An1MU=", "PRNVS");
        lIIlIlIIIllII[lIIlIlIIIllIl[15]] = lIlIlIllIIllIlI("AD82KTs=", "BPXLH");
    }

    private static String lIlIlIllIIllIll(String llllllllllllllIlllllIIIIlllIllll, String llllllllllllllIlllllIIIIlllIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIIIlllIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIlIIIllIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIIIlllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllIIIIllllIIII) {
            llllllllllllllIlllllIIIIllllIIII.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIllIIlllIl() {
        lIIlIlIIIllIl = new int[17];
        lIIlIlIIIllIl[0] = " ".length() & (" ".length() ^ (-" ".length()));
        lIIlIlIIIllIl[1] = 77 ^ 91;
        lIIlIlIIIllIl[2] = " ".length();
        lIIlIlIIIllIl[3] = "  ".length();
        lIIlIlIIIllIl[4] = "   ".length();
        lIIlIlIIIllIl[5] = 160 ^ 180;
        lIIlIlIIIllIl[6] = (((23 + 179) - 55) + 52) ^ (((20 + 51) - (-92)) + 32);
        lIIlIlIIIllIl[7] = (157 ^ 141) ^ "  ".length();
        lIIlIlIIIllIl[8] = 57 ^ 60;
        lIIlIlIIIllIl[9] = 175 ^ 191;
        lIIlIlIIIllIl[10] = 105 ^ 111;
        lIIlIlIIIllIl[11] = (((36 + 105) - 132) + 146) ^ (((51 + 123) - 114) + 89);
        lIIlIlIIIllIl[12] = (92 ^ 111) ^ (161 ^ 149);
        lIIlIlIIIllIl[13] = 51 ^ 56;
        lIIlIlIIIllIl[14] = (145 ^ 135) ^ (2 ^ 28);
        lIIlIlIIIllIl[15] = (27 ^ 48) ^ (20 ^ 54);
        lIIlIlIIIllIl[16] = 37 ^ 47;
    }

    private static String lIlIlIllIIllIlI(String llllllllllllllIlllllIIIlIIIIIlII, String llllllllllllllIlllllIIIlIIIIIIll) {
        String llllllllllllllIlllllIIIlIIIIIlII2 = new String(Base64.getDecoder().decode(llllllllllllllIlllllIIIlIIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllllIIIlIIIIIIlI = new StringBuilder();
        char[] llllllllllllllIlllllIIIlIIIIIIIl = llllllllllllllIlllllIIIlIIIIIIll.toCharArray();
        int llllllllllllllIlllllIIIlIIIIIIII = lIIlIlIIIllIl[0];
        char[] charArray = llllllllllllllIlllllIIIlIIIIIlII2.toCharArray();
        int length = charArray.length;
        int i = lIIlIlIIIllIl[0];
        while (lIlIlIllIIllllI(i, length)) {
            char llllllllllllllIlllllIIIlIIIIIlIl = charArray[i];
            llllllllllllllIlllllIIIlIIIIIIlI.append((char) (llllllllllllllIlllllIIIlIIIIIlIl ^ llllllllllllllIlllllIIIlIIIIIIIl[llllllllllllllIlllllIIIlIIIIIIII % llllllllllllllIlllllIIIlIIIIIIIl.length]));
            "".length();
            llllllllllllllIlllllIIIlIIIIIIII++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllllIIIlIIIIIIlI);
    }

    static {
        lIlIlIllIIlllIl();
        lIlIlIllIIlllII();
    }

    private static String lIlIlIllIIllIIl(String llllllllllllllIlllllIIIIlllIIIlI, String llllllllllllllIlllllIIIIlllIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIIIlllIIIIl.getBytes(StandardCharsets.UTF_8)), lIIlIlIIIllIl[14]), "DES");
            Cipher llllllllllllllIlllllIIIIlllIIlII = Cipher.getInstance("DES");
            llllllllllllllIlllllIIIIlllIIlII.init(lIIlIlIIIllIl[3], secretKeySpec);
            return new String(llllllllllllllIlllllIIIIlllIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIIIlllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllIIIIlllIIIll) {
            llllllllllllllIlllllIIIIlllIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIllIIllllI(int i, int i2) {
        return i < i2;
    }
}
