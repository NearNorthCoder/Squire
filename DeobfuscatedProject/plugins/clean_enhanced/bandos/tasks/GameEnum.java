/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 */
package gg.squire.bandos.tasks;

import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;

public final class GameEnum
extends Enum<b> {
    
    public static final  /* enum */ b STEELWILL;
    private static final  b[] $VALUES;
    public static final  /* enum */ b STRONGSACK;
    
    private final  int animation;
    private final  Prayer protection;
    private final  int id;
    public static final  /* enum */ b GRIMSPIKE;
    private final  int projectile;

    private static boolean var3(int n2, int n3) {
        return n2 == n3;
    }

    private static void var4() {
        var2 = new String[var1[12]];
        b.var2[b.var1[0]] = "STRONGSACK";
        b.var2[b.var1[4]] = "STEELWILL";
        b.var2[b.var1[8]] = "GRIMSPIKE";
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var1[0];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var1[0];
        while (b.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (-(0x4F ^ 8 ^ (0xE8 ^ 0xAA)) < 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public static b a(Projectile projectile) {
        void var16;
        b[] bArray = b.values();
        int n2 = bArray.length;
        int var17 = var1[0];
        while (b.var14(var17, (int)var16)) {
            Projectile var18;
            void var19;
            void var20 = var19[var17];
            if (b.var3(var20.f(), var18.getId())) {
                return var20;
            }
            ++var17;
            0;
            if ((0x2B ^ 0x2F) == (0x1E ^ 0x1A)) continue;
            return null;
        }
        return null;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    public int f() {
        return this.projectile;
    }

    private GameEnum(int n3, Prayer prayer, int n4, int n5) {
        this.id = n3;
        this.protection = prayer;
        this.projectile = n4;
        this.animation = n5;
    }

    /*
     * WARNING - void declaration
     */
    public static b a(NPC nPC) {
        void var27;
        b[] bArray = b.values();
        int n2 = bArray.length;
        int var28 = var1[0];
        while (b.var14(var28, (int)var27)) {
            NPC var29;
            void var30;
            void var31 = var30[var28];
            if (b.var3(var31.d(), var29.getId())) {
                return var31;
            }
            ++var28;
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
        b.var32();
        b.var4();
        STRONGSACK = new GameEnum(var1[1], Prayer.PROTECT_FROM_MELEE, var1[2], var1[3]);
        STEELWILL = new GameEnum(var1[5], Prayer.PROTECT_FROM_MAGIC, var1[6], var1[7]);
        GRIMSPIKE = new GameEnum(var1[9], Prayer.PROTECT_FROM_MISSILES, var1[10], var1[11]);
        b[] bArray = new b[var1[12]];
        bArray[b.var1[0]] = STRONGSACK;
        bArray[b.var1[4]] = STEELWILL;
        bArray[b.var1[8]] = GRIMSPIKE;
        $VALUES = bArray;
    }

    private static void var32() {
        var1 = new int[14];
        b.var1[0] = (0x42 ^ 0x1D) & ~(7 ^ 0x58);
        b.var1[1] = 0xFFFFFBBD & 0xCEA;
        b.var1[2] = -1;
        b.var1[3] = 0xFFFFFEEB & 0x191E;
        b.var1[4] = 1;
        b.var1[5] = 0xFFFFAEAD & 0x59FB;
        b.var1[6] = -(0xFFFFBEFF & 0x591B) & (0xFFFFFDDF & 0x1EFB);
        b.var1[7] = 0xFFFFBBBF & 0x5FDF;
        b.var1[8] = 2;
        b.var1[9] = -(0xFFFFF77D & 0x3DD7) & (0xFFFFBDFE & Short.MAX_VALUE);
        b.var1[10] = -(0xFFFFEBBF & 0x1C79) & (0xFFFF8CFF & 0x7FFC);
        b.var1[11] = -(0xFFFFBEDB & 0x457F) & (0xFFFFDFFF & 0x3FFB);
        b.var1[12] = 3;
        b.var1[13] = 0x14 ^ 0x27 ^ (1 ^ 0x3A);
    }

    public int g() {
        return this.animation;
    }

        catch (Exception var38) {
            var38.printStackTrace();
            return null;
        }
    }
}

