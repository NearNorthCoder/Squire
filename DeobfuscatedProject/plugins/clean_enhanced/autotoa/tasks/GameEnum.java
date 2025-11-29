/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

final class GameEnum
extends Enum<bs> {
    private static final  bs[] $VALUES;
    private final  int value;
    public static final  /* enum */ bs TRIANGLE;
    public static final  /* enum */ bs WIGGLE;
    private final  int groundObjectId;
    public static final  /* enum */ bs DIAMOND;
    public static final  /* enum */ bs LINE;
    public static final  /* enum */ bs BIRD;
    
    public static final  /* enum */ bs KNIVES;
    
    private final  int gameObjectId;
    public static final  /* enum */ bs HAND;
    public static final  /* enum */ bs CROOK;
    public static final  /* enum */ bs FOOT;

    public static bs[] values() {
        return (bs[])$VALUES.clone();
    }

    static {
        bs.var3();
        bs.var4();
        LINE = new GameEnum(var1[1], var1[2], var1[3]);
        KNIVES = new GameEnum(var1[4], var1[5], var1[6]);
        TRIANGLE = new GameEnum(var1[7], var1[8], var1[9]);
        DIAMOND = new GameEnum(var1[10], var1[11], var1[12]);
        HAND = new GameEnum(var1[13], var1[14], var1[15]);
        BIRD = new GameEnum(var1[16], var1[17], var1[18]);
        CROOK = new GameEnum(var1[19], var1[20], var1[21]);
        WIGGLE = new GameEnum(var1[22], var1[23], var1[24]);
        FOOT = new GameEnum(var1[25], var1[26], var1[27]);
        bs[] bsArray = new bs[var1[25]];
        bsArray[bs.var1[0]] = LINE;
        bsArray[bs.var1[1]] = KNIVES;
        bsArray[bs.var1[4]] = TRIANGLE;
        bsArray[bs.var1[7]] = DIAMOND;
        bsArray[bs.var1[10]] = HAND;
        bsArray[bs.var1[13]] = BIRD;
        bsArray[bs.var1[16]] = CROOK;
        bsArray[bs.var1[19]] = WIGGLE;
        bsArray[bs.var1[22]] = FOOT;
        $VALUES = bsArray;
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    public static bs valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var1[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var1[0];
        while (bs.var5(var14, var13)) {
            char var15 = var12[var14];
            var9.append((char)(var15 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if ((0x85 ^ 0xA8 ^ (0x65 ^ 0x4C)) != 3) continue;
            return null;
        }
        return String.valueOf(var9);
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static void var4() {
        var2 = new String[var1[25]];
        bs.var2[bs.var1[0]] = "LINE";
        bs.var2[bs.var1[1]] = "KNIVES";
        bs.var2[bs.var1[4]] = "TRIANGLE";
        bs.var2[bs.var1[7]] = "DIAMOND";
        bs.var2[bs.var1[10]] = "HAND";
        bs.var2[bs.var1[13]] = "BIRD";
        bs.var2[bs.var1[16]] = "CROOK";
        bs.var2[bs.var1[19]] = "WIGGLE";
        bs.var2[bs.var1[22]] = "FOOT";
    }

    public int ci() {
        return this.gameObjectId;
    }

    public int cg() {
        return this.value;
    }

    private static void var3() {
        var1 = new int[28];
        bs.var1[0] = (0x7C ^ 0x63 ^ (0x66 ^ 0x3E)) & (0x15 ^ 0x72 ^ (0x84 ^ 0xA4) ^ -1);
        bs.var1[1] = 1;
        bs.var1[2] = -(0xFFFFFFDF & 0x4CFD) & (0xFFFFFDFD & 0xFFFF);
        bs.var1[3] = 0xFFFFF17E & 0xBFCD;
        bs.var1[4] = 2;
        bs.var1[5] = -(0xFFFF8EDD & 0x7F7B) & (0xFFFFFFFB & 0xBF7E);
        bs.var1[6] = -(0xFFFFC6F7 & 0x7FBB) & (0xFFFFFFFF & 0xF7FF);
        bs.var1[7] = 3;
        bs.var1[8] = 0xFFFFFDA3 & 0xB37F;
        bs.var1[9] = 0xFFFFB1EF & 0xFF5E;
        bs.var1[10] = 0x20 ^ 0x24;
        bs.var1[11] = -(0xFFFFDCDB & 0x676E) & (0xFFFFFF7D & 0xF5EF);
        bs.var1[12] = 0xFFFFF3EF & 0xBD5F;
        bs.var1[13] = 176 + 121 - 142 + 22 ^ 17 + 67 - -3 + 93;
        bs.var1[14] = -(0xFFFFC5D3 & 0x7EFD) & (0xFFFFFFFF & 0xF5F5);
        bs.var1[15] = -(0xFFFFD4C6 & 0x6BBD) & (0xFFFFFDD7 & 0xF3FB);
        bs.var1[16] = 0x35 ^ 0x33;
        bs.var1[17] = 0xFFFFFDAF & 0xB376;
        bs.var1[18] = -(0xFFFF9FAD & 0x68FF) & (0xFFFFBFFF & 0xF9FD);
        bs.var1[19] = 0x20 ^ 0x52 ^ (0x3A ^ 0x4F);
        bs.var1[20] = 0xFFFFF977 & 0xB7AF;
        bs.var1[21] = 0xFFFFBF7A & 0xF1CF;
        bs.var1[22] = 0x5C ^ 0x54;
        bs.var1[23] = -(0xFFFFFC36 & 0xBDB) & (0xFFFFBBBD & 0xFD7B);
        bs.var1[24] = 0xFFFFF1F6 & 0xBF5B;
        bs.var1[25] = 106 + 43 - 24 + 9 ^ 142 + 76 - 206 + 131;
        bs.var1[26] = 0xFFFFB32D & 0xFDFB;
        bs.var1[27] = -1 & (0xFFFFF37B & 0xBDD7);
    }

    public int ch() {
        return this.groundObjectId;
    }

    private GameEnum(int n3, int n4, int n5) {
        this.value = n3;
        this.groundObjectId = n4;
        this.gameObjectId = n5;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }
}

