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

public final class GameEnum9
extends Enum<b> {
    public static final  /* enum */ b FLETCH_CUTTING;
    public static final  /* enum */ b JEWELRY;
    public static final  /* enum */ b SMELTING;
    public static final  /* enum */ b GLASS_MAKE;
    public static final  /* enum */ b BOLTS;
    public static final  /* enum */ b ARROWS;
    public static final  /* enum */ b ZERO_TICK;
    public static final  /* enum */ b CANNON_BALLS;
    public static final  /* enum */ b COOKING;
    public static final  /* enum */ b ENCHANT_BOLTS;
    public static final  /* enum */ b DARTS;
    public static final  /* enum */ b SMITHING;
    public static final  /* enum */ b ALCHING;
    
    public static final  /* enum */ b STRING_BOWS;
    public static final  /* enum */ b ENCHANTING;
    public static final  /* enum */ b WINES;
    public static final  /* enum */ b ARMOUR;
    public static final  /* enum */ b FURNACE_GLASS;
    private static final  b[] $VALUES;
    public static final  /* enum */ b BATTLESTAVES;
    public static final  /* enum */ b GEM_CUTTING;
    
    public static final  /* enum */ b GLASS_BLOWING;

    public static b valueOf(String string) {
        return Enum.valueOf(GameEnum9.class, string);
    }

    private static void lIllIIIIIIIlII() {
        lllIlIlIlll = new String[lllIlIllIII[23]];
        b.lllIlIlIlll[b.lllIlIllIII[0]] = "_";
        b.lllIlIlIlll[b.lllIlIllIII[1]] = " ";
        b.lllIlIlIlll[b.lllIlIllIII[2]] = "GEM_CUTTING";
        b.lllIlIlIlll[b.lllIlIllIII[3]] = "BATTLESTAVES";
        b.lllIlIlIlll[b.lllIlIllIII[4]] = "JEWELRY";
        b.lllIlIlIlll[b.lllIlIllIII[5]] = "GLASS_BLOWING";
        b.lllIlIlIlll[b.lllIlIllIII[6]] = "DARTS";
        b.lllIlIlIlll[b.lllIlIllIII[7]] = "ARROWS";
        b.lllIlIlIlll[b.lllIlIllIII[8]] = "FLETCH_CUTTING";
        b.lllIlIlIlll[b.lllIlIllIII[9]] = "STRING_BOWS";
        b.lllIlIlIlll[b.lllIlIllIII[10]] = "BOLTS";
        b.lllIlIlIlll[b.lllIlIllIII[11]] = "COOKING";
        b.lllIlIlIlll[b.lllIlIllIII[12]] = "WINES";
        b.lllIlIlIlll[b.lllIlIllIII[13]] = "ALCHING";
        b.lllIlIlIlll[b.lllIlIllIII[14]] = "GLASS_MAKE";
        b.lllIlIlIlll[b.lllIlIllIII[15]] = "ENCHANTING";
        b.lllIlIlIlll[b.lllIlIllIII[16]] = "SMITHING";
        b.lllIlIlIlll[b.lllIlIllIII[17]] = "ARMOUR";
        b.lllIlIlIlll[b.lllIlIllIII[18]] = "SMELTING";
        b.lllIlIlIlll[b.lllIlIllIII[19]] = "CANNON_BALLS";
        b.lllIlIlIlll[b.lllIlIllIII[20]] = "ENCHANT_BOLTS";
        b.lllIlIlIlll[b.lllIlIllIII[21]] = "ZERO_TICK";
        b.lllIlIlIlll[b.lllIlIllIII[22]] = "FURNACE_GLASS";
    }

    public String toString() {
        String string = super.toString();
        char c2 = string.charAt(lllIlIllIII[0]);
        return c2 + string.replaceAll(lllIlIlIlll[lllIlIllIII[0]], lllIlIlIlll[lllIlIllIII[1]]).substring(lllIlIllIII[1]).toLowerCase();
    }

    static {
        b.lIllIIIIIIIlIl();
        b.lIllIIIIIIIlII();
        GEM_CUTTING = new GameEnum9();
        BATTLESTAVES = new GameEnum9();
        JEWELRY = new GameEnum9();
        GLASS_BLOWING = new GameEnum9();
        DARTS = new GameEnum9();
        ARROWS = new GameEnum9();
        FLETCH_CUTTING = new GameEnum9();
        STRING_BOWS = new GameEnum9();
        BOLTS = new GameEnum9();
        COOKING = new GameEnum9();
        WINES = new GameEnum9();
        ALCHING = new GameEnum9();
        GLASS_MAKE = new GameEnum9();
        ENCHANTING = new GameEnum9();
        SMITHING = new GameEnum9();
        ARMOUR = new GameEnum9();
        SMELTING = new GameEnum9();
        CANNON_BALLS = new GameEnum9();
        ENCHANT_BOLTS = new GameEnum9();
        ZERO_TICK = new GameEnum9();
        FURNACE_GLASS = new GameEnum9();
        b[] bArray = new b[lllIlIllIII[21]];
        bArray[b.lllIlIllIII[0]] = GEM_CUTTING;
        bArray[b.lllIlIllIII[1]] = BATTLESTAVES;
        bArray[b.lllIlIllIII[2]] = JEWELRY;
        bArray[b.lllIlIllIII[3]] = GLASS_BLOWING;
        bArray[b.lllIlIllIII[4]] = DARTS;
        bArray[b.lllIlIllIII[5]] = ARROWS;
        bArray[b.lllIlIllIII[6]] = FLETCH_CUTTING;
        bArray[b.lllIlIllIII[7]] = STRING_BOWS;
        bArray[b.lllIlIllIII[8]] = BOLTS;
        bArray[b.lllIlIllIII[9]] = COOKING;
        bArray[b.lllIlIllIII[10]] = WINES;
        bArray[b.lllIlIllIII[11]] = ALCHING;
        bArray[b.lllIlIllIII[12]] = GLASS_MAKE;
        bArray[b.lllIlIllIII[13]] = ENCHANTING;
        bArray[b.lllIlIllIII[14]] = SMITHING;
        bArray[b.lllIlIllIII[15]] = ARMOUR;
        bArray[b.lllIlIllIII[16]] = SMELTING;
        bArray[b.lllIlIllIII[17]] = CANNON_BALLS;
        bArray[b.lllIlIllIII[18]] = ENCHANT_BOLTS;
        bArray[b.lllIlIllIII[19]] = ZERO_TICK;
        bArray[b.lllIlIllIII[20]] = FURNACE_GLASS;
        $VALUES = bArray;
    }

        return String.valueOf(var1);
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    private static boolean lIllIIIIIIIllI(int n2, int n3) {
        return n2 < n3;
    }
}

