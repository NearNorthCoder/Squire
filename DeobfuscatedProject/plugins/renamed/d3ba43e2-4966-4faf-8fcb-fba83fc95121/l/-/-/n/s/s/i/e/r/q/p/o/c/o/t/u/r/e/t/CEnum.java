/*
 * Decompiled with CFR 0.152.
 */
package l.-.-.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class CEnum
extends Enum<c> {
    public static final /* synthetic */ /* enum */ c VETERAN;
    private /* synthetic */ int pointsPerGame;
    private /* synthetic */ String difficulty;
    public static final /* synthetic */ /* enum */ c INTERMEDIATE;
    private static /* synthetic */ String[] lIIIlIlIIIIII;
    private /* synthetic */ int levelRequirement;
    private /* synthetic */ int objectID;
    private static final /* synthetic */ c[] $VALUES;
    public static final /* synthetic */ /* enum */ c NOVICE;
    private static /* synthetic */ int[] lIIIlIlIIIIIl;

    static {
        c.lIIllllllIlIIII();
        c.lIIllllllIIllll();
        NOVICE = new c(lIIIlIlIIIIII[lIIIlIlIIIIIl[1]], lIIIlIlIIIIIl[2], lIIIlIlIIIIIl[3], lIIIlIlIIIIIl[4]);
        INTERMEDIATE = new c(lIIIlIlIIIIII[lIIIlIlIIIIIl[4]], lIIIlIlIIIIIl[6], lIIIlIlIIIIIl[7], lIIIlIlIIIIIl[8]);
        VETERAN = new c(lIIIlIlIIIIII[lIIIlIlIIIIIl[9]], lIIIlIlIIIIIl[10], lIIIlIlIIIIIl[11], lIIIlIlIIIIIl[9]);
        c[] cArray = new c[lIIIlIlIIIIIl[4]];
        cArray[c.lIIIlIlIIIIIl[0]] = NOVICE;
        cArray[c.lIIIlIlIIIIIl[1]] = INTERMEDIATE;
        cArray[c.lIIIlIlIIIIIl[5]] = VETERAN;
        $VALUES = cArray;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static void lIIllllllIIllll() {
        lIIIlIlIIIIII = new String[lIIIlIlIIIIIl[12]];
        c.lIIIlIlIIIIII[c.lIIIlIlIIIIIl[0]] = c."NOVICE";
        c.lIIIlIlIIIIII[c.lIIIlIlIIIIIl[1]] = c."Novice";
        c.lIIIlIlIIIIII[c.lIIIlIlIIIIIl[5]] = c."INTERMEDIATE";
        c.lIIIlIlIIIIII[c.lIIIlIlIIIIIl[4]] = c."Intermediate";
        c.lIIIlIlIIIIII[c.lIIIlIlIIIIIl[8]] = c."VETERAN";
        c.lIIIlIlIIIIII[c.lIIIlIlIIIIIl[9]] = c."Veteran";
    }

    private static void lIIllllllIlIIII() {
        lIIIlIlIIIIIl = new int[14];
        c.lIIIlIlIIIIIl[0] = (4 ^ 0xF ^ (0x66 ^ 0x73)) & (0x49 ^ 0x18 ^ (0xB ^ 0x44) ^ -1);
        c.lIIIlIlIIIIIl[1] = 1;
        c.lIIIlIlIIIIIl[2] = 0x99 ^ 0xB1;
        c.lIIIlIlIIIIIl[3] = -(0xFFFFCCF3 & 0x7B0D) & (0xFFFFFFFF & 0x7FEB);
        c.lIIIlIlIIIIIl[4] = 3;
        c.lIIIlIlIIIIIl[5] = 2;
        c.lIIIlIlIIIIIl[6] = 0xF7 ^ 0xB1;
        c.lIIIlIlIIIIIl[7] = 0xFFFFFEDF & 0x653F;
        c.lIIIlIlIIIIIl[8] = (0x27 ^ 0x6D) & ~(0x11 ^ 0x5B) ^ (0x28 ^ 0x2C);
        c.lIIIlIlIIIIIl[9] = 125 + 43 - 65 + 50 ^ 105 + 135 - 109 + 25;
        c.lIIIlIlIIIIIl[10] = 0x6C ^ 0x1D ^ (0x47 ^ 0x52);
        c.lIIIlIlIIIIIl[11] = 0xFFFFE472 & 0x7FAD;
        c.lIIIlIlIIIIIl[12] = 0x92 ^ 0x94;
        c.lIIIlIlIIIIIl[13] = 0xBA ^ 0xB2;
    }

    public String j() {
        return this.difficulty;
    }

    public String toString() {
        return "Boats." + this.name() + "(difficulty=" + this.j() + ", levelRequirement=" + this.k() + ", objectID=" + this.l() + ", pointsPerGame=" + this.m() + ")";
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private static boolean lIIllllllIlIIIl(int n, int n2) {
        return n < n2;
    }

    private static String lIIllllllIIllIl(String var15, String var17) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), lIIIlIlIIIIIl[13]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lIIIlIlIIIIIl[5], var8);
            return new String(var9.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static String lIIllllllIIlllI(String var14, String var11) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var19 = Cipher.getInstance("Blowfish");
            var19.init(lIIIlIlIIIIIl[5], var7);
            return new String(var19.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    public int m() {
        return this.pointsPerGame;
    }

    private c(String string2, int n2, int n3, int n4) {
        this.difficulty = string2;
        this.levelRequirement = n2;
        this.objectID = n3;
        this.pointsPerGame = n4;
    }

    public int k() {
        return this.levelRequirement;
    }

    public int l() {
        return this.objectID;
    }

    private static String lIIllllllIIllII(String var4, String var6) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var13 = var6.toCharArray();
        int var16 = lIIIlIlIIIIIl[0];
        char[] var1 = var4.toCharArray();
        int var18 = var1.length;
        int var10 = lIIIlIlIIIIIl[0];
        while (c.lIIllllllIlIIIl(var10, var18)) {
            char var12 = var1[var10];
            var2.append((char)(var12 ^ var13[var16 % var13.length]));
            0;
            ++var16;
            ++var10;
            0;
            if (1 <= 2) continue;
            return null;
        }
        return String.valueOf(var2);
    }
}

