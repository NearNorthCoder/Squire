/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.widgets.Widgets
 */
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.widgets.Widgets;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aH;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aI;

public class aG_Unknown {
    private /* synthetic */ aH[] pG;
    private final /* synthetic */ int pC = 0;
    @Inject
    /* synthetic */ Client t;
    private final /* synthetic */ int pE = 2;
    private final /* synthetic */ int pD = 1;
    private final /* synthetic */ int pF = 5;
    private static /* synthetic */ int[] llIIIllIll;
    private /* synthetic */ boolean pH;

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
        int var33 = llIIIllIll[0];
        while (aG.lIlIIlllIIlII(var33, llIIIllIll[3])) {
            void var3;
            var28[var33] = new aH[((void)var3[var33]).length];
            int var47 = llIIIllIll[0];
            while (aG.lIlIIlllIIlII(var47, ((void)var3[var33]).length)) {
                aH var37 = new aH(llIIIllIll[3]);
                int var18 = llIIIllIll[0];
                while (aG.lIlIIlllIIlII(var18, llIIIllIll[3])) {
                    var37.pI[var18] = var3[var33][var47].pI[var18];
                    ++var18;
                    0;
                    if (-2 <= 0) continue;
                    return null;
                }
                var28[var33][var47] = var37;
                ++var47;
                0;
                if ((115 + 31 - 45 + 38 ^ 133 + 27 - 114 + 97) >= (26 + 70 - 54 + 102 ^ 143 + 3 - 52 + 54)) continue;
                return null;
            }
            ++var33;
            0;
            
            return null;
        }
        return aHArray2;
    }

    private aI a(int[] nArray, int[] nArray2) {
        return new aI(this.d(nArray), this.d(nArray2), this.gW(), llIIIllIll[10]);
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
        int var22 = llIIIllIll[0];
        while (aG.lIlIIlllIIlII(var22, llIIIllIll[3])) {
            int var35 = llIIIllIll[0];
            while (aG.lIlIIlllIIlII(var35, llIIIllIll[3])) {
                void var31;
                llllllllllllllllllIlIllIIIllIIlI[var22].pI[var35] = var31[var22].pI[var35];
                ++var35;
                0;
                if (2 > 0) continue;
                return null;
            }
            ++var22;
            0;
            if ((0x35 ^ 0x29 ^ (0x7F ^ 0x67)) >= 0) continue;
            return null;
        }
        return aHArray2;
    }

    public aG() {
        this.pC = llIIIllIll[0];
        this.pD = llIIIllIll[1];
        this.pE = llIIIllIll[2];
        this.pF = llIIIllIll[3];
        this.pG = null;
        this.pH = llIIIllIll[0];
    }

    private aI b(aI aI2) {
        return new aI(this.a(aI2.pJ), this.a(aI2.pK), this.a(aI2.pL), aI2.pM);
    }

    /*
     * WARNING - void declaration
     */
    public List<Widget> gU() {
        Widget widget = Widgets.get((int)llIIIllIll[4], (int)llIIIllIll[7]);
        ArrayList<Widget> arrayList = new ArrayList<Widget>();
        if (aG.lIlIIlllIIlIl(this.pG) && aG.lIlIIlllIIlIl(widget)) {
            aG var44;
            int var1 = llIIIllIll[0];
            while (aG.lIlIIlllIIlII(var1, var44.pG.length)) {
                int var6 = llIIIllIll[0];
                while (aG.lIlIIlllIIlII(var6, var44.pG[var1].pI.length)) {
                    if (aG.lIlIIlllIIllI(var44.pG[var1].pI[var6], llIIIllIll[2])) {
                        void var15;
                        void var29;
                        Widget var38 = var29.getChild(var1 * llIIIllIll[3] + var6);
                        var15.add(var38);
                        0;
                    }
                    ++var6;
                    0;
                    if (((174 + 55 - 124 + 72 ^ 60 + 91 - 78 + 99) & (0x48 ^ 0x11 ^ (0xDE ^ 0x9A) ^ -1)) == 0) continue;
                    return null;
                }
                ++var1;
                0;
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
        aHArray[aG.llIIIllIll[0]] = new aH(nArray);
        hashMap.put(llIIIllIll[0], this.c(aHArray));
        0;
        aH[] aHArray2 = new aH[llIIIllIll[1]];
        int[] nArray2 = new int[llIIIllIll[3]];
        nArray2[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray2[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray2[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray2[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray2[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray2[aG.llIIIllIll[0]] = new aH(nArray2);
        hashMap.put(llIIIllIll[1], this.c(aHArray2));
        0;
        aH[] aHArray3 = new aH[llIIIllIll[1]];
        int[] nArray3 = new int[llIIIllIll[3]];
        nArray3[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray3[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray3[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray3[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray3[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray3[aG.llIIIllIll[0]] = new aH(nArray3);
        hashMap.put(llIIIllIll[2], this.c(aHArray3));
        0;
        aH[] aHArray4 = new aH[llIIIllIll[2]];
        int[] nArray4 = new int[llIIIllIll[3]];
        nArray4[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray4[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray4[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray4[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray4[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray4[aG.llIIIllIll[0]] = new aH(nArray4);
        int[] nArray5 = new int[llIIIllIll[3]];
        nArray5[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray5[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray5[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray5[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray5[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray4[aG.llIIIllIll[1]] = new aH(nArray5);
        hashMap.put(llIIIllIll[12], this.c(aHArray4));
        0;
        aH[] aHArray5 = new aH[llIIIllIll[2]];
        int[] nArray6 = new int[llIIIllIll[3]];
        nArray6[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray6[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray6[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray6[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray6[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray5[aG.llIIIllIll[0]] = new aH(nArray6);
        int[] nArray7 = new int[llIIIllIll[3]];
        nArray7[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray7[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray7[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray7[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray7[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray5[aG.llIIIllIll[1]] = new aH(nArray7);
        hashMap.put(llIIIllIll[13], this.c(aHArray5));
        0;
        aH[] aHArray6 = new aH[llIIIllIll[12]];
        int[] nArray8 = new int[llIIIllIll[3]];
        nArray8[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray8[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray8[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray8[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray8[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray6[aG.llIIIllIll[0]] = new aH(nArray8);
        int[] nArray9 = new int[llIIIllIll[3]];
        nArray9[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray9[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray9[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray9[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray9[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray6[aG.llIIIllIll[1]] = new aH(nArray9);
        int[] nArray10 = new int[llIIIllIll[3]];
        nArray10[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray10[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray10[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray10[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray10[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray6[aG.llIIIllIll[2]] = new aH(nArray10);
        hashMap.put(llIIIllIll[3], this.c(aHArray6));
        0;
        aH[] aHArray7 = new aH[llIIIllIll[12]];
        int[] nArray11 = new int[llIIIllIll[3]];
        nArray11[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray11[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray11[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray11[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray11[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray7[aG.llIIIllIll[0]] = new aH(nArray11);
        int[] nArray12 = new int[llIIIllIll[3]];
        nArray12[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray12[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray12[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray12[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray12[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray7[aG.llIIIllIll[1]] = new aH(nArray12);
        int[] nArray13 = new int[llIIIllIll[3]];
        nArray13[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray13[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray13[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray13[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray13[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray7[aG.llIIIllIll[2]] = new aH(nArray13);
        hashMap.put(llIIIllIll[14], this.c(aHArray7));
        0;
        aH[] aHArray8 = new aH[llIIIllIll[12]];
        int[] nArray14 = new int[llIIIllIll[3]];
        nArray14[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray14[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray14[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray14[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray14[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray8[aG.llIIIllIll[0]] = new aH(nArray14);
        int[] nArray15 = new int[llIIIllIll[3]];
        nArray15[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray15[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray15[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray15[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray15[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray8[aG.llIIIllIll[1]] = new aH(nArray15);
        int[] nArray16 = new int[llIIIllIll[3]];
        nArray16[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray16[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray16[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray16[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray16[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray8[aG.llIIIllIll[2]] = new aH(nArray16);
        hashMap.put(llIIIllIll[15], this.c(aHArray8));
        0;
        aH[] aHArray9 = new aH[llIIIllIll[12]];
        int[] nArray17 = new int[llIIIllIll[3]];
        nArray17[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray17[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray17[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray17[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray17[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray9[aG.llIIIllIll[0]] = new aH(nArray17);
        int[] nArray18 = new int[llIIIllIll[3]];
        nArray18[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray18[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray18[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray18[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray18[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray9[aG.llIIIllIll[1]] = new aH(nArray18);
        int[] nArray19 = new int[llIIIllIll[3]];
        nArray19[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray19[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray19[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray19[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray19[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray9[aG.llIIIllIll[2]] = new aH(nArray19);
        hashMap.put(llIIIllIll[16], this.c(aHArray9));
        0;
        aH[] aHArray10 = new aH[llIIIllIll[12]];
        int[] nArray20 = new int[llIIIllIll[3]];
        nArray20[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray20[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray20[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray20[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray20[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray10[aG.llIIIllIll[0]] = new aH(nArray20);
        int[] nArray21 = new int[llIIIllIll[3]];
        nArray21[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray21[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray21[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray21[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray21[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray10[aG.llIIIllIll[1]] = new aH(nArray21);
        int[] nArray22 = new int[llIIIllIll[3]];
        nArray22[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray22[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray22[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray22[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray22[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray10[aG.llIIIllIll[2]] = new aH(nArray22);
        hashMap.put(llIIIllIll[17], this.c(aHArray10));
        0;
        aH[] aHArray11 = new aH[llIIIllIll[12]];
        int[] nArray23 = new int[llIIIllIll[3]];
        nArray23[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray23[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray23[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray23[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray23[aG.llIIIllIll[13]] = llIIIllIll[1];
        aHArray11[aG.llIIIllIll[0]] = new aH(nArray23);
        int[] nArray24 = new int[llIIIllIll[3]];
        nArray24[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray24[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray24[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray24[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray24[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray11[aG.llIIIllIll[1]] = new aH(nArray24);
        int[] nArray25 = new int[llIIIllIll[3]];
        nArray25[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray25[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray25[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray25[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray25[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray11[aG.llIIIllIll[2]] = new aH(nArray25);
        hashMap.put(llIIIllIll[18], this.c(aHArray11));
        0;
        aH[] aHArray12 = new aH[llIIIllIll[2]];
        int[] nArray26 = new int[llIIIllIll[3]];
        nArray26[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray26[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray26[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray26[aG.llIIIllIll[12]] = llIIIllIll[1];
        nArray26[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray12[aG.llIIIllIll[0]] = new aH(nArray26);
        int[] nArray27 = new int[llIIIllIll[3]];
        nArray27[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray27[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray27[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray27[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray27[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray12[aG.llIIIllIll[1]] = new aH(nArray27);
        hashMap.put(llIIIllIll[19], this.c(aHArray12));
        0;
        aH[] aHArray13 = new aH[llIIIllIll[2]];
        int[] nArray28 = new int[llIIIllIll[3]];
        nArray28[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray28[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray28[aG.llIIIllIll[2]] = llIIIllIll[1];
        nArray28[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray28[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray13[aG.llIIIllIll[0]] = new aH(nArray28);
        int[] nArray29 = new int[llIIIllIll[3]];
        nArray29[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray29[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray29[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray29[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray29[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray13[aG.llIIIllIll[1]] = new aH(nArray29);
        hashMap.put(llIIIllIll[20], this.c(aHArray13));
        0;
        aH[] aHArray14 = new aH[llIIIllIll[1]];
        int[] nArray30 = new int[llIIIllIll[3]];
        nArray30[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray30[aG.llIIIllIll[1]] = llIIIllIll[1];
        nArray30[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray30[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray30[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray14[aG.llIIIllIll[0]] = new aH(nArray30);
        hashMap.put(llIIIllIll[21], this.c(aHArray14));
        0;
        aH[] aHArray15 = new aH[llIIIllIll[1]];
        int[] nArray31 = new int[llIIIllIll[3]];
        nArray31[aG.llIIIllIll[0]] = llIIIllIll[1];
        nArray31[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray31[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray31[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray31[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray15[aG.llIIIllIll[0]] = new aH(nArray31);
        hashMap.put(llIIIllIll[22], this.c(aHArray15));
        0;
        aH[] aHArray16 = new aH[llIIIllIll[1]];
        int[] nArray32 = new int[llIIIllIll[3]];
        nArray32[aG.llIIIllIll[0]] = llIIIllIll[2];
        nArray32[aG.llIIIllIll[1]] = llIIIllIll[2];
        nArray32[aG.llIIIllIll[2]] = llIIIllIll[2];
        nArray32[aG.llIIIllIll[12]] = llIIIllIll[2];
        nArray32[aG.llIIIllIll[13]] = llIIIllIll[2];
        aHArray16[aG.llIIIllIll[0]] = new aH(nArray32);
        hashMap.put(llIIIllIll[23], this.c(aHArray16));
        0;
        return hashMap;
    }

    /*
     * WARNING - void declaration
     */
    private aH[][] d(int[] nArray) {
        HashMap<Integer, aH[]> hashMap = this.gX();
        aH[][] aHArray = new aH[llIIIllIll[3]][llIIIllIll[3]];
        int var4 = llIIIllIll[0];
        while (aG.lIlIIlllIIlII(var4, llIIIllIll[3])) {
            void var53;
            void var25;
            llllllllllllllllllIlIlIllllIIlll[var4] = (aH[])var25.get((int)var53[var4]);
            ++var4;
            0;
            
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
    private aH[] a(aH[] var20, int var48, int var36) {
        void var4_4;
        ArrayList<aH> var51 = new ArrayList<aH>();
        aH[] var49 = var20;
        int var11 = var49.length;
        int var42 = llIIIllIll[0];
        while (aG.lIlIIlllIIlII(var42, var11)) {
            aH var14 = var49[var42];
            if (aG.lIlIIlllIIllI(var14.pI[var48], var36)) {
                var51.add(var14);
                0;
            }
            ++var42;
            0;
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
        int var17 = llIIIllIll[0];
        while (aG.lIlIIlllIIlII(var17, llIIIllIll[3])) {
            int var26 = llIIIllIll[0];
            while (aG.lIlIIlllIIlII(var26, llIIIllIll[3])) {
                void var12;
                int var45;
                if (aG.lIlIIlllIlIIl(var45) && aG.lIlIIlllIlIIl(var12.pL[var17].pI[var26])) {
                    int llllllllllllllllllIlIllIIIllllll = var17;
                    int llllllllllllllllllIlIllIIIlllllI = var26;
                    var45 = llIIIllIll[1];
                }
                ++var26;
                0;
                if (1 != 0) continue;
                return null;
            }
            ++var17;
            0;
            if (((0x1E ^ 0x4C) & ~(0xF ^ 0x5D)) < 3) continue;
            return null;
        }
        aI3.pL[n3].pI[n4] = n2;
        aI3.pM -= llIIIllIll[1];
        aI3.pJ[n3] = this.a(aI3.pJ[n3], n4, n2);
        aI3.pK[n4] = this.a(aI3.pK[n4], n3, n2);
        return aI3;
    }

    private static void lIlIIlllIIIll() {
        llIIIllIll = new int[24];
        aG.llIIIllIll[0] = (85 + 143 - 84 + 16 ^ 186 + 9 - 180 + 178) & (127 + 150 - 71 + 47 ^ 122 + 38 - 21 + 17 ^ -1);
        aG.llIIIllIll[1] = 1;
        aG.llIIIllIll[2] = 2;
        aG.llIIIllIll[3] = 0x78 ^ 4 ^ (0xF5 ^ 0x8C);
        aG.llIIIllIll[4] = -(0xFFFFC76B & 0x7DF7) & (0xFFFFC7FB & Short.MAX_VALUE);
        aG.llIIIllIll[5] = 0x23 ^ 0x30;
        aG.llIIIllIll[6] = 80 + 108 - 141 + 93 ^ 96 + 96 - 184 + 142;
        aG.llIIIllIll[7] = 65 + 114 - 91 + 61 ^ 128 + 159 - 266 + 160;
        aG.llIIIllIll[8] = 0xAE ^ 0x8B ^ (0xAB ^ 0x9A);
        aG.llIIIllIll[9] = -1;
        aG.llIIIllIll[10] = 0xBA ^ 0xA3;
        aG.llIIIllIll[11] = 0xF2 ^ 0xB8 ^ (0xE8 ^ 0xB0);
        aG.llIIIllIll[12] = 3;
        aG.llIIIllIll[13] = 0xC2 ^ 0xB1 ^ (0x4B ^ 0x3C);
        aG.llIIIllIll[14] = 0x31 ^ 0x10 ^ (0x24 ^ 3);
        aG.llIIIllIll[15] = 0x9C ^ 0x9B;
        aG.llIIIllIll[16] = 0xB8 ^ 0xB0;
        aG.llIIIllIll[17] = 0xA4 ^ 0xAD;
        aG.llIIIllIll[18] = 0x17 ^ 0x6C ^ (0x76 ^ 7);
        aG.llIIIllIll[19] = (0x60 ^ 0x2C) & ~(0x28 ^ 0x64) ^ (0xB2 ^ 0xB9);
        aG.llIIIllIll[20] = 0x75 ^ 0x79;
        aG.llIIIllIll[21] = 0xB5 ^ 0xB8;
        aG.llIIIllIll[22] = 0x77 ^ 0x79;
        aG.llIIIllIll[23] = 0x3E ^ 0x31;
    }

    /*
     * WARNING - void declaration
     */
    private aH[] a(aI aI2) {
        void var40;
        int n2 = llIIIllIll[0];
        LinkedList<aI> linkedList = new LinkedList<aI>();
        linkedList.add(aI2);
        0;
        int var9 = llIIIllIll[8];
        while (aG.lIlIIlllIIlII((int)var40, var9)) {
            void var34;
            aG var23;
            aI var2 = var23.c((aI)var34.remove());
            if (aG.lIlIIlllIIlll(var2) && aG.lIlIIlllIlIII(var34.isEmpty() ? 1 : 0)) {
                return null;
            }
            if (aG.lIlIIlllIIlIl(var2) && aG.lIlIIlllIlIIl(var2.pM)) {
                return var2.pL;
            }
            if (aG.lIlIIlllIIlIl(var2)) {
                var34.add(var23.a(var2, llIIIllIll[2]));
                0;
                var34.add(var23.a(var2, llIIIllIll[1]));
                0;
            }
            ++var40;
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
        int[] nArray = new int[llIIIllIll[3]];
        int[] var43 = new int[llIIIllIll[3]];
        try {
            int var30 = llIIIllIll[0];
            while (aG.lIlIIlllIIlII(var30, llIIIllIll[3])) {
                var43[var30] = Integer.parseInt(Widgets.get((int)llIIIllIll[4], (int)(llIIIllIll[5] + var30)).getText());
                llllllllllllllllllIlIllIIllIIllI[var30] = Integer.parseInt(Widgets.get((int)llIIIllIll[4], (int)(llIIIllIll[6] + var30)).getText());
                ++var30;
                0;
                if (((215 + 189 - 225 + 71 ^ 32 + 46 - 42 + 117) & (67 + 85 - -34 + 6 ^ 13 + 43 - -6 + 101 ^ -1)) < 2) continue;
                return null;
            }
        }
        catch (NumberFormatException var30) {
            System.out.println("NumberFormatException: " + var30.getMessage());
        }
        0;
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
        void var50;
        int var13 = llIIIllIll[1];
        while (aG.lIlIIlllIlIII(var13) && aG.lIlIIlllIlIlI(var50.pM)) {
            int var24;
            aH var5;
            aG var39;
            var13 = llIIIllIll[0];
            int var32 = llIIIllIll[0];
            while (aG.lIlIIlllIIlII(var32, llIIIllIll[3])) {
                var5 = var39.b(var50.pJ[var32]);
                if (aG.lIlIIlllIIlll(var5)) {
                    return null;
                }
                var24 = llIIIllIll[0];
                while (aG.lIlIIlllIIlII(var24, llIIIllIll[3])) {
                    if (aG.lIlIIlllIlIII(var5.pI[var24]) && aG.lIlIIlllIlIIl(var50.pL[var32].pI[var24])) {
                        var13 = llIIIllIll[1];
                        var50.pM -= llIIIllIll[1];
                        var50.pL[var32].pI[var24] = var5.pI[var24];
                        var50.pK[var24] = var39.a(var50.pK[var24], var32, var5.pI[var24]);
                    }
                    ++var24;
                    0;
                    if (3 >= ((0x29 ^ 0x13) & ~(0x6F ^ 0x55))) continue;
                    return null;
                }
                ++var32;
                0;
                
                return null;
            }
            var32 = llIIIllIll[0];
            while (aG.lIlIIlllIIlII(var32, llIIIllIll[3])) {
                var5 = var39.b(var50.pK[var32]);
                if (aG.lIlIIlllIIlll(var5)) {
                    return null;
                }
                var24 = llIIIllIll[0];
                while (aG.lIlIIlllIIlII(var24, llIIIllIll[3])) {
                    if (aG.lIlIIlllIlIII(var5.pI[var24]) && aG.lIlIIlllIlIIl(var50.pL[var24].pI[var32])) {
                        var13 = llIIIllIll[1];
                        var50.pM -= llIIIllIll[1];
                        var50.pL[var24].pI[var32] = var5.pI[var24];
                        var50.pJ[var24] = var39.a(var50.pJ[var24], var32, var5.pI[var24]);
                    }
                    ++var24;
                    0;
                    if (1 == 1) continue;
                    return null;
                }
                ++var32;
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
        void var19;
        void var8;
        int n2 = aHArray.length;
        if (aG.lIlIIlllIlIIl(n2)) {
            return null;
        }
        if (aG.lIlIIlllIIllI((int)var8, llIIIllIll[1])) {
            return var19[llIIIllIll[0]];
        }
        aH var7 = new aH(llIIIllIll[3]);
        int var52 = llIIIllIll[0];
        while (aG.lIlIIlllIIlII(var52, llIIIllIll[3])) {
            int var21 = llIIIllIll[0];
            void var10 = var19;
            int var27 = ((void)var10).length;
            int var41 = llIIIllIll[0];
            while (aG.lIlIIlllIIlII(var41, var27)) {
                void var16 = var10[var41];
                if (aG.lIlIIlllIIllI(var16.pI[var52], llIIIllIll[2])) {
                    ++var21;
                }
                ++var41;
                0;
                if ((0x8C ^ 0x88) == (0x17 ^ 0x13)) continue;
                return null;
            }
            if (aG.lIlIIlllIlIIl(var21)) {
                var7.pI[var52] = llIIIllIll[1];
                0;
                if (((0xD2 ^ 0x9C) & ~(0x59 ^ 0x17)) >= (0 ^ 4)) {
                    return null;
                }
            } else if (aG.lIlIIlllIIllI(var21, (int)var8)) {
                var7.pI[var52] = llIIIllIll[2];
                0;
                if (-(0x9C ^ 0x98) > 0) {
                    return null;
                }
            } else {
                var7.pI[var52] = llIIIllIll[0];
            }
            ++var52;
            0;
            
            return null;
        }
        return var3_3;
    }

    private aH[] gW() {
        aH[] aHArray = new aH[llIIIllIll[3]];
        int var46 = llIIIllIll[0];
        while (aG.lIlIIlllIIlII(var46, llIIIllIll[3])) {
            llllllllllllllllllIlIlIllllIIIll[var46] = new aH(llIIIllIll[3]);
            ++var46;
            0;
            if ((0xC5 ^ 0xA8 ^ (0x2E ^ 0x47)) >= -1) continue;
            return null;
        }
        return aHArray;
    }
}

