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

public final class GameEnum
extends Enum<n> {
    public static final  /* enum */ n CANDLE_LANTERN;
    public static final  /* enum */ n LIGHT_ORB;
    private final  int craftingOption;

    private static final  n[] $VALUES;
    public static final  /* enum */ n UNPOWERED_STAFF_ORB;
    public static final  /* enum */ n VIAL;
    public static final  /* enum */ n FISHBOWL;
    private final  int materialID;
    public static final  /* enum */ n BEER_GLASS;
    public static final  /* enum */ n LANTERN_LENS;
    public static final  /* enum */ n OIL_LAMP;
    private final  int finishedID;

    static {
        n.lIlIlllIIllIll();
        n.lIlIlllIIllIlI();
        BEER_GLASS = new GameEnum(lllIIllIIll[1], lllIIllIIll[2], lllIIllIIll[3]);
        CANDLE_LANTERN = new GameEnum(lllIIllIIll[1], lllIIllIIll[4], lllIIllIIll[5]);
        OIL_LAMP = new GameEnum(lllIIllIIll[1], lllIIllIIll[6], lllIIllIIll[7]);
        VIAL = new GameEnum(lllIIllIIll[1], lllIIllIIll[8], lllIIllIIll[9]);
        FISHBOWL = new GameEnum(lllIIllIIll[1], lllIIllIIll[10], lllIIllIIll[11]);
        UNPOWERED_STAFF_ORB = new GameEnum(lllIIllIIll[1], lllIIllIIll[12], lllIIllIIll[13]);
        LANTERN_LENS = new GameEnum(lllIIllIIll[1], lllIIllIIll[14], lllIIllIIll[15]);
        LIGHT_ORB = new GameEnum(lllIIllIIll[1], lllIIllIIll[16], lllIIllIIll[17]);
        n[] nArray = new n[lllIIllIIll[17]];
        nArray[n.lllIIllIIll[0]] = BEER_GLASS;
        nArray[n.lllIIllIIll[3]] = CANDLE_LANTERN;
        nArray[n.lllIIllIIll[5]] = OIL_LAMP;
        nArray[n.lllIIllIIll[7]] = VIAL;
        nArray[n.lllIIllIIll[9]] = FISHBOWL;
        nArray[n.lllIIllIIll[11]] = UNPOWERED_STAFF_ORB;
        nArray[n.lllIIllIIll[13]] = LANTERN_LENS;
        nArray[n.lllIIllIIll[15]] = LIGHT_ORB;
        $VALUES = nArray;
    }

    public static n valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

        return String.valueOf(var1);
    }

    private static void lIlIlllIIllIlI() {
        lllIIllIIlI = new String[lllIIllIIll[17]];
        n.lllIIllIIlI[n.lllIIllIIll[0]] = "BEER_GLASS";
        n.lllIIllIIlI[n.lllIIllIIll[3]] = "CANDLE_LANTERN";
        n.lllIIllIIlI[n.lllIIllIIll[5]] = "OIL_LAMP";
        n.lllIIllIIlI[n.lllIIllIIll[7]] = "VIAL";
        n.lllIIllIIlI[n.lllIIllIIll[9]] = "FISHBOWL";
        n.lllIIllIIlI[n.lllIIllIIll[11]] = "UNPOWERED_STAFF_ORB";
        n.lllIIllIIlI[n.lllIIllIIll[13]] = "LANTERN_LENS";
        n.lllIIllIIlI[n.lllIIllIIll[15]] = "LIGHT_ORB";
    }

    private static boolean lIlIlllIIlllII(int n2, int n3) {
        return n2 < n3;
    }

    public int C() {
        return this.craftingOption;
    }

    public int z() {
        return this.materialID;
    }

    private GameEnum(int n3, int n4, int n5) {
        this.materialID = n3;
        this.finishedID = n4;
        this.craftingOption = n5;
    }

    public int E() {
        return this.finishedID;
    }

    public static n[] values() {
        return (n[])$VALUES.clone();
    }
}

