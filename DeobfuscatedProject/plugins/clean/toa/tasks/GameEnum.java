/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.toa.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum
extends Enum<n> {
    public static final  /* enum */ n NORMAL;
    
    private static final  n[] $VALUES;
    public static final  /* enum */ n FLICK;
    public static final  /* enum */ n NONE;

        return String.valueOf(var1);
    }

    private static boolean lIllIlIllIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    public static n[] values() {
        return (n[])$VALUES.clone();
    }

    public static n valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    static {
        n.lIllIlIllIlllII();
        n.lIllIlIllIllIll();
        NONE = new GameEnum();
        NORMAL = new GameEnum();
        FLICK = new GameEnum();
        n[] nArray = new n[lIlIIIIIIIIlI[3]];
        nArray[n.lIlIIIIIIIIlI[0]] = NONE;
        nArray[n.lIlIIIIIIIIlI[1]] = NORMAL;
        nArray[n.lIlIIIIIIIIlI[2]] = FLICK;
        $VALUES = nArray;
    }

    private static void lIllIlIllIllIll() {
        lIlIIIIIIIIIl = new String[lIlIIIIIIIIlI[3]];
        n.lIlIIIIIIIIIl[n.lIlIIIIIIIIlI[0]] = "NONE";
        n.lIlIIIIIIIIIl[n.lIlIIIIIIIIlI[1]] = "NORMAL";
        n.lIlIIIIIIIIIl[n.lIlIIIIIIIIlI[2]] = "FLICK";
    }
}

