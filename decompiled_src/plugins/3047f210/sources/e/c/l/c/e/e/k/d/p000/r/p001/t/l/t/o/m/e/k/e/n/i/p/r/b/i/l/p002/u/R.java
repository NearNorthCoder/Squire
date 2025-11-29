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
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.R  reason: invalid package */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/R.class */
public class R implements S {
    private static /* synthetic */ int[] lllllllIll;
    static /* synthetic */ int ck;
    public static /* synthetic */ long g;
    private static final /* synthetic */ WorldPoint iQ;
    private static final /* synthetic */ WorldPoint iM;
    static /* synthetic */ boolean cl;
    private static /* synthetic */ String[] lllllllIlI;
    private static final /* synthetic */ WorldPoint iP;
    private static final /* synthetic */ WorldPoint iN;
    private static final /* synthetic */ WorldPoint iR;
    public static /* synthetic */ List<C0003d> bu;
    private static final /* synthetic */ WorldPoint iO;
    public static final /* synthetic */ String[] iL;
    public static /* synthetic */ boolean bs;
    static /* synthetic */ int bS;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v118, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v356, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v401, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v61, types: [boolean] */
    public static void dp() {
        if (llIllIIIIIllI(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllllllIlI[lllllllIll[0]];
            C0001b.a(bu);
            if (llIllIIIIIlll(bu.size(), lllllllIll[1])) {
                System.out.println(lllllllIlI[lllllllIll[1]]);
                bs = lllllllIll[0];
            }
        }
        if (llIllIIIIlIII(bs ? 1 : 0)) {
            if (llIllIIIIIllI(Inventory.contains(C0005f.aU) ? 1 : 0) && llIllIIIIIlll(Movement.getRunEnergy(), lllllllIll[2])) {
                Inventory.getFirst(C0005f.aU).interact(lllllllIlI[lllllllIll[3]]);
                Time.sleepTicks(lllllllIll[1]);
                "".length();
            }
            if (llIllIIIIlIIl(llIllIIIIIlII(C0004e.u(), 70.0d))) {
                int[] iArr = new int[lllllllIll[1]];
                iArr[lllllllIll[0]] = lllllllIll[4];
                if (llIllIIIIIllI(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lllllllIll[1]];
                    iArr2[lllllllIll[0]] = lllllllIll[4];
                    Inventory.getFirst(iArr2).interact(lllllllIlI[lllllllIll[5]]);
                }
            }
            if (llIllIIIIlIII(Movement.isRunEnabled() ? 1 : 0) && llIllIIIIlIlI(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (llIllIIIIlIII(aa() ? 1 : 0) && llIllIIIIlIII(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()))) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIllIIIIlIll(nearest) && llIllIIIIlIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllllIlI[lllllllIll[6]];
                    C0000a.a(nearest);
                    Time.sleepTicks(lllllllIll[3]);
                    "".length();
                }
                if (llIllIIIIlIll(nearest) && llIllIIIIIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllllIlI[lllllllIll[7]];
                    if (llIllIIIIlIII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllllllIll[8]);
                        "".length();
                    }
                    if (llIllIIIIIllI(Bank.isOpen() ? 1 : 0)) {
                        if (llIllIIIIlIlI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllllllIll[6]);
                            "".length();
                        }
                        if (llIllIIIIlIlI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllllllIll[3]);
                            "".length();
                        }
                        int[] iArr3 = new int[lllllllIll[9]];
                        iArr3[lllllllIll[0]] = lllllllIll[10];
                        iArr3[lllllllIll[1]] = lllllllIll[11];
                        iArr3[lllllllIll[3]] = lllllllIll[12];
                        iArr3[lllllllIll[5]] = lllllllIll[13];
                        iArr3[lllllllIll[6]] = lllllllIll[4];
                        iArr3[lllllllIll[7]] = lllllllIll[14];
                        if (llIllIIIIlIII(C0004e.b(iArr3) ? 1 : 0)) {
                            ae();
                            System.out.println(lllllllIlI[lllllllIll[9]]);
                            bs = lllllllIll[1];
                            return;
                        }
                        int[] iArr4 = new int[lllllllIll[9]];
                        iArr4[lllllllIll[0]] = lllllllIll[10];
                        iArr4[lllllllIll[1]] = lllllllIll[11];
                        iArr4[lllllllIll[3]] = lllllllIll[12];
                        iArr4[lllllllIll[5]] = lllllllIll[13];
                        iArr4[lllllllIll[6]] = lllllllIll[4];
                        iArr4[lllllllIll[7]] = lllllllIll[14];
                        if (llIllIIIIIllI(C0004e.b(iArr4) ? 1 : 0)) {
                            Bank.withdraw(lllllllIll[11], lllllllIll[15], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lllllllIll[1]);
                            "".length();
                            Bank.withdraw(lllllllIll[14], lllllllIll[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lllllllIll[1]);
                            "".length();
                            Bank.withdraw(lllllllIll[16], lllllllIll[15], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lllllllIll[1]);
                            "".length();
                            Bank.withdraw(lllllllIll[13], lllllllIll[7], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lllllllIll[1]);
                            "".length();
                            Bank.withdraw(lllllllIll[10], lllllllIll[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lllllllIll[1]);
                            "".length();
                            C0000a.b(C0005f.aU, lllllllIll[6]);
                            C0000a.a(lllllllIll[4], lllllllIll[15]);
                            C0000a.b(C0005f.be, lllllllIll[1]);
                        }
                    }
                }
            }
            if (llIllIIIIlIII(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId())) && llIllIIIIIllI(aa() ? 1 : 0)) {
                if (llIllIIIIllII(Players.getLocal().getWorldLocation().distanceTo(iM), lllllllIll[3])) {
                    AccBuilderTempleTrek.c = lllllllIlI[lllllllIll[17]];
                    if (llIllIIIIIlll(bS, lllllllIll[1])) {
                        C0004e.v();
                        bS += lllllllIll[1];
                    }
                    Movement.walkTo(iM);
                    "".length();
                    Time.sleepTicks(lllllllIll[1]);
                    "".length();
                }
                if (llIllIIIIllIl(Players.getLocal().getWorldLocation().distanceTo(iM), lllllllIll[3])) {
                    AccBuilderTempleTrek.c = lllllllIlI[lllllllIll[18]];
                    if (llIllIIIIlIII(llIllIIIIIlIl(g, 0L))) {
                        g = System.currentTimeMillis();
                    }
                    if (llIllIIIIIllI(llIllIIIIIlIl(g, 0L)) && llIllIIIIlIlI(llIllIIIIIlIl(C0004e.a(g), 30000L))) {
                        bS = lllllllIll[0];
                        g = System.currentTimeMillis();
                    }
                    if (llIllIIIIIlll(bS, lllllllIll[1])) {
                        C0004e.v();
                        bS += lllllllIll[1];
                    }
                    if (llIllIIIIIllI(Inventory.isFull() ? 1 : 0)) {
                        int[] iArr5 = new int[lllllllIll[1]];
                        iArr5[lllllllIll[0]] = lllllllIll[4];
                        Inventory.getFirst(iArr5).interact(lllllllIlI[lllllllIll[19]]);
                        Time.sleepTicks(lllllllIll[3]);
                        "".length();
                    }
                    C0006g.a(lllllllIlI[lllllllIll[15]], iL, lllllllIll[1]);
                }
            }
            if (llIllIIIIlllI(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllllllIll[1])) {
                ck = lllllllIll[0];
                String[] strArr = new String[lllllllIll[1]];
                strArr[lllllllIll[0]] = lllllllIlI[lllllllIll[20]];
                if (llIllIIIIlIII(Inventory.contains(strArr) ? 1 : 0)) {
                    C0006g.a(iL);
                }
            }
            if (llIllIIIIlllI(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllllllIll[3])) {
                if (llIllIIIIIllI(Inventory.contains(item -> {
                    return item.getName().contains(lllllllIlI[lllllllIll[61]]);
                }) ? 1 : 0) && llIllIIIIlIII(Equipment.contains(item2 -> {
                    return item2.getName().contains(lllllllIlI[lllllllIll[60]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item3 -> {
                        return item3.getName().contains(lllllllIlI[lllllllIll[53]]);
                    }).interact(lllllllIlI[lllllllIll[21]]);
                }
                if (llIllIIIIIllI(Inventory.contains(item4 -> {
                    return item4.getName().contains(lllllllIlI[lllllllIll[59]]);
                }) ? 1 : 0) && llIllIIIIlIII(Equipment.contains(item5 -> {
                    return item5.getName().contains(lllllllIlI[lllllllIll[58]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item6 -> {
                        return item6.getName().contains(lllllllIlI[lllllllIll[57]]);
                    }).interact(lllllllIlI[lllllllIll[22]]);
                }
                if (llIllIIIIlIII(Players.getLocal().getWorldLocation().equals(iN) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllllIlI[lllllllIll[23]];
                    Movement.walkTo(iN);
                    "".length();
                    Time.sleepTicks(lllllllIll[1]);
                    "".length();
                }
                if (llIllIIIIIllI(Players.getLocal().getWorldLocation().equals(iN) ? 1 : 0)) {
                    String[] strArr2 = new String[lllllllIll[1]];
                    strArr2[lllllllIll[0]] = lllllllIlI[lllllllIll[24]];
                    Inventory.getFirst(strArr2).interact(lllllllIlI[lllllllIll[25]]);
                    Time.sleepTicks(lllllllIll[3]);
                    "".length();
                }
            }
            if (llIllIIIIlllI(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllllllIll[5])) {
                if (llIllIIIIlIII(Players.getLocal().getWorldLocation().equals(iO) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllllIlI[lllllllIll[26]];
                    Movement.walkTo(iO);
                    "".length();
                    Time.sleepTicks(lllllllIll[1]);
                    "".length();
                }
                if (llIllIIIIIllI(Players.getLocal().getWorldLocation().equals(iO) ? 1 : 0)) {
                    String[] strArr3 = new String[lllllllIll[1]];
                    strArr3[lllllllIll[0]] = lllllllIlI[lllllllIll[27]];
                    Inventory.getFirst(strArr3).interact(lllllllIlI[lllllllIll[28]]);
                    Time.sleepTicks(lllllllIll[3]);
                    "".length();
                }
            }
            if (llIllIIIIlllI(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllllllIll[6])) {
                if (llIllIIIIlIII(Players.getLocal().getWorldLocation().equals(iP) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllllIlI[lllllllIll[29]];
                    Movement.walkTo(iP);
                    "".length();
                    Time.sleepTicks(lllllllIll[1]);
                    "".length();
                }
                if (llIllIIIIIllI(Players.getLocal().getWorldLocation().equals(iP) ? 1 : 0)) {
                    String[] strArr4 = new String[lllllllIll[1]];
                    strArr4[lllllllIll[0]] = lllllllIlI[lllllllIll[30]];
                    Inventory.getFirst(strArr4).interact(lllllllIlI[lllllllIll[31]]);
                    Time.sleepTicks(lllllllIll[3]);
                    "".length();
                }
            }
            if (llIllIIIIlllI(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllllllIll[7])) {
                if (llIllIIIIlIII(Players.getLocal().getWorldLocation().equals(iQ) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllllIlI[lllllllIll[32]];
                    Movement.walkTo(iQ);
                    "".length();
                    Time.sleepTicks(lllllllIll[1]);
                    "".length();
                }
                if (llIllIIIIIllI(Players.getLocal().getWorldLocation().equals(iQ) ? 1 : 0)) {
                    String[] strArr5 = new String[lllllllIll[1]];
                    strArr5[lllllllIll[0]] = lllllllIlI[lllllllIll[33]];
                    Inventory.getFirst(strArr5).interact(lllllllIlI[lllllllIll[34]]);
                    Time.sleepTicks(lllllllIll[3]);
                    "".length();
                }
            }
            if (llIllIIIIlllI(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllllllIll[9])) {
                if (llIllIIIIllII(Players.getLocal().getWorldLocation().distanceTo(iR), lllllllIll[5])) {
                    AccBuilderTempleTrek.c = lllllllIlI[lllllllIll[35]];
                    Movement.walkTo(iR);
                    "".length();
                    Time.sleepTicks(lllllllIll[1]);
                    "".length();
                }
                if (llIllIIIIllIl(Players.getLocal().getWorldLocation().distanceTo(iR), lllllllIll[5])) {
                    AccBuilderTempleTrek.c = lllllllIlI[lllllllIll[36]];
                    if (llIllIIIIIlll(ck, lllllllIll[1])) {
                        ac.mI += lllllllIll[1];
                        ac.d(AccBuilderTempleTrek.m);
                        ck += lllllllIll[1];
                        ac.mI = lllllllIll[0];
                        cl = lllllllIll[0];
                    }
                    C0006g.a(lllllllIlI[lllllllIll[37]], iL);
                }
            }
            if (llIllIIIIlllI(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllllllIll[17])) {
                C0006g.a(iL);
            }
            do {
                int[] iArr6 = new int[lllllllIll[1]];
                iArr6[lllllllIll[0]] = lllllllIll[38];
                if (!llIllIIIIIllI(Inventory.contains(iArr6) ? 1 : 0)) {
                    C0006g.a(new String[lllllllIll[0]]);
                    return;
                }
                if (llIllIIIIlIll(Widgets.get(lllllllIll[39]))) {
                    AccBuilderTempleTrek.c = lllllllIlI[lllllllIll[40]];
                    int[] iArr7 = new int[lllllllIll[1]];
                    iArr7[lllllllIll[0]] = lllllllIll[38];
                    Inventory.getFirst(iArr7).interact(lllllllIlI[lllllllIll[41]]);
                    Time.sleepTicks(lllllllIll[6]);
                    "".length();
                    AccBuilderTempleTrek.c = lllllllIlI[lllllllIll[42]];
                    Widget widget = Widgets.get(lllllllIll[39], lllllllIll[23]);
                    if (llIllIIIIlIll(widget)) {
                        widget.interact(lllllllIlI[lllllllIll[43]]);
                        Time.sleepTicks(lllllllIll[1]);
                        "".length();
                    }
                    Widget widget2 = Widgets.get(lllllllIll[39], lllllllIll[35]);
                    if (llIllIIIIlIll(widget2)) {
                        widget2.interact(lllllllIlI[lllllllIll[44]]);
                        Time.sleepTicks(lllllllIll[3]);
                        "".length();
                    }
                }
                Time.sleepTicks(lllllllIll[1]);
                "".length();
                "".length();
            } while ((-"   ".length()) < 0);
        }
    }

    static {
        llIllIIIIIIll();
        llIllIIIIIIlI();
        String[] strArr = new String[lllllllIll[24]];
        strArr[lllllllIll[0]] = lllllllIlI[lllllllIll[62]];
        strArr[lllllllIll[1]] = lllllllIlI[lllllllIll[63]];
        strArr[lllllllIll[3]] = lllllllIlI[lllllllIll[64]];
        strArr[lllllllIll[5]] = lllllllIlI[lllllllIll[65]];
        strArr[lllllllIll[6]] = lllllllIlI[lllllllIll[66]];
        strArr[lllllllIll[7]] = lllllllIlI[lllllllIll[67]];
        strArr[lllllllIll[9]] = lllllllIlI[lllllllIll[68]];
        strArr[lllllllIll[17]] = lllllllIlI[lllllllIll[69]];
        strArr[lllllllIll[18]] = lllllllIlI[lllllllIll[70]];
        strArr[lllllllIll[19]] = lllllllIlI[lllllllIll[71]];
        strArr[lllllllIll[15]] = lllllllIlI[lllllllIll[72]];
        strArr[lllllllIll[20]] = lllllllIlI[lllllllIll[73]];
        strArr[lllllllIll[21]] = lllllllIlI[lllllllIll[48]];
        strArr[lllllllIll[22]] = lllllllIlI[lllllllIll[74]];
        strArr[lllllllIll[23]] = lllllllIlI[lllllllIll[75]];
        iL = strArr;
        iM = new WorldPoint(lllllllIll[76], lllllllIll[77], lllllllIll[0]);
        iN = new WorldPoint(lllllllIll[78], lllllllIll[79], lllllllIll[0]);
        iO = new WorldPoint(lllllllIll[80], lllllllIll[81], lllllllIll[0]);
        iP = new WorldPoint(lllllllIll[82], lllllllIll[83], lllllllIll[0]);
        iQ = new WorldPoint(lllllllIll[84], lllllllIll[85], lllllllIll[0]);
        iR = new WorldPoint(lllllllIll[86], lllllllIll[87], lllllllIll[0]);
        bu = new ArrayList();
        bS = lllllllIll[0];
    }

    private static boolean llIllIIIIlIII(int i) {
        return i == 0;
    }

    private static String llIlIllllllll(String lllllllllllllllllIlIIIlIIIIIllII, String lllllllllllllllllIlIIIlIIIIIlIll) {
        String lllllllllllllllllIlIIIlIIIIIllII2 = new String(Base64.getDecoder().decode(lllllllllllllllllIlIIIlIIIIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIIIlIIIIIlIlI = new StringBuilder();
        char[] charArray = lllllllllllllllllIlIIIlIIIIIlIll.toCharArray();
        int lllllllllllllllllIlIIIlIIIIIlIII = lllllllIll[0];
        char[] charArray2 = lllllllllllllllllIlIIIlIIIIIllII2.toCharArray();
        int length = charArray2.length;
        int i = lllllllIll[0];
        while (llIllIIIIIlll(i, length)) {
            lllllllllllllllllIlIIIlIIIIIlIlI.append((char) (charArray2[i] ^ charArray[lllllllllllllllllIlIIIlIIIIIlIII % charArray.length]));
            "".length();
            lllllllllllllllllIlIIIlIIIIIlIII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllIlIIIlIIIIIlIlI);
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return lllllllIlI[lllllllIll[55]];
    }

    private static void ae() {
        int[] iArr = new int[lllllllIll[1]];
        iArr[lllllllIll[0]] = lllllllIll[10];
        if (llIllIIIIlIII(Bank.contains(iArr) ? 1 : 0)) {
            bu.add(new C0003d(lllllllIll[10], lllllllIll[1], lllllllIll[46]));
            "".length();
        }
        int[] iArr2 = new int[lllllllIll[1]];
        iArr2[lllllllIll[0]] = lllllllIll[14];
        if (llIllIIIIlIII(Bank.contains(iArr2) ? 1 : 0)) {
            bu.add(new C0003d(lllllllIll[14], lllllllIll[1], lllllllIll[47]));
            "".length();
        }
        int[] iArr3 = new int[lllllllIll[1]];
        iArr3[lllllllIll[0]] = lllllllIll[4];
        if (llIllIIIIlIII(Bank.contains(iArr3) ? 1 : 0)) {
            bu.add(new C0003d(lllllllIll[4], lllllllIll[48], lllllllIll[49]));
            "".length();
        }
        if (llIllIIIIlIII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lllllllIlI[lllllllIll[56]]);
        }) ? 1 : 0)) {
            bu.add(new C0003d(lllllllIll[50], lllllllIll[7], lllllllIll[51]));
            "".length();
        }
        int[] iArr4 = new int[lllllllIll[1]];
        iArr4[lllllllIll[0]] = lllllllIll[11];
        if (llIllIIIIlIII(Bank.contains(iArr4) ? 1 : 0)) {
            bu.add(new C0003d(lllllllIll[11], lllllllIll[15], lllllllIll[52]));
            "".length();
        }
        int[] iArr5 = new int[lllllllIll[1]];
        iArr5[lllllllIll[0]] = lllllllIll[16];
        if (llIllIIIIlIII(Bank.contains(iArr5) ? 1 : 0)) {
            bu.add(new C0003d(lllllllIll[16], lllllllIll[15], lllllllIll[52]));
            "".length();
        }
        int[] iArr6 = new int[lllllllIll[1]];
        iArr6[lllllllIll[0]] = lllllllIll[13];
        if (llIllIIIIlIII(Bank.contains(iArr6) ? 1 : 0)) {
            bu.add(new C0003d(lllllllIll[13], lllllllIll[53], lllllllIll[52]));
            "".length();
        }
        int[] iArr7 = new int[lllllllIll[1]];
        iArr7[lllllllIll[0]] = lllllllIll[12];
        if (llIllIIIIlIII(Bank.contains(iArr7) ? 1 : 0)) {
            bu.add(new C0003d(lllllllIll[12], lllllllIll[7], C0008i.bp));
            "".length();
        }
    }

    private static boolean llIllIIIIllIl(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIllIIIIlIll(Object obj) {
        return obj != null;
    }

    private static boolean llIllIIIIlllI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return lllllllIll[0];
    }

    private static boolean llIllIIIIlIlI(int i) {
        return i > 0;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            dp();
            "".length();
            if (" ".length() <= 0) {
                return "  ".length() & ("  ".length() ^ (-1));
            }
        } catch (Exception e2) {
        }
        return lllllllIll[54];
    }

    private static boolean llIllIIIIIllI(int i) {
        return i != 0;
    }

    private static void llIllIIIIIIll() {
        lllllllIll = new int[89];
        lllllllIll[0] = ((8 ^ 98) ^ (195 ^ 172)) & (((((124 + 91) - 162) + 146) ^ (((109 + 148) - 133) + 70)) ^ (-" ".length()));
        lllllllIll[1] = " ".length();
        lllllllIll[2] = 234 ^ 172;
        lllllllIll[3] = "  ".length();
        lllllllIll[4] = (-((-571) & 27199)) & (-4737) & 31743;
        lllllllIll[5] = "   ".length();
        lllllllIll[6] = (89 ^ 57) ^ (126 ^ 26);
        lllllllIll[7] = (208 ^ 129) ^ (72 ^ 28);
        lllllllIll[8] = (-19553) & 24552;
        lllllllIll[9] = 83 ^ 85;
        lllllllIll[10] = (-((-12098) & 32631)) & (-257) & 32767;
        lllllllIll[11] = (-151) & 8158;
        lllllllIll[12] = (-((-29169) & 32767)) & (-129) & 16351;
        lllllllIll[13] = (-16521) & 24527;
        lllllllIll[14] = (-((-402) & 28117)) & (-1) & 28667;
        lllllllIll[15] = 145 ^ 155;
        lllllllIll[16] = (-8243) & 16251;
        lllllllIll[17] = (52 ^ 77) ^ (215 ^ 169);
        lllllllIll[18] = (63 ^ 89) ^ (125 ^ 19);
        lllllllIll[19] = (((59 + 92) - 72) + 57) ^ (((32 + 32) - 50) + 115);
        lllllllIll[20] = 20 ^ 31;
        lllllllIll[21] = (((145 + 122) - 241) + 153) ^ (((136 + 146) - 157) + 66);
        lllllllIll[22] = 206 ^ 195;
        lllllllIll[23] = 118 ^ 120;
        lllllllIll[24] = 15 ^ 0;
        lllllllIll[25] = 215 ^ 199;
        lllllllIll[26] = 122 ^ 107;
        lllllllIll[27] = (127 ^ 15) ^ (222 ^ 188);
        lllllllIll[28] = 137 ^ 154;
        lllllllIll[29] = 72 ^ 92;
        lllllllIll[30] = 94 ^ 75;
        lllllllIll[31] = (48 ^ 68) ^ (221 ^ 191);
        lllllllIll[32] = (((31 + 77) - 91) + 128) ^ (((57 + 19) - 28) + 86);
        lllllllIll[33] = 82 ^ 74;
        lllllllIll[34] = 5 ^ 28;
        lllllllIll[35] = 87 ^ 77;
        lllllllIll[36] = (80 ^ 56) ^ (72 ^ 59);
        lllllllIll[37] = (145 ^ 175) ^ (160 ^ 130);
        lllllllIll[38] = (-((-30241) & 30632)) & (-81) & 23543;
        lllllllIll[39] = ((59 + 8) - (-31)) + 142;
        lllllllIll[40] = (86 ^ 72) ^ "   ".length();
        lllllllIll[41] = (((68 + 134) - 108) + 45) ^ (((132 + 139) - 169) + 47);
        lllllllIll[42] = 50 ^ 45;
        lllllllIll[43] = 152 ^ 184;
        lllllllIll[44] = (((35 + 93) - (-44)) + 57) ^ (((193 + 120) - 130) + 13);
        lllllllIll[45] = (43 ^ 15) ^ (30 ^ 24);
        lllllllIll[46] = (-321) & 16220;
        lllllllIll[47] = (-8371) & 14270;
        lllllllIll[48] = 191 ^ 136;
        lllllllIll[49] = (-((-323) & 32078)) & (-1) & 32255;
        lllllllIll[50] = (-16644) & 28623;
        lllllllIll[51] = (-((-26) & 7263)) & (-529) & 32765;
        lllllllIll[52] = (-"   ".length()) & (-18433) & 20334;
        lllllllIll[53] = (100 ^ 69) ^ (186 ^ 179);
        lllllllIll[54] = 5 ^ 97;
        lllllllIll[55] = (53 ^ 61) ^ (4 ^ 47);
        lllllllIll[56] = (70 ^ 121) ^ (97 ^ 122);
        lllllllIll[57] = (((90 + 6) - (-37)) + 42) ^ (((0 + 29) - (-2)) + 107);
        lllllllIll[58] = (122 ^ 101) ^ (172 ^ 149);
        lllllllIll[59] = (211 ^ 147) ^ (117 ^ 18);
        lllllllIll[60] = 138 ^ 163;
        lllllllIll[61] = 53 ^ 31;
        lllllllIll[62] = (29 ^ 64) ^ (224 ^ 150);
        lllllllIll[63] = (140 ^ 131) ^ (13 ^ 46);
        lllllllIll[64] = 47 ^ 2;
        lllllllIll[65] = 47 ^ 1;
        lllllllIll[66] = 103 ^ 72;
        lllllllIll[67] = 83 ^ 99;
        lllllllIll[68] = 244 ^ 197;
        lllllllIll[69] = (((84 + 91) - 85) + 57) ^ (((47 + 146) - 66) + 34);
        lllllllIll[70] = 82 ^ 97;
        lllllllIll[71] = (212 ^ 152) ^ (118 ^ 14);
        lllllllIll[72] = 112 ^ 69;
        lllllllIll[73] = (110 ^ 99) ^ (10 ^ 49);
        lllllllIll[74] = (((153 + 143) - 290) + 156) ^ (((78 + 59) - 58) + 75);
        lllllllIll[75] = 91 ^ 98;
        lllllllIll[76] = (-29281) & 32509;
        lllllllIll[77] = (-((-7331) & 16374)) & (-16389) & 28671;
        lllllllIll[78] = (-17218) & 20447;
        lllllllIll[79] = (-((-1409) & 1943)) & (-4417) & 8159;
        lllllllIll[80] = (-13153) & 16355;
        lllllllIll[81] = (-770) & 3981;
        lllllllIll[82] = (-((-5) & 29517)) & (-147) & 32767;
        lllllllIll[83] = (-23) & 3286;
        lllllllIll[84] = (-((-1426) & 30107)) & (-721) & 32479;
        lllllllIll[85] = (-8513) & 11771;
        lllllllIll[86] = (-((-8358) & 25767)) & (-8209) & 28671;
        lllllllIll[87] = (-((-4154) & 13179)) & (-16385) & 28655;
        lllllllIll[88] = 169 ^ 147;
    }

    private static int llIllIIIIIlIl(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static String llIllIIIIIIII(String lllllllllllllllllIlIIIIlllllIlll, String lllllllllllllllllIlIIIIlllllIlII) {
        try {
            SecretKeySpec lllllllllllllllllIlIIIIllllllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIIlllllIlII.getBytes(StandardCharsets.UTF_8)), lllllllIll[18]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllllllIll[3], lllllllllllllllllIlIIIIllllllIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIIlllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIIIllllllIII) {
            lllllllllllllllllIlIIIIllllllIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIllIIIIlllI(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllllllIll[18])) {
            int[] iArr = new int[lllllllIll[1]];
            iArr[lllllllIll[0]] = lllllllIll[38];
            if (llIllIIIIlIII(Inventory.contains(iArr) ? 1 : 0)) {
                ?? r0 = lllllllIll[1];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return lllllllIll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean aa() {
        String[] strArr = new String[lllllllIll[1]];
        strArr[lllllllIll[0]] = lllllllIlI[lllllllIll[45]];
        if (llIllIIIIIllI(Inventory.contains(strArr) ? 1 : 0)) {
            int[] iArr = new int[lllllllIll[1]];
            iArr[lllllllIll[0]] = lllllllIll[4];
            if (llIllIIIIIllI(Inventory.contains(iArr) ? 1 : 0)) {
                ?? r0 = lllllllIll[1];
                "".length();
                return (" ".length() & (" ".length() ^ (-" ".length()))) != 0 ? (((23 ^ 76) & ((33 ^ 122) ^ (-1))) ^ (155 ^ 147)) & (((193 ^ 151) ^ (43 ^ 117)) ^ (-" ".length())) : r0;
            }
        }
        return lllllllIll[0];
    }

    private static boolean llIllIIIIIlll(int i, int i2) {
        return i < i2;
    }

    private static boolean llIllIIIIlIIl(int i) {
        return i < 0;
    }

    private static String llIllIIIIIIIl(String lllllllllllllllllIlIIIIllllIlIlI, String lllllllllllllllllIlIIIIllllIlIIl) {
        try {
            SecretKeySpec lllllllllllllllllIlIIIIllllIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIIllllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIIIIllllIllII = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIIIIllllIllII.init(lllllllIll[3], lllllllllllllllllIlIIIIllllIllIl);
            return new String(lllllllllllllllllIlIIIIllllIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIIllllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIIIllllIlIll) {
            lllllllllllllllllIlIIIIllllIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIIIllII(int i, int i2) {
        return i > i2;
    }

    private static int llIllIIIIIlII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static void llIllIIIIIIlI() {
        lllllllIlI = new String[lllllllIll[88]];
        lllllllIlI[lllllllIll[0]] = llIlIllllllll("OycfKyQecg82LxQh", "yRfBJ");
        lllllllIlI[lllllllIll[1]] = llIllIIIIIIII("914hLJGEd+a6lTxJJ5URxx52LW37CVQByNk5hej17kh29fEzzXv4AnnRSGICeo4N", "vAzyf");
        lllllllIlI[lllllllIll[3]] = llIllIIIIIIII("+wyqpnlV+kU=", "kbzRj");
        lllllllIlI[lllllllIll[5]] = llIllIIIIIIIl("Auh4YM/oPW4=", "ZbyIa");
        lllllllIlI[lllllllIll[6]] = llIllIIIIIIII("MUHAOS/MU4Je/1kM9AX5hg==", "KRNiG");
        lllllllIlI[lllllllIll[7]] = llIllIIIIIIIl("3WfRno8Hx0VvKEYJxMKuDldyL1qCnYfV", "rqQAn");
        lllllllIlI[lllllllIll[9]] = llIllIIIIIIIl("BLXWwYvCb68QbFoWxaBOcTmpi8XaWEPq08rMn9dUwHTa+S2/mPWu8xqi6Cgco4nWklFe/1ml2vo=", "BUmPV");
        lllllllIlI[lllllllIll[17]] = llIllIIIIIIIl("zRTNfFQtAzjWItPQAoZ4sg==", "JDBao");
        lllllllIlI[lllllllIll[18]] = llIlIllllllll("MAI4JxoYDzhiBgkP", "ylLBh");
        lllllllIlI[lllllllIll[19]] = llIlIllllllll("DQQ9Jg==", "IvRVp");
        lllllllIlI[lllllllIll[15]] = llIlIllllllll("ESs8GA==", "GNSkt");
        lllllllIlI[lllllllIll[20]] = llIllIIIIIIII("EikaVLQ1eCfvIOsAO7hV6w==", "KMtFW");
        lllllllIlI[lllllllIll[21]] = llIllIIIIIIII("TPXe8KRSEZI=", "UWwXb");
        lllllllIlI[lllllllIll[22]] = llIllIIIIIIIl("Ci6QtZKiZlI=", "xOfqt");
        lllllllIlI[lllllllIll[23]] = llIllIIIIIIII("OanNwMcYB3FyzvHIOshkSQ==", "rxrwz");
        lllllllIlI[lllllllIll[24]] = llIllIIIIIIIl("TZMDFY2ns6Y=", "eYDMD");
        lllllllIlI[lllllllIll[25]] = llIlIllllllll("Iyoy", "gCULg");
        lllllllIlI[lllllllIll[26]] = llIlIllllllll("KzISdRwKcwA8D0Vh", "eSdUh");
        lllllllIlI[lllllllIll[27]] = llIllIIIIIIII("DogGZ1UDVCY=", "qWIuh");
        lllllllIlI[lllllllIll[28]] = llIllIIIIIIII("di47uhbGRPM=", "pDOfL");
        lllllllIlI[lllllllIll[29]] = llIllIIIIIIII("qQ7aEhrKW2lCvkFl+w5I8w==", "hnVux");
        lllllllIlI[lllllllIll[30]] = llIllIIIIIIIl("AenfD32g5YE=", "vLZtU");
        lllllllIlI[lllllllIll[31]] = llIllIIIIIIII("pwRzUgeE5xY=", "KXygY");
        lllllllIlI[lllllllIll[32]] = llIllIIIIIIIl("89p6ipHBnnR+alDr9n0StQ==", "VJNUF");
        lllllllIlI[lllllllIll[33]] = llIlIllllllll("OBcYDQc=", "kgyib");
        lllllllIlI[lllllllIll[34]] = llIllIIIIIIII("T9oCEhOczu0=", "ClGvT");
        lllllllIlI[lllllllIll[35]] = llIllIIIIIIII("MbsMSZJFMXVeYbwKWr3nZhUgpuLexBAC", "bMFCC");
        lllllllIlI[lllllllIll[36]] = llIlIllllllll("OysNFzYTJg1SKgIm", "rEyrD");
        lllllllIlI[lllllllIll[37]] = llIlIllllllll("GjMXEQ==", "LVxbm");
        lllllllIlI[lllllllIll[40]] = llIlIllllllll("HwEYIyUjE1otLSAE", "MtzAL");
        lllllllIlI[lllllllIll[41]] = llIllIIIIIIII("U3KK2hFF/sc=", "FMvFc");
        lllllllIlI[lllllllIll[42]] = llIllIIIIIIIl("cnCwe513j98SpnECeHlZEOF75XnlLFWD", "iOvff");
        lllllllIlI[lllllllIll[43]] = llIllIIIIIIIl("3vRkGcWzlLY=", "ruSLN");
        lllllllIlI[lllllllIll[44]] = llIllIIIIIIIl("9O2bwit2+oo=", "sXADG");
        lllllllIlI[lllllllIll[45]] = llIlIllllllll("CiQDNQ4=", "YTbQk");
        lllllllIlI[lllllllIll[55]] = llIllIIIIIIII("KbMGpWnbiP2CIAMz3v28/2txUJVuG9Ew", "EQVXc");
        lllllllIlI[lllllllIll[56]] = llIlIllllllll("MTsiIVAsNGwxFSI+OC5Qaw==", "CRLFp");
        lllllllIlI[lllllllIll[57]] = llIlIllllllll("ORICIT8m", "NwcMK");
        lllllllIlI[lllllllIll[58]] = llIlIllllllll("Ay4bDSYc", "tKzaR");
        lllllllIlI[lllllllIll[59]] = llIlIllllllll("BCYkGjMb", "sCEvG");
        lllllllIlI[lllllllIll[53]] = llIlIllllllll("CAIXOTs=", "onxKB");
        lllllllIlI[lllllllIll[60]] = llIlIllllllll("BggdFD0=", "adrfD");
        lllllllIlI[lllllllIll[61]] = llIllIIIIIIII("TuglXswA0uk=", "nFzrz");
        lllllllIlI[lllllllIll[62]] = llIllIIIIIIII("dlRqCIwXgXiInm3u5uBcmuPdgmmfARnRczia3jIrHSM=", "YezzK");
        lllllllIlI[lllllllIll[63]] = llIlIllllllll("KHI1LiQaIXItI0krPTc3STQ7LCAaJnIjKQxyIi4gCCE3bA==", "iRRBE");
        lllllllIlI[lllllllIll[64]] = llIllIIIIIIIl("3SFS86q7hHbcY0u0YtztaTEnnBUg89p+", "oDent");
        lllllllIlI[lllllllIll[65]] = llIllIIIIIIII("jAySL8TQsYo=", "UbCvC");
        lllllllIlI[lllllllIll[66]] = llIllIIIIIIIl("Wiq8ZGY8zVY7ZMtccjUNq+9sekOcy0gVsiCvVmM6J2I=", "UUgif");
        lllllllIlI[lllllllIll[67]] = llIlIllllllll("Kw19UAUBEnEdDEQONBwZRBI5FQdK", "dfQpi");
        lllllllIlI[lllllllIll[68]] = llIlIllllllll("FDcAAT0gdjUMKjc1H0krNzgASTU3dgAGeCY3GAJ4JjlUEDcneA==", "RVtiX");
        lllllllIlI[lllllllIll[69]] = llIlIllllllll("CTxdIXUmNg5yNGE+Ej0mNXkSMyAvLRM8MmExEyF1JisbJDA4OAg2ew==", "AYzRU");
        lllllllIlI[lllllllIll[70]] = llIllIIIIIIIl("ecGhh3bDzx60gB0cAyvU6/AHijRZJs48GSnKWIN73FbtaHN6F/14ZQ==", "fIDgG");
        lllllllIlI[lllllllIll[71]] = llIllIIIIIIII("TdoVe4ADatw=", "BJgRR");
        lllllllIlI[lllllllIll[72]] = llIlIllllllll("AGovci4sLDA7Ny5tIzx5KCA3Pjw9bS00eS4lLSEtaT4yNzgibA==", "IMBRY");
        lllllllIlI[lllllllIll[73]] = llIllIIIIIIIl("Gq0IX4zqapPK6f47p6TDfg==", "TkNFG");
        lllllllIlI[lllllllIll[48]] = llIllIIIIIIII("Y2BLtnFaWJaBLkajBc2MfQ==", "usnZF");
        lllllllIlI[lllllllIll[74]] = llIlIllllllll("C1IbVyEtGh0eIyVVEBg/YhRWBjgnBgJZ", "BuvwM");
        lllllllIlI[lllllllIll[75]] = llIllIIIIIIIl("jKo3qRs1ActWF6NciDVKhQ==", "KtMcc");
    }
}
