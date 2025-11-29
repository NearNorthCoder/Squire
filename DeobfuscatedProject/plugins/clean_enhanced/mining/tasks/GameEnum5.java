/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.mining.tasks;

public final class GameEnum5
extends Enum<a> {
     String activityName;
    public static final  /* enum */ a GRANITE;
    public static final  /* enum */ a BONE_SHARDS;
    public static final  /* enum */ a GEM_ROCKS;
    public static final  /* enum */ a ESSENCE;
    
    public static final  /* enum */ a VOLCANIC_ASH;
    public static final  /* enum */ a MOTHERLODE_MINE;
    public static final  /* enum */ a SUPERHEAT_MINE;
    public static final  /* enum */ a DAEYALT;
    public static final  /* enum */ a SANDSTONE;
    public static final  /* enum */ a AMETHYST;
    
    private static final  a[] $VALUES;
    public static final  /* enum */ a GUILD_IRON;
    public static final  /* enum */ a ARDY_IRON;

    public static a valueOf(String string) {
        return Enum.valueOf(GameEnum5.class, string);
    }

    static {
        a.var3();
        a.var4();
        MOTHERLODE_MINE = new GameEnum5(var2[var1[1]]);
        SANDSTONE = new GameEnum5(var2[var1[3]]);
        GEM_ROCKS = new GameEnum5(var2[var1[5]]);
        GUILD_IRON = new GameEnum5(var2[var1[7]]);
        ARDY_IRON = new GameEnum5(var2[var1[9]]);
        GRANITE = new GameEnum5(var2[var1[11]]);
        AMETHYST = new GameEnum5(var2[var1[13]]);
        VOLCANIC_ASH = new GameEnum5(var2[var1[15]]);
        SUPERHEAT_MINE = new GameEnum5(var2[var1[17]]);
        ESSENCE = new GameEnum5(var2[var1[19]]);
        DAEYALT = new GameEnum5(var2[var1[21]]);
        BONE_SHARDS = new GameEnum5(var2[var1[23]]);
        a[] aArray = new a[var1[12]];
        aArray[a.var1[0]] = MOTHERLODE_MINE;
        aArray[a.var1[1]] = SANDSTONE;
        aArray[a.var1[2]] = GEM_ROCKS;
        aArray[a.var1[3]] = GUILD_IRON;
        aArray[a.var1[4]] = ARDY_IRON;
        aArray[a.var1[5]] = GRANITE;
        aArray[a.var1[6]] = AMETHYST;
        aArray[a.var1[7]] = VOLCANIC_ASH;
        aArray[a.var1[8]] = SUPERHEAT_MINE;
        aArray[a.var1[9]] = ESSENCE;
        aArray[a.var1[10]] = DAEYALT;
        aArray[a.var1[11]] = BONE_SHARDS;
        $VALUES = aArray;
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    private static void var3() {
        var1 = new int[25];
        a.var1[0] = (73 + 118 - 79 + 84 ^ 2 + 34 - -61 + 46) & (0x57 ^ 0x23 ^ (0x9E ^ 0xA1) ^ -1);
        a.var1[1] = 1;
        a.var1[2] = 2;
        a.var1[3] = 3;
        a.var1[4] = 0x9F ^ 0x9B;
        a.var1[5] = 0x58 ^ 0x5D;
        a.var1[6] = 0x8A ^ 0x8C;
        a.var1[7] = 0xC ^ 0xB;
        a.var1[8] = 157 + 23 - 19 + 28 ^ 143 + 8 - -19 + 11;
        a.var1[9] = 2 ^ (0x1D ^ 0x16);
        a.var1[10] = 0x6E ^ 0x12 ^ (0x38 ^ 0x4E);
        a.var1[11] = 0x76 ^ 0x7D;
        a.var1[12] = 98 + 137 - 162 + 70 ^ 48 + 27 - -25 + 31;
        a.var1[13] = 0x42 ^ 0x7B ^ (0x4C ^ 0x78);
        a.var1[14] = 149 + 76 - 200 + 127 ^ 145 + 121 - 119 + 3;
        a.var1[15] = 0xA2 ^ 0xAD;
        a.var1[16] = 0xAC ^ 0xBC;
        a.var1[17] = 0x97 ^ 0x86;
        a.var1[18] = 73 + 43 - -60 + 0 ^ 138 + 81 - 208 + 151;
        a.var1[19] = 0x56 ^ 0x45;
        a.var1[20] = 0x14 ^ 0x44 ^ (0xC7 ^ 0x83);
        a.var1[21] = 0xA9 ^ 0xBC;
        a.var1[22] = 0x57 ^ 0x41;
        a.var1[23] = 0x72 ^ 0x65;
        a.var1[24] = 0x48 ^ 0x50;
    }

    public String c() {
        return this.activityName;
    }

    private static void var4() {
        var2 = new String[var1[24]];
        a.var2[a.var1[0]] = "MOTHERLODE_MINE";
        a.var2[a.var1[1]] = "Motherlode_Mine";
        a.var2[a.var1[2]] = "SANDSTONE";
        a.var2[a.var1[3]] = "Sandstone";
        a.var2[a.var1[4]] = "GEM_ROCKS";
        a.var2[a.var1[5]] = "Gem rocks";
        a.var2[a.var1[6]] = "GUILD_IRON";
        a.var2[a.var1[7]] = "Guild iron";
        a.var2[a.var1[8]] = "ARDY_IRON";
        a.var2[a.var1[9]] = "Ardy iron (3t)";
        a.var2[a.var1[10]] = "GRANITE";
        a.var2[a.var1[11]] = "Granite";
        a.var2[a.var1[12]] = "AMETHYST";
        a.var2[a.var1[13]] = "Amethyst";
        a.var2[a.var1[14]] = "VOLCANIC_ASH";
        a.var2[a.var1[15]] = "Volcanic ash";
        a.var2[a.var1[16]] = "SUPERHEAT_MINE";
        a.var2[a.var1[17]] = "Superheat Mine";
        a.var2[a.var1[18]] = "ESSENCE";
        a.var2[a.var1[19]] = "Essence mine";
        a.var2[a.var1[20]] = "DAEYALT";
        a.var2[a.var1[21]] = "Daeyalt Essence";
        a.var2[a.var1[22]] = "BONE_SHARDS";
        a.var2[a.var1[23]] = "Bone shards";
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private GameEnum5(String string2) {
        this.activityName = string2;
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var1[0];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var1[0];
        while (a.var11(var26, var25)) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var21);
    }
}

