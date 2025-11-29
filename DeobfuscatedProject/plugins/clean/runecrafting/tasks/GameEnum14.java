/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.runecrafting.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum14
extends Enum<c> {
    
    public static final  /* enum */ c OUTSIDE;
    private static final  c[] $VALUES;
    
    public static final  /* enum */ c ACTIVE;
    public static final  /* enum */ c FINISHING;
    public static final  /* enum */ c COUNTDOWN;
    public static final  /* enum */ c ACTIVATING;

    private static boolean lIIIIIIIIlIIllI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum14.class, string);
    }

    static {
        c.lIIIIIIIIlIIlIl();
        c.lIIIIIIIIlIIlII();
        ACTIVATING = new GameEnum14();
        COUNTDOWN = new GameEnum14();
        ACTIVE = new GameEnum14();
        FINISHING = new GameEnum14();
        OUTSIDE = new GameEnum14();
        c[] cArray = new c[llIlIIIIlIIl[5]];
        cArray[c.llIlIIIIlIIl[0]] = ACTIVATING;
        cArray[c.llIlIIIIlIIl[1]] = COUNTDOWN;
        cArray[c.llIlIIIIlIIl[2]] = ACTIVE;
        cArray[c.llIlIIIIlIIl[3]] = FINISHING;
        cArray[c.llIlIIIIlIIl[4]] = OUTSIDE;
        $VALUES = cArray;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public String toString() {
        String string = super.toString();
        return string.charAt(llIlIIIIlIIl[0]) + string.substring(llIlIIIIlIIl[1]).toLowerCase();
    }

    private static void lIIIIIIIIlIIlII() {
        llIlIIIIIllI = new String[llIlIIIIlIIl[5]];
        c.llIlIIIIIllI[c.llIlIIIIlIIl[0]] = "ACTIVATING";
        c.llIlIIIIIllI[c.llIlIIIIlIIl[1]] = "COUNTDOWN";
        c.llIlIIIIIllI[c.llIlIIIIlIIl[2]] = "ACTIVE";
        c.llIlIIIIIllI[c.llIlIIIIlIIl[3]] = "FINISHING";
        c.llIlIIIIIllI[c.llIlIIIIlIIl[4]] = "OUTSIDE";
    }
}

