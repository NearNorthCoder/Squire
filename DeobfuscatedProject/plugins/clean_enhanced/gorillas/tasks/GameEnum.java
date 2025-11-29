/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 */
package gg.squire.gorillas.tasks;

import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;

public final class GameEnum
extends Enum<b> {
    private final  Skill[] skills;
    public static final  /* enum */ b BASTION_POTION;
    public static final  /* enum */ b DIVINE_RANGING_POTION;
    public static final  /* enum */ b DIVINE_MAGIC_POTION;
    public static final  /* enum */ b DIVINE_SUPER_COMBAT;
    private final  String name;
    public static final  /* enum */ b RANGING_POTION;

    public static final  /* enum */ b MAGIC_POTION;
    public static final  /* enum */ b SUPER_ATTACK;
    public static final  /* enum */ b SUPER_DEFENCE;
    private static final  b[] $VALUES;
    private final  int percentage;
    public static final  /* enum */ b ANCIENT_BREW;
    public static final  /* enum */ b SUPER_STRENGTH;
    public static final  /* enum */ b SUPER_COMBAT;
    private final  int boostAmount;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private GameEnum(String string2, int n3, int n4, Skill ... skillArray) {
        this.name = string2;
        this.percentage = n4;
        this.skills = skillArray;
        this.boostAmount = n3;
    }

    public int a(Skill skill) {
        return this.boostAmount + Skills.getLevel((Skiskill) * this.percentage / 0;
    }

    static {
        b.var9();
        b.var10();
        Skill[] skillArray = new Skill[5];
        skillArray[1] = Skill.STRENGTH;
        skillArray[2] = Skill.ATTACK;
        skillArray[6] = Skill.DEFENCE;
        SUPER_COMBAT = new GameEnum(var1[2], 3, 4, skillArray);
        Skill[] skillArray2 = new Skill[5];
        skillArray2[1] = Skill.STRENGTH;
        skillArray2[2] = Skill.ATTACK;
        skillArray2[6] = Skill.DEFENCE;
        DIVINE_SUPER_COMBAT = new GameEnum(var1[5], 3, 4, skillArray2);
        Skill[] skillArray3 = new Skill[2];
        skillArray3[1] = Skill.STRENGTH;
        SUPER_STRENGTH = new GameEnum(var1[3], 3, 4, skillArray3);
        Skill[] skillArray4 = new Skill[2];
        skillArray4[1] = Skill.ATTACK;
        SUPER_ATTACK = new GameEnum(var1[9], 3, 4, skillArray4);
        Skill[] skillArray5 = new Skill[2];
        skillArray5[1] = Skill.DEFENCE;
        SUPER_DEFENCE = new GameEnum(var1[var2[11]], 3, 4, skillArray5);
        Skill[] skillArray6 = new Skill[2];
        skillArray6[1] = Skill.RANGED;
        RANGING_POTION = new GameEnum(var1[var2[13]], 7, var2[12], skillArray6);
        Skill[] skillArray7 = new Skill[2];
        skillArray7[1] = Skill.RANGED;
        DIVINE_RANGING_POTION = new GameEnum(var1[var2[15]], 7, var2[12], skillArray7);
        Skill[] skillArray8 = new Skill[6];
        skillArray8[1] = Skill.RANGED;
        skillArray8[2] = Skill.DEFENCE;
        BASTION_POTION = new GameEnum(var1[4], 7, var2[12], skillArray8);
        Skill[] skillArray9 = new Skill[2];
        skillArray9[1] = Skill.MAGIC;
        MAGIC_POTION = new GameEnum(var1[var2[18]], 7, 1, skillArray9);
        Skill[] skillArray10 = new Skill[2];
        skillArray10[1] = Skill.MAGIC;
        DIVINE_MAGIC_POTION = new GameEnum(var1[var2[20]], 7, 1, skillArray10);
        Skill[] skillArray11 = new Skill[2];
        skillArray11[1] = Skill.MAGIC;
        ANCIENT_BREW = new GameEnum(var1[var2[22]], 6, 3, skillArray11);
        b[] bArray = new b[var2[13]];
        bArray[1] = SUPER_COMBAT;
        bArray[2] = DIVINE_SUPER_COMBAT;
        bArray[6] = SUPER_STRENGTH;
        bArray[5] = SUPER_ATTACK;
        bArray[7] = SUPER_DEFENCE;
        bArray[3] = RANGING_POTION;
        bArray[8] = DIVINE_RANGING_POTION;
        bArray[9] = BASTION_POTION;
        bArray[b.var2[10]] = MAGIC_POTION;
        bArray[b.var2[11]] = DIVINE_MAGIC_POTION;
        bArray[b.var2[12]] = ANCIENT_BREW;
        $VALUES = bArray;
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = 1;
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = 1;
        while (var19 < var18) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    public Skill[] k() {
        return this.skills;
    }

    public String j() {
        return this.name;
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    public static b valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }
}

