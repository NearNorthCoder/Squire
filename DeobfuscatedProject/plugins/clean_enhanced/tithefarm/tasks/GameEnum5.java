/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 */
package gg.squire.tithefarm.tasks;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

public final class GameEnum5
extends Enum<f> {
    public static final  /* enum */ f GOLOVANOVA;
    public static final  /* enum */ f LOGAVANO;
    
    private static final  f[] $VALUES;
    public static final  /* enum */ f EMPTY;
    public static final  /* enum */ f BOLOGANO;
    private static final  Map<Integer, f> plantTypes;
    private final  String name;
    private final  int baseId;
    private final  int[] objectIds;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var2[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var2[0];
        while (f.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static void var14() {
        var2 = new int[46];
        f.var2[0] = (0x6C ^ 0x1A ^ (0xD0 ^ 0x97)) & (0x14 ^ 0x55 ^ (0x36 ^ 0x46) ^ -1);
        f.var2[1] = 1;
        f.var2[2] = -(0xFFFF97B9 & 0x7C4F) & (0xFFFFFFFF & 0x7EFF);
        f.var2[3] = 2;
        f.var2[4] = 3;
        f.var2[5] = 0xFFFFFBBB & 0x6F45;
        f.var2[6] = 108 + 20 - 30 + 45 ^ 119 + 87 - 205 + 131;
        f.var2[7] = -(0xFFFFD6E7 & 0x3D1D) & (0xFFFFFEFE & 0x7FFD);
        f.var2[8] = -1 & (0xFFFFEBFF & 0x7EF9);
        f.var2[9] = -(0xFFFFD55B & 0x3EA6) & (0xFFFFFEFB & Short.MAX_VALUE);
        f.var2[10] = 0xFFFFFBFF & 0x6EFB;
        f.var2[11] = 0x3B ^ 0x4B ^ (0xDD ^ 0xA9);
        f.var2[12] = 0xFFFFFBFC & 0x6EFF;
        f.var2[13] = 46 + 36 - -16 + 77 ^ 146 + 69 - 50 + 5;
        f.var2[14] = 0xFFFFEAFF & 0x7FFD;
        f.var2[15] = 50 + 19 - -82 + 5 ^ 6 + 129 - -7 + 12;
        f.var2[16] = 0xFFFFEAFF & 0x7FFE;
        f.var2[17] = 0x6E ^ 0x69;
        f.var2[18] = -(0xFFFFE513 & 0x1FED) & (0xFFFFEFFF & Short.MAX_VALUE);
        f.var2[19] = 0xCF ^ 0xA7 ^ (0xE9 ^ 0x89);
        f.var2[20] = -(29 + 209 - 90 + 62) & (0xFFFFFBFB & 0x6FD5);
        f.var2[21] = 0x77 ^ 0x7E;
        f.var2[22] = 0xFF ^ 0xBE ^ (0x23 ^ 0x68);
        f.var2[23] = -(100 + 173 - 166 + 78) & (0xFFFFFBBF & 0x6FFA);
        f.var2[24] = -(0xFFFFCFF4 & 0x340F) & (0xFFFFEF0F & Short.MAX_VALUE);
        f.var2[25] = 0xFFFFEF67 & 0x7B9B;
        f.var2[26] = 0xFFFFEB24 & 0x7FDF;
        f.var2[27] = 0xFFFFFFEF & 0x6B15;
        f.var2[28] = 0xFFFFFFB6 & 0x6B4F;
        f.var2[29] = -(35 + 48 - -35 + 131) & (0xFFFFEFFF & 0x7BFF);
        f.var2[30] = 0xFFFFFF29 & 0x6BDE;
        f.var2[31] = 0xFFFFEF59 & 0x7BAF;
        f.var2[32] = 0xFFFFEB2A & 0x7FDF;
        f.var2[33] = 0xFFFFFFFB & 0x6B0F;
        f.var2[34] = 0xFFFFFB8F & 0x6F7D;
        f.var2[35] = -(0xFFFFF7ED & 0xC3B) & (0xFFFFEF3F & Short.MAX_VALUE);
        f.var2[36] = -(0xFFFFCDFD & 0x36E3) & (0xFFFFEFEE & Short.MAX_VALUE);
        f.var2[37] = -(0xFFFF97FD & 0x7863) & (0xFFFFFB6F & Short.MAX_VALUE);
        f.var2[38] = -(0xFFFFB7FE & 0x5CCF) & (0xFFFFFFDD & Short.MAX_VALUE);
        f.var2[39] = 0xFFFFFF3F & 0x6BD1;
        f.var2[40] = 0xFFFFFF7B & 0x6B96;
        f.var2[41] = 0xFFFFFBFF & 0x6F13;
        f.var2[42] = -(0xF6 ^ 0xB5) & (0xFFFFFFF6 & 0x6B5F);
        f.var2[43] = -(0x1E ^ 0x75) & (0xFFFFFFFF & 0x6B7F);
        f.var2[44] = 0xFFFFEFFF & 0x7B16;
        f.var2[45] = -(0x20 ^ 0x46) & (0xFFFFFB7F & 0x6FFD);
    }

    private static void var15() {
        var1 = new String[var2[19]];
        f.var1[f.var2[0]] = "EMPTY";
        f.var1[f.var2[1]] = "Empty";
        f.var1[f.var2[3]] = "GOLOVANOVA";
        f.var1[f.var2[4]] = "Golovanova";
        f.var1[f.var2[11]] = "BOLOGANO";
        f.var1[f.var2[13]] = "Bologano";
        f.var1[f.var2[15]] = "LOGAVANO";
        f.var1[f.var2[17]] = "Logavano";
    }

    public String j() {
        return this.name;
    }

    public static f valueOf(String string) {
        return Enum.valueOf(GameEnum5.class, string);
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    public int[] l() {
        return this.objectIds;
    }

    private GameEnum5(String string2, int n3, int ... nArray) {
        this.name = string2;
        this.baseId = n3;
        this.objectIds = nArray;
    }

    public static f d(int n2) {
        return plantTypes.get(n2);
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    public int k() {
        return this.baseId;
    }

    /*
     * WARNING - void declaration
     */
    
                ++var23;
                0;
                
                break block2;
            }
            plantTypes = builder.build();
        }
    }
}

