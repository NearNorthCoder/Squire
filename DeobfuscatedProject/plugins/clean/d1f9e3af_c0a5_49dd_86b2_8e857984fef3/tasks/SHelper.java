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
package gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks;

import gg.squire.account.AccBuilderEasyClues;
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
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.EHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.FHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.NHelper;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AHHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AMHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.ANHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.EHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.FHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.GHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.IHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.MHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.NHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.RHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.THelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.YHelper;
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

public class SHelper
implements W {
    static  WorldArea cq;
    
    public static  List<d> bv;
    static  int cl;
    static  WorldPoint bX;
    private static  String cu;
    static  boolean cm;
    static  WorldArea co;
    static  WorldPoint cs;
    static  WorldArea cp;
    static  WorldPoint cr;
    private static  int ct;

    public static  boolean bt;

    private static int lllIlIIIllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lllIlIlIIlI(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public String U() {
        if (s.lllIlIlIIlI(cu, lIIIllIII[lIIIllIIl[159]])) {
            return lIIIllIII[lIIIllIIl[160]];
        }
        return "Animal Magnetism - " + cu;
    }

    private static boolean lllIlIIllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIlIIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllIlIIlIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lllIlIIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public int T() {
        try {
            s.aI();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((65 + 79 - 41 + 58 ^ 91 + 113 - 176 + 137) == 0) {
            return (125 + 19 - 26 + 105 ^ 53 + 155 - 70 + 20) & (207 + 189 - 372 + 194 ^ 149 + 122 - 249 + 133 ^ -1);
        }
        return lIIIllIIl[100];
    }

    private static void aJ() {
        WorldArea worldArea = new WorldArea(lIIIllIIl[52], lIIIllIIl[56], lIIIllIIl[16], lIIIllIIl[4], lIIIllIIl[1]);
        if (s.lllIlIIIlll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] stringArray = new String[lIIIllIIl[0]];
            stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[142]];
            TileObjects.getNearest((String[])stringArray).interact(lIIIllIII[lIIIllIIl[143]]);
            Time.sleepTicks((int)lIIIllIIl[9]);

        }
        if (s.lllIlIIlIIl(co.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && s.lllIlIIllll(Players.getLocal().getWorldLocation().distanceTo(bX), lIIIllIIl[21])) {
            AccBuilderEasyClues.c = lIIIllIII[lIIIllIIl[144]];
            if (s.lllIlIIIlll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)bX);

            Time.sleepTicks((int)lIIIllIIl[0]);

        }
        if (s.lllIlIIIlll(co.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && s.lllIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(bX), lIIIllIIl[21])) {
            g.a(lIIIllIII[lIIIllIIl[145]], bR);
        }
        if (s.lllIlIIIlll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIIllIIl[52], lIIIllIIl[53], lIIIllIIl[1])) ? 1 : 0)) {
            String[] stringArray = new String[lIIIllIIl[0]];
            stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[99]];
            TileObjects.getNearest((String[])stringArray).interact(lIIIllIII[lIIIllIIl[146]]);
            Time.sleepTicks((int)lIIIllIIl[9]);

        }
    }

    private static void af() {
        block46: {
            d lIIIlllIIlIIlII;
            block45: {
                block44: {
                    block43: {
                        Object lIIIlllIIlIIlIl;
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
                                                                        int[] nArray = new int[lIIIllIIl[0]];
                                                                        nArray[s.lIIIllIIl[1]] = lIIIllIIl[43];
                                                                        if (!s.lllIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block31;
                                                                        int[] nArray2 = new int[lIIIllIIl[0]];
                                                                        nArray2[s.lIIIllIIl[1]] = lIIIllIIl[43];
                                                                        if (!s.lllIlIIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) break block32;
                                                                        int[] nArray3 = new int[lIIIllIIl[0]];
                                                                        nArray3[s.lIIIllIIl[1]] = lIIIllIIl[43];
                                                                        if (!s.lllIlIIlIII(Bank.getFirst((int[])nArray3).getQuantity(), lIIIllIIl[4])) break block32;
                                                                    }
                                                                    lIIIlllIIlIIlIl = new DHelper(lIIIllIIl[43], lIIIllIIl[4], e.c(lIIIllIIl[147], lIIIllIIl[148]));
                                                                    bv.add((DHelper) IIIlllIIlIIlIl);

                                                                }
                                                                int[] nArray = new int[lIIIllIIl[0]];
                                                                nArray[s.lIIIllIIl[1]] = lIIIllIIl[30];
                                                                if (!s.lllIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                                                                int[] nArray4 = new int[lIIIllIIl[0]];
                                                                nArray4[s.lIIIllIIl[1]] = lIIIllIIl[30];
                                                                if (!s.lllIlIIIlll(Bank.contains((int[])nArray4) ? 1 : 0)) break block34;
                                                                int[] nArray5 = new int[lIIIllIIl[0]];
                                                                nArray5[s.lIIIllIIl[1]] = lIIIllIIl[30];
                                                                if (!s.lllIlIIlIII(Bank.getFirst((int[])nArray5).getQuantity(), lIIIllIIl[16])) break block34;
                                                            }
                                                            lIIIlllIIlIIlIl = new DHelper(lIIIllIIl[30], lIIIllIIl[16], lIIIllIIl[149]);
                                                            bv.add((DHelper) IIIlllIIlIIlIl);

                                                        }
                                                        int[] nArray = new int[lIIIllIIl[0]];
                                                        nArray[s.lIIIllIIl[1]] = lIIIllIIl[31];
                                                        if (!s.lllIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block35;
                                                        int[] nArray6 = new int[lIIIllIIl[0]];
                                                        nArray6[s.lIIIllIIl[1]] = lIIIllIIl[31];
                                                        if (!s.lllIlIIIlll(Bank.contains((int[])nArray6) ? 1 : 0)) break block36;
                                                        int[] nArray7 = new int[lIIIllIIl[0]];
                                                        nArray7[s.lIIIllIIl[1]] = lIIIllIIl[31];
                                                        if (!s.lllIlIIlIII(Bank.getFirst((int[])nArray7).getQuantity(), lIIIllIIl[28])) break block36;
                                                    }
                                                    lIIIlllIIlIIlIl = new DHelper(lIIIllIIl[31], lIIIllIIl[28], lIIIllIIl[150]);
                                                    bv.add((DHelper) IIIlllIIlIIlIl);

                                                }
                                                int[] nArray = new int[lIIIllIIl[0]];
                                                nArray[s.lIIIllIIl[1]] = lIIIllIIl[103];
                                                if (s.lllIlIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    lIIIlllIIlIIlIl = new DHelper(lIIIllIIl[103], lIIIllIIl[8], lIIIllIIl[151]);
                                                    bv.add((DHelper) IIIlllIIlIIlIl);

                                                }
                                                int[] nArray8 = new int[lIIIllIIl[0]];
                                                nArray8[s.lIIIllIIl[1]] = lIIIllIIl[37];
                                                if (s.lllIlIIlIIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                                    lIIIlllIIlIIlIl = new DHelper(lIIIllIIl[37], lIIIllIIl[0], lIIIllIIl[27]);
                                                    bv.add((DHelper) IIIlllIIlIIlIl);

                                                }
                                                int[] nArray9 = new int[lIIIllIIl[0]];
                                                nArray9[s.lIIIllIIl[1]] = lIIIllIIl[32];
                                                if (!s.lllIlIIIlll(Bank.contains((int[])nArray9) ? 1 : 0)) break block37;
                                                int[] nArray10 = new int[lIIIllIIl[0]];
                                                nArray10[s.lIIIllIIl[1]] = lIIIllIIl[32];
                                                if (!s.lllIlIIIlll(Bank.contains((int[])nArray10) ? 1 : 0)) break block38;
                                                int[] nArray11 = new int[lIIIllIIl[0]];
                                                nArray11[s.lIIIllIIl[1]] = lIIIllIIl[32];
                                                if (!s.lllIlIIlIII(Bank.getFirst((int[])nArray11).getQuantity(), lIIIllIIl[13])) break block38;
                                            }
                                            lIIIlllIIlIIlIl = new DHelper(lIIIllIIl[32], lIIIllIIl[13], lIIIllIIl[27]);
                                            bv.add((DHelper) IIIlllIIlIIlIl);

                                        }
                                        int[] nArray = new int[lIIIllIIl[0]];
                                        nArray[s.lIIIllIIl[1]] = lIIIllIIl[33];
                                        if (!s.lllIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block39;
                                        int[] nArray12 = new int[lIIIllIIl[0]];
                                        nArray12[s.lIIIllIIl[1]] = lIIIllIIl[33];
                                        if (!s.lllIlIIIlll(Bank.contains((int[])nArray12) ? 1 : 0)) break block40;
                                        int[] nArray13 = new int[lIIIllIIl[0]];
                                        nArray13[s.lIIIllIIl[1]] = lIIIllIIl[33];
                                        if (!s.lllIlIIlIII(Bank.getFirst((int[])nArray13).getQuantity(), lIIIllIIl[8])) break block40;
                                    }
                                    lIIIlllIIlIIlIl = new DHelper(lIIIllIIl[33], lIIIllIIl[8], lIIIllIIl[27]);
                                    bv.add((DHelper) IIIlllIIlIIlIl);

                                }
                                int[] nArray = new int[lIIIllIIl[0]];
                                nArray[s.lIIIllIIl[1]] = lIIIllIIl[29];
                                if (!s.lllIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block41;
                                int[] nArray14 = new int[lIIIllIIl[0]];
                                nArray14[s.lIIIllIIl[1]] = lIIIllIIl[29];
                                if (!s.lllIlIIIlll(Bank.contains((int[])nArray14) ? 1 : 0)) break block42;
                                int[] nArray15 = new int[lIIIllIIl[0]];
                                nArray15[s.lIIIllIIl[1]] = lIIIllIIl[29];
                                if (!s.lllIlIIlIII(Bank.getFirst((int[])nArray15).getQuantity(), lIIIllIIl[8])) break block42;
                            }
                            lIIIlllIIlIIlIl = new DHelper(lIIIllIIl[29], lIIIllIIl[13], lIIIllIIl[27]);
                            bv.add((DHelper) IIIlllIIlIIlIl);

                        }
                        int[] nArray = new int[lIIIllIIl[0]];
                        nArray[s.lIIIllIIl[1]] = lIIIllIIl[39];
                        if (s.lllIlIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            lIIIlllIIlIIlIl = new DHelper(lIIIllIIl[39], lIIIllIIl[0], lIIIllIIl[27]);
                            bv.add((DHelper) IIIlllIIlIIlIl);

                        }
                        int[] nArray16 = new int[lIIIllIIl[0]];
                        nArray16[s.lIIIllIIl[1]] = lIIIllIIl[38];
                        if (s.lllIlIIlIIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                            lIIIlllIIlIIlIl = new DHelper(lIIIllIIl[38], lIIIllIIl[0], lIIIllIIl[27]);
                            bv.add((DHelper) IIIlllIIlIIlIl);

                        }
                        int[] nArray17 = new int[lIIIllIIl[0]];
                        nArray17[s.lIIIllIIl[1]] = lIIIllIIl[40];
                        if (s.lllIlIIlIIl(Bank.contains((int[])nArray17) ? 1 : 0)) {
                            lIIIlllIIlIIlIl = new DHelper(lIIIllIIl[40], lIIIllIIl[0], lIIIllIIl[152]);
                            bv.add((DHelper) IIIlllIIlIIlIl);

                        }
                        int[] nArray18 = new int[lIIIllIIl[0]];
                        nArray18[s.lIIIllIIl[1]] = lIIIllIIl[41];
                        if (s.lllIlIIlIIl(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            lIIIlllIIlIIlIl = new DHelper(lIIIllIIl[41], lIIIllIIl[0], lIIIllIIl[153] + e.c(lIIIllIIl[154], lIIIllIIl[155]));
                            bv.add((DHelper) IIIlllIIlIIlIl);

                        }
                        if (s.lllIlIIlIIl(Bank.contains((Predicate)(lIIIlllIIlIIlIl = item -> item.getName().toLowerCase().contains(lIIIllIII[lIIIllIIl[161]]))) ? 1 : 0)) {
                            lIIIlllIIlIIlII = new DHelper(lIIIllIIl[156], lIIIllIIl[8], lIIIllIIl[157]);
                            bv.add(lIIIlllIIlIIlII);

                        }
                        int[] nArray19 = new int[lIIIllIIl[0]];
                        nArray19[s.lIIIllIIl[1]] = lIIIllIIl[34];
                        if (!s.lllIlIIIlll(Bank.contains((int[])nArray19) ? 1 : 0)) break block43;
                        int[] nArray20 = new int[lIIIllIIl[0]];
                        nArray20[s.lIIIllIIl[1]] = lIIIllIIl[34];
                        if (!s.lllIlIIIlll(Bank.contains((int[])nArray20) ? 1 : 0)) break block44;
                        int[] nArray21 = new int[lIIIllIIl[0]];
                        nArray21[s.lIIIllIIl[1]] = lIIIllIIl[34];
                        if (!s.lllIlIIlIII(Bank.getFirst((int[])nArray21).getQuantity(), lIIIllIIl[13])) break block44;
                    }
                    lIIIlllIIlIIlII = new DHelper(lIIIllIIl[34], lIIIllIIl[13], i.bq);
                    bv.add(lIIIlllIIlIIlII);

                }
                int[] nArray = new int[lIIIllIIl[0]];
                nArray[s.lIIIllIIl[1]] = lIIIllIIl[36];
                if (!s.lllIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray22 = new int[lIIIllIIl[0]];
                nArray22[s.lIIIllIIl[1]] = lIIIllIIl[36];
                if (!s.lllIlIIIlll(Bank.contains((int[])nArray22) ? 1 : 0)) break block46;
                int[] nArray23 = new int[lIIIllIIl[0]];
                nArray23[s.lIIIllIIl[1]] = lIIIllIIl[36];
                if (!s.lllIlIIlIII(Bank.getFirst((int[])nArray23).getQuantity(), lIIIllIIl[28])) break block46;
            }
            lIIIlllIIlIIlII = new DHelper(lIIIllIIl[36], lIIIllIIl[22], lIIIllIIl[158]);
            bv.add(lIIIlllIIlIIlII);

        }
    }

    private static boolean lllIlIIllIl(int n2) {
        return n2 > 0;
    }

        return String.valueOf(lIIIlllIIIlIlIl);
    }

    /*
     * WARNING - void declaration
     */
    private static boolean ab() {
        void lIIIlllIIlIlIIl;
        int[] nArray = new int[lIIIllIIl[20]];
        nArray[s.lIIIllIIl[1]] = lIIIllIIl[36];
        nArray[s.lIIIllIIl[0]] = lIIIllIIl[37];
        nArray[s.lIIIllIIl[9]] = lIIIllIIl[34];
        nArray[s.lIIIllIIl[11]] = lIIIllIIl[40];
        nArray[s.lIIIllIIl[13]] = lIIIllIIl[41];
        nArray[s.lIIIllIIl[8]] = lIIIllIIl[30];
        nArray[s.lIIIllIIl[16]] = lIIIllIIl[31];
        int[] nArray2 = nArray;
        int lIIIlllIIlIlIII = lIIIllIIl[1];
        while (s.lllIlIIlIII(lIIIlllIIlIlIII, ((void)lIIIlllIIlIlIIl).length)) {
            int[] nArray3 = new int[lIIIllIIl[0]];
            nArray3[s.lIIIllIIl[1]] = lIIIlllIIlIlIIl[lIIIlllIIlIlIII];
            if (s.lllIlIIlIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIIllIIl[1];
            }
            ++lIIIlllIIlIlIII;

            return false;
        }
        return lIIIllIIl[0];
    }

    private static boolean lllIlIIIlll(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (s.lllIlIIlIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[2])) {
            bl = lIIIllIIl[0];

            if (((127 + 24 - 100 + 97 ^ 127 + 15 - 104 + 94) & (0x25 ^ 0x40 ^ (0xCA ^ 0xBF) ^ -1)) >= (0x12 ^ 0x4D ^ (0x7E ^ 0x25))) {
                return ((0x78 ^ 0x3B ^ (0x54 ^ 0x2A)) & (0xD4 ^ 0x80 ^ (0xF ^ 0x66) ^ -1)) != 0;
            }
        } else {
            bl = lIIIllIIl[1];
        }
        return bl;
    }

    private static boolean lllIlIlIIII(int n2, int n3) {
        return n2 <= n3;
    }

    public static void aI() {
        block115: {
            WorldPoint lIIIlllIIlIlllI;
            Object lIIIlllIIlIllll;
            block116: {
                block123: {
                    block118: {
                        block122: {
                            block121: {
                                block120: {
                                    block119: {
                                        block117: {
                                            if (s.lllIlIIIlll(bt ? 1 : 0)) {
                                                b.a(bv);
                                                if (s.lllIlIIlIII(bv.size(), lIIIllIIl[0])) {
                                                    System.out.println(lIIIllIII[lIIIllIIl[1]]);
                                                    bt = lIIIllIIl[1];
                                                }
                                            }
                                            if (!s.lllIlIIlIIl(bt ? 1 : 0) || !s.lllIlIIlIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[2])) break block115;
                                            if (s.lllIlIIlIII(e.j(lIIIllIIl[3]), lIIIllIIl[4])) {
                                                cu = lIIIllIII[lIIIllIIl[0]];
                                                F.bG();
                                            }
                                            if (s.lllIlIIlIlI(e.j(lIIIllIIl[3]), lIIIllIIl[4]) && (!s.lllIlIIlIll(e.j(lIIIllIIl[5]), lIIIllIIl[6]) || s.lllIlIIlIII(e.j(lIIIllIIl[7]), lIIIllIIl[8]))) {
                                                cu = lIIIllIII[lIIIllIIl[9]];
                                                y.aX();
                                            }
                                            if (s.lllIlIIlIlI(e.j(lIIIllIIl[3]), lIIIllIIl[4]) && s.lllIlIIlIll(e.j(lIIIllIIl[5]), lIIIllIIl[6]) && s.lllIlIIlIll(e.j(lIIIllIIl[7]), lIIIllIIl[8]) && s.lllIlIIlIII(e.j(lIIIllIIl[10]), lIIIllIIl[11])) {
                                                cu = lIIIllIII[lIIIllIIl[11]];
                                                N.cn();
                                            }
                                            if (s.lllIlIIlIlI(e.j(lIIIllIIl[3]), lIIIllIIl[4]) && s.lllIlIIlIll(e.j(lIIIllIIl[5]), lIIIllIIl[6]) && s.lllIlIIlIll(e.j(lIIIllIIl[7]), lIIIllIIl[8]) && s.lllIlIIlIlI(e.j(lIIIllIIl[10]), lIIIllIIl[11]) && s.lllIlIIlIII(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIIl[12])) {
                                                cu = lIIIllIII[lIIIllIIl[13]];
                                                ah.dO();
                                            }
                                            if (s.lllIlIIlIlI(e.j(lIIIllIIl[3]), lIIIllIIl[4]) && s.lllIlIIlIll(e.j(lIIIllIIl[5]), lIIIllIIl[6]) && s.lllIlIIlIll(e.j(lIIIllIIl[7]), lIIIllIIl[8]) && s.lllIlIIlIlI(e.j(lIIIllIIl[10]), lIIIllIIl[11]) && s.lllIlIIlIll(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIIl[12]) && s.lllIlIIlIII(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIllIIl[14])) {
                                                cu = lIIIllIII[lIIIllIIl[8]];
                                                am.ez();
                                            }
                                            if (s.lllIlIIlIlI(e.j(lIIIllIIl[3]), lIIIllIIl[4]) && s.lllIlIIlIll(e.j(lIIIllIIl[5]), lIIIllIIl[6]) && s.lllIlIIlIll(e.j(lIIIllIIl[7]), lIIIllIIl[8]) && s.lllIlIIlIlI(e.j(lIIIllIIl[10]), lIIIllIIl[11]) && s.lllIlIIlIll(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIIl[12]) && s.lllIlIIlIll(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIllIIl[14]) && s.lllIlIIlIII(Skills.getLevel((Skill)Skill.RANGED), lIIIllIIl[15])) {
                                                cu = lIIIllIII[lIIIllIIl[16]];
                                                if (s.lllIlIIlIII(ct, lIIIllIIl[0])) {
                                                    n.bU = lIIIllIIl[1];
                                                    ct += lIIIllIIl[0];
                                                }
                                                m.ap();
                                            }
                                            if (s.lllIlIIlIlI(e.j(lIIIllIIl[3]), lIIIllIIl[4]) && s.lllIlIIlIll(e.j(lIIIllIIl[5]), lIIIllIIl[6]) && s.lllIlIIlIll(e.j(lIIIllIIl[7]), lIIIllIIl[8]) && s.lllIlIIlIlI(e.j(lIIIllIIl[10]), lIIIllIIl[11]) && s.lllIlIIlIll(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIIl[12]) && s.lllIlIIlIll(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIllIIl[14]) && s.lllIlIIlIll(Skills.getLevel((Skill)Skill.RANGED), lIIIllIIl[15])) {
                                                if (!s.lllIlIIlIll(e.j(lIIIllIIl[17]), lIIIllIIl[18]) || s.lllIlIIlIII(Skills.getLevel((Skill)Skill.HUNTER), lIIIllIIl[19])) {
                                                    cu = lIIIllIII[lIIIllIIl[20]];
                                                    E.bD();
                                                }
                                                if (s.lllIlIIlIll(e.j(lIIIllIIl[17]), lIIIllIIl[18]) && s.lllIlIIlIll(Skills.getLevel((Skill)Skill.HUNTER), lIIIllIIl[19]) && s.lllIlIIlIII(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIllIIl[6])) {
                                                    cu = lIIIllIII[lIIIllIIl[21]];
                                                    A.bq();
                                                }
                                                if (s.lllIlIIlIll(e.j(lIIIllIIl[17]), lIIIllIIl[18]) && s.lllIlIIlIll(Skills.getLevel((Skill)Skill.HUNTER), lIIIllIIl[19]) && s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIllIIl[6]) && s.lllIlIIlIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIIllIIl[22])) {
                                                    cu = lIIIllIII[lIIIllIIl[19]];
                                                    r.aG();
                                                }
                                                if (s.lllIlIIlIll(e.j(lIIIllIIl[17]), lIIIllIIl[18]) && s.lllIlIIlIll(Skills.getLevel((Skill)Skill.HUNTER), lIIIllIIl[19]) && s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIllIIl[6]) && s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIIllIIl[22]) && s.lllIlIIlIII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIllIIl[19])) {
                                                    String[] stringArray = new String[lIIIllIIl[0]];
                                                    stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[4]];
                                                    if (s.lllIlIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        cu = lIIIllIII[lIIIllIIl[23]];
                                                        t.aL();
                                                    }
                                                }
                                                t.aM();
                                            }
                                            if (!s.lllIlIIlIIl(s.ab() ? 1 : 0) || !s.lllIlIIlIIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId())) || !s.lllIlIIlIll(e.j(lIIIllIIl[17]), lIIIllIIl[18]) || !s.lllIlIIlIll(Skills.getLevel((Skill)Skill.HUNTER), lIIIllIIl[19]) || !s.lllIlIIlIll(Skills.getLevel((Skill)Skill.RANGED), lIIIllIIl[15]) || !s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIllIIl[6]) || !s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIIllIIl[22]) || !s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIllIIl[19])) break block116;
                                            String[] stringArray = new String[lIIIllIIl[0]];
                                            stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[24]];
                                            if (!s.lllIlIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block116;
                                            cu = lIIIllIII[lIIIllIIl[25]];
                                            lIIIlllIIlIllll = BankLocation.getNearest();
                                            if (s.lllIlIIllII(lIIIlllIIlIllll) && s.lllIlIIlIIl(lIIIlllIIlIllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderEasyClues.c = lIIIllIII[lIIIllIIl[26]];
                                                a.a((BankLocation)lIIIlllIIlIllll);
                                            }
                                            if (!s.lllIlIIllII(lIIIlllIIlIllll) || !s.lllIlIIIlll(lIIIlllIIlIllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block116;
                                            if (s.lllIlIIlIIl(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIllIIl[27]);

                                            }
                                            if (!s.lllIlIIIlll(Bank.isOpen() ? 1 : 0)) break block116;
                                            AccBuilderEasyClues.c = lIIIllIII[lIIIllIIl[28]];
                                            if (s.lllIlIIllIl(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIIIllIIl[13]);

                                            }
                                            if (s.lllIlIIllIl(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIIIllIIl[9]);

                                            }
                                            int[] nArray = new int[lIIIllIIl[0]];
                                            nArray[s.lIIIllIIl[1]] = lIIIllIIl[29];
                                            if (!s.lllIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block117;
                                            int[] nArray2 = new int[lIIIllIIl[0]];
                                            nArray2[s.lIIIllIIl[1]] = lIIIllIIl[29];
                                            if (!s.lllIlIIlIll(Bank.getFirst((int[])nArray2).getQuantity(), lIIIllIIl[8])) break block118;
                                        }
                                        int[] nArray = new int[lIIIllIIl[0]];
                                        nArray[s.lIIIllIIl[1]] = lIIIllIIl[30];
                                        if (!s.lllIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block119;
                                        int[] nArray3 = new int[lIIIllIIl[0]];
                                        nArray3[s.lIIIllIIl[1]] = lIIIllIIl[30];
                                        if (!s.lllIlIIlIll(Bank.getFirst((int[])nArray3).getQuantity(), lIIIllIIl[16])) break block118;
                                    }
                                    int[] nArray = new int[lIIIllIIl[0]];
                                    nArray[s.lIIIllIIl[1]] = lIIIllIIl[31];
                                    if (!s.lllIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block120;
                                    int[] nArray4 = new int[lIIIllIIl[0]];
                                    nArray4[s.lIIIllIIl[1]] = lIIIllIIl[31];
                                    if (!s.lllIlIIlIll(Bank.getFirst((int[])nArray4).getQuantity(), lIIIllIIl[28])) break block118;
                                }
                                int[] nArray = new int[lIIIllIIl[0]];
                                nArray[s.lIIIllIIl[1]] = lIIIllIIl[32];
                                if (!s.lllIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block121;
                                int[] nArray5 = new int[lIIIllIIl[0]];
                                nArray5[s.lIIIllIIl[1]] = lIIIllIIl[32];
                                if (!s.lllIlIIlIll(Bank.getFirst((int[])nArray5).getQuantity(), lIIIllIIl[13])) break block118;
                            }
                            int[] nArray = new int[lIIIllIIl[0]];
                            nArray[s.lIIIllIIl[1]] = lIIIllIIl[33];
                            if (!s.lllIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block122;
                            int[] nArray6 = new int[lIIIllIIl[0]];
                            nArray6[s.lIIIllIIl[1]] = lIIIllIIl[33];
                            if (!s.lllIlIIlIll(Bank.getFirst((int[])nArray6).getQuantity(), lIIIllIIl[8])) break block118;
                        }
                        int[] nArray = new int[lIIIllIIl[0]];
                        nArray[s.lIIIllIIl[1]] = lIIIllIIl[34];
                        if (!s.lllIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block123;
                        int[] nArray7 = new int[lIIIllIIl[0]];
                        nArray7[s.lIIIllIIl[1]] = lIIIllIIl[34];
                        if (!s.lllIlIIlIII(Bank.getFirst((int[])nArray7).getQuantity(), lIIIllIIl[13])) break block123;
                    }
                    s.af();
                    System.out.println(lIIIllIII[lIIIllIIl[35]]);
                    bt = lIIIllIIl[0];
                    return;
                }
                int[] nArray = new int[lIIIllIIl[23]];
                nArray[s.lIIIllIIl[1]] = lIIIllIIl[36];
                nArray[s.lIIIllIIl[0]] = lIIIllIIl[37];
                nArray[s.lIIIllIIl[9]] = lIIIllIIl[33];
                nArray[s.lIIIllIIl[11]] = lIIIllIIl[38];
                nArray[s.lIIIllIIl[13]] = lIIIllIIl[32];
                nArray[s.lIIIllIIl[8]] = lIIIllIIl[34];
                nArray[s.lIIIllIIl[16]] = lIIIllIIl[39];
                nArray[s.lIIIllIIl[20]] = lIIIllIIl[40];
                nArray[s.lIIIllIIl[21]] = lIIIllIIl[41];
                nArray[s.lIIIllIIl[19]] = lIIIllIIl[30];
                nArray[s.lIIIllIIl[4]] = lIIIllIIl[31];
                if (s.lllIlIIlIIl(e.b(nArray) ? 1 : 0)) {
                    s.af();
                    System.out.println(lIIIllIII[lIIIllIIl[42]]);
                    bt = lIIIllIIl[0];
                    return;
                }
                int[] nArray8 = new int[lIIIllIIl[23]];
                nArray8[s.lIIIllIIl[1]] = lIIIllIIl[36];
                nArray8[s.lIIIllIIl[0]] = lIIIllIIl[37];
                nArray8[s.lIIIllIIl[9]] = lIIIllIIl[33];
                nArray8[s.lIIIllIIl[11]] = lIIIllIIl[38];
                nArray8[s.lIIIllIIl[13]] = lIIIllIIl[32];
                nArray8[s.lIIIllIIl[8]] = lIIIllIIl[34];
                nArray8[s.lIIIllIIl[16]] = lIIIllIIl[39];
                nArray8[s.lIIIllIIl[20]] = lIIIllIIl[40];
                nArray8[s.lIIIllIIl[21]] = lIIIllIIl[41];
                nArray8[s.lIIIllIIl[19]] = lIIIllIIl[30];
                nArray8[s.lIIIllIIl[4]] = lIIIllIIl[31];
                if (s.lllIlIIIlll(e.b(nArray8) ? 1 : 0)) {
                    a.a(lIIIllIIl[34], lIIIllIIl[13]);
                    a.a(lIIIllIIl[37], lIIIllIIl[0]);
                    a.a(lIIIllIIl[43], lIIIllIIl[0]);
                    a.a(lIIIllIIl[32], lIIIllIIl[13]);
                    a.a(lIIIllIIl[29], lIIIllIIl[13]);
                    a.a(lIIIllIIl[40], lIIIllIIl[0]);
                    a.a(lIIIllIIl[41], lIIIllIIl[0]);
                    a.a(lIIIllIIl[36], lIIIllIIl[4]);
                    a.a(lIIIllIIl[30], lIIIllIIl[4]);
                    a.a(lIIIllIIl[31], lIIIllIIl[28]);
                    a.a(lIIIllIIl[44], lIIIllIIl[0]);
                    a.a(lIIIllIIl[45], lIIIllIIl[27]);
                }
            }
            if (s.lllIlIIIlll(Inventory.contains((int[])f.aV) ? 1 : 0) && s.lllIlIIlIII(Movement.getRunEnergy(), lIIIllIIl[15])) {
                Inventory.getFirst((int[])f.aV).interact(lIIIllIII[lIIIllIIl[46]]);
                Time.sleepTicks((int)lIIIllIIl[0]);

            }
            if (s.lllIlIIIlll(Inventory.contains((int[])f.aS) ? 1 : 0) && s.lllIlIIlIII(Prayers.getPoints(), lIIIllIIl[47])) {
                Inventory.getFirst((int[])f.aS).interact(lIIIllIII[lIIIllIIl[12]]);
            }
            if (s.lllIlIIlllI(s.lllIlIIIllI(e.u(), 60.0))) {
                String[] stringArray = new String[lIIIllIIl[0]];
                stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[48]];
                if (s.lllIlIIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIIllIIl[0]];
                    stringArray2[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[49]];
                    Inventory.getFirst((String[])stringArray2).interact(lIIIllIII[lIIIllIIl[50]]);
                    Time.sleepTicks((int)lIIIllIIl[9]);

                }
            }
            if (s.lllIlIIIlll(s.ab() ? 1 : 0) && s.lllIlIIlIIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()))) {
                if (s.lllIlIIlIIl(co.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && s.lllIlIIllll(Players.getLocal().getWorldLocation().distanceTo(bX), lIIIllIIl[21])) {
                    AccBuilderEasyClues.c = lIIIllIII[lIIIllIIl[51]];
                    if (s.lllIlIIIlll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)bX);

                    Time.sleepTicks((int)lIIIllIIl[0]);

                }
                if (s.lllIlIIIlll(co.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && s.lllIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(bX), lIIIllIIl[21])) {
                    cl = lIIIllIIl[1];
                    g.a(lIIIllIII[lIIIllIIl[47]], bR);
                }
                if (s.lllIlIIIlll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIIllIIl[52], lIIIllIIl[53], lIIIllIIl[1])) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIllIIl[0]];
                    stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[54]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIllIII[lIIIllIIl[55]]);
                    Time.sleepTicks((int)lIIIllIIl[9]);

                }
                if (s.lllIlIIIlll((lIIIlllIIlIllll = new WorldArea(lIIIllIIl[52], lIIIllIIl[56], lIIIllIIl[16], lIIIllIIl[4], lIIIllIIl[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIllIIl[0]];
                    stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[57]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIllIII[lIIIllIIl[58]]);
                    Time.sleepTicks((int)lIIIllIIl[9]);

                }
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[4])) {
                int[] nArray = new int[lIIIllIIl[0]];
                nArray[s.lIIIllIIl[1]] = lIIIllIIl[44];
                if (s.lllIlIIlIIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray9 = new int[lIIIllIIl[0]];
                    nArray9[s.lIIIllIIl[1]] = lIIIllIIl[44];
                    Inventory.getFirst((int[])nArray9).interact(lIIIllIII[lIIIllIIl[59]]);
                }
                int[] nArray10 = new int[lIIIllIIl[0]];
                nArray10[s.lIIIllIIl[1]] = lIIIllIIl[60];
                if (s.lllIlIIlIIl(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                    block114: {
                        lIIIlllIIlIllll = new WorldPoint(lIIIllIIl[61], lIIIllIIl[62], lIIIllIIl[1]);
                        int[] nArray11 = new int[lIIIllIIl[0]];
                        nArray11[s.lIIIllIIl[1]] = lIIIllIIl[63];
                        if (s.lllIlIIlIIl(Inventory.contains((int[])nArray11) ? 1 : 0) && s.lllIlIIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIlllIIlIllll), lIIIllIIl[48])) {
                            if (s.lllIlIIllll(Players.getLocal().getWorldLocation().distanceTo(cr), lIIIllIIl[8])) {
                                AccBuilderEasyClues.c = lIIIllIII[lIIIllIIl[64]];
                                Movement.walkTo((WorldPoint)cr);

                                Time.sleepTicks((int)lIIIllIIl[0]);

                            }
                            if (s.lllIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(cr), lIIIllIIl[8])) {
                                if (s.lllIlIIlIIl(Shop.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIIIllIIl[0]];
                                    stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[65]];
                                    NPCs.getNearest((String[])stringArray).interact(lIIIllIII[lIIIllIIl[10]]);
                                    Time.sleepTicks((int)lIIIllIIl[9]);

                                }
                                if (s.lllIlIIIlll(Shop.isOpen() ? 1 : 0)) {
                                    Shop.buyFive((int)lIIIllIIl[63]);
                                    Time.sleepTicks((int)lIIIllIIl[11]);

                                }
                            }
                        }
                        int[] nArray12 = new int[lIIIllIIl[0]];
                        nArray12[s.lIIIllIIl[1]] = lIIIllIIl[63];
                        if (s.lllIlIIIlll(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                            if (s.lllIlIIlIIl(cp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && s.lllIlIIlIIl(cq.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                int[] nArray13 = new int[lIIIllIIl[0]];
                                nArray13[s.lIIIllIIl[1]] = lIIIllIIl[31];
                                if (s.lllIlIIIlll(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                    int[] nArray14 = new int[lIIIllIIl[0]];
                                    nArray14[s.lIIIllIIl[1]] = lIIIllIIl[31];
                                    Inventory.getFirst((int[])nArray14).interact(lIIIllIII[lIIIllIIl[66]]);
                                    Time.sleepTicks((int)lIIIllIIl[20]);

                                }
                            }
                            if (!s.lllIlIIlIIl(cp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || s.lllIlIIIlll(cq.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                lIIIlllIIlIlllI = new WorldPoint(lIIIllIIl[61], lIIIllIIl[62], lIIIllIIl[1]);
                                if (s.lllIlIIllll(Players.getLocal().getWorldLocation().distanceTo(lIIIlllIIlIlllI), lIIIllIIl[8]) && s.lllIlIIlIIl(Players.getLocal().getWorldLocation().getPlane())) {
                                    AccBuilderEasyClues.c = lIIIllIII[lIIIllIIl[67]];
                                    Movement.walkTo((WorldPoint)lIIIlllIIlIlllI);

                                    Time.sleepTicks((int)lIIIllIIl[0]);

                                }
                                String[] stringArray = new String[lIIIllIIl[0]];
                                stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[14]];
                                if (s.lllIlIIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                    if (s.lllIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(lIIIlllIIlIlllI), lIIIllIIl[8]) && s.lllIlIIlIIl(Players.getLocal().getWorldLocation().getPlane())) {
                                        String[] stringArray3 = new String[lIIIllIIl[0]];
                                        stringArray3[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[68]];
                                        TileObjects.getNearest((String[])stringArray3).interact(lIIIllIII[lIIIllIIl[69]]);
                                        Time.sleepTicks((int)lIIIllIIl[13]);

                                    }
                                    String[] stringArray4 = new String[lIIIllIIl[0]];
                                    stringArray4[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[70]];
                                    if (s.lllIlIIllII(TileObjects.getNearest((String[])stringArray4))) {
                                        String[] stringArray5 = new String[lIIIllIIl[0]];
                                        stringArray5[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[71]];
                                        if (s.lllIlIIIlll(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                                            String[] stringArray6 = new String[lIIIllIIl[0]];
                                            stringArray6[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[22]];
                                            String[] stringArray7 = new String[lIIIllIIl[0]];
                                            stringArray7[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[72]];
                                            Inventory.getFirst((String[])stringArray6).useOn(TileObjects.getNearest((String[])stringArray7));
                                            Time.sleep((long)e.c(lIIIllIIl[73], lIIIllIIl[74]));

                                        }
                                    }
                                }
                                String[] stringArray8 = new String[lIIIllIIl[0]];
                                stringArray8[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[75]];
                                if (s.lllIlIIlIIl(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                                    if (s.lllIlIIlIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIllIIl[0])) {
                                        String[] stringArray9 = new String[lIIIllIIl[0]];
                                        stringArray9[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[76]];
                                        TileObjects.getNearest((String[])stringArray9).interact(lIIIllIII[lIIIllIIl[77]]);
                                        Time.sleepTicks((int)lIIIllIIl[8]);

                                    }
                                    if (s.lllIlIIlIIl(Players.getLocal().getWorldLocation().getPlane())) {
                                        do {
                                            String[] stringArray10 = new String[lIIIllIIl[0]];
                                            stringArray10[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[78]];
                                            if (!s.lllIlIIIlll(Inventory.contains((String[])stringArray10) ? 1 : 0)) break block114;
                                            String[] stringArray11 = new String[lIIIllIIl[0]];
                                            stringArray11[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[79]];
                                            TileObjects.getNearest((String[])stringArray11).interact(lIIIllIII[lIIIllIIl[80]]);
                                            Time.sleepTicks((int)lIIIllIIl[9]);

                                        } while (-1 >= -1);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    int[] nArray15 = new int[lIIIllIIl[0]];
                    nArray15[s.lIIIllIIl[1]] = lIIIllIIl[32];
                    if (s.lllIlIIlIIl(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIllIIl[0]];
                        stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[81]];
                        if (s.lllIlIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0) && s.lllIlIlIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIlllIIlIllll), lIIIllIIl[48])) {
                            if (s.lllIlIIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                g.a(lIIIllIII[lIIIllIIl[82]], bR);
                                Time.sleepTicks((int)lIIIllIIl[0]);

                            }
                            g.a(bR);
                        }
                    }
                }
                int[] nArray16 = new int[lIIIllIIl[0]];
                nArray16[s.lIIIllIIl[1]] = lIIIllIIl[60];
                if (s.lllIlIIIlll(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIIllIIl[9]];
                    nArray17[s.lIIIllIIl[1]] = lIIIllIIl[83];
                    nArray17[s.lIIIllIIl[0]] = lIIIllIIl[29];
                    if (s.lllIlIIIlll(Inventory.contains((int[])nArray17) ? 1 : 0)) {
                        int[] nArray18 = new int[lIIIllIIl[9]];
                        nArray18[s.lIIIllIIl[1]] = lIIIllIIl[83];
                        nArray18[s.lIIIllIIl[0]] = lIIIllIIl[29];
                        Inventory.getAll((int[])nArray18).stream().forEach(item -> item.interact(lIIIllIII[lIIIllIIl[162]]));
                    }
                    if (s.lllIlIIllll(Players.getLocal().getWorldLocation().distanceTo(cs), lIIIllIIl[20])) {
                        Movement.walkTo((WorldPoint)cs);

                        Time.sleepTicks((int)lIIIllIIl[0]);

                    }
                    if (s.lllIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(cs), lIIIllIIl[20])) {
                        g.a(lIIIllIII[lIIIllIIl[15]], bR);
                    }
                }
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[48])) {
                g.a(lIIIllIII[lIIIllIIl[84]], bR);
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[64])) {
                g.a(lIIIllIII[lIIIllIIl[85]], bR);
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[22])) {
                g.a(lIIIllIII[lIIIllIIl[86]], bR);
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[15])) {
                g.a(lIIIllIII[lIIIllIIl[87]], bR);
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[6])) {
                g.a(lIIIllIII[lIIIllIIl[88]], bR);
            }
            if (!s.lllIlIlIIIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[89]) || s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[90])) {
                lIIIlllIIlIllll = new WorldPoint(lIIIllIIl[91], lIIIllIIl[92], lIIIllIIl[1]);
                if (s.lllIlIIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIlllIIlIllll), lIIIllIIl[11])) {
                    AccBuilderEasyClues.c = lIIIllIII[lIIIllIIl[93]];
                    Movement.walkTo((WorldPoint)lIIIlllIIlIllll);

                    Time.sleepTicks((int)lIIIllIIl[0]);

                }
                if (s.lllIlIlIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIlllIIlIllll), lIIIllIIl[11])) {
                    g.a(lIIIllIII[lIIIllIIl[94]], bR);
                }
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[95])) {
                if (s.lllIlIIllll(Players.getLocal().getWorldLocation().distanceTo(cs), lIIIllIIl[20])) {
                    Movement.walkTo((WorldPoint)cs);

                    Time.sleepTicks((int)lIIIllIIl[0]);

                }
                if (s.lllIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(cs), lIIIllIIl[20])) {
                    g.a(lIIIllIII[lIIIllIIl[96]], bR);
                }
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[97])) {
                g.a(lIIIllIII[lIIIllIIl[98]], bR);
            }
            if (!s.lllIlIlIIIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[99]) || s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[100])) {
                g.a(lIIIllIII[lIIIllIIl[6]], bR);
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[100])) {
                String[] stringArray = new String[lIIIllIIl[0]];
                stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[101]];
                if (s.lllIlIIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray12 = new String[lIIIllIIl[0]];
                    stringArray12[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[102]];
                    if (s.lllIlIIlIIl(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                        lIIIlllIIlIllll = new HashMap();
                        ((HashMap)lIIIlllIIlIllll).put(lIIIllIIl[33], lIIIllIIl[8]);

                        ((HashMap)lIIIlllIIlIllll).put(lIIIllIIl[38], lIIIllIIl[0]);

                        ((HashMap)lIIIlllIIlIllll).put(lIIIllIIl[39], lIIIllIIl[0]);

                        ((HashMap)lIIIlllIIlIllll).put(lIIIllIIl[103], lIIIllIIl[0]);

                        e.a((HashMap<Integer, Integer>)lIIIlllIIlIllll, lIIIllIIl[1], lIIIllIIl[1]);
                    }
                    String[] stringArray13 = new String[lIIIllIIl[0]];
                    stringArray13[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[104]];
                    if (s.lllIlIIIlll(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        s.aJ();
                    }
                }
            }
            if (!s.lllIlIlIIIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[105]) || s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[106])) {
                String[] stringArray = new String[lIIIllIIl[0]];
                stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[107]];
                lIIIlllIIlIllll = NPCs.getNearest((String[])stringArray);
                if (s.lllIlIIllII(lIIIlllIIlIllll)) {
                    if (s.lllIlIIIlll(Reachable.isInteractable((Locatable)lIIIlllIIlIllll) ? 1 : 0)) {
                        g.a(lIIIllIII[lIIIllIIl[3]], bR);
                    }
                    if (s.lllIlIIlIIl(Reachable.isInteractable((Locatable)lIIIlllIIlIllll) ? 1 : 0)) {
                        Movement.walkTo((Locatable)lIIIlllIIlIllll);

                        Time.sleepTicks((int)lIIIllIIl[0]);

                    }
                }
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[108])) {
                String[] stringArray = new String[lIIIllIIl[0]];
                stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[109]];
                if (s.lllIlIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    lIIIlllIIlIllll = new WorldPoint(lIIIllIIl[110], lIIIllIIl[111], lIIIllIIl[1]);
                    lIIIlllIIlIlllI = new WorldPoint(lIIIllIIl[110], lIIIllIIl[112], lIIIllIIl[1]);
                    if (s.lllIlIIlIIl(Players.getLocal().getWorldLocation().equals(lIIIlllIIlIllll) ? 1 : 0) && s.lllIlIIlIIl(Players.getLocal().getWorldLocation().equals((Object)lIIIlllIIlIlllI) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIllIII[lIIIllIIl[113]];
                        Movement.walkTo((WorldPoint)lIIIlllIIlIllll);

                        Time.sleepTicks((int)lIIIllIIl[0]);

                    }
                    if (s.lllIlIIIlll(Players.getLocal().getWorldLocation().equals(lIIIlllIIlIllll) ? 1 : 0) && s.lllIlIIlIIl(Players.getLocal().getWorldLocation().equals((Object)lIIIlllIIlIlllI) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)lIIIlllIIlIlllI);

                    }
                    if (s.lllIlIIIlll(Players.getLocal().getWorldLocation().equals((Object)lIIIlllIIlIlllI) ? 1 : 0)) {
                        String[] stringArray14 = new String[lIIIllIIl[0]];
                        stringArray14[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[114]];
                        String[] stringArray15 = new String[lIIIllIIl[0]];
                        stringArray15[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[115]];
                        Inventory.getFirst((String[])stringArray14).useOn(Inventory.getFirst((String[])stringArray15));
                        Time.sleepTicks((int)lIIIllIIl[11]);

                    }
                }
                String[] stringArray16 = new String[lIIIllIIl[0]];
                stringArray16[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[89]];
                if (s.lllIlIIIlll(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                    s.aJ();
                }
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[116])) {
                lIIIlllIIlIllll = new WorldPoint(lIIIllIIl[117], lIIIllIIl[118], lIIIllIIl[1]);
                if (s.lllIlIIlIIl(Players.getLocal().getWorldLocation().equals(lIIIlllIIlIllll) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)lIIIlllIIlIllll);

                    Time.sleepTicks((int)lIIIllIIl[0]);

                }
                if (s.lllIlIIIlll(Players.getLocal().getWorldLocation().equals(lIIIlllIIlIllll) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIllIIl[0]];
                    stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[119]];
                    NPCs.getNearest((String[])stringArray).interact(lIIIllIII[lIIIllIIl[120]]);
                    Time.sleepTicks((int)lIIIllIIl[0]);

                }
            }
            if (!s.lllIlIlIIIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[121]) || s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[122])) {
                lIIIlllIIlIllll = new WorldPoint(lIIIllIIl[123], lIIIllIIl[124], lIIIllIIl[1]);
                if (s.lllIlIIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIlllIIlIllll), lIIIllIIl[9])) {
                    if (s.lllIlIIIlll(Inventory.contains((int[])f.aO) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.aO).interact(lIIIllIII[lIIIllIIl[90]]);
                    }
                    AccBuilderEasyClues.c = lIIIllIII[lIIIllIIl[125]];
                    Movement.walkTo((WorldPoint)lIIIlllIIlIllll);

                    Time.sleepTicks((int)lIIIllIIl[0]);

                }
                if (s.lllIlIlIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIlllIIlIllll), lIIIllIIl[9])) {
                    String[] stringArray = new String[lIIIllIIl[0]];
                    stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[126]];
                    lIIIlllIIlIlllI = NPCs.getNearest((String[])stringArray);
                    if (s.lllIlIIllII(lIIIlllIIlIlllI)) {
                        if (s.lllIlIIIlll(Reachable.isInteractable((Locatable)lIIIlllIIlIlllI) ? 1 : 0)) {
                            g.a(lIIIllIII[lIIIllIIl[95]], bR);
                        }
                        if (s.lllIlIIlIIl(Reachable.isInteractable((Locatable)lIIIlllIIlIlllI) ? 1 : 0)) {
                            Movement.walkTo((Locatable)lIIIlllIIlIlllI);

                            Time.sleepTicks((int)lIIIllIIl[0]);

                        }
                    }
                }
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[127])) {
                String[] stringArray = new String[lIIIllIIl[0]];
                stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[128]];
                if (s.lllIlIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    lIIIlllIIlIllll = new WorldPoint(lIIIllIIl[117], lIIIllIIl[118], lIIIllIIl[1]);
                    if (s.lllIlIIlIIl(Players.getLocal().getWorldLocation().equals(lIIIlllIIlIllll) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)lIIIlllIIlIllll);

                        Time.sleepTicks((int)lIIIllIIl[0]);

                    }
                    if (s.lllIlIIIlll(Players.getLocal().getWorldLocation().equals(lIIIlllIIlIllll) ? 1 : 0)) {
                        String[] stringArray17 = new String[lIIIllIIl[0]];
                        stringArray17[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[129]];
                        NPCs.getNearest((String[])stringArray17).interact(lIIIllIII[lIIIllIIl[130]]);
                        Time.sleepTicks((int)lIIIllIIl[0]);

                    }
                }
                String[] stringArray18 = new String[lIIIllIIl[0]];
                stringArray18[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[97]];
                if (s.lllIlIIIlll(Inventory.contains((String[])stringArray18) ? 1 : 0)) {
                    s.aJ();
                }
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[131])) {
                s.aJ();
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[132])) {
                if (s.lllIlIIIlll(Widgets.get((int)lIIIllIIl[133]).isEmpty() ? 1 : 0)) {
                    String[] stringArray = new String[lIIIllIIl[0]];
                    stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[134]];
                    Inventory.getFirst((String[])stringArray).interact(lIIIllIII[lIIIllIIl[135]]);
                    Time.sleepTicks((int)lIIIllIIl[13]);

                }
                if (s.lllIlIIlIIl(Widgets.get((int)lIIIllIIl[133]).isEmpty() ? 1 : 0)) {
                    Mouse.click((int)Widgets.get((int)lIIIllIIl[133], (int)lIIIllIIl[55]).getClickPoint().getX(), (int)Widgets.get((int)lIIIllIIl[133], (int)lIIIllIIl[55]).getClickPoint().getY(), (boolean)lIIIllIIl[0]);
                    Time.sleepTicks((int)lIIIllIIl[9]);

                    Mouse.click((int)Widgets.get((int)lIIIllIIl[133], (int)lIIIllIIl[65]).getClickPoint().getX(), (int)Widgets.get((int)lIIIllIIl[133], (int)lIIIllIIl[65]).getClickPoint().getY(), (boolean)lIIIllIIl[0]);
                    Time.sleepTicks((int)lIIIllIIl[9]);

                    Mouse.click((int)Widgets.get((int)lIIIllIIl[133], (int)lIIIllIIl[67]).getClickPoint().getX(), (int)Widgets.get((int)lIIIllIIl[133], (int)lIIIllIIl[67]).getClickPoint().getY(), (boolean)lIIIllIIl[0]);
                    Time.sleepTicks((int)lIIIllIIl[9]);

                    Mouse.click((int)Widgets.get((int)lIIIllIIl[133], (int)lIIIllIIl[22]).getClickPoint().getX(), (int)Widgets.get((int)lIIIllIIl[133], (int)lIIIllIIl[22]).getClickPoint().getY(), (boolean)lIIIllIIl[0]);
                    Time.sleepTicks((int)lIIIllIIl[9]);

                    Mouse.click((int)Widgets.get((int)lIIIllIIl[133], (int)lIIIllIIl[76]).getClickPoint().getX(), (int)Widgets.get((int)lIIIllIIl[133], (int)lIIIllIIl[76]).getClickPoint().getY(), (boolean)lIIIllIIl[0]);
                    Time.sleepTicks((int)lIIIllIIl[9]);

                    Mouse.click((int)Widgets.get((int)lIIIllIIl[133], (int)lIIIllIIl[79]).getClickPoint().getX(), (int)Widgets.get((int)lIIIllIIl[133], (int)lIIIllIIl[79]).getClickPoint().getY(), (boolean)lIIIllIIl[0]);
                    Time.sleepTicks((int)lIIIllIIl[8]);

                }
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[136])) {
                s.aJ();
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[137])) {
                String[] stringArray = new String[lIIIllIIl[0]];
                stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[138]];
                if (s.lllIlIIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray19 = new String[lIIIllIIl[0]];
                    stringArray19[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[139]];
                    String[] stringArray20 = new String[lIIIllIIl[0]];
                    stringArray20[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[140]];
                    Inventory.getFirst((String[])stringArray19).useOn(Inventory.getFirst((String[])stringArray20));
                    Time.sleepTicks((int)lIIIllIIl[9]);

                }
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[141])) {
                if (s.lllIlIIlIII(cl, lIIIllIIl[0])) {
                    an.oL += lIIIllIIl[0];
                    an.o(AccBuilderEasyClues.m);
                    cl += lIIIllIIl[0];
                    an.oL = lIIIllIIl[1];
                    cm = lIIIllIIl[1];
                }
                s.aJ();
            }
            g.a(bR);
        }
    }

    static {
        s.lllIlIIIlIl();
        s.lllIlIIIlII();
        bv = new ArrayList<d>();
        co = new WorldArea(lIIIllIIl[163], lIIIllIIl[56], lIIIllIIl[16], lIIIllIIl[4], lIIIllIIl[1]);
        cp = new WorldArea(lIIIllIIl[164], lIIIllIIl[165], lIIIllIIl[166], lIIIllIIl[142], lIIIllIIl[1]);
        cq = new WorldArea(lIIIllIIl[164], lIIIllIIl[165], lIIIllIIl[166], lIIIllIIl[142], lIIIllIIl[0]);
        bX = new WorldPoint(lIIIllIIl[167], lIIIllIIl[168], lIIIllIIl[1]);
        cr = new WorldPoint(lIIIllIIl[169], lIIIllIIl[170], lIIIllIIl[1]);
        cs = new WorldPoint(lIIIllIIl[171], lIIIllIIl[172], lIIIllIIl[1]);
        String[] stringArray = new String[lIIIllIIl[21]];
        stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[173]];
        stringArray[s.lIIIllIIl[0]] = lIIIllIII[lIIIllIIl[174]];
        stringArray[s.lIIIllIIl[9]] = lIIIllIII[lIIIllIIl[175]];
        stringArray[s.lIIIllIIl[11]] = lIIIllIII[lIIIllIIl[176]];
        stringArray[s.lIIIllIIl[13]] = lIIIllIII[lIIIllIIl[100]];
        stringArray[s.lIIIllIIl[8]] = lIIIllIII[lIIIllIIl[177]];
        stringArray[s.lIIIllIIl[16]] = lIIIllIII[lIIIllIIl[178]];
        stringArray[s.lIIIllIIl[20]] = lIIIllIII[lIIIllIIl[179]];
        bR = stringArray;
        ct = lIIIllIIl[1];
        cu = lIIIllIII[lIIIllIIl[180]];
    }

    @Override
    public boolean S() {
        return lIIIllIIl[1];
    }

    private static boolean lllIlIIlllI(int n2) {
        return n2 < 0;
    }

    private static boolean lllIlIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIlIlIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static void lllIlIIIlII() {
        lIIIllIII = new String[lIIIllIIl[181]];
        s.lIIIllIII[s.lIIIllIIl[1]] = "Finished buying items, switching back to quest";
        s.lIIIllIII[s.lIIIllIIl[0]] = "Waterfall";
        s.lIIIllIII[s.lIIIllIIl[9]] = "Priest in Peril";
        s.lIIIllIII[s.lIIIllIIl[11]] = "Ernest the Chicken";
        s.lIIIllIII[s.lIIIllIIl[13]] = "Crafting";
        s.lIIIllIII[s.lIIIllIIl[8]] = "Woodcutting";
        s.lIIIllIII[s.lIIIllIIl[16]] = "Training range";
        s.lIIIllIII[s.lIIIllIIl[20]] = "Varrock Quiz";
        s.lIIIllIII[s.lIIIllIIl[21]] = "RFD Dwarf";
        s.lIIIllIII[s.lIIIllIIl[19]] = "A Porcine";
        s.lIIIllIII[s.lIIIllIIl[4]] = "Antique lamp";
        s.lIIIllIII[s.lIIIllIIl[23]] = "Client of Kourend";
        s.lIIIllIII[s.lIIIllIIl[24]] = "Antique lamp";
        s.lIIIllIII[s.lIIIllIIl[25]] = s.lllIlIIIIIl("4YTVTmkWUxg=", "zaQIY");
        s.lIIIllIII[s.lIIIllIIl[26]] = "Nav to bank";
        s.lIIIllIII[s.lIIIllIIl[28]] = "Handling banking";
        s.lIIIllIII[s.lIIIllIIl[35]] = "We are missing quest supplies, switching to BUYING";
        s.lIIIllIII[s.lIIIllIIl[42]] = "We are missing quest supplies, switching to BUYING";
        s.lIIIllIII[s.lIIIllIIl[46]] = "Drink";
        s.lIIIllIII[s.lIIIllIIl[12]] = "Drink";
        s.lIIIllIII[s.lIIIllIIl[48]] = "Shark";
        s.lIIIllIII[s.lIIIllIIl[49]] = "Shark";
        s.lIIIllIII[s.lIIIllIIl[50]] = "Eat";
        s.lIIIllIII[s.lIIIllIIl[51]] = "Nav to start";
        s.lIIIllIII[s.lIIIllIIl[47]] = "Ava";
        s.lIIIllIII[s.lIIIllIIl[54]] = "Bookcase";
        s.lIIIllIII[s.lIIIllIIl[55]] = "Search";
        s.lIIIllIII[s.lIIIllIIl[57]] = "Bookcase";
        s.lIIIllIII[s.lIIIllIIl[58]] = "Search";
        s.lIIIllIII[s.lIIIllIIl[59]] = "Wear";
        s.lIIIllIII[s.lIIIllIIl[64]] = "Nav to charter";
        s.lIIIllIII[s.lIIIllIIl[65]] = "Trader Crewmember";
        s.lIIIllIII[s.lIIIllIIl[10]] = "Trade";
        s.lIIIllIII[s.lIIIllIIl[66]] = "Break";
        s.lIIIllIII[s.lIIIllIIl[67]] = "Nav to ecto";
        s.lIIIllIII[s.lIIIllIIl[14]] = "Bones";
        s.lIIIllIII[s.lIIIllIIl[68]] = "Staircase";
        s.lIIIllIII[s.lIIIllIIl[69]] = "Climb-up";
        s.lIIIllIII[s.lIIIllIIl[70]] = "Loader";
        s.lIIIllIII[s.lIIIllIIl[71]] = "Bones";
        s.lIIIllIII[s.lIIIllIIl[22]] = "Bones";
        s.lIIIllIII[s.lIIIllIIl[72]] = "Loader";
        s.lIIIllIII[s.lIIIllIIl[75]] = "Bones";
        s.lIIIllIII[s.lIIIllIIl[76]] = "Staircase";
        s.lIIIllIII[s.lIIIllIIl[77]] = "Climb-down";
        s.lIIIllIII[s.lIIIllIIl[78]] = "Bonemeal";
        s.lIIIllIII[s.lIIIllIIl[79]] = "Ectofuntus";
        s.lIIIllIII[s.lIIIllIIl[80]] = "Worship";
        s.lIIIllIII[s.lIIIllIIl[81]] = "Bonemeal";
        s.lIIIllIII[s.lIIIllIIl[82]] = "Ghost disciple";
        s.lIIIllIII[s.lIIIllIIl[15]] = "Malcolm";
        s.lIIIllIII[s.lIIIllIIl[84]] = "Alice";
        s.lIIIllIII[s.lIIIllIIl[85]] = "Malcolm";
        s.lIIIllIII[s.lIIIllIIl[86]] = "Alice";
        s.lIIIllIII[s.lIIIllIIl[87]] = "Malcolm";
        s.lIIIllIII[s.lIIIllIIl[88]] = "Alice";
        s.lIIIllIII[s.lIIIllIIl[93]] = "Nav to crone";
        s.lIIIllIII[s.lIIIllIIl[94]] = "Old crone";
        s.lIIIllIII[s.lIIIllIIl[96]] = "Malcolm";
        s.lIIIllIII[s.lIIIllIIl[98]] = "Malcolm";
        s.lIIIllIII[s.lIIIllIIl[6]] = "Malcolm";
        s.lIIIllIII[s.lIIIllIIl[101]] = "Undead chicken";
        s.lIIIllIII[s.lIIIllIIl[102]] = "Iron bar";
        s.lIIIllIII[s.lIIIllIIl[104]] = "Iron bar";
        s.lIIIllIII[s.lIIIllIIl[107]] = "Witch";
        s.lIIIllIII[s.lIIIllIIl[3]] = "Witch";
        s.lIIIllIII[s.lIIIllIIl[109]] = "Bar magnet";
        s.lIIIllIII[s.lIIIllIIl[113]] = "Nav to mine";
        s.lIIIllIII[s.lIIIllIIl[114]] = "Hammer";
        s.lIIIllIII[s.lIIIllIIl[115]] = "Selected iron";
        s.lIIIllIII[s.lIIIllIIl[89]] = "Bar magnet";
        s.lIIIllIII[s.lIIIllIIl[119]] = "Undead tree";
        s.lIIIllIII[s.lIIIllIIl[120]] = "Chop";
        s.lIIIllIII[s.lIIIllIIl[90]] = "Wear";
        s.lIIIllIII[s.lIIIllIIl[125]] = "Nav to npc";
        s.lIIIllIII[s.lIIIllIIl[126]] = "Turael";
        s.lIIIllIII[s.lIIIllIIl[95]] = "Turael";
        s.lIIIllIII[s.lIIIllIIl[128]] = "Undead twigs";
        s.lIIIllIII[s.lIIIllIIl[129]] = "Undead tree";
        s.lIIIllIII[s.lIIIllIIl[130]] = "Chop";
        s.lIIIllIII[s.lIIIllIIl[97]] = "Undead twigs";
        s.lIIIllIII[s.lIIIllIIl[134]] = "Research notes";
        s.lIIIllIII[s.lIIIllIIl[135]] = "Translate";
        s.lIIIllIII[s.lIIIllIIl[138]] = "A pattern";
        s.lIIIllIII[s.lIIIllIIl[139]] = "A pattern";
        s.lIIIllIII[s.lIIIllIIl[140]] = "Hard leather";
        s.lIIIllIII[s.lIIIllIIl[142]] = "Bookcase";
        s.lIIIllIII[s.lIIIllIIl[143]] = "Search";
        s.lIIIllIII[s.lIIIllIIl[144]] = "Nav to start";
        s.lIIIllIII[s.lIIIllIIl[145]] = "Ava";
        s.lIIIllIII[s.lIIIllIIl[99]] = "Bookcase";
        s.lIIIllIII[s.lIIIllIIl[146]] = "Search";
        s.lIIIllIII[s.lIIIllIIl[159]] = s.lllIlIIIIlI("", "UTGfR");
        s.lIIIllIII[s.lIIIllIIl[160]] = "Animal Magnetism";
        s.lIIIllIII[s.lIIIllIIl[161]] = "ring of wealth (";
        s.lIIIllIII[s.lIIIllIIl[162]] = "Drop";
        s.lIIIllIII[s.lIIIllIIl[173]] = "Yes.";
        s.lIIIllIII[s.lIIIllIIl[174]] = "I'm here about a quest.";
        s.lIIIllIII[s.lIIIllIIl[175]] = "Okay, you need it more than I do, I suppose.";
        s.lIIIllIII[s.lIIIllIIl[176]] = "Could I buy those chickens now, then?";
        s.lIIIllIII[s.lIIIllIIl[100]] = "Could I buy 2 chickens?";
        s.lIIIllIII[s.lIIIllIIl[177]] = "I'm here about a quest.";
        s.lIIIllIII[s.lIIIllIIl[178]] = "Hello, I'm here about those trees again.";
        s.lIIIllIII[s.lIIIllIIl[179]] = "I'd love one, thanks.";
        s.lIIIllIII[s.lIIIllIIl[180]] = s.lllIlIIIIll("a8J2HZxc2Ac=", "rgoAl");
    }

    private static boolean lllIlIIllII(Object object) {
        return object != null;
    }
}

