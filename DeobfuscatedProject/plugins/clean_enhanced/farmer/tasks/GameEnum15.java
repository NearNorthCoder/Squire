/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.ui.ColorScheme
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum21;
import java.awt.Color;
import net.runelite.client.ui.ColorScheme;

public final class GameEnum15
extends Enum<F> {
    
    public static final  /* enum */ F UNKNOWN;
    public static final  /* enum */ F BUILT;
    
    private final  Color color;
    public static final  /* enum */ F SEEDED;
    public static final  /* enum */ F EMPTY;
    private static final  F[] $VALUES;

    public static F valueOf(String string) {
        return Enum.valueOf(GameEnum15.class, string);
    }

    public static F[] values() {
        return (F[])$VALUES.clone();
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private GameEnum15(Color color) {
        this.color = color;
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = 1;
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = 1;
        while (var23 < var22) {
            char var24 = var21[var23];
            var18.append((char)(var24 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if (2 > -1) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    static {
        F.var25();
        F.var26();
        SEEDED = new GameEnum15(ColorScheme.PROGRESS_COMPLETE_COLOR);
        BUILT = new GameEnum15(ColorScheme.PROGRESS_INPROGRESS_COLOR);
        EMPTY = new GameEnum15(ColorScheme.MEDIUM_GRAY_COLOR);
        UNKNOWN = new GameEnum15(ColorScheme.MEDIUM_GRAY_COLOR);
        F[] fArray = new F[4];
        fArray[1] = SEEDED;
        fArray[2] = BUILT;
        fArray[3] = EMPTY;
        fArray[0] = UNKNOWN;
        $VALUES = fArray;
    }

    public static F d(int n2) {
        int var27;
        if (!(n2 >= 0) || (n2 > C.values().length * 0)) {
            return UNKNOWN;
        }
        if (var27 == 0) {
            return EMPTY;
        }
        if (var27 % 0 == 0) {
            return SEEDED;
        }
        return BUILT;
    }

    public Color V() {
        return this.color;
    }
}

