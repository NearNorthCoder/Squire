/*
 * Decompiled with CFR 0.152.
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class A
extends Enum<A> {
    public static final /* synthetic */ /* enum */ A UNKNOWN;
    private static /* synthetic */ int[] lIlIlIllIlll;
    public static final /* synthetic */ /* enum */ A ACID;
    public static final /* synthetic */ /* enum */ A CRYSTAL;
    private static /* synthetic */ String[] lIlIlIllIllI;
    public static final /* synthetic */ /* enum */ A FLAME;
    private static final /* synthetic */ A[] $VALUES;

    static {
        A.llIllllIllllII();
        A.llIllllIlllIll();
        FLAME = new A();
        ACID = new A();
        CRYSTAL = new A();
        UNKNOWN = new A();
        A[] aArray = new A[lIlIlIllIlll[4]];
        aArray[A.lIlIlIllIlll[0]] = FLAME;
        aArray[A.lIlIlIllIlll[1]] = ACID;
        aArray[A.lIlIlIllIlll[2]] = CRYSTAL;
        aArray[A.lIlIlIllIlll[3]] = UNKNOWN;
        $VALUES = aArray;
    }

    private static boolean llIllllIllllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIllllIlllIIl(String lllllllllllllllIllIIlllIIIllIIlI, String lllllllllllllllIllIIlllIIIlIllll) {
        try {
            SecretKeySpec lllllllllllllllIllIIlllIIIllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlllIIIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIlllIIIllIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIlllIIIllIlII.init(lIlIlIllIlll[2], lllllllllllllllIllIIlllIIIllIlIl);
            return new String(lllllllllllllllIllIIlllIIIllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlllIIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIlllIIIllIIll) {
            lllllllllllllllIllIIlllIIIllIIll.printStackTrace();
            return null;
        }
    }

    private static String llIllllIlllIlI(String lllllllllllllllIllIIlllIIIIlllIl, String lllllllllllllllIllIIlllIIIlIIIIl) {
        lllllllllllllllIllIIlllIIIIlllIl = new String(Base64.getDecoder().decode(lllllllllllllllIllIIlllIIIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIlllIIIlIIIII = new StringBuilder();
        char[] lllllllllllllllIllIIlllIIIIlllll = lllllllllllllllIllIIlllIIIlIIIIl.toCharArray();
        int lllllllllllllllIllIIlllIIIIllllI = lIlIlIllIlll[0];
        char[] lllllllllllllllIllIIlllIIIIllIII = lllllllllllllllIllIIlllIIIIlllIl.toCharArray();
        int lllllllllllllllIllIIlllIIIIlIlll = lllllllllllllllIllIIlllIIIIllIII.length;
        int lllllllllllllllIllIIlllIIIIlIllI = lIlIlIllIlll[0];
        while (A.llIllllIllllIl(lllllllllllllllIllIIlllIIIIlIllI, lllllllllllllllIllIIlllIIIIlIlll)) {
            char lllllllllllllllIllIIlllIIIlIIIll = lllllllllllllllIllIIlllIIIIllIII[lllllllllllllllIllIIlllIIIIlIllI];
            lllllllllllllllIllIIlllIIIlIIIII.append((char)(lllllllllllllllIllIIlllIIIlIIIll ^ lllllllllllllllIllIIlllIIIIlllll[lllllllllllllllIllIIlllIIIIllllI % lllllllllllllllIllIIlllIIIIlllll.length]));
            "".length();
            ++lllllllllllllllIllIIlllIIIIllllI;
            ++lllllllllllllllIllIIlllIIIIlIllI;
            "".length();
            if (((0xFB ^ 0x82 ^ (0x79 ^ 0x11)) & (3 + 140 - 115 + 132 ^ 82 + 133 - 138 + 100 ^ -" ".length())) != "  ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIIlllIIIlIIIII);
    }

    private static void llIllllIllllII() {
        lIlIlIllIlll = new int[5];
        A.lIlIlIllIlll[0] = (0x5F ^ 6) & ~(0x13 ^ 0x4A);
        A.lIlIlIllIlll[1] = " ".length();
        A.lIlIlIllIlll[2] = "  ".length();
        A.lIlIlIllIlll[3] = "   ".length();
        A.lIlIlIllIlll[4] = 0x67 ^ 0x53 ^ (0xF5 ^ 0xC5);
    }

    private static void llIllllIlllIll() {
        lIlIlIllIllI = new String[lIlIlIllIlll[4]];
        A.lIlIlIllIllI[A.lIlIlIllIlll[0]] = A.llIllllIlllIIl("C3IUMA2sKZc=", "qHrFj");
        A.lIlIlIllIllI[A.lIlIlIllIlll[1]] = A.llIllllIlllIlI("MgEhMQ==", "sBhug");
        A.lIlIlIllIllI[A.lIlIlIllIlll[2]] = A.llIllllIlllIIl("O3LcJ/v8RVs=", "QbayX");
        A.lIlIlIllIllI[A.lIlIlIllIlll[3]] = A.llIllllIlllIlI("Gj8qLxkYPw==", "OqaaV");
    }

    public static A valueOf(String string) {
        return Enum.valueOf(A.class, string);
    }

    public static A[] values() {
        return (A[])$VALUES.clone();
    }
}

