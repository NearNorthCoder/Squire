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
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.R  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/R.class */
public class R implements W {
    public static final /* synthetic */ String[] jH;
    private static /* synthetic */ String[] lIlIIlIll;
    private static final /* synthetic */ WorldPoint jJ;
    static /* synthetic */ boolean cm;
    public static /* synthetic */ List<C0003d> bv;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ int bT;
    static /* synthetic */ int cl;
    private static final /* synthetic */ WorldPoint jI;
    private static final /* synthetic */ WorldPoint jK;
    private static /* synthetic */ int[] lIlIIllIl;
    private static final /* synthetic */ WorldPoint jL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v288, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v333, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v69, types: [boolean] */
    public static void cU() {
        if (lIIIllIIIIlI(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIIlIll[lIlIIllIl[0]];
            C0001b.a(bv);
            if (lIIIllIIIIll(bv.size(), lIlIIllIl[1])) {
                System.out.println(lIlIIlIll[lIlIIllIl[1]]);
                bt = lIlIIllIl[0];
            }
        }
        if (lIIIllIIIlII(bt ? 1 : 0)) {
            if (lIIIllIIIIlI(Inventory.contains(C0005f.aV) ? 1 : 0) && lIIIllIIIIll(Movement.getRunEnergy(), lIlIIllIl[2])) {
                Inventory.getFirst(C0005f.aV).interact(lIlIIlIll[lIlIIllIl[3]]);
                Time.sleepTicks(lIlIIllIl[1]);
                "".length();
            }
            if (lIIIllIIIlIl(lIIIllIIIIIl(C0004e.u(), 70.0d))) {
                int[] iArr = new int[lIlIIllIl[1]];
                iArr[lIlIIllIl[0]] = lIlIIllIl[4];
                if (lIIIllIIIIlI(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIlIIllIl[1]];
                    iArr2[lIlIIllIl[0]] = lIlIIllIl[4];
                    Inventory.getFirst(iArr2).interact(lIlIIlIll[lIlIIllIl[5]]);
                }
            }
            if (lIIIllIIIlII(Movement.isRunEnabled() ? 1 : 0) && lIIIllIIIllI(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (lIIIllIIIlII(ab() ? 1 : 0) && lIIIllIIIIll(C0004e.j(lIlIIllIl[6]), lIlIIllIl[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIIllIIIlll(nearest) && lIIIllIIIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIlIll[lIlIIllIl[7]];
                    C0000a.a(nearest);
                    Time.sleepTicks(lIlIIllIl[3]);
                    "".length();
                }
                if (lIIIllIIIlll(nearest) && lIIIllIIIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIlIll[lIlIIllIl[8]];
                    if (lIIIllIIIlII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlIIllIl[9]);
                        "".length();
                    }
                    if (lIIIllIIIIlI(Bank.isOpen() ? 1 : 0)) {
                        if (lIIIllIIIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlIIllIl[7]);
                            "".length();
                        }
                        if (lIIIllIIIllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlIIllIl[3]);
                            "".length();
                        }
                        int[] iArr3 = new int[lIlIIllIl[8]];
                        iArr3[lIlIIllIl[0]] = lIlIIllIl[10];
                        iArr3[lIlIIllIl[1]] = lIlIIllIl[11];
                        iArr3[lIlIIllIl[3]] = lIlIIllIl[12];
                        iArr3[lIlIIllIl[5]] = lIlIIllIl[13];
                        iArr3[lIlIIllIl[7]] = lIlIIllIl[4];
                        if (lIIIllIIIlII(C0004e.b(iArr3) ? 1 : 0)) {
                            af();
                            System.out.println(lIlIIlIll[lIlIIllIl[14]]);
                            bt = lIlIIllIl[1];
                            return;
                        }
                        Bank.withdraw(lIlIIllIl[11], lIlIIllIl[15], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIIllIl[1]);
                        "".length();
                        Bank.withdraw(lIlIIllIl[13], lIlIIllIl[8], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIIllIl[1]);
                        "".length();
                        Bank.withdraw(lIlIIllIl[10], lIlIIllIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIIllIl[1]);
                        "".length();
                        C0000a.b(C0005f.aV, lIlIIllIl[1]);
                        C0000a.a(lIlIIllIl[4], lIlIIllIl[15]);
                        C0000a.b(C0005f.bf, lIlIIllIl[1]);
                    }
                }
            }
            if (lIIIllIIIIlI(ab() ? 1 : 0) && lIIIllIIIIll(C0004e.j(lIlIIllIl[6]), lIlIIllIl[1])) {
                new WorldArea(lIlIIllIl[16], lIlIIllIl[17], lIlIIllIl[18], lIlIIllIl[19], lIlIIllIl[0]);
                String[] strArr = new String[lIlIIllIl[1]];
                strArr[lIlIIllIl[0]] = lIlIIlIll[lIlIIllIl[20]];
                NPC nearest2 = NPCs.getNearest(strArr);
                if (lIIIllIIlIII(nearest2) && lIIIllIIlIIl(Players.getLocal().getWorldLocation().distanceTo(jI), lIlIIllIl[5]) && lIIIllIIIlII(AccBuilderEasyClues.d ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIlIll[lIlIIllIl[18]];
                    if (lIIIllIIIIll(bT, lIlIIllIl[1])) {
                        C0004e.v();
                        bT += lIlIIllIl[1];
                    }
                    Movement.walkTo(jI);
                    "".length();
                    Time.sleepTicks(lIlIIllIl[1]);
                    "".length();
                }
                if (lIIIllIIIlll(nearest2)) {
                    AccBuilderEasyClues.c = lIlIIlIll[lIlIIllIl[21]];
                    C0006g.a(lIlIIlIll[lIlIIllIl[15]], jH, lIlIIllIl[1]);
                }
            }
            if (lIIIllIIlIlI(C0004e.j(lIlIIllIl[6]), lIlIIllIl[1])) {
                if (lIIIllIIlIIl(Players.getLocal().getWorldLocation().distanceTo(jJ), lIlIIllIl[14])) {
                    AccBuilderEasyClues.c = lIlIIlIll[lIlIIllIl[19]];
                    Movement.walkTo(jJ);
                    "".length();
                    Time.sleepTicks(lIlIIllIl[1]);
                    "".length();
                }
                if (lIIIllIIlIll(Players.getLocal().getWorldLocation().distanceTo(jJ), lIlIIllIl[14])) {
                    AccBuilderEasyClues.c = lIlIIlIll[lIlIIllIl[22]];
                    String[] strArr2 = new String[lIlIIllIl[1]];
                    strArr2[lIlIIllIl[0]] = lIlIIlIll[lIlIIllIl[23]];
                    TileObject nearest3 = TileObjects.getNearest(strArr2);
                    if (lIIIllIIIlll(nearest3)) {
                        String[] strArr3 = new String[lIlIIllIl[1]];
                        strArr3[lIlIIllIl[0]] = lIlIIlIll[lIlIIllIl[24]];
                        if (lIIIllIIIIlI(nearest3.hasAction(strArr3) ? 1 : 0)) {
                            nearest3.interact(lIlIIlIll[lIlIIllIl[25]]);
                            Time.sleepTicks(lIlIIllIl[8]);
                            "".length();
                        }
                    }
                    C0006g.a(lIlIIlIll[lIlIIllIl[26]], jH);
                }
            }
            if (lIIIllIIlIlI(C0004e.j(lIlIIllIl[6]), lIlIIllIl[3])) {
                if (lIIIllIIlIIl(Players.getLocal().getWorldLocation().distanceTo(jK), lIlIIllIl[3])) {
                    int[] iArr4 = new int[lIlIIllIl[1]];
                    iArr4[lIlIIllIl[0]] = lIlIIllIl[27];
                    if (lIIIllIIIIlI(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lIlIIllIl[1]];
                        iArr5[lIlIIllIl[0]] = lIlIIllIl[27];
                        Inventory.getFirst(iArr5).interact(lIlIIlIll[lIlIIllIl[28]]);
                        Time.sleepTicks(lIlIIllIl[1]);
                        "".length();
                    }
                    AccBuilderEasyClues.c = lIlIIlIll[lIlIIllIl[29]];
                    Movement.walkTo(jK);
                    "".length();
                    Time.sleepTicks(lIlIIllIl[1]);
                    "".length();
                }
                if (lIIIllIIlIll(Players.getLocal().getWorldLocation().distanceTo(jK), lIlIIllIl[3])) {
                    AccBuilderEasyClues.c = lIlIIlIll[lIlIIllIl[30]];
                    String[] strArr4 = new String[lIlIIllIl[1]];
                    strArr4[lIlIIllIl[0]] = lIlIIlIll[lIlIIllIl[31]];
                    NPC nearest4 = NPCs.getNearest(strArr4);
                    if (lIIIllIIIlll(nearest4)) {
                        C0006g.a(lIlIIlIll[lIlIIllIl[32]], jH);
                    }
                    if (lIIIllIIlIII(nearest4)) {
                        String[] strArr5 = new String[lIlIIllIl[1]];
                        strArr5[lIlIIllIl[0]] = lIlIIlIll[lIlIIllIl[33]];
                        TileObjects.getNearest(strArr5).interact(lIlIIlIll[lIlIIllIl[34]]);
                        Time.sleepTicks(lIlIIllIl[3]);
                        "".length();
                    }
                }
            }
            if (lIIIllIIlIlI(C0004e.j(lIlIIllIl[6]), lIlIIllIl[5])) {
                cl = lIlIIllIl[0];
                if (lIIIllIIlIIl(Players.getLocal().getWorldLocation().distanceTo(jL), lIlIIllIl[5])) {
                    AccBuilderEasyClues.c = lIlIIlIll[lIlIIllIl[35]];
                    Movement.walkTo(jL);
                    "".length();
                    Time.sleepTicks(lIlIIllIl[1]);
                    "".length();
                }
                if (lIIIllIIlIll(Players.getLocal().getWorldLocation().distanceTo(jL), lIlIIllIl[5])) {
                    AccBuilderEasyClues.c = lIlIIlIll[lIlIIllIl[36]];
                    String[] strArr6 = new String[lIlIIllIl[1]];
                    strArr6[lIlIIllIl[0]] = lIlIIlIll[lIlIIllIl[37]];
                    TileObject nearest5 = TileObjects.getNearest(strArr6);
                    if (lIIIllIIIlll(nearest5)) {
                        nearest5.interact(lIlIIlIll[lIlIIllIl[38]]);
                    }
                }
            }
            if (lIIIllIIlIlI(C0004e.j(lIlIIllIl[6]), lIlIIllIl[7])) {
                if (lIIIllIIlIIl(Players.getLocal().getWorldLocation().distanceTo(jK), lIlIIllIl[3])) {
                    int[] iArr6 = new int[lIlIIllIl[1]];
                    iArr6[lIlIIllIl[0]] = lIlIIllIl[27];
                    if (lIIIllIIIIlI(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lIlIIllIl[1]];
                        iArr7[lIlIIllIl[0]] = lIlIIllIl[27];
                        Inventory.getFirst(iArr7).interact(lIlIIlIll[lIlIIllIl[39]]);
                        Time.sleepTicks(lIlIIllIl[1]);
                        "".length();
                    }
                    AccBuilderEasyClues.c = lIlIIlIll[lIlIIllIl[40]];
                    Movement.walkTo(jK);
                    "".length();
                    Time.sleepTicks(lIlIIllIl[1]);
                    "".length();
                }
                if (lIIIllIIlIll(Players.getLocal().getWorldLocation().distanceTo(jK), lIlIIllIl[3])) {
                    AccBuilderEasyClues.c = lIlIIlIll[lIlIIllIl[41]];
                    String[] strArr7 = new String[lIlIIllIl[1]];
                    strArr7[lIlIIllIl[0]] = lIlIIlIll[lIlIIllIl[42]];
                    TileObject nearest6 = TileObjects.getNearest(strArr7);
                    if (lIIIllIIIlll(nearest6)) {
                        String[] strArr8 = new String[lIlIIllIl[1]];
                        strArr8[lIlIIllIl[0]] = lIlIIlIll[lIlIIllIl[43]];
                        if (lIIIllIIIIlI(nearest6.hasAction(strArr8) ? 1 : 0)) {
                            nearest6.interact(lIlIIlIll[lIlIIllIl[44]]);
                            Time.sleepTicks(lIlIIllIl[3]);
                            "".length();
                        }
                        String[] strArr9 = new String[lIlIIllIl[1]];
                        strArr9[lIlIIllIl[0]] = lIlIIlIll[lIlIIllIl[45]];
                        Item first = Inventory.getFirst(strArr9);
                        if (lIIIllIIIlll(first)) {
                            if (lIIIllIIIIll(cl, lIlIIllIl[1])) {
                                an.pF += lIlIIllIl[1];
                                an.o(AccBuilderEasyClues.m);
                                cl += lIlIIllIl[1];
                                an.pF = lIlIIllIl[0];
                                cm = lIlIIllIl[0];
                            }
                            first.useOn(nearest6);
                            Time.sleepTicks(lIlIIllIl[5]);
                            "".length();
                        }
                    }
                }
                C0006g.a(jH);
            }
            C0006g.a(new String[lIlIIllIl[0]]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean ab() {
        int[] iArr = new int[lIlIIllIl[1]];
        iArr[lIlIIllIl[0]] = lIlIIllIl[11];
        if (lIIIllIIIIlI(Inventory.contains(iArr) ? 1 : 0) && ((!lIIIllIIIlII(Inventory.contains(C0005f.aR) ? 1 : 0) || lIIIllIIIIlI(Equipment.contains(C0005f.aR) ? 1 : 0)) && lIIIllIIIIlI(Inventory.contains(C0005f.aV) ? 1 : 0))) {
            int[] iArr2 = new int[lIlIIllIl[1]];
            iArr2[lIlIIllIl[0]] = lIlIIllIl[13];
            if (lIIIllIIIIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIlIIllIl[1]];
                iArr3[lIlIIllIl[0]] = lIlIIllIl[4];
                if (lIIIllIIIIlI(Inventory.contains(iArr3) ? 1 : 0)) {
                    ?? r0 = lIlIIllIl[1];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return lIlIIllIl[0];
    }

    private static void af() {
        int[] iArr = new int[lIlIIllIl[1]];
        iArr[lIlIIllIl[0]] = lIlIIllIl[10];
        if (lIIIllIIIlII(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIllIl[10], lIlIIllIl[1], lIlIIllIl[46]));
            "".length();
        }
        int[] iArr2 = new int[lIlIIllIl[1]];
        iArr2[lIlIIllIl[0]] = lIlIIllIl[4];
        if (lIIIllIIIlII(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIllIl[4], lIlIIllIl[15], lIlIIllIl[47]));
            "".length();
        }
        if (lIIIllIIIlII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlIIlIll[lIlIIllIl[53]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIllIl[48], lIlIIllIl[8], lIlIIllIl[49]));
            "".length();
        }
        int[] iArr3 = new int[lIlIIllIl[1]];
        iArr3[lIlIIllIl[0]] = lIlIIllIl[11];
        if (lIIIllIIIlII(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIllIl[11], lIlIIllIl[15], lIlIIllIl[50]));
            "".length();
        }
        int[] iArr4 = new int[lIlIIllIl[1]];
        iArr4[lIlIIllIl[0]] = lIlIIllIl[13];
        if (lIIIllIIIlII(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIllIl[13], lIlIIllIl[31], lIlIIllIl[50]));
            "".length();
        }
        int[] iArr5 = new int[lIlIIllIl[1]];
        iArr5[lIlIIllIl[0]] = lIlIIllIl[12];
        if (lIIIllIIIlII(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIllIl[12], lIlIIllIl[8], C0008i.bq));
            "".length();
        }
    }

    private static boolean lIIIllIIlIll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIIllIIIllI(int i) {
        return i > 0;
    }

    private static void lIIIllIIIIII() {
        lIlIIllIl = new int[75];
        lIlIIllIl[0] = ((184 ^ 141) ^ (((24 + 64) - (-9)) + 30)) & (((254 ^ 173) ^ (64 ^ 89)) ^ (-" ".length()));
        lIlIIllIl[1] = " ".length();
        lIlIIllIl[2] = (127 ^ 47) ^ (188 ^ 170);
        lIlIIllIl[3] = "  ".length();
        lIlIIllIl[4] = (-12289) & 12667;
        lIlIIllIl[5] = "   ".length();
        lIlIIllIl[6] = (10 ^ 77) ^ (141 ^ 161);
        lIlIIllIl[7] = (235 ^ 152) ^ (61 ^ 74);
        lIlIIllIl[8] = 41 ^ 44;
        lIlIIllIl[9] = (-25635) & 30634;
        lIlIIllIl[10] = (-((-3297) & 24054)) & (-1) & 32735;
        lIlIIllIl[11] = (-((-22873) & 31103)) & (-146) & 16383;
        lIlIIllIl[12] = (-513) & 13137;
        lIlIIllIl[13] = (-24593) & 32599;
        lIlIIllIl[14] = 185 ^ 191;
        lIlIIllIl[15] = (58 ^ 40) ^ (135 ^ 159);
        lIlIIllIl[16] = (-((-11439) & 32191)) & (-581) & 24572;
        lIlIIllIl[17] = (-((-23681) & 32738)) & (-20499) & 32759;
        lIlIIllIl[18] = 207 ^ 199;
        lIlIIllIl[19] = 186 ^ 177;
        lIlIIllIl[20] = 64 ^ 71;
        lIlIIllIl[21] = (17 ^ 7) ^ (35 ^ 60);
        lIlIIllIl[22] = (106 ^ 90) ^ (128 ^ 188);
        lIlIIllIl[23] = (26 ^ 0) ^ (81 ^ 70);
        lIlIIllIl[24] = (((95 + 80) - 117) + 77) ^ (((115 + 83) - 104) + 43);
        lIlIIllIl[25] = (6 ^ 21) ^ (163 ^ 191);
        lIlIIllIl[26] = 118 ^ 102;
        lIlIIllIl[27] = (-((-2313) & 32223)) & (-257) & 30718;
        lIlIIllIl[28] = (4 ^ 119) ^ (50 ^ 80);
        lIlIIllIl[29] = (114 ^ 32) ^ (7 ^ 71);
        lIlIIllIl[30] = (151 ^ 139) ^ (49 ^ 62);
        lIlIIllIl[31] = (((97 + 152) - 228) + 145) ^ (((157 + 48) - 45) + 18);
        lIlIIllIl[32] = (((66 + 177) - 82) + 26) ^ (((38 + 20) - 21) + 137);
        lIlIIllIl[33] = 190 ^ 168;
        lIlIIllIl[34] = (((57 + 69) - 12) + 22) ^ (((77 + 58) - 8) + 32);
        lIlIIllIl[35] = 178 ^ 170;
        lIlIIllIl[36] = (92 ^ 81) ^ (174 ^ 186);
        lIlIIllIl[37] = 93 ^ 71;
        lIlIIllIl[38] = 35 ^ 56;
        lIlIIllIl[39] = 139 ^ 151;
        lIlIIllIl[40] = 28 ^ 1;
        lIlIIllIl[41] = (((96 + 75) - 68) + 83) ^ (((57 + 157) - 201) + 151);
        lIlIIllIl[42] = 155 ^ 132;
        lIlIIllIl[43] = 1 ^ 33;
        lIlIIllIl[44] = 18 ^ 51;
        lIlIIllIl[45] = (201 ^ 195) ^ (36 ^ 12);
        lIlIIllIl[46] = (-((-2068) & 18935)) & (-1) & 32767;
        lIlIIllIl[47] = (-10356) & 16255;
        lIlIIllIl[48] = (-4403) & 16382;
        lIlIIllIl[49] = (-3093) & 28092;
        lIlIIllIl[50] = (-((-28239) & 32479)) & (-8196) & 14335;
        lIlIIllIl[51] = (169 ^ 157) ^ (221 ^ 141);
        lIlIIllIl[52] = (((0 + 159) - (-4)) + 2) ^ (((131 + 108) - 220) + 115);
        lIlIIllIl[53] = (248 ^ 166) ^ (197 ^ 191);
        lIlIIllIl[54] = 144 ^ 181;
        lIlIIllIl[55] = 81 ^ 119;
        lIlIIllIl[56] = 143 ^ 168;
        lIlIIllIl[57] = 182 ^ 158;
        lIlIIllIl[58] = 30 ^ 55;
        lIlIIllIl[59] = (42 ^ 65) ^ (223 ^ 158);
        lIlIIllIl[60] = 163 ^ 136;
        lIlIIllIl[61] = (84 ^ 7) ^ (((48 + 66) - (-12)) + 1);
        lIlIIllIl[62] = 21 ^ 56;
        lIlIIllIl[63] = (68 ^ 76) ^ (74 ^ 108);
        lIlIIllIl[64] = 34 ^ 13;
        lIlIIllIl[65] = 61 ^ 13;
        lIlIIllIl[66] = (((133 + 44) - 142) + 120) ^ (((135 + 131) - 205) + 109);
        lIlIIllIl[67] = (-((-17) & 29493)) & (-81) & 32766;
        lIlIIllIl[68] = (-8598) & 11743;
        lIlIIllIl[69] = (-((-4178) & 28887)) & (-4355) & 32239;
        lIlIIllIl[70] = (-((-1169) & 30675)) & (-5) & 32759;
        lIlIIllIl[71] = (-((-9233) & 30229)) & (-8194) & 32383;
        lIlIIllIl[72] = (-((-35) & 25011)) & (-2) & 28095;
        lIlIIllIl[73] = (-((-4373) & 23317)) & (-1) & 28510;
        lIlIIllIl[74] = (((44 + 66) - 107) + 155) ^ (((112 + 126) - 67) + 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIlIIllIl[0];
    }

    private static boolean lIIIllIIIIll(int i, int i2) {
        return i < i2;
    }

    private static int lIIIllIIIIIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIIIllIIIlII(int i) {
        return i == 0;
    }

    private static boolean lIIIllIIIlll(Object obj) {
        return obj != null;
    }

    private static boolean lIIIllIIlIII(Object obj) {
        return obj == null;
    }

    private static String lIIIlIlllllI(String lllIllIIIlllll, String lllIllIIIllllI) {
        String str = new String(Base64.getDecoder().decode(lllIllIIIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllIllIIIllllI.toCharArray();
        int lllIllIIIllIll = lIlIIllIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIIllIl[0];
        while (lIIIllIIIIll(i, length)) {
            char lllIllIIlIIIII = charArray2[i];
            sb.append((char) (lllIllIIlIIIII ^ charArray[lllIllIIIllIll % charArray.length]));
            "".length();
            lllIllIIIllIll++;
            i++;
            "".length();
            if (((75 ^ 43) ^ (216 ^ 188)) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIIIllIIllII(C0004e.j(lIlIIllIl[6]), lIlIIllIl[8])) {
            ?? r0 = lIlIIllIl[1];
            "".length();
            return (((101 ^ 44) ^ (80 ^ 51)) & (((((7 + 64) - 11) + 79) ^ (((7 + 96) - 22) + 80)) ^ (-" ".length()))) >= ((113 ^ 77) ^ (98 ^ 90)) ? ((24 ^ 55) ^ (9 ^ 45)) & (((((69 + 33) - 96) + 134) ^ (((80 + 15) - 15) + 55)) ^ (-" ".length())) : r0;
        }
        return lIlIIllIl[0];
    }

    private static boolean lIIIllIIIIlI(int i) {
        return i != 0;
    }

    private static boolean lIIIllIIllII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIIllIIIlIl(int i) {
        return i < 0;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIlIIlIll[lIlIIllIl[52]];
    }

    static {
        lIIIllIIIIII();
        lIIIlIllllll();
        String[] strArr = new String[lIlIIllIl[23]];
        strArr[lIlIIllIl[0]] = lIlIIlIll[lIlIIllIl[54]];
        strArr[lIlIIllIl[1]] = lIlIIlIll[lIlIIllIl[55]];
        strArr[lIlIIllIl[3]] = lIlIIlIll[lIlIIllIl[56]];
        strArr[lIlIIllIl[5]] = lIlIIlIll[lIlIIllIl[57]];
        strArr[lIlIIllIl[7]] = lIlIIlIll[lIlIIllIl[58]];
        strArr[lIlIIllIl[8]] = lIlIIlIll[lIlIIllIl[59]];
        strArr[lIlIIllIl[14]] = lIlIIlIll[lIlIIllIl[60]];
        strArr[lIlIIllIl[20]] = lIlIIlIll[lIlIIllIl[61]];
        strArr[lIlIIllIl[18]] = lIlIIlIll[lIlIIllIl[62]];
        strArr[lIlIIllIl[21]] = lIlIIlIll[lIlIIllIl[63]];
        strArr[lIlIIllIl[15]] = lIlIIlIll[lIlIIllIl[64]];
        strArr[lIlIIllIl[19]] = lIlIIlIll[lIlIIllIl[65]];
        strArr[lIlIIllIl[22]] = lIlIIlIll[lIlIIllIl[66]];
        jH = strArr;
        jI = new WorldPoint(lIlIIllIl[16], lIlIIllIl[67], lIlIIllIl[0]);
        jJ = new WorldPoint(lIlIIllIl[68], lIlIIllIl[69], lIlIIllIl[0]);
        jK = new WorldPoint(lIlIIllIl[70], lIlIIllIl[71], lIlIIllIl[0]);
        jL = new WorldPoint(lIlIIllIl[72], lIlIIllIl[73], lIlIIllIl[0]);
        bv = new ArrayList();
        bT = lIlIIllIl[0];
    }

    private static boolean lIIIllIIlIIl(int i, int i2) {
        return i > i2;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            cU();
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (22 ^ 12) & ((77 ^ 87) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIlIIllIl[51];
    }

    private static boolean lIIIllIIlIlI(int i, int i2) {
        return i == i2;
    }

    private static String lIIIlIlllIIl(String lllIllIIlIllll, String lllIllIIlIlllI) {
        try {
            SecretKeySpec lllIllIIllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIllIIlIlllI.getBytes(StandardCharsets.UTF_8)), lIlIIllIl[18]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIllIl[3], lllIllIIllIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIllIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIllIIllIIII) {
            lllIllIIllIIII.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIllllll() {
        lIlIIlIll = new String[lIlIIllIl[74]];
        lIlIIlIll[lIlIIllIl[0]] = lIIIlIlllIIl("BBFfGrhrg7qENgXdT3MyGQ==", "cXUal");
        lIlIIlIll[lIlIIllIl[1]] = lIIIlIlllIIl("jyV4dHcDYlQhdNKiDbGV0G3DVt0uQyzZQuE/CR8LYrDAXsS49Koi1NhZsBLJS0UU", "Bhntt");
        lIlIIlIll[lIlIIllIl[3]] = lIIIlIlllIIl("+3BkKsRHN6M=", "gNdcb");
        lIlIIlIll[lIlIIllIl[5]] = lIIIlIlllIIl("eYiVSHOju5M=", "LCXlv");
        lIlIIlIll[lIlIIllIl[7]] = lIIIlIlllIIl("oomAnknQ1yeCDrLwHa9CXA==", "jRpKh");
        lIlIIlIll[lIlIIllIl[8]] = lIIIlIlllIIl("5fLOvjdoTftdeMjYi/D1TVDrFqHk2dvA", "ZlTsc");
        lIlIIlIll[lIlIIllIl[14]] = lIIIlIlllIlI("yyW1dx4PcW6Q5f0DtgepYBbpMT3KlnpNQmod05UwEnuIdWEls9cHqTtLhwaJJJ155Iy1IDtxEs4=", "idYML");
        lIlIIlIll[lIlIIllIl[20]] = lIIIlIlllIlI("ij9x6zMglts4OJpu5LmlpA==", "bDXEZ");
        lIlIIlIll[lIlIIllIl[18]] = lIIIlIlllIIl("1l96SWpsH6SvrrfyVzfuXQ==", "fwWFg");
        lIlIIlIll[lIlIIllIl[21]] = lIIIlIlllIlI("43/omasy1c+Fit/4gaNFfQ==", "OEdvE");
        lIlIIlIll[lIlIIllIl[15]] = lIIIlIlllIIl("1dbb1d+R9TGVQrVUlim4xA==", "LHvhM");
        lIlIIlIll[lIlIIllIl[19]] = lIIIlIlllIlI("Fl3T4t0cVfAxWtdyVHtHMFfF73Sfjfxe", "jtGZE");
        lIlIIlIll[lIlIIllIl[22]] = lIIIlIlllIIl("EynMXr3nAiHB9QSgzj2Kjw==", "fUlzS");
        lIlIIlIll[lIlIIllIl[23]] = lIIIlIlllIlI("+NWQLb/PxSQ=", "gpyoL");
        lIlIIlIll[lIlIIllIl[24]] = lIIIlIlllIIl("qpJ1/tt9P/o=", "hyNLr");
        lIlIIlIll[lIlIIllIl[25]] = lIIIlIlllIlI("y/qqBWdPkIQ=", "gBMAY");
        lIlIIlIll[lIlIIllIl[26]] = lIIIlIlllIIl("lI0AfBgdw0niDwncpnpL7A==", "YLyYe");
        lIlIIlIll[lIlIIllIl[28]] = lIIIlIlllllI("ETYINA==", "FSiFT");
        lIlIIlIll[lIlIIllIl[29]] = lIIIlIlllIIl("mwQuhOfi6gB0ZieNiVaVgg==", "LLYyu");
        lIlIIlIll[lIlIIllIl[30]] = lIIIlIlllllI("EDgfHSIxNxZZLTc/FxAg", "XYqyN");
        lIlIIlIll[lIlIIllIl[31]] = lIIIlIlllIlI("hEaVigUtZnSRsvZFiB5cWQ==", "iBFzM");
        lIlIIlIll[lIlIIllIl[32]] = lIIIlIlllIIl("Pq1HM1+cJjQcsP6YRgfJ1A==", "pEufq");
        lIlIIlIll[lIlIIllIl[33]] = lIIIlIlllIIl("oU2gKSUyZZc=", "juXgU");
        lIlIIlIll[lIlIIllIl[34]] = lIIIlIlllllI("JwQ3Gg==", "htRtn");
        lIlIIlIll[lIlIIllIl[35]] = lIIIlIlllIIl("aU8906JLO9OJGfEioMZ7iw==", "NMWCL");
        lIlIIlIll[lIlIIllIl[36]] = lIIIlIlllIIl("jxXvXlqaBZ8rvQSBQpeNEg==", "FFHcT");
        lIlIIlIll[lIlIIllIl[37]] = lIIIlIlllIlI("MjU/jMLDPAQ=", "qhfVj");
        lIlIIlIll[lIlIIllIl[38]] = lIIIlIlllIlI("fiU/DHUXyI4=", "VLhFg");
        lIlIIlIll[lIlIIllIl[39]] = lIIIlIlllIIl("aUNgK3EMwQA=", "FsRme");
        lIlIIlIll[lIlIIllIl[40]] = lIIIlIlllIlI("C/46THndJh+xamKbg2c5Qg==", "zRzSW");
        lIlIIlIll[lIlIIllIl[41]] = lIIIlIlllIIl("OEHnhY+TDta4iuydbfkn0g==", "kPDnx");
        lIlIIlIll[lIlIIllIl[42]] = lIIIlIlllIIl("wkf1imAzRgw=", "KpalT");
        lIlIIlIll[lIlIIllIl[43]] = lIIIlIlllIlI("gGY9qP4lFW4=", "MJbUc");
        lIlIIlIll[lIlIIllIl[44]] = lIIIlIlllllI("FwcsIQ==", "XwIOm");
        lIlIIlIll[lIlIIllIl[45]] = lIIIlIlllllI("DjkNPRJuIkI9DTw9Dg==", "IQbNf");
        lIlIIlIll[lIlIIllIl[52]] = lIIIlIlllIIl("a3fqYVy7bBlCEX1gSnCUI8tU0umUq4EC", "LmbbY");
        lIlIIlIll[lIlIIllIl[53]] = lIIIlIlllIIl("c1MEfJtwknIQqf6eUk6OMDMmR03IOffg", "XrXCT");
        lIlIIlIll[lIlIIllIl[54]] = lIIIlIlllllI("Kh95dQhCGXUgMUUSOidhBBp1NCUTETshNBcRew==", "etUUA");
        lIlIIlIll[lIlIIllIl[55]] = lIIIlIlllIIl("geR60Lsaj8fmD+HuI3XUx+St+ueXzJoOJ7KONU39OrTLg85e4VKRwA==", "CTlqy");
        lIlIIlIll[lIlIIllIl[56]] = lIIIlIlllIIl("61Barnrz1uX4eqin5AwnqbGGsD1WE3PD", "tTQbs");
        lIlIIlIll[lIlIIllIl[57]] = lIIIlIlllIIl("+TzfH4hjriY=", "jbewZ");
        lIlIIlIll[lIlIIllIl[58]] = lIIIlIlllllI("JXYFQT8DPgMIPQtxDg4hTDBIECYJIhxA", "lQhaS");
        lIlIIlIll[lIlIIllIl[59]] = lIIIlIlllllI("GhpjdQIwBW84C3UZKjkedQUnMAB7", "UqOUn");
        lIlIIlIll[lIlIIllIl[60]] = lIIIlIlllIIl("sOipOoul/7HrnOPrUMgAL4eq1EmtuAopAvEu9NEqceRl+PDdvfIp1g==", "bMLGX");
        lIlIIlIll[lIlIIllIl[61]] = lIIIlIlllIIl("wvjbkVPiE+kgOJrA41nFMKx/B5U6o82xQBY2dkDaTiJQvA44kaU6Xi4Zsa/V9DP2", "pMoKF");
        lIlIIlIll[lIlIIllIl[62]] = lIIIlIlllIlI("M0/gsFwa3mxPajW6Y3O8MJK2qSxeM4OjXquyJYsOcAlSzUwCfofcKQ==", "TnoCX");
        lIlIIlIll[lIlIIllIl[63]] = lIIIlIlllIlI("EOAAV7lByLM=", "csFtb");
        lIlIIlIll[lIlIIllIl[64]] = lIIIlIlllIIl("fkrhRX+v/24gC65PksPwG6bLnmlFKH9VthkSzQtJUJhiKHKJ8uEgFA==", "zrtVq");
        lIlIIlIll[lIlIIllIl[65]] = lIIIlIlllIIl("wJypVzJTkLoyyYpHRhf3ew==", "bjZgt");
        lIlIIlIll[lIlIIllIl[66]] = lIIIlIlllIIl("B4Jh5zApYUFAga2II8MPLA==", "mXvvf");
    }

    private static String lIIIlIlllIlI(String lllIllIIllllII, String lllIllIIlllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIllIIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIllIIlllllI = Cipher.getInstance("Blowfish");
            lllIllIIlllllI.init(lIlIIllIl[3], secretKeySpec);
            return new String(lllIllIIlllllI.doFinal(Base64.getDecoder().decode(lllIllIIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIllIIllllIl) {
            lllIllIIllllIl.printStackTrace();
            return null;
        }
    }
}
