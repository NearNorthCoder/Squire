/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.sepulchre.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum23
extends Enum<F> {
    private static final  F[] $VALUES;

    public static final  /* enum */ F STATUE_8_DOUBLE;
    public static final  /* enum */ F STATUE_BLUE_DOUBLE;
    public static final  /* enum */ F STATUE_6_DOUBLE;

    static {
        F.lIIIlIIlllIIIll();
        F.lIIIlIIlllIIIlI();
        STATUE_6_DOUBLE = new GameEnum23();
        STATUE_8_DOUBLE = new GameEnum23();
        STATUE_BLUE_DOUBLE = new GameEnum23();
        F[] fArray = new F[lllIIIlllllI[3]];
        fArray[F.lllIIIlllllI[0]] = STATUE_6_DOUBLE;
        fArray[F.lllIIIlllllI[1]] = STATUE_8_DOUBLE;
        fArray[F.lllIIIlllllI[2]] = STATUE_BLUE_DOUBLE;
        $VALUES = fArray;
    }

    private static void lIIIlIIlllIIIlI() {
        lllIIIllllIl = new String[lllIIIlllllI[3]];
        F.lllIIIllllIl[F.lllIIIlllllI[0]] = "STATUE_6_DOUBLE";
        F.lllIIIllllIl[F.lllIIIlllllI[1]] = "STATUE_8_DOUBLE";
        F.lllIIIllllIl[F.lllIIIlllllI[2]] = "STATUE_BLUE_DOUBLE";
    }

    public static F[] values() {
        return (F[])$VALUES.clone();
    }

    public static F valueOf(String string) {
        return Enum.valueOf(GameEnum23.class, string);
    }
}

