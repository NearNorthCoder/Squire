/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.av;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aw;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class as
extends Enum<as>
implements aw {
    private final /* synthetic */ av produceSeed;
    private static /* synthetic */ int[] lIllllIlIlIl;
    public static final /* synthetic */ /* enum */ as NOTHING;
    private static /* synthetic */ String[] lIllllIlIIll;
    public static final /* synthetic */ /* enum */ as DEFAULT;
    public static final /* synthetic */ /* enum */ as GRAPES;
    private static final /* synthetic */ as[] $VALUES;

    @Override
    public av bf() {
        return this.produceSeed;
    }

    public static as[] values() {
        return (as[])$VALUES.clone();
    }

    private static void lllIlllIlIIlII() {
        lIllllIlIIll = new String[lIllllIlIlIl[3]];
        as.lIllllIlIIll[as.lIllllIlIlIl[0]] = as."NOTHING";
        as.lIllllIlIIll[as.lIllllIlIlIl[1]] = as."DEFAULT";
        as.lIllllIlIIll[as.lIllllIlIlIl[2]] = as."GRAPES";
    }

    private static String lllIlllIlIIIll(String var7, String var1) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var1.toCharArray();
        int var14 = lIllllIlIlIl[0];
        char[] var18 = var7.toCharArray();
        int var5 = var18.length;
        int var3 = lIllllIlIlIl[0];
        while (as.lllIlllIlIIllI(var3, var5)) {
            char var8 = var18[var3];
            var10.append((char)(var8 ^ var11[var14 % var11.length]));
            0;
            ++var14;
            ++var3;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    static {
        as.lllIlllIlIIlIl();
        as.lllIlllIlIIlII();
        NOTHING = new as(null);
        DEFAULT = new as(av.DEFAULT);
        GRAPES = new as(av.GRAPES);
        as[] asArray = new as[lIllllIlIlIl[3]];
        asArray[as.lIllllIlIlIl[0]] = NOTHING;
        asArray[as.lIllllIlIlIl[1]] = DEFAULT;
        asArray[as.lIllllIlIlIl[2]] = GRAPES;
        $VALUES = asArray;
    }

    private static void lllIlllIlIIlIl() {
        lIllllIlIlIl = new int[5];
        as.lIllllIlIlIl[0] = (0x5B ^ 0x39) & ~(0xE1 ^ 0x83);
        as.lIllllIlIlIl[1] = 1;
        as.lIllllIlIlIl[2] = 2;
        as.lIllllIlIlIl[3] = 3;
        as.lIllllIlIlIl[4] = 118 + 149 - 172 + 68 ^ 6 + 165 - 47 + 47;
    }

    private static String lllIlllIlIIIII(String var2, String var13) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var17 = Cipher.getInstance("Blowfish");
            var17.init(lIllllIlIlIl[2], var4);
            return new String(var17.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlllIlIIllI(int n2, int n3) {
        return n2 < n3;
    }

    public static as valueOf(String string) {
        return Enum.valueOf(as.class, string);
    }

    private static String lllIlllIlIIIlI(String var6, String var16) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), lIllllIlIlIl[4]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(lIllllIlIlIl[2], var15);
            return new String(var12.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private as(av av2) {
        this.produceSeed = av2;
    }
}

