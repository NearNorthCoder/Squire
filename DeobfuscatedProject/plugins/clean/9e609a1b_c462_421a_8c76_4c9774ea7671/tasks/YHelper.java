/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Quest
 *  net.runelite.api.QuestState
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
 *  net.unethicalite.api.quests.Quests
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
import net.runelite.api.Item;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
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
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class YHelper
implements M {
    public static  List<d> bA;
    static  boolean cp;
    static  int co;
    private static final  String[] fZ;
    public static  WorldPoint ga;
    
    static  int bY;
    public static  boolean by;

    /*
     * WARNING - void declaration
     */
    private static void bm() {
        void var1;
        BankLocation bankLocation = BankLocation.getNearest();
        if (y.lIlIIllIllIIIII(bankLocation) && y.lIlIIllIlIlllll(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[46]];
            a.a(bankLocation);
        }
        if (y.lIlIIllIllIIIII(var1) && y.lIlIIllIlIlllIl(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (y.lIlIIllIlIlllll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[47]];
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIllllllllI[7]);

            }
            if (y.lIlIIllIlIlllIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[48]];
                if (y.lIlIIllIllIIIIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIIllllllllI[6]);

                }
                if (y.lIlIIllIllIIIIl(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)lIIIllllllllI[3]);

                }
                int[] nArray = new int[lIIIllllllllI[1]];
                nArray[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                if (y.lIlIIllIlIlllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIIIllllllllI[1]];
                    nArray2[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                    if (y.lIlIIllIlIllllI(Bank.getFirst((int[])nArray2).getQuantity(), lIIIllllllllI[5])) {
                        y.W();
                        System.out.println(lIIIlllllllIl[lIIIllllllllI[49]]);
                        by = lIIIllllllllI[1];
                        return;
                    }
                }
                int[] nArray3 = new int[lIIIllllllllI[8]];
                nArray3[y.lIIIllllllllI[0]] = lIIIllllllllI[11];
                nArray3[y.lIIIllllllllI[1]] = lIIIllllllllI[12];
                nArray3[y.lIIIllllllllI[3]] = lIIIllllllllI[9];
                nArray3[y.lIIIllllllllI[5]] = lIIIllllllllI[13];
                nArray3[y.lIIIllllllllI[6]] = lIIIllllllllI[14];
                if (y.lIlIIllIlIlllll(e.b(nArray3) ? 1 : 0)) {
                    y.W();
                    System.out.println(lIIIlllllllIl[lIIIllllllllI[50]]);
                    by = lIIIllllllllI[1];
                    return;
                }
            }
            int[] nArray = new int[lIIIllllllllI[8]];
            nArray[y.lIIIllllllllI[0]] = lIIIllllllllI[11];
            nArray[y.lIIIllllllllI[1]] = lIIIllllllllI[12];
            nArray[y.lIIIllllllllI[3]] = lIIIllllllllI[9];
            nArray[y.lIIIllllllllI[5]] = lIIIllllllllI[13];
            nArray[y.lIIIllllllllI[6]] = lIIIllllllllI[14];
            if (y.lIlIIllIlIlllIl(e.b(nArray) ? 1 : 0)) {
                Bank.withdraw((int)lIIIllllllllI[11], (int)lIIIllllllllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)lIIIllllllllI[1]);

                Bank.withdraw((int)lIIIllllllllI[12], (int)lIIIllllllllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)lIIIllllllllI[1]);

                Bank.withdraw((int)lIIIllllllllI[9], (int)lIIIllllllllI[5], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)lIIIllllllllI[1]);

                Bank.withdraw((int)lIIIllllllllI[13], (int)lIIIllllllllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)lIIIllllllllI[1]);

                Bank.withdraw((int)lIIIllllllllI[14], (int)lIIIllllllllI[5], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)lIIIllllllllI[1]);

                a.b(f.bk, lIIIllllllllI[1]);
                Time.sleepTicks((int)lIIIllllllllI[5]);

                Bank.close();
                y.bB();
            }
        }
    }

    private static boolean lIlIIllIlIlllIl(int n2) {
        return n2 != 0;
    }

    @Override
    public String Z() {
        return lIIIlllllllIl[lIIIllllllllI[62]];
    }

    private static boolean lIlIIllIllIIIII(Object object) {
        return object != null;
    }

    private static boolean lIlIIllIllIIlll(Object object, Object object2) {
        return object == object2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean S() {
        int n2;
        int[] nArray = new int[lIIIllllllllI[1]];
        nArray[y.lIIIllllllllI[0]] = lIIIllllllllI[11];
        if (y.lIlIIllIlIlllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIllllllllI[1]];
            nArray2[y.lIIIllllllllI[0]] = lIIIllllllllI[12];
            if (y.lIlIIllIlIlllIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lIIIllllllllI[1]];
                nArray3[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                if (y.lIlIIllIlIlllIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n2 = lIIIllllllllI[1];

                    if (((0x9B ^ 0xB4) & ~(0x1B ^ 0x34)) == 0) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = lIIIllllllllI[0];
        return n2 != 0;
    }

    private static boolean lIlIIllIlIllllI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var2);
    }

    private static void bB() {
        block8: {
            block7: {
                String[] stringArray = new String[lIIIllllllllI[1]];
                stringArray[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[51]];
                if (!y.lIlIIllIlIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block7;
                String[] stringArray2 = new String[lIIIllllllllI[1]];
                stringArray2[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[52]];
                if (!y.lIlIIllIlIlllIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) break block8;
            }
            int[] nArray = new int[lIIIllllllllI[1]];
            nArray[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
            if (y.lIlIIllIlIlllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                if (y.lIlIIllIlIlllIl(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                    Time.sleepTicks((int)e.c(lIIIllllllllI[3], lIIIllllllllI[5]));

                }
                AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[53]];
                String[] stringArray = new String[lIIIllllllllI[1]];
                stringArray[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[54]];
                Item var3 = Inventory.getFirst((String[])stringArray);
                String[] stringArray3 = new String[lIIIllllllllI[1]];
                stringArray3[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[55]];
                Item var4 = Inventory.getFirst((String[])stringArray3);
                int[] nArray2 = new int[lIIIllllllllI[1]];
                nArray2[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                Item var5 = Inventory.getFirst((int[])nArray2);
                if (y.lIlIIllIllIIIII(var3) && y.lIlIIllIllIIIII(var5)) {
                    var3.useOn(var5);
                    Time.sleepTicks((int)lIIIllllllllI[1]);

                }
                int[] nArray3 = new int[lIIIllllllllI[1]];
                nArray3[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                var5 = Inventory.getFirst((int[])nArray3);
                if (y.lIlIIllIllIIIII(var4) && y.lIlIIllIllIIIII(var5)) {
                    var4.useOn(var5);
                }
            }
        }
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (y.lIlIIllIllIIllI(e.j(lIIIllllllllI[4]), lIIIllllllllI[10]) && !y.lIlIIllIllIIllI(e.j(lIIIllllllllI[4]), lIIIllllllllI[18]) || y.lIlIIllIllIIlll(Quests.getState((Quest)Quest.GOBLIN_DIPLOMACY), QuestState.FINISHED)) {
            bl = lIIIllllllllI[1];

            if (2 != 2) {
                return false;
            }
        } else {
            bl = lIIIllllllllI[0];
        }
        return bl;
    }

    @Override
    public boolean X() {
        return lIIIllllllllI[0];
    }

    private static boolean lIlIIllIllIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIllIllIIIll(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        y.lIlIIllIlIlllII();
        y.lIlIIllIlIllIll();
        String[] stringArray = new String[lIIIllllllllI[15]];
        stringArray[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[64]];
        stringArray[y.lIIIllllllllI[1]] = lIIIlllllllIl[lIIIllllllllI[65]];
        stringArray[y.lIIIllllllllI[3]] = lIIIlllllllIl[lIIIllllllllI[66]];
        stringArray[y.lIIIllllllllI[5]] = lIIIlllllllIl[lIIIllllllllI[67]];
        stringArray[y.lIIIllllllllI[6]] = lIIIlllllllIl[lIIIllllllllI[68]];
        stringArray[y.lIIIllllllllI[8]] = lIIIlllllllIl[lIIIllllllllI[69]];
        stringArray[y.lIIIllllllllI[10]] = lIIIlllllllIl[lIIIllllllllI[70]];
        fZ = stringArray;
        bA = new ArrayList<d>();
        ga = new WorldPoint(lIIIllllllllI[71], lIIIllllllllI[72], lIIIllllllllI[0]);
        bY = lIIIllllllllI[0];
    }

    private static void W() {
        d var6;
        Object var7;
        block10: {
            block9: {
                int[] nArray = new int[lIIIllllllllI[1]];
                nArray[y.lIIIllllllllI[0]] = lIIIllllllllI[11];
                if (y.lIlIIllIlIlllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new DHelper(lIIIllllllllI[11], lIIIllllllllI[1], lIIIllllllllI[56]);
                    bA.add(d2);

                }
                int[] nArray2 = new int[lIIIllllllllI[1]];
                nArray2[y.lIIIllllllllI[0]] = lIIIllllllllI[12];
                if (y.lIlIIllIlIlllll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    var7 = new DHelper(lIIIllllllllI[12], lIIIllllllllI[1], lIIIllllllllI[56]);
                    bA.add((DHelper) ar7);

                }
                int[] nArray3 = new int[lIIIllllllllI[1]];
                nArray3[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                if (!y.lIlIIllIlIlllIl(Bank.contains((int[])nArray3) ? 1 : 0)) break block9;
                int[] nArray4 = new int[lIIIllllllllI[1]];
                nArray4[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                if (!y.lIlIIllIlIlllIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block10;
                int[] nArray5 = new int[lIIIllllllllI[1]];
                nArray5[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                if (!y.lIlIIllIlIllllI(Bank.getFirst((int[])nArray5).getQuantity(), lIIIllllllllI[5])) break block10;
            }
            var7 = new DHelper(lIIIllllllllI[9], lIIIllllllllI[5], lIIIllllllllI[56]);
            bA.add((DHelper) ar7);

        }
        int[] nArray = new int[lIIIllllllllI[1]];
        nArray[y.lIIIllllllllI[0]] = lIIIllllllllI[14];
        if (y.lIlIIllIlIlllll(Bank.contains((int[])nArray) ? 1 : 0)) {
            var7 = new DHelper(lIIIllllllllI[14], lIIIllllllllI[8], lIIIllllllllI[56]);
            bA.add((DHelper) ar7);

        }
        if (y.lIlIIllIlIlllll(Bank.contains((Predicate)(var7 = item -> item.getName().toLowerCase().contains(lIIIlllllllIl[lIIIllllllllI[63]]))) ? 1 : 0)) {
            var6 = new DHelper(lIIIllllllllI[57], lIIIllllllllI[8], lIIIllllllllI[58]);
            bA.add(var6);

        }
        int[] nArray6 = new int[lIIIllllllllI[1]];
        nArray6[y.lIIIllllllllI[0]] = lIIIllllllllI[59];
        if (y.lIlIIllIlIlllll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var6 = new DHelper(lIIIllllllllI[59], lIIIllllllllI[54], lIIIllllllllI[60]);
            bA.add(var6);

        }
        int[] nArray7 = new int[lIIIllllllllI[1]];
        nArray7[y.lIIIllllllllI[0]] = lIIIllllllllI[13];
        if (y.lIlIIllIlIlllll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var6 = new DHelper(lIIIllllllllI[13], lIIIllllllllI[8], h.bv);
            bA.add(var6);

        }
    }

    private static boolean lIlIIllIllIIlII(Object object) {
        return object == null;
    }

    private static boolean lIlIIllIlIlllll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIllIllIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIllIllIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public int Y() {
        try {
            y.bA();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIIIllllllllI[61];
    }

    private static boolean lIlIIllIllIIIIl(int n2) {
        return n2 > 0;
    }

    private static void lIlIIllIlIllIll() {
        lIIIlllllllIl = new String[lIIIllllllllI[73]];
        y.lIIIlllllllIl[y.lIIIllllllllI[0]] = "Buying items";
        y.lIIIlllllllIl[y.lIIIllllllllI[1]] = "Finished buying items, switching back to quest";
        y.lIIIlllllllIl[y.lIIIllllllllI[3]] = "Drink";
        y.lIIIlllllllIl[y.lIIIllllllllI[5]] = "Navigating to bank";
        y.lIIIlllllllIl[y.lIIIllllllllI[6]] = "Opening bank";
        y.lIIIlllllllIl[y.lIIIllllllllI[8]] = "Handling banking";
        y.lIIIlllllllIl[y.lIIIllllllllI[10]] = "We are missing quest supplies, switching to BUYING";
        y.lIIIlllllllIl[y.lIIIllllllllI[15]] = "We are missing quest supplies, switching to BUYING";
        y.lIIIlllllllIl[y.lIIIllllllllI[16]] = "Nav to start";
        y.lIIIlllllllIl[y.lIIIllllllllI[17]] = "Starting quest";
        y.lIIIlllllllIl[y.lIIIllllllllI[18]] = "Large door";
        y.lIIIlllllllIl[y.lIIIllllllllI[19]] = "Open";
        y.lIIIlllllllIl[y.lIIIllllllllI[20]] = "Open";
        y.lIIIlllllllIl[y.lIIIllllllllI[21]] = "General Bentnoze";
        y.lIIIlllllllIl[y.lIIIllllllllI[25]] = "Blue dye";
        y.lIIIlllllllIl[y.lIIIllllllllI[26]] = "Orange dye";
        y.lIIIlllllllIl[y.lIIIllllllllI[27]] = "Dying armor";
        y.lIIIlllllllIl[y.lIIIllllllllI[28]] = "Orange dye";
        y.lIIIlllllllIl[y.lIIIllllllllI[29]] = "Blue dye";
        y.lIIIlllllllIl[y.lIIIllllllllI[30]] = "Orange goblin mail";
        y.lIIIlllllllIl[y.lIIIllllllllI[31]] = "Orange goblin mail";
        y.lIIIlllllllIl[y.lIIIllllllllI[32]] = "Nav to start";
        y.lIIIlllllllIl[y.lIIIllllllllI[33]] = "Turning in orange";
        y.lIIIlllllllIl[y.lIIIllllllllI[34]] = "General Bentnoze";
        y.lIIIlllllllIl[y.lIIIllllllllI[36]] = "Blue goblin mail";
        y.lIIIlllllllIl[y.lIIIllllllllI[37]] = "Blue goblin mail";
        y.lIIIlllllllIl[y.lIIIllllllllI[38]] = "Nav to start";
        y.lIIIlllllllIl[y.lIIIllllllllI[39]] = "Turning in blue";
        y.lIIIlllllllIl[y.lIIIllllllllI[40]] = "General Bentnoze";
        y.lIIIlllllllIl[y.lIIIllllllllI[42]] = "Turning in brown";
        y.lIIIlllllllIl[y.lIIIllllllllI[43]] = "Nav to start";
        y.lIIIlllllllIl[y.lIIIllllllllI[44]] = "General Bentnoze";
        y.lIIIlllllllIl[y.lIIIllllllllI[46]] = "Navigating to bank";
        y.lIIIlllllllIl[y.lIIIllllllllI[47]] = "Opening bank";
        y.lIIIlllllllIl[y.lIIIllllllllI[48]] = "Handling banking";
        y.lIIIlllllllIl[y.lIIIllllllllI[49]] = "We are missing quest supplies, switching to BUYING";
        y.lIIIlllllllIl[y.lIIIllllllllI[50]] = "We are missing quest supplies, switching to BUYING";
        y.lIIIlllllllIl[y.lIIIllllllllI[51]] = "Blue dye";
        y.lIIIlllllllIl[y.lIIIllllllllI[52]] = "Orange dye";
        y.lIIIlllllllIl[y.lIIIllllllllI[53]] = "Dying armor";
        y.lIIIlllllllIl[y.lIIIllllllllI[54]] = "Orange dye";
        y.lIIIlllllllIl[y.lIIIllllllllI[55]] = "Blue dye";
        y.lIIIlllllllIl[y.lIIIllllllllI[62]] = "Goblin Diplomacy";
        y.lIIIlllllllIl[y.lIIIllllllllI[63]] = "ring of wealth (";
        y.lIIIlllllllIl[y.lIIIllllllllI[64]] = "Yes.";
        y.lIIIlllllllIl[y.lIIIllllllllI[65]] = "Do you want me to pick an armour colour for you?";
        y.lIIIlllllllIl[y.lIIIllllllllI[66]] = "What about a different colour?";
        y.lIIIlllllllIl[y.lIIIllllllllI[67]] = "I have some orange armour here.";
        y.lIIIlllllllIl[y.lIIIllllllllI[68]] = "I have some blue armour here.";
        y.lIIIlllllllIl[y.lIIIllllllllI[69]] = "I have some brown armour here.";
        y.lIIIlllllllIl[y.lIIIllllllllI[70]] = "I'll leave you to it.";
    }

    public static void bA() {
        block49: {
            BankLocation var8;
            block52: {
                block53: {
                    block51: {
                        block50: {
                            if (y.lIlIIllIlIlllIl(by ? 1 : 0)) {
                                AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[0]];
                                b.a(bA);
                                if (y.lIlIIllIlIllllI(bA.size(), lIIIllllllllI[1])) {
                                    System.out.println(lIIIlllllllIl[lIIIllllllllI[1]]);
                                    by = lIIIllllllllI[0];
                                }
                            }
                            if (!y.lIlIIllIlIlllll(by ? 1 : 0)) break block49;
                            if (y.lIlIIllIlIlllIl(Inventory.contains((int[])f.ba) ? 1 : 0) && y.lIlIIllIlIllllI(Movement.getRunEnergy(), lIIIllllllllI[2]) && y.lIlIIllIlIlllll(Dialog.isOpen() ? 1 : 0)) {
                                Inventory.getFirst((int[])f.ba).interact(lIIIlllllllIl[lIIIllllllllI[3]]);
                                Time.sleepTicks((int)lIIIllllllllI[1]);

                            }
                            if (y.lIlIIllIlIlllll(y.S() ? 1 : 0) && y.lIlIIllIlIllllI(e.j(lIIIllllllllI[4]), lIIIllllllllI[1])) {
                                var8 = BankLocation.getNearest();
                                if (y.lIlIIllIllIIIII(var8) && y.lIlIIllIlIlllll(var8.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[5]];
                                    a.a(var8);
                                }
                                if (y.lIlIIllIllIIIII(var8) && y.lIlIIllIlIlllIl(var8.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (y.lIlIIllIlIlllll(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[6]];
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIllllllllI[7]);

                                    }
                                    if (y.lIlIIllIlIlllIl(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[8]];
                                        if (y.lIlIIllIllIIIIl(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)lIIIllllllllI[6]);

                                        }
                                        if (y.lIlIIllIllIIIIl(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)lIIIllllllllI[3]);

                                        }
                                        int[] nArray = new int[lIIIllllllllI[1]];
                                        nArray[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                                        if (y.lIlIIllIlIlllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                            int[] nArray2 = new int[lIIIllllllllI[1]];
                                            nArray2[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                                            if (y.lIlIIllIlIllllI(Bank.getFirst((int[])nArray2).getQuantity(), lIIIllllllllI[5])) {
                                                y.W();
                                                System.out.println(lIIIlllllllIl[lIIIllllllllI[10]]);
                                                by = lIIIllllllllI[1];
                                                return;
                                            }
                                        }
                                        int[] nArray3 = new int[lIIIllllllllI[8]];
                                        nArray3[y.lIIIllllllllI[0]] = lIIIllllllllI[11];
                                        nArray3[y.lIIIllllllllI[1]] = lIIIllllllllI[12];
                                        nArray3[y.lIIIllllllllI[3]] = lIIIllllllllI[9];
                                        nArray3[y.lIIIllllllllI[5]] = lIIIllllllllI[13];
                                        nArray3[y.lIIIllllllllI[6]] = lIIIllllllllI[14];
                                        if (y.lIlIIllIlIlllll(e.b(nArray3) ? 1 : 0)) {
                                            y.W();
                                            System.out.println(lIIIlllllllIl[lIIIllllllllI[15]]);
                                            by = lIIIllllllllI[1];
                                            return;
                                        }
                                    }
                                    int[] nArray = new int[lIIIllllllllI[8]];
                                    nArray[y.lIIIllllllllI[0]] = lIIIllllllllI[11];
                                    nArray[y.lIIIllllllllI[1]] = lIIIllllllllI[12];
                                    nArray[y.lIIIllllllllI[3]] = lIIIllllllllI[9];
                                    nArray[y.lIIIllllllllI[5]] = lIIIllllllllI[13];
                                    nArray[y.lIIIllllllllI[6]] = lIIIllllllllI[14];
                                    if (y.lIlIIllIlIlllIl(e.b(nArray) ? 1 : 0)) {
                                        Bank.withdraw((int)lIIIllllllllI[11], (int)lIIIllllllllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)lIIIllllllllI[1]);

                                        Bank.withdraw((int)lIIIllllllllI[12], (int)lIIIllllllllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)lIIIllllllllI[1]);

                                        Bank.withdraw((int)lIIIllllllllI[9], (int)lIIIllllllllI[5], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)lIIIllllllllI[1]);

                                        Bank.withdraw((int)lIIIllllllllI[13], (int)lIIIllllllllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)lIIIllllllllI[1]);

                                        Bank.withdraw((int)lIIIllllllllI[14], (int)lIIIllllllllI[5], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)lIIIllllllllI[1]);

                                        a.b(f.bk, lIIIllllllllI[1]);
                                        Time.sleepTicks((int)lIIIllllllllI[5]);

                                    }
                                }
                            }
                            if (y.lIlIIllIlIlllIl(y.S() ? 1 : 0) && y.lIlIIllIlIllllI(e.j(lIIIllllllllI[4]), lIIIllllllllI[1])) {
                                if (y.lIlIIllIlIllllI(bY, lIIIllllllllI[1])) {
                                    e.w();
                                    bY += lIIIllllllllI[1];
                                }
                                if (y.lIlIIllIllIIIIl(bY)) {
                                    if (y.lIlIIllIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(ga), lIIIllllllllI[8])) {
                                        AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[16]];
                                        Movement.walkTo((WorldPoint)ga);

                                        Time.sleepTicks((int)lIIIllllllllI[1]);

                                    }
                                    if (y.lIlIIllIllIIIll(Players.getLocal().getWorldLocation().distanceTo(ga), lIIIllllllllI[8])) {
                                        AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[17]];
                                        String[] stringArray = new String[lIIIllllllllI[1]];
                                        stringArray[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[18]];
                                        var8 = TileObjects.getNearest((String[])stringArray);
                                        if (y.lIlIIllIllIIIII(var8)) {
                                            String[] stringArray2 = new String[lIIIllllllllI[1]];
                                            stringArray2[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[19]];
                                            if (y.lIlIIllIlIlllIl(var8.hasAction(stringArray2) ? 1 : 0)) {
                                                var8.interact(lIIIlllllllIl[lIIIllllllllI[20]]);
                                                Time.sleepTicks((int)lIIIllllllllI[5]);

                                            }
                                        }
                                        g.a(lIIIlllllllIl[lIIIllllllllI[21]], fZ);
                                    }
                                }
                            }
                            int[] nArray = new int[lIIIllllllllI[1]];
                            nArray[y.lIIIllllllllI[0]] = lIIIllllllllI[22];
                            if (!y.lIlIIllIllIIIII(NPCs.getNearest((int[])nArray))) break block50;
                            int[] nArray4 = new int[lIIIllllllllI[1]];
                            nArray4[y.lIIIllllllllI[0]] = lIIIllllllllI[23];
                            if (!y.lIlIIllIllIIIII(NPCs.getNearest((int[])nArray4))) break block50;
                            int[] nArray5 = new int[lIIIllllllllI[1]];
                            nArray5[y.lIIIllllllllI[0]] = lIIIllllllllI[24];
                            if (!y.lIlIIllIllIIlII(NPCs.getNearest((int[])nArray5))) break block51;
                        }
                        g.a(fZ);
                    }
                    if (!y.lIlIIllIllIIlIl(e.j(lIIIllllllllI[4]), lIIIllllllllI[5])) break block52;
                    String[] stringArray = new String[lIIIllllllllI[1]];
                    stringArray[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[25]];
                    if (!y.lIlIIllIlIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block53;
                    String[] stringArray3 = new String[lIIIllllllllI[1]];
                    stringArray3[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[26]];
                    if (!y.lIlIIllIlIlllIl(Inventory.contains((String[])stringArray3) ? 1 : 0)) break block52;
                }
                int[] nArray = new int[lIIIllllllllI[1]];
                nArray[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                if (y.lIlIIllIlIlllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[27]];
                    String[] stringArray = new String[lIIIllllllllI[1]];
                    stringArray[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[28]];
                    var8 = Inventory.getFirst((String[])stringArray);
                    String[] stringArray4 = new String[lIIIllllllllI[1]];
                    stringArray4[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[29]];
                    Item var9 = Inventory.getFirst((String[])stringArray4);
                    int[] nArray6 = new int[lIIIllllllllI[1]];
                    nArray6[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                    Item var10 = Inventory.getFirst((int[])nArray6);
                    if (y.lIlIIllIllIIIII(var8) && y.lIlIIllIllIIIII(var10)) {
                        var8.useOn(var10);
                        Time.sleepTicks((int)lIIIllllllllI[1]);

                    }
                    int[] nArray7 = new int[lIIIllllllllI[1]];
                    nArray7[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                    var10 = Inventory.getFirst((int[])nArray7);
                    if (y.lIlIIllIllIIIII(var9) && y.lIlIIllIllIIIII(var10)) {
                        var9.useOn(var10);
                    }
                }
            }
            if (y.lIlIIllIllIIlIl(e.j(lIIIllllllllI[4]), lIIIllllllllI[5])) {
                int[] nArray = new int[lIIIllllllllI[1]];
                nArray[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                if (y.lIlIIllIlIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIllllllllI[1]];
                    stringArray[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[30]];
                    if (y.lIlIIllIlIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        y.bm();
                    }
                }
            }
            if (y.lIlIIllIllIIlIl(e.j(lIIIllllllllI[4]), lIIIllllllllI[5])) {
                int[] nArray = new int[lIIIllllllllI[1]];
                nArray[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                if (y.lIlIIllIlIlllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIllllllllI[1]];
                    stringArray[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[31]];
                    if (y.lIlIIllIlIlllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        co = lIIIllllllllI[0];
                        if (y.lIlIIllIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(ga), lIIIllllllllI[8])) {
                            AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[32]];
                            Movement.walkTo((WorldPoint)ga);

                            Time.sleepTicks((int)lIIIllllllllI[1]);

                        }
                        AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[33]];
                        g.a(lIIIlllllllIl[lIIIllllllllI[34]], fZ, lIIIllllllllI[1]);
                    }
                }
            }
            if (y.lIlIIllIllIIlIl(e.j(lIIIllllllllI[4]), lIIIllllllllI[35])) {
                String[] stringArray = new String[lIIIllllllllI[1]];
                stringArray[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[36]];
                if (y.lIlIIllIlIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    y.bm();
                }
            }
            if (y.lIlIIllIllIIlIl(e.j(lIIIllllllllI[4]), lIIIllllllllI[35])) {
                String[] stringArray = new String[lIIIllllllllI[1]];
                stringArray[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[37]];
                if (y.lIlIIllIlIlllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (y.lIlIIllIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(ga), lIIIllllllllI[8])) {
                        AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[38]];
                        Movement.walkTo((WorldPoint)ga);

                        Time.sleepTicks((int)lIIIllllllllI[1]);

                    }
                    AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[39]];
                    g.a(lIIIlllllllIl[lIIIllllllllI[40]], fZ, lIIIllllllllI[1]);
                }
            }
            if (y.lIlIIllIllIIlIl(e.j(lIIIllllllllI[4]), lIIIllllllllI[41])) {
                int[] nArray = new int[lIIIllllllllI[1]];
                nArray[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                if (y.lIlIIllIlIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    y.bm();
                }
            }
            if (y.lIlIIllIllIIlIl(e.j(lIIIllllllllI[4]), lIIIllllllllI[41])) {
                int[] nArray = new int[lIIIllllllllI[1]];
                nArray[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                if (y.lIlIIllIlIlllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[42]];
                    if (y.lIlIIllIlIllllI(co, lIIIllllllllI[1])) {
                        P.lx += lIIIllllllllI[1];
                        P.d(AccBuilderRat.m);
                        co += lIIIllllllllI[1];
                        P.lx = lIIIllllllllI[0];
                        cp = lIIIllllllllI[0];
                    }
                    if (y.lIlIIllIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(ga), lIIIllllllllI[8])) {
                        AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[43]];
                        Movement.walkTo((WorldPoint)ga);

                        Time.sleepTicks((int)lIIIllllllllI[1]);

                    }
                    g.a(lIIIlllllllIl[lIIIllllllllI[44]], fZ, lIIIllllllllI[1]);
                }
            }
            if (y.lIlIIllIllIIIII(var8 = Widgets.get((int)lIIIllllllllI[45], (int)lIIIllllllllI[26]))) {
                var8.interact(lIIIllllllllI[0]);
            }
            g.a(new String[lIIIllllllllI[0]]);
        }
    }
}

