/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.gauntlet.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class GameEnum17
extends Enum<k> {
    public static final  /* enum */ k NONE;
    public static final  /* enum */ k RIGOUR;
    public static final  /* enum */ k CHIVALRY;
    private final  Prayer mapping;
    public static final  /* enum */ k MYSTIC_MIGHT;
    public static final  /* enum */ k ULTIMATE_STRENGTH;
    
    public static final  /* enum */ k PIETY;
    public static final  /* enum */ k EAGLE_EYE;
    private static final  k[] $VALUES;
    public static final  /* enum */ k AUGURY;

    private static void lIIIIIIIIIIlIII() {
        llIIllllIIII = new String[llIIllllIIIl[8]];
        k.llIIllllIIII[k.llIIllllIIIl[0]] = "AUGURY";
        k.llIIllllIIII[k.llIIllllIIIl[1]] = "MYSTIC_MIGHT";
        k.llIIllllIIII[k.llIIllllIIIl[2]] = "RIGOUR";
        k.llIIllllIIII[k.llIIllllIIIl[3]] = "EAGLE_EYE";
        k.llIIllllIIII[k.llIIllllIIIl[4]] = "PIETY";
        k.llIIllllIIII[k.llIIllllIIIl[5]] = "CHIVALRY";
        k.llIIllllIIII[k.llIIllllIIIl[6]] = "ULTIMATE_STRENGTH";
        k.llIIllllIIII[k.llIIllllIIIl[7]] = "NONE";
    }

    public Prayer aL() {
        return this.mapping;
    }

        return String.valueOf(var1);
    }

    public static k valueOf(String string) {
        return Enum.valueOf(GameEnum17.class, string);
    }

    private static boolean lIIIIIIIIIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        k.lIIIIIIIIIIlIIl();
        k.lIIIIIIIIIIlIII();
        AUGURY = new GameEnum17(Prayer.AUGURY);
        MYSTIC_MIGHT = new GameEnum17(Prayer.MYSTIC_MIGHT);
        RIGOUR = new GameEnum17(Prayer.RIGOUR);
        EAGLE_EYE = new GameEnum17(Prayer.EAGLE_EYE);
        PIETY = new GameEnum17(Prayer.PIETY);
        CHIVALRY = new GameEnum17(Prayer.CHIVALRY);
        ULTIMATE_STRENGTH = new GameEnum17(Prayer.ULTIMATE_STRENGTH);
        NONE = new GameEnum17(null);
        k[] kArray = new k[llIIllllIIIl[8]];
        kArray[k.llIIllllIIIl[0]] = AUGURY;
        kArray[k.llIIllllIIIl[1]] = MYSTIC_MIGHT;
        kArray[k.llIIllllIIIl[2]] = RIGOUR;
        kArray[k.llIIllllIIIl[3]] = EAGLE_EYE;
        kArray[k.llIIllllIIIl[4]] = PIETY;
        kArray[k.llIIllllIIIl[5]] = CHIVALRY;
        kArray[k.llIIllllIIIl[6]] = ULTIMATE_STRENGTH;
        kArray[k.llIIllllIIIl[7]] = NONE;
        $VALUES = kArray;
    }

    private GameEnum17(Prayer prayer) {
        this.mapping = prayer;
    }

    public static k[] values() {
        return (k[])$VALUES.clone();
    }
}

