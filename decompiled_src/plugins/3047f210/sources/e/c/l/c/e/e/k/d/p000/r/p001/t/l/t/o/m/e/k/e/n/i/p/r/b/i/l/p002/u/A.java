package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.A  reason: invalid package */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/A.class */
public class A implements S {
    static /* synthetic */ WorldPoint gD;
    static /* synthetic */ boolean cl;
    static /* synthetic */ int ck;
    public static /* synthetic */ List<C0003d> bu;
    public static /* synthetic */ boolean bs;
    static /* synthetic */ WorldPoint gF;
    private static final /* synthetic */ String gy;
    public static /* synthetic */ boolean gz;
    static /* synthetic */ String[] bQ;
    static /* synthetic */ WorldPoint gA;
    private static /* synthetic */ int[] llllllllII;
    static /* synthetic */ WorldPoint gC;
    private static /* synthetic */ String[] gG;
    static /* synthetic */ WorldPoint gB;
    private final /* synthetic */ int gH = llllllllII[0];
    static /* synthetic */ WorldPoint gf;
    private static final /* synthetic */ HashMap<Integer, String> gx;
    static /* synthetic */ WorldPoint gE;
    private static /* synthetic */ String[] lllllllIII;

    private static boolean llIllIIIllllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void bY() {
        BankLocation nearest = BankLocation.getNearest();
        if (llIllIIIlIlIl(nearest) && llIllIIIlIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllllllIII[llllllllII[76]];
            C0000a.a(nearest);
        }
        if (llIllIIIlIlIl(nearest) && llIllIIIlIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llIllIIIlIlII(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, llllllllII[2]);
                "".length();
                Time.sleepTicks(llllllllII[5]);
                "".length();
            }
            if (llIllIIIlIIlI(Bank.isOpen() ? 1 : 0)) {
                AccBuilderTempleTrek.c = lllllllIII[llllllllII[77]];
                if (llIllIIIlIIlI(gz ? 1 : 0)) {
                    int[] iArr = new int[llllllllII[1]];
                    iArr[llllllllII[0]] = llllllllII[48];
                    if (llIllIIIlIlII(Inventory.contains(iArr) ? 1 : 0) && llIllIIIlIllI(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(llllllllII[4]);
                        "".length();
                    }
                }
                if (llIllIIIlIllI(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(llllllllII[3]);
                    "".length();
                }
                if (llIllIIIlIIlI(gz ? 1 : 0)) {
                    int[] iArr2 = new int[llllllllII[1]];
                    iArr2[llllllllII[0]] = llllllllII[48];
                    if (llIllIIIlIIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                        C0000a.a(llllllllII[11], llllllllII[1]);
                        C0000a.a(llllllllII[6], llllllllII[12]);
                        C0000a.a(llllllllII[48], llllllllII[1]);
                        C0000a.a(llllllllII[24], llllllllII[1]);
                        C0000a.a(llllllllII[46], llllllllII[1]);
                        Time.sleepTicks(llllllllII[1]);
                        "".length();
                        int[] iArr3 = new int[llllllllII[1]];
                        iArr3[llllllllII[0]] = llllllllII[11];
                        if (llIllIIIlIlII(Inventory.contains(iArr3) ? 1 : 0)) {
                            C0000a.a(llllllllII[78], llllllllII[1]);
                        }
                        C0000a.a(llllllllII[17], Inventory.getFreeSlots() - llllllllII[1]);
                    }
                }
                if (llIllIIIlIIlI(gz ? 1 : 0)) {
                    int[] iArr4 = new int[llllllllII[1]];
                    iArr4[llllllllII[0]] = llllllllII[48];
                    if (llIllIIIlIlII(Inventory.contains(iArr4) ? 1 : 0)) {
                        if (llIllIIIlIlII(Equipment.contains(C0005f.aQ) ? 1 : 0) && llIllIIIlIlII(Inventory.contains(C0005f.aQ) ? 1 : 0)) {
                            C0000a.b(C0005f.aQ, llllllllII[1]);
                        }
                        if (llIllIIIlIIlI(Inventory.contains(C0005f.aQ) ? 1 : 0)) {
                            Inventory.getFirst(C0005f.aQ).interact(lllllllIII[llllllllII[79]]);
                            Time.sleepTicks(llllllllII[5]);
                            "".length();
                        }
                        if (llIllIIIlIlII(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(llllllllII[10]);
                            "".length();
                        }
                        if (llIllIIIlIIlI(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a(llllllllII[11], llllllllII[1]);
                            C0000a.a(llllllllII[6], llllllllII[12]);
                            C0000a.a(llllllllII[7], llllllllII[9]);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIllIIIlllIl(Vars.getBit(QuestVarbits.QUEST_DEMON_SLAYER.getId()), llllllllII[5])) {
            ?? r0 = llllllllII[1];
            "".length();
            return "   ".length() < 0 ? ((192 ^ 134) ^ (105 ^ 24)) & (((37 ^ 81) ^ (198 ^ 133)) ^ (-" ".length())) : r0;
        }
        return llllllllII[0];
    }

    private static int llIllIIIlIIIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x0b39, code lost:
        if (llIllIIIlIlIl(net.unethicalite.api.entities.NPCs.getNearest(r0)) != false) goto L219;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v194, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v291, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v547, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v550, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v572, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bW() {
        if (llIllIIIlIIlI(bs ? 1 : 0)) {
            C0001b.a(bu);
            if (llIllIIIlIIll(bu.size(), llllllllII[1])) {
                System.out.println(lllllllIII[llllllllII[0]]);
                bs = llllllllII[0];
            }
        }
        if (llIllIIIlIlII(bs ? 1 : 0)) {
            if (llIllIIIlIlII(aa() ? 1 : 0) && llIllIIIlIlII(Vars.getBit(QuestVarbits.QUEST_DEMON_SLAYER.getId()))) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIllIIIlIlIl(nearest) && llIllIIIlIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllllIII[llllllllII[1]];
                    C0000a.a(nearest);
                }
                if (llIllIIIlIlIl(nearest) && llIllIIIlIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIllIIIlIlII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llllllllII[2]);
                        "".length();
                    }
                    if (llIllIIIlIIlI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllllllIII[llllllllII[3]];
                        if (llIllIIIlIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llllllllII[4]);
                            "".length();
                        }
                        if (llIllIIIlIllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llllllllII[3]);
                            "".length();
                        }
                        int[] iArr = new int[llllllllII[5]];
                        iArr[llllllllII[0]] = llllllllII[6];
                        iArr[llllllllII[1]] = llllllllII[7];
                        iArr[llllllllII[3]] = llllllllII[8];
                        if (llIllIIIlIlII(C0004e.b(iArr) ? 1 : 0)) {
                            ae();
                            System.out.println(lllllllIII[llllllllII[5]]);
                            bs = llllllllII[1];
                            return;
                        }
                        int[] iArr2 = new int[llllllllII[1]];
                        iArr2[llllllllII[0]] = llllllllII[7];
                        if (llIllIIIlIIlI(Bank.contains(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[llllllllII[1]];
                            iArr3[llllllllII[0]] = llllllllII[7];
                            if (llIllIIIlIIll(Bank.getFirst(iArr3).getQuantity(), llllllllII[9])) {
                                ae();
                                System.out.println(lllllllIII[llllllllII[4]]);
                                bs = llllllllII[1];
                                return;
                            }
                        }
                        int[] iArr4 = new int[llllllllII[5]];
                        iArr4[llllllllII[0]] = llllllllII[6];
                        iArr4[llllllllII[1]] = llllllllII[7];
                        iArr4[llllllllII[3]] = llllllllII[8];
                        if (llIllIIIlIIlI(C0004e.b(iArr4) ? 1 : 0)) {
                            if (llIllIIIlIlII(Equipment.contains(C0005f.aQ) ? 1 : 0) && llIllIIIlIlII(Inventory.contains(C0005f.aQ) ? 1 : 0)) {
                                C0000a.b(C0005f.aQ, llllllllII[1]);
                            }
                            if (llIllIIIlIIlI(Inventory.contains(C0005f.aQ) ? 1 : 0)) {
                                Inventory.getFirst(C0005f.aQ).interact(lllllllIII[llllllllII[10]]);
                                Time.sleepTicks(llllllllII[5]);
                                "".length();
                            }
                            if (llIllIIIlIlII(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                                Time.sleepTicks(llllllllII[5]);
                                "".length();
                            }
                            C0000a.a(llllllllII[11], llllllllII[1]);
                            C0000a.a(llllllllII[8], llllllllII[1]);
                            C0000a.a(llllllllII[6], llllllllII[12]);
                            C0000a.a(llllllllII[13], llllllllII[14]);
                        }
                    }
                }
            }
            if (llIllIIIlIIlI(Inventory.contains(C0005f.aU) ? 1 : 0) && llIllIIIlIIll(Movement.getRunEnergy(), llllllllII[15])) {
                Inventory.getFirst(C0005f.aU).interact(lllllllIII[llllllllII[16]]);
                Time.sleepTicks(llllllllII[1]);
                "".length();
            }
            int[] iArr5 = new int[llllllllII[1]];
            iArr5[llllllllII[0]] = llllllllII[17];
            if (llIllIIIlIIlI(Inventory.contains(iArr5) ? 1 : 0) && llIllIIIlIlll(llIllIIIlIIIl(C0004e.u(), 55.0d))) {
                int[] iArr6 = new int[llllllllII[1]];
                iArr6[llllllllII[0]] = llllllllII[17];
                Inventory.getFirst(iArr6).interact(lllllllIII[llllllllII[18]]);
            }
            if (llIllIIIlIIlI(aa() ? 1 : 0) && llIllIIIlIlII(Vars.getBit(QuestVarbits.QUEST_DEMON_SLAYER.getId()))) {
                if (llIllIIIllIII(Players.getLocal().getWorldLocation().distanceTo(gf), llllllllII[4]) && llIllIIIlIlII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllllIII[llllllllII[19]];
                    Movement.walkTo(gf);
                    "".length();
                    Time.sleepTicks(llllllllII[1]);
                    "".length();
                }
                if (llIllIIIllIIl(Players.getLocal().getWorldLocation().distanceTo(gf), llllllllII[4])) {
                    C0006g.a(lllllllIII[llllllllII[20]], bQ);
                }
            }
            if (llIllIIIllIlI(Vars.getBit(QuestVarbits.QUEST_DEMON_SLAYER.getId()), llllllllII[1])) {
                WorldArea worldArea = new WorldArea(llllllllII[21], llllllllII[22], llllllllII[19], llllllllII[18], llllllllII[0]);
                if (llIllIIIlIlII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllllIII[llllllllII[12]];
                    Movement.walkTo(gA);
                    "".length();
                    Time.sleepTicks(llllllllII[1]);
                    "".length();
                }
                if (llIllIIIlIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    C0006g.a(lllllllIII[llllllllII[23]], bQ);
                }
            }
            if (llIllIIIllIlI(Vars.getBit(QuestVarbits.QUEST_DEMON_SLAYER.getId()), llllllllII[3])) {
                ck = llllllllII[0];
                int[] iArr7 = new int[llllllllII[1]];
                iArr7[llllllllII[0]] = llllllllII[24];
                if (llIllIIIlIlII(Inventory.contains(iArr7) ? 1 : 0)) {
                    String[] strArr = new String[llllllllII[1]];
                    strArr[llllllllII[0]] = lllllllIII[llllllllII[25]];
                    if (llIllIIIlIlII(Equipment.contains(strArr) ? 1 : 0) && llIllIIIlIlII(gz ? 1 : 0)) {
                        if (!llIllIIIllIIl(Players.getLocal().getWorldLocation().distanceTo(gB), llllllllII[4]) || llIllIIIllIll(Players.getLocal().getWorldLocation().getPlane(), llllllllII[3])) {
                            AccBuilderTempleTrek.c = lllllllIII[llllllllII[26]];
                            Movement.walkTo(gB);
                            "".length();
                            Time.sleepTicks(llllllllII[1]);
                            "".length();
                        }
                        if (llIllIIIllIIl(Players.getLocal().getWorldLocation().distanceTo(gB), llllllllII[4])) {
                            C0006g.a(lllllllIII[llllllllII[27]], bQ);
                        }
                    }
                }
                int[] iArr8 = new int[llllllllII[1]];
                iArr8[llllllllII[0]] = llllllllII[24];
                if (llIllIIIlIIlI(Inventory.contains(iArr8) ? 1 : 0) && llIllIIIlIlII(gz ? 1 : 0)) {
                    String[] strArr2 = new String[llllllllII[1]];
                    strArr2[llllllllII[0]] = lllllllIII[llllllllII[28]];
                    if (llIllIIIlIIlI(Inventory.contains(strArr2) ? 1 : 0)) {
                        if (llIllIIIllIII(Players.getLocal().getWorldLocation().distanceTo(gC), llllllllII[4])) {
                            AccBuilderTempleTrek.c = lllllllIII[llllllllII[29]];
                            Movement.walkTo(gC);
                            "".length();
                            Time.sleepTicks(llllllllII[1]);
                            "".length();
                        }
                        if (llIllIIIllIIl(Players.getLocal().getWorldLocation().distanceTo(gC), llllllllII[4])) {
                            String[] strArr3 = new String[llllllllII[1]];
                            strArr3[llllllllII[0]] = lllllllIII[llllllllII[30]];
                            Item first = Inventory.getFirst(strArr3);
                            String[] strArr4 = new String[llllllllII[1]];
                            strArr4[llllllllII[0]] = lllllllIII[llllllllII[31]];
                            first.useOn(TileObjects.getNearest(strArr4));
                            Time.sleepTicks(llllllllII[10]);
                            "".length();
                        }
                    }
                    String[] strArr5 = new String[llllllllII[1]];
                    strArr5[llllllllII[0]] = lllllllIII[llllllllII[32]];
                    if (llIllIIIlIlII(Inventory.contains(strArr5) ? 1 : 0)) {
                        if (llIllIIIllIII(Players.getLocal().getWorldLocation().distanceTo(gD), llllllllII[4])) {
                            AccBuilderTempleTrek.c = lllllllIII[llllllllII[33]];
                            String[] strArr6 = new String[llllllllII[1]];
                            strArr6[llllllllII[0]] = lllllllIII[llllllllII[34]];
                            if (llIllIIIlIlIl(TileObjects.getNearest(strArr6))) {
                                String[] strArr7 = new String[llllllllII[1]];
                                strArr7[llllllllII[0]] = lllllllIII[llllllllII[35]];
                                TileObject nearest2 = TileObjects.getNearest(strArr7);
                                String[] strArr8 = new String[llllllllII[1]];
                                strArr8[llllllllII[0]] = lllllllIII[llllllllII[36]];
                                if (llIllIIIlIIlI(nearest2.hasAction(strArr8) ? 1 : 0)) {
                                    String[] strArr9 = new String[llllllllII[1]];
                                    strArr9[llllllllII[0]] = lllllllIII[llllllllII[37]];
                                    TileObjects.getNearest(strArr9).interact(lllllllIII[llllllllII[9]]);
                                    Time.sleepTicks(llllllllII[3]);
                                    "".length();
                                }
                            }
                            String[] strArr10 = new String[llllllllII[1]];
                            strArr10[llllllllII[0]] = lllllllIII[llllllllII[38]];
                            if (llIllIIIlIlIl(TileObjects.getNearest(strArr10))) {
                                String[] strArr11 = new String[llllllllII[1]];
                                strArr11[llllllllII[0]] = lllllllIII[llllllllII[39]];
                                TileObject nearest3 = TileObjects.getNearest(strArr11);
                                String[] strArr12 = new String[llllllllII[1]];
                                strArr12[llllllllII[0]] = lllllllIII[llllllllII[40]];
                                if (llIllIIIlIIlI(nearest3.hasAction(strArr12) ? 1 : 0)) {
                                    String[] strArr13 = new String[llllllllII[1]];
                                    strArr13[llllllllII[0]] = lllllllIII[llllllllII[41]];
                                    TileObjects.getNearest(strArr13).interact(lllllllIII[llllllllII[42]]);
                                    Time.sleepTicks(llllllllII[3]);
                                    "".length();
                                }
                            }
                            Movement.walkTo(gD);
                            "".length();
                            Time.sleepTicks(llllllllII[1]);
                            "".length();
                        }
                        if (llIllIIIllIIl(Players.getLocal().getWorldLocation().distanceTo(gD), llllllllII[4])) {
                            String[] strArr14 = new String[llllllllII[1]];
                            strArr14[llllllllII[0]] = lllllllIII[llllllllII[43]];
                            if (llIllIIIlIlIl(TileObjects.getNearest(strArr14))) {
                                String[] strArr15 = new String[llllllllII[1]];
                                strArr15[llllllllII[0]] = lllllllIII[llllllllII[44]];
                                TileObjects.getNearest(strArr15).interact(lllllllIII[llllllllII[45]]);
                                Time.sleepTicks(llllllllII[4]);
                                "".length();
                            }
                        }
                    }
                }
                int[] iArr9 = new int[llllllllII[1]];
                iArr9[llllllllII[0]] = llllllllII[24];
                if (llIllIIIlIIlI(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[llllllllII[1]];
                    iArr10[llllllllII[0]] = llllllllII[46];
                    if (llIllIIIlIIlI(Inventory.contains(iArr10) ? 1 : 0)) {
                        gz = llllllllII[1];
                    }
                }
                if (llIllIIIlIIlI(gz ? 1 : 0)) {
                    String[] strArr16 = new String[llllllllII[1]];
                    strArr16[llllllllII[0]] = lllllllIII[llllllllII[47]];
                    if (llIllIIIlIlII(Equipment.contains(strArr16) ? 1 : 0)) {
                        int[] iArr11 = new int[llllllllII[1]];
                        iArr11[llllllllII[0]] = llllllllII[48];
                        if (llIllIIIlIlII(Inventory.contains(iArr11) ? 1 : 0)) {
                            String[] strArr17 = new String[llllllllII[1]];
                            strArr17[llllllllII[0]] = lllllllIII[llllllllII[49]];
                            if (llIllIIIlIlII(Inventory.contains(strArr17) ? 1 : 0)) {
                                bY();
                            }
                            String[] strArr18 = new String[llllllllII[1]];
                            strArr18[llllllllII[0]] = lllllllIII[llllllllII[50]];
                            if (llIllIIIlIIlI(Inventory.contains(strArr18) ? 1 : 0)) {
                                if (llIllIIIllIII(Players.getLocal().getWorldLocation().distanceTo(gE), llllllllII[3])) {
                                    AccBuilderTempleTrek.c = lllllllIII[llllllllII[51]];
                                    Movement.walkTo(gE);
                                    "".length();
                                    Time.sleepTicks(llllllllII[1]);
                                    "".length();
                                }
                                if (llIllIIIllIIl(Players.getLocal().getWorldLocation().distanceTo(gE), llllllllII[3])) {
                                    C0006g.a(lllllllIII[llllllllII[52]], bQ);
                                }
                            }
                        }
                    }
                }
                if (llIllIIIlIIlI(gz ? 1 : 0)) {
                    int[] iArr12 = new int[llllllllII[1]];
                    iArr12[llllllllII[0]] = llllllllII[48];
                    if (llIllIIIlIIlI(Inventory.contains(iArr12) ? 1 : 0)) {
                        String[] strArr19 = new String[llllllllII[1]];
                        strArr19[llllllllII[0]] = lllllllIII[llllllllII[53]];
                        if (llIllIIIlIlII(Equipment.contains(strArr19) ? 1 : 0)) {
                            int[] iArr13 = new int[llllllllII[1]];
                            iArr13[llllllllII[0]] = llllllllII[24];
                            if (llIllIIIlIlII(Inventory.contains(iArr13) ? 1 : 0)) {
                                bY();
                            }
                            int[] iArr14 = new int[llllllllII[1]];
                            iArr14[llllllllII[0]] = llllllllII[24];
                            if (llIllIIIlIIlI(Inventory.contains(iArr14) ? 1 : 0)) {
                                WorldArea worldArea2 = new WorldArea(llllllllII[21], llllllllII[22], llllllllII[19], llllllllII[18], llllllllII[0]);
                                if (llIllIIIlIlII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllllIII[llllllllII[54]];
                                    Movement.walkTo(gA);
                                    "".length();
                                    Time.sleepTicks(llllllllII[1]);
                                    "".length();
                                }
                                if (llIllIIIlIIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    C0006g.a(lllllllIII[llllllllII[55]], bQ);
                                }
                            }
                        }
                    }
                }
                String[] strArr20 = new String[llllllllII[1]];
                strArr20[llllllllII[0]] = lllllllIII[llllllllII[56]];
                if (llIllIIIlIIlI(Equipment.contains(strArr20) ? 1 : 0)) {
                    String[] strArr21 = new String[llllllllII[1]];
                    strArr21[llllllllII[0]] = lllllllIII[llllllllII[57]];
                    if (llIllIIIlllII(NPCs.getNearest(strArr21))) {
                        String[] strArr22 = new String[llllllllII[1]];
                        strArr22[llllllllII[0]] = lllllllIII[llllllllII[58]];
                        if (llIllIIIlllII(NPCs.getNearest(strArr22))) {
                            AccBuilderTempleTrek.c = lllllllIII[llllllllII[59]];
                            Movement.walkTo(gF);
                            "".length();
                            Time.sleepTicks(llllllllII[1]);
                            "".length();
                        }
                    }
                    String[] strArr23 = new String[llllllllII[1]];
                    strArr23[llllllllII[0]] = lllllllIII[llllllllII[60]];
                    if (llIllIIIlllII(NPCs.getNearest(strArr23))) {
                        String[] strArr24 = new String[llllllllII[1]];
                        strArr24[llllllllII[0]] = lllllllIII[llllllllII[61]];
                    }
                    if (llIllIIIlllII(gG)) {
                        bX();
                    }
                    NPC nearest4 = NPCs.getNearest(npc -> {
                        if (llIllIIIlIIlI(npc.getName().contains(lllllllIII[llllllllII[89]]) ? 1 : 0) && llIllIIIllllI(npc.getInteracting(), Players.getLocal())) {
                            ?? r0 = llllllllII[1];
                            "".length();
                            return 0 != 0 ? ((157 ^ 134) ^ (109 ^ 104)) & (((68 ^ 42) ^ (90 ^ 42)) ^ (-" ".length())) : r0;
                        }
                        return llllllllII[0];
                    });
                    if (llIllIIIlIlIl(nearest4) && llIllIIIlllII(Players.getLocal().getInteracting())) {
                        nearest4.interact(lllllllIII[llllllllII[62]]);
                        Time.sleepTicks(llllllllII[3]);
                        "".length();
                    }
                    if (llIllIIIlllII(nearest4) && llIllIIIlllII(Players.getLocal().getInteracting())) {
                        String[] strArr25 = new String[llllllllII[1]];
                        strArr25[llllllllII[0]] = lllllllIII[llllllllII[63]];
                        if (llIllIIIlIlIl(NPCs.getNearest(strArr25))) {
                            String[] strArr26 = new String[llllllllII[1]];
                            strArr26[llllllllII[0]] = lllllllIII[llllllllII[15]];
                            if (llIllIIIlIlII(NPCs.getNearest(strArr26).isDead() ? 1 : 0) && llIllIIIlIlII(Dialog.isOpen() ? 1 : 0)) {
                                String[] strArr27 = new String[llllllllII[1]];
                                strArr27[llllllllII[0]] = lllllllIII[llllllllII[64]];
                                NPCs.getNearest(strArr27).interact(lllllllIII[llllllllII[65]]);
                            }
                        }
                    }
                    if (llIllIIIlIIlI(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllllllIII[llllllllII[66]];
                        List options = Dialog.getOptions();
                        if (llIllIIIlIlII(options.isEmpty() ? 1 : 0)) {
                            int i = llllllllII[0];
                            do {
                                if (llIllIIIlIIll(i, options.size())) {
                                    if (llIllIIIlIIlI(((Widget) options.get(i)).getText().contains(lllllllIII[llllllllII[67]]) ? 1 : 0)) {
                                        String[] strArr28 = new String[llllllllII[1]];
                                        strArr28[llllllllII[0]] = ((Widget) options.get(i)).getText();
                                        Dialog.chooseOption(strArr28);
                                        "".length();
                                        Time.sleepTicks(llllllllII[3]);
                                        "".length();
                                        "".length();
                                        if ("  ".length() == ((68 ^ 95) & ((8 ^ 19) ^ (-1)))) {
                                            return;
                                        }
                                    } else {
                                        i++;
                                        "".length();
                                    }
                                }
                            } while (" ".length() != 0);
                            return;
                        }
                    }
                    String[] strArr29 = new String[llllllllII[1]];
                    strArr29[llllllllII[0]] = lllllllIII[llllllllII[68]];
                    if (llIllIIIlIlIl(NPCs.getNearest(strArr29))) {
                        if (llIllIIIlIIll(ck, llllllllII[1]) && llIllIIIlIlII(cl ? 1 : 0)) {
                            ac.mZ += llllllllII[1];
                            ac.d(AccBuilderTempleTrek.m);
                            ck += llllllllII[1];
                            ac.mZ = llllllllII[0];
                            cl = llllllllII[1];
                        }
                        if (llIllIIIlIIlI(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllllllIII[llllllllII[69]];
                            List options2 = Dialog.getOptions();
                            if (llIllIIIlIlII(options2.isEmpty() ? 1 : 0)) {
                                int lllllllllllllllllIlIIIIlllIIIlIl = llllllllII[0];
                                while (llIllIIIlIIll(lllllllllllllllllIlIIIIlllIIIlIl, options2.size())) {
                                    String str = gG[lllllllllllllllllIlIIIIlllIIIlIl];
                                    int i2 = llllllllII[0];
                                    while (true) {
                                        if (!llIllIIIlIIll(i2, options2.size())) {
                                            break;
                                        } else if (llIllIIIlIIlI(((Widget) options2.get(i2)).getText().contains(str) ? 1 : 0)) {
                                            System.out.println("Selecting: " + ((Widget) options2.get(i2)).getText());
                                            Time.sleepTicks(llllllllII[3]);
                                            "".length();
                                            String[] strArr30 = new String[llllllllII[1]];
                                            strArr30[llllllllII[0]] = ((Widget) options2.get(i2)).getText();
                                            Dialog.chooseOption(strArr30);
                                            "".length();
                                            Time.sleepTicks(llllllllII[12]);
                                            "".length();
                                            "".length();
                                            if ("   ".length() <= " ".length()) {
                                                return;
                                            }
                                        } else {
                                            i2++;
                                            "".length();
                                            if (((119 ^ 62) ^ (223 ^ 146)) == "  ".length()) {
                                                return;
                                            }
                                        }
                                    }
                                    lllllllllllllllllIlIIIIlllIIIlIl++;
                                    "".length();
                                    if ("  ".length() <= 0) {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C0006g.a(bQ);
        }
    }

    private static boolean llIllIIIlIIlI(int i) {
        return i != 0;
    }

    static {
        llIllIIIlIIII();
        llIllIIIIllll();
        gy = lllllllIII[llllllllII[90]];
        gx = new B();
        bu = new ArrayList();
        gf = new WorldPoint(llllllllII[91], llllllllII[92], llllllllII[0]);
        gA = new WorldPoint(llllllllII[93], llllllllII[94], llllllllII[0]);
        gB = new WorldPoint(llllllllII[93], llllllllII[95], llllllllII[3]);
        gC = new WorldPoint(llllllllII[96], llllllllII[97], llllllllII[0]);
        gD = new WorldPoint(llllllllII[96], llllllllII[98], llllllllII[0]);
        gE = new WorldPoint(llllllllII[99], llllllllII[100], llllllllII[1]);
        gF = new WorldPoint(llllllllII[101], llllllllII[102], llllllllII[0]);
        String[] strArr = new String[llllllllII[31]];
        strArr[llllllllII[0]] = lllllllIII[llllllllII[103]];
        strArr[llllllllII[1]] = lllllllIII[llllllllII[104]];
        strArr[llllllllII[3]] = lllllllIII[llllllllII[105]];
        strArr[llllllllII[5]] = lllllllIII[llllllllII[106]];
        strArr[llllllllII[4]] = lllllllIII[llllllllII[107]];
        strArr[llllllllII[10]] = lllllllIII[llllllllII[108]];
        strArr[llllllllII[16]] = lllllllIII[llllllllII[109]];
        strArr[llllllllII[18]] = lllllllIII[llllllllII[110]];
        strArr[llllllllII[19]] = lllllllIII[llllllllII[111]];
        strArr[llllllllII[20]] = lllllllIII[llllllllII[112]];
        strArr[llllllllII[12]] = lllllllIII[llllllllII[113]];
        strArr[llllllllII[23]] = lllllllIII[llllllllII[114]];
        strArr[llllllllII[25]] = lllllllIII[llllllllII[115]];
        strArr[llllllllII[26]] = lllllllIII[llllllllII[116]];
        strArr[llllllllII[27]] = lllllllIII[llllllllII[117]];
        strArr[llllllllII[28]] = lllllllIII[llllllllII[118]];
        strArr[llllllllII[29]] = lllllllIII[llllllllII[119]];
        strArr[llllllllII[30]] = lllllllIII[llllllllII[120]];
        bQ = strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return llllllllII[0];
    }

    private static boolean llIllIIIlIlII(int i) {
        return i == 0;
    }

    private static boolean llIllIIIlIlll(int i) {
        return i < 0;
    }

    private static boolean llIllIIIlIIll(int i, int i2) {
        return i < i2;
    }

    private static String llIlIllllllIl(String lllllllllllllllllIlIIIIllIIllIll, String lllllllllllllllllIlIIIIllIIllIlI) {
        String lllllllllllllllllIlIIIIllIIllIll2 = new String(Base64.getDecoder().decode(lllllllllllllllllIlIIIIllIIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllllIlIIIIllIIllIII = lllllllllllllllllIlIIIIllIIllIlI.toCharArray();
        int lllllllllllllllllIlIIIIllIIlIIlI = llllllllII[0];
        char[] charArray = lllllllllllllllllIlIIIIllIIllIll2.toCharArray();
        int length = charArray.length;
        int i = llllllllII[0];
        while (llIllIIIlIIll(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllllIlIIIIllIIllIII[lllllllllllllllllIlIIIIllIIlIIlI % lllllllllllllllllIlIIIIllIIllIII.length]));
            "".length();
            lllllllllllllllllIlIIIIllIIlIIlI++;
            i++;
            "".length();
            if ((-" ".length()) >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0164, code lost:
        if (llIllIIIlIIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.A.llllllllII[10]) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (llIllIIIlIIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.A.llllllllII[9]) != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void ae() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = new int[llllllllII[1]];
        iArr5[llllllllII[0]] = llllllllII[7];
        if (llIllIIIlIIlI(Bank.contains(iArr5) ? 1 : 0)) {
            int[] iArr6 = new int[llllllllII[1]];
            iArr6[llllllllII[0]] = llllllllII[7];
            if (llIllIIIlIIlI(Bank.contains(iArr6) ? 1 : 0)) {
                int[] iArr7 = new int[llllllllII[1]];
                iArr7[llllllllII[0]] = llllllllII[7];
            }
            iArr = new int[llllllllII[1]];
            iArr[llllllllII[0]] = llllllllII[8];
            if (llIllIIIlIlII(Bank.contains(iArr) ? 1 : 0)) {
                bu.add(new C0003d(llllllllII[8], llllllllII[1], llllllllII[81]));
                "".length();
            }
            if (llIllIIIlIlII(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lllllllIII[llllllllII[88]]);
            }) ? 1 : 0)) {
                bu.add(new C0003d(llllllllII[82], llllllllII[10], llllllllII[83]));
                "".length();
            }
            iArr2 = new int[llllllllII[1]];
            iArr2[llllllllII[0]] = llllllllII[17];
            if (llIllIIIlIIlI(Bank.contains(iArr2) ? 1 : 0)) {
                int[] iArr8 = new int[llllllllII[1]];
                iArr8[llllllllII[0]] = llllllllII[17];
                if (llIllIIIlIIlI(Bank.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[llllllllII[1]];
                    iArr9[llllllllII[0]] = llllllllII[17];
                }
                iArr3 = new int[llllllllII[1]];
                iArr3[llllllllII[0]] = llllllllII[11];
                if (llIllIIIlIlII(Bank.contains(iArr3) ? 1 : 0)) {
                    bu.add(new C0003d(llllllllII[11], llllllllII[4], C0008i.bp));
                    "".length();
                }
                iArr4 = new int[llllllllII[1]];
                iArr4[llllllllII[0]] = llllllllII[6];
                if (llIllIIIlIIlI(Bank.contains(iArr4) ? 1 : 0)) {
                    int[] iArr10 = new int[llllllllII[1]];
                    iArr10[llllllllII[0]] = llllllllII[6];
                    if (!llIllIIIlIIlI(Bank.contains(iArr10) ? 1 : 0)) {
                        return;
                    }
                    int[] iArr11 = new int[llllllllII[1]];
                    iArr11[llllllllII[0]] = llllllllII[6];
                    if (!llIllIIIlIIll(Bank.getFirst(iArr11).getQuantity(), llllllllII[28])) {
                        return;
                    }
                }
                bu.add(new C0003d(llllllllII[6], llllllllII[54], llllllllII[85]));
                "".length();
            }
            bu.add(new C0003d(llllllllII[17], llllllllII[12], llllllllII[84]));
            "".length();
            iArr3 = new int[llllllllII[1]];
            iArr3[llllllllII[0]] = llllllllII[11];
            if (llIllIIIlIlII(Bank.contains(iArr3) ? 1 : 0)) {
            }
            iArr4 = new int[llllllllII[1]];
            iArr4[llllllllII[0]] = llllllllII[6];
            if (llIllIIIlIIlI(Bank.contains(iArr4) ? 1 : 0)) {
            }
            bu.add(new C0003d(llllllllII[6], llllllllII[54], llllllllII[85]));
            "".length();
        }
        bu.add(new C0003d(llllllllII[7], llllllllII[9], llllllllII[80]));
        "".length();
        iArr = new int[llllllllII[1]];
        iArr[llllllllII[0]] = llllllllII[8];
        if (llIllIIIlIlII(Bank.contains(iArr) ? 1 : 0)) {
        }
        if (llIllIIIlIlII(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lllllllIII[llllllllII[88]]);
        }) ? 1 : 0)) {
        }
        iArr2 = new int[llllllllII[1]];
        iArr2[llllllllII[0]] = llllllllII[17];
        if (llIllIIIlIIlI(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bu.add(new C0003d(llllllllII[17], llllllllII[12], llllllllII[84]));
        "".length();
        iArr3 = new int[llllllllII[1]];
        iArr3[llllllllII[0]] = llllllllII[11];
        if (llIllIIIlIlII(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[llllllllII[1]];
        iArr4[llllllllII[0]] = llllllllII[6];
        if (llIllIIIlIIlI(Bank.contains(iArr4) ? 1 : 0)) {
        }
        bu.add(new C0003d(llllllllII[6], llllllllII[54], llllllllII[85]));
        "".length();
    }

    private static boolean llIllIIIllIIl(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIllIIIllIll(int i, int i2) {
        return i != i2;
    }

    private static boolean llIllIIIlllII(Object obj) {
        return obj == null;
    }

    private static boolean llIllIIIlllIl(int i, int i2) {
        return i >= i2;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            bW();
            "".length();
            if ((-"   ".length()) >= 0) {
                return (101 ^ 108) & ((40 ^ 33) ^ (-1));
            }
        } catch (Exception e2) {
        }
        return llllllllII[86];
    }

    private static void llIllIIIlIIII() {
        llllllllII = new int[122];
        llllllllII[0] = (98 ^ 1) & ((81 ^ 50) ^ (-1));
        llllllllII[1] = " ".length();
        llllllllII[2] = (-2053) & 7052;
        llllllllII[3] = "  ".length();
        llllllllII[4] = 181 ^ 177;
        llllllllII[5] = "   ".length();
        llllllllII[6] = (-((-3371) & 27963)) & (-1) & 32599;
        llllllllII[7] = (-7473) & 7998;
        llllllllII[8] = (-((-131) & 10483)) & (-20483) & 32763;
        llllllllII[9] = 80 ^ 73;
        llllllllII[10] = 143 ^ 138;
        llllllllII[11] = (-163) & 12787;
        llllllllII[12] = (187 ^ 144) ^ (227 ^ 194);
        llllllllII[13] = (-28701) & 29695;
        llllllllII[14] = (-((-27565) & 31663)) & (-24577) & 29674;
        llllllllII[15] = (45 ^ 13) ^ (158 ^ 140);
        llllllllII[16] = (15 ^ 67) ^ (139 ^ 193);
        llllllllII[17] = (-((-8649) & 15305)) & (-8193) & 15227;
        llllllllII[18] = " ".length() ^ (143 ^ 137);
        llllllllII[19] = (183 ^ 152) ^ (73 ^ 110);
        llllllllII[20] = 143 ^ 134;
        llllllllII[21] = (-25473) & 28671;
        llllllllII[22] = (-((-8649) & 29643)) & (-8289) & 32751;
        llllllllII[23] = 177 ^ 186;
        llllllllII[24] = (-1679) & 4078;
        llllllllII[25] = (73 ^ 15) ^ (13 ^ 71);
        llllllllII[26] = (105 ^ 78) ^ (62 ^ 20);
        llllllllII[27] = 145 ^ 159;
        llllllllII[28] = (27 ^ 94) ^ (220 ^ 150);
        llllllllII[29] = 21 ^ 5;
        llllllllII[30] = 157 ^ 140;
        llllllllII[31] = (((164 + 136) - 219) + 87) ^ (((56 + 12) - 64) + 182);
        llllllllII[32] = 8 ^ 27;
        llllllllII[33] = 81 ^ 69;
        llllllllII[34] = 190 ^ 171;
        llllllllII[35] = 74 ^ 92;
        llllllllII[36] = 37 ^ 50;
        llllllllII[37] = (8 ^ 57) ^ (43 ^ 2);
        llllllllII[38] = (((203 + 78) - 206) + 141) ^ (((163 + 110) - 257) + 178);
        llllllllII[39] = 76 ^ 87;
        llllllllII[40] = 140 ^ 144;
        llllllllII[41] = 87 ^ 74;
        llllllllII[42] = 81 ^ 79;
        llllllllII[43] = 116 ^ 107;
        llllllllII[44] = 45 ^ 13;
        llllllllII[45] = 44 ^ 13;
        llllllllII[46] = (-21507) & 23907;
        llllllllII[47] = (((47 + 69) - 67) + 110) ^ (((88 + 170) - 101) + 32);
        llllllllII[48] = (-21537) & 23935;
        llllllllII[49] = 41 ^ 10;
        llllllllII[50] = (180 ^ 147) ^ "   ".length();
        llllllllII[51] = 183 ^ 146;
        llllllllII[52] = (101 ^ 4) ^ (225 ^ 166);
        llllllllII[53] = 51 ^ 20;
        llllllllII[54] = 183 ^ 159;
        llllllllII[55] = (((151 + 52) - 150) + 138) ^ (((43 + 115) - 97) + 89);
        llllllllII[56] = 1 ^ 43;
        llllllllII[57] = 49 ^ 26;
        llllllllII[58] = 153 ^ 181;
        llllllllII[59] = (86 ^ 33) ^ (201 ^ 147);
        llllllllII[60] = 136 ^ 166;
        llllllllII[61] = (((59 + 144) - 115) + 86) ^ (((98 + 86) - 73) + 18);
        llllllllII[62] = 159 ^ 175;
        llllllllII[63] = (6 ^ 87) ^ (242 ^ 146);
        llllllllII[64] = (152 ^ 173) ^ (51 ^ 53);
        llllllllII[65] = 101 ^ 81;
        llllllllII[66] = 159 ^ 170;
        llllllllII[67] = 112 ^ 70;
        llllllllII[68] = 41 ^ 30;
        llllllllII[69] = 250 ^ 194;
        llllllllII[70] = (-((-3741) & 32701)) & (-157) & 31678;
        llllllllII[71] = (-16469) & 19031;
        llllllllII[72] = (-4426) & 6989;
        llllllllII[73] = (-21723) & 24287;
        llllllllII[74] = (-24946) & 27511;
        llllllllII[75] = 159 ^ 166;
        llllllllII[76] = 114 ^ 72;
        llllllllII[77] = 102 ^ 93;
        llllllllII[78] = (-2729) & 15355;
        llllllllII[79] = 184 ^ 132;
        llllllllII[80] = (-((-974) & 3023)) & (-20585) & 23293;
        llllllllII[81] = (-20542) & 22461;
        llllllllII[82] = (-((-25605) & 29991)) & (-16385) & 32750;
        llllllllII[83] = (-4628) & 29627;
        llllllllII[84] = (-((-20610) & 31957)) & (-21121) & 32767;
        llllllllII[85] = (-14339) & 16238;
        llllllllII[86] = (171 ^ 132) ^ (202 ^ 129);
        llllllllII[87] = (42 ^ 64) ^ (50 ^ 101);
        llllllllII[88] = (110 ^ 112) ^ (91 ^ 123);
        llllllllII[89] = (48 ^ 3) ^ (9 ^ 5);
        llllllllII[90] = (((44 + 77) - 58) + 72) ^ (((62 + 128) - 107) + 116);
        llllllllII[91] = (-((-11) & 21119)) & (-8201) & 32511;
        llllllllII[92] = (-((-31749) & 32415)) & (-12289) & 16378;
        llllllllII[93] = (-((-4047) & 28623)) & (-4420) & 32199;
        llllllllII[94] = (-((-21569) & 30311)) & (-1) & 12214;
        llllllllII[95] = (-(14 ^ 89)) & (-12801) & 16383;
        llllllllII[96] = (-4901) & 8126;
        llllllllII[97] = (-4178) & 7673;
        llllllllII[98] = (-((-9753) & 28253)) & (-275) & 28671;
        llllllllII[99] = (-((-9229) & 26319)) & (-8193) & 28395;
        llllllllII[100] = (-12546) & 15707;
        llllllllII[101] = (-((-4191) & 29311)) & (-1) & 28347;
        llllllllII[102] = (-((-1449) & 22009)) & (-129) & 24059;
        llllllllII[103] = (223 ^ 187) ^ (174 ^ 139);
        llllllllII[104] = 38 ^ 100;
        llllllllII[105] = (((116 + 191) - 269) + 201) ^ (((59 + 107) - 28) + 34);
        llllllllII[106] = 194 ^ 134;
        llllllllII[107] = (((180 + 97) - 226) + 162) ^ (((64 + 21) - 29) + 88);
        llllllllII[108] = 71 ^ 1;
        llllllllII[109] = (73 ^ 14) ^ ((113 ^ 65) & ((16 ^ 32) ^ (-1)));
        llllllllII[110] = (40 ^ 54) ^ (81 ^ 7);
        llllllllII[111] = 20 ^ 93;
        llllllllII[112] = (221 ^ 154) ^ (29 ^ 16);
        llllllllII[113] = 90 ^ 17;
        llllllllII[114] = 71 ^ 11;
        llllllllII[115] = (75 ^ 3) ^ (28 ^ 25);
        llllllllII[116] = (0 ^ 76) ^ "  ".length();
        llllllllII[117] = 202 ^ 133;
        llllllllII[118] = (42 ^ 6) ^ (12 ^ 112);
        llllllllII[119] = (239 ^ 182) ^ (105 ^ 97);
        llllllllII[120] = 15 ^ 93;
        llllllllII[121] = 58 ^ 105;
    }

    private static void llIllIIIIllll() {
        lllllllIII = new String[llllllllII[121]];
        lllllllIII[llllllllII[0]] = llIlIllllllII("+t9bpCjERCNszs5zw372oI3LYuSthTRoCBuswdHv7QuYxJt86oO8bMPPkXrLZDxb", "wHgZm");
        lllllllIII[llllllllII[1]] = llIlIllllllIl("JxkSWjMGWAYbKQI=", "ixdzG");
        lllllllIII[llllllllII[3]] = llIlIllllllIl("GAopDg45BSBKADEFLAMMNw==", "PkGjb");
        lllllllIII[llllllllII[5]] = llIlIllllllIl("OBdnABAKUioIERwbKQZCHgciEhZPATIREgMbIhJOTwEwCBYMGi4PBU8GKEEgOisOLyU=", "orGab");
        lllllllIII[llllllllII[4]] = llIlIllllllIl("GhxCFhYoWQ8eFz4QDBBEPAwHBBBtChcHFCEQBwRIbQoVHhAuEQsZA20NDVcmGCArOSM=", "Mybwd");
        lllllllIII[llllllllII[10]] = llIlIllllllIl("GRYmNw==", "NsGEU");
        lllllllIII[llllllllII[16]] = llIlIllllllII("ayyP72FQ+ec=", "Xamhl");
        lllllllIII[llllllllII[18]] = llIlIllllllIl("MwQi", "veVOf");
        lllllllIII[llllllllII[19]] = llIlIllllllIl("OAMBcQEZQgQlFAQW", "vbwQu");
        lllllllIII[llllllllII[20]] = llIlIllllllII("6KmZtNt3FFM=", "wfgqB");
        lllllllIII[llllllllII[12]] = llIlIllllllIl("ARMEYzggUgEqPm8CCzE/Jhw=", "OrrCL");
        lllllllIII[llllllllII[23]] = llIlIllllllIl("NAs0RBgVGzUNJg==", "gbFdH");
        lllllllIII[llllllllII[25]] = llIlIllllllII("E4oz/86qHCNeWNOnouE99Q==", "kkHeI");
        lllllllIII[llllllllII[26]] = llIlIllllllIl("LQgbdxsMSQ42HxcIBDk=", "cimWo");
        lllllllIII[llllllllII[27]] = llIlIlllllllI("070ccSIb5Il/ejU/h7dhRg==", "vpoST");
        lllllllIII[llllllllII[28]] = llIlIllllllIl("DSY5MgQ7czU/QTgyLjwT", "OSZYa");
        lllllllIII[llllllllII[29]] = llIlIllllllII("d4ewFsPo7A3TiMfRnb37+A==", "vXoex");
        lllllllIII[llllllllII[30]] = llIlIlllllllI("k6QQDwMB6Wr/F2iHzDi4nQ==", "hHyTF");
        lllllllIII[llllllllII[31]] = llIlIllllllIl("NRkEAgg=", "qkekf");
        lllllllIII[llllllllII[32]] = llIlIllllllII("eH4F+ZuW6/YPej54VFs4wQ==", "yYKvP");
        lllllllIII[llllllllII[33]] = llIlIlllllllI("JhCw3TD4HvVDiIMAun2tIzFyQUr9REwu", "tfOEx");
        lllllllIII[llllllllII[34]] = llIlIllllllIl("ADkZIRkhPQ==", "MXwIv");
        lllllllIII[llllllllII[35]] = llIlIlllllllI("4Hat8GafyII=", "rAcca");
        lllllllIII[llllllllII[36]] = llIlIllllllIl("GRsmCg==", "VkCdy");
        lllllllIII[llllllllII[37]] = llIlIllllllIl("DiYDOCcvIg==", "CGmPH");
        lllllllIII[llllllllII[9]] = llIlIllllllIl("NgIBCQ==", "yrdgJ");
        lllllllIII[llllllllII[38]] = llIlIlllllllI("ncNdkOnbjk8=", "JFxLx");
        lllllllIII[llllllllII[39]] = llIlIlllllllI("lYumBvhtMJI=", "rnZIQ");
        lllllllIII[llllllllII[40]] = llIlIllllllII("WtZswQ0Qq9VFR5+XrERytA==", "qXlhP");
        lllllllIII[llllllllII[41]] = llIlIlllllllI("+42Szzn4JW4=", "qNlxx");
        lllllllIII[llllllllII[42]] = llIlIlllllllI("1dIiRmi5WOhRiO6r/Glpgg==", "zxzfG");
        lllllllIII[llllllllII[43]] = llIlIllllllII("6hn01q2fLL+MNdAb9cjxpg==", "mLoCz");
        lllllllIII[llllllllII[44]] = llIlIllllllIl("CgQdDTR4GgsA", "XqnyM");
        lllllllIII[llllllllII[45]] = llIlIllllllII("ZbxyM+UeLOg=", "OWewY");
        lllllllIII[llllllllII[47]] = llIlIllllllIl("PSw6ESQcKT8AKRo=", "nEVgA");
        lllllllIII[llllllllII[49]] = llIlIllllllII("o9lgRsqrnls=", "aIzbU");
        lllllllIII[llllllllII[50]] = llIlIlllllllI("jWxDYmjnFaE=", "oirKy");
        lllllllIII[llllllllII[51]] = llIlIlllllllI("g4pPb/Y/gPMXRRzbHftQfg==", "ZhrGh");
        lllllllIII[llllllllII[52]] = llIlIllllllIl("JiMfBjUVajEVJhgoChUp", "qJegG");
        lllllllIII[llllllllII[53]] = llIlIlllllllI("ATZp34erdgVShCNkZqsG5Q==", "xDKXe");
        lllllllIII[llllllllII[54]] = llIlIllllllIl("Oww7YxMaTT4qFVUdNDEUHAM=", "umMCg");
        lllllllIII[llllllllII[55]] = llIlIlllllllI("jFUdCxfBAlxgDM5Z3hO2kg==", "yGpxc");
        lllllllIII[llllllllII[56]] = llIlIllllllII("kiPDTriz1yqF/K80mPlXDQ==", "UbElz");
        lllllllIII[llllllllII[57]] = llIlIllllllII("9852y8771zo=", "FoEEM");
        lllllllIII[llllllllII[58]] = llIlIlllllllI("lD7+R4wbZDcNpjPb82FsXsHlmGmSid2O", "AJKez");
        lllllllIII[llllllllII[59]] = llIlIllllllIl("CyYwcwEqZyI2GCop", "EGFSu");
        lllllllIII[llllllllII[60]] = llIlIllllllIl("AwwDCAQzAQ==", "Giozm");
        lllllllIII[llllllllII[61]] = llIlIlllllllI("7ESo/zU4ixYPtDP+7W66Hk2mSzv/kAao", "bNJZG");
        lllllllIII[llllllllII[62]] = llIlIllllllII("BY2MzYVjMjc=", "gwDqu");
        lllllllIII[llllllllII[63]] = llIlIllllllIl("KisaEQoaJg==", "nNvcc");
        lllllllIII[llllllllII[15]] = llIlIlllllllI("m1NLeCILakY=", "HWYQu");
        lllllllIII[llllllllII[64]] = llIlIllllllII("AR4dEYHLtVA=", "LYqmk");
        lllllllIII[llllllllII[65]] = llIlIllllllII("G3rZq01WOSs=", "Bqdbn");
        lllllllIII[llllllllII[66]] = llIlIllllllII("7RkALeH/9P5VVbwAo8lpXQ==", "CGnWp");
        lllllllIII[llllllllII[67]] = llIlIllllllII("WAHf399iXFs=", "OkEwJ");
        lllllllIII[llllllllII[68]] = llIlIllllllII("vXs6oP3ZZ0CEnmj3bbq07duete/PAakn", "BjOfP");
        lllllllIII[llllllllII[69]] = llIlIlllllllI("mIEskB2iJ5buTteRrGwHXQ==", "Wcplz");
        lllllllIII[llllllllII[75]] = llIlIlllllllI("JX+W6UKdXDc=", "mGrRp");
        lllllllIII[llllllllII[76]] = llIlIlllllllI("hO3ZgICwDgJ+10CEdCwxpw==", "qEYSG");
        lllllllIII[llllllllII[77]] = llIlIlllllllI("tTCACNzRrW1R7Jhcyfbxxj4L+b8OogQl", "sJkTq");
        lllllllIII[llllllllII[79]] = llIlIlllllllI("5DES4MMMlc0=", "oyenO");
        lllllllIII[llllllllII[87]] = llIlIllllllII("NvBmzzKK9QihydEndklZHA==", "oVAAs");
        lllllllIII[llllllllII[88]] = llIlIllllllII("9WM//IQueotHPiVyJLvPoYwOim8JNrfm", "saCcu");
        lllllllIII[llllllllII[89]] = llIlIllllllII("QQJlaBnwzdM=", "RdQaO");
        lllllllIII[llllllllII[90]] = llIlIllllllIl("Bx4jdyAhECB3ICgCdCM/KAV0PjkqEDojNj0YOzl3KBY1Pjl2", "IqTWW");
        lllllllIII[llllllllII[103]] = llIlIlllllllI("wJUcFxTkQDg=", "LQlow");
        lllllllIII[llllllllII[104]] = llIlIlllllllI("1sQwBRTAawFP7G2BybEFL/Ynzuxs2+tL", "qQrdU");
        lllllllIII[llllllllII[105]] = llIlIllllllII("Uda8JECB2XJ4nd/WEKEnWgDqpfEjfxXkim8KfDpSvkzpQROKuYsZwUudwz80qeZS", "DczUz");
        lllllllIII[llllllllII[106]] = llIlIllllllIl("BiZSBj0iaRYHNnUeEwI+LGkZBz45aTYLPicgBgZt", "UIrnR");
        lllllllIII[llllllllII[107]] = llIlIllllllII("NU5NF9DWo37fv6ROfzBSapfKISbq7Fq20sj6NBUsppiF8QbHlH4r2Q==", "ykKCU");
        lllllllIII[llllllllII[108]] = llIlIllllllII("q+pQK20NKcPhXZGdl/kLQKmUh+O6UWgTq2vxa9VEe8hKngwQlbuKl9tH7uMt3GzB", "IHPqQ");
        lllllllIII[llllllllII[109]] = llIlIllllllIl("I0QlFAoORD8eTwwNJRVPOQ0nBwoYCCIWBx5K", "jdKqo");
        lllllllIII[llllllllII[110]] = llIlIllllllII("B6BxrA109DajTK0fKBNKCF801s5jHTncEVNcyFD10uxg/7Zvxzn4s1X7fV0AdlxR1ONAJ9TBans=", "PTWmT");
        lllllllIII[llllllllII[111]] = llIlIllllllIl("ISxRIisEJlEoJ1I3GSBiGSYINmM=", "rCqEB");
        lllllllIII[llllllllII[112]] = llIlIllllllIl("GiI7bDpjLCYjBG9nKjkHYzMgJQBjLjtsGi43Jz4HIik8Yg==", "CGHLs");
        lllllllIII[llllllllII[113]] = llIlIllllllIl("JyogEyRUMWUAYRcnKA4vUzUtDmEEIysVMlM2KkEoHTQkBSRTNi0IMlMhLBU4XQ==", "sBEaA");
        lllllllIII[llllllllII[114]] = llIlIllllllII("VnVe+7h3zBCiAvp+l7s2Qg==", "JBEHa");
        lllllllIII[llllllllII[115]] = llIlIllllllIl("HzlPBks4IhxVHz4oBVUcPiJIFBkzbQ8aAjgqSAEEdisBEgMibRwdDnYpDRgEOGFIHB9xPkgYDng=", "VMhuk");
        lllllllIII[llllllllII[116]] = llIlIllllllIl("CgwmdSQrHCc8GnkWNTwQeRw7IFQuCiE5EHkCPSMReQgxdQAxAHQ+ESBL", "YeTUt");
        lllllllIII[llllllllII[117]] = llIlIlllllllI("7YATjeNkWhgmp2/SdZSOAs/RrI6AbErjBs0oF0aDxkV63sa0l4tZLTURRHAiAy7+", "NrnLB");
        lllllllIII[llllllllII[118]] = llIlIllllllII("GnfGswO/i7cQ9Gxsv8X6by4MYqBe5VTc9k48N6B+fLU=", "POuGw");
        lllllllIII[llllllllII[119]] = llIlIlllllllI("chI/l2zRC82Of65+O6QBIJ6LyCLVpe/8l3c91wGfrcNnIGptsGrXQA/RIHQbb06f", "jooFH");
        lllllllIII[llllllllII[120]] = llIlIlllllllI("F2tUjSah3J9luawVa0SLx37zFvPT32Sr0w2VOY3qtaU=", "hPVdT");
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return lllllllIII[llllllllII[87]];
    }

    private static String llIlIllllllII(String lllllllllllllllllIlIIIIllIIIIllI, String lllllllllllllllllIlIIIIllIIIIlIl) {
        try {
            SecretKeySpec lllllllllllllllllIlIIIIllIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIIllIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllllllII[3], lllllllllllllllllIlIIIIllIIIlIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIIllIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIIIllIIIIlll) {
            lllllllllllllllllIlIIIIllIIIIlll.printStackTrace();
            return null;
        }
    }

    private static String llIlIlllllllI(String lllllllllllllllllIlIIIIllIlIlIll, String lllllllllllllllllIlIIIIllIlIlIII) {
        try {
            SecretKeySpec lllllllllllllllllIlIIIIllIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIIllIlIlIII.getBytes(StandardCharsets.UTF_8)), llllllllII[19]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllllllII[3], lllllllllllllllllIlIIIIllIlIlllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIIllIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIIIllIlIllII) {
            lllllllllllllllllIlIIIIllIlIllII.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIIllIlI(int i, int i2) {
        return i == i2;
    }

    private static void bX() {
        if (llIllIIIlllII(gG)) {
            if (llIllIIIlIlII(Vars.getBit(llllllllII[70])) && llIllIIIlIlII(Vars.getBit(llllllllII[71]))) {
                return;
            }
            String[] strArr = new String[llllllllII[10]];
            strArr[llllllllII[0]] = gx.get(Integer.valueOf(Vars.getBit(llllllllII[70])));
            strArr[llllllllII[1]] = gx.get(Integer.valueOf(Vars.getBit(llllllllII[71])));
            strArr[llllllllII[3]] = gx.get(Integer.valueOf(Vars.getBit(llllllllII[72])));
            strArr[llllllllII[5]] = gx.get(Integer.valueOf(Vars.getBit(llllllllII[73])));
            strArr[llllllllII[4]] = gx.get(Integer.valueOf(Vars.getBit(llllllllII[74])));
            gG = strArr;
            System.out.println("Say the following in order: " + String.join(lllllllIII[llllllllII[75]], gG));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean aa() {
        int[] iArr = new int[llllllllII[3]];
        iArr[llllllllII[0]] = llllllllII[6];
        iArr[llllllllII[1]] = llllllllII[8];
        int i = llllllllII[0];
        while (llIllIIIlIIll(i, iArr.length)) {
            int[] iArr2 = new int[llllllllII[1]];
            iArr2[llllllllII[0]] = iArr[i];
            if (llIllIIIlIlII(Inventory.contains(iArr2) ? 1 : 0)) {
                return llllllllII[0];
            }
            i++;
            "".length();
            if ((-" ".length()) > 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llllllllII[1];
    }

    private static boolean llIllIIIlIlIl(Object obj) {
        return obj != null;
    }

    private static boolean llIllIIIlIllI(int i) {
        return i > 0;
    }

    private static boolean llIllIIIllIII(int i, int i2) {
        return i > i2;
    }
}
