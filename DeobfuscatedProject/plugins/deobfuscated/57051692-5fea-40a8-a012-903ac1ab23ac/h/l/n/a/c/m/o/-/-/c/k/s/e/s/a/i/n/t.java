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
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.Z;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.f;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.g;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.j;
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

public class t
implements K {
    public static /* synthetic */ WorldPoint cV;
    public static /* synthetic */ List<d> bp;
    public static /* synthetic */ WorldPoint cZ;
    private static /* synthetic */ int[] lIlIlIlIIl;
    private static /* synthetic */ String[] cy;
    static /* synthetic */ boolean dd;
    public static /* synthetic */ WorldPoint db;
    private static /* synthetic */ String[] lIlIlIIllI;
    static /* synthetic */ int dc;
    public static /* synthetic */ WorldPoint da;
    private static /* synthetic */ WorldPoint de;
    public static /* synthetic */ boolean bn;

    private static boolean lIIlIIIIlllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIIlIIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean al() {
        int n2;
        block4: {
            block5: {
                int[] nArray = new int[lIlIlIlIIl[0]];
                nArray[t.lIlIlIlIIl[1]] = lIlIlIlIIl[6];
                if (!t.lIIlIIIIlllll(Inventory.getCount((int[])nArray))) break block4;
                int[] nArray2 = new int[lIlIlIlIIl[0]];
                nArray2[t.lIlIlIlIIl[1]] = lIlIlIlIIl[8];
                if (!t.lIIlIIIIlllll(Inventory.getCount((int[])nArray2))) break block4;
                int[] nArray3 = new int[lIlIlIlIIl[0]];
                nArray3[t.lIlIlIlIIl[1]] = lIlIlIlIIl[10];
                if (!t.lIIlIIIlIIlIl(Inventory.getCount((int[])nArray3))) break block5;
                int[] nArray4 = new int[lIlIlIlIIl[0]];
                nArray4[t.lIlIlIlIIl[1]] = lIlIlIlIIl[10];
                if (!t.lIIlIIIIllIll(Equipment.contains((int[])nArray4) ? 1 : 0)) break block4;
            }
            int[] nArray = new int[lIlIlIlIIl[0]];
            nArray[t.lIlIlIlIIl[1]] = lIlIlIlIIl[13];
            if (t.lIIlIIIIlllll(Inventory.getCount((int[])nArray))) {
                n2 = lIlIlIlIIl[0];
                0;
                if (1 <= 3) return n2 != 0;
                return ((0x49 ^ 0x64) & ~(0xED ^ 0xC0)) != 0;
            }
        }
        n2 = lIlIlIlIIl[1];
        return n2 != 0;
    }

    private static String lIIlIIIIIIlII(String lllllllllllllllllllIlllIIIlIlIII, String lllllllllllllllllllIlllIIIlIlIIl) {
        try {
            SecretKeySpec lllllllllllllllllllIlllIIIlIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIlllIIIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllIlllIIIlIllII = Cipher.getInstance("Blowfish");
            lllllllllllllllllllIlllIIIlIllII.init(lIlIlIlIIl[3], lllllllllllllllllllIlllIIIlIllIl);
            return new String(lllllllllllllllllllIlllIIIlIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIlllIIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllIlllIIIlIlIll) {
            lllllllllllllllllllIlllIIIlIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIllllI(Object object) {
        return object != null;
    }

    public static void ba() {
        block63: {
            block64: {
                block65: {
                    if (t.lIIlIIIIllIll(bn ? 1 : 0)) {
                        b.a(bp);
                        if (t.lIIlIIIIlllII(bp.size(), lIlIlIlIIl[0])) {
                            System.out.println(lIlIlIIllI[lIlIlIlIIl[1]]);
                            bn = lIlIlIlIIl[1];
                        }
                    }
                    if (!t.lIIlIIIIlllIl(bn ? 1 : 0)) break block63;
                    if (t.lIIlIIIIlllIl(t.al() ? 1 : 0) && t.lIIlIIIIlllIl(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                        BankLocation lllllllllllllllllllIlllIIlIlllIl = BankLocation.getNearest();
                        if (t.lIIlIIIIllllI(lllllllllllllllllllIlllIIlIlllIl) && t.lIIlIIIIlllIl(lllllllllllllllllllIlllIIlIlllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[0]];
                            a.a(lllllllllllllllllllIlllIIlIlllIl);
                        }
                        if (t.lIIlIIIIllllI(lllllllllllllllllllIlllIIlIlllIl) && t.lIIlIIIIllIll(lllllllllllllllllllIlllIIlIlllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (t.lIIlIIIIlllIl(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIlIlIIl[2]);
                                0;
                            }
                            if (t.lIIlIIIIllIll(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[3]];
                                if (t.lIIlIIIIlllll(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lIlIlIlIIl[4]);
                                    0;
                                }
                                if (t.lIIlIIIIlllll(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lIlIlIlIIl[3]);
                                    0;
                                }
                                int[] nArray = new int[lIlIlIlIIl[5]];
                                nArray[t.lIlIlIlIIl[1]] = lIlIlIlIIl[6];
                                nArray[t.lIlIlIlIIl[0]] = lIlIlIlIIl[7];
                                nArray[t.lIlIlIlIIl[3]] = lIlIlIlIIl[8];
                                nArray[t.lIlIlIlIIl[9]] = lIlIlIlIIl[10];
                                nArray[t.lIlIlIlIIl[4]] = lIlIlIlIIl[11];
                                nArray[t.lIlIlIlIIl[12]] = lIlIlIlIIl[13];
                                if (t.lIIlIIIIlllIl(e.b(nArray) ? 1 : 0)) {
                                    t.O();
                                    System.out.println(lIlIlIIllI[lIlIlIlIIl[9]]);
                                    bn = lIlIlIlIIl[0];
                                    return;
                                }
                                int[] nArray2 = new int[lIlIlIlIIl[5]];
                                nArray2[t.lIlIlIlIIl[1]] = lIlIlIlIIl[6];
                                nArray2[t.lIlIlIlIIl[0]] = lIlIlIlIIl[7];
                                nArray2[t.lIlIlIlIIl[3]] = lIlIlIlIIl[8];
                                nArray2[t.lIlIlIlIIl[9]] = lIlIlIlIIl[10];
                                nArray2[t.lIlIlIlIIl[4]] = lIlIlIlIIl[11];
                                nArray2[t.lIlIlIlIIl[12]] = lIlIlIlIIl[13];
                                if (t.lIIlIIIIllIll(e.b(nArray2) ? 1 : 0)) {
                                    int[] nArray3 = new int[lIlIlIlIIl[3]];
                                    nArray3[t.lIlIlIlIIl[1]] = lIlIlIlIIl[8];
                                    nArray3[t.lIlIlIlIIl[0]] = lIlIlIlIIl[10];
                                    a.a(nArray3);
                                    a.a(lIlIlIlIIl[6], lIlIlIlIIl[14]);
                                    a.a(lIlIlIlIIl[7], lIlIlIlIIl[14]);
                                    a.a(lIlIlIlIIl[15], lIlIlIlIIl[14]);
                                    a.b(f.aQ, lIlIlIlIIl[0]);
                                    a.a(lIlIlIlIIl[11], lIlIlIlIIl[4]);
                                    a.a(lIlIlIlIIl[13], lIlIlIlIIl[16]);
                                }
                            }
                        }
                    }
                    if (t.lIIlIIIIllIll(Inventory.contains((int[])f.aU) ? 1 : 0) && t.lIIlIIIIlllII(Movement.getRunEnergy(), lIlIlIlIIl[17])) {
                        Inventory.getFirst((int[])f.aU).interact(lIlIlIIllI[lIlIlIlIIl[4]]);
                        Time.sleepTicks((int)lIlIlIlIIl[0]);
                        0;
                    }
                    if (t.lIIlIIIIllIll(t.al() ? 1 : 0) && t.lIIlIIIIlllIl(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                        if (t.lIIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(cV), lIlIlIlIIl[4])) {
                            if (t.lIIlIIIIllIll(Inventory.contains((int[])f.aQ) ? 1 : 0) && t.lIIlIIIIlllIl(Equipment.contains((int[])f.aQ) ? 1 : 0)) {
                                Inventory.getFirst((int[])f.aQ).interact(lIlIlIIllI[lIlIlIlIIl[12]]);
                            }
                            if (t.lIIlIIIIllIll(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[5]];
                            Movement.walkTo((WorldPoint)cV);
                            0;
                            Time.sleepTicks((int)lIlIlIlIIl[0]);
                            0;
                        }
                        if (t.lIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(cV), lIlIlIlIIl[4])) {
                            AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[18]];
                            dc = lIlIlIlIIl[1];
                            if (t.lIIlIIIIlllIl(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[lIlIlIlIIl[0]];
                                stringArray[t.lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[16]];
                                TileObjects.getNearest((String[])stringArray).interact(lIlIlIIllI[lIlIlIlIIl[19]]);
                                Time.sleepTicks((int)lIlIlIlIIl[3]);
                                0;
                            }
                            g.a(cy);
                        }
                    }
                    if (t.lIIlIIIlIIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIlIlIIl[12])) {
                        if (t.lIIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(cZ), lIlIlIlIIl[4])) {
                            AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[14]];
                            Movement.walkTo((WorldPoint)cZ);
                            0;
                            Time.sleepTicks((int)lIlIlIlIIl[0]);
                            0;
                            if (t.lIIlIIIIllIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIlIlIlIIl[20], lIlIlIlIIl[21], lIlIlIlIIl[1])) ? 1 : 0)) {
                                AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[22]];
                                e.c(new WorldPoint(lIlIlIlIIl[23], lIlIlIlIIl[24], lIlIlIlIIl[1]));
                                Time.sleepTicks((int)lIlIlIlIIl[5]);
                                0;
                            }
                        }
                        if (t.lIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(cZ), lIlIlIlIIl[4])) {
                            AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[25]];
                            g.a(lIlIlIIllI[lIlIlIlIIl[26]], cy, lIlIlIlIIl[0]);
                        }
                    }
                    if (t.lIIlIIIlIIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIlIlIIl[14])) {
                        if (t.lIIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(da), lIlIlIlIIl[4])) {
                            AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[27]];
                            Movement.walkTo((WorldPoint)da);
                            0;
                            Time.sleepTicks((int)lIlIlIlIIl[0]);
                            0;
                        }
                        if (t.lIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(da), lIlIlIlIIl[4])) {
                            int[] nArray = new int[lIlIlIlIIl[0]];
                            nArray[t.lIlIlIlIIl[1]] = lIlIlIlIIl[8];
                            if (t.lIIlIIIIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray4 = new int[lIlIlIlIIl[0]];
                                nArray4[t.lIlIlIlIIl[1]] = lIlIlIlIIl[8];
                                String[] stringArray = new String[lIlIlIlIIl[0]];
                                stringArray[t.lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[28]];
                                Inventory.getFirst((int[])nArray4).useOn(TileObjects.getNearest((String[])stringArray));
                                Time.sleepTicks((int)lIlIlIlIIl[3]);
                                0;
                            }
                        }
                    }
                    if (!t.lIIlIIIlIIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIlIlIIl[28])) break block64;
                    int[] nArray = new int[lIlIlIlIIl[0]];
                    nArray[t.lIlIlIlIIl[1]] = lIlIlIlIIl[10];
                    if (t.lIIlIIIIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray5 = new int[lIlIlIlIIl[0]];
                        nArray5[t.lIlIlIlIIl[1]] = lIlIlIlIIl[10];
                        Inventory.getFirst((int[])nArray5).interact(lIlIlIIllI[lIlIlIlIIl[29]]);
                    }
                    if (t.lIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(da), lIlIlIlIIl[4])) {
                        String[] stringArray = new String[lIlIlIlIIl[0]];
                        stringArray[t.lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[30]];
                        TileObjects.getNearest((String[])stringArray).interact(lIlIlIIllI[lIlIlIlIIl[31]]);
                        Time.sleepTicks((int)lIlIlIlIIl[9]);
                        0;
                    }
                    if (!t.lIIlIIIlIIIII(Players.getLocal().getLocalLocation().distanceTo(new LocalPoint(lIlIlIlIIl[32], lIlIlIlIIl[33])), lIlIlIlIIl[34])) break block65;
                    String[] stringArray = new String[lIlIlIlIIl[0]];
                    stringArray[t.lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[35]];
                    if (!t.lIIlIIIIllllI(TileObjects.getNearest((String[])stringArray))) break block64;
                }
                String[] stringArray = new String[lIlIlIlIIl[0]];
                stringArray[t.lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[36]];
                if (t.lIIlIIIIllllI(TileObjects.getNearest((String[])stringArray))) {
                    if (t.lIIlIIIlIIIII(Players.getLocal().getLocalLocation().getY(), lIlIlIlIIl[37])) {
                        String[] stringArray2 = new String[lIlIlIlIIl[0]];
                        stringArray2[t.lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[38]];
                        if (t.lIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(TileObjects.getNearest((String[])stringArray2).getWorldLocation()), lIlIlIlIIl[14])) {
                            String[] stringArray3 = new String[lIlIlIlIIl[0]];
                            stringArray3[t.lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[39]];
                            if (t.lIIlIIIlIIIll(NPCs.getNearest((String[])stringArray3))) {
                                AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[40]];
                                String[] stringArray4 = new String[lIlIlIlIIl[0]];
                                stringArray4[t.lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[41]];
                                TileObjects.getNearest((String[])stringArray4).interact(lIlIlIIllI[lIlIlIlIIl[42]]);
                                Time.sleepTicks((int)lIlIlIlIIl[14]);
                                0;
                            }
                        }
                    }
                    String[] stringArray5 = new String[lIlIlIlIIl[0]];
                    stringArray5[t.lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[43]];
                    if (t.lIIlIIIlIIIll(NPCs.getNearest((String[])stringArray5)) && t.lIIlIIIIlllIl(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[44]];
                        String[] stringArray6 = new String[lIlIlIlIIl[0]];
                        stringArray6[t.lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[45]];
                        TileObjects.getNearest((String[])stringArray6).interact(lIlIlIIllI[lIlIlIlIIl[46]]);
                        Time.sleepTicks((int)lIlIlIlIIl[12]);
                        0;
                        g.a(cy);
                    }
                    g.a(cy);
                }
            }
            if (t.lIIlIIIlIIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIlIlIIl[36])) {
                AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[47]];
                g.a(lIlIlIIllI[lIlIlIlIIl[48]], cy);
            }
            if (t.lIIlIIIlIIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIlIlIIl[42])) {
                if (t.lIIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(da), lIlIlIlIIl[4])) {
                    String[] stringArray = new String[lIlIlIlIIl[0]];
                    stringArray[t.lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[49]];
                    if (t.lIIlIIIlIIIll(NPCs.getNearest((String[])stringArray))) {
                        String[] stringArray7 = new String[lIlIlIlIIl[0]];
                        stringArray7[t.lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[50]];
                        if (t.lIIlIIIIlllIl(Equipment.contains((String[])stringArray7) ? 1 : 0)) {
                            String[] stringArray8 = new String[lIlIlIlIIl[0]];
                            stringArray8[t.lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[51]];
                            if (t.lIIlIIIIllIll(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                                String[] stringArray9 = new String[lIlIlIlIIl[0]];
                                stringArray9[t.lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[52]];
                                Inventory.getFirst((String[])stringArray9).interact(lIlIlIIllI[lIlIlIlIIl[53]]);
                            }
                        }
                        AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[54]];
                        Movement.walkTo((WorldPoint)da);
                        0;
                        Time.sleepTicks((int)lIlIlIlIIl[0]);
                        0;
                    }
                }
                if (t.lIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(da), lIlIlIlIIl[4])) {
                    AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[55]];
                    String[] stringArray = new String[lIlIlIlIIl[0]];
                    stringArray[t.lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[56]];
                    if (t.lIIlIIIIllllI(TileObjects.getNearest((String[])stringArray))) {
                        String[] stringArray10 = new String[lIlIlIlIIl[0]];
                        stringArray10[t.lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[57]];
                        TileObjects.getNearest((String[])stringArray10).interact(lIlIlIIllI[lIlIlIlIIl[58]]);
                        Time.sleepTicks((int)lIlIlIlIIl[9]);
                        0;
                    }
                }
                if (t.lIIlIIIlIIIII(Players.getLocal().getLocalLocation().getY(), lIlIlIlIIl[37])) {
                    String[] stringArray = new String[lIlIlIlIIl[0]];
                    stringArray[t.lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[59]];
                    if (t.lIIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(TileObjects.getNearest((String[])stringArray).getWorldLocation()), lIlIlIlIIl[18])) {
                        AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[60]];
                        String[] stringArray11 = new String[lIlIlIlIIl[0]];
                        stringArray11[t.lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[61]];
                        TileObjects.getNearest((String[])stringArray11).interact(lIlIlIIllI[lIlIlIlIIl[62]]);
                        Time.sleepTicks((int)lIlIlIlIIl[14]);
                        0;
                    }
                }
                if (t.lIIlIIIlIIIll(Players.getLocal().getInteracting()) && t.lIIlIIIIlllIl(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[lIlIlIlIIl[0]];
                    stringArray[t.lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[63]];
                    if (t.lIIlIIIIlllIl(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray12 = new String[lIlIlIlIIl[0]];
                        stringArray12[t.lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[64]];
                        if (t.lIIlIIIIllIll(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                            String[] stringArray13 = new String[lIlIlIlIIl[0]];
                            stringArray13[t.lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[65]];
                            Inventory.getFirst((String[])stringArray13).interact(lIlIlIIllI[lIlIlIlIIl[66]]);
                        }
                    }
                    int[] nArray = new int[lIlIlIlIIl[0]];
                    nArray[t.lIlIlIlIIl[1]] = lIlIlIlIIl[10];
                    if (t.lIIlIIIIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[lIlIlIlIIl[0]];
                        nArray6[t.lIlIlIlIIl[1]] = lIlIlIlIIl[10];
                        if (t.lIIlIIIIlllIl(Equipment.contains((int[])nArray6) ? 1 : 0)) {
                            int[] nArray7 = new int[lIlIlIlIIl[0]];
                            nArray7[t.lIlIlIlIIl[1]] = lIlIlIlIIl[10];
                            Inventory.getFirst((int[])nArray7).interact(lIlIlIIllI[lIlIlIlIIl[34]]);
                        }
                    }
                    String[] stringArray14 = new String[lIlIlIlIIl[0]];
                    stringArray14[t.lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[67]];
                    NPCs.getNearest((String[])stringArray14).interact(lIlIlIIllI[lIlIlIlIIl[68]]);
                    Time.sleepTicks((int)lIlIlIlIIl[0]);
                    0;
                }
                if (t.lIIlIIIlIIlII(t.lIIlIIIIllIlI(e.u(), 60.0))) {
                    int[] nArray = new int[lIlIlIlIIl[0]];
                    nArray[t.lIlIlIlIIl[1]] = lIlIlIlIIl[13];
                    if (t.lIIlIIIIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray8 = new int[lIlIlIlIIl[0]];
                        nArray8[t.lIlIlIlIIl[1]] = lIlIlIlIIl[13];
                        Inventory.getFirst((int[])nArray8).interact(lIlIlIIllI[lIlIlIlIIl[69]]);
                        Time.sleepTicks((int)lIlIlIlIIl[0]);
                        0;
                    }
                }
                g.a(cy);
            }
            if (t.lIIlIIIlIIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIlIlIIl[47])) {
                String[] stringArray = new String[lIlIlIlIIl[0]];
                stringArray[t.lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[70]];
                if (t.lIIlIIIIlllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[71]];
                    String[] stringArray15 = new String[lIlIlIlIIl[0]];
                    stringArray15[t.lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[72]];
                    TileObjects.getNearest((String[])stringArray15).interact(lIlIlIIllI[lIlIlIlIIl[73]]);
                    Time.sleepTicks((int)lIlIlIlIIl[4]);
                    0;
                }
                String[] stringArray16 = new String[lIlIlIlIIl[0]];
                stringArray16[t.lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[74]];
                if (t.lIIlIIIIllIll(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                    if (t.lIIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(cZ), lIlIlIlIIl[4])) {
                        AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[75]];
                        Movement.walkTo((WorldPoint)cZ);
                        0;
                        Time.sleepTicks((int)lIlIlIlIIl[0]);
                        0;
                        if (t.lIIlIIIIllIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIlIlIlIIl[20], lIlIlIlIIl[21], lIlIlIlIIl[1])) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[76]];
                            e.c(new WorldPoint(lIlIlIlIIl[23], lIlIlIlIIl[24], lIlIlIlIIl[1]));
                            Time.sleepTicks((int)lIlIlIlIIl[5]);
                            0;
                        }
                    }
                    if (t.lIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(cZ), lIlIlIlIIl[4])) {
                        AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[77]];
                        g.a(lIlIlIIllI[lIlIlIlIIl[78]], cy, lIlIlIlIIl[0]);
                    }
                }
            }
            if (t.lIIlIIIlIIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIlIlIIl[52])) {
                if (t.lIIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(db), lIlIlIlIIl[9])) {
                    AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[79]];
                    Movement.walkTo((WorldPoint)db);
                    0;
                    Time.sleepTicks((int)lIlIlIlIIl[0]);
                    0;
                }
                if (t.lIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(db), lIlIlIlIIl[9])) {
                    AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[80]];
                    if (t.lIIlIIIIlllII(dc, lIlIlIlIIl[0])) {
                        Z.nI += lIlIlIlIIl[0];
                        Z.p(AccBuilderShamans.m);
                        dc += lIlIlIlIIl[0];
                        Z.nI = lIlIlIlIIl[1];
                        dd = lIlIlIlIIl[1];
                    }
                    g.a(lIlIlIIllI[lIlIlIlIIl[17]], cy);
                }
            }
        }
    }

    private static void lIIlIIIIllIII() {
        lIlIlIIllI = new String[lIlIlIlIIl[100]];
        t.lIlIlIIllI[t.lIlIlIlIIl[1]] = t."Finished buying items, switching back to quest";
        t.lIlIlIIllI[t.lIlIlIlIIl[0]] = t."Nav to bank";
        t.lIlIlIIllI[t.lIlIlIlIIl[3]] = t."Handling banking";
        t.lIlIlIIllI[t.lIlIlIlIIl[9]] = t."We are missing quest supplies, switching to BUYING";
        t.lIlIlIIllI[t.lIlIlIlIIl[4]] = t."Drink";
        t.lIlIlIIllI[t.lIlIlIlIIl[12]] = t."Wear";
        t.lIlIlIIllI[t.lIlIlIlIIl[5]] = t."Nav to start";
        t.lIlIlIIllI[t.lIlIlIlIIl[18]] = t."Starting quest";
        t.lIlIlIIllI[t.lIlIlIlIIl[16]] = t."Notice board";
        t.lIlIlIIllI[t.lIlIlIlIIl[19]] = t."Check";
        t.lIlIlIIllI[t.lIlIlIlIIl[14]] = t."Nav to sarah";
        t.lIlIlIIllI[t.lIlIlIlIIl[22]] = t."Stuck, clicking out";
        t.lIlIlIIllI[t.lIlIlIlIIl[25]] = t."Talking sarah";
        t.lIlIlIIllI[t.lIlIlIlIIl[26]] = t."Sarah";
        t.lIlIlIIllI[t.lIlIlIlIIl[27]] = t."Nav to hole";
        t.lIlIlIIllI[t.lIlIlIlIIl[28]] = t."Strange hole";
        t.lIlIlIIllI[t.lIlIlIlIIl[29]] = t."Wield";
        t.lIlIlIIllI[t.lIlIlIlIIl[30]] = t."Strange hole";
        t.lIlIlIIllI[t.lIlIlIlIIl[31]] = t."Climb-down";
        t.lIlIlIIllI[t.lIlIlIlIIl[35]] = t."Skeleton";
        t.lIlIlIIllI[t.lIlIlIlIIl[36]] = t."Skeleton";
        t.lIlIlIIllI[t.lIlIlIlIIl[38]] = t."Blockage";
        t.lIlIlIIllI[t.lIlIlIlIIl[39]] = t."Pig Thing";
        t.lIlIlIIllI[t.lIlIlIlIIl[40]] = t."Climb over blockage";
        t.lIlIlIIllI[t.lIlIlIlIIl[41]] = t."Blockage";
        t.lIlIlIIllI[t.lIlIlIlIIl[42]] = t."Climb-over";
        t.lIlIlIIllI[t.lIlIlIlIIl[43]] = t."Pig Thing";
        t.lIlIlIIllI[t.lIlIlIlIIl[44]] = t."Interact skele";
        t.lIlIlIIllI[t.lIlIlIlIIl[45]] = t."Skeleton";
        t.lIlIlIIllI[t.lIlIlIlIIl[46]] = t."Investigate";
        t.lIlIlIIllI[t.lIlIlIlIIl[47]] = t."Interacting Spira";
        t.lIlIlIIllI[t.lIlIlIlIIl[48]] = t."Spria";
        t.lIlIlIIllI[t.lIlIlIlIIl[49]] = t."Sourhog";
        t.lIlIlIIllI[t.lIlIlIlIIl[50]] = t."Reinforced goggles";
        t.lIlIlIIllI[t.lIlIlIlIIl[51]] = t."Reinforced goggles";
        t.lIlIlIIllI[t.lIlIlIlIIl[52]] = t."Reinforced goggles";
        t.lIlIlIIllI[t.lIlIlIlIIl[53]] = t."Wear";
        t.lIlIlIIllI[t.lIlIlIlIIl[54]] = t."Nav to hole";
        t.lIlIlIIllI[t.lIlIlIlIIl[55]] = t."Climb down hole";
        t.lIlIlIIllI[t.lIlIlIlIIl[56]] = t."Strange hole";
        t.lIlIlIIllI[t.lIlIlIlIIl[57]] = t."Strange hole";
        t.lIlIlIIllI[t.lIlIlIlIIl[58]] = t."Climb-down";
        t.lIlIlIIllI[t.lIlIlIlIIl[59]] = t."Blockage";
        t.lIlIlIIllI[t.lIlIlIlIIl[60]] = t."Climb over blockage";
        t.lIlIlIIllI[t.lIlIlIlIIl[61]] = t."Blockage";
        t.lIlIlIIllI[t.lIlIlIlIIl[62]] = t."Climb-over";
        t.lIlIlIIllI[t.lIlIlIlIIl[63]] = t."Reinforced goggles";
        t.lIlIlIIllI[t.lIlIlIlIIl[64]] = t."Reinforced goggles";
        t.lIlIlIIllI[t.lIlIlIlIIl[65]] = t."Reinforced goggles";
        t.lIlIlIIllI[t.lIlIlIlIIl[66]] = t."Wear";
        t.lIlIlIIllI[t.lIlIlIlIIl[34]] = t."Wield";
        t.lIlIlIIllI[t.lIlIlIlIIl[67]] = t."Sourhog";
        t.lIlIlIIllI[t.lIlIlIlIIl[68]] = t."Attack";
        t.lIlIlIIllI[t.lIlIlIlIIl[69]] = t."Eat";
        t.lIlIlIIllI[t.lIlIlIlIIl[70]] = t."Sourhog foot";
        t.lIlIlIIllI[t.lIlIlIlIIl[71]] = t."Cutting foot";
        t.lIlIlIIllI[t.lIlIlIlIIl[72]] = t."Dead sourhog";
        t.lIlIlIIllI[t.lIlIlIlIIl[73]] = t."Cut-foot";
        t.lIlIlIIllI[t.lIlIlIlIIl[74]] = t."Sourhog foot";
        t.lIlIlIIllI[t.lIlIlIlIIl[75]] = t."Nav to sarah";
        t.lIlIlIIllI[t.lIlIlIlIIl[76]] = t."Stuck, clicking out";
        t.lIlIlIIllI[t.lIlIlIlIIl[77]] = t."Talking sarah";
        t.lIlIlIIllI[t.lIlIlIlIIl[78]] = t."Sarah";
        t.lIlIlIIllI[t.lIlIlIlIIl[79]] = t."Nav to Spria";
        t.lIlIlIIllI[t.lIlIlIlIIl[80]] = t."Talking spria";
        t.lIlIlIIllI[t.lIlIlIlIIl[17]] = t."Spria";
        t.lIlIlIIllI[t.lIlIlIlIIl[86]] = t."A porceline of interest";
        t.lIlIlIIllI[t.lIlIlIlIIl[87]] = t."ring of wealth (";
        t.lIlIlIIllI[t.lIlIlIlIIl[96]] = t."Yes.";
        t.lIlIlIIllI[t.lIlIlIlIIl[97]] = t."Talk about the bounty.";
        t.lIlIlIIllI[t.lIlIlIlIIl[98]] = t."I think that'll be all for now.";
        t.lIlIlIIllI[t.lIlIlIlIIl[99]] = t."Yes";
    }

    private static boolean lIIlIIIlIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public int ad() {
        try {
            t.ba();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x1B ^ 0x50) & ~(0x7D ^ 0x36)) != 0) {
            return (0x1B ^ 0x11) & ~(9 ^ 3);
        }
        return lIlIlIlIIl[85];
    }

    private static boolean lIIlIIIIlllIl(int n2) {
        return n2 == 0;
    }

    private static void lIIlIIIIllIIl() {
        lIlIlIlIIl = new int[101];
        t.lIlIlIlIIl[0] = 1;
        t.lIlIlIlIIl[1] = (0xC5 ^ 0xA0 ^ 41 + 54 - -26 + 6) & (0x31 ^ 0x7A ^ (0x93 ^ 0xC2) ^ -1);
        t.lIlIlIlIIl[2] = -(0xFFFFB5DA & 0x6E27) & (0xFFFFFFD9 & 0x37AF);
        t.lIlIlIlIIl[3] = 2;
        t.lIlIlIlIIl[4] = 0x89 ^ 0x8D;
        t.lIlIlIlIIl[5] = 0x86 ^ 0x80;
        t.lIlIlIlIIl[6] = 0xFFFFFFF7 & 0x1F4F;
        t.lIlIlIlIIl[7] = -(0xFFFFCAF6 & 0x75BB) & (0xFFFFDFF9 & Short.MAX_VALUE);
        t.lIlIlIlIIl[8] = 0xFFFF8BBA & 0x77FF;
        t.lIlIlIlIIl[9] = 3;
        t.lIlIlIlIIl[10] = 0xFFFFAF7B & 0x55B7;
        t.lIlIlIlIIl[11] = 0xFFFFF15D & 0x3FF3;
        t.lIlIlIlIIl[12] = 0x70 ^ 0x75;
        t.lIlIlIlIIl[13] = -(0xFFFFBAB7 & 0x5FC9) & (0xFFFFFBFB & 0x1FFF);
        t.lIlIlIlIIl[14] = 1 + 31 - -47 + 126 ^ 75 + 131 - 50 + 43;
        t.lIlIlIlIIl[15] = -(0xFFFFFEF3 & 0x612F) & (0xFFFFFF7F & 0x7FEB);
        t.lIlIlIlIIl[16] = 38 + 58 - 30 + 64 ^ 55 + 129 - 159 + 113;
        t.lIlIlIlIIl[17] = 0xE4 ^ 0xA5;
        t.lIlIlIlIIl[18] = 135 + 15 - 13 + 42 ^ 67 + 132 - 155 + 136;
        t.lIlIlIlIIl[19] = 0xCC ^ 0xC5;
        t.lIlIlIlIIl[20] = -(0xFFFFE2CF & 0x7D3E) & (0xFFFFFBFF & 0x6FEF);
        t.lIlIlIlIIl[21] = -(0xFFFFBB49 & 0x47B7) & (0xFFFFDFFB & 0x2FED);
        t.lIlIlIlIIl[22] = 0x5D ^ 0x56;
        t.lIlIlIlIIl[23] = -(0xFFFFF141 & 0x5EBF) & (0xFFFFDFFF & 0x7BDF);
        t.lIlIlIlIIl[24] = -(0xFFFFFB5F & 0x17B3) & (0xFFFFFFF3 & 0x1FFF);
        t.lIlIlIlIIl[25] = 0xB4 ^ 0xB8;
        t.lIlIlIlIIl[26] = 0x61 ^ 2 ^ (0x69 ^ 7);
        t.lIlIlIlIIl[27] = 0xA0 ^ 0xAE;
        t.lIlIlIlIIl[28] = 0x20 ^ 0x3F ^ (0x69 ^ 0x79);
        t.lIlIlIlIIl[29] = 5 + 73 - 25 + 128 ^ 143 + 136 - 160 + 46;
        t.lIlIlIlIIl[30] = 78 + 137 - 93 + 54 ^ 36 + 83 - 98 + 140;
        t.lIlIlIlIIl[31] = 0x4C ^ 0x28 ^ (0x29 ^ 0x5F);
        t.lIlIlIlIIl[32] = -(0xFFFFC47E & 0x3FBF) & (0xFFFFDF7D & 0x3FFF);
        t.lIlIlIlIIl[33] = -(0xFFFFFFBD & 0x4567) & (0xFFFFDFE5 & 0x7DFE);
        t.lIlIlIlIIl[34] = 117 + 13 - 38 + 78 ^ 132 + 92 - 98 + 26;
        t.lIlIlIlIIl[35] = 0x23 ^ 0x78 ^ (0x37 ^ 0x7F);
        t.lIlIlIlIIl[36] = 0x36 ^ 0x22;
        t.lIlIlIlIIl[37] = 0xFFFFDFE1 & 0x33DE;
        t.lIlIlIlIIl[38] = 0x9C ^ 0x89;
        t.lIlIlIlIIl[39] = 0x16 ^ 0;
        t.lIlIlIlIIl[40] = 0xD1 ^ 0xC6;
        t.lIlIlIlIIl[41] = 0x2B ^ 0x33;
        t.lIlIlIlIIl[42] = 110 + 131 - 219 + 112 ^ 20 + 46 - 27 + 120;
        t.lIlIlIlIIl[43] = 0xF2 ^ 0x8F ^ (0xA2 ^ 0xC5);
        t.lIlIlIlIIl[44] = 0xD ^ 0x16;
        t.lIlIlIlIIl[45] = 0x1B ^ 7;
        t.lIlIlIlIIl[46] = 0x22 ^ 0x3F;
        t.lIlIlIlIIl[47] = 0x1C ^ 2;
        t.lIlIlIlIIl[48] = 0x5E ^ 0x39 ^ (0x6C ^ 0x14);
        t.lIlIlIlIIl[49] = 0x69 ^ 0x49;
        t.lIlIlIlIIl[50] = 0x62 ^ 0x43;
        t.lIlIlIlIIl[51] = 0x2D ^ 0x74 ^ (0xD9 ^ 0xA2);
        t.lIlIlIlIIl[52] = 0x2E ^ 0x62 ^ (0xDF ^ 0xB0);
        t.lIlIlIlIIl[53] = 35 + 122 - 4 + 15 ^ 44 + 44 - 54 + 106;
        t.lIlIlIlIIl[54] = 0x56 ^ 0x34 ^ (0xE7 ^ 0xA0);
        t.lIlIlIlIIl[55] = 0x69 ^ 0x1D ^ (0xC0 ^ 0x92);
        t.lIlIlIlIIl[56] = 0x7F ^ 6 ^ (0x2A ^ 0x74);
        t.lIlIlIlIIl[57] = 51 + 157 - 164 + 129 ^ 128 + 118 - 147 + 34;
        t.lIlIlIlIIl[58] = 0x27 ^ 0xE;
        t.lIlIlIlIIl[59] = 45 + 69 - -76 + 1 ^ 78 + 31 - 38 + 78;
        t.lIlIlIlIIl[60] = 0x7B ^ 0x50;
        t.lIlIlIlIIl[61] = 51 + 28 - 68 + 117 ^ 88 + 110 - 182 + 156;
        t.lIlIlIlIIl[62] = 0x73 ^ 0x7E ^ (0x86 ^ 0xA6);
        t.lIlIlIlIIl[63] = 0x14 ^ 0x3A;
        t.lIlIlIlIIl[64] = 0x5A ^ 0x2A ^ (0x41 ^ 0x1E);
        t.lIlIlIlIIl[65] = 29 + 97 - 123 + 147 ^ 144 + 140 - 223 + 105;
        t.lIlIlIlIIl[66] = 0x36 ^ 1 ^ (0xAD ^ 0xAB);
        t.lIlIlIlIIl[67] = 0x7A ^ 0x2F ^ (0xE ^ 0x68);
        t.lIlIlIlIIl[68] = 0x59 ^ 0x2D ^ (0xEA ^ 0xAA);
        t.lIlIlIlIIl[69] = 46 + 143 - 38 + 0 ^ 7 + 126 - 113 + 142;
        t.lIlIlIlIIl[70] = 0x7B ^ 0x34 ^ (0x42 ^ 0x3B);
        t.lIlIlIlIIl[71] = 0x33 ^ 4;
        t.lIlIlIlIIl[72] = 0x1B ^ 0x23;
        t.lIlIlIlIIl[73] = 0xA3 ^ 0x9A;
        t.lIlIlIlIIl[74] = 0xD ^ 0x12 ^ (0x2C ^ 9);
        t.lIlIlIlIIl[75] = 0x36 ^ 0xD;
        t.lIlIlIlIIl[76] = 0x88 ^ 0xB4;
        t.lIlIlIlIIl[77] = 0xAF ^ 0xA5 ^ (0x40 ^ 0x77);
        t.lIlIlIlIIl[78] = 0xFE ^ 0xC0;
        t.lIlIlIlIIl[79] = 0xA5 ^ 0x9A;
        t.lIlIlIlIIl[80] = 0xD9 ^ 0x99;
        t.lIlIlIlIIl[81] = -(0xFFFFCEC7 & 0x7DFF) & (0xFFFFEFFE & 0x7FEF);
        t.lIlIlIlIIl[82] = 0xFFFFD796 & 0x2BED;
        t.lIlIlIlIIl[83] = 0xFFFFFEDE & 0x2FED;
        t.lIlIlIlIIl[84] = 0xFFFFEDFA & 0x73AD;
        t.lIlIlIlIIl[85] = 0x66 ^ 2;
        t.lIlIlIlIIl[86] = 0x4E ^ 0xC;
        t.lIlIlIlIIl[87] = 198 + 136 - 197 + 66 ^ 49 + 82 - 104 + 109;
        t.lIlIlIlIIl[88] = 0xFFFF9EFF & 0x6D0D;
        t.lIlIlIlIIl[89] = 0xFFFF8DF7 & 0x7EBB;
        t.lIlIlIlIIl[90] = 0xFFFFEFDE & 0x1BFD;
        t.lIlIlIlIIl[91] = -(0xFFFFE6BD & 0x1B63) & (0xFFFFCFFE & 0x3EFF);
        t.lIlIlIlIIl[92] = -(0xFFFFF9F1 & 0x779F) & (0xFFFFFFFC & 0x7DDF);
        t.lIlIlIlIIl[93] = 0xFFFFDF33 & 0x2DDF;
        t.lIlIlIlIIl[94] = -(0xFFFFBDF7 & 0x7389) & (0xFFFFBFF7 & 0x7D9B);
        t.lIlIlIlIIl[95] = -(0xFFFFFBFF & 0x1417) & (0xFFFFBED7 & 0x5DFF);
        t.lIlIlIlIIl[96] = 0xA7 ^ 0x87 ^ (0x3A ^ 0x5E);
        t.lIlIlIlIIl[97] = 0x12 ^ 0x4B ^ (0x8B ^ 0x97);
        t.lIlIlIlIIl[98] = 7 ^ 0x49 ^ (0x56 ^ 0x5E);
        t.lIlIlIlIIl[99] = 0xE4 ^ 0xA3;
        t.lIlIlIlIIl[100] = 0x7C ^ 0x34;
    }

    private static int lIIlIIIIllIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIIlIIIlIIlII(int n2) {
        return n2 < 0;
    }

    private static boolean lIIlIIIIlllll(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIIIlIIlIl(int n2) {
        return n2 <= 0;
    }

    @Override
    public boolean af() {
        boolean bl;
        if (t.lIIlIIIlIIllI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIlIlIIl[57])) {
            bl = lIlIlIlIIl[0];
            0;
            if (1 != 1) {
                return ((192 + 96 - 228 + 179 ^ 46 + 93 - 62 + 120) & (154 + 60 - 203 + 161 ^ 88 + 64 - 35 + 17 ^ -1)) != 0;
            }
        } else {
            bl = lIlIlIlIIl[1];
        }
        return bl;
    }

    private static String lIIlIIIIIIllI(String lllllllllllllllllllIlllIIlIIllII, String lllllllllllllllllllIlllIIlIIIllI) {
        lllllllllllllllllllIlllIIlIIllII = new String(Base64.getDecoder().decode(lllllllllllllllllllIlllIIlIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllIlllIIlIIlIlI = new StringBuilder();
        char[] lllllllllllllllllllIlllIIlIIlIIl = lllllllllllllllllllIlllIIlIIIllI.toCharArray();
        int lllllllllllllllllllIlllIIlIIlIII = lIlIlIlIIl[1];
        char[] lllllllllllllllllllIlllIIlIIIIlI = lllllllllllllllllllIlllIIlIIllII.toCharArray();
        int lllllllllllllllllllIlllIIlIIIIIl = lllllllllllllllllllIlllIIlIIIIlI.length;
        int lllllllllllllllllllIlllIIlIIIIII = lIlIlIlIIl[1];
        while (t.lIIlIIIIlllII(lllllllllllllllllllIlllIIlIIIIII, lllllllllllllllllllIlllIIlIIIIIl)) {
            char lllllllllllllllllllIlllIIlIIllIl = lllllllllllllllllllIlllIIlIIIIlI[lllllllllllllllllllIlllIIlIIIIII];
            lllllllllllllllllllIlllIIlIIlIlI.append((char)(lllllllllllllllllllIlllIIlIIllIl ^ lllllllllllllllllllIlllIIlIIlIIl[lllllllllllllllllllIlllIIlIIlIII % lllllllllllllllllllIlllIIlIIlIIl.length]));
            0;
            ++lllllllllllllllllllIlllIIlIIlIII;
            ++lllllllllllllllllllIlllIIlIIIIII;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllllIlllIIlIIlIlI);
    }

    static {
        t.lIIlIIIIllIIl();
        t.lIIlIIIIllIII();
        bp = new ArrayList<d>();
        cV = new WorldPoint(lIlIlIlIIl[88], lIlIlIlIIl[89], lIlIlIlIIl[1]);
        cZ = new WorldPoint(lIlIlIlIIl[90], lIlIlIlIIl[91], lIlIlIlIIl[1]);
        da = new WorldPoint(lIlIlIlIIl[92], lIlIlIlIIl[93], lIlIlIlIIl[1]);
        db = new WorldPoint(lIlIlIlIIl[94], lIlIlIlIIl[95], lIlIlIlIIl[1]);
        de = null;
        String[] stringArray = new String[lIlIlIlIIl[4]];
        stringArray[t.lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[96]];
        stringArray[t.lIlIlIlIIl[0]] = lIlIlIIllI[lIlIlIlIIl[97]];
        stringArray[t.lIlIlIlIIl[3]] = lIlIlIIllI[lIlIlIlIIl[98]];
        stringArray[t.lIlIlIlIIl[9]] = lIlIlIIllI[lIlIlIlIIl[99]];
        cy = stringArray;
    }

    @Override
    public boolean ac() {
        return lIlIlIlIIl[1];
    }

    @Override
    public String ae() {
        return lIlIlIIllI[lIlIlIlIIl[86]];
    }

    private static boolean lIIlIIIlIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIIlIIIIIIlIl(String lllllllllllllllllllIlllIIIllIlIl, String lllllllllllllllllllIlllIIIllIlII) {
        try {
            SecretKeySpec lllllllllllllllllllIlllIIIlllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIlllIIIllIlII.getBytes(StandardCharsets.UTF_8)), lIlIlIlIIl[16]), "DES");
            Cipher lllllllllllllllllllIlllIIIlllIIl = Cipher.getInstance("DES");
            lllllllllllllllllllIlllIIIlllIIl.init(lIlIlIlIIl[3], lllllllllllllllllllIlllIIIlllIlI);
            return new String(lllllllllllllllllllIlllIIIlllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIlllIIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllIlllIIIlllIII) {
            lllllllllllllllllllIlllIIIlllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIlIIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIIIlIIIll(Object object) {
        return object == null;
    }

    private static boolean lIIlIIIIllIll(int n2) {
        return n2 != 0;
    }

    private static void O() {
        d lllllllllllllllllllIlllIIlIllIIl;
        block10: {
            block9: {
                Object lllllllllllllllllllIlllIIlIllIlI;
                int[] nArray = new int[lIlIlIlIIl[0]];
                nArray[t.lIlIlIlIIl[1]] = lIlIlIlIIl[8];
                if (t.lIIlIIIIlllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(lIlIlIlIIl[8], lIlIlIlIIl[0], lIlIlIlIIl[81]);
                    bp.add(d2);
                    0;
                }
                int[] nArray2 = new int[lIlIlIlIIl[0]];
                nArray2[t.lIlIlIlIIl[1]] = lIlIlIlIIl[10];
                if (t.lIIlIIIIlllIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lllllllllllllllllllIlllIIlIllIlI = new d(lIlIlIlIIl[10], lIlIlIlIIl[0], lIlIlIlIIl[81]);
                    bp.add((d)lllllllllllllllllllIlllIIlIllIlI);
                    0;
                }
                int[] nArray3 = new int[lIlIlIlIIl[0]];
                nArray3[t.lIlIlIlIIl[1]] = lIlIlIlIIl[13];
                if (t.lIIlIIIIlllIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    lllllllllllllllllllIlllIIlIllIlI = new d(lIlIlIlIIl[13], lIlIlIlIIl[50], lIlIlIlIIl[82]);
                    bp.add((d)lllllllllllllllllllIlllIIlIllIlI);
                    0;
                }
                int[] nArray4 = new int[lIlIlIlIIl[0]];
                nArray4[t.lIlIlIlIIl[1]] = lIlIlIlIIl[11];
                if (t.lIIlIIIIlllIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    lllllllllllllllllllIlllIIlIllIlI = new d(lIlIlIlIIl[11], lIlIlIlIIl[12], j.bZ);
                    bp.add((d)lllllllllllllllllllIlllIIlIllIlI);
                    0;
                }
                if (t.lIIlIIIIlllIl(Bank.contains((Predicate)(lllllllllllllllllllIlllIIlIllIlI = item -> item.getName().toLowerCase().contains(lIlIlIIllI[lIlIlIlIIl[87]]))) ? 1 : 0)) {
                    lllllllllllllllllllIlllIIlIllIIl = new d(lIlIlIlIIl[83], lIlIlIlIIl[12], lIlIlIlIIl[84]);
                    bp.add(lllllllllllllllllllIlllIIlIllIIl);
                    0;
                }
                int[] nArray5 = new int[lIlIlIlIIl[0]];
                nArray5[t.lIlIlIlIIl[1]] = lIlIlIlIIl[7];
                if (!t.lIIlIIIIllIll(Bank.contains((int[])nArray5) ? 1 : 0)) break block9;
                int[] nArray6 = new int[lIlIlIlIIl[0]];
                nArray6[t.lIlIlIlIIl[1]] = lIlIlIlIIl[7];
                if (!t.lIIlIIIIllIll(Bank.contains((int[])nArray6) ? 1 : 0)) break block10;
                int[] nArray7 = new int[lIlIlIlIIl[0]];
                nArray7[t.lIlIlIlIIl[1]] = lIlIlIlIIl[7];
                if (!t.lIIlIIIIlllII(Bank.getFirst((int[])nArray7).getQuantity(), lIlIlIlIIl[12])) break block10;
            }
            lllllllllllllllllllIlllIIlIllIIl = new d(lIlIlIlIIl[7], lIlIlIlIIl[28], lIlIlIlIIl[82]);
            bp.add(lllllllllllllllllllIlllIIlIllIIl);
            0;
        }
        int[] nArray = new int[lIlIlIlIIl[0]];
        nArray[t.lIlIlIlIIl[1]] = lIlIlIlIIl[6];
        if (t.lIIlIIIIlllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            lllllllllllllllllllIlllIIlIllIIl = new d(lIlIlIlIIl[6], lIlIlIlIIl[57], lIlIlIlIIl[82]);
            bp.add(lllllllllllllllllllIlllIIlIllIIl);
            0;
        }
    }
}

