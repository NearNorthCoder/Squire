/*
 * Decompiled with CFR 0.152.
 */
package -.r.u.q.e.s.o.t.a.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class p
extends Enum<p> {
    public static final /* synthetic */ /* enum */ p RANGE;
    private static /* synthetic */ int[] lIIlllllIIllI;
    private static /* synthetic */ String[] lIIlllllIIlIl;
    private static final /* synthetic */ p[] $VALUES;
    public static final /* synthetic */ /* enum */ p MELEE;
    public static final /* synthetic */ /* enum */ p MAGE;

    public static p valueOf(String string) {
        return Enum.valueOf(p.class, string);
    }

    private static String lIllIlIlIIIIllI(String llllllllllllllIlllIlIIIIIlllIIll, String llllllllllllllIlllIlIIIIIlllIIII) {
        try {
            SecretKeySpec llllllllllllllIlllIlIIIIIlllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIIIIIlllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlIIIIIlllIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlIIIIIlllIlIl.init(lIIlllllIIllI[2], llllllllllllllIlllIlIIIIIlllIllI);
            return new String(llllllllllllllIlllIlIIIIIlllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIIIIIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlIIIIIlllIlII) {
            llllllllllllllIlllIlIIIIIlllIlII.printStackTrace();
            return null;
        }
    }

    public static p[] values() {
        return (p[])$VALUES.clone();
    }

    private static void lIllIlIlIIIlIIl() {
        lIIlllllIIllI = new int[5];
        p.lIIlllllIIllI[0] = (0x28 ^ 0x2C ^ (0x7E ^ 0x54)) & (0x75 ^ 2 ^ (0x4C ^ 0x15) ^ -" ".length());
        p.lIIlllllIIllI[1] = " ".length();
        p.lIIlllllIIllI[2] = "  ".length();
        p.lIIlllllIIllI[3] = "   ".length();
        p.lIIlllllIIllI[4] = 0x39 ^ 0x44 ^ (0xFC ^ 0x89);
    }

    private static void lIllIlIlIIIlIII() {
        lIIlllllIIlIl = new String[lIIlllllIIllI[3]];
        p.lIIlllllIIlIl[p.lIIlllllIIllI[0]] = p.lIllIlIlIIIIllI("f76kvmYwa6Y=", "zaIxe");
        p.lIIlllllIIlIl[p.lIIlllllIIllI[1]] = p.lIllIlIlIIIIlll("dw8KpBvwwV4=", "FrDjJ");
        p.lIIlllllIIlIl[p.lIIlllllIIllI[2]] = p.lIllIlIlIIIIllI("EL/bd3x5KYg=", "SqYfe");
    }

    private static String lIllIlIlIIIIlll(String llllllllllllllIlllIlIIIIlIIIIIII, String llllllllllllllIlllIlIIIIIlllllll) {
        try {
            SecretKeySpec llllllllllllllIlllIlIIIIlIIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIIIIIlllllll.getBytes(StandardCharsets.UTF_8)), lIIlllllIIllI[4]), "DES");
            Cipher llllllllllllllIlllIlIIIIlIIIIIlI = Cipher.getInstance("DES");
            llllllllllllllIlllIlIIIIlIIIIIlI.init(lIIlllllIIllI[2], llllllllllllllIlllIlIIIIlIIIIIll);
            return new String(llllllllllllllIlllIlIIIIlIIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIIIIlIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlIIIIlIIIIIIl) {
            llllllllllllllIlllIlIIIIlIIIIIIl.printStackTrace();
            return null;
        }
    }

    static {
        p.lIllIlIlIIIlIIl();
        p.lIllIlIlIIIlIII();
        RANGE = new p();
        MAGE = new p();
        MELEE = new p();
        p[] pArray = new p[lIIlllllIIllI[3]];
        pArray[p.lIIlllllIIllI[0]] = RANGE;
        pArray[p.lIIlllllIIllI[1]] = MAGE;
        pArray[p.lIIlllllIIllI[2]] = MELEE;
        $VALUES = pArray;
    }
}

