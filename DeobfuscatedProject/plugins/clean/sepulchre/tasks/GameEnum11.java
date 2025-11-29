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

public final class GameEnum11
extends Enum<q> {
    private static final  q[] $VALUES;
    public static final  /* enum */ q SHARK;
    public static final  /* enum */ q SWORDFISH;
    public static final  /* enum */ q PIKE;
    
    public static final  /* enum */ q TROUT;
    public static final  /* enum */ q KARAMBWAN;
    public static final  /* enum */ q JUG_OF_WINE;
    private final  int itemId;
    public static final  /* enum */ q SALMON;
    public static final  /* enum */ q DARK_CRAB;
    public static final  /* enum */ q TUNA;
    public static final  /* enum */ q STEW;
    
    public static final  /* enum */ q MANTA_RAY;
    private final  int healAmount;
    public static final  /* enum */ q SEA_TURTLE;
    public static final  /* enum */ q LOBSTER;
    public static final  /* enum */ q BASS;

    private static boolean lIIIlIIIIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIlIIIIIIIlll() {
        lllIIIIIIIIl = new String[lllIIIIIIIlI[23]];
        q.lllIIIIIIIIl[q.lllIIIIIIIlI[0]] = "TROUT";
        q.lllIIIIIIIIl[q.lllIIIIIIIlI[3]] = "PIKE";
        q.lllIIIIIIIIl[q.lllIIIIIIIlI[6]] = "SALMON";
        q.lllIIIIIIIIl[q.lllIIIIIIIlI[9]] = "TUNA";
        q.lllIIIIIIIIl[q.lllIIIIIIIlI[12]] = "STEW";
        q.lllIIIIIIIIl[q.lllIIIIIIIlI[15]] = "JUG_OF_WINE";
        q.lllIIIIIIIIl[q.lllIIIIIIIlI[17]] = "LOBSTER";
        q.lllIIIIIIIIl[q.lllIIIIIIIlI[2]] = "BASS";
        q.lllIIIIIIIIl[q.lllIIIIIIIlI[5]] = "SWORDFISH";
        q.lllIIIIIIIIl[q.lllIIIIIIIlI[8]] = "KARAMBWAN";
        q.lllIIIIIIIIl[q.lllIIIIIIIlI[11]] = "SHARK";
        q.lllIIIIIIIIl[q.lllIIIIIIIlI[14]] = "SEA_TURTLE";
        q.lllIIIIIIIIl[q.lllIIIIIIIlI[19]] = "MANTA_RAY";
        q.lllIIIIIIIIl[q.lllIIIIIIIlI[21]] = "DARK_CRAB";
    }

    public static q[] values() {
        return (q[])$VALUES.clone();
    }

    public int V() {
        return this.itemId;
    }

    private GameEnum11(int n3, int n4) {
        this.itemId = n3;
        this.healAmount = n4;
    }

    public static q valueOf(String string) {
        return Enum.valueOf(GameEnum11.class, string);
    }

    public int W() {
        return this.healAmount;
    }

    static {
        q.lIIIlIIIIIIlIII();
        q.lIIIlIIIIIIIlll();
        TROUT = new GameEnum11(lllIIIIIIIlI[1], lllIIIIIIIlI[2]);
        PIKE = new GameEnum11(lllIIIIIIIlI[4], lllIIIIIIIlI[5]);
        SALMON = new GameEnum11(lllIIIIIIIlI[7], lllIIIIIIIlI[8]);
        TUNA = new GameEnum11(lllIIIIIIIlI[10], lllIIIIIIIlI[11]);
        STEW = new GameEnum11(lllIIIIIIIlI[13], lllIIIIIIIlI[14]);
        JUG_OF_WINE = new GameEnum11(lllIIIIIIIlI[16], lllIIIIIIIlI[14]);
        LOBSTER = new GameEnum11(lllIIIIIIIlI[18], lllIIIIIIIlI[19]);
        BASS = new GameEnum11(lllIIIIIIIlI[20], lllIIIIIIIlI[21]);
        SWORDFISH = new GameEnum11(lllIIIIIIIlI[22], lllIIIIIIIlI[23]);
        KARAMBWAN = new GameEnum11(lllIIIIIIIlI[24], lllIIIIIIIlI[25]);
        SHARK = new GameEnum11(lllIIIIIIIlI[26], lllIIIIIIIlI[27]);
        SEA_TURTLE = new GameEnum11(lllIIIIIIIlI[28], lllIIIIIIIlI[29]);
        MANTA_RAY = new GameEnum11(lllIIIIIIIlI[30], lllIIIIIIIlI[31]);
        DARK_CRAB = new GameEnum11(lllIIIIIIIlI[32], lllIIIIIIIlI[31]);
        q[] qArray = new q[lllIIIIIIIlI[23]];
        qArray[q.lllIIIIIIIlI[0]] = TROUT;
        qArray[q.lllIIIIIIIlI[3]] = PIKE;
        qArray[q.lllIIIIIIIlI[6]] = SALMON;
        qArray[q.lllIIIIIIIlI[9]] = TUNA;
        qArray[q.lllIIIIIIIlI[12]] = STEW;
        qArray[q.lllIIIIIIIlI[15]] = JUG_OF_WINE;
        qArray[q.lllIIIIIIIlI[17]] = LOBSTER;
        qArray[q.lllIIIIIIIlI[2]] = BASS;
        qArray[q.lllIIIIIIIlI[5]] = SWORDFISH;
        qArray[q.lllIIIIIIIlI[8]] = KARAMBWAN;
        qArray[q.lllIIIIIIIlI[11]] = SHARK;
        qArray[q.lllIIIIIIIlI[14]] = SEA_TURTLE;
        qArray[q.lllIIIIIIIlI[19]] = MANTA_RAY;
        qArray[q.lllIIIIIIIlI[21]] = DARK_CRAB;
        $VALUES = qArray;
    }

        return String.valueOf(var1);
    }
}

