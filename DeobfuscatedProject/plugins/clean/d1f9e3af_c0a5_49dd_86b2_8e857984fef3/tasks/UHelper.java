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
package gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.ANHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.EHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.FHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.GHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.IHelper;
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

public class UHelper
implements W {
    
    public static final  WorldPoint cJ;
    public static final  WorldPoint cK;
    static  int bT;
    public static final  WorldPoint cI;
    
    public static  List<d> bv;
    static  int cl;
    public static  boolean bt;
    
    static  boolean cm;

    @Override
    public int T() {
        try {
            u.aO();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0xCA ^ 0x9D) & ~(0x7F ^ 0x28)) > 2) {
            return (0x99 ^ 0x84) & ~(0x31 ^ 0x2C);
        }
        return lIlIllIlI[51];
    }

    private static boolean lIIlIIlIIIll(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        String[] stringArray = new String[lIlIllIlI[1]];
        stringArray[u.lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[40]];
        if (u.lIIlIIlIIlll(Inventory.getCount((String[])stringArray))) {
            String[] stringArray2 = new String[lIlIllIlI[1]];
            stringArray2[u.lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[41]];
            if (u.lIIlIIlIIlll(Inventory.getCount((String[])stringArray2))) {
                String[] stringArray3 = new String[lIlIllIlI[1]];
                stringArray3[u.lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[42]];
                if (u.lIIlIIlIIlll(Inventory.getCount((String[])stringArray3))) {
                    String[] stringArray4 = new String[lIlIllIlI[1]];
                    stringArray4[u.lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[43]];
                    if (u.lIIlIIlIIlll(Inventory.getCount((String[])stringArray4))) {
                        n2 = lIlIllIlI[1];

                        if (3 < (0x1B ^ 0x1F)) return n2 != 0;
                        return (3 & ~3) != 0;
                    }
                }
            }
        }
        n2 = lIlIllIlI[0];
        return n2 != 0;
    }

    public static void aO() {
        block40: {
            BankLocation lllIIIllIIlIII;
            block42: {
                block41: {
                    if (u.lIIlIIlIIIll(bt ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[0]];
                        b.a(bv);
                        if (u.lIIlIIlIIlII(bv.size(), lIlIllIlI[1])) {
                            System.out.println(lIlIllIIl[lIlIllIlI[1]]);
                            bt = lIlIllIlI[0];
                        }
                    }
                    if (!u.lIIlIIlIIlIl(bt ? 1 : 0)) break block40;
                    if (u.lIIlIIlIIIll(Inventory.contains((int[])f.aV) ? 1 : 0) && u.lIIlIIlIIlII(Movement.getRunEnergy(), lIlIllIlI[2])) {
                        Inventory.getFirst((int[])f.aV).interact(lIlIllIIl[lIlIllIlI[3]]);
                        Time.sleepTicks((int)lIlIllIlI[1]);

                    }
                    if (u.lIIlIIlIIllI(u.lIIlIIlIIIlI(e.UHelper(), 70.0))) {
                        int[] nArray = new int[lIlIllIlI[1]];
                        nArray[u.lIlIllIlI[0]] = lIlIllIlI[4];
                        if (u.lIIlIIlIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray2 = new int[lIlIllIlI[1]];
                            nArray2[u.lIlIllIlI[0]] = lIlIllIlI[4];
                            Inventory.getFirst((int[])nArray2).interact(lIlIllIIl[lIlIllIlI[5]]);
                        }
                    }
                    if (u.lIIlIIlIIlIl(Movement.isRunEnabled() ? 1 : 0) && u.lIIlIIlIIlll(Movement.getRunEnergy())) {
                        Movement.toggleRun();
                    }
                    if (!u.lIIlIIlIIIll(u.ab() ? 1 : 0)) break block41;
                    int[] nArray = new int[lIlIllIlI[1]];
                    nArray[u.lIlIllIlI[0]] = lIlIllIlI[6];
                    if (!u.lIIlIIlIIlll(Inventory.getCount((int[])nArray))) break block42;
                }
                if (u.lIIlIIlIIlII(e.j(lIlIllIlI[7]), lIlIllIlI[1])) {
                    lllIIIllIIlIII = BankLocation.getNearest();
                    if (u.lIIlIIlIlIII(lllIIIllIIlIII) && u.lIIlIIlIIlIl(lllIIIllIIlIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[8]];
                        a.a(lllIIIllIIlIII);
                        Time.sleepTicks((int)lIlIllIlI[3]);

                    }
                    if (u.lIIlIIlIlIII(lllIIIllIIlIII) && u.lIIlIIlIIIll(lllIIIllIIlIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[9]];
                        if (u.lIIlIIlIIlIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIllIlI[10]);

                        }
                        if (u.lIIlIIlIIIll(Bank.isOpen() ? 1 : 0)) {
                            if (u.lIIlIIlIIlll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIlIllIlI[8]);

                            }
                            if (u.lIIlIIlIIlll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIlIllIlI[3]);

                            }
                            int[] nArray = new int[lIlIllIlI[9]];
                            nArray[u.lIlIllIlI[0]] = lIlIllIlI[11];
                            nArray[u.lIlIllIlI[1]] = lIlIllIlI[12];
                            nArray[u.lIlIllIlI[3]] = lIlIllIlI[13];
                            nArray[u.lIlIllIlI[5]] = lIlIllIlI[14];
                            nArray[u.lIlIllIlI[8]] = lIlIllIlI[4];
                            if (u.lIIlIIlIIlIl(e.b(nArray) ? 1 : 0)) {
                                u.af();
                                System.out.println(lIlIllIIl[lIlIllIlI[15]]);
                                bt = lIlIllIlI[1];
                                return;
                            }
                            int[] nArray3 = new int[lIlIllIlI[9]];
                            nArray3[u.lIlIllIlI[0]] = lIlIllIlI[11];
                            nArray3[u.lIlIllIlI[1]] = lIlIllIlI[12];
                            nArray3[u.lIlIllIlI[3]] = lIlIllIlI[13];
                            nArray3[u.lIlIllIlI[5]] = lIlIllIlI[14];
                            nArray3[u.lIlIllIlI[8]] = lIlIllIlI[4];
                            if (u.lIIlIIlIIIll(e.b(nArray3) ? 1 : 0)) {
                                Bank.withdraw((int)lIlIllIlI[11], (int)lIlIllIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIlIllIlI[1]);

                                Bank.withdraw((int)lIlIllIlI[12], (int)lIlIllIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIlIllIlI[1]);

                                Bank.withdraw((int)lIlIllIlI[13], (int)lIlIllIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIlIllIlI[1]);

                                Bank.withdraw((int)lIlIllIlI[14], (int)lIlIllIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIlIllIlI[1]);

                                a.a(lIlIllIlI[16], lIlIllIlI[9]);
                                a.b(f.aV, lIlIllIlI[9]);
                                a.a(lIlIllIlI[4], lIlIllIlI[17]);
                                a.b(f.bf, lIlIllIlI[1]);
                            }
                        }
                    }
                }
            }
            if (u.lIIlIIlIIIll(u.ab() ? 1 : 0) && u.lIIlIIlIIlII(e.j(lIlIllIlI[7]), lIlIllIlI[1])) {
                if (u.lIIlIIlIlIIl(Players.getLocal().getWorldLocation().distanceTo(cI), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[18]];
                    if (u.lIIlIIlIIlII(bT, lIlIllIlI[1])) {
                        e.v();
                        bT += lIlIllIlI[1];
                    }
                    Movement.walkTo((WorldPoint)cI);

                    Time.sleepTicks((int)lIlIllIlI[1]);

                }
                if (u.lIIlIIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(cI), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[19]];
                    g.a(lIlIllIIl[lIlIllIlI[20]], bR);
                }
            }
            if (u.lIIlIIlIlIll(e.j(lIlIllIlI[7]), lIlIllIlI[1])) {
                cl = lIlIllIlI[0];
                if (u.lIIlIIlIlIIl(Players.getLocal().getWorldLocation().distanceTo(cJ), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[17]];
                    Movement.walkTo((WorldPoint)cJ);

                    Time.sleepTicks((int)lIlIllIlI[1]);

                }
                if (u.lIIlIIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(cJ), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[21]];
                    g.a(lIlIllIIl[lIlIllIlI[22]], bR);
                }
            }
            if (u.lIIlIIlIlIll(e.j(lIlIllIlI[7]), lIlIllIlI[3]) && u.lIIlIIlIIlIl(u.aP() ? 1 : 0)) {
                if (u.lIIlIIlIlIIl(Players.getLocal().getWorldLocation().distanceTo(cK), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[23]];
                    Movement.walkTo((WorldPoint)cK);

                    Time.sleepTicks((int)lIlIllIlI[1]);

                }
                if (u.lIIlIIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(cK), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[24]];
                    int[] nArray = new int[lIlIllIlI[1]];
                    nArray[u.lIlIllIlI[0]] = lIlIllIlI[25];
                    lllIIIllIIlIII = TileObjects.getNearest((int[])nArray);
                    if (u.lIIlIIlIlIII(lllIIIllIIlIII)) {
                        String[] stringArray = new String[lIlIllIlI[1]];
                        stringArray[u.lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[26]];
                        Item lllIIIllIIIlll = Inventory.getFirst((String[])stringArray);
                        String[] stringArray2 = new String[lIlIllIlI[1]];
                        stringArray2[u.lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[27]];
                        Item lllIIIllIIIllI = Inventory.getFirst((String[])stringArray2);
                        String[] stringArray3 = new String[lIlIllIlI[1]];
                        stringArray3[u.lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[28]];
                        Item lllIIIllIIIlIl = Inventory.getFirst((String[])stringArray3);
                        String[] stringArray4 = new String[lIlIllIlI[1]];
                        stringArray4[u.lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[29]];
                        Item lllIIIllIIIlII = Inventory.getFirst((String[])stringArray4);
                        if (u.lIIlIIlIlIII(lllIIIllIIIlll)) {
                            lllIIIllIIIlll.useOn((TileObject)lllIIIllIIlIII);
                            Time.sleepTicks((int)lIlIllIlI[1]);

                        }
                        if (u.lIIlIIlIlIII(lllIIIllIIIllI)) {
                            lllIIIllIIIllI.useOn((TileObject)lllIIIllIIlIII);
                            Time.sleepTicks((int)lIlIllIlI[1]);

                        }
                        if (u.lIIlIIlIlIII(lllIIIllIIIlIl)) {
                            lllIIIllIIIlIl.useOn((TileObject)lllIIIllIIlIII);
                            Time.sleepTicks((int)lIlIllIlI[1]);

                        }
                        if (u.lIIlIIlIlIII(lllIIIllIIIlII)) {
                            lllIIIllIIIlII.useOn((TileObject)lllIIIllIIlIII);
                            Time.sleepTicks((int)lIlIllIlI[1]);

                        }
                    }
                }
            }
            if (u.lIIlIIlIlIll(e.j(lIlIllIlI[7]), lIlIllIlI[3]) && u.lIIlIIlIIIll(u.aP() ? 1 : 0)) {
                if (u.lIIlIIlIlIIl(Players.getLocal().getWorldLocation().distanceTo(cJ), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[30]];
                    Movement.walkTo((WorldPoint)cJ);

                    Time.sleepTicks((int)lIlIllIlI[1]);

                }
                if (u.lIIlIIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(cJ), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[31]];
                    g.a(lIlIllIIl[lIlIllIlI[32]], bR);
                }
            }
            if (u.lIIlIIlIlIll(e.j(lIlIllIlI[7]), lIlIllIlI[5])) {
                if (u.lIIlIIlIlIIl(Players.getLocal().getWorldLocation().distanceTo(cI), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[33]];
                    Movement.walkTo((WorldPoint)cI);

                    Time.sleepTicks((int)lIlIllIlI[1]);

                }
                if (u.lIIlIIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(cI), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[34]];
                    if (u.lIIlIIlIIlII(cl, lIlIllIlI[1])) {
                        an.mI += lIlIllIlI[1];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIlIllIlI[1];
                        an.mI = lIlIllIlI[0];
                    }
                    g.a(lIlIllIIl[lIlIllIlI[35]], bR);
                }
            }
            g.a(bR);
        }
    }

        return String.valueOf(lllIIIlIllIIIl);
    }

    private static int lIIlIIlIIIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aP() {
        int n2;
        String[] stringArray = new String[lIlIllIlI[1]];
        stringArray[u.lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[36]];
        if (u.lIIlIIlIIlll(Inventory.getCount((String[])stringArray))) {
            String[] stringArray2 = new String[lIlIllIlI[1]];
            stringArray2[u.lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[37]];
            if (u.lIIlIIlIIlll(Inventory.getCount((String[])stringArray2))) {
                String[] stringArray3 = new String[lIlIllIlI[1]];
                stringArray3[u.lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[38]];
                if (u.lIIlIIlIIlll(Inventory.getCount((String[])stringArray3))) {
                    String[] stringArray4 = new String[lIlIllIlI[1]];
                    stringArray4[u.lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[39]];
                    if (u.lIIlIIlIIlll(Inventory.getCount((String[])stringArray4))) {
                        n2 = lIlIllIlI[1];

                        if ((0x7F ^ 0x7B) != 0) return n2 != 0;
                        return false;
                    }
                }
            }
        }
        n2 = lIlIllIlI[0];
        return n2 != 0;
    }

    @Override
    public String U() {
        return lIlIllIIl[lIlIllIlI[52]];
    }

    private static boolean lIIlIIlIIlIl(int n2) {
        return n2 == 0;
    }

    private static void lIIlIIlIIIII() {
        lIlIllIIl = new String[lIlIllIlI[49]];
        u.lIlIllIIl[u.lIlIllIlI[0]] = "Buying items";
        u.lIlIllIIl[u.lIlIllIlI[1]] = "Finished buying items, switching back to quest";
        u.lIlIllIIl[u.lIlIllIlI[3]] = "Drink";
        u.lIlIllIIl[u.lIlIllIlI[5]] = "Eat";
        u.lIlIllIIl[u.lIlIllIlI[8]] = "Nav to bank";
        u.lIlIllIIl[u.lIlIllIlI[9]] = "Handling banking";
        u.lIlIllIIl[u.lIlIllIlI[15]] = "We are missing quest supplies, switching to BUYING";
        u.lIlIllIIl[u.lIlIllIlI[18]] = "Nav to start";
        u.lIlIllIIl[u.lIlIllIlI[19]] = "Talk npc";
        u.lIlIllIIl[u.lIlIllIlI[20]] = "Kaqemeex";
        u.lIlIllIIl[u.lIlIllIlI[17]] = "Nav to sanfew";
        u.lIlIllIIl[u.lIlIllIlI[21]] = "Talk sanfew";
        u.lIlIllIIl[u.lIlIllIlI[22]] = "Sanfew";
        u.lIlIllIIl[u.lIlIllIlI[23]] = "Nav to couldren";
        u.lIlIllIIl[u.lIlIllIlI[24]] = "Enchanting";
        u.lIlIllIIl[u.lIlIllIlI[26]] = "Raw beef";
        u.lIlIllIIl[u.lIlIllIlI[27]] = "Raw rat meat";
        u.lIlIllIIl[u.lIlIllIlI[28]] = "Raw chicken";
        u.lIlIllIIl[u.lIlIllIlI[29]] = "Raw bear meat";
        u.lIlIllIIl[u.lIlIllIlI[30]] = "Nav to sanfew";
        u.lIlIllIIl[u.lIlIllIlI[31]] = "Talk sanfew";
        u.lIlIllIIl[u.lIlIllIlI[32]] = "Sanfew";
        u.lIlIllIIl[u.lIlIllIlI[33]] = "Nav to start";
        u.lIlIllIIl[u.lIlIllIlI[34]] = "Talk npc";
        u.lIlIllIIl[u.lIlIllIlI[35]] = "Kaqemeex";
        u.lIlIllIIl[u.lIlIllIlI[36]] = "Enchanted bear";
        u.lIlIllIIl[u.lIlIllIlI[37]] = "Enchanted chicken";
        u.lIlIllIIl[u.lIlIllIlI[38]] = "Enchanted rat";
        u.lIlIllIIl[u.lIlIllIlI[39]] = "Enchanted beef";
        u.lIlIllIIl[u.lIlIllIlI[40]] = "Raw chicken";
        u.lIlIllIIl[u.lIlIllIlI[41]] = "Raw beef";
        u.lIlIllIIl[u.lIlIllIlI[42]] = "Raw bear meat";
        u.lIlIllIIl[u.lIlIllIlI[43]] = "Raw rat meat";
        u.lIlIllIIl[u.lIlIllIlI[52]] = "Druidic ritual quest";
        u.lIlIllIIl[u.lIlIllIlI[53]] = "ring of wealth (";
        u.lIlIllIIl[u.lIlIllIlI[60]] = "I'm in search of a quest.";
        u.lIlIllIIl[u.lIlIllIlI[61]] = "Okay, I will try and help.";
        u.lIlIllIIl[u.lIlIllIlI[62]] = "Yes.";
        u.lIlIllIIl[u.lIlIllIlI[63]] = "I've been sent to help purify the Varrock stone circle.";
        u.lIlIllIIl[u.lIlIllIlI[64]] = "Ok, I'll do that then.";
    }

    private static boolean lIIlIIlIlIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIIlIIlll(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIIlIIllI(int n2) {
        return n2 < 0;
    }

    private static void af() {
        d lllIIIllIIIIII;
        Object lllIIIllIIIIIl;
        int[] nArray = new int[lIlIllIlI[1]];
        nArray[u.lIlIllIlI[0]] = lIlIllIlI[44];
        if (u.lIIlIIlIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lIlIllIlI[44], lIlIllIlI[9], i.bq);
            bv.add(d2);

        }
        int[] nArray2 = new int[lIlIllIlI[1]];
        nArray2[u.lIlIllIlI[0]] = lIlIllIlI[11];
        if (u.lIIlIIlIIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllIIIllIIIIIl = new DHelper(lIlIllIlI[11], lIlIllIlI[1], lIlIllIlI[45]);
            bv.add((DHelper) llIIIllIIIIIl);

        }
        int[] nArray3 = new int[lIlIllIlI[1]];
        nArray3[u.lIlIllIlI[0]] = lIlIllIlI[12];
        if (u.lIIlIIlIIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllIIIllIIIIIl = new DHelper(lIlIllIlI[12], lIlIllIlI[1], lIlIllIlI[45]);
            bv.add((DHelper) llIIIllIIIIIl);

        }
        int[] nArray4 = new int[lIlIllIlI[1]];
        nArray4[u.lIlIllIlI[0]] = lIlIllIlI[14];
        if (u.lIIlIIlIIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lllIIIllIIIIIl = new DHelper(lIlIllIlI[14], lIlIllIlI[1], lIlIllIlI[45]);
            bv.add((DHelper) llIIIllIIIIIl);

        }
        int[] nArray5 = new int[lIlIllIlI[1]];
        nArray5[u.lIlIllIlI[0]] = lIlIllIlI[13];
        if (u.lIIlIIlIIlIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lllIIIllIIIIIl = new DHelper(lIlIllIlI[13], lIlIllIlI[1], lIlIllIlI[45]);
            bv.add((DHelper) llIIIllIIIIIl);

        }
        int[] nArray6 = new int[lIlIllIlI[1]];
        nArray6[u.lIlIllIlI[0]] = lIlIllIlI[4];
        if (u.lIIlIIlIIlIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lllIIIllIIIIIl = new DHelper(lIlIllIlI[4], lIlIllIlI[17], lIlIllIlI[45]);
            bv.add((DHelper) llIIIllIIIIIl);

        }
        if (u.lIIlIIlIIlIl(Bank.contains((Predicate)(lllIIIllIIIIIl = item -> item.getName().toLowerCase().contains(lIlIllIIl[lIlIllIlI[53]]))) ? 1 : 0)) {
            lllIIIllIIIIII = new DHelper(lIlIllIlI[46], lIlIllIlI[9], lIlIllIlI[47]);
            bv.add(lllIIIllIIIIII);

        }
        int[] nArray7 = new int[lIlIllIlI[1]];
        nArray7[u.lIlIllIlI[0]] = lIlIllIlI[48];
        if (u.lIIlIIlIIlIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lllIIIllIIIIII = new DHelper(lIlIllIlI[48], lIlIllIlI[49], lIlIllIlI[50]);
            bv.add(lllIIIllIIIIII);

        }
    }

    private static boolean lIIlIIlIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIlIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIlIIlIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIIlIllll(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean S() {
        return lIlIllIlI[0];
    }

    @Override
    public boolean V() {
        boolean bl;
        if (u.lIIlIIlIllll(e.j(lIlIllIlI[7]), lIlIllIlI[8])) {
            bl = lIlIllIlI[1];

            if (1 >= 3) {
                return ((0x3F ^ 0x48 ^ (0x4E ^ 0x73)) & (0x60 ^ 0x4B ^ (0x57 ^ 0x36) ^ -1)) != 0;
            }
        } else {
            bl = lIlIllIlI[0];
        }
        return bl;
    }

    private static boolean lIIlIIlIlIII(Object object) {
        return object != null;
    }

    static {
        u.lIIlIIlIIIIl();
        u.lIIlIIlIIIII();
        cI = new WorldPoint(lIlIllIlI[54], lIlIllIlI[55], lIlIllIlI[0]);
        cJ = new WorldPoint(lIlIllIlI[56], lIlIllIlI[57], lIlIllIlI[1]);
        cK = new WorldPoint(lIlIllIlI[58], lIlIllIlI[59], lIlIllIlI[0]);
        bv = new ArrayList<d>();
        bT = lIlIllIlI[0];
        String[] stringArray = new String[lIlIllIlI[9]];
        stringArray[u.lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[60]];
        stringArray[u.lIlIllIlI[1]] = lIlIllIIl[lIlIllIlI[61]];
        stringArray[u.lIlIllIlI[3]] = lIlIllIIl[lIlIllIlI[62]];
        stringArray[u.lIlIllIlI[5]] = lIlIllIIl[lIlIllIlI[63]];
        stringArray[u.lIlIllIlI[8]] = lIlIllIIl[lIlIllIlI[64]];
        bR = stringArray;
    }

}

