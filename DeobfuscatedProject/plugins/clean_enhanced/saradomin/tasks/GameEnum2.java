/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 */
package gg.squire.saradomin.tasks;

import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;

public final class GameEnum2
extends Enum<k> {
    private final  int animation;
    private static final  k[] $VALUES;
    private final  Prayer protection;
    public static final  /* enum */ k BREE;
    private final  int projectile;
    public static final  /* enum */ k STARLIGHT;
    private final  int id;
    public static final  /* enum */ k GROWLER;

    static {
        k.var3();
        k.var4();
        BREE = new GameEnum2(var1[1], Prayer.PROTECT_FROM_MISSILES, var1[2], var1[3]);
        GROWLER = new GameEnum2(var1[5], Prayer.PROTECT_FROM_MAGIC, var1[6], var1[7]);
        STARLIGHT = new GameEnum2(var1[9], Prayer.PROTECT_FROM_MELEE, var1[10], var1[11]);
        k[] kArray = new k[var1[12]];
        kArray[k.var1[0]] = BREE;
        kArray[k.var1[4]] = GROWLER;
        kArray[k.var1[8]] = STARLIGHT;
        $VALUES = kArray;
    }

    public int D() {
        return this.id;
    }

    /*
     * WARNING - void declaration
     */
    public static k c(NPC nPC) {
        void var5;
        k[] kArray = k.values();
        int n2 = kArray.length;
        int var6 = var1[0];
        while (k.var7(var6, (int)var5)) {
            NPC var8;
            void var9;
            void var10 = var9[var6];
            if (k.var11(var10.D(), var8.getId())) {
                return var10;
            }
            ++var6;
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

    private GameEnum2(int n3, Prayer prayer, int n4, int n5) {
        this.id = n3;
        this.protection = prayer;
        this.projectile = n4;
        this.animation = n5;
    }

    private static boolean var11(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var7(int n2, int n3) {
        return n2 < n3;
    }

    public int F() {
        return this.projectile;
    }

    private static void var4() {
        var2 = new String[var1[12]];
        k.var2[k.var1[0]] = "BREE";
        k.var2[k.var1[4]] = "GROWLER";
        k.var2[k.var1[8]] = "STARLIGHT";
    }

    public static k valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static k a(Projectile projectile) {
        void var18;
        k[] kArray = k.values();
        int n2 = kArray.length;
        int var19 = var1[0];
        while (k.var7(var19, (int)var18)) {
            Projectile var20;
            void var21;
            void var22 = var21[var19];
            if (k.var11(var22.F(), var20.getId())) {
                return var22;
            }
            ++var19;
            0;
            if (-1 < 3) continue;
            return null;
        }
        return null;
    }

    private static void var3() {
        var1 = new int[14];
        k.var1[0] = (0x78 ^ 0x55) & ~(0xB4 ^ 0x99);
        k.var1[1] = 0xFFFFEEEF & 0x19B0;
        k.var1[2] = -(0xFFFFFE7F & 0xB89) & (0xFFFF8EFF & 0x7FAE);
        k.var1[3] = -(0xFFFF9FEF & 0x649A) & (0xFFFFFFFB & 0x1FFF);
        k.var1[4] = 1;
        k.var1[5] = 0xFFFF9CFF & 0x6B9F;
        k.var1[6] = 0xFFFFA49F & 0x5FFF;
        k.var1[7] = 0xFFFF9F7D & 0x7BFF;
        k.var1[8] = 2;
        k.var1[9] = 0xFFFF99FF & 0x6E9E;
        k.var1[10] = -1;
        k.var1[11] = 0xFFFF9DFF & 0x7AE8;
        k.var1[12] = 3;
        k.var1[13] = 0x5F ^ 0x57;
    }

    private static String var23(String var24, String var25) {
        var24 = new String(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var26 = new StringBuilder();
        char[] var27 = var25.toCharArray();
        int var28 = var1[0];
        char[] var29 = var24.toCharArray();
        int var30 = var29.length;
        int var31 = var1[0];
        while (k.var7(var31, var30)) {
            char var32 = var29[var31];
            var26.append((char)(var32 ^ var27[var28 % var27.length]));
            0;
            ++var28;
            ++var31;
            0;
            if (((0x47 ^ 0x21 ^ (0x12 ^ 0x32)) & (0x32 ^ 0x28 ^ (0xE9 ^ 0xB5) ^ -1)) <= 3) continue;
            return null;
        }
        return String.valueOf(var26);
    }
}

