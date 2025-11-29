/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.sepulchre.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum21
extends Enum<s> {
    
    private static final  s[] $VALUES;
    
    public static final  /* enum */ s INTERACT;

    static {
        s.lIIIlIlIIIlIIIl();
        s.lIIIlIlIIIlIIII();
        INTERACT = new GameEnum21();
        s[] sArray = new s[lllIIlIlIlll[1]];
        sArray[s.lllIIlIlIlll[0]] = INTERACT;
        $VALUES = sArray;
    }

    public static s valueOf(String string) {
        return Enum.valueOf(GameEnum21.class, string);
    }

    private static void lIIIlIlIIIlIIII() {
        lllIIlIlIllI = new String[lllIIlIlIlll[1]];
        s.lllIIlIlIllI[s.lllIIlIlIlll[0]] = "INTERACT";
    }

    public static s[] values() {
        return (s[])$VALUES.clone();
    }
}

