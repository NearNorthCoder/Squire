/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.skilling.tasks;

public final class GameEnum14
extends Enum<m> {
    private static final  m[] $VALUES;
    public static final  /* enum */ m JADE;
    public static final  /* enum */ m SAPPHIRE;
    public static final  /* enum */ m AMETHYST;
    private final  int craftingOption;
    
    public static final  /* enum */ m RED_TOPAZ;
    private final  int materialID;
    public static final  /* enum */ m DRAGONSTONE;
    public static final  /* enum */ m DIAMOND;
    private final  int finishedID;
    public static final  /* enum */ m ZENYTE;
    public static final  /* enum */ m EMERALD;
    public static final  /* enum */ m ONYX;
    
    public static final  /* enum */ m RUBY;
    public static final  /* enum */ m OPAL;

    private static void var3() {
        var1 = new int[34];
        m.var1[0] = (0x66 ^ 0x2D) & ~(0x7E ^ 0x35);
        m.var1[1] = -(0xFFFFEB3F & 0x7DE7) & (0xFFFFEFFF & 0x7F7F);
        m.var1[2] = 0xFFFFB75D & 0x4EEB;
        m.var1[3] = 1;
        m.var1[4] = 0xFFFFD7DB & 0x2E7F;
        m.var1[5] = 0xFFFFD6EB & 0x2F5F;
        m.var1[6] = 2;
        m.var1[7] = 0xFFFFEF5F & 0x16FD;
        m.var1[8] = 0xFFFFAF7F & 0x56CD;
        m.var1[9] = 3;
        m.var1[10] = 0xFFFFD7F7 & 0x2E5F;
        m.var1[11] = -(0xFFFFFA6F & 0x5D99) & (0xFFFFFF5F & 0x5EEF);
        m.var1[12] = 71 + 88 - 46 + 22 ^ 63 + 56 - 4 + 16;
        m.var1[13] = -(0xFFFFBBB9 & 0x7D6F) & (0xFFFFFFFF & 0x3F7D);
        m.var1[14] = -(0xFFFFFC7F & 0x63BB) & (0xFFFFE77F & 0x7EFF);
        m.var1[15] = 0x7F ^ 0x7A;
        m.var1[16] = 0xFFFFA6D3 & 0x5F7F;
        m.var1[17] = 0xFFFFDEC7 & 0x277B;
        m.var1[18] = 0x78 ^ 0xE ^ (0xC2 ^ 0xB2);
        m.var1[19] = -(0x74 ^ 0x53) & (0xFFFFDE77 & 0x27FF);
        m.var1[20] = 0xFFFFEE59 & 0x17E7;
        m.var1[21] = 0x99 ^ 0xA4 ^ (0x2D ^ 0x17);
        m.var1[22] = 0xFFFFA7DF & 0x5E7F;
        m.var1[23] = -(0xFFFFBDB1 & 0x7B7F) & (0xFFFFFF7F & 0x3FFF);
        m.var1[24] = 0x80 ^ 0x88;
        m.var1[25] = 0xFFFFFBEB & 0x1DBF;
        m.var1[26] = 0xFFFFFFED & 0x19BF;
        m.var1[27] = 0x6E ^ 0x62 ^ (0x5D ^ 0x58);
        m.var1[28] = -(0xFFFFFC8F & 0x27FD) & (0xFFFFF7EF & Short.MAX_VALUE);
        m.var1[29] = -(0xFFFFDF25 & 0x22DB) & (0xFFFFFEFD & 0x67FF);
        m.var1[30] = 0x2D ^ 0x27;
        m.var1[31] = 0xFFFFDC3F & 0x6FE8;
        m.var1[32] = -(0xFFFFF7C3 & 0x28FD) & (0xFFFFFCFD & 0x6FE7);
        m.var1[33] = 0x25 ^ 0x2E;
    }

    private GameEnum14(int n3, int n4, int n5) {
        this.materialID = n3;
        this.finishedID = n4;
        this.craftingOption = n5;
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    static {
        m.var3();
        m.var5();
        OPAL = new GameEnum14(var1[1], var1[2], var1[3]);
        JADE = new GameEnum14(var1[4], var1[5], var1[3]);
        RED_TOPAZ = new GameEnum14(var1[7], var1[8], var1[3]);
        SAPPHIRE = new GameEnum14(var1[10], var1[11], var1[3]);
        EMERALD = new GameEnum14(var1[13], var1[14], var1[3]);
        RUBY = new GameEnum14(var1[16], var1[17], var1[3]);
        DIAMOND = new GameEnum14(var1[19], var1[20], var1[3]);
        DRAGONSTONE = new GameEnum14(var1[22], var1[23], var1[3]);
        ONYX = new GameEnum14(var1[25], var1[26], var1[3]);
        AMETHYST = new GameEnum14(var1[28], var1[29], var1[12]);
        ZENYTE = new GameEnum14(var1[31], var1[32], var1[3]);
        m[] mArray = new m[var1[33]];
        mArray[m.var1[0]] = OPAL;
        mArray[m.var1[3]] = JADE;
        mArray[m.var1[6]] = RED_TOPAZ;
        mArray[m.var1[9]] = SAPPHIRE;
        mArray[m.var1[12]] = EMERALD;
        mArray[m.var1[15]] = RUBY;
        mArray[m.var1[18]] = DIAMOND;
        mArray[m.var1[21]] = DRAGONSTONE;
        mArray[m.var1[24]] = ONYX;
        mArray[m.var1[27]] = AMETHYST;
        mArray[m.var1[30]] = ZENYTE;
        $VALUES = mArray;
    }

    private static void var5() {
        var2 = new String[var1[33]];
        m.var2[m.var1[0]] = "OPAL";
        m.var2[m.var1[3]] = "JADE";
        m.var2[m.var1[6]] = "RED_TOPAZ";
        m.var2[m.var1[9]] = "SAPPHIRE";
        m.var2[m.var1[12]] = "EMERALD";
        m.var2[m.var1[15]] = "RUBY";
        m.var2[m.var1[18]] = "DIAMOND";
        m.var2[m.var1[21]] = "DRAGONSTONE";
        m.var2[m.var1[24]] = "ONYX";
        m.var2[m.var1[27]] = "AMETHYST";
        m.var2[m.var1[30]] = "ZENYTE";
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    public static m valueOf(String string) {
        return Enum.valueOf(GameEnum14.class, string);
    }

    public static m[] values() {
        return (m[])$VALUES.clone();
    }

    public int C() {
        return this.craftingOption;
    }

    public int z() {
        return this.materialID;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var1[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var1[0];
        while (m.var4(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if (1 > 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    public int E() {
        return this.finishedID;
    }
}

