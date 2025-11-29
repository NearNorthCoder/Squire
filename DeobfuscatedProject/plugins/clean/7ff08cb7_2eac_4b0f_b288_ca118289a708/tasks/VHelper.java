/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.GHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.IHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.MHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.NHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.UHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AHelper;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.ANHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.ARHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.ASHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.BHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.DHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.EHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.FHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.GHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.JHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.NHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.OHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.UHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.WHelper;
import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class VHelper
implements ab {
    static  WorldPoint dq;
    static  boolean dl;
    
    private static  int da;
    static  WorldArea do;
    static  int dk;
    public static  boolean bv;
    static  WorldArea dn;
    static  WorldPoint dr;
    private static  String ds;
    static  WorldPoint dg;
    
    public static  List<d> bx;
    
    static  WorldArea dp;

    private static boolean llIllIllIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void ba() {
        WorldArea worldArea = new WorldArea(lIIIIIIIlI[52], lIIIIIIIlI[56], lIIIIIIIlI[16], lIIIIIIIlI[4], lIIIIIIIlI[1]);
        if (v.llIllIllIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] stringArray = new String[lIIIIIIIlI[0]];
            stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[142]];
            TileObjects.getNearest((String[])stringArray).interact(lllllllll[lIIIIIIIlI[143]]);
            Time.sleepTicks((int)lIIIIIIIlI[9]);

        }
        if (v.llIllIllIlII(dn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIIIIlI[21])) {
            AccBuilderGWD.c = lllllllll[lIIIIIIIlI[144]];
            if (v.llIllIllIIlI(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)dg);

            Time.sleepTicks((int)lIIIIIIIlI[0]);

        }
        if (v.llIllIllIIlI(dn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIllIlllIll(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIIIIlI[21])) {
            g.a(lllllllll[lIIIIIIIlI[145]], cG);
        }
        if (v.llIllIllIIlI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIIIIIIlI[52], lIIIIIIIlI[53], lIIIIIIIlI[1])) ? 1 : 0)) {
            String[] stringArray = new String[lIIIIIIIlI[0]];
            stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[99]];
            TileObjects.getNearest((String[])stringArray).interact(lllllllll[lIIIIIIIlI[146]]);
            Time.sleepTicks((int)lIIIIIIIlI[9]);

        }
    }

    private static boolean llIllIllIlII(int n2) {
        return n2 == 0;
    }

    private static void Q() {
        block46: {
            d lIIlIlIlIlIII;
            block45: {
                block44: {
                    block43: {
                        Object lIIlIlIlIlIIl;
                        block42: {
                            block41: {
                                block40: {
                                    block39: {
                                        block38: {
                                            block37: {
                                                block36: {
                                                    block35: {
                                                        block34: {
                                                            block33: {
                                                                block32: {
                                                                    block31: {
                                                                        int[] nArray = new int[lIIIIIIIlI[0]];
                                                                        nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[43];
                                                                        if (!v.llIllIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block31;
                                                                        int[] nArray2 = new int[lIIIIIIIlI[0]];
                                                                        nArray2[v.lIIIIIIIlI[1]] = lIIIIIIIlI[43];
                                                                        if (!v.llIllIllIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) break block32;
                                                                        int[] nArray3 = new int[lIIIIIIIlI[0]];
                                                                        nArray3[v.lIIIIIIIlI[1]] = lIIIIIIIlI[43];
                                                                        if (!v.llIllIllIIll(Bank.getFirst((int[])nArray3).getQuantity(), lIIIIIIIlI[4])) break block32;
                                                                    }
                                                                    lIIlIlIlIlIIl = new DHelper(lIIIIIIIlI[43], lIIIIIIIlI[4], e.c(lIIIIIIIlI[147], lIIIIIIIlI[148]));
                                                                    bx.add((DHelper) IIlIlIlIlIIl);

                                                                }
                                                                int[] nArray = new int[lIIIIIIIlI[0]];
                                                                nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[30];
                                                                if (!v.llIllIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                                                                int[] nArray4 = new int[lIIIIIIIlI[0]];
                                                                nArray4[v.lIIIIIIIlI[1]] = lIIIIIIIlI[30];
                                                                if (!v.llIllIllIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) break block34;
                                                                int[] nArray5 = new int[lIIIIIIIlI[0]];
                                                                nArray5[v.lIIIIIIIlI[1]] = lIIIIIIIlI[30];
                                                                if (!v.llIllIllIIll(Bank.getFirst((int[])nArray5).getQuantity(), lIIIIIIIlI[16])) break block34;
                                                            }
                                                            lIIlIlIlIlIIl = new DHelper(lIIIIIIIlI[30], lIIIIIIIlI[16], lIIIIIIIlI[149]);
                                                            bx.add((DHelper) IIlIlIlIlIIl);

                                                        }
                                                        int[] nArray = new int[lIIIIIIIlI[0]];
                                                        nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[31];
                                                        if (!v.llIllIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block35;
                                                        int[] nArray6 = new int[lIIIIIIIlI[0]];
                                                        nArray6[v.lIIIIIIIlI[1]] = lIIIIIIIlI[31];
                                                        if (!v.llIllIllIIlI(Bank.contains((int[])nArray6) ? 1 : 0)) break block36;
                                                        int[] nArray7 = new int[lIIIIIIIlI[0]];
                                                        nArray7[v.lIIIIIIIlI[1]] = lIIIIIIIlI[31];
                                                        if (!v.llIllIllIIll(Bank.getFirst((int[])nArray7).getQuantity(), lIIIIIIIlI[28])) break block36;
                                                    }
                                                    lIIlIlIlIlIIl = new DHelper(lIIIIIIIlI[31], lIIIIIIIlI[28], lIIIIIIIlI[150]);
                                                    bx.add((DHelper) IIlIlIlIlIIl);

                                                }
                                                int[] nArray = new int[lIIIIIIIlI[0]];
                                                nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[103];
                                                if (v.llIllIllIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    lIIlIlIlIlIIl = new DHelper(lIIIIIIIlI[103], lIIIIIIIlI[8], lIIIIIIIlI[151]);
                                                    bx.add((DHelper) IIlIlIlIlIIl);

                                                }
                                                int[] nArray8 = new int[lIIIIIIIlI[0]];
                                                nArray8[v.lIIIIIIIlI[1]] = lIIIIIIIlI[37];
                                                if (v.llIllIllIlII(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                                    lIIlIlIlIlIIl = new DHelper(lIIIIIIIlI[37], lIIIIIIIlI[0], lIIIIIIIlI[27]);
                                                    bx.add((DHelper) IIlIlIlIlIIl);

                                                }
                                                int[] nArray9 = new int[lIIIIIIIlI[0]];
                                                nArray9[v.lIIIIIIIlI[1]] = lIIIIIIIlI[32];
                                                if (!v.llIllIllIIlI(Bank.contains((int[])nArray9) ? 1 : 0)) break block37;
                                                int[] nArray10 = new int[lIIIIIIIlI[0]];
                                                nArray10[v.lIIIIIIIlI[1]] = lIIIIIIIlI[32];
                                                if (!v.llIllIllIIlI(Bank.contains((int[])nArray10) ? 1 : 0)) break block38;
                                                int[] nArray11 = new int[lIIIIIIIlI[0]];
                                                nArray11[v.lIIIIIIIlI[1]] = lIIIIIIIlI[32];
                                                if (!v.llIllIllIIll(Bank.getFirst((int[])nArray11).getQuantity(), lIIIIIIIlI[13])) break block38;
                                            }
                                            lIIlIlIlIlIIl = new DHelper(lIIIIIIIlI[32], lIIIIIIIlI[13], lIIIIIIIlI[27]);
                                            bx.add((DHelper) IIlIlIlIlIIl);

                                        }
                                        int[] nArray = new int[lIIIIIIIlI[0]];
                                        nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[33];
                                        if (!v.llIllIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block39;
                                        int[] nArray12 = new int[lIIIIIIIlI[0]];
                                        nArray12[v.lIIIIIIIlI[1]] = lIIIIIIIlI[33];
                                        if (!v.llIllIllIIlI(Bank.contains((int[])nArray12) ? 1 : 0)) break block40;
                                        int[] nArray13 = new int[lIIIIIIIlI[0]];
                                        nArray13[v.lIIIIIIIlI[1]] = lIIIIIIIlI[33];
                                        if (!v.llIllIllIIll(Bank.getFirst((int[])nArray13).getQuantity(), lIIIIIIIlI[8])) break block40;
                                    }
                                    lIIlIlIlIlIIl = new DHelper(lIIIIIIIlI[33], lIIIIIIIlI[8], lIIIIIIIlI[27]);
                                    bx.add((DHelper) IIlIlIlIlIIl);

                                }
                                int[] nArray = new int[lIIIIIIIlI[0]];
                                nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[29];
                                if (!v.llIllIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block41;
                                int[] nArray14 = new int[lIIIIIIIlI[0]];
                                nArray14[v.lIIIIIIIlI[1]] = lIIIIIIIlI[29];
                                if (!v.llIllIllIIlI(Bank.contains((int[])nArray14) ? 1 : 0)) break block42;
                                int[] nArray15 = new int[lIIIIIIIlI[0]];
                                nArray15[v.lIIIIIIIlI[1]] = lIIIIIIIlI[29];
                                if (!v.llIllIllIIll(Bank.getFirst((int[])nArray15).getQuantity(), lIIIIIIIlI[8])) break block42;
                            }
                            lIIlIlIlIlIIl = new DHelper(lIIIIIIIlI[29], lIIIIIIIlI[13], lIIIIIIIlI[27]);
                            bx.add((DHelper) IIlIlIlIlIIl);

                        }
                        int[] nArray = new int[lIIIIIIIlI[0]];
                        nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[39];
                        if (v.llIllIllIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            lIIlIlIlIlIIl = new DHelper(lIIIIIIIlI[39], lIIIIIIIlI[0], lIIIIIIIlI[27]);
                            bx.add((DHelper) IIlIlIlIlIIl);

                        }
                        int[] nArray16 = new int[lIIIIIIIlI[0]];
                        nArray16[v.lIIIIIIIlI[1]] = lIIIIIIIlI[38];
                        if (v.llIllIllIlII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                            lIIlIlIlIlIIl = new DHelper(lIIIIIIIlI[38], lIIIIIIIlI[0], lIIIIIIIlI[27]);
                            bx.add((DHelper) IIlIlIlIlIIl);

                        }
                        int[] nArray17 = new int[lIIIIIIIlI[0]];
                        nArray17[v.lIIIIIIIlI[1]] = lIIIIIIIlI[40];
                        if (v.llIllIllIlII(Bank.contains((int[])nArray17) ? 1 : 0)) {
                            lIIlIlIlIlIIl = new DHelper(lIIIIIIIlI[40], lIIIIIIIlI[0], lIIIIIIIlI[152]);
                            bx.add((DHelper) IIlIlIlIlIIl);

                        }
                        int[] nArray18 = new int[lIIIIIIIlI[0]];
                        nArray18[v.lIIIIIIIlI[1]] = lIIIIIIIlI[41];
                        if (v.llIllIllIlII(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            lIIlIlIlIlIIl = new DHelper(lIIIIIIIlI[41], lIIIIIIIlI[0], lIIIIIIIlI[153] + e.c(lIIIIIIIlI[154], lIIIIIIIlI[155]));
                            bx.add((DHelper) IIlIlIlIlIIl);

                        }
                        if (v.llIllIllIlII(Bank.contains((Predicate)(lIIlIlIlIlIIl = item -> item.getName().toLowerCase().contains(lllllllll[lIIIIIIIlI[161]]))) ? 1 : 0)) {
                            lIIlIlIlIlIII = new DHelper(lIIIIIIIlI[156], lIIIIIIIlI[8], lIIIIIIIlI[157]);
                            bx.add(lIIlIlIlIlIII);

                        }
                        int[] nArray19 = new int[lIIIIIIIlI[0]];
                        nArray19[v.lIIIIIIIlI[1]] = lIIIIIIIlI[34];
                        if (!v.llIllIllIIlI(Bank.contains((int[])nArray19) ? 1 : 0)) break block43;
                        int[] nArray20 = new int[lIIIIIIIlI[0]];
                        nArray20[v.lIIIIIIIlI[1]] = lIIIIIIIlI[34];
                        if (!v.llIllIllIIlI(Bank.contains((int[])nArray20) ? 1 : 0)) break block44;
                        int[] nArray21 = new int[lIIIIIIIlI[0]];
                        nArray21[v.lIIIIIIIlI[1]] = lIIIIIIIlI[34];
                        if (!v.llIllIllIIll(Bank.getFirst((int[])nArray21).getQuantity(), lIIIIIIIlI[13])) break block44;
                    }
                    lIIlIlIlIlIII = new DHelper(lIIIIIIIlI[34], lIIIIIIIlI[13], j.ch);
                    bx.add(lIIlIlIlIlIII);

                }
                int[] nArray = new int[lIIIIIIIlI[0]];
                nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[36];
                if (!v.llIllIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray22 = new int[lIIIIIIIlI[0]];
                nArray22[v.lIIIIIIIlI[1]] = lIIIIIIIlI[36];
                if (!v.llIllIllIIlI(Bank.contains((int[])nArray22) ? 1 : 0)) break block46;
                int[] nArray23 = new int[lIIIIIIIlI[0]];
                nArray23[v.lIIIIIIIlI[1]] = lIIIIIIIlI[36];
                if (!v.llIllIllIIll(Bank.getFirst((int[])nArray23).getQuantity(), lIIIIIIIlI[28])) break block46;
            }
            lIIlIlIlIlIII = new DHelper(lIIIIIIIlI[36], lIIIIIIIlI[22], lIIIIIIIlI[158]);
            bx.add(lIIlIlIlIlIII);

        }
    }

    private static boolean llIllIllIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIllIlllIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIllIllllIl(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public String ag() {
        if (v.llIllIllllIl(ds, lllllllll[lIIIIIIIlI[159]])) {
            return lllllllll[lIIIIIIIlI[160]];
        }
        return "Animal Magnetism - " + ds;
    }

    private static int llIllIllIIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llIllIllIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIllIlllIII(int n2) {
        return n2 > 0;
    }

    private static void llIllIlIllII() {
        lllllllll = new String[lIIIIIIIlI[181]];
        v.lllllllll[v.lIIIIIIIlI[1]] = "Finished buying items, switching back to quest";
        v.lllllllll[v.lIIIIIIIlI[0]] = "Waterfall";
        v.lllllllll[v.lIIIIIIIlI[9]] = "Priest in Peril";
        v.lllllllll[v.lIIIIIIIlI[11]] = "Ernest the Chicken";
        v.lllllllll[v.lIIIIIIIlI[13]] = "Crafting";
        v.lllllllll[v.lIIIIIIIlI[8]] = "Woodcutting";
        v.lllllllll[v.lIIIIIIIlI[16]] = "Training range";
        v.lllllllll[v.lIIIIIIIlI[20]] = "Varrock Quiz";
        v.lllllllll[v.lIIIIIIIlI[21]] = "RFD Dwarf";
        v.lllllllll[v.lIIIIIIIlI[19]] = "A Porcine";
        v.lllllllll[v.lIIIIIIIlI[4]] = "Antique lamp";
        v.lllllllll[v.lIIIIIIIlI[23]] = "Client of Kourend";
        v.lllllllll[v.lIIIIIIIlI[24]] = "Antique lamp";
        v.lllllllll[v.lIIIIIIIlI[25]] = v.llIllIIlllIl("", "DpcMz");
        v.lllllllll[v.lIIIIIIIlI[26]] = "Nav to bank";
        v.lllllllll[v.lIIIIIIIlI[28]] = "Handling banking";
        v.lllllllll[v.lIIIIIIIlI[35]] = "We are missing quest supplies, switching to BUYING";
        v.lllllllll[v.lIIIIIIIlI[42]] = "We are missing quest supplies, switching to BUYING";
        v.lllllllll[v.lIIIIIIIlI[46]] = "Drink";
        v.lllllllll[v.lIIIIIIIlI[12]] = "Drink";
        v.lllllllll[v.lIIIIIIIlI[48]] = "Shark";
        v.lllllllll[v.lIIIIIIIlI[49]] = "Shark";
        v.lllllllll[v.lIIIIIIIlI[50]] = "Eat";
        v.lllllllll[v.lIIIIIIIlI[51]] = "Nav to start";
        v.lllllllll[v.lIIIIIIIlI[47]] = "Ava";
        v.lllllllll[v.lIIIIIIIlI[54]] = "Bookcase";
        v.lllllllll[v.lIIIIIIIlI[55]] = "Search";
        v.lllllllll[v.lIIIIIIIlI[57]] = "Bookcase";
        v.lllllllll[v.lIIIIIIIlI[58]] = "Search";
        v.lllllllll[v.lIIIIIIIlI[59]] = "Wear";
        v.lllllllll[v.lIIIIIIIlI[64]] = "Nav to charter";
        v.lllllllll[v.lIIIIIIIlI[65]] = "Trader Crewmember";
        v.lllllllll[v.lIIIIIIIlI[10]] = "Trade";
        v.lllllllll[v.lIIIIIIIlI[66]] = "Break";
        v.lllllllll[v.lIIIIIIIlI[67]] = "Nav to ecto";
        v.lllllllll[v.lIIIIIIIlI[14]] = "Bones";
        v.lllllllll[v.lIIIIIIIlI[68]] = "Staircase";
        v.lllllllll[v.lIIIIIIIlI[69]] = "Climb-up";
        v.lllllllll[v.lIIIIIIIlI[70]] = "Loader";
        v.lllllllll[v.lIIIIIIIlI[71]] = "Bones";
        v.lllllllll[v.lIIIIIIIlI[22]] = "Bones";
        v.lllllllll[v.lIIIIIIIlI[72]] = "Loader";
        v.lllllllll[v.lIIIIIIIlI[75]] = "Bones";
        v.lllllllll[v.lIIIIIIIlI[76]] = "Staircase";
        v.lllllllll[v.lIIIIIIIlI[77]] = "Climb-down";
        v.lllllllll[v.lIIIIIIIlI[78]] = "Bonemeal";
        v.lllllllll[v.lIIIIIIIlI[79]] = "Ectofuntus";
        v.lllllllll[v.lIIIIIIIlI[80]] = "Worship";
        v.lllllllll[v.lIIIIIIIlI[81]] = "Bonemeal";
        v.lllllllll[v.lIIIIIIIlI[82]] = "Ghost disciple";
        v.lllllllll[v.lIIIIIIIlI[15]] = "Malcolm";
        v.lllllllll[v.lIIIIIIIlI[84]] = "Alice";
        v.lllllllll[v.lIIIIIIIlI[85]] = "Malcolm";
        v.lllllllll[v.lIIIIIIIlI[86]] = "Alice";
        v.lllllllll[v.lIIIIIIIlI[87]] = "Malcolm";
        v.lllllllll[v.lIIIIIIIlI[88]] = "Alice";
        v.lllllllll[v.lIIIIIIIlI[93]] = "Nav to crone";
        v.lllllllll[v.lIIIIIIIlI[94]] = "Old crone";
        v.lllllllll[v.lIIIIIIIlI[96]] = "Malcolm";
        v.lllllllll[v.lIIIIIIIlI[98]] = "Malcolm";
        v.lllllllll[v.lIIIIIIIlI[6]] = "Malcolm";
        v.lllllllll[v.lIIIIIIIlI[101]] = "Undead chicken";
        v.lllllllll[v.lIIIIIIIlI[102]] = "Iron bar";
        v.lllllllll[v.lIIIIIIIlI[104]] = "Iron bar";
        v.lllllllll[v.lIIIIIIIlI[107]] = "Witch";
        v.lllllllll[v.lIIIIIIIlI[3]] = "Witch";
        v.lllllllll[v.lIIIIIIIlI[109]] = "Bar magnet";
        v.lllllllll[v.lIIIIIIIlI[113]] = "Nav to mine";
        v.lllllllll[v.lIIIIIIIlI[114]] = "Hammer";
        v.lllllllll[v.lIIIIIIIlI[115]] = "Selected iron";
        v.lllllllll[v.lIIIIIIIlI[89]] = "Bar magnet";
        v.lllllllll[v.lIIIIIIIlI[119]] = "Undead tree";
        v.lllllllll[v.lIIIIIIIlI[120]] = "Chop";
        v.lllllllll[v.lIIIIIIIlI[90]] = "Wear";
        v.lllllllll[v.lIIIIIIIlI[125]] = "Nav to npc";
        v.lllllllll[v.lIIIIIIIlI[126]] = "Turael";
        v.lllllllll[v.lIIIIIIIlI[95]] = "Turael";
        v.lllllllll[v.lIIIIIIIlI[128]] = "Undead twigs";
        v.lllllllll[v.lIIIIIIIlI[129]] = "Undead tree";
        v.lllllllll[v.lIIIIIIIlI[130]] = "Chop";
        v.lllllllll[v.lIIIIIIIlI[97]] = "Undead twigs";
        v.lllllllll[v.lIIIIIIIlI[134]] = "Research notes";
        v.lllllllll[v.lIIIIIIIlI[135]] = "Translate";
        v.lllllllll[v.lIIIIIIIlI[138]] = "A pattern";
        v.lllllllll[v.lIIIIIIIlI[139]] = "A pattern";
        v.lllllllll[v.lIIIIIIIlI[140]] = "Hard leather";
        v.lllllllll[v.lIIIIIIIlI[142]] = "Bookcase";
        v.lllllllll[v.lIIIIIIIlI[143]] = "Search";
        v.lllllllll[v.lIIIIIIIlI[144]] = "Nav to start";
        v.lllllllll[v.lIIIIIIIlI[145]] = "Ava";
        v.lllllllll[v.lIIIIIIIlI[99]] = "Bookcase";
        v.lllllllll[v.lIIIIIIIlI[146]] = "Search";
        v.lllllllll[v.lIIIIIIIlI[159]] = v.llIllIIlllIl("", "rLXtq");
        v.lllllllll[v.lIIIIIIIlI[160]] = "Animal Magnetism";
        v.lllllllll[v.lIIIIIIIlI[161]] = "ring of wealth (";
        v.lllllllll[v.lIIIIIIIlI[162]] = "Drop";
        v.lllllllll[v.lIIIIIIIlI[173]] = "Yes.";
        v.lllllllll[v.lIIIIIIIlI[174]] = "I'm here about a quest.";
        v.lllllllll[v.lIIIIIIIlI[175]] = "Okay, you need it more than I do, I suppose.";
        v.lllllllll[v.lIIIIIIIlI[176]] = "Could I buy those chickens now, then?";
        v.lllllllll[v.lIIIIIIIlI[100]] = "Could I buy 2 chickens?";
        v.lllllllll[v.lIIIIIIIlI[177]] = "I'm here about a quest.";
        v.lllllllll[v.lIIIIIIIlI[178]] = "Hello, I'm here about those trees again.";
        v.lllllllll[v.lIIIIIIIlI[179]] = "I'd love one, thanks.";
        v.lllllllll[v.lIIIIIIIlI[180]] = v.llIllIIlllII("Rw3xbVJxh6s=", "HrhlH");
    }

    public static void aZ() {
        block115: {
            WorldPoint lIIlIlIllIIlI;
            Object lIIlIlIllIIll;
            block116: {
                block123: {
                    block118: {
                        block122: {
                            block121: {
                                block120: {
                                    block119: {
                                        block117: {
                                            if (v.llIllIllIIlI(bv ? 1 : 0)) {
                                                b.a(bx);
                                                if (v.llIllIllIIll(bx.size(), lIIIIIIIlI[0])) {
                                                    System.out.println(lllllllll[lIIIIIIIlI[1]]);
                                                    bv = lIIIIIIIlI[1];
                                                }
                                            }
                                            if (!v.llIllIllIlII(bv ? 1 : 0) || !v.llIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[2])) break block115;
                                            if (v.llIllIllIIll(e.j(lIIIIIIIlI[3]), lIIIIIIIlI[4])) {
                                                ds = lllllllll[lIIIIIIIlI[0]];
                                                N.cv();
                                            }
                                            if (v.llIllIllIlIl(e.j(lIIIIIIIlI[3]), lIIIIIIIlI[4]) && (!v.llIllIllIllI(e.j(lIIIIIIIlI[5]), lIIIIIIIlI[6]) || v.llIllIllIIll(e.j(lIIIIIIIlI[7]), lIIIIIIIlI[8]))) {
                                                ds = lllllllll[lIIIIIIIlI[9]];
                                                G.bI();
                                            }
                                            if (v.llIllIllIlIl(e.j(lIIIIIIIlI[3]), lIIIIIIIlI[4]) && v.llIllIllIllI(e.j(lIIIIIIIlI[5]), lIIIIIIIlI[6]) && v.llIllIllIllI(e.j(lIIIIIIIlI[7]), lIIIIIIIlI[8]) && v.llIllIllIIll(e.j(lIIIIIIIlI[10]), lIIIIIIIlI[11])) {
                                                ds = lllllllll[lIIIIIIIlI[11]];
                                                U.de();
                                            }
                                            if (v.llIllIllIlIl(e.j(lIIIIIIIlI[3]), lIIIIIIIlI[4]) && v.llIllIllIllI(e.j(lIIIIIIIlI[5]), lIIIIIIIlI[6]) && v.llIllIllIllI(e.j(lIIIIIIIlI[7]), lIIIIIIIlI[8]) && v.llIllIllIlIl(e.j(lIIIIIIIlI[10]), lIIIIIIIlI[11]) && v.llIllIllIIll(Skills.getLevel((Skill)Skill.CRAFTING), lIIIIIIIlI[12])) {
                                                ds = lllllllll[lIIIIIIIlI[13]];
                                                an.el();
                                            }
                                            if (v.llIllIllIlIl(e.j(lIIIIIIIlI[3]), lIIIIIIIlI[4]) && v.llIllIllIllI(e.j(lIIIIIIIlI[5]), lIIIIIIIlI[6]) && v.llIllIllIllI(e.j(lIIIIIIIlI[7]), lIIIIIIIlI[8]) && v.llIllIllIlIl(e.j(lIIIIIIIlI[10]), lIIIIIIIlI[11]) && v.llIllIllIllI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIIIIIlI[12]) && v.llIllIllIIll(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIIIIIlI[14])) {
                                                ds = lllllllll[lIIIIIIIlI[8]];
                                                ar.eP();
                                            }
                                            if (v.llIllIllIlIl(e.j(lIIIIIIIlI[3]), lIIIIIIIlI[4]) && v.llIllIllIllI(e.j(lIIIIIIIlI[5]), lIIIIIIIlI[6]) && v.llIllIllIllI(e.j(lIIIIIIIlI[7]), lIIIIIIIlI[8]) && v.llIllIllIlIl(e.j(lIIIIIIIlI[10]), lIIIIIIIlI[11]) && v.llIllIllIllI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIIIIIlI[12]) && v.llIllIllIllI(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIIIIIlI[14]) && v.llIllIllIIll(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIIlI[15])) {
                                                ds = lllllllll[lIIIIIIIlI[16]];
                                                if (v.llIllIllIIll(da, lIIIIIIIlI[0])) {
                                                    o.cJ = lIIIIIIIlI[1];
                                                    da += lIIIIIIIlI[0];
                                                }
                                                n.aA();
                                            }
                                            if (v.llIllIllIlIl(e.j(lIIIIIIIlI[3]), lIIIIIIIlI[4]) && v.llIllIllIllI(e.j(lIIIIIIIlI[5]), lIIIIIIIlI[6]) && v.llIllIllIllI(e.j(lIIIIIIIlI[7]), lIIIIIIIlI[8]) && v.llIllIllIlIl(e.j(lIIIIIIIlI[10]), lIIIIIIIlI[11]) && v.llIllIllIllI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIIIIIlI[12]) && v.llIllIllIllI(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIIIIIlI[14]) && v.llIllIllIllI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIIlI[15])) {
                                                if (!v.llIllIllIllI(e.j(lIIIIIIIlI[17]), lIIIIIIIlI[18]) || v.llIllIllIIll(Skills.getLevel((Skill)Skill.HUNTER), lIIIIIIIlI[19])) {
                                                    ds = lllllllll[lIIIIIIIlI[20]];
                                                    M.cs();
                                                }
                                                if (v.llIllIllIllI(e.j(lIIIIIIIlI[17]), lIIIIIIIlI[18]) && v.llIllIllIllI(Skills.getLevel((Skill)Skill.HUNTER), lIIIIIIIlI[19]) && v.llIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIIIIIlI[6])) {
                                                    ds = lllllllll[lIIIIIIIlI[21]];
                                                    I.cb();
                                                }
                                                if (v.llIllIllIllI(e.j(lIIIIIIIlI[17]), lIIIIIIIlI[18]) && v.llIllIllIllI(Skills.getLevel((Skill)Skill.HUNTER), lIIIIIIIlI[19]) && v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIIIIIlI[6]) && v.llIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIIIIIIlI[22])) {
                                                    ds = lllllllll[lIIIIIIIlI[19]];
                                                    u.aX();
                                                }
                                                if (v.llIllIllIllI(e.j(lIIIIIIIlI[17]), lIIIIIIIlI[18]) && v.llIllIllIllI(Skills.getLevel((Skill)Skill.HUNTER), lIIIIIIIlI[19]) && v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIIIIIlI[6]) && v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIIIIIIlI[22]) && v.llIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIIIIIlI[19])) {
                                                    String[] stringArray = new String[lIIIIIIIlI[0]];
                                                    stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[4]];
                                                    if (v.llIllIllIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        ds = lllllllll[lIIIIIIIlI[23]];
                                                        w.bc();
                                                    }
                                                }
                                                w.bd();
                                            }
                                            if (!v.llIllIllIlII(v.an() ? 1 : 0) || !v.llIllIllIlII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId())) || !v.llIllIllIllI(e.j(lIIIIIIIlI[17]), lIIIIIIIlI[18]) || !v.llIllIllIllI(Skills.getLevel((Skill)Skill.HUNTER), lIIIIIIIlI[19]) || !v.llIllIllIllI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIIlI[15]) || !v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIIIIIlI[6]) || !v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIIIIIIlI[22]) || !v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIIIIIlI[19])) break block116;
                                            String[] stringArray = new String[lIIIIIIIlI[0]];
                                            stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[24]];
                                            if (!v.llIllIllIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) break block116;
                                            ds = lllllllll[lIIIIIIIlI[25]];
                                            lIIlIlIllIIll = BankLocation.getNearest();
                                            if (v.llIllIllIlll(lIIlIlIllIIll) && v.llIllIllIlII(lIIlIlIllIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderGWD.c = lllllllll[lIIIIIIIlI[26]];
                                                a.a((BankLocation)lIIlIlIllIIll);
                                            }
                                            if (!v.llIllIllIlll(lIIlIlIllIIll) || !v.llIllIllIIlI(lIIlIlIllIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block116;
                                            if (v.llIllIllIlII(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIIIlI[27]);

                                            }
                                            if (!v.llIllIllIIlI(Bank.isOpen() ? 1 : 0)) break block116;
                                            AccBuilderGWD.c = lllllllll[lIIIIIIIlI[28]];
                                            if (v.llIllIlllIII(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIIIIIIIlI[13]);

                                            }
                                            if (v.llIllIlllIII(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIIIIIIIlI[9]);

                                            }
                                            int[] nArray = new int[lIIIIIIIlI[0]];
                                            nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[29];
                                            if (!v.llIllIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block117;
                                            int[] nArray2 = new int[lIIIIIIIlI[0]];
                                            nArray2[v.lIIIIIIIlI[1]] = lIIIIIIIlI[29];
                                            if (!v.llIllIllIllI(Bank.getFirst((int[])nArray2).getQuantity(), lIIIIIIIlI[8])) break block118;
                                        }
                                        int[] nArray = new int[lIIIIIIIlI[0]];
                                        nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[30];
                                        if (!v.llIllIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block119;
                                        int[] nArray3 = new int[lIIIIIIIlI[0]];
                                        nArray3[v.lIIIIIIIlI[1]] = lIIIIIIIlI[30];
                                        if (!v.llIllIllIllI(Bank.getFirst((int[])nArray3).getQuantity(), lIIIIIIIlI[16])) break block118;
                                    }
                                    int[] nArray = new int[lIIIIIIIlI[0]];
                                    nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[31];
                                    if (!v.llIllIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block120;
                                    int[] nArray4 = new int[lIIIIIIIlI[0]];
                                    nArray4[v.lIIIIIIIlI[1]] = lIIIIIIIlI[31];
                                    if (!v.llIllIllIllI(Bank.getFirst((int[])nArray4).getQuantity(), lIIIIIIIlI[28])) break block118;
                                }
                                int[] nArray = new int[lIIIIIIIlI[0]];
                                nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[32];
                                if (!v.llIllIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block121;
                                int[] nArray5 = new int[lIIIIIIIlI[0]];
                                nArray5[v.lIIIIIIIlI[1]] = lIIIIIIIlI[32];
                                if (!v.llIllIllIllI(Bank.getFirst((int[])nArray5).getQuantity(), lIIIIIIIlI[13])) break block118;
                            }
                            int[] nArray = new int[lIIIIIIIlI[0]];
                            nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[33];
                            if (!v.llIllIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block122;
                            int[] nArray6 = new int[lIIIIIIIlI[0]];
                            nArray6[v.lIIIIIIIlI[1]] = lIIIIIIIlI[33];
                            if (!v.llIllIllIllI(Bank.getFirst((int[])nArray6).getQuantity(), lIIIIIIIlI[8])) break block118;
                        }
                        int[] nArray = new int[lIIIIIIIlI[0]];
                        nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[34];
                        if (!v.llIllIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block123;
                        int[] nArray7 = new int[lIIIIIIIlI[0]];
                        nArray7[v.lIIIIIIIlI[1]] = lIIIIIIIlI[34];
                        if (!v.llIllIllIIll(Bank.getFirst((int[])nArray7).getQuantity(), lIIIIIIIlI[13])) break block123;
                    }
                    v.Q();
                    System.out.println(lllllllll[lIIIIIIIlI[35]]);
                    bv = lIIIIIIIlI[0];
                    return;
                }
                int[] nArray = new int[lIIIIIIIlI[23]];
                nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[36];
                nArray[v.lIIIIIIIlI[0]] = lIIIIIIIlI[37];
                nArray[v.lIIIIIIIlI[9]] = lIIIIIIIlI[33];
                nArray[v.lIIIIIIIlI[11]] = lIIIIIIIlI[38];
                nArray[v.lIIIIIIIlI[13]] = lIIIIIIIlI[32];
                nArray[v.lIIIIIIIlI[8]] = lIIIIIIIlI[34];
                nArray[v.lIIIIIIIlI[16]] = lIIIIIIIlI[39];
                nArray[v.lIIIIIIIlI[20]] = lIIIIIIIlI[40];
                nArray[v.lIIIIIIIlI[21]] = lIIIIIIIlI[41];
                nArray[v.lIIIIIIIlI[19]] = lIIIIIIIlI[30];
                nArray[v.lIIIIIIIlI[4]] = lIIIIIIIlI[31];
                if (v.llIllIllIlII(e.d(nArray) ? 1 : 0)) {
                    v.Q();
                    System.out.println(lllllllll[lIIIIIIIlI[42]]);
                    bv = lIIIIIIIlI[0];
                    return;
                }
                int[] nArray8 = new int[lIIIIIIIlI[23]];
                nArray8[v.lIIIIIIIlI[1]] = lIIIIIIIlI[36];
                nArray8[v.lIIIIIIIlI[0]] = lIIIIIIIlI[37];
                nArray8[v.lIIIIIIIlI[9]] = lIIIIIIIlI[33];
                nArray8[v.lIIIIIIIlI[11]] = lIIIIIIIlI[38];
                nArray8[v.lIIIIIIIlI[13]] = lIIIIIIIlI[32];
                nArray8[v.lIIIIIIIlI[8]] = lIIIIIIIlI[34];
                nArray8[v.lIIIIIIIlI[16]] = lIIIIIIIlI[39];
                nArray8[v.lIIIIIIIlI[20]] = lIIIIIIIlI[40];
                nArray8[v.lIIIIIIIlI[21]] = lIIIIIIIlI[41];
                nArray8[v.lIIIIIIIlI[19]] = lIIIIIIIlI[30];
                nArray8[v.lIIIIIIIlI[4]] = lIIIIIIIlI[31];
                if (v.llIllIllIIlI(e.d(nArray8) ? 1 : 0)) {
                    a.a(lIIIIIIIlI[34], lIIIIIIIlI[13]);
                    a.a(lIIIIIIIlI[37], lIIIIIIIlI[0]);
                    a.a(lIIIIIIIlI[43], lIIIIIIIlI[0]);
                    a.a(lIIIIIIIlI[32], lIIIIIIIlI[13]);
                    a.a(lIIIIIIIlI[29], lIIIIIIIlI[13]);
                    a.a(lIIIIIIIlI[40], lIIIIIIIlI[0]);
                    a.a(lIIIIIIIlI[41], lIIIIIIIlI[0]);
                    a.a(lIIIIIIIlI[36], lIIIIIIIlI[4]);
                    a.a(lIIIIIIIlI[30], lIIIIIIIlI[4]);
                    a.a(lIIIIIIIlI[31], lIIIIIIIlI[28]);
                    a.a(lIIIIIIIlI[44], lIIIIIIIlI[0]);
                    a.a(lIIIIIIIlI[45], lIIIIIIIlI[27]);
                }
            }
            if (v.llIllIllIIlI(Inventory.contains((int[])f.bc) ? 1 : 0) && v.llIllIllIIll(Movement.getRunEnergy(), lIIIIIIIlI[15])) {
                Inventory.getFirst((int[])f.bc).interact(lllllllll[lIIIIIIIlI[46]]);
                Time.sleepTicks((int)lIIIIIIIlI[0]);

            }
            if (v.llIllIllIIlI(Inventory.contains((int[])f.aZ) ? 1 : 0) && v.llIllIllIIll(Prayers.getPoints(), lIIIIIIIlI[47])) {
                Inventory.getFirst((int[])f.aZ).interact(lllllllll[lIIIIIIIlI[12]]);
            }
            if (v.llIllIlllIIl(v.llIllIllIIIl(e.w(), 60.0))) {
                String[] stringArray = new String[lIIIIIIIlI[0]];
                stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[48]];
                if (v.llIllIllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIIIIIIlI[0]];
                    stringArray2[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[49]];
                    Inventory.getFirst((String[])stringArray2).interact(lllllllll[lIIIIIIIlI[50]]);
                    Time.sleepTicks((int)lIIIIIIIlI[9]);

                }
            }
            if (v.llIllIllIIlI(v.an() ? 1 : 0) && v.llIllIllIlII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()))) {
                if (v.llIllIllIlII(dn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIIIIlI[21])) {
                    AccBuilderGWD.c = lllllllll[lIIIIIIIlI[51]];
                    if (v.llIllIllIIlI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)dg);

                    Time.sleepTicks((int)lIIIIIIIlI[0]);

                }
                if (v.llIllIllIIlI(dn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIllIlllIll(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIIIIlI[21])) {
                    dk = lIIIIIIIlI[1];
                    g.a(lllllllll[lIIIIIIIlI[47]], cG);
                }
                if (v.llIllIllIIlI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIIIIIIlI[52], lIIIIIIIlI[53], lIIIIIIIlI[1])) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIIIIlI[0]];
                    stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[54]];
                    TileObjects.getNearest((String[])stringArray).interact(lllllllll[lIIIIIIIlI[55]]);
                    Time.sleepTicks((int)lIIIIIIIlI[9]);

                }
                if (v.llIllIllIIlI((lIIlIlIllIIll = new WorldArea(lIIIIIIIlI[52], lIIIIIIIlI[56], lIIIIIIIlI[16], lIIIIIIIlI[4], lIIIIIIIlI[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIIIIlI[0]];
                    stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[57]];
                    TileObjects.getNearest((String[])stringArray).interact(lllllllll[lIIIIIIIlI[58]]);
                    Time.sleepTicks((int)lIIIIIIIlI[9]);

                }
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[4])) {
                int[] nArray = new int[lIIIIIIIlI[0]];
                nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[44];
                if (v.llIllIllIlII(Equipment.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray9 = new int[lIIIIIIIlI[0]];
                    nArray9[v.lIIIIIIIlI[1]] = lIIIIIIIlI[44];
                    Inventory.getFirst((int[])nArray9).interact(lllllllll[lIIIIIIIlI[59]]);
                }
                int[] nArray10 = new int[lIIIIIIIlI[0]];
                nArray10[v.lIIIIIIIlI[1]] = lIIIIIIIlI[60];
                if (v.llIllIllIlII(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                    block114: {
                        lIIlIlIllIIll = new WorldPoint(lIIIIIIIlI[61], lIIIIIIIlI[62], lIIIIIIIlI[1]);
                        int[] nArray11 = new int[lIIIIIIIlI[0]];
                        nArray11[v.lIIIIIIIlI[1]] = lIIIIIIIlI[63];
                        if (v.llIllIllIlII(Inventory.contains((int[])nArray11) ? 1 : 0) && v.llIllIlllIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIlIllIIll), lIIIIIIIlI[48])) {
                            if (v.llIllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dq), lIIIIIIIlI[8])) {
                                AccBuilderGWD.c = lllllllll[lIIIIIIIlI[64]];
                                Movement.walkTo((WorldPoint)dq);

                                Time.sleepTicks((int)lIIIIIIIlI[0]);

                            }
                            if (v.llIllIlllIll(Players.getLocal().getWorldLocation().distanceTo(dq), lIIIIIIIlI[8])) {
                                if (v.llIllIllIlII(Shop.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIIIIIIIlI[0]];
                                    stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[65]];
                                    NPCs.getNearest((String[])stringArray).interact(lllllllll[lIIIIIIIlI[10]]);
                                    Time.sleepTicks((int)lIIIIIIIlI[9]);

                                }
                                if (v.llIllIllIIlI(Shop.isOpen() ? 1 : 0)) {
                                    Shop.buyFive((int)lIIIIIIIlI[63]);
                                    Time.sleepTicks((int)lIIIIIIIlI[11]);

                                }
                            }
                        }
                        int[] nArray12 = new int[lIIIIIIIlI[0]];
                        nArray12[v.lIIIIIIIlI[1]] = lIIIIIIIlI[63];
                        if (v.llIllIllIIlI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                            if (v.llIllIllIlII(do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIllIllIlII(dp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                int[] nArray13 = new int[lIIIIIIIlI[0]];
                                nArray13[v.lIIIIIIIlI[1]] = lIIIIIIIlI[31];
                                if (v.llIllIllIIlI(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                    int[] nArray14 = new int[lIIIIIIIlI[0]];
                                    nArray14[v.lIIIIIIIlI[1]] = lIIIIIIIlI[31];
                                    Inventory.getFirst((int[])nArray14).interact(lllllllll[lIIIIIIIlI[66]]);
                                    Time.sleepTicks((int)lIIIIIIIlI[20]);

                                }
                            }
                            if (!v.llIllIllIlII(do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || v.llIllIllIIlI(dp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                lIIlIlIllIIlI = new WorldPoint(lIIIIIIIlI[61], lIIIIIIIlI[62], lIIIIIIIlI[1]);
                                if (v.llIllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(lIIlIlIllIIlI), lIIIIIIIlI[8]) && v.llIllIllIlII(Players.getLocal().getWorldLocation().getPlane())) {
                                    AccBuilderGWD.c = lllllllll[lIIIIIIIlI[67]];
                                    Movement.walkTo((WorldPoint)lIIlIlIllIIlI);

                                    Time.sleepTicks((int)lIIIIIIIlI[0]);

                                }
                                String[] stringArray = new String[lIIIIIIIlI[0]];
                                stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[14]];
                                if (v.llIllIllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                    if (v.llIllIlllIll(Players.getLocal().getWorldLocation().distanceTo(lIIlIlIllIIlI), lIIIIIIIlI[8]) && v.llIllIllIlII(Players.getLocal().getWorldLocation().getPlane())) {
                                        String[] stringArray3 = new String[lIIIIIIIlI[0]];
                                        stringArray3[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[68]];
                                        TileObjects.getNearest((String[])stringArray3).interact(lllllllll[lIIIIIIIlI[69]]);
                                        Time.sleepTicks((int)lIIIIIIIlI[13]);

                                    }
                                    String[] stringArray4 = new String[lIIIIIIIlI[0]];
                                    stringArray4[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[70]];
                                    if (v.llIllIllIlll(TileObjects.getNearest((String[])stringArray4))) {
                                        String[] stringArray5 = new String[lIIIIIIIlI[0]];
                                        stringArray5[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[71]];
                                        if (v.llIllIllIIlI(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                                            String[] stringArray6 = new String[lIIIIIIIlI[0]];
                                            stringArray6[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[22]];
                                            String[] stringArray7 = new String[lIIIIIIIlI[0]];
                                            stringArray7[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[72]];
                                            Inventory.getFirst((String[])stringArray6).useOn(TileObjects.getNearest((String[])stringArray7));
                                            Time.sleep((long)e.c(lIIIIIIIlI[73], lIIIIIIIlI[74]));

                                        }
                                    }
                                }
                                String[] stringArray8 = new String[lIIIIIIIlI[0]];
                                stringArray8[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[75]];
                                if (v.llIllIllIlII(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                                    if (v.llIllIllIlIl(Players.getLocal().getWorldLocation().getPlane(), lIIIIIIIlI[0])) {
                                        String[] stringArray9 = new String[lIIIIIIIlI[0]];
                                        stringArray9[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[76]];
                                        TileObjects.getNearest((String[])stringArray9).interact(lllllllll[lIIIIIIIlI[77]]);
                                        Time.sleepTicks((int)lIIIIIIIlI[8]);

                                    }
                                    if (v.llIllIllIlII(Players.getLocal().getWorldLocation().getPlane())) {
                                        do {
                                            String[] stringArray10 = new String[lIIIIIIIlI[0]];
                                            stringArray10[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[78]];
                                            if (!v.llIllIllIIlI(Inventory.contains((String[])stringArray10) ? 1 : 0)) break block114;
                                            String[] stringArray11 = new String[lIIIIIIIlI[0]];
                                            stringArray11[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[79]];
                                            TileObjects.getNearest((String[])stringArray11).interact(lllllllll[lIIIIIIIlI[80]]);
                                            Time.sleepTicks((int)lIIIIIIIlI[9]);

                                        } while (null == null);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    int[] nArray15 = new int[lIIIIIIIlI[0]];
                    nArray15[v.lIIIIIIIlI[1]] = lIIIIIIIlI[32];
                    if (v.llIllIllIlII(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIIIIIlI[0]];
                        stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[81]];
                        if (v.llIllIllIlII(Inventory.contains((String[])stringArray) ? 1 : 0) && v.llIllIlllIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIlIllIIll), lIIIIIIIlI[48])) {
                            if (v.llIllIllIlII(Dialog.isOpen() ? 1 : 0)) {
                                g.a(lllllllll[lIIIIIIIlI[82]], cG);
                                Time.sleepTicks((int)lIIIIIIIlI[0]);

                            }
                            g.a(cG);
                        }
                    }
                }
                int[] nArray16 = new int[lIIIIIIIlI[0]];
                nArray16[v.lIIIIIIIlI[1]] = lIIIIIIIlI[60];
                if (v.llIllIllIIlI(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIIIIIIlI[9]];
                    nArray17[v.lIIIIIIIlI[1]] = lIIIIIIIlI[83];
                    nArray17[v.lIIIIIIIlI[0]] = lIIIIIIIlI[29];
                    if (v.llIllIllIIlI(Inventory.contains((int[])nArray17) ? 1 : 0)) {
                        int[] nArray18 = new int[lIIIIIIIlI[9]];
                        nArray18[v.lIIIIIIIlI[1]] = lIIIIIIIlI[83];
                        nArray18[v.lIIIIIIIlI[0]] = lIIIIIIIlI[29];
                        Inventory.getAll((int[])nArray18).stream().forEach(item -> item.interact(lllllllll[lIIIIIIIlI[162]]));
                    }
                    if (v.llIllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dr), lIIIIIIIlI[20])) {
                        Movement.walkTo((WorldPoint)dr);

                        Time.sleepTicks((int)lIIIIIIIlI[0]);

                    }
                    if (v.llIllIlllIll(Players.getLocal().getWorldLocation().distanceTo(dr), lIIIIIIIlI[20])) {
                        g.a(lllllllll[lIIIIIIIlI[15]], cG);
                    }
                }
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[48])) {
                g.a(lllllllll[lIIIIIIIlI[84]], cG);
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[64])) {
                g.a(lllllllll[lIIIIIIIlI[85]], cG);
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[22])) {
                g.a(lllllllll[lIIIIIIIlI[86]], cG);
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[15])) {
                g.a(lllllllll[lIIIIIIIlI[87]], cG);
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[6])) {
                g.a(lllllllll[lIIIIIIIlI[88]], cG);
            }
            if (!v.llIllIllllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[89]) || v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[90])) {
                lIIlIlIllIIll = new WorldPoint(lIIIIIIIlI[91], lIIIIIIIlI[92], lIIIIIIIlI[1]);
                if (v.llIllIlllIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIlIllIIll), lIIIIIIIlI[11])) {
                    AccBuilderGWD.c = lllllllll[lIIIIIIIlI[93]];
                    Movement.walkTo((WorldPoint)lIIlIlIllIIll);

                    Time.sleepTicks((int)lIIIIIIIlI[0]);

                }
                if (v.llIllIlllIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIlIllIIll), lIIIIIIIlI[11])) {
                    g.a(lllllllll[lIIIIIIIlI[94]], cG);
                }
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[95])) {
                if (v.llIllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dr), lIIIIIIIlI[20])) {
                    Movement.walkTo((WorldPoint)dr);

                    Time.sleepTicks((int)lIIIIIIIlI[0]);

                }
                if (v.llIllIlllIll(Players.getLocal().getWorldLocation().distanceTo(dr), lIIIIIIIlI[20])) {
                    g.a(lllllllll[lIIIIIIIlI[96]], cG);
                }
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[97])) {
                g.a(lllllllll[lIIIIIIIlI[98]], cG);
            }
            if (!v.llIllIllllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[99]) || v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[100])) {
                g.a(lllllllll[lIIIIIIIlI[6]], cG);
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[100])) {
                String[] stringArray = new String[lIIIIIIIlI[0]];
                stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[101]];
                if (v.llIllIllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray12 = new String[lIIIIIIIlI[0]];
                    stringArray12[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[102]];
                    if (v.llIllIllIlII(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                        lIIlIlIllIIll = new HashMap();
                        ((HashMap)lIIlIlIllIIll).put(lIIIIIIIlI[33], lIIIIIIIlI[8]);

                        ((HashMap)lIIlIlIllIIll).put(lIIIIIIIlI[38], lIIIIIIIlI[0]);

                        ((HashMap)lIIlIlIllIIll).put(lIIIIIIIlI[39], lIIIIIIIlI[0]);

                        ((HashMap)lIIlIlIllIIll).put(lIIIIIIIlI[103], lIIIIIIIlI[0]);

                        e.a((HashMap<Integer, Integer>)lIIlIlIllIIll, lIIIIIIIlI[1], lIIIIIIIlI[1]);
                    }
                    String[] stringArray13 = new String[lIIIIIIIlI[0]];
                    stringArray13[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[104]];
                    if (v.llIllIllIIlI(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        v.ba();
                    }
                }
            }
            if (!v.llIllIllllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[105]) || v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[106])) {
                String[] stringArray = new String[lIIIIIIIlI[0]];
                stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[107]];
                lIIlIlIllIIll = NPCs.getNearest((String[])stringArray);
                if (v.llIllIllIlll(lIIlIlIllIIll)) {
                    if (v.llIllIllIIlI(Reachable.isInteractable((Locatable)lIIlIlIllIIll) ? 1 : 0)) {
                        g.a(lllllllll[lIIIIIIIlI[3]], cG);
                    }
                    if (v.llIllIllIlII(Reachable.isInteractable((Locatable)lIIlIlIllIIll) ? 1 : 0)) {
                        Movement.walkTo((Locatable)lIIlIlIllIIll);

                        Time.sleepTicks((int)lIIIIIIIlI[0]);

                    }
                }
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[108])) {
                String[] stringArray = new String[lIIIIIIIlI[0]];
                stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[109]];
                if (v.llIllIllIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    lIIlIlIllIIll = new WorldPoint(lIIIIIIIlI[110], lIIIIIIIlI[111], lIIIIIIIlI[1]);
                    lIIlIlIllIIlI = new WorldPoint(lIIIIIIIlI[110], lIIIIIIIlI[112], lIIIIIIIlI[1]);
                    if (v.llIllIllIlII(Players.getLocal().getWorldLocation().equals(lIIlIlIllIIll) ? 1 : 0) && v.llIllIllIlII(Players.getLocal().getWorldLocation().equals((Object)lIIlIlIllIIlI) ? 1 : 0)) {
                        AccBuilderGWD.c = lllllllll[lIIIIIIIlI[113]];
                        Movement.walkTo((WorldPoint)lIIlIlIllIIll);

                        Time.sleepTicks((int)lIIIIIIIlI[0]);

                    }
                    if (v.llIllIllIIlI(Players.getLocal().getWorldLocation().equals(lIIlIlIllIIll) ? 1 : 0) && v.llIllIllIlII(Players.getLocal().getWorldLocation().equals((Object)lIIlIlIllIIlI) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)lIIlIlIllIIlI);

                    }
                    if (v.llIllIllIIlI(Players.getLocal().getWorldLocation().equals((Object)lIIlIlIllIIlI) ? 1 : 0)) {
                        String[] stringArray14 = new String[lIIIIIIIlI[0]];
                        stringArray14[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[114]];
                        String[] stringArray15 = new String[lIIIIIIIlI[0]];
                        stringArray15[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[115]];
                        Inventory.getFirst((String[])stringArray14).useOn(Inventory.getFirst((String[])stringArray15));
                        Time.sleepTicks((int)lIIIIIIIlI[11]);

                    }
                }
                String[] stringArray16 = new String[lIIIIIIIlI[0]];
                stringArray16[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[89]];
                if (v.llIllIllIIlI(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                    v.ba();
                }
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[116])) {
                lIIlIlIllIIll = new WorldPoint(lIIIIIIIlI[117], lIIIIIIIlI[118], lIIIIIIIlI[1]);
                if (v.llIllIllIlII(Players.getLocal().getWorldLocation().equals(lIIlIlIllIIll) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)lIIlIlIllIIll);

                    Time.sleepTicks((int)lIIIIIIIlI[0]);

                }
                if (v.llIllIllIIlI(Players.getLocal().getWorldLocation().equals(lIIlIlIllIIll) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIIIIlI[0]];
                    stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[119]];
                    NPCs.getNearest((String[])stringArray).interact(lllllllll[lIIIIIIIlI[120]]);
                    Time.sleepTicks((int)lIIIIIIIlI[0]);

                }
            }
            if (!v.llIllIllllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[121]) || v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[122])) {
                lIIlIlIllIIll = new WorldPoint(lIIIIIIIlI[123], lIIIIIIIlI[124], lIIIIIIIlI[1]);
                if (v.llIllIlllIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIlIllIIll), lIIIIIIIlI[9])) {
                    if (v.llIllIllIIlI(Inventory.contains((int[])f.aV) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.aV).interact(lllllllll[lIIIIIIIlI[90]]);
                    }
                    AccBuilderGWD.c = lllllllll[lIIIIIIIlI[125]];
                    Movement.walkTo((WorldPoint)lIIlIlIllIIll);

                    Time.sleepTicks((int)lIIIIIIIlI[0]);

                }
                if (v.llIllIlllIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIlIllIIll), lIIIIIIIlI[9])) {
                    String[] stringArray = new String[lIIIIIIIlI[0]];
                    stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[126]];
                    lIIlIlIllIIlI = NPCs.getNearest((String[])stringArray);
                    if (v.llIllIllIlll(lIIlIlIllIIlI)) {
                        if (v.llIllIllIIlI(Reachable.isInteractable((Locatable)lIIlIlIllIIlI) ? 1 : 0)) {
                            g.a(lllllllll[lIIIIIIIlI[95]], cG);
                        }
                        if (v.llIllIllIlII(Reachable.isInteractable((Locatable)lIIlIlIllIIlI) ? 1 : 0)) {
                            Movement.walkTo((Locatable)lIIlIlIllIIlI);

                            Time.sleepTicks((int)lIIIIIIIlI[0]);

                        }
                    }
                }
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[127])) {
                String[] stringArray = new String[lIIIIIIIlI[0]];
                stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[128]];
                if (v.llIllIllIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    lIIlIlIllIIll = new WorldPoint(lIIIIIIIlI[117], lIIIIIIIlI[118], lIIIIIIIlI[1]);
                    if (v.llIllIllIlII(Players.getLocal().getWorldLocation().equals(lIIlIlIllIIll) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)lIIlIlIllIIll);

                        Time.sleepTicks((int)lIIIIIIIlI[0]);

                    }
                    if (v.llIllIllIIlI(Players.getLocal().getWorldLocation().equals(lIIlIlIllIIll) ? 1 : 0)) {
                        String[] stringArray17 = new String[lIIIIIIIlI[0]];
                        stringArray17[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[129]];
                        NPCs.getNearest((String[])stringArray17).interact(lllllllll[lIIIIIIIlI[130]]);
                        Time.sleepTicks((int)lIIIIIIIlI[0]);

                    }
                }
                String[] stringArray18 = new String[lIIIIIIIlI[0]];
                stringArray18[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[97]];
                if (v.llIllIllIIlI(Inventory.contains((String[])stringArray18) ? 1 : 0)) {
                    v.ba();
                }
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[131])) {
                v.ba();
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[132])) {
                if (v.llIllIllIIlI(Widgets.get((int)lIIIIIIIlI[133]).isEmpty() ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIIIIlI[0]];
                    stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[134]];
                    Inventory.getFirst((String[])stringArray).interact(lllllllll[lIIIIIIIlI[135]]);
                    Time.sleepTicks((int)lIIIIIIIlI[13]);

                }
                if (v.llIllIllIlII(Widgets.get((int)lIIIIIIIlI[133]).isEmpty() ? 1 : 0)) {
                    Mouse.click((int)Widgets.get((int)lIIIIIIIlI[133], (int)lIIIIIIIlI[55]).getClickPoint().getX(), (int)Widgets.get((int)lIIIIIIIlI[133], (int)lIIIIIIIlI[55]).getClickPoint().getY(), (boolean)lIIIIIIIlI[0]);
                    Time.sleepTicks((int)lIIIIIIIlI[9]);

                    Mouse.click((int)Widgets.get((int)lIIIIIIIlI[133], (int)lIIIIIIIlI[65]).getClickPoint().getX(), (int)Widgets.get((int)lIIIIIIIlI[133], (int)lIIIIIIIlI[65]).getClickPoint().getY(), (boolean)lIIIIIIIlI[0]);
                    Time.sleepTicks((int)lIIIIIIIlI[9]);

                    Mouse.click((int)Widgets.get((int)lIIIIIIIlI[133], (int)lIIIIIIIlI[67]).getClickPoint().getX(), (int)Widgets.get((int)lIIIIIIIlI[133], (int)lIIIIIIIlI[67]).getClickPoint().getY(), (boolean)lIIIIIIIlI[0]);
                    Time.sleepTicks((int)lIIIIIIIlI[9]);

                    Mouse.click((int)Widgets.get((int)lIIIIIIIlI[133], (int)lIIIIIIIlI[22]).getClickPoint().getX(), (int)Widgets.get((int)lIIIIIIIlI[133], (int)lIIIIIIIlI[22]).getClickPoint().getY(), (boolean)lIIIIIIIlI[0]);
                    Time.sleepTicks((int)lIIIIIIIlI[9]);

                    Mouse.click((int)Widgets.get((int)lIIIIIIIlI[133], (int)lIIIIIIIlI[76]).getClickPoint().getX(), (int)Widgets.get((int)lIIIIIIIlI[133], (int)lIIIIIIIlI[76]).getClickPoint().getY(), (boolean)lIIIIIIIlI[0]);
                    Time.sleepTicks((int)lIIIIIIIlI[9]);

                    Mouse.click((int)Widgets.get((int)lIIIIIIIlI[133], (int)lIIIIIIIlI[79]).getClickPoint().getX(), (int)Widgets.get((int)lIIIIIIIlI[133], (int)lIIIIIIIlI[79]).getClickPoint().getY(), (boolean)lIIIIIIIlI[0]);
                    Time.sleepTicks((int)lIIIIIIIlI[8]);

                }
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[136])) {
                v.ba();
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[137])) {
                String[] stringArray = new String[lIIIIIIIlI[0]];
                stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[138]];
                if (v.llIllIllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray19 = new String[lIIIIIIIlI[0]];
                    stringArray19[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[139]];
                    String[] stringArray20 = new String[lIIIIIIIlI[0]];
                    stringArray20[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[140]];
                    Inventory.getFirst((String[])stringArray19).useOn(Inventory.getFirst((String[])stringArray20));
                    Time.sleepTicks((int)lIIIIIIIlI[9]);

                }
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[141])) {
                if (v.llIllIllIIll(dk, lIIIIIIIlI[0])) {
                    as.oV += lIIIIIIIlI[0];
                    as.u(AccBuilderGWD.m);
                    dk += lIIIIIIIlI[0];
                    as.oV = lIIIIIIIlI[1];
                    dl = lIIIIIIIlI[1];
                }
                v.ba();
            }
            g.a(cG);
        }
    }

    @Override
    public int af() {
        try {
            v.aZ();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-(0x2F ^ 0x52 ^ (0xE ^ 0x76)) >= 0) {
            return (0x15 ^ 0x70 ^ (0xF7 ^ 0xA2)) & (100 + 78 - 35 + 20 ^ 57 + 69 - 110 + 131 ^ -1);
        }
        return lIIIIIIIlI[100];
    }

    private static boolean llIllIlllIIl(int n2) {
        return n2 < 0;
    }

    private static boolean llIllIllIlll(Object object) {
        return object != null;
    }

    @Override
    public boolean ae() {
        return lIIIIIIIlI[1];
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (v.llIllIllIllI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[2])) {
            bl = lIIIIIIIlI[0];

            }
        } else {
            bl = lIIIIIIIlI[1];
        }
        return bl;
    }

    private static boolean llIllIlllIlI(int n2, int n3) {
        return n2 > n3;
    }

        return String.valueOf(lIIlIlIIIllII);
    }

    static {
        v.llIllIllIIII();
        v.llIllIlIllII();
        bx = new ArrayList<d>();
        dn = new WorldArea(lIIIIIIIlI[163], lIIIIIIIlI[56], lIIIIIIIlI[16], lIIIIIIIlI[4], lIIIIIIIlI[1]);
        do = new WorldArea(lIIIIIIIlI[164], lIIIIIIIlI[165], lIIIIIIIlI[166], lIIIIIIIlI[142], lIIIIIIIlI[1]);
        dp = new WorldArea(lIIIIIIIlI[164], lIIIIIIIlI[165], lIIIIIIIlI[166], lIIIIIIIlI[142], lIIIIIIIlI[0]);
        dg = new WorldPoint(lIIIIIIIlI[167], lIIIIIIIlI[168], lIIIIIIIlI[1]);
        dq = new WorldPoint(lIIIIIIIlI[169], lIIIIIIIlI[170], lIIIIIIIlI[1]);
        dr = new WorldPoint(lIIIIIIIlI[171], lIIIIIIIlI[172], lIIIIIIIlI[1]);
        String[] stringArray = new String[lIIIIIIIlI[21]];
        stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[173]];
        stringArray[v.lIIIIIIIlI[0]] = lllllllll[lIIIIIIIlI[174]];
        stringArray[v.lIIIIIIIlI[9]] = lllllllll[lIIIIIIIlI[175]];
        stringArray[v.lIIIIIIIlI[11]] = lllllllll[lIIIIIIIlI[176]];
        stringArray[v.lIIIIIIIlI[13]] = lllllllll[lIIIIIIIlI[100]];
        stringArray[v.lIIIIIIIlI[8]] = lllllllll[lIIIIIIIlI[177]];
        stringArray[v.lIIIIIIIlI[16]] = lllllllll[lIIIIIIIlI[178]];
        stringArray[v.lIIIIIIIlI[20]] = lllllllll[lIIIIIIIlI[179]];
        cG = stringArray;
        da = lIIIIIIIlI[1];
        ds = lllllllll[lIIIIIIIlI[180]];
    }

    private static boolean llIllIllIllI(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void lIIlIlIlIllIl;
        int[] nArray = new int[lIIIIIIIlI[20]];
        nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[36];
        nArray[v.lIIIIIIIlI[0]] = lIIIIIIIlI[37];
        nArray[v.lIIIIIIIlI[9]] = lIIIIIIIlI[34];
        nArray[v.lIIIIIIIlI[11]] = lIIIIIIIlI[40];
        nArray[v.lIIIIIIIlI[13]] = lIIIIIIIlI[41];
        nArray[v.lIIIIIIIlI[8]] = lIIIIIIIlI[30];
        nArray[v.lIIIIIIIlI[16]] = lIIIIIIIlI[31];
        int[] nArray2 = nArray;
        int lIIlIlIlIllII = lIIIIIIIlI[1];
        while (v.llIllIllIIll(lIIlIlIlIllII, ((void)lIIlIlIlIllIl).length)) {
            int[] nArray3 = new int[lIIIIIIIlI[0]];
            nArray3[v.lIIIIIIIlI[1]] = lIIlIlIlIllIl[lIIlIlIlIllII];
            if (v.llIllIllIlII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIIIIIIlI[1];
            }
            ++lIIlIlIlIllII;

            if (-1 != 1) continue;
            return ((0x6A ^ 0x43 ^ (0xBB ^ 0xA6)) & (0x21 ^ 0x42 ^ (0x43 ^ 0x14) ^ -1)) != 0;
        }
        return lIIIIIIIlI[0];
    }

    private static boolean llIllIllllII(int n2, int n3) {
        return n2 != n3;
    }
}

