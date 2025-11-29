/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.barrows.tasks;

public final class GameEnum
extends Enum<e> {
    private final  String npcName;
    private static final  e[] $VALUES;
    public static final  /* enum */ e CRYPT_SPIDER;
    
    private final  int potential;
    public static final  /* enum */ e CRYPT_RAT;
    public static final  /* enum */ e GIANT_CRYPT_SPIDER;
    public static final  /* enum */ e GIANT_CRYPT_RAT;
    public static final  /* enum */ e SKELETON;
    
    public static final  /* enum */ e BLOODWORM;

    private GameEnum(int n3, String string2) {
        this.potential = n3;
        this.npcName = string2;
    }

    public String H() {
        return this.npcName;
    }

    private static void var3() {
        var1 = new int[19];
        e.var1[0] = (0x5B ^ 0x75 ^ (0xB4 ^ 0x8C)) & (0xF4 ^ 0xC4 ^ (0x6D ^ 0x4B) ^ -1);
        e.var1[1] = 127 + 148 - 272 + 172 ^ 90 + 79 - 74 + 37;
        e.var1[2] = 1;
        e.var1[3] = 2;
        e.var1[4] = 0xA7 ^ 0x93;
        e.var1[5] = 3;
        e.var1[6] = 0x35 ^ 0x31;
        e.var1[7] = 0xA0 ^ 0x98;
        e.var1[8] = 0x3E ^ 0xB ^ (0x34 ^ 4);
        e.var1[9] = 126 + 89 - 121 + 99 ^ 13 + 74 - 23 + 135;
        e.var1[10] = 0x74 ^ 0x38;
        e.var1[11] = 0x71 ^ 0x76;
        e.var1[12] = 0xC5 ^ 0x9D ^ (0x15 ^ 0x45);
        e.var1[13] = 0x3F ^ 0x71 ^ 3;
        e.var1[14] = 0xBF ^ 0xB8 ^ (0x6A ^ 0x64);
        e.var1[15] = 123 + 87 - 36 + 29 ^ 94 + 158 - 119 + 60;
        e.var1[16] = 0xCA ^ 0xB2 ^ (0x17 ^ 0x20);
        e.var1[17] = 0x1F ^ 0x14;
        e.var1[18] = 0x21 ^ 0x64 ^ (0x7D ^ 0x34);
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    public int G() {
        return this.potential;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var1[0];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var1[0];
        while (e.var4(var19, var18)) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (2 >= ((0x41 ^ 0x46) & ~(0x51 ^ 0x56))) continue;
            return null;
        }
        return String.valueOf(var14);
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    static {
        e.var3();
        e.var27();
        CRYPT_RAT = new GameEnum(var1[1], var2[var1[2]]);
        BLOODWORM = new GameEnum(var1[4], var2[var1[5]]);
        CRYPT_SPIDER = new GameEnum(var1[7], var2[var1[8]]);
        GIANT_CRYPT_RAT = new GameEnum(var1[10], var2[var1[11]]);
        SKELETON = new GameEnum(var1[13], var2[var1[14]]);
        GIANT_CRYPT_SPIDER = new GameEnum(var1[16], var2[var1[17]]);
        e[] eArray = new e[var1[9]];
        eArray[e.var1[0]] = CRYPT_RAT;
        eArray[e.var1[2]] = BLOODWORM;
        eArray[e.var1[3]] = CRYPT_SPIDER;
        eArray[e.var1[5]] = GIANT_CRYPT_RAT;
        eArray[e.var1[6]] = SKELETON;
        eArray[e.var1[8]] = GIANT_CRYPT_SPIDER;
        $VALUES = eArray;
    }

    private static void var27() {
        var2 = new String[var1[18]];
        e.var2[e.var1[0]] = "CRYPT_RAT";
        e.var2[e.var1[2]] = "Crypt rat";
        e.var2[e.var1[3]] = "BLOODWORM";
        e.var2[e.var1[5]] = "Bloodworm";
        e.var2[e.var1[6]] = "CRYPT_SPIDER";
        e.var2[e.var1[8]] = "Crypt spider";
        e.var2[e.var1[9]] = "GIANT_CRYPT_RAT";
        e.var2[e.var1[11]] = "Giant crypt rat";
        e.var2[e.var1[12]] = "SKELETON";
        e.var2[e.var1[14]] = "Skeleton";
        e.var2[e.var1[15]] = "GIANT_CRYPT_SPIDER";
        e.var2[e.var1[17]] = "Giant crypt spider";
    }
}

