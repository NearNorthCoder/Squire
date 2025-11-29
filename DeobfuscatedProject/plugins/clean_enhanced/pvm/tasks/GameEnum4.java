/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 */
package gg.squire.pvm.tasks;

import java.util.function.Predicate;
import java.util.stream.IntStream;
import net.runelite.api.Item;

public final class GameEnum4
extends Enum<f> {
    public static final  /* enum */ f DIVINE_POTION;
    public static final  /* enum */ f RANGE_POTION;

    private static final  f[] $VALUES;
    private final  Predicate<Item> test;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static void var9() {
        var1 = new int[14];
        f.var1[0] = 1;
        f.var1[1] = (0x34 ^ 0x62 ^ (0x1B ^ 0x7B)) & (0xDC ^ 0xA6 ^ (0xF9 ^ 0xB5) ^ -1);
        f.var1[2] = 0xE ^ 0xA;
        f.var1[3] = -(0xFFFFE8FE & 0x3725) & (0xFFFFEBFF & 0x3DAF);
        f.var1[4] = 88 + 88 - 50 + 41 + (48 + 110 - 54 + 44) - (77 + 211 - 156 + 82) + (0x38 ^ 0x7C);
        f.var1[5] = 2;
        f.var1[6] = 107 + 111 - 191 + 144;
        f.var1[7] = 3;
        f.var1[8] = 99 + 39 - 71 + 106;
        f.var1[9] = -(0xFFFFBF1B & 0x63EF) & (0xFFFFFFFF & 0x7FBF);
        f.var1[10] = -(0xFFFFAFC6 & 0x537B) & (0xFFFFDFFB & 0x7FFD);
        f.var1[11] = 0xFFFFFFFB & 0x5CBF;
        f.var1[12] = -(0xFFFF91D9 & 0x6F67) & (0xFFFFFFFE & 0x5DFF);
        f.var1[13] = 22 + 151 - 144 + 130 ^ 48 + 53 - -21 + 29;
    }

    public Predicate<Item> u() {
        return this.test;
    }

    public static f valueOf(String string) {
        return Enum.valueOf(GameEnum4.class, string);
    }

    private static boolean var10(int n2, int n3) {
        return n2 == n3;
    }

    static {
        f.var9();
        f.var11();
        int[] nArray = new int[var1[2]];
        nArray[f.var1[1]] = var1[3];
        nArray[f.var1[0]] = var1[4];
        nArray[f.var1[5]] = var1[6];
        nArray[f.var1[7]] = var1[8];
        RANGE_POTION = new GameEnum4(nArray);
        int[] nArray2 = new int[var1[2]];
        nArray2[f.var1[1]] = var1[9];
        nArray2[f.var1[0]] = var1[10];
        nArray2[f.var1[5]] = var1[11];
        nArray2[f.var1[7]] = var1[12];
        DIVINE_POTION = new GameEnum4(nArray2);
        f[] fArray = new f[var1[5]];
        fArray[f.var1[1]] = RANGE_POTION;
        fArray[f.var1[0]] = DIVINE_POTION;
        $VALUES = fArray;
    }

    private static void var11() {
        var2 = new String[var1[5]];
        f.var2[f.var1[1]] = "RANGE_POTION";
        f.var2[f.var1[0]] = "DIVINE_POTION";
    }

    private GameEnum4(int ... nArray) {
        this.test = item -> IntStream.of(nArray).anyMatch(n2 -> {
            boolean bl;
            if (f.var10(n2, item.getId())) {
                bl = var1[0];
                0;
                if (-1 > ((0x26 ^ 0x79) & ~(0x64 ^ 0x3B))) {
                    return ((0x82 ^ 0x95) & ~(0x1D ^ 0xA)) != 0;
                }
            } else {
                bl = var1[1];
            }
            return bl;
        });
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }
}

