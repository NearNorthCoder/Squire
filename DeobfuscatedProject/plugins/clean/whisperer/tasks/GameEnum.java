/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.whisperer.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

final class GameEnum
extends Enum<w> {
    
    public static final  /* enum */ w BREWING;
    
    public static final  /* enum */ w RESTORING;
    private static final  w[] $VALUES;
    public static final  /* enum */ w NONE;

    private static boolean llIIIIlIIlIlllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        w.llIIIIlIIlIllIl();
        w.llIIIIlIIlIIllI();
        NONE = new GameEnum();
        BREWING = new GameEnum();
        RESTORING = new GameEnum();
        w[] wArray = new w[lIlIlllIlIIIl[3]];
        wArray[w.lIlIlllIlIIIl[0]] = NONE;
        wArray[w.lIlIlllIlIIIl[1]] = BREWING;
        wArray[w.lIlIlllIlIIIl[2]] = RESTORING;
        $VALUES = wArray;
    }

        return String.valueOf(var1);
    }

    private static void llIIIIlIIlIIllI() {
        lIlIlllIIlllI = new String[lIlIlllIlIIIl[3]];
        w.lIlIlllIIlllI[w.lIlIlllIlIIIl[0]] = "NONE";
        w.lIlIlllIIlllI[w.lIlIlllIlIIIl[1]] = "BREWING";
        w.lIlIlllIIlllI[w.lIlIlllIlIIIl[2]] = "RESTORING";
    }

    public static w[] values() {
        return (w[])$VALUES.clone();
    }

    public static w valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

}

