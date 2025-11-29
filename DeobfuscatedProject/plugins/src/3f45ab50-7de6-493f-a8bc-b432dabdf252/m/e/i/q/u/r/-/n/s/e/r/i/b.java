/*
 * Decompiled with CFR 0.152.
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class b
extends Enum<b> {
    private static /* synthetic */ String[] lllllIlllIlI;
    private static final /* synthetic */ b[] $VALUES;
    private static /* synthetic */ int[] lllllIlllIll;
    public static final /* synthetic */ /* enum */ b JAVELIN_HEADS;
    public static final /* synthetic */ /* enum */ b ARROW_TIPS;
    public static final /* synthetic */ /* enum */ b DISABLE;
    public static final /* synthetic */ /* enum */ b DART_TIPS;
    public static final /* synthetic */ /* enum */ b BOLT_TIPS;

    private static String lIIlIIllllIlllI(String lllllllllllllllIIlIIIllllIIlIIlI, String lllllllllllllllIIlIIIllllIIlIIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIllllIIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIllllIIlIIll.getBytes(StandardCharsets.UTF_8)), lllllIlllIll[6]), "DES");
            Cipher lllllllllllllllIIlIIIllllIIlIllI = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIllllIIlIllI.init(lllllIlllIll[2], lllllllllllllllIIlIIIllllIIlIlll);
            return new String(lllllllllllllllIIlIIIllllIIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIllllIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIllllIIlIlIl) {
            lllllllllllllllIIlIIIllllIIlIlIl.printStackTrace();
            return null;
        }
    }

    static {
        b.lIIlIIlllllIIII();
        b.lIIlIIllllIllll();
        BOLT_TIPS = new b();
        ARROW_TIPS = new b();
        JAVELIN_HEADS = new b();
        DART_TIPS = new b();
        DISABLE = new b();
        b[] bArray = new b[lllllIlllIll[5]];
        bArray[b.lllllIlllIll[0]] = BOLT_TIPS;
        bArray[b.lllllIlllIll[1]] = ARROW_TIPS;
        bArray[b.lllllIlllIll[2]] = JAVELIN_HEADS;
        bArray[b.lllllIlllIll[3]] = DART_TIPS;
        bArray[b.lllllIlllIll[4]] = DISABLE;
        $VALUES = bArray;
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    private static boolean lIIlIIlllllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlIIllllIllIl(String lllllllllllllllIIlIIIllllIlIIIIl, String lllllllllllllllIIlIIIllllIIllllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlIIIllIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIllllIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIlIIIllIlIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIlIIIllIlIlII.init(lllllIlllIll[2], lllllllllllllllIIlIIlIIIllIlIlIl);
            return new String(lllllllllllllllIIlIIlIIIllIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIllllIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIlIIIllIlIIll) {
            lllllllllllllllIIlIIlIIIllIlIIll.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIlllllIIII() {
        lllllIlllIll = new int[7];
        b.lllllIlllIll[0] = (0xAB ^ 0xB9) & ~(0x15 ^ 7);
        b.lllllIlllIll[1] = " ".length();
        b.lllllIlllIll[2] = "  ".length();
        b.lllllIlllIll[3] = "   ".length();
        b.lllllIlllIll[4] = 0x5C ^ 0x58;
        b.lllllIlllIll[5] = "   ".length() ^ (0xC3 ^ 0xC5);
        b.lllllIlllIll[6] = 0x6E ^ 0x66;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    private static void lIIlIIllllIllll() {
        lllllIlllIlI = new String[lllllIlllIll[5]];
        b.lllllIlllIlI[b.lllllIlllIll[0]] = b.lIIlIIllllIllII("ASAmEhoXJjoV", "CojFE");
        b.lllllIlllIlI[b.lllllIlllIll[1]] = b.lIIlIIllllIllIl("VuOA0B4vCK15VxliPoe9ag==", "eVlEf");
        b.lllllIlllIlI[b.lllllIlllIll[2]] = b.lIIlIIllllIllIl("3BFFMqY58R5BvsRvDGHZdA==", "SwZdB");
        b.lllllIlllIlI[b.lllllIlllIll[3]] = b.lIIlIIllllIllII("IgMTNxoyCxEw", "fBAcE");
        b.lllllIlllIlI[b.lllllIlllIll[4]] = b.lIIlIIllllIlllI("ns+YBOnUCi8=", "iGYAM");
    }

    private static String lIIlIIllllIllII(String lllllllllllllllIIlIIIllllIIIIlII, String lllllllllllllllIIlIIIlllIllllllI) {
        lllllllllllllllIIlIIIllllIIIIlII = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIllllIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIIllllIIIIIlI = new StringBuilder();
        char[] lllllllllllllllIIlIIIllllIIIIIIl = lllllllllllllllIIlIIIlllIllllllI.toCharArray();
        int lllllllllllllllIIlIIIllllIIIIIII = lllllIlllIll[0];
        char[] lllllllllllllllIIlIIIlllIllllIlI = lllllllllllllllIIlIIIllllIIIIlII.toCharArray();
        int lllllllllllllllIIlIIIlllIllllIIl = lllllllllllllllIIlIIIlllIllllIlI.length;
        int lllllllllllllllIIlIIIlllIllllIII = lllllIlllIll[0];
        while (b.lIIlIIlllllIIIl(lllllllllllllllIIlIIIlllIllllIII, lllllllllllllllIIlIIIlllIllllIIl)) {
            char lllllllllllllllIIlIIIllllIIIIlIl = lllllllllllllllIIlIIIlllIllllIlI[lllllllllllllllIIlIIIlllIllllIII];
            lllllllllllllllIIlIIIllllIIIIIlI.append((char)(lllllllllllllllIIlIIIllllIIIIlIl ^ lllllllllllllllIIlIIIllllIIIIIIl[lllllllllllllllIIlIIIllllIIIIIII % lllllllllllllllIIlIIIllllIIIIIIl.length]));
            "".length();
            ++lllllllllllllllIIlIIIllllIIIIIII;
            ++lllllllllllllllIIlIIIlllIllllIII;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIIllllIIIIIlI);
    }
}

