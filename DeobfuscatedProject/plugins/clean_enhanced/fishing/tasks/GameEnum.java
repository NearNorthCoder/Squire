/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.unethicalite.api.commons.Predicates
 */
package gg.squire.fishing.tasks;

import java.util.function.Predicate;
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

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 1;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 1;
        while (var11 < lllllllllllllllIlIlllIIlIlIllllI2) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (((0x64 ^ 0x69 ^ (0xC7 ^ 0x9E)) & (0x3B ^ 0xA ^ (0x4C ^ 0x29) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var6);
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

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
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
        this.fishNpcId = 2;
    }

    static {
        f.var19();
        f.var20();
        int[] nArray = new int[5];
        nArray[1] = var2[16];
        nArray[0] = var2[17];
        String[] stringArray = new String[5];
        stringArray[1] = var1[var2[19]];
        stringArray[0] = var1[var2[20]];
        SHRIMP = new GameEnum(var1[var2[15]], 0, nArray, var2[18], stringArray);
        int[] nArray2 = new int[0];
        nArray2[1] = var2[23];
        String[] stringArray2 = new String[0];
        stringArray2[1] = var1[var2[24]];
        SARDINE = new GameEnum(var1[var2[22]], var2[10], nArray2, 4, var2[11], stringArray2);
        int[] nArray3 = new int[0];
        nArray3[1] = 6;
        String[] stringArray3 = new String[0];
        stringArray3[1] = var1[var2[27]];
        KARAMBWANJI = new GameEnum(var1[var2[26]], var2[10], nArray3, var2[18], stringArray3);
        int[] nArray4 = new int[0];
        nArray4[1] = var2[30];
        String[] stringArray4 = new String[0];
        stringArray4[1] = var1[var2[32]];
        MACKEREL = new GameEnum(var1[var2[29]], var2[26], nArray4, var2[31], stringArray4);
        int[] nArray5 = new int[5];
        nArray5[1] = var2[35];
        nArray5[0] = var2[36];
        String[] stringArray5 = new String[0];
        stringArray5[1] = var1[var2[37]];
        FLY_FISHING = new GameEnum(var1[var2[34]], var2[32], nArray5, item -> item.getName().toLowerCase().contains(var1[var2[13]]), item -> item.getName().toLowerCase().contains(var1[var2[12]]), stringArray5);
        int[] nArray6 = new int[0];
        nArray6[1] = var2[40];
        String[] stringArray6 = new String[0];
        stringArray6[1] = var1[var2[41]];
        COD = new GameEnum(var1[var2[39]], var2[37], nArray6, var2[31], stringArray6);
        int[] nArray7 = new int[0];
        nArray7[1] = var2[44];
        String[] stringArray7 = new String[0];
        stringArray7[1] = var1[var2[45]];
        PIKE = new GameEnum(var1[var2[43]], var2[39], nArray7, item -> {
            boolean bl;
            if ((item.getId() == item.getId()2)) {
                bl = 0;
                0;
                if (3 < 3) {
                    return ((0x34 ^ 0x6D) & ~(0xE8 ^ 0xB1)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        }, item -> {
            boolean bl;
            if ((item.getId() == item.getId()2)) {
                bl = 0;
                0;
                if (3 < -1) {
                    return ((0x27 ^ 9 ^ (0xDB ^ 0xAE)) & (55 + 117 - 79 + 137 ^ 130 + 37 - 164 + 186 ^ -1)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        }, stringArray7);
        int[] nArray8 = new int[0];
        nArray8[1] = var2[49];
        String[] stringArray8 = new String[0];
        stringArray8[1] = var1[var2[51]];
        TUNA = new GameEnum(var1[var2[47]], var2[48], nArray8, item -> item.getName().toLowerCase().contains(var1[var2[10]]), var2[50], stringArray8);
        int[] nArray9 = new int[0];
        nArray9[1] = var2[55];
        String[] stringArray9 = new String[0];
        stringArray9[1] = var1[var2[48]];
        LOBSTER = new GameEnum(var1[var2[53]], var2[54], nArray9, var2[56], var2[50], stringArray9);
        int[] nArray10 = new int[0];
        nArray10[1] = var2[60];
        String[] stringArray10 = new String[0];
        stringArray10[1] = var1[var2[62]];
        BASS = new GameEnum(var1[var2[58]], var2[59], nArray10, item -> item.getName().toLowerCase().contains(var1[9]), var2[61], stringArray10);
        int[] nArray11 = new int[0];
        nArray11[1] = var2[65];
        String[] stringArray11 = new String[0];
        stringArray11[1] = var1[var2[66]];
        SWORDFISH = new GameEnum(var1[var2[54]], var2[64], nArray11, item -> item.getName().toLowerCase().contains(var1[8]), var2[50], stringArray11);
        int[] nArray12 = new int[0];
        nArray12[1] = var2[70];
        String[] stringArray12 = new String[0];
        stringArray12[1] = var1[var2[71]];
        MONKFISH = new GameEnum(var1[var2[68]], var2[69], nArray12, var2[18], stringArray12);
        int[] nArray13 = new int[0];
        nArray13[1] = var2[74];
        String[] stringArray13 = new String[0];
        stringArray13[1] = var1[var2[75]];
        KARAMBWAN = new GameEnum(var1[var2[59]], var2[73], nArray13, item -> {
            boolean bl;
            if ((item.getId() == item.getId()2)) {
                bl = 0;
                0;
                if (-2 > 0) {
                    return ((0xD4 ^ 0x8B) & ~(0x6F ^ 0x30)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        }, item -> {
            boolean bl;
            if ((item.getId() == item.getId()2)) {
                bl = 0;
                0;
                if (1 < -1) {
                    return ((85 + 11 - 88 + 242 ^ 99 + 113 - 186 + 143) & (0xC3 ^ 0xAF ^ (0x9E ^ 0xA1) ^ -1)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        }, stringArray13);
        int[] nArray14 = new int[0];
        nArray14[1] = var2[79];
        String[] stringArray14 = new String[0];
        stringArray14[1] = var1[var2[64]];
        SHARKS = new GameEnum(var1[var2[77]], var2[78], nArray14, item -> item.getName().toLowerCase().contains(var1[5]), var2[80], stringArray14);
        int[] nArray15 = new int[8];
        nArray15[1] = var2[83];
        nArray15[0] = var2[84];
        nArray15[5] = var2[85];
        String[] stringArray15 = new String[0];
        stringArray15[1] = var1[var2[86]];
        BARBARIAN_FISHING = new GameEnum(var1[var2[82]], var2[76], nArray15, item -> item.getName().toLowerCase().contains(var1[0]), item -> item.getName().toLowerCase().contains(var1[1]), stringArray15);
        int[] nArray16 = new int[0];
        nArray16[1] = var2[90];
        String[] stringArray16 = new String[0];
        stringArray16[1] = var1[var2[91]];
        MINNOWS = new GameEnum(var1[var2[88]], var2[89], nArray16, var2[18], stringArray16);
        int[] nArray17 = new int[var2[12]];
        nArray17[1] = var2[94];
        nArray17[0] = var2[95];
        nArray17[5] = var2[96];
        nArray17[8] = var2[97];
        nArray17[9] = var2[98];
        nArray17[f.var2[10]] = var2[99];
        String[] stringArray17 = new String[0];
        stringArray17[1] = var1[var2[101]];
        HOUSE_KEY = new GameEnum(var1[var2[93]], 0, nArray17, var2[31], var2[100], stringArray17);
        int[] nArray18 = new int[0];
        nArray18[1] = var2[104];
        String[] stringArray18 = new String[0];
        stringArray18[1] = var1[var2[69]];
        ANGLERFISH = new GameEnum(var1[var2[103]], var2[89], nArray18, item -> {
            boolean bl;
            if ((item.getId() == item.getId()2)) {
                bl = 0;
                0;
                
            } else {
                bl = 1;
            }
            return bl;
        }, item -> {
            boolean bl;
            if ((item.getId() == item.getId()2)) {
                bl = 0;
                0;
                if null != null {
                    return ((0x4F ^ 9) & ~(0xDF ^ 0x99)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        }, stringArray18);
        f[] fArray = new f[var2[28]];
        fArray[1] = SHRIMP;
        fArray[0] = SARDINE;
        fArray[5] = KARAMBWANJI;
        fArray[8] = MACKEREL;
        fArray[9] = FLY_FISHING;
        fArray[f.var2[10]] = COD;
        fArray[f.var2[12]] = PIKE;
        fArray[f.var2[13]] = TUNA;
        fArray[f.var2[14]] = LOBSTER;
        fArray[f.var2[15]] = BASS;
        fArray[f.var2[19]] = SWORDFISH;
        fArray[f.var2[20]] = MONKFISH;
        fArray[f.var2[21]] = KARAMBWAN;
        fArray[f.var2[22]] = SHARKS;
        fArray[f.var2[24]] = BARBARIAN_FISHING;
        fArray[f.var2[25]] = MINNOWS;
        fArray[f.var2[26]] = HOUSE_KEY;
        fArray[f.var2[27]] = ANGLERFISH;
        $VALUES = fArray;
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
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
        int[] nArray2 = new int[0];
        nArray2[1] = n3;
        this.toolPredicate = Predicates.ids((int[])nArray2);
        this.baitPredicate = null;
        this.fishNpcId = n4;
        this.action = stringArray;
    }

    public int i() {
        return this.fishingLevelRequired;
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
        int[] nArray2 = new int[0];
        nArray2[1] = n3;
        this.toolPredicate = Predicates.ids((int[])nArray2);
        this.baitPredicate = null;
        this.fishNpcId = 2;
        this.action = stringArray;
    }

}

