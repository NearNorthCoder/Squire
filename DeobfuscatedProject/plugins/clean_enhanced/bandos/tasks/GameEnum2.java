/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.bandos.tasks;

import net.runelite.api.Prayer;

public final class GameEnum2
extends Enum<c> {

    public static final  /* enum */ c RIGOUR;
    private static final  c[] $VALUES;
    private final  Prayer[] prayers;
    public static final  /* enum */ c EAGLE_EYE;

    static {
        c.var3();
        c.var4();
        Prayer[] prayerArray = new Prayer[var1[1]];
        prayerArray[c.var1[0]] = Prayer.RIGOUR;
        RIGOUR = new GameEnum2(prayerArray);
        Prayer[] prayerArray2 = new Prayer[var1[2]];
        prayerArray2[c.var1[0]] = Prayer.EAGLE_EYE;
        prayerArray2[c.var1[1]] = Prayer.STEEL_SKIN;
        EAGLE_EYE = new GameEnum2(prayerArray2);
        c[] cArray = new c[var1[2]];
        cArray[c.var1[0]] = RIGOUR;
        cArray[c.var1[1]] = EAGLE_EYE;
        $VALUES = cArray;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private GameEnum2(Prayer ... prayerArray) {
        this.prayers = prayerArray;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static void var4() {
        var2 = new String[var1[2]];
        c.var2[c.var1[0]] = "RIGOUR";
        c.var2[c.var1[1]] = "EAGLE_EYE";
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    public Prayer[] h() {
        return this.prayers;
    }

    private static void var3() {
        var1 = new int[4];
        c.var1[0] = (0x3F ^ 0x13 ^ (0xA6 ^ 0xC7)) & (134 + 3 - -91 + 18 ^ 104 + 139 - 220 + 164 ^ -1);
        c.var1[1] = 1;
        c.var1[2] = 2;
        c.var1[3] = 0x5F ^ 0x57;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }
}

