/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
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
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

public final class GameEnum75
extends Enum<aW> {
    private final  int level;
    public static final  /* enum */ aW FALADOR;
    public static final  /* enum */ aW PROGRESSIVE;
    public static final  /* enum */ aW CAMELOT;
    private final  Spell spell;
    private static final  aW[] $VALUES;
    public static final  /* enum */ aW LUMBRIDGE;
    
    public static final  /* enum */ aW VARROCK;

    private static boolean lIlIIIIIll(int n2) {
        return n2 != 0;
    }

    public Spell co() {
        return this.spell;
    }

    public static aW[] values() {
        return (aW[])$VALUES.clone();
    }

    private static boolean lIlIIIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        aW.lIlIIIIIIl();
        aW.lIlIIIIIII();
        VARROCK = new GameEnum75((Spell)SpellBook.Standard.VARROCK_TELEPORT, lIllIIll[2]);
        LUMBRIDGE = new GameEnum75((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT, lIllIIll[3]);
        FALADOR = new GameEnum75((Spell)SpellBook.Standard.FALADOR_TELEPORT, lIllIIll[5]);
        CAMELOT = new GameEnum75((Spell)SpellBook.Standard.CAMELOT_TELEPORT, lIllIIll[7]);
        PROGRESSIVE = new GameEnum75((Spell)SpellBook.Standard.HOME_TELEPORT, lIllIIll[1]);
        aW[] aWArray = new aW[lIllIIll[9]];
        aWArray[aW.lIllIIll[1]] = VARROCK;
        aWArray[aW.lIllIIll[0]] = LUMBRIDGE;
        aWArray[aW.lIllIIll[4]] = FALADOR;
        aWArray[aW.lIllIIll[6]] = CAMELOT;
        aWArray[aW.lIllIIll[8]] = PROGRESSIVE;
        $VALUES = aWArray;
    }

        return String.valueOf(llIlllIlllIllII);
    }

    private GameEnum75(Spell spell, int n3) {
        this.spell = spell;
        this.level = this.cp();
    }

    public boolean cn() {
        int n2;
        if (aW.lIlIIIIIlI(Skills.getBoostedLevel((Skill)Skill.MAGIC), this.level) && aW.lIlIIIIIll(this.spell.canCast() ? 1 : 0)) {
            n2 = lIllIIll[0];

            if (3 > 3) {
                return (((0xE5 ^ 0xC4) & ~(0x31 ^ 0x10) ^ (0x1A ^ 0x57)) & (0x87 ^ 0x8E ^ (0xC9 ^ 0x8D) ^ -1)) != 0;
            }
        } else {
            n2 = lIllIIll[1];
        }
        return n2 != 0;
    }

    private static boolean lIlIIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    public int cp() {
        return this.level;
    }

    private static void lIlIIIIIII() {
        lIllIIlI = new String[lIllIIll[9]];
        aW.lIllIIlI[aW.lIllIIll[1]] = "VARROCK";
        aW.lIllIIlI[aW.lIllIIll[0]] = "LUMBRIDGE";
        aW.lIllIIlI[aW.lIllIIll[4]] = "FALADOR";
        aW.lIllIIlI[aW.lIllIIll[6]] = "CAMELOT";
        aW.lIllIIlI[aW.lIllIIll[8]] = "PROGRESSIVE";
    }

    public static aW valueOf(String string) {
        return Enum.valueOf(GameEnum75.class, string);
    }
}

