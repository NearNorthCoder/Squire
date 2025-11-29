/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum120
extends Enum<x> {
    public static final  /* enum */ x RANGE;
    public static final  /* enum */ x MAGE;
    private static final  x[] $VALUES;
    public static final  /* enum */ x MELEE;

    public static x[] values() {
        return (x[])$VALUES.clone();
    }

    static {
        x.lIlIIlIlIlllIl();
        x.lIlIIlIlIlllII();
        RANGE = new GameEnum120();
        MAGE = new GameEnum120();
        MELEE = new GameEnum120();
        x[] xArray = new x[llIlIIlIlIl[3]];
        xArray[x.llIlIIlIlIl[0]] = RANGE;
        xArray[x.llIlIIlIlIl[1]] = MAGE;
        xArray[x.llIlIIlIlIl[2]] = MELEE;
        $VALUES = xArray;
    }

    private static void lIlIIlIlIlllII() {
        llIlIIlIlII = new String[llIlIIlIlIl[3]];
        x.llIlIIlIlII[x.llIlIIlIlIl[0]] = "RANGE";
        x.llIlIIlIlII[x.llIlIIlIlIl[1]] = "MAGE";
        x.llIlIIlIlII[x.llIlIIlIlIl[2]] = "MELEE";
    }

        return String.valueOf(var1);
    }

    public static x valueOf(String string) {
        return Enum.valueOf(GameEnum120.class, string);
    }

    private static boolean lIlIIlIlIllllI(int n2, int n3) {
        return n2 < n3;
    }
}

