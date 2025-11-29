/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.zulrah.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum59
extends Enum<h> {
    public static final  /* enum */ h ZULANDRA_TELEPORT;
    public static final  /* enum */ h CONSTRUCTION_CAPE;
    private static final  h[] $VALUES;
    public static final  /* enum */ h ARDOUGNE_CLOAK;
    
    public static final  /* enum */ h QUEST_CAPE;
    public static final  /* enum */ h HOUSE_TELEPORT;
    public static final  /* enum */ h EXPLORERS_RING;
    public static final  /* enum */ h RING_OF_DUELING;
    public static final  /* enum */ h MAX_CAPE;
    public static final  /* enum */ h ROYAL_SEED_POD;
    public static final  /* enum */ h ECTOPHIAL;
    public static final  /* enum */ h FISHING_CAPE;
    public static final  /* enum */ h AMULET_OF_GLORY;
    public static final  /* enum */ h CRAFTING_CAPE;
    private  int[] itemID;
    private  boolean mustBeEquipped;
    private  String teleportOption;
    public static final  /* enum */ h RADAS_BLESSING;

    private GameEnum59(String string2, int ... nArray) {
        this.itemID = nArray;
        this.teleportOption = string2;
    }

    public String s() {
        return this.teleportOption;
    }

    private static boolean llIIlIIlIlllllI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum59.class, string);
    }

    public int[] u() {
        return this.itemID;
    }

    static {
        h.llIIlIIlIllllIl();
        h.llIIlIIlIlllIII();
        int[] nArray = new int[lIllIlllIIlll[2]];
        nArray[h.lIllIlllIIlll[0]] = lIllIlllIIlll[3];
        nArray[h.lIllIlllIIlll[1]] = lIllIlllIIlll[4];
        nArray[h.lIllIlllIIlll[5]] = lIllIlllIIlll[6];
        nArray[h.lIllIlllIIlll[7]] = lIllIlllIIlll[8];
        nArray[h.lIllIlllIIlll[9]] = lIllIlllIIlll[10];
        nArray[h.lIllIlllIIlll[11]] = lIllIlllIIlll[12];
        nArray[h.lIllIlllIIlll[13]] = lIllIlllIIlll[14];
        nArray[h.lIllIlllIIlll[15]] = lIllIlllIIlll[16];
        RING_OF_DUELING = new GameEnum59(lIllIllIllllI[lIllIlllIIlll[1]], lIllIlllIIlll[1], nArray);
        int[] nArray2 = new int[lIllIlllIIlll[7]];
        nArray2[h.lIllIlllIIlll[0]] = lIllIlllIIlll[17];
        nArray2[h.lIllIlllIIlll[1]] = lIllIlllIIlll[18];
        nArray2[h.lIllIlllIIlll[5]] = lIllIlllIIlll[19];
        ARDOUGNE_CLOAK = new GameEnum59(lIllIllIllllI[lIllIlllIIlll[7]], nArray2);
        int[] nArray3 = new int[lIllIlllIIlll[15]];
        nArray3[h.lIllIlllIIlll[0]] = lIllIlllIIlll[20];
        nArray3[h.lIllIlllIIlll[1]] = lIllIlllIIlll[21];
        nArray3[h.lIllIlllIIlll[5]] = lIllIlllIIlll[22];
        nArray3[h.lIllIlllIIlll[7]] = lIllIlllIIlll[23];
        nArray3[h.lIllIlllIIlll[9]] = lIllIlllIIlll[24];
        nArray3[h.lIllIlllIIlll[11]] = lIllIlllIIlll[25];
        nArray3[h.lIllIlllIIlll[13]] = lIllIlllIIlll[26];
        AMULET_OF_GLORY = new GameEnum59(lIllIllIllllI[lIllIlllIIlll[11]], lIllIlllIIlll[1], nArray3);
        int[] nArray4 = new int[lIllIlllIIlll[1]];
        nArray4[h.lIllIlllIIlll[0]] = lIllIlllIIlll[27];
        RADAS_BLESSING = new GameEnum59(lIllIllIllllI[lIllIlllIIlll[15]], lIllIlllIIlll[1], nArray4);
        int[] nArray5 = new int[lIllIlllIIlll[1]];
        nArray5[h.lIllIlllIIlll[0]] = lIllIlllIIlll[29];
        HOUSE_TELEPORT = new GameEnum59(lIllIllIllllI[lIllIlllIIlll[28]], nArray5);
        int[] nArray6 = new int[lIllIlllIIlll[1]];
        nArray6[h.lIllIlllIIlll[0]] = lIllIlllIIlll[32];
        ZULANDRA_TELEPORT = new GameEnum59(lIllIllIllllI[lIllIlllIIlll[31]], nArray6);
        int[] nArray7 = new int[lIllIlllIIlll[1]];
        nArray7[h.lIllIlllIIlll[0]] = lIllIlllIIlll[35];
        ROYAL_SEED_POD = new GameEnum59(lIllIllIllllI[lIllIlllIIlll[34]], nArray7);
        int[] nArray8 = new int[lIllIlllIIlll[1]];
        nArray8[h.lIllIlllIIlll[0]] = lIllIlllIIlll[38];
        ECTOPHIAL = new GameEnum59(lIllIllIllllI[lIllIlllIIlll[37]], nArray8);
        int[] nArray9 = new int[lIllIlllIIlll[5]];
        nArray9[h.lIllIlllIIlll[0]] = lIllIlllIIlll[41];
        nArray9[h.lIllIlllIIlll[1]] = lIllIlllIIlll[42];
        CONSTRUCTION_CAPE = new GameEnum59(lIllIllIllllI[lIllIlllIIlll[40]], nArray9);
        int[] nArray10 = new int[lIllIlllIIlll[5]];
        nArray10[h.lIllIlllIIlll[0]] = lIllIlllIIlll[45];
        nArray10[h.lIllIlllIIlll[1]] = lIllIlllIIlll[46];
        QUEST_CAPE = new GameEnum59(lIllIllIllllI[lIllIlllIIlll[44]], nArray10);
        int[] nArray11 = new int[lIllIlllIIlll[7]];
        nArray11[h.lIllIlllIIlll[0]] = lIllIlllIIlll[49];
        nArray11[h.lIllIlllIIlll[1]] = lIllIlllIIlll[50];
        nArray11[h.lIllIlllIIlll[5]] = lIllIlllIIlll[51];
        MAX_CAPE = new GameEnum59(lIllIllIllllI[lIllIlllIIlll[48]], nArray11);
        int[] nArray12 = new int[lIllIlllIIlll[5]];
        nArray12[h.lIllIlllIIlll[0]] = lIllIlllIIlll[54];
        nArray12[h.lIllIlllIIlll[1]] = lIllIlllIIlll[55];
        CRAFTING_CAPE = new GameEnum59(lIllIllIllllI[lIllIlllIIlll[53]], nArray12);
        int[] nArray13 = new int[lIllIlllIIlll[5]];
        nArray13[h.lIllIlllIIlll[0]] = lIllIlllIIlll[58];
        nArray13[h.lIllIlllIIlll[1]] = lIllIlllIIlll[59];
        FISHING_CAPE = new GameEnum59(lIllIllIllllI[lIllIlllIIlll[57]], nArray13);
        int[] nArray14 = new int[lIllIlllIIlll[5]];
        nArray14[h.lIllIlllIIlll[0]] = lIllIlllIIlll[62];
        nArray14[h.lIllIlllIIlll[1]] = lIllIlllIIlll[63];
        EXPLORERS_RING = new GameEnum59(lIllIllIllllI[lIllIlllIIlll[61]], nArray14);
        h[] hArray = new h[lIllIlllIIlll[36]];
        hArray[h.lIllIlllIIlll[0]] = RING_OF_DUELING;
        hArray[h.lIllIlllIIlll[1]] = ARDOUGNE_CLOAK;
        hArray[h.lIllIlllIIlll[5]] = AMULET_OF_GLORY;
        hArray[h.lIllIlllIIlll[7]] = RADAS_BLESSING;
        hArray[h.lIllIlllIIlll[9]] = HOUSE_TELEPORT;
        hArray[h.lIllIlllIIlll[11]] = ZULANDRA_TELEPORT;
        hArray[h.lIllIlllIIlll[13]] = ROYAL_SEED_POD;
        hArray[h.lIllIlllIIlll[15]] = ECTOPHIAL;
        hArray[h.lIllIlllIIlll[2]] = CONSTRUCTION_CAPE;
        hArray[h.lIllIlllIIlll[28]] = QUEST_CAPE;
        hArray[h.lIllIlllIIlll[30]] = MAX_CAPE;
        hArray[h.lIllIlllIIlll[31]] = CRAFTING_CAPE;
        hArray[h.lIllIlllIIlll[33]] = FISHING_CAPE;
        hArray[h.lIllIlllIIlll[34]] = EXPLORERS_RING;
        $VALUES = hArray;
    }

    private static void llIIlIIlIlllIII() {
        lIllIllIllllI = new String[lIllIlllIIlll[64]];
        h.lIllIllIllllI[h.lIllIlllIIlll[0]] = "RING_OF_DUELING";
        h.lIllIllIllllI[h.lIllIlllIIlll[1]] = "Ferox Enclave";
        h.lIllIllIllllI[h.lIllIlllIIlll[5]] = "ARDOUGNE_CLOAK";
        h.lIllIllIllllI[h.lIllIlllIIlll[7]] = "Monastery Teleport";
        h.lIllIllIllllI[h.lIllIlllIIlll[9]] = "AMULET_OF_GLORY";
        h.lIllIllIllllI[h.lIllIlllIIlll[11]] = "Edgeville";
        h.lIllIllIllllI[h.lIllIlllIIlll[13]] = "RADAS_BLESSING";
        h.lIllIllIllllI[h.lIllIlllIIlll[15]] = "Mount Karuulm";
        h.lIllIllIllllI[h.lIllIlllIIlll[2]] = "HOUSE_TELEPORT";
        h.lIllIllIllllI[h.lIllIlllIIlll[28]] = "Break";
        h.lIllIllIllllI[h.lIllIlllIIlll[30]] = "ZULANDRA_TELEPORT";
        h.lIllIllIllllI[h.lIllIlllIIlll[31]] = "Teleport";
        h.lIllIllIllllI[h.lIllIlllIIlll[33]] = "ROYAL_SEED_POD";
        h.lIllIllIllllI[h.lIllIlllIIlll[34]] = "Commune";
        h.lIllIllIllllI[h.lIllIlllIIlll[36]] = "ECTOPHIAL";
        h.lIllIllIllllI[h.lIllIlllIIlll[37]] = "Empty";
        h.lIllIllIllllI[h.lIllIlllIIlll[39]] = "CONSTRUCTION_CAPE";
        h.lIllIllIllllI[h.lIllIlllIIlll[40]] = "Tele to POH";
        h.lIllIllIllllI[h.lIllIlllIIlll[43]] = "QUEST_CAPE";
        h.lIllIllIllllI[h.lIllIlllIIlll[44]] = "Teleport";
        h.lIllIllIllllI[h.lIllIlllIIlll[47]] = "MAX_CAPE";
        h.lIllIllIllllI[h.lIllIlllIIlll[48]] = "Tele to POH";
        h.lIllIllIllllI[h.lIllIlllIIlll[52]] = "CRAFTING_CAPE";
        h.lIllIllIllllI[h.lIllIlllIIlll[53]] = "Teleport";
        h.lIllIllIllllI[h.lIllIlllIIlll[56]] = "FISHING_CAPE";
        h.lIllIllIllllI[h.lIllIlllIIlll[57]] = "Fishing Guild";
        h.lIllIllIllllI[h.lIllIlllIIlll[60]] = "EXPLORERS_RING";
        h.lIllIllIllllI[h.lIllIlllIIlll[61]] = "Teleport";
    }

    private GameEnum59(String string2, boolean bl, int ... nArray) {
        this.itemID = nArray;
        this.mustBeEquipped = bl;
        this.teleportOption = string2;
    }

    public boolean t() {
        return this.mustBeEquipped;
    }
}

