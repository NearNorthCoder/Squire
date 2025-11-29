/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.gauntlet.tasks;

public final class GameEnum4
extends Enum<d> {
    public static final  /* enum */ d DONE_EXPLORING_EVERYTHING;
    public static final  /* enum */ d EXTRA_FOOD_EXPLORE;
    public static final  /* enum */ d OUTSIDE;
    public static final  /* enum */ d FIRST_ROTATION_EXPLORE;
    public static final  /* enum */ d GIVE_UP;
    
    public static final  /* enum */ d BOSS_FIGHT;
    public static final  /* enum */ d PREPARE_BOSS_FIGHT;
    public static final  /* enum */ d FIRST_ROTATION_CREATE;
    public static final  /* enum */ d DEMI_BOSS_EXPLORE;
    
    public static final  /* enum */ d AFK;
    public static final  /* enum */ d CREATING_T3_STAFF;
    public static final  /* enum */ d WEAPON_FRAME_EXPLORE;
    private static final  d[] $VALUES;

    public String toString() {
        String string = super.toString();
        return string.charAt(var1[0]) + string.substring(var1[1]).replaceAll(var2[var1[0]], var2[var1[1]]).trim().toLowerCase();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum4.class, string);
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static void var9() {
        var2 = new String[var1[14]];
        d.var2[d.var1[0]] = "_";
        d.var2[d.var1[1]] = " ";
        d.var2[d.var1[2]] = "OUTSIDE";
        d.var2[d.var1[3]] = "GIVE_UP";
        d.var2[d.var1[4]] = "FIRST_ROTATION_EXPLORE";
        d.var2[d.var1[5]] = "FIRST_ROTATION_CREATE";
        d.var2[d.var1[6]] = "DEMI_BOSS_EXPLORE";
        d.var2[d.var1[7]] = "WEAPON_FRAME_EXPLORE";
        d.var2[d.var1[8]] = "PREPARE_BOSS_FIGHT";
        d.var2[d.var1[9]] = "EXTRA_FOOD_EXPLORE";
        d.var2[d.var1[10]] = "BOSS_FIGHT";
        d.var2[d.var1[11]] = "AFK";
        d.var2[d.var1[12]] = "DONE_EXPLORING_EVERYTHING";
        d.var2[d.var1[13]] = "CREATING_T3_STAFF";
    }

    private static boolean var10(int n2, int n3) {
        return n2 < n3;
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var1[0];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var1[0];
        while (d.var10(var19, var18)) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (-(0x6C ^ 0x69) < 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    private static void var21() {
        var1 = new int[15];
        d.var1[0] = (0xB9 ^ 0x92 ^ 51 + 37 - 23 + 62) & (82 + 33 - -106 + 24 ^ 92 + 108 - 51 + 12 ^ -1);
        d.var1[1] = 1;
        d.var1[2] = 2;
        d.var1[3] = 3;
        d.var1[4] = 1 ^ (0x58 ^ 0x5D);
        d.var1[5] = 0x52 ^ 0x57;
        d.var1[6] = 0xD0 ^ 0x98 ^ (0xDD ^ 0x93);
        d.var1[7] = 0x68 ^ 0x6F;
        d.var1[8] = 0x15 ^ 0x1D;
        d.var1[9] = 0x15 ^ 0x48 ^ (0xE2 ^ 0xB6);
        d.var1[10] = 0x57 ^ 0x3C ^ (0x5B ^ 0x3A);
        d.var1[11] = 0x93 ^ 0x98;
        d.var1[12] = 153 + 73 - 138 + 79 ^ 91 + 3 - -43 + 34;
        d.var1[13] = 0x5E ^ 0x35 ^ (0xE4 ^ 0x82);
        d.var1[14] = 0x4F ^ 0x41;
    }

    static {
        d.var21();
        d.var9();
        OUTSIDE = new GameEnum4();
        GIVE_UP = new GameEnum4();
        FIRST_ROTATION_EXPLORE = new GameEnum4();
        FIRST_ROTATION_CREATE = new GameEnum4();
        DEMI_BOSS_EXPLORE = new GameEnum4();
        WEAPON_FRAME_EXPLORE = new GameEnum4();
        PREPARE_BOSS_FIGHT = new GameEnum4();
        EXTRA_FOOD_EXPLORE = new GameEnum4();
        BOSS_FIGHT = new GameEnum4();
        AFK = new GameEnum4();
        DONE_EXPLORING_EVERYTHING = new GameEnum4();
        CREATING_T3_STAFF = new GameEnum4();
        d[] dArray = new d[var1[12]];
        dArray[d.var1[0]] = OUTSIDE;
        dArray[d.var1[1]] = GIVE_UP;
        dArray[d.var1[2]] = FIRST_ROTATION_EXPLORE;
        dArray[d.var1[3]] = FIRST_ROTATION_CREATE;
        dArray[d.var1[4]] = DEMI_BOSS_EXPLORE;
        dArray[d.var1[5]] = WEAPON_FRAME_EXPLORE;
        dArray[d.var1[6]] = PREPARE_BOSS_FIGHT;
        dArray[d.var1[7]] = EXTRA_FOOD_EXPLORE;
        dArray[d.var1[8]] = BOSS_FIGHT;
        dArray[d.var1[9]] = AFK;
        dArray[d.var1[10]] = DONE_EXPLORING_EVERYTHING;
        dArray[d.var1[11]] = CREATING_T3_STAFF;
        $VALUES = dArray;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }
}

