/*
 * Decompiled with CFR 0.152.
 */
package g.r.r.-.t.q.i.u.o.e.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class BEnum
extends Enum<b> {
    public static final /* synthetic */ /* enum */ b OVERCHARGED;
    private static /* synthetic */ String[] llIIllIlIlIl;
    public static final /* synthetic */ /* enum */ b STRONG;
    private static final /* synthetic */ b[] $VALUES;
    public static final /* synthetic */ /* enum */ b MEDIUM;
    public static final /* synthetic */ /* enum */ b WEAK;
    private static /* synthetic */ int[] llIIllIlIllI;

    private static String llllllIlIIllIl(String var10, String var5) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var13 = var5.toCharArray();
        int var12 = llIIllIlIllI[0];
        char[] var9 = var10.toCharArray();
        int var7 = var9.length;
        int var8 = llIIllIlIllI[0];
        while (b.llllllIlIlIIIl(var8, var7)) {
            char var6 = var9[var8];
            var14.append((char)(var6 ^ var13[var12 % var13.length]));
            0;
            ++var12;
            ++var8;
            0;
            if (-(6 ^ 0x40 ^ (0x42 ^ 0)) <= 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static String llllllIlIIlllI(String var4, String var3) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(llIIllIlIllI[2], var1);
            return new String(var2.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    private static void llllllIlIlIIII() {
        llIIllIlIllI = new int[5];
        b.llIIllIlIllI[0] = (128 + 105 - 141 + 85 ^ 98 + 73 - 66 + 60) & (0x5A ^ 0x21 ^ (0x7E ^ 0x11) ^ -1);
        b.llIIllIlIllI[1] = 1;
        b.llIIllIlIllI[2] = 2;
        b.llIIllIlIllI[3] = 3;
        b.llIIllIlIllI[4] = 0x9C ^ 0x98;
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    static {
        b.llllllIlIlIIII();
        b.llllllIlIIllll();
        WEAK = new b();
        MEDIUM = new b();
        STRONG = new b();
        OVERCHARGED = new b();
        b[] bArray = new b[llIIllIlIllI[4]];
        bArray[b.llIIllIlIllI[0]] = WEAK;
        bArray[b.llIIllIlIllI[1]] = MEDIUM;
        bArray[b.llIIllIlIllI[2]] = STRONG;
        bArray[b.llIIllIlIllI[3]] = OVERCHARGED;
        $VALUES = bArray;
    }

    private static void llllllIlIIllll() {
        llIIllIlIlIl = new String[llIIllIlIllI[4]];
        b.llIIllIlIlIl[b.llIIllIlIllI[0]] = b."WEAK";
        b.llIIllIlIlIl[b.llIIllIlIllI[1]] = b."MEDIUM";
        b.llIIllIlIlIl[b.llIIllIlIllI[2]] = b."STRONG";
        b.llIIllIlIlIl[b.llIIllIlIllI[3]] = b."OVERCHARGED";
    }

    public String toString() {
        String string = super.toString();
        return string.charAt(llIIllIlIllI[0]) + string.substring(llIIllIlIllI[1]).toLowerCase();
    }

    private static boolean llllllIlIlIIIl(int n2, int n3) {
        return n2 < n3;
    }
}

