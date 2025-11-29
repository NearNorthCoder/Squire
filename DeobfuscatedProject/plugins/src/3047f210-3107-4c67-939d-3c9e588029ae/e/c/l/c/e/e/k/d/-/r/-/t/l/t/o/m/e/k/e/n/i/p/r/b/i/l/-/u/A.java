/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 */
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.B;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.ac;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.i;
import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

public class A
implements S {
    static /* synthetic */ WorldPoint gD;
    static /* synthetic */ boolean cl;
    static /* synthetic */ int ck;
    public static /* synthetic */ List<d> bu;
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
    private final /* synthetic */ int gH = 0;
    static /* synthetic */ WorldPoint gf;
    private static final /* synthetic */ HashMap<Integer, String> gx;
    static /* synthetic */ WorldPoint gE;
    private static /* synthetic */ String[] lllllllIII;

    private static boolean llIllIIIllllI(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    private static void bY() {
        void lllllllllllllllllIlIIIIllIllllll;
        BankLocation bankLocation = BankLocation.getNearest();
        if (A.llIllIIIlIlIl(bankLocation) && A.llIllIIIlIlII(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllllllIII[llllllllII[76]];
            a.a(bankLocation);
        }
        if (A.llIllIIIlIlIl(lllllllllllllllllIlIIIIllIllllll) && A.llIllIIIlIIlI(lllllllllllllllllIlIIIIllIllllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (A.llIllIIIlIlII(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)llllllllII[2]);
                "".length();
                Time.sleepTicks((int)llllllllII[5]);
                "".length();
            }
            if (A.llIllIIIlIIlI(Bank.isOpen() ? 1 : 0)) {
                AccBuilderTempleTrek.c = lllllllIII[llllllllII[77]];
                if (A.llIllIIIlIIlI(gz ? 1 : 0)) {
                    int[] nArray = new int[llllllllII[1]];
                    nArray[A.llllllllII[0]] = llllllllII[48];
                    if (A.llIllIIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0) && A.llIllIIIlIllI(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)llllllllII[4]);
                        "".length();
                    }
                }
                if (A.llIllIIIlIllI(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)llllllllII[3]);
                    "".length();
                }
                if (A.llIllIIIlIIlI(gz ? 1 : 0)) {
                    int[] nArray = new int[llllllllII[1]];
                    nArray[A.llllllllII[0]] = llllllllII[48];
                    if (A.llIllIIIlIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        a.a(llllllllII[11], llllllllII[1]);
                        a.a(llllllllII[6], llllllllII[12]);
                        a.a(llllllllII[48], llllllllII[1]);
                        a.a(llllllllII[24], llllllllII[1]);
                        a.a(llllllllII[46], llllllllII[1]);
                        Time.sleepTicks((int)llllllllII[1]);
                        "".length();
                        int[] nArray2 = new int[llllllllII[1]];
                        nArray2[A.llllllllII[0]] = llllllllII[11];
                        if (A.llIllIIIlIlII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                            a.a(llllllllII[78], llllllllII[1]);
                        }
                        a.a(llllllllII[17], Inventory.getFreeSlots() - llllllllII[1]);
                    }
                }
                if (A.llIllIIIlIIlI(gz ? 1 : 0)) {
                    int[] nArray = new int[llllllllII[1]];
                    nArray[A.llllllllII[0]] = llllllllII[48];
                    if (A.llIllIIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        if (A.llIllIIIlIlII(Equipment.contains((int[])f.aQ) ? 1 : 0) && A.llIllIIIlIlII(Inventory.contains((int[])f.aQ) ? 1 : 0)) {
                            a.b(f.aQ, llllllllII[1]);
                        }
                        if (A.llIllIIIlIIlI(Inventory.contains((int[])f.aQ) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aQ).interact(lllllllIII[llllllllII[79]]);
                            Time.sleepTicks((int)llllllllII[5]);
                            "".length();
                        }
                        if (A.llIllIIIlIlII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)llllllllII[10]);
                            "".length();
                        }
                        if (A.llIllIIIlIIlI(Bank.isOpen() ? 1 : 0)) {
                            a.a(llllllllII[11], llllllllII[1]);
                            a.a(llllllllII[6], llllllllII[12]);
                            a.a(llllllllII[7], llllllllII[9]);
                        }
                    }
                }
            }
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (A.llIllIIIlllIl(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()), llllllllII[5])) {
            bl = llllllllII[1];
            "".length();
            if ("   ".length() < 0) {
                return ((0xC0 ^ 0x86 ^ (0x69 ^ 0x18)) & (0x25 ^ 0x51 ^ (0xC6 ^ 0x85) ^ -" ".length())) != 0;
            }
        } else {
            bl = llllllllII[0];
        }
        return bl;
    }

    private static int llIllIIIlIIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    public static void bW() {
        block77: {
            block78: {
                Object lllllllllllllllllIlIIIIlllIIIllI;
                block80: {
                    block79: {
                        if (A.llIllIIIlIIlI(bs ? 1 : 0)) {
                            b.a(bu);
                            if (A.llIllIIIlIIll(bu.size(), llllllllII[1])) {
                                System.out.println(lllllllIII[llllllllII[0]]);
                                bs = llllllllII[0];
                            }
                        }
                        if (!A.llIllIIIlIlII(bs ? 1 : 0)) break block77;
                        if (A.llIllIIIlIlII(A.aa() ? 1 : 0) && A.llIllIIIlIlII(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()))) {
                            lllllllllllllllllIlIIIIlllIIIllI = BankLocation.getNearest();
                            if (A.llIllIIIlIlIl(lllllllllllllllllIlIIIIlllIIIllI) && A.llIllIIIlIlII(lllllllllllllllllIlIIIIlllIIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllllllIII[llllllllII[1]];
                                a.a((BankLocation)lllllllllllllllllIlIIIIlllIIIllI);
                            }
                            if (A.llIllIIIlIlIl(lllllllllllllllllIlIIIIlllIIIllI) && A.llIllIIIlIIlI(lllllllllllllllllIlIIIIlllIIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (A.llIllIIIlIlII(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)llllllllII[2]);
                                    "".length();
                                }
                                if (A.llIllIIIlIIlI(Bank.isOpen() ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllllIII[llllllllII[3]];
                                    if (A.llIllIIIlIllI(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)llllllllII[4]);
                                        "".length();
                                    }
                                    if (A.llIllIIIlIllI(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)llllllllII[3]);
                                        "".length();
                                    }
                                    int[] nArray = new int[llllllllII[5]];
                                    nArray[A.llllllllII[0]] = llllllllII[6];
                                    nArray[A.llllllllII[1]] = llllllllII[7];
                                    nArray[A.llllllllII[3]] = llllllllII[8];
                                    if (A.llIllIIIlIlII(e.b(nArray) ? 1 : 0)) {
                                        A.ae();
                                        System.out.println(lllllllIII[llllllllII[5]]);
                                        bs = llllllllII[1];
                                        return;
                                    }
                                    int[] nArray2 = new int[llllllllII[1]];
                                    nArray2[A.llllllllII[0]] = llllllllII[7];
                                    if (A.llIllIIIlIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                        int[] nArray3 = new int[llllllllII[1]];
                                        nArray3[A.llllllllII[0]] = llllllllII[7];
                                        if (A.llIllIIIlIIll(Bank.getFirst((int[])nArray3).getQuantity(), llllllllII[9])) {
                                            A.ae();
                                            System.out.println(lllllllIII[llllllllII[4]]);
                                            bs = llllllllII[1];
                                            return;
                                        }
                                    }
                                    int[] nArray4 = new int[llllllllII[5]];
                                    nArray4[A.llllllllII[0]] = llllllllII[6];
                                    nArray4[A.llllllllII[1]] = llllllllII[7];
                                    nArray4[A.llllllllII[3]] = llllllllII[8];
                                    if (A.llIllIIIlIIlI(e.b(nArray4) ? 1 : 0)) {
                                        if (A.llIllIIIlIlII(Equipment.contains((int[])f.aQ) ? 1 : 0) && A.llIllIIIlIlII(Inventory.contains((int[])f.aQ) ? 1 : 0)) {
                                            a.b(f.aQ, llllllllII[1]);
                                        }
                                        if (A.llIllIIIlIIlI(Inventory.contains((int[])f.aQ) ? 1 : 0)) {
                                            Inventory.getFirst((int[])f.aQ).interact(lllllllIII[llllllllII[10]]);
                                            Time.sleepTicks((int)llllllllII[5]);
                                            "".length();
                                        }
                                        if (A.llIllIIIlIlII(Bank.isOpen() ? 1 : 0)) {
                                            a.a();
                                            Time.sleepTicks((int)llllllllII[5]);
                                            "".length();
                                        }
                                        a.a(llllllllII[11], llllllllII[1]);
                                        a.a(llllllllII[8], llllllllII[1]);
                                        a.a(llllllllII[6], llllllllII[12]);
                                        a.a(llllllllII[13], llllllllII[14]);
                                    }
                                }
                            }
                        }
                        if (A.llIllIIIlIIlI(Inventory.contains((int[])f.aU) ? 1 : 0) && A.llIllIIIlIIll(Movement.getRunEnergy(), llllllllII[15])) {
                            Inventory.getFirst((int[])f.aU).interact(lllllllIII[llllllllII[16]]);
                            Time.sleepTicks((int)llllllllII[1]);
                            "".length();
                        }
                        int[] nArray = new int[llllllllII[1]];
                        nArray[A.llllllllII[0]] = llllllllII[17];
                        if (A.llIllIIIlIIlI(Inventory.contains((int[])nArray) ? 1 : 0) && A.llIllIIIlIlll(A.llIllIIIlIIIl(e.u(), 55.0))) {
                            int[] nArray5 = new int[llllllllII[1]];
                            nArray5[A.llllllllII[0]] = llllllllII[17];
                            Inventory.getFirst((int[])nArray5).interact(lllllllIII[llllllllII[18]]);
                        }
                        if (A.llIllIIIlIIlI(A.aa() ? 1 : 0) && A.llIllIIIlIlII(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()))) {
                            if (A.llIllIIIllIII(Players.getLocal().getWorldLocation().distanceTo(gf), llllllllII[4]) && A.llIllIIIlIlII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllllllIII[llllllllII[19]];
                                Movement.walkTo((WorldPoint)gf);
                                "".length();
                                Time.sleepTicks((int)llllllllII[1]);
                                "".length();
                            }
                            if (A.llIllIIIllIIl(Players.getLocal().getWorldLocation().distanceTo(gf), llllllllII[4])) {
                                g.a(lllllllIII[llllllllII[20]], bQ);
                            }
                        }
                        if (A.llIllIIIllIlI(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()), llllllllII[1])) {
                            lllllllllllllllllIlIIIIlllIIIllI = new WorldArea(llllllllII[21], llllllllII[22], llllllllII[19], llllllllII[18], llllllllII[0]);
                            if (A.llIllIIIlIlII(lllllllllllllllllIlIIIIlllIIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllllllIII[llllllllII[12]];
                                Movement.walkTo((WorldPoint)gA);
                                "".length();
                                Time.sleepTicks((int)llllllllII[1]);
                                "".length();
                            }
                            if (A.llIllIIIlIIlI(lllllllllllllllllIlIIIIlllIIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                g.a(lllllllIII[llllllllII[23]], bQ);
                            }
                        }
                        if (!A.llIllIIIllIlI(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()), llllllllII[3])) break block78;
                        ck = llllllllII[0];
                        int[] nArray6 = new int[llllllllII[1]];
                        nArray6[A.llllllllII[0]] = llllllllII[24];
                        if (A.llIllIIIlIlII(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                            String[] stringArray = new String[llllllllII[1]];
                            stringArray[A.llllllllII[0]] = lllllllIII[llllllllII[25]];
                            if (A.llIllIIIlIlII(Equipment.contains((String[])stringArray) ? 1 : 0) && A.llIllIIIlIlII(gz ? 1 : 0)) {
                                if (!A.llIllIIIllIIl(Players.getLocal().getWorldLocation().distanceTo(gB), llllllllII[4]) || A.llIllIIIllIll(Players.getLocal().getWorldLocation().getPlane(), llllllllII[3])) {
                                    AccBuilderTempleTrek.c = lllllllIII[llllllllII[26]];
                                    Movement.walkTo((WorldPoint)gB);
                                    "".length();
                                    Time.sleepTicks((int)llllllllII[1]);
                                    "".length();
                                }
                                if (A.llIllIIIllIIl(Players.getLocal().getWorldLocation().distanceTo(gB), llllllllII[4])) {
                                    g.a(lllllllIII[llllllllII[27]], bQ);
                                }
                            }
                        }
                        int[] nArray7 = new int[llllllllII[1]];
                        nArray7[A.llllllllII[0]] = llllllllII[24];
                        if (A.llIllIIIlIIlI(Inventory.contains((int[])nArray7) ? 1 : 0) && A.llIllIIIlIlII(gz ? 1 : 0)) {
                            String[] stringArray = new String[llllllllII[1]];
                            stringArray[A.llllllllII[0]] = lllllllIII[llllllllII[28]];
                            if (A.llIllIIIlIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                if (A.llIllIIIllIII(Players.getLocal().getWorldLocation().distanceTo(gC), llllllllII[4])) {
                                    AccBuilderTempleTrek.c = lllllllIII[llllllllII[29]];
                                    Movement.walkTo((WorldPoint)gC);
                                    "".length();
                                    Time.sleepTicks((int)llllllllII[1]);
                                    "".length();
                                }
                                if (A.llIllIIIllIIl(Players.getLocal().getWorldLocation().distanceTo(gC), llllllllII[4])) {
                                    String[] stringArray2 = new String[llllllllII[1]];
                                    stringArray2[A.llllllllII[0]] = lllllllIII[llllllllII[30]];
                                    String[] stringArray3 = new String[llllllllII[1]];
                                    stringArray3[A.llllllllII[0]] = lllllllIII[llllllllII[31]];
                                    Inventory.getFirst((String[])stringArray2).useOn(TileObjects.getNearest((String[])stringArray3));
                                    Time.sleepTicks((int)llllllllII[10]);
                                    "".length();
                                }
                            }
                            String[] stringArray4 = new String[llllllllII[1]];
                            stringArray4[A.llllllllII[0]] = lllllllIII[llllllllII[32]];
                            if (A.llIllIIIlIlII(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                                if (A.llIllIIIllIII(Players.getLocal().getWorldLocation().distanceTo(gD), llllllllII[4])) {
                                    AccBuilderTempleTrek.c = lllllllIII[llllllllII[33]];
                                    String[] stringArray5 = new String[llllllllII[1]];
                                    stringArray5[A.llllllllII[0]] = lllllllIII[llllllllII[34]];
                                    if (A.llIllIIIlIlIl(TileObjects.getNearest((String[])stringArray5))) {
                                        String[] stringArray6 = new String[llllllllII[1]];
                                        stringArray6[A.llllllllII[0]] = lllllllIII[llllllllII[35]];
                                        String[] stringArray7 = new String[llllllllII[1]];
                                        stringArray7[A.llllllllII[0]] = lllllllIII[llllllllII[36]];
                                        if (A.llIllIIIlIIlI(TileObjects.getNearest((String[])stringArray6).hasAction(stringArray7) ? 1 : 0)) {
                                            String[] stringArray8 = new String[llllllllII[1]];
                                            stringArray8[A.llllllllII[0]] = lllllllIII[llllllllII[37]];
                                            TileObjects.getNearest((String[])stringArray8).interact(lllllllIII[llllllllII[9]]);
                                            Time.sleepTicks((int)llllllllII[3]);
                                            "".length();
                                        }
                                    }
                                    String[] stringArray9 = new String[llllllllII[1]];
                                    stringArray9[A.llllllllII[0]] = lllllllIII[llllllllII[38]];
                                    if (A.llIllIIIlIlIl(TileObjects.getNearest((String[])stringArray9))) {
                                        String[] stringArray10 = new String[llllllllII[1]];
                                        stringArray10[A.llllllllII[0]] = lllllllIII[llllllllII[39]];
                                        String[] stringArray11 = new String[llllllllII[1]];
                                        stringArray11[A.llllllllII[0]] = lllllllIII[llllllllII[40]];
                                        if (A.llIllIIIlIIlI(TileObjects.getNearest((String[])stringArray10).hasAction(stringArray11) ? 1 : 0)) {
                                            String[] stringArray12 = new String[llllllllII[1]];
                                            stringArray12[A.llllllllII[0]] = lllllllIII[llllllllII[41]];
                                            TileObjects.getNearest((String[])stringArray12).interact(lllllllIII[llllllllII[42]]);
                                            Time.sleepTicks((int)llllllllII[3]);
                                            "".length();
                                        }
                                    }
                                    Movement.walkTo((WorldPoint)gD);
                                    "".length();
                                    Time.sleepTicks((int)llllllllII[1]);
                                    "".length();
                                }
                                if (A.llIllIIIllIIl(Players.getLocal().getWorldLocation().distanceTo(gD), llllllllII[4])) {
                                    String[] stringArray13 = new String[llllllllII[1]];
                                    stringArray13[A.llllllllII[0]] = lllllllIII[llllllllII[43]];
                                    if (A.llIllIIIlIlIl(TileObjects.getNearest((String[])stringArray13))) {
                                        String[] stringArray14 = new String[llllllllII[1]];
                                        stringArray14[A.llllllllII[0]] = lllllllIII[llllllllII[44]];
                                        TileObjects.getNearest((String[])stringArray14).interact(lllllllIII[llllllllII[45]]);
                                        Time.sleepTicks((int)llllllllII[4]);
                                        "".length();
                                    }
                                }
                            }
                        }
                        int[] nArray8 = new int[llllllllII[1]];
                        nArray8[A.llllllllII[0]] = llllllllII[24];
                        if (A.llIllIIIlIIlI(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                            int[] nArray9 = new int[llllllllII[1]];
                            nArray9[A.llllllllII[0]] = llllllllII[46];
                            if (A.llIllIIIlIIlI(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                gz = llllllllII[1];
                            }
                        }
                        if (A.llIllIIIlIIlI(gz ? 1 : 0)) {
                            String[] stringArray = new String[llllllllII[1]];
                            stringArray[A.llllllllII[0]] = lllllllIII[llllllllII[47]];
                            if (A.llIllIIIlIlII(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                                int[] nArray10 = new int[llllllllII[1]];
                                nArray10[A.llllllllII[0]] = llllllllII[48];
                                if (A.llIllIIIlIlII(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                                    String[] stringArray15 = new String[llllllllII[1]];
                                    stringArray15[A.llllllllII[0]] = lllllllIII[llllllllII[49]];
                                    if (A.llIllIIIlIlII(Inventory.contains((String[])stringArray15) ? 1 : 0)) {
                                        A.bY();
                                    }
                                    String[] stringArray16 = new String[llllllllII[1]];
                                    stringArray16[A.llllllllII[0]] = lllllllIII[llllllllII[50]];
                                    if (A.llIllIIIlIIlI(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                                        if (A.llIllIIIllIII(Players.getLocal().getWorldLocation().distanceTo(gE), llllllllII[3])) {
                                            AccBuilderTempleTrek.c = lllllllIII[llllllllII[51]];
                                            Movement.walkTo((WorldPoint)gE);
                                            "".length();
                                            Time.sleepTicks((int)llllllllII[1]);
                                            "".length();
                                        }
                                        if (A.llIllIIIllIIl(Players.getLocal().getWorldLocation().distanceTo(gE), llllllllII[3])) {
                                            g.a(lllllllIII[llllllllII[52]], bQ);
                                        }
                                    }
                                }
                            }
                        }
                        if (A.llIllIIIlIIlI(gz ? 1 : 0)) {
                            int[] nArray11 = new int[llllllllII[1]];
                            nArray11[A.llllllllII[0]] = llllllllII[48];
                            if (A.llIllIIIlIIlI(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                String[] stringArray = new String[llllllllII[1]];
                                stringArray[A.llllllllII[0]] = lllllllIII[llllllllII[53]];
                                if (A.llIllIIIlIlII(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                                    int[] nArray12 = new int[llllllllII[1]];
                                    nArray12[A.llllllllII[0]] = llllllllII[24];
                                    if (A.llIllIIIlIlII(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                        A.bY();
                                    }
                                    int[] nArray13 = new int[llllllllII[1]];
                                    nArray13[A.llllllllII[0]] = llllllllII[24];
                                    if (A.llIllIIIlIIlI(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                        lllllllllllllllllIlIIIIlllIIIllI = new WorldArea(llllllllII[21], llllllllII[22], llllllllII[19], llllllllII[18], llllllllII[0]);
                                        if (A.llIllIIIlIlII(lllllllllllllllllIlIIIIlllIIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderTempleTrek.c = lllllllIII[llllllllII[54]];
                                            Movement.walkTo((WorldPoint)gA);
                                            "".length();
                                            Time.sleepTicks((int)llllllllII[1]);
                                            "".length();
                                        }
                                        if (A.llIllIIIlIIlI(lllllllllllllllllIlIIIIlllIIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            g.a(lllllllIII[llllllllII[55]], bQ);
                                        }
                                    }
                                }
                            }
                        }
                        String[] stringArray = new String[llllllllII[1]];
                        stringArray[A.llllllllII[0]] = lllllllIII[llllllllII[56]];
                        if (!A.llIllIIIlIIlI(Equipment.contains((String[])stringArray) ? 1 : 0)) break block78;
                        String[] stringArray17 = new String[llllllllII[1]];
                        stringArray17[A.llllllllII[0]] = lllllllIII[llllllllII[57]];
                        if (A.llIllIIIlllII(NPCs.getNearest((String[])stringArray17))) {
                            String[] stringArray18 = new String[llllllllII[1]];
                            stringArray18[A.llllllllII[0]] = lllllllIII[llllllllII[58]];
                            if (A.llIllIIIlllII(NPCs.getNearest((String[])stringArray18))) {
                                AccBuilderTempleTrek.c = lllllllIII[llllllllII[59]];
                                Movement.walkTo((WorldPoint)gF);
                                "".length();
                                Time.sleepTicks((int)llllllllII[1]);
                                "".length();
                            }
                        }
                        String[] stringArray19 = new String[llllllllII[1]];
                        stringArray19[A.llllllllII[0]] = lllllllIII[llllllllII[60]];
                        if (!A.llIllIIIlllII(NPCs.getNearest((String[])stringArray19))) break block79;
                        String[] stringArray20 = new String[llllllllII[1]];
                        stringArray20[A.llllllllII[0]] = lllllllIII[llllllllII[61]];
                        if (!A.llIllIIIlIlIl(NPCs.getNearest((String[])stringArray20))) break block80;
                    }
                    if (A.llIllIIIlllII(gG)) {
                        A.bX();
                    }
                    if (A.llIllIIIlIlIl(lllllllllllllllllIlIIIIlllIIIllI = NPCs.getNearest(nPC -> {
                        int n2;
                        if (A.llIllIIIlIIlI(nPC.getName().contains(lllllllIII[llllllllII[89]]) ? 1 : 0) && A.llIllIIIllllI(nPC.getInteracting(), Players.getLocal())) {
                            n2 = llllllllII[1];
                            "".length();
                            if (null != null) {
                                return ((0x9D ^ 0x86 ^ (0x6D ^ 0x68)) & (0x44 ^ 0x2A ^ (0x5A ^ 0x2A) ^ -" ".length())) != 0;
                            }
                        } else {
                            n2 = llllllllII[0];
                        }
                        return n2 != 0;
                    })) && A.llIllIIIlllII(Players.getLocal().getInteracting())) {
                        lllllllllllllllllIlIIIIlllIIIllI.interact(lllllllIII[llllllllII[62]]);
                        Time.sleepTicks((int)llllllllII[3]);
                        "".length();
                    }
                    if (A.llIllIIIlllII(lllllllllllllllllIlIIIIlllIIIllI) && A.llIllIIIlllII(Players.getLocal().getInteracting())) {
                        String[] stringArray = new String[llllllllII[1]];
                        stringArray[A.llllllllII[0]] = lllllllIII[llllllllII[63]];
                        if (A.llIllIIIlIlIl(NPCs.getNearest((String[])stringArray))) {
                            String[] stringArray21 = new String[llllllllII[1]];
                            stringArray21[A.llllllllII[0]] = lllllllIII[llllllllII[15]];
                            if (A.llIllIIIlIlII(NPCs.getNearest((String[])stringArray21).isDead() ? 1 : 0) && A.llIllIIIlIlII(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray22 = new String[llllllllII[1]];
                                stringArray22[A.llllllllII[0]] = lllllllIII[llllllllII[64]];
                                NPCs.getNearest((String[])stringArray22).interact(lllllllIII[llllllllII[65]]);
                            }
                        }
                    }
                    if (A.llIllIIIlIIlI(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllllllIII[llllllllII[66]];
                        List lllllllllllllllllIlIIIIlllIIIlIl = Dialog.getOptions();
                        if (A.llIllIIIlIlII(lllllllllllllllllIlIIIIlllIIIlIl.isEmpty() ? 1 : 0)) {
                            int lllllllllllllllllIlIIIIlllIIIlII = llllllllII[0];
                            while (A.llIllIIIlIIll(lllllllllllllllllIlIIIIlllIIIlII, lllllllllllllllllIlIIIIlllIIIlIl.size())) {
                                if (A.llIllIIIlIIlI(((Widget)lllllllllllllllllIlIIIIlllIIIlIl.get(lllllllllllllllllIlIIIIlllIIIlII)).getText().contains(lllllllIII[llllllllII[67]]) ? 1 : 0)) {
                                    String[] stringArray = new String[llllllllII[1]];
                                    stringArray[A.llllllllII[0]] = ((Widget)lllllllllllllllllIlIIIIlllIIIlIl.get(lllllllllllllllllIlIIIIlllIIIlII)).getText();
                                    Dialog.chooseOption((String[])stringArray);
                                    "".length();
                                    Time.sleepTicks((int)llllllllII[3]);
                                    "".length();
                                    "".length();
                                    if ("  ".length() != ((0x44 ^ 0x5F) & ~(8 ^ 0x13))) break;
                                    return;
                                }
                                ++lllllllllllllllllIlIIIIlllIIIlII;
                                "".length();
                                if (" ".length() != 0) continue;
                                return;
                            }
                        }
                    }
                }
                String[] stringArray = new String[llllllllII[1]];
                stringArray[A.llllllllII[0]] = lllllllIII[llllllllII[68]];
                if (A.llIllIIIlIlIl(NPCs.getNearest((String[])stringArray))) {
                    if (A.llIllIIIlIIll(ck, llllllllII[1]) && A.llIllIIIlIlII(cl ? 1 : 0)) {
                        ac.mZ += llllllllII[1];
                        ac.d(AccBuilderTempleTrek.m);
                        ck += llllllllII[1];
                        ac.mZ = llllllllII[0];
                        cl = llllllllII[1];
                    }
                    if (A.llIllIIIlIIlI(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllllllIII[llllllllII[69]];
                        lllllllllllllllllIlIIIIlllIIIllI = Dialog.getOptions();
                        if (A.llIllIIIlIlII(lllllllllllllllllIlIIIIlllIIIllI.isEmpty() ? 1 : 0)) {
                            int lllllllllllllllllIlIIIIlllIIIlIl = llllllllII[0];
                            while (A.llIllIIIlIIll(lllllllllllllllllIlIIIIlllIIIlIl, lllllllllllllllllIlIIIIlllIIIllI.size())) {
                                String lllllllllllllllllIlIIIIlllIIIlII = gG[lllllllllllllllllIlIIIIlllIIIlIl];
                                int lllllllllllllllllIlIIIIlllIIIIll = llllllllII[0];
                                while (A.llIllIIIlIIll(lllllllllllllllllIlIIIIlllIIIIll, lllllllllllllllllIlIIIIlllIIIllI.size())) {
                                    if (A.llIllIIIlIIlI(((Widget)lllllllllllllllllIlIIIIlllIIIllI.get(lllllllllllllllllIlIIIIlllIIIIll)).getText().contains(lllllllllllllllllIlIIIIlllIIIlII) ? 1 : 0)) {
                                        System.out.println("Selecting: " + ((Widget)lllllllllllllllllIlIIIIlllIIIllI.get(lllllllllllllllllIlIIIIlllIIIIll)).getText());
                                        Time.sleepTicks((int)llllllllII[3]);
                                        "".length();
                                        String[] stringArray23 = new String[llllllllII[1]];
                                        stringArray23[A.llllllllII[0]] = ((Widget)lllllllllllllllllIlIIIIlllIIIllI.get(lllllllllllllllllIlIIIIlllIIIIll)).getText();
                                        Dialog.chooseOption((String[])stringArray23);
                                        "".length();
                                        Time.sleepTicks((int)llllllllII[12]);
                                        "".length();
                                        "".length();
                                        if ("   ".length() > " ".length()) break;
                                        return;
                                    }
                                    ++lllllllllllllllllIlIIIIlllIIIIll;
                                    "".length();
                                    if ((0x77 ^ 0x3E ^ (0xDF ^ 0x92)) != "  ".length()) continue;
                                    return;
                                }
                                ++lllllllllllllllllIlIIIIlllIIIlIl;
                                "".length();
                                if ("  ".length() > 0) continue;
                                return;
                            }
                        }
                    }
                }
            }
            g.a(bQ);
        }
    }

    private static boolean llIllIIIlIIlI(int n2) {
        return n2 != 0;
    }

    static {
        A.llIllIIIlIIII();
        A.llIllIIIIllll();
        gy = lllllllIII[llllllllII[90]];
        gx = new B();
        bu = new ArrayList<d>();
        gf = new WorldPoint(llllllllII[91], llllllllII[92], llllllllII[0]);
        gA = new WorldPoint(llllllllII[93], llllllllII[94], llllllllII[0]);
        gB = new WorldPoint(llllllllII[93], llllllllII[95], llllllllII[3]);
        gC = new WorldPoint(llllllllII[96], llllllllII[97], llllllllII[0]);
        gD = new WorldPoint(llllllllII[96], llllllllII[98], llllllllII[0]);
        gE = new WorldPoint(llllllllII[99], llllllllII[100], llllllllII[1]);
        gF = new WorldPoint(llllllllII[101], llllllllII[102], llllllllII[0]);
        String[] stringArray = new String[llllllllII[31]];
        stringArray[A.llllllllII[0]] = lllllllIII[llllllllII[103]];
        stringArray[A.llllllllII[1]] = lllllllIII[llllllllII[104]];
        stringArray[A.llllllllII[3]] = lllllllIII[llllllllII[105]];
        stringArray[A.llllllllII[5]] = lllllllIII[llllllllII[106]];
        stringArray[A.llllllllII[4]] = lllllllIII[llllllllII[107]];
        stringArray[A.llllllllII[10]] = lllllllIII[llllllllII[108]];
        stringArray[A.llllllllII[16]] = lllllllIII[llllllllII[109]];
        stringArray[A.llllllllII[18]] = lllllllIII[llllllllII[110]];
        stringArray[A.llllllllII[19]] = lllllllIII[llllllllII[111]];
        stringArray[A.llllllllII[20]] = lllllllIII[llllllllII[112]];
        stringArray[A.llllllllII[12]] = lllllllIII[llllllllII[113]];
        stringArray[A.llllllllII[23]] = lllllllIII[llllllllII[114]];
        stringArray[A.llllllllII[25]] = lllllllIII[llllllllII[115]];
        stringArray[A.llllllllII[26]] = lllllllIII[llllllllII[116]];
        stringArray[A.llllllllII[27]] = lllllllIII[llllllllII[117]];
        stringArray[A.llllllllII[28]] = lllllllIII[llllllllII[118]];
        stringArray[A.llllllllII[29]] = lllllllIII[llllllllII[119]];
        stringArray[A.llllllllII[30]] = lllllllIII[llllllllII[120]];
        bQ = stringArray;
    }

    @Override
    public boolean S() {
        return llllllllII[0];
    }

    private static boolean llIllIIIlIlII(int n2) {
        return n2 == 0;
    }

    private static boolean llIllIIIlIlll(int n2) {
        return n2 < 0;
    }

    private static boolean llIllIIIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIlIllllllIl(String lllllllllllllllllIlIIIIllIIlIllI, String lllllllllllllllllIlIIIIllIIlIlIl) {
        lllllllllllllllllIlIIIIllIIlIllI = new String(Base64.getDecoder().decode(lllllllllllllllllIlIIIIllIIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIIIIllIIllIIl = new StringBuilder();
        char[] lllllllllllllllllIlIIIIllIIllIII = lllllllllllllllllIlIIIIllIIlIlIl.toCharArray();
        int lllllllllllllllllIlIIIIllIIlIlll = llllllllII[0];
        char[] lllllllllllllllllIlIIIIllIIlIIIl = lllllllllllllllllIlIIIIllIIlIllI.toCharArray();
        int lllllllllllllllllIlIIIIllIIlIIII = lllllllllllllllllIlIIIIllIIlIIIl.length;
        int lllllllllllllllllIlIIIIllIIIllll = llllllllII[0];
        while (A.llIllIIIlIIll(lllllllllllllllllIlIIIIllIIIllll, lllllllllllllllllIlIIIIllIIlIIII)) {
            char lllllllllllllllllIlIIIIllIIlllII = lllllllllllllllllIlIIIIllIIlIIIl[lllllllllllllllllIlIIIIllIIIllll];
            lllllllllllllllllIlIIIIllIIllIIl.append((char)(lllllllllllllllllIlIIIIllIIlllII ^ lllllllllllllllllIlIIIIllIIllIII[lllllllllllllllllIlIIIIllIIlIlll % lllllllllllllllllIlIIIIllIIllIII.length]));
            "".length();
            ++lllllllllllllllllIlIIIIllIIlIlll;
            ++lllllllllllllllllIlIIIIllIIIllll;
            "".length();
            if (-" ".length() < "   ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIlIIIIllIIllIIl);
    }

    private static void ae() {
        block17: {
            d lllllllllllllllllIlIIIIllIllIlll;
            block16: {
                block15: {
                    block14: {
                        Object lllllllllllllllllIlIIIIllIlllIII;
                        block13: {
                            block12: {
                                int[] nArray = new int[llllllllII[1]];
                                nArray[A.llllllllII[0]] = llllllllII[7];
                                if (!A.llIllIIIlIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block12;
                                int[] nArray2 = new int[llllllllII[1]];
                                nArray2[A.llllllllII[0]] = llllllllII[7];
                                if (!A.llIllIIIlIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) break block13;
                                int[] nArray3 = new int[llllllllII[1]];
                                nArray3[A.llllllllII[0]] = llllllllII[7];
                                if (!A.llIllIIIlIIll(Bank.getFirst((int[])nArray3).getQuantity(), llllllllII[9])) break block13;
                            }
                            lllllllllllllllllIlIIIIllIlllIII = new d(llllllllII[7], llllllllII[9], llllllllII[80]);
                            bu.add((d)lllllllllllllllllIlIIIIllIlllIII);
                            "".length();
                        }
                        int[] nArray = new int[llllllllII[1]];
                        nArray[A.llllllllII[0]] = llllllllII[8];
                        if (A.llIllIIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            lllllllllllllllllIlIIIIllIlllIII = new d(llllllllII[8], llllllllII[1], llllllllII[81]);
                            bu.add((d)lllllllllllllllllIlIIIIllIlllIII);
                            "".length();
                        }
                        if (A.llIllIIIlIlII(Bank.contains((Predicate)(lllllllllllllllllIlIIIIllIlllIII = item -> item.getName().toLowerCase().contains(lllllllIII[llllllllII[88]]))) ? 1 : 0)) {
                            lllllllllllllllllIlIIIIllIllIlll = new d(llllllllII[82], llllllllII[10], llllllllII[83]);
                            bu.add(lllllllllllllllllIlIIIIllIllIlll);
                            "".length();
                        }
                        int[] nArray4 = new int[llllllllII[1]];
                        nArray4[A.llllllllII[0]] = llllllllII[17];
                        if (!A.llIllIIIlIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) break block14;
                        int[] nArray5 = new int[llllllllII[1]];
                        nArray5[A.llllllllII[0]] = llllllllII[17];
                        if (!A.llIllIIIlIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) break block15;
                        int[] nArray6 = new int[llllllllII[1]];
                        nArray6[A.llllllllII[0]] = llllllllII[17];
                        if (!A.llIllIIIlIIll(Bank.getFirst((int[])nArray6).getQuantity(), llllllllII[10])) break block15;
                    }
                    lllllllllllllllllIlIIIIllIllIlll = new d(llllllllII[17], llllllllII[12], llllllllII[84]);
                    bu.add(lllllllllllllllllIlIIIIllIllIlll);
                    "".length();
                }
                int[] nArray = new int[llllllllII[1]];
                nArray[A.llllllllII[0]] = llllllllII[11];
                if (A.llIllIIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    lllllllllllllllllIlIIIIllIllIlll = new d(llllllllII[11], llllllllII[4], i.bp);
                    bu.add(lllllllllllllllllIlIIIIllIllIlll);
                    "".length();
                }
                int[] nArray7 = new int[llllllllII[1]];
                nArray7[A.llllllllII[0]] = llllllllII[6];
                if (!A.llIllIIIlIIlI(Bank.contains((int[])nArray7) ? 1 : 0)) break block16;
                int[] nArray8 = new int[llllllllII[1]];
                nArray8[A.llllllllII[0]] = llllllllII[6];
                if (!A.llIllIIIlIIlI(Bank.contains((int[])nArray8) ? 1 : 0)) break block17;
                int[] nArray9 = new int[llllllllII[1]];
                nArray9[A.llllllllII[0]] = llllllllII[6];
                if (!A.llIllIIIlIIll(Bank.getFirst((int[])nArray9).getQuantity(), llllllllII[28])) break block17;
            }
            lllllllllllllllllIlIIIIllIllIlll = new d(llllllllII[6], llllllllII[54], llllllllII[85]);
            bu.add(lllllllllllllllllIlIIIIllIllIlll);
            "".length();
        }
    }

    private static boolean llIllIIIllIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIllIIIllIll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIllIIIlllII(Object object) {
        return object == null;
    }

    private static boolean llIllIIIlllIl(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public int T() {
        try {
            A.bW();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-"   ".length() >= 0) {
            return (0x65 ^ 0x6C) & ~(0x28 ^ 0x21);
        }
        return llllllllII[86];
    }

    private static void llIllIIIlIIII() {
        llllllllII = new int[122];
        A.llllllllII[0] = (0x62 ^ 1) & ~(0x51 ^ 0x32);
        A.llllllllII[1] = " ".length();
        A.llllllllII[2] = 0xFFFFF7FB & 0x1B8C;
        A.llllllllII[3] = "  ".length();
        A.llllllllII[4] = 0xB5 ^ 0xB1;
        A.llllllllII[5] = "   ".length();
        A.llllllllII[6] = -(0xFFFFF2D5 & 0x6D3B) & (0xFFFFFFFF & 0x7F57);
        A.llllllllII[7] = 0xFFFFE2CF & 0x1F3E;
        A.llllllllII[8] = -(0xFFFFFF7D & 0x28F3) & (0xFFFFAFFD & 0x7FFB);
        A.llllllllII[9] = 0x50 ^ 0x49;
        A.llllllllII[10] = 0x8F ^ 0x8A;
        A.llllllllII[11] = 0xFFFFFF5D & 0x31F3;
        A.llllllllII[12] = 0xBB ^ 0x90 ^ (0xE3 ^ 0xC2);
        A.llllllllII[13] = 0xFFFF8FE3 & 0x73FF;
        A.llllllllII[14] = -(0xFFFF9453 & 0x7BAF) & (0xFFFF9FFF & 0x73EA);
        A.llllllllII[15] = 0x2D ^ 0xD ^ (0x9E ^ 0x8C);
        A.llllllllII[16] = 0xF ^ 0x43 ^ (0x8B ^ 0xC1);
        A.llllllllII[17] = -(0xFFFFDE37 & 0x3BC9) & (0xFFFFDFFF & 0x3B7B);
        A.llllllllII[18] = " ".length() ^ (0x8F ^ 0x89);
        A.llllllllII[19] = 0xB7 ^ 0x98 ^ (0x49 ^ 0x6E);
        A.llllllllII[20] = 0x8F ^ 0x86;
        A.llllllllII[21] = 0xFFFF9C7F & 0x6FFF;
        A.llllllllII[22] = -(0xFFFFDE37 & 0x73CB) & (0xFFFFDF9F & 0x7FEF);
        A.llllllllII[23] = 0xB1 ^ 0xBA;
        A.llllllllII[24] = 0xFFFFF971 & 0xFEE;
        A.llllllllII[25] = 0x49 ^ 0xF ^ (0xD ^ 0x47);
        A.llllllllII[26] = 0x69 ^ 0x4E ^ (0x3E ^ 0x14);
        A.llllllllII[27] = 0x91 ^ 0x9F;
        A.llllllllII[28] = 0x1B ^ 0x5E ^ (0xDC ^ 0x96);
        A.llllllllII[29] = 0x15 ^ 5;
        A.llllllllII[30] = 0x9D ^ 0x8C;
        A.llllllllII[31] = 164 + 136 - 219 + 87 ^ 56 + 12 - 64 + 182;
        A.llllllllII[32] = 8 ^ 0x1B;
        A.llllllllII[33] = 0x51 ^ 0x45;
        A.llllllllII[34] = 0xBE ^ 0xAB;
        A.llllllllII[35] = 0x4A ^ 0x5C;
        A.llllllllII[36] = 0x25 ^ 0x32;
        A.llllllllII[37] = 8 ^ 0x39 ^ (0x2B ^ 2);
        A.llllllllII[38] = 203 + 78 - 206 + 141 ^ 163 + 110 - 257 + 178;
        A.llllllllII[39] = 0x4C ^ 0x57;
        A.llllllllII[40] = 0x8C ^ 0x90;
        A.llllllllII[41] = 0x57 ^ 0x4A;
        A.llllllllII[42] = 0x51 ^ 0x4F;
        A.llllllllII[43] = 0x74 ^ 0x6B;
        A.llllllllII[44] = 0x2D ^ 0xD;
        A.llllllllII[45] = 0x2C ^ 0xD;
        A.llllllllII[46] = 0xFFFFABFD & 0x5D63;
        A.llllllllII[47] = 47 + 69 - 67 + 110 ^ 88 + 170 - 101 + 32;
        A.llllllllII[48] = 0xFFFFABDF & 0x5D7F;
        A.llllllllII[49] = 0x29 ^ 0xA;
        A.llllllllII[50] = 0xB4 ^ 0x93 ^ "   ".length();
        A.llllllllII[51] = 0xB7 ^ 0x92;
        A.llllllllII[52] = 0x65 ^ 4 ^ (0xE1 ^ 0xA6);
        A.llllllllII[53] = 0x33 ^ 0x14;
        A.llllllllII[54] = 0xB7 ^ 0x9F;
        A.llllllllII[55] = 151 + 52 - 150 + 138 ^ 43 + 115 - 97 + 89;
        A.llllllllII[56] = 1 ^ 0x2B;
        A.llllllllII[57] = 0x31 ^ 0x1A;
        A.llllllllII[58] = 0x99 ^ 0xB5;
        A.llllllllII[59] = 0x56 ^ 0x21 ^ (0xC9 ^ 0x93);
        A.llllllllII[60] = 0x88 ^ 0xA6;
        A.llllllllII[61] = 59 + 144 - 115 + 86 ^ 98 + 86 - 73 + 18;
        A.llllllllII[62] = 0x9F ^ 0xAF;
        A.llllllllII[63] = 6 ^ 0x57 ^ (0xF2 ^ 0x92);
        A.llllllllII[64] = 0x98 ^ 0xAD ^ (0x33 ^ 0x35);
        A.llllllllII[65] = 0x65 ^ 0x51;
        A.llllllllII[66] = 0x9F ^ 0xAA;
        A.llllllllII[67] = 0x70 ^ 0x46;
        A.llllllllII[68] = 0x29 ^ 0x1E;
        A.llllllllII[69] = 0xFA ^ 0xC2;
        A.llllllllII[70] = -(0xFFFFF163 & 0x7FBD) & (0xFFFFFF63 & 0x7BBE);
        A.llllllllII[71] = 0xFFFFBFAB & 0x4A57;
        A.llllllllII[72] = 0xFFFFEEB6 & 0x1B4D;
        A.llllllllII[73] = 0xFFFFAB25 & 0x5EDF;
        A.llllllllII[74] = 0xFFFF9E8E & 0x6B77;
        A.llllllllII[75] = 0x9F ^ 0xA6;
        A.llllllllII[76] = 0x72 ^ 0x48;
        A.llllllllII[77] = 0x66 ^ 0x5D;
        A.llllllllII[78] = 0xFFFFF557 & 0x3BFB;
        A.llllllllII[79] = 0xB8 ^ 0x84;
        A.llllllllII[80] = -(0xFFFFFC32 & 0xBCF) & (0xFFFFAF97 & 0x5AFD);
        A.llllllllII[81] = 0xFFFFAFC2 & 0x57BD;
        A.llllllllII[82] = -(0xFFFF9BFB & 0x7527) & (0xFFFFBFFF & 0x7FEE);
        A.llllllllII[83] = 0xFFFFEDEC & 0x73BB;
        A.llllllllII[84] = -(0xFFFFAF7E & 0x7CD5) & (0xFFFFAD7F & Short.MAX_VALUE);
        A.llllllllII[85] = 0xFFFFC7FD & 0x3F6E;
        A.llllllllII[86] = 0xAB ^ 0x84 ^ (0xCA ^ 0x81);
        A.llllllllII[87] = 0x2A ^ 0x40 ^ (0x32 ^ 0x65);
        A.llllllllII[88] = 0x6E ^ 0x70 ^ (0x5B ^ 0x7B);
        A.llllllllII[89] = 0x30 ^ 3 ^ (9 ^ 5);
        A.llllllllII[90] = 44 + 77 - 58 + 72 ^ 62 + 128 - 107 + 116;
        A.llllllllII[91] = -(0xFFFFFFF5 & 0x527F) & (0xFFFFDFF7 & 0x7EFF);
        A.llllllllII[92] = -(0xFFFF83FB & 0x7E9F) & (0xFFFFCFFF & 0x3FFA);
        A.llllllllII[93] = -(0xFFFFF031 & 0x6FCF) & (0xFFFFEEBC & 0x7DC7);
        A.llllllllII[94] = -(0xFFFFABBF & 0x7667) & (0xFFFFFFFF & 0x2FB6);
        A.llllllllII[95] = -(0xE ^ 0x59) & (0xFFFFCDFF & 0x3FFF);
        A.llllllllII[96] = 0xFFFFECDB & 0x1FBE;
        A.llllllllII[97] = 0xFFFFEFAE & 0x1DF9;
        A.llllllllII[98] = -(0xFFFFD9E7 & 0x6E5D) & (0xFFFFFEED & 0x6FFF);
        A.llllllllII[99] = -(0xFFFFDBF3 & 0x66CF) & (0xFFFFDFFF & 0x6EEB);
        A.llllllllII[100] = 0xFFFFCEFE & 0x3D5B;
        A.llllllllII[101] = -(0xFFFFEFA1 & 0x727F) & (0xFFFFFFFF & 0x6EBB);
        A.llllllllII[102] = -(0xFFFFFA57 & 0x55F9) & (0xFFFFFF7F & 0x5DFB);
        A.llllllllII[103] = 0xDF ^ 0xBB ^ (0xAE ^ 0x8B);
        A.llllllllII[104] = 0x26 ^ 0x64;
        A.llllllllII[105] = 116 + 191 - 269 + 201 ^ 59 + 107 - 28 + 34;
        A.llllllllII[106] = 0xC2 ^ 0x86;
        A.llllllllII[107] = 180 + 97 - 226 + 162 ^ 64 + 21 - 29 + 88;
        A.llllllllII[108] = 0x47 ^ 1;
        A.llllllllII[109] = 0x49 ^ 0xE ^ (0x71 ^ 0x41) & ~(0x10 ^ 0x20);
        A.llllllllII[110] = 0x28 ^ 0x36 ^ (0x51 ^ 7);
        A.llllllllII[111] = 0x14 ^ 0x5D;
        A.llllllllII[112] = 0xDD ^ 0x9A ^ (0x1D ^ 0x10);
        A.llllllllII[113] = 0x5A ^ 0x11;
        A.llllllllII[114] = 0x47 ^ 0xB;
        A.llllllllII[115] = 0x4B ^ 3 ^ (0x1C ^ 0x19);
        A.llllllllII[116] = 0 ^ 0x4C ^ "  ".length();
        A.llllllllII[117] = 0xCA ^ 0x85;
        A.llllllllII[118] = 0x2A ^ 6 ^ (0xC ^ 0x70);
        A.llllllllII[119] = 0xEF ^ 0xB6 ^ (0x69 ^ 0x61);
        A.llllllllII[120] = 0xF ^ 0x5D;
        A.llllllllII[121] = 0x3A ^ 0x69;
    }

    private static void llIllIIIIllll() {
        lllllllIII = new String[llllllllII[121]];
        A.lllllllIII[A.llllllllII[0]] = A.llIlIllllllII("+t9bpCjERCNszs5zw372oI3LYuSthTRoCBuswdHv7QuYxJt86oO8bMPPkXrLZDxb", "wHgZm");
        A.lllllllIII[A.llllllllII[1]] = A.llIlIllllllIl("JxkSWjMGWAYbKQI=", "ixdzG");
        A.lllllllIII[A.llllllllII[3]] = A.llIlIllllllIl("GAopDg45BSBKADEFLAMMNw==", "PkGjb");
        A.lllllllIII[A.llllllllII[5]] = A.llIlIllllllIl("OBdnABAKUioIERwbKQZCHgciEhZPATIREgMbIhJOTwEwCBYMGi4PBU8GKEEgOisOLyU=", "orGab");
        A.lllllllIII[A.llllllllII[4]] = A.llIlIllllllIl("GhxCFhYoWQ8eFz4QDBBEPAwHBBBtChcHFCEQBwRIbQoVHhAuEQsZA20NDVcmGCArOSM=", "Mybwd");
        A.lllllllIII[A.llllllllII[10]] = A.llIlIllllllIl("GRYmNw==", "NsGEU");
        A.lllllllIII[A.llllllllII[16]] = A.llIlIllllllII("ayyP72FQ+ec=", "Xamhl");
        A.lllllllIII[A.llllllllII[18]] = A.llIlIllllllIl("MwQi", "veVOf");
        A.lllllllIII[A.llllllllII[19]] = A.llIlIllllllIl("OAMBcQEZQgQlFAQW", "vbwQu");
        A.lllllllIII[A.llllllllII[20]] = A.llIlIllllllII("6KmZtNt3FFM=", "wfgqB");
        A.lllllllIII[A.llllllllII[12]] = A.llIlIllllllIl("ARMEYzggUgEqPm8CCzE/Jhw=", "OrrCL");
        A.lllllllIII[A.llllllllII[23]] = A.llIlIllllllIl("NAs0RBgVGzUNJg==", "gbFdH");
        A.lllllllIII[A.llllllllII[25]] = A.llIlIllllllII("E4oz/86qHCNeWNOnouE99Q==", "kkHeI");
        A.lllllllIII[A.llllllllII[26]] = A.llIlIllllllIl("LQgbdxsMSQ42HxcIBDk=", "cimWo");
        A.lllllllIII[A.llllllllII[27]] = A.llIlIlllllllI("070ccSIb5Il/ejU/h7dhRg==", "vpoST");
        A.lllllllIII[A.llllllllII[28]] = A.llIlIllllllIl("DSY5MgQ7czU/QTgyLjwT", "OSZYa");
        A.lllllllIII[A.llllllllII[29]] = A.llIlIllllllII("d4ewFsPo7A3TiMfRnb37+A==", "vXoex");
        A.lllllllIII[A.llllllllII[30]] = A.llIlIlllllllI("k6QQDwMB6Wr/F2iHzDi4nQ==", "hHyTF");
        A.lllllllIII[A.llllllllII[31]] = A.llIlIllllllIl("NRkEAgg=", "qkekf");
        A.lllllllIII[A.llllllllII[32]] = A.llIlIllllllII("eH4F+ZuW6/YPej54VFs4wQ==", "yYKvP");
        A.lllllllIII[A.llllllllII[33]] = A.llIlIlllllllI("JhCw3TD4HvVDiIMAun2tIzFyQUr9REwu", "tfOEx");
        A.lllllllIII[A.llllllllII[34]] = A.llIlIllllllIl("ADkZIRkhPQ==", "MXwIv");
        A.lllllllIII[A.llllllllII[35]] = A.llIlIlllllllI("4Hat8GafyII=", "rAcca");
        A.lllllllIII[A.llllllllII[36]] = A.llIlIllllllIl("GRsmCg==", "VkCdy");
        A.lllllllIII[A.llllllllII[37]] = A.llIlIllllllIl("DiYDOCcvIg==", "CGmPH");
        A.lllllllIII[A.llllllllII[9]] = A.llIlIllllllIl("NgIBCQ==", "yrdgJ");
        A.lllllllIII[A.llllllllII[38]] = A.llIlIlllllllI("ncNdkOnbjk8=", "JFxLx");
        A.lllllllIII[A.llllllllII[39]] = A.llIlIlllllllI("lYumBvhtMJI=", "rnZIQ");
        A.lllllllIII[A.llllllllII[40]] = A.llIlIllllllII("WtZswQ0Qq9VFR5+XrERytA==", "qXlhP");
        A.lllllllIII[A.llllllllII[41]] = A.llIlIlllllllI("+42Szzn4JW4=", "qNlxx");
        A.lllllllIII[A.llllllllII[42]] = A.llIlIlllllllI("1dIiRmi5WOhRiO6r/Glpgg==", "zxzfG");
        A.lllllllIII[A.llllllllII[43]] = A.llIlIllllllII("6hn01q2fLL+MNdAb9cjxpg==", "mLoCz");
        A.lllllllIII[A.llllllllII[44]] = A.llIlIllllllIl("CgQdDTR4GgsA", "XqnyM");
        A.lllllllIII[A.llllllllII[45]] = A.llIlIllllllII("ZbxyM+UeLOg=", "OWewY");
        A.lllllllIII[A.llllllllII[47]] = A.llIlIllllllIl("PSw6ESQcKT8AKRo=", "nEVgA");
        A.lllllllIII[A.llllllllII[49]] = A.llIlIllllllII("o9lgRsqrnls=", "aIzbU");
        A.lllllllIII[A.llllllllII[50]] = A.llIlIlllllllI("jWxDYmjnFaE=", "oirKy");
        A.lllllllIII[A.llllllllII[51]] = A.llIlIlllllllI("g4pPb/Y/gPMXRRzbHftQfg==", "ZhrGh");
        A.lllllllIII[A.llllllllII[52]] = A.llIlIllllllIl("JiMfBjUVajEVJhgoChUp", "qJegG");
        A.lllllllIII[A.llllllllII[53]] = A.llIlIlllllllI("ATZp34erdgVShCNkZqsG5Q==", "xDKXe");
        A.lllllllIII[A.llllllllII[54]] = A.llIlIllllllIl("Oww7YxMaTT4qFVUdNDEUHAM=", "umMCg");
        A.lllllllIII[A.llllllllII[55]] = A.llIlIlllllllI("jFUdCxfBAlxgDM5Z3hO2kg==", "yGpxc");
        A.lllllllIII[A.llllllllII[56]] = A.llIlIllllllII("kiPDTriz1yqF/K80mPlXDQ==", "UbElz");
        A.lllllllIII[A.llllllllII[57]] = A.llIlIllllllII("9852y8771zo=", "FoEEM");
        A.lllllllIII[A.llllllllII[58]] = A.llIlIlllllllI("lD7+R4wbZDcNpjPb82FsXsHlmGmSid2O", "AJKez");
        A.lllllllIII[A.llllllllII[59]] = A.llIlIllllllIl("CyYwcwEqZyI2GCop", "EGFSu");
        A.lllllllIII[A.llllllllII[60]] = A.llIlIllllllIl("AwwDCAQzAQ==", "Giozm");
        A.lllllllIII[A.llllllllII[61]] = A.llIlIlllllllI("7ESo/zU4ixYPtDP+7W66Hk2mSzv/kAao", "bNJZG");
        A.lllllllIII[A.llllllllII[62]] = A.llIlIllllllII("BY2MzYVjMjc=", "gwDqu");
        A.lllllllIII[A.llllllllII[63]] = A.llIlIllllllIl("KisaEQoaJg==", "nNvcc");
        A.lllllllIII[A.llllllllII[15]] = A.llIlIlllllllI("m1NLeCILakY=", "HWYQu");
        A.lllllllIII[A.llllllllII[64]] = A.llIlIllllllII("AR4dEYHLtVA=", "LYqmk");
        A.lllllllIII[A.llllllllII[65]] = A.llIlIllllllII("G3rZq01WOSs=", "Bqdbn");
        A.lllllllIII[A.llllllllII[66]] = A.llIlIllllllII("7RkALeH/9P5VVbwAo8lpXQ==", "CGnWp");
        A.lllllllIII[A.llllllllII[67]] = A.llIlIllllllII("WAHf399iXFs=", "OkEwJ");
        A.lllllllIII[A.llllllllII[68]] = A.llIlIllllllII("vXs6oP3ZZ0CEnmj3bbq07duete/PAakn", "BjOfP");
        A.lllllllIII[A.llllllllII[69]] = A.llIlIlllllllI("mIEskB2iJ5buTteRrGwHXQ==", "Wcplz");
        A.lllllllIII[A.llllllllII[75]] = A.llIlIlllllllI("JX+W6UKdXDc=", "mGrRp");
        A.lllllllIII[A.llllllllII[76]] = A.llIlIlllllllI("hO3ZgICwDgJ+10CEdCwxpw==", "qEYSG");
        A.lllllllIII[A.llllllllII[77]] = A.llIlIlllllllI("tTCACNzRrW1R7Jhcyfbxxj4L+b8OogQl", "sJkTq");
        A.lllllllIII[A.llllllllII[79]] = A.llIlIlllllllI("5DES4MMMlc0=", "oyenO");
        A.lllllllIII[A.llllllllII[87]] = A.llIlIllllllII("NvBmzzKK9QihydEndklZHA==", "oVAAs");
        A.lllllllIII[A.llllllllII[88]] = A.llIlIllllllII("9WM//IQueotHPiVyJLvPoYwOim8JNrfm", "saCcu");
        A.lllllllIII[A.llllllllII[89]] = A.llIlIllllllII("QQJlaBnwzdM=", "RdQaO");
        A.lllllllIII[A.llllllllII[90]] = A.llIlIllllllIl("Bx4jdyAhECB3ICgCdCM/KAV0PjkqEDojNj0YOzl3KBY1Pjl2", "IqTWW");
        A.lllllllIII[A.llllllllII[103]] = A.llIlIlllllllI("wJUcFxTkQDg=", "LQlow");
        A.lllllllIII[A.llllllllII[104]] = A.llIlIlllllllI("1sQwBRTAawFP7G2BybEFL/Ynzuxs2+tL", "qQrdU");
        A.lllllllIII[A.llllllllII[105]] = A.llIlIllllllII("Uda8JECB2XJ4nd/WEKEnWgDqpfEjfxXkim8KfDpSvkzpQROKuYsZwUudwz80qeZS", "DczUz");
        A.lllllllIII[A.llllllllII[106]] = A.llIlIllllllIl("BiZSBj0iaRYHNnUeEwI+LGkZBz45aTYLPicgBgZt", "UIrnR");
        A.lllllllIII[A.llllllllII[107]] = A.llIlIllllllII("NU5NF9DWo37fv6ROfzBSapfKISbq7Fq20sj6NBUsppiF8QbHlH4r2Q==", "ykKCU");
        A.lllllllIII[A.llllllllII[108]] = A.llIlIllllllII("q+pQK20NKcPhXZGdl/kLQKmUh+O6UWgTq2vxa9VEe8hKngwQlbuKl9tH7uMt3GzB", "IHPqQ");
        A.lllllllIII[A.llllllllII[109]] = A.llIlIllllllIl("I0QlFAoORD8eTwwNJRVPOQ0nBwoYCCIWBx5K", "jdKqo");
        A.lllllllIII[A.llllllllII[110]] = A.llIlIllllllII("B6BxrA109DajTK0fKBNKCF801s5jHTncEVNcyFD10uxg/7Zvxzn4s1X7fV0AdlxR1ONAJ9TBans=", "PTWmT");
        A.lllllllIII[A.llllllllII[111]] = A.llIlIllllllIl("ISxRIisEJlEoJ1I3GSBiGSYINmM=", "rCqEB");
        A.lllllllIII[A.llllllllII[112]] = A.llIlIllllllIl("GiI7bDpjLCYjBG9nKjkHYzMgJQBjLjtsGi43Jz4HIik8Yg==", "CGHLs");
        A.lllllllIII[A.llllllllII[113]] = A.llIlIllllllIl("JyogEyRUMWUAYRcnKA4vUzUtDmEEIysVMlM2KkEoHTQkBSRTNi0IMlMhLBU4XQ==", "sBEaA");
        A.lllllllIII[A.llllllllII[114]] = A.llIlIllllllII("VnVe+7h3zBCiAvp+l7s2Qg==", "JBEHa");
        A.lllllllIII[A.llllllllII[115]] = A.llIlIllllllIl("HzlPBks4IhxVHz4oBVUcPiJIFBkzbQ8aAjgqSAEEdisBEgMibRwdDnYpDRgEOGFIHB9xPkgYDng=", "VMhuk");
        A.lllllllIII[A.llllllllII[116]] = A.llIlIllllllIl("CgwmdSQrHCc8GnkWNTwQeRw7IFQuCiE5EHkCPSMReQgxdQAxAHQ+ESBL", "YeTUt");
        A.lllllllIII[A.llllllllII[117]] = A.llIlIlllllllI("7YATjeNkWhgmp2/SdZSOAs/RrI6AbErjBs0oF0aDxkV63sa0l4tZLTURRHAiAy7+", "NrnLB");
        A.lllllllIII[A.llllllllII[118]] = A.llIlIllllllII("GnfGswO/i7cQ9Gxsv8X6by4MYqBe5VTc9k48N6B+fLU=", "POuGw");
        A.lllllllIII[A.llllllllII[119]] = A.llIlIlllllllI("chI/l2zRC82Of65+O6QBIJ6LyCLVpe/8l3c91wGfrcNnIGptsGrXQA/RIHQbb06f", "jooFH");
        A.lllllllIII[A.llllllllII[120]] = A.llIlIlllllllI("F2tUjSah3J9luawVa0SLx37zFvPT32Sr0w2VOY3qtaU=", "hPVdT");
    }

    public A() {
        this.gH = llllllllII[0];
    }

    @Override
    public String U() {
        return lllllllIII[llllllllII[87]];
    }

    private static String llIlIllllllII(String lllllllllllllllllIlIIIIllIIIIlII, String lllllllllllllllllIlIIIIllIIIIlIl) {
        try {
            SecretKeySpec lllllllllllllllllIlIIIIllIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIIllIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIIIIllIIIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIIIIllIIIlIII.init(llllllllII[3], lllllllllllllllllIlIIIIllIIIlIIl);
            return new String(lllllllllllllllllIlIIIIllIIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIIllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIIIIllIIIIlll) {
            lllllllllllllllllIlIIIIllIIIIlll.printStackTrace();
            return null;
        }
    }

    private static String llIlIlllllllI(String lllllllllllllllllIlIIIIllIlIlIll, String lllllllllllllllllIlIIIIllIlIlIlI) {
        try {
            SecretKeySpec lllllllllllllllllIlIIIIllIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIIllIlIlIlI.getBytes(StandardCharsets.UTF_8)), llllllllII[19]), "DES");
            Cipher lllllllllllllllllIlIIIIllIlIllIl = Cipher.getInstance("DES");
            lllllllllllllllllIlIIIIllIlIllIl.init(llllllllII[3], lllllllllllllllllIlIIIIllIlIlllI);
            return new String(lllllllllllllllllIlIIIIllIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIIllIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIIIIllIlIllII) {
            lllllllllllllllllIlIIIIllIlIllII.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIIllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static void bX() {
        if (!A.llIllIIIlllII(gG) || A.llIllIIIlIlII(Vars.getBit((int)llllllllII[70])) && A.llIllIIIlIlII(Vars.getBit((int)llllllllII[71]))) {
            return;
        }
        String[] stringArray = new String[llllllllII[10]];
        stringArray[A.llllllllII[0]] = gx.get(Vars.getBit((int)llllllllII[70]));
        stringArray[A.llllllllII[1]] = gx.get(Vars.getBit((int)llllllllII[71]));
        stringArray[A.llllllllII[3]] = gx.get(Vars.getBit((int)llllllllII[72]));
        stringArray[A.llllllllII[5]] = gx.get(Vars.getBit((int)llllllllII[73]));
        stringArray[A.llllllllII[4]] = gx.get(Vars.getBit((int)llllllllII[74]));
        gG = stringArray;
        String string = "Say the following in order: " + String.join((CharSequence)lllllllIII[llllllllII[75]], gG);
        System.out.println(string);
    }

    /*
     * WARNING - void declaration
     */
    private static boolean aa() {
        void lllllllllllllllllIlIIIIllIllllII;
        int[] nArray = new int[llllllllII[3]];
        nArray[A.llllllllII[0]] = llllllllII[6];
        nArray[A.llllllllII[1]] = llllllllII[8];
        int[] nArray2 = nArray;
        int lllllllllllllllllIlIIIIllIlllIll = llllllllII[0];
        while (A.llIllIIIlIIll(lllllllllllllllllIlIIIIllIlllIll, ((void)lllllllllllllllllIlIIIIllIllllII).length)) {
            int[] nArray3 = new int[llllllllII[1]];
            nArray3[A.llllllllII[0]] = lllllllllllllllllIlIIIIllIllllII[lllllllllllllllllIlIIIIllIlllIll];
            if (A.llIllIIIlIlII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return llllllllII[0];
            }
            ++lllllllllllllllllIlIIIIllIlllIll;
            "".length();
            if (-" ".length() <= 0) continue;
            return ((0x60 ^ 0x69) & ~(0x33 ^ 0x3A)) != 0;
        }
        return llllllllII[1];
    }

    private static boolean llIllIIIlIlIl(Object object) {
        return object != null;
    }

    private static boolean llIllIIIlIllI(int n2) {
        return n2 > 0;
    }

    private static boolean llIllIIIllIII(int n2, int n3) {
        return n2 > n3;
    }
}

