/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.nightmarezone.tasks;

import net.runelite.api.Prayer;

public final class GameEnum
extends Enum<c> {
    public static final  /* enum */ c MYSTIC_WILL;
    public static final  /* enum */ c PIETY;
    private final  Prayer prayer;
    public static final  /* enum */ c HAWK_EYE;
    public static final  /* enum */ c EAGLE_EYE;
    
    public static final  /* enum */ c RIGOUR;
    public static final  /* enum */ c ULTIMATE_STR;
    private static final  c[] $VALUES;
    
    public static final  /* enum */ c BURST_OF_STR;
    public static final  /* enum */ c AUGURY;
    public static final  /* enum */ c MYSTIC_MIGHT;
    public static final  /* enum */ c SHARP_EYE;
    public static final  /* enum */ c SUPERHUMAN_STR;
    public static final  /* enum */ c MYSTIC_LORD;

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public Prayer j() {
        return this.prayer;
    }

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
            if (3 > -1) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    static {
        c.var14();
        c.var15();
        BURST_OF_STR = new GameEnum(Prayer.BURST_OF_STRENGTH);
        SUPERHUMAN_STR = new GameEnum(Prayer.SUPERHUMAN_STRENGTH);
        ULTIMATE_STR = new GameEnum(Prayer.ULTIMATE_STRENGTH);
        PIETY = new GameEnum(Prayer.PIETY);
        SHARP_EYE = new GameEnum(Prayer.EAGLE_EYE);
        HAWK_EYE = new GameEnum(Prayer.EAGLE_EYE);
        EAGLE_EYE = new GameEnum(Prayer.EAGLE_EYE);
        RIGOUR = new GameEnum(Prayer.RIGOUR);
        MYSTIC_WILL = new GameEnum(Prayer.MYSTIC_WILL);
        MYSTIC_LORD = new GameEnum(Prayer.MYSTIC_LORE);
        MYSTIC_MIGHT = new GameEnum(Prayer.MYSTIC_MIGHT);
        AUGURY = new GameEnum(Prayer.AUGURY);
        c[] cArray = new c[var1[12]];
        cArray[c.var1[0]] = BURST_OF_STR;
        cArray[c.var1[1]] = SUPERHUMAN_STR;
        cArray[c.var1[2]] = ULTIMATE_STR;
        cArray[c.var1[3]] = PIETY;
        cArray[c.var1[4]] = SHARP_EYE;
        cArray[c.var1[5]] = HAWK_EYE;
        cArray[c.var1[6]] = EAGLE_EYE;
        cArray[c.var1[7]] = RIGOUR;
        cArray[c.var1[8]] = MYSTIC_WILL;
        cArray[c.var1[9]] = MYSTIC_LORD;
        cArray[c.var1[10]] = MYSTIC_MIGHT;
        cArray[c.var1[11]] = AUGURY;
        $VALUES = cArray;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private static void var15() {
        var2 = new String[var1[12]];
        c.var2[c.var1[0]] = "BURST_OF_STR";
        c.var2[c.var1[1]] = "SUPERHUMAN_STR";
        c.var2[c.var1[2]] = "ULTIMATE_STR";
        c.var2[c.var1[3]] = "PIETY";
        c.var2[c.var1[4]] = "SHARP_EYE";
        c.var2[c.var1[5]] = "HAWK_EYE";
        c.var2[c.var1[6]] = "EAGLE_EYE";
        c.var2[c.var1[7]] = "RIGOUR";
        c.var2[c.var1[8]] = "MYSTIC_WILL";
        c.var2[c.var1[9]] = "MYSTIC_LORD";
        c.var2[c.var1[10]] = "MYSTIC_MIGHT";
        c.var2[c.var1[11]] = "AUGURY";
    }

    private static void var14() {
        var1 = new int[13];
        c.var1[0] = (0x28 ^ 0x7D ^ (0x4B ^ 0x3F)) & (152 + 106 - 214 + 127 ^ 0 + 123 - 106 + 121 ^ -1);
        c.var1[1] = 1;
        c.var1[2] = 2;
        c.var1[3] = 3;
        c.var1[4] = 0x2D ^ 0x21 ^ (0xC9 ^ 0xC1);
        c.var1[5] = 0x69 ^ 0x6C;
        c.var1[6] = 0x6F ^ 0x69;
        c.var1[7] = 0xB6 ^ 0xB1;
        c.var1[8] = 2 ^ (0x4B ^ 0x41);
        c.var1[9] = 0xB3 ^ 0xBA;
        c.var1[10] = 0x3A ^ 0x30;
        c.var1[11] = 0x6A ^ 0x7E ^ (0x6E ^ 0x71);
        c.var1[12] = 0x61 ^ 0x6D;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private GameEnum(Prayer prayer) {
        this.prayer = prayer;
    }
}

