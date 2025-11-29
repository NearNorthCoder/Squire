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

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
        return new WorldArea(e.k(tileObject), lIlllIIIIlII[3], lIlllIIIIlII[4]);
    }

    public static WorldPoint o(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIlllIIIIlII[7]).dy(lIlllIIIIlII[1]);
    }

    public static WorldPoint h(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIlllIIIIlII[8]);
    }

    static {
        e.lllIlIlIlIlllI();
        e.lllIlIlIlIIIll();
        I = lIlllIIIIlII[12];
        J = lIlllIIIIlII[13];
        K = lIlllIIIIlII[14];
        L = lIlllIIIIlII[15];
        M = lIlllIIIIlII[16];
        N = lIlllIIIIlII[17];
        O = lIlllIIIIlII[18];
        P = lIlllIIIIlII[19];
        Q = lIlllIIIIlII[20];
        R = lIlllIIIIlII[21];
        String[] stringArray = new String[lIlllIIIIlII[22]];
        stringArray[e.lIlllIIIIlII[10]] = lIlllIIIIIIl[lIlllIIIIlII[10]];
        stringArray[e.lIlllIIIIlII[4]] = lIlllIIIIIIl[lIlllIIIIlII[4]];
        stringArray[e.lIlllIIIIlII[11]] = lIlllIIIIIIl[lIlllIIIIlII[11]];
        stringArray[e.lIlllIIIIlII[6]] = lIlllIIIIIIl[lIlllIIIIlII[6]];
        stringArray[e.lIlllIIIIlII[7]] = lIlllIIIIIIl[lIlllIIIIlII[7]];
        stringArray[e.lIlllIIIIlII[0]] = lIlllIIIIIIl[lIlllIIIIlII[0]];
        stringArray[e.lIlllIIIIlII[23]] = lIlllIIIIIIl[lIlllIIIIlII[23]];
        stringArray[e.lIlllIIIIlII[24]] = lIlllIIIIIIl[lIlllIIIIlII[24]];
        stringArray[e.lIlllIIIIlII[9]] = lIlllIIIIIIl[lIlllIIIIlII[9]];
        stringArray[e.lIlllIIIIlII[25]] = lIlllIIIIIIl[lIlllIIIIlII[25]];
        stringArray[e.lIlllIIIIlII[26]] = lIlllIIIIIIl[lIlllIIIIlII[26]];
        stringArray[e.lIlllIIIIlII[3]] = lIlllIIIIIIl[lIlllIIIIlII[3]];
        stringArray[e.lIlllIIIIlII[27]] = lIlllIIIIIIl[lIlllIIIIlII[27]];
        stringArray[e.lIlllIIIIlII[28]] = lIlllIIIIIIl[lIlllIIIIlII[28]];
        stringArray[e.lIlllIIIIlII[29]] = lIlllIIIIIIl[lIlllIIIIlII[29]];
        stringArray[e.lIlllIIIIlII[30]] = lIlllIIIIIIl[lIlllIIIIlII[30]];
        stringArray[e.lIlllIIIIlII[31]] = lIlllIIIIIIl[lIlllIIIIlII[31]];
        stringArray[e.lIlllIIIIlII[32]] = lIlllIIIIIIl[lIlllIIIIlII[32]];
        stringArray[e.lIlllIIIIlII[1]] = lIlllIIIIIIl[lIlllIIIIlII[1]];
        stringArray[e.lIlllIIIIlII[33]] = lIlllIIIIIIl[lIlllIIIIlII[33]];
        stringArray[e.lIlllIIIIlII[34]] = lIlllIIIIIIl[lIlllIIIIlII[34]];
        stringArray[e.lIlllIIIIlII[35]] = lIlllIIIIIIl[lIlllIIIIlII[35]];
        stringArray[e.lIlllIIIIlII[36]] = lIlllIIIIIIl[lIlllIIIIlII[36]];
        stringArray[e.lIlllIIIIlII[37]] = lIlllIIIIIIl[lIlllIIIIlII[37]];
        stringArray[e.lIlllIIIIlII[38]] = lIlllIIIIIIl[lIlllIIIIlII[38]];
        stringArray[e.lIlllIIIIlII[39]] = lIlllIIIIIIl[lIlllIIIIlII[39]];
        stringArray[e.lIlllIIIIlII[40]] = lIlllIIIIIIl[lIlllIIIIlII[40]];
        stringArray[e.lIlllIIIIlII[41]] = lIlllIIIIIIl[lIlllIIIIlII[41]];
        stringArray[e.lIlllIIIIlII[42]] = lIlllIIIIIIl[lIlllIIIIlII[42]];
        stringArray[e.lIlllIIIIlII[43]] = lIlllIIIIIIl[lIlllIIIIlII[43]];
        stringArray[e.lIlllIIIIlII[44]] = lIlllIIIIIIl[lIlllIIIIlII[44]];
        stringArray[e.lIlllIIIIlII[45]] = lIlllIIIIIIl[lIlllIIIIlII[45]];
        S = List.of(stringArray);
        T = List.of(lIlllIIIIIIl[lIlllIIIIlII[22]], lIlllIIIIIIl[lIlllIIIIlII[46]]);
        U = List.of(lIlllIIIIIIl[lIlllIIIIlII[47]], lIlllIIIIIIl[lIlllIIIIlII[48]], lIlllIIIIIIl[lIlllIIIIlII[49]], lIlllIIIIIIl[lIlllIIIIlII[50]], lIlllIIIIIIl[lIlllIIIIlII[51]], lIlllIIIIIIl[lIlllIIIIlII[52]]);
    }

    public static WorldPoint m(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIlllIIIIlII[5]).dy(lIlllIIIIlII[1]);
    }

    private static boolean lllIlIlIllIIII(int n2, int n3) {
        return n2 < n3;
    }

    public static WorldPoint n(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIlllIIIIlII[6]).dy(lIlllIIIIlII[1]);
    }

    private static void lllIlIlIlIIIll() {
        lIlllIIIIIIl = new String[lIlllIIIIlII[53]];
        e.lIlllIIIIIIl[e.lIlllIIIIlII[10]] = "Chromium ingot";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[4]] = "Magus vestige";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[11]] = "Eye of the duke";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[6]] = "Virtus mask";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[7]] = "Virtus robe top";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[0]] = "Virtus robe bottom";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[23]] = "Ice quartz";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[24]] = "Mithril chainbody";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[9]] = "Adamant chainbody";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[25]] = "Dragon platelegs";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[26]] = "Coal";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[3]] = "Adamantite ore";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[27]] = "Rune javelin heads";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[28]] = "Dragon javelin heads";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[29]] = "Uncut ruby";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[30]] = "Uncut diamond";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[31]] = "Runite ore";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[32]] = "Dragon arrowtips";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[1]] = "Pure essence";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[33]] = "Iron ore";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[34]] = "Mithril ore";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[35]] = "Sapphire";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[36]] = "Emerald";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[37]] = "Ruby";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[38]] = "Bronze bar";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[39]] = "Raw sea turtle";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[40]] = "Chaos rune";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[41]] = "Mist rune";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[42]] = "Soul rune";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[43]] = "Air rune";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[44]] = "Awakener's orb";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[45]] = "Frozen tablet";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[22]] = "Super combat potion(2)";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[46]] = "Prayer potion(3)";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[47]] = "Musca powder";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[48]] = "Musca musrhoom";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[49]] = "Arder powder";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[50]] = "Arder mushroom";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[51]] = "Salax salt";
        e.lIlllIIIIIIl[e.lIlllIIIIlII[52]] = "Arder-musca poison";
    }

    public static WorldPoint p(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIlllIIIIlII[6]).dy(lIlllIIIIlII[1]);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean r(TileObject tileObject) {
        boolean bl;
        TileObject var1;
        void var2;
        Player player = Players.getLocal();
        if (e.lllIlIlIlIllll(player)) {
            return lIlllIIIIlII[10];
        }
        if (e.lllIlIlIllIIIl(var2.getWorldX() - lIlllIIIIlII[11], var1.getWorldX())) {
            bl = lIlllIIIIlII[4];

            if (((0x48 ^ 0x10) & ~(0xCE ^ 0x96)) < 0) {
                return false;
            }
        } else {
            bl = lIlllIIIIlII[10];
        }
        return bl;
    }

    private static boolean lllIlIlIllIIIl(int n2, int n3) {
        return n2 > n3;
    }

    public static WorldArea i(TileObject tileObject) {
        return new WorldArea(e.h(tileObject), lIlllIIIIlII[3], lIlllIIIIlII[9]);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean q(TileObject tileObject) {
        boolean bl;
        TileObject var3;
        void var4;
        Player player = Players.getLocal();
        if (e.lllIlIlIlIllll(player)) {
            return lIlllIIIIlII[10];
        }
        if (e.lllIlIlIllIIII(var4.getWorldX() + lIlllIIIIlII[11], var3.getWorldX())) {
            bl = lIlllIIIIlII[4];

            if (((43 + 4 - -49 + 54 ^ 94 + 18 - -33 + 20) & (2 ^ (0x2A ^ 0x1B) ^ -1)) != 0) {
                return false;
            }
        } else {
            bl = lIlllIIIIlII[10];
        }
        return bl;
    }

    public static WorldPoint k(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIlllIIIIlII[2]).dy(lIlllIIIIlII[1]);
    }

    private static boolean lllIlIlIlIllll(Object object) {
        return object == null;
    }

        return String.valueOf(var5);
    }

    public static WorldPoint g(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIlllIIIIlII[0]).dy(lIlllIIIIlII[1]);
    }
}

