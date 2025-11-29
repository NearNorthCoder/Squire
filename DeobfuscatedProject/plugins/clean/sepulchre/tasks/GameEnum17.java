/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.sepulchre.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum17
extends Enum<H> {
    
    private static final  H[] $VALUES;
    public static final  /* enum */ H BLADE_STRANGE_TILES;
    
    public static final  /* enum */ H STRANGE_TILES;
    public static final  /* enum */ H DART_STRANGE_TILES;

    static {
        H.lIIIlIIIIIllIll();
        H.lIIIlIIIIIllIlI();
        STRANGE_TILES = new GameEnum17();
        DART_STRANGE_TILES = new GameEnum17();
        BLADE_STRANGE_TILES = new GameEnum17();
        H[] hArray = new H[lllIIIIIlIlI[3]];
        hArray[H.lllIIIIIlIlI[0]] = STRANGE_TILES;
        hArray[H.lllIIIIIlIlI[1]] = DART_STRANGE_TILES;
        hArray[H.lllIIIIIlIlI[2]] = BLADE_STRANGE_TILES;
        $VALUES = hArray;
    }

    public static H[] values() {
        return (H[])$VALUES.clone();
    }

        return String.valueOf(var1);
    }

    public static H valueOf(String string) {
        return Enum.valueOf(GameEnum17.class, string);
    }

    private static void lIIIlIIIIIllIlI() {
        lllIIIIIlIIl = new String[lllIIIIIlIlI[3]];
        H.lllIIIIIlIIl[H.lllIIIIIlIlI[0]] = "STRANGE_TILES";
        H.lllIIIIIlIIl[H.lllIIIIIlIlI[1]] = "DART_STRANGE_TILES";
        H.lllIIIIIlIIl[H.lllIIIIIlIlI[2]] = "BLADE_STRANGE_TILES";
    }

    private static boolean lIIIlIIIIIlllII(int n2, int n3) {
        return n2 < n3;
    }
}

