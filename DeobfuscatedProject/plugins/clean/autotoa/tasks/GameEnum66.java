/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.autotoa.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class GameEnum66
extends Enum<w> {
    private static final  w[] $VALUES;
    
    public static final  /* enum */ w EAGLE_EYE;
    
    public static final  /* enum */ w RIGOUR;
    private final  Prayer mapped;

    private GameEnum66(Prayer prayer) {
        this.mapped = prayer;
    }

        return String.valueOf(var1);
    }

    public Prayer ag() {
        return this.mapped;
    }

    public static w[] values() {
        return (w[])$VALUES.clone();
    }

    static {
        w.lIIlIlllIlIIII();
        w.lIIlIlllIIllll();
        RIGOUR = new GameEnum66(Prayer.RIGOUR);
        EAGLE_EYE = new GameEnum66(Prayer.EAGLE_EYE);
        w[] wArray = new w[lIllIlIlIll[2]];
        wArray[w.lIllIlIlIll[0]] = RIGOUR;
        wArray[w.lIllIlIlIll[1]] = EAGLE_EYE;
        $VALUES = wArray;
    }

    private static void lIIlIlllIIllll() {
        lIllIlIlIlI = new String[lIllIlIlIll[2]];
        w.lIllIlIlIlI[w.lIllIlIlIll[0]] = "RIGOUR";
        w.lIllIlIlIlI[w.lIllIlIlIll[1]] = "EAGLE_EYE";
    }

    public static w valueOf(String string) {
        return Enum.valueOf(GameEnum66.class, string);
    }

    private static boolean lIIlIlllIlIIIl(int n2, int n3) {
        return n2 < n3;
    }
}

