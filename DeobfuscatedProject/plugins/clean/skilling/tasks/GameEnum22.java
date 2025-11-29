/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.skilling.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum22
extends Enum<s> {
    private static final  s[] $VALUES;
    
    public static final  /* enum */ s SERUMS;
    public static final  /* enum */ s COMPOST;

    private static boolean lIlIllIllllIIl(int n2, int n3) {
        return n2 < n3;
    }

    public static s valueOf(String string) {
        return Enum.valueOf(GameEnum22.class, string);
    }

        return String.valueOf(var1);
    }

    private static void lIlIllIlllIlll() {
        lllIIlIIllI = new String[lllIIlIIlll[2]];
        s.lllIIlIIllI[s.lllIIlIIlll[0]] = "SERUMS";
        s.lllIIlIIllI[s.lllIIlIIlll[1]] = "COMPOST";
    }

    public static s[] values() {
        return (s[])$VALUES.clone();
    }

    static {
        s.lIlIllIllllIII();
        s.lIlIllIlllIlll();
        SERUMS = new GameEnum22();
        COMPOST = new GameEnum22();
        s[] sArray = new s[lllIIlIIlll[2]];
        sArray[s.lllIIlIIlll[0]] = SERUMS;
        sArray[s.lllIIlIIlll[1]] = COMPOST;
        $VALUES = sArray;
    }
}

