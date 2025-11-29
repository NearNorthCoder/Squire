/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.toa.tasks;

public final class GameEnum8
extends Enum<p> {
    public static final  /* enum */ p RANGE;

    private static final  p[] $VALUES;
    public static final  /* enum */ p MELEE;
    public static final  /* enum */ p MAGE;

    public static p valueOf(String string) {
        return Enum.valueOf(GameEnum8.class, string);
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public static p[] values() {
        return (p[])$VALUES.clone();
    }

    private static void var9() {
        var1 = new int[5];
        p.var1[0] = (0x28 ^ 0x2C ^ (0x7E ^ 0x54)) & (0x75 ^ 2 ^ (0x4C ^ 0x15) ^ -1);
        p.var1[1] = 1;
        p.var1[2] = 2;
        p.var1[3] = 3;
        p.var1[4] = 0x39 ^ 0x44 ^ (0xFC ^ 0x89);
    }

    private static void var10() {
        var2 = new String[var1[3]];
        p.var2[p.var1[0]] = "RANGE";
        p.var2[p.var1[1]] = "MAGE";
        p.var2[p.var1[2]] = "MELEE";
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    static {
        p.var9();
        p.var10();
        RANGE = new GameEnum8();
        MAGE = new GameEnum8();
        MELEE = new GameEnum8();
        p[] pArray = new p[var1[3]];
        pArray[p.var1[0]] = RANGE;
        pArray[p.var1[1]] = MAGE;
        pArray[p.var1[2]] = MELEE;
        $VALUES = pArray;
    }
}

