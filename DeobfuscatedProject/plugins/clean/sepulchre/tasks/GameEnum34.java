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

public final class GameEnum34
extends Enum<C> {
    public static final  /* enum */ C STATUE_BLUE_STRICT;
    public static final  /* enum */ C STATUE_BLUE_I;
    
    public static final  /* enum */ C STATUE_BLUE_SHORT;
    public static final  /* enum */ C STATUE_BLUE_II;
    public static final  /* enum */ C STATUE_SHORT;
    
    private static final  C[] $VALUES;
    public static final  /* enum */ C STATUE_BLUE_III;
    public static final  /* enum */ C STATUE_4;
    public static final  /* enum */ C STATUE_STRICT;
    public static final  /* enum */ C STATUE_GOLD_SHORT;
    public static final  /* enum */ C STATUE_GOLD_6;
    public static final  /* enum */ C STATUE;

    public static C[] values() {
        return (C[])$VALUES.clone();
    }

    static {
        C.lIIIlIIlllIllIl();
        C.lIIIlIIlllIllII();
        STATUE = new GameEnum34();
        STATUE_SHORT = new GameEnum34();
        STATUE_4 = new GameEnum34();
        STATUE_GOLD_SHORT = new GameEnum34();
        STATUE_GOLD_6 = new GameEnum34();
        STATUE_STRICT = new GameEnum34();
        STATUE_BLUE_STRICT = new GameEnum34();
        STATUE_BLUE_SHORT = new GameEnum34();
        STATUE_BLUE_I = new GameEnum34();
        STATUE_BLUE_II = new GameEnum34();
        STATUE_BLUE_III = new GameEnum34();
        C[] cArray = new C[lllIIlIIIIlI[11]];
        cArray[C.lllIIlIIIIlI[0]] = STATUE;
        cArray[C.lllIIlIIIIlI[1]] = STATUE_SHORT;
        cArray[C.lllIIlIIIIlI[2]] = STATUE_4;
        cArray[C.lllIIlIIIIlI[3]] = STATUE_GOLD_SHORT;
        cArray[C.lllIIlIIIIlI[4]] = STATUE_GOLD_6;
        cArray[C.lllIIlIIIIlI[5]] = STATUE_STRICT;
        cArray[C.lllIIlIIIIlI[6]] = STATUE_BLUE_STRICT;
        cArray[C.lllIIlIIIIlI[7]] = STATUE_BLUE_SHORT;
        cArray[C.lllIIlIIIIlI[8]] = STATUE_BLUE_I;
        cArray[C.lllIIlIIIIlI[9]] = STATUE_BLUE_II;
        cArray[C.lllIIlIIIIlI[10]] = STATUE_BLUE_III;
        $VALUES = cArray;
    }

    private static boolean lIIIlIIlllIlllI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    public static C valueOf(String string) {
        return Enum.valueOf(GameEnum34.class, string);
    }

    private static void lIIIlIIlllIllII() {
        lllIIlIIIIIl = new String[lllIIlIIIIlI[11]];
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[0]] = "STATUE";
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[1]] = "STATUE_SHORT";
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[2]] = "STATUE_4";
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[3]] = "STATUE_GOLD_SHORT";
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[4]] = "STATUE_GOLD_6";
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[5]] = "STATUE_STRICT";
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[6]] = "STATUE_BLUE_STRICT";
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[7]] = "STATUE_BLUE_SHORT";
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[8]] = "STATUE_BLUE_I";
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[9]] = "STATUE_BLUE_II";
        C.lllIIlIIIIIl[C.lllIIlIIIIlI[10]] = "STATUE_BLUE_III";
    }

}

