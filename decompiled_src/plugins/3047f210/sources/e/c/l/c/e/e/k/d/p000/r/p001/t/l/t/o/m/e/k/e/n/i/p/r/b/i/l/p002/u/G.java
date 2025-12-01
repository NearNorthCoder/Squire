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
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.G  reason: invalid package */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/G.class */
public class G implements S {
    private static final /* synthetic */ int hi;
    public static /* synthetic */ List<C0003d> bu;
    private static /* synthetic */ int[] lllIlIllIl;
    static /* synthetic */ boolean cl;
    private static final /* synthetic */ WorldPoint hd;
    private static final /* synthetic */ int hf;
    static /* synthetic */ int bS;
    private static final /* synthetic */ int hk;
    private static final /* synthetic */ int hj;
    private static /* synthetic */ String[] lllIlIllII;
    private static final /* synthetic */ int hn;
    private static final /* synthetic */ int hl;
    private static final /* synthetic */ int hh;
    static /* synthetic */ String[] eR;
    public static /* synthetic */ boolean bs;
    private static final /* synthetic */ int ho;
    private static final /* synthetic */ int hg;
    static /* synthetic */ int ck;
    static /* synthetic */ String gc;
    private static final /* synthetic */ int he;
    private static final /* synthetic */ int hm;

    private static boolean llIIIllIllllI(int i) {
        return i != 0;
    }

    private static boolean llIIIlllIIllI(int i, int i2) {
        return i >= i2;
    }

    static {
        llIIIllIlllIl();
        llIIIllIlllII();
        hf = lllIlIllIl[21];
        hj = lllIlIllIl[10];
        hm = lllIlIllIl[86];
        hn = lllIlIllIl[25];
        he = lllIlIllIl[2];
        hi = lllIlIllIl[24];
        hk = lllIlIllIl[15];
        ho = lllIlIllIl[17];
        hh = lllIlIllIl[23];
        hg = lllIlIllIl[22];
        hl = lllIlIllIl[13];
        hd = new WorldPoint(lllIlIllIl[87], lllIlIllIl[88], lllIlIllIl[3]);
        bu = new ArrayList();
        gc = lllIlIllII[lllIlIllIl[89]];
        String[] strArr = new String[lllIlIllIl[12]];
        strArr[lllIlIllIl[0]] = lllIlIllII[lllIlIllIl[90]];
        strArr[lllIlIllIl[1]] = lllIlIllII[lllIlIllIl[91]];
        strArr[lllIlIllIl[3]] = lllIlIllII[lllIlIllIl[92]];
        strArr[lllIlIllIl[4]] = lllIlIllII[lllIlIllIl[93]];
        strArr[lllIlIllIl[6]] = lllIlIllII[lllIlIllIl[94]];
        strArr[lllIlIllIl[9]] = lllIlIllII[lllIlIllIl[95]];
        eR = strArr;
        bS = lllIlIllIl[0];
    }

    private static boolean llIIIlllIIIll(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIIIlllIIllI(C0004e.j(lllIlIllIl[2]), lllIlIllIl[3])) {
            ?? r0 = lllIlIllIl[1];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIlIllIl[0];
    }

    private static boolean llIIIlllIIIIl(Object obj) {
        return obj != null;
    }

    private static boolean llIIIlllIIlIl(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIIIlllIIIlI(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v367, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v376, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v385, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v394, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v403, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v412, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v438, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    public static void ct() {
        if (llIIIllIllllI(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIlIllII[lllIlIllIl[0]];
            C0001b.a(bu);
            if (llIIIllIlllll(bu.size(), lllIlIllIl[1])) {
                System.out.println(lllIlIllII[lllIlIllIl[1]]);
                bs = lllIlIllIl[0];
            }
        }
        if (llIIIlllIIIII(bs ? 1 : 0)) {
            if (llIIIlllIIIII(C0004e.j(lllIlIllIl[2]))) {
                if (llIIIlllIIIII(bz() ? 1 : 0)) {
                    BankLocation nearest = BankLocation.getNearest();
                    if (llIIIlllIIIIl(nearest) && llIIIlllIIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllIlIllII[lllIlIllIl[3]];
                        C0000a.a(nearest);
                    }
                    if (llIIIlllIIIIl(nearest) && llIIIllIllllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (llIIIlllIIIII(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllIlIllII[lllIlIllIl[4]];
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, lllIlIllIl[5]);
                            "".length();
                        }
                        if (llIIIllIllllI(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllIlIllII[lllIlIllIl[6]];
                            if (llIIIlllIIIlI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(lllIlIllIl[4]);
                                "".length();
                            }
                            if (llIIIlllIIIlI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(lllIlIllIl[3]);
                                "".length();
                            }
                            int[] iArr = new int[lllIlIllIl[1]];
                            iArr[lllIlIllIl[0]] = lllIlIllIl[7];
                            if (llIIIllIllllI(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lllIlIllIl[1]];
                                iArr2[lllIlIllIl[0]] = lllIlIllIl[7];
                                if (llIIIllIlllll(Bank.getFirst(iArr2).getQuantity(), lllIlIllIl[8])) {
                                    ae();
                                    System.out.println(lllIlIllII[lllIlIllIl[9]]);
                                    bs = lllIlIllIl[1];
                                    return;
                                }
                            }
                            int[] iArr3 = new int[lllIlIllIl[1]];
                            iArr3[lllIlIllIl[0]] = lllIlIllIl[10];
                            if (llIIIllIllllI(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lllIlIllIl[1]];
                                iArr4[lllIlIllIl[0]] = lllIlIllIl[10];
                                if (llIIIllIlllll(Bank.getFirst(iArr4).getQuantity(), lllIlIllIl[11])) {
                                    ae();
                                    System.out.println(lllIlIllII[lllIlIllIl[12]]);
                                    bs = lllIlIllIl[1];
                                    return;
                                }
                            }
                            int[] iArr5 = new int[lllIlIllIl[1]];
                            iArr5[lllIlIllIl[0]] = lllIlIllIl[13];
                            if (llIIIllIllllI(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lllIlIllIl[1]];
                                iArr6[lllIlIllIl[0]] = lllIlIllIl[13];
                                if (llIIIllIlllll(Bank.getFirst(iArr6).getQuantity(), lllIlIllIl[11])) {
                                    ae();
                                    System.out.println(lllIlIllII[lllIlIllIl[14]]);
                                    bs = lllIlIllIl[1];
                                    return;
                                }
                            }
                            int[] iArr7 = new int[lllIlIllIl[1]];
                            iArr7[lllIlIllIl[0]] = lllIlIllIl[15];
                            if (llIIIllIllllI(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[lllIlIllIl[1]];
                                iArr8[lllIlIllIl[0]] = lllIlIllIl[15];
                                if (llIIIllIlllll(Bank.getFirst(iArr8).getQuantity(), lllIlIllIl[11])) {
                                    ae();
                                    System.out.println(lllIlIllII[lllIlIllIl[16]]);
                                    bs = lllIlIllIl[1];
                                    return;
                                }
                            }
                            int[] iArr9 = new int[lllIlIllIl[1]];
                            iArr9[lllIlIllIl[0]] = lllIlIllIl[17];
                            if (llIIIllIllllI(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[lllIlIllIl[1]];
                                iArr10[lllIlIllIl[0]] = lllIlIllIl[17];
                                if (llIIIllIlllll(Bank.getFirst(iArr10).getQuantity(), lllIlIllIl[9])) {
                                    ae();
                                    System.out.println(lllIlIllII[lllIlIllIl[18]]);
                                    bs = lllIlIllIl[1];
                                    return;
                                }
                            }
                            int[] iArr11 = new int[lllIlIllIl[19]];
                            iArr11[lllIlIllIl[0]] = lllIlIllIl[20];
                            iArr11[lllIlIllIl[1]] = lllIlIllIl[21];
                            iArr11[lllIlIllIl[3]] = lllIlIllIl[22];
                            iArr11[lllIlIllIl[4]] = lllIlIllIl[23];
                            iArr11[lllIlIllIl[6]] = lllIlIllIl[24];
                            iArr11[lllIlIllIl[9]] = lllIlIllIl[7];
                            iArr11[lllIlIllIl[12]] = lllIlIllIl[17];
                            iArr11[lllIlIllIl[14]] = lllIlIllIl[25];
                            iArr11[lllIlIllIl[16]] = lllIlIllIl[10];
                            iArr11[lllIlIllIl[18]] = lllIlIllIl[15];
                            iArr11[lllIlIllIl[8]] = lllIlIllIl[13];
                            if (llIIIlllIIIII(C0004e.b(iArr11) ? 1 : 0)) {
                                ae();
                                System.out.println(lllIlIllII[lllIlIllIl[8]]);
                                bs = lllIlIllIl[1];
                                return;
                            }
                            while (llIIIlllIIIII(C0019t.bl() ? 1 : 0)) {
                                C0019t.bj();
                                Time.sleepTicks(lllIlIllIl[1]);
                                "".length();
                                "".length();
                                if ((-"  ".length()) >= 0) {
                                    return;
                                }
                            }
                            if (llIIIlllIIIII(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                                Time.sleepTicks(lllIlIllIl[6]);
                                "".length();
                            }
                            int[] iArr12 = new int[lllIlIllIl[1]];
                            iArr12[lllIlIllIl[0]] = lllIlIllIl[22];
                            if (llIIIllIllllI(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lllIlIllIl[1]];
                                iArr13[lllIlIllIl[0]] = lllIlIllIl[22];
                                if (llIIIllIlllll(Inventory.getCount(iArr13), lllIlIllIl[1])) {
                                    Bank.withdraw(lllIlIllIl[22], lllIlIllIl[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lllIlIllIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr14 = new int[lllIlIllIl[1]];
                                        iArr14[lllIlIllIl[0]] = lllIlIllIl[22];
                                        if (llIIIlllIIIlI(Inventory.getCount(iArr14))) {
                                            ?? r0 = lllIlIllIl[1];
                                            "".length();
                                            return "  ".length() < 0 ? ((((55 + 91) - 12) + 20) ^ (((46 + 33) - 27) + 90)) & (((198 ^ 179) ^ (248 ^ 153)) ^ (-" ".length())) : r0;
                                        }
                                        return lllIlIllIl[0];
                                    }, lllIlIllIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr14 = new int[lllIlIllIl[1]];
                            iArr14[lllIlIllIl[0]] = lllIlIllIl[23];
                            if (llIIIllIllllI(Bank.contains(iArr14) ? 1 : 0)) {
                                int[] iArr15 = new int[lllIlIllIl[1]];
                                iArr15[lllIlIllIl[0]] = lllIlIllIl[23];
                                if (llIIIllIlllll(Inventory.getCount(iArr15), lllIlIllIl[1])) {
                                    Bank.withdraw(lllIlIllIl[23], lllIlIllIl[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lllIlIllIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr16 = new int[lllIlIllIl[1]];
                                        iArr16[lllIlIllIl[0]] = lllIlIllIl[23];
                                        if (llIIIlllIIIlI(Inventory.getCount(iArr16))) {
                                            ?? r0 = lllIlIllIl[1];
                                            "".length();
                                            return " ".length() >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lllIlIllIl[0];
                                    }, lllIlIllIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr16 = new int[lllIlIllIl[1]];
                            iArr16[lllIlIllIl[0]] = lllIlIllIl[21];
                            if (llIIIllIllllI(Bank.contains(iArr16) ? 1 : 0)) {
                                int[] iArr17 = new int[lllIlIllIl[1]];
                                iArr17[lllIlIllIl[0]] = lllIlIllIl[21];
                                if (llIIIllIlllll(Inventory.getCount(iArr17), lllIlIllIl[1])) {
                                    Bank.withdraw(lllIlIllIl[21], lllIlIllIl[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lllIlIllIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr18 = new int[lllIlIllIl[1]];
                                        iArr18[lllIlIllIl[0]] = lllIlIllIl[21];
                                        if (llIIIlllIIIlI(Inventory.getCount(iArr18))) {
                                            ?? r0 = lllIlIllIl[1];
                                            "".length();
                                            return (((((165 + 81) - 129) + 84) ^ (((67 + 119) - 88) + 54)) & (((33 ^ 118) ^ (34 ^ 36)) ^ (-" ".length()))) != 0 ? ((93 ^ 45) ^ (139 ^ 170)) & (((11 ^ 91) ^ " ".length()) ^ (-" ".length())) : r0;
                                        }
                                        return lllIlIllIl[0];
                                    }, lllIlIllIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr18 = new int[lllIlIllIl[1]];
                            iArr18[lllIlIllIl[0]] = lllIlIllIl[24];
                            if (llIIIllIllllI(Bank.contains(iArr18) ? 1 : 0)) {
                                int[] iArr19 = new int[lllIlIllIl[1]];
                                iArr19[lllIlIllIl[0]] = lllIlIllIl[24];
                                if (llIIIllIlllll(Inventory.getCount(iArr19), lllIlIllIl[1])) {
                                    Bank.withdraw(lllIlIllIl[24], lllIlIllIl[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lllIlIllIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr20 = new int[lllIlIllIl[1]];
                                        iArr20[lllIlIllIl[0]] = lllIlIllIl[24];
                                        if (llIIIlllIIIlI(Inventory.getCount(iArr20))) {
                                            ?? r0 = lllIlIllIl[1];
                                            "".length();
                                            return ((100 ^ 43) & ((66 ^ 13) ^ (-1))) < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lllIlIllIl[0];
                                    }, lllIlIllIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr20 = new int[lllIlIllIl[1]];
                            iArr20[lllIlIllIl[0]] = lllIlIllIl[7];
                            if (llIIIllIllllI(Bank.contains(iArr20) ? 1 : 0)) {
                                int[] iArr21 = new int[lllIlIllIl[1]];
                                iArr21[lllIlIllIl[0]] = lllIlIllIl[7];
                                if (llIIIllIlllll(Inventory.getCount(iArr21), lllIlIllIl[1])) {
                                    Bank.withdraw(lllIlIllIl[7], lllIlIllIl[9], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lllIlIllIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr22 = new int[lllIlIllIl[1]];
                                        iArr22[lllIlIllIl[0]] = lllIlIllIl[7];
                                        if (llIIIlllIIIlI(Inventory.getCount(iArr22))) {
                                            ?? r0 = lllIlIllIl[1];
                                            "".length();
                                            return "  ".length() != "  ".length() ? ((((27 + 59) - (-18)) + 96) ^ (((36 + 59) - (-55)) + 5)) & (((157 ^ 147) ^ (105 ^ 52)) ^ (-" ".length())) : r0;
                                        }
                                        return lllIlIllIl[0];
                                    }, lllIlIllIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr22 = new int[lllIlIllIl[1]];
                            iArr22[lllIlIllIl[0]] = lllIlIllIl[17];
                            if (llIIIllIllllI(Bank.contains(iArr22) ? 1 : 0)) {
                                int[] iArr23 = new int[lllIlIllIl[1]];
                                iArr23[lllIlIllIl[0]] = lllIlIllIl[17];
                                if (llIIIllIlllll(Inventory.getCount(iArr23), lllIlIllIl[1])) {
                                    Bank.withdraw(lllIlIllIl[17], lllIlIllIl[6], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lllIlIllIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr24 = new int[lllIlIllIl[1]];
                                        iArr24[lllIlIllIl[0]] = lllIlIllIl[17];
                                        if (llIIIlllIIIlI(Inventory.getCount(iArr24))) {
                                            ?? r0 = lllIlIllIl[1];
                                            "".length();
                                            return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lllIlIllIl[0];
                                    }, lllIlIllIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr24 = new int[lllIlIllIl[1]];
                            iArr24[lllIlIllIl[0]] = lllIlIllIl[10];
                            if (llIIIllIllllI(Bank.contains(iArr24) ? 1 : 0)) {
                                int[] iArr25 = new int[lllIlIllIl[1]];
                                iArr25[lllIlIllIl[0]] = lllIlIllIl[10];
                                if (llIIIllIlllll(Inventory.getCount(iArr25), lllIlIllIl[1])) {
                                    Bank.withdraw(lllIlIllIl[10], lllIlIllIl[26], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lllIlIllIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr26 = new int[lllIlIllIl[1]];
                                        iArr26[lllIlIllIl[0]] = lllIlIllIl[10];
                                        if (llIIIlllIIIlI(Inventory.getCount(iArr26))) {
                                            ?? r0 = lllIlIllIl[1];
                                            "".length();
                                            return ((249 ^ 150) ^ (8 ^ 99)) < 0 ? ((182 ^ 195) ^ (114 ^ 61)) & (((58 ^ 42) ^ (102 ^ 76)) ^ (-" ".length())) : r0;
                                        }
                                        return lllIlIllIl[0];
                                    }, lllIlIllIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr26 = new int[lllIlIllIl[1]];
                            iArr26[lllIlIllIl[0]] = lllIlIllIl[15];
                            if (llIIIllIllllI(Bank.contains(iArr26) ? 1 : 0)) {
                                int[] iArr27 = new int[lllIlIllIl[1]];
                                iArr27[lllIlIllIl[0]] = lllIlIllIl[15];
                                if (llIIIllIlllll(Inventory.getCount(iArr27), lllIlIllIl[1])) {
                                    Bank.withdraw(lllIlIllIl[15], lllIlIllIl[26], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lllIlIllIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr28 = new int[lllIlIllIl[1]];
                                        iArr28[lllIlIllIl[0]] = lllIlIllIl[15];
                                        if (llIIIlllIIIlI(Inventory.getCount(iArr28))) {
                                            ?? r0 = lllIlIllIl[1];
                                            "".length();
                                            return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lllIlIllIl[0];
                                    }, lllIlIllIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr28 = new int[lllIlIllIl[1]];
                            iArr28[lllIlIllIl[0]] = lllIlIllIl[13];
                            if (llIIIllIllllI(Bank.contains(iArr28) ? 1 : 0)) {
                                int[] iArr29 = new int[lllIlIllIl[1]];
                                iArr29[lllIlIllIl[0]] = lllIlIllIl[13];
                                if (llIIIllIlllll(Inventory.getCount(iArr29), lllIlIllIl[1])) {
                                    Bank.withdraw(lllIlIllIl[13], lllIlIllIl[26], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lllIlIllIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr30 = new int[lllIlIllIl[1]];
                                        iArr30[lllIlIllIl[0]] = lllIlIllIl[13];
                                        if (llIIIlllIIIlI(Inventory.getCount(iArr30))) {
                                            ?? r0 = lllIlIllIl[1];
                                            "".length();
                                            return (((38 ^ 11) ^ (156 ^ 191)) & (((127 ^ 114) ^ "   ".length()) ^ (-" ".length()))) != 0 ? ((166 ^ 131) ^ (111 ^ 87)) & (((((129 + 56) - 57) + 46) ^ (((132 + 64) - 20) + 3)) ^ (-" ".length())) : r0;
                                        }
                                        return lllIlIllIl[0];
                                    }, lllIlIllIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr30 = new int[lllIlIllIl[1]];
                            iArr30[lllIlIllIl[0]] = lllIlIllIl[27];
                            if (llIIIllIllllI(Bank.contains(iArr30) ? 1 : 0)) {
                                int[] iArr31 = new int[lllIlIllIl[1]];
                                iArr31[lllIlIllIl[0]] = lllIlIllIl[27];
                                if (llIIIlllIIIII(Inventory.contains(iArr31) ? 1 : 0)) {
                                    Bank.withdraw(lllIlIllIl[27], lllIlIllIl[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lllIlIllIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr32 = new int[lllIlIllIl[1]];
                                        iArr32[lllIlIllIl[0]] = lllIlIllIl[27];
                                        return Inventory.contains(iArr32);
                                    }, lllIlIllIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr32 = new int[lllIlIllIl[1]];
                            iArr32[lllIlIllIl[0]] = lllIlIllIl[25];
                            if (llIIIllIllllI(Bank.contains(iArr32) ? 1 : 0)) {
                                int[] iArr33 = new int[lllIlIllIl[1]];
                                iArr33[lllIlIllIl[0]] = lllIlIllIl[25];
                                if (llIIIllIlllll(Inventory.getCount(iArr33), lllIlIllIl[1])) {
                                    Bank.withdrawAll(lllIlIllIl[25], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lllIlIllIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr34 = new int[lllIlIllIl[1]];
                                        iArr34[lllIlIllIl[0]] = lllIlIllIl[25];
                                        if (llIIIlllIIIlI(Inventory.getCount(iArr34))) {
                                            ?? r0 = lllIlIllIl[1];
                                            "".length();
                                            return "  ".length() < " ".length() ? ((200 ^ 199) ^ (182 ^ 136)) & (((60 ^ 54) ^ (153 ^ 162)) ^ (-" ".length())) : r0;
                                        }
                                        return lllIlIllIl[0];
                                    }, lllIlIllIl[5]);
                                    "".length();
                                }
                            }
                        }
                    }
                }
                if (llIIIlllIIIll(Players.getLocal().getWorldLocation().distanceTo(hd), lllIlIllIl[6]) && llIIIlllIIlII(Players.getLocal().getWorldLocation().getPlane(), lllIlIllIl[3]) && llIIIllIllllI(bz() ? 1 : 0)) {
                    if (llIIIllIllllI(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        Time.sleepTicks(lllIlIllIl[6]);
                        "".length();
                    }
                    AccBuilderTempleTrek.c = lllIlIllII[lllIlIllIl[19]];
                    if (llIIIlllIIIII(Bank.isOpen() ? 1 : 0)) {
                        if (llIIIllIlllll(bS, lllIlIllIl[1])) {
                            C0004e.v();
                            bS += lllIlIllIl[1];
                        }
                        if (llIIIllIllllI(new WorldArea(lllIlIllIl[28], lllIlIllIl[29], lllIlIllIl[30], lllIlIllIl[31], lllIlIllIl[3]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr = new String[lllIlIllIl[1]];
                            strArr[lllIlIllIl[0]] = lllIlIllII[lllIlIllIl[32]];
                            TileObjects.getNearest(strArr).interact(lllIlIllII[lllIlIllIl[33]]);
                            Time.sleepTicks(C0004e.c(lllIlIllIl[12], lllIlIllIl[16]));
                            "".length();
                        }
                        Movement.walkTo(hd);
                        "".length();
                        Time.sleepTicks(lllIlIllIl[3]);
                        "".length();
                    }
                }
                if (llIIIlllIIlIl(Players.getLocal().getWorldLocation().distanceTo(hd), lllIlIllIl[12])) {
                    AccBuilderTempleTrek.c = lllIlIllII[lllIlIllIl[34]];
                    ck = lllIlIllIl[0];
                    C0006g.a(gc, eR);
                    if (llIIIllIllllI(C0006g.K() ? 1 : 0)) {
                        C0006g.a(eR);
                    }
                }
            }
            if (llIIIlllIIIlI(C0004e.j(lllIlIllIl[2])) && llIIIllIlllll(C0004e.j(lllIlIllIl[2]), lllIlIllIl[3])) {
                if (llIIIlllIIIII(bz() ? 1 : 0)) {
                    cc();
                }
                if (llIIIllIllllI(bz() ? 1 : 0)) {
                    if (llIIIlllIIIll(Players.getLocal().getWorldLocation().distanceTo(hd), lllIlIllIl[12])) {
                        AccBuilderTempleTrek.c = lllIlIllII[lllIlIllIl[31]];
                        if (llIIIllIllllI(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo(hd);
                        "".length();
                        Time.sleepTicks(lllIlIllIl[1]);
                        "".length();
                    }
                    if (llIIIlllIIlIl(Players.getLocal().getWorldLocation().distanceTo(hd), lllIlIllIl[12])) {
                        AccBuilderTempleTrek.c = lllIlIllII[lllIlIllIl[35]];
                        if (llIIIllIlllll(ck, lllIlIllIl[1])) {
                            ac.mU += lllIlIllIl[1];
                            ac.d(AccBuilderTempleTrek.m);
                            ck += lllIlIllIl[1];
                            ac.mU = lllIlIllIl[0];
                            cl = lllIlIllIl[0];
                        }
                        C0006g.a(gc, eR);
                        if (llIIIllIllllI(C0006g.K() ? 1 : 0)) {
                            C0006g.a(eR);
                        }
                    }
                }
            }
            System.out.println("Setting: " + C0004e.j(lllIlIllIl[2]));
            C0006g.a(new String[lllIlIllIl[0]]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v245, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v254, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v263, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v272, types: [boolean] */
    private static void cc() {
        BankLocation nearest = BankLocation.getNearest();
        if (llIIIlllIIIIl(nearest) && llIIIlllIIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIlIllII[lllIlIllIl[71]];
            C0000a.a(nearest);
        }
        if (llIIIlllIIIIl(nearest) && llIIIllIllllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llIIIlllIIIII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderTempleTrek.c = lllIlIllII[lllIlIllIl[72]];
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lllIlIllIl[5]);
                "".length();
            }
            if (llIIIllIllllI(Bank.isOpen() ? 1 : 0)) {
                AccBuilderTempleTrek.c = lllIlIllII[lllIlIllIl[73]];
                if (llIIIlllIIIlI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lllIlIllIl[4]);
                    "".length();
                }
                if (llIIIlllIIIlI(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(lllIlIllIl[3]);
                    "".length();
                }
                String[] strArr = new String[lllIlIllIl[1]];
                strArr[lllIlIllIl[0]] = lllIlIllII[lllIlIllIl[74]];
                if (llIIIllIllllI(Bank.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lllIlIllIl[1]];
                    strArr2[lllIlIllIl[0]] = lllIlIllII[lllIlIllIl[75]];
                    if (llIIIllIlllll(Bank.getFirst(strArr2).getQuantity(), lllIlIllIl[11])) {
                        ae();
                        System.out.println(lllIlIllII[lllIlIllIl[76]]);
                        bs = lllIlIllIl[1];
                        return;
                    }
                }
                String[] strArr3 = new String[lllIlIllIl[1]];
                strArr3[lllIlIllIl[0]] = lllIlIllII[lllIlIllIl[77]];
                if (llIIIllIllllI(Bank.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[lllIlIllIl[1]];
                    strArr4[lllIlIllIl[0]] = lllIlIllII[lllIlIllIl[78]];
                    if (llIIIllIlllll(Bank.getFirst(strArr4).getQuantity(), lllIlIllIl[11])) {
                        ae();
                        System.out.println(lllIlIllII[lllIlIllIl[79]]);
                        bs = lllIlIllIl[1];
                        return;
                    }
                }
                String[] strArr5 = new String[lllIlIllIl[1]];
                strArr5[lllIlIllIl[0]] = lllIlIllII[lllIlIllIl[80]];
                if (llIIIllIllllI(Bank.contains(strArr5) ? 1 : 0)) {
                    String[] strArr6 = new String[lllIlIllIl[1]];
                    strArr6[lllIlIllIl[0]] = lllIlIllII[lllIlIllIl[81]];
                    if (llIIIllIlllll(Bank.getFirst(strArr6).getQuantity(), lllIlIllIl[11])) {
                        ae();
                        System.out.println(lllIlIllII[lllIlIllIl[82]]);
                        bs = lllIlIllIl[1];
                        return;
                    }
                }
                int[] iArr = new int[lllIlIllIl[19]];
                iArr[lllIlIllIl[0]] = lllIlIllIl[20];
                iArr[lllIlIllIl[1]] = lllIlIllIl[21];
                iArr[lllIlIllIl[3]] = lllIlIllIl[22];
                iArr[lllIlIllIl[4]] = lllIlIllIl[23];
                iArr[lllIlIllIl[6]] = lllIlIllIl[24];
                iArr[lllIlIllIl[9]] = lllIlIllIl[7];
                iArr[lllIlIllIl[12]] = lllIlIllIl[17];
                iArr[lllIlIllIl[14]] = lllIlIllIl[25];
                iArr[lllIlIllIl[16]] = lllIlIllIl[10];
                iArr[lllIlIllIl[18]] = lllIlIllIl[15];
                iArr[lllIlIllIl[8]] = lllIlIllIl[13];
                if (llIIIlllIIIII(C0004e.b(iArr) ? 1 : 0)) {
                    ae();
                    System.out.println(lllIlIllII[lllIlIllIl[83]]);
                    bs = lllIlIllIl[1];
                    return;
                }
                while (llIIIlllIIIII(C0019t.bl() ? 1 : 0)) {
                    C0019t.bj();
                    Time.sleepTicks(lllIlIllIl[1]);
                    "".length();
                    "".length();
                    if ((-" ".length()) >= ((5 ^ 9) & ((80 ^ 92) ^ (-1)))) {
                        return;
                    }
                }
                if (llIIIlllIIIII(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepTicks(lllIlIllIl[6]);
                    "".length();
                }
                int[] iArr2 = new int[lllIlIllIl[1]];
                iArr2[lllIlIllIl[0]] = lllIlIllIl[22];
                if (llIIIllIllllI(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lllIlIllIl[1]];
                    iArr3[lllIlIllIl[0]] = lllIlIllIl[22];
                    if (llIIIllIlllll(Inventory.getCount(iArr3), lllIlIllIl[1])) {
                        Bank.withdraw(lllIlIllIl[22], lllIlIllIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIlIllIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr4 = new int[lllIlIllIl[1]];
                            iArr4[lllIlIllIl[0]] = lllIlIllIl[22];
                            if (llIIIlllIIIlI(Inventory.getCount(iArr4))) {
                                ?? r0 = lllIlIllIl[1];
                                "".length();
                                return ((84 ^ 107) & ((119 ^ 72) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIlIllIl[0];
                        }, lllIlIllIl[5]);
                        "".length();
                    }
                }
                int[] iArr4 = new int[lllIlIllIl[1]];
                iArr4[lllIlIllIl[0]] = lllIlIllIl[23];
                if (llIIIllIllllI(Bank.contains(iArr4) ? 1 : 0)) {
                    int[] iArr5 = new int[lllIlIllIl[1]];
                    iArr5[lllIlIllIl[0]] = lllIlIllIl[23];
                    if (llIIIllIlllll(Inventory.getCount(iArr5), lllIlIllIl[1])) {
                        Bank.withdraw(lllIlIllIl[23], lllIlIllIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIlIllIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr6 = new int[lllIlIllIl[1]];
                            iArr6[lllIlIllIl[0]] = lllIlIllIl[23];
                            if (llIIIlllIIIlI(Inventory.getCount(iArr6))) {
                                ?? r0 = lllIlIllIl[1];
                                "".length();
                                return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIlIllIl[0];
                        }, lllIlIllIl[5]);
                        "".length();
                    }
                }
                int[] iArr6 = new int[lllIlIllIl[1]];
                iArr6[lllIlIllIl[0]] = lllIlIllIl[21];
                if (llIIIllIllllI(Bank.contains(iArr6) ? 1 : 0)) {
                    int[] iArr7 = new int[lllIlIllIl[1]];
                    iArr7[lllIlIllIl[0]] = lllIlIllIl[21];
                    if (llIIIllIlllll(Inventory.getCount(iArr7), lllIlIllIl[1])) {
                        Bank.withdraw(lllIlIllIl[21], lllIlIllIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIlIllIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr8 = new int[lllIlIllIl[1]];
                            iArr8[lllIlIllIl[0]] = lllIlIllIl[21];
                            if (llIIIlllIIIlI(Inventory.getCount(iArr8))) {
                                ?? r0 = lllIlIllIl[1];
                                "".length();
                                return (-" ".length()) > (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIlIllIl[0];
                        }, lllIlIllIl[5]);
                        "".length();
                    }
                }
                int[] iArr8 = new int[lllIlIllIl[1]];
                iArr8[lllIlIllIl[0]] = lllIlIllIl[24];
                if (llIIIllIllllI(Bank.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[lllIlIllIl[1]];
                    iArr9[lllIlIllIl[0]] = lllIlIllIl[24];
                    if (llIIIllIlllll(Inventory.getCount(iArr9), lllIlIllIl[1])) {
                        Bank.withdraw(lllIlIllIl[24], lllIlIllIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIlIllIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr10 = new int[lllIlIllIl[1]];
                            iArr10[lllIlIllIl[0]] = lllIlIllIl[24];
                            if (llIIIlllIIIlI(Inventory.getCount(iArr10))) {
                                ?? r0 = lllIlIllIl[1];
                                "".length();
                                return ("   ".length() & ("   ".length() ^ (-1))) == (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIlIllIl[0];
                        }, lllIlIllIl[5]);
                        "".length();
                    }
                }
                int[] iArr10 = new int[lllIlIllIl[1]];
                iArr10[lllIlIllIl[0]] = lllIlIllIl[7];
                if (llIIIllIllllI(Bank.contains(iArr10) ? 1 : 0)) {
                    int[] iArr11 = new int[lllIlIllIl[1]];
                    iArr11[lllIlIllIl[0]] = lllIlIllIl[7];
                    if (llIIIllIlllll(Inventory.getCount(iArr11), lllIlIllIl[1])) {
                        Bank.withdraw(lllIlIllIl[7], lllIlIllIl[9], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIlIllIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr12 = new int[lllIlIllIl[1]];
                            iArr12[lllIlIllIl[0]] = lllIlIllIl[7];
                            if (llIIIlllIIIlI(Inventory.getCount(iArr12))) {
                                ?? r0 = lllIlIllIl[1];
                                "".length();
                                return (91 ^ 95) == " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIlIllIl[0];
                        }, lllIlIllIl[5]);
                        "".length();
                    }
                }
                int[] iArr12 = new int[lllIlIllIl[1]];
                iArr12[lllIlIllIl[0]] = lllIlIllIl[17];
                if (llIIIllIllllI(Bank.contains(iArr12) ? 1 : 0)) {
                    int[] iArr13 = new int[lllIlIllIl[1]];
                    iArr13[lllIlIllIl[0]] = lllIlIllIl[17];
                    if (llIIIllIlllll(Inventory.getCount(iArr13), lllIlIllIl[1])) {
                        Bank.withdraw(lllIlIllIl[17], lllIlIllIl[6], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIlIllIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr14 = new int[lllIlIllIl[1]];
                            iArr14[lllIlIllIl[0]] = lllIlIllIl[17];
                            if (llIIIlllIIIlI(Inventory.getCount(iArr14))) {
                                ?? r0 = lllIlIllIl[1];
                                "".length();
                                return "  ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIlIllIl[0];
                        }, lllIlIllIl[5]);
                        "".length();
                    }
                }
                int[] iArr14 = new int[lllIlIllIl[1]];
                iArr14[lllIlIllIl[0]] = lllIlIllIl[10];
                if (llIIIllIllllI(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lllIlIllIl[1]];
                    iArr15[lllIlIllIl[0]] = lllIlIllIl[10];
                    if (llIIIllIlllll(Inventory.getCount(iArr15), lllIlIllIl[1])) {
                        Bank.withdraw(lllIlIllIl[10], lllIlIllIl[26], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIlIllIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr16 = new int[lllIlIllIl[1]];
                            iArr16[lllIlIllIl[0]] = lllIlIllIl[10];
                            if (llIIIlllIIIlI(Inventory.getCount(iArr16))) {
                                ?? r0 = lllIlIllIl[1];
                                "".length();
                                return (130 ^ 134) == "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIlIllIl[0];
                        }, lllIlIllIl[5]);
                        "".length();
                    }
                }
                int[] iArr16 = new int[lllIlIllIl[1]];
                iArr16[lllIlIllIl[0]] = lllIlIllIl[15];
                if (llIIIllIllllI(Bank.contains(iArr16) ? 1 : 0)) {
                    int[] iArr17 = new int[lllIlIllIl[1]];
                    iArr17[lllIlIllIl[0]] = lllIlIllIl[15];
                    if (llIIIllIlllll(Inventory.getCount(iArr17), lllIlIllIl[1])) {
                        Bank.withdraw(lllIlIllIl[15], lllIlIllIl[26], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIlIllIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr18 = new int[lllIlIllIl[1]];
                            iArr18[lllIlIllIl[0]] = lllIlIllIl[15];
                            if (llIIIlllIIIlI(Inventory.getCount(iArr18))) {
                                ?? r0 = lllIlIllIl[1];
                                "".length();
                                return ((137 ^ 177) & ((251 ^ 195) ^ (-1))) > (189 ^ 185) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIlIllIl[0];
                        }, lllIlIllIl[5]);
                        "".length();
                    }
                }
                int[] iArr18 = new int[lllIlIllIl[1]];
                iArr18[lllIlIllIl[0]] = lllIlIllIl[13];
                if (llIIIllIllllI(Bank.contains(iArr18) ? 1 : 0)) {
                    int[] iArr19 = new int[lllIlIllIl[1]];
                    iArr19[lllIlIllIl[0]] = lllIlIllIl[13];
                    if (llIIIllIlllll(Inventory.getCount(iArr19), lllIlIllIl[1])) {
                        Bank.withdraw(lllIlIllIl[13], lllIlIllIl[26], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIlIllIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr20 = new int[lllIlIllIl[1]];
                            iArr20[lllIlIllIl[0]] = lllIlIllIl[13];
                            if (llIIIlllIIIlI(Inventory.getCount(iArr20))) {
                                ?? r0 = lllIlIllIl[1];
                                "".length();
                                return "  ".length() <= " ".length() ? ((((155 + 153) - 224) + 170) ^ (((107 + 66) - 64) + 79)) & (((214 ^ 196) ^ (120 ^ 40)) ^ (-" ".length())) : r0;
                            }
                            return lllIlIllIl[0];
                        }, lllIlIllIl[5]);
                        "".length();
                    }
                }
                int[] iArr20 = new int[lllIlIllIl[1]];
                iArr20[lllIlIllIl[0]] = lllIlIllIl[27];
                if (llIIIllIllllI(Bank.contains(iArr20) ? 1 : 0)) {
                    int[] iArr21 = new int[lllIlIllIl[1]];
                    iArr21[lllIlIllIl[0]] = lllIlIllIl[27];
                    if (llIIIlllIIIII(Inventory.contains(iArr21) ? 1 : 0)) {
                        Bank.withdraw(lllIlIllIl[27], lllIlIllIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIlIllIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr22 = new int[lllIlIllIl[1]];
                            iArr22[lllIlIllIl[0]] = lllIlIllIl[27];
                            return Inventory.contains(iArr22);
                        }, lllIlIllIl[5]);
                        "".length();
                    }
                }
                int[] iArr22 = new int[lllIlIllIl[1]];
                iArr22[lllIlIllIl[0]] = lllIlIllIl[25];
                if (llIIIllIllllI(Bank.contains(iArr22) ? 1 : 0)) {
                    int[] iArr23 = new int[lllIlIllIl[1]];
                    iArr23[lllIlIllIl[0]] = lllIlIllIl[25];
                    if (llIIIllIlllll(Inventory.getCount(iArr23), lllIlIllIl[1])) {
                        Bank.withdrawAll(lllIlIllIl[25], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIlIllIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr24 = new int[lllIlIllIl[1]];
                            iArr24[lllIlIllIl[0]] = lllIlIllIl[25];
                            if (llIIIlllIIIlI(Inventory.getCount(iArr24))) {
                                ?? r0 = lllIlIllIl[1];
                                "".length();
                                return (-"  ".length()) > 0 ? ((161 ^ 137) ^ (253 ^ 157)) & (((2 ^ 113) ^ (70 ^ 125)) ^ (-" ".length())) : r0;
                            }
                            return lllIlIllIl[0];
                        }, lllIlIllIl[5]);
                        "".length();
                    }
                }
            }
        }
    }

    private static String llIIIllIllIll(String lllllllllllllllllIllIlIlIlllIIll, String lllllllllllllllllIllIlIlIlllIIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllIllIlIlIlllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllllIllIlIlIlllIIII = lllllllllllllllllIllIlIlIlllIIlI.toCharArray();
        int lllllllllllllllllIllIlIlIllIllll = lllIlIllIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIlIllIl[0];
        while (llIIIllIlllll(i, length)) {
            char lllllllllllllllllIllIlIlIlllIlII = charArray[i];
            sb.append((char) (lllllllllllllllllIllIlIlIlllIlII ^ lllllllllllllllllIllIlIlIlllIIII[lllllllllllllllllIllIlIlIllIllll % lllllllllllllllllIllIlIlIlllIIII.length]));
            "".length();
            lllllllllllllllllIllIlIlIllIllll++;
            i++;
            "".length();
            if (((" ".length() ^ (148 ^ 132)) & (((88 ^ 98) ^ (151 ^ 188)) ^ (-" ".length()))) != (((((209 + 234) - 315) + 115) ^ (((127 + 28) - 127) + 157)) & (((193 ^ 143) ^ (55 ^ 51)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String llIIIllIllIIl(String lllllllllllllllllIllIlIlIlIllllI, String lllllllllllllllllIllIlIlIlIlllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIlIlIlIlllIl.getBytes(StandardCharsets.UTF_8)), lllIlIllIl[16]), "DES");
            Cipher lllllllllllllllllIllIlIlIllIIIII = Cipher.getInstance("DES");
            lllllllllllllllllIllIlIlIllIIIII.init(lllIlIllIl[3], secretKeySpec);
            return new String(lllllllllllllllllIllIlIlIllIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIlIlIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllIlIlIlIlllll) {
            lllllllllllllllllIllIlIlIlIlllll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlllIIIII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean bz() {
        String[] strArr = new String[lllIlIllIl[1]];
        strArr[lllIlIllIl[0]] = lllIlIllII[lllIlIllIl[67]];
        if (llIIIllIllllI(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[lllIlIllIl[1]];
            strArr2[lllIlIllIl[0]] = lllIlIllII[lllIlIllIl[68]];
            if (llIIIllIllllI(Inventory.contains(strArr2) ? 1 : 0)) {
                String[] strArr3 = new String[lllIlIllIl[1]];
                strArr3[lllIlIllIl[0]] = lllIlIllII[lllIlIllIl[45]];
                if (llIIIllIllllI(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[lllIlIllIl[1]];
                    strArr4[lllIlIllIl[0]] = lllIlIllII[lllIlIllIl[69]];
                    if (llIIIllIllllI(Inventory.contains(strArr4) ? 1 : 0)) {
                        int[] iArr = new int[lllIlIllIl[1]];
                        iArr[lllIlIllIl[0]] = lllIlIllIl[10];
                        if (llIIIllIllllI(Inventory.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lllIlIllIl[1]];
                            iArr2[lllIlIllIl[0]] = lllIlIllIl[15];
                            if (llIIIllIllllI(Inventory.contains(iArr2) ? 1 : 0)) {
                                int[] iArr3 = new int[lllIlIllIl[1]];
                                iArr3[lllIlIllIl[0]] = lllIlIllIl[13];
                                if (llIIIllIllllI(Inventory.contains(iArr3) ? 1 : 0)) {
                                    int[] iArr4 = new int[lllIlIllIl[1]];
                                    iArr4[lllIlIllIl[0]] = lllIlIllIl[7];
                                    if (llIIIllIllllI(Inventory.contains(iArr4) ? 1 : 0)) {
                                        int[] iArr5 = new int[lllIlIllIl[1]];
                                        iArr5[lllIlIllIl[0]] = lllIlIllIl[25];
                                        if (llIIIllIllllI(Inventory.contains(iArr5) ? 1 : 0)) {
                                            String[] strArr5 = new String[lllIlIllIl[1]];
                                            strArr5[lllIlIllIl[0]] = lllIlIllII[lllIlIllIl[70]];
                                            if (llIIIllIllllI(Inventory.contains(strArr5) ? 1 : 0)) {
                                                ?? r0 = lllIlIllIl[1];
                                                "".length();
                                                return (37 ^ 33) <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return lllIlIllIl[0];
    }

    private static void llIIIllIlllII() {
        lllIlIllII = new String[lllIlIllIl[96]];
        lllIlIllII[lllIlIllIl[0]] = llIIIllIllIIl("EJNDJFj765c0OWFclXcKNw==", "aDtvc");
        lllIlIllII[lllIlIllIl[1]] = llIIIllIllIlI("6B2/+xZKTZ9pBKLhQLaVyoAIvD0FG0G42/JWZHf+fsC0wQnlXc31GFTeqUuYXeOFevssHsOMxBs=", "dLRQr");
        lllIlIllII[lllIlIllIl[3]] = llIIIllIllIlI("hcUboEPyg6SPntv4nWi9sIT4sqlGfXMZ", "QYLJT");
        lllIlIllII[lllIlIllIl[4]] = llIIIllIllIlI("IsrGrhkxBbrxwgtjxnctjA==", "aLDSC");
        lllIlIllII[lllIlIllIl[6]] = llIIIllIllIIl("ZcQ2nPb48t0ANgs6Gp20Cm6vIi9iNvM9", "DRPpJ");
        lllIlIllII[lllIlIllIl[9]] = llIIIllIllIlI("653Jz0J7uuUgsCQrIN49Wk1gVi8LeDliD+quOE0KKfeCLsfc9RHypQB77QWXha/w", "zWQjX");
        lllIlIllII[lllIlIllIl[12]] = llIIIllIllIll("ECpvKTsibyIhOjQmIS9pNDo/OCUuKjxkaTQ4JjwqLyYhL2kzIG8KHB4GAQ8=", "GOOHI");
        lllIlIllII[lllIlIllIl[14]] = llIIIllIllIll("AhNKIjowVgcqOyYfBCRoJgMaMyQ8ExlvaCYBAzcrPR8EJGghGUoBHQw/JAQ=", "UvjCH");
        lllIlIllII[lllIlIllIl[16]] = llIIIllIllIlI("kvFNdPl4cIhTQUmUJZHqYID+4fYRmLJ9XgS8zW/27Ffp23k9rmP5mWmditT8U4Co", "pTWiI");
        lllIlIllII[lllIlIllIl[18]] = llIIIllIllIlI("Rc3CnrvgSISpgtisCChvM6SKt9zvSaohjmSNLUrsI5SV5Ie6zs2ar43ptWAdVPyA", "KDxAr");
        lllIlIllII[lllIlIllIl[8]] = llIIIllIllIlI("EltQlfMubEcoMC/4ZdmDC6sxVQ2KetEVbkxsBY6xoJkZWOwpR2XAV1deVti79fax", "tpdpW");
        lllIlIllII[lllIlIllIl[19]] = llIIIllIllIIl("zfwiHNJY9CXSiFxhMoDsKCvqn6cgZ3in", "WHekL");
        lllIlIllII[lllIlIllIl[32]] = llIIIllIllIll("KzgjPi1GCSslOgc1", "fYDWN");
        lllIlIllII[lllIlIllIl[33]] = llIIIllIllIll("FCYhHBY=", "QHUyd");
        lllIlIllII[lllIlIllIl[34]] = llIIIllIllIll("MgsWDT4TBB9JIw8PCx0=", "zjxiR");
        lllIlIllII[lllIlIllIl[31]] = llIIIllIllIlI("GCXQ+wDHBET5ImQXpxZE6w==", "apjWG");
        lllIlIllII[lllIlIllIl[35]] = llIIIllIllIll("LwQtETUBBC0fZhgYJgsy", "imCxF");
        lllIlIllII[lllIlIllIl[36]] = llIIIllIllIll("Ej4iCzg0ejQHMnM4IwMycy4pQjQmI2YOPyAu", "SZFbV");
        lllIlIllII[lllIlIllIl[38]] = llIIIllIllIIl("ArI1B7rPxCSoLX8PRwfaNC83pCit12QXZBpQYcvBmhk=", "pvqQA");
        lllIlIllII[lllIlIllIl[40]] = llIIIllIllIlI("XN+MQ7A1cfhVVPFh7h4iYkOBplw/xNbRoxcOc/UTLEk=", "UbDOl");
        lllIlIllII[lllIlIllIl[30]] = llIIIllIllIIl("n/lshGib4NnLqzEWSTr0JSelFj83+iXCUfH3ro3suRg=", "gDNCG");
        lllIlIllII[lllIlIllIl[41]] = llIIIllIllIll("FTIdGwczdhUdCyciHABJIDlZEBwtdhUbGiA=", "TVyri");
        lllIlIllII[lllIlIllIl[44]] = llIIIllIllIll("BiENDDQgZQUKODQxDBd6MypJBy8+ZQUMKTM=", "GEieZ");
        lllIlIllII[lllIlIllIl[46]] = llIIIllIllIIl("r2JK5RyS1Jb9F563EjYX2YQdpHo9qWKZB4znM6+xHjQ=", "cPBnC");
        lllIlIllII[lllIlIllIl[48]] = llIIIllIllIll("LA0+Bx0KSTkGFggaP04HAkk4GwpNBTMdBw==", "miZns");
        lllIlIllII[lllIlIllIl[49]] = llIIIllIllIIl("MXts9YKHXJ/mnk4vauP1WSUhk/EejmX5o3g10BlzwII=", "XBaFE");
        lllIlIllII[lllIlIllIl[52]] = llIIIllIllIlI("xUgqKFVVDc98bo8MNl0DB75mS94rY9PWv4TYw6fnudY=", "DrLRg");
        lllIlIllII[lllIlIllIl[54]] = llIIIllIllIll("AiwWCwokaBQDCC8xUhYFITtSFgtjKgcbRC8hARY=", "CHrbd");
        lllIlIllII[lllIlIllIl[55]] = llIIIllIllIIl("+ma2uMmPDQ2WTh3mdH4gCtO0xQFzdJRrPu1/0ijwYGY=", "eTRnC");
        lllIlIllII[lllIlIllIl[56]] = llIIIllIllIlI("3ijZUqk9Hw1GD+G1QcOIUATquyJGo/AUJMPibV0RgDM=", "hDQnf");
        lllIlIllII[lllIlIllIl[57]] = llIIIllIllIlI("rOV9RWh7I30UOr4vfgx2HyxNtPtg6HLOQKWJOMtmQH4=", "QCjnm");
        lllIlIllII[lllIlIllIl[60]] = llIIIllIllIll("MRAUEy8XVBETM1AGBRQkA1QEFWESAQlaLRkHBA==", "ptpzA");
        lllIlIllII[lllIlIllIl[61]] = llIIIllIllIll("Ci8gJCwsazMsNi45ZD83JS43bTYkayY4O2snLT42", "KKDMB");
        lllIlIllII[lllIlIllIl[62]] = llIIIllIllIll("LywCGT0JaAMRIRogRgImAC0VUCcBaAQFKk4kDwMn", "nHfpS");
        lllIlIllII[lllIlIllIl[63]] = llIIIllIllIll("EicNICE0YwggPXMxHCcqIGMdJm8xNhBpIzowHQ==", "SCiIO");
        lllIlIllII[lllIlIllIl[64]] = llIIIllIllIll("FSUOHgQzYR0WHjEzSgUfOiQZVx47YQgCE3QtAwQe", "TAjwj");
        lllIlIllII[lllIlIllIl[65]] = llIIIllIllIIl("9Eif06bRS7YvmXH+8P/50yP7hdnn7i8F46lsXk2uH54=", "MfvsK");
        lllIlIllII[lllIlIllIl[66]] = llIIIllIllIll("BAggIxsiTCkjGyFMNj8bIB9kPhplDjEzVSkFNz4=", "ElDJu");
        lllIlIllII[lllIlIllIl[67]] = llIIIllIllIIl("hA32CQHVjTKqYAwzcuFxkA==", "YBmGl");
        lllIlIllII[lllIlIllIl[68]] = llIIIllIllIll("IwMmORwNRigwEh4=", "zfJUs");
        lllIlIllII[lllIlIllIl[45]] = llIIIllIllIIl("Yqyun1sXdFguqdoh2AQJug==", "iwLmX");
        lllIlIllII[lllIlIllIl[69]] = llIIIllIllIll("BAAuByZzCiISJw==", "ShGsC");
        lllIlIllII[lllIlIllIl[70]] = llIIIllIllIIl("2Qg05xG7z2k=", "zywAy");
        lllIlIllII[lllIlIllIl[71]] = llIIIllIllIll("NikQKygZPA8sKFg8CWItGSYN", "xHfBO");
        lllIlIllII[lllIlIllIl[72]] = llIIIllIllIIl("8Vr9Z1xE2AJXDnFZ3dQwkA==", "jTlVe");
        lllIlIllII[lllIlIllIl[73]] = llIIIllIllIll("Ly4nFyQOIS5TKgYhIhomAA==", "gOIsH");
        lllIlIllII[lllIlIllIl[74]] = llIIIllIllIlI("Js/rZPyr31MZHeqklmf2iQ==", "yZAEy");
        lllIlIllII[lllIlIllIl[75]] = llIIIllIllIIl("8GF2TYjT5S++8/WFUkEWTQ==", "FcSRF");
        lllIlIllII[lllIlIllIl[76]] = llIIIllIllIlI("w1dJtuMbF1NlNuqEHrtqwk8rAwHha+WukSP5ZTFgvX/cIyLK8TEf/5SxROk7jfDS", "AAItZ");
        lllIlIllII[lllIlIllIl[77]] = llIIIllIllIll("HyAREgF6MxYIDA==", "ZAcfi");
        lllIlIllII[lllIlIllIl[78]] = llIIIllIllIlI("30wbBGck0iCUZSF/t1COUQ==", "YGsDm");
        lllIlIllII[lllIlIllIl[79]] = llIIIllIllIIl("ur0uCzZKVEhhb3eUt+2f54QdXuYfTbJADMSXlP00FdOZVQG0qZwKRKB2ia8N/UmQ", "BJDJa");
        lllIlIllII[lllIlIllIl[80]] = llIIIllIllIlI("/v1e4m8YCcA/u4i8f100MA==", "yStzi");
        lllIlIllII[lllIlIllIl[81]] = llIIIllIllIll("LSItHBRaMSwXAw==", "zCYyf");
        lllIlIllII[lllIlIllIl[82]] = llIIIllIllIIl("VcyRIYo7QaHH4/i1u1IbyDp5UhgUobVNacNHvx5FKgoVYZMmQi0TXe8CWuQcq0pk", "sCChA");
        lllIlIllII[lllIlIllIl[83]] = llIIIllIllIlI("+RscIz7z9Px+Q3YklM85fQcNdY+xKh4qh+ujWJIL5gSgVh2/X/H7uxX6+25U77vd", "oEDNV");
        lllIlIllII[lllIlIllIl[84]] = llIIIllIllIlI("ZmVRT40Ug/cqtMxovHZ5QCxPCDPkPblk", "QleUg");
        lllIlIllII[lllIlIllIl[85]] = llIIIllIllIll("FiABI3kLL08zPAUlGyx5TA==", "dIoDY");
        lllIlIllII[lllIlIllIl[89]] = llIIIllIllIll("Ah8QIxYxVicrHjIZDQ==", "UvjBd");
        lllIlIllII[lllIlIllIl[90]] = llIIIllIllIlI("2KgfPKqnPMDOhOBjcudgHwNorNttOEKJ", "Jlgwh");
        lllIlIllII[lllIlIllIl[91]] = llIIIllIllIIl("RgyJ5ixJshSxf+QJlodweg==", "VdBse");
        lllIlIllII[lllIlIllIl[92]] = llIIIllIllIIl("UwIH007WZbw6+KeF+cy2ejp26Xw2+g/MJFp1v80vspH7Ld9ioPbum0QSBqDLAMZE", "SPLoL");
        lllIlIllII[lllIlIllIl[93]] = llIIIllIllIlI("Q9zoOjTTtLA=", "dFBaU");
        lllIlIllII[lllIlIllIl[94]] = llIIIllIllIlI("XyCymxWf8kv6oXgMdMbCl6AcIfOgEMVj", "eXHlG");
        lllIlIllII[lllIlIllIl[95]] = llIIIllIllIll("Bh1oTBxuGihMJiwTZBs9KAJkJXUqFypMMSZY", "IvDlU");
    }

    private static String llIIIllIllIlI(String lllllllllllllllllIllIlIlIlIlIIIl, String lllllllllllllllllIllIlIlIlIlIIII) {
        try {
            SecretKeySpec lllllllllllllllllIllIlIlIlIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIlIlIlIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIllIlIlIlIlIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllllIllIlIlIlIlIIll.init(lllIlIllIl[3], lllllllllllllllllIllIlIlIlIlIlII);
            return new String(lllllllllllllllllIllIlIlIlIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIlIlIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllIlIlIlIlIIlI) {
            lllllllllllllllllIllIlIlIlIlIIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x02d9, code lost:
        if (llIIIllIlllll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.G.lllIlIllIl[9]) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x03bb, code lost:
        if (llIIIllIlllll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.G.lllIlIllIl[30]) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x04aa, code lost:
        if (llIIIllIlllll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.G.lllIlIllIl[30]) != false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void ae() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        int[] iArr9;
        int[] iArr10;
        int[] iArr11;
        int[] iArr12;
        int[] iArr13 = new int[lllIlIllIl[1]];
        iArr13[lllIlIllIl[0]] = lllIlIllIl[21];
        if (llIIIlllIIIII(Bank.contains(iArr13) ? 1 : 0)) {
            System.out.println(lllIlIllII[lllIlIllIl[36]]);
            bu.add(new C0003d(lllIlIllIl[21], lllIlIllIl[1], lllIlIllIl[37]));
            "".length();
        }
        int[] iArr14 = new int[lllIlIllIl[1]];
        iArr14[lllIlIllIl[0]] = lllIlIllIl[22];
        if (llIIIlllIIIII(Bank.contains(iArr14) ? 1 : 0)) {
            System.out.println(lllIlIllII[lllIlIllIl[38]]);
            bu.add(new C0003d(lllIlIllIl[22], lllIlIllIl[1], lllIlIllIl[39]));
            "".length();
        }
        int[] iArr15 = new int[lllIlIllIl[1]];
        iArr15[lllIlIllIl[0]] = lllIlIllIl[23];
        if (llIIIlllIIIII(Bank.contains(iArr15) ? 1 : 0)) {
            System.out.println(lllIlIllII[lllIlIllIl[40]]);
            bu.add(new C0003d(lllIlIllIl[23], lllIlIllIl[1], lllIlIllIl[39]));
            "".length();
        }
        int[] iArr16 = new int[lllIlIllIl[1]];
        iArr16[lllIlIllIl[0]] = lllIlIllIl[24];
        if (llIIIlllIIIII(Bank.contains(iArr16) ? 1 : 0)) {
            System.out.println(lllIlIllII[lllIlIllIl[30]]);
            bu.add(new C0003d(lllIlIllIl[24], lllIlIllIl[1], lllIlIllIl[39]));
            "".length();
        }
        int[] iArr17 = new int[lllIlIllIl[1]];
        iArr17[lllIlIllIl[0]] = lllIlIllIl[25];
        if (llIIIlllIIIII(Bank.contains(iArr17) ? 1 : 0)) {
            System.out.println(lllIlIllII[lllIlIllIl[41]]);
            bu.add(new C0003d(lllIlIllIl[25], lllIlIllIl[42], lllIlIllIl[43]));
            "".length();
        }
        int[] iArr18 = new int[lllIlIllIl[1]];
        iArr18[lllIlIllIl[0]] = lllIlIllIl[25];
        if (llIIIllIllllI(Bank.contains(iArr18) ? 1 : 0)) {
            int[] iArr19 = new int[lllIlIllIl[1]];
            iArr19[lllIlIllIl[0]] = lllIlIllIl[25];
            if (llIIIllIlllll(Bank.getFirst(iArr19).getQuantity(), lllIlIllIl[30])) {
                System.out.println(lllIlIllII[lllIlIllIl[44]]);
                bu.add(new C0003d(lllIlIllIl[25], lllIlIllIl[45], lllIlIllIl[43]));
                "".length();
            }
        }
        int[] iArr20 = new int[lllIlIllIl[1]];
        iArr20[lllIlIllIl[0]] = lllIlIllIl[17];
        if (llIIIlllIIIII(Bank.contains(iArr20) ? 1 : 0)) {
            System.out.println(lllIlIllII[lllIlIllIl[46]]);
            bu.add(new C0003d(lllIlIllIl[17], lllIlIllIl[9], lllIlIllIl[47]));
            "".length();
        }
        int[] iArr21 = new int[lllIlIllIl[1]];
        iArr21[lllIlIllIl[0]] = lllIlIllIl[17];
        if (llIIIllIllllI(Bank.contains(iArr21) ? 1 : 0)) {
            int[] iArr22 = new int[lllIlIllIl[1]];
            iArr22[lllIlIllIl[0]] = lllIlIllIl[17];
            if (llIIIllIllllI(Bank.contains(iArr22) ? 1 : 0)) {
                int[] iArr23 = new int[lllIlIllIl[1]];
                iArr23[lllIlIllIl[0]] = lllIlIllIl[17];
            }
            if (llIIIlllIIIII(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lllIlIllII[lllIlIllIl[85]]);
            }) ? 1 : 0)) {
                System.out.println(lllIlIllII[lllIlIllIl[49]]);
                bu.add(new C0003d(lllIlIllIl[50], lllIlIllIl[38], lllIlIllIl[51]));
                "".length();
            }
            iArr = new int[lllIlIllIl[1]];
            iArr[lllIlIllIl[0]] = lllIlIllIl[20];
            if (llIIIllIllllI(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr24 = new int[lllIlIllIl[1]];
                iArr24[lllIlIllIl[0]] = lllIlIllIl[20];
                if (llIIIllIllllI(Bank.contains(iArr24) ? 1 : 0)) {
                    int[] iArr25 = new int[lllIlIllIl[1]];
                    iArr25[lllIlIllIl[0]] = lllIlIllIl[20];
                }
                iArr2 = new int[lllIlIllIl[1]];
                iArr2[lllIlIllIl[0]] = lllIlIllIl[7];
                if (llIIIlllIIIII(Bank.contains(iArr2) ? 1 : 0)) {
                    System.out.println(lllIlIllII[lllIlIllIl[54]]);
                    bu.add(new C0003d(lllIlIllIl[7], lllIlIllIl[30], lllIlIllIl[53]));
                    "".length();
                }
                iArr3 = new int[lllIlIllIl[1]];
                iArr3[lllIlIllIl[0]] = lllIlIllIl[7];
                if (llIIIllIllllI(Bank.contains(iArr3) ? 1 : 0)) {
                    int[] iArr26 = new int[lllIlIllIl[1]];
                    iArr26[lllIlIllIl[0]] = lllIlIllIl[7];
                    if (llIIIllIllllI(Bank.contains(iArr26) ? 1 : 0)) {
                        int[] iArr27 = new int[lllIlIllIl[1]];
                        iArr27[lllIlIllIl[0]] = lllIlIllIl[7];
                    }
                    iArr4 = new int[lllIlIllIl[1]];
                    iArr4[lllIlIllIl[0]] = lllIlIllIl[27];
                    if (llIIIlllIIIII(Bank.contains(iArr4) ? 1 : 0)) {
                        System.out.println(lllIlIllII[lllIlIllIl[56]]);
                        bu.add(new C0003d(lllIlIllIl[27], lllIlIllIl[9], C0008i.bp));
                        "".length();
                    }
                    iArr5 = new int[lllIlIllIl[1]];
                    iArr5[lllIlIllIl[0]] = lllIlIllIl[10];
                    if (llIIIllIllllI(Bank.contains(iArr5) ? 1 : 0)) {
                        int[] iArr28 = new int[lllIlIllIl[1]];
                        iArr28[lllIlIllIl[0]] = lllIlIllIl[10];
                        if (llIIIllIlllll(Bank.getFirst(iArr28).getQuantity(), lllIlIllIl[11])) {
                            System.out.println(lllIlIllII[lllIlIllIl[57]]);
                            bu.add(new C0003d(lllIlIllIl[10], lllIlIllIl[58], lllIlIllIl[14]));
                            "".length();
                        }
                    }
                    iArr6 = new int[lllIlIllIl[1]];
                    iArr6[lllIlIllIl[0]] = lllIlIllIl[59];
                    if (llIIIllIllllI(Bank.contains(iArr6) ? 1 : 0)) {
                        int[] iArr29 = new int[lllIlIllIl[1]];
                        iArr29[lllIlIllIl[0]] = lllIlIllIl[59];
                        if (llIIIllIlllll(Bank.getFirst(iArr29).getQuantity(), lllIlIllIl[11])) {
                            System.out.println(lllIlIllII[lllIlIllIl[60]]);
                            bu.add(new C0003d(lllIlIllIl[59], lllIlIllIl[58], lllIlIllIl[14]));
                            "".length();
                        }
                    }
                    iArr7 = new int[lllIlIllIl[1]];
                    iArr7[lllIlIllIl[0]] = lllIlIllIl[15];
                    if (llIIIllIllllI(Bank.contains(iArr7) ? 1 : 0)) {
                        int[] iArr30 = new int[lllIlIllIl[1]];
                        iArr30[lllIlIllIl[0]] = lllIlIllIl[15];
                        if (llIIIllIlllll(Bank.getFirst(iArr30).getQuantity(), lllIlIllIl[11])) {
                            System.out.println(lllIlIllII[lllIlIllIl[61]]);
                            bu.add(new C0003d(lllIlIllIl[15], lllIlIllIl[58], lllIlIllIl[14]));
                            "".length();
                        }
                    }
                    iArr8 = new int[lllIlIllIl[1]];
                    iArr8[lllIlIllIl[0]] = lllIlIllIl[13];
                    if (llIIIllIllllI(Bank.contains(iArr8) ? 1 : 0)) {
                        int[] iArr31 = new int[lllIlIllIl[1]];
                        iArr31[lllIlIllIl[0]] = lllIlIllIl[13];
                        if (llIIIllIlllll(Bank.getFirst(iArr31).getQuantity(), lllIlIllIl[11])) {
                            System.out.println(lllIlIllII[lllIlIllIl[62]]);
                            bu.add(new C0003d(lllIlIllIl[13], lllIlIllIl[58], lllIlIllIl[14]));
                            "".length();
                        }
                    }
                    iArr9 = new int[lllIlIllIl[1]];
                    iArr9[lllIlIllIl[0]] = lllIlIllIl[59];
                    if (llIIIlllIIIII(Bank.contains(iArr9) ? 1 : 0)) {
                        System.out.println(lllIlIllII[lllIlIllIl[63]]);
                        bu.add(new C0003d(lllIlIllIl[59], lllIlIllIl[58], lllIlIllIl[14]));
                        "".length();
                    }
                    iArr10 = new int[lllIlIllIl[1]];
                    iArr10[lllIlIllIl[0]] = lllIlIllIl[15];
                    if (llIIIlllIIIII(Bank.contains(iArr10) ? 1 : 0)) {
                        System.out.println(lllIlIllII[lllIlIllIl[64]]);
                        bu.add(new C0003d(lllIlIllIl[15], lllIlIllIl[58], lllIlIllIl[14]));
                        "".length();
                    }
                    iArr11 = new int[lllIlIllIl[1]];
                    iArr11[lllIlIllIl[0]] = lllIlIllIl[13];
                    if (llIIIlllIIIII(Bank.contains(iArr11) ? 1 : 0)) {
                        System.out.println(lllIlIllII[lllIlIllIl[65]]);
                        bu.add(new C0003d(lllIlIllIl[13], lllIlIllIl[58], lllIlIllIl[14]));
                        "".length();
                    }
                    iArr12 = new int[lllIlIllIl[1]];
                    iArr12[lllIlIllIl[0]] = lllIlIllIl[10];
                    if (llIIIlllIIIII(Bank.contains(iArr12) ? 1 : 0)) {
                        return;
                    }
                    System.out.println(lllIlIllII[lllIlIllIl[66]]);
                    bu.add(new C0003d(lllIlIllIl[10], lllIlIllIl[58], lllIlIllIl[14]));
                    "".length();
                    return;
                }
                System.out.println(lllIlIllII[lllIlIllIl[55]]);
                bu.add(new C0003d(lllIlIllIl[7], lllIlIllIl[30], lllIlIllIl[53]));
                "".length();
                iArr4 = new int[lllIlIllIl[1]];
                iArr4[lllIlIllIl[0]] = lllIlIllIl[27];
                if (llIIIlllIIIII(Bank.contains(iArr4) ? 1 : 0)) {
                }
                iArr5 = new int[lllIlIllIl[1]];
                iArr5[lllIlIllIl[0]] = lllIlIllIl[10];
                if (llIIIllIllllI(Bank.contains(iArr5) ? 1 : 0)) {
                }
                iArr6 = new int[lllIlIllIl[1]];
                iArr6[lllIlIllIl[0]] = lllIlIllIl[59];
                if (llIIIllIllllI(Bank.contains(iArr6) ? 1 : 0)) {
                }
                iArr7 = new int[lllIlIllIl[1]];
                iArr7[lllIlIllIl[0]] = lllIlIllIl[15];
                if (llIIIllIllllI(Bank.contains(iArr7) ? 1 : 0)) {
                }
                iArr8 = new int[lllIlIllIl[1]];
                iArr8[lllIlIllIl[0]] = lllIlIllIl[13];
                if (llIIIllIllllI(Bank.contains(iArr8) ? 1 : 0)) {
                }
                iArr9 = new int[lllIlIllIl[1]];
                iArr9[lllIlIllIl[0]] = lllIlIllIl[59];
                if (llIIIlllIIIII(Bank.contains(iArr9) ? 1 : 0)) {
                }
                iArr10 = new int[lllIlIllIl[1]];
                iArr10[lllIlIllIl[0]] = lllIlIllIl[15];
                if (llIIIlllIIIII(Bank.contains(iArr10) ? 1 : 0)) {
                }
                iArr11 = new int[lllIlIllIl[1]];
                iArr11[lllIlIllIl[0]] = lllIlIllIl[13];
                if (llIIIlllIIIII(Bank.contains(iArr11) ? 1 : 0)) {
                }
                iArr12 = new int[lllIlIllIl[1]];
                iArr12[lllIlIllIl[0]] = lllIlIllIl[10];
                if (llIIIlllIIIII(Bank.contains(iArr12) ? 1 : 0)) {
                }
            }
            System.out.println(lllIlIllII[lllIlIllIl[52]]);
            bu.add(new C0003d(lllIlIllIl[20], lllIlIllIl[45], lllIlIllIl[53]));
            "".length();
            iArr2 = new int[lllIlIllIl[1]];
            iArr2[lllIlIllIl[0]] = lllIlIllIl[7];
            if (llIIIlllIIIII(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[lllIlIllIl[1]];
            iArr3[lllIlIllIl[0]] = lllIlIllIl[7];
            if (llIIIllIllllI(Bank.contains(iArr3) ? 1 : 0)) {
            }
            System.out.println(lllIlIllII[lllIlIllIl[55]]);
            bu.add(new C0003d(lllIlIllIl[7], lllIlIllIl[30], lllIlIllIl[53]));
            "".length();
            iArr4 = new int[lllIlIllIl[1]];
            iArr4[lllIlIllIl[0]] = lllIlIllIl[27];
            if (llIIIlllIIIII(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[lllIlIllIl[1]];
            iArr5[lllIlIllIl[0]] = lllIlIllIl[10];
            if (llIIIllIllllI(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[lllIlIllIl[1]];
            iArr6[lllIlIllIl[0]] = lllIlIllIl[59];
            if (llIIIllIllllI(Bank.contains(iArr6) ? 1 : 0)) {
            }
            iArr7 = new int[lllIlIllIl[1]];
            iArr7[lllIlIllIl[0]] = lllIlIllIl[15];
            if (llIIIllIllllI(Bank.contains(iArr7) ? 1 : 0)) {
            }
            iArr8 = new int[lllIlIllIl[1]];
            iArr8[lllIlIllIl[0]] = lllIlIllIl[13];
            if (llIIIllIllllI(Bank.contains(iArr8) ? 1 : 0)) {
            }
            iArr9 = new int[lllIlIllIl[1]];
            iArr9[lllIlIllIl[0]] = lllIlIllIl[59];
            if (llIIIlllIIIII(Bank.contains(iArr9) ? 1 : 0)) {
            }
            iArr10 = new int[lllIlIllIl[1]];
            iArr10[lllIlIllIl[0]] = lllIlIllIl[15];
            if (llIIIlllIIIII(Bank.contains(iArr10) ? 1 : 0)) {
            }
            iArr11 = new int[lllIlIllIl[1]];
            iArr11[lllIlIllIl[0]] = lllIlIllIl[13];
            if (llIIIlllIIIII(Bank.contains(iArr11) ? 1 : 0)) {
            }
            iArr12 = new int[lllIlIllIl[1]];
            iArr12[lllIlIllIl[0]] = lllIlIllIl[10];
            if (llIIIlllIIIII(Bank.contains(iArr12) ? 1 : 0)) {
            }
        }
        System.out.println(lllIlIllII[lllIlIllIl[48]]);
        bu.add(new C0003d(lllIlIllIl[17], lllIlIllIl[9], lllIlIllIl[47]));
        "".length();
        if (llIIIlllIIIII(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lllIlIllII[lllIlIllIl[85]]);
        }) ? 1 : 0)) {
        }
        iArr = new int[lllIlIllIl[1]];
        iArr[lllIlIllIl[0]] = lllIlIllIl[20];
        if (llIIIllIllllI(Bank.contains(iArr) ? 1 : 0)) {
        }
        System.out.println(lllIlIllII[lllIlIllIl[52]]);
        bu.add(new C0003d(lllIlIllIl[20], lllIlIllIl[45], lllIlIllIl[53]));
        "".length();
        iArr2 = new int[lllIlIllIl[1]];
        iArr2[lllIlIllIl[0]] = lllIlIllIl[7];
        if (llIIIlllIIIII(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lllIlIllIl[1]];
        iArr3[lllIlIllIl[0]] = lllIlIllIl[7];
        if (llIIIllIllllI(Bank.contains(iArr3) ? 1 : 0)) {
        }
        System.out.println(lllIlIllII[lllIlIllIl[55]]);
        bu.add(new C0003d(lllIlIllIl[7], lllIlIllIl[30], lllIlIllIl[53]));
        "".length();
        iArr4 = new int[lllIlIllIl[1]];
        iArr4[lllIlIllIl[0]] = lllIlIllIl[27];
        if (llIIIlllIIIII(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lllIlIllIl[1]];
        iArr5[lllIlIllIl[0]] = lllIlIllIl[10];
        if (llIIIllIllllI(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[lllIlIllIl[1]];
        iArr6[lllIlIllIl[0]] = lllIlIllIl[59];
        if (llIIIllIllllI(Bank.contains(iArr6) ? 1 : 0)) {
        }
        iArr7 = new int[lllIlIllIl[1]];
        iArr7[lllIlIllIl[0]] = lllIlIllIl[15];
        if (llIIIllIllllI(Bank.contains(iArr7) ? 1 : 0)) {
        }
        iArr8 = new int[lllIlIllIl[1]];
        iArr8[lllIlIllIl[0]] = lllIlIllIl[13];
        if (llIIIllIllllI(Bank.contains(iArr8) ? 1 : 0)) {
        }
        iArr9 = new int[lllIlIllIl[1]];
        iArr9[lllIlIllIl[0]] = lllIlIllIl[59];
        if (llIIIlllIIIII(Bank.contains(iArr9) ? 1 : 0)) {
        }
        iArr10 = new int[lllIlIllIl[1]];
        iArr10[lllIlIllIl[0]] = lllIlIllIl[15];
        if (llIIIlllIIIII(Bank.contains(iArr10) ? 1 : 0)) {
        }
        iArr11 = new int[lllIlIllIl[1]];
        iArr11[lllIlIllIl[0]] = lllIlIllIl[13];
        if (llIIIlllIIIII(Bank.contains(iArr11) ? 1 : 0)) {
        }
        iArr12 = new int[lllIlIllIl[1]];
        iArr12[lllIlIllIl[0]] = lllIlIllIl[10];
        if (llIIIlllIIIII(Bank.contains(iArr12) ? 1 : 0)) {
        }
    }

    private static void llIIIllIlllIl() {
        lllIlIllIl = new int[97];
        lllIlIllIl[0] = (88 ^ 82) & ((51 ^ 57) ^ (-1));
        lllIlIllIl[1] = " ".length();
        lllIlIllIl[2] = ((70 + 159) - 172) + 103;
        lllIlIllIl[3] = "  ".length();
        lllIlIllIl[4] = "   ".length();
        lllIlIllIl[5] = (-((-22427) & 32766)) & (-1041) & 16379;
        lllIlIllIl[6] = (((84 + 122) - 117) + 75) ^ (((90 + 159) - 179) + 90);
        lllIlIllIl[7] = (-((-14433) & 30963)) & (-8225) & 32763;
        lllIlIllIl[8] = (119 ^ 84) ^ (36 ^ 13);
        lllIlIllIl[9] = 102 ^ 99;
        lllIlIllIl[10] = (-3153) & 3710;
        lllIlIllIl[11] = (-((-105) & 2159)) & (-28674) & 31727;
        lllIlIllIl[12] = 189 ^ 187;
        lllIlIllIl[13] = (-11457) & 12013;
        lllIlIllIl[14] = (163 ^ 140) ^ (76 ^ 100);
        lllIlIllIl[15] = (-((-2579) & 32471)) & (-17) & 30463;
        lllIlIllIl[16] = (80 ^ 53) ^ (22 ^ 123);
        lllIlIllIl[17] = (-26643) & 28627;
        lllIlIllIl[18] = 46 ^ 39;
        lllIlIllIl[19] = (((56 + 112) - 150) + 149) ^ (((164 + 104) - 267) + 171);
        lllIlIllIl[20] = (-((-20609) & 28857)) & (-16385) & 32639;
        lllIlIllIl[21] = (-22529) & 23998;
        lllIlIllIl[22] = (-21056) & 22527;
        lllIlIllIl[23] = (-((-4342) & 30975)) & (-545) & 28651;
        lllIlIllIl[24] = (-((-2346) & 6957)) & (-8201) & 14287;
        lllIlIllIl[25] = (-21633) & 22011;
        lllIlIllIl[26] = (-18945) & 19444;
        lllIlIllIl[27] = (-((-5393) & 24511)) & (-1) & 31743;
        lllIlIllIl[28] = (-((-20017) & 32626)) & (-16393) & 31581;
        lllIlIllIl[29] = (-12677) & 15756;
        lllIlIllIl[30] = (32 ^ 36) ^ (104 ^ 120);
        lllIlIllIl[31] = (106 ^ 59) ^ (106 ^ 52);
        lllIlIllIl[32] = (((85 + 100) - 162) + 107) ^ (((18 + 98) - (-20)) + 6);
        lllIlIllIl[33] = 36 ^ 41;
        lllIlIllIl[34] = (110 ^ 74) ^ (71 ^ 109);
        lllIlIllIl[35] = 37 ^ 53;
        lllIlIllIl[36] = (((10 + 97) - 8) + 88) ^ (((56 + 33) - 56) + 137);
        lllIlIllIl[37] = (-16914) & 26423;
        lllIlIllIl[38] = (((61 + 106) - 148) + 125) ^ (((48 + 88) - 53) + 47);
        lllIlIllIl[39] = (-((-8359) & 28911)) & (-3105) & 32766;
        lllIlIllIl[40] = (183 ^ 164) ^ ((154 ^ 133) & ((124 ^ 99) ^ (-1)));
        lllIlIllIl[41] = 96 ^ 117;
        lllIlIllIl[42] = 74 ^ 46;
        lllIlIllIl[43] = (-30768) & 31167;
        lllIlIllIl[44] = (242 ^ 165) ^ (215 ^ 150);
        lllIlIllIl[45] = 47 ^ 7;
        lllIlIllIl[46] = 73 ^ 94;
        lllIlIllIl[47] = (-18441) & 23550;
        lllIlIllIl[48] = (69 ^ 85) ^ (160 ^ 168);
        lllIlIllIl[49] = 65 ^ 88;
        lllIlIllIl[50] = (-16433) & 28412;
        lllIlIllIl[51] = (-((-17001) & 32508)) & (-5) & 32511;
        lllIlIllIl[52] = (((30 + 16) - 19) + 154) ^ (((80 + 36) - 18) + 77);
        lllIlIllIl[53] = (-6148) & 8047;
        lllIlIllIl[54] = "  ".length() ^ (166 ^ 191);
        lllIlIllIl[55] = 177 ^ 173;
        lllIlIllIl[56] = (41 ^ 127) ^ (204 ^ 135);
        lllIlIllIl[57] = (((127 + 42) - 59) + 110) ^ (((155 + 154) - 294) + 179);
        lllIlIllIl[58] = (-26664) & 28663;
        lllIlIllIl[59] = (-((-617) & 31466)) & (-1105) & 32509;
        lllIlIllIl[60] = 69 ^ 90;
        lllIlIllIl[61] = 105 ^ 73;
        lllIlIllIl[62] = 186 ^ 155;
        lllIlIllIl[63] = (106 ^ 24) ^ (64 ^ 16);
        lllIlIllIl[64] = (((103 + 147) - 183) + 112) ^ (((84 + 39) - 2) + 23);
        lllIlIllIl[65] = 40 ^ 12;
        lllIlIllIl[66] = (253 ^ 157) ^ (111 ^ 42);
        lllIlIllIl[67] = (((86 + 71) - 99) + 93) ^ (((135 + 89) - 202) + 155);
        lllIlIllIl[68] = 172 ^ 139;
        lllIlIllIl[69] = (197 ^ 192) ^ (141 ^ 161);
        lllIlIllIl[70] = 127 ^ 85;
        lllIlIllIl[71] = (112 ^ 81) ^ (1 ^ 11);
        lllIlIllIl[72] = 139 ^ 167;
        lllIlIllIl[73] = (99 ^ 65) ^ (50 ^ 61);
        lllIlIllIl[74] = 170 ^ 132;
        lllIlIllIl[75] = 129 ^ 174;
        lllIlIllIl[76] = 188 ^ 140;
        lllIlIllIl[77] = 169 ^ 152;
        lllIlIllIl[78] = 188 ^ 142;
        lllIlIllIl[79] = 79 ^ 124;
        lllIlIllIl[80] = (188 ^ 197) ^ (136 ^ 197);
        lllIlIllIl[81] = 109 ^ 88;
        lllIlIllIl[82] = (((41 + 85) - 3) + 9) ^ (((44 + 98) - 25) + 61);
        lllIlIllIl[83] = 100 ^ 83;
        lllIlIllIl[84] = (188 ^ 131) ^ (0 ^ 7);
        lllIlIllIl[85] = 56 ^ 1;
        lllIlIllIl[86] = (-2517) & 3070;
        lllIlIllIl[87] = (-5059) & 8162;
        lllIlIllIl[88] = (-((-1355) & 30699)) & (-5) & 32511;
        lllIlIllIl[89] = (((120 + 52) - 79) + 36) ^ (((79 + 0) - 47) + 155);
        lllIlIllIl[90] = 25 ^ 34;
        lllIlIllIl[91] = (49 ^ 103) ^ (62 ^ 84);
        lllIlIllIl[92] = 172 ^ 145;
        lllIlIllIl[93] = 186 ^ 132;
        lllIlIllIl[94] = 151 ^ 168;
        lllIlIllIl[95] = 48 ^ 112;
        lllIlIllIl[96] = 229 ^ 164;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return lllIlIllII[lllIlIllIl[84]];
    }

    private static boolean llIIIlllIIlII(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return lllIlIllIl[0];
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            ct();
            "".length();
            if (0 != 0) {
                return ((((30 + 124) - 153) + 175) ^ (((119 + 45) - 49) + 52)) & (((56 ^ 37) ^ (117 ^ 127)) ^ (-" ".length()));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return lllIlIllIl[42];
    }

    private static boolean llIIIllIlllll(int i, int i2) {
        return i < i2;
    }
}
