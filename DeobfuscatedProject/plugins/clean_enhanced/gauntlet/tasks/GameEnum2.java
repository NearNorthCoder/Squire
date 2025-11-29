/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.gauntlet.tasks;

import net.runelite.api.Prayer;

public final class GameEnum2
extends Enum<k> {
    public static final  /* enum */ k NONE;
    public static final  /* enum */ k RIGOUR;
    public static final  /* enum */ k CHIVALRY;
    private final  Prayer mapping;
    public static final  /* enum */ k MYSTIC_MIGHT;
    public static final  /* enum */ k ULTIMATE_STRENGTH;
    
    public static final  /* enum */ k PIETY;
    public static final  /* enum */ k EAGLE_EYE;
    private static final  k[] $VALUES;
    public static final  /* enum */ k AUGURY;

    private static void var3() {
        var2 = new String[var1[8]];
        k.var2[k.var1[0]] = "AUGURY";
        k.var2[k.var1[1]] = "MYSTIC_MIGHT";
        k.var2[k.var1[2]] = "RIGOUR";
        k.var2[k.var1[3]] = "EAGLE_EYE";
        k.var2[k.var1[4]] = "PIETY";
        k.var2[k.var1[5]] = "CHIVALRY";
        k.var2[k.var1[6]] = "ULTIMATE_STRENGTH";
        k.var2[k.var1[7]] = "NONE";
    }

    public Prayer aL() {
        return this.mapping;
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = var1[0];
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = var1[0];
        while (k.var13(var12, var11)) {
            char var14 = var10[var12];
            var7.append((char)(var14 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            if ((0xAF ^ 0xAA) > 0) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    public static k valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    private static void var27() {
        var1 = new int[9];
        k.var1[0] = (135 + 37 - 40 + 7 ^ 70 + 78 - 39 + 69) & (141 + 85 - 176 + 117 ^ 34 + 33 - 14 + 105 ^ -1);
        k.var1[1] = 1;
        k.var1[2] = 2;
        k.var1[3] = 3;
        k.var1[4] = 0x99 ^ 0x9D;
        k.var1[5] = 0xEE ^ 0xC4 ^ (0x48 ^ 0x67);
        k.var1[6] = 0xB3 ^ 0xB5;
        k.var1[7] = 0x53 ^ 0x40 ^ (0x6C ^ 0x78);
        k.var1[8] = 19 + 153 - 156 + 186 ^ 184 + 116 - 273 + 167;
    }

    static {
        k.var27();
        k.var3();
        AUGURY = new GameEnum2(Prayer.AUGURY);
        MYSTIC_MIGHT = new GameEnum2(Prayer.MYSTIC_MIGHT);
        RIGOUR = new GameEnum2(Prayer.RIGOUR);
        EAGLE_EYE = new GameEnum2(Prayer.EAGLE_EYE);
        PIETY = new GameEnum2(Prayer.PIETY);
        CHIVALRY = new GameEnum2(Prayer.CHIVALRY);
        ULTIMATE_STRENGTH = new GameEnum2(Prayer.ULTIMATE_STRENGTH);
        NONE = new GameEnum2(null);
        k[] kArray = new k[var1[8]];
        kArray[k.var1[0]] = AUGURY;
        kArray[k.var1[1]] = MYSTIC_MIGHT;
        kArray[k.var1[2]] = RIGOUR;
        kArray[k.var1[3]] = EAGLE_EYE;
        kArray[k.var1[4]] = PIETY;
        kArray[k.var1[5]] = CHIVALRY;
        kArray[k.var1[6]] = ULTIMATE_STRENGTH;
        kArray[k.var1[7]] = NONE;
        $VALUES = kArray;
    }

    private GameEnum2(Prayer prayer) {
        this.mapping = prayer;
    }

    public static k[] values() {
        return (k[])$VALUES.clone();
    }
}

