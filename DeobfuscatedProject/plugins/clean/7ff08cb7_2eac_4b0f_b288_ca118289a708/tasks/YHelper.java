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
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AHelper;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.ASHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.BHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.DHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.EHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.FHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.GHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.JHelper;
import gg.squire.account.AccBuilderGWD;
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

public class YHelper
implements ab {
    
    public static  boolean bv;
    static  int cI;
    
    static  int dk;
    
    public static final  WorldPoint dN;
    public static final  WorldPoint dM;
    static  boolean dl;
    public static  List<d> bx;
    public static final  WorldPoint dO;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean bi() {
        int n2;
        String[] stringArray = new String[llIIlllll[1]];
        stringArray[y.llIIlllll[0]] = llIIllllI[llIIlllll[36]];
        if (y.lIlIllllIllI(Inventory.getCount((String[])stringArray))) {
            String[] stringArray2 = new String[llIIlllll[1]];
            stringArray2[y.llIIlllll[0]] = llIIllllI[llIIlllll[37]];
            if (y.lIlIllllIllI(Inventory.getCount((String[])stringArray2))) {
                String[] stringArray3 = new String[llIIlllll[1]];
                stringArray3[y.llIIlllll[0]] = llIIllllI[llIIlllll[38]];
                if (y.lIlIllllIllI(Inventory.getCount((String[])stringArray3))) {
                    String[] stringArray4 = new String[llIIlllll[1]];
                    stringArray4[y.llIIlllll[0]] = llIIllllI[llIIlllll[39]];
                    if (y.lIlIllllIllI(Inventory.getCount((String[])stringArray4))) {
                        n2 = llIIlllll[1];

                        if (null == null) return n2 != 0;
                        return false;
                    }
                }
            }
        }
        n2 = llIIlllll[0];
        return n2 != 0;
    }

    private static boolean lIlIllllIllI(int n2) {
        return n2 > 0;
    }

    private static int lIlIllllIIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIlIllllIlIl(int n2) {
        return n2 < 0;
    }

    private static boolean lIlIllllIlll(Object object) {
        return object != null;
    }

    @Override
    public boolean ae() {
        return llIIlllll[0];
    }

    private static boolean lIlIllllIIll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        String[] stringArray = new String[llIIlllll[1]];
        stringArray[y.llIIlllll[0]] = llIIllllI[llIIlllll[40]];
        if (y.lIlIllllIllI(Inventory.getCount((String[])stringArray))) {
            String[] stringArray2 = new String[llIIlllll[1]];
            stringArray2[y.llIIlllll[0]] = llIIllllI[llIIlllll[41]];
            if (y.lIlIllllIllI(Inventory.getCount((String[])stringArray2))) {
                String[] stringArray3 = new String[llIIlllll[1]];
                stringArray3[y.llIIlllll[0]] = llIIllllI[llIIlllll[42]];
                if (y.lIlIllllIllI(Inventory.getCount((String[])stringArray3))) {
                    String[] stringArray4 = new String[llIIlllll[1]];
                    stringArray4[y.llIIlllll[0]] = llIIllllI[llIIlllll[43]];
                    if (y.lIlIllllIllI(Inventory.getCount((String[])stringArray4))) {
                        n2 = llIIlllll[1];

                        if (2 > ((1 ^ 0x6E ^ (0x61 ^ 0x51)) & (0xC6 ^ 0xA5 ^ (0x17 ^ 0x2B) ^ -1))) return n2 != 0;
                        return ((197 + 107 - 115 + 20 ^ 83 + 61 - 77 + 82) & (0x56 ^ 0x7D ^ (0xFC ^ 0x93) ^ -1)) != 0;
                    }
                }
            }
        }
        n2 = llIIlllll[0];
        return n2 != 0;
    }

        return String.valueOf(lIIllllIIIIlIl);
    }

    private static boolean lIlIlllllIll(int n2, int n3) {
        return n2 >= n3;
    }

    public static void bh() {
        block40: {
            BankLocation lIIllllIllIllI;
            block42: {
                block41: {
                    if (y.lIlIllllIIlI(bv ? 1 : 0)) {
                        AccBuilderGWD.c = llIIllllI[llIIlllll[0]];
                        b.a(bx);
                        if (y.lIlIllllIIll(bx.size(), llIIlllll[1])) {
                            System.out.println(llIIllllI[llIIlllll[1]]);
                            bv = llIIlllll[0];
                        }
                    }
                    if (!y.lIlIllllIlII(bv ? 1 : 0)) break block40;
                    if (y.lIlIllllIIlI(Inventory.contains((int[])f.bc) ? 1 : 0) && y.lIlIllllIIll(Movement.getRunEnergy(), llIIlllll[2])) {
                        Inventory.getFirst((int[])f.bc).interact(llIIllllI[llIIlllll[3]]);
                        Time.sleepTicks((int)llIIlllll[1]);

                    }
                    if (y.lIlIllllIlIl(y.lIlIllllIIIl(e.w(), 70.0))) {
                        int[] nArray = new int[llIIlllll[1]];
                        nArray[y.llIIlllll[0]] = llIIlllll[4];
                        if (y.lIlIllllIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray2 = new int[llIIlllll[1]];
                            nArray2[y.llIIlllll[0]] = llIIlllll[4];
                            Inventory.getFirst((int[])nArray2).interact(llIIllllI[llIIlllll[5]]);
                        }
                    }
                    if (y.lIlIllllIlII(Movement.isRunEnabled() ? 1 : 0) && y.lIlIllllIllI(Movement.getRunEnergy())) {
                        Movement.toggleRun();
                    }
                    if (!y.lIlIllllIIlI(y.an() ? 1 : 0)) break block41;
                    int[] nArray = new int[llIIlllll[1]];
                    nArray[y.llIIlllll[0]] = llIIlllll[6];
                    if (!y.lIlIllllIllI(Inventory.getCount((int[])nArray))) break block42;
                }
                if (y.lIlIllllIIll(e.j(llIIlllll[7]), llIIlllll[1])) {
                    lIIllllIllIllI = BankLocation.getNearest();
                    if (y.lIlIllllIlll(lIIllllIllIllI) && y.lIlIllllIlII(lIIllllIllIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = llIIllllI[llIIlllll[8]];
                        a.a(lIIllllIllIllI);
                        Time.sleepTicks((int)llIIlllll[3]);

                    }
                    if (y.lIlIllllIlll(lIIllllIllIllI) && y.lIlIllllIIlI(lIIllllIllIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = llIIllllI[llIIlllll[9]];
                        if (y.lIlIllllIlII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlllll[10]);

                        }
                        if (y.lIlIllllIIlI(Bank.isOpen() ? 1 : 0)) {
                            if (y.lIlIllllIllI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIIlllll[8]);

                            }
                            if (y.lIlIllllIllI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llIIlllll[3]);

                            }
                            int[] nArray = new int[llIIlllll[9]];
                            nArray[y.llIIlllll[0]] = llIIlllll[11];
                            nArray[y.llIIlllll[1]] = llIIlllll[12];
                            nArray[y.llIIlllll[3]] = llIIlllll[13];
                            nArray[y.llIIlllll[5]] = llIIlllll[14];
                            nArray[y.llIIlllll[8]] = llIIlllll[4];
                            if (y.lIlIllllIlII(e.d(nArray) ? 1 : 0)) {
                                y.Q();
                                System.out.println(llIIllllI[llIIlllll[15]]);
                                bv = llIIlllll[1];
                                return;
                            }
                            int[] nArray3 = new int[llIIlllll[9]];
                            nArray3[y.llIIlllll[0]] = llIIlllll[11];
                            nArray3[y.llIIlllll[1]] = llIIlllll[12];
                            nArray3[y.llIIlllll[3]] = llIIlllll[13];
                            nArray3[y.llIIlllll[5]] = llIIlllll[14];
                            nArray3[y.llIIlllll[8]] = llIIlllll[4];
                            if (y.lIlIllllIIlI(e.d(nArray3) ? 1 : 0)) {
                                Bank.withdraw((int)llIIlllll[11], (int)llIIlllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)llIIlllll[1]);

                                Bank.withdraw((int)llIIlllll[12], (int)llIIlllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)llIIlllll[1]);

                                Bank.withdraw((int)llIIlllll[13], (int)llIIlllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)llIIlllll[1]);

                                Bank.withdraw((int)llIIlllll[14], (int)llIIlllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)llIIlllll[1]);

                                a.a(llIIlllll[16], llIIlllll[9]);
                                a.b(f.bc, llIIlllll[9]);
                                a.a(llIIlllll[4], llIIlllll[17]);
                                a.b(f.bm, llIIlllll[1]);
                            }
                        }
                    }
                }
            }
            if (y.lIlIllllIIlI(y.an() ? 1 : 0) && y.lIlIllllIIll(e.j(llIIlllll[7]), llIIlllll[1])) {
                if (y.lIlIlllllIII(Players.getLocal().getWorldLocation().distanceTo(dM), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[18]];
                    if (y.lIlIllllIIll(cI, llIIlllll[1])) {
                        e.x();
                        cI += llIIlllll[1];
                    }
                    Movement.walkTo((WorldPoint)dM);

                    Time.sleepTicks((int)llIIlllll[1]);

                }
                if (y.lIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(dM), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[19]];
                    g.a(llIIllllI[llIIlllll[20]], cG);
                }
            }
            if (y.lIlIlllllIlI(e.j(llIIlllll[7]), llIIlllll[1])) {
                dk = llIIlllll[0];
                if (y.lIlIlllllIII(Players.getLocal().getWorldLocation().distanceTo(dN), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[17]];
                    Movement.walkTo((WorldPoint)dN);

                    Time.sleepTicks((int)llIIlllll[1]);

                }
                if (y.lIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(dN), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[21]];
                    g.a(llIIllllI[llIIlllll[22]], cG);
                }
            }
            if (y.lIlIlllllIlI(e.j(llIIlllll[7]), llIIlllll[3]) && y.lIlIllllIlII(y.bi() ? 1 : 0)) {
                if (y.lIlIlllllIII(Players.getLocal().getWorldLocation().distanceTo(dO), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[23]];
                    Movement.walkTo((WorldPoint)dO);

                    Time.sleepTicks((int)llIIlllll[1]);

                }
                if (y.lIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(dO), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[24]];
                    int[] nArray = new int[llIIlllll[1]];
                    nArray[y.llIIlllll[0]] = llIIlllll[25];
                    lIIllllIllIllI = TileObjects.getNearest((int[])nArray);
                    if (y.lIlIllllIlll(lIIllllIllIllI)) {
                        String[] stringArray = new String[llIIlllll[1]];
                        stringArray[y.llIIlllll[0]] = llIIllllI[llIIlllll[26]];
                        Item lIIllllIllIlIl = Inventory.getFirst((String[])stringArray);
                        String[] stringArray2 = new String[llIIlllll[1]];
                        stringArray2[y.llIIlllll[0]] = llIIllllI[llIIlllll[27]];
                        Item lIIllllIllIlII = Inventory.getFirst((String[])stringArray2);
                        String[] stringArray3 = new String[llIIlllll[1]];
                        stringArray3[y.llIIlllll[0]] = llIIllllI[llIIlllll[28]];
                        Item lIIllllIllIIll = Inventory.getFirst((String[])stringArray3);
                        String[] stringArray4 = new String[llIIlllll[1]];
                        stringArray4[y.llIIlllll[0]] = llIIllllI[llIIlllll[29]];
                        Item lIIllllIllIIlI = Inventory.getFirst((String[])stringArray4);
                        if (y.lIlIllllIlll(lIIllllIllIlIl)) {
                            lIIllllIllIlIl.useOn((TileObject)lIIllllIllIllI);
                            Time.sleepTicks((int)llIIlllll[1]);

                        }
                        if (y.lIlIllllIlll(lIIllllIllIlII)) {
                            lIIllllIllIlII.useOn((TileObject)lIIllllIllIllI);
                            Time.sleepTicks((int)llIIlllll[1]);

                        }
                        if (y.lIlIllllIlll(lIIllllIllIIll)) {
                            lIIllllIllIIll.useOn((TileObject)lIIllllIllIllI);
                            Time.sleepTicks((int)llIIlllll[1]);

                        }
                        if (y.lIlIllllIlll(lIIllllIllIIlI)) {
                            lIIllllIllIIlI.useOn((TileObject)lIIllllIllIllI);
                            Time.sleepTicks((int)llIIlllll[1]);

                        }
                    }
                }
            }
            if (y.lIlIlllllIlI(e.j(llIIlllll[7]), llIIlllll[3]) && y.lIlIllllIIlI(y.bi() ? 1 : 0)) {
                if (y.lIlIlllllIII(Players.getLocal().getWorldLocation().distanceTo(dN), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[30]];
                    Movement.walkTo((WorldPoint)dN);

                    Time.sleepTicks((int)llIIlllll[1]);

                }
                if (y.lIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(dN), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[31]];
                    g.a(llIIllllI[llIIlllll[32]], cG);
                }
            }
            if (y.lIlIlllllIlI(e.j(llIIlllll[7]), llIIlllll[5])) {
                if (y.lIlIlllllIII(Players.getLocal().getWorldLocation().distanceTo(dM), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[33]];
                    Movement.walkTo((WorldPoint)dM);

                    Time.sleepTicks((int)llIIlllll[1]);

                }
                if (y.lIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(dM), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[34]];
                    if (y.lIlIllllIIll(dk, llIIlllll[1])) {
                        as.mS += llIIlllll[1];
                        as.u(AccBuilderGWD.m);
                        dk += llIIlllll[1];
                        as.mS = llIIlllll[0];
                    }
                    g.a(llIIllllI[llIIlllll[35]], cG);
                }
            }
            g.a(cG);
        }
    }

    static {
        y.lIlIllllIIII();
        y.lIlIlllIllll();
        dM = new WorldPoint(llIIlllll[54], llIIlllll[55], llIIlllll[0]);
        dN = new WorldPoint(llIIlllll[56], llIIlllll[57], llIIlllll[1]);
        dO = new WorldPoint(llIIlllll[58], llIIlllll[59], llIIlllll[0]);
        bx = new ArrayList<d>();
        cI = llIIlllll[0];
        String[] stringArray = new String[llIIlllll[9]];
        stringArray[y.llIIlllll[0]] = llIIllllI[llIIlllll[60]];
        stringArray[y.llIIlllll[1]] = llIIllllI[llIIlllll[61]];
        stringArray[y.llIIlllll[3]] = llIIllllI[llIIlllll[62]];
        stringArray[y.llIIlllll[5]] = llIIllllI[llIIlllll[63]];
        stringArray[y.llIIlllll[8]] = llIIllllI[llIIlllll[64]];
        cG = stringArray;
    }

    @Override
    public String ag() {
        return llIIllllI[llIIlllll[52]];
    }

    private static void lIlIlllIllll() {
        llIIllllI = new String[llIIlllll[49]];
        y.llIIllllI[y.llIIlllll[0]] = "Buying items";
        y.llIIllllI[y.llIIlllll[1]] = "Finished buying items, switching back to quest";
        y.llIIllllI[y.llIIlllll[3]] = "Drink";
        y.llIIllllI[y.llIIlllll[5]] = "Eat";
        y.llIIllllI[y.llIIlllll[8]] = "Nav to bank";
        y.llIIllllI[y.llIIlllll[9]] = "Handling banking";
        y.llIIllllI[y.llIIlllll[15]] = "We are missing quest supplies, switching to BUYING";
        y.llIIllllI[y.llIIlllll[18]] = "Nav to start";
        y.llIIllllI[y.llIIlllll[19]] = "Talk npc";
        y.llIIllllI[y.llIIlllll[20]] = "Kaqemeex";
        y.llIIllllI[y.llIIlllll[17]] = "Nav to sanfew";
        y.llIIllllI[y.llIIlllll[21]] = "Talk sanfew";
        y.llIIllllI[y.llIIlllll[22]] = "Sanfew";
        y.llIIllllI[y.llIIlllll[23]] = "Nav to couldren";
        y.llIIllllI[y.llIIlllll[24]] = "Enchanting";
        y.llIIllllI[y.llIIlllll[26]] = "Raw beef";
        y.llIIllllI[y.llIIlllll[27]] = "Raw rat meat";
        y.llIIllllI[y.llIIlllll[28]] = "Raw chicken";
        y.llIIllllI[y.llIIlllll[29]] = "Raw bear meat";
        y.llIIllllI[y.llIIlllll[30]] = "Nav to sanfew";
        y.llIIllllI[y.llIIlllll[31]] = "Talk sanfew";
        y.llIIllllI[y.llIIlllll[32]] = "Sanfew";
        y.llIIllllI[y.llIIlllll[33]] = "Nav to start";
        y.llIIllllI[y.llIIlllll[34]] = "Talk npc";
        y.llIIllllI[y.llIIlllll[35]] = "Kaqemeex";
        y.llIIllllI[y.llIIlllll[36]] = "Enchanted bear";
        y.llIIllllI[y.llIIlllll[37]] = "Enchanted chicken";
        y.llIIllllI[y.llIIlllll[38]] = "Enchanted rat";
        y.llIIllllI[y.llIIlllll[39]] = "Enchanted beef";
        y.llIIllllI[y.llIIlllll[40]] = "Raw chicken";
        y.llIIllllI[y.llIIlllll[41]] = "Raw beef";
        y.llIIllllI[y.llIIlllll[42]] = "Raw bear meat";
        y.llIIllllI[y.llIIlllll[43]] = "Raw rat meat";
        y.llIIllllI[y.llIIlllll[52]] = "Druidic ritual quest";
        y.llIIllllI[y.llIIlllll[53]] = "ring of wealth (";
        y.llIIllllI[y.llIIlllll[60]] = "I'm in search of a quest.";
        y.llIIllllI[y.llIIlllll[61]] = "Okay, I will try and help.";
        y.llIIllllI[y.llIIlllll[62]] = "Yes.";
        y.llIIllllI[y.llIIlllll[63]] = "I've been sent to help purify the Varrock stone circle.";
        y.llIIllllI[y.llIIlllll[64]] = "Ok, I'll do that then.";
    }

    private static boolean lIlIlllllIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIlllllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIllllIlII(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (y.lIlIlllllIll(e.j(llIIlllll[7]), llIIlllll[8])) {
            bl = llIIlllll[1];

            if (-1 >= 3) {
                return false;
            }
        } else {
            bl = llIIlllll[0];
        }
        return bl;
    }

    @Override
    public int af() {
        try {
            y.bh();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 >= (0x96 ^ 0x92)) {
            return 2 & ~2;
        }
        return llIIlllll[51];
    }

    private static void Q() {
        d lIIllllIlIlllI;
        Object lIIllllIlIllll;
        int[] nArray = new int[llIIlllll[1]];
        nArray[y.llIIlllll[0]] = llIIlllll[44];
        if (y.lIlIllllIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(llIIlllll[44], llIIlllll[9], j.ch);
            bx.add(d2);

        }
        int[] nArray2 = new int[llIIlllll[1]];
        nArray2[y.llIIlllll[0]] = llIIlllll[11];
        if (y.lIlIllllIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIIllllIlIllll = new DHelper(llIIlllll[11], llIIlllll[1], llIIlllll[45]);
            bx.add((DHelper) IIllllIlIllll);

        }
        int[] nArray3 = new int[llIIlllll[1]];
        nArray3[y.llIIlllll[0]] = llIIlllll[12];
        if (y.lIlIllllIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIIllllIlIllll = new DHelper(llIIlllll[12], llIIlllll[1], llIIlllll[45]);
            bx.add((DHelper) IIllllIlIllll);

        }
        int[] nArray4 = new int[llIIlllll[1]];
        nArray4[y.llIIlllll[0]] = llIIlllll[14];
        if (y.lIlIllllIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIIllllIlIllll = new DHelper(llIIlllll[14], llIIlllll[1], llIIlllll[45]);
            bx.add((DHelper) IIllllIlIllll);

        }
        int[] nArray5 = new int[llIIlllll[1]];
        nArray5[y.llIIlllll[0]] = llIIlllll[13];
        if (y.lIlIllllIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIIllllIlIllll = new DHelper(llIIlllll[13], llIIlllll[1], llIIlllll[45]);
            bx.add((DHelper) IIllllIlIllll);

        }
        int[] nArray6 = new int[llIIlllll[1]];
        nArray6[y.llIIlllll[0]] = llIIlllll[4];
        if (y.lIlIllllIlII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lIIllllIlIllll = new DHelper(llIIlllll[4], llIIlllll[17], llIIlllll[45]);
            bx.add((DHelper) IIllllIlIllll);

        }
        if (y.lIlIllllIlII(Bank.contains((Predicate)(lIIllllIlIllll = item -> item.getName().toLowerCase().contains(llIIllllI[llIIlllll[53]]))) ? 1 : 0)) {
            lIIllllIlIlllI = new DHelper(llIIlllll[46], llIIlllll[9], llIIlllll[47]);
            bx.add(lIIllllIlIlllI);

        }
        int[] nArray7 = new int[llIIlllll[1]];
        nArray7[y.llIIlllll[0]] = llIIlllll[48];
        if (y.lIlIllllIlII(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lIIllllIlIlllI = new DHelper(llIIlllll[48], llIIlllll[49], llIIlllll[50]);
            bx.add(lIIllllIlIlllI);

        }
    }

    private static boolean lIlIlllllIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIllllIIlI(int n2) {
        return n2 != 0;
    }
}

