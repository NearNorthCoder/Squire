/*
 * Decompiled with CFR 0.152.
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class p
extends Enum<p> {
    public static final /* synthetic */ /* enum */ p REDWOOD;
    public static final /* synthetic */ /* enum */ p MAGIC;
    public static final /* synthetic */ /* enum */ p MAPLE;
    private static final /* synthetic */ p[] $VALUES;
    private final /* synthetic */ int logId;
    private static /* synthetic */ int[] lllIlIIlIlI;
    private static /* synthetic */ String[] lllIIlIIIlI;
    public static final /* synthetic */ /* enum */ p WILLOW;
    public static final /* synthetic */ /* enum */ p NORMAL;
    public static final /* synthetic */ /* enum */ p OAK;
    public static final /* synthetic */ /* enum */ p YEW;

    public static p valueOf(String string) {
        return Enum.valueOf(p.class, string);
    }

    static {
        p.lIlIllllIllIII();
        p.lIlIllIlllIIlI();
        NORMAL = new p(lllIlIIlIlI[1]);
        OAK = new p(lllIlIIlIlI[3]);
        WILLOW = new p(lllIlIIlIlI[5]);
        MAPLE = new p(lllIlIIlIlI[7]);
        YEW = new p(lllIlIIlIlI[9]);
        MAGIC = new p(lllIlIIlIlI[11]);
        REDWOOD = new p(lllIlIIlIlI[13]);
        p[] pArray = new p[lllIlIIlIlI[14]];
        pArray[p.lllIlIIlIlI[0]] = NORMAL;
        pArray[p.lllIlIIlIlI[2]] = OAK;
        pArray[p.lllIlIIlIlI[4]] = WILLOW;
        pArray[p.lllIlIIlIlI[6]] = MAPLE;
        pArray[p.lllIlIIlIlI[8]] = YEW;
        pArray[p.lllIlIIlIlI[10]] = MAGIC;
        pArray[p.lllIlIIlIlI[12]] = REDWOOD;
        $VALUES = pArray;
    }

    public int M() {
        return this.logId;
    }

    private static void lIlIllIlllIIlI() {
        lllIIlIIIlI = new String[lllIlIIlIlI[14]];
        p.lllIIlIIIlI[p.lllIlIIlIlI[0]] = p."NORMAL";
        p.lllIIlIIIlI[p.lllIlIIlIlI[2]] = p."OAK";
        p.lllIIlIIIlI[p.lllIlIIlIlI[4]] = p."WILLOW";
        p.lllIIlIIIlI[p.lllIlIIlIlI[6]] = p."MAPLE";
        p.lllIIlIIIlI[p.lllIlIIlIlI[8]] = p."YEW";
        p.lllIIlIIIlI[p.lllIlIIlIlI[10]] = p."MAGIC";
        p.lllIIlIIIlI[p.lllIlIIlIlI[12]] = p."REDWOOD";
    }

    private static String lIlIllIllIllll(String var5, String var8) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), lllIlIIlIlI[15]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(lllIlIIlIlI[4], var19);
            return new String(var3.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static String lIlIllIlllIIIl(String var18, String var2) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var10 = var2.toCharArray();
        int var4 = lllIlIIlIlI[0];
        char[] var1 = var18.toCharArray();
        int var15 = var1.length;
        int var17 = lllIlIIlIlI[0];
        while (p.lIlIllllIllIIl(var17, var15)) {
            char var12 = var1[var17];
            var16.append((char)(var12 ^ var10[var4 % var10.length]));
            0;
            ++var4;
            ++var17;
            0;
            if (2 != -1) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    public static p[] values() {
        return (p[])$VALUES.clone();
    }

    private p(int n3) {
        this.logId = n3;
    }

    private static void lIlIllllIllIII() {
        lllIlIIlIlI = new int[16];
        p.lllIlIIlIlI[0] = (9 + 0 - -6 + 225 ^ 160 + 113 - 101 + 5) & (0xD9 ^ 0xC0 ^ (0x16 ^ 0x4E) ^ -1);
        p.lllIlIIlIlI[1] = -(0xFFFFE2DD & 0x7F2B) & (0xFFFFFFFF & 0x67EF);
        p.lllIlIIlIlI[2] = 1;
        p.lllIlIIlIlI[3] = -(0xFFFFF3CF & 0x2E3F) & (0xFFFFA7FF & Short.MAX_VALUE);
        p.lllIlIIlIlI[4] = 2;
        p.lllIlIIlIlI[5] = 0xFFFFFFEF & 0x5FF;
        p.lllIlIIlIlI[6] = 3;
        p.lllIlIIlIlI[7] = 0xFFFFF7EF & 0xDFD;
        p.lllIlIIlIlI[8] = 138 + 70 - 106 + 66 ^ 12 + 84 - -34 + 42;
        p.lllIlIIlIlI[9] = 0xFFFF9FFB & 0x65EF;
        p.lllIlIIlIlI[10] = 0x76 ^ 0x6C ^ (0x41 ^ 0x5E);
        p.lllIlIIlIlI[11] = 0xFFFFBFFD & 0x45EB;
        p.lllIlIIlIlI[12] = 37 + 65 - 82 + 149 ^ 51 + 152 - 68 + 40;
        p.lllIlIIlIlI[13] = -(0xFFFFB5CB & 0x7B3F) & (0xFFFFFFDF & 0x7DFF);
        p.lllIlIIlIlI[14] = 2 + 22 - -40 + 95 ^ 5 + 95 - 83 + 135;
        p.lllIlIIlIlI[15] = 50 + 35 - 39 + 94 ^ 55 + 100 - 72 + 49;
    }

    private static String lIlIllIlllIIII(String var6, String var9) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lllIlIIlIlI[4], var13);
            return new String(var7.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllllIllIIl(int n2, int n3) {
        return n2 < n3;
    }
}

