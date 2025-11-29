/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 */
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;

public final class KEnum
extends Enum<k> {
    private final /* synthetic */ int animation;
    private static final /* synthetic */ k[] $VALUES;
    private final /* synthetic */ Prayer protection;
    public static final /* synthetic */ /* enum */ k BREE;
    private final /* synthetic */ int projectile;
    public static final /* synthetic */ /* enum */ k STARLIGHT;
    private final /* synthetic */ int id;
    public static final /* synthetic */ /* enum */ k GROWLER;
    private static /* synthetic */ int[] lIIlIIlllIlIl;
    private static /* synthetic */ String[] lIIlIIlllIIll;

    static {
        k.lIlIlIlIlIIllll();
        k.lIlIlIlIlIIlIIl();
        BREE = new k(lIIlIIlllIlIl[1], Prayer.PROTECT_FROM_MISSILES, lIIlIIlllIlIl[2], lIIlIIlllIlIl[3]);
        GROWLER = new k(lIIlIIlllIlIl[5], Prayer.PROTECT_FROM_MAGIC, lIIlIIlllIlIl[6], lIIlIIlllIlIl[7]);
        STARLIGHT = new k(lIIlIIlllIlIl[9], Prayer.PROTECT_FROM_MELEE, lIIlIIlllIlIl[10], lIIlIIlllIlIl[11]);
        k[] kArray = new k[lIIlIIlllIlIl[12]];
        kArray[k.lIIlIIlllIlIl[0]] = BREE;
        kArray[k.lIIlIIlllIlIl[4]] = GROWLER;
        kArray[k.lIIlIIlllIlIl[8]] = STARLIGHT;
        $VALUES = kArray;
    }

    public int D() {
        return this.id;
    }

    /*
     * WARNING - void declaration
     */
    public static k c(NPC nPC) {
        void var19;
        k[] kArray = k.values();
        int n2 = kArray.length;
        int var22 = lIIlIIlllIlIl[0];
        while (k.lIlIlIlIlIlIIII(var22, (int)var19)) {
            NPC var15;
            void var6;
            void var3 = var6[var22];
            if (k.lIlIlIlIlIlIIIl(var3.D(), var15.getId())) {
                return var3;
            }
            ++var22;
            0;
            if (((0x3F ^ 0x69) & ~(0xF2 ^ 0xA4)) < 1) continue;
            return null;
        }
        return null;
    }

    public static k[] values() {
        return (k[])$VALUES.clone();
    }

    public Prayer E() {
        return this.protection;
    }

    public int G() {
        return this.animation;
    }

    private k(int n3, Prayer prayer, int n4, int n5) {
        this.id = n3;
        this.protection = prayer;
        this.projectile = n4;
        this.animation = n5;
    }

    private static boolean lIlIlIlIlIlIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIlIlIlIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    public int F() {
        return this.projectile;
    }

    private static void lIlIlIlIlIIlIIl() {
        lIIlIIlllIIll = new String[lIIlIIlllIlIl[12]];
        k.lIIlIIlllIIll[k.lIIlIIlllIlIl[0]] = k."BREE";
        k.lIIlIIlllIIll[k.lIIlIIlllIlIl[4]] = k."GROWLER";
        k.lIIlIIlllIIll[k.lIIlIIlllIlIl[8]] = k."STARLIGHT";
    }

    public static k valueOf(String string) {
        return Enum.valueOf(k.class, string);
    }

    private static String lIlIlIlIlIIlIII(String var5, String var8) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), lIIlIIlllIlIl[13]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(lIIlIIlllIlIl[8], var10);
            return new String(var16.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static k a(Projectile projectile) {
        void var2;
        k[] kArray = k.values();
        int n2 = kArray.length;
        int var18 = lIIlIIlllIlIl[0];
        while (k.lIlIlIlIlIlIIII(var18, (int)var2)) {
            Projectile var4;
            void var13;
            void var12 = var13[var18];
            if (k.lIlIlIlIlIlIIIl(var12.F(), var4.getId())) {
                return var12;
            }
            ++var18;
            0;
            if (-1 < 3) continue;
            return null;
        }
        return null;
    }

    private static void lIlIlIlIlIIllll() {
        lIIlIIlllIlIl = new int[14];
        k.lIIlIIlllIlIl[0] = (0x78 ^ 0x55) & ~(0xB4 ^ 0x99);
        k.lIIlIIlllIlIl[1] = 0xFFFFEEEF & 0x19B0;
        k.lIIlIIlllIlIl[2] = -(0xFFFFFE7F & 0xB89) & (0xFFFF8EFF & 0x7FAE);
        k.lIIlIIlllIlIl[3] = -(0xFFFF9FEF & 0x649A) & (0xFFFFFFFB & 0x1FFF);
        k.lIIlIIlllIlIl[4] = 1;
        k.lIIlIIlllIlIl[5] = 0xFFFF9CFF & 0x6B9F;
        k.lIIlIIlllIlIl[6] = 0xFFFFA49F & 0x5FFF;
        k.lIIlIIlllIlIl[7] = 0xFFFF9F7D & 0x7BFF;
        k.lIIlIIlllIlIl[8] = 2;
        k.lIIlIIlllIlIl[9] = 0xFFFF99FF & 0x6E9E;
        k.lIIlIIlllIlIl[10] = -1;
        k.lIIlIIlllIlIl[11] = 0xFFFF9DFF & 0x7AE8;
        k.lIIlIIlllIlIl[12] = 3;
        k.lIIlIIlllIlIl[13] = 0x5F ^ 0x57;
    }

    private static String lIlIlIlIlIIIlll(String var17, String var23) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var20 = var23.toCharArray();
        int var21 = lIIlIIlllIlIl[0];
        char[] var9 = var17.toCharArray();
        int var24 = var9.length;
        int var1 = lIIlIIlllIlIl[0];
        while (k.lIlIlIlIlIlIIII(var1, var24)) {
            char var11 = var9[var1];
            var14.append((char)(var11 ^ var20[var21 % var20.length]));
            0;
            ++var21;
            ++var1;
            0;
            if (((0x47 ^ 0x21 ^ (0x12 ^ 0x32)) & (0x32 ^ 0x28 ^ (0xE9 ^ 0xB5) ^ -1)) <= 3) continue;
            return null;
        }
        return String.valueOf(var14);
    }
}

