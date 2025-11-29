/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.quest.tasks;

public final class GameEnum3
extends Enum<h> {

    public static final  /* enum */ h TUTORIAL_ISLAND;
    private final  String questName;
    private static final  h[] $VALUES;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static void var15() {
        var1 = new int[4];
        h.var1[0] = (0x26 ^ 0xA) & ~(0x60 ^ 0x4C);
        h.var1[1] = 1;
        h.var1[2] = 2;
        h.var1[3] = 0x79 ^ 0x71;
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum3.class, string);
    }

    private static void var16() {
        var2 = new String[var1[2]];
        h.var2[h.var1[0]] = "TUTORIAL_ISLAND";
        h.var2[h.var1[1]] = "Tutorial Island";
    }

    static {
        h.var15();
        h.var16();
        TUTORIAL_ISLAND = new GameEnum3(var2[var1[1]]);
        h[] hArray = new h[var1[1]];
        hArray[h.var1[0]] = TUTORIAL_ISLAND;
        $VALUES = hArray;
    }

    private GameEnum3(String string2) {
        this.questName = string2;
    }
}

