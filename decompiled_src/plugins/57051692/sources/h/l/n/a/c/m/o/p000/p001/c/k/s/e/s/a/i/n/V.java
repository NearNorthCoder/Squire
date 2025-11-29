package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.V  reason: invalid package */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/V.class */
public class V implements K {
    private static /* synthetic */ String[] lIlIllIlll;
    public static final /* synthetic */ int kG;
    public static /* synthetic */ boolean bn;
    private static /* synthetic */ int[] lIlIlllIII;
    public static /* synthetic */ List<C0003d> bp;
    public static final /* synthetic */ int kF;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean al() {
        int[] iArr = new int[lIlIlllIII[1]];
        iArr[lIlIlllIII[0]] = lIlIlllIII[7];
        if (lIIlIIlllIIIl(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[lIlIlllIII[1]];
            iArr2[lIlIlllIII[0]] = lIlIlllIII[8];
            if (lIIlIIlllIIIl(Inventory.getCount(iArr2))) {
                ?? r0 = lIlIlllIII[1];
                "".length();
                return ((55 ^ 50) & ((146 ^ 151) ^ (-1))) < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return lIlIlllIII[0];
    }

    public static void O() {
        int[] iArr = new int[lIlIlllIII[1]];
        iArr[lIlIlllIII[0]] = lIlIlllIII[7];
        if (lIIlIIlllIIII(Bank.contains(iArr) ? 1 : 0)) {
            System.out.println(lIlIllIlll[lIlIlllIII[32]]);
            bp.add(new C0003d(lIlIlllIII[7], lIlIlllIII[33], lIlIlllIII[34]));
            "".length();
        }
        int[] iArr2 = new int[lIlIlllIII[1]];
        iArr2[lIlIlllIII[0]] = lIlIlllIII[8];
        if (lIIlIIlllIIII(Bank.contains(iArr2) ? 1 : 0)) {
            System.out.println(lIlIllIlll[lIlIlllIII[35]]);
            bp.add(new C0003d(lIlIlllIII[8], lIlIlllIII[1], lIlIlllIII[36]));
            "".length();
        }
        if (lIIlIIlllIIII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlIllIlll[lIlIlllIII[45]]);
        }) ? 1 : 0)) {
            bp.add(new C0003d(lIlIlllIII[37], lIlIlllIII[9], lIlIlllIII[38]));
            "".length();
        }
        int[] iArr3 = new int[lIlIlllIII[1]];
        iArr3[lIlIlllIII[0]] = lIlIlllIII[39];
        if (lIIlIIlllIIII(Bank.contains(iArr3) ? 1 : 0)) {
            bp.add(new C0003d(lIlIlllIII[39], lIlIlllIII[40], lIlIlllIII[41]));
            "".length();
        }
    }

    private static boolean lIIlIIlllIIlI(Object obj) {
        return obj != null;
    }

    static {
        lIIlIIllIllIl();
        lIIlIIllIllII();
        kF = lIlIlllIII[7];
        kG = lIlIlllIII[8];
        bp = new ArrayList();
    }

    private static String lIIlIIllIlIIl(String lllllllllllllllllllIlIIIIlIlllII, String lllllllllllllllllllIlIIIIlIllIll) {
        try {
            SecretKeySpec lllllllllllllllllllIlIIIIlIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIlIIIIlIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllIlIIIIlIllllI = Cipher.getInstance("Blowfish");
            lllllllllllllllllllIlIIIIlIllllI.init(lIlIlllIII[3], lllllllllllllllllllIlIIIIlIlllll);
            return new String(lllllllllllllllllllIlIIIIlIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIlIIIIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIlIIIIlIlllIl) {
            lllllllllllllllllllIlIIIIlIlllIl.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIllIlIll(String lllllllllllllllllllIlIIIlIIIIIIl, String lllllllllllllllllllIlIIIlIIIIIII) {
        try {
            SecretKeySpec lllllllllllllllllllIlIIIlIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIlIIIlIIIIIII.getBytes(StandardCharsets.UTF_8)), lIlIlllIII[12]), "DES");
            Cipher lllllllllllllllllllIlIIIlIIIIIll = Cipher.getInstance("DES");
            lllllllllllllllllllIlIIIlIIIIIll.init(lIlIlllIII[3], lllllllllllllllllllIlIIIlIIIIlII);
            return new String(lllllllllllllllllllIlIIIlIIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIlIIIlIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIlIIIlIIIIIlI) {
            lllllllllllllllllllIlIIIlIIIIIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIlIIlllIIll(Skills.getLevel(Skill.CRAFTING), lIlIlllIII[44])) {
            ?? r0 = lIlIlllIII[1];
            "".length();
            return ((239 ^ 175) & ((18 ^ 82) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIlllIII[0];
    }

    private static String lIIlIIllIlIlI(String lllllllllllllllllllIlIIIIlllIIIl, String lllllllllllllllllllIlIIIIlllIIII) {
        String lllllllllllllllllllIlIIIIlllIIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllllllIlIIIIlllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllIlIIIIllIllll = new StringBuilder();
        char[] charArray = lllllllllllllllllllIlIIIIlllIIII.toCharArray();
        int lllllllllllllllllllIlIIIIllIllIl = lIlIlllIII[0];
        char[] charArray2 = lllllllllllllllllllIlIIIIlllIIIl2.toCharArray();
        int lllllllllllllllllllIlIIIIllIIllI = charArray2.length;
        int lllllllllllllllllllIlIIIIllIIlIl = lIlIlllIII[0];
        while (lIIlIIllIllll(lllllllllllllllllllIlIIIIllIIlIl, lllllllllllllllllllIlIIIIllIIllI)) {
            lllllllllllllllllllIlIIIIllIllll.append((char) (charArray2[lllllllllllllllllllIlIIIIllIIlIl] ^ charArray[lllllllllllllllllllIlIIIIllIllIl % charArray.length]));
            "".length();
            lllllllllllllllllllIlIIIIllIllIl++;
            lllllllllllllllllllIlIIIIllIIlIl++;
            "".length();
            if ((-" ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllllIlIIIIllIllll);
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIlIllIlll[lIlIlllIII[43]];
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        dr();
        return lIlIlllIII[42];
    }

    private static boolean lIIlIIlllIIll(int i, int i2) {
        return i >= i2;
    }

    private static void lIIlIIllIllIl() {
        lIlIlllIII = new int[47];
        lIlIlllIII[0] = ((((3 + 56) - (-80)) + 72) ^ (((15 + 43) - (-86)) + 12)) & (((220 ^ 154) ^ (185 ^ 176)) ^ (-" ".length()));
        lIlIlllIII[1] = " ".length();
        lIlIlllIII[2] = (-6153) & 7147;
        lIlIlllIII[3] = "  ".length();
        lIlIlllIII[4] = "   ".length();
        lIlIlllIII[5] = (-26695) & 31694;
        lIlIlllIII[6] = (104 ^ 15) ^ (230 ^ 133);
        lIlIlllIII[7] = (-((-16961) & 31569)) & (-1) & 16383;
        lIlIlllIII[8] = (-24839) & 26623;
        lIlIlllIII[9] = 82 ^ 87;
        lIlIlllIII[10] = 40 ^ 46;
        lIlIlllIII[11] = 8 ^ 15;
        lIlIlllIII[12] = 128 ^ 136;
        lIlIlllIII[13] = (-((-22043) & 24411)) & (-34) & 60401;
        lIlIlllIII[14] = 101 ^ 105;
        lIlIlllIII[15] = 205 ^ 196;
        lIlIlllIII[16] = (15 ^ 111) ^ (253 ^ 188);
        lIlIlllIII[17] = (120 ^ 100) ^ (168 ^ 190);
        lIlIlllIII[18] = (59 ^ 40) ^ (117 ^ 109);
        lIlIlllIII[19] = (242 ^ 151) ^ (195 ^ 140);
        lIlIlllIII[20] = (53 ^ 95) ^ (57 ^ 94);
        lIlIlllIII[21] = (((42 + 31) - (-24)) + 88) ^ (((17 + 39) - (-37)) + 58);
        lIlIlllIII[22] = 44 ^ 34;
        lIlIlllIII[23] = 58 ^ 53;
        lIlIlllIII[24] = (252 ^ 147) ^ (224 ^ 190);
        lIlIlllIII[25] = (100 ^ 4) ^ (28 ^ 108);
        lIlIlllIII[26] = 133 ^ 148;
        lIlIlllIII[27] = 125 ^ 42;
        lIlIlllIII[28] = 210 ^ 192;
        lIlIlllIII[29] = (156 ^ 135) ^ (182 ^ 190);
        lIlIlllIII[30] = (78 ^ 87) ^ (18 ^ 31);
        lIlIlllIII[31] = 23 ^ 2;
        lIlIlllIII[32] = 92 ^ 74;
        lIlIlllIII[33] = (-((-3851) & 24527)) & (-10241) & 32766;
        lIlIlllIII[34] = 31 ^ 113;
        lIlIlllIII[35] = 68 ^ 83;
        lIlIlllIII[36] = (-25094) & 30703;
        lIlIlllIII[37] = (-((-17993) & 22395)) & (-16385) & 32766;
        lIlIlllIII[38] = (-596) & 25595;
        lIlIlllIII[39] = (-((-16741) & 24957)) & (-16513) & 32735;
        lIlIlllIII[40] = (48 ^ 112) ^ (86 ^ 62);
        lIlIlllIII[41] = (-4105) & 5004;
        lIlIlllIII[42] = 104 ^ 12;
        lIlIlllIII[43] = 134 ^ 158;
        lIlIlllIII[44] = (249 ^ 143) ^ (26 ^ 15);
        lIlIlllIII[45] = (147 ^ 139) ^ " ".length();
        lIlIlllIII[46] = (178 ^ 197) ^ (36 ^ 73);
    }

    private static boolean lIIlIIlllIIIl(int i) {
        return i > 0;
    }

    private static boolean lIIlIIllIllll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIlIlllIII[0];
    }

    private static boolean lIIlIIllIlllI(int i) {
        return i != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0070, code lost:
        if (lIIlIIlllIIIl(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017a, code lost:
        if (lIIlIIlllIIll(net.unethicalite.api.items.Inventory.getCount(r0), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.V.lIlIlllIII[1]) != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b9, code lost:
        if (lIIlIIllIllll(net.unethicalite.api.items.Inventory.getCount(r0), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.V.lIlIlllIII[1]) != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01bc, code lost:
        O();
        java.lang.System.out.println(h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.V.lIlIllIlll[h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.V.lIlIlllIII[9]]);
        h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.V.bn = h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.V.lIlIlllIII[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01d7, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v268, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v83, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void dr() {
        if (lIIlIIllIlllI(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIlIllIlll[lIlIlllIII[0]];
            C0001b.a(bp);
            if (lIIlIIllIllll(bp.size(), lIlIlllIII[1])) {
                System.out.println(lIlIllIlll[lIlIlllIII[1]]);
                bn = lIlIlllIII[0];
            }
        }
        if (lIIlIIlllIIII(bn ? 1 : 0)) {
            if (lIIlIIllIlllI(al() ? 1 : 0)) {
                int[] iArr = new int[lIlIlllIII[1]];
                iArr[lIlIlllIII[0]] = lIlIlllIII[2];
            }
            BankLocation nearest = BankLocation.getNearest();
            if (lIIlIIlllIIlI(nearest) && lIIlIIlllIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIllIlll[lIlIlllIII[3]];
                C0000a.a(nearest);
            }
            if (lIIlIIlllIIlI(nearest) && lIIlIIllIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (lIIlIIlllIIII(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllIlll[lIlIlllIII[4]];
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIlIlllIII[5]);
                    "".length();
                }
                if (lIIlIIllIlllI(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllIlll[lIlIlllIII[6]];
                    if (lIIlIIlllIIIl(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(lIlIlllIII[4]);
                        "".length();
                    }
                    if (lIIlIIlllIIIl(Equipment.getAll().size())) {
                        Bank.depositEquipment();
                        Time.sleepTicks(lIlIlllIII[3]);
                        "".length();
                    }
                    int[] iArr2 = new int[lIlIlllIII[1]];
                    iArr2[lIlIlllIII[0]] = lIlIlllIII[7];
                    if (lIIlIIlllIIII(Bank.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[lIlIlllIII[1]];
                        iArr3[lIlIlllIII[0]] = lIlIlllIII[7];
                    }
                    int[] iArr4 = new int[lIlIlllIII[1]];
                    iArr4[lIlIlllIII[0]] = lIlIlllIII[8];
                    if (lIIlIIlllIIII(Bank.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lIlIlllIII[1]];
                        iArr5[lIlIlllIII[0]] = lIlIlllIII[8];
                    }
                    int[] iArr6 = new int[lIlIlllIII[1]];
                    iArr6[lIlIlllIII[0]] = lIlIlllIII[8];
                    if (lIIlIIllIlllI(Bank.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lIlIlllIII[1]];
                        iArr7[lIlIlllIII[0]] = lIlIlllIII[8];
                        if (lIIlIIllIllll(Inventory.getCount(iArr7), lIlIlllIII[1])) {
                            Bank.withdraw(lIlIlllIII[8], lIlIlllIII[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIlIlllIII[1]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr8 = new int[lIlIlllIII[1]];
                                iArr8[lIlIlllIII[0]] = lIlIlllIII[8];
                                if (lIIlIIlllIIIl(Inventory.getCount(iArr8))) {
                                    ?? r0 = lIlIlllIII[1];
                                    "".length();
                                    return " ".length() == (((((122 + 4) - 3) + 89) ^ (((59 + 9) - 7) + 133)) & (((93 ^ 69) ^ (188 ^ 178)) ^ (-" ".length()))) ? ((((133 + 146) - 241) + 143) ^ (((111 + 85) - 103) + 41)) & (((36 ^ 97) ^ (93 ^ 43)) ^ (-" ".length())) : r0;
                                }
                                return lIlIlllIII[0];
                            }, lIlIlllIII[5]);
                            "".length();
                        }
                    }
                    int[] iArr8 = new int[lIlIlllIII[1]];
                    iArr8[lIlIlllIII[0]] = lIlIlllIII[7];
                    if (lIIlIIllIlllI(Bank.contains(iArr8) ? 1 : 0)) {
                        int[] iArr9 = new int[lIlIlllIII[1]];
                        iArr9[lIlIlllIII[0]] = lIlIlllIII[7];
                        if (lIIlIIllIllll(Inventory.getCount(iArr9), lIlIlllIII[1])) {
                            int[] iArr10 = new int[lIlIlllIII[1]];
                            iArr10[lIlIlllIII[0]] = lIlIlllIII[8];
                            if (lIIlIIlllIIIl(Inventory.getCount(iArr10))) {
                                Bank.withdrawAll(lIlIlllIII[7], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIlIlllIII[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr11 = new int[lIlIlllIII[1]];
                                    iArr11[lIlIlllIII[0]] = lIlIlllIII[7];
                                    if (lIIlIIlllIIIl(Inventory.getCount(iArr11))) {
                                        ?? r0 = lIlIlllIII[1];
                                        "".length();
                                        return (-" ".length()) > (((((86 + 131) - 189) + 105) ^ (((95 + 13) - 87) + 108)) & (((((93 + 46) - 119) + 153) ^ (((10 + 58) - (-6)) + 95)) ^ (-" ".length()))) ? ((58 ^ 99) ^ (33 ^ 47)) & (((((199 + 34) - 125) + 124) ^ (((5 + 87) - (-49)) + 50)) ^ (-" ".length())) : r0;
                                    }
                                    return lIlIlllIII[0];
                                }, lIlIlllIII[5]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (lIIlIIllIlllI(al() ? 1 : 0)) {
                if (lIIlIIllIlllI(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (lIIlIIlllIIII(Bank.isOpen() ? 1 : 0) && lIIlIIlllIIII(Players.getLocal().isAnimating() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllIlll[lIlIlllIII[10]];
                    if (lIIlIIllIlllI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (lIIlIIlllIIII(Production.isOpen() ? 1 : 0)) {
                        Time.sleepTicks(lIlIlllIII[3]);
                        "".length();
                        int[] iArr11 = new int[lIlIlllIII[1]];
                        iArr11[lIlIlllIII[0]] = lIlIlllIII[8];
                        Item first = Inventory.getFirst(iArr11);
                        int[] iArr12 = new int[lIlIlllIII[1]];
                        iArr12[lIlIlllIII[0]] = lIlIlllIII[7];
                        Item first2 = Inventory.getFirst(iArr12);
                        if (lIIlIIlllIIlI(first) && lIIlIIlllIIlI(first2)) {
                            first.useOn(first2);
                            Time.sleepUntil(() -> {
                                return Production.isOpen();
                            }, lIlIlllIII[5]);
                            "".length();
                        }
                    }
                    if (lIIlIIllIlllI(Production.isOpen() ? 1 : 0)) {
                        if (lIIlIIllIllll(Skills.getLevel(Skill.CRAFTING), lIlIlllIII[6])) {
                            AccBuilderShamans.c = lIlIllIlll[lIlIlllIII[11]];
                            Production.chooseOption(lIlIllIlll[lIlIlllIII[12]]);
                            Time.sleepTicks(lIlIlllIII[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIlIlllIII[1]];
                                iArr13[lIlIlllIII[0]] = lIlIlllIII[7];
                                if (!lIIlIIlllIIll(Inventory.getCount(iArr13), lIlIlllIII[1]) || lIIlIIllIlllI(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIlIlllIII[1];
                                    "".length();
                                    return "  ".length() >= (185 ^ 189) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIlIlllIII[0];
                            }, lIlIlllIII[13]);
                            "".length();
                        }
                        if (lIIlIIlllIIll(Skills.getLevel(Skill.CRAFTING), lIlIlllIII[6]) && lIIlIIllIllll(Skills.getLevel(Skill.CRAFTING), lIlIlllIII[14])) {
                            AccBuilderShamans.c = lIlIllIlll[lIlIlllIII[15]];
                            Production.chooseOption(lIlIlllIII[3]);
                            Time.sleepTicks(lIlIlllIII[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIlIlllIII[1]];
                                iArr13[lIlIlllIII[0]] = lIlIlllIII[7];
                                if (!lIIlIIlllIIll(Inventory.getCount(iArr13), lIlIlllIII[1]) || lIIlIIllIlllI(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIlIlllIII[1];
                                    "".length();
                                    return "  ".length() <= 0 ? ((78 ^ 19) ^ (37 ^ 54)) & (((182 ^ 144) ^ (210 ^ 186)) ^ (-" ".length())) : r0;
                                }
                                return lIlIlllIII[0];
                            }, lIlIlllIII[13]);
                            "".length();
                        }
                        if (lIIlIIlllIIll(Skills.getLevel(Skill.CRAFTING), lIlIlllIII[14]) && lIIlIIllIllll(Skills.getLevel(Skill.CRAFTING), lIlIlllIII[16])) {
                            AccBuilderShamans.c = lIlIllIlll[lIlIlllIII[17]];
                            Production.chooseOption(lIlIllIlll[lIlIlllIII[18]]);
                            Time.sleepTicks(lIlIlllIII[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIlIlllIII[1]];
                                iArr13[lIlIlllIII[0]] = lIlIlllIII[7];
                                if (!lIIlIIlllIIll(Inventory.getCount(iArr13), lIlIlllIII[1]) || lIIlIIllIlllI(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIlIlllIII[1];
                                    "".length();
                                    return ((111 ^ 36) & ((141 ^ 198) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true) : r0;
                                }
                                return lIlIlllIII[0];
                            }, lIlIlllIII[13]);
                            "".length();
                        }
                        if (lIIlIIlllIIll(Skills.getLevel(Skill.CRAFTING), lIlIlllIII[16]) && lIIlIIllIllll(Skills.getLevel(Skill.CRAFTING), lIlIlllIII[19])) {
                            AccBuilderShamans.c = lIlIllIlll[lIlIlllIII[14]];
                            Production.chooseOption(lIlIllIlll[lIlIlllIII[20]]);
                            Time.sleepTicks(lIlIlllIII[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIlIlllIII[1]];
                                iArr13[lIlIlllIII[0]] = lIlIlllIII[7];
                                if (!lIIlIIlllIIll(Inventory.getCount(iArr13), lIlIlllIII[1]) || lIIlIIllIlllI(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIlIlllIII[1];
                                    "".length();
                                    return (-" ".length()) < (-" ".length()) ? ((((52 + 128) - 32) + 0) ^ (((10 + 33) - (-112)) + 5)) & (((252 ^ 159) ^ (209 ^ 134)) ^ (-" ".length())) : r0;
                                }
                                return lIlIlllIII[0];
                            }, lIlIlllIII[13]);
                            "".length();
                        }
                        if (lIIlIIlllIIll(Skills.getLevel(Skill.CRAFTING), lIlIlllIII[19]) && lIIlIIllIllll(Skills.getLevel(Skill.CRAFTING), lIlIlllIII[21])) {
                            AccBuilderShamans.c = lIlIllIlll[lIlIlllIII[22]];
                            Production.chooseOption(lIlIllIlll[lIlIlllIII[23]]);
                            Time.sleepTicks(lIlIlllIII[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIlIlllIII[1]];
                                iArr13[lIlIlllIII[0]] = lIlIlllIII[7];
                                if (!lIIlIIlllIIll(Inventory.getCount(iArr13), lIlIlllIII[1]) || lIIlIIllIlllI(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIlIlllIII[1];
                                    "".length();
                                    return 0 != 0 ? ((95 ^ 15) ^ (59 ^ 92)) & (((146 ^ 151) ^ (132 ^ 182)) ^ (-" ".length())) : r0;
                                }
                                return lIlIlllIII[0];
                            }, lIlIlllIII[13]);
                            "".length();
                        }
                        if (lIIlIIlllIIll(Skills.getLevel(Skill.CRAFTING), lIlIlllIII[21]) && lIIlIIllIllll(Skills.getLevel(Skill.CRAFTING), lIlIlllIII[24])) {
                            AccBuilderShamans.c = lIlIllIlll[lIlIlllIII[25]];
                            Production.chooseOption(lIlIllIlll[lIlIlllIII[26]]);
                            Time.sleepTicks(lIlIlllIII[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIlIlllIII[1]];
                                iArr13[lIlIlllIII[0]] = lIlIlllIII[7];
                                if (!lIIlIIlllIIll(Inventory.getCount(iArr13), lIlIlllIII[1]) || lIIlIIllIlllI(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIlIlllIII[1];
                                    "".length();
                                    return (((181 ^ 189) ^ (29 ^ 37)) & (((((98 + 24) - 63) + 116) ^ (((134 + 111) - 204) + 118)) ^ (-" ".length()))) != 0 ? ((81 ^ 104) ^ (45 ^ 42)) & (((176 ^ 183) ^ (79 ^ 118)) ^ (-" ".length())) : r0;
                                }
                                return lIlIlllIII[0];
                            }, lIlIlllIII[13]);
                            "".length();
                        }
                        if (lIIlIIlllIIll(Skills.getLevel(Skill.CRAFTING), lIlIlllIII[24]) && lIIlIIllIllll(Skills.getLevel(Skill.CRAFTING), lIlIlllIII[27])) {
                            AccBuilderShamans.c = lIlIllIlll[lIlIlllIII[28]];
                            Production.chooseOption(lIlIllIlll[lIlIlllIII[29]]);
                            Time.sleepTicks(lIlIlllIII[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIlIlllIII[1]];
                                iArr13[lIlIlllIII[0]] = lIlIlllIII[7];
                                if (!lIIlIIlllIIll(Inventory.getCount(iArr13), lIlIlllIII[1]) || lIIlIIllIlllI(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIlIlllIII[1];
                                    "".length();
                                    return "   ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIlIlllIII[0];
                            }, lIlIlllIII[13]);
                            "".length();
                        }
                        if (lIIlIIlllIIll(Skills.getLevel(Skill.CRAFTING), lIlIlllIII[27])) {
                            AccBuilderShamans.c = lIlIllIlll[lIlIlllIII[30]];
                            Production.chooseOption(lIlIllIlll[lIlIlllIII[31]]);
                            Time.sleepTicks(lIlIlllIII[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIlIlllIII[1]];
                                iArr13[lIlIlllIII[0]] = lIlIlllIII[7];
                                if (!lIIlIIlllIIll(Inventory.getCount(iArr13), lIlIlllIII[1]) || lIIlIIllIlllI(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIlIlllIII[1];
                                    "".length();
                                    return 0 != 0 ? ((200 ^ 179) ^ (65 ^ 22)) & (((110 ^ 95) ^ (15 ^ 18)) ^ (-" ".length())) : r0;
                                }
                                return lIlIlllIII[0];
                            }, lIlIlllIII[13]);
                            "".length();
                        }
                    }
                }
            }
        }
    }

    private static void lIIlIIllIllII() {
        lIlIllIlll = new String[lIlIlllIII[46]];
        lIlIllIlll[lIlIlllIII[0]] = lIIlIIllIlIIl("lhp1HwzXjzkHAa+APpK+3g==", "paFiC");
        lIlIllIlll[lIlIlllIII[1]] = lIIlIIllIlIlI("EB0iJwQ+EShuFSMNJSAQdh04KxolWGw9AD8ALyYeOBNsLBY1H2w6GHYXPi8RIh0iKQ==", "VtLNw");
        lIlIllIlll[lIlIlllIII[3]] = lIIlIIllIlIll("utxTkIyHY9XuqwshNjMv+2A6mm0ED5J3", "Jrmha");
        lIlIllIlll[lIlIlllIII[4]] = lIIlIIllIlIlI("BT4rDSckKW4BLyQl", "JNNcN");
        lIlIllIlll[lIlIlllIII[6]] = lIIlIIllIlIlI("PCQ2CgUdKz9OCxUrMwcHEw==", "tEXni");
        lIlIllIlll[lIlIlllIII[9]] = lIIlIIllIlIIl("A0VT3D4Af5sNAKyHJiEkS2odqQ8tZ8Dcn4sveFKhVGr1X7Ml9/lxXAhIAhtC1IUm", "ZEBme");
        lIlIllIlll[lIlIlllIII[10]] = lIIlIIllIlIll("PY4D0wIuIWBsCOP2mHBnrw==", "cxSrk");
        lIlIllIlll[lIlIlllIII[11]] = lIIlIIllIlIlI("OhU2ISMQCTBnMBUGJDQ=", "ygWGW");
        lIlIllIlll[lIlIlllIII[12]] = lIIlIIllIlIll("16WbZfqCrwAi+evc6pY0iA==", "cAYqL");
        lIlIllIlll[lIlIlllIII[15]] = lIIlIIllIlIIl("ZSpBjiD3sf1o1WmA5CqPXG4GAiO29BBl", "jVaQn");
        lIlIllIlll[lIlIlllIII[17]] = lIIlIIllIlIlI("ECIAKTE6PgZvKTI9EQ==", "SPaOE");
        lIlIllIlll[lIlIlllIII[18]] = lIIlIIllIlIlI("KTAPcSEHNBM=", "fYcQM");
        lIlIllIlll[lIlIlllIII[14]] = lIIlIIllIlIll("AqEJPJGa9+DQ01Pq5B10/Q==", "Lwsyn");
        lIlIllIlll[lIlIlllIII[20]] = lIIlIIllIlIlI("HiULPg==", "HLjRn");
        lIlIllIlll[lIlIlllIII[22]] = lIIlIIllIlIlI("CigFDD4gNANKLCApDAglPjY=", "IZdjJ");
        lIlIllIlll[lIlIlllIII[23]] = lIIlIIllIlIIl("eUZfaDTECHpx60XCLzacLA==", "nlSXg");
        lIlIllIlll[lIlIlllIII[25]] = lIIlIIllIlIlI("IBYpDi4KCi9INREG", "cdHhZ");
        lIlIllIlll[lIlIlllIII[26]] = lIIlIIllIlIll("n5IZRvd+FybmsNL8Wczg5TIhrWnLYGw0", "DrGAM");
        lIlIllIlll[lIlIlllIII[28]] = lIIlIIllIlIll("qpJOE2u2miqY8749LqGtFw==", "bhfqU");
        lIlIllIlll[lIlIlllIII[29]] = lIIlIIllIlIlI("OTUJBjUHOkceNRsn", "uTgrP");
        lIlIllIlll[lIlIlllIII[30]] = lIIlIIllIlIIl("mwN0YBdeJRQu2kt+w2NdjyAQM78aDLnd", "mcDwh");
        lIlIllIlll[lIlIlllIII[31]] = lIIlIIllIlIll("iUWcN6hlDgiDwkY1KeOoRw==", "dYUvC");
        lIlIllIlll[lIlIlllIII[32]] = lIIlIIllIlIll("JYujHd+fhzIoF89rH7S12ugVPrvz/7m9", "TsZjO");
        lIlIllIlll[lIlIlllIII[35]] = lIIlIIllIlIll("wFqe1FKKPNNmu9Y2y1XRjkgdVGPcqaFTCBqeQgBj7Bs=", "gpGqX");
        lIlIllIlll[lIlIlllIII[43]] = lIIlIIllIlIll("6WVYg8/8rO62P+paxxTkpQ==", "udmWy");
        lIlIllIlll[lIlIlllIII[45]] = lIIlIIllIlIll("RiVp8Fmt1tukxq5oUd/kqZNH+ax4uOv+", "aIiWj");
    }

    private static boolean lIIlIIlllIIII(int i) {
        return i == 0;
    }
}
