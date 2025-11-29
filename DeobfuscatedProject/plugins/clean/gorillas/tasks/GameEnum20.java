/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.gorillas.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum20
extends Enum<d> {
    
    public static final  /* enum */ d MAGIC;
    public static final  /* enum */ d RANGED;
    private static final  d[] $VALUES;
    
    public static final  /* enum */ d MELEE;
    public static final  /* enum */ d BOULDER;

    private static boolean lllllIlllIIIII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        d.lllllIllIlllll();
        d.lllllIllIllllI();
        MAGIC = new GameEnum20();
        RANGED = new GameEnum20();
        MELEE = new GameEnum20();
        BOULDER = new GameEnum20();
        d[] dArray = new d[llIIlIllIllI[4]];
        dArray[d.llIIlIllIllI[0]] = MAGIC;
        dArray[d.llIIlIllIllI[1]] = RANGED;
        dArray[d.llIIlIllIllI[2]] = MELEE;
        dArray[d.llIIlIllIllI[3]] = BOULDER;
        $VALUES = dArray;
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum20.class, string);
    }

    private static void lllllIllIllllI() {
        llIIlIllIlIl = new String[llIIlIllIllI[4]];
        d.llIIlIllIlIl[d.llIIlIllIllI[0]] = "MAGIC";
        d.llIIlIllIlIl[d.llIIlIllIllI[1]] = "RANGED";
        d.llIIlIllIlIl[d.llIIlIllIllI[2]] = "MELEE";
        d.llIIlIllIlIl[d.llIIlIllIllI[3]] = "BOULDER";
    }

        return String.valueOf(var1);
    }
}

