/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.unethicalite.api.commons.Predicates
 */
package gg.squire.zulrah.tasks;

import java.util.function.Predicate;
import net.runelite.api.Item;
import net.unethicalite.api.commons.Predicates;

public final class GameEnum11
extends Enum<e> {
    public static final  /* enum */ e ARDY_CLOAK;
    public static final  /* enum */ e RUNE_POUCH;
    public static final  /* enum */ e QUEST_CAPE;
    private final  Predicate<Item> ids;
    private static final  e[] $VALUES;
    public static final  /* enum */ e CONS_CAPE;
    
    public static final  /* enum */ e GLORY_AMULET;
    
    public static final  /* enum */ e HOUSE_TAB;

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
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum11.class, string);
    }

    static {
        e.var13();
        e.var14();
        int[] nArray = new int[1];
        nArray[0] = 2;
        nArray[3] = 4;
        QUEST_CAPE = new GameEnum11(nArray);
        int[] nArray2 = new int[3];
        nArray2[0] = 5;
        HOUSE_TAB = new GameEnum11(nArray2);
        int[] nArray3 = new int[1];
        nArray3[0] = 6;
        nArray3[3] = 7;
        RUNE_POUCH = new GameEnum11(nArray3);
        int[] nArray4 = new int[9];
        nArray4[0] = var1[10];
        nArray4[3] = var1[11];
        nArray4[1] = var1[12];
        nArray4[8] = var1[13];
        ARDY_CLOAK = new GameEnum11(nArray4);
        int[] nArray5 = new int[var1[14]];
        nArray5[0] = var1[15];
        nArray5[3] = var1[16];
        nArray5[1] = var1[17];
        nArray5[8] = var1[18];
        nArray5[9] = var1[19];
        nArray5[e.var1[20]] = var1[21];
        GLORY_AMULET = new GameEnum11(nArray5);
        int[] nArray6 = new int[1];
        nArray6[0] = var1[22];
        nArray6[3] = var1[23];
        CONS_CAPE = new GameEnum11(nArray6);
        e[] eArray = new e[var1[14]];
        eArray[0] = QUEST_CAPE;
        eArray[3] = HOUSE_TAB;
        eArray[1] = RUNE_POUCH;
        eArray[8] = ARDY_CLOAK;
        eArray[9] = GLORY_AMULET;
        eArray[e.var1[20]] = CONS_CAPE;
        $VALUES = eArray;
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    public Predicate<Item> p() {
        return this.ids;
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private GameEnum11(int ... nArray) {
        this.ids = Predicates.ids((int[])nArray);
    }
}

