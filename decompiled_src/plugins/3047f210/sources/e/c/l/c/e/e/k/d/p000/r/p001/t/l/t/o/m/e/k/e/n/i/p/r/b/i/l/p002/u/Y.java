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
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.Y  reason: invalid package */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/Y.class */
public class Y implements S {
    private static /* synthetic */ String[] lIIIIIIIIIl;
    public static final /* synthetic */ int jh;
    public static final /* synthetic */ int ji;
    public static /* synthetic */ boolean bs;
    public static /* synthetic */ List<C0003d> bu;
    private static /* synthetic */ int[] lIIIIIIIIlI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return lIIIIIIIIlI[0];
    }

    private static String llIllIIllIIlI(String lllllllllllllllllIlIIIIIlllIlllI, String lllllllllllllllllIlIIIIIlllIllIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllIlIIIIIlllIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIIIIIlllIllII = new StringBuilder();
        char[] charArray = lllllllllllllllllIlIIIIIlllIllIl.toCharArray();
        int lllllllllllllllllIlIIIIIlllIlIlI = lIIIIIIIIlI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int lllllllllllllllllIlIIIIIlllIIIlI = lIIIIIIIIlI[0];
        while (llIllIIlllIII(lllllllllllllllllIlIIIIIlllIIIlI, length)) {
            char lllllllllllllllllIlIIIIIlllIllll = charArray2[lllllllllllllllllIlIIIIIlllIIIlI];
            lllllllllllllllllIlIIIIIlllIllII.append((char) (lllllllllllllllllIlIIIIIlllIllll ^ charArray[lllllllllllllllllIlIIIIIlllIlIlI % charArray.length]));
            "".length();
            lllllllllllllllllIlIIIIIlllIlIlI++;
            lllllllllllllllllIlIIIIIlllIIIlI++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllIlIIIIIlllIllII);
    }

    public static void ae() {
        int[] iArr = new int[lIIIIIIIIlI[1]];
        iArr[lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
        if (llIllIIlllIIl(Bank.contains(iArr) ? 1 : 0)) {
            System.out.println(lIIIIIIIIIl[lIIIIIIIIlI[32]]);
            bu.add(new C0003d(lIIIIIIIIlI[7], lIIIIIIIIlI[33], lIIIIIIIIlI[34]));
            "".length();
        }
        int[] iArr2 = new int[lIIIIIIIIlI[1]];
        iArr2[lIIIIIIIIlI[0]] = lIIIIIIIIlI[8];
        if (llIllIIlllIIl(Bank.contains(iArr2) ? 1 : 0)) {
            System.out.println(lIIIIIIIIIl[lIIIIIIIIlI[35]]);
            bu.add(new C0003d(lIIIIIIIIlI[8], lIIIIIIIIlI[1], lIIIIIIIIlI[36]));
            "".length();
        }
        if (llIllIIlllIIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIIIIIIIl[lIIIIIIIIlI[45]]);
        }) ? 1 : 0)) {
            bu.add(new C0003d(lIIIIIIIIlI[37], lIIIIIIIIlI[9], lIIIIIIIIlI[38]));
            "".length();
        }
        int[] iArr3 = new int[lIIIIIIIIlI[1]];
        iArr3[lIIIIIIIIlI[0]] = lIIIIIIIIlI[39];
        if (llIllIIlllIIl(Bank.contains(iArr3) ? 1 : 0)) {
            bu.add(new C0003d(lIIIIIIIIlI[39], lIIIIIIIIlI[40], lIIIIIIIIlI[41]));
            "".length();
        }
    }

    private static void llIllIIllIllI() {
        lIIIIIIIIlI = new int[47];
        lIIIIIIIIlI[0] = ("   ".length() ^ (138 ^ 185)) & (((104 ^ 3) ^ (81 ^ 10)) ^ (-" ".length()));
        lIIIIIIIIlI[1] = " ".length();
        lIIIIIIIIlI[2] = (-((-19747) & 32047)) & (-18433) & 31727;
        lIIIIIIIIlI[3] = "  ".length();
        lIIIIIIIIlI[4] = "   ".length();
        lIIIIIIIIlI[5] = (-((-913) & 10229)) & (-2067) & 16382;
        lIIIIIIIIlI[6] = (176 ^ 190) ^ (149 ^ 159);
        lIIIIIIIIlI[7] = (-((-8937) & 15353)) & (-24577) & 32767;
        lIIIIIIIIlI[8] = (-16387) & 18171;
        lIIIIIIIIlI[9] = (140 ^ 182) ^ (27 ^ 36);
        lIIIIIIIIlI[10] = (((119 + 82) - 109) + 45) ^ (((121 + 120) - 107) + 9);
        lIIIIIIIIlI[11] = 38 ^ 33;
        lIIIIIIIIlI[12] = 70 ^ 78;
        lIIIIIIIIlI[13] = (-2348) & 60347;
        lIIIIIIIIlI[14] = 134 ^ 138;
        lIIIIIIIIlI[15] = 119 ^ 126;
        lIIIIIIIIlI[16] = (78 ^ 53) ^ (252 ^ 166);
        lIIIIIIIIlI[17] = (((108 + 9) - 13) + 77) ^ (((63 + 172) - 165) + 121);
        lIIIIIIIIlI[18] = (121 ^ 73) ^ (6 ^ 61);
        lIIIIIIIIlI[19] = 78 ^ 100;
        lIIIIIIIIlI[20] = 148 ^ 153;
        lIIIIIIIIlI[21] = (((56 + 102) - 88) + 60) ^ (((19 + 138) - 13) + 28);
        lIIIIIIIIlI[22] = 13 ^ 3;
        lIIIIIIIIlI[23] = (59 ^ 74) ^ (115 ^ 13);
        lIIIIIIIIlI[24] = 10 ^ 59;
        lIIIIIIIIlI[25] = (38 ^ 28) ^ (161 ^ 139);
        lIIIIIIIIlI[26] = 107 ^ 122;
        lIIIIIIIIlI[27] = (((50 + 23) - 12) + 88) ^ (((94 + 153) - 105) + 52);
        lIIIIIIIIlI[28] = (165 ^ 188) ^ (6 ^ 13);
        lIIIIIIIIlI[29] = (1 ^ 54) ^ (162 ^ 134);
        lIIIIIIIIlI[30] = 155 ^ 143;
        lIIIIIIIIlI[31] = 140 ^ 153;
        lIIIIIIIIlI[32] = (((11 + 53) - 45) + 111) ^ (((74 + 74) - 48) + 48);
        lIIIIIIIIlI[33] = (-28802) & 30651;
        lIIIIIIIIlI[34] = 23 ^ 121;
        lIIIIIIIIlI[35] = 20 ^ 3;
        lIIIIIIIIlI[36] = (-5) & 5614;
        lIIIIIIIIlI[37] = (-307) & 12286;
        lIIIIIIIIlI[38] = (-5715) & 30714;
        lIIIIIIIIlI[39] = (-((-19207) & 27583)) & (-16385) & 32767;
        lIIIIIIIIlI[40] = 233 ^ 193;
        lIIIIIIIIlI[41] = (-20572) & 21471;
        lIIIIIIIIlI[42] = (180 ^ 142) ^ (117 ^ 43);
        lIIIIIIIIlI[43] = 187 ^ 163;
        lIIIIIIIIlI[44] = 199 ^ 164;
        lIIIIIIIIlI[45] = (161 ^ 176) ^ (113 ^ 121);
        lIIIIIIIIlI[46] = (((42 + 44) - 8) + 110) ^ (((44 + 72) - 9) + 59);
    }

    private static boolean llIllIIllllII(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIllIIlllIII(int i, int i2) {
        return i < i2;
    }

    private static boolean llIllIIlllIIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIllIIllllII(Skills.getLevel(Skill.CRAFTING), lIIIIIIIIlI[44])) {
            ?? r0 = lIIIIIIIIlI[1];
            "".length();
            return (-" ".length()) > ((24 ^ 6) ^ (154 ^ 128)) ? ((1 ^ 15) ^ (5 ^ 23)) & (((197 ^ 154) ^ (7 ^ 68)) ^ (-" ".length())) : r0;
        }
        return lIIIIIIIIlI[0];
    }

    private static boolean llIllIIllIlll(int i) {
        return i != 0;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return lIIIIIIIIIl[lIIIIIIIIlI[43]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean aa() {
        int[] iArr = new int[lIIIIIIIIlI[1]];
        iArr[lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
        if (llIllIIlllIlI(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[lIIIIIIIIlI[1]];
            iArr2[lIIIIIIIIlI[0]] = lIIIIIIIIlI[8];
            if (llIllIIlllIlI(Inventory.getCount(iArr2))) {
                ?? r0 = lIIIIIIIIlI[1];
                "".length();
                return (-" ".length()) >= "   ".length() ? ((248 ^ 181) ^ (22 ^ 30)) & (((20 ^ 127) ^ (99 ^ 77)) ^ (-" ".length())) : r0;
            }
        }
        return lIIIIIIIIlI[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0070, code lost:
        if (llIllIIlllIlI(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017a, code lost:
        if (llIllIIllllII(net.unethicalite.api.items.Inventory.getCount(r0), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.Y.lIIIIIIIIlI[1]) != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b9, code lost:
        if (llIllIIlllIII(net.unethicalite.api.items.Inventory.getCount(r0), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.Y.lIIIIIIIIlI[1]) != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01bc, code lost:
        ae();
        java.lang.System.out.println(e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.Y.lIIIIIIIIIl[e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.Y.lIIIIIIIIlI[9]]);
        e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.Y.bs = e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.Y.lIIIIIIIIlI[1];
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
    public static void ef() {
        if (llIllIIllIlll(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = lIIIIIIIIIl[lIIIIIIIIlI[0]];
            C0001b.a(bu);
            if (llIllIIlllIII(bu.size(), lIIIIIIIIlI[1])) {
                System.out.println(lIIIIIIIIIl[lIIIIIIIIlI[1]]);
                bs = lIIIIIIIIlI[0];
            }
        }
        if (llIllIIlllIIl(bs ? 1 : 0)) {
            if (llIllIIllIlll(aa() ? 1 : 0)) {
                int[] iArr = new int[lIIIIIIIIlI[1]];
                iArr[lIIIIIIIIlI[0]] = lIIIIIIIIlI[2];
            }
            BankLocation nearest = BankLocation.getNearest();
            if (llIllIIlllIll(nearest) && llIllIIlllIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = lIIIIIIIIIl[lIIIIIIIIlI[3]];
                C0000a.a(nearest);
            }
            if (llIllIIlllIll(nearest) && llIllIIllIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (llIllIIlllIIl(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lIIIIIIIIIl[lIIIIIIIIlI[4]];
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIIIIIIIIlI[5]);
                    "".length();
                }
                if (llIllIIllIlll(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lIIIIIIIIIl[lIIIIIIIIlI[6]];
                    if (llIllIIlllIlI(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(lIIIIIIIIlI[4]);
                        "".length();
                    }
                    if (llIllIIlllIlI(Equipment.getAll().size())) {
                        Bank.depositEquipment();
                        Time.sleepTicks(lIIIIIIIIlI[3]);
                        "".length();
                    }
                    int[] iArr2 = new int[lIIIIIIIIlI[1]];
                    iArr2[lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
                    if (llIllIIlllIIl(Bank.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[lIIIIIIIIlI[1]];
                        iArr3[lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
                    }
                    int[] iArr4 = new int[lIIIIIIIIlI[1]];
                    iArr4[lIIIIIIIIlI[0]] = lIIIIIIIIlI[8];
                    if (llIllIIlllIIl(Bank.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lIIIIIIIIlI[1]];
                        iArr5[lIIIIIIIIlI[0]] = lIIIIIIIIlI[8];
                    }
                    int[] iArr6 = new int[lIIIIIIIIlI[1]];
                    iArr6[lIIIIIIIIlI[0]] = lIIIIIIIIlI[8];
                    if (llIllIIllIlll(Bank.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lIIIIIIIIlI[1]];
                        iArr7[lIIIIIIIIlI[0]] = lIIIIIIIIlI[8];
                        if (llIllIIlllIII(Inventory.getCount(iArr7), lIIIIIIIIlI[1])) {
                            Bank.withdraw(lIIIIIIIIlI[8], lIIIIIIIIlI[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIIIIIIIIlI[1]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr8 = new int[lIIIIIIIIlI[1]];
                                iArr8[lIIIIIIIIlI[0]] = lIIIIIIIIlI[8];
                                if (llIllIIlllIlI(Inventory.getCount(iArr8))) {
                                    ?? r0 = lIIIIIIIIlI[1];
                                    "".length();
                                    return "   ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIIIIIIIIlI[0];
                            }, lIIIIIIIIlI[5]);
                            "".length();
                        }
                    }
                    int[] iArr8 = new int[lIIIIIIIIlI[1]];
                    iArr8[lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
                    if (llIllIIllIlll(Bank.contains(iArr8) ? 1 : 0)) {
                        int[] iArr9 = new int[lIIIIIIIIlI[1]];
                        iArr9[lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
                        if (llIllIIlllIII(Inventory.getCount(iArr9), lIIIIIIIIlI[1])) {
                            int[] iArr10 = new int[lIIIIIIIIlI[1]];
                            iArr10[lIIIIIIIIlI[0]] = lIIIIIIIIlI[8];
                            if (llIllIIlllIlI(Inventory.getCount(iArr10))) {
                                Bank.withdrawAll(lIIIIIIIIlI[7], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIIIIIIIIlI[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr11 = new int[lIIIIIIIIlI[1]];
                                    iArr11[lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
                                    if (llIllIIlllIlI(Inventory.getCount(iArr11))) {
                                        ?? r0 = lIIIIIIIIlI[1];
                                        "".length();
                                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lIIIIIIIIlI[0];
                                }, lIIIIIIIIlI[5]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (llIllIIllIlll(aa() ? 1 : 0)) {
                if (llIllIIllIlll(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (llIllIIlllIIl(Bank.isOpen() ? 1 : 0) && llIllIIlllIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lIIIIIIIIIl[lIIIIIIIIlI[10]];
                    if (llIllIIllIlll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (llIllIIlllIIl(Production.isOpen() ? 1 : 0)) {
                        Time.sleepTicks(lIIIIIIIIlI[3]);
                        "".length();
                        int[] iArr11 = new int[lIIIIIIIIlI[1]];
                        iArr11[lIIIIIIIIlI[0]] = lIIIIIIIIlI[8];
                        Item first = Inventory.getFirst(iArr11);
                        int[] iArr12 = new int[lIIIIIIIIlI[1]];
                        iArr12[lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
                        Item first2 = Inventory.getFirst(iArr12);
                        if (llIllIIlllIll(first) && llIllIIlllIll(first2)) {
                            first.useOn(first2);
                            Time.sleepUntil(() -> {
                                return Production.isOpen();
                            }, lIIIIIIIIlI[5]);
                            "".length();
                        }
                    }
                    if (llIllIIllIlll(Production.isOpen() ? 1 : 0)) {
                        if (llIllIIlllIII(Skills.getLevel(Skill.CRAFTING), lIIIIIIIIlI[6])) {
                            AccBuilderTempleTrek.c = lIIIIIIIIIl[lIIIIIIIIlI[11]];
                            Production.chooseOption(lIIIIIIIIIl[lIIIIIIIIlI[12]]);
                            Time.sleepTicks(lIIIIIIIIlI[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIIIIIIIIlI[1]];
                                iArr13[lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
                                if (!llIllIIllllII(Inventory.getCount(iArr13), lIIIIIIIIlI[1]) || llIllIIllIlll(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIIIIIIIIlI[1];
                                    "".length();
                                    return " ".length() >= ((55 ^ 3) ^ (109 ^ 93)) ? ((62 ^ 104) ^ (57 ^ 117)) & (((79 ^ 114) ^ (87 ^ 112)) ^ (-" ".length())) : r0;
                                }
                                return lIIIIIIIIlI[0];
                            }, lIIIIIIIIlI[13]);
                            "".length();
                        }
                        if (llIllIIllllII(Skills.getLevel(Skill.CRAFTING), lIIIIIIIIlI[6]) && llIllIIlllIII(Skills.getLevel(Skill.CRAFTING), lIIIIIIIIlI[14])) {
                            AccBuilderTempleTrek.c = lIIIIIIIIIl[lIIIIIIIIlI[15]];
                            Production.chooseOption(lIIIIIIIIlI[3]);
                            Time.sleepTicks(lIIIIIIIIlI[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIIIIIIIIlI[1]];
                                iArr13[lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
                                if (!llIllIIllllII(Inventory.getCount(iArr13), lIIIIIIIIlI[1]) || llIllIIllIlll(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIIIIIIIIlI[1];
                                    "".length();
                                    return (((223 ^ 159) ^ (((51 + 26) - (-47)) + 3)) & (((((118 + 77) - 48) + 14) ^ (((151 + 118) - 139) + 28)) ^ (-" ".length()))) <= (-" ".length()) ? ((((128 + 17) - 124) + 188) ^ (((30 + 155) - 71) + 62)) & (((45 ^ 96) ^ (179 ^ 159)) ^ (-" ".length())) : r0;
                                }
                                return lIIIIIIIIlI[0];
                            }, lIIIIIIIIlI[13]);
                            "".length();
                        }
                        if (llIllIIllllII(Skills.getLevel(Skill.CRAFTING), lIIIIIIIIlI[14]) && llIllIIlllIII(Skills.getLevel(Skill.CRAFTING), lIIIIIIIIlI[16])) {
                            AccBuilderTempleTrek.c = lIIIIIIIIIl[lIIIIIIIIlI[17]];
                            Production.chooseOption(lIIIIIIIIIl[lIIIIIIIIlI[18]]);
                            Time.sleepTicks(lIIIIIIIIlI[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIIIIIIIIlI[1]];
                                iArr13[lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
                                if (!llIllIIllllII(Inventory.getCount(iArr13), lIIIIIIIIlI[1]) || llIllIIllIlll(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIIIIIIIIlI[1];
                                    "".length();
                                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIIIIIIIIlI[0];
                            }, lIIIIIIIIlI[13]);
                            "".length();
                        }
                        if (llIllIIllllII(Skills.getLevel(Skill.CRAFTING), lIIIIIIIIlI[16]) && llIllIIlllIII(Skills.getLevel(Skill.CRAFTING), lIIIIIIIIlI[19])) {
                            AccBuilderTempleTrek.c = lIIIIIIIIIl[lIIIIIIIIlI[14]];
                            Production.chooseOption(lIIIIIIIIIl[lIIIIIIIIlI[20]]);
                            Time.sleepTicks(lIIIIIIIIlI[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIIIIIIIIlI[1]];
                                iArr13[lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
                                if (!llIllIIllllII(Inventory.getCount(iArr13), lIIIIIIIIlI[1]) || llIllIIllIlll(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIIIIIIIIlI[1];
                                    "".length();
                                    return "   ".length() == " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIIIIIIIIlI[0];
                            }, lIIIIIIIIlI[13]);
                            "".length();
                        }
                        if (llIllIIllllII(Skills.getLevel(Skill.CRAFTING), lIIIIIIIIlI[19]) && llIllIIlllIII(Skills.getLevel(Skill.CRAFTING), lIIIIIIIIlI[21])) {
                            AccBuilderTempleTrek.c = lIIIIIIIIIl[lIIIIIIIIlI[22]];
                            Production.chooseOption(lIIIIIIIIIl[lIIIIIIIIlI[23]]);
                            Time.sleepTicks(lIIIIIIIIlI[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIIIIIIIIlI[1]];
                                iArr13[lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
                                if (!llIllIIllllII(Inventory.getCount(iArr13), lIIIIIIIIlI[1]) || llIllIIllIlll(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIIIIIIIIlI[1];
                                    "".length();
                                    return "  ".length() < ((4 ^ 38) & ((139 ^ 169) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIIIIIIIIlI[0];
                            }, lIIIIIIIIlI[13]);
                            "".length();
                        }
                        if (llIllIIllllII(Skills.getLevel(Skill.CRAFTING), lIIIIIIIIlI[21]) && llIllIIlllIII(Skills.getLevel(Skill.CRAFTING), lIIIIIIIIlI[24])) {
                            AccBuilderTempleTrek.c = lIIIIIIIIIl[lIIIIIIIIlI[25]];
                            Production.chooseOption(lIIIIIIIIIl[lIIIIIIIIlI[26]]);
                            Time.sleepTicks(lIIIIIIIIlI[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIIIIIIIIlI[1]];
                                iArr13[lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
                                if (!llIllIIllllII(Inventory.getCount(iArr13), lIIIIIIIIlI[1]) || llIllIIllIlll(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIIIIIIIIlI[1];
                                    "".length();
                                    return "   ".length() < (((241 ^ 165) ^ (131 ^ 145)) & (((52 ^ 39) ^ (65 ^ 20)) ^ (-" ".length()))) ? ((((100 + 185) - 112) + 17) ^ (((131 + 43) - 115) + 81)) & (((((16 + 133) - 117) + 112) ^ (((14 + 3) - (-115)) + 30)) ^ (-" ".length())) : r0;
                                }
                                return lIIIIIIIIlI[0];
                            }, lIIIIIIIIlI[13]);
                            "".length();
                        }
                        if (llIllIIllllII(Skills.getLevel(Skill.CRAFTING), lIIIIIIIIlI[24]) && llIllIIlllIII(Skills.getLevel(Skill.CRAFTING), lIIIIIIIIlI[27])) {
                            AccBuilderTempleTrek.c = lIIIIIIIIIl[lIIIIIIIIlI[28]];
                            Production.chooseOption(lIIIIIIIIIl[lIIIIIIIIlI[29]]);
                            Time.sleepTicks(lIIIIIIIIlI[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIIIIIIIIlI[1]];
                                iArr13[lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
                                if (!llIllIIllllII(Inventory.getCount(iArr13), lIIIIIIIIlI[1]) || llIllIIllIlll(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIIIIIIIIlI[1];
                                    "".length();
                                    return (-((69 ^ 78) ^ (104 ^ 103))) >= 0 ? ((164 ^ 173) ^ (74 ^ 16)) & (((122 ^ 127) ^ (43 ^ 125)) ^ (-" ".length())) : r0;
                                }
                                return lIIIIIIIIlI[0];
                            }, lIIIIIIIIlI[13]);
                            "".length();
                        }
                        if (llIllIIllllII(Skills.getLevel(Skill.CRAFTING), lIIIIIIIIlI[27])) {
                            AccBuilderTempleTrek.c = lIIIIIIIIIl[lIIIIIIIIlI[30]];
                            Production.chooseOption(lIIIIIIIIIl[lIIIIIIIIlI[31]]);
                            Time.sleepTicks(lIIIIIIIIlI[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIIIIIIIIlI[1]];
                                iArr13[lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
                                if (!llIllIIllllII(Inventory.getCount(iArr13), lIIIIIIIIlI[1]) || llIllIIllIlll(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIIIIIIIIlI[1];
                                    "".length();
                                    return " ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIIIIIIIIlI[0];
                            }, lIIIIIIIIlI[13]);
                            "".length();
                        }
                    }
                }
            }
        }
    }

    static {
        llIllIIllIllI();
        llIllIIllIlIl();
        jh = lIIIIIIIIlI[7];
        ji = lIIIIIIIIlI[8];
        bu = new ArrayList();
    }

    private static String llIllIIllIlII(String lllllllllllllllllIlIIIIIllIllIIl, String lllllllllllllllllIlIIIIIllIllIII) {
        try {
            SecretKeySpec lllllllllllllllllIlIIIIIllIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIIIllIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIIIIIIlI[3], lllllllllllllllllIlIIIIIllIlllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIIIllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIIIIllIllIlI) {
            lllllllllllllllllIlIIIIIllIllIlI.printStackTrace();
            return null;
        }
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        ef();
        return lIIIIIIIIlI[42];
    }

    private static boolean llIllIIlllIlI(int i) {
        return i > 0;
    }

    private static boolean llIllIIlllIll(Object obj) {
        return obj != null;
    }

    private static void llIllIIllIlIl() {
        lIIIIIIIIIl = new String[lIIIIIIIIlI[46]];
        lIIIIIIIIIl[lIIIIIIIIlI[0]] = llIllIIllIIlI("Lh0dKhgLSA03EwEb", "lhdCv");
        lIIIIIIIIIl[lIIIIIIIIlI[1]] = llIllIIllIIll("pk/8zEfk+hbSHbYQQl0BcgVapTV0x1dz5sKlXT5tnZMxjJIR0EF1ol6wjZsK9EcLO32TBlsqCAk=", "STxCi");
        lIIIIIIIIIl[lIIIIIIIIlI[3]] = llIllIIllIIlI("LBQUGCMDAQsfI0IBDVEmAxsJ", "bubqD");
        lIIIIIIIIIl[lIIIIIIIIlI[4]] = llIllIIllIIlI("NzsKOQwWLE81BBYg", "xKoWe");
        lIIIIIIIIIl[lIIIIIIIIlI[6]] = llIllIIllIlII("ZWJODGfU2kwlU/VlaBcUxpq5H0ODDk/S", "BdDcW");
        lIIIIIIIIIl[lIIIIIIIIlI[9]] = llIllIIllIlII("g/mGmX9YeCJtNYPNW0Nt2TBX42XqZmiIhNFPrjaraGdvHyYZWUR58IkhoksQv6D2", "RFhhm");
        lIIIIIIIIIl[lIIIIIIIIlI[10]] = llIllIIllIlII("JbyTRzlWFmAjhBhkiqu/Fw==", "wmInY");
        lIIIIIIIIIl[lIIIIIIIIlI[11]] = llIllIIllIIlI("AR80CjYrAzJMJS4MJh8=", "BmUlB");
        lIIIIIIIIIl[lIIIIIIIIlI[12]] = llIllIIllIlII("tFypHK1171lCdi5LtnZt8g==", "bEKRB");
        lIIIIIIIIIl[lIIIIIIIIlI[15]] = llIllIIllIlII("3UTs//aMETkA7yCWFc0z5FUDMYR2yfhg", "eweSm");
        lIIIIIIIIIl[lIIIIIIIIlI[17]] = llIllIIllIlII("a+ydAF/8f/Um/T87vaYMeQ==", "biijd");
        lIIIIIIIIIl[lIIIIIIIIlI[18]] = llIllIIllIIll("k0w25dfpBzNbIKKhAI+9kw==", "yguzM");
        lIIIIIIIIIl[lIIIIIIIIlI[14]] = llIllIIllIIlI("CD0NMTYiIQt3NCIuAA==", "KOlWB");
        lIIIIIIIIIl[lIIIIIIIIlI[20]] = llIllIIllIlII("iK6NeXB5V8k=", "ZpAjM");
        lIIIIIIIIIl[lIIIIIIIIlI[22]] = llIllIIllIlII("/A47J4bkBOywc3C3XiDvMkiBLI1nDqNW", "Dcjvd");
        lIIIIIIIIIl[lIIIIIIIIlI[23]] = llIllIIllIIll("kw635kHRvRldomxnW7iCfQ==", "tzeBF");
        lIIIIIIIIIl[lIIIIIIIIlI[25]] = llIllIIllIlII("5P/9DMYwV3i/Y+RTnC2AUw==", "ZBaFw");
        lIIIIIIIIIl[lIIIIIIIIlI[26]] = llIllIIllIIll("CRIBaflUXqk3oVu9xck0FZZsHJtMM6SK", "mknbg");
        lIIIIIIIIIl[lIIIIIIIIlI[28]] = llIllIIllIlII("aiM0XfzbPa0c65POAySJwg==", "Lmcmr");
        lIIIIIIIIIl[lIIIIIIIIlI[29]] = llIllIIllIlII("TEb/AcoY0FwQuRSEsCfoaQ==", "jjzFP");
        lIIIIIIIIIl[lIIIIIIIIlI[30]] = llIllIIllIIll("/OroW3cEvNIOXxEy++ymHcom+zPWZUch", "CiwKV");
        lIIIIIIIIIl[lIIIIIIIIlI[31]] = llIllIIllIlII("MaM/6B5sNQm2wLGXnK2JhQ==", "DnmDd");
        lIIIIIIIIIl[lIIIIIIIIlI[32]] = llIllIIllIIlI("MDwxPhoVaSU4GAYsJncTHig7JA==", "rIHWt");
        lIIIIIIIIIl[lIIIIIIIIlI[35]] = llIllIIllIlII("kChFfX6kWw2LLjQH6qz3WIrMykB2iNymFbFw/b3zchI=", "hlMUN");
        lIIIIIIIIIl[lIIIIIIIIlI[43]] = llIllIIllIIlI("AQM3ADwrHzE=", "BqVfH");
        lIIIIIIIIIl[lIIIIIIIIlI[45]] = llIllIIllIIlI("Mx44NEsuEXYkDiAbIjtLaQ==", "AwVSk");
    }

    private static String llIllIIllIIll(String lllllllllllllllllIlIIIIIllIIllII, String lllllllllllllllllIlIIIIIllIIlIll) {
        try {
            SecretKeySpec lllllllllllllllllIlIIIIIllIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIIIllIIlIll.getBytes(StandardCharsets.UTF_8)), lIIIIIIIIlI[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIIIIlI[3], lllllllllllllllllIlIIIIIllIIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIIIllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIIIIllIIllIl) {
            lllllllllllllllllIlIIIIIllIIllIl.printStackTrace();
            return null;
        }
    }
}
