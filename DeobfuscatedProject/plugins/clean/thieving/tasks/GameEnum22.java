/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.thieving.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum22
extends Enum<e> {
    private final  int foodId;
    
    public static final  /* enum */ e DARK_CRAB;
    
    public static final  /* enum */ e SWORDFISH;
    public static final  /* enum */ e CHOCOLATE_CAKE;
    public static final  /* enum */ e TUNA;
    private static final  e[] $VALUES;
    public static final  /* enum */ e SHRIMP;
    public static final  /* enum */ e SARA_BREW;
    public static final  /* enum */ e SUPER_RESTORE;
    public static final  /* enum */ e CAKE;
    public static final  /* enum */ e SEA_TURTLE;
    public static final  /* enum */ e NONE;
    public static final  /* enum */ e JANGERBERRIES;
    public static final  /* enum */ e WINE;
    public static final  /* enum */ e ANCIENT_BREW;
    public static final  /* enum */ e SHARK;
    public static final  /* enum */ e PLAIN_PIZZA;
    public static final  /* enum */ e PRAYER_POTION;
    public static final  /* enum */ e BASS;
    public static final  /* enum */ e MONKFISH;
    public static final  /* enum */ e ANGLERFISH;
    public static final  /* enum */ e KARAMBWAN;
    public static final  /* enum */ e MANTA_RAY;
    public static final  /* enum */ e PINEAPPLE_PIZZA;
    public static final  /* enum */ e LOBSTER;

        return String.valueOf(var1);
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    static {
        e.lIllIIIllIIllIl();
        e.lIllIIIllIIllII();
        NONE = new GameEnum22(lIIllIlllIIII[0]);
        SHRIMP = new GameEnum22(lIIllIlllIIII[2]);
        CAKE = new GameEnum22(lIIllIlllIIII[4]);
        CHOCOLATE_CAKE = new GameEnum22(lIIllIlllIIII[6]);
        PLAIN_PIZZA = new GameEnum22(lIIllIlllIIII[8]);
        PINEAPPLE_PIZZA = new GameEnum22(lIIllIlllIIII[10]);
        WINE = new GameEnum22(lIIllIlllIIII[12]);
        BASS = new GameEnum22(lIIllIlllIIII[14]);
        TUNA = new GameEnum22(lIIllIlllIIII[16]);
        KARAMBWAN = new GameEnum22(lIIllIlllIIII[18]);
        LOBSTER = new GameEnum22(lIIllIlllIIII[20]);
        SWORDFISH = new GameEnum22(lIIllIlllIIII[22]);
        MONKFISH = new GameEnum22(lIIllIlllIIII[24]);
        SHARK = new GameEnum22(lIIllIlllIIII[26]);
        SEA_TURTLE = new GameEnum22(lIIllIlllIIII[28]);
        MANTA_RAY = new GameEnum22(lIIllIlllIIII[30]);
        ANGLERFISH = new GameEnum22(lIIllIlllIIII[32]);
        DARK_CRAB = new GameEnum22(lIIllIlllIIII[34]);
        SARA_BREW = new GameEnum22(lIIllIlllIIII[36]);
        ANCIENT_BREW = new GameEnum22(lIIllIlllIIII[38]);
        JANGERBERRIES = new GameEnum22(lIIllIlllIIII[40]);
        SUPER_RESTORE = new GameEnum22(lIIllIlllIIII[42]);
        PRAYER_POTION = new GameEnum22(lIIllIlllIIII[44]);
        e[] eArray = new e[lIIllIlllIIII[45]];
        eArray[e.lIIllIlllIIII[0]] = NONE;
        eArray[e.lIIllIlllIIII[1]] = SHRIMP;
        eArray[e.lIIllIlllIIII[3]] = CAKE;
        eArray[e.lIIllIlllIIII[5]] = CHOCOLATE_CAKE;
        eArray[e.lIIllIlllIIII[7]] = PLAIN_PIZZA;
        eArray[e.lIIllIlllIIII[9]] = PINEAPPLE_PIZZA;
        eArray[e.lIIllIlllIIII[11]] = WINE;
        eArray[e.lIIllIlllIIII[13]] = BASS;
        eArray[e.lIIllIlllIIII[15]] = TUNA;
        eArray[e.lIIllIlllIIII[17]] = KARAMBWAN;
        eArray[e.lIIllIlllIIII[19]] = LOBSTER;
        eArray[e.lIIllIlllIIII[21]] = SWORDFISH;
        eArray[e.lIIllIlllIIII[23]] = MONKFISH;
        eArray[e.lIIllIlllIIII[25]] = SHARK;
        eArray[e.lIIllIlllIIII[27]] = SEA_TURTLE;
        eArray[e.lIIllIlllIIII[29]] = MANTA_RAY;
        eArray[e.lIIllIlllIIII[31]] = ANGLERFISH;
        eArray[e.lIIllIlllIIII[33]] = DARK_CRAB;
        eArray[e.lIIllIlllIIII[35]] = SARA_BREW;
        eArray[e.lIIllIlllIIII[37]] = ANCIENT_BREW;
        eArray[e.lIIllIlllIIII[39]] = JANGERBERRIES;
        eArray[e.lIIllIlllIIII[41]] = SUPER_RESTORE;
        eArray[e.lIIllIlllIIII[43]] = PRAYER_POTION;
        $VALUES = eArray;
    }

    private static void lIllIIIllIIllII() {
        lIIllIllIIIlI = new String[lIIllIlllIIII[45]];
        e.lIIllIllIIIlI[e.lIIllIlllIIII[0]] = "NONE";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[1]] = "SHRIMP";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[3]] = "CAKE";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[5]] = "CHOCOLATE_CAKE";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[7]] = "PLAIN_PIZZA";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[9]] = "PINEAPPLE_PIZZA";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[11]] = "WINE";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[13]] = "BASS";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[15]] = "TUNA";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[17]] = "KARAMBWAN";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[19]] = "LOBSTER";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[21]] = "SWORDFISH";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[23]] = "MONKFISH";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[25]] = "SHARK";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[27]] = "SEA_TURTLE";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[29]] = "MANTA_RAY";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[31]] = "ANGLERFISH";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[33]] = "DARK_CRAB";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[35]] = "SARA_BREW";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[37]] = "ANCIENT_BREW";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[39]] = "JANGERBERRIES";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[41]] = "SUPER_RESTORE";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[43]] = "PRAYER_POTION";
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum22.class, string);
    }

    private static boolean lIllIIIllIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum22(int n3) {
        this.foodId = n3;
    }

    public int x() {
        return this.foodId;
    }
}

