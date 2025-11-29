/*
 * Decompiled with CFR 0.152.
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class IEnum
extends Enum<i> {
    public static final /* synthetic */ /* enum */ i BLOWPIE;
    public static final /* synthetic */ /* enum */ i CBOW;
    public static final /* synthetic */ /* enum */ i NELEE;
    private static /* synthetic */ int[] lIlIllIIllIll;
    public static final /* synthetic */ /* enum */ i MELEE;
    public static final /* synthetic */ /* enum */ i OTHER;
    private static final /* synthetic */ i[] $VALUES;
    private static /* synthetic */ String[] lIlIllIIllIlI;

    public static i valueOf(String string) {
        return Enum.valueOf(i.class, string);
    }

    private static String llIIIIIIllIIIll(String var17, String var19) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var15 = var19.toCharArray();
        int var5 = lIlIllIIllIll[0];
        char[] var12 = var17.toCharArray();
        int var3 = var12.length;
        int var7 = lIlIllIIllIll[0];
        while (i.llIIIIIIllIIllI(var7, var3)) {
            char var13 = var12[var7];
            var16.append((char)(var13 ^ var15[var5 % var15.length]));
            0;
            ++var5;
            ++var7;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    private static String llIIIIIIllIIIlI(String var2, String var6) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(lIlIllIIllIll[2], var8);
            return new String(var10.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    static {
        i.llIIIIIIllIIlIl();
        i.llIIIIIIllIIlII();
        NELEE = new i();
        BLOWPIE = new i();
        CBOW = new i();
        MELEE = new i();
        OTHER = new i();
        i[] iArray = new i[lIlIllIIllIll[5]];
        iArray[i.lIlIllIIllIll[0]] = NELEE;
        iArray[i.lIlIllIIllIll[1]] = BLOWPIE;
        iArray[i.lIlIllIIllIll[2]] = CBOW;
        iArray[i.lIlIllIIllIll[3]] = MELEE;
        iArray[i.lIlIllIIllIll[4]] = OTHER;
        $VALUES = iArray;
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    private static boolean llIIIIIIllIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIIIIIllIIIIl(String var18, String var1) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lIlIllIIllIll[6]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(lIlIllIIllIll[2], var14);
            return new String(var4.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static void llIIIIIIllIIlIl() {
        lIlIllIIllIll = new int[7];
        i.lIlIllIIllIll[0] = (0x64 ^ 0x57 ^ 2) & (0x12 ^ 0x54 ^ (0x14 ^ 0x63) ^ -1);
        i.lIlIllIIllIll[1] = 1;
        i.lIlIllIIllIll[2] = 2;
        i.lIlIllIIllIll[3] = 3;
        i.lIlIllIIllIll[4] = 0xE9 ^ 0xB4 ^ (0x3A ^ 0x63);
        i.lIlIllIIllIll[5] = 0x3B ^ 0x3E;
        i.lIlIllIIllIll[6] = 2 ^ 0xA;
    }

    private static void llIIIIIIllIIlII() {
        lIlIllIIllIlI = new String[lIlIllIIllIll[5]];
        i.lIlIllIIllIlI[i.lIlIllIIllIll[0]] = i."NELEE";
        i.lIlIllIIllIlI[i.lIlIllIIllIll[1]] = i."BLOWPIE";
        i.lIlIllIIllIlI[i.lIlIllIIllIll[2]] = i."CBOW";
        i.lIlIllIIllIlI[i.lIlIllIIllIll[3]] = i."MELEE";
        i.lIlIllIIllIlI[i.lIlIllIIllIll[4]] = i."OTHER";
    }
}

