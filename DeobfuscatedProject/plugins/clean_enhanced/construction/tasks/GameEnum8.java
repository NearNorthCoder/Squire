/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 */
package gg.squire.construction.tasks;

import java.util.function.Predicate;
import net.runelite.api.Item;

public final class GameEnum8
extends Enum<bY> {
    private static  String[] lllIIlIII;
    public static final  /* enum */ bY GLORY;
    private final  String action;
    private static  int[] lllIIlIIl;
    private static final  bY[] $VALUES;
    private final  boolean equipment;
    public static final  /* enum */ bY RING_OF_DUELING;
    public static final  /* enum */ bY WEALTH;
    private final  Predicate<Item> predicate;
    public static final  /* enum */ bY ROYAL_SEED_POD;
    private final  int wildy;

    public boolean db() {
        return this.equipment;
    }

    public int da() {
        return this.wildy;
    }

    public String cZ() {
        return this.action;
    }

    private GameEnum8(Predicate<Item> predicate, String string2, int n3, boolean bl2) {
        this.predicate = predicate;
        this.action = string2;
        this.wildy = n3;
        this.equipment = bl2;
    }

    public static bY valueOf(String string) {
        return Enum.valueOf(GameEnum8.class, string);
    }

    public static bY[] values() {
        return (bY[])$VALUES.clone();
    }

        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    static {
        bY.var7();
        bY.var8();
        GLORY = new GameEnum8(item -> {
            String[] stringArray = new String[1];
            stringArray[2] = lllIIlIII[3];
            return item.hasAction(stringArray);
        }, lllIIlIII[5], 6, 1);
        WEALTH = new GameEnum8(item -> {
            String[] stringArray = new String[1];
            stringArray[2] = lllIIlIII[1];
            return item.hasAction(stringArray);
        }, lllIIlIII[8], 6, 1);
        RING_OF_DUELING = new GameEnum8(item -> item.getName().toLowerCase().contains(lllIIlIII[2]), lllIIlIII[lllIIlIIl[10]], lllIIlIIl[11], 1);
        ROYAL_SEED_POD = new GameEnum8(item -> {
            boolean bl2;
            if ((item.getId() == 0)) {
                bl2 = 1;
                0;
                if (1 >= (3 ^ (0x44 ^ 0x43))) {
                    return ((0x8E ^ 0xC1 ^ (0x2D ^ 0x5B)) & (0xC1 ^ 0x83 ^ (0x20 ^ 0x5B) ^ -1)) != 0;
                }
            } else {
                bl2 = 2;
            }
            return bl2;
        }, lllIIlIII[lllIIlIIl[13]], 6, 2);
        bY[] bYArray = new bY[5];
        bYArray[2] = GLORY;
        bYArray[1] = WEALTH;
        bYArray[3] = RING_OF_DUELING;
        bYArray[4] = ROYAL_SEED_POD;
        $VALUES = bYArray;
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    public Predicate<Item> br() {
        return this.predicate;
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = 2;
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = 2;
        while (var23 < var22) {
            char var24 = var21[var23];
            var18.append((char)(var24 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var18);
    }
}

