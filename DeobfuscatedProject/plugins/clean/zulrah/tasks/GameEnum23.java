/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 */
package gg.squire.zulrah.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;

public final class GameEnum23
extends Enum<i> {
    private static final  i[] $VALUES;
    private final  Skill skill;
    public static final  /* enum */ i NONE;
    public static final  /* enum */ i DIVINE_BASTION;
    
    public static final  /* enum */ i RANGING_POTION;
    public static final  /* enum */ i BASTION_POTION;
    private final  String name;
    
    public static final  /* enum */ i MAGIC_POTION;
    public static final  /* enum */ i DIVINE_RANGING;
    public static final  /* enum */ i DIVINE_MAGIC_POTION;

    static {
        i.llIIlIlIIIIllIl();
        i.llIIlIlIIIIllII();
        RANGING_POTION = new GameEnum23(lIllIlllllIll[lIllIlllllllI[0]], Skill.RANGED);
        DIVINE_RANGING = new GameEnum23(lIllIlllllIll[lIllIlllllllI[4]], Skill.RANGED);
        BASTION_POTION = new GameEnum23(lIllIlllllIll[lIllIlllllllI[6]], Skill.RANGED);
        DIVINE_BASTION = new GameEnum23(lIllIlllllIll[lIllIlllllllI[7]], Skill.RANGED);
        MAGIC_POTION = new GameEnum23(lIllIlllllIll[lIllIlllllllI[9]], Skill.MAGIC);
        DIVINE_MAGIC_POTION = new GameEnum23(lIllIlllllIll[lIllIlllllllI[11]], Skill.MAGIC);
        NONE = new GameEnum23(lIllIlllllIll[lIllIlllllllI[13]], null);
        i[] iArray = new i[lIllIlllllllI[7]];
        iArray[i.lIllIlllllllI[2]] = RANGING_POTION;
        iArray[i.lIllIlllllllI[0]] = DIVINE_RANGING;
        iArray[i.lIllIlllllllI[3]] = BASTION_POTION;
        iArray[i.lIllIlllllllI[4]] = DIVINE_BASTION;
        iArray[i.lIllIlllllllI[5]] = MAGIC_POTION;
        iArray[i.lIllIlllllllI[6]] = DIVINE_MAGIC_POTION;
        iArray[i.lIllIlllllllI[1]] = NONE;
        $VALUES = iArray;
    }

    private static boolean llIIlIlIIIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    private static boolean llIIlIlIIIlIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIlIlIIIIllll(Object object, Object object2) {
        return object == object2;
    }

        return String.valueOf(var1);
    }

    private static boolean llIIlIlIIIIlllI(Object object) {
        return object == null;
    }

    public String k() {
        return this.name;
    }

    public boolean v() {
        boolean bl;
        int n2;
        i var2;
        if (i.llIIlIlIIIIlllI(this.skill)) {
            return lIllIlllllllI[0];
        }
        int n3 = Skills.getBoostedLevel((Skill)var2.skill);
        int n4 = Skills.getLevel((Skill)var2.skill);
        if (i.llIIlIlIIIIllll((Object)var2, (Object)MAGIC_POTION)) {
            n2 = lIllIlllllllI[0];

            if (2 < ((0x35 ^ 0x16) & ~(0x92 ^ 0xB1))) {
                return false;
            }
        } else {
            n2 = lIllIlllllllI[1];
        }
        if (i.llIIlIlIIIlIIII(n3, n4 + n2)) {
            bl = lIllIlllllllI[0];

        } else {
            bl = lIllIlllllllI[2];
        }
        return bl;
    }

    private GameEnum23(String string2, Skill skill) {
        this.name = string2;
        this.skill = skill;
    }

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum23.class, string);
    }

    private static void llIIlIlIIIIllII() {
        lIllIlllllIll = new String[lIllIlllllllI[14]];
        i.lIllIlllllIll[i.lIllIlllllllI[2]] = "RANGING_POTION";
        i.lIllIlllllIll[i.lIllIlllllllI[0]] = "Ranging potion";
        i.lIllIlllllIll[i.lIllIlllllllI[3]] = "DIVINE_RANGING";
        i.lIllIlllllIll[i.lIllIlllllllI[4]] = "Divine ranging potion";
        i.lIllIlllllIll[i.lIllIlllllllI[5]] = "BASTION_POTION";
        i.lIllIlllllIll[i.lIllIlllllllI[6]] = "Bastion potion";
        i.lIllIlllllIll[i.lIllIlllllllI[1]] = "DIVINE_BASTION";
        i.lIllIlllllIll[i.lIllIlllllllI[7]] = "Divine bastion potion";
        i.lIllIlllllIll[i.lIllIlllllllI[8]] = "MAGIC_POTION";
        i.lIllIlllllIll[i.lIllIlllllllI[9]] = "Magic potion";
        i.lIllIlllllIll[i.lIllIlllllllI[10]] = "DIVINE_MAGIC_POTION";
        i.lIllIlllllIll[i.lIllIlllllllI[11]] = "Divine magic potion";
        i.lIllIlllllIll[i.lIllIlllllllI[12]] = "NONE";
        i.lIllIlllllIll[i.lIllIlllllllI[13]] = "None";
    }
}

