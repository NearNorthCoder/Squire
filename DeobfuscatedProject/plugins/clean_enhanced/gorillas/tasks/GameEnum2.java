/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.gorillas.tasks;

import net.runelite.api.Prayer;

public final class GameEnum2
extends Enum<e> {
    public static final  /* enum */ e CHIVALRY;
    private final  Prayer mapped;
    public static final  /* enum */ e PIETY;
    
    private static final  e[] $VALUES;
    
    public static final  /* enum */ e ULTIMATE_STRENGTH;

    public Prayer C() {
        return this.mapped;
    }

    static {
        e.var3();
        e.var4();
        PIETY = new GameEnum2(Prayer.PIETY);
        CHIVALRY = new GameEnum2(Prayer.CHIVALRY);
        ULTIMATE_STRENGTH = new GameEnum2(Prayer.ULTIMATE_STRENGTH);
        e[] eArray = new e[3];
        eArray[0] = PIETY;
        eArray[1] = CHIVALRY;
        eArray[2] = ULTIMATE_STRENGTH;
        $VALUES = eArray;
    }

    private GameEnum2(Prayer prayer) {
        this.mapped = prayer;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
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
            if (((0xA1 ^ 0xA9 ^ (0xBA ^ 0xA5)) & (0x26 ^ 6 ^ (8 ^ 0x3F) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }
}

