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
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.S  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/S.class */
public class S implements ab {
    static /* synthetic */ int cI;
    private static /* synthetic */ int[] lIIIIllIII;
    static /* synthetic */ int dk;
    private static final /* synthetic */ String[] la;
    private static final /* synthetic */ WorldPoint kZ;
    private static final /* synthetic */ int kW;
    static /* synthetic */ boolean dl;
    private static final /* synthetic */ int kX;
    public static /* synthetic */ boolean bv;
    private static final /* synthetic */ int kY;
    public static /* synthetic */ List<C0003d> bx;
    private static /* synthetic */ String[] lIIIIlIlll;

    private static void lllIIIlIlllI() {
        lIIIIlIlll = new String[lIIIIllIII[38]];
        lIIIIlIlll[lIIIIllIII[0]] = lllIIIlIlIll("LQE/Gx4IVC8GFQIH", "otFrp");
        lIIIIlIlll[lIIIIllIII[1]] = lllIIIlIllII("mTiVjFRXtLz4g6p8O7zqBSR1hD1CA7DZvteJF3ziYVq46bZsztfwuGjI96x4IfXb", "gxXZW");
        lIIIIlIlll[lIIIIllIII[3]] = lllIIIlIllIl("kc2Qt68oDgg=", "CnRvn");
        lIIIIlIlll[lIIIIllIII[5]] = lllIIIlIllIl("o/sh1dJRq0EUdgULvb+uDQ==", "yuQBT");
        lIIIIlIlll[lIIIIllIII[6]] = lllIIIlIllIl("sGHRulappfwA+e4gE6tA76yTr8kNvGwg", "NAhva");
        lIIIIlIlll[lIIIIllIII[12]] = lllIIIlIlIll("JQ1ENjEXSAk+MAEBCjBjAx0BJDdSGxEnMx4BASRvUhsTPjcRAA05JFIcC3cBJzEtGQQ=", "rhdWC");
        lIIIIlIlll[lIIIIllIII[9]] = lllIIIlIlIll("OC1UAgIKaBkKAxwhGgRQHj0REARPOwETAAMhERBcTzsDCgQMIB0NF088G0MyOhE9LTc=", "oHtcp");
        lIIIIlIlll[lIIIIllIII[15]] = lllIIIlIllIl("8lH0tcYRnEM8n4ozbVQqGg==", "wiaMs");
        lIIIIlIlll[lIIIIllIII[16]] = lllIIIlIlIll("DzEdNh4icBc7Eys/FA==", "GPsRr");
        lIIIIlIlll[lIIIIllIII[17]] = lllIIIlIlIll("KQgjMA==", "mgLBQ");
        lIIIIlIlll[lIIIIllIII[18]] = lllIIIlIlIll("KRYsLA==", "ffIBQ");
        lIIIIlIlll[lIIIIllIII[19]] = lllIIIlIllII("yWVb8SyPeBU=", "olruM");
        lIIIIlIlll[lIIIIllIII[20]] = lllIIIlIlIll("IjceAwI=", "fXlja");
        lIIIIlIlll[lIIIIllIII[21]] = lllIIIlIllII("7VgKtbUzQeHOltvucVILFw==", "JoeHE");
        lIIIIlIlll[lIIIIllIII[22]] = lllIIIlIllIl("sMXbnS/SOnMZUiFIkgGZKCuaQqihvfDq", "Afgjn");
        lIIIIlIlll[lIIIIllIII[23]] = lllIIIlIllIl("EKn++Lv89LSooDUwxs+7CesOkQlf3e67ZX+v2GRtwN3LqYB7nIYCZZ0d+R/cE7t9Hb1hYlAxBXs=", "DsiHc");
        lIIIIlIlll[lIIIIllIII[30]] = lllIIIlIlIll("IRgwBA8WVzMYCRYD", "ewBml");
        lIIIIlIlll[lIIIIllIII[31]] = lllIIIlIlIll("Cg0PHUMXAkENBhkIFRJDUA==", "xdazc");
        lIIIIlIlll[lIIIIllIII[34]] = lllIIIlIlIll("DFIuLAcxFz1tHSpSLD4MZQs2OBtlEzc7ACkBdw==", "ErYMi");
        lIIIIlIlll[lIIIIllIII[35]] = lllIIIlIlIll("HwY1QmgPQzEHJCpDIQs8ZhopG2gyCyNOJScXIxwhJw81QA==", "FcFnH");
        lIIIIlIlll[lIIIIllIII[36]] = lllIIIlIllII("NQBgsBOoaQ6H28CgjtFZgV6UKtkhXPFRaQvc8WdcDms=", "eCYMg");
        lIIIIlIlll[lIIIIllIII[37]] = lllIIIlIlIll("LRckSw==", "trWeo");
    }

    private static boolean lllIIIllIIII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return lIIIIllIII[0];
    }

    private static boolean lllIIIllIlIl(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e5, code lost:
        if (lllIIIllIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.S.lIIIIllIII[3]) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x016d, code lost:
        if (lllIIIllIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.S.lIIIIllIII[6]) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (lllIIIllIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.S.lIIIIllIII[9]) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = new int[lIIIIllIII[1]];
        iArr5[lIIIIllIII[0]] = lIIIIllIII[8];
        if (lllIIIllIIII(Bank.contains(iArr5) ? 1 : 0)) {
            int[] iArr6 = new int[lIIIIllIII[1]];
            iArr6[lIIIIllIII[0]] = lIIIIllIII[8];
            if (lllIIIllIIII(Bank.contains(iArr6) ? 1 : 0)) {
                int[] iArr7 = new int[lIIIIllIII[1]];
                iArr7[lIIIIllIII[0]] = lIIIIllIII[8];
            }
            iArr = new int[lIIIIllIII[1]];
            iArr[lIIIIllIII[0]] = lIIIIllIII[10];
            if (lllIIIllIIII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr8 = new int[lIIIIllIII[1]];
                iArr8[lIIIIllIII[0]] = lIIIIllIII[10];
                if (lllIIIllIIII(Bank.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[lIIIIllIII[1]];
                    iArr9[lIIIIllIII[0]] = lIIIIllIII[10];
                }
                iArr2 = new int[lIIIIllIII[1]];
                iArr2[lIIIIllIII[0]] = lIIIIllIII[11];
                if (lllIIIllIIII(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIIIllIII[1]];
                    iArr10[lIIIIllIII[0]] = lIIIIllIII[11];
                    if (lllIIIllIIII(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIIIIllIII[1]];
                        iArr11[lIIIIllIII[0]] = lIIIIllIII[11];
                    }
                    iArr3 = new int[lIIIIllIII[1]];
                    iArr3[lIIIIllIII[0]] = lIIIIllIII[13];
                    if (lllIIIllIIlI(Bank.contains(iArr3) ? 1 : 0)) {
                        bx.add(new C0003d(lIIIIllIII[13], lIIIIllIII[12], lIIIIllIII[7]));
                        "".length();
                    }
                    if (lllIIIllIIlI(Bank.contains(item -> {
                        return item.getName().toLowerCase().contains(lIIIIlIlll[lIIIIllIII[31]]);
                    }) ? 1 : 0)) {
                        bx.add(new C0003d(lIIIIllIII[25], lIIIIllIII[12], lIIIIllIII[26]));
                        "".length();
                    }
                    iArr4 = new int[lIIIIllIII[1]];
                    iArr4[lIIIIllIII[0]] = lIIIIllIII[27];
                    if (lllIIIllIIlI(Bank.contains(iArr4) ? 1 : 0)) {
                        return;
                    }
                    bx.add(new C0003d(lIIIIllIII[27], lIIIIllIII[28], lIIIIllIII[29]));
                    "".length();
                    return;
                }
                bx.add(new C0003d(lIIIIllIII[11], lIIIIllIII[6], lIIIIllIII[24]));
                "".length();
                iArr3 = new int[lIIIIllIII[1]];
                iArr3[lIIIIllIII[0]] = lIIIIllIII[13];
                if (lllIIIllIIlI(Bank.contains(iArr3) ? 1 : 0)) {
                }
                if (lllIIIllIIlI(Bank.contains(item2 -> {
                    return item2.getName().toLowerCase().contains(lIIIIlIlll[lIIIIllIII[31]]);
                }) ? 1 : 0)) {
                }
                iArr4 = new int[lIIIIllIII[1]];
                iArr4[lIIIIllIII[0]] = lIIIIllIII[27];
                if (lllIIIllIIlI(Bank.contains(iArr4) ? 1 : 0)) {
                }
            }
            bx.add(new C0003d(lIIIIllIII[10], lIIIIllIII[3], lIIIIllIII[24]));
            "".length();
            iArr2 = new int[lIIIIllIII[1]];
            iArr2[lIIIIllIII[0]] = lIIIIllIII[11];
            if (lllIIIllIIII(Bank.contains(iArr2) ? 1 : 0)) {
            }
            bx.add(new C0003d(lIIIIllIII[11], lIIIIllIII[6], lIIIIllIII[24]));
            "".length();
            iArr3 = new int[lIIIIllIII[1]];
            iArr3[lIIIIllIII[0]] = lIIIIllIII[13];
            if (lllIIIllIIlI(Bank.contains(iArr3) ? 1 : 0)) {
            }
            if (lllIIIllIIlI(Bank.contains(item22 -> {
                return item22.getName().toLowerCase().contains(lIIIIlIlll[lIIIIllIII[31]]);
            }) ? 1 : 0)) {
            }
            iArr4 = new int[lIIIIllIII[1]];
            iArr4[lIIIIllIII[0]] = lIIIIllIII[27];
            if (lllIIIllIIlI(Bank.contains(iArr4) ? 1 : 0)) {
            }
        }
        bx.add(new C0003d(lIIIIllIII[8], lIIIIllIII[9], lIIIIllIII[24]));
        "".length();
        iArr = new int[lIIIIllIII[1]];
        iArr[lIIIIllIII[0]] = lIIIIllIII[10];
        if (lllIIIllIIII(Bank.contains(iArr) ? 1 : 0)) {
        }
        bx.add(new C0003d(lIIIIllIII[10], lIIIIllIII[3], lIIIIllIII[24]));
        "".length();
        iArr2 = new int[lIIIIllIII[1]];
        iArr2[lIIIIllIII[0]] = lIIIIllIII[11];
        if (lllIIIllIIII(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bx.add(new C0003d(lIIIIllIII[11], lIIIIllIII[6], lIIIIllIII[24]));
        "".length();
        iArr3 = new int[lIIIIllIII[1]];
        iArr3[lIIIIllIII[0]] = lIIIIllIII[13];
        if (lllIIIllIIlI(Bank.contains(iArr3) ? 1 : 0)) {
        }
        if (lllIIIllIIlI(Bank.contains(item222 -> {
            return item222.getName().toLowerCase().contains(lIIIIlIlll[lIIIIllIII[31]]);
        }) ? 1 : 0)) {
        }
        iArr4 = new int[lIIIIllIII[1]];
        iArr4[lIIIIllIII[0]] = lIIIIllIII[27];
        if (lllIIIllIIlI(Bank.contains(iArr4) ? 1 : 0)) {
        }
    }

    private static String lllIIIlIllII(String lllIIllIllIl, String lllIIllIllII) {
        try {
            SecretKeySpec lllIIlllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIllIllII.getBytes(StandardCharsets.UTF_8)), lIIIIllIII[16]), "DES");
            Cipher lllIIllIllll = Cipher.getInstance("DES");
            lllIIllIllll.init(lIIIIllIII[3], lllIIlllIIII);
            return new String(lllIIllIllll.doFinal(Base64.getDecoder().decode(lllIIllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIllIlllI) {
            lllIIllIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIllIIlI(int i) {
        return i == 0;
    }

    static {
        lllIIIlIllll();
        lllIIIlIlllI();
        kY = lIIIIllIII[11];
        kW = lIIIIllIII[8];
        kX = lIIIIllIII[10];
        kZ = new WorldPoint(lIIIIllIII[32], lIIIIllIII[33], lIIIIllIII[0]);
        String[] strArr = new String[lIIIIllIII[6]];
        strArr[lIIIIllIII[0]] = lIIIIlIlll[lIIIIllIII[34]];
        strArr[lIIIIllIII[1]] = lIIIIlIlll[lIIIIllIII[35]];
        strArr[lIIIIllIII[3]] = lIIIIlIlll[lIIIIllIII[36]];
        strArr[lIIIIllIII[5]] = lIIIIlIlll[lIIIIllIII[37]];
        la = strArr;
        bx = new ArrayList();
        cI = lIIIIllIII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (lllIIIllIlIl(C0004e.j(lIIIIllIII[4]), lIIIIllIII[14])) {
            ?? r0 = lIIIIllIII[1];
            "".length();
            return ((((14 ^ 68) & ((14 ^ 68) ^ (-1))) ^ (68 ^ 89)) & (((11 ^ 40) ^ (124 ^ 66)) ^ (-" ".length()))) > 0 ? ((74 ^ 105) ^ (103 ^ 26)) & (((175 ^ 139) ^ (242 ^ 136)) ^ (-" ".length())) : r0;
        }
        return lIIIIllIII[0];
    }

    private static void lllIIIlIllll() {
        lIIIIllIII = new int[39];
        lIIIIllIII[0] = ((25 ^ 73) ^ (246 ^ 128)) & (((179 ^ 138) ^ (42 ^ 53)) ^ (-" ".length()));
        lIIIIllIII[1] = " ".length();
        lIIIIllIII[2] = 187 ^ 137;
        lIIIIllIII[3] = "  ".length();
        lIIIIllIII[4] = 119 ^ 104;
        lIIIIllIII[5] = "   ".length();
        lIIIIllIII[6] = (((120 + 153) - 106) + 29) ^ (((69 + 152) - 79) + 50);
        lIIIIllIII[7] = (-((-5266) & 29943)) & (-19) & 29695;
        lIIIIllIII[8] = (-2057) & 2490;
        lIIIIllIII[9] = (123 ^ 77) ^ (1 ^ 49);
        lIIIIllIII[10] = (-20552) & 20991;
        lIIIIllIII[11] = (-((-2356) & 7999)) & (-26625) & 32703;
        lIIIIllIII[12] = (216 ^ 186) ^ (100 ^ 3);
        lIIIIllIII[13] = (-24631) & 32639;
        lIIIIllIII[14] = 228 ^ 128;
        lIIIIllIII[15] = (((57 + 118) - 54) + 10) ^ (((22 + 130) - 65) + 45);
        lIIIIllIII[16] = 149 ^ 157;
        lIIIIllIII[17] = 136 ^ 129;
        lIIIIllIII[18] = " ".length() ^ (0 ^ 11);
        lIIIIllIII[19] = 165 ^ 174;
        lIIIIllIII[20] = (144 ^ 182) ^ (9 ^ 35);
        lIIIIllIII[21] = 206 ^ 195;
        lIIIIllIII[22] = 147 ^ 157;
        lIIIIllIII[23] = (((136 + 4) - 60) + 106) ^ (((116 + 132) - 153) + 86);
        lIIIIllIII[24] = (-((-2499) & 14798)) & (-19969) & 32767;
        lIIIIllIII[25] = (-((-12562) & 28949)) & (-4097) & 32463;
        lIIIIllIII[26] = (-5697) & 30696;
        lIIIIllIII[27] = (-24617) & 32623;
        lIIIIllIII[28] = 73 ^ 97;
        lIIIIllIII[29] = (-545) & 2044;
        lIIIIllIII[30] = 78 ^ 94;
        lIIIIllIII[31] = (((30 + 126) - 9) + 2) ^ (((81 + 53) - 52) + 50);
        lIIIIllIII[32] = (-17449) & 20399;
        lIIIIllIII[33] = (-4613) & 8063;
        lIIIIllIII[34] = (48 ^ 90) ^ (44 ^ 84);
        lIIIIllIII[35] = (((156 + 26) - 12) + 6) ^ (((78 + 41) - 98) + 142);
        lIIIIllIII[36] = 139 ^ 159;
        lIIIIllIII[37] = 149 ^ 128;
        lIIIIllIII[38] = 15 ^ 25;
    }

    private static boolean lllIIIllIllI(int i, int i2) {
        return i > i2;
    }

    private static String lllIIIlIlIll(String lllIlIIIIIlI, String lllIlIIIIIIl) {
        String str = new String(Base64.getDecoder().decode(lllIlIIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIlIIIIIII = new StringBuilder();
        char[] lllIIlllllll = lllIlIIIIIIl.toCharArray();
        int lllIIllllllI = lIIIIllIII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIIIllIII[0];
        while (lllIIIllIIIl(i, length)) {
            char lllIlIIIIIll = charArray[i];
            lllIlIIIIIII.append((char) (lllIlIIIIIll ^ lllIIlllllll[lllIIllllllI % lllIIlllllll.length]));
            "".length();
            lllIIllllllI++;
            i++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllIlIIIIIII);
    }

    private static boolean lllIIIllIlII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x01c8, code lost:
        if (lllIIIllIlIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.S.lIIIIllIII[9]) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x020a, code lost:
        if (lllIIIllIlIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.S.lIIIIllIII[3]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x024d, code lost:
        if (lllIIIllIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.S.lIIIIllIII[6]) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0250, code lost:
        Q();
        java.lang.System.out.println(p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.S.lIIIIlIlll[p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.S.lIIIIllIII[12]]);
        p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.S.bv = p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.S.lIIIIllIII[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x026b, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v144, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v159, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v201, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void cT() {
        if (lllIIIllIIII(bv ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIlIlll[lIIIIllIII[0]];
            C0001b.a(bx);
            if (lllIIIllIIIl(bx.size(), lIIIIllIII[1])) {
                System.out.println(lIIIIlIlll[lIIIIllIII[1]]);
                bv = lIIIIllIII[0];
            }
        }
        if (lllIIIllIIlI(bv ? 1 : 0)) {
            if (lllIIIllIIII(Inventory.contains(C0005f.bc) ? 1 : 0) && lllIIIllIIIl(Movement.getRunEnergy(), lIIIIllIII[2])) {
                Inventory.getFirst(C0005f.bc).interact(lIIIIlIlll[lIIIIllIII[3]]);
                Time.sleepTicks(lIIIIllIII[1]);
                "".length();
            }
            if (lllIIIllIIlI(Movement.isRunEnabled() ? 1 : 0) && lllIIIllIIll(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (lllIIIllIIlI(an() ? 1 : 0) && lllIIIllIIIl(C0004e.j(lIIIIllIII[4]), lIIIIllIII[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lllIIIllIlII(nearest) && lllIIIllIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIlIlll[lIIIIllIII[5]];
                    C0000a.a(nearest);
                    Time.sleepTicks(lIIIIllIII[3]);
                    "".length();
                }
                if (lllIIIllIlII(nearest) && lllIIIllIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIlIlll[lIIIIllIII[6]];
                    if (lllIIIllIIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIIllIII[7]);
                        "".length();
                    }
                    if (lllIIIllIIII(Bank.isOpen() ? 1 : 0)) {
                        if (lllIIIllIIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIIllIII[6]);
                            "".length();
                        }
                        if (lllIIIllIIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIIllIII[3]);
                            "".length();
                        }
                        int[] iArr = new int[lIIIIllIII[1]];
                        iArr[lIIIIllIII[0]] = lIIIIllIII[8];
                        if (lllIIIllIIII(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lIIIIllIII[1]];
                            iArr2[lIIIIllIII[0]] = lIIIIllIII[8];
                        }
                        int[] iArr3 = new int[lIIIIllIII[1]];
                        iArr3[lIIIIllIII[0]] = lIIIIllIII[10];
                        if (lllIIIllIIII(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIIIIllIII[1]];
                            iArr4[lIIIIllIII[0]] = lIIIIllIII[10];
                        }
                        int[] iArr5 = new int[lIIIIllIII[1]];
                        iArr5[lIIIIllIII[0]] = lIIIIllIII[11];
                        if (lllIIIllIIII(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lIIIIllIII[1]];
                            iArr6[lIIIIllIII[0]] = lIIIIllIII[11];
                        }
                        int[] iArr7 = new int[lIIIIllIII[6]];
                        iArr7[lIIIIllIII[0]] = lIIIIllIII[11];
                        iArr7[lIIIIllIII[1]] = lIIIIllIII[10];
                        iArr7[lIIIIllIII[3]] = lIIIIllIII[8];
                        iArr7[lIIIIllIII[5]] = lIIIIllIII[13];
                        if (lllIIIllIIlI(C0004e.d(iArr7) ? 1 : 0)) {
                            Q();
                            System.out.println(lIIIIlIlll[lIIIIllIII[9]]);
                            bv = lIIIIllIII[1];
                            return;
                        }
                        int[] iArr8 = new int[lIIIIllIII[6]];
                        iArr8[lIIIIllIII[0]] = lIIIIllIII[11];
                        iArr8[lIIIIllIII[1]] = lIIIIllIII[10];
                        iArr8[lIIIIllIII[3]] = lIIIIllIII[8];
                        iArr8[lIIIIllIII[5]] = lIIIIllIII[13];
                        if (lllIIIllIIII(C0004e.d(iArr8) ? 1 : 0)) {
                            C0000a.a(lIIIIllIII[11], lIIIIllIII[6]);
                            C0000a.a(lIIIIllIII[10], lIIIIllIII[3]);
                            C0000a.a(lIIIIllIII[8], lIIIIllIII[9]);
                            C0000a.a(lIIIIllIII[13], lIIIIllIII[1]);
                        }
                        if (lllIIIllIIII(AccBuilderGWD.e ? 1 : 0)) {
                            C0000a.b(C0005f.bm, lIIIIllIII[1]);
                        }
                    }
                }
            }
            if (lllIIIllIIlI(an() ? 1 : 0) && lllIIIllIIll(C0004e.j(lIIIIllIII[4])) && lllIIIllIllI(Players.getLocal().getWorldLocation().distanceTo(kZ), lIIIIllIII[12])) {
                bm();
            }
            if ((!lllIIIllIIlI(an() ? 1 : 0) || lllIIIllIlll(Players.getLocal().getWorldLocation().distanceTo(kZ), lIIIIllIII[12])) && lllIIIllIIIl(C0004e.j(lIIIIllIII[4]), lIIIIllIII[14])) {
                if (lllIIIllIllI(Players.getLocal().getWorldLocation().distanceTo(kZ), lIIIIllIII[6])) {
                    dk = lIIIIllIII[0];
                    AccBuilderGWD.c = lIIIIlIlll[lIIIIllIII[15]];
                    if (lllIIIllIIIl(cI, lIIIIllIII[1])) {
                        C0004e.x();
                        cI += lIIIIllIII[1];
                    }
                    Movement.walkTo(kZ);
                    "".length();
                }
                if (lllIIIllIlll(Players.getLocal().getWorldLocation().distanceTo(kZ), lIIIIllIII[9])) {
                    AccBuilderGWD.c = lIIIIlIlll[lIIIIllIII[16]];
                    String[] strArr = new String[lIIIIllIII[1]];
                    strArr[lIIIIllIII[0]] = lIIIIlIlll[lIIIIllIII[17]];
                    TileObject nearest2 = TileObjects.getNearest(strArr);
                    if (lllIIIllIlII(nearest2)) {
                        String[] strArr2 = new String[lIIIIllIII[1]];
                        strArr2[lIIIIllIII[0]] = lIIIIlIlll[lIIIIllIII[18]];
                        if (lllIIIllIIII(nearest2.hasAction(strArr2) ? 1 : 0)) {
                            nearest2.interact(lIIIIlIlll[lIIIIllIII[19]]);
                            Time.sleepTicks(lIIIIllIII[5]);
                            "".length();
                        }
                    }
                    if (lllIIIllIIIl(dk, lIIIIllIII[1])) {
                        as.pY += lIIIIllIII[1];
                        as.u(AccBuilderGWD.m);
                        dk += lIIIIllIII[1];
                        as.pY = lIIIIllIII[0];
                        dl = lIIIIllIII[0];
                    }
                    C0006g.a(lIIIIlIlll[lIIIIllIII[20]], la);
                }
            }
            C0006g.a(new String[lIIIIllIII[0]]);
        }
        System.out.println("Setting: " + C0004e.j(lIIIIllIII[4]));
    }

    private static boolean lllIIIllIIll(int i) {
        return i > 0;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return lIIIIlIlll[lIIIIllIII[30]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    private static void bm() {
        BankLocation nearest = BankLocation.getNearest();
        if (lllIIIllIlII(nearest) && lllIIIllIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIlIlll[lIIIIllIII[21]];
            C0000a.a(nearest);
            Time.sleepTicks(lIIIIllIII[3]);
            "".length();
        }
        if (lllIIIllIlII(nearest) && lllIIIllIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIlIlll[lIIIIllIII[22]];
            if (lllIIIllIIlI(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIIIIllIII[7]);
                "".length();
            }
            if (lllIIIllIIII(Bank.isOpen() ? 1 : 0)) {
                if (lllIIIllIIll(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lIIIIllIII[6]);
                    "".length();
                }
                if (lllIIIllIIll(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(lIIIIllIII[3]);
                    "".length();
                }
                int[] iArr = new int[lIIIIllIII[6]];
                iArr[lIIIIllIII[0]] = lIIIIllIII[11];
                iArr[lIIIIllIII[1]] = lIIIIllIII[10];
                iArr[lIIIIllIII[3]] = lIIIIllIII[8];
                iArr[lIIIIllIII[5]] = lIIIIllIII[13];
                if (lllIIIllIIlI(C0004e.d(iArr) ? 1 : 0)) {
                    Q();
                    System.out.println(lIIIIlIlll[lIIIIllIII[23]]);
                    bv = lIIIIllIII[1];
                    return;
                }
                int[] iArr2 = new int[lIIIIllIII[6]];
                iArr2[lIIIIllIII[0]] = lIIIIllIII[11];
                iArr2[lIIIIllIII[1]] = lIIIIllIII[10];
                iArr2[lIIIIllIII[3]] = lIIIIllIII[8];
                iArr2[lIIIIllIII[5]] = lIIIIllIII[13];
                if (lllIIIllIIII(C0004e.d(iArr2) ? 1 : 0)) {
                    C0000a.a(lIIIIllIII[11], lIIIIllIII[6]);
                    C0000a.a(lIIIIllIII[10], lIIIIllIII[3]);
                    C0000a.a(lIIIIllIII[8], lIIIIllIII[9]);
                    C0000a.a(lIIIIllIII[13], lIIIIllIII[1]);
                }
                C0000a.b(C0005f.bm, lIIIIllIII[1]);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[lIIIIllIII[1]];
        iArr[lIIIIllIII[0]] = lIIIIllIII[8];
        if (lllIIIllIlIl(Inventory.getCount(iArr), lIIIIllIII[9])) {
            int[] iArr2 = new int[lIIIIllIII[1]];
            iArr2[lIIIIllIII[0]] = lIIIIllIII[10];
            if (lllIIIllIlIl(Inventory.getCount(iArr2), lIIIIllIII[3])) {
                int[] iArr3 = new int[lIIIIllIII[1]];
                iArr3[lIIIIllIII[0]] = lIIIIllIII[11];
                if (lllIIIllIlIl(Inventory.getCount(iArr3), lIIIIllIII[6])) {
                    ?? r0 = lIIIIllIII[1];
                    "".length();
                    return ((((22 + 168) - 123) + 130) ^ (((61 + 74) - (-54)) + 4)) < ((((176 ^ 153) & ((183 ^ 158) ^ (-1))) ^ (70 ^ 116)) & (((((101 + 148) - 201) + 107) ^ (((106 + 111) - 118) + 70)) ^ (-" ".length()))) ? ((202 ^ 180) ^ (182 ^ 198)) & ((((223 ^ 145) & ((56 ^ 118) ^ (-1))) ^ (114 ^ 124)) ^ (-" ".length())) : r0;
                }
            }
        }
        return lIIIIllIII[0];
    }

    private static boolean lllIIIllIIIl(int i, int i2) {
        return i < i2;
    }

    private static String lllIIIlIllIl(String lllIlIIlIIlI, String lllIlIIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIlIIlIlII = Cipher.getInstance("Blowfish");
            lllIlIIlIlII.init(lIIIIllIII[3], secretKeySpec);
            return new String(lllIlIIlIlII.doFinal(Base64.getDecoder().decode(lllIlIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIlIIlIIll) {
            lllIlIIlIIll.printStackTrace();
            return null;
        }
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            cT();
            "".length();
            if (((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true))) {
                return (27 ^ 81) & ((126 ^ 52) ^ (-1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lIIIIllIII[18];
    }

    private static boolean lllIIIllIlll(int i, int i2) {
        return i <= i2;
    }
}
