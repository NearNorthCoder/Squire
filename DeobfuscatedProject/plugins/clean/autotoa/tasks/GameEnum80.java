/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum80
extends Enum<v> {
    public static final  /* enum */ v FLICK;

    private static final  v[] $VALUES;
    public static final  /* enum */ v NORMAL;
    public static final  /* enum */ v NONE;

    public static v valueOf(String string) {
        return Enum.valueOf(GameEnum80.class, string);
    }

        return String.valueOf(var1);
    }

    public static v[] values() {
        return (v[])$VALUES.clone();
    }

    static {
        v.lIIllllIIIIIIl();
        v.lIIllllIIIIIII();
        NONE = new GameEnum80();
        NORMAL = new GameEnum80();
        FLICK = new GameEnum80();
        v[] vArray = new v[llIIIlIIlII[3]];
        vArray[v.llIIIlIIlII[0]] = NONE;
        vArray[v.llIIIlIIlII[1]] = NORMAL;
        vArray[v.llIIIlIIlII[2]] = FLICK;
        $VALUES = vArray;
    }

    private static void lIIllllIIIIIII() {
        llIIIlIIIll = new String[llIIIlIIlII[3]];
        v.llIIIlIIIll[v.llIIIlIIlII[0]] = "NONE";
        v.llIIIlIIIll[v.llIIIlIIlII[1]] = "NORMAL";
        v.llIIIlIIIll[v.llIIIlIIlII[2]] = "FLICK";
    }

    private static boolean lIIllllIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }
}

