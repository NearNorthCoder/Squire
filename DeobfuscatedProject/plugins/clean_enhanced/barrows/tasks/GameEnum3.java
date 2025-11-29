/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.barrows.tasks;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.runelite.api.Prayer;

public final class GameEnum3
extends Enum<f> {
    public static final  /* enum */ f RIGOUR;
    public static final  /* enum */ f EAGLE_EYE;
    public static final  /* enum */ f PIETY;
    private static final  f[] $VALUES;
    public static final  /* enum */ f MYSTIC_MIGHT;
    public static final  /* enum */ f CHIVALRY;
    public static final  /* enum */ f ULTIMATE_STRENGTH;
    
    private final  List<Prayer> prayers;
    public static final  /* enum */ f AUGURY;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var2[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var2[0];
        while (f.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            
            return null;
        }
        return String.valueOf(var6);
    }

    private GameEnum3(Prayer ... prayerArray) {
        this.prayers = Stream.of(prayerArray).collect(Collectors.toList());
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    public List<Prayer> I() {
        return this.prayers;
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    private static void var26() {
        var2 = new int[9];
        f.var2[0] = (0x3A ^ 0x1B) & ~(0xB7 ^ 0x96);
        f.var2[1] = 1;
        f.var2[2] = 2;
        f.var2[3] = 3;
        f.var2[4] = 0x83 ^ 0x87;
        f.var2[5] = 103 + 163 - 232 + 153 ^ 106 + 40 - 23 + 67;
        f.var2[6] = 0x23 ^ 0x5B ^ (0xC9 ^ 0xB7);
        f.var2[7] = 0x2E ^ 4 ^ (0x40 ^ 0x6D);
        f.var2[8] = 0x1C ^ 0x14;
    }

    private static void var27() {
        var1 = new String[var2[7]];
        f.var1[f.var2[0]] = "RIGOUR";
        f.var1[f.var2[1]] = "AUGURY";
        f.var1[f.var2[2]] = "PIETY";
        f.var1[f.var2[3]] = "CHIVALRY";
        f.var1[f.var2[4]] = "ULTIMATE_STRENGTH";
        f.var1[f.var2[5]] = "EAGLE_EYE";
        f.var1[f.var2[6]] = "MYSTIC_MIGHT";
    }

    public static f valueOf(String string) {
        return Enum.valueOf(GameEnum3.class, string);
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }
}

