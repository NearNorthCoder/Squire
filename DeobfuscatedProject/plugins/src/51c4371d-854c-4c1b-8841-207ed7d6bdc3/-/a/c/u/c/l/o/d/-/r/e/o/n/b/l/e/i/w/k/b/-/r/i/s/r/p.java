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
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.Q;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.a;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.b;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.d;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.f;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.g;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.i;
import gg.squire.account.AccBuilderBarrows;
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

public class p
implements F {
    static /* synthetic */ int ci;
    private static /* synthetic */ int[] lIlIllIl;
    public static /* synthetic */ WorldPoint ch;
    public static /* synthetic */ WorldPoint ce;
    public static /* synthetic */ WorldPoint cf;
    private static /* synthetic */ String[] bX;
    private static /* synthetic */ String[] lIlIlIll;
    public static /* synthetic */ boolean bz;
    private static /* synthetic */ WorldPoint ck;
    public static /* synthetic */ List<d> bB;
    public static /* synthetic */ WorldPoint cg;
    static /* synthetic */ boolean cj;

    private static boolean lIIlIIlIlII(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean W() {
        boolean bl;
        if (p.lIIlIIlIlII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIllIl[57])) {
            bl = lIlIllIl[0];
            "".length();
            if (-" ".length() > ((201 + 22 - 114 + 93 ^ 10 + 134 - 120 + 112) & (50 + 82 - 127 + 249 ^ 42 + 163 - 107 + 90 ^ -" ".length()))) {
                return ((136 + 93 - 143 + 52 ^ 98 + 6 - 63 + 154) & (178 + 13 - 95 + 108 ^ 86 + 44 - 126 + 129 ^ -" ".length())) != 0;
            }
        } else {
            bl = lIlIllIl[1];
        }
        return bl;
    }

    @Override
    public boolean T() {
        return lIlIllIl[1];
    }

    public static void aA() {
        block63: {
            block64: {
                block65: {
                    if (p.lIIlIIIlIIl(bz ? 1 : 0)) {
                        b.a(bB);
                        if (p.lIIlIIIlIlI(bB.size(), lIlIllIl[0])) {
                            System.out.println(lIlIlIll[lIlIllIl[1]]);
                            bz = lIlIllIl[1];
                        }
                    }
                    if (!p.lIIlIIIlIll(bz ? 1 : 0)) break block63;
                    if (p.lIIlIIIlIll(p.ac() ? 1 : 0) && p.lIIlIIIlIll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                        BankLocation lIlllIllIlIllIl = BankLocation.getNearest();
                        if (p.lIIlIIIllII(lIlllIllIlIllIl) && p.lIIlIIIlIll(lIlllIllIlIllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderBarrows.c = lIlIlIll[lIlIllIl[0]];
                            a.a(lIlllIllIlIllIl);
                        }
                        if (p.lIIlIIIllII(lIlllIllIlIllIl) && p.lIIlIIIlIIl(lIlllIllIlIllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (p.lIIlIIIlIll(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIllIl[2]);
                                "".length();
                            }
                            if (p.lIIlIIIlIIl(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderBarrows.c = lIlIlIll[lIlIllIl[3]];
                                if (p.lIIlIIIllIl(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lIlIllIl[4]);
                                    "".length();
                                }
                                if (p.lIIlIIIllIl(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lIlIllIl[3]);
                                    "".length();
                                }
                                int[] nArray = new int[lIlIllIl[5]];
                                nArray[p.lIlIllIl[1]] = lIlIllIl[6];
                                nArray[p.lIlIllIl[0]] = lIlIllIl[7];
                                nArray[p.lIlIllIl[3]] = lIlIllIl[8];
                                nArray[p.lIlIllIl[9]] = lIlIllIl[10];
                                nArray[p.lIlIllIl[4]] = lIlIllIl[11];
                                nArray[p.lIlIllIl[12]] = lIlIllIl[13];
                                if (p.lIIlIIIlIll(e.b(nArray) ? 1 : 0)) {
                                    p.ag();
                                    System.out.println(lIlIlIll[lIlIllIl[9]]);
                                    bz = lIlIllIl[0];
                                    return;
                                }
                                int[] nArray2 = new int[lIlIllIl[5]];
                                nArray2[p.lIlIllIl[1]] = lIlIllIl[6];
                                nArray2[p.lIlIllIl[0]] = lIlIllIl[7];
                                nArray2[p.lIlIllIl[3]] = lIlIllIl[8];
                                nArray2[p.lIlIllIl[9]] = lIlIllIl[10];
                                nArray2[p.lIlIllIl[4]] = lIlIllIl[11];
                                nArray2[p.lIlIllIl[12]] = lIlIllIl[13];
                                if (p.lIIlIIIlIIl(e.b(nArray2) ? 1 : 0)) {
                                    int[] nArray3 = new int[lIlIllIl[3]];
                                    nArray3[p.lIlIllIl[1]] = lIlIllIl[8];
                                    nArray3[p.lIlIllIl[0]] = lIlIllIl[10];
                                    a.a(nArray3);
                                    a.a(lIlIllIl[6], lIlIllIl[14]);
                                    a.a(lIlIllIl[7], lIlIllIl[14]);
                                    a.a(lIlIllIl[15], lIlIllIl[14]);
                                    a.b(f.aX, lIlIllIl[0]);
                                    a.a(lIlIllIl[11], lIlIllIl[4]);
                                    a.a(lIlIllIl[13], lIlIllIl[16]);
                                }
                            }
                        }
                    }
                    if (p.lIIlIIIlIIl(Inventory.contains((int[])f.bb) ? 1 : 0) && p.lIIlIIIlIlI(Movement.getRunEnergy(), lIlIllIl[17])) {
                        Inventory.getFirst((int[])f.bb).interact(lIlIlIll[lIlIllIl[4]]);
                        Time.sleepTicks((int)lIlIllIl[0]);
                        "".length();
                    }
                    if (p.lIIlIIIlIIl(p.ac() ? 1 : 0) && p.lIIlIIIlIll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                        if (p.lIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(ce), lIlIllIl[4])) {
                            if (p.lIIlIIIlIIl(Inventory.contains((int[])f.aX) ? 1 : 0) && p.lIIlIIIlIll(Equipment.contains((int[])f.aX) ? 1 : 0)) {
                                Inventory.getFirst((int[])f.aX).interact(lIlIlIll[lIlIllIl[12]]);
                            }
                            if (p.lIIlIIIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            AccBuilderBarrows.c = lIlIlIll[lIlIllIl[5]];
                            Movement.walkTo((WorldPoint)ce);
                            "".length();
                            Time.sleepTicks((int)lIlIllIl[0]);
                            "".length();
                        }
                        if (p.lIIlIIIllll(Players.getLocal().getWorldLocation().distanceTo(ce), lIlIllIl[4])) {
                            AccBuilderBarrows.c = lIlIlIll[lIlIllIl[18]];
                            ci = lIlIllIl[1];
                            if (p.lIIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[lIlIllIl[0]];
                                stringArray[p.lIlIllIl[1]] = lIlIlIll[lIlIllIl[16]];
                                TileObjects.getNearest((String[])stringArray).interact(lIlIlIll[lIlIllIl[19]]);
                                Time.sleepTicks((int)lIlIllIl[3]);
                                "".length();
                            }
                            g.a(bX);
                        }
                    }
                    if (p.lIIlIIlIIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIllIl[12])) {
                        if (p.lIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(cf), lIlIllIl[4])) {
                            AccBuilderBarrows.c = lIlIlIll[lIlIllIl[14]];
                            Movement.walkTo((WorldPoint)cf);
                            "".length();
                            Time.sleepTicks((int)lIlIllIl[0]);
                            "".length();
                            if (p.lIIlIIIlIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIlIllIl[20], lIlIllIl[21], lIlIllIl[1])) ? 1 : 0)) {
                                AccBuilderBarrows.c = lIlIlIll[lIlIllIl[22]];
                                e.c(new WorldPoint(lIlIllIl[23], lIlIllIl[24], lIlIllIl[1]));
                                Time.sleepTicks((int)lIlIllIl[5]);
                                "".length();
                            }
                        }
                        if (p.lIIlIIIllll(Players.getLocal().getWorldLocation().distanceTo(cf), lIlIllIl[4])) {
                            AccBuilderBarrows.c = lIlIlIll[lIlIllIl[25]];
                            g.a(lIlIlIll[lIlIllIl[26]], bX, lIlIllIl[0]);
                        }
                    }
                    if (p.lIIlIIlIIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIllIl[14])) {
                        if (p.lIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(cg), lIlIllIl[4])) {
                            AccBuilderBarrows.c = lIlIlIll[lIlIllIl[27]];
                            Movement.walkTo((WorldPoint)cg);
                            "".length();
                            Time.sleepTicks((int)lIlIllIl[0]);
                            "".length();
                        }
                        if (p.lIIlIIIllll(Players.getLocal().getWorldLocation().distanceTo(cg), lIlIllIl[4])) {
                            int[] nArray = new int[lIlIllIl[0]];
                            nArray[p.lIlIllIl[1]] = lIlIllIl[8];
                            if (p.lIIlIIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray4 = new int[lIlIllIl[0]];
                                nArray4[p.lIlIllIl[1]] = lIlIllIl[8];
                                String[] stringArray = new String[lIlIllIl[0]];
                                stringArray[p.lIlIllIl[1]] = lIlIlIll[lIlIllIl[28]];
                                Inventory.getFirst((int[])nArray4).useOn(TileObjects.getNearest((String[])stringArray));
                                Time.sleepTicks((int)lIlIllIl[3]);
                                "".length();
                            }
                        }
                    }
                    if (!p.lIIlIIlIIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIllIl[28])) break block64;
                    int[] nArray = new int[lIlIllIl[0]];
                    nArray[p.lIlIllIl[1]] = lIlIllIl[10];
                    if (p.lIIlIIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray5 = new int[lIlIllIl[0]];
                        nArray5[p.lIlIllIl[1]] = lIlIllIl[10];
                        Inventory.getFirst((int[])nArray5).interact(lIlIlIll[lIlIllIl[29]]);
                    }
                    if (p.lIIlIIIllll(Players.getLocal().getWorldLocation().distanceTo(cg), lIlIllIl[4])) {
                        String[] stringArray = new String[lIlIllIl[0]];
                        stringArray[p.lIlIllIl[1]] = lIlIlIll[lIlIllIl[30]];
                        TileObjects.getNearest((String[])stringArray).interact(lIlIlIll[lIlIllIl[31]]);
                        Time.sleepTicks((int)lIlIllIl[9]);
                        "".length();
                    }
                    if (!p.lIIlIIIlllI(Players.getLocal().getLocalLocation().distanceTo(new LocalPoint(lIlIllIl[32], lIlIllIl[33])), lIlIllIl[34])) break block65;
                    String[] stringArray = new String[lIlIllIl[0]];
                    stringArray[p.lIlIllIl[1]] = lIlIlIll[lIlIllIl[35]];
                    if (!p.lIIlIIIllII(TileObjects.getNearest((String[])stringArray))) break block64;
                }
                String[] stringArray = new String[lIlIllIl[0]];
                stringArray[p.lIlIllIl[1]] = lIlIlIll[lIlIllIl[36]];
                if (p.lIIlIIIllII(TileObjects.getNearest((String[])stringArray))) {
                    if (p.lIIlIIIlllI(Players.getLocal().getLocalLocation().getY(), lIlIllIl[37])) {
                        String[] stringArray2 = new String[lIlIllIl[0]];
                        stringArray2[p.lIlIllIl[1]] = lIlIlIll[lIlIllIl[38]];
                        if (p.lIIlIIIllll(Players.getLocal().getWorldLocation().distanceTo(TileObjects.getNearest((String[])stringArray2).getWorldLocation()), lIlIllIl[14])) {
                            String[] stringArray3 = new String[lIlIllIl[0]];
                            stringArray3[p.lIlIllIl[1]] = lIlIlIll[lIlIllIl[39]];
                            if (p.lIIlIIlIIIl(NPCs.getNearest((String[])stringArray3))) {
                                AccBuilderBarrows.c = lIlIlIll[lIlIllIl[40]];
                                String[] stringArray4 = new String[lIlIllIl[0]];
                                stringArray4[p.lIlIllIl[1]] = lIlIlIll[lIlIllIl[41]];
                                TileObjects.getNearest((String[])stringArray4).interact(lIlIlIll[lIlIllIl[42]]);
                                Time.sleepTicks((int)lIlIllIl[14]);
                                "".length();
                            }
                        }
                    }
                    String[] stringArray5 = new String[lIlIllIl[0]];
                    stringArray5[p.lIlIllIl[1]] = lIlIlIll[lIlIllIl[43]];
                    if (p.lIIlIIlIIIl(NPCs.getNearest((String[])stringArray5)) && p.lIIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderBarrows.c = lIlIlIll[lIlIllIl[44]];
                        String[] stringArray6 = new String[lIlIllIl[0]];
                        stringArray6[p.lIlIllIl[1]] = lIlIlIll[lIlIllIl[45]];
                        TileObjects.getNearest((String[])stringArray6).interact(lIlIlIll[lIlIllIl[46]]);
                        Time.sleepTicks((int)lIlIllIl[12]);
                        "".length();
                        g.a(bX);
                    }
                    g.a(bX);
                }
            }
            if (p.lIIlIIlIIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIllIl[36])) {
                AccBuilderBarrows.c = lIlIlIll[lIlIllIl[47]];
                g.a(lIlIlIll[lIlIllIl[48]], bX);
            }
            if (p.lIIlIIlIIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIllIl[42])) {
                if (p.lIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(cg), lIlIllIl[4])) {
                    String[] stringArray = new String[lIlIllIl[0]];
                    stringArray[p.lIlIllIl[1]] = lIlIlIll[lIlIllIl[49]];
                    if (p.lIIlIIlIIIl(NPCs.getNearest((String[])stringArray))) {
                        String[] stringArray7 = new String[lIlIllIl[0]];
                        stringArray7[p.lIlIllIl[1]] = lIlIlIll[lIlIllIl[50]];
                        if (p.lIIlIIIlIll(Equipment.contains((String[])stringArray7) ? 1 : 0)) {
                            String[] stringArray8 = new String[lIlIllIl[0]];
                            stringArray8[p.lIlIllIl[1]] = lIlIlIll[lIlIllIl[51]];
                            if (p.lIIlIIIlIIl(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                                String[] stringArray9 = new String[lIlIllIl[0]];
                                stringArray9[p.lIlIllIl[1]] = lIlIlIll[lIlIllIl[52]];
                                Inventory.getFirst((String[])stringArray9).interact(lIlIlIll[lIlIllIl[53]]);
                            }
                        }
                        AccBuilderBarrows.c = lIlIlIll[lIlIllIl[54]];
                        Movement.walkTo((WorldPoint)cg);
                        "".length();
                        Time.sleepTicks((int)lIlIllIl[0]);
                        "".length();
                    }
                }
                if (p.lIIlIIIllll(Players.getLocal().getWorldLocation().distanceTo(cg), lIlIllIl[4])) {
                    AccBuilderBarrows.c = lIlIlIll[lIlIllIl[55]];
                    String[] stringArray = new String[lIlIllIl[0]];
                    stringArray[p.lIlIllIl[1]] = lIlIlIll[lIlIllIl[56]];
                    if (p.lIIlIIIllII(TileObjects.getNearest((String[])stringArray))) {
                        String[] stringArray10 = new String[lIlIllIl[0]];
                        stringArray10[p.lIlIllIl[1]] = lIlIlIll[lIlIllIl[57]];
                        TileObjects.getNearest((String[])stringArray10).interact(lIlIlIll[lIlIllIl[58]]);
                        Time.sleepTicks((int)lIlIllIl[9]);
                        "".length();
                    }
                }
                if (p.lIIlIIIlllI(Players.getLocal().getLocalLocation().getY(), lIlIllIl[37])) {
                    String[] stringArray = new String[lIlIllIl[0]];
                    stringArray[p.lIlIllIl[1]] = lIlIlIll[lIlIllIl[59]];
                    if (p.lIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(TileObjects.getNearest((String[])stringArray).getWorldLocation()), lIlIllIl[18])) {
                        AccBuilderBarrows.c = lIlIlIll[lIlIllIl[60]];
                        String[] stringArray11 = new String[lIlIllIl[0]];
                        stringArray11[p.lIlIllIl[1]] = lIlIlIll[lIlIllIl[61]];
                        TileObjects.getNearest((String[])stringArray11).interact(lIlIlIll[lIlIllIl[62]]);
                        Time.sleepTicks((int)lIlIllIl[14]);
                        "".length();
                    }
                }
                if (p.lIIlIIlIIIl(Players.getLocal().getInteracting()) && p.lIIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[lIlIllIl[0]];
                    stringArray[p.lIlIllIl[1]] = lIlIlIll[lIlIllIl[63]];
                    if (p.lIIlIIIlIll(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray12 = new String[lIlIllIl[0]];
                        stringArray12[p.lIlIllIl[1]] = lIlIlIll[lIlIllIl[64]];
                        if (p.lIIlIIIlIIl(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                            String[] stringArray13 = new String[lIlIllIl[0]];
                            stringArray13[p.lIlIllIl[1]] = lIlIlIll[lIlIllIl[65]];
                            Inventory.getFirst((String[])stringArray13).interact(lIlIlIll[lIlIllIl[66]]);
                        }
                    }
                    int[] nArray = new int[lIlIllIl[0]];
                    nArray[p.lIlIllIl[1]] = lIlIllIl[10];
                    if (p.lIIlIIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[lIlIllIl[0]];
                        nArray6[p.lIlIllIl[1]] = lIlIllIl[10];
                        if (p.lIIlIIIlIll(Equipment.contains((int[])nArray6) ? 1 : 0)) {
                            int[] nArray7 = new int[lIlIllIl[0]];
                            nArray7[p.lIlIllIl[1]] = lIlIllIl[10];
                            Inventory.getFirst((int[])nArray7).interact(lIlIlIll[lIlIllIl[34]]);
                        }
                    }
                    String[] stringArray14 = new String[lIlIllIl[0]];
                    stringArray14[p.lIlIllIl[1]] = lIlIlIll[lIlIllIl[67]];
                    NPCs.getNearest((String[])stringArray14).interact(lIlIlIll[lIlIllIl[68]]);
                    Time.sleepTicks((int)lIlIllIl[0]);
                    "".length();
                }
                if (p.lIIlIIlIIlI(p.lIIlIIIIlIl(e.v(), 60.0))) {
                    int[] nArray = new int[lIlIllIl[0]];
                    nArray[p.lIlIllIl[1]] = lIlIllIl[13];
                    if (p.lIIlIIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray8 = new int[lIlIllIl[0]];
                        nArray8[p.lIlIllIl[1]] = lIlIllIl[13];
                        Inventory.getFirst((int[])nArray8).interact(lIlIlIll[lIlIllIl[69]]);
                        Time.sleepTicks((int)lIlIllIl[0]);
                        "".length();
                    }
                }
                g.a(bX);
            }
            if (p.lIIlIIlIIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIllIl[47])) {
                String[] stringArray = new String[lIlIllIl[0]];
                stringArray[p.lIlIllIl[1]] = lIlIlIll[lIlIllIl[70]];
                if (p.lIIlIIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIlIlIll[lIlIllIl[71]];
                    String[] stringArray15 = new String[lIlIllIl[0]];
                    stringArray15[p.lIlIllIl[1]] = lIlIlIll[lIlIllIl[72]];
                    TileObjects.getNearest((String[])stringArray15).interact(lIlIlIll[lIlIllIl[73]]);
                    Time.sleepTicks((int)lIlIllIl[4]);
                    "".length();
                }
                String[] stringArray16 = new String[lIlIllIl[0]];
                stringArray16[p.lIlIllIl[1]] = lIlIlIll[lIlIllIl[74]];
                if (p.lIIlIIIlIIl(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                    if (p.lIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(cf), lIlIllIl[4])) {
                        AccBuilderBarrows.c = lIlIlIll[lIlIllIl[75]];
                        Movement.walkTo((WorldPoint)cf);
                        "".length();
                        Time.sleepTicks((int)lIlIllIl[0]);
                        "".length();
                        if (p.lIIlIIIlIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIlIllIl[20], lIlIllIl[21], lIlIllIl[1])) ? 1 : 0)) {
                            AccBuilderBarrows.c = lIlIlIll[lIlIllIl[76]];
                            e.c(new WorldPoint(lIlIllIl[23], lIlIllIl[24], lIlIllIl[1]));
                            Time.sleepTicks((int)lIlIllIl[5]);
                            "".length();
                        }
                    }
                    if (p.lIIlIIIllll(Players.getLocal().getWorldLocation().distanceTo(cf), lIlIllIl[4])) {
                        AccBuilderBarrows.c = lIlIlIll[lIlIllIl[77]];
                        g.a(lIlIlIll[lIlIllIl[78]], bX, lIlIllIl[0]);
                    }
                }
            }
            if (p.lIIlIIlIIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIllIl[52])) {
                if (p.lIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(ch), lIlIllIl[9])) {
                    AccBuilderBarrows.c = lIlIlIll[lIlIllIl[79]];
                    Movement.walkTo((WorldPoint)ch);
                    "".length();
                    Time.sleepTicks((int)lIlIllIl[0]);
                    "".length();
                }
                if (p.lIIlIIIllll(Players.getLocal().getWorldLocation().distanceTo(ch), lIlIllIl[9])) {
                    AccBuilderBarrows.c = lIlIlIll[lIlIllIl[80]];
                    if (p.lIIlIIIlIlI(ci, lIlIllIl[0])) {
                        Q.lX += lIlIllIl[0];
                        Q.o(AccBuilderBarrows.m);
                        ci += lIlIllIl[0];
                        Q.lX = lIlIllIl[1];
                        cj = lIlIllIl[1];
                    }
                    g.a(lIlIlIll[lIlIllIl[17]], bX);
                }
            }
        }
    }

    private static boolean lIIlIIIlIll(int n2) {
        return n2 == 0;
    }

    static {
        p.lIIlIIIIlII();
        p.lIIlIIIIIll();
        bB = new ArrayList<d>();
        ce = new WorldPoint(lIlIllIl[88], lIlIllIl[89], lIlIllIl[1]);
        cf = new WorldPoint(lIlIllIl[90], lIlIllIl[91], lIlIllIl[1]);
        cg = new WorldPoint(lIlIllIl[92], lIlIllIl[93], lIlIllIl[1]);
        ch = new WorldPoint(lIlIllIl[94], lIlIllIl[95], lIlIllIl[1]);
        ck = null;
        String[] stringArray = new String[lIlIllIl[4]];
        stringArray[p.lIlIllIl[1]] = lIlIlIll[lIlIllIl[96]];
        stringArray[p.lIlIllIl[0]] = lIlIlIll[lIlIllIl[97]];
        stringArray[p.lIlIllIl[3]] = lIlIlIll[lIlIllIl[98]];
        stringArray[p.lIlIllIl[9]] = lIlIlIll[lIlIllIl[99]];
        bX = stringArray;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
        int n2;
        block4: {
            block5: {
                int[] nArray = new int[lIlIllIl[0]];
                nArray[p.lIlIllIl[1]] = lIlIllIl[6];
                if (!p.lIIlIIIllIl(Inventory.getCount((int[])nArray))) break block4;
                int[] nArray2 = new int[lIlIllIl[0]];
                nArray2[p.lIlIllIl[1]] = lIlIllIl[8];
                if (!p.lIIlIIIllIl(Inventory.getCount((int[])nArray2))) break block4;
                int[] nArray3 = new int[lIlIllIl[0]];
                nArray3[p.lIlIllIl[1]] = lIlIllIl[10];
                if (!p.lIIlIIlIIll(Inventory.getCount((int[])nArray3))) break block5;
                int[] nArray4 = new int[lIlIllIl[0]];
                nArray4[p.lIlIllIl[1]] = lIlIllIl[10];
                if (!p.lIIlIIIlIIl(Equipment.contains((int[])nArray4) ? 1 : 0)) break block4;
            }
            int[] nArray = new int[lIlIllIl[0]];
            nArray[p.lIlIllIl[1]] = lIlIllIl[13];
            if (p.lIIlIIIllIl(Inventory.getCount((int[])nArray))) {
                n2 = lIlIllIl[0];
                "".length();
                if (((0x6E ^ 0x7F ^ (0xF9 ^ 0xA9)) & (201 + 97 - 291 + 243 ^ 23 + 62 - 14 + 116 ^ -" ".length())) >= 0) return n2 != 0;
                return ((0x27 ^ 0x42 ^ (0x42 ^ 9)) & (0x60 ^ 0x23 ^ (0x4B ^ 0x26) ^ -" ".length())) != 0;
            }
        }
        n2 = lIlIllIl[1];
        return n2 != 0;
    }

    private static String lIIIlllIIlI(String lIlllIlIllllIII, String lIlllIlIllllIIl) {
        try {
            SecretKeySpec lIlllIlIlllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllIlIllllIIl.getBytes(StandardCharsets.UTF_8)), lIlIllIl[16]), "DES");
            Cipher lIlllIlIlllllII = Cipher.getInstance("DES");
            lIlllIlIlllllII.init(lIlIllIl[3], lIlllIlIlllllIl);
            return new String(lIlllIlIlllllII.doFinal(Base64.getDecoder().decode(lIlllIlIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllIlIllllIll) {
            lIlllIlIllllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIllIl(int n2) {
        return n2 > 0;
    }

    @Override
    public int U() {
        try {
            p.aA();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0xB0 ^ 0xB4) <= ((0xB6 ^ 0x9D) & ~(0x67 ^ 0x4C))) {
            return (0xAF ^ 0xB0) & ~(0x39 ^ 0x26);
        }
        return lIlIllIl[85];
    }

    private static boolean lIIlIIIlIIl(int n2) {
        return n2 != 0;
    }

    private static void ag() {
        d lIlllIllIlIlIIl;
        block10: {
            block9: {
                Object lIlllIllIlIlIlI;
                int[] nArray = new int[lIlIllIl[0]];
                nArray[p.lIlIllIl[1]] = lIlIllIl[8];
                if (p.lIIlIIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(lIlIllIl[8], lIlIllIl[0], lIlIllIl[81]);
                    bB.add(d2);
                    "".length();
                }
                int[] nArray2 = new int[lIlIllIl[0]];
                nArray2[p.lIlIllIl[1]] = lIlIllIl[10];
                if (p.lIIlIIIlIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lIlllIllIlIlIlI = new d(lIlIllIl[10], lIlIllIl[0], lIlIllIl[81]);
                    bB.add((d)lIlllIllIlIlIlI);
                    "".length();
                }
                int[] nArray3 = new int[lIlIllIl[0]];
                nArray3[p.lIlIllIl[1]] = lIlIllIl[13];
                if (p.lIIlIIIlIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    lIlllIllIlIlIlI = new d(lIlIllIl[13], lIlIllIl[50], lIlIllIl[82]);
                    bB.add((d)lIlllIllIlIlIlI);
                    "".length();
                }
                int[] nArray4 = new int[lIlIllIl[0]];
                nArray4[p.lIlIllIl[1]] = lIlIllIl[11];
                if (p.lIIlIIIlIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    lIlllIllIlIlIlI = new d(lIlIllIl[11], lIlIllIl[12], i.bw);
                    bB.add((d)lIlllIllIlIlIlI);
                    "".length();
                }
                if (p.lIIlIIIlIll(Bank.contains((Predicate)(lIlllIllIlIlIlI = item -> item.getName().toLowerCase().contains(lIlIlIll[lIlIllIl[87]]))) ? 1 : 0)) {
                    lIlllIllIlIlIIl = new d(lIlIllIl[83], lIlIllIl[12], lIlIllIl[84]);
                    bB.add(lIlllIllIlIlIIl);
                    "".length();
                }
                int[] nArray5 = new int[lIlIllIl[0]];
                nArray5[p.lIlIllIl[1]] = lIlIllIl[7];
                if (!p.lIIlIIIlIIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block9;
                int[] nArray6 = new int[lIlIllIl[0]];
                nArray6[p.lIlIllIl[1]] = lIlIllIl[7];
                if (!p.lIIlIIIlIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block10;
                int[] nArray7 = new int[lIlIllIl[0]];
                nArray7[p.lIlIllIl[1]] = lIlIllIl[7];
                if (!p.lIIlIIIlIlI(Bank.getFirst((int[])nArray7).getQuantity(), lIlIllIl[12])) break block10;
            }
            lIlllIllIlIlIIl = new d(lIlIllIl[7], lIlIllIl[28], lIlIllIl[82]);
            bB.add(lIlllIllIlIlIIl);
            "".length();
        }
        int[] nArray = new int[lIlIllIl[0]];
        nArray[p.lIlIllIl[1]] = lIlIllIl[6];
        if (p.lIIlIIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIlllIllIlIlIIl = new d(lIlIllIl[6], lIlIllIl[57], lIlIllIl[82]);
            bB.add(lIlllIllIlIlIIl);
            "".length();
        }
    }

    private static String lIIIlllIlII(String lIlllIllIIlIlll, String lIlllIllIIlIllI) {
        lIlllIllIIlIlll = new String(Base64.getDecoder().decode(lIlllIllIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlllIllIIllIlI = new StringBuilder();
        char[] lIlllIllIIllIIl = lIlllIllIIlIllI.toCharArray();
        int lIlllIllIIllIII = lIlIllIl[1];
        char[] lIlllIllIIlIIlI = lIlllIllIIlIlll.toCharArray();
        int lIlllIllIIlIIIl = lIlllIllIIlIIlI.length;
        int lIlllIllIIlIIII = lIlIllIl[1];
        while (p.lIIlIIIlIlI(lIlllIllIIlIIII, lIlllIllIIlIIIl)) {
            char lIlllIllIIlllIl = lIlllIllIIlIIlI[lIlllIllIIlIIII];
            lIlllIllIIllIlI.append((char)(lIlllIllIIlllIl ^ lIlllIllIIllIIl[lIlllIllIIllIII % lIlllIllIIllIIl.length]));
            "".length();
            ++lIlllIllIIllIII;
            ++lIlllIllIIlIIII;
            "".length();
            if ((0xA8 ^ 0x95 ^ (0x20 ^ 0x19)) != 0) continue;
            return null;
        }
        return String.valueOf(lIlllIllIIllIlI);
    }

    private static void lIIlIIIIIll() {
        lIlIlIll = new String[lIlIllIl[100]];
        p.lIlIlIll[p.lIlIllIl[1]] = p.lIIIlllIIlI("55LbAlF4XK+4Av5nAG1FY1v7MZp/EAppvUXAnQMjdOK5V13ZH64vtj/ELSMOPMXQ", "QRErf");
        p.lIlIlIll[p.lIlIllIl[0]] = p.lIIIlllIIll("d3R7eKXrZc9ecJaBm/s+IA==", "ZNYdw");
        p.lIlIlIll[p.lIlIllIl[3]] = p.lIIIlllIIll("OvZJgWgcicGoKPiQopCAeeUKRWBXwVhf", "thPpQ");
        p.lIlIlIll[p.lIlIllIl[9]] = p.lIIIlllIIll("c1NK6E8Aa4IxgE2AH/8vYallsPQSnGwQEBNyoV4cvg20HQKtid4HVK+s0wYS9S0AVuHhrwkHQRw=", "MAXsB");
        p.lIlIlIll[p.lIlIllIl[4]] = p.lIIIlllIIlI("IyJpMoevL2I=", "XXbdR");
        p.lIlIlIll[p.lIlIllIl[12]] = p.lIIIlllIlII("OTcZJw==", "nRxUh");
        p.lIlIlIll[p.lIlIllIl[5]] = p.lIIIlllIIlI("bmV6KoxCsLmuNZcWAi8XrA==", "qELkz");
        p.lIlIlIll[p.lIlIllIl[18]] = p.lIIIlllIIll("8zrveIYECuAn1hwfgTG5Vw==", "jPrAl");
        p.lIlIlIll[p.lIlIllIl[16]] = p.lIIIlllIIlI("ijYNefhzeDrWL83pYRb/Xg==", "cxVaK");
        p.lIlIlIll[p.lIlIllIl[19]] = p.lIIIlllIIll("4JK6LQkRdeg=", "EOUHi");
        p.lIlIlIll[p.lIlIllIl[14]] = p.lIIIlllIIll("eekszsneIVH5JqCmBsoVJg==", "Flqva");
        p.lIlIlIll[p.lIlIllIl[22]] = p.lIIIlllIlII("PCI3CT9DdiEGPQw9KwQzTzk3Hg==", "oVBjT");
        p.lIlIlIll[p.lIlIllIl[25]] = p.lIIIlllIIll("zWcSnAJ2jS9qPEumf1OyyQ==", "sHGZP");
        p.lIlIlIll[p.lIlIllIl[26]] = p.lIIIlllIIlI("b6FdyrkAad8=", "cRZCz");
        p.lIlIlIll[p.lIlIllIl[27]] = p.lIIIlllIIll("KiFm6rToe1y+m2CznAhYDA==", "EHskx");
        p.lIlIlIll[p.lIlIllIl[28]] = p.lIIIlllIIlI("hlGzH5L7VbYm0/QPccGZXQ==", "LCnhb");
        p.lIlIlIll[p.lIlIllIl[29]] = p.lIIIlllIIll("Rah3XJ6I8Bk=", "vtpwl");
        p.lIlIlIll[p.lIlIllIl[30]] = p.lIIIlllIlII("IyYmMAoXN3Q5Cxw3", "pRTQd");
        p.lIlIlIll[p.lIlIllIl[31]] = p.lIIIlllIlII("GiUwDBV0LTYWGQ==", "YIYaw");
        p.lIlIlIll[p.lIlIllIl[35]] = p.lIIIlllIIlI("FgqJ+goZT+pcKJfMHJk7MA==", "yoTef");
        p.lIlIlIll[p.lIlIllIl[36]] = p.lIIIlllIIlI("BWKoYRsdXUDfMOfy+J1pOQ==", "gGjvz");
        p.lIlIlIll[p.lIlIllIl[38]] = p.lIIIlllIlII("FhYhGwE1HSs=", "TzNxj");
        p.lIlIlIll[p.lIlIllIl[39]] = p.lIIIlllIIll("rpvj3ZJVWSy9Wt7Xz4N2Jg==", "Itrao");
        p.lIlIlIll[p.lIlIllIl[40]] = p.lIIIlllIIlI("SSkzy1k+dFLC7MDc08U46NnIcbhnJmgy", "WBYER");
        p.lIlIlIll[p.lIlIllIl[41]] = p.lIIIlllIIll("8FCiOCXfEli4o632AvgnSg==", "KKzTa");
        p.lIlIlIll[p.lIlIllIl[42]] = p.lIIIlllIIlI("v79EV6Yusn36TWh9BjaT7Q==", "hfavl");
        p.lIlIlIll[p.lIlIllIl[43]] = p.lIIIlllIIll("5uIkBPUirASzaPbqit6XMg==", "vuEPY");
        p.lIlIlIll[p.lIlIllIl[44]] = p.lIIIlllIIll("tbOsI+MzopTnkGF+kWCm2A==", "TuSRG");
        p.lIlIlIll[p.lIlIllIl[45]] = p.lIIIlllIlII("FCkwJSwzLTs=", "GBUII");
        p.lIlIlIll[p.lIlIllIl[46]] = p.lIIIlllIIll("B3pAFxHaTujtIf33XCYg1w==", "evnsa");
        p.lIlIlIll[p.lIlIllIl[47]] = p.lIIIlllIIll("66guGxv3EygpMnbpicpym85YcJjoz44V", "tUHwC");
        p.lIlIlIll[p.lIlIllIl[48]] = p.lIIIlllIIlI("LVfg5zrzPVc=", "DIXMf");
        p.lIlIlIll[p.lIlIllIl[49]] = p.lIIIlllIlII("MCYNAyQMLg==", "cIxqL");
        p.lIlIlIll[p.lIlIllIl[50]] = p.lIIIlllIIlI("kSvu2IZoOFGOEGKSawXdpb3+7/hFbWbi", "TKidv");
        p.lIlIlIll[p.lIlIllIl[51]] = p.lIIIlllIIlI("pM7y0O0uBa6LdanoL4Kdc1kUDBqa0GEE", "OFCpg");
        p.lIlIlIll[p.lIlIllIl[52]] = p.lIIIlllIIlI("97UE9s+bxbQd9+Emv9Q3yL7dWJv4fCfo", "SGhJQ");
        p.lIlIlIll[p.lIlIllIl[53]] = p.lIIIlllIlII("LRMKPw==", "zvkMp");
        p.lIlIlIll[p.lIlIllIl[54]] = p.lIIIlllIIlI("5c+7b/CkVSVSeD4cPxbbyQ==", "NJsLm");
        p.lIlIlIll[p.lIlIllIl[55]] = p.lIIIlllIIlI("D0eCQ+pAgOq2kfNcFyd7Uw==", "IfgEw");
        p.lIlIlIll[p.lIlIllIl[56]] = p.lIIIlllIlII("KycqLSIfNngkIxQ2", "xSXLL");
        p.lIlIlIll[p.lIlIllIl[57]] = p.lIIIlllIIlI("gAU39vi+EKQHppGG+8On2g==", "QhsYg");
        p.lIlIlIll[p.lIlIllIl[58]] = p.lIIIlllIIlI("cqUH3MdMyVSIWIDGK4FtXQ==", "vxnJK");
        p.lIlIlIll[p.lIlIllIl[59]] = p.lIIIlllIIll("M9SFRSvkNtWYdX8mPZ2AKg==", "WSJQc");
        p.lIlIlIll[p.lIlIllIl[60]] = p.lIIIlllIIll("nCF/NKSc9YQerA/8UC6sP0HQM/46cn3U", "kNagi");
        p.lIlIlIll[p.lIlIllIl[61]] = p.lIIIlllIIll("26bb92f29s6TggWFWINxvQ==", "qNLzi");
        p.lIlIlIll[p.lIlIllIl[62]] = p.lIIIlllIlII("CgsiKDBkCD0gIA==", "IgKER");
        p.lIlIlIll[p.lIlIllIl[63]] = p.lIIIlllIIlI("FqkMJBobM07CUzxYMiZgQemnNG4FD3wC", "jDPil");
        p.lIlIlIll[p.lIlIllIl[64]] = p.lIIIlllIIll("FSprmRht+BE4RN27Y7/WPlEHDz//tsvD", "HpEqw");
        p.lIlIlIll[p.lIlIllIl[65]] = p.lIIIlllIIll("wcyVNNLY3kKcvPM6YdeI6vj7JdfBV4SQ", "tHfLC");
        p.lIlIlIll[p.lIlIllIl[66]] = p.lIIIlllIlII("DhwOPg==", "YyoLu");
        p.lIlIlIll[p.lIlIllIl[34]] = p.lIIIlllIIlI("OoaICS1wyG4=", "Thxkh");
        p.lIlIlIll[p.lIlIllIl[67]] = p.lIIIlllIIlI("Une8/ZXVTac=", "uMJJR");
        p.lIlIlIll[p.lIlIllIl[68]] = p.lIIIlllIIll("KdGqb1hmrOw=", "OEfBl");
        p.lIlIlIll[p.lIlIllIl[69]] = p.lIIIlllIIlI("8MxS54GCG4M=", "ckAMX");
        p.lIlIlIll[p.lIlIllIl[70]] = p.lIIIlllIlII("ERgyMQktEGclDi0D", "BwGCa");
        p.lIlIlIll[p.lIlIllIl[71]] = p.lIIIlllIIll("rbfqm1ERZVA2+U2veTt02A==", "xDjyt");
        p.lIlIlIll[p.lIlIllIl[72]] = p.lIIIlllIlII("IikMKmYVIxg8Lgkr", "fLmNF");
        p.lIlIlIll[p.lIlIllIl[73]] = p.lIIIlllIIll("q5fK2nrSmgwzq2ryGO4rwg==", "kxhBT");
        p.lIlIlIll[p.lIlIllIl[74]] = p.lIIIlllIlII("Gh4AMzgmFlUnPyYF", "IquAP");
        p.lIlIlIll[p.lIlIllIl[75]] = p.lIIIlllIlII("JxYAYgMGVwUjBQgf", "iwvBw");
        p.lIlIlIll[p.lIlIllIl[76]] = p.lIIIlllIlII("HRs8ACpiTyoPKC0EIA0mbgA8Fw==", "NoIcA");
        p.lIlIlIll[p.lIlIllIl[77]] = p.lIIIlllIlII("OhUNCSsAE0ERIxwVCQ==", "ntabB");
        p.lIlIlIll[p.lIlIllIl[78]] = p.lIIIlllIlII("ORMwKR0=", "jrBHu");
        p.lIlIlIll[p.lIlIllIl[79]] = p.lIIIlllIIlI("fIaVLZZgme0yp4Lo2BhU2A==", "jlQPP");
        p.lIlIlIll[p.lIlIllIl[80]] = p.lIIIlllIIlI("VVOvrfd6SbMTY0GeEWOh/A==", "IGgtX");
        p.lIlIlIll[p.lIlIllIl[17]] = p.lIIIlllIIlI("ggRhQAeiCH8=", "KjZuJ");
        p.lIlIlIll[p.lIlIllIl[86]] = p.lIIIlllIIll("Yhbobm66CYVVGyuEoxGglguwZnxfkNE9", "ULFwf");
        p.lIlIlIll[p.lIlIllIl[87]] = p.lIIIlllIIlI("D/KNIGeuC9L7bawo4/h/vhnqC2BtFJLY", "wicDw");
        p.lIlIlIll[p.lIlIllIl[96]] = p.lIIIlllIlII("PAMgeA==", "efSVl");
        p.lIlIlIll[p.lIlIllIl[97]] = p.lIIIlllIIll("5W+aCkgp0ebt/4V+6t4cBn/xiT4yYHS6", "bWlVI");
        p.lIlIlIll[p.lIlIllIl[98]] = p.lIIIlllIIll("yalzx0FrzaPjSNN1j16SETsUKdiTsKuve0X9KQOeguw=", "FZbio");
        p.lIlIlIll[p.lIlIllIl[99]] = p.lIIIlllIIll("juyGA3UYjdA=", "ieVKX");
    }

    private static boolean lIIlIIlIIll(int n2) {
        return n2 <= 0;
    }

    private static void lIIlIIIIlII() {
        lIlIllIl = new int[101];
        p.lIlIllIl[0] = " ".length();
        p.lIlIllIl[1] = (0x2B ^ 0x67) & ~(0xC4 ^ 0x88);
        p.lIlIllIl[2] = 0xFFFFDF8E & 0x33F9;
        p.lIlIllIl[3] = "  ".length();
        p.lIlIllIl[4] = 74 + 47 - 108 + 125 ^ 90 + 19 - 33 + 66;
        p.lIlIllIl[5] = 0xBB ^ 0xBD;
        p.lIlIllIl[6] = 0xFFFFBF6F & 0x5FD7;
        p.lIlIllIl[7] = 0xFFFFDFDA & 0x3F6D;
        p.lIlIllIl[8] = 0xFFFF87FF & 0x7BBA;
        p.lIlIllIl[9] = "   ".length();
        p.lIlIllIl[10] = -(0xFFFFBFD1 & 0x7AEF) & (0xFFFFFFFF & 0x3FF3);
        p.lIlIllIl[11] = -(0xFFFFBEFF & 0x4727) & (0xFFFFBFFF & 0x7777);
        p.lIlIllIl[12] = 0xB4 ^ 0xB1;
        p.lIlIllIl[13] = -(0xFFFFD677 & 0x7D8D) & (0xFFFFF57F & 0x5FFF);
        p.lIlIllIl[14] = 0x10 ^ 0x70 ^ (0xC8 ^ 0xA2);
        p.lIlIllIl[15] = -"   ".length() & (0xFFFFBF7B & 0x5FCF);
        p.lIlIllIl[16] = 0 ^ 8;
        p.lIlIllIl[17] = 0x72 ^ 0x33;
        p.lIlIllIl[18] = 0x71 ^ 0x76;
        p.lIlIllIl[19] = 0x6E ^ 0x67;
        p.lIlIllIl[20] = -(0xFFFFE5DE & 0x3E3F) & (0xFFFFEFFF & 0x3FFF);
        p.lIlIllIl[21] = 0xFFFF8FE9 & 0x7CFF;
        p.lIlIllIl[22] = 0x78 ^ 0x73;
        p.lIlIllIl[23] = 0xFFFF8BDF & Short.MAX_VALUE;
        p.lIlIllIl[24] = 0xFFFFEDEF & 0x1EF1;
        p.lIlIllIl[25] = 147 + 66 - 203 + 168 ^ 184 + 62 - 104 + 48;
        p.lIlIllIl[26] = 0xB ^ 0x79 ^ 57 + 40 - 37 + 67;
        p.lIlIllIl[27] = 0x27 ^ 0x33 ^ (0x3A ^ 0x20);
        p.lIlIllIl[28] = 0x78 ^ 0x77;
        p.lIlIllIl[29] = 0x16 ^ 0x2F ^ (0x16 ^ 0x3F);
        p.lIlIllIl[30] = 49 + 5 - 14 + 112 ^ 97 + 30 - 113 + 123;
        p.lIlIllIl[31] = 0x38 ^ 4 ^ (0x8D ^ 0xA3);
        p.lIlIllIl[32] = 0xFFFF9BC6 & 0x7F79;
        p.lIlIllIl[33] = 0xFFFFDFE9 & 0x38D6;
        p.lIlIllIl[34] = 103 + 56 - 78 + 109 ^ 60 + 88 - 13 + 5;
        p.lIlIllIl[35] = 0xB1 ^ 0xA2;
        p.lIlIllIl[36] = 0x5E ^ 0x17 ^ (0xD7 ^ 0x8A);
        p.lIlIllIl[37] = -(0xFFFFD974 & 0x66BF) & (0xFFFFDBF7 & 0x77FB);
        p.lIlIllIl[38] = 0x59 ^ 0x4C;
        p.lIlIllIl[39] = 0xD1 ^ 0xC7;
        p.lIlIllIl[40] = 0x85 ^ 0x92;
        p.lIlIllIl[41] = 0x30 ^ 0x28;
        p.lIlIllIl[42] = 55 + 53 - 12 + 84 ^ 13 + 47 - 51 + 164;
        p.lIlIllIl[43] = 4 ^ 0x1E;
        p.lIlIllIl[44] = 73 + 122 - 177 + 139 ^ 64 + 125 - 100 + 45;
        p.lIlIllIl[45] = 0x4A ^ 0x56;
        p.lIlIllIl[46] = 6 + 142 - -4 + 3 ^ 26 + 101 - 42 + 49;
        p.lIlIllIl[47] = 0x2C ^ 0x60 ^ (0x60 ^ 0x32);
        p.lIlIllIl[48] = 0x3B ^ 0x47 ^ (0xE5 ^ 0x86);
        p.lIlIllIl[49] = 0xA5 ^ 0x85;
        p.lIlIllIl[50] = 0xA0 ^ 0x81;
        p.lIlIllIl[51] = 129 + 62 - 143 + 130 ^ 42 + 79 - 84 + 107;
        p.lIlIllIl[52] = 0x9B ^ 0xB8;
        p.lIlIllIl[53] = 0x21 ^ 0x57 ^ (0x94 ^ 0xC6);
        p.lIlIllIl[54] = 4 ^ 0x21;
        p.lIlIllIl[55] = 112 + 72 - 111 + 74 ^ 67 + 101 - 33 + 46;
        p.lIlIllIl[56] = 0x6C ^ 0x38 ^ (0xCA ^ 0xB9);
        p.lIlIllIl[57] = 0x39 ^ 0x11;
        p.lIlIllIl[58] = 8 ^ 0x21;
        p.lIlIllIl[59] = 0x9B ^ 0xB1;
        p.lIlIllIl[60] = 0xB4 ^ 0x8B ^ (0x4F ^ 0x5B);
        p.lIlIllIl[61] = 0x73 ^ 0x3F ^ (0x2C ^ 0x4C);
        p.lIlIllIl[62] = 0x6C ^ 0x41;
        p.lIlIllIl[63] = 0x32 ^ 0x1C;
        p.lIlIllIl[64] = 0x72 ^ 0x5D;
        p.lIlIllIl[65] = 0x68 ^ 0x58;
        p.lIlIllIl[66] = 0x84 ^ 0xB5;
        p.lIlIllIl[67] = 0x32 ^ 1;
        p.lIlIllIl[68] = 125 + 17 - 56 + 160 ^ 172 + 58 - 77 + 41;
        p.lIlIllIl[69] = 0x5B ^ 0x6E;
        p.lIlIllIl[70] = 0x9D ^ 0xAB;
        p.lIlIllIl[71] = 6 ^ 0x31;
        p.lIlIllIl[72] = 0x29 ^ 0x11;
        p.lIlIllIl[73] = 0xF3 ^ 0xA5 ^ (0x78 ^ 0x17);
        p.lIlIllIl[74] = 0x95 ^ 0xAF;
        p.lIlIllIl[75] = 48 + 103 - 134 + 167 ^ 5 + 129 - 130 + 127;
        p.lIlIllIl[76] = 0x4D ^ 0x71;
        p.lIlIllIl[77] = 0x3C ^ 1;
        p.lIlIllIl[78] = 0x77 ^ 0x4E ^ (0x54 ^ 0x53);
        p.lIlIllIl[79] = 0x8B ^ 0xB4;
        p.lIlIllIl[80] = 0x72 ^ 0x32;
        p.lIlIllIl[81] = 0xFFFFEFA8 & 0x337F;
        p.lIlIllIl[82] = -(0xFFFFB9FF & 0x765B) & (0xFFFFBBDE & 0x77FF);
        p.lIlIllIl[83] = -(0xFFFFD33D & 0x6DF6) & (0xFFFFFFFF & 0x6FFF);
        p.lIlIllIl[84] = 0xFFFFFDE9 & 0x63BE;
        p.lIlIllIl[85] = 0x57 ^ 0x6B ^ (0x3A ^ 0x62);
        p.lIlIllIl[86] = 202 + 213 - 215 + 29 ^ 10 + 34 - -73 + 50;
        p.lIlIllIl[87] = 0xD1 ^ 0x92;
        p.lIlIllIl[88] = -(0xFFFFB73B & 0x59D5) & (0xFFFF9DDF & 0x7F3D);
        p.lIlIllIl[89] = -(0xFFFFF629 & 0x79DF) & (0xFFFFFFFB & 0x7CBF);
        p.lIlIllIl[90] = -(0xFFFFB749 & 0x7CB7) & (0xFFFFFFFE & 0x3FDD);
        p.lIlIllIl[91] = 0xFFFFBCFF & 0x4FDE;
        p.lIlIllIl[92] = -(0xFFFFF39F & 0x3F74) & (0xFFFFBFDF & 0x7F7F);
        p.lIlIllIl[93] = -(0xFFFFB031 & 0x7FCF) & (0xFFFFBFFB & 0x7D17);
        p.lIlIllIl[94] = -(0xFFFFC3EF & 0x3F7D) & (0xFFFFFF7F & 0xFFF);
        p.lIlIllIl[95] = -(0xFFFF83CB & 0x7F3F) & (0xFFFFBFCF & 0x4FFB);
        p.lIlIllIl[96] = 110 + 153 - 237 + 177 ^ 105 + 9 - -12 + 17;
        p.lIlIllIl[97] = 0x55 ^ 0x10;
        p.lIlIllIl[98] = 0xC8 ^ 0x8E;
        p.lIlIllIl[99] = 174 + 136 - 197 + 79 ^ 35 + 74 - 82 + 108;
        p.lIlIllIl[100] = 0x73 ^ 0x3B;
    }

    private static String lIIIlllIIll(String lIlllIllIIIIlll, String lIlllIllIIIIllI) {
        try {
            SecretKeySpec lIlllIllIIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllIllIIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlllIllIIIlIIl = Cipher.getInstance("Blowfish");
            lIlllIllIIIlIIl.init(lIlIllIl[3], lIlllIllIIIlIlI);
            return new String(lIlllIllIIIlIIl.doFinal(Base64.getDecoder().decode(lIlllIllIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllIllIIIlIII) {
            lIlllIllIIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIlIIIl(Object object) {
        return object == null;
    }

    private static boolean lIIlIIlIIlI(int n2) {
        return n2 < 0;
    }

    private static boolean lIIlIIlIIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIIIllll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIlIIIllII(Object object) {
        return object != null;
    }

    private static boolean lIIlIIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIIlllI(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public String V() {
        return lIlIlIll[lIlIllIl[86]];
    }

    private static int lIIlIIIIlIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }
}

