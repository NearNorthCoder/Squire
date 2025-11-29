/*
 * Decompiled with CFR 0.152.
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class x
extends Enum<x> {
    public static final /* synthetic */ /* enum */ x RANGE;
    public static final /* synthetic */ /* enum */ x MAGE;
    private static final /* synthetic */ x[] $VALUES;
    public static final /* synthetic */ /* enum */ x MELEE;
    private static /* synthetic */ int[] llIlIIlIlIl;
    private static /* synthetic */ String[] llIlIIlIlII;

    public static x[] values() {
        return (x[])$VALUES.clone();
    }

    private static String lIlIIlIlIllIlI(String var4, String var12) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(llIlIIlIlIl[2], var7);
            return new String(var14.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static void lIlIIlIlIlllIl() {
        llIlIIlIlIl = new int[4];
        x.llIlIIlIlIl[0] = (0x26 ^ 0x19 ^ (0x8C ^ 0x99)) & ((0xBB ^ 0x81) & ~(0 ^ 0x3A) ^ (0x31 ^ 0x1B) ^ -1);
        x.llIlIIlIlIl[1] = 1;
        x.llIlIIlIlIl[2] = 2;
        x.llIlIIlIlIl[3] = 3;
    }

    static {
        x.lIlIIlIlIlllIl();
        x.lIlIIlIlIlllII();
        RANGE = new x();
        MAGE = new x();
        MELEE = new x();
        x[] xArray = new x[llIlIIlIlIl[3]];
        xArray[x.llIlIIlIlIl[0]] = RANGE;
        xArray[x.llIlIIlIlIl[1]] = MAGE;
        xArray[x.llIlIIlIlIl[2]] = MELEE;
        $VALUES = xArray;
    }

    private static void lIlIIlIlIlllII() {
        llIlIIlIlII = new String[llIlIIlIlIl[3]];
        x.llIlIIlIlII[x.llIlIIlIlIl[0]] = x."RANGE";
        x.llIlIIlIlII[x.llIlIIlIlIl[1]] = x."MAGE";
        x.llIlIIlIlII[x.llIlIIlIlIl[2]] = x."MELEE";
    }

    private static String lIlIIlIlIllIll(String var6, String var8) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var9 = var8.toCharArray();
        int var13 = llIlIIlIlIl[0];
        char[] var10 = var6.toCharArray();
        int var3 = var10.length;
        int var11 = llIlIIlIlIl[0];
        while (x.lIlIIlIlIllllI(var11, var3)) {
            char var2 = var10[var11];
            var5.append((char)(var2 ^ var9[var13 % var9.length]));
            0;
            ++var13;
            ++var11;
            0;
            
            return null;
        }
        return String.valueOf(var5);
    }

    public static x valueOf(String string) {
        return Enum.valueOf(x.class, string);
    }

    private static boolean lIlIIlIlIllllI(int n2, int n3) {
        return n2 < n3;
    }
}

