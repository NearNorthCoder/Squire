/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 */
package gg.squire.construction.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;

public final class GameEnum48
extends Enum<bY> {
    
    public static final  /* enum */ bY GLORY;
    private final  String action;
    
    private static final  bY[] $VALUES;
    private final  boolean equipment;
    public static final  /* enum */ bY RING_OF_DUELING;
    public static final  /* enum */ bY WEALTH;
    private final  Predicate<Item> predicate;
    public static final  /* enum */ bY ROYAL_SEED_POD;
    private final  int wildy;

    public boolean db() {
        return this.equipment;
    }

    public int da() {
        return this.wildy;
    }

    public String cZ() {
        return this.action;
    }

    private GameEnum48(Predicate<Item> predicate, String string2, int n3, boolean bl2) {
        this.predicate = predicate;
        this.action = string2;
        this.wildy = n3;
        this.equipment = bl2;
    }

    private static boolean llIIIIllllI(int n2, int n3) {
        return n2 < n3;
    }

    public static bY valueOf(String string) {
        return Enum.valueOf(GameEnum48.class, string);
    }

    public static bY[] values() {
        return (bY[])$VALUES.clone();
    }

    static {
        bY.llIIIIlllII();
        bY.llIIIIllIll();
        GLORY = new GameEnum48(item -> {
            String[] stringArray = new String[lllIIlIIl[1]];
            stringArray[bY.lllIIlIIl[2]] = lllIIlIII[lllIIlIIl[3]];
            return item.hasAction(stringArray);
        }, lllIIlIII[lllIIlIIl[5]], lllIIlIIl[6], lllIIlIIl[1]);
        WEALTH = new GameEnum48(item -> {
            String[] stringArray = new String[lllIIlIIl[1]];
            stringArray[bY.lllIIlIIl[2]] = lllIIlIII[lllIIlIIl[1]];
            return item.hasAction(stringArray);
        }, lllIIlIII[lllIIlIIl[8]], lllIIlIIl[6], lllIIlIIl[1]);
        RING_OF_DUELING = new GameEnum48(item -> item.getName().toLowerCase().contains(lllIIlIII[lllIIlIIl[2]]), lllIIlIII[lllIIlIIl[10]], lllIIlIIl[11], lllIIlIIl[1]);
        ROYAL_SEED_POD = new GameEnum48(item -> {
            boolean bl2;
            if (bY.llIIIIlllIl(item.getId(), lllIIlIIl[0])) {
                bl2 = lllIIlIIl[1];

                if (1 >= (3 ^ (0x44 ^ 0x43))) {
                    return ((0x8E ^ 0xC1 ^ (0x2D ^ 0x5B)) & (0xC1 ^ 0x83 ^ (0x20 ^ 0x5B) ^ -1)) != 0;
                }
            } else {
                bl2 = lllIIlIIl[2];
            }
            return bl2;
        }, lllIIlIII[lllIIlIIl[13]], lllIIlIIl[6], lllIIlIIl[2]);
        bY[] bYArray = new bY[lllIIlIIl[5]];
        bYArray[bY.lllIIlIIl[2]] = GLORY;
        bYArray[bY.lllIIlIIl[1]] = WEALTH;
        bYArray[bY.lllIIlIIl[3]] = RING_OF_DUELING;
        bYArray[bY.lllIIlIIl[4]] = ROYAL_SEED_POD;
        $VALUES = bYArray;
    }

    public Predicate<Item> br() {
        return this.predicate;
    }

    private static void llIIIIllIll() {
        lllIIlIII = new String[lllIIlIIl[14]];
        bY.lllIIlIII[bY.lllIIlIIl[2]] = "duel";
        bY.lllIIlIII[bY.lllIIlIIl[1]] = "Grand Exchange";
        bY.lllIIlIII[bY.lllIIlIIl[3]] = "Edgeville";
        bY.lllIIlIII[bY.lllIIlIIl[4]] = "GLORY";
        bY.lllIIlIII[bY.lllIIlIIl[5]] = "Edgeville";
        bY.lllIIlIII[bY.lllIIlIIl[7]] = "WEALTH";
        bY.lllIIlIII[bY.lllIIlIIl[8]] = "Grand Exchange";
        bY.lllIIlIII[bY.lllIIlIIl[9]] = "RING_OF_DUELING";
        bY.lllIIlIII[bY.lllIIlIIl[10]] = "Ferox enclave";
        bY.lllIIlIII[bY.lllIIlIIl[12]] = "ROYAL_SEED_POD";
        bY.lllIIlIII[bY.lllIIlIIl[13]] = "Commune";
    }

    private static boolean llIIIIlllIl(int n2, int n3) {
        return n2 == n3;
    }

        return String.valueOf(lIlIllIIIllllII);
    }
}

