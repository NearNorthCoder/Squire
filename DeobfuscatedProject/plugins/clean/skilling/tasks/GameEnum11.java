/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.skilling.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum11
extends Enum<i> {
    public static final  /* enum */ i MONKFISH;
    public static final  /* enum */ i LOBSTER;
    private final  int materialId;
    private final  int craftingOption;
    public static final  /* enum */ i SHRIMP;
    public static final  /* enum */ i KARAMBWAN;
    
    public static final  /* enum */ i BASS;
    public static final  /* enum */ i TROUT;
    private final  int finishedId;
    public static final  /* enum */ i SWORDFISH;
    public static final  /* enum */ i ANCHOVIES;
    public static final  /* enum */ i MANTA_RAY;
    public static final  /* enum */ i SEA_TURTLE;
    
    public static final  /* enum */ i SHARK;
    private static final  i[] $VALUES;
    public static final  /* enum */ i DARK_CRAB;
    public static final  /* enum */ i SARDINE;
    public static final  /* enum */ i SALMON;
    public static final  /* enum */ i ANGLERFISH;
    public static final  /* enum */ i TUNA;

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum11.class, string);
    }

    private static boolean lIlIlllIlIllll(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum11(int n3, int n4, int n5) {
        this.materialId = n3;
        this.finishedId = n4;
        this.craftingOption = n5;
    }

    static {
        i.lIlIlllIlIlllI();
        i.lIlIlllIlIllIl();
        SHRIMP = new GameEnum11(lllIIlllIll[1], lllIIlllIll[1], lllIIlllIll[2]);
        ANCHOVIES = new GameEnum11(lllIIlllIll[3], lllIIlllIll[4], lllIIlllIll[2]);
        SARDINE = new GameEnum11(lllIIlllIll[6], lllIIlllIll[7], lllIIlllIll[2]);
        TROUT = new GameEnum11(lllIIlllIll[9], lllIIlllIll[10], lllIIlllIll[2]);
        SALMON = new GameEnum11(lllIIlllIll[12], lllIIlllIll[13], lllIIlllIll[2]);
        TUNA = new GameEnum11(lllIIlllIll[15], lllIIlllIll[16], lllIIlllIll[2]);
        KARAMBWAN = new GameEnum11(lllIIlllIll[18], lllIIlllIll[19], lllIIlllIll[2]);
        LOBSTER = new GameEnum11(lllIIlllIll[21], lllIIlllIll[22], lllIIlllIll[2]);
        BASS = new GameEnum11(lllIIlllIll[24], lllIIlllIll[25], lllIIlllIll[2]);
        SWORDFISH = new GameEnum11(lllIIlllIll[27], lllIIlllIll[28], lllIIlllIll[2]);
        MONKFISH = new GameEnum11(lllIIlllIll[30], lllIIlllIll[31], lllIIlllIll[2]);
        SHARK = new GameEnum11(lllIIlllIll[33], lllIIlllIll[34], lllIIlllIll[2]);
        SEA_TURTLE = new GameEnum11(lllIIlllIll[36], lllIIlllIll[37], lllIIlllIll[2]);
        ANGLERFISH = new GameEnum11(lllIIlllIll[39], lllIIlllIll[40], lllIIlllIll[2]);
        DARK_CRAB = new GameEnum11(lllIIlllIll[42], lllIIlllIll[43], lllIIlllIll[2]);
        MANTA_RAY = new GameEnum11(lllIIlllIll[45], lllIIlllIll[46], lllIIlllIll[2]);
        i[] iArray = new i[lllIIlllIll[47]];
        iArray[i.lllIIlllIll[0]] = SHRIMP;
        iArray[i.lllIIlllIll[2]] = ANCHOVIES;
        iArray[i.lllIIlllIll[5]] = SARDINE;
        iArray[i.lllIIlllIll[8]] = TROUT;
        iArray[i.lllIIlllIll[11]] = SALMON;
        iArray[i.lllIIlllIll[14]] = TUNA;
        iArray[i.lllIIlllIll[17]] = KARAMBWAN;
        iArray[i.lllIIlllIll[20]] = LOBSTER;
        iArray[i.lllIIlllIll[23]] = BASS;
        iArray[i.lllIIlllIll[26]] = SWORDFISH;
        iArray[i.lllIIlllIll[29]] = MONKFISH;
        iArray[i.lllIIlllIll[32]] = SHARK;
        iArray[i.lllIIlllIll[35]] = SEA_TURTLE;
        iArray[i.lllIIlllIll[38]] = ANGLERFISH;
        iArray[i.lllIIlllIll[41]] = DARK_CRAB;
        iArray[i.lllIIlllIll[44]] = MANTA_RAY;
        $VALUES = iArray;
    }

    public int C() {
        return this.craftingOption;
    }

        return String.valueOf(var1);
    }

    public int B() {
        return this.finishedId;
    }

    private static void lIlIlllIlIllIl() {
        lllIIlllIlI = new String[lllIIlllIll[47]];
        i.lllIIlllIlI[i.lllIIlllIll[0]] = "SHRIMP";
        i.lllIIlllIlI[i.lllIIlllIll[2]] = "ANCHOVIES";
        i.lllIIlllIlI[i.lllIIlllIll[5]] = "SARDINE";
        i.lllIIlllIlI[i.lllIIlllIll[8]] = "TROUT";
        i.lllIIlllIlI[i.lllIIlllIll[11]] = "SALMON";
        i.lllIIlllIlI[i.lllIIlllIll[14]] = "TUNA";
        i.lllIIlllIlI[i.lllIIlllIll[17]] = "KARAMBWAN";
        i.lllIIlllIlI[i.lllIIlllIll[20]] = "LOBSTER";
        i.lllIIlllIlI[i.lllIIlllIll[23]] = "BASS";
        i.lllIIlllIlI[i.lllIIlllIll[26]] = "SWORDFISH";
        i.lllIIlllIlI[i.lllIIlllIll[29]] = "MONKFISH";
        i.lllIIlllIlI[i.lllIIlllIll[32]] = "SHARK";
        i.lllIIlllIlI[i.lllIIlllIll[35]] = "SEA_TURTLE";
        i.lllIIlllIlI[i.lllIIlllIll[38]] = "ANGLERFISH";
        i.lllIIlllIlI[i.lllIIlllIll[41]] = "DARK_CRAB";
        i.lllIIlllIlI[i.lllIIlllIll[44]] = "MANTA_RAY";
    }

    public int A() {
        return this.materialId;
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }
}

