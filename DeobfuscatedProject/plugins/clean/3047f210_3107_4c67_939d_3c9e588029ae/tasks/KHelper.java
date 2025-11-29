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
package gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.AHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.ACHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.BHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.DHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.EHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.FHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.GHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.IHelper;
import gg.squire.account.AccBuilderTempleTrek;
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

public class KHelper
implements S {
    private static final  WorldPoint hV;
    private static final  WorldPoint hU;
    private static final  WorldPoint hX;
    static  int ck;

    public static  boolean bs;
    static  boolean cl;
    private static final  WorldPoint hW;
    static  int bS;
    public static final  String[] hT;
    public static  List<d> bu;

    @Override
    public int T() {
        try {
            K.cY();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0x22 ^ 0x26) <= 3) {
            return (0x3C ^ 0x5F) & ~(0x4A ^ 0x29);
        }
        return llllllllll[51];
    }

    private static boolean llIllIIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIllIIllIIII(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aa() {
        int n2;
        int[] nArray = new int[llllllllll[1]];
        nArray[K.llllllllll[0]] = llllllllll[11];
        if (K.llIllIIlIlIII(Inventory.contains((int[])nArray) ? 1 : 0) && (!K.llIllIIlIlIlI(Inventory.contains((int[])f.aQ) ? 1 : 0) || K.llIllIIlIlIII(Equipment.contains((int[])f.aQ) ? 1 : 0)) && K.llIllIIlIlIII(Inventory.contains((int[])f.aU) ? 1 : 0)) {
            int[] nArray2 = new int[llllllllll[1]];
            nArray2[K.llllllllll[0]] = llllllllll[13];
            if (K.llIllIIlIlIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[llllllllll[1]];
                nArray3[K.llllllllll[0]] = llllllllll[4];
                if (K.llIllIIlIlIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n2 = llllllllll[1];

                    if (1 >= 0) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = llllllllll[0];
        return n2 != 0;
    }

    private static void ae() {
        d var1;
        Object var2;
        int[] nArray = new int[llllllllll[1]];
        nArray[K.llllllllll[0]] = llllllllll[10];
        if (K.llIllIIlIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(llllllllll[10], llllllllll[1], llllllllll[46]);
            bu.add(d2);

        }
        int[] nArray2 = new int[llllllllll[1]];
        nArray2[K.llllllllll[0]] = llllllllll[4];
        if (K.llIllIIlIlIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var2 = new DHelper(llllllllll[4], llllllllll[15], llllllllll[47]);
            bu.add((DHelper) ar2);

        }
        if (K.llIllIIlIlIlI(Bank.contains(var2 = item -> item.getName().toLowerCase().contains(lllllllllI[llllllllll[53]])) ? 1 : 0)) {
            var1 = new DHelper(llllllllll[48], llllllllll[8], llllllllll[49]);
            bu.add(var1);

        }
        int[] nArray3 = new int[llllllllll[1]];
        nArray3[K.llllllllll[0]] = llllllllll[11];
        if (K.llIllIIlIlIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var1 = new DHelper(llllllllll[11], llllllllll[15], llllllllll[50]);
            bu.add(var1);

        }
        int[] nArray4 = new int[llllllllll[1]];
        nArray4[K.llllllllll[0]] = llllllllll[13];
        if (K.llIllIIlIlIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var1 = new DHelper(llllllllll[13], llllllllll[31], llllllllll[50]);
            bu.add(var1);

        }
        int[] nArray5 = new int[llllllllll[1]];
        nArray5[K.llllllllll[0]] = llllllllll[12];
        if (K.llIllIIlIlIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var1 = new DHelper(llllllllll[12], llllllllll[8], i.bp);
            bu.add(var1);

        }
    }

    private static void llIllIIlIIIll() {
        lllllllllI = new String[llllllllll[74]];
        K.lllllllllI[K.llllllllll[0]] = "Buying items";
        K.lllllllllI[K.llllllllll[1]] = "Finished buying items, switching back to quest";
        K.lllllllllI[K.llllllllll[3]] = "Drink";
        K.lllllllllI[K.llllllllll[5]] = "Eat";
        K.lllllllllI[K.llllllllll[7]] = "Nav to bank";
        K.lllllllllI[K.llllllllll[8]] = "Handling banking";
        K.lllllllllI[K.llllllllll[14]] = "We are missing quest supplies, switching to BUYING";
        K.lllllllllI[K.llllllllll[20]] = "Father Aereck";
        K.lllllllllI[K.llllllllll[18]] = "Nav to start";
        K.lllllllllI[K.llllllllll[21]] = "Starting quest";
        K.lllllllllI[K.llllllllll[15]] = "Father Aereck";
        K.lllllllllI[K.llllllllll[19]] = "Nav to necklace guy";
        K.lllllllllI[K.llllllllll[22]] = "Interacting npc";
        K.lllllllllI[K.llllllllll[23]] = "Door";
        K.lllllllllI[K.llllllllll[24]] = "Open";
        K.lllllllllI[K.llllllllll[25]] = "Open";
        K.lllllllllI[K.llllllllll[26]] = "Father Urhney";
        K.lllllllllI[K.llllllllll[28]] = "Wear";
        K.lllllllllI[K.llllllllll[29]] = "Nav to coffin";
        K.lllllllllI[K.llllllllll[30]] = "Handling coffin";
        K.lllllllllI[K.llllllllll[31]] = "Restless ghost";
        K.lllllllllI[K.llllllllll[32]] = "Restless ghost";
        K.lllllllllI[K.llllllllll[33]] = "Coffin";
        K.lllllllllI[K.llllllllll[34]] = "Open";
        K.lllllllllI[K.llllllllll[35]] = "Nav to skull";
        K.lllllllllI[K.llllllllll[36]] = "Getting skull";
        K.lllllllllI[K.llllllllll[37]] = "Altar";
        K.lllllllllI[K.llllllllll[38]] = "Search";
        K.lllllllllI[K.llllllllll[39]] = "Wear";
        K.lllllllllI[K.llllllllll[40]] = "Nav to coffin";
        K.lllllllllI[K.llllllllll[41]] = "Handling coffin";
        K.lllllllllI[K.llllllllll[42]] = "Coffin";
        K.lllllllllI[K.llllllllll[43]] = "Open";
        K.lllllllllI[K.llllllllll[44]] = "Open";
        K.lllllllllI[K.llllllllll[45]] = "Ghost's skull";
        K.lllllllllI[K.llllllllll[52]] = "Restless ghost quest";
        K.lllllllllI[K.llllllllll[53]] = "ring of wealth (";
        K.lllllllllI[K.llllllllll[54]] = "Ok, I'm up for an adventure.";
        K.lllllllllI[K.llllllllll[55]] = "A glass of your finest ale please.";
        K.lllllllllI[K.llllllllll[56]] = "Morgan needs your help!";
        K.lllllllllI[K.llllllllll[57]] = "Yes.";
        K.lllllllllI[K.llllllllll[58]] = "I'm looking for a quest!";
        K.lllllllllI[K.llllllllll[59]] = "Ok, let me help then.";
        K.lllllllllI[K.llllllllll[60]] = "Father Aereck sent me to talk to you.";
        K.lllllllllI[K.llllllllll[61]] = "He's got a ghost haunting his graveyard.";
        K.lllllllllI[K.llllllllll[62]] = "Yep, now tell me what the problem is.";
        K.lllllllllI[K.llllllllll[63]] = "Sure.";
        K.lllllllllI[K.llllllllll[64]] = "I'm wearing an amulet of ghost speak!";
        K.lllllllllI[K.llllllllll[65]] = "Yes, I'm sure.";
        K.lllllllllI[K.llllllllll[66]] = "How can I help?";
    }

    private static int llIllIIlIIlll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llIllIIlIllIl(Object object) {
        return object != null;
    }

        return String.valueOf(var3);
    }

    private static boolean llIllIIlIllII(int n2) {
        return n2 > 0;
    }

    private static boolean llIllIIlIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIllIIlIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean llIllIIlIlllI(Object object) {
        return object == null;
    }

    private static boolean llIllIIlIlIll(int n2) {
        return n2 < 0;
    }

    static {
        K.llIllIIlIIllI();
        K.llIllIIlIIIll();
        String[] stringArray = new String[llllllllll[23]];
        stringArray[K.llllllllll[0]] = lllllllllI[llllllllll[54]];
        stringArray[K.llllllllll[1]] = lllllllllI[llllllllll[55]];
        stringArray[K.llllllllll[3]] = lllllllllI[llllllllll[56]];
        stringArray[K.llllllllll[5]] = lllllllllI[llllllllll[57]];
        stringArray[K.llllllllll[7]] = lllllllllI[llllllllll[58]];
        stringArray[K.llllllllll[8]] = lllllllllI[llllllllll[59]];
        stringArray[K.llllllllll[14]] = lllllllllI[llllllllll[60]];
        stringArray[K.llllllllll[20]] = lllllllllI[llllllllll[61]];
        stringArray[K.llllllllll[18]] = lllllllllI[llllllllll[62]];
        stringArray[K.llllllllll[21]] = lllllllllI[llllllllll[63]];
        stringArray[K.llllllllll[15]] = lllllllllI[llllllllll[64]];
        stringArray[K.llllllllll[19]] = lllllllllI[llllllllll[65]];
        stringArray[K.llllllllll[22]] = lllllllllI[llllllllll[66]];
        hT = stringArray;
        hU = new WorldPoint(llllllllll[16], llllllllll[67], llllllllll[0]);
        hV = new WorldPoint(llllllllll[68], llllllllll[69], llllllllll[0]);
        hW = new WorldPoint(llllllllll[70], llllllllll[71], llllllllll[0]);
        hX = new WorldPoint(llllllllll[72], llllllllll[73], llllllllll[0]);
        bu = new ArrayList<d>();
        bS = llllllllll[0];
    }

    @Override
    public String U() {
        return lllllllllI[llllllllll[52]];
    }

    private static boolean llIllIIllIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIllIIlIllll(int n2, int n3) {
        return n2 > n3;
    }

    public static void cY() {
        if (K.llIllIIlIlIII(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllllllllI[llllllllll[0]];
            b.a(bu);
            if (K.llIllIIlIlIIl(bu.size(), llllllllll[1])) {
                System.out.println(lllllllllI[llllllllll[1]]);
                bs = llllllllll[0];
            }
        }
        if (K.llIllIIlIlIlI(bs ? 1 : 0)) {
            NPC var4;
            BankLocation var5;
            if (K.llIllIIlIlIII(Inventory.contains((int[])f.aU) ? 1 : 0) && K.llIllIIlIlIIl(Movement.getRunEnergy(), llllllllll[2])) {
                Inventory.getFirst((int[])f.aU).interact(lllllllllI[llllllllll[3]]);
                Time.sleepTicks((int)llllllllll[1]);

            }
            if (K.llIllIIlIlIll(K.llIllIIlIIlll(e.u(), 70.0))) {
                int[] nArray = new int[llllllllll[1]];
                nArray[K.llllllllll[0]] = llllllllll[4];
                if (K.llIllIIlIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[llllllllll[1]];
                    nArray2[K.llllllllll[0]] = llllllllll[4];
                    Inventory.getFirst((int[])nArray2).interact(lllllllllI[llllllllll[5]]);
                }
            }
            if (K.llIllIIlIlIlI(Movement.isRunEnabled() ? 1 : 0) && K.llIllIIlIllII(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (K.llIllIIlIlIlI(K.aa() ? 1 : 0) && K.llIllIIlIlIIl(e.j(llllllllll[6]), llllllllll[1])) {
                var5 = BankLocation.getNearest();
                if (K.llIllIIlIllIl(var5) && K.llIllIIlIlIlI(var5.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[7]];
                    a.a(var5);
                    Time.sleepTicks((int)llllllllll[3]);

                }
                if (K.llIllIIlIllIl(var5) && K.llIllIIlIlIII(var5.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[8]];
                    if (K.llIllIIlIlIlI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llllllllll[9]);

                    }
                    if (K.llIllIIlIlIII(Bank.isOpen() ? 1 : 0)) {
                        if (K.llIllIIlIllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llllllllll[7]);

                        }
                        if (K.llIllIIlIllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llllllllll[3]);

                        }
                        int[] nArray = new int[llllllllll[8]];
                        nArray[K.llllllllll[0]] = llllllllll[10];
                        nArray[K.llllllllll[1]] = llllllllll[11];
                        nArray[K.llllllllll[3]] = llllllllll[12];
                        nArray[K.llllllllll[5]] = llllllllll[13];
                        nArray[K.llllllllll[7]] = llllllllll[4];
                        if (K.llIllIIlIlIlI(e.b(nArray) ? 1 : 0)) {
                            K.ae();
                            System.out.println(lllllllllI[llllllllll[14]]);
                            bs = llllllllll[1];
                            return;
                        }
                        Bank.withdraw((int)llllllllll[11], (int)llllllllll[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llllllllll[1]);

                        Bank.withdraw((int)llllllllll[13], (int)llllllllll[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llllllllll[1]);

                        Bank.withdraw((int)llllllllll[10], (int)llllllllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llllllllll[1]);

                        a.b(f.aU, llllllllll[1]);
                        a.a(llllllllll[4], llllllllll[15]);
                        a.b(f.be, llllllllll[1]);
                    }
                }
            }
            if (K.llIllIIlIlIII(K.aa() ? 1 : 0) && K.llIllIIlIlIIl(e.j(llllllllll[6]), llllllllll[1])) {
                var5 = new WorldArea(llllllllll[16], llllllllll[17], llllllllll[18], llllllllll[19], llllllllll[0]);
                String[] stringArray = new String[llllllllll[1]];
                stringArray[K.llllllllll[0]] = lllllllllI[llllllllll[20]];
                var4 = NPCs.getNearest((String[])stringArray);
                if (K.llIllIIlIlllI(var4) && K.llIllIIlIllll(Players.getLocal().getWorldLocation().distanceTo(hU), llllllllll[5]) && K.llIllIIlIlIlI(AccBuilderTempleTrek.d ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[18]];
                    if (K.llIllIIlIlIIl(bS, llllllllll[1])) {
                        e.v();
                        bS += llllllllll[1];
                    }
                    Movement.walkTo((WorldPoint)hU);

                    Time.sleepTicks((int)llllllllll[1]);

                }
                if (K.llIllIIlIllIl(var4)) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[21]];
                    g.a(lllllllllI[llllllllll[15]], hT, llllllllll[1]);
                }
            }
            if (K.llIllIIllIIII(e.j(llllllllll[6]), llllllllll[1])) {
                if (K.llIllIIlIllll(Players.getLocal().getWorldLocation().distanceTo(hV), llllllllll[14])) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[19]];
                    Movement.walkTo((WorldPoint)hV);

                    Time.sleepTicks((int)llllllllll[1]);

                }
                if (K.llIllIIllIIIl(Players.getLocal().getWorldLocation().distanceTo(hV), llllllllll[14])) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[22]];
                    String[] stringArray = new String[llllllllll[1]];
                    stringArray[K.llllllllll[0]] = lllllllllI[llllllllll[23]];
                    var5 = TileObjects.getNearest((String[])stringArray);
                    if (K.llIllIIlIllIl(var5)) {
                        String[] stringArray2 = new String[llllllllll[1]];
                        stringArray2[K.llllllllll[0]] = lllllllllI[llllllllll[24]];
                        if (K.llIllIIlIlIII(var5.hasAction(stringArray2) ? 1 : 0)) {
                            var5.interact(lllllllllI[llllllllll[25]]);
                            Time.sleepTicks((int)llllllllll[8]);

                        }
                    }
                    g.a(lllllllllI[llllllllll[26]], hT);
                }
            }
            if (K.llIllIIllIIII(e.j(llllllllll[6]), llllllllll[3])) {
                if (K.llIllIIlIllll(Players.getLocal().getWorldLocation().distanceTo(hW), llllllllll[3])) {
                    int[] nArray = new int[llllllllll[1]];
                    nArray[K.llllllllll[0]] = llllllllll[27];
                    if (K.llIllIIlIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray3 = new int[llllllllll[1]];
                        nArray3[K.llllllllll[0]] = llllllllll[27];
                        Inventory.getFirst((int[])nArray3).interact(lllllllllI[llllllllll[28]]);
                        Time.sleepTicks((int)llllllllll[1]);

                    }
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[29]];
                    Movement.walkTo((WorldPoint)hW);

                    Time.sleepTicks((int)llllllllll[1]);

                }
                if (K.llIllIIllIIIl(Players.getLocal().getWorldLocation().distanceTo(hW), llllllllll[3])) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[30]];
                    String[] stringArray = new String[llllllllll[1]];
                    stringArray[K.llllllllll[0]] = lllllllllI[llllllllll[31]];
                    var5 = NPCs.getNearest((String[])stringArray);
                    if (K.llIllIIlIllIl(var5)) {
                        g.a(lllllllllI[llllllllll[32]], hT);
                    }
                    if (K.llIllIIlIlllI(var5)) {
                        String[] stringArray3 = new String[llllllllll[1]];
                        stringArray3[K.llllllllll[0]] = lllllllllI[llllllllll[33]];
                        TileObjects.getNearest((String[])stringArray3).interact(lllllllllI[llllllllll[34]]);
                        Time.sleepTicks((int)llllllllll[3]);

                    }
                }
            }
            if (K.llIllIIllIIII(e.j(llllllllll[6]), llllllllll[5])) {
                ck = llllllllll[0];
                if (K.llIllIIlIllll(Players.getLocal().getWorldLocation().distanceTo(hX), llllllllll[5])) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[35]];
                    Movement.walkTo((WorldPoint)hX);

                    Time.sleepTicks((int)llllllllll[1]);

                }
                if (K.llIllIIllIIIl(Players.getLocal().getWorldLocation().distanceTo(hX), llllllllll[5])) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[36]];
                    String[] stringArray = new String[llllllllll[1]];
                    stringArray[K.llllllllll[0]] = lllllllllI[llllllllll[37]];
                    var5 = TileObjects.getNearest((String[])stringArray);
                    if (K.llIllIIlIllIl(var5)) {
                        var5.interact(lllllllllI[llllllllll[38]]);
                    }
                }
            }
            if (K.llIllIIllIIII(e.j(llllllllll[6]), llllllllll[7])) {
                if (K.llIllIIlIllll(Players.getLocal().getWorldLocation().distanceTo(hW), llllllllll[3])) {
                    int[] nArray = new int[llllllllll[1]];
                    nArray[K.llllllllll[0]] = llllllllll[27];
                    if (K.llIllIIlIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray4 = new int[llllllllll[1]];
                        nArray4[K.llllllllll[0]] = llllllllll[27];
                        Inventory.getFirst((int[])nArray4).interact(lllllllllI[llllllllll[39]]);
                        Time.sleepTicks((int)llllllllll[1]);

                    }
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[40]];
                    Movement.walkTo((WorldPoint)hW);

                    Time.sleepTicks((int)llllllllll[1]);

                }
                if (K.llIllIIllIIIl(Players.getLocal().getWorldLocation().distanceTo(hW), llllllllll[3])) {
                    AccBuilderTempleTrek.c = lllllllllI[llllllllll[41]];
                    String[] stringArray = new String[llllllllll[1]];
                    stringArray[K.llllllllll[0]] = lllllllllI[llllllllll[42]];
                    var5 = TileObjects.getNearest((String[])stringArray);
                    if (K.llIllIIlIllIl(var5)) {
                        String[] stringArray4 = new String[llllllllll[1]];
                        stringArray4[K.llllllllll[0]] = lllllllllI[llllllllll[43]];
                        if (K.llIllIIlIlIII(var5.hasAction(stringArray4) ? 1 : 0)) {
                            var5.interact(lllllllllI[llllllllll[44]]);
                            Time.sleepTicks((int)llllllllll[3]);

                        }
                        String[] stringArray5 = new String[llllllllll[1]];
                        stringArray5[K.llllllllll[0]] = lllllllllI[llllllllll[45]];
                        var4 = Inventory.getFirst((String[])stringArray5);
                        if (K.llIllIIlIllIl(var4)) {
                            if (K.llIllIIlIlIIl(ck, llllllllll[1])) {
                                ac.mP += llllllllll[1];
                                ac.d(AccBuilderTempleTrek.m);
                                ck += llllllllll[1];
                                ac.mP = llllllllll[0];
                                cl = llllllllll[0];
                            }
                            var4.useOn((TileObject)var5);
                            Time.sleepTicks((int)llllllllll[5]);

                        }
                    }
                }
                g.a(hT);
            }
            g.a(new String[llllllllll[0]]);
        }
    }

    @Override
    public boolean S() {
        return llllllllll[0];
    }

    @Override
    public boolean V() {
        boolean bl;
        if (K.llIllIIllIIII(e.j(llllllllll[6]), llllllllll[8])) {
            bl = llllllllll[1];

            if ((0x2A ^ 0x2F) == 0) {
                return false;
            }
        } else {
            bl = llllllllll[0];
        }
        return bl;
    }
}

