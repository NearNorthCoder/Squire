package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.ab  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/ab.class */
public class C0002ab implements InterfaceC0003ac {
    public static final /* synthetic */ String[] mM;
    private static /* synthetic */ int[] llIlIIlIll;
    public static /* synthetic */ boolean bt;
    private static final /* synthetic */ WorldPoint mS;
    static /* synthetic */ boolean dj;
    private static /* synthetic */ String[] llIlIIIllI;
    static /* synthetic */ int cG;
    static /* synthetic */ int di;
    private static final /* synthetic */ WorldPoint mO;
    private static final /* synthetic */ WorldPoint mQ;
    public static /* synthetic */ long g;
    public static /* synthetic */ List<C0017d> bv;
    private static final /* synthetic */ WorldPoint mR;
    private static final /* synthetic */ WorldPoint mN;
    private static final /* synthetic */ WorldPoint mP;

    private static void Q() {
        int[] iArr = new int[llIlIIlIll[1]];
        iArr[llIlIIlIll[0]] = llIlIIlIll[10];
        if (lIllIIlIIIIIl(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0017d(llIlIIlIll[10], llIlIIlIll[1], llIlIIlIll[46]));
            "".length();
        }
        int[] iArr2 = new int[llIlIIlIll[1]];
        iArr2[llIlIIlIll[0]] = llIlIIlIll[14];
        if (lIllIIlIIIIIl(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0017d(llIlIIlIll[14], llIlIIlIll[1], llIlIIlIll[47]));
            "".length();
        }
        int[] iArr3 = new int[llIlIIlIll[1]];
        iArr3[llIlIIlIll[0]] = llIlIIlIll[4];
        if (lIllIIlIIIIIl(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0017d(llIlIIlIll[4], llIlIIlIll[48], llIlIIlIll[49]));
            "".length();
        }
        if (lIllIIlIIIIIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIlIIIllI[llIlIIlIll[56]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(llIlIIlIll[50], llIlIIlIll[7], llIlIIlIll[51]));
            "".length();
        }
        int[] iArr4 = new int[llIlIIlIll[1]];
        iArr4[llIlIIlIll[0]] = llIlIIlIll[11];
        if (lIllIIlIIIIIl(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(llIlIIlIll[11], llIlIIlIll[15], llIlIIlIll[52]));
            "".length();
        }
        int[] iArr5 = new int[llIlIIlIll[1]];
        iArr5[llIlIIlIll[0]] = llIlIIlIll[16];
        if (lIllIIlIIIIIl(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0017d(llIlIIlIll[16], llIlIIlIll[15], llIlIIlIll[52]));
            "".length();
        }
        int[] iArr6 = new int[llIlIIlIll[1]];
        iArr6[llIlIIlIll[0]] = llIlIIlIll[13];
        if (lIllIIlIIIIIl(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0017d(llIlIIlIll[13], llIlIIlIll[53], llIlIIlIll[52]));
            "".length();
        }
        int[] iArr7 = new int[llIlIIlIll[1]];
        iArr7[llIlIIlIll[0]] = llIlIIlIll[12];
        if (lIllIIlIIIIIl(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0017d(llIlIIlIll[12], llIlIIlIll[7], C0023j.cf));
            "".length();
        }
    }

    private static String lIllIIIlIIIll(String llllllllllllllllllIIlIIIIllIlllI, String llllllllllllllllllIIlIIIIllIlIII) {
        String llllllllllllllllllIIlIIIIllIlllI2 = new String(Base64.getDecoder().decode(llllllllllllllllllIIlIIIIllIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIlIIIIllIllII = new StringBuilder();
        char[] charArray = llllllllllllllllllIIlIIIIllIlIII.toCharArray();
        int llllllllllllllllllIIlIIIIllIlIlI = llIlIIlIll[0];
        char[] charArray2 = llllllllllllllllllIIlIIIIllIlllI2.toCharArray();
        int length = charArray2.length;
        int i = llIlIIlIll[0];
        while (lIllIIlIIIIII(i, length)) {
            char llllllllllllllllllIIlIIIIllIllll = charArray2[i];
            llllllllllllllllllIIlIIIIllIllII.append((char) (llllllllllllllllllIIlIIIIllIllll ^ charArray[llllllllllllllllllIIlIIIIllIlIlI % charArray.length]));
            "".length();
            llllllllllllllllllIIlIIIIllIlIlI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIIlIIIIllIllII);
    }

    private static boolean lIllIIlIIIlIl(int i, int i2) {
        return i > i2;
    }

    private static String lIllIIIlIIlII(String llllllllllllllllllIIlIIIlIIIlIIl, String llllllllllllllllllIIlIIIlIIIlIlI) {
        try {
            SecretKeySpec llllllllllllllllllIIlIIIlIIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIlIIIlIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIlIIIlIIIllIl = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIlIIIlIIIllIl.init(llIlIIlIll[3], llllllllllllllllllIIlIIIlIIIlllI);
            return new String(llllllllllllllllllIIlIIIlIIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIlIIIlIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIlIIIlIIIllII) {
            llllllllllllllllllIIlIIIlIIIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIIIllI(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIllIIlIIIIIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean an() {
        String[] strArr = new String[llIlIIlIll[1]];
        strArr[llIlIIlIll[0]] = llIlIIIllI[llIlIIlIll[45]];
        if (lIllIIIllllll(Inventory.contains(strArr) ? 1 : 0)) {
            int[] iArr = new int[llIlIIlIll[1]];
            iArr[llIlIIlIll[0]] = llIlIIlIll[4];
            if (lIllIIIllllll(Inventory.contains(iArr) ? 1 : 0)) {
                ?? r0 = llIlIIlIll[1];
                "".length();
                return (((((140 + 47) - 83) + 54) ^ (((74 + 156) - 123) + 92)) & (((183 ^ 141) ^ (15 ^ 108)) ^ (-" ".length()))) != 0 ? ((199 ^ 134) ^ (72 ^ 79)) & (((102 ^ 94) ^ (86 ^ 40)) ^ (-" ".length())) : r0;
            }
        }
        return llIlIIlIll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIlIIlIll[0];
    }

    private static boolean lIllIIlIIIlII(Object obj) {
        return obj != null;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIlIIIllI[llIlIIlIll[55]];
    }

    private static int lIllIIIllllIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            ex();
            "".length();
            if ("   ".length() <= " ".length()) {
                return ((105 ^ 30) ^ (65 ^ 23)) & (((178 ^ 190) ^ (70 ^ 107)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return llIlIIlIll[54];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v116, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v354, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v399, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v61, types: [boolean] */
    public static void ex() {
        if (lIllIIIllllll(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIlIIIllI[llIlIIlIll[0]];
            C0015b.a(bv);
            if (lIllIIlIIIIII(bv.size(), llIlIIlIll[1])) {
                System.out.println(llIlIIIllI[llIlIIlIll[1]]);
                bt = llIlIIlIll[0];
            }
        }
        if (lIllIIlIIIIIl(bt ? 1 : 0)) {
            if (lIllIIIllllll(Inventory.contains(C0019f.ba) ? 1 : 0) && lIllIIlIIIIII(Movement.getRunEnergy(), llIlIIlIll[2])) {
                Inventory.getFirst(C0019f.ba).interact(llIlIIIllI[llIlIIlIll[3]]);
                Time.sleepTicks(llIlIIlIll[1]);
                "".length();
            }
            if (lIllIIlIIIIlI(lIllIIIllllIl(C0018e.w(), 70.0d))) {
                int[] iArr = new int[llIlIIlIll[1]];
                iArr[llIlIIlIll[0]] = llIlIIlIll[4];
                if (lIllIIIllllll(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[llIlIIlIll[1]];
                    iArr2[llIlIIlIll[0]] = llIlIIlIll[4];
                    Inventory.getFirst(iArr2).interact(llIlIIIllI[llIlIIlIll[5]]);
                }
            }
            if (lIllIIlIIIIIl(Movement.isRunEnabled() ? 1 : 0) && lIllIIlIIIIll(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (lIllIIlIIIIIl(an() ? 1 : 0) && lIllIIlIIIIIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()))) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIllIIlIIIlII(nearest) && lIllIIlIIIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIIIllI[llIlIIlIll[6]];
                    C0000a.a(nearest);
                    Time.sleepTicks(llIlIIlIll[3]);
                    "".length();
                }
                if (lIllIIlIIIlII(nearest) && lIllIIIllllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIIIllI[llIlIIlIll[7]];
                    if (lIllIIlIIIIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIlIIlIll[8]);
                        "".length();
                    }
                    if (lIllIIIllllll(Bank.isOpen() ? 1 : 0)) {
                        if (lIllIIlIIIIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIlIIlIll[6]);
                            "".length();
                        }
                        if (lIllIIlIIIIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIlIIlIll[3]);
                            "".length();
                        }
                        int[] iArr3 = new int[llIlIIlIll[9]];
                        iArr3[llIlIIlIll[0]] = llIlIIlIll[10];
                        iArr3[llIlIIlIll[1]] = llIlIIlIll[11];
                        iArr3[llIlIIlIll[3]] = llIlIIlIll[12];
                        iArr3[llIlIIlIll[5]] = llIlIIlIll[13];
                        iArr3[llIlIIlIll[6]] = llIlIIlIll[4];
                        iArr3[llIlIIlIll[7]] = llIlIIlIll[14];
                        if (lIllIIlIIIIIl(C0018e.c(iArr3) ? 1 : 0)) {
                            Q();
                            System.out.println(llIlIIIllI[llIlIIlIll[9]]);
                            bt = llIlIIlIll[1];
                            return;
                        }
                        int[] iArr4 = new int[llIlIIlIll[9]];
                        iArr4[llIlIIlIll[0]] = llIlIIlIll[10];
                        iArr4[llIlIIlIll[1]] = llIlIIlIll[11];
                        iArr4[llIlIIlIll[3]] = llIlIIlIll[12];
                        iArr4[llIlIIlIll[5]] = llIlIIlIll[13];
                        iArr4[llIlIIlIll[6]] = llIlIIlIll[4];
                        iArr4[llIlIIlIll[7]] = llIlIIlIll[14];
                        if (lIllIIIllllll(C0018e.c(iArr4) ? 1 : 0)) {
                            Bank.withdraw(llIlIIlIll[11], llIlIIlIll[15], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(llIlIIlIll[1]);
                            "".length();
                            Bank.withdraw(llIlIIlIll[14], llIlIIlIll[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(llIlIIlIll[1]);
                            "".length();
                            Bank.withdraw(llIlIIlIll[16], llIlIIlIll[15], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(llIlIIlIll[1]);
                            "".length();
                            Bank.withdraw(llIlIIlIll[13], llIlIIlIll[7], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(llIlIIlIll[1]);
                            "".length();
                            Bank.withdraw(llIlIIlIll[10], llIlIIlIll[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(llIlIIlIll[1]);
                            "".length();
                            C0000a.b(C0019f.ba, llIlIIlIll[6]);
                            C0000a.a(llIlIIlIll[4], llIlIIlIll[15]);
                            C0000a.b(C0019f.bk, llIlIIlIll[1]);
                        }
                    }
                }
            }
            if (lIllIIlIIIIIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId())) && lIllIIIllllll(an() ? 1 : 0)) {
                if (lIllIIlIIIlIl(Players.getLocal().getWorldLocation().distanceTo(mN), llIlIIlIll[3])) {
                    AccBuilderSotf.c = llIlIIIllI[llIlIIlIll[17]];
                    if (lIllIIlIIIIII(cG, llIlIIlIll[1])) {
                        C0018e.x();
                        cG += llIlIIlIll[1];
                    }
                    Movement.walkTo(mN);
                    "".length();
                    Time.sleepTicks(llIlIIlIll[1]);
                    "".length();
                }
                if (lIllIIlIIIllI(Players.getLocal().getWorldLocation().distanceTo(mN), llIlIIlIll[3])) {
                    AccBuilderSotf.c = llIlIIIllI[llIlIIlIll[18]];
                    if (lIllIIlIIIIIl(lIllIIIlllllI(g, 0L))) {
                        g = System.currentTimeMillis();
                    }
                    if (lIllIIIllllll(lIllIIIlllllI(g, 0L)) && lIllIIlIIIIll(lIllIIIlllllI(C0018e.a(g), 30000L))) {
                        cG = llIlIIlIll[0];
                        g = System.currentTimeMillis();
                    }
                    if (lIllIIlIIIIII(cG, llIlIIlIll[1])) {
                        C0018e.x();
                        cG += llIlIIlIll[1];
                    }
                    if (lIllIIIllllll(Inventory.isFull() ? 1 : 0)) {
                        int[] iArr5 = new int[llIlIIlIll[1]];
                        iArr5[llIlIIlIll[0]] = llIlIIlIll[4];
                        Inventory.getFirst(iArr5).interact(llIlIIIllI[llIlIIlIll[19]]);
                        Time.sleepTicks(llIlIIlIll[3]);
                        "".length();
                    }
                    C0020g.a(llIlIIIllI[llIlIIlIll[15]], mM, llIlIIlIll[1]);
                }
            }
            if (lIllIIlIIIlll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIlIIlIll[1])) {
                di = llIlIIlIll[0];
                String[] strArr = new String[llIlIIlIll[1]];
                strArr[llIlIIlIll[0]] = llIlIIIllI[llIlIIlIll[20]];
                if (lIllIIlIIIIIl(Inventory.contains(strArr) ? 1 : 0)) {
                    C0020g.a(mM);
                }
            }
            if (lIllIIlIIIlll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIlIIlIll[3])) {
                if (lIllIIIllllll(Inventory.contains(item -> {
                    return item.getName().contains(llIlIIIllI[llIlIIlIll[61]]);
                }) ? 1 : 0) && lIllIIlIIIIIl(Equipment.contains(item2 -> {
                    return item2.getName().contains(llIlIIIllI[llIlIIlIll[60]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item3 -> {
                        return item3.getName().contains(llIlIIIllI[llIlIIlIll[53]]);
                    }).interact(llIlIIIllI[llIlIIlIll[21]]);
                }
                if (lIllIIIllllll(Inventory.contains(item4 -> {
                    return item4.getName().contains(llIlIIIllI[llIlIIlIll[59]]);
                }) ? 1 : 0) && lIllIIlIIIIIl(Equipment.contains(item5 -> {
                    return item5.getName().contains(llIlIIIllI[llIlIIlIll[58]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item6 -> {
                        return item6.getName().contains(llIlIIIllI[llIlIIlIll[57]]);
                    }).interact(llIlIIIllI[llIlIIlIll[22]]);
                }
                if (lIllIIlIIIIIl(Players.getLocal().getWorldLocation().equals(mO) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIIIllI[llIlIIlIll[23]];
                    Movement.walkTo(mO);
                    "".length();
                    Time.sleepTicks(llIlIIlIll[1]);
                    "".length();
                }
                if (lIllIIIllllll(Players.getLocal().getWorldLocation().equals(mO) ? 1 : 0)) {
                    String[] strArr2 = new String[llIlIIlIll[1]];
                    strArr2[llIlIIlIll[0]] = llIlIIIllI[llIlIIlIll[24]];
                    Inventory.getFirst(strArr2).interact(llIlIIIllI[llIlIIlIll[25]]);
                    Time.sleepTicks(llIlIIlIll[3]);
                    "".length();
                }
            }
            if (lIllIIlIIIlll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIlIIlIll[5])) {
                if (lIllIIlIIIIIl(Players.getLocal().getWorldLocation().equals(mP) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIIIllI[llIlIIlIll[26]];
                    Movement.walkTo(mP);
                    "".length();
                    Time.sleepTicks(llIlIIlIll[1]);
                    "".length();
                }
                if (lIllIIIllllll(Players.getLocal().getWorldLocation().equals(mP) ? 1 : 0)) {
                    String[] strArr3 = new String[llIlIIlIll[1]];
                    strArr3[llIlIIlIll[0]] = llIlIIIllI[llIlIIlIll[27]];
                    Inventory.getFirst(strArr3).interact(llIlIIIllI[llIlIIlIll[28]]);
                    Time.sleepTicks(llIlIIlIll[3]);
                    "".length();
                }
            }
            if (lIllIIlIIIlll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIlIIlIll[6])) {
                if (lIllIIlIIIIIl(Players.getLocal().getWorldLocation().equals(mQ) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIIIllI[llIlIIlIll[29]];
                    Movement.walkTo(mQ);
                    "".length();
                    Time.sleepTicks(llIlIIlIll[1]);
                    "".length();
                }
                if (lIllIIIllllll(Players.getLocal().getWorldLocation().equals(mQ) ? 1 : 0)) {
                    String[] strArr4 = new String[llIlIIlIll[1]];
                    strArr4[llIlIIlIll[0]] = llIlIIIllI[llIlIIlIll[30]];
                    Inventory.getFirst(strArr4).interact(llIlIIIllI[llIlIIlIll[31]]);
                    Time.sleepTicks(llIlIIlIll[3]);
                    "".length();
                }
            }
            if (lIllIIlIIIlll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIlIIlIll[7])) {
                if (lIllIIlIIIIIl(Players.getLocal().getWorldLocation().equals(mR) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIIIllI[llIlIIlIll[32]];
                    Movement.walkTo(mR);
                    "".length();
                    Time.sleepTicks(llIlIIlIll[1]);
                    "".length();
                }
                if (lIllIIIllllll(Players.getLocal().getWorldLocation().equals(mR) ? 1 : 0)) {
                    String[] strArr5 = new String[llIlIIlIll[1]];
                    strArr5[llIlIIlIll[0]] = llIlIIIllI[llIlIIlIll[33]];
                    Inventory.getFirst(strArr5).interact(llIlIIIllI[llIlIIlIll[34]]);
                    Time.sleepTicks(llIlIIlIll[3]);
                    "".length();
                }
            }
            if (lIllIIlIIIlll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIlIIlIll[9])) {
                if (lIllIIlIIIlIl(Players.getLocal().getWorldLocation().distanceTo(mS), llIlIIlIll[5])) {
                    AccBuilderSotf.c = llIlIIIllI[llIlIIlIll[35]];
                    Movement.walkTo(mS);
                    "".length();
                    Time.sleepTicks(llIlIIlIll[1]);
                    "".length();
                }
                if (lIllIIlIIIllI(Players.getLocal().getWorldLocation().distanceTo(mS), llIlIIlIll[5])) {
                    AccBuilderSotf.c = llIlIIIllI[llIlIIlIll[36]];
                    if (lIllIIlIIIIII(di, llIlIIlIll[1])) {
                        aN.sN += llIlIIlIll[1];
                        aN.u(AccBuilderSotf.m);
                        di += llIlIIlIll[1];
                        aN.sN = llIlIIlIll[0];
                        dj = llIlIIlIll[0];
                    }
                    C0020g.a(llIlIIIllI[llIlIIlIll[37]], mM);
                }
            }
            if (lIllIIlIIIlll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIlIIlIll[17])) {
                C0020g.a(mM);
            }
            do {
                int[] iArr6 = new int[llIlIIlIll[1]];
                iArr6[llIlIIlIll[0]] = llIlIIlIll[38];
                if (!lIllIIIllllll(Inventory.contains(iArr6) ? 1 : 0)) {
                    C0020g.a(new String[llIlIIlIll[0]]);
                    return;
                }
                if (lIllIIlIIIlII(Widgets.get(llIlIIlIll[39]))) {
                    AccBuilderSotf.c = llIlIIIllI[llIlIIlIll[40]];
                    int[] iArr7 = new int[llIlIIlIll[1]];
                    iArr7[llIlIIlIll[0]] = llIlIIlIll[38];
                    Inventory.getFirst(iArr7).interact(llIlIIIllI[llIlIIlIll[41]]);
                    Time.sleepTicks(llIlIIlIll[6]);
                    "".length();
                    AccBuilderSotf.c = llIlIIIllI[llIlIIlIll[42]];
                    Widget widget = Widgets.get(llIlIIlIll[39], llIlIIlIll[23]);
                    if (lIllIIlIIIlII(widget)) {
                        widget.interact(llIlIIIllI[llIlIIlIll[43]]);
                        Time.sleepTicks(llIlIIlIll[1]);
                        "".length();
                    }
                    Widget widget2 = Widgets.get(llIlIIlIll[39], llIlIIlIll[35]);
                    if (lIllIIlIIIlII(widget2)) {
                        widget2.interact(llIlIIIllI[llIlIIlIll[44]]);
                        Time.sleepTicks(llIlIIlIll[3]);
                        "".length();
                    }
                }
                Time.sleepTicks(llIlIIlIll[1]);
                "".length();
                "".length();
            } while (0 == 0);
        }
    }

    private static void lIllIIIllIIll() {
        llIlIIIllI = new String[llIlIIlIll[88]];
        llIlIIIllI[llIlIIlIll[0]] = lIllIIIlIIIll("LRE/DjkIRC8TMgIX", "odFgW");
        llIlIIIllI[llIlIIlIll[1]] = lIllIIIlIIlII("UAFE4FH1UAkqxXetaUI5OgtwCyjidGwjqNPHA27u/Tav79ft9NldoOZbnjD4bYhV", "jXjzC");
        llIlIIIllI[llIlIIlIll[3]] = lIllIIIlIIlII("zFV3PCB6Ztg=", "xHIML");
        llIlIIIllI[llIlIIlIll[5]] = lIllIIIlIIlII("g7Ju/Ei9B6s=", "EEWim");
        llIlIIIllI[llIlIIlIll[6]] = lIllIIIlIIIll("Jw85ayYGTi0qPAI=", "inOKR");
        llIlIIIllI[llIlIIlIll[7]] = lIllIIIlIIlIl("POB2CYq9LkgQcbCU3XoMNxU0Ut8YI7Cz", "suCgi");
        llIlIIIllI[llIlIIlIll[9]] = lIllIIIlIIIll("Ih1YBzAQWBUPMQYRFgFiBA0dFTZVCw0WMhkRHRVuVQsPDzYWEBEIJVUMF0YAICExKAU=", "uxxfB");
        llIlIIIllI[llIlIIlIll[17]] = lIllIIIlIIIll("Ly8beAIObh4sFxM6", "aNmXv");
        llIlIIIllI[llIlIIlIll[18]] = lIllIIIlIIIll("GRQnCT0xGSdMISAZ", "PzSlO");
        llIlIIIllI[llIlIIlIll[19]] = lIllIIIlIIlIl("qudnjdV23/o=", "YsDpA");
        llIlIIIllI[llIlIIlIll[15]] = lIllIIIlIIIll("OAEtOQ==", "ndBJB");
        llIlIIIllI[llIlIIlIll[20]] = lIllIIIlIIIll("IzAhNxUCMCF2FRQwKzoK", "wBDVf");
        llIlIIIllI[llIlIIlIll[21]] = lIllIIIlIIIll("AQkmMA==", "VlGBY");
        llIlIIIllI[llIlIIlIll[22]] = lIllIIIlIIlII("r1mSHeNBN8E=", "KfQdv");
        llIlIIIllI[llIlIIlIll[23]] = lIllIIIlIIIll("GgAUVQM7QQYcEHRQ", "Tabuw");
        llIlIIIllI[llIlIIlIll[24]] = lIllIIIlIIlIl("Ve2N93ZjgR0=", "vOgsk");
        llIlIIIllI[llIlIIlIll[25]] = lIllIIIlIIIll("NQgu", "qaIdL");
        llIlIIIllI[llIlIIlIll[26]] = lIllIIIlIIIll("JCsHcSQFahU4N0p4", "jJqQP");
        llIlIIIllI[llIlIIlIll[27]] = lIllIIIlIIlIl("tnF6jUsgjAc=", "FvhwC");
        llIlIIIllI[llIlIIlIll[28]] = lIllIIIlIIlII("s9jjFddSdMA=", "UyNyj");
        llIlIIIllI[llIlIIlIll[29]] = lIllIIIlIIlII("MJK/AGVDLwxedpykxYtceQ==", "EieeJ");
        llIlIIIllI[llIlIIlIll[30]] = lIllIIIlIIlII("8TRZqghCYCg=", "djOor");
        llIlIIIllI[llIlIIlIll[31]] = lIllIIIlIIlIl("sf1mHLWhujs=", "gGAib");
        llIlIIIllI[llIlIIlIll[32]] = lIllIIIlIIlII("hCfnzMCC1ZBz8006s4TD9w==", "xgDkU");
        llIlIIIllI[llIlIIlIll[33]] = lIllIIIlIIlIl("Kds9QqJhkNM=", "PhKGw");
        llIlIIIllI[llIlIIlIll[34]] = lIllIIIlIIIll("Fw0x", "SdVpi");
        llIlIIIllI[llIlIIlIll[35]] = lIllIIIlIIIll("HjATcCA/cRM1OyNxAzk6OSIN", "PQePT");
        llIlIIIllI[llIlIIlIll[36]] = lIllIIIlIIIll("LSwcLzcFIRxqKxQh", "dBhJE");
        llIlIIIllI[llIlIIlIll[37]] = lIllIIIlIIlII("dCoFTTGiZK4=", "aIRey");
        llIlIIIllI[llIlIIlIll[40]] = lIllIIIlIIIll("ETElNw8tI2c5By40", "CDGUf");
        llIlIIIllI[llIlIIlIll[41]] = lIllIIIlIIlIl("AUGywy22gEw=", "RYWfE");
        llIlIIIllI[llIlIIlIll[42]] = lIllIIIlIIlII("ZTLmxhP+ezB21oW6sm48KgOnrdbmC2FK", "LjGkB");
        llIlIIIllI[llIlIIlIll[43]] = lIllIIIlIIlII("WyJ3QF4AnF8=", "pKHPX");
        llIlIIIllI[llIlIIlIll[44]] = lIllIIIlIIlIl("aGe4xhSpaA8=", "WODhb");
        llIlIIIllI[llIlIIlIll[45]] = lIllIIIlIIIll("MDUtBSQ=", "cELaA");
        llIlIIIllI[llIlIIlIll[55]] = lIllIIIlIIlIl("JgGtanYNgsegVK/BJN7rXBo5vE+n324S", "bCVJM");
        llIlIIIllI[llIlIIlIll[56]] = lIllIIIlIIlIl("UYmfZUbJQg0c4SRBHvc6hLK06MnsenUv", "LBXHs");
        llIlIIIllI[llIlIIlIll[57]] = lIllIIIlIIlII("vCfDvkemtCE=", "mSxUt");
        llIlIIIllI[llIlIIlIll[58]] = lIllIIIlIIIll("PiEXLy0h", "IDvCY");
        llIlIIIllI[llIlIIlIll[59]] = lIllIIIlIIlII("o2UXyjUfChg=", "FyduB");
        llIlIIIllI[llIlIIlIll[53]] = lIllIIIlIIlIl("Yu2JTDDzsnc=", "ZgRPM");
        llIlIIIllI[llIlIIlIll[60]] = lIllIIIlIIlII("ucIr8wCyrwI=", "XXOFE");
        llIlIIIllI[llIlIIlIll[61]] = lIllIIIlIIlII("TyMV3LQxh/A=", "dUIHl");
        llIlIIIllI[llIlIIlIll[62]] = lIllIIIlIIlII("Jj32JUC7suGOoutJ5MczVnoVXJn0ahWb6tpfxmiTvZE=", "qvpYL");
        llIlIIIllI[llIlIIlIll[63]] = lIllIIIlIIlIl("29ZlTFusxiRIgXdHoMvr8hheZ7j32a7yos46DxwRVIjFf4wxPFfY/g==", "liEiX");
        llIlIIIllI[llIlIIlIll[64]] = lIllIIIlIIlII("YHDhqFIUxFsUOGzQBXexYbiC1ECw0JWf", "MvFjf");
        llIlIIIllI[llIlIIlIll[65]] = lIllIIIlIIlII("cWUclzOCsjA=", "XdNrO");
        llIlIIIllI[llIlIIlIll[66]] = lIllIIIlIIIll("LWsgZy8LIyYuLQNsKygxRC1tNjYBPzlm", "dLMGC");
        llIlIIIllI[llIlIIlIll[67]] = lIllIIIlIIIll("ISduTiYLOGIDL04kJwI6TjgqCyRA", "nLBnJ");
        llIlIIIllI[llIlIIlIll[68]] = lIllIIIlIIlIl("6y/BvCaqPqkf3qBQBqImZJe3svkSfG5qLzsWBYyVGMF+vbaVV9gc5g==", "ZuAMt");
        llIlIIIllI[llIlIIlIll[69]] = lIllIIIlIIlIl("QYzQdWP6+6xVRJWmFS9NbQiFK1+gdSU/xPflLO6l320BMiyoC2UGDcdAJnZzfcZ0", "lxXjh");
        llIlIIIllI[llIlIIlIll[70]] = lIllIIIlIIlIl("6bl3kn1ruSuZ3tZtFWSLtFn9SYlucsbBSONMkw7Lnw955OiI+XN2dg==", "KpIyZ");
        llIlIIIllI[llIlIIlIll[71]] = lIllIIIlIIlII("VYPf4GYw9/w=", "cClmk");
        llIlIIIllI[llIlIIlIll[72]] = lIllIIIlIIlIl("ZeNO94JMntQURbX42tcsu7zYD9O8Cq90QSC6qhtUHPba+0/w0QNlNg==", "cwzoX");
        llIlIIIllI[llIlIIlIll[73]] = lIllIIIlIIIll("EisJXHACaRdQIz48H14=", "KNzpP");
        llIlIIIllI[llIlIIlIll[48]] = lIllIIIlIIlII("AWEIgOv3ie1S98SSRfFuNw==", "JorCd");
        llIlIIIllI[llIlIIlIll[74]] = lIllIIIlIIlIl("uXRCiJDBZcjsgvMaW7M6Pwy/uGBS/TcrlCvAl6mS0cs=", "vtIiE");
        llIlIIIllI[llIlIIlIll[75]] = lIllIIIlIIlII("eEBNulyxc4hH3Kyf4cFrJg==", "aflTt");
    }

    private static String lIllIIIlIIlIl(String llllllllllllllllllIIlIIIIllllllI, String llllllllllllllllllIIlIIIIlllllIl) {
        try {
            SecretKeySpec llllllllllllllllllIIlIIIlIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIlIIIIlllllIl.getBytes(StandardCharsets.UTF_8)), llIlIIlIll[18]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIIlIll[3], llllllllllllllllllIIlIIIlIIIIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIlIIIIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIlIIIIlllllll) {
            llllllllllllllllllIIlIIIIlllllll.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIllllII() {
        llIlIIlIll = new int[89];
        llIlIIlIll[0] = "   ".length() & ("   ".length() ^ (-1));
        llIlIIlIll[1] = " ".length();
        llIlIIlIll[2] = (((68 + 49) - 32) + 50) ^ (((9 + 7) - (-77)) + 100);
        llIlIIlIll[3] = "  ".length();
        llIlIIlIll[4] = (-((-23025) & 32757)) & (-6273) & 16383;
        llIlIIlIll[5] = "   ".length();
        llIlIIlIll[6] = 121 ^ 125;
        llIlIIlIll[7] = 14 ^ 11;
        llIlIIlIll[8] = (-((-9923) & 28375)) & (-1059) & 24510;
        llIlIIlIll[9] = 119 ^ 113;
        llIlIIlIll[10] = (-((-11929) & 32697)) & (-5) & 32750;
        llIlIIlIll[11] = (-8359) & 16366;
        llIlIIlIll[12] = (-1199) & 13823;
        llIlIIlIll[13] = (-(((46 + 83) - (-8)) + 24)) & (-16393) & 24559;
        llIlIIlIll[14] = (-((-4366) & 32015)) & (-4099) & 32699;
        llIlIIlIll[15] = (105 ^ 11) ^ (236 ^ 132);
        llIlIIlIll[16] = (-((-19089) & 27313)) & (-149) & 16381;
        llIlIIlIll[17] = (((3 + 88) - 40) + 108) ^ (((126 + 52) - 89) + 63);
        llIlIIlIll[18] = 110 ^ 102;
        llIlIIlIll[19] = (((69 + 126) - 30) + 36) ^ (((7 + 112) - (-42)) + 31);
        llIlIIlIll[20] = (117 ^ 74) ^ (132 ^ 176);
        llIlIIlIll[21] = (((85 + 128) - 143) + 66) ^ (((42 + 28) - (-49)) + 13);
        llIlIIlIll[22] = (91 ^ 63) ^ (120 ^ 17);
        llIlIIlIll[23] = (160 ^ 186) ^ (168 ^ 188);
        llIlIIlIll[24] = 95 ^ 80;
        llIlIIlIll[25] = (1 ^ 52) ^ (37 ^ 0);
        llIlIIlIll[26] = 11 ^ 26;
        llIlIIlIll[27] = (4 ^ 39) ^ (9 ^ 56);
        llIlIIlIll[28] = 31 ^ 12;
        llIlIIlIll[29] = 208 ^ 196;
        llIlIIlIll[30] = 141 ^ 152;
        llIlIIlIll[31] = (((157 + 203) - 275) + 124) ^ (((17 + 34) - (-77)) + 71);
        llIlIIlIll[32] = (((24 + 119) - 80) + 101) ^ (((21 + 68) - 52) + 142);
        llIlIIlIll[33] = (4 ^ 18) ^ (8 ^ 6);
        llIlIIlIll[34] = (34 ^ 22) ^ (236 ^ 193);
        llIlIIlIll[35] = 1 ^ 27;
        llIlIIlIll[36] = (((70 + 23) - 65) + 148) ^ (((169 + 114) - 181) + 69);
        llIlIIlIll[37] = (172 ^ 139) ^ (0 ^ 59);
        llIlIIlIll[38] = (-1110) & 24181;
        llIlIIlIll[39] = (((182 ^ 175) + "  ".length()) - (-(((62 + 104) - 135) + 114))) + (80 ^ 20);
        llIlIIlIll[40] = (116 ^ 79) ^ (169 ^ 143);
        llIlIIlIll[41] = 27 ^ 5;
        llIlIIlIll[42] = 172 ^ 179;
        llIlIIlIll[43] = 26 ^ 58;
        llIlIIlIll[44] = 154 ^ 187;
        llIlIIlIll[45] = 86 ^ 116;
        llIlIIlIll[46] = (-321) & 16220;
        llIlIIlIll[47] = (-16563) & 22462;
        llIlIIlIll[48] = (89 ^ 114) ^ (184 ^ 164);
        llIlIIlIll[49] = (-19969) & 20468;
        llIlIIlIll[50] = (-((-25753) & 30105)) & (-36) & 16367;
        llIlIIlIll[51] = (-((-289) & 7010)) & (-7) & 31727;
        llIlIIlIll[52] = (-((-9027) & 15315)) & (-1) & 8188;
        llIlIIlIll[53] = (20 ^ 55) ^ (162 ^ 169);
        llIlIIlIll[54] = (84 ^ 49) ^ " ".length();
        llIlIIlIll[55] = 90 ^ 121;
        llIlIIlIll[56] = (219 ^ 132) ^ (27 ^ 96);
        llIlIIlIll[57] = 103 ^ 66;
        llIlIIlIll[58] = 231 ^ 193;
        llIlIIlIll[59] = (202 ^ 167) ^ (88 ^ 18);
        llIlIIlIll[60] = (83 ^ 64) ^ (183 ^ 141);
        llIlIIlIll[61] = (90 ^ 18) ^ (12 ^ 110);
        llIlIIlIll[62] = 67 ^ 104;
        llIlIIlIll[63] = 28 ^ 48;
        llIlIIlIll[64] = 72 ^ 101;
        llIlIIlIll[65] = (248 ^ 197) ^ (124 ^ 111);
        llIlIIlIll[66] = (((99 + 93) - 188) + 179) ^ (((125 + 142) - 206) + 91);
        llIlIIlIll[67] = (195 ^ 184) ^ (213 ^ 158);
        llIlIIlIll[68] = 149 ^ 164;
        llIlIIlIll[69] = (((82 + 32) - 63) + 86) ^ (((178 + 65) - 124) + 68);
        llIlIIlIll[70] = 19 ^ 32;
        llIlIIlIll[71] = 110 ^ 90;
        llIlIIlIll[72] = 159 ^ 170;
        llIlIIlIll[73] = (19 ^ 98) ^ (59 ^ 124);
        llIlIIlIll[74] = (((31 + 41) - 47) + 149) ^ (((96 + 133) - 95) + 16);
        llIlIIlIll[75] = 124 ^ 69;
        llIlIIlIll[76] = (-28705) & 31933;
        llIlIIlIll[77] = (-16917) & 20156;
        llIlIIlIll[78] = (-((-2241) & 10690)) & (-20481) & 32159;
        llIlIIlIll[79] = (-17217) & 20425;
        llIlIIlIll[80] = (-28677) & 31879;
        llIlIIlIll[81] = (-29283) & 32494;
        llIlIIlIll[82] = (-28691) & 31799;
        llIlIIlIll[83] = (-571) & 3834;
        llIlIIlIll[84] = (-(162 ^ 131)) & (-24858) & 27967;
        llIlIIlIll[85] = (-((-16419) & 21095)) & (-24577) & 32511;
        llIlIIlIll[86] = (-1) & 3054;
        llIlIIlIll[87] = (-4162) & 7407;
        llIlIIlIll[88] = 33 ^ 27;
    }

    private static int lIllIIIlllllI(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static boolean lIllIIlIIIIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIIlIIlIlI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIllIIlIIIIlI(int i) {
        return i < 0;
    }

    static {
        lIllIIIllllII();
        lIllIIIllIIll();
        String[] strArr = new String[llIlIIlIll[24]];
        strArr[llIlIIlIll[0]] = llIlIIIllI[llIlIIlIll[62]];
        strArr[llIlIIlIll[1]] = llIlIIIllI[llIlIIlIll[63]];
        strArr[llIlIIlIll[3]] = llIlIIIllI[llIlIIlIll[64]];
        strArr[llIlIIlIll[5]] = llIlIIIllI[llIlIIlIll[65]];
        strArr[llIlIIlIll[6]] = llIlIIIllI[llIlIIlIll[66]];
        strArr[llIlIIlIll[7]] = llIlIIIllI[llIlIIlIll[67]];
        strArr[llIlIIlIll[9]] = llIlIIIllI[llIlIIlIll[68]];
        strArr[llIlIIlIll[17]] = llIlIIIllI[llIlIIlIll[69]];
        strArr[llIlIIlIll[18]] = llIlIIIllI[llIlIIlIll[70]];
        strArr[llIlIIlIll[19]] = llIlIIIllI[llIlIIlIll[71]];
        strArr[llIlIIlIll[15]] = llIlIIIllI[llIlIIlIll[72]];
        strArr[llIlIIlIll[20]] = llIlIIIllI[llIlIIlIll[73]];
        strArr[llIlIIlIll[21]] = llIlIIIllI[llIlIIlIll[48]];
        strArr[llIlIIlIll[22]] = llIlIIIllI[llIlIIlIll[74]];
        strArr[llIlIIlIll[23]] = llIlIIIllI[llIlIIlIll[75]];
        mM = strArr;
        mN = new WorldPoint(llIlIIlIll[76], llIlIIlIll[77], llIlIIlIll[0]);
        mO = new WorldPoint(llIlIIlIll[78], llIlIIlIll[79], llIlIIlIll[0]);
        mP = new WorldPoint(llIlIIlIll[80], llIlIIlIll[81], llIlIIlIll[0]);
        mQ = new WorldPoint(llIlIIlIll[82], llIlIIlIll[83], llIlIIlIll[0]);
        mR = new WorldPoint(llIlIIlIll[84], llIlIIlIll[85], llIlIIlIll[0]);
        mS = new WorldPoint(llIlIIlIll[86], llIlIIlIll[87], llIlIIlIll[0]);
        bv = new ArrayList();
        cG = llIlIIlIll[0];
    }

    private static boolean lIllIIlIIIIll(int i) {
        return i > 0;
    }

    private static boolean lIllIIIllllll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIllIIlIIlIlI(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIlIIlIll[18])) {
            int[] iArr = new int[llIlIIlIll[1]];
            iArr[llIlIIlIll[0]] = llIlIIlIll[38];
            if (lIllIIlIIIIIl(Inventory.contains(iArr) ? 1 : 0)) {
                ?? r0 = llIlIIlIll[1];
                "".length();
                return (104 ^ 108) <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return llIlIIlIll[0];
    }

    private static boolean lIllIIlIIIlll(int i, int i2) {
        return i == i2;
    }
}
