/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.scurrius.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
        d.lIlIllIIllIlllI();
        d.lIlIllIIllIllIl();
        String[] stringArray = new String[lIIlIllIIlIIl[0]];
        stringArray[d.lIIlIllIIlIIl[1]] = lIIlIllIIIllI[lIIlIllIIlIIl[1]];
        stringArray[d.lIIlIllIIlIIl[2]] = lIIlIllIIIllI[lIIlIllIIlIIl[2]];
        stringArray[d.lIIlIllIIlIIl[3]] = lIIlIllIIIllI[lIIlIllIIlIIl[3]];
        stringArray[d.lIIlIllIIlIIl[4]] = lIIlIllIIIllI[lIIlIllIIlIIl[4]];
        stringArray[d.lIIlIllIIlIIl[5]] = lIIlIllIIIllI[lIIlIllIIlIIl[5]];
        stringArray[d.lIIlIllIIlIIl[6]] = lIIlIllIIIllI[lIIlIllIIlIIl[6]];
        stringArray[d.lIIlIllIIlIIl[7]] = lIIlIllIIIllI[lIIlIllIIlIIl[7]];
        stringArray[d.lIIlIllIIlIIl[8]] = lIIlIllIIIllI[lIIlIllIIlIIl[8]];
        stringArray[d.lIIlIllIIlIIl[9]] = lIIlIllIIIllI[lIIlIllIIlIIl[9]];
        stringArray[d.lIIlIllIIlIIl[10]] = lIIlIllIIIllI[lIIlIllIIlIIl[10]];
        stringArray[d.lIIlIllIIlIIl[11]] = lIIlIllIIIllI[lIIlIllIIlIIl[11]];
        stringArray[d.lIIlIllIIlIIl[12]] = lIIlIllIIIllI[lIIlIllIIlIIl[12]];
        stringArray[d.lIIlIllIIlIIl[13]] = lIIlIllIIIllI[lIIlIllIIlIIl[13]];
        v = List.of(stringArray);
        w = List.of(lIIlIllIIIllI[lIIlIllIIlIIl[0]], lIIlIllIIIllI[lIIlIllIIlIIl[14]], lIIlIllIIIllI[lIIlIllIIlIIl[15]], lIIlIllIIIllI[lIIlIllIIlIIl[16]]);
        x = List.of(lIIlIllIIIllI[lIIlIllIIlIIl[17]], lIIlIllIIIllI[lIIlIllIIlIIl[18]], lIIlIllIIIllI[lIIlIllIIlIIl[19]], lIIlIllIIIllI[lIIlIllIIlIIl[20]], lIIlIllIIIllI[lIIlIllIIlIIl[21]], lIIlIllIIIllI[lIIlIllIIlIIl[22]]);
        y = List.of(lIIlIllIIIllI[lIIlIllIIlIIl[23]], lIIlIllIIIllI[lIIlIllIIlIIl[24]]);
        z = List.of(lIIlIllIIIllI[lIIlIllIIlIIl[25]]);
        A = lIIlIllIIlIIl[26];
        B = lIIlIllIIlIIl[27];
        C = lIIlIllIIlIIl[28];
        D = lIIlIllIIlIIl[29];
        E = List.of(Integer.valueOf(C), Integer.valueOf(D));
        F = new WorldArea(new WorldPoint(lIIlIllIIlIIl[30], lIIlIllIIlIIl[31], lIIlIllIIlIIl[1]), new WorldPoint(lIIlIllIIlIIl[32], lIIlIllIIlIIl[33], lIIlIllIIlIIl[1]));
        G = lIIlIllIIlIIl[34];
        H = new WorldPoint(lIIlIllIIlIIl[35], lIIlIllIIlIIl[36], lIIlIllIIlIIl[1]);
    }

        return String.valueOf(var1);
    }

    private static void lIlIllIIllIllIl() {
        lIIlIllIIIllI = new String[lIIlIllIIlIIl[37]];
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[1]] = "Scurrius' spine";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[2]] = "Rune chainbody";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[3]] = "Rune battleaxe";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[4]] = "Rune full helm";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[5]] = "Rune med helm";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[6]] = "Rune sq shield";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[7]] = "Chaos rune";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[8]] = "Death rune";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[9]] = "Rune arrow";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[10]] = "Coins";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[11]] = "Prayer potion(4)";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[12]] = "Law rune";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[13]] = "Adamant platebody";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[0]] = "Trout";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[14]] = "Shark";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[15]] = "Tuna";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[16]] = "Lobster";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[17]] = "Rune chainbody";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[18]] = "Rune battleaxe";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[19]] = "Rune full helm";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[20]] = "Rune med helm";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[21]] = "Rune sq shield";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[22]] = "Adamant platebody";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[23]] = "Super strength(1)";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[24]] = "Ranging potion(1)";
        d.lIIlIllIIIllI[d.lIIlIllIIlIIl[25]] = "Vial";
    }

    private static boolean lIlIllIIllIllll(int n2, int n3) {
        return n2 < n3;
    }

}

