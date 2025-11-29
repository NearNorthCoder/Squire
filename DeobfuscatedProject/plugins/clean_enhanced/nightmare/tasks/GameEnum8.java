/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.nightmare.tasks;

public final class GameEnum8
extends Enum<y> {
    public static final  /* enum */ y CRYSTAL_HALBERD;
    public static final  /* enum */ y NONE;
    private static final  y[] $VALUES;
    public static final  /* enum */ y OSMUMTENS_FANG;
    public static final  /* enum */ y ARMADYL_GODSWORD;
    private final  boolean twoHanded;
    public static final  /* enum */ y BANDOS_GODSWORD;
    public static final  /* enum */ y ANCIENT_GODSWORD;
    public static final  /* enum */ y DRAGON_MACE;
    private final  int itemID;
    private final  int specAmount;
    
    public static final  /* enum */ y VOID_WAKER;
    public static final  /* enum */ y DRAGON_WARHAMMER;
    public static final  /* enum */ y GRANITE_MAUL;
    public static final  /* enum */ y DRAGON_CLAWS;
    public static final  /* enum */ y SARADOMIN_GODSWORD;

    static {
        y.var3();
        y.var4();
        GRANITE_MAUL = new GameEnum8(var1[1], var1[2], var1[3]);
        DRAGON_CLAWS = new GameEnum8(var1[4], var1[2], var1[3]);
        VOID_WAKER = new GameEnum8(var1[6], var1[2], var1[0]);
        ANCIENT_GODSWORD = new GameEnum8(var1[8], var1[2], var1[3]);
        DRAGON_MACE = new GameEnum8(var1[10], var1[11], var1[0]);
        OSMUMTENS_FANG = new GameEnum8(var1[13], var1[11], var1[0]);
        SARADOMIN_GODSWORD = new GameEnum8(var1[15], var1[2], var1[3]);
        DRAGON_WARHAMMER = new GameEnum8(var1[17], var1[2], var1[0]);
        ARMADYL_GODSWORD = new GameEnum8(var1[19], var1[2], var1[3]);
        BANDOS_GODSWORD = new GameEnum8(var1[21], var1[2], var1[3]);
        CRYSTAL_HALBERD = new GameEnum8(var1[23], var1[24], var1[3]);
        NONE = new GameEnum8(var1[26], var1[0], var1[0]);
        y[] yArray = new y[var1[27]];
        yArray[y.var1[0]] = GRANITE_MAUL;
        yArray[y.var1[3]] = DRAGON_CLAWS;
        yArray[y.var1[5]] = VOID_WAKER;
        yArray[y.var1[7]] = ANCIENT_GODSWORD;
        yArray[y.var1[9]] = DRAGON_MACE;
        yArray[y.var1[12]] = OSMUMTENS_FANG;
        yArray[y.var1[14]] = SARADOMIN_GODSWORD;
        yArray[y.var1[16]] = DRAGON_WARHAMMER;
        yArray[y.var1[18]] = ARMADYL_GODSWORD;
        yArray[y.var1[20]] = BANDOS_GODSWORD;
        yArray[y.var1[22]] = CRYSTAL_HALBERD;
        yArray[y.var1[25]] = NONE;
        $VALUES = yArray;
    }

    private static void var4() {
        var2 = new String[var1[27]];
        y.var2[y.var1[0]] = "GRANITE_MAUL";
        y.var2[y.var1[3]] = "DRAGON_CLAWS";
        y.var2[y.var1[5]] = "VOID_WAKER";
        y.var2[y.var1[7]] = "ANCIENT_GODSWORD";
        y.var2[y.var1[9]] = "DRAGON_MACE";
        y.var2[y.var1[12]] = "OSMUMTENS_FANG";
        y.var2[y.var1[14]] = "SARADOMIN_GODSWORD";
        y.var2[y.var1[16]] = "DRAGON_WARHAMMER";
        y.var2[y.var1[18]] = "ARMADYL_GODSWORD";
        y.var2[y.var1[20]] = "BANDOS_GODSWORD";
        y.var2[y.var1[22]] = "CRYSTAL_HALBERD";
        y.var2[y.var1[25]] = "NONE";
    }

    private GameEnum8(int n3, int n4, boolean bl) {
        this.itemID = n3;
        this.specAmount = n4;
        this.twoHanded = bl;
    }

    public int bH() {
        return this.itemID;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

    public boolean bR() {
        return this.twoHanded;
    }

    public static y[] values() {
        return (y[])$VALUES.clone();
    }

    private static void var3() {
        var1 = new int[28];
        y.var1[0] = (28 + 176 - 160 + 147 ^ 72 + 36 - 91 + 145) & (0x59 ^ 0x17 ^ (0x95 ^ 0xC6) ^ -1);
        y.var1[1] = 0xFFFFDFE7 & 0x7EB9;
        y.var1[2] = 0x7C ^ 0x4E;
        y.var1[3] = 1;
        y.var1[4] = 0xFFFFF57C & 0x3FD7;
        y.var1[5] = 2;
        y.var1[6] = 0xFFFFEF6A & 0x7CBF;
        y.var1[7] = 3;
        y.var1[8] = -(0xFFFFDDB7 & 0x3A4D) & (0xFFFFFF7D & 0x7EFF);
        y.var1[9] = 0xF ^ 0xB;
        y.var1[10] = 0xFFFF95FE & 0x6F9B;
        y.var1[11] = 61 + 36 - -6 + 29 ^ 107 + 70 - 46 + 26;
        y.var1[12] = 0xA6 ^ 0xA3;
        y.var1[13] = 0xFFFFEE6F & 0x77FB;
        y.var1[14] = 0x89 ^ 0x8F;
        y.var1[15] = -(0xFFFFEDEF & 0x1371) & (0xFFFFEF7E & 0x3FFF);
        y.var1[16] = 96 + 103 - 123 + 102 ^ 58 + 7 - -102 + 14;
        y.var1[17] = -(0xFFFF8E74 & 0x7BEF) & (0xFFFFFFEB & 0x3F7F);
        y.var1[18] = 0x14 ^ 0x1C;
        y.var1[19] = 0xFFFFFF3A & 0x2EDF;
        y.var1[20] = 0xC0 ^ 0xB7 ^ (0x32 ^ 0x4C);
        y.var1[21] = 0xFFFFEF9E & 0x3E7D;
        y.var1[22] = 110 + 130 - 141 + 41 ^ 84 + 101 - 130 + 79;
        y.var1[23] = -(0xFFFFB3DD & 0x4E2B) & (0xFFFFDFBF & 0x7FFB);
        y.var1[24] = 0xD2 ^ 0xB9 ^ (0xDE ^ 0xAB);
        y.var1[25] = 1 ^ 0xA;
        y.var1[26] = -1;
        y.var1[27] = 0x8C ^ 0x80;
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    public static y valueOf(String string) {
        return Enum.valueOf(GameEnum8.class, string);
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var1[0];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var1[0];
        while (y.var11(var26, var25)) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if (((0x9C ^ 0x9B ^ (0x63 ^ 0x47)) & (0x2D ^ 0x3B ^ (0x21 ^ 0x14) ^ -1)) >= 0) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    public int bQ() {
        return this.specAmount;
    }
}

