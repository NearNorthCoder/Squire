/*
 * Decompiled with CFR 0.152.
 */
package k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class c
extends Enum<c> {
    private static /* synthetic */ int[] lIIllllIlIlI;
    private static final /* synthetic */ c[] $VALUES;
    public static final /* synthetic */ /* enum */ c RANGE;
    public static final /* synthetic */ /* enum */ c MAGIC;
    public static final /* synthetic */ /* enum */ c MELEE;
    private static /* synthetic */ String[] lIIllllIlIIl;

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private static String llIlIIIlllllll(String lllllllllllllllIlllIlIIlIIlIIllI, String lllllllllllllllIlllIlIIlIIlIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIlIIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIlIIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIIlIIlIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIIlIIlIlIlI.init(lIIllllIlIlI[2], lllllllllllllllIlllIlIIlIIlIlIll);
            return new String(lllllllllllllllIlllIlIIlIIlIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIlIIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIIlIIlIlIIl) {
            lllllllllllllllIlllIlIIlIIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static void llIlIIlIIIIIII() {
        lIIllllIlIIl = new String[lIIllllIlIlI[3]];
        c.lIIllllIlIIl[c.lIIllllIlIlI[0]] = c.llIlIIIllllllI("OlWaSwfs334=", "GJdhD");
        c.lIIllllIlIIl[c.lIIllllIlIlI[1]] = c.llIlIIIllllllI("sFbYdH6UYpc=", "TJrvw");
        c.lIIllllIlIIl[c.lIIllllIlIlI[2]] = c.llIlIIIlllllll("0+KxLLXTq5A=", "uKSWD");
    }

    private static String llIlIIIllllllI(String lllllllllllllllIlllIlIIlIIllIIll, String lllllllllllllllIlllIlIIlIIllIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIlIIlllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIlIIllIIlI.getBytes(StandardCharsets.UTF_8)), lIIllllIlIlI[4]), "DES");
            Cipher lllllllllllllllIlllIlIIlIIllIlll = Cipher.getInstance("DES");
            lllllllllllllllIlllIlIIlIIllIlll.init(lIIllllIlIlI[2], lllllllllllllllIlllIlIIlIIlllIII);
            return new String(lllllllllllllllIlllIlIIlIIllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIlIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIIlIIllIllI) {
            lllllllllllllllIlllIlIIlIIllIllI.printStackTrace();
            return null;
        }
    }

    static {
        c.llIlIIlIIIIIIl();
        c.llIlIIlIIIIIII();
        MELEE = new c();
        MAGIC = new c();
        RANGE = new c();
        c[] cArray = new c[lIIllllIlIlI[3]];
        cArray[c.lIIllllIlIlI[0]] = MELEE;
        cArray[c.lIIllllIlIlI[1]] = MAGIC;
        cArray[c.lIIllllIlIlI[2]] = RANGE;
        $VALUES = cArray;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static void llIlIIlIIIIIIl() {
        lIIllllIlIlI = new int[5];
        c.lIIllllIlIlI[0] = (0x2A ^ 0x65) & ~(0xD6 ^ 0x99);
        c.lIIllllIlIlI[1] = " ".length();
        c.lIIllllIlIlI[2] = "  ".length();
        c.lIIllllIlIlI[3] = "   ".length();
        c.lIIllllIlIlI[4] = 39 + 0 - -45 + 105 ^ 113 + 10 - -16 + 42;
    }
}

