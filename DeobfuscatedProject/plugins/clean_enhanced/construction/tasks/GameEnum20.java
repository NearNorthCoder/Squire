/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.construction.tasks;

import net.runelite.api.Prayer;

public final class GameEnum20
extends Enum<e> {
    private final  Prayer prayer;
    public static final  /* enum */ e MELEE;
    public static final  /* enum */ e GHOST_RANGED;
    private static  String[] lIlIlIll;
    public static final  /* enum */ e GHOST_MELEE;
    public static final  /* enum */ e LAVA;
    public static final  /* enum */ e GHOST_MAGIC;
    private static final  e[] $VALUES;
    public static final  /* enum */ e GHOSTS;
    public static final  /* enum */ e MAGIC;
    public static final  /* enum */ e SPAWN;
    private static  int[] lIlIllII;
    public static final  /* enum */ e RANGED;
    public static final  /* enum */ e AUTO;
    private final  int priority;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum20(Prayer prayer, int n3) {
        this.prayer = prayer;
        this.priority = n3;
    }

    private static void var2() {
        lIlIlIll = new String[lIlIllII[10]];
        e.lIlIlIll[e.lIlIllII[1]] = "SPAWN";
        e.lIlIlIll[e.lIlIllII[0]] = "AUTO";
        e.lIlIlIll[e.lIlIllII[2]] = "MELEE";
        e.lIlIlIll[e.lIlIllII[3]] = "RANGED";
        e.lIlIlIll[e.lIlIllII[4]] = "MAGIC";
        e.lIlIlIll[e.lIlIllII[5]] = "LAVA";
        e.lIlIlIll[e.lIlIllII[6]] = "GHOSTS";
        e.lIlIlIll[e.lIlIllII[7]] = "GHOST_MELEE";
        e.lIlIlIll[e.lIlIllII[8]] = "GHOST_RANGED";
        e.lIlIlIll[e.lIlIllII[9]] = "GHOST_MAGIC";
    }

    public int H() {
        return this.priority;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean var16(Object object, Object object2) {
        return object == object2;
    }

    public String toString() {
        return "Attack{prayer=" + this.prayer + ", priority=" + this.priority + "}";
    }

    private static String var17(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var21 = var19.toCharArray();
        int var22 = lIlIllII[1];
        char[] var23 = var18.toCharArray();
        int var24 = var23.length;
        int var25 = lIlIllII[1];
        while (e.var3(var25, var24)) {
            char var26 = var23[var25];
            var20.append((char)(var26 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            if (((93 + 132 - 147 + 95 ^ 113 + 46 - 132 + 107) & (196 + 19 - 100 + 121 ^ 58 + 87 - -8 + 46 ^ -1)) >= 0) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    private static void var1() {
        lIlIllII = new int[11];
        e.lIlIllII[0] = 1;
        e.lIlIllII[1] = (10 + 192 - 5 + 52 ^ 78 + 81 - 83 + 87) & (1 ^ (0x5E ^ 5) ^ -1);
        e.lIlIllII[2] = 2;
        e.lIlIllII[3] = 3;
        e.lIlIllII[4] = 0x2E ^ 0x41 ^ (0x15 ^ 0x7E);
        e.lIlIllII[5] = 102 + 134 - 137 + 71 ^ 67 + 116 - 119 + 111;
        e.lIlIllII[6] = 81 + 5 - 24 + 84 ^ 84 + 83 - 114 + 95;
        e.lIlIllII[7] = 0x2D ^ 0x7D ^ (0xE1 ^ 0xB6);
        e.lIlIllII[8] = 0x84 ^ 0x99 ^ (0x61 ^ 0x74);
        e.lIlIllII[9] = 0x61 ^ 0x68;
        e.lIlIllII[10] = 0x6E ^ 0x64;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum20.class, string);
    }

    public Prayer j() {
        return this.prayer;
    }

    private static boolean var27(Object object, Object object2) {
        return object != object2;
    }

    public boolean G() {
        boolean bl2;
        if (!e.var27((Object)this, (Object)GHOST_MAGIC) || !e.var27((Object)this, (Object)GHOST_RANGED) || e.var16((Object)this, (Object)GHOST_MELEE)) {
            bl2 = lIlIllII[0];
            0;
            if (-2 >= 0) {
                return ((0xCF ^ 0x87) & ~(0x6C ^ 0x24)) != 0;
            }
        } else {
            bl2 = lIlIllII[1];
        }
        return bl2;
    }
}

