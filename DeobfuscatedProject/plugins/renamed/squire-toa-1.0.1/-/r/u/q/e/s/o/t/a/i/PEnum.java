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

public final class PEnum
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

    private static String lIllIlIlIIIIllI(String var9, String var4) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lIIlllllIIllI[2], var5);
            return new String(var6.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public static p[] values() {
        return (p[])$VALUES.clone();
    }

    private static void lIllIlIlIIIlIIl() {
        lIIlllllIIllI = new int[5];
        p.lIIlllllIIllI[0] = (0x28 ^ 0x2C ^ (0x7E ^ 0x54)) & (0x75 ^ 2 ^ (0x4C ^ 0x15) ^ -1);
        p.lIIlllllIIllI[1] = 1;
        p.lIIlllllIIllI[2] = 2;
        p.lIIlllllIIllI[3] = 3;
        p.lIIlllllIIllI[4] = 0x39 ^ 0x44 ^ (0xFC ^ 0x89);
    }

    private static void lIllIlIlIIIlIII() {
        lIIlllllIIlIl = new String[lIIlllllIIllI[3]];
        p.lIIlllllIIlIl[p.lIIlllllIIllI[0]] = p."RANGE";
        p.lIIlllllIIlIl[p.lIIlllllIIllI[1]] = p."MAGE";
        p.lIIlllllIIlIl[p.lIIlllllIIllI[2]] = p."MELEE";
    }

    private static String lIllIlIlIIIIlll(String var8, String var7) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), lIIlllllIIllI[4]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lIIlllllIIllI[2], var1);
            return new String(var2.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
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

