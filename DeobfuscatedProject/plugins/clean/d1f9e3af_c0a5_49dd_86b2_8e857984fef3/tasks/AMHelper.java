/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
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
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class AMHelper
implements W {
    public static final  int mA;
    public static final  WorldArea mD;
    public static  int[] mf;
    public static  List<d> bv;
    public static final  int my;
    public static final  int mx;
    public static final  int mB;
    public static  int[] mG;
    public static  int[] mF;
    public static final  WorldArea mC;
    public static  boolean bt;
    public static final  WorldPoint mE;
    
    public static final  int mz;

    public static void af() {
        d lIIlIIIllllIIlI;
        Object lIIlIIIllllIIll;
        int[] nArray = new int[lIIIIlllI[1]];
        nArray[am.lIIIIlllI[0]] = lIIIIlllI[7];
        if (am.lllIIIIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lIIIIlllI[7], lIIIIlllI[1], lIIIIlllI[5]);
            bv.add(d2);

        }
        int[] nArray2 = new int[lIIIIlllI[1]];
        nArray2[am.lIIIIlllI[0]] = lIIIIlllI[8];
        if (am.lllIIIIIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIIlIIIllllIIll = new DHelper(lIIIIlllI[8], lIIIIlllI[1], lIIIIlllI[5]);
            bv.add((DHelper) IIlIIIllllIIll);

        }
        int[] nArray3 = new int[lIIIIlllI[1]];
        nArray3[am.lIIIIlllI[0]] = lIIIIlllI[9];
        if (am.lllIIIIIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIIlIIIllllIIll = new DHelper(lIIIIlllI[9], lIIIIlllI[1], lIIIIlllI[26]);
            bv.add((DHelper) IIlIIIllllIIll);

        }
        int[] nArray4 = new int[lIIIIlllI[1]];
        nArray4[am.lIIIIlllI[0]] = lIIIIlllI[10];
        if (am.lllIIIIIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIIlIIIllllIIll = new DHelper(lIIIIlllI[10], lIIIIlllI[1], lIIIIlllI[27]);
            bv.add((DHelper) IIlIIIllllIIll);

        }
        int[] nArray5 = new int[lIIIIlllI[1]];
        nArray5[am.lIIIIlllI[0]] = lIIIIlllI[11];
        if (am.lllIIIIIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIIlIIIllllIIll = new DHelper(lIIIIlllI[11], lIIIIlllI[1], lIIIIlllI[28]);
            bv.add((DHelper) IIlIIIllllIIll);

        }
        if (am.lllIIIIIIlI(Bank.contains((Predicate)(lIIlIIIllllIIll = item -> item.getName().toLowerCase().contains(lIIIIllIl[lIIIIlllI[36]]))) ? 1 : 0)) {
            lIIlIIIllllIIlI = new DHelper(lIIIIlllI[29], lIIIIlllI[12], lIIIIlllI[28]);
            bv.add(lIIlIIIllllIIlI);

        }
        int[] nArray6 = new int[lIIIIlllI[1]];
        nArray6[am.lIIIIlllI[0]] = lIIIIlllI[30];
        if (am.lllIIIIIIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lIIlIIIllllIIlI = new DHelper(lIIIIlllI[30], lIIIIlllI[31], lIIIIlllI[32]);
            bv.add(lIIlIIIllllIIlI);

        }
    }

    @Override
    public String U() {
        return lIIIIllIl[lIIIIlllI[34]];
    }

    private static boolean lllIIIIIIll(int n2) {
        return n2 > 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean ab() {
        int n2;
        if (am.lllIIIIIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIIlllI[23])) {
            boolean bl;
            int[] nArray = new int[lIIIIlllI[1]];
            nArray[am.lIIIIlllI[0]] = lIIIIlllI[11];
            if (am.lllIIIIIIll(Inventory.getCount((int[])nArray))) {
                bl = lIIIIlllI[1];

                if (null == null) return bl;
                return false;
            }
            bl = lIIIIlllI[0];
            return bl;
        }
        if (am.lllIIIIIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIIlllI[24]) && am.lllIIIIIIIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIIlllI[23])) {
            int n3;
            int[] nArray = new int[lIIIIlllI[1]];
            nArray[am.lIIIIlllI[0]] = lIIIIlllI[11];
            if (am.lllIIIIIIll(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[lIIIIlllI[1]];
                nArray2[am.lIIIIlllI[0]] = lIIIIlllI[10];
                if (am.lllIIIIIIll(Inventory.getCount((int[])nArray2))) {
                    n3 = lIIIIlllI[1];

                    if (3 < (5 ^ 1)) return n3 != 0;
                    return false;
                }
            }
            n3 = lIIIIlllI[0];
            return n3 != 0;
        }
        if (am.lllIIIIIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIIlllI[25]) && am.lllIIIIIIIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIIlllI[24])) {
            int n4;
            int[] nArray = new int[lIIIIlllI[1]];
            nArray[am.lIIIIlllI[0]] = lIIIIlllI[11];
            if (am.lllIIIIIIll(Inventory.getCount((int[])nArray))) {
                int[] nArray3 = new int[lIIIIlllI[1]];
                nArray3[am.lIIIIlllI[0]] = lIIIIlllI[10];
                if (am.lllIIIIIIll(Inventory.getCount((int[])nArray3))) {
                    int[] nArray4 = new int[lIIIIlllI[1]];
                    nArray4[am.lIIIIlllI[0]] = lIIIIlllI[9];
                    if (am.lllIIIIIIll(Inventory.getCount((int[])nArray4))) {
                        n4 = lIIIIlllI[1];

                        if (3 >= 0) return n4 != 0;
                        return ((0x42 ^ 0x6D ^ (0x6B ^ 0x50)) & (0x1A ^ 0xC ^ 2 ^ -1)) != 0;
                    }
                }
            }
            n4 = lIIIIlllI[0];
            return n4 != 0;
        }
        if (am.lllIIIIIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIIlllI[13]) && am.lllIIIIIIIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIIlllI[25])) {
            int n5;
            int[] nArray = new int[lIIIIlllI[1]];
            nArray[am.lIIIIlllI[0]] = lIIIIlllI[11];
            if (am.lllIIIIIIll(Inventory.getCount((int[])nArray))) {
                int[] nArray5 = new int[lIIIIlllI[1]];
                nArray5[am.lIIIIlllI[0]] = lIIIIlllI[10];
                if (am.lllIIIIIIll(Inventory.getCount((int[])nArray5))) {
                    int[] nArray6 = new int[lIIIIlllI[1]];
                    nArray6[am.lIIIIlllI[0]] = lIIIIlllI[9];
                    if (am.lllIIIIIIll(Inventory.getCount((int[])nArray6))) {
                        int[] nArray7 = new int[lIIIIlllI[1]];
                        nArray7[am.lIIIIlllI[0]] = lIIIIlllI[8];
                        if (am.lllIIIIIIll(Inventory.getCount((int[])nArray7))) {
                            n5 = lIIIIlllI[1];

                            if (3 > 1) return n5 != 0;
                            return ((6 + 23 - 28 + 169 ^ 51 + 49 - -20 + 13) & (0xF6 ^ 0xA7 ^ (0x2A ^ 0x54) ^ -1)) != 0;
                        }
                    }
                }
            }
            n5 = lIIIIlllI[0];
            return n5 != 0;
        }
        int[] nArray = new int[lIIIIlllI[1]];
        nArray[am.lIIIIlllI[0]] = lIIIIlllI[11];
        if (am.lllIIIIIIll(Inventory.getCount((int[])nArray))) {
            int[] nArray8 = new int[lIIIIlllI[1]];
            nArray8[am.lIIIIlllI[0]] = lIIIIlllI[10];
            if (am.lllIIIIIIll(Inventory.getCount((int[])nArray8))) {
                int[] nArray9 = new int[lIIIIlllI[1]];
                nArray9[am.lIIIIlllI[0]] = lIIIIlllI[9];
                if (am.lllIIIIIIll(Inventory.getCount((int[])nArray9))) {
                    int[] nArray10 = new int[lIIIIlllI[1]];
                    nArray10[am.lIIIIlllI[0]] = lIIIIlllI[8];
                    if (am.lllIIIIIIll(Inventory.getCount((int[])nArray10))) {
                        int[] nArray11 = new int[lIIIIlllI[1]];
                        nArray11[am.lIIIIlllI[0]] = lIIIIlllI[7];
                        if (am.lllIIIIIIll(Inventory.getCount((int[])nArray11))) {
                            n2 = lIIIIlllI[1];

                            if (-(0x5C ^ 0x58) <= 0) return n2 != 0;
                            return false;
                        }
                    }
                }
            }
        }
        n2 = lIIIIlllI[0];
        return n2 != 0;
    }

    @Override
    public int T() {
        am.ez();
        return lIIIIlllI[33];
    }

    private static boolean lllIIIIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        am.llIllllllll();
        am.llIlllllllI();
        mx = lIIIIlllI[7];
        my = lIIIIlllI[8];
        mB = lIIIIlllI[11];
        mA = lIIIIlllI[10];
        mz = lIIIIlllI[9];
        mC = new WorldArea(lIIIIlllI[37], lIIIIlllI[38], lIIIIlllI[34], lIIIIlllI[39], lIIIIlllI[0]);
        mD = new WorldArea(lIIIIlllI[40], lIIIIlllI[41], lIIIIlllI[22], lIIIIlllI[34], lIIIIlllI[0]);
        mE = new WorldPoint(lIIIIlllI[42], lIIIIlllI[43], lIIIIlllI[0]);
        int[] nArray = new int[lIIIIlllI[6]];
        nArray[am.lIIIIlllI[0]] = lIIIIlllI[44];
        nArray[am.lIIIIlllI[1]] = lIIIIlllI[45];
        nArray[am.lIIIIlllI[3]] = lIIIIlllI[46];
        nArray[am.lIIIIlllI[4]] = lIIIIlllI[47];
        mF = nArray;
        int[] nArray2 = new int[lIIIIlllI[1]];
        nArray2[am.lIIIIlllI[0]] = lIIIIlllI[48];
        mG = nArray2;
        int[] nArray3 = new int[lIIIIlllI[4]];
        nArray3[am.lIIIIlllI[0]] = lIIIIlllI[49];
        nArray3[am.lIIIIlllI[1]] = lIIIIlllI[50];
        nArray3[am.lIIIIlllI[3]] = lIIIIlllI[51];
        mf = nArray3;
        bv = new ArrayList<d>();
    }

    private static boolean lllIIIIIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void llIlllllllI() {
        lIIIIllIl = new String[lIIIIlllI[52]];
        am.lIIIIllIl[am.lIIIIlllI[0]] = "Buying items";
        am.lIIIIllIl[am.lIIIIlllI[1]] = "Finished buying items, switching back to woodcutting";
        am.lIIIIllIl[am.lIIIIlllI[3]] = "Navigating to bank";
        am.lIIIIllIl[am.lIIIIlllI[4]] = "Opening bank";
        am.lIIIIllIl[am.lIIIIlllI[6]] = "Handling banking";
        am.lIIIIllIl[am.lIIIIlllI[12]] = "We are missing pickaxes, switching to BUYING";
        am.lIIIIllIl[am.lIIIIlllI[13]] = "Dropping logs";
        am.lIIIIllIl[am.lIIIIlllI[14]] = "Dropping logs";
        am.lIIIIllIl[am.lIIIIlllI[16]] = "Walking to trees";
        am.lIIIIllIl[am.lIIIIlllI[17]] = "Chopping";
        am.lIIIIllIl[am.lIIIIlllI[18]] = "Chopping logs";
        am.lIIIIllIl[am.lIIIIlllI[19]] = "Chop down";
        am.lIIIIllIl[am.lIIIIlllI[20]] = "Walking to oak trees";
        am.lIIIIllIl[am.lIIIIlllI[21]] = "Chopping oaks";
        am.lIIIIllIl[am.lIIIIlllI[22]] = "Chopping oak logs";
        am.lIIIIllIl[am.lIIIIlllI[15]] = "Chop down";
        am.lIIIIllIl[am.lIIIIlllI[34]] = "Woodcutting";
        am.lIIIIllIl[am.lIIIIlllI[36]] = "ring of wealth (";
    }

    private static boolean lllIIIIIlII(Object object) {
        return object != null;
    }

        return String.valueOf(lIIlIIIllIIlIll);
    }

    public static void ez() {
        block25: {
            BankLocation lIIlIIIllllIllI;
            block27: {
                block33: {
                    block29: {
                        block32: {
                            block31: {
                                block30: {
                                    block28: {
                                        block26: {
                                            if (am.lllIIIIIIII(bt ? 1 : 0)) {
                                                AccBuilderEasyClues.c = lIIIIllIl[lIIIIlllI[0]];
                                                b.a(bv);
                                                if (am.lllIIIIIIIl(bv.size(), lIIIIlllI[1])) {
                                                    System.out.println(lIIIIllIl[lIIIIlllI[1]]);
                                                    bt = lIIIIlllI[0];
                                                }
                                            }
                                            if (!am.lllIIIIIIlI(bt ? 1 : 0)) break block25;
                                            if (!am.lllIIIIIIII(am.ab() ? 1 : 0)) break block26;
                                            int[] nArray = new int[lIIIIlllI[1]];
                                            nArray[am.lIIIIlllI[0]] = lIIIIlllI[2];
                                            if (!am.lllIIIIIIll(Inventory.getCount((int[])nArray))) break block27;
                                        }
                                        if (am.lllIIIIIlII(lIIlIIIllllIllI = BankLocation.getNearest()) && am.lllIIIIIIlI(lIIlIIIllllIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderEasyClues.c = lIIIIllIl[lIIIIlllI[3]];
                                            a.a(lIIlIIIllllIllI);
                                        }
                                        if (!am.lllIIIIIlII(lIIlIIIllllIllI) || !am.lllIIIIIIII(lIIlIIIllllIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block27;
                                        if (am.lllIIIIIIlI(Bank.isOpen() ? 1 : 0)) {
                                            AccBuilderEasyClues.c = lIIIIllIl[lIIIIlllI[4]];
                                            a.a();
                                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIlllI[5]);

                                        }
                                        if (!am.lllIIIIIIII(Bank.isOpen() ? 1 : 0)) break block27;
                                        AccBuilderEasyClues.c = lIIIIllIl[lIIIIlllI[6]];
                                        if (am.lllIIIIIIll(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)lIIIIlllI[6]);

                                        }
                                        if (am.lllIIIIIIll(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)lIIIIlllI[3]);

                                        }
                                        int[] nArray = new int[lIIIIlllI[1]];
                                        nArray[am.lIIIIlllI[0]] = lIIIIlllI[7];
                                        if (!am.lllIIIIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                        int[] nArray2 = new int[lIIIIlllI[1]];
                                        nArray2[am.lIIIIlllI[0]] = lIIIIlllI[7];
                                        if (!am.lllIIIIIlIl(Inventory.getCount((int[])nArray2), lIIIIlllI[1])) break block29;
                                    }
                                    int[] nArray = new int[lIIIIlllI[1]];
                                    nArray[am.lIIIIlllI[0]] = lIIIIlllI[8];
                                    if (!am.lllIIIIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                    int[] nArray3 = new int[lIIIIlllI[1]];
                                    nArray3[am.lIIIIlllI[0]] = lIIIIlllI[8];
                                    if (!am.lllIIIIIlIl(Inventory.getCount((int[])nArray3), lIIIIlllI[1])) break block29;
                                }
                                int[] nArray = new int[lIIIIlllI[1]];
                                nArray[am.lIIIIlllI[0]] = lIIIIlllI[9];
                                if (!am.lllIIIIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block31;
                                int[] nArray4 = new int[lIIIIlllI[1]];
                                nArray4[am.lIIIIlllI[0]] = lIIIIlllI[9];
                                if (!am.lllIIIIIlIl(Inventory.getCount((int[])nArray4), lIIIIlllI[1])) break block29;
                            }
                            int[] nArray = new int[lIIIIlllI[1]];
                            nArray[am.lIIIIlllI[0]] = lIIIIlllI[10];
                            if (!am.lllIIIIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                            int[] nArray5 = new int[lIIIIlllI[1]];
                            nArray5[am.lIIIIlllI[0]] = lIIIIlllI[10];
                            if (!am.lllIIIIIlIl(Inventory.getCount((int[])nArray5), lIIIIlllI[1])) break block29;
                        }
                        int[] nArray = new int[lIIIIlllI[1]];
                        nArray[am.lIIIIlllI[0]] = lIIIIlllI[11];
                        if (!am.lllIIIIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                        int[] nArray6 = new int[lIIIIlllI[1]];
                        nArray6[am.lIIIIlllI[0]] = lIIIIlllI[11];
                        if (!am.lllIIIIIIIl(Inventory.getCount((int[])nArray6), lIIIIlllI[1])) break block33;
                    }
                    am.af();
                    System.out.println(lIIIIllIl[lIIIIlllI[12]]);
                    bt = lIIIIlllI[1];
                    return;
                }
                int[] nArray = new int[lIIIIlllI[1]];
                nArray[am.lIIIIlllI[0]] = lIIIIlllI[7];
                if (am.lllIIIIIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    Bank.withdraw((int)lIIIIlllI[7], (int)lIIIIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIIIlllI[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIIIlllI[1]];
                        nArray[am.lIIIIlllI[0]] = lIIIIlllI[7];
                        if (am.lllIIIIIIll(Inventory.getCount((int[])nArray))) {
                            bl = lIIIIlllI[1];

                            }
                        } else {
                            bl = lIIIIlllI[0];
                        }
                        return bl;
                    }, (int)lIIIIlllI[5]);

                }
                int[] nArray7 = new int[lIIIIlllI[1]];
                nArray7[am.lIIIIlllI[0]] = lIIIIlllI[8];
                if (am.lllIIIIIIII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    Bank.withdraw((int)lIIIIlllI[8], (int)lIIIIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIIIlllI[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIIIlllI[1]];
                        nArray[am.lIIIIlllI[0]] = lIIIIlllI[8];
                        if (am.lllIIIIIIll(Inventory.getCount((int[])nArray))) {
                            bl = lIIIIlllI[1];

                            if (((0x29 ^ 0x24 ^ (2 ^ 0x54)) & (0x64 ^ 0x73 ^ (0x71 ^ 0x3D) ^ -1)) != 0) {
                                return ((0xF2 ^ 0x87 ^ (0xFA ^ 0xAB)) & (28 + 12 - -35 + 107 ^ 70 + 61 - 64 + 79 ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIIIlllI[0];
                        }
                        return bl;
                    }, (int)lIIIIlllI[5]);

                }
                int[] nArray8 = new int[lIIIIlllI[1]];
                nArray8[am.lIIIIlllI[0]] = lIIIIlllI[9];
                if (am.lllIIIIIIII(Bank.contains((int[])nArray8) ? 1 : 0)) {
                    Bank.withdraw((int)lIIIIlllI[9], (int)lIIIIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIIIlllI[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIIIlllI[1]];
                        nArray[am.lIIIIlllI[0]] = lIIIIlllI[9];
                        if (am.lllIIIIIIll(Inventory.getCount((int[])nArray))) {
                            bl = lIIIIlllI[1];

                            if (3 <= 0) {
                                return false;
                            }
                        } else {
                            bl = lIIIIlllI[0];
                        }
                        return bl;
                    }, (int)lIIIIlllI[5]);

                }
                int[] nArray9 = new int[lIIIIlllI[1]];
                nArray9[am.lIIIIlllI[0]] = lIIIIlllI[10];
                if (am.lllIIIIIIII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    Bank.withdraw((int)lIIIIlllI[10], (int)lIIIIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIIIlllI[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIIIlllI[1]];
                        nArray[am.lIIIIlllI[0]] = lIIIIlllI[10];
                        if (am.lllIIIIIIll(Inventory.getCount((int[])nArray))) {
                            bl = lIIIIlllI[1];

                            if (3 < 0) {
                                return ((2 + 106 - -65 + 3 ^ 14 + 10 - -128 + 5) & (0xC ^ 0x36 ^ (5 ^ 0x12) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIIIlllI[0];
                        }
                        return bl;
                    }, (int)lIIIIlllI[5]);

                }
                int[] nArray10 = new int[lIIIIlllI[1]];
                nArray10[am.lIIIIlllI[0]] = lIIIIlllI[11];
                if (am.lllIIIIIIII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    Bank.withdraw((int)lIIIIlllI[11], (int)lIIIIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIIIlllI[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIIIlllI[1]];
                        nArray[am.lIIIIlllI[0]] = lIIIIlllI[11];
                        if (am.lllIIIIIIll(Inventory.getCount((int[])nArray))) {
                            bl = lIIIIlllI[1];

                            if (3 < 0) {
                                return false;
                            }
                        } else {
                            bl = lIIIIlllI[0];
                        }
                        return bl;
                    }, (int)lIIIIlllI[5]);

                }
            }
            if (am.lllIIIIIIII(am.ab() ? 1 : 0)) {
                if (am.lllIIIIIIII(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIIllIl[lIIIIlllI[13]];
                    System.out.println(lIIIIllIl[lIIIIlllI[14]]);
                    Inventory.getAll((int[])mf).stream().forEach(Item::drop);
                }
                if (am.lllIIIIIIlI(Inventory.isFull() ? 1 : 0)) {
                    if (am.lllIIIIIIIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIIlllI[15])) {
                        if (am.lllIIIIIIlI(mC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIIIllIl[lIIIIlllI[16]];
                            Movement.walkTo((WorldPoint)mC.toWorldPoint());

                            Time.sleepTicks((int)lIIIIlllI[6]);

                        }
                        if (am.lllIIIIIIII(mC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIIIllIl[lIIIIlllI[17]];
                            lIIlIIIllllIllI = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])mF);
                            if (am.lllIIIIIIlI(Players.getLocal().isAnimating() ? 1 : 0) && am.lllIIIIIIlI(Players.getLocal().isMoving() ? 1 : 0) && am.lllIIIIIlII(lIIlIIIllllIllI)) {
                                System.out.println(lIIIIllIl[lIIIIlllI[18]]);
                                lIIlIIIllllIllI.interact(lIIIIllIl[lIIIIlllI[19]]);
                                Time.sleepTicks((int)lIIIIlllI[4]);

                            }
                        }
                    }
                    if (am.lllIIIIIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIIlllI[15])) {
                        if (am.lllIIIIIIlI(mD.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIIIllIl[lIIIIlllI[20]];
                            Movement.walkTo((WorldPoint)mE);

                            Time.sleepTicks((int)lIIIIlllI[6]);

                        }
                        if (am.lllIIIIIIII(mD.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIIIllIl[lIIIIlllI[21]];
                            lIIlIIIllllIllI = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])mG);
                            if (am.lllIIIIIIlI(Players.getLocal().isAnimating() ? 1 : 0) && am.lllIIIIIIlI(Players.getLocal().isMoving() ? 1 : 0) && am.lllIIIIIlII(lIIlIIIllllIllI)) {
                                System.out.println(lIIIIllIl[lIIIIlllI[22]]);
                                lIIlIIIllllIllI.interact(lIIIIllIl[lIIIIlllI[15]]);
                                Time.sleepTicks((int)lIIIIlllI[4]);

                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public boolean S() {
        return lIIIIlllI[0];
    }

    @Override
    public boolean V() {
        boolean bl;
        if (am.lllIIIIIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIIlllI[35])) {
            bl = lIIIIlllI[1];

            }
        } else {
            bl = lIIIIlllI[0];
        }
        return bl;
    }

    private static boolean lllIIIIIIlI(int n2) {
        return n2 == 0;
    }
}

