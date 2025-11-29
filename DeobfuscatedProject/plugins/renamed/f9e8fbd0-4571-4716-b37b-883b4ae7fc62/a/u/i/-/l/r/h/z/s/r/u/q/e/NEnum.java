/*
 * Decompiled with CFR 0.152.
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class NEnum
extends Enum<n> {
    private static /* synthetic */ int[] lIllIlIlIIIll;
    public static final /* synthetic */ /* enum */ n EAST;
    public static final /* synthetic */ /* enum */ n NORTH_WEST;
    private final /* synthetic */ int x;
    public static final /* synthetic */ /* enum */ n WEST;
    public static final /* synthetic */ /* enum */ n CENTER_WEST;
    private final /* synthetic */ int y;
    public static final /* synthetic */ /* enum */ n NORTH_EAST;
    public static final /* synthetic */ /* enum */ n CENTER;
    private static /* synthetic */ String[] lIllIlIlIIIlI;
    private static final /* synthetic */ n[] $VALUES;
    public static final /* synthetic */ /* enum */ n CENTER_EAST;

    public static n[] values() {
        return (n[])$VALUES.clone();
    }

    private static void llIIIllllllIlIl() {
        lIllIlIlIIIll = new int[12];
        n.lIllIlIlIIIll[0] = (0xBF ^ 0x8B) & ~(0x5E ^ 0x6A);
        n.lIllIlIlIIIll[1] = 0x33 ^ 0x28 ^ (0x91 ^ 0x8C);
        n.lIllIlIlIIIll[2] = 0x29 ^ 0x31 ^ (0xD0 ^ 0xC1);
        n.lIllIlIlIIIll[3] = 1;
        n.lIllIlIlIIIll[4] = -(0x1B ^ 0x72 ^ (0x3D ^ 0x50));
        n.lIllIlIlIIIll[5] = 0x64 ^ 0x6E;
        n.lIllIlIlIIIll[6] = 2;
        n.lIllIlIlIIIll[7] = 7 ^ 0x64 ^ (0xC1 ^ 0xA6);
        n.lIllIlIlIIIll[8] = 3;
        n.lIllIlIlIIIll[9] = 0x49 ^ 0x4C;
        n.lIllIlIlIIIll[10] = 0x5D ^ 0x5A;
        n.lIllIlIlIIIll[11] = 0x80 ^ 0x88;
    }

    public static n valueOf(String string) {
        return Enum.valueOf(n.class, string);
    }

    private static String llIIIllllllIIlI(String var19, String var12) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIllIlIlIIIll[6], var5);
            return new String(var7.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    static {
        n.llIIIllllllIlIl();
        n.llIIIllllllIlII();
        NORTH_EAST = new n(lIllIlIlIIIll[1], lIllIlIlIIIll[2]);
        NORTH_WEST = new n(lIllIlIlIIIll[4], lIllIlIlIIIll[5]);
        WEST = new n(lIllIlIlIIIll[4], lIllIlIlIIIll[7]);
        EAST = new n(lIllIlIlIIIll[7], lIllIlIlIIIll[7]);
        CENTER_WEST = new n(lIllIlIlIIIll[4], lIllIlIlIIIll[3]);
        CENTER_EAST = new n(lIllIlIlIIIll[7], lIllIlIlIIIll[3]);
        CENTER = new n(lIllIlIlIIIll[0], lIllIlIlIIIll[0]);
        n[] nArray = new n[lIllIlIlIIIll[10]];
        nArray[n.lIllIlIlIIIll[0]] = NORTH_EAST;
        nArray[n.lIllIlIlIIIll[3]] = NORTH_WEST;
        nArray[n.lIllIlIlIIIll[6]] = WEST;
        nArray[n.lIllIlIlIIIll[8]] = EAST;
        nArray[n.lIllIlIlIIIll[7]] = CENTER_WEST;
        nArray[n.lIllIlIlIIIll[9]] = CENTER_EAST;
        nArray[n.lIllIlIlIIIll[1]] = CENTER;
        $VALUES = nArray;
    }

    public int H() {
        return this.y;
    }

    private static String llIIIllllllIIIl(String var9, String var16) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), lIllIlIlIIIll[11]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(lIllIlIlIIIll[6], var2);
            return new String(var4.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String llIIIllllllIIll(String var15, String var13) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var11 = var13.toCharArray();
        int var14 = lIllIlIlIIIll[0];
        char[] var1 = var15.toCharArray();
        int var18 = var1.length;
        int var17 = lIllIlIlIIIll[0];
        while (n.llIIIllllllIllI(var17, var18)) {
            char var10 = var1[var17];
            var6.append((char)(var10 ^ var11[var14 % var11.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (-3 < 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private n(int n3, int n4) {
        this.x = n3;
        this.y = n4;
    }

    public int G() {
        return this.x;
    }

    private static void llIIIllllllIlII() {
        lIllIlIlIIIlI = new String[lIllIlIlIIIll[10]];
        n.lIllIlIlIIIlI[n.lIllIlIlIIIll[0]] = n."NORTH_EAST";
        n.lIllIlIlIIIlI[n.lIllIlIlIIIll[3]] = n."NORTH_WEST";
        n.lIllIlIlIIIlI[n.lIllIlIlIIIll[6]] = n."WEST";
        n.lIllIlIlIIIlI[n.lIllIlIlIIIll[8]] = n."EAST";
        n.lIllIlIlIIIlI[n.lIllIlIlIIIll[7]] = n."CENTER_WEST";
        n.lIllIlIlIIIlI[n.lIllIlIlIIIll[9]] = n."CENTER_EAST";
        n.lIllIlIlIIIlI[n.lIllIlIlIIIll[1]] = n."CENTER";
    }

    private static boolean llIIIllllllIllI(int n2, int n3) {
        return n2 < n3;
    }
}

