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
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

import gg.squire.account.AccBuilderSotf;
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
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.HHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.JHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.NHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.OHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.VHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AFHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.ANHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AYHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.FHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.GHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.JHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.NHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.OHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.UHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.XHelper;

public class WHelper
implements ac {
    static  WorldPoint de;
    static  int di;
    static  WorldArea du;
    public static  List<d> bv;
    
    static  boolean dj;
    static  WorldArea dv;
    
    static  WorldArea dw;
    static  WorldPoint dx;
    static  WorldPoint dy;
    private static  String dz;
    
    private static  int cY;
    public static  boolean bt;

    private static boolean lIIllllllIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlllllIllll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlllllllIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIIIIIIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static void bg() {
        WorldArea worldArea = new WorldArea(lIllllIIll[52], lIllllIIll[56], lIllllIIll[16], lIllllIIll[4], lIllllIIll[1]);
        if (w.lIIlllllIllIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] stringArray = new String[lIllllIIll[0]];
            stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[142]];
            TileObjects.getNearest((String[])stringArray).interact(lIllllIIIl[lIllllIIll[143]]);
            Time.sleepTicks((int)lIllllIIll[9]);

        }
        if (w.lIIlllllIllll(du.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIIlllllllIlI(Players.getLocal().getWorldLocation().distanceTo(de), lIllllIIll[21])) {
            AccBuilderSotf.c = lIllllIIIl[lIllllIIll[144]];
            if (w.lIIlllllIllIl(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)de);

            Time.sleepTicks((int)lIllllIIll[0]);

        }
        if (w.lIIlllllIllIl(du.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIIlllllllIll(Players.getLocal().getWorldLocation().distanceTo(de), lIllllIIll[21])) {
            g.a(lIllllIIIl[lIllllIIll[145]], cE);
        }
        if (w.lIIlllllIllIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIllllIIll[52], lIllllIIll[53], lIllllIIll[1])) ? 1 : 0)) {
            String[] stringArray = new String[lIllllIIll[0]];
            stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[99]];
            TileObjects.getNearest((String[])stringArray).interact(lIllllIIIl[lIllllIIll[146]]);
            Time.sleepTicks((int)lIllllIIll[9]);

        }
    }

    private static boolean lIIlllllllIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIlllllIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlllllIllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIIIIIlIl(Object object, Object object2) {
        return object == object2;
    }

    private static void Q() {
        block46: {
            d var1;
            block45: {
                block44: {
                    block43: {
                        Object var2;
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
                                                                        int[] nArray = new int[lIllllIIll[0]];
                                                                        nArray[w.lIllllIIll[1]] = lIllllIIll[43];
                                                                        if (!w.lIIlllllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block31;
                                                                        int[] nArray2 = new int[lIllllIIll[0]];
                                                                        nArray2[w.lIllllIIll[1]] = lIllllIIll[43];
                                                                        if (!w.lIIlllllIllIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block32;
                                                                        int[] nArray3 = new int[lIllllIIll[0]];
                                                                        nArray3[w.lIllllIIll[1]] = lIllllIIll[43];
                                                                        if (!w.lIIlllllIlllI(Bank.getFirst((int[])nArray3).getQuantity(), lIllllIIll[4])) break block32;
                                                                    }
                                                                    var2 = new DHelper(lIllllIIll[43], lIllllIIll[4], e.c(lIllllIIll[147], lIllllIIll[148]));
                                                                    bv.add((DHelper) ar2);

                                                                }
                                                                int[] nArray = new int[lIllllIIll[0]];
                                                                nArray[w.lIllllIIll[1]] = lIllllIIll[30];
                                                                if (!w.lIIlllllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                                                                int[] nArray4 = new int[lIllllIIll[0]];
                                                                nArray4[w.lIllllIIll[1]] = lIllllIIll[30];
                                                                if (!w.lIIlllllIllIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block34;
                                                                int[] nArray5 = new int[lIllllIIll[0]];
                                                                nArray5[w.lIllllIIll[1]] = lIllllIIll[30];
                                                                if (!w.lIIlllllIlllI(Bank.getFirst((int[])nArray5).getQuantity(), lIllllIIll[16])) break block34;
                                                            }
                                                            var2 = new DHelper(lIllllIIll[30], lIllllIIll[16], lIllllIIll[149]);
                                                            bv.add((DHelper) ar2);

                                                        }
                                                        int[] nArray = new int[lIllllIIll[0]];
                                                        nArray[w.lIllllIIll[1]] = lIllllIIll[31];
                                                        if (!w.lIIlllllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block35;
                                                        int[] nArray6 = new int[lIllllIIll[0]];
                                                        nArray6[w.lIllllIIll[1]] = lIllllIIll[31];
                                                        if (!w.lIIlllllIllIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block36;
                                                        int[] nArray7 = new int[lIllllIIll[0]];
                                                        nArray7[w.lIllllIIll[1]] = lIllllIIll[31];
                                                        if (!w.lIIlllllIlllI(Bank.getFirst((int[])nArray7).getQuantity(), lIllllIIll[28])) break block36;
                                                    }
                                                    var2 = new DHelper(lIllllIIll[31], lIllllIIll[28], lIllllIIll[150]);
                                                    bv.add((DHelper) ar2);

                                                }
                                                int[] nArray = new int[lIllllIIll[0]];
                                                nArray[w.lIllllIIll[1]] = lIllllIIll[103];
                                                if (w.lIIlllllIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    var2 = new DHelper(lIllllIIll[103], lIllllIIll[8], lIllllIIll[151]);
                                                    bv.add((DHelper) ar2);

                                                }
                                                int[] nArray8 = new int[lIllllIIll[0]];
                                                nArray8[w.lIllllIIll[1]] = lIllllIIll[37];
                                                if (w.lIIlllllIllll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                                    var2 = new DHelper(lIllllIIll[37], lIllllIIll[0], lIllllIIll[27]);
                                                    bv.add((DHelper) ar2);

                                                }
                                                int[] nArray9 = new int[lIllllIIll[0]];
                                                nArray9[w.lIllllIIll[1]] = lIllllIIll[32];
                                                if (!w.lIIlllllIllIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block37;
                                                int[] nArray10 = new int[lIllllIIll[0]];
                                                nArray10[w.lIllllIIll[1]] = lIllllIIll[32];
                                                if (!w.lIIlllllIllIl(Bank.contains((int[])nArray10) ? 1 : 0)) break block38;
                                                int[] nArray11 = new int[lIllllIIll[0]];
                                                nArray11[w.lIllllIIll[1]] = lIllllIIll[32];
                                                if (!w.lIIlllllIlllI(Bank.getFirst((int[])nArray11).getQuantity(), lIllllIIll[13])) break block38;
                                            }
                                            var2 = new DHelper(lIllllIIll[32], lIllllIIll[13], lIllllIIll[27]);
                                            bv.add((DHelper) ar2);

                                        }
                                        int[] nArray = new int[lIllllIIll[0]];
                                        nArray[w.lIllllIIll[1]] = lIllllIIll[33];
                                        if (!w.lIIlllllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block39;
                                        int[] nArray12 = new int[lIllllIIll[0]];
                                        nArray12[w.lIllllIIll[1]] = lIllllIIll[33];
                                        if (!w.lIIlllllIllIl(Bank.contains((int[])nArray12) ? 1 : 0)) break block40;
                                        int[] nArray13 = new int[lIllllIIll[0]];
                                        nArray13[w.lIllllIIll[1]] = lIllllIIll[33];
                                        if (!w.lIIlllllIlllI(Bank.getFirst((int[])nArray13).getQuantity(), lIllllIIll[8])) break block40;
                                    }
                                    var2 = new DHelper(lIllllIIll[33], lIllllIIll[8], lIllllIIll[27]);
                                    bv.add((DHelper) ar2);

                                }
                                int[] nArray = new int[lIllllIIll[0]];
                                nArray[w.lIllllIIll[1]] = lIllllIIll[29];
                                if (!w.lIIlllllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block41;
                                int[] nArray14 = new int[lIllllIIll[0]];
                                nArray14[w.lIllllIIll[1]] = lIllllIIll[29];
                                if (!w.lIIlllllIllIl(Bank.contains((int[])nArray14) ? 1 : 0)) break block42;
                                int[] nArray15 = new int[lIllllIIll[0]];
                                nArray15[w.lIllllIIll[1]] = lIllllIIll[29];
                                if (!w.lIIlllllIlllI(Bank.getFirst((int[])nArray15).getQuantity(), lIllllIIll[8])) break block42;
                            }
                            var2 = new DHelper(lIllllIIll[29], lIllllIIll[13], lIllllIIll[27]);
                            bv.add((DHelper) ar2);

                        }
                        int[] nArray = new int[lIllllIIll[0]];
                        nArray[w.lIllllIIll[1]] = lIllllIIll[39];
                        if (w.lIIlllllIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            var2 = new DHelper(lIllllIIll[39], lIllllIIll[0], lIllllIIll[27]);
                            bv.add((DHelper) ar2);

                        }
                        int[] nArray16 = new int[lIllllIIll[0]];
                        nArray16[w.lIllllIIll[1]] = lIllllIIll[38];
                        if (w.lIIlllllIllll(Bank.contains((int[])nArray16) ? 1 : 0)) {
                            var2 = new DHelper(lIllllIIll[38], lIllllIIll[0], lIllllIIll[27]);
                            bv.add((DHelper) ar2);

                        }
                        int[] nArray17 = new int[lIllllIIll[0]];
                        nArray17[w.lIllllIIll[1]] = lIllllIIll[40];
                        if (w.lIIlllllIllll(Bank.contains((int[])nArray17) ? 1 : 0)) {
                            var2 = new DHelper(lIllllIIll[40], lIllllIIll[0], lIllllIIll[152]);
                            bv.add((DHelper) ar2);

                        }
                        int[] nArray18 = new int[lIllllIIll[0]];
                        nArray18[w.lIllllIIll[1]] = lIllllIIll[41];
                        if (w.lIIlllllIllll(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            var2 = new DHelper(lIllllIIll[41], lIllllIIll[0], lIllllIIll[153] + e.c(lIllllIIll[154], lIllllIIll[155]));
                            bv.add((DHelper) ar2);

                        }
                        if (w.lIIlllllIllll(Bank.contains((Predicate)(var2 = item -> item.getName().toLowerCase().contains(lIllllIIIl[lIllllIIll[161]]))) ? 1 : 0)) {
                            var1 = new DHelper(lIllllIIll[156], lIllllIIll[8], lIllllIIll[157]);
                            bv.add(var1);

                        }
                        int[] nArray19 = new int[lIllllIIll[0]];
                        nArray19[w.lIllllIIll[1]] = lIllllIIll[34];
                        if (!w.lIIlllllIllIl(Bank.contains((int[])nArray19) ? 1 : 0)) break block43;
                        int[] nArray20 = new int[lIllllIIll[0]];
                        nArray20[w.lIllllIIll[1]] = lIllllIIll[34];
                        if (!w.lIIlllllIllIl(Bank.contains((int[])nArray20) ? 1 : 0)) break block44;
                        int[] nArray21 = new int[lIllllIIll[0]];
                        nArray21[w.lIllllIIll[1]] = lIllllIIll[34];
                        if (!w.lIIlllllIlllI(Bank.getFirst((int[])nArray21).getQuantity(), lIllllIIll[13])) break block44;
                    }
                    var1 = new DHelper(lIllllIIll[34], lIllllIIll[13], j.cf);
                    bv.add(var1);

                }
                int[] nArray = new int[lIllllIIll[0]];
                nArray[w.lIllllIIll[1]] = lIllllIIll[36];
                if (!w.lIIlllllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray22 = new int[lIllllIIll[0]];
                nArray22[w.lIllllIIll[1]] = lIllllIIll[36];
                if (!w.lIIlllllIllIl(Bank.contains((int[])nArray22) ? 1 : 0)) break block46;
                int[] nArray23 = new int[lIllllIIll[0]];
                nArray23[w.lIllllIIll[1]] = lIllllIIll[36];
                if (!w.lIIlllllIlllI(Bank.getFirst((int[])nArray23).getQuantity(), lIllllIIll[28])) break block46;
            }
            var1 = new DHelper(lIllllIIll[36], lIllllIIll[22], lIllllIIll[158]);
            bv.add(var1);

        }
    }

    @Override
    public boolean ae() {
        return lIllllIIll[1];
    }

    private static void lIIlllllIlIlI() {
        lIllllIIIl = new String[lIllllIIll[181]];
        w.lIllllIIIl[w.lIllllIIll[1]] = "Finished buying items, switching back to quest";
        w.lIllllIIIl[w.lIllllIIll[0]] = "Waterfall";
        w.lIllllIIIl[w.lIllllIIll[9]] = "Priest in Peril";
        w.lIllllIIIl[w.lIllllIIll[11]] = "Ernest the Chicken";
        w.lIllllIIIl[w.lIllllIIll[13]] = "Crafting";
        w.lIllllIIIl[w.lIllllIIll[8]] = "Woodcutting";
        w.lIllllIIIl[w.lIllllIIll[16]] = "Training range";
        w.lIllllIIIl[w.lIllllIIll[20]] = "Varrock Quiz";
        w.lIllllIIIl[w.lIllllIIll[21]] = "RFD Dwarf";
        w.lIllllIIIl[w.lIllllIIll[19]] = "A Porcine";
        w.lIllllIIIl[w.lIllllIIll[4]] = "Antique lamp";
        w.lIllllIIIl[w.lIllllIIll[23]] = "Client of Kourend";
        w.lIllllIIIl[w.lIllllIIll[24]] = "Antique lamp";
        w.lIllllIIIl[w.lIllllIIll[25]] = w.lIIllllIllIIl("JILXYc9QlU4=", "XQqlQ");
        w.lIllllIIIl[w.lIllllIIll[26]] = "Nav to bank";
        w.lIllllIIIl[w.lIllllIIll[28]] = "Handling banking";
        w.lIllllIIIl[w.lIllllIIll[35]] = "We are missing quest supplies, switching to BUYING";
        w.lIllllIIIl[w.lIllllIIll[42]] = "We are missing quest supplies, switching to BUYING";
        w.lIllllIIIl[w.lIllllIIll[46]] = "Drink";
        w.lIllllIIIl[w.lIllllIIll[12]] = "Drink";
        w.lIllllIIIl[w.lIllllIIll[48]] = "Shark";
        w.lIllllIIIl[w.lIllllIIll[49]] = "Shark";
        w.lIllllIIIl[w.lIllllIIll[50]] = "Eat";
        w.lIllllIIIl[w.lIllllIIll[51]] = "Nav to start";
        w.lIllllIIIl[w.lIllllIIll[47]] = "Ava";
        w.lIllllIIIl[w.lIllllIIll[54]] = "Bookcase";
        w.lIllllIIIl[w.lIllllIIll[55]] = "Search";
        w.lIllllIIIl[w.lIllllIIll[57]] = "Bookcase";
        w.lIllllIIIl[w.lIllllIIll[58]] = "Search";
        w.lIllllIIIl[w.lIllllIIll[59]] = "Wear";
        w.lIllllIIIl[w.lIllllIIll[64]] = "Nav to charter";
        w.lIllllIIIl[w.lIllllIIll[65]] = "Trader Crewmember";
        w.lIllllIIIl[w.lIllllIIll[10]] = "Trade";
        w.lIllllIIIl[w.lIllllIIll[66]] = "Break";
        w.lIllllIIIl[w.lIllllIIll[67]] = "Nav to ecto";
        w.lIllllIIIl[w.lIllllIIll[14]] = "Bones";
        w.lIllllIIIl[w.lIllllIIll[68]] = "Staircase";
        w.lIllllIIIl[w.lIllllIIll[69]] = "Climb-up";
        w.lIllllIIIl[w.lIllllIIll[70]] = "Loader";
        w.lIllllIIIl[w.lIllllIIll[71]] = "Bones";
        w.lIllllIIIl[w.lIllllIIll[22]] = "Bones";
        w.lIllllIIIl[w.lIllllIIll[72]] = "Loader";
        w.lIllllIIIl[w.lIllllIIll[75]] = "Bones";
        w.lIllllIIIl[w.lIllllIIll[76]] = "Staircase";
        w.lIllllIIIl[w.lIllllIIll[77]] = "Climb-down";
        w.lIllllIIIl[w.lIllllIIll[78]] = "Bonemeal";
        w.lIllllIIIl[w.lIllllIIll[79]] = "Ectofuntus";
        w.lIllllIIIl[w.lIllllIIll[80]] = "Worship";
        w.lIllllIIIl[w.lIllllIIll[81]] = "Bonemeal";
        w.lIllllIIIl[w.lIllllIIll[82]] = "Ghost disciple";
        w.lIllllIIIl[w.lIllllIIll[15]] = "Malcolm";
        w.lIllllIIIl[w.lIllllIIll[84]] = "Alice";
        w.lIllllIIIl[w.lIllllIIll[85]] = "Malcolm";
        w.lIllllIIIl[w.lIllllIIll[86]] = "Alice";
        w.lIllllIIIl[w.lIllllIIll[87]] = "Malcolm";
        w.lIllllIIIl[w.lIllllIIll[88]] = "Alice";
        w.lIllllIIIl[w.lIllllIIll[93]] = "Nav to crone";
        w.lIllllIIIl[w.lIllllIIll[94]] = "Old crone";
        w.lIllllIIIl[w.lIllllIIll[96]] = "Malcolm";
        w.lIllllIIIl[w.lIllllIIll[98]] = "Malcolm";
        w.lIllllIIIl[w.lIllllIIll[6]] = "Malcolm";
        w.lIllllIIIl[w.lIllllIIll[101]] = "Undead chicken";
        w.lIllllIIIl[w.lIllllIIll[102]] = "Iron bar";
        w.lIllllIIIl[w.lIllllIIll[104]] = "Iron bar";
        w.lIllllIIIl[w.lIllllIIll[107]] = "Witch";
        w.lIllllIIIl[w.lIllllIIll[3]] = "Witch";
        w.lIllllIIIl[w.lIllllIIll[109]] = "Bar magnet";
        w.lIllllIIIl[w.lIllllIIll[113]] = "Nav to mine";
        w.lIllllIIIl[w.lIllllIIll[114]] = "Hammer";
        w.lIllllIIIl[w.lIllllIIll[115]] = "Selected iron";
        w.lIllllIIIl[w.lIllllIIll[89]] = "Bar magnet";
        w.lIllllIIIl[w.lIllllIIll[119]] = "Undead tree";
        w.lIllllIIIl[w.lIllllIIll[120]] = "Chop";
        w.lIllllIIIl[w.lIllllIIll[90]] = "Wear";
        w.lIllllIIIl[w.lIllllIIll[125]] = "Nav to npc";
        w.lIllllIIIl[w.lIllllIIll[126]] = "Turael";
        w.lIllllIIIl[w.lIllllIIll[95]] = "Turael";
        w.lIllllIIIl[w.lIllllIIll[128]] = "Undead twigs";
        w.lIllllIIIl[w.lIllllIIll[129]] = "Undead tree";
        w.lIllllIIIl[w.lIllllIIll[130]] = "Chop";
        w.lIllllIIIl[w.lIllllIIll[97]] = "Undead twigs";
        w.lIllllIIIl[w.lIllllIIll[134]] = "Research notes";
        w.lIllllIIIl[w.lIllllIIll[135]] = "Translate";
        w.lIllllIIIl[w.lIllllIIll[138]] = "A pattern";
        w.lIllllIIIl[w.lIllllIIll[139]] = "A pattern";
        w.lIllllIIIl[w.lIllllIIll[140]] = "Hard leather";
        w.lIllllIIIl[w.lIllllIIll[142]] = "Bookcase";
        w.lIllllIIIl[w.lIllllIIll[143]] = "Search";
        w.lIllllIIIl[w.lIllllIIll[144]] = "Nav to start";
        w.lIllllIIIl[w.lIllllIIll[145]] = "Ava";
        w.lIllllIIIl[w.lIllllIIll[99]] = "Bookcase";
        w.lIllllIIIl[w.lIllllIIll[146]] = "Search";
        w.lIllllIIIl[w.lIllllIIll[159]] = w.lIIllllIllIIl("oSvecbS0Vqc=", "BcjFF");
        w.lIllllIIIl[w.lIllllIIll[160]] = "Animal Magnetism";
        w.lIllllIIIl[w.lIllllIIll[161]] = "ring of wealth (";
        w.lIllllIIIl[w.lIllllIIll[162]] = "Drop";
        w.lIllllIIIl[w.lIllllIIll[173]] = "Yes.";
        w.lIllllIIIl[w.lIllllIIll[174]] = "I'm here about a quest.";
        w.lIllllIIIl[w.lIllllIIll[175]] = "Okay, you need it more than I do, I suppose.";
        w.lIllllIIIl[w.lIllllIIll[176]] = "Could I buy those chickens now, then?";
        w.lIllllIIIl[w.lIllllIIll[100]] = "Could I buy 2 chickens?";
        w.lIllllIIIl[w.lIllllIIll[177]] = "I'm here about a quest.";
        w.lIllllIIIl[w.lIllllIIll[178]] = "Hello, I'm here about those trees again.";
        w.lIllllIIIl[w.lIllllIIll[179]] = "I'd love one, thanks.";
        w.lIllllIIIl[w.lIllllIIll[180]] = w.lIIllllIllIll("", "wmpnX");
    }

    static {
        w.lIIlllllIlIll();
        w.lIIlllllIlIlI();
        bv = new ArrayList<d>();
        du = new WorldArea(lIllllIIll[163], lIllllIIll[56], lIllllIIll[16], lIllllIIll[4], lIllllIIll[1]);
        dv = new WorldArea(lIllllIIll[164], lIllllIIll[165], lIllllIIll[166], lIllllIIll[142], lIllllIIll[1]);
        dw = new WorldArea(lIllllIIll[164], lIllllIIll[165], lIllllIIll[166], lIllllIIll[142], lIllllIIll[0]);
        de = new WorldPoint(lIllllIIll[167], lIllllIIll[168], lIllllIIll[1]);
        dx = new WorldPoint(lIllllIIll[169], lIllllIIll[170], lIllllIIll[1]);
        dy = new WorldPoint(lIllllIIll[171], lIllllIIll[172], lIllllIIll[1]);
        String[] stringArray = new String[lIllllIIll[21]];
        stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[173]];
        stringArray[w.lIllllIIll[0]] = lIllllIIIl[lIllllIIll[174]];
        stringArray[w.lIllllIIll[9]] = lIllllIIIl[lIllllIIll[175]];
        stringArray[w.lIllllIIll[11]] = lIllllIIIl[lIllllIIll[176]];
        stringArray[w.lIllllIIll[13]] = lIllllIIIl[lIllllIIll[100]];
        stringArray[w.lIllllIIll[8]] = lIllllIIIl[lIllllIIll[177]];
        stringArray[w.lIllllIIll[16]] = lIllllIIIl[lIllllIIll[178]];
        stringArray[w.lIllllIIll[20]] = lIllllIIIl[lIllllIIll[179]];
        cE = stringArray;
        cY = lIllllIIll[1];
        dz = lIllllIIIl[lIllllIIll[180]];
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void var3;
        int[] nArray = new int[lIllllIIll[20]];
        nArray[w.lIllllIIll[1]] = lIllllIIll[36];
        nArray[w.lIllllIIll[0]] = lIllllIIll[37];
        nArray[w.lIllllIIll[9]] = lIllllIIll[34];
        nArray[w.lIllllIIll[11]] = lIllllIIll[40];
        nArray[w.lIllllIIll[13]] = lIllllIIll[41];
        nArray[w.lIllllIIll[8]] = lIllllIIll[30];
        nArray[w.lIllllIIll[16]] = lIllllIIll[31];
        int[] nArray2 = nArray;
        int var4 = lIllllIIll[1];
        while (w.lIIlllllIlllI(var4, ((void)var3).length)) {
            int[] nArray3 = new int[lIllllIIll[0]];
            nArray3[w.lIllllIIll[1]] = var3[var4];
            if (w.lIIlllllIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIllllIIll[1];
            }
            ++var4;

            if ((136 + 21 - 90 + 130 ^ 112 + 152 - 245 + 174) == (133 + 67 - 164 + 129 ^ 142 + 111 - 151 + 59)) continue;
            return ((0x7C ^ 0x4B ^ (0xFA ^ 0x9B)) & (51 + 115 - 74 + 110 ^ 142 + 14 - 124 + 124 ^ -1)) != 0;
        }
        return lIllllIIll[0];
    }

    @Override
    public int af() {
        try {
            w.bf();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-(0x93 ^ 0x97) > 0) {
            return (0x60 ^ 0x28) & ~(0x18 ^ 0x50);
        }
        return lIllllIIll[100];
    }

    private static boolean lIIlllllllIII(int n2) {
        return n2 > 0;
    }

    private static boolean lIIllllllIllI(Object object) {
        return object != null;
    }

    private static boolean lIIlllllllIIl(int n2) {
        return n2 < 0;
    }

    @Override
    public String ag() {
        if (w.lIlIIIIIIIlIl(dz, lIllllIIIl[lIllllIIll[159]])) {
            return lIllllIIIl[lIllllIIll[160]];
        }
        return "Animal Magnetism - " + dz;
    }

    private static int lIIlllllIllII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

        return String.valueOf(var5);
    }

    public static void bf() {
        block115: {
            WorldPoint var6;
            Object var7;
            block116: {
                block123: {
                    block118: {
                        block122: {
                            block121: {
                                block120: {
                                    block119: {
                                        block117: {
                                            if (w.lIIlllllIllIl(bt ? 1 : 0)) {
                                                b.a(bv);
                                                if (w.lIIlllllIlllI(bv.size(), lIllllIIll[0])) {
                                                    System.out.println(lIllllIIIl[lIllllIIll[1]]);
                                                    bt = lIllllIIll[1];
                                                }
                                            }
                                            if (!w.lIIlllllIllll(bt ? 1 : 0) || !w.lIIlllllIlllI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[2])) break block115;
                                            if (w.lIIlllllIlllI(e.j(lIllllIIll[3]), lIllllIIll[4])) {
                                                dz = lIllllIIIl[lIllllIIll[0]];
                                                O.db();
                                            }
                                            if (w.lIIllllllIIII(e.j(lIllllIIll[3]), lIllllIIll[4]) && (!w.lIIllllllIIIl(e.j(lIllllIIll[5]), lIllllIIll[6]) || w.lIIlllllIlllI(e.j(lIllllIIll[7]), lIllllIIll[8]))) {
                                                dz = lIllllIIIl[lIllllIIll[9]];
                                                H.cf();
                                            }
                                            if (w.lIIllllllIIII(e.j(lIllllIIll[3]), lIllllIIll[4]) && w.lIIllllllIIIl(e.j(lIllllIIll[5]), lIllllIIll[6]) && w.lIIllllllIIIl(e.j(lIllllIIll[7]), lIllllIIll[8]) && w.lIIlllllIlllI(e.j(lIllllIIll[10]), lIllllIIll[11])) {
                                                dz = lIllllIIIl[lIllllIIll[11]];
                                                V.dL();
                                            }
                                            if (w.lIIllllllIIII(e.j(lIllllIIll[3]), lIllllIIll[4]) && w.lIIllllllIIIl(e.j(lIllllIIll[5]), lIllllIIll[6]) && w.lIIllllllIIIl(e.j(lIllllIIll[7]), lIllllIIll[8]) && w.lIIllllllIIII(e.j(lIllllIIll[10]), lIllllIIll[11]) && w.lIIlllllIlllI(Skills.getLevel((Skill)Skill.CRAFTING), lIllllIIll[12])) {
                                                dz = lIllllIIIl[lIllllIIll[13]];
                                                ay.fi();
                                            }
                                            if (w.lIIllllllIIII(e.j(lIllllIIll[3]), lIllllIIll[4]) && w.lIIllllllIIIl(e.j(lIllllIIll[5]), lIllllIIll[6]) && w.lIIllllllIIIl(e.j(lIllllIIll[7]), lIllllIIll[8]) && w.lIIllllllIIII(e.j(lIllllIIll[10]), lIllllIIll[11]) && w.lIIllllllIIIl(Skills.getLevel((Skill)Skill.CRAFTING), lIllllIIll[12]) && w.lIIlllllIlllI(Skills.getLevel((Skill)Skill.WOODCUTTING), lIllllIIll[14])) {
                                                dz = lIllllIIIl[lIllllIIll[8]];
                                                aF.gs();
                                            }
                                            if (w.lIIllllllIIII(e.j(lIllllIIll[3]), lIllllIIll[4]) && w.lIIllllllIIIl(e.j(lIllllIIll[5]), lIllllIIll[6]) && w.lIIllllllIIIl(e.j(lIllllIIll[7]), lIllllIIll[8]) && w.lIIllllllIIII(e.j(lIllllIIll[10]), lIllllIIll[11]) && w.lIIllllllIIIl(Skills.getLevel((Skill)Skill.CRAFTING), lIllllIIll[12]) && w.lIIllllllIIIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIllllIIll[14]) && w.lIIlllllIlllI(Skills.getLevel((Skill)Skill.RANGED), lIllllIIll[15])) {
                                                dz = lIllllIIIl[lIllllIIll[16]];
                                                if (w.lIIlllllIlllI(cY, lIllllIIll[0])) {
                                                    o.cH = lIllllIIll[1];
                                                    cY += lIllllIIll[0];
                                                }
                                                n.aA();
                                            }
                                            if (w.lIIllllllIIII(e.j(lIllllIIll[3]), lIllllIIll[4]) && w.lIIllllllIIIl(e.j(lIllllIIll[5]), lIllllIIll[6]) && w.lIIllllllIIIl(e.j(lIllllIIll[7]), lIllllIIll[8]) && w.lIIllllllIIII(e.j(lIllllIIll[10]), lIllllIIll[11]) && w.lIIllllllIIIl(Skills.getLevel((Skill)Skill.CRAFTING), lIllllIIll[12]) && w.lIIllllllIIIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIllllIIll[14]) && w.lIIllllllIIIl(Skills.getLevel((Skill)Skill.RANGED), lIllllIIll[15])) {
                                                if (!w.lIIllllllIIIl(e.j(lIllllIIll[17]), lIllllIIll[18]) || w.lIIlllllIlllI(Skills.getLevel((Skill)Skill.HUNTER), lIllllIIll[19])) {
                                                    dz = lIllllIIIl[lIllllIIll[20]];
                                                    N.cY();
                                                }
                                                if (w.lIIllllllIIIl(e.j(lIllllIIll[17]), lIllllIIll[18]) && w.lIIllllllIIIl(Skills.getLevel((Skill)Skill.HUNTER), lIllllIIll[19]) && w.lIIlllllIlllI(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIllllIIll[6])) {
                                                    dz = lIllllIIIl[lIllllIIll[21]];
                                                    J.cw();
                                                }
                                                if (w.lIIllllllIIIl(e.j(lIllllIIll[17]), lIllllIIll[18]) && w.lIIllllllIIIl(Skills.getLevel((Skill)Skill.HUNTER), lIllllIIll[19]) && w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIllllIIll[6]) && w.lIIlllllIlllI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIllllIIll[22])) {
                                                    dz = lIllllIIIl[lIllllIIll[19]];
                                                    u.aX();
                                                }
                                                if (w.lIIllllllIIIl(e.j(lIllllIIll[17]), lIllllIIll[18]) && w.lIIllllllIIIl(Skills.getLevel((Skill)Skill.HUNTER), lIllllIIll[19]) && w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIllllIIll[6]) && w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIllllIIll[22]) && w.lIIlllllIlllI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIllllIIll[19])) {
                                                    String[] stringArray = new String[lIllllIIll[0]];
                                                    stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[4]];
                                                    if (w.lIIlllllIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        dz = lIllllIIIl[lIllllIIll[23]];
                                                        x.bi();
                                                    }
                                                }
                                                x.bj();
                                            }
                                            if (!w.lIIlllllIllll(w.an() ? 1 : 0) || !w.lIIlllllIllll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId())) || !w.lIIllllllIIIl(e.j(lIllllIIll[17]), lIllllIIll[18]) || !w.lIIllllllIIIl(Skills.getLevel((Skill)Skill.HUNTER), lIllllIIll[19]) || !w.lIIllllllIIIl(Skills.getLevel((Skill)Skill.RANGED), lIllllIIll[15]) || !w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIllllIIll[6]) || !w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIllllIIll[22]) || !w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIllllIIll[19])) break block116;
                                            String[] stringArray = new String[lIllllIIll[0]];
                                            stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[24]];
                                            if (!w.lIIlllllIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block116;
                                            dz = lIllllIIIl[lIllllIIll[25]];
                                            var7 = BankLocation.getNearest();
                                            if (w.lIIllllllIllI(var7) && w.lIIlllllIllll(var7.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderSotf.c = lIllllIIIl[lIllllIIll[26]];
                                                a.a((BankLocation)var7);
                                            }
                                            if (!w.lIIllllllIllI(var7) || !w.lIIlllllIllIl(var7.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block116;
                                            if (w.lIIlllllIllll(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIllllIIll[27]);

                                            }
                                            if (!w.lIIlllllIllIl(Bank.isOpen() ? 1 : 0)) break block116;
                                            AccBuilderSotf.c = lIllllIIIl[lIllllIIll[28]];
                                            if (w.lIIlllllllIII(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIllllIIll[13]);

                                            }
                                            if (w.lIIlllllllIII(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIllllIIll[9]);

                                            }
                                            int[] nArray = new int[lIllllIIll[0]];
                                            nArray[w.lIllllIIll[1]] = lIllllIIll[29];
                                            if (!w.lIIlllllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block117;
                                            int[] nArray2 = new int[lIllllIIll[0]];
                                            nArray2[w.lIllllIIll[1]] = lIllllIIll[29];
                                            if (!w.lIIllllllIIIl(Bank.getFirst((int[])nArray2).getQuantity(), lIllllIIll[8])) break block118;
                                        }
                                        int[] nArray = new int[lIllllIIll[0]];
                                        nArray[w.lIllllIIll[1]] = lIllllIIll[30];
                                        if (!w.lIIlllllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block119;
                                        int[] nArray3 = new int[lIllllIIll[0]];
                                        nArray3[w.lIllllIIll[1]] = lIllllIIll[30];
                                        if (!w.lIIllllllIIIl(Bank.getFirst((int[])nArray3).getQuantity(), lIllllIIll[16])) break block118;
                                    }
                                    int[] nArray = new int[lIllllIIll[0]];
                                    nArray[w.lIllllIIll[1]] = lIllllIIll[31];
                                    if (!w.lIIlllllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block120;
                                    int[] nArray4 = new int[lIllllIIll[0]];
                                    nArray4[w.lIllllIIll[1]] = lIllllIIll[31];
                                    if (!w.lIIllllllIIIl(Bank.getFirst((int[])nArray4).getQuantity(), lIllllIIll[28])) break block118;
                                }
                                int[] nArray = new int[lIllllIIll[0]];
                                nArray[w.lIllllIIll[1]] = lIllllIIll[32];
                                if (!w.lIIlllllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block121;
                                int[] nArray5 = new int[lIllllIIll[0]];
                                nArray5[w.lIllllIIll[1]] = lIllllIIll[32];
                                if (!w.lIIllllllIIIl(Bank.getFirst((int[])nArray5).getQuantity(), lIllllIIll[13])) break block118;
                            }
                            int[] nArray = new int[lIllllIIll[0]];
                            nArray[w.lIllllIIll[1]] = lIllllIIll[33];
                            if (!w.lIIlllllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block122;
                            int[] nArray6 = new int[lIllllIIll[0]];
                            nArray6[w.lIllllIIll[1]] = lIllllIIll[33];
                            if (!w.lIIllllllIIIl(Bank.getFirst((int[])nArray6).getQuantity(), lIllllIIll[8])) break block118;
                        }
                        int[] nArray = new int[lIllllIIll[0]];
                        nArray[w.lIllllIIll[1]] = lIllllIIll[34];
                        if (!w.lIIlllllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block123;
                        int[] nArray7 = new int[lIllllIIll[0]];
                        nArray7[w.lIllllIIll[1]] = lIllllIIll[34];
                        if (!w.lIIlllllIlllI(Bank.getFirst((int[])nArray7).getQuantity(), lIllllIIll[13])) break block123;
                    }
                    w.Q();
                    System.out.println(lIllllIIIl[lIllllIIll[35]]);
                    bt = lIllllIIll[0];
                    return;
                }
                int[] nArray = new int[lIllllIIll[23]];
                nArray[w.lIllllIIll[1]] = lIllllIIll[36];
                nArray[w.lIllllIIll[0]] = lIllllIIll[37];
                nArray[w.lIllllIIll[9]] = lIllllIIll[33];
                nArray[w.lIllllIIll[11]] = lIllllIIll[38];
                nArray[w.lIllllIIll[13]] = lIllllIIll[32];
                nArray[w.lIllllIIll[8]] = lIllllIIll[34];
                nArray[w.lIllllIIll[16]] = lIllllIIll[39];
                nArray[w.lIllllIIll[20]] = lIllllIIll[40];
                nArray[w.lIllllIIll[21]] = lIllllIIll[41];
                nArray[w.lIllllIIll[19]] = lIllllIIll[30];
                nArray[w.lIllllIIll[4]] = lIllllIIll[31];
                if (w.lIIlllllIllll(e.c(nArray) ? 1 : 0)) {
                    w.Q();
                    System.out.println(lIllllIIIl[lIllllIIll[42]]);
                    bt = lIllllIIll[0];
                    return;
                }
                int[] nArray8 = new int[lIllllIIll[23]];
                nArray8[w.lIllllIIll[1]] = lIllllIIll[36];
                nArray8[w.lIllllIIll[0]] = lIllllIIll[37];
                nArray8[w.lIllllIIll[9]] = lIllllIIll[33];
                nArray8[w.lIllllIIll[11]] = lIllllIIll[38];
                nArray8[w.lIllllIIll[13]] = lIllllIIll[32];
                nArray8[w.lIllllIIll[8]] = lIllllIIll[34];
                nArray8[w.lIllllIIll[16]] = lIllllIIll[39];
                nArray8[w.lIllllIIll[20]] = lIllllIIll[40];
                nArray8[w.lIllllIIll[21]] = lIllllIIll[41];
                nArray8[w.lIllllIIll[19]] = lIllllIIll[30];
                nArray8[w.lIllllIIll[4]] = lIllllIIll[31];
                if (w.lIIlllllIllIl(e.c(nArray8) ? 1 : 0)) {
                    a.a(lIllllIIll[34], lIllllIIll[13]);
                    a.a(lIllllIIll[37], lIllllIIll[0]);
                    a.a(lIllllIIll[43], lIllllIIll[0]);
                    a.a(lIllllIIll[32], lIllllIIll[13]);
                    a.a(lIllllIIll[29], lIllllIIll[13]);
                    a.a(lIllllIIll[40], lIllllIIll[0]);
                    a.a(lIllllIIll[41], lIllllIIll[0]);
                    a.a(lIllllIIll[36], lIllllIIll[4]);
                    a.a(lIllllIIll[30], lIllllIIll[4]);
                    a.a(lIllllIIll[31], lIllllIIll[28]);
                    a.a(lIllllIIll[44], lIllllIIll[0]);
                    a.a(lIllllIIll[45], lIllllIIll[27]);
                }
            }
            if (w.lIIlllllIllIl(Inventory.contains((int[])f.ba) ? 1 : 0) && w.lIIlllllIlllI(Movement.getRunEnergy(), lIllllIIll[15])) {
                Inventory.getFirst((int[])f.ba).interact(lIllllIIIl[lIllllIIll[46]]);
                Time.sleepTicks((int)lIllllIIll[0]);

            }
            if (w.lIIlllllIllIl(Inventory.contains((int[])f.aX) ? 1 : 0) && w.lIIlllllIlllI(Prayers.getPoints(), lIllllIIll[47])) {
                Inventory.getFirst((int[])f.aX).interact(lIllllIIIl[lIllllIIll[12]]);
            }
            if (w.lIIlllllllIIl(w.lIIlllllIllII(e.WHelper(), 60.0))) {
                String[] stringArray = new String[lIllllIIll[0]];
                stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[48]];
                if (w.lIIlllllIllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIllllIIll[0]];
                    stringArray2[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[49]];
                    Inventory.getFirst((String[])stringArray2).interact(lIllllIIIl[lIllllIIll[50]]);
                    Time.sleepTicks((int)lIllllIIll[9]);

                }
            }
            if (w.lIIlllllIllIl(w.an() ? 1 : 0) && w.lIIlllllIllll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()))) {
                if (w.lIIlllllIllll(du.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIIlllllllIlI(Players.getLocal().getWorldLocation().distanceTo(de), lIllllIIll[21])) {
                    AccBuilderSotf.c = lIllllIIIl[lIllllIIll[51]];
                    if (w.lIIlllllIllIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)de);

                    Time.sleepTicks((int)lIllllIIll[0]);

                }
                if (w.lIIlllllIllIl(du.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIIlllllllIll(Players.getLocal().getWorldLocation().distanceTo(de), lIllllIIll[21])) {
                    di = lIllllIIll[1];
                    g.a(lIllllIIIl[lIllllIIll[47]], cE);
                }
                if (w.lIIlllllIllIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIllllIIll[52], lIllllIIll[53], lIllllIIll[1])) ? 1 : 0)) {
                    String[] stringArray = new String[lIllllIIll[0]];
                    stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[54]];
                    TileObjects.getNearest((String[])stringArray).interact(lIllllIIIl[lIllllIIll[55]]);
                    Time.sleepTicks((int)lIllllIIll[9]);

                }
                if (w.lIIlllllIllIl((var7 = new WorldArea(lIllllIIll[52], lIllllIIll[56], lIllllIIll[16], lIllllIIll[4], lIllllIIll[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIllllIIll[0]];
                    stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[57]];
                    TileObjects.getNearest((String[])stringArray).interact(lIllllIIIl[lIllllIIll[58]]);
                    Time.sleepTicks((int)lIllllIIll[9]);

                }
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[4])) {
                int[] nArray = new int[lIllllIIll[0]];
                nArray[w.lIllllIIll[1]] = lIllllIIll[44];
                if (w.lIIlllllIllll(Equipment.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray9 = new int[lIllllIIll[0]];
                    nArray9[w.lIllllIIll[1]] = lIllllIIll[44];
                    Inventory.getFirst((int[])nArray9).interact(lIllllIIIl[lIllllIIll[59]]);
                }
                int[] nArray10 = new int[lIllllIIll[0]];
                nArray10[w.lIllllIIll[1]] = lIllllIIll[60];
                if (w.lIIlllllIllll(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                    block114: {
                        var7 = new WorldPoint(lIllllIIll[61], lIllllIIll[62], lIllllIIll[1]);
                        int[] nArray11 = new int[lIllllIIll[0]];
                        nArray11[w.lIllllIIll[1]] = lIllllIIll[63];
                        if (w.lIIlllllIllll(Inventory.contains((int[])nArray11) ? 1 : 0) && w.lIIlllllllIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var7), lIllllIIll[48])) {
                            if (w.lIIlllllllIlI(Players.getLocal().getWorldLocation().distanceTo(dx), lIllllIIll[8])) {
                                AccBuilderSotf.c = lIllllIIIl[lIllllIIll[64]];
                                Movement.walkTo((WorldPoint)dx);

                                Time.sleepTicks((int)lIllllIIll[0]);

                            }
                            if (w.lIIlllllllIll(Players.getLocal().getWorldLocation().distanceTo(dx), lIllllIIll[8])) {
                                if (w.lIIlllllIllll(Shop.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIllllIIll[0]];
                                    stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[65]];
                                    NPCs.getNearest((String[])stringArray).interact(lIllllIIIl[lIllllIIll[10]]);
                                    Time.sleepTicks((int)lIllllIIll[9]);

                                }
                                if (w.lIIlllllIllIl(Shop.isOpen() ? 1 : 0)) {
                                    Shop.buyFive((int)lIllllIIll[63]);
                                    Time.sleepTicks((int)lIllllIIll[11]);

                                }
                            }
                        }
                        int[] nArray12 = new int[lIllllIIll[0]];
                        nArray12[w.lIllllIIll[1]] = lIllllIIll[63];
                        if (w.lIIlllllIllIl(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                            if (w.lIIlllllIllll(dv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIIlllllIllll(dw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                int[] nArray13 = new int[lIllllIIll[0]];
                                nArray13[w.lIllllIIll[1]] = lIllllIIll[31];
                                if (w.lIIlllllIllIl(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                    int[] nArray14 = new int[lIllllIIll[0]];
                                    nArray14[w.lIllllIIll[1]] = lIllllIIll[31];
                                    Inventory.getFirst((int[])nArray14).interact(lIllllIIIl[lIllllIIll[66]]);
                                    Time.sleepTicks((int)lIllllIIll[20]);

                                }
                            }
                            if (!w.lIIlllllIllll(dv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || w.lIIlllllIllIl(dw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                var6 = new WorldPoint(lIllllIIll[61], lIllllIIll[62], lIllllIIll[1]);
                                if (w.lIIlllllllIlI(Players.getLocal().getWorldLocation().distanceTo(var6), lIllllIIll[8]) && w.lIIlllllIllll(Players.getLocal().getWorldLocation().getPlane())) {
                                    AccBuilderSotf.c = lIllllIIIl[lIllllIIll[67]];
                                    Movement.walkTo((WorldPoint)var6);

                                    Time.sleepTicks((int)lIllllIIll[0]);

                                }
                                String[] stringArray = new String[lIllllIIll[0]];
                                stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[14]];
                                if (w.lIIlllllIllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                    if (w.lIIlllllllIll(Players.getLocal().getWorldLocation().distanceTo(var6), lIllllIIll[8]) && w.lIIlllllIllll(Players.getLocal().getWorldLocation().getPlane())) {
                                        String[] stringArray3 = new String[lIllllIIll[0]];
                                        stringArray3[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[68]];
                                        TileObjects.getNearest((String[])stringArray3).interact(lIllllIIIl[lIllllIIll[69]]);
                                        Time.sleepTicks((int)lIllllIIll[13]);

                                    }
                                    String[] stringArray4 = new String[lIllllIIll[0]];
                                    stringArray4[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[70]];
                                    if (w.lIIllllllIllI(TileObjects.getNearest((String[])stringArray4))) {
                                        String[] stringArray5 = new String[lIllllIIll[0]];
                                        stringArray5[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[71]];
                                        if (w.lIIlllllIllIl(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                                            String[] stringArray6 = new String[lIllllIIll[0]];
                                            stringArray6[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[22]];
                                            String[] stringArray7 = new String[lIllllIIll[0]];
                                            stringArray7[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[72]];
                                            Inventory.getFirst((String[])stringArray6).useOn(TileObjects.getNearest((String[])stringArray7));
                                            Time.sleep((long)e.c(lIllllIIll[73], lIllllIIll[74]));

                                        }
                                    }
                                }
                                String[] stringArray8 = new String[lIllllIIll[0]];
                                stringArray8[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[75]];
                                if (w.lIIlllllIllll(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                                    if (w.lIIllllllIIII(Players.getLocal().getWorldLocation().getPlane(), lIllllIIll[0])) {
                                        String[] stringArray9 = new String[lIllllIIll[0]];
                                        stringArray9[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[76]];
                                        TileObjects.getNearest((String[])stringArray9).interact(lIllllIIIl[lIllllIIll[77]]);
                                        Time.sleepTicks((int)lIllllIIll[8]);

                                    }
                                    if (w.lIIlllllIllll(Players.getLocal().getWorldLocation().getPlane())) {
                                        do {
                                            String[] stringArray10 = new String[lIllllIIll[0]];
                                            stringArray10[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[78]];
                                            if (!w.lIIlllllIllIl(Inventory.contains((String[])stringArray10) ? 1 : 0)) break block114;
                                            String[] stringArray11 = new String[lIllllIIll[0]];
                                            stringArray11[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[79]];
                                            TileObjects.getNearest((String[])stringArray11).interact(lIllllIIIl[lIllllIIll[80]]);
                                            Time.sleepTicks((int)lIllllIIll[9]);

                                        } while (null == null);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    int[] nArray15 = new int[lIllllIIll[0]];
                    nArray15[w.lIllllIIll[1]] = lIllllIIll[32];
                    if (w.lIIlllllIllll(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                        String[] stringArray = new String[lIllllIIll[0]];
                        stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[81]];
                        if (w.lIIlllllIllll(Inventory.contains((String[])stringArray) ? 1 : 0) && w.lIIlllllllIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var7), lIllllIIll[48])) {
                            if (w.lIIlllllIllll(Dialog.isOpen() ? 1 : 0)) {
                                g.a(lIllllIIIl[lIllllIIll[82]], cE);
                                Time.sleepTicks((int)lIllllIIll[0]);

                            }
                            g.a(cE);
                        }
                    }
                }
                int[] nArray16 = new int[lIllllIIll[0]];
                nArray16[w.lIllllIIll[1]] = lIllllIIll[60];
                if (w.lIIlllllIllIl(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIllllIIll[9]];
                    nArray17[w.lIllllIIll[1]] = lIllllIIll[83];
                    nArray17[w.lIllllIIll[0]] = lIllllIIll[29];
                    if (w.lIIlllllIllIl(Inventory.contains((int[])nArray17) ? 1 : 0)) {
                        int[] nArray18 = new int[lIllllIIll[9]];
                        nArray18[w.lIllllIIll[1]] = lIllllIIll[83];
                        nArray18[w.lIllllIIll[0]] = lIllllIIll[29];
                        Inventory.getAll((int[])nArray18).stream().forEach(item -> item.interact(lIllllIIIl[lIllllIIll[162]]));
                    }
                    if (w.lIIlllllllIlI(Players.getLocal().getWorldLocation().distanceTo(dy), lIllllIIll[20])) {
                        Movement.walkTo((WorldPoint)dy);

                        Time.sleepTicks((int)lIllllIIll[0]);

                    }
                    if (w.lIIlllllllIll(Players.getLocal().getWorldLocation().distanceTo(dy), lIllllIIll[20])) {
                        g.a(lIllllIIIl[lIllllIIll[15]], cE);
                    }
                }
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[48])) {
                g.a(lIllllIIIl[lIllllIIll[84]], cE);
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[64])) {
                g.a(lIllllIIIl[lIllllIIll[85]], cE);
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[22])) {
                g.a(lIllllIIIl[lIllllIIll[86]], cE);
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[15])) {
                g.a(lIllllIIIl[lIllllIIll[87]], cE);
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[6])) {
                g.a(lIllllIIIl[lIllllIIll[88]], cE);
            }
            if (!w.lIlIIIIIIIIIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[89]) || w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[90])) {
                var7 = new WorldPoint(lIllllIIll[91], lIllllIIll[92], lIllllIIll[1]);
                if (w.lIIlllllllIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var7), lIllllIIll[11])) {
                    AccBuilderSotf.c = lIllllIIIl[lIllllIIll[93]];
                    Movement.walkTo((WorldPoint)var7);

                    Time.sleepTicks((int)lIllllIIll[0]);

                }
                if (w.lIIlllllllIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var7), lIllllIIll[11])) {
                    g.a(lIllllIIIl[lIllllIIll[94]], cE);
                }
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[95])) {
                if (w.lIIlllllllIlI(Players.getLocal().getWorldLocation().distanceTo(dy), lIllllIIll[20])) {
                    Movement.walkTo((WorldPoint)dy);

                    Time.sleepTicks((int)lIllllIIll[0]);

                }
                if (w.lIIlllllllIll(Players.getLocal().getWorldLocation().distanceTo(dy), lIllllIIll[20])) {
                    g.a(lIllllIIIl[lIllllIIll[96]], cE);
                }
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[97])) {
                g.a(lIllllIIIl[lIllllIIll[98]], cE);
            }
            if (!w.lIlIIIIIIIIIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[99]) || w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[100])) {
                g.a(lIllllIIIl[lIllllIIll[6]], cE);
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[100])) {
                String[] stringArray = new String[lIllllIIll[0]];
                stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[101]];
                if (w.lIIlllllIllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray12 = new String[lIllllIIll[0]];
                    stringArray12[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[102]];
                    if (w.lIIlllllIllll(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                        var7 = new HashMap();
                        ((HashMap)var7).put(lIllllIIll[33], lIllllIIll[8]);

                        ((HashMap)var7).put(lIllllIIll[38], lIllllIIll[0]);

                        ((HashMap)var7).put(lIllllIIll[39], lIllllIIll[0]);

                        ((HashMap)var7).put(lIllllIIll[103], lIllllIIll[0]);

                        e.a((HashMap<Integer, Integer>)var7, lIllllIIll[1], lIllllIIll[1]);
                    }
                    String[] stringArray13 = new String[lIllllIIll[0]];
                    stringArray13[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[104]];
                    if (w.lIIlllllIllIl(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        w.bg();
                    }
                }
            }
            if (!w.lIlIIIIIIIIIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[105]) || w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[106])) {
                String[] stringArray = new String[lIllllIIll[0]];
                stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[107]];
                var7 = NPCs.getNearest((String[])stringArray);
                if (w.lIIllllllIllI(var7)) {
                    if (w.lIIlllllIllIl(Reachable.isInteractable((Locatable)var7) ? 1 : 0)) {
                        g.a(lIllllIIIl[lIllllIIll[3]], cE);
                    }
                    if (w.lIIlllllIllll(Reachable.isInteractable((Locatable)var7) ? 1 : 0)) {
                        Movement.walkTo((Locatable)var7);

                        Time.sleepTicks((int)lIllllIIll[0]);

                    }
                }
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[108])) {
                String[] stringArray = new String[lIllllIIll[0]];
                stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[109]];
                if (w.lIIlllllIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    var7 = new WorldPoint(lIllllIIll[110], lIllllIIll[111], lIllllIIll[1]);
                    var6 = new WorldPoint(lIllllIIll[110], lIllllIIll[112], lIllllIIll[1]);
                    if (w.lIIlllllIllll(Players.getLocal().getWorldLocation().equals(var7) ? 1 : 0) && w.lIIlllllIllll(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                        AccBuilderSotf.c = lIllllIIIl[lIllllIIll[113]];
                        Movement.walkTo((WorldPoint)var7);

                        Time.sleepTicks((int)lIllllIIll[0]);

                    }
                    if (w.lIIlllllIllIl(Players.getLocal().getWorldLocation().equals(var7) ? 1 : 0) && w.lIIlllllIllll(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)var6);

                    }
                    if (w.lIIlllllIllIl(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                        String[] stringArray14 = new String[lIllllIIll[0]];
                        stringArray14[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[114]];
                        String[] stringArray15 = new String[lIllllIIll[0]];
                        stringArray15[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[115]];
                        Inventory.getFirst((String[])stringArray14).useOn(Inventory.getFirst((String[])stringArray15));
                        Time.sleepTicks((int)lIllllIIll[11]);

                    }
                }
                String[] stringArray16 = new String[lIllllIIll[0]];
                stringArray16[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[89]];
                if (w.lIIlllllIllIl(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                    w.bg();
                }
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[116])) {
                var7 = new WorldPoint(lIllllIIll[117], lIllllIIll[118], lIllllIIll[1]);
                if (w.lIIlllllIllll(Players.getLocal().getWorldLocation().equals(var7) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)var7);

                    Time.sleepTicks((int)lIllllIIll[0]);

                }
                if (w.lIIlllllIllIl(Players.getLocal().getWorldLocation().equals(var7) ? 1 : 0)) {
                    String[] stringArray = new String[lIllllIIll[0]];
                    stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[119]];
                    NPCs.getNearest((String[])stringArray).interact(lIllllIIIl[lIllllIIll[120]]);
                    Time.sleepTicks((int)lIllllIIll[0]);

                }
            }
            if (!w.lIlIIIIIIIIIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[121]) || w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[122])) {
                var7 = new WorldPoint(lIllllIIll[123], lIllllIIll[124], lIllllIIll[1]);
                if (w.lIIlllllllIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var7), lIllllIIll[9])) {
                    if (w.lIIlllllIllIl(Inventory.contains((int[])f.aT) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.aT).interact(lIllllIIIl[lIllllIIll[90]]);
                    }
                    AccBuilderSotf.c = lIllllIIIl[lIllllIIll[125]];
                    Movement.walkTo((WorldPoint)var7);

                    Time.sleepTicks((int)lIllllIIll[0]);

                }
                if (w.lIIlllllllIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var7), lIllllIIll[9])) {
                    String[] stringArray = new String[lIllllIIll[0]];
                    stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[126]];
                    var6 = NPCs.getNearest((String[])stringArray);
                    if (w.lIIllllllIllI(var6)) {
                        if (w.lIIlllllIllIl(Reachable.isInteractable((Locatable)var6) ? 1 : 0)) {
                            g.a(lIllllIIIl[lIllllIIll[95]], cE);
                        }
                        if (w.lIIlllllIllll(Reachable.isInteractable((Locatable)var6) ? 1 : 0)) {
                            Movement.walkTo((Locatable)var6);

                            Time.sleepTicks((int)lIllllIIll[0]);

                        }
                    }
                }
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[127])) {
                String[] stringArray = new String[lIllllIIll[0]];
                stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[128]];
                if (w.lIIlllllIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    var7 = new WorldPoint(lIllllIIll[117], lIllllIIll[118], lIllllIIll[1]);
                    if (w.lIIlllllIllll(Players.getLocal().getWorldLocation().equals(var7) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)var7);

                        Time.sleepTicks((int)lIllllIIll[0]);

                    }
                    if (w.lIIlllllIllIl(Players.getLocal().getWorldLocation().equals(var7) ? 1 : 0)) {
                        String[] stringArray17 = new String[lIllllIIll[0]];
                        stringArray17[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[129]];
                        NPCs.getNearest((String[])stringArray17).interact(lIllllIIIl[lIllllIIll[130]]);
                        Time.sleepTicks((int)lIllllIIll[0]);

                    }
                }
                String[] stringArray18 = new String[lIllllIIll[0]];
                stringArray18[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[97]];
                if (w.lIIlllllIllIl(Inventory.contains((String[])stringArray18) ? 1 : 0)) {
                    w.bg();
                }
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[131])) {
                w.bg();
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[132])) {
                if (w.lIIlllllIllIl(Widgets.get((int)lIllllIIll[133]).isEmpty() ? 1 : 0)) {
                    String[] stringArray = new String[lIllllIIll[0]];
                    stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[134]];
                    Inventory.getFirst((String[])stringArray).interact(lIllllIIIl[lIllllIIll[135]]);
                    Time.sleepTicks((int)lIllllIIll[13]);

                }
                if (w.lIIlllllIllll(Widgets.get((int)lIllllIIll[133]).isEmpty() ? 1 : 0)) {
                    Mouse.click((int)Widgets.get((int)lIllllIIll[133], (int)lIllllIIll[55]).getClickPoint().getX(), (int)Widgets.get((int)lIllllIIll[133], (int)lIllllIIll[55]).getClickPoint().getY(), (boolean)lIllllIIll[0]);
                    Time.sleepTicks((int)lIllllIIll[9]);

                    Mouse.click((int)Widgets.get((int)lIllllIIll[133], (int)lIllllIIll[65]).getClickPoint().getX(), (int)Widgets.get((int)lIllllIIll[133], (int)lIllllIIll[65]).getClickPoint().getY(), (boolean)lIllllIIll[0]);
                    Time.sleepTicks((int)lIllllIIll[9]);

                    Mouse.click((int)Widgets.get((int)lIllllIIll[133], (int)lIllllIIll[67]).getClickPoint().getX(), (int)Widgets.get((int)lIllllIIll[133], (int)lIllllIIll[67]).getClickPoint().getY(), (boolean)lIllllIIll[0]);
                    Time.sleepTicks((int)lIllllIIll[9]);

                    Mouse.click((int)Widgets.get((int)lIllllIIll[133], (int)lIllllIIll[22]).getClickPoint().getX(), (int)Widgets.get((int)lIllllIIll[133], (int)lIllllIIll[22]).getClickPoint().getY(), (boolean)lIllllIIll[0]);
                    Time.sleepTicks((int)lIllllIIll[9]);

                    Mouse.click((int)Widgets.get((int)lIllllIIll[133], (int)lIllllIIll[76]).getClickPoint().getX(), (int)Widgets.get((int)lIllllIIll[133], (int)lIllllIIll[76]).getClickPoint().getY(), (boolean)lIllllIIll[0]);
                    Time.sleepTicks((int)lIllllIIll[9]);

                    Mouse.click((int)Widgets.get((int)lIllllIIll[133], (int)lIllllIIll[79]).getClickPoint().getX(), (int)Widgets.get((int)lIllllIIll[133], (int)lIllllIIll[79]).getClickPoint().getY(), (boolean)lIllllIIll[0]);
                    Time.sleepTicks((int)lIllllIIll[8]);

                }
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[136])) {
                w.bg();
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[137])) {
                String[] stringArray = new String[lIllllIIll[0]];
                stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[138]];
                if (w.lIIlllllIllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray19 = new String[lIllllIIll[0]];
                    stringArray19[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[139]];
                    String[] stringArray20 = new String[lIllllIIll[0]];
                    stringArray20[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[140]];
                    Inventory.getFirst((String[])stringArray19).useOn(Inventory.getFirst((String[])stringArray20));
                    Time.sleepTicks((int)lIllllIIll[9]);

                }
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[141])) {
                if (w.lIIlllllIlllI(di, lIllllIIll[0])) {
                    aN.sa += lIllllIIll[0];
                    aN.u(AccBuilderSotf.m);
                    di += lIllllIIll[0];
                    aN.sa = lIllllIIll[1];
                    dj = lIllllIIll[1];
                }
                w.bg();
            }
            g.a(cE);
        }
    }

    private static boolean lIIllllllIIII(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (w.lIIllllllIIIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[2])) {
            bl = lIllllIIll[0];

            if (((0x80 ^ 0xAA ^ (0x45 ^ 0x27)) & (0x42 ^ 0x19 ^ (0x90 ^ 0x83) ^ -1)) != 0) {
                return (2 & (2 ^ -1)) != 0;
            }
        } else {
            bl = lIllllIIll[1];
        }
        return bl;
    }

}

