/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class B
extends Enum<B> {
    private static final /* synthetic */ B[] $VALUES;
    public static final /* synthetic */ /* enum */ B EMPTY;
    public static final /* synthetic */ /* enum */ B COMPLETED;
    private static /* synthetic */ int[] lIlllllllllI;
    public static final /* synthetic */ /* enum */ B IN_PROGRESS;
    public static final /* synthetic */ /* enum */ B OCCUPIED;
    public static final /* synthetic */ /* enum */ B UNKNOWN;
    private static /* synthetic */ String[] lIllllllllII;

    private static void llllIIIIlIIllI() {
        lIllllllllII = new String[lIlllllllllI[5]];
        B.lIllllllllII[B.lIlllllllllI[0]] = B.llllIIIIlIIIlI("9W8Ec95wCidGjmu0LjJShQ==", "ArxuZ");
        B.lIllllllllII[B.lIlllllllllI[1]] = B.llllIIIIlIIlII("Waf35Vajg0MVkScnKSyicg==", "GLSWn");
        B.lIllllllllII[B.lIlllllllllI[2]] = B.llllIIIIlIIlII("iHOInQJT8oiR5JKh0AUUdQ==", "UhPgr");
        B.lIllllllllII[B.lIlllllllllI[3]] = B.llllIIIIlIIlII("uCkw6RHkBss=", "ujkaL");
        B.lIllllllllII[B.lIlllllllllI[4]] = B.llllIIIIlIIlIl("ISo7FAMjKg==", "tdpZL");
    }

    public static B[] values() {
        return (B[])$VALUES.clone();
    }

    private static String llllIIIIlIIIlI(String lllllllllllllllIlIlIlllIIlllIIIl, String lllllllllllllllIlIlIlllIIlllIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIlIlllIIlllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlllIIlllIIII.getBytes(StandardCharsets.UTF_8)), lIlllllllllI[6]), "DES");
            Cipher lllllllllllllllIlIlIlllIIlllIlIl = Cipher.getInstance("DES");
            lllllllllllllllIlIlIlllIIlllIlIl.init(lIlllllllllI[2], lllllllllllllllIlIlIlllIIlllIllI);
            return new String(lllllllllllllllIlIlIlllIIlllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlllIIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIlllIIlllIlII) {
            lllllllllllllllIlIlIlllIIlllIlII.printStackTrace();
            return null;
        }
    }

    private static String llllIIIIlIIlII(String lllllllllllllllIlIlIlllIIllIIllI, String lllllllllllllllIlIlIlllIIllIIIll) {
        try {
            SecretKeySpec lllllllllllllllIlIlIlllIIllIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlllIIllIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIlllIIllIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIlllIIllIlIII.init(lIlllllllllI[2], lllllllllllllllIlIlIlllIIllIlIIl);
            return new String(lllllllllllllllIlIlIlllIIllIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlllIIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIlllIIllIIlll) {
            lllllllllllllllIlIlIlllIIllIIlll.printStackTrace();
            return null;
        }
    }

    static {
        B.llllIIIIlIlIll();
        B.llllIIIIlIIllI();
        COMPLETED = new B();
        IN_PROGRESS = new B();
        OCCUPIED = new B();
        EMPTY = new B();
        UNKNOWN = new B();
        B[] bArray = new B[lIlllllllllI[5]];
        bArray[B.lIlllllllllI[0]] = COMPLETED;
        bArray[B.lIlllllllllI[1]] = IN_PROGRESS;
        bArray[B.lIlllllllllI[2]] = OCCUPIED;
        bArray[B.lIlllllllllI[3]] = EMPTY;
        bArray[B.lIlllllllllI[4]] = UNKNOWN;
        $VALUES = bArray;
    }

    public static B valueOf(String string) {
        return Enum.valueOf(B.class, string);
    }

    private static void llllIIIIlIlIll() {
        lIlllllllllI = new int[7];
        B.lIlllllllllI[0] = (24 + 19 - -44 + 116 ^ 163 + 1 - -26 + 5) & (0xCB ^ 0xB3 ^ (0x46 ^ 0x36) ^ -" ".length());
        B.lIlllllllllI[1] = " ".length();
        B.lIlllllllllI[2] = "  ".length();
        B.lIlllllllllI[3] = "   ".length();
        B.lIlllllllllI[4] = 0x15 ^ 0x11;
        B.lIlllllllllI[5] = 123 + 93 - 152 + 109 ^ 58 + 38 - 14 + 86;
        B.lIlllllllllI[6] = 0xB8 ^ 0xB0;
    }

    private static String llllIIIIlIIlIl(String lllllllllllllllIlIlIlllIIlIlIIIl, String lllllllllllllllIlIlIlllIIlIlIlIl) {
        lllllllllllllllIlIlIlllIIlIlIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlllIIlIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIlllIIlIlIlII = new StringBuilder();
        char[] lllllllllllllllIlIlIlllIIlIlIIll = lllllllllllllllIlIlIlllIIlIlIlIl.toCharArray();
        int lllllllllllllllIlIlIlllIIlIlIIlI = lIlllllllllI[0];
        char[] lllllllllllllllIlIlIlllIIlIIllII = lllllllllllllllIlIlIlllIIlIlIIIl.toCharArray();
        int lllllllllllllllIlIlIlllIIlIIlIll = lllllllllllllllIlIlIlllIIlIIllII.length;
        int lllllllllllllllIlIlIlllIIlIIlIlI = lIlllllllllI[0];
        while (B.llllIIIIlIllII(lllllllllllllllIlIlIlllIIlIIlIlI, lllllllllllllllIlIlIlllIIlIIlIll)) {
            char lllllllllllllllIlIlIlllIIlIlIlll = lllllllllllllllIlIlIlllIIlIIllII[lllllllllllllllIlIlIlllIIlIIlIlI];
            lllllllllllllllIlIlIlllIIlIlIlII.append((char)(lllllllllllllllIlIlIlllIIlIlIlll ^ lllllllllllllllIlIlIlllIIlIlIIll[lllllllllllllllIlIlIlllIIlIlIIlI % lllllllllllllllIlIlIlllIIlIlIIll.length]));
            "".length();
            ++lllllllllllllllIlIlIlllIIlIlIIlI;
            ++lllllllllllllllIlIlIlllIIlIIlIlI;
            "".length();
            if (((0x28 ^ 0x65 ^ " ".length()) & (0xFC ^ 0x9C ^ (0x76 ^ 0x5A) ^ -" ".length())) == 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlIlllIIlIlIlII);
    }

    private static boolean llllIIIIlIllII(int n2, int n3) {
        return n2 < n3;
    }
}

