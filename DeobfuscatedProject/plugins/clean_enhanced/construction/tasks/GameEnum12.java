/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 */
package gg.squire.construction.tasks;

import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;

public final class GameEnum12
extends Enum<J> {
    public static final  /* enum */ J SUPER_DEFENCE;
    private final  int boostAmount;
    public static final  /* enum */ J DIVINE_RANGING_POTION;
    public static final  /* enum */ J SUPER_COMBAT;
    public static final  /* enum */ J BASTION_POTION;
    private static  String[] lIlIIll;
    private static  int[] lIlIlII;
    public static final  /* enum */ J ANCIENT_BREW;
    private final  int percentage;
    public static final  /* enum */ J RANGING_POTION;
    private final  String name;
    private static final  J[] $VALUES;
    public static final  /* enum */ J SUPER_ATTACK;
    public static final  /* enum */ J DIVINE_MAGIC_POTION;
    private final  Skill[] skills;
    public static final  /* enum */ J DIVINE_SUPER_COMBAT;
    public static final  /* enum */ J MAGIC_POTION;
    public static final  /* enum */ J SUPER_STRENGTH;

    public int a(Skill skill) {
        return this.boostAmount + Skills.getLevel((Skiskill) * this.percentage / lIlIlII[0];
    }

        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIlll() {
        lIlIlII = new int[24];
        J.lIlIlII[0] = 0xF4 ^ 0x90;
        J.lIlIlII[1] = (0xD ^ 0x7B ^ (0xC3 ^ 0xB9)) & (127 + 104 - 138 + 54 ^ 89 + 111 - 187 + 146 ^ -1);
        J.lIlIlII[2] = 1;
        J.lIlIlII[3] = 0x22 ^ 0x27;
        J.lIlIlII[4] = 0x9F ^ 0x90;
        J.lIlIlII[5] = 3;
        J.lIlIlII[6] = 2;
        J.lIlIlII[7] = 73 + 98 - 98 + 105 ^ 100 + 31 - 90 + 141;
        J.lIlIlII[8] = 0x95 ^ 0x93;
        J.lIlIlII[9] = 0xB5 ^ 0xB2;
        J.lIlIlII[10] = 0x38 ^ 0x30;
        J.lIlIlII[11] = 0x47 ^ 0x2C ^ (0x41 ^ 0x23);
        J.lIlIlII[12] = 0x7A ^ 1 ^ (0xC4 ^ 0xB5);
        J.lIlIlII[13] = 0x41 ^ 0x4A;
        J.lIlIlII[14] = 0xC8 ^ 0xC4;
        J.lIlIlII[15] = 0x2E ^ 0x23;
        J.lIlIlII[16] = 3 ^ (0xA0 ^ 0xAD);
        J.lIlIlII[17] = 0x25 ^ 0x35;
        J.lIlIlII[18] = 0x8B ^ 0x9A;
        J.lIlIlII[19] = 0xE ^ 0x42 ^ (0x66 ^ 0x38);
        J.lIlIlII[20] = 0x29 ^ 0x3A;
        J.lIlIlII[21] = 6 ^ 0x12;
        J.lIlIlII[22] = 0x55 ^ 0xF ^ (0xE7 ^ 0xA8);
        J.lIlIlII[23] = 0x32 ^ 0x24;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public static J valueOf(String string) {
        return Enum.valueOf(GameEnum12.class, string);
    }

    public static J[] values() {
        return (J[])$VALUES.clone();
    }

    public Skill[] ay() {
        return this.skills;
    }

    public String ax() {
        return this.name;
    }

    private static String lIlIlIlII(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = lIlIlII[1];
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = lIlIlII[1];
        while (var18 < var17) {
            char var19 = var16[var18];
            var13.append((char)(var19 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private GameEnum12(String string2, int n3, int n4, Skill ... skillArray) {
        this.name = string2;
        this.percentage = n4;
        this.skills = skillArray;
        this.boostAmount = n3;
    }

    private static void lIlIlIllI() {
        lIlIIll = new String[lIlIlII[23]];
        J.lIlIIll[J.lIlIlII[1]] = "SUPER_COMBAT";
        J.lIlIIll[J.lIlIlII[2]] = "Super combat potion";
        J.lIlIIll[J.lIlIlII[6]] = "DIVINE_SUPER_COMBAT";
        J.lIlIIll[J.lIlIlII[5]] = "Divine super combat potion";
        J.lIlIIll[J.lIlIlII[7]] = "SUPER_STRENGTH";
        J.lIlIIll[J.lIlIlII[3]] = "Super strength";
        J.lIlIIll[J.lIlIlII[8]] = "SUPER_ATTACK";
        J.lIlIIll[J.lIlIlII[9]] = "Super attack";
        J.lIlIIll[J.lIlIlII[10]] = "SUPER_DEFENCE";
        J.lIlIIll[J.lIlIlII[11]] = "Super defence";
        J.lIlIIll[J.lIlIlII[12]] = "RANGING_POTION";
        J.lIlIIll[J.lIlIlII[13]] = "Ranging potion";
        J.lIlIIll[J.lIlIlII[14]] = "DIVINE_RANGING_POTION";
        J.lIlIIll[J.lIlIlII[15]] = "Divine ranging potion";
        J.lIlIIll[J.lIlIlII[16]] = "BASTION_POTION";
        J.lIlIIll[J.lIlIlII[4]] = "Bastion potion";
        J.lIlIIll[J.lIlIlII[17]] = "MAGIC_POTION";
        J.lIlIIll[J.lIlIlII[18]] = "Magic potion";
        J.lIlIIll[J.lIlIlII[19]] = "DIVINE_MAGIC_POTION";
        J.lIlIIll[J.lIlIlII[20]] = "Divine magic potion";
        J.lIlIIll[J.lIlIlII[21]] = "ANCIENT_BREW";
        J.lIlIIll[J.lIlIlII[22]] = "Ancient brew";
    }

}

