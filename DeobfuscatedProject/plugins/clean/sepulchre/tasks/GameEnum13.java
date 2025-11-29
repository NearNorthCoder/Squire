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

public final class GameEnum13
extends Enum<k> {
    public static final  /* enum */ k NORTH;
    public static final  /* enum */ k SOUTH_BLADE;
    public static final  /* enum */ k EAST;
    public static final  /* enum */ k WEST;
    public static final  /* enum */ k SOUTH;
    
    private static final  k[] $VALUES;

    public static k valueOf(String string) {
        return Enum.valueOf(GameEnum13.class, string);
    }

    static {
        k.lIIIlIIIllIllIl();
        k.lIIIlIIIllIllII();
        NORTH = new GameEnum13();
        SOUTH = new GameEnum13();
        WEST = new GameEnum13();
        EAST = new GameEnum13();
        SOUTH_BLADE = new GameEnum13();
        k[] kArray = new k[lllIIIlIIIII[5]];
        kArray[k.lllIIIlIIIII[0]] = NORTH;
        kArray[k.lllIIIlIIIII[1]] = SOUTH;
        kArray[k.lllIIIlIIIII[2]] = WEST;
        kArray[k.lllIIIlIIIII[3]] = EAST;
        kArray[k.lllIIIlIIIII[4]] = SOUTH_BLADE;
        $VALUES = kArray;
    }

    private static boolean lIIIlIIIllIlllI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    private static void lIIIlIIIllIllII() {
        lllIIIIlllll = new String[lllIIIlIIIII[5]];
        k.lllIIIIlllll[k.lllIIIlIIIII[0]] = "NORTH";
        k.lllIIIIlllll[k.lllIIIlIIIII[1]] = "SOUTH";
        k.lllIIIIlllll[k.lllIIIlIIIII[2]] = "WEST";
        k.lllIIIIlllll[k.lllIIIlIIIII[3]] = "EAST";
        k.lllIIIIlllll[k.lllIIIlIIIII[4]] = "SOUTH_BLADE";
    }

    public static k[] values() {
        return (k[])$VALUES.clone();
    }
}

