/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.magic.Rune
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.mta.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.magic.Rune;
import net.unethicalite.api.magic.SpellBook;

public final class GameEnum16
extends Enum<h> {
    public static final  /* enum */ h LVL4_ENCHANT;
    public static final  /* enum */ h LVL6_ENCHANT;
    private final  SpellBook.Standard spell;
    private final  Rune rune;
    
    public static final  /* enum */ h LVL3_ENCHANT;
    public static final  /* enum */ h LVL1_ENCHANT;
    private static final  h[] $VALUES;
    public static final  /* enum */ h LVL5_ENCHANT;
    
    public static final  /* enum */ h LVL2_ENCHANT;

    private GameEnum16(SpellBook.Standard standard, Rune rune) {
        this.spell = standard;
        this.rune = rune;
    }

    private static boolean lIIIlIlllIlllII(int n2, int n3) {
        return n2 < n3;
    }

    public SpellBook.Standard u() {
        return this.spell;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

        return String.valueOf(var1);
    }

    static {
        h.lIIIlIlllIllIll();
        h.lIIIlIlllIllIlI();
        LVL1_ENCHANT = new GameEnum16(SpellBook.Standard.LVL_1_ENCHANT, Rune.WATER);
        LVL2_ENCHANT = new GameEnum16(SpellBook.Standard.LVL_2_ENCHANT, Rune.AIR);
        LVL3_ENCHANT = new GameEnum16(SpellBook.Standard.LVL_3_ENCHANT, Rune.FIRE);
        LVL4_ENCHANT = new GameEnum16(SpellBook.Standard.LVL_4_ENCHANT, Rune.EARTH);
        LVL5_ENCHANT = new GameEnum16(SpellBook.Standard.LVL_5_ENCHANT, Rune.WATER);
        LVL6_ENCHANT = new GameEnum16(SpellBook.Standard.LVL_6_ENCHANT, Rune.EARTH);
        h[] hArray = new h[lllIlIIllIll[6]];
        hArray[h.lllIlIIllIll[0]] = LVL1_ENCHANT;
        hArray[h.lllIlIIllIll[1]] = LVL2_ENCHANT;
        hArray[h.lllIlIIllIll[2]] = LVL3_ENCHANT;
        hArray[h.lllIlIIllIll[3]] = LVL4_ENCHANT;
        hArray[h.lllIlIIllIll[4]] = LVL5_ENCHANT;
        hArray[h.lllIlIIllIll[5]] = LVL6_ENCHANT;
        $VALUES = hArray;
    }

    public Rune t() {
        return this.rune;
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum16.class, string);
    }

    private static void lIIIlIlllIllIlI() {
        lllIlIIllIlI = new String[lllIlIIllIll[6]];
        h.lllIlIIllIlI[h.lllIlIIllIll[0]] = "LVL1_ENCHANT";
        h.lllIlIIllIlI[h.lllIlIIllIll[1]] = "LVL2_ENCHANT";
        h.lllIlIIllIlI[h.lllIlIIllIll[2]] = "LVL3_ENCHANT";
        h.lllIlIIllIlI[h.lllIlIIllIll[3]] = "LVL4_ENCHANT";
        h.lllIlIIllIlI[h.lllIlIIllIll[4]] = "LVL5_ENCHANT";
        h.lllIlIIllIlI[h.lllIlIIllIll[5]] = "LVL6_ENCHANT";
    }
}

