/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.templetrekking.tasks;

import gg.squire.templetrekking.tasks.EHelper;
import gg.squire.templetrekking.tasks.FHelper;
import gg.squire.templetrekking.tasks.GHelper;
import gg.squire.templetrekking.tasks.HHelper;
import gg.squire.templetrekking.tasks.IHelper;
import gg.squire.templetrekking.tasks.JHelper;
import gg.squire.templetrekking.tasks.KHelper;
import java.util.List;

public final class GameEnum2
extends Enum<d> {
    private static final  d[] $VALUES;
    public static final  /* enum */ d LOBSTER;
    public static final  /* enum */ d XP_TOME;
    
    private final  List<Integer> rewardIds;
    public static final  /* enum */ d WATERMELON_SEED;
    public static final  /* enum */ d PURE_ESSENCE;
    
    public static final  /* enum */ d SILVER_BAR;
    public static final  /* enum */ d BOW_STRING;
    public static final  /* enum */ d COAL_AND_IRON;
    private final  int interfaceId;
    private final  String name;
    public static final  /* enum */ d HERB;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static void var9() {
        var1 = new int[20];
        d.var1[0] = (0x7C ^ 0xB ^ (0x84 ^ 0xBE)) & (0x49 ^ 0x38 ^ (0x64 ^ 0x58) ^ -1);
        d.var1[1] = 1;
        d.var1[2] = 2;
        d.var1[3] = 3;
        d.var1[4] = 0x51 ^ 0x13 ^ (0x80 ^ 0xC6);
        d.var1[5] = 0xBF ^ 0xBA;
        d.var1[6] = 128 + 40 - 120 + 143 ^ 138 + 133 - 129 + 43;
        d.var1[7] = 0xFFFFDFFF & 0x2BEA;
        d.var1[8] = (0xC7 ^ 0xA7) + (6 ^ 0x35) - (0x72 ^ 0xF) + (158 + 160 - 138 + 4);
        d.var1[9] = 178 + 122 - 197 + 101;
        d.var1[10] = 0x15 ^ 0x12;
        d.var1[11] = 0x78 ^ 0x70;
        d.var1[12] = 0x77 ^ 0x72 ^ (0xBC ^ 0xB0);
        d.var1[13] = 0x92 ^ 0x98;
        d.var1[14] = 0x55 ^ 0x5E;
        d.var1[15] = 0xB5 ^ 0xB9;
        d.var1[16] = 0x77 ^ 0x7A;
        d.var1[17] = 8 ^ 0x50 ^ (0x37 ^ 0x61);
        d.var1[18] = 10 + 70 - -4 + 90 ^ 62 + 122 - 137 + 114;
        d.var1[19] = 0x57 ^ 0x21 ^ (0x31 ^ 0x57);
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static String var16(String var17, String var18) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var20 = var18.toCharArray();
        int var21 = var1[0];
        char[] var22 = var17.toCharArray();
        int var23 = var22.length;
        int var24 = var1[0];
        while (d.var25(var24, var23)) {
            char var26 = var22[var24];
            var19.append((char)(var26 ^ var20[var21 % var20.length]));
            0;
            ++var21;
            ++var24;
            0;
            if (2 > 0) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    public String y() {
        return this.name;
    }

    private GameEnum2(int n3, List<Integer> list, String string2) {
        this.interfaceId = n3;
        this.rewardIds = list;
        this.name = string2;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

    public List<Integer> w() {
        return this.rewardIds;
    }

    private static void var27() {
        var2 = new String[var1[19]];
        d.var2[d.var1[0]] = "PURE_ESSENCE";
        d.var2[d.var1[1]] = "Pure essence";
        d.var2[d.var1[2]] = "BOW_STRING";
        d.var2[d.var1[3]] = "Bow string";
        d.var2[d.var1[4]] = "SILVER_BAR";
        d.var2[d.var1[5]] = "Silver bar";
        d.var2[d.var1[6]] = "HERB";
        d.var2[d.var1[10]] = "Herbs";
        d.var2[d.var1[11]] = "COAL_AND_IRON";
        d.var2[d.var1[12]] = "Ores";
        d.var2[d.var1[13]] = "WATERMELON_SEED";
        d.var2[d.var1[14]] = "Watermelon seed";
        d.var2[d.var1[15]] = "LOBSTER";
        d.var2[d.var1[16]] = "Raw lobster";
        d.var2[d.var1[17]] = "XP_TOME";
        d.var2[d.var1[18]] = "Reward tomes";
    }

    private static boolean var25(int n2, int n3) {
        return n2 < n3;
    }

    public int x() {
        return this.interfaceId;
    }

    static {
        d.var9();
        d.var27();
        PURE_ESSENCE = new GameEnum2(var1[0], new EHelper(), var2[var1[1]]);
        BOW_STRING = new GameEnum2(var1[1], new FHelper(), var2[var1[3]]);
        SILVER_BAR = new GameEnum2(var1[2], new GHelper(), var2[var1[5]]);
        HERB = new GameEnum2(var1[3], List.of(Integer.valueOf(var1[7]), Integer.valueOf(var1[8]), Integer.valueOf(var1[9])), var2[var1[10]]);
        COAL_AND_IRON = new GameEnum2(var1[4], new HHelper(), var2[var1[12]]);
        WATERMELON_SEED = new GameEnum2(var1[5], new IHelper(), var2[var1[14]]);
        LOBSTER = new GameEnum2(var1[6], new JHelper(), var2[var1[16]]);
        XP_TOME = new GameEnum2(var1[10], new KHelper(), var2[var1[18]]);
        d[] dArray = new d[var1[11]];
        dArray[d.var1[0]] = PURE_ESSENCE;
        dArray[d.var1[1]] = BOW_STRING;
        dArray[d.var1[2]] = SILVER_BAR;
        dArray[d.var1[3]] = HERB;
        dArray[d.var1[4]] = COAL_AND_IRON;
        dArray[d.var1[5]] = WATERMELON_SEED;
        dArray[d.var1[6]] = LOBSTER;
        dArray[d.var1[10]] = XP_TOME;
        $VALUES = dArray;
    }
}

