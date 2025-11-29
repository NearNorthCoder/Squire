/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GEnum
extends Enum<G> {
    private static final /* synthetic */ G[] $VALUES;
    public static final /* synthetic */ /* enum */ G JUTE;
    public static final /* synthetic */ /* enum */ G HAMMERSTONE;
    public static final /* synthetic */ /* enum */ G ASGARNIAN;
    public static final /* synthetic */ /* enum */ G YANILLIAN;
    public static final /* synthetic */ /* enum */ G KRANDORIAN;
    private static /* synthetic */ String[] lIllllIIllll;
    private static /* synthetic */ int[] lIllllIlIIII;
    public static final /* synthetic */ /* enum */ G BARLEY;
    private final /* synthetic */ int seed;
    public static final /* synthetic */ /* enum */ G WILDBLOOD;

    private static String lllIlllIIllIlI(String var13, String var10) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var9 = var10.toCharArray();
        int var11 = lIllllIlIIII[0];
        char[] var15 = var13.toCharArray();
        int var8 = var15.length;
        int var18 = lIllllIlIIII[0];
        while (G.lllIlllIIllllI(var18, var8)) {
            char var12 = var15[var18];
            var16.append((char)(var12 ^ var9[var11 % var9.length]));
            0;
            ++var11;
            ++var18;
            0;
            if ((0x52 ^ 0x56) >= (0x67 ^ 0x63)) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    private static void lllIlllIIlllII() {
        lIllllIIllll = new String[lIllllIlIIII[14]];
        G.lIllllIIllll[G.lIllllIlIIII[0]] = G."BARLEY";
        G.lIllllIIllll[G.lIllllIlIIII[2]] = G."HAMMERSTONE";
        G.lIllllIIllll[G.lIllllIlIIII[4]] = G."ASGARNIAN";
        G.lIllllIIllll[G.lIllllIlIIII[6]] = G."JUTE";
        G.lIllllIIllll[G.lIllllIlIIII[8]] = G."YANILLIAN";
        G.lIllllIIllll[G.lIllllIlIIII[10]] = G."KRANDORIAN";
        G.lIllllIIllll[G.lIllllIlIIII[12]] = G."WILDBLOOD";
    }

    private static String lllIlllIIllIll(String var5, String var19) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(lIllllIlIIII[4], var1);
            return new String(var4.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private G(int n3) {
        this.seed = n3;
    }

    public static G[] values() {
        return (G[])$VALUES.clone();
    }

    public int aA() {
        return this.seed;
    }

    private static void lllIlllIIlllIl() {
        lIllllIlIIII = new int[16];
        G.lIllllIlIIII[0] = (0x7C ^ 0x22) & ~(0xD3 ^ 0x8D);
        G.lIllllIlIIII[1] = -(0xFFFFDFE7 & 0x6A1B) & (0xFFFFFFFB & 0x5EBF);
        G.lIllllIlIIII[2] = 1;
        G.lIllllIlIIII[3] = -(0xFFFFEB27 & 0x7FDD) & (0xFFFFFFFF & 0x7FBF);
        G.lIllllIlIIII[4] = 2;
        G.lIllllIlIIII[5] = 0xFFFF9CFD & 0x77BE;
        G.lIllllIlIIII[6] = 3;
        G.lIllllIlIIII[7] = -(0xFFFFBBE2 & 0x6F5F) & (0xFFFFFFFB & 0x3FFF);
        G.lIllllIlIIII[8] = 0x48 ^ 0x4C;
        G.lIllllIlIIII[9] = 0xFFFFB7FF & 0x5CBD;
        G.lIllllIlIIII[10] = 0x39 ^ 0x74 ^ (0x5A ^ 0x12);
        G.lIllllIlIIII[11] = 0xFFFF94FE & 0x7FBF;
        G.lIllllIlIIII[12] = 118 + 92 - 97 + 74 ^ 24 + 12 - 28 + 181;
        G.lIllllIlIIII[13] = -1 & (0xFFFFBDFF & 0x56BF);
        G.lIllllIlIIII[14] = 0 + 81 - -22 + 33 ^ 31 + 54 - 49 + 107;
        G.lIllllIlIIII[15] = 0x60 ^ 0x68;
    }

    static {
        G.lllIlllIIlllIl();
        G.lllIlllIIlllII();
        BARLEY = new G(lIllllIlIIII[1]);
        HAMMERSTONE = new G(lIllllIlIIII[3]);
        ASGARNIAN = new G(lIllllIlIIII[5]);
        JUTE = new G(lIllllIlIIII[7]);
        YANILLIAN = new G(lIllllIlIIII[9]);
        KRANDORIAN = new G(lIllllIlIIII[11]);
        WILDBLOOD = new G(lIllllIlIIII[13]);
        G[] gArray = new G[lIllllIlIIII[14]];
        gArray[G.lIllllIlIIII[0]] = BARLEY;
        gArray[G.lIllllIlIIII[2]] = HAMMERSTONE;
        gArray[G.lIllllIlIIII[4]] = ASGARNIAN;
        gArray[G.lIllllIlIIII[6]] = JUTE;
        gArray[G.lIllllIlIIII[8]] = YANILLIAN;
        gArray[G.lIllllIlIIII[10]] = KRANDORIAN;
        gArray[G.lIllllIlIIII[12]] = WILDBLOOD;
        $VALUES = gArray;
    }

    private static boolean lllIlllIIllllI(int n2, int n3) {
        return n2 < n3;
    }

    public static G valueOf(String string) {
        return Enum.valueOf(G.class, string);
    }

    private static String lllIlllIIllIIl(String var6, String var17) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), lIllllIlIIII[15]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lIllllIlIIII[4], var7);
            return new String(var2.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }
}

