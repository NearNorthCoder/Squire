/*
 * Decompiled with CFR 0.152.
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class b
extends Enum<b> {
    private static /* synthetic */ String[] lllllIlllIlI;
    private static final /* synthetic */ b[] $VALUES;
    private static /* synthetic */ int[] lllllIlllIll;
    public static final /* synthetic */ /* enum */ b JAVELIN_HEADS;
    public static final /* synthetic */ /* enum */ b ARROW_TIPS;
    public static final /* synthetic */ /* enum */ b DISABLE;
    public static final /* synthetic */ /* enum */ b DART_TIPS;
    public static final /* synthetic */ /* enum */ b BOLT_TIPS;

    private static String lIIlIIllllIlllI(String var8, String var11) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), lllllIlllIll[6]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(lllllIlllIll[2], var4);
            return new String(var16.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    static {
        b.lIIlIIlllllIIII();
        b.lIIlIIllllIllll();
        BOLT_TIPS = new b();
        ARROW_TIPS = new b();
        JAVELIN_HEADS = new b();
        DART_TIPS = new b();
        DISABLE = new b();
        b[] bArray = new b[lllllIlllIll[5]];
        bArray[b.lllllIlllIll[0]] = BOLT_TIPS;
        bArray[b.lllllIlllIll[1]] = ARROW_TIPS;
        bArray[b.lllllIlllIll[2]] = JAVELIN_HEADS;
        bArray[b.lllllIlllIll[3]] = DART_TIPS;
        bArray[b.lllllIlllIll[4]] = DISABLE;
        $VALUES = bArray;
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    private static boolean lIIlIIlllllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlIIllllIllIl(String var9, String var7) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(lllllIlllIll[2], var3);
            return new String(var12.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIlllllIIII() {
        lllllIlllIll = new int[7];
        b.lllllIlllIll[0] = (0xAB ^ 0xB9) & ~(0x15 ^ 7);
        b.lllllIlllIll[1] = 1;
        b.lllllIlllIll[2] = 2;
        b.lllllIlllIll[3] = 3;
        b.lllllIlllIll[4] = 0x5C ^ 0x58;
        b.lllllIlllIll[5] = 3 ^ (0xC3 ^ 0xC5);
        b.lllllIlllIll[6] = 0x6E ^ 0x66;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    private static void lIIlIIllllIllll() {
        lllllIlllIlI = new String[lllllIlllIll[5]];
        b.lllllIlllIlI[b.lllllIlllIll[0]] = b."BOLT_TIPS";
        b.lllllIlllIlI[b.lllllIlllIll[1]] = b."ARROW_TIPS";
        b.lllllIlllIlI[b.lllllIlllIll[2]] = b."JAVELIN_HEADS";
        b.lllllIlllIlI[b.lllllIlllIll[3]] = b."DART_TIPS";
        b.lllllIlllIlI[b.lllllIlllIll[4]] = b."DISABLE";
    }

    private static String lIIlIIllllIllII(String var19, String var2) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var5 = var2.toCharArray();
        int var17 = lllllIlllIll[0];
        char[] var1 = var19.toCharArray();
        int var10 = var1.length;
        int var6 = lllllIlllIll[0];
        while (b.lIIlIIlllllIIIl(var6, var10)) {
            char var18 = var1[var6];
            var13.append((char)(var18 ^ var5[var17 % var5.length]));
            0;
            ++var17;
            ++var6;
            0;
            
            return null;
        }
        return String.valueOf(var13);
    }
}

