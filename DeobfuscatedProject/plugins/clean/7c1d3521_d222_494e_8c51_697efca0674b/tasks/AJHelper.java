/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
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
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.FHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.GHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.JHelper;

public class AJHelper
implements ac {
    public static  List<d> bv;
    static  int pN;
    
    public static  boolean bt;
    static  WorldPoint de;

    public static void gY() {
        if (aJ.lIlIIIIlIlIIl(bt ? 1 : 0)) {
            b.a(bv);
            if (aJ.lIlIIIIlIlIlI(bv.size(), lIlllllIll[0])) {
                System.out.println(lIlllllIIl[lIlllllIll[1]]);
                bt = lIlllllIll[1];
            }
        }
        if (aJ.lIlIIIIlIlIll(bt ? 1 : 0)) {
            if (aJ.lIlIIIIlIlIll(aJ.an() ? 1 : 0) && aJ.lIlIIIIlIlIlI(e.j(pN), lIlllllIll[0])) {
                BankLocation var1 = BankLocation.getNearest();
                if (aJ.lIlIIIIlIllII(var1) && aJ.lIlIIIIlIlIll(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lIlllllIIl[lIlllllIll[0]];
                    a.a(var1);
                }
                if (aJ.lIlIIIIlIllII(var1) && aJ.lIlIIIIlIlIIl(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (aJ.lIlIIIIlIlIll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIlllllIll[2]);

                    }
                    if (aJ.lIlIIIIlIlIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = lIlllllIIl[lIlllllIll[3]];
                        if (aJ.lIlIIIIlIllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIlllllIll[4]);

                        }
                        if (aJ.lIlIIIIlIllIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIlllllIll[3]);

                        }
                        int[] nArray = new int[lIlllllIll[3]];
                        nArray[aJ.lIlllllIll[1]] = lIlllllIll[5];
                        nArray[aJ.lIlllllIll[0]] = lIlllllIll[6];
                        if (aJ.lIlIIIIlIlIll(e.c(nArray) ? 1 : 0)) {
                            aJ.Q();
                            System.out.println(lIlllllIIl[lIlllllIll[7]]);
                            bt = lIlllllIll[0];
                            return;
                        }
                        int[] nArray2 = new int[lIlllllIll[3]];
                        nArray2[aJ.lIlllllIll[1]] = lIlllllIll[5];
                        nArray2[aJ.lIlllllIll[0]] = lIlllllIll[6];
                        if (aJ.lIlIIIIlIlIIl(e.c(nArray2) ? 1 : 0)) {
                            a.a(lIlllllIll[5], lIlllllIll[8]);
                            a.a(lIlllllIll[9], lIlllllIll[0]);
                        }
                    }
                }
            }
            if (aJ.lIlIIIIlIlIIl(Inventory.contains((int[])f.ba) ? 1 : 0) && aJ.lIlIIIIlIlIlI(Movement.getRunEnergy(), lIlllllIll[10])) {
                Inventory.getFirst((int[])f.ba).interact(lIlllllIIl[lIlllllIll[4]]);
                Time.sleepTicks((int)lIlllllIll[0]);

            }
            if (aJ.lIlIIIIlIlIIl(Inventory.contains((int[])f.aX) ? 1 : 0) && aJ.lIlIIIIlIlIlI(Prayers.getPoints(), lIlllllIll[11])) {
                Inventory.getFirst((int[])f.aX).interact(lIlllllIIl[lIlllllIll[12]]);
            }
            if (aJ.lIlIIIIlIlllI(aJ.lIlIIIIlIlIII(e.w(), 60.0))) {
                String[] stringArray = new String[lIlllllIll[0]];
                stringArray[aJ.lIlllllIll[1]] = lIlllllIIl[lIlllllIll[13]];
                if (aJ.lIlIIIIlIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIlllllIll[0]];
                    stringArray2[aJ.lIlllllIll[1]] = lIlllllIIl[lIlllllIll[14]];
                    Inventory.getFirst((String[])stringArray2).interact(lIlllllIIl[lIlllllIll[15]]);
                    Time.sleepTicks((int)lIlllllIll[3]);

                }
            }
            if (aJ.lIlIIIIlIlIIl(aJ.an() ? 1 : 0) && aJ.lIlIIIIlIlIll(e.j(pN))) {
                if (aJ.lIlIIIIlIllll(Players.getLocal().getWorldLocation().distanceTo(de), lIlllllIll[15])) {
                    AccBuilderSotf.c = lIlllllIIl[lIlllllIll[16]];
                    if (aJ.lIlIIIIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)de);

                    Time.sleepTicks((int)lIlllllIll[0]);

                }
                if (aJ.lIlIIIIllIIII(Players.getLocal().getWorldLocation().distanceTo(de), lIlllllIll[15])) {
                    g.a(lIlllllIIl[lIlllllIll[8]], cE);
                }
            }
        }
    }

    private static boolean lIlIIIIlIlllI(int n2) {
        return n2 < 0;
    }

        return String.valueOf(var2);
    }

    private static boolean lIlIIIIlIlIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIIlIllII(Object object) {
        return object != null;
    }

    static {
        aJ.lIlIIIIlIIlll();
        aJ.lIlIIIIlIIllI();
        bv = new ArrayList<d>();
        de = new WorldPoint(lIlllllIll[1], lIlllllIll[1], lIlllllIll[1]);
        pN = lIlllllIll[1];
        String[] stringArray = new String[lIlllllIll[0]];
        stringArray[aJ.lIlllllIll[1]] = lIlllllIIl[lIlllllIll[35]];
        cE = stringArray;
    }

    private static int lIlIIIIlIlIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void var3;
        int[] nArray = new int[lIlllllIll[7]];
        nArray[aJ.lIlllllIll[1]] = lIlllllIll[5];
        nArray[aJ.lIlllllIll[0]] = lIlllllIll[17];
        nArray[aJ.lIlllllIll[3]] = lIlllllIll[9];
        int[] nArray2 = nArray;
        int var4 = lIlllllIll[1];
        while (aJ.lIlIIIIlIlIlI(var4, ((void)var3).length)) {
            int[] nArray3 = new int[lIlllllIll[0]];
            nArray3[aJ.lIlllllIll[1]] = var3[var4];
            if (aJ.lIlIIIIlIlIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIlllllIll[1];
            }
            ++var4;

            if (-(123 + 103 - 101 + 17 ^ 54 + 94 - 135 + 125) <= 0) continue;
            return ((0x91 ^ 0x8D ^ (1 ^ 0x2C)) & (0xF1 ^ 0x96 ^ (3 ^ 0x55) ^ -1)) != 0;
        }
        return lIlllllIll[0];
    }

    private static boolean lIlIIIIllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void Q() {
        block22: {
            d var5;
            block21: {
                block20: {
                    block19: {
                        block18: {
                            block17: {
                                Object var6;
                                block16: {
                                    block15: {
                                        int[] nArray = new int[lIlllllIll[0]];
                                        nArray[aJ.lIlllllIll[1]] = lIlllllIll[17];
                                        if (!aJ.lIlIIIIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block15;
                                        int[] nArray2 = new int[lIlllllIll[0]];
                                        nArray2[aJ.lIlllllIll[1]] = lIlllllIll[17];
                                        if (!aJ.lIlIIIIlIlIIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block16;
                                        int[] nArray3 = new int[lIlllllIll[0]];
                                        nArray3[aJ.lIlllllIll[1]] = lIlllllIll[17];
                                        if (!aJ.lIlIIIIlIlIlI(Bank.getFirst((int[])nArray3).getQuantity(), lIlllllIll[8])) break block16;
                                    }
                                    var6 = new DHelper(lIlllllIll[17], lIlllllIll[8], e.c(lIlllllIll[18], lIlllllIll[19]));
                                    bv.add((DHelper) ar6);

                                }
                                int[] nArray = new int[lIlllllIll[0]];
                                nArray[aJ.lIlllllIll[1]] = lIlllllIll[20];
                                if (aJ.lIlIIIIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    var6 = new DHelper(lIlllllIll[20], lIlllllIll[21], lIlllllIll[22]);
                                    bv.add((DHelper) ar6);

                                }
                                if (aJ.lIlIIIIlIlIll(Bank.contains((Predicate)(var6 = item -> item.getName().toLowerCase().contains(lIlllllIIl[lIlllllIll[34]]))) ? 1 : 0)) {
                                    var5 = new DHelper(lIlllllIll[23], lIlllllIll[12], lIlllllIll[24]);
                                    bv.add(var5);

                                }
                                int[] nArray4 = new int[lIlllllIll[0]];
                                nArray4[aJ.lIlllllIll[1]] = lIlllllIll[25];
                                if (aJ.lIlIIIIlIlIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    var5 = new DHelper(lIlllllIll[25], lIlllllIll[0], lIlllllIll[26]);
                                    bv.add(var5);

                                }
                                int[] nArray5 = new int[lIlllllIll[0]];
                                nArray5[aJ.lIlllllIll[1]] = lIlllllIll[9];
                                if (!aJ.lIlIIIIlIlIIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block17;
                                int[] nArray6 = new int[lIlllllIll[0]];
                                nArray6[aJ.lIlllllIll[1]] = lIlllllIll[9];
                                if (!aJ.lIlIIIIlIlIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block18;
                                int[] nArray7 = new int[lIlllllIll[0]];
                                nArray7[aJ.lIlllllIll[1]] = lIlllllIll[9];
                                if (!aJ.lIlIIIIlIlIlI(Bank.getFirst((int[])nArray7).getQuantity(), lIlllllIll[4])) break block18;
                            }
                            var5 = new DHelper(lIlllllIll[9], lIlllllIll[4], j.cf);
                            bv.add(var5);

                        }
                        int[] nArray = new int[lIlllllIll[0]];
                        nArray[aJ.lIlllllIll[1]] = lIlllllIll[27];
                        if (!aJ.lIlIIIIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block19;
                        int[] nArray8 = new int[lIlllllIll[0]];
                        nArray8[aJ.lIlllllIll[1]] = lIlllllIll[27];
                        if (!aJ.lIlIIIIlIlIIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block20;
                        int[] nArray9 = new int[lIlllllIll[0]];
                        nArray9[aJ.lIlllllIll[1]] = lIlllllIll[27];
                        if (!aJ.lIlIIIIlIlIlI(Bank.getFirst((int[])nArray9).getQuantity(), lIlllllIll[22])) break block20;
                    }
                    var5 = new DHelper(lIlllllIll[27], lIlllllIll[22], lIlllllIll[28]);
                    bv.add(var5);

                }
                int[] nArray = new int[lIlllllIll[0]];
                nArray[aJ.lIlllllIll[1]] = lIlllllIll[5];
                if (!aJ.lIlIIIIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block21;
                int[] nArray10 = new int[lIlllllIll[0]];
                nArray10[aJ.lIlllllIll[1]] = lIlllllIll[5];
                if (!aJ.lIlIIIIlIlIIl(Bank.contains((int[])nArray10) ? 1 : 0)) break block22;
                int[] nArray11 = new int[lIlllllIll[0]];
                nArray11[aJ.lIlllllIll[1]] = lIlllllIll[5];
                if (!aJ.lIlIIIIlIlIlI(Bank.getFirst((int[])nArray11).getQuantity(), lIlllllIll[29])) break block22;
            }
            var5 = new DHelper(lIlllllIll[5], lIlllllIll[30], lIlllllIll[31]);
            bv.add(var5);

        }
    }

    private static boolean lIlIIIIlIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIIlIllIl(int n2) {
        return n2 > 0;
    }

    @Override
    public int af() {
        try {
            aJ.gY();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        return lIlllllIll[32];
    }

    private static boolean lIlIIIIlIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIIlIllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIIIllIIII(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public String ag() {
        return lIlllllIIl[lIlllllIll[33]];
    }

    private static void lIlIIIIlIIllI() {
        lIlllllIIl = new String[lIlllllIll[36]];
        aJ.lIlllllIIl[aJ.lIlllllIll[1]] = "Finished buying items, switching back to quest";
        aJ.lIlllllIIl[aJ.lIlllllIll[0]] = "Nav to bank";
        aJ.lIlllllIIl[aJ.lIlllllIll[3]] = "Handling banking";
        aJ.lIlllllIIl[aJ.lIlllllIll[7]] = "We are missing quest supplies, switching to BUYING";
        aJ.lIlllllIIl[aJ.lIlllllIll[4]] = "Drink";
        aJ.lIlllllIIl[aJ.lIlllllIll[12]] = "Drink";
        aJ.lIlllllIIl[aJ.lIlllllIll[13]] = "Shark";
        aJ.lIlllllIIl[aJ.lIlllllIll[14]] = "Shark";
        aJ.lIlllllIIl[aJ.lIlllllIll[15]] = "Eat";
        aJ.lIlllllIIl[aJ.lIlllllIll[16]] = "Nav to start";
        aJ.lIlllllIIl[aJ.lIlllllIll[8]] = aJ.lIlIIIIIlllIl("OqIVuQczDOg=", "FOqhP");
        aJ.lIlllllIIl[aJ.lIlllllIll[33]] = aJ.lIlIIIIIlllIl("qLn5l+vxhXY=", "unMIL");
        aJ.lIlllllIIl[aJ.lIlllllIll[34]] = "ring of wealth (";
        aJ.lIlllllIIl[aJ.lIlllllIll[35]] = "Yes.";
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (aJ.lIlIIIIllIIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlllllIll[15])) {
            bl = lIlllllIll[0];

            if (-(172 + 123 - 198 + 81 ^ 150 + 59 - 62 + 35) >= 0) {
                return ((0x43 ^ 0x2F ^ (0xBC ^ 0xC6)) & (0x87 ^ 0xC0 ^ (0xEE ^ 0xBF) ^ -1)) != 0;
            }
        } else {
            bl = lIlllllIll[1];
        }
        return bl;
    }

    @Override
    public boolean ae() {
        return lIlllllIll[1];
    }
}

