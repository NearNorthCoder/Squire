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
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.C  reason: invalid package */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/C.class */
public class C implements F {
    private static final /* synthetic */ int ia;
    static /* synthetic */ String hI;
    static /* synthetic */ int ci;
    private static final /* synthetic */ int ig;
    private static final /* synthetic */ int hZ;
    private static final /* synthetic */ int ih;
    private static final /* synthetic */ int hY;
    private static /* synthetic */ String[] lIllIlll;
    public static /* synthetic */ List<C0003d> bB;
    static /* synthetic */ boolean cj;
    private static final /* synthetic */ WorldPoint hW;
    private static /* synthetic */ int[] lIlllIIl;

    /* renamed from: if  reason: not valid java name */
    private static final /* synthetic */ int f0if;
    static /* synthetic */ String[] gx;
    private static final /* synthetic */ int hX;
    private static final /* synthetic */ int ic;
    static /* synthetic */ int bZ;
    private static final /* synthetic */ int id;
    public static /* synthetic */ boolean bz;
    private static final /* synthetic */ int ib;
    private static final /* synthetic */ int ie;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean bm() {
        String[] strArr = new String[lIlllIIl[1]];
        strArr[lIlllIIl[0]] = lIllIlll[lIlllIIl[67]];
        if (lIIllIlllIl(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[lIlllIIl[1]];
            strArr2[lIlllIIl[0]] = lIllIlll[lIlllIIl[68]];
            if (lIIllIlllIl(Inventory.contains(strArr2) ? 1 : 0)) {
                String[] strArr3 = new String[lIlllIIl[1]];
                strArr3[lIlllIIl[0]] = lIllIlll[lIlllIIl[45]];
                if (lIIllIlllIl(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[lIlllIIl[1]];
                    strArr4[lIlllIIl[0]] = lIllIlll[lIlllIIl[69]];
                    if (lIIllIlllIl(Inventory.contains(strArr4) ? 1 : 0)) {
                        int[] iArr = new int[lIlllIIl[1]];
                        iArr[lIlllIIl[0]] = lIlllIIl[10];
                        if (lIIllIlllIl(Inventory.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lIlllIIl[1]];
                            iArr2[lIlllIIl[0]] = lIlllIIl[15];
                            if (lIIllIlllIl(Inventory.contains(iArr2) ? 1 : 0)) {
                                int[] iArr3 = new int[lIlllIIl[1]];
                                iArr3[lIlllIIl[0]] = lIlllIIl[13];
                                if (lIIllIlllIl(Inventory.contains(iArr3) ? 1 : 0)) {
                                    int[] iArr4 = new int[lIlllIIl[1]];
                                    iArr4[lIlllIIl[0]] = lIlllIIl[7];
                                    if (lIIllIlllIl(Inventory.contains(iArr4) ? 1 : 0)) {
                                        int[] iArr5 = new int[lIlllIIl[1]];
                                        iArr5[lIlllIIl[0]] = lIlllIIl[25];
                                        if (lIIllIlllIl(Inventory.contains(iArr5) ? 1 : 0)) {
                                            String[] strArr5 = new String[lIlllIIl[1]];
                                            strArr5[lIlllIIl[0]] = lIllIlll[lIlllIIl[70]];
                                            if (lIIllIlllIl(Inventory.contains(strArr5) ? 1 : 0)) {
                                                ?? r0 = lIlllIIl[1];
                                                "".length();
                                                return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
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
        return lIlllIIl[0];
    }

    private static boolean lIIllIllllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIllIlllIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v244, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v253, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v262, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v271, types: [boolean] */
    private static void bJ() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIIlllIIIII(nearest) && lIIllIlllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = lIllIlll[lIlllIIl[71]];
            C0000a.a(nearest);
        }
        if (lIIlllIIIII(nearest) && lIIllIlllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIllIlllll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderBarrows.c = lIllIlll[lIlllIIl[72]];
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIlllIIl[5]);
                "".length();
            }
            if (lIIllIlllIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderBarrows.c = lIllIlll[lIlllIIl[73]];
                if (lIIlllIIIIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lIlllIIl[4]);
                    "".length();
                }
                if (lIIlllIIIIl(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(lIlllIIl[3]);
                    "".length();
                }
                String[] strArr = new String[lIlllIIl[1]];
                strArr[lIlllIIl[0]] = lIllIlll[lIlllIIl[74]];
                if (lIIllIlllIl(Bank.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIlllIIl[1]];
                    strArr2[lIlllIIl[0]] = lIllIlll[lIlllIIl[75]];
                    if (lIIllIllllI(Bank.getFirst(strArr2).getQuantity(), lIlllIIl[11])) {
                        ag();
                        System.out.println(lIllIlll[lIlllIIl[76]]);
                        bz = lIlllIIl[1];
                        return;
                    }
                }
                String[] strArr3 = new String[lIlllIIl[1]];
                strArr3[lIlllIIl[0]] = lIllIlll[lIlllIIl[77]];
                if (lIIllIlllIl(Bank.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[lIlllIIl[1]];
                    strArr4[lIlllIIl[0]] = lIllIlll[lIlllIIl[78]];
                    if (lIIllIllllI(Bank.getFirst(strArr4).getQuantity(), lIlllIIl[11])) {
                        ag();
                        System.out.println(lIllIlll[lIlllIIl[79]]);
                        bz = lIlllIIl[1];
                        return;
                    }
                }
                String[] strArr5 = new String[lIlllIIl[1]];
                strArr5[lIlllIIl[0]] = lIllIlll[lIlllIIl[80]];
                if (lIIllIlllIl(Bank.contains(strArr5) ? 1 : 0)) {
                    String[] strArr6 = new String[lIlllIIl[1]];
                    strArr6[lIlllIIl[0]] = lIllIlll[lIlllIIl[81]];
                    if (lIIllIllllI(Bank.getFirst(strArr6).getQuantity(), lIlllIIl[11])) {
                        ag();
                        System.out.println(lIllIlll[lIlllIIl[82]]);
                        bz = lIlllIIl[1];
                        return;
                    }
                }
                int[] iArr = new int[lIlllIIl[19]];
                iArr[lIlllIIl[0]] = lIlllIIl[20];
                iArr[lIlllIIl[1]] = lIlllIIl[21];
                iArr[lIlllIIl[3]] = lIlllIIl[22];
                iArr[lIlllIIl[4]] = lIlllIIl[23];
                iArr[lIlllIIl[6]] = lIlllIIl[24];
                iArr[lIlllIIl[9]] = lIlllIIl[7];
                iArr[lIlllIIl[12]] = lIlllIIl[17];
                iArr[lIlllIIl[14]] = lIlllIIl[25];
                iArr[lIlllIIl[16]] = lIlllIIl[10];
                iArr[lIlllIIl[18]] = lIlllIIl[15];
                iArr[lIlllIIl[8]] = lIlllIIl[13];
                if (lIIllIlllll(C0004e.b(iArr) ? 1 : 0)) {
                    ag();
                    System.out.println(lIllIlll[lIlllIIl[83]]);
                    bz = lIlllIIl[1];
                    return;
                }
                while (lIIllIlllll(u.aV() ? 1 : 0)) {
                    u.aT();
                    Time.sleepTicks(lIlllIIl[1]);
                    "".length();
                    "".length();
                    if ("   ".length() == ((167 ^ 162) & ((182 ^ 179) ^ (-1)))) {
                        return;
                    }
                }
                if (lIIllIlllll(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepTicks(lIlllIIl[6]);
                    "".length();
                }
                int[] iArr2 = new int[lIlllIIl[1]];
                iArr2[lIlllIIl[0]] = lIlllIIl[22];
                if (lIIllIlllIl(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIlllIIl[1]];
                    iArr3[lIlllIIl[0]] = lIlllIIl[22];
                    if (lIIllIllllI(Inventory.getCount(iArr3), lIlllIIl[1])) {
                        Bank.withdraw(lIlllIIl[22], lIlllIIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlllIIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr4 = new int[lIlllIIl[1]];
                            iArr4[lIlllIIl[0]] = lIlllIIl[22];
                            if (lIIlllIIIIl(Inventory.getCount(iArr4))) {
                                ?? r0 = lIlllIIl[1];
                                "".length();
                                return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIlllIIl[0];
                        }, lIlllIIl[5]);
                        "".length();
                    }
                }
                int[] iArr4 = new int[lIlllIIl[1]];
                iArr4[lIlllIIl[0]] = lIlllIIl[23];
                if (lIIllIlllIl(Bank.contains(iArr4) ? 1 : 0)) {
                    int[] iArr5 = new int[lIlllIIl[1]];
                    iArr5[lIlllIIl[0]] = lIlllIIl[23];
                    if (lIIllIllllI(Inventory.getCount(iArr5), lIlllIIl[1])) {
                        Bank.withdraw(lIlllIIl[23], lIlllIIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlllIIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr6 = new int[lIlllIIl[1]];
                            iArr6[lIlllIIl[0]] = lIlllIIl[23];
                            if (lIIlllIIIIl(Inventory.getCount(iArr6))) {
                                ?? r0 = lIlllIIl[1];
                                "".length();
                                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIlllIIl[0];
                        }, lIlllIIl[5]);
                        "".length();
                    }
                }
                int[] iArr6 = new int[lIlllIIl[1]];
                iArr6[lIlllIIl[0]] = lIlllIIl[21];
                if (lIIllIlllIl(Bank.contains(iArr6) ? 1 : 0)) {
                    int[] iArr7 = new int[lIlllIIl[1]];
                    iArr7[lIlllIIl[0]] = lIlllIIl[21];
                    if (lIIllIllllI(Inventory.getCount(iArr7), lIlllIIl[1])) {
                        Bank.withdraw(lIlllIIl[21], lIlllIIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlllIIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr8 = new int[lIlllIIl[1]];
                            iArr8[lIlllIIl[0]] = lIlllIIl[21];
                            if (lIIlllIIIIl(Inventory.getCount(iArr8))) {
                                ?? r0 = lIlllIIl[1];
                                "".length();
                                return (-((209 ^ 150) ^ (24 ^ 91))) >= 0 ? ((((54 + 98) - 142) + 240) ^ (((129 + 165) - 139) + 37)) & (((157 ^ 165) ^ "  ".length()) ^ (-" ".length())) : r0;
                            }
                            return lIlllIIl[0];
                        }, lIlllIIl[5]);
                        "".length();
                    }
                }
                int[] iArr8 = new int[lIlllIIl[1]];
                iArr8[lIlllIIl[0]] = lIlllIIl[24];
                if (lIIllIlllIl(Bank.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[lIlllIIl[1]];
                    iArr9[lIlllIIl[0]] = lIlllIIl[24];
                    if (lIIllIllllI(Inventory.getCount(iArr9), lIlllIIl[1])) {
                        Bank.withdraw(lIlllIIl[24], lIlllIIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlllIIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr10 = new int[lIlllIIl[1]];
                            iArr10[lIlllIIl[0]] = lIlllIIl[24];
                            if (lIIlllIIIIl(Inventory.getCount(iArr10))) {
                                ?? r0 = lIlllIIl[1];
                                "".length();
                                return (-"   ".length()) >= 0 ? ((8 ^ 80) ^ (120 ^ 28)) & (((((94 + 104) - 143) + 72) ^ (58 ^ 121)) ^ (-" ".length())) : r0;
                            }
                            return lIlllIIl[0];
                        }, lIlllIIl[5]);
                        "".length();
                    }
                }
                int[] iArr10 = new int[lIlllIIl[1]];
                iArr10[lIlllIIl[0]] = lIlllIIl[7];
                if (lIIllIlllIl(Bank.contains(iArr10) ? 1 : 0)) {
                    int[] iArr11 = new int[lIlllIIl[1]];
                    iArr11[lIlllIIl[0]] = lIlllIIl[7];
                    if (lIIllIllllI(Inventory.getCount(iArr11), lIlllIIl[1])) {
                        Bank.withdraw(lIlllIIl[7], lIlllIIl[9], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlllIIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr12 = new int[lIlllIIl[1]];
                            iArr12[lIlllIIl[0]] = lIlllIIl[7];
                            if (lIIlllIIIIl(Inventory.getCount(iArr12))) {
                                ?? r0 = lIlllIIl[1];
                                "".length();
                                return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIlllIIl[0];
                        }, lIlllIIl[5]);
                        "".length();
                    }
                }
                int[] iArr12 = new int[lIlllIIl[1]];
                iArr12[lIlllIIl[0]] = lIlllIIl[17];
                if (lIIllIlllIl(Bank.contains(iArr12) ? 1 : 0)) {
                    int[] iArr13 = new int[lIlllIIl[1]];
                    iArr13[lIlllIIl[0]] = lIlllIIl[17];
                    if (lIIllIllllI(Inventory.getCount(iArr13), lIlllIIl[1])) {
                        Bank.withdraw(lIlllIIl[17], lIlllIIl[6], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlllIIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr14 = new int[lIlllIIl[1]];
                            iArr14[lIlllIIl[0]] = lIlllIIl[17];
                            if (lIIlllIIIIl(Inventory.getCount(iArr14))) {
                                ?? r0 = lIlllIIl[1];
                                "".length();
                                return " ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIlllIIl[0];
                        }, lIlllIIl[5]);
                        "".length();
                    }
                }
                int[] iArr14 = new int[lIlllIIl[1]];
                iArr14[lIlllIIl[0]] = lIlllIIl[10];
                if (lIIllIlllIl(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lIlllIIl[1]];
                    iArr15[lIlllIIl[0]] = lIlllIIl[10];
                    if (lIIllIllllI(Inventory.getCount(iArr15), lIlllIIl[1])) {
                        Bank.withdraw(lIlllIIl[10], lIlllIIl[26], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlllIIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr16 = new int[lIlllIIl[1]];
                            iArr16[lIlllIIl[0]] = lIlllIIl[10];
                            if (lIIlllIIIIl(Inventory.getCount(iArr16))) {
                                ?? r0 = lIlllIIl[1];
                                "".length();
                                return "   ".length() < "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIlllIIl[0];
                        }, lIlllIIl[5]);
                        "".length();
                    }
                }
                int[] iArr16 = new int[lIlllIIl[1]];
                iArr16[lIlllIIl[0]] = lIlllIIl[15];
                if (lIIllIlllIl(Bank.contains(iArr16) ? 1 : 0)) {
                    int[] iArr17 = new int[lIlllIIl[1]];
                    iArr17[lIlllIIl[0]] = lIlllIIl[15];
                    if (lIIllIllllI(Inventory.getCount(iArr17), lIlllIIl[1])) {
                        Bank.withdraw(lIlllIIl[15], lIlllIIl[26], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlllIIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr18 = new int[lIlllIIl[1]];
                            iArr18[lIlllIIl[0]] = lIlllIIl[15];
                            if (lIIlllIIIIl(Inventory.getCount(iArr18))) {
                                ?? r0 = lIlllIIl[1];
                                "".length();
                                return " ".length() > ((((21 + 86) - 63) + 152) ^ (((64 + 105) - 100) + 123)) ? ((3 ^ 95) ^ (67 ^ 76)) & (((87 ^ 47) ^ (31 ^ 52)) ^ (-" ".length())) : r0;
                            }
                            return lIlllIIl[0];
                        }, lIlllIIl[5]);
                        "".length();
                    }
                }
                int[] iArr18 = new int[lIlllIIl[1]];
                iArr18[lIlllIIl[0]] = lIlllIIl[13];
                if (lIIllIlllIl(Bank.contains(iArr18) ? 1 : 0)) {
                    int[] iArr19 = new int[lIlllIIl[1]];
                    iArr19[lIlllIIl[0]] = lIlllIIl[13];
                    if (lIIllIllllI(Inventory.getCount(iArr19), lIlllIIl[1])) {
                        Bank.withdraw(lIlllIIl[13], lIlllIIl[26], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlllIIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr20 = new int[lIlllIIl[1]];
                            iArr20[lIlllIIl[0]] = lIlllIIl[13];
                            if (lIIlllIIIIl(Inventory.getCount(iArr20))) {
                                ?? r0 = lIlllIIl[1];
                                "".length();
                                return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIlllIIl[0];
                        }, lIlllIIl[5]);
                        "".length();
                    }
                }
                int[] iArr20 = new int[lIlllIIl[1]];
                iArr20[lIlllIIl[0]] = lIlllIIl[27];
                if (lIIllIlllIl(Bank.contains(iArr20) ? 1 : 0)) {
                    int[] iArr21 = new int[lIlllIIl[1]];
                    iArr21[lIlllIIl[0]] = lIlllIIl[27];
                    if (lIIllIlllll(Inventory.contains(iArr21) ? 1 : 0)) {
                        Bank.withdraw(lIlllIIl[27], lIlllIIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlllIIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr22 = new int[lIlllIIl[1]];
                            iArr22[lIlllIIl[0]] = lIlllIIl[27];
                            return Inventory.contains(iArr22);
                        }, lIlllIIl[5]);
                        "".length();
                    }
                }
                int[] iArr22 = new int[lIlllIIl[1]];
                iArr22[lIlllIIl[0]] = lIlllIIl[25];
                if (lIIllIlllIl(Bank.contains(iArr22) ? 1 : 0)) {
                    int[] iArr23 = new int[lIlllIIl[1]];
                    iArr23[lIlllIIl[0]] = lIlllIIl[25];
                    if (lIIllIllllI(Inventory.getCount(iArr23), lIlllIIl[1])) {
                        Bank.withdrawAll(lIlllIIl[25], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlllIIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr24 = new int[lIlllIIl[1]];
                            iArr24[lIlllIIl[0]] = lIlllIIl[25];
                            if (lIIlllIIIIl(Inventory.getCount(iArr24))) {
                                ?? r0 = lIlllIIl[1];
                                "".length();
                                return ((94 ^ 26) & ((206 ^ 138) ^ (-1))) >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIlllIIl[0];
                        }, lIlllIIl[5]);
                        "".length();
                    }
                }
            }
        }
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public int U() {
        try {
            bI();
            "".length();
            if ("  ".length() <= 0) {
                return (110 ^ 70) & ((169 ^ 129) ^ (-1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lIlllIIl[42];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean T() {
        return lIlllIIl[0];
    }

    private static boolean lIIlllIIIIl(int i) {
        return i > 0;
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public String V() {
        return lIllIlll[lIlllIIl[84]];
    }

    private static String lIIllIIllII(String lIlIlllIllIlIIl, String lIlIlllIllIIllI) {
        try {
            SecretKeySpec lIlIlllIllIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlllIllIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlllIllIlIll = Cipher.getInstance("Blowfish");
            lIlIlllIllIlIll.init(lIlllIIl[3], lIlIlllIllIllII);
            return new String(lIlIlllIllIlIll.doFinal(Base64.getDecoder().decode(lIlIlllIllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlllIllIlIlI) {
            lIlIlllIllIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllIIIlI(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean W() {
        if (lIIlllIIlIl(C0004e.j(lIlllIIl[2]), lIlllIIl[3])) {
            ?? r0 = lIlllIIl[1];
            "".length();
            return 0 != 0 ? ((((76 + 211) - 215) + 147) ^ (((181 + 126) - 249) + 139)) & (((((167 + 45) - 153) + 126) ^ (((2 + 25) - 0) + 140)) ^ (-" ".length())) : r0;
        }
        return lIlllIIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v366, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v375, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v384, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v393, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v402, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v411, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v437, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    public static void bI() {
        if (lIIllIlllIl(bz ? 1 : 0)) {
            AccBuilderBarrows.c = lIllIlll[lIlllIIl[0]];
            C0001b.a(bB);
            if (lIIllIllllI(bB.size(), lIlllIIl[1])) {
                System.out.println(lIllIlll[lIlllIIl[1]]);
                bz = lIlllIIl[0];
            }
        }
        if (lIIllIlllll(bz ? 1 : 0)) {
            if (lIIllIlllll(C0004e.j(lIlllIIl[2]))) {
                if (lIIllIlllll(bm() ? 1 : 0)) {
                    BankLocation nearest = BankLocation.getNearest();
                    if (lIIlllIIIII(nearest) && lIIllIlllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = lIllIlll[lIlllIIl[3]];
                        C0000a.a(nearest);
                    }
                    if (lIIlllIIIII(nearest) && lIIllIlllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lIIllIlllll(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderBarrows.c = lIllIlll[lIlllIIl[4]];
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, lIlllIIl[5]);
                            "".length();
                        }
                        if (lIIllIlllIl(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderBarrows.c = lIllIlll[lIlllIIl[6]];
                            if (lIIlllIIIIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(lIlllIIl[4]);
                                "".length();
                            }
                            if (lIIlllIIIIl(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(lIlllIIl[3]);
                                "".length();
                            }
                            int[] iArr = new int[lIlllIIl[1]];
                            iArr[lIlllIIl[0]] = lIlllIIl[7];
                            if (lIIllIlllIl(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIlllIIl[1]];
                                iArr2[lIlllIIl[0]] = lIlllIIl[7];
                                if (lIIllIllllI(Bank.getFirst(iArr2).getQuantity(), lIlllIIl[8])) {
                                    ag();
                                    System.out.println(lIllIlll[lIlllIIl[9]]);
                                    bz = lIlllIIl[1];
                                    return;
                                }
                            }
                            int[] iArr3 = new int[lIlllIIl[1]];
                            iArr3[lIlllIIl[0]] = lIlllIIl[10];
                            if (lIIllIlllIl(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIlllIIl[1]];
                                iArr4[lIlllIIl[0]] = lIlllIIl[10];
                                if (lIIllIllllI(Bank.getFirst(iArr4).getQuantity(), lIlllIIl[11])) {
                                    ag();
                                    System.out.println(lIllIlll[lIlllIIl[12]]);
                                    bz = lIlllIIl[1];
                                    return;
                                }
                            }
                            int[] iArr5 = new int[lIlllIIl[1]];
                            iArr5[lIlllIIl[0]] = lIlllIIl[13];
                            if (lIIllIlllIl(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIlllIIl[1]];
                                iArr6[lIlllIIl[0]] = lIlllIIl[13];
                                if (lIIllIllllI(Bank.getFirst(iArr6).getQuantity(), lIlllIIl[11])) {
                                    ag();
                                    System.out.println(lIllIlll[lIlllIIl[14]]);
                                    bz = lIlllIIl[1];
                                    return;
                                }
                            }
                            int[] iArr7 = new int[lIlllIIl[1]];
                            iArr7[lIlllIIl[0]] = lIlllIIl[15];
                            if (lIIllIlllIl(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[lIlllIIl[1]];
                                iArr8[lIlllIIl[0]] = lIlllIIl[15];
                                if (lIIllIllllI(Bank.getFirst(iArr8).getQuantity(), lIlllIIl[11])) {
                                    ag();
                                    System.out.println(lIllIlll[lIlllIIl[16]]);
                                    bz = lIlllIIl[1];
                                    return;
                                }
                            }
                            int[] iArr9 = new int[lIlllIIl[1]];
                            iArr9[lIlllIIl[0]] = lIlllIIl[17];
                            if (lIIllIlllIl(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[lIlllIIl[1]];
                                iArr10[lIlllIIl[0]] = lIlllIIl[17];
                                if (lIIllIllllI(Bank.getFirst(iArr10).getQuantity(), lIlllIIl[9])) {
                                    ag();
                                    System.out.println(lIllIlll[lIlllIIl[18]]);
                                    bz = lIlllIIl[1];
                                    return;
                                }
                            }
                            int[] iArr11 = new int[lIlllIIl[19]];
                            iArr11[lIlllIIl[0]] = lIlllIIl[20];
                            iArr11[lIlllIIl[1]] = lIlllIIl[21];
                            iArr11[lIlllIIl[3]] = lIlllIIl[22];
                            iArr11[lIlllIIl[4]] = lIlllIIl[23];
                            iArr11[lIlllIIl[6]] = lIlllIIl[24];
                            iArr11[lIlllIIl[9]] = lIlllIIl[7];
                            iArr11[lIlllIIl[12]] = lIlllIIl[17];
                            iArr11[lIlllIIl[14]] = lIlllIIl[25];
                            iArr11[lIlllIIl[16]] = lIlllIIl[10];
                            iArr11[lIlllIIl[18]] = lIlllIIl[15];
                            iArr11[lIlllIIl[8]] = lIlllIIl[13];
                            if (lIIllIlllll(C0004e.b(iArr11) ? 1 : 0)) {
                                ag();
                                System.out.println(lIllIlll[lIlllIIl[8]]);
                                bz = lIlllIIl[1];
                                return;
                            }
                            while (lIIllIlllll(u.aV() ? 1 : 0)) {
                                u.aT();
                                Time.sleepTicks(lIlllIIl[1]);
                                "".length();
                                "".length();
                                if (" ".length() < 0) {
                                    return;
                                }
                            }
                            if (lIIllIlllll(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                                Time.sleepTicks(lIlllIIl[6]);
                                "".length();
                            }
                            int[] iArr12 = new int[lIlllIIl[1]];
                            iArr12[lIlllIIl[0]] = lIlllIIl[22];
                            if (lIIllIlllIl(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIlllIIl[1]];
                                iArr13[lIlllIIl[0]] = lIlllIIl[22];
                                if (lIIllIllllI(Inventory.getCount(iArr13), lIlllIIl[1])) {
                                    Bank.withdraw(lIlllIIl[22], lIlllIIl[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlllIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr14 = new int[lIlllIIl[1]];
                                        iArr14[lIlllIIl[0]] = lIlllIIl[22];
                                        if (lIIlllIIIIl(Inventory.getCount(iArr14))) {
                                            ?? r0 = lIlllIIl[1];
                                            "".length();
                                            return (-" ".length()) > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIlllIIl[0];
                                    }, lIlllIIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr14 = new int[lIlllIIl[1]];
                            iArr14[lIlllIIl[0]] = lIlllIIl[23];
                            if (lIIllIlllIl(Bank.contains(iArr14) ? 1 : 0)) {
                                int[] iArr15 = new int[lIlllIIl[1]];
                                iArr15[lIlllIIl[0]] = lIlllIIl[23];
                                if (lIIllIllllI(Inventory.getCount(iArr15), lIlllIIl[1])) {
                                    Bank.withdraw(lIlllIIl[23], lIlllIIl[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlllIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr16 = new int[lIlllIIl[1]];
                                        iArr16[lIlllIIl[0]] = lIlllIIl[23];
                                        if (lIIlllIIIIl(Inventory.getCount(iArr16))) {
                                            ?? r0 = lIlllIIl[1];
                                            "".length();
                                            return "   ".length() < 0 ? ((((57 + 118) - 48) + 1) ^ (((40 + 82) - (-49)) + 19)) & (((53 ^ 98) ^ (111 ^ 6)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlllIIl[0];
                                    }, lIlllIIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr16 = new int[lIlllIIl[1]];
                            iArr16[lIlllIIl[0]] = lIlllIIl[21];
                            if (lIIllIlllIl(Bank.contains(iArr16) ? 1 : 0)) {
                                int[] iArr17 = new int[lIlllIIl[1]];
                                iArr17[lIlllIIl[0]] = lIlllIIl[21];
                                if (lIIllIllllI(Inventory.getCount(iArr17), lIlllIIl[1])) {
                                    Bank.withdraw(lIlllIIl[21], lIlllIIl[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlllIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr18 = new int[lIlllIIl[1]];
                                        iArr18[lIlllIIl[0]] = lIlllIIl[21];
                                        if (lIIlllIIIIl(Inventory.getCount(iArr18))) {
                                            ?? r0 = lIlllIIl[1];
                                            "".length();
                                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIlllIIl[0];
                                    }, lIlllIIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr18 = new int[lIlllIIl[1]];
                            iArr18[lIlllIIl[0]] = lIlllIIl[24];
                            if (lIIllIlllIl(Bank.contains(iArr18) ? 1 : 0)) {
                                int[] iArr19 = new int[lIlllIIl[1]];
                                iArr19[lIlllIIl[0]] = lIlllIIl[24];
                                if (lIIllIllllI(Inventory.getCount(iArr19), lIlllIIl[1])) {
                                    Bank.withdraw(lIlllIIl[24], lIlllIIl[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlllIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr20 = new int[lIlllIIl[1]];
                                        iArr20[lIlllIIl[0]] = lIlllIIl[24];
                                        if (lIIlllIIIIl(Inventory.getCount(iArr20))) {
                                            ?? r0 = lIlllIIl[1];
                                            "".length();
                                            return "  ".length() <= ((65 ^ 72) & ((16 ^ 25) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIlllIIl[0];
                                    }, lIlllIIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr20 = new int[lIlllIIl[1]];
                            iArr20[lIlllIIl[0]] = lIlllIIl[7];
                            if (lIIllIlllIl(Bank.contains(iArr20) ? 1 : 0)) {
                                int[] iArr21 = new int[lIlllIIl[1]];
                                iArr21[lIlllIIl[0]] = lIlllIIl[7];
                                if (lIIllIllllI(Inventory.getCount(iArr21), lIlllIIl[1])) {
                                    Bank.withdraw(lIlllIIl[7], lIlllIIl[9], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlllIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr22 = new int[lIlllIIl[1]];
                                        iArr22[lIlllIIl[0]] = lIlllIIl[7];
                                        if (lIIlllIIIIl(Inventory.getCount(iArr22))) {
                                            ?? r0 = lIlllIIl[1];
                                            "".length();
                                            return "   ".length() != "   ".length() ? ((192 ^ 188) ^ (54 ^ 91)) & (((136 ^ 196) ^ (221 ^ 128)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlllIIl[0];
                                    }, lIlllIIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr22 = new int[lIlllIIl[1]];
                            iArr22[lIlllIIl[0]] = lIlllIIl[17];
                            if (lIIllIlllIl(Bank.contains(iArr22) ? 1 : 0)) {
                                int[] iArr23 = new int[lIlllIIl[1]];
                                iArr23[lIlllIIl[0]] = lIlllIIl[17];
                                if (lIIllIllllI(Inventory.getCount(iArr23), lIlllIIl[1])) {
                                    Bank.withdraw(lIlllIIl[17], lIlllIIl[6], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlllIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr24 = new int[lIlllIIl[1]];
                                        iArr24[lIlllIIl[0]] = lIlllIIl[17];
                                        if (lIIlllIIIIl(Inventory.getCount(iArr24))) {
                                            ?? r0 = lIlllIIl[1];
                                            "".length();
                                            return (-((((51 + 98) - 105) + 89) ^ (((8 + 44) - (-12)) + 64))) >= 0 ? ((((115 + 60) - 85) + 118) ^ (((146 + 80) - 182) + 106)) & (((128 ^ 143) ^ (201 ^ 128)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlllIIl[0];
                                    }, lIlllIIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr24 = new int[lIlllIIl[1]];
                            iArr24[lIlllIIl[0]] = lIlllIIl[10];
                            if (lIIllIlllIl(Bank.contains(iArr24) ? 1 : 0)) {
                                int[] iArr25 = new int[lIlllIIl[1]];
                                iArr25[lIlllIIl[0]] = lIlllIIl[10];
                                if (lIIllIllllI(Inventory.getCount(iArr25), lIlllIIl[1])) {
                                    Bank.withdraw(lIlllIIl[10], lIlllIIl[26], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlllIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr26 = new int[lIlllIIl[1]];
                                        iArr26[lIlllIIl[0]] = lIlllIIl[10];
                                        if (lIIlllIIIIl(Inventory.getCount(iArr26))) {
                                            ?? r0 = lIlllIIl[1];
                                            "".length();
                                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIlllIIl[0];
                                    }, lIlllIIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr26 = new int[lIlllIIl[1]];
                            iArr26[lIlllIIl[0]] = lIlllIIl[15];
                            if (lIIllIlllIl(Bank.contains(iArr26) ? 1 : 0)) {
                                int[] iArr27 = new int[lIlllIIl[1]];
                                iArr27[lIlllIIl[0]] = lIlllIIl[15];
                                if (lIIllIllllI(Inventory.getCount(iArr27), lIlllIIl[1])) {
                                    Bank.withdraw(lIlllIIl[15], lIlllIIl[26], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlllIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr28 = new int[lIlllIIl[1]];
                                        iArr28[lIlllIIl[0]] = lIlllIIl[15];
                                        if (lIIlllIIIIl(Inventory.getCount(iArr28))) {
                                            ?? r0 = lIlllIIl[1];
                                            "".length();
                                            return 0 != 0 ? ((87 ^ 125) ^ (78 ^ 112)) & (((((124 + 157) - 188) + 88) ^ (((18 + 99) - 76) + 120)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlllIIl[0];
                                    }, lIlllIIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr28 = new int[lIlllIIl[1]];
                            iArr28[lIlllIIl[0]] = lIlllIIl[13];
                            if (lIIllIlllIl(Bank.contains(iArr28) ? 1 : 0)) {
                                int[] iArr29 = new int[lIlllIIl[1]];
                                iArr29[lIlllIIl[0]] = lIlllIIl[13];
                                if (lIIllIllllI(Inventory.getCount(iArr29), lIlllIIl[1])) {
                                    Bank.withdraw(lIlllIIl[13], lIlllIIl[26], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlllIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr30 = new int[lIlllIIl[1]];
                                        iArr30[lIlllIIl[0]] = lIlllIIl[13];
                                        if (lIIlllIIIIl(Inventory.getCount(iArr30))) {
                                            ?? r0 = lIlllIIl[1];
                                            "".length();
                                            return 0 != 0 ? ((7 ^ 80) ^ (136 ^ 132)) & (((166 ^ 195) ^ (144 ^ 174)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlllIIl[0];
                                    }, lIlllIIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr30 = new int[lIlllIIl[1]];
                            iArr30[lIlllIIl[0]] = lIlllIIl[27];
                            if (lIIllIlllIl(Bank.contains(iArr30) ? 1 : 0)) {
                                int[] iArr31 = new int[lIlllIIl[1]];
                                iArr31[lIlllIIl[0]] = lIlllIIl[27];
                                if (lIIllIlllll(Inventory.contains(iArr31) ? 1 : 0)) {
                                    Bank.withdraw(lIlllIIl[27], lIlllIIl[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlllIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr32 = new int[lIlllIIl[1]];
                                        iArr32[lIlllIIl[0]] = lIlllIIl[27];
                                        return Inventory.contains(iArr32);
                                    }, lIlllIIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr32 = new int[lIlllIIl[1]];
                            iArr32[lIlllIIl[0]] = lIlllIIl[25];
                            if (lIIllIlllIl(Bank.contains(iArr32) ? 1 : 0)) {
                                int[] iArr33 = new int[lIlllIIl[1]];
                                iArr33[lIlllIIl[0]] = lIlllIIl[25];
                                if (lIIllIllllI(Inventory.getCount(iArr33), lIlllIIl[1])) {
                                    Bank.withdrawAll(lIlllIIl[25], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlllIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr34 = new int[lIlllIIl[1]];
                                        iArr34[lIlllIIl[0]] = lIlllIIl[25];
                                        if (lIIlllIIIIl(Inventory.getCount(iArr34))) {
                                            ?? r0 = lIlllIIl[1];
                                            "".length();
                                            return ((180 ^ 142) & ((135 ^ 189) ^ (-1))) > ((214 ^ 198) & ((34 ^ 50) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIlllIIl[0];
                                    }, lIlllIIl[5]);
                                    "".length();
                                }
                            }
                        }
                    }
                }
                if (lIIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(hW), lIlllIIl[6]) && lIIlllIIIll(Players.getLocal().getWorldLocation().getPlane(), lIlllIIl[3]) && lIIllIlllIl(bm() ? 1 : 0)) {
                    if (lIIllIlllIl(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        Time.sleepTicks(lIlllIIl[6]);
                        "".length();
                    }
                    AccBuilderBarrows.c = lIllIlll[lIlllIIl[19]];
                    if (lIIllIlllll(Bank.isOpen() ? 1 : 0)) {
                        if (lIIllIllllI(bZ, lIlllIIl[1])) {
                            C0004e.w();
                            bZ += lIlllIIl[1];
                        }
                        if (lIIllIlllIl(new WorldArea(lIlllIIl[28], lIlllIIl[29], lIlllIIl[30], lIlllIIl[31], lIlllIIl[3]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr = new String[lIlllIIl[1]];
                            strArr[lIlllIIl[0]] = lIllIlll[lIlllIIl[32]];
                            TileObjects.getNearest(strArr).interact(lIllIlll[lIlllIIl[33]]);
                            Time.sleepTicks(C0004e.c(lIlllIIl[12], lIlllIIl[16]));
                            "".length();
                        }
                        Movement.walkTo(hW);
                        "".length();
                        Time.sleepTicks(lIlllIIl[3]);
                        "".length();
                    }
                }
                if (lIIlllIIlII(Players.getLocal().getWorldLocation().distanceTo(hW), lIlllIIl[12])) {
                    AccBuilderBarrows.c = lIllIlll[lIlllIIl[34]];
                    ci = lIlllIIl[0];
                    C0006g.a(hI, gx);
                    if (lIIllIlllIl(C0006g.L() ? 1 : 0)) {
                        C0006g.a(gx);
                    }
                }
            }
            if (lIIlllIIIIl(C0004e.j(lIlllIIl[2])) && lIIllIllllI(C0004e.j(lIlllIIl[2]), lIlllIIl[3])) {
                if (lIIllIlllll(bm() ? 1 : 0)) {
                    bJ();
                }
                if (lIIllIlllIl(bm() ? 1 : 0)) {
                    if (lIIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(hW), lIlllIIl[12])) {
                        AccBuilderBarrows.c = lIllIlll[lIlllIIl[31]];
                        if (lIIllIlllIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo(hW);
                        "".length();
                        Time.sleepTicks(lIlllIIl[1]);
                        "".length();
                    }
                    if (lIIlllIIlII(Players.getLocal().getWorldLocation().distanceTo(hW), lIlllIIl[12])) {
                        AccBuilderBarrows.c = lIllIlll[lIlllIIl[35]];
                        if (lIIllIllllI(ci, lIlllIIl[1])) {
                            Q.mv += lIlllIIl[1];
                            Q.o(AccBuilderBarrows.m);
                            ci += lIlllIIl[1];
                            Q.mv = lIlllIIl[0];
                            cj = lIlllIIl[0];
                        }
                        C0006g.a(hI, gx);
                        if (lIIllIlllIl(C0006g.L() ? 1 : 0)) {
                            C0006g.a(gx);
                        }
                    }
                }
            }
            System.out.println("Setting: " + C0004e.j(lIlllIIl[2]));
            C0006g.a(new String[lIlllIIl[0]]);
        }
    }

    private static boolean lIIlllIIlII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIllIlllll(int i) {
        return i == 0;
    }

    private static boolean lIIlllIIIll(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x02d9, code lost:
        if (lIIllIllllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C.lIlllIIl[9]) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x03bb, code lost:
        if (lIIllIllllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C.lIlllIIl[30]) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x04aa, code lost:
        if (lIIllIllllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C.lIlllIIl[30]) != false) goto L86;
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
    private static void ag() {
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
        int[] iArr13 = new int[lIlllIIl[1]];
        iArr13[lIlllIIl[0]] = lIlllIIl[21];
        if (lIIllIlllll(Bank.contains(iArr13) ? 1 : 0)) {
            System.out.println(lIllIlll[lIlllIIl[36]]);
            bB.add(new C0003d(lIlllIIl[21], lIlllIIl[1], lIlllIIl[37]));
            "".length();
        }
        int[] iArr14 = new int[lIlllIIl[1]];
        iArr14[lIlllIIl[0]] = lIlllIIl[22];
        if (lIIllIlllll(Bank.contains(iArr14) ? 1 : 0)) {
            System.out.println(lIllIlll[lIlllIIl[38]]);
            bB.add(new C0003d(lIlllIIl[22], lIlllIIl[1], lIlllIIl[39]));
            "".length();
        }
        int[] iArr15 = new int[lIlllIIl[1]];
        iArr15[lIlllIIl[0]] = lIlllIIl[23];
        if (lIIllIlllll(Bank.contains(iArr15) ? 1 : 0)) {
            System.out.println(lIllIlll[lIlllIIl[40]]);
            bB.add(new C0003d(lIlllIIl[23], lIlllIIl[1], lIlllIIl[39]));
            "".length();
        }
        int[] iArr16 = new int[lIlllIIl[1]];
        iArr16[lIlllIIl[0]] = lIlllIIl[24];
        if (lIIllIlllll(Bank.contains(iArr16) ? 1 : 0)) {
            System.out.println(lIllIlll[lIlllIIl[30]]);
            bB.add(new C0003d(lIlllIIl[24], lIlllIIl[1], lIlllIIl[39]));
            "".length();
        }
        int[] iArr17 = new int[lIlllIIl[1]];
        iArr17[lIlllIIl[0]] = lIlllIIl[25];
        if (lIIllIlllll(Bank.contains(iArr17) ? 1 : 0)) {
            System.out.println(lIllIlll[lIlllIIl[41]]);
            bB.add(new C0003d(lIlllIIl[25], lIlllIIl[42], lIlllIIl[43]));
            "".length();
        }
        int[] iArr18 = new int[lIlllIIl[1]];
        iArr18[lIlllIIl[0]] = lIlllIIl[25];
        if (lIIllIlllIl(Bank.contains(iArr18) ? 1 : 0)) {
            int[] iArr19 = new int[lIlllIIl[1]];
            iArr19[lIlllIIl[0]] = lIlllIIl[25];
            if (lIIllIllllI(Bank.getFirst(iArr19).getQuantity(), lIlllIIl[30])) {
                System.out.println(lIllIlll[lIlllIIl[44]]);
                bB.add(new C0003d(lIlllIIl[25], lIlllIIl[45], lIlllIIl[43]));
                "".length();
            }
        }
        int[] iArr20 = new int[lIlllIIl[1]];
        iArr20[lIlllIIl[0]] = lIlllIIl[17];
        if (lIIllIlllll(Bank.contains(iArr20) ? 1 : 0)) {
            System.out.println(lIllIlll[lIlllIIl[46]]);
            bB.add(new C0003d(lIlllIIl[17], lIlllIIl[9], lIlllIIl[47]));
            "".length();
        }
        int[] iArr21 = new int[lIlllIIl[1]];
        iArr21[lIlllIIl[0]] = lIlllIIl[17];
        if (lIIllIlllIl(Bank.contains(iArr21) ? 1 : 0)) {
            int[] iArr22 = new int[lIlllIIl[1]];
            iArr22[lIlllIIl[0]] = lIlllIIl[17];
            if (lIIllIlllIl(Bank.contains(iArr22) ? 1 : 0)) {
                int[] iArr23 = new int[lIlllIIl[1]];
                iArr23[lIlllIIl[0]] = lIlllIIl[17];
            }
            if (lIIllIlllll(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIllIlll[lIlllIIl[85]]);
            }) ? 1 : 0)) {
                System.out.println(lIllIlll[lIlllIIl[49]]);
                bB.add(new C0003d(lIlllIIl[50], lIlllIIl[38], lIlllIIl[51]));
                "".length();
            }
            iArr = new int[lIlllIIl[1]];
            iArr[lIlllIIl[0]] = lIlllIIl[20];
            if (lIIllIlllIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr24 = new int[lIlllIIl[1]];
                iArr24[lIlllIIl[0]] = lIlllIIl[20];
                if (lIIllIlllIl(Bank.contains(iArr24) ? 1 : 0)) {
                    int[] iArr25 = new int[lIlllIIl[1]];
                    iArr25[lIlllIIl[0]] = lIlllIIl[20];
                }
                iArr2 = new int[lIlllIIl[1]];
                iArr2[lIlllIIl[0]] = lIlllIIl[7];
                if (lIIllIlllll(Bank.contains(iArr2) ? 1 : 0)) {
                    System.out.println(lIllIlll[lIlllIIl[54]]);
                    bB.add(new C0003d(lIlllIIl[7], lIlllIIl[30], lIlllIIl[53]));
                    "".length();
                }
                iArr3 = new int[lIlllIIl[1]];
                iArr3[lIlllIIl[0]] = lIlllIIl[7];
                if (lIIllIlllIl(Bank.contains(iArr3) ? 1 : 0)) {
                    int[] iArr26 = new int[lIlllIIl[1]];
                    iArr26[lIlllIIl[0]] = lIlllIIl[7];
                    if (lIIllIlllIl(Bank.contains(iArr26) ? 1 : 0)) {
                        int[] iArr27 = new int[lIlllIIl[1]];
                        iArr27[lIlllIIl[0]] = lIlllIIl[7];
                    }
                    iArr4 = new int[lIlllIIl[1]];
                    iArr4[lIlllIIl[0]] = lIlllIIl[27];
                    if (lIIllIlllll(Bank.contains(iArr4) ? 1 : 0)) {
                        System.out.println(lIllIlll[lIlllIIl[56]]);
                        bB.add(new C0003d(lIlllIIl[27], lIlllIIl[9], C0008i.bw));
                        "".length();
                    }
                    iArr5 = new int[lIlllIIl[1]];
                    iArr5[lIlllIIl[0]] = lIlllIIl[10];
                    if (lIIllIlllIl(Bank.contains(iArr5) ? 1 : 0)) {
                        int[] iArr28 = new int[lIlllIIl[1]];
                        iArr28[lIlllIIl[0]] = lIlllIIl[10];
                        if (lIIllIllllI(Bank.getFirst(iArr28).getQuantity(), lIlllIIl[11])) {
                            System.out.println(lIllIlll[lIlllIIl[57]]);
                            bB.add(new C0003d(lIlllIIl[10], lIlllIIl[58], lIlllIIl[14]));
                            "".length();
                        }
                    }
                    iArr6 = new int[lIlllIIl[1]];
                    iArr6[lIlllIIl[0]] = lIlllIIl[59];
                    if (lIIllIlllIl(Bank.contains(iArr6) ? 1 : 0)) {
                        int[] iArr29 = new int[lIlllIIl[1]];
                        iArr29[lIlllIIl[0]] = lIlllIIl[59];
                        if (lIIllIllllI(Bank.getFirst(iArr29).getQuantity(), lIlllIIl[11])) {
                            System.out.println(lIllIlll[lIlllIIl[60]]);
                            bB.add(new C0003d(lIlllIIl[59], lIlllIIl[58], lIlllIIl[14]));
                            "".length();
                        }
                    }
                    iArr7 = new int[lIlllIIl[1]];
                    iArr7[lIlllIIl[0]] = lIlllIIl[15];
                    if (lIIllIlllIl(Bank.contains(iArr7) ? 1 : 0)) {
                        int[] iArr30 = new int[lIlllIIl[1]];
                        iArr30[lIlllIIl[0]] = lIlllIIl[15];
                        if (lIIllIllllI(Bank.getFirst(iArr30).getQuantity(), lIlllIIl[11])) {
                            System.out.println(lIllIlll[lIlllIIl[61]]);
                            bB.add(new C0003d(lIlllIIl[15], lIlllIIl[58], lIlllIIl[14]));
                            "".length();
                        }
                    }
                    iArr8 = new int[lIlllIIl[1]];
                    iArr8[lIlllIIl[0]] = lIlllIIl[13];
                    if (lIIllIlllIl(Bank.contains(iArr8) ? 1 : 0)) {
                        int[] iArr31 = new int[lIlllIIl[1]];
                        iArr31[lIlllIIl[0]] = lIlllIIl[13];
                        if (lIIllIllllI(Bank.getFirst(iArr31).getQuantity(), lIlllIIl[11])) {
                            System.out.println(lIllIlll[lIlllIIl[62]]);
                            bB.add(new C0003d(lIlllIIl[13], lIlllIIl[58], lIlllIIl[14]));
                            "".length();
                        }
                    }
                    iArr9 = new int[lIlllIIl[1]];
                    iArr9[lIlllIIl[0]] = lIlllIIl[59];
                    if (lIIllIlllll(Bank.contains(iArr9) ? 1 : 0)) {
                        System.out.println(lIllIlll[lIlllIIl[63]]);
                        bB.add(new C0003d(lIlllIIl[59], lIlllIIl[58], lIlllIIl[14]));
                        "".length();
                    }
                    iArr10 = new int[lIlllIIl[1]];
                    iArr10[lIlllIIl[0]] = lIlllIIl[15];
                    if (lIIllIlllll(Bank.contains(iArr10) ? 1 : 0)) {
                        System.out.println(lIllIlll[lIlllIIl[64]]);
                        bB.add(new C0003d(lIlllIIl[15], lIlllIIl[58], lIlllIIl[14]));
                        "".length();
                    }
                    iArr11 = new int[lIlllIIl[1]];
                    iArr11[lIlllIIl[0]] = lIlllIIl[13];
                    if (lIIllIlllll(Bank.contains(iArr11) ? 1 : 0)) {
                        System.out.println(lIllIlll[lIlllIIl[65]]);
                        bB.add(new C0003d(lIlllIIl[13], lIlllIIl[58], lIlllIIl[14]));
                        "".length();
                    }
                    iArr12 = new int[lIlllIIl[1]];
                    iArr12[lIlllIIl[0]] = lIlllIIl[10];
                    if (lIIllIlllll(Bank.contains(iArr12) ? 1 : 0)) {
                        return;
                    }
                    System.out.println(lIllIlll[lIlllIIl[66]]);
                    bB.add(new C0003d(lIlllIIl[10], lIlllIIl[58], lIlllIIl[14]));
                    "".length();
                    return;
                }
                System.out.println(lIllIlll[lIlllIIl[55]]);
                bB.add(new C0003d(lIlllIIl[7], lIlllIIl[30], lIlllIIl[53]));
                "".length();
                iArr4 = new int[lIlllIIl[1]];
                iArr4[lIlllIIl[0]] = lIlllIIl[27];
                if (lIIllIlllll(Bank.contains(iArr4) ? 1 : 0)) {
                }
                iArr5 = new int[lIlllIIl[1]];
                iArr5[lIlllIIl[0]] = lIlllIIl[10];
                if (lIIllIlllIl(Bank.contains(iArr5) ? 1 : 0)) {
                }
                iArr6 = new int[lIlllIIl[1]];
                iArr6[lIlllIIl[0]] = lIlllIIl[59];
                if (lIIllIlllIl(Bank.contains(iArr6) ? 1 : 0)) {
                }
                iArr7 = new int[lIlllIIl[1]];
                iArr7[lIlllIIl[0]] = lIlllIIl[15];
                if (lIIllIlllIl(Bank.contains(iArr7) ? 1 : 0)) {
                }
                iArr8 = new int[lIlllIIl[1]];
                iArr8[lIlllIIl[0]] = lIlllIIl[13];
                if (lIIllIlllIl(Bank.contains(iArr8) ? 1 : 0)) {
                }
                iArr9 = new int[lIlllIIl[1]];
                iArr9[lIlllIIl[0]] = lIlllIIl[59];
                if (lIIllIlllll(Bank.contains(iArr9) ? 1 : 0)) {
                }
                iArr10 = new int[lIlllIIl[1]];
                iArr10[lIlllIIl[0]] = lIlllIIl[15];
                if (lIIllIlllll(Bank.contains(iArr10) ? 1 : 0)) {
                }
                iArr11 = new int[lIlllIIl[1]];
                iArr11[lIlllIIl[0]] = lIlllIIl[13];
                if (lIIllIlllll(Bank.contains(iArr11) ? 1 : 0)) {
                }
                iArr12 = new int[lIlllIIl[1]];
                iArr12[lIlllIIl[0]] = lIlllIIl[10];
                if (lIIllIlllll(Bank.contains(iArr12) ? 1 : 0)) {
                }
            }
            System.out.println(lIllIlll[lIlllIIl[52]]);
            bB.add(new C0003d(lIlllIIl[20], lIlllIIl[45], lIlllIIl[53]));
            "".length();
            iArr2 = new int[lIlllIIl[1]];
            iArr2[lIlllIIl[0]] = lIlllIIl[7];
            if (lIIllIlllll(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[lIlllIIl[1]];
            iArr3[lIlllIIl[0]] = lIlllIIl[7];
            if (lIIllIlllIl(Bank.contains(iArr3) ? 1 : 0)) {
            }
            System.out.println(lIllIlll[lIlllIIl[55]]);
            bB.add(new C0003d(lIlllIIl[7], lIlllIIl[30], lIlllIIl[53]));
            "".length();
            iArr4 = new int[lIlllIIl[1]];
            iArr4[lIlllIIl[0]] = lIlllIIl[27];
            if (lIIllIlllll(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[lIlllIIl[1]];
            iArr5[lIlllIIl[0]] = lIlllIIl[10];
            if (lIIllIlllIl(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[lIlllIIl[1]];
            iArr6[lIlllIIl[0]] = lIlllIIl[59];
            if (lIIllIlllIl(Bank.contains(iArr6) ? 1 : 0)) {
            }
            iArr7 = new int[lIlllIIl[1]];
            iArr7[lIlllIIl[0]] = lIlllIIl[15];
            if (lIIllIlllIl(Bank.contains(iArr7) ? 1 : 0)) {
            }
            iArr8 = new int[lIlllIIl[1]];
            iArr8[lIlllIIl[0]] = lIlllIIl[13];
            if (lIIllIlllIl(Bank.contains(iArr8) ? 1 : 0)) {
            }
            iArr9 = new int[lIlllIIl[1]];
            iArr9[lIlllIIl[0]] = lIlllIIl[59];
            if (lIIllIlllll(Bank.contains(iArr9) ? 1 : 0)) {
            }
            iArr10 = new int[lIlllIIl[1]];
            iArr10[lIlllIIl[0]] = lIlllIIl[15];
            if (lIIllIlllll(Bank.contains(iArr10) ? 1 : 0)) {
            }
            iArr11 = new int[lIlllIIl[1]];
            iArr11[lIlllIIl[0]] = lIlllIIl[13];
            if (lIIllIlllll(Bank.contains(iArr11) ? 1 : 0)) {
            }
            iArr12 = new int[lIlllIIl[1]];
            iArr12[lIlllIIl[0]] = lIlllIIl[10];
            if (lIIllIlllll(Bank.contains(iArr12) ? 1 : 0)) {
            }
        }
        System.out.println(lIllIlll[lIlllIIl[48]]);
        bB.add(new C0003d(lIlllIIl[17], lIlllIIl[9], lIlllIIl[47]));
        "".length();
        if (lIIllIlllll(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIllIlll[lIlllIIl[85]]);
        }) ? 1 : 0)) {
        }
        iArr = new int[lIlllIIl[1]];
        iArr[lIlllIIl[0]] = lIlllIIl[20];
        if (lIIllIlllIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        System.out.println(lIllIlll[lIlllIIl[52]]);
        bB.add(new C0003d(lIlllIIl[20], lIlllIIl[45], lIlllIIl[53]));
        "".length();
        iArr2 = new int[lIlllIIl[1]];
        iArr2[lIlllIIl[0]] = lIlllIIl[7];
        if (lIIllIlllll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIlllIIl[1]];
        iArr3[lIlllIIl[0]] = lIlllIIl[7];
        if (lIIllIlllIl(Bank.contains(iArr3) ? 1 : 0)) {
        }
        System.out.println(lIllIlll[lIlllIIl[55]]);
        bB.add(new C0003d(lIlllIIl[7], lIlllIIl[30], lIlllIIl[53]));
        "".length();
        iArr4 = new int[lIlllIIl[1]];
        iArr4[lIlllIIl[0]] = lIlllIIl[27];
        if (lIIllIlllll(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lIlllIIl[1]];
        iArr5[lIlllIIl[0]] = lIlllIIl[10];
        if (lIIllIlllIl(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[lIlllIIl[1]];
        iArr6[lIlllIIl[0]] = lIlllIIl[59];
        if (lIIllIlllIl(Bank.contains(iArr6) ? 1 : 0)) {
        }
        iArr7 = new int[lIlllIIl[1]];
        iArr7[lIlllIIl[0]] = lIlllIIl[15];
        if (lIIllIlllIl(Bank.contains(iArr7) ? 1 : 0)) {
        }
        iArr8 = new int[lIlllIIl[1]];
        iArr8[lIlllIIl[0]] = lIlllIIl[13];
        if (lIIllIlllIl(Bank.contains(iArr8) ? 1 : 0)) {
        }
        iArr9 = new int[lIlllIIl[1]];
        iArr9[lIlllIIl[0]] = lIlllIIl[59];
        if (lIIllIlllll(Bank.contains(iArr9) ? 1 : 0)) {
        }
        iArr10 = new int[lIlllIIl[1]];
        iArr10[lIlllIIl[0]] = lIlllIIl[15];
        if (lIIllIlllll(Bank.contains(iArr10) ? 1 : 0)) {
        }
        iArr11 = new int[lIlllIIl[1]];
        iArr11[lIlllIIl[0]] = lIlllIIl[13];
        if (lIIllIlllll(Bank.contains(iArr11) ? 1 : 0)) {
        }
        iArr12 = new int[lIlllIIl[1]];
        iArr12[lIlllIIl[0]] = lIlllIIl[10];
        if (lIIllIlllll(Bank.contains(iArr12) ? 1 : 0)) {
        }
    }

    private static boolean lIIlllIIlIl(int i, int i2) {
        return i >= i2;
    }

    static {
        lIIllIllIll();
        lIIllIlIlll();
        ic = lIlllIIl[10];
        f0if = lIlllIIl[86];
        hX = lIlllIIl[2];
        id = lIlllIIl[15];
        ie = lIlllIIl[13];
        ia = lIlllIIl[23];
        ih = lIlllIIl[17];
        hY = lIlllIIl[21];
        ig = lIlllIIl[25];
        hZ = lIlllIIl[22];
        ib = lIlllIIl[24];
        hW = new WorldPoint(lIlllIIl[87], lIlllIIl[88], lIlllIIl[3]);
        bB = new ArrayList();
        hI = lIllIlll[lIlllIIl[89]];
        String[] strArr = new String[lIlllIIl[12]];
        strArr[lIlllIIl[0]] = lIllIlll[lIlllIIl[90]];
        strArr[lIlllIIl[1]] = lIllIlll[lIlllIIl[91]];
        strArr[lIlllIIl[3]] = lIllIlll[lIlllIIl[92]];
        strArr[lIlllIIl[4]] = lIllIlll[lIlllIIl[93]];
        strArr[lIlllIIl[6]] = lIllIlll[lIlllIIl[94]];
        strArr[lIlllIIl[9]] = lIllIlll[lIlllIIl[95]];
        gx = strArr;
        bZ = lIlllIIl[0];
    }

    private static String lIIllIIlIll(String lIlIlllIlIIIlII, String lIlIlllIlIIIIll) {
        try {
            SecretKeySpec lIlIlllIlIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlllIlIIIIll.getBytes(StandardCharsets.UTF_8)), lIlllIIl[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlllIIl[3], lIlIlllIlIIIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIlllIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlllIlIIIlIl) {
            lIlIlllIlIIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllIIIII(Object obj) {
        return obj != null;
    }

    private static void lIIllIlIlll() {
        lIllIlll = new String[lIlllIIl[96]];
        lIllIlll[lIlllIIl[0]] = lIIllIIlIlI("EiQsASM3cTwcKD0i", "PQUhM");
        lIllIlll[lIlllIIl[1]] = lIIllIIlIll("eUwsaS+PXCg0sMik5z1OPjSYJIWux9/vtuQuwyVOYdDNXDtbnZloh6EWyJid05UxR4rmaSVQNUo=", "lQOZF");
        lIllIlll[lIlllIIl[3]] = lIIllIIllII("R3I0n6ltrdhs7fI7Hr5P8BtC3KpjNFNy", "jENOp");
        lIllIlll[lIlllIIl[4]] = lIIllIIlIlI("LCIHPwcNNUIzDw05", "cRbQn");
        lIllIlll[lIlllIIl[6]] = lIIllIIlIlI("HxMlCyg+HCxPJjYcIAYqMA==", "WrKoD");
        lIllIlll[lIlllIIl[9]] = lIIllIIlIll("Rn9Ag91PM/IP15KiDylIjyYu7XOASiDFANIR+OHHbLeDUDDUVSElbHncD9VTg8Gn", "gOPPx");
        lIllIlll[lIlllIIl[12]] = lIIllIIlIll("E3F93xgDANm4iM/k1TeU3tFK7C9o7GyHhxYRMb44ZNPXTZv9p2MNwOUrTRSVCwF3", "SrACH");
        lIllIlll[lIlllIIl[14]] = lIIllIIlIlI("OwRDCQgJQQ4BCR8IDQ9aHxQTGBYFBBBEWh8WChwZBAgND1oYDkMqLzUoLS8=", "lachz");
        lIllIlll[lIlllIIl[16]] = lIIllIIlIll("lFTG2grLmnTvlHRVfAdgry/4nY1W483q33r0QAp6NW7MmmUuwIbWf8K52jWXSVp3", "odqrU");
        lIllIlll[lIlllIIl[18]] = lIIllIIllII("YxbnyukCDEzODATAqKLdlgWvSdMO/a62j1B47zK+QI2YqQGYWOZkmAm+7r+rVh45", "NaQYJ");
        lIllIlll[lIlllIIl[8]] = lIIllIIlIlI("JDVtBTcWcCANNgA5IwNlACU9FCkaNT5IZQAnJBAmGzkjA2UHP20mECoZAyM=", "sPMdE");
        lIllIlll[lIlllIIl[19]] = lIIllIIlIlI("OQ4dMRsACFEuHU4GHCpSHRsQKAY=", "noqZr");
        lIllIlll[lIlllIIl[32]] = lIIllIIllII("Lots5AfCpgPM8EkfVdh+jA==", "ZBamI");
        lIllIlll[lIlllIIl[33]] = lIIllIIlIlI("CxsABCM=", "NutaQ");
        lIllIlll[lIlllIIl[34]] = lIIllIIlIll("/yrfxYSTNMeuQMVu5+sG9g==", "MRqBd");
        lIllIlll[lIlllIIl[31]] = lIIllIIllII("LryU6lX7Y8+CZpHKXdcNLA==", "AxQFu");
        lIllIlll[lIlllIIl[35]] = lIIllIIllII("KHf0jjxplZwtyofO/W1Xbw==", "VbZtC");
        lIllIlll[lIlllIIl[36]] = lIIllIIllII("u8ZwD293l4KlEVcmEcN8xDIjO9O31uU56dB/i1mSMlM=", "IBShA");
        lIllIlll[lIlllIIl[38]] = lIIllIIlIlI("NTwwCDkTeC0EOxg3I0E1ETkwQSMbeDYULlQ0PRIj", "tXTaW");
        lIllIlll[lIlllIIl[40]] = lIIllIIllII("rSA6WBR0vaCgwWcTe12O/4/rEYD6Wp+X78FIGtHEnng=", "RiueL");
        lIllIlll[lIlllIIl[30]] = lIIllIIlIll("p3x2O75/oheZc1Xk06OvJ8PXt3puLG9d6D+NNhTUdpo=", "HWExQ");
        lIllIlll[lIlllIIl[41]] = lIIllIIllII("hsOul/kAH9CbqmWYpVqlJWuB83/xWL6ul4etrI7MPEg=", "zXLAN");
        lIllIlll[lIlllIIl[44]] = lIIllIIlIll("S0awOX1UUmKvSWU06uOJM1B4KN1YGdpVsxQZ3xbWrng=", "TKGgT");
        lIllIlll[lIlllIIl[46]] = lIIllIIlIll("sqUKz8NZYXPVY+aKa1S6ZBrRIjt3RMZzLh/L3BPruC4=", "CnTpX");
        lIllIlll[lIlllIIl[48]] = lIIllIIlIll("nXTsRhtj4If/dCA9YYqtSxGXDTVr1cnYN50J70H8rbs=", "FbbOY");
        lIllIlll[lIlllIIl[49]] = lIIllIIllII("LHBleTRYrelIHh8Io37TO6BHYIxULvbSdxoAqfrWE90=", "hKofV");
        lIllIlll[lIlllIIl[52]] = lIIllIIlIll("Z9K9gpe9n8M5hJTN6F08OL9ihMBRdTk2NdjbjCsAn9U=", "yxdSG");
        lIllIlll[lIlllIIl[54]] = lIIllIIlIll("k2k1RR/+eLq0kRhrxJEGxBVryWZywkZLNgYlvvStDck=", "uSXSo");
        lIllIlll[lIlllIIl[55]] = lIIllIIllII("k0NeGAGM+JyqMWUzyBdneUtF+4UFYXdgXxWEbqu7c0s=", "WVvRQ");
        lIllIlll[lIlllIIl[56]] = lIIllIIlIll("s1OVOTKqoDUaw3YVCY2D0JmwpzMsp+5xr1G4fc/MMUU=", "BWGvx");
        lIllIlll[lIlllIIl[57]] = lIIllIIlIlI("JRcJIhwDUwAiHABTHz4cAQBNPx1EERgyUggaHj8=", "dsmKr");
        lIllIlll[lIlllIIl[60]] = lIIllIIlIlI("NDM1OToSdzA5JlUlJD4xBnclP3QXIihwOBwkJQ==", "uWQPT");
        lIllIlll[lIlllIIl[61]] = lIIllIIllII("URUZfo/vSfQAaKcBnG4CzCE+feIyDbpt3GlwFc4Y5Jc=", "zFJbI");
        lIllIlll[lIlllIIl[62]] = lIIllIIlIll("eTi01cHkeEDCV5J2CGsK8Skjw1hm8l+QjUZfKWOTCcY=", "NRAvC");
        lIllIlll[lIlllIIl[63]] = lIIllIIllII("HIs0EwwUM9i08JwTq5clvXC/HrcQuAgSi3v7YbALY6k=", "ZTxdd");
        lIllIlll[lIlllIIl[64]] = lIIllIIllII("WPyh8Go1Z13V7wuanz4aM7eYs3QmbGoyq0+YZTFvtrk=", "GapON");
        lIllIlll[lIlllIIl[65]] = lIIllIIlIlI("Cg8DDRosSwIFBj8DRxYBJQ4URAAkSwURDWsHDhcA", "Kkgdt");
        lIllIlll[lIlllIIl[66]] = lIIllIIllII("mnOwFMO9eKjd/rn2iST0TYQmQCQaZ9htl6Cw7J1vhWM=", "ORRNU");
        lIllIlll[lIlllIIl[67]] = lIIllIIlIll("X0Ar8e0sbXRAj8iZ+991/Q==", "QnxKn");
        lIllIlll[lIlllIIl[68]] = lIIllIIlIll("m05J+je2jQyf2ql4AElCyA==", "LMJxH");
        lIllIlll[lIlllIIl[45]] = lIIllIIlIlI("IQs5BR1DBT0HEg==", "cgXfv");
        lIllIlll[lIlllIIl[69]] = lIIllIIllII("X0SSuDYdZtVgL9A4yJuQ8g==", "rmOxp");
        lIllIlll[lIlllIIl[70]] = lIIllIIllII("CFfHNbLXy98=", "yCVbL");
        lIllIlll[lIlllIIl[71]] = lIIllIIlIll("LYIWzuovGTcTGCvFEFOnN+xgJ8dOF8IY", "YFiJz");
        lIllIlll[lIlllIIl[72]] = lIIllIIlIlI("BzsEAAAmLEEMCCYg", "HKani");
        lIllIlll[lIlllIIl[73]] = lIIllIIlIlI("LQMUBSAMDB1BLgQMEQgiAg==", "ebzaL");
        lIllIlll[lIlllIIl[74]] = lIIllIIlIll("/FqtU0hXNjy16R7XFy1fAQ==", "fktEK");
        lIllIlll[lIlllIIl[75]] = lIIllIIlIll("8K4KLr4j0KefxKw7ITGX6g==", "pXdhT");
        lIllIlll[lIlllIIl[76]] = lIIllIIllII("XGsIbWYYE14b6TiNtxHVT8TRh/TKsilDHxXZrfgVRKFnfnzAY5uc5/+2iMKvclMS", "JUkDq");
        lIllIlll[lIlllIIl[77]] = lIIllIIlIlI("Bg0AOAZjHgciCw==", "ClrLn");
        lIllIlll[lIlllIIl[78]] = lIIllIIllII("xJ+APXv1zEb5UMIu4oOz0Q==", "LaBQA");
        lIllIlll[lIlllIIl[79]] = lIIllIIlIll("tQIDjYSccYCdtUEC6tkoqBesxbnOpprS5SBR1k7KdojaZTUwsPXSmEmolnENV9xH", "bCaLo");
        lIllIlll[lIlllIIl[80]] = lIIllIIlIlI("MDg3LhdHKzYlAA==", "gYCKe");
        lIllIlll[lIlllIIl[81]] = lIIllIIlIlI("LSgcIx5aOx0oCQ==", "zIhFl");
        lIllIlll[lIlllIIl[82]] = lIIllIIlIlI("JQNZNRsXRhQ9GgEPFzNJARMJJAUbAwp4SQERECAKGg8XM0kGCVkWPCsvNxM=", "rfyTi");
        lIllIlll[lIlllIIl[83]] = lIIllIIllII("FIzTfrYbkIfUWJRhKnNofZ4UDyCd5KEAihVDeck8ZLt4lF97sDAJFXmDaNfq5QjO", "mjlmR");
        lIllIlll[lIlllIIl[84]] = lIIllIIlIlI("LyA4QxoHOSsLPBRtORY8FTk=", "fMHcY");
        lIllIlll[lIlllIIl[85]] = lIIllIIlIll("UfYe3O6Q421pXgMXngDWTx+cigVeZSrU", "EaIcU");
        lIllIlll[lIlllIIl[89]] = lIIllIIlIlI("Oy4zCAAIZwQACAsoLg==", "lGIir");
        lIllIlll[lIlllIIl[90]] = lIIllIIlIll("5N+aWVd+4xzs3hnZEaa8tzKSwuzaHDuD", "FqYqX");
        lIllIlll[lIlllIIl[91]] = lIIllIIlIll("dTaP6hbk/MP+RIClmmndRw==", "VtLVv");
        lIllIlll[lIlllIIl[92]] = lIIllIIlIll("qErahqte6XmMkft+IXbMEKfqrop44D5UfUG8NB7rDltPjH1BcwlVcWf344lAylir", "mxLvk");
        lIllIlll[lIlllIIl[93]] = lIIllIIllII("G2zvXIHHAGg=", "XbIiA");
        lIllIlll[lIlllIIl[94]] = lIIllIIlIll("j6SW6aAgMrEO9GBG28RUYXd67QTnxL4u", "WzIlt");
        lIllIlll[lIlllIIl[95]] = lIIllIIllII("O7n588W/MJuhIEhohS9S78NPmlgjEYE5GTnxlyGmF98=", "lsatl");
    }

    private static String lIIllIIlIlI(String lIlIlllIlIlIlII, String lIlIlllIlIllIII) {
        String lIlIlllIlIlIlII2 = new String(Base64.getDecoder().decode(lIlIlllIlIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIlllIlIlIlll = new StringBuilder();
        char[] lIlIlllIlIlIllI = lIlIlllIlIllIII.toCharArray();
        int lIlIlllIlIlIlIl = lIlllIIl[0];
        char[] charArray = lIlIlllIlIlIlII2.toCharArray();
        int length = charArray.length;
        int i = lIlllIIl[0];
        while (lIIllIllllI(i, length)) {
            char lIlIlllIlIIllII = charArray[i];
            lIlIlllIlIlIlll.append((char) (lIlIlllIlIIllII ^ lIlIlllIlIlIllI[lIlIlllIlIlIlIl % lIlIlllIlIlIllI.length]));
            "".length();
            lIlIlllIlIlIlIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lIlIlllIlIlIlll);
    }

    private static void lIIllIllIll() {
        lIlllIIl = new int[97];
        lIlllIIl[0] = (137 ^ 147) & ((160 ^ 186) ^ (-1));
        lIlllIIl[1] = " ".length();
        lIlllIIl[2] = ((93 + 38) - (-6)) + 23;
        lIlllIIl[3] = "  ".length();
        lIlllIIl[4] = "   ".length();
        lIlllIIl[5] = (-26644) & 31643;
        lIlllIIl[6] = 164 ^ 160;
        lIlllIIl[7] = (-((-4237) & 28863)) & (-1) & 32635;
        lIlllIIl[8] = (((65 + 17) - (-24)) + 96) ^ (((57 + 29) - 30) + 136);
        lIlllIIl[9] = (((166 + 15) - 41) + 47) ^ (((13 + 43) - 43) + 177);
        lIlllIIl[10] = (-30802) & 31359;
        lIlllIIl[11] = (-23570) & 24569;
        lIlllIIl[12] = (238 ^ 191) ^ (123 ^ 44);
        lIlllIIl[13] = (-((-24583) & 30039)) & (-8323) & 14335;
        lIlllIIl[14] = 190 ^ 185;
        lIlllIIl[15] = (-20565) & 21119;
        lIlllIIl[16] = 108 ^ 100;
        lIlllIIl[17] = (-31) & 2015;
        lIlllIIl[18] = 102 ^ 111;
        lIlllIIl[19] = (191 ^ 196) ^ (26 ^ 106);
        lIlllIIl[20] = (-8209) & 16215;
        lIlllIIl[21] = (-16450) & 17919;
        lIlllIIl[22] = (-((-970) & 25597)) & (-4609) & 30707;
        lIlllIIl[23] = (-10762) & 12235;
        lIlllIIl[24] = (-((-257) & 11019)) & (-1) & 12238;
        lIlllIIl[25] = (-13313) & 13691;
        lIlllIIl[26] = (-10761) & 11260;
        lIlllIIl[27] = (-5) & 12629;
        lIlllIIl[28] = (-((-4169) & 30188)) & (-1) & 28599;
        lIlllIIl[29] = (-((-6309) & 31660)) & (-1) & 28431;
        lIlllIIl[30] = (1 ^ 107) ^ (241 ^ 143);
        lIlllIIl[31] = (77 ^ 5) ^ (63 ^ 120);
        lIlllIIl[32] = 160 ^ 172;
        lIlllIIl[33] = 183 ^ 186;
        lIlllIIl[34] = 49 ^ 63;
        lIlllIIl[35] = 31 ^ 15;
        lIlllIIl[36] = 101 ^ 116;
        lIlllIIl[37] = (-22658) & 32167;
        lIlllIIl[38] = 52 ^ 38;
        lIlllIIl[39] = (-20553) & 29662;
        lIlllIIl[40] = 187 ^ 168;
        lIlllIIl[41] = (102 ^ 84) ^ (125 ^ 90);
        lIlllIIl[42] = (254 ^ 131) ^ (44 ^ 53);
        lIlllIIl[43] = (-((-321) & 23909)) & (-514) & 24501;
        lIlllIIl[44] = (57 ^ 65) ^ (100 ^ 10);
        lIlllIIl[45] = 111 ^ 71;
        lIlllIIl[46] = (93 ^ 73) ^ "   ".length();
        lIlllIIl[47] = (-((-293) & 19757)) & (-8194) & 32767;
        lIlllIIl[48] = (((100 + 51) - 87) + 89) ^ (((112 + 83) - 183) + 117);
        lIlllIIl[49] = 102 ^ 127;
        lIlllIIl[50] = (-20) & 11999;
        lIlllIIl[51] = (-((-5222) & 5613)) & (-9233) & 26623;
        lIlllIIl[52] = (((103 + 21) - 17) + 46) ^ (((76 + 48) - 34) + 41);
        lIlllIIl[53] = (-((-16467) & 28883)) & (-16385) & 30700;
        lIlllIIl[54] = (((139 + 79) - 63) + 33) ^ (((95 + 98) - 135) + 109);
        lIlllIIl[55] = 39 ^ 59;
        lIlllIIl[56] = 168 ^ 181;
        lIlllIIl[57] = 35 ^ 61;
        lIlllIIl[58] = (-2087) & 4086;
        lIlllIIl[59] = (-((-4098) & 7237)) & (-24833) & 28527;
        lIlllIIl[60] = (201 ^ 173) ^ (23 ^ 108);
        lIlllIIl[61] = 14 ^ 46;
        lIlllIIl[62] = (((29 + 168) - 74) + 102) ^ (((163 + 28) - 166) + 167);
        lIlllIIl[63] = 81 ^ 115;
        lIlllIIl[64] = (((67 + 77) - 15) + 1) ^ (((56 + 64) - (-10)) + 31);
        lIlllIIl[65] = (((49 + 12) - 53) + 126) ^ (((149 + 159) - 261) + 115);
        lIlllIIl[66] = 23 ^ 50;
        lIlllIIl[67] = 182 ^ 144;
        lIlllIIl[68] = (140 ^ 179) ^ (32 ^ 56);
        lIlllIIl[69] = (56 ^ 51) ^ (155 ^ 185);
        lIlllIIl[70] = (185 ^ 176) ^ (226 ^ 193);
        lIlllIIl[71] = (((161 + 135) - 174) + 115) ^ (((36 + 6) - (-73)) + 83);
        lIlllIIl[72] = 94 ^ 114;
        lIlllIIl[73] = (((127 + 82) - 108) + 75) ^ (((47 + 90) - 119) + 139);
        lIlllIIl[74] = 183 ^ 153;
        lIlllIIl[75] = (((20 + 74) - 89) + 230) ^ (((101 + 191) - 201) + 105);
        lIlllIIl[76] = 169 ^ 153;
        lIlllIIl[77] = 151 ^ 166;
        lIlllIIl[78] = 178 ^ 128;
        lIlllIIl[79] = 144 ^ 163;
        lIlllIIl[80] = 171 ^ 159;
        lIlllIIl[81] = 60 ^ 9;
        lIlllIIl[82] = (((18 + 7) - (-28)) + 121) ^ (((74 + 46) - 116) + 148);
        lIlllIIl[83] = (((140 + 146) - 139) + 44) ^ (((131 + 31) - 143) + 117);
        lIlllIIl[84] = (168 ^ 192) ^ (203 ^ 155);
        lIlllIIl[85] = 13 ^ 52;
        lIlllIIl[86] = (-((-1255) & 24055)) & (-8386) & 31739;
        lIlllIIl[87] = (-13129) & 16232;
        lIlllIIl[88] = (-517) & 3679;
        lIlllIIl[89] = 21 ^ 47;
        lIlllIIl[90] = 26 ^ 33;
        lIlllIIl[91] = (4 ^ 82) ^ (75 ^ 33);
        lIlllIIl[92] = 187 ^ 134;
        lIlllIIl[93] = 56 ^ 6;
        lIlllIIl[94] = 69 ^ 122;
        lIlllIIl[95] = (26 ^ 17) ^ (73 ^ 2);
        lIlllIIl[96] = 29 ^ 92;
    }
}
