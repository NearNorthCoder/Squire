/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
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
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class NHelper
implements S {
    static  int bS;
    static  String[] bQ;
    static  boolean cl;
    public static  WorldPoint ig;
    public static  int if;
    
    public static  boolean bs;
    
    public static  List<d> bu;
    static  int ck;

    private static boolean llIIlIlIIllll(Object object) {
        return object != null;
    }

    private static void ae() {
        d var1;
        Object var2;
        block8: {
            block7: {
                int[] nArray = new int[lllIllllIl[1]];
                nArray[N.lllIllllIl[0]] = lllIllllIl[9];
                if (!N.llIIlIlIIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block7;
                int[] nArray2 = new int[lllIllllIl[1]];
                nArray2[N.lllIllllIl[0]] = lllIllllIl[9];
                if (!N.llIIlIlIIllII(Bank.contains((int[])nArray2) ? 1 : 0)) break block8;
                int[] nArray3 = new int[lllIllllIl[1]];
                nArray3[N.lllIllllIl[0]] = lllIllllIl[9];
                if (!N.llIIlIlIIllIl(Bank.getFirst((int[])nArray3).getQuantity(), lllIllllIl[10])) break block8;
            }
            var2 = new DHelper(lllIllllIl[9], lllIllllIl[10], lllIllllIl[25]);
            bu.add((DHelper) ar2);

        }
        int[] nArray = new int[lllIllllIl[1]];
        nArray[N.lllIllllIl[0]] = lllIllllIl[12];
        if (N.llIIlIlIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            var2 = new DHelper(lllIllllIl[12], lllIllllIl[18], lllIllllIl[25]);
            bu.add((DHelper) ar2);

        }
        if (N.llIIlIlIIlllI(Bank.contains((Predicate)(var2 = item -> item.getName().toLowerCase().contains(lllIllllII[lllIllllIl[33]]))) ? 1 : 0)) {
            var1 = new DHelper(lllIllllIl[26], lllIllllIl[8], lllIllllIl[27]);
            bu.add(var1);

        }
        int[] nArray4 = new int[lllIllllIl[1]];
        nArray4[N.lllIllllIl[0]] = lllIllllIl[13];
        if (N.llIIlIlIIlllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var1 = new DHelper(lllIllllIl[13], lllIllllIl[28], lllIllllIl[25]);
            bu.add(var1);

        }
        if (N.llIIlIlIIlllI(Bank.contains((int[])f.aU) ? 1 : 0)) {
            var1 = new DHelper(lllIllllIl[29], lllIllllIl[8], i.bp);
            bu.add(var1);

        }
    }

    private static void llIIlIlIIlIlI() {
        lllIllllII = new String[lllIllllIl[32]];
        N.lllIllllII[N.lllIllllIl[0]] = "Buying items";
        N.lllIllllII[N.lllIllllIl[1]] = "Finished buying items, switching back to questing";
        N.lllIllllII[N.lllIllllIl[3]] = "Drink";
        N.lllIllllII[N.lllIllllIl[5]] = "Navigating to bank";
        N.lllIllllII[N.lllIllllIl[6]] = "Opening bank";
        N.lllIllllII[N.lllIllllIl[8]] = "Handling banking";
        N.lllIllllII[N.lllIllllIl[11]] = "We are missing supplies, switching to BUYING";
        N.lllIllllII[N.lllIllllIl[14]] = "We are missing supplies, switching to BUYING";
        N.lllIllllII[N.lllIllllIl[16]] = "Nav to start";
        N.lllIllllII[N.lllIllllIl[17]] = "Fred the Farmer";
        N.lllIllllII[N.lllIllllIl[18]] = "Nav to start";
        N.lllIllllII[N.lllIllllIl[19]] = "Fred the Farmer";
        N.lllIllllII[N.lllIllllIl[20]] = "Talk-to";
        N.lllIllllII[N.lllIllllIl[22]] = "I'm looking for a quest.";
        N.lllIllllII[N.lllIllllIl[23]] = "Yes, okay. I can do that.";
        N.lllIllllII[N.lllIllllIl[24]] = "Yes.";
        N.lllIllllII[N.lllIllllIl[31]] = "Sheep shearer quest";
        N.lllIllllII[N.lllIllllIl[33]] = "ring of wealth (";
        N.lllIllllII[N.lllIllllIl[36]] = "I'm looking for a quest.";
        N.lllIllllII[N.lllIllllIl[37]] = "Yes, okay. I can do that.";
        N.lllIllllII[N.lllIllllIl[10]] = "Yes.";
    }

    private static void dg() {
        List var3;
        if (N.llIIlIlIIlllI(Dialog.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[lllIllllIl[1]];
            stringArray[N.lllIllllIl[0]] = lllIllllII[lllIllllIl[19]];
            List list = NPCs.getAll((String[])stringArray);
            if (N.llIIlIlIlIIII(list.size())) {
                ((NPC)list.get(lllIllllIl[0])).interact(lllIllllII[lllIllllIl[20]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)lllIllllIl[21]);

            }
        }
        if (N.llIIlIlIIllII(Dialog.isOpen() ? 1 : 0) && N.llIIlIlIIllII(Dialog.isViewingOptions() ? 1 : 0) && N.llIIlIlIIlllI((var3 = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
            int var4 = lllIllllIl[0];
            while (N.llIIlIlIIllIl(var4, var3.size())) {
                if (N.llIIlIlIIllII(((Widget)var3.get(var4)).getText().equalsIgnoreCase(lllIllllII[lllIllllIl[22]]) ? 1 : 0)) {
                    String[] stringArray = new String[lllIllllIl[1]];
                    stringArray[N.lllIllllIl[0]] = ((Widget)var3.get(var4)).getText();
                    Dialog.chooseOption((String[])stringArray);

                    if (2 < 3) break;
                    return;
                }
                if (N.llIIlIlIIllII(((Widget)var3.get(var4)).getText().equalsIgnoreCase(lllIllllII[lllIllllIl[23]]) ? 1 : 0)) {
                    String[] stringArray = new String[lllIllllIl[1]];
                    stringArray[N.lllIllllIl[0]] = ((Widget)var3.get(var4)).getText();
                    Dialog.chooseOption((String[])stringArray);

                    if (2 == 2) break;
                    return;
                }
                if (N.llIIlIlIIllII(((Widget)var3.get(var4)).getText().equalsIgnoreCase(lllIllllII[lllIllllIl[24]]) ? 1 : 0)) {
                    String[] stringArray = new String[lllIllllIl[1]];
                    stringArray[N.lllIllllIl[0]] = ((Widget)var3.get(var4)).getText();
                    Dialog.chooseOption((String[])stringArray);

                    if (3 >= 1) break;
                    return;
                }
                if (N.llIIlIlIIlllI(Dialog.isViewingOptions() ? 1 : 0)) {

                    if (-2 < 0) break;
                    return;
                }
                ++var4;

                if (((0x82 ^ 0xAB) & ~(9 ^ 0x20)) == 0) continue;
                return;
            }
        }
    }

    private static boolean llIIlIlIlIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIlIlIIllII(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (N.llIIlIlIlIlII(e.j(lllIllllIl[4]), lllIllllIl[32])) {
            bl = lllIllllIl[1];

            if (-(0x35 ^ 0x30) >= 0) {
                return (1 & ~1) != 0;
            }
        } else {
            bl = lllIllllIl[0];
        }
        return bl;
    }

    static {
        N.llIIlIlIIlIll();
        N.llIIlIlIIlIlI();
        bu = new ArrayList<d>();
        if = lllIllllIl[9];
        ig = new WorldPoint(lllIllllIl[34], lllIllllIl[35], lllIllllIl[0]);
        String[] stringArray = new String[lllIllllIl[5]];
        stringArray[N.lllIllllIl[0]] = lllIllllII[lllIllllIl[36]];
        stringArray[N.lllIllllIl[1]] = lllIllllII[lllIllllIl[37]];
        stringArray[N.lllIllllIl[3]] = lllIllllII[lllIllllIl[10]];
        bQ = stringArray;
    }

    private static boolean llIIlIlIlIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean bz() {
        int n2;
        int[] nArray = new int[lllIllllIl[1]];
        nArray[N.lllIllllIl[0]] = lllIllllIl[9];
        if (N.llIIlIlIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lllIllllIl[1]];
            nArray2[N.lllIllllIl[0]] = lllIllllIl[9];
            if (N.llIIlIlIlIlIl(Inventory.getAll((int[])nArray2).size(), lllIllllIl[10])) {
                n2 = lllIllllIl[1];

                if (null == null) return n2 != 0;
                return (3 & (3 ^ -1)) != 0;
            }
        }
        n2 = lllIllllIl[0];
        return n2 != 0;
    }

        return String.valueOf(var5);
    }

    private static boolean llIIlIlIlIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public String U() {
        return lllIllllII[lllIllllIl[31]];
    }

    private static boolean llIIlIlIlIIll(int n2, int n3) {
        return n2 != n3;
    }

    public static void df() {
        block22: {
            block23: {
                BankLocation var6;
                block24: {
                    block26: {
                        block25: {
                            if (N.llIIlIlIIllII(bs ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllIllllII[lllIllllIl[0]];
                                b.a(bu);
                                if (N.llIIlIlIIllIl(bu.size(), lllIllllIl[1])) {
                                    System.out.println(lllIllllII[lllIllllIl[1]]);
                                    bs = lllIllllIl[0];
                                }
                            }
                            if (!N.llIIlIlIIlllI(bs ? 1 : 0)) break block22;
                            if (N.llIIlIlIIllII(Inventory.contains((int[])f.aU) ? 1 : 0) && N.llIIlIlIIllIl(Movement.getRunEnergy(), lllIllllIl[2]) && N.llIIlIlIIlllI(Dialog.isOpen() ? 1 : 0)) {
                                Inventory.getFirst((int[])f.aU).interact(lllIllllII[lllIllllIl[3]]);
                                Time.sleepTicks((int)lllIllllIl[1]);

                            }
                            if (!N.llIIlIlIIllIl(e.j(lllIllllIl[4]), lllIllllIl[1])) break block23;
                            if (!N.llIIlIlIIlllI(N.bz() ? 1 : 0)) break block24;
                            var6 = BankLocation.getNearest();
                            if (N.llIIlIlIIllll(var6) && N.llIIlIlIIlllI(var6.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllIllllII[lllIllllIl[5]];
                                a.a(var6);
                            }
                            if (!N.llIIlIlIIllll(var6) || !N.llIIlIlIIllII(var6.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block24;
                            if (N.llIIlIlIIlllI(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllIllllII[lllIllllIl[6]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIllllIl[7]);

                            }
                            if (!N.llIIlIlIIllII(Bank.isOpen() ? 1 : 0)) break block24;
                            AccBuilderTempleTrek.c = lllIllllII[lllIllllIl[8]];
                            if (N.llIIlIlIlIIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lllIllllIl[5]);

                            }
                            if (N.llIIlIlIlIIII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lllIllllIl[3]);

                            }
                            int[] nArray = new int[lllIllllIl[1]];
                            nArray[N.lllIllllIl[0]] = lllIllllIl[9];
                            if (N.llIIlIlIIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lllIllllIl[1]];
                                nArray2[N.lllIllllIl[0]] = lllIllllIl[9];
                                if (N.llIIlIlIIllIl(Bank.getFirst((int[])nArray2).getQuantity(), lllIllllIl[10])) {
                                    N.ae();
                                    System.out.println(lllIllllII[lllIllllIl[11]]);
                                    bs = lllIllllIl[1];
                                    return;
                                }
                            }
                            int[] nArray3 = new int[lllIllllIl[1]];
                            nArray3[N.lllIllllIl[0]] = lllIllllIl[9];
                            if (!N.llIIlIlIIllII(Bank.contains((int[])nArray3) ? 1 : 0)) break block25;
                            int[] nArray4 = new int[lllIllllIl[1]];
                            nArray4[N.lllIllllIl[0]] = lllIllllIl[12];
                            if (!N.llIIlIlIIllII(Bank.contains((int[])nArray4) ? 1 : 0)) break block25;
                            int[] nArray5 = new int[lllIllllIl[1]];
                            nArray5[N.lllIllllIl[0]] = lllIllllIl[13];
                            if (!N.llIIlIlIIlllI(Bank.contains((int[])nArray5) ? 1 : 0)) break block26;
                        }
                        N.ae();
                        System.out.println(lllIllllII[lllIllllIl[14]]);
                        bs = lllIllllIl[1];
                        return;
                    }
                    Bank.withdraw((int)lllIllllIl[9], (int)lllIllllIl[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Bank.withdraw((int)lllIllllIl[12], (int)lllIllllIl[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Bank.withdraw((int)lllIllllIl[15], (int)lllIllllIl[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    a.b(f.be, lllIllllIl[1]);
                }
                if (N.llIIlIlIIllII(N.bz() ? 1 : 0)) {
                    if (N.llIIlIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(ig), lllIllllIl[3])) {
                        if (N.llIIlIlIIllIl(bS, lllIllllIl[1])) {
                            e.v();
                            bS += lllIllllIl[1];
                        }
                        AccBuilderTempleTrek.c = lllIllllII[lllIllllIl[16]];
                        Movement.walkTo((WorldPoint)ig);

                    }
                    if (N.llIIlIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo(ig), lllIllllIl[3])) {
                        String[] stringArray = new String[lllIllllIl[1]];
                        stringArray[N.lllIllllIl[0]] = lllIllllII[lllIllllIl[17]];
                        var6 = NPCs.getNearest((String[])stringArray);
                        if (N.llIIlIlIIllll(var6) && N.llIIlIlIlIIIl(var6.getWorldLocation().distanceTo(ig), lllIllllIl[3])) {
                            e.v();
                        }
                        if (N.llIIlIlIIllIl(ck, lllIllllIl[1])) {
                            ac.mM += lllIllllIl[1];
                            ac.d(AccBuilderTempleTrek.m);
                            ck += lllIllllIl[1];
                            ac.mM = lllIllllIl[0];
                            cl = lllIllllIl[0];
                        }
                        N.dg();
                    }
                }
            }
            if (!N.llIIlIlIlIIll(e.j(lllIllllIl[4]), lllIllllIl[1]) || N.llIIlIlIlIlII(e.j(lllIllllIl[4]), lllIllllIl[10])) {
                if (N.llIIlIlIlIlII(e.j(lllIllllIl[4]), lllIllllIl[1])) {
                    if (N.llIIlIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(ig), lllIllllIl[3])) {
                        AccBuilderTempleTrek.c = lllIllllII[lllIllllIl[18]];
                        Movement.walkTo((WorldPoint)ig);

                        Time.sleepTicks((int)lllIllllIl[1]);

                    }
                    N.dg();
                }
                if (N.llIIlIlIlIlII(e.j(lllIllllIl[4]), lllIllllIl[10])) {
                    N.dg();
                }
            }
            g.a(new String[lllIllllIl[0]]);
        }
    }

    @Override
    public boolean S() {
        return lllIllllIl[0];
    }

    private static boolean llIIlIlIlIIII(int n2) {
        return n2 > 0;
    }

    private static boolean llIIlIlIlIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIlIlIIlllI(int n2) {
        return n2 == 0;
    }

    @Override
    public int T() {
        try {
            N.df();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        return lllIllllIl[30];
    }

    private static boolean llIIlIlIIllIl(int n2, int n3) {
        return n2 < n3;
    }
}

