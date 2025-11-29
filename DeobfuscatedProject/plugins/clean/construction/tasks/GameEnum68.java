/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 */
package gg.squire.construction.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;

public final class GameEnum68
extends Enum<J> {
    public static final  /* enum */ J SUPER_DEFENCE;
    private final  int boostAmount;
    public static final  /* enum */ J DIVINE_RANGING_POTION;
    public static final  /* enum */ J SUPER_COMBAT;
    public static final  /* enum */ J BASTION_POTION;

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
        return this.boostAmount + Skills.getLevel((Skill)skill) * this.percentage / lIlIlII[0];
    }

    public static J valueOf(String string) {
        return Enum.valueOf(GameEnum68.class, string);
    }

    private static boolean llIIIllII(int n2, int n3) {
        return n2 < n3;
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

        return String.valueOf(lllIlIlIIllIIlI);
    }

    private GameEnum68(String string2, int n3, int n4, Skill ... skillArray) {
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

    static {
        J.lIlIlIlll();
        J.lIlIlIllI();
        Skill[] skillArray = new Skill[lIlIlII[5]];
        skillArray[J.lIlIlII[1]] = Skill.STRENGTH;
        skillArray[J.lIlIlII[2]] = Skill.ATTACK;
        skillArray[J.lIlIlII[6]] = Skill.DEFENCE;
        SUPER_COMBAT = new GameEnum68(lIlIIll[lIlIlII[2]], lIlIlII[3], lIlIlII[4], skillArray);
        Skill[] skillArray2 = new Skill[lIlIlII[5]];
        skillArray2[J.lIlIlII[1]] = Skill.STRENGTH;
        skillArray2[J.lIlIlII[2]] = Skill.ATTACK;
        skillArray2[J.lIlIlII[6]] = Skill.DEFENCE;
        DIVINE_SUPER_COMBAT = new GameEnum68(lIlIIll[lIlIlII[5]], lIlIlII[3], lIlIlII[4], skillArray2);
        Skill[] skillArray3 = new Skill[lIlIlII[2]];
        skillArray3[J.lIlIlII[1]] = Skill.STRENGTH;
        SUPER_STRENGTH = new GameEnum68(lIlIIll[lIlIlII[3]], lIlIlII[3], lIlIlII[4], skillArray3);
        Skill[] skillArray4 = new Skill[lIlIlII[2]];
        skillArray4[J.lIlIlII[1]] = Skill.ATTACK;
        SUPER_ATTACK = new GameEnum68(lIlIIll[lIlIlII[9]], lIlIlII[3], lIlIlII[4], skillArray4);
        Skill[] skillArray5 = new Skill[lIlIlII[2]];
        skillArray5[J.lIlIlII[1]] = Skill.DEFENCE;
        SUPER_DEFENCE = new GameEnum68(lIlIIll[lIlIlII[11]], lIlIlII[3], lIlIlII[4], skillArray5);
        Skill[] skillArray6 = new Skill[lIlIlII[2]];
        skillArray6[J.lIlIlII[1]] = Skill.RANGED;
        RANGING_POTION = new GameEnum68(lIlIIll[lIlIlII[13]], lIlIlII[7], lIlIlII[12], skillArray6);
        Skill[] skillArray7 = new Skill[lIlIlII[2]];
        skillArray7[J.lIlIlII[1]] = Skill.RANGED;
        DIVINE_RANGING_POTION = new GameEnum68(lIlIIll[lIlIlII[15]], lIlIlII[7], lIlIlII[12], skillArray7);
        Skill[] skillArray8 = new Skill[lIlIlII[6]];
        skillArray8[J.lIlIlII[1]] = Skill.RANGED;
        skillArray8[J.lIlIlII[2]] = Skill.DEFENCE;
        BASTION_POTION = new GameEnum68(lIlIIll[lIlIlII[4]], lIlIlII[7], lIlIlII[12], skillArray8);
        Skill[] skillArray9 = new Skill[lIlIlII[2]];
        skillArray9[J.lIlIlII[1]] = Skill.MAGIC;
        MAGIC_POTION = new GameEnum68(lIlIIll[lIlIlII[18]], lIlIlII[7], lIlIlII[1], skillArray9);
        Skill[] skillArray10 = new Skill[lIlIlII[2]];
        skillArray10[J.lIlIlII[1]] = Skill.MAGIC;
        DIVINE_MAGIC_POTION = new GameEnum68(lIlIIll[lIlIlII[20]], lIlIlII[7], lIlIlII[1], skillArray10);
        Skill[] skillArray11 = new Skill[lIlIlII[2]];
        skillArray11[J.lIlIlII[1]] = Skill.MAGIC;
        ANCIENT_BREW = new GameEnum68(lIlIIll[lIlIlII[22]], lIlIlII[6], lIlIlII[3], skillArray11);
        J[] jArray = new J[lIlIlII[13]];
        jArray[J.lIlIlII[1]] = SUPER_COMBAT;
        jArray[J.lIlIlII[2]] = DIVINE_SUPER_COMBAT;
        jArray[J.lIlIlII[6]] = SUPER_STRENGTH;
        jArray[J.lIlIlII[5]] = SUPER_ATTACK;
        jArray[J.lIlIlII[7]] = SUPER_DEFENCE;
        jArray[J.lIlIlII[3]] = RANGING_POTION;
        jArray[J.lIlIlII[8]] = DIVINE_RANGING_POTION;
        jArray[J.lIlIlII[9]] = BASTION_POTION;
        jArray[J.lIlIlII[10]] = MAGIC_POTION;
        jArray[J.lIlIlII[11]] = DIVINE_MAGIC_POTION;
        jArray[J.lIlIlII[12]] = ANCIENT_BREW;
        $VALUES = jArray;
    }
}

