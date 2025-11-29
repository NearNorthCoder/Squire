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
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AIHelper;

public class AGHelper {
    private  aH[] pG;
    private final  int pC = 0;
    @Inject
     Client t;
    private final  int pE = 2;
    private final  int pD = 1;
    private final  int pF = 5;
    
    private  boolean pH;

    private static boolean lIlIIlllIIlIl(Object object) {
        return object != null;
    }

    static {
        aG.lIlIIlllIIIll();
    }

    /*
     * WARNING - void declaration
     */
    private aH[][] a(aH[][] aHArray) {
        aH[][] aHArray2 = new aH[llIIIllIll[3]][];
        int var1 = llIIIllIll[0];
        while (aG.lIlIIlllIIlII(var1, llIIIllIll[3])) {
            void var2;
            var3[var1] = new aH[((void)var2[var1]).length];
            int var4 = llIIIllIll[0];
            while (aG.lIlIIlllIIlII(var4, ((void)var2[var1]).length)) {
                aH var5 = new AHHelper(llIIIllIll[3]);
                int var6 = llIIIllIll[0];
                while (aG.lIlIIlllIIlII(var6, llIIIllIll[3])) {
                    var5.pI[var6] = var2[var1][var4].pI[var6];
                    ++var6;

                    if (-2 <= 0) continue;
                    return null;
                }
                var3[var1][var4] = var5;
                ++var4;

                if ((115 + 31 - 45 + 38 ^ 133 + 27 - 114 + 97) >= (26 + 70 - 54 + 102 ^ 143 + 3 - 52 + 54)) continue;
                return null;
            }
            ++var1;

            return null;
        }
        return aHArray2;
    }

    private aI a(int[] nArray, int[] nArray2) {
        return new AIHelper(this.d(nArray), this.d(nArray2), this.gW(), llIIIllIll[10]);
    }

    public void gV() {
        Widget widget = Widgets.get((int)llIIIllIll[4], (int)llIIIllIll[10]);
        Widget widget2 = Widgets.get((int)llIIIllIll[4], (int)llIIIllIll[11]);
        if (aG.lIlIIlllIIlIl(widget) && aG.lIlIIlllIIlIl(widget2) && aG.lIlIIlllIlIIl(this.pH ? 1 : 0)) {
            this.pH = llIIIllIll[1];
            this.pG = this.gT();
        }
    }

    /*
     * WARNING - void declaration
     */
    private aH[] a(aH[] aHArray) {
        aH[] aHArray2 = this.gW();
        int var7 = llIIIllIll[0];
        while (aG.lIlIIlllIIlII(var7, llIIIllIll[3])) {
            int var8 = llIIIllIll[0];
            while (aG.lIlIIlllIIlII(var8, llIIIllIll[3])) {
                void var9;
                var10[var7].pI[var8] = var9[var7].pI[var8];
                ++var8;

                if (2 > 0) continue;
                return null;
            }
            ++var7;

            if ((0x35 ^ 0x29 ^ (0x7F ^ 0x67)) >= 0) continue;
            return null;
        }
        return aHArray2;
    }

    public AGHelper() {
        this.pC = llIIIllIll[0];
        this.pD = llIIIllIll[1];
        this.pE = llIIIllIll[2];
        this.pF = llIIIllIll[3];
        this.pG = null;
        this.pH = llIIIllIll[0];
    }

    private aI b(aI aI2) {
        return new AIHelper(this.a(aI2.pJ), this.a(aI2.pK), this.a(aI2.pL), aI2.pM);
    }

    /*
     * WARNING - void declaration
     */
    public List<Widget> gU() {
        Widget widget = Widgets.get((int)llIIIllIll[4], (int)llIIIllIll[7]);
        ArrayList<Widget> arrayList = new ArrayList<Widget>();
        if (aG.lIlIIlllIIlIl(this.pG) && aG.lIlIIlllIIlIl(widget)) {
            aG var11;
            int var12 = llIIIllIll[0];
            while (aG.lIlIIlllIIlII(var12, var11.pG.length)) {
                int var13 = llIIIllIll[0];
                while (aG.lIlIIlllIIlII(var13, var11.pG[var12].pI.length)) {
                    if (aG.lIlIIlllIIllI(var11.pG[var12].pI[var13], llIIIllIll[2])) {
                        void var14;
                        void var15;
                        Widget var16 = var15.getChild(var12 * llIIIllIll[3] + var13);
                        var14.add(var16);

                    }
                    ++var13;

                    if (((174 + 55 - 124 + 72 ^ 60 + 91 - 78 + 99) & (0x48 ^ 0x11 ^ (0xDE ^ 0x9A) ^ -1)) == 0) continue;
                    return null;
                }
                ++var12;

                if (((0xB ^ 0x7C ^ (5 ^ 0x48)) & (0x10 ^ 0x74 ^ (0x22 ^ 0x7C) ^ -1)) <= 0) continue;
                return null;
            }
        }
        return arrayList;
    }

    private static boolean lIlIIlllIlIlI(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIlllIIlll(Object object) {
        return object == null;
    }

    private HashMap<Integer, aH[]> gX() {
        HashMap<Integer, aH[]> hashMap = new HashMap<Integer, aH[]>();
        aH[] aHArray = new aH[llIIIllIll[1]];
        int[] nArray = new int[llIIIllIll[3]];
        nArray[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray[aG.llIIIllIll[0]] = new AHHelper(nArray);
        hashMap.put(llIIIllIll[0], this.c(aHArray));

        aH[] aHArray2 = new aH[llIIIllIll[1]];
        int[] nArray2 = new int[llIIIllIll[3]];
        nArray2[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray2[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray2[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray2[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray2[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray2[aG.llIIIllIll[0]] = new AHHelper(nArray2);
        hashMap.put(llIIIllIll[1], this.c(aHArray2));

        aH[] aHArray3 = new aH[llIIIllIll[1]];
        int[] nArray3 = new int[llIIIllIll[3]];
        nArray3[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray3[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray3[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray3[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray3[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray3[aG.llIIIllIll[0]] = new AHHelper(nArray3);
        hashMap.put(llIIIllIll[2], this.c(aHArray3));

        aH[] aHArray4 = new aH[llIIIllIll[2]];
        int[] nArray4 = new int[llIIIllIll[3]];
        nArray4[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray4[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray4[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray4[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray4[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray4[aG.llIIIllIll[0]] = new AHHelper(nArray4);
        int[] nArray5 = new int[llIIIllIll[3]];
        nArray5[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray5[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray5[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray5[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray5[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray4[aG.llIIIllIll[1]] = new AHHelper(nArray5);
        hashMap.put(llIIIllIll[12], this.c(aHArray4));

        aH[] aHArray5 = new aH[llIIIllIll[2]];
        int[] nArray6 = new int[llIIIllIll[3]];
        nArray6[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray6[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray6[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray6[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray6[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray5[aG.llIIIllIll[0]] = new AHHelper(nArray6);
        int[] nArray7 = new int[llIIIllIll[3]];
        nArray7[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray7[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray7[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray7[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray7[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray5[aG.llIIIllIll[1]] = new AHHelper(nArray7);
        hashMap.put(llIIIllIll[13], this.c(aHArray5));

        aH[] aHArray6 = new aH[llIIIllIll[12]];
        int[] nArray8 = new int[llIIIllIll[3]];
        nArray8[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray8[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray8[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray8[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray8[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray6[aG.llIIIllIll[0]] = new AHHelper(nArray8);
        int[] nArray9 = new int[llIIIllIll[3]];
        nArray9[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray9[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray9[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray9[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray9[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray6[aG.llIIIllIll[1]] = new AHHelper(nArray9);
        int[] nArray10 = new int[llIIIllIll[3]];
        nArray10[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray10[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray10[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray10[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray10[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray6[aG.llIIIllIll[2]] = new AHHelper(nArray10);
        hashMap.put(llIIIllIll[3], this.c(aHArray6));

        aH[] aHArray7 = new aH[llIIIllIll[12]];
        int[] nArray11 = new int[llIIIllIll[3]];
        nArray11[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray11[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray11[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray11[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray11[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray7[aG.llIIIllIll[0]] = new AHHelper(nArray11);
        int[] nArray12 = new int[llIIIllIll[3]];
        nArray12[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray12[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray12[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray12[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray12[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray7[aG.llIIIllIll[1]] = new AHHelper(nArray12);
        int[] nArray13 = new int[llIIIllIll[3]];
        nArray13[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray13[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray13[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray13[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray13[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray7[aG.llIIIllIll[2]] = new AHHelper(nArray13);
        hashMap.put(llIIIllIll[14], this.c(aHArray7));

        aH[] aHArray8 = new aH[llIIIllIll[12]];
        int[] nArray14 = new int[llIIIllIll[3]];
        nArray14[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray14[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray14[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray14[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray14[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray8[aG.llIIIllIll[0]] = new AHHelper(nArray14);
        int[] nArray15 = new int[llIIIllIll[3]];
        nArray15[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray15[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray15[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray15[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray15[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray8[aG.llIIIllIll[1]] = new AHHelper(nArray15);
        int[] nArray16 = new int[llIIIllIll[3]];
        nArray16[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray16[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray16[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray16[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray16[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray8[aG.llIIIllIll[2]] = new AHHelper(nArray16);
        hashMap.put(llIIIllIll[15], this.c(aHArray8));

        aH[] aHArray9 = new aH[llIIIllIll[12]];
        int[] nArray17 = new int[llIIIllIll[3]];
        nArray17[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray17[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray17[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray17[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray17[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray9[aG.llIIIllIll[0]] = new AHHelper(nArray17);
        int[] nArray18 = new int[llIIIllIll[3]];
        nArray18[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray18[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray18[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray18[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray18[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray9[aG.llIIIllIll[1]] = new AHHelper(nArray18);
        int[] nArray19 = new int[llIIIllIll[3]];
        nArray19[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray19[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray19[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray19[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray19[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray9[aG.llIIIllIll[2]] = new AHHelper(nArray19);
        hashMap.put(llIIIllIll[16], this.c(aHArray9));

        aH[] aHArray10 = new aH[llIIIllIll[12]];
        int[] nArray20 = new int[llIIIllIll[3]];
        nArray20[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray20[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray20[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray20[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray20[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray10[aG.llIIIllIll[0]] = new AHHelper(nArray20);
        int[] nArray21 = new int[llIIIllIll[3]];
        nArray21[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray21[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray21[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray21[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray21[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray10[aG.llIIIllIll[1]] = new AHHelper(nArray21);
        int[] nArray22 = new int[llIIIllIll[3]];
        nArray22[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray22[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray22[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray22[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray22[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray10[aG.llIIIllIll[2]] = new AHHelper(nArray22);
        hashMap.put(llIIIllIll[17], this.c(aHArray10));

        aH[] aHArray11 = new aH[llIIIllIll[12]];
        int[] nArray23 = new int[llIIIllIll[3]];
        nArray23[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray23[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray23[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray23[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray23[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray11[aG.llIIIllIll[0]] = new AHHelper(nArray23);
        int[] nArray24 = new int[llIIIllIll[3]];
        nArray24[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray24[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray24[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray24[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray24[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray11[aG.llIIIllIll[1]] = new AHHelper(nArray24);
        int[] nArray25 = new int[llIIIllIll[3]];
        nArray25[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray25[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray25[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray25[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray25[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray11[aG.llIIIllIll[2]] = new AHHelper(nArray25);
        hashMap.put(llIIIllIll[18], this.c(aHArray11));

        aH[] aHArray12 = new aH[llIIIllIll[2]];
        int[] nArray26 = new int[llIIIllIll[3]];
        nArray26[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray26[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray26[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray26[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray26[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray12[aG.llIIIllIll[0]] = new AHHelper(nArray26);
        int[] nArray27 = new int[llIIIllIll[3]];
        nArray27[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray27[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray27[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray27[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray27[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray12[aG.llIIIllIll[1]] = new AHHelper(nArray27);
        hashMap.put(llIIIllIll[19], this.c(aHArray12));

        aH[] aHArray13 = new aH[llIIIllIll[2]];
        int[] nArray28 = new int[llIIIllIll[3]];
        nArray28[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray28[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray28[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray28[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray28[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray13[aG.llIIIllIll[0]] = new AHHelper(nArray28);
        int[] nArray29 = new int[llIIIllIll[3]];
        nArray29[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray29[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray29[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray29[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray29[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray13[aG.llIIIllIll[1]] = new AHHelper(nArray29);
        hashMap.put(llIIIllIll[20], this.c(aHArray13));

        aH[] aHArray14 = new aH[llIIIllIll[1]];
        int[] nArray30 = new int[llIIIllIll[3]];
        nArray30[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray30[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray30[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray30[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray30[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray14[aG.llIIIllIll[0]] = new AHHelper(nArray30);
        hashMap.put(llIIIllIll[21], this.c(aHArray14));

        aH[] aHArray15 = new aH[llIIIllIll[1]];
        int[] nArray31 = new int[llIIIllIll[3]];
        nArray31[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray31[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray31[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray31[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray31[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray15[aG.llIIIllIll[0]] = new AHHelper(nArray31);
        hashMap.put(llIIIllIll[22], this.c(aHArray15));

        aH[] aHArray16 = new aH[llIIIllIll[1]];
        int[] nArray32 = new int[llIIIllIll[3]];
        nArray32[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray32[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray32[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray32[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray32[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray16[aG.llIIIllIll[0]] = new AHHelper(nArray32);
        hashMap.put(llIIIllIll[23], this.c(aHArray16));

        return hashMap;
    }

    /*
     * WARNING - void declaration
     */
    private aH[][] d(int[] nArray) {
        HashMap<Integer, aH[]> hashMap = this.gX();
        aH[][] aHArray = new aH[llIIIllIll[3]][llIIIllIll[3]];
        int var17 = llIIIllIll[0];
        while (aG.lIlIIlllIIlII(var17, llIIIllIll[3])) {
            void var18;
            void var19;
            var20[var17] = (aH[])var19.get((int)var18[var17]);
            ++var17;

            return null;
        }
        return aHArray;
    }

    private static boolean lIlIIlllIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIlllIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private aH[] c(aH ... aHArray) {
        return aHArray;
    }

    private static boolean lIlIIlllIlIIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private aH[] a(aH[] var21, int var22, int var23) {
        void var4_4;
        ArrayList<aH> var24 = new ArrayList<aH>();
        aH[] var25 = var21;
        int var26 = var25.length;
        int var27 = llIIIllIll[0];
        while (aG.lIlIIlllIIlII(var27, var26)) {
            aH var28 = var25[var27];
            if (aG.lIlIIlllIIllI(var28.pI[var22], var23)) {
                var24.add(var28);

            }
            ++var27;

            if ((0x27 ^ 0x41 ^ (0xF6 ^ 0x94)) != 0) continue;
            return null;
        }
        return var4_4.toArray(new aH[llIIIllIll[0]]);
    }

    /*
     * WARNING - void declaration
     */
    private aI a(aI aI2, int n2) {
        int n3 = llIIIllIll[9];
        int n4 = llIIIllIll[9];
        aI aI3 = this.b(aI2);
        int n5 = llIIIllIll[0];
        int var29 = llIIIllIll[0];
        while (aG.lIlIIlllIIlII(var29, llIIIllIll[3])) {
            int var30 = llIIIllIll[0];
            while (aG.lIlIIlllIIlII(var30, llIIIllIll[3])) {
                void var31;
                int var32;
                if (aG.lIlIIlllIlIIl(var32) && aG.lIlIIlllIlIIl(var31.pL[var29].pI[var30])) {
                    int var33 = var29;
                    int var34 = var30;
                    var32 = llIIIllIll[1];
                }
                ++var30;

                if (1 != 0) continue;
                return null;
            }
            ++var29;

            if (((0x1E ^ 0x4C) & ~(0xF ^ 0x5D)) < 3) continue;
            return null;
        }
        aI3.pL[n3].pI[n4] = n2;
        aI3.pM -= llIIIllIll[1];
        aI3.pJ[n3] = this.a(aI3.pJ[n3], n4, n2);
        aI3.pK[n4] = this.a(aI3.pK[n4], n3, n2);
        return aI3;
    }

    /*
     * WARNING - void declaration
     */
    private aH[] a(aI aI2) {
        void var35;
        int n2 = llIIIllIll[0];
        LinkedList<aI> linkedList = new LinkedList<aI>();
        linkedList.add(aI2);

        int var36 = llIIIllIll[8];
        while (aG.lIlIIlllIIlII((int)var35, var36)) {
            void var37;
            aG var38;
            aI var39 = var38.c((AIHelper) ar37.remove());
            if (aG.lIlIIlllIIlll(var39) && aG.lIlIIlllIlIII(var37.isEmpty() ? 1 : 0)) {
                return null;
            }
            if (aG.lIlIIlllIIlIl(var39) && aG.lIlIIlllIlIIl(var39.pM)) {
                return var39.pL;
            }
            if (aG.lIlIIlllIIlIl(var39)) {
                var37.add(var38.a(var39, llIIIllIll[2]));

                var37.add(var38.a(var39, llIIIllIll[1]));

            }
            ++var35;

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
        int[] nArray = new int[llIIIllIll[3]];
        int[] var40 = new int[llIIIllIll[3]];
        try {
            int var41 = llIIIllIll[0];
            while (aG.lIlIIlllIIlII(var41, llIIIllIll[3])) {
                var40[var41] = Integer.parseInt(Widgets.get((int)llIIIllIll[4], (int)(llIIIllIll[5] + var41)).getText());
                var42[var41] = Integer.parseInt(Widgets.get((int)llIIIllIll[4], (int)(llIIIllIll[6] + var41)).getText());
                ++var41;

                if (((215 + 189 - 225 + 71 ^ 32 + 46 - 42 + 117) & (67 + 85 - -34 + 6 ^ 13 + 43 - -6 + 101 ^ -1)) < 2) continue;
                return null;
            }
        }
        catch (NumberFormatException var41) {
            System.out.println("NumberFormatException: " + var41.getMessage());
        }

        if (2 != 2) {
            return null;
        }
        aI aI2 = this.a(nArray, (int[])var2_2);
        return this.a(aI2);
    }

    private static boolean lIlIIlllIIllI(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private aI c(aI aI2) {
        void var43;
        int var44 = llIIIllIll[1];
        while (aG.lIlIIlllIlIII(var44) && aG.lIlIIlllIlIlI(var43.pM)) {
            int var45;
            aH var46;
            aG var47;
            var44 = llIIIllIll[0];
            int var48 = llIIIllIll[0];
            while (aG.lIlIIlllIIlII(var48, llIIIllIll[3])) {
                var46 = var47.b(var43.pJ[var48]);
                if (aG.lIlIIlllIIlll(var46)) {
                    return null;
                }
                var45 = llIIIllIll[0];
                while (aG.lIlIIlllIIlII(var45, llIIIllIll[3])) {
                    if (aG.lIlIIlllIlIII(var46.pI[var45]) && aG.lIlIIlllIlIIl(var43.pL[var48].pI[var45])) {
                        var44 = llIIIllIll[1];
                        var43.pM -= llIIIllIll[1];
                        var43.pL[var48].pI[var45] = var46.pI[var45];
                        var43.pK[var45] = var47.a(var43.pK[var45], var48, var46.pI[var45]);
                    }
                    ++var45;

                    if (3 >= ((0x29 ^ 0x13) & ~(0x6F ^ 0x55))) continue;
                    return null;
                }
                ++var48;

                return null;
            }
            var48 = llIIIllIll[0];
            while (aG.lIlIIlllIIlII(var48, llIIIllIll[3])) {
                var46 = var47.b(var43.pK[var48]);
                if (aG.lIlIIlllIIlll(var46)) {
                    return null;
                }
                var45 = llIIIllIll[0];
                while (aG.lIlIIlllIIlII(var45, llIIIllIll[3])) {
                    if (aG.lIlIIlllIlIII(var46.pI[var45]) && aG.lIlIIlllIlIIl(var43.pL[var45].pI[var48])) {
                        var44 = llIIIllIll[1];
                        var43.pM -= llIIIllIll[1];
                        var43.pL[var45].pI[var48] = var46.pI[var45];
                        var43.pJ[var45] = var47.a(var43.pJ[var45], var48, var46.pI[var45]);
                    }
                    ++var45;

                    if (1 == 1) continue;
                    return null;
                }
                ++var48;

                if (3 != ((0x73 ^ 0x30) & ~(0xF4 ^ 0xB7))) continue;
                return null;
            }

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
        void var49;
        void var50;
        int n2 = aHArray.length;
        if (aG.lIlIIlllIlIIl(n2)) {
            return null;
        }
        if (aG.lIlIIlllIIllI((int)var50, llIIIllIll[1])) {
            return var49[llIIIllIll[0]];
        }
        aH var51 = new AHHelper(llIIIllIll[3]);
        int var52 = llIIIllIll[0];
        while (aG.lIlIIlllIIlII(var52, llIIIllIll[3])) {
            int var53 = llIIIllIll[0];
            void var54 = var49;
            int var55 = ((void)var54).length;
            int var56 = llIIIllIll[0];
            while (aG.lIlIIlllIIlII(var56, var55)) {
                void var57 = var54[var56];
                if (aG.lIlIIlllIIllI(var57.pI[var52], llIIIllIll[2])) {
                    ++var53;
                }
                ++var56;

                if ((0x8C ^ 0x88) == (0x17 ^ 0x13)) continue;
                return null;
            }
            if (aG.lIlIIlllIlIIl(var53)) {
                var51.pI[var52] = llIIIllIll[1];

                if (((0xD2 ^ 0x9C) & ~(0x59 ^ 0x17)) >= (0 ^ 4)) {
                    return null;
                }
            } else if (aG.lIlIIlllIIllI(var53, (int)var50)) {
                var51.pI[var52] = llIIIllIll[2];

                if (-(0x9C ^ 0x98) > 0) {
                    return null;
                }
            } else {
                var51.pI[var52] = llIIIllIll[0];
            }
            ++var52;

            return null;
        }
        return var3_3;
    }

    private aH[] gW() {
        aH[] aHArray = new aH[llIIIllIll[3]];
        int var58 = llIIIllIll[0];
        while (aG.lIlIIlllIIlII(var58, llIIIllIll[3])) {
            var59[var58] = new AHHelper(llIIIllIll[3]);
            ++var58;

            if ((0xC5 ^ 0xA8 ^ (0x2E ^ 0x47)) >= -1) continue;
            return null;
        }
        return aHArray;
    }
}

