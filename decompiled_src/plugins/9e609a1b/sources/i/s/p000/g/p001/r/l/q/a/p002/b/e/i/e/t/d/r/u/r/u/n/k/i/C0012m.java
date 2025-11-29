package i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.m  reason: invalid package and case insensitive filesystem */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/m.class */
public class C0012m {
    public static /* synthetic */ boolean by;
    private static /* synthetic */ int cr;
    private static /* synthetic */ int[] lIIIlllllllII;
    private static /* synthetic */ int cq;
    private static /* synthetic */ String[] lIIIllllllIll;
    private static /* synthetic */ int[] cs;
    public static /* synthetic */ List<C0003d> bA;

    private static boolean lIlIIllIlIlIlll(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean lIlIIllIlIlIllI(int i2) {
        return i2 > 0;
    }

    private static String lIlIIllIlIIllIl(String lllllllllllllllIIIIIIIIIIlIIIlll, String lllllllllllllllIIIIIIIIIIlIIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIIIIIlIIIllI.getBytes(StandardCharsets.UTF_8)), lIIIlllllllII[11]), "DES");
            Cipher lllllllllllllllIIIIIIIIIIlIIlIIl = Cipher.getInstance("DES");
            lllllllllllllllIIIIIIIIIIlIIlIIl.init(lIIIlllllllII[2], secretKeySpec);
            return new String(lllllllllllllllIIIIIIIIIIlIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIIIIIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIIIIIIlIIlIII) {
            lllllllllllllllIIIIIIIIIIlIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllIlIlIIll(int i2, int i3) {
        return i2 < i3;
    }

    private static String lIlIIllIlIIllll(String lllllllllllllllIIIIIIIIIIIlIIIlI, String lllllllllllllllIIIIIIIIIIIlIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIIIIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIIIIIIIlIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIIIIIIIlIIlII.init(lIIIlllllllII[2], secretKeySpec);
            return new String(lllllllllllllllIIIIIIIIIIIlIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIIIIIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIIIIIIIlIIIll) {
            lllllllllllllllIIIIIIIIIIIlIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllIlIlIlII(int i2) {
        return i2 == 0;
    }

    public static void W() {
        int[] iArr = new int[lIIIlllllllII[1]];
        iArr[lIIIlllllllII[0]] = cq;
        if (lIlIIllIlIlIlII(Bank.contains(iArr) ? 1 : 0)) {
            bA.add(new C0003d(cq, lIIIlllllllII[1], lIIIlllllllII[21]));
            "".length();
        }
        int[] iArr2 = new int[lIIIlllllllII[1]];
        iArr2[lIIIlllllllII[0]] = cr;
        if (lIlIIllIlIlIlII(Bank.contains(iArr2) ? 1 : 0)) {
            bA.add(new C0003d(cr, lIIIlllllllII[1], lIIIlllllllII[22]));
            "".length();
        }
        int[] iArr3 = new int[lIIIlllllllII[1]];
        iArr3[lIIIlllllllII[0]] = lIIIlllllllII[8];
        if (lIlIIllIlIlIlII(Bank.contains(iArr3) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllllllII[8], lIIIlllllllII[1], lIIIlllllllII[23]));
            "".length();
        }
        int[] iArr4 = new int[lIIIlllllllII[1]];
        iArr4[lIIIlllllllII[0]] = lIIIlllllllII[7];
        if (lIlIIllIlIlIlII(Bank.contains(iArr4) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllllllII[7], lIIIlllllllII[1], lIIIlllllllII[24]));
            "".length();
        }
        int[] iArr5 = new int[lIIIlllllllII[1]];
        iArr5[lIIIlllllllII[0]] = lIIIlllllllII[25];
        if (lIlIIllIlIlIlII(Bank.contains(iArr5) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllllllII[25], lIIIlllllllII[5], lIIIlllllllII[13]));
            "".length();
        }
        int[] iArr6 = new int[lIIIlllllllII[1]];
        iArr6[lIIIlllllllII[0]] = lIIIlllllllII[26];
        if (lIlIIllIlIlIlII(Bank.contains(iArr6) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllllllII[26], lIIIlllllllII[27], lIIIlllllllII[13]));
            "".length();
        }
        int[] iArr7 = new int[lIIIlllllllII[1]];
        iArr7[lIIIlllllllII[0]] = lIIIlllllllII[28];
        if (lIlIIllIlIlIlII(Bank.contains(iArr7) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllllllII[28], lIIIlllllllII[29], lIIIlllllllII[13]));
            "".length();
        }
        int[] iArr8 = new int[lIIIlllllllII[1]];
        iArr8[lIIIlllllllII[0]] = lIIIlllllllII[30];
        if (lIlIIllIlIlIlII(Bank.contains(iArr8) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllllllII[30], lIIIlllllllII[31], lIIIlllllllII[13]));
            "".length();
        }
        int[] iArr9 = new int[lIIIlllllllII[1]];
        iArr9[lIIIlllllllII[0]] = lIIIlllllllII[25];
        if (lIlIIllIlIlIIlI(Bank.contains(iArr9) ? 1 : 0)) {
            int[] iArr10 = new int[lIIIlllllllII[1]];
            iArr10[lIIIlllllllII[0]] = lIIIlllllllII[25];
            if (lIlIIllIlIlIIll(Bank.getFirst(iArr10).getQuantity(), lIIIlllllllII[32])) {
                bA.add(new C0003d(lIIIlllllllII[25], lIIIlllllllII[5], lIIIlllllllII[13]));
                "".length();
            }
        }
        int[] iArr11 = new int[lIIIlllllllII[1]];
        iArr11[lIIIlllllllII[0]] = lIIIlllllllII[26];
        if (lIlIIllIlIlIIlI(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[lIIIlllllllII[1]];
            iArr12[lIIIlllllllII[0]] = lIIIlllllllII[26];
            if (lIlIIllIlIlIIll(Bank.getFirst(iArr12).getQuantity(), lIIIlllllllII[32])) {
                bA.add(new C0003d(lIIIlllllllII[26], lIIIlllllllII[27], lIIIlllllllII[13]));
                "".length();
            }
        }
        int[] iArr13 = new int[lIIIlllllllII[1]];
        iArr13[lIIIlllllllII[0]] = lIIIlllllllII[28];
        if (lIlIIllIlIlIIlI(Bank.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[lIIIlllllllII[1]];
            iArr14[lIIIlllllllII[0]] = lIIIlllllllII[28];
            if (lIlIIllIlIlIIll(Bank.getFirst(iArr14).getQuantity(), lIIIlllllllII[32])) {
                bA.add(new C0003d(lIIIlllllllII[28], lIIIlllllllII[29], lIIIlllllllII[13]));
                "".length();
            }
        }
        int[] iArr15 = new int[lIIIlllllllII[1]];
        iArr15[lIIIlllllllII[0]] = lIIIlllllllII[30];
        if (lIlIIllIlIlIIlI(Bank.contains(iArr15) ? 1 : 0)) {
            int[] iArr16 = new int[lIIIlllllllII[1]];
            iArr16[lIIIlllllllII[0]] = lIIIlllllllII[30];
            if (lIlIIllIlIlIIll(Bank.getFirst(iArr16).getQuantity(), lIIIlllllllII[32])) {
                bA.add(new C0003d(lIIIlllllllII[30], lIIIlllllllII[31], lIIIlllllllII[13]));
                "".length();
            }
        }
        if (lIlIIllIlIlIlII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIllllllIll[lIIIlllllllII[40]]);
        }) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllllllII[33], lIIIlllllllII[6], lIIIlllllllII[34]));
            "".length();
        }
        int[] iArr17 = new int[lIIIlllllllII[1]];
        iArr17[lIIIlllllllII[0]] = lIIIlllllllII[35];
        if (lIlIIllIlIlIlII(Bank.contains(iArr17) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllllllII[35], lIIIlllllllII[36], lIIIlllllllII[37]));
            "".length();
        }
    }

    private static boolean lIlIIllIlIlIlIl(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIllIlIlIIlI(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean av() {
        String[] strArr = new String[lIIIlllllllII[1]];
        strArr[lIIIlllllllII[0]] = lIIIllllllIll[lIIIlllllllII[19]];
        if (lIlIIllIlIlIIlI(Equipment.contains(strArr) ? 1 : 0)) {
            int[] iArr = new int[lIIIlllllllII[1]];
            iArr[lIIIlllllllII[0]] = lIIIlllllllII[8];
            if (lIlIIllIlIlIIlI(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIIlllllllII[1]];
                iArr2[lIIIlllllllII[0]] = lIIIlllllllII[7];
                if (lIlIIllIlIlIIlI(Equipment.contains(iArr2) ? 1 : 0)) {
                    String[] strArr2 = new String[lIIIlllllllII[1]];
                    strArr2[lIIIlllllllII[0]] = lIIIllllllIll[lIIIlllllllII[20]];
                    if (lIlIIllIlIlIIlI(Equipment.contains(strArr2) ? 1 : 0)) {
                        ?? r0 = lIIIlllllllII[1];
                        "".length();
                        return "   ".length() != "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
            }
        }
        return lIIIlllllllII[0];
    }

    static {
        lIlIIllIlIlIIIl();
        lIlIIllIlIlIIII();
        bA = new ArrayList();
        cq = lIIIlllllllII[41];
        cr = lIIIlllllllII[42];
        int[] iArr = new int[lIIIlllllllII[4]];
        iArr[lIIIlllllllII[0]] = cq;
        iArr[lIIIlllllllII[1]] = cr;
        iArr[lIIIlllllllII[2]] = lIIIlllllllII[8];
        iArr[lIIIlllllllII[3]] = lIIIlllllllII[7];
        cs = iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean au() {
        String[] strArr = new String[lIIIlllllllII[1]];
        strArr[lIIIlllllllII[0]] = lIIIllllllIll[lIIIlllllllII[17]];
        if (lIlIIllIlIlIIlI(Inventory.contains(strArr) ? 1 : 0)) {
            int[] iArr = new int[lIIIlllllllII[1]];
            iArr[lIIIlllllllII[0]] = lIIIlllllllII[8];
            if (lIlIIllIlIlIIlI(Inventory.contains(iArr) ? 1 : 0)) {
                String[] strArr2 = new String[lIIIlllllllII[1]];
                strArr2[lIIIlllllllII[0]] = lIIIllllllIll[lIIIlllllllII[18]];
                if (lIlIIllIlIlIIlI(Inventory.contains(strArr2) ? 1 : 0) && lIlIIllIlIlIIlI(Inventory.contains(C0005f.aS) ? 1 : 0)) {
                    ?? r0 = lIIIlllllllII[1];
                    "".length();
                    return 0 != 0 ? ((208 ^ 168) ^ (246 ^ 132)) & (((((84 + 67) - 53) + 32) ^ (((77 + 101) - 98) + 56)) ^ (-" ".length())) : r0;
                }
            }
        }
        return lIIIlllllllII[0];
    }

    private static void lIlIIllIlIlIIIl() {
        lIIIlllllllII = new int[44];
        lIIIlllllllII[0] = ((75 ^ 79) ^ (73 ^ 108)) & (((((107 + 144) - 187) + 92) ^ (((185 + 40) - 104) + 68)) ^ (-" ".length()));
        lIIIlllllllII[1] = " ".length();
        lIIIlllllllII[2] = "  ".length();
        lIIIlllllllII[3] = "   ".length();
        lIIIlllllllII[4] = 145 ^ 149;
        lIIIlllllllII[5] = (-87) & 5086;
        lIIIlllllllII[6] = 103 ^ 98;
        lIIIlllllllII[7] = (-((-2081) & 24103)) & (-2) & 24575;
        lIIIlllllllII[8] = (-344) & 2047;
        lIIIlllllllII[9] = (((102 + 180) - 243) + 149) ^ (((148 + 17) - (-12)) + 9);
        lIIIlllllllII[10] = (((96 + 136) - 125) + 48) ^ (((154 + 131) - 196) + 67);
        lIIIlllllllII[11] = (63 ^ 113) ^ (122 ^ 60);
        lIIIlllllllII[12] = (40 ^ 96) ^ (100 ^ 37);
        lIIIlllllllII[13] = (((103 + 131) - 130) + 38) ^ (((74 + 52) - 34) + 40);
        lIIIlllllllII[14] = 49 ^ 58;
        lIIIlllllllII[15] = (211 ^ 161) ^ (106 ^ 20);
        lIIIlllllllII[16] = (-((-14341) & 14879)) & (-16513) & 23550;
        lIIIlllllllII[17] = (((82 + 44) - 94) + 112) ^ (((18 + 153) - 21) + 7);
        lIIIlllllllII[18] = 201 ^ 199;
        lIIIlllllllII[19] = (((3 + 188) - 90) + 101) ^ (((82 + 116) - 80) + 79);
        lIIIlllllllII[20] = 106 ^ 122;
        lIIIlllllllII[21] = (-3841) & 12250;
        lIIIlllllllII[22] = (-25105) & 26614;
        lIIIlllllllII[23] = (-((-28481) & 32738)) & (-1) & 32767;
        lIIIlllllllII[24] = (-((-17673) & 20282)) & (-5) & 8063;
        lIIIlllllllII[25] = (-2049) & 2606;
        lIIIlllllllII[26] = (-7445) & 7999;
        lIIIlllllllII[27] = (-2) & 3001;
        lIIIlllllllII[28] = (-((-9227) & 32219)) & (-3) & 23551;
        lIIIlllllllII[29] = (-(41 ^ 44)) & (-4188) & 8191;
        lIIIlllllllII[30] = (-((-805) & 32758)) & (-5) & 32511;
        lIIIlllllllII[31] = (-8347) & 16346;
        lIIIlllllllII[32] = (-((-2494) & 28095)) & (-6145) & 32245;
        lIIIlllllllII[33] = (-17) & 11996;
        lIIIlllllllII[34] = (-((-8241) & 13368)) & (-593) & 30719;
        lIIIlllllllII[35] = (-((-6767) & 31487)) & (-41) & 32767;
        lIIIlllllllII[36] = (-5159) & 5558;
        lIIIlllllllII[37] = (-1130) & 2029;
        lIIIlllllllII[38] = (((99 + 2) - 70) + 141) ^ (((46 + 129) - (-2)) + 12);
        lIIIlllllllII[39] = 33 ^ 51;
        lIIIlllllllII[40] = (9 ^ 95) ^ (43 ^ 110);
        lIIIlllllllII[41] = (-((-43) & 28859)) & (-2057) & 32253;
        lIIIlllllllII[42] = (-((-25657) & 30461)) & (-10497) & 16359;
        lIIIlllllllII[43] = 111 ^ 123;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0179, code lost:
        if (lIlIIllIlIlIlll(net.unethicalite.api.items.Inventory.getCount(r0), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0012m.lIIIlllllllII[1]) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ad, code lost:
        if (lIlIIllIlIlIIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01ec, code lost:
        if (lIlIIllIlIlIlll(net.unethicalite.api.items.Inventory.getCount(r0), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0012m.lIIIlllllllII[1]) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x022b, code lost:
        if (lIlIIllIlIlIIll(net.unethicalite.api.items.Inventory.getCount(r0), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0012m.lIIIlllllllII[1]) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x022e, code lost:
        W();
        java.lang.System.out.println(i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0012m.lIIIllllllIll[i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0012m.lIIIlllllllII[9]]);
        i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0012m.by = i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0012m.lIIIlllllllII[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0249, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v194, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v227, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void at() {
        if (lIlIIllIlIlIIlI(by ? 1 : 0)) {
            AccBuilderRat.c = lIIIllllllIll[lIIIlllllllII[0]];
            C0001b.a(bA);
            if (lIlIIllIlIlIIll(bA.size(), lIIIlllllllII[1])) {
                System.out.println(lIIIllllllIll[lIIIlllllllII[1]]);
                by = lIIIlllllllII[0];
            }
        }
        if (lIlIIllIlIlIlII(by ? 1 : 0) && lIlIIllIlIlIlII(av() ? 1 : 0)) {
            System.out.println(lIIIllllllIll[lIIIlllllllII[2]]);
            if (lIlIIllIlIlIlII(au() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIllIlIlIlIl(nearest) && lIlIIllIlIlIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllllIll[lIIIlllllllII[3]];
                    C0000a.a(nearest);
                }
                if (lIlIIllIlIlIlIl(nearest) && lIlIIllIlIlIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlIIllIlIlIlII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderRat.c = lIIIllllllIll[lIIIlllllllII[4]];
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIlllllllII[5]);
                        "".length();
                    }
                    if (lIlIIllIlIlIIlI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderRat.c = lIIIllllllIll[lIIIlllllllII[6]];
                        if (lIlIIllIlIlIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIlllllllII[3]);
                            "".length();
                        }
                        if (lIlIIllIlIlIllI(Equipment.getAll().size()) && lIlIIllIlIlIlII(av() ? 1 : 0)) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIlllllllII[2]);
                            "".length();
                        }
                        int[] iArr = new int[lIIIlllllllII[1]];
                        iArr[lIIIlllllllII[0]] = cr;
                        if (lIlIIllIlIlIlII(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lIIIlllllllII[1]];
                            iArr2[lIIIlllllllII[0]] = cr;
                        }
                        int[] iArr3 = new int[lIIIlllllllII[1]];
                        iArr3[lIIIlllllllII[0]] = cq;
                        if (lIlIIllIlIlIlII(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIIIlllllllII[1]];
                            iArr4[lIIIlllllllII[0]] = cq;
                        }
                        int[] iArr5 = new int[lIIIlllllllII[1]];
                        iArr5[lIIIlllllllII[0]] = lIIIlllllllII[7];
                        if (lIlIIllIlIlIlII(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lIIIlllllllII[1]];
                            iArr6[lIIIlllllllII[0]] = lIIIlllllllII[7];
                        }
                        int[] iArr7 = new int[lIIIlllllllII[1]];
                        iArr7[lIIIlllllllII[0]] = lIIIlllllllII[8];
                        if (lIlIIllIlIlIlII(Bank.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[lIIIlllllllII[1]];
                            iArr8[lIIIlllllllII[0]] = lIIIlllllllII[8];
                        }
                        int[] iArr9 = new int[lIIIlllllllII[1]];
                        iArr9[lIIIlllllllII[0]] = cq;
                        if (lIlIIllIlIlIIlI(Bank.contains(iArr9) ? 1 : 0)) {
                            int[] iArr10 = new int[lIIIlllllllII[1]];
                            iArr10[lIIIlllllllII[0]] = cq;
                            if (lIlIIllIlIlIIll(Inventory.getCount(iArr10), lIIIlllllllII[1])) {
                                Bank.withdraw(cq, lIIIlllllllII[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIIlllllllII[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr11 = new int[lIIIlllllllII[1]];
                                    iArr11[lIIIlllllllII[0]] = cq;
                                    if (lIlIIllIlIlIllI(Inventory.getCount(iArr11))) {
                                        ?? r0 = lIIIlllllllII[1];
                                        "".length();
                                        return 0 != 0 ? ((((91 + 194) - 204) + 135) ^ (((72 + 104) - 130) + 113)) & (((115 ^ 53) ^ " ".length()) ^ (-" ".length())) : r0;
                                    }
                                    return lIIIlllllllII[0];
                                }, lIIIlllllllII[5]);
                                "".length();
                            }
                        }
                        int[] iArr11 = new int[lIIIlllllllII[1]];
                        iArr11[lIIIlllllllII[0]] = cr;
                        if (lIlIIllIlIlIIlI(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIIIlllllllII[1]];
                            iArr12[lIIIlllllllII[0]] = cr;
                            if (lIlIIllIlIlIIll(Inventory.getCount(iArr12), lIIIlllllllII[1])) {
                                Bank.withdraw(cr, lIIIlllllllII[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIIlllllllII[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr13 = new int[lIIIlllllllII[1]];
                                    iArr13[lIIIlllllllII[0]] = cr;
                                    if (lIlIIllIlIlIllI(Inventory.getCount(iArr13))) {
                                        ?? r0 = lIIIlllllllII[1];
                                        "".length();
                                        return " ".length() >= "   ".length() ? ((94 ^ 111) ^ (42 ^ 39)) & (((((99 + 60) - 95) + 80) ^ (((140 + 50) - 39) + 21)) ^ (-" ".length())) : r0;
                                    }
                                    return lIIIlllllllII[0];
                                }, lIIIlllllllII[5]);
                                "".length();
                            }
                        }
                        int[] iArr13 = new int[lIIIlllllllII[1]];
                        iArr13[lIIIlllllllII[0]] = lIIIlllllllII[7];
                        if (lIlIIllIlIlIIlI(Bank.contains(iArr13) ? 1 : 0)) {
                            int[] iArr14 = new int[lIIIlllllllII[1]];
                            iArr14[lIIIlllllllII[0]] = lIIIlllllllII[7];
                            if (lIlIIllIlIlIIll(Inventory.getCount(iArr14), lIIIlllllllII[1])) {
                                Bank.withdraw(lIIIlllllllII[7], lIIIlllllllII[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIIlllllllII[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr15 = new int[lIIIlllllllII[1]];
                                    iArr15[lIIIlllllllII[0]] = lIIIlllllllII[7];
                                    if (lIlIIllIlIlIllI(Inventory.getCount(iArr15))) {
                                        ?? r0 = lIIIlllllllII[1];
                                        "".length();
                                        return (-" ".length()) > " ".length() ? ((118 ^ 33) ^ (18 ^ 93)) & (((128 ^ 155) ^ "   ".length()) ^ (-" ".length())) : r0;
                                    }
                                    return lIIIlllllllII[0];
                                }, lIIIlllllllII[5]);
                                "".length();
                            }
                        }
                        int[] iArr15 = new int[lIIIlllllllII[1]];
                        iArr15[lIIIlllllllII[0]] = lIIIlllllllII[8];
                        if (lIlIIllIlIlIIlI(Bank.contains(iArr15) ? 1 : 0)) {
                            int[] iArr16 = new int[lIIIlllllllII[1]];
                            iArr16[lIIIlllllllII[0]] = lIIIlllllllII[8];
                            if (lIlIIllIlIlIIll(Inventory.getCount(iArr16), lIIIlllllllII[1])) {
                                Bank.withdraw(lIIIlllllllII[8], lIIIlllllllII[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIIlllllllII[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr17 = new int[lIIIlllllllII[1]];
                                    iArr17[lIIIlllllllII[0]] = lIIIlllllllII[8];
                                    if (lIlIIllIlIlIllI(Inventory.getCount(iArr17))) {
                                        ?? r0 = lIIIlllllllII[1];
                                        "".length();
                                        return ((145 ^ 135) ^ (165 ^ 182)) <= 0 ? ((64 ^ 57) ^ (243 ^ 153)) & (((84 ^ 56) ^ (((15 + 70) - 76) + 118)) ^ (-" ".length())) : r0;
                                    }
                                    return lIIIlllllllII[0];
                                }, lIIIlllllllII[5]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (lIlIIllIlIlIIlI(au() ? 1 : 0)) {
                if (lIlIIllIlIlIIlI(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (lIlIIllIlIlIlII(Bank.isOpen() ? 1 : 0)) {
                    if (lIlIIllIlIlIIlI(GrandExchange.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepTicks(lIIIlllllllII[1]);
                        "".length();
                    }
                    int i2 = lIIIlllllllII[0];
                    while (lIlIIllIlIlIIll(i2, cs.length)) {
                        int[] iArr17 = new int[lIIIlllllllII[1]];
                        iArr17[lIIIlllllllII[0]] = cs[i2];
                        Item first = Inventory.getFirst(iArr17);
                        if (lIlIIllIlIlIlIl(first)) {
                            int[] iArr18 = new int[lIIIlllllllII[1]];
                            iArr18[lIIIlllllllII[0]] = first.getId();
                            if (lIlIIllIlIlIIlI(Inventory.contains(iArr18) ? 1 : 0)) {
                                String[] strArr = new String[lIIIlllllllII[1]];
                                strArr[lIIIlllllllII[0]] = lIIIllllllIll[lIIIlllllllII[10]];
                                if (lIlIIllIlIlIIlI(first.hasAction(strArr) ? 1 : 0)) {
                                    first.interact(lIIIllllllIll[lIIIlllllllII[11]]);
                                    Time.sleepTicks(lIIIlllllllII[1]);
                                    "".length();
                                }
                                String[] strArr2 = new String[lIIIlllllllII[1]];
                                strArr2[lIIIlllllllII[0]] = lIIIllllllIll[lIIIlllllllII[12]];
                                if (lIlIIllIlIlIIlI(first.hasAction(strArr2) ? 1 : 0)) {
                                    first.interact(lIIIllllllIll[lIIIlllllllII[13]]);
                                    Time.sleepTicks(lIIIlllllllII[1]);
                                    "".length();
                                }
                                String[] strArr3 = new String[lIIIlllllllII[1]];
                                strArr3[lIIIlllllllII[0]] = lIIIllllllIll[lIIIlllllllII[14]];
                                if (lIlIIllIlIlIIlI(first.hasAction(strArr3) ? 1 : 0)) {
                                    first.interact(lIIIllllllIll[lIIIlllllllII[15]]);
                                    Time.sleepTicks(lIIIlllllllII[1]);
                                    "".length();
                                }
                                Time.sleepTicks(lIIIlllllllII[1]);
                                "".length();
                            }
                        }
                        i2++;
                        "".length();
                        if (((176 ^ 153) ^ (94 ^ 115)) > ((20 ^ 105) ^ (83 ^ 42))) {
                            return;
                        }
                    }
                    if (lIlIIllIlIlIIlI(av() ? 1 : 0) && lIlIIllIlIlIlII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIlllllllII[16]);
                        "".length();
                    }
                }
            }
        }
    }

    private static void lIlIIllIlIlIIII() {
        lIIIllllllIll = new String[lIIIlllllllII[43]];
        lIIIllllllIll[lIIIlllllllII[0]] = lIlIIllIlIIllIl("pNtXwouqVTQA5rQ2wtaSWA==", "HQezQ");
        lIIIllllllIll[lIIIlllllllII[1]] = lIlIIllIlIIllIl("9twZeGWGdXgshTzQKThI3cxybHgTcGHLyBur+pMt3uEExp1wGDtiR+t0pZczPBwJBPZbryqQuKk=", "dUIJB");
        lIIIllllllIll[lIIIlllllllII[2]] = lIlIIllIlIIlllI("Nh8DYwoQHRJjABQbBWMSBRMb", "qzwCG");
        lIIIllllllIll[lIIIlllllllII[3]] = lIlIIllIlIIllIl("RRkiV6MIlN/6kgLogO3/6zxl8XeqeQay", "VXObN");
        lIIIllllllIll[lIIIlllllllII[4]] = lIlIIllIlIIllll("A6xkbSj2DwZSJThST+o6DA==", "iLKMp");
        lIIIllllllIll[lIIIlllllllII[6]] = lIlIIllIlIIlllI("IjEELzkDPg1rNws+ASI7DQ==", "jPjKU");
        lIIIllllllIll[lIIIlllllllII[9]] = lIlIIllIlIIllIl("uLoSqOlKOZbWe9kq9ZYuebToNnGa7n1so0xLj+5lvdNxU3oawjMoQ7FIPFBGBJ/CfbZI09l/q+8=", "waFQU");
        lIIIllllllIll[lIIIlllllllII[10]] = lIlIIllIlIIllll("9v7FH70E03Q=", "ftHSJ");
        lIIIllllllIll[lIIIlllllllII[11]] = lIlIIllIlIIllll("u1kkXIF/ZD0=", "ImpRA");
        lIIIllllllIll[lIIIlllllllII[12]] = lIlIIllIlIIllIl("Q6bEcZo8pHo=", "RAMoY");
        lIIIllllllIll[lIIIlllllllII[13]] = lIlIIllIlIIllIl("mO6gISNfUaQ=", "jzWUI");
        lIIIllllllIll[lIIIlllllllII[14]] = lIlIIllIlIIllll("8h4FqhCR3JU=", "oeAdJ");
        lIIIllllllIll[lIIIlllllllII[15]] = lIlIIllIlIIllIl("loUErioFWCE=", "pbTLl");
        lIIIllllllIll[lIIIlllllllII[17]] = lIlIIllIlIIllIl("9yTLd0zBXgZKWi8Y0cP9rQ==", "ibwAX");
        lIIIllllllIll[lIIIlllllllII[18]] = lIlIIllIlIIllIl("r72SBEPPUA4jUcDelhaPXw==", "iedeG");
        lIIIllllllIll[lIIIlllllllII[19]] = lIlIIllIlIIllll("h7gXwlpZW3QOGDrJKKIsFA==", "JuahU");
        lIIIllllllIll[lIIIlllllllII[20]] = lIlIIllIlIIllll("Pek1LhRTDM7Aox5ckvl9pg==", "QjmJx");
        lIIIllllllIll[lIIIlllllllII[38]] = lIlIIllIlIIllIl("yj3JkjjS19Y=", "TiWgA");
        lIIIllllllIll[lIIIlllllllII[39]] = lIlIIllIlIIllll("/0ykzMlmLlw=", "ivIvq");
        lIIIllllllIll[lIIIlllllllII[40]] = lIlIIllIlIIllll("b1DVeCKimugKXZjHc3+eJ7BBcV652Jt2", "OWbjz");
    }

    private static String lIlIIllIlIIlllI(String lllllllllllllllIIIIIIIIIIIllIlll, String lllllllllllllllIIIIIIIIIIIllIllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIIIIIIIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIIIIIIIIllIlIl = new StringBuilder();
        char[] lllllllllllllllIIIIIIIIIIIllIlII = lllllllllllllllIIIIIIIIIIIllIllI.toCharArray();
        int lllllllllllllllIIIIIIIIIIIllIIll = lIIIlllllllII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = lIIIlllllllII[0];
        while (lIlIIllIlIlIIll(i2, length)) {
            char lllllllllllllllIIIIIIIIIIIlllIII = charArray[i2];
            lllllllllllllllIIIIIIIIIIIllIlIl.append((char) (lllllllllllllllIIIIIIIIIIIlllIII ^ lllllllllllllllIIIIIIIIIIIllIlII[lllllllllllllllIIIIIIIIIIIllIIll % lllllllllllllllIIIIIIIIIIIllIlII.length]));
            "".length();
            lllllllllllllllIIIIIIIIIIIllIIll++;
            i2++;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIIIIIIIIllIlIl);
    }

    public static void aw() {
        if (lIlIIllIlIlIIlI(Inventory.contains(C0005f.bk) ? 1 : 0) && lIlIIllIlIlIlII(Equipment.contains(C0005f.bk) ? 1 : 0)) {
            Inventory.getFirst(C0005f.bk).interact(lIIIllllllIll[lIIIlllllllII[38]]);
            Time.sleepTicks(lIIIlllllllII[1]);
            "".length();
        }
        if (lIlIIllIlIlIIlI(Inventory.contains(C0005f.aW) ? 1 : 0) && lIlIIllIlIlIlII(Equipment.contains(C0005f.aW) ? 1 : 0)) {
            Inventory.getFirst(C0005f.aW).interact(lIIIllllllIll[lIIIlllllllII[39]]);
            Time.sleepTicks(lIIIlllllllII[1]);
            "".length();
        }
    }
}
