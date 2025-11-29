/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 */
package gg.squire.vardorvis.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;

public final class GameEnum8
extends Enum<k> {
    public static final  /* enum */ k CASTING;
    private final  String name;
    public static final  /* enum */ k CONTROLLED;
    public static final  /* enum */ k DEFENSIVE;
    private static final  k[] $VALUES;
    public static final  /* enum */ k OTHER;
    public static final  /* enum */ k LONGRANGE;
    public static final  /* enum */ k RANGING;
    public static final  /* enum */ k ACCURATE;
    
    private final  Skill[] skills;
    public static final  /* enum */ k DEFENSIVE_CASTING;
    
    public static final  /* enum */ k AGGRESSIVE;

    private static boolean lIlllllIIIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    public static k[] values() {
        return (k[])$VALUES.clone();
    }

    private static void lIlllllIIIIllll() {
        lIlIlIIlIIlIl = new String[lIlIlIIllIIll[18]];
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[0]] = "ACCURATE";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[1]] = "Accurate";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[2]] = "AGGRESSIVE";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[3]] = "Aggressive";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[4]] = "DEFENSIVE";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[5]] = "Defensive";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[6]] = "CONTROLLED";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[7]] = "Controlled";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[8]] = "RANGING";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[9]] = "Ranging";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[10]] = "LONGRANGE";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[11]] = "Longrange";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[12]] = "CASTING";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[13]] = "Casting";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[14]] = "DEFENSIVE_CASTING";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[15]] = "Defensive Casting";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[16]] = "OTHER";
        k.lIlIlIIlIIlIl[k.lIlIlIIllIIll[17]] = "Other";
    }

        return String.valueOf(var1);
    }

    static {
        k.lIlllllIIIlIIII();
        k.lIlllllIIIIllll();
        Skill[] skillArray = new Skill[lIlIlIIllIIll[1]];
        skillArray[k.lIlIlIIllIIll[0]] = Skill.ATTACK;
        ACCURATE = new GameEnum8(lIlIlIIlIIlIl[lIlIlIIllIIll[1]], skillArray);
        Skill[] skillArray2 = new Skill[lIlIlIIllIIll[1]];
        skillArray2[k.lIlIlIIllIIll[0]] = Skill.STRENGTH;
        AGGRESSIVE = new GameEnum8(lIlIlIIlIIlIl[lIlIlIIllIIll[3]], skillArray2);
        Skill[] skillArray3 = new Skill[lIlIlIIllIIll[1]];
        skillArray3[k.lIlIlIIllIIll[0]] = Skill.DEFENCE;
        DEFENSIVE = new GameEnum8(lIlIlIIlIIlIl[lIlIlIIllIIll[5]], skillArray3);
        Skill[] skillArray4 = new Skill[lIlIlIIllIIll[3]];
        skillArray4[k.lIlIlIIllIIll[0]] = Skill.ATTACK;
        skillArray4[k.lIlIlIIllIIll[1]] = Skill.STRENGTH;
        skillArray4[k.lIlIlIIllIIll[2]] = Skill.DEFENCE;
        CONTROLLED = new GameEnum8(lIlIlIIlIIlIl[lIlIlIIllIIll[7]], skillArray4);
        Skill[] skillArray5 = new Skill[lIlIlIIllIIll[1]];
        skillArray5[k.lIlIlIIllIIll[0]] = Skill.RANGED;
        RANGING = new GameEnum8(lIlIlIIlIIlIl[lIlIlIIllIIll[9]], skillArray5);
        Skill[] skillArray6 = new Skill[lIlIlIIllIIll[2]];
        skillArray6[k.lIlIlIIllIIll[0]] = Skill.RANGED;
        skillArray6[k.lIlIlIIllIIll[1]] = Skill.DEFENCE;
        LONGRANGE = new GameEnum8(lIlIlIIlIIlIl[lIlIlIIllIIll[11]], skillArray6);
        Skill[] skillArray7 = new Skill[lIlIlIIllIIll[1]];
        skillArray7[k.lIlIlIIllIIll[0]] = Skill.MAGIC;
        CASTING = new GameEnum8(lIlIlIIlIIlIl[lIlIlIIllIIll[13]], skillArray7);
        Skill[] skillArray8 = new Skill[lIlIlIIllIIll[2]];
        skillArray8[k.lIlIlIIllIIll[0]] = Skill.MAGIC;
        skillArray8[k.lIlIlIIllIIll[1]] = Skill.DEFENCE;
        DEFENSIVE_CASTING = new GameEnum8(lIlIlIIlIIlIl[lIlIlIIllIIll[15]], skillArray8);
        OTHER = new GameEnum8(lIlIlIIlIIlIl[lIlIlIIllIIll[17]], new Skill[lIlIlIIllIIll[0]]);
        k[] kArray = new k[lIlIlIIllIIll[9]];
        kArray[k.lIlIlIIllIIll[0]] = ACCURATE;
        kArray[k.lIlIlIIllIIll[1]] = AGGRESSIVE;
        kArray[k.lIlIlIIllIIll[2]] = DEFENSIVE;
        kArray[k.lIlIlIIllIIll[3]] = CONTROLLED;
        kArray[k.lIlIlIIllIIll[4]] = RANGING;
        kArray[k.lIlIlIIllIIll[5]] = LONGRANGE;
        kArray[k.lIlIlIIllIIll[6]] = CASTING;
        kArray[k.lIlIlIIllIIll[7]] = DEFENSIVE_CASTING;
        kArray[k.lIlIlIIllIIll[8]] = OTHER;
        $VALUES = kArray;
    }

    private GameEnum8(String string2, Skill ... skillArray) {
        this.name = string2;
        this.skills = skillArray;
    }

    public Skill[] N() {
        return this.skills;
    }

    public static k valueOf(String string) {
        return Enum.valueOf(GameEnum8.class, string);
    }

    public String M() {
        return this.name;
    }
}

