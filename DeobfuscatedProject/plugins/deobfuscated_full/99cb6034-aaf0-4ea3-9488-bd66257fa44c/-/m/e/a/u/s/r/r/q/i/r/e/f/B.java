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

public final class B
extends Enum<B> {
    private static final /* synthetic */ B[] $VALUES;
    public static final /* synthetic */ /* enum */ B EMPTY;
    public static final /* synthetic */ /* enum */ B COMPLETED;
    private static /* synthetic */ int[] lIlllllllllI;
    public static final /* synthetic */ /* enum */ B IN_PROGRESS;
    public static final /* synthetic */ /* enum */ B OCCUPIED;
    public static final /* synthetic */ /* enum */ B UNKNOWN;
    private static /* synthetic */ String[] lIllllllllII;

    private static void llllIIIIlIIllI() {
        lIllllllllII = new String[lIlllllllllI[5]];
        B.lIllllllllII[B.lIlllllllllI[0]] = B."COMPLETED";
        B.lIllllllllII[B.lIlllllllllI[1]] = B."IN_PROGRESS";
        B.lIllllllllII[B.lIlllllllllI[2]] = B."OCCUPIED";
        B.lIllllllllII[B.lIlllllllllI[3]] = B."EMPTY";
        B.lIllllllllII[B.lIlllllllllI[4]] = B."UNKNOWN";
    }

    public static B[] values() {
        return (B[])$VALUES.clone();
    }

    private static String llllIIIIlIIIlI(String var5, String var18) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), lIlllllllllI[6]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lIlllllllllI[2], var10);
            return new String(var9.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static String llllIIIIlIIlII(String var3, String var2) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lIlllllllllI[2], var13);
            return new String(var6.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    static {
        B.llllIIIIlIlIll();
        B.llllIIIIlIIllI();
        COMPLETED = new B();
        IN_PROGRESS = new B();
        OCCUPIED = new B();
        EMPTY = new B();
        UNKNOWN = new B();
        B[] bArray = new B[lIlllllllllI[5]];
        bArray[B.lIlllllllllI[0]] = COMPLETED;
        bArray[B.lIlllllllllI[1]] = IN_PROGRESS;
        bArray[B.lIlllllllllI[2]] = OCCUPIED;
        bArray[B.lIlllllllllI[3]] = EMPTY;
        bArray[B.lIlllllllllI[4]] = UNKNOWN;
        $VALUES = bArray;
    }

    public static B valueOf(String string) {
        return Enum.valueOf(B.class, string);
    }

    private static void llllIIIIlIlIll() {
        lIlllllllllI = new int[7];
        B.lIlllllllllI[0] = (24 + 19 - -44 + 116 ^ 163 + 1 - -26 + 5) & (0xCB ^ 0xB3 ^ (0x46 ^ 0x36) ^ -1);
        B.lIlllllllllI[1] = 1;
        B.lIlllllllllI[2] = 2;
        B.lIlllllllllI[3] = 3;
        B.lIlllllllllI[4] = 0x15 ^ 0x11;
        B.lIlllllllllI[5] = 123 + 93 - 152 + 109 ^ 58 + 38 - 14 + 86;
        B.lIlllllllllI[6] = 0xB8 ^ 0xB0;
    }

    private static String llllIIIIlIIlIl(String var15, String var14) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var8 = var14.toCharArray();
        int var12 = lIlllllllllI[0];
        char[] var11 = var15.toCharArray();
        int var19 = var11.length;
        int var1 = lIlllllllllI[0];
        while (B.llllIIIIlIllII(var1, var19)) {
            char var4 = var11[var1];
            var17.append((char)(var4 ^ var8[var12 % var8.length]));
            0;
            ++var12;
            ++var1;
            0;
            if (((0x28 ^ 0x65 ^ 1) & (0xFC ^ 0x9C ^ (0x76 ^ 0x5A) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    private static boolean llllIIIIlIllII(int n2, int n3) {
        return n2 < n3;
    }
}

