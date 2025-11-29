/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.mining.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum
extends Enum<b> {
    
    private static final  b[] $VALUES;
    
    public static final  /* enum */ b JAVELIN_HEADS;
    public static final  /* enum */ b ARROW_TIPS;
    public static final  /* enum */ b DISABLE;
    public static final  /* enum */ b DART_TIPS;
    public static final  /* enum */ b BOLT_TIPS;

    static {
        b.lIIlIIlllllIIII();
        b.lIIlIIllllIllll();
        BOLT_TIPS = new GameEnum();
        ARROW_TIPS = new GameEnum();
        JAVELIN_HEADS = new GameEnum();
        DART_TIPS = new GameEnum();
        DISABLE = new GameEnum();
        b[] bArray = new b[lllllIlllIll[5]];
        bArray[b.lllllIlllIll[0]] = BOLT_TIPS;
        bArray[b.lllllIlllIll[1]] = ARROW_TIPS;
        bArray[b.lllllIlllIll[2]] = JAVELIN_HEADS;
        bArray[b.lllllIlllIll[3]] = DART_TIPS;
        bArray[b.lllllIlllIll[4]] = DISABLE;
        $VALUES = bArray;
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    private static boolean lIIlIIlllllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    private static void lIIlIIllllIllll() {
        lllllIlllIlI = new String[lllllIlllIll[5]];
        b.lllllIlllIlI[b.lllllIlllIll[0]] = "BOLT_TIPS";
        b.lllllIlllIlI[b.lllllIlllIll[1]] = "ARROW_TIPS";
        b.lllllIlllIlI[b.lllllIlllIll[2]] = "JAVELIN_HEADS";
        b.lllllIlllIlI[b.lllllIlllIll[3]] = "DART_TIPS";
        b.lllllIlllIlI[b.lllllIlllIll[4]] = "DISABLE";
    }

        return String.valueOf(var1);
    }
}

