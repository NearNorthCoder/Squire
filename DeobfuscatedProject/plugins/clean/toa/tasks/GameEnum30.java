/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.toa.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum30
extends Enum<d> {
    private static final  d[] $VALUES;
    public static final  /* enum */ d SPECIAL_2;
    public static final  /* enum */ d SPECIAL_1;
    
    public static final  /* enum */ d NONE;

        return String.valueOf(var1);
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum30.class, string);
    }

    private static void lIllIlIlIIIllII() {
        lIIlllllIIlll = new String[lIIlllllIlIII[3]];
        d.lIIlllllIIlll[d.lIIlllllIlIII[0]] = "SPECIAL_1";
        d.lIIlllllIIlll[d.lIIlllllIlIII[1]] = "SPECIAL_2";
        d.lIIlllllIIlll[d.lIIlllllIlIII[2]] = "NONE";
    }

    private static boolean lIllIlIlIIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        d.lIllIlIlIIIllIl();
        d.lIllIlIlIIIllII();
        SPECIAL_1 = new GameEnum30();
        SPECIAL_2 = new GameEnum30();
        NONE = new GameEnum30();
        d[] dArray = new d[lIIlllllIlIII[3]];
        dArray[d.lIIlllllIlIII[0]] = SPECIAL_1;
        dArray[d.lIIlllllIlIII[1]] = SPECIAL_2;
        dArray[d.lIIlllllIlIII[2]] = NONE;
        $VALUES = dArray;
    }
}

