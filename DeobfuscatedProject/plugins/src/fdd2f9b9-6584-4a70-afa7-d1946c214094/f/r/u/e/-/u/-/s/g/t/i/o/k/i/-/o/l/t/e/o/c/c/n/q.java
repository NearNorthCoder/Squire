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
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.U;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.b;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.d;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.f;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.g;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.i;
import gg.squire.account.AccBuilderRogues;
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

public class q
implements G {
    public static /* synthetic */ WorldPoint cj;
    private static /* synthetic */ String[] lIIlIlIIIl;
    private static /* synthetic */ String[] bR;
    public static /* synthetic */ WorldPoint cg;
    static /* synthetic */ boolean cl;
    public static /* synthetic */ WorldPoint ch;
    private static /* synthetic */ int[] lIIlIlIIlI;
    private static /* synthetic */ WorldPoint cm;
    public static /* synthetic */ List<d> bv;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ int ck;
    public static /* synthetic */ WorldPoint ci;

    private static boolean llllllIlIIIl(int n2) {
        return n2 != 0;
    }

    private static String lllllIlllllI(String lllllllllllllllllllllllIIllllllI, String lllllllllllllllllllllllIIlllllIl) {
        try {
            SecretKeySpec lllllllllllllllllllllllIlIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllllIIlllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllllllIlIIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllllllllllIlIIIIIlI.init(lIIlIlIIlI[3], lllllllllllllllllllllllIlIIIIIll);
            return new String(lllllllllllllllllllllllIlIIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllllIIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllllllIlIIIIIIl) {
            lllllllllllllllllllllllIlIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIllIII(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (q.llllllIlllII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIlIlIIlI[57])) {
            bl = lIIlIlIIlI[0];
            "".length();
            if ((137 + 102 - 90 + 6 ^ 133 + 102 - 186 + 110) < "   ".length()) {
                return ((0x50 ^ 0x6E ^ (0x67 ^ 0xA)) & (0x7C ^ 0x1B ^ (3 ^ 0x37) ^ -" ".length())) != 0;
            }
        } else {
            bl = lIIlIlIIlI[1];
        }
        return bl;
    }

    private static boolean llllllIlllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static int llllllIlIIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    public static void aC() {
        block63: {
            block64: {
                block65: {
                    if (q.llllllIlIIIl(bt ? 1 : 0)) {
                        b.a(bv);
                        if (q.llllllIlIIlI(bv.size(), lIIlIlIIlI[0])) {
                            System.out.println(lIIlIlIIIl[lIIlIlIIlI[1]]);
                            bt = lIIlIlIIlI[1];
                        }
                    }
                    if (!q.llllllIlIIll(bt ? 1 : 0)) break block63;
                    if (q.llllllIlIIll(q.ab() ? 1 : 0) && q.llllllIlIIll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                        BankLocation lllllllllllllllllllllllIlIllIIll = BankLocation.getNearest();
                        if (q.llllllIlIlII(lllllllllllllllllllllllIlIllIIll) && q.llllllIlIIll(lllllllllllllllllllllllIlIllIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[0]];
                            a.a(lllllllllllllllllllllllIlIllIIll);
                        }
                        if (q.llllllIlIlII(lllllllllllllllllllllllIlIllIIll) && q.llllllIlIIIl(lllllllllllllllllllllllIlIllIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (q.llllllIlIIll(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIlIIlI[2]);
                                "".length();
                            }
                            if (q.llllllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[3]];
                                if (q.llllllIlIlIl(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lIIlIlIIlI[4]);
                                    "".length();
                                }
                                if (q.llllllIlIlIl(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lIIlIlIIlI[3]);
                                    "".length();
                                }
                                int[] nArray = new int[lIIlIlIIlI[5]];
                                nArray[q.lIIlIlIIlI[1]] = lIIlIlIIlI[6];
                                nArray[q.lIIlIlIIlI[0]] = lIIlIlIIlI[7];
                                nArray[q.lIIlIlIIlI[3]] = lIIlIlIIlI[8];
                                nArray[q.lIIlIlIIlI[9]] = lIIlIlIIlI[10];
                                nArray[q.lIIlIlIIlI[4]] = lIIlIlIIlI[11];
                                nArray[q.lIIlIlIIlI[12]] = lIIlIlIIlI[13];
                                if (q.llllllIlIIll(e.b(nArray) ? 1 : 0)) {
                                    q.af();
                                    System.out.println(lIIlIlIIIl[lIIlIlIIlI[9]]);
                                    bt = lIIlIlIIlI[0];
                                    return;
                                }
                                int[] nArray2 = new int[lIIlIlIIlI[5]];
                                nArray2[q.lIIlIlIIlI[1]] = lIIlIlIIlI[6];
                                nArray2[q.lIIlIlIIlI[0]] = lIIlIlIIlI[7];
                                nArray2[q.lIIlIlIIlI[3]] = lIIlIlIIlI[8];
                                nArray2[q.lIIlIlIIlI[9]] = lIIlIlIIlI[10];
                                nArray2[q.lIIlIlIIlI[4]] = lIIlIlIIlI[11];
                                nArray2[q.lIIlIlIIlI[12]] = lIIlIlIIlI[13];
                                if (q.llllllIlIIIl(e.b(nArray2) ? 1 : 0)) {
                                    int[] nArray3 = new int[lIIlIlIIlI[3]];
                                    nArray3[q.lIIlIlIIlI[1]] = lIIlIlIIlI[8];
                                    nArray3[q.lIIlIlIIlI[0]] = lIIlIlIIlI[10];
                                    a.a(nArray3);
                                    a.a(lIIlIlIIlI[6], lIIlIlIIlI[14]);
                                    a.a(lIIlIlIIlI[7], lIIlIlIIlI[14]);
                                    a.a(lIIlIlIIlI[15], lIIlIlIIlI[14]);
                                    a.b(f.aR, lIIlIlIIlI[0]);
                                    a.a(lIIlIlIIlI[11], lIIlIlIIlI[4]);
                                    a.a(lIIlIlIIlI[13], lIIlIlIIlI[16]);
                                }
                            }
                        }
                    }
                    if (q.llllllIlIIIl(Inventory.contains((int[])f.aV) ? 1 : 0) && q.llllllIlIIlI(Movement.getRunEnergy(), lIIlIlIIlI[17])) {
                        Inventory.getFirst((int[])f.aV).interact(lIIlIlIIIl[lIIlIlIIlI[4]]);
                        Time.sleepTicks((int)lIIlIlIIlI[0]);
                        "".length();
                    }
                    if (q.llllllIlIIIl(q.ab() ? 1 : 0) && q.llllllIlIIll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                        if (q.llllllIlIllI(Players.getLocal().getWorldLocation().distanceTo(cg), lIIlIlIIlI[4])) {
                            if (q.llllllIlIIIl(Inventory.contains((int[])f.aR) ? 1 : 0) && q.llllllIlIIll(Equipment.contains((int[])f.aR) ? 1 : 0)) {
                                Inventory.getFirst((int[])f.aR).interact(lIIlIlIIIl[lIIlIlIIlI[12]]);
                            }
                            if (q.llllllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[5]];
                            Movement.walkTo((WorldPoint)cg);
                            "".length();
                            Time.sleepTicks((int)lIIlIlIIlI[0]);
                            "".length();
                        }
                        if (q.llllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(cg), lIIlIlIIlI[4])) {
                            AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[18]];
                            ck = lIIlIlIIlI[1];
                            if (q.llllllIlIIll(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[lIIlIlIIlI[0]];
                                stringArray[q.lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[16]];
                                TileObjects.getNearest((String[])stringArray).interact(lIIlIlIIIl[lIIlIlIIlI[19]]);
                                Time.sleepTicks((int)lIIlIlIIlI[3]);
                                "".length();
                            }
                            g.a(bR);
                        }
                    }
                    if (q.llllllIllIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIlIlIIlI[12])) {
                        if (q.llllllIlIllI(Players.getLocal().getWorldLocation().distanceTo(ch), lIIlIlIIlI[4])) {
                            AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[14]];
                            Movement.walkTo((WorldPoint)ch);
                            "".length();
                            Time.sleepTicks((int)lIIlIlIIlI[0]);
                            "".length();
                            if (q.llllllIlIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIlIIlI[20], lIIlIlIIlI[21], lIIlIlIIlI[1])) ? 1 : 0)) {
                                AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[22]];
                                e.c(new WorldPoint(lIIlIlIIlI[23], lIIlIlIIlI[24], lIIlIlIIlI[1]));
                                Time.sleepTicks((int)lIIlIlIIlI[5]);
                                "".length();
                            }
                        }
                        if (q.llllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(ch), lIIlIlIIlI[4])) {
                            AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[25]];
                            g.a(lIIlIlIIIl[lIIlIlIIlI[26]], bR, lIIlIlIIlI[0]);
                        }
                    }
                    if (q.llllllIllIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIlIlIIlI[14])) {
                        if (q.llllllIlIllI(Players.getLocal().getWorldLocation().distanceTo(ci), lIIlIlIIlI[4])) {
                            AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[27]];
                            Movement.walkTo((WorldPoint)ci);
                            "".length();
                            Time.sleepTicks((int)lIIlIlIIlI[0]);
                            "".length();
                        }
                        if (q.llllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(ci), lIIlIlIIlI[4])) {
                            int[] nArray = new int[lIIlIlIIlI[0]];
                            nArray[q.lIIlIlIIlI[1]] = lIIlIlIIlI[8];
                            if (q.llllllIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray4 = new int[lIIlIlIIlI[0]];
                                nArray4[q.lIIlIlIIlI[1]] = lIIlIlIIlI[8];
                                String[] stringArray = new String[lIIlIlIIlI[0]];
                                stringArray[q.lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[28]];
                                Inventory.getFirst((int[])nArray4).useOn(TileObjects.getNearest((String[])stringArray));
                                Time.sleepTicks((int)lIIlIlIIlI[3]);
                                "".length();
                            }
                        }
                    }
                    if (!q.llllllIllIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIlIlIIlI[28])) break block64;
                    int[] nArray = new int[lIIlIlIIlI[0]];
                    nArray[q.lIIlIlIIlI[1]] = lIIlIlIIlI[10];
                    if (q.llllllIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray5 = new int[lIIlIlIIlI[0]];
                        nArray5[q.lIIlIlIIlI[1]] = lIIlIlIIlI[10];
                        Inventory.getFirst((int[])nArray5).interact(lIIlIlIIIl[lIIlIlIIlI[29]]);
                    }
                    if (q.llllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(ci), lIIlIlIIlI[4])) {
                        String[] stringArray = new String[lIIlIlIIlI[0]];
                        stringArray[q.lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[30]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIlIlIIIl[lIIlIlIIlI[31]]);
                        Time.sleepTicks((int)lIIlIlIIlI[9]);
                        "".length();
                    }
                    if (!q.llllllIlIllI(Players.getLocal().getLocalLocation().distanceTo(new LocalPoint(lIIlIlIIlI[32], lIIlIlIIlI[33])), lIIlIlIIlI[34])) break block65;
                    String[] stringArray = new String[lIIlIlIIlI[0]];
                    stringArray[q.lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[35]];
                    if (!q.llllllIlIlII(TileObjects.getNearest((String[])stringArray))) break block64;
                }
                String[] stringArray = new String[lIIlIlIIlI[0]];
                stringArray[q.lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[36]];
                if (q.llllllIlIlII(TileObjects.getNearest((String[])stringArray))) {
                    if (q.llllllIlIllI(Players.getLocal().getLocalLocation().getY(), lIIlIlIIlI[37])) {
                        String[] stringArray2 = new String[lIIlIlIIlI[0]];
                        stringArray2[q.lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[38]];
                        if (q.llllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(TileObjects.getNearest((String[])stringArray2).getWorldLocation()), lIIlIlIIlI[14])) {
                            String[] stringArray3 = new String[lIIlIlIIlI[0]];
                            stringArray3[q.lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[39]];
                            if (q.llllllIllIIl(NPCs.getNearest((String[])stringArray3))) {
                                AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[40]];
                                String[] stringArray4 = new String[lIIlIlIIlI[0]];
                                stringArray4[q.lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[41]];
                                TileObjects.getNearest((String[])stringArray4).interact(lIIlIlIIIl[lIIlIlIIlI[42]]);
                                Time.sleepTicks((int)lIIlIlIIlI[14]);
                                "".length();
                            }
                        }
                    }
                    String[] stringArray5 = new String[lIIlIlIIlI[0]];
                    stringArray5[q.lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[43]];
                    if (q.llllllIllIIl(NPCs.getNearest((String[])stringArray5)) && q.llllllIlIIll(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[44]];
                        String[] stringArray6 = new String[lIIlIlIIlI[0]];
                        stringArray6[q.lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[45]];
                        TileObjects.getNearest((String[])stringArray6).interact(lIIlIlIIIl[lIIlIlIIlI[46]]);
                        Time.sleepTicks((int)lIIlIlIIlI[12]);
                        "".length();
                        g.a(bR);
                    }
                    g.a(bR);
                }
            }
            if (q.llllllIllIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIlIlIIlI[36])) {
                AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[47]];
                g.a(lIIlIlIIIl[lIIlIlIIlI[48]], bR);
            }
            if (q.llllllIllIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIlIlIIlI[42])) {
                if (q.llllllIlIllI(Players.getLocal().getWorldLocation().distanceTo(ci), lIIlIlIIlI[4])) {
                    String[] stringArray = new String[lIIlIlIIlI[0]];
                    stringArray[q.lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[49]];
                    if (q.llllllIllIIl(NPCs.getNearest((String[])stringArray))) {
                        String[] stringArray7 = new String[lIIlIlIIlI[0]];
                        stringArray7[q.lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[50]];
                        if (q.llllllIlIIll(Equipment.contains((String[])stringArray7) ? 1 : 0)) {
                            String[] stringArray8 = new String[lIIlIlIIlI[0]];
                            stringArray8[q.lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[51]];
                            if (q.llllllIlIIIl(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                                String[] stringArray9 = new String[lIIlIlIIlI[0]];
                                stringArray9[q.lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[52]];
                                Inventory.getFirst((String[])stringArray9).interact(lIIlIlIIIl[lIIlIlIIlI[53]]);
                            }
                        }
                        AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[54]];
                        Movement.walkTo((WorldPoint)ci);
                        "".length();
                        Time.sleepTicks((int)lIIlIlIIlI[0]);
                        "".length();
                    }
                }
                if (q.llllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(ci), lIIlIlIIlI[4])) {
                    AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[55]];
                    String[] stringArray = new String[lIIlIlIIlI[0]];
                    stringArray[q.lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[56]];
                    if (q.llllllIlIlII(TileObjects.getNearest((String[])stringArray))) {
                        String[] stringArray10 = new String[lIIlIlIIlI[0]];
                        stringArray10[q.lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[57]];
                        TileObjects.getNearest((String[])stringArray10).interact(lIIlIlIIIl[lIIlIlIIlI[58]]);
                        Time.sleepTicks((int)lIIlIlIIlI[9]);
                        "".length();
                    }
                }
                if (q.llllllIlIllI(Players.getLocal().getLocalLocation().getY(), lIIlIlIIlI[37])) {
                    String[] stringArray = new String[lIIlIlIIlI[0]];
                    stringArray[q.lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[59]];
                    if (q.llllllIlIllI(Players.getLocal().getWorldLocation().distanceTo(TileObjects.getNearest((String[])stringArray).getWorldLocation()), lIIlIlIIlI[18])) {
                        AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[60]];
                        String[] stringArray11 = new String[lIIlIlIIlI[0]];
                        stringArray11[q.lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[61]];
                        TileObjects.getNearest((String[])stringArray11).interact(lIIlIlIIIl[lIIlIlIIlI[62]]);
                        Time.sleepTicks((int)lIIlIlIIlI[14]);
                        "".length();
                    }
                }
                if (q.llllllIllIIl(Players.getLocal().getInteracting()) && q.llllllIlIIll(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[lIIlIlIIlI[0]];
                    stringArray[q.lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[63]];
                    if (q.llllllIlIIll(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray12 = new String[lIIlIlIIlI[0]];
                        stringArray12[q.lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[64]];
                        if (q.llllllIlIIIl(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                            String[] stringArray13 = new String[lIIlIlIIlI[0]];
                            stringArray13[q.lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[65]];
                            Inventory.getFirst((String[])stringArray13).interact(lIIlIlIIIl[lIIlIlIIlI[66]]);
                        }
                    }
                    int[] nArray = new int[lIIlIlIIlI[0]];
                    nArray[q.lIIlIlIIlI[1]] = lIIlIlIIlI[10];
                    if (q.llllllIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[lIIlIlIIlI[0]];
                        nArray6[q.lIIlIlIIlI[1]] = lIIlIlIIlI[10];
                        if (q.llllllIlIIll(Equipment.contains((int[])nArray6) ? 1 : 0)) {
                            int[] nArray7 = new int[lIIlIlIIlI[0]];
                            nArray7[q.lIIlIlIIlI[1]] = lIIlIlIIlI[10];
                            Inventory.getFirst((int[])nArray7).interact(lIIlIlIIIl[lIIlIlIIlI[34]]);
                        }
                    }
                    String[] stringArray14 = new String[lIIlIlIIlI[0]];
                    stringArray14[q.lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[67]];
                    NPCs.getNearest((String[])stringArray14).interact(lIIlIlIIIl[lIIlIlIIlI[68]]);
                    Time.sleepTicks((int)lIIlIlIIlI[0]);
                    "".length();
                }
                if (q.llllllIllIlI(q.llllllIlIIII(e.u(), 60.0))) {
                    int[] nArray = new int[lIIlIlIIlI[0]];
                    nArray[q.lIIlIlIIlI[1]] = lIIlIlIIlI[13];
                    if (q.llllllIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray8 = new int[lIIlIlIIlI[0]];
                        nArray8[q.lIIlIlIIlI[1]] = lIIlIlIIlI[13];
                        Inventory.getFirst((int[])nArray8).interact(lIIlIlIIIl[lIIlIlIIlI[69]]);
                        Time.sleepTicks((int)lIIlIlIIlI[0]);
                        "".length();
                    }
                }
                g.a(bR);
            }
            if (q.llllllIllIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIlIlIIlI[47])) {
                String[] stringArray = new String[lIIlIlIIlI[0]];
                stringArray[q.lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[70]];
                if (q.llllllIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[71]];
                    String[] stringArray15 = new String[lIIlIlIIlI[0]];
                    stringArray15[q.lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[72]];
                    TileObjects.getNearest((String[])stringArray15).interact(lIIlIlIIIl[lIIlIlIIlI[73]]);
                    Time.sleepTicks((int)lIIlIlIIlI[4]);
                    "".length();
                }
                String[] stringArray16 = new String[lIIlIlIIlI[0]];
                stringArray16[q.lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[74]];
                if (q.llllllIlIIIl(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                    if (q.llllllIlIllI(Players.getLocal().getWorldLocation().distanceTo(ch), lIIlIlIIlI[4])) {
                        AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[75]];
                        Movement.walkTo((WorldPoint)ch);
                        "".length();
                        Time.sleepTicks((int)lIIlIlIIlI[0]);
                        "".length();
                        if (q.llllllIlIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIlIIlI[20], lIIlIlIIlI[21], lIIlIlIIlI[1])) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[76]];
                            e.c(new WorldPoint(lIIlIlIIlI[23], lIIlIlIIlI[24], lIIlIlIIlI[1]));
                            Time.sleepTicks((int)lIIlIlIIlI[5]);
                            "".length();
                        }
                    }
                    if (q.llllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(ch), lIIlIlIIlI[4])) {
                        AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[77]];
                        g.a(lIIlIlIIIl[lIIlIlIIlI[78]], bR, lIIlIlIIlI[0]);
                    }
                }
            }
            if (q.llllllIllIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIlIlIIlI[52])) {
                if (q.llllllIlIllI(Players.getLocal().getWorldLocation().distanceTo(cj), lIIlIlIIlI[9])) {
                    AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[79]];
                    Movement.walkTo((WorldPoint)cj);
                    "".length();
                    Time.sleepTicks((int)lIIlIlIIlI[0]);
                    "".length();
                }
                if (q.llllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(cj), lIIlIlIIlI[9])) {
                    AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[80]];
                    if (q.llllllIlIIlI(ck, lIIlIlIIlI[0])) {
                        U.mq += lIIlIlIIlI[0];
                        U.o(AccBuilderRogues.m);
                        ck += lIIlIlIIlI[0];
                        U.mq = lIIlIlIIlI[1];
                        cl = lIIlIlIIlI[1];
                    }
                    g.a(lIIlIlIIIl[lIIlIlIIlI[17]], bR);
                }
            }
        }
    }

    private static String lllllIllllII(String lllllllllllllllllllllllIlIIIllIl, String lllllllllllllllllllllllIlIIIllII) {
        try {
            SecretKeySpec lllllllllllllllllllllllIlIIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllllIlIIIllII.getBytes(StandardCharsets.UTF_8)), lIIlIlIIlI[16]), "DES");
            Cipher lllllllllllllllllllllllIlIIIllll = Cipher.getInstance("DES");
            lllllllllllllllllllllllIlIIIllll.init(lIIlIlIIlI[3], lllllllllllllllllllllllIlIIlIIII);
            return new String(lllllllllllllllllllllllIlIIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllllIlIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllllllIlIIIlllI) {
            lllllllllllllllllllllllIlIIIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIlIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llllllIlIlIl(int n2) {
        return n2 > 0;
    }

    private static boolean llllllIllIll(int n2) {
        return n2 <= 0;
    }

    private static boolean llllllIlIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llllllIlIIll(int n2) {
        return n2 == 0;
    }

    private static void lllllIllllll() {
        lIIlIlIIIl = new String[lIIlIlIIlI[100]];
        q.lIIlIlIIIl[q.lIIlIlIIlI[1]] = q.lllllIllllII("WEkR+Fij1Pl9AoYDKwabXtMW+yaruS7hS2+yI//ebUWnAqgigkO5u4aJqbx3AXEB", "YpGOO");
        q.lIIlIlIIIl[q.lIIlIlIIlI[0]] = q.lllllIllllII("luaU3b/7Dhfg6FP9rPN9bQ==", "riYuo");
        q.lIIlIlIIIl[q.lIIlIlIIlI[3]] = q.lllllIllllIl("MSAUKSYQLx1tKBgvESQkHg==", "yAzMJ");
        q.lIIlIlIIIl[q.lIIlIlIIlI[9]] = q.lllllIlllllI("MtgFyE88xJJofRvbvpfM+U85Z+JrNWNukbpcgbKmZaUpBAZz2HDFZrULlewu+TzcG+FNZK3SAm0=", "NWBYJ");
        q.lIIlIlIIIl[q.lIIlIlIIlI[4]] = q.lllllIllllIl("LAgiDxs=", "hzKap");
        q.lIIlIlIIIl[q.lIIlIlIIlI[12]] = q.lllllIllllIl("OwcrFg==", "lbJdS");
        q.lIIlIlIIIl[q.lIIlIlIIlI[5]] = q.lllllIlllllI("Wu51JPVRcb30dYwANPZy6Q==", "HBeja");
        q.lIIlIlIIIl[q.lIIlIlIIlI[18]] = q.lllllIllllIl("ByESNwU9OxRlACEwADE=", "TUsEq");
        q.lIIlIlIIIl[q.lIIlIlIIlI[16]] = q.lllllIllllIl("ISYdHDcKaQsaNR0t", "oIiuT");
        q.lIIlIlIIIl[q.lIIlIlIIlI[19]] = q.lllllIlllllI("y64FUQ4H1tM=", "DmONV");
        q.lIIlIlIIIl[q.lIIlIlIIlI[14]] = q.lllllIlllllI("untFTgXP5gfzbvWcj/rgnA==", "WSwPh");
        q.lIIlIlIIIl[q.lIIlIlIIlI[22]] = q.lllllIllllII("H0aC5ontVO2KQF2fRiishKn1Qdq2CRQ3", "AHGjr");
        q.lIIlIlIIIl[q.lIIlIlIIlI[25]] = q.lllllIllllII("Hpp7Dbw6KAGIMPVLbdn/1A==", "BxvLY");
        q.lIIlIlIIIl[q.lIIlIlIIlI[26]] = q.lllllIllllIl("GCAgDDo=", "KARmR");
        q.lIIlIlIIIl[q.lIIlIlIIlI[27]] = q.lllllIlllllI("B/RFadQcAHKt+qPFxXVFfA==", "vqHYV");
        q.lIIlIlIIIl[q.lIIlIlIIlI[28]] = q.lllllIlllllI("iLbA+CcAMgKpp9MgLpDv5g==", "Gfjdu");
        q.lIIlIlIIIl[q.lIIlIlIIlI[29]] = q.lllllIllllIl("HxMEKzU=", "HzaGQ");
        q.lIIlIlIIIl[q.lIIlIlIIlI[30]] = q.lllllIllllIl("BxUYBQ8zBEoMDjgE", "Tajda");
        q.lIIlIlIIIl[q.lIIlIlIIlI[31]] = q.lllllIllllIl("DA0bNDViBR0uOQ==", "OarYW");
        q.lIIlIlIIIl[q.lIIlIlIIlI[35]] = q.lllllIllllII("ey9IdliiX8Xfzo/sqqAdQw==", "OyxRE");
        q.lIIlIlIIIl[q.lIIlIlIIlI[36]] = q.lllllIlllllI("yKQlL/t1jfVtfiQaiLDB/A==", "CUMML");
        q.lIIlIlIIIl[q.lIIlIlIIlI[38]] = q.lllllIlllllI("9S7l0BOSATVNVsg8GijNXg==", "OElDh");
        q.lIIlIlIIIl[q.lIIlIlIIlI[39]] = q.lllllIllllII("ExAI/yX8gnu7zBqftD9oyg==", "SZDIG");
        q.lIIlIlIIIl[q.lIIlIlIIlI[40]] = q.lllllIllllII("3zR8RHVAIM8KBj37fbGqXhKm2Ug3tlkz", "qtxvd");
        q.lIIlIlIIIl[q.lIIlIlIIlI[41]] = q.lllllIllllIl("DAkKKCAvAgA=", "NeeKK");
        q.lIIlIlIIIl[q.lIIlIlIIlI[42]] = q.lllllIllllIl("JgEcJxFIAgMvAQ==", "emuJs");
        q.lIIlIlIIIl[q.lIIlIlIIlI[43]] = q.lllllIlllllI("lDNCyZf/6mHW+/NMiE3wHw==", "RxtXm");
        q.lIIlIlIIIl[q.lIIlIlIIlI[44]] = q.lllllIlllllI("plHbYca2XuA1WTo1oyQVRA==", "vNsPi");
        q.lIIlIlIIIl[q.lIIlIlIIlI[45]] = q.lllllIlllllI("1L8USlxU5dCpd0CDVn9Wxg==", "LBRvx");
        q.lIIlIlIIIl[q.lIIlIlIIlI[46]] = q.lllllIllllII("UfCkwyXmAMrTqjqKTwWusg==", "PCOsC");
        q.lIIlIlIIIl[q.lIIlIlIIlI[47]] = q.lllllIllllIl("BRgMJzMtFQwrLytWKzIoPhc=", "LvxBA");
        q.lIIlIlIIIl[q.lIIlIlIIlI[48]] = q.lllllIllllII("xjLv059UKws=", "lQhKj");
        q.lIIlIlIIIl[q.lIIlIlIIlI[49]] = q.lllllIllllIl("Hi4GMyQiJg==", "MAsAL");
        q.lIIlIlIIIl[q.lIIlIlIIlI[50]] = q.lllllIllllII("B/UcT19/HLugFUSzZMIfbxN33z1/sbXQ", "rplgh");
        q.lIIlIlIIIl[q.lIIlIlIIlI[51]] = q.lllllIlllllI("S9XWslGLzm4g9hTcG2dutprraiQMMLZc", "tJfXq");
        q.lIIlIlIIIl[q.lIIlIlIIlI[52]] = q.lllllIllllIl("NTYGHTMIIQwWMUc0ABQyCzYc", "gSosU");
        q.lIIlIlIIIl[q.lIIlIlIIlI[53]] = q.lllllIlllllI("rHnk7Lv4Wmw=", "CqKyF");
        q.lIIlIlIIIl[q.lIIlIlIIlI[54]] = q.lllllIllllII("thukynUWvDq9gI70qDU/fA==", "AUunb");
        q.lIIlIlIIIl[q.lIIlIlIIlI[55]] = q.lllllIllllIl("FAQPPCB3DAkmLHcACT0n", "WhfQB");
        q.lIIlIlIIIl[q.lIIlIlIIlI[56]] = q.lllllIlllllI("ZUjyvqlx5rVR6pyLPZXKHQ==", "UQXxJ");
        q.lIIlIlIIIl[q.lIIlIlIIlI[57]] = q.lllllIlllllI("5tbrCxFyixSGSoLdzF6Z4w==", "dmfHT");
        q.lIIlIlIIIl[q.lIIlIlIIlI[58]] = q.lllllIllllII("JE4us0wYHjZcp4Ia++lOcQ==", "yqsBT");
        q.lIIlIlIIIl[q.lIIlIlIIlI[59]] = q.lllllIllllII("0SrPtnvdLLZ/sILbp80F/w==", "tnKkc");
        q.lIIlIlIIIl[q.lIIlIlIIlI[60]] = q.lllllIlllllI("0USNZoRbI+hibAkw8tC+9T5e9qqLoa3F", "IApVr");
        q.lIIlIlIIIl[q.lIIlIlIIlI[61]] = q.lllllIllllII("OHkm5eVuR6dnBAFkInib3A==", "UlOcn");
        q.lIIlIlIIIl[q.lIIlIlIIlI[62]] = q.lllllIllllIl("Fgs6JCx4CCUsPA==", "UgSIN");
        q.lIIlIlIIIl[q.lIIlIlIIlI[63]] = q.lllllIllllIl("ER85AigsCDMJKmMdPwspLx8j", "CzPlN");
        q.lIIlIlIIIl[q.lIIlIlIIlI[64]] = q.lllllIllllIl("NRQxJxAIAzssEkcWNy4RCxQr", "gqXIv");
        q.lIIlIlIIIl[q.lIIlIlIIlI[65]] = q.lllllIllllII("yiF6qNhyCtNdgha7i4BAYwvg516Q+I9P", "HVQZf");
        q.lIIlIlIIIl[q.lIIlIlIIlI[66]] = q.lllllIllllII("8V4KZFYqm7g=", "VSeCW");
        q.lIIlIlIIIl[q.lIIlIlIIlI[34]] = q.lllllIllllII("eV9uw4ztBhU=", "EUbuW");
        q.lIIlIlIIIl[q.lIIlIlIIlI[67]] = q.lllllIllllIl("HhUkIhwiHQ==", "MzQPt");
        q.lIIlIlIIIl[q.lIIlIlIIlI[68]] = q.lllllIllllII("Hmz9r2SOr7k=", "fPZff");
        q.lIIlIlIIIl[q.lIIlIlIIlI[69]] = q.lllllIllllII("f4fucRtbeKo=", "FejmW");
        q.lIIlIlIIIl[q.lIIlIlIIlI[70]] = q.lllllIllllII("fT545T/e273jShBB7bvTaw==", "bBfhD");
        q.lIIlIlIIIl[q.lIIlIlIIlI[71]] = q.lllllIllllII("ljj9D+JTKIexLA+23J622Q==", "etJWV");
        q.lIIlIlIIIl[q.lIIlIlIIlI[72]] = q.lllllIllllII("AgAQbYOctuaH/BIlFgUZKg==", "YWIaJ");
        q.lIIlIlIIIl[q.lIIlIlIIlI[73]] = q.lllllIllllIl("JBwiZBYIBiI=", "giVIp");
        q.lIIlIlIIIl[q.lIIlIlIIlI[74]] = q.lllllIlllllI("Z9/brWU8Q88QSq0PCJDYMw==", "QacOQ");
        q.lIIlIlIIIl[q.lIIlIlIIlI[75]] = q.lllllIllllII("9UCgrU+/NNTc9nJowJlKbQ==", "VkeXp");
        q.lIIlIlIIIl[q.lIIlIlIIlI[76]] = q.lllllIllllII("XjYPIDi0Kc6uFPnvlE0+Y76Ve0g20unh", "CvJyV");
        q.lIIlIlIIIl[q.lIIlIlIIlI[77]] = q.lllllIlllllI("BKL9G/H+DmQt34SnBbtROw==", "vfTwM");
        q.lIIlIlIIIl[q.lIIlIlIIlI[78]] = q.lllllIlllllI("3D4un8FrWZQ=", "yLpKb");
        q.lIIlIlIIIl[q.lIIlIlIIlI[79]] = q.lllllIllllII("ecoJ2WxJnLNko+a+M4D3jQ==", "tcdnH");
        q.lIIlIlIIIl[q.lIIlIlIIlI[80]] = q.lllllIlllllI("R6E10Iuji0o1sLn4BJQfwg==", "lWcEt");
        q.lIIlIlIIIl[q.lIIlIlIIlI[17]] = q.lllllIllllIl("MioKCCM=", "aZxaB");
        q.lIIlIlIIIl[q.lIIlIlIIlI[86]] = q.lllllIlllllI("05lc0gFv09FgnTDfO6K6cxwb7K6n4Dh3", "DFFGt");
        q.lIIlIlIIIl[q.lIIlIlIIlI[87]] = q.lllllIllllIl("FwgFLmEKB0s+JAQNHyFhTQ==", "eakIA");
        q.lIIlIlIIIl[q.lIIlIlIIlI[96]] = q.lllllIllllII("rdi19T16qfU=", "HasWx");
        q.lIIlIlIIIl[q.lIIlIlIIlI[97]] = q.lllllIllllII("tOtXPHWA/a3Us/7frJR9bUA3vQTMGbNn", "xfQwS");
        q.lIIlIlIIIl[q.lIIlIlIIlI[98]] = q.lllllIllllIl("HGckHgQ7LHACBTQzdxoBdSU1Vgw5K3AQAidnPhkaew==", "UGPvm");
        q.lIIlIlIIIl[q.lIIlIlIIlI[99]] = q.lllllIllllIl("GCQg", "AASzT");
    }

    private static boolean llllllIlIlII(Object object) {
        return object != null;
    }

    private static boolean llllllIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean S() {
        return lIIlIlIIlI[1];
    }

    static {
        q.llllllIIllll();
        q.lllllIllllll();
        bv = new ArrayList<d>();
        cg = new WorldPoint(lIIlIlIIlI[88], lIIlIlIIlI[89], lIIlIlIIlI[1]);
        ch = new WorldPoint(lIIlIlIIlI[90], lIIlIlIIlI[91], lIIlIlIIlI[1]);
        ci = new WorldPoint(lIIlIlIIlI[92], lIIlIlIIlI[93], lIIlIlIIlI[1]);
        cj = new WorldPoint(lIIlIlIIlI[94], lIIlIlIIlI[95], lIIlIlIIlI[1]);
        cm = null;
        String[] stringArray = new String[lIIlIlIIlI[4]];
        stringArray[q.lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[96]];
        stringArray[q.lIIlIlIIlI[0]] = lIIlIlIIIl[lIIlIlIIlI[97]];
        stringArray[q.lIIlIlIIlI[3]] = lIIlIlIIIl[lIIlIlIIlI[98]];
        stringArray[q.lIIlIlIIlI[9]] = lIIlIlIIIl[lIIlIlIIlI[99]];
        bR = stringArray;
    }

    private static boolean llllllIllIIl(Object object) {
        return object == null;
    }

    private static String lllllIllllIl(String lllllllllllllllllllllllIlIlIIIlI, String lllllllllllllllllllllllIlIIlllII) {
        lllllllllllllllllllllllIlIlIIIlI = new String(Base64.getDecoder().decode(lllllllllllllllllllllllIlIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllllllIlIlIIIII = new StringBuilder();
        char[] lllllllllllllllllllllllIlIIlllll = lllllllllllllllllllllllIlIIlllII.toCharArray();
        int lllllllllllllllllllllllIlIIllllI = lIIlIlIIlI[1];
        char[] lllllllllllllllllllllllIlIIllIII = lllllllllllllllllllllllIlIlIIIlI.toCharArray();
        int lllllllllllllllllllllllIlIIlIlll = lllllllllllllllllllllllIlIIllIII.length;
        int lllllllllllllllllllllllIlIIlIllI = lIIlIlIIlI[1];
        while (q.llllllIlIIlI(lllllllllllllllllllllllIlIIlIllI, lllllllllllllllllllllllIlIIlIlll)) {
            char lllllllllllllllllllllllIlIlIIIll = lllllllllllllllllllllllIlIIllIII[lllllllllllllllllllllllIlIIlIllI];
            lllllllllllllllllllllllIlIlIIIII.append((char)(lllllllllllllllllllllllIlIlIIIll ^ lllllllllllllllllllllllIlIIlllll[lllllllllllllllllllllllIlIIllllI % lllllllllllllllllllllllIlIIlllll.length]));
            "".length();
            ++lllllllllllllllllllllllIlIIllllI;
            ++lllllllllllllllllllllllIlIIlIllI;
            "".length();
            if (" ".length() < "   ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllllllllIlIlIIIII);
    }

    private static void llllllIIllll() {
        lIIlIlIIlI = new int[101];
        q.lIIlIlIIlI[0] = " ".length();
        q.lIIlIlIIlI[1] = (0xA8 ^ 0xB0) & ~(0xA8 ^ 0xB0);
        q.lIIlIlIIlI[2] = 0xFFFFB399 & 0x5FEE;
        q.lIIlIlIIlI[3] = "  ".length();
        q.lIIlIlIIlI[4] = 0x6F ^ 0x33 ^ (0xFF ^ 0xA7);
        q.lIIlIlIIlI[5] = 5 ^ 0x57 ^ (0x1F ^ 0x4B);
        q.lIIlIlIIlI[6] = -(0xFFFFF4EF & 0x6BB1) & (0xFFFFFFFF & 0x7FE7);
        q.lIIlIlIIlI[7] = 0xFFFFFF5C & 0x1FEB;
        q.lIIlIlIIlI[8] = 0xFFFFBBFF & 0x47BA;
        q.lIIlIlIIlI[9] = "   ".length();
        q.lIIlIlIIlI[10] = 0xFFFFCF77 & 0x35BB;
        q.lIIlIlIIlI[11] = 0xFFFFBDDD & 0x7373;
        q.lIIlIlIIlI[12] = 0x73 ^ 4 ^ (0x51 ^ 0x23);
        q.lIIlIlIIlI[13] = 0xFFFFFB7F & 0x5FB;
        q.lIIlIlIIlI[14] = 0x36 ^ 0x3C;
        q.lIIlIlIIlI[15] = 0xFFFFDF5B & 0x3FED;
        q.lIIlIlIIlI[16] = 0x7F ^ 0x69 ^ (0x18 ^ 6);
        q.lIIlIlIIlI[17] = 0xDF ^ 0x9E;
        q.lIIlIlIIlI[18] = 0x60 ^ 0x67;
        q.lIIlIlIIlI[19] = 0 ^ 9;
        q.lIIlIlIIlI[20] = -(0xFFFFBC7F & 0x778A) & (0xFFFFBFFF & 0x7FEB);
        q.lIIlIlIIlI[21] = 0xFFFFEDED & 0x1EFB;
        q.lIIlIlIIlI[22] = 0x90 ^ 0xAE ^ (0xB5 ^ 0x80);
        q.lIIlIlIIlI[23] = 0xFFFF8BFF & 0x7FDF;
        q.lIIlIlIIlI[24] = 0xFFFFBFFF & 0x4CE1;
        q.lIIlIlIIlI[25] = 0xA8 ^ 0x82 ^ (0x7D ^ 0x5B);
        q.lIIlIlIIlI[26] = 0x21 ^ 0x2C;
        q.lIIlIlIIlI[27] = 0xD5 ^ 0xB6 ^ (0xF7 ^ 0x9A);
        q.lIIlIlIIlI[28] = 0x5F ^ 0x50;
        q.lIIlIlIIlI[29] = 48 + 206 - 84 + 41 ^ 68 + 110 - 167 + 184;
        q.lIIlIlIIlI[30] = 12 + 140 - 39 + 68 ^ 80 + 43 - -36 + 5;
        q.lIIlIlIIlI[31] = 0x15 ^ 7;
        q.lIIlIlIIlI[32] = 0xFFFFFF42 & 0x1BFD;
        q.lIIlIlIIlI[33] = 0xFFFF9CFC & 0x7BC3;
        q.lIIlIlIIlI[34] = 0x67 ^ 0x1E ^ (0xE8 ^ 0xA3);
        q.lIIlIlIIlI[35] = 0x7A ^ 0x69;
        q.lIIlIlIIlI[36] = 0x80 ^ 0x9C ^ (0x8C ^ 0x84);
        q.lIIlIlIIlI[37] = 0xFFFF9FDE & 0x73E1;
        q.lIIlIlIIlI[38] = 0x1F ^ 0xA;
        q.lIIlIlIIlI[39] = 0x56 ^ 0x40;
        q.lIIlIlIIlI[40] = 0x47 ^ 0x50;
        q.lIIlIlIIlI[41] = 0xC4 ^ 0xA3 ^ 83 + 109 - 145 + 80;
        q.lIIlIlIIlI[42] = 0x5F ^ 0x46;
        q.lIIlIlIIlI[43] = 51 + 103 - 98 + 88 ^ 93 + 100 - 99 + 44;
        q.lIIlIlIIlI[44] = 0x74 ^ 0x19 ^ (0x6B ^ 0x1D);
        q.lIIlIlIIlI[45] = 0xB1 ^ 0xAD;
        q.lIIlIlIIlI[46] = 0x32 ^ 0x2F;
        q.lIIlIlIIlI[47] = 0x29 ^ 0x37;
        q.lIIlIlIIlI[48] = 0x8A ^ 0x95;
        q.lIIlIlIIlI[49] = 24 + 134 - 112 + 180 ^ 158 + 61 - 42 + 17;
        q.lIIlIlIIlI[50] = 0x20 ^ 1;
        q.lIIlIlIIlI[51] = 82 + 178 - 225 + 150 ^ 82 + 48 - 114 + 139;
        q.lIIlIlIIlI[52] = 29 + 65 - 21 + 151 ^ 107 + 148 - 94 + 34;
        q.lIIlIlIIlI[53] = 0x40 ^ 0x64;
        q.lIIlIlIIlI[54] = 0x59 ^ 0x51 ^ (0xA5 ^ 0x88);
        q.lIIlIlIIlI[55] = 0xA5 ^ 0x83;
        q.lIIlIlIIlI[56] = 0x24 ^ 3;
        q.lIIlIlIIlI[57] = 140 + 6 - 44 + 60 ^ 30 + 25 - -76 + 7;
        q.lIIlIlIIlI[58] = 0x2C ^ 5;
        q.lIIlIlIIlI[59] = 0x35 ^ 3 ^ (0x9C ^ 0x80);
        q.lIIlIlIIlI[60] = 0xB0 ^ 0xA0 ^ (0x23 ^ 0x18);
        q.lIIlIlIIlI[61] = 138 + 184 - 274 + 184 ^ 11 + 142 - 130 + 173;
        q.lIIlIlIIlI[62] = 0xA7 ^ 0x93 ^ (0x96 ^ 0x8F);
        q.lIIlIlIIlI[63] = 0x61 ^ 0x4F;
        q.lIIlIlIIlI[64] = 0x9A ^ 0xA4 ^ (0x3C ^ 0x2D);
        q.lIIlIlIIlI[65] = 0x28 ^ 0x1F ^ (0x18 ^ 0x1F);
        q.lIIlIlIIlI[66] = 0xA3 ^ 0x96 ^ (0x46 ^ 0x42);
        q.lIIlIlIIlI[67] = 48 + 94 - 106 + 106 ^ 39 + 18 - -66 + 66;
        q.lIIlIlIIlI[68] = 0x62 ^ 0x56;
        q.lIIlIlIIlI[69] = 0x32 ^ 0x7A ^ (0x64 ^ 0x19);
        q.lIIlIlIIlI[70] = 0x98 ^ 0xB5 ^ (0x21 ^ 0x3A);
        q.lIIlIlIIlI[71] = 0x45 ^ 0x72;
        q.lIIlIlIIlI[72] = 0x15 ^ 0x3E ^ (0xAD ^ 0xBE);
        q.lIIlIlIIlI[73] = 0x52 ^ 0x6B;
        q.lIIlIlIIlI[74] = 0x4F ^ 0x75;
        q.lIIlIlIIlI[75] = 0xEB ^ 0x82 ^ (0xDE ^ 0x8C);
        q.lIIlIlIIlI[76] = 0x98 ^ 0xA4;
        q.lIIlIlIIlI[77] = 0xB2 ^ 0x8F;
        q.lIIlIlIIlI[78] = 0x67 ^ 0x7E ^ (4 ^ 0x23);
        q.lIIlIlIIlI[79] = 6 + 18 - -43 + 89 ^ 64 + 40 - 56 + 115;
        q.lIIlIlIIlI[80] = 30 + 23 - -150 + 14 ^ 63 + 96 - 122 + 116;
        q.lIIlIlIIlI[81] = 0xFFFFAFBC & 0x736B;
        q.lIIlIlIIlI[82] = -(0xFFFFECFB & 0x7F7E) & (0xFFFFFFFD & 0x6FFF);
        q.lIIlIlIIlI[83] = 0xFFFFFECC & 0x2FFF;
        q.lIIlIlIIlI[84] = -(0xFFFFA65F & 0x5BB6) & (0xFFFFFFBF & 0x63FD);
        q.lIIlIlIIlI[85] = 0xED ^ 0x89;
        q.lIIlIlIIlI[86] = 0xC8 ^ 0x8A;
        q.lIIlIlIIlI[87] = 0x39 ^ 0x7A;
        q.lIIlIlIIlI[88] = 0xFFFFAD7D & 0x5E8F;
        q.lIIlIlIIlI[89] = 0xFFFF9FBF & 0x6CF3;
        q.lIIlIlIIlI[90] = 0xFFFFEBFC & 0x1FDF;
        q.lIIlIlIIlI[91] = 0xFFFFEDFE & 0x1EDF;
        q.lIIlIlIIlI[92] = -(160 + 121 - 242 + 124) & (0xFFFF8CFE & 0x7FEF);
        q.lIIlIlIIlI[93] = 0xFFFFDFD3 & 0x2D3F;
        q.lIIlIlIIlI[94] = -(0xFFFFFABF & 0x77ED) & (0xFFFFFFBF & 0x7EFF);
        q.lIIlIlIIlI[95] = 0xFFFFAFE3 & 0x5CDD;
        q.lIIlIlIIlI[96] = 0x78 ^ 0x3C;
        q.lIIlIlIIlI[97] = 157 + 62 - 207 + 184 ^ 112 + 3 - 95 + 109;
        q.lIIlIlIIlI[98] = 0x7B ^ 0x3D;
        q.lIIlIlIIlI[99] = 0xFE ^ 0xB9;
        q.lIIlIlIIlI[100] = 0xC5 ^ 0x8D;
    }

    private static boolean llllllIllIlI(int n2) {
        return n2 < 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        block4: {
            block5: {
                int[] nArray = new int[lIIlIlIIlI[0]];
                nArray[q.lIIlIlIIlI[1]] = lIIlIlIIlI[6];
                if (!q.llllllIlIlIl(Inventory.getCount((int[])nArray))) break block4;
                int[] nArray2 = new int[lIIlIlIIlI[0]];
                nArray2[q.lIIlIlIIlI[1]] = lIIlIlIIlI[8];
                if (!q.llllllIlIlIl(Inventory.getCount((int[])nArray2))) break block4;
                int[] nArray3 = new int[lIIlIlIIlI[0]];
                nArray3[q.lIIlIlIIlI[1]] = lIIlIlIIlI[10];
                if (!q.llllllIllIll(Inventory.getCount((int[])nArray3))) break block5;
                int[] nArray4 = new int[lIIlIlIIlI[0]];
                nArray4[q.lIIlIlIIlI[1]] = lIIlIlIIlI[10];
                if (!q.llllllIlIIIl(Equipment.contains((int[])nArray4) ? 1 : 0)) break block4;
            }
            int[] nArray = new int[lIIlIlIIlI[0]];
            nArray[q.lIIlIlIIlI[1]] = lIIlIlIIlI[13];
            if (q.llllllIlIlIl(Inventory.getCount((int[])nArray))) {
                n2 = lIIlIlIIlI[0];
                "".length();
                if ("   ".length() == "   ".length()) return n2 != 0;
                return ((0x5A ^ 0x17) & ~(0x50 ^ 0x1D)) != 0;
            }
        }
        n2 = lIIlIlIIlI[1];
        return n2 != 0;
    }

    private static void af() {
        d lllllllllllllllllllllllIlIlIllll;
        block10: {
            block9: {
                Object lllllllllllllllllllllllIlIllIIII;
                int[] nArray = new int[lIIlIlIIlI[0]];
                nArray[q.lIIlIlIIlI[1]] = lIIlIlIIlI[8];
                if (q.llllllIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(lIIlIlIIlI[8], lIIlIlIIlI[0], lIIlIlIIlI[81]);
                    bv.add(d2);
                    "".length();
                }
                int[] nArray2 = new int[lIIlIlIIlI[0]];
                nArray2[q.lIIlIlIIlI[1]] = lIIlIlIIlI[10];
                if (q.llllllIlIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lllllllllllllllllllllllIlIllIIII = new d(lIIlIlIIlI[10], lIIlIlIIlI[0], lIIlIlIIlI[81]);
                    bv.add((d)lllllllllllllllllllllllIlIllIIII);
                    "".length();
                }
                int[] nArray3 = new int[lIIlIlIIlI[0]];
                nArray3[q.lIIlIlIIlI[1]] = lIIlIlIIlI[13];
                if (q.llllllIlIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    lllllllllllllllllllllllIlIllIIII = new d(lIIlIlIIlI[13], lIIlIlIIlI[50], lIIlIlIIlI[82]);
                    bv.add((d)lllllllllllllllllllllllIlIllIIII);
                    "".length();
                }
                int[] nArray4 = new int[lIIlIlIIlI[0]];
                nArray4[q.lIIlIlIIlI[1]] = lIIlIlIIlI[11];
                if (q.llllllIlIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    lllllllllllllllllllllllIlIllIIII = new d(lIIlIlIIlI[11], lIIlIlIIlI[12], i.bq);
                    bv.add((d)lllllllllllllllllllllllIlIllIIII);
                    "".length();
                }
                if (q.llllllIlIIll(Bank.contains((Predicate)(lllllllllllllllllllllllIlIllIIII = item -> item.getName().toLowerCase().contains(lIIlIlIIIl[lIIlIlIIlI[87]]))) ? 1 : 0)) {
                    lllllllllllllllllllllllIlIlIllll = new d(lIIlIlIIlI[83], lIIlIlIIlI[12], lIIlIlIIlI[84]);
                    bv.add(lllllllllllllllllllllllIlIlIllll);
                    "".length();
                }
                int[] nArray5 = new int[lIIlIlIIlI[0]];
                nArray5[q.lIIlIlIIlI[1]] = lIIlIlIIlI[7];
                if (!q.llllllIlIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block9;
                int[] nArray6 = new int[lIIlIlIIlI[0]];
                nArray6[q.lIIlIlIIlI[1]] = lIIlIlIIlI[7];
                if (!q.llllllIlIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block10;
                int[] nArray7 = new int[lIIlIlIIlI[0]];
                nArray7[q.lIIlIlIIlI[1]] = lIIlIlIIlI[7];
                if (!q.llllllIlIIlI(Bank.getFirst((int[])nArray7).getQuantity(), lIIlIlIIlI[12])) break block10;
            }
            lllllllllllllllllllllllIlIlIllll = new d(lIIlIlIIlI[7], lIIlIlIIlI[28], lIIlIlIIlI[82]);
            bv.add(lllllllllllllllllllllllIlIlIllll);
            "".length();
        }
        int[] nArray = new int[lIIlIlIIlI[0]];
        nArray[q.lIIlIlIIlI[1]] = lIIlIlIIlI[6];
        if (q.llllllIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            lllllllllllllllllllllllIlIlIllll = new d(lIIlIlIIlI[6], lIIlIlIIlI[57], lIIlIlIIlI[82]);
            bv.add(lllllllllllllllllllllllIlIlIllll);
            "".length();
        }
    }

    @Override
    public String U() {
        return lIIlIlIIIl[lIIlIlIIlI[86]];
    }

    @Override
    public int T() {
        try {
            q.aC();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0xD2 ^ 0x8D ^ " ".length()) & (0x70 ^ 0x57 ^ (0x35 ^ 0x4C) ^ -" ".length())) <= -" ".length()) {
            return (49 + 120 - 69 + 53 ^ 2 + 145 - 81 + 90) & (0x7F ^ 0x3E ^ (0xD8 ^ 0x9C) ^ -" ".length());
        }
        return lIIlIlIIlI[85];
    }
}

