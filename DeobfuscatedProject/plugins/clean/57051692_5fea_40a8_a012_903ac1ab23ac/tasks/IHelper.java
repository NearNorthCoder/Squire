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
package gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.ZHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.AHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.BHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.DHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.EHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.FHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.GHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.JHelper;
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

public class IHelper
implements K {
    static  int dc;
    private static final  WorldPoint jg;
    private static final  WorldPoint ji;
    static  boolean dd;
    
    public static final  String[] jf;
    
    static  int cA;
    private static final  WorldPoint jj;
    public static  boolean bn;
    private static final  WorldPoint jh;
    public static  List<d> bp;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean al() {
        int n2;
        int[] nArray = new int[lIllIlIIIl[1]];
        nArray[I.lIllIlIIIl[0]] = lIllIlIIIl[11];
        if (I.lIIllIIIlIlll(Inventory.contains((int[])nArray) ? 1 : 0) && (!I.lIIllIIIllIIl(Inventory.contains((int[])f.aQ) ? 1 : 0) || I.lIIllIIIlIlll(Equipment.contains((int[])f.aQ) ? 1 : 0)) && I.lIIllIIIlIlll(Inventory.contains((int[])f.aU) ? 1 : 0)) {
            int[] nArray2 = new int[lIllIlIIIl[1]];
            nArray2[I.lIllIlIIIl[0]] = lIllIlIIIl[13];
            if (I.lIIllIIIlIlll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lIllIlIIIl[1]];
                nArray3[I.lIllIlIIIl[0]] = lIllIlIIIl[4];
                if (I.lIIllIIIlIlll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n2 = lIllIlIIIl[1];

                    if ((0xAD ^ 0xA9) >= 3) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = lIllIlIIIl[0];
        return n2 != 0;
    }

    private static boolean lIIllIIIllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllIIIlllII(Object object) {
        return object != null;
    }

    @Override
    public boolean ac() {
        return lIllIlIIIl[0];
    }

    private static void O() {
        d var1;
        Object var2;
        int[] nArray = new int[lIllIlIIIl[1]];
        nArray[I.lIllIlIIIl[0]] = lIllIlIIIl[10];
        if (I.lIIllIIIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lIllIlIIIl[10], lIllIlIIIl[1], lIllIlIIIl[46]);
            bp.add(d2);

        }
        int[] nArray2 = new int[lIllIlIIIl[1]];
        nArray2[I.lIllIlIIIl[0]] = lIllIlIIIl[4];
        if (I.lIIllIIIllIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var2 = new DHelper(lIllIlIIIl[4], lIllIlIIIl[15], lIllIlIIIl[47]);
            bp.add((DHelper) ar2);

        }
        if (I.lIIllIIIllIIl(Bank.contains(var2 = item -> item.getName().toLowerCase().contains(lIllIIlllI[lIllIlIIIl[53]])) ? 1 : 0)) {
            var1 = new DHelper(lIllIlIIIl[48], lIllIlIIIl[8], lIllIlIIIl[49]);
            bp.add(var1);

        }
        int[] nArray3 = new int[lIllIlIIIl[1]];
        nArray3[I.lIllIlIIIl[0]] = lIllIlIIIl[11];
        if (I.lIIllIIIllIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var1 = new DHelper(lIllIlIIIl[11], lIllIlIIIl[15], lIllIlIIIl[50]);
            bp.add(var1);

        }
        int[] nArray4 = new int[lIllIlIIIl[1]];
        nArray4[I.lIllIlIIIl[0]] = lIllIlIIIl[13];
        if (I.lIIllIIIllIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var1 = new DHelper(lIllIlIIIl[13], lIllIlIIIl[31], lIllIlIIIl[50]);
            bp.add(var1);

        }
        int[] nArray5 = new int[lIllIlIIIl[1]];
        nArray5[I.lIllIlIIIl[0]] = lIllIlIIIl[12];
        if (I.lIIllIIIllIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var1 = new DHelper(lIllIlIIIl[12], lIllIlIIIl[8], j.bZ);
            bp.add(var1);

        }
    }

    public static void cJ() {
        if (I.lIIllIIIlIlll(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[0]];
            b.a(bp);
            if (I.lIIllIIIllIII(bp.size(), lIllIlIIIl[1])) {
                System.out.println(lIllIIlllI[lIllIlIIIl[1]]);
                bn = lIllIlIIIl[0];
            }
        }
        if (I.lIIllIIIllIIl(bn ? 1 : 0)) {
            NPC var3;
            BankLocation var4;
            if (I.lIIllIIIlIlll(Inventory.contains((int[])f.aU) ? 1 : 0) && I.lIIllIIIllIII(Movement.getRunEnergy(), lIllIlIIIl[2])) {
                Inventory.getFirst((int[])f.aU).interact(lIllIIlllI[lIllIlIIIl[3]]);
                Time.sleepTicks((int)lIllIlIIIl[1]);

            }
            if (I.lIIllIIIllIlI(I.lIIllIIIlIllI(e.u(), 70.0))) {
                int[] nArray = new int[lIllIlIIIl[1]];
                nArray[I.lIllIlIIIl[0]] = lIllIlIIIl[4];
                if (I.lIIllIIIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIllIlIIIl[1]];
                    nArray2[I.lIllIlIIIl[0]] = lIllIlIIIl[4];
                    Inventory.getFirst((int[])nArray2).interact(lIllIIlllI[lIllIlIIIl[5]]);
                }
            }
            if (I.lIIllIIIllIIl(Movement.isRunEnabled() ? 1 : 0) && I.lIIllIIIllIll(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (I.lIIllIIIllIIl(I.al() ? 1 : 0) && I.lIIllIIIllIII(e.j(lIllIlIIIl[6]), lIllIlIIIl[1])) {
                var4 = BankLocation.getNearest();
                if (I.lIIllIIIlllII(var4) && I.lIIllIIIllIIl(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[7]];
                    a.a(var4);
                    Time.sleepTicks((int)lIllIlIIIl[3]);

                }
                if (I.lIIllIIIlllII(var4) && I.lIIllIIIlIlll(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[8]];
                    if (I.lIIllIIIllIIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIlIIIl[9]);

                    }
                    if (I.lIIllIIIlIlll(Bank.isOpen() ? 1 : 0)) {
                        if (I.lIIllIIIllIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIllIlIIIl[7]);

                        }
                        if (I.lIIllIIIllIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIllIlIIIl[3]);

                        }
                        int[] nArray = new int[lIllIlIIIl[8]];
                        nArray[I.lIllIlIIIl[0]] = lIllIlIIIl[10];
                        nArray[I.lIllIlIIIl[1]] = lIllIlIIIl[11];
                        nArray[I.lIllIlIIIl[3]] = lIllIlIIIl[12];
                        nArray[I.lIllIlIIIl[5]] = lIllIlIIIl[13];
                        nArray[I.lIllIlIIIl[7]] = lIllIlIIIl[4];
                        if (I.lIIllIIIllIIl(e.b(nArray) ? 1 : 0)) {
                            I.O();
                            System.out.println(lIllIIlllI[lIllIlIIIl[14]]);
                            bn = lIllIlIIIl[1];
                            return;
                        }
                        Bank.withdraw((int)lIllIlIIIl[11], (int)lIllIlIIIl[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIllIlIIIl[1]);

                        Bank.withdraw((int)lIllIlIIIl[13], (int)lIllIlIIIl[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIllIlIIIl[1]);

                        Bank.withdraw((int)lIllIlIIIl[10], (int)lIllIlIIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIllIlIIIl[1]);

                        a.b(f.aU, lIllIlIIIl[1]);
                        a.a(lIllIlIIIl[4], lIllIlIIIl[15]);
                        a.b(f.be, lIllIlIIIl[1]);
                    }
                }
            }
            if (I.lIIllIIIlIlll(I.al() ? 1 : 0) && I.lIIllIIIllIII(e.j(lIllIlIIIl[6]), lIllIlIIIl[1])) {
                var4 = new WorldArea(lIllIlIIIl[16], lIllIlIIIl[17], lIllIlIIIl[18], lIllIlIIIl[19], lIllIlIIIl[0]);
                String[] stringArray = new String[lIllIlIIIl[1]];
                stringArray[I.lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[20]];
                var3 = NPCs.getNearest((String[])stringArray);
                if (I.lIIllIIIlllIl(var3) && I.lIIllIIIllllI(Players.getLocal().getWorldLocation().distanceTo(jg), lIllIlIIIl[5]) && I.lIIllIIIllIIl(AccBuilderShamans.d ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[18]];
                    if (I.lIIllIIIllIII(cA, lIllIlIIIl[1])) {
                        e.v();
                        cA += lIllIlIIIl[1];
                    }
                    Movement.walkTo((WorldPoint)jg);

                    Time.sleepTicks((int)lIllIlIIIl[1]);

                }
                if (I.lIIllIIIlllII(var3)) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[21]];
                    g.a(lIllIIlllI[lIllIlIIIl[15]], jf, lIllIlIIIl[1]);
                }
            }
            if (I.lIIllIIIlllll(e.j(lIllIlIIIl[6]), lIllIlIIIl[1])) {
                if (I.lIIllIIIllllI(Players.getLocal().getWorldLocation().distanceTo(jh), lIllIlIIIl[14])) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[19]];
                    Movement.walkTo((WorldPoint)jh);

                    Time.sleepTicks((int)lIllIlIIIl[1]);

                }
                if (I.lIIllIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(jh), lIllIlIIIl[14])) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[22]];
                    String[] stringArray = new String[lIllIlIIIl[1]];
                    stringArray[I.lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[23]];
                    var4 = TileObjects.getNearest((String[])stringArray);
                    if (I.lIIllIIIlllII(var4)) {
                        String[] stringArray2 = new String[lIllIlIIIl[1]];
                        stringArray2[I.lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[24]];
                        if (I.lIIllIIIlIlll(var4.hasAction(stringArray2) ? 1 : 0)) {
                            var4.interact(lIllIIlllI[lIllIlIIIl[25]]);
                            Time.sleepTicks((int)lIllIlIIIl[8]);

                        }
                    }
                    g.a(lIllIIlllI[lIllIlIIIl[26]], jf);
                }
            }
            if (I.lIIllIIIlllll(e.j(lIllIlIIIl[6]), lIllIlIIIl[3])) {
                if (I.lIIllIIIllllI(Players.getLocal().getWorldLocation().distanceTo(ji), lIllIlIIIl[3])) {
                    int[] nArray = new int[lIllIlIIIl[1]];
                    nArray[I.lIllIlIIIl[0]] = lIllIlIIIl[27];
                    if (I.lIIllIIIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray3 = new int[lIllIlIIIl[1]];
                        nArray3[I.lIllIlIIIl[0]] = lIllIlIIIl[27];
                        Inventory.getFirst((int[])nArray3).interact(lIllIIlllI[lIllIlIIIl[28]]);
                        Time.sleepTicks((int)lIllIlIIIl[1]);

                    }
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[29]];
                    Movement.walkTo((WorldPoint)ji);

                    Time.sleepTicks((int)lIllIlIIIl[1]);

                }
                if (I.lIIllIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(ji), lIllIlIIIl[3])) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[30]];
                    String[] stringArray = new String[lIllIlIIIl[1]];
                    stringArray[I.lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[31]];
                    var4 = NPCs.getNearest((String[])stringArray);
                    if (I.lIIllIIIlllII(var4)) {
                        g.a(lIllIIlllI[lIllIlIIIl[32]], jf);
                    }
                    if (I.lIIllIIIlllIl(var4)) {
                        String[] stringArray3 = new String[lIllIlIIIl[1]];
                        stringArray3[I.lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[33]];
                        TileObjects.getNearest((String[])stringArray3).interact(lIllIIlllI[lIllIlIIIl[34]]);
                        Time.sleepTicks((int)lIllIlIIIl[3]);

                    }
                }
            }
            if (I.lIIllIIIlllll(e.j(lIllIlIIIl[6]), lIllIlIIIl[5])) {
                dc = lIllIlIIIl[0];
                if (I.lIIllIIIllllI(Players.getLocal().getWorldLocation().distanceTo(jj), lIllIlIIIl[5])) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[35]];
                    Movement.walkTo((WorldPoint)jj);

                    Time.sleepTicks((int)lIllIlIIIl[1]);

                }
                if (I.lIIllIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(jj), lIllIlIIIl[5])) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[36]];
                    String[] stringArray = new String[lIllIlIIIl[1]];
                    stringArray[I.lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[37]];
                    var4 = TileObjects.getNearest((String[])stringArray);
                    if (I.lIIllIIIlllII(var4)) {
                        var4.interact(lIllIIlllI[lIllIlIIIl[38]]);
                    }
                }
            }
            if (I.lIIllIIIlllll(e.j(lIllIlIIIl[6]), lIllIlIIIl[7])) {
                if (I.lIIllIIIllllI(Players.getLocal().getWorldLocation().distanceTo(ji), lIllIlIIIl[3])) {
                    int[] nArray = new int[lIllIlIIIl[1]];
                    nArray[I.lIllIlIIIl[0]] = lIllIlIIIl[27];
                    if (I.lIIllIIIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray4 = new int[lIllIlIIIl[1]];
                        nArray4[I.lIllIlIIIl[0]] = lIllIlIIIl[27];
                        Inventory.getFirst((int[])nArray4).interact(lIllIIlllI[lIllIlIIIl[39]]);
                        Time.sleepTicks((int)lIllIlIIIl[1]);

                    }
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[40]];
                    Movement.walkTo((WorldPoint)ji);

                    Time.sleepTicks((int)lIllIlIIIl[1]);

                }
                if (I.lIIllIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(ji), lIllIlIIIl[3])) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[41]];
                    String[] stringArray = new String[lIllIlIIIl[1]];
                    stringArray[I.lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[42]];
                    var4 = TileObjects.getNearest((String[])stringArray);
                    if (I.lIIllIIIlllII(var4)) {
                        String[] stringArray4 = new String[lIllIlIIIl[1]];
                        stringArray4[I.lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[43]];
                        if (I.lIIllIIIlIlll(var4.hasAction(stringArray4) ? 1 : 0)) {
                            var4.interact(lIllIIlllI[lIllIlIIIl[44]]);
                            Time.sleepTicks((int)lIllIlIIIl[3]);

                        }
                        String[] stringArray5 = new String[lIllIlIIIl[1]];
                        stringArray5[I.lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[45]];
                        var3 = Inventory.getFirst((String[])stringArray5);
                        if (I.lIIllIIIlllII(var3)) {
                            if (I.lIIllIIIllIII(dc, lIllIlIIIl[1])) {
                                Z.ob += lIllIlIIIl[1];
                                Z.p(AccBuilderShamans.m);
                                dc += lIllIlIIIl[1];
                                Z.ob = lIllIlIIIl[0];
                                dd = lIllIlIIIl[0];
                            }
                            var3.useOn((TileObject)var4);
                            Time.sleepTicks((int)lIllIlIIIl[5]);

                        }
                    }
                }
                g.a(jf);
            }
            g.a(new String[lIllIlIIIl[0]]);
        }
    }

    private static boolean lIIllIIIllIll(int n2) {
        return n2 > 0;
    }

    private static int lIIllIIIlIllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIIllIIIllIlI(int n2) {
        return n2 < 0;
    }

    static {
        I.lIIllIIIlIlIl();
        I.lIIllIIIlIlII();
        String[] stringArray = new String[lIllIlIIIl[23]];
        stringArray[I.lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[54]];
        stringArray[I.lIllIlIIIl[1]] = lIllIIlllI[lIllIlIIIl[55]];
        stringArray[I.lIllIlIIIl[3]] = lIllIIlllI[lIllIlIIIl[56]];
        stringArray[I.lIllIlIIIl[5]] = lIllIIlllI[lIllIlIIIl[57]];
        stringArray[I.lIllIlIIIl[7]] = lIllIIlllI[lIllIlIIIl[58]];
        stringArray[I.lIllIlIIIl[8]] = lIllIIlllI[lIllIlIIIl[59]];
        stringArray[I.lIllIlIIIl[14]] = lIllIIlllI[lIllIlIIIl[60]];
        stringArray[I.lIllIlIIIl[20]] = lIllIIlllI[lIllIlIIIl[61]];
        stringArray[I.lIllIlIIIl[18]] = lIllIIlllI[lIllIlIIIl[62]];
        stringArray[I.lIllIlIIIl[21]] = lIllIIlllI[lIllIlIIIl[63]];
        stringArray[I.lIllIlIIIl[15]] = lIllIIlllI[lIllIlIIIl[64]];
        stringArray[I.lIllIlIIIl[19]] = lIllIIlllI[lIllIlIIIl[65]];
        stringArray[I.lIllIlIIIl[22]] = lIllIIlllI[lIllIlIIIl[66]];
        jf = stringArray;
        jg = new WorldPoint(lIllIlIIIl[16], lIllIlIIIl[67], lIllIlIIIl[0]);
        jh = new WorldPoint(lIllIlIIIl[68], lIllIlIIIl[69], lIllIlIIIl[0]);
        ji = new WorldPoint(lIllIlIIIl[70], lIllIlIIIl[71], lIllIlIIIl[0]);
        jj = new WorldPoint(lIllIlIIIl[72], lIllIlIIIl[73], lIllIlIIIl[0]);
        bp = new ArrayList<d>();
        cA = lIllIlIIIl[0];
    }

    private static boolean lIIllIIIlllll(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean af() {
        boolean bl;
        if (I.lIIllIIlIIIIl(e.j(lIllIlIIIl[6]), lIllIlIIIl[8])) {
            bl = lIllIlIIIl[1];

            }
        } else {
            bl = lIllIlIIIl[0];
        }
        return bl;
    }

    @Override
    public int ad() {
        try {
            I.cJ();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 != 1) {
            return (0x19 ^ 4) & ~(0xA6 ^ 0xBB);
        }
        return lIllIlIIIl[51];
    }

        return String.valueOf(var5);
    }

    private static boolean lIIllIIIllIIl(int n2) {
        return n2 == 0;
    }

    @Override
    public String ae() {
        return lIllIIlllI[lIllIlIIIl[52]];
    }

    private static boolean lIIllIIIllllI(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIIllIIIlIlII() {
        lIllIIlllI = new String[lIllIlIIIl[74]];
        I.lIllIIlllI[I.lIllIlIIIl[0]] = "Buying items";
        I.lIllIIlllI[I.lIllIlIIIl[1]] = "Finished buying items, switching back to quest";
        I.lIllIIlllI[I.lIllIlIIIl[3]] = "Drink";
        I.lIllIIlllI[I.lIllIlIIIl[5]] = "Eat";
        I.lIllIIlllI[I.lIllIlIIIl[7]] = "Nav to bank";
        I.lIllIIlllI[I.lIllIlIIIl[8]] = "Handling banking";
        I.lIllIIlllI[I.lIllIlIIIl[14]] = "We are missing quest supplies, switching to BUYING";
        I.lIllIIlllI[I.lIllIlIIIl[20]] = "Father Aereck";
        I.lIllIIlllI[I.lIllIlIIIl[18]] = "Nav to start";
        I.lIllIIlllI[I.lIllIlIIIl[21]] = "Starting quest";
        I.lIllIIlllI[I.lIllIlIIIl[15]] = "Father Aereck";
        I.lIllIIlllI[I.lIllIlIIIl[19]] = "Nav to necklace guy";
        I.lIllIIlllI[I.lIllIlIIIl[22]] = "Interacting npc";
        I.lIllIIlllI[I.lIllIlIIIl[23]] = "Door";
        I.lIllIIlllI[I.lIllIlIIIl[24]] = "Open";
        I.lIllIIlllI[I.lIllIlIIIl[25]] = "Open";
        I.lIllIIlllI[I.lIllIlIIIl[26]] = "Father Urhney";
        I.lIllIIlllI[I.lIllIlIIIl[28]] = "Wear";
        I.lIllIIlllI[I.lIllIlIIIl[29]] = "Nav to coffin";
        I.lIllIIlllI[I.lIllIlIIIl[30]] = "Handling coffin";
        I.lIllIIlllI[I.lIllIlIIIl[31]] = "Restless ghost";
        I.lIllIIlllI[I.lIllIlIIIl[32]] = "Restless ghost";
        I.lIllIIlllI[I.lIllIlIIIl[33]] = "Coffin";
        I.lIllIIlllI[I.lIllIlIIIl[34]] = "Open";
        I.lIllIIlllI[I.lIllIlIIIl[35]] = "Nav to skull";
        I.lIllIIlllI[I.lIllIlIIIl[36]] = "Getting skull";
        I.lIllIIlllI[I.lIllIlIIIl[37]] = "Altar";
        I.lIllIIlllI[I.lIllIlIIIl[38]] = "Search";
        I.lIllIIlllI[I.lIllIlIIIl[39]] = "Wear";
        I.lIllIIlllI[I.lIllIlIIIl[40]] = "Nav to coffin";
        I.lIllIIlllI[I.lIllIlIIIl[41]] = "Handling coffin";
        I.lIllIIlllI[I.lIllIlIIIl[42]] = "Coffin";
        I.lIllIIlllI[I.lIllIlIIIl[43]] = "Open";
        I.lIllIIlllI[I.lIllIlIIIl[44]] = "Open";
        I.lIllIIlllI[I.lIllIlIIIl[45]] = "Ghost's skull";
        I.lIllIIlllI[I.lIllIlIIIl[52]] = "Restless ghost quest";
        I.lIllIIlllI[I.lIllIlIIIl[53]] = "ring of wealth (";
        I.lIllIIlllI[I.lIllIlIIIl[54]] = "Ok, I'm up for an adventure.";
        I.lIllIIlllI[I.lIllIlIIIl[55]] = "A glass of your finest ale please.";
        I.lIllIIlllI[I.lIllIlIIIl[56]] = "Morgan needs your help!";
        I.lIllIIlllI[I.lIllIlIIIl[57]] = "Yes.";
        I.lIllIIlllI[I.lIllIlIIIl[58]] = "I'm looking for a quest!";
        I.lIllIIlllI[I.lIllIlIIIl[59]] = "Ok, let me help then.";
        I.lIllIIlllI[I.lIllIlIIIl[60]] = "Father Aereck sent me to talk to you.";
        I.lIllIIlllI[I.lIllIlIIIl[61]] = "He's got a ghost haunting his graveyard.";
        I.lIllIIlllI[I.lIllIlIIIl[62]] = "Yep, now tell me what the problem is.";
        I.lIllIIlllI[I.lIllIlIIIl[63]] = "Sure.";
        I.lIllIIlllI[I.lIllIlIIIl[64]] = "I'm wearing an amulet of ghost speak!";
        I.lIllIIlllI[I.lIllIlIIIl[65]] = "Yes, I'm sure.";
        I.lIllIIlllI[I.lIllIlIIIl[66]] = "How can I help?";
    }

    private static boolean lIIllIIlIIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIllIIlIIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIllIIIlIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllIIIlllIl(Object object) {
        return object == null;
    }
}

