/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.widgets.Widgets;

public class aG {
    private  aH[] pG;
    private final  int pC = 0;
    @Inject
     Client t;
    private final  int pE = 2;
    private final  int pD = 1;
    private final  int pF = 5;
    
    private  boolean pH;

    private static boolean var2(Object object) {
        return object != null;
    }

    static {
        aG.var3();
    }

    /*
     * WARNING - void declaration
     */
    private aH[][] a(aH[][] aHArray) {
        aH[][] aHArray2 = new aH[var1[3]][];
        int var4 = var1[0];
        while (aG.var5(var4, var1[3])) {
            void var6;
            var7[var4] = new aH[((void)var6[var4]).length];
            int var8 = var1[0];
            while (aG.var5(var8, ((void)var6[var4]).length)) {
                aH var9 = new aH(var1[3]);
                int var10 = var1[0];
                while (aG.var5(var10, var1[3])) {
                    var9.pI[var10] = var6[var4][var8].pI[var10];
                    ++var10;
                    0;
                    if (-2 <= 0) continue;
                    return null;
                }
                var7[var4][var8] = var9;
                ++var8;
                0;
                if ((115 + 31 - 45 + 38 ^ 133 + 27 - 114 + 97) >= (26 + 70 - 54 + 102 ^ 143 + 3 - 52 + 54)) continue;
                return null;
            }
            ++var4;
            0;
            if null == null continue;
            return null;
        }
        return aHArray2;
    }

    private aI a(int[] nArray, int[] nArray2) {
        return new aI(this.d(nArray), this.d(nArray2), this.gW(), var1[10]);
    }

    public void gV() {
        Widget widget = Widgets.get((int)var1[4], (int)var1[10]);
        Widget widget2 = Widgets.get((int)var1[4], (int)var1[11]);
        if (aG.var2(widget) && aG.var2(widget2) && aG.var11(this.pH)) {
            this.pH = var1[1];
            this.pG = this.gT();
        }
    }

    /*
     * WARNING - void declaration
     */
    private aH[] a(aH[] aHArray) {
        aH[] aHArray2 = this.gW();
        int var12 = var1[0];
        while (aG.var5(var12, var1[3])) {
            int var13 = var1[0];
            while (aG.var5(var13, var1[3])) {
                void var14;
                var15[var12].pI[var13] = var14[var12].pI[var13];
                ++var13;
                0;
                if (2 > 0) continue;
                return null;
            }
            ++var12;
            0;
            if ((0x35 ^ 0x29 ^ (0x7F ^ 0x67)) >= 0) continue;
            return null;
        }
        return aHArray2;
    }

    public aG() {
        this.pC = var1[0];
        this.pD = var1[1];
        this.pE = var1[2];
        this.pF = var1[3];
        this.pG = null;
        this.pH = var1[0];
    }

    private aI b(aI aI2) {
        return new aI(this.a(aI2.pJ), this.a(aI2.pK), this.a(aI2.pL), aI2.pM);
    }

    /*
     * WARNING - void declaration
     */
    public List<Widget> gU() {
        Widget widget = Widgets.get((int)var1[4], (int)var1[7]);
        ArrayList<Widget> arrayList = new ArrayList<Widget>();
        if (aG.var2(this.pG) && aG.var2(widget)) {
            aG var16;
            int var17 = var1[0];
            while (aG.var5(var17, var16.pG.length)) {
                int var18 = var1[0];
                while (aG.var5(var18, var16.pG[var17].pI.length)) {
                    if (aG.var19(var16.pG[var17].pI[var18], var1[2])) {
                        void var20;
                        void var21;
                        Widget var22 = var21.getChild(var17 * var1[3] + var18);
                        var20.add(var22);
                        0;
                    }
                    ++var18;
                    0;
                    if (((174 + 55 - 124 + 72 ^ 60 + 91 - 78 + 99) & (0x48 ^ 0x11 ^ (0xDE ^ 0x9A) ^ -1)) == 0) continue;
                    return null;
                }
                ++var17;
                0;
                if (((0xB ^ 0x7C ^ (5 ^ 0x48)) & (0x10 ^ 0x74 ^ (0x22 ^ 0x7C) ^ -1)) <= 0) continue;
                return null;
            }
        }
        return arrayList;
    }

    private static boolean var23(int n2) {
        return n2 > 0;
    }

    private static boolean var24(Object object) {
        return object == null;
    }

    private HashMap<Integer, aH[]> gX() {
        HashMap<Integer, aH[]> hashMap = new HashMap<Integer, aH[]>();
        aH[] aHArray = new aH[var1[1]];
        int[] nArray = new int[var1[3]];
        nArray[aG.var1[0]] = var1[1];
        nArray[aG.var1[1]] = var1[1];
        nArray[aG.var1[2]] = var1[1];
        nArray[aG.var1[12]] = var1[1];
        nArray[aG.var1[13]] = var1[1];
        aHArray[aG.var1[0]] = new aH(nArray);
        hashMap.put(var1[0], this.c(aHArray));
        0;
        aH[] aHArray2 = new aH[var1[1]];
        int[] nArray2 = new int[var1[3]];
        nArray2[aG.var1[0]] = var1[2];
        nArray2[aG.var1[1]] = var1[1];
        nArray2[aG.var1[2]] = var1[1];
        nArray2[aG.var1[12]] = var1[1];
        nArray2[aG.var1[13]] = var1[1];
        aHArray2[aG.var1[0]] = new aH(nArray2);
        hashMap.put(var1[1], this.c(aHArray2));
        0;
        aH[] aHArray3 = new aH[var1[1]];
        int[] nArray3 = new int[var1[3]];
        nArray3[aG.var1[0]] = var1[1];
        nArray3[aG.var1[1]] = var1[2];
        nArray3[aG.var1[2]] = var1[1];
        nArray3[aG.var1[12]] = var1[1];
        nArray3[aG.var1[13]] = var1[1];
        aHArray3[aG.var1[0]] = new aH(nArray3);
        hashMap.put(var1[2], this.c(aHArray3));
        0;
        aH[] aHArray4 = new aH[var1[2]];
        int[] nArray4 = new int[var1[3]];
        nArray4[aG.var1[0]] = var1[2];
        nArray4[aG.var1[1]] = var1[2];
        nArray4[aG.var1[2]] = var1[1];
        nArray4[aG.var1[12]] = var1[1];
        nArray4[aG.var1[13]] = var1[1];
        aHArray4[aG.var1[0]] = new aH(nArray4);
        int[] nArray5 = new int[var1[3]];
        nArray5[aG.var1[0]] = var1[1];
        nArray5[aG.var1[1]] = var1[1];
        nArray5[aG.var1[2]] = var1[2];
        nArray5[aG.var1[12]] = var1[1];
        nArray5[aG.var1[13]] = var1[1];
        aHArray4[aG.var1[1]] = new aH(nArray5);
        hashMap.put(var1[12], this.c(aHArray4));
        0;
        aH[] aHArray5 = new aH[var1[2]];
        int[] nArray6 = new int[var1[3]];
        nArray6[aG.var1[0]] = var1[2];
        nArray6[aG.var1[1]] = var1[1];
        nArray6[aG.var1[2]] = var1[2];
        nArray6[aG.var1[12]] = var1[1];
        nArray6[aG.var1[13]] = var1[1];
        aHArray5[aG.var1[0]] = new aH(nArray6);
        int[] nArray7 = new int[var1[3]];
        nArray7[aG.var1[0]] = var1[1];
        nArray7[aG.var1[1]] = var1[1];
        nArray7[aG.var1[2]] = var1[1];
        nArray7[aG.var1[12]] = var1[2];
        nArray7[aG.var1[13]] = var1[1];
        aHArray5[aG.var1[1]] = new aH(nArray7);
        hashMap.put(var1[13], this.c(aHArray5));
        0;
        aH[] aHArray6 = new aH[var1[12]];
        int[] nArray8 = new int[var1[3]];
        nArray8[aG.var1[0]] = var1[1];
        nArray8[aG.var1[1]] = var1[2];
        nArray8[aG.var1[2]] = var1[2];
        nArray8[aG.var1[12]] = var1[1];
        nArray8[aG.var1[13]] = var1[1];
        aHArray6[aG.var1[0]] = new aH(nArray8);
        int[] nArray9 = new int[var1[3]];
        nArray9[aG.var1[0]] = var1[2];
        nArray9[aG.var1[1]] = var1[1];
        nArray9[aG.var1[2]] = var1[1];
        nArray9[aG.var1[12]] = var1[2];
        nArray9[aG.var1[13]] = var1[1];
        aHArray6[aG.var1[1]] = new aH(nArray9);
        int[] nArray10 = new int[var1[3]];
        nArray10[aG.var1[0]] = var1[1];
        nArray10[aG.var1[1]] = var1[1];
        nArray10[aG.var1[2]] = var1[1];
        nArray10[aG.var1[12]] = var1[1];
        nArray10[aG.var1[13]] = var1[2];
        aHArray6[aG.var1[2]] = new aH(nArray10);
        hashMap.put(var1[3], this.c(aHArray6));
        0;
        aH[] aHArray7 = new aH[var1[12]];
        int[] nArray11 = new int[var1[3]];
        nArray11[aG.var1[0]] = var1[2];
        nArray11[aG.var1[1]] = var1[2];
        nArray11[aG.var1[2]] = var1[2];
        nArray11[aG.var1[12]] = var1[1];
        nArray11[aG.var1[13]] = var1[1];
        aHArray7[aG.var1[0]] = new aH(nArray11);
        int[] nArray12 = new int[var1[3]];
        nArray12[aG.var1[0]] = var1[1];
        nArray12[aG.var1[1]] = var1[2];
        nArray12[aG.var1[2]] = var1[1];
        nArray12[aG.var1[12]] = var1[2];
        nArray12[aG.var1[13]] = var1[1];
        aHArray7[aG.var1[1]] = new aH(nArray12);
        int[] nArray13 = new int[var1[3]];
        nArray13[aG.var1[0]] = var1[2];
        nArray13[aG.var1[1]] = var1[1];
        nArray13[aG.var1[2]] = var1[1];
        nArray13[aG.var1[12]] = var1[1];
        nArray13[aG.var1[13]] = var1[2];
        aHArray7[aG.var1[2]] = new aH(nArray13);
        hashMap.put(var1[14], this.c(aHArray7));
        0;
        aH[] aHArray8 = new aH[var1[12]];
        int[] nArray14 = new int[var1[3]];
        nArray14[aG.var1[0]] = var1[2];
        nArray14[aG.var1[1]] = var1[2];
        nArray14[aG.var1[2]] = var1[1];
        nArray14[aG.var1[12]] = var1[2];
        nArray14[aG.var1[13]] = var1[1];
        aHArray8[aG.var1[0]] = new aH(nArray14);
        int[] nArray15 = new int[var1[3]];
        nArray15[aG.var1[0]] = var1[1];
        nArray15[aG.var1[1]] = var1[1];
        nArray15[aG.var1[2]] = var1[2];
        nArray15[aG.var1[12]] = var1[2];
        nArray15[aG.var1[13]] = var1[1];
        aHArray8[aG.var1[1]] = new aH(nArray15);
        int[] nArray16 = new int[var1[3]];
        nArray16[aG.var1[0]] = var1[1];
        nArray16[aG.var1[1]] = var1[2];
        nArray16[aG.var1[2]] = var1[1];
        nArray16[aG.var1[12]] = var1[1];
        nArray16[aG.var1[13]] = var1[2];
        aHArray8[aG.var1[2]] = new aH(nArray16);
        hashMap.put(var1[15], this.c(aHArray8));
        0;
        aH[] aHArray9 = new aH[var1[12]];
        int[] nArray17 = new int[var1[3]];
        nArray17[aG.var1[0]] = var1[2];
        nArray17[aG.var1[1]] = var1[1];
        nArray17[aG.var1[2]] = var1[2];
        nArray17[aG.var1[12]] = var1[2];
        nArray17[aG.var1[13]] = var1[1];
        aHArray9[aG.var1[0]] = new aH(nArray17);
        int[] nArray18 = new int[var1[3]];
        nArray18[aG.var1[0]] = var1[2];
        nArray18[aG.var1[1]] = var1[2];
        nArray18[aG.var1[2]] = var1[1];
        nArray18[aG.var1[12]] = var1[1];
        nArray18[aG.var1[13]] = var1[2];
        aHArray9[aG.var1[1]] = new aH(nArray18);
        int[] nArray19 = new int[var1[3]];
        nArray19[aG.var1[0]] = var1[1];
        nArray19[aG.var1[1]] = var1[1];
        nArray19[aG.var1[2]] = var1[2];
        nArray19[aG.var1[12]] = var1[1];
        nArray19[aG.var1[13]] = var1[2];
        aHArray9[aG.var1[2]] = new aH(nArray19);
        hashMap.put(var1[16], this.c(aHArray9));
        0;
        aH[] aHArray10 = new aH[var1[12]];
        int[] nArray20 = new int[var1[3]];
        nArray20[aG.var1[0]] = var1[1];
        nArray20[aG.var1[1]] = var1[2];
        nArray20[aG.var1[2]] = var1[2];
        nArray20[aG.var1[12]] = var1[2];
        nArray20[aG.var1[13]] = var1[1];
        aHArray10[aG.var1[0]] = new aH(nArray20);
        int[] nArray21 = new int[var1[3]];
        nArray21[aG.var1[0]] = var1[2];
        nArray21[aG.var1[1]] = var1[1];
        nArray21[aG.var1[2]] = var1[2];
        nArray21[aG.var1[12]] = var1[1];
        nArray21[aG.var1[13]] = var1[2];
        aHArray10[aG.var1[1]] = new aH(nArray21);
        int[] nArray22 = new int[var1[3]];
        nArray22[aG.var1[0]] = var1[1];
        nArray22[aG.var1[1]] = var1[1];
        nArray22[aG.var1[2]] = var1[1];
        nArray22[aG.var1[12]] = var1[2];
        nArray22[aG.var1[13]] = var1[2];
        aHArray10[aG.var1[2]] = new aH(nArray22);
        hashMap.put(var1[17], this.c(aHArray10));
        0;
        aH[] aHArray11 = new aH[var1[12]];
        int[] nArray23 = new int[var1[3]];
        nArray23[aG.var1[0]] = var1[2];
        nArray23[aG.var1[1]] = var1[2];
        nArray23[aG.var1[2]] = var1[2];
        nArray23[aG.var1[12]] = var1[2];
        nArray23[aG.var1[13]] = var1[1];
        aHArray11[aG.var1[0]] = new aH(nArray23);
        int[] nArray24 = new int[var1[3]];
        nArray24[aG.var1[0]] = var1[1];
        nArray24[aG.var1[1]] = var1[2];
        nArray24[aG.var1[2]] = var1[2];
        nArray24[aG.var1[12]] = var1[1];
        nArray24[aG.var1[13]] = var1[2];
        aHArray11[aG.var1[1]] = new aH(nArray24);
        int[] nArray25 = new int[var1[3]];
        nArray25[aG.var1[0]] = var1[2];
        nArray25[aG.var1[1]] = var1[1];
        nArray25[aG.var1[2]] = var1[1];
        nArray25[aG.var1[12]] = var1[2];
        nArray25[aG.var1[13]] = var1[2];
        aHArray11[aG.var1[2]] = new aH(nArray25);
        hashMap.put(var1[18], this.c(aHArray11));
        0;
        aH[] aHArray12 = new aH[var1[2]];
        int[] nArray26 = new int[var1[3]];
        nArray26[aG.var1[0]] = var1[2];
        nArray26[aG.var1[1]] = var1[2];
        nArray26[aG.var1[2]] = var1[2];
        nArray26[aG.var1[12]] = var1[1];
        nArray26[aG.var1[13]] = var1[2];
        aHArray12[aG.var1[0]] = new aH(nArray26);
        int[] nArray27 = new int[var1[3]];
        nArray27[aG.var1[0]] = var1[1];
        nArray27[aG.var1[1]] = var1[2];
        nArray27[aG.var1[2]] = var1[1];
        nArray27[aG.var1[12]] = var1[2];
        nArray27[aG.var1[13]] = var1[2];
        aHArray12[aG.var1[1]] = new aH(nArray27);
        hashMap.put(var1[19], this.c(aHArray12));
        0;
        aH[] aHArray13 = new aH[var1[2]];
        int[] nArray28 = new int[var1[3]];
        nArray28[aG.var1[0]] = var1[2];
        nArray28[aG.var1[1]] = var1[2];
        nArray28[aG.var1[2]] = var1[1];
        nArray28[aG.var1[12]] = var1[2];
        nArray28[aG.var1[13]] = var1[2];
        aHArray13[aG.var1[0]] = new aH(nArray28);
        int[] nArray29 = new int[var1[3]];
        nArray29[aG.var1[0]] = var1[1];
        nArray29[aG.var1[1]] = var1[1];
        nArray29[aG.var1[2]] = var1[2];
        nArray29[aG.var1[12]] = var1[2];
        nArray29[aG.var1[13]] = var1[2];
        aHArray13[aG.var1[1]] = new aH(nArray29);
        hashMap.put(var1[20], this.c(aHArray13));
        0;
        aH[] aHArray14 = new aH[var1[1]];
        int[] nArray30 = new int[var1[3]];
        nArray30[aG.var1[0]] = var1[2];
        nArray30[aG.var1[1]] = var1[1];
        nArray30[aG.var1[2]] = var1[2];
        nArray30[aG.var1[12]] = var1[2];
        nArray30[aG.var1[13]] = var1[2];
        aHArray14[aG.var1[0]] = new aH(nArray30);
        hashMap.put(var1[21], this.c(aHArray14));
        0;
        aH[] aHArray15 = new aH[var1[1]];
        int[] nArray31 = new int[var1[3]];
        nArray31[aG.var1[0]] = var1[1];
        nArray31[aG.var1[1]] = var1[2];
        nArray31[aG.var1[2]] = var1[2];
        nArray31[aG.var1[12]] = var1[2];
        nArray31[aG.var1[13]] = var1[2];
        aHArray15[aG.var1[0]] = new aH(nArray31);
        hashMap.put(var1[22], this.c(aHArray15));
        0;
        aH[] aHArray16 = new aH[var1[1]];
        int[] nArray32 = new int[var1[3]];
        nArray32[aG.var1[0]] = var1[2];
        nArray32[aG.var1[1]] = var1[2];
        nArray32[aG.var1[2]] = var1[2];
        nArray32[aG.var1[12]] = var1[2];
        nArray32[aG.var1[13]] = var1[2];
        aHArray16[aG.var1[0]] = new aH(nArray32);
        hashMap.put(var1[23], this.c(aHArray16));
        0;
        return hashMap;
    }

    /*
     * WARNING - void declaration
     */
    private aH[][] d(int[] nArray) {
        HashMap<Integer, aH[]> hashMap = this.gX();
        aH[][] aHArray = new aH[var1[3]][var1[3]];
        int var25 = var1[0];
        while (aG.var5(var25, var1[3])) {
            void var26;
            void var27;
            var28[var25] = (aH[])var27.get((int)var26[var25]);
            ++var25;
            0;
            if null == null continue;
            return null;
        }
        return aHArray;
    }

    private static boolean var29(int n2) {
        return n2 != 0;
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    private aH[] c(aH ... aHArray) {
        return aHArray;
    }

    private static boolean var11(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private aH[] a(aH[] var30, int var31, int var32) {
        void var4_4;
        ArrayList<aH> var33 = new ArrayList<aH>();
        aH[] var34 = var30;
        int var35 = var34.length;
        int var36 = var1[0];
        while (aG.var5(var36, var35)) {
            aH var37 = var34[var36];
            if (aG.var19(var37.pI[var31], var32)) {
                var33.add(var37);
                0;
            }
            ++var36;
            0;
            if ((0x27 ^ 0x41 ^ (0xF6 ^ 0x94)) != 0) continue;
            return null;
        }
        return var4_4.toArray(new aH[var1[0]]);
    }

    /*
     * WARNING - void declaration
     */
    private aI a(aI aI2, int n2) {
        int n3 = var1[9];
        int n4 = var1[9];
        aI aI3 = this.b(aI2);
        int n5 = var1[0];
        int var38 = var1[0];
        while (aG.var5(var38, var1[3])) {
            int var39 = var1[0];
            while (aG.var5(var39, var1[3])) {
                void var40;
                int var41;
                if (aG.var11(var41) && aG.var11(var40.pL[var38].pI[var39])) {
                    int var42 = var38;
                    int var43 = var39;
                    var41 = var1[1];
                }
                ++var39;
                0;
                if (1 != 0) continue;
                return null;
            }
            ++var38;
            0;
            if (((0x1E ^ 0x4C) & ~(0xF ^ 0x5D)) < 3) continue;
            return null;
        }
        aI3.pL[n3].pI[n4] = n2;
        aI3.pM -= var1[1];
        aI3.pJ[n3] = this.a(aI3.pJ[n3], n4, n2);
        aI3.pK[n4] = this.a(aI3.pK[n4], n3, n2);
        return aI3;
    }

    private static void var3() {
        var1 = new int[24];
        aG.var1[0] = (85 + 143 - 84 + 16 ^ 186 + 9 - 180 + 178) & (127 + 150 - 71 + 47 ^ 122 + 38 - 21 + 17 ^ -1);
        aG.var1[1] = 1;
        aG.var1[2] = 2;
        aG.var1[3] = 0x78 ^ 4 ^ (0xF5 ^ 0x8C);
        aG.var1[4] = -(0xFFFFC76B & 0x7DF7) & (0xFFFFC7FB & Short.MAX_VALUE);
        aG.var1[5] = 0x23 ^ 0x30;
        aG.var1[6] = 80 + 108 - 141 + 93 ^ 96 + 96 - 184 + 142;
        aG.var1[7] = 65 + 114 - 91 + 61 ^ 128 + 159 - 266 + 160;
        aG.var1[8] = 0xAE ^ 0x8B ^ (0xAB ^ 0x9A);
        aG.var1[9] = -1;
        aG.var1[10] = 0xBA ^ 0xA3;
        aG.var1[11] = 0xF2 ^ 0xB8 ^ (0xE8 ^ 0xB0);
        aG.var1[12] = 3;
        aG.var1[13] = 0xC2 ^ 0xB1 ^ (0x4B ^ 0x3C);
        aG.var1[14] = 0x31 ^ 0x10 ^ (0x24 ^ 3);
        aG.var1[15] = 0x9C ^ 0x9B;
        aG.var1[16] = 0xB8 ^ 0xB0;
        aG.var1[17] = 0xA4 ^ 0xAD;
        aG.var1[18] = 0x17 ^ 0x6C ^ (0x76 ^ 7);
        aG.var1[19] = (0x60 ^ 0x2C) & ~(0x28 ^ 0x64) ^ (0xB2 ^ 0xB9);
        aG.var1[20] = 0x75 ^ 0x79;
        aG.var1[21] = 0xB5 ^ 0xB8;
        aG.var1[22] = 0x77 ^ 0x79;
        aG.var1[23] = 0x3E ^ 0x31;
    }

    /*
     * WARNING - void declaration
     */
    private aH[] a(aI aI2) {
        void var44;
        int n2 = var1[0];
        LinkedList<aI> linkedList = new LinkedList<aI>();
        linkedList.add(aI2);
        0;
        int var45 = var1[8];
        while (aG.var5((int)var44, var45)) {
            void var46;
            aG var47;
            aI var48 = var47.c((avar46.remove());
            if (aG.var24(var48) && aG.var29(var46.isEmpty() ? 1 : 0)) {
                return null;
            }
            if (aG.var2(var48) && aG.var11(var48.pM)) {
                return var48.pL;
            }
            if (aG.var2(var48)) {
                var46.add(var47.a(var48, var1[2]));
                0;
                var46.add(var47.a(var48, var1[1]));
                0;
            }
            ++var44;
            0;
            if (3 < (55 + 101 - 71 + 70 ^ 127 + 40 - 148 + 140)) continue;
            return null;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private aH[] gT() {
        void var2_2;
        int[] nArray = new int[var1[3]];
        int[] var49 = new int[var1[3]];
        try {
            int var50 = var1[0];
            while (aG.var5(var50, var1[3])) {
                var49[var50] = Integer.parseInt(Widgets.get((int)var1[4], (int)(var1[5] + var50)).getText());
                var51[var50] = Integer.parseInt(Widgets.get((int)var1[4], (int)(var1[6] + var50)).getText());
                ++var50;
                0;
                if (((215 + 189 - 225 + 71 ^ 32 + 46 - 42 + 117) & (67 + 85 - -34 + 6 ^ 13 + 43 - -6 + 101 ^ -1)) < 2) continue;
                return null;
            }
        }
        catch (NumberFormatException var50) {
            System.out.println("NumberFormatException: " + var50.getMessage());
        }
        0;
        if (2 != 2) {
            return null;
        }
        aI aI2 = this.a(nArray, (int[])var2_2);
        return this.a(aI2);
    }

    private static boolean var19(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private aI c(aI aI2) {
        void var52;
        int var53 = var1[1];
        while (aG.var29(var53) && aG.var23(var52.pM)) {
            int var54;
            aH var55;
            aG var56;
            var53 = var1[0];
            int var57 = var1[0];
            while (aG.var5(var57, var1[3])) {
                var55 = var56.b(var52.pJ[var57]);
                if (aG.var24(var55)) {
                    return null;
                }
                var54 = var1[0];
                while (aG.var5(var54, var1[3])) {
                    if (aG.var29(var55.pI[var54]) && aG.var11(var52.pL[var57].pI[var54])) {
                        var53 = var1[1];
                        var52.pM -= var1[1];
                        var52.pL[var57].pI[var54] = var55.pI[var54];
                        var52.pK[var54] = var56.a(var52.pK[var54], var57, var55.pI[var54]);
                    }
                    ++var54;
                    0;
                    if (3 >= ((0x29 ^ 0x13) & ~(0x6F ^ 0x55))) continue;
                    return null;
                }
                ++var57;
                0;
                if null == null continue;
                return null;
            }
            var57 = var1[0];
            while (aG.var5(var57, var1[3])) {
                var55 = var56.b(var52.pK[var57]);
                if (aG.var24(var55)) {
                    return null;
                }
                var54 = var1[0];
                while (aG.var5(var54, var1[3])) {
                    if (aG.var29(var55.pI[var54]) && aG.var11(var52.pL[var54].pI[var57])) {
                        var53 = var1[1];
                        var52.pM -= var1[1];
                        var52.pL[var54].pI[var57] = var55.pI[var54];
                        var52.pJ[var54] = var56.a(var52.pJ[var54], var57, var55.pI[var54]);
                    }
                    ++var54;
                    0;
                    if (1 == 1) continue;
                    return null;
                }
                ++var57;
                0;
                if (3 != ((0x73 ^ 0x30) & ~(0xF4 ^ 0xB7))) continue;
                return null;
            }
            0;
            if (3 > 0) continue;
            return null;
        }
        return aI2;
    }

    /*
     * WARNING - void declaration
     */
    private aH b(aH[] aHArray) {
        void var3_3;
        void var58;
        void var59;
        int n2 = aHArray.length;
        if (aG.var11(n2)) {
            return null;
        }
        if (aG.var19((int)var59, var1[1])) {
            return var58[var1[0]];
        }
        aH var60 = new aH(var1[3]);
        int var61 = var1[0];
        while (aG.var5(var61, var1[3])) {
            int var62 = var1[0];
            void var63 = var58;
            int var64 = ((void)var63).length;
            int var65 = var1[0];
            while (aG.var5(var65, var64)) {
                void var66 = var63[var65];
                if (aG.var19(var66.pI[var61], var1[2])) {
                    ++var62;
                }
                ++var65;
                0;
                if ((0x8C ^ 0x88) == (0x17 ^ 0x13)) continue;
                return null;
            }
            if (aG.var11(var62)) {
                var60.pI[var61] = var1[1];
                0;
                if (((0xD2 ^ 0x9C) & ~(0x59 ^ 0x17)) >= (0 ^ 4)) {
                    return null;
                }
            } else if (aG.var19(var62, (int)var59)) {
                var60.pI[var61] = var1[2];
                0;
                if (-(0x9C ^ 0x98) > 0) {
                    return null;
                }
            } else {
                var60.pI[var61] = var1[0];
            }
            ++var61;
            0;
            if null == null continue;
            return null;
        }
        return var3_3;
    }

    private aH[] gW() {
        aH[] aHArray = new aH[var1[3]];
        int var67 = var1[0];
        while (aG.var5(var67, var1[3])) {
            var68[var67] = new aH(var1[3]);
            ++var67;
            0;
            if ((0xC5 ^ 0xA8 ^ (0x2E ^ 0x47)) >= -1) continue;
            return null;
        }
        return aHArray;
    }
}

