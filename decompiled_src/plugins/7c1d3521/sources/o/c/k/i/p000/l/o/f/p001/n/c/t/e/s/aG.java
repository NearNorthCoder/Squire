package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.aG  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/aG.class */
public class aG {
    @Inject
    /* synthetic */ Client t;
    private static /* synthetic */ int[] llIIIllIll;
    private final /* synthetic */ int pC = llIIIllIll[0];
    private final /* synthetic */ int pD = llIIIllIll[1];
    private final /* synthetic */ int pE = llIIIllIll[2];
    private final /* synthetic */ int pF = llIIIllIll[3];
    private /* synthetic */ aH[] pG = null;
    private /* synthetic */ boolean pH = llIIIllIll[0];

    private static boolean lIlIIlllIIlIl(Object obj) {
        return obj != null;
    }

    static {
        lIlIIlllIIIll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [o.c.k.i.-.l.o.f.-.n.c.t.e.s.aH[], o.c.k.i.-.l.o.f.-.n.c.t.e.s.aH[][]] */
    private aH[][] a(aH[][] aHVarArr) {
        ?? r0 = new aH[llIIIllIll[3]];
        int i = llIIIllIll[0];
        while (lIlIIlllIIlII(i, llIIIllIll[3])) {
            r0[i] = new aH[aHVarArr[i].length];
            int i2 = llIIIllIll[0];
            while (lIlIIlllIIlII(i2, aHVarArr[i].length)) {
                aH aHVar = new aH(llIIIllIll[3]);
                int i3 = llIIIllIll[0];
                while (lIlIIlllIIlII(i3, llIIIllIll[3])) {
                    aHVar.pI[i3] = aHVarArr[i][i2].pI[i3];
                    i3++;
                    "".length();
                    if ((-"  ".length()) > 0) {
                        return null;
                    }
                }
                r0[i][i2] = aHVar;
                i2++;
                "".length();
                if (((((115 + 31) - 45) + 38) ^ (((133 + 27) - 114) + 97)) < ((((26 + 70) - 54) + 102) ^ (((143 + 3) - 52) + 54))) {
                    return null;
                }
            }
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return r0;
    }

    private aI a(int[] iArr, int[] iArr2) {
        return new aI(d(iArr), d(iArr2), gW(), llIIIllIll[10]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    public void gV() {
        Widget widget = Widgets.get(llIIIllIll[4], llIIIllIll[10]);
        Widget widget2 = Widgets.get(llIIIllIll[4], llIIIllIll[11]);
        if (lIlIIlllIIlIl(widget) && lIlIIlllIIlIl(widget2) && lIlIIlllIlIIl(this.pH ? 1 : 0)) {
            this.pH = llIIIllIll[1];
            this.pG = gT();
        }
    }

    private aH[] a(aH[] aHVarArr) {
        aH[] gW = gW();
        int i = llIIIllIll[0];
        while (lIlIIlllIIlII(i, llIIIllIll[3])) {
            int i2 = llIIIllIll[0];
            while (lIlIIlllIIlII(i2, llIIIllIll[3])) {
                gW[i].pI[i2] = aHVarArr[i].pI[i2];
                i2++;
                "".length();
                if ("  ".length() <= 0) {
                    return null;
                }
            }
            i++;
            "".length();
            if (((53 ^ 41) ^ (127 ^ 103)) < 0) {
                return null;
            }
        }
        return gW;
    }

    private aI b(aI aIVar) {
        return new aI(a(aIVar.pJ), a(aIVar.pK), a(aIVar.pL), aIVar.pM);
    }

    public List<Widget> gU() {
        Widget widget = Widgets.get(llIIIllIll[4], llIIIllIll[7]);
        ArrayList arrayList = new ArrayList();
        if (lIlIIlllIIlIl(this.pG) && lIlIIlllIIlIl(widget)) {
            int i = llIIIllIll[0];
            while (lIlIIlllIIlII(i, this.pG.length)) {
                int i2 = llIIIllIll[0];
                while (lIlIIlllIIlII(i2, this.pG[i].pI.length)) {
                    if (lIlIIlllIIllI(this.pG[i].pI[i2], llIIIllIll[2])) {
                        arrayList.add(widget.getChild((i * llIIIllIll[3]) + i2));
                        "".length();
                    }
                    i2++;
                    "".length();
                    if ((((((174 + 55) - 124) + 72) ^ (((60 + 91) - 78) + 99)) & (((72 ^ 17) ^ (222 ^ 154)) ^ (-" ".length()))) != 0) {
                        return null;
                    }
                }
                i++;
                "".length();
                if ((((11 ^ 124) ^ (5 ^ 72)) & (((16 ^ 116) ^ (34 ^ 124)) ^ (-" ".length()))) > 0) {
                    return null;
                }
            }
        }
        return arrayList;
    }

    private static boolean lIlIIlllIlIlI(int i) {
        return i > 0;
    }

    private static boolean lIlIIlllIIlll(Object obj) {
        return obj == null;
    }

    private HashMap<Integer, aH[]> gX() {
        HashMap<Integer, aH[]> hashMap = new HashMap<>();
        Integer valueOf = Integer.valueOf(llIIIllIll[0]);
        aH[] aHVarArr = new aH[llIIIllIll[1]];
        int i = llIIIllIll[0];
        int[] iArr = new int[llIIIllIll[3]];
        iArr[llIIIllIll[0]] = llIIIllIll[1];
        iArr[llIIIllIll[1]] = llIIIllIll[1];
        iArr[llIIIllIll[2]] = llIIIllIll[1];
        iArr[llIIIllIll[12]] = llIIIllIll[1];
        iArr[llIIIllIll[13]] = llIIIllIll[1];
        aHVarArr[i] = new aH(iArr);
        hashMap.put(valueOf, c(aHVarArr));
        "".length();
        Integer valueOf2 = Integer.valueOf(llIIIllIll[1]);
        aH[] aHVarArr2 = new aH[llIIIllIll[1]];
        int i2 = llIIIllIll[0];
        int[] iArr2 = new int[llIIIllIll[3]];
        iArr2[llIIIllIll[0]] = llIIIllIll[2];
        iArr2[llIIIllIll[1]] = llIIIllIll[1];
        iArr2[llIIIllIll[2]] = llIIIllIll[1];
        iArr2[llIIIllIll[12]] = llIIIllIll[1];
        iArr2[llIIIllIll[13]] = llIIIllIll[1];
        aHVarArr2[i2] = new aH(iArr2);
        hashMap.put(valueOf2, c(aHVarArr2));
        "".length();
        Integer valueOf3 = Integer.valueOf(llIIIllIll[2]);
        aH[] aHVarArr3 = new aH[llIIIllIll[1]];
        int i3 = llIIIllIll[0];
        int[] iArr3 = new int[llIIIllIll[3]];
        iArr3[llIIIllIll[0]] = llIIIllIll[1];
        iArr3[llIIIllIll[1]] = llIIIllIll[2];
        iArr3[llIIIllIll[2]] = llIIIllIll[1];
        iArr3[llIIIllIll[12]] = llIIIllIll[1];
        iArr3[llIIIllIll[13]] = llIIIllIll[1];
        aHVarArr3[i3] = new aH(iArr3);
        hashMap.put(valueOf3, c(aHVarArr3));
        "".length();
        Integer valueOf4 = Integer.valueOf(llIIIllIll[12]);
        aH[] aHVarArr4 = new aH[llIIIllIll[2]];
        int i4 = llIIIllIll[0];
        int[] iArr4 = new int[llIIIllIll[3]];
        iArr4[llIIIllIll[0]] = llIIIllIll[2];
        iArr4[llIIIllIll[1]] = llIIIllIll[2];
        iArr4[llIIIllIll[2]] = llIIIllIll[1];
        iArr4[llIIIllIll[12]] = llIIIllIll[1];
        iArr4[llIIIllIll[13]] = llIIIllIll[1];
        aHVarArr4[i4] = new aH(iArr4);
        int i5 = llIIIllIll[1];
        int[] iArr5 = new int[llIIIllIll[3]];
        iArr5[llIIIllIll[0]] = llIIIllIll[1];
        iArr5[llIIIllIll[1]] = llIIIllIll[1];
        iArr5[llIIIllIll[2]] = llIIIllIll[2];
        iArr5[llIIIllIll[12]] = llIIIllIll[1];
        iArr5[llIIIllIll[13]] = llIIIllIll[1];
        aHVarArr4[i5] = new aH(iArr5);
        hashMap.put(valueOf4, c(aHVarArr4));
        "".length();
        Integer valueOf5 = Integer.valueOf(llIIIllIll[13]);
        aH[] aHVarArr5 = new aH[llIIIllIll[2]];
        int i6 = llIIIllIll[0];
        int[] iArr6 = new int[llIIIllIll[3]];
        iArr6[llIIIllIll[0]] = llIIIllIll[2];
        iArr6[llIIIllIll[1]] = llIIIllIll[1];
        iArr6[llIIIllIll[2]] = llIIIllIll[2];
        iArr6[llIIIllIll[12]] = llIIIllIll[1];
        iArr6[llIIIllIll[13]] = llIIIllIll[1];
        aHVarArr5[i6] = new aH(iArr6);
        int i7 = llIIIllIll[1];
        int[] iArr7 = new int[llIIIllIll[3]];
        iArr7[llIIIllIll[0]] = llIIIllIll[1];
        iArr7[llIIIllIll[1]] = llIIIllIll[1];
        iArr7[llIIIllIll[2]] = llIIIllIll[1];
        iArr7[llIIIllIll[12]] = llIIIllIll[2];
        iArr7[llIIIllIll[13]] = llIIIllIll[1];
        aHVarArr5[i7] = new aH(iArr7);
        hashMap.put(valueOf5, c(aHVarArr5));
        "".length();
        Integer valueOf6 = Integer.valueOf(llIIIllIll[3]);
        aH[] aHVarArr6 = new aH[llIIIllIll[12]];
        int i8 = llIIIllIll[0];
        int[] iArr8 = new int[llIIIllIll[3]];
        iArr8[llIIIllIll[0]] = llIIIllIll[1];
        iArr8[llIIIllIll[1]] = llIIIllIll[2];
        iArr8[llIIIllIll[2]] = llIIIllIll[2];
        iArr8[llIIIllIll[12]] = llIIIllIll[1];
        iArr8[llIIIllIll[13]] = llIIIllIll[1];
        aHVarArr6[i8] = new aH(iArr8);
        int i9 = llIIIllIll[1];
        int[] iArr9 = new int[llIIIllIll[3]];
        iArr9[llIIIllIll[0]] = llIIIllIll[2];
        iArr9[llIIIllIll[1]] = llIIIllIll[1];
        iArr9[llIIIllIll[2]] = llIIIllIll[1];
        iArr9[llIIIllIll[12]] = llIIIllIll[2];
        iArr9[llIIIllIll[13]] = llIIIllIll[1];
        aHVarArr6[i9] = new aH(iArr9);
        int i10 = llIIIllIll[2];
        int[] iArr10 = new int[llIIIllIll[3]];
        iArr10[llIIIllIll[0]] = llIIIllIll[1];
        iArr10[llIIIllIll[1]] = llIIIllIll[1];
        iArr10[llIIIllIll[2]] = llIIIllIll[1];
        iArr10[llIIIllIll[12]] = llIIIllIll[1];
        iArr10[llIIIllIll[13]] = llIIIllIll[2];
        aHVarArr6[i10] = new aH(iArr10);
        hashMap.put(valueOf6, c(aHVarArr6));
        "".length();
        Integer valueOf7 = Integer.valueOf(llIIIllIll[14]);
        aH[] aHVarArr7 = new aH[llIIIllIll[12]];
        int i11 = llIIIllIll[0];
        int[] iArr11 = new int[llIIIllIll[3]];
        iArr11[llIIIllIll[0]] = llIIIllIll[2];
        iArr11[llIIIllIll[1]] = llIIIllIll[2];
        iArr11[llIIIllIll[2]] = llIIIllIll[2];
        iArr11[llIIIllIll[12]] = llIIIllIll[1];
        iArr11[llIIIllIll[13]] = llIIIllIll[1];
        aHVarArr7[i11] = new aH(iArr11);
        int i12 = llIIIllIll[1];
        int[] iArr12 = new int[llIIIllIll[3]];
        iArr12[llIIIllIll[0]] = llIIIllIll[1];
        iArr12[llIIIllIll[1]] = llIIIllIll[2];
        iArr12[llIIIllIll[2]] = llIIIllIll[1];
        iArr12[llIIIllIll[12]] = llIIIllIll[2];
        iArr12[llIIIllIll[13]] = llIIIllIll[1];
        aHVarArr7[i12] = new aH(iArr12);
        int i13 = llIIIllIll[2];
        int[] iArr13 = new int[llIIIllIll[3]];
        iArr13[llIIIllIll[0]] = llIIIllIll[2];
        iArr13[llIIIllIll[1]] = llIIIllIll[1];
        iArr13[llIIIllIll[2]] = llIIIllIll[1];
        iArr13[llIIIllIll[12]] = llIIIllIll[1];
        iArr13[llIIIllIll[13]] = llIIIllIll[2];
        aHVarArr7[i13] = new aH(iArr13);
        hashMap.put(valueOf7, c(aHVarArr7));
        "".length();
        Integer valueOf8 = Integer.valueOf(llIIIllIll[15]);
        aH[] aHVarArr8 = new aH[llIIIllIll[12]];
        int i14 = llIIIllIll[0];
        int[] iArr14 = new int[llIIIllIll[3]];
        iArr14[llIIIllIll[0]] = llIIIllIll[2];
        iArr14[llIIIllIll[1]] = llIIIllIll[2];
        iArr14[llIIIllIll[2]] = llIIIllIll[1];
        iArr14[llIIIllIll[12]] = llIIIllIll[2];
        iArr14[llIIIllIll[13]] = llIIIllIll[1];
        aHVarArr8[i14] = new aH(iArr14);
        int i15 = llIIIllIll[1];
        int[] iArr15 = new int[llIIIllIll[3]];
        iArr15[llIIIllIll[0]] = llIIIllIll[1];
        iArr15[llIIIllIll[1]] = llIIIllIll[1];
        iArr15[llIIIllIll[2]] = llIIIllIll[2];
        iArr15[llIIIllIll[12]] = llIIIllIll[2];
        iArr15[llIIIllIll[13]] = llIIIllIll[1];
        aHVarArr8[i15] = new aH(iArr15);
        int i16 = llIIIllIll[2];
        int[] iArr16 = new int[llIIIllIll[3]];
        iArr16[llIIIllIll[0]] = llIIIllIll[1];
        iArr16[llIIIllIll[1]] = llIIIllIll[2];
        iArr16[llIIIllIll[2]] = llIIIllIll[1];
        iArr16[llIIIllIll[12]] = llIIIllIll[1];
        iArr16[llIIIllIll[13]] = llIIIllIll[2];
        aHVarArr8[i16] = new aH(iArr16);
        hashMap.put(valueOf8, c(aHVarArr8));
        "".length();
        Integer valueOf9 = Integer.valueOf(llIIIllIll[16]);
        aH[] aHVarArr9 = new aH[llIIIllIll[12]];
        int i17 = llIIIllIll[0];
        int[] iArr17 = new int[llIIIllIll[3]];
        iArr17[llIIIllIll[0]] = llIIIllIll[2];
        iArr17[llIIIllIll[1]] = llIIIllIll[1];
        iArr17[llIIIllIll[2]] = llIIIllIll[2];
        iArr17[llIIIllIll[12]] = llIIIllIll[2];
        iArr17[llIIIllIll[13]] = llIIIllIll[1];
        aHVarArr9[i17] = new aH(iArr17);
        int i18 = llIIIllIll[1];
        int[] iArr18 = new int[llIIIllIll[3]];
        iArr18[llIIIllIll[0]] = llIIIllIll[2];
        iArr18[llIIIllIll[1]] = llIIIllIll[2];
        iArr18[llIIIllIll[2]] = llIIIllIll[1];
        iArr18[llIIIllIll[12]] = llIIIllIll[1];
        iArr18[llIIIllIll[13]] = llIIIllIll[2];
        aHVarArr9[i18] = new aH(iArr18);
        int i19 = llIIIllIll[2];
        int[] iArr19 = new int[llIIIllIll[3]];
        iArr19[llIIIllIll[0]] = llIIIllIll[1];
        iArr19[llIIIllIll[1]] = llIIIllIll[1];
        iArr19[llIIIllIll[2]] = llIIIllIll[2];
        iArr19[llIIIllIll[12]] = llIIIllIll[1];
        iArr19[llIIIllIll[13]] = llIIIllIll[2];
        aHVarArr9[i19] = new aH(iArr19);
        hashMap.put(valueOf9, c(aHVarArr9));
        "".length();
        Integer valueOf10 = Integer.valueOf(llIIIllIll[17]);
        aH[] aHVarArr10 = new aH[llIIIllIll[12]];
        int i20 = llIIIllIll[0];
        int[] iArr20 = new int[llIIIllIll[3]];
        iArr20[llIIIllIll[0]] = llIIIllIll[1];
        iArr20[llIIIllIll[1]] = llIIIllIll[2];
        iArr20[llIIIllIll[2]] = llIIIllIll[2];
        iArr20[llIIIllIll[12]] = llIIIllIll[2];
        iArr20[llIIIllIll[13]] = llIIIllIll[1];
        aHVarArr10[i20] = new aH(iArr20);
        int i21 = llIIIllIll[1];
        int[] iArr21 = new int[llIIIllIll[3]];
        iArr21[llIIIllIll[0]] = llIIIllIll[2];
        iArr21[llIIIllIll[1]] = llIIIllIll[1];
        iArr21[llIIIllIll[2]] = llIIIllIll[2];
        iArr21[llIIIllIll[12]] = llIIIllIll[1];
        iArr21[llIIIllIll[13]] = llIIIllIll[2];
        aHVarArr10[i21] = new aH(iArr21);
        int i22 = llIIIllIll[2];
        int[] iArr22 = new int[llIIIllIll[3]];
        iArr22[llIIIllIll[0]] = llIIIllIll[1];
        iArr22[llIIIllIll[1]] = llIIIllIll[1];
        iArr22[llIIIllIll[2]] = llIIIllIll[1];
        iArr22[llIIIllIll[12]] = llIIIllIll[2];
        iArr22[llIIIllIll[13]] = llIIIllIll[2];
        aHVarArr10[i22] = new aH(iArr22);
        hashMap.put(valueOf10, c(aHVarArr10));
        "".length();
        Integer valueOf11 = Integer.valueOf(llIIIllIll[18]);
        aH[] aHVarArr11 = new aH[llIIIllIll[12]];
        int i23 = llIIIllIll[0];
        int[] iArr23 = new int[llIIIllIll[3]];
        iArr23[llIIIllIll[0]] = llIIIllIll[2];
        iArr23[llIIIllIll[1]] = llIIIllIll[2];
        iArr23[llIIIllIll[2]] = llIIIllIll[2];
        iArr23[llIIIllIll[12]] = llIIIllIll[2];
        iArr23[llIIIllIll[13]] = llIIIllIll[1];
        aHVarArr11[i23] = new aH(iArr23);
        int i24 = llIIIllIll[1];
        int[] iArr24 = new int[llIIIllIll[3]];
        iArr24[llIIIllIll[0]] = llIIIllIll[1];
        iArr24[llIIIllIll[1]] = llIIIllIll[2];
        iArr24[llIIIllIll[2]] = llIIIllIll[2];
        iArr24[llIIIllIll[12]] = llIIIllIll[1];
        iArr24[llIIIllIll[13]] = llIIIllIll[2];
        aHVarArr11[i24] = new aH(iArr24);
        int i25 = llIIIllIll[2];
        int[] iArr25 = new int[llIIIllIll[3]];
        iArr25[llIIIllIll[0]] = llIIIllIll[2];
        iArr25[llIIIllIll[1]] = llIIIllIll[1];
        iArr25[llIIIllIll[2]] = llIIIllIll[1];
        iArr25[llIIIllIll[12]] = llIIIllIll[2];
        iArr25[llIIIllIll[13]] = llIIIllIll[2];
        aHVarArr11[i25] = new aH(iArr25);
        hashMap.put(valueOf11, c(aHVarArr11));
        "".length();
        Integer valueOf12 = Integer.valueOf(llIIIllIll[19]);
        aH[] aHVarArr12 = new aH[llIIIllIll[2]];
        int i26 = llIIIllIll[0];
        int[] iArr26 = new int[llIIIllIll[3]];
        iArr26[llIIIllIll[0]] = llIIIllIll[2];
        iArr26[llIIIllIll[1]] = llIIIllIll[2];
        iArr26[llIIIllIll[2]] = llIIIllIll[2];
        iArr26[llIIIllIll[12]] = llIIIllIll[1];
        iArr26[llIIIllIll[13]] = llIIIllIll[2];
        aHVarArr12[i26] = new aH(iArr26);
        int i27 = llIIIllIll[1];
        int[] iArr27 = new int[llIIIllIll[3]];
        iArr27[llIIIllIll[0]] = llIIIllIll[1];
        iArr27[llIIIllIll[1]] = llIIIllIll[2];
        iArr27[llIIIllIll[2]] = llIIIllIll[1];
        iArr27[llIIIllIll[12]] = llIIIllIll[2];
        iArr27[llIIIllIll[13]] = llIIIllIll[2];
        aHVarArr12[i27] = new aH(iArr27);
        hashMap.put(valueOf12, c(aHVarArr12));
        "".length();
        Integer valueOf13 = Integer.valueOf(llIIIllIll[20]);
        aH[] aHVarArr13 = new aH[llIIIllIll[2]];
        int i28 = llIIIllIll[0];
        int[] iArr28 = new int[llIIIllIll[3]];
        iArr28[llIIIllIll[0]] = llIIIllIll[2];
        iArr28[llIIIllIll[1]] = llIIIllIll[2];
        iArr28[llIIIllIll[2]] = llIIIllIll[1];
        iArr28[llIIIllIll[12]] = llIIIllIll[2];
        iArr28[llIIIllIll[13]] = llIIIllIll[2];
        aHVarArr13[i28] = new aH(iArr28);
        int i29 = llIIIllIll[1];
        int[] iArr29 = new int[llIIIllIll[3]];
        iArr29[llIIIllIll[0]] = llIIIllIll[1];
        iArr29[llIIIllIll[1]] = llIIIllIll[1];
        iArr29[llIIIllIll[2]] = llIIIllIll[2];
        iArr29[llIIIllIll[12]] = llIIIllIll[2];
        iArr29[llIIIllIll[13]] = llIIIllIll[2];
        aHVarArr13[i29] = new aH(iArr29);
        hashMap.put(valueOf13, c(aHVarArr13));
        "".length();
        Integer valueOf14 = Integer.valueOf(llIIIllIll[21]);
        aH[] aHVarArr14 = new aH[llIIIllIll[1]];
        int i30 = llIIIllIll[0];
        int[] iArr30 = new int[llIIIllIll[3]];
        iArr30[llIIIllIll[0]] = llIIIllIll[2];
        iArr30[llIIIllIll[1]] = llIIIllIll[1];
        iArr30[llIIIllIll[2]] = llIIIllIll[2];
        iArr30[llIIIllIll[12]] = llIIIllIll[2];
        iArr30[llIIIllIll[13]] = llIIIllIll[2];
        aHVarArr14[i30] = new aH(iArr30);
        hashMap.put(valueOf14, c(aHVarArr14));
        "".length();
        Integer valueOf15 = Integer.valueOf(llIIIllIll[22]);
        aH[] aHVarArr15 = new aH[llIIIllIll[1]];
        int i31 = llIIIllIll[0];
        int[] iArr31 = new int[llIIIllIll[3]];
        iArr31[llIIIllIll[0]] = llIIIllIll[1];
        iArr31[llIIIllIll[1]] = llIIIllIll[2];
        iArr31[llIIIllIll[2]] = llIIIllIll[2];
        iArr31[llIIIllIll[12]] = llIIIllIll[2];
        iArr31[llIIIllIll[13]] = llIIIllIll[2];
        aHVarArr15[i31] = new aH(iArr31);
        hashMap.put(valueOf15, c(aHVarArr15));
        "".length();
        Integer valueOf16 = Integer.valueOf(llIIIllIll[23]);
        aH[] aHVarArr16 = new aH[llIIIllIll[1]];
        int i32 = llIIIllIll[0];
        int[] iArr32 = new int[llIIIllIll[3]];
        iArr32[llIIIllIll[0]] = llIIIllIll[2];
        iArr32[llIIIllIll[1]] = llIIIllIll[2];
        iArr32[llIIIllIll[2]] = llIIIllIll[2];
        iArr32[llIIIllIll[12]] = llIIIllIll[2];
        iArr32[llIIIllIll[13]] = llIIIllIll[2];
        aHVarArr16[i32] = new aH(iArr32);
        hashMap.put(valueOf16, c(aHVarArr16));
        "".length();
        return hashMap;
    }

    private aH[][] d(int[] iArr) {
        HashMap<Integer, aH[]> gX = gX();
        aH[][] aHVarArr = new aH[llIIIllIll[3]][llIIIllIll[3]];
        int llllllllllllllllllIlIlIllllIIllI = llIIIllIll[0];
        while (lIlIIlllIIlII(llllllllllllllllllIlIlIllllIIllI, llIIIllIll[3])) {
            aHVarArr[llllllllllllllllllIlIlIllllIIllI] = gX.get(Integer.valueOf(iArr[llllllllllllllllllIlIlIllllIIllI]));
            llllllllllllllllllIlIlIllllIIllI++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return aHVarArr;
    }

    private static boolean lIlIIlllIlIII(int i) {
        return i != 0;
    }

    private static boolean lIlIIlllIIlII(int i, int i2) {
        return i < i2;
    }

    private aH[] c(aH... aHVarArr) {
        return aHVarArr;
    }

    private static boolean lIlIIlllIlIIl(int i) {
        return i == 0;
    }

    private aH[] a(aH[] aHVarArr, int i, int llllllllllllllllllIlIlIllllllIll) {
        ArrayList arrayList = new ArrayList();
        int length = aHVarArr.length;
        int i2 = llIIIllIll[0];
        while (lIlIIlllIIlII(i2, length)) {
            aH aHVar = aHVarArr[i2];
            if (lIlIIlllIIllI(aHVar.pI[i], llllllllllllllllllIlIlIllllllIll)) {
                arrayList.add(aHVar);
                "".length();
            }
            i2++;
            "".length();
            if (!((true ^ true) ^ (true ^ true))) {
                return null;
            }
        }
        return (aH[]) arrayList.toArray(new aH[llIIIllIll[0]]);
    }

    private aI a(aI aIVar, int i) {
        int i2 = llIIIllIll[9];
        int i3 = llIIIllIll[9];
        aI b = b(aIVar);
        int i4 = llIIIllIll[0];
        int llllllllllllllllllIlIllIIIlllIll = llIIIllIll[0];
        while (lIlIIlllIIlII(llllllllllllllllllIlIllIIIlllIll, llIIIllIll[3])) {
            int i5 = llIIIllIll[0];
            while (lIlIIlllIIlII(i5, llIIIllIll[3])) {
                if (lIlIIlllIlIIl(i4) && lIlIIlllIlIIl(b.pL[llllllllllllllllllIlIllIIIlllIll].pI[i5])) {
                    i2 = llllllllllllllllllIlIllIIIlllIll;
                    i3 = i5;
                    i4 = llIIIllIll[1];
                }
                i5++;
                "".length();
                if (" ".length() == 0) {
                    return null;
                }
            }
            llllllllllllllllllIlIllIIIlllIll++;
            "".length();
            if (((30 ^ 76) & ((15 ^ 93) ^ (-1))) >= "   ".length()) {
                return null;
            }
        }
        b.pL[i2].pI[i3] = i;
        b.pM -= llIIIllIll[1];
        b.pJ[i2] = a(b.pJ[i2], i3, i);
        b.pK[i3] = a(b.pK[i3], i2, i);
        return b;
    }

    private static void lIlIIlllIIIll() {
        llIIIllIll = new int[24];
        llIIIllIll[0] = ((((85 + 143) - 84) + 16) ^ (((186 + 9) - 180) + 178)) & (((((127 + 150) - 71) + 47) ^ (((122 + 38) - 21) + 17)) ^ (-" ".length()));
        llIIIllIll[1] = " ".length();
        llIIIllIll[2] = "  ".length();
        llIIIllIll[3] = (120 ^ 4) ^ (245 ^ 140);
        llIIIllIll[4] = (-((-14485) & 32247)) & (-14341) & 32767;
        llIIIllIll[5] = 35 ^ 48;
        llIIIllIll[6] = (((80 + 108) - 141) + 93) ^ (((96 + 96) - 184) + 142);
        llIIIllIll[7] = (((65 + 114) - 91) + 61) ^ (((128 + 159) - 266) + 160);
        llIIIllIll[8] = (174 ^ 139) ^ (171 ^ 154);
        llIIIllIll[9] = -" ".length();
        llIIIllIll[10] = 186 ^ 163;
        llIIIllIll[11] = (242 ^ 184) ^ (232 ^ 176);
        llIIIllIll[12] = "   ".length();
        llIIIllIll[13] = (194 ^ 177) ^ (75 ^ 60);
        llIIIllIll[14] = (49 ^ 16) ^ (36 ^ 3);
        llIIIllIll[15] = 156 ^ 155;
        llIIIllIll[16] = 184 ^ 176;
        llIIIllIll[17] = 164 ^ 173;
        llIIIllIll[18] = (23 ^ 108) ^ (118 ^ 7);
        llIIIllIll[19] = ((96 ^ 44) & ((40 ^ 100) ^ (-1))) ^ (178 ^ 185);
        llIIIllIll[20] = 117 ^ 121;
        llIIIllIll[21] = 181 ^ 184;
        llIIIllIll[22] = 119 ^ 121;
        llIIIllIll[23] = 62 ^ 49;
    }

    private aH[] a(aI aIVar) {
        int i = llIIIllIll[0];
        LinkedList linkedList = new LinkedList();
        linkedList.add(aIVar);
        "".length();
        int i2 = llIIIllIll[8];
        while (lIlIIlllIIlII(i, i2)) {
            aI c = c((aI) linkedList.remove());
            if (lIlIIlllIIlll(c) && lIlIIlllIlIII(linkedList.isEmpty() ? 1 : 0)) {
                return null;
            }
            if (lIlIIlllIIlIl(c) && lIlIIlllIlIIl(c.pM)) {
                return c.pL;
            }
            if (lIlIIlllIIlIl(c)) {
                linkedList.add(a(c, llIIIllIll[2]));
                "".length();
                linkedList.add(a(c, llIIIllIll[1]));
                "".length();
            }
            i++;
            "".length();
            if ("   ".length() >= ((((55 + 101) - 71) + 70) ^ (((127 + 40) - 148) + 140))) {
                return null;
            }
        }
        return null;
    }

    private aH[] gT() {
        int[] iArr = new int[llIIIllIll[3]];
        int[] iArr2 = new int[llIIIllIll[3]];
        try {
            int llllllllllllllllllIlIllIIllIIlII = llIIIllIll[0];
            while (lIlIIlllIIlII(llllllllllllllllllIlIllIIllIIlII, llIIIllIll[3])) {
                iArr2[llllllllllllllllllIlIllIIllIIlII] = Integer.parseInt(Widgets.get(llIIIllIll[4], llIIIllIll[5] + llllllllllllllllllIlIllIIllIIlII).getText());
                iArr[llllllllllllllllllIlIllIIllIIlII] = Integer.parseInt(Widgets.get(llIIIllIll[4], llIIIllIll[6] + llllllllllllllllllIlIllIIllIIlII).getText());
                llllllllllllllllllIlIllIIllIIlII++;
                "".length();
                if ((((((215 + 189) - 225) + 71) ^ (((32 + 46) - 42) + 117)) & (((((67 + 85) - (-34)) + 6) ^ (((13 + 43) - (-6)) + 101)) ^ (-" ".length()))) >= "  ".length()) {
                    return null;
                }
            }
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
        return a(a(iArr, iArr2));
    }

    private static boolean lIlIIlllIIllI(int i, int i2) {
        return i == i2;
    }

    private aI c(aI aIVar) {
        int llllllllllllllllllIlIllIIIIIlIIl = llIIIllIll[1];
        while (lIlIIlllIlIII(llllllllllllllllllIlIllIIIIIlIIl) && lIlIIlllIlIlI(aIVar.pM)) {
            llllllllllllllllllIlIllIIIIIlIIl = llIIIllIll[0];
            int i = llIIIllIll[0];
            while (lIlIIlllIIlII(i, llIIIllIll[3])) {
                aH b = b(aIVar.pJ[i]);
                if (lIlIIlllIIlll(b)) {
                    return null;
                }
                int i2 = llIIIllIll[0];
                while (lIlIIlllIIlII(i2, llIIIllIll[3])) {
                    if (lIlIIlllIlIII(b.pI[i2]) && lIlIIlllIlIIl(aIVar.pL[i].pI[i2])) {
                        llllllllllllllllllIlIllIIIIIlIIl = llIIIllIll[1];
                        aIVar.pM -= llIIIllIll[1];
                        aIVar.pL[i].pI[i2] = b.pI[i2];
                        aIVar.pK[i2] = a(aIVar.pK[i2], i, b.pI[i2]);
                    }
                    i2++;
                    "".length();
                    if ("   ".length() < ((41 ^ 19) & ((111 ^ 85) ^ (-1)))) {
                        return null;
                    }
                }
                i++;
                "".length();
                if (0 != 0) {
                    return null;
                }
            }
            int i3 = llIIIllIll[0];
            while (lIlIIlllIIlII(i3, llIIIllIll[3])) {
                aH b2 = b(aIVar.pK[i3]);
                if (lIlIIlllIIlll(b2)) {
                    return null;
                }
                int i4 = llIIIllIll[0];
                while (lIlIIlllIIlII(i4, llIIIllIll[3])) {
                    if (lIlIIlllIlIII(b2.pI[i4]) && lIlIIlllIlIIl(aIVar.pL[i4].pI[i3])) {
                        llllllllllllllllllIlIllIIIIIlIIl = llIIIllIll[1];
                        aIVar.pM -= llIIIllIll[1];
                        aIVar.pL[i4].pI[i3] = b2.pI[i4];
                        aIVar.pJ[i4] = a(aIVar.pJ[i4], i3, b2.pI[i4]);
                    }
                    i4++;
                    "".length();
                    if (" ".length() != " ".length()) {
                        return null;
                    }
                }
                i3++;
                "".length();
                if ("   ".length() == ((115 ^ 48) & ((244 ^ 183) ^ (-1)))) {
                    return null;
                }
            }
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return aIVar;
    }

    private aH b(aH[] aHVarArr) {
        int length = aHVarArr.length;
        if (lIlIIlllIlIIl(length)) {
            return null;
        }
        if (lIlIIlllIIllI(length, llIIIllIll[1])) {
            return aHVarArr[llIIIllIll[0]];
        }
        aH aHVar = new aH(llIIIllIll[3]);
        int i = llIIIllIll[0];
        while (lIlIIlllIIlII(i, llIIIllIll[3])) {
            int i2 = llIIIllIll[0];
            int length2 = aHVarArr.length;
            int i3 = llIIIllIll[0];
            while (lIlIIlllIIlII(i3, length2)) {
                if (lIlIIlllIIllI(aHVarArr[i3].pI[i], llIIIllIll[2])) {
                    i2++;
                }
                i3++;
                "".length();
                if ((true ^ true) != (true ^ true)) {
                    return null;
                }
            }
            if (lIlIIlllIlIIl(i2)) {
                aHVar.pI[i] = llIIIllIll[1];
                "".length();
                if (((210 ^ 156) & ((89 ^ 23) ^ (-1))) >= (0 ^ 4)) {
                    return null;
                }
            } else if (lIlIIlllIIllI(i2, length)) {
                aHVar.pI[i] = llIIIllIll[2];
                "".length();
                if ((-(156 ^ 152)) > 0) {
                    return null;
                }
            } else {
                aHVar.pI[i] = llIIIllIll[0];
            }
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return aHVar;
    }

    private aH[] gW() {
        aH[] aHVarArr = new aH[llIIIllIll[3]];
        int i = llIIIllIll[0];
        while (lIlIIlllIIlII(i, llIIIllIll[3])) {
            aHVarArr[i] = new aH(llIIIllIll[3]);
            i++;
            "".length();
            if (((197 ^ 168) ^ (46 ^ 71)) < (-" ".length())) {
                return null;
            }
        }
        return aHVarArr;
    }
}
