/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.sepulchre.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

public final class GameEnum16
extends Enum<z> {
    public static final  /* enum */ z LV5_ENCHANT;
    public static final  /* enum */ z NONE;
    public  Spell spell;
    public static final  /* enum */ z LV4_ENCHANT;
    public static final  /* enum */ z LV3_ENCHANT;
    public static final  /* enum */ z LV2_ENCHANT;
    public static final  /* enum */ z LV1_ENCHANT;
    public static final  /* enum */ z LV6_ENCHANT;
    private static final  z[] $VALUES;

    public static z[] values() {
        return (z[])$VALUES.clone();
    }

    private GameEnum16(Spell spell) {
        this.spell = spell;
    }

    private static boolean lIIIlIIllllllll(int n2, int n3) {
        return n2 < n3;
    }

    public static z valueOf(String string) {
        return Enum.valueOf(GameEnum16.class, string);
    }

        return String.valueOf(var1);
    }

    private static void lIIIlIIllllllIl() {
        lllIIlIIllII = new String[lllIIlIIllIl[7]];
        z.lllIIlIIllII[z.lllIIlIIllIl[0]] = "NONE";
        z.lllIIlIIllII[z.lllIIlIIllIl[1]] = "LV1_ENCHANT";
        z.lllIIlIIllII[z.lllIIlIIllIl[2]] = "LV2_ENCHANT";
        z.lllIIlIIllII[z.lllIIlIIllIl[3]] = "LV3_ENCHANT";
        z.lllIIlIIllII[z.lllIIlIIllIl[4]] = "LV4_ENCHANT";
        z.lllIIlIIllII[z.lllIIlIIllIl[5]] = "LV5_ENCHANT";
        z.lllIIlIIllII[z.lllIIlIIllIl[6]] = "LV6_ENCHANT";
    }

    static {
        z.lIIIlIIlllllllI();
        z.lIIIlIIllllllIl();
        NONE = new GameEnum16(null);
        LV1_ENCHANT = new GameEnum16((Spell)SpellBook.Standard.LVL_1_ENCHANT);
        LV2_ENCHANT = new GameEnum16((Spell)SpellBook.Standard.LVL_2_ENCHANT);
        LV3_ENCHANT = new GameEnum16((Spell)SpellBook.Standard.LVL_3_ENCHANT);
        LV4_ENCHANT = new GameEnum16((Spell)SpellBook.Standard.LVL_4_ENCHANT);
        LV5_ENCHANT = new GameEnum16((Spell)SpellBook.Standard.LVL_5_ENCHANT);
        LV6_ENCHANT = new GameEnum16((Spell)SpellBook.Standard.LVL_6_ENCHANT);
        z[] zArray = new z[lllIIlIIllIl[7]];
        zArray[z.lllIIlIIllIl[0]] = NONE;
        zArray[z.lllIIlIIllIl[1]] = LV1_ENCHANT;
        zArray[z.lllIIlIIllIl[2]] = LV2_ENCHANT;
        zArray[z.lllIIlIIllIl[3]] = LV3_ENCHANT;
        zArray[z.lllIIlIIllIl[4]] = LV4_ENCHANT;
        zArray[z.lllIIlIIllIl[5]] = LV5_ENCHANT;
        zArray[z.lllIIlIIllIl[6]] = LV6_ENCHANT;
        $VALUES = zArray;
    }
}

