/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.unethicalite.api.commons.Predicates
 */
package gg.squire.fishing.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.commons.Predicates;

public final class GameEnum
extends Enum<f> {
    public static final  /* enum */ f FLY_FISHING;
    private final  String name;
    public static final  /* enum */ f KARAMBWAN;
    public static final  /* enum */ f BASS;
    public static final  /* enum */ f MACKEREL;
    public static final  /* enum */ f BARBARIAN_FISHING;
    public static final  /* enum */ f COD;
    public static final  /* enum */ f LOBSTER;
    public static final  /* enum */ f TUNA;
    public static final  /* enum */ f MONKFISH;
    private static final  f[] $VALUES;
    public static final  /* enum */ f HOUSE_KEY;
    public static final  /* enum */ f SHRIMP;
    public static final  /* enum */ f SARDINE;
    public static final  /* enum */ f SHARKS;
    
    private final  int fishNpcId;
    private final  Predicate<Item> baitPredicate;
    public static final  /* enum */ f SWORDFISH;
    private final  int[] fishId;
    public static final  /* enum */ f MINNOWS;
    
    private final  String[] action;
    private final  int fishingLevelRequired;
    public static final  /* enum */ f KARAMBWANJI;
    private final  Predicate<Item> toolPredicate;
    public static final  /* enum */ f PIKE;
    public static final  /* enum */ f ANGLERFISH;

        return String.valueOf(var1);
    }

    public String h() {
        return this.name;
    }

    public Predicate<Item> k() {
        return this.toolPredicate;
    }

    public Predicate<Item> l() {
        return this.baitPredicate;
    }

    public int m() {
        return this.fishNpcId;
    }

    private GameEnum(String string2, int n2, int[] nArray, Predicate<Item> predicate, Predicate<Item> predicate2, String ... stringArray) {
        this.name = string2;
        this.fishingLevelRequired = n2;
        this.fishId = nArray;
        this.toolPredicate = predicate;
        this.baitPredicate = predicate2;
        this.action = stringArray;
        this.fishNpcId = lIllllIIIIII[2];
    }

    static {
        f.lllIllIIIlllII();
        f.lllIllIIIllIll();
        int[] nArray = new int[lIllllIIIIII[5]];
        nArray[f.lIllllIIIIII[1]] = lIllllIIIIII[16];
        nArray[f.lIllllIIIIII[0]] = lIllllIIIIII[17];
        String[] stringArray = new String[lIllllIIIIII[5]];
        stringArray[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[19]];
        stringArray[f.lIllllIIIIII[0]] = lIlllIllllll[lIllllIIIIII[20]];
        SHRIMP = new GameEnum(lIlllIllllll[lIllllIIIIII[15]], lIllllIIIIII[0], nArray, lIllllIIIIII[18], stringArray);
        int[] nArray2 = new int[lIllllIIIIII[0]];
        nArray2[f.lIllllIIIIII[1]] = lIllllIIIIII[23];
        String[] stringArray2 = new String[lIllllIIIIII[0]];
        stringArray2[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[24]];
        SARDINE = new GameEnum(lIlllIllllll[lIllllIIIIII[22]], lIllllIIIIII[10], nArray2, lIllllIIIIII[4], lIllllIIIIII[11], stringArray2);
        int[] nArray3 = new int[lIllllIIIIII[0]];
        nArray3[f.lIllllIIIIII[1]] = lIllllIIIIII[6];
        String[] stringArray3 = new String[lIllllIIIIII[0]];
        stringArray3[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[27]];
        KARAMBWANJI = new GameEnum(lIlllIllllll[lIllllIIIIII[26]], lIllllIIIIII[10], nArray3, lIllllIIIIII[18], stringArray3);
        int[] nArray4 = new int[lIllllIIIIII[0]];
        nArray4[f.lIllllIIIIII[1]] = lIllllIIIIII[30];
        String[] stringArray4 = new String[lIllllIIIIII[0]];
        stringArray4[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[32]];
        MACKEREL = new GameEnum(lIlllIllllll[lIllllIIIIII[29]], lIllllIIIIII[26], nArray4, lIllllIIIIII[31], stringArray4);
        int[] nArray5 = new int[lIllllIIIIII[5]];
        nArray5[f.lIllllIIIIII[1]] = lIllllIIIIII[35];
        nArray5[f.lIllllIIIIII[0]] = lIllllIIIIII[36];
        String[] stringArray5 = new String[lIllllIIIIII[0]];
        stringArray5[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[37]];
        FLY_FISHING = new GameEnum(lIlllIllllll[lIllllIIIIII[34]], lIllllIIIIII[32], nArray5, item -> item.getName().toLowerCase().contains(lIlllIllllll[lIllllIIIIII[13]]), item -> item.getName().toLowerCase().contains(lIlllIllllll[lIllllIIIIII[12]]), stringArray5);
        int[] nArray6 = new int[lIllllIIIIII[0]];
        nArray6[f.lIllllIIIIII[1]] = lIllllIIIIII[40];
        String[] stringArray6 = new String[lIllllIIIIII[0]];
        stringArray6[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[41]];
        COD = new GameEnum(lIlllIllllll[lIllllIIIIII[39]], lIllllIIIIII[37], nArray6, lIllllIIIIII[31], stringArray6);
        int[] nArray7 = new int[lIllllIIIIII[0]];
        nArray7[f.lIllllIIIIII[1]] = lIllllIIIIII[44];
        String[] stringArray7 = new String[lIllllIIIIII[0]];
        stringArray7[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[45]];
        PIKE = new GameEnum(lIlllIllllll[lIllllIIIIII[43]], lIllllIIIIII[39], nArray7, item -> {
            boolean bl;
            if (f.lllIllIIIlllIl(item.getId(), lIllllIIIIII[4])) {
                bl = lIllllIIIIII[0];

                if (3 < 3) {
                    return false;
                }
            } else {
                bl = lIllllIIIIII[1];
            }
            return bl;
        }, item -> {
            boolean bl;
            if (f.lllIllIIIlllIl(item.getId(), lIllllIIIIII[11])) {
                bl = lIllllIIIIII[0];

                if (3 < -1) {
                    return ((0x27 ^ 9 ^ (0xDB ^ 0xAE)) & (55 + 117 - 79 + 137 ^ 130 + 37 - 164 + 186 ^ -1)) != 0;
                }
            } else {
                bl = lIllllIIIIII[1];
            }
            return bl;
        }, stringArray7);
        int[] nArray8 = new int[lIllllIIIIII[0]];
        nArray8[f.lIllllIIIIII[1]] = lIllllIIIIII[49];
        String[] stringArray8 = new String[lIllllIIIIII[0]];
        stringArray8[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[51]];
        TUNA = new GameEnum(lIlllIllllll[lIllllIIIIII[47]], lIllllIIIIII[48], nArray8, item -> item.getName().toLowerCase().contains(lIlllIllllll[lIllllIIIIII[10]]), lIllllIIIIII[50], stringArray8);
        int[] nArray9 = new int[lIllllIIIIII[0]];
        nArray9[f.lIllllIIIIII[1]] = lIllllIIIIII[55];
        String[] stringArray9 = new String[lIllllIIIIII[0]];
        stringArray9[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[48]];
        LOBSTER = new GameEnum(lIlllIllllll[lIllllIIIIII[53]], lIllllIIIIII[54], nArray9, lIllllIIIIII[56], lIllllIIIIII[50], stringArray9);
        int[] nArray10 = new int[lIllllIIIIII[0]];
        nArray10[f.lIllllIIIIII[1]] = lIllllIIIIII[60];
        String[] stringArray10 = new String[lIllllIIIIII[0]];
        stringArray10[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[62]];
        BASS = new GameEnum(lIlllIllllll[lIllllIIIIII[58]], lIllllIIIIII[59], nArray10, item -> item.getName().toLowerCase().contains(lIlllIllllll[lIllllIIIIII[9]]), lIllllIIIIII[61], stringArray10);
        int[] nArray11 = new int[lIllllIIIIII[0]];
        nArray11[f.lIllllIIIIII[1]] = lIllllIIIIII[65];
        String[] stringArray11 = new String[lIllllIIIIII[0]];
        stringArray11[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[66]];
        SWORDFISH = new GameEnum(lIlllIllllll[lIllllIIIIII[54]], lIllllIIIIII[64], nArray11, item -> item.getName().toLowerCase().contains(lIlllIllllll[lIllllIIIIII[8]]), lIllllIIIIII[50], stringArray11);
        int[] nArray12 = new int[lIllllIIIIII[0]];
        nArray12[f.lIllllIIIIII[1]] = lIllllIIIIII[70];
        String[] stringArray12 = new String[lIllllIIIIII[0]];
        stringArray12[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[71]];
        MONKFISH = new GameEnum(lIlllIllllll[lIllllIIIIII[68]], lIllllIIIIII[69], nArray12, lIllllIIIIII[18], stringArray12);
        int[] nArray13 = new int[lIllllIIIIII[0]];
        nArray13[f.lIllllIIIIII[1]] = lIllllIIIIII[74];
        String[] stringArray13 = new String[lIllllIIIIII[0]];
        stringArray13[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[75]];
        KARAMBWAN = new GameEnum(lIlllIllllll[lIllllIIIIII[59]], lIllllIIIIII[73], nArray13, item -> {
            boolean bl;
            if (f.lllIllIIIlllIl(item.getId(), lIllllIIIIII[7])) {
                bl = lIllllIIIIII[0];

            } else {
                bl = lIllllIIIIII[1];
            }
            return bl;
        }, item -> {
            boolean bl;
            if (f.lllIllIIIlllIl(item.getId(), lIllllIIIIII[6])) {
                bl = lIllllIIIIII[0];

                if (1 < -1) {
                    return ((85 + 11 - 88 + 242 ^ 99 + 113 - 186 + 143) & (0xC3 ^ 0xAF ^ (0x9E ^ 0xA1) ^ -1)) != 0;
                }
            } else {
                bl = lIllllIIIIII[1];
            }
            return bl;
        }, stringArray13);
        int[] nArray14 = new int[lIllllIIIIII[0]];
        nArray14[f.lIllllIIIIII[1]] = lIllllIIIIII[79];
        String[] stringArray14 = new String[lIllllIIIIII[0]];
        stringArray14[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[64]];
        SHARKS = new GameEnum(lIlllIllllll[lIllllIIIIII[77]], lIllllIIIIII[78], nArray14, item -> item.getName().toLowerCase().contains(lIlllIllllll[lIllllIIIIII[5]]), lIllllIIIIII[80], stringArray14);
        int[] nArray15 = new int[lIllllIIIIII[8]];
        nArray15[f.lIllllIIIIII[1]] = lIllllIIIIII[83];
        nArray15[f.lIllllIIIIII[0]] = lIllllIIIIII[84];
        nArray15[f.lIllllIIIIII[5]] = lIllllIIIIII[85];
        String[] stringArray15 = new String[lIllllIIIIII[0]];
        stringArray15[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[86]];
        BARBARIAN_FISHING = new GameEnum(lIlllIllllll[lIllllIIIIII[82]], lIllllIIIIII[76], nArray15, item -> item.getName().toLowerCase().contains(lIlllIllllll[lIllllIIIIII[0]]), item -> item.getName().toLowerCase().contains(lIlllIllllll[lIllllIIIIII[1]]), stringArray15);
        int[] nArray16 = new int[lIllllIIIIII[0]];
        nArray16[f.lIllllIIIIII[1]] = lIllllIIIIII[90];
        String[] stringArray16 = new String[lIllllIIIIII[0]];
        stringArray16[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[91]];
        MINNOWS = new GameEnum(lIlllIllllll[lIllllIIIIII[88]], lIllllIIIIII[89], nArray16, lIllllIIIIII[18], stringArray16);
        int[] nArray17 = new int[lIllllIIIIII[12]];
        nArray17[f.lIllllIIIIII[1]] = lIllllIIIIII[94];
        nArray17[f.lIllllIIIIII[0]] = lIllllIIIIII[95];
        nArray17[f.lIllllIIIIII[5]] = lIllllIIIIII[96];
        nArray17[f.lIllllIIIIII[8]] = lIllllIIIIII[97];
        nArray17[f.lIllllIIIIII[9]] = lIllllIIIIII[98];
        nArray17[f.lIllllIIIIII[10]] = lIllllIIIIII[99];
        String[] stringArray17 = new String[lIllllIIIIII[0]];
        stringArray17[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[101]];
        HOUSE_KEY = new GameEnum(lIlllIllllll[lIllllIIIIII[93]], lIllllIIIIII[0], nArray17, lIllllIIIIII[31], lIllllIIIIII[100], stringArray17);
        int[] nArray18 = new int[lIllllIIIIII[0]];
        nArray18[f.lIllllIIIIII[1]] = lIllllIIIIII[104];
        String[] stringArray18 = new String[lIllllIIIIII[0]];
        stringArray18[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[69]];
        ANGLERFISH = new GameEnum(lIlllIllllll[lIllllIIIIII[103]], lIllllIIIIII[89], nArray18, item -> {
            boolean bl;
            if (f.lllIllIIIlllIl(item.getId(), lIllllIIIIII[4])) {
                bl = lIllllIIIIII[0];

                if (2 == 0) {
                    return false;
                }
            } else {
                bl = lIllllIIIIII[1];
            }
            return bl;
        }, item -> {
            boolean bl;
            if (f.lllIllIIIlllIl(item.getId(), lIllllIIIIII[3])) {
                bl = lIllllIIIIII[0];

                }
            } else {
                bl = lIllllIIIIII[1];
            }
            return bl;
        }, stringArray18);
        f[] fArray = new f[lIllllIIIIII[28]];
        fArray[f.lIllllIIIIII[1]] = SHRIMP;
        fArray[f.lIllllIIIIII[0]] = SARDINE;
        fArray[f.lIllllIIIIII[5]] = KARAMBWANJI;
        fArray[f.lIllllIIIIII[8]] = MACKEREL;
        fArray[f.lIllllIIIIII[9]] = FLY_FISHING;
        fArray[f.lIllllIIIIII[10]] = COD;
        fArray[f.lIllllIIIIII[12]] = PIKE;
        fArray[f.lIllllIIIIII[13]] = TUNA;
        fArray[f.lIllllIIIIII[14]] = LOBSTER;
        fArray[f.lIllllIIIIII[15]] = BASS;
        fArray[f.lIllllIIIIII[19]] = SWORDFISH;
        fArray[f.lIllllIIIIII[20]] = MONKFISH;
        fArray[f.lIllllIIIIII[21]] = KARAMBWAN;
        fArray[f.lIllllIIIIII[22]] = SHARKS;
        fArray[f.lIllllIIIIII[24]] = BARBARIAN_FISHING;
        fArray[f.lIllllIIIIII[25]] = MINNOWS;
        fArray[f.lIllllIIIIII[26]] = HOUSE_KEY;
        fArray[f.lIllllIIIIII[27]] = ANGLERFISH;
        $VALUES = fArray;
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

    public int[] j() {
        return this.fishId;
    }

    public static f valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    private GameEnum(String string2, int n2, int[] nArray, int n3, int n4, String ... stringArray) {
        this.name = string2;
        this.fishingLevelRequired = n2;
        this.fishId = nArray;
        int[] nArray2 = new int[lIllllIIIIII[0]];
        nArray2[f.lIllllIIIIII[1]] = n3;
        this.toolPredicate = Predicates.ids((int[])nArray2);
        this.baitPredicate = null;
        this.fishNpcId = n4;
        this.action = stringArray;
    }

    public int i() {
        return this.fishingLevelRequired;
    }

    private static boolean lllIllIIIllllI(int n, int n2) {
        return n < n2;
    }

    private static void lllIllIIIllIll() {
        lIlllIllllll = new String[lIllllIIIIII[105]];
        f.lIlllIllllll[f.lIllllIIIIII[1]] = "feather";
        f.lIlllIllllll[f.lIllllIIIIII[0]] = "barbarian rod";
        f.lIlllIllllll[f.lIllllIIIIII[5]] = "harpoon";
        f.lIlllIllllll[f.lIllllIIIIII[8]] = "harpoon";
        f.lIlllIllllll[f.lIllllIIIIII[9]] = "harpoon";
        f.lIlllIllllll[f.lIllllIIIIII[10]] = "harpoon";
        f.lIlllIllllll[f.lIllllIIIIII[12]] = "feather";
        f.lIlllIllllll[f.lIllllIIIIII[13]] = "fly fishing";
        f.lIlllIllllll[f.lIllllIIIIII[14]] = "SHRIMP";
        f.lIlllIllllll[f.lIllllIIIIII[15]] = "Shrimp";
        f.lIlllIllllll[f.lIllllIIIIII[19]] = "Net";
        f.lIlllIllllll[f.lIllllIIIIII[20]] = "Small Net";
        f.lIlllIllllll[f.lIllllIIIIII[21]] = "SARDINE";
        f.lIlllIllllll[f.lIllllIIIIII[22]] = "Sardines";
        f.lIlllIllllll[f.lIllllIIIIII[24]] = "Bait";
        f.lIlllIllllll[f.lIllllIIIIII[25]] = "KARAMBWANJI";
        f.lIlllIllllll[f.lIllllIIIIII[26]] = "Karambwanji";
        f.lIlllIllllll[f.lIllllIIIIII[27]] = "Net";
        f.lIlllIllllll[f.lIllllIIIIII[28]] = "MACKEREL";
        f.lIlllIllllll[f.lIllllIIIIII[29]] = "Mackerel";
        f.lIlllIllllll[f.lIllllIIIIII[32]] = "Big Net";
        f.lIlllIllllll[f.lIllllIIIIII[33]] = "FLY_FISHING";
        f.lIlllIllllll[f.lIllllIIIIII[34]] = "Fly fishing";
        f.lIlllIllllll[f.lIllllIIIIII[37]] = "Lure";
        f.lIlllIllllll[f.lIllllIIIIII[38]] = "COD";
        f.lIlllIllllll[f.lIllllIIIIII[39]] = "Cod";
        f.lIlllIllllll[f.lIllllIIIIII[41]] = "Big Net";
        f.lIlllIllllll[f.lIllllIIIIII[42]] = "PIKE";
        f.lIlllIllllll[f.lIllllIIIIII[43]] = "Pike";
        f.lIlllIllllll[f.lIllllIIIIII[45]] = "Bait";
        f.lIlllIllllll[f.lIllllIIIIII[46]] = "TUNA";
        f.lIlllIllllll[f.lIllllIIIIII[47]] = "Tuna";
        f.lIlllIllllll[f.lIllllIIIIII[51]] = "Harpoon";
        f.lIlllIllllll[f.lIllllIIIIII[52]] = "LOBSTER";
        f.lIlllIllllll[f.lIllllIIIIII[53]] = "Lobster";
        f.lIlllIllllll[f.lIllllIIIIII[48]] = "Cage";
        f.lIlllIllllll[f.lIllllIIIIII[57]] = "BASS";
        f.lIlllIllllll[f.lIllllIIIIII[58]] = "Bass";
        f.lIlllIllllll[f.lIllllIIIIII[62]] = "Harpoon";
        f.lIlllIllllll[f.lIllllIIIIII[63]] = "SWORDFISH";
        f.lIlllIllllll[f.lIllllIIIIII[54]] = "Swordfish";
        f.lIlllIllllll[f.lIllllIIIIII[66]] = "Harpoon";
        f.lIlllIllllll[f.lIllllIIIIII[67]] = "MONKFISH";
        f.lIlllIllllll[f.lIllllIIIIII[68]] = "Monkfish";
        f.lIlllIllllll[f.lIllllIIIIII[71]] = "Net";
        f.lIlllIllllll[f.lIllllIIIIII[72]] = "KARAMBWAN";
        f.lIlllIllllll[f.lIllllIIIIII[59]] = "Karambwan";
        f.lIlllIllllll[f.lIllllIIIIII[75]] = "Fish";
        f.lIlllIllllll[f.lIllllIIIIII[76]] = "SHARKS";
        f.lIlllIllllll[f.lIllllIIIIII[77]] = "Shark";
        f.lIlllIllllll[f.lIllllIIIIII[64]] = "Harpoon";
        f.lIlllIllllll[f.lIllllIIIIII[81]] = "BARBARIAN_FISHING";
        f.lIlllIllllll[f.lIllllIIIIII[82]] = "Barbarian Fishing";
        f.lIlllIllllll[f.lIllllIIIIII[86]] = "Use-rod";
        f.lIlllIllllll[f.lIllllIIIIII[87]] = "MINNOWS";
        f.lIlllIllllll[f.lIllllIIIIII[88]] = "Minnows";
        f.lIlllIllllll[f.lIllllIIIIII[91]] = "Small Net";
        f.lIlllIllllll[f.lIllllIIIIII[92]] = "HOUSE_KEY";
        f.lIlllIllllll[f.lIllllIIIIII[93]] = "House Key";
        f.lIlllIllllll[f.lIllllIIIIII[101]] = "Cast";
        f.lIlllIllllll[f.lIllllIIIIII[102]] = "ANGLERFISH";
        f.lIlllIllllll[f.lIllllIIIIII[103]] = "Anglerfish";
        f.lIlllIllllll[f.lIllllIIIIII[69]] = "Bait";
    }

    private GameEnum(String string2, int n2, int[] nArray, Predicate<Item> predicate, int n3, String ... stringArray) {
        this.name = string2;
        this.fishingLevelRequired = n2;
        this.fishId = nArray;
        this.toolPredicate = predicate;
        this.baitPredicate = null;
        this.fishNpcId = n3;
        this.action = stringArray;
    }

    public String[] n() {
        return this.action;
    }

    private GameEnum(String string2, int n2, int[] nArray, int n3, String ... stringArray) {
        this.name = string2;
        this.fishingLevelRequired = n2;
        this.fishId = nArray;
        int[] nArray2 = new int[lIllllIIIIII[0]];
        nArray2[f.lIllllIIIIII[1]] = n3;
        this.toolPredicate = Predicates.ids((int[])nArray2);
        this.baitPredicate = null;
        this.fishNpcId = lIllllIIIIII[2];
        this.action = stringArray;
    }

    private static boolean lllIllIIIlllIl(int n, int n2) {
        return n == n2;
    }
}

