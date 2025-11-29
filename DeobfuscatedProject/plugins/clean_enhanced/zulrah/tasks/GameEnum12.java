/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.SHelper;
import net.runelite.api.Prayer;

public final class GameEnum12
extends Enum<r> {
    private  int id;
    public static final  /* enum */ r MELEE;

    public static final  /* enum */ r JAD_RANGE_FIRST;
    private static final  r[] $VALUES;
    public static final  /* enum */ r RANGE;
    public static final  /* enum */ r JAD_MAGIC_FIRST;
    public static final  /* enum */ r MAGIC;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public static r[] values() {
        return (r[])$VALUES.clone();
    }

    public Prayer M() {
        switch (s.r[this.ordinal()]) {
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                return Prayer.MYSTIC_MIGHT;
            }
            case 5: {
                return Prayer.EAGLE_EYE;
            }
        }
        return Prayer.MYSTIC_MIGHT;
    }

    static {
        r.var9();
        r.var10();
        RANGE = new GameEnum12(1);
        MELEE = new GameEnum12(3);
        MAGIC = new GameEnum12(5);
        JAD_MAGIC_FIRST = new GameEnum12(1);
        JAD_RANGE_FIRST = new GameEnum12(1);
        r[] rArray = new r[8];
        rArray[0] = RANGE;
        rArray[2] = MELEE;
        rArray[4] = MAGIC;
        rArray[6] = JAD_MAGIC_FIRST;
        rArray[7] = JAD_RANGE_FIRST;
        $VALUES = rArray;
    }

    private GameEnum12(int n3) {
        this.id = n3;
    }

    public static r valueOf(String string) {
        return Enum.valueOf(GameEnum12.class, string);
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = 0;
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = 0;
        while (var19 < var18) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (((122 + 78 - 115 + 82 ^ 84 + 120 - 168 + 95) & (73 + 92 - 98 + 77 ^ 176 + 80 - 109 + 33 ^ -1)) == ((0xFB ^ 0xB4 ^ (0x93 ^ 0x84)) & (0x1D ^ 0x18 ^ (0x70 ^ 0x2D) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    public int L() {
        return this.id;
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    public Prayer N() {
        switch (s.r[this.ordinal()]) {
            case 2: 
            case 5: {
                return Prayer.PROTECT_FROM_MAGIC;
            }
        }
        return Prayer.PROTECT_FROM_MISSILES;
    }

}

