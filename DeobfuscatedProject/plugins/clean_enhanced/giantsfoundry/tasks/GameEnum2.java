/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.giantsfoundry.tasks;

public final class GameEnum2
extends Enum<c> {
    private static final  c[] $VALUES;
    public static final  /* enum */ c ADAMANT_BAR;
    
    private final  int productionSetting;
    public static final  /* enum */ c IRON_BAR;
    public static final  /* enum */ c BRONZE_BAR;
    private final  int itemId;
    public static final  /* enum */ c RUNE_BAR;
    
    public static final  /* enum */ c MITHRIL_BAR;
    public static final  /* enum */ c STEEL_BAR;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var1[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var1[0];
        while (c.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (((0xE ^ 0x30) & ~(0x77 ^ 0x49)) == ((0x71 ^ 0x66) & ~(0x66 ^ 0x71))) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

    public int w() {
        return this.productionSetting;
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static void var20() {
        var2 = new String[var1[12]];
        c.var2[c.var1[0]] = "BRONZE_BAR";
        c.var2[c.var1[2]] = "IRON_BAR";
        c.var2[c.var1[4]] = "STEEL_BAR";
        c.var2[c.var1[6]] = "MITHRIL_BAR";
        c.var2[c.var1[8]] = "ADAMANT_BAR";
        c.var2[c.var1[10]] = "RUNE_BAR";
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    static {
        c.var27();
        c.var20();
        BRONZE_BAR = new GameEnum2(var1[1], var1[2]);
        IRON_BAR = new GameEnum2(var1[3], var1[4]);
        STEEL_BAR = new GameEnum2(var1[5], var1[6]);
        MITHRIL_BAR = new GameEnum2(var1[7], var1[8]);
        ADAMANT_BAR = new GameEnum2(var1[9], var1[10]);
        RUNE_BAR = new GameEnum2(var1[11], var1[12]);
        c[] cArray = new c[var1[12]];
        cArray[c.var1[0]] = BRONZE_BAR;
        cArray[c.var1[2]] = IRON_BAR;
        cArray[c.var1[4]] = STEEL_BAR;
        cArray[c.var1[6]] = MITHRIL_BAR;
        cArray[c.var1[8]] = ADAMANT_BAR;
        cArray[c.var1[10]] = RUNE_BAR;
        $VALUES = cArray;
    }

    private static void var27() {
        var1 = new int[14];
        c.var1[0] = (0x84 ^ 0x92) & ~(0xA ^ 0x1C);
        c.var1[1] = 0xFFFFDD2D & 0x2BFF;
        c.var1[2] = 1;
        c.var1[3] = -(0xFFFFA7C1 & 0x7EFF) & (0xFFFFBFEF & 0x6FFF);
        c.var1[4] = 2;
        c.var1[5] = -(0xFFFFEB5F & 0x56A3) & (0xFFFFDFBB & 0x6B77);
        c.var1[6] = 3;
        c.var1[7] = -(0xFFFFD657 & 0x7FE9) & (0xFFFFDF77 & Short.MAX_VALUE);
        c.var1[8] = 0x5E ^ 0x5A;
        c.var1[9] = -(0xFFFFC767 & 0x7E9D) & (0xFFFFFFBF & 0x4F7D);
        c.var1[10] = 0x6A ^ 0x16 ^ (9 ^ 0x70);
        c.var1[11] = -(0xFFFFFED3 & 0x35AD) & (0xFFFFBDBB & Short.MAX_VALUE);
        c.var1[12] = 0x35 ^ 0x33;
        c.var1[13] = 0x51 ^ 0x5E ^ (0x4D ^ 0x4A);
    }

    public int v() {
        return this.itemId;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum2(int n3, int n4) {
        this.itemId = n3;
        this.productionSetting = n4;
    }
}

