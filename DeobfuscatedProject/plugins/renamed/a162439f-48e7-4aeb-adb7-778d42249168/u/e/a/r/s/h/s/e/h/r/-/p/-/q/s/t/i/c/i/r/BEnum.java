/*
 * Decompiled with CFR 0.152.
 */
package u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class BEnum
extends Enum<b> {
    private static /* synthetic */ String[] lIlIllIlllII;
    private static final /* synthetic */ b[] $VALUES;
    private static /* synthetic */ int[] lIlIllIlllIl;
    public static final /* synthetic */ /* enum */ b CHARTER_SHIPS;

    private static void lllIIIIlIIlIIl() {
        lIlIllIlllIl = new int[3];
        b.lIlIllIlllIl[0] = (0x9A ^ 0xC4) & ~(0x98 ^ 0xC6) & ~((0x63 ^ 0x55) & ~(0x61 ^ 0x57));
        b.lIlIllIlllIl[1] = 1;
        b.lIlIllIlllIl[2] = 2;
    }

    static {
        b.lllIIIIlIIlIIl();
        b.lllIIIIlIIlIII();
        CHARTER_SHIPS = new b();
        b[] bArray = new b[lIlIllIlllIl[1]];
        bArray[b.lIlIllIlllIl[0]] = CHARTER_SHIPS;
        $VALUES = bArray;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    private static void lllIIIIlIIlIII() {
        lIlIllIlllII = new String[lIlIllIlllIl[1]];
        b.lIlIllIlllII[b.lIlIllIlllIl[0]] = b."CHARTER_SHIPS";
    }

    private static String lllIIIIlIIIlll(String var5, String var4) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lIlIllIlllIl[2], var1);
            return new String(var2.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }
}

