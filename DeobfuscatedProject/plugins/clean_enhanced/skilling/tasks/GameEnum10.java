/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.skilling.tasks;

public final class GameEnum10
extends Enum<c> {
    private final  int requiredToMake;
    public static final  /* enum */ c BLUE_DHIDE_CHAPS;
    
    public static final  /* enum */ c RED_DHIDE_VAMBRACES;
    private final  String name;
    private final  int level;
    public static final  /* enum */ c GREEN_DHIDE_BODY;
    
    public static final  /* enum */ c BLACK_DHIDE_CHAPS;
    private static final  c[] $VALUES;
    private final  int amountToWithdraw;
    public static final  /* enum */ c RED_DHIDE_CHAPS;
    public static final  /* enum */ c BLUE_DHIDE_BODY;
    public static final  /* enum */ c GREEN_DHIDE_VAMBRACES;
    public static final  /* enum */ c BLACK_DHIDE_BODY;
    public static final  /* enum */ c GREEN_DHIDE_CHAPS;
    public static final  /* enum */ c BLACK_DHIDE_VAMBRACES;
    public static final  /* enum */ c BLUE_DHIDE_VAMBRACES;
    public static final  /* enum */ c RED_DHIDE_BODY;
    private final  int materials;

    public int m() {
        return this.amountToWithdraw;
    }

    private static void var3() {
        var2 = new int[41];
        c.var2[0] = (0 ^ 0x39) & ~(0xE ^ 0x37);
        c.var2[1] = 1;
        c.var2[2] = 0x63 ^ 0x5A;
        c.var2[3] = -(0xFFFFFDFF & 0x6B2D) & (0xFFFFEFFF & 0x7FFD);
        c.var2[4] = 0x22 ^ 0x38;
        c.var2[5] = 2;
        c.var2[6] = 3;
        c.var2[7] = 0x24 ^ 0x74 ^ (0x17 ^ 0x7B);
        c.var2[8] = 0x50 ^ 0x54;
        c.var2[9] = 0x7B ^ 9 ^ (0xD6 ^ 0xA1);
        c.var2[10] = 0xB9 ^ 0x86;
        c.var2[11] = 0x84 ^ 0x9C;
        c.var2[12] = 0x42 ^ 0x44;
        c.var2[13] = 0x7B ^ 0x7C;
        c.var2[14] = 0x23 ^ 0x61;
        c.var2[15] = 0xFFFFB9EF & 0x4FD9;
        c.var2[16] = 0x56 ^ 0x5A ^ (0x10 ^ 0x14);
        c.var2[17] = 0x9A ^ 0xAA ^ (0xB4 ^ 0x8D);
        c.var2[18] = 9 + 216 - 146 + 163 ^ 154 + 76 - 221 + 173;
        c.var2[19] = 0xCE ^ 0xC4;
        c.var2[20] = 87 + 116 - 150 + 83 ^ 114 + 51 - 130 + 96;
        c.var2[21] = 0xA5 ^ 0xA9;
        c.var2[22] = 0x86 ^ 0x8B ^ (0x2A ^ 0xB) & ~(0x13 ^ 0x32);
        c.var2[23] = 20 + 50 - -88 + 81 ^ 149 + 52 - 172 + 137;
        c.var2[24] = 0xFFFFA9CF & 0x5FFB;
        c.var2[25] = 0x2A ^ 0x24;
        c.var2[26] = 0x64 ^ 0x5A ^ (0x59 ^ 0x68);
        c.var2[27] = 0x21 ^ 0x6A;
        c.var2[28] = 0x40 ^ 0x20 ^ (0x4D ^ 0x3D);
        c.var2[29] = 0x20 ^ 0x31;
        c.var2[30] = 0x70 ^ 0x3A ^ (0x78 ^ 0x7F);
        c.var2[31] = 0xB6 ^ 0xA4;
        c.var2[32] = 110 + 3 - 41 + 115 ^ 4 + 85 - -70 + 9;
        c.var2[33] = 0xCE ^ 0xBD ^ (0x15 ^ 0x29);
        c.var2[34] = 0xFFFFD9DD & 0x2FEF;
        c.var2[35] = 0x55 ^ 0x41;
        c.var2[36] = 0xFF ^ 0xC7 ^ (0x3C ^ 0x11);
        c.var2[37] = 0x61 ^ 0x33;
        c.var2[38] = 134 + 82 - 118 + 43 ^ 148 + 72 - 124 + 59;
        c.var2[39] = 0x60 ^ 0x77;
        c.var2[40] = 0xBC ^ 0xA2 ^ (0xC3 ^ 0x89);
    }

    public int l() {
        return this.materials;
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum10(String string2, int n3, int n4, int n5, int n6) {
        this.name = string2;
        this.level = n3;
        this.materials = n4;
        this.amountToWithdraw = n5;
        this.requiredToMake = n6;
    }

    public int n() {
        return this.requiredToMake;
    }

    static {
        c.var3();
        c.var5();
        GREEN_DHIDE_VAMBRACES = new GameEnum10(var1[var2[1]], var2[2], var2[3], var2[4], var2[1]);
        GREEN_DHIDE_CHAPS = new GameEnum10(var1[var2[6]], var2[7], var2[3], var2[4], var2[5]);
        GREEN_DHIDE_BODY = new GameEnum10(var1[var2[9]], var2[10], var2[3], var2[11], var2[6]);
        BLUE_DHIDE_VAMBRACES = new GameEnum10(var1[var2[13]], var2[14], var2[15], var2[4], var2[1]);
        BLUE_DHIDE_CHAPS = new GameEnum10(var1[var2[17]], var2[18], var2[15], var2[4], var2[5]);
        BLUE_DHIDE_BODY = new GameEnum10(var1[var2[20]], var2[10], var2[15], var2[11], var2[6]);
        RED_DHIDE_VAMBRACES = new GameEnum10(var1[var2[22]], var2[23], var2[24], var2[4], var2[1]);
        RED_DHIDE_CHAPS = new GameEnum10(var1[var2[26]], var2[27], var2[24], var2[4], var2[5]);
        RED_DHIDE_BODY = new GameEnum10(var1[var2[29]], var2[30], var2[24], var2[11], var2[6]);
        BLACK_DHIDE_VAMBRACES = new GameEnum10(var1[var2[32]], var2[33], var2[34], var2[4], var2[1]);
        BLACK_DHIDE_CHAPS = new GameEnum10(var1[var2[36]], var2[37], var2[34], var2[4], var2[5]);
        BLACK_DHIDE_BODY = new GameEnum10(var1[var2[39]], var2[40], var2[34], var2[11], var2[6]);
        c[] cArray = new c[var2[21]];
        cArray[c.var2[0]] = GREEN_DHIDE_VAMBRACES;
        cArray[c.var2[1]] = GREEN_DHIDE_CHAPS;
        cArray[c.var2[5]] = GREEN_DHIDE_BODY;
        cArray[c.var2[6]] = BLUE_DHIDE_VAMBRACES;
        cArray[c.var2[8]] = BLUE_DHIDE_CHAPS;
        cArray[c.var2[9]] = BLUE_DHIDE_BODY;
        cArray[c.var2[12]] = RED_DHIDE_VAMBRACES;
        cArray[c.var2[13]] = RED_DHIDE_CHAPS;
        cArray[c.var2[16]] = RED_DHIDE_BODY;
        cArray[c.var2[17]] = BLACK_DHIDE_VAMBRACES;
        cArray[c.var2[19]] = BLACK_DHIDE_CHAPS;
        cArray[c.var2[20]] = BLACK_DHIDE_BODY;
        $VALUES = cArray;
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var2[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var2[0];
        while (c.var4(var14, var13)) {
            char var15 = var12[var14];
            var9.append((char)(var15 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if (2 != ((165 + 98 - 146 + 68 ^ 124 + 141 - 166 + 76) & (0x6A ^ 0x42 ^ (0x68 ^ 0x56) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static void var5() {
        var1 = new String[var2[11]];
        c.var1[c.var2[0]] = "GREEN_DHIDE_VAMBRACES";
        c.var1[c.var2[1]] = "Green d'hide vambraces";
        c.var1[c.var2[5]] = "GREEN_DHIDE_CHAPS";
        c.var1[c.var2[6]] = "Green d'hide chaps";
        c.var1[c.var2[8]] = "GREEN_DHIDE_BODY";
        c.var1[c.var2[9]] = "Green d'hide body";
        c.var1[c.var2[12]] = "BLUE_DHIDE_VAMBRACES";
        c.var1[c.var2[13]] = "Blue d'hide vambraces";
        c.var1[c.var2[16]] = "BLUE_DHIDE_CHAPS";
        c.var1[c.var2[17]] = "Blue d'hide chaps";
        c.var1[c.var2[19]] = "BLUE_DHIDE_BODY";
        c.var1[c.var2[20]] = "Blue d'hide body";
        c.var1[c.var2[21]] = "RED_DHIDE_VAMBRACES";
        c.var1[c.var2[22]] = "Red d'hide vambraces";
        c.var1[c.var2[25]] = "RED_DHIDE_CHAPS";
        c.var1[c.var2[26]] = "Red d'hide chaps";
        c.var1[c.var2[28]] = "RED_DHIDE_BODY";
        c.var1[c.var2[29]] = "Red d'hide body";
        c.var1[c.var2[31]] = "BLACK_DHIDE_VAMBRACES";
        c.var1[c.var2[32]] = "Black d'hide vambraces";
        c.var1[c.var2[35]] = "BLACK_DHIDE_CHAPS";
        c.var1[c.var2[36]] = "Black d'hide chaps";
        c.var1[c.var2[38]] = "BLACK_DHIDE_BODY";
        c.var1[c.var2[39]] = "Black d'hide body";
    }

    public String j() {
        return this.name;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    public int k() {
        return this.level;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum10.class, string);
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }
}

