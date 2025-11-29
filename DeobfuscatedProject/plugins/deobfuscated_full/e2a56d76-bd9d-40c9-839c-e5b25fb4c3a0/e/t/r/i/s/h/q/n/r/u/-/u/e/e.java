/*
 * Decompiled with CFR 0.152.
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class e
extends Enum<e> {
    public static final /* synthetic */ /* enum */ e PITFALL;
    public static final /* synthetic */ /* enum */ e BIRDS;
    private static final /* synthetic */ e[] $VALUES;
    private static /* synthetic */ String[] lllIllIlIllI;
    public static final /* synthetic */ /* enum */ e FALCONRY;
    private static /* synthetic */ int[] lllIllIlIlll;
    public static final /* synthetic */ /* enum */ e SALLIES;
    public static final /* synthetic */ /* enum */ e CHINS;

    static {
        e.lIIIllIlIllIlll();
        e.lIIIllIlIllIllI();
        BIRDS = new e();
        SALLIES = new e();
        FALCONRY = new e();
        CHINS = new e();
        PITFALL = new e();
        e[] eArray = new e[lllIllIlIlll[5]];
        eArray[e.lllIllIlIlll[0]] = BIRDS;
        eArray[e.lllIllIlIlll[1]] = SALLIES;
        eArray[e.lllIllIlIlll[2]] = FALCONRY;
        eArray[e.lllIllIlIlll[3]] = CHINS;
        eArray[e.lllIllIlIlll[4]] = PITFALL;
        $VALUES = eArray;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    private static String lIIIllIlIllIlII(String var3, String var2) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(lllIllIlIlll[2], var6);
            return new String(var10.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static String lIIIllIlIllIlIl(String var4, String var7) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), lllIllIlIlll[6]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lllIllIlIlll[2], var9);
            return new String(var5.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private static void lIIIllIlIllIllI() {
        lllIllIlIllI = new String[lllIllIlIlll[5]];
        e.lllIllIlIllI[e.lllIllIlIlll[0]] = e."BIRDS";
        e.lllIllIlIllI[e.lllIllIlIlll[1]] = e."SALLIES";
        e.lllIllIlIllI[e.lllIllIlIlll[2]] = e."FALCONRY";
        e.lllIllIlIllI[e.lllIllIlIlll[3]] = e."CHINS";
        e.lllIllIlIllI[e.lllIllIlIlll[4]] = e."PITFALL";
    }

    private static void lIIIllIlIllIlll() {
        lllIllIlIlll = new int[7];
        e.lllIllIlIlll[0] = (0x37 ^ 3) & ~(0x17 ^ 0x23);
        e.lllIllIlIlll[1] = 1;
        e.lllIllIlIlll[2] = 2;
        e.lllIllIlIlll[3] = 3;
        e.lllIllIlIlll[4] = 0x37 ^ 0x33;
        e.lllIllIlIlll[5] = 0x12 ^ 0x17;
        e.lllIllIlIlll[6] = 0xD4 ^ 0x95 ^ (0xEA ^ 0xA3);
    }
}

