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

public final class bY
extends Enum<bY> {
    private static /* synthetic */ String[] llIlIllIIll;
    public static final /* synthetic */ /* enum */ bY WAVE;
    private static /* synthetic */ int[] llIlIllIlII;
    public static final /* synthetic */ /* enum */ bY JUG;
    public static final /* synthetic */ /* enum */ bY ATTACK;
    private static final /* synthetic */ bY[] $VALUES;

    private static void lIlIIlllllIIlI() {
        llIlIllIIll = new String[llIlIllIlII[3]];
        bY.llIlIllIIll[bY.llIlIllIlII[0]] = bY."ATTACK";
        bY.llIlIllIIll[bY.llIlIllIlII[1]] = bY."WAVE";
        bY.llIlIllIIll[bY.llIlIllIlII[2]] = bY."JUG";
    }

    private static void lIlIIlllllIIll() {
        llIlIllIlII = new int[5];
        bY.llIlIllIlII[0] = (0x73 ^ 0x6D ^ (0 ^ 0x59)) & (0x52 ^ 0x2F ^ (0x38 ^ 2) ^ -1);
        bY.llIlIllIlII[1] = 1;
        bY.llIlIllIlII[2] = 2;
        bY.llIlIllIlII[3] = 3;
        bY.llIlIllIlII[4] = 0x68 ^ 0x33 ^ (0xD0 ^ 0x83);
    }

    private static String lIlIIlllllIIIl(String var14, String var6) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), llIlIllIlII[4]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(llIlIllIlII[2], var13);
            return new String(var7.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static String lIlIIlllllIIII(String var10, String var2) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var3 = var2.toCharArray();
        int var9 = llIlIllIlII[0];
        char[] var12 = var10.toCharArray();
        int var1 = var12.length;
        int var8 = llIlIllIlII[0];
        while (bY.lIlIIlllllIlII(var8, var1)) {
            char var4 = var12[var8];
            var11.append((char)(var4 ^ var3[var9 % var3.length]));
            0;
            ++var9;
            ++var8;
            0;
            if (3 >= 0) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    static {
        bY.lIlIIlllllIIll();
        bY.lIlIIlllllIIlI();
        ATTACK = new bY();
        WAVE = new bY();
        JUG = new bY();
        bY[] bYArray = new bY[llIlIllIlII[3]];
        bYArray[bY.llIlIllIlII[0]] = ATTACK;
        bYArray[bY.llIlIllIlII[1]] = WAVE;
        bYArray[bY.llIlIllIlII[2]] = JUG;
        $VALUES = bYArray;
    }

    public static bY valueOf(String string) {
        return Enum.valueOf(bY.class, string);
    }

    private static boolean lIlIIlllllIlII(int n2, int n3) {
        return n2 < n3;
    }

    public static bY[] values() {
        return (bY[])$VALUES.clone();
    }
}

