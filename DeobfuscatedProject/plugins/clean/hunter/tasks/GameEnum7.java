/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.hunter.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum7
extends Enum<c> {
    public static final  /* enum */ c HARVESTING;

    public static final  /* enum */ c PATHING;
    private static final  c[] $VALUES;
    public static final  /* enum */ c INSPECTING;
    public static final  /* enum */ c STARTING;
    public static final  /* enum */ c IDLE;
    public static final  /* enum */ c FINISHING;

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum7.class, string);
    }

        return String.valueOf(var1);
    }

    private static void lIIIlIlIIlIlllI() {
        lllIIlIlllll = new String[lllIIllIIIII[6]];
        c.lllIIlIlllll[c.lllIIllIIIII[0]] = "PATHING";
        c.lllIIlIlllll[c.lllIIllIIIII[1]] = "FINISHING";
        c.lllIIlIlllll[c.lllIIllIIIII[2]] = "HARVESTING";
        c.lllIIlIlllll[c.lllIIllIIIII[3]] = "STARTING";
        c.lllIIlIlllll[c.lllIIllIIIII[4]] = "INSPECTING";
        c.lllIIlIlllll[c.lllIIllIIIII[5]] = "IDLE";
    }

    private static boolean lIIIlIlIIllIIII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        c.lIIIlIlIIlIllll();
        c.lIIIlIlIIlIlllI();
        PATHING = new GameEnum7();
        FINISHING = new GameEnum7();
        HARVESTING = new GameEnum7();
        STARTING = new GameEnum7();
        INSPECTING = new GameEnum7();
        IDLE = new GameEnum7();
        c[] cArray = new c[lllIIllIIIII[6]];
        cArray[c.lllIIllIIIII[0]] = PATHING;
        cArray[c.lllIIllIIIII[1]] = FINISHING;
        cArray[c.lllIIllIIIII[2]] = HARVESTING;
        cArray[c.lllIIllIIIII[3]] = STARTING;
        cArray[c.lllIIllIIIII[4]] = INSPECTING;
        cArray[c.lllIIllIIIII[5]] = IDLE;
        $VALUES = cArray;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }
}

