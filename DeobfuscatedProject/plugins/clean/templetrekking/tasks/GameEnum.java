/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.templetrekking.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum
extends Enum<c> {
    public static final  /* enum */ c DARK_CRAB;
    public static final  /* enum */ c SHARK;
    public static final  /* enum */ c SEA_TURTLE;
    private static final  c[] $VALUES;
    public static final  /* enum */ c BASS;
    public static final  /* enum */ c SALMON;
    public static final  /* enum */ c TROUT;
    public static final  /* enum */ c SWORDFISH;
    public static final  /* enum */ c MONKFISH;
    public static final  /* enum */ c MANTA_RAY;
    public static final  /* enum */ c STEW;
    public static final  /* enum */ c PIKE;
    private final  int healAmount;
    public static final  /* enum */ c KARAMBWAN;
    
    public static final  /* enum */ c LOBSTER;
    public static final  /* enum */ c JUG_OF_WINE;
    public static final  /* enum */ c TUNA;
    private final  int itemId;

    private GameEnum(int n3, int n4) {
        this.itemId = n3;
        this.healAmount = n4;
    }

    public int v() {
        return this.healAmount;
    }

    private static boolean lIllIIIIllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        c.lIllIIIIllIIlII();
        c.lIllIIIIllIIIll();
        TROUT = new GameEnum(lIIllIlIlIlII[1], lIIllIlIlIlII[2]);
        PIKE = new GameEnum(lIIllIlIlIlII[4], lIIllIlIlIlII[5]);
        SALMON = new GameEnum(lIIllIlIlIlII[7], lIIllIlIlIlII[8]);
        TUNA = new GameEnum(lIIllIlIlIlII[10], lIIllIlIlIlII[11]);
        STEW = new GameEnum(lIIllIlIlIlII[13], lIIllIlIlIlII[14]);
        JUG_OF_WINE = new GameEnum(lIIllIlIlIlII[16], lIIllIlIlIlII[14]);
        LOBSTER = new GameEnum(lIIllIlIlIlII[18], lIIllIlIlIlII[19]);
        BASS = new GameEnum(lIIllIlIlIlII[20], lIIllIlIlIlII[21]);
        SWORDFISH = new GameEnum(lIIllIlIlIlII[22], lIIllIlIlIlII[23]);
        MONKFISH = new GameEnum(lIIllIlIlIlII[24], lIIllIlIlIlII[25]);
        KARAMBWAN = new GameEnum(lIIllIlIlIlII[26], lIIllIlIlIlII[27]);
        SHARK = new GameEnum(lIIllIlIlIlII[28], lIIllIlIlIlII[29]);
        SEA_TURTLE = new GameEnum(lIIllIlIlIlII[30], lIIllIlIlIlII[31]);
        MANTA_RAY = new GameEnum(lIIllIlIlIlII[32], lIIllIlIlIlII[33]);
        DARK_CRAB = new GameEnum(lIIllIlIlIlII[34], lIIllIlIlIlII[33]);
        c[] cArray = new c[lIIllIlIlIlII[35]];
        cArray[c.lIIllIlIlIlII[0]] = TROUT;
        cArray[c.lIIllIlIlIlII[3]] = PIKE;
        cArray[c.lIIllIlIlIlII[6]] = SALMON;
        cArray[c.lIIllIlIlIlII[9]] = TUNA;
        cArray[c.lIIllIlIlIlII[12]] = STEW;
        cArray[c.lIIllIlIlIlII[15]] = JUG_OF_WINE;
        cArray[c.lIIllIlIlIlII[17]] = LOBSTER;
        cArray[c.lIIllIlIlIlII[2]] = BASS;
        cArray[c.lIIllIlIlIlII[5]] = SWORDFISH;
        cArray[c.lIIllIlIlIlII[8]] = MONKFISH;
        cArray[c.lIIllIlIlIlII[11]] = KARAMBWAN;
        cArray[c.lIIllIlIlIlII[14]] = SHARK;
        cArray[c.lIIllIlIlIlII[19]] = SEA_TURTLE;
        cArray[c.lIIllIlIlIlII[21]] = MANTA_RAY;
        cArray[c.lIIllIlIlIlII[23]] = DARK_CRAB;
        $VALUES = cArray;
    }

    private static void lIllIIIIllIIIll() {
        lIIllIlIIllIl = new String[lIIllIlIlIlII[35]];
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[0]] = "TROUT";
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[3]] = "PIKE";
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[6]] = "SALMON";
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[9]] = "TUNA";
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[12]] = "STEW";
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[15]] = "JUG_OF_WINE";
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[17]] = "LOBSTER";
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[2]] = "BASS";
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[5]] = "SWORDFISH";
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[8]] = "MONKFISH";
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[11]] = "KARAMBWAN";
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[14]] = "SHARK";
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[19]] = "SEA_TURTLE";
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[21]] = "MANTA_RAY";
        c.lIIllIlIIllIl[c.lIIllIlIlIlII[23]] = "DARK_CRAB";
    }

    public int u() {
        return this.itemId;
    }

        return String.valueOf(var1);
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }
}

