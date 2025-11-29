/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.vardorvis.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum24
extends Enum<d> {
    
    public static final  /* enum */ d NOT_ATTACKING;
    public static final  /* enum */ d DELAYED;
    
    private static final  d[] $VALUES;

    private static void lIllllIllIllllI() {
        lIlIlIIlIIIIl = new String[lIlIlIIlIIIlI[2]];
        d.lIlIlIIlIIIIl[d.lIlIlIIlIIIlI[0]] = "NOT_ATTACKING";
        d.lIlIlIIlIIIIl[d.lIlIlIIlIIIlI[1]] = "DELAYED";
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    static {
        d.lIllllIllIlllll();
        d.lIllllIllIllllI();
        NOT_ATTACKING = new GameEnum24();
        DELAYED = new GameEnum24();
        d[] dArray = new d[lIlIlIIlIIIlI[2]];
        dArray[d.lIlIlIIlIIIlI[0]] = NOT_ATTACKING;
        dArray[d.lIlIlIIlIIIlI[1]] = DELAYED;
        $VALUES = dArray;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum24.class, string);
    }

    private static boolean lIllllIlllIIIII(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

}

