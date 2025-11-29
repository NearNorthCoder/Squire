/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.nightmarezone.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class GameEnum
extends Enum<c> {
    public static final  /* enum */ c MYSTIC_WILL;
    public static final  /* enum */ c PIETY;
    private final  Prayer prayer;
    public static final  /* enum */ c HAWK_EYE;
    public static final  /* enum */ c EAGLE_EYE;
    
    public static final  /* enum */ c RIGOUR;
    public static final  /* enum */ c ULTIMATE_STR;
    private static final  c[] $VALUES;
    
    public static final  /* enum */ c BURST_OF_STR;
    public static final  /* enum */ c AUGURY;
    public static final  /* enum */ c MYSTIC_MIGHT;
    public static final  /* enum */ c SHARP_EYE;
    public static final  /* enum */ c SUPERHUMAN_STR;
    public static final  /* enum */ c MYSTIC_LORD;

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public Prayer j() {
        return this.prayer;
    }

        return String.valueOf(var1);
    }

    static {
        c.lIIlllllIIllIIl();
        c.lIIlllllIIllIII();
        BURST_OF_STR = new GameEnum(Prayer.BURST_OF_STRENGTH);
        SUPERHUMAN_STR = new GameEnum(Prayer.SUPERHUMAN_STRENGTH);
        ULTIMATE_STR = new GameEnum(Prayer.ULTIMATE_STRENGTH);
        PIETY = new GameEnum(Prayer.PIETY);
        SHARP_EYE = new GameEnum(Prayer.EAGLE_EYE);
        HAWK_EYE = new GameEnum(Prayer.EAGLE_EYE);
        EAGLE_EYE = new GameEnum(Prayer.EAGLE_EYE);
        RIGOUR = new GameEnum(Prayer.RIGOUR);
        MYSTIC_WILL = new GameEnum(Prayer.MYSTIC_WILL);
        MYSTIC_LORD = new GameEnum(Prayer.MYSTIC_LORE);
        MYSTIC_MIGHT = new GameEnum(Prayer.MYSTIC_MIGHT);
        AUGURY = new GameEnum(Prayer.AUGURY);
        c[] cArray = new c[lIIIlIIllIIIl[12]];
        cArray[c.lIIIlIIllIIIl[0]] = BURST_OF_STR;
        cArray[c.lIIIlIIllIIIl[1]] = SUPERHUMAN_STR;
        cArray[c.lIIIlIIllIIIl[2]] = ULTIMATE_STR;
        cArray[c.lIIIlIIllIIIl[3]] = PIETY;
        cArray[c.lIIIlIIllIIIl[4]] = SHARP_EYE;
        cArray[c.lIIIlIIllIIIl[5]] = HAWK_EYE;
        cArray[c.lIIIlIIllIIIl[6]] = EAGLE_EYE;
        cArray[c.lIIIlIIllIIIl[7]] = RIGOUR;
        cArray[c.lIIIlIIllIIIl[8]] = MYSTIC_WILL;
        cArray[c.lIIIlIIllIIIl[9]] = MYSTIC_LORD;
        cArray[c.lIIIlIIllIIIl[10]] = MYSTIC_MIGHT;
        cArray[c.lIIIlIIllIIIl[11]] = AUGURY;
        $VALUES = cArray;
    }

    private static boolean lIIlllllIIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIlllllIIllIII() {
        lIIIlIIllIIII = new String[lIIIlIIllIIIl[12]];
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[0]] = "BURST_OF_STR";
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[1]] = "SUPERHUMAN_STR";
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[2]] = "ULTIMATE_STR";
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[3]] = "PIETY";
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[4]] = "SHARP_EYE";
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[5]] = "HAWK_EYE";
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[6]] = "EAGLE_EYE";
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[7]] = "RIGOUR";
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[8]] = "MYSTIC_WILL";
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[9]] = "MYSTIC_LORD";
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[10]] = "MYSTIC_MIGHT";
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[11]] = "AUGURY";
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private GameEnum(Prayer prayer) {
        this.prayer = prayer;
    }
}

