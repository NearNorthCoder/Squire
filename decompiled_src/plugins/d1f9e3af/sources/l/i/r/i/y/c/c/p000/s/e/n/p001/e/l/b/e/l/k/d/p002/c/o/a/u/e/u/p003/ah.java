package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
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
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.ah  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/ah.class */
public class ah implements W {
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int[] lIlIlIIII;
    public static final /* synthetic */ int lQ;
    public static /* synthetic */ List<C0003d> bv;
    public static final /* synthetic */ int lP;
    private static /* synthetic */ String[] lIlIIllll;

    private static boolean lIIIlllIIIll(int i) {
        return i > 0;
    }

    private static void lIIIllIlllll() {
        lIlIlIIII = new int[47];
        lIlIlIIII[0] = (186 ^ 130) & ((146 ^ 170) ^ (-1));
        lIlIlIIII[1] = " ".length();
        lIlIlIIII[2] = (-15361) & 16355;
        lIlIlIIII[3] = "  ".length();
        lIlIlIIII[4] = "   ".length();
        lIlIlIIII[5] = (-((-25986) & 28083)) & (-17415) & 24511;
        lIlIlIIII[6] = (((69 + 80) - 45) + 79) ^ (((89 + 131) - 150) + 109);
        lIlIlIIII[7] = (-((-1603) & 15955)) & (-1) & 16127;
        lIlIlIIII[8] = (-((-25221) & 27525)) & (-20483) & 24571;
        lIlIlIIII[9] = 184 ^ 189;
        lIlIlIIII[10] = 138 ^ 140;
        lIlIlIIII[11] = (34 ^ 104) ^ (21 ^ 88);
        lIlIlIIII[12] = (67 ^ 10) ^ (237 ^ 172);
        lIlIlIIII[13] = (-6499) & 64498;
        lIlIlIIII[14] = 128 ^ 140;
        lIlIlIIII[15] = ((151 ^ 195) & ((95 ^ 11) ^ (-1))) ^ (201 ^ 192);
        lIlIlIIII[16] = (73 ^ 127) ^ (1 ^ 22);
        lIlIlIIII[17] = 129 ^ 139;
        lIlIlIIII[18] = (((14 + 44) - 26) + 119) ^ (((46 + 65) - (-35)) + 10);
        lIlIlIIII[19] = (98 ^ 117) ^ (109 ^ 80);
        lIlIlIIII[20] = 127 ^ 114;
        lIlIlIIII[21] = 102 ^ 72;
        lIlIlIIII[22] = (20 ^ 27) ^ " ".length();
        lIlIlIIII[23] = (247 ^ 148) ^ (79 ^ 35);
        lIlIlIIII[24] = 190 ^ 143;
        lIlIlIIII[25] = 27 ^ 11;
        lIlIlIIII[26] = (52 ^ 42) ^ (145 ^ 158);
        lIlIlIIII[27] = 86 ^ 1;
        lIlIlIIII[28] = 186 ^ 168;
        lIlIlIIII[29] = (51 ^ 46) ^ (43 ^ 37);
        lIlIlIIII[30] = 154 ^ 142;
        lIlIlIIII[31] = (((99 + 84) - 175) + 163) ^ (((105 + 167) - 169) + 87);
        lIlIlIIII[32] = (((101 + 101) - 147) + 86) ^ (((89 + 10) - 20) + 76);
        lIlIlIIII[33] = (-6209) & 8058;
        lIlIlIIII[34] = (((174 + 150) - 299) + 194) ^ (((159 + 17) - 73) + 78);
        lIlIlIIII[35] = 138 ^ 157;
        lIlIlIIII[36] = (-10242) & 15851;
        lIlIlIIII[37] = (-289) & 12268;
        lIlIlIIII[38] = (-1093) & 26092;
        lIlIlIIII[39] = (-((-13893) & 30429)) & (-8225) & 32767;
        lIlIlIIII[40] = 188 ^ 148;
        lIlIlIIII[41] = (-22545) & 23444;
        lIlIlIIII[42] = "   ".length() ^ (3 ^ 100);
        lIlIlIIII[43] = 164 ^ 188;
        lIlIlIIII[44] = 228 ^ 135;
        lIlIlIIII[45] = (((46 + 119) - 104) + 78) ^ (((140 + 13) - 126) + 119);
        lIlIlIIII[46] = (123 ^ 101) ^ (144 ^ 148);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIlIlIIII[0];
    }

    private static boolean lIIIlllIIIIl(int i, int i2) {
        return i < i2;
    }

    public static void af() {
        int[] iArr = new int[lIlIlIIII[1]];
        iArr[lIlIlIIII[0]] = lIlIlIIII[7];
        if (lIIIlllIIIlI(Bank.contains(iArr) ? 1 : 0)) {
            System.out.println(lIlIIllll[lIlIlIIII[32]]);
            bv.add(new C0003d(lIlIlIIII[7], lIlIlIIII[33], lIlIlIIII[34]));
            "".length();
        }
        int[] iArr2 = new int[lIlIlIIII[1]];
        iArr2[lIlIlIIII[0]] = lIlIlIIII[8];
        if (lIIIlllIIIlI(Bank.contains(iArr2) ? 1 : 0)) {
            System.out.println(lIlIIllll[lIlIlIIII[35]]);
            bv.add(new C0003d(lIlIlIIII[8], lIlIlIIII[1], lIlIlIIII[36]));
            "".length();
        }
        if (lIIIlllIIIlI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlIIllll[lIlIlIIII[45]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIlIlIIII[37], lIlIlIIII[9], lIlIlIIII[38]));
            "".length();
        }
        int[] iArr3 = new int[lIlIlIIII[1]];
        iArr3[lIlIlIIII[0]] = lIlIlIIII[39];
        if (lIIIlllIIIlI(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIlIlIIII[39], lIlIlIIII[40], lIlIlIIII[41]));
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIIIlllIIlIl(Skills.getLevel(Skill.CRAFTING), lIlIlIIII[44])) {
            ?? r0 = lIlIlIIII[1];
            "".length();
            return (-" ".length()) > 0 ? ((((110 + 60) - 77) + 49) ^ (((160 + 1) - 157) + 157)) & (((((127 + 62) - 143) + 141) ^ (((64 + 17) - 76) + 143)) ^ (-" ".length())) : r0;
        }
        return lIlIlIIII[0];
    }

    private static boolean lIIIlllIIIII(int i) {
        return i != 0;
    }

    private static String lIIIllIlllII(String lllIlIIllIlIlI, String lllIlIIllIlIIl) {
        try {
            SecretKeySpec lllIlIIllIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlIIllIlIIl.getBytes(StandardCharsets.UTF_8)), lIlIlIIII[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIIII[3], lllIlIIllIllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIlIIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIlIIllIlIll) {
            lllIlIIllIlIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean ab() {
        int[] iArr = new int[lIlIlIIII[1]];
        iArr[lIlIlIIII[0]] = lIlIlIIII[7];
        if (lIIIlllIIIll(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[lIlIlIIII[1]];
            iArr2[lIlIlIIII[0]] = lIlIlIIII[8];
            if (lIIIlllIIIll(Inventory.getCount(iArr2))) {
                ?? r0 = lIlIlIIII[1];
                "".length();
                return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return lIlIlIIII[0];
    }

    private static String lIIIllIllIll(String lllIlIIlIlllIl, String lllIlIIlIlllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlIIlIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIlIIlIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIlIIlIllllI) {
            lllIlIIlIllllI.printStackTrace();
            return null;
        }
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIlIIllll[lIlIlIIII[43]];
    }

    static {
        lIIIllIlllll();
        lIIIllIllllI();
        lQ = lIlIlIIII[8];
        lP = lIlIlIIII[7];
        bv = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0070, code lost:
        if (lIIIlllIIIll(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017a, code lost:
        if (lIIIlllIIlIl(net.unethicalite.api.items.Inventory.getCount(r0), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.ah.lIlIlIIII[1]) != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b9, code lost:
        if (lIIIlllIIIIl(net.unethicalite.api.items.Inventory.getCount(r0), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.ah.lIlIlIIII[1]) != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01bc, code lost:
        af();
        java.lang.System.out.println(l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.ah.lIlIIllll[l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.ah.lIlIlIIII[9]]);
        l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.ah.bt = l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.ah.lIlIlIIII[1];
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
    public static void dO() {
        if (lIIIlllIIIII(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[0]];
            C0001b.a(bv);
            if (lIIIlllIIIIl(bv.size(), lIlIlIIII[1])) {
                System.out.println(lIlIIllll[lIlIlIIII[1]]);
                bt = lIlIlIIII[0];
            }
        }
        if (lIIIlllIIIlI(bt ? 1 : 0)) {
            if (lIIIlllIIIII(ab() ? 1 : 0)) {
                int[] iArr = new int[lIlIlIIII[1]];
                iArr[lIlIlIIII[0]] = lIlIlIIII[2];
            }
            BankLocation nearest = BankLocation.getNearest();
            if (lIIIlllIIlII(nearest) && lIIIlllIIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[3]];
                C0000a.a(nearest);
            }
            if (lIIIlllIIlII(nearest) && lIIIlllIIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (lIIIlllIIIlI(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[4]];
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIlIlIIII[5]);
                    "".length();
                }
                if (lIIIlllIIIII(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[6]];
                    if (lIIIlllIIIll(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(lIlIlIIII[4]);
                        "".length();
                    }
                    if (lIIIlllIIIll(Equipment.getAll().size())) {
                        Bank.depositEquipment();
                        Time.sleepTicks(lIlIlIIII[3]);
                        "".length();
                    }
                    int[] iArr2 = new int[lIlIlIIII[1]];
                    iArr2[lIlIlIIII[0]] = lIlIlIIII[7];
                    if (lIIIlllIIIlI(Bank.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[lIlIlIIII[1]];
                        iArr3[lIlIlIIII[0]] = lIlIlIIII[7];
                    }
                    int[] iArr4 = new int[lIlIlIIII[1]];
                    iArr4[lIlIlIIII[0]] = lIlIlIIII[8];
                    if (lIIIlllIIIlI(Bank.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lIlIlIIII[1]];
                        iArr5[lIlIlIIII[0]] = lIlIlIIII[8];
                    }
                    int[] iArr6 = new int[lIlIlIIII[1]];
                    iArr6[lIlIlIIII[0]] = lIlIlIIII[8];
                    if (lIIIlllIIIII(Bank.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lIlIlIIII[1]];
                        iArr7[lIlIlIIII[0]] = lIlIlIIII[8];
                        if (lIIIlllIIIIl(Inventory.getCount(iArr7), lIlIlIIII[1])) {
                            Bank.withdraw(lIlIlIIII[8], lIlIlIIII[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIlIlIIII[1]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr8 = new int[lIlIlIIII[1]];
                                iArr8[lIlIlIIII[0]] = lIlIlIIII[8];
                                if (lIIIlllIIIll(Inventory.getCount(iArr8))) {
                                    ?? r0 = lIlIlIIII[1];
                                    "".length();
                                    return " ".length() == "   ".length() ? ((228 ^ 128) ^ (47 ^ 110)) & (((145 ^ 170) ^ (142 ^ 144)) ^ (-" ".length())) : r0;
                                }
                                return lIlIlIIII[0];
                            }, lIlIlIIII[5]);
                            "".length();
                        }
                    }
                    int[] iArr8 = new int[lIlIlIIII[1]];
                    iArr8[lIlIlIIII[0]] = lIlIlIIII[7];
                    if (lIIIlllIIIII(Bank.contains(iArr8) ? 1 : 0)) {
                        int[] iArr9 = new int[lIlIlIIII[1]];
                        iArr9[lIlIlIIII[0]] = lIlIlIIII[7];
                        if (lIIIlllIIIIl(Inventory.getCount(iArr9), lIlIlIIII[1])) {
                            int[] iArr10 = new int[lIlIlIIII[1]];
                            iArr10[lIlIlIIII[0]] = lIlIlIIII[8];
                            if (lIIIlllIIIll(Inventory.getCount(iArr10))) {
                                Bank.withdrawAll(lIlIlIIII[7], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIlIlIIII[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr11 = new int[lIlIlIIII[1]];
                                    iArr11[lIlIlIIII[0]] = lIlIlIIII[7];
                                    if (lIIIlllIIIll(Inventory.getCount(iArr11))) {
                                        ?? r0 = lIlIlIIII[1];
                                        "".length();
                                        return ((116 ^ 109) ^ (63 ^ 34)) != ((((150 + 130) - 130) + 8) ^ (((37 + 69) - 38) + 86)) ? ((214 ^ 135) ^ (113 ^ 57)) & (((34 ^ 102) ^ (123 ^ 38)) ^ (-" ".length())) : r0;
                                    }
                                    return lIlIlIIII[0];
                                }, lIlIlIIII[5]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (lIIIlllIIIII(ab() ? 1 : 0)) {
                if (lIIIlllIIIII(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (lIIIlllIIIlI(Bank.isOpen() ? 1 : 0) && lIIIlllIIIlI(Players.getLocal().isAnimating() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[10]];
                    if (lIIIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (lIIIlllIIIlI(Production.isOpen() ? 1 : 0)) {
                        Time.sleepTicks(lIlIlIIII[3]);
                        "".length();
                        int[] iArr11 = new int[lIlIlIIII[1]];
                        iArr11[lIlIlIIII[0]] = lIlIlIIII[8];
                        Item first = Inventory.getFirst(iArr11);
                        int[] iArr12 = new int[lIlIlIIII[1]];
                        iArr12[lIlIlIIII[0]] = lIlIlIIII[7];
                        Item first2 = Inventory.getFirst(iArr12);
                        if (lIIIlllIIlII(first) && lIIIlllIIlII(first2)) {
                            first.useOn(first2);
                            Time.sleepUntil(() -> {
                                return Production.isOpen();
                            }, lIlIlIIII[5]);
                            "".length();
                        }
                    }
                    if (lIIIlllIIIII(Production.isOpen() ? 1 : 0)) {
                        if (lIIIlllIIIIl(Skills.getLevel(Skill.CRAFTING), lIlIlIIII[6])) {
                            AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[11]];
                            Production.chooseOption(lIlIIllll[lIlIlIIII[12]]);
                            Time.sleepTicks(lIlIlIIII[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIlIlIIII[1]];
                                iArr13[lIlIlIIII[0]] = lIlIlIIII[7];
                                if (!lIIIlllIIlIl(Inventory.getCount(iArr13), lIlIlIIII[1]) || lIIIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIlIlIIII[1];
                                    "".length();
                                    return (-"   ".length()) >= 0 ? ((59 ^ 67) ^ (156 ^ 198)) & (((30 ^ 93) ^ (212 ^ 181)) ^ (-" ".length())) : r0;
                                }
                                return lIlIlIIII[0];
                            }, lIlIlIIII[13]);
                            "".length();
                        }
                        if (lIIIlllIIlIl(Skills.getLevel(Skill.CRAFTING), lIlIlIIII[6]) && lIIIlllIIIIl(Skills.getLevel(Skill.CRAFTING), lIlIlIIII[14])) {
                            AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[15]];
                            Production.chooseOption(lIlIlIIII[3]);
                            Time.sleepTicks(lIlIlIIII[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIlIlIIII[1]];
                                iArr13[lIlIlIIII[0]] = lIlIlIIII[7];
                                if (!lIIIlllIIlIl(Inventory.getCount(iArr13), lIlIlIIII[1]) || lIIIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIlIlIIII[1];
                                    "".length();
                                    return ((((84 + 44) - 120) + 138) ^ (((31 + 39) - (-34)) + 46)) == "  ".length() ? ((206 ^ 192) ^ (8 ^ 14)) & (((15 ^ 46) ^ (79 ^ 102)) ^ (-" ".length())) : r0;
                                }
                                return lIlIlIIII[0];
                            }, lIlIlIIII[13]);
                            "".length();
                        }
                        if (lIIIlllIIlIl(Skills.getLevel(Skill.CRAFTING), lIlIlIIII[14]) && lIIIlllIIIIl(Skills.getLevel(Skill.CRAFTING), lIlIlIIII[16])) {
                            AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[17]];
                            Production.chooseOption(lIlIIllll[lIlIlIIII[18]]);
                            Time.sleepTicks(lIlIlIIII[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIlIlIIII[1]];
                                iArr13[lIlIlIIII[0]] = lIlIlIIII[7];
                                if (!lIIIlllIIlIl(Inventory.getCount(iArr13), lIlIlIIII[1]) || lIIIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIlIlIIII[1];
                                    "".length();
                                    return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIlIlIIII[0];
                            }, lIlIlIIII[13]);
                            "".length();
                        }
                        if (lIIIlllIIlIl(Skills.getLevel(Skill.CRAFTING), lIlIlIIII[16]) && lIIIlllIIIIl(Skills.getLevel(Skill.CRAFTING), lIlIlIIII[19])) {
                            AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[14]];
                            Production.chooseOption(lIlIIllll[lIlIlIIII[20]]);
                            Time.sleepTicks(lIlIlIIII[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIlIlIIII[1]];
                                iArr13[lIlIlIIII[0]] = lIlIlIIII[7];
                                if (!lIIIlllIIlIl(Inventory.getCount(iArr13), lIlIlIIII[1]) || lIIIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIlIlIIII[1];
                                    "".length();
                                    return (-" ".length()) > "   ".length() ? ((61 ^ 67) ^ (162 ^ 139)) & (((((161 + 71) - 102) + 83) ^ (((60 + 24) - (-23)) + 23)) ^ (-" ".length())) : r0;
                                }
                                return lIlIlIIII[0];
                            }, lIlIlIIII[13]);
                            "".length();
                        }
                        if (lIIIlllIIlIl(Skills.getLevel(Skill.CRAFTING), lIlIlIIII[19]) && lIIIlllIIIIl(Skills.getLevel(Skill.CRAFTING), lIlIlIIII[21])) {
                            AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[22]];
                            Production.chooseOption(lIlIIllll[lIlIlIIII[23]]);
                            Time.sleepTicks(lIlIlIIII[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIlIlIIII[1]];
                                iArr13[lIlIlIIII[0]] = lIlIlIIII[7];
                                if (!lIIIlllIIlIl(Inventory.getCount(iArr13), lIlIlIIII[1]) || lIIIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIlIlIIII[1];
                                    "".length();
                                    return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIlIlIIII[0];
                            }, lIlIlIIII[13]);
                            "".length();
                        }
                        if (lIIIlllIIlIl(Skills.getLevel(Skill.CRAFTING), lIlIlIIII[21]) && lIIIlllIIIIl(Skills.getLevel(Skill.CRAFTING), lIlIlIIII[24])) {
                            AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[25]];
                            Production.chooseOption(lIlIIllll[lIlIlIIII[26]]);
                            Time.sleepTicks(lIlIlIIII[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIlIlIIII[1]];
                                iArr13[lIlIlIIII[0]] = lIlIlIIII[7];
                                if (!lIIIlllIIlIl(Inventory.getCount(iArr13), lIlIlIIII[1]) || lIIIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIlIlIIII[1];
                                    "".length();
                                    return (134 ^ 130) < "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIlIlIIII[0];
                            }, lIlIlIIII[13]);
                            "".length();
                        }
                        if (lIIIlllIIlIl(Skills.getLevel(Skill.CRAFTING), lIlIlIIII[24]) && lIIIlllIIIIl(Skills.getLevel(Skill.CRAFTING), lIlIlIIII[27])) {
                            AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[28]];
                            Production.chooseOption(lIlIIllll[lIlIlIIII[29]]);
                            Time.sleepTicks(lIlIlIIII[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIlIlIIII[1]];
                                iArr13[lIlIlIIII[0]] = lIlIlIIII[7];
                                if (!lIIIlllIIlIl(Inventory.getCount(iArr13), lIlIlIIII[1]) || lIIIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIlIlIIII[1];
                                    "".length();
                                    return 0 != 0 ? (!true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIlIlIIII[0];
                            }, lIlIlIIII[13]);
                            "".length();
                        }
                        if (lIIIlllIIlIl(Skills.getLevel(Skill.CRAFTING), lIlIlIIII[27])) {
                            AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[30]];
                            Production.chooseOption(lIlIIllll[lIlIlIIII[31]]);
                            Time.sleepTicks(lIlIlIIII[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIlIlIIII[1]];
                                iArr13[lIlIlIIII[0]] = lIlIlIIII[7];
                                if (!lIIIlllIIlIl(Inventory.getCount(iArr13), lIlIlIIII[1]) || lIIIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIlIlIIII[1];
                                    "".length();
                                    return 0 != 0 ? ((((109 + 165) - 186) + 117) ^ (((36 + 120) - 121) + 101)) & (((215 ^ 166) ^ (99 ^ 87)) ^ (-" ".length())) : r0;
                                }
                                return lIlIlIIII[0];
                            }, lIlIlIIII[13]);
                            "".length();
                        }
                    }
                }
            }
        }
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        dO();
        return lIlIlIIII[42];
    }

    private static String lIIIllIlllIl(String lllIlIIlllllll, String lllIlIIllllllI) {
        String str = new String(Base64.getDecoder().decode(lllIlIIlllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIlIIlllllIl = new StringBuilder();
        char[] lllIlIIlllllII = lllIlIIllllllI.toCharArray();
        int lllIlIIllllIll = lIlIlIIII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIlIIII[0];
        while (lIIIlllIIIIl(i, length)) {
            char lllIlIlIIIIIII = charArray[i];
            lllIlIIlllllIl.append((char) (lllIlIlIIIIIII ^ lllIlIIlllllII[lllIlIIllllIll % lllIlIIlllllII.length]));
            "".length();
            lllIlIIllllIll++;
            i++;
            "".length();
            if ((178 ^ 182) < 0) {
                return null;
            }
        }
        return String.valueOf(lllIlIIlllllIl);
    }

    private static boolean lIIIlllIIIlI(int i) {
        return i == 0;
    }

    private static void lIIIllIllllI() {
        lIlIIllll = new String[lIlIlIIII[46]];
        lIlIIllll[lIlIlIIII[0]] = lIIIllIllIll("K/lowOa4mJwP9upnPMo5iQ==", "GlAuu");
        lIlIIllll[lIlIlIIII[1]] = lIIIllIlllII("GbwobTK6qKV7ffDLU9rC7IccTifhdFUANjZQxzMHdp5XFogH3eXU69FihY9ezA9K8JRVw3zpfP0=", "WCBlS");
        lIlIIllll[lIlIlIIII[3]] = lIIIllIlllII("IpenBBMsN0842iRWJXjeaOGOpND/i7hA", "lxcPi");
        lIlIIllll[lIlIlIIII[4]] = lIIIllIlllII("Z5BH1bZe9sgzXT4NSpp1KQ==", "OWwXk");
        lIlIIllll[lIlIlIIII[6]] = lIIIllIllIll("SJ5TsMy3NStr+1LqCoF9wqj5yLMC2Qlb", "GiZnI");
        lIlIIllll[lIlIlIIII[9]] = lIIIllIlllIl("AC5aBxQyaxcPFSQiFAFGJD4KFgo+LglKRiQ8ExIFPyIUAUYjJFokMw4CNCE=", "WKzff");
        lIlIIllll[lIlIlIIII[10]] = lIIIllIlllII("bVxNulz1czk4igErGIoRRg==", "HybUz");
        lIlIIllll[lIlIlIIII[11]] = lIIIllIlllIl("IioAITAINgZnIw05EjQ=", "aXaGD");
        lIlIIllll[lIlIlIIII[12]] = lIIIllIlllII("2ZyJKghr8ju1e/YffCT4UA==", "rDgAl");
        lIlIIllll[lIlIlIIII[15]] = lIIIllIlllII("kJhI9cq3gJZSO6yGa4rEfvmf1halOAyM", "gYWlV");
        lIlIIllll[lIlIlIIII[17]] = lIIIllIlllII("f7obQoONGN57MgKbrL2k3Q==", "hhCmC");
        lIlIIllll[lIlIlIIII[18]] = lIIIllIlllIl("HyEWTykxJQo=", "PHzoE");
        lIlIIllll[lIlIlIIII[14]] = lIIIllIlllII("u1/S15vEr4BDziVkDNxUqQ==", "wFBIu");
        lIlIIllll[lIlIlIIII[20]] = lIIIllIllIll("QFhRrWPiONs=", "sGdKk");
        lIlIIllll[lIlIlIIII[22]] = lIIIllIlllIl("LDwxBT4GIDdDLAY9OAElGCI=", "oNPcJ");
        lIlIIllll[lIlIlIIII[23]] = lIIIllIllIll("7ccMCwTyHzVXVP3ri9Qw+g==", "ADwrS");
        lIlIIllll[lIlIlIIII[25]] = lIIIllIlllIl("FTkbIiU/JR1kPiQp", "VKzDQ");
        lIlIIllll[lIlIlIIII[26]] = lIIIllIlllIl("IgU9DT0SGSgGagQfLAQsVwQ/AA==", "wkMbJ");
        lIlIIllll[lIlIlIIII[28]] = lIIIllIlllIl("JysWDQwNNxBLFAE3BA==", "dYwkx");
        lIlIIllll[lIlIlIIII[29]] = lIIIllIlllII("+XpGX/mi8XDGsCHqSNDTdg==", "JYnWc");
        lIlIIllll[lIlIlIIII[30]] = lIIIllIlllIl("DAMqFB8mHyxSByYWIwZLIAMp", "OqKrk");
        lIlIIllll[lIlIlIIII[31]] = lIIIllIlllII("4l3FkUXaVn3i9UjBSPXbIw==", "QDkbT");
        lIlIIllll[lIlIlIIII[32]] = lIIIllIllIll("jVR7byKaIncEOh1ML4lTsyhREB5sKG1M", "BchsK");
        lIlIIllll[lIlIlIIII[35]] = lIIIllIlllIl("KD46BD8NayQBMBk4IQE+HSItCnEaIjMI", "jKCmQ");
        lIlIIllll[lIlIlIIII[43]] = lIIIllIlllIl("JAUzJSYOGTU=", "gwRCR");
        lIlIIllll[lIlIlIIII[45]] = lIIIllIlllIl("PRMBDHEgHE8cNC4WGwNxZw==", "OzokQ");
    }

    private static boolean lIIIlllIIlII(Object obj) {
        return obj != null;
    }

    private static boolean lIIIlllIIlIl(int i, int i2) {
        return i >= i2;
    }
}
