/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class o
extends Enum<o> {
    private static final /* synthetic */ o[] $VALUES;
    public static final /* synthetic */ /* enum */ o BIRD_HOUSE;
    private static /* synthetic */ int[] lIllllllIIII;
    public static final /* synthetic */ /* enum */ o HERBS;
    public static final /* synthetic */ /* enum */ o SEAWEED;
    public static final /* synthetic */ /* enum */ o TREES;
    private static /* synthetic */ String[] lIlllllIllll;

    private static void lllIllllllllII() {
        lIlllllIllll = new String[lIllllllIIII[4]];
        o.lIlllllIllll[o.lIllllllIIII[0]] = o."HERBS";
        o.lIlllllIllll[o.lIllllllIIII[1]] = o."TREES";
        o.lIlllllIllll[o.lIllllllIIII[2]] = o."BIRD_HOUSE";
        o.lIlllllIllll[o.lIllllllIIII[3]] = o."SEAWEED";
    }

    private static String lllIlllllllIll(String var9, String var1) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var13 = var1.toCharArray();
        int var12 = lIllllllIIII[0];
        char[] var10 = var9.toCharArray();
        int var7 = var10.length;
        int var3 = lIllllllIIII[0];
        while (o.lllIlllllllllI(var3, var7)) {
            char var11 = var10[var3];
            var2.append((char)(var11 ^ var13[var12 % var13.length]));
            0;
            ++var12;
            ++var3;
            0;
            if (2 != 1) continue;
            return null;
        }
        return String.valueOf(var2);
    }

    public static o valueOf(String string) {
        return Enum.valueOf(o.class, string);
    }

    private static boolean lllIlllllllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lllIllllllllIl() {
        lIllllllIIII = new int[6];
        o.lIllllllIIII[0] = (0xA3 ^ 0xB7) & ~(0x23 ^ 0x37);
        o.lIllllllIIII[1] = 1;
        o.lIllllllIIII[2] = 2;
        o.lIllllllIIII[3] = 3;
        o.lIllllllIIII[4] = 0x37 ^ 0x61 ^ (0xD2 ^ 0x80);
        o.lIllllllIIII[5] = 0x4B ^ 0x43;
    }

    public static o[] values() {
        return (o[])$VALUES.clone();
    }

    private static String lllIlllllllIlI(String var4, String var5) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lIllllllIIII[5]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(lIllllllIIII[2], var6);
            return new String(var14.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        o.lllIllllllllIl();
        o.lllIllllllllII();
        HERBS = new o();
        TREES = new o();
        BIRD_HOUSE = new o();
        SEAWEED = new o();
        o[] oArray = new o[lIllllllIIII[4]];
        oArray[o.lIllllllIIII[0]] = HERBS;
        oArray[o.lIllllllIIII[1]] = TREES;
        oArray[o.lIllllllIIII[2]] = BIRD_HOUSE;
        oArray[o.lIllllllIIII[3]] = SEAWEED;
        $VALUES = oArray;
    }
}

