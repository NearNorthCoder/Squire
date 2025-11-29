/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum52
extends Enum<m> {
    public static final  /* enum */ m UNOWNED;
    public static final  /* enum */ m OFF;
    private static final  m[] $VALUES;
    
    public static final  /* enum */ m ON;

    private static boolean llllIIllIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public static m[] values() {
        return (m[])$VALUES.clone();
    }

    static {
        m.llllIIllIlIIIl();
        m.llllIIllIIllII();
        UNOWNED = new GameEnum52();
        OFF = new GameEnum52();
        ON = new GameEnum52();
        m[] mArray = new m[llIIIIllIlll[3]];
        mArray[m.llIIIIllIlll[0]] = UNOWNED;
        mArray[m.llIIIIllIlll[1]] = OFF;
        mArray[m.llIIIIllIlll[2]] = ON;
        $VALUES = mArray;
    }

    private static void llllIIllIIllII() {
        llIIIIllIlII = new String[llIIIIllIlll[3]];
        m.llIIIIllIlII[m.llIIIIllIlll[0]] = "UNOWNED";
        m.llIIIIllIlII[m.llIIIIllIlll[1]] = "OFF";
        m.llIIIIllIlII[m.llIIIIllIlll[2]] = "ON";
    }

        return String.valueOf(var1);
    }

    public static m valueOf(String string) {
        return Enum.valueOf(GameEnum52.class, string);
    }
}

