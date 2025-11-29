/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Quest
 *  net.runelite.api.QuestState
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.Quests
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks;

import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.AHelper;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.LHelper;
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
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class WHelper
implements F {
    static  boolean cj;
    public static  boolean bz;
    
    public static  List<d> bB;
    static  int ci;
    
    public static final  WorldPoint dh;
    public static final  WorldPoint di;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
        int n2;
        String[] stringArray = new String[lIllIlII[3]];
        stringArray[w.lIllIlII[4]] = lIllIIlI[lIllIlII[49]];
        if (w.lIIlIllIllI(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[lIllIlII[3]];
            nArray[w.lIllIlII[4]] = lIllIlII[14];
            if (w.lIIlIllIllI(Inventory.getCount((int[])nArray))) {
                String[] stringArray2 = new String[lIllIlII[3]];
                stringArray2[w.lIllIlII[4]] = lIllIIlI[lIllIlII[50]];
                if (w.lIIlIllIIll(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    int[] nArray2 = new int[lIllIlII[3]];
                    nArray2[w.lIllIlII[4]] = lIllIlII[18];
                    if (w.lIIlIllIIll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                        int[] nArray3 = new int[lIllIlII[3]];
                        nArray3[w.lIllIlII[4]] = lIllIlII[11];
                        if (w.lIIlIllIIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            n2 = lIllIlII[3];

                            if (null == null) return n2 != 0;
                            return false;
                        }
                    }
                }
            }
        }
        n2 = lIllIlII[4];
        return n2 != 0;
    }

    public static void bf() {
        if (w.lIIlIllIIII(e.j(lIllIlII[0]), lIllIlII[1])) {
            A.bD();
        }
        if (w.lIIlIllIIII(Skills.getLevel((Skill)Skill.COOKING), lIllIlII[2]) && w.lIIlIllIIIl(e.j(lIllIlII[0]), lIllIlII[1])) {
            L.cC();
        }
        if (w.lIIlIllIIlI(Skills.getLevel((Skill)Skill.COOKING), lIllIlII[2]) && w.lIIlIllIIIl(e.j(lIllIlII[0]), lIllIlII[1])) {
            if (w.lIIlIllIIll(bz ? 1 : 0)) {
                b.a(bB);
                if (w.lIIlIllIIII(bB.size(), lIllIlII[3])) {
                    System.out.println(lIllIIlI[lIllIlII[4]]);
                    bz = lIllIlII[4];
                }
            }
            if (w.lIIlIllIlII(bz ? 1 : 0)) {
                BankLocation lIllIIlllllIlll;
                if (w.lIIlIllIlII(w.ac() ? 1 : 0) && w.lIIlIllIlII(e.j(lIllIlII[5]))) {
                    lIllIIlllllIlll = BankLocation.getNearest();
                    if (w.lIIlIllIlIl(lIllIIlllllIlll) && w.lIIlIllIlII(lIllIIlllllIlll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = lIllIIlI[lIllIlII[3]];
                        a.a(lIllIIlllllIlll);
                    }
                    if (w.lIIlIllIlIl(lIllIIlllllIlll) && w.lIIlIllIIll(lIllIIlllllIlll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (w.lIIlIllIlII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIlII[6]);

                        }
                        if (w.lIIlIllIIll(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderBarrows.c = lIllIIlI[lIllIlII[1]];
                            if (w.lIIlIllIllI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIllIlII[7]);

                            }
                            if (w.lIIlIllIllI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIllIlII[1]);

                            }
                            int[] nArray = new int[lIllIlII[8]];
                            nArray[w.lIllIlII[4]] = lIllIlII[9];
                            nArray[w.lIllIlII[3]] = lIllIlII[10];
                            nArray[w.lIllIlII[1]] = lIllIlII[11];
                            nArray[w.lIllIlII[12]] = lIllIlII[13];
                            nArray[w.lIllIlII[7]] = lIllIlII[14];
                            nArray[w.lIllIlII[15]] = lIllIlII[16];
                            nArray[w.lIllIlII[17]] = lIllIlII[18];
                            if (w.lIIlIllIlII(e.b(nArray) ? 1 : 0)) {
                                w.ag();
                                System.out.println(lIllIIlI[lIllIlII[12]]);
                                bz = lIllIlII[3];
                                return;
                            }
                            int[] nArray2 = new int[lIllIlII[8]];
                            nArray2[w.lIllIlII[4]] = lIllIlII[9];
                            nArray2[w.lIllIlII[3]] = lIllIlII[10];
                            nArray2[w.lIllIlII[1]] = lIllIlII[11];
                            nArray2[w.lIllIlII[12]] = lIllIlII[13];
                            nArray2[w.lIllIlII[7]] = lIllIlII[14];
                            nArray2[w.lIllIlII[15]] = lIllIlII[16];
                            nArray2[w.lIllIlII[17]] = lIllIlII[18];
                            if (w.lIIlIllIIll(e.b(nArray2) ? 1 : 0)) {
                                a.a(lIllIlII[9], lIllIlII[2]);
                                a.a(lIllIlII[10], lIllIlII[2]);
                                a.a(lIllIlII[11], lIllIlII[3]);
                                a.a(lIllIlII[13], lIllIlII[3]);
                                a.a(lIllIlII[14], lIllIlII[3]);
                                a.a(lIllIlII[16], lIllIlII[3]);
                                a.a(lIllIlII[18], lIllIlII[3]);
                                a.a(lIllIlII[19], lIllIlII[1]);
                                a.a(lIllIlII[20], lIllIlII[6]);
                            }
                        }
                    }
                }
                if (w.lIIlIllIIll(Inventory.contains((int[])f.bb) ? 1 : 0) && w.lIIlIllIIII(Movement.getRunEnergy(), lIllIlII[21])) {
                    Inventory.getFirst((int[])f.bb).interact(lIllIIlI[lIllIlII[7]]);
                    Time.sleepTicks((int)lIllIlII[3]);

                }
                if (w.lIIlIllIlII(e.j(lIllIlII[5])) && w.lIIlIllIIll(w.ac() ? 1 : 0)) {
                    AccBuilderBarrows.c = lIllIIlI[lIllIlII[15]];
                    if (w.lIIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(dh), lIllIlII[12])) {
                        if (w.lIIlIllIIll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)dh);

                        Time.sleepTicks((int)lIllIlII[3]);

                    }
                    if (w.lIIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(dh), lIllIlII[12])) {
                        AccBuilderBarrows.c = lIllIIlI[lIllIlII[17]];
                        g.a(lIllIIlI[lIllIlII[8]], bX);
                    }
                }
                if (w.lIIlIllIIIl(e.j(lIllIlII[5]), lIllIlII[3])) {
                    int[] nArray = new int[lIllIlII[3]];
                    nArray[w.lIllIlII[4]] = lIllIlII[22];
                    if (w.lIIlIllIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray = new String[lIllIlII[3]];
                        stringArray[w.lIllIlII[4]] = lIllIIlI[lIllIlII[23]];
                        if (w.lIIlIllIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            ci = lIllIlII[4];
                            if (w.lIIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(di), lIllIlII[7])) {
                                AccBuilderBarrows.c = lIllIIlI[lIllIlII[24]];
                                lIllIIlllllIlll = new WorldArea(lIllIlII[25], lIllIlII[26], lIllIlII[27], lIllIlII[28], lIllIlII[4]);
                                if (w.lIIlIllIlII(lIllIIlllllIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (w.lIIlIllIIll(Inventory.contains(item -> item.getName().contains(lIllIIlI[lIllIlII[66]])) ? 1 : 0) && w.lIIlIllIlII(Equipment.contains(item -> item.getName().contains(lIllIIlI[lIllIlII[56]])) ? 1 : 0)) {
                                        Inventory.getFirst(item -> item.getName().contains(lIllIIlI[lIllIlII[65]])).interact(lIllIIlI[lIllIlII[2]]);
                                    }
                                    if (w.lIIlIllIIll(Equipment.contains(item -> item.getName().contains(lIllIIlI[lIllIlII[64]])) ? 1 : 0) && w.lIIlIllIIIl(Players.getLocal().getAnimation(), lIllIlII[29])) {
                                        Equipment.getFirst(item -> item.getName().contains(lIllIIlI[lIllIlII[63]])).interact(lIllIIlI[lIllIlII[30]]);
                                        Time.sleepTicks((int)lIllIlII[7]);

                                    }
                                }
                                if (w.lIIlIllIIll(lIllIIlllllIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)di);

                                    Time.sleepTicks((int)lIllIlII[3]);

                                }
                            }
                            if (w.lIIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(di), lIllIlII[7])) {
                                AccBuilderBarrows.c = lIllIIlI[lIllIlII[31]];
                                if (w.lIIlIllIIll(Widgets.get((int)lIllIlII[32]).isEmpty() ? 1 : 0)) {
                                    String[] stringArray2 = new String[lIllIlII[3]];
                                    stringArray2[w.lIllIlII[4]] = lIllIIlI[lIllIlII[33]];
                                    NPCs.getNearest((String[])stringArray2).interact(lIllIIlI[lIllIlII[34]]);
                                    Time.sleepTicks((int)lIllIlII[12]);

                                }
                                if (w.lIIlIllIlII(Widgets.get((int)lIllIlII[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get((int)lIllIlII[32], (int)lIllIlII[35], (int)lIllIlII[3]).interact(lIllIIlI[lIllIlII[36]]);
                                    Time.sleepTicks((int)lIllIlII[1]);

                                }
                                int[] nArray3 = new int[lIllIlII[3]];
                                nArray3[w.lIllIlII[4]] = lIllIlII[22];
                                if (w.lIIlIllIIll(Inventory.contains((int[])nArray3) ? 1 : 0) && w.lIIlIllIlII(Widgets.get((int)lIllIlII[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get((int)lIllIlII[32], (int)lIllIlII[3], (int)lIllIlII[30]).interact(lIllIIlI[lIllIlII[35]]);
                                    Time.sleepTicks((int)lIllIlII[3]);

                                }
                            }
                        }
                    }
                    int[] nArray4 = new int[lIllIlII[3]];
                    nArray4[w.lIllIlII[4]] = lIllIlII[22];
                    if (w.lIIlIllIIll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        String[] stringArray = new String[lIllIlII[3]];
                        stringArray[w.lIllIlII[4]] = lIllIIlI[lIllIlII[37]];
                        if (w.lIIlIllIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            int[] nArray5 = new int[lIllIlII[3]];
                            nArray5[w.lIllIlII[4]] = lIllIlII[22];
                            if (w.lIIlIllIIll(Inventory.contains((int[])nArray5) ? 1 : 0) && w.lIIlIllIlII(Widgets.get((int)lIllIlII[32]).isEmpty() ? 1 : 0)) {
                                Widgets.get((int)lIllIlII[32], (int)lIllIlII[3], (int)lIllIlII[30]).interact(lIllIIlI[lIllIlII[38]]);
                                Time.sleepTicks((int)lIllIlII[3]);

                            }
                            int[] nArray6 = new int[lIllIlII[3]];
                            nArray6[w.lIllIlII[4]] = lIllIlII[18];
                            String[] stringArray3 = new String[lIllIlII[3]];
                            stringArray3[w.lIllIlII[4]] = lIllIIlI[lIllIlII[39]];
                            Inventory.getFirst((int[])nArray6).useOn(Inventory.getFirst((String[])stringArray3));
                            Time.sleepTicks((int)lIllIlII[1]);

                        }
                    }
                    String[] stringArray = new String[lIllIlII[3]];
                    stringArray[w.lIllIlII[4]] = lIllIIlI[lIllIlII[40]];
                    if (w.lIIlIllIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        if (w.lIIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(dh), lIllIlII[12])) {
                            if (w.lIIlIllIIll(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            if (w.lIIlIllIIll(Inventory.contains(item -> item.getName().contains(lIllIIlI[lIllIlII[62]])) ? 1 : 0) && w.lIIlIllIlII(Equipment.contains(item -> item.getName().contains(lIllIIlI[lIllIlII[61]])) ? 1 : 0)) {
                                Inventory.getFirst(item -> item.getName().contains(lIllIIlI[lIllIlII[60]])).interact(lIllIIlI[lIllIlII[41]]);
                                Time.sleepTicks((int)lIllIlII[1]);

                            }
                            Movement.walkTo((WorldPoint)dh);

                            Time.sleepTicks((int)lIllIlII[3]);

                        }
                        if (w.lIIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(dh), lIllIlII[12])) {
                            AccBuilderBarrows.c = lIllIIlI[lIllIlII[42]];
                            if (w.lIIlIllIIII(ci, lIllIlII[3])) {
                                Q.kX += lIllIlII[3];
                                Q.o(AccBuilderBarrows.m);
                                ci += lIllIlII[3];
                                Q.kX = lIllIlII[4];
                                cj = lIllIlII[4];
                            }
                            g.a(lIllIIlI[lIllIlII[43]], bX);
                        }
                    }
                }
                if (w.lIIlIllIIIl(e.j(lIllIlII[5]), lIllIlII[1])) {
                    String[] stringArray = new String[lIllIlII[3]];
                    stringArray[w.lIllIlII[4]] = lIllIIlI[lIllIlII[44]];
                    TileObjects.getNearest((String[])stringArray).interact(lIllIIlI[lIllIlII[45]]);
                    Time.sleepTicks((int)lIllIlII[1]);

                }
            }
        }
    }

    private static boolean lIIlIllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public int U() {
        try {
            System.out.println("678: " + e.j(lIllIlII[5]));
            w.bf();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((11 + 89 - -28 + 13 ^ 108 + 3 - -19 + 6) <= 0) {
            return (89 + 203 - 158 + 89 ^ 92 + 63 - 37 + 28) & (0x2A ^ 0x4E ^ (0xA7 ^ 0x8E) ^ -1);
        }
        return lIllIlII[57];
    }

    private static boolean lIIlIllIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIllIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean W() {
        boolean bl;
        if (w.lIIlIlllIlI(Quests.getState((Quest)Quest.RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST), QuestState.FINISHED)) {
            bl = lIllIlII[3];

            if (((0x6B ^ 0x37) & ~(0xD2 ^ 0x8E)) >= (2 ^ 6)) {
                return false;
            }
        } else {
            bl = lIllIlII[4];
        }
        return bl;
    }

    @Override
    public boolean T() {
        return lIllIlII[4];
    }

    private static boolean lIIlIllIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIlllIIl(Object object) {
        return object == null;
    }

        return String.valueOf(lIllIIllllIIlII);
    }

    private static void lIIlIlIllIl() {
        lIllIIlI = new String[lIllIlII[21]];
        w.lIllIIlI[w.lIllIlII[4]] = "Finished buying items, switching back to quest";
        w.lIllIIlI[w.lIllIlII[3]] = "Nav to bank";
        w.lIllIIlI[w.lIllIlII[1]] = "Handling banking";
        w.lIllIIlI[w.lIllIlII[12]] = "We are missing quest supplies, switching to BUYING";
        w.lIllIIlI[w.lIllIlII[7]] = "Drink";
        w.lIllIIlI[w.lIllIlII[15]] = "Nav to start";
        w.lIllIIlI[w.lIllIlII[17]] = "Handling dialog";
        w.lIllIIlI[w.lIllIlII[8]] = "Cook";
        w.lIllIIlI[w.lIllIlII[23]] = "Dirty blast";
        w.lIllIIlI[w.lIllIlII[24]] = "Nav to rotten tomato";
        w.lIllIIlI[w.lIllIlII[2]] = "Wear";
        w.lIllIIlI[w.lIllIlII[30]] = "PvP Arena";
        w.lIllIIlI[w.lIllIlII[31]] = "Getting tomato";
        w.lIllIIlI[w.lIllIlII[33]] = "Fadli";
        w.lIllIIlI[w.lIllIlII[34]] = "Buy";
        w.lIllIIlI[w.lIllIlII[36]] = "Buy 1";
        w.lIllIIlI[w.lIllIlII[35]] = "Close";
        w.lIllIIlI[w.lIllIlII[37]] = "Dirty blast";
        w.lIllIIlI[w.lIllIlII[38]] = "Close";
        w.lIllIIlI[w.lIllIlII[39]] = "Fruit blast";
        w.lIllIIlI[w.lIllIlII[40]] = "Dirty blast";
        w.lIllIIlI[w.lIllIlII[41]] = "Wear";
        w.lIllIIlI[w.lIllIlII[42]] = "Handling dialog";
        w.lIllIIlI[w.lIllIlII[43]] = "Cook";
        w.lIllIIlI[w.lIllIlII[44]] = "Door";
        w.lIllIIlI[w.lIllIlII[45]] = "Open";
        w.lIllIIlI[w.lIllIlII[46]] = "Aris";
        w.lIllIIlI[w.lIllIlII[47]] = "Entering room";
        w.lIllIIlI[w.lIllIlII[48]] = "Door";
        w.lIllIIlI[w.lIllIlII[0]] = "Open";
        w.lIllIIlI[w.lIllIlII[49]] = "Eye of newt";
        w.lIllIIlI[w.lIllIlII[50]] = "Fruit blast";
        w.lIllIIlI[w.lIllIlII[58]] = "RFD start quest";
        w.lIllIIlI[w.lIllIlII[59]] = "ring of wealth (";
        w.lIllIIlI[w.lIllIlII[60]] = "dueling";
        w.lIllIIlI[w.lIllIlII[61]] = "dueling";
        w.lIllIIlI[w.lIllIlII[62]] = "dueling";
        w.lIllIIlI[w.lIllIlII[63]] = "dueling";
        w.lIllIIlI[w.lIllIlII[64]] = "dueling";
        w.lIllIIlI[w.lIllIlII[65]] = "dueling";
        w.lIllIIlI[w.lIllIlII[56]] = "dueling";
        w.lIllIIlI[w.lIllIlII[66]] = "dueling";
        w.lIllIIlI[w.lIllIlII[71]] = "Can you make me a cake?";
        w.lIllIIlI[w.lIllIlII[72]] = "I'm always happy to help a cook in distress.";
        w.lIllIIlI[w.lIllIlII[73]] = "Actually, I know where to find this stuff.";
        w.lIllIIlI[w.lIllIlII[74]] = "Yes.";
        w.lIllIIlI[w.lIllIlII[75]] = "What's wrong?";
        w.lIllIIlI[w.lIllIlII[76]] = "Do you have any other quests for me?";
        w.lIllIIlI[w.lIllIlII[77]] = "Angry! It makes me angry!";
        w.lIllIIlI[w.lIllIlII[78]] = "What seems to be the problem?";
    }

    static {
        w.lIIlIlIllll();
        w.lIIlIlIllIl();
        dh = new WorldPoint(lIllIlII[67], lIllIlII[68], lIllIlII[4]);
        di = new WorldPoint(lIllIlII[69], lIllIlII[70], lIllIlII[4]);
        bB = new ArrayList<d>();
        String[] stringArray = new String[lIllIlII[23]];
        stringArray[w.lIllIlII[4]] = lIllIIlI[lIllIlII[71]];
        stringArray[w.lIllIlII[3]] = lIllIIlI[lIllIlII[72]];
        stringArray[w.lIllIlII[1]] = lIllIIlI[lIllIlII[73]];
        stringArray[w.lIllIlII[12]] = lIllIIlI[lIllIlII[74]];
        stringArray[w.lIllIlII[7]] = lIllIIlI[lIllIlII[75]];
        stringArray[w.lIllIlII[15]] = lIllIIlI[lIllIlII[76]];
        stringArray[w.lIllIlII[17]] = lIllIIlI[lIllIlII[77]];
        stringArray[w.lIllIlII[8]] = lIllIIlI[lIllIlII[78]];
        bX = stringArray;
    }

    private static boolean lIIlIlllIII(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public String V() {
        return lIllIIlI[lIllIlII[58]];
    }

    private static boolean lIIlIllIlIl(Object object) {
        return object != null;
    }

    private static boolean lIIlIllIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIlllIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlIllIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIllIllI(int n2) {
        return n2 > 0;
    }

    private static void ag() {
        block16: {
            d lIllIIlllllIIll;
            block15: {
                Object lIllIIlllllIlII;
                block14: {
                    block13: {
                        int[] nArray = new int[lIllIlII[3]];
                        nArray[w.lIllIlII[4]] = lIllIlII[19];
                        if (w.lIIlIllIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new DHelper(lIllIlII[19], lIllIlII[2], i.bw);
                            bB.add(d2);

                        }
                        int[] nArray2 = new int[lIllIlII[3]];
                        nArray2[w.lIllIlII[4]] = lIllIlII[11];
                        if (w.lIIlIllIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            lIllIIlllllIlII = new DHelper(lIllIlII[11], lIllIlII[3], lIllIlII[51]);
                            bB.add((DHelper) IllIIlllllIlII);

                        }
                        int[] nArray3 = new int[lIllIlII[3]];
                        nArray3[w.lIllIlII[4]] = lIllIlII[14];
                        if (w.lIIlIllIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            lIllIIlllllIlII = new DHelper(lIllIlII[14], lIllIlII[3], lIllIlII[51]);
                            bB.add((DHelper) IllIIlllllIlII);

                        }
                        int[] nArray4 = new int[lIllIlII[3]];
                        nArray4[w.lIllIlII[4]] = lIllIlII[18];
                        if (w.lIIlIllIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            lIllIIlllllIlII = new DHelper(lIllIlII[18], lIllIlII[3], lIllIlII[51]);
                            bB.add((DHelper) IllIIlllllIlII);

                        }
                        int[] nArray5 = new int[lIllIlII[3]];
                        nArray5[w.lIllIlII[4]] = lIllIlII[16];
                        if (w.lIIlIllIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            lIllIIlllllIlII = new DHelper(lIllIlII[16], lIllIlII[3], lIllIlII[51]);
                            bB.add((DHelper) IllIIlllllIlII);

                        }
                        int[] nArray6 = new int[lIllIlII[3]];
                        nArray6[w.lIllIlII[4]] = lIllIlII[13];
                        if (w.lIIlIllIlII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            lIllIIlllllIlII = new DHelper(lIllIlII[13], lIllIlII[3], lIllIlII[52]);
                            bB.add((DHelper) IllIIlllllIlII);

                        }
                        int[] nArray7 = new int[lIllIlII[3]];
                        nArray7[w.lIllIlII[4]] = lIllIlII[10];
                        if (!w.lIIlIllIIll(Bank.contains((int[])nArray7) ? 1 : 0)) break block13;
                        int[] nArray8 = new int[lIllIlII[3]];
                        nArray8[w.lIllIlII[4]] = lIllIlII[10];
                        if (!w.lIIlIllIIll(Bank.contains((int[])nArray8) ? 1 : 0)) break block14;
                        int[] nArray9 = new int[lIllIlII[3]];
                        nArray9[w.lIllIlII[4]] = lIllIlII[10];
                        if (!w.lIIlIllIIII(Bank.getFirst((int[])nArray9).getQuantity(), lIllIlII[2])) break block14;
                    }
                    lIllIIlllllIlII = new DHelper(lIllIlII[10], lIllIlII[2], lIllIlII[53]);
                    bB.add((DHelper) IllIIlllllIlII);

                }
                if (w.lIIlIllIlII(Bank.contains((Predicate)(lIllIIlllllIlII = item -> item.getName().toLowerCase().contains(lIllIIlI[lIllIlII[59]]))) ? 1 : 0)) {
                    lIllIIlllllIIll = new DHelper(lIllIlII[54], lIllIlII[15], lIllIlII[55]);
                    bB.add(lIllIIlllllIIll);

                }
                int[] nArray = new int[lIllIlII[3]];
                nArray[w.lIllIlII[4]] = lIllIlII[9];
                if (!w.lIIlIllIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block15;
                int[] nArray10 = new int[lIllIlII[3]];
                nArray10[w.lIllIlII[4]] = lIllIlII[9];
                if (!w.lIIlIllIIll(Bank.contains((int[])nArray10) ? 1 : 0)) break block16;
                int[] nArray11 = new int[lIllIlII[3]];
                nArray11[w.lIllIlII[4]] = lIllIlII[9];
                if (!w.lIIlIllIIII(Bank.getFirst((int[])nArray11).getQuantity(), lIllIlII[2])) break block16;
            }
            lIllIIlllllIIll = new DHelper(lIllIlII[9], lIllIlII[56], lIllIlII[52]);
            bB.add(lIllIIlllllIIll);

        }
    }

    public static void bg() {
        String[] stringArray = new String[lIllIlII[3]];
        stringArray[w.lIllIlII[4]] = lIllIIlI[lIllIlII[46]];
        if (w.lIIlIlllIIl(NPCs.getNearest((String[])stringArray))) {
            if (w.lIIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(dh), lIllIlII[12])) {
                if (w.lIIlIllIIll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                Movement.walkTo((WorldPoint)dh);

                Time.sleepTicks((int)lIllIlII[3]);

            }
            if (w.lIIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(dh), lIllIlII[12])) {
                AccBuilderBarrows.c = lIllIIlI[lIllIlII[47]];
                String[] stringArray2 = new String[lIllIlII[3]];
                stringArray2[w.lIllIlII[4]] = lIllIIlI[lIllIlII[48]];
                TileObjects.getNearest((String[])stringArray2).interact(lIllIIlI[lIllIlII[0]]);
                Time.sleepTicks((int)lIllIlII[1]);

            }
        }
    }
}

