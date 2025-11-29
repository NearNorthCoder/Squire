/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.nightmare.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

public final class GameEnum42
extends Enum<s> {
    public static final  /* enum */ s FIRE_WAVE;
    private final  Spell spell;
    private final  String name;
    private static final  s[] $VALUES;
    public static final  /* enum */ s FIRE_SURGE;
    public static final  /* enum */ s FIRE_BOLT;
    public static final  /* enum */ s FIRE_BLAST;

        return String.valueOf(var1);
    }

    static {
        s.lIIIlllIIlllIlI();
        s.lIIIlllIIlllIIl();
        FIRE_SURGE = new GameEnum42((Spell)SpellBook.Standard.FIRE_SURGE, lllIlllllIll[lllIlllllllI[1]]);
        FIRE_WAVE = new GameEnum42((Spell)SpellBook.Standard.FIRE_WAVE, lllIlllllIll[lllIlllllllI[3]]);
        FIRE_BLAST = new GameEnum42((Spell)SpellBook.Standard.FIRE_BLAST, lllIlllllIll[lllIlllllllI[5]]);
        FIRE_BOLT = new GameEnum42((Spell)SpellBook.Standard.FIRE_BOLT, lllIlllllIll[lllIlllllllI[7]]);
        s[] sArray = new s[lllIlllllllI[4]];
        sArray[s.lllIlllllllI[0]] = FIRE_SURGE;
        sArray[s.lllIlllllllI[1]] = FIRE_WAVE;
        sArray[s.lllIlllllllI[2]] = FIRE_BLAST;
        sArray[s.lllIlllllllI[3]] = FIRE_BOLT;
        $VALUES = sArray;
    }

    public String bG() {
        return this.name;
    }

    private static void lIIIlllIIlllIIl() {
        lllIlllllIll = new String[lllIlllllllI[8]];
        s.lllIlllllIll[s.lllIlllllllI[0]] = "FIRE_SURGE";
        s.lllIlllllIll[s.lllIlllllllI[1]] = "Fire Surge";
        s.lllIlllllIll[s.lllIlllllllI[2]] = "FIRE_WAVE";
        s.lllIlllllIll[s.lllIlllllllI[3]] = "Fire Wave";
        s.lllIlllllIll[s.lllIlllllllI[4]] = "FIRE_BLAST";
        s.lllIlllllIll[s.lllIlllllllI[5]] = "Fire Blast";
        s.lllIlllllIll[s.lllIlllllllI[6]] = "FIRE_BOLT";
        s.lllIlllllIll[s.lllIlllllllI[7]] = "Fire Bolt";
    }

    private static boolean lIIIlllIIlllIll(int n2, int n3) {
        return n2 < n3;
    }

    public static s valueOf(String string) {
        return Enum.valueOf(GameEnum42.class, string);
    }

    public static s[] values() {
        return (s[])$VALUES.clone();
    }

    public Spell bF() {
        return this.spell;
    }

    private GameEnum42(Spell spell, String string2) {
        this.spell = spell;
        this.name = string2;
    }
}

