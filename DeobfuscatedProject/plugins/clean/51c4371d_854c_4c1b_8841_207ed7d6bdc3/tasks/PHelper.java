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
package gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.QHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.AHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.BHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.DHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.EHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.FHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.GHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.IHelper;
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

public class PHelper
implements F {
    static  int ci;
    
    public static  WorldPoint ch;
    public static  WorldPoint ce;
    public static  WorldPoint cf;

    public static  boolean bz;
    private static  WorldPoint ck;
    public static  List<d> bB;
    public static  WorldPoint cg;
    static  boolean cj;

    private static boolean lIIlIIlIlII(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean W() {
        boolean bl;
        if (p.lIIlIIlIlII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIllIl[57])) {
            bl = lIlIllIl[0];

            if (-1 > ((201 + 22 - 114 + 93 ^ 10 + 134 - 120 + 112) & (50 + 82 - 127 + 249 ^ 42 + 163 - 107 + 90 ^ -1))) {
                return false;
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

                            }
                            if (p.lIIlIIIlIIl(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderBarrows.c = lIlIlIll[lIlIllIl[3]];
                                if (p.lIIlIIIllIl(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lIlIllIl[4]);

                                }
                                if (p.lIIlIIIllIl(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lIlIllIl[3]);

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

                            Time.sleepTicks((int)lIlIllIl[0]);

                        }
                        if (p.lIIlIIIllll(Players.getLocal().getWorldLocation().distanceTo(ce), lIlIllIl[4])) {
                            AccBuilderBarrows.c = lIlIlIll[lIlIllIl[18]];
                            ci = lIlIllIl[1];
                            if (p.lIIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[lIlIllIl[0]];
                                stringArray[p.lIlIllIl[1]] = lIlIlIll[lIlIllIl[16]];
                                TileObjects.getNearest((String[])stringArray).interact(lIlIlIll[lIlIllIl[19]]);
                                Time.sleepTicks((int)lIlIllIl[3]);

                            }
                            g.a(bX);
                        }
                    }
                    if (p.lIIlIIlIIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIllIl[12])) {
                        if (p.lIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(cf), lIlIllIl[4])) {
                            AccBuilderBarrows.c = lIlIlIll[lIlIllIl[14]];
                            Movement.walkTo((WorldPoint)cf);

                            Time.sleepTicks((int)lIlIllIl[0]);

                            if (p.lIIlIIIlIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIlIllIl[20], lIlIllIl[21], lIlIllIl[1])) ? 1 : 0)) {
                                AccBuilderBarrows.c = lIlIlIll[lIlIllIl[22]];
                                e.c(new WorldPoint(lIlIllIl[23], lIlIllIl[24], lIlIllIl[1]));
                                Time.sleepTicks((int)lIlIllIl[5]);

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

                            Time.sleepTicks((int)lIlIllIl[0]);

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

                        Time.sleepTicks((int)lIlIllIl[0]);

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

                }
                if (p.lIIlIIlIIlI(p.lIIlIIIIlIl(e.v(), 60.0))) {
                    int[] nArray = new int[lIlIllIl[0]];
                    nArray[p.lIlIllIl[1]] = lIlIllIl[13];
                    if (p.lIIlIIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray8 = new int[lIlIllIl[0]];
                        nArray8[p.lIlIllIl[1]] = lIlIllIl[13];
                        Inventory.getFirst((int[])nArray8).interact(lIlIlIll[lIlIllIl[69]]);
                        Time.sleepTicks((int)lIlIllIl[0]);

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

                }
                String[] stringArray16 = new String[lIlIllIl[0]];
                stringArray16[p.lIlIllIl[1]] = lIlIlIll[lIlIllIl[74]];
                if (p.lIIlIIIlIIl(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                    if (p.lIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(cf), lIlIllIl[4])) {
                        AccBuilderBarrows.c = lIlIlIll[lIlIllIl[75]];
                        Movement.walkTo((WorldPoint)cf);

                        Time.sleepTicks((int)lIlIllIl[0]);

                        if (p.lIIlIIIlIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIlIllIl[20], lIlIllIl[21], lIlIllIl[1])) ? 1 : 0)) {
                            AccBuilderBarrows.c = lIlIlIll[lIlIllIl[76]];
                            e.c(new WorldPoint(lIlIllIl[23], lIlIllIl[24], lIlIllIl[1]));
                            Time.sleepTicks((int)lIlIllIl[5]);

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

                    Time.sleepTicks((int)lIlIllIl[0]);

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

                if (((0x6E ^ 0x7F ^ (0xF9 ^ 0xA9)) & (201 + 97 - 291 + 243 ^ 23 + 62 - 14 + 116 ^ -1)) >= 0) return n2 != 0;
                return ((0x27 ^ 0x42 ^ (0x42 ^ 9)) & (0x60 ^ 0x23 ^ (0x4B ^ 0x26) ^ -1)) != 0;
            }
        }
        n2 = lIlIllIl[1];
        return n2 != 0;
    }

    private static boolean lIIlIIIllIl(int n2) {
        return n2 > 0;
    }

    @Override
    public int U() {
        try {
            p.aA();

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
                    d d2 = new DHelper(lIlIllIl[8], lIlIllIl[0], lIlIllIl[81]);
                    bB.add(d2);

                }
                int[] nArray2 = new int[lIlIllIl[0]];
                nArray2[p.lIlIllIl[1]] = lIlIllIl[10];
                if (p.lIIlIIIlIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lIlllIllIlIlIlI = new DHelper(lIlIllIl[10], lIlIllIl[0], lIlIllIl[81]);
                    bB.add((DHelper) IlllIllIlIlIlI);

                }
                int[] nArray3 = new int[lIlIllIl[0]];
                nArray3[p.lIlIllIl[1]] = lIlIllIl[13];
                if (p.lIIlIIIlIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    lIlllIllIlIlIlI = new DHelper(lIlIllIl[13], lIlIllIl[50], lIlIllIl[82]);
                    bB.add((DHelper) IlllIllIlIlIlI);

                }
                int[] nArray4 = new int[lIlIllIl[0]];
                nArray4[p.lIlIllIl[1]] = lIlIllIl[11];
                if (p.lIIlIIIlIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    lIlllIllIlIlIlI = new DHelper(lIlIllIl[11], lIlIllIl[12], i.bw);
                    bB.add((DHelper) IlllIllIlIlIlI);

                }
                if (p.lIIlIIIlIll(Bank.contains((Predicate)(lIlllIllIlIlIlI = item -> item.getName().toLowerCase().contains(lIlIlIll[lIlIllIl[87]]))) ? 1 : 0)) {
                    lIlllIllIlIlIIl = new DHelper(lIlIllIl[83], lIlIllIl[12], lIlIllIl[84]);
                    bB.add(lIlllIllIlIlIIl);

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
            lIlllIllIlIlIIl = new DHelper(lIlIllIl[7], lIlIllIl[28], lIlIllIl[82]);
            bB.add(lIlllIllIlIlIIl);

        }
        int[] nArray = new int[lIlIllIl[0]];
        nArray[p.lIlIllIl[1]] = lIlIllIl[6];
        if (p.lIIlIIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIlllIllIlIlIIl = new DHelper(lIlIllIl[6], lIlIllIl[57], lIlIllIl[82]);
            bB.add(lIlllIllIlIlIIl);

        }
    }

        return String.valueOf(lIlllIllIIllIlI);
    }

    private static void lIIlIIIIIll() {
        lIlIlIll = new String[lIlIllIl[100]];
        p.lIlIlIll[p.lIlIllIl[1]] = "Finished buying items, switching back to quest";
        p.lIlIlIll[p.lIlIllIl[0]] = "Nav to bank";
        p.lIlIlIll[p.lIlIllIl[3]] = "Handling banking";
        p.lIlIlIll[p.lIlIllIl[9]] = "We are missing quest supplies, switching to BUYING";
        p.lIlIlIll[p.lIlIllIl[4]] = "Drink";
        p.lIlIlIll[p.lIlIllIl[12]] = "Wear";
        p.lIlIlIll[p.lIlIllIl[5]] = "Nav to start";
        p.lIlIlIll[p.lIlIllIl[18]] = "Starting quest";
        p.lIlIlIll[p.lIlIllIl[16]] = "Notice board";
        p.lIlIlIll[p.lIlIllIl[19]] = "Check";
        p.lIlIlIll[p.lIlIllIl[14]] = "Nav to sarah";
        p.lIlIlIll[p.lIlIllIl[22]] = "Stuck, clicking out";
        p.lIlIlIll[p.lIlIllIl[25]] = "Talking sarah";
        p.lIlIlIll[p.lIlIllIl[26]] = "Sarah";
        p.lIlIlIll[p.lIlIllIl[27]] = "Nav to hole";
        p.lIlIlIll[p.lIlIllIl[28]] = "Strange hole";
        p.lIlIlIll[p.lIlIllIl[29]] = "Wield";
        p.lIlIlIll[p.lIlIllIl[30]] = "Strange hole";
        p.lIlIlIll[p.lIlIllIl[31]] = "Climb-down";
        p.lIlIlIll[p.lIlIllIl[35]] = "Skeleton";
        p.lIlIlIll[p.lIlIllIl[36]] = "Skeleton";
        p.lIlIlIll[p.lIlIllIl[38]] = "Blockage";
        p.lIlIlIll[p.lIlIllIl[39]] = "Pig Thing";
        p.lIlIlIll[p.lIlIllIl[40]] = "Climb over blockage";
        p.lIlIlIll[p.lIlIllIl[41]] = "Blockage";
        p.lIlIlIll[p.lIlIllIl[42]] = "Climb-over";
        p.lIlIlIll[p.lIlIllIl[43]] = "Pig Thing";
        p.lIlIlIll[p.lIlIllIl[44]] = "Interact skele";
        p.lIlIlIll[p.lIlIllIl[45]] = "Skeleton";
        p.lIlIlIll[p.lIlIllIl[46]] = "Investigate";
        p.lIlIlIll[p.lIlIllIl[47]] = "Interacting Spira";
        p.lIlIlIll[p.lIlIllIl[48]] = "Spria";
        p.lIlIlIll[p.lIlIllIl[49]] = "Sourhog";
        p.lIlIlIll[p.lIlIllIl[50]] = "Reinforced goggles";
        p.lIlIlIll[p.lIlIllIl[51]] = "Reinforced goggles";
        p.lIlIlIll[p.lIlIllIl[52]] = "Reinforced goggles";
        p.lIlIlIll[p.lIlIllIl[53]] = "Wear";
        p.lIlIlIll[p.lIlIllIl[54]] = "Nav to hole";
        p.lIlIlIll[p.lIlIllIl[55]] = "Climb down hole";
        p.lIlIlIll[p.lIlIllIl[56]] = "Strange hole";
        p.lIlIlIll[p.lIlIllIl[57]] = "Strange hole";
        p.lIlIlIll[p.lIlIllIl[58]] = "Climb-down";
        p.lIlIlIll[p.lIlIllIl[59]] = "Blockage";
        p.lIlIlIll[p.lIlIllIl[60]] = "Climb over blockage";
        p.lIlIlIll[p.lIlIllIl[61]] = "Blockage";
        p.lIlIlIll[p.lIlIllIl[62]] = "Climb-over";
        p.lIlIlIll[p.lIlIllIl[63]] = "Reinforced goggles";
        p.lIlIlIll[p.lIlIllIl[64]] = "Reinforced goggles";
        p.lIlIlIll[p.lIlIllIl[65]] = "Reinforced goggles";
        p.lIlIlIll[p.lIlIllIl[66]] = "Wear";
        p.lIlIlIll[p.lIlIllIl[34]] = "Wield";
        p.lIlIlIll[p.lIlIllIl[67]] = "Sourhog";
        p.lIlIlIll[p.lIlIllIl[68]] = "Attack";
        p.lIlIlIll[p.lIlIllIl[69]] = "Eat";
        p.lIlIlIll[p.lIlIllIl[70]] = "Sourhog foot";
        p.lIlIlIll[p.lIlIllIl[71]] = "Cutting foot";
        p.lIlIlIll[p.lIlIllIl[72]] = "Dead sourhog";
        p.lIlIlIll[p.lIlIllIl[73]] = "Cut-foot";
        p.lIlIlIll[p.lIlIllIl[74]] = "Sourhog foot";
        p.lIlIlIll[p.lIlIllIl[75]] = "Nav to sarah";
        p.lIlIlIll[p.lIlIllIl[76]] = "Stuck, clicking out";
        p.lIlIlIll[p.lIlIllIl[77]] = "Talking sarah";
        p.lIlIlIll[p.lIlIllIl[78]] = "Sarah";
        p.lIlIlIll[p.lIlIllIl[79]] = "Nav to Spria";
        p.lIlIlIll[p.lIlIllIl[80]] = "Talking spria";
        p.lIlIlIll[p.lIlIllIl[17]] = "Spria";
        p.lIlIlIll[p.lIlIllIl[86]] = "A porceline of interest";
        p.lIlIlIll[p.lIlIllIl[87]] = "ring of wealth (";
        p.lIlIlIll[p.lIlIllIl[96]] = "Yes.";
        p.lIlIlIll[p.lIlIllIl[97]] = "Talk about the bounty.";
        p.lIlIlIll[p.lIlIllIl[98]] = "I think that'll be all for now.";
        p.lIlIlIll[p.lIlIllIl[99]] = "Yes";
    }

    private static boolean lIIlIIlIIll(int n2) {
        return n2 <= 0;
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

