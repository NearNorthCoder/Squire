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
                "".length();
                if (" ".length() <= "   ".length()) return n2 != 0;
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
                                "".length();
                            }
                            if (t.lIIlIIIIllIll(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[3]];
                                if (t.lIIlIIIIlllll(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lIlIlIlIIl[4]);
                                    "".length();
                                }
                                if (t.lIIlIIIIlllll(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lIlIlIlIIl[3]);
                                    "".length();
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
                        "".length();
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
                            "".length();
                            Time.sleepTicks((int)lIlIlIlIIl[0]);
                            "".length();
                        }
                        if (t.lIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(cV), lIlIlIlIIl[4])) {
                            AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[18]];
                            dc = lIlIlIlIIl[1];
                            if (t.lIIlIIIIlllIl(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[lIlIlIlIIl[0]];
                                stringArray[t.lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[16]];
                                TileObjects.getNearest((String[])stringArray).interact(lIlIlIIllI[lIlIlIlIIl[19]]);
                                Time.sleepTicks((int)lIlIlIlIIl[3]);
                                "".length();
                            }
                            g.a(cy);
                        }
                    }
                    if (t.lIIlIIIlIIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIlIlIIl[12])) {
                        if (t.lIIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(cZ), lIlIlIlIIl[4])) {
                            AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[14]];
                            Movement.walkTo((WorldPoint)cZ);
                            "".length();
                            Time.sleepTicks((int)lIlIlIlIIl[0]);
                            "".length();
                            if (t.lIIlIIIIllIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIlIlIlIIl[20], lIlIlIlIIl[21], lIlIlIlIIl[1])) ? 1 : 0)) {
                                AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[22]];
                                e.c(new WorldPoint(lIlIlIlIIl[23], lIlIlIlIIl[24], lIlIlIlIIl[1]));
                                Time.sleepTicks((int)lIlIlIlIIl[5]);
                                "".length();
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
                            "".length();
                            Time.sleepTicks((int)lIlIlIlIIl[0]);
                            "".length();
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
                                "".length();
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
                        "".length();
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
                                "".length();
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
                        "".length();
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
                        "".length();
                        Time.sleepTicks((int)lIlIlIlIIl[0]);
                        "".length();
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
                        "".length();
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
                        "".length();
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
                    "".length();
                }
                if (t.lIIlIIIlIIlII(t.lIIlIIIIllIlI(e.u(), 60.0))) {
                    int[] nArray = new int[lIlIlIlIIl[0]];
                    nArray[t.lIlIlIlIIl[1]] = lIlIlIlIIl[13];
                    if (t.lIIlIIIIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray8 = new int[lIlIlIlIIl[0]];
                        nArray8[t.lIlIlIlIIl[1]] = lIlIlIlIIl[13];
                        Inventory.getFirst((int[])nArray8).interact(lIlIlIIllI[lIlIlIlIIl[69]]);
                        Time.sleepTicks((int)lIlIlIlIIl[0]);
                        "".length();
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
                    "".length();
                }
                String[] stringArray16 = new String[lIlIlIlIIl[0]];
                stringArray16[t.lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[74]];
                if (t.lIIlIIIIllIll(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                    if (t.lIIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(cZ), lIlIlIlIIl[4])) {
                        AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[75]];
                        Movement.walkTo((WorldPoint)cZ);
                        "".length();
                        Time.sleepTicks((int)lIlIlIlIIl[0]);
                        "".length();
                        if (t.lIIlIIIIllIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIlIlIlIIl[20], lIlIlIlIIl[21], lIlIlIlIIl[1])) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[76]];
                            e.c(new WorldPoint(lIlIlIlIIl[23], lIlIlIlIIl[24], lIlIlIlIIl[1]));
                            Time.sleepTicks((int)lIlIlIlIIl[5]);
                            "".length();
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
                    "".length();
                    Time.sleepTicks((int)lIlIlIlIIl[0]);
                    "".length();
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
        t.lIlIlIIllI[t.lIlIlIlIIl[1]] = t.lIIlIIIIIIlII("WBSy4u3D1ibFH0VF1/PVvzw7fAp5N5e7+BXybq06SJ4G/LHpsimzZ9FoNzcg1YSM", "vcIHk");
        t.lIlIlIIllI[t.lIlIlIlIIl[0]] = t.lIIlIIIIIIlIl("PhxNn5vRXsMk2EKrout8ig==", "Cnssa");
        t.lIlIlIIllI[t.lIlIlIlIIl[3]] = t.lIIlIIIIIIlIl("i4/HTq7ECC5hP7eA4hIRMm9dZDds7s7N", "wvwPk");
        t.lIlIlIIllI[t.lIlIlIlIIl[9]] = t.lIIlIIIIIIlIl("LnIPXzA09dSNdqPoF+XmRK65zRGvsOzihIRcn+BTRyF/60vaZEi2sVys3ctG7vRncUGdTJ2/Ie4=", "MEzqX");
        t.lIlIlIIllI[t.lIlIlIlIIl[4]] = t.lIIlIIIIIIllI("DQc6ODg=", "IuSVS");
        t.lIlIlIIllI[t.lIlIlIlIIl[12]] = t.lIIlIIIIIIlIl("C7cYA1LYZuM=", "EbCTs");
        t.lIlIlIIllI[t.lIlIlIlIIl[5]] = t.lIIlIIIIIIllI("NAYEVwMVRwEDFggT", "zgrww");
        t.lIlIlIIllI[t.lIlIlIlIIl[18]] = t.lIIlIIIIIIlII("Ak1i7IH1c4RES6I2w2nsQQ==", "NITsG");
        t.lIlIlIIllI[t.lIlIlIlIIl[16]] = t.lIIlIIIIIIllI("Bj02PA0tciA6Dzo2", "HRBUn");
        t.lIlIlIIllI[t.lIlIlIlIIl[19]] = t.lIIlIIIIIIlII("1Uj1E4V9ZlE=", "BPqOe");
        t.lIlIlIIllI[t.lIlIlIlIIl[14]] = t.lIIlIIIIIIlIl("2TWpNc7Qyzeb0BD9xkAsTw==", "sVmkn");
        t.lIlIlIIllI[t.lIlIlIlIIl[22]] = t.lIIlIIIIIIlII("GzrDN1XQI9dXbix9H3T/LmMK/W8v5Jfc", "AhLoz");
        t.lIlIlIIllI[t.lIlIlIlIIl[25]] = t.lIIlIIIIIIllI("NTMGJC8PNUo8JxMzAg==", "aRjOF");
        t.lIlIlIIllI[t.lIlIlIlIIl[26]] = t.lIIlIIIIIIllI("PAo7Lxo=", "okINr");
        t.lIlIlIIllI[t.lIlIlIlIIl[27]] = t.lIIlIIIIIIlII("Q+g/l2Rgqq/ueDMiUbr4JA==", "wToCH");
        t.lIlIlIIllI[t.lIlIlIlIIl[28]] = t.lIIlIIIIIIlII("F+CbatYQXYN0yxJJ7aOG7w==", "zPmeq");
        t.lIlIlIIllI[t.lIlIlIlIIl[29]] = t.lIIlIIIIIIlIl("x9mPfxjHBq0=", "tbfGf");
        t.lIlIlIIllI[t.lIlIlIlIIl[30]] = t.lIIlIIIIIIllI("MB8mIiAEDnQrIQ8O", "ckTCN");
        t.lIlIlIIllI[t.lIlIlIlIIl[31]] = t.lIIlIIIIIIlII("AUJnuquT5zHtdWgVgz46pA==", "MtQZO");
        t.lIlIlIIllI[t.lIlIlIlIIl[35]] = t.lIIlIIIIIIlII("lc0koonSlut3oZEG2DjksA==", "NQfsk");
        t.lIlIlIIllI[t.lIlIlIlIIl[36]] = t.lIIlIIIIIIlIl("mO89lEjz31UA6TQXafvqxw==", "OwnNM");
        t.lIlIlIIllI[t.lIlIlIlIIl[38]] = t.lIIlIIIIIIllI("KBkqLScLEiA=", "juENL");
        t.lIlIlIIllI[t.lIlIlIlIIl[39]] = t.lIIlIIIIIIllI("PDMRWSwEMxge", "lZvyx");
        t.lIlIlIIllI[t.lIlIlIlIIl[40]] = t.lIIlIIIIIIllI("JgkfKyRFCgAjNEUHGiklDgQRIw==", "eevFF");
        t.lIlIlIIllI[t.lIlIlIlIIl[41]] = t.lIIlIIIIIIlII("MYizxERBY3x89kFWbUQ7nA==", "jaPCa");
        t.lIlIlIIllI[t.lIlIlIlIIl[42]] = t.lIIlIIIIIIlIl("i8O3mGLNqnwBDySg9wtuwQ==", "VhVbE");
        t.lIlIlIIllI[t.lIlIlIlIIl[43]] = t.lIIlIIIIIIllI("NgEzdAMOAToz", "fhTTW");
        t.lIlIlIIllI[t.lIlIlIlIIl[44]] = t.lIIlIIIIIIlII("iUO8SkkiuefStxRMfu3+RQ==", "EpPDY");
        t.lIlIlIIllI[t.lIlIlIlIIl[45]] = t.lIIlIIIIIIlIl("NGAWOIB437M61INVB874sg==", "nTzCn");
        t.lIlIlIIllI[t.lIlIlIlIIl[46]] = t.lIIlIIIIIIlII("Z6U83nv07Xe5CmP7+dzmpA==", "YbulJ");
        t.lIlIlIIllI[t.lIlIlIlIIl[47]] = t.lIIlIIIIIIlII("AXlFHq0MNR730uAmLqe5qJdUlQX6+j6Z", "EfcfG");
        t.lIlIlIIllI[t.lIlIlIlIIl[48]] = t.lIIlIIIIIIlIl("DFEksKomwKM=", "ZkDbV");
        t.lIlIlIIllI[t.lIlIlIlIIl[49]] = t.lIIlIIIIIIlIl("0gv0ffC+CmA=", "EENfh");
        t.lIlIlIIllI[t.lIlIlIlIIl[50]] = t.lIIlIIIIIIlIl("zW22LDQWWgZ3wqmBAG7sFUrlCugwuy8y", "tAzju");
        t.lIlIlIIllI[t.lIlIlIlIIl[51]] = t.lIIlIIIIIIlII("LqjKxaC7p1vI8mmcdNTwrpFkSCiiHy+X", "YWwiP");
        t.lIlIlIIllI[t.lIlIlIlIIl[52]] = t.lIIlIIIIIIlIl("W9KMUadL0LMPgEHDOpsV0Zni9CqDKp3U", "tgMYs");
        t.lIlIlIIllI[t.lIlIlIlIIl[53]] = t.lIIlIIIIIIlIl("jy+hdfMo/n8=", "VFHhQ");
        t.lIlIlIIllI[t.lIlIlIlIIl[54]] = t.lIIlIIIIIIlII("Lr5l81Mruuf2uKTgWla0JQ==", "grAEZ");
        t.lIlIlIIllI[t.lIlIlIlIIl[55]] = t.lIIlIIIIIIlIl("h2ACABSnOwoe2RgBUO/BgQ==", "uzSzl");
        t.lIlIlIIllI[t.lIlIlIlIIl[56]] = t.lIIlIIIIIIlIl("hE1XmPR4ALPIiQ9HYK70MQ==", "vvyOC");
        t.lIlIlIIllI[t.lIlIlIlIIl[57]] = t.lIIlIIIIIIllI("ByI2LCUzM2QlJDgz", "TVDMK");
        t.lIlIlIIllI[t.lIlIlIlIIl[58]] = t.lIIlIIIIIIlIl("6/3bL9MBnPdEana2AnbY8A==", "zMccn");
        t.lIlIlIIllI[t.lIlIlIlIIl[59]] = t.lIIlIIIIIIlIl("tUSg0JQSJeA+U7eb2zcJIA==", "DkBeU");
        t.lIlIlIIllI[t.lIlIlIlIIl[60]] = t.lIIlIIIIIIlII("Y80giuGk8+UkIH0lVIc4AVUgCqmS1+OH", "RobMB");
        t.lIlIlIIllI[t.lIlIlIlIIl[61]] = t.lIIlIIIIIIlII("44DL1rbeqMFu4BKrW5HS/w==", "rlZwh");
        t.lIlIlIIllI[t.lIlIlIlIIl[62]] = t.lIIlIIIIIIlII("uxu8VlDoJUwH2wQpCJ8bTg==", "ppGLE");
        t.lIlIlIIllI[t.lIlIlIlIIl[63]] = t.lIIlIIIIIIlII("TuSZwnxNyM7ndhm0T3n5hE50+Aj+GJkf", "HEcJT");
        t.lIlIlIIllI[t.lIlIlIlIIl[64]] = t.lIIlIIIIIIllI("FCkwFg0pPjodD2YrNh8MKikq", "FLYxk");
        t.lIlIlIIllI[t.lIlIlIlIIl[65]] = t.lIIlIIIIIIllI("CjIYGQg3JRISCngwHhAJNDIC", "XWqwn");
        t.lIlIlIIllI[t.lIlIlIlIIl[66]] = t.lIIlIIIIIIlIl("ZcYP+wbwpsk=", "JSikV");
        t.lIlIlIIllI[t.lIlIlIlIIl[34]] = t.lIIlIIIIIIlIl("apsAxl42b0w=", "WEQlF");
        t.lIlIlIIllI[t.lIlIlIlIIl[67]] = t.lIIlIIIIIIlII("zYzyGESIGCU=", "vgLbo");
        t.lIlIlIIllI[t.lIlIlIlIIl[68]] = t.lIIlIIIIIIllI("BSMCCRIv", "DWvhq");
        t.lIlIlIIllI[t.lIlIlIlIIl[69]] = t.lIIlIIIIIIlII("jDKE5x/MA3M=", "CKjNr");
        t.lIlIlIIllI[t.lIlIlIlIIl[70]] = t.lIIlIIIIIIlII("KDJ0Kvp4TIVlCn3s6SUWaA==", "yDkfT");
        t.lIlIlIIllI[t.lIlIlIlIIl[71]] = t.lIIlIIIIIIllI("MxAGJwYeAlI1AB8R", "perSo");
        t.lIlIlIIllI[t.lIlIlIlIIl[72]] = t.lIIlIIIIIIlII("BXWas9GcmsgmMlHRu4R/HA==", "HtHpH");
        t.lIlIlIIllI[t.lIlIlIlIIl[73]] = t.lIIlIIIIIIlII("Z8HoOC57fyz0PMSy7T2XQA==", "PVYEY");
        t.lIlIlIIllI[t.lIlIlIlIIl[74]] = t.lIIlIIIIIIllI("CR8MOzA1F1kvNzUE", "ZpyIX");
        t.lIlIlIIllI[t.lIlIlIlIIl[75]] = t.lIIlIIIIIIlII("cjR2FIr8RNuoZq1V/XbyIw==", "lXfvY");
        t.lIlIlIIllI[t.lIlIlIlIIl[76]] = t.lIIlIIIIIIlII("8FEfCNOAmVvu8mfpjI23T2hSJCWC7Y4T", "OGsjc");
        t.lIlIlIIllI[t.lIlIlIlIIl[77]] = t.lIIlIIIIIIllI("HzEnHwwlN2sHBDkxIw==", "KPKte");
        t.lIlIlIIllI[t.lIlIlIlIIl[78]] = t.lIIlIIIIIIllI("IQ4gLTk=", "roRLQ");
        t.lIlIlIIllI[t.lIlIlIlIIl[79]] = t.lIIlIIIIIIlIl("tgnxw9qRjC+tTE3PVO2B0w==", "gdtOU");
        t.lIlIlIIllI[t.lIlIlIlIIl[80]] = t.lIIlIIIIIIlII("IeUL73lulk8SA1fpZN6f9A==", "NpMFY");
        t.lIlIlIIllI[t.lIlIlIlIIl[17]] = t.lIIlIIIIIIlIl("BBLLi6t/RMM=", "OOBBw");
        t.lIlIlIIllI[t.lIlIlIlIIl[86]] = t.lIIlIIIIIIlII("d+Orw0D7n23WMuUNXCnVJ4zJRk6mDiFK", "txkfC");
        t.lIlIlIIllI[t.lIlIlIlIIl[87]] = t.lIIlIIIIIIlIl("CdGfKNvFIDcP36gC6mdf+KBSLV/mv+/4", "rTGaF");
        t.lIlIlIIllI[t.lIlIlIlIIl[96]] = t.lIIlIIIIIIllI("CQIbQg==", "Pghlo");
        t.lIlIlIIllI[t.lIlIlIlIIl[97]] = t.lIIlIIIIIIllI("Agk5AEg3CjoeHHYcPQ5INAcgBRwvRg==", "VhUkh");
        t.lIlIlIIllI[t.lIlIlIlIIl[98]] = t.lIIlIIIIIIlIl("DK3bK/QrgBz8yYHULh23CQqq9NTPp3R1OU2qv06avJs=", "uuvag");
        t.lIlIlIIllI[t.lIlIlIlIIl[99]] = t.lIIlIIIIIIlII("vRZRw0TvR5s=", "zZsRk");
    }

    private static boolean lIIlIIIlIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public int ad() {
        try {
            t.ba();
            "".length();
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
        t.lIlIlIlIIl[0] = " ".length();
        t.lIlIlIlIIl[1] = (0xC5 ^ 0xA0 ^ 41 + 54 - -26 + 6) & (0x31 ^ 0x7A ^ (0x93 ^ 0xC2) ^ -" ".length());
        t.lIlIlIlIIl[2] = -(0xFFFFB5DA & 0x6E27) & (0xFFFFFFD9 & 0x37AF);
        t.lIlIlIlIIl[3] = "  ".length();
        t.lIlIlIlIIl[4] = 0x89 ^ 0x8D;
        t.lIlIlIlIIl[5] = 0x86 ^ 0x80;
        t.lIlIlIlIIl[6] = 0xFFFFFFF7 & 0x1F4F;
        t.lIlIlIlIIl[7] = -(0xFFFFCAF6 & 0x75BB) & (0xFFFFDFF9 & Short.MAX_VALUE);
        t.lIlIlIlIIl[8] = 0xFFFF8BBA & 0x77FF;
        t.lIlIlIlIIl[9] = "   ".length();
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
            "".length();
            if (" ".length() != " ".length()) {
                return ((192 + 96 - 228 + 179 ^ 46 + 93 - 62 + 120) & (154 + 60 - 203 + 161 ^ 88 + 64 - 35 + 17 ^ -" ".length())) != 0;
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
            "".length();
            ++lllllllllllllllllllIlllIIlIIlIII;
            ++lllllllllllllllllllIlllIIlIIIIII;
            "".length();
            if (-" ".length() == -" ".length()) continue;
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
                    "".length();
                }
                int[] nArray2 = new int[lIlIlIlIIl[0]];
                nArray2[t.lIlIlIlIIl[1]] = lIlIlIlIIl[10];
                if (t.lIIlIIIIlllIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lllllllllllllllllllIlllIIlIllIlI = new d(lIlIlIlIIl[10], lIlIlIlIIl[0], lIlIlIlIIl[81]);
                    bp.add((d)lllllllllllllllllllIlllIIlIllIlI);
                    "".length();
                }
                int[] nArray3 = new int[lIlIlIlIIl[0]];
                nArray3[t.lIlIlIlIIl[1]] = lIlIlIlIIl[13];
                if (t.lIIlIIIIlllIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    lllllllllllllllllllIlllIIlIllIlI = new d(lIlIlIlIIl[13], lIlIlIlIIl[50], lIlIlIlIIl[82]);
                    bp.add((d)lllllllllllllllllllIlllIIlIllIlI);
                    "".length();
                }
                int[] nArray4 = new int[lIlIlIlIIl[0]];
                nArray4[t.lIlIlIlIIl[1]] = lIlIlIlIIl[11];
                if (t.lIIlIIIIlllIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    lllllllllllllllllllIlllIIlIllIlI = new d(lIlIlIlIIl[11], lIlIlIlIIl[12], j.bZ);
                    bp.add((d)lllllllllllllllllllIlllIIlIllIlI);
                    "".length();
                }
                if (t.lIIlIIIIlllIl(Bank.contains((Predicate)(lllllllllllllllllllIlllIIlIllIlI = item -> item.getName().toLowerCase().contains(lIlIlIIllI[lIlIlIlIIl[87]]))) ? 1 : 0)) {
                    lllllllllllllllllllIlllIIlIllIIl = new d(lIlIlIlIIl[83], lIlIlIlIIl[12], lIlIlIlIIl[84]);
                    bp.add(lllllllllllllllllllIlllIIlIllIIl);
                    "".length();
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
            "".length();
        }
        int[] nArray = new int[lIlIlIlIIl[0]];
        nArray[t.lIlIlIlIIl[1]] = lIlIlIlIIl[6];
        if (t.lIIlIIIIlllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            lllllllllllllllllllIlllIIlIllIIl = new d(lIlIlIlIIl[6], lIlIlIlIIl[57], lIlIlIlIIl[82]);
            bp.add(lllllllllllllllllllIlllIIlIllIIl);
            "".length();
        }
    }
}

