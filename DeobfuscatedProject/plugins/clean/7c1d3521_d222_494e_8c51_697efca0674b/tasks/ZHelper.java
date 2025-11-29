/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

import gg.squire.account.AccBuilderSotf;
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
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.ANHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.FHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.GHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.JHelper;

public class ZHelper
implements ac {
    
    static  int cG;
    static  boolean dj;
    public static final  WorldPoint eb;
    static  int di;
    public static  boolean bt;
    
    public static  List<d> bv;
    public static final  WorldPoint ea;
    public static final  WorldPoint ec;

    @Override
    public int af() {
        try {
            z.bt();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x5F ^ 0x59) & ~(0x4B ^ 0x4D)) > 3) {
            return (0x71 ^ 0x7B) & ~(0x71 ^ 0x7B);
        }
        return lllIIIlllI[51];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        String[] stringArray = new String[lllIIIlllI[1]];
        stringArray[z.lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[40]];
        if (z.llIIIIIIIIIlI(Inventory.getCount((String[])stringArray))) {
            String[] stringArray2 = new String[lllIIIlllI[1]];
            stringArray2[z.lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[41]];
            if (z.llIIIIIIIIIlI(Inventory.getCount((String[])stringArray2))) {
                String[] stringArray3 = new String[lllIIIlllI[1]];
                stringArray3[z.lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[42]];
                if (z.llIIIIIIIIIlI(Inventory.getCount((String[])stringArray3))) {
                    String[] stringArray4 = new String[lllIIIlllI[1]];
                    stringArray4[z.lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[43]];
                    if (z.llIIIIIIIIIlI(Inventory.getCount((String[])stringArray4))) {
                        n2 = lllIIIlllI[1];

                        if (2 >= 0) return n2 != 0;
                        return ((0x25 ^ 0x6D ^ (0x2C ^ 0x4B)) & (131 + 86 - 178 + 106 ^ 167 + 155 - 152 + 20 ^ -1)) != 0;
                    }
                }
            }
        }
        n2 = lllIIIlllI[0];
        return n2 != 0;
    }

    private static void Q() {
        d var1;
        Object var2;
        int[] nArray = new int[lllIIIlllI[1]];
        nArray[z.lllIIIlllI[0]] = lllIIIlllI[44];
        if (z.llIIIIIIIIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lllIIIlllI[44], lllIIIlllI[9], j.cf);
            bv.add(d2);

        }
        int[] nArray2 = new int[lllIIIlllI[1]];
        nArray2[z.lllIIIlllI[0]] = lllIIIlllI[11];
        if (z.llIIIIIIIIIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var2 = new DHelper(lllIIIlllI[11], lllIIIlllI[1], lllIIIlllI[45]);
            bv.add((DHelper) ar2);

        }
        int[] nArray3 = new int[lllIIIlllI[1]];
        nArray3[z.lllIIIlllI[0]] = lllIIIlllI[12];
        if (z.llIIIIIIIIIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var2 = new DHelper(lllIIIlllI[12], lllIIIlllI[1], lllIIIlllI[45]);
            bv.add((DHelper) ar2);

        }
        int[] nArray4 = new int[lllIIIlllI[1]];
        nArray4[z.lllIIIlllI[0]] = lllIIIlllI[14];
        if (z.llIIIIIIIIIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var2 = new DHelper(lllIIIlllI[14], lllIIIlllI[1], lllIIIlllI[45]);
            bv.add((DHelper) ar2);

        }
        int[] nArray5 = new int[lllIIIlllI[1]];
        nArray5[z.lllIIIlllI[0]] = lllIIIlllI[13];
        if (z.llIIIIIIIIIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var2 = new DHelper(lllIIIlllI[13], lllIIIlllI[1], lllIIIlllI[45]);
            bv.add((DHelper) ar2);

        }
        int[] nArray6 = new int[lllIIIlllI[1]];
        nArray6[z.lllIIIlllI[0]] = lllIIIlllI[4];
        if (z.llIIIIIIIIIII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var2 = new DHelper(lllIIIlllI[4], lllIIIlllI[17], lllIIIlllI[45]);
            bv.add((DHelper) ar2);

        }
        if (z.llIIIIIIIIIII(Bank.contains((Predicate)(var2 = item -> item.getName().toLowerCase().contains(lllIIIllIl[lllIIIlllI[53]]))) ? 1 : 0)) {
            var1 = new DHelper(lllIIIlllI[46], lllIIIlllI[9], lllIIIlllI[47]);
            bv.add(var1);

        }
        int[] nArray7 = new int[lllIIIlllI[1]];
        nArray7[z.lllIIIlllI[0]] = lllIIIlllI[48];
        if (z.llIIIIIIIIIII(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var1 = new DHelper(lllIIIlllI[48], lllIIIlllI[49], lllIIIlllI[50]);
            bv.add(var1);

        }
    }

    private static boolean llIIIIIIIIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllllllllllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllllllllll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        z.lIlllllllllII();
        z.lIllllllllIlI();
        ea = new WorldPoint(lllIIIlllI[54], lllIIIlllI[55], lllIIIlllI[0]);
        eb = new WorldPoint(lllIIIlllI[56], lllIIIlllI[57], lllIIIlllI[1]);
        ec = new WorldPoint(lllIIIlllI[58], lllIIIlllI[59], lllIIIlllI[0]);
        bv = new ArrayList<d>();
        cG = lllIIIlllI[0];
        String[] stringArray = new String[lllIIIlllI[9]];
        stringArray[z.lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[60]];
        stringArray[z.lllIIIlllI[1]] = lllIIIllIl[lllIIIlllI[61]];
        stringArray[z.lllIIIlllI[3]] = lllIIIllIl[lllIIIlllI[62]];
        stringArray[z.lllIIIlllI[5]] = lllIIIllIl[lllIIIlllI[63]];
        stringArray[z.lllIIIlllI[8]] = lllIIIllIl[lllIIIlllI[64]];
        cE = stringArray;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean bu() {
        int n2;
        String[] stringArray = new String[lllIIIlllI[1]];
        stringArray[z.lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[36]];
        if (z.llIIIIIIIIIlI(Inventory.getCount((String[])stringArray))) {
            String[] stringArray2 = new String[lllIIIlllI[1]];
            stringArray2[z.lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[37]];
            if (z.llIIIIIIIIIlI(Inventory.getCount((String[])stringArray2))) {
                String[] stringArray3 = new String[lllIIIlllI[1]];
                stringArray3[z.lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[38]];
                if (z.llIIIIIIIIIlI(Inventory.getCount((String[])stringArray3))) {
                    String[] stringArray4 = new String[lllIIIlllI[1]];
                    stringArray4[z.lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[39]];
                    if (z.llIIIIIIIIIlI(Inventory.getCount((String[])stringArray4))) {
                        n2 = lllIIIlllI[1];

                        if ((0x4C ^ 0x49) > 0) return n2 != 0;
                        return false;
                    }
                }
            }
        }
        n2 = lllIIIlllI[0];
        return n2 != 0;
    }

    private static boolean llIIIIIIIIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static int lIlllllllllIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llIIIIIIIIIIl(int n2) {
        return n2 < 0;
    }

    private static boolean llIIIIIIIIIll(Object object) {
        return object != null;
    }

    private static void lIllllllllIlI() {
        lllIIIllIl = new String[lllIIIlllI[49]];
        z.lllIIIllIl[z.lllIIIlllI[0]] = "Buying items";
        z.lllIIIllIl[z.lllIIIlllI[1]] = "Finished buying items, switching back to quest";
        z.lllIIIllIl[z.lllIIIlllI[3]] = "Drink";
        z.lllIIIllIl[z.lllIIIlllI[5]] = "Eat";
        z.lllIIIllIl[z.lllIIIlllI[8]] = "Nav to bank";
        z.lllIIIllIl[z.lllIIIlllI[9]] = "Handling banking";
        z.lllIIIllIl[z.lllIIIlllI[15]] = "We are missing quest supplies, switching to BUYING";
        z.lllIIIllIl[z.lllIIIlllI[18]] = "Nav to start";
        z.lllIIIllIl[z.lllIIIlllI[19]] = "Talk npc";
        z.lllIIIllIl[z.lllIIIlllI[20]] = "Kaqemeex";
        z.lllIIIllIl[z.lllIIIlllI[17]] = "Nav to sanfew";
        z.lllIIIllIl[z.lllIIIlllI[21]] = "Talk sanfew";
        z.lllIIIllIl[z.lllIIIlllI[22]] = "Sanfew";
        z.lllIIIllIl[z.lllIIIlllI[23]] = "Nav to couldren";
        z.lllIIIllIl[z.lllIIIlllI[24]] = "Enchanting";
        z.lllIIIllIl[z.lllIIIlllI[26]] = "Raw beef";
        z.lllIIIllIl[z.lllIIIlllI[27]] = "Raw rat meat";
        z.lllIIIllIl[z.lllIIIlllI[28]] = "Raw chicken";
        z.lllIIIllIl[z.lllIIIlllI[29]] = "Raw bear meat";
        z.lllIIIllIl[z.lllIIIlllI[30]] = "Nav to sanfew";
        z.lllIIIllIl[z.lllIIIlllI[31]] = "Talk sanfew";
        z.lllIIIllIl[z.lllIIIlllI[32]] = "Sanfew";
        z.lllIIIllIl[z.lllIIIlllI[33]] = "Nav to start";
        z.lllIIIllIl[z.lllIIIlllI[34]] = "Talk npc";
        z.lllIIIllIl[z.lllIIIlllI[35]] = "Kaqemeex";
        z.lllIIIllIl[z.lllIIIlllI[36]] = "Enchanted bear";
        z.lllIIIllIl[z.lllIIIlllI[37]] = "Enchanted chicken";
        z.lllIIIllIl[z.lllIIIlllI[38]] = "Enchanted rat";
        z.lllIIIllIl[z.lllIIIlllI[39]] = "Enchanted beef";
        z.lllIIIllIl[z.lllIIIlllI[40]] = "Raw chicken";
        z.lllIIIllIl[z.lllIIIlllI[41]] = "Raw beef";
        z.lllIIIllIl[z.lllIIIlllI[42]] = "Raw bear meat";
        z.lllIIIllIl[z.lllIIIlllI[43]] = "Raw rat meat";
        z.lllIIIllIl[z.lllIIIlllI[52]] = "Druidic ritual quest";
        z.lllIIIllIl[z.lllIIIlllI[53]] = "ring of wealth (";
        z.lllIIIllIl[z.lllIIIlllI[60]] = "I'm in search of a quest.";
        z.lllIIIllIl[z.lllIIIlllI[61]] = "Okay, I will try and help.";
        z.lllIIIllIl[z.lllIIIlllI[62]] = "Yes.";
        z.lllIIIllIl[z.lllIIIlllI[63]] = "I've been sent to help purify the Varrock stone circle.";
        z.lllIIIllIl[z.lllIIIlllI[64]] = "Ok, I'll do that then.";
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (z.llIIIIIIIIlll(e.j(lllIIIlllI[7]), lllIIIlllI[8])) {
            bl = lllIIIlllI[1];

            }
        } else {
            bl = lllIIIlllI[0];
        }
        return bl;
    }

    @Override
    public String ag() {
        return lllIIIllIl[lllIIIlllI[52]];
    }

    @Override
    public boolean ae() {
        return lllIIIlllI[0];
    }

    private static boolean llIIIIIIIIlll(int n2, int n3) {
        return n2 >= n3;
    }

    public static void bt() {
        block40: {
            BankLocation var3;
            block42: {
                block41: {
                    if (z.lIllllllllllI(bt ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[0]];
                        b.a(bv);
                        if (z.lIlllllllllll(bv.size(), lllIIIlllI[1])) {
                            System.out.println(lllIIIllIl[lllIIIlllI[1]]);
                            bt = lllIIIlllI[0];
                        }
                    }
                    if (!z.llIIIIIIIIIII(bt ? 1 : 0)) break block40;
                    if (z.lIllllllllllI(Inventory.contains((int[])f.ba) ? 1 : 0) && z.lIlllllllllll(Movement.getRunEnergy(), lllIIIlllI[2])) {
                        Inventory.getFirst((int[])f.ba).interact(lllIIIllIl[lllIIIlllI[3]]);
                        Time.sleepTicks((int)lllIIIlllI[1]);

                    }
                    if (z.llIIIIIIIIIIl(z.lIlllllllllIl(e.w(), 70.0))) {
                        int[] nArray = new int[lllIIIlllI[1]];
                        nArray[z.lllIIIlllI[0]] = lllIIIlllI[4];
                        if (z.lIllllllllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray2 = new int[lllIIIlllI[1]];
                            nArray2[z.lllIIIlllI[0]] = lllIIIlllI[4];
                            Inventory.getFirst((int[])nArray2).interact(lllIIIllIl[lllIIIlllI[5]]);
                        }
                    }
                    if (z.llIIIIIIIIIII(Movement.isRunEnabled() ? 1 : 0) && z.llIIIIIIIIIlI(Movement.getRunEnergy())) {
                        Movement.toggleRun();
                    }
                    if (!z.lIllllllllllI(z.an() ? 1 : 0)) break block41;
                    int[] nArray = new int[lllIIIlllI[1]];
                    nArray[z.lllIIIlllI[0]] = lllIIIlllI[6];
                    if (!z.llIIIIIIIIIlI(Inventory.getCount((int[])nArray))) break block42;
                }
                if (z.lIlllllllllll(e.j(lllIIIlllI[7]), lllIIIlllI[1])) {
                    var3 = BankLocation.getNearest();
                    if (z.llIIIIIIIIIll(var3) && z.llIIIIIIIIIII(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[8]];
                        a.a(var3);
                        Time.sleepTicks((int)lllIIIlllI[3]);

                    }
                    if (z.llIIIIIIIIIll(var3) && z.lIllllllllllI(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[9]];
                        if (z.llIIIIIIIIIII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIIlllI[10]);

                        }
                        if (z.lIllllllllllI(Bank.isOpen() ? 1 : 0)) {
                            if (z.llIIIIIIIIIlI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lllIIIlllI[8]);

                            }
                            if (z.llIIIIIIIIIlI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lllIIIlllI[3]);

                            }
                            int[] nArray = new int[lllIIIlllI[9]];
                            nArray[z.lllIIIlllI[0]] = lllIIIlllI[11];
                            nArray[z.lllIIIlllI[1]] = lllIIIlllI[12];
                            nArray[z.lllIIIlllI[3]] = lllIIIlllI[13];
                            nArray[z.lllIIIlllI[5]] = lllIIIlllI[14];
                            nArray[z.lllIIIlllI[8]] = lllIIIlllI[4];
                            if (z.llIIIIIIIIIII(e.c(nArray) ? 1 : 0)) {
                                z.Q();
                                System.out.println(lllIIIllIl[lllIIIlllI[15]]);
                                bt = lllIIIlllI[1];
                                return;
                            }
                            int[] nArray3 = new int[lllIIIlllI[9]];
                            nArray3[z.lllIIIlllI[0]] = lllIIIlllI[11];
                            nArray3[z.lllIIIlllI[1]] = lllIIIlllI[12];
                            nArray3[z.lllIIIlllI[3]] = lllIIIlllI[13];
                            nArray3[z.lllIIIlllI[5]] = lllIIIlllI[14];
                            nArray3[z.lllIIIlllI[8]] = lllIIIlllI[4];
                            if (z.lIllllllllllI(e.c(nArray3) ? 1 : 0)) {
                                Bank.withdraw((int)lllIIIlllI[11], (int)lllIIIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lllIIIlllI[1]);

                                Bank.withdraw((int)lllIIIlllI[12], (int)lllIIIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lllIIIlllI[1]);

                                Bank.withdraw((int)lllIIIlllI[13], (int)lllIIIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lllIIIlllI[1]);

                                Bank.withdraw((int)lllIIIlllI[14], (int)lllIIIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lllIIIlllI[1]);

                                a.a(lllIIIlllI[16], lllIIIlllI[9]);
                                a.b(f.ba, lllIIIlllI[9]);
                                a.a(lllIIIlllI[4], lllIIIlllI[17]);
                                a.b(f.bk, lllIIIlllI[1]);
                            }
                        }
                    }
                }
            }
            if (z.lIllllllllllI(z.an() ? 1 : 0) && z.lIlllllllllll(e.j(lllIIIlllI[7]), lllIIIlllI[1])) {
                if (z.llIIIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(ea), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[18]];
                    if (z.lIlllllllllll(cG, lllIIIlllI[1])) {
                        e.x();
                        cG += lllIIIlllI[1];
                    }
                    Movement.walkTo((WorldPoint)ea);

                    Time.sleepTicks((int)lllIIIlllI[1]);

                }
                if (z.llIIIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(ea), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[19]];
                    g.a(lllIIIllIl[lllIIIlllI[20]], cE);
                }
            }
            if (z.llIIIIIIIIllI(e.j(lllIIIlllI[7]), lllIIIlllI[1])) {
                di = lllIIIlllI[0];
                if (z.llIIIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(eb), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[17]];
                    Movement.walkTo((WorldPoint)eb);

                    Time.sleepTicks((int)lllIIIlllI[1]);

                }
                if (z.llIIIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(eb), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[21]];
                    g.a(lllIIIllIl[lllIIIlllI[22]], cE);
                }
            }
            if (z.llIIIIIIIIllI(e.j(lllIIIlllI[7]), lllIIIlllI[3]) && z.llIIIIIIIIIII(z.bu() ? 1 : 0)) {
                if (z.llIIIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(ec), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[23]];
                    Movement.walkTo((WorldPoint)ec);

                    Time.sleepTicks((int)lllIIIlllI[1]);

                }
                if (z.llIIIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(ec), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[24]];
                    int[] nArray = new int[lllIIIlllI[1]];
                    nArray[z.lllIIIlllI[0]] = lllIIIlllI[25];
                    var3 = TileObjects.getNearest((int[])nArray);
                    if (z.llIIIIIIIIIll(var3)) {
                        String[] stringArray = new String[lllIIIlllI[1]];
                        stringArray[z.lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[26]];
                        Item var4 = Inventory.getFirst((String[])stringArray);
                        String[] stringArray2 = new String[lllIIIlllI[1]];
                        stringArray2[z.lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[27]];
                        Item var5 = Inventory.getFirst((String[])stringArray2);
                        String[] stringArray3 = new String[lllIIIlllI[1]];
                        stringArray3[z.lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[28]];
                        Item var6 = Inventory.getFirst((String[])stringArray3);
                        String[] stringArray4 = new String[lllIIIlllI[1]];
                        stringArray4[z.lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[29]];
                        Item var7 = Inventory.getFirst((String[])stringArray4);
                        if (z.llIIIIIIIIIll(var4)) {
                            var4.useOn((TileObject)var3);
                            Time.sleepTicks((int)lllIIIlllI[1]);

                        }
                        if (z.llIIIIIIIIIll(var5)) {
                            var5.useOn((TileObject)var3);
                            Time.sleepTicks((int)lllIIIlllI[1]);

                        }
                        if (z.llIIIIIIIIIll(var6)) {
                            var6.useOn((TileObject)var3);
                            Time.sleepTicks((int)lllIIIlllI[1]);

                        }
                        if (z.llIIIIIIIIIll(var7)) {
                            var7.useOn((TileObject)var3);
                            Time.sleepTicks((int)lllIIIlllI[1]);

                        }
                    }
                }
            }
            if (z.llIIIIIIIIllI(e.j(lllIIIlllI[7]), lllIIIlllI[3]) && z.lIllllllllllI(z.bu() ? 1 : 0)) {
                if (z.llIIIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(eb), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[30]];
                    Movement.walkTo((WorldPoint)eb);

                    Time.sleepTicks((int)lllIIIlllI[1]);

                }
                if (z.llIIIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(eb), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[31]];
                    g.a(lllIIIllIl[lllIIIlllI[32]], cE);
                }
            }
            if (z.llIIIIIIIIllI(e.j(lllIIIlllI[7]), lllIIIlllI[5])) {
                if (z.llIIIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(ea), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[33]];
                    Movement.walkTo((WorldPoint)ea);

                    Time.sleepTicks((int)lllIIIlllI[1]);

                }
                if (z.llIIIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(ea), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[34]];
                    if (z.lIlllllllllll(di, lllIIIlllI[1])) {
                        aN.pX += lllIIIlllI[1];
                        aN.u(AccBuilderSotf.m);
                        di += lllIIIlllI[1];
                        aN.pX = lllIIIlllI[0];
                    }
                    g.a(lllIIIllIl[lllIIIlllI[35]], cE);
                }
            }
            g.a(cE);
        }
    }

        return String.valueOf(var8);
    }

    private static boolean llIIIIIIIIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIIIIIIIIlI(int n2) {
        return n2 > 0;
    }

    private static boolean llIIIIIIIIlIl(int n2, int n3) {
        return n2 <= n3;
    }
}

