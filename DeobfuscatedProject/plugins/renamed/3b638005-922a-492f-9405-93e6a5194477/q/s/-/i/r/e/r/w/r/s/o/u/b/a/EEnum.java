/*
 * Decompiled with CFR 0.152.
 */
package q.s.-.i.r.e.r.w.r.s.o.u.b.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class EEnum
extends Enum<e> {
    private final /* synthetic */ String npcName;
    private static final /* synthetic */ e[] $VALUES;
    public static final /* synthetic */ /* enum */ e CRYPT_SPIDER;
    private static /* synthetic */ int[] llllIIIllIl;
    private final /* synthetic */ int potential;
    public static final /* synthetic */ /* enum */ e CRYPT_RAT;
    public static final /* synthetic */ /* enum */ e GIANT_CRYPT_SPIDER;
    public static final /* synthetic */ /* enum */ e GIANT_CRYPT_RAT;
    public static final /* synthetic */ /* enum */ e SKELETON;
    private static /* synthetic */ String[] llllIIIllII;
    public static final /* synthetic */ /* enum */ e BLOODWORM;

    private e(int n3, String string2) {
        this.potential = n3;
        this.npcName = string2;
    }

    public String H() {
        return this.npcName;
    }

    private static void lIllIIllllIlII() {
        llllIIIllIl = new int[19];
        e.llllIIIllIl[0] = (0x5B ^ 0x75 ^ (0xB4 ^ 0x8C)) & (0xF4 ^ 0xC4 ^ (0x6D ^ 0x4B) ^ -1);
        e.llllIIIllIl[1] = 127 + 148 - 272 + 172 ^ 90 + 79 - 74 + 37;
        e.llllIIIllIl[2] = 1;
        e.llllIIIllIl[3] = 2;
        e.llllIIIllIl[4] = 0xA7 ^ 0x93;
        e.llllIIIllIl[5] = 3;
        e.llllIIIllIl[6] = 0x35 ^ 0x31;
        e.llllIIIllIl[7] = 0xA0 ^ 0x98;
        e.llllIIIllIl[8] = 0x3E ^ 0xB ^ (0x34 ^ 4);
        e.llllIIIllIl[9] = 126 + 89 - 121 + 99 ^ 13 + 74 - 23 + 135;
        e.llllIIIllIl[10] = 0x74 ^ 0x38;
        e.llllIIIllIl[11] = 0x71 ^ 0x76;
        e.llllIIIllIl[12] = 0xC5 ^ 0x9D ^ (0x15 ^ 0x45);
        e.llllIIIllIl[13] = 0x3F ^ 0x71 ^ 3;
        e.llllIIIllIl[14] = 0xBF ^ 0xB8 ^ (0x6A ^ 0x64);
        e.llllIIIllIl[15] = 123 + 87 - 36 + 29 ^ 94 + 158 - 119 + 60;
        e.llllIIIllIl[16] = 0xCA ^ 0xB2 ^ (0x17 ^ 0x20);
        e.llllIIIllIl[17] = 0x1F ^ 0x14;
        e.llllIIIllIl[18] = 0x21 ^ 0x64 ^ (0x7D ^ 0x34);
    }

    private static boolean lIllIIllllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    public int G() {
        return this.potential;
    }

    private static String lIllIIllllIIII(String var14, String var2) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(llllIIIllIl[3], var18);
            return new String(var5.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private static String lIllIIllllIIlI(String var7, String var6) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var12 = var6.toCharArray();
        int var1 = llllIIIllIl[0];
        char[] var16 = var7.toCharArray();
        int var19 = var16.length;
        int var8 = llllIIIllIl[0];
        while (e.lIllIIllllIlIl(var8, var19)) {
            char var9 = var16[var8];
            var13.append((char)(var9 ^ var12[var1 % var12.length]));
            0;
            ++var1;
            ++var8;
            0;
            if (2 >= ((0x41 ^ 0x46) & ~(0x51 ^ 0x56))) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private static String lIllIIllllIIIl(String var11, String var3) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), llllIIIllIl[12]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(llllIIIllIl[3], var4);
            return new String(var10.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    static {
        e.lIllIIllllIlII();
        e.lIllIIllllIIll();
        CRYPT_RAT = new e(llllIIIllIl[1], llllIIIllII[llllIIIllIl[2]]);
        BLOODWORM = new e(llllIIIllIl[4], llllIIIllII[llllIIIllIl[5]]);
        CRYPT_SPIDER = new e(llllIIIllIl[7], llllIIIllII[llllIIIllIl[8]]);
        GIANT_CRYPT_RAT = new e(llllIIIllIl[10], llllIIIllII[llllIIIllIl[11]]);
        SKELETON = new e(llllIIIllIl[13], llllIIIllII[llllIIIllIl[14]]);
        GIANT_CRYPT_SPIDER = new e(llllIIIllIl[16], llllIIIllII[llllIIIllIl[17]]);
        e[] eArray = new e[llllIIIllIl[9]];
        eArray[e.llllIIIllIl[0]] = CRYPT_RAT;
        eArray[e.llllIIIllIl[2]] = BLOODWORM;
        eArray[e.llllIIIllIl[3]] = CRYPT_SPIDER;
        eArray[e.llllIIIllIl[5]] = GIANT_CRYPT_RAT;
        eArray[e.llllIIIllIl[6]] = SKELETON;
        eArray[e.llllIIIllIl[8]] = GIANT_CRYPT_SPIDER;
        $VALUES = eArray;
    }

    private static void lIllIIllllIIll() {
        llllIIIllII = new String[llllIIIllIl[18]];
        e.llllIIIllII[e.llllIIIllIl[0]] = e."CRYPT_RAT";
        e.llllIIIllII[e.llllIIIllIl[2]] = e."Crypt rat";
        e.llllIIIllII[e.llllIIIllIl[3]] = e."BLOODWORM";
        e.llllIIIllII[e.llllIIIllIl[5]] = e."Bloodworm";
        e.llllIIIllII[e.llllIIIllIl[6]] = e."CRYPT_SPIDER";
        e.llllIIIllII[e.llllIIIllIl[8]] = e."Crypt spider";
        e.llllIIIllII[e.llllIIIllIl[9]] = e."GIANT_CRYPT_RAT";
        e.llllIIIllII[e.llllIIIllIl[11]] = e."Giant crypt rat";
        e.llllIIIllII[e.llllIIIllIl[12]] = e."SKELETON";
        e.llllIIIllII[e.llllIIIllIl[14]] = e."Skeleton";
        e.llllIIIllII[e.llllIIIllIl[15]] = e."GIANT_CRYPT_SPIDER";
        e.llllIIIllII[e.llllIIIllIl[17]] = e."Giant crypt spider";
    }
}

