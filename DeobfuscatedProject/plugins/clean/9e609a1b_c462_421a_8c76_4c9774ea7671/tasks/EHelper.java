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
implements M {
    static  int bY;
    static  int co;
    static  boolean cp;
    public static  List<d> bA;
    private static final  WorldPoint hj;

    private static final  WorldPoint hg;
    public static final  String[] hf;
    private static final  WorldPoint hi;
    private static final  WorldPoint hh;
    public static  boolean by;

    static {
        E.lIlIIlIlIllIllI();
        E.lIlIIlIlIllIlIl();
        String[] stringArray = new String[lIIIllllIIllI[23]];
        stringArray[E.lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[54]];
        stringArray[E.lIIIllllIIllI[1]] = lIIIllllIIlIl[lIIIllllIIllI[55]];
        stringArray[E.lIIIllllIIllI[3]] = lIIIllllIIlIl[lIIIllllIIllI[56]];
        stringArray[E.lIIIllllIIllI[5]] = lIIIllllIIlIl[lIIIllllIIllI[57]];
        stringArray[E.lIIIllllIIllI[7]] = lIIIllllIIlIl[lIIIllllIIllI[58]];
        stringArray[E.lIIIllllIIllI[8]] = lIIIllllIIlIl[lIIIllllIIllI[59]];
        stringArray[E.lIIIllllIIllI[14]] = lIIIllllIIlIl[lIIIllllIIllI[60]];
        stringArray[E.lIIIllllIIllI[20]] = lIIIllllIIlIl[lIIIllllIIllI[61]];
        stringArray[E.lIIIllllIIllI[18]] = lIIIllllIIlIl[lIIIllllIIllI[62]];
        stringArray[E.lIIIllllIIllI[21]] = lIIIllllIIlIl[lIIIllllIIllI[63]];
        stringArray[E.lIIIllllIIllI[15]] = lIIIllllIIlIl[lIIIllllIIllI[64]];
        stringArray[E.lIIIllllIIllI[19]] = lIIIllllIIlIl[lIIIllllIIllI[65]];
        stringArray[E.lIIIllllIIllI[22]] = lIIIllllIIlIl[lIIIllllIIllI[66]];
        hf = stringArray;
        hg = new WorldPoint(lIIIllllIIllI[16], lIIIllllIIllI[67], lIIIllllIIllI[0]);
        hh = new WorldPoint(lIIIllllIIllI[68], lIIIllllIIllI[69], lIIIllllIIllI[0]);
        hi = new WorldPoint(lIIIllllIIllI[70], lIIIllllIIllI[71], lIIIllllIIllI[0]);
        hj = new WorldPoint(lIIIllllIIllI[72], lIIIllllIIllI[73], lIIIllllIIllI[0]);
        bA = new ArrayList<d>();
        bY = lIIIllllIIllI[0];
    }

    private static boolean lIlIIlIlIllllII(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIlIlIlllIIl(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean X() {
        return lIIIllllIIllI[0];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean S() {
        int n2;
        int[] nArray = new int[lIIIllllIIllI[1]];
        nArray[E.lIIIllllIIllI[0]] = lIIIllllIIllI[11];
        if (E.lIlIIlIlIlllIII(Inventory.contains((int[])nArray) ? 1 : 0) && (!E.lIlIIlIlIlllIlI(Inventory.contains((int[])f.aW) ? 1 : 0) || E.lIlIIlIlIlllIII(Equipment.contains((int[])f.aW) ? 1 : 0)) && E.lIlIIlIlIlllIII(Inventory.contains((int[])f.ba) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIllllIIllI[1]];
            nArray2[E.lIIIllllIIllI[0]] = lIIIllllIIllI[13];
            if (E.lIlIIlIlIlllIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lIIIllllIIllI[1]];
                nArray3[E.lIIIllllIIllI[0]] = lIIIllllIIllI[4];
                if (E.lIlIIlIlIlllIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n2 = lIIIllllIIllI[1];

                    if ((0x13 ^ 0x17) >= 1) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = lIIIllllIIllI[0];
        return n2 != 0;
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (E.lIlIIlIllIIIIlI(e.j(lIIIllllIIllI[6]), lIIIllllIIllI[8])) {
            bl = lIIIllllIIllI[1];

            if (3 < 3) {
                return ((0xB9 ^ 0x9F ^ (0xF6 ^ 0x9B)) & (0xCA ^ 0x94 ^ (0xA ^ 0x1F) ^ -1) & ((190 + 56 - 138 + 142 ^ 62 + 81 - 141 + 161) & (0xE3 ^ 0x9F ^ (0x6A ^ 0x4F) ^ -1) ^ -1)) != 0;
            }
        } else {
            bl = lIIIllllIIllI[0];
        }
        return bl;
    }

    private static boolean lIlIIlIlIllllIl(Object object) {
        return object != null;
    }

    private static boolean lIlIIlIllIIIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIlIllIIIIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIlIllIIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIlIlIlllIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIlIlIllllll(int n2, int n3) {
        return n2 > n3;
    }

        return String.valueOf(var1);
    }

    private static void lIlIIlIlIllIlIl() {
        lIIIllllIIlIl = new String[lIIIllllIIllI[74]];
        E.lIIIllllIIlIl[E.lIIIllllIIllI[0]] = "Buying items";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[1]] = "Finished buying items, switching back to quest";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[3]] = "Drink";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[5]] = "Eat";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[7]] = "Nav to bank";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[8]] = "Handling banking";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[14]] = "We are missing quest supplies, switching to BUYING";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[20]] = "Father Aereck";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[18]] = "Nav to start";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[21]] = "Starting quest";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[15]] = "Father Aereck";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[19]] = "Nav to necklace guy";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[22]] = "Interacting npc";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[23]] = "Door";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[24]] = "Open";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[25]] = "Open";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[26]] = "Father Urhney";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[28]] = "Wear";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[29]] = "Nav to coffin";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[30]] = "Handling coffin";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[31]] = "Restless ghost";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[32]] = "Restless ghost";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[33]] = "Coffin";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[34]] = "Open";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[35]] = "Nav to skull";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[36]] = "Getting skull";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[37]] = "Altar";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[38]] = "Search";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[39]] = "Wear";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[40]] = "Nav to coffin";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[41]] = "Handling coffin";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[42]] = "Coffin";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[43]] = "Open";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[44]] = "Open";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[45]] = "Ghost's skull";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[52]] = "Restless ghost quest";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[53]] = "ring of wealth (";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[54]] = "Ok, I'm up for an adventure.";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[55]] = "A glass of your finest ale please.";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[56]] = "Morgan needs your help!";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[57]] = "Yes.";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[58]] = "I'm looking for a quest!";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[59]] = "Ok, let me help then.";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[60]] = "Father Aereck sent me to talk to you.";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[61]] = "He's got a ghost haunting his graveyard.";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[62]] = "Yep, now tell me what the problem is.";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[63]] = "Sure.";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[64]] = "I'm wearing an amulet of ghost speak!";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[65]] = "Yes, I'm sure.";
        E.lIIIllllIIlIl[E.lIIIllllIIllI[66]] = "How can I help?";
    }

    @Override
    public String Z() {
        return lIIIllllIIlIl[lIIIllllIIllI[52]];
    }

    private static void W() {
        d var2;
        Object var3;
        int[] nArray = new int[lIIIllllIIllI[1]];
        nArray[E.lIIIllllIIllI[0]] = lIIIllllIIllI[10];
        if (E.lIlIIlIlIlllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lIIIllllIIllI[10], lIIIllllIIllI[1], lIIIllllIIllI[46]);
            bA.add(d2);

        }
        int[] nArray2 = new int[lIIIllllIIllI[1]];
        nArray2[E.lIIIllllIIllI[0]] = lIIIllllIIllI[4];
        if (E.lIlIIlIlIlllIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var3 = new DHelper(lIIIllllIIllI[4], lIIIllllIIllI[15], lIIIllllIIllI[47]);
            bA.add((DHelper) ar3);

        }
        if (E.lIlIIlIlIlllIlI(Bank.contains(var3 = item -> item.getName().toLowerCase().contains(lIIIllllIIlIl[lIIIllllIIllI[53]])) ? 1 : 0)) {
            var2 = new DHelper(lIIIllllIIllI[48], lIIIllllIIllI[8], lIIIllllIIllI[49]);
            bA.add(var2);

        }
        int[] nArray3 = new int[lIIIllllIIllI[1]];
        nArray3[E.lIIIllllIIllI[0]] = lIIIllllIIllI[11];
        if (E.lIlIIlIlIlllIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var2 = new DHelper(lIIIllllIIllI[11], lIIIllllIIllI[15], lIIIllllIIllI[50]);
            bA.add(var2);

        }
        int[] nArray4 = new int[lIIIllllIIllI[1]];
        nArray4[E.lIIIllllIIllI[0]] = lIIIllllIIllI[13];
        if (E.lIlIIlIlIlllIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var2 = new DHelper(lIIIllllIIllI[13], lIIIllllIIllI[31], lIIIllllIIllI[50]);
            bA.add(var2);

        }
        int[] nArray5 = new int[lIIIllllIIllI[1]];
        nArray5[E.lIIIllllIIllI[0]] = lIIIllllIIllI[12];
        if (E.lIlIIlIlIlllIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var2 = new DHelper(lIIIllllIIllI[12], lIIIllllIIllI[8], h.bv);
            bA.add(var2);

        }
    }

    private static boolean lIlIIlIlIlllIll(int n2) {
        return n2 < 0;
    }

    private static int lIlIIlIlIllIlll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIlIIlIlIlllllI(Object object) {
        return object == null;
    }

    public static void ck() {
        if (E.lIlIIlIlIlllIII(by ? 1 : 0)) {
            AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[0]];
            b.a(bA);
            if (E.lIlIIlIlIlllIIl(bA.size(), lIIIllllIIllI[1])) {
                System.out.println(lIIIllllIIlIl[lIIIllllIIllI[1]]);
                by = lIIIllllIIllI[0];
            }
        }
        if (E.lIlIIlIlIlllIlI(by ? 1 : 0)) {
            NPC var4;
            BankLocation var5;
            if (E.lIlIIlIlIlllIII(Inventory.contains((int[])f.ba) ? 1 : 0) && E.lIlIIlIlIlllIIl(Movement.getRunEnergy(), lIIIllllIIllI[2])) {
                Inventory.getFirst((int[])f.ba).interact(lIIIllllIIlIl[lIIIllllIIllI[3]]);
                Time.sleepTicks((int)lIIIllllIIllI[1]);

            }
            if (E.lIlIIlIlIlllIll(E.lIlIIlIlIllIlll(e.v(), 70.0))) {
                int[] nArray = new int[lIIIllllIIllI[1]];
                nArray[E.lIIIllllIIllI[0]] = lIIIllllIIllI[4];
                if (E.lIlIIlIlIlllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIIIllllIIllI[1]];
                    nArray2[E.lIIIllllIIllI[0]] = lIIIllllIIllI[4];
                    Inventory.getFirst((int[])nArray2).interact(lIIIllllIIlIl[lIIIllllIIllI[5]]);
                }
            }
            if (E.lIlIIlIlIlllIlI(Movement.isRunEnabled() ? 1 : 0) && E.lIlIIlIlIllllII(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (E.lIlIIlIlIlllIlI(E.S() ? 1 : 0) && E.lIlIIlIlIlllIIl(e.j(lIIIllllIIllI[6]), lIIIllllIIllI[1])) {
                var5 = BankLocation.getNearest();
                if (E.lIlIIlIlIllllIl(var5) && E.lIlIIlIlIlllIlI(var5.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[7]];
                    a.a(var5);
                    Time.sleepTicks((int)lIIIllllIIllI[3]);

                }
                if (E.lIlIIlIlIllllIl(var5) && E.lIlIIlIlIlllIII(var5.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[8]];
                    if (E.lIlIIlIlIlllIlI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIllllIIllI[9]);

                    }
                    if (E.lIlIIlIlIlllIII(Bank.isOpen() ? 1 : 0)) {
                        if (E.lIlIIlIlIllllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIllllIIllI[7]);

                        }
                        if (E.lIlIIlIlIllllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIllllIIllI[3]);

                        }
                        int[] nArray = new int[lIIIllllIIllI[8]];
                        nArray[E.lIIIllllIIllI[0]] = lIIIllllIIllI[10];
                        nArray[E.lIIIllllIIllI[1]] = lIIIllllIIllI[11];
                        nArray[E.lIIIllllIIllI[3]] = lIIIllllIIllI[12];
                        nArray[E.lIIIllllIIllI[5]] = lIIIllllIIllI[13];
                        nArray[E.lIIIllllIIllI[7]] = lIIIllllIIllI[4];
                        if (E.lIlIIlIlIlllIlI(e.b(nArray) ? 1 : 0)) {
                            E.W();
                            System.out.println(lIIIllllIIlIl[lIIIllllIIllI[14]]);
                            by = lIIIllllIIllI[1];
                            return;
                        }
                        Bank.withdraw((int)lIIIllllIIllI[11], (int)lIIIllllIIllI[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIllllIIllI[1]);

                        Bank.withdraw((int)lIIIllllIIllI[13], (int)lIIIllllIIllI[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIllllIIllI[1]);

                        Bank.withdraw((int)lIIIllllIIllI[10], (int)lIIIllllIIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIllllIIllI[1]);

                        a.b(f.ba, lIIIllllIIllI[1]);
                        a.a(lIIIllllIIllI[4], lIIIllllIIllI[15]);
                        a.b(f.bk, lIIIllllIIllI[1]);
                    }
                }
            }
            if (E.lIlIIlIlIlllIII(E.S() ? 1 : 0) && E.lIlIIlIlIlllIIl(e.j(lIIIllllIIllI[6]), lIIIllllIIllI[1])) {
                var5 = new WorldArea(lIIIllllIIllI[16], lIIIllllIIllI[17], lIIIllllIIllI[18], lIIIllllIIllI[19], lIIIllllIIllI[0]);
                String[] stringArray = new String[lIIIllllIIllI[1]];
                stringArray[E.lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[20]];
                var4 = NPCs.getNearest((String[])stringArray);
                if (E.lIlIIlIlIlllllI(var4) && E.lIlIIlIlIllllll(Players.getLocal().getWorldLocation().distanceTo(hg), lIIIllllIIllI[5]) && E.lIlIIlIlIlllIlI(AccBuilderRat.d ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[18]];
                    if (E.lIlIIlIlIlllIIl(bY, lIIIllllIIllI[1])) {
                        e.w();
                        bY += lIIIllllIIllI[1];
                    }
                    Movement.walkTo((WorldPoint)hg);

                    Time.sleepTicks((int)lIIIllllIIllI[1]);

                }
                if (E.lIlIIlIlIllllIl(var4)) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[21]];
                    g.a(lIIIllllIIlIl[lIIIllllIIllI[15]], hf, lIIIllllIIllI[1]);
                }
            }
            if (E.lIlIIlIllIIIIII(e.j(lIIIllllIIllI[6]), lIIIllllIIllI[1])) {
                if (E.lIlIIlIlIllllll(Players.getLocal().getWorldLocation().distanceTo(hh), lIIIllllIIllI[14])) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[19]];
                    Movement.walkTo((WorldPoint)hh);

                    Time.sleepTicks((int)lIIIllllIIllI[1]);

                }
                if (E.lIlIIlIllIIIIIl(Players.getLocal().getWorldLocation().distanceTo(hh), lIIIllllIIllI[14])) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[22]];
                    String[] stringArray = new String[lIIIllllIIllI[1]];
                    stringArray[E.lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[23]];
                    var5 = TileObjects.getNearest((String[])stringArray);
                    if (E.lIlIIlIlIllllIl(var5)) {
                        String[] stringArray2 = new String[lIIIllllIIllI[1]];
                        stringArray2[E.lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[24]];
                        if (E.lIlIIlIlIlllIII(var5.hasAction(stringArray2) ? 1 : 0)) {
                            var5.interact(lIIIllllIIlIl[lIIIllllIIllI[25]]);
                            Time.sleepTicks((int)lIIIllllIIllI[8]);

                        }
                    }
                    g.a(lIIIllllIIlIl[lIIIllllIIllI[26]], hf);
                }
            }
            if (E.lIlIIlIllIIIIII(e.j(lIIIllllIIllI[6]), lIIIllllIIllI[3])) {
                if (E.lIlIIlIlIllllll(Players.getLocal().getWorldLocation().distanceTo(hi), lIIIllllIIllI[3])) {
                    int[] nArray = new int[lIIIllllIIllI[1]];
                    nArray[E.lIIIllllIIllI[0]] = lIIIllllIIllI[27];
                    if (E.lIlIIlIlIlllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray3 = new int[lIIIllllIIllI[1]];
                        nArray3[E.lIIIllllIIllI[0]] = lIIIllllIIllI[27];
                        Inventory.getFirst((int[])nArray3).interact(lIIIllllIIlIl[lIIIllllIIllI[28]]);
                        Time.sleepTicks((int)lIIIllllIIllI[1]);

                    }
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[29]];
                    Movement.walkTo((WorldPoint)hi);

                    Time.sleepTicks((int)lIIIllllIIllI[1]);

                }
                if (E.lIlIIlIllIIIIIl(Players.getLocal().getWorldLocation().distanceTo(hi), lIIIllllIIllI[3])) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[30]];
                    String[] stringArray = new String[lIIIllllIIllI[1]];
                    stringArray[E.lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[31]];
                    var5 = NPCs.getNearest((String[])stringArray);
                    if (E.lIlIIlIlIllllIl(var5)) {
                        g.a(lIIIllllIIlIl[lIIIllllIIllI[32]], hf);
                    }
                    if (E.lIlIIlIlIlllllI(var5)) {
                        String[] stringArray3 = new String[lIIIllllIIllI[1]];
                        stringArray3[E.lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[33]];
                        TileObjects.getNearest((String[])stringArray3).interact(lIIIllllIIlIl[lIIIllllIIllI[34]]);
                        Time.sleepTicks((int)lIIIllllIIllI[3]);

                    }
                }
            }
            if (E.lIlIIlIllIIIIII(e.j(lIIIllllIIllI[6]), lIIIllllIIllI[5])) {
                co = lIIIllllIIllI[0];
                if (E.lIlIIlIlIllllll(Players.getLocal().getWorldLocation().distanceTo(hj), lIIIllllIIllI[5])) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[35]];
                    Movement.walkTo((WorldPoint)hj);

                    Time.sleepTicks((int)lIIIllllIIllI[1]);

                }
                if (E.lIlIIlIllIIIIIl(Players.getLocal().getWorldLocation().distanceTo(hj), lIIIllllIIllI[5])) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[36]];
                    String[] stringArray = new String[lIIIllllIIllI[1]];
                    stringArray[E.lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[37]];
                    var5 = TileObjects.getNearest((String[])stringArray);
                    if (E.lIlIIlIlIllllIl(var5)) {
                        var5.interact(lIIIllllIIlIl[lIIIllllIIllI[38]]);
                    }
                }
            }
            if (E.lIlIIlIllIIIIII(e.j(lIIIllllIIllI[6]), lIIIllllIIllI[7])) {
                if (E.lIlIIlIlIllllll(Players.getLocal().getWorldLocation().distanceTo(hi), lIIIllllIIllI[3])) {
                    int[] nArray = new int[lIIIllllIIllI[1]];
                    nArray[E.lIIIllllIIllI[0]] = lIIIllllIIllI[27];
                    if (E.lIlIIlIlIlllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray4 = new int[lIIIllllIIllI[1]];
                        nArray4[E.lIIIllllIIllI[0]] = lIIIllllIIllI[27];
                        Inventory.getFirst((int[])nArray4).interact(lIIIllllIIlIl[lIIIllllIIllI[39]]);
                        Time.sleepTicks((int)lIIIllllIIllI[1]);

                    }
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[40]];
                    Movement.walkTo((WorldPoint)hi);

                    Time.sleepTicks((int)lIIIllllIIllI[1]);

                }
                if (E.lIlIIlIllIIIIIl(Players.getLocal().getWorldLocation().distanceTo(hi), lIIIllllIIllI[3])) {
                    AccBuilderRat.c = lIIIllllIIlIl[lIIIllllIIllI[41]];
                    String[] stringArray = new String[lIIIllllIIllI[1]];
                    stringArray[E.lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[42]];
                    var5 = TileObjects.getNearest((String[])stringArray);
                    if (E.lIlIIlIlIllllIl(var5)) {
                        String[] stringArray4 = new String[lIIIllllIIllI[1]];
                        stringArray4[E.lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[43]];
                        if (E.lIlIIlIlIlllIII(var5.hasAction(stringArray4) ? 1 : 0)) {
                            var5.interact(lIIIllllIIlIl[lIIIllllIIllI[44]]);
                            Time.sleepTicks((int)lIIIllllIIllI[3]);

                        }
                        String[] stringArray5 = new String[lIIIllllIIllI[1]];
                        stringArray5[E.lIIIllllIIllI[0]] = lIIIllllIIlIl[lIIIllllIIllI[45]];
                        var4 = Inventory.getFirst((String[])stringArray5);
                        if (E.lIlIIlIlIllllIl(var4)) {
                            if (E.lIlIIlIlIlllIIl(co, lIIIllllIIllI[1])) {
                                P.lr += lIIIllllIIllI[1];
                                P.d(AccBuilderRat.m);
                                co += lIIIllllIIllI[1];
                                P.lr = lIIIllllIIllI[0];
                                cp = lIIIllllIIllI[0];
                            }
                            var4.useOn((TileObject)var5);
                            Time.sleepTicks((int)lIIIllllIIllI[5]);

                        }
                    }
                }
                g.a(hf);
            }
            g.a(new String[lIIIllllIIllI[0]]);
        }
    }

    @Override
    public int Y() {
        try {
            E.ck();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        return lIIIllllIIllI[51];
    }

    private static boolean lIlIIlIlIlllIlI(int n2) {
        return n2 == 0;
    }
}

