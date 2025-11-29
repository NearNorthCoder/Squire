/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.saradomin.tasks;

import net.runelite.api.Prayer;

public final class GameEnum3
extends Enum<h> {
    public static final  /* enum */ h GROWLER;
    private final  String enemyName;
    private final  int attackAnimation;
    private static final  h[] $VALUES;
    
    public static final  /* enum */ h THROWER_TROLL;
    public static final  /* enum */ h STARLIGHT;
    private final  Prayer prayer;
    public static final  /* enum */ h BREE;
    private final  int attackSpeed;

    private static void var3() {
        var1 = new int[13];
        h.var1[0] = -(0x94 ^ 0x9E);
        h.var1[1] = (31 + 57 - -1 + 79 ^ 94 + 47 - 64 + 74) & (42 + 20 - -5 + 120 ^ 74 + 52 - 6 + 12 ^ -1);
        h.var1[2] = 1;
        h.var1[3] = 0xFFFFFBFB & 0x1F76;
        h.var1[4] = 0x95 ^ 0x81 ^ (0x3A ^ 0x2B);
        h.var1[5] = 2;
        h.var1[6] = 3;
        h.var1[7] = -(0xFFFFE7DF & 0x3CA3) & (0xFFFFFFFF & 0x3FFF);
        h.var1[8] = 0x5B ^ 0x5F;
        h.var1[9] = 0xFFFF9EFB & 0x79EC;
        h.var1[10] = 0xBD ^ 0xBB;
        h.var1[11] = 0x92 ^ 0x81 ^ (0x19 ^ 0xD);
        h.var1[12] = 0x2C ^ 0x24;
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum3.class, string);
    }

    public String y() {
        return this.enemyName;
    }

    public int w() {
        return this.attackSpeed;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum3(String string2, int n3, int n4, Prayer prayer) {
        this.enemyName = string2;
        this.attackAnimation = n3;
        this.attackSpeed = n4;
        this.prayer = prayer;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var1[1];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var1[1];
        while (h.var4(var13, var12)) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private GameEnum3(String string2, Prayer prayer) {
        this(string2, var1[0], var1[0], prayer);
    }

    public int v() {
        return this.attackAnimation;
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    static {
        h.var3();
        h.var21();
        BREE = new GameEnum3(var2[var1[2]], var1[3], var1[4], Prayer.PROTECT_FROM_MISSILES);
        GROWLER = new GameEnum3(var2[var1[6]], var1[7], var1[4], Prayer.PROTECT_FROM_MAGIC);
        STARLIGHT = new GameEnum3(var2[var1[4]], var1[9], var1[4], Prayer.PROTECT_FROM_MELEE);
        THROWER_TROLL = new GameEnum3(var2[var1[11]], Prayer.PROTECT_FROM_MISSILES);
        h[] hArray = new h[var1[8]];
        hArray[h.var1[1]] = BREE;
        hArray[h.var1[2]] = GROWLER;
        hArray[h.var1[5]] = STARLIGHT;
        hArray[h.var1[6]] = THROWER_TROLL;
        $VALUES = hArray;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    public Prayer x() {
        return this.prayer;
    }

    private static void var21() {
        var2 = new String[var1[12]];
        h.var2[h.var1[1]] = "BREE";
        h.var2[h.var1[2]] = "Bree";
        h.var2[h.var1[5]] = "GROWLER";
        h.var2[h.var1[6]] = "Growler";
        h.var2[h.var1[8]] = "STARLIGHT";
        h.var2[h.var1[4]] = "Starlight";
        h.var2[h.var1[10]] = "THROWER_TROLL";
        h.var2[h.var1[11]] = "Thrower troll";
    }
}

