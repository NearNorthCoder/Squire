/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.mixology.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum16
extends Enum<f> {
    private static final  f[] $VALUES;
    public static final  /* enum */ f SINGLE_ORDER;
    
    public static final  /* enum */ f MULTI_ORDER;

    public static f valueOf(String string) {
        return Enum.valueOf(GameEnum16.class, string);
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

    private static void lIIlIllIIlIIlIl() {
        lIIIIIIIIIlll = new String[lIIIIIIIIlIII[2]];
        f.lIIIIIIIIIlll[f.lIIIIIIIIlIII[0]] = "SINGLE_ORDER";
        f.lIIIIIIIIIlll[f.lIIIIIIIIlIII[1]] = "MULTI_ORDER";
    }

    private static boolean lIIlIllIIlIIlll(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    static {
        f.lIIlIllIIlIIllI();
        f.lIIlIllIIlIIlIl();
        SINGLE_ORDER = new GameEnum16();
        MULTI_ORDER = new GameEnum16();
        f[] fArray = new f[lIIIIIIIIlIII[2]];
        fArray[f.lIIIIIIIIlIII[0]] = SINGLE_ORDER;
        fArray[f.lIIIIIIIIlIII[1]] = MULTI_ORDER;
        $VALUES = fArray;
    }
}

