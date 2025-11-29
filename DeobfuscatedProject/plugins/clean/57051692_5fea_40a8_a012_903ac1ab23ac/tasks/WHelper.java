/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.WHelper;
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
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class WHelper
implements K {
    private static  WorldPoint dF;
    static  int dc;
    private static  WorldPoint dE;
    static  boolean dd;
    static  WorldArea dz;
    private static  WorldPoint dD;
    private static  WorldPoint dC;
    static  String[] cy;
    public static  boolean bn;
    private static  WorldPoint cV;

    public static  List<d> bp;
    private static  WorldPoint dB;
    private static  int dG;
    static  boolean dA;

    private static boolean lIIIlIllIlllI(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean ac() {
        return lIlIIlIIlI[2];
    }

    @Override
    public String ae() {
        return lIlIIlIIIl[lIlIIlIIlI[63]];
    }

    private static boolean lIIIlIlllIIIl(int n2) {
        return n2 > 0;
    }

        return String.valueOf(var1);
    }

    private static boolean lIIIlIlllIIII(Object object) {
        return object != null;
    }

    static {
        w.lIIIlIllIlIll();
        w.lIIIlIllIlIlI();
        bp = new ArrayList<d>();
        dz = new WorldArea(lIlIIlIIlI[65], lIlIIlIIlI[66], lIlIIlIIlI[24], lIlIIlIIlI[25], lIlIIlIIlI[2]);
        String[] stringArray = new String[lIlIIlIIlI[22]];
        stringArray[w.lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[67]];
        stringArray[w.lIlIIlIIlI[1]] = lIlIIlIIIl[lIlIIlIIlI[68]];
        stringArray[w.lIlIIlIIlI[3]] = lIlIIlIIIl[lIlIIlIIlI[69]];
        stringArray[w.lIlIIlIIlI[5]] = lIlIIlIIIl[lIlIIlIIlI[19]];
        stringArray[w.lIlIIlIIlI[6]] = lIlIIlIIIl[lIlIIlIIlI[70]];
        stringArray[w.lIlIIlIIlI[13]] = lIlIIlIIIl[lIlIIlIIlI[71]];
        stringArray[w.lIlIIlIIlI[15]] = lIlIIlIIIl[lIlIIlIIlI[72]];
        stringArray[w.lIlIIlIIlI[7]] = lIlIIlIIIl[lIlIIlIIlI[73]];
        cy = stringArray;
        cV = new WorldPoint(lIlIIlIIlI[74], lIlIIlIIlI[75], lIlIIlIIlI[2]);
        dB = new WorldPoint(lIlIIlIIlI[76], lIlIIlIIlI[77], lIlIIlIIlI[2]);
        dC = new WorldPoint(lIlIIlIIlI[78], lIlIIlIIlI[79], lIlIIlIIlI[2]);
        dD = new WorldPoint(lIlIIlIIlI[80], lIlIIlIIlI[81], lIlIIlIIlI[2]);
        dE = new WorldPoint(lIlIIlIIlI[82], lIlIIlIIlI[83], lIlIIlIIlI[2]);
        dF = new WorldPoint(lIlIIlIIlI[84], lIlIIlIIlI[85], lIlIIlIIlI[2]);
        dG = lIlIIlIIlI[24];
    }

    @Override
    public boolean af() {
        boolean bl;
        if (w.lIIIlIllIllIl(e.j(dG), lIlIIlIIlI[13])) {
            bl = lIlIIlIIlI[1];

            if (1 < 0) {
                return ((0x76 ^ 0x2D ^ (0x1F ^ 0x66)) & (0x7B ^ 0x2B ^ (0xCF ^ 0xBD) ^ -1)) != 0;
            }
        } else {
            bl = lIlIIlIIlI[2];
        }
        return bl;
    }

    private static void O() {
        d var2;
        Object var3;
        int[] nArray = new int[lIlIIlIIlI[1]];
        nArray[w.lIlIIlIIlI[2]] = lIlIIlIIlI[12];
        if (w.lIIIlIllIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lIlIIlIIlI[12], lIlIIlIIlI[1], lIlIIlIIlI[57]);
            bp.add(d2);

        }
        int[] nArray2 = new int[lIlIIlIIlI[1]];
        nArray2[w.lIlIIlIIlI[2]] = lIlIIlIIlI[10];
        if (w.lIIIlIllIllll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var3 = new DHelper(lIlIIlIIlI[10], lIlIIlIIlI[1], lIlIIlIIlI[4]);
            bp.add((DHelper) ar3);

        }
        int[] nArray3 = new int[lIlIIlIIlI[1]];
        nArray3[w.lIlIIlIIlI[2]] = lIlIIlIIlI[9];
        if (w.lIIIlIllIllll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var3 = new DHelper(lIlIIlIIlI[9], lIlIIlIIlI[1], lIlIIlIIlI[4]);
            bp.add((DHelper) ar3);

        }
        int[] nArray4 = new int[lIlIIlIIlI[1]];
        nArray4[w.lIlIIlIIlI[2]] = lIlIIlIIlI[14];
        if (w.lIIIlIllIllll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var3 = new DHelper(lIlIIlIIlI[14], lIlIIlIIlI[24], lIlIIlIIlI[4]);
            bp.add((DHelper) ar3);

        }
        int[] nArray5 = new int[lIlIIlIIlI[1]];
        nArray5[w.lIlIIlIIlI[2]] = lIlIIlIIlI[16];
        if (w.lIIIlIllIllll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var3 = new DHelper(lIlIIlIIlI[16], lIlIIlIIlI[24], j.bZ);
            bp.add((DHelper) ar3);

        }
        int[] nArray6 = new int[lIlIIlIIlI[1]];
        nArray6[w.lIlIIlIIlI[2]] = lIlIIlIIlI[11];
        if (w.lIIIlIllIllll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var3 = new DHelper(lIlIIlIIlI[11], lIlIIlIIlI[0], lIlIIlIIlI[58]);
            bp.add((DHelper) ar3);

        }
        if (w.lIIIlIllIllll(Bank.contains((Predicate)(var3 = item -> item.getName().toLowerCase().contains(lIlIIlIIIl[lIlIIlIIlI[64]]))) ? 1 : 0)) {
            var2 = new DHelper(lIlIIlIIlI[59], lIlIIlIIlI[13], lIlIIlIIlI[60]);
            bp.add(var2);

        }
        int[] nArray7 = new int[lIlIIlIIlI[1]];
        nArray7[w.lIlIIlIIlI[2]] = lIlIIlIIlI[8];
        if (w.lIIIlIllIllll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var2 = new DHelper(lIlIIlIIlI[8], lIlIIlIIlI[52], lIlIIlIIlI[61]);
            bp.add(var2);

        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean al() {
        int n2;
        int[] nArray = new int[lIlIIlIIlI[1]];
        nArray[w.lIlIIlIIlI[2]] = lIlIIlIIlI[8];
        if (w.lIIIlIlllIIIl(Inventory.getCount((int[])nArray))) {
            String[] stringArray = new String[lIlIIlIIlI[1]];
            stringArray[w.lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[52]];
            if (w.lIIIlIlllIIIl(Inventory.getCount((String[])stringArray))) {
                String[] stringArray2 = new String[lIlIIlIIlI[1]];
                stringArray2[w.lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[53]];
                if (w.lIIIlIlllIIIl(Inventory.getCount((String[])stringArray2))) {
                    String[] stringArray3 = new String[lIlIIlIIlI[1]];
                    stringArray3[w.lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[54]];
                    if (w.lIIIlIlllIIIl(Inventory.getCount((String[])stringArray3))) {
                        String[] stringArray4 = new String[lIlIIlIIlI[1]];
                        stringArray4[w.lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[55]];
                        if (w.lIIIlIlllIIIl(Inventory.getCount((String[])stringArray4))) {
                            String[] stringArray5 = new String[lIlIIlIIlI[1]];
                            stringArray5[w.lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[56]];
                            if (w.lIIIlIlllIIIl(Inventory.getCount((String[])stringArray5))) {
                                int[] nArray2 = new int[lIlIIlIIlI[1]];
                                nArray2[w.lIlIIlIIlI[2]] = lIlIIlIIlI[17];
                                if (w.lIIIlIlllIIIl(Inventory.getCount((int[])nArray2)) && w.lIIIlIllIlllI(Inventory.contains((int[])f.aU) ? 1 : 0)) {
                                    n2 = lIlIIlIIlI[1];

                                    if ((0x44 ^ 0x39 ^ (0xFF ^ 0x87)) != 0) return n2 != 0;
                                    return ((0x41 ^ 0x59 ^ (0xF9 ^ 0xAC)) & (61 + 178 - 116 + 105 ^ 142 + 134 - 259 + 152 ^ -1)) != 0;
                                }
                            }
                        }
                    }
                }
            }
        }
        n2 = lIlIIlIIlI[2];
        return n2 != 0;
    }

    public static void bi() {
        if (w.lIIIlIllIllII(Skills.getLevel((Skill)Skill.FISHING), lIlIIlIIlI[0])) {
            W.dE();
        }
        if (w.lIIIlIllIllIl(Skills.getLevel((Skill)Skill.FISHING), lIlIIlIIlI[0])) {
            if (w.lIIIlIllIlllI(bn ? 1 : 0)) {
                b.a(bp);
                if (w.lIIIlIllIllII(bp.size(), lIlIIlIIlI[1])) {
                    System.out.println(lIlIIlIIIl[lIlIIlIIlI[2]]);
                    bn = lIlIIlIIlI[2];
                }
            }
            if (w.lIIIlIllIllll(bn ? 1 : 0)) {
                if (w.lIIIlIllIllll(w.al() ? 1 : 0) && w.lIIIlIllIllII(e.j(dG), lIlIIlIIlI[1])) {
                    String[] stringArray = new String[lIlIIlIIlI[1]];
                    stringArray[w.lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[1]];
                    if (w.lIIIlIllIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        BankLocation var4 = BankLocation.getNearest();
                        if (w.lIIIlIlllIIII(var4) && w.lIIIlIllIllll(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIIlIIIl[lIlIIlIIlI[3]];
                            a.a(var4);
                        }
                        if (w.lIIIlIlllIIII(var4) && w.lIIIlIllIlllI(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (w.lIIIlIllIllll(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIIlIIlI[4]);

                            }
                            if (w.lIIIlIllIlllI(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderShamans.c = lIlIIlIIIl[lIlIIlIIlI[5]];
                                if (w.lIIIlIlllIIIl(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lIlIIlIIlI[6]);

                                }
                                if (w.lIIIlIlllIIIl(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lIlIIlIIlI[3]);

                                }
                                int[] nArray = new int[lIlIIlIIlI[7]];
                                nArray[w.lIlIIlIIlI[2]] = lIlIIlIIlI[8];
                                nArray[w.lIlIIlIIlI[1]] = lIlIIlIIlI[9];
                                nArray[w.lIlIIlIIlI[3]] = lIlIIlIIlI[10];
                                nArray[w.lIlIIlIIlI[5]] = lIlIIlIIlI[11];
                                nArray[w.lIlIIlIIlI[6]] = lIlIIlIIlI[12];
                                nArray[w.lIlIIlIIlI[13]] = lIlIIlIIlI[14];
                                nArray[w.lIlIIlIIlI[15]] = lIlIIlIIlI[16];
                                if (w.lIIIlIllIllll(e.b(nArray) ? 1 : 0)) {
                                    w.O();
                                    System.out.println(lIlIIlIIIl[lIlIIlIIlI[6]]);
                                    bn = lIlIIlIIlI[1];
                                    return;
                                }
                                int[] nArray2 = new int[lIlIIlIIlI[15]];
                                nArray2[w.lIlIIlIIlI[2]] = lIlIIlIIlI[8];
                                nArray2[w.lIlIIlIIlI[1]] = lIlIIlIIlI[9];
                                nArray2[w.lIlIIlIIlI[3]] = lIlIIlIIlI[10];
                                nArray2[w.lIlIIlIIlI[5]] = lIlIIlIIlI[11];
                                nArray2[w.lIlIIlIIlI[6]] = lIlIIlIIlI[12];
                                nArray2[w.lIlIIlIIlI[13]] = lIlIIlIIlI[14];
                                if (w.lIIIlIllIlllI(e.b(nArray2) ? 1 : 0)) {
                                    a.a(lIlIIlIIlI[8], lIlIIlIIlI[0]);
                                    a.a(lIlIIlIIlI[14], lIlIIlIIlI[0]);
                                    a.a(lIlIIlIIlI[9], lIlIIlIIlI[1]);
                                    a.a(lIlIIlIIlI[10], lIlIIlIIlI[1]);
                                    a.a(lIlIIlIIlI[11], lIlIIlIIlI[0]);
                                    a.a(lIlIIlIIlI[12], lIlIIlIIlI[1]);
                                    a.a(lIlIIlIIlI[16], lIlIIlIIlI[5]);
                                    a.a(lIlIIlIIlI[17], lIlIIlIIlI[18]);
                                }
                            }
                        }
                    }
                }
                if (w.lIIIlIllIlllI(Inventory.contains((int[])f.aU) ? 1 : 0) && w.lIIIlIllIllII(Movement.getRunEnergy(), lIlIIlIIlI[19])) {
                    Inventory.getFirst((int[])f.aU).interact(lIlIIlIIIl[lIlIIlIIlI[13]]);
                    Time.sleepTicks((int)lIlIIlIIlI[1]);

                }
                if (w.lIIIlIllIlllI(w.al() ? 1 : 0) && w.lIIIlIllIllII(e.j(dG), lIlIIlIIlI[1])) {
                    int[] nArray = new int[lIlIIlIIlI[1]];
                    nArray[w.lIlIIlIIlI[2]] = lIlIIlIIlI[20];
                    if (w.lIIIlIllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        if (w.lIIIlIlllIIlI(Players.getLocal().getWorldLocation().distanceTo(cV), lIlIIlIIlI[0])) {
                            AccBuilderShamans.c = lIlIIlIIIl[lIlIIlIIlI[15]];
                            if (w.lIIIlIllIlllI(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)cV);

                            Time.sleepTicks((int)lIlIIlIIlI[1]);

                        }
                        if (w.lIIIlIlllIIll(Players.getLocal().getWorldLocation().distanceTo(cV), lIlIIlIIlI[21])) {
                            AccBuilderShamans.c = lIlIIlIIIl[lIlIIlIIlI[7]];
                            g.a(lIlIIlIIIl[lIlIIlIIlI[22]], cy);
                        }
                    }
                }
                if (w.lIIIlIlllIlII(e.j(dG), lIlIIlIIlI[1])) {
                    int[] nArray = new int[lIlIIlIIlI[1]];
                    nArray[w.lIlIIlIIlI[2]] = lIlIIlIIlI[20];
                    if (w.lIIIlIllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIIlIIlI[1]];
                        stringArray[w.lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[23]];
                        if (w.lIIIlIllIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            dc = lIlIIlIIlI[2];
                            String[] stringArray2 = new String[lIlIIlIIlI[1]];
                            stringArray2[w.lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[0]];
                            if (w.lIIIlIllIllll(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                                if (w.lIIIlIlllIIlI(Players.getLocal().getWorldLocation().distanceTo(dC), lIlIIlIIlI[6])) {
                                    AccBuilderShamans.c = lIlIIlIIIl[lIlIIlIIlI[24]];
                                    Movement.walkTo((WorldPoint)dC);

                                }
                                if (w.lIIIlIlllIIll(Players.getLocal().getWorldLocation().distanceTo(dC), lIlIIlIIlI[6])) {
                                    AccBuilderShamans.c = lIlIIlIIIl[lIlIIlIIlI[21]];
                                    String[] stringArray3 = new String[lIlIIlIIlI[1]];
                                    stringArray3[w.lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[25]];
                                    if (w.lIIIlIllIllll(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                        String[] stringArray4 = new String[lIlIIlIIlI[1]];
                                        stringArray4[w.lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[26]];
                                        if (w.lIIIlIlllIIII(TileObjects.getNearest((String[])stringArray4))) {
                                            String[] stringArray5 = new String[lIlIIlIIlI[1]];
                                            stringArray5[w.lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[27]];
                                            TileObjects.getNearest((String[])stringArray5).interact(lIlIIlIIIl[lIlIIlIIlI[28]]);
                                            Time.sleepTicks((int)lIlIIlIIlI[3]);

                                        }
                                    }
                                }
                            }
                            String[] stringArray6 = new String[lIlIIlIIlI[1]];
                            stringArray6[w.lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[29]];
                            if (w.lIIIlIllIlllI(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                                if (w.lIIIlIllIllll(dz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderShamans.c = lIlIIlIIIl[lIlIIlIIlI[30]];
                                    if (w.lIIIlIllIllll(Dialog.isOpen() ? 1 : 0)) {
                                        Movement.walkTo((WorldPoint)dF);

                                        Time.sleepTicks((int)lIlIIlIIlI[1]);

                                    }
                                    g.a(cy);
                                }
                                if (w.lIIIlIllIlllI(dz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] stringArray7 = new String[lIlIIlIIlI[1]];
                                    stringArray7[w.lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[31]];
                                    if (w.lIIIlIllIlllI(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIIIl[lIlIIlIIlI[32]];
                                        String[] stringArray8 = new String[lIlIIlIIlI[1]];
                                        stringArray8[w.lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[33]];
                                        if (w.lIIIlIlllIIlI(Players.getLocal().getWorldLocation().distanceTo(TileObjects.getNearest((String[])stringArray8).getWorldLocation()), lIlIIlIIlI[3])) {
                                            String[] stringArray9 = new String[lIlIIlIIlI[1]];
                                            stringArray9[w.lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[34]];
                                            Movement.walkTo((WorldPoint)TileObjects.getNearest((String[])stringArray9).getWorldLocation());

                                            Time.sleepTicks((int)lIlIIlIIlI[6]);

                                        }
                                        if (w.lIIIlIllIllll(Dialog.isOpen() ? 1 : 0)) {
                                            String[] stringArray10 = new String[lIlIIlIIlI[1]];
                                            stringArray10[w.lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[35]];
                                            String[] stringArray11 = new String[lIlIIlIIlI[1]];
                                            stringArray11[w.lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[36]];
                                            Inventory.getFirst((String[])stringArray10).useOn(TileObjects.getNearest((String[])stringArray11));
                                            Time.sleepTicks((int)lIlIIlIIlI[3]);

                                        }
                                        g.a(cy);
                                    }
                                    String[] stringArray12 = new String[lIlIIlIIlI[1]];
                                    stringArray12[w.lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[37]];
                                    if (w.lIIIlIllIllll(Inventory.contains((String[])stringArray12) ? 1 : 0) && w.lIIIlIllIllll(dA ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIIIl[lIlIIlIIlI[38]];
                                        g.a(lIlIIlIIIl[lIlIIlIIlI[20]], cy);
                                        if (w.lIIIlIllIlllI(Dialog.getText().contains(lIlIIlIIIl[lIlIIlIIlI[39]]) ? 1 : 0)) {
                                            dA = lIlIIlIIlI[1];
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (w.lIIIlIlllIlII(e.j(dG), lIlIIlIIlI[5])) {
                    String[] stringArray = new String[lIlIIlIIlI[1]];
                    stringArray[w.lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[40]];
                    if (w.lIIIlIllIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray13 = new String[lIlIIlIIlI[1]];
                        stringArray13[w.lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[41]];
                        if (w.lIIIlIllIllll(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIIlIIIl[lIlIIlIIlI[42]];
                            int[] nArray = new int[lIlIIlIIlI[1]];
                            nArray[w.lIlIIlIIlI[2]] = lIlIIlIIlI[43];
                            NPCs.getNearest((int[])nArray).interact(lIlIIlIIIl[lIlIIlIIlI[44]]);
                            Time.sleepTicks((int)lIlIIlIIlI[13]);

                        }
                    }
                    String[] stringArray14 = new String[lIlIIlIIlI[1]];
                    stringArray14[w.lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[45]];
                    if (w.lIIIlIllIlllI(Inventory.contains((String[])stringArray14) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIlIIIl[lIlIIlIIlI[46]];
                        g.a(lIlIIlIIIl[lIlIIlIIlI[47]], cy);
                    }
                }
                String[] stringArray = new String[lIlIIlIIlI[1]];
                stringArray[w.lIlIIlIIlI[2]] = lIlIIlIIIl[lIlIIlIIlI[48]];
                if (w.lIIIlIllIlllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (w.lIIIlIlllIIlI(Players.getLocal().getWorldLocation().distanceTo(cV), lIlIIlIIlI[13])) {
                        AccBuilderShamans.c = lIlIIlIIIl[lIlIIlIIlI[49]];
                        Movement.walkTo((WorldPoint)cV);

                        Time.sleepTicks((int)lIlIIlIIlI[1]);

                    }
                    if (w.lIIIlIlllIIll(Players.getLocal().getWorldLocation().distanceTo(cV), lIlIIlIIlI[13])) {
                        AccBuilderShamans.c = lIlIIlIIIl[lIlIIlIIlI[50]];
                        if (w.lIIIlIllIllII(dc, lIlIIlIIlI[1])) {
                            Z.lm += lIlIIlIIlI[1];
                            Z.p(AccBuilderShamans.m);
                            dc += lIlIIlIIlI[1];
                            Z.lm = lIlIIlIIlI[2];
                            dd = lIlIIlIIlI[2];
                        }
                        g.a(lIlIIlIIIl[lIlIIlIIlI[51]], cy);
                    }
                }
            }
        }
    }

    private static boolean lIIIlIllIllll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlIlllIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIlIlllIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIlIllIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public int ad() {
        try {
            w.bi();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (2 < -1) {
            return (0x49 ^ 0x35 ^ (3 ^ 0x54)) & (37 + 35 - 48 + 103 ^ (0xC4 ^ 0x90) ^ -1);
        }
        return lIlIIlIIlI[62];
    }

    private static boolean lIIIlIlllIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIlIllIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIlIllIlIlI() {
        lIlIIlIIIl = new String[lIlIIlIIlI[86]];
        w.lIlIIlIIIl[w.lIlIIlIIlI[2]] = "Finished buying items, switching back to quest";
        w.lIlIIlIIIl[w.lIlIIlIIlI[1]] = "Fishing pass";
        w.lIlIIlIIIl[w.lIlIIlIIlI[3]] = "Nav to bank";
        w.lIlIIlIIIl[w.lIlIIlIIlI[5]] = "Handling banking";
        w.lIlIIlIIIl[w.lIlIIlIIlI[6]] = "We are missing quest supplies, switching to BUYING";
        w.lIlIIlIIIl[w.lIlIIlIIlI[13]] = "Drink";
        w.lIlIIlIIIl[w.lIlIIlIIlI[15]] = "Nav to start";
        w.lIlIIlIIIl[w.lIlIIlIIlI[7]] = "Starting quest";
        w.lIlIIlIIIl[w.lIlIIlIIlI[22]] = "Vestri";
        w.lIlIIlIIIl[w.lIlIIlIIlI[23]] = "Fishing trophy";
        w.lIlIIlIIIl[w.lIlIIlIIlI[0]] = "Red vine worm";
        w.lIlIIlIIIl[w.lIlIIlIIlI[24]] = "Nav to vine";
        w.lIlIIlIIIl[w.lIlIIlIIlI[21]] = "Digging";
        w.lIlIIlIIIl[w.lIlIIlIIlI[25]] = "Red vine worm";
        w.lIlIIlIIIl[w.lIlIIlIIlI[26]] = "Vine";
        w.lIlIIlIIIl[w.lIlIIlIIlI[27]] = "Vine";
        w.lIlIIlIIIl[w.lIlIIlIIlI[28]] = "Check";
        w.lIlIIlIIIl[w.lIlIIlIIlI[29]] = "Red vine worm";
        w.lIlIIlIIIl[w.lIlIIlIIlI[30]] = "Nav to contest";
        w.lIlIIlIIIl[w.lIlIIlIIlI[31]] = "Garlic";
        w.lIlIIlIIIl[w.lIlIIlIIlI[32]] = "Using garlic";
        w.lIlIIlIIIl[w.lIlIIlIIlI[33]] = "Wall Pipe";
        w.lIlIIlIIIl[w.lIlIIlIIlI[34]] = "Wall Pipe";
        w.lIlIIlIIIl[w.lIlIIlIIlI[35]] = "Garlic";
        w.lIlIIlIIIl[w.lIlIIlIIlI[36]] = "Wall Pipe";
        w.lIlIIlIIIl[w.lIlIIlIIlI[37]] = "Garlic";
        w.lIlIIlIIIl[w.lIlIIlIIlI[38]] = "Start contest";
        w.lIlIIlIIIl[w.lIlIIlIIlI[20]] = "Bonzo";
        w.lIlIIlIIIl[w.lIlIIlIIlI[39]] = "I might still be able to find a bigger fish";
        w.lIlIIlIIIl[w.lIlIIlIIlI[40]] = "Garlic";
        w.lIlIIlIIIl[w.lIlIIlIIlI[41]] = "Raw giant carp";
        w.lIlIIlIIIl[w.lIlIIlIIlI[42]] = "Fishing";
        w.lIlIIlIIIl[w.lIlIIlIIlI[44]] = "Bait";
        w.lIlIIlIIIl[w.lIlIIlIIlI[45]] = "Raw giant carp";
        w.lIlIIlIIIl[w.lIlIIlIIlI[46]] = "Handing in fish";
        w.lIlIIlIIIl[w.lIlIIlIIlI[47]] = "Bonzo";
        w.lIlIIlIIIl[w.lIlIIlIIlI[48]] = "Fishing trophy";
        w.lIlIIlIIIl[w.lIlIIlIIlI[49]] = "Nav to start";
        w.lIlIIlIIIl[w.lIlIIlIIlI[50]] = "Finishing quest";
        w.lIlIIlIIIl[w.lIlIIlIIlI[51]] = "Vestri";
        w.lIlIIlIIIl[w.lIlIIlIIlI[52]] = "Camelot teleport";
        w.lIlIIlIIIl[w.lIlIIlIIlI[53]] = "Garlic";
        w.lIlIIlIIIl[w.lIlIIlIIlI[54]] = "Spade";
        w.lIlIIlIIIl[w.lIlIIlIIlI[55]] = "Fishing rod";
        w.lIlIIlIIIl[w.lIlIIlIIlI[56]] = "Fishing bait";
        w.lIlIIlIIIl[w.lIlIIlIIlI[63]] = "Fishing contest";
        w.lIlIIlIIIl[w.lIlIIlIIlI[64]] = "ring of wealth (";
        w.lIlIIlIIIl[w.lIlIIlIIlI[67]] = "I was wondering what was down those stairs?";
        w.lIlIIlIIIl[w.lIlIIlIIlI[68]] = "Why not?";
        w.lIlIIlIIIl[w.lIlIIlIIlI[69]] = "If you were my friend I wouldn't mind it.";
        w.lIlIIlIIIl[w.lIlIIlIIlI[19]] = "Well, let's be friends!";
        w.lIlIIlIIIl[w.lIlIIlIIlI[70]] = "And how am I meant to do that?";
        w.lIlIIlIIIl[w.lIlIIlIIlI[71]] = "I'll enter the competition please.";
        w.lIlIIlIIIl[w.lIlIIlIIlI[72]] = "I have this big fish. Is it enough to win?";
        w.lIlIIlIIIl[w.lIlIIlIIlI[73]] = "Yes.";
    }
}

