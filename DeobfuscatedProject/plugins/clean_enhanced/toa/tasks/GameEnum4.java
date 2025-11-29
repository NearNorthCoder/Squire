/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.toa.tasks;

public final class GameEnum4
extends Enum<c> {
    public static final  /* enum */ c RANGE_2;
    public static final  /* enum */ c MAGE;
    public static final  /* enum */ c MELEE_1;
    
    public static final  /* enum */ c RANGE_1;
    private static final  c[] $VALUES;
    
    public static final  /* enum */ c NONE;
    public static final  /* enum */ c MELEE_2;

    static {
        c.var3();
        c.var4();
        NONE = new GameEnum4();
        MELEE_1 = new GameEnum4();
        MELEE_2 = new GameEnum4();
        RANGE_1 = new GameEnum4();
        RANGE_2 = new GameEnum4();
        MAGE = new GameEnum4();
        c[] cArray = new c[var2[6]];
        cArray[c.var2[0]] = NONE;
        cArray[c.var2[1]] = MELEE_1;
        cArray[c.var2[2]] = MELEE_2;
        cArray[c.var2[3]] = RANGE_1;
        cArray[c.var2[4]] = RANGE_2;
        cArray[c.var2[5]] = MAGE;
        $VALUES = cArray;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum4.class, string);
    }

    private static void var4() {
        var1 = new String[var2[6]];
        c.var1[c.var2[0]] = "NONE";
        c.var1[c.var2[1]] = "MELEE_1";
        c.var1[c.var2[2]] = "MELEE_2";
        c.var1[c.var2[3]] = "RANGE_1";
        c.var1[c.var2[4]] = "RANGE_2";
        c.var1[c.var2[5]] = "MAGE";
    }

    private static void var3() {
        var2 = new int[8];
        c.var2[0] = (0x17 ^ 0x47) & ~(0xE ^ 0x5E);
        c.var2[1] = 1;
        c.var2[2] = 2;
        c.var2[3] = 3;
        c.var2[4] = 0xB0 ^ 0xB4;
        c.var2[5] = 0x22 ^ 0x27;
        c.var2[6] = 0xF4 ^ 0xA9 ^ (0x5C ^ 7);
        c.var2[7] = 0x58 ^ 0x44 ^ (0x73 ^ 0x67);
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var2[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var2[0];
        while (c.var11(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if ((0x33 ^ 0x37) > 2) continue;
            return null;
        }
        return String.valueOf(var15);
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }
}

