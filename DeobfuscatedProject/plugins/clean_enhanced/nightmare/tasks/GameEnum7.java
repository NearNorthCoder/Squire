/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.nightmare.tasks;

import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

public final class GameEnum7
extends Enum<s> {
    public static final  /* enum */ s FIRE_WAVE;
    private final  Spell spell;
    private final  String name;
    private static final  s[] $VALUES;
    public static final  /* enum */ s FIRE_SURGE;
    public static final  /* enum */ s FIRE_BOLT;
    public static final  /* enum */ s FIRE_BLAST;

    private static void var3() {
        var1 = new int[9];
        s.var1[0] = (0x5E ^ 0x4E) & ~(3 ^ 0x13);
        s.var1[1] = 1;
        s.var1[2] = 2;
        s.var1[3] = 3;
        s.var1[4] = 28 + 23 - 36 + 126 ^ 10 + 97 - 73 + 103;
        s.var1[5] = 0x5B ^ 0x5E;
        s.var1[6] = 0xB3 ^ 0xB5;
        s.var1[7] = 0x57 ^ 0x50;
        s.var1[8] = 0x4C ^ 0x44;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = var1[0];
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = var1[0];
        while (s.var19(var18, var17)) {
            char var20 = var16[var18];
            var13.append((char)(var20 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if (((151 + 71 - 79 + 57 ^ 135 + 31 - 133 + 115) & (133 + 187 - 128 + 8 ^ 108 + 143 - 147 + 44 ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    static {
        s.var3();
        s.var21();
        FIRE_SURGE = new GameEnum7((SpeSpellBook.Standard.FIRE_SURGE, var2[var1[1]]);
        FIRE_WAVE = new GameEnum7((SpeSpellBook.Standard.FIRE_WAVE, var2[var1[3]]);
        FIRE_BLAST = new GameEnum7((SpeSpellBook.Standard.FIRE_BLAST, var2[var1[5]]);
        FIRE_BOLT = new GameEnum7((SpeSpellBook.Standard.FIRE_BOLT, var2[var1[7]]);
        s[] sArray = new s[var1[4]];
        sArray[s.var1[0]] = FIRE_SURGE;
        sArray[s.var1[1]] = FIRE_WAVE;
        sArray[s.var1[2]] = FIRE_BLAST;
        sArray[s.var1[3]] = FIRE_BOLT;
        $VALUES = sArray;
    }

    public String bG() {
        return this.name;
    }

    private static void var21() {
        var2 = new String[var1[8]];
        s.var2[s.var1[0]] = "FIRE_SURGE";
        s.var2[s.var1[1]] = "Fire Surge";
        s.var2[s.var1[2]] = "FIRE_WAVE";
        s.var2[s.var1[3]] = "Fire Wave";
        s.var2[s.var1[4]] = "FIRE_BLAST";
        s.var2[s.var1[5]] = "Fire Blast";
        s.var2[s.var1[6]] = "FIRE_BOLT";
        s.var2[s.var1[7]] = "Fire Bolt";
    }

    private static boolean var19(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    public static s valueOf(String string) {
        return Enum.valueOf(GameEnum7.class, string);
    }

    public static s[] values() {
        return (s[])$VALUES.clone();
    }

    public Spell bF() {
        return this.spell;
    }

    private GameEnum7(Spell spell, String string2) {
        this.spell = spell;
        this.name = string2;
    }
}

