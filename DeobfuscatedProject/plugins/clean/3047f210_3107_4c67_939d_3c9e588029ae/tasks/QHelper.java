/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.input.Keyboard
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
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class QHelper
implements S {
    public static  boolean bs;
    public static final  WorldPoint iH;
    
    static  int ck;
    static  boolean cl;
    private static final  String[] iK;
    public static final  WorldPoint iI;
    
    public static  List<d> bu;
    public static final  WorldPoint iJ;
    static  int bS;

    private static boolean llIIIlllllIIl(int n2) {
        return n2 <= 0;
    }

    private static boolean llIIIllllIlII(int n2) {
        return n2 > 0;
    }

    private static void llIIIlllIllIl() {
        lllIlIllll = new String[lllIllIIII[65]];
        Q.lllIlIllll[Q.lllIllIIII[0]] = "Buying items";
        Q.lllIlIllll[Q.lllIllIIII[1]] = "Finished buying items, switching back to quest";
        Q.lllIlIllll[Q.lllIllIIII[3]] = "Drink";
        Q.lllIlIllll[Q.lllIllIIII[5]] = "Eat";
        Q.lllIlIllll[Q.lllIllIIII[8]] = "Nav to bank";
        Q.lllIlIllll[Q.lllIllIIII[9]] = "Handling banking";
        Q.lllIlIllll[Q.lllIllIIII[16]] = "We are missing quest supplies, switching to BUYING";
        Q.lllIlIllll[Q.lllIllIIII[19]] = "Nav to start";
        Q.lllIlIllll[Q.lllIllIIII[20]] = "Starting quest";
        Q.lllIlIllll[Q.lllIllIIII[21]] = "Door";
        Q.lllIlIllll[Q.lllIllIIII[18]] = "Open";
        Q.lllIlIllll[Q.lllIllIIII[22]] = "Open";
        Q.lllIlIllll[Q.lllIllIIII[23]] = "Hetty";
        Q.lllIlIllll[Q.lllIllIIII[24]] = "Burnt meat";
        Q.lllIlIllll[Q.lllIllIIII[25]] = "Raw rat meat";
        Q.lllIlIllll[Q.lllIllIIII[26]] = "Cooked meat";
        Q.lllIlIllll[Q.lllIllIIII[27]] = "Nav to range";
        Q.lllIlIllll[Q.lllIllIIII[28]] = "Raw rat meat";
        Q.lllIlIllll[Q.lllIllIIII[29]] = "Cooked meat";
        Q.lllIlIllll[Q.lllIllIIII[30]] = "Range";
        Q.lllIlIllll[Q.lllIllIIII[31]] = "Range";
        Q.lllIlIllll[Q.lllIllIIII[32]] = " ";
        Q.lllIlIllll[Q.lllIllIIII[33]] = "Burnt meat";
        Q.lllIlIllll[Q.lllIllIIII[34]] = "Rat's tail";
        Q.lllIlIllll[Q.lllIllIIII[35]] = "Nav to rat";
        Q.lllIlIllll[Q.lllIllIIII[36]] = "Rat's tail";
        Q.lllIlIllll[Q.lllIllIIII[37]] = "Rat";
        Q.lllIlIllll[Q.lllIllIIII[38]] = "Attack";
        Q.lllIlIllll[Q.lllIllIIII[39]] = "Take";
        Q.lllIlIllll[Q.lllIllIIII[40]] = "Burnt meat";
        Q.lllIlIllll[Q.lllIllIIII[41]] = "Rat's tail";
        Q.lllIlIllll[Q.lllIllIIII[42]] = "Nav to start";
        Q.lllIlIllll[Q.lllIllIIII[43]] = "Starting quest";
        Q.lllIlIllll[Q.lllIllIIII[44]] = "Hetty";
        Q.lllIlIllll[Q.lllIllIIII[45]] = "Cauldron";
        Q.lllIlIllll[Q.lllIllIIII[46]] = "Drink From";
        Q.lllIlIllll[Q.lllIllIIII[47]] = "Drink From";
        Q.lllIlIllll[Q.lllIllIIII[48]] = "Break";
        Q.lllIlIllll[Q.lllIllIIII[55]] = "Witches potion quest";
        Q.lllIlIllll[Q.lllIllIIII[56]] = "ring of wealth (";
        Q.lllIlIllll[Q.lllIllIIII[53]] = "I am in search of a quest.";
        Q.lllIlIllll[Q.lllIllIIII[63]] = "Yes, help me become one with my darker side.";
        Q.lllIlIllll[Q.lllIllIIII[64]] = "Yes.";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aa() {
        int n2;
        int[] nArray = new int[lllIllIIII[1]];
        nArray[Q.lllIllIIII[0]] = lllIllIIII[14];
        if (Q.llIIIllllIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lllIllIIII[1]];
            nArray2[Q.lllIllIIII[0]] = lllIllIIII[11];
            if (Q.llIIIllllIIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lllIllIIII[1]];
                nArray3[Q.lllIllIIII[0]] = lllIllIIII[15];
                if (Q.llIIIllllIIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n2 = lllIllIIII[1];

                    if (1 != 3) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = lllIllIIII[0];
        return n2 != 0;
    }

    private static int llIIIlllIllll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public String U() {
        return lllIlIllll[lllIllIIII[55]];
    }

    private static boolean llIIIllllIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIIllllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIllllIIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIllllIIll(int n2) {
        return n2 < 0;
    }

    static {
        Q.llIIIlllIlllI();
        Q.llIIIlllIllIl();
        iH = new WorldPoint(lllIllIIII[57], lllIllIIII[58], lllIllIIII[0]);
        iI = new WorldPoint(lllIllIIII[59], lllIllIIII[60], lllIllIIII[0]);
        iJ = new WorldPoint(lllIllIIII[61], lllIllIIII[62], lllIllIIII[0]);
        String[] stringArray = new String[lllIllIIII[5]];
        stringArray[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[53]];
        stringArray[Q.lllIllIIII[1]] = lllIlIllll[lllIllIIII[63]];
        stringArray[Q.lllIllIIII[3]] = lllIlIllll[lllIllIIII[64]];
        iK = stringArray;
        bu = new ArrayList<d>();
        bS = lllIllIIII[0];
    }

    private static boolean llIIIllllIlIl(Object object) {
        return object != null;
    }

    private static void ae() {
        d var1;
        Object var2;
        int[] nArray = new int[lllIllIIII[1]];
        nArray[Q.lllIllIIII[0]] = lllIllIIII[15];
        if (Q.llIIIllllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lllIllIIII[15], lllIllIIII[1], lllIllIIII[49]);
            bu.add(d2);

        }
        int[] nArray2 = new int[lllIllIIII[1]];
        nArray2[Q.lllIllIIII[0]] = lllIllIIII[11];
        if (Q.llIIIllllIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var2 = new DHelper(lllIllIIII[11], lllIllIIII[1], lllIllIIII[49]);
            bu.add((DHelper) ar2);

        }
        int[] nArray3 = new int[lllIllIIII[1]];
        nArray3[Q.lllIllIIII[0]] = lllIllIIII[14];
        if (Q.llIIIllllIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var2 = new DHelper(lllIllIIII[14], lllIllIIII[1], lllIllIIII[49]);
            bu.add((DHelper) ar2);

        }
        if (Q.llIIIllllIIlI(Bank.contains((Predicate)(var2 = item -> item.getName().toLowerCase().contains(lllIlIllll[lllIllIIII[56]]))) ? 1 : 0)) {
            var1 = new DHelper(lllIllIIII[50], lllIllIIII[9], lllIllIIII[51]);
            bu.add(var1);

        }
        int[] nArray4 = new int[lllIllIIII[1]];
        nArray4[Q.lllIllIIII[0]] = lllIllIIII[17];
        if (Q.llIIIllllIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var1 = new DHelper(lllIllIIII[17], lllIllIIII[18], lllIllIIII[52]);
            bu.add(var1);

        }
        int[] nArray5 = new int[lllIllIIII[1]];
        nArray5[Q.lllIllIIII[0]] = lllIllIIII[13];
        if (Q.llIIIllllIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var1 = new DHelper(lllIllIIII[13], lllIllIIII[53], lllIllIIII[52]);
            bu.add(var1);

        }
        int[] nArray6 = new int[lllIllIIII[1]];
        nArray6[Q.lllIllIIII[0]] = lllIllIIII[12];
        if (Q.llIIIllllIIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var1 = new DHelper(lllIllIIII[12], lllIllIIII[9], i.bp);
            bu.add(var1);

        }
    }

        return String.valueOf(var3);
    }

    public static void dn() {
        block48: {
            BankLocation var4;
            block51: {
                block52: {
                    block50: {
                        block49: {
                            if (Q.llIIIllllIIII(bs ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllIlIllll[lllIllIIII[0]];
                                b.a(bu);
                                if (Q.llIIIllllIIIl(bu.size(), lllIllIIII[1])) {
                                    System.out.println(lllIlIllll[lllIllIIII[1]]);
                                    bs = lllIllIIII[0];
                                }
                            }
                            if (!Q.llIIIllllIIlI(bs ? 1 : 0)) break block48;
                            if (Q.llIIIllllIIII(Inventory.contains((int[])f.aU) ? 1 : 0) && Q.llIIIllllIIIl(Movement.getRunEnergy(), lllIllIIII[2])) {
                                Inventory.getFirst((int[])f.aU).interact(lllIlIllll[lllIllIIII[3]]);
                                Time.sleepTicks((int)lllIllIIII[1]);

                            }
                            if (Q.llIIIllllIIll(Q.llIIIlllIllll(e.u(), 70.0))) {
                                int[] nArray = new int[lllIllIIII[1]];
                                nArray[Q.lllIllIIII[0]] = lllIllIIII[4];
                                if (Q.llIIIllllIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray2 = new int[lllIllIIII[1]];
                                    nArray2[Q.lllIllIIII[0]] = lllIllIIII[4];
                                    Inventory.getFirst((int[])nArray2).interact(lllIlIllll[lllIllIIII[5]]);
                                }
                            }
                            if (Q.llIIIllllIIlI(Movement.isRunEnabled() ? 1 : 0) && Q.llIIIllllIlII(Movement.getRunEnergy())) {
                                Movement.toggleRun();
                            }
                            if (!Q.llIIIllllIIII(Q.aa() ? 1 : 0)) break block49;
                            int[] nArray = new int[lllIllIIII[1]];
                            nArray[Q.lllIllIIII[0]] = lllIllIIII[6];
                            if (!Q.llIIIllllIlII(Inventory.getCount((int[])nArray))) break block50;
                        }
                        if (Q.llIIIllllIIIl(e.j(lllIllIIII[7]), lllIllIIII[1])) {
                            var4 = BankLocation.getNearest();
                            if (Q.llIIIllllIlIl(var4) && Q.llIIIllllIIlI(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllIlIllll[lllIllIIII[8]];
                                Movement.walkTo((BankLocation)var4);

                                Time.sleepTicks((int)lllIllIIII[3]);

                            }
                            if (Q.llIIIllllIlIl(var4) && Q.llIIIllllIIII(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllIlIllll[lllIllIIII[9]];
                                if (Q.llIIIllllIIlI(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lllIllIIII[10]);

                                }
                                if (Q.llIIIllllIIII(Bank.isOpen() ? 1 : 0)) {
                                    if (Q.llIIIllllIlII(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lllIllIIII[8]);

                                    }
                                    if (Q.llIIIllllIlII(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lllIllIIII[3]);

                                    }
                                    int[] nArray = new int[lllIllIIII[9]];
                                    nArray[Q.lllIllIIII[0]] = lllIllIIII[11];
                                    nArray[Q.lllIllIIII[1]] = lllIllIIII[12];
                                    nArray[Q.lllIllIIII[3]] = lllIllIIII[13];
                                    nArray[Q.lllIllIIII[5]] = lllIllIIII[14];
                                    nArray[Q.lllIllIIII[8]] = lllIllIIII[15];
                                    if (Q.llIIIllllIIlI(e.b(nArray) ? 1 : 0)) {
                                        Q.ae();
                                        System.out.println(lllIlIllll[lllIllIIII[16]]);
                                        bs = lllIllIIII[1];
                                        return;
                                    }
                                    Bank.withdraw((int)lllIllIIII[11], (int)lllIllIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIllIIII[1]);

                                    Bank.withdraw((int)lllIllIIII[14], (int)lllIllIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIllIIII[1]);

                                    Bank.withdraw((int)lllIllIIII[15], (int)lllIllIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIllIIII[1]);

                                    Bank.withdraw((int)lllIllIIII[17], (int)lllIllIIII[18], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIllIIII[1]);

                                    Bank.withdraw((int)lllIllIIII[13], (int)lllIllIIII[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIllIIII[1]);

                                    a.b(f.aU, lllIllIIII[1]);
                                    a.a(lllIllIIII[4], lllIllIIII[18]);
                                    a.b(f.be, lllIllIIII[1]);
                                }
                            }
                        }
                    }
                    if (Q.llIIIllllIIIl(e.j(lllIllIIII[7]), lllIllIIII[1]) && Q.llIIIllllIIII(Q.aa() ? 1 : 0)) {
                        if (Q.llIIIllllIllI(Players.getLocal().getWorldLocation().distanceTo(iH), lllIllIIII[5])) {
                            AccBuilderTempleTrek.c = lllIlIllll[lllIllIIII[19]];
                            if (Q.llIIIllllIIIl(bS, lllIllIIII[1])) {
                                e.v();
                                bS += lllIllIIII[1];
                            }
                            Movement.walkTo((WorldPoint)iH);

                            Time.sleepTicks((int)lllIllIIII[1]);

                        }
                        if (Q.llIIIllllIlll(Players.getLocal().getWorldLocation().distanceTo(iH), lllIllIIII[9])) {
                            AccBuilderTempleTrek.c = lllIlIllll[lllIllIIII[20]];
                            String[] stringArray = new String[lllIllIIII[1]];
                            stringArray[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[21]];
                            var4 = TileObjects.getNearest((String[])stringArray);
                            if (Q.llIIIllllIlIl(var4)) {
                                String[] stringArray2 = new String[lllIllIIII[1]];
                                stringArray2[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[18]];
                                if (Q.llIIIllllIIII(var4.hasAction(stringArray2) ? 1 : 0) && Q.llIIIllllIlll(var4.getWorldLocation().distanceTo(iH), lllIllIIII[16])) {
                                    var4.interact(lllIlIllll[lllIllIIII[22]]);
                                    Time.sleepTicks((int)lllIllIIII[5]);

                                }
                            }
                            g.a(lllIlIllll[lllIllIIII[23]], iK, lllIllIIII[1]);
                        }
                    }
                    if (!Q.llIIIlllllIII(e.j(lllIllIIII[7]), lllIllIIII[1])) break block51;
                    String[] stringArray = new String[lllIllIIII[1]];
                    stringArray[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[24]];
                    if (!Q.llIIIllllIIIl(Inventory.getCount((String[])stringArray), lllIllIIII[1])) break block51;
                    String[] stringArray3 = new String[lllIllIIII[1]];
                    stringArray3[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[25]];
                    if (!Q.llIIIlllllIIl(Inventory.getCount((String[])stringArray3))) break block52;
                    String[] stringArray4 = new String[lllIllIIII[1]];
                    stringArray4[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[26]];
                    if (!Q.llIIIllllIlII(Inventory.getCount((String[])stringArray4))) break block51;
                }
                ck = lllIllIIII[0];
                if (Q.llIIIllllIllI(Players.getLocal().getWorldLocation().distanceTo(iI), lllIllIIII[3])) {
                    AccBuilderTempleTrek.c = lllIlIllll[lllIllIIII[27]];
                    Movement.walkTo((WorldPoint)iI);

                    Time.sleepTicks((int)lllIllIIII[1]);

                }
                if (Q.llIIIllllIlll(Players.getLocal().getWorldLocation().distanceTo(iI), lllIllIIII[3])) {
                    String[] stringArray = new String[lllIllIIII[1]];
                    stringArray[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[28]];
                    var4 = Inventory.getFirst((String[])stringArray);
                    String[] stringArray5 = new String[lllIllIIII[1]];
                    stringArray5[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[29]];
                    Item var5 = Inventory.getFirst((String[])stringArray5);
                    if (Q.llIIIllllIlIl(var4)) {
                        String[] stringArray6 = new String[lllIllIIII[1]];
                        stringArray6[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[30]];
                        var4.useOn(TileObjects.getNearest((String[])stringArray6));
                        Time.sleepTicks((int)lllIllIIII[3]);

                    }
                    if (Q.llIIIllllIlIl(var5)) {
                        String[] stringArray7 = new String[lllIllIIII[1]];
                        stringArray7[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[31]];
                        var5.useOn(TileObjects.getNearest((String[])stringArray7));
                        Time.sleepTicks((int)lllIllIIII[3]);

                    }
                    Keyboard.type((String)lllIlIllll[lllIllIIII[32]]);
                }
            }
            if (Q.llIIIlllllIII(e.j(lllIllIIII[7]), lllIllIIII[1])) {
                String[] stringArray = new String[lllIllIIII[1]];
                stringArray[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[33]];
                if (Q.llIIIllllIlII(Inventory.getCount((String[])stringArray))) {
                    String[] stringArray8 = new String[lllIllIIII[1]];
                    stringArray8[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[34]];
                    if (Q.llIIIllllIIIl(Inventory.getCount((String[])stringArray8), lllIllIIII[1])) {
                        if (Q.llIIIllllIllI(Players.getLocal().getWorldLocation().distanceTo(iJ), lllIllIIII[3])) {
                            AccBuilderTempleTrek.c = lllIlIllll[lllIllIIII[35]];
                            Movement.walkTo((WorldPoint)iJ);

                            Time.sleepTicks((int)lllIllIIII[1]);

                        }
                        if (Q.llIIIllllIlll(Players.getLocal().getWorldLocation().distanceTo(iJ), lllIllIIII[3])) {
                            String[] stringArray9 = new String[lllIllIIII[1]];
                            stringArray9[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[36]];
                            var4 = TileItems.getNearest((String[])stringArray9);
                            if (Q.llIIIlllllIlI(var4)) {
                                String[] stringArray10 = new String[lllIllIIII[1]];
                                stringArray10[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[37]];
                                NPCs.getNearest((String[])stringArray10).interact(lllIlIllll[lllIllIIII[38]]);
                                Time.sleepTicks((int)lllIllIIII[9]);

                            }
                            if (Q.llIIIllllIlIl(var4)) {
                                var4.interact(lllIlIllll[lllIllIIII[39]]);
                                Time.sleepTicks((int)lllIllIIII[3]);

                            }
                        }
                    }
                }
            }
            if (Q.llIIIlllllIII(e.j(lllIllIIII[7]), lllIllIIII[1])) {
                String[] stringArray = new String[lllIllIIII[1]];
                stringArray[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[40]];
                if (Q.llIIIllllIlII(Inventory.getCount((String[])stringArray))) {
                    String[] stringArray11 = new String[lllIllIIII[1]];
                    stringArray11[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[41]];
                    if (Q.llIIIllllIlII(Inventory.getCount((String[])stringArray11))) {
                        if (Q.llIIIllllIllI(Players.getLocal().getWorldLocation().distanceTo(iH), lllIllIIII[5])) {
                            AccBuilderTempleTrek.c = lllIlIllll[lllIllIIII[42]];
                            Movement.walkTo((WorldPoint)iH);

                            Time.sleepTicks((int)lllIllIIII[1]);

                        }
                        if (Q.llIIIllllIlll(Players.getLocal().getWorldLocation().distanceTo(iH), lllIllIIII[9])) {
                            AccBuilderTempleTrek.c = lllIlIllll[lllIllIIII[43]];
                            g.a(lllIlIllll[lllIllIIII[44]], iK, lllIllIIII[1]);
                        }
                    }
                }
            }
            if (Q.llIIIlllllIII(e.j(lllIllIIII[7]), lllIllIIII[3])) {
                String[] stringArray = new String[lllIllIIII[1]];
                stringArray[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[45]];
                var4 = TileObjects.getNearest((String[])stringArray);
                if (Q.llIIIllllIlIl(var4)) {
                    String[] stringArray12 = new String[lllIllIIII[1]];
                    stringArray12[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[46]];
                    if (Q.llIIIllllIIII(var4.hasAction(stringArray12) ? 1 : 0)) {
                        if (Q.llIIIllllIIIl(ck, lllIllIIII[1])) {
                            ac.mJ += lllIllIIII[1];
                            ac.d(AccBuilderTempleTrek.m);
                            ck += lllIllIIII[1];
                            ac.mJ = lllIllIIII[0];
                            cl = lllIllIIII[0];
                        }
                        var4.interact(lllIlIllll[lllIllIIII[47]]);
                        Time.sleepTicks((int)lllIllIIII[5]);

                    }
                }
                g.a(iK);
            }
            if (Q.llIIIlllllIII(e.j(lllIllIIII[7]), lllIllIIII[5]) && Q.llIIIllllIlll(Players.getLocal().getWorldLocation().distanceTo(iH), lllIllIIII[41])) {
                int[] nArray = new int[lllIllIIII[1]];
                nArray[Q.lllIllIIII[0]] = lllIllIIII[13];
                if (Q.llIIIllllIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray3 = new int[lllIllIIII[1]];
                    nArray3[Q.lllIllIIII[0]] = lllIllIIII[13];
                    Inventory.getFirst((int[])nArray3).interact(lllIlIllll[lllIllIIII[48]]);
                    Time.sleepTicks((int)lllIllIIII[16]);

                }
            }
            g.a(new String[lllIllIIII[0]]);
            System.out.println("Setting: " + e.j(lllIllIIII[7]));
        }
    }

    private static boolean llIIIllllIlll(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public int T() {
        try {
            Q.dn();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 > (0x7C ^ 0x78)) {
            return (0xDF ^ 0x87) & ~(0x60 ^ 0x38);
        }
        return lllIllIIII[54];
    }

    private static boolean llIIIlllllIlI(Object object) {
        return object == null;
    }

    private static boolean llIIIlllllIII(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean V() {
        int n2;
        if (Q.llIIIlllllIII(e.j(lllIllIIII[7]), lllIllIIII[5]) && Q.llIIIllllIllI(Players.getLocal().getWorldLocation().distanceTo(iH), lllIllIIII[41])) {
            n2 = lllIllIIII[1];

            if (3 == 0) {
                return ((0x40 ^ 0x7F ^ (0x6A ^ 0x4E)) & (137 + 67 - 57 + 22 ^ 134 + 106 - 78 + 16 ^ -1)) != 0;
            }
        } else {
            n2 = lllIllIIII[0];
        }
        return n2 != 0;
    }

    private static boolean llIIIllllIIlI(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean S() {
        return lllIllIIII[0];
    }
}

