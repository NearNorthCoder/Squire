/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.zulrah.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum40
extends Enum<c> {
    public static final  /* enum */ c DONE;
    public static final  /* enum */ c TRANSPORTING_ZULRAH;
    public static final  /* enum */ c BANKING;
    private static final  c[] $VALUES;
    public static final  /* enum */ c COLLECTING_ZULRAH;

        return String.valueOf(var1);
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static void llIIIllllIIlIlI() {
        lIllIlIIlIIII = new String[lIllIlIIlIIIl[4]];
        c.lIllIlIIlIIII[c.lIllIlIIlIIIl[0]] = "BANKING";
        c.lIllIlIIlIIII[c.lIllIlIIlIIIl[1]] = "TRANSPORTING_ZULRAH";
        c.lIllIlIIlIIII[c.lIllIlIIlIIIl[2]] = "COLLECTING_ZULRAH";
        c.lIllIlIIlIIII[c.lIllIlIIlIIIl[3]] = "DONE";
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum40.class, string);
    }

    static {
        c.llIIIllllIIlIll();
        c.llIIIllllIIlIlI();
        BANKING = new GameEnum40();
        TRANSPORTING_ZULRAH = new GameEnum40();
        COLLECTING_ZULRAH = new GameEnum40();
        DONE = new GameEnum40();
        c[] cArray = new c[lIllIlIIlIIIl[4]];
        cArray[c.lIllIlIIlIIIl[0]] = BANKING;
        cArray[c.lIllIlIIlIIIl[1]] = TRANSPORTING_ZULRAH;
        cArray[c.lIllIlIIlIIIl[2]] = COLLECTING_ZULRAH;
        cArray[c.lIllIlIIlIIIl[3]] = DONE;
        $VALUES = cArray;
    }

    private static boolean llIIIllllIIllII(int n2, int n3) {
        return n2 < n3;
    }
}

