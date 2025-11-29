/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 */
package gg.squire.duke.tasks;

import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;

public final class GameEnum
extends Enum<c> {
    
    private static final  c[] $VALUES;
    public static final  /* enum */ c RANGING_POTION;
    public static final  /* enum */ c BASTION_POTION;
    public static final  /* enum */ c ANCIENT_BREW;
    
    private final  int boostAmount;
    public static final  /* enum */ c DIVINE_SUPER_COMBAT;
    public static final  /* enum */ c SUPER_COMBAT;
    public static final  /* enum */ c DIVINE_RANGING_POTION;
    private final  Skill[] skills;
    public static final  /* enum */ c MAGIC_POTION;
    public static final  /* enum */ c SUPER_ATTACK;
    public static final  /* enum */ c SUPER_DEFENCE;
    private final  int percentage;
    private final  String name;
    public static final  /* enum */ c SUPER_STRENGTH;
    public static final  /* enum */ c DIVINE_MAGIC_POTION;
    public static final  /* enum */ c DIVINE_BASTION_POTION;

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public int a(Skill skill) {
        return this.boostAmount + Skills.getLevel((Skiskill) * this.percentage / 0;
    }

    private GameEnum(String string2, int n3, int n4, Skill ... skillArray) {
        this.name = string2;
        this.percentage = n4;
        this.skills = skillArray;
        this.boostAmount = n3;
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 1;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 1;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (3 > 1) continue;
            return null;
        }
        return String.valueOf(var6);
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    static {
        c.var19();
        c.var20();
        Skill[] skillArray = new Skill[5];
        skillArray[1] = Skill.STRENGTH;
        skillArray[2] = Skill.ATTACK;
        skillArray[6] = Skill.DEFENCE;
        SUPER_COMBAT = new GameEnum(var2[2], 3, 4, skillArray);
        Skill[] skillArray2 = new Skill[2];
        skillArray2[1] = Skill.STRENGTH;
        SUPER_STRENGTH = new GameEnum(var2[5], 3, 4, skillArray2);
        Skill[] skillArray3 = new Skill[2];
        skillArray3[1] = Skill.ATTACK;
        SUPER_ATTACK = new GameEnum(var2[3], 3, 4, skillArray3);
        Skill[] skillArray4 = new Skill[2];
        skillArray4[1] = Skill.DEFENCE;
        SUPER_DEFENCE = new GameEnum(var2[9], 3, 4, skillArray4);
        Skill[] skillArray5 = new Skill[5];
        skillArray5[1] = Skill.STRENGTH;
        skillArray5[2] = Skill.ATTACK;
        skillArray5[6] = Skill.DEFENCE;
        DIVINE_SUPER_COMBAT = new GameEnum(var2[var1[11]], 3, 4, skillArray5);
        Skill[] skillArray6 = new Skill[2];
        skillArray6[1] = Skill.RANGED;
        RANGING_POTION = new GameEnum(var2[var1[13]], 7, var1[12], skillArray6);
        Skill[] skillArray7 = new Skill[2];
        skillArray7[1] = Skill.RANGED;
        DIVINE_RANGING_POTION = new GameEnum(var2[var1[15]], 7, var1[12], skillArray7);
        Skill[] skillArray8 = new Skill[6];
        skillArray8[1] = Skill.RANGED;
        skillArray8[2] = Skill.DEFENCE;
        BASTION_POTION = new GameEnum(var2[4], 7, var1[12], skillArray8);
        Skill[] skillArray9 = new Skill[6];
        skillArray9[1] = Skill.RANGED;
        skillArray9[2] = Skill.DEFENCE;
        DIVINE_BASTION_POTION = new GameEnum(var2[var1[18]], 7, var1[12], skillArray9);
        Skill[] skillArray10 = new Skill[2];
        skillArray10[1] = Skill.MAGIC;
        MAGIC_POTION = new GameEnum(var2[var1[20]], 7, 1, skillArray10);
        Skill[] skillArray11 = new Skill[2];
        skillArray11[1] = Skill.MAGIC;
        DIVINE_MAGIC_POTION = new GameEnum(var2[var1[22]], 7, 1, skillArray11);
        Skill[] skillArray12 = new Skill[2];
        skillArray12[1] = Skill.MAGIC;
        ANCIENT_BREW = new GameEnum(var2[var1[24]], 6, 3, skillArray12);
        c[] cArray = new c[var1[14]];
        cArray[1] = SUPER_COMBAT;
        cArray[2] = SUPER_STRENGTH;
        cArray[6] = SUPER_ATTACK;
        cArray[5] = SUPER_DEFENCE;
        cArray[7] = DIVINE_SUPER_COMBAT;
        cArray[3] = RANGING_POTION;
        cArray[8] = DIVINE_RANGING_POTION;
        cArray[9] = BASTION_POTION;
        cArray[c.var1[10]] = DIVINE_BASTION_POTION;
        cArray[c.var1[11]] = MAGIC_POTION;
        cArray[c.var1[12]] = DIVINE_MAGIC_POTION;
        cArray[c.var1[13]] = ANCIENT_BREW;
        $VALUES = cArray;
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    public Skill[] F() {
        return this.skills;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public String E() {
        return this.name;
    }
}

