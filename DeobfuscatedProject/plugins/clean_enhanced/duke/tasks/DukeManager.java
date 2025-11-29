/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.duke.tasks;

import java.util.List;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;

public class DukeManager {
    public static  int O;
    public static  int K;
    public static  List<String> T;
    public static  int M;
    
    public static  int L;
    public static  int P;
    public static  int J;
    public static  int R;
    public static  int Q;
    public static  int I;
    public static  List<String> U;
    public static  List<String> S;
    
    public static  int N;

    public static WorldArea l(TileObject tileObject) {
        return new WorldArea(e.k(tileObject), 3, 4);
    }

    public static WorldPoint o(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(7).dy(1);
    }

    public static WorldPoint h(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(8);
    }

    static {
        e.var3();
        e.var4();
        I = var2[12];
        J = var2[13];
        K = var2[14];
        L = var2[15];
        M = var2[16];
        N = var2[17];
        O = var2[18];
        P = var2[19];
        Q = var2[20];
        R = var2[21];
        String[] stringArray = new String[var2[22]];
        stringArray[e.var2[10]] = var1[var2[10]];
        stringArray[4] = var1[4];
        stringArray[e.var2[11]] = var1[var2[11]];
        stringArray[6] = var1[6];
        stringArray[7] = var1[7];
        stringArray[0] = var1[0];
        stringArray[e.var2[23]] = var1[var2[23]];
        stringArray[e.var2[24]] = var1[var2[24]];
        stringArray[9] = var1[9];
        stringArray[e.var2[25]] = var1[var2[25]];
        stringArray[e.var2[26]] = var1[var2[26]];
        stringArray[3] = var1[3];
        stringArray[e.var2[27]] = var1[var2[27]];
        stringArray[e.var2[28]] = var1[var2[28]];
        stringArray[e.var2[29]] = var1[var2[29]];
        stringArray[e.var2[30]] = var1[var2[30]];
        stringArray[e.var2[31]] = var1[var2[31]];
        stringArray[e.var2[32]] = var1[var2[32]];
        stringArray[1] = var1[1];
        stringArray[e.var2[33]] = var1[var2[33]];
        stringArray[e.var2[34]] = var1[var2[34]];
        stringArray[e.var2[35]] = var1[var2[35]];
        stringArray[e.var2[36]] = var1[var2[36]];
        stringArray[e.var2[37]] = var1[var2[37]];
        stringArray[e.var2[38]] = var1[var2[38]];
        stringArray[e.var2[39]] = var1[var2[39]];
        stringArray[e.var2[40]] = var1[var2[40]];
        stringArray[e.var2[41]] = var1[var2[41]];
        stringArray[e.var2[42]] = var1[var2[42]];
        stringArray[e.var2[43]] = var1[var2[43]];
        stringArray[e.var2[44]] = var1[var2[44]];
        stringArray[e.var2[45]] = var1[var2[45]];
        S = List.of(stringArray);
        T = List.of(var1[var2[22]], var1[var2[46]]);
        U = List.of(var1[var2[47]], var1[var2[48]], var1[var2[49]], var1[var2[50]], var1[var2[51]], var1[var2[52]]);
    }

    public static WorldPoint m(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(5).dy(1);
    }

    public static WorldPoint n(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(6).dy(1);
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public static WorldPoint p(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(6).dy(1);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean r(TileObject tileObject) {
        boolean bl;
        TileObject var11;
        void var12;
        Player player = Players.getLocal();
        if player == null {
            return var2[10];
        }
        if ((var12.getWorldX() - var2[11] > var11.getWorldX())) {
            bl = 4;
            0;
            if (((0x48 ^ 0x10) & ~(0xCE ^ 0x96)) < 0) {
                return ((0xE1 ^ 0xC6) & ~(0xAC ^ 0x8B)) != 0;
            }
        } else {
            bl = var2[10];
        }
        return bl;
    }

    public static WorldArea i(TileObject tileObject) {
        return new WorldArea(e.h(tileObject), 3, 9);
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static boolean q(TileObject tileObject) {
        boolean bl;
        TileObject var19;
        void var20;
        Player player = Players.getLocal();
        if player == null {
            return var2[10];
        }
        if ((var20.getWorldX() + var2[11] < var19.getWorldX())) {
            bl = 4;
            0;
            if (((43 + 4 - -49 + 54 ^ 94 + 18 - -33 + 20) & (2 ^ (0x2A ^ 0x1B) ^ -1)) != 0) {
                return ((117 + 184 - 180 + 117 ^ 20 + 86 - -63 + 2) & (126 + 152 - 191 + 111 ^ 38 + 33 - 52 + 112 ^ -1)) != 0;
            }
        } else {
            bl = var2[10];
        }
        return bl;
    }

    public static WorldPoint k(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(2).dy(1);
    }

    private static String var21(String var22, String var23) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var24 = new StringBuilder();
        char[] var25 = var23.toCharArray();
        int var26 = var2[10];
        char[] var27 = var22.toCharArray();
        int var28 = var27.length;
        int var29 = var2[10];
        while (var29 < var28) {
            char var30 = var27[var29];
            var24.append((char)(var30 ^ var25[var26 % var25.length]));
            0;
            ++var26;
            ++var29;
            0;
            if (1 <= 3) continue;
            return null;
        }
        return String.valueOf(var24);
    }

    public static WorldPoint g(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(0).dy(1);
    }
}

