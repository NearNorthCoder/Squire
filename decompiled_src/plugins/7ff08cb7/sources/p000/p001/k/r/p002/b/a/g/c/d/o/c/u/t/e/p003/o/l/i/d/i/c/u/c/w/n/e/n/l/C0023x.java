package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.x  reason: invalid package and case insensitive filesystem */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/x.class */
public class C0023x implements ab {
    public static /* synthetic */ boolean dH;
    public static /* synthetic */ boolean dK;
    private static /* synthetic */ int[] lllIIIllI;
    private static /* synthetic */ String[] lllIIIIll;
    static /* synthetic */ int dL;
    static /* synthetic */ int dk;
    public static /* synthetic */ boolean bv;
    public static /* synthetic */ List<C0003d> bx;
    public static /* synthetic */ boolean dJ;
    public static /* synthetic */ boolean dI;
    static /* synthetic */ WorldPoint dg;
    public static /* synthetic */ boolean dG;
    private static /* synthetic */ String[] cG;

    static {
        llIIIIIIIlll();
        llIIIIIIIllI();
        bx = new ArrayList();
        dg = new WorldPoint(lllIIIllI[117], lllIIIllI[118], lllIIIllI[1]);
        dL = lllIIIllI[119];
        dk = lllIIIllI[1];
        String[] strArr = new String[lllIIIllI[10]];
        strArr[lllIIIllI[1]] = lllIIIIll[lllIIIllI[120]];
        strArr[lllIIIllI[0]] = lllIIIIll[lllIIIllI[121]];
        strArr[lllIIIllI[3]] = lllIIIIll[lllIIIllI[122]];
        strArr[lllIIIllI[6]] = lllIIIIll[lllIIIllI[123]];
        strArr[lllIIIllI[4]] = lllIIIIll[lllIIIllI[124]];
        cG = strArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e6, code lost:
        if (llIIIIIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0023x.lllIIIllI[8]) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x023a, code lost:
        if (llIIIIIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0023x.lllIIIllI[3]) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x02f9, code lost:
        if (llIIIIIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0023x.lllIIIllI[4]) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (llIIIIIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0023x.lllIIIllI[8]) != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x033e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8 = new int[lllIIIllI[0]];
        iArr8[lllIIIllI[1]] = lllIIIllI[9];
        if (llIIIIIIlIIl(Bank.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[lllIIIllI[0]];
            iArr9[lllIIIllI[1]] = lllIIIllI[9];
            if (llIIIIIIlIIl(Bank.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[lllIIIllI[0]];
                iArr10[lllIIIllI[1]] = lllIIIllI[9];
            }
            iArr = new int[lllIIIllI[0]];
            iArr[lllIIIllI[1]] = lllIIIllI[7];
            if (llIIIIIIlIIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr11 = new int[lllIIIllI[0]];
                iArr11[lllIIIllI[1]] = lllIIIllI[7];
                if (llIIIIIIlIIl(Bank.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[lllIIIllI[0]];
                    iArr12[lllIIIllI[1]] = lllIIIllI[7];
                }
                iArr2 = new int[lllIIIllI[0]];
                iArr2[lllIIIllI[1]] = lllIIIllI[13];
                if (llIIIIIIlIll(Bank.contains(iArr2) ? 1 : 0)) {
                    bx.add(new C0003d(lllIIIllI[13], lllIIIllI[3], lllIIIllI[97]));
                    "".length();
                }
                iArr3 = new int[lllIIIllI[0]];
                iArr3[lllIIIllI[1]] = lllIIIllI[15];
                if (llIIIIIIlIll(Bank.contains(iArr3) ? 1 : 0)) {
                    bx.add(new C0003d(lllIIIllI[15], lllIIIllI[0], lllIIIllI[97]));
                    "".length();
                }
                iArr4 = new int[lllIIIllI[0]];
                iArr4[lllIIIllI[1]] = lllIIIllI[14];
                if (llIIIIIIlIll(Bank.contains(iArr4) ? 1 : 0)) {
                    bx.add(new C0003d(lllIIIllI[14], lllIIIllI[0], lllIIIllI[97]));
                    "".length();
                }
                iArr5 = new int[lllIIIllI[0]];
                iArr5[lllIIIllI[1]] = lllIIIllI[5];
                if (llIIIIIIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
                    int[] iArr13 = new int[lllIIIllI[0]];
                    iArr13[lllIIIllI[1]] = lllIIIllI[5];
                    if (llIIIIIIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                        int[] iArr14 = new int[lllIIIllI[0]];
                        iArr14[lllIIIllI[1]] = lllIIIllI[5];
                    }
                    if (llIIIIIIlIll(Bank.contains(item -> {
                        return item.getName().toLowerCase().contains(lllIIIIll[lllIIIllI[105]]);
                    }) ? 1 : 0)) {
                        bx.add(new C0003d(lllIIIllI[99], lllIIIllI[10], lllIIIllI[100]));
                        "".length();
                    }
                    iArr6 = new int[lllIIIllI[0]];
                    iArr6[lllIIIllI[1]] = lllIIIllI[17];
                    if (llIIIIIIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
                        int[] iArr15 = new int[lllIIIllI[0]];
                        iArr15[lllIIIllI[1]] = lllIIIllI[17];
                        if (llIIIIIIlIIl(Bank.contains(iArr15) ? 1 : 0)) {
                            int[] iArr16 = new int[lllIIIllI[0]];
                            iArr16[lllIIIllI[1]] = lllIIIllI[17];
                        }
                        iArr7 = new int[lllIIIllI[0]];
                        iArr7[lllIIIllI[1]] = lllIIIllI[12];
                        if (llIIIIIIlIIl(Bank.contains(iArr7) ? 1 : 0)) {
                            int[] iArr17 = new int[lllIIIllI[0]];
                            iArr17[lllIIIllI[1]] = lllIIIllI[12];
                            if (!llIIIIIIlIIl(Bank.contains(iArr17) ? 1 : 0)) {
                                return;
                            }
                            int[] iArr18 = new int[lllIIIllI[0]];
                            iArr18[lllIIIllI[1]] = lllIIIllI[12];
                            if (!llIIIIIIlIlI(Bank.getFirst(iArr18).getQuantity(), lllIIIllI[31])) {
                                return;
                            }
                        }
                        bx.add(new C0003d(lllIIIllI[12], lllIIIllI[33], lllIIIllI[101]));
                        "".length();
                    }
                    bx.add(new C0003d(lllIIIllI[17], lllIIIllI[4], C0009j.ch));
                    "".length();
                    iArr7 = new int[lllIIIllI[0]];
                    iArr7[lllIIIllI[1]] = lllIIIllI[12];
                    if (llIIIIIIlIIl(Bank.contains(iArr7) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(lllIIIllI[12], lllIIIllI[33], lllIIIllI[101]));
                    "".length();
                }
                bx.add(new C0003d(lllIIIllI[5], lllIIIllI[3], lllIIIllI[98]));
                "".length();
                if (llIIIIIIlIll(Bank.contains(item2 -> {
                    return item2.getName().toLowerCase().contains(lllIIIIll[lllIIIllI[105]]);
                }) ? 1 : 0)) {
                }
                iArr6 = new int[lllIIIllI[0]];
                iArr6[lllIIIllI[1]] = lllIIIllI[17];
                if (llIIIIIIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
                }
                bx.add(new C0003d(lllIIIllI[17], lllIIIllI[4], C0009j.ch));
                "".length();
                iArr7 = new int[lllIIIllI[0]];
                iArr7[lllIIIllI[1]] = lllIIIllI[12];
                if (llIIIIIIlIIl(Bank.contains(iArr7) ? 1 : 0)) {
                }
                bx.add(new C0003d(lllIIIllI[12], lllIIIllI[33], lllIIIllI[101]));
                "".length();
            }
            bx.add(new C0003d(lllIIIllI[7], lllIIIllI[8], lllIIIllI[96]));
            "".length();
            iArr2 = new int[lllIIIllI[0]];
            iArr2[lllIIIllI[1]] = lllIIIllI[13];
            if (llIIIIIIlIll(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[lllIIIllI[0]];
            iArr3[lllIIIllI[1]] = lllIIIllI[15];
            if (llIIIIIIlIll(Bank.contains(iArr3) ? 1 : 0)) {
            }
            iArr4 = new int[lllIIIllI[0]];
            iArr4[lllIIIllI[1]] = lllIIIllI[14];
            if (llIIIIIIlIll(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[lllIIIllI[0]];
            iArr5[lllIIIllI[1]] = lllIIIllI[5];
            if (llIIIIIIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
            }
            bx.add(new C0003d(lllIIIllI[5], lllIIIllI[3], lllIIIllI[98]));
            "".length();
            if (llIIIIIIlIll(Bank.contains(item22 -> {
                return item22.getName().toLowerCase().contains(lllIIIIll[lllIIIllI[105]]);
            }) ? 1 : 0)) {
            }
            iArr6 = new int[lllIIIllI[0]];
            iArr6[lllIIIllI[1]] = lllIIIllI[17];
            if (llIIIIIIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
            }
            bx.add(new C0003d(lllIIIllI[17], lllIIIllI[4], C0009j.ch));
            "".length();
            iArr7 = new int[lllIIIllI[0]];
            iArr7[lllIIIllI[1]] = lllIIIllI[12];
            if (llIIIIIIlIIl(Bank.contains(iArr7) ? 1 : 0)) {
            }
            bx.add(new C0003d(lllIIIllI[12], lllIIIllI[33], lllIIIllI[101]));
            "".length();
        }
        bx.add(new C0003d(lllIIIllI[9], lllIIIllI[8], lllIIIllI[96]));
        "".length();
        iArr = new int[lllIIIllI[0]];
        iArr[lllIIIllI[1]] = lllIIIllI[7];
        if (llIIIIIIlIIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        bx.add(new C0003d(lllIIIllI[7], lllIIIllI[8], lllIIIllI[96]));
        "".length();
        iArr2 = new int[lllIIIllI[0]];
        iArr2[lllIIIllI[1]] = lllIIIllI[13];
        if (llIIIIIIlIll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lllIIIllI[0]];
        iArr3[lllIIIllI[1]] = lllIIIllI[15];
        if (llIIIIIIlIll(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[lllIIIllI[0]];
        iArr4[lllIIIllI[1]] = lllIIIllI[14];
        if (llIIIIIIlIll(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lllIIIllI[0]];
        iArr5[lllIIIllI[1]] = lllIIIllI[5];
        if (llIIIIIIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
        }
        bx.add(new C0003d(lllIIIllI[5], lllIIIllI[3], lllIIIllI[98]));
        "".length();
        if (llIIIIIIlIll(Bank.contains(item222 -> {
            return item222.getName().toLowerCase().contains(lllIIIIll[lllIIIllI[105]]);
        }) ? 1 : 0)) {
        }
        iArr6 = new int[lllIIIllI[0]];
        iArr6[lllIIIllI[1]] = lllIIIllI[17];
        if (llIIIIIIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
        }
        bx.add(new C0003d(lllIIIllI[17], lllIIIllI[4], C0009j.ch));
        "".length();
        iArr7 = new int[lllIIIllI[0]];
        iArr7[lllIIIllI[1]] = lllIIIllI[12];
        if (llIIIIIIlIIl(Bank.contains(iArr7) ? 1 : 0)) {
        }
        bx.add(new C0003d(lllIIIllI[12], lllIIIllI[33], lllIIIllI[101]));
        "".length();
    }

    private static String lIllllllIIll(String lllllIIlIlIll, String lllllIIlIlIlI) {
        String lllllIIlIlIll2 = new String(Base64.getDecoder().decode(lllllIIlIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllIIlIlIII = lllllIIlIlIlI.toCharArray();
        int lllllIIlIIlll = lllIIIllI[1];
        char[] charArray = lllllIIlIlIll2.toCharArray();
        int length = charArray.length;
        int i = lllIIIllI[1];
        while (llIIIIIIlIlI(i, length)) {
            char lllllIIlIllII = charArray[i];
            sb.append((char) (lllllIIlIllII ^ lllllIIlIlIII[lllllIIlIIlll % lllllIIlIlIII.length]));
            "".length();
            lllllIIlIIlll++;
            i++;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIllllllIlII(String lllllIIIIlIIl, String lllllIIIIlIII) {
        try {
            SecretKeySpec lllllIIIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllIIIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllIIIIlIll = Cipher.getInstance("Blowfish");
            lllllIIIIlIll.init(lllIIIllI[3], lllllIIIIllII);
            return new String(lllllIIIIlIll.doFinal(Base64.getDecoder().decode(lllllIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllIIIIlIlI) {
            lllllIIIIlIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (llIIIIIlIlII(C0004e.j(dL), lllIIIllI[104])) {
            ?? r0 = lllIIIllI[0];
            "".length();
            return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIIIllI[1];
    }

    private static boolean llIIIIIlIIIl(int i, int i2) {
        return i != i2;
    }

    private static boolean llIIIIIIlIlI(int i, int i2) {
        return i < i2;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            bf();
            "".length();
            if ("  ".length() <= 0) {
                return ((242 ^ 185) ^ (57 ^ 78)) & (((((53 + 102) - 103) + 92) ^ (((151 + 21) - 169) + 169)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lllIIIllI[102];
    }

    private static boolean llIIIIIIllII(Object obj) {
        return obj != null;
    }

    private static boolean llIIIIIIllIl(int i) {
        return i > 0;
    }

    private static int llIIIIIIlIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return lllIIIIll[lllIIIllI[103]];
    }

    private static boolean llIIIIIIlIll(int i) {
        return i == 0;
    }

    private static void llIIIIIIIlll() {
        lllIIIllI = new int[126];
        lllIIIllI[0] = " ".length();
        lllIIIllI[1] = ((123 ^ 8) ^ (135 ^ 167)) & (((44 ^ 36) ^ (74 ^ 17)) ^ (-" ".length()));
        lllIIIllI[2] = (-((-5779) & 32471)) & (-50) & 31741;
        lllIIIllI[3] = "  ".length();
        lllIIIllI[4] = 191 ^ 187;
        lllIIIllI[5] = (-((-17165) & 29551)) & (-16385) & 32623;
        lllIIIllI[6] = "   ".length();
        lllIIIllI[7] = (-22019) & 24327;
        lllIIIllI[8] = (16 ^ 7) ^ (221 ^ 192);
        lllIIIllI[9] = (-((-73) & 21211)) & (-8225) & 29695;
        lllIIIllI[10] = (42 ^ 4) ^ (186 ^ 145);
        lllIIIllI[11] = 134 ^ 129;
        lllIIIllI[12] = (-((-19281) & 27513)) & (-16385) & 32623;
        lllIIIllI[13] = (-((-1059) & 31907)) & (-9) & 32761;
        lllIIIllI[14] = (-8193) & 10220;
        lllIIIllI[15] = (-1617) & 3967;
        lllIIIllI[16] = (108 ^ 115) ^ (50 ^ 43);
        lllIIIllI[17] = (-((-593) & 2807)) & (-521) & 15359;
        lllIIIllI[18] = (-1025) & 2019;
        lllIIIllI[19] = (-101) & 15100;
        lllIIIllI[20] = (151 ^ 145) ^ (138 ^ 190);
        lllIIIllI[21] = 18 ^ 10;
        lllIIIllI[22] = (166 ^ 189) ^ (131 ^ 144);
        lllIIIllI[23] = 182 ^ 191;
        lllIIIllI[24] = (((34 + 94) - 59) + 62) ^ (((4 + 86) - (-6)) + 40);
        lllIIIllI[25] = (210 ^ 161) ^ (((43 + 59) - 31) + 56);
        lllIIIllI[26] = (((186 + 57) - 195) + 152) ^ (((113 + 188) - 155) + 51);
        lllIIIllI[27] = 42 ^ 52;
        lllIIIllI[28] = (-((-18501) & 27886)) & (-20483) & 32767;
        lllIIIllI[29] = (-8209) & 11775;
        lllIIIllI[30] = (68 ^ 76) ^ (112 ^ 118);
        lllIIIllI[31] = 161 ^ 174;
        lllIIIllI[32] = (((31 + 23) - (-75)) + 37) ^ (((7 + 156) - 9) + 24);
        lllIIIllI[33] = 17 ^ 57;
        lllIIIllI[34] = (-9345) & 12250;
        lllIIIllI[35] = (-12329) & 15869;
        lllIIIllI[36] = 39 ^ 55;
        lllIIIllI[37] = (28 ^ 77) ^ (130 ^ 194);
        lllIIIllI[38] = (92 ^ 29) ^ (113 ^ 34);
        lllIIIllI[39] = 31 ^ 12;
        lllIIIllI[40] = (((93 + 150) - 180) + 182) ^ (((107 + 98) - 201) + 146);
        lllIIIllI[41] = (59 ^ 125) ^ (14 ^ 93);
        lllIIIllI[42] = (((103 + 30) - 50) + 109) ^ (((66 + 21) - 16) + 94);
        lllIIIllI[43] = (((27 + 40) - 17) + 94) ^ (((10 + 13) - (-31)) + 86);
        lllIIIllI[44] = (111 ^ 88) ^ ((17 ^ 55) & ((68 ^ 98) ^ (-1)));
        lllIIIllI[45] = 96 ^ 118;
        lllIIIllI[46] = 166 ^ 177;
        lllIIIllI[47] = (103 ^ 72) ^ (180 ^ 167);
        lllIIIllI[48] = (-((-10607) & 28159)) & (-1) & 20447;
        lllIIIllI[49] = (-" ".length()) & (-8209) & 11771;
        lllIIIllI[50] = (180 ^ 165) ^ (146 ^ 154);
        lllIIIllI[51] = 83 ^ 73;
        lllIIIllI[52] = 36 ^ 63;
        lllIIIllI[53] = (-21011) & 24119;
        lllIIIllI[54] = (-((-12293) & 13142)) & (-16521) & 20479;
        lllIIIllI[55] = (85 ^ 7) ^ (54 ^ 121);
        lllIIIllI[56] = (-((-3219) & 28635)) & (-17) & 28543;
        lllIIIllI[57] = (-((-25765) & 26597)) & (-21) & 3964;
        lllIIIllI[58] = (52 ^ 96) ^ (229 ^ 174);
        lllIIIllI[59] = (-((-18085) & 30453)) & (-775) & 16255;
        lllIIIllI[60] = 152 ^ 184;
        lllIIIllI[61] = 71 ^ 1;
        lllIIIllI[62] = (((20 + 103) - 75) + 114) ^ (((95 + 45) - 128) + 119);
        lllIIIllI[63] = (((61 + 178) - 92) + 42) ^ (((17 + 133) - 125) + 134);
        lllIIIllI[64] = (((37 + 56) - 43) + 84) ^ (((38 + 53) - 79) + 153);
        lllIIIllI[65] = (-((-19459) & 27799)) & (-20545) & 31742;
        lllIIIllI[66] = (-((-16393) & 16909)) & (-8195) & 12287;
        lllIIIllI[67] = 154 ^ 190;
        lllIIIllI[68] = 127 ^ 90;
        lllIIIllI[69] = 78 ^ 104;
        lllIIIllI[70] = (((76 + 103) - 134) + 90) ^ (((49 + 134) - 86) + 63);
        lllIIIllI[71] = (181 ^ 137) ^ (77 ^ 88);
        lllIIIllI[72] = 33 ^ 11;
        lllIIIllI[73] = 164 ^ 143;
        lllIIIllI[74] = (-25730) & 28549;
        lllIIIllI[75] = (-4115) & 7670;
        lllIIIllI[76] = 152 ^ 180;
        lllIIIllI[77] = (112 ^ 124) ^ (2 ^ 35);
        lllIIIllI[78] = 155 ^ 181;
        lllIIIllI[79] = (-16530) & 19449;
        lllIIIllI[80] = (-4107) & 7679;
        lllIIIllI[81] = 178 ^ 157;
        lllIIIllI[82] = (169 ^ 150) ^ (145 ^ 158);
        lllIIIllI[83] = 1 ^ 48;
        lllIIIllI[84] = (20 ^ 78) ^ (33 ^ 72);
        lllIIIllI[85] = (39 ^ 11) ^ (157 ^ 133);
        lllIIIllI[86] = 25 ^ 44;
        lllIIIllI[87] = 81 ^ 103;
        lllIIIllI[88] = 39 ^ 31;
        lllIIIllI[89] = (((51 + 61) - 85) + 129) ^ (((158 + 103) - 115) + 19);
        lllIIIllI[90] = 27 ^ 33;
        lllIIIllI[91] = (-25669) & 28542;
        lllIIIllI[92] = (-((-10133) & 26589)) & (-12577) & 32639;
        lllIIIllI[93] = 71 ^ 124;
        lllIIIllI[94] = 11 ^ 54;
        lllIIIllI[95] = (((61 + 10) - (-51)) + 61) ^ (((89 + 91) - 175) + 132);
        lllIIIllI[96] = (-((-17045) & 32407)) & (-16385) & 32766;
        lllIIIllI[97] = (-20545) & 32764;
        lllIIIllI[98] = (-((-5207) & 30423)) & (-17) & 30452;
        lllIIIllI[99] = (-16673) & 28652;
        lllIIIllI[100] = (-((-30081) & 32723)) & (-4097) & 31738;
        lllIIIllI[101] = (-((-8082) & 32757)) & (-4121) & 29695;
        lllIIIllI[102] = (((204 + 116) - 303) + 202) ^ (((28 + 131) - 110) + 142);
        lllIIIllI[103] = "  ".length() ^ (151 ^ 170);
        lllIIIllI[104] = (243 ^ 143) ^ (12 ^ 32);
        lllIIIllI[105] = (((64 + 71) - 87) + 82) ^ (((146 + 115) - 150) + 83);
        lllIIIllI[106] = (120 ^ 106) ^ (68 ^ 23);
        lllIIIllI[107] = (-16898) & 20461;
        lllIIIllI[108] = 61 ^ 127;
        lllIIIllI[109] = 7 ^ 68;
        lllIIIllI[110] = (-21009) & 24570;
        lllIIIllI[111] = 120 ^ 60;
        lllIIIllI[112] = (-5297) & 8190;
        lllIIIllI[113] = 193 ^ 132;
        lllIIIllI[114] = "  ".length() ^ (125 ^ 56);
        lllIIIllI[115] = (-((-6705) & 32445)) & (-33) & 28670;
        lllIIIllI[116] = (-((-3155) & 28251)) & (-4115) & 32767;
        lllIIIllI[117] = (-20482) & 23377;
        lllIIIllI[118] = (-16946) & 20473;
        lllIIIllI[119] = (-((-306) & 15863)) & (-513) & 16383;
        lllIIIllI[120] = (((191 + 0) - 156) + 171) ^ (((65 + 69) - 72) + 72);
        lllIIIllI[121] = 12 ^ 69;
        lllIIIllI[122] = 21 ^ 95;
        lllIIIllI[123] = (((117 + 145) - 251) + 188) ^ (((61 + 25) - 54) + 108);
        lllIIIllI[124] = 195 ^ 143;
        lllIIIllI[125] = 33 ^ 108;
    }

    private static boolean llIIIIIlIIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean llIIIIIIlllI(int i) {
        return i < 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return lllIIIllI[1];
    }

    private static boolean llIIIIIIlIIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[lllIIIllI[11]];
        iArr[lllIIIllI[1]] = lllIIIllI[12];
        iArr[lllIIIllI[0]] = lllIIIllI[7];
        iArr[lllIIIllI[3]] = lllIIIllI[9];
        iArr[lllIIIllI[6]] = lllIIIllI[13];
        iArr[lllIIIllI[4]] = lllIIIllI[14];
        iArr[lllIIIllI[10]] = lllIIIllI[15];
        iArr[lllIIIllI[16]] = lllIIIllI[17];
        int i = lllIIIllI[1];
        while (llIIIIIIlIlI(i, iArr.length)) {
            int[] iArr2 = new int[lllIIIllI[0]];
            iArr2[lllIIIllI[1]] = iArr[i];
            if (llIIIIIIlIll(Inventory.contains(iArr2) ? 1 : 0)) {
                return lllIIIllI[1];
            }
            i++;
            "".length();
            if (((60 ^ 79) ^ (77 ^ 58)) <= "  ".length()) {
                return ((127 ^ 74) ^ (40 ^ 8)) & (((220 ^ 129) ^ (249 ^ 177)) ^ (-" ".length()));
            }
        }
        return lllIIIllI[0];
    }

    private static boolean llIIIIIlIlII(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIIIIIIllll(int i, int i2) {
        return i > i2;
    }

    private static boolean llIIIIIlIIII(int i, int i2) {
        return i <= i2;
    }

    private static String lIllllllIlll(String lllllIIIlIllI, String lllllIIIlIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllIIIlIlIl.getBytes(StandardCharsets.UTF_8)), lllIIIllI[22]), "DES");
            Cipher lllllIIIllIII = Cipher.getInstance("DES");
            lllllIIIllIII.init(lllIIIllI[3], secretKeySpec);
            return new String(lllllIIIllIII.doFinal(Base64.getDecoder().decode(lllllIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllIIIlIlll) {
            lllllIIIlIlll.printStackTrace();
            return null;
        }
    }

    private static void llIIIIIIIllI() {
        lllIIIIll = new String[lllIIIllI[125]];
        lllIIIIll[lllIIIllI[1]] = lIllllllIIll("Hx4NOSAxEgdwMSwOCj40eR4XNT4qW0MjJDADADg6NxBDMjI6HEMkPHkGFjUgLQ==", "YwcPS");
        lllIIIIll[lllIIIllI[0]] = lIllllllIlII("CTvfOFswhxm4FQDpV/DHdg==", "elmct");
        lllIIIIll[lllIIIllI[3]] = lIllllllIlII("WsrxWgbUTQ3Wq6bzKSzNQGJwedF2m8Jh", "tLXRS");
        lllIIIIll[lllIIIllI[6]] = lIllllllIlII("wEBcoI0NjAedTOcvTkAyg7k+YZHkxG6nlzUCoSaUAy7hLn9J1g1tPILn4x+Y8M0bVrPp2amOkGs=", "QaXly");
        lllIIIIll[lllIIIllI[4]] = lIllllllIIll("OShnOCILbSowIx0kKT5wHzgiKiROPjIpIAIkIip8Tj4wMCQNJS43N045KHkSOxQOFxc=", "nMGYP");
        lllIIIIll[lllIIIllI[10]] = lIllllllIlll("WvFKqznlDznCKbHqROqBmlvnrhwAlFdV62WmZHfr/1yTAFj+/lmUmhLym45Z0Vddgp9OldcJEJs=", "UBjDe");
        lllIIIIll[lllIIIllI[16]] = lIllllllIlll("JS1E5nx1Cki3V9NcsZOkv+lu/3VPAUei0ti03a8B2zmI++z3JALBLm2r+a6mygPGVdOfEIEg+IY=", "OftEg");
        lllIIIIll[lllIIIllI[11]] = lIllllllIIll("KggPFB8=", "nzfzt");
        lllIIIIll[lllIIIllI[22]] = lIllllllIIll("CjUsAz0=", "NGEmV");
        lllIIIIll[lllIIIllI[23]] = lIllllllIlII("5HC/FEl71Zg=", "gSPil");
        lllIIIIll[lllIIIllI[8]] = lIllllllIlII("lJ2cuLsXVI8=", "oiUES");
        lllIIIIll[lllIIIllI[24]] = lIllllllIlll("RKqBQDUfXTs=", "lhhvv");
        lllIIIIll[lllIIIllI[25]] = lIllllllIIll("ATAdQSYgcRgVMz0l", "OQkaR");
        lllIIIIll[lllIIIllI[26]] = lIllllllIIll("AxUMOiUzGA==", "GpbOI");
        lllIIIIll[lllIIIllI[30]] = lIllllllIlll("Y7KaLW0j9U/l8LZBN/IZYw==", "uBkfg");
        lllIIIIll[lllIIIllI[31]] = lIllllllIIll("HSkpGxw7", "XFAiu");
        lllIIIIll[lllIIIllI[36]] = lIllllllIlII("fS/piUh8JCYgwxOiL+VMIQ==", "auoao");
        lllIIIIll[lllIIIllI[37]] = lIllllllIIll("PgMRPhgS", "vbcQt");
        lllIIIIll[lllIIIllI[38]] = lIllllllIlII("4UAwa6t2nOQ=", "zujFy");
        lllIIIIll[lllIIIllI[39]] = lIllllllIlll("qmKvkqgr+14XA8VicExryMahWl2WXFs5", "ekTyw");
        lllIIIIll[lllIIIllI[32]] = lIllllllIlll("8skXzty8GhU=", "VXlgm");
        lllIIIIll[lllIIIllI[41]] = lIllllllIlII("0TOI7+jF8e5fmwv334VcrPh/9iV7iZtNZ1IH7/QzQM8=", "frHBM");
        lllIIIIll[lllIIIllI[45]] = lIllllllIlII("XPkplG4HRlc=", "MKOqg");
        lllIIIIll[lllIIIllI[46]] = lIllllllIlII("TV78iGmU6/4=", "gkwOu");
        lllIIIIll[lllIIIllI[21]] = lIllllllIlII("TunK1ZDqn+k=", "LwQeu");
        lllIIIIll[lllIIIllI[50]] = lIllllllIlII("wvFkVyVXvbfJU9yTMYjOcA==", "bcfTY");
        lllIIIIll[lllIIIllI[51]] = lIllllllIlII("1VLjOzmDu/6XbR2pZnhjNw==", "ChZdk");
        lllIIIIll[lllIIIllI[52]] = lIllllllIlll("sRx2dL0ijyY=", "bfDsN");
        lllIIIIll[lllIIIllI[43]] = lIllllllIlII("LxaAcelHQFM=", "ffetn");
        lllIIIIll[lllIIIllI[55]] = lIllllllIIll("IjI/IA==", "vSTEe");
        lllIIIIll[lllIIIllI[27]] = lIllllllIlll("rKwYP8wATCA=", "yeGWO");
        lllIIIIll[lllIIIllI[58]] = lIllllllIlII("YXFYqQYz+gU=", "Rnmks");
        lllIIIIll[lllIIIllI[60]] = lIllllllIIll("OQkKMQ==", "mhaTZ");
        lllIIIIll[lllIIIllI[62]] = lIllllllIlll("o1yeY2F2EUc4IW58Hq6I3g==", "EPUDU");
        lllIIIIll[lllIIIllI[63]] = lIllllllIlII("zTP9tIisMndWzBoiZHl3iw==", "yqvHW");
        lllIIIIll[lllIIIllI[64]] = lIllllllIlll("zVe9VFSo09E=", "YkZeG");
        lllIIIIll[lllIIIllI[67]] = lIllllllIIll("BgcHegwnRhI7Di0=", "HfqZx");
        lllIIIIll[lllIIIllI[68]] = lIllllllIIll("NCQOHHAyKwwLMRkmHQ==", "wExyP");
        lllIIIIll[lllIIIllI[69]] = lIllllllIlII("cEU7T+AVJ7k=", "TltQO");
        lllIIIIll[lllIIIllI[70]] = lIllllllIIll("GzEADA==", "HPbmU");
        lllIIIIll[lllIIIllI[33]] = lIllllllIlll("kUJNExqZOsc=", "cewQV");
        lllIIIIll[lllIIIllI[71]] = lIllllllIlII("0GRfWQ/0eqwXtI4nwXfAqPB6Less07qFXBe3rV2TrJ6Y5TXxbhA60/CY2zpSP4E2", "cqseF");
        lllIIIIll[lllIIIllI[72]] = lIllllllIlll("q36omlEJhrSp1O1CYdVWqw==", "joMFE");
        lllIIIIll[lllIIIllI[73]] = lIllllllIIll("KxU9GgwBFzNXDAcWIAQ=", "hyTwn");
        lllIIIIll[lllIIIllI[76]] = lIllllllIIll("KDsHVjkJeiUTIxwzHxE=", "fZqvM");
        lllIIIIll[lllIIIllI[77]] = lIllllllIIll("HhIUKhMkEA==", "JwzPz");
        lllIIIIll[lllIIIllI[78]] = lIllllllIIll("OiIcGgwQIBJXDBYhAQQ=", "yNuwn");
        lllIIIIll[lllIIIllI[81]] = lIllllllIlII("/gbDgAijT2Ag7C+DgZiFvQ==", "lOKgc");
        lllIIIIll[lllIIIllI[82]] = lIllllllIIll("AxsIPRgmAA==", "GnfNl");
        lllIIIIll[lllIIIllI[83]] = lIllllllIlll("Tkmfu31RLX9J8Tx2n5htPQ==", "qyJPs");
        lllIIIIll[lllIIIllI[20]] = lIllllllIIll("NychPgsHKg==", "sBOKg");
        lllIIIIll[lllIIIllI[84]] = lIllllllIlII("4x/lu28k/eyv9etnqgISTQ==", "LjYpY");
        lllIIIIll[lllIIIllI[85]] = lIllllllIlII("52Btgo7iwUA=", "JUAtw");
        lllIIIIll[lllIIIllI[86]] = lIllllllIlII("YvF0lJrU4JWx/cZoru8KtA==", "NNNcR");
        lllIIIIll[lllIIIllI[87]] = lIllllllIlII("3AVXQtO33EFcbUjVqW7Qtg==", "PvpqP");
        lllIIIIll[lllIIIllI[44]] = lIllllllIIll("Di8/Fzg0LQ==", "ZJQmQ");
        lllIIIIll[lllIIIllI[88]] = lIllllllIlII("p5IcsB6xwtPIs8dmAyBNAw==", "bZYbT");
        lllIIIIll[lllIIIllI[89]] = lIllllllIIll("JgQdGCgcBg==", "rasbA");
        lllIIIIll[lllIIIllI[90]] = lIllllllIlII("ibUPMV1hVk3EQn+AZ1nnxQ==", "vSdoH");
        lllIIIIll[lllIIIllI[93]] = lIllllllIlII("WG3Wq9fmMszQTTdx8V5yeA==", "MivdP");
        lllIIIIll[lllIIIllI[47]] = lIllllllIIll("ISIybCQAYzc4MR03", "oCDLP");
        lllIIIIll[lllIIIllI[94]] = lIllllllIlll("NMV4QnF3IIo=", "zQYmV");
        lllIIIIll[lllIIIllI[95]] = lIllllllIlII("xmX20vQYUsPr++2HgzMqHg==", "ScVRB");
        lllIIIIll[lllIIIllI[103]] = lIllllllIlII("90SbPShMgpgqYopFqECkBg==", "SLwdF");
        lllIIIIll[lllIIIllI[105]] = lIllllllIIll("Kgc3DU83CHkdCjkCLQJPcA==", "XnYjo");
        lllIIIIll[lllIIIllI[106]] = lIllllllIlll("rlROKkE72uEjvt28IDa/fQ==", "WIBGK");
        lllIIIIll[lllIIIllI[108]] = lIllllllIlll("vjWP0y0NMOUxatDvviH4WA==", "cQvsR");
        lllIIIIll[lllIIIllI[109]] = lIllllllIlll("MffjN4y7q82/POHvzrPl1w==", "OjaFD");
        lllIIIIll[lllIIIllI[111]] = lIllllllIIll("PAcYKx9PPhImEg4dHjYX", "oswEz");
        lllIIIIll[lllIIIllI[113]] = lIllllllIlII("ZuZY8xYeV+vIbenL5a8diQ==", "pIhIR");
        lllIIIIll[lllIIIllI[61]] = lIllllllIIll("CiMmCA==", "nLIzT");
        lllIIIIll[lllIIIllI[114]] = lIllllllIIll("DRkkKQ==", "BiAGo");
        lllIIIIll[lllIIIllI[120]] = lIllllllIlll("+Xg7SXDerS4=", "LrbnD");
        lllIIIIll[lllIIIllI[121]] = lIllllllIlII("J34hIvyBc+MhF0+YLugx2KHBnbwEJToi0fCxUQDEf2s=", "whomf");
        lllIIIIll[lllIIIllI[122]] = lIllllllIlII("PIn+I4NlWGrVhSWSWnYA9XiMASosRHLfPzsI7EQM1/OaQewnOjfPJEMIc+dsv5ZSUGkWFwUuVgY=", "Tdrae");
        lllIIIIll[lllIIIllI[123]] = lIllllllIlll("aIYD3ghX64XZjCT9zYauE7AEuG+/0OOFRuiXKpycs4Fr4Jmz9NAmuu2RDTJKkij5", "fIEEJ");
        lllIIIIll[lllIIIllI[124]] = lIllllllIlll("4X6CZ98PvgqI9p2Um//FAlaSog873JeKI8FOc73jUOQ=", "PdmGK");
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x06b3, code lost:
        if (llIIIIIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L122;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v154, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v731, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v740, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v749, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v752, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v774, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v83, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v95, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v100, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v190, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v202, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v208, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v213, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v222, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v78, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v88, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bf() {
        if (llIIIIIIlIIl(bv ? 1 : 0)) {
            C0001b.a(bx);
            if (llIIIIIIlIlI(bx.size(), lllIIIllI[0])) {
                System.out.println(lllIIIIll[lllIIIllI[1]]);
                bv = lllIIIllI[1];
            }
        }
        if (llIIIIIIlIll(bv ? 1 : 0)) {
            if (llIIIIIIlIll(an() ? 1 : 0) && llIIIIIIlIlI(C0004e.j(dL), lllIIIllI[0])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIIIIIllII(nearest) && llIIIIIIlIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllIIIIll[lllIIIllI[0]];
                    C0000a.a(nearest);
                }
                if (llIIIIIIllII(nearest) && llIIIIIIlIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIIIIIIlIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIIIllI[2]);
                        "".length();
                    }
                    if (llIIIIIIlIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = lllIIIIll[lllIIIllI[3]];
                        if (llIIIIIIllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllIIIllI[4]);
                            "".length();
                        }
                        if (llIIIIIIllIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllIIIllI[3]);
                            "".length();
                        }
                        int[] iArr = new int[lllIIIllI[0]];
                        iArr[lllIIIllI[1]] = lllIIIllI[5];
                        if (llIIIIIIlIll(Bank.contains(iArr) ? 1 : 0)) {
                            Q();
                            System.out.println(lllIIIIll[lllIIIllI[6]]);
                            bv = lllIIIllI[0];
                            return;
                        }
                        int[] iArr2 = new int[lllIIIllI[0]];
                        iArr2[lllIIIllI[1]] = lllIIIllI[7];
                        if (llIIIIIIlIIl(Bank.contains(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[lllIIIllI[0]];
                            iArr3[lllIIIllI[1]] = lllIIIllI[7];
                            if (llIIIIIIlIlI(Bank.getFirst(iArr3).getQuantity(), lllIIIllI[8])) {
                                Q();
                                System.out.println(lllIIIIll[lllIIIllI[4]]);
                                bv = lllIIIllI[0];
                                return;
                            }
                        }
                        int[] iArr4 = new int[lllIIIllI[0]];
                        iArr4[lllIIIllI[1]] = lllIIIllI[9];
                        if (llIIIIIIlIIl(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lllIIIllI[0]];
                            iArr5[lllIIIllI[1]] = lllIIIllI[9];
                            if (llIIIIIIlIlI(Bank.getFirst(iArr5).getQuantity(), lllIIIllI[8])) {
                                Q();
                                System.out.println(lllIIIIll[lllIIIllI[10]]);
                                bv = lllIIIllI[0];
                                return;
                            }
                        }
                        int[] iArr6 = new int[lllIIIllI[11]];
                        iArr6[lllIIIllI[1]] = lllIIIllI[12];
                        iArr6[lllIIIllI[0]] = lllIIIllI[7];
                        iArr6[lllIIIllI[3]] = lllIIIllI[9];
                        iArr6[lllIIIllI[6]] = lllIIIllI[13];
                        iArr6[lllIIIllI[4]] = lllIIIllI[14];
                        iArr6[lllIIIllI[10]] = lllIIIllI[15];
                        iArr6[lllIIIllI[16]] = lllIIIllI[17];
                        if (llIIIIIIlIll(C0004e.d(iArr6) ? 1 : 0)) {
                            Q();
                            System.out.println(lllIIIIll[lllIIIllI[16]]);
                            bv = lllIIIllI[0];
                            return;
                        }
                        int[] iArr7 = new int[lllIIIllI[11]];
                        iArr7[lllIIIllI[1]] = lllIIIllI[12];
                        iArr7[lllIIIllI[0]] = lllIIIllI[7];
                        iArr7[lllIIIllI[3]] = lllIIIllI[9];
                        iArr7[lllIIIllI[6]] = lllIIIllI[13];
                        iArr7[lllIIIllI[4]] = lllIIIllI[14];
                        iArr7[lllIIIllI[10]] = lllIIIllI[15];
                        iArr7[lllIIIllI[16]] = lllIIIllI[17];
                        if (llIIIIIIlIIl(C0004e.d(iArr7) ? 1 : 0)) {
                            if (llIIIIIIllIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(lllIIIllI[4]);
                                "".length();
                            }
                            C0000a.a(lllIIIllI[17], lllIIIllI[0]);
                            C0000a.a(lllIIIllI[12], lllIIIllI[8]);
                            C0000a.a(lllIIIllI[5], lllIIIllI[0]);
                            C0000a.a(lllIIIllI[15], lllIIIllI[0]);
                            C0000a.a(lllIIIllI[13], lllIIIllI[0]);
                            C0000a.a(lllIIIllI[14], lllIIIllI[0]);
                            C0000a.a(lllIIIllI[9], lllIIIllI[8]);
                            C0000a.a(lllIIIllI[7], lllIIIllI[8]);
                            C0000a.a(lllIIIllI[18], lllIIIllI[19]);
                        }
                    }
                }
            }
            if (llIIIIIIlIIl(Inventory.contains(C0005f.bc) ? 1 : 0) && llIIIIIIlIlI(Movement.getRunEnergy(), lllIIIllI[20])) {
                Inventory.getFirst(C0005f.bc).interact(lllIIIIll[lllIIIllI[11]]);
                Time.sleepTicks(lllIIIllI[0]);
                "".length();
            }
            if (llIIIIIIlIIl(Inventory.contains(C0005f.aZ) ? 1 : 0) && llIIIIIIlIlI(Prayers.getPoints(), lllIIIllI[21])) {
                Inventory.getFirst(C0005f.aZ).interact(lllIIIIll[lllIIIllI[22]]);
            }
            if (llIIIIIIlllI(llIIIIIIlIII(C0004e.w(), 60.0d))) {
                String[] strArr = new String[lllIIIllI[0]];
                strArr[lllIIIllI[1]] = lllIIIIll[lllIIIllI[23]];
                if (llIIIIIIlIIl(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lllIIIllI[0]];
                    strArr2[lllIIIllI[1]] = lllIIIIll[lllIIIllI[8]];
                    Inventory.getFirst(strArr2).interact(lllIIIIll[lllIIIllI[24]]);
                    Time.sleepTicks(lllIIIllI[3]);
                    "".length();
                }
            }
            if (llIIIIIIlIIl(an() ? 1 : 0) && llIIIIIIlIll(C0004e.j(dL))) {
                if (llIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(dg), lllIIIllI[22])) {
                    AccBuilderGWD.c = lllIIIIll[lllIIIllI[25]];
                    if (llIIIIIIlIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    C0004e.l(lllIIIllI[5]);
                    Movement.walkTo(dg);
                    "".length();
                    Time.sleepTicks(lllIIIllI[0]);
                    "".length();
                }
                if (llIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(dg), lllIIIllI[22])) {
                    C0006g.a(lllIIIIll[lllIIIllI[26]], cG, lllIIIllI[0]);
                }
            }
            if (!llIIIIIlIIIl(C0004e.j(dL), lllIIIllI[8]) || llIIIIIlIIlI(C0004e.j(dL), lllIIIllI[27])) {
                WorldPoint worldPoint = new WorldPoint(lllIIIllI[28], lllIIIllI[29], lllIIIllI[0]);
                dk = lllIIIllI[1];
                if (llIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lllIIIllI[22])) {
                    AccBuilderGWD.c = lllIIIIll[lllIIIllI[30]];
                    Movement.walkTo(worldPoint);
                    "".length();
                    Time.sleepTicks(lllIIIllI[0]);
                    "".length();
                }
                if (llIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lllIIIllI[22])) {
                    C0006g.a(lllIIIIll[lllIIIllI[31]], cG, lllIIIllI[0]);
                }
            }
            if (!llIIIIIlIIIl(C0004e.j(dL), lllIIIllI[32]) || llIIIIIlIIlI(C0004e.j(dL), lllIIIllI[33])) {
                WorldPoint worldPoint2 = new WorldPoint(lllIIIllI[34], lllIIIllI[35], lllIIIllI[0]);
                if (llIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lllIIIllI[22])) {
                    AccBuilderGWD.c = lllIIIIll[lllIIIllI[36]];
                    Movement.walkTo(worldPoint2);
                    "".length();
                    Time.sleepTicks(lllIIIllI[0]);
                    "".length();
                }
                if (llIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lllIIIllI[22])) {
                    C0006g.a(lllIIIIll[lllIIIllI[37]], cG, lllIIIllI[0]);
                }
            }
            if (llIIIIIlIIlI(C0004e.j(dL), lllIIIllI[20])) {
                int[] iArr8 = new int[lllIIIllI[0]];
                iArr8[lllIIIllI[1]] = lllIIIllI[13];
                if (llIIIIIIlIll(Inventory.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[lllIIIllI[0]];
                    iArr9[lllIIIllI[1]] = lllIIIllI[14];
                }
                String str = lllIIIIll[lllIIIllI[38]];
                String[] strArr3 = new String[lllIIIllI[0]];
                strArr3[lllIIIllI[1]] = lllIIIIll[lllIIIllI[39]];
                C0006g.a(str, strArr3, lllIIIllI[0]);
                int[] iArr10 = new int[lllIIIllI[0]];
                iArr10[lllIIIllI[1]] = lllIIIllI[13];
                if (llIIIIIIlIll(Inventory.contains(iArr10) ? 1 : 0)) {
                    int[] iArr11 = new int[lllIIIllI[0]];
                    iArr11[lllIIIllI[1]] = lllIIIllI[14];
                    if (llIIIIIIlIll(Inventory.contains(iArr11) ? 1 : 0)) {
                        if (llIIIIIIlIIl(Widgets.get(lllIIIllI[40]).isEmpty() ? 1 : 0)) {
                            if (llIIIIIIlIll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                                String str2 = lllIIIIll[lllIIIllI[32]];
                                String[] strArr4 = new String[lllIIIllI[0]];
                                strArr4[lllIIIllI[1]] = lllIIIIll[lllIIIllI[41]];
                                C0006g.a(str2, strArr4, lllIIIllI[0]);
                            }
                            if (llIIIIIIlIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
                                Dialog.enterAmount(lllIIIllI[42]);
                            }
                        }
                        if (llIIIIIIlIll(Widgets.get(lllIIIllI[40]).isEmpty() ? 1 : 0)) {
                            Widget widget = Widgets.get(lllIIIllI[40], lllIIIllI[43]);
                            Widget widget2 = Widgets.get(lllIIIllI[40], lllIIIllI[27]);
                            if (llIIIIIIllII(widget)) {
                                Time.sleepTicks(lllIIIllI[0]);
                                "".length();
                                Mouse.click(Widgets.get(lllIIIllI[40], lllIIIllI[43]).getClickPoint().getX(), Widgets.get(lllIIIllI[40], lllIIIllI[43]).getClickPoint().getY(), (boolean) lllIIIllI[0]);
                                Time.sleepTicks(lllIIIllI[3]);
                                "".length();
                            }
                            if (llIIIIIIllII(widget2)) {
                                Time.sleepTicks(lllIIIllI[0]);
                                "".length();
                                Mouse.click(Widgets.get(lllIIIllI[40], lllIIIllI[27]).getClickPoint().getX(), Widgets.get(lllIIIllI[40], lllIIIllI[27]).getClickPoint().getY(), (boolean) lllIIIllI[0]);
                                Time.sleepTicks(lllIIIllI[3]);
                                "".length();
                            }
                        }
                    }
                }
                C0006g.a(cG);
            }
            if (llIIIIIlIIlI(C0004e.j(dL), lllIIIllI[44])) {
                String[] strArr5 = new String[lllIIIllI[0]];
                strArr5[lllIIIllI[1]] = lllIIIIll[lllIIIllI[45]];
                if (llIIIIIIlIIl(Inventory.contains(strArr5) ? 1 : 0) && llIIIIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr6 = new String[lllIIIllI[0]];
                    strArr6[lllIIIllI[1]] = lllIIIIll[lllIIIllI[46]];
                    Inventory.getFirst(strArr6).interact(lllIIIIll[lllIIIllI[21]]);
                    Time.sleepTicks(lllIIIllI[3]);
                    "".length();
                }
                C0006g.a(cG);
            }
            if (llIIIIIlIIlI(C0004e.j(dL), lllIIIllI[47])) {
                WorldPoint worldPoint3 = new WorldPoint(lllIIIllI[48], lllIIIllI[49], lllIIIllI[1]);
                if (llIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lllIIIllI[10])) {
                    AccBuilderGWD.c = lllIIIIll[lllIIIllI[50]];
                    Movement.walkTo(worldPoint3);
                    "".length();
                    Time.sleepTicks(lllIIIllI[0]);
                    "".length();
                }
                if (llIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lllIIIllI[10])) {
                    C0006g.a(cG);
                    TileItem nearest2 = TileItems.getNearest(tileItem -> {
                        if (llIIIIIlIIlI(tileItem.getId(), lllIIIllI[53]) && llIIIIIIlIIl(tileItem.getWorldLocation().equals(new WorldPoint(lllIIIllI[112], lllIIIllI[49], lllIIIllI[1])) ? 1 : 0)) {
                            ?? r0 = lllIIIllI[0];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lllIIIllI[1];
                    });
                    TileItem nearest3 = TileItems.getNearest(tileItem2 -> {
                        if (llIIIIIlIIlI(tileItem2.getId(), lllIIIllI[54]) && llIIIIIIlIIl(tileItem2.getWorldLocation().equals(new WorldPoint(lllIIIllI[112], lllIIIllI[110], lllIIIllI[1])) ? 1 : 0)) {
                            ?? r0 = lllIIIllI[0];
                            "".length();
                            return " ".length() == 0 ? ((((119 + 0) - 15) + 80) ^ (((109 + 12) - 49) + 66)) & (((61 ^ 57) ^ (135 ^ 177)) ^ (-" ".length())) : r0;
                        }
                        return lllIIIllI[1];
                    });
                    TileItem nearest4 = TileItems.getNearest(tileItem3 -> {
                        if (llIIIIIlIIlI(tileItem3.getId(), lllIIIllI[57]) && llIIIIIIlIIl(tileItem3.getWorldLocation().equals(new WorldPoint(lllIIIllI[48], lllIIIllI[49], lllIIIllI[1])) ? 1 : 0)) {
                            ?? r0 = lllIIIllI[0];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lllIIIllI[1];
                    });
                    TileItem nearest5 = TileItems.getNearest(tileItem4 -> {
                        if (llIIIIIlIIlI(tileItem4.getId(), lllIIIllI[59]) && llIIIIIIlIIl(tileItem4.getWorldLocation().equals(new WorldPoint(lllIIIllI[48], lllIIIllI[107], lllIIIllI[1])) ? 1 : 0)) {
                            ?? r0 = lllIIIllI[0];
                            "".length();
                            return "   ".length() == (((((124 + 167) - 250) + 137) ^ (((104 + 16) - 29) + 41)) & (((167 ^ 177) ^ (91 ^ 123)) ^ (-" ".length()))) ? ((89 ^ 17) ^ (181 ^ 195)) & (((9 ^ 73) ^ (13 ^ 115)) ^ (-" ".length())) : r0;
                        }
                        return lllIIIllI[1];
                    });
                    TileItem nearest6 = TileItems.getNearest(tileItem5 -> {
                        if (llIIIIIlIIlI(tileItem5.getId(), lllIIIllI[56]) && llIIIIIIlIIl(tileItem5.getWorldLocation().equals(new WorldPoint(lllIIIllI[48], lllIIIllI[110], lllIIIllI[1])) ? 1 : 0)) {
                            ?? r0 = lllIIIllI[0];
                            "".length();
                            return ((190 ^ 140) & ((24 ^ 42) ^ (-1))) < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lllIIIllI[1];
                    });
                    TileObject nearest7 = TileObjects.getNearest(tileObject -> {
                        if (llIIIIIIlIIl(tileObject.getName().contains(lllIIIIll[lllIIIllI[61]]) ? 1 : 0)) {
                            String[] strArr7 = new String[lllIIIllI[0]];
                            strArr7[lllIIIllI[1]] = lllIIIIll[lllIIIllI[114]];
                            if (llIIIIIIlIIl(tileObject.hasAction(strArr7) ? 1 : 0) && llIIIIIlIIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllIIIllI[115], lllIIIllI[116], lllIIIllI[1])), lllIIIllI[3])) {
                                ?? r0 = lllIIIllI[0];
                                "".length();
                                return "   ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                        return lllIIIllI[1];
                    });
                    if (llIIIIIIllII(nearest7)) {
                        AccBuilderGWD.c = lllIIIIll[lllIIIllI[51]];
                        nearest7.interact(lllIIIIll[lllIIIllI[52]]);
                        Time.sleepTicks(lllIIIllI[16]);
                        "".length();
                    }
                    if (llIIIIIlIIll(nearest2)) {
                        int[] iArr12 = new int[lllIIIllI[0]];
                        iArr12[lllIIIllI[1]] = lllIIIllI[53];
                        if (llIIIIIIlIll(Inventory.contains(iArr12) ? 1 : 0)) {
                            int[] iArr13 = new int[lllIIIllI[0]];
                            iArr13[lllIIIllI[1]] = lllIIIllI[53];
                            TileItems.getNearest(iArr13).interact(lllIIIIll[lllIIIllI[43]]);
                            Time.sleepTicks(lllIIIllI[3]);
                            "".length();
                        }
                        int[] iArr14 = new int[lllIIIllI[0]];
                        iArr14[lllIIIllI[1]] = lllIIIllI[53];
                        if (llIIIIIIlIIl(Inventory.contains(iArr14) ? 1 : 0)) {
                            int[] iArr15 = new int[lllIIIllI[0]];
                            iArr15[lllIIIllI[1]] = lllIIIllI[53];
                            Inventory.getFirst(iArr15).useOn(TileObjects.getNearest(tileObject2 -> {
                                if (llIIIIIIlIIl(tileObject2.getName().contains(lllIIIIll[lllIIIllI[113]]) ? 1 : 0) && llIIIIIIlIIl(tileObject2.getWorldLocation().equals(new WorldPoint(lllIIIllI[112], lllIIIllI[49], lllIIIllI[1])) ? 1 : 0)) {
                                    ?? r0 = lllIIIllI[0];
                                    "".length();
                                    return (95 ^ 91) <= ((35 ^ 4) & ((36 ^ 3) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lllIIIllI[1];
                            }));
                        }
                    }
                    if (llIIIIIIllII(nearest2) && llIIIIIlIIll(nearest3)) {
                        int[] iArr16 = new int[lllIIIllI[0]];
                        iArr16[lllIIIllI[1]] = lllIIIllI[54];
                        if (llIIIIIIlIll(Inventory.contains(iArr16) ? 1 : 0)) {
                            int[] iArr17 = new int[lllIIIllI[0]];
                            iArr17[lllIIIllI[1]] = lllIIIllI[54];
                            TileItems.getNearest(iArr17).interact(lllIIIIll[lllIIIllI[55]]);
                            Time.sleepTicks(lllIIIllI[3]);
                            "".length();
                        }
                        int[] iArr18 = new int[lllIIIllI[0]];
                        iArr18[lllIIIllI[1]] = lllIIIllI[54];
                        if (llIIIIIIlIIl(Inventory.contains(iArr18) ? 1 : 0)) {
                            int[] iArr19 = new int[lllIIIllI[0]];
                            iArr19[lllIIIllI[1]] = lllIIIllI[54];
                            Inventory.getFirst(iArr19).useOn(TileObjects.getNearest(tileObject3 -> {
                                if (llIIIIIIlIIl(tileObject3.getName().contains(lllIIIIll[lllIIIllI[111]]) ? 1 : 0) && llIIIIIIlIIl(tileObject3.getWorldLocation().equals(new WorldPoint(lllIIIllI[112], lllIIIllI[110], lllIIIllI[1])) ? 1 : 0)) {
                                    ?? r0 = lllIIIllI[0];
                                    "".length();
                                    return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lllIIIllI[1];
                            }));
                        }
                    }
                    if (llIIIIIIllII(nearest2) && llIIIIIIllII(nearest3) && llIIIIIlIIll(nearest6)) {
                        int[] iArr20 = new int[lllIIIllI[0]];
                        iArr20[lllIIIllI[1]] = lllIIIllI[56];
                        if (llIIIIIIlIll(Inventory.contains(iArr20) ? 1 : 0)) {
                            int[] iArr21 = new int[lllIIIllI[0]];
                            iArr21[lllIIIllI[1]] = lllIIIllI[56];
                            TileItems.getNearest(iArr21).interact(lllIIIIll[lllIIIllI[27]]);
                            Time.sleepTicks(lllIIIllI[3]);
                            "".length();
                        }
                        int[] iArr22 = new int[lllIIIllI[0]];
                        iArr22[lllIIIllI[1]] = lllIIIllI[56];
                        if (llIIIIIIlIIl(Inventory.contains(iArr22) ? 1 : 0)) {
                            int[] iArr23 = new int[lllIIIllI[0]];
                            iArr23[lllIIIllI[1]] = lllIIIllI[56];
                            Inventory.getFirst(iArr23).useOn(TileObjects.getNearest(tileObject4 -> {
                                if (llIIIIIIlIIl(tileObject4.getName().contains(lllIIIIll[lllIIIllI[109]]) ? 1 : 0) && llIIIIIIlIIl(tileObject4.getWorldLocation().equals(new WorldPoint(lllIIIllI[48], lllIIIllI[110], lllIIIllI[1])) ? 1 : 0)) {
                                    ?? r0 = lllIIIllI[0];
                                    "".length();
                                    return 0 != 0 ? ((56 ^ 104) ^ (40 ^ 92)) & (((((39 + 139) - 159) + 129) ^ (((120 + 82) - 142) + 116)) ^ (-" ".length())) : r0;
                                }
                                return lllIIIllI[1];
                            }));
                        }
                    }
                    if (llIIIIIIllII(nearest2) && llIIIIIIllII(nearest3) && llIIIIIIllII(nearest6) && llIIIIIlIIll(nearest4)) {
                        int[] iArr24 = new int[lllIIIllI[0]];
                        iArr24[lllIIIllI[1]] = lllIIIllI[57];
                        if (llIIIIIIlIll(Inventory.contains(iArr24) ? 1 : 0)) {
                            int[] iArr25 = new int[lllIIIllI[0]];
                            iArr25[lllIIIllI[1]] = lllIIIllI[57];
                            TileItems.getNearest(iArr25).interact(lllIIIIll[lllIIIllI[58]]);
                            Time.sleepTicks(lllIIIllI[3]);
                            "".length();
                        }
                        int[] iArr26 = new int[lllIIIllI[0]];
                        iArr26[lllIIIllI[1]] = lllIIIllI[57];
                        if (llIIIIIIlIIl(Inventory.contains(iArr26) ? 1 : 0)) {
                            int[] iArr27 = new int[lllIIIllI[0]];
                            iArr27[lllIIIllI[1]] = lllIIIllI[57];
                            Inventory.getFirst(iArr27).useOn(TileObjects.getNearest(tileObject5 -> {
                                if (llIIIIIIlIIl(tileObject5.getName().contains(lllIIIIll[lllIIIllI[108]]) ? 1 : 0) && llIIIIIIlIIl(tileObject5.getWorldLocation().equals(new WorldPoint(lllIIIllI[48], lllIIIllI[49], lllIIIllI[1])) ? 1 : 0)) {
                                    ?? r0 = lllIIIllI[0];
                                    "".length();
                                    return "  ".length() < ((119 ^ 47) & ((73 ^ 17) ^ (-1))) ? (true ^ true) & (true ^ true) : r0;
                                }
                                return lllIIIllI[1];
                            }));
                        }
                    }
                    if (llIIIIIIllII(nearest2) && llIIIIIIllII(nearest3) && llIIIIIIllII(nearest6) && llIIIIIIllII(nearest4) && llIIIIIlIIll(nearest5)) {
                        int[] iArr28 = new int[lllIIIllI[0]];
                        iArr28[lllIIIllI[1]] = lllIIIllI[59];
                        if (llIIIIIIlIll(Inventory.contains(iArr28) ? 1 : 0)) {
                            int[] iArr29 = new int[lllIIIllI[0]];
                            iArr29[lllIIIllI[1]] = lllIIIllI[59];
                            TileItems.getNearest(iArr29).interact(lllIIIIll[lllIIIllI[60]]);
                            Time.sleepTicks(lllIIIllI[3]);
                            "".length();
                        }
                        int[] iArr30 = new int[lllIIIllI[0]];
                        iArr30[lllIIIllI[1]] = lllIIIllI[59];
                        if (llIIIIIIlIIl(Inventory.contains(iArr30) ? 1 : 0)) {
                            int[] iArr31 = new int[lllIIIllI[0]];
                            iArr31[lllIIIllI[1]] = lllIIIllI[59];
                            Inventory.getFirst(iArr31).useOn(TileObjects.getNearest(tileObject6 -> {
                                if (llIIIIIIlIIl(tileObject6.getName().contains(lllIIIIll[lllIIIllI[106]]) ? 1 : 0) && llIIIIIIlIIl(tileObject6.getWorldLocation().equals(new WorldPoint(lllIIIllI[48], lllIIIllI[107], lllIIIllI[1])) ? 1 : 0)) {
                                    ?? r0 = lllIIIllI[0];
                                    "".length();
                                    return (((93 ^ 62) ^ (33 ^ 115)) & (((((32 + 32) - (-43)) + 20) ^ (41 ^ 103)) ^ (-" ".length()))) != 0 ? ((200 ^ 167) ^ (242 ^ 185)) & (((92 ^ 43) ^ (246 ^ 165)) ^ (-" ".length())) : r0;
                                }
                                return lllIIIllI[1];
                            }));
                        }
                    }
                }
            }
            if (llIIIIIlIIlI(C0004e.j(dL), lllIIIllI[61])) {
                if (llIIIIIIlIll(dK ? 1 : 0)) {
                    String[] strArr7 = new String[lllIIIllI[0]];
                    strArr7[lllIIIllI[1]] = lllIIIIll[lllIIIllI[62]];
                    if (llIIIIIIlIll(Inventory.contains(strArr7) ? 1 : 0)) {
                        if (llIIIIIIlIll(dG ? 1 : 0)) {
                            String[] strArr8 = new String[lllIIIllI[0]];
                            strArr8[lllIIIllI[1]] = lllIIIIll[lllIIIllI[63]];
                            if (llIIIIIIlIll(Inventory.contains(strArr8) ? 1 : 0)) {
                                String[] strArr9 = new String[lllIIIllI[0]];
                                strArr9[lllIIIllI[1]] = lllIIIIll[lllIIIllI[64]];
                                if (llIIIIIlIIll(NPCs.getNearest(strArr9))) {
                                    WorldPoint worldPoint4 = new WorldPoint(lllIIIllI[65], lllIIIllI[66], lllIIIllI[1]);
                                    if (llIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint4), lllIIIllI[4])) {
                                        AccBuilderGWD.c = lllIIIIll[lllIIIllI[67]];
                                        Movement.walkTo(worldPoint4);
                                        "".length();
                                        Time.sleepTicks(lllIIIllI[0]);
                                        "".length();
                                    }
                                    if (llIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint4), lllIIIllI[4])) {
                                        String[] strArr10 = new String[lllIIIllI[0]];
                                        strArr10[lllIIIllI[1]] = lllIIIIll[lllIIIllI[68]];
                                        TileObjects.getNearest(strArr10).interact(lllIIIIll[lllIIIllI[69]]);
                                        Time.sleepTicks(lllIIIllI[4]);
                                        "".length();
                                    }
                                }
                                String[] strArr11 = new String[lllIIIllI[0]];
                                strArr11[lllIIIllI[1]] = lllIIIIll[lllIIIllI[70]];
                                if (llIIIIIIllII(NPCs.getNearest(strArr11))) {
                                    String str3 = lllIIIIll[lllIIIllI[33]];
                                    String[] strArr12 = new String[lllIIIllI[0]];
                                    strArr12[lllIIIllI[1]] = lllIIIIll[lllIIIllI[71]];
                                    C0006g.a(str3, strArr12);
                                }
                            }
                        }
                        if (llIIIIIIlIIl(dG ? 1 : 0)) {
                            String[] strArr13 = new String[lllIIIllI[0]];
                            strArr13[lllIIIllI[1]] = lllIIIIll[lllIIIllI[72]];
                            if (llIIIIIIlIll(Inventory.contains(strArr13) ? 1 : 0)) {
                                String[] strArr14 = new String[lllIIIllI[0]];
                                strArr14[lllIIIllI[1]] = lllIIIIll[lllIIIllI[73]];
                                if (llIIIIIIlIll(Inventory.contains(strArr14) ? 1 : 0)) {
                                    WorldPoint worldPoint5 = new WorldPoint(lllIIIllI[74], lllIIIllI[75], lllIIIllI[1]);
                                    if (llIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint5), lllIIIllI[4])) {
                                        AccBuilderGWD.c = lllIIIIll[lllIIIllI[76]];
                                        Movement.walkTo(worldPoint5);
                                        "".length();
                                        Time.sleepTicks(lllIIIllI[0]);
                                        "".length();
                                    }
                                    if (llIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint5), lllIIIllI[4])) {
                                        C0006g.a(lllIIIIll[lllIIIllI[77]], cG, lllIIIllI[0]);
                                    }
                                }
                            }
                        }
                        if (llIIIIIIlIIl(dG ? 1 : 0)) {
                            String[] strArr15 = new String[lllIIIllI[0]];
                            strArr15[lllIIIllI[1]] = lllIIIIll[lllIIIllI[78]];
                            if (llIIIIIIlIIl(Inventory.contains(strArr15) ? 1 : 0) && llIIIIIIlIll(dH ? 1 : 0) && llIIIIIIlIll(dI ? 1 : 0)) {
                                WorldPoint worldPoint6 = new WorldPoint(lllIIIllI[79], lllIIIllI[80], lllIIIllI[1]);
                                if (llIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint6), lllIIIllI[10])) {
                                    AccBuilderGWD.c = lllIIIIll[lllIIIllI[81]];
                                    Movement.walkTo(worldPoint6);
                                    "".length();
                                    Time.sleepTicks(lllIIIllI[0]);
                                    "".length();
                                }
                                if (llIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint6), lllIIIllI[10])) {
                                    C0006g.a(lllIIIIll[lllIIIllI[82]], cG, lllIIIllI[0]);
                                }
                            }
                        }
                        if (llIIIIIIlIIl(dH ? 1 : 0)) {
                            if (llIIIIIIlIll(dI ? 1 : 0)) {
                                if (llIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(dg), lllIIIllI[22])) {
                                    AccBuilderGWD.c = lllIIIIll[lllIIIllI[83]];
                                    if (llIIIIIIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    C0004e.l(lllIIIllI[5]);
                                    Movement.walkTo(dg);
                                    "".length();
                                    Time.sleepTicks(lllIIIllI[0]);
                                    "".length();
                                }
                                if (llIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(dg), lllIIIllI[22])) {
                                    C0006g.a(lllIIIIll[lllIIIllI[20]], cG, lllIIIllI[0]);
                                }
                            }
                            if (llIIIIIIlIIl(dI ? 1 : 0)) {
                                WorldPoint worldPoint7 = new WorldPoint(lllIIIllI[79], lllIIIllI[80], lllIIIllI[1]);
                                if (llIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint7), lllIIIllI[10])) {
                                    AccBuilderGWD.c = lllIIIIll[lllIIIllI[84]];
                                    Movement.walkTo(worldPoint7);
                                    "".length();
                                    Time.sleepTicks(lllIIIllI[0]);
                                    "".length();
                                }
                                if (llIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint7), lllIIIllI[10])) {
                                    C0006g.a(lllIIIIll[lllIIIllI[85]], cG, lllIIIllI[0]);
                                }
                            }
                        }
                    }
                    String[] strArr16 = new String[lllIIIllI[0]];
                    strArr16[lllIIIllI[1]] = lllIIIIll[lllIIIllI[86]];
                    if (llIIIIIIlIIl(Inventory.contains(strArr16) ? 1 : 0)) {
                        WorldPoint worldPoint8 = new WorldPoint(lllIIIllI[74], lllIIIllI[75], lllIIIllI[1]);
                        if (llIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint8), lllIIIllI[4])) {
                            AccBuilderGWD.c = lllIIIIll[lllIIIllI[87]];
                            Movement.walkTo(worldPoint8);
                            "".length();
                            Time.sleepTicks(lllIIIllI[0]);
                            "".length();
                        }
                        if (llIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint8), lllIIIllI[4])) {
                            C0006g.a(lllIIIIll[lllIIIllI[44]], cG, lllIIIllI[0]);
                        }
                    }
                }
                if (llIIIIIIlIIl(dK ? 1 : 0) && llIIIIIIlIll(dJ ? 1 : 0)) {
                    String[] strArr17 = new String[lllIIIllI[0]];
                    strArr17[lllIIIllI[1]] = lllIIIIll[lllIIIllI[88]];
                    if (llIIIIIIlIll(Inventory.contains(strArr17) ? 1 : 0)) {
                        if (llIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllIIIllI[74], lllIIIllI[75], lllIIIllI[1])), lllIIIllI[30])) {
                            C0006g.a(lllIIIIll[lllIIIllI[89]], cG, lllIIIllI[0]);
                        }
                    }
                    String[] strArr18 = new String[lllIIIllI[0]];
                    strArr18[lllIIIllI[1]] = lllIIIIll[lllIIIllI[90]];
                    if (llIIIIIIlIIl(Inventory.contains(strArr18) ? 1 : 0)) {
                        WorldPoint worldPoint9 = new WorldPoint(lllIIIllI[91], lllIIIllI[92], lllIIIllI[1]);
                        if (llIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint9), lllIIIllI[3])) {
                            AccBuilderGWD.c = lllIIIIll[lllIIIllI[93]];
                            Movement.walkTo(worldPoint9);
                            "".length();
                            Time.sleepTicks(lllIIIllI[0]);
                            "".length();
                        }
                        if (llIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint9), lllIIIllI[3])) {
                            dJ = lllIIIllI[0];
                        }
                    }
                }
                if (llIIIIIIlIIl(dJ ? 1 : 0)) {
                    if (llIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(dg), lllIIIllI[22])) {
                        AccBuilderGWD.c = lllIIIIll[lllIIIllI[47]];
                        if (llIIIIIIlIIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        C0004e.l(lllIIIllI[5]);
                        Movement.walkTo(dg);
                        "".length();
                        Time.sleepTicks(lllIIIllI[0]);
                        "".length();
                    }
                    if (llIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(dg), lllIIIllI[22])) {
                        if (llIIIIIIlIlI(dk, lllIIIllI[0])) {
                            as.nD += lllIIIllI[0];
                            as.u(AccBuilderGWD.m);
                            dk += lllIIIllI[0];
                            as.nD = lllIIIllI[1];
                        }
                        C0006g.a(lllIIIIll[lllIIIllI[94]], cG, lllIIIllI[0]);
                    }
                }
            }
            if (llIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllIIIllI[74], lllIIIllI[75], lllIIIllI[1])), lllIIIllI[31])) {
                int[] iArr32 = new int[lllIIIllI[0]];
                iArr32[lllIIIllI[1]] = lllIIIllI[9];
                if (llIIIIIIlIll(Inventory.contains(iArr32) ? 1 : 0)) {
                    int[] iArr33 = new int[lllIIIllI[0]];
                    iArr33[lllIIIllI[1]] = lllIIIllI[7];
                    if (llIIIIIIlIll(Inventory.contains(iArr33) ? 1 : 0)) {
                        dK = lllIIIllI[0];
                    }
                }
            }
            String[] strArr19 = new String[lllIIIllI[0]];
            strArr19[lllIIIllI[1]] = lllIIIIll[lllIIIllI[95]];
            if (llIIIIIIlIIl(Inventory.contains(strArr19) ? 1 : 0)) {
                dI = lllIIIllI[0];
            }
        }
    }

    private static boolean llIIIIIlIIll(Object obj) {
        return obj == null;
    }
}
