/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.gorillas.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class GameEnum13
extends Enum<e> {
    public static final  /* enum */ e CHIVALRY;
    private final  Prayer mapped;
    public static final  /* enum */ e PIETY;
    
    private static final  e[] $VALUES;
    
    public static final  /* enum */ e ULTIMATE_STRENGTH;

    public Prayer C() {
        return this.mapped;
    }

    private static void lllllIlllIIllI() {
        llIIlIlllIIl = new String[llIIlIlllIlI[3]];
        e.llIIlIlllIIl[e.llIIlIlllIlI[0]] = "PIETY";
        e.llIIlIlllIIl[e.llIIlIlllIlI[1]] = "CHIVALRY";
        e.llIIlIlllIIl[e.llIIlIlllIlI[2]] = "ULTIMATE_STRENGTH";
    }

    static {
        e.lllllIlllIIlll();
        e.lllllIlllIIllI();
        PIETY = new GameEnum13(Prayer.PIETY);
        CHIVALRY = new GameEnum13(Prayer.CHIVALRY);
        ULTIMATE_STRENGTH = new GameEnum13(Prayer.ULTIMATE_STRENGTH);
        e[] eArray = new e[llIIlIlllIlI[3]];
        eArray[e.llIIlIlllIlI[0]] = PIETY;
        eArray[e.llIIlIlllIlI[1]] = CHIVALRY;
        eArray[e.llIIlIlllIlI[2]] = ULTIMATE_STRENGTH;
        $VALUES = eArray;
    }

    private GameEnum13(Prayer prayer) {
        this.mapped = prayer;
    }

    private static boolean lllllIlllIlIII(int n2, int n3) {
        return n2 < n3;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum13.class, string);
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

        return String.valueOf(var1);
    }
}

