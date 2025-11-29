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

public final class BIEnum
extends Enum<bi> {
    private static final /* synthetic */ bi[] $VALUES;
    private static /* synthetic */ String[] llIIIIIllll;
    public static final /* synthetic */ /* enum */ bi SWARM;
    public static final /* synthetic */ /* enum */ bi ATTACK;
    public static final /* synthetic */ /* enum */ bi MAGE;
    private static /* synthetic */ int[] llIIIIlIlII;

    private static String lIIlllIlIIIIlI(String var2, String var13) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), llIIIIlIlII[4]), "DES");
            Cipher var19 = Cipher.getInstance("DES");
            var19.init(llIIIIlIlII[2], var6);
            return new String(var19.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllIlIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlllIlIIIIII(String var18, String var11) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(llIIIIlIlII[2], var8);
            return new String(var3.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public static bi[] values() {
        return (bi[])$VALUES.clone();
    }

    static {
        bi.lIIlllIlIlIIIl();
        bi.lIIlllIlIIIlIl();
        ATTACK = new bi();
        SWARM = new bi();
        MAGE = new bi();
        bi[] biArray = new bi[llIIIIlIlII[3]];
        biArray[bi.llIIIIlIlII[0]] = ATTACK;
        biArray[bi.llIIIIlIlII[1]] = SWARM;
        biArray[bi.llIIIIlIlII[2]] = MAGE;
        $VALUES = biArray;
    }

    private static String lIIlllIlIIIIIl(String var4, String var15) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var1 = var15.toCharArray();
        int var7 = llIIIIlIlII[0];
        char[] var14 = var4.toCharArray();
        int var12 = var14.length;
        int var5 = llIIIIlIlII[0];
        while (bi.lIIlllIlIlIIlI(var5, var12)) {
            char var9 = var14[var5];
            var17.append((char)(var9 ^ var1[var7 % var1.length]));
            0;
            ++var7;
            ++var5;
            0;
            if (3 >= 0) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    private static void lIIlllIlIIIlIl() {
        llIIIIIllll = new String[llIIIIlIlII[3]];
        bi.llIIIIIllll[bi.llIIIIlIlII[0]] = bi."ATTACK";
        bi.llIIIIIllll[bi.llIIIIlIlII[1]] = bi."SWARM";
        bi.llIIIIIllll[bi.llIIIIlIlII[2]] = bi."MAGE";
    }

    private static void lIIlllIlIlIIIl() {
        llIIIIlIlII = new int[5];
        bi.llIIIIlIlII[0] = (0x1A ^ 0x7A ^ (1 ^ 0x5E)) & (0x39 ^ 0x58 ^ (0xE2 ^ 0xBC) ^ -1);
        bi.llIIIIlIlII[1] = 1;
        bi.llIIIIlIlII[2] = 2;
        bi.llIIIIlIlII[3] = 3;
        bi.llIIIIlIlII[4] = 0x33 ^ 0x4E ^ (0xB5 ^ 0xC0);
    }

    public static bi valueOf(String string) {
        return Enum.valueOf(BIEnum.class, string);
    }
}

