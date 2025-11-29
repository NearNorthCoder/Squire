/*
 * Decompiled with CFR 0.152.
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class s
extends Enum<s> {
    private static /* synthetic */ int[] lllIIlIlIlll;
    private static final /* synthetic */ s[] $VALUES;
    private static /* synthetic */ String[] lllIIlIlIllI;
    public static final /* synthetic */ /* enum */ s INTERACT;

    private static String lIIIlIlIIIIllll(String lllllllllllllllIIllIlIlIlIlIIlIl, String lllllllllllllllIIllIlIlIlIlIIlII) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIlIlIlIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIlIlIlIIlII.getBytes(StandardCharsets.UTF_8)), lllIIlIlIlll[2]), "DES");
            Cipher lllllllllllllllIIllIlIlIlIlIlIIl = Cipher.getInstance("DES");
            lllllllllllllllIIllIlIlIlIlIlIIl.init(lllIIlIlIlll[3], lllllllllllllllIIllIlIlIlIlIlIlI);
            return new String(lllllllllllllllIIllIlIlIlIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIlIlIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIlIlIlIlIII) {
            lllllllllllllllIIllIlIlIlIlIlIII.printStackTrace();
            return null;
        }
    }

    static {
        s.lIIIlIlIIIlIIIl();
        s.lIIIlIlIIIlIIII();
        INTERACT = new s();
        s[] sArray = new s[lllIIlIlIlll[1]];
        sArray[s.lllIIlIlIlll[0]] = INTERACT;
        $VALUES = sArray;
    }

    public static s valueOf(String string) {
        return Enum.valueOf(s.class, string);
    }

    private static void lIIIlIlIIIlIIIl() {
        lllIIlIlIlll = new int[4];
        s.lllIIlIlIlll[0] = (106 + 123 - 121 + 66 ^ 27 + 89 - -30 + 0) & (51 + 112 - 151 + 128 ^ 107 + 143 - 175 + 101 ^ -" ".length());
        s.lllIIlIlIlll[1] = " ".length();
        s.lllIIlIlIlll[2] = 0xF6 ^ 0x85 ^ (0x7B ^ 0);
        s.lllIIlIlIlll[3] = "  ".length();
    }

    private static void lIIIlIlIIIlIIII() {
        lllIIlIlIllI = new String[lllIIlIlIlll[1]];
        s.lllIIlIlIllI[s.lllIIlIlIlll[0]] = s.lIIIlIlIIIIllll("gCixbZKhOYqJHQhKHVoJRw==", "Uerdm");
    }

    public static s[] values() {
        return (s[])$VALUES.clone();
    }
}

