/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
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
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Production
 */
package gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.FHelper;
import net.runelite.api.Skill;
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
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;

public class AGHelper
implements W {

    public static  List<d> bv;
    public static final  int lL;
    public static final  WorldPoint lN;
    public static final  WorldPoint lO;
    public static final  int lK;
    public static final  int lM;
    public static  boolean bt;

    private static boolean lIIllIlIllll(int n2) {
        return n2 > 0;
    }

    private static boolean lIIllIllIIII(int n2, int n3) {
        return n2 >= n3;
    }

        return String.valueOf(llIIlIlIIlIIll);
    }

    private static boolean ab() {
        boolean bl;
        if (ag.lIIllIllIIII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[8])) {
            boolean bl2;
            int[] nArray = new int[lIlllIIlI[1]];
            nArray[ag.lIlllIIlI[0]] = lIlllIIlI[11];
            if (ag.lIIllIlIllll(Inventory.getCount((int[])nArray))) {
                bl2 = lIlllIIlI[1];

                if (-(0x6C ^ 0x68) >= 0) {
                    return false;
                }
            } else {
                bl2 = lIlllIIlI[0];
            }
            return bl2;
        }
        if (ag.lIIllIllIIII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[5]) && ag.lIIllIlIllII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[8])) {
            boolean bl3;
            int[] nArray = new int[lIlllIIlI[1]];
            nArray[ag.lIlllIIlI[0]] = lIlllIIlI[9];
            if (ag.lIIllIlIllll(Inventory.getCount((int[])nArray))) {
                bl3 = lIlllIIlI[1];

                }
            } else {
                bl3 = lIlllIIlI[0];
            }
            return bl3;
        }
        int[] nArray = new int[lIlllIIlI[1]];
        nArray[ag.lIlllIIlI[0]] = lIlllIIlI[6];
        if (ag.lIIllIlIllll(Inventory.getCount((int[])nArray))) {
            bl = lIlllIIlI[1];

            if (3 <= 2) {
                return ((0x72 ^ 0x4B ^ (0x19 ^ 0x12)) & (67 + 30 - 75 + 134 ^ 112 + 131 - 185 + 116 ^ -1)) != 0;
            }
        } else {
            bl = lIlllIIlI[0];
        }
        return bl;
    }

    @Override
    public String U() {
        return lIlllIIIl[lIlllIIlI[34]];
    }

    private static boolean lIIllIlIlllI(Object object) {
        return object != null;
    }

    private static void lIIllIlIlIIl() {
        lIlllIIIl = new String[lIlllIIlI[41]];
        ag.lIlllIIIl[ag.lIlllIIlI[0]] = "Buying items";
        ag.lIlllIIIl[ag.lIlllIIlI[1]] = "Finished buying items, switching back to cooking";
        ag.lIlllIIIl[ag.lIlllIIlI[2]] = "Navigating to bank";
        ag.lIlllIIIl[ag.lIlllIIlI[3]] = "Handling banking";
        ag.lIlllIIIl[ag.lIlllIIlI[7]] = "We are missing supplies, switching to BUYING";
        ag.lIlllIIIl[ag.lIlllIIlI[10]] = "We are missing supplies, switching to BUYING";
        ag.lIlllIIIl[ag.lIlllIIlI[12]] = "We are missing supplies, switching to BUYING";
        ag.lIlllIIIl[ag.lIlllIIlI[15]] = "Equiping duel";
        ag.lIlllIIIl[ag.lIlllIIlI[16]] = "Wear";
        ag.lIlllIIIl[ag.lIlllIIlI[17]] = "Navigate to range";
        ag.lIlllIIIl[ag.lIlllIIlI[18]] = "Cooking";
        ag.lIlllIIIl[ag.lIlllIIlI[19]] = "Range";
        ag.lIlllIIIl[ag.lIlllIIlI[20]] = "Cook";
        ag.lIlllIIIl[ag.lIlllIIlI[34]] = "Cooking";
        ag.lIlllIIIl[ag.lIlllIIlI[36]] = "ring of wealth (";
        ag.lIlllIIIl[ag.lIlllIIlI[5]] = "ring of dueling(";
    }

    private static boolean lIIllIllIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void af() {
        d llIIlIlIlIIIII;
        Object llIIlIlIlIIIIl;
        Object llIIlIlIlIIIlI;
        if (ag.lIIllIlIllII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[5])) {
            d d2 = new DHelper(lIlllIIlI[6], lIlllIIlI[22], lIlllIIlI[23]);
            bv.add(d2);

        }
        if (ag.lIIllIllIIII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[5]) && ag.lIIllIlIllII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[8])) {
            llIIlIlIlIIIlI = new DHelper(lIlllIIlI[9], lIlllIIlI[24], lIlllIIlI[25]);
            bv.add((DHelper) lIIlIlIlIIIlI);

        }
        if (ag.lIIllIllIIII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[8])) {
            llIIlIlIlIIIlI = new DHelper(lIlllIIlI[11], lIlllIIlI[24], lIlllIIlI[25]);
            bv.add((DHelper) lIIlIlIlIIIlI);

        }
        if (ag.lIIllIlIllIl(Bank.contains(llIIlIlIlIIIlI = item -> item.getName().toLowerCase().contains(lIlllIIIl[lIlllIIlI[5]])) ? 1 : 0)) {
            llIIlIlIlIIIIl = new DHelper(lIlllIIlI[13], lIlllIIlI[26], lIlllIIlI[27]);
            bv.add((DHelper) lIIlIlIlIIIIl);

        }
        if (ag.lIIllIlIllIl(Bank.contains(llIIlIlIlIIIIl = item -> item.getName().toLowerCase().contains(lIlllIIIl[lIlllIIlI[36]])) ? 1 : 0)) {
            llIIlIlIlIIIII = new DHelper(lIlllIIlI[28], lIlllIIlI[10], lIlllIIlI[29]);
            bv.add(llIIlIlIlIIIII);

        }
        int[] nArray = new int[lIlllIIlI[1]];
        nArray[ag.lIlllIIlI[0]] = lIlllIIlI[30];
        if (ag.lIIllIlIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            llIIlIlIlIIIII = new DHelper(lIlllIIlI[30], lIlllIIlI[31], lIlllIIlI[32]);
            bv.add(llIIlIlIlIIIII);

        }
    }

    private static boolean lIIllIllIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public int T() {
        ag.dG();
        return lIlllIIlI[33];
    }

    @Override
    public boolean S() {
        return lIlllIIlI[0];
    }

    static {
        ag.lIIllIlIlIlI();
        ag.lIIllIlIlIIl();
        lK = lIlllIIlI[6];
        lM = lIlllIIlI[11];
        lL = lIlllIIlI[9];
        lN = new WorldPoint(lIlllIIlI[37], lIlllIIlI[38], lIlllIIlI[0]);
        lO = new WorldPoint(lIlllIIlI[39], lIlllIIlI[40], lIlllIIlI[0]);
        bv = new ArrayList<d>();
    }

    private static boolean lIIllIlIlIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllIlIllII(int n2, int n3) {
        return n2 < n3;
    }

    public static void dG() {
        if (ag.lIIllIlIlIll(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlllIIIl[lIlllIIlI[0]];
            b.a(bv);
            if (ag.lIIllIlIllII(bv.size(), lIlllIIlI[1])) {
                System.out.println(lIlllIIIl[lIlllIIlI[1]]);
                bt = lIlllIIlI[0];
            }
        }
        if (ag.lIIllIlIllIl(bt ? 1 : 0)) {
            BankLocation llIIlIlIlIIllI;
            if (ag.lIIllIlIllIl(ag.ab() ? 1 : 0)) {
                llIIlIlIlIIllI = BankLocation.getNearest();
                if (ag.lIIllIlIlllI(llIIlIlIlIIllI) && ag.lIIllIlIllIl(llIIlIlIlIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllIIIl[lIlllIIlI[2]];
                    a.a(llIIlIlIlIIllI);
                }
                if (ag.lIIllIlIlllI(llIIlIlIlIIllI) && ag.lIIllIlIlIll(llIIlIlIlIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllIIIl[lIlllIIlI[3]];
                    if (ag.lIIllIlIllIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIlllIIlI[4]);

                    }
                    if (ag.lIIllIlIlIll(Bank.isOpen() ? 1 : 0)) {
                        if (ag.lIIllIlIllll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIlllIIlI[1]);

                        }
                        if (ag.lIIllIlIllll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIlllIIlI[2]);

                        }
                    }
                    if (ag.lIIllIlIllII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[5])) {
                        int[] nArray = new int[lIlllIIlI[1]];
                        nArray[ag.lIlllIIlI[0]] = lIlllIIlI[6];
                        if (ag.lIIllIlIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            ag.af();
                            System.out.println(lIlllIIIl[lIlllIIlI[7]]);
                            bt = lIlllIIlI[1];
                            return;
                        }
                    }
                    if (ag.lIIllIllIIII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[5]) && ag.lIIllIlIllII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[8])) {
                        int[] nArray = new int[lIlllIIlI[1]];
                        nArray[ag.lIlllIIlI[0]] = lIlllIIlI[9];
                        if (ag.lIIllIlIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            ag.af();
                            System.out.println(lIlllIIIl[lIlllIIlI[10]]);
                            bt = lIlllIIlI[1];
                            return;
                        }
                    }
                    if (ag.lIIllIllIIII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[8])) {
                        int[] nArray = new int[lIlllIIlI[1]];
                        nArray[ag.lIlllIIlI[0]] = lIlllIIlI[11];
                        if (ag.lIIllIlIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            ag.af();
                            System.out.println(lIlllIIIl[lIlllIIlI[12]]);
                            bt = lIlllIIlI[1];
                            return;
                        }
                    }
                    int[] nArray = new int[lIlllIIlI[1]];
                    nArray[ag.lIlllIIlI[0]] = lIlllIIlI[13];
                    if (ag.lIIllIlIllIl(Equipment.contains((int[])nArray) ? 1 : 0) && ag.lIIllIllIIIl(Players.getLocal().getWorldLocation().distanceTo(lO), lIlllIIlI[14])) {
                        a.b(f.aN, lIlllIIlI[1]);
                        Time.sleepTicks((int)lIlllIIlI[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIIlI[1]];
                            nArray[ag.lIlllIIlI[0]] = lIlllIIlI[13];
                            if (ag.lIIllIlIllll(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIIlI[1];

                                if (((0x1F ^ 0x24) & ~(0x26 ^ 0x1D)) != 0) {
                                    return false;
                                }
                            } else {
                                bl = lIlllIIlI[0];
                            }
                            return bl;
                        }, (int)lIlllIIlI[4]);

                    }
                    if (ag.lIIllIlIllII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[5])) {
                        Bank.withdrawAll((int)lIlllIIlI[6], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlllIIlI[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIIlI[1]];
                            nArray[ag.lIlllIIlI[0]] = lIlllIIlI[6];
                            if (ag.lIIllIlIllll(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIIlI[1];

                                if (-(0x7D ^ 0 ^ (0x6E ^ 0x16)) >= 0) {
                                    return ((0x69 ^ 0x11 ^ (0xFA ^ 0xB0)) & (0x47 ^ 1 ^ (4 ^ 0x70) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIlllIIlI[0];
                            }
                            return bl;
                        }, (int)lIlllIIlI[4]);

                    }
                    if (ag.lIIllIllIIII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[5]) && ag.lIIllIlIllII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[8])) {
                        Bank.withdrawAll((int)lIlllIIlI[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlllIIlI[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIIlI[1]];
                            nArray[ag.lIlllIIlI[0]] = lIlllIIlI[9];
                            if (ag.lIIllIlIllll(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIIlI[1];

                                if (1 <= 0) {
                                    return false;
                                }
                            } else {
                                bl = lIlllIIlI[0];
                            }
                            return bl;
                        }, (int)lIlllIIlI[4]);

                    }
                    if (ag.lIIllIllIIII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[8])) {
                        Bank.withdrawAll((int)lIlllIIlI[11], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlllIIlI[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIIlI[1]];
                            nArray[ag.lIlllIIlI[0]] = lIlllIIlI[11];
                            if (ag.lIIllIlIllll(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIIlI[1];

                                }
                            } else {
                                bl = lIlllIIlI[0];
                            }
                            return bl;
                        }, (int)lIlllIIlI[4]);

                    }
                }
            }
            if (ag.lIIllIlIlIll(ag.ab() ? 1 : 0)) {
                int[] nArray = new int[lIlllIIlI[1]];
                nArray[ag.lIlllIIlI[0]] = lIlllIIlI[13];
                if (ag.lIIllIlIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIlllIIlI[1]];
                    nArray2[ag.lIlllIIlI[0]] = lIlllIIlI[13];
                    if (ag.lIIllIlIllIl(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlllIIIl[lIlllIIlI[15]];
                        int[] nArray3 = new int[lIlllIIlI[1]];
                        nArray3[ag.lIlllIIlI[0]] = lIlllIIlI[13];
                        llIIlIlIlIIllI = Inventory.getFirst((int[])nArray3);
                        if (ag.lIIllIlIlllI(llIIlIlIlIIllI)) {
                            llIIlIlIlIIllI.interact(lIlllIIIl[lIlllIIlI[16]]);
                            Time.sleepTicks((int)lIlllIIlI[3]);

                        }
                    }
                }
                if (ag.lIIllIllIIIl(Players.getLocal().getWorldLocation().distanceTo(lO), lIlllIIlI[10])) {
                    AccBuilderEasyClues.c = lIlllIIIl[lIlllIIlI[17]];
                    Movement.walkTo((WorldPoint)lO);

                    Time.sleepTicks((int)lIlllIIlI[7]);

                }
                if (ag.lIIllIllIIlI(Players.getLocal().getWorldLocation().distanceTo(lO), lIlllIIlI[10])) {
                    AccBuilderEasyClues.c = lIlllIIIl[lIlllIIlI[18]];
                    String[] stringArray = new String[lIlllIIlI[1]];
                    stringArray[ag.lIlllIIlI[0]] = lIlllIIIl[lIlllIIlI[19]];
                    llIIlIlIlIIllI = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
                    if (ag.lIIllIlIlllI(llIIlIlIlIIllI)) {
                        if (ag.lIIllIlIllIl(Production.isOpen() ? 1 : 0)) {
                            llIIlIlIlIIllI.interact(lIlllIIIl[lIlllIIlI[20]]);
                            Time.sleepTicks((int)lIlllIIlI[2]);

                            Time.sleepUntil(() -> Production.isOpen(), (int)lIlllIIlI[4]);

                        }
                        if (ag.lIIllIlIlIll(Production.isOpen() ? 1 : 0)) {
                            Production.chooseOption((int)lIlllIIlI[1]);
                            Time.sleepTicks((int)lIlllIIlI[7]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (!ag.lIIllIlIlIll(ag.ab() ? 1 : 0) || ag.lIIllIlIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIlllIIlI[1];

                                    if ((1 ^ 0x30 ^ (0x52 ^ 0x67)) < 2) {
                                        return ((0x94 ^ 0x9D ^ (0x8E ^ 0x90)) & (0xFF ^ 0xB5 ^ (0x23 ^ 0x7E) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIlllIIlI[0];
                                }
                                return bl;
                            }, (int)lIlllIIlI[21]);

                        }
                    }
                }
            }
        }
    }

    private static boolean lIIllIlIllIl(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (ag.lIIllIllIIII(Skills.getLevel((Skill)Skill.COOKING), lIlllIIlI[35])) {
            bl = lIlllIIlI[1];

            if (((0x84 ^ 0xB1) & ~(0x65 ^ 0x50)) != 0) {
                return false;
            }
        } else {
            bl = lIlllIIlI[0];
        }
        return bl;
    }
}

