/*
 * Decompiled with CFR 0.152.
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GEnum
extends Enum<g> {
    private static /* synthetic */ String[] lllIlllIIlIl;
    private static /* synthetic */ int[] lllIlllIlIIl;
    public static final /* synthetic */ /* enum */ g FULL;
    private static final /* synthetic */ g[] $VALUES;
    public static final /* synthetic */ /* enum */ g TRANSITION;
    public static final /* synthetic */ /* enum */ g OPEN;
    public static final /* synthetic */ /* enum */ g EMPTY;

    private static String lIIIllIllIllIll(String var6, String var17) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), lllIlllIlIIl[5]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(lllIlllIlIIl[2], var4);
            return new String(var14.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIlllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        g.lIIIllIlllIIIlI();
        g.lIIIllIlllIIIII();
        OPEN = new g();
        EMPTY = new g();
        FULL = new g();
        TRANSITION = new g();
        g[] gArray = new g[lllIlllIlIIl[4]];
        gArray[g.lllIlllIlIIl[0]] = OPEN;
        gArray[g.lllIlllIlIIl[1]] = EMPTY;
        gArray[g.lllIlllIlIIl[2]] = FULL;
        gArray[g.lllIlllIlIIl[3]] = TRANSITION;
        $VALUES = gArray;
    }

    private static String lIIIllIllIlllll(String var12, String var15) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var3 = var15.toCharArray();
        int var1 = lllIlllIlIIl[0];
        char[] var19 = var12.toCharArray();
        int var8 = var19.length;
        int var2 = lllIlllIlIIl[0];
        while (g.lIIIllIlllIIlIl(var2, var8)) {
            char var5 = var19[var2];
            var7.append((char)(var5 ^ var3[var1 % var3.length]));
            0;
            ++var1;
            ++var2;
            0;
            if (-(0xC ^ 8) < 0) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static void lIIIllIlllIIIII() {
        lllIlllIIlIl = new String[lllIlllIlIIl[4]];
        g.lllIlllIIlIl[g.lllIlllIlIIl[0]] = g."OPEN";
        g.lllIlllIIlIl[g.lllIlllIlIIl[1]] = g."EMPTY";
        g.lllIlllIIlIl[g.lllIlllIlIIl[2]] = g."FULL";
        g.lllIlllIIlIl[g.lllIlllIlIIl[3]] = g."TRANSITION";
    }

    private static void lIIIllIlllIIIlI() {
        lllIlllIlIIl = new int[6];
        g.lllIlllIlIIl[0] = (0x60 ^ 0x75) & ~(9 ^ 0x1C);
        g.lllIlllIlIIl[1] = 1;
        g.lllIlllIlIIl[2] = 2;
        g.lllIlllIlIIl[3] = 3;
        g.lllIlllIlIIl[4] = 0x3C ^ 0x38;
        g.lllIlllIlIIl[5] = 50 + 37 - -70 + 5 ^ 27 + 106 - 3 + 40;
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    private static String lIIIllIllIlllII(String var18, String var16) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(lllIlllIlIIl[2], var13);
            return new String(var10.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }
}

