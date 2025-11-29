/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 */
package q.s.r.i.e.s.o.u.a.d.n.-.b;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;

public final class BEnum
extends Enum<b> {
    private static /* synthetic */ int[] lllIIIlIIII;
    public static final /* synthetic */ /* enum */ b STEELWILL;
    private static final /* synthetic */ b[] $VALUES;
    public static final /* synthetic */ /* enum */ b STRONGSACK;
    private static /* synthetic */ String[] lllIIIIlIIl;
    private final /* synthetic */ int animation;
    private final /* synthetic */ Prayer protection;
    private final /* synthetic */ int id;
    public static final /* synthetic */ /* enum */ b GRIMSPIKE;
    private final /* synthetic */ int projectile;

    private static boolean lIlIllIllIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIlIllIlIIIIII() {
        lllIIIIlIIl = new String[lllIIIlIIII[12]];
        b.lllIIIIlIIl[b.lllIIIlIIII[0]] = b."STRONGSACK";
        b.lllIIIIlIIl[b.lllIIIlIIII[4]] = b."STEELWILL";
        b.lllIIIIlIIl[b.lllIIIlIIII[8]] = b."GRIMSPIKE";
    }

    private static String lIlIllIIlllllI(String var15, String var20) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var27 = new StringBuilder();
        char[] var5 = var20.toCharArray();
        int var13 = lllIIIlIIII[0];
        char[] var16 = var15.toCharArray();
        int var19 = var16.length;
        int var7 = lllIIIlIIII[0];
        while (b.lIlIllIllIIIII(var7, var19)) {
            char var21 = var16[var7];
            var27.append((char)(var21 ^ var5[var13 % var5.length]));
            0;
            ++var13;
            ++var7;
            0;
            if (-(0x4F ^ 8 ^ (0xE8 ^ 0xAA)) < 0) continue;
            return null;
        }
        return String.valueOf(var27);
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    private static boolean lIlIllIllIIIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public static b a(Projectile projectile) {
        void var10;
        b[] bArray = b.values();
        int n2 = bArray.length;
        int var24 = lllIIIlIIII[0];
        while (b.lIlIllIllIIIII(var24, (int)var10)) {
            Projectile var26;
            void var23;
            void var25 = var23[var24];
            if (b.lIlIllIllIIIIl(var25.f(), var26.getId())) {
                return var25;
            }
            ++var24;
            0;
            if ((0x2B ^ 0x2F) == (0x1E ^ 0x1A)) continue;
            return null;
        }
        return null;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    private static String lIlIllIIllllll(String var1, String var9) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(lllIIIlIIII[8], var6);
            return new String(var11.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    public int f() {
        return this.projectile;
    }

    private b(int n3, Prayer prayer, int n4, int n5) {
        this.id = n3;
        this.protection = prayer;
        this.projectile = n4;
        this.animation = n5;
    }

    /*
     * WARNING - void declaration
     */
    public static b a(NPC nPC) {
        void var8;
        b[] bArray = b.values();
        int n2 = bArray.length;
        int var4 = lllIIIlIIII[0];
        while (b.lIlIllIllIIIII(var4, (int)var8)) {
            NPC var14;
            void var18;
            void var3 = var18[var4];
            if (b.lIlIllIllIIIIl(var3.d(), var14.getId())) {
                return var3;
            }
            ++var4;
            0;
            if (1 < 2) continue;
            return null;
        }
        return null;
    }

    public int d() {
        return this.id;
    }

    public Prayer e() {
        return this.protection;
    }

    static {
        b.lIlIllIlIlllll();
        b.lIlIllIlIIIIII();
        STRONGSACK = new b(lllIIIlIIII[1], Prayer.PROTECT_FROM_MELEE, lllIIIlIIII[2], lllIIIlIIII[3]);
        STEELWILL = new b(lllIIIlIIII[5], Prayer.PROTECT_FROM_MAGIC, lllIIIlIIII[6], lllIIIlIIII[7]);
        GRIMSPIKE = new b(lllIIIlIIII[9], Prayer.PROTECT_FROM_MISSILES, lllIIIlIIII[10], lllIIIlIIII[11]);
        b[] bArray = new b[lllIIIlIIII[12]];
        bArray[b.lllIIIlIIII[0]] = STRONGSACK;
        bArray[b.lllIIIlIIII[4]] = STEELWILL;
        bArray[b.lllIIIlIIII[8]] = GRIMSPIKE;
        $VALUES = bArray;
    }

    private static void lIlIllIlIlllll() {
        lllIIIlIIII = new int[14];
        b.lllIIIlIIII[0] = (0x42 ^ 0x1D) & ~(7 ^ 0x58);
        b.lllIIIlIIII[1] = 0xFFFFFBBD & 0xCEA;
        b.lllIIIlIIII[2] = -1;
        b.lllIIIlIIII[3] = 0xFFFFFEEB & 0x191E;
        b.lllIIIlIIII[4] = 1;
        b.lllIIIlIIII[5] = 0xFFFFAEAD & 0x59FB;
        b.lllIIIlIIII[6] = -(0xFFFFBEFF & 0x591B) & (0xFFFFFDDF & 0x1EFB);
        b.lllIIIlIIII[7] = 0xFFFFBBBF & 0x5FDF;
        b.lllIIIlIIII[8] = 2;
        b.lllIIIlIIII[9] = -(0xFFFFF77D & 0x3DD7) & (0xFFFFBDFE & Short.MAX_VALUE);
        b.lllIIIlIIII[10] = -(0xFFFFEBBF & 0x1C79) & (0xFFFF8CFF & 0x7FFC);
        b.lllIIIlIIII[11] = -(0xFFFFBEDB & 0x457F) & (0xFFFFDFFF & 0x3FFB);
        b.lllIIIlIIII[12] = 3;
        b.lllIIIlIIII[13] = 0x14 ^ 0x27 ^ (1 ^ 0x3A);
    }

    public int g() {
        return this.animation;
    }

    private static String lIlIllIIllllIl(String var28, String var17) {
        try {
            SecretKeySpec var29 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), lllIIIlIIII[13]), "DES");
            Cipher var22 = Cipher.getInstance("DES");
            var22.init(lllIIIlIIII[8], var29);
            return new String(var22.doFinal(Base64.getDecoder().decode(var28.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }
}

