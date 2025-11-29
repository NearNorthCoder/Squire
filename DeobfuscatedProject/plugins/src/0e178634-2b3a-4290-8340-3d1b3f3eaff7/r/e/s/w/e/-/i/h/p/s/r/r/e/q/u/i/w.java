/*
 * Decompiled with CFR 0.152.
 */
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

final class w
extends Enum<w> {
    private static /* synthetic */ int[] lIlIlllIlIIIl;
    public static final /* synthetic */ /* enum */ w BREWING;
    private static /* synthetic */ String[] lIlIlllIIlllI;
    public static final /* synthetic */ /* enum */ w RESTORING;
    private static final /* synthetic */ w[] $VALUES;
    public static final /* synthetic */ /* enum */ w NONE;

    private static boolean llIIIIlIIlIlllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        w.llIIIIlIIlIllIl();
        w.llIIIIlIIlIIllI();
        NONE = new w();
        BREWING = new w();
        RESTORING = new w();
        w[] wArray = new w[lIlIlllIlIIIl[3]];
        wArray[w.lIlIlllIlIIIl[0]] = NONE;
        wArray[w.lIlIlllIlIIIl[1]] = BREWING;
        wArray[w.lIlIlllIlIIIl[2]] = RESTORING;
        $VALUES = wArray;
    }

    private static String llIIIIlIIlIIlII(String llllllllllllllIllIIllllllllIlllI, String llllllllllllllIllIIllllllllIllIl) {
        llllllllllllllIllIIllllllllIlllI = new String(Base64.getDecoder().decode(llllllllllllllIllIIllllllllIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIllllllllIllII = new StringBuilder();
        char[] llllllllllllllIllIIllllllllIlIll = llllllllllllllIllIIllllllllIllIl.toCharArray();
        int llllllllllllllIllIIllllllllIlIlI = lIlIlllIlIIIl[0];
        char[] llllllllllllllIllIIllllllllIIlII = llllllllllllllIllIIllllllllIlllI.toCharArray();
        int llllllllllllllIllIIllllllllIIIll = llllllllllllllIllIIllllllllIIlII.length;
        int llllllllllllllIllIIllllllllIIIlI = lIlIlllIlIIIl[0];
        while (w.llIIIIlIIlIlllI(llllllllllllllIllIIllllllllIIIlI, llllllllllllllIllIIllllllllIIIll)) {
            char llllllllllllllIllIIllllllllIllll = llllllllllllllIllIIllllllllIIlII[llllllllllllllIllIIllllllllIIIlI];
            llllllllllllllIllIIllllllllIllII.append((char)(llllllllllllllIllIIllllllllIllll ^ llllllllllllllIllIIllllllllIlIll[llllllllllllllIllIIllllllllIlIlI % llllllllllllllIllIIllllllllIlIll.length]));
            "".length();
            ++llllllllllllllIllIIllllllllIlIlI;
            ++llllllllllllllIllIIllllllllIIIlI;
            "".length();
            if ((0xC5 ^ 0xC1) > -" ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIllllllllIllII);
    }

    private static String llIIIIlIIlIIlIl(String llllllllllllllIllIIllllllllllllI, String llllllllllllllIllIIlllllllllllIl) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIIIIIIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlllllllllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIIIIIIIIIIIII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIIIIIIIIIIIII.init(lIlIlllIlIIIl[2], llllllllllllllIllIlIIIIIIIIIIIIl);
            return new String(llllllllllllllIllIlIIIIIIIIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllllllllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIlllllllllllll) {
            llllllllllllllIllIIlllllllllllll.printStackTrace();
            return null;
        }
    }

    private static void llIIIIlIIlIIllI() {
        lIlIlllIIlllI = new String[lIlIlllIlIIIl[3]];
        w.lIlIlllIIlllI[w.lIlIlllIlIIIl[0]] = w.llIIIIlIIlIIlII("JSoHMQ==", "keItY");
        w.lIlIlllIIlllI[w.lIlIlllIlIIIl[1]] = w.llIIIIlIIlIIlII("CAQ2ISoEEQ==", "JVsvc");
        w.lIlIlllIIlllI[w.lIlIlllIlIIIl[2]] = w.llIIIIlIIlIIlIl("LBS3aZXyis9LVUXLpCIcLA==", "PfeJs");
    }

    public static w[] values() {
        return (w[])$VALUES.clone();
    }

    public static w valueOf(String string) {
        return Enum.valueOf(w.class, string);
    }

    private static void llIIIIlIIlIllIl() {
        lIlIlllIlIIIl = new int[4];
        w.lIlIlllIlIIIl[0] = (0x2F ^ 0x2A) & ~(0xC6 ^ 0xC3);
        w.lIlIlllIlIIIl[1] = " ".length();
        w.lIlIlllIlIIIl[2] = "  ".length();
        w.lIlIlllIlIIIl[3] = "   ".length();
    }
}

