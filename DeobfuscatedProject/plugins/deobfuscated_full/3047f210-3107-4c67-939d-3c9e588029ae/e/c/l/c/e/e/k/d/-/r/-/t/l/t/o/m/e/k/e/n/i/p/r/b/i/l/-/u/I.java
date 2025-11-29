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
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.ac;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.i;
import gg.squire.account.AccBuilderTempleTrek;
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

public class I
implements S {
    private static /* synthetic */ boolean hJ;
    private static /* synthetic */ boolean hI;
    private static final /* synthetic */ WorldPoint hC;
    private static final /* synthetic */ WorldPoint hD;
    static /* synthetic */ int ck;
    public static /* synthetic */ boolean bs;
    private static /* synthetic */ boolean hK;
    private static final /* synthetic */ WorldPoint hG;
    static /* synthetic */ boolean cl;
    private static final /* synthetic */ WorldPoint hB;
    public static final /* synthetic */ String[] hz;
    private static /* synthetic */ boolean hL;
    private static /* synthetic */ String[] lllllIllll;
    public static /* synthetic */ List<d> bu;
    private static final /* synthetic */ WorldPoint hE;
    private static final /* synthetic */ WorldPoint hA;
    private static /* synthetic */ boolean hH;
    private static final /* synthetic */ WorldPoint hF;
    private static /* synthetic */ int[] llllllIIIl;
    static /* synthetic */ int bS;

    private static String llIlIlIllIIIl(String var6, String var3) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(llllllIIIl[3], var19);
            return new String(var8.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean S() {
        return llllllIIIl[0];
    }

    static {
        I.llIlIllIIIlII();
        I.llIlIllIIIIll();
        String[] stringArray = new String[llllllIIIl[36]];
        stringArray[I.llllllIIIl[0]] = lllllIllll[llllllIIIl[75]];
        stringArray[I.llllllIIIl[1]] = lllllIllll[llllllIIIl[76]];
        stringArray[I.llllllIIIl[3]] = lllllIllll[llllllIIIl[77]];
        stringArray[I.llllllIIIl[5]] = lllllIllll[llllllIIIl[78]];
        stringArray[I.llllllIIIl[6]] = lllllIllll[llllllIIIl[79]];
        stringArray[I.llllllIIIl[7]] = lllllIllll[llllllIIIl[80]];
        stringArray[I.llllllIIIl[9]] = lllllIllll[llllllIIIl[81]];
        stringArray[I.llllllIIIl[21]] = lllllIllll[llllllIIIl[82]];
        stringArray[I.llllllIIIl[20]] = lllllIllll[llllllIIIl[83]];
        stringArray[I.llllllIIIl[22]] = lllllIllll[llllllIIIl[84]];
        stringArray[I.llllllIIIl[16]] = lllllIllll[llllllIIIl[85]];
        stringArray[I.llllllIIIl[23]] = lllllIllll[llllllIIIl[86]];
        stringArray[I.llllllIIIl[24]] = lllllIllll[llllllIIIl[87]];
        stringArray[I.llllllIIIl[25]] = lllllIllll[llllllIIIl[88]];
        stringArray[I.llllllIIIl[26]] = lllllIllll[llllllIIIl[89]];
        stringArray[I.llllllIIIl[27]] = lllllIllll[llllllIIIl[90]];
        stringArray[I.llllllIIIl[29]] = lllllIllll[llllllIIIl[91]];
        stringArray[I.llllllIIIl[30]] = lllllIllll[llllllIIIl[92]];
        stringArray[I.llllllIIIl[31]] = lllllIllll[llllllIIIl[93]];
        stringArray[I.llllllIIIl[33]] = lllllIllll[llllllIIIl[94]];
        stringArray[I.llllllIIIl[34]] = lllllIllll[llllllIIIl[95]];
        stringArray[I.llllllIIIl[35]] = lllllIllll[llllllIIIl[96]];
        hz = stringArray;
        hA = new WorldPoint(llllllIIIl[97], llllllIIIl[98], llllllIIIl[0]);
        hB = new WorldPoint(llllllIIIl[99], llllllIIIl[100], llllllIIIl[0]);
        hC = new WorldPoint(llllllIIIl[101], llllllIIIl[102], llllllIIIl[0]);
        hD = new WorldPoint(llllllIIIl[103], llllllIIIl[104], llllllIIIl[0]);
        hE = new WorldPoint(llllllIIIl[105], llllllIIIl[106], llllllIIIl[0]);
        hF = new WorldPoint(llllllIIIl[107], llllllIIIl[108], llllllIIIl[1]);
        hG = new WorldPoint(llllllIIIl[109], llllllIIIl[110], llllllIIIl[0]);
        bu = new ArrayList<d>();
        bS = llllllIIIl[0];
    }

    private static void llIlIllIIIIll() {
        lllllIllll = new String[llllllIIIl[111]];
        I.lllllIllll[I.llllllIIIl[0]] = I."Buying items";
        I.lllllIllll[I.llllllIIIl[1]] = I."Finished buying items, switching back to quest";
        I.lllllIllll[I.llllllIIIl[3]] = I."Drink";
        I.lllllIllll[I.llllllIIIl[5]] = I."Eat";
        I.lllllIllll[I.llllllIIIl[6]] = I."Nav to bank";
        I.lllllIllll[I.llllllIIIl[7]] = I."Handling banking";
        I.lllllIllll[I.llllllIIIl[9]] = I."We are missing quest supplies, switching to BUYING";
        I.lllllIllll[I.llllllIIIl[21]] = I."Nav to start";
        I.lllllIllll[I.llllllIIIl[20]] = I."Interact npc";
        I.lllllIllll[I.llllllIIIl[22]] = I."Redbeard Frank";
        I.lllllIllll[I.llllllIIIl[16]] = I."Nav to luthas";
        I.lllllIllll[I.llllllIIIl[23]] = I."Talk luthas";
        I.lllllIllll[I.llllllIIIl[24]] = I."Luthas";
        I.lllllIllll[I.llllllIIIl[25]] = I."the crate isn't";
        I.lllllIllll[I.llllllIIIl[26]] = I."Nav to Zembo";
        I.lllllIllll[I.llllllIIIl[27]] = I."Buy rum";
        I.lllllIllll[I.llllllIIIl[29]] = I."Zembo";
        I.lllllIllll[I.llllllIIIl[30]] = I."Trade";
        I.lllllIllll[I.llllllIIIl[31]] = I."Buy 1";
        I.lllllIllll[I.llllllIIIl[33]] = I."Nav to luthas";
        I.lllllIllll[I.llllllIIIl[34]] = I."Filling crate";
        I.lllllIllll[I.llllllIIIl[35]] = I."Crate";
        I.lllllIllll[I.llllllIIIl[36]] = I."Fill";
        I.lllllIllll[I.llllllIIIl[37]] = I."Finishing job";
        I.lllllIllll[I.llllllIIIl[38]] = I."Luthas";
        I.lllllIllll[I.llllllIIIl[39]] = I."be on my way";
        I.lllllIllll[I.llllllIIIl[40]] = I."Nav to wydin";
        I.lllllIllll[I.llllllIIIl[41]] = I."Wear";
        I.lllllIllll[I.llllllIIIl[42]] = I."Wydin";
        I.lllllIllll[I.llllllIIIl[43]] = I."can I work out front";
        I.lllllIllll[I.llllllIIIl[46]] = I."Nav to rum";
        I.lllllIllll[I.llllllIIIl[48]] = I."Search";
        I.lllllIllll[I.llllllIIIl[49]] = I."Nav to start";
        I.lllllIllll[I.llllllIIIl[50]] = I."Interact npc";
        I.lllllIllll[I.llllllIIIl[51]] = I."Redbeard Frank";
        I.lllllIllll[I.llllllIIIl[52]] = I."Nav to chest";
        I.lllllIllll[I.llllllIIIl[53]] = I."Getting message";
        I.lllllIllll[I.llllllIIIl[56]] = I."Chest";
        I.lllllIllll[I.llllllIIIl[57]] = I."Read";
        I.lllllIllll[I.llllllIIIl[58]] = I."Nav to dig spot";
        I.lllllIllll[I.llllllIIIl[59]] = I."Digging";
        I.lllllIllll[I.llllllIIIl[60]] = I."Spade";
        I.lllllIllll[I.llllllIIIl[61]] = I."Dig";
        I.lllllIllll[I.llllllIIIl[62]] = I."Spade";
        I.lllllIllll[I.llllllIIIl[72]] = I."Pirates treasure quest";
        I.lllllIllll[I.llllllIIIl[73]] = I."ring of wealth (";
        I.lllllIllll[I.llllllIIIl[74]] = I."Fill";
        I.lllllIllll[I.llllllIIIl[75]] = I."Ok, I'm up for an adventure.";
        I.lllllIllll[I.llllllIIIl[76]] = I."A glass of your finest ale please.";
        I.lllllIllll[I.llllllIIIl[77]] = I."Morgan needs your help!";
        I.lllllIllll[I.llllllIIIl[78]] = I."Yes.";
        I.lllllIllll[I.llllllIIIl[79]] = I."I'm looking for a quest!";
        I.lllllIllll[I.llllllIIIl[80]] = I."Ok, let me help then.";
        I.lllllIllll[I.llllllIIIl[81]] = I."Father Aereck sent me to talk to you.";
        I.lllllIllll[I.llllllIIIl[82]] = I."He's got a ghost haunting his graveyard.";
        I.lllllIllll[I.llllllIIIl[83]] = I."Yep, now tell me what the problem is.";
        I.lllllIllll[I.llllllIIIl[84]] = I."Sure.";
        I.lllllIllll[I.llllllIIIl[85]] = I."I'm wearing an amulet of ghost speak!";
        I.lllllIllll[I.llllllIIIl[86]] = I."Yes, I'm sure.";
        I.lllllIllll[I.llllllIIIl[87]] = I."How can I help?";
        I.lllllIllll[I.llllllIIIl[88]] = I."I'm looking for a quest.";
        I.lllllIllll[I.llllllIIIl[89]] = I."I'm in search of treasure.";
        I.lllllIllll[I.llllllIIIl[90]] = I."Yes.";
        I.lllllIllll[I.llllllIIIl[91]] = I."Could you offer me employment on your plantation?";
        I.lllllIllll[I.llllllIIIl[92]] = I."Thank you, I'll be on my way";
        I.lllllIllll[I.llllllIIIl[93]] = I."Can I get a job here?";
        I.lllllIllll[I.llllllIIIl[94]] = I."Can I journey on this ship?";
        I.lllllIllll[I.llllllIIIl[95]] = I."Search away, I have nothing to hide.";
        I.lllllIllll[I.llllllIIIl[96]] = I."Ok.";
    }

    public static void cU() {
        if (I.llIlIllIIIllI(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[0]];
            b.a(bu);
            if (I.llIlIllIIIlll(bu.size(), llllllIIIl[1])) {
                System.out.println(lllllIllll[llllllIIIl[1]]);
                bs = llllllIIIl[0];
            }
        }
        if (I.llIlIllIIlIII(bs ? 1 : 0)) {
            Object var11;
            if (I.llIlIllIIIllI(Inventory.contains((int[])f.aU) ? 1 : 0) && I.llIlIllIIIlll(Movement.getRunEnergy(), llllllIIIl[2])) {
                Inventory.getFirst((int[])f.aU).interact(lllllIllll[llllllIIIl[3]]);
                Time.sleepTicks((int)llllllIIIl[1]);
                0;
            }
            if (I.llIlIllIIlIIl(I.llIlIllIIIlIl(e.u(), 70.0))) {
                int[] nArray = new int[llllllIIIl[1]];
                nArray[I.llllllIIIl[0]] = llllllIIIl[4];
                if (I.llIlIllIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[llllllIIIl[1]];
                    nArray2[I.llllllIIIl[0]] = llllllIIIl[4];
                    Inventory.getFirst((int[])nArray2).interact(lllllIllll[llllllIIIl[5]]);
                }
            }
            if (I.llIlIllIIlIII(Movement.isRunEnabled() ? 1 : 0) && I.llIlIllIIlIlI(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (I.llIlIllIIlIII(I.aa() ? 1 : 0) && I.llIlIllIIlIII(Vars.getVarp((int)QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()))) {
                var11 = BankLocation.getNearest();
                if (I.llIlIllIIlIll(var11) && I.llIlIllIIlIII(var11.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[6]];
                    a.a((BankLocation)var11);
                    Time.sleepTicks((int)llllllIIIl[3]);
                    0;
                }
                if (I.llIlIllIIlIll(var11) && I.llIlIllIIIllI(var11.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[7]];
                    if (I.llIlIllIIlIII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llllllIIIl[8]);
                        0;
                    }
                    if (I.llIlIllIIIllI(Bank.isOpen() ? 1 : 0)) {
                        if (I.llIlIllIIlIlI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llllllIIIl[6]);
                            0;
                        }
                        if (I.llIlIllIIlIlI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llllllIIIl[3]);
                            0;
                        }
                        int[] nArray = new int[llllllIIIl[9]];
                        nArray[I.llllllIIIl[0]] = llllllIIIl[10];
                        nArray[I.llllllIIIl[1]] = llllllIIIl[11];
                        nArray[I.llllllIIIl[3]] = llllllIIIl[12];
                        nArray[I.llllllIIIl[5]] = llllllIIIl[13];
                        nArray[I.llllllIIIl[6]] = llllllIIIl[14];
                        nArray[I.llllllIIIl[7]] = llllllIIIl[15];
                        if (I.llIlIllIIlIII(e.b(nArray) ? 1 : 0)) {
                            I.ae();
                            System.out.println(lllllIllll[llllllIIIl[9]]);
                            bs = llllllIIIl[1];
                            return;
                        }
                        Bank.withdraw((int)llllllIIIl[11], (int)llllllIIIl[16], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llllllIIIl[1]);
                        0;
                        Bank.withdraw((int)llllllIIIl[15], (int)llllllIIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llllllIIIl[1]);
                        0;
                        Bank.withdraw((int)llllllIIIl[14], (int)llllllIIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llllllIIIl[1]);
                        0;
                        Bank.withdraw((int)llllllIIIl[17], (int)llllllIIIl[16], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llllllIIIl[1]);
                        0;
                        Bank.withdraw((int)llllllIIIl[13], (int)llllllIIIl[7], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llllllIIIl[1]);
                        0;
                        Bank.withdraw((int)llllllIIIl[10], (int)llllllIIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llllllIIIl[1]);
                        0;
                        a.a(llllllIIIl[18], llllllIIIl[19]);
                        a.b(f.aU, llllllIIIl[3]);
                        a.b(f.be, llllllIIIl[1]);
                    }
                }
            }
            if (I.llIlIllIIIllI(I.aa() ? 1 : 0) && I.llIlIllIIlIII(Vars.getVarp((int)QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()))) {
                if (I.llIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(hA), llllllIIIl[20])) {
                    AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[21]];
                    if (I.llIlIllIIIllI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)hA);
                    0;
                    Time.sleepTicks((int)llllllIIIl[1]);
                    0;
                }
                if (I.llIlIllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hA), llllllIIIl[20])) {
                    AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[20]];
                    g.a(lllllIllll[llllllIIIl[22]], hz);
                }
            }
            if (I.llIlIllIIlllI(Vars.getVarp((int)QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()), llllllIIIl[1])) {
                int var5;
                ck = llllllIIIl[0];
                if (I.llIlIllIIlIII(hH ? 1 : 0)) {
                    if (I.llIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(hB), llllllIIIl[5])) {
                        AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[16]];
                        Movement.walkTo((WorldPoint)hB);
                        0;
                        Time.sleepTicks((int)llllllIIIl[1]);
                        0;
                    }
                    if (I.llIlIllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hB), llllllIIIl[5])) {
                        AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[23]];
                        g.a(lllllIllll[llllllIIIl[24]], hz);
                        var11 = Dialog.getOptions();
                        if (I.llIlIllIIlIII(var11.isEmpty() ? 1 : 0)) {
                            var5 = llllllIIIl[0];
                            while (I.llIlIllIIIlll(var5, var11.size())) {
                                if (I.llIlIllIIIllI(((Widget)var11.get(var5)).getText().contains(lllllIllll[llllllIIIl[25]]) ? 1 : 0)) {
                                    hH = llllllIIIl[1];
                                }
                                ++var5;
                                0;
                                if (((0xD ^ 4 ^ (0x43 ^ 0x5D)) & (0xD8 ^ 0x9D ^ (0xC2 ^ 0x90) ^ -1)) <= 1) continue;
                                return;
                            }
                        }
                    }
                }
                if (I.llIlIllIIIllI(hH ? 1 : 0) && I.llIlIllIIlIII(hJ ? 1 : 0)) {
                    if (I.llIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(hC), llllllIIIl[7])) {
                        AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[26]];
                        Movement.walkTo((WorldPoint)hC);
                        0;
                        Time.sleepTicks((int)llllllIIIl[1]);
                        0;
                    }
                    if (I.llIlIllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hC), llllllIIIl[7])) {
                        AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[27]];
                        var11 = Widgets.get((int)llllllIIIl[28], (int)llllllIIIl[29], (int)llllllIIIl[3]);
                        if (I.llIlIllIIllll(var11)) {
                            String[] stringArray = new String[llllllIIIl[1]];
                            stringArray[I.llllllIIIl[0]] = lllllIllll[llllllIIIl[29]];
                            NPCs.getNearest((String[])stringArray).interact(lllllIllll[llllllIIIl[30]]);
                            Time.sleepTicks((int)llllllIIIl[3]);
                            0;
                        }
                        if (I.llIlIllIIlIll(var11)) {
                            var11.interact(lllllIllll[llllllIIIl[31]]);
                            Time.sleepTicks((int)llllllIIIl[1]);
                            0;
                        }
                    }
                    int[] nArray = new int[llllllIIIl[1]];
                    nArray[I.llllllIIIl[0]] = llllllIIIl[32];
                    if (I.llIlIllIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        hJ = llllllIIIl[1];
                    }
                }
                if (I.llIlIllIIIllI(hH ? 1 : 0) && I.llIlIllIIIllI(hJ ? 1 : 0) && I.llIlIllIIlIII(hI ? 1 : 0)) {
                    if (I.llIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(hB), llllllIIIl[9])) {
                        AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[33]];
                        Movement.walkTo((WorldPoint)hB);
                        0;
                        Time.sleepTicks((int)llllllIIIl[1]);
                        0;
                    }
                    if (I.llIlIllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hB), llllllIIIl[9])) {
                        AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[34]];
                        int[] nArray = new int[llllllIIIl[1]];
                        nArray[I.llllllIIIl[0]] = llllllIIIl[11];
                        if (I.llIlIllIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            String[] stringArray = new String[llllllIIIl[1]];
                            stringArray[I.llllllIIIl[0]] = lllllIllll[llllllIIIl[35]];
                            TileObjects.getNearest((String[])stringArray).interact(lllllIllll[llllllIIIl[36]]);
                            Time.sleepTicks((int)llllllIIIl[5]);
                            0;
                        }
                        int[] nArray3 = new int[llllllIIIl[1]];
                        nArray3[I.llllllIIIl[0]] = llllllIIIl[11];
                        if (I.llIlIllIIlIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[llllllIIIl[1]];
                            nArray4[I.llllllIIIl[0]] = llllllIIIl[32];
                            Inventory.getFirst((int[])nArray4).useOn(TileObjects.getNearest(tileObject -> {
                                String[] stringArray = new String[llllllIIIl[1]];
                                stringArray[I.llllllIIIl[0]] = lllllIllll[llllllIIIl[74]];
                                return tileObject.hasAction(stringArray);
                            }));
                            Time.sleepTicks((int)llllllIIIl[5]);
                            0;
                        }
                        int[] nArray5 = new int[llllllIIIl[1]];
                        nArray5[I.llllllIIIl[0]] = llllllIIIl[11];
                        if (I.llIlIllIIlIII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                            int[] nArray6 = new int[llllllIIIl[1]];
                            nArray6[I.llllllIIIl[0]] = llllllIIIl[32];
                            if (I.llIlIllIIlIII(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                                hI = llllllIIIl[1];
                            }
                        }
                    }
                }
                if (I.llIlIllIIIllI(hI ? 1 : 0) && I.llIlIllIIIllI(hH ? 1 : 0) && I.llIlIllIIIllI(hJ ? 1 : 0) && I.llIlIllIIlIII(hK ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[37]];
                    g.a(lllllIllll[llllllIIIl[38]], hz);
                    var11 = Dialog.getText();
                    if (I.llIlIllIIlIll(var11) && I.llIlIllIIIllI(((String)var11).contains(lllllIllll[llllllIIIl[39]]) ? 1 : 0)) {
                        hK = llllllIIIl[1];
                    }
                }
                if (I.llIlIllIIIllI(hI ? 1 : 0) && I.llIlIllIIIllI(hH ? 1 : 0) && I.llIlIllIIIllI(hJ ? 1 : 0) && I.llIlIllIIIllI(hK ? 1 : 0) && I.llIlIllIIlIII(hL ? 1 : 0)) {
                    if (I.llIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(hD), llllllIIIl[5])) {
                        AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[40]];
                        int[] nArray = new int[llllllIIIl[1]];
                        nArray[I.llllllIIIl[0]] = llllllIIIl[14];
                        if (I.llIlIllIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray7 = new int[llllllIIIl[1]];
                            nArray7[I.llllllIIIl[0]] = llllllIIIl[14];
                            Inventory.getFirst((int[])nArray7).interact(lllllIllll[llllllIIIl[41]]);
                        }
                        g.a(hz);
                        if (I.llIlIllIIlIII(Dialog.isOpen() ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)hD);
                            0;
                            Time.sleepTicks((int)llllllIIIl[1]);
                            0;
                        }
                    }
                    if (I.llIlIllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hD), llllllIIIl[5])) {
                        g.a(lllllIllll[llllllIIIl[42]], hz);
                    }
                    if (I.llIlIllIIlIII((var11 = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                        var5 = llllllIIIl[0];
                        while (I.llIlIllIIIlll(var5, var11.size())) {
                            if (I.llIlIllIIIllI(((Widget)var11.get(var5)).getText().contains(lllllIllll[llllllIIIl[43]]) ? 1 : 0)) {
                                hL = llllllIIIl[1];
                            }
                            ++var5;
                            0;
                            if (((98 + 142 - 81 + 53 ^ 118 + 54 - 127 + 105) & (0xB8 ^ 0xB0 ^ (0xE9 ^ 0xA3) ^ -1)) == 0) continue;
                            return;
                        }
                    }
                }
                if (I.llIlIllIIIllI(hI ? 1 : 0) && I.llIlIllIIIllI(hH ? 1 : 0) && I.llIlIllIIIllI(hJ ? 1 : 0) && I.llIlIllIIIllI(hK ? 1 : 0) && I.llIlIllIIIllI(hL ? 1 : 0)) {
                    int[] nArray = new int[llllllIIIl[1]];
                    nArray[I.llllllIIIl[0]] = llllllIIIl[32];
                    if (I.llIlIllIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        if (!I.llIlIllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hE), llllllIIIl[3]) || !I.llIlIllIlIIII(Players.getLocal().getWorldLocation().getX(), llllllIIIl[44]) || I.llIlIllIlIIII(Players.getLocal().getWorldLocation().getX(), llllllIIIl[45])) {
                            AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[46]];
                            Movement.walkTo((WorldPoint)hE);
                            0;
                            Time.sleepTicks((int)llllllIIIl[1]);
                            0;
                        }
                        if (I.llIlIllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hE), llllllIIIl[3]) && I.llIlIllIlIIII(Players.getLocal().getWorldLocation().getX(), llllllIIIl[44]) && I.llIlIllIIIlll(Players.getLocal().getWorldLocation().getX(), llllllIIIl[45])) {
                            int[] nArray8 = new int[llllllIIIl[1]];
                            nArray8[I.llllllIIIl[0]] = llllllIIIl[47];
                            TileObjects.getNearest((int[])nArray8).interact(lllllIllll[llllllIIIl[48]]);
                            Time.sleepTicks((int)llllllIIIl[3]);
                            0;
                        }
                    }
                }
                if (I.llIlIllIIIllI(hI ? 1 : 0) && I.llIlIllIIIllI(hH ? 1 : 0) && I.llIlIllIIIllI(hJ ? 1 : 0) && I.llIlIllIIIllI(hK ? 1 : 0) && I.llIlIllIIIllI(hL ? 1 : 0)) {
                    int[] nArray = new int[llllllIIIl[1]];
                    nArray[I.llllllIIIl[0]] = llllllIIIl[32];
                    if (I.llIlIllIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        if (I.llIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(hA), llllllIIIl[20])) {
                            AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[49]];
                            Movement.walkTo((WorldPoint)hA);
                            0;
                            Time.sleepTicks((int)llllllIIIl[1]);
                            0;
                        }
                        if (I.llIlIllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hA), llllllIIIl[20])) {
                            AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[50]];
                            g.a(lllllIllll[llllllIIIl[51]], hz);
                        }
                    }
                }
            }
            if (I.llIlIllIIlllI(Vars.getVarp((int)QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()), llllllIIIl[3])) {
                if (I.llIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(hF), llllllIIIl[5])) {
                    AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[52]];
                    Movement.walkTo((WorldPoint)hF);
                    0;
                    Time.sleepTicks((int)llllllIIIl[1]);
                    0;
                }
                if (I.llIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(hF), llllllIIIl[5])) {
                    AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[53]];
                    int[] nArray = new int[llllllIIIl[1]];
                    nArray[I.llllllIIIl[0]] = llllllIIIl[54];
                    if (I.llIlIllIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray9 = new int[llllllIIIl[1]];
                        nArray9[I.llllllIIIl[0]] = llllllIIIl[55];
                        String[] stringArray = new String[llllllIIIl[1]];
                        stringArray[I.llllllIIIl[0]] = lllllIllll[llllllIIIl[56]];
                        Inventory.getFirst((int[])nArray9).useOn(TileObjects.getNearest((String[])stringArray));
                        Time.sleepTicks((int)llllllIIIl[3]);
                        0;
                    }
                    int[] nArray10 = new int[llllllIIIl[1]];
                    nArray10[I.llllllIIIl[0]] = llllllIIIl[54];
                    if (I.llIlIllIIIllI(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                        int[] nArray11 = new int[llllllIIIl[1]];
                        nArray11[I.llllllIIIl[0]] = llllllIIIl[54];
                        Inventory.getFirst((int[])nArray11).interact(lllllIllll[llllllIIIl[57]]);
                        Time.sleepTicks((int)llllllIIIl[3]);
                        0;
                    }
                }
            }
            if (I.llIlIllIIlllI(Vars.getVarp((int)QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()), llllllIIIl[5])) {
                if (I.llIlIllIIlIII(Players.getLocal().getWorldLocation().equals((Object)hG) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[58]];
                    Movement.walkTo((WorldPoint)hG);
                    0;
                    Time.sleepTicks((int)llllllIIIl[1]);
                    0;
                }
                if (I.llIlIllIIIllI(Players.getLocal().getWorldLocation().equals((Object)hG) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[59]];
                    if (I.llIlIllIIllll(Players.getLocal().getInteracting())) {
                        if (I.llIlIllIIIlll(ck, llllllIIIl[1])) {
                            ac.mR += llllllIIIl[1];
                            ac.d(AccBuilderTempleTrek.m);
                            ck += llllllIIIl[1];
                            ac.mR = llllllIIIl[0];
                            cl = llllllIIIl[0];
                        }
                        String[] stringArray = new String[llllllIIIl[1]];
                        stringArray[I.llllllIIIl[0]] = lllllIllll[llllllIIIl[60]];
                        Inventory.getFirst((String[])stringArray).interact(lllllIllll[llllllIIIl[61]]);
                        Time.sleepTicks((int)llllllIIIl[5]);
                        0;
                    }
                }
            }
            g.a(new String[llllllIIIl[0]]);
            System.out.println("Setting: " + Vars.getVarp((int)QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()));
        }
    }

    private static void llIlIllIIIlII() {
        llllllIIIl = new int[112];
        I.llllllIIIl[0] = (155 + 168 - 159 + 36 ^ 105 + 78 - 47 + 1) & (0x7A ^ 0x6D ^ (8 ^ 0x5E) ^ -1);
        I.llllllIIIl[1] = 1;
        I.llllllIIIl[2] = 149 + 99 - 125 + 71 ^ 31 + 122 - 128 + 107;
        I.llllllIIIl[3] = 2;
        I.llllllIIIl[4] = 0xFFFFBFFF & 0x417B;
        I.llllllIIIl[5] = 3;
        I.llllllIIIl[6] = 0x85 ^ 0x81;
        I.llllllIIIl[7] = 0xB3 ^ 0xB6;
        I.llllllIIIl[8] = 0xFFFFB78C & 0x5BFB;
        I.llllllIIIl[9] = 0x79 ^ 0x7F;
        I.llllllIIIl[10] = -(0xFFFFE76F & 0x59B6) & (0xFFFFEFEF & Short.MAX_VALUE);
        I.llllllIIIl[11] = 0xFFFFD7BF & 0x2FEB;
        I.llllllIIIl[12] = -(0xFFFFDEF9 & 0x2FAF) & (0xFFFFFFFB & 0x3FFD);
        I.llllllIIIl[13] = 0xFFFFBFEF & 0x5F57;
        I.llllllIIIl[14] = -(0xFFFFFB7F & 0x4C91) & (0xFFFFDFFF & 0x6BFD);
        I.llllllIIIl[15] = 0xFFFFF3BC & 0xFFB;
        I.llllllIIIl[16] = 5 + 75 - 3 + 64 ^ 77 + 52 - 79 + 85;
        I.llllllIIIl[17] = 0xFFFFBF4D & 0x5FFB;
        I.llllllIIIl[18] = 0xFFFFB3F7 & 0x4FEB;
        I.llllllIIIl[19] = -(0xFFFFEE17 & 0x35FB) & (0xFFFFF7FE & 0x2FFB);
        I.llllllIIIl[20] = 3 ^ 0x47 ^ (0x53 ^ 0x1F);
        I.llllllIIIl[21] = 0x77 ^ 0x7D ^ (0x7E ^ 0x73);
        I.llllllIIIl[22] = 0x16 ^ 0x6C ^ (0x5E ^ 0x2D);
        I.llllllIIIl[23] = 0x2F ^ 0x5C ^ (0x1D ^ 0x65);
        I.llllllIIIl[24] = 0x18 ^ 0x14;
        I.llllllIIIl[25] = 0x9D ^ 0x90;
        I.llllllIIIl[26] = 0x41 ^ 0x4F;
        I.llllllIIIl[27] = 0x88 ^ 0x87;
        I.llllllIIIl[28] = -(0xFFFF97DD & 0x7EF6) & (0xFFFFB7FF & 0x5FFF);
        I.llllllIIIl[29] = 0x3D ^ 0x2D;
        I.llllllIIIl[30] = 0x9A ^ 0x8B;
        I.llllllIIIl[31] = 0xD1 ^ 0xC3;
        I.llllllIIIl[32] = 0xFFFFE7EF & 0x19BF;
        I.llllllIIIl[33] = 0xF8 ^ 0xB0 ^ (0xD3 ^ 0x88);
        I.llllllIIIl[34] = 0xB3 ^ 0xA7;
        I.llllllIIIl[35] = 18 + 38 - -116 + 7 ^ 115 + 71 - 84 + 64;
        I.llllllIIIl[36] = 0x28 ^ 0x58 ^ (0xCB ^ 0xAD);
        I.llllllIIIl[37] = 0xD0 ^ 0xC7;
        I.llllllIIIl[38] = 0x69 ^ 0x71;
        I.llllllIIIl[39] = 0x30 ^ 0x29;
        I.llllllIIIl[40] = 0xE5 ^ 0xAF ^ (0xDD ^ 0x8D);
        I.llllllIIIl[41] = 0xED ^ 0x97 ^ (0xA2 ^ 0xC3);
        I.llllllIIIl[42] = 0x3D ^ 0x21;
        I.llllllIIIl[43] = 0x69 ^ 0x74;
        I.llllllIIIl[44] = 0xFFFFDBF7 & 0x2FC9;
        I.llllllIIIl[45] = -(0xFFFFF0B1 & 0x7F7F) & (0xFFFFFFF4 & 0x7BFF);
        I.llllllIIIl[46] = 0x4F ^ 0x51;
        I.llllllIIIl[47] = -(0xFFFFAFD1 & 0x766F) & (0xFFFFEE5F & 0x3FF7);
        I.llllllIIIl[48] = 59 + 124 - 164 + 152 ^ 170 + 87 - 137 + 60;
        I.llllllIIIl[49] = 0x8D ^ 0xAD;
        I.llllllIIIl[50] = 0x20 ^ 1;
        I.llllllIIIl[51] = 0xB0 ^ 0x92;
        I.llllllIIIl[52] = 0xA3 ^ 0x95 ^ (0xD6 ^ 0xC3);
        I.llllllIIIl[53] = 0xA6 ^ 0x82;
        I.llllllIIIl[54] = 0xFFFFCBBB & 0x35F5;
        I.llllllIIIl[55] = -(0xFFFFE75F & 0x3CF0) & (0xFFFFBFFF & 0x65FF);
        I.llllllIIIl[56] = 0x7E ^ 0x5B;
        I.llllllIIIl[57] = 0x6D ^ 0x7A ^ (0x53 ^ 0x62);
        I.llllllIIIl[58] = 0x7E ^ 0x59;
        I.llllllIIIl[59] = 0x4D ^ 0x65;
        I.llllllIIIl[60] = 0x18 ^ 0x31;
        I.llllllIIIl[61] = 0x75 ^ 0x3E ^ (0x28 ^ 0x49);
        I.llllllIIIl[62] = 0x3C ^ 0x4D ^ (0x61 ^ 0x3B);
        I.llllllIIIl[63] = 0xFFFF975C & 0x7FAF;
        I.llllllIIIl[64] = -(0xFFFFBB7B & 0x6585) & (0xFFFFBBFF & 0x7FF4);
        I.llllllIIIl[65] = -(0xFFFFA553 & 0x7AFF) & (0xFFFFAFFF & 0x73D6);
        I.llllllIIIl[66] = -(0xFFFFE0EB & 0x3F96) & (0xFFFFFDDD & Short.MAX_VALUE);
        I.llllllIIIl[67] = 0xFFFFFFCF & 0x2EFC;
        I.llllllIIIl[68] = -(0xFFFFAEBB & 0x5B56) & (0xFFFFFBBB & 0x6FFD);
        I.llllllIIIl[69] = -(0xFFFFE7B5 & 0x78DB) & (0xFFFFFFFB & 0x7FDC);
        I.llllllIIIl[70] = 0xFFFFE7FF & 0x1F6C;
        I.llllllIIIl[71] = 3 ^ 0x67;
        I.llllllIIIl[72] = 111 + 8 - -25 + 1 ^ 68 + 20 - -68 + 33;
        I.llllllIIIl[73] = 0xEB ^ 0x9E ^ (0xD5 ^ 0x8D);
        I.llllllIIIl[74] = 2 ^ (0x2B ^ 7);
        I.llllllIIIl[75] = 2 ^ (0x86 ^ 0xAB);
        I.llllllIIIl[76] = 0x45 ^ 0xC ^ (0x76 ^ 0xF);
        I.llllllIIIl[77] = 0x92 ^ 0xA3;
        I.llllllIIIl[78] = 0x4D ^ 1 ^ (0xDF ^ 0xA1);
        I.llllllIIIl[79] = 0x9C ^ 0xAF;
        I.llllllIIIl[80] = 0x30 ^ 4;
        I.llllllIIIl[81] = 136 + 59 - 187 + 139 ^ 13 + 60 - 30 + 123;
        I.llllllIIIl[82] = 0x49 ^ 0x7F;
        I.llllllIIIl[83] = 0x1F ^ 0x30 ^ (0x2D ^ 0x35);
        I.llllllIIIl[84] = 148 + 123 - 118 + 8 ^ 53 + 5 - 17 + 112;
        I.llllllIIIl[85] = 85 + 82 - 111 + 128 ^ 17 + 63 - -33 + 16;
        I.llllllIIIl[86] = 62 + 39 - 9 + 42 ^ 161 + 100 - 151 + 78;
        I.llllllIIIl[87] = 0xFF ^ 0xC4;
        I.llllllIIIl[88] = 0xA5 ^ 0x99;
        I.llllllIIIl[89] = 0x2D ^ 0x10;
        I.llllllIIIl[90] = 0x18 ^ 0x26;
        I.llllllIIIl[91] = 0xC5 ^ 0xAA ^ (0xD1 ^ 0x81);
        I.llllllIIIl[92] = 0x44 ^ 4;
        I.llllllIIIl[93] = 0xD7 ^ 0x96;
        I.llllllIIIl[94] = 0xFB ^ 0x85 ^ (0xBF ^ 0x83);
        I.llllllIIIl[95] = 0xC9 ^ 0x8A;
        I.llllllIIIl[96] = 0x61 ^ 0x17 ^ (0x90 ^ 0xA2);
        I.llllllIIIl[97] = -(0xFFFFDFD3 & 0x343D) & (0xFFFFFFFF & 0x1FFE);
        I.llllllIIIl[98] = 0xFFFF9EF7 & 0x6DBD;
        I.llllllIIIl[99] = -(0xFFFFF4C5 & 0x2B3F) & (0xFFFFAFFF & 0x7B7E);
        I.llllllIIIl[100] = 0xFFFFFC51 & 0xFFE;
        I.llllllIIIl[101] = -(0xFFFFFD6F & 0x6697) & (0xFFFFEF77 & 0x7FFE);
        I.llllllIIIl[102] = 0xFFFF8C69 & 0x7FDE;
        I.llllllIIIl[103] = 0xFFFFAFE6 & 0x5BDF;
        I.llllllIIIl[104] = 0xFFFF8E9D & 0x7DE6;
        I.llllllIIIl[105] = 0xFFFFEBCE & 0x1FF3;
        I.llllllIIIl[106] = 0xFFFFDFBC & 0x2CCB;
        I.llllllIIIl[107] = -(0xFFFFBE3F & 0x53E9) & (0xFFFFBEFF & 0x5FBB);
        I.llllllIIIl[108] = -(0xFFFFF2DF & 0x7D39) & (0xFFFFFD5F & 0x7FFB);
        I.llllllIIIl[109] = -(0xFFFFF4CB & 0x5F7D) & (0xFFFFFFFF & 0x5FFF);
        I.llllllIIIl[110] = 0xFFFFADF7 & 0x5F3F;
        I.llllllIIIl[111] = 81 + 233 - 121 + 56 ^ 2 + 12 - -157 + 17;
    }

    private static String llIlIlIllIIII(String var22, String var4) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var14 = var4.toCharArray();
        int var13 = llllllIIIl[0];
        char[] var9 = var22.toCharArray();
        int var18 = var9.length;
        int var12 = llllllIIIl[0];
        while (I.llIlIllIIIlll(var12, var18)) {
            char var7 = var9[var12];
            var2.append((char)(var7 ^ var14[var13 % var14.length]));
            0;
            ++var13;
            ++var12;
            0;
            if (((0x3A ^ 0x75 ^ (0x2E ^ 0x7D)) & (0xC9 ^ 0x81 ^ (0x46 ^ 0x12) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var2);
    }

    @Override
    public boolean V() {
        boolean bl;
        if (I.llIlIllIIlllI(Vars.getVarp((int)QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()), llllllIIIl[6])) {
            bl = llllllIIIl[1];
            0;
            if (1 <= 0) {
                return ((0x5A ^ 0x52 ^ (0x79 ^ 0x46)) & (100 + 83 - 130 + 121 ^ 92 + 71 - 36 + 26 ^ -1)) != 0;
            }
        } else {
            bl = llllllIIIl[0];
        }
        return bl;
    }

    private static boolean llIlIllIIlIII(int n2) {
        return n2 == 0;
    }

    @Override
    public int T() {
        try {
            I.cU();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0xDC ^ 0x95) & ~(0xE4 ^ 0xAD)) != 0) {
            return (0xDD ^ 0x9B) & ~(0xD7 ^ 0x91);
        }
        return llllllIIIl[71];
    }

    private static boolean llIlIllIIllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static void ae() {
        block12: {
            d var17;
            block11: {
                Object var1;
                int[] nArray = new int[llllllIIIl[1]];
                nArray[I.llllllIIIl[0]] = llllllIIIl[15];
                if (I.llIlIllIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(llllllIIIl[15], llllllIIIl[1], llllllIIIl[63]);
                    bu.add(d2);
                    0;
                }
                int[] nArray2 = new int[llllllIIIl[1]];
                nArray2[I.llllllIIIl[0]] = llllllIIIl[14];
                if (I.llIlIllIIlIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    var1 = new d(llllllIIIl[14], llllllIIIl[1], llllllIIIl[64]);
                    bu.add((d)var1);
                    0;
                }
                int[] nArray3 = new int[llllllIIIl[1]];
                nArray3[I.llllllIIIl[0]] = llllllIIIl[11];
                if (I.llIlIllIIlIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    var1 = new d(llllllIIIl[11], llllllIIIl[16], llllllIIIl[65]);
                    bu.add((d)var1);
                    0;
                }
                int[] nArray4 = new int[llllllIIIl[1]];
                nArray4[I.llllllIIIl[0]] = llllllIIIl[10];
                if (I.llIlIllIIlIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    var1 = new d(llllllIIIl[10], llllllIIIl[1], llllllIIIl[66]);
                    bu.add((d)var1);
                    0;
                }
                if (I.llIlIllIIlIII(Bank.contains((Predicate)(var1 = item -> item.getName().toLowerCase().contains(lllllIllll[llllllIIIl[73]]))) ? 1 : 0)) {
                    var17 = new d(llllllIIIl[67], llllllIIIl[7], llllllIIIl[68]);
                    bu.add(var17);
                    0;
                }
                int[] nArray5 = new int[llllllIIIl[1]];
                nArray5[I.llllllIIIl[0]] = llllllIIIl[69];
                if (I.llIlIllIIlIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    var17 = new d(llllllIIIl[69], llllllIIIl[16], llllllIIIl[70]);
                    bu.add(var17);
                    0;
                }
                int[] nArray6 = new int[llllllIIIl[1]];
                nArray6[I.llllllIIIl[0]] = llllllIIIl[17];
                if (I.llIlIllIIlIII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                    var17 = new d(llllllIIIl[17], llllllIIIl[16], llllllIIIl[70]);
                    bu.add(var17);
                    0;
                }
                int[] nArray7 = new int[llllllIIIl[1]];
                nArray7[I.llllllIIIl[0]] = llllllIIIl[13];
                if (I.llIlIllIIlIII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    var17 = new d(llllllIIIl[13], llllllIIIl[59], llllllIIIl[70]);
                    bu.add(var17);
                    0;
                }
                int[] nArray8 = new int[llllllIIIl[1]];
                nArray8[I.llllllIIIl[0]] = llllllIIIl[12];
                if (!I.llIlIllIIIllI(Bank.contains((int[])nArray8) ? 1 : 0)) break block11;
                int[] nArray9 = new int[llllllIIIl[1]];
                nArray9[I.llllllIIIl[0]] = llllllIIIl[12];
                if (!I.llIlIllIIIllI(Bank.contains((int[])nArray9) ? 1 : 0)) break block12;
                int[] nArray10 = new int[llllllIIIl[1]];
                nArray10[I.llllllIIIl[0]] = llllllIIIl[12];
                if (!I.llIlIllIIIlll(Bank.getFirst((int[])nArray10).getQuantity(), llllllIIIl[6])) break block12;
            }
            var17 = new d(llllllIIIl[12], llllllIIIl[6], i.bp);
            bu.add(var17);
            0;
        }
    }

    private static boolean llIlIllIIllII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIlIllIIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIllIIlIll(Object object) {
        return object != null;
    }

    private static String llIlIlIllIIlI(String var15, String var20) {
        try {
            SecretKeySpec var23 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), llllllIIIl[20]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(llllllIIIl[3], var23);
            return new String(var16.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIllIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIllIIlIIl(int n2) {
        return n2 < 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aa() {
        int n2;
        int[] nArray = new int[llllllIIIl[1]];
        nArray[I.llllllIIIl[0]] = llllllIIIl[14];
        if (I.llIlIllIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            String[] stringArray = new String[llllllIIIl[1]];
            stringArray[I.llllllIIIl[0]] = lllllIllll[llllllIIIl[62]];
            if (I.llIlIllIIIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                int[] nArray2 = new int[llllllIIIl[1]];
                nArray2[I.llllllIIIl[0]] = llllllIIIl[11];
                if (I.llIlIllIIIllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    n2 = llllllIIIl[1];
                    0;
                    if (null == null) return n2 != 0;
                    return ((200 + 5 - 23 + 35 ^ 86 + 164 - 60 + 9) & (0x28 ^ 0x27 ^ (8 ^ 0x19) ^ -1)) != 0;
                }
            }
        }
        n2 = llllllIIIl[0];
        return n2 != 0;
    }

    private static boolean llIlIllIlIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static int llIlIllIIIlIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public String U() {
        return lllllIllll[llllllIIIl[72]];
    }

    private static boolean llIlIllIIlllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIlIllIIlIlI(int n2) {
        return n2 > 0;
    }

    private static boolean llIlIllIIllll(Object object) {
        return object == null;
    }
}

