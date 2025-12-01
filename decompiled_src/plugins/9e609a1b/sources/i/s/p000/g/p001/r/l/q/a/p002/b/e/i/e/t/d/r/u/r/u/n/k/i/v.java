package i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.v  reason: invalid package */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/v.class */
public class v implements M {
    static /* synthetic */ int bY;
    private static final /* synthetic */ int fI;
    private static final /* synthetic */ WorldPoint fJ;
    static /* synthetic */ int co;
    private static /* synthetic */ int[] lIIIlllIllllI;
    static /* synthetic */ boolean cp;
    private static final /* synthetic */ int fH;
    private static final /* synthetic */ int fG;
    private static final /* synthetic */ String[] fK;
    private static /* synthetic */ String[] lIIIlllIlllIl;
    public static /* synthetic */ boolean by;
    public static /* synthetic */ List<C0003d> bA;

    /* JADX WARN: Code restructure failed: missing block: B:46:0x01c8, code lost:
        if (lIlIIlIlIIIllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.v.lIIIlllIllllI[9]) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x020a, code lost:
        if (lIlIIlIlIIIllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.v.lIIIlllIllllI[3]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x024d, code lost:
        if (lIlIIlIlIIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.v.lIIIlllIllllI[6]) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0250, code lost:
        W();
        java.lang.System.out.println(i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.v.lIIIlllIlllIl[i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.v.lIIIlllIllllI[12]]);
        i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.v.by = i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.v.lIIIlllIllllI[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x026b, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v144, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v159, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v201, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bl() {
        if (lIlIIlIlIIIIlll(by ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIlllIl[lIIIlllIllllI[0]];
            C0001b.a(bA);
            if (lIlIIlIlIIIlIII(bA.size(), lIIIlllIllllI[1])) {
                System.out.println(lIIIlllIlllIl[lIIIlllIllllI[1]]);
                by = lIIIlllIllllI[0];
            }
        }
        if (lIlIIlIlIIIlIIl(by ? 1 : 0)) {
            if (lIlIIlIlIIIIlll(Inventory.contains(C0005f.ba) ? 1 : 0) && lIlIIlIlIIIlIII(Movement.getRunEnergy(), lIIIlllIllllI[2])) {
                Inventory.getFirst(C0005f.ba).interact(lIIIlllIlllIl[lIIIlllIllllI[3]]);
                Time.sleepTicks(lIIIlllIllllI[1]);
                "".length();
            }
            if (lIlIIlIlIIIlIIl(Movement.isRunEnabled() ? 1 : 0) && lIlIIlIlIIIlIlI(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (lIlIIlIlIIIlIIl(S() ? 1 : 0) && lIlIIlIlIIIlIII(C0004e.j(lIIIlllIllllI[4]), lIIIlllIllllI[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIlIlIIIlIll(nearest) && lIlIIlIlIIIlIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIlllIl[lIIIlllIllllI[5]];
                    C0000a.a(nearest);
                    Time.sleepTicks(lIIIlllIllllI[3]);
                    "".length();
                }
                if (lIlIIlIlIIIlIll(nearest) && lIlIIlIlIIIIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIlllIl[lIIIlllIllllI[6]];
                    if (lIlIIlIlIIIlIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIlllIllllI[7]);
                        "".length();
                    }
                    if (lIlIIlIlIIIIlll(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIIlIlIIIlIlI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIlllIllllI[6]);
                            "".length();
                        }
                        if (lIlIIlIlIIIlIlI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIlllIllllI[3]);
                            "".length();
                        }
                        int[] iArr = new int[lIIIlllIllllI[1]];
                        iArr[lIIIlllIllllI[0]] = lIIIlllIllllI[8];
                        if (lIlIIlIlIIIIlll(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lIIIlllIllllI[1]];
                            iArr2[lIIIlllIllllI[0]] = lIIIlllIllllI[8];
                        }
                        int[] iArr3 = new int[lIIIlllIllllI[1]];
                        iArr3[lIIIlllIllllI[0]] = lIIIlllIllllI[10];
                        if (lIlIIlIlIIIIlll(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIIIlllIllllI[1]];
                            iArr4[lIIIlllIllllI[0]] = lIIIlllIllllI[10];
                        }
                        int[] iArr5 = new int[lIIIlllIllllI[1]];
                        iArr5[lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                        if (lIlIIlIlIIIIlll(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lIIIlllIllllI[1]];
                            iArr6[lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                        }
                        int[] iArr7 = new int[lIIIlllIllllI[6]];
                        iArr7[lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                        iArr7[lIIIlllIllllI[1]] = lIIIlllIllllI[10];
                        iArr7[lIIIlllIllllI[3]] = lIIIlllIllllI[8];
                        iArr7[lIIIlllIllllI[5]] = lIIIlllIllllI[13];
                        if (lIlIIlIlIIIlIIl(C0004e.b(iArr7) ? 1 : 0)) {
                            W();
                            System.out.println(lIIIlllIlllIl[lIIIlllIllllI[9]]);
                            by = lIIIlllIllllI[1];
                            return;
                        }
                        int[] iArr8 = new int[lIIIlllIllllI[6]];
                        iArr8[lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                        iArr8[lIIIlllIllllI[1]] = lIIIlllIllllI[10];
                        iArr8[lIIIlllIllllI[3]] = lIIIlllIllllI[8];
                        iArr8[lIIIlllIllllI[5]] = lIIIlllIllllI[13];
                        if (lIlIIlIlIIIIlll(C0004e.b(iArr8) ? 1 : 0)) {
                            C0000a.a(lIIIlllIllllI[11], lIIIlllIllllI[6]);
                            C0000a.a(lIIIlllIllllI[10], lIIIlllIllllI[3]);
                            C0000a.a(lIIIlllIllllI[8], lIIIlllIllllI[9]);
                            C0000a.a(lIIIlllIllllI[13], lIIIlllIllllI[1]);
                        }
                        if (lIlIIlIlIIIIlll(AccBuilderRat.e ? 1 : 0)) {
                            C0000a.b(C0005f.bk, lIIIlllIllllI[1]);
                        }
                    }
                }
            }
            if (lIlIIlIlIIIlIIl(S() ? 1 : 0) && lIlIIlIlIIIlIlI(C0004e.j(lIIIlllIllllI[4])) && lIlIIlIlIIIllIl(Players.getLocal().getWorldLocation().distanceTo(fJ), lIIIlllIllllI[12])) {
                bm();
            }
            if ((!lIlIIlIlIIIlIIl(S() ? 1 : 0) || lIlIIlIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(fJ), lIIIlllIllllI[12])) && lIlIIlIlIIIlIII(C0004e.j(lIIIlllIllllI[4]), lIIIlllIllllI[14])) {
                if (lIlIIlIlIIIllIl(Players.getLocal().getWorldLocation().distanceTo(fJ), lIIIlllIllllI[6])) {
                    co = lIIIlllIllllI[0];
                    AccBuilderRat.c = lIIIlllIlllIl[lIIIlllIllllI[15]];
                    if (lIlIIlIlIIIlIII(bY, lIIIlllIllllI[1])) {
                        C0004e.w();
                        bY += lIIIlllIllllI[1];
                    }
                    Movement.walkTo(fJ);
                    "".length();
                }
                if (lIlIIlIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(fJ), lIIIlllIllllI[9])) {
                    AccBuilderRat.c = lIIIlllIlllIl[lIIIlllIllllI[16]];
                    String[] strArr = new String[lIIIlllIllllI[1]];
                    strArr[lIIIlllIllllI[0]] = lIIIlllIlllIl[lIIIlllIllllI[17]];
                    TileObject nearest2 = TileObjects.getNearest(strArr);
                    if (lIlIIlIlIIIlIll(nearest2)) {
                        String[] strArr2 = new String[lIIIlllIllllI[1]];
                        strArr2[lIIIlllIllllI[0]] = lIIIlllIlllIl[lIIIlllIllllI[18]];
                        if (lIlIIlIlIIIIlll(nearest2.hasAction(strArr2) ? 1 : 0)) {
                            nearest2.interact(lIIIlllIlllIl[lIIIlllIllllI[19]]);
                            Time.sleepTicks(lIIIlllIllllI[5]);
                            "".length();
                        }
                    }
                    if (lIlIIlIlIIIlIII(co, lIIIlllIllllI[1])) {
                        P.lA += lIIIlllIllllI[1];
                        P.d(AccBuilderRat.m);
                        co += lIIIlllIllllI[1];
                        P.lA = lIIIlllIllllI[0];
                        cp = lIIIlllIllllI[0];
                    }
                    C0006g.a(lIIIlllIlllIl[lIIIlllIllllI[20]], fK);
                }
            }
            C0006g.a(new String[lIIIlllIllllI[0]]);
        }
        System.out.println("Setting: " + C0004e.j(lIIIlllIllllI[4]));
    }

    private static void lIlIIlIlIIIIllI() {
        lIIIlllIllllI = new int[39];
        lIIIlllIllllI[0] = ((((31 + 19) - (-171)) + 23) ^ (((155 + 76) - 129) + 70)) & (((144 ^ 132) ^ (39 ^ 107)) ^ (-" ".length()));
        lIIIlllIllllI[1] = " ".length();
        lIIIlllIllllI[2] = (130 ^ 162) ^ (160 ^ 178);
        lIIIlllIllllI[3] = "  ".length();
        lIIIlllIllllI[4] = 42 ^ 53;
        lIIIlllIllllI[5] = "   ".length();
        lIIIlllIllllI[6] = 154 ^ 158;
        lIIIlllIllllI[7] = (-27687) & 32686;
        lIIIlllIllllI[8] = (-((-25481) & 32650)) & (-8777) & 16379;
        lIIIlllIllllI[9] = 102 ^ 96;
        lIIIlllIllllI[10] = (-12804) & 13243;
        lIIIlllIllllI[11] = (-((-4611) & 30283)) & (-6657) & 32764;
        lIIIlllIllllI[12] = 198 ^ 195;
        lIIIlllIllllI[13] = (-((-12115) & 28503)) & (-8321) & 32717;
        lIIIlllIllllI[14] = (240 ^ 182) ^ (171 ^ 137);
        lIIIlllIllllI[15] = (((118 + 34) - 123) + 110) ^ (((136 + 19) - 122) + 107);
        lIIIlllIllllI[16] = (63 ^ 103) ^ (229 ^ 181);
        lIIIlllIllllI[17] = 172 ^ 165;
        lIIIlllIllllI[18] = (199 ^ 142) ^ (193 ^ 130);
        lIIIlllIllllI[19] = (87 ^ 23) ^ (120 ^ 51);
        lIIIlllIllllI[20] = (73 ^ 90) ^ (120 ^ 103);
        lIIIlllIllllI[21] = 33 ^ 44;
        lIIIlllIllllI[22] = 95 ^ 81;
        lIIIlllIllllI[23] = (35 ^ 49) ^ (173 ^ 176);
        lIIIlllIllllI[24] = (-19980) & 20479;
        lIIIlllIllllI[25] = (-305) & 12284;
        lIIIlllIllllI[26] = (-((-2497) & 4051)) & (-4098) & 30651;
        lIIIlllIllllI[27] = (-((-2245) & 10445)) & (-16513) & 32719;
        lIIIlllIllllI[28] = 77 ^ 101;
        lIIIlllIllllI[29] = (-((-5259) & 32430)) & (-4097) & 32767;
        lIIIlllIllllI[30] = 8 ^ 24;
        lIIIlllIllllI[31] = 39 ^ 54;
        lIIIlllIllllI[32] = (-((-14773) & 32253)) & (-49) & 20479;
        lIIIlllIllllI[33] = (-((-1313) & 14241)) & (-1) & 16379;
        lIIIlllIllllI[34] = 123 ^ 105;
        lIIIlllIllllI[35] = (218 ^ 129) ^ (205 ^ 133);
        lIIIlllIllllI[36] = (230 ^ 161) ^ (111 ^ 60);
        lIIIlllIllllI[37] = (78 ^ 66) ^ (69 ^ 92);
        lIIIlllIllllI[38] = 175 ^ 185;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e5, code lost:
        if (lIlIIlIlIIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.v.lIIIlllIllllI[3]) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x016d, code lost:
        if (lIlIIlIlIIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.v.lIIIlllIllllI[6]) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (lIlIIlIlIIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.v.lIIIlllIllllI[9]) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void W() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = new int[lIIIlllIllllI[1]];
        iArr5[lIIIlllIllllI[0]] = lIIIlllIllllI[8];
        if (lIlIIlIlIIIIlll(Bank.contains(iArr5) ? 1 : 0)) {
            int[] iArr6 = new int[lIIIlllIllllI[1]];
            iArr6[lIIIlllIllllI[0]] = lIIIlllIllllI[8];
            if (lIlIIlIlIIIIlll(Bank.contains(iArr6) ? 1 : 0)) {
                int[] iArr7 = new int[lIIIlllIllllI[1]];
                iArr7[lIIIlllIllllI[0]] = lIIIlllIllllI[8];
            }
            iArr = new int[lIIIlllIllllI[1]];
            iArr[lIIIlllIllllI[0]] = lIIIlllIllllI[10];
            if (lIlIIlIlIIIIlll(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr8 = new int[lIIIlllIllllI[1]];
                iArr8[lIIIlllIllllI[0]] = lIIIlllIllllI[10];
                if (lIlIIlIlIIIIlll(Bank.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[lIIIlllIllllI[1]];
                    iArr9[lIIIlllIllllI[0]] = lIIIlllIllllI[10];
                }
                iArr2 = new int[lIIIlllIllllI[1]];
                iArr2[lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                if (lIlIIlIlIIIIlll(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIIlllIllllI[1]];
                    iArr10[lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                    if (lIlIIlIlIIIIlll(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIIIlllIllllI[1]];
                        iArr11[lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                    }
                    iArr3 = new int[lIIIlllIllllI[1]];
                    iArr3[lIIIlllIllllI[0]] = lIIIlllIllllI[13];
                    if (lIlIIlIlIIIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
                        bA.add(new C0003d(lIIIlllIllllI[13], lIIIlllIllllI[12], lIIIlllIllllI[7]));
                        "".length();
                    }
                    if (lIlIIlIlIIIlIIl(Bank.contains(item -> {
                        return item.getName().toLowerCase().contains(lIIIlllIlllIl[lIIIlllIllllI[31]]);
                    }) ? 1 : 0)) {
                        bA.add(new C0003d(lIIIlllIllllI[25], lIIIlllIllllI[12], lIIIlllIllllI[26]));
                        "".length();
                    }
                    iArr4 = new int[lIIIlllIllllI[1]];
                    iArr4[lIIIlllIllllI[0]] = lIIIlllIllllI[27];
                    if (lIlIIlIlIIIlIIl(Bank.contains(iArr4) ? 1 : 0)) {
                        return;
                    }
                    bA.add(new C0003d(lIIIlllIllllI[27], lIIIlllIllllI[28], lIIIlllIllllI[29]));
                    "".length();
                    return;
                }
                bA.add(new C0003d(lIIIlllIllllI[11], lIIIlllIllllI[6], lIIIlllIllllI[24]));
                "".length();
                iArr3 = new int[lIIIlllIllllI[1]];
                iArr3[lIIIlllIllllI[0]] = lIIIlllIllllI[13];
                if (lIlIIlIlIIIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
                }
                if (lIlIIlIlIIIlIIl(Bank.contains(item2 -> {
                    return item2.getName().toLowerCase().contains(lIIIlllIlllIl[lIIIlllIllllI[31]]);
                }) ? 1 : 0)) {
                }
                iArr4 = new int[lIIIlllIllllI[1]];
                iArr4[lIIIlllIllllI[0]] = lIIIlllIllllI[27];
                if (lIlIIlIlIIIlIIl(Bank.contains(iArr4) ? 1 : 0)) {
                }
            }
            bA.add(new C0003d(lIIIlllIllllI[10], lIIIlllIllllI[3], lIIIlllIllllI[24]));
            "".length();
            iArr2 = new int[lIIIlllIllllI[1]];
            iArr2[lIIIlllIllllI[0]] = lIIIlllIllllI[11];
            if (lIlIIlIlIIIIlll(Bank.contains(iArr2) ? 1 : 0)) {
            }
            bA.add(new C0003d(lIIIlllIllllI[11], lIIIlllIllllI[6], lIIIlllIllllI[24]));
            "".length();
            iArr3 = new int[lIIIlllIllllI[1]];
            iArr3[lIIIlllIllllI[0]] = lIIIlllIllllI[13];
            if (lIlIIlIlIIIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
            }
            if (lIlIIlIlIIIlIIl(Bank.contains(item22 -> {
                return item22.getName().toLowerCase().contains(lIIIlllIlllIl[lIIIlllIllllI[31]]);
            }) ? 1 : 0)) {
            }
            iArr4 = new int[lIIIlllIllllI[1]];
            iArr4[lIIIlllIllllI[0]] = lIIIlllIllllI[27];
            if (lIlIIlIlIIIlIIl(Bank.contains(iArr4) ? 1 : 0)) {
            }
        }
        bA.add(new C0003d(lIIIlllIllllI[8], lIIIlllIllllI[9], lIIIlllIllllI[24]));
        "".length();
        iArr = new int[lIIIlllIllllI[1]];
        iArr[lIIIlllIllllI[0]] = lIIIlllIllllI[10];
        if (lIlIIlIlIIIIlll(Bank.contains(iArr) ? 1 : 0)) {
        }
        bA.add(new C0003d(lIIIlllIllllI[10], lIIIlllIllllI[3], lIIIlllIllllI[24]));
        "".length();
        iArr2 = new int[lIIIlllIllllI[1]];
        iArr2[lIIIlllIllllI[0]] = lIIIlllIllllI[11];
        if (lIlIIlIlIIIIlll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bA.add(new C0003d(lIIIlllIllllI[11], lIIIlllIllllI[6], lIIIlllIllllI[24]));
        "".length();
        iArr3 = new int[lIIIlllIllllI[1]];
        iArr3[lIIIlllIllllI[0]] = lIIIlllIllllI[13];
        if (lIlIIlIlIIIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
        }
        if (lIlIIlIlIIIlIIl(Bank.contains(item222 -> {
            return item222.getName().toLowerCase().contains(lIIIlllIlllIl[lIIIlllIllllI[31]]);
        }) ? 1 : 0)) {
        }
        iArr4 = new int[lIIIlllIllllI[1]];
        iArr4[lIIIlllIllllI[0]] = lIIIlllIllllI[27];
        if (lIlIIlIlIIIlIIl(Bank.contains(iArr4) ? 1 : 0)) {
        }
    }

    private static void lIlIIlIlIIIIlIl() {
        lIIIlllIlllIl = new String[lIIIlllIllllI[38]];
        lIIIlllIlllIl[lIIIlllIllllI[0]] = lIlIIlIlIIIIIlI("1/+1f558mzi2YolpdA8zWw==", "Ulfwl");
        lIIIlllIlllIl[lIIIlllIllllI[1]] = lIlIIlIlIIIIIlI("RrdywXVouG/Zgk8+l1RiMn3jTqUrl2kLWPI6wjKdHFXPIstioPPKhFvKbSYNBCTL", "ZuGpG");
        lIIIlllIlllIl[lIIIlllIllllI[3]] = lIlIIlIlIIIIIll("LzANJSo=", "kBdKA");
        lIIIlllIlllIl[lIIIlllIllllI[5]] = lIlIIlIlIIIIlII("wwpujdJ6osBIq67qYQCEhQ==", "PFimI");
        lIIIlllIlllIl[lIIIlllIllllI[6]] = lIlIIlIlIIIIIll("LTUgMiIMOil2LAQ6JT8gAg==", "eTNVN");
        lIIIlllIlllIl[lIIIlllIllllI[12]] = lIlIIlIlIIIIIlI("xzO3UTdBeax98ByacUaCH9EPpQBQwqKBdNXadHhFgV7I4iTv3YzdCkONwA2ZtGJh47IagE/8FiU=", "qvEyf");
        lIIIlllIlllIl[lIIIlllIllllI[9]] = lIlIIlIlIIIIIlI("NGgv4w9pHUzvH2YlBMoOGreOLm8BGQR7ZCHbHaQlCbyqxARkEbiUNB7hHry4vjeaaUFxAvAibvQ=", "CIUNk");
        lIIIlllIlllIl[lIIIlllIllllI[15]] = lIlIIlIlIIIIIll("PCo9VTkdazgBLAA/", "rKKuM");
        lIIIlllIlllIl[lIIIlllIllllI[16]] = lIlIIlIlIIIIlII("Itj2ewnPiRw7ENeGWFtC4g==", "kDxZw");
        lIIIlllIlllIl[lIIIlllIllllI[17]] = lIlIIlIlIIIIIll("NgIoEQ==", "rmGcp");
        lIIIlllIlllIl[lIIIlllIllllI[18]] = lIlIIlIlIIIIIll("HiMkNw==", "QSAYT");
        lIIIlllIlllIl[lIIIlllIllllI[19]] = lIlIIlIlIIIIIlI("cn14CDKUUw8=", "WEuED");
        lIIIlllIlllIl[lIIIlllIllllI[20]] = lIlIIlIlIIIIIlI("U/jazuPJe9E=", "YxUTx");
        lIIIlllIlllIl[lIIIlllIllllI[21]] = lIlIIlIlIIIIlII("79KwCal2moxnlc2tDOVt3w==", "nnZym");
        lIIIlllIlllIl[lIIIlllIllllI[22]] = lIlIIlIlIIIIIll("KgQiHiMLCytaLQMLJxMhBQ==", "beLzO");
        lIIIlllIlllIl[lIIIlllIllllI[23]] = lIlIIlIlIIIIIlI("bWrSMSLjpXNpxDoKZxtdYPKlAonsrUCv+/8J53gcG3XCGMPK5y1Fk/6vczJxZ1B7sLJiJ4Lfq1I=", "wKjtl");
        lIIIlllIlllIl[lIIIlllIllllI[30]] = lIlIIlIlIIIIIll("LhUkLyQZWiczIhkO", "jzVFG");
        lIIIlllIlllIl[lIIIlllIllllI[31]] = lIlIIlIlIIIIIlI("IoaPOQmqoN4JNw30b06xjF21GCjMGGNu", "aISpn");
        lIIIlllIlllIl[lIIIlllIllllI[34]] = lIlIIlIlIIIIlII("vuFS2BOw+qf33pSMSE+osvOVo8eBKp+67PaLVYSYIXo=", "lArJC");
        lIIIlllIlllIl[lIIIlllIllllI[35]] = lIlIIlIlIIIIlII("b1CWRIiRnnfVu3lw/6Ih+tARGSXmnJsv4Ldo1e4CyQkePjfzVOOE1w==", "opiIX");
        lIIIlllIlllIl[lIIIlllIllllI[36]] = lIlIIlIlIIIIlII("9fHUobo1m10eOUt7ezq7vLF0RZ970+wCv/Ks9TKZTvs=", "QzNsk");
        lIIIlllIlllIl[lIIIlllIllllI[37]] = lIlIIlIlIIIIIll("MAEcfg==", "idoPL");
    }

    private static String lIlIIlIlIIIIIll(String lllllllllllllllIIIIIlIIIllIlIIII, String lllllllllllllllIIIIIlIIIllIIlIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIlIIIllIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIIlIIIllIIlllI = new StringBuilder();
        char[] lllllllllllllllIIIIIlIIIllIIllIl = lllllllllllllllIIIIIlIIIllIIlIlI.toCharArray();
        int lllllllllllllllIIIIIlIIIllIIllII = lIIIlllIllllI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = lIIIlllIllllI[0];
        while (lIlIIlIlIIIlIII(i2, length)) {
            char lllllllllllllllIIIIIlIIIllIlIIIl = charArray[i2];
            lllllllllllllllIIIIIlIIIllIIlllI.append((char) (lllllllllllllllIIIIIlIIIllIlIIIl ^ lllllllllllllllIIIIIlIIIllIIllIl[lllllllllllllllIIIIIlIIIllIIllII % lllllllllllllllIIIIIlIIIllIIllIl.length]));
            "".length();
            lllllllllllllllIIIIIlIIIllIIllII++;
            i2++;
            "".length();
            if ("  ".length() <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIIlIIIllIIlllI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean aa() {
        if (lIlIIlIlIIIllII(C0004e.j(lIIIlllIllllI[4]), lIIIlllIllllI[14])) {
            ?? r0 = lIIIlllIllllI[1];
            "".length();
            return "   ".length() > "   ".length() ? ((204 ^ 196) ^ (92 ^ 102)) & (((((133 + 87) - 171) + 142) ^ (((111 + 132) - 212) + 110)) ^ (-" ".length())) : r0;
        }
        return lIIIlllIllllI[0];
    }

    private static boolean lIlIIlIlIIIlIlI(int i2) {
        return i2 > 0;
    }

    static {
        lIlIIlIlIIIIllI();
        lIlIIlIlIIIIlIl();
        fG = lIIIlllIllllI[8];
        fH = lIIIlllIllllI[10];
        fI = lIIIlllIllllI[11];
        fJ = new WorldPoint(lIIIlllIllllI[32], lIIIlllIllllI[33], lIIIlllIllllI[0]);
        String[] strArr = new String[lIIIlllIllllI[6]];
        strArr[lIIIlllIllllI[0]] = lIIIlllIlllIl[lIIIlllIllllI[34]];
        strArr[lIIIlllIllllI[1]] = lIIIlllIlllIl[lIIIlllIllllI[35]];
        strArr[lIIIlllIllllI[3]] = lIIIlllIlllIl[lIIIlllIllllI[36]];
        strArr[lIIIlllIllllI[5]] = lIIIlllIlllIl[lIIIlllIllllI[37]];
        fK = strArr;
        bA = new ArrayList();
        bY = lIIIlllIllllI[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean S() {
        int[] iArr = new int[lIIIlllIllllI[1]];
        iArr[lIIIlllIllllI[0]] = lIIIlllIllllI[8];
        if (lIlIIlIlIIIllII(Inventory.getCount(iArr), lIIIlllIllllI[9])) {
            int[] iArr2 = new int[lIIIlllIllllI[1]];
            iArr2[lIIIlllIllllI[0]] = lIIIlllIllllI[10];
            if (lIlIIlIlIIIllII(Inventory.getCount(iArr2), lIIIlllIllllI[3])) {
                int[] iArr3 = new int[lIIIlllIllllI[1]];
                iArr3[lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                if (lIlIIlIlIIIllII(Inventory.getCount(iArr3), lIIIlllIllllI[6])) {
                    ?? r0 = lIIIlllIllllI[1];
                    "".length();
                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return lIIIlllIllllI[0];
    }

    private static boolean lIlIIlIlIIIllII(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean lIlIIlIlIIIIlll(int i2) {
        return i2 != 0;
    }

    private static boolean lIlIIlIlIIIlllI(int i2, int i3) {
        return i2 <= i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean X() {
        return lIIIlllIllllI[0];
    }

    private static boolean lIlIIlIlIIIlIIl(int i2) {
        return i2 == 0;
    }

    private static String lIlIIlIlIIIIIlI(String lllllllllllllllIIIIIlIIIlIlllIll, String lllllllllllllllIIIIIlIIIlIlllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlIIIlIlllIlI.getBytes(StandardCharsets.UTF_8)), lIIIlllIllllI[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIlllIllllI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlIIIlIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIlIIIlIllllII) {
            lllllllllllllllIIIIIlIIIlIllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIlIIIlIll(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIlIlIIIlIII(int i2, int i3) {
        return i2 < i3;
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public int Y() {
        try {
            bl();
            "".length();
            if ("  ".length() >= "   ".length()) {
                return (35 ^ 117) & ((202 ^ 156) ^ (-1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lIIIlllIllllI[18];
    }

    private static String lIlIIlIlIIIIlII(String lllllllllllllllIIIIIlIIIlllIIIII, String lllllllllllllllIIIIIlIIIllIlllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlIIIllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIlllIllllI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlIIIlllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIlIIIlllIIIIl) {
            lllllllllllllllIIIIIlIIIlllIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIlIIIllIl(int i2, int i3) {
        return i2 > i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    private static void bm() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIlIIlIlIIIlIll(nearest) && lIlIIlIlIIIlIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIlllIl[lIIIlllIllllI[21]];
            C0000a.a(nearest);
            Time.sleepTicks(lIIIlllIllllI[3]);
            "".length();
        }
        if (lIlIIlIlIIIlIll(nearest) && lIlIIlIlIIIIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIlllIl[lIIIlllIllllI[22]];
            if (lIlIIlIlIIIlIIl(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIIIlllIllllI[7]);
                "".length();
            }
            if (lIlIIlIlIIIIlll(Bank.isOpen() ? 1 : 0)) {
                if (lIlIIlIlIIIlIlI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lIIIlllIllllI[6]);
                    "".length();
                }
                if (lIlIIlIlIIIlIlI(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(lIIIlllIllllI[3]);
                    "".length();
                }
                int[] iArr = new int[lIIIlllIllllI[6]];
                iArr[lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                iArr[lIIIlllIllllI[1]] = lIIIlllIllllI[10];
                iArr[lIIIlllIllllI[3]] = lIIIlllIllllI[8];
                iArr[lIIIlllIllllI[5]] = lIIIlllIllllI[13];
                if (lIlIIlIlIIIlIIl(C0004e.b(iArr) ? 1 : 0)) {
                    W();
                    System.out.println(lIIIlllIlllIl[lIIIlllIllllI[23]]);
                    by = lIIIlllIllllI[1];
                    return;
                }
                int[] iArr2 = new int[lIIIlllIllllI[6]];
                iArr2[lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                iArr2[lIIIlllIllllI[1]] = lIIIlllIllllI[10];
                iArr2[lIIIlllIllllI[3]] = lIIIlllIllllI[8];
                iArr2[lIIIlllIllllI[5]] = lIIIlllIllllI[13];
                if (lIlIIlIlIIIIlll(C0004e.b(iArr2) ? 1 : 0)) {
                    C0000a.a(lIIIlllIllllI[11], lIIIlllIllllI[6]);
                    C0000a.a(lIIIlllIllllI[10], lIIIlllIllllI[3]);
                    C0000a.a(lIIIlllIllllI[8], lIIIlllIllllI[9]);
                    C0000a.a(lIIIlllIllllI[13], lIIIlllIllllI[1]);
                }
                C0000a.b(C0005f.bk, lIIIlllIllllI[1]);
            }
        }
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public String Z() {
        return lIIIlllIlllIl[lIIIlllIllllI[30]];
    }
}
