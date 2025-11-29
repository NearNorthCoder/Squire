/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.gorillas.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class GameEnum22
extends Enum<h> {
    private static final  h[] $VALUES;
    public static final  /* enum */ h RIGOUR;
    
    private final  Prayer mapped;
    public static final  /* enum */ h EAGLE_EYE;

    private static void lllllIIlllIIlI() {
        llIIlIIlIlII = new String[llIIlIIlIlIl[2]];
        h.llIIlIIlIlII[h.llIIlIIlIlIl[0]] = "RIGOUR";
        h.llIIlIIlIlII[h.llIIlIIlIlIl[1]] = "EAGLE_EYE";
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum22.class, string);
    }

    private GameEnum22(Prayer prayer) {
        this.mapped = prayer;
    }

    public Prayer C() {
        return this.mapped;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    static {
        h.lllllIIlllIIll();
        h.lllllIIlllIIlI();
        RIGOUR = new GameEnum22(Prayer.RIGOUR);
        EAGLE_EYE = new GameEnum22(Prayer.EAGLE_EYE);
        h[] hArray = new h[llIIlIIlIlIl[2]];
        hArray[h.llIIlIIlIlIl[0]] = RIGOUR;
        hArray[h.llIIlIIlIlIl[1]] = EAGLE_EYE;
        $VALUES = hArray;
    }

}

