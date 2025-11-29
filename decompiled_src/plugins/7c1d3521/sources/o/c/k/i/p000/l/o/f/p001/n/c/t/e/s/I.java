package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.I  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/I.class */
public class I {
    private static /* synthetic */ int gd;
    private static /* synthetic */ int[] lllIIllIlI;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int[] ge;
    public static /* synthetic */ List<C0017d> bv;
    private static /* synthetic */ int gc;
    private static /* synthetic */ String[] lllIIllIIl;

    private static void llIIIIlIIIIll() {
        lllIIllIlI = new int[44];
        lllIIllIlI[0] = ((80 ^ 65) ^ (182 ^ 134)) & (((249 ^ 188) ^ (111 ^ 11)) ^ (-" ".length()));
        lllIIllIlI[1] = " ".length();
        lllIIllIlI[2] = "  ".length();
        lllIIllIlI[3] = "   ".length();
        lllIIllIlI[4] = 18 ^ 22;
        lllIIllIlI[5] = (-((-429) & 18879)) & (-1125) & 24574;
        lllIIllIlI[6] = (((156 + 5) - 128) + 139) ^ (((63 + 94) - 11) + 23);
        lllIIllIlI[7] = (-((-12417) & 30344)) & (-1) & 20479;
        lllIIllIlI[8] = (-((-3748) & 12023)) & (-16645) & 26623;
        lllIIllIlI[9] = (103 ^ 113) ^ (161 ^ 177);
        lllIIllIlI[10] = (84 ^ 28) ^ (117 ^ 58);
        lllIIllIlI[11] = (((158 + 81) - 162) + 130) ^ (((99 + 43) - 2) + 59);
        lllIIllIlI[12] = 37 ^ 44;
        lllIIllIlI[13] = (((55 + 81) - 23) + 48) ^ (((113 + 98) - 205) + 165);
        lllIIllIlI[14] = (4 ^ 95) ^ (112 ^ 32);
        lllIIllIlI[15] = 131 ^ 143;
        lllIIllIlI[16] = (-17553) & 24052;
        lllIIllIlI[17] = 154 ^ 151;
        lllIIllIlI[18] = 103 ^ 105;
        lllIIllIlI[19] = 85 ^ 90;
        lllIIllIlI[20] = (42 ^ 83) ^ (102 ^ 15);
        lllIIllIlI[21] = (-20997) & 29406;
        lllIIllIlI[22] = (-((-20517) & 30757)) & (-16898) & 28647;
        lllIIllIlI[23] = (-" ".length()) & (-4226) & 32735;
        lllIIllIlI[24] = (-((-3591) & 28167)) & (-2069) & 32094;
        lllIIllIlI[25] = (-((-8754) & 26163)) & (-2257) & 20223;
        lllIIllIlI[26] = (-7169) & 7723;
        lllIIllIlI[27] = (-1090) & 4089;
        lllIIllIlI[28] = (-((-13991) & 32503)) & (-9347) & 28415;
        lllIIllIlI[29] = (-12357) & 16356;
        lllIIllIlI[30] = (-((-1031) & 32215)) & (-1029) & 32766;
        lllIIllIlI[31] = (-(83 ^ 102)) & (-2) & 8053;
        lllIIllIlI[32] = (-17924) & 18423;
        lllIIllIlI[33] = (-((-11113) & 31593)) & (-292) & 32751;
        lllIIllIlI[34] = (-4625) & 29624;
        lllIIllIlI[35] = (-185) & 8191;
        lllIIllIlI[36] = (-1061) & 1460;
        lllIIllIlI[37] = (-((-5890) & 30589)) & (-2049) & 27647;
        lllIIllIlI[38] = 213 ^ 196;
        lllIIllIlI[39] = (((124 + 146) - 128) + 70) ^ (((64 + 59) - (-42)) + 33);
        lllIIllIlI[40] = (((47 + 132) - 143) + 110) ^ (((40 + 94) - 112) + 107);
        lllIIllIlI[41] = (-18435) & 19815;
        lllIIllIlI[42] = (-((-22785) & 23361)) & (-401) & 2035;
        lllIIllIlI[43] = (101 ^ 2) ^ (124 ^ 15);
    }

    private static String llIIIIIllllll(String lllllllllllllllllIlllIIlllllIIll, String lllllllllllllllllIlllIIlllllIIlI) {
        String lllllllllllllllllIlllIIlllllIIll2 = new String(Base64.getDecoder().decode(lllllllllllllllllIlllIIlllllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlllIIlllllIIIl = new StringBuilder();
        char[] lllllllllllllllllIlllIIlllllIIII = lllllllllllllllllIlllIIlllllIIlI.toCharArray();
        int lllllllllllllllllIlllIIllllIllll = lllIIllIlI[0];
        char[] charArray = lllllllllllllllllIlllIIlllllIIll2.toCharArray();
        int length = charArray.length;
        int i = lllIIllIlI[0];
        while (llIIIIlIIIlIl(i, length)) {
            lllllllllllllllllIlllIIlllllIIIl.append((char) (charArray[i] ^ lllllllllllllllllIlllIIlllllIIII[lllllllllllllllllIlllIIllllIllll % lllllllllllllllllIlllIIlllllIIII.length]));
            "".length();
            lllllllllllllllllIlllIIllllIllll++;
            i++;
            "".length();
            if (!(true ^ true)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllIlllIIlllllIIIl);
    }

    private static String llIIIIlIIIIII(String lllllllllllllllllIlllIlIIIIlIIII, String lllllllllllllllllIlllIlIIIIIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIlIIIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlllIlIIIIlIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlllIlIIIIlIIlI.init(lllIIllIlI[2], secretKeySpec);
            return new String(lllllllllllllllllIlllIlIIIIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIlIIIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlllIlIIIIIllII) {
            lllllllllllllllllIlllIlIIIIIllII.printStackTrace();
            return null;
        }
    }

    public static void cp() {
        if (llIIIIlIIIlII(Inventory.contains(C0019f.bk) ? 1 : 0) && llIIIIlIIIllI(Equipment.contains(C0019f.bk) ? 1 : 0)) {
            Inventory.getFirst(C0019f.bk).interact(lllIIllIIl[lllIIllIlI[38]]);
            Time.sleepTicks(lllIIllIlI[1]);
            "".length();
        }
        if (llIIIIlIIIlII(Inventory.contains(C0019f.aW) ? 1 : 0) && llIIIIlIIIllI(Equipment.contains(C0019f.aW) ? 1 : 0)) {
            Inventory.getFirst(C0019f.aW).interact(lllIIllIIl[lllIIllIlI[39]]);
            Time.sleepTicks(lllIIllIlI[1]);
            "".length();
        }
    }

    private static boolean llIIIIlIIIllI(int i) {
        return i == 0;
    }

    private static String llIIIIlIIIIIl(String lllllllllllllllllIlllIlIIIIIIIll, String lllllllllllllllllIlllIlIIIIIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIlIIIIIIIlI.getBytes(StandardCharsets.UTF_8)), lllIIllIlI[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIllIlI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIlIIIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlllIlIIIIIIlII) {
            lllllllllllllllllIlllIlIIIIIIlII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean cn() {
        String[] strArr = new String[lllIIllIlI[1]];
        strArr[lllIIllIlI[0]] = lllIIllIIl[lllIIllIlI[17]];
        if (llIIIIlIIIlII(Inventory.contains(strArr) ? 1 : 0)) {
            int[] iArr = new int[lllIIllIlI[1]];
            iArr[lllIIllIlI[0]] = lllIIllIlI[8];
            if (llIIIIlIIIlII(Inventory.contains(iArr) ? 1 : 0)) {
                String[] strArr2 = new String[lllIIllIlI[1]];
                strArr2[lllIIllIlI[0]] = lllIIllIIl[lllIIllIlI[18]];
                if (llIIIIlIIIlII(Inventory.contains(strArr2) ? 1 : 0) && llIIIIlIIIlII(Inventory.contains(C0019f.aS) ? 1 : 0)) {
                    ?? r0 = lllIIllIlI[1];
                    "".length();
                    return "   ".length() != "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return lllIIllIlI[0];
    }

    private static boolean llIIIIlIIIlll(Object obj) {
        return obj != null;
    }

    private static boolean llIIIIlIIlIIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIIIIlIIIlII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean co() {
        String[] strArr = new String[lllIIllIlI[1]];
        strArr[lllIIllIlI[0]] = lllIIllIIl[lllIIllIlI[19]];
        if (llIIIIlIIIlII(Equipment.contains(strArr) ? 1 : 0)) {
            int[] iArr = new int[lllIIllIlI[1]];
            iArr[lllIIllIlI[0]] = lllIIllIlI[8];
            if (llIIIIlIIIlII(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllIIllIlI[1]];
                iArr2[lllIIllIlI[0]] = lllIIllIlI[7];
                if (llIIIIlIIIlII(Equipment.contains(iArr2) ? 1 : 0)) {
                    String[] strArr2 = new String[lllIIllIlI[1]];
                    strArr2[lllIIllIlI[0]] = lllIIllIIl[lllIIllIlI[20]];
                    if (llIIIIlIIIlII(Equipment.contains(strArr2) ? 1 : 0)) {
                        ?? r0 = lllIIllIlI[1];
                        "".length();
                        return (41 ^ 45) <= 0 ? " ".length() & (" ".length() ^ (-1)) : r0;
                    }
                }
            }
        }
        return lllIIllIlI[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0179, code lost:
        if (llIIIIlIIlIIl(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.I.lllIIllIlI[1]) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ad, code lost:
        if (llIIIIlIIIlII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01ec, code lost:
        if (llIIIIlIIlIIl(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.I.lllIIllIlI[1]) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x022b, code lost:
        if (llIIIIlIIIlIl(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.I.lllIIllIlI[1]) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x022e, code lost:
        Q();
        java.lang.System.out.println(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.I.lllIIllIIl[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.I.lllIIllIlI[9]]);
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.I.bt = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.I.lllIIllIlI[1];
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
    public static void cm() {
        if (llIIIIlIIIlII(bt ? 1 : 0)) {
            AccBuilderSotf.c = lllIIllIIl[lllIIllIlI[0]];
            C0015b.a(bv);
            if (llIIIIlIIIlIl(bv.size(), lllIIllIlI[1])) {
                System.out.println(lllIIllIIl[lllIIllIlI[1]]);
                bt = lllIIllIlI[0];
            }
        }
        if (llIIIIlIIIllI(bt ? 1 : 0) && llIIIIlIIIllI(co() ? 1 : 0)) {
            System.out.println(lllIIllIIl[lllIIllIlI[2]]);
            if (llIIIIlIIIllI(cn() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIIIlIIIlll(nearest) && llIIIIlIIIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIllIIl[lllIIllIlI[3]];
                    C0000a.a(nearest);
                }
                if (llIIIIlIIIlll(nearest) && llIIIIlIIIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIIIIlIIIllI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIllIIl[lllIIllIlI[4]];
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIIllIlI[5]);
                        "".length();
                    }
                    if (llIIIIlIIIlII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIllIIl[lllIIllIlI[6]];
                        if (llIIIIlIIlIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllIIllIlI[3]);
                            "".length();
                        }
                        if (llIIIIlIIlIII(Equipment.getAll().size()) && llIIIIlIIIllI(co() ? 1 : 0)) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllIIllIlI[2]);
                            "".length();
                        }
                        int[] iArr = new int[lllIIllIlI[1]];
                        iArr[lllIIllIlI[0]] = gd;
                        if (llIIIIlIIIllI(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lllIIllIlI[1]];
                            iArr2[lllIIllIlI[0]] = gd;
                        }
                        int[] iArr3 = new int[lllIIllIlI[1]];
                        iArr3[lllIIllIlI[0]] = gc;
                        if (llIIIIlIIIllI(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lllIIllIlI[1]];
                            iArr4[lllIIllIlI[0]] = gc;
                        }
                        int[] iArr5 = new int[lllIIllIlI[1]];
                        iArr5[lllIIllIlI[0]] = lllIIllIlI[7];
                        if (llIIIIlIIIllI(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lllIIllIlI[1]];
                            iArr6[lllIIllIlI[0]] = lllIIllIlI[7];
                        }
                        int[] iArr7 = new int[lllIIllIlI[1]];
                        iArr7[lllIIllIlI[0]] = lllIIllIlI[8];
                        if (llIIIIlIIIllI(Bank.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[lllIIllIlI[1]];
                            iArr8[lllIIllIlI[0]] = lllIIllIlI[8];
                        }
                        int[] iArr9 = new int[lllIIllIlI[1]];
                        iArr9[lllIIllIlI[0]] = gc;
                        if (llIIIIlIIIlII(Bank.contains(iArr9) ? 1 : 0)) {
                            int[] iArr10 = new int[lllIIllIlI[1]];
                            iArr10[lllIIllIlI[0]] = gc;
                            if (llIIIIlIIIlIl(Inventory.getCount(iArr10), lllIIllIlI[1])) {
                                Bank.withdraw(gc, lllIIllIlI[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lllIIllIlI[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr11 = new int[lllIIllIlI[1]];
                                    iArr11[lllIIllIlI[0]] = gc;
                                    if (llIIIIlIIlIII(Inventory.getCount(iArr11))) {
                                        ?? r0 = lllIIllIlI[1];
                                        "".length();
                                        return "  ".length() < 0 ? ((((26 + 29) - 48) + 144) ^ (((53 + 52) - 10) + 77)) & (((((141 + 93) - 233) + 190) ^ (((131 + 56) - 110) + 55)) ^ (-" ".length())) : r0;
                                    }
                                    return lllIIllIlI[0];
                                }, lllIIllIlI[5]);
                                "".length();
                            }
                        }
                        int[] iArr11 = new int[lllIIllIlI[1]];
                        iArr11[lllIIllIlI[0]] = gd;
                        if (llIIIIlIIIlII(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lllIIllIlI[1]];
                            iArr12[lllIIllIlI[0]] = gd;
                            if (llIIIIlIIIlIl(Inventory.getCount(iArr12), lllIIllIlI[1])) {
                                Bank.withdraw(gd, lllIIllIlI[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lllIIllIlI[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr13 = new int[lllIIllIlI[1]];
                                    iArr13[lllIIllIlI[0]] = gd;
                                    if (llIIIIlIIlIII(Inventory.getCount(iArr13))) {
                                        ?? r0 = lllIIllIlI[1];
                                        "".length();
                                        return (-" ".length()) > " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lllIIllIlI[0];
                                }, lllIIllIlI[5]);
                                "".length();
                            }
                        }
                        int[] iArr13 = new int[lllIIllIlI[1]];
                        iArr13[lllIIllIlI[0]] = lllIIllIlI[7];
                        if (llIIIIlIIIlII(Bank.contains(iArr13) ? 1 : 0)) {
                            int[] iArr14 = new int[lllIIllIlI[1]];
                            iArr14[lllIIllIlI[0]] = lllIIllIlI[7];
                            if (llIIIIlIIIlIl(Inventory.getCount(iArr14), lllIIllIlI[1])) {
                                Bank.withdraw(lllIIllIlI[7], lllIIllIlI[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lllIIllIlI[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr15 = new int[lllIIllIlI[1]];
                                    iArr15[lllIIllIlI[0]] = lllIIllIlI[7];
                                    if (llIIIIlIIlIII(Inventory.getCount(iArr15))) {
                                        ?? r0 = lllIIllIlI[1];
                                        "".length();
                                        return "  ".length() == 0 ? ((((123 + 37) - 54) + 97) ^ (((93 + 101) - 96) + 43)) & (((152 ^ 189) ^ (122 ^ 25)) ^ (-" ".length())) : r0;
                                    }
                                    return lllIIllIlI[0];
                                }, lllIIllIlI[5]);
                                "".length();
                            }
                        }
                        int[] iArr15 = new int[lllIIllIlI[1]];
                        iArr15[lllIIllIlI[0]] = lllIIllIlI[8];
                        if (llIIIIlIIIlII(Bank.contains(iArr15) ? 1 : 0)) {
                            int[] iArr16 = new int[lllIIllIlI[1]];
                            iArr16[lllIIllIlI[0]] = lllIIllIlI[8];
                            if (llIIIIlIIIlIl(Inventory.getCount(iArr16), lllIIllIlI[1])) {
                                Bank.withdraw(lllIIllIlI[8], lllIIllIlI[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lllIIllIlI[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr17 = new int[lllIIllIlI[1]];
                                    iArr17[lllIIllIlI[0]] = lllIIllIlI[8];
                                    if (llIIIIlIIlIII(Inventory.getCount(iArr17))) {
                                        ?? r0 = lllIIllIlI[1];
                                        "".length();
                                        return (22 ^ 18) <= ((72 ^ 3) & ((248 ^ 179) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lllIIllIlI[0];
                                }, lllIIllIlI[5]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (llIIIIlIIIlII(cn() ? 1 : 0)) {
                if (llIIIIlIIIlII(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (llIIIIlIIIllI(Bank.isOpen() ? 1 : 0)) {
                    if (llIIIIlIIIlII(GrandExchange.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepTicks(lllIIllIlI[1]);
                        "".length();
                    }
                    int i = lllIIllIlI[0];
                    while (llIIIIlIIIlIl(i, ge.length)) {
                        int[] iArr17 = new int[lllIIllIlI[1]];
                        iArr17[lllIIllIlI[0]] = ge[i];
                        Item first = Inventory.getFirst(iArr17);
                        if (llIIIIlIIIlll(first)) {
                            int[] iArr18 = new int[lllIIllIlI[1]];
                            iArr18[lllIIllIlI[0]] = first.getId();
                            if (llIIIIlIIIlII(Inventory.contains(iArr18) ? 1 : 0)) {
                                String[] strArr = new String[lllIIllIlI[1]];
                                strArr[lllIIllIlI[0]] = lllIIllIIl[lllIIllIlI[10]];
                                if (llIIIIlIIIlII(first.hasAction(strArr) ? 1 : 0)) {
                                    first.interact(lllIIllIIl[lllIIllIlI[11]]);
                                    Time.sleepTicks(lllIIllIlI[1]);
                                    "".length();
                                }
                                String[] strArr2 = new String[lllIIllIlI[1]];
                                strArr2[lllIIllIlI[0]] = lllIIllIIl[lllIIllIlI[12]];
                                if (llIIIIlIIIlII(first.hasAction(strArr2) ? 1 : 0)) {
                                    first.interact(lllIIllIIl[lllIIllIlI[13]]);
                                    Time.sleepTicks(lllIIllIlI[1]);
                                    "".length();
                                }
                                String[] strArr3 = new String[lllIIllIlI[1]];
                                strArr3[lllIIllIlI[0]] = lllIIllIIl[lllIIllIlI[14]];
                                if (llIIIIlIIIlII(first.hasAction(strArr3) ? 1 : 0)) {
                                    first.interact(lllIIllIIl[lllIIllIlI[15]]);
                                    Time.sleepTicks(lllIIllIlI[1]);
                                    "".length();
                                }
                                Time.sleepTicks(lllIIllIlI[1]);
                                "".length();
                            }
                        }
                        i++;
                        "".length();
                        if ((-(132 ^ 128)) > 0) {
                            return;
                        }
                    }
                    if (llIIIIlIIIlII(co() ? 1 : 0) && llIIIIlIIIllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIIllIlI[16]);
                        "".length();
                    }
                }
            }
        }
    }

    private static boolean llIIIIlIIIlIl(int i, int i2) {
        return i < i2;
    }

    public static void Q() {
        int[] iArr = new int[lllIIllIlI[1]];
        iArr[lllIIllIlI[0]] = gc;
        if (llIIIIlIIIllI(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0017d(gc, lllIIllIlI[1], lllIIllIlI[21]));
            "".length();
        }
        int[] iArr2 = new int[lllIIllIlI[1]];
        iArr2[lllIIllIlI[0]] = gd;
        if (llIIIIlIIIllI(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0017d(gd, lllIIllIlI[1], lllIIllIlI[22]));
            "".length();
        }
        int[] iArr3 = new int[lllIIllIlI[1]];
        iArr3[lllIIllIlI[0]] = lllIIllIlI[8];
        if (llIIIIlIIIllI(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0017d(lllIIllIlI[8], lllIIllIlI[1], lllIIllIlI[23]));
            "".length();
        }
        int[] iArr4 = new int[lllIIllIlI[1]];
        iArr4[lllIIllIlI[0]] = lllIIllIlI[7];
        if (llIIIIlIIIllI(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(lllIIllIlI[7], lllIIllIlI[1], lllIIllIlI[24]));
            "".length();
        }
        int[] iArr5 = new int[lllIIllIlI[1]];
        iArr5[lllIIllIlI[0]] = lllIIllIlI[25];
        if (llIIIIlIIIllI(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0017d(lllIIllIlI[25], lllIIllIlI[5], lllIIllIlI[13]));
            "".length();
        }
        int[] iArr6 = new int[lllIIllIlI[1]];
        iArr6[lllIIllIlI[0]] = lllIIllIlI[26];
        if (llIIIIlIIIllI(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0017d(lllIIllIlI[26], lllIIllIlI[27], lllIIllIlI[13]));
            "".length();
        }
        int[] iArr7 = new int[lllIIllIlI[1]];
        iArr7[lllIIllIlI[0]] = lllIIllIlI[28];
        if (llIIIIlIIIllI(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0017d(lllIIllIlI[28], lllIIllIlI[29], lllIIllIlI[13]));
            "".length();
        }
        int[] iArr8 = new int[lllIIllIlI[1]];
        iArr8[lllIIllIlI[0]] = lllIIllIlI[30];
        if (llIIIIlIIIllI(Bank.contains(iArr8) ? 1 : 0)) {
            bv.add(new C0017d(lllIIllIlI[30], lllIIllIlI[31], lllIIllIlI[13]));
            "".length();
        }
        int[] iArr9 = new int[lllIIllIlI[1]];
        iArr9[lllIIllIlI[0]] = lllIIllIlI[25];
        if (llIIIIlIIIlII(Bank.contains(iArr9) ? 1 : 0)) {
            int[] iArr10 = new int[lllIIllIlI[1]];
            iArr10[lllIIllIlI[0]] = lllIIllIlI[25];
            if (llIIIIlIIIlIl(Bank.getFirst(iArr10).getQuantity(), lllIIllIlI[32])) {
                bv.add(new C0017d(lllIIllIlI[25], lllIIllIlI[5], lllIIllIlI[13]));
                "".length();
            }
        }
        int[] iArr11 = new int[lllIIllIlI[1]];
        iArr11[lllIIllIlI[0]] = lllIIllIlI[26];
        if (llIIIIlIIIlII(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[lllIIllIlI[1]];
            iArr12[lllIIllIlI[0]] = lllIIllIlI[26];
            if (llIIIIlIIIlIl(Bank.getFirst(iArr12).getQuantity(), lllIIllIlI[32])) {
                bv.add(new C0017d(lllIIllIlI[26], lllIIllIlI[27], lllIIllIlI[13]));
                "".length();
            }
        }
        int[] iArr13 = new int[lllIIllIlI[1]];
        iArr13[lllIIllIlI[0]] = lllIIllIlI[28];
        if (llIIIIlIIIlII(Bank.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[lllIIllIlI[1]];
            iArr14[lllIIllIlI[0]] = lllIIllIlI[28];
            if (llIIIIlIIIlIl(Bank.getFirst(iArr14).getQuantity(), lllIIllIlI[32])) {
                bv.add(new C0017d(lllIIllIlI[28], lllIIllIlI[29], lllIIllIlI[13]));
                "".length();
            }
        }
        int[] iArr15 = new int[lllIIllIlI[1]];
        iArr15[lllIIllIlI[0]] = lllIIllIlI[30];
        if (llIIIIlIIIlII(Bank.contains(iArr15) ? 1 : 0)) {
            int[] iArr16 = new int[lllIIllIlI[1]];
            iArr16[lllIIllIlI[0]] = lllIIllIlI[30];
            if (llIIIIlIIIlIl(Bank.getFirst(iArr16).getQuantity(), lllIIllIlI[32])) {
                bv.add(new C0017d(lllIIllIlI[30], lllIIllIlI[31], lllIIllIlI[13]));
                "".length();
            }
        }
        if (llIIIIlIIIllI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lllIIllIIl[lllIIllIlI[40]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(lllIIllIlI[33], lllIIllIlI[6], lllIIllIlI[34]));
            "".length();
        }
        int[] iArr17 = new int[lllIIllIlI[1]];
        iArr17[lllIIllIlI[0]] = lllIIllIlI[35];
        if (llIIIIlIIIllI(Bank.contains(iArr17) ? 1 : 0)) {
            bv.add(new C0017d(lllIIllIlI[35], lllIIllIlI[36], lllIIllIlI[37]));
            "".length();
        }
    }

    private static void llIIIIlIIIIlI() {
        lllIIllIIl = new String[lllIIllIlI[43]];
        lllIIllIIl[lllIIllIlI[0]] = llIIIIIllllll("Mh8MGxcXShwGHB0Z", "pjury");
        lllIIllIIl[lllIIllIlI[1]] = llIIIIIllllll("EjoNIDs8NgdpKiEqCicvdDoXLCUnf0M6Pz0nACEhOjRDKyk3OEM9J3Q0Big6PT0E", "TScIH");
        lllIIllIIl[lllIIllIlI[2]] = llIIIIlIIIIII("aux/s4209t6afbHltn/vuwhFXQj3CiCa", "YDIWX");
        lllIIllIIl[lllIIllIlI[3]] = llIIIIlIIIIII("7vnTo4aOB7U/LPyFn06oeSz8OLHj6dh4", "BaExD");
        lllIIllIIl[lllIIllIlI[4]] = llIIIIlIIIIIl("pDP219FuJzyYB57/BfrvMw==", "hORIq");
        lllIIllIIl[lllIIllIlI[6]] = llIIIIIllllll("HiAUChg/Lx1OFjcvEQcaMQ==", "VAznt");
        lllIIllIIl[lllIIllIlI[9]] = llIIIIIllllll("JS54FRgXazUdGQEiNhNKAT4oBAYbLitYSgE8MQAJGiI2E0oGJHg2PysCFjNKJz8xGA==", "rKXtj");
        lllIIllIIl[lllIIllIlI[10]] = llIIIIlIIIIIl("+HXWTPBTcBE=", "cGnyu");
        lllIIllIIl[lllIIllIlI[11]] = llIIIIlIIIIIl("FLxmjknD/hA=", "IuSVP");
        lllIIllIIl[lllIIllIlI[12]] = llIIIIlIIIIII("AZkYEtxcnbU=", "pidBc");
        lllIIllIIl[lllIIllIlI[13]] = llIIIIlIIIIIl("9zcUYDuyRVA=", "XfJFy");
        lllIIllIIl[lllIIllIlI[14]] = llIIIIIllllll("JAMzHho=", "arFwj");
        lllIIllIIl[lllIIllIlI[15]] = llIIIIIllllll("ARYvMyQ=", "DgZZT");
        lllIIllIIl[lllIIllIlI[17]] = llIIIIIllllll("FQI2CgxmGTFMCy8E", "FvWlj");
        lllIIllIIl[lllIIllIlI[18]] = llIIIIlIIIIII("9TkLLt+SKJBSxpbdRZp5PA==", "UcOvS");
        lllIIllIIl[lllIIllIlI[19]] = llIIIIlIIIIII("gb1auniNROPijmqdkTeT8w==", "IASFP");
        lllIIllIIl[lllIIllIlI[20]] = llIIIIlIIIIIl("Hj7rsNlkBm2AUj3XblqY9g==", "JwSRA");
        lllIIllIIl[lllIIllIlI[38]] = llIIIIlIIIIII("2V2ZgJGCWMY=", "IBAIZ");
        lllIIllIIl[lllIIllIlI[39]] = llIIIIIllllll("OAE7AA==", "odZrD");
        lllIIllIIl[lllIIllIlI[40]] = llIIIIIllllll("By4dFFIaIVMEFxQrBxtSXQ==", "uGssr");
    }

    static {
        llIIIIlIIIIll();
        llIIIIlIIIIlI();
        bv = new ArrayList();
        gc = lllIIllIlI[41];
        gd = lllIIllIlI[42];
        int[] iArr = new int[lllIIllIlI[4]];
        iArr[lllIIllIlI[0]] = gc;
        iArr[lllIIllIlI[1]] = gd;
        iArr[lllIIllIlI[2]] = lllIIllIlI[8];
        iArr[lllIIllIlI[3]] = lllIIllIlI[7];
        ge = iArr;
    }

    private static boolean llIIIIlIIlIII(int i) {
        return i > 0;
    }
}
