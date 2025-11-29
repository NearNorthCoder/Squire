/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.autotoa.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class GameEnum111
extends Enum<u> {
    private static final  u[] $VALUES;
    private final  Prayer mapped;
    
    public static final  /* enum */ u ULTIMATE_STRENGTH;
    
    public static final  /* enum */ u CHIVALRY;
    public static final  /* enum */ u PIETY;

    static {
        u.lIlIIlIIlllllI();
        u.lIlIIlIIllllIl();
        PIETY = new GameEnum111(Prayer.PIETY);
        CHIVALRY = new GameEnum111(Prayer.CHIVALRY);
        ULTIMATE_STRENGTH = new GameEnum111(Prayer.ULTIMATE_STRENGTH);
        u[] uArray = new u[llIlIIIlIlI[3]];
        uArray[u.llIlIIIlIlI[0]] = PIETY;
        uArray[u.llIlIIIlIlI[1]] = CHIVALRY;
        uArray[u.llIlIIIlIlI[2]] = ULTIMATE_STRENGTH;
        $VALUES = uArray;
    }

    private GameEnum111(Prayer prayer) {
        this.mapped = prayer;
    }

    public Prayer ag() {
        return this.mapped;
    }

    public static u[] values() {
        return (u[])$VALUES.clone();
    }

    private static boolean lIlIIlIIllllll(int n2, int n3) {
        return n2 < n3;
    }

    public static u valueOf(String string) {
        return Enum.valueOf(GameEnum111.class, string);
    }

    private static void lIlIIlIIllllIl() {
        llIlIIIlIIl = new String[llIlIIIlIlI[3]];
        u.llIlIIIlIIl[u.llIlIIIlIlI[0]] = "PIETY";
        u.llIlIIIlIIl[u.llIlIIIlIlI[1]] = "CHIVALRY";
        u.llIlIIIlIIl[u.llIlIIIlIlI[2]] = "ULTIMATE_STRENGTH";
    }

        return String.valueOf(var1);
    }
}

