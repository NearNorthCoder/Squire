/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.UHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.AHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.BHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.DHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.EHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.FHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.GHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.IHelper;
import gg.squire.account.AccBuilderRogues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class EHelper
implements G {
    
    public static final  String[] ik;
    static  boolean cl;
    static  int bT;
    public static  boolean bt;
    private static final  WorldPoint il;
    private static final  WorldPoint im;
    private static final  WorldPoint io;
    
    private static final  WorldPoint in;
    static  int ck;
    public static  List<d> bv;

    private static boolean llllIIlIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void llllIIIlllll() {
        lIIIlllIlI = new String[lIIIllllII[74]];
        E.lIIIlllIlI[E.lIIIllllII[0]] = "Buying items";
        E.lIIIlllIlI[E.lIIIllllII[1]] = "Finished buying items, switching back to quest";
        E.lIIIlllIlI[E.lIIIllllII[3]] = "Drink";
        E.lIIIlllIlI[E.lIIIllllII[5]] = "Eat";
        E.lIIIlllIlI[E.lIIIllllII[7]] = "Nav to bank";
        E.lIIIlllIlI[E.lIIIllllII[8]] = "Handling banking";
        E.lIIIlllIlI[E.lIIIllllII[14]] = "We are missing quest supplies, switching to BUYING";
        E.lIIIlllIlI[E.lIIIllllII[20]] = "Father Aereck";
        E.lIIIlllIlI[E.lIIIllllII[18]] = "Nav to start";
        E.lIIIlllIlI[E.lIIIllllII[21]] = "Starting quest";
        E.lIIIlllIlI[E.lIIIllllII[15]] = "Father Aereck";
        E.lIIIlllIlI[E.lIIIllllII[19]] = "Nav to necklace guy";
        E.lIIIlllIlI[E.lIIIllllII[22]] = "Interacting npc";
        E.lIIIlllIlI[E.lIIIllllII[23]] = "Door";
        E.lIIIlllIlI[E.lIIIllllII[24]] = "Open";
        E.lIIIlllIlI[E.lIIIllllII[25]] = "Open";
        E.lIIIlllIlI[E.lIIIllllII[26]] = "Father Urhney";
        E.lIIIlllIlI[E.lIIIllllII[28]] = "Wear";
        E.lIIIlllIlI[E.lIIIllllII[29]] = "Nav to coffin";
        E.lIIIlllIlI[E.lIIIllllII[30]] = "Handling coffin";
        E.lIIIlllIlI[E.lIIIllllII[31]] = "Restless ghost";
        E.lIIIlllIlI[E.lIIIllllII[32]] = "Restless ghost";
        E.lIIIlllIlI[E.lIIIllllII[33]] = "Coffin";
        E.lIIIlllIlI[E.lIIIllllII[34]] = "Open";
        E.lIIIlllIlI[E.lIIIllllII[35]] = "Nav to skull";
        E.lIIIlllIlI[E.lIIIllllII[36]] = "Getting skull";
        E.lIIIlllIlI[E.lIIIllllII[37]] = "Altar";
        E.lIIIlllIlI[E.lIIIllllII[38]] = "Search";
        E.lIIIlllIlI[E.lIIIllllII[39]] = "Wear";
        E.lIIIlllIlI[E.lIIIllllII[40]] = "Nav to coffin";
        E.lIIIlllIlI[E.lIIIllllII[41]] = "Handling coffin";
        E.lIIIlllIlI[E.lIIIllllII[42]] = "Coffin";
        E.lIIIlllIlI[E.lIIIllllII[43]] = "Open";
        E.lIIIlllIlI[E.lIIIllllII[44]] = "Open";
        E.lIIIlllIlI[E.lIIIllllII[45]] = "Ghost's skull";
        E.lIIIlllIlI[E.lIIIllllII[52]] = "Restless ghost quest";
        E.lIIIlllIlI[E.lIIIllllII[53]] = "ring of wealth (";
        E.lIIIlllIlI[E.lIIIllllII[54]] = "Ok, I'm up for an adventure.";
        E.lIIIlllIlI[E.lIIIllllII[55]] = "A glass of your finest ale please.";
        E.lIIIlllIlI[E.lIIIllllII[56]] = "Morgan needs your help!";
        E.lIIIlllIlI[E.lIIIllllII[57]] = "Yes.";
        E.lIIIlllIlI[E.lIIIllllII[58]] = "I'm looking for a quest!";
        E.lIIIlllIlI[E.lIIIllllII[59]] = "Ok, let me help then.";
        E.lIIIlllIlI[E.lIIIllllII[60]] = "Father Aereck sent me to talk to you.";
        E.lIIIlllIlI[E.lIIIllllII[61]] = "He's got a ghost haunting his graveyard.";
        E.lIIIlllIlI[E.lIIIllllII[62]] = "Yep, now tell me what the problem is.";
        E.lIIIlllIlI[E.lIIIllllII[63]] = "Sure.";
        E.lIIIlllIlI[E.lIIIllllII[64]] = "I'm wearing an amulet of ghost speak!";
        E.lIIIlllIlI[E.lIIIllllII[65]] = "Yes, I'm sure.";
        E.lIIIlllIlI[E.lIIIllllII[66]] = "How can I help?";
    }

    private static boolean llllIIlIIlIl(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (E.llllIIlIllll(e.j(lIIIllllII[6]), lIIIllllII[8])) {
            bl = lIIIllllII[1];

        } else {
            bl = lIIIllllII[0];
        }
        return bl;
    }

    @Override
    public int T() {
        try {
            E.ck();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIIIllllII[51];
    }

    private static int llllIIlIIlII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llllIIlIlIll(Object object) {
        return object == null;
    }

    private static boolean llllIIlIlIII(int n2) {
        return n2 < 0;
    }

    private static boolean llllIIlIlIlI(Object object) {
        return object != null;
    }

    private static boolean llllIIlIllII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llllIIlIllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void af() {
        d llIlIIIlIll;
        Object llIlIIIllII;
        int[] nArray = new int[lIIIllllII[1]];
        nArray[E.lIIIllllII[0]] = lIIIllllII[10];
        if (E.llllIIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lIIIllllII[10], lIIIllllII[1], lIIIllllII[46]);
            bv.add(d2);

        }
        int[] nArray2 = new int[lIIIllllII[1]];
        nArray2[E.lIIIllllII[0]] = lIIIllllII[4];
        if (E.llllIIlIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llIlIIIllII = new DHelper(lIIIllllII[4], lIIIllllII[15], lIIIllllII[47]);
            bv.add((DHelper) lIlIIIllII);

        }
        if (E.llllIIlIIlll(Bank.contains(llIlIIIllII = item -> item.getName().toLowerCase().contains(lIIIlllIlI[lIIIllllII[53]])) ? 1 : 0)) {
            llIlIIIlIll = new DHelper(lIIIllllII[48], lIIIllllII[8], lIIIllllII[49]);
            bv.add(llIlIIIlIll);

        }
        int[] nArray3 = new int[lIIIllllII[1]];
        nArray3[E.lIIIllllII[0]] = lIIIllllII[11];
        if (E.llllIIlIIlll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llIlIIIlIll = new DHelper(lIIIllllII[11], lIIIllllII[15], lIIIllllII[50]);
            bv.add(llIlIIIlIll);

        }
        int[] nArray4 = new int[lIIIllllII[1]];
        nArray4[E.lIIIllllII[0]] = lIIIllllII[13];
        if (E.llllIIlIIlll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llIlIIIlIll = new DHelper(lIIIllllII[13], lIIIllllII[31], lIIIllllII[50]);
            bv.add(llIlIIIlIll);

        }
        int[] nArray5 = new int[lIIIllllII[1]];
        nArray5[E.lIIIllllII[0]] = lIIIllllII[12];
        if (E.llllIIlIIlll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            llIlIIIlIll = new DHelper(lIIIllllII[12], lIIIllllII[8], i.bq);
            bv.add(llIlIIIlIll);

        }
    }

    private static boolean llllIIlIlllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llllIIlIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean llllIIlIllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llllIIlIlIIl(int n2) {
        return n2 > 0;
    }

    @Override
    public String U() {
        return lIIIlllIlI[lIIIllllII[52]];
    }

        return String.valueOf(llIIllIIIlI);
    }

    static {
        E.llllIIlIIIll();
        E.llllIIIlllll();
        String[] stringArray = new String[lIIIllllII[23]];
        stringArray[E.lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[54]];
        stringArray[E.lIIIllllII[1]] = lIIIlllIlI[lIIIllllII[55]];
        stringArray[E.lIIIllllII[3]] = lIIIlllIlI[lIIIllllII[56]];
        stringArray[E.lIIIllllII[5]] = lIIIlllIlI[lIIIllllII[57]];
        stringArray[E.lIIIllllII[7]] = lIIIlllIlI[lIIIllllII[58]];
        stringArray[E.lIIIllllII[8]] = lIIIlllIlI[lIIIllllII[59]];
        stringArray[E.lIIIllllII[14]] = lIIIlllIlI[lIIIllllII[60]];
        stringArray[E.lIIIllllII[20]] = lIIIlllIlI[lIIIllllII[61]];
        stringArray[E.lIIIllllII[18]] = lIIIlllIlI[lIIIllllII[62]];
        stringArray[E.lIIIllllII[21]] = lIIIlllIlI[lIIIllllII[63]];
        stringArray[E.lIIIllllII[15]] = lIIIlllIlI[lIIIllllII[64]];
        stringArray[E.lIIIllllII[19]] = lIIIlllIlI[lIIIllllII[65]];
        stringArray[E.lIIIllllII[22]] = lIIIlllIlI[lIIIllllII[66]];
        ik = stringArray;
        il = new WorldPoint(lIIIllllII[16], lIIIllllII[67], lIIIllllII[0]);
        im = new WorldPoint(lIIIllllII[68], lIIIllllII[69], lIIIllllII[0]);
        in = new WorldPoint(lIIIllllII[70], lIIIllllII[71], lIIIllllII[0]);
        io = new WorldPoint(lIIIllllII[72], lIIIllllII[73], lIIIllllII[0]);
        bv = new ArrayList<d>();
        bT = lIIIllllII[0];
    }

    public static void ck() {
        if (E.llllIIlIIlIl(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[0]];
            b.a(bv);
            if (E.llllIIlIIllI(bv.size(), lIIIllllII[1])) {
                System.out.println(lIIIlllIlI[lIIIllllII[1]]);
                bt = lIIIllllII[0];
            }
        }
        if (E.llllIIlIIlll(bt ? 1 : 0)) {
            NPC llIlIIIllll;
            BankLocation llIlIIlIIII;
            if (E.llllIIlIIlIl(Inventory.contains((int[])f.aV) ? 1 : 0) && E.llllIIlIIllI(Movement.getRunEnergy(), lIIIllllII[2])) {
                Inventory.getFirst((int[])f.aV).interact(lIIIlllIlI[lIIIllllII[3]]);
                Time.sleepTicks((int)lIIIllllII[1]);

            }
            if (E.llllIIlIlIII(E.llllIIlIIlII(e.u(), 70.0))) {
                int[] nArray = new int[lIIIllllII[1]];
                nArray[E.lIIIllllII[0]] = lIIIllllII[4];
                if (E.llllIIlIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIIIllllII[1]];
                    nArray2[E.lIIIllllII[0]] = lIIIllllII[4];
                    Inventory.getFirst((int[])nArray2).interact(lIIIlllIlI[lIIIllllII[5]]);
                }
            }
            if (E.llllIIlIIlll(Movement.isRunEnabled() ? 1 : 0) && E.llllIIlIlIIl(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (E.llllIIlIIlll(E.ab() ? 1 : 0) && E.llllIIlIIllI(e.j(lIIIllllII[6]), lIIIllllII[1])) {
                llIlIIlIIII = BankLocation.getNearest();
                if (E.llllIIlIlIlI(llIlIIlIIII) && E.llllIIlIIlll(llIlIIlIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[7]];
                    a.a(llIlIIlIIII);
                    Time.sleepTicks((int)lIIIllllII[3]);

                }
                if (E.llllIIlIlIlI(llIlIIlIIII) && E.llllIIlIIlIl(llIlIIlIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[8]];
                    if (E.llllIIlIIlll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIllllII[9]);

                    }
                    if (E.llllIIlIIlIl(Bank.isOpen() ? 1 : 0)) {
                        if (E.llllIIlIlIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIllllII[7]);

                        }
                        if (E.llllIIlIlIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIllllII[3]);

                        }
                        int[] nArray = new int[lIIIllllII[8]];
                        nArray[E.lIIIllllII[0]] = lIIIllllII[10];
                        nArray[E.lIIIllllII[1]] = lIIIllllII[11];
                        nArray[E.lIIIllllII[3]] = lIIIllllII[12];
                        nArray[E.lIIIllllII[5]] = lIIIllllII[13];
                        nArray[E.lIIIllllII[7]] = lIIIllllII[4];
                        if (E.llllIIlIIlll(e.b(nArray) ? 1 : 0)) {
                            E.af();
                            System.out.println(lIIIlllIlI[lIIIllllII[14]]);
                            bt = lIIIllllII[1];
                            return;
                        }
                        Bank.withdraw((int)lIIIllllII[11], (int)lIIIllllII[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIllllII[1]);

                        Bank.withdraw((int)lIIIllllII[13], (int)lIIIllllII[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIllllII[1]);

                        Bank.withdraw((int)lIIIllllII[10], (int)lIIIllllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIllllII[1]);

                        a.b(f.aV, lIIIllllII[1]);
                        a.a(lIIIllllII[4], lIIIllllII[15]);
                        a.b(f.bf, lIIIllllII[1]);
                    }
                }
            }
            if (E.llllIIlIIlIl(E.ab() ? 1 : 0) && E.llllIIlIIllI(e.j(lIIIllllII[6]), lIIIllllII[1])) {
                llIlIIlIIII = new WorldArea(lIIIllllII[16], lIIIllllII[17], lIIIllllII[18], lIIIllllII[19], lIIIllllII[0]);
                String[] stringArray = new String[lIIIllllII[1]];
                stringArray[E.lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[20]];
                llIlIIIllll = NPCs.getNearest((String[])stringArray);
                if (E.llllIIlIlIll(llIlIIIllll) && E.llllIIlIllII(Players.getLocal().getWorldLocation().distanceTo(il), lIIIllllII[5]) && E.llllIIlIIlll(AccBuilderRogues.d ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[18]];
                    if (E.llllIIlIIllI(bT, lIIIllllII[1])) {
                        e.v();
                        bT += lIIIllllII[1];
                    }
                    Movement.walkTo((WorldPoint)il);

                    Time.sleepTicks((int)lIIIllllII[1]);

                }
                if (E.llllIIlIlIlI(llIlIIIllll)) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[21]];
                    g.a(lIIIlllIlI[lIIIllllII[15]], ik, lIIIllllII[1]);
                }
            }
            if (E.llllIIlIllIl(e.j(lIIIllllII[6]), lIIIllllII[1])) {
                if (E.llllIIlIllII(Players.getLocal().getWorldLocation().distanceTo(im), lIIIllllII[14])) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[19]];
                    Movement.walkTo((WorldPoint)im);

                    Time.sleepTicks((int)lIIIllllII[1]);

                }
                if (E.llllIIlIlllI(Players.getLocal().getWorldLocation().distanceTo(im), lIIIllllII[14])) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[22]];
                    String[] stringArray = new String[lIIIllllII[1]];
                    stringArray[E.lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[23]];
                    llIlIIlIIII = TileObjects.getNearest((String[])stringArray);
                    if (E.llllIIlIlIlI(llIlIIlIIII)) {
                        String[] stringArray2 = new String[lIIIllllII[1]];
                        stringArray2[E.lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[24]];
                        if (E.llllIIlIIlIl(llIlIIlIIII.hasAction(stringArray2) ? 1 : 0)) {
                            llIlIIlIIII.interact(lIIIlllIlI[lIIIllllII[25]]);
                            Time.sleepTicks((int)lIIIllllII[8]);

                        }
                    }
                    g.a(lIIIlllIlI[lIIIllllII[26]], ik);
                }
            }
            if (E.llllIIlIllIl(e.j(lIIIllllII[6]), lIIIllllII[3])) {
                if (E.llllIIlIllII(Players.getLocal().getWorldLocation().distanceTo(in), lIIIllllII[3])) {
                    int[] nArray = new int[lIIIllllII[1]];
                    nArray[E.lIIIllllII[0]] = lIIIllllII[27];
                    if (E.llllIIlIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray3 = new int[lIIIllllII[1]];
                        nArray3[E.lIIIllllII[0]] = lIIIllllII[27];
                        Inventory.getFirst((int[])nArray3).interact(lIIIlllIlI[lIIIllllII[28]]);
                        Time.sleepTicks((int)lIIIllllII[1]);

                    }
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[29]];
                    Movement.walkTo((WorldPoint)in);

                    Time.sleepTicks((int)lIIIllllII[1]);

                }
                if (E.llllIIlIlllI(Players.getLocal().getWorldLocation().distanceTo(in), lIIIllllII[3])) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[30]];
                    String[] stringArray = new String[lIIIllllII[1]];
                    stringArray[E.lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[31]];
                    llIlIIlIIII = NPCs.getNearest((String[])stringArray);
                    if (E.llllIIlIlIlI(llIlIIlIIII)) {
                        g.a(lIIIlllIlI[lIIIllllII[32]], ik);
                    }
                    if (E.llllIIlIlIll(llIlIIlIIII)) {
                        String[] stringArray3 = new String[lIIIllllII[1]];
                        stringArray3[E.lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[33]];
                        TileObjects.getNearest((String[])stringArray3).interact(lIIIlllIlI[lIIIllllII[34]]);
                        Time.sleepTicks((int)lIIIllllII[3]);

                    }
                }
            }
            if (E.llllIIlIllIl(e.j(lIIIllllII[6]), lIIIllllII[5])) {
                ck = lIIIllllII[0];
                if (E.llllIIlIllII(Players.getLocal().getWorldLocation().distanceTo(io), lIIIllllII[5])) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[35]];
                    Movement.walkTo((WorldPoint)io);

                    Time.sleepTicks((int)lIIIllllII[1]);

                }
                if (E.llllIIlIlllI(Players.getLocal().getWorldLocation().distanceTo(io), lIIIllllII[5])) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[36]];
                    String[] stringArray = new String[lIIIllllII[1]];
                    stringArray[E.lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[37]];
                    llIlIIlIIII = TileObjects.getNearest((String[])stringArray);
                    if (E.llllIIlIlIlI(llIlIIlIIII)) {
                        llIlIIlIIII.interact(lIIIlllIlI[lIIIllllII[38]]);
                    }
                }
            }
            if (E.llllIIlIllIl(e.j(lIIIllllII[6]), lIIIllllII[7])) {
                if (E.llllIIlIllII(Players.getLocal().getWorldLocation().distanceTo(in), lIIIllllII[3])) {
                    int[] nArray = new int[lIIIllllII[1]];
                    nArray[E.lIIIllllII[0]] = lIIIllllII[27];
                    if (E.llllIIlIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray4 = new int[lIIIllllII[1]];
                        nArray4[E.lIIIllllII[0]] = lIIIllllII[27];
                        Inventory.getFirst((int[])nArray4).interact(lIIIlllIlI[lIIIllllII[39]]);
                        Time.sleepTicks((int)lIIIllllII[1]);

                    }
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[40]];
                    Movement.walkTo((WorldPoint)in);

                    Time.sleepTicks((int)lIIIllllII[1]);

                }
                if (E.llllIIlIlllI(Players.getLocal().getWorldLocation().distanceTo(in), lIIIllllII[3])) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[41]];
                    String[] stringArray = new String[lIIIllllII[1]];
                    stringArray[E.lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[42]];
                    llIlIIlIIII = TileObjects.getNearest((String[])stringArray);
                    if (E.llllIIlIlIlI(llIlIIlIIII)) {
                        String[] stringArray4 = new String[lIIIllllII[1]];
                        stringArray4[E.lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[43]];
                        if (E.llllIIlIIlIl(llIlIIlIIII.hasAction(stringArray4) ? 1 : 0)) {
                            llIlIIlIIII.interact(lIIIlllIlI[lIIIllllII[44]]);
                            Time.sleepTicks((int)lIIIllllII[3]);

                        }
                        String[] stringArray5 = new String[lIIIllllII[1]];
                        stringArray5[E.lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[45]];
                        llIlIIIllll = Inventory.getFirst((String[])stringArray5);
                        if (E.llllIIlIlIlI(llIlIIIllll)) {
                            if (E.llllIIlIIllI(ck, lIIIllllII[1])) {
                                U.mJ += lIIIllllII[1];
                                U.o(AccBuilderRogues.m);
                                ck += lIIIllllII[1];
                                U.mJ = lIIIllllII[0];
                                cl = lIIIllllII[0];
                            }
                            llIlIIIllll.useOn((TileObject)llIlIIlIIII);
                            Time.sleepTicks((int)lIIIllllII[5]);

                        }
                    }
                }
                g.a(ik);
            }
            g.a(new String[lIIIllllII[0]]);
        }
    }

    @Override
    public boolean S() {
        return lIIIllllII[0];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        int[] nArray = new int[lIIIllllII[1]];
        nArray[E.lIIIllllII[0]] = lIIIllllII[11];
        if (E.llllIIlIIlIl(Inventory.contains((int[])nArray) ? 1 : 0) && (!E.llllIIlIIlll(Inventory.contains((int[])f.aR) ? 1 : 0) || E.llllIIlIIlIl(Equipment.contains((int[])f.aR) ? 1 : 0)) && E.llllIIlIIlIl(Inventory.contains((int[])f.aV) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIllllII[1]];
            nArray2[E.lIIIllllII[0]] = lIIIllllII[13];
            if (E.llllIIlIIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lIIIllllII[1]];
                nArray3[E.lIIIllllII[0]] = lIIIllllII[4];
                if (E.llllIIlIIlIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n2 = lIIIllllII[1];

                    if (null == null) return n2 != 0;
                    return ((0x6A ^ 0x71 ^ (0xCC ^ 0x91)) & (0xB9 ^ 0x9E ^ (0xE8 ^ 0x89) ^ -1)) != 0;
                }
            }
        }
        n2 = lIIIllllII[0];
        return n2 != 0;
    }
}

