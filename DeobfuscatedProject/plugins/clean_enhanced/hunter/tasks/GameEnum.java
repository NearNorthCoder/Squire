/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.coords.RectangularArea
 */
package gg.squire.hunter.tasks;

import net.unethicalite.api.coords.RectangularArea;

public final class GameEnum
extends Enum<i> {
    
    private final  String name;
    private final  RectangularArea area;
    private static final  i[] $VALUES;
    public static final  /* enum */ i MOONLIGHT_ANTELOPE;
    
    public static final  /* enum */ i SUNLIGHT_ANTELOPE;

    public RectangularArea w() {
        return this.area;
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var2[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var2[0];
        while (i.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static void var14() {
        var1 = new String[var2[12]];
        i.var1[i.var2[0]] = "SUNLIGHT_ANTELOPE";
        i.var1[i.var2[1]] = "Sunlight antelope";
        i.var1[i.var2[6]] = "MOONLIGHT_ANTELOPE";
        i.var1[i.var2[7]] = "Moonlight antelope";
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private GameEnum(String string2, RectangularArea rectangularArea) {
        this.name = string2;
        this.area = rectangularArea;
    }

    private static void var21() {
        var2 = new int[14];
        i.var2[0] = (0xBA ^ 0xAB ^ (0xBA ^ 0xA2)) & (64 + 83 - 133 + 118 ^ 23 + 86 - 43 + 75 ^ -1);
        i.var2[1] = 1;
        i.var2[2] = -(0xFFFF9F41 & 0x70BF) & (0xFFFF96FE & 0x7FCF);
        i.var2[3] = -3 & (0xFFFFCFBF & 0x3BFF);
        i.var2[4] = 0xFFFF9FDF & 0x66FF;
        i.var2[5] = -(0xFFFFD5F6 & 0x6E3F) & (0xFFFFFFFD & 0x4FFF);
        i.var2[6] = 2;
        i.var2[7] = 3;
        i.var2[8] = -(0xFFFFFECA & 0x21BF) & (0xFFFFEF9B & 0x36FF);
        i.var2[9] = 0xFFFFFCEF & 0x27D6;
        i.var2[10] = -(117 + 35 - 115 + 93) & (0xFFFFBF9F & 0x46FF);
        i.var2[11] = -(0xFFFFCBAA & 0x757F) & (0xFFFFFDF9 & 0x67FF);
        i.var2[12] = 0xBB ^ 0x93 ^ (0x93 ^ 0xBF);
        i.var2[13] = 0x5D ^ 0x55;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    static {
        i.var21();
        i.var14();
        SUNLIGHT_ANTELOPE = new GameEnum(var1[var2[1]], new RectangularArea(var2[2], var2[3], var2[4], var2[5]));
        MOONLIGHT_ANTELOPE = new GameEnum(var1[var2[7]], new RectangularArea(var2[8], var2[9], var2[10], var2[11]));
        i[] iArray = new i[var2[6]];
        iArray[i.var2[0]] = SUNLIGHT_ANTELOPE;
        iArray[i.var2[1]] = MOONLIGHT_ANTELOPE;
        $VALUES = iArray;
    }

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public String v() {
        return this.name;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }
}

