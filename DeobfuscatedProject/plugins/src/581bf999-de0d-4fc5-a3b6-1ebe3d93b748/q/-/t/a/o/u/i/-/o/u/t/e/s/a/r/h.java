/*
 * Decompiled with CFR 0.152.
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class h
extends Enum<h> {
    private static /* synthetic */ String[] lIllllIllII;
    public static final /* synthetic */ /* enum */ h SPECIAL_2;
    public static final /* synthetic */ /* enum */ h SPECIAL_1;
    public static final /* synthetic */ /* enum */ h NONE;
    private static /* synthetic */ int[] lIllllIllIl;
    private static final /* synthetic */ h[] $VALUES;

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }

    static {
        h.lIIllIlIllIlIl();
        h.lIIllIlIllIlII();
        SPECIAL_1 = new h();
        SPECIAL_2 = new h();
        NONE = new h();
        h[] hArray = new h[lIllllIllIl[3]];
        hArray[h.lIllllIllIl[0]] = SPECIAL_1;
        hArray[h.lIllllIllIl[1]] = SPECIAL_2;
        hArray[h.lIllllIllIl[2]] = NONE;
        $VALUES = hArray;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static void lIIllIlIllIlIl() {
        lIllllIllIl = new int[5];
        h.lIllllIllIl[0] = (0x49 ^ 0x1F ^ (0xDC ^ 0xBF)) & (0x97 ^ 0xA1 ^ "   ".length() ^ -" ".length());
        h.lIllllIllIl[1] = " ".length();
        h.lIllllIllIl[2] = "  ".length();
        h.lIllllIllIl[3] = "   ".length();
        h.lIllllIllIl[4] = 0xA1 ^ 0xA9;
    }

    private static void lIIllIlIllIlII() {
        lIllllIllII = new String[lIllllIllIl[3]];
        h.lIllllIllII[h.lIllllIllIl[0]] = h.lIIllIlIllIIlI("R0JgN2I3sYMtVTcCwfzz8A==", "zPtOt");
        h.lIllllIllII[h.lIllllIllIl[1]] = h.lIIllIlIllIIlI("H3M9INK+6IVOXLt7NqYr4g==", "frkKf");
        h.lIllllIllII[h.lIllllIllIl[2]] = h.lIIllIlIllIIll("IxYvYjbKjS8=", "NSNYj");
    }

    private static String lIIllIlIllIIll(String llllllllllllllllIlIIlIlIllIIlIII, String llllllllllllllllIlIIlIlIllIIlIIl) {
        try {
            SecretKeySpec llllllllllllllllIlIIlIlIllIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIlIllIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIlIlIllIIllII = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIlIlIllIIllII.init(lIllllIllIl[2], llllllllllllllllIlIIlIlIllIIllIl);
            return new String(llllllllllllllllIlIIlIlIllIIllII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIlIllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIlIlIllIIlIll) {
            llllllllllllllllIlIIlIlIllIIlIll.printStackTrace();
            return null;
        }
    }

    private static String lIIllIlIllIIlI(String llllllllllllllllIlIIlIlIllIlIlIl, String llllllllllllllllIlIIlIlIllIlIllI) {
        try {
            SecretKeySpec llllllllllllllllIlIIlIlIllIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIlIllIlIllI.getBytes(StandardCharsets.UTF_8)), lIllllIllIl[4]), "DES");
            Cipher llllllllllllllllIlIIlIlIllIllIIl = Cipher.getInstance("DES");
            llllllllllllllllIlIIlIlIllIllIIl.init(lIllllIllIl[2], llllllllllllllllIlIIlIlIllIllIlI);
            return new String(llllllllllllllllIlIIlIlIllIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIlIllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIlIlIllIllIII) {
            llllllllllllllllIlIIlIlIllIllIII.printStackTrace();
            return null;
        }
    }
}

