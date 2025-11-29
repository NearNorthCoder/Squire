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
package gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.JHelper;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AGHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.ANHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.EHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.FHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.GHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.IHelper;
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

public class BHelper
implements W {
    static  boolean cm;
    public static final  WorldPoint dG;
    
    public static final  WorldPoint dF;
    public static  List<d> bv;

    public static  boolean bt;
    static  int cl;

    private static boolean lllIIllllll(Object object) {
        return object == null;
    }

    private static boolean lllIIllllII(int n2) {
        return n2 > 0;
    }

    private static boolean lllIIlllIll(Object object) {
        return object != null;
    }

    private static boolean lllIIllIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllIlIIIIII(Object object, Object object2) {
        return object == object2;
    }

    public static void bt() {
        String[] stringArray = new String[lIIIlIlll[3]];
        stringArray[B.lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[46]];
        if (B.lllIIllllll(NPCs.getNearest((String[])stringArray))) {
            if (B.lllIIllllIl(Players.getLocal().getWorldLocation().distanceTo(dF), lIIIlIlll[12])) {
                if (B.lllIIlllIIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                Movement.walkTo((WorldPoint)dF);

                Time.sleepTicks((int)lIIIlIlll[3]);

            }
            if (B.lllIIlllllI(Players.getLocal().getWorldLocation().distanceTo(dF), lIIIlIlll[12])) {
                AccBuilderEasyClues.c = lIIIlIlIl[lIIIlIlll[47]];
                String[] stringArray2 = new String[lIIIlIlll[3]];
                stringArray2[B.lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[48]];
                TileObjects.getNearest((String[])stringArray2).interact(lIIIlIlIl[lIIIlIlll[0]]);
                Time.sleepTicks((int)lIIIlIlll[1]);

            }
        }
    }

    private static boolean lllIIlllIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lllIIllIlII() {
        lIIIlIlIl = new String[lIIIlIlll[21]];
        B.lIIIlIlIl[B.lIIIlIlll[4]] = "Finished buying items, switching back to quest";
        B.lIIIlIlIl[B.lIIIlIlll[3]] = "Nav to bank";
        B.lIIIlIlIl[B.lIIIlIlll[1]] = "Handling banking";
        B.lIIIlIlIl[B.lIIIlIlll[12]] = "We are missing quest supplies, switching to BUYING";
        B.lIIIlIlIl[B.lIIIlIlll[7]] = "Drink";
        B.lIIIlIlIl[B.lIIIlIlll[15]] = "Nav to start";
        B.lIIIlIlIl[B.lIIIlIlll[17]] = "Handling dialog";
        B.lIIIlIlIl[B.lIIIlIlll[8]] = "Cook";
        B.lIIIlIlIl[B.lIIIlIlll[23]] = "Dirty blast";
        B.lIIIlIlIl[B.lIIIlIlll[24]] = "Nav to rotten tomato";
        B.lIIIlIlIl[B.lIIIlIlll[2]] = "Wear";
        B.lIIIlIlIl[B.lIIIlIlll[30]] = "PvP Arena";
        B.lIIIlIlIl[B.lIIIlIlll[31]] = "Getting tomato";
        B.lIIIlIlIl[B.lIIIlIlll[33]] = "Fadli";
        B.lIIIlIlIl[B.lIIIlIlll[34]] = "ȐҀ冼7";
        B.lIIIlIlIl[B.lIIIlIlll[36]] = "Buy 1";
        B.lIIIlIlIl[B.lIIIlIlll[35]] = "Close";
        B.lIIIlIlIl[B.lIIIlIlll[37]] = "Dirty blast";
        B.lIIIlIlIl[B.lIIIlIlll[38]] = "Close";
        B.lIIIlIlIl[B.lIIIlIlll[39]] = "Fruit blast";
        B.lIIIlIlIl[B.lIIIlIlll[40]] = "Dirty blast";
        B.lIIIlIlIl[B.lIIIlIlll[41]] = "Wear";
        B.lIIIlIlIl[B.lIIIlIlll[42]] = "Handling dialog";
        B.lIIIlIlIl[B.lIIIlIlll[43]] = "Cook";
        B.lIIIlIlIl[B.lIIIlIlll[44]] = "Door";
        B.lIIIlIlIl[B.lIIIlIlll[45]] = "Open";
        B.lIIIlIlIl[B.lIIIlIlll[46]] = "Aris";
        B.lIIIlIlIl[B.lIIIlIlll[47]] = "Entering room";
        B.lIIIlIlIl[B.lIIIlIlll[48]] = "Door";
        B.lIIIlIlIl[B.lIIIlIlll[0]] = "Open";
        B.lIIIlIlIl[B.lIIIlIlll[49]] = "Eye of newt";
        B.lIIIlIlIl[B.lIIIlIlll[50]] = "Fruit blast";
        B.lIIIlIlIl[B.lIIIlIlll[58]] = "RFD start quest";
        B.lIIIlIlIl[B.lIIIlIlll[59]] = "ring of wealth (";
        B.lIIIlIlIl[B.lIIIlIlll[60]] = "dueling";
        B.lIIIlIlIl[B.lIIIlIlll[61]] = "dueling";
        B.lIIIlIlIl[B.lIIIlIlll[62]] = "dueling";
        B.lIIIlIlIl[B.lIIIlIlll[63]] = "dueling";
        B.lIIIlIlIl[B.lIIIlIlll[64]] = "dueling";
        B.lIIIlIlIl[B.lIIIlIlll[65]] = "dueling";
        B.lIIIlIlIl[B.lIIIlIlll[56]] = "dueling";
        B.lIIIlIlIl[B.lIIIlIlll[66]] = "dueling";
        B.lIIIlIlIl[B.lIIIlIlll[71]] = "Can you make me a cake?";
        B.lIIIlIlIl[B.lIIIlIlll[72]] = "I'm always happy to help a cook in distress.";
        B.lIIIlIlIl[B.lIIIlIlll[73]] = "Actually, I know where to find this stuff.";
        B.lIIIlIlIl[B.lIIIlIlll[74]] = "Yes.";
        B.lIIIlIlIl[B.lIIIlIlll[75]] = "What's wrong?";
        B.lIIIlIlIl[B.lIIIlIlll[76]] = "Do you have any other quests for me?";
        B.lIIIlIlIl[B.lIIIlIlll[77]] = "Angry! It makes me angry!";
        B.lIIIlIlIl[B.lIIIlIlll[78]] = "What seems to be the problem?";
    }

    @Override
    public boolean V() {
        boolean bl;
        if (B.lllIlIIIIII(Quests.getState((Quest)Quest.RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST), QuestState.FINISHED)) {
            bl = lIIIlIlll[3];

            if (3 == ((0x6E ^ 0x61) & ~(0xBB ^ 0xB4))) {
                return false;
            }
        } else {
            bl = lIIIlIlll[4];
        }
        return bl;
    }

    @Override
    public int T() {
        try {
            System.out.println("678: " + e.j(lIIIlIlll[5]));
            B.bs();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIIIlIlll[57];
    }

    private static boolean lllIIlllllI(int n2, int n3) {
        return n2 <= n3;
    }

    public static void bs() {
        if (B.lllIIllIllI(e.j(lIIIlIlll[0]), lIIIlIlll[1])) {
            J.cc();
        }
        if (B.lllIIllIllI(Skills.getLevel((Skill)Skill.COOKING), lIIIlIlll[2]) && B.lllIIllIlll(e.j(lIIIlIlll[0]), lIIIlIlll[1])) {
            ag.dG();
        }
        if (B.lllIIlllIII(Skills.getLevel((Skill)Skill.COOKING), lIIIlIlll[2]) && B.lllIIllIlll(e.j(lIIIlIlll[0]), lIIIlIlll[1])) {
            if (B.lllIIlllIIl(bt ? 1 : 0)) {
                b.a(bv);
                if (B.lllIIllIllI(bv.size(), lIIIlIlll[3])) {
                    System.out.println(lIIIlIlIl[lIIIlIlll[4]]);
                    bt = lIIIlIlll[4];
                }
            }
            if (B.lllIIlllIlI(bt ? 1 : 0)) {
                BankLocation lIIIllllIIIllII;
                if (B.lllIIlllIlI(B.ab() ? 1 : 0) && B.lllIIlllIlI(e.j(lIIIlIlll[5]))) {
                    lIIIllllIIIllII = BankLocation.getNearest();
                    if (B.lllIIlllIll(lIIIllllIIIllII) && B.lllIIlllIlI(lIIIllllIIIllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIlIlIl[lIIIlIlll[3]];
                        a.a(lIIIllllIIIllII);
                    }
                    if (B.lllIIlllIll(lIIIllllIIIllII) && B.lllIIlllIIl(lIIIllllIIIllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (B.lllIIlllIlI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlIlll[6]);

                        }
                        if (B.lllIIlllIIl(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIIlIlIl[lIIIlIlll[1]];
                            if (B.lllIIllllII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIIlIlll[7]);

                            }
                            if (B.lllIIllllII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIIlIlll[1]);

                            }
                            int[] nArray = new int[lIIIlIlll[8]];
                            nArray[B.lIIIlIlll[4]] = lIIIlIlll[9];
                            nArray[B.lIIIlIlll[3]] = lIIIlIlll[10];
                            nArray[B.lIIIlIlll[1]] = lIIIlIlll[11];
                            nArray[B.lIIIlIlll[12]] = lIIIlIlll[13];
                            nArray[B.lIIIlIlll[7]] = lIIIlIlll[14];
                            nArray[B.lIIIlIlll[15]] = lIIIlIlll[16];
                            nArray[B.lIIIlIlll[17]] = lIIIlIlll[18];
                            if (B.lllIIlllIlI(e.b(nArray) ? 1 : 0)) {
                                B.af();
                                System.out.println(lIIIlIlIl[lIIIlIlll[12]]);
                                bt = lIIIlIlll[3];
                                return;
                            }
                            int[] nArray2 = new int[lIIIlIlll[8]];
                            nArray2[B.lIIIlIlll[4]] = lIIIlIlll[9];
                            nArray2[B.lIIIlIlll[3]] = lIIIlIlll[10];
                            nArray2[B.lIIIlIlll[1]] = lIIIlIlll[11];
                            nArray2[B.lIIIlIlll[12]] = lIIIlIlll[13];
                            nArray2[B.lIIIlIlll[7]] = lIIIlIlll[14];
                            nArray2[B.lIIIlIlll[15]] = lIIIlIlll[16];
                            nArray2[B.lIIIlIlll[17]] = lIIIlIlll[18];
                            if (B.lllIIlllIIl(e.b(nArray2) ? 1 : 0)) {
                                a.a(lIIIlIlll[9], lIIIlIlll[2]);
                                a.a(lIIIlIlll[10], lIIIlIlll[2]);
                                a.a(lIIIlIlll[11], lIIIlIlll[3]);
                                a.a(lIIIlIlll[13], lIIIlIlll[3]);
                                a.a(lIIIlIlll[14], lIIIlIlll[3]);
                                a.a(lIIIlIlll[16], lIIIlIlll[3]);
                                a.a(lIIIlIlll[18], lIIIlIlll[3]);
                                a.a(lIIIlIlll[19], lIIIlIlll[1]);
                                a.a(lIIIlIlll[20], lIIIlIlll[6]);
                            }
                        }
                    }
                }
                if (B.lllIIlllIIl(Inventory.contains((int[])f.aV) ? 1 : 0) && B.lllIIllIllI(Movement.getRunEnergy(), lIIIlIlll[21])) {
                    Inventory.getFirst((int[])f.aV).interact(lIIIlIlIl[lIIIlIlll[7]]);
                    Time.sleepTicks((int)lIIIlIlll[3]);

                }
                if (B.lllIIlllIlI(e.j(lIIIlIlll[5])) && B.lllIIlllIIl(B.ab() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIlIlIl[lIIIlIlll[15]];
                    if (B.lllIIllllIl(Players.getLocal().getWorldLocation().distanceTo(dF), lIIIlIlll[12])) {
                        if (B.lllIIlllIIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)dF);

                        Time.sleepTicks((int)lIIIlIlll[3]);

                    }
                    if (B.lllIIlllllI(Players.getLocal().getWorldLocation().distanceTo(dF), lIIIlIlll[12])) {
                        AccBuilderEasyClues.c = lIIIlIlIl[lIIIlIlll[17]];
                        g.a(lIIIlIlIl[lIIIlIlll[8]], bR);
                    }
                }
                if (B.lllIIllIlll(e.j(lIIIlIlll[5]), lIIIlIlll[3])) {
                    int[] nArray = new int[lIIIlIlll[3]];
                    nArray[B.lIIIlIlll[4]] = lIIIlIlll[22];
                    if (B.lllIIlllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIlIlll[3]];
                        stringArray[B.lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[23]];
                        if (B.lllIIlllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            cl = lIIIlIlll[4];
                            if (B.lllIIllllIl(Players.getLocal().getWorldLocation().distanceTo(dG), lIIIlIlll[7])) {
                                AccBuilderEasyClues.c = lIIIlIlIl[lIIIlIlll[24]];
                                lIIIllllIIIllII = new WorldArea(lIIIlIlll[25], lIIIlIlll[26], lIIIlIlll[27], lIIIlIlll[28], lIIIlIlll[4]);
                                if (B.lllIIlllIlI(lIIIllllIIIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (B.lllIIlllIIl(Inventory.contains(item -> item.getName().contains(lIIIlIlIl[lIIIlIlll[66]])) ? 1 : 0) && B.lllIIlllIlI(Equipment.contains(item -> item.getName().contains(lIIIlIlIl[lIIIlIlll[56]])) ? 1 : 0)) {
                                        Inventory.getFirst(item -> item.getName().contains(lIIIlIlIl[lIIIlIlll[65]])).interact(lIIIlIlIl[lIIIlIlll[2]]);
                                    }
                                    if (B.lllIIlllIIl(Equipment.contains(item -> item.getName().contains(lIIIlIlIl[lIIIlIlll[64]])) ? 1 : 0) && B.lllIIllIlll(Players.getLocal().getAnimation(), lIIIlIlll[29])) {
                                        Equipment.getFirst(item -> item.getName().contains(lIIIlIlIl[lIIIlIlll[63]])).interact(lIIIlIlIl[lIIIlIlll[30]]);
                                        Time.sleepTicks((int)lIIIlIlll[7]);

                                    }
                                }
                                if (B.lllIIlllIIl(lIIIllllIIIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)dG);

                                    Time.sleepTicks((int)lIIIlIlll[3]);

                                }
                            }
                            if (B.lllIIlllllI(Players.getLocal().getWorldLocation().distanceTo(dG), lIIIlIlll[7])) {
                                AccBuilderEasyClues.c = lIIIlIlIl[lIIIlIlll[31]];
                                if (B.lllIIlllIIl(Widgets.get((int)lIIIlIlll[32]).isEmpty() ? 1 : 0)) {
                                    String[] stringArray2 = new String[lIIIlIlll[3]];
                                    stringArray2[B.lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[33]];
                                    NPCs.getNearest((String[])stringArray2).interact(lIIIlIlIl[lIIIlIlll[34]]);
                                    Time.sleepTicks((int)lIIIlIlll[12]);

                                }
                                if (B.lllIIlllIlI(Widgets.get((int)lIIIlIlll[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get((int)lIIIlIlll[32], (int)lIIIlIlll[35], (int)lIIIlIlll[3]).interact(lIIIlIlIl[lIIIlIlll[36]]);
                                    Time.sleepTicks((int)lIIIlIlll[1]);

                                }
                                int[] nArray3 = new int[lIIIlIlll[3]];
                                nArray3[B.lIIIlIlll[4]] = lIIIlIlll[22];
                                if (B.lllIIlllIIl(Inventory.contains((int[])nArray3) ? 1 : 0) && B.lllIIlllIlI(Widgets.get((int)lIIIlIlll[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get((int)lIIIlIlll[32], (int)lIIIlIlll[3], (int)lIIIlIlll[30]).interact(lIIIlIlIl[lIIIlIlll[35]]);
                                    Time.sleepTicks((int)lIIIlIlll[3]);

                                }
                            }
                        }
                    }
                    int[] nArray4 = new int[lIIIlIlll[3]];
                    nArray4[B.lIIIlIlll[4]] = lIIIlIlll[22];
                    if (B.lllIIlllIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIlIlll[3]];
                        stringArray[B.lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[37]];
                        if (B.lllIIlllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            int[] nArray5 = new int[lIIIlIlll[3]];
                            nArray5[B.lIIIlIlll[4]] = lIIIlIlll[22];
                            if (B.lllIIlllIIl(Inventory.contains((int[])nArray5) ? 1 : 0) && B.lllIIlllIlI(Widgets.get((int)lIIIlIlll[32]).isEmpty() ? 1 : 0)) {
                                Widgets.get((int)lIIIlIlll[32], (int)lIIIlIlll[3], (int)lIIIlIlll[30]).interact(lIIIlIlIl[lIIIlIlll[38]]);
                                Time.sleepTicks((int)lIIIlIlll[3]);

                            }
                            int[] nArray6 = new int[lIIIlIlll[3]];
                            nArray6[B.lIIIlIlll[4]] = lIIIlIlll[18];
                            String[] stringArray3 = new String[lIIIlIlll[3]];
                            stringArray3[B.lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[39]];
                            Inventory.getFirst((int[])nArray6).useOn(Inventory.getFirst((String[])stringArray3));
                            Time.sleepTicks((int)lIIIlIlll[1]);

                        }
                    }
                    String[] stringArray = new String[lIIIlIlll[3]];
                    stringArray[B.lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[40]];
                    if (B.lllIIlllIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        if (B.lllIIllllIl(Players.getLocal().getWorldLocation().distanceTo(dF), lIIIlIlll[12])) {
                            if (B.lllIIlllIIl(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            if (B.lllIIlllIIl(Inventory.contains(item -> item.getName().contains(lIIIlIlIl[lIIIlIlll[62]])) ? 1 : 0) && B.lllIIlllIlI(Equipment.contains(item -> item.getName().contains(lIIIlIlIl[lIIIlIlll[61]])) ? 1 : 0)) {
                                Inventory.getFirst(item -> item.getName().contains(lIIIlIlIl[lIIIlIlll[60]])).interact(lIIIlIlIl[lIIIlIlll[41]]);
                                Time.sleepTicks((int)lIIIlIlll[1]);

                            }
                            Movement.walkTo((WorldPoint)dF);

                            Time.sleepTicks((int)lIIIlIlll[3]);

                        }
                        if (B.lllIIlllllI(Players.getLocal().getWorldLocation().distanceTo(dF), lIIIlIlll[12])) {
                            AccBuilderEasyClues.c = lIIIlIlIl[lIIIlIlll[42]];
                            if (B.lllIIllIllI(cl, lIIIlIlll[3])) {
                                an.om += lIIIlIlll[3];
                                an.o(AccBuilderEasyClues.m);
                                cl += lIIIlIlll[3];
                                an.om = lIIIlIlll[4];
                                cm = lIIIlIlll[4];
                            }
                            g.a(lIIIlIlIl[lIIIlIlll[43]], bR);
                        }
                    }
                }
                if (B.lllIIllIlll(e.j(lIIIlIlll[5]), lIIIlIlll[1])) {
                    String[] stringArray = new String[lIIIlIlll[3]];
                    stringArray[B.lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[44]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIlIl[lIIIlIlll[45]]);
                    Time.sleepTicks((int)lIIIlIlll[1]);

                }
            }
        }
    }

    private static boolean lllIIllllIl(int n2, int n3) {
        return n2 > n3;
    }

        return String.valueOf(lIIIlllIllIllII);
    }

    private static boolean lllIIllIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void af() {
        block16: {
            d lIIIllllIIIlIII;
            block15: {
                Object lIIIllllIIIlIIl;
                block14: {
                    block13: {
                        int[] nArray = new int[lIIIlIlll[3]];
                        nArray[B.lIIIlIlll[4]] = lIIIlIlll[19];
                        if (B.lllIIlllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new DHelper(lIIIlIlll[19], lIIIlIlll[2], i.bq);
                            bv.add(d2);

                        }
                        int[] nArray2 = new int[lIIIlIlll[3]];
                        nArray2[B.lIIIlIlll[4]] = lIIIlIlll[11];
                        if (B.lllIIlllIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            lIIIllllIIIlIIl = new DHelper(lIIIlIlll[11], lIIIlIlll[3], lIIIlIlll[51]);
                            bv.add((DHelper) IIIllllIIIlIIl);

                        }
                        int[] nArray3 = new int[lIIIlIlll[3]];
                        nArray3[B.lIIIlIlll[4]] = lIIIlIlll[14];
                        if (B.lllIIlllIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            lIIIllllIIIlIIl = new DHelper(lIIIlIlll[14], lIIIlIlll[3], lIIIlIlll[51]);
                            bv.add((DHelper) IIIllllIIIlIIl);

                        }
                        int[] nArray4 = new int[lIIIlIlll[3]];
                        nArray4[B.lIIIlIlll[4]] = lIIIlIlll[18];
                        if (B.lllIIlllIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            lIIIllllIIIlIIl = new DHelper(lIIIlIlll[18], lIIIlIlll[3], lIIIlIlll[51]);
                            bv.add((DHelper) IIIllllIIIlIIl);

                        }
                        int[] nArray5 = new int[lIIIlIlll[3]];
                        nArray5[B.lIIIlIlll[4]] = lIIIlIlll[16];
                        if (B.lllIIlllIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            lIIIllllIIIlIIl = new DHelper(lIIIlIlll[16], lIIIlIlll[3], lIIIlIlll[51]);
                            bv.add((DHelper) IIIllllIIIlIIl);

                        }
                        int[] nArray6 = new int[lIIIlIlll[3]];
                        nArray6[B.lIIIlIlll[4]] = lIIIlIlll[13];
                        if (B.lllIIlllIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            lIIIllllIIIlIIl = new DHelper(lIIIlIlll[13], lIIIlIlll[3], lIIIlIlll[52]);
                            bv.add((DHelper) IIIllllIIIlIIl);

                        }
                        int[] nArray7 = new int[lIIIlIlll[3]];
                        nArray7[B.lIIIlIlll[4]] = lIIIlIlll[10];
                        if (!B.lllIIlllIIl(Bank.contains((int[])nArray7) ? 1 : 0)) break block13;
                        int[] nArray8 = new int[lIIIlIlll[3]];
                        nArray8[B.lIIIlIlll[4]] = lIIIlIlll[10];
                        if (!B.lllIIlllIIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block14;
                        int[] nArray9 = new int[lIIIlIlll[3]];
                        nArray9[B.lIIIlIlll[4]] = lIIIlIlll[10];
                        if (!B.lllIIllIllI(Bank.getFirst((int[])nArray9).getQuantity(), lIIIlIlll[2])) break block14;
                    }
                    lIIIllllIIIlIIl = new DHelper(lIIIlIlll[10], lIIIlIlll[2], lIIIlIlll[53]);
                    bv.add((DHelper) IIIllllIIIlIIl);

                }
                if (B.lllIIlllIlI(Bank.contains((Predicate)(lIIIllllIIIlIIl = item -> item.getName().toLowerCase().contains(lIIIlIlIl[lIIIlIlll[59]]))) ? 1 : 0)) {
                    lIIIllllIIIlIII = new DHelper(lIIIlIlll[54], lIIIlIlll[15], lIIIlIlll[55]);
                    bv.add(lIIIllllIIIlIII);

                }
                int[] nArray = new int[lIIIlIlll[3]];
                nArray[B.lIIIlIlll[4]] = lIIIlIlll[9];
                if (!B.lllIIlllIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block15;
                int[] nArray10 = new int[lIIIlIlll[3]];
                nArray10[B.lIIIlIlll[4]] = lIIIlIlll[9];
                if (!B.lllIIlllIIl(Bank.contains((int[])nArray10) ? 1 : 0)) break block16;
                int[] nArray11 = new int[lIIIlIlll[3]];
                nArray11[B.lIIIlIlll[4]] = lIIIlIlll[9];
                if (!B.lllIIllIllI(Bank.getFirst((int[])nArray11).getQuantity(), lIIIlIlll[2])) break block16;
            }
            lIIIllllIIIlIII = new DHelper(lIIIlIlll[9], lIIIlIlll[56], lIIIlIlll[52]);
            bv.add(lIIIllllIIIlIII);

        }
    }

    @Override
    public String U() {
        return lIIIlIlIl[lIIIlIlll[58]];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        String[] stringArray = new String[lIIIlIlll[3]];
        stringArray[B.lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[49]];
        if (B.lllIIllllII(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[lIIIlIlll[3]];
            nArray[B.lIIIlIlll[4]] = lIIIlIlll[14];
            if (B.lllIIllllII(Inventory.getCount((int[])nArray))) {
                String[] stringArray2 = new String[lIIIlIlll[3]];
                stringArray2[B.lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[50]];
                if (B.lllIIlllIIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    int[] nArray2 = new int[lIIIlIlll[3]];
                    nArray2[B.lIIIlIlll[4]] = lIIIlIlll[18];
                    if (B.lllIIlllIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                        int[] nArray3 = new int[lIIIlIlll[3]];
                        nArray3[B.lIIIlIlll[4]] = lIIIlIlll[11];
                        if (B.lllIIlllIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            n2 = lIIIlIlll[3];

                            if (1 >= 0) return n2 != 0;
                            return (1 & (1 ^ -1)) != 0;
                        }
                    }
                }
            }
        }
        n2 = lIIIlIlll[4];
        return n2 != 0;
    }

    @Override
    public boolean S() {
        return lIIIlIlll[4];
    }

    static {
        B.lllIIllIlIl();
        B.lllIIllIlII();
        dF = new WorldPoint(lIIIlIlll[67], lIIIlIlll[68], lIIIlIlll[4]);
        dG = new WorldPoint(lIIIlIlll[69], lIIIlIlll[70], lIIIlIlll[4]);
        bv = new ArrayList<d>();
        String[] stringArray = new String[lIIIlIlll[23]];
        stringArray[B.lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[71]];
        stringArray[B.lIIIlIlll[3]] = lIIIlIlIl[lIIIlIlll[72]];
        stringArray[B.lIIIlIlll[1]] = lIIIlIlIl[lIIIlIlll[73]];
        stringArray[B.lIIIlIlll[12]] = lIIIlIlIl[lIIIlIlll[74]];
        stringArray[B.lIIIlIlll[7]] = lIIIlIlIl[lIIIlIlll[75]];
        stringArray[B.lIIIlIlll[15]] = lIIIlIlIl[lIIIlIlll[76]];
        stringArray[B.lIIIlIlll[17]] = lIIIlIlIl[lIIIlIlll[77]];
        stringArray[B.lIIIlIlll[8]] = lIIIlIlIl[lIIIlIlll[78]];
        bR = stringArray;
    }

    private static boolean lllIIlllIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIlllIlI(int n2) {
        return n2 == 0;
    }
}

