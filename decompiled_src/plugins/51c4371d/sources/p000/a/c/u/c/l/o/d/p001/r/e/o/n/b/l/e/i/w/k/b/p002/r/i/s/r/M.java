package p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r;

import gg.squire.account.AccBuilderBarrows;
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
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.M  reason: invalid package */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/M.class */
public class M implements F {
    private static /* synthetic */ int[] llIIllll;
    public static /* synthetic */ List<C0003d> bB;
    public static final /* synthetic */ int iU;
    public static /* synthetic */ boolean bz;
    private static /* synthetic */ String[] llIIllIl;
    public static final /* synthetic */ int iV;

    private static boolean lIlIllIIlIl(int i, int i2) {
        return i < i2;
    }

    private static String lIlIlIlIlII(String lIlIlIIIlIIIlIl, String lIlIlIIIlIIIlII) {
        String str = new String(Base64.getDecoder().decode(lIlIlIIIlIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIlIIIlIIIIll = new StringBuilder();
        char[] lIlIlIIIlIIIIlI = lIlIlIIIlIIIlII.toCharArray();
        int lIlIlIIIlIIIIIl = llIIllll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIllll[0];
        while (lIlIllIIlIl(i, length)) {
            char lIlIlIIIlIIIllI = charArray[i];
            lIlIlIIIlIIIIll.append((char) (lIlIlIIIlIIIllI ^ lIlIlIIIlIIIIlI[lIlIlIIIlIIIIIl % lIlIlIIIlIIIIlI.length]));
            "".length();
            lIlIlIIIlIIIIIl++;
            i++;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lIlIlIIIlIIIIll);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean ac() {
        int[] iArr = new int[llIIllll[1]];
        iArr[llIIllll[0]] = llIIllll[7];
        if (lIlIllIIlll(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[llIIllll[1]];
            iArr2[llIIllll[0]] = llIIllll[8];
            if (lIlIllIIlll(Inventory.getCount(iArr2))) {
                ?? r0 = llIIllll[1];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return llIIllll[0];
    }

    private static boolean lIlIllIIlII(int i) {
        return i != 0;
    }

    private static boolean lIlIllIlIII(Object obj) {
        return obj != null;
    }

    private static boolean lIlIllIlIIl(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean T() {
        return llIIllll[0];
    }

    private static void lIlIllIIIII() {
        llIIllIl = new String[llIIllll[46]];
        llIIllIl[llIIllll[0]] = lIlIlIlIIll("x4DWQwPn0F1RRhaCz7RPrw==", "quvxC");
        llIIllIl[llIIllll[1]] = lIlIlIlIIll("PHAyVke5PXWvpVwVggOF/grdiEpjKLiM4lr8I+g4I4EY5NE4Y8Mua45fbTVe0bUQgGv+uycPnic=", "WfkEA");
        llIIllIl[llIIllll[3]] = lIlIlIlIlII("GgciDA41Ej0LDnQSO0ULNQg/", "TfTei");
        llIIllIl[llIIllll[4]] = lIlIlIlIlIl("NvGBqIjYNeLwBKAFvTG6+Q==", "OmKgA");
        llIIllIl[llIIllll[6]] = lIlIlIlIlIl("eVlMXFFo4AStwWq3L+wodXw6DMw9ENSj", "VqfDh");
        llIIllIl[llIIllll[9]] = lIlIlIlIlII("Byh1Lh01bTgmHCMkOyhPIzglPwM5KCZjTyM6PDsMOCQ7KE8kInUNOgkEGwg=", "PMUOo");
        llIIllIl[llIIllll[10]] = lIlIlIlIIll("mYtntLm50j/jVLPoVZxLJg==", "tMTXx");
        llIIllIl[llIIllll[11]] = lIlIlIlIIll("sZ1qrmjg9OXc+v7PHfS6XA==", "aamQa");
        llIIllIl[llIIllll[12]] = lIlIlIlIlII("Mg4rGEQXBy8ZFw==", "pkNjd");
        llIIllIl[llIIllll[15]] = lIlIlIlIIll("2tq2pea5tGqt+S4v2iwCGH5dnR7wlGgZ", "PdtZx");
        llIIllIl[llIIllll[17]] = lIlIlIlIIll("UyNHFyW6xG0+6R1IdNyNJQ==", "lqrLs");
        llIIllIl[llIIllll[18]] = lIlIlIlIIll("s98qyr11ZIffUE6IX6i8Xg==", "qnChm");
        llIIllIl[llIIllll[14]] = lIlIlIlIIll("6CAmMcvvcSHfEgerC5msHw==", "xmIdi");
        llIIllIl[llIIllll[20]] = lIlIlIlIlII("IzEpJA==", "uXHHV");
        llIIllIl[llIIllll[22]] = lIlIlIlIlIl("qYechbSF1dFtDdJ1iYOcHjqWzsXxFPM6", "LvOfZ");
        llIIllIl[llIIllll[23]] = lIlIlIlIlIl("yu+fC7Hb1rkTHu9jJrUj9w==", "sprwB");
        llIIllIl[llIIllll[25]] = lIlIlIlIlII("ETgRIQY7JBdnHSAo", "RJpGr");
        llIIllIl[llIIllll[26]] = lIlIlIlIIll("XhdPt3tZhI6apg2SAGtsGGeIUT+ZjlGu", "FXjPW");
        llIIllIl[llIIllll[28]] = lIlIlIlIlIl("b7VMSvU1AZV8QUf3rmoiRw==", "pfvWZ");
        llIIllIl[llIIllll[29]] = lIlIlIlIlIl("4KtPf7UfRiKBHgYg8dRyLg==", "RTLCr");
        llIIllIl[llIIllll[30]] = lIlIlIlIIll("11dHxjeCYyA9LXjgxrKFBhQ/Yv2Nhi6H", "kLOZG");
        llIIllIl[llIIllll[31]] = lIlIlIlIIll("3JsF82XpcH+/PN6SiOyzBA==", "xiGjn");
        llIIllIl[llIIllll[32]] = lIlIlIlIlII("GzIjPy8+Zzc5LS0iNHYmNSYpJQ==", "YGZVA");
        llIIllIl[llIIllll[35]] = lIlIlIlIlIl("yeLFtAuJpiRicOxH2Se/FIvlwhI/E+Bi9V56iuRDwTk=", "THMfi");
        llIIllIl[llIIllll[43]] = lIlIlIlIlIl("zhrDnSOZ8Wpy+/di3yaUtg==", "ZQsia");
        llIIllIl[llIIllll[45]] = lIlIlIlIIll("p7pyzUHe3mKx5/2Yl3finNP/ANcdiVCi", "cExnf");
    }

    private static boolean lIlIllIIllI(int i) {
        return i == 0;
    }

    static {
        lIlIllIIIll();
        lIlIllIIIII();
        iU = llIIllll[7];
        iV = llIIllll[8];
        bB = new ArrayList();
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public String V() {
        return llIIllIl[llIIllll[43]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean W() {
        if (lIlIllIlIIl(Skills.getLevel(Skill.CRAFTING), llIIllll[44])) {
            ?? r0 = llIIllll[1];
            "".length();
            return ((39 ^ 69) & ((74 ^ 40) ^ (-1))) >= (131 ^ 135) ? (false ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIllll[0];
    }

    private static void lIlIllIIIll() {
        llIIllll = new int[47];
        llIIllll[0] = ((((23 + 19) - (-100)) + 12) ^ (((165 + 3) - 151) + 178)) & (((23 ^ 34) ^ (82 ^ 62)) ^ (-" ".length()));
        llIIllll[1] = " ".length();
        llIIllll[2] = (-22545) & 23539;
        llIIllll[3] = "  ".length();
        llIIllll[4] = "   ".length();
        llIIllll[5] = (-27751) & 32750;
        llIIllll[6] = 143 ^ 139;
        llIIllll[7] = (-2065) & 3839;
        llIIllll[8] = (-((-2577) & 19223)) & (-1) & 18431;
        llIIllll[9] = (242 ^ 143) ^ (47 ^ 87);
        llIIllll[10] = 74 ^ 76;
        llIIllll[11] = 107 ^ 108;
        llIIllll[12] = (((10 + 109) - 52) + 67) ^ (((138 + 92) - 184) + 96);
        llIIllll[13] = (-((-10650) & 15839)) & (-299) & 63487;
        llIIllll[14] = (40 ^ 72) ^ (169 ^ 197);
        llIIllll[15] = (117 ^ 53) ^ (37 ^ 108);
        llIIllll[16] = (((113 + 126) - 218) + 123) ^ (((98 + 70) - 141) + 150);
        llIIllll[17] = 43 ^ 33;
        llIIllll[18] = (18 ^ 24) ^ " ".length();
        llIIllll[19] = 178 ^ 152;
        llIIllll[20] = 174 ^ 163;
        llIIllll[21] = 9 ^ 39;
        llIIllll[22] = 169 ^ 167;
        llIIllll[23] = 183 ^ 184;
        llIIllll[24] = 88 ^ 105;
        llIIllll[25] = 84 ^ 68;
        llIIllll[26] = (((48 + 23) - (-40)) + 72) ^ (((108 + 89) - 134) + 103);
        llIIllll[27] = 67 ^ 20;
        llIIllll[28] = 12 ^ 30;
        llIIllll[29] = (109 ^ 55) ^ (137 ^ 192);
        llIIllll[30] = 136 ^ 156;
        llIIllll[31] = (16 ^ 114) ^ (16 ^ 103);
        llIIllll[32] = (165 ^ 184) ^ (2 ^ 9);
        llIIllll[33] = (-((-4977) & 31729)) & (-4162) & 32763;
        llIIllll[34] = (((211 + 136) - 192) + 88) ^ (((60 + 31) - (-3)) + 63);
        llIIllll[35] = 122 ^ 109;
        llIIllll[36] = (-25106) & 30715;
        llIIllll[37] = (-((-30786) & 31077)) & (-17) & 12287;
        llIIllll[38] = (-(66 ^ 87)) & (-579) & 25598;
        llIIllll[39] = (-(113 ^ 64)) & (-1) & 8055;
        llIIllll[40] = (87 ^ 54) ^ (20 ^ 93);
        llIIllll[41] = (-21514) & 22413;
        llIIllll[42] = 63 ^ 91;
        llIIllll[43] = (193 ^ 188) ^ (166 ^ 195);
        llIIllll[44] = (((6 + 208) - 24) + 51) ^ (((7 + 57) - (-56)) + 26);
        llIIllll[45] = (53 ^ 47) ^ "   ".length();
        llIIllll[46] = (((76 + 72) - 127) + 113) ^ (((73 + 131) - 167) + 119);
    }

    public static void ag() {
        int[] iArr = new int[llIIllll[1]];
        iArr[llIIllll[0]] = llIIllll[7];
        if (lIlIllIIllI(Bank.contains(iArr) ? 1 : 0)) {
            System.out.println(llIIllIl[llIIllll[32]]);
            bB.add(new C0003d(llIIllll[7], llIIllll[33], llIIllll[34]));
            "".length();
        }
        int[] iArr2 = new int[llIIllll[1]];
        iArr2[llIIllll[0]] = llIIllll[8];
        if (lIlIllIIllI(Bank.contains(iArr2) ? 1 : 0)) {
            System.out.println(llIIllIl[llIIllll[35]]);
            bB.add(new C0003d(llIIllll[8], llIIllll[1], llIIllll[36]));
            "".length();
        }
        if (lIlIllIIllI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIIllIl[llIIllll[45]]);
        }) ? 1 : 0)) {
            bB.add(new C0003d(llIIllll[37], llIIllll[9], llIIllll[38]));
            "".length();
        }
        int[] iArr3 = new int[llIIllll[1]];
        iArr3[llIIllll[0]] = llIIllll[39];
        if (lIlIllIIllI(Bank.contains(iArr3) ? 1 : 0)) {
            bB.add(new C0003d(llIIllll[39], llIIllll[40], llIIllll[41]));
            "".length();
        }
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public int U() {
        cK();
        return llIIllll[42];
    }

    private static String lIlIlIlIlIl(String lIlIlIIIIllIIII, String lIlIlIIIIlIllll) {
        try {
            SecretKeySpec lIlIlIIIIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlIIIIlIllll.getBytes(StandardCharsets.UTF_8)), llIIllll[12]), "DES");
            Cipher lIlIlIIIIllIIlI = Cipher.getInstance("DES");
            lIlIlIIIIllIIlI.init(llIIllll[3], lIlIlIIIIllIIll);
            return new String(lIlIlIIIIllIIlI.doFinal(Base64.getDecoder().decode(lIlIlIIIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlIIIIllIIIl) {
            lIlIlIIIIllIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIIlll(int i) {
        return i > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0070, code lost:
        if (lIlIllIIlll(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017a, code lost:
        if (lIlIllIlIIl(net.unethicalite.api.items.Inventory.getCount(r0), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.M.llIIllll[1]) != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b9, code lost:
        if (lIlIllIIlIl(net.unethicalite.api.items.Inventory.getCount(r0), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.M.llIIllll[1]) != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01bc, code lost:
        ag();
        java.lang.System.out.println(p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.M.llIIllIl[p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.M.llIIllll[9]]);
        p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.M.bz = p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.M.llIIllll[1];
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
    public static void cK() {
        if (lIlIllIIlII(bz ? 1 : 0)) {
            AccBuilderBarrows.c = llIIllIl[llIIllll[0]];
            C0001b.a(bB);
            if (lIlIllIIlIl(bB.size(), llIIllll[1])) {
                System.out.println(llIIllIl[llIIllll[1]]);
                bz = llIIllll[0];
            }
        }
        if (lIlIllIIllI(bz ? 1 : 0)) {
            if (lIlIllIIlII(ac() ? 1 : 0)) {
                int[] iArr = new int[llIIllll[1]];
                iArr[llIIllll[0]] = llIIllll[2];
            }
            BankLocation nearest = BankLocation.getNearest();
            if (lIlIllIlIII(nearest) && lIlIllIIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderBarrows.c = llIIllIl[llIIllll[3]];
                C0000a.a(nearest);
            }
            if (lIlIllIlIII(nearest) && lIlIllIIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (lIlIllIIllI(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderBarrows.c = llIIllIl[llIIllll[4]];
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, llIIllll[5]);
                    "".length();
                }
                if (lIlIllIIlII(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderBarrows.c = llIIllIl[llIIllll[6]];
                    if (lIlIllIIlll(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(llIIllll[4]);
                        "".length();
                    }
                    if (lIlIllIIlll(Equipment.getAll().size())) {
                        Bank.depositEquipment();
                        Time.sleepTicks(llIIllll[3]);
                        "".length();
                    }
                    int[] iArr2 = new int[llIIllll[1]];
                    iArr2[llIIllll[0]] = llIIllll[7];
                    if (lIlIllIIllI(Bank.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[llIIllll[1]];
                        iArr3[llIIllll[0]] = llIIllll[7];
                    }
                    int[] iArr4 = new int[llIIllll[1]];
                    iArr4[llIIllll[0]] = llIIllll[8];
                    if (lIlIllIIllI(Bank.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[llIIllll[1]];
                        iArr5[llIIllll[0]] = llIIllll[8];
                    }
                    int[] iArr6 = new int[llIIllll[1]];
                    iArr6[llIIllll[0]] = llIIllll[8];
                    if (lIlIllIIlII(Bank.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[llIIllll[1]];
                        iArr7[llIIllll[0]] = llIIllll[8];
                        if (lIlIllIIlIl(Inventory.getCount(iArr7), llIIllll[1])) {
                            Bank.withdraw(llIIllll[8], llIIllll[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(llIIllll[1]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr8 = new int[llIIllll[1]];
                                iArr8[llIIllll[0]] = llIIllll[8];
                                if (lIlIllIIlll(Inventory.getCount(iArr8))) {
                                    ?? r0 = llIIllll[1];
                                    "".length();
                                    return (-"  ".length()) >= 0 ? ((208 ^ 181) ^ (31 ^ 54)) & (((67 ^ 115) ^ (81 ^ 45)) ^ (-" ".length())) : r0;
                                }
                                return llIIllll[0];
                            }, llIIllll[5]);
                            "".length();
                        }
                    }
                    int[] iArr8 = new int[llIIllll[1]];
                    iArr8[llIIllll[0]] = llIIllll[7];
                    if (lIlIllIIlII(Bank.contains(iArr8) ? 1 : 0)) {
                        int[] iArr9 = new int[llIIllll[1]];
                        iArr9[llIIllll[0]] = llIIllll[7];
                        if (lIlIllIIlIl(Inventory.getCount(iArr9), llIIllll[1])) {
                            int[] iArr10 = new int[llIIllll[1]];
                            iArr10[llIIllll[0]] = llIIllll[8];
                            if (lIlIllIIlll(Inventory.getCount(iArr10))) {
                                Bank.withdrawAll(llIIllll[7], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(llIIllll[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr11 = new int[llIIllll[1]];
                                    iArr11[llIIllll[0]] = llIIllll[7];
                                    if (lIlIllIIlll(Inventory.getCount(iArr11))) {
                                        ?? r0 = llIIllll[1];
                                        "".length();
                                        return "   ".length() < "  ".length() ? "  ".length() & ("  ".length() ^ (-1)) : r0;
                                    }
                                    return llIIllll[0];
                                }, llIIllll[5]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (lIlIllIIlII(ac() ? 1 : 0)) {
                if (lIlIllIIlII(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (lIlIllIIllI(Bank.isOpen() ? 1 : 0) && lIlIllIIllI(Players.getLocal().isAnimating() ? 1 : 0)) {
                    AccBuilderBarrows.c = llIIllIl[llIIllll[10]];
                    if (lIlIllIIlII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (lIlIllIIllI(Production.isOpen() ? 1 : 0)) {
                        Time.sleepTicks(llIIllll[3]);
                        "".length();
                        int[] iArr11 = new int[llIIllll[1]];
                        iArr11[llIIllll[0]] = llIIllll[8];
                        Item first = Inventory.getFirst(iArr11);
                        int[] iArr12 = new int[llIIllll[1]];
                        iArr12[llIIllll[0]] = llIIllll[7];
                        Item first2 = Inventory.getFirst(iArr12);
                        if (lIlIllIlIII(first) && lIlIllIlIII(first2)) {
                            first.useOn(first2);
                            Time.sleepUntil(() -> {
                                return Production.isOpen();
                            }, llIIllll[5]);
                            "".length();
                        }
                    }
                    if (lIlIllIIlII(Production.isOpen() ? 1 : 0)) {
                        if (lIlIllIIlIl(Skills.getLevel(Skill.CRAFTING), llIIllll[6])) {
                            AccBuilderBarrows.c = llIIllIl[llIIllll[11]];
                            Production.chooseOption(llIIllIl[llIIllll[12]]);
                            Time.sleepTicks(llIIllll[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[llIIllll[1]];
                                iArr13[llIIllll[0]] = llIIllll[7];
                                if (!lIlIllIlIIl(Inventory.getCount(iArr13), llIIllll[1]) || lIlIllIIlII(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = llIIllll[1];
                                    "".length();
                                    return ((189 ^ 171) & ((136 ^ 158) ^ (-1))) == "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIIllll[0];
                            }, llIIllll[13]);
                            "".length();
                        }
                        if (lIlIllIlIIl(Skills.getLevel(Skill.CRAFTING), llIIllll[6]) && lIlIllIIlIl(Skills.getLevel(Skill.CRAFTING), llIIllll[14])) {
                            AccBuilderBarrows.c = llIIllIl[llIIllll[15]];
                            Production.chooseOption(llIIllll[3]);
                            Time.sleepTicks(llIIllll[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[llIIllll[1]];
                                iArr13[llIIllll[0]] = llIIllll[7];
                                if (!lIlIllIlIIl(Inventory.getCount(iArr13), llIIllll[1]) || lIlIllIIlII(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = llIIllll[1];
                                    "".length();
                                    return "  ".length() < 0 ? ((((113 + 81) - 37) + 38) ^ (((80 + 7) - 79) + 123)) & (((108 ^ 61) ^ (57 ^ 40)) ^ (-" ".length())) : r0;
                                }
                                return llIIllll[0];
                            }, llIIllll[13]);
                            "".length();
                        }
                        if (lIlIllIlIIl(Skills.getLevel(Skill.CRAFTING), llIIllll[14]) && lIlIllIIlIl(Skills.getLevel(Skill.CRAFTING), llIIllll[16])) {
                            AccBuilderBarrows.c = llIIllIl[llIIllll[17]];
                            Production.chooseOption(llIIllIl[llIIllll[18]]);
                            Time.sleepTicks(llIIllll[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[llIIllll[1]];
                                iArr13[llIIllll[0]] = llIIllll[7];
                                if (!lIlIllIlIIl(Inventory.getCount(iArr13), llIIllll[1]) || lIlIllIIlII(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = llIIllll[1];
                                    "".length();
                                    return (-" ".length()) != (-" ".length()) ? ((153 ^ 160) ^ (82 ^ 94)) & (((251 ^ 157) ^ (211 ^ 128)) ^ (-" ".length())) : r0;
                                }
                                return llIIllll[0];
                            }, llIIllll[13]);
                            "".length();
                        }
                        if (lIlIllIlIIl(Skills.getLevel(Skill.CRAFTING), llIIllll[16]) && lIlIllIIlIl(Skills.getLevel(Skill.CRAFTING), llIIllll[19])) {
                            AccBuilderBarrows.c = llIIllIl[llIIllll[14]];
                            Production.chooseOption(llIIllIl[llIIllll[20]]);
                            Time.sleepTicks(llIIllll[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[llIIllll[1]];
                                iArr13[llIIllll[0]] = llIIllll[7];
                                if (!lIlIllIlIIl(Inventory.getCount(iArr13), llIIllll[1]) || lIlIllIIlII(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = llIIllll[1];
                                    "".length();
                                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIIllll[0];
                            }, llIIllll[13]);
                            "".length();
                        }
                        if (lIlIllIlIIl(Skills.getLevel(Skill.CRAFTING), llIIllll[19]) && lIlIllIIlIl(Skills.getLevel(Skill.CRAFTING), llIIllll[21])) {
                            AccBuilderBarrows.c = llIIllIl[llIIllll[22]];
                            Production.chooseOption(llIIllIl[llIIllll[23]]);
                            Time.sleepTicks(llIIllll[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[llIIllll[1]];
                                iArr13[llIIllll[0]] = llIIllll[7];
                                if (!lIlIllIlIIl(Inventory.getCount(iArr13), llIIllll[1]) || lIlIllIIlII(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = llIIllll[1];
                                    "".length();
                                    return "   ".length() < (-" ".length()) ? ((((35 + 184) - 157) + 150) ^ (((110 + 86) - 82) + 28)) & (((78 ^ 61) ^ (113 ^ 88)) ^ (-" ".length())) : r0;
                                }
                                return llIIllll[0];
                            }, llIIllll[13]);
                            "".length();
                        }
                        if (lIlIllIlIIl(Skills.getLevel(Skill.CRAFTING), llIIllll[21]) && lIlIllIIlIl(Skills.getLevel(Skill.CRAFTING), llIIllll[24])) {
                            AccBuilderBarrows.c = llIIllIl[llIIllll[25]];
                            Production.chooseOption(llIIllIl[llIIllll[26]]);
                            Time.sleepTicks(llIIllll[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[llIIllll[1]];
                                iArr13[llIIllll[0]] = llIIllll[7];
                                if (!lIlIllIlIIl(Inventory.getCount(iArr13), llIIllll[1]) || lIlIllIIlII(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = llIIllll[1];
                                    "".length();
                                    return (((((127 + 25) - 34) + 32) ^ (((179 + 67) - 115) + 49)) & (((174 ^ 135) ^ (43 ^ 32)) ^ (-" ".length()))) >= " ".length() ? ((7 ^ 122) ^ (163 ^ 130)) & (((92 ^ 67) ^ (197 ^ 134)) ^ (-" ".length())) : r0;
                                }
                                return llIIllll[0];
                            }, llIIllll[13]);
                            "".length();
                        }
                        if (lIlIllIlIIl(Skills.getLevel(Skill.CRAFTING), llIIllll[24]) && lIlIllIIlIl(Skills.getLevel(Skill.CRAFTING), llIIllll[27])) {
                            AccBuilderBarrows.c = llIIllIl[llIIllll[28]];
                            Production.chooseOption(llIIllIl[llIIllll[29]]);
                            Time.sleepTicks(llIIllll[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[llIIllll[1]];
                                iArr13[llIIllll[0]] = llIIllll[7];
                                if (!lIlIllIlIIl(Inventory.getCount(iArr13), llIIllll[1]) || lIlIllIIlII(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = llIIllll[1];
                                    "".length();
                                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIIllll[0];
                            }, llIIllll[13]);
                            "".length();
                        }
                        if (lIlIllIlIIl(Skills.getLevel(Skill.CRAFTING), llIIllll[27])) {
                            AccBuilderBarrows.c = llIIllIl[llIIllll[30]];
                            Production.chooseOption(llIIllIl[llIIllll[31]]);
                            Time.sleepTicks(llIIllll[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[llIIllll[1]];
                                iArr13[llIIllll[0]] = llIIllll[7];
                                if (!lIlIllIlIIl(Inventory.getCount(iArr13), llIIllll[1]) || lIlIllIIlII(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = llIIllll[1];
                                    "".length();
                                    return (-"   ".length()) >= 0 ? ((146 ^ 129) ^ (15 ^ 5)) & (((((22 + 125) - 36) + 23) ^ (((143 + 10) - 141) + 147)) ^ (-" ".length())) : r0;
                                }
                                return llIIllll[0];
                            }, llIIllll[13]);
                            "".length();
                        }
                    }
                }
            }
        }
    }

    private static String lIlIlIlIIll(String lIlIlIIIIlIIIll, String lIlIlIIIIlIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlIIIIlIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlIIIIlIIlIl = Cipher.getInstance("Blowfish");
            lIlIlIIIIlIIlIl.init(llIIllll[3], secretKeySpec);
            return new String(lIlIlIIIIlIIlIl.doFinal(Base64.getDecoder().decode(lIlIlIIIIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlIIIIlIIlII) {
            lIlIlIIIIlIIlII.printStackTrace();
            return null;
        }
    }
}
