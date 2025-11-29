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

public final class CEnum
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

    private static String llIlIIIlllllll(String var6, String var2) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lIIllllIlIlI[2], var10);
            return new String(var3.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static void llIlIIlIIIIIII() {
        lIIllllIlIIl = new String[lIIllllIlIlI[3]];
        c.lIIllllIlIIl[c.lIIllllIlIlI[0]] = c."MELEE";
        c.lIIllllIlIIl[c.lIIllllIlIlI[1]] = c."MAGIC";
        c.lIIllllIlIIl[c.lIIllllIlIlI[2]] = c."RANGE";
    }

    private static String llIlIIIllllllI(String var1, String var7) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), lIIllllIlIlI[4]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(lIIllllIlIlI[2], var8);
            return new String(var4.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
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
        c.lIIllllIlIlI[1] = 1;
        c.lIIllllIlIlI[2] = 2;
        c.lIIllllIlIlI[3] = 3;
        c.lIIllllIlIlI[4] = 39 + 0 - -45 + 105 ^ 113 + 10 - -16 + 42;
    }
}

