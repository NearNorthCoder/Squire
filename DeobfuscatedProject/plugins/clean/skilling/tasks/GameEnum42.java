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

public final class GameEnum42
extends Enum<h> {
    public static final  /* enum */ h YEW_LONGBOW;
    public static final  /* enum */ h YEW_SHORTBOW;
    public static final  /* enum */ h WILLOW_LONGBOW;
    public static final  /* enum */ h MAPLE_SHORTBOW;
    public static final  /* enum */ h MAPLE_LONGBOW;
    
    public static final  /* enum */ h MAGIC_SHORTBOW;
    public static final  /* enum */ h OAK_SHORTBOW;
    public static final  /* enum */ h OAK_LONGBOW;
    public static final  /* enum */ h SHORTBOW;
    public static final  /* enum */ h LONGBOW;
    private static final  h[] $VALUES;
    public static final  /* enum */ h WILLOW_SHORTBOW;
    
    private final  int materialID;
    public static final  /* enum */ h MAGIC_LONGBOW;

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum42.class, string);
    }

    private GameEnum42(int n3) {
        this.materialID = n3;
    }

    static {
        h.lIlIllIIlllIll();
        h.lIlIllIIlllIlI();
        SHORTBOW = new GameEnum42(lllIIIlIIll[1]);
        LONGBOW = new GameEnum42(lllIIIlIIll[3]);
        OAK_SHORTBOW = new GameEnum42(lllIIIlIIll[5]);
        OAK_LONGBOW = new GameEnum42(lllIIIlIIll[7]);
        WILLOW_SHORTBOW = new GameEnum42(lllIIIlIIll[9]);
        WILLOW_LONGBOW = new GameEnum42(lllIIIlIIll[11]);
        MAPLE_SHORTBOW = new GameEnum42(lllIIIlIIll[13]);
        MAPLE_LONGBOW = new GameEnum42(lllIIIlIIll[15]);
        YEW_SHORTBOW = new GameEnum42(lllIIIlIIll[17]);
        YEW_LONGBOW = new GameEnum42(lllIIIlIIll[19]);
        MAGIC_SHORTBOW = new GameEnum42(lllIIIlIIll[21]);
        MAGIC_LONGBOW = new GameEnum42(lllIIIlIIll[23]);
        h[] hArray = new h[lllIIIlIIll[24]];
        hArray[h.lllIIIlIIll[0]] = SHORTBOW;
        hArray[h.lllIIIlIIll[2]] = LONGBOW;
        hArray[h.lllIIIlIIll[4]] = OAK_SHORTBOW;
        hArray[h.lllIIIlIIll[6]] = OAK_LONGBOW;
        hArray[h.lllIIIlIIll[8]] = WILLOW_SHORTBOW;
        hArray[h.lllIIIlIIll[10]] = WILLOW_LONGBOW;
        hArray[h.lllIIIlIIll[12]] = MAPLE_SHORTBOW;
        hArray[h.lllIIIlIIll[14]] = MAPLE_LONGBOW;
        hArray[h.lllIIIlIIll[16]] = YEW_SHORTBOW;
        hArray[h.lllIIIlIIll[18]] = YEW_LONGBOW;
        hArray[h.lllIIIlIIll[20]] = MAGIC_SHORTBOW;
        hArray[h.lllIIIlIIll[22]] = MAGIC_LONGBOW;
        $VALUES = hArray;
    }

    private static void lIlIllIIlllIlI() {
        lllIIIlIIlI = new String[lllIIIlIIll[24]];
        h.lllIIIlIIlI[h.lllIIIlIIll[0]] = "SHORTBOW";
        h.lllIIIlIIlI[h.lllIIIlIIll[2]] = "LONGBOW";
        h.lllIIIlIIlI[h.lllIIIlIIll[4]] = "OAK_SHORTBOW";
        h.lllIIIlIIlI[h.lllIIIlIIll[6]] = "OAK_LONGBOW";
        h.lllIIIlIIlI[h.lllIIIlIIll[8]] = "WILLOW_SHORTBOW";
        h.lllIIIlIIlI[h.lllIIIlIIll[10]] = "WILLOW_LONGBOW";
        h.lllIIIlIIlI[h.lllIIIlIIll[12]] = "MAPLE_SHORTBOW";
        h.lllIIIlIIlI[h.lllIIIlIIll[14]] = "MAPLE_LONGBOW";
        h.lllIIIlIIlI[h.lllIIIlIIll[16]] = "YEW_SHORTBOW";
        h.lllIIIlIIlI[h.lllIIIlIIll[18]] = "YEW_LONGBOW";
        h.lllIIIlIIlI[h.lllIIIlIIll[20]] = "MAGIC_SHORTBOW";
        h.lllIIIlIIlI[h.lllIIIlIIll[22]] = "MAGIC_LONGBOW";
    }

    private static boolean lIlIllIIllllII(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    public int z() {
        return this.materialID;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

}

