/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.toa.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class GameEnum6
extends Enum<o> {
    public static final  /* enum */ o RIGOUR;
    public static final  /* enum */ o EAGLE_EYE;
    private final  Prayer mapped;

    private static final  o[] $VALUES;

    private static void lIllIllIIlllllI() {
        lIlIIIIIllIll = new String[lIlIIIIIlllII[2]];
        o.lIlIIIIIllIll[o.lIlIIIIIlllII[0]] = "RIGOUR";
        o.lIlIIIIIllIll[o.lIlIIIIIlllII[1]] = "EAGLE_EYE";
    }

    static {
        o.lIllIllIIllllll();
        o.lIllIllIIlllllI();
        RIGOUR = new GameEnum6(Prayer.RIGOUR);
        EAGLE_EYE = new GameEnum6(Prayer.EAGLE_EYE);
        o[] oArray = new o[lIlIIIIIlllII[2]];
        oArray[o.lIlIIIIIlllII[0]] = RIGOUR;
        oArray[o.lIlIIIIIlllII[1]] = EAGLE_EYE;
        $VALUES = oArray;
    }

        return String.valueOf(var1);
    }

    private static boolean lIllIllIlIIIIII(int n2, int n3) {
        return n2 < n3;
    }

    public Prayer z() {
        return this.mapped;
    }

    public static o[] values() {
        return (o[])$VALUES.clone();
    }

    public static o valueOf(String string) {
        return Enum.valueOf(GameEnum6.class, string);
    }

    private GameEnum6(Prayer prayer) {
        this.mapped = prayer;
    }
}

