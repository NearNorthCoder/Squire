/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.sepulchre.tasks;

import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

public final class GameEnum11
extends Enum<z> {
    public static final  /* enum */ z LV5_ENCHANT;
    public static final  /* enum */ z NONE;
    public  Spell spell;
    public static final  /* enum */ z LV4_ENCHANT;
    public static final  /* enum */ z LV3_ENCHANT;
    public static final  /* enum */ z LV2_ENCHANT;
    public static final  /* enum */ z LV1_ENCHANT;
    public static final  /* enum */ z LV6_ENCHANT;
    private static final  z[] $VALUES;

    public static z[] values() {
        return (z[])$VALUES.clone();
    }

    private static void var3() {
        var2 = new int[9];
        z.var2[0] = (0xED ^ 0xB4) & ~(0xDE ^ 0x87);
        z.var2[1] = 1;
        z.var2[2] = 2;
        z.var2[3] = 3;
        z.var2[4] = 160 + 170 - 228 + 92 ^ 94 + 29 - -68 + 7;
        z.var2[5] = 39 + 70 - 12 + 64 ^ 115 + 130 - 198 + 117;
        z.var2[6] = 0xDA ^ 0xBA ^ (0x74 ^ 0x12);
        z.var2[7] = 0x88 ^ 0x8F;
        z.var2[8] = 139 + 167 - 117 + 17 ^ 110 + 102 - 84 + 70;
    }

    private GameEnum11(Spell spell) {
        this.spell = spell;
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    public static z valueOf(String string) {
        return Enum.valueOf(GameEnum11.class, string);
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var2[0];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var2[0];
        while (z.var4(var19, var18)) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if ((0xA ^ 0xE) > 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private static void var27() {
        var1 = new String[var2[7]];
        z.var1[z.var2[0]] = "NONE";
        z.var1[z.var2[1]] = "LV1_ENCHANT";
        z.var1[z.var2[2]] = "LV2_ENCHANT";
        z.var1[z.var2[3]] = "LV3_ENCHANT";
        z.var1[z.var2[4]] = "LV4_ENCHANT";
        z.var1[z.var2[5]] = "LV5_ENCHANT";
        z.var1[z.var2[6]] = "LV6_ENCHANT";
    }

    static {
        z.var3();
        z.var27();
        NONE = new GameEnum11(null);
        LV1_ENCHANT = new GameEnum11((SpeSpellBook.Standard.LVL_1_ENCHANT);
        LV2_ENCHANT = new GameEnum11((SpeSpellBook.Standard.LVL_2_ENCHANT);
        LV3_ENCHANT = new GameEnum11((SpeSpellBook.Standard.LVL_3_ENCHANT);
        LV4_ENCHANT = new GameEnum11((SpeSpellBook.Standard.LVL_4_ENCHANT);
        LV5_ENCHANT = new GameEnum11((SpeSpellBook.Standard.LVL_5_ENCHANT);
        LV6_ENCHANT = new GameEnum11((SpeSpellBook.Standard.LVL_6_ENCHANT);
        z[] zArray = new z[var2[7]];
        zArray[z.var2[0]] = NONE;
        zArray[z.var2[1]] = LV1_ENCHANT;
        zArray[z.var2[2]] = LV2_ENCHANT;
        zArray[z.var2[3]] = LV3_ENCHANT;
        zArray[z.var2[4]] = LV4_ENCHANT;
        zArray[z.var2[5]] = LV5_ENCHANT;
        zArray[z.var2[6]] = LV6_ENCHANT;
        $VALUES = zArray;
    }
}

