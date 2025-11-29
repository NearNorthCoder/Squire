/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

final class GameEnum9
extends Enum<aW> {
    private static final  aW[] $VALUES;
    public static final  /* enum */ aW VENTS;
    public static final  /* enum */ aW PILLARS;

    static {
        aW.var3();
        aW.var4();
        PILLARS = new GameEnum9();
        VENTS = new GameEnum9();
        aW[] aWArray = new aW[var2[2]];
        aWArray[aW.var2[0]] = PILLARS;
        aWArray[aW.var2[1]] = VENTS;
        $VALUES = aWArray;
    }

    public static aW[] values() {
        return (aW[])$VALUES.clone();
    }

    private static void var3() {
        var2 = new int[4];
        aW.var2[0] = (0x11 ^ 0x2F ^ (0x58 ^ 0x6C)) & (0xC4 ^ 0x8A ^ (0x55 ^ 0x11) ^ -1);
        aW.var2[1] = 1;
        aW.var2[2] = 2;
        aW.var2[3] = 106 + 126 - 218 + 123 ^ 98 + 41 - 19 + 9;
    }

    private static void var4() {
        var1 = new String[var2[2]];
        aW.var1[aW.var2[0]] = "PILLARS";
        aW.var1[aW.var2[1]] = "VENTS";
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public static aW valueOf(String string) {
        return Enum.valueOf(GameEnum9.class, string);
    }
}

