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

public final class GameEnum61
extends Enum<H> {
    public static final  /* enum */ H KARAMJA_GLOVES_4;
    public static final  /* enum */ H RING_OF_DUELING;
    public static final  /* enum */ H FISHING_CAPE;
    public static final  /* enum */ H ROYAL_SEED_POD;
    private final  String teleportOption;
    public static final  /* enum */ H AMULET_OF_GLORY;
    public static final  /* enum */ H CHRONICLE;
    private final  int[] itemID;
    public static final  /* enum */ H RADAS_BLESSING;
    private static final  H[] $VALUES;
    
    public static final  /* enum */ H CONSTRUCTION_CAPE;
    public static final  /* enum */ H EXPLORERS_RING;
    public static final  /* enum */ H CRAFTING_CAPE;
    private  boolean mustBeEquipped;
    
    public static final  /* enum */ H KARAMJA_GLOVES_3;
    public static final  /* enum */ H MAX_CAPE;
    public static final  /* enum */ H ARDOUGNE_CLOAK;
    public static final  /* enum */ H ECTOPHIAL;

    public static H valueOf(String string) {
        return Enum.valueOf(GameEnum61.class, string);
    }

        return String.valueOf(llIIIIIIIlllIll);
    }

    public int[] av() {
        return this.itemID;
    }

    private static boolean lIIlIlIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum61(String string2, boolean bl2, int ... nArray) {
        this.itemID = nArray;
        this.mustBeEquipped = bl2;
        this.teleportOption = string2;
    }

    static {
        H.lIIlIlIIIII();
        H.lIIlIIlllll();
        int[] nArray = new int[lIlIlIIII[2]];
        nArray[H.lIlIlIIII[0]] = lIlIlIIII[3];
        nArray[H.lIlIlIIII[1]] = lIlIlIIII[4];
        CONSTRUCTION_CAPE = new GameEnum61(lIlIIllll[lIlIlIIII[1]], nArray);
        int[] nArray2 = new int[lIlIlIIII[1]];
        nArray2[H.lIlIlIIII[0]] = lIlIlIIII[6];
        MAX_CAPE = new GameEnum61(lIlIIllll[lIlIlIIII[5]], nArray2);
        int[] nArray3 = new int[lIlIlIIII[2]];
        nArray3[H.lIlIlIIII[0]] = lIlIlIIII[9];
        nArray3[H.lIlIlIIII[1]] = lIlIlIIII[10];
        CRAFTING_CAPE = new GameEnum61(lIlIIllll[lIlIlIIII[8]], nArray3);
        int[] nArray4 = new int[lIlIlIIII[2]];
        nArray4[H.lIlIlIIII[0]] = lIlIlIIII[13];
        nArray4[H.lIlIlIIII[1]] = lIlIlIIII[14];
        FISHING_CAPE = new GameEnum61(lIlIIllll[lIlIlIIII[12]], nArray4);
        int[] nArray5 = new int[lIlIlIIII[7]];
        nArray5[H.lIlIlIIII[0]] = lIlIlIIII[17];
        nArray5[H.lIlIlIIII[1]] = lIlIlIIII[18];
        nArray5[H.lIlIlIIII[2]] = lIlIlIIII[19];
        nArray5[H.lIlIlIIII[5]] = lIlIlIIII[20];
        ARDOUGNE_CLOAK = new GameEnum61(lIlIIllll[lIlIlIIII[16]], nArray5);
        int[] nArray6 = new int[lIlIlIIII[1]];
        nArray6[H.lIlIlIIII[0]] = lIlIlIIII[23];
        ECTOPHIAL = new GameEnum61(lIlIIllll[lIlIlIIII[22]], nArray6);
        int[] nArray7 = new int[lIlIlIIII[1]];
        nArray7[H.lIlIlIIII[0]] = lIlIlIIII[26];
        KARAMJA_GLOVES_3 = new GameEnum61(lIlIIllll[lIlIlIIII[25]], nArray7);
        int[] nArray8 = new int[lIlIlIIII[1]];
        nArray8[H.lIlIlIIII[0]] = lIlIlIIII[29];
        KARAMJA_GLOVES_4 = new GameEnum61(lIlIIllll[lIlIlIIII[28]], nArray8);
        int[] nArray9 = new int[lIlIlIIII[2]];
        nArray9[H.lIlIlIIII[0]] = lIlIlIIII[32];
        nArray9[H.lIlIlIIII[1]] = lIlIlIIII[33];
        EXPLORERS_RING = new GameEnum61(lIlIIllll[lIlIlIIII[31]], nArray9);
        int[] nArray10 = new int[lIlIlIIII[1]];
        nArray10[H.lIlIlIIII[0]] = lIlIlIIII[36];
        ROYAL_SEED_POD = new GameEnum61(lIlIIllll[lIlIlIIII[35]], nArray10);
        int[] nArray11 = new int[lIlIlIIII[1]];
        nArray11[H.lIlIlIIII[0]] = lIlIlIIII[39];
        CHRONICLE = new GameEnum61(lIlIIllll[lIlIlIIII[38]], nArray11);
        int[] nArray12 = new int[lIlIlIIII[12]];
        nArray12[H.lIlIlIIII[0]] = lIlIlIIII[42];
        nArray12[H.lIlIlIIII[1]] = lIlIlIIII[43];
        nArray12[H.lIlIlIIII[2]] = lIlIlIIII[44];
        nArray12[H.lIlIlIIII[5]] = lIlIlIIII[45];
        nArray12[H.lIlIlIIII[7]] = lIlIlIIII[46];
        nArray12[H.lIlIlIIII[8]] = lIlIlIIII[47];
        nArray12[H.lIlIlIIII[11]] = lIlIlIIII[48];
        AMULET_OF_GLORY = new GameEnum61(lIlIIllll[lIlIlIIII[41]], lIlIlIIII[1], nArray12);
        int[] nArray13 = new int[lIlIlIIII[15]];
        nArray13[H.lIlIlIIII[0]] = lIlIlIIII[51];
        nArray13[H.lIlIlIIII[1]] = lIlIlIIII[52];
        nArray13[H.lIlIlIIII[2]] = lIlIlIIII[53];
        nArray13[H.lIlIlIIII[5]] = lIlIlIIII[54];
        nArray13[H.lIlIlIIII[7]] = lIlIlIIII[55];
        nArray13[H.lIlIlIIII[8]] = lIlIlIIII[56];
        nArray13[H.lIlIlIIII[11]] = lIlIlIIII[57];
        nArray13[H.lIlIlIIII[12]] = lIlIlIIII[58];
        RING_OF_DUELING = new GameEnum61(lIlIIllll[lIlIlIIII[50]], lIlIlIIII[1], nArray13);
        int[] nArray14 = new int[lIlIlIIII[1]];
        nArray14[H.lIlIlIIII[0]] = lIlIlIIII[61];
        RADAS_BLESSING = new GameEnum61(lIlIIllll[lIlIlIIII[60]], lIlIlIIII[1], nArray14);
        H[] hArray = new H[lIlIlIIII[27]];
        hArray[H.lIlIlIIII[0]] = CONSTRUCTION_CAPE;
        hArray[H.lIlIlIIII[1]] = MAX_CAPE;
        hArray[H.lIlIlIIII[2]] = CRAFTING_CAPE;
        hArray[H.lIlIlIIII[5]] = FISHING_CAPE;
        hArray[H.lIlIlIIII[7]] = ARDOUGNE_CLOAK;
        hArray[H.lIlIlIIII[8]] = ECTOPHIAL;
        hArray[H.lIlIlIIII[11]] = KARAMJA_GLOVES_3;
        hArray[H.lIlIlIIII[12]] = KARAMJA_GLOVES_4;
        hArray[H.lIlIlIIII[15]] = EXPLORERS_RING;
        hArray[H.lIlIlIIII[16]] = ROYAL_SEED_POD;
        hArray[H.lIlIlIIII[21]] = CHRONICLE;
        hArray[H.lIlIlIIII[22]] = AMULET_OF_GLORY;
        hArray[H.lIlIlIIII[24]] = RING_OF_DUELING;
        hArray[H.lIlIlIIII[25]] = RADAS_BLESSING;
        $VALUES = hArray;
    }

    private GameEnum61(String string2, int ... nArray) {
        this.itemID = nArray;
        this.teleportOption = string2;
    }

    public static H[] values() {
        return (H[])$VALUES.clone();
    }

    private static void lIIlIIlllll() {
        lIlIIllll = new String[lIlIlIIII[62]];
        H.lIlIIllll[H.lIlIlIIII[0]] = "CONSTRUCTION_CAPE";
        H.lIlIIllll[H.lIlIlIIII[1]] = "Tele to POH";
        H.lIlIIllll[H.lIlIlIIII[2]] = "MAX_CAPE";
        H.lIlIIllll[H.lIlIlIIII[5]] = "Tele to POH";
        H.lIlIIllll[H.lIlIlIIII[7]] = "CRAFTING_CAPE";
        H.lIlIIllll[H.lIlIlIIII[8]] = "Teleport";
        H.lIlIIllll[H.lIlIlIIII[11]] = "FISHING_CAPE";
        H.lIlIIllll[H.lIlIlIIII[12]] = "Fishing Guild";
        H.lIlIIllll[H.lIlIlIIII[15]] = "ARDOUGNE_CLOAK";
        H.lIlIIllll[H.lIlIlIIII[16]] = "Monastery Teleport";
        H.lIlIIllll[H.lIlIlIIII[21]] = "ECTOPHIAL";
        H.lIlIIllll[H.lIlIlIIII[22]] = "Empty";
        H.lIlIIllll[H.lIlIlIIII[24]] = "KARAMJA_GLOVES_3";
        H.lIlIIllll[H.lIlIlIIII[25]] = "Gem Mine";
        H.lIlIIllll[H.lIlIlIIII[27]] = "KARAMJA_GLOVES_4";
        H.lIlIIllll[H.lIlIlIIII[28]] = "Duradel";
        H.lIlIIllll[H.lIlIlIIII[30]] = "EXPLORERS_RING";
        H.lIlIIllll[H.lIlIlIIII[31]] = "Teleport";
        H.lIlIIllll[H.lIlIlIIII[34]] = "ROYAL_SEED_POD";
        H.lIlIIllll[H.lIlIlIIII[35]] = "Commune";
        H.lIlIIllll[H.lIlIlIIII[37]] = "CHRONICLE";
        H.lIlIIllll[H.lIlIlIIII[38]] = "Teleport";
        H.lIlIIllll[H.lIlIlIIII[40]] = "AMULET_OF_GLORY";
        H.lIlIIllll[H.lIlIlIIII[41]] = "Edgeville";
        H.lIlIIllll[H.lIlIlIIII[49]] = "RING_OF_DUELING";
        H.lIlIIllll[H.lIlIlIIII[50]] = "Castle Wars";
        H.lIlIIllll[H.lIlIlIIII[59]] = "RADAS_BLESSING";
        H.lIlIIllll[H.lIlIlIIII[60]] = "Mount Karuulm";
    }

    public String au() {
        return this.teleportOption;
    }

    public boolean aw() {
        return this.mustBeEquipped;
    }
}

