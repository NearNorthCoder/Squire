/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.construction.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum129
extends Enum<aA> {
    
    private final  String name;
    public static final  /* enum */ aA RED;
    public static final  /* enum */ aA ALL;
    public static final  /* enum */ aA BROWN;
    private static final  aA[] $VALUES;
    
    public static final  /* enum */ aA YELLOW;
    public static final  /* enum */ aA ORANGE;

    public String ax() {
        return this.name;
    }

    public static aA[] values() {
        return (aA[])$VALUES.clone();
    }

    private static void lllIIIlll() {
        lllIIlI = new String[lllIIll[10]];
        aA.lllIIlI[aA.lllIIll[0]] = "ALL";
        aA.lllIIlI[aA.lllIIll[1]] = "spice";
        aA.lllIIlI[aA.lllIIll[2]] = "YELLOW";
        aA.lllIIlI[aA.lllIIll[3]] = "Yellow spice";
        aA.lllIIlI[aA.lllIIll[4]] = "BROWN";
        aA.lllIIlI[aA.lllIIll[5]] = "Brown spice";
        aA.lllIIlI[aA.lllIIll[6]] = "RED";
        aA.lllIIlI[aA.lllIIll[7]] = "Red spice";
        aA.lllIIlI[aA.lllIIll[8]] = "ORANGE";
        aA.lllIIlI[aA.lllIIll[9]] = "Orange spice";
    }

    static {
        aA.lllIIlIII();
        aA.lllIIIlll();
        ALL = new GameEnum129(lllIIlI[lllIIll[1]]);
        YELLOW = new GameEnum129(lllIIlI[lllIIll[3]]);
        BROWN = new GameEnum129(lllIIlI[lllIIll[5]]);
        RED = new GameEnum129(lllIIlI[lllIIll[7]]);
        ORANGE = new GameEnum129(lllIIlI[lllIIll[9]]);
        aA[] aAArray = new aA[lllIIll[5]];
        aAArray[aA.lllIIll[0]] = ALL;
        aAArray[aA.lllIIll[1]] = YELLOW;
        aAArray[aA.lllIIll[2]] = BROWN;
        aAArray[aA.lllIIll[3]] = RED;
        aAArray[aA.lllIIll[4]] = ORANGE;
        $VALUES = aAArray;
    }

    private static boolean lllIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    public static aA valueOf(String string) {
        return Enum.valueOf(GameEnum129.class, string);
    }

        return String.valueOf(lllIIllIIIIlIll);
    }

    private GameEnum129(String string2) {
        this.name = string2;
    }
}

