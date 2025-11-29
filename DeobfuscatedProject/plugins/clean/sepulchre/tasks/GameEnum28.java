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

public final class GameEnum28
extends Enum<u> {
    
    public static final  /* enum */ u GRAPPLE;
    public static final  /* enum */ u FIX_BRIDGE;
    public static final  /* enum */ u CAST_PORTAL;
    public static final  /* enum */ u HOLY_BARRIER;
    public static final  /* enum */ u BRAZIER;
    
    private static final  u[] $VALUES;

        return String.valueOf(var1);
    }

    static {
        u.lIIIlIIIIlllllI();
        u.lIIIlIIIIllllIl();
        FIX_BRIDGE = new GameEnum28();
        HOLY_BARRIER = new GameEnum28();
        CAST_PORTAL = new GameEnum28();
        BRAZIER = new GameEnum28();
        GRAPPLE = new GameEnum28();
        u[] uArray = new u[lllIIIIlIIll[5]];
        uArray[u.lllIIIIlIIll[0]] = FIX_BRIDGE;
        uArray[u.lllIIIIlIIll[1]] = HOLY_BARRIER;
        uArray[u.lllIIIIlIIll[2]] = CAST_PORTAL;
        uArray[u.lllIIIIlIIll[3]] = BRAZIER;
        uArray[u.lllIIIIlIIll[4]] = GRAPPLE;
        $VALUES = uArray;
    }

    public static u valueOf(String string) {
        return Enum.valueOf(GameEnum28.class, string);
    }

    private static boolean lIIIlIIIIllllll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIlIIIIllllIl() {
        lllIIIIlIIlI = new String[lllIIIIlIIll[5]];
        u.lllIIIIlIIlI[u.lllIIIIlIIll[0]] = "FIX_BRIDGE";
        u.lllIIIIlIIlI[u.lllIIIIlIIll[1]] = "HOLY_BARRIER";
        u.lllIIIIlIIlI[u.lllIIIIlIIll[2]] = "CAST_PORTAL";
        u.lllIIIIlIIlI[u.lllIIIIlIIll[3]] = "BRAZIER";
        u.lllIIIIlIIlI[u.lllIIIIlIIll[4]] = "GRAPPLE";
    }

    public static u[] values() {
        return (u[])$VALUES.clone();
    }
}

