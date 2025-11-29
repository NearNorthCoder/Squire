/*
 * Decompiled with CFR 0.152.
 */
package s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class e
extends Enum<e> {
    private final /* synthetic */ int energyPotion4;
    private static /* synthetic */ int[] lllIIlllIIII;
    public static final /* synthetic */ /* enum */ e ENERGY;
    private final /* synthetic */ int energyPotion1;
    private final /* synthetic */ int energyPotion2;
    private static /* synthetic */ String[] lllIIllIllll;
    private static final /* synthetic */ e[] $VALUES;
    public static final /* synthetic */ /* enum */ e NONE;
    public static final /* synthetic */ /* enum */ e SUPER_ENERGY;
    private final /* synthetic */ int energyPotion3;
    public static final /* synthetic */ /* enum */ e STAMINA;

    private static void lIIIlIlIllIlIll() {
        lllIIllIllll = new String[lllIIlllIIII[0]];
        e.lllIIllIllll[e.lllIIlllIIII[1]] = e."NONE";
        e.lllIIllIllll[e.lllIIlllIIII[2]] = e."STAMINA";
        e.lllIIllIllll[e.lllIIlllIIII[3]] = e."SUPER_ENERGY";
        e.lllIIllIllll[e.lllIIlllIIII[4]] = e."ENERGY";
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private static String lIIIlIlIllIlIlI(String var12, String var11) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lllIIlllIIII[3], var9);
            return new String(var2.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIlIllIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIlIlIllIllII() {
        lllIIlllIIII = new int[19];
        e.lllIIlllIIII[0] = 0x50 ^ 0x54;
        e.lllIIlllIIII[1] = (0x27 ^ 0xD) & ~(0x2F ^ 5);
        e.lllIIlllIIII[2] = 1;
        e.lllIIlllIIII[3] = 2;
        e.lllIIlllIIII[4] = 3;
        e.lllIIlllIIII[5] = -1;
        e.lllIIlllIIII[6] = -(0xFFFF8E6B & 0x7FBF) & (0xFFFFFF7B & 0x3FFF);
        e.lllIIlllIIII[7] = 0xFFFFFDDB & 0x3377;
        e.lllIIlllIIII[8] = 0xFFFFFFF5 & 0x315F;
        e.lllIIlllIIII[9] = -(0xFFFFDEA1 & 0x27FF) & (0xFFFFFFFF & 0x37F7);
        e.lllIIlllIIII[10] = -(0x96 ^ 0xB5) & (0xFFFFFBFA & 0xFEF);
        e.lllIIlllIIII[11] = 0xFFFFBBEE & 0x4FDB;
        e.lllIIlllIIII[12] = -(0xFFFFF777 & 0x4C9A) & (0xFFFFDFFD & 0x6FDF);
        e.lllIIlllIIII[13] = 0xFFFF8BFF & 0x7FCE;
        e.lllIIlllIIII[14] = 0xFFFF9FF2 & 0x6BCD;
        e.lllIIlllIIII[15] = -(0xFFFFBC15 & 0x77FF) & (0xFFFFBFFE & 0x7FD7);
        e.lllIIlllIIII[16] = -(0xFFFFB4DB & 0x4F2F) & (0xFFFF8FEE & 0x7FDF);
        e.lllIIlllIIII[17] = -(0xFFFFFCDB & 0x673E) & (0xFFFFEFFF & 0x7FDF);
        e.lllIIlllIIII[18] = 56 + 82 - 52 + 78 ^ 135 + 154 - 134 + 17;
    }

    private static String lIIIlIlIllIlIII(String var3, String var13) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var10 = var13.toCharArray();
        int var4 = lllIIlllIIII[1];
        char[] var18 = var3.toCharArray();
        int var7 = var18.length;
        int var8 = lllIIlllIIII[1];
        while (e.lIIIlIlIllIllIl(var8, var7)) {
            char var19 = var18[var8];
            var1.append((char)(var19 ^ var10[var4 % var10.length]));
            0;
            ++var4;
            ++var8;
            0;
            if (1 == 1) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    private e(int n3, int n4, int n5, int n6) {
        this.energyPotion4 = n3;
        this.energyPotion3 = n4;
        this.energyPotion2 = n5;
        this.energyPotion1 = n6;
    }

    static {
        e.lIIIlIlIllIllII();
        e.lIIIlIlIllIlIll();
        NONE = new e(lllIIlllIIII[5], lllIIlllIIII[5], lllIIlllIIII[5], lllIIlllIIII[5]);
        STAMINA = new e(lllIIlllIIII[6], lllIIlllIIII[7], lllIIlllIIII[8], lllIIlllIIII[9]);
        SUPER_ENERGY = new e(lllIIlllIIII[10], lllIIlllIIII[11], lllIIlllIIII[12], lllIIlllIIII[13]);
        ENERGY = new e(lllIIlllIIII[14], lllIIlllIIII[15], lllIIlllIIII[16], lllIIlllIIII[17]);
        e[] eArray = new e[lllIIlllIIII[0]];
        eArray[e.lllIIlllIIII[1]] = NONE;
        eArray[e.lllIIlllIIII[2]] = STAMINA;
        eArray[e.lllIIlllIIII[3]] = SUPER_ENERGY;
        eArray[e.lllIIlllIIII[4]] = ENERGY;
        $VALUES = eArray;
    }

    private static String lIIIlIlIllIlIIl(String var5, String var16) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), lllIIlllIIII[18]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(lllIIlllIIII[3], var6);
            return new String(var15.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    public int[] j() {
        int[] nArray = new int[lllIIlllIIII[0]];
        nArray[e.lllIIlllIIII[1]] = this.energyPotion4;
        nArray[e.lllIIlllIIII[2]] = this.energyPotion3;
        nArray[e.lllIIlllIIII[3]] = this.energyPotion2;
        nArray[e.lllIIlllIIII[4]] = this.energyPotion1;
        return nArray;
    }
}

