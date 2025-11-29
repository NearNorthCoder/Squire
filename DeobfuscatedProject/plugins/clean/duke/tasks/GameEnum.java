/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 */
package gg.squire.duke.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
        return this.boostAmount + Skills.getLevel((Skill)skill) * this.percentage / lIllIllIlllI[0];
    }

    private GameEnum(String string2, int n3, int n4, Skill ... skillArray) {
        this.name = string2;
        this.percentage = n4;
        this.skills = skillArray;
        this.boostAmount = n3;
    }

    private static void lllIlIIlIlllIl() {
        lIllIllIlIII = new String[lIllIllIlllI[25]];
        c.lIllIllIlIII[c.lIllIllIlllI[1]] = "SUPER_COMBAT";
        c.lIllIllIlIII[c.lIllIllIlllI[2]] = "Super combat potion";
        c.lIllIllIlIII[c.lIllIllIlllI[6]] = "SUPER_STRENGTH";
        c.lIllIllIlIII[c.lIllIllIlllI[5]] = "Super strength";
        c.lIllIllIlIII[c.lIllIllIlllI[7]] = "SUPER_ATTACK";
        c.lIllIllIlIII[c.lIllIllIlllI[3]] = "Super attack";
        c.lIllIllIlIII[c.lIllIllIlllI[8]] = "SUPER_DEFENCE";
        c.lIllIllIlIII[c.lIllIllIlllI[9]] = "Super defence";
        c.lIllIllIlIII[c.lIllIllIlllI[10]] = "DIVINE_SUPER_COMBAT";
        c.lIllIllIlIII[c.lIllIllIlllI[11]] = "Divine super combat potion";
        c.lIllIllIlIII[c.lIllIllIlllI[12]] = "RANGING_POTION";
        c.lIllIllIlIII[c.lIllIllIlllI[13]] = "Ranging potion";
        c.lIllIllIlIII[c.lIllIllIlllI[14]] = "DIVINE_RANGING_POTION";
        c.lIllIllIlIII[c.lIllIllIlllI[15]] = "Divine ranging potion";
        c.lIllIllIlIII[c.lIllIllIlllI[16]] = "BASTION_POTION";
        c.lIllIllIlIII[c.lIllIllIlllI[4]] = "Bastion potion";
        c.lIllIllIlIII[c.lIllIllIlllI[17]] = "DIVINE_BASTION_POTION";
        c.lIllIllIlIII[c.lIllIllIlllI[18]] = "Divine bastion potion";
        c.lIllIllIlIII[c.lIllIllIlllI[19]] = "MAGIC_POTION";
        c.lIllIllIlIII[c.lIllIllIlllI[20]] = "Magic potion";
        c.lIllIllIlIII[c.lIllIllIlllI[21]] = "DIVINE_MAGIC_POTION";
        c.lIllIllIlIII[c.lIllIllIlllI[22]] = "Divine magic potion";
        c.lIllIllIlIII[c.lIllIllIlllI[23]] = "ANCIENT_BREW";
        c.lIllIllIlIII[c.lIllIllIlllI[24]] = "Ancient brew";
    }

        return String.valueOf(var1);
    }

    static {
        c.lllIlIIllIIlII();
        c.lllIlIIlIlllIl();
        Skill[] skillArray = new Skill[lIllIllIlllI[5]];
        skillArray[c.lIllIllIlllI[1]] = Skill.STRENGTH;
        skillArray[c.lIllIllIlllI[2]] = Skill.ATTACK;
        skillArray[c.lIllIllIlllI[6]] = Skill.DEFENCE;
        SUPER_COMBAT = new GameEnum(lIllIllIlIII[lIllIllIlllI[2]], lIllIllIlllI[3], lIllIllIlllI[4], skillArray);
        Skill[] skillArray2 = new Skill[lIllIllIlllI[2]];
        skillArray2[c.lIllIllIlllI[1]] = Skill.STRENGTH;
        SUPER_STRENGTH = new GameEnum(lIllIllIlIII[lIllIllIlllI[5]], lIllIllIlllI[3], lIllIllIlllI[4], skillArray2);
        Skill[] skillArray3 = new Skill[lIllIllIlllI[2]];
        skillArray3[c.lIllIllIlllI[1]] = Skill.ATTACK;
        SUPER_ATTACK = new GameEnum(lIllIllIlIII[lIllIllIlllI[3]], lIllIllIlllI[3], lIllIllIlllI[4], skillArray3);
        Skill[] skillArray4 = new Skill[lIllIllIlllI[2]];
        skillArray4[c.lIllIllIlllI[1]] = Skill.DEFENCE;
        SUPER_DEFENCE = new GameEnum(lIllIllIlIII[lIllIllIlllI[9]], lIllIllIlllI[3], lIllIllIlllI[4], skillArray4);
        Skill[] skillArray5 = new Skill[lIllIllIlllI[5]];
        skillArray5[c.lIllIllIlllI[1]] = Skill.STRENGTH;
        skillArray5[c.lIllIllIlllI[2]] = Skill.ATTACK;
        skillArray5[c.lIllIllIlllI[6]] = Skill.DEFENCE;
        DIVINE_SUPER_COMBAT = new GameEnum(lIllIllIlIII[lIllIllIlllI[11]], lIllIllIlllI[3], lIllIllIlllI[4], skillArray5);
        Skill[] skillArray6 = new Skill[lIllIllIlllI[2]];
        skillArray6[c.lIllIllIlllI[1]] = Skill.RANGED;
        RANGING_POTION = new GameEnum(lIllIllIlIII[lIllIllIlllI[13]], lIllIllIlllI[7], lIllIllIlllI[12], skillArray6);
        Skill[] skillArray7 = new Skill[lIllIllIlllI[2]];
        skillArray7[c.lIllIllIlllI[1]] = Skill.RANGED;
        DIVINE_RANGING_POTION = new GameEnum(lIllIllIlIII[lIllIllIlllI[15]], lIllIllIlllI[7], lIllIllIlllI[12], skillArray7);
        Skill[] skillArray8 = new Skill[lIllIllIlllI[6]];
        skillArray8[c.lIllIllIlllI[1]] = Skill.RANGED;
        skillArray8[c.lIllIllIlllI[2]] = Skill.DEFENCE;
        BASTION_POTION = new GameEnum(lIllIllIlIII[lIllIllIlllI[4]], lIllIllIlllI[7], lIllIllIlllI[12], skillArray8);
        Skill[] skillArray9 = new Skill[lIllIllIlllI[6]];
        skillArray9[c.lIllIllIlllI[1]] = Skill.RANGED;
        skillArray9[c.lIllIllIlllI[2]] = Skill.DEFENCE;
        DIVINE_BASTION_POTION = new GameEnum(lIllIllIlIII[lIllIllIlllI[18]], lIllIllIlllI[7], lIllIllIlllI[12], skillArray9);
        Skill[] skillArray10 = new Skill[lIllIllIlllI[2]];
        skillArray10[c.lIllIllIlllI[1]] = Skill.MAGIC;
        MAGIC_POTION = new GameEnum(lIllIllIlIII[lIllIllIlllI[20]], lIllIllIlllI[7], lIllIllIlllI[1], skillArray10);
        Skill[] skillArray11 = new Skill[lIllIllIlllI[2]];
        skillArray11[c.lIllIllIlllI[1]] = Skill.MAGIC;
        DIVINE_MAGIC_POTION = new GameEnum(lIllIllIlIII[lIllIllIlllI[22]], lIllIllIlllI[7], lIllIllIlllI[1], skillArray11);
        Skill[] skillArray12 = new Skill[lIllIllIlllI[2]];
        skillArray12[c.lIllIllIlllI[1]] = Skill.MAGIC;
        ANCIENT_BREW = new GameEnum(lIllIllIlIII[lIllIllIlllI[24]], lIllIllIlllI[6], lIllIllIlllI[3], skillArray12);
        c[] cArray = new c[lIllIllIlllI[14]];
        cArray[c.lIllIllIlllI[1]] = SUPER_COMBAT;
        cArray[c.lIllIllIlllI[2]] = SUPER_STRENGTH;
        cArray[c.lIllIllIlllI[6]] = SUPER_ATTACK;
        cArray[c.lIllIllIlllI[5]] = SUPER_DEFENCE;
        cArray[c.lIllIllIlllI[7]] = DIVINE_SUPER_COMBAT;
        cArray[c.lIllIllIlllI[3]] = RANGING_POTION;
        cArray[c.lIllIllIlllI[8]] = DIVINE_RANGING_POTION;
        cArray[c.lIllIllIlllI[9]] = BASTION_POTION;
        cArray[c.lIllIllIlllI[10]] = DIVINE_BASTION_POTION;
        cArray[c.lIllIllIlllI[11]] = MAGIC_POTION;
        cArray[c.lIllIllIlllI[12]] = DIVINE_MAGIC_POTION;
        cArray[c.lIllIllIlllI[13]] = ANCIENT_BREW;
        $VALUES = cArray;
    }

    private static boolean lllIlIIllIIlIl(int n2, int n3) {
        return n2 < n3;
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

