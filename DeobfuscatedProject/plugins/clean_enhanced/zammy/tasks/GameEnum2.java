/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.zammy.tasks;

import net.runelite.api.Prayer;

public final class GameEnum2
extends Enum<a> {
    private final  Prayer[] prayers;
    public static final  /* enum */ a MYSTIC_MIGHT;
    public static final  /* enum */ a AUGURY;
    private static final  a[] $VALUES;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (-1 <= ((0x63 ^ 0x59) & ~(0x78 ^ 0x42))) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    public static a valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    public Prayer[] GameEnum2() {
        return this.prayers;
    }

    static {
        a.var19();
        a.var20();
        Prayer[] prayerArray = new Prayer[1];
        prayerArray[0] = Prayer.MYSTIC_MIGHT;
        prayerArray[2] = Prayer.STEEL_SKIN;
        MYSTIC_MIGHT = new GameEnum2(prayerArray);
        Prayer[] prayerArray2 = new Prayer[2];
        prayerArray2[0] = Prayer.AUGURY;
        AUGURY = new GameEnum2(prayerArray2);
        a[] aArray = new a[1];
        aArray[0] = MYSTIC_MIGHT;
        aArray[2] = AUGURY;
        $VALUES = aArray;
    }

    private GameEnum2(Prayer ... prayerArray) {
        this.prayers = prayerArray;
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }
}

