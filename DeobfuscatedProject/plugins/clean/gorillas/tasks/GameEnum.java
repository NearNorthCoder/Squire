/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 */
package gg.squire.gorillas.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    private GameEnum(String string2, int n3, int n4, Skill ... skillArray) {
        this.name = string2;
        this.percentage = n4;
        this.skills = skillArray;
        this.boostAmount = n3;
    }

    private static void lllllIlIllIllI() {
        llIIlIlIlIll = new String[llIIlIlIllII[23]];
        b.llIIlIlIlIll[b.llIIlIlIllII[1]] = "SUPER_COMBAT";
        b.llIIlIlIlIll[b.llIIlIlIllII[2]] = "Super combat potion";
        b.llIIlIlIlIll[b.llIIlIlIllII[6]] = "DIVINE_SUPER_COMBAT";
        b.llIIlIlIlIll[b.llIIlIlIllII[5]] = "Divine super combat potion";
        b.llIIlIlIlIll[b.llIIlIlIllII[7]] = "SUPER_STRENGTH";
        b.llIIlIlIlIll[b.llIIlIlIllII[3]] = "Super strength";
        b.llIIlIlIlIll[b.llIIlIlIllII[8]] = "SUPER_ATTACK";
        b.llIIlIlIlIll[b.llIIlIlIllII[9]] = "Super attack";
        b.llIIlIlIlIll[b.llIIlIlIllII[10]] = "SUPER_DEFENCE";
        b.llIIlIlIlIll[b.llIIlIlIllII[11]] = "Super defence";
        b.llIIlIlIlIll[b.llIIlIlIllII[12]] = "RANGING_POTION";
        b.llIIlIlIlIll[b.llIIlIlIllII[13]] = "Ranging potion";
        b.llIIlIlIlIll[b.llIIlIlIllII[14]] = "DIVINE_RANGING_POTION";
        b.llIIlIlIlIll[b.llIIlIlIllII[15]] = "Divine ranging potion";
        b.llIIlIlIlIll[b.llIIlIlIllII[16]] = "BASTION_POTION";
        b.llIIlIlIlIll[b.llIIlIlIllII[4]] = "Bastion potion";
        b.llIIlIlIlIll[b.llIIlIlIllII[17]] = "MAGIC_POTION";
        b.llIIlIlIlIll[b.llIIlIlIllII[18]] = "Magic potion";
        b.llIIlIlIlIll[b.llIIlIlIllII[19]] = "DIVINE_MAGIC_POTION";
        b.llIIlIlIlIll[b.llIIlIlIllII[20]] = "Divine magic potion";
        b.llIIlIlIlIll[b.llIIlIlIllII[21]] = "ANCIENT_BREW";
        b.llIIlIlIlIll[b.llIIlIlIllII[22]] = "Ancient brew";
    }

    public int a(Skill skill) {
        return this.boostAmount + Skills.getLevel((Skill)skill) * this.percentage / llIIlIlIllII[0];
    }

    static {
        b.lllllIlIllIlll();
        b.lllllIlIllIllI();
        Skill[] skillArray = new Skill[llIIlIlIllII[5]];
        skillArray[b.llIIlIlIllII[1]] = Skill.STRENGTH;
        skillArray[b.llIIlIlIllII[2]] = Skill.ATTACK;
        skillArray[b.llIIlIlIllII[6]] = Skill.DEFENCE;
        SUPER_COMBAT = new GameEnum(llIIlIlIlIll[llIIlIlIllII[2]], llIIlIlIllII[3], llIIlIlIllII[4], skillArray);
        Skill[] skillArray2 = new Skill[llIIlIlIllII[5]];
        skillArray2[b.llIIlIlIllII[1]] = Skill.STRENGTH;
        skillArray2[b.llIIlIlIllII[2]] = Skill.ATTACK;
        skillArray2[b.llIIlIlIllII[6]] = Skill.DEFENCE;
        DIVINE_SUPER_COMBAT = new GameEnum(llIIlIlIlIll[llIIlIlIllII[5]], llIIlIlIllII[3], llIIlIlIllII[4], skillArray2);
        Skill[] skillArray3 = new Skill[llIIlIlIllII[2]];
        skillArray3[b.llIIlIlIllII[1]] = Skill.STRENGTH;
        SUPER_STRENGTH = new GameEnum(llIIlIlIlIll[llIIlIlIllII[3]], llIIlIlIllII[3], llIIlIlIllII[4], skillArray3);
        Skill[] skillArray4 = new Skill[llIIlIlIllII[2]];
        skillArray4[b.llIIlIlIllII[1]] = Skill.ATTACK;
        SUPER_ATTACK = new GameEnum(llIIlIlIlIll[llIIlIlIllII[9]], llIIlIlIllII[3], llIIlIlIllII[4], skillArray4);
        Skill[] skillArray5 = new Skill[llIIlIlIllII[2]];
        skillArray5[b.llIIlIlIllII[1]] = Skill.DEFENCE;
        SUPER_DEFENCE = new GameEnum(llIIlIlIlIll[llIIlIlIllII[11]], llIIlIlIllII[3], llIIlIlIllII[4], skillArray5);
        Skill[] skillArray6 = new Skill[llIIlIlIllII[2]];
        skillArray6[b.llIIlIlIllII[1]] = Skill.RANGED;
        RANGING_POTION = new GameEnum(llIIlIlIlIll[llIIlIlIllII[13]], llIIlIlIllII[7], llIIlIlIllII[12], skillArray6);
        Skill[] skillArray7 = new Skill[llIIlIlIllII[2]];
        skillArray7[b.llIIlIlIllII[1]] = Skill.RANGED;
        DIVINE_RANGING_POTION = new GameEnum(llIIlIlIlIll[llIIlIlIllII[15]], llIIlIlIllII[7], llIIlIlIllII[12], skillArray7);
        Skill[] skillArray8 = new Skill[llIIlIlIllII[6]];
        skillArray8[b.llIIlIlIllII[1]] = Skill.RANGED;
        skillArray8[b.llIIlIlIllII[2]] = Skill.DEFENCE;
        BASTION_POTION = new GameEnum(llIIlIlIlIll[llIIlIlIllII[4]], llIIlIlIllII[7], llIIlIlIllII[12], skillArray8);
        Skill[] skillArray9 = new Skill[llIIlIlIllII[2]];
        skillArray9[b.llIIlIlIllII[1]] = Skill.MAGIC;
        MAGIC_POTION = new GameEnum(llIIlIlIlIll[llIIlIlIllII[18]], llIIlIlIllII[7], llIIlIlIllII[1], skillArray9);
        Skill[] skillArray10 = new Skill[llIIlIlIllII[2]];
        skillArray10[b.llIIlIlIllII[1]] = Skill.MAGIC;
        DIVINE_MAGIC_POTION = new GameEnum(llIIlIlIlIll[llIIlIlIllII[20]], llIIlIlIllII[7], llIIlIlIllII[1], skillArray10);
        Skill[] skillArray11 = new Skill[llIIlIlIllII[2]];
        skillArray11[b.llIIlIlIllII[1]] = Skill.MAGIC;
        ANCIENT_BREW = new GameEnum(llIIlIlIlIll[llIIlIlIllII[22]], llIIlIlIllII[6], llIIlIlIllII[3], skillArray11);
        b[] bArray = new b[llIIlIlIllII[13]];
        bArray[b.llIIlIlIllII[1]] = SUPER_COMBAT;
        bArray[b.llIIlIlIllII[2]] = DIVINE_SUPER_COMBAT;
        bArray[b.llIIlIlIllII[6]] = SUPER_STRENGTH;
        bArray[b.llIIlIlIllII[5]] = SUPER_ATTACK;
        bArray[b.llIIlIlIllII[7]] = SUPER_DEFENCE;
        bArray[b.llIIlIlIllII[3]] = RANGING_POTION;
        bArray[b.llIIlIlIllII[8]] = DIVINE_RANGING_POTION;
        bArray[b.llIIlIlIllII[9]] = BASTION_POTION;
        bArray[b.llIIlIlIllII[10]] = MAGIC_POTION;
        bArray[b.llIIlIlIllII[11]] = DIVINE_MAGIC_POTION;
        bArray[b.llIIlIlIllII[12]] = ANCIENT_BREW;
        $VALUES = bArray;
    }

        return String.valueOf(var1);
    }

    public Skill[] k() {
        return this.skills;
    }

    public String j() {
        return this.name;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    private static boolean lllllIlIlllIII(int n2, int n3) {
        return n2 < n3;
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }
}

