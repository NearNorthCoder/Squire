/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum71
extends Enum<C> {

    public static final  /* enum */ C ACID;
    private final  int ticks;
    public static final  /* enum */ C TELEPORT;
    private static final  C[] $VALUES;
    public static final  /* enum */ C BURN;

    public static C[] values() {
        return (C[])$VALUES.clone();
    }

    private static void llIllIlIIIIllI() {
        lIlIIllIIlII = new String[lIlIIllIIlIl[6]];
        C.lIlIIllIIlII[C.lIlIIllIIlIl[0]] = "BURN";
        C.lIlIIllIIlII[C.lIlIIllIIlIl[2]] = "ACID";
        C.lIlIIllIIlII[C.lIlIIllIIlIl[4]] = "TELEPORT";
    }

    static {
        C.llIllIlIIIIlll();
        C.llIllIlIIIIllI();
        BURN = new GameEnum71(lIlIIllIIlIl[1]);
        ACID = new GameEnum71(lIlIIllIIlIl[3]);
        TELEPORT = new GameEnum71(lIlIIllIIlIl[5]);
        C[] cArray = new C[lIlIIllIIlIl[6]];
        cArray[C.lIlIIllIIlIl[0]] = BURN;
        cArray[C.lIlIIllIIlIl[2]] = ACID;
        cArray[C.lIlIIllIIlIl[4]] = TELEPORT;
        $VALUES = cArray;
    }

    public int bB() {
        return this.ticks;
    }

    public static C valueOf(String string) {
        return Enum.valueOf(GameEnum71.class, string);
    }

    private GameEnum71(int n3) {
        this.ticks = n3;
    }
}

