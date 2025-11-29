/*
 * Decompiled with CFR 0.152.
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class F
extends Enum<F> {
    private static final /* synthetic */ F[] $VALUES;
    private static /* synthetic */ String[] lllIIIllllIl;
    private static /* synthetic */ int[] lllIIIlllllI;
    public static final /* synthetic */ /* enum */ F STATUE_8_DOUBLE;
    public static final /* synthetic */ /* enum */ F STATUE_BLUE_DOUBLE;
    public static final /* synthetic */ /* enum */ F STATUE_6_DOUBLE;

    private static String lIIIlIIlllIIIIl(String var3, String var1) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lllIIIlllllI[2], var5);
            return new String(var2.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    static {
        F.lIIIlIIlllIIIll();
        F.lIIIlIIlllIIIlI();
        STATUE_6_DOUBLE = new F();
        STATUE_8_DOUBLE = new F();
        STATUE_BLUE_DOUBLE = new F();
        F[] fArray = new F[lllIIIlllllI[3]];
        fArray[F.lllIIIlllllI[0]] = STATUE_6_DOUBLE;
        fArray[F.lllIIIlllllI[1]] = STATUE_8_DOUBLE;
        fArray[F.lllIIIlllllI[2]] = STATUE_BLUE_DOUBLE;
        $VALUES = fArray;
    }

    private static void lIIIlIIlllIIIlI() {
        lllIIIllllIl = new String[lllIIIlllllI[3]];
        F.lllIIIllllIl[F.lllIIIlllllI[0]] = F."STATUE_6_DOUBLE";
        F.lllIIIllllIl[F.lllIIIlllllI[1]] = F."STATUE_8_DOUBLE";
        F.lllIIIllllIl[F.lllIIIlllllI[2]] = F."STATUE_BLUE_DOUBLE";
    }

    public static F[] values() {
        return (F[])$VALUES.clone();
    }

    private static void lIIIlIIlllIIIll() {
        lllIIIlllllI = new int[4];
        F.lllIIIlllllI[0] = (0x3F ^ 0x1A) & ~(0x61 ^ 0x44);
        F.lllIIIlllllI[1] = 1;
        F.lllIIIlllllI[2] = 2;
        F.lllIIIlllllI[3] = 3;
    }

    public static F valueOf(String string) {
        return Enum.valueOf(F.class, string);
    }
}

