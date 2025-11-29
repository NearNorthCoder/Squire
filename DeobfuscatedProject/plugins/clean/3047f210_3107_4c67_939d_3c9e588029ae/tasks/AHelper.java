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
package gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks;

import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.3047f210-3107-4c67-939d-3c9e588029aeManager;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.AHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.ACHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.BHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.DHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.EHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.FHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.GHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.IHelper;
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

public class AHelper
implements S {
    static  WorldPoint gD;
    static  boolean cl;
    static  int ck;
    public static  List<d> bu;
    public static  boolean bs;
    static  WorldPoint gF;
    private static final  String gy;
    public static  boolean gz;
    static  String[] bQ;
    static  WorldPoint gA;
    
    static  WorldPoint gC;
    
    static  WorldPoint gB;
    private final  int gH = 0;
    static  WorldPoint gf;
    private static final  HashMap<Integer, String> gx;
    static  WorldPoint gE;

    private static boolean llIllIIIllllI(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    private static void bY() {
        void var1;
        BankLocation bankLocation = BankLocation.getNearest();
        if (A.llIllIIIlIlIl(bankLocation) && A.llIllIIIlIlII(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllllllIII[llllllllII[76]];
            a.a(bankLocation);
        }
        if (A.llIllIIIlIlIl(var1) && A.llIllIIIlIIlI(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (A.llIllIIIlIlII(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)llllllllII[2]);

                Time.sleepTicks((int)llllllllII[5]);

            }
            if (A.llIllIIIlIIlI(Bank.isOpen() ? 1 : 0)) {
                AccBuilderTempleTrek.c = lllllllIII[llllllllII[77]];
                if (A.llIllIIIlIIlI(gz ? 1 : 0)) {
                    int[] nArray = new int[llllllllII[1]];
                    nArray[A.llllllllII[0]] = llllllllII[48];
                    if (A.llIllIIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0) && A.llIllIIIlIllI(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)llllllllII[4]);

                    }
                }
                if (A.llIllIIIlIllI(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)llllllllII[3]);

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

                        }
                        if (A.llIllIIIlIlII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)llllllllII[10]);

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

            if (3 < 0) {
                return ((0xC0 ^ 0x86 ^ (0x69 ^ 0x18)) & (0x25 ^ 0x51 ^ (0xC6 ^ 0x85) ^ -1)) != 0;
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
                Object var2;
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
                            var2 = BankLocation.getNearest();
                            if (A.llIllIIIlIlIl(var2) && A.llIllIIIlIlII(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllllllIII[llllllllII[1]];
                                a.a((BankLocation)var2);
                            }
                            if (A.llIllIIIlIlIl(var2) && A.llIllIIIlIIlI(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (A.llIllIIIlIlII(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)llllllllII[2]);

                                }
                                if (A.llIllIIIlIIlI(Bank.isOpen() ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllllIII[llllllllII[3]];
                                    if (A.llIllIIIlIllI(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)llllllllII[4]);

                                    }
                                    if (A.llIllIIIlIllI(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)llllllllII[3]);

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

                                        }
                                        if (A.llIllIIIlIlII(Bank.isOpen() ? 1 : 0)) {
                                            a.a();
                                            Time.sleepTicks((int)llllllllII[5]);

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

                                Time.sleepTicks((int)llllllllII[1]);

                            }
                            if (A.llIllIIIllIIl(Players.getLocal().getWorldLocation().distanceTo(gf), llllllllII[4])) {
                                g.a(lllllllIII[llllllllII[20]], bQ);
                            }
                        }
                        if (A.llIllIIIllIlI(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()), llllllllII[1])) {
                            var2 = new WorldArea(llllllllII[21], llllllllII[22], llllllllII[19], llllllllII[18], llllllllII[0]);
                            if (A.llIllIIIlIlII(var2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllllllIII[llllllllII[12]];
                                Movement.walkTo((WorldPoint)gA);

                                Time.sleepTicks((int)llllllllII[1]);

                            }
                            if (A.llIllIIIlIIlI(var2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
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

                                    Time.sleepTicks((int)llllllllII[1]);

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

                                    Time.sleepTicks((int)llllllllII[1]);

                                }
                                if (A.llIllIIIllIIl(Players.getLocal().getWorldLocation().distanceTo(gC), llllllllII[4])) {
                                    String[] stringArray2 = new String[llllllllII[1]];
                                    stringArray2[A.llllllllII[0]] = lllllllIII[llllllllII[30]];
                                    String[] stringArray3 = new String[llllllllII[1]];
                                    stringArray3[A.llllllllII[0]] = lllllllIII[llllllllII[31]];
                                    Inventory.getFirst((String[])stringArray2).useOn(TileObjects.getNearest((String[])stringArray3));
                                    Time.sleepTicks((int)llllllllII[10]);

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

                                        }
                                    }
                                    Movement.walkTo((WorldPoint)gD);

                                    Time.sleepTicks((int)llllllllII[1]);

                                }
                                if (A.llIllIIIllIIl(Players.getLocal().getWorldLocation().distanceTo(gD), llllllllII[4])) {
                                    String[] stringArray13 = new String[llllllllII[1]];
                                    stringArray13[A.llllllllII[0]] = lllllllIII[llllllllII[43]];
                                    if (A.llIllIIIlIlIl(TileObjects.getNearest((String[])stringArray13))) {
                                        String[] stringArray14 = new String[llllllllII[1]];
                                        stringArray14[A.llllllllII[0]] = lllllllIII[llllllllII[44]];
                                        TileObjects.getNearest((String[])stringArray14).interact(lllllllIII[llllllllII[45]]);
                                        Time.sleepTicks((int)llllllllII[4]);

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

                                            Time.sleepTicks((int)llllllllII[1]);

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
                                        var2 = new WorldArea(llllllllII[21], llllllllII[22], llllllllII[19], llllllllII[18], llllllllII[0]);
                                        if (A.llIllIIIlIlII(var2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderTempleTrek.c = lllllllIII[llllllllII[54]];
                                            Movement.walkTo((WorldPoint)gA);

                                            Time.sleepTicks((int)llllllllII[1]);

                                        }
                                        if (A.llIllIIIlIIlI(var2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
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

                                Time.sleepTicks((int)llllllllII[1]);

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
                    if (A.llIllIIIlIlIl(var2 = NPCs.getNearest(nPC -> {
                        int n2;
                        if (A.llIllIIIlIIlI(nPC.getName().contains(lllllllIII[llllllllII[89]]) ? 1 : 0) && A.llIllIIIllllI(nPC.getInteracting(), Players.getLocal())) {
                            n2 = llllllllII[1];

                            }
                        } else {
                            n2 = llllllllII[0];
                        }
                        return n2 != 0;
                    })) && A.llIllIIIlllII(Players.getLocal().getInteracting())) {
                        var2.interact(lllllllIII[llllllllII[62]]);
                        Time.sleepTicks((int)llllllllII[3]);

                    }
                    if (A.llIllIIIlllII(var2) && A.llIllIIIlllII(Players.getLocal().getInteracting())) {
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
                        List var3 = Dialog.getOptions();
                        if (A.llIllIIIlIlII(var3.isEmpty() ? 1 : 0)) {
                            int var4 = llllllllII[0];
                            while (A.llIllIIIlIIll(var4, var3.size())) {
                                if (A.llIllIIIlIIlI(((Widget)var3.get(var4)).getText().contains(lllllllIII[llllllllII[67]]) ? 1 : 0)) {
                                    String[] stringArray = new String[llllllllII[1]];
                                    stringArray[A.llllllllII[0]] = ((Widget)var3.get(var4)).getText();
                                    Dialog.chooseOption((String[])stringArray);

                                    Time.sleepTicks((int)llllllllII[3]);

                                    if (2 != ((0x44 ^ 0x5F) & ~(8 ^ 0x13))) break;
                                    return;
                                }
                                ++var4;

                                if (1 != 0) continue;
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
                        var2 = Dialog.getOptions();
                        if (A.llIllIIIlIlII(var2.isEmpty() ? 1 : 0)) {
                            int var3 = llllllllII[0];
                            while (A.llIllIIIlIIll(var3, var2.size())) {
                                String var4 = gG[var3];
                                int var5 = llllllllII[0];
                                while (A.llIllIIIlIIll(var5, var2.size())) {
                                    if (A.llIllIIIlIIlI(((Widget)var2.get(var5)).getText().contains(var4) ? 1 : 0)) {
                                        System.out.println("Selecting: " + ((Widget)var2.get(var5)).getText());
                                        Time.sleepTicks((int)llllllllII[3]);

                                        String[] stringArray23 = new String[llllllllII[1]];
                                        stringArray23[A.llllllllII[0]] = ((Widget)var2.get(var5)).getText();
                                        Dialog.chooseOption((String[])stringArray23);

                                        Time.sleepTicks((int)llllllllII[12]);

                                        if (3 > 1) break;
                                        return;
                                    }
                                    ++var5;

                                    if ((0x77 ^ 0x3E ^ (0xDF ^ 0x92)) != 2) continue;
                                    return;
                                }
                                ++var3;

                                if (2 > 0) continue;
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
        gx = new 3047f210-3107-4c67-939d-3c9e588029aeManager();
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

        return String.valueOf(var6);
    }

    private static void ae() {
        block17: {
            d var7;
            block16: {
                block15: {
                    block14: {
                        Object var8;
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
                            var8 = new DHelper(llllllllII[7], llllllllII[9], llllllllII[80]);
                            bu.add((DHelper) ar8);

                        }
                        int[] nArray = new int[llllllllII[1]];
                        nArray[A.llllllllII[0]] = llllllllII[8];
                        if (A.llIllIIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            var8 = new DHelper(llllllllII[8], llllllllII[1], llllllllII[81]);
                            bu.add((DHelper) ar8);

                        }
                        if (A.llIllIIIlIlII(Bank.contains((Predicate)(var8 = item -> item.getName().toLowerCase().contains(lllllllIII[llllllllII[88]]))) ? 1 : 0)) {
                            var7 = new DHelper(llllllllII[82], llllllllII[10], llllllllII[83]);
                            bu.add(var7);

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
                    var7 = new DHelper(llllllllII[17], llllllllII[12], llllllllII[84]);
                    bu.add(var7);

                }
                int[] nArray = new int[llllllllII[1]];
                nArray[A.llllllllII[0]] = llllllllII[11];
                if (A.llIllIIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    var7 = new DHelper(llllllllII[11], llllllllII[4], i.bp);
                    bu.add(var7);

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
            var7 = new DHelper(llllllllII[6], llllllllII[54], llllllllII[85]);
            bu.add(var7);

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

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        return llllllllII[86];
    }

    private static void llIllIIIIllll() {
        lllllllIII = new String[llllllllII[121]];
        A.lllllllIII[A.llllllllII[0]] = "Finished buying items, switching back to quest";
        A.lllllllIII[A.llllllllII[1]] = "Nav to bank";
        A.lllllllIII[A.llllllllII[3]] = "Handling banking";
        A.lllllllIII[A.llllllllII[5]] = "We are missing quest supplies, switching to BUYING";
        A.lllllllIII[A.llllllllII[4]] = "We are missing quest supplies, switching to BUYING";
        A.lllllllIII[A.llllllllII[10]] = "Wear";
        A.lllllllIII[A.llllllllII[16]] = "Drink";
        A.lllllllIII[A.llllllllII[18]] = "Eat";
        A.lllllllIII[A.llllllllII[19]] = "Nav to start";
        A.lllllllIII[A.llllllllII[20]] = "Aris";
        A.lllllllIII[A.llllllllII[12]] = "Nav to sir pyrsin";
        A.lllllllIII[A.llllllllII[23]] = "Sir Prysin";
        A.lllllllIII[A.llllllllII[25]] = "Silverlight";
        A.lllllllIII[A.llllllllII[26]] = "Nav to captain";
        A.lllllllIII[A.llllllllII[27]] = "Captain Rovin";
        A.lllllllIII[A.llllllllII[28]] = "Bucket of water";
        A.lllllllIII[A.llllllllII[29]] = "Nav to drain";
        A.lllllllIII[A.llllllllII[30]] = "Bucket of water";
        A.lllllllIII[A.llllllllII[31]] = "Drain";
        A.lllllllIII[A.llllllllII[32]] = "Bucket of water";
        A.lllllllIII[A.llllllllII[33]] = "Nav to sewer key";
        A.lllllllIII[A.llllllllII[34]] = "Manhole";
        A.lllllllIII[A.llllllllII[35]] = "Manhole";
        A.lllllllIII[A.llllllllII[36]] = "Open";
        A.lllllllIII[A.llllllllII[37]] = "Manhole";
        A.lllllllIII[A.llllllllII[9]] = "Open";
        A.lllllllIII[A.llllllllII[38]] = "Manhole";
        A.lllllllIII[A.llllllllII[39]] = "Manhole";
        A.lllllllIII[A.llllllllII[40]] = "Climb-down";
        A.lllllllIII[A.llllllllII[41]] = "Manhole";
        A.lllllllIII[A.llllllllII[42]] = "Climb-down";
        A.lllllllIII[A.llllllllII[43]] = "Rusty key";
        A.lllllllIII[A.llllllllII[44]] = "Rusty key";
        A.lllllllIII[A.llllllllII[45]] = "Take";
        A.lllllllIII[A.llllllllII[47]] = "Silverlight";
        A.lllllllIII[A.llllllllII[49]] = "Bones";
        A.lllllllIII[A.llllllllII[50]] = "Bones";
        A.lllllllIII[A.llllllllII[51]] = "Nav to wizard";
        A.lllllllIII[A.llllllllII[52]] = "Wizard Traiborn";
        A.lllllllIII[A.llllllllII[53]] = "Silverlight";
        A.lllllllIII[A.llllllllII[54]] = "Nav to sir pyrsin";
        A.lllllllIII[A.llllllllII[55]] = "Sir Prysin";
        A.lllllllIII[A.llllllllII[56]] = "Silverlight";
        A.lllllllIII[A.llllllllII[57]] = "Delrith";
        A.lllllllIII[A.llllllllII[58]] = "Weakened Delrith";
        A.lllllllIII[A.llllllllII[59]] = "Nav to demon";
        A.lllllllIII[A.llllllllII[60]] = "Delrith";
        A.lllllllIII[A.llllllllII[61]] = "Weakened Delrith";
        A.lllllllIII[A.llllllllII[62]] = "Attack";
        A.lllllllIII[A.llllllllII[63]] = "Delrith";
        A.lllllllIII[A.llllllllII[15]] = "Delrith";
        A.lllllllIII[A.llllllllII[64]] = "Delrith";
        A.lllllllIII[A.llllllllII[65]] = "Attack";
        A.lllllllIII[A.llllllllII[66]] = "Banishing";
        A.lllllllIII[A.llllllllII[67]] = "[";
        A.lllllllIII[A.llllllllII[68]] = "Weakened Delrith";
        A.lllllllIII[A.llllllllII[69]] = "Banishing";
        A.lllllllIII[A.llllllllII[75]] = ", ";
        A.lllllllIII[A.llllllllII[76]] = "Nav to bank";
        A.lllllllIII[A.llllllllII[77]] = "Handling banking";
        A.lllllllIII[A.llllllllII[79]] = "Wear";
        A.lllllllIII[A.llllllllII[87]] = "Demon Slayer";
        A.lllllllIII[A.llllllllII[88]] = "ring of wealth (";
        A.lllllllIII[A.llllllllII[89]] = "wizard";
        A.lllllllIII[A.llllllllII[90]] = "Now what was that incantation again?";
        A.lllllllIII[A.llllllllII[103]] = "Yes.";
        A.lllllllIII[A.llllllllII[104]] = "The Demon Slayer Quest";
        A.lllllllIII[A.llllllllII[105]] = "Okay, where is he? I'll kill him for you!";
        A.lllllllIII[A.llllllllII[106]] = "So how did Wally kill Delrith?";
        A.lllllllIII[A.llllllllII[107]] = "What is the magical incantation?";
        A.lllllllIII[A.llllllllII[108]] = "Aris said I should come and talk to you.";
        A.lllllllIII[A.llllllllII[109]] = "I need to find Silverlight.";
        A.lllllllIII[A.llllllllII[110]] = "He's back and unfortunately I've got to deal with him.";
        A.lllllllIII[A.llllllllII[111]] = "So give me the keys!";
        A.lllllllIII[A.llllllllII[112]] = "Yes I know, but this is important.";
        A.lllllllIII[A.llllllllII[113]] = "There's a demon who wants to invade this city.";
        A.lllllllIII[A.llllllllII[114]] = "Yes, very.";
        A.lllllllIII[A.llllllllII[115]] = "It's not them who are going to fight the demon, it's me.";
        A.lllllllIII[A.llllllllII[116]] = "Sir Prysin said you would give me the key.";
        A.lllllllIII[A.llllllllII[117]] = "Why did he give you one of the keys then?";
        A.lllllllIII[A.llllllllII[118]] = "Talk about Demon Slayer.";
        A.lllllllIII[A.llllllllII[119]] = "Well, have you got any keys knocking around?";
        A.lllllllIII[A.llllllllII[120]] = "I'll get the bones for you.";
    }

    public AHelper() {
        this.gH = llllllllII[0];
    }

    @Override
    public String U() {
        return lllllllIII[llllllllII[87]];
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
        void var9;
        int[] nArray = new int[llllllllII[3]];
        nArray[A.llllllllII[0]] = llllllllII[6];
        nArray[A.llllllllII[1]] = llllllllII[8];
        int[] nArray2 = nArray;
        int var10 = llllllllII[0];
        while (A.llIllIIIlIIll(var10, ((void)var9).length)) {
            int[] nArray3 = new int[llllllllII[1]];
            nArray3[A.llllllllII[0]] = var9[var10];
            if (A.llIllIIIlIlII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return llllllllII[0];
            }
            ++var10;

            if (-1 <= 0) continue;
            return false;
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

