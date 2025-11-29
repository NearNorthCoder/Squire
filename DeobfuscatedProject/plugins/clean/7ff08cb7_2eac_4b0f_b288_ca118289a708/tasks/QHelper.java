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
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.7ff08cb7-2eac-4b0f-b288-ca118289a708Manager;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AHelper;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.ASHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.BHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.DHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.EHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.FHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.GHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.JHelper;
import gg.squire.account.AccBuilderGWD;
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

public class QHelper
implements ab {
    static  String[] cG;
    
    static  WorldPoint dg;
    private static final  HashMap<Integer, String> kL;
    
    public static  boolean bv;
    static  WorldPoint kR;
    public static  boolean kN;
    static  WorldPoint kP;
    static  WorldPoint kO;
    static  int dk;
    static  WorldPoint kQ;
    public static  List<d> bx;
    private static final  String kM;
    static  boolean dl;
    
    private final  int kV = 0;
    static  WorldPoint kT;
    static  WorldPoint kS;

    public QHelper() {
        this.kV = lllIlllIl[0];
    }

    @Override
    public String ag() {
        return lllIllIll[lllIlllIl[87]];
    }

    private static void cP() {
        if (!Q.llIIlIlllllI(kU) || Q.llIIlIllIllI(Vars.getBit((int)lllIlllIl[70])) && Q.llIIlIllIllI(Vars.getBit((int)lllIlllIl[71]))) {
            return;
        }
        String[] stringArray = new String[lllIlllIl[10]];
        stringArray[Q.lllIlllIl[0]] = kL.get(Vars.getBit((int)lllIlllIl[70]));
        stringArray[Q.lllIlllIl[1]] = kL.get(Vars.getBit((int)lllIlllIl[71]));
        stringArray[Q.lllIlllIl[3]] = kL.get(Vars.getBit((int)lllIlllIl[72]));
        stringArray[Q.lllIlllIl[5]] = kL.get(Vars.getBit((int)lllIlllIl[73]));
        stringArray[Q.lllIlllIl[4]] = kL.get(Vars.getBit((int)lllIlllIl[74]));
        kU = stringArray;
        String string = "Say the following in order: " + String.join((CharSequence)lllIllIll[lllIlllIl[75]], kU);
        System.out.println(string);
    }

    private static boolean llIIlIllllII(int n2, int n3) {
        return n2 == n3;
    }

    private static void QHelper() {
        block17: {
            d llIlIIIlIIllI;
            block16: {
                block15: {
                    block14: {
                        Object llIlIIIlIIlll;
                        block13: {
                            block12: {
                                int[] nArray = new int[lllIlllIl[1]];
                                nArray[Q.lllIlllIl[0]] = lllIlllIl[7];
                                if (!Q.llIIlIllIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block12;
                                int[] nArray2 = new int[lllIlllIl[1]];
                                nArray2[Q.lllIlllIl[0]] = lllIlllIl[7];
                                if (!Q.llIIlIllIlII(Bank.contains((int[])nArray2) ? 1 : 0)) break block13;
                                int[] nArray3 = new int[lllIlllIl[1]];
                                nArray3[Q.lllIlllIl[0]] = lllIlllIl[7];
                                if (!Q.llIIlIllIlIl(Bank.getFirst((int[])nArray3).getQuantity(), lllIlllIl[9])) break block13;
                            }
                            llIlIIIlIIlll = new DHelper(lllIlllIl[7], lllIlllIl[9], lllIlllIl[80]);
                            bx.add((DHelper) lIlIIIlIIlll);

                        }
                        int[] nArray = new int[lllIlllIl[1]];
                        nArray[Q.lllIlllIl[0]] = lllIlllIl[8];
                        if (Q.llIIlIllIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            llIlIIIlIIlll = new DHelper(lllIlllIl[8], lllIlllIl[1], lllIlllIl[81]);
                            bx.add((DHelper) lIlIIIlIIlll);

                        }
                        if (Q.llIIlIllIllI(Bank.contains((Predicate)(llIlIIIlIIlll = item -> item.getName().toLowerCase().contains(lllIllIll[lllIlllIl[88]]))) ? 1 : 0)) {
                            llIlIIIlIIllI = new DHelper(lllIlllIl[82], lllIlllIl[10], lllIlllIl[83]);
                            bx.add(llIlIIIlIIllI);

                        }
                        int[] nArray4 = new int[lllIlllIl[1]];
                        nArray4[Q.lllIlllIl[0]] = lllIlllIl[17];
                        if (!Q.llIIlIllIlII(Bank.contains((int[])nArray4) ? 1 : 0)) break block14;
                        int[] nArray5 = new int[lllIlllIl[1]];
                        nArray5[Q.lllIlllIl[0]] = lllIlllIl[17];
                        if (!Q.llIIlIllIlII(Bank.contains((int[])nArray5) ? 1 : 0)) break block15;
                        int[] nArray6 = new int[lllIlllIl[1]];
                        nArray6[Q.lllIlllIl[0]] = lllIlllIl[17];
                        if (!Q.llIIlIllIlIl(Bank.getFirst((int[])nArray6).getQuantity(), lllIlllIl[10])) break block15;
                    }
                    llIlIIIlIIllI = new DHelper(lllIlllIl[17], lllIlllIl[12], lllIlllIl[84]);
                    bx.add(llIlIIIlIIllI);

                }
                int[] nArray = new int[lllIlllIl[1]];
                nArray[Q.lllIlllIl[0]] = lllIlllIl[11];
                if (Q.llIIlIllIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    llIlIIIlIIllI = new DHelper(lllIlllIl[11], lllIlllIl[4], j.ch);
                    bx.add(llIlIIIlIIllI);

                }
                int[] nArray7 = new int[lllIlllIl[1]];
                nArray7[Q.lllIlllIl[0]] = lllIlllIl[6];
                if (!Q.llIIlIllIlII(Bank.contains((int[])nArray7) ? 1 : 0)) break block16;
                int[] nArray8 = new int[lllIlllIl[1]];
                nArray8[Q.lllIlllIl[0]] = lllIlllIl[6];
                if (!Q.llIIlIllIlII(Bank.contains((int[])nArray8) ? 1 : 0)) break block17;
                int[] nArray9 = new int[lllIlllIl[1]];
                nArray9[Q.lllIlllIl[0]] = lllIlllIl[6];
                if (!Q.llIIlIllIlIl(Bank.getFirst((int[])nArray9).getQuantity(), lllIlllIl[28])) break block17;
            }
            llIlIIIlIIllI = new DHelper(lllIlllIl[6], lllIlllIl[54], lllIlllIl[85]);
            bx.add(llIlIIIlIIllI);

        }
    }

    private static boolean llIIlIllIlll(Object object) {
        return object != null;
    }

    private static boolean llIIlIllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIlIllIlII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIlIlllIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIlIlllIIl(int n2) {
        return n2 < 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void llIlIIIlIlIll;
        int[] nArray = new int[lllIlllIl[3]];
        nArray[Q.lllIlllIl[0]] = lllIlllIl[6];
        nArray[Q.lllIlllIl[1]] = lllIlllIl[8];
        int[] nArray2 = nArray;
        int llIlIIIlIlIlI = lllIlllIl[0];
        while (Q.llIIlIllIlIl(llIlIIIlIlIlI, ((void)llIlIIIlIlIll).length)) {
            int[] nArray3 = new int[lllIlllIl[1]];
            nArray3[Q.lllIlllIl[0]] = llIlIIIlIlIll[llIlIIIlIlIlI];
            if (Q.llIIlIllIllI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lllIlllIl[0];
            }
            ++llIlIIIlIlIlI;

            if (3 < (0x21 ^ 0x51 ^ (0x12 ^ 0x66))) continue;
            return ((0xB7 ^ 0xA0 ^ (0x1B ^ 0x28)) & (3 ^ (0x43 ^ 0x64) ^ -1)) != 0;
        }
        return lllIlllIl[1];
    }

    private static boolean llIIlIllIllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlIlllllI(Object object) {
        return object == null;
    }

    @Override
    public int af() {
        try {
            Q.cO();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (2 != 2) {
            return (0x63 ^ 0x64) & ~(0x6B ^ 0x6C);
        }
        return lllIlllIl[86];
    }

    private static boolean llIIllIIIIII(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (Q.llIIlIllllll(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()), lllIlllIl[5])) {
            bl = lllIlllIl[1];

            if ((0x81 ^ 0x85) > (0x4B ^ 0x4F)) {
                return false;
            }
        } else {
            bl = lllIlllIl[0];
        }
        return bl;
    }

    private static boolean llIIlIllllll(int n2, int n3) {
        return n2 >= n3;
    }

        return String.valueOf(llIIllllllIll);
    }

    private static boolean llIIlIllllIl(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public boolean ae() {
        return lllIlllIl[0];
    }

    private static int llIIlIllIIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    public static void cO() {
        block77: {
            block78: {
                Object llIlIIIllIlIl;
                block80: {
                    block79: {
                        if (Q.llIIlIllIlII(bv ? 1 : 0)) {
                            b.a(bx);
                            if (Q.llIIlIllIlIl(bx.size(), lllIlllIl[1])) {
                                System.out.println(lllIllIll[lllIlllIl[0]]);
                                bv = lllIlllIl[0];
                            }
                        }
                        if (!Q.llIIlIllIllI(bv ? 1 : 0)) break block77;
                        if (Q.llIIlIllIllI(Q.an() ? 1 : 0) && Q.llIIlIllIllI(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()))) {
                            llIlIIIllIlIl = BankLocation.getNearest();
                            if (Q.llIIlIllIlll(llIlIIIllIlIl) && Q.llIIlIllIllI(llIlIIIllIlIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderGWD.c = lllIllIll[lllIlllIl[1]];
                                a.a((BankLocation)llIlIIIllIlIl);
                            }
                            if (Q.llIIlIllIlll(llIlIIIllIlIl) && Q.llIIlIllIlII(llIlIIIllIlIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (Q.llIIlIllIllI(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lllIlllIl[2]);

                                }
                                if (Q.llIIlIllIlII(Bank.isOpen() ? 1 : 0)) {
                                    AccBuilderGWD.c = lllIllIll[lllIlllIl[3]];
                                    if (Q.llIIlIlllIII(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lllIlllIl[4]);

                                    }
                                    if (Q.llIIlIlllIII(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lllIlllIl[3]);

                                    }
                                    int[] nArray = new int[lllIlllIl[5]];
                                    nArray[Q.lllIlllIl[0]] = lllIlllIl[6];
                                    nArray[Q.lllIlllIl[1]] = lllIlllIl[7];
                                    nArray[Q.lllIlllIl[3]] = lllIlllIl[8];
                                    if (Q.llIIlIllIllI(e.d(nArray) ? 1 : 0)) {
                                        Q.QHelper();
                                        System.out.println(lllIllIll[lllIlllIl[5]]);
                                        bv = lllIlllIl[1];
                                        return;
                                    }
                                    int[] nArray2 = new int[lllIlllIl[1]];
                                    nArray2[Q.lllIlllIl[0]] = lllIlllIl[7];
                                    if (Q.llIIlIllIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                        int[] nArray3 = new int[lllIlllIl[1]];
                                        nArray3[Q.lllIlllIl[0]] = lllIlllIl[7];
                                        if (Q.llIIlIllIlIl(Bank.getFirst((int[])nArray3).getQuantity(), lllIlllIl[9])) {
                                            Q.QHelper();
                                            System.out.println(lllIllIll[lllIlllIl[4]]);
                                            bv = lllIlllIl[1];
                                            return;
                                        }
                                    }
                                    int[] nArray4 = new int[lllIlllIl[5]];
                                    nArray4[Q.lllIlllIl[0]] = lllIlllIl[6];
                                    nArray4[Q.lllIlllIl[1]] = lllIlllIl[7];
                                    nArray4[Q.lllIlllIl[3]] = lllIlllIl[8];
                                    if (Q.llIIlIllIlII(e.d(nArray4) ? 1 : 0)) {
                                        if (Q.llIIlIllIllI(Equipment.contains((int[])f.aY) ? 1 : 0) && Q.llIIlIllIllI(Inventory.contains((int[])f.aY) ? 1 : 0)) {
                                            a.b(f.aY, lllIlllIl[1]);
                                        }
                                        if (Q.llIIlIllIlII(Inventory.contains((int[])f.aY) ? 1 : 0)) {
                                            Inventory.getFirst((int[])f.aY).interact(lllIllIll[lllIlllIl[10]]);
                                            Time.sleepTicks((int)lllIlllIl[5]);

                                        }
                                        if (Q.llIIlIllIllI(Bank.isOpen() ? 1 : 0)) {
                                            a.a();
                                            Time.sleepTicks((int)lllIlllIl[5]);

                                        }
                                        a.a(lllIlllIl[11], lllIlllIl[1]);
                                        a.a(lllIlllIl[8], lllIlllIl[1]);
                                        a.a(lllIlllIl[6], lllIlllIl[12]);
                                        a.a(lllIlllIl[13], lllIlllIl[14]);
                                    }
                                }
                            }
                        }
                        if (Q.llIIlIllIlII(Inventory.contains((int[])f.bc) ? 1 : 0) && Q.llIIlIllIlIl(Movement.getRunEnergy(), lllIlllIl[15])) {
                            Inventory.getFirst((int[])f.bc).interact(lllIllIll[lllIlllIl[16]]);
                            Time.sleepTicks((int)lllIlllIl[1]);

                        }
                        int[] nArray = new int[lllIlllIl[1]];
                        nArray[Q.lllIlllIl[0]] = lllIlllIl[17];
                        if (Q.llIIlIllIlII(Inventory.contains((int[])nArray) ? 1 : 0) && Q.llIIlIlllIIl(Q.llIIlIllIIll(e.w(), 55.0))) {
                            int[] nArray5 = new int[lllIlllIl[1]];
                            nArray5[Q.lllIlllIl[0]] = lllIlllIl[17];
                            Inventory.getFirst((int[])nArray5).interact(lllIllIll[lllIlllIl[18]]);
                        }
                        if (Q.llIIlIllIlII(Q.an() ? 1 : 0) && Q.llIIlIllIllI(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()))) {
                            if (Q.llIIlIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dg), lllIlllIl[4]) && Q.llIIlIllIllI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                                AccBuilderGWD.c = lllIllIll[lllIlllIl[19]];
                                Movement.walkTo((WorldPoint)dg);

                                Time.sleepTicks((int)lllIlllIl[1]);

                            }
                            if (Q.llIIlIlllIll(Players.getLocal().getWorldLocation().distanceTo(dg), lllIlllIl[4])) {
                                g.a(lllIllIll[lllIlllIl[20]], cG);
                            }
                        }
                        if (Q.llIIlIllllII(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()), lllIlllIl[1])) {
                            llIlIIIllIlIl = new WorldArea(lllIlllIl[21], lllIlllIl[22], lllIlllIl[19], lllIlllIl[18], lllIlllIl[0]);
                            if (Q.llIIlIllIllI(llIlIIIllIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderGWD.c = lllIllIll[lllIlllIl[12]];
                                Movement.walkTo((WorldPoint)kO);

                                Time.sleepTicks((int)lllIlllIl[1]);

                            }
                            if (Q.llIIlIllIlII(llIlIIIllIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                g.a(lllIllIll[lllIlllIl[23]], cG);
                            }
                        }
                        if (!Q.llIIlIllllII(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()), lllIlllIl[3])) break block78;
                        dk = lllIlllIl[0];
                        int[] nArray6 = new int[lllIlllIl[1]];
                        nArray6[Q.lllIlllIl[0]] = lllIlllIl[24];
                        if (Q.llIIlIllIllI(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                            String[] stringArray = new String[lllIlllIl[1]];
                            stringArray[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[25]];
                            if (Q.llIIlIllIllI(Equipment.contains((String[])stringArray) ? 1 : 0) && Q.llIIlIllIllI(kN ? 1 : 0)) {
                                if (!Q.llIIlIlllIll(Players.getLocal().getWorldLocation().distanceTo(kP), lllIlllIl[4]) || Q.llIIlIllllIl(Players.getLocal().getWorldLocation().getPlane(), lllIlllIl[3])) {
                                    AccBuilderGWD.c = lllIllIll[lllIlllIl[26]];
                                    Movement.walkTo((WorldPoint)kP);

                                    Time.sleepTicks((int)lllIlllIl[1]);

                                }
                                if (Q.llIIlIlllIll(Players.getLocal().getWorldLocation().distanceTo(kP), lllIlllIl[4])) {
                                    g.a(lllIllIll[lllIlllIl[27]], cG);
                                }
                            }
                        }
                        int[] nArray7 = new int[lllIlllIl[1]];
                        nArray7[Q.lllIlllIl[0]] = lllIlllIl[24];
                        if (Q.llIIlIllIlII(Inventory.contains((int[])nArray7) ? 1 : 0) && Q.llIIlIllIllI(kN ? 1 : 0)) {
                            String[] stringArray = new String[lllIlllIl[1]];
                            stringArray[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[28]];
                            if (Q.llIIlIllIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                if (Q.llIIlIlllIlI(Players.getLocal().getWorldLocation().distanceTo(kQ), lllIlllIl[4])) {
                                    AccBuilderGWD.c = lllIllIll[lllIlllIl[29]];
                                    Movement.walkTo((WorldPoint)kQ);

                                    Time.sleepTicks((int)lllIlllIl[1]);

                                }
                                if (Q.llIIlIlllIll(Players.getLocal().getWorldLocation().distanceTo(kQ), lllIlllIl[4])) {
                                    String[] stringArray2 = new String[lllIlllIl[1]];
                                    stringArray2[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[30]];
                                    String[] stringArray3 = new String[lllIlllIl[1]];
                                    stringArray3[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[31]];
                                    Inventory.getFirst((String[])stringArray2).useOn(TileObjects.getNearest((String[])stringArray3));
                                    Time.sleepTicks((int)lllIlllIl[10]);

                                }
                            }
                            String[] stringArray4 = new String[lllIlllIl[1]];
                            stringArray4[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[32]];
                            if (Q.llIIlIllIllI(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                                if (Q.llIIlIlllIlI(Players.getLocal().getWorldLocation().distanceTo(kR), lllIlllIl[4])) {
                                    AccBuilderGWD.c = lllIllIll[lllIlllIl[33]];
                                    String[] stringArray5 = new String[lllIlllIl[1]];
                                    stringArray5[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[34]];
                                    if (Q.llIIlIllIlll(TileObjects.getNearest((String[])stringArray5))) {
                                        String[] stringArray6 = new String[lllIlllIl[1]];
                                        stringArray6[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[35]];
                                        String[] stringArray7 = new String[lllIlllIl[1]];
                                        stringArray7[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[36]];
                                        if (Q.llIIlIllIlII(TileObjects.getNearest((String[])stringArray6).hasAction(stringArray7) ? 1 : 0)) {
                                            String[] stringArray8 = new String[lllIlllIl[1]];
                                            stringArray8[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[37]];
                                            TileObjects.getNearest((String[])stringArray8).interact(lllIllIll[lllIlllIl[9]]);
                                            Time.sleepTicks((int)lllIlllIl[3]);

                                        }
                                    }
                                    String[] stringArray9 = new String[lllIlllIl[1]];
                                    stringArray9[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[38]];
                                    if (Q.llIIlIllIlll(TileObjects.getNearest((String[])stringArray9))) {
                                        String[] stringArray10 = new String[lllIlllIl[1]];
                                        stringArray10[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[39]];
                                        String[] stringArray11 = new String[lllIlllIl[1]];
                                        stringArray11[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[40]];
                                        if (Q.llIIlIllIlII(TileObjects.getNearest((String[])stringArray10).hasAction(stringArray11) ? 1 : 0)) {
                                            String[] stringArray12 = new String[lllIlllIl[1]];
                                            stringArray12[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[41]];
                                            TileObjects.getNearest((String[])stringArray12).interact(lllIllIll[lllIlllIl[42]]);
                                            Time.sleepTicks((int)lllIlllIl[3]);

                                        }
                                    }
                                    Movement.walkTo((WorldPoint)kR);

                                    Time.sleepTicks((int)lllIlllIl[1]);

                                }
                                if (Q.llIIlIlllIll(Players.getLocal().getWorldLocation().distanceTo(kR), lllIlllIl[4])) {
                                    String[] stringArray13 = new String[lllIlllIl[1]];
                                    stringArray13[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[43]];
                                    if (Q.llIIlIllIlll(TileObjects.getNearest((String[])stringArray13))) {
                                        String[] stringArray14 = new String[lllIlllIl[1]];
                                        stringArray14[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[44]];
                                        TileObjects.getNearest((String[])stringArray14).interact(lllIllIll[lllIlllIl[45]]);
                                        Time.sleepTicks((int)lllIlllIl[4]);

                                    }
                                }
                            }
                        }
                        int[] nArray8 = new int[lllIlllIl[1]];
                        nArray8[Q.lllIlllIl[0]] = lllIlllIl[24];
                        if (Q.llIIlIllIlII(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                            int[] nArray9 = new int[lllIlllIl[1]];
                            nArray9[Q.lllIlllIl[0]] = lllIlllIl[46];
                            if (Q.llIIlIllIlII(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                kN = lllIlllIl[1];
                            }
                        }
                        if (Q.llIIlIllIlII(kN ? 1 : 0)) {
                            String[] stringArray = new String[lllIlllIl[1]];
                            stringArray[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[47]];
                            if (Q.llIIlIllIllI(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                                int[] nArray10 = new int[lllIlllIl[1]];
                                nArray10[Q.lllIlllIl[0]] = lllIlllIl[48];
                                if (Q.llIIlIllIllI(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                                    String[] stringArray15 = new String[lllIlllIl[1]];
                                    stringArray15[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[49]];
                                    if (Q.llIIlIllIllI(Inventory.contains((String[])stringArray15) ? 1 : 0)) {
                                        Q.cQ();
                                    }
                                    String[] stringArray16 = new String[lllIlllIl[1]];
                                    stringArray16[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[50]];
                                    if (Q.llIIlIllIlII(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                                        if (Q.llIIlIlllIlI(Players.getLocal().getWorldLocation().distanceTo(kS), lllIlllIl[3])) {
                                            AccBuilderGWD.c = lllIllIll[lllIlllIl[51]];
                                            Movement.walkTo((WorldPoint)kS);

                                            Time.sleepTicks((int)lllIlllIl[1]);

                                        }
                                        if (Q.llIIlIlllIll(Players.getLocal().getWorldLocation().distanceTo(kS), lllIlllIl[3])) {
                                            g.a(lllIllIll[lllIlllIl[52]], cG);
                                        }
                                    }
                                }
                            }
                        }
                        if (Q.llIIlIllIlII(kN ? 1 : 0)) {
                            int[] nArray11 = new int[lllIlllIl[1]];
                            nArray11[Q.lllIlllIl[0]] = lllIlllIl[48];
                            if (Q.llIIlIllIlII(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                String[] stringArray = new String[lllIlllIl[1]];
                                stringArray[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[53]];
                                if (Q.llIIlIllIllI(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                                    int[] nArray12 = new int[lllIlllIl[1]];
                                    nArray12[Q.lllIlllIl[0]] = lllIlllIl[24];
                                    if (Q.llIIlIllIllI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                        Q.cQ();
                                    }
                                    int[] nArray13 = new int[lllIlllIl[1]];
                                    nArray13[Q.lllIlllIl[0]] = lllIlllIl[24];
                                    if (Q.llIIlIllIlII(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                        llIlIIIllIlIl = new WorldArea(lllIlllIl[21], lllIlllIl[22], lllIlllIl[19], lllIlllIl[18], lllIlllIl[0]);
                                        if (Q.llIIlIllIllI(llIlIIIllIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderGWD.c = lllIllIll[lllIlllIl[54]];
                                            Movement.walkTo((WorldPoint)kO);

                                            Time.sleepTicks((int)lllIlllIl[1]);

                                        }
                                        if (Q.llIIlIllIlII(llIlIIIllIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            g.a(lllIllIll[lllIlllIl[55]], cG);
                                        }
                                    }
                                }
                            }
                        }
                        String[] stringArray = new String[lllIlllIl[1]];
                        stringArray[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[56]];
                        if (!Q.llIIlIllIlII(Equipment.contains((String[])stringArray) ? 1 : 0)) break block78;
                        String[] stringArray17 = new String[lllIlllIl[1]];
                        stringArray17[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[57]];
                        if (Q.llIIlIlllllI(NPCs.getNearest((String[])stringArray17))) {
                            String[] stringArray18 = new String[lllIlllIl[1]];
                            stringArray18[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[58]];
                            if (Q.llIIlIlllllI(NPCs.getNearest((String[])stringArray18))) {
                                AccBuilderGWD.c = lllIllIll[lllIlllIl[59]];
                                Movement.walkTo((WorldPoint)kT);

                                Time.sleepTicks((int)lllIlllIl[1]);

                            }
                        }
                        String[] stringArray19 = new String[lllIlllIl[1]];
                        stringArray19[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[60]];
                        if (!Q.llIIlIlllllI(NPCs.getNearest((String[])stringArray19))) break block79;
                        String[] stringArray20 = new String[lllIlllIl[1]];
                        stringArray20[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[61]];
                        if (!Q.llIIlIllIlll(NPCs.getNearest((String[])stringArray20))) break block80;
                    }
                    if (Q.llIIlIlllllI(kU)) {
                        Q.cP();
                    }
                    if (Q.llIIlIllIlll(llIlIIIllIlIl = NPCs.getNearest(nPC -> {
                        int n2;
                        if (Q.llIIlIllIlII(nPC.getName().contains(lllIllIll[lllIlllIl[89]]) ? 1 : 0) && Q.llIIllIIIIII(nPC.getInteracting(), Players.getLocal())) {
                            n2 = lllIlllIl[1];

                            if (((2 ^ 0x42) & ~(0xC2 ^ 0x82)) != 0) {
                                return false;
                            }
                        } else {
                            n2 = lllIlllIl[0];
                        }
                        return n2 != 0;
                    })) && Q.llIIlIlllllI(Players.getLocal().getInteracting())) {
                        llIlIIIllIlIl.interact(lllIllIll[lllIlllIl[62]]);
                        Time.sleepTicks((int)lllIlllIl[3]);

                    }
                    if (Q.llIIlIlllllI(llIlIIIllIlIl) && Q.llIIlIlllllI(Players.getLocal().getInteracting())) {
                        String[] stringArray = new String[lllIlllIl[1]];
                        stringArray[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[63]];
                        if (Q.llIIlIllIlll(NPCs.getNearest((String[])stringArray))) {
                            String[] stringArray21 = new String[lllIlllIl[1]];
                            stringArray21[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[15]];
                            if (Q.llIIlIllIllI(NPCs.getNearest((String[])stringArray21).isDead() ? 1 : 0) && Q.llIIlIllIllI(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray22 = new String[lllIlllIl[1]];
                                stringArray22[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[64]];
                                NPCs.getNearest((String[])stringArray22).interact(lllIllIll[lllIlllIl[65]]);
                            }
                        }
                    }
                    if (Q.llIIlIllIlII(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = lllIllIll[lllIlllIl[66]];
                        List llIlIIIllIlII = Dialog.getOptions();
                        if (Q.llIIlIllIllI(llIlIIIllIlII.isEmpty() ? 1 : 0)) {
                            int llIlIIIllIIll = lllIlllIl[0];
                            while (Q.llIIlIllIlIl(llIlIIIllIIll, llIlIIIllIlII.size())) {
                                if (Q.llIIlIllIlII(((Widget)llIlIIIllIlII.get(llIlIIIllIIll)).getText().contains(lllIllIll[lllIlllIl[67]]) ? 1 : 0)) {
                                    String[] stringArray = new String[lllIlllIl[1]];
                                    stringArray[Q.lllIlllIl[0]] = ((Widget)llIlIIIllIlII.get(llIlIIIllIIll)).getText();
                                    Dialog.chooseOption((String[])stringArray);

                                    Time.sleepTicks((int)lllIlllIl[3]);

                                    if (((0x24 ^ 0x30) & ~(0x33 ^ 0x27)) > -1) break;
                                    return;
                                }
                                ++llIlIIIllIIll;

                                if ((39 + 23 - -56 + 35 ^ 0 + 110 - -6 + 41) != 0) continue;
                                return;
                            }
                        }
                    }
                }
                String[] stringArray = new String[lllIlllIl[1]];
                stringArray[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[68]];
                if (Q.llIIlIllIlll(NPCs.getNearest((String[])stringArray))) {
                    if (Q.llIIlIllIlIl(dk, lllIlllIl[1]) && Q.llIIlIllIllI(dl ? 1 : 0)) {
                        as.pZ += lllIlllIl[1];
                        as.u(AccBuilderGWD.m);
                        dk += lllIlllIl[1];
                        as.pZ = lllIlllIl[0];
                        dl = lllIlllIl[1];
                    }
                    if (Q.llIIlIllIlII(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = lllIllIll[lllIlllIl[69]];
                        llIlIIIllIlIl = Dialog.getOptions();
                        if (Q.llIIlIllIllI(llIlIIIllIlIl.isEmpty() ? 1 : 0)) {
                            int llIlIIIllIlII = lllIlllIl[0];
                            while (Q.llIIlIllIlIl(llIlIIIllIlII, llIlIIIllIlIl.size())) {
                                String llIlIIIllIIll = kU[llIlIIIllIlII];
                                int llIlIIIllIIlI = lllIlllIl[0];
                                while (Q.llIIlIllIlIl(llIlIIIllIIlI, llIlIIIllIlIl.size())) {
                                    if (Q.llIIlIllIlII(((Widget)llIlIIIllIlIl.get(llIlIIIllIIlI)).getText().contains(llIlIIIllIIll) ? 1 : 0)) {
                                        System.out.println("Selecting: " + ((Widget)llIlIIIllIlIl.get(llIlIIIllIIlI)).getText());
                                        Time.sleepTicks((int)lllIlllIl[3]);

                                        String[] stringArray23 = new String[lllIlllIl[1]];
                                        stringArray23[Q.lllIlllIl[0]] = ((Widget)llIlIIIllIlIl.get(llIlIIIllIIlI)).getText();
                                        Dialog.chooseOption((String[])stringArray23);

                                        Time.sleepTicks((int)lllIlllIl[12]);

                                        if (2 > 0) break;
                                        return;
                                    }
                                    ++llIlIIIllIIlI;

                                    if (1 == 1) continue;
                                    return;
                                }
                                ++llIlIIIllIlII;

                                if (3 >= 0) continue;
                                return;
                            }
                        }
                    }
                }
            }
            g.a(cG);
        }
    }

    static {
        Q.llIIlIllIIlI();
        Q.llIIlIllIIII();
        kM = lllIllIll[lllIlllIl[90]];
        kL = new 7ff08cb7-2eac-4b0f-b288-ca118289a708Manager();
        bx = new ArrayList<d>();
        dg = new WorldPoint(lllIlllIl[91], lllIlllIl[92], lllIlllIl[0]);
        kO = new WorldPoint(lllIlllIl[93], lllIlllIl[94], lllIlllIl[0]);
        kP = new WorldPoint(lllIlllIl[93], lllIlllIl[95], lllIlllIl[3]);
        kQ = new WorldPoint(lllIlllIl[96], lllIlllIl[97], lllIlllIl[0]);
        kR = new WorldPoint(lllIlllIl[96], lllIlllIl[98], lllIlllIl[0]);
        kS = new WorldPoint(lllIlllIl[99], lllIlllIl[100], lllIlllIl[1]);
        kT = new WorldPoint(lllIlllIl[101], lllIlllIl[102], lllIlllIl[0]);
        String[] stringArray = new String[lllIlllIl[31]];
        stringArray[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[103]];
        stringArray[Q.lllIlllIl[1]] = lllIllIll[lllIlllIl[104]];
        stringArray[Q.lllIlllIl[3]] = lllIllIll[lllIlllIl[105]];
        stringArray[Q.lllIlllIl[5]] = lllIllIll[lllIlllIl[106]];
        stringArray[Q.lllIlllIl[4]] = lllIllIll[lllIlllIl[107]];
        stringArray[Q.lllIlllIl[10]] = lllIllIll[lllIlllIl[108]];
        stringArray[Q.lllIlllIl[16]] = lllIllIll[lllIlllIl[109]];
        stringArray[Q.lllIlllIl[18]] = lllIllIll[lllIlllIl[110]];
        stringArray[Q.lllIlllIl[19]] = lllIllIll[lllIlllIl[111]];
        stringArray[Q.lllIlllIl[20]] = lllIllIll[lllIlllIl[112]];
        stringArray[Q.lllIlllIl[12]] = lllIllIll[lllIlllIl[113]];
        stringArray[Q.lllIlllIl[23]] = lllIllIll[lllIlllIl[114]];
        stringArray[Q.lllIlllIl[25]] = lllIllIll[lllIlllIl[115]];
        stringArray[Q.lllIlllIl[26]] = lllIllIll[lllIlllIl[116]];
        stringArray[Q.lllIlllIl[27]] = lllIllIll[lllIlllIl[117]];
        stringArray[Q.lllIlllIl[28]] = lllIllIll[lllIlllIl[118]];
        stringArray[Q.lllIlllIl[29]] = lllIllIll[lllIlllIl[119]];
        stringArray[Q.lllIlllIl[30]] = lllIllIll[lllIlllIl[120]];
        cG = stringArray;
    }

    /*
     * WARNING - void declaration
     */
    private static void cQ() {
        void llIlIIIlIlllI;
        BankLocation bankLocation = BankLocation.getNearest();
        if (Q.llIIlIllIlll(bankLocation) && Q.llIIlIllIllI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllIllIll[lllIlllIl[76]];
            a.a(bankLocation);
        }
        if (Q.llIIlIllIlll(llIlIIIlIlllI) && Q.llIIlIllIlII(llIlIIIlIlllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (Q.llIIlIllIllI(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIlllIl[2]);

                Time.sleepTicks((int)lllIlllIl[5]);

            }
            if (Q.llIIlIllIlII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderGWD.c = lllIllIll[lllIlllIl[77]];
                if (Q.llIIlIllIlII(kN ? 1 : 0)) {
                    int[] nArray = new int[lllIlllIl[1]];
                    nArray[Q.lllIlllIl[0]] = lllIlllIl[48];
                    if (Q.llIIlIllIllI(Inventory.contains((int[])nArray) ? 1 : 0) && Q.llIIlIlllIII(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)lllIlllIl[4]);

                    }
                }
                if (Q.llIIlIlllIII(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)lllIlllIl[3]);

                }
                if (Q.llIIlIllIlII(kN ? 1 : 0)) {
                    int[] nArray = new int[lllIlllIl[1]];
                    nArray[Q.lllIlllIl[0]] = lllIlllIl[48];
                    if (Q.llIIlIllIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        a.a(lllIlllIl[11], lllIlllIl[1]);
                        a.a(lllIlllIl[6], lllIlllIl[12]);
                        a.a(lllIlllIl[48], lllIlllIl[1]);
                        a.a(lllIlllIl[24], lllIlllIl[1]);
                        a.a(lllIlllIl[46], lllIlllIl[1]);
                        Time.sleepTicks((int)lllIlllIl[1]);

                        int[] nArray2 = new int[lllIlllIl[1]];
                        nArray2[Q.lllIlllIl[0]] = lllIlllIl[11];
                        if (Q.llIIlIllIllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                            a.a(lllIlllIl[78], lllIlllIl[1]);
                        }
                        a.a(lllIlllIl[17], Inventory.getFreeSlots() - lllIlllIl[1]);
                    }
                }
                if (Q.llIIlIllIlII(kN ? 1 : 0)) {
                    int[] nArray = new int[lllIlllIl[1]];
                    nArray[Q.lllIlllIl[0]] = lllIlllIl[48];
                    if (Q.llIIlIllIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        if (Q.llIIlIllIllI(Equipment.contains((int[])f.aY) ? 1 : 0) && Q.llIIlIllIllI(Inventory.contains((int[])f.aY) ? 1 : 0)) {
                            a.b(f.aY, lllIlllIl[1]);
                        }
                        if (Q.llIIlIllIlII(Inventory.contains((int[])f.aY) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aY).interact(lllIllIll[lllIlllIl[79]]);
                            Time.sleepTicks((int)lllIlllIl[5]);

                        }
                        if (Q.llIIlIllIllI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)lllIlllIl[10]);

                        }
                        if (Q.llIIlIllIlII(Bank.isOpen() ? 1 : 0)) {
                            a.a(lllIlllIl[11], lllIlllIl[1]);
                            a.a(lllIlllIl[6], lllIlllIl[12]);
                            a.a(lllIlllIl[7], lllIlllIl[9]);
                        }
                    }
                }
            }
        }
    }

    private static boolean llIIlIlllIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIlIlllIII(int n2) {
        return n2 > 0;
    }

    private static void llIIlIllIIII() {
        lllIllIll = new String[lllIlllIl[121]];
        Q.lllIllIll[Q.lllIlllIl[0]] = "Finished buying items, switching back to quest";
        Q.lllIllIll[Q.lllIlllIl[1]] = "Nav to bank";
        Q.lllIllIll[Q.lllIlllIl[3]] = "Handling banking";
        Q.lllIllIll[Q.lllIlllIl[5]] = "We are missing quest supplies, switching to BUYING";
        Q.lllIllIll[Q.lllIlllIl[4]] = "We are missing quest supplies, switching to BUYING";
        Q.lllIllIll[Q.lllIlllIl[10]] = "Wear";
        Q.lllIllIll[Q.lllIlllIl[16]] = "Drink";
        Q.lllIllIll[Q.lllIlllIl[18]] = "Eat";
        Q.lllIllIll[Q.lllIlllIl[19]] = "Nav to start";
        Q.lllIllIll[Q.lllIlllIl[20]] = "Aris";
        Q.lllIllIll[Q.lllIlllIl[12]] = "Nav to sir pyrsin";
        Q.lllIllIll[Q.lllIlllIl[23]] = "Sir Prysin";
        Q.lllIllIll[Q.lllIlllIl[25]] = "Silverlight";
        Q.lllIllIll[Q.lllIlllIl[26]] = "Nav to captain";
        Q.lllIllIll[Q.lllIlllIl[27]] = "Captain Rovin";
        Q.lllIllIll[Q.lllIlllIl[28]] = "Bucket of water";
        Q.lllIllIll[Q.lllIlllIl[29]] = "Nav to drain";
        Q.lllIllIll[Q.lllIlllIl[30]] = "Bucket of water";
        Q.lllIllIll[Q.lllIlllIl[31]] = "Drain";
        Q.lllIllIll[Q.lllIlllIl[32]] = "Bucket of water";
        Q.lllIllIll[Q.lllIlllIl[33]] = "Nav to sewer key";
        Q.lllIllIll[Q.lllIlllIl[34]] = "Manhole";
        Q.lllIllIll[Q.lllIlllIl[35]] = "Manhole";
        Q.lllIllIll[Q.lllIlllIl[36]] = "Open";
        Q.lllIllIll[Q.lllIlllIl[37]] = "Manhole";
        Q.lllIllIll[Q.lllIlllIl[9]] = "Open";
        Q.lllIllIll[Q.lllIlllIl[38]] = "Manhole";
        Q.lllIllIll[Q.lllIlllIl[39]] = "Manhole";
        Q.lllIllIll[Q.lllIlllIl[40]] = "Climb-down";
        Q.lllIllIll[Q.lllIlllIl[41]] = "Manhole";
        Q.lllIllIll[Q.lllIlllIl[42]] = "Climb-down";
        Q.lllIllIll[Q.lllIlllIl[43]] = "Rusty key";
        Q.lllIllIll[Q.lllIlllIl[44]] = "Rusty key";
        Q.lllIllIll[Q.lllIlllIl[45]] = "Take";
        Q.lllIllIll[Q.lllIlllIl[47]] = "Silverlight";
        Q.lllIllIll[Q.lllIlllIl[49]] = "Bones";
        Q.lllIllIll[Q.lllIlllIl[50]] = "Bones";
        Q.lllIllIll[Q.lllIlllIl[51]] = "Nav to wizard";
        Q.lllIllIll[Q.lllIlllIl[52]] = "Wizard Traiborn";
        Q.lllIllIll[Q.lllIlllIl[53]] = "Silverlight";
        Q.lllIllIll[Q.lllIlllIl[54]] = "Nav to sir pyrsin";
        Q.lllIllIll[Q.lllIlllIl[55]] = "Sir Prysin";
        Q.lllIllIll[Q.lllIlllIl[56]] = "Silverlight";
        Q.lllIllIll[Q.lllIlllIl[57]] = "Delrith";
        Q.lllIllIll[Q.lllIlllIl[58]] = "Weakened Delrith";
        Q.lllIllIll[Q.lllIlllIl[59]] = "Nav to demon";
        Q.lllIllIll[Q.lllIlllIl[60]] = "Delrith";
        Q.lllIllIll[Q.lllIlllIl[61]] = "Weakened Delrith";
        Q.lllIllIll[Q.lllIlllIl[62]] = "Attack";
        Q.lllIllIll[Q.lllIlllIl[63]] = "Delrith";
        Q.lllIllIll[Q.lllIlllIl[15]] = "Delrith";
        Q.lllIllIll[Q.lllIlllIl[64]] = "Delrith";
        Q.lllIllIll[Q.lllIlllIl[65]] = "Attack";
        Q.lllIllIll[Q.lllIlllIl[66]] = "Banishing";
        Q.lllIllIll[Q.lllIlllIl[67]] = "[";
        Q.lllIllIll[Q.lllIlllIl[68]] = "Weakened Delrith";
        Q.lllIllIll[Q.lllIlllIl[69]] = "Banishing";
        Q.lllIllIll[Q.lllIlllIl[75]] = ", ";
        Q.lllIllIll[Q.lllIlllIl[76]] = "Nav to bank";
        Q.lllIllIll[Q.lllIlllIl[77]] = "Handling banking";
        Q.lllIllIll[Q.lllIlllIl[79]] = "Wear";
        Q.lllIllIll[Q.lllIlllIl[87]] = "Demon Slayer";
        Q.lllIllIll[Q.lllIlllIl[88]] = "ring of wealth (";
        Q.lllIllIll[Q.lllIlllIl[89]] = "wizard";
        Q.lllIllIll[Q.lllIlllIl[90]] = "Now what was that incantation again?";
        Q.lllIllIll[Q.lllIlllIl[103]] = "Yes.";
        Q.lllIllIll[Q.lllIlllIl[104]] = "The Demon Slayer Quest";
        Q.lllIllIll[Q.lllIlllIl[105]] = "Okay, where is he? I'll kill him for you!";
        Q.lllIllIll[Q.lllIlllIl[106]] = "So how did Wally kill Delrith?";
        Q.lllIllIll[Q.lllIlllIl[107]] = "What is the magical incantation?";
        Q.lllIllIll[Q.lllIlllIl[108]] = "Aris said I should come and talk to you.";
        Q.lllIllIll[Q.lllIlllIl[109]] = "I need to find Silverlight.";
        Q.lllIllIll[Q.lllIlllIl[110]] = "He's back and unfortunately I've got to deal with him.";
        Q.lllIllIll[Q.lllIlllIl[111]] = "So give me the keys!";
        Q.lllIllIll[Q.lllIlllIl[112]] = "Yes I know, but this is important.";
        Q.lllIllIll[Q.lllIlllIl[113]] = "There's a demon who wants to invade this city.";
        Q.lllIllIll[Q.lllIlllIl[114]] = "Yes, very.";
        Q.lllIllIll[Q.lllIlllIl[115]] = "It's not them who are going to fight the demon, it's me.";
        Q.lllIllIll[Q.lllIlllIl[116]] = "Sir Prysin said you would give me the key.";
        Q.lllIllIll[Q.lllIlllIl[117]] = "Why did he give you one of the keys then?";
        Q.lllIllIll[Q.lllIlllIl[118]] = "Talk about Demon Slayer.";
        Q.lllIllIll[Q.lllIlllIl[119]] = "Well, have you got any keys knocking around?";
        Q.lllIllIll[Q.lllIlllIl[120]] = "I'll get the bones for you.";
    }

}

