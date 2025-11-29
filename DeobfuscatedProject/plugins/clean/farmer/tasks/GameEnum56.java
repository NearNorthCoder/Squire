/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum56
extends Enum<A> {
    private static final  A[] $VALUES;
    public static final  /* enum */ A CLOCK;
    private final  String name;
    public static final  /* enum */ A OVERVIEW;
    private final  int itemID;
    public static final  /* enum */ A FLOWER;
    public static final  /* enum */ A HOPS;
    public static final  /* enum */ A SPECIAL;
    public static final  /* enum */ A ALLOTMENT;
    public static final  /* enum */ A TREE;
    public static final  /* enum */ A TIME_OFFSET;
    public static final  /* enum */ A FRUIT_TREE;
    
    public static final  /* enum */ A BUSH;
    public static final  A[] FARMING_RUN_TYPES;
    
    public static final  /* enum */ A HERB;
    public static final  /* enum */ A BIRD_HOUSE;
    public static final  /* enum */ A GRAPE;

        return String.valueOf(var1);
    }

    public String ac() {
        return this.name;
    }

    static {
        A.lllIlllllIIlII();
        A.lllIllllIlllll();
        OVERVIEW = new GameEnum56(lIlllllIIlII[lIlllllIlIIl[1]], lIlllllIlIIl[2]);
        CLOCK = new GameEnum56(lIlllllIIlII[lIlllllIlIIl[4]], lIlllllIlIIl[5]);
        BIRD_HOUSE = new GameEnum56(lIlllllIIlII[lIlllllIlIIl[7]], lIlllllIlIIl[8]);
        ALLOTMENT = new GameEnum56(lIlllllIIlII[lIlllllIlIIl[10]], lIlllllIlIIl[11]);
        FLOWER = new GameEnum56(lIlllllIIlII[lIlllllIlIIl[13]], lIlllllIlIIl[14]);
        HERB = new GameEnum56(lIlllllIIlII[lIlllllIlIIl[16]], lIlllllIlIIl[17]);
        TREE = new GameEnum56(lIlllllIIlII[lIlllllIlIIl[19]], lIlllllIlIIl[20]);
        FRUIT_TREE = new GameEnum56(lIlllllIIlII[lIlllllIlIIl[22]], lIlllllIlIIl[23]);
        HOPS = new GameEnum56(lIlllllIIlII[lIlllllIlIIl[25]], lIlllllIlIIl[26]);
        BUSH = new GameEnum56(lIlllllIIlII[lIlllllIlIIl[28]], lIlllllIlIIl[29]);
        GRAPE = new GameEnum56(lIlllllIIlII[lIlllllIlIIl[31]], lIlllllIlIIl[32]);
        SPECIAL = new GameEnum56(lIlllllIIlII[lIlllllIlIIl[34]], lIlllllIlIIl[35]);
        TIME_OFFSET = new GameEnum56(lIlllllIIlII[lIlllllIlIIl[37]], lIlllllIlIIl[38]);
        A[] aArray = new A[lIlllllIlIIl[19]];
        aArray[A.lIlllllIlIIl[0]] = OVERVIEW;
        aArray[A.lIlllllIlIIl[1]] = CLOCK;
        aArray[A.lIlllllIlIIl[3]] = BIRD_HOUSE;
        aArray[A.lIlllllIlIIl[4]] = ALLOTMENT;
        aArray[A.lIlllllIlIIl[6]] = FLOWER;
        aArray[A.lIlllllIlIIl[7]] = HERB;
        aArray[A.lIlllllIlIIl[9]] = TREE;
        aArray[A.lIlllllIlIIl[10]] = FRUIT_TREE;
        aArray[A.lIlllllIlIIl[12]] = HOPS;
        aArray[A.lIlllllIlIIl[13]] = BUSH;
        aArray[A.lIlllllIlIIl[15]] = GRAPE;
        aArray[A.lIlllllIlIIl[16]] = SPECIAL;
        aArray[A.lIlllllIlIIl[18]] = TIME_OFFSET;
        $VALUES = aArray;
        A[] aArray2 = new A[lIlllllIlIIl[13]];
        aArray2[A.lIlllllIlIIl[0]] = HERB;
        aArray2[A.lIlllllIlIIl[1]] = TREE;
        aArray2[A.lIlllllIlIIl[3]] = FRUIT_TREE;
        aArray2[A.lIlllllIlIIl[4]] = SPECIAL;
        aArray2[A.lIlllllIlIIl[6]] = FLOWER;
        aArray2[A.lIlllllIlIIl[7]] = ALLOTMENT;
        aArray2[A.lIlllllIlIIl[9]] = BUSH;
        aArray2[A.lIlllllIlIIl[10]] = GRAPE;
        aArray2[A.lIlllllIlIIl[12]] = HOPS;
        FARMING_RUN_TYPES = aArray2;
    }

    public static A valueOf(String string) {
        return Enum.valueOf(GameEnum56.class, string);
    }

    private GameEnum56(String string2, int n3) {
        this.name = string2;
        this.itemID = n3;
    }

    private static void lllIllllIlllll() {
        lIlllllIIlII = new String[lIlllllIlIIl[39]];
        A.lIlllllIIlII[A.lIlllllIlIIl[0]] = "OVERVIEW";
        A.lIlllllIIlII[A.lIlllllIlIIl[1]] = "Overview";
        A.lIlllllIIlII[A.lIlllllIlIIl[3]] = "CLOCK";
        A.lIlllllIIlII[A.lIlllllIlIIl[4]] = "Timers & Stopwatches";
        A.lIlllllIIlII[A.lIlllllIlIIl[6]] = "BIRD_HOUSE";
        A.lIlllllIIlII[A.lIlllllIlIIl[7]] = "Bird Houses";
        A.lIlllllIIlII[A.lIlllllIlIIl[9]] = "ALLOTMENT";
        A.lIlllllIIlII[A.lIlllllIlIIl[10]] = "Allotment Patches";
        A.lIlllllIIlII[A.lIlllllIlIIl[12]] = "FLOWER";
        A.lIlllllIIlII[A.lIlllllIlIIl[13]] = "Flower Patches";
        A.lIlllllIIlII[A.lIlllllIlIIl[15]] = "HERB";
        A.lIlllllIIlII[A.lIlllllIlIIl[16]] = "Herb Patches";
        A.lIlllllIIlII[A.lIlllllIlIIl[18]] = "TREE";
        A.lIlllllIIlII[A.lIlllllIlIIl[19]] = "Tree Patches";
        A.lIlllllIIlII[A.lIlllllIlIIl[21]] = "FRUIT_TREE";
        A.lIlllllIIlII[A.lIlllllIlIIl[22]] = "Fruit Tree Patches";
        A.lIlllllIIlII[A.lIlllllIlIIl[24]] = "HOPS";
        A.lIlllllIIlII[A.lIlllllIlIIl[25]] = "Hops Patches";
        A.lIlllllIIlII[A.lIlllllIlIIl[27]] = "BUSH";
        A.lIlllllIIlII[A.lIlllllIlIIl[28]] = "Bush Patches";
        A.lIlllllIIlII[A.lIlllllIlIIl[30]] = "GRAPE";
        A.lIlllllIIlII[A.lIlllllIlIIl[31]] = "Grape Patches";
        A.lIlllllIIlII[A.lIlllllIlIIl[33]] = "SPECIAL";
        A.lIlllllIIlII[A.lIlllllIlIIl[34]] = "Special Patches";
        A.lIlllllIIlII[A.lIlllllIlIIl[36]] = "TIME_OFFSET";
        A.lIlllllIIlII[A.lIlllllIlIIl[37]] = "Farming Tick Offset";
    }

    private static boolean lllIlllllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    public int au() {
        return this.itemID;
    }

    public static A[] values() {
        return (A[])$VALUES.clone();
    }
}

