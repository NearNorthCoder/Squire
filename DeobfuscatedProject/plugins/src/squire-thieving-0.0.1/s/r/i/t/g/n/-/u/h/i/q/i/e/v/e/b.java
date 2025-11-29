/*
 * Decompiled with CFR 0.152.
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class b
extends Enum<b> {
    public static final /* synthetic */ /* enum */ b PICKPOCKETING;
    public static final /* synthetic */ /* enum */ b CHESTS;
    public static final /* synthetic */ /* enum */ b BLACK_JACK;
    private static /* synthetic */ int[] lIIllIlllIlII;
    private static /* synthetic */ String[] lIIllIlllIIll;
    public static final /* synthetic */ /* enum */ b STALLS;
    private static final /* synthetic */ b[] $VALUES;
    public static final /* synthetic */ /* enum */ b ROGUES_DEN;

    private static boolean lIllIIIlllIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllIIIllIlllll(String llllllllllllllIlllIlllIIIllIlllI, String llllllllllllllIlllIlllIIIllIllIl) {
        try {
            SecretKeySpec llllllllllllllIlllIlllIIIlllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIIIllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlllIIIlllIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlllIIIlllIIlI.init(lIIllIlllIlII[2], llllllllllllllIlllIlllIIIlllIIll);
            return new String(llllllllllllllIlllIlllIIIlllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIIIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlllIIIlllIIIl) {
            llllllllllllllIlllIlllIIIlllIIIl.printStackTrace();
            return null;
        }
    }

    public String toString() {
        String string = super.toString();
        char c2 = string.charAt(lIIllIlllIlII[0]);
        return c2 + string.replaceAll(lIIllIlllIIll[lIIllIlllIlII[0]], lIIllIlllIIll[lIIllIlllIlII[1]]).substring(lIIllIlllIlII[1]).toLowerCase();
    }

    private static String lIllIIIllIlllIl(String llllllllllllllIlllIlllIIIlIIlIll, String llllllllllllllIlllIlllIIIlIIlIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIlllIIIlIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), lIIllIlllIlII[8]), "DES");
            Cipher llllllllllllllIlllIlllIIIlIIllIl = Cipher.getInstance("DES");
            llllllllllllllIlllIlllIIIlIIllIl.init(lIIllIlllIlII[2], llllllllllllllIlllIlllIIIlIIlllI);
            return new String(llllllllllllllIlllIlllIIIlIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIIIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlllIIIlIIllII) {
            llllllllllllllIlllIlllIIIlIIllII.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIlllIIIIl() {
        lIIllIlllIlII = new int[9];
        b.lIIllIlllIlII[0] = (0x2A ^ 0x1B) & ~(0x80 ^ 0xB1);
        b.lIIllIlllIlII[1] = " ".length();
        b.lIIllIlllIlII[2] = "  ".length();
        b.lIIllIlllIlII[3] = "   ".length();
        b.lIIllIlllIlII[4] = 0x82 ^ 0x86;
        b.lIIllIlllIlII[5] = 134 + 141 - 187 + 87 ^ 134 + 31 - 154 + 159;
        b.lIIllIlllIlII[6] = 0x98 ^ 0x9E;
        b.lIIllIlllIlII[7] = 9 ^ 0xE;
        b.lIIllIlllIlII[8] = 0x62 ^ 0x4A ^ (0xA1 ^ 0x81);
    }

    private static String lIllIIIllIllllI(String llllllllllllllIlllIlllIIIlIllIll, String llllllllllllllIlllIlllIIIlIllIlI) {
        llllllllllllllIlllIlllIIIlIllIll = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllIIIlIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIlllIIIlIllllI = new StringBuilder();
        char[] llllllllllllllIlllIlllIIIlIlllIl = llllllllllllllIlllIlllIIIlIllIlI.toCharArray();
        int llllllllllllllIlllIlllIIIlIlllII = lIIllIlllIlII[0];
        char[] llllllllllllllIlllIlllIIIlIlIllI = llllllllllllllIlllIlllIIIlIllIll.toCharArray();
        int llllllllllllllIlllIlllIIIlIlIlIl = llllllllllllllIlllIlllIIIlIlIllI.length;
        int llllllllllllllIlllIlllIIIlIlIlII = lIIllIlllIlII[0];
        while (b.lIllIIIlllIIIlI(llllllllllllllIlllIlllIIIlIlIlII, llllllllllllllIlllIlllIIIlIlIlIl)) {
            char llllllllllllllIlllIlllIIIllIIIIl = llllllllllllllIlllIlllIIIlIlIllI[llllllllllllllIlllIlllIIIlIlIlII];
            llllllllllllllIlllIlllIIIlIllllI.append((char)(llllllllllllllIlllIlllIIIllIIIIl ^ llllllllllllllIlllIlllIIIlIlllIl[llllllllllllllIlllIlllIIIlIlllII % llllllllllllllIlllIlllIIIlIlllIl.length]));
            "".length();
            ++llllllllllllllIlllIlllIIIlIlllII;
            ++llllllllllllllIlllIlllIIIlIlIlII;
            "".length();
            if ((0xE ^ 0xA) != 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIlllIIIlIllllI);
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    private static void lIllIIIlllIIIII() {
        lIIllIlllIIll = new String[lIIllIlllIlII[7]];
        b.lIIllIlllIIll[b.lIIllIlllIlII[0]] = b.lIllIIIllIlllIl("CG0uS3QSzG0=", "swmYS");
        b.lIIllIlllIIll[b.lIIllIlllIlII[1]] = b.lIllIIIllIllllI("Yw==", "CSzOY");
        b.lIIllIlllIIll[b.lIIllIlllIlII[2]] = b.lIllIIIllIlllll("fBMxlwLBhgqHsA1Dj+q7hA==", "LMwHr");
        b.lIIllIlllIIll[b.lIIllIlllIlII[3]] = b.lIllIIIllIllllI("CAQMEyMXDgQdJxEDCA==", "XMOXs");
        b.lIIllIlllIIll[b.lIIllIlllIlII[4]] = b.lIllIIIllIllllI("BRcoIi0F", "VCina");
        b.lIIllIlllIIll[b.lIIllIlllIlII[5]] = b.lIllIIIllIlllIl("Dkes52IIbU8=", "OhEFO");
        b.lIIllIlllIIll[b.lIIllIlllIlII[6]] = b.lIllIIIllIlllIl("j6DTdus7fP6ISLwIyYwwsg==", "aRIcH");
    }

    static {
        b.lIllIIIlllIIIIl();
        b.lIllIIIlllIIIII();
        BLACK_JACK = new b();
        PICKPOCKETING = new b();
        STALLS = new b();
        CHESTS = new b();
        ROGUES_DEN = new b();
        b[] bArray = new b[lIIllIlllIlII[5]];
        bArray[b.lIIllIlllIlII[0]] = BLACK_JACK;
        bArray[b.lIIllIlllIlII[1]] = PICKPOCKETING;
        bArray[b.lIIllIlllIlII[2]] = STALLS;
        bArray[b.lIIllIlllIlII[3]] = CHESTS;
        bArray[b.lIIllIlllIlII[4]] = ROGUES_DEN;
        $VALUES = bArray;
    }
}

