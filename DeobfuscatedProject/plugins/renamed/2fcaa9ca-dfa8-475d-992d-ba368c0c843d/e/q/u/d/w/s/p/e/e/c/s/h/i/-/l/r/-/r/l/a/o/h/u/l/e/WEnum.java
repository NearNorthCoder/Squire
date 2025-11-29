/*
 * Decompiled with CFR 0.152.
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class WEnum
extends Enum<w> {
    /* synthetic */ String name;
    private static /* synthetic */ int[] lllIIIIlIIIl;
    public static final /* synthetic */ /* enum */ w NONE;
    private static final /* synthetic */ w[] $VALUES;
    public static final /* synthetic */ /* enum */ w HALLOWED_HAMMER;
    private static /* synthetic */ String[] lllIIIIIllll;
    public static final /* synthetic */ /* enum */ w HAMMER;

    private static void lIIIlIIIIlIllII() {
        lllIIIIIllll = new String[lllIIIIlIIIl[6]];
        w.lllIIIIIllll[w.lllIIIIlIIIl[0]] = w."NONE";
        w.lllIIIIIllll[w.lllIIIIlIIIl[1]] = w."";
        w.lllIIIIIllll[w.lllIIIIlIIIl[2]] = w."HAMMER";
        w.lllIIIIIllll[w.lllIIIIlIIIl[3]] = w."Hammer";
        w.lllIIIIIllll[w.lllIIIIlIIIl[4]] = w."HALLOWED_HAMMER";
        w.lllIIIIIllll[w.lllIIIIlIIIl[5]] = w."Hallowed hammer";
    }

    private static String lIIIlIIIIlIlIlI(String var9, String var6) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), lllIIIIlIIIl[7]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lllIIIIlIIIl[2], var1);
            return new String(var2.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    static {
        w.lIIIlIIIIlllIIl();
        w.lIIIlIIIIlIllII();
        NONE = new w(lllIIIIIllll[lllIIIIlIIIl[1]]);
        HAMMER = new w(lllIIIIIllll[lllIIIIlIIIl[3]]);
        HALLOWED_HAMMER = new w(lllIIIIIllll[lllIIIIlIIIl[5]]);
        w[] wArray = new w[lllIIIIlIIIl[3]];
        wArray[w.lllIIIIlIIIl[0]] = NONE;
        wArray[w.lllIIIIlIIIl[1]] = HAMMER;
        wArray[w.lllIIIIlIIIl[2]] = HALLOWED_HAMMER;
        $VALUES = wArray;
    }

    public static w[] values() {
        return (w[])$VALUES.clone();
    }

    private static String lIIIlIIIIlIlIll(String var10, String var3) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lllIIIIlIIIl[2], var7);
            return new String(var8.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    public static w valueOf(String string) {
        return Enum.valueOf(w.class, string);
    }

    private w(String string2) {
        this.name = string2;
    }

    private static void lIIIlIIIIlllIIl() {
        lllIIIIlIIIl = new int[8];
        w.lllIIIIlIIIl[0] = (0xEF ^ 0xB4) & ~(0x49 ^ 0x12);
        w.lllIIIIlIIIl[1] = 1;
        w.lllIIIIlIIIl[2] = 2;
        w.lllIIIIlIIIl[3] = 3;
        w.lllIIIIlIIIl[4] = 0x80 ^ 0x84;
        w.lllIIIIlIIIl[5] = 0xC6 ^ 0xC3;
        w.lllIIIIlIIIl[6] = 0x4E ^ 0x48;
        w.lllIIIIlIIIl[7] = 0x7C ^ 0x74;
    }
}

