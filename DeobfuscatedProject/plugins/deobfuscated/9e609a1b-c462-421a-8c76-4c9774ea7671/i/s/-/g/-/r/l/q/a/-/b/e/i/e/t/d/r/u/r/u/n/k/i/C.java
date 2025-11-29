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
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.P;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.a;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.b;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.d;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.f;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.g;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.h;
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

public class C
implements M {
    public static /* synthetic */ List<d> bA;
    private static final /* synthetic */ WorldPoint gO;
    public static final /* synthetic */ String[] gL;
    private static /* synthetic */ boolean gU;
    private static /* synthetic */ boolean gT;
    private static final /* synthetic */ WorldPoint gN;
    static /* synthetic */ int bY;
    private static /* synthetic */ boolean gX;
    private static final /* synthetic */ WorldPoint gS;
    private static final /* synthetic */ WorldPoint gP;
    private static /* synthetic */ boolean gV;
    private static final /* synthetic */ WorldPoint gR;
    private static /* synthetic */ int[] lIIIllllIllll;
    private static final /* synthetic */ WorldPoint gQ;
    private static final /* synthetic */ WorldPoint gM;
    private static /* synthetic */ String[] lIIIllllIlllI;
    public static /* synthetic */ boolean by;
    static /* synthetic */ boolean cp;
    private static /* synthetic */ boolean gW;
    static /* synthetic */ int co;

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
                    0;
                    if (1 != (0x4C ^ 0x48)) return n2 != 0;
                    return ((0x3E ^ 1) & ~(0x75 ^ 0x4A)) != 0;
                }
            }
        }
        n2 = lIIIllllIllll[0];
        return n2 != 0;
    }

    private static void lIlIIllIIIIIlll() {
        lIIIllllIlllI = new String[lIIIllllIllll[111]];
        C.lIIIllllIlllI[C.lIIIllllIllll[0]] = C."Buying items";
        C.lIIIllllIlllI[C.lIIIllllIllll[1]] = C."Finished buying items, switching back to quest";
        C.lIIIllllIlllI[C.lIIIllllIllll[3]] = C."Drink";
        C.lIIIllllIlllI[C.lIIIllllIllll[5]] = C."Eat";
        C.lIIIllllIlllI[C.lIIIllllIllll[6]] = C."Nav to bank";
        C.lIIIllllIlllI[C.lIIIllllIllll[7]] = C."Handling banking";
        C.lIIIllllIlllI[C.lIIIllllIllll[9]] = C."We are missing quest supplies, switching to BUYING";
        C.lIIIllllIlllI[C.lIIIllllIllll[21]] = C."Nav to start";
        C.lIIIllllIlllI[C.lIIIllllIllll[20]] = C."Interact npc";
        C.lIIIllllIlllI[C.lIIIllllIllll[22]] = C."Redbeard Frank";
        C.lIIIllllIlllI[C.lIIIllllIllll[16]] = C."Nav to luthas";
        C.lIIIllllIlllI[C.lIIIllllIllll[23]] = C."Talk luthas";
        C.lIIIllllIlllI[C.lIIIllllIllll[24]] = C."Luthas";
        C.lIIIllllIlllI[C.lIIIllllIllll[25]] = C."the crate isn't";
        C.lIIIllllIlllI[C.lIIIllllIllll[26]] = C."Nav to Zembo";
        C.lIIIllllIlllI[C.lIIIllllIllll[27]] = C."Buy rum";
        C.lIIIllllIlllI[C.lIIIllllIllll[29]] = C."Zembo";
        C.lIIIllllIlllI[C.lIIIllllIllll[30]] = C."Trade";
        C.lIIIllllIlllI[C.lIIIllllIllll[31]] = C."Buy 1";
        C.lIIIllllIlllI[C.lIIIllllIllll[33]] = C."Nav to luthas";
        C.lIIIllllIlllI[C.lIIIllllIllll[34]] = C."Filling crate";
        C.lIIIllllIlllI[C.lIIIllllIllll[35]] = C."Crate";
        C.lIIIllllIlllI[C.lIIIllllIllll[36]] = C."Fill";
        C.lIIIllllIlllI[C.lIIIllllIllll[37]] = C."Finishing job";
        C.lIIIllllIlllI[C.lIIIllllIllll[38]] = C."Luthas";
        C.lIIIllllIlllI[C.lIIIllllIllll[39]] = C."be on my way";
        C.lIIIllllIlllI[C.lIIIllllIllll[40]] = C."Nav to wydin";
        C.lIIIllllIlllI[C.lIIIllllIllll[41]] = C."Wear";
        C.lIIIllllIlllI[C.lIIIllllIllll[42]] = C."Wydin";
        C.lIIIllllIlllI[C.lIIIllllIllll[43]] = C."can I work out front";
        C.lIIIllllIlllI[C.lIIIllllIllll[46]] = C."Nav to rum";
        C.lIIIllllIlllI[C.lIIIllllIllll[48]] = C."Search";
        C.lIIIllllIlllI[C.lIIIllllIllll[49]] = C."Nav to start";
        C.lIIIllllIlllI[C.lIIIllllIllll[50]] = C."Interact npc";
        C.lIIIllllIlllI[C.lIIIllllIllll[51]] = C."Redbeard Frank";
        C.lIIIllllIlllI[C.lIIIllllIllll[52]] = C."Nav to chest";
        C.lIIIllllIlllI[C.lIIIllllIllll[53]] = C."Getting message";
        C.lIIIllllIlllI[C.lIIIllllIllll[56]] = C."Chest";
        C.lIIIllllIlllI[C.lIIIllllIllll[57]] = C."Read";
        C.lIIIllllIlllI[C.lIIIllllIllll[58]] = C."Nav to dig spot";
        C.lIIIllllIlllI[C.lIIIllllIllll[59]] = C."Digging";
        C.lIIIllllIlllI[C.lIIIllllIllll[60]] = C."Spade";
        C.lIIIllllIlllI[C.lIIIllllIllll[61]] = C."Dig";
        C.lIIIllllIlllI[C.lIIIllllIllll[62]] = C."Spade";
        C.lIIIllllIlllI[C.lIIIllllIllll[72]] = C."Pirates treasure quest";
        C.lIIIllllIlllI[C.lIIIllllIllll[73]] = C."ring of wealth (";
        C.lIIIllllIlllI[C.lIIIllllIllll[74]] = C."Fill";
        C.lIIIllllIlllI[C.lIIIllllIllll[75]] = C."Ok, I'm up for an adventure.";
        C.lIIIllllIlllI[C.lIIIllllIllll[76]] = C."A glass of your finest ale please.";
        C.lIIIllllIlllI[C.lIIIllllIllll[77]] = C."Morgan needs your help!";
        C.lIIIllllIlllI[C.lIIIllllIllll[78]] = C."Yes.";
        C.lIIIllllIlllI[C.lIIIllllIllll[79]] = C."I'm looking for a quest!";
        C.lIIIllllIlllI[C.lIIIllllIllll[80]] = C."Ok, let me help then.";
        C.lIIIllllIlllI[C.lIIIllllIllll[81]] = C."Father Aereck sent me to talk to you.";
        C.lIIIllllIlllI[C.lIIIllllIllll[82]] = C."He's got a ghost haunting his graveyard.";
        C.lIIIllllIlllI[C.lIIIllllIllll[83]] = C."Yep, now tell me what the problem is.";
        C.lIIIllllIlllI[C.lIIIllllIllll[84]] = C."Sure.";
        C.lIIIllllIlllI[C.lIIIllllIllll[85]] = C."I'm wearing an amulet of ghost speak!";
        C.lIIIllllIlllI[C.lIIIllllIllll[86]] = C."Yes, I'm sure.";
        C.lIIIllllIlllI[C.lIIIllllIllll[87]] = C."How can I help?";
        C.lIIIllllIlllI[C.lIIIllllIllll[88]] = C."I'm looking for a quest.";
        C.lIIIllllIlllI[C.lIIIllllIllll[89]] = C."I'm in search of treasure.";
        C.lIIIllllIlllI[C.lIIIllllIllll[90]] = C."Yes.";
        C.lIIIllllIlllI[C.lIIIllllIllll[91]] = C."Could you offer me employment on your plantation?";
        C.lIIIllllIlllI[C.lIIIllllIllll[92]] = C."Thank you, I'll be on my way";
        C.lIIIllllIlllI[C.lIIIllllIllll[93]] = C."Can I get a job here?";
        C.lIIIllllIlllI[C.lIIIllllIllll[94]] = C."Can I journey on this ship?";
        C.lIIIllllIlllI[C.lIIIllllIllll[95]] = C."Search away, I have nothing to hide.";
        C.lIIIllllIlllI[C.lIIIllllIllll[96]] = C."Ok.";
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
            Object lllllllllllllllIIIIIIlIllIllIlIl;
            if (C.lIlIIllIIIIlIlI(Inventory.contains((int[])f.ba) ? 1 : 0) && C.lIlIIllIIIIlIll(Movement.getRunEnergy(), lIIIllllIllll[2])) {
                Inventory.getFirst((int[])f.ba).interact(lIIIllllIlllI[lIIIllllIllll[3]]);
                Time.sleepTicks((int)lIIIllllIllll[1]);
                0;
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
                lllllllllllllllIIIIIIlIllIllIlIl = BankLocation.getNearest();
                if (C.lIlIIllIIIIllll(lllllllllllllllIIIIIIlIllIllIlIl) && C.lIlIIllIIIIllII(lllllllllllllllIIIIIIlIllIllIlIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[6]];
                    a.a((BankLocation)lllllllllllllllIIIIIIlIllIllIlIl);
                    Time.sleepTicks((int)lIIIllllIllll[3]);
                    0;
                }
                if (C.lIlIIllIIIIllll(lllllllllllllllIIIIIIlIllIllIlIl) && C.lIlIIllIIIIlIlI(lllllllllllllllIIIIIIlIllIllIlIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[7]];
                    if (C.lIlIIllIIIIllII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIllllIllll[8]);
                        0;
                    }
                    if (C.lIlIIllIIIIlIlI(Bank.isOpen() ? 1 : 0)) {
                        if (C.lIlIIllIIIIlllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIllllIllll[6]);
                            0;
                        }
                        if (C.lIlIIllIIIIlllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIllllIllll[3]);
                            0;
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
                        0;
                        Bank.withdraw((int)lIIIllllIllll[15], (int)lIIIllllIllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIllllIllll[1]);
                        0;
                        Bank.withdraw((int)lIIIllllIllll[14], (int)lIIIllllIllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIllllIllll[1]);
                        0;
                        Bank.withdraw((int)lIIIllllIllll[17], (int)lIIIllllIllll[16], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIllllIllll[1]);
                        0;
                        Bank.withdraw((int)lIIIllllIllll[13], (int)lIIIllllIllll[7], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIllllIllll[1]);
                        0;
                        Bank.withdraw((int)lIIIllllIllll[10], (int)lIIIllllIllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIllllIllll[1]);
                        0;
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
                    0;
                    Time.sleepTicks((int)lIIIllllIllll[1]);
                    0;
                }
                if (C.lIlIIllIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(gM), lIIIllllIllll[20])) {
                    AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[20]];
                    g.a(lIIIllllIlllI[lIIIllllIllll[22]], gL);
                }
            }
            if (C.lIlIIllIIIlIIlI(Vars.getVarp((int)QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()), lIIIllllIllll[1])) {
                int lllllllllllllllIIIIIIlIllIllIlII;
                co = lIIIllllIllll[0];
                if (C.lIlIIllIIIIllII(gT ? 1 : 0)) {
                    if (C.lIlIIllIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(gN), lIIIllllIllll[5])) {
                        AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[16]];
                        Movement.walkTo((WorldPoint)gN);
                        0;
                        Time.sleepTicks((int)lIIIllllIllll[1]);
                        0;
                    }
                    if (C.lIlIIllIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(gN), lIIIllllIllll[5])) {
                        AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[23]];
                        g.a(lIIIllllIlllI[lIIIllllIllll[24]], gL);
                        lllllllllllllllIIIIIIlIllIllIlIl = Dialog.getOptions();
                        if (C.lIlIIllIIIIllII(lllllllllllllllIIIIIIlIllIllIlIl.isEmpty() ? 1 : 0)) {
                            lllllllllllllllIIIIIIlIllIllIlII = lIIIllllIllll[0];
                            while (C.lIlIIllIIIIlIll(lllllllllllllllIIIIIIlIllIllIlII, lllllllllllllllIIIIIIlIllIllIlIl.size())) {
                                if (C.lIlIIllIIIIlIlI(((Widget)lllllllllllllllIIIIIIlIllIllIlIl.get(lllllllllllllllIIIIIIlIllIllIlII)).getText().contains(lIIIllllIlllI[lIIIllllIllll[25]]) ? 1 : 0)) {
                                    gT = lIIIllllIllll[1];
                                }
                                ++lllllllllllllllIIIIIIlIllIllIlII;
                                0;
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
                        0;
                        Time.sleepTicks((int)lIIIllllIllll[1]);
                        0;
                    }
                    if (C.lIlIIllIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(gO), lIIIllllIllll[20])) {
                        AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[27]];
                        lllllllllllllllIIIIIIlIllIllIlIl = Widgets.get((int)lIIIllllIllll[28], (int)lIIIllllIllll[29], (int)lIIIllllIllll[3]);
                        if (C.lIlIIllIIIlIIll(lllllllllllllllIIIIIIlIllIllIlIl)) {
                            String[] stringArray = new String[lIIIllllIllll[1]];
                            stringArray[C.lIIIllllIllll[0]] = lIIIllllIlllI[lIIIllllIllll[29]];
                            NPCs.getNearest((String[])stringArray).interact(lIIIllllIlllI[lIIIllllIllll[30]]);
                            Time.sleepTicks((int)lIIIllllIllll[3]);
                            0;
                        }
                        if (C.lIlIIllIIIIllll(lllllllllllllllIIIIIIlIllIllIlIl)) {
                            lllllllllllllllIIIIIIlIllIllIlIl.interact(lIIIllllIlllI[lIIIllllIllll[31]]);
                            Time.sleepTicks((int)lIIIllllIllll[1]);
                            0;
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
                        0;
                        Time.sleepTicks((int)lIIIllllIllll[1]);
                        0;
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
                            0;
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
                            0;
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
                    lllllllllllllllIIIIIIlIllIllIlIl = Dialog.getText();
                    if (C.lIlIIllIIIIllll(lllllllllllllllIIIIIIlIllIllIlIl) && C.lIlIIllIIIIlIlI(((String)lllllllllllllllIIIIIIlIllIllIlIl).contains(lIIIllllIlllI[lIIIllllIllll[39]]) ? 1 : 0)) {
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
                            0;
                            Time.sleepTicks((int)lIIIllllIllll[1]);
                            0;
                        }
                    }
                    if (C.lIlIIllIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(gP), lIIIllllIllll[5])) {
                        g.a(lIIIllllIlllI[lIIIllllIllll[42]], gL);
                    }
                    if (C.lIlIIllIIIIllII((lllllllllllllllIIIIIIlIllIllIlIl = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                        lllllllllllllllIIIIIIlIllIllIlII = lIIIllllIllll[0];
                        while (C.lIlIIllIIIIlIll(lllllllllllllllIIIIIIlIllIllIlII, lllllllllllllllIIIIIIlIllIllIlIl.size())) {
                            if (C.lIlIIllIIIIlIlI(((Widget)lllllllllllllllIIIIIIlIllIllIlIl.get(lllllllllllllllIIIIIIlIllIllIlII)).getText().contains(lIIIllllIlllI[lIIIllllIllll[43]]) ? 1 : 0)) {
                                gX = lIIIllllIllll[1];
                            }
                            ++lllllllllllllllIIIIIIlIllIllIlII;
                            0;
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
                            0;
                            Time.sleepTicks((int)lIIIllllIllll[1]);
                            0;
                        }
                        if (C.lIlIIllIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(gQ), lIIIllllIllll[3]) && C.lIlIIllIIIlIlII(Players.getLocal().getWorldLocation().getX(), lIIIllllIllll[44]) && C.lIlIIllIIIIlIll(Players.getLocal().getWorldLocation().getX(), lIIIllllIllll[45])) {
                            int[] nArray8 = new int[lIIIllllIllll[1]];
                            nArray8[C.lIIIllllIllll[0]] = lIIIllllIllll[47];
                            TileObjects.getNearest((int[])nArray8).interact(lIIIllllIlllI[lIIIllllIllll[48]]);
                            Time.sleepTicks((int)lIIIllllIllll[3]);
                            0;
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
                            0;
                            Time.sleepTicks((int)lIIIllllIllll[1]);
                            0;
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
                    0;
                    Time.sleepTicks((int)lIIIllllIllll[1]);
                    0;
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
                        0;
                    }
                    int[] nArray10 = new int[lIIIllllIllll[1]];
                    nArray10[C.lIIIllllIllll[0]] = lIIIllllIllll[54];
                    if (C.lIlIIllIIIIlIlI(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                        int[] nArray11 = new int[lIIIllllIllll[1]];
                        nArray11[C.lIIIllllIllll[0]] = lIIIllllIllll[54];
                        Inventory.getFirst((int[])nArray11).interact(lIIIllllIlllI[lIIIllllIllll[57]]);
                        Time.sleepTicks((int)lIIIllllIllll[3]);
                        0;
                    }
                }
            }
            if (C.lIlIIllIIIlIIlI(Vars.getVarp((int)QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()), lIIIllllIllll[5])) {
                if (C.lIlIIllIIIIllII(Players.getLocal().getWorldLocation().equals((Object)gS) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[58]];
                    Movement.walkTo((WorldPoint)gS);
                    0;
                    Time.sleepTicks((int)lIIIllllIllll[1]);
                    0;
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
                        0;
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
            d lllllllllllllllIIIIIIlIllIllIIII;
            block11: {
                Object lllllllllllllllIIIIIIlIllIllIIIl;
                int[] nArray = new int[lIIIllllIllll[1]];
                nArray[C.lIIIllllIllll[0]] = lIIIllllIllll[15];
                if (C.lIlIIllIIIIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(lIIIllllIllll[15], lIIIllllIllll[1], lIIIllllIllll[63]);
                    bA.add(d2);
                    0;
                }
                int[] nArray2 = new int[lIIIllllIllll[1]];
                nArray2[C.lIIIllllIllll[0]] = lIIIllllIllll[14];
                if (C.lIlIIllIIIIllII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lllllllllllllllIIIIIIlIllIllIIIl = new d(lIIIllllIllll[14], lIIIllllIllll[1], lIIIllllIllll[64]);
                    bA.add((d)lllllllllllllllIIIIIIlIllIllIIIl);
                    0;
                }
                int[] nArray3 = new int[lIIIllllIllll[1]];
                nArray3[C.lIIIllllIllll[0]] = lIIIllllIllll[11];
                if (C.lIlIIllIIIIllII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    lllllllllllllllIIIIIIlIllIllIIIl = new d(lIIIllllIllll[11], lIIIllllIllll[16], lIIIllllIllll[65]);
                    bA.add((d)lllllllllllllllIIIIIIlIllIllIIIl);
                    0;
                }
                int[] nArray4 = new int[lIIIllllIllll[1]];
                nArray4[C.lIIIllllIllll[0]] = lIIIllllIllll[10];
                if (C.lIlIIllIIIIllII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    lllllllllllllllIIIIIIlIllIllIIIl = new d(lIIIllllIllll[10], lIIIllllIllll[1], lIIIllllIllll[66]);
                    bA.add((d)lllllllllllllllIIIIIIlIllIllIIIl);
                    0;
                }
                if (C.lIlIIllIIIIllII(Bank.contains((Predicate)(lllllllllllllllIIIIIIlIllIllIIIl = item -> item.getName().toLowerCase().contains(lIIIllllIlllI[lIIIllllIllll[73]]))) ? 1 : 0)) {
                    lllllllllllllllIIIIIIlIllIllIIII = new d(lIIIllllIllll[67], lIIIllllIllll[7], lIIIllllIllll[68]);
                    bA.add(lllllllllllllllIIIIIIlIllIllIIII);
                    0;
                }
                int[] nArray5 = new int[lIIIllllIllll[1]];
                nArray5[C.lIIIllllIllll[0]] = lIIIllllIllll[69];
                if (C.lIlIIllIIIIllII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    lllllllllllllllIIIIIIlIllIllIIII = new d(lIIIllllIllll[69], lIIIllllIllll[16], lIIIllllIllll[70]);
                    bA.add(lllllllllllllllIIIIIIlIllIllIIII);
                    0;
                }
                int[] nArray6 = new int[lIIIllllIllll[1]];
                nArray6[C.lIIIllllIllll[0]] = lIIIllllIllll[17];
                if (C.lIlIIllIIIIllII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                    lllllllllllllllIIIIIIlIllIllIIII = new d(lIIIllllIllll[17], lIIIllllIllll[16], lIIIllllIllll[70]);
                    bA.add(lllllllllllllllIIIIIIlIllIllIIII);
                    0;
                }
                int[] nArray7 = new int[lIIIllllIllll[1]];
                nArray7[C.lIIIllllIllll[0]] = lIIIllllIllll[13];
                if (C.lIlIIllIIIIllII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    lllllllllllllllIIIIIIlIllIllIIII = new d(lIIIllllIllll[13], lIIIllllIllll[59], lIIIllllIllll[70]);
                    bA.add(lllllllllllllllIIIIIIlIllIllIIII);
                    0;
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
            lllllllllllllllIIIIIIlIllIllIIII = new d(lIIIllllIllll[12], lIIIllllIllll[6], h.bv);
            bA.add(lllllllllllllllIIIIIIlIllIllIIII);
            0;
        }
    }

    private static boolean lIlIIllIIIIllII(int n2) {
        return n2 == 0;
    }

    private static void lIlIIllIIIIlIII() {
        lIIIllllIllll = new int[112];
        C.lIIIllllIllll[0] = (0x72 ^ 0x68 ^ (4 ^ 0x14)) & (163 + 15 - 56 + 55 ^ 88 + 73 - 106 + 132 ^ -1);
        C.lIIIllllIllll[1] = 1;
        C.lIIIllllIllll[2] = 0xE1 ^ 0xA7;
        C.lIIIllllIllll[3] = 2;
        C.lIIIllllIllll[4] = 0xFFFFA1FF & 0x5F7B;
        C.lIIIllllIllll[5] = 3;
        C.lIIIllllIllll[6] = 105 + 50 - 36 + 67 ^ 107 + 101 - 124 + 106;
        C.lIIIllllIllll[7] = 165 + 4 - 63 + 61 ^ 121 + 63 - 124 + 102;
        C.lIIIllllIllll[8] = 0xFFFFB38E & 0x5FF9;
        C.lIIIllllIllll[9] = 0x7C ^ 0x14 ^ (0xC8 ^ 0xA6);
        C.lIIIllllIllll[10] = -(0xFFFFE13D & 0x5FF3) & (0xFFFFEFFB & 0x7FFE);
        C.lIIIllllIllll[11] = -(0xFFFFB3AB & 0x5C55) & (0xFFFFF7EF & 0x1FBB);
        C.lIIIllllIllll[12] = 0xFFFFB155 & 0x7FFB;
        C.lIIIllllIllll[13] = 0xFFFFFFFF & 0x1F47;
        C.lIIIllllIllll[14] = -(0xFFFFFDDB & 0x6237) & (0xFFFFE3FF & Short.MAX_VALUE);
        C.lIIIllllIllll[15] = 0xFFFFFBFE & 0x7B9;
        C.lIIIllllIllll[16] = 0x5D ^ 0x57;
        C.lIIIllllIllll[17] = 0xFFFF9FC9 & 0x7F7F;
        C.lIIIllllIllll[18] = -(0xFFFFD775 & 0x3C9B) & (0xFFFFBFF7 & 0x57FB);
        C.lIIIllllIllll[19] = -(0xFFFFBC77 & 0x539F) & (0xFFFF9FFE & 0x73FF);
        C.lIIIllllIllll[20] = 0x5A ^ 0x52;
        C.lIIIllllIllll[21] = 115 + 113 - 120 + 85 ^ 131 + 170 - 295 + 192;
        C.lIIIllllIllll[22] = 12 + 127 - 47 + 94 ^ 152 + 142 - 224 + 109;
        C.lIIIllllIllll[23] = 0x21 ^ 0x2A;
        C.lIIIllllIllll[24] = 0x3B ^ 0x37;
        C.lIIIllllIllll[25] = 0x99 ^ 0x80 ^ (0x8D ^ 0x99);
        C.lIIIllllIllll[26] = 86 + 11 - 28 + 96 ^ 117 + 103 - 101 + 52;
        C.lIIIllllIllll[27] = 115 + 47 - 101 + 92 ^ 125 + 74 - 80 + 31;
        C.lIIIllllIllll[28] = -(0xFFFFEFCB & 0x3EF7) & (0xFFFFFFFF & 0x2FEE);
        C.lIIIllllIllll[29] = 0x2C ^ 0x3C;
        C.lIIIllllIllll[30] = 0xFE ^ 0x87 ^ (0x30 ^ 0x58);
        C.lIIIllllIllll[31] = 0x27 ^ 0x35;
        C.lIIIllllIllll[32] = 0xFFFFEBEF & 0x15BF;
        C.lIIIllllIllll[33] = 0x1D ^ 0xE;
        C.lIIIllllIllll[34] = 159 + 111 - 196 + 94 ^ 163 + 78 - 145 + 92;
        C.lIIIllllIllll[35] = 0x2A ^ 0x3F;
        C.lIIIllllIllll[36] = 0xD1 ^ 0xB8 ^ 5 + 2 - -92 + 28;
        C.lIIIllllIllll[37] = 0x34 ^ 0x57 ^ (2 ^ 0x76);
        C.lIIIllllIllll[38] = 0x49 ^ 0x51;
        C.lIIIllllIllll[39] = 0x4C ^ 0x29 ^ (0x35 ^ 0x49);
        C.lIIIllllIllll[40] = 0x67 ^ 0x7D;
        C.lIIIllllIllll[41] = 133 + 148 - 172 + 71 ^ 60 + 126 - 31 + 20;
        C.lIIIllllIllll[42] = 0x44 ^ 0x58;
        C.lIIIllllIllll[43] = 0x84 ^ 0x99;
        C.lIIIllllIllll[44] = -(0xFFFFBBB1 & 0x747F) & (0xFFFFBBFB & 0x7FF5);
        C.lIIIllllIllll[45] = -(0xFFFFA15B & 0x7EBF) & (0xFFFFBFFE & 0x6BDF);
        C.lIIIllllIllll[46] = 207 + 179 - 208 + 44 ^ 155 + 37 - 96 + 96;
        C.lIIIllllIllll[47] = 0xFFFFD897 & 0x2F7F;
        C.lIIIllllIllll[48] = 0xAB ^ 0xB4;
        C.lIIIllllIllll[49] = 0x20 ^ 0;
        C.lIIIllllIllll[50] = 0x3E ^ 0x1F;
        C.lIIIllllIllll[51] = 0x61 ^ 0x29 ^ (0x1D ^ 0x77);
        C.lIIIllllIllll[52] = 0x84 ^ 0xA7;
        C.lIIIllllIllll[53] = 126 + 10 - -27 + 6 ^ 69 + 3 - 1 + 70;
        C.lIIIllllIllll[54] = -(0xFFFFBC57 & 0x7FEF) & (0xFFFFFFFF & 0x3DF7);
        C.lIIIllllIllll[55] = 0xFFFFA1BC & 0x5FF3;
        C.lIIIllllIllll[56] = 0x79 ^ 0x5C;
        C.lIIIllllIllll[57] = 0x6E ^ 0x48;
        C.lIIIllllIllll[58] = 1 ^ 0x66 ^ (0xFD ^ 0xBD);
        C.lIIIllllIllll[59] = 0x42 ^ 7 ^ (0x66 ^ 0xB);
        C.lIIIllllIllll[60] = 0x16 ^ 0x22 ^ (0xA9 ^ 0xB4);
        C.lIIIllllIllll[61] = 94 + 9 - 16 + 46 ^ 12 + 140 - 80 + 103;
        C.lIIIllllIllll[62] = 30 + 75 - -54 + 25 ^ 92 + 41 - 75 + 89;
        C.lIIIllllIllll[63] = -(0xFFFFFB7B & 0x64E7) & (0xFFFFFF6E & 0x77FF);
        C.lIIIllllIllll[64] = 0xFFFFBEFE & 0x5BF5;
        C.lIIIllllIllll[65] = 0xFFFF83AD & 0x7FD6;
        C.lIIIllllIllll[66] = -(0xFFFFBED6 & 0x63AB) & (0xFFFFFFFD & 0x7FDF);
        C.lIIIllllIllll[67] = 0xFFFFFECD & 0x2FFE;
        C.lIIIllllIllll[68] = -(0xFFFF9847 & 0x7FFE) & (0xFFFFF9ED & Short.MAX_VALUE);
        C.lIIIllllIllll[69] = -(0xFFFFFE89 & 0x21F7) & (0xFFFFFFFA & 0x3FCD);
        C.lIIIllllIllll[70] = 0xFFFF87EC & 0x7F7F;
        C.lIIIllllIllll[71] = 0x55 ^ 0x31;
        C.lIIIllllIllll[72] = 0xE ^ 0x22;
        C.lIIIllllIllll[73] = 51 + 70 - 4 + 41 ^ 133 + 143 - 115 + 18;
        C.lIIIllllIllll[74] = 0x99 ^ 0xB7;
        C.lIIIllllIllll[75] = 0x80 ^ 0xAF;
        C.lIIIllllIllll[76] = 0x7D ^ 0x40 ^ (0x83 ^ 0x8E);
        C.lIIIllllIllll[77] = 0x70 ^ 0x41;
        C.lIIIllllIllll[78] = 0x96 ^ 0xA4;
        C.lIIIllllIllll[79] = 0x2E ^ 0x1D;
        C.lIIIllllIllll[80] = 0x7B ^ 0x25 ^ (0x63 ^ 9);
        C.lIIIllllIllll[81] = 0x17 ^ 0x33 ^ (0x34 ^ 0x25);
        C.lIIIllllIllll[82] = 2 ^ (0x62 ^ 0x56);
        C.lIIIllllIllll[83] = 39 + 172 - 172 + 135 ^ 55 + 145 - 145 + 98;
        C.lIIIllllIllll[84] = 0x90 ^ 0xA8;
        C.lIIIllllIllll[85] = 0x74 ^ 0x4D;
        C.lIIIllllIllll[86] = 0x94 ^ 0xAE;
        C.lIIIllllIllll[87] = 0xA4 ^ 0x92 ^ (0x80 ^ 0x8D);
        C.lIIIllllIllll[88] = 0x79 ^ 0x5A ^ (0x92 ^ 0x8D);
        C.lIIIllllIllll[89] = 0x52 ^ 0x3F ^ (0xFD ^ 0xAD);
        C.lIIIllllIllll[90] = 226 + 99 - 209 + 137 ^ 39 + 153 - 51 + 54;
        C.lIIIllllIllll[91] = 0x27 ^ 0x2C ^ (0x44 ^ 0x70);
        C.lIIIllllIllll[92] = 7 ^ 0x30 ^ (0xC8 ^ 0xBF);
        C.lIIIllllIllll[93] = 0x64 ^ 0x25;
        C.lIIIllllIllll[94] = 29 + 85 - 41 + 60 ^ 174 + 85 - 179 + 119;
        C.lIIIllllIllll[95] = 0xB0 ^ 0x8F ^ (0x2A ^ 0x56);
        C.lIIIllllIllll[96] = 0xB3 ^ 0xC4 ^ (0x2F ^ 0x1C);
        C.lIIIllllIllll[97] = 0xFFFFCFEF & 0x3BFE;
        C.lIIIllllIllll[98] = -(0xFFFFFC0B & 0x63F5) & (0xFFFFEEFD & 0x7DB7);
        C.lIIIllllIllll[99] = 0xFFFFDF7E & 0x2BFB;
        C.lIIIllllIllll[100] = 0xFFFFDCFF & 0x2F50;
        C.lIIIllllIllll[101] = 0xFFFFAF77 & 0x5BF8;
        C.lIIIllllIllll[102] = -(0xFFFFAFB7 & 0x73DF) & (0xFFFFEFDE & 0x3FFF);
        C.lIIIllllIllll[103] = 0xFFFFABC7 & 0x5FFE;
        C.lIIIllllIllll[104] = 0xFFFFFC9D & 0xFE6;
        C.lIIIllllIllll[105] = 0xFFFFBBC2 & 0x4FFF;
        C.lIIIllllIllll[106] = -(0xFFFFEF67 & 0x50FE) & (0xFFFFFEFD & 0x4DEF);
        C.lIIIllllIllll[107] = 0xFFFF9F93 & 0x6CFF;
        C.lIIIllllIllll[108] = 0xFFFFCF63 & 0x3DDF;
        C.lIIIllllIllll[109] = -(0xFFFFE45F & 0x3FE9) & (0xFFFFAFFF & Short.MAX_VALUE);
        C.lIIIllllIllll[110] = -1 & (0xFFFFDD77 & 0x2FBF);
        C.lIIIllllIllll[111] = 0x44 ^ 1;
    }

    private static String lIlIIllIIIIIllI(String lllllllllllllllIIIIIIlIllIlIIlII, String lllllllllllllllIIIIIIlIllIlIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIIIIIlIllIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIlIllIlIIlIl.getBytes(StandardCharsets.UTF_8)), lIIIllllIllll[20]), "DES");
            Cipher lllllllllllllllIIIIIIlIllIlIlIII = Cipher.getInstance("DES");
            lllllllllllllllIIIIIIlIllIlIlIII.init(lIIIllllIllll[3], lllllllllllllllIIIIIIlIllIlIlIIl);
            return new String(lllllllllllllllIIIIIIlIllIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIlIllIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIIIlIllIlIIlll) {
            lllllllllllllllIIIIIIlIllIlIIlll.printStackTrace();
            return null;
        }
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
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (null != null) {
            return (0xA4 ^ 0x88 ^ (0x50 ^ 0x61)) & (0x9E ^ 0xC5 ^ (0xFA ^ 0xBC) ^ -1);
        }
        return lIIIllllIllll[71];
    }

    private static boolean lIlIIllIIIlIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIlIIllIIIIIlII(String lllllllllllllllIIIIIIlIllIIIIlII, String lllllllllllllllIIIIIIlIllIIIlIII) {
        lllllllllllllllIIIIIIlIllIIIIlII = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIIlIllIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIIIlIllIIIIlll = new StringBuilder();
        char[] lllllllllllllllIIIIIIlIllIIIIllI = lllllllllllllllIIIIIIlIllIIIlIII.toCharArray();
        int lllllllllllllllIIIIIIlIllIIIIlIl = lIIIllllIllll[0];
        char[] lllllllllllllllIIIIIIlIlIlllllll = lllllllllllllllIIIIIIlIllIIIIlII.toCharArray();
        int lllllllllllllllIIIIIIlIlIllllllI = lllllllllllllllIIIIIIlIlIlllllll.length;
        int lllllllllllllllIIIIIIlIlIlllllIl = lIIIllllIllll[0];
        while (C.lIlIIllIIIIlIll(lllllllllllllllIIIIIIlIlIlllllIl, lllllllllllllllIIIIIIlIlIllllllI)) {
            char lllllllllllllllIIIIIIlIllIIIlIlI = lllllllllllllllIIIIIIlIlIlllllll[lllllllllllllllIIIIIIlIlIlllllIl];
            lllllllllllllllIIIIIIlIllIIIIlll.append((char)(lllllllllllllllIIIIIIlIllIIIlIlI ^ lllllllllllllllIIIIIIlIllIIIIllI[lllllllllllllllIIIIIIlIllIIIIlIl % lllllllllllllllIIIIIIlIllIIIIllI.length]));
            0;
            ++lllllllllllllllIIIIIIlIllIIIIlIl;
            ++lllllllllllllllIIIIIIlIlIlllllIl;
            0;
            if (3 > -1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIIIlIllIIIIlll);
    }

    private static int lIlIIllIIIIlIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static String lIlIIllIIIIIlIl(String lllllllllllllllIIIIIIlIllIIllIIl, String lllllllllllllllIIIIIIlIllIIllIII) {
        try {
            SecretKeySpec lllllllllllllllIIIIIIlIllIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIlIllIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIIlIllIIllIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIIlIllIIllIll.init(lIIIllllIllll[3], lllllllllllllllIIIIIIlIllIIlllII);
            return new String(lllllllllllllllIIIIIIlIllIIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIlIllIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIIIlIllIIllIlI) {
            lllllllllllllllIIIIIIlIllIIllIlI.printStackTrace();
            return null;
        }
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
            0;
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

