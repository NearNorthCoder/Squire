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
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.u  reason: invalid package */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/u.class */
public class u {
    public static /* synthetic */ List<C0003d> bB;
    private static /* synthetic */ int da;
    public static /* synthetic */ boolean bz;
    private static /* synthetic */ int[] db;
    private static /* synthetic */ int[] lIllIIII;
    private static /* synthetic */ int cZ;
    private static /* synthetic */ String[] lIlIllll;

    private static boolean lIIlIIlllIl(Object obj) {
        return obj != null;
    }

    private static String lIIlIIlIlIl(String lIlllIlIlIIIIII, String lIlllIlIIlllIlI) {
        String lIlllIlIlIIIIII2 = new String(Base64.getDecoder().decode(lIlllIlIlIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlllIlIIlllllI = new StringBuilder();
        char[] charArray = lIlllIlIIlllIlI.toCharArray();
        int lIlllIlIIllllII = lIllIIII[0];
        char[] charArray2 = lIlllIlIlIIIIII2.toCharArray();
        int length = charArray2.length;
        int i = lIllIIII[0];
        while (lIIlIIllIll(i, length)) {
            char lIlllIlIlIIIIIl = charArray2[i];
            lIlllIlIIlllllI.append((char) (lIlllIlIlIIIIIl ^ charArray[lIlllIlIIllllII % charArray.length]));
            "".length();
            lIlllIlIIllllII++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(lIlllIlIIlllllI);
    }

    static {
        lIIlIIllIIl();
        lIIlIIllIII();
        bB = new ArrayList();
        cZ = lIllIIII[41];
        da = lIllIIII[42];
        int[] iArr = new int[lIllIIII[4]];
        iArr[lIllIIII[0]] = cZ;
        iArr[lIllIIII[1]] = da;
        iArr[lIllIIII[2]] = lIllIIII[8];
        iArr[lIllIIII[3]] = lIllIIII[7];
        db = iArr;
    }

    private static boolean lIIlIIllIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIIlllll(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean aV() {
        String[] strArr = new String[lIllIIII[1]];
        strArr[lIllIIII[0]] = lIlIllll[lIllIIII[19]];
        if (lIIlIIllIlI(Equipment.contains(strArr) ? 1 : 0)) {
            int[] iArr = new int[lIllIIII[1]];
            iArr[lIllIIII[0]] = lIllIIII[8];
            if (lIIlIIllIlI(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIllIIII[1]];
                iArr2[lIllIIII[0]] = lIllIIII[7];
                if (lIIlIIllIlI(Equipment.contains(iArr2) ? 1 : 0)) {
                    String[] strArr2 = new String[lIllIIII[1]];
                    strArr2[lIllIIII[0]] = lIlIllll[lIllIIII[20]];
                    if (lIIlIIllIlI(Equipment.contains(strArr2) ? 1 : 0)) {
                        ?? r0 = lIllIIII[1];
                        "".length();
                        return "  ".length() == (-" ".length()) ? ((127 ^ 62) ^ (98 ^ 58)) & (((((50 + 54) - 32) + 88) ^ (((17 + 142) - 125) + 151)) ^ (-" ".length())) : r0;
                    }
                }
            }
        }
        return lIllIIII[0];
    }

    public static void aW() {
        if (lIIlIIllIlI(Inventory.contains(C0005f.bl) ? 1 : 0) && lIIlIIlllII(Equipment.contains(C0005f.bl) ? 1 : 0)) {
            Inventory.getFirst(C0005f.bl).interact(lIlIllll[lIllIIII[38]]);
            Time.sleepTicks(lIllIIII[1]);
            "".length();
        }
        if (lIIlIIllIlI(Inventory.contains(C0005f.aX) ? 1 : 0) && lIIlIIlllII(Equipment.contains(C0005f.aX) ? 1 : 0)) {
            Inventory.getFirst(C0005f.aX).interact(lIlIllll[lIllIIII[39]]);
            Time.sleepTicks(lIllIIII[1]);
            "".length();
        }
    }

    private static void lIIlIIllIIl() {
        lIllIIII = new int[44];
        lIllIIII[0] = ((63 ^ 99) ^ (63 ^ 124)) & (((253 ^ 169) ^ (255 ^ 180)) ^ (-" ".length()));
        lIllIIII[1] = " ".length();
        lIllIIII[2] = "  ".length();
        lIllIIII[3] = "   ".length();
        lIllIIII[4] = (22 ^ 16) ^ "  ".length();
        lIllIIII[5] = (-((-5871) & 7919)) & (-8278) & 15325;
        lIllIIII[6] = (16 ^ 56) ^ (48 ^ 29);
        lIllIIII[7] = (-((-2593) & 32295)) & (-514) & 32767;
        lIllIIII[8] = (-29012) & 30715;
        lIllIIII[9] = (6 ^ 111) ^ (206 ^ 161);
        lIllIIII[10] = 126 ^ 121;
        lIllIIII[11] = 73 ^ 65;
        lIllIIII[12] = (41 ^ 50) ^ (100 ^ 118);
        lIllIIII[13] = 64 ^ 74;
        lIllIIII[14] = 123 ^ 112;
        lIllIIII[15] = 104 ^ 100;
        lIllIIII[16] = (-667) & 7166;
        lIllIIII[17] = 144 ^ 157;
        lIllIIII[18] = 93 ^ 83;
        lIllIIII[19] = 104 ^ 103;
        lIllIIII[20] = 82 ^ 66;
        lIllIIII[21] = (-((-16595) & 24055)) & (-2) & 15871;
        lIllIIII[22] = (-((-1478) & 19935)) & (-12289) & 32255;
        lIllIIII[23] = (-"  ".length()) & (-4225) & 32735;
        lIllIIII[24] = (-((-1105) & 11889)) & (-21) & 16254;
        lIllIIII[25] = (-((-15885) & 32654)) & (-2113) & 19439;
        lIllIIII[26] = (-((-4651) & 6143)) & (-16385) & 18431;
        lIllIIII[27] = (-29699) & 32698;
        lIllIIII[28] = (-((-19085) & 32719)) & (-16385) & 30575;
        lIllIIII[29] = (-19) & 4018;
        lIllIIII[30] = (-13782) & 14335;
        lIllIIII[31] = (-((-4718) & 13053)) & (-16385) & 32719;
        lIllIIII[32] = (-31233) & 31732;
        lIllIIII[33] = (-(154 ^ 171)) & (-4355) & 16382;
        lIllIIII[34] = (-(127 ^ 121)) & (-2577) & 27581;
        lIllIIII[35] = (-((-17411) & 25747)) & (-1) & 16343;
        lIllIIII[36] = (-((-2833) & 28471)) & (-6721) & 32758;
        lIllIIII[37] = (-((-3897) & 16249)) & (-3116) & 16367;
        lIllIIII[38] = (((6 + 106) - (-1)) + 16) ^ (((6 + 55) - 5) + 88);
        lIllIIII[39] = (187 ^ 173) ^ (47 ^ 43);
        lIllIIII[40] = 33 ^ 50;
        lIllIIII[41] = (-((-16503) & 30975)) & (-16403) & 32255;
        lIllIIII[42] = (-((-123) & 23423)) & (-8393) & 32751;
        lIllIIII[43] = (18 ^ 118) ^ (84 ^ 36);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0179, code lost:
        if (lIIlIIlllll(net.unethicalite.api.items.Inventory.getCount(r0), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.u.lIllIIII[1]) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ad, code lost:
        if (lIIlIIllIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01ec, code lost:
        if (lIIlIIlllll(net.unethicalite.api.items.Inventory.getCount(r0), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.u.lIllIIII[1]) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x022b, code lost:
        if (lIIlIIllIll(net.unethicalite.api.items.Inventory.getCount(r0), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.u.lIllIIII[1]) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x022e, code lost:
        ag();
        java.lang.System.out.println(p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.u.lIlIllll[p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.u.lIllIIII[9]]);
        p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.u.bz = p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.u.lIllIIII[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0249, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v193, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v226, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void aT() {
        if (lIIlIIllIlI(bz ? 1 : 0)) {
            AccBuilderBarrows.c = lIlIllll[lIllIIII[0]];
            C0001b.a(bB);
            if (lIIlIIllIll(bB.size(), lIllIIII[1])) {
                System.out.println(lIlIllll[lIllIIII[1]]);
                bz = lIllIIII[0];
            }
        }
        if (lIIlIIlllII(bz ? 1 : 0) && lIIlIIlllII(aV() ? 1 : 0)) {
            System.out.println(lIlIllll[lIllIIII[2]]);
            if (lIIlIIlllII(aU() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIlIIlllIl(nearest) && lIIlIIlllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIlIllll[lIllIIII[3]];
                    C0000a.a(nearest);
                }
                if (lIIlIIlllIl(nearest) && lIIlIIllIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIIlIIlllII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderBarrows.c = lIlIllll[lIllIIII[4]];
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIllIIII[5]);
                        "".length();
                    }
                    if (lIIlIIllIlI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderBarrows.c = lIlIllll[lIllIIII[6]];
                        if (lIIlIIllllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIllIIII[3]);
                            "".length();
                        }
                        if (lIIlIIllllI(Equipment.getAll().size()) && lIIlIIlllII(aV() ? 1 : 0)) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIllIIII[2]);
                            "".length();
                        }
                        int[] iArr = new int[lIllIIII[1]];
                        iArr[lIllIIII[0]] = da;
                        if (lIIlIIlllII(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lIllIIII[1]];
                            iArr2[lIllIIII[0]] = da;
                        }
                        int[] iArr3 = new int[lIllIIII[1]];
                        iArr3[lIllIIII[0]] = cZ;
                        if (lIIlIIlllII(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIllIIII[1]];
                            iArr4[lIllIIII[0]] = cZ;
                        }
                        int[] iArr5 = new int[lIllIIII[1]];
                        iArr5[lIllIIII[0]] = lIllIIII[7];
                        if (lIIlIIlllII(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lIllIIII[1]];
                            iArr6[lIllIIII[0]] = lIllIIII[7];
                        }
                        int[] iArr7 = new int[lIllIIII[1]];
                        iArr7[lIllIIII[0]] = lIllIIII[8];
                        if (lIIlIIlllII(Bank.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[lIllIIII[1]];
                            iArr8[lIllIIII[0]] = lIllIIII[8];
                        }
                        int[] iArr9 = new int[lIllIIII[1]];
                        iArr9[lIllIIII[0]] = cZ;
                        if (lIIlIIllIlI(Bank.contains(iArr9) ? 1 : 0)) {
                            int[] iArr10 = new int[lIllIIII[1]];
                            iArr10[lIllIIII[0]] = cZ;
                            if (lIIlIIllIll(Inventory.getCount(iArr10), lIllIIII[1])) {
                                Bank.withdraw(cZ, lIllIIII[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIllIIII[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr11 = new int[lIllIIII[1]];
                                    iArr11[lIllIIII[0]] = cZ;
                                    if (lIIlIIllllI(Inventory.getCount(iArr11))) {
                                        ?? r0 = lIllIIII[1];
                                        "".length();
                                        return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lIllIIII[0];
                                }, lIllIIII[5]);
                                "".length();
                            }
                        }
                        int[] iArr11 = new int[lIllIIII[1]];
                        iArr11[lIllIIII[0]] = da;
                        if (lIIlIIllIlI(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIllIIII[1]];
                            iArr12[lIllIIII[0]] = da;
                            if (lIIlIIllIll(Inventory.getCount(iArr12), lIllIIII[1])) {
                                Bank.withdraw(da, lIllIIII[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIllIIII[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr13 = new int[lIllIIII[1]];
                                    iArr13[lIllIIII[0]] = da;
                                    if (lIIlIIllllI(Inventory.getCount(iArr13))) {
                                        ?? r0 = lIllIIII[1];
                                        "".length();
                                        return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lIllIIII[0];
                                }, lIllIIII[5]);
                                "".length();
                            }
                        }
                        int[] iArr13 = new int[lIllIIII[1]];
                        iArr13[lIllIIII[0]] = lIllIIII[7];
                        if (lIIlIIllIlI(Bank.contains(iArr13) ? 1 : 0)) {
                            int[] iArr14 = new int[lIllIIII[1]];
                            iArr14[lIllIIII[0]] = lIllIIII[7];
                            if (lIIlIIllIll(Inventory.getCount(iArr14), lIllIIII[1])) {
                                Bank.withdraw(lIllIIII[7], lIllIIII[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIllIIII[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr15 = new int[lIllIIII[1]];
                                    iArr15[lIllIIII[0]] = lIllIIII[7];
                                    if (lIIlIIllllI(Inventory.getCount(iArr15))) {
                                        ?? r0 = lIllIIII[1];
                                        "".length();
                                        return 0 != 0 ? ((((134 + 38) - 109) + 181) ^ (((54 + 187) - 237) + 191)) & (((35 ^ 41) ^ (19 ^ 46)) ^ (-" ".length())) : r0;
                                    }
                                    return lIllIIII[0];
                                }, lIllIIII[5]);
                                "".length();
                            }
                        }
                        int[] iArr15 = new int[lIllIIII[1]];
                        iArr15[lIllIIII[0]] = lIllIIII[8];
                        if (lIIlIIllIlI(Bank.contains(iArr15) ? 1 : 0)) {
                            int[] iArr16 = new int[lIllIIII[1]];
                            iArr16[lIllIIII[0]] = lIllIIII[8];
                            if (lIIlIIllIll(Inventory.getCount(iArr16), lIllIIII[1])) {
                                Bank.withdraw(lIllIIII[8], lIllIIII[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIllIIII[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr17 = new int[lIllIIII[1]];
                                    iArr17[lIllIIII[0]] = lIllIIII[8];
                                    if (lIIlIIllllI(Inventory.getCount(iArr17))) {
                                        ?? r0 = lIllIIII[1];
                                        "".length();
                                        return "  ".length() == 0 ? ((((80 + 21) - (-24)) + 12) ^ (((37 + 44) - (-20)) + 47)) & (((((104 + 159) - 210) + 163) ^ (((152 + 44) - 165) + 166)) ^ (-" ".length())) : r0;
                                    }
                                    return lIllIIII[0];
                                }, lIllIIII[5]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (lIIlIIllIlI(aU() ? 1 : 0)) {
                if (lIIlIIllIlI(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (lIIlIIlllII(Bank.isOpen() ? 1 : 0)) {
                    if (lIIlIIllIlI(GrandExchange.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepTicks(lIllIIII[1]);
                        "".length();
                    }
                    int i = lIllIIII[0];
                    while (lIIlIIllIll(i, db.length)) {
                        int[] iArr17 = new int[lIllIIII[1]];
                        iArr17[lIllIIII[0]] = db[i];
                        Item first = Inventory.getFirst(iArr17);
                        if (lIIlIIlllIl(first)) {
                            int[] iArr18 = new int[lIllIIII[1]];
                            iArr18[lIllIIII[0]] = first.getId();
                            if (lIIlIIllIlI(Inventory.contains(iArr18) ? 1 : 0)) {
                                String[] strArr = new String[lIllIIII[1]];
                                strArr[lIllIIII[0]] = lIlIllll[lIllIIII[10]];
                                if (lIIlIIllIlI(first.hasAction(strArr) ? 1 : 0)) {
                                    first.interact(lIlIllll[lIllIIII[11]]);
                                    Time.sleepTicks(lIllIIII[1]);
                                    "".length();
                                }
                                String[] strArr2 = new String[lIllIIII[1]];
                                strArr2[lIllIIII[0]] = lIlIllll[lIllIIII[12]];
                                if (lIIlIIllIlI(first.hasAction(strArr2) ? 1 : 0)) {
                                    first.interact(lIlIllll[lIllIIII[13]]);
                                    Time.sleepTicks(lIllIIII[1]);
                                    "".length();
                                }
                                String[] strArr3 = new String[lIllIIII[1]];
                                strArr3[lIllIIII[0]] = lIlIllll[lIllIIII[14]];
                                if (lIIlIIllIlI(first.hasAction(strArr3) ? 1 : 0)) {
                                    first.interact(lIlIllll[lIllIIII[15]]);
                                    Time.sleepTicks(lIllIIII[1]);
                                    "".length();
                                }
                                Time.sleepTicks(lIllIIII[1]);
                                "".length();
                            }
                        }
                        i++;
                        "".length();
                        if (" ".length() > " ".length()) {
                            return;
                        }
                    }
                    if (lIIlIIllIlI(aV() ? 1 : 0) && lIIlIIlllII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIllIIII[16]);
                        "".length();
                    }
                }
            }
        }
    }

    private static boolean lIIlIIllIlI(int i) {
        return i != 0;
    }

    private static boolean lIIlIIllllI(int i) {
        return i > 0;
    }

    private static boolean lIIlIIlllII(int i) {
        return i == 0;
    }

    private static String lIIlIIlIlll(String lIlllIlIIIllllI, String lIlllIlIIIlllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllIlIIIlllIl.getBytes(StandardCharsets.UTF_8)), lIllIIII[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIIII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlllIlIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllIlIIIlllll) {
            lIlllIlIIIlllll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean aU() {
        String[] strArr = new String[lIllIIII[1]];
        strArr[lIllIIII[0]] = lIlIllll[lIllIIII[17]];
        if (lIIlIIllIlI(Inventory.contains(strArr) ? 1 : 0)) {
            int[] iArr = new int[lIllIIII[1]];
            iArr[lIllIIII[0]] = lIllIIII[8];
            if (lIIlIIllIlI(Inventory.contains(iArr) ? 1 : 0)) {
                String[] strArr2 = new String[lIllIIII[1]];
                strArr2[lIllIIII[0]] = lIlIllll[lIllIIII[18]];
                if (lIIlIIllIlI(Inventory.contains(strArr2) ? 1 : 0) && lIIlIIllIlI(Inventory.contains(C0005f.aT) ? 1 : 0)) {
                    ?? r0 = lIllIIII[1];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return lIllIIII[0];
    }

    private static void lIIlIIllIII() {
        lIlIllll = new String[lIllIIII[43]];
        lIlIllll[lIllIIII[0]] = lIIlIIlIlIl("CSwtJToseT04MSYq", "KYTLT");
        lIlIllll[lIllIIII[1]] = lIIlIIlIlIl("CwEFPDglDQ91KTgRAjssbQEfMCY+REsmPCQcCD0iIw9LNyouA0shJG0PDjQ5JAYM", "MhkUK");
        lIlIllll[lIllIIII[2]] = lIIlIIlIllI("1pgdANPxu6k1hNrJX8pqX002Qs7zW2SG", "EpSdx");
        lIlIllll[lIllIIII[3]] = lIIlIIlIllI("MRsJeuK0vmWEkMmTJQaJZ4dZuGP7yjIL", "GhnIx");
        lIlIllll[lIllIIII[4]] = lIIlIIlIlIl("Pj4TKDMfKVYkOx8l", "qNvFZ");
        lIlIllll[lIllIIII[6]] = lIIlIIlIlIl("PgMoHScfDCFZKRcMLRAlEQ==", "vbFyK");
        lIlIllll[lIllIIII[9]] = lIIlIIlIllI("VNiBy9AaDX/BWW6HPHCzuBM426RKkIWpeh2EtwyCBOxgDdD9siOi8nXhZzkrGx/1HWqVGIFAbYw=", "UVQdt");
        lIlIllll[lIllIIII[10]] = lIIlIIlIlIl("GCMYEA==", "OFybb");
        lIlIllll[lIllIIII[11]] = lIIlIIlIlIl("BDIsOw==", "SWMIe");
        lIlIllll[lIllIIII[12]] = lIIlIIlIllI("VgSg/SsXXBc=", "czcpw");
        lIlIllll[lIllIIII[13]] = lIIlIIlIlll("cRaBPmsdpzs=", "CAQGz");
        lIlIllll[lIllIIII[14]] = lIIlIIlIllI("B26jTsCZemM=", "NvLJo");
        lIlIllll[lIllIIII[15]] = lIIlIIlIllI("hHH0qPrrTFw=", "skMAT");
        lIlIllll[lIllIIII[17]] = lIIlIIlIlll("MxCnwtPk7iYK+NdGdx1HRQ==", "fspzk");
        lIlIllll[lIllIIII[18]] = lIIlIIlIlIl("JhUVIDIPAlQzNgUGESc=", "jptTZ");
        lIlIllll[lIllIIII[19]] = lIIlIIlIlIl("NTsHLTxGIABrOw89", "fOfKZ");
        lIlIllll[lIllIIII[20]] = lIIlIIlIlIl("JyYpMC8OMWgjKwQ1LTc=", "kCHDG");
        lIlIllll[lIllIIII[38]] = lIIlIIlIlll("q4z6ra+mBys=", "KNnhm");
        lIlIllll[lIllIIII[39]] = lIIlIIlIlll("VgZq85p+Dew=", "XAcJP");
        lIlIllll[lIllIIII[40]] = lIIlIIlIlll("4MG8InLeFyNgXLqKP27YKUJgswtat+b5", "VGPMi");
    }

    private static String lIIlIIlIllI(String lIlllIlIIlIlIll, String lIlllIlIIlIlIlI) {
        try {
            SecretKeySpec lIlllIlIIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllIlIIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlllIlIIlIllIl = Cipher.getInstance("Blowfish");
            lIlllIlIIlIllIl.init(lIllIIII[2], lIlllIlIIlIlllI);
            return new String(lIlllIlIIlIllIl.doFinal(Base64.getDecoder().decode(lIlllIlIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllIlIIlIllII) {
            lIlllIlIIlIllII.printStackTrace();
            return null;
        }
    }

    public static void ag() {
        int[] iArr = new int[lIllIIII[1]];
        iArr[lIllIIII[0]] = cZ;
        if (lIIlIIlllII(Bank.contains(iArr) ? 1 : 0)) {
            bB.add(new C0003d(cZ, lIllIIII[1], lIllIIII[21]));
            "".length();
        }
        int[] iArr2 = new int[lIllIIII[1]];
        iArr2[lIllIIII[0]] = da;
        if (lIIlIIlllII(Bank.contains(iArr2) ? 1 : 0)) {
            bB.add(new C0003d(da, lIllIIII[1], lIllIIII[22]));
            "".length();
        }
        int[] iArr3 = new int[lIllIIII[1]];
        iArr3[lIllIIII[0]] = lIllIIII[8];
        if (lIIlIIlllII(Bank.contains(iArr3) ? 1 : 0)) {
            bB.add(new C0003d(lIllIIII[8], lIllIIII[1], lIllIIII[23]));
            "".length();
        }
        int[] iArr4 = new int[lIllIIII[1]];
        iArr4[lIllIIII[0]] = lIllIIII[7];
        if (lIIlIIlllII(Bank.contains(iArr4) ? 1 : 0)) {
            bB.add(new C0003d(lIllIIII[7], lIllIIII[1], lIllIIII[24]));
            "".length();
        }
        int[] iArr5 = new int[lIllIIII[1]];
        iArr5[lIllIIII[0]] = lIllIIII[25];
        if (lIIlIIlllII(Bank.contains(iArr5) ? 1 : 0)) {
            bB.add(new C0003d(lIllIIII[25], lIllIIII[5], lIllIIII[13]));
            "".length();
        }
        int[] iArr6 = new int[lIllIIII[1]];
        iArr6[lIllIIII[0]] = lIllIIII[26];
        if (lIIlIIlllII(Bank.contains(iArr6) ? 1 : 0)) {
            bB.add(new C0003d(lIllIIII[26], lIllIIII[27], lIllIIII[13]));
            "".length();
        }
        int[] iArr7 = new int[lIllIIII[1]];
        iArr7[lIllIIII[0]] = lIllIIII[28];
        if (lIIlIIlllII(Bank.contains(iArr7) ? 1 : 0)) {
            bB.add(new C0003d(lIllIIII[28], lIllIIII[29], lIllIIII[13]));
            "".length();
        }
        int[] iArr8 = new int[lIllIIII[1]];
        iArr8[lIllIIII[0]] = lIllIIII[30];
        if (lIIlIIlllII(Bank.contains(iArr8) ? 1 : 0)) {
            bB.add(new C0003d(lIllIIII[30], lIllIIII[31], lIllIIII[13]));
            "".length();
        }
        int[] iArr9 = new int[lIllIIII[1]];
        iArr9[lIllIIII[0]] = lIllIIII[25];
        if (lIIlIIllIlI(Bank.contains(iArr9) ? 1 : 0)) {
            int[] iArr10 = new int[lIllIIII[1]];
            iArr10[lIllIIII[0]] = lIllIIII[25];
            if (lIIlIIllIll(Bank.getFirst(iArr10).getQuantity(), lIllIIII[32])) {
                bB.add(new C0003d(lIllIIII[25], lIllIIII[5], lIllIIII[13]));
                "".length();
            }
        }
        int[] iArr11 = new int[lIllIIII[1]];
        iArr11[lIllIIII[0]] = lIllIIII[26];
        if (lIIlIIllIlI(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[lIllIIII[1]];
            iArr12[lIllIIII[0]] = lIllIIII[26];
            if (lIIlIIllIll(Bank.getFirst(iArr12).getQuantity(), lIllIIII[32])) {
                bB.add(new C0003d(lIllIIII[26], lIllIIII[27], lIllIIII[13]));
                "".length();
            }
        }
        int[] iArr13 = new int[lIllIIII[1]];
        iArr13[lIllIIII[0]] = lIllIIII[28];
        if (lIIlIIllIlI(Bank.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[lIllIIII[1]];
            iArr14[lIllIIII[0]] = lIllIIII[28];
            if (lIIlIIllIll(Bank.getFirst(iArr14).getQuantity(), lIllIIII[32])) {
                bB.add(new C0003d(lIllIIII[28], lIllIIII[29], lIllIIII[13]));
                "".length();
            }
        }
        int[] iArr15 = new int[lIllIIII[1]];
        iArr15[lIllIIII[0]] = lIllIIII[30];
        if (lIIlIIllIlI(Bank.contains(iArr15) ? 1 : 0)) {
            int[] iArr16 = new int[lIllIIII[1]];
            iArr16[lIllIIII[0]] = lIllIIII[30];
            if (lIIlIIllIll(Bank.getFirst(iArr16).getQuantity(), lIllIIII[32])) {
                bB.add(new C0003d(lIllIIII[30], lIllIIII[31], lIllIIII[13]));
                "".length();
            }
        }
        if (lIIlIIlllII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlIllll[lIllIIII[40]]);
        }) ? 1 : 0)) {
            bB.add(new C0003d(lIllIIII[33], lIllIIII[6], lIllIIII[34]));
            "".length();
        }
        int[] iArr17 = new int[lIllIIII[1]];
        iArr17[lIllIIII[0]] = lIllIIII[35];
        if (lIIlIIlllII(Bank.contains(iArr17) ? 1 : 0)) {
            bB.add(new C0003d(lIllIIII[35], lIllIIII[36], lIllIIII[37]));
            "".length();
        }
    }
}
