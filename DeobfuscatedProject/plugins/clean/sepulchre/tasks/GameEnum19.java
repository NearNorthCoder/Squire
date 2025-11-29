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

public final class GameEnum19
extends Enum<j> {
    public static final  /* enum */ j EAST;
    
    public static final  /* enum */ j NORTH;
    public static final  /* enum */ j SOUTH;
    
    public static final  /* enum */ j WEST;
    private static final  j[] $VALUES;

    public static j[] values() {
        return (j[])$VALUES.clone();
    }

    public static j valueOf(String string) {
        return Enum.valueOf(GameEnum19.class, string);
    }

    private static void lIIIlIIIIlIIIII() {
        lllIIIIIlIll = new String[lllIIIIIllII[4]];
        j.lllIIIIIlIll[j.lllIIIIIllII[0]] = "NORTH";
        j.lllIIIIIlIll[j.lllIIIIIllII[1]] = "SOUTH";
        j.lllIIIIIlIll[j.lllIIIIIllII[2]] = "WEST";
        j.lllIIIIIlIll[j.lllIIIIIllII[3]] = "EAST";
    }

        return String.valueOf(var1);
    }

    private static boolean lIIIlIIIIlIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        j.lIIIlIIIIlIIIIl();
        j.lIIIlIIIIlIIIII();
        NORTH = new GameEnum19();
        SOUTH = new GameEnum19();
        WEST = new GameEnum19();
        EAST = new GameEnum19();
        j[] jArray = new j[lllIIIIIllII[4]];
        jArray[j.lllIIIIIllII[0]] = NORTH;
        jArray[j.lllIIIIIllII[1]] = SOUTH;
        jArray[j.lllIIIIIllII[2]] = WEST;
        jArray[j.lllIIIIIllII[3]] = EAST;
        $VALUES = jArray;
    }
}

