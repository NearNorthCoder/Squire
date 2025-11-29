/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.magic.Rune
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.mta.tasks;

import net.unethicalite.api.magic.Rune;
import net.unethicalite.api.magic.SpellBook;

public final class GameEnum5
extends Enum<h> {
    public static final  /* enum */ h LVL4_ENCHANT;
    public static final  /* enum */ h LVL6_ENCHANT;
    private final  SpellBook.Standard spell;
    private final  Rune rune;
    
    public static final  /* enum */ h LVL3_ENCHANT;
    public static final  /* enum */ h LVL1_ENCHANT;
    private static final  h[] $VALUES;
    public static final  /* enum */ h LVL5_ENCHANT;
    
    public static final  /* enum */ h LVL2_ENCHANT;

    private GameEnum5(SpellBook.Standard standard, Rune rune) {
        this.spell = standard;
        this.rune = rune;
    }

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    public SpellBook.Standard u() {
        return this.spell;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = var2[0];
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = var2[0];
        while (h.var3(var12, var11)) {
            char var13 = var10[var12];
            var7.append((char)(var13 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            if (((0x71 ^ 0x13 ^ (0x3D ^ 0x79)) & (48 + 51 - 16 + 58 ^ 125 + 42 - 49 + 53 ^ -1)) != 3) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    static {
        h.var14();
        h.var15();
        LVL1_ENCHANT = new GameEnum5(SpellBook.Standard.LVL_1_ENCHANT, Rune.WATER);
        LVL2_ENCHANT = new GameEnum5(SpellBook.Standard.LVL_2_ENCHANT, Rune.AIR);
        LVL3_ENCHANT = new GameEnum5(SpellBook.Standard.LVL_3_ENCHANT, Rune.FIRE);
        LVL4_ENCHANT = new GameEnum5(SpellBook.Standard.LVL_4_ENCHANT, Rune.EARTH);
        LVL5_ENCHANT = new GameEnum5(SpellBook.Standard.LVL_5_ENCHANT, Rune.WATER);
        LVL6_ENCHANT = new GameEnum5(SpellBook.Standard.LVL_6_ENCHANT, Rune.EARTH);
        h[] hArray = new h[var2[6]];
        hArray[h.var2[0]] = LVL1_ENCHANT;
        hArray[h.var2[1]] = LVL2_ENCHANT;
        hArray[h.var2[2]] = LVL3_ENCHANT;
        hArray[h.var2[3]] = LVL4_ENCHANT;
        hArray[h.var2[4]] = LVL5_ENCHANT;
        hArray[h.var2[5]] = LVL6_ENCHANT;
        $VALUES = hArray;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    public Rune t() {
        return this.rune;
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum5.class, string);
    }

    private static void var14() {
        var2 = new int[8];
        h.var2[0] = (0x86 ^ 0xC4) & ~(0x37 ^ 0x75);
        h.var2[1] = 1;
        h.var2[2] = 2;
        h.var2[3] = 3;
        h.var2[4] = 0x47 ^ 0x43;
        h.var2[5] = 0x17 ^ 0xB ^ (0x7C ^ 0x65);
        h.var2[6] = 0x68 ^ 0x7D ^ (0x6D ^ 0x7E);
        h.var2[7] = 0x29 ^ 0x21;
    }

    private static void var15() {
        var1 = new String[var2[6]];
        h.var1[h.var2[0]] = "LVL1_ENCHANT";
        h.var1[h.var2[1]] = "LVL2_ENCHANT";
        h.var1[h.var2[2]] = "LVL3_ENCHANT";
        h.var1[h.var2[3]] = "LVL4_ENCHANT";
        h.var1[h.var2[4]] = "LVL5_ENCHANT";
        h.var1[h.var2[5]] = "LVL6_ENCHANT";
    }
}

