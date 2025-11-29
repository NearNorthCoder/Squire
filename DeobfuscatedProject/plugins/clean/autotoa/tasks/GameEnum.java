/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

final class GameEnum
extends Enum<bs> {
    private static final  bs[] $VALUES;
    private final  int value;
    public static final  /* enum */ bs TRIANGLE;
    public static final  /* enum */ bs WIGGLE;
    private final  int groundObjectId;
    public static final  /* enum */ bs DIAMOND;
    public static final  /* enum */ bs LINE;
    public static final  /* enum */ bs BIRD;
    
    public static final  /* enum */ bs KNIVES;
    
    private final  int gameObjectId;
    public static final  /* enum */ bs HAND;
    public static final  /* enum */ bs CROOK;
    public static final  /* enum */ bs FOOT;

    public static bs[] values() {
        return (bs[])$VALUES.clone();
    }

    static {
        bs.lIIlIllIllIlll();
        bs.lIIlIllIllIIll();
        LINE = new GameEnum(lIllIlIIIll[1], lIllIlIIIll[2], lIllIlIIIll[3]);
        KNIVES = new GameEnum(lIllIlIIIll[4], lIllIlIIIll[5], lIllIlIIIll[6]);
        TRIANGLE = new GameEnum(lIllIlIIIll[7], lIllIlIIIll[8], lIllIlIIIll[9]);
        DIAMOND = new GameEnum(lIllIlIIIll[10], lIllIlIIIll[11], lIllIlIIIll[12]);
        HAND = new GameEnum(lIllIlIIIll[13], lIllIlIIIll[14], lIllIlIIIll[15]);
        BIRD = new GameEnum(lIllIlIIIll[16], lIllIlIIIll[17], lIllIlIIIll[18]);
        CROOK = new GameEnum(lIllIlIIIll[19], lIllIlIIIll[20], lIllIlIIIll[21]);
        WIGGLE = new GameEnum(lIllIlIIIll[22], lIllIlIIIll[23], lIllIlIIIll[24]);
        FOOT = new GameEnum(lIllIlIIIll[25], lIllIlIIIll[26], lIllIlIIIll[27]);
        bs[] bsArray = new bs[lIllIlIIIll[25]];
        bsArray[bs.lIllIlIIIll[0]] = LINE;
        bsArray[bs.lIllIlIIIll[1]] = KNIVES;
        bsArray[bs.lIllIlIIIll[4]] = TRIANGLE;
        bsArray[bs.lIllIlIIIll[7]] = DIAMOND;
        bsArray[bs.lIllIlIIIll[10]] = HAND;
        bsArray[bs.lIllIlIIIll[13]] = BIRD;
        bsArray[bs.lIllIlIIIll[16]] = CROOK;
        bsArray[bs.lIllIlIIIll[19]] = WIGGLE;
        bsArray[bs.lIllIlIIIll[22]] = FOOT;
        $VALUES = bsArray;
    }

    private static boolean lIIlIllIlllIII(int n2, int n3) {
        return n2 < n3;
    }

    public static bs valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

        return String.valueOf(var1);
    }

    private static void lIIlIllIllIIll() {
        lIllIlIIIIl = new String[lIllIlIIIll[25]];
        bs.lIllIlIIIIl[bs.lIllIlIIIll[0]] = "LINE";
        bs.lIllIlIIIIl[bs.lIllIlIIIll[1]] = "KNIVES";
        bs.lIllIlIIIIl[bs.lIllIlIIIll[4]] = "TRIANGLE";
        bs.lIllIlIIIIl[bs.lIllIlIIIll[7]] = "DIAMOND";
        bs.lIllIlIIIIl[bs.lIllIlIIIll[10]] = "HAND";
        bs.lIllIlIIIIl[bs.lIllIlIIIll[13]] = "BIRD";
        bs.lIllIlIIIIl[bs.lIllIlIIIll[16]] = "CROOK";
        bs.lIllIlIIIIl[bs.lIllIlIIIll[19]] = "WIGGLE";
        bs.lIllIlIIIIl[bs.lIllIlIIIll[22]] = "FOOT";
    }

    public int ci() {
        return this.gameObjectId;
    }

    public int cg() {
        return this.value;
    }

    public int ch() {
        return this.groundObjectId;
    }

    private GameEnum(int n3, int n4, int n5) {
        this.value = n3;
        this.groundObjectId = n4;
        this.gameObjectId = n5;
    }

}

