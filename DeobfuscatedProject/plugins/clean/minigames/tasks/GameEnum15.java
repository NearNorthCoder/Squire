/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.minigames.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum15
extends Enum<d> {
    
    public static final  /* enum */ d LOW;
    public static final  /* enum */ d VERY_LOW;
    
    public static final  /* enum */ d VERY_HIGH;
    private static final  d[] $VALUES;
    public static final  /* enum */ d HIGH;
    public static final  /* enum */ d MEDIUM;

        return String.valueOf(var1);
    }

    private static void llllIllIlIllII() {
        llIIIllIllll = new String[llIIIlllIIII[5]];
        d.llIIIllIllll[d.llIIIlllIIII[0]] = "VERY_LOW";
        d.llIIIllIllll[d.llIIIlllIIII[1]] = "LOW";
        d.llIIIllIllll[d.llIIIlllIIII[2]] = "MEDIUM";
        d.llIIIllIllll[d.llIIIlllIIII[3]] = "HIGH";
        d.llIIIllIllll[d.llIIIlllIIII[4]] = "VERY_HIGH";
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    static {
        d.llllIllIlIllIl();
        d.llllIllIlIllII();
        VERY_LOW = new GameEnum15();
        LOW = new GameEnum15();
        MEDIUM = new GameEnum15();
        HIGH = new GameEnum15();
        VERY_HIGH = new GameEnum15();
        d[] dArray = new d[llIIIlllIIII[5]];
        dArray[d.llIIIlllIIII[0]] = VERY_LOW;
        dArray[d.llIIIlllIIII[1]] = LOW;
        dArray[d.llIIIlllIIII[2]] = MEDIUM;
        dArray[d.llIIIlllIIII[3]] = HIGH;
        dArray[d.llIIIlllIIII[4]] = VERY_HIGH;
        $VALUES = dArray;
    }

    private static boolean llllIllIlIlllI(int n2, int n3) {
        return n2 < n3;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum15.class, string);
    }
}

