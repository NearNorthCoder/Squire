/*
 * Decompiled with CFR 0.152.
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class JEnum
extends Enum<j> {
    private static /* synthetic */ String[] lIlIlIlllIllI;
    public static final /* synthetic */ /* enum */ j FREEZE;
    public static final /* synthetic */ /* enum */ j FIRE_BALLS;
    public static final /* synthetic */ /* enum */ j NONE;
    private static final /* synthetic */ j[] $VALUES;
    private static /* synthetic */ int[] lIlIlIlllIlll;

    private static void lIllllllllIllll() {
        lIlIlIlllIlll = new int[5];
        j.lIlIlIlllIlll[0] = (0x8E ^ 0xA2 ^ (0x49 ^ 0x2A)) & (0x99 ^ 0x81 ^ (0x7D ^ 0x2A) ^ -1);
        j.lIlIlIlllIlll[1] = 1;
        j.lIlIlIlllIlll[2] = 2;
        j.lIlIlIlllIlll[3] = 3;
        j.lIlIlIlllIlll[4] = 0x1E ^ 0x16;
    }

    private static void lIllllllllIlllI() {
        lIlIlIlllIllI = new String[lIlIlIlllIlll[3]];
        j.lIlIlIlllIllI[j.lIlIlIlllIlll[0]] = j."NONE";
        j.lIlIlIlllIllI[j.lIlIlIlllIlll[1]] = j."FIRE_BALLS";
        j.lIlIlIlllIllI[j.lIlIlIlllIlll[2]] = j."FREEZE";
    }

    private static String lIllllllllIllIl(String var4, String var9) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIlIlIlllIlll[2], var2);
            return new String(var1.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    static {
        j.lIllllllllIllll();
        j.lIllllllllIlllI();
        NONE = new j();
        FIRE_BALLS = new j();
        FREEZE = new j();
        j[] jArray = new j[lIlIlIlllIlll[3]];
        jArray[j.lIlIlIlllIlll[0]] = NONE;
        jArray[j.lIlIlIlllIlll[1]] = FIRE_BALLS;
        jArray[j.lIlIlIlllIlll[2]] = FREEZE;
        $VALUES = jArray;
    }

    public static j[] values() {
        return (j[])$VALUES.clone();
    }

    private static String lIllllllllIllII(String var7, String var6) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), lIlIlIlllIlll[4]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lIlIlIlllIlll[2], var3);
            return new String(var10.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public static j valueOf(String string) {
        return Enum.valueOf(j.class, string);
    }
}

