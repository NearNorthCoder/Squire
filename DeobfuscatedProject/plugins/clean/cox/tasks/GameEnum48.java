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

public final class GameEnum48
extends Enum<F> {
    private static final  F[] $VALUES;
    private final  int personalItemCapacity;
    public static final  /* enum */ F LARGE;
    public static final  /* enum */ F MEDIUM;
    public static final  /* enum */ F TINY;
    private final  int raidItemCapacity;
    public static final  /* enum */ F MASSIVE;

    public static final  /* enum */ F SMALL;

    private GameEnum48(int n3, int n4) {
        this.personalItemCapacity = n3;
        this.raidItemCapacity = n4;
    }

    private static void llIllIllIllIII() {
        lIlIIllllIlI = new String[lIlIIllllIll[14]];
        F.lIlIIllllIlI[F.lIlIIllllIll[0]] = "TINY";
        F.lIlIIllllIlI[F.lIlIIllllIll[2]] = "SMALL";
        F.lIlIIllllIlI[F.lIlIIllllIll[5]] = "MEDIUM";
        F.lIlIIllllIlI[F.lIlIIllllIll[8]] = "LARGE";
        F.lIlIIllllIlI[F.lIlIIllllIll[11]] = "MASSIVE";
    }

    public static F[] values() {
        return (F[])$VALUES.clone();
    }

    static {
        F.llIllIllIllIIl();
        F.llIllIllIllIII();
        TINY = new GameEnum48(lIlIIllllIll[1]);
        SMALL = new GameEnum48(lIlIIllllIll[3], lIlIIllllIll[4]);
        MEDIUM = new GameEnum48(lIlIIllllIll[6], lIlIIllllIll[7]);
        LARGE = new GameEnum48(lIlIIllllIll[9], lIlIIllllIll[10]);
        MASSIVE = new GameEnum48(lIlIIllllIll[12], lIlIIllllIll[13]);
        F[] fArray = new F[lIlIIllllIll[14]];
        fArray[F.lIlIIllllIll[0]] = TINY;
        fArray[F.lIlIIllllIll[2]] = SMALL;
        fArray[F.lIlIIllllIll[5]] = MEDIUM;
        fArray[F.lIlIIllllIll[8]] = LARGE;
        fArray[F.lIlIIllllIll[11]] = MASSIVE;
        $VALUES = fArray;
    }

        return String.valueOf(var1);
    }

    public int bM() {
        return this.raidItemCapacity;
    }

    private static boolean llIllIllIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum48(int n3) {
        this(n3, lIlIIllllIll[0]);
    }

    public static F valueOf(String string) {
        return Enum.valueOf(GameEnum48.class, string);
    }

    public int bL() {
        return this.personalItemCapacity;
    }
}

