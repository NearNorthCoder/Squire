/*
 * Decompiled with CFR 0.152.
 */
package s.l.l.r.o.q.-.a.i.g.i.r.u.e.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class d
extends Enum<d> {
    private static /* synthetic */ String[] llIIlIllIlIl;
    public static final /* synthetic */ /* enum */ d MAGIC;
    public static final /* synthetic */ /* enum */ d RANGED;
    private static final /* synthetic */ d[] $VALUES;
    private static /* synthetic */ int[] llIIlIllIllI;
    public static final /* synthetic */ /* enum */ d MELEE;
    public static final /* synthetic */ /* enum */ d BOULDER;

    private static boolean lllllIlllIIIII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        d.lllllIllIlllll();
        d.lllllIllIllllI();
        MAGIC = new d();
        RANGED = new d();
        MELEE = new d();
        BOULDER = new d();
        d[] dArray = new d[llIIlIllIllI[4]];
        dArray[d.llIIlIllIllI[0]] = MAGIC;
        dArray[d.llIIlIllIllI[1]] = RANGED;
        dArray[d.llIIlIllIllI[2]] = MELEE;
        dArray[d.llIIlIllIllI[3]] = BOULDER;
        $VALUES = dArray;
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    private static String lllllIllIlllII(String var12, String var8) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var19 = Cipher.getInstance("Blowfish");
            var19.init(llIIlIllIllI[2], var2);
            return new String(var19.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static String lllllIllIlllIl(String var7, String var14) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), llIIlIllIllI[5]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(llIIlIllIllI[2], var18);
            return new String(var16.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static void lllllIllIlllll() {
        llIIlIllIllI = new int[6];
        d.llIIlIllIllI[0] = (181 + 200 - 196 + 41 ^ 18 + 31 - -26 + 85) & (0x88 ^ 0x9E ^ (0xF2 ^ 0xA6) ^ -1);
        d.llIIlIllIllI[1] = 1;
        d.llIIlIllIllI[2] = 2;
        d.llIIlIllIllI[3] = 3;
        d.llIIlIllIllI[4] = 0xA8 ^ 0xAC;
        d.llIIlIllIllI[5] = 0x6B ^ 0x63;
    }

    private static void lllllIllIllllI() {
        llIIlIllIlIl = new String[llIIlIllIllI[4]];
        d.llIIlIllIlIl[d.llIIlIllIllI[0]] = d."MAGIC";
        d.llIIlIllIlIl[d.llIIlIllIllI[1]] = d."RANGED";
        d.llIIlIllIlIl[d.llIIlIllIllI[2]] = d."MELEE";
        d.llIIlIllIlIl[d.llIIlIllIllI[3]] = d."BOULDER";
    }

    private static String lllllIllIllIll(String var15, String var6) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var10 = var6.toCharArray();
        int var1 = llIIlIllIllI[0];
        char[] var11 = var15.toCharArray();
        int var17 = var11.length;
        int var9 = llIIlIllIllI[0];
        while (d.lllllIlllIIIII(var9, var17)) {
            char var13 = var11[var9];
            var4.append((char)(var13 ^ var10[var1 % var10.length]));
            0;
            ++var1;
            ++var9;
            0;
            if (1 >= 0) continue;
            return null;
        }
        return String.valueOf(var4);
    }
}

