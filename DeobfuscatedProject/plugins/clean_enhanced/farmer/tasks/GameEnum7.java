/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.ui.ColorScheme
 */
package gg.squire.farmer.tasks;

import java.awt.Color;
import net.runelite.client.ui.ColorScheme;

public final class GameEnum7
extends Enum<n> {
    public static final  /* enum */ n FILLING;
    public static final  /* enum */ n EMPTY;
    private static final  n[] $VALUES;
    private final  Color color;
    public static final  /* enum */ n DEAD;
    
    public static final  /* enum */ n DISEASED;
    
    public static final  /* enum */ n HARVESTABLE;
    public static final  /* enum */ n GROWING;

    static {
        n.var3();
        n.var4();
        HARVESTABLE = new GameEnum7(ColorScheme.PROGRESS_COMPLETE_COLOR);
        GROWING = new GameEnum7(ColorScheme.PROGRESS_COMPLETE_COLOR);
        DISEASED = new GameEnum7(ColorScheme.PROGRESS_INPROGRESS_COLOR);
        DEAD = new GameEnum7(ColorScheme.PROGRESS_ERROR_COLOR);
        EMPTY = new GameEnum7(ColorScheme.MEDIUM_GRAY_COLOR);
        FILLING = new GameEnum7(ColorScheme.PROGRESS_INPROGRESS_COLOR);
        n[] nArray = new n[6];
        nArray[0] = HARVESTABLE;
        nArray[1] = GROWING;
        nArray[2] = DISEASED;
        nArray[3] = DEAD;
        nArray[4] = EMPTY;
        nArray[5] = FILLING;
        $VALUES = nArray;
    }

    public Color V() {
        return this.color;
    }

    private GameEnum7(Color color) {
        this.color = color;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public static n[] values() {
        return (n[])$VALUES.clone();
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    public static n valueOf(String string) {
        return Enum.valueOf(GameEnum7.class, string);
    }

    private static String var17(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var21 = var19.toCharArray();
        int var22 = 0;
        char[] var23 = var18.toCharArray();
        int var24 = var23.length;
        int var25 = 0;
        while (var25 < var24) {
            char var26 = var23[var25];
            var20.append((char)(var26 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var20);
    }
}

