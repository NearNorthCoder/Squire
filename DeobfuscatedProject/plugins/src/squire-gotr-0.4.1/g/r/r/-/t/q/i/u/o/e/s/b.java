/*
 * Decompiled with CFR 0.152.
 */
package g.r.r.-.t.q.i.u.o.e.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class b
extends Enum<b> {
    public static final /* synthetic */ /* enum */ b OVERCHARGED;
    private static /* synthetic */ String[] llIIllIlIlIl;
    public static final /* synthetic */ /* enum */ b STRONG;
    private static final /* synthetic */ b[] $VALUES;
    public static final /* synthetic */ /* enum */ b MEDIUM;
    public static final /* synthetic */ /* enum */ b WEAK;
    private static /* synthetic */ int[] llIIllIlIllI;

    private static String llllllIlIIllIl(String lllllllllllllllIlIIllIlIIIIIllll, String lllllllllllllllIlIIllIlIIIIIlIIl) {
        lllllllllllllllIlIIllIlIIIIIllll = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllIlIIIIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIllIlIIIIIllIl = new StringBuilder();
        char[] lllllllllllllllIlIIllIlIIIIIllII = lllllllllllllllIlIIllIlIIIIIlIIl.toCharArray();
        int lllllllllllllllIlIIllIlIIIIIlIll = llIIllIlIllI[0];
        char[] lllllllllllllllIlIIllIlIIIIIIlIl = lllllllllllllllIlIIllIlIIIIIllll.toCharArray();
        int lllllllllllllllIlIIllIlIIIIIIlII = lllllllllllllllIlIIllIlIIIIIIlIl.length;
        int lllllllllllllllIlIIllIlIIIIIIIll = llIIllIlIllI[0];
        while (b.llllllIlIlIIIl(lllllllllllllllIlIIllIlIIIIIIIll, lllllllllllllllIlIIllIlIIIIIIlII)) {
            char lllllllllllllllIlIIllIlIIIIlIIII = lllllllllllllllIlIIllIlIIIIIIlIl[lllllllllllllllIlIIllIlIIIIIIIll];
            lllllllllllllllIlIIllIlIIIIIllIl.append((char)(lllllllllllllllIlIIllIlIIIIlIIII ^ lllllllllllllllIlIIllIlIIIIIllII[lllllllllllllllIlIIllIlIIIIIlIll % lllllllllllllllIlIIllIlIIIIIllII.length]));
            "".length();
            ++lllllllllllllllIlIIllIlIIIIIlIll;
            ++lllllllllllllllIlIIllIlIIIIIIIll;
            "".length();
            if (-(6 ^ 0x40 ^ (0x42 ^ 0)) <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIllIlIIIIIllIl);
    }

    private static String llllllIlIIlllI(String lllllllllllllllIlIIllIlIIIIlllIl, String lllllllllllllllIlIIllIlIIIIlllII) {
        try {
            SecretKeySpec lllllllllllllllIlIIllIlIIIlIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIlIIIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIllIlIIIlIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIllIlIIIlIIIIl.init(llIIllIlIllI[2], lllllllllllllllIlIIllIlIIIlIIIlI);
            return new String(lllllllllllllllIlIIllIlIIIlIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIlIIIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIllIlIIIlIIIII) {
            lllllllllllllllIlIIllIlIIIlIIIII.printStackTrace();
            return null;
        }
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    private static void llllllIlIlIIII() {
        llIIllIlIllI = new int[5];
        b.llIIllIlIllI[0] = (128 + 105 - 141 + 85 ^ 98 + 73 - 66 + 60) & (0x5A ^ 0x21 ^ (0x7E ^ 0x11) ^ -" ".length());
        b.llIIllIlIllI[1] = " ".length();
        b.llIIllIlIllI[2] = "  ".length();
        b.llIIllIlIllI[3] = "   ".length();
        b.llIIllIlIllI[4] = 0x9C ^ 0x98;
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    static {
        b.llllllIlIlIIII();
        b.llllllIlIIllll();
        WEAK = new b();
        MEDIUM = new b();
        STRONG = new b();
        OVERCHARGED = new b();
        b[] bArray = new b[llIIllIlIllI[4]];
        bArray[b.llIIllIlIllI[0]] = WEAK;
        bArray[b.llIIllIlIllI[1]] = MEDIUM;
        bArray[b.llIIllIlIllI[2]] = STRONG;
        bArray[b.llIIllIlIllI[3]] = OVERCHARGED;
        $VALUES = bArray;
    }

    private static void llllllIlIIllll() {
        llIIllIlIlIl = new String[llIIllIlIllI[4]];
        b.llIIllIlIlIl[b.llIIllIlIllI[0]] = b.llllllIlIIllIl("DTAkCQ==", "ZueBq");
        b.llIIllIlIlIl[b.llIIllIlIllI[1]] = b.llllllIlIIllIl("DAs9MSEM", "ANyxt");
        b.llIIllIlIlIl[b.llIIllIlIllI[2]] = b.llllllIlIIlllI("jpD2t6zd+hI=", "uOdbw");
        b.llIIllIlIlIl[b.llIIllIlIllI[3]] = b.llllllIlIIllIl("GTo1JAkeLSIxDxI=", "VlpvJ");
    }

    public String toString() {
        String string = super.toString();
        return string.charAt(llIIllIlIllI[0]) + string.substring(llIIllIlIllI[1]).toLowerCase();
    }

    private static boolean llllllIlIlIIIl(int n2, int n3) {
        return n2 < n3;
    }
}

