/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.pvm.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum14
extends Enum<e> {
    
    public static final  /* enum */ e DARK_CRAB;
    
    public static final  /* enum */ e LOBSTER;
    public static final  /* enum */ e KARAMBWAN;
    public static final  /* enum */ e SHARK;
    public static final  /* enum */ e SWORDFISH;
    public static final  /* enum */ e MONKFISH;
    private final  int id;
    public static final  /* enum */ e MANTA_RAY;
    public static final  /* enum */ e ANGLERFISH;
    private static final  e[] $VALUES;

    private GameEnum14(int n3) {
        this.id = n3;
    }

        return String.valueOf(var1);
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private static void lIlIllIllIlIlII() {
        lIIlIlllIIlIl = new String[lIIlIlllIIllI[16]];
        e.lIIlIlllIIlIl[e.lIIlIlllIIllI[0]] = "KARAMBWAN";
        e.lIIlIlllIIlIl[e.lIIlIlllIIllI[2]] = "MONKFISH";
        e.lIIlIlllIIlIl[e.lIIlIlllIIllI[4]] = "SHARK";
        e.lIIlIlllIIlIl[e.lIIlIlllIIllI[6]] = "MANTA_RAY";
        e.lIIlIlllIIlIl[e.lIIlIlllIIllI[8]] = "LOBSTER";
        e.lIIlIlllIIlIl[e.lIIlIlllIIllI[10]] = "SWORDFISH";
        e.lIIlIlllIIlIl[e.lIIlIlllIIllI[12]] = "DARK_CRAB";
        e.lIIlIlllIIlIl[e.lIIlIlllIIllI[14]] = "ANGLERFISH";
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum14.class, string);
    }

    public int w() {
        return this.id;
    }

    private static boolean lIlIllIllIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        e.lIlIllIllIlIlIl();
        e.lIlIllIllIlIlII();
        KARAMBWAN = new GameEnum14(lIIlIlllIIllI[1]);
        MONKFISH = new GameEnum14(lIIlIlllIIllI[3]);
        SHARK = new GameEnum14(lIIlIlllIIllI[5]);
        MANTA_RAY = new GameEnum14(lIIlIlllIIllI[7]);
        LOBSTER = new GameEnum14(lIIlIlllIIllI[9]);
        SWORDFISH = new GameEnum14(lIIlIlllIIllI[11]);
        DARK_CRAB = new GameEnum14(lIIlIlllIIllI[13]);
        ANGLERFISH = new GameEnum14(lIIlIlllIIllI[15]);
        e[] eArray = new e[lIIlIlllIIllI[16]];
        eArray[e.lIIlIlllIIllI[0]] = KARAMBWAN;
        eArray[e.lIIlIlllIIllI[2]] = MONKFISH;
        eArray[e.lIIlIlllIIllI[4]] = SHARK;
        eArray[e.lIIlIlllIIllI[6]] = MANTA_RAY;
        eArray[e.lIIlIlllIIllI[8]] = LOBSTER;
        eArray[e.lIIlIlllIIllI[10]] = SWORDFISH;
        eArray[e.lIIlIlllIIllI[12]] = DARK_CRAB;
        eArray[e.lIIlIlllIIllI[14]] = ANGLERFISH;
        $VALUES = eArray;
    }
}

