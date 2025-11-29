/*
 * Decompiled with CFR 0.152.
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class h
extends Enum<h> {
    public static final /* synthetic */ /* enum */ h TIN_ORE;
    private final /* synthetic */ int oreID;
    public static final /* synthetic */ /* enum */ h COPPER_ORE;
    private static /* synthetic */ String[] llllllIIIllI;
    public static final /* synthetic */ /* enum */ h IRON_ORE;
    private static /* synthetic */ int[] llllllIIIlll;
    private static final /* synthetic */ h[] $VALUES;
    private final /* synthetic */ int[] objectID;

    static {
        h.lIIlIlIIIlIIlll();
        h.lIIlIlIIIlIIllI();
        int[] nArray = new int[llllllIIIlll[2]];
        nArray[h.llllllIIIlll[0]] = llllllIIIlll[3];
        nArray[h.llllllIIIlll[4]] = llllllIIIlll[5];
        COPPER_ORE = new h(llllllIIIlll[1], nArray);
        int[] nArray2 = new int[llllllIIIlll[2]];
        nArray2[h.llllllIIIlll[0]] = llllllIIIlll[7];
        nArray2[h.llllllIIIlll[4]] = llllllIIIlll[8];
        TIN_ORE = new h(llllllIIIlll[6], nArray2);
        int[] nArray3 = new int[llllllIIIlll[2]];
        nArray3[h.llllllIIIlll[0]] = llllllIIIlll[10];
        nArray3[h.llllllIIIlll[4]] = llllllIIIlll[11];
        IRON_ORE = new h(llllllIIIlll[9], nArray3);
        h[] hArray = new h[llllllIIIlll[12]];
        hArray[h.llllllIIIlll[0]] = COPPER_ORE;
        hArray[h.llllllIIIlll[4]] = TIN_ORE;
        hArray[h.llllllIIIlll[2]] = IRON_ORE;
        $VALUES = hArray;
    }

    private static String lIIlIlIIIlIIIll(String var16, String var19) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(llllllIIIlll[2], var18);
            return new String(var3.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }

    private static String lIIlIlIIIlIIlII(String var17, String var12) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), llllllIIIlll[13]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(llllllIIIlll[2], var13);
            return new String(var8.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIIIlIIllI() {
        llllllIIIllI = new String[llllllIIIlll[12]];
        h.llllllIIIllI[h.llllllIIIlll[0]] = h."COPPER_ORE";
        h.llllllIIIllI[h.llllllIIIlll[4]] = h."TIN_ORE";
        h.llllllIIIllI[h.llllllIIIlll[2]] = h."IRON_ORE";
    }

    public int m() {
        return this.oreID;
    }

    private h(int n3, int ... nArray) {
        this.oreID = n3;
        this.objectID = nArray;
    }

    public int[] l() {
        return this.objectID;
    }

    private static boolean lIIlIlIIIlIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIlIlIIIlIIlll() {
        llllllIIIlll = new int[14];
        h.llllllIIIlll[0] = (0xA7 ^ 0xC5) & ~(0xE7 ^ 0x85);
        h.llllllIIIlll[1] = 0xFFFFCDFF & 0x33B4;
        h.llllllIIIlll[2] = 2;
        h.llllllIIIlll[3] = -(0xFFFFD0C7 & 0x7F7D) & (0xFFFFFFFD & 0x7BDF);
        h.llllllIIIlll[4] = 1;
        h.llllllIIIlll[5] = 0xFFFFFBFF & 0x2EBF;
        h.llllllIIIlll[6] = 0xFFFFEBBE & 0x15F7;
        h.llllllIIIlll[7] = 0xFFFFBEE8 & 0x6D77;
        h.llllllIIIlll[8] = 0xFFFFBE71 & 0x6DEF;
        h.llllllIIIlll[9] = -(0xFFFFE36A & 0x3CD7) & (0xFFFFE3FF & 0x3DF9);
        h.llllllIIIlll[10] = -(0xFFFFCB29 & 0x36DF) & (0xFFFFAF7F & 0x7EED);
        h.llllllIIIlll[11] = 0xFFFFAEF7 & 0x7D6C;
        h.llllllIIIlll[12] = 3;
        h.llllllIIIlll[13] = 76 + 2 - -45 + 32 ^ 100 + 6 - 85 + 126;
    }

    private static String lIIlIlIIIlIIlIl(String var10, String var6) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var2 = var6.toCharArray();
        int var4 = llllllIIIlll[0];
        char[] var5 = var10.toCharArray();
        int var11 = var5.length;
        int var9 = llllllIIIlll[0];
        while (h.lIIlIlIIIlIlIII(var9, var11)) {
            char var15 = var5[var9];
            var1.append((char)(var15 ^ var2[var4 % var2.length]));
            0;
            ++var4;
            ++var9;
            0;
            if (1 <= 1) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }
}

