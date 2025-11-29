/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 */
package gg.squire.gauntlet.tasks;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import net.runelite.api.NPC;

public class EHelper {
    public static final  int ak;
    public static final  int ai;
    public static final  List<Integer> aA;
    public static final  List<Integer> aE;
    public static  List<Integer> aI;
    public static final  int[] O;
    public static final  int ap;
    public static final  int T;
    public static final  int am;
    public static  List<Integer> aG;
    public static final  int aq;
    public static final  List<Integer> aF;
    public static final  int[][] as;
    
    public static final  int Q;
    public static final  int an;
    public static final  int S;
    public static final  int af;
    public static final  int P;
    public static final  List<Integer> aa;
    public static final  List<Integer> az;
    public static final  List<Integer> aB;
    public static final  int aj;
    public static  List<Integer> aH;
    public static final  int ao;
    public static final  List<Integer> Y;
    public static final  Predicate<NPC> au;
    public static final  List<Integer> X;
    public static final  List<Integer> ax;
    
    public static final  int ae;
    public static final  List<Integer> W;
    public static final  int ah;
    public static final  List<Integer> ay;
    public static final  int ag;
    public static final  int ad;
    public static final  List<String> aw;
    public static final  int[] U;
    public static final  int R;
    public static final  int[] V;
    public static final  int aC;
    public static final  List<Integer> ab;
    public static final  int al;
    public static final  int ar;
    public static final  List<Integer> aD;
    public static final  int[] av;
    public static final  Predicate<NPC> at;
    public static final  List<Integer> Z;
    public static final  List<Integer> ac;

    static {
        e.var3();
        e.var4();
        ad = 6;
        ap = 7;
        ag = 8;
        aC = 9;
        al = 0;
        S = var2[10];
        ai = var2[11];
        ar = var2[12];
        Q = var2[13];
        am = var2[14];
        ak = 5;
        af = 4;
        an = var2[15];
        ae = var2[16];
        ah = var2[17];
        P = var2[18];
        aj = var2[19];
        aq = 1;
        ao = var2[20];
        R = var2[21];
        T = var2[22];
        int[] nArray = new int[var2[23]];
        nArray[3] = var2[24];
        nArray[2] = var2[25];
        O = nArray;
        int[] nArray2 = new int[var2[26]];
        nArray2[3] = var2[27];
        nArray2[2] = var2[28];
        nArray2[e.var2[23]] = var2[29];
        nArray2[e.var2[30]] = var2[31];
        U = nArray2;
        int[] nArray3 = new int[var2[23]];
        nArray3[3] = var2[32];
        nArray3[2] = var2[33];
        V = nArray3;
        W = List.of(Integer.valueOf(var2[32]), Integer.valueOf(var2[33]));
        X = List.of(Integer.valueOf(var2[34]), Integer.valueOf(var2[35]));
        Y = Collections.singletonList(var2[36]);
        Z = Collections.singletonList(var2[37]);
        aa = List.of(Integer.valueOf(var2[38]), Integer.valueOf(var2[39]), Integer.valueOf(var2[40]), Integer.valueOf(var2[41]));
        ab = List.of(Integer.valueOf(var2[42]), Integer.valueOf(var2[43]));
        ac = List.of(Integer.valueOf(var2[44]), Integer.valueOf(var2[45]));
        int[][] nArrayArray = new int[var2[23]][];
        int[] nArray4 = new int[var2[46]];
        nArray4[3] = var2[17];
        nArray4[2] = 4;
        nArray4[e.var2[23]] = 8;
        nArray4[e.var2[30]] = 0;
        nArray4[e.var2[26]] = var2[14];
        nArray4[e.var2[47]] = var2[15];
        nArrayArray[3] = nArray4;
        int[] nArray5 = new int[var2[46]];
        nArray5[3] = var2[19];
        nArray5[2] = 5;
        nArray5[e.var2[23]] = var2[11];
        nArray5[e.var2[30]] = var2[20];
        nArray5[e.var2[26]] = 7;
        nArray5[e.var2[47]] = 1;
        nArrayArray[2] = nArray5;
        as = nArrayArray;
        at = nPC -> {
            int n2;
            if ((nPC.getId() >= 4) && (nPC.getId() <= 5)) {
                n2 = 2;
                0;
                if null != null {
                    return ((0x24 ^ 0x6E) & ~(0x1B ^ 0x51)) != 0;
                }
            } else {
                n2 = 3;
            }
            return n2 != 0;
        };
        au = nPC -> {
            int n2;
            if ((nPC.getId() >= 0) && (nPC.getId() <= 1)) {
                n2 = 2;
                0;
                if (((0x8D ^ 0xAC ^ (0x42 ^ 0x25)) & (36 + 218 - 16 + 10 ^ 142 + 61 - 13 + 0 ^ -1)) == (145 + 123 - 236 + 140 ^ 145 + 2 - 114 + 135)) {
                    return (1 & (1 ^ -1)) != 0;
                }
            } else {
                n2 = 3;
            }
            return n2 != 0;
        };
        int[] nArray6 = new int[var2[23]];
        nArray6[3] = var2[48];
        nArray6[2] = var2[49];
        av = nArray6;
        aw = List.of(var1[3], var1[2]);
        ax = List.of(Integer.valueOf(var2[50]), Integer.valueOf(var2[51]));
        ay = List.of(Integer.valueOf(var2[52]), Integer.valueOf(var2[53]));
        az = List.of(Integer.valueOf(var2[54]));
        aA = List.of(Integer.valueOf(var2[55]));
        aB = List.of(Integer.valueOf(var2[56]), Integer.valueOf(var2[57]), Integer.valueOf(var2[58]), Integer.valueOf(var2[59]), Integer.valueOf(var2[60]), Integer.valueOf(var2[61]));
        aD = List.of(Integer.valueOf(var2[62]), Integer.valueOf(var2[63]), Integer.valueOf(var2[64]));
        aE = List.of(Integer.valueOf(var2[65]), Integer.valueOf(var2[66]));
        aF = List.of(Integer.valueOf(var2[24]), Integer.valueOf(var2[25]));
        aG = List.of(Integer.valueOf(var2[67]), Integer.valueOf(var2[68]));
        aH = List.of(Integer.valueOf(var2[69]));
        aI = List.of(Integer.valueOf(var2[38]), Integer.valueOf(var2[39]), Integer.valueOf(var2[40]), Integer.valueOf(var2[41]));
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = 3;
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = 3;
        while (var13 < var12) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }
}

