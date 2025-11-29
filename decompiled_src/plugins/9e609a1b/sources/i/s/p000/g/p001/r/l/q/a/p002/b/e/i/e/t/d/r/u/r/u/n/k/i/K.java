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
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.K  reason: invalid package */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/K.class */
public class K implements M {
    static /* synthetic */ int co;
    public static final /* synthetic */ WorldPoint hU;
    private static final /* synthetic */ String[] hW;
    public static /* synthetic */ List<C0003d> bA;
    public static final /* synthetic */ WorldPoint hT;
    private static /* synthetic */ int[] lIIIllllIllIl;
    public static /* synthetic */ boolean by;
    static /* synthetic */ boolean cp;
    static /* synthetic */ int bY;
    public static final /* synthetic */ WorldPoint hV;
    private static /* synthetic */ String[] lIIIllllIlIlI;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x010d, code lost:
        if (lIlIIlIllllllII(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x04db, code lost:
        if (lIlIIlIllllllII(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v163, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v364, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v61, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void cz() {
        if (lIlIIlIlllllIII(by ? 1 : 0)) {
            AccBuilderRat.c = lIIIllllIlIlI[lIIIllllIllIl[0]];
            C0001b.a(bA);
            if (lIlIIlIlllllIIl(bA.size(), lIIIllllIllIl[1])) {
                System.out.println(lIIIllllIlIlI[lIIIllllIllIl[1]]);
                by = lIIIllllIllIl[0];
            }
        }
        if (lIlIIlIlllllIlI(by ? 1 : 0)) {
            if (lIlIIlIlllllIII(Inventory.contains(C0005f.ba) ? 1 : 0) && lIlIIlIlllllIIl(Movement.getRunEnergy(), lIIIllllIllIl[2])) {
                Inventory.getFirst(C0005f.ba).interact(lIIIllllIlIlI[lIIIllllIllIl[3]]);
                Time.sleepTicks(lIIIllllIllIl[1]);
                "".length();
            }
            if (lIlIIlIlllllIll(lIlIIlIllllIlll(C0004e.v(), 70.0d))) {
                int[] iArr = new int[lIIIllllIllIl[1]];
                iArr[lIIIllllIllIl[0]] = lIIIllllIllIl[4];
                if (lIlIIlIlllllIII(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIIIllllIllIl[1]];
                    iArr2[lIIIllllIllIl[0]] = lIIIllllIllIl[4];
                    Inventory.getFirst(iArr2).interact(lIIIllllIlIlI[lIIIllllIllIl[5]]);
                }
            }
            if (lIlIIlIlllllIlI(Movement.isRunEnabled() ? 1 : 0) && lIlIIlIllllllII(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (lIlIIlIlllllIII(S() ? 1 : 0)) {
                int[] iArr3 = new int[lIIIllllIllIl[1]];
                iArr3[lIIIllllIllIl[0]] = lIIIllllIllIl[6];
            }
            if (lIlIIlIlllllIIl(C0004e.j(lIIIllllIllIl[7]), lIIIllllIllIl[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIlIllllllIl(nearest) && lIlIIlIlllllIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllIlIlI[lIIIllllIllIl[8]];
                    Movement.walkTo(nearest);
                    "".length();
                    Time.sleepTicks(lIIIllllIllIl[3]);
                    "".length();
                }
                if (lIlIIlIllllllIl(nearest) && lIlIIlIlllllIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllIlIlI[lIIIllllIllIl[9]];
                    if (lIlIIlIlllllIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIllllIllIl[10]);
                        "".length();
                    }
                    if (lIlIIlIlllllIII(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIIlIllllllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIllllIllIl[8]);
                            "".length();
                        }
                        if (lIlIIlIllllllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIllllIllIl[3]);
                            "".length();
                        }
                        int[] iArr4 = new int[lIIIllllIllIl[9]];
                        iArr4[lIIIllllIllIl[0]] = lIIIllllIllIl[11];
                        iArr4[lIIIllllIllIl[1]] = lIIIllllIllIl[12];
                        iArr4[lIIIllllIllIl[3]] = lIIIllllIllIl[13];
                        iArr4[lIIIllllIllIl[5]] = lIIIllllIllIl[14];
                        iArr4[lIIIllllIllIl[8]] = lIIIllllIllIl[15];
                        if (lIlIIlIlllllIlI(C0004e.b(iArr4) ? 1 : 0)) {
                            W();
                            System.out.println(lIIIllllIlIlI[lIIIllllIllIl[16]]);
                            by = lIIIllllIllIl[1];
                            return;
                        }
                        Bank.withdraw(lIIIllllIllIl[11], lIIIllllIllIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllIllIl[1]);
                        "".length();
                        Bank.withdraw(lIIIllllIllIl[14], lIIIllllIllIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllIllIl[1]);
                        "".length();
                        Bank.withdraw(lIIIllllIllIl[15], lIIIllllIllIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllIllIl[1]);
                        "".length();
                        Bank.withdraw(lIIIllllIllIl[17], lIIIllllIllIl[18], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllIllIl[1]);
                        "".length();
                        Bank.withdraw(lIIIllllIllIl[13], lIIIllllIllIl[9], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllIllIl[1]);
                        "".length();
                        C0000a.b(C0005f.ba, lIIIllllIllIl[1]);
                        C0000a.a(lIIIllllIllIl[4], lIIIllllIllIl[18]);
                        C0000a.b(C0005f.bk, lIIIllllIllIl[1]);
                    }
                }
            }
            if (lIlIIlIlllllIIl(C0004e.j(lIIIllllIllIl[7]), lIIIllllIllIl[1]) && lIlIIlIlllllIII(S() ? 1 : 0)) {
                if (lIlIIlIlllllllI(Players.getLocal().getWorldLocation().distanceTo(hT), lIIIllllIllIl[5])) {
                    AccBuilderRat.c = lIIIllllIlIlI[lIIIllllIllIl[19]];
                    if (lIlIIlIlllllIIl(bY, lIIIllllIllIl[1])) {
                        C0004e.w();
                        bY += lIIIllllIllIl[1];
                    }
                    Movement.walkTo(hT);
                    "".length();
                    Time.sleepTicks(lIIIllllIllIl[1]);
                    "".length();
                }
                if (lIlIIlIllllllll(Players.getLocal().getWorldLocation().distanceTo(hT), lIIIllllIllIl[9])) {
                    AccBuilderRat.c = lIIIllllIlIlI[lIIIllllIllIl[20]];
                    String[] strArr = new String[lIIIllllIllIl[1]];
                    strArr[lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[21]];
                    TileObject nearest2 = TileObjects.getNearest(strArr);
                    if (lIlIIlIllllllIl(nearest2)) {
                        String[] strArr2 = new String[lIIIllllIllIl[1]];
                        strArr2[lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[18]];
                        if (lIlIIlIlllllIII(nearest2.hasAction(strArr2) ? 1 : 0) && lIlIIlIllllllll(nearest2.getWorldLocation().distanceTo(hT), lIIIllllIllIl[16])) {
                            nearest2.interact(lIIIllllIlIlI[lIIIllllIllIl[22]]);
                            Time.sleepTicks(lIIIllllIllIl[5]);
                            "".length();
                        }
                    }
                    C0006g.a(lIIIllllIlIlI[lIIIllllIllIl[23]], hW, lIIIllllIllIl[1]);
                }
            }
            if (lIlIIllIIIIIIII(C0004e.j(lIIIllllIllIl[7]), lIIIllllIllIl[1])) {
                String[] strArr3 = new String[lIIIllllIllIl[1]];
                strArr3[lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[24]];
                if (lIlIIlIlllllIIl(Inventory.getCount(strArr3), lIIIllllIllIl[1])) {
                    String[] strArr4 = new String[lIIIllllIllIl[1]];
                    strArr4[lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[25]];
                    if (lIlIIllIIIIIIIl(Inventory.getCount(strArr4))) {
                        String[] strArr5 = new String[lIIIllllIllIl[1]];
                        strArr5[lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[26]];
                    }
                    co = lIIIllllIllIl[0];
                    if (lIlIIlIlllllllI(Players.getLocal().getWorldLocation().distanceTo(hU), lIIIllllIllIl[3])) {
                        AccBuilderRat.c = lIIIllllIlIlI[lIIIllllIllIl[27]];
                        Movement.walkTo(hU);
                        "".length();
                        Time.sleepTicks(lIIIllllIllIl[1]);
                        "".length();
                    }
                    if (lIlIIlIllllllll(Players.getLocal().getWorldLocation().distanceTo(hU), lIIIllllIllIl[3])) {
                        String[] strArr6 = new String[lIIIllllIllIl[1]];
                        strArr6[lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[28]];
                        Item first = Inventory.getFirst(strArr6);
                        String[] strArr7 = new String[lIIIllllIllIl[1]];
                        strArr7[lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[29]];
                        Item first2 = Inventory.getFirst(strArr7);
                        if (lIlIIlIllllllIl(first)) {
                            String[] strArr8 = new String[lIIIllllIllIl[1]];
                            strArr8[lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[30]];
                            first.useOn(TileObjects.getNearest(strArr8));
                            Time.sleepTicks(lIIIllllIllIl[3]);
                            "".length();
                        }
                        if (lIlIIlIllllllIl(first2)) {
                            String[] strArr9 = new String[lIIIllllIllIl[1]];
                            strArr9[lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[31]];
                            first2.useOn(TileObjects.getNearest(strArr9));
                            Time.sleepTicks(lIIIllllIllIl[3]);
                            "".length();
                        }
                        Keyboard.type(lIIIllllIlIlI[lIIIllllIllIl[32]]);
                    }
                }
            }
            if (lIlIIllIIIIIIII(C0004e.j(lIIIllllIllIl[7]), lIIIllllIllIl[1])) {
                String[] strArr10 = new String[lIIIllllIllIl[1]];
                strArr10[lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[33]];
                if (lIlIIlIllllllII(Inventory.getCount(strArr10))) {
                    String[] strArr11 = new String[lIIIllllIllIl[1]];
                    strArr11[lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[34]];
                    if (lIlIIlIlllllIIl(Inventory.getCount(strArr11), lIIIllllIllIl[1])) {
                        if (lIlIIlIlllllllI(Players.getLocal().getWorldLocation().distanceTo(hV), lIIIllllIllIl[3])) {
                            AccBuilderRat.c = lIIIllllIlIlI[lIIIllllIllIl[35]];
                            Movement.walkTo(hV);
                            "".length();
                            Time.sleepTicks(lIIIllllIllIl[1]);
                            "".length();
                        }
                        if (lIlIIlIllllllll(Players.getLocal().getWorldLocation().distanceTo(hV), lIIIllllIllIl[3])) {
                            String[] strArr12 = new String[lIIIllllIllIl[1]];
                            strArr12[lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[36]];
                            TileItem nearest3 = TileItems.getNearest(strArr12);
                            if (lIlIIllIIIIIIlI(nearest3)) {
                                String[] strArr13 = new String[lIIIllllIllIl[1]];
                                strArr13[lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[37]];
                                NPCs.getNearest(strArr13).interact(lIIIllllIlIlI[lIIIllllIllIl[38]]);
                                Time.sleepTicks(lIIIllllIllIl[9]);
                                "".length();
                            }
                            if (lIlIIlIllllllIl(nearest3)) {
                                nearest3.interact(lIIIllllIlIlI[lIIIllllIllIl[39]]);
                                Time.sleepTicks(lIIIllllIllIl[3]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (lIlIIllIIIIIIII(C0004e.j(lIIIllllIllIl[7]), lIIIllllIllIl[1])) {
                String[] strArr14 = new String[lIIIllllIllIl[1]];
                strArr14[lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[40]];
                if (lIlIIlIllllllII(Inventory.getCount(strArr14))) {
                    String[] strArr15 = new String[lIIIllllIllIl[1]];
                    strArr15[lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[41]];
                    if (lIlIIlIllllllII(Inventory.getCount(strArr15))) {
                        if (lIlIIlIlllllllI(Players.getLocal().getWorldLocation().distanceTo(hT), lIIIllllIllIl[5])) {
                            AccBuilderRat.c = lIIIllllIlIlI[lIIIllllIllIl[42]];
                            Movement.walkTo(hT);
                            "".length();
                            Time.sleepTicks(lIIIllllIllIl[1]);
                            "".length();
                        }
                        if (lIlIIlIllllllll(Players.getLocal().getWorldLocation().distanceTo(hT), lIIIllllIllIl[9])) {
                            AccBuilderRat.c = lIIIllllIlIlI[lIIIllllIllIl[43]];
                            C0006g.a(lIIIllllIlIlI[lIIIllllIllIl[44]], hW, lIIIllllIllIl[1]);
                        }
                    }
                }
            }
            if (lIlIIllIIIIIIII(C0004e.j(lIIIllllIllIl[7]), lIIIllllIllIl[3])) {
                String[] strArr16 = new String[lIIIllllIllIl[1]];
                strArr16[lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[45]];
                TileObject nearest4 = TileObjects.getNearest(strArr16);
                if (lIlIIlIllllllIl(nearest4)) {
                    String[] strArr17 = new String[lIIIllllIllIl[1]];
                    strArr17[lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[46]];
                    if (lIlIIlIlllllIII(nearest4.hasAction(strArr17) ? 1 : 0)) {
                        if (lIlIIlIlllllIIl(co, lIIIllllIllIl[1])) {
                            P.ll += lIIIllllIllIl[1];
                            P.d(AccBuilderRat.m);
                            co += lIIIllllIllIl[1];
                            P.ll = lIIIllllIllIl[0];
                            cp = lIIIllllIllIl[0];
                        }
                        nearest4.interact(lIIIllllIlIlI[lIIIllllIllIl[47]]);
                        Time.sleepTicks(lIIIllllIllIl[5]);
                        "".length();
                    }
                }
                C0006g.a(hW);
            }
            if (lIlIIllIIIIIIII(C0004e.j(lIIIllllIllIl[7]), lIIIllllIllIl[5]) && lIlIIlIllllllll(Players.getLocal().getWorldLocation().distanceTo(hT), lIIIllllIllIl[41])) {
                int[] iArr5 = new int[lIIIllllIllIl[1]];
                iArr5[lIIIllllIllIl[0]] = lIIIllllIllIl[13];
                if (lIlIIlIlllllIII(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[lIIIllllIllIl[1]];
                    iArr6[lIIIllllIllIl[0]] = lIIIllllIllIl[13];
                    Inventory.getFirst(iArr6).interact(lIIIllllIlIlI[lIIIllllIllIl[48]]);
                    Time.sleepTicks(lIIIllllIllIl[16]);
                    "".length();
                }
            }
            C0006g.a(new String[lIIIllllIllIl[0]]);
            System.out.println("Setting: " + C0004e.j(lIIIllllIllIl[7]));
        }
    }

    private static void lIlIIlIllllIllI() {
        lIIIllllIllIl = new int[66];
        lIIIllllIllIl[0] = (23 ^ 62) & ((50 ^ 27) ^ (-1));
        lIIIllllIllIl[1] = " ".length();
        lIIIllllIllIl[2] = 8 ^ 78;
        lIIIllllIllIl[3] = "  ".length();
        lIIIllllIllIl[4] = (-20485) & 20863;
        lIIIllllIllIl[5] = "   ".length();
        lIIIllllIllIl[6] = (-28681) & 29675;
        lIIIllllIllIl[7] = (165 ^ 186) ^ (231 ^ 187);
        lIIIllllIllIl[8] = (113 ^ 0) ^ (37 ^ 80);
        lIIIllllIllIl[9] = 1 ^ 4;
        lIIIllllIllIl[10] = (-9266) & 14265;
        lIIIllllIllIl[11] = (-16905) & 19038;
        lIIIllllIllIl[12] = (-17583) & 30207;
        lIIIllllIllIl[13] = (-16409) & 24415;
        lIIIllllIllIl[14] = ((185 + 27) - 102) + 111;
        lIIIllllIllIl[15] = (-6211) & 8167;
        lIIIllllIllIl[16] = 56 ^ 62;
        lIIIllllIllIl[17] = (-(((39 + 132) - 109) + 71)) & (-16403) & 24543;
        lIIIllllIllIl[18] = 163 ^ 169;
        lIIIllllIllIl[19] = 97 ^ 102;
        lIIIllllIllIl[20] = 34 ^ 42;
        lIIIllllIllIl[21] = (0 ^ 108) ^ (3 ^ 102);
        lIIIllllIllIl[22] = (30 ^ 42) ^ (6 ^ 57);
        lIIIllllIllIl[23] = (244 ^ 145) ^ (2 ^ 107);
        lIIIllllIllIl[24] = (((5 + 135) - 28) + 43) ^ (((81 + 24) - 26) + 71);
        lIIIllllIllIl[25] = 139 ^ 133;
        lIIIllllIllIl[26] = 183 ^ 184;
        lIIIllllIllIl[27] = 120 ^ 104;
        lIIIllllIllIl[28] = 154 ^ 139;
        lIIIllllIllIl[29] = (110 ^ 2) ^ (93 ^ 35);
        lIIIllllIllIl[30] = 147 ^ 128;
        lIIIllllIllIl[31] = 183 ^ 163;
        lIIIllllIllIl[32] = 174 ^ 187;
        lIIIllllIllIl[33] = 178 ^ 164;
        lIIIllllIllIl[34] = (189 ^ 184) ^ (110 ^ 124);
        lIIIllllIllIl[35] = (199 ^ 180) ^ (196 ^ 175);
        lIIIllllIllIl[36] = (20 ^ 108) ^ (44 ^ 77);
        lIIIllllIllIl[37] = 116 ^ 110;
        lIIIllllIllIl[38] = "   ".length() ^ (142 ^ 150);
        lIIIllllIllIl[39] = (93 ^ 64) ^ " ".length();
        lIIIllllIllIl[40] = (((127 + 110) - 205) + 96) ^ (((59 + 153) - 71) + 16);
        lIIIllllIllIl[41] = 147 ^ 141;
        lIIIllllIllIl[42] = 90 ^ 69;
        lIIIllllIllIl[43] = (99 ^ 41) ^ (219 ^ 177);
        lIIIllllIllIl[44] = (((178 + 128) - 280) + 153) ^ (((87 + 24) - 41) + 76);
        lIIIllllIllIl[45] = 52 ^ 22;
        lIIIllllIllIl[46] = (((126 + 54) - 101) + 69) ^ (((94 + 131) - 145) + 103);
        lIIIllllIllIl[47] = (180 ^ 194) ^ (192 ^ 146);
        lIIIllllIllIl[48] = (57 ^ 114) ^ (222 ^ 176);
        lIIIllllIllIl[49] = (-50) & 5949;
        lIIIllllIllIl[50] = (-((-3486) & 23967)) & (-291) & 32751;
        lIIIllllIllIl[51] = (-((-18468) & 24167)) & (-2053) & 32751;
        lIIIllllIllIl[52] = (-12292) & 14191;
        lIIIllllIllIl[53] = (223 ^ 175) ^ (73 ^ 17);
        lIIIllllIllIl[54] = 5 ^ 97;
        lIIIllllIllIl[55] = 70 ^ 96;
        lIIIllllIllIl[56] = 177 ^ 150;
        lIIIllllIllIl[57] = (-1091) & 4058;
        lIIIllllIllIl[58] = (-28969) & 32173;
        lIIIllllIllIl[59] = (-28773) & 31741;
        lIIIllllIllIl[60] = (-16981) & 20191;
        lIIIllllIllIl[61] = (-28769) & 31725;
        lIIIllllIllIl[62] = (-17017) & 20219;
        lIIIllllIllIl[63] = (((42 + 61) - 75) + 103) ^ (((115 + 144) - 235) + 146);
        lIIIllllIllIl[64] = (54 ^ 82) ^ (123 ^ 53);
        lIIIllllIllIl[65] = (203 ^ 195) ^ (144 ^ 179);
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public String Z() {
        return lIIIllllIlIlI[lIIIllllIllIl[55]];
    }

    private static boolean lIlIIlIlllllIIl(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIlIIllIIIIIIlI(Object obj) {
        return obj == null;
    }

    private static String lIlIIlIlllIIlIl(String lllllllllllllllIIIIIIlIllllIllII, String lllllllllllllllIIIIIIlIllllIlIll) {
        try {
            SecretKeySpec lllllllllllllllIIIIIIlIllllIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIlIllllIlIll.getBytes(StandardCharsets.UTF_8)), lIIIllllIllIl[20]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIllllIllIl[3], lllllllllllllllIIIIIIlIllllIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIlIllllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIIlIllllIlIII) {
            lllllllllllllllIIIIIIlIllllIlIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean aa() {
        if (lIlIIllIIIIIIll(C0004e.j(lIIIllllIllIl[7]), lIIIllllIllIl[5]) && lIlIIlIlllllllI(Players.getLocal().getWorldLocation().distanceTo(hT), lIIIllllIllIl[41])) {
            ?? r0 = lIIIllllIllIl[1];
            "".length();
            return (((((28 + 18) - 31) + 206) ^ (((42 + 58) - 41) + 96)) & (((214 ^ 133) ^ (122 ^ 111)) ^ (-" ".length()))) != 0 ? ((94 ^ 43) ^ (242 ^ 181)) & (((143 ^ 136) ^ (150 ^ 163)) ^ (-" ".length())) : r0;
        }
        return lIIIllllIllIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean X() {
        return lIIIllllIllIl[0];
    }

    static {
        lIlIIlIllllIllI();
        lIlIIlIlllIlIll();
        hT = new WorldPoint(lIIIllllIllIl[57], lIIIllllIllIl[58], lIIIllllIllIl[0]);
        hU = new WorldPoint(lIIIllllIllIl[59], lIIIllllIllIl[60], lIIIllllIllIl[0]);
        hV = new WorldPoint(lIIIllllIllIl[61], lIIIllllIllIl[62], lIIIllllIllIl[0]);
        String[] strArr = new String[lIIIllllIllIl[5]];
        strArr[lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[53]];
        strArr[lIIIllllIllIl[1]] = lIIIllllIlIlI[lIIIllllIllIl[63]];
        strArr[lIIIllllIllIl[3]] = lIIIllllIlIlI[lIIIllllIllIl[64]];
        hW = strArr;
        bA = new ArrayList();
        bY = lIIIllllIllIl[0];
    }

    private static boolean lIlIIlIlllllIlI(int i2) {
        return i2 == 0;
    }

    private static boolean lIlIIlIllllllIl(Object obj) {
        return obj != null;
    }

    private static String lIlIIlIlllIIlII(String lllllllllllllllIIIIIIllIIIIIIIIl, String lllllllllllllllIIIIIIllIIIIIIIII) {
        String lllllllllllllllIIIIIIllIIIIIIIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIIllIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIIIIIlIllllllllI = lllllllllllllllIIIIIIllIIIIIIIII.toCharArray();
        int lllllllllllllllIIIIIIlIlllllllIl = lIIIllllIllIl[0];
        char[] charArray = lllllllllllllllIIIIIIllIIIIIIIIl2.toCharArray();
        int length = charArray.length;
        int i2 = lIIIllllIllIl[0];
        while (lIlIIlIlllllIIl(i2, length)) {
            char lllllllllllllllIIIIIIlIlllllIlII = charArray[i2];
            sb.append((char) (lllllllllllllllIIIIIIlIlllllIlII ^ lllllllllllllllIIIIIIlIllllllllI[lllllllllllllllIIIIIIlIlllllllIl % lllllllllllllllIIIIIIlIllllllllI.length]));
            "".length();
            lllllllllllllllIIIIIIlIlllllllIl++;
            i2++;
            "".length();
            if (((106 ^ 23) ^ (33 ^ 88)) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public int Y() {
        try {
            cz();
            "".length();
            if (0 != 0) {
                return (125 ^ 65) & ((145 ^ 173) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIIllllIllIl[54];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean S() {
        int[] iArr = new int[lIIIllllIllIl[1]];
        iArr[lIIIllllIllIl[0]] = lIIIllllIllIl[14];
        if (lIlIIlIlllllIII(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIIllllIllIl[1]];
            iArr2[lIIIllllIllIl[0]] = lIIIllllIllIl[11];
            if (lIlIIlIlllllIII(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIIIllllIllIl[1]];
                iArr3[lIIIllllIllIl[0]] = lIIIllllIllIl[15];
                if (lIlIIlIlllllIII(Inventory.contains(iArr3) ? 1 : 0)) {
                    ?? r0 = lIIIllllIllIl[1];
                    "".length();
                    return "   ".length() != "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return lIIIllllIllIl[0];
    }

    private static void W() {
        int[] iArr = new int[lIIIllllIllIl[1]];
        iArr[lIIIllllIllIl[0]] = lIIIllllIllIl[15];
        if (lIlIIlIlllllIlI(Bank.contains(iArr) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIllIl[15], lIIIllllIllIl[1], lIIIllllIllIl[49]));
            "".length();
        }
        int[] iArr2 = new int[lIIIllllIllIl[1]];
        iArr2[lIIIllllIllIl[0]] = lIIIllllIllIl[11];
        if (lIlIIlIlllllIlI(Bank.contains(iArr2) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIllIl[11], lIIIllllIllIl[1], lIIIllllIllIl[49]));
            "".length();
        }
        int[] iArr3 = new int[lIIIllllIllIl[1]];
        iArr3[lIIIllllIllIl[0]] = lIIIllllIllIl[14];
        if (lIlIIlIlllllIlI(Bank.contains(iArr3) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIllIl[14], lIIIllllIllIl[1], lIIIllllIllIl[49]));
            "".length();
        }
        if (lIlIIlIlllllIlI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIllllIlIlI[lIIIllllIllIl[56]]);
        }) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIllIl[50], lIIIllllIllIl[9], lIIIllllIllIl[51]));
            "".length();
        }
        int[] iArr4 = new int[lIIIllllIllIl[1]];
        iArr4[lIIIllllIllIl[0]] = lIIIllllIllIl[17];
        if (lIlIIlIlllllIlI(Bank.contains(iArr4) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIllIl[17], lIIIllllIllIl[18], lIIIllllIllIl[52]));
            "".length();
        }
        int[] iArr5 = new int[lIIIllllIllIl[1]];
        iArr5[lIIIllllIllIl[0]] = lIIIllllIllIl[13];
        if (lIlIIlIlllllIlI(Bank.contains(iArr5) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIllIl[13], lIIIllllIllIl[53], lIIIllllIllIl[52]));
            "".length();
        }
        int[] iArr6 = new int[lIIIllllIllIl[1]];
        iArr6[lIIIllllIllIl[0]] = lIIIllllIllIl[12];
        if (lIlIIlIlllllIlI(Bank.contains(iArr6) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIllIl[12], lIIIllllIllIl[9], C0007h.bv));
            "".length();
        }
    }

    private static String lIlIIlIlllIIIll(String lllllllllllllllIIIIIIlIlllIlllll, String lllllllllllllllIIIIIIlIlllIllllI) {
        try {
            SecretKeySpec lllllllllllllllIIIIIIlIllllIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIlIlllIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIllllIllIl[3], lllllllllllllllIIIIIIlIllllIIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIlIlllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIIlIllllIIIII) {
            lllllllllllllllIIIIIIlIllllIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllIIIIIIll(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean lIlIIlIlllllIll(int i2) {
        return i2 < 0;
    }

    private static boolean lIlIIlIllllllII(int i2) {
        return i2 > 0;
    }

    private static void lIlIIlIlllIlIll() {
        lIIIllllIlIlI = new String[lIIIllllIllIl[65]];
        lIIIllllIlIlI[lIIIllllIllIl[0]] = lIlIIlIlllIIIll("owVxR5LfT6s6U8wDRePQgQ==", "SoyDh");
        lIIIllllIlIlI[lIIIllllIllIl[1]] = lIlIIlIlllIIIll("bzx7N8xfIAEqUqnb2hE2Q6aBm3TOO6nScMuMG4Tg+gdCIF6xViW4Eg0fmj/DsYTd", "NOZHD");
        lIIIllllIlIlI[lIIIllllIllIl[3]] = lIlIIlIlllIIlII("ICgQPAc=", "dZyRl");
        lIIIllllIlIlI[lIIIllllIllIl[5]] = lIlIIlIlllIIlIl("eZ0Ehy4n+CI=", "aaVrC");
        lIIIllllIlIlI[lIIIllllIllIl[8]] = lIlIIlIlllIIlII("Oig8chkbaSgzAx8=", "tIJRm");
        lIIIllllIlIlI[lIIIllllIllIl[9]] = lIlIIlIlllIIlIl("zsoSXKfeh8sgemVy/Ow79t9bP86UjLLY", "yhtVw");
        lIIIllllIlIlI[lIIIllllIllIl[16]] = lIlIIlIlllIIIll("vQB6nU9ov+XoT0qiaIL2pVUUOHZ3t6vWH0QBUAoyA/olgb07hpEL4x/guQJizmEXKseIS/2n2w4=", "GSdkh");
        lIIIllllIlIlI[lIIIllllIllIl[19]] = lIlIIlIlllIIIll("U7WzMWqDlEmGh14oNuEX1w==", "SeYUq");
        lIIIllllIlIlI[lIIIllllIllIl[20]] = lIlIIlIlllIIlIl("ZanM2YcOnAt2wPWHbPRDGQ==", "NADUz");
        lIIIllllIlIlI[lIIIllllIllIl[21]] = lIlIIlIlllIIlIl("kuQsHyDPkYY=", "mEHar");
        lIIIllllIlIlI[lIIIllllIllIl[18]] = lIlIIlIlllIIlII("PCEhIA==", "sQDNw");
        lIIIllllIlIlI[lIIIllllIllIl[22]] = lIlIIlIlllIIIll("mMzS6/aOk18=", "oRDHK");
        lIIIllllIlIlI[lIIIllllIllIl[23]] = lIlIIlIlllIIlIl("LnVPBrHEShA=", "AimKi");
        lIIIllllIlIlI[lIIIllllIllIl[24]] = lIlIIlIlllIIIll("nZAlmXNBFPt/QvDt1889Kw==", "CSBCg");
        lIIIllllIlIlI[lIIIllllIllIl[25]] = lIlIIlIlllIIlIl("zTcIWVk4+U5IpllF/a7zvg==", "aXHgg");
        lIIIllllIlIlI[lIIIllllIllIl[26]] = lIlIIlIlllIIIll("lU3mr3f00t8x0WGk51GX/w==", "ZcFKX");
        lIIIllllIlIlI[lIIIllllIllIl[27]] = lIlIIlIlllIIlII("IiMudzwDYio2Jgsn", "lBXWH");
        lIIIllllIlIlI[lIIIllllIllIl[28]] = lIlIIlIlllIIlIl("iMkK6c9p1iEMHbpuxr2m0A==", "VYhsY");
        lIIIllllIlIlI[lIIIllllIllIl[29]] = lIlIIlIlllIIIll("ihBRFIIO9xVAK0QnR924xw==", "FmnCZ");
        lIIIllllIlIlI[lIIIllllIllIl[30]] = lIlIIlIlllIIlII("MCcNBhM=", "bFcav");
        lIIIllllIlIlI[lIIIllllIllIl[31]] = lIlIIlIlllIIlII("ACgAJCQ=", "RInCA");
        lIIIllllIlIlI[lIIIllllIllIl[32]] = lIlIIlIlllIIlII("cw==", "ShsWI");
        lIIIllllIlIlI[lIIIllllIllIl[33]] = lIlIIlIlllIIIll("6x8NrBAGY5E7TJe+2GxOGA==", "SDRAw");
        lIIIllllIlIlI[lIIIllllIllIl[34]] = lIlIIlIlllIIlII("BA81UBt2GiAeBA==", "VnAwh");
        lIIIllllIlIlI[lIIIllllIllIl[35]] = lIlIIlIlllIIIll("K2rsYW6HIktWGqZxiuIXmw==", "fiLhq");
        lIIIllllIlIlI[lIIIllllIllIl[36]] = lIlIIlIlllIIlII("HzkCVDRtLBcaKw==", "MXvsG");
        lIIIllllIlIlI[lIIIllllIllIl[37]] = lIlIIlIlllIIlIl("/L01R5s4ga0=", "emQUs");
        lIIIllllIlIlI[lIIIllllIllIl[38]] = lIlIIlIlllIIlIl("KQEBQoWQ79A=", "tOrzx");
        lIIIllllIlIlI[lIIIllllIllIl[39]] = lIlIIlIlllIIIll("gyOrODJHUbg=", "SRiKe");
        lIIIllllIlIlI[lIIIllllIllIl[40]] = lIlIIlIlllIIlII("Kx8rJAVJBzwrBQ==", "ijYJq");
        lIIIllllIlIlI[lIIIllllIllIl[41]] = lIlIIlIlllIIIll("MX3BNkKP/Nf8iKIKXO7m4g==", "RaTld");
        lIIIllllIlIlI[lIIIllllIllIl[42]] = lIlIIlIlllIIlIl("ET/OM0sif6MRphlsgzg6AA==", "KwRwJ");
        lIIIllllIlIlI[lIIIllllIllIl[43]] = lIlIIlIlllIIlIl("nY6yCb/CjvChUfHTfGwf4Q==", "WqSPu");
        lIIIllllIlIlI[lIIIllllIllIl[44]] = lIlIIlIlllIIIll("gDhqUPJf1EA=", "ZqIfW");
        lIIIllllIlIlI[lIIIllllIllIl[45]] = lIlIIlIlllIIlII("JhgSHhQXFgk=", "eygrp");
        lIIIllllIlIlI[lIIIllllIllIl[46]] = lIlIIlIlllIIlIl("CLaWTEB/vwasnMDyhLTdkg==", "GmfwR");
        lIIIllllIlIlI[lIIIllllIllIl[47]] = lIlIIlIlllIIlII("NhQOPxpSIBU+HA==", "rfgQq");
        lIIIllllIlIlI[lIIIllllIllIl[48]] = lIlIIlIlllIIlIl("fzibQTTIk6E=", "QdYLo");
        lIIIllllIlIlI[lIIIllllIllIl[55]] = lIlIIlIlllIIlII("Izw1Oz4RJmEoOQA8LjZ2BSAkKyI=", "tUAXV");
        lIIIllllIlIlI[lIIIllllIllIl[56]] = lIlIIlIlllIIlIl("vgyx7Vj0gj4aMCO2RE+N2WuyZRyRemhM", "YJiZM");
        lIIIllllIlIlI[lIIIllllIllIl[53]] = lIlIIlIlllIIlII("G0YoInM7CGk8NjMUKidzPQBpLnMjEyw8J3w=", "RfIOS");
        lIIIllllIlIlI[lIIIllllIllIl[63]] = lIlIIlIlllIIlII("KxQ5eFQaFCYkVB8UajYRER4nMVQdHy90AxsFInQZC1EuNQYZFDh0BxsVL3o=", "rqJTt");
        lIIIllllIlIlI[lIIIllllIllIl[64]] = lIlIIlIlllIIIll("CVeJNwZcJ/o=", "KrBFj");
    }

    private static boolean lIlIIllIIIIIIII(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIlIIlIlllllIII(int i2) {
        return i2 != 0;
    }

    private static boolean lIlIIlIlllllllI(int i2, int i3) {
        return i2 > i3;
    }

    private static boolean lIlIIllIIIIIIIl(int i2) {
        return i2 <= 0;
    }

    private static int lIlIIlIllllIlll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIlIIlIllllllll(int i2, int i3) {
        return i2 <= i3;
    }
}
