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

public final class GEnum
extends Enum<g> {
    private static final /* synthetic */ g[] $VALUES;
    public static final /* synthetic */ /* enum */ g MAGE;
    public static final /* synthetic */ /* enum */ g RANGE_1;
    private static /* synthetic */ int[] llIIllllIII;
    public static final /* synthetic */ /* enum */ g MELEE_1;
    public static final /* synthetic */ /* enum */ g NONE;
    private static /* synthetic */ String[] llIIlllIlll;
    public static final /* synthetic */ /* enum */ g MELEE_2;
    public static final /* synthetic */ /* enum */ g RANGE_2;

    private static String lIlIIIlllIlIll(String var6, String var3) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(llIIllllIII[2], var1);
            return new String(var12.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }

    static {
        g.lIlIIIlllIllIl();
        g.lIlIIIlllIllII();
        NONE = new g();
        MELEE_1 = new g();
        MELEE_2 = new g();
        RANGE_1 = new g();
        RANGE_2 = new g();
        MAGE = new g();
        g[] gArray = new g[llIIllllIII[6]];
        gArray[g.llIIllllIII[0]] = NONE;
        gArray[g.llIIllllIII[1]] = MELEE_1;
        gArray[g.llIIllllIII[2]] = MELEE_2;
        gArray[g.llIIllllIII[3]] = RANGE_1;
        gArray[g.llIIllllIII[4]] = RANGE_2;
        gArray[g.llIIllllIII[5]] = MAGE;
        $VALUES = gArray;
    }

    private static void lIlIIIlllIllII() {
        llIIlllIlll = new String[llIIllllIII[6]];
        g.llIIlllIlll[g.llIIllllIII[0]] = g."NONE";
        g.llIIlllIlll[g.llIIllllIII[1]] = g."MELEE_1";
        g.llIIlllIlll[g.llIIllllIII[2]] = g."MELEE_2";
        g.llIIlllIlll[g.llIIllllIII[3]] = g."RANGE_1";
        g.llIIlllIlll[g.llIIllllIII[4]] = g."RANGE_2";
        g.llIIlllIlll[g.llIIllllIII[5]] = g."MAGE";
    }

    private static String lIlIIIlllIlIlI(String var5, String var19) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var10 = var19.toCharArray();
        int var17 = llIIllllIII[0];
        char[] var16 = var5.toCharArray();
        int var2 = var16.length;
        int var11 = llIIllllIII[0];
        while (g.lIlIIIlllIlllI(var11, var2)) {
            char var18 = var16[var11];
            var13.append((char)(var18 ^ var10[var17 % var10.length]));
            0;
            ++var17;
            ++var11;
            0;
            if (1 >= -1) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private static String lIlIIIlllIlIIl(String var8, String var9) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), llIIllllIII[7]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(llIIllllIII[2], var15);
            return new String(var4.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlllIlllI(int n2, int n3) {
        return n2 < n3;
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    private static void lIlIIIlllIllIl() {
        llIIllllIII = new int[8];
        g.llIIllllIII[0] = (0x12 ^ 0xA) & ~(0x85 ^ 0x9D);
        g.llIIllllIII[1] = 1;
        g.llIIllllIII[2] = 2;
        g.llIIllllIII[3] = 3;
        g.llIIllllIII[4] = 0x94 ^ 0x90;
        g.llIIllllIII[5] = 0x7F ^ 0x7A;
        g.llIIllllIII[6] = 0xC ^ 0xA;
        g.llIIllllIII[7] = 62 + 25 - 6 + 46 ^ (0xD4 ^ 0xA3);
    }
}

