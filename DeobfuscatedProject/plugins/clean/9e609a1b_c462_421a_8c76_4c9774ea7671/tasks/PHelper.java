/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Actor
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.PHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.AHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.BHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.DHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.EHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.FHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.GHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.HHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.MHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.ZHelper;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class PHelper
implements M {
    private static final  int eq;
    private static final  WorldPoint eD;
    static  String fa;
    private static final  WorldPoint ez;
    private static final  int ep;
    
    private static final  int eT;
    private static final  int eu;
    private static final  WorldPoint eG;
    public static final  WorldArea eg;
    private static final  int em;
    private static final  WorldPoint ev;
    private static final  WorldPoint eB;
    private static final  WorldPoint eE;
    public static final  WorldArea ed;
    private static final  int eP;
    private static final  int eR;
    private static final  WorldPoint eJ;
    private static final  WorldArea eN;
    public static final  WorldArea eh;
    private static final  int eU;
    private static final  int eo;
    private static final  int et;
    private static final  WorldPoint eC;
    static  boolean cp;
    private static final  WorldPoint ex;
    public static final  WorldArea ec;
    private static final  WorldArea eL;
    private static final  int ej;
    public static final  WorldPoint dZ;
    private static final  int eX;
    public static  int eZ;
    private static final  int en;
    public static final  WorldArea eb;
    private static final  int ek;
    public static final  WorldPoint dY;
    private static final  WorldArea eM;
    
    private static final  WorldPoint eF;
    private static final  WorldPoint eH;
    public static final  WorldPoint dX;
    private static final  int eO;
    static  String[] dP;
    private static final  int ei;
    public static  int eY;
    public static final  WorldArea ee;
    private static final  int eQ;
    private static final  WorldPoint eA;
    public static final  WorldArea ea;
    public static  List<d> bA;
    private static final  int eW;
    private static final  int eS;
    private static final  WorldPoint ew;
    private static final  int er;
    public static final  WorldArea ef;
    private static final  WorldPoint eI;
    
    private static final  int es;
    static  int co;
    public static  boolean by;
    private static final  WorldPoint eK;
    private static final  WorldPoint ey;
    private static final  int el;
    private static final  int eV;

    private static boolean lIlIIllllIIIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIllllIIllII(Object object) {
        return object != null;
    }

    private static boolean lIlIIllllIIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void aR() {
        block30: {
            block34: {
                block32: {
                    block33: {
                        block31: {
                            void var1;
                            BankLocation bankLocation = BankLocation.getNearest();
                            if (p.lIlIIllllIIllII(bankLocation) && p.lIlIIllllIIlIIl(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[97]];
                                a.a(bankLocation);
                            }
                            if (!p.lIlIIllllIIllII(var1) || !p.lIlIIllllIIlIII(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block30;
                            if (p.lIlIIllllIIlIIl(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[98]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIIIIllll[99]);

                            }
                            if (!p.lIlIIllllIIlIII(Bank.isOpen() ? 1 : 0)) break block30;
                            AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[100]];
                            if (p.lIlIIllllIIllll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIlIIIIIllll[12]);

                            }
                            if (p.lIlIIllllIIllll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIlIIIIIllll[1]);

                            }
                            while (p.lIlIIllllIIlIIl(m.av() ? 1 : 0) && p.lIlIIllllIIlIIl(AccBuilderRat.d ? 1 : 0)) {
                                m.at();
                                Time.sleepTicks((int)lIIlIIIIIllll[3]);

                                if (-1 <= 2) continue;
                                return;
                            }
                            int[] nArray = new int[lIIlIIIIIllll[3]];
                            nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[7];
                            if (p.lIlIIllllIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIIlIIIIIllll[3]];
                                nArray2[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[7];
                                if (p.lIlIIllllIIIllI(Bank.getFirst((int[])nArray2).getQuantity(), lIIlIIIIIllll[101])) {
                                    p.W();
                                    System.out.println(lIIlIIIIIlllI[lIIlIIIIIllll[102]]);
                                    by = lIIlIIIIIllll[3];
                                    return;
                                }
                            }
                            int[] nArray3 = new int[lIIlIIIIIllll[3]];
                            nArray3[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[6];
                            if (p.lIlIIllllIIlIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIIlIIIIIllll[3]];
                                nArray4[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[6];
                                if (p.lIlIIllllIIIllI(Bank.getFirst((int[])nArray4).getQuantity(), lIIlIIIIIllll[101])) {
                                    p.W();
                                    System.out.println(lIIlIIIIIlllI[lIIlIIIIIllll[16]]);
                                    by = lIIlIIIIIllll[3];
                                    return;
                                }
                            }
                            int[] nArray5 = new int[lIIlIIIIIllll[3]];
                            nArray5[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[5];
                            if (p.lIlIIllllIIlIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIIlIIIIIllll[3]];
                                nArray6[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[5];
                                if (p.lIlIIllllIIIllI(Bank.getFirst((int[])nArray6).getQuantity(), lIIlIIIIIllll[101])) {
                                    p.W();
                                    System.out.println(lIIlIIIIIlllI[lIIlIIIIIllll[103]]);
                                    by = lIIlIIIIIllll[3];
                                    return;
                                }
                            }
                            int[] nArray7 = new int[lIIlIIIIIllll[3]];
                            nArray7[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                            if (!p.lIlIIllllIIlIII(Bank.contains((int[])nArray7) ? 1 : 0)) break block31;
                            int[] nArray8 = new int[lIIlIIIIIllll[3]];
                            nArray8[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                            if (!p.lIlIIllllIIlllI(Bank.getFirst((int[])nArray8).getQuantity(), lIIlIIIIIllll[22])) break block32;
                        }
                        int[] nArray = new int[lIIlIIIIIllll[3]];
                        nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[9];
                        if (!p.lIlIIllllIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                        int[] nArray9 = new int[lIIlIIIIIllll[3]];
                        nArray9[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[9];
                        if (!p.lIlIIllllIIlllI(Bank.getFirst((int[])nArray9).getQuantity(), lIIlIIIIIllll[13])) break block32;
                    }
                    int[] nArray = new int[lIIlIIIIIllll[3]];
                    nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                    if (!p.lIlIIllllIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                    int[] nArray10 = new int[lIIlIIIIIllll[3]];
                    nArray10[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                    if (!p.lIlIIllllIIIllI(Bank.getFirst((int[])nArray10).getQuantity(), lIIlIIIIIllll[33])) break block34;
                }
                p.W();
                System.out.println(lIIlIIIIIlllI[lIIlIIIIIllll[104]]);
                by = lIIlIIIIIllll[3];
                return;
            }
            int[] nArray = new int[lIIlIIIIIllll[18]];
            nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[105];
            nArray[p.lIIlIIIIIllll[3]] = lIIlIIIIIllll[10];
            nArray[p.lIIlIIIIIllll[1]] = lIIlIIIIIllll[9];
            nArray[p.lIIlIIIIIllll[12]] = lIIlIIIIIllll[8];
            nArray[p.lIIlIIIIIllll[15]] = lIIlIIIIIllll[7];
            nArray[p.lIIlIIIIIllll[13]] = lIIlIIIIIllll[5];
            nArray[p.lIIlIIIIIllll[14]] = lIIlIIIIIllll[6];
            if (p.lIlIIllllIIlIIl(e.b(nArray) ? 1 : 0)) {
                p.W();
                System.out.println(lIIlIIIIIlllI[lIIlIIIIIllll[106]]);
                by = lIIlIIIIIllll[3];
                return;
            }
            if (p.lIlIIllllIIlIIl(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepTicks((int)lIIlIIIIIllll[15]);

            }
            int[] nArray11 = new int[lIIlIIIIIllll[3]];
            nArray11[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
            if (p.lIlIIllllIIlIII(Bank.contains((int[])nArray11) ? 1 : 0)) {
                int[] nArray12 = new int[lIIlIIIIIllll[3]];
                nArray12[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                if (p.lIlIIllllIIIllI(Inventory.getCount((int[])nArray12), lIIlIIIIIllll[3])) {
                    Bank.withdraw((int)lIIlIIIIIllll[10], (int)lIIlIIIIIllll[13], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIIIIIllll[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIlIIIIIllll[3]];
                        nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                        if (p.lIlIIllllIIllll(Inventory.getCount((int[])nArray))) {
                            bl = lIIlIIIIIllll[3];

                        } else {
                            bl = lIIlIIIIIllll[4];
                        }
                        return bl;
                    }, (int)lIIlIIIIIllll[99]);

                }
            }
            int[] nArray13 = new int[lIIlIIIIIllll[3]];
            nArray13[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[9];
            if (p.lIlIIllllIIlIII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                int[] nArray14 = new int[lIIlIIIIIllll[3]];
                nArray14[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[9];
                if (p.lIlIIllllIIIllI(Inventory.getCount((int[])nArray14), lIIlIIIIIllll[3])) {
                    Bank.withdraw((int)lIIlIIIIIllll[9], (int)lIIlIIIIIllll[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIIIIIllll[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIlIIIIIllll[3]];
                        nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[9];
                        if (p.lIlIIllllIIllll(Inventory.getCount((int[])nArray))) {
                            bl = lIIlIIIIIllll[3];

                            if (((0x71 ^ 0x51) & ~(0x82 ^ 0xA2)) > 0) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIIIIllll[4];
                        }
                        return bl;
                    }, (int)lIIlIIIIIllll[99]);

                }
            }
            int[] nArray15 = new int[lIIlIIIIIllll[3]];
            nArray15[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[7];
            if (p.lIlIIllllIIlIII(Bank.contains((int[])nArray15) ? 1 : 0)) {
                int[] nArray16 = new int[lIIlIIIIIllll[3]];
                nArray16[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[7];
                if (p.lIlIIllllIIIllI(Inventory.getCount((int[])nArray16), lIIlIIIIIllll[3])) {
                    Bank.withdraw((int)lIIlIIIIIllll[7], (int)lIIlIIIIIllll[107], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIIIIIllll[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIlIIIIIllll[3]];
                        nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[7];
                        if (p.lIlIIllllIIllll(Inventory.getCount((int[])nArray))) {
                            bl = lIIlIIIIIllll[3];

                            }
                        } else {
                            bl = lIIlIIIIIllll[4];
                        }
                        return bl;
                    }, (int)lIIlIIIIIllll[99]);

                }
            }
            int[] nArray17 = new int[lIIlIIIIIllll[3]];
            nArray17[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[5];
            if (p.lIlIIllllIIlIII(Bank.contains((int[])nArray17) ? 1 : 0)) {
                int[] nArray18 = new int[lIIlIIIIIllll[3]];
                nArray18[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[5];
                if (p.lIlIIllllIIIllI(Inventory.getCount((int[])nArray18), lIIlIIIIIllll[3])) {
                    Bank.withdraw((int)lIIlIIIIIllll[5], (int)lIIlIIIIIllll[107], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIIIIIllll[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIlIIIIIllll[3]];
                        nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[5];
                        if (p.lIlIIllllIIllll(Inventory.getCount((int[])nArray))) {
                            bl = lIIlIIIIIllll[3];

                            if (-1 > ((7 ^ 3) & ~(0x3D ^ 0x39))) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIIIIllll[4];
                        }
                        return bl;
                    }, (int)lIIlIIIIIllll[99]);

                }
            }
            int[] nArray19 = new int[lIIlIIIIIllll[3]];
            nArray19[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[6];
            if (p.lIlIIllllIIlIII(Bank.contains((int[])nArray19) ? 1 : 0)) {
                int[] nArray20 = new int[lIIlIIIIIllll[3]];
                nArray20[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[6];
                if (p.lIlIIllllIIIllI(Inventory.getCount((int[])nArray20), lIIlIIIIIllll[3])) {
                    Bank.withdraw((int)lIIlIIIIIllll[6], (int)lIIlIIIIIllll[107], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIIIIIllll[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIlIIIIIllll[3]];
                        nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[6];
                        if (p.lIlIIllllIIllll(Inventory.getCount((int[])nArray))) {
                            bl = lIIlIIIIIllll[3];

                            if (2 <= 1) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIIIIllll[4];
                        }
                        return bl;
                    }, (int)lIIlIIIIIllll[99]);

                }
            }
            int[] nArray21 = new int[lIIlIIIIIllll[3]];
            nArray21[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[108];
            if (p.lIlIIllllIIlIII(Bank.contains((int[])nArray21) ? 1 : 0)) {
                int[] nArray22 = new int[lIIlIIIIIllll[3]];
                nArray22[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[108];
                if (p.lIlIIllllIIlIIl(Inventory.contains((int[])nArray22) ? 1 : 0)) {
                    Bank.withdraw((int)lIIlIIIIIllll[108], (int)lIIlIIIIIllll[3], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIIIIIllll[3]);

                    Time.sleepUntil(() -> {
                        int[] nArray = new int[lIIlIIIIIllll[3]];
                        nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[108];
                        return Inventory.contains((int[])nArray);
                    }, (int)lIIlIIIIIllll[99]);

                }
            }
            int[] nArray23 = new int[lIIlIIIIIllll[3]];
            nArray23[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
            if (p.lIlIIllllIIlIII(Bank.contains((int[])nArray23) ? 1 : 0)) {
                int[] nArray24 = new int[lIIlIIIIIllll[3]];
                nArray24[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                if (p.lIlIIllllIIIllI(Inventory.getCount((int[])nArray24), lIIlIIIIIllll[3])) {
                    Bank.withdrawAll((int)lIIlIIIIIllll[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIIIIIllll[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIlIIIIIllll[3]];
                        nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                        if (p.lIlIIllllIIllll(Inventory.getCount((int[])nArray))) {
                            bl = lIIlIIIIIllll[3];

                            if (3 > 3) {
                                return ((0x6F ^ 0x55 ^ (0x7C ^ 0x7A) & ~(0x6F ^ 0x69)) & (0xBE ^ 0x99 ^ (0x3E ^ 0x23) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIlIIIIIllll[4];
                        }
                        return bl;
                    }, (int)lIIlIIIIIllll[99]);

                }
            }
        }
    }

    public static void aP() {
        TileObject llllllllllllllIlllllllIlIIIlIIII2;
        block91: {
            block93: {
                block92: {
                    block89: {
                        block90: {
                            Widget var2;
                            if (p.lIlIIllllIIIllI(e.j(lIIlIIIIIllll[0]), lIIlIIIIIllll[1])) {
                                try {
                                    z.bD();

                                }
                                catch (Exception llllllllllllllIlllllllIlIIIlIIII2) {
                                    llllllllllllllIlllllllIlIIIlIIII2.printStackTrace();
                                }
                                if (-1 > -1) {
                                    return;
                                }
                            }
                            if (p.lIlIIllllIIIlll(e.j(lIIlIIIIIllll[0]), lIIlIIIIIllll[1]) && p.lIlIIllllIIIllI(e.j(lIIlIIIIIllll[2]), lIIlIIIIIllll[3])) {
                                block88: {
                                    if (p.lIlIIllllIIlIII(by ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[4]];
                                        b.a(bA);
                                        if (p.lIlIIllllIIIllI(bA.size(), lIIlIIIIIllll[3])) {
                                            System.out.println(lIIlIIIIIlllI[lIIlIIIIIllll[3]]);
                                            by = lIIlIIIIIllll[4];
                                        }
                                    }
                                    do {
                                        if (p.lIlIIllllIIlIII(m.av() ? 1 : 0)) {
                                            int[] nArray = new int[lIIlIIIIIllll[3]];
                                            nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[5];
                                            if (p.lIlIIllllIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                int[] nArray2 = new int[lIIlIIIIIllll[3]];
                                                nArray2[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[6];
                                                if (p.lIlIIllllIIlIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                                                    int[] nArray3 = new int[lIIlIIIIIllll[3]];
                                                    nArray3[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[7];
                                                    if (p.lIlIIllllIIlIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                                        int[] nArray4 = new int[lIIlIIIIIllll[3]];
                                                        nArray4[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                                                        if (p.lIlIIllllIIlIII(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                                                            int[] nArray5 = new int[lIIlIIIIIllll[3]];
                                                            nArray5[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[9];
                                                            if (p.lIlIIllllIIlIII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                                                int[] nArray6 = new int[lIIlIIIIIllll[3]];
                                                                nArray6[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                                                                if (!p.lIlIIllllIIlIIl(Inventory.contains((int[])nArray6) ? 1 : 0)) break block88;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (!p.lIlIIllllIIlIIl(AccBuilderRat.d ? 1 : 0)) break block88;
                                        p.aR();
                                        Time.sleepTicks((int)lIIlIIIIIllll[3]);

                                    } while (((0x30 ^ 6) & ~(0xAA ^ 0x9C)) == 0);
                                    return;
                                }
                                if (p.lIlIIllllIIlIIl(by ? 1 : 0)) {
                                    if (p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(ew), lIIlIIIIIllll[11])) {
                                        int[] nArray = new int[lIIlIIIIIllll[3]];
                                        nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                                        if (p.lIlIIllllIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                            AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[1]];
                                            int[] nArray7 = new int[lIIlIIIIIllll[3]];
                                            nArray7[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                                            Inventory.getFirst((int[])nArray7).interact(lIIlIIIIIlllI[lIIlIIIIIllll[12]]);
                                            Time.sleepTicks((int)lIIlIIIIIllll[13]);

                                        }
                                    }
                                    if (p.lIlIIllllIIIllI(Players.getLocal().getWorldLocation().distanceTo(ew), lIIlIIIIIllll[11]) && p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(ew), lIIlIIIIIllll[14])) {
                                        AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[15]];
                                        if (p.lIlIIllllIIlIII(Inventory.contains((int[])f.ba) ? 1 : 0) && p.lIlIIllllIIIllI(Movement.getRunEnergy(), lIIlIIIIIllll[16])) {
                                            Inventory.getFirst((int[])f.ba).interact(lIIlIIIIIlllI[lIIlIIIIIllll[13]]);
                                            Time.sleepTicks((int)lIIlIIIIIllll[3]);

                                        }
                                        Movement.walkTo((WorldPoint)ew);

                                        Time.sleepTicks((int)lIIlIIIIIllll[3]);

                                    }
                                    if (p.lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(ew), lIIlIIIIIllll[14])) {
                                        g.a(lIIlIIIIIlllI[lIIlIIIIIllll[14]], dP);
                                    }
                                }
                            }
                            if (p.lIlIIllllIIIlll(e.j(lIIlIIIIIllll[0]), lIIlIIIIIllll[1]) && p.lIlIIllllIIIlll(e.j(lIIlIIIIIllll[2]), lIIlIIIIIllll[3])) {
                                if (p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(ez), lIIlIIIIIllll[15]) && p.lIlIIllllIIlIIl(eM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    int[] nArray = new int[lIIlIIIIIllll[3]];
                                    nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[17];
                                    if (p.lIlIIllllIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[18]];
                                        Movement.walkTo((WorldPoint)ez);

                                        Time.sleepTicks((int)lIIlIIIIIllll[3]);

                                    }
                                }
                                if (p.lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(ez), lIIlIIIIIllll[15]) && p.lIlIIllllIIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                                    int[] nArray = new int[lIIlIIIIIllll[3]];
                                    nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[17];
                                    if (p.lIlIIllllIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                        int[] nArray8 = new int[lIIlIIIIIllll[3]];
                                        nArray8[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[19];
                                        llllllllllllllIlllllllIlIIIlIIII2 = TileObjects.getNearest((int[])nArray8);
                                        if (p.lIlIIllllIIlIII(Inventory.isFull() ? 1 : 0)) {
                                            int[] nArray9 = new int[lIIlIIIIIllll[3]];
                                            nArray9[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                                            Inventory.getFirst((int[])nArray9).interact(lIIlIIIIIlllI[lIIlIIIIIllll[20]]);
                                            Time.sleepTicks((int)lIIlIIIIIllll[3]);

                                        }
                                        if (p.lIlIIllllIIlIIl(Inventory.isFull() ? 1 : 0)) {
                                            if (p.lIlIIllllIIllII(llllllllllllllIlllllllIlIIIlIIII2) && p.lIlIIllllIIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                                AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[21]];
                                                llllllllllllllIlllllllIlIIIlIIII2.interact(lIIlIIIIIlllI[lIIlIIIIIllll[22]]);
                                                Dialog.continueSpace();
                                            }
                                            if (p.lIlIIllllIIllII(var2 = Widgets.get((int)lIIlIIIIIllll[23], (int)lIIlIIIIIllll[3]))) {
                                                var2.interact(lIIlIIIIIlllI[lIIlIIIIIllll[24]]);
                                                var2.interact(lIIlIIIIIllll[4]);
                                                var2.interact(lIIlIIIIIlllI[lIIlIIIIIllll[25]]);
                                                Keyboard.type((String)lIIlIIIIIlllI[lIIlIIIIIllll[26]]);
                                            }
                                        }
                                    }
                                }
                                if (p.lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(ez), lIIlIIIIIllll[15])) {
                                    int[] nArray = new int[lIIlIIIIIllll[3]];
                                    nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[17];
                                    if (p.lIlIIllllIIlIII(Inventory.contains((int[])nArray) ? 1 : 0) && p.lIlIIllllIIlIIl(eL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[27]];
                                        Movement.walkTo((WorldPoint)eD);

                                        Time.sleepTicks((int)lIIlIIIIIllll[3]);

                                    }
                                }
                                if (p.lIlIIllllIIlIII(eM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[28]];
                                    if (p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(eD), lIIlIIIIIllll[3])) {
                                        Movement.walkTo((WorldPoint)eD);

                                        Time.sleepTicks((int)lIIlIIIIIllll[3]);

                                    }
                                    if (p.lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(eD), lIIlIIIIIllll[3])) {
                                        String[] stringArray = new String[lIIlIIIIIllll[3]];
                                        stringArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[29]];
                                        llllllllllllllIlllllllIlIIIlIIII2 = TileObjects.getNearest((String[])stringArray);
                                        AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[30]];
                                        if (p.lIlIIllllIIlIII(Inventory.isFull() ? 1 : 0)) {
                                            int[] nArray = new int[lIIlIIIIIllll[3]];
                                            nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                                            Inventory.getFirst((int[])nArray).interact(lIIlIIIIIlllI[lIIlIIIIIllll[31]]);
                                            Time.sleepTicks((int)lIIlIIIIIllll[3]);

                                        }
                                        if (p.lIlIIllllIIllII(llllllllllllllIlllllllIlIIIlIIII2)) {
                                            String[] stringArray2 = new String[lIIlIIIIIllll[3]];
                                            stringArray2[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[32]];
                                            if (p.lIlIIllllIIlIII(llllllllllllllIlllllllIlIIIlIIII2.hasAction(stringArray2) ? 1 : 0)) {
                                                llllllllllllllIlllllllIlIIIlIIII2.interact(lIIlIIIIIlllI[lIIlIIIIIllll[33]]);
                                                Time.sleepTicks((int)lIIlIIIIIllll[1]);

                                            }
                                            String[] stringArray3 = new String[lIIlIIIIIllll[3]];
                                            stringArray3[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[34]];
                                            if (p.lIlIIllllIIlIII(llllllllllllllIlllllllIlIIIlIIII2.hasAction(stringArray3) ? 1 : 0)) {
                                                llllllllllllllIlllllllIlIIIlIIII2.interact(lIIlIIIIIlllI[lIIlIIIIIllll[35]]);
                                                Time.sleepTicks((int)lIIlIIIIIllll[1]);

                                                var2 = Widgets.get((int)lIIlIIIIIllll[23], (int)lIIlIIIIIllll[3]);
                                                if (p.lIlIIllllIIllII(var2)) {
                                                    var2.interact(lIIlIIIIIlllI[lIIlIIIIIllll[36]]);
                                                    var2.interact(lIIlIIIIIllll[4]);
                                                    var2.interact(lIIlIIIIIlllI[lIIlIIIIIllll[37]]);
                                                    Keyboard.type((String)lIIlIIIIIlllI[lIIlIIIIIllll[38]]);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (p.lIlIIllllIIIlll(e.j(lIIlIIIIIllll[0]), lIIlIIIIIllll[1]) && p.lIlIIllllIIIlll(e.j(lIIlIIIIIllll[2]), lIIlIIIIIllll[1])) {
                                co = lIIlIIIIIllll[4];
                                if (p.lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(ew), lIIlIIIIIllll[22])) {
                                    while (p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(ez), lIIlIIIIIllll[1]) && p.lIlIIllllIIlIIl(AccBuilderRat.d ? 1 : 0)) {
                                        Movement.walkTo((WorldPoint)ez);

                                        Time.sleepTicks((int)lIIlIIIIIllll[3]);

                                        if (-3 <= 0) continue;
                                        return;
                                    }
                                }
                                int[] nArray = new int[lIIlIIIIIllll[3]];
                                nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[39];
                                if (p.lIlIIllllIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0) && p.lIlIIllllIIlIII(eM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[40]];
                                    if (p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(eD), lIIlIIIIIllll[3])) {
                                        Movement.walkTo((WorldPoint)eD);

                                        Time.sleepTicks((int)lIIlIIIIIllll[3]);

                                    }
                                    if (p.lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(eD), lIIlIIIIIllll[3])) {
                                        String[] stringArray = new String[lIIlIIIIIllll[3]];
                                        stringArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[41]];
                                        llllllllllllllIlllllllIlIIIlIIII2 = TileObjects.getNearest((String[])stringArray);
                                        AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[42]];
                                        if (p.lIlIIllllIIllII(llllllllllllllIlllllllIlIIIlIIII2)) {
                                            String[] stringArray4 = new String[lIIlIIIIIllll[3]];
                                            stringArray4[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[43]];
                                            if (p.lIlIIllllIIlIII(llllllllllllllIlllllllIlIIIlIIII2.hasAction(stringArray4) ? 1 : 0)) {
                                                llllllllllllllIlllllllIlIIIlIIII2.interact(lIIlIIIIIlllI[lIIlIIIIIllll[44]]);
                                                Time.sleepTicks((int)lIIlIIIIIllll[1]);

                                            }
                                            String[] stringArray5 = new String[lIIlIIIIIllll[3]];
                                            stringArray5[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[45]];
                                            if (p.lIlIIllllIIlIII(llllllllllllllIlllllllIlIIIlIIII2.hasAction(stringArray5) ? 1 : 0)) {
                                                llllllllllllllIlllllllIlIIIlIIII2.interact(lIIlIIIIIlllI[lIIlIIIIIllll[46]]);
                                                Time.sleepTicks((int)lIIlIIIIIllll[1]);

                                                var2 = Widgets.get((int)lIIlIIIIIllll[23], (int)lIIlIIIIIllll[3]);
                                                if (p.lIlIIllllIIllII(var2)) {
                                                    var2.interact(lIIlIIIIIlllI[lIIlIIIIIllll[47]]);
                                                    var2.interact(lIIlIIIIIllll[4]);
                                                    var2.interact(lIIlIIIIIlllI[lIIlIIIIIllll[48]]);
                                                    Keyboard.type((String)lIIlIIIIIlllI[lIIlIIIIIllll[49]]);
                                                }
                                            }
                                        }
                                    }
                                }
                                int[] nArray10 = new int[lIIlIIIIIllll[3]];
                                nArray10[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[39];
                                if (p.lIlIIllllIIlIII(Inventory.contains((int[])nArray10) ? 1 : 0) && p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(eA), lIIlIIIIIllll[3])) {
                                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[50]];
                                    Movement.walkTo((WorldPoint)eA);

                                    Time.sleepTicks((int)lIIlIIIIIllll[3]);

                                }
                                if (p.lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(eA), lIIlIIIIIllll[1])) {
                                    String[] stringArray = new String[lIIlIIIIIllll[3]];
                                    stringArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[51]];
                                    llllllllllllllIlllllllIlIIIlIIII2 = TileObjects.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[lIIlIIIIIllll[3]];
                                    stringArray6[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[52]];
                                    var2 = NPCs.getNearest((String[])stringArray6);
                                    if (p.lIlIIllllIIllII(llllllllllllllIlllllllIlIIIlIIII2) && p.lIlIIllllIIllIl(var2)) {
                                        AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[53]];
                                        String[] stringArray7 = new String[lIIlIIIIIllll[3]];
                                        stringArray7[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[54]];
                                        if (p.lIlIIllllIIlIII(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                                            String[] stringArray8 = new String[lIIlIIIIIllll[3]];
                                            stringArray8[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[55]];
                                            Inventory.getFirst((String[])stringArray8).useOn(llllllllllllllIlllllllIlIIIlIIII2);
                                        }
                                        Time.sleepTicks((int)lIIlIIIIIllll[3]);

                                    }
                                    if (p.lIlIIllllIIllII(var2)) {
                                        AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[56]];
                                        int[] nArray11 = new int[lIIlIIIIIllll[3]];
                                        nArray11[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[39];
                                        if (p.lIlIIllllIIlIII(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                            int[] nArray12 = new int[lIIlIIIIIllll[3]];
                                            nArray12[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[39];
                                            Inventory.getFirst((int[])nArray12).useOn((Actor)var2);
                                        }
                                        Time.sleepTicks((int)lIIlIIIIIllll[3]);

                                    }
                                }
                            }
                            if (p.lIlIIllllIIlIII(eL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && p.lIlIIllllIIIlll(e.j(lIIlIIIIIllll[2]), lIIlIIIIIllll[12])) {
                                AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[57]];
                                Movement.walkTo((WorldPoint)new WorldPoint(lIIlIIIIIllll[58], lIIlIIIIIllll[59], lIIlIIIIIllll[4]));

                                Time.sleepTicks((int)lIIlIIIIIllll[3]);

                            }
                            if (!p.lIlIIllllIIlIIl(eL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !p.lIlIIllllIIIlll(e.j(lIIlIIIIIllll[2]), lIIlIIIIIllll[12])) break block89;
                            int[] nArray = new int[lIIlIIIIIllll[3]];
                            nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[60];
                            if (!p.lIlIIllllIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block90;
                            int[] nArray13 = new int[lIIlIIIIIllll[3]];
                            nArray13[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[60];
                            if (!p.lIlIIllllIIlIII(Inventory.contains((int[])nArray13) ? 1 : 0) || !p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(eJ), lIIlIIIIIllll[12])) break block89;
                        }
                        AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[61]];
                        if (p.lIlIIllllIIlllI(Movement.getRunEnergy(), lIIlIIIIIllll[33])) {
                            p.aQ();
                        }
                    }
                    if (p.lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(eJ), lIIlIIIIIllll[12])) {
                        int[] nArray = new int[lIIlIIIIIllll[3]];
                        nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[60];
                        if (p.lIlIIllllIIlIII(Inventory.contains((int[])nArray) ? 1 : 0) && p.lIlIIllllIIIlll(Players.getLocal().getWorldLocation().getX(), lIIlIIIIIllll[62])) {
                            String[] stringArray = new String[lIIlIIIIIllll[3]];
                            stringArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[63]];
                            llllllllllllllIlllllllIlIIIlIIII2 = TileObjects.getNearest((String[])stringArray);
                            if (p.lIlIIllllIIllII(llllllllllllllIlllllllIlIIIlIIII2)) {
                                AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[64]];
                                int[] nArray14 = new int[lIIlIIIIIllll[3]];
                                nArray14[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[60];
                                if (p.lIlIIllllIIlIII(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                    int[] nArray15 = new int[lIIlIIIIIllll[3]];
                                    nArray15[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[60];
                                    Inventory.getFirst((int[])nArray15).useOn(llllllllllllllIlllllllIlIIIlIIII2);
                                    Time.sleepTicks((int)lIIlIIIIIllll[1]);

                                }
                            }
                        }
                    }
                    if (!p.lIlIIllllIIlIII(eN.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block91;
                    int[] nArray = new int[lIIlIIIIIllll[3]];
                    nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[60];
                    if (!p.lIlIIllllIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block91;
                    if (p.lIlIIllllIIlIIl(Players.getLocal().getWorldLocation().equals((Object)ex) ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[65]];
                        Movement.walkTo((WorldPoint)ex);

                    }
                    if (p.lIlIIllllIIlIll(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lIIlIIIIIllll[13])) {
                        int[] nArray16 = new int[lIIlIIIIIllll[3]];
                        nArray16[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                        if (p.lIlIIllllIIlIII(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                            int[] nArray17 = new int[lIIlIIIIIllll[3]];
                            nArray17[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                            Inventory.getFirst((int[])nArray17).interact(lIIlIIIIIlllI[lIIlIIIIIllll[66]]);
                        }
                    }
                    if (!p.lIlIIllllIIlIII(Players.getLocal().getWorldLocation().equals((Object)ex) ? 1 : 0) || !p.lIlIIllllIIllII(llllllllllllllIlllllllIlIIIlIIII2 = NPCs.getNearest((int[])fb)) || !p.lIlIIllllIIlIIl(llllllllllllllIlllllllIlIIIlIIII2.isDead() ? 1 : 0)) break block91;
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[67]];
                    if (p.lIlIIllllIIIllI(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIIIllll[21])) {
                        Magic.cast((Spell)SpellBook.Standard.WATER_STRIKE, (NPC)llllllllllllllIlllllllIlIIIlIIII2);
                        Time.sleepTicks((int)lIIlIIIIIllll[3]);

                    }
                    if (p.lIlIIllllIIIllI(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIIIllll[26]) && !p.lIlIIllllIIIllI(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIIIllll[21])) break block92;
                    if (!p.lIlIIllllIIlllI(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIIIllll[21])) break block93;
                    int[] nArray18 = new int[lIIlIIIIIllll[3]];
                    nArray18[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[6];
                    if (!p.lIlIIllllIIlIII(Inventory.contains((int[])nArray18) ? 1 : 0)) break block93;
                    String[] stringArray = new String[lIIlIIIIIllll[3]];
                    stringArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[68]];
                    if (!p.lIlIIllllIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block93;
                }
                Magic.cast((Spell)SpellBook.Standard.EARTH_STRIKE, (NPC)llllllllllllllIlllllllIlIIIlIIII2);
                Time.sleepTicks((int)lIIlIIIIIllll[3]);

            }
            if (p.lIlIIllllIIlllI(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIIIllll[26])) {
                String[] stringArray = new String[lIIlIIIIIllll[3]];
                stringArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[69]];
                if (p.lIlIIllllIIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    Magic.cast((Spell)SpellBook.Standard.FIRE_STRIKE, (NPC)llllllllllllllIlllllllIlIIIlIIII2);
                    Time.sleepTicks((int)lIIlIIIIIllll[3]);

                }
            }
        }
        if (p.lIlIIllllIIIlll(e.j(lIIlIIIIIllll[2]), lIIlIIIIIllll[14])) {
            String[] stringArray = new String[lIIlIIIIIllll[3]];
            stringArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[70]];
            if (p.lIlIIllllIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray9 = new String[lIIlIIIIIllll[3]];
                stringArray9[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[71]];
                llllllllllllllIlllllllIlIIIlIIII2 = TileItems.getNearest((String[])stringArray9);
                if (p.lIlIIllllIIllII(llllllllllllllIlllllllIlIIIlIIII2)) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[72]];
                    llllllllllllllIlllllllIlIIIlIIII2.interact(lIIlIIIIIlllI[lIIlIIIIIllll[73]]);
                    Time.sleepTicks((int)lIIlIIIIIllll[1]);

                }
            }
        }
        if (p.lIlIIllllIIIlll(e.j(lIIlIIIIIllll[2]), lIIlIIIIIllll[14])) {
            String[] stringArray = new String[lIIlIIIIIllll[3]];
            stringArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[74]];
            if (p.lIlIIllllIIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                if (p.lIlIIllllIIlIII(eN.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] nArray = new int[lIIlIIIIIllll[3]];
                    nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                    if (p.lIlIIllllIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[75]];
                        int[] nArray19 = new int[lIIlIIIIIllll[3]];
                        nArray19[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                        Inventory.getFirst((int[])nArray19).interact(lIIlIIIIIlllI[lIIlIIIIIllll[76]]);
                        Time.sleepTicks((int)lIIlIIIIIllll[13]);

                    }
                }
                if (p.lIlIIllllIIlIIl(eN.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(ew), lIIlIIIIIllll[15])) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[77]];
                    Movement.walkTo((WorldPoint)ew);

                    Time.sleepTicks((int)lIIlIIIIIllll[3]);

                }
                if (p.lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(ew), lIIlIIIIIllll[13])) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[78]];
                    if (p.lIlIIllllIIIllI(co, lIIlIIIIIllll[3])) {
                        P.iw += lIIlIIIIIllll[3];
                        P.d(AccBuilderRat.m);
                        co += lIIlIIIIIllll[3];
                        P.iw = lIIlIIIIIllll[4];
                        cp = lIIlIIIIIllll[4];
                    }
                    g.a(lIIlIIIIIlllI[lIIlIIIIIllll[79]], dP);
                }
            }
        }
    }

    public static void aQ() {
        if (p.lIlIIllllIIlIII(Inventory.contains((int[])f.ba) ? 1 : 0) && p.lIlIIllllIIIllI(Movement.getRunEnergy(), lIIlIIIIIllll[68])) {
            Inventory.getFirst((int[])f.ba).interact(lIIlIIIIIlllI[lIIlIIIIIllll[80]]);
            Time.sleepTicks((int)lIIlIIIIIllll[3]);

        }
        if (p.lIlIIllllIIlIIl(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (!p.lIlIIllllIIlIIl(eL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || p.lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(eA), lIIlIIIIIllll[1])) {
            AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[81]];
            Movement.walkTo((WorldPoint)new WorldPoint(lIIlIIIIIllll[58], lIIlIIIIIllll[59], lIIlIIIIIllll[4]));

            Time.sleepTicks((int)lIIlIIIIIllll[3]);

        }
        int[] nArray = new int[lIIlIIIIIllll[3]];
        nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[82];
        NPC var3 = NPCs.getNearest((int[])nArray);
        int[] nArray2 = new int[lIIlIIIIIllll[3]];
        nArray2[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[60];
        if (p.lIlIIllllIIlIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            if (p.lIlIIllllIIlIII(ea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && p.lIlIIllllIIllII(var3) && p.lIlIIllllIIlIII(eg.contains(var3.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks((int)lIIlIIIIIllll[24]);

                while (p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(dX), lIIlIIIIIllll[3]) && p.lIlIIllllIIlIIl(AccBuilderRat.d ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[83]];
                    Movement.walkTo((WorldPoint)dX);

                    Time.sleepTicks((int)lIIlIIIIIllll[3]);

                    if (-(0x48 ^ 0xE ^ (0x7E ^ 0x3C)) <= 0) continue;
                    return;
                }
            }
            if (p.lIlIIllllIIlIII(eb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && p.lIlIIllllIIllII(var3) && p.lIlIIllllIIlIII(ed.contains(var3.getWorldLocation()) ? 1 : 0)) {
                while (p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(dY), lIIlIIIIIllll[3]) && p.lIlIIllllIIlIIl(AccBuilderRat.d ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[84]];
                    Movement.walkTo((WorldPoint)dY);

                    Time.sleepTicks((int)lIIlIIIIIllll[3]);

                    if (((0xE1 ^ 0xAF ^ (0x76 ^ 0x16)) & (0x94 ^ 0xC6 ^ (0x1D ^ 0x61) ^ -1)) == 0) continue;
                    return;
                }
            }
            if (p.lIlIIllllIIlIII(ec.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && p.lIlIIllllIIllII(var3) && p.lIlIIllllIIlIII(eh.contains(var3.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks((int)lIIlIIIIIllll[18]);

                while (p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(dZ), lIIlIIIIIllll[3]) && p.lIlIIllllIIlIIl(AccBuilderRat.d ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[85]];
                    Movement.walkTo((WorldPoint)dZ);

                    Time.sleepTicks((int)lIIlIIIIIllll[3]);

                    if ((0x7F ^ 0x7B) > 0) continue;
                    return;
                }
            }
            if (p.lIlIIllllIIlIII(ef.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && p.lIlIIllllIIllII(var3) && p.lIlIIllllIIlIII(eh.contains(var3.getWorldLocation()) ? 1 : 0)) {
                while (p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(eK), lIIlIIIIIllll[1]) && p.lIlIIllllIIlIIl(AccBuilderRat.d ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[86]];
                    Movement.walkTo((WorldPoint)eK);

                    Time.sleepTicks((int)lIIlIIIIIllll[3]);

                    if ((0x7E ^ 0x3F ^ (0x5C ^ 0x19)) >= 3) continue;
                    return;
                }
            }
            if (p.lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(eK), lIIlIIIIIllll[12])) {
                AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[87]];
                String[] stringArray = new String[lIIlIIIIIllll[3]];
                stringArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[88]];
                TileObject var4 = TileObjects.getNearest((String[])stringArray);
                if (p.lIlIIllllIIllII(var4)) {
                    var4.interact(lIIlIIIIIlllI[lIIlIIIIIllll[89]]);
                    Time.sleepTicks((int)lIIlIIIIIllll[1]);

                    Widget var5 = Widgets.get((int)lIIlIIIIIllll[23], (int)lIIlIIIIIllll[3]);
                    if (p.lIlIIllllIIllII(var5)) {
                        var5.interact(lIIlIIIIIlllI[lIIlIIIIIllll[90]]);
                        var5.interact(lIIlIIIIIllll[4]);
                        var5.interact(lIIlIIIIIlllI[lIIlIIIIIllll[91]]);
                        Keyboard.type((String)lIIlIIIIIlllI[lIIlIIIIIllll[92]]);
                    }
                }
            }
        }
        int[] nArray3 = new int[lIIlIIIIIllll[3]];
        nArray3[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[60];
        if (p.lIlIIllllIIlIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            if (p.lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(eK), lIIlIIIIIllll[12])) {
                while (p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIIllll[93], lIIlIIIIIllll[94], lIIlIIIIIllll[4])), lIIlIIIIIllll[3]) && p.lIlIIllllIIlIIl(AccBuilderRat.d ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[95]];
                    Movement.walkTo((WorldPoint)new WorldPoint(lIIlIIIIIllll[93], lIIlIIIIIllll[94], lIIlIIIIIllll[4]));

                    Time.sleepTicks((int)lIIlIIIIIllll[3]);

                    return;
                }
            }
            if (p.lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIIllll[93], lIIlIIIIIllll[94], lIIlIIIIIllll[4])), lIIlIIIIIllll[1]) && p.lIlIIllllIIllII(var3) && p.lIlIIllllIIlIII(eg.contains(var3.getWorldLocation()) ? 1 : 0)) {
                while (p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(dY), lIIlIIIIIllll[3]) && p.lIlIIllllIIlIIl(AccBuilderRat.d ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[96]];
                    Movement.walkTo((WorldPoint)dY);

                    Time.sleepTicks((int)lIIlIIIIIllll[3]);

                    return;
                }
            }
        }
    }

    private static void lIlIIllllIIIlII() {
        lIIlIIIIIlllI = new String[lIIlIIIIIllll[174]];
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[4]] = "Buying items";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[3]] = "Finished buying items, switching back to questing";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[1]] = "Breaking tab";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[12]] = "Break";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[15]] = "Nav to start";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[13]] = "Drink";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[14]] = "Boy";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[18]] = "Navigating to outside door";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[20]] = "Drop";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[21]] = "Stealing key";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[22]] = "Look-under";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[24]] = "Continue";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[25]] = "null";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[26]] = " ";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[27]] = "Nav to magnet box";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[28]] = "Nav to magnet box";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[29]] = "Cupboard";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[30]] = "Taking magnet";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[31]] = "Drop";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[32]] = "Open";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[33]] = "Open";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[34]] = "Search";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[35]] = "Search";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[36]] = "Continue";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[37]] = "null";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[38]] = " ";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[40]] = "Nav to magnet box";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[41]] = "Cupboard";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[42]] = "Taking magnet";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[43]] = "Open";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[44]] = "Open";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[45]] = "Search";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[46]] = "Search";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[47]] = "Continue";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[48]] = "null";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[49]] = " ";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[50]] = "Nav to cheese spot";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[51]] = "Mouse hole";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[52]] = "Mouse";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[53]] = "Using cheese";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[54]] = "Cheese";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[55]] = "Cheese";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[56]] = "Handle mouse";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[57]] = "Entering maze";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[61]] = "Handling walking";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[63]] = "Door";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[64]] = "Entering shed";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[65]] = "Nav to safe spot";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[66]] = "Eat";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[67]] = "Casting spell";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[68]] = "Fire rune";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[69]] = "Fire rune";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[70]] = "Ball";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[71]] = "Ball";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[72]] = "Taking ball";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[73]] = "Take";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[74]] = "Ball";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[75]] = "Breaking tab";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[76]] = "Break";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[77]] = "Nav to witches start";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[78]] = "Turning in quest";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[79]] = "Boy";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[80]] = "Drink";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[81]] = "Entering maze";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[83]] = "Nav to first spot";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[84]] = "Nav to second spot";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[85]] = "Nav to third spot";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[86]] = "Nav to fountain";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[87]] = "Getting key";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[88]] = "Fountain";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[89]] = "Check";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[90]] = "Continue";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[91]] = "null";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[92]] = " ";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[95]] = "Nav back toward maze";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[96]] = "Nav to shed spot";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[97]] = "Navigating to bank";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[98]] = "Opening bank";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[100]] = "Handling banking";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[102]] = "We are missing supplies, switching to BUYING";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[16]] = "We are missing supplies, switching to BUYING";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[103]] = "We are missing supplies, switching to BUYING";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[104]] = "We are missing supplies, switching to BUYING";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[106]] = "We are missing supplies, switching to BUYING";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[116]] = "Witches House quest";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[117]] = "ring of wealth (";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[163]] = "Wizard Mizgog";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[164]] = "Give me a quest please.";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[165]] = "I'll try.";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[166]] = "Actually, I know where to find this stuff.";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[167]] = "Yes.";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[168]] = "What's the matter?";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[169]] = "Ok, I'll see what I can do.";
    }

    private static boolean lIlIIllllIIlIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIllllIIlIII(int n2) {
        return n2 != 0;
    }

    private static void W() {
        d var6;
        block21: {
            block20: {
                Object var7;
                block19: {
                    block18: {
                        int[] nArray = new int[lIIlIIIIIllll[3]];
                        nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                        if (p.lIlIIllllIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new DHelper(lIIlIIIIIllll[8], lIIlIIIIIllll[109], lIIlIIIIIllll[110]);
                            bA.add(d2);

                        }
                        int[] nArray2 = new int[lIIlIIIIIllll[3]];
                        nArray2[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                        if (p.lIlIIllllIIlIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[lIIlIIIIIllll[3]];
                            nArray3[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                            if (p.lIlIIllllIIIllI(Bank.getFirst((int[])nArray3).getQuantity(), lIIlIIIIIllll[33])) {
                                var7 = new DHelper(lIIlIIIIIllll[8], lIIlIIIIIllll[54], lIIlIIIIIllll[110]);
                                bA.add((DHelper) ar7);

                            }
                        }
                        int[] nArray4 = new int[lIIlIIIIIllll[3]];
                        nArray4[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[9];
                        if (!p.lIlIIllllIIlIII(Bank.contains((int[])nArray4) ? 1 : 0)) break block18;
                        int[] nArray5 = new int[lIIlIIIIIllll[3]];
                        nArray5[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[9];
                        if (!p.lIlIIllllIIlIII(Bank.contains((int[])nArray5) ? 1 : 0)) break block19;
                        int[] nArray6 = new int[lIIlIIIIIllll[3]];
                        nArray6[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[9];
                        if (!p.lIlIIllllIIIllI(Bank.getFirst((int[])nArray6).getQuantity(), lIIlIIIIIllll[13])) break block19;
                    }
                    var7 = new DHelper(lIIlIIIIIllll[9], lIIlIIIIIllll[13], lIIlIIIIIllll[111]);
                    bA.add((DHelper) ar7);

                }
                if (p.lIlIIllllIIlIIl(Bank.contains((Predicate)(var7 = item -> item.getName().toLowerCase().contains(lIIlIIIIIlllI[lIIlIIIIIllll[117]]))) ? 1 : 0)) {
                    var6 = new DHelper(lIIlIIIIIllll[112], lIIlIIIIIllll[31], lIIlIIIIIllll[113]);
                    bA.add(var6);

                }
                int[] nArray = new int[lIIlIIIIIllll[3]];
                nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[105];
                if (p.lIlIIllllIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    var6 = new DHelper(lIIlIIIIIllll[105], lIIlIIIIIllll[54], lIIlIIIIIllll[114]);
                    bA.add(var6);

                }
                int[] nArray7 = new int[lIIlIIIIIllll[3]];
                nArray7[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                if (!p.lIlIIllllIIlIII(Bank.contains((int[])nArray7) ? 1 : 0)) break block20;
                int[] nArray8 = new int[lIIlIIIIIllll[3]];
                nArray8[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                if (!p.lIlIIllllIIlIII(Bank.contains((int[])nArray8) ? 1 : 0)) break block21;
                int[] nArray9 = new int[lIIlIIIIIllll[3]];
                nArray9[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                if (!p.lIlIIllllIIIllI(Bank.getFirst((int[])nArray9).getQuantity(), lIIlIIIIIllll[22])) break block21;
            }
            var6 = new DHelper(lIIlIIIIIllll[10], lIIlIIIIIllll[33], lIIlIIIIIllll[114]);
            bA.add(var6);

        }
        int[] nArray = new int[lIIlIIIIIllll[3]];
        nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[108];
        if (p.lIlIIllllIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            var6 = new DHelper(lIIlIIIIIllll[108], lIIlIIIIIllll[13], h.bv);
            bA.add(var6);

        }
        int[] nArray10 = new int[lIIlIIIIIllll[3]];
        nArray10[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[7];
        if (p.lIlIIllllIIlIII(Bank.contains((int[])nArray10) ? 1 : 0)) {
            int[] nArray11 = new int[lIIlIIIIIllll[3]];
            nArray11[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[7];
            if (p.lIlIIllllIIIllI(Bank.getFirst((int[])nArray11).getQuantity(), lIIlIIIIIllll[101])) {
                var6 = new DHelper(lIIlIIIIIllll[7], lIIlIIIIIllll[115], lIIlIIIIIllll[18]);
                bA.add(var6);

            }
        }
        int[] nArray12 = new int[lIIlIIIIIllll[3]];
        nArray12[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[5];
        if (p.lIlIIllllIIlIII(Bank.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[lIIlIIIIIllll[3]];
            nArray13[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[5];
            if (p.lIlIIllllIIIllI(Bank.getFirst((int[])nArray13).getQuantity(), lIIlIIIIIllll[101])) {
                var6 = new DHelper(lIIlIIIIIllll[5], lIIlIIIIIllll[115], lIIlIIIIIllll[18]);
                bA.add(var6);

            }
        }
        int[] nArray14 = new int[lIIlIIIIIllll[3]];
        nArray14[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[6];
        if (p.lIlIIllllIIlIII(Bank.contains((int[])nArray14) ? 1 : 0)) {
            int[] nArray15 = new int[lIIlIIIIIllll[3]];
            nArray15[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[6];
            if (p.lIlIIllllIIIllI(Bank.getFirst((int[])nArray15).getQuantity(), lIIlIIIIIllll[101])) {
                var6 = new DHelper(lIIlIIIIIllll[6], lIIlIIIIIllll[115], lIIlIIIIIllll[18]);
                bA.add(var6);

            }
        }
    }

    private static boolean lIlIIllllIIllIl(Object object) {
        return object == null;
    }

    @Override
    public int Y() {
        p.aP();
        return lIIlIIIIIllll[109];
    }

        return String.valueOf(var8);
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (p.lIlIIllllIIlllI(e.j(lIIlIIIIIllll[2]), lIIlIIIIIllll[18])) {
            bl = lIIlIIIIIllll[3];

        } else {
            bl = lIIlIIIIIllll[4];
        }
        return bl;
    }

    private static boolean lIlIIllllIIlllI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public String Z() {
        return lIIlIIIIIlllI[lIIlIIIIIllll[116]];
    }

    @Override
    public boolean X() {
        return lIIlIIIIIllll[4];
    }

    private static boolean lIlIIllllIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIllllIIllll(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIllllIIlIll(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        p.lIlIIllllIIIlIl();
        p.lIlIIllllIIIlII();
        eq = lIIlIIIIIllll[82];
        ei = lIIlIIIIIllll[0];
        es = lIIlIIIIIllll[60];
        et = lIIlIIIIIllll[39];
        em = lIIlIIIIIllll[1];
        ep = lIIlIIIIIllll[18];
        ek = lIIlIIIIIllll[2];
        eS = lIIlIIIIIllll[7];
        eo = lIIlIIIIIllll[14];
        eO = lIIlIIIIIllll[118];
        eT = lIIlIIIIIllll[5];
        ej = lIIlIIIIIllll[1];
        eQ = lIIlIIIIIllll[119];
        eR = lIIlIIIIIllll[120];
        eV = lIIlIIIIIllll[121];
        el = lIIlIIIIIllll[3];
        er = lIIlIIIIIllll[17];
        eX = lIIlIIIIIllll[9];
        en = lIIlIIIIIllll[12];
        eP = lIIlIIIIIllll[122];
        eU = lIIlIIIIIllll[6];
        eW = lIIlIIIIIllll[8];
        eu = lIIlIIIIIllll[19];
        dX = new WorldPoint(lIIlIIIIIllll[123], lIIlIIIIIllll[59], lIIlIIIIIllll[4]);
        dY = new WorldPoint(lIIlIIIIIllll[62], lIIlIIIIIllll[124], lIIlIIIIIllll[4]);
        dZ = new WorldPoint(lIIlIIIIIllll[125], lIIlIIIIIllll[94], lIIlIIIIIllll[4]);
        ea = new WorldArea(lIIlIIIIIllll[126], lIIlIIIIIllll[127], lIIlIIIIIllll[31], lIIlIIIIIllll[14], lIIlIIIIIllll[4]);
        eb = new WorldArea(lIIlIIIIIllll[128], lIIlIIIIIllll[127], lIIlIIIIIllll[30], lIIlIIIIIllll[14], lIIlIIIIIllll[4]);
        ec = new WorldArea(lIIlIIIIIllll[129], lIIlIIIIIllll[130], lIIlIIIIIllll[15], lIIlIIIIIllll[22], lIIlIIIIIllll[4]);
        ed = new WorldArea(lIIlIIIIIllll[131], lIIlIIIIIllll[132], lIIlIIIIIllll[24], lIIlIIIIIllll[15], lIIlIIIIIllll[4]);
        ee = new WorldArea(lIIlIIIIIllll[133], lIIlIIIIIllll[132], lIIlIIIIIllll[18], lIIlIIIIIllll[13], lIIlIIIIIllll[4]);
        ef = new WorldArea(lIIlIIIIIllll[134], lIIlIIIIIllll[135], lIIlIIIIIllll[21], lIIlIIIIIllll[18], lIIlIIIIIllll[4]);
        eg = new WorldArea(lIIlIIIIIllll[136], lIIlIIIIIllll[132], lIIlIIIIIllll[15], lIIlIIIIIllll[15], lIIlIIIIIllll[4]);
        eh = new WorldArea(lIIlIIIIIllll[137], lIIlIIIIIllll[132], lIIlIIIIIllll[15], lIIlIIIIIllll[13], lIIlIIIIIllll[4]);
        ev = new WorldPoint(lIIlIIIIIllll[138], lIIlIIIIIllll[139], lIIlIIIIIllll[1]);
        ew = new WorldPoint(lIIlIIIIIllll[140], lIIlIIIIIllll[141], lIIlIIIIIllll[4]);
        ex = new WorldPoint(lIIlIIIIIllll[142], lIIlIIIIIllll[127], lIIlIIIIIllll[4]);
        ey = new WorldPoint(lIIlIIIIIllll[143], lIIlIIIIIllll[144], lIIlIIIIIllll[4]);
        ez = new WorldPoint(lIIlIIIIIllll[145], lIIlIIIIIllll[146], lIIlIIIIIllll[4]);
        eA = new WorldPoint(lIIlIIIIIllll[131], lIIlIIIIIllll[94], lIIlIIIIIllll[4]);
        eB = new WorldPoint(lIIlIIIIIllll[147], lIIlIIIIIllll[148], lIIlIIIIIllll[4]);
        eC = new WorldPoint(lIIlIIIIIllll[149], lIIlIIIIIllll[150], lIIlIIIIIllll[4]);
        eD = new WorldPoint(lIIlIIIIIllll[145], lIIlIIIIIllll[151], lIIlIIIIIllll[4]);
        eE = new WorldPoint(lIIlIIIIIllll[131], lIIlIIIIIllll[151], lIIlIIIIIllll[4]);
        eF = new WorldPoint(lIIlIIIIIllll[131], lIIlIIIIIllll[152], lIIlIIIIIllll[4]);
        eG = new WorldPoint(lIIlIIIIIllll[136], lIIlIIIIIllll[151], lIIlIIIIIllll[4]);
        eH = new WorldPoint(lIIlIIIIIllll[136], lIIlIIIIIllll[152], lIIlIIIIIllll[4]);
        eI = new WorldPoint(lIIlIIIIIllll[58], lIIlIIIIIllll[153], lIIlIIIIIllll[4]);
        eJ = new WorldPoint(lIIlIIIIIllll[62], lIIlIIIIIllll[135], lIIlIIIIIllll[4]);
        eK = new WorldPoint(lIIlIIIIIllll[154], lIIlIIIIIllll[155], lIIlIIIIIllll[4]);
        eL = new WorldArea(new WorldPoint(lIIlIIIIIllll[156], lIIlIIIIIllll[157], lIIlIIIIIllll[4]), new WorldPoint(lIIlIIIIIllll[58], lIIlIIIIIllll[94], lIIlIIIIIllll[4]));
        eM = new WorldArea(new WorldPoint(lIIlIIIIIllll[145], lIIlIIIIIllll[158], lIIlIIIIIllll[4]), new WorldPoint(lIIlIIIIIllll[159], lIIlIIIIIllll[160], lIIlIIIIIllll[4]));
        eN = new WorldArea(lIIlIIIIIllll[62], lIIlIIIIIllll[130], lIIlIIIIIllll[14], lIIlIIIIIllll[22], lIIlIIIIIllll[4]);
        bA = new ArrayList<d>();
        eY = lIIlIIIIIllll[161];
        eZ = lIIlIIIIIllll[162];
        fa = lIIlIIIIIlllI[lIIlIIIIIllll[163]];
        String[] stringArray = new String[lIIlIIIIIllll[14]];
        stringArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[164]];
        stringArray[p.lIIlIIIIIllll[3]] = lIIlIIIIIlllI[lIIlIIIIIllll[165]];
        stringArray[p.lIIlIIIIIllll[1]] = lIIlIIIIIlllI[lIIlIIIIIllll[166]];
        stringArray[p.lIIlIIIIIllll[12]] = lIIlIIIIIlllI[lIIlIIIIIllll[167]];
        stringArray[p.lIIlIIIIIllll[15]] = lIIlIIIIIlllI[lIIlIIIIIllll[168]];
        stringArray[p.lIIlIIIIIllll[13]] = lIIlIIIIIlllI[lIIlIIIIIllll[169]];
        dP = stringArray;
        int[] nArray = new int[lIIlIIIIIllll[15]];
        nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[170];
        nArray[p.lIIlIIIIIllll[3]] = lIIlIIIIIllll[171];
        nArray[p.lIIlIIIIIllll[1]] = lIIlIIIIIllll[172];
        nArray[p.lIIlIIIIIllll[12]] = lIIlIIIIIllll[173];
        fb = nArray;
    }
}

