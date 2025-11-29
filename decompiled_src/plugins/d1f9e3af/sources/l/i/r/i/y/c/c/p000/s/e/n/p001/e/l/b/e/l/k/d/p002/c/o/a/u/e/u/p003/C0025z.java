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
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.z  reason: invalid package and case insensitive filesystem */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/z.class */
public class C0025z {
    private static /* synthetic */ String[] lIIIlIIII;
    private static /* synthetic */ int dx;
    public static /* synthetic */ List<C0003d> bv;
    private static /* synthetic */ int[] lIIIlIIIl;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int dy;
    private static /* synthetic */ int[] dz;

    private static boolean lllIIIIllll(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIIIlIIIl(Object obj) {
        return obj != null;
    }

    public static void af() {
        int[] iArr = new int[lIIIlIIIl[1]];
        iArr[lIIIlIIIl[0]] = dx;
        if (lllIIIlIIII(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(dx, lIIIlIIIl[1], lIIIlIIIl[21]));
            "".length();
        }
        int[] iArr2 = new int[lIIIlIIIl[1]];
        iArr2[lIIIlIIIl[0]] = dy;
        if (lllIIIlIIII(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(dy, lIIIlIIIl[1], lIIIlIIIl[22]));
            "".length();
        }
        int[] iArr3 = new int[lIIIlIIIl[1]];
        iArr3[lIIIlIIIl[0]] = lIIIlIIIl[8];
        if (lllIIIlIIII(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIIIl[8], lIIIlIIIl[1], lIIIlIIIl[23]));
            "".length();
        }
        int[] iArr4 = new int[lIIIlIIIl[1]];
        iArr4[lIIIlIIIl[0]] = lIIIlIIIl[7];
        if (lllIIIlIIII(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIIIl[7], lIIIlIIIl[1], lIIIlIIIl[24]));
            "".length();
        }
        int[] iArr5 = new int[lIIIlIIIl[1]];
        iArr5[lIIIlIIIl[0]] = lIIIlIIIl[25];
        if (lllIIIlIIII(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIIIl[25], lIIIlIIIl[5], lIIIlIIIl[13]));
            "".length();
        }
        int[] iArr6 = new int[lIIIlIIIl[1]];
        iArr6[lIIIlIIIl[0]] = lIIIlIIIl[26];
        if (lllIIIlIIII(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIIIl[26], lIIIlIIIl[27], lIIIlIIIl[13]));
            "".length();
        }
        int[] iArr7 = new int[lIIIlIIIl[1]];
        iArr7[lIIIlIIIl[0]] = lIIIlIIIl[28];
        if (lllIIIlIIII(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIIIl[28], lIIIlIIIl[29], lIIIlIIIl[13]));
            "".length();
        }
        int[] iArr8 = new int[lIIIlIIIl[1]];
        iArr8[lIIIlIIIl[0]] = lIIIlIIIl[30];
        if (lllIIIlIIII(Bank.contains(iArr8) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIIIl[30], lIIIlIIIl[31], lIIIlIIIl[13]));
            "".length();
        }
        int[] iArr9 = new int[lIIIlIIIl[1]];
        iArr9[lIIIlIIIl[0]] = lIIIlIIIl[25];
        if (lllIIIIlllI(Bank.contains(iArr9) ? 1 : 0)) {
            int[] iArr10 = new int[lIIIlIIIl[1]];
            iArr10[lIIIlIIIl[0]] = lIIIlIIIl[25];
            if (lllIIIIllll(Bank.getFirst(iArr10).getQuantity(), lIIIlIIIl[32])) {
                bv.add(new C0003d(lIIIlIIIl[25], lIIIlIIIl[5], lIIIlIIIl[13]));
                "".length();
            }
        }
        int[] iArr11 = new int[lIIIlIIIl[1]];
        iArr11[lIIIlIIIl[0]] = lIIIlIIIl[26];
        if (lllIIIIlllI(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[lIIIlIIIl[1]];
            iArr12[lIIIlIIIl[0]] = lIIIlIIIl[26];
            if (lllIIIIllll(Bank.getFirst(iArr12).getQuantity(), lIIIlIIIl[32])) {
                bv.add(new C0003d(lIIIlIIIl[26], lIIIlIIIl[27], lIIIlIIIl[13]));
                "".length();
            }
        }
        int[] iArr13 = new int[lIIIlIIIl[1]];
        iArr13[lIIIlIIIl[0]] = lIIIlIIIl[28];
        if (lllIIIIlllI(Bank.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[lIIIlIIIl[1]];
            iArr14[lIIIlIIIl[0]] = lIIIlIIIl[28];
            if (lllIIIIllll(Bank.getFirst(iArr14).getQuantity(), lIIIlIIIl[32])) {
                bv.add(new C0003d(lIIIlIIIl[28], lIIIlIIIl[29], lIIIlIIIl[13]));
                "".length();
            }
        }
        int[] iArr15 = new int[lIIIlIIIl[1]];
        iArr15[lIIIlIIIl[0]] = lIIIlIIIl[30];
        if (lllIIIIlllI(Bank.contains(iArr15) ? 1 : 0)) {
            int[] iArr16 = new int[lIIIlIIIl[1]];
            iArr16[lIIIlIIIl[0]] = lIIIlIIIl[30];
            if (lllIIIIllll(Bank.getFirst(iArr16).getQuantity(), lIIIlIIIl[32])) {
                bv.add(new C0003d(lIIIlIIIl[30], lIIIlIIIl[31], lIIIlIIIl[13]));
                "".length();
            }
        }
        if (lllIIIlIIII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIlIIII[lIIIlIIIl[40]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIIIl[33], lIIIlIIIl[6], lIIIlIIIl[34]));
            "".length();
        }
        int[] iArr17 = new int[lIIIlIIIl[1]];
        iArr17[lIIIlIIIl[0]] = lIIIlIIIl[35];
        if (lllIIIlIIII(Bank.contains(iArr17) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIIIl[35], lIIIlIIIl[36], lIIIlIIIl[37]));
            "".length();
        }
    }

    private static boolean lllIIIlIIlI(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean bi() {
        String[] strArr = new String[lIIIlIIIl[1]];
        strArr[lIIIlIIIl[0]] = lIIIlIIII[lIIIlIIIl[19]];
        if (lllIIIIlllI(Equipment.contains(strArr) ? 1 : 0)) {
            int[] iArr = new int[lIIIlIIIl[1]];
            iArr[lIIIlIIIl[0]] = lIIIlIIIl[8];
            if (lllIIIIlllI(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIIlIIIl[1]];
                iArr2[lIIIlIIIl[0]] = lIIIlIIIl[7];
                if (lllIIIIlllI(Equipment.contains(iArr2) ? 1 : 0)) {
                    String[] strArr2 = new String[lIIIlIIIl[1]];
                    strArr2[lIIIlIIIl[0]] = lIIIlIIII[lIIIlIIIl[20]];
                    if (lllIIIIlllI(Equipment.contains(strArr2) ? 1 : 0)) {
                        ?? r0 = lIIIlIIIl[1];
                        "".length();
                        return (-" ".length()) >= 0 ? ((144 ^ 156) ^ (148 ^ 164)) & (((((74 + 28) - 40) + 66) ^ (((178 + 82) - 173) + 101)) ^ (-" ".length())) : r0;
                    }
                }
            }
        }
        return lIIIlIIIl[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0179, code lost:
        if (lllIIIlIIll(net.unethicalite.api.items.Inventory.getCount(r0), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0025z.lIIIlIIIl[1]) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ad, code lost:
        if (lllIIIIlllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01ec, code lost:
        if (lllIIIlIIll(net.unethicalite.api.items.Inventory.getCount(r0), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0025z.lIIIlIIIl[1]) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x022b, code lost:
        if (lllIIIIllll(net.unethicalite.api.items.Inventory.getCount(r0), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0025z.lIIIlIIIl[1]) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x022e, code lost:
        af();
        java.lang.System.out.println(l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0025z.lIIIlIIII[l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0025z.lIIIlIIIl[9]]);
        l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0025z.bt = l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0025z.lIIIlIIIl[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0249, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v195, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v228, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bg() {
        if (lllIIIIlllI(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIIlIIII[lIIIlIIIl[0]];
            C0001b.a(bv);
            if (lllIIIIllll(bv.size(), lIIIlIIIl[1])) {
                System.out.println(lIIIlIIII[lIIIlIIIl[1]]);
                bt = lIIIlIIIl[0];
            }
        }
        if (lllIIIlIIII(bt ? 1 : 0) && lllIIIlIIII(bi() ? 1 : 0)) {
            System.out.println(lIIIlIIII[lIIIlIIIl[2]]);
            if (lllIIIlIIII(bh() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lllIIIlIIIl(nearest) && lllIIIlIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIlIIII[lIIIlIIIl[3]];
                    C0000a.a(nearest);
                }
                if (lllIIIlIIIl(nearest) && lllIIIIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lllIIIlIIII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIlIIII[lIIIlIIIl[4]];
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIlIIIl[5]);
                        "".length();
                    }
                    if (lllIIIIlllI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIlIIII[lIIIlIIIl[6]];
                        if (lllIIIlIIlI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIlIIIl[3]);
                            "".length();
                        }
                        if (lllIIIlIIlI(Equipment.getAll().size()) && lllIIIlIIII(bi() ? 1 : 0)) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIlIIIl[2]);
                            "".length();
                        }
                        int[] iArr = new int[lIIIlIIIl[1]];
                        iArr[lIIIlIIIl[0]] = dy;
                        if (lllIIIlIIII(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lIIIlIIIl[1]];
                            iArr2[lIIIlIIIl[0]] = dy;
                        }
                        int[] iArr3 = new int[lIIIlIIIl[1]];
                        iArr3[lIIIlIIIl[0]] = dx;
                        if (lllIIIlIIII(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIIIlIIIl[1]];
                            iArr4[lIIIlIIIl[0]] = dx;
                        }
                        int[] iArr5 = new int[lIIIlIIIl[1]];
                        iArr5[lIIIlIIIl[0]] = lIIIlIIIl[7];
                        if (lllIIIlIIII(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lIIIlIIIl[1]];
                            iArr6[lIIIlIIIl[0]] = lIIIlIIIl[7];
                        }
                        int[] iArr7 = new int[lIIIlIIIl[1]];
                        iArr7[lIIIlIIIl[0]] = lIIIlIIIl[8];
                        if (lllIIIlIIII(Bank.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[lIIIlIIIl[1]];
                            iArr8[lIIIlIIIl[0]] = lIIIlIIIl[8];
                        }
                        int[] iArr9 = new int[lIIIlIIIl[1]];
                        iArr9[lIIIlIIIl[0]] = dx;
                        if (lllIIIIlllI(Bank.contains(iArr9) ? 1 : 0)) {
                            int[] iArr10 = new int[lIIIlIIIl[1]];
                            iArr10[lIIIlIIIl[0]] = dx;
                            if (lllIIIIllll(Inventory.getCount(iArr10), lIIIlIIIl[1])) {
                                Bank.withdraw(dx, lIIIlIIIl[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIIlIIIl[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr11 = new int[lIIIlIIIl[1]];
                                    iArr11[lIIIlIIIl[0]] = dx;
                                    if (lllIIIlIIlI(Inventory.getCount(iArr11))) {
                                        ?? r0 = lIIIlIIIl[1];
                                        "".length();
                                        return "  ".length() == " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lIIIlIIIl[0];
                                }, lIIIlIIIl[5]);
                                "".length();
                            }
                        }
                        int[] iArr11 = new int[lIIIlIIIl[1]];
                        iArr11[lIIIlIIIl[0]] = dy;
                        if (lllIIIIlllI(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIIIlIIIl[1]];
                            iArr12[lIIIlIIIl[0]] = dy;
                            if (lllIIIIllll(Inventory.getCount(iArr12), lIIIlIIIl[1])) {
                                Bank.withdraw(dy, lIIIlIIIl[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIIlIIIl[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr13 = new int[lIIIlIIIl[1]];
                                    iArr13[lIIIlIIIl[0]] = dy;
                                    if (lllIIIlIIlI(Inventory.getCount(iArr13))) {
                                        ?? r0 = lIIIlIIIl[1];
                                        "".length();
                                        return 0 != 0 ? ((119 ^ 76) ^ (116 ^ 101)) & (((225 ^ 157) ^ (108 ^ 58)) ^ (-" ".length())) : r0;
                                    }
                                    return lIIIlIIIl[0];
                                }, lIIIlIIIl[5]);
                                "".length();
                            }
                        }
                        int[] iArr13 = new int[lIIIlIIIl[1]];
                        iArr13[lIIIlIIIl[0]] = lIIIlIIIl[7];
                        if (lllIIIIlllI(Bank.contains(iArr13) ? 1 : 0)) {
                            int[] iArr14 = new int[lIIIlIIIl[1]];
                            iArr14[lIIIlIIIl[0]] = lIIIlIIIl[7];
                            if (lllIIIIllll(Inventory.getCount(iArr14), lIIIlIIIl[1])) {
                                Bank.withdraw(lIIIlIIIl[7], lIIIlIIIl[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIIlIIIl[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr15 = new int[lIIIlIIIl[1]];
                                    iArr15[lIIIlIIIl[0]] = lIIIlIIIl[7];
                                    if (lllIIIlIIlI(Inventory.getCount(iArr15))) {
                                        ?? r0 = lIIIlIIIl[1];
                                        "".length();
                                        return ("   ".length() ^ (90 ^ 93)) < " ".length() ? ((((82 + 24) - 47) + 191) ^ (((99 + 164) - 209) + 123)) & (((226 ^ 147) ^ (3 ^ 57)) ^ (-" ".length())) : r0;
                                    }
                                    return lIIIlIIIl[0];
                                }, lIIIlIIIl[5]);
                                "".length();
                            }
                        }
                        int[] iArr15 = new int[lIIIlIIIl[1]];
                        iArr15[lIIIlIIIl[0]] = lIIIlIIIl[8];
                        if (lllIIIIlllI(Bank.contains(iArr15) ? 1 : 0)) {
                            int[] iArr16 = new int[lIIIlIIIl[1]];
                            iArr16[lIIIlIIIl[0]] = lIIIlIIIl[8];
                            if (lllIIIIllll(Inventory.getCount(iArr16), lIIIlIIIl[1])) {
                                Bank.withdraw(lIIIlIIIl[8], lIIIlIIIl[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIIlIIIl[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr17 = new int[lIIIlIIIl[1]];
                                    iArr17[lIIIlIIIl[0]] = lIIIlIIIl[8];
                                    if (lllIIIlIIlI(Inventory.getCount(iArr17))) {
                                        ?? r0 = lIIIlIIIl[1];
                                        "".length();
                                        return " ".length() < (((9 ^ 77) ^ (148 ^ 176)) & (((((74 + 203) - 238) + 168) ^ (((24 + 120) - 92) + 123)) ^ (-" ".length()))) ? ((1 ^ 23) ^ (66 ^ 95)) & (((((32 + 19) - 42) + 156) ^ (((102 + 20) - 70) + 122)) ^ (-" ".length())) : r0;
                                    }
                                    return lIIIlIIIl[0];
                                }, lIIIlIIIl[5]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (lllIIIIlllI(bh() ? 1 : 0)) {
                if (lllIIIIlllI(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (lllIIIlIIII(Bank.isOpen() ? 1 : 0)) {
                    if (lllIIIIlllI(GrandExchange.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepTicks(lIIIlIIIl[1]);
                        "".length();
                    }
                    int i = lIIIlIIIl[0];
                    while (lllIIIIllll(i, dz.length)) {
                        int[] iArr17 = new int[lIIIlIIIl[1]];
                        iArr17[lIIIlIIIl[0]] = dz[i];
                        Item first = Inventory.getFirst(iArr17);
                        if (lllIIIlIIIl(first)) {
                            int[] iArr18 = new int[lIIIlIIIl[1]];
                            iArr18[lIIIlIIIl[0]] = first.getId();
                            if (lllIIIIlllI(Inventory.contains(iArr18) ? 1 : 0)) {
                                String[] strArr = new String[lIIIlIIIl[1]];
                                strArr[lIIIlIIIl[0]] = lIIIlIIII[lIIIlIIIl[10]];
                                if (lllIIIIlllI(first.hasAction(strArr) ? 1 : 0)) {
                                    first.interact(lIIIlIIII[lIIIlIIIl[11]]);
                                    Time.sleepTicks(lIIIlIIIl[1]);
                                    "".length();
                                }
                                String[] strArr2 = new String[lIIIlIIIl[1]];
                                strArr2[lIIIlIIIl[0]] = lIIIlIIII[lIIIlIIIl[12]];
                                if (lllIIIIlllI(first.hasAction(strArr2) ? 1 : 0)) {
                                    first.interact(lIIIlIIII[lIIIlIIIl[13]]);
                                    Time.sleepTicks(lIIIlIIIl[1]);
                                    "".length();
                                }
                                String[] strArr3 = new String[lIIIlIIIl[1]];
                                strArr3[lIIIlIIIl[0]] = lIIIlIIII[lIIIlIIIl[14]];
                                if (lllIIIIlllI(first.hasAction(strArr3) ? 1 : 0)) {
                                    first.interact(lIIIlIIII[lIIIlIIIl[15]]);
                                    Time.sleepTicks(lIIIlIIIl[1]);
                                    "".length();
                                }
                                Time.sleepTicks(lIIIlIIIl[1]);
                                "".length();
                            }
                        }
                        i++;
                        "".length();
                        if ((((189 ^ 172) ^ (253 ^ 179)) & (((((213 + 213) - 357) + 164) ^ (((55 + 36) - 20) + 111)) ^ (-" ".length()))) != 0) {
                            return;
                        }
                    }
                    if (lllIIIIlllI(bi() ? 1 : 0) && lllIIIlIIII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIlIIIl[16]);
                        "".length();
                    }
                }
            }
        }
    }

    private static boolean lllIIIIlllI(int i) {
        return i != 0;
    }

    static {
        lllIIIIllIl();
        lllIIIIllII();
        bv = new ArrayList();
        dx = lIIIlIIIl[41];
        dy = lIIIlIIIl[42];
        int[] iArr = new int[lIIIlIIIl[4]];
        iArr[lIIIlIIIl[0]] = dx;
        iArr[lIIIlIIIl[1]] = dy;
        iArr[lIIIlIIIl[2]] = lIIIlIIIl[8];
        iArr[lIIIlIIIl[3]] = lIIIlIIIl[7];
        dz = iArr;
    }

    private static String lllIIIIlIIl(String lIIlIIIIllllIll, String lIIlIIIIllllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIIIIllllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlIIIIlllllIl = Cipher.getInstance("Blowfish");
            lIIlIIIIlllllIl.init(lIIIlIIIl[2], secretKeySpec);
            return new String(lIIlIIIIlllllIl.doFinal(Base64.getDecoder().decode(lIIlIIIIllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlIIIIlllllII) {
            lIIlIIIIlllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIlIIll(int i, int i2) {
        return i >= i2;
    }

    private static String lllIIIIlIlI(String lIIlIIIlIIlllIl, String lIIlIIIlIIlllII) {
        String lIIlIIIlIIlllIl2 = new String(Base64.getDecoder().decode(lIIlIIIlIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lIIlIIIlIIllIlI = lIIlIIIlIIlllII.toCharArray();
        int lIIlIIIlIIlIlII = lIIIlIIIl[0];
        char[] charArray = lIIlIIIlIIlllIl2.toCharArray();
        int length = charArray.length;
        int i = lIIIlIIIl[0];
        while (lllIIIIllll(i, length)) {
            sb.append((char) (charArray[i] ^ lIIlIIIlIIllIlI[lIIlIIIlIIlIlII % lIIlIIIlIIllIlI.length]));
            "".length();
            lIIlIIIlIIlIlII++;
            i++;
            "".length();
            if ((-" ".length()) == (" ".length() & (" ".length() ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lllIIIIlIll(String lIIlIIIlIIIlIII, String lIIlIIIlIIIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlIIIlIIIIlll.getBytes(StandardCharsets.UTF_8)), lIIIlIIIl[11]), "DES");
            Cipher lIIlIIIlIIIlIlI = Cipher.getInstance("DES");
            lIIlIIIlIIIlIlI.init(lIIIlIIIl[2], secretKeySpec);
            return new String(lIIlIIIlIIIlIlI.doFinal(Base64.getDecoder().decode(lIIlIIIlIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlIIIlIIIIlII) {
            lIIlIIIlIIIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIlIIII(int i) {
        return i == 0;
    }

    public static void bj() {
        if (lllIIIIlllI(Inventory.contains(C0005f.bf) ? 1 : 0) && lllIIIlIIII(Equipment.contains(C0005f.bf) ? 1 : 0)) {
            Inventory.getFirst(C0005f.bf).interact(lIIIlIIII[lIIIlIIIl[38]]);
            Time.sleepTicks(lIIIlIIIl[1]);
            "".length();
        }
        if (lllIIIIlllI(Inventory.contains(C0005f.aR) ? 1 : 0) && lllIIIlIIII(Equipment.contains(C0005f.aR) ? 1 : 0)) {
            Inventory.getFirst(C0005f.aR).interact(lIIIlIIII[lIIIlIIIl[39]]);
            Time.sleepTicks(lIIIlIIIl[1]);
            "".length();
        }
    }

    private static void lllIIIIllIl() {
        lIIIlIIIl = new int[44];
        lIIIlIIIl[0] = ((34 ^ 28) ^ (26 ^ 103)) & (((142 ^ 182) ^ (84 ^ 47)) ^ (-" ".length()));
        lIIIlIIIl[1] = " ".length();
        lIIIlIIIl[2] = "  ".length();
        lIIIlIIIl[3] = "   ".length();
        lIIIlIIIl[4] = (((148 + 119) - 255) + 153) ^ (((154 + 107) - 237) + 137);
        lIIIlIIIl[5] = (-((-2692) & 27323)) & (-1089) & 30719;
        lIIIlIIIl[6] = 155 ^ 158;
        lIIIlIIIl[7] = (-9220) & 11771;
        lIIIlIIIl[8] = (-16641) & 18344;
        lIIIlIIIl[9] = (183 ^ 195) ^ (211 ^ 161);
        lIIIlIIIl[10] = (((118 + 110) - 70) + 34) ^ (((32 + 160) - 102) + 109);
        lIIIlIIIl[11] = (9 ^ 82) ^ (13 ^ 94);
        lIIIlIIIl[12] = 43 ^ 34;
        lIIIlIIIl[13] = 165 ^ 175;
        lIIIlIIIl[14] = (179 ^ 133) ^ (154 ^ 167);
        lIIIlIIIl[15] = 146 ^ 158;
        lIIIlIIIl[16] = (-2) & 6501;
        lIIIlIIIl[17] = 111 ^ 98;
        lIIIlIIIl[18] = 57 ^ 55;
        lIIIlIIIl[19] = 38 ^ 41;
        lIIIlIIIl[20] = (83 ^ 1) ^ (112 ^ 50);
        lIIIlIIIl[21] = (-"  ".length()) & (-4897) & 13307;
        lIIIlIIIl[22] = (-16401) & 17910;
        lIIIlIIIl[23] = (-34) & 28543;
        lIIIlIIIl[24] = (-((-3) & 10903)) & (-16417) & 32766;
        lIIIlIIIl[25] = (-((-3786) & 12251)) & (-5185) & 14207;
        lIIIlIIIl[26] = (-28821) & 29375;
        lIIIlIIIl[27] = (-((-17577) & 21739)) & (-24582) & 31743;
        lIIIlIIIl[28] = (-2513) & 3069;
        lIIIlIIIl[29] = (-(244 ^ 178)) & (-20497) & 24565;
        lIIIlIIIl[30] = (-11478) & 12031;
        lIIIlIIIl[31] = (-53) & 8052;
        lIIIlIIIl[32] = (-((-8405) & 31965)) & (-8705) & 32764;
        lIIIlIIIl[33] = (-((-4634) & 21307)) & (-19) & 28671;
        lIIIlIIIl[34] = (-((-16460) & 22111)) & (-2113) & 32763;
        lIIIlIIIl[35] = (-((-365) & 8573)) & (-16553) & 32767;
        lIIIlIIIl[36] = (-21548) & 21947;
        lIIIlIIIl[37] = (-19497) & 20396;
        lIIIlIIIl[38] = 63 ^ 46;
        lIIIlIIIl[39] = 134 ^ 148;
        lIIIlIIIl[40] = (((9 + 198) - 93) + 97) ^ (((130 + 156) - 226) + 132);
        lIIIlIIIl[41] = (-((-99) & 22771)) & (-523) & 24575;
        lIIIlIIIl[42] = (-((-67) & 30815)) & (-1) & 31807;
        lIIIlIIIl[43] = (((56 + 62) - 76) + 145) ^ (((123 + 151) - 182) + 83);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean bh() {
        String[] strArr = new String[lIIIlIIIl[1]];
        strArr[lIIIlIIIl[0]] = lIIIlIIII[lIIIlIIIl[17]];
        if (lllIIIIlllI(Inventory.contains(strArr) ? 1 : 0)) {
            int[] iArr = new int[lIIIlIIIl[1]];
            iArr[lIIIlIIIl[0]] = lIIIlIIIl[8];
            if (lllIIIIlllI(Inventory.contains(iArr) ? 1 : 0)) {
                String[] strArr2 = new String[lIIIlIIIl[1]];
                strArr2[lIIIlIIIl[0]] = lIIIlIIII[lIIIlIIIl[18]];
                if (lllIIIIlllI(Inventory.contains(strArr2) ? 1 : 0) && lllIIIIlllI(Inventory.contains(C0005f.aN) ? 1 : 0)) {
                    ?? r0 = lIIIlIIIl[1];
                    "".length();
                    return "  ".length() < 0 ? ((17 ^ 59) ^ (77 ^ 91)) & (((53 ^ 17) ^ (111 ^ 119)) ^ (-" ".length())) : r0;
                }
            }
        }
        return lIIIlIIIl[0];
    }

    private static void lllIIIIllII() {
        lIIIlIIII = new String[lIIIlIIIl[43]];
        lIIIlIIII[lIIIlIIIl[0]] = lllIIIIlIIl("waGh2a5h+x1L4EppTLBkNQ==", "Xchgm");
        lIIIlIIII[lIIIlIIIl[1]] = lllIIIIlIlI("NwoLPgMZBgF3EgQaDDkXUQoRMh0CT0UkBxgXBj8ZHwRFNRESCEUjH1EEADYCGA0C", "qceWp");
        lIIIlIIII[lIIIlIIIl[2]] = lllIIIIlIIl("HetciSz5fgnr5tB86QuqB4ZfY1xuF2ME", "ECaoT");
        lIIIlIIII[lIIIlIIIl[3]] = lllIIIIlIlI("JCI6LT4LNyUqPko3I2Q7Cy0n", "jCLDY");
        lIIIlIIII[lIIIlIIIl[4]] = lllIIIIlIll("jHTCf5MDgRaxhoOK82xzcQ==", "gDsHC");
        lIIIlIIII[lIIIlIIIl[6]] = lllIIIIlIIl("XvlNKrX7Hw11WNKuCWSPxp0GHHwmDVvg", "XkuFn");
        lIIIlIIII[lIIIlIIIl[9]] = lllIIIIlIIl("B1z+veH/winJ6w+cFjUNXvJnHhHXNNB+gH8CaSCWJjxzOWE2J44UGyBy1J+/elkQDgpALl4wTds=", "ZLtpO");
        lIIIlIIII[lIIIlIIIl[10]] = lllIIIIlIIl("aQAhr5RKYdY=", "rnbfM");
        lIIIlIIII[lIIIlIIIl[11]] = lllIIIIlIlI("MDQiHQ==", "gQCoL");
        lIIIlIIII[lIIIlIIIl[12]] = lllIIIIlIll("a9FguoTlXCw=", "vIeiB");
        lIIIlIIII[lIIIlIIIl[13]] = lllIIIIlIlI("LxkVDyM=", "xppcG");
        lIIIlIIII[lIIIlIIIl[14]] = lllIIIIlIIl("m1qYK7N+3e8=", "zJQBv");
        lIIIlIIII[lIIIlIIIl[15]] = lllIIIIlIIl("+b6yvgAA4Rs=", "NKrcs");
        lIIIlIIII[lIIIlIIIl[17]] = lllIIIIlIIl("Nth2YGns8k5ACm2+P22NUQ==", "JWWTM");
        lIIIlIIII[lIIIlIIIl[18]] = lllIIIIlIIl("5etJ5UJOgoAbL+WoL4bfpA==", "wUQnU");
        lIIIlIIII[lIIIlIIIl[19]] = lllIIIIlIll("sQg8+WICTs/PFkaXrVBghQ==", "PbyQK");
        lIIIlIIII[lIIIlIIIl[20]] = lllIIIIlIlI("Bg4rMC0vGWojKSUdLzc=", "JkJDE");
        lIIIlIIII[lIIIlIIIl[38]] = lllIIIIlIll("BO5skaLuj6U=", "CQOsy");
        lIIIlIIII[lIIIlIIIl[39]] = lllIIIIlIlI("EQAkIg==", "FeEPu");
        lIIIlIIII[lIIIlIIIl[40]] = lllIIIIlIll("/5pITd5fBHVT7Gt//FOrrjrKUZWI6/GU", "QYPRp");
    }
}
