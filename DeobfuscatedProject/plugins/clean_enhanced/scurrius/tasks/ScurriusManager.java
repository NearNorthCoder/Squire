/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.scurrius.tasks;

import java.util.List;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;

public class ScurriusManager {
    public static  int G;
    public static  int B;
    public static  List<Integer> E;
    
    public static  int C;
    public static  int A;
    
    public static  WorldPoint H;
    public static  List<String> v;
    public static  List<String> y;
    public static  int D;
    public static  List<String> x;
    public static  List<String> z;
    public static  WorldArea F;
    public static  List<String> w;

    static {
        d.var3();
        d.var4();
        String[] stringArray = new String[var1[0]];
        stringArray[d.var1[1]] = var2[var1[1]];
        stringArray[d.var1[2]] = var2[var1[2]];
        stringArray[d.var1[3]] = var2[var1[3]];
        stringArray[d.var1[4]] = var2[var1[4]];
        stringArray[d.var1[5]] = var2[var1[5]];
        stringArray[d.var1[6]] = var2[var1[6]];
        stringArray[d.var1[7]] = var2[var1[7]];
        stringArray[d.var1[8]] = var2[var1[8]];
        stringArray[d.var1[9]] = var2[var1[9]];
        stringArray[d.var1[10]] = var2[var1[10]];
        stringArray[d.var1[11]] = var2[var1[11]];
        stringArray[d.var1[12]] = var2[var1[12]];
        stringArray[d.var1[13]] = var2[var1[13]];
        v = List.of(stringArray);
        w = List.of(var2[var1[0]], var2[var1[14]], var2[var1[15]], var2[var1[16]]);
        x = List.of(var2[var1[17]], var2[var1[18]], var2[var1[19]], var2[var1[20]], var2[var1[21]], var2[var1[22]]);
        y = List.of(var2[var1[23]], var2[var1[24]]);
        z = List.of(var2[var1[25]]);
        A = var1[26];
        B = var1[27];
        C = var1[28];
        D = var1[29];
        E = List.of(Integer.valueOf(C), Integer.valueOf(D));
        F = new WorldArea(new WorldPoint(var1[30], var1[31], var1[1]), new WorldPoint(var1[32], var1[33], var1[1]));
        G = var1[34];
        H = new WorldPoint(var1[35], var1[36], var1[1]);
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var1[1];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var1[1];
        while (d.var20(var19, var18)) {
            char var21 = var17[var19];
            var14.append((char)(var21 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (((0x74 ^ 0x15 ^ (0xFA ^ 0xB4)) & (166 + 9 - 146 + 140 ^ 99 + 116 - 130 + 49 ^ -1)) >= 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static void var4() {
        var2 = new String[var1[37]];
        d.var2[d.var1[1]] = "Scurrius' spine";
        d.var2[d.var1[2]] = "Rune chainbody";
        d.var2[d.var1[3]] = "Rune battleaxe";
        d.var2[d.var1[4]] = "Rune full helm";
        d.var2[d.var1[5]] = "Rune med helm";
        d.var2[d.var1[6]] = "Rune sq shield";
        d.var2[d.var1[7]] = "Chaos rune";
        d.var2[d.var1[8]] = "Death rune";
        d.var2[d.var1[9]] = "Rune arrow";
        d.var2[d.var1[10]] = "Coins";
        d.var2[d.var1[11]] = "Prayer potion(4)";
        d.var2[d.var1[12]] = "Law rune";
        d.var2[d.var1[13]] = "Adamant platebody";
        d.var2[d.var1[0]] = "Trout";
        d.var2[d.var1[14]] = "Shark";
        d.var2[d.var1[15]] = "Tuna";
        d.var2[d.var1[16]] = "Lobster";
        d.var2[d.var1[17]] = "Rune chainbody";
        d.var2[d.var1[18]] = "Rune battleaxe";
        d.var2[d.var1[19]] = "Rune full helm";
        d.var2[d.var1[20]] = "Rune med helm";
        d.var2[d.var1[21]] = "Rune sq shield";
        d.var2[d.var1[22]] = "Adamant platebody";
        d.var2[d.var1[23]] = "Super strength(1)";
        d.var2[d.var1[24]] = "Ranging potion(1)";
        d.var2[d.var1[25]] = "Vial";
    }

    private static boolean var20(int n2, int n3) {
        return n2 < n3;
    }

    private static void var3() {
        var1 = new int[38];
        d.var1[0] = 0x71 ^ 0x7C;
        d.var1[1] = (0xAF ^ 0xBF ^ (0x13 ^ 0x5F)) & (0x20 ^ 0x11 ^ (0xD4 ^ 0xB9) ^ -1);
        d.var1[2] = 1;
        d.var1[3] = 2;
        d.var1[4] = 3;
        d.var1[5] = 0x26 ^ 0x22;
        d.var1[6] = 3 ^ 6;
        d.var1[7] = 0x17 ^ 0x11;
        d.var1[8] = 0x5F ^ 0x58;
        d.var1[9] = 0xC ^ 4;
        d.var1[10] = 0x26 ^ 0x2D ^ 2;
        d.var1[11] = 0x51 ^ 0x11 ^ (0xD5 ^ 0x9F);
        d.var1[12] = 0xFF ^ 0xA7 ^ (0xEF ^ 0xBC);
        d.var1[13] = 0x6A ^ 0x66;
        d.var1[14] = 0xBB ^ 0xB5;
        d.var1[15] = 0x26 ^ 0x29;
        d.var1[16] = 149 + 64 - 119 + 78 ^ 128 + 78 - 181 + 163;
        d.var1[17] = 0x57 ^ 0x46;
        d.var1[18] = 0x50 ^ 0x42;
        d.var1[19] = 0x76 ^ 0x65;
        d.var1[20] = 35 + 179 - 178 + 155 ^ 46 + 74 - 5 + 56;
        d.var1[21] = 0xF ^ 0x12 ^ (0x1A ^ 0x12);
        d.var1[22] = 0x5C ^ 0x1D ^ (0xD1 ^ 0x86);
        d.var1[23] = 0x88 ^ 0x9F;
        d.var1[24] = 0xB6 ^ 0xBC ^ (0x3C ^ 0x2E);
        d.var1[25] = 0x50 ^ 0x49;
        d.var1[26] = 0xFFFFFDAF & 0xBF76;
        d.var1[27] = 0xFFFFEAFD & 0x1F56;
        d.var1[28] = -(0xFFFFFE4F & 0x65B5) & (0xFFFFEFF7 & 0x7E5E);
        d.var1[29] = -(0xFFFFFC87 & 0x73FD) & (0xFFFFFBFD & 0x7ED6);
        d.var1[30] = -(0xFFFFFBDB & 0x5727) & (0xFFFFDFDF & 0x7FFB);
        d.var1[31] = 0xFFFFEE9F & 0x37E2;
        d.var1[32] = 0xFFFFBCEE & 0x4FFD;
        d.var1[33] = 0xFFFFE7B7 & 0x3EDD;
        d.var1[34] = -(0xFFFF87CE & 0x7F7F) & (0xFFFFFFFF & 0x2F7F);
        d.var1[35] = -(0xFFFFF5C6 & 0x2EBB) & (0xFFFFBEFF & 0x6FAF);
        d.var1[36] = 0xFFFF9D8B & 0x6EFF;
        d.var1[37] = 101 + 48 - 125 + 116 ^ 125 + 139 - 204 + 90;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }
}

