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

public final class GameEnum33
extends Enum<m> {
    private static final  m[] $VALUES;
    public static final  /* enum */ m JADE;
    public static final  /* enum */ m SAPPHIRE;
    public static final  /* enum */ m AMETHYST;
    private final  int craftingOption;
    
    public static final  /* enum */ m RED_TOPAZ;
    private final  int materialID;
    public static final  /* enum */ m DRAGONSTONE;
    public static final  /* enum */ m DIAMOND;
    private final  int finishedID;
    public static final  /* enum */ m ZENYTE;
    public static final  /* enum */ m EMERALD;
    public static final  /* enum */ m ONYX;
    
    public static final  /* enum */ m RUBY;
    public static final  /* enum */ m OPAL;

    private GameEnum33(int n3, int n4, int n5) {
        this.materialID = n3;
        this.finishedID = n4;
        this.craftingOption = n5;
    }

    private static boolean lIlIllIIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        m.lIlIllIIIlIIIl();
        m.lIlIllIIIlIIII();
        OPAL = new GameEnum33(lllIIIIIIll[1], lllIIIIIIll[2], lllIIIIIIll[3]);
        JADE = new GameEnum33(lllIIIIIIll[4], lllIIIIIIll[5], lllIIIIIIll[3]);
        RED_TOPAZ = new GameEnum33(lllIIIIIIll[7], lllIIIIIIll[8], lllIIIIIIll[3]);
        SAPPHIRE = new GameEnum33(lllIIIIIIll[10], lllIIIIIIll[11], lllIIIIIIll[3]);
        EMERALD = new GameEnum33(lllIIIIIIll[13], lllIIIIIIll[14], lllIIIIIIll[3]);
        RUBY = new GameEnum33(lllIIIIIIll[16], lllIIIIIIll[17], lllIIIIIIll[3]);
        DIAMOND = new GameEnum33(lllIIIIIIll[19], lllIIIIIIll[20], lllIIIIIIll[3]);
        DRAGONSTONE = new GameEnum33(lllIIIIIIll[22], lllIIIIIIll[23], lllIIIIIIll[3]);
        ONYX = new GameEnum33(lllIIIIIIll[25], lllIIIIIIll[26], lllIIIIIIll[3]);
        AMETHYST = new GameEnum33(lllIIIIIIll[28], lllIIIIIIll[29], lllIIIIIIll[12]);
        ZENYTE = new GameEnum33(lllIIIIIIll[31], lllIIIIIIll[32], lllIIIIIIll[3]);
        m[] mArray = new m[lllIIIIIIll[33]];
        mArray[m.lllIIIIIIll[0]] = OPAL;
        mArray[m.lllIIIIIIll[3]] = JADE;
        mArray[m.lllIIIIIIll[6]] = RED_TOPAZ;
        mArray[m.lllIIIIIIll[9]] = SAPPHIRE;
        mArray[m.lllIIIIIIll[12]] = EMERALD;
        mArray[m.lllIIIIIIll[15]] = RUBY;
        mArray[m.lllIIIIIIll[18]] = DIAMOND;
        mArray[m.lllIIIIIIll[21]] = DRAGONSTONE;
        mArray[m.lllIIIIIIll[24]] = ONYX;
        mArray[m.lllIIIIIIll[27]] = AMETHYST;
        mArray[m.lllIIIIIIll[30]] = ZENYTE;
        $VALUES = mArray;
    }

    private static void lIlIllIIIlIIII() {
        lllIIIIIIlI = new String[lllIIIIIIll[33]];
        m.lllIIIIIIlI[m.lllIIIIIIll[0]] = "OPAL";
        m.lllIIIIIIlI[m.lllIIIIIIll[3]] = "JADE";
        m.lllIIIIIIlI[m.lllIIIIIIll[6]] = "RED_TOPAZ";
        m.lllIIIIIIlI[m.lllIIIIIIll[9]] = "SAPPHIRE";
        m.lllIIIIIIlI[m.lllIIIIIIll[12]] = "EMERALD";
        m.lllIIIIIIlI[m.lllIIIIIIll[15]] = "RUBY";
        m.lllIIIIIIlI[m.lllIIIIIIll[18]] = "DIAMOND";
        m.lllIIIIIIlI[m.lllIIIIIIll[21]] = "DRAGONSTONE";
        m.lllIIIIIIlI[m.lllIIIIIIll[24]] = "ONYX";
        m.lllIIIIIIlI[m.lllIIIIIIll[27]] = "AMETHYST";
        m.lllIIIIIIlI[m.lllIIIIIIll[30]] = "ZENYTE";
    }

    public static m valueOf(String string) {
        return Enum.valueOf(GameEnum33.class, string);
    }

    public static m[] values() {
        return (m[])$VALUES.clone();
    }

    public int C() {
        return this.craftingOption;
    }

    public int z() {
        return this.materialID;
    }

        return String.valueOf(var1);
    }

    public int E() {
        return this.finishedID;
    }
}

