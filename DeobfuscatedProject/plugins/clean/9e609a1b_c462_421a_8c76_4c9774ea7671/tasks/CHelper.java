/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarPlayer
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.PHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.AHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.BHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.DHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.EHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.FHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.GHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.HHelper;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import net.unethicalite.api.quests.QuestVarPlayer;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class CHelper
implements M {
    public static  List<d> bA;
    private static final  WorldPoint gO;
    public static final  String[] gL;
    private static  boolean gU;
    private static  boolean gT;
    private static final  WorldPoint gN;
    static  int bY;
    private static  boolean gX;
    private static final  WorldPoint gS;
    private static final  WorldPoint gP;
    private static  boolean gV;
    private static final  WorldPoint gR;
    
    private static final  WorldPoint gQ;
    private static final  WorldPoint gM;
    
    public static  boolean by;
    static  boolean cp;
    private static  boolean gW;
    static  int co;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean S() {
        int n2;
        int[] nArray = new int[lIIIllllIllll[1]];
        nArray[C.lIIIllllIllll[0]] = lIIIllllIllll[14];
        if (C.lIlIIllIIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            String[] stringArray = new String[lIIIllllIllll[1]];
            stringArray[C.lIIIllllIllll[0]] = lIIIllllIlllI[lIIIllllIllll[62]];
            if (C.lIlIIllIIIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIIllllIllll[1]];
                nArray2[C.lIIIllllIllll[0]] = lIIIllllIllll[11];
                if (C.lIlIIllIIIIlIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    n2 = lIIIllllIllll[1];

                    if (1 != (0x4C ^ 0x48)) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = lIIIllllIllll[0];
        return n2 != 0;
    }

    private static void lIlIIllIIIIIlll() {
        lIIIllllIlllI = new String[lIIIllllIllll[111]];
        C.lIIIllllIlllI[C.lIIIllllIllll[0]] = "Buying items";
        C.lIIIllllIlllI[C.lIIIllllIllll[1]] = "Finished buying items, switching back to quest";
        C.lIIIllllIlllI[C.lIIIllllIllll[3]] = "Drink";
        C.lIIIllllIlllI[C.lIIIllllIllll[5]] = "Eat";
        C.lIIIllllIlllI[C.lIIIllllIllll[6]] = "Nav to bank";
        C.lIIIllllIlllI[C.lIIIllllIllll[7]] = "Handling banking";
        C.lIIIllllIlllI[C.lIIIllllIllll[9]] = "We are missing quest supplies, switching to BUYING";
        C.lIIIllllIlllI[C.lIIIllllIllll[21]] = "Nav to start";
        C.lIIIllllIlllI[C.lIIIllllIllll[20]] = "Interact npc";
        C.lIIIllllIlllI[C.lIIIllllIllll[22]] = "Redbeard Frank";
        C.lIIIllllIlllI[C.lIIIllllIllll[16]] = "Nav to luthas";
        C.lIIIllllIlllI[C.lIIIllllIllll[23]] = "Talk luthas";
        C.lIIIllllIlllI[C.lIIIllllIllll[24]] = "Luthas";
        C.lIIIllllIlllI[C.lIIIllllIllll[25]] = "the crate isn't";
        C.lIIIllllIlllI[C.lIIIllllIllll[26]] = "Nav to Zembo";
        C.lIIIllllIlllI[C.lIIIllllIllll[27]] = "Buy rum";
        C.lIIIllllIlllI[C.lIIIllllIllll[29]] = "Zembo";
        C.lIIIllllIlllI[C.lIIIllllIllll[30]] = "Trade";
        C.lIIIllllIlllI[C.lIIIllllIllll[31]] = "Buy 1";
        C.lIIIllllIlllI[C.lIIIllllIllll[33]] = "Nav to luthas";
        C.lIIIllllIlllI[C.lIIIllllIllll[34]] = "Filling crate";
        C.lIIIllllIlllI[C.lIIIllllIllll[35]] = "Crate";
        C.lIIIllllIlllI[C.lIIIllllIllll[36]] = "Fill";
        C.lIIIllllIlllI[C.lIIIllllIllll[37]] = "Finishing job";
        C.lIIIllllIlllI[C.lIIIllllIllll[38]] = "Luthas";
        C.lIIIllllIlllI[C.lIIIllllIllll[39]] = "be on my way";
        C.lIIIllllIlllI[C.lIIIllllIllll[40]] = "Nav to wydin";
        C.lIIIllllIlllI[C.lIIIllllIllll[41]] = "Wear";
        C.lIIIllllIlllI[C.lIIIllllIllll[42]] = "Wydin";
        C.lIIIllllIlllI[C.lIIIllllIllll[43]] = "can I work out front";
        C.lIIIllllIlllI[C.lIIIllllIllll[46]] = "Nav to rum";
        C.lIIIllllIlllI[C.lIIIllllIllll[48]] = "Search";
        C.lIIIllllIlllI[C.lIIIllllIllll[49]] = "Nav to start";
        C.lIIIllllIlllI[C.lIIIllllIllll[50]] = "Interact npc";
        C.lIIIllllIlllI[C.lIIIllllIllll[51]] = "Redbeard Frank";
        C.lIIIllllIlllI[C.lIIIllllIllll[52]] = "Nav to chest";
        C.lIIIllllIlllI[C.lIIIllllIllll[53]] = "Getting message";
        C.lIIIllllIlllI[C.lIIIllllIllll[56]] = "Chest";
        C.lIIIllllIlllI[C.lIIIllllIllll[57]] = "Read";
        C.lIIIllllIlllI[C.lIIIllllIllll[58]] = "Nav to dig spot";
        C.lIIIllllIlllI[C.lIIIllllIllll[59]] = "Digging";
        C.lIIIllllIlllI[C.lIIIllllIllll[60]] = "Spade";
        C.lIIIllllIlllI[C.lIIIllllIllll[61]] = "Dig";
        C.lIIIllllIlllI[C.lIIIllllIllll[62]] = "Spade";
        C.lIIIllllIlllI[C.lIIIllllIllll[72]] = "Pirates treasure quest";
        C.lIIIllllIlllI[C.lIIIllllIllll[73]] = "ring of wealth (";
        C.lIIIllllIlllI[C.lIIIllllIllll[74]] = "Fill";
        C.lIIIllllIlllI[C.lIIIllllIllll[75]] = "Ok, I'm up for an adventure.";
        C.lIIIllllIlllI[C.lIIIllllIllll[76]] = "A glass of your finest ale please.";
        C.lIIIllllIlllI[C.lIIIllllIllll[77]] = "Morgan needs your help!";
        C.lIIIllllIlllI[C.lIIIllllIllll[78]] = "Yes.";
        C.lIIIllllIlllI[C.lIIIllllIllll[79]] = "I'm looking for a quest!";
        C.lIIIllllIlllI[C.lIIIllllIllll[80]] = "Ok, let me help then.";
        C.lIIIllllIlllI[C.lIIIllllIllll[81]] = "Father Aereck sent me to talk to you.";
        C.lIIIllllIlllI[C.lIIIllllIllll[82]] = "He's got a ghost haunting his graveyard.";
        C.lIIIllllIlllI[C.lIIIllllIllll[83]] = "Yep, now tell me what the problem is.";
        C.lIIIllllIlllI[C.lIIIllllIllll[84]] = "Sure.";
        C.lIIIllllIlllI[C.lIIIllllIllll[85]] = "I'm wearing an amulet of ghost speak!";
        C.lIIIllllIlllI[C.lIIIllllIllll[86]] = "Yes, I'm sure.";
        C.lIIIllllIlllI[C.lIIIllllIllll[87]] = "How can I help?";
        C.lIIIllllIlllI[C.lIIIllllIllll[88]] = "I'm looking for a quest.";
        C.lIIIllllIlllI[C.lIIIllllIllll[89]] = "I'm in search of treasure.";
        C.lIIIllllIlllI[C.lIIIllllIllll[90]] = "Yes.";
        C.lIIIllllIlllI[C.lIIIllllIllll[91]] = "Could you offer me employment on your plantation?";
        C.lIIIllllIlllI[C.lIIIllllIllll[92]] = "Thank you, I'll be on my way";
        C.lIIIllllIlllI[C.lIIIllllIllll[93]] = "Can I get a job here?";
        C.lIIIllllIlllI[C.lIIIllllIllll[94]] = "Can I journey on this ship?";
        C.lIIIllllIlllI[C.lIIIllllIllll[95]] = "Search away, I have nothing to hide.";
        C.lIIIllllIlllI[C.lIIIllllIllll[96]] = "Ok.";
    }

    public static void cg() {
        if (C.lIlIIllIIIIlIlI(by ? 1 : 0)) {
            AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[0]];
            b.a(bA);
            if (C.lIlIIllIIIIlIll(bA.size(), lIIIllllIllll[1])) {
                System.out.println(lIIIllllIlllI[lIIIllllIllll[1]]);
                by = lIIIllllIllll[0];
            }
        }
        if (C.lIlIIllIIIIllII(by ? 1 : 0)) {
            Object var1;
            if (C.lIlIIllIIIIlIlI(Inventory.contains((int[])f.ba) ? 1 : 0) && C.lIlIIllIIIIlIll(Movement.getRunEnergy(), lIIIllllIllll[2])) {
                Inventory.getFirst((int[])f.ba).interact(lIIIllllIlllI[lIIIllllIllll[3]]);
                Time.sleepTicks((int)lIIIllllIllll[1]);

            }
            if (C.lIlIIllIIIIllIl(C.lIlIIllIIIIlIIl(e.v(), 70.0))) {
                int[] nArray = new int[lIIIllllIllll[1]];
                nArray[C.lIIIllllIllll[0]] = lIIIllllIllll[4];
                if (C.lIlIIllIIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIIIllllIllll[1]];
                    nArray2[C.lIIIllllIllll[0]] = lIIIllllIllll[4];
                    Inventory.getFirst((int[])nArray2).interact(lIIIllllIlllI[lIIIllllIllll[5]]);
                }
            }
            if (C.lIlIIllIIIIllII(Movement.isRunEnabled() ? 1 : 0) && C.lIlIIllIIIIlllI(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (C.lIlIIllIIIIllII(C.S() ? 1 : 0) && C.lIlIIllIIIIllII(Vars.getVarp((int)QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()))) {
                var1 = BankLocation.getNearest();
                if (C.lIlIIllIIIIllll(var1) && C.lIlIIllIIIIllII(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[6]];
                    a.a((BankLocation)var1);
                    Time.sleepTicks((int)lIIIllllIllll[3]);

                }
                if (C.lIlIIllIIIIllll(var1) && C.lIlIIllIIIIlIlI(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[7]];
                    if (C.lIlIIllIIIIllII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIllllIllll[8]);

                    }
                    if (C.lIlIIllIIIIlIlI(Bank.isOpen() ? 1 : 0)) {
                        if (C.lIlIIllIIIIlllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIllllIllll[6]);

                        }
                        if (C.lIlIIllIIIIlllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIllllIllll[3]);

                        }
                        int[] nArray = new int[lIIIllllIllll[9]];
                        nArray[C.lIIIllllIllll[0]] = lIIIllllIllll[10];
                        nArray[C.lIIIllllIllll[1]] = lIIIllllIllll[11];
                        nArray[C.lIIIllllIllll[3]] = lIIIllllIllll[12];
                        nArray[C.lIIIllllIllll[5]] = lIIIllllIllll[13];
                        nArray[C.lIIIllllIllll[6]] = lIIIllllIllll[14];
                        nArray[C.lIIIllllIllll[7]] = lIIIllllIllll[15];
                        if (C.lIlIIllIIIIllII(e.b(nArray) ? 1 : 0)) {
                            C.W();
                            System.out.println(lIIIllllIlllI[lIIIllllIllll[9]]);
                            by = lIIIllllIllll[1];
                            return;
                        }
                        Bank.withdraw((int)lIIIllllIllll[11], (int)lIIIllllIllll[16], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIllllIllll[1]);

                        Bank.withdraw((int)lIIIllllIllll[15], (int)lIIIllllIllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIllllIllll[1]);

                        Bank.withdraw((int)lIIIllllIllll[14], (int)lIIIllllIllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIllllIllll[1]);

                        Bank.withdraw((int)lIIIllllIllll[17], (int)lIIIllllIllll[16], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIllllIllll[1]);

                        Bank.withdraw((int)lIIIllllIllll[13], (int)lIIIllllIllll[7], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIllllIllll[1]);

                        Bank.withdraw((int)lIIIllllIllll[10], (int)lIIIllllIllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIllllIllll[1]);

                        a.a(lIIIllllIllll[18], lIIIllllIllll[19]);
                        a.b(f.ba, lIIIllllIllll[3]);
                        a.b(f.bk, lIIIllllIllll[1]);
                    }
                }
            }
            if (C.lIlIIllIIIIlIlI(C.S() ? 1 : 0) && C.lIlIIllIIIIllII(Vars.getVarp((int)QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()))) {
                if (C.lIlIIllIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(gM), lIIIllllIllll[20])) {
                    AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[21]];
                    if (C.lIlIIllIIIIlIlI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)gM);

                    Time.sleepTicks((int)lIIIllllIllll[1]);

                }
                if (C.lIlIIllIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(gM), lIIIllllIllll[20])) {
                    AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[20]];
                    g.a(lIIIllllIlllI[lIIIllllIllll[22]], gL);
                }
            }
            if (C.lIlIIllIIIlIIlI(Vars.getVarp((int)QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()), lIIIllllIllll[1])) {
                int var2;
                co = lIIIllllIllll[0];
                if (C.lIlIIllIIIIllII(gT ? 1 : 0)) {
                    if (C.lIlIIllIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(gN), lIIIllllIllll[5])) {
                        AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[16]];
                        Movement.walkTo((WorldPoint)gN);

                        Time.sleepTicks((int)lIIIllllIllll[1]);

                    }
                    if (C.lIlIIllIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(gN), lIIIllllIllll[5])) {
                        AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[23]];
                        g.a(lIIIllllIlllI[lIIIllllIllll[24]], gL);
                        var1 = Dialog.getOptions();
                        if (C.lIlIIllIIIIllII(var1.isEmpty() ? 1 : 0)) {
                            var2 = lIIIllllIllll[0];
                            while (C.lIlIIllIIIIlIll(var2, var1.size())) {
                                if (C.lIlIIllIIIIlIlI(((Widget)var1.get(var2)).getText().contains(lIIIllllIlllI[lIIIllllIllll[25]]) ? 1 : 0)) {
                                    gT = lIIIllllIllll[1];
                                }
                                ++var2;

                                if (-3 < 0) continue;
                                return;
                            }
                        }
                    }
                }
                if (C.lIlIIllIIIIlIlI(gT ? 1 : 0) && C.lIlIIllIIIIllII(gV ? 1 : 0)) {
                    if (C.lIlIIllIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(gO), lIIIllllIllll[20])) {
                        AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[26]];
                        Movement.walkTo((WorldPoint)gO);

                        Time.sleepTicks((int)lIIIllllIllll[1]);

                    }
                    if (C.lIlIIllIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(gO), lIIIllllIllll[20])) {
                        AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[27]];
                        var1 = Widgets.get((int)lIIIllllIllll[28], (int)lIIIllllIllll[29], (int)lIIIllllIllll[3]);
                        if (C.lIlIIllIIIlIIll(var1)) {
                            String[] stringArray = new String[lIIIllllIllll[1]];
                            stringArray[C.lIIIllllIllll[0]] = lIIIllllIlllI[lIIIllllIllll[29]];
                            NPCs.getNearest((String[])stringArray).interact(lIIIllllIlllI[lIIIllllIllll[30]]);
                            Time.sleepTicks((int)lIIIllllIllll[3]);

                        }
                        if (C.lIlIIllIIIIllll(var1)) {
                            var1.interact(lIIIllllIlllI[lIIIllllIllll[31]]);
                            Time.sleepTicks((int)lIIIllllIllll[1]);

                        }
                    }
                    int[] nArray = new int[lIIIllllIllll[1]];
                    nArray[C.lIIIllllIllll[0]] = lIIIllllIllll[32];
                    if (C.lIlIIllIIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        gV = lIIIllllIllll[1];
                    }
                }
                if (C.lIlIIllIIIIlIlI(gT ? 1 : 0) && C.lIlIIllIIIIlIlI(gV ? 1 : 0) && C.lIlIIllIIIIllII(gU ? 1 : 0)) {
                    if (C.lIlIIllIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(gN), lIIIllllIllll[9])) {
                        AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[33]];
                        Movement.walkTo((WorldPoint)gN);

                        Time.sleepTicks((int)lIIIllllIllll[1]);

                    }
                    if (C.lIlIIllIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(gN), lIIIllllIllll[9])) {
                        AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[34]];
                        int[] nArray = new int[lIIIllllIllll[1]];
                        nArray[C.lIIIllllIllll[0]] = lIIIllllIllll[11];
                        if (C.lIlIIllIIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            String[] stringArray = new String[lIIIllllIllll[1]];
                            stringArray[C.lIIIllllIllll[0]] = lIIIllllIlllI[lIIIllllIllll[35]];
                            TileObjects.getNearest((String[])stringArray).interact(lIIIllllIlllI[lIIIllllIllll[36]]);
                            Time.sleepTicks((int)lIIIllllIllll[5]);

                        }
                        int[] nArray3 = new int[lIIIllllIllll[1]];
                        nArray3[C.lIIIllllIllll[0]] = lIIIllllIllll[11];
                        if (C.lIlIIllIIIIllII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[lIIIllllIllll[1]];
                            nArray4[C.lIIIllllIllll[0]] = lIIIllllIllll[32];
                            Inventory.getFirst((int[])nArray4).useOn(TileObjects.getNearest(tileObject -> {
                                String[] stringArray = new String[lIIIllllIllll[1]];
                                stringArray[C.lIIIllllIllll[0]] = lIIIllllIlllI[lIIIllllIllll[74]];
                                return tileObject.hasAction(stringArray);
                            }));
                            Time.sleepTicks((int)lIIIllllIllll[5]);

                        }
                        int[] nArray5 = new int[lIIIllllIllll[1]];
                        nArray5[C.lIIIllllIllll[0]] = lIIIllllIllll[11];
                        if (C.lIlIIllIIIIllII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                            int[] nArray6 = new int[lIIIllllIllll[1]];
                            nArray6[C.lIIIllllIllll[0]] = lIIIllllIllll[32];
                            if (C.lIlIIllIIIIllII(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                                gU = lIIIllllIllll[1];
                            }
                        }
                    }
                }
                if (C.lIlIIllIIIIlIlI(gU ? 1 : 0) && C.lIlIIllIIIIlIlI(gT ? 1 : 0) && C.lIlIIllIIIIlIlI(gV ? 1 : 0) && C.lIlIIllIIIIllII(gW ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[37]];
                    g.a(lIIIllllIlllI[lIIIllllIllll[38]], gL);
                    var1 = Dialog.getText();
                    if (C.lIlIIllIIIIllll(var1) && C.lIlIIllIIIIlIlI(((String)var1).contains(lIIIllllIlllI[lIIIllllIllll[39]]) ? 1 : 0)) {
                        gW = lIIIllllIllll[1];
                    }
                }
                if (C.lIlIIllIIIIlIlI(gU ? 1 : 0) && C.lIlIIllIIIIlIlI(gT ? 1 : 0) && C.lIlIIllIIIIlIlI(gV ? 1 : 0) && C.lIlIIllIIIIlIlI(gW ? 1 : 0) && C.lIlIIllIIIIllII(gX ? 1 : 0)) {
                    if (C.lIlIIllIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(gP), lIIIllllIllll[5])) {
                        AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[40]];
                        int[] nArray = new int[lIIIllllIllll[1]];
                        nArray[C.lIIIllllIllll[0]] = lIIIllllIllll[14];
                        if (C.lIlIIllIIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray7 = new int[lIIIllllIllll[1]];
                            nArray7[C.lIIIllllIllll[0]] = lIIIllllIllll[14];
                            Inventory.getFirst((int[])nArray7).interact(lIIIllllIlllI[lIIIllllIllll[41]]);
                        }
                        g.a(gL);
                        if (C.lIlIIllIIIIllII(Dialog.isOpen() ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)gP);

                            Time.sleepTicks((int)lIIIllllIllll[1]);

                        }
                    }
                    if (C.lIlIIllIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(gP), lIIIllllIllll[5])) {
                        g.a(lIIIllllIlllI[lIIIllllIllll[42]], gL);
                    }
                    if (C.lIlIIllIIIIllII((var1 = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                        var2 = lIIIllllIllll[0];
                        while (C.lIlIIllIIIIlIll(var2, var1.size())) {
                            if (C.lIlIIllIIIIlIlI(((Widget)var1.get(var2)).getText().contains(lIIIllllIlllI[lIIIllllIllll[43]]) ? 1 : 0)) {
                                gX = lIIIllllIllll[1];
                            }
                            ++var2;

                            if (1 != 3) continue;
                            return;
                        }
                    }
                }
                if (C.lIlIIllIIIIlIlI(gU ? 1 : 0) && C.lIlIIllIIIIlIlI(gT ? 1 : 0) && C.lIlIIllIIIIlIlI(gV ? 1 : 0) && C.lIlIIllIIIIlIlI(gW ? 1 : 0) && C.lIlIIllIIIIlIlI(gX ? 1 : 0)) {
                    int[] nArray = new int[lIIIllllIllll[1]];
                    nArray[C.lIIIllllIllll[0]] = lIIIllllIllll[32];
                    if (C.lIlIIllIIIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        if (!C.lIlIIllIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(gQ), lIIIllllIllll[3]) || !C.lIlIIllIIIlIlII(Players.getLocal().getWorldLocation().getX(), lIIIllllIllll[44]) || C.lIlIIllIIIlIlII(Players.getLocal().getWorldLocation().getX(), lIIIllllIllll[45])) {
                            AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[46]];
                            Movement.walkTo((WorldPoint)gQ);

                            Time.sleepTicks((int)lIIIllllIllll[1]);

                        }
                        if (C.lIlIIllIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(gQ), lIIIllllIllll[3]) && C.lIlIIllIIIlIlII(Players.getLocal().getWorldLocation().getX(), lIIIllllIllll[44]) && C.lIlIIllIIIIlIll(Players.getLocal().getWorldLocation().getX(), lIIIllllIllll[45])) {
                            int[] nArray8 = new int[lIIIllllIllll[1]];
                            nArray8[C.lIIIllllIllll[0]] = lIIIllllIllll[47];
                            TileObjects.getNearest((int[])nArray8).interact(lIIIllllIlllI[lIIIllllIllll[48]]);
                            Time.sleepTicks((int)lIIIllllIllll[3]);

                        }
                    }
                }
                if (C.lIlIIllIIIIlIlI(gU ? 1 : 0) && C.lIlIIllIIIIlIlI(gT ? 1 : 0) && C.lIlIIllIIIIlIlI(gV ? 1 : 0) && C.lIlIIllIIIIlIlI(gW ? 1 : 0) && C.lIlIIllIIIIlIlI(gX ? 1 : 0)) {
                    int[] nArray = new int[lIIIllllIllll[1]];
                    nArray[C.lIIIllllIllll[0]] = lIIIllllIllll[32];
                    if (C.lIlIIllIIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        if (C.lIlIIllIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(gM), lIIIllllIllll[20])) {
                            AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[49]];
                            Movement.walkTo((WorldPoint)gM);

                            Time.sleepTicks((int)lIIIllllIllll[1]);

                        }
                        if (C.lIlIIllIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(gM), lIIIllllIllll[20])) {
                            AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[50]];
                            g.a(lIIIllllIlllI[lIIIllllIllll[51]], gL);
                        }
                    }
                }
            }
            if (C.lIlIIllIIIlIIlI(Vars.getVarp((int)QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()), lIIIllllIllll[3])) {
                if (C.lIlIIllIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(gR), lIIIllllIllll[5])) {
                    AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[52]];
                    Movement.walkTo((WorldPoint)gR);

                    Time.sleepTicks((int)lIIIllllIllll[1]);

                }
                if (C.lIlIIllIIIIlIll(Players.getLocal().getWorldLocation().distanceTo(gR), lIIIllllIllll[5])) {
                    AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[53]];
                    int[] nArray = new int[lIIIllllIllll[1]];
                    nArray[C.lIIIllllIllll[0]] = lIIIllllIllll[54];
                    if (C.lIlIIllIIIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray9 = new int[lIIIllllIllll[1]];
                        nArray9[C.lIIIllllIllll[0]] = lIIIllllIllll[55];
                        String[] stringArray = new String[lIIIllllIllll[1]];
                        stringArray[C.lIIIllllIllll[0]] = lIIIllllIlllI[lIIIllllIllll[56]];
                        Inventory.getFirst((int[])nArray9).useOn(TileObjects.getNearest((String[])stringArray));
                        Time.sleepTicks((int)lIIIllllIllll[3]);

                    }
                    int[] nArray10 = new int[lIIIllllIllll[1]];
                    nArray10[C.lIIIllllIllll[0]] = lIIIllllIllll[54];
                    if (C.lIlIIllIIIIlIlI(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                        int[] nArray11 = new int[lIIIllllIllll[1]];
                        nArray11[C.lIIIllllIllll[0]] = lIIIllllIllll[54];
                        Inventory.getFirst((int[])nArray11).interact(lIIIllllIlllI[lIIIllllIllll[57]]);
                        Time.sleepTicks((int)lIIIllllIllll[3]);

                    }
                }
            }
            if (C.lIlIIllIIIlIIlI(Vars.getVarp((int)QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()), lIIIllllIllll[5])) {
                if (C.lIlIIllIIIIllII(Players.getLocal().getWorldLocation().equals((Object)gS) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[58]];
                    Movement.walkTo((WorldPoint)gS);

                    Time.sleepTicks((int)lIIIllllIllll[1]);

                }
                if (C.lIlIIllIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)gS) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[59]];
                    if (C.lIlIIllIIIlIIll(Players.getLocal().getInteracting())) {
                        if (C.lIlIIllIIIIlIll(co, lIIIllllIllll[1])) {
                            P.lt += lIIIllllIllll[1];
                            P.d(AccBuilderRat.m);
                            co += lIIIllllIllll[1];
                            P.lt = lIIIllllIllll[0];
                            cp = lIIIllllIllll[0];
                        }
                        String[] stringArray = new String[lIIIllllIllll[1]];
                        stringArray[C.lIIIllllIllll[0]] = lIIIllllIlllI[lIIIllllIllll[60]];
                        Inventory.getFirst((String[])stringArray).interact(lIIIllllIlllI[lIIIllllIllll[61]]);
                        Time.sleepTicks((int)lIIIllllIllll[5]);

                    }
                }
            }
            g.a(new String[lIIIllllIllll[0]]);
            System.out.println("Setting: " + Vars.getVarp((int)QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()));
        }
    }

    private static boolean lIlIIllIIIIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIllIIIlIIlI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public String Z() {
        return lIIIllllIlllI[lIIIllllIllll[72]];
    }

    @Override
    public boolean X() {
        return lIIIllllIllll[0];
    }

    private static boolean lIlIIllIIIlIIll(Object object) {
        return object == null;
    }

    private static void W() {
        block12: {
            d var3;
            block11: {
                Object var4;
                int[] nArray = new int[lIIIllllIllll[1]];
                nArray[C.lIIIllllIllll[0]] = lIIIllllIllll[15];
                if (C.lIlIIllIIIIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new DHelper(lIIIllllIllll[15], lIIIllllIllll[1], lIIIllllIllll[63]);
                    bA.add(d2);

                }
                int[] nArray2 = new int[lIIIllllIllll[1]];
                nArray2[C.lIIIllllIllll[0]] = lIIIllllIllll[14];
                if (C.lIlIIllIIIIllII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    var4 = new DHelper(lIIIllllIllll[14], lIIIllllIllll[1], lIIIllllIllll[64]);
                    bA.add((DHelper) ar4);

                }
                int[] nArray3 = new int[lIIIllllIllll[1]];
                nArray3[C.lIIIllllIllll[0]] = lIIIllllIllll[11];
                if (C.lIlIIllIIIIllII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    var4 = new DHelper(lIIIllllIllll[11], lIIIllllIllll[16], lIIIllllIllll[65]);
                    bA.add((DHelper) ar4);

                }
                int[] nArray4 = new int[lIIIllllIllll[1]];
                nArray4[C.lIIIllllIllll[0]] = lIIIllllIllll[10];
                if (C.lIlIIllIIIIllII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    var4 = new DHelper(lIIIllllIllll[10], lIIIllllIllll[1], lIIIllllIllll[66]);
                    bA.add((DHelper) ar4);

                }
                if (C.lIlIIllIIIIllII(Bank.contains((Predicate)(var4 = item -> item.getName().toLowerCase().contains(lIIIllllIlllI[lIIIllllIllll[73]]))) ? 1 : 0)) {
                    var3 = new DHelper(lIIIllllIllll[67], lIIIllllIllll[7], lIIIllllIllll[68]);
                    bA.add(var3);

                }
                int[] nArray5 = new int[lIIIllllIllll[1]];
                nArray5[C.lIIIllllIllll[0]] = lIIIllllIllll[69];
                if (C.lIlIIllIIIIllII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    var3 = new DHelper(lIIIllllIllll[69], lIIIllllIllll[16], lIIIllllIllll[70]);
                    bA.add(var3);

                }
                int[] nArray6 = new int[lIIIllllIllll[1]];
                nArray6[C.lIIIllllIllll[0]] = lIIIllllIllll[17];
                if (C.lIlIIllIIIIllII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                    var3 = new DHelper(lIIIllllIllll[17], lIIIllllIllll[16], lIIIllllIllll[70]);
                    bA.add(var3);

                }
                int[] nArray7 = new int[lIIIllllIllll[1]];
                nArray7[C.lIIIllllIllll[0]] = lIIIllllIllll[13];
                if (C.lIlIIllIIIIllII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    var3 = new DHelper(lIIIllllIllll[13], lIIIllllIllll[59], lIIIllllIllll[70]);
                    bA.add(var3);

                }
                int[] nArray8 = new int[lIIIllllIllll[1]];
                nArray8[C.lIIIllllIllll[0]] = lIIIllllIllll[12];
                if (!C.lIlIIllIIIIlIlI(Bank.contains((int[])nArray8) ? 1 : 0)) break block11;
                int[] nArray9 = new int[lIIIllllIllll[1]];
                nArray9[C.lIIIllllIllll[0]] = lIIIllllIllll[12];
                if (!C.lIlIIllIIIIlIlI(Bank.contains((int[])nArray9) ? 1 : 0)) break block12;
                int[] nArray10 = new int[lIIIllllIllll[1]];
                nArray10[C.lIIIllllIllll[0]] = lIIIllllIllll[12];
                if (!C.lIlIIllIIIIlIll(Bank.getFirst((int[])nArray10).getQuantity(), lIIIllllIllll[6])) break block12;
            }
            var3 = new DHelper(lIIIllllIllll[12], lIIIllllIllll[6], h.bv);
            bA.add(var3);

        }
    }

    private static boolean lIlIIllIIIIllII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIllIIIIlllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIllIIIIllIl(int n2) {
        return n2 < 0;
    }

    @Override
    public int Y() {
        try {
            C.cg();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIIIllllIllll[71];
    }

    private static boolean lIlIIllIIIlIIII(int n2, int n3) {
        return n2 > n3;
    }

        return String.valueOf(var5);
    }

    private static int lIlIIllIIIIlIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIlIIllIIIIlIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIllIIIIllll(Object object) {
        return object != null;
    }

    private static boolean lIlIIllIIIlIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIllIIIlIlII(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (C.lIlIIllIIIlIlII(Vars.getVarp((int)QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()), lIIIllllIllll[6])) {
            bl = lIIIllllIllll[1];

            if (2 < 0) {
                return (((0x2F ^ 0x4E) & ~(0x69 ^ 8) ^ (0x2F ^ 0x6C)) & (0x25 ^ 0x31 ^ (0x15 ^ 0x42) ^ -1)) != 0;
            }
        } else {
            bl = lIIIllllIllll[0];
        }
        return bl;
    }

    static {
        C.lIlIIllIIIIlIII();
        C.lIlIIllIIIIIlll();
        String[] stringArray = new String[lIIIllllIllll[36]];
        stringArray[C.lIIIllllIllll[0]] = lIIIllllIlllI[lIIIllllIllll[75]];
        stringArray[C.lIIIllllIllll[1]] = lIIIllllIlllI[lIIIllllIllll[76]];
        stringArray[C.lIIIllllIllll[3]] = lIIIllllIlllI[lIIIllllIllll[77]];
        stringArray[C.lIIIllllIllll[5]] = lIIIllllIlllI[lIIIllllIllll[78]];
        stringArray[C.lIIIllllIllll[6]] = lIIIllllIlllI[lIIIllllIllll[79]];
        stringArray[C.lIIIllllIllll[7]] = lIIIllllIlllI[lIIIllllIllll[80]];
        stringArray[C.lIIIllllIllll[9]] = lIIIllllIlllI[lIIIllllIllll[81]];
        stringArray[C.lIIIllllIllll[21]] = lIIIllllIlllI[lIIIllllIllll[82]];
        stringArray[C.lIIIllllIllll[20]] = lIIIllllIlllI[lIIIllllIllll[83]];
        stringArray[C.lIIIllllIllll[22]] = lIIIllllIlllI[lIIIllllIllll[84]];
        stringArray[C.lIIIllllIllll[16]] = lIIIllllIlllI[lIIIllllIllll[85]];
        stringArray[C.lIIIllllIllll[23]] = lIIIllllIlllI[lIIIllllIllll[86]];
        stringArray[C.lIIIllllIllll[24]] = lIIIllllIlllI[lIIIllllIllll[87]];
        stringArray[C.lIIIllllIllll[25]] = lIIIllllIlllI[lIIIllllIllll[88]];
        stringArray[C.lIIIllllIllll[26]] = lIIIllllIlllI[lIIIllllIllll[89]];
        stringArray[C.lIIIllllIllll[27]] = lIIIllllIlllI[lIIIllllIllll[90]];
        stringArray[C.lIIIllllIllll[29]] = lIIIllllIlllI[lIIIllllIllll[91]];
        stringArray[C.lIIIllllIllll[30]] = lIIIllllIlllI[lIIIllllIllll[92]];
        stringArray[C.lIIIllllIllll[31]] = lIIIllllIlllI[lIIIllllIllll[93]];
        stringArray[C.lIIIllllIllll[33]] = lIIIllllIlllI[lIIIllllIllll[94]];
        stringArray[C.lIIIllllIllll[34]] = lIIIllllIlllI[lIIIllllIllll[95]];
        stringArray[C.lIIIllllIllll[35]] = lIIIllllIlllI[lIIIllllIllll[96]];
        gL = stringArray;
        gM = new WorldPoint(lIIIllllIllll[97], lIIIllllIllll[98], lIIIllllIllll[0]);
        gN = new WorldPoint(lIIIllllIllll[99], lIIIllllIllll[100], lIIIllllIllll[0]);
        gO = new WorldPoint(lIIIllllIllll[101], lIIIllllIllll[102], lIIIllllIllll[0]);
        gP = new WorldPoint(lIIIllllIllll[103], lIIIllllIllll[104], lIIIllllIllll[0]);
        gQ = new WorldPoint(lIIIllllIllll[105], lIIIllllIllll[106], lIIIllllIllll[0]);
        gR = new WorldPoint(lIIIllllIllll[107], lIIIllllIllll[108], lIIIllllIllll[1]);
        gS = new WorldPoint(lIIIllllIllll[109], lIIIllllIllll[110], lIIIllllIllll[0]);
        bA = new ArrayList<d>();
        bY = lIIIllllIllll[0];
    }
}

