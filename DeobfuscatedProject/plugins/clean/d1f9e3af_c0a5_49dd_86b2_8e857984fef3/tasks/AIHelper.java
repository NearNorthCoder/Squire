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
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.EHelper;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class AIHelper
implements W {
    private static final  WorldPoint lZ;
    public static  boolean bt;
    
    public static  List<d> bv;
    private static final  WorldPoint lW;
    private static final  int lS;
    public static  boolean bW;
    private static final  WorldPoint lX;
    
    private static final  List<WorldPoint> mb;
    private static final  int lT;
    private static final  int lR;
    private static final  int lU;
    private static final  WorldArea ma;
    private static final  int lV;
    private static final  WorldPoint lY;

    public static void eb() {
        if (ai.lllllIIIlll(mb.isEmpty() ? 1 : 0)) {
            mb.add(lW);

            mb.add(lX);

            mb.add(lY);

            mb.add(lZ);

        }
        if (ai.lllllIIIlll(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIlIlIlI[lIIlIllII[0]];
            b.a(bv);
            if (ai.lllllIIlIII(bv.size(), lIIlIllII[1])) {
                System.out.println(lIIlIlIlI[lIIlIllII[1]]);
                bt = lIIlIllII[0];
            }
        }
        if (ai.lllllIIlIIl(bt ? 1 : 0)) {
            Object lIIIIlIllIllIIl;
            if (ai.lllllIIlIIl(ai.ab() ? 1 : 0) && ai.lllllIIlIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
                lIIIIlIllIllIIl = BankLocation.getNearest();
                if (ai.lllllIIlIlI(lIIIIlIllIllIIl) && ai.lllllIIlIIl(lIIIIlIllIllIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIlIlI[lIIlIllII[2]];
                    a.a((BankLocation)lIIIIlIllIllIIl);
                }
                if (ai.lllllIIlIlI(lIIIIlIllIllIIl) && ai.lllllIIIlll(lIIIIlIllIllIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (ai.lllllIIlIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlIlIlI[lIIlIllII[3]];
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIllII[4]);

                    }
                    if (ai.lllllIIIlll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlIlIlI[lIIlIllII[5]];
                        if (ai.lllllIIlIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIlIllII[1]);

                        }
                        int[] nArray = new int[lIIlIllII[1]];
                        nArray[ai.lIIlIllII[0]] = ai.ec();
                        if (ai.lllllIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            ai.af();
                            System.out.println(lIIlIlIlI[lIIlIllII[6]]);
                            bt = lIIlIllII[1];
                            return;
                        }
                        int[] nArray2 = new int[lIIlIllII[1]];
                        nArray2[ai.lIIlIllII[0]] = lIIlIllII[7];
                        if (ai.lllllIIlIII(Inventory.getCount((int[])nArray2), lIIlIllII[1])) {
                            Bank.withdraw((int)lIIlIllII[7], (int)lIIlIllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lIIlIllII[1]);

                        }
                        int[] nArray3 = new int[lIIlIllII[1]];
                        nArray3[ai.lIIlIllII[0]] = lIIlIllII[7];
                        if (ai.lllllIIlIll(Inventory.getCount((int[])nArray3))) {
                            int[] nArray4 = new int[lIIlIllII[1]];
                            nArray4[ai.lIIlIllII[0]] = ai.ec();
                            if (ai.lllllIIlIII(Inventory.getCount((int[])nArray4), lIIlIllII[1])) {
                                Bank.withdrawAll((int)ai.ec(), (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIIlIllII[1]);

                                Time.sleepUntil(() -> {
                                    boolean bl;
                                    int[] nArray = new int[lIIlIllII[1]];
                                    nArray[ai.lIIlIllII[0]] = ai.ec();
                                    if (ai.lllllIIlIll(Inventory.getCount((int[])nArray))) {
                                        bl = lIIlIllII[1];

                                    } else {
                                        bl = lIIlIllII[0];
                                    }
                                    return bl;
                                }, (int)lIIlIllII[4]);

                            }
                        }
                    }
                }
            }
            if (ai.lllllIIIlll(ai.ab() ? 1 : 0)) {
                if (ai.lllllIIlIIl(ma.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIlIlI[lIIlIllII[8]];
                    Movement.walkTo((WorldPoint)lW);

                    Time.sleepTicks((int)lIIlIllII[2]);

                }
                if (ai.lllllIIIlll(ma.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIlIllII[2]];
                    stringArray[ai.lIIlIllII[0]] = lIIlIlIlI[lIIlIllII[9]];
                    stringArray[ai.lIIlIllII[1]] = lIIlIlIlI[lIIlIllII[10]];
                    lIIIIlIllIllIIl = TileObjects.getAt((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray).stream().filter(tileObject -> {
                        boolean bl;
                        if (ai.lllllIIlIlI(tileObject)) {
                            bl = lIIlIllII[1];

                            if (-(4 ^ 1) >= 0) {
                                return false;
                            }
                        } else {
                            bl = lIIlIllII[0];
                        }
                        return bl;
                    }).collect(Collectors.toList());
                    if (ai.lllllIIlIIl(lIIIIlIllIllIIl.isEmpty() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlIlIlI[lIIlIllII[11]];
                        Movement.walkTo((WorldPoint)mb.get(e.c(lIIlIllII[0], lIIlIllII[3])));

                        Time.sleepTicks((int)lIIlIllII[1]);

                    }
                    if (ai.lllllIIIlll(lIIIIlIllIllIIl.isEmpty() ? 1 : 0) && ai.lllllIIlIIl(Players.getLocal().isAnimating() ? 1 : 0) && ai.lllllIIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlIlIlI[lIIlIllII[12]];
                        int[] nArray = new int[lIIlIllII[1]];
                        nArray[ai.lIIlIllII[0]] = ai.ec();
                        int lIIIIlIllIllIII = Inventory.getCount((int[])nArray);
                        int[] nArray5 = new int[lIIlIllII[1]];
                        nArray5[ai.lIIlIllII[0]] = lIIlIllII[7];
                        Item lIIIIlIllIlIlll = Inventory.getFirst((int[])nArray5);
                        int[] nArray6 = new int[lIIlIllII[1]];
                        nArray6[ai.lIIlIllII[0]] = ai.ec();
                        Item lIIIIlIllIlIllI = Inventory.getFirst((int[])nArray6);
                        if (ai.lllllIIlIlI(lIIIIlIllIlIlll) && ai.lllllIIlIlI(lIIIIlIllIlIllI)) {
                            lIIIIlIllIlIlll.useOn(lIIIIlIllIlIllI);
                            Time.sleepTicks((int)lIIlIllII[3]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIlIllII[1]];
                                nArray[ai.lIIlIllII[0]] = ai.ec();
                                if (!ai.lllllIIllII(Inventory.getCount((int[])nArray), lIIIIlIllIllIII) || !ai.lllllIIIlll(Players.getLocal().isAnimating() ? 1 : 0) || ai.lllllIIIlll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIIlIllII[1];

                                    if (((0xCD ^ 0xAE) & ~(0x17 ^ 0x74)) != 0) {
                                        return (3 & ~3) != 0;
                                    }
                                } else {
                                    bl = lIIlIllII[0];
                                }
                                return bl;
                            }, (int)lIIlIllII[13]);

                            Time.sleepTicks((int)lIIlIllII[2]);

                        }
                    }
                }
            }
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (ai.lllllIIllII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[36])) {
            bl = lIIlIllII[1];

            if (((212 + 143 - 122 + 13 ^ 25 + 12 - -118 + 6) & (48 + 76 - -2 + 1 ^ (0x27 ^ 0xF) ^ -1)) >= 1) {
                return ((0xC1 ^ 0xBF ^ (0x57 ^ 0x34)) & (0xFA ^ 0x9A ^ (0x4C ^ 0x31) ^ -1)) != 0;
            }
        } else {
            bl = lIIlIllII[0];
        }
        return bl;
    }

    static {
        ai.lllllIIIllI();
        ai.lllllIIIlII();
        lR = lIIlIllII[20];
        lS = lIIlIllII[16];
        lT = lIIlIllII[18];
        lV = lIIlIllII[7];
        lU = lIIlIllII[19];
        lW = new WorldPoint(lIIlIllII[38], lIIlIllII[39], lIIlIllII[0]);
        lX = new WorldPoint(lIIlIllII[38], lIIlIllII[40], lIIlIllII[0]);
        lY = new WorldPoint(lIIlIllII[38], lIIlIllII[41], lIIlIllII[0]);
        lZ = new WorldPoint(lIIlIllII[38], lIIlIllII[42], lIIlIllII[0]);
        ma = new WorldArea(lIIlIllII[43], lIIlIllII[42], lIIlIllII[44], lIIlIllII[6], lIIlIllII[0]);
        mb = new ArrayList<WorldPoint>();
        bv = new ArrayList<d>();
    }

    private static void lllllIIIlII() {
        lIIlIlIlI = new String[lIIlIllII[45]];
        ai.lIIlIlIlI[ai.lIIlIllII[0]] = "Buying Items";
        ai.lIIlIlIlI[ai.lIIlIllII[1]] = "Finished buying items, switching back to firemaking";
        ai.lIIlIlIlI[ai.lIIlIllII[2]] = "Navigating to bank";
        ai.lIIlIlIlI[ai.lIIlIllII[3]] = "Opening bank";
        ai.lIIlIlIlI[ai.lIIlIllII[5]] = "Handling banking";
        ai.lIIlIlIlI[ai.lIIlIllII[6]] = "We are missing supplies, switching to BUYING";
        ai.lIIlIlIlI[ai.lIIlIllII[8]] = "Navigating to FM tile";
        ai.lIIlIlIlI[ai.lIIlIllII[9]] = "Fire";
        ai.lIIlIlIlI[ai.lIIlIllII[10]] = "Jack-O-Lantern";
        ai.lIIlIlIlI[ai.lIIlIllII[11]] = "Walking to empty tile";
        ai.lIIlIlIlI[ai.lIIlIllII[12]] = "Lighting log";
        ai.lIIlIlIlI[ai.lIIlIllII[35]] = "Firemaking";
        ai.lIIlIlIlI[ai.lIIlIllII[37]] = "ring of wealth (";
    }

    private static boolean lllllIIllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllllIIlIlI(Object object) {
        return object != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        if (ai.lllllIIllII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[14]) && ai.lllllIIlIII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[15])) {
            int n3;
            int[] nArray = new int[lIIlIllII[1]];
            nArray[ai.lIIlIllII[0]] = lIIlIllII[7];
            if (ai.lllllIIlIll(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[lIIlIllII[1]];
                nArray2[ai.lIIlIllII[0]] = lIIlIllII[16];
                if (ai.lllllIIlIll(Inventory.getCount((int[])nArray2))) {
                    n3 = lIIlIllII[1];

                    if (-(0x29 ^ 0x27 ^ (3 ^ 9)) <= 0) return n3 != 0;
                    return ((0x27 ^ 0x7D ^ (0x2F ^ 0x2A)) & (230 + 69 - 267 + 207 ^ 98 + 112 - 164 + 130 ^ -1)) != 0;
                }
            }
            n3 = lIIlIllII[0];
            return n3 != 0;
        }
        if (ai.lllllIIllII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[15]) && ai.lllllIIlIII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[17])) {
            int n4;
            int[] nArray = new int[lIIlIllII[1]];
            nArray[ai.lIIlIllII[0]] = lIIlIllII[7];
            if (ai.lllllIIlIll(Inventory.getCount((int[])nArray))) {
                int[] nArray3 = new int[lIIlIllII[1]];
                nArray3[ai.lIIlIllII[0]] = lIIlIllII[18];
                if (ai.lllllIIlIll(Inventory.getCount((int[])nArray3))) {
                    n4 = lIIlIllII[1];

                    if ((1 ^ (0x5D ^ 0x58)) >= 2) return n4 != 0;
                    return false;
                }
            }
            n4 = lIIlIllII[0];
            return n4 != 0;
        }
        if (ai.lllllIIllII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[17])) {
            int n5;
            int[] nArray = new int[lIIlIllII[1]];
            nArray[ai.lIIlIllII[0]] = lIIlIllII[7];
            if (ai.lllllIIlIll(Inventory.getCount((int[])nArray))) {
                int[] nArray4 = new int[lIIlIllII[1]];
                nArray4[ai.lIIlIllII[0]] = lIIlIllII[19];
                if (ai.lllllIIlIll(Inventory.getCount((int[])nArray4))) {
                    n5 = lIIlIllII[1];

                    if (2 <= (142 + 99 - 90 + 10 ^ 38 + 128 - 16 + 15)) return n5 != 0;
                    return ((0x30 ^ 0x16 ^ (0x51 ^ 0x33)) & (94 + 127 - 184 + 94 ^ 188 + 98 - 123 + 36 ^ -1)) != 0;
                }
            }
            n5 = lIIlIllII[0];
            return n5 != 0;
        }
        int[] nArray = new int[lIIlIllII[1]];
        nArray[ai.lIIlIllII[0]] = lIIlIllII[7];
        if (ai.lllllIIlIll(Inventory.getCount((int[])nArray))) {
            int[] nArray5 = new int[lIIlIllII[1]];
            nArray5[ai.lIIlIllII[0]] = lIIlIllII[20];
            if (ai.lllllIIlIll(Inventory.getCount((int[])nArray5))) {
                n2 = lIIlIllII[1];

                if (((0x26 ^ 3) & ~(0x5D ^ 0x78)) >= 0) return n2 != 0;
                return false;
            }
        }
        n2 = lIIlIllII[0];
        return n2 != 0;
    }

    @Override
    public boolean S() {
        return lIIlIllII[0];
    }

    @Override
    public int T() {
        ai.eb();
        return lIIlIllII[34];
    }

        return String.valueOf(lIIIIlIllIIIIIl);
    }

    private static boolean lllllIIlIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lllllIIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lllllIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String U() {
        return lIIlIlIlI[lIIlIllII[35]];
    }

    private static int ec() {
        if (ai.lllllIIllII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[14]) && ai.lllllIIlIII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[15])) {
            return lIIlIllII[16];
        }
        if (ai.lllllIIllII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[15]) && ai.lllllIIlIII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[17])) {
            return lIIlIllII[18];
        }
        if (ai.lllllIIllII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[17])) {
            return lIIlIllII[19];
        }
        return lIIlIllII[20];
    }

    private static boolean lllllIIlIll(int n2) {
        return n2 > 0;
    }

    private static void af() {
        d lIIIIlIllIlIIlI;
        Object lIIIIlIllIlIIll;
        if (ai.lllllIIlIII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[14])) {
            d d2 = new DHelper(lIIlIllII[20], lIIlIllII[21], e.c(lIIlIllII[22], lIIlIllII[23]));
            bv.add(d2);

        }
        if (ai.lllllIIllII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[14]) && ai.lllllIIlIII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[15])) {
            lIIIIlIllIlIIll = new DHelper(lIIlIllII[16], lIIlIllII[24], lIIlIllII[25]);
            bv.add((DHelper) IIIIlIllIlIIll);

        }
        if (ai.lllllIIllII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[15]) && ai.lllllIIlIII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[17])) {
            lIIIIlIllIlIIll = new DHelper(lIIlIllII[18], lIIlIllII[26], lIIlIllII[27]);
            bv.add((DHelper) IIIIlIllIlIIll);

        }
        if (ai.lllllIIllII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[17])) {
            lIIIIlIllIlIIll = new DHelper(lIIlIllII[19], lIIlIllII[28], lIIlIllII[15]);
            bv.add((DHelper) IIIIlIllIlIIll);

        }
        if (ai.lllllIIlIIl(Bank.contains(lIIIIlIllIlIIll = item -> item.getName().toLowerCase().contains(lIIlIlIlI[lIIlIllII[37]])) ? 1 : 0)) {
            lIIIIlIllIlIIlI = new DHelper(lIIlIllII[29], lIIlIllII[6], lIIlIllII[30]);
            bv.add(lIIIIlIllIlIIlI);

        }
        int[] nArray = new int[lIIlIllII[1]];
        nArray[ai.lIIlIllII[0]] = lIIlIllII[31];
        if (ai.lllllIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIIIIlIllIlIIlI = new DHelper(lIIlIllII[31], lIIlIllII[32], lIIlIllII[33]);
            bv.add(lIIIIlIllIlIIlI);

        }
    }
}

