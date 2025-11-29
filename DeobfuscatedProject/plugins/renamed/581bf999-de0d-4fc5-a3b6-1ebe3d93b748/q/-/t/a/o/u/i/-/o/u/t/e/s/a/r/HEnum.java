/*
 * Decompiled with CFR 0.152.
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class HEnum
extends Enum<h> {
    private static /* synthetic */ String[] lIllllIllII;
    public static final /* synthetic */ /* enum */ h SPECIAL_2;
    public static final /* synthetic */ /* enum */ h SPECIAL_1;
    public static final /* synthetic */ /* enum */ h NONE;
    private static /* synthetic */ int[] lIllllIllIl;
    private static final /* synthetic */ h[] $VALUES;

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }

    static {
        h.lIIllIlIllIlIl();
        h.lIIllIlIllIlII();
        SPECIAL_1 = new h();
        SPECIAL_2 = new h();
        NONE = new h();
        h[] hArray = new h[lIllllIllIl[3]];
        hArray[h.lIllllIllIl[0]] = SPECIAL_1;
        hArray[h.lIllllIllIl[1]] = SPECIAL_2;
        hArray[h.lIllllIllIl[2]] = NONE;
        $VALUES = hArray;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static void lIIllIlIllIlIl() {
        lIllllIllIl = new int[5];
        h.lIllllIllIl[0] = (0x49 ^ 0x1F ^ (0xDC ^ 0xBF)) & (0x97 ^ 0xA1 ^ 3 ^ -1);
        h.lIllllIllIl[1] = 1;
        h.lIllllIllIl[2] = 2;
        h.lIllllIllIl[3] = 3;
        h.lIllllIllIl[4] = 0xA1 ^ 0xA9;
    }

    private static void lIIllIlIllIlII() {
        lIllllIllII = new String[lIllllIllIl[3]];
        h.lIllllIllII[h.lIllllIllIl[0]] = h."SPECIAL_1";
        h.lIllllIllII[h.lIllllIllIl[1]] = h."SPECIAL_2";
        h.lIllllIllII[h.lIllllIllIl[2]] = h."NONE";
    }

    private static String lIIllIlIllIIll(String var4, String var8) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lIllllIllIl[2], var5);
            return new String(var6.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static String lIIllIlIllIIlI(String var9, String var1) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lIllllIllIl[4]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lIllllIllIl[2], var3);
            return new String(var10.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }
}

