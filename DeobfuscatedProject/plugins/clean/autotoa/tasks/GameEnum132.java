/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum132
extends Enum<h> {
    
    public static final  /* enum */ h SPECIAL_2;
    public static final  /* enum */ h SPECIAL_1;
    public static final  /* enum */ h NONE;
    
    private static final  h[] $VALUES;

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum132.class, string);
    }

    static {
        h.lIIllIlIllIlIl();
        h.lIIllIlIllIlII();
        SPECIAL_1 = new GameEnum132();
        SPECIAL_2 = new GameEnum132();
        NONE = new GameEnum132();
        h[] hArray = new h[lIllllIllIl[3]];
        hArray[h.lIllllIllIl[0]] = SPECIAL_1;
        hArray[h.lIllllIllIl[1]] = SPECIAL_2;
        hArray[h.lIllllIllIl[2]] = NONE;
        $VALUES = hArray;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static void lIIllIlIllIlII() {
        lIllllIllII = new String[lIllllIllIl[3]];
        h.lIllllIllII[h.lIllllIllIl[0]] = "SPECIAL_1";
        h.lIllllIllII[h.lIllllIllIl[1]] = "SPECIAL_2";
        h.lIllllIllII[h.lIllllIllIl[2]] = "NONE";
    }

}

