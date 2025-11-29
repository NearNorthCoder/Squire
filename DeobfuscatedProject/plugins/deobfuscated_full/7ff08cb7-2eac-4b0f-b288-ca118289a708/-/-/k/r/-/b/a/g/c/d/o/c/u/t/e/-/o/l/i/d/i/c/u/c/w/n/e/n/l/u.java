/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
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
 */
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.as;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.j;
import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
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

public class u
implements ab {
    public static /* synthetic */ List<d> bx;
    public static /* synthetic */ WorldPoint dg;
    public static /* synthetic */ WorldPoint dj;
    public static /* synthetic */ WorldPoint dh;
    private static /* synthetic */ String[] llIIlIIlI;
    private static /* synthetic */ String[] cG;
    private static /* synthetic */ int[] llIIlIlIl;
    public static /* synthetic */ boolean bv;
    static /* synthetic */ boolean dl;
    static /* synthetic */ int dk;
    public static /* synthetic */ WorldPoint di;
    private static /* synthetic */ WorldPoint dm;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        block4: {
            block5: {
                int[] nArray = new int[llIIlIlIl[0]];
                nArray[u.llIIlIlIl[1]] = llIIlIlIl[6];
                if (!u.lIlIlIllIlIl(Inventory.getCount((int[])nArray))) break block4;
                int[] nArray2 = new int[llIIlIlIl[0]];
                nArray2[u.llIIlIlIl[1]] = llIIlIlIl[8];
                if (!u.lIlIlIllIlIl(Inventory.getCount((int[])nArray2))) break block4;
                int[] nArray3 = new int[llIIlIlIl[0]];
                nArray3[u.llIIlIlIl[1]] = llIIlIlIl[10];
                if (!u.lIlIlIlllIll(Inventory.getCount((int[])nArray3))) break block5;
                int[] nArray4 = new int[llIIlIlIl[0]];
                nArray4[u.llIIlIlIl[1]] = llIIlIlIl[10];
                if (!u.lIlIlIllIIIl(Equipment.contains((int[])nArray4) ? 1 : 0)) break block4;
            }
            int[] nArray = new int[llIIlIlIl[0]];
            nArray[u.llIIlIlIl[1]] = llIIlIlIl[13];
            if (u.lIlIlIllIlIl(Inventory.getCount((int[])nArray))) {
                n2 = llIIlIlIl[0];
                0;
                if (-2 < 0) return n2 != 0;
                return (3 & ~3) != 0;
            }
        }
        n2 = llIIlIlIl[1];
        return n2 != 0;
    }

    private static String lIlIlIIlIIIl(String lIlIllllllIIlI, String lIlIllllllIIll) {
        try {
            SecretKeySpec lIlIllllllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIllllllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIllllllIllI = Cipher.getInstance("Blowfish");
            lIlIllllllIllI.init(llIIlIlIl[3], lIlIllllllIlll);
            return new String(lIlIllllllIllI.doFinal(Base64.getDecoder().decode(lIlIllllllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIllllllIlIl) {
            lIlIllllllIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIllIlII(Object object) {
        return object != null;
    }

    static {
        u.lIlIlIlIllll();
        u.lIlIlIIllllI();
        bx = new ArrayList<d>();
        dg = new WorldPoint(llIIlIlIl[88], llIIlIlIl[89], llIIlIlIl[1]);
        dh = new WorldPoint(llIIlIlIl[90], llIIlIlIl[91], llIIlIlIl[1]);
        di = new WorldPoint(llIIlIlIl[92], llIIlIlIl[93], llIIlIlIl[1]);
        dj = new WorldPoint(llIIlIlIl[94], llIIlIlIl[95], llIIlIlIl[1]);
        dm = null;
        String[] stringArray = new String[llIIlIlIl[4]];
        stringArray[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[96]];
        stringArray[u.llIIlIlIl[0]] = llIIlIIlI[llIIlIlIl[97]];
        stringArray[u.llIIlIlIl[3]] = llIIlIIlI[llIIlIlIl[98]];
        stringArray[u.llIIlIlIl[9]] = llIIlIIlI[llIIlIlIl[99]];
        cG = stringArray;
    }

    private static void Q() {
        d lIlIlllllllllI;
        block10: {
            block9: {
                Object lIlIllllllllll;
                int[] nArray = new int[llIIlIlIl[0]];
                nArray[u.llIIlIlIl[1]] = llIIlIlIl[8];
                if (u.lIlIlIllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(llIIlIlIl[8], llIIlIlIl[0], llIIlIlIl[81]);
                    bx.add(d2);
                    0;
                }
                int[] nArray2 = new int[llIIlIlIl[0]];
                nArray2[u.llIIlIlIl[1]] = llIIlIlIl[10];
                if (u.lIlIlIllIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lIlIllllllllll = new d(llIIlIlIl[10], llIIlIlIl[0], llIIlIlIl[81]);
                    bx.add((d)lIlIllllllllll);
                    0;
                }
                int[] nArray3 = new int[llIIlIlIl[0]];
                nArray3[u.llIIlIlIl[1]] = llIIlIlIl[13];
                if (u.lIlIlIllIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    lIlIllllllllll = new d(llIIlIlIl[13], llIIlIlIl[50], llIIlIlIl[82]);
                    bx.add((d)lIlIllllllllll);
                    0;
                }
                int[] nArray4 = new int[llIIlIlIl[0]];
                nArray4[u.llIIlIlIl[1]] = llIIlIlIl[11];
                if (u.lIlIlIllIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    lIlIllllllllll = new d(llIIlIlIl[11], llIIlIlIl[12], j.ch);
                    bx.add((d)lIlIllllllllll);
                    0;
                }
                if (u.lIlIlIllIIll(Bank.contains((Predicate)(lIlIllllllllll = item -> item.getName().toLowerCase().contains(llIIlIIlI[llIIlIlIl[87]]))) ? 1 : 0)) {
                    lIlIlllllllllI = new d(llIIlIlIl[83], llIIlIlIl[12], llIIlIlIl[84]);
                    bx.add(lIlIlllllllllI);
                    0;
                }
                int[] nArray5 = new int[llIIlIlIl[0]];
                nArray5[u.llIIlIlIl[1]] = llIIlIlIl[7];
                if (!u.lIlIlIllIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block9;
                int[] nArray6 = new int[llIIlIlIl[0]];
                nArray6[u.llIIlIlIl[1]] = llIIlIlIl[7];
                if (!u.lIlIlIllIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block10;
                int[] nArray7 = new int[llIIlIlIl[0]];
                nArray7[u.llIIlIlIl[1]] = llIIlIlIl[7];
                if (!u.lIlIlIllIIlI(Bank.getFirst((int[])nArray7).getQuantity(), llIIlIlIl[12])) break block10;
            }
            lIlIlllllllllI = new d(llIIlIlIl[7], llIIlIlIl[28], llIIlIlIl[82]);
            bx.add(lIlIlllllllllI);
            0;
        }
        int[] nArray = new int[llIIlIlIl[0]];
        nArray[u.llIIlIlIl[1]] = llIIlIlIl[6];
        if (u.lIlIlIllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIlIlllllllllI = new d(llIIlIlIl[6], llIIlIlIl[57], llIIlIlIl[82]);
            bx.add(lIlIlllllllllI);
            0;
        }
    }

    private static boolean lIlIlIllllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIlIllIllI(int n2, int n3) {
        return n2 > n3;
    }

    public static void aX() {
        block63: {
            block64: {
                block65: {
                    if (u.lIlIlIllIIIl(bv ? 1 : 0)) {
                        b.a(bx);
                        if (u.lIlIlIllIIlI(bx.size(), llIIlIlIl[0])) {
                            System.out.println(llIIlIIlI[llIIlIlIl[1]]);
                            bv = llIIlIlIl[1];
                        }
                    }
                    if (!u.lIlIlIllIIll(bv ? 1 : 0)) break block63;
                    if (u.lIlIlIllIIll(u.an() ? 1 : 0) && u.lIlIlIllIIll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                        BankLocation lIllIIIIIIIIlI = BankLocation.getNearest();
                        if (u.lIlIlIllIlII(lIllIIIIIIIIlI) && u.lIlIlIllIIll(lIllIIIIIIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[0]];
                            a.a(lIllIIIIIIIIlI);
                        }
                        if (u.lIlIlIllIlII(lIllIIIIIIIIlI) && u.lIlIlIllIIIl(lIllIIIIIIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (u.lIlIlIllIIll(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlIlIl[2]);
                                0;
                            }
                            if (u.lIlIlIllIIIl(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[3]];
                                if (u.lIlIlIllIlIl(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)llIIlIlIl[4]);
                                    0;
                                }
                                if (u.lIlIlIllIlIl(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)llIIlIlIl[3]);
                                    0;
                                }
                                int[] nArray = new int[llIIlIlIl[5]];
                                nArray[u.llIIlIlIl[1]] = llIIlIlIl[6];
                                nArray[u.llIIlIlIl[0]] = llIIlIlIl[7];
                                nArray[u.llIIlIlIl[3]] = llIIlIlIl[8];
                                nArray[u.llIIlIlIl[9]] = llIIlIlIl[10];
                                nArray[u.llIIlIlIl[4]] = llIIlIlIl[11];
                                nArray[u.llIIlIlIl[12]] = llIIlIlIl[13];
                                if (u.lIlIlIllIIll(e.d(nArray) ? 1 : 0)) {
                                    u.Q();
                                    System.out.println(llIIlIIlI[llIIlIlIl[9]]);
                                    bv = llIIlIlIl[0];
                                    return;
                                }
                                int[] nArray2 = new int[llIIlIlIl[5]];
                                nArray2[u.llIIlIlIl[1]] = llIIlIlIl[6];
                                nArray2[u.llIIlIlIl[0]] = llIIlIlIl[7];
                                nArray2[u.llIIlIlIl[3]] = llIIlIlIl[8];
                                nArray2[u.llIIlIlIl[9]] = llIIlIlIl[10];
                                nArray2[u.llIIlIlIl[4]] = llIIlIlIl[11];
                                nArray2[u.llIIlIlIl[12]] = llIIlIlIl[13];
                                if (u.lIlIlIllIIIl(e.d(nArray2) ? 1 : 0)) {
                                    int[] nArray3 = new int[llIIlIlIl[3]];
                                    nArray3[u.llIIlIlIl[1]] = llIIlIlIl[8];
                                    nArray3[u.llIIlIlIl[0]] = llIIlIlIl[10];
                                    a.a(nArray3);
                                    a.a(llIIlIlIl[6], llIIlIlIl[14]);
                                    a.a(llIIlIlIl[7], llIIlIlIl[14]);
                                    a.a(llIIlIlIl[15], llIIlIlIl[14]);
                                    a.b(f.aY, llIIlIlIl[0]);
                                    a.a(llIIlIlIl[11], llIIlIlIl[4]);
                                    a.a(llIIlIlIl[13], llIIlIlIl[16]);
                                }
                            }
                        }
                    }
                    if (u.lIlIlIllIIIl(Inventory.contains((int[])f.bc) ? 1 : 0) && u.lIlIlIllIIlI(Movement.getRunEnergy(), llIIlIlIl[17])) {
                        Inventory.getFirst((int[])f.bc).interact(llIIlIIlI[llIIlIlIl[4]]);
                        Time.sleepTicks((int)llIIlIlIl[0]);
                        0;
                    }
                    if (u.lIlIlIllIIIl(u.an() ? 1 : 0) && u.lIlIlIllIIll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                        if (u.lIlIlIllIllI(Players.getLocal().getWorldLocation().distanceTo(dg), llIIlIlIl[4])) {
                            if (u.lIlIlIllIIIl(Inventory.contains((int[])f.aY) ? 1 : 0) && u.lIlIlIllIIll(Equipment.contains((int[])f.aY) ? 1 : 0)) {
                                Inventory.getFirst((int[])f.aY).interact(llIIlIIlI[llIIlIlIl[12]]);
                            }
                            if (u.lIlIlIllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[5]];
                            Movement.walkTo((WorldPoint)dg);
                            0;
                            Time.sleepTicks((int)llIIlIlIl[0]);
                            0;
                        }
                        if (u.lIlIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(dg), llIIlIlIl[4])) {
                            AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[18]];
                            dk = llIIlIlIl[1];
                            if (u.lIlIlIllIIll(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[llIIlIlIl[0]];
                                stringArray[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[16]];
                                TileObjects.getNearest((String[])stringArray).interact(llIIlIIlI[llIIlIlIl[19]]);
                                Time.sleepTicks((int)llIIlIlIl[3]);
                                0;
                            }
                            g.a(cG);
                        }
                    }
                    if (u.lIlIlIlllIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIIlIlIl[12])) {
                        if (u.lIlIlIllIllI(Players.getLocal().getWorldLocation().distanceTo(dh), llIIlIlIl[4])) {
                            AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[14]];
                            Movement.walkTo((WorldPoint)dh);
                            0;
                            Time.sleepTicks((int)llIIlIlIl[0]);
                            0;
                            if (u.lIlIlIllIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIIlIlIl[20], llIIlIlIl[21], llIIlIlIl[1])) ? 1 : 0)) {
                                AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[22]];
                                e.c(new WorldPoint(llIIlIlIl[23], llIIlIlIl[24], llIIlIlIl[1]));
                                Time.sleepTicks((int)llIIlIlIl[5]);
                                0;
                            }
                        }
                        if (u.lIlIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(dh), llIIlIlIl[4])) {
                            AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[25]];
                            g.a(llIIlIIlI[llIIlIlIl[26]], cG, llIIlIlIl[0]);
                        }
                    }
                    if (u.lIlIlIlllIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIIlIlIl[14])) {
                        if (u.lIlIlIllIllI(Players.getLocal().getWorldLocation().distanceTo(di), llIIlIlIl[4])) {
                            AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[27]];
                            Movement.walkTo((WorldPoint)di);
                            0;
                            Time.sleepTicks((int)llIIlIlIl[0]);
                            0;
                        }
                        if (u.lIlIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(di), llIIlIlIl[4])) {
                            int[] nArray = new int[llIIlIlIl[0]];
                            nArray[u.llIIlIlIl[1]] = llIIlIlIl[8];
                            if (u.lIlIlIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray4 = new int[llIIlIlIl[0]];
                                nArray4[u.llIIlIlIl[1]] = llIIlIlIl[8];
                                String[] stringArray = new String[llIIlIlIl[0]];
                                stringArray[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[28]];
                                Inventory.getFirst((int[])nArray4).useOn(TileObjects.getNearest((String[])stringArray));
                                Time.sleepTicks((int)llIIlIlIl[3]);
                                0;
                            }
                        }
                    }
                    if (!u.lIlIlIlllIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIIlIlIl[28])) break block64;
                    int[] nArray = new int[llIIlIlIl[0]];
                    nArray[u.llIIlIlIl[1]] = llIIlIlIl[10];
                    if (u.lIlIlIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray5 = new int[llIIlIlIl[0]];
                        nArray5[u.llIIlIlIl[1]] = llIIlIlIl[10];
                        Inventory.getFirst((int[])nArray5).interact(llIIlIIlI[llIIlIlIl[29]]);
                    }
                    if (u.lIlIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(di), llIIlIlIl[4])) {
                        String[] stringArray = new String[llIIlIlIl[0]];
                        stringArray[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[30]];
                        TileObjects.getNearest((String[])stringArray).interact(llIIlIIlI[llIIlIlIl[31]]);
                        Time.sleepTicks((int)llIIlIlIl[9]);
                        0;
                    }
                    if (!u.lIlIlIllIllI(Players.getLocal().getLocalLocation().distanceTo(new LocalPoint(llIIlIlIl[32], llIIlIlIl[33])), llIIlIlIl[34])) break block65;
                    String[] stringArray = new String[llIIlIlIl[0]];
                    stringArray[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[35]];
                    if (!u.lIlIlIllIlII(TileObjects.getNearest((String[])stringArray))) break block64;
                }
                String[] stringArray = new String[llIIlIlIl[0]];
                stringArray[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[36]];
                if (u.lIlIlIllIlII(TileObjects.getNearest((String[])stringArray))) {
                    if (u.lIlIlIllIllI(Players.getLocal().getLocalLocation().getY(), llIIlIlIl[37])) {
                        String[] stringArray2 = new String[llIIlIlIl[0]];
                        stringArray2[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[38]];
                        if (u.lIlIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(TileObjects.getNearest((String[])stringArray2).getWorldLocation()), llIIlIlIl[14])) {
                            String[] stringArray3 = new String[llIIlIlIl[0]];
                            stringArray3[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[39]];
                            if (u.lIlIlIlllIIl(NPCs.getNearest((String[])stringArray3))) {
                                AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[40]];
                                String[] stringArray4 = new String[llIIlIlIl[0]];
                                stringArray4[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[41]];
                                TileObjects.getNearest((String[])stringArray4).interact(llIIlIIlI[llIIlIlIl[42]]);
                                Time.sleepTicks((int)llIIlIlIl[14]);
                                0;
                            }
                        }
                    }
                    String[] stringArray5 = new String[llIIlIlIl[0]];
                    stringArray5[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[43]];
                    if (u.lIlIlIlllIIl(NPCs.getNearest((String[])stringArray5)) && u.lIlIlIllIIll(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[44]];
                        String[] stringArray6 = new String[llIIlIlIl[0]];
                        stringArray6[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[45]];
                        TileObjects.getNearest((String[])stringArray6).interact(llIIlIIlI[llIIlIlIl[46]]);
                        Time.sleepTicks((int)llIIlIlIl[12]);
                        0;
                        g.a(cG);
                    }
                    g.a(cG);
                }
            }
            if (u.lIlIlIlllIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIIlIlIl[36])) {
                AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[47]];
                g.a(llIIlIIlI[llIIlIlIl[48]], cG);
            }
            if (u.lIlIlIlllIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIIlIlIl[42])) {
                if (u.lIlIlIllIllI(Players.getLocal().getWorldLocation().distanceTo(di), llIIlIlIl[4])) {
                    String[] stringArray = new String[llIIlIlIl[0]];
                    stringArray[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[49]];
                    if (u.lIlIlIlllIIl(NPCs.getNearest((String[])stringArray))) {
                        String[] stringArray7 = new String[llIIlIlIl[0]];
                        stringArray7[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[50]];
                        if (u.lIlIlIllIIll(Equipment.contains((String[])stringArray7) ? 1 : 0)) {
                            String[] stringArray8 = new String[llIIlIlIl[0]];
                            stringArray8[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[51]];
                            if (u.lIlIlIllIIIl(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                                String[] stringArray9 = new String[llIIlIlIl[0]];
                                stringArray9[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[52]];
                                Inventory.getFirst((String[])stringArray9).interact(llIIlIIlI[llIIlIlIl[53]]);
                            }
                        }
                        AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[54]];
                        Movement.walkTo((WorldPoint)di);
                        0;
                        Time.sleepTicks((int)llIIlIlIl[0]);
                        0;
                    }
                }
                if (u.lIlIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(di), llIIlIlIl[4])) {
                    AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[55]];
                    String[] stringArray = new String[llIIlIlIl[0]];
                    stringArray[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[56]];
                    if (u.lIlIlIllIlII(TileObjects.getNearest((String[])stringArray))) {
                        String[] stringArray10 = new String[llIIlIlIl[0]];
                        stringArray10[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[57]];
                        TileObjects.getNearest((String[])stringArray10).interact(llIIlIIlI[llIIlIlIl[58]]);
                        Time.sleepTicks((int)llIIlIlIl[9]);
                        0;
                    }
                }
                if (u.lIlIlIllIllI(Players.getLocal().getLocalLocation().getY(), llIIlIlIl[37])) {
                    String[] stringArray = new String[llIIlIlIl[0]];
                    stringArray[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[59]];
                    if (u.lIlIlIllIllI(Players.getLocal().getWorldLocation().distanceTo(TileObjects.getNearest((String[])stringArray).getWorldLocation()), llIIlIlIl[18])) {
                        AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[60]];
                        String[] stringArray11 = new String[llIIlIlIl[0]];
                        stringArray11[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[61]];
                        TileObjects.getNearest((String[])stringArray11).interact(llIIlIIlI[llIIlIlIl[62]]);
                        Time.sleepTicks((int)llIIlIlIl[14]);
                        0;
                    }
                }
                if (u.lIlIlIlllIIl(Players.getLocal().getInteracting()) && u.lIlIlIllIIll(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[llIIlIlIl[0]];
                    stringArray[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[63]];
                    if (u.lIlIlIllIIll(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray12 = new String[llIIlIlIl[0]];
                        stringArray12[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[64]];
                        if (u.lIlIlIllIIIl(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                            String[] stringArray13 = new String[llIIlIlIl[0]];
                            stringArray13[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[65]];
                            Inventory.getFirst((String[])stringArray13).interact(llIIlIIlI[llIIlIlIl[66]]);
                        }
                    }
                    int[] nArray = new int[llIIlIlIl[0]];
                    nArray[u.llIIlIlIl[1]] = llIIlIlIl[10];
                    if (u.lIlIlIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[llIIlIlIl[0]];
                        nArray6[u.llIIlIlIl[1]] = llIIlIlIl[10];
                        if (u.lIlIlIllIIll(Equipment.contains((int[])nArray6) ? 1 : 0)) {
                            int[] nArray7 = new int[llIIlIlIl[0]];
                            nArray7[u.llIIlIlIl[1]] = llIIlIlIl[10];
                            Inventory.getFirst((int[])nArray7).interact(llIIlIIlI[llIIlIlIl[34]]);
                        }
                    }
                    String[] stringArray14 = new String[llIIlIlIl[0]];
                    stringArray14[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[67]];
                    NPCs.getNearest((String[])stringArray14).interact(llIIlIIlI[llIIlIlIl[68]]);
                    Time.sleepTicks((int)llIIlIlIl[0]);
                    0;
                }
                if (u.lIlIlIlllIlI(u.lIlIlIllIIII(e.w(), 60.0))) {
                    int[] nArray = new int[llIIlIlIl[0]];
                    nArray[u.llIIlIlIl[1]] = llIIlIlIl[13];
                    if (u.lIlIlIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray8 = new int[llIIlIlIl[0]];
                        nArray8[u.llIIlIlIl[1]] = llIIlIlIl[13];
                        Inventory.getFirst((int[])nArray8).interact(llIIlIIlI[llIIlIlIl[69]]);
                        Time.sleepTicks((int)llIIlIlIl[0]);
                        0;
                    }
                }
                g.a(cG);
            }
            if (u.lIlIlIlllIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIIlIlIl[47])) {
                String[] stringArray = new String[llIIlIlIl[0]];
                stringArray[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[70]];
                if (u.lIlIlIllIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[71]];
                    String[] stringArray15 = new String[llIIlIlIl[0]];
                    stringArray15[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[72]];
                    TileObjects.getNearest((String[])stringArray15).interact(llIIlIIlI[llIIlIlIl[73]]);
                    Time.sleepTicks((int)llIIlIlIl[4]);
                    0;
                }
                String[] stringArray16 = new String[llIIlIlIl[0]];
                stringArray16[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[74]];
                if (u.lIlIlIllIIIl(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                    if (u.lIlIlIllIllI(Players.getLocal().getWorldLocation().distanceTo(dh), llIIlIlIl[4])) {
                        AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[75]];
                        Movement.walkTo((WorldPoint)dh);
                        0;
                        Time.sleepTicks((int)llIIlIlIl[0]);
                        0;
                        if (u.lIlIlIllIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIIlIlIl[20], llIIlIlIl[21], llIIlIlIl[1])) ? 1 : 0)) {
                            AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[76]];
                            e.c(new WorldPoint(llIIlIlIl[23], llIIlIlIl[24], llIIlIlIl[1]));
                            Time.sleepTicks((int)llIIlIlIl[5]);
                            0;
                        }
                    }
                    if (u.lIlIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(dh), llIIlIlIl[4])) {
                        AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[77]];
                        g.a(llIIlIIlI[llIIlIlIl[78]], cG, llIIlIlIl[0]);
                    }
                }
            }
            if (u.lIlIlIlllIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIIlIlIl[52])) {
                if (u.lIlIlIllIllI(Players.getLocal().getWorldLocation().distanceTo(dj), llIIlIlIl[9])) {
                    AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[79]];
                    Movement.walkTo((WorldPoint)dj);
                    0;
                    Time.sleepTicks((int)llIIlIlIl[0]);
                    0;
                }
                if (u.lIlIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(dj), llIIlIlIl[9])) {
                    AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[80]];
                    if (u.lIlIlIllIIlI(dk, llIIlIlIl[0])) {
                        as.pw += llIIlIlIl[0];
                        as.u(AccBuilderGWD.m);
                        dk += llIIlIlIl[0];
                        as.pw = llIIlIlIl[1];
                        dl = llIIlIlIl[1];
                    }
                    g.a(llIIlIIlI[llIIlIlIl[17]], cG);
                }
            }
        }
    }

    private static boolean lIlIlIllIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIlIlIIlIIII(String lIlIllllIlIlll, String lIlIllllIlIllI) {
        lIlIllllIlIlll = new String(Base64.getDecoder().decode(lIlIllllIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIllllIlIlIl = new StringBuilder();
        char[] lIlIllllIlIlII = lIlIllllIlIllI.toCharArray();
        int lIlIllllIlIIll = llIIlIlIl[1];
        char[] lIlIllllIIllIl = lIlIllllIlIlll.toCharArray();
        int lIlIllllIIllII = lIlIllllIIllIl.length;
        int lIlIllllIIlIll = llIIlIlIl[1];
        while (u.lIlIlIllIIlI(lIlIllllIIlIll, lIlIllllIIllII)) {
            char lIlIllllIllIII = lIlIllllIIllIl[lIlIllllIIlIll];
            lIlIllllIlIlIl.append((char)(lIlIllllIllIII ^ lIlIllllIlIlII[lIlIllllIlIIll % lIlIllllIlIlII.length]));
            0;
            ++lIlIllllIlIIll;
            ++lIlIllllIIlIll;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(lIlIllllIlIlIl);
    }

    @Override
    public int af() {
        try {
            u.aX();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 <= 0) {
            return (0x25 ^ 0x47) & ~(0xA ^ 0x68);
        }
        return llIIlIlIl[85];
    }

    private static boolean lIlIlIllIlIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIlIlllIll(int n2) {
        return n2 <= 0;
    }

    private static void lIlIlIlIllll() {
        llIIlIlIl = new int[101];
        u.llIIlIlIl[0] = 1;
        u.llIIlIlIl[1] = (0x49 ^ 0x1B ^ (0x4A ^ 0x4E)) & (0x76 ^ 0x52 ^ (0x3B ^ 0x49) ^ -1);
        u.llIIlIlIl[2] = 0xFFFF9F8C & 0x73FB;
        u.llIIlIlIl[3] = 2;
        u.llIIlIlIl[4] = 0x50 ^ 0x54;
        u.llIIlIlIl[5] = 0xAD ^ 0xAB;
        u.llIIlIlIl[6] = -(49 + 84 - 125 + 137) & (0xFFFFFFDF & 0x1FF7);
        u.llIIlIlIl[7] = -(0xFFFFF67F & 0x6981) & (0xFFFFFFEA & 0x7F5D);
        u.llIIlIlIl[8] = -(0xFFFFCECF & 0x7D36) & (0xFFFFFFBF & 0x4FFF);
        u.llIIlIlIl[9] = 3;
        u.llIIlIlIl[10] = -(0xFFFFD2E9 & 0x3F5F) & (0xFFFFB77F & 0x5FFB);
        u.llIIlIlIl[11] = 0xFFFFBBD5 & 0x757B;
        u.llIIlIlIl[12] = 17 + 96 - 64 + 92 ^ 118 + 36 - 101 + 83;
        u.llIIlIlIl[13] = 0xFFFFA17F & 0x5FFB;
        u.llIIlIlIl[14] = 0x45 ^ 0x4F;
        u.llIIlIlIl[15] = 0xFFFFDFD9 & 0x3F6F;
        u.llIIlIlIl[16] = 0x23 ^ 0x2B;
        u.llIIlIlIl[17] = 0x50 ^ 0x64 ^ (0x5D ^ 0x28);
        u.llIIlIlIl[18] = 0x5D ^ 0x5A;
        u.llIIlIlIl[19] = 84 + 118 - 70 + 74 ^ 11 + 23 - -132 + 33;
        u.llIIlIlIl[20] = -(0x9D ^ 0x8F) & (0xFFFFEFF7 & 0x1BFB);
        u.llIIlIlIl[21] = -(0xFFFF8A57 & 0x77BD) & (0xFFFFCEFF & 0x3FFD);
        u.llIIlIlIl[22] = 0x62 ^ 0x69;
        u.llIIlIlIl[23] = 0xFFFFFFFF & 0xBDF;
        u.llIIlIlIl[24] = 0xFFFF9CF5 & 0x6FEB;
        u.llIIlIlIl[25] = 0xC ^ 0;
        u.llIIlIlIl[26] = 0x4A ^ 0x47;
        u.llIIlIlIl[27] = 0xCB ^ 0xC5;
        u.llIIlIlIl[28] = 0x7F ^ 0x70;
        u.llIIlIlIl[29] = 0x85 ^ 0x91 ^ (0xF ^ 0xB);
        u.llIIlIlIl[30] = 0x14 ^ 5;
        u.llIIlIlIl[31] = 0x72 ^ 0x7B ^ (0x5C ^ 0x47);
        u.llIIlIlIl[32] = 0xFFFFBF64 & 0x5BDB;
        u.llIIlIlIl[33] = -(0xFFFFD5FF & 0x2B2F) & (0xFFFFDDEE & 0x3BFF);
        u.llIIlIlIl[34] = 0x89 ^ 0xBB;
        u.llIIlIlIl[35] = 0xBE ^ 0xAD;
        u.llIIlIlIl[36] = 176 + 23 - 167 + 158 ^ 164 + 115 - 244 + 135;
        u.llIIlIlIl[37] = -(0xFFFF845B & 0x7FA7) & (0xFFFF9FC2 & 0x77FF);
        u.llIIlIlIl[38] = 0x58 ^ 0x24 ^ (0x11 ^ 0x78);
        u.llIIlIlIl[39] = 9 ^ 0x2B ^ (0x76 ^ 0x42);
        u.llIIlIlIl[40] = 1 ^ (0x3F ^ 0x29);
        u.llIIlIlIl[41] = 0x4E ^ 0x56;
        u.llIIlIlIl[42] = 0xF5 ^ 0x83 ^ (0xFC ^ 0x93);
        u.llIIlIlIl[43] = 0xA8 ^ 0xB2;
        u.llIIlIlIl[44] = 0x34 ^ 0x2F;
        u.llIIlIlIl[45] = 0x16 ^ 0xA;
        u.llIIlIlIl[46] = 0x3A ^ 0x36 ^ (0xD0 ^ 0xC1);
        u.llIIlIlIl[47] = 0xB5 ^ 0xAB;
        u.llIIlIlIl[48] = 0xFA ^ 0xBC ^ (0x3F ^ 0x66);
        u.llIIlIlIl[49] = 0x92 ^ 0xB2;
        u.llIIlIlIl[50] = 35 + 146 - 87 + 57 ^ 65 + 127 - 167 + 157;
        u.llIIlIlIl[51] = 0x55 ^ 0x77;
        u.llIIlIlIl[52] = 0x53 ^ 0x70;
        u.llIIlIlIl[53] = 0x91 ^ 0xAF ^ (0xB3 ^ 0xA9);
        u.llIIlIlIl[54] = 0x4A ^ 0x6F;
        u.llIIlIlIl[55] = 0xA9 ^ 0x8F;
        u.llIIlIlIl[56] = 0x66 ^ 0x41;
        u.llIIlIlIl[57] = 51 + 24 - 1 + 71 ^ 155 + 87 - 137 + 80;
        u.llIIlIlIl[58] = 0x71 ^ 0x58;
        u.llIIlIlIl[59] = 0x88 ^ 0xA2;
        u.llIIlIlIl[60] = 0x58 ^ 0x73;
        u.llIIlIlIl[61] = 129 + 111 - 114 + 57 ^ 120 + 148 - 114 + 1;
        u.llIIlIlIl[62] = 27 + 123 - 135 + 128 ^ 21 + 66 - -20 + 55;
        u.llIIlIlIl[63] = 0xB6 ^ 0xB0 ^ (0xB7 ^ 0x9F);
        u.llIIlIlIl[64] = 51 + 11 - 42 + 131 ^ 140 + 59 - 72 + 57;
        u.llIIlIlIl[65] = 0xB3 ^ 0x83;
        u.llIIlIlIl[66] = 0x8E ^ 0xBF;
        u.llIIlIlIl[67] = 0x64 ^ 0x47 ^ (0x57 ^ 0x47);
        u.llIIlIlIl[68] = 0x66 ^ 0x52;
        u.llIIlIlIl[69] = 60 + 131 - 98 + 94 ^ 72 + 110 - 181 + 141;
        u.llIIlIlIl[70] = 0xA0 ^ 0x96;
        u.llIIlIlIl[71] = 0xBE ^ 0x89;
        u.llIIlIlIl[72] = 0x40 ^ 0x78;
        u.llIIlIlIl[73] = 49 + 144 - 14 + 10 ^ 0 + 97 - 14 + 49;
        u.llIIlIlIl[74] = 123 + 41 - 89 + 52 ^ (0xCF ^ 0x8A);
        u.llIIlIlIl[75] = 75 + 128 - 94 + 58 ^ 35 + 22 - -24 + 75;
        u.llIIlIlIl[76] = 0x7C ^ 0x40;
        u.llIIlIlIl[77] = 0x8B ^ 0xB6;
        u.llIIlIlIl[78] = 0xF9 ^ 0xC7;
        u.llIIlIlIl[79] = 163 + 19 - 166 + 175 ^ 27 + 95 - 36 + 42;
        u.llIIlIlIl[80] = 0xA8 ^ 0xA7 ^ (0xDA ^ 0x95);
        u.llIIlIlIl[81] = -(0xFFFFFEBC & 0x5D57) & (0xFFFFFF3B & Short.MAX_VALUE);
        u.llIIlIlIl[82] = 0xFFFF97ED & 0x6B96;
        u.llIIlIlIl[83] = 0xFFFFAFCC & 0x7EFF;
        u.llIIlIlIl[84] = -(0xFFFFF85E & 0x17F3) & (0xFFFFF3FB & 0x7DFD);
        u.llIIlIlIl[85] = 0x36 ^ 0x69 ^ (0xE ^ 0x35);
        u.llIIlIlIl[86] = 0xEE ^ 0xAC;
        u.llIIlIlIl[87] = 0x57 ^ 0x14;
        u.llIIlIlIl[88] = 0xFFFFFCED & 0xF1F;
        u.llIIlIlIl[89] = 0xFFFFCDB7 & 0x3EFB;
        u.llIIlIlIl[90] = -(0xFFFFFDC3 & 0x663D) & (0xFFFFFFFC & 0x6FDF);
        u.llIIlIlIl[91] = -(0xFFFFDF2A & 0x73F7) & (0xFFFFFFFF & 0x5FFF);
        u.llIIlIlIl[92] = -(0xFFFFF2A7 & 0x3F79) & (0xFFFFBFFE & 0x7E6D);
        u.llIIlIlIl[93] = -(0xFFFFF4E9 & 0x7BFF) & (0xFFFFFFFB & 0x7DFF);
        u.llIIlIlIl[94] = 0xFFFFDED7 & 0x2D3B;
        u.llIIlIlIl[95] = -(0xFFFFCE27 & 0x33FB) & (0xFFFFBEEB & 0x4FF7);
        u.llIIlIlIl[96] = 0x3F ^ 0x7B;
        u.llIIlIlIl[97] = 0xA ^ 0x4F;
        u.llIIlIlIl[98] = 0xCA ^ 0x95 ^ (0x70 ^ 0x69);
        u.llIIlIlIl[99] = 14 + 133 - 72 + 124 ^ 62 + 95 - 121 + 92;
        u.llIIlIlIl[100] = 0xD8 ^ 0xAF ^ (0x27 ^ 0x18);
    }

    private static boolean lIlIlIllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean ae() {
        return llIIlIlIl[1];
    }

    private static boolean lIlIlIlllIIl(Object object) {
        return object == null;
    }

    @Override
    public String ag() {
        return llIIlIIlI[llIIlIlIl[86]];
    }

    private static void lIlIlIIllllI() {
        llIIlIIlI = new String[llIIlIlIl[100]];
        u.llIIlIIlI[u.llIIlIlIl[1]] = u."Finished buying items, switching back to quest";
        u.llIIlIIlI[u.llIIlIlIl[0]] = u."Nav to bank";
        u.llIIlIIlI[u.llIIlIlIl[3]] = u."Handling banking";
        u.llIIlIIlI[u.llIIlIlIl[9]] = u."We are missing quest supplies, switching to BUYING";
        u.llIIlIIlI[u.llIIlIlIl[4]] = u."Drink";
        u.llIIlIIlI[u.llIIlIlIl[12]] = u."Wear";
        u.llIIlIIlI[u.llIIlIlIl[5]] = u."Nav to start";
        u.llIIlIIlI[u.llIIlIlIl[18]] = u."Starting quest";
        u.llIIlIIlI[u.llIIlIlIl[16]] = u."Notice board";
        u.llIIlIIlI[u.llIIlIlIl[19]] = u."Check";
        u.llIIlIIlI[u.llIIlIlIl[14]] = u."Nav to sarah";
        u.llIIlIIlI[u.llIIlIlIl[22]] = u."Stuck, clicking out";
        u.llIIlIIlI[u.llIIlIlIl[25]] = u."Talking sarah";
        u.llIIlIIlI[u.llIIlIlIl[26]] = u."Sarah";
        u.llIIlIIlI[u.llIIlIlIl[27]] = u."Nav to hole";
        u.llIIlIIlI[u.llIIlIlIl[28]] = u."Strange hole";
        u.llIIlIIlI[u.llIIlIlIl[29]] = u."Wield";
        u.llIIlIIlI[u.llIIlIlIl[30]] = u."Strange hole";
        u.llIIlIIlI[u.llIIlIlIl[31]] = u."Climb-down";
        u.llIIlIIlI[u.llIIlIlIl[35]] = u."Skeleton";
        u.llIIlIIlI[u.llIIlIlIl[36]] = u."Skeleton";
        u.llIIlIIlI[u.llIIlIlIl[38]] = u."Blockage";
        u.llIIlIIlI[u.llIIlIlIl[39]] = u."Pig Thing";
        u.llIIlIIlI[u.llIIlIlIl[40]] = u."Climb over blockage";
        u.llIIlIIlI[u.llIIlIlIl[41]] = u."Blockage";
        u.llIIlIIlI[u.llIIlIlIl[42]] = u."Climb-over";
        u.llIIlIIlI[u.llIIlIlIl[43]] = u."Pig Thing";
        u.llIIlIIlI[u.llIIlIlIl[44]] = u."Interact skele";
        u.llIIlIIlI[u.llIIlIlIl[45]] = u."Skeleton";
        u.llIIlIIlI[u.llIIlIlIl[46]] = u."Investigate";
        u.llIIlIIlI[u.llIIlIlIl[47]] = u."Interacting Spira";
        u.llIIlIIlI[u.llIIlIlIl[48]] = u."Spria";
        u.llIIlIIlI[u.llIIlIlIl[49]] = u."Sourhog";
        u.llIIlIIlI[u.llIIlIlIl[50]] = u."Reinforced goggles";
        u.llIIlIIlI[u.llIIlIlIl[51]] = u."Reinforced goggles";
        u.llIIlIIlI[u.llIIlIlIl[52]] = u."Reinforced goggles";
        u.llIIlIIlI[u.llIIlIlIl[53]] = u."Wear";
        u.llIIlIIlI[u.llIIlIlIl[54]] = u."Nav to hole";
        u.llIIlIIlI[u.llIIlIlIl[55]] = u."Climb down hole";
        u.llIIlIIlI[u.llIIlIlIl[56]] = u."Strange hole";
        u.llIIlIIlI[u.llIIlIlIl[57]] = u."Strange hole";
        u.llIIlIIlI[u.llIIlIlIl[58]] = u."Climb-down";
        u.llIIlIIlI[u.llIIlIlIl[59]] = u."Blockage";
        u.llIIlIIlI[u.llIIlIlIl[60]] = u."Climb over blockage";
        u.llIIlIIlI[u.llIIlIlIl[61]] = u."Blockage";
        u.llIIlIIlI[u.llIIlIlIl[62]] = u."Climb-over";
        u.llIIlIIlI[u.llIIlIlIl[63]] = u."Reinforced goggles";
        u.llIIlIIlI[u.llIIlIlIl[64]] = u."Reinforced goggles";
        u.llIIlIIlI[u.llIIlIlIl[65]] = u."Reinforced goggles";
        u.llIIlIIlI[u.llIIlIlIl[66]] = u."Wear";
        u.llIIlIIlI[u.llIIlIlIl[34]] = u."Wield";
        u.llIIlIIlI[u.llIIlIlIl[67]] = u."Sourhog";
        u.llIIlIIlI[u.llIIlIlIl[68]] = u."Attack";
        u.llIIlIIlI[u.llIIlIlIl[69]] = u."Eat";
        u.llIIlIIlI[u.llIIlIlIl[70]] = u."Sourhog foot";
        u.llIIlIIlI[u.llIIlIlIl[71]] = u."Cutting foot";
        u.llIIlIIlI[u.llIIlIlIl[72]] = u."Dead sourhog";
        u.llIIlIIlI[u.llIIlIlIl[73]] = u."Cut-foot";
        u.llIIlIIlI[u.llIIlIlIl[74]] = u."Sourhog foot";
        u.llIIlIIlI[u.llIIlIlIl[75]] = u."Nav to sarah";
        u.llIIlIIlI[u.llIIlIlIl[76]] = u."Stuck, clicking out";
        u.llIIlIIlI[u.llIIlIlIl[77]] = u."Talking sarah";
        u.llIIlIIlI[u.llIIlIlIl[78]] = u."Sarah";
        u.llIIlIIlI[u.llIIlIlIl[79]] = u."Nav to Spria";
        u.llIIlIIlI[u.llIIlIlIl[80]] = u."Talking spria";
        u.llIIlIIlI[u.llIIlIlIl[17]] = u."Spria";
        u.llIIlIIlI[u.llIIlIlIl[86]] = u."A porceline of interest";
        u.llIIlIIlI[u.llIIlIlIl[87]] = u."ring of wealth (";
        u.llIIlIIlI[u.llIIlIlIl[96]] = u."Yes.";
        u.llIIlIIlI[u.llIIlIlIl[97]] = u."Talk about the bounty.";
        u.llIIlIIlI[u.llIIlIlIl[98]] = u."I think that'll be all for now.";
        u.llIIlIIlI[u.llIIlIlIl[99]] = u."Yes";
    }

    private static boolean lIlIlIlllIlI(int n2) {
        return n2 < 0;
    }

    private static boolean lIlIlIlllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static int lIlIlIllIIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (u.lIlIlIllllII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIIlIlIl[57])) {
            bl = llIIlIlIl[0];
            0;
            if (-(0x33 ^ 0x37) >= 0) {
                return false;
            }
        } else {
            bl = llIIlIlIl[1];
        }
        return bl;
    }

    private static String lIlIlIIlllII(String lIlIlllllIIlll, String lIlIlllllIIllI) {
        try {
            SecretKeySpec lIlIlllllIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlllllIIllI.getBytes(StandardCharsets.UTF_8)), llIIlIlIl[16]), "DES");
            Cipher lIlIlllllIlIIl = Cipher.getInstance("DES");
            lIlIlllllIlIIl.init(llIIlIlIl[3], lIlIlllllIlIlI);
            return new String(lIlIlllllIlIIl.doFinal(Base64.getDecoder().decode(lIlIlllllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlllllIlIII) {
            lIlIlllllIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIllIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIllIIll(int n2) {
        return n2 == 0;
    }
}

