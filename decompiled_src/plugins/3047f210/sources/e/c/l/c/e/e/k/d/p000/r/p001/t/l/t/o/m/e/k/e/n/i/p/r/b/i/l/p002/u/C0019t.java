package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

import gg.squire.account.AccBuilderTempleTrek;
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
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.t  reason: invalid package and case insensitive filesystem */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/t.class */
public class C0019t {
    private static /* synthetic */ String[] lllIllIlIl;
    private static /* synthetic */ int ds;
    private static /* synthetic */ int dt;
    public static /* synthetic */ List<C0003d> bu;
    public static /* synthetic */ boolean bs;
    private static /* synthetic */ int[] du;
    private static /* synthetic */ int[] lllIllIllI;

    public static void ae() {
        int[] iArr = new int[lllIllIllI[1]];
        iArr[lllIllIllI[0]] = ds;
        if (llIIlIIIllIlI(Bank.contains(iArr) ? 1 : 0)) {
            bu.add(new C0003d(ds, lllIllIllI[1], lllIllIllI[21]));
            "".length();
        }
        int[] iArr2 = new int[lllIllIllI[1]];
        iArr2[lllIllIllI[0]] = dt;
        if (llIIlIIIllIlI(Bank.contains(iArr2) ? 1 : 0)) {
            bu.add(new C0003d(dt, lllIllIllI[1], lllIllIllI[22]));
            "".length();
        }
        int[] iArr3 = new int[lllIllIllI[1]];
        iArr3[lllIllIllI[0]] = lllIllIllI[8];
        if (llIIlIIIllIlI(Bank.contains(iArr3) ? 1 : 0)) {
            bu.add(new C0003d(lllIllIllI[8], lllIllIllI[1], lllIllIllI[23]));
            "".length();
        }
        int[] iArr4 = new int[lllIllIllI[1]];
        iArr4[lllIllIllI[0]] = lllIllIllI[7];
        if (llIIlIIIllIlI(Bank.contains(iArr4) ? 1 : 0)) {
            bu.add(new C0003d(lllIllIllI[7], lllIllIllI[1], lllIllIllI[24]));
            "".length();
        }
        int[] iArr5 = new int[lllIllIllI[1]];
        iArr5[lllIllIllI[0]] = lllIllIllI[25];
        if (llIIlIIIllIlI(Bank.contains(iArr5) ? 1 : 0)) {
            bu.add(new C0003d(lllIllIllI[25], lllIllIllI[5], lllIllIllI[13]));
            "".length();
        }
        int[] iArr6 = new int[lllIllIllI[1]];
        iArr6[lllIllIllI[0]] = lllIllIllI[26];
        if (llIIlIIIllIlI(Bank.contains(iArr6) ? 1 : 0)) {
            bu.add(new C0003d(lllIllIllI[26], lllIllIllI[27], lllIllIllI[13]));
            "".length();
        }
        int[] iArr7 = new int[lllIllIllI[1]];
        iArr7[lllIllIllI[0]] = lllIllIllI[28];
        if (llIIlIIIllIlI(Bank.contains(iArr7) ? 1 : 0)) {
            bu.add(new C0003d(lllIllIllI[28], lllIllIllI[29], lllIllIllI[13]));
            "".length();
        }
        int[] iArr8 = new int[lllIllIllI[1]];
        iArr8[lllIllIllI[0]] = lllIllIllI[30];
        if (llIIlIIIllIlI(Bank.contains(iArr8) ? 1 : 0)) {
            bu.add(new C0003d(lllIllIllI[30], lllIllIllI[31], lllIllIllI[13]));
            "".length();
        }
        int[] iArr9 = new int[lllIllIllI[1]];
        iArr9[lllIllIllI[0]] = lllIllIllI[25];
        if (llIIlIIIllIII(Bank.contains(iArr9) ? 1 : 0)) {
            int[] iArr10 = new int[lllIllIllI[1]];
            iArr10[lllIllIllI[0]] = lllIllIllI[25];
            if (llIIlIIIllIIl(Bank.getFirst(iArr10).getQuantity(), lllIllIllI[32])) {
                bu.add(new C0003d(lllIllIllI[25], lllIllIllI[5], lllIllIllI[13]));
                "".length();
            }
        }
        int[] iArr11 = new int[lllIllIllI[1]];
        iArr11[lllIllIllI[0]] = lllIllIllI[26];
        if (llIIlIIIllIII(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[lllIllIllI[1]];
            iArr12[lllIllIllI[0]] = lllIllIllI[26];
            if (llIIlIIIllIIl(Bank.getFirst(iArr12).getQuantity(), lllIllIllI[32])) {
                bu.add(new C0003d(lllIllIllI[26], lllIllIllI[27], lllIllIllI[13]));
                "".length();
            }
        }
        int[] iArr13 = new int[lllIllIllI[1]];
        iArr13[lllIllIllI[0]] = lllIllIllI[28];
        if (llIIlIIIllIII(Bank.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[lllIllIllI[1]];
            iArr14[lllIllIllI[0]] = lllIllIllI[28];
            if (llIIlIIIllIIl(Bank.getFirst(iArr14).getQuantity(), lllIllIllI[32])) {
                bu.add(new C0003d(lllIllIllI[28], lllIllIllI[29], lllIllIllI[13]));
                "".length();
            }
        }
        int[] iArr15 = new int[lllIllIllI[1]];
        iArr15[lllIllIllI[0]] = lllIllIllI[30];
        if (llIIlIIIllIII(Bank.contains(iArr15) ? 1 : 0)) {
            int[] iArr16 = new int[lllIllIllI[1]];
            iArr16[lllIllIllI[0]] = lllIllIllI[30];
            if (llIIlIIIllIIl(Bank.getFirst(iArr16).getQuantity(), lllIllIllI[32])) {
                bu.add(new C0003d(lllIllIllI[30], lllIllIllI[31], lllIllIllI[13]));
                "".length();
            }
        }
        if (llIIlIIIllIlI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lllIllIlIl[lllIllIllI[40]]);
        }) ? 1 : 0)) {
            bu.add(new C0003d(lllIllIllI[33], lllIllIllI[6], lllIllIllI[34]));
            "".length();
        }
        int[] iArr17 = new int[lllIllIllI[1]];
        iArr17[lllIllIllI[0]] = lllIllIllI[35];
        if (llIIlIIIllIlI(Bank.contains(iArr17) ? 1 : 0)) {
            bu.add(new C0003d(lllIllIllI[35], lllIllIllI[36], lllIllIllI[37]));
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean bl() {
        String[] strArr = new String[lllIllIllI[1]];
        strArr[lllIllIllI[0]] = lllIllIlIl[lllIllIllI[19]];
        if (llIIlIIIllIII(Equipment.contains(strArr) ? 1 : 0)) {
            int[] iArr = new int[lllIllIllI[1]];
            iArr[lllIllIllI[0]] = lllIllIllI[8];
            if (llIIlIIIllIII(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllIllIllI[1]];
                iArr2[lllIllIllI[0]] = lllIllIllI[7];
                if (llIIlIIIllIII(Equipment.contains(iArr2) ? 1 : 0)) {
                    String[] strArr2 = new String[lllIllIllI[1]];
                    strArr2[lllIllIllI[0]] = lllIllIlIl[lllIllIllI[20]];
                    if (llIIlIIIllIII(Equipment.contains(strArr2) ? 1 : 0)) {
                        ?? r0 = lllIllIllI[1];
                        "".length();
                        return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
            }
        }
        return lllIllIllI[0];
    }

    private static String llIIlIIIlIlIl(String lllllllllllllllllIllIlIIIIlIIlII, String lllllllllllllllllIllIlIIIIlIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIlIIIIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIllIllI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIlIIIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllIlIIIIlIIlIl) {
            lllllllllllllllllIllIlIIIIlIIlIl.printStackTrace();
            return null;
        }
    }

    private static String llIIlIIIlIIll(String lllllllllllllllllIllIlIIIIIlIlll, String lllllllllllllllllIllIlIIIIIlIllI) {
        try {
            SecretKeySpec lllllllllllllllllIllIlIIIIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIlIIIIIlIllI.getBytes(StandardCharsets.UTF_8)), lllIllIllI[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIllIllI[2], lllllllllllllllllIllIlIIIIIllIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIlIIIIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllIlIIIIIllIII) {
            lllllllllllllllllIllIlIIIIIllIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIIllIII(int i) {
        return i != 0;
    }

    private static boolean llIIlIIIllIlI(int i) {
        return i == 0;
    }

    public static void bm() {
        if (llIIlIIIllIII(Inventory.contains(C0005f.be) ? 1 : 0) && llIIlIIIllIlI(Equipment.contains(C0005f.be) ? 1 : 0)) {
            Inventory.getFirst(C0005f.be).interact(lllIllIlIl[lllIllIllI[38]]);
            Time.sleepTicks(lllIllIllI[1]);
            "".length();
        }
        if (llIIlIIIllIII(Inventory.contains(C0005f.aQ) ? 1 : 0) && llIIlIIIllIlI(Equipment.contains(C0005f.aQ) ? 1 : 0)) {
            Inventory.getFirst(C0005f.aQ).interact(lllIllIlIl[lllIllIllI[39]]);
            Time.sleepTicks(lllIllIllI[1]);
            "".length();
        }
    }

    private static boolean llIIlIIIlllIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIIlIIIlllII(int i) {
        return i > 0;
    }

    private static boolean llIIlIIIllIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIlIIIllIll(Object obj) {
        return obj != null;
    }

    private static void llIIlIIIlIlll() {
        lllIllIllI = new int[44];
        lllIllIllI[0] = ((245 ^ 142) ^ (220 ^ 169)) & (((17 ^ 13) ^ (129 ^ 147)) ^ (-" ".length()));
        lllIllIllI[1] = " ".length();
        lllIllIllI[2] = "  ".length();
        lllIllIllI[3] = "   ".length();
        lllIllIllI[4] = (((100 + 152) - 106) + 33) ^ (((176 + 22) - 177) + 162);
        lllIllIllI[5] = (-17448) & 22447;
        lllIllIllI[6] = (44 ^ 113) ^ (11 ^ 83);
        lllIllIllI[7] = (-22023) & 24574;
        lllIllIllI[8] = (-14356) & 16059;
        lllIllIllI[9] = 145 ^ 151;
        lllIllIllI[10] = (218 ^ 128) ^ (15 ^ 82);
        lllIllIllI[11] = 142 ^ 134;
        lllIllIllI[12] = 25 ^ 16;
        lllIllIllI[13] = (230 ^ 177) ^ (116 ^ 41);
        lllIllIllI[14] = (229 ^ 142) ^ (226 ^ 130);
        lllIllIllI[15] = (((67 + 25) - 73) + 186) ^ (((96 + 174) - 100) + 23);
        lllIllIllI[16] = (-26115) & 32614;
        lllIllIllI[17] = (((171 + 170) - 203) + 40) ^ (((20 + 68) - 15) + 118);
        lllIllIllI[18] = (166 ^ 160) ^ (77 ^ 69);
        lllIllIllI[19] = 76 ^ 67;
        lllIllIllI[20] = 109 ^ 125;
        lllIllIllI[21] = (-3842) & 12251;
        lllIllIllI[22] = (-4617) & 6126;
        lllIllIllI[23] = (-162) & 28671;
        lllIllIllI[24] = (-16533) & 21982;
        lllIllIllI[25] = (-14737) & 15294;
        lllIllIllI[26] = (-((-14499) & 32183)) & (-4289) & 22527;
        lllIllIllI[27] = (-1026) & 4025;
        lllIllIllI[28] = (-15443) & 15999;
        lllIllIllI[29] = (-12310) & 16309;
        lllIllIllI[30] = (-28054) & 28607;
        lllIllIllI[31] = (-24736) & 32735;
        lllIllIllI[32] = (-((-4405) & 4919)) & (-8202) & 9215;
        lllIllIllI[33] = (-4130) & 16109;
        lllIllIllI[34] = (-((-5540) & 8123)) & (-5121) & 32703;
        lllIllIllI[35] = (-8209) & 16215;
        lllIllIllI[36] = (-4135) & 4534;
        lllIllIllI[37] = (-((-5002) & 32683)) & (-17) & 28597;
        lllIllIllI[38] = 53 ^ 36;
        lllIllIllI[39] = 91 ^ 73;
        lllIllIllI[40] = 7 ^ 20;
        lllIllIllI[41] = (-((-17169) & 27545)) & (-16385) & 28141;
        lllIllIllI[42] = (-((-23) & 17375)) & (-8213) & 26623;
        lllIllIllI[43] = (23 ^ 105) ^ (59 ^ 81);
    }

    static {
        llIIlIIIlIlll();
        llIIlIIIlIllI();
        bu = new ArrayList();
        ds = lllIllIllI[41];
        dt = lllIllIllI[42];
        int[] iArr = new int[lllIllIllI[4]];
        iArr[lllIllIllI[0]] = ds;
        iArr[lllIllIllI[1]] = dt;
        iArr[lllIllIllI[2]] = lllIllIllI[8];
        iArr[lllIllIllI[3]] = lllIllIllI[7];
        du = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0179, code lost:
        if (llIIlIIIlllIl(net.unethicalite.api.items.Inventory.getCount(r0), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0019t.lllIllIllI[1]) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ad, code lost:
        if (llIIlIIIllIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01ec, code lost:
        if (llIIlIIIlllIl(net.unethicalite.api.items.Inventory.getCount(r0), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0019t.lllIllIllI[1]) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x022b, code lost:
        if (llIIlIIIllIIl(net.unethicalite.api.items.Inventory.getCount(r0), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0019t.lllIllIllI[1]) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x022e, code lost:
        ae();
        java.lang.System.out.println(e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0019t.lllIllIlIl[e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0019t.lllIllIllI[9]]);
        e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0019t.bs = e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0019t.lllIllIllI[1];
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
    public static void bj() {
        if (llIIlIIIllIII(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIllIlIl[lllIllIllI[0]];
            C0001b.a(bu);
            if (llIIlIIIllIIl(bu.size(), lllIllIllI[1])) {
                System.out.println(lllIllIlIl[lllIllIllI[1]]);
                bs = lllIllIllI[0];
            }
        }
        if (llIIlIIIllIlI(bs ? 1 : 0) && llIIlIIIllIlI(bl() ? 1 : 0)) {
            System.out.println(lllIllIlIl[lllIllIllI[2]]);
            if (llIIlIIIllIlI(bk() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIlIIIllIll(nearest) && llIIlIIIllIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIllIlIl[lllIllIllI[3]];
                    C0000a.a(nearest);
                }
                if (llIIlIIIllIll(nearest) && llIIlIIIllIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIIlIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllIllIlIl[lllIllIllI[4]];
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIllIllI[5]);
                        "".length();
                    }
                    if (llIIlIIIllIII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllIllIlIl[lllIllIllI[6]];
                        if (llIIlIIIlllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllIllIllI[3]);
                            "".length();
                        }
                        if (llIIlIIIlllII(Equipment.getAll().size()) && llIIlIIIllIlI(bl() ? 1 : 0)) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllIllIllI[2]);
                            "".length();
                        }
                        int[] iArr = new int[lllIllIllI[1]];
                        iArr[lllIllIllI[0]] = dt;
                        if (llIIlIIIllIlI(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lllIllIllI[1]];
                            iArr2[lllIllIllI[0]] = dt;
                        }
                        int[] iArr3 = new int[lllIllIllI[1]];
                        iArr3[lllIllIllI[0]] = ds;
                        if (llIIlIIIllIlI(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lllIllIllI[1]];
                            iArr4[lllIllIllI[0]] = ds;
                        }
                        int[] iArr5 = new int[lllIllIllI[1]];
                        iArr5[lllIllIllI[0]] = lllIllIllI[7];
                        if (llIIlIIIllIlI(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lllIllIllI[1]];
                            iArr6[lllIllIllI[0]] = lllIllIllI[7];
                        }
                        int[] iArr7 = new int[lllIllIllI[1]];
                        iArr7[lllIllIllI[0]] = lllIllIllI[8];
                        if (llIIlIIIllIlI(Bank.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[lllIllIllI[1]];
                            iArr8[lllIllIllI[0]] = lllIllIllI[8];
                        }
                        int[] iArr9 = new int[lllIllIllI[1]];
                        iArr9[lllIllIllI[0]] = ds;
                        if (llIIlIIIllIII(Bank.contains(iArr9) ? 1 : 0)) {
                            int[] iArr10 = new int[lllIllIllI[1]];
                            iArr10[lllIllIllI[0]] = ds;
                            if (llIIlIIIllIIl(Inventory.getCount(iArr10), lllIllIllI[1])) {
                                Bank.withdraw(ds, lllIllIllI[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lllIllIllI[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr11 = new int[lllIllIllI[1]];
                                    iArr11[lllIllIllI[0]] = ds;
                                    if (llIIlIIIlllII(Inventory.getCount(iArr11))) {
                                        ?? r0 = lllIllIllI[1];
                                        "".length();
                                        return 0 != 0 ? ((244 ^ 156) ^ (250 ^ 134)) & (((((31 + 122) - 108) + 82) ^ (83 ^ 56)) ^ (-" ".length())) : r0;
                                    }
                                    return lllIllIllI[0];
                                }, lllIllIllI[5]);
                                "".length();
                            }
                        }
                        int[] iArr11 = new int[lllIllIllI[1]];
                        iArr11[lllIllIllI[0]] = dt;
                        if (llIIlIIIllIII(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lllIllIllI[1]];
                            iArr12[lllIllIllI[0]] = dt;
                            if (llIIlIIIllIIl(Inventory.getCount(iArr12), lllIllIllI[1])) {
                                Bank.withdraw(dt, lllIllIllI[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lllIllIllI[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr13 = new int[lllIllIllI[1]];
                                    iArr13[lllIllIllI[0]] = dt;
                                    if (llIIlIIIlllII(Inventory.getCount(iArr13))) {
                                        ?? r0 = lllIllIllI[1];
                                        "".length();
                                        return (-(35 ^ 38)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lllIllIllI[0];
                                }, lllIllIllI[5]);
                                "".length();
                            }
                        }
                        int[] iArr13 = new int[lllIllIllI[1]];
                        iArr13[lllIllIllI[0]] = lllIllIllI[7];
                        if (llIIlIIIllIII(Bank.contains(iArr13) ? 1 : 0)) {
                            int[] iArr14 = new int[lllIllIllI[1]];
                            iArr14[lllIllIllI[0]] = lllIllIllI[7];
                            if (llIIlIIIllIIl(Inventory.getCount(iArr14), lllIllIllI[1])) {
                                Bank.withdraw(lllIllIllI[7], lllIllIllI[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lllIllIllI[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr15 = new int[lllIllIllI[1]];
                                    iArr15[lllIllIllI[0]] = lllIllIllI[7];
                                    if (llIIlIIIlllII(Inventory.getCount(iArr15))) {
                                        ?? r0 = lllIllIllI[1];
                                        "".length();
                                        return "   ".length() != "   ".length() ? ((((59 + 157) - 98) + 95) ^ (((76 + 80) - 68) + 43)) & (((((216 + 7) - 2) + 18) ^ (((168 + 13) - 62) + 66)) ^ (-" ".length())) : r0;
                                    }
                                    return lllIllIllI[0];
                                }, lllIllIllI[5]);
                                "".length();
                            }
                        }
                        int[] iArr15 = new int[lllIllIllI[1]];
                        iArr15[lllIllIllI[0]] = lllIllIllI[8];
                        if (llIIlIIIllIII(Bank.contains(iArr15) ? 1 : 0)) {
                            int[] iArr16 = new int[lllIllIllI[1]];
                            iArr16[lllIllIllI[0]] = lllIllIllI[8];
                            if (llIIlIIIllIIl(Inventory.getCount(iArr16), lllIllIllI[1])) {
                                Bank.withdraw(lllIllIllI[8], lllIllIllI[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lllIllIllI[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr17 = new int[lllIllIllI[1]];
                                    iArr17[lllIllIllI[0]] = lllIllIllI[8];
                                    if (llIIlIIIlllII(Inventory.getCount(iArr17))) {
                                        ?? r0 = lllIllIllI[1];
                                        "".length();
                                        return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lllIllIllI[0];
                                }, lllIllIllI[5]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (llIIlIIIllIII(bk() ? 1 : 0)) {
                if (llIIlIIIllIII(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (llIIlIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                    if (llIIlIIIllIII(GrandExchange.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepTicks(lllIllIllI[1]);
                        "".length();
                    }
                    int i = lllIllIllI[0];
                    while (llIIlIIIllIIl(i, du.length)) {
                        int[] iArr17 = new int[lllIllIllI[1]];
                        iArr17[lllIllIllI[0]] = du[i];
                        Item first = Inventory.getFirst(iArr17);
                        if (llIIlIIIllIll(first)) {
                            int[] iArr18 = new int[lllIllIllI[1]];
                            iArr18[lllIllIllI[0]] = first.getId();
                            if (llIIlIIIllIII(Inventory.contains(iArr18) ? 1 : 0)) {
                                String[] strArr = new String[lllIllIllI[1]];
                                strArr[lllIllIllI[0]] = lllIllIlIl[lllIllIllI[10]];
                                if (llIIlIIIllIII(first.hasAction(strArr) ? 1 : 0)) {
                                    first.interact(lllIllIlIl[lllIllIllI[11]]);
                                    Time.sleepTicks(lllIllIllI[1]);
                                    "".length();
                                }
                                String[] strArr2 = new String[lllIllIllI[1]];
                                strArr2[lllIllIllI[0]] = lllIllIlIl[lllIllIllI[12]];
                                if (llIIlIIIllIII(first.hasAction(strArr2) ? 1 : 0)) {
                                    first.interact(lllIllIlIl[lllIllIllI[13]]);
                                    Time.sleepTicks(lllIllIllI[1]);
                                    "".length();
                                }
                                String[] strArr3 = new String[lllIllIllI[1]];
                                strArr3[lllIllIllI[0]] = lllIllIlIl[lllIllIllI[14]];
                                if (llIIlIIIllIII(first.hasAction(strArr3) ? 1 : 0)) {
                                    first.interact(lllIllIlIl[lllIllIllI[15]]);
                                    Time.sleepTicks(lllIllIllI[1]);
                                    "".length();
                                }
                                Time.sleepTicks(lllIllIllI[1]);
                                "".length();
                            }
                        }
                        i++;
                        "".length();
                        if ((-" ".length()) != (-" ".length())) {
                            return;
                        }
                    }
                    if (llIIlIIIllIII(bl() ? 1 : 0) && llIIlIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIllIllI[16]);
                        "".length();
                    }
                }
            }
        }
    }

    private static void llIIlIIIlIllI() {
        lllIllIlIl = new String[lllIllIllI[43]];
        lllIllIlIl[lllIllIllI[0]] = llIIlIIIlIIll("EOQm+FzL8egSpu2L6aHFxQ==", "YHtVV");
        lllIllIlIl[lllIllIllI[1]] = llIIlIIIlIIll("aXNXImrYP74SC6IRDCpi+3Dt77jz/Of4GkOnpRhOY7T1bjnLQNeeorl76vyHItIfogzba0du99M=", "PRKBO");
        lllIllIlIl[lllIllIllI[2]] = llIIlIIIlIIll("95+SQD6w5IU6ijtaqJJbBywA19D7LRdd", "AVXMW");
        lllIllIlIl[lllIllIllI[3]] = llIIlIIIlIlII("GQwOEBA2GREXEHcZF1kVNgMT", "Wmxyw");
        lllIllIlIl[lllIllIllI[4]] = llIIlIIIlIlII("ISASOSgAN1c1IAA7", "nPwWA");
        lllIllIlIl[lllIllIllI[6]] = llIIlIIIlIlIl("lkrVDPWsKbst2teU+eptcy9S/u/xSgmd", "gYNEV");
        lllIllIlIl[lllIllIllI[9]] = llIIlIIIlIlII("ICxzJQoSaT4tCwQgPSNYBDwjNBQeLCBoWAQ+OjAbHyA9I1gDJnMGLS4AHQNYIj06KA==", "wISDx");
        lllIllIlIl[lllIllIllI[10]] = llIIlIIIlIIll("Z5GiBVYRjxA=", "bLqbx");
        lllIllIlIl[lllIllIllI[11]] = llIIlIIIlIIll("QOsulTdCVb4=", "jEtxQ");
        lllIllIlIl[lllIllIllI[12]] = llIIlIIIlIlII("Lx0vDiM=", "xtJbG");
        lllIllIlIl[lllIllIllI[13]] = llIIlIIIlIIll("0hYm0YPZ41k=", "ueuik");
        lllIllIlIl[lllIllIllI[14]] = llIIlIIIlIIll("f83oqXfL52g=", "fLFtY");
        lllIllIlIl[lllIllIllI[15]] = llIIlIIIlIIll("0ig0sRgEbT0=", "KsdOw");
        lllIllIlIl[lllIllIllI[17]] = llIIlIIIlIlII("Mi4yPzJBNTV5NQgo", "aZSYT");
        lllIllIlIl[lllIllIllI[18]] = llIIlIIIlIIll("G7cwBGrrKBVRjcaiklExqw==", "ywImY");
        lllIllIlIl[lllIllIllI[19]] = llIIlIIIlIlIl("p9zxkAvy/nL8h7idYs3eoQ==", "Yhkyw");
        lllIllIlIl[lllIllIllI[20]] = llIIlIIIlIIll("70dsapR+UPpaDHkFUFyEeA==", "wEgft");
        lllIllIlIl[lllIllIllI[38]] = llIIlIIIlIlIl("c6OZWDLW7qM=", "unlPh");
        lllIllIlIl[lllIllIllI[39]] = llIIlIIIlIlIl("Xjy5lQlzqns=", "LPyAX");
        lllIllIlIl[lllIllIllI[40]] = llIIlIIIlIIll("PLhDW2KbCM+/L83WkVn7K8SszOnHpU1j", "XNQyn");
    }

    private static String llIIlIIIlIlII(String lllllllllllllllllIllIlIIIIlllIIl, String lllllllllllllllllIllIlIIIIlllIII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllIllIlIIIIlllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllllIllIlIIIIllIllI = lllllllllllllllllIllIlIIIIlllIII.toCharArray();
        int lllllllllllllllllIllIlIIIIllIlIl = lllIllIllI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIllIllI[0];
        while (llIIlIIIllIIl(i, length)) {
            char lllllllllllllllllIllIlIIIIlllIlI = charArray[i];
            sb.append((char) (lllllllllllllllllIllIlIIIIlllIlI ^ lllllllllllllllllIllIlIIIIllIllI[lllllllllllllllllIllIlIIIIllIlIl % lllllllllllllllllIllIlIIIIllIllI.length]));
            "".length();
            lllllllllllllllllIllIlIIIIllIlIl++;
            i++;
            "".length();
            if ((-" ".length()) < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean bk() {
        String[] strArr = new String[lllIllIllI[1]];
        strArr[lllIllIllI[0]] = lllIllIlIl[lllIllIllI[17]];
        if (llIIlIIIllIII(Inventory.contains(strArr) ? 1 : 0)) {
            int[] iArr = new int[lllIllIllI[1]];
            iArr[lllIllIllI[0]] = lllIllIllI[8];
            if (llIIlIIIllIII(Inventory.contains(iArr) ? 1 : 0)) {
                String[] strArr2 = new String[lllIllIllI[1]];
                strArr2[lllIllIllI[0]] = lllIllIlIl[lllIllIllI[18]];
                if (llIIlIIIllIII(Inventory.contains(strArr2) ? 1 : 0) && llIIlIIIllIII(Inventory.contains(C0005f.aM) ? 1 : 0)) {
                    ?? r0 = lllIllIllI[1];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return lllIllIllI[0];
    }
}
