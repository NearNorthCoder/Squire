/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.construction.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum130
extends Enum<aB> {
    
    private static final  aB[] $VALUES;
    
    public static final  /* enum */ aB EXTREME;
    public static final  /* enum */ aB SOME;
    public static final  /* enum */ aB NONE;

    public static aB valueOf(String string) {
        return Enum.valueOf(GameEnum130.class, string);
    }

    static {
        aB.lllIllII();
        aB.lllIlIll();
        NONE = new GameEnum130();
        SOME = new GameEnum130();
        EXTREME = new GameEnum130();
        aB[] aBArray = new aB[lllIlI[3]];
        aBArray[aB.lllIlI[0]] = NONE;
        aBArray[aB.lllIlI[1]] = SOME;
        aBArray[aB.lllIlI[2]] = EXTREME;
        $VALUES = aBArray;
    }

    public static aB[] values() {
        return (aB[])$VALUES.clone();
    }

    private static void lllIlIll() {
        lllIIl = new String[lllIlI[3]];
        aB.lllIIl[aB.lllIlI[0]] = "NONE";
        aB.lllIIl[aB.lllIlI[1]] = "SOME";
        aB.lllIIl[aB.lllIlI[2]] = "EXTREME";
    }
}

