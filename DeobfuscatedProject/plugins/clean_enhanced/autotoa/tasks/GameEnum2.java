/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.autotoa.tasks;

import net.runelite.api.Prayer;

public final class GameEnum2
extends Enum<t> {
    public static final  /* enum */ t AUGURY;
    public static final  /* enum */ t MYSTIC_MIGHT;
    
    private static final  t[] $VALUES;
    private final  Prayer mapped;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public static t[] values() {
        return (t[])$VALUES.clone();
    }

    private GameEnum2(Prayer prayer) {
        this.mapped = prayer;
    }

    static {
        t.var9();
        t.var10();
        AUGURY = new GameEnum2(Prayer.AUGURY);
        MYSTIC_MIGHT = new GameEnum2(Prayer.MYSTIC_MIGHT);
        t[] tArray = new t[var1[2]];
        tArray[t.var1[0]] = AUGURY;
        tArray[t.var1[1]] = MYSTIC_MIGHT;
        $VALUES = tArray;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static void var10() {
        var2 = new String[var1[2]];
        t.var2[t.var1[0]] = "AUGURY";
        t.var2[t.var1[1]] = "MYSTIC_MIGHT";
    }

    public Prayer ag() {
        return this.mapped;
    }

    private static void var9() {
        var1 = new int[4];
        t.var1[0] = (0x63 ^ 0x59) & ~(0x54 ^ 0x6E);
        t.var1[1] = 1;
        t.var1[2] = 2;
        t.var1[3] = 0x5D ^ 0x55;
    }

    public static t valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }
}

