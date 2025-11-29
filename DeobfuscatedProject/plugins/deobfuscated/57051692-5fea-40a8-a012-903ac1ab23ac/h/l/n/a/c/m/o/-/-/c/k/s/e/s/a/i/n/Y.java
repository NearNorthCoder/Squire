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
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

public class Y
implements K {
    public static final /* synthetic */ int kX;
    private static /* synthetic */ String[] lIllIllIIl;
    public static final /* synthetic */ int kW;
    public static final /* synthetic */ WorldArea kZ;
    public static /* synthetic */ int[] lc;
    public static /* synthetic */ int[] lb;
    public static final /* synthetic */ int kU;
    public static final /* synthetic */ WorldArea kY;
    public static final /* synthetic */ int kT;
    private static /* synthetic */ int[] lIllIllIlI;
    public static /* synthetic */ List<d> bp;
    public static /* synthetic */ int[] kK;
    public static final /* synthetic */ int kV;
    public static /* synthetic */ boolean bn;
    public static final /* synthetic */ WorldPoint la;

    private static boolean lIIllIlIIIIIl(Object object) {
        return object != null;
    }

    @Override
    public String ae() {
        return lIllIllIIl[lIllIllIlI[34]];
    }

    private static String lIIllIIlllIIl(String lllllllllllllllllllIIIIlllIIIlll, String lllllllllllllllllllIIIIlllIIIllI) {
        try {
            SecretKeySpec lllllllllllllllllllIIIIlllIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIIlllIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllIIIIlllIIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllllllllIIIIlllIIlIll.init(lIllIllIlI[3], lllllllllllllllllllIIIIlllIIllII);
            return new String(lllllllllllllllllllIIIIlllIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIIlllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllIIIIlllIIlIlI) {
            lllllllllllllllllllIIIIlllIIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIIlllllI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean ac() {
        return lIllIllIlI[0];
    }

    private static boolean lIIllIlIIIIII(int n2) {
        return n2 > 0;
    }

    private static boolean lIIllIlIIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIIllIIlllIll() {
        lIllIllIIl = new String[lIllIllIlI[52]];
        Y.lIllIllIIl[Y.lIllIllIlI[0]] = Y."Buying items";
        Y.lIllIllIIl[Y.lIllIllIlI[1]] = Y."Finished buying items, switching back to woodcutting";
        Y.lIllIllIIl[Y.lIllIllIlI[3]] = Y."Navigating to bank";
        Y.lIllIllIIl[Y.lIllIllIlI[4]] = Y."Opening bank";
        Y.lIllIllIIl[Y.lIllIllIlI[6]] = Y."Handling banking";
        Y.lIllIllIIl[Y.lIllIllIlI[12]] = Y."We are missing pickaxes, switching to BUYING";
        Y.lIllIllIIl[Y.lIllIllIlI[13]] = Y."Dropping logs";
        Y.lIllIllIIl[Y.lIllIllIlI[14]] = Y."Dropping logs";
        Y.lIllIllIIl[Y.lIllIllIlI[16]] = Y."Walking to trees";
        Y.lIllIllIIl[Y.lIllIllIlI[17]] = Y."Chopping";
        Y.lIllIllIIl[Y.lIllIllIlI[18]] = Y."Chopping logs";
        Y.lIllIllIIl[Y.lIllIllIlI[19]] = Y."Chop down";
        Y.lIllIllIIl[Y.lIllIllIlI[20]] = Y."Walking to oak trees";
        Y.lIllIllIIl[Y.lIllIllIlI[21]] = Y."Chopping oaks";
        Y.lIllIllIIl[Y.lIllIllIlI[22]] = Y."Chopping oak logs";
        Y.lIllIllIIl[Y.lIllIllIlI[15]] = Y."Chop down";
        Y.lIllIllIIl[Y.lIllIllIlI[34]] = Y."Woodcutting";
        Y.lIllIllIIl[Y.lIllIllIlI[36]] = Y."ring of wealth (";
    }

    @Override
    public int ad() {
        Y.dQ();
        return lIllIllIlI[33];
    }

    public static void dQ() {
        block25: {
            BankLocation lllllllllllllllllllIIIIllllIllIl;
            block27: {
                block33: {
                    block29: {
                        block32: {
                            block31: {
                                block30: {
                                    block28: {
                                        block26: {
                                            if (Y.lIIllIIllllIl(bn ? 1 : 0)) {
                                                AccBuilderShamans.c = lIllIllIIl[lIllIllIlI[0]];
                                                b.a(bp);
                                                if (Y.lIIllIIlllllI(bp.size(), lIllIllIlI[1])) {
                                                    System.out.println(lIllIllIIl[lIllIllIlI[1]]);
                                                    bn = lIllIllIlI[0];
                                                }
                                            }
                                            if (!Y.lIIllIIllllll(bn ? 1 : 0)) break block25;
                                            if (!Y.lIIllIIllllIl(Y.al() ? 1 : 0)) break block26;
                                            int[] nArray = new int[lIllIllIlI[1]];
                                            nArray[Y.lIllIllIlI[0]] = lIllIllIlI[2];
                                            if (!Y.lIIllIlIIIIII(Inventory.getCount((int[])nArray))) break block27;
                                        }
                                        if (Y.lIIllIlIIIIIl(lllllllllllllllllllIIIIllllIllIl = BankLocation.getNearest()) && Y.lIIllIIllllll(lllllllllllllllllllIIIIllllIllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderShamans.c = lIllIllIIl[lIllIllIlI[3]];
                                            a.a(lllllllllllllllllllIIIIllllIllIl);
                                        }
                                        if (!Y.lIIllIlIIIIIl(lllllllllllllllllllIIIIllllIllIl) || !Y.lIIllIIllllIl(lllllllllllllllllllIIIIllllIllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block27;
                                        if (Y.lIIllIIllllll(Bank.isOpen() ? 1 : 0)) {
                                            AccBuilderShamans.c = lIllIllIIl[lIllIllIlI[4]];
                                            a.a();
                                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIllIlI[5]);
                                            0;
                                        }
                                        if (!Y.lIIllIIllllIl(Bank.isOpen() ? 1 : 0)) break block27;
                                        AccBuilderShamans.c = lIllIllIIl[lIllIllIlI[6]];
                                        if (Y.lIIllIlIIIIII(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)lIllIllIlI[6]);
                                            0;
                                        }
                                        if (Y.lIIllIlIIIIII(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)lIllIllIlI[3]);
                                            0;
                                        }
                                        int[] nArray = new int[lIllIllIlI[1]];
                                        nArray[Y.lIllIllIlI[0]] = lIllIllIlI[7];
                                        if (!Y.lIIllIIllllll(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                        int[] nArray2 = new int[lIllIllIlI[1]];
                                        nArray2[Y.lIllIllIlI[0]] = lIllIllIlI[7];
                                        if (!Y.lIIllIlIIIIlI(Inventory.getCount((int[])nArray2), lIllIllIlI[1])) break block29;
                                    }
                                    int[] nArray = new int[lIllIllIlI[1]];
                                    nArray[Y.lIllIllIlI[0]] = lIllIllIlI[8];
                                    if (!Y.lIIllIIllllll(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                    int[] nArray3 = new int[lIllIllIlI[1]];
                                    nArray3[Y.lIllIllIlI[0]] = lIllIllIlI[8];
                                    if (!Y.lIIllIlIIIIlI(Inventory.getCount((int[])nArray3), lIllIllIlI[1])) break block29;
                                }
                                int[] nArray = new int[lIllIllIlI[1]];
                                nArray[Y.lIllIllIlI[0]] = lIllIllIlI[9];
                                if (!Y.lIIllIIllllll(Bank.contains((int[])nArray) ? 1 : 0)) break block31;
                                int[] nArray4 = new int[lIllIllIlI[1]];
                                nArray4[Y.lIllIllIlI[0]] = lIllIllIlI[9];
                                if (!Y.lIIllIlIIIIlI(Inventory.getCount((int[])nArray4), lIllIllIlI[1])) break block29;
                            }
                            int[] nArray = new int[lIllIllIlI[1]];
                            nArray[Y.lIllIllIlI[0]] = lIllIllIlI[10];
                            if (!Y.lIIllIIllllll(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                            int[] nArray5 = new int[lIllIllIlI[1]];
                            nArray5[Y.lIllIllIlI[0]] = lIllIllIlI[10];
                            if (!Y.lIIllIlIIIIlI(Inventory.getCount((int[])nArray5), lIllIllIlI[1])) break block29;
                        }
                        int[] nArray = new int[lIllIllIlI[1]];
                        nArray[Y.lIllIllIlI[0]] = lIllIllIlI[11];
                        if (!Y.lIIllIIllllll(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                        int[] nArray6 = new int[lIllIllIlI[1]];
                        nArray6[Y.lIllIllIlI[0]] = lIllIllIlI[11];
                        if (!Y.lIIllIIlllllI(Inventory.getCount((int[])nArray6), lIllIllIlI[1])) break block33;
                    }
                    Y.O();
                    System.out.println(lIllIllIIl[lIllIllIlI[12]]);
                    bn = lIllIllIlI[1];
                    return;
                }
                int[] nArray = new int[lIllIllIlI[1]];
                nArray[Y.lIllIllIlI[0]] = lIllIllIlI[7];
                if (Y.lIIllIIllllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    Bank.withdraw((int)lIllIllIlI[7], (int)lIllIllIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIllIllIlI[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIllIllIlI[1]];
                        nArray[Y.lIllIllIlI[0]] = lIllIllIlI[7];
                        if (Y.lIIllIlIIIIII(Inventory.getCount((int[])nArray))) {
                            bl = lIllIllIlI[1];
                            0;
                            if (1 < 0) {
                                return ((0x52 ^ 9 ^ (0x68 ^ 0xF)) & (19 + 38 - -36 + 51 ^ 91 + 132 - 137 + 86 ^ -1)) != 0;
                            }
                        } else {
                            bl = lIllIllIlI[0];
                        }
                        return bl;
                    }, (int)lIllIllIlI[5]);
                    0;
                }
                int[] nArray7 = new int[lIllIllIlI[1]];
                nArray7[Y.lIllIllIlI[0]] = lIllIllIlI[8];
                if (Y.lIIllIIllllIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    Bank.withdraw((int)lIllIllIlI[8], (int)lIllIllIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIllIllIlI[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIllIllIlI[1]];
                        nArray[Y.lIllIllIlI[0]] = lIllIllIlI[8];
                        if (Y.lIIllIlIIIIII(Inventory.getCount((int[])nArray))) {
                            bl = lIllIllIlI[1];
                            0;
                            if ((0x4F ^ 0x4B) < 0) {
                                return ((0xA4 ^ 0xB7) & ~(0x23 ^ 0x30)) != 0;
                            }
                        } else {
                            bl = lIllIllIlI[0];
                        }
                        return bl;
                    }, (int)lIllIllIlI[5]);
                    0;
                }
                int[] nArray8 = new int[lIllIllIlI[1]];
                nArray8[Y.lIllIllIlI[0]] = lIllIllIlI[9];
                if (Y.lIIllIIllllIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                    Bank.withdraw((int)lIllIllIlI[9], (int)lIllIllIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIllIllIlI[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIllIllIlI[1]];
                        nArray[Y.lIllIllIlI[0]] = lIllIllIlI[9];
                        if (Y.lIIllIlIIIIII(Inventory.getCount((int[])nArray))) {
                            bl = lIllIllIlI[1];
                            0;
                            if (1 <= -1) {
                                return ((0xA ^ 0x39 ^ (0x54 ^ 0x5C)) & (170 + 151 - 318 + 171 ^ 125 + 73 - 101 + 52 ^ -1)) != 0;
                            }
                        } else {
                            bl = lIllIllIlI[0];
                        }
                        return bl;
                    }, (int)lIllIllIlI[5]);
                    0;
                }
                int[] nArray9 = new int[lIllIllIlI[1]];
                nArray9[Y.lIllIllIlI[0]] = lIllIllIlI[10];
                if (Y.lIIllIIllllIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    Bank.withdraw((int)lIllIllIlI[10], (int)lIllIllIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIllIllIlI[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIllIllIlI[1]];
                        nArray[Y.lIllIllIlI[0]] = lIllIllIlI[10];
                        if (Y.lIIllIlIIIIII(Inventory.getCount((int[])nArray))) {
                            bl = lIllIllIlI[1];
                            0;
                            if (null != null) {
                                return ((8 ^ 0x40) & ~(0x8B ^ 0xC3)) != 0;
                            }
                        } else {
                            bl = lIllIllIlI[0];
                        }
                        return bl;
                    }, (int)lIllIllIlI[5]);
                    0;
                }
                int[] nArray10 = new int[lIllIllIlI[1]];
                nArray10[Y.lIllIllIlI[0]] = lIllIllIlI[11];
                if (Y.lIIllIIllllIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    Bank.withdraw((int)lIllIllIlI[11], (int)lIllIllIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIllIllIlI[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIllIllIlI[1]];
                        nArray[Y.lIllIllIlI[0]] = lIllIllIlI[11];
                        if (Y.lIIllIlIIIIII(Inventory.getCount((int[])nArray))) {
                            bl = lIllIllIlI[1];
                            0;
                            if (3 == (0xB8 ^ 0xBC)) {
                                return ((0x81 ^ 0x93) & ~(1 ^ 0x13)) != 0;
                            }
                        } else {
                            bl = lIllIllIlI[0];
                        }
                        return bl;
                    }, (int)lIllIllIlI[5]);
                    0;
                }
            }
            if (Y.lIIllIIllllIl(Y.al() ? 1 : 0)) {
                if (Y.lIIllIIllllIl(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIllIIl[lIllIllIlI[13]];
                    System.out.println(lIllIllIIl[lIllIllIlI[14]]);
                    Inventory.getAll((int[])kK).stream().forEach(Item::drop);
                }
                if (Y.lIIllIIllllll(Inventory.isFull() ? 1 : 0)) {
                    if (Y.lIIllIIlllllI(Skills.getLevel((Skill)Skill.WOODCUTTING), lIllIllIlI[15])) {
                        if (Y.lIIllIIllllll(kY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderShamans.c = lIllIllIIl[lIllIllIlI[16]];
                            Movement.walkTo((WorldPoint)kY.toWorldPoint());
                            0;
                            Time.sleepTicks((int)lIllIllIlI[6]);
                            0;
                        }
                        if (Y.lIIllIIllllIl(kY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderShamans.c = lIllIllIIl[lIllIllIlI[17]];
                            lllllllllllllllllllIIIIllllIllIl = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])lb);
                            if (Y.lIIllIIllllll(Players.getLocal().isAnimating() ? 1 : 0) && Y.lIIllIIllllll(Players.getLocal().isMoving() ? 1 : 0) && Y.lIIllIlIIIIIl(lllllllllllllllllllIIIIllllIllIl)) {
                                System.out.println(lIllIllIIl[lIllIllIlI[18]]);
                                lllllllllllllllllllIIIIllllIllIl.interact(lIllIllIIl[lIllIllIlI[19]]);
                                Time.sleepTicks((int)lIllIllIlI[4]);
                                0;
                            }
                        }
                    }
                    if (Y.lIIllIlIIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), lIllIllIlI[15])) {
                        if (Y.lIIllIIllllll(kZ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderShamans.c = lIllIllIIl[lIllIllIlI[20]];
                            Movement.walkTo((WorldPoint)la);
                            0;
                            Time.sleepTicks((int)lIllIllIlI[6]);
                            0;
                        }
                        if (Y.lIIllIIllllIl(kZ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderShamans.c = lIllIllIIl[lIllIllIlI[21]];
                            lllllllllllllllllllIIIIllllIllIl = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])lc);
                            if (Y.lIIllIIllllll(Players.getLocal().isAnimating() ? 1 : 0) && Y.lIIllIIllllll(Players.getLocal().isMoving() ? 1 : 0) && Y.lIIllIlIIIIIl(lllllllllllllllllllIIIIllllIllIl)) {
                                System.out.println(lIllIllIIl[lIllIllIlI[22]]);
                                lllllllllllllllllllIIIIllllIllIl.interact(lIllIllIIl[lIllIllIlI[15]]);
                                Time.sleepTicks((int)lIllIllIlI[4]);
                                0;
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean lIIllIIllllll(int n2) {
        return n2 == 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean al() {
        int n2;
        if (Y.lIIllIlIIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), lIllIllIlI[23])) {
            boolean bl;
            int[] nArray = new int[lIllIllIlI[1]];
            nArray[Y.lIllIllIlI[0]] = lIllIllIlI[11];
            if (Y.lIIllIlIIIIII(Inventory.getCount((int[])nArray))) {
                bl = lIllIllIlI[1];
                0;
                if (1 >= 0) return bl;
                return ((0xC6 ^ 0xBD ^ (6 ^ 0x2E)) & (82 + 5 - 26 + 185 ^ 15 + 51 - -2 + 97 ^ -1)) != 0;
            }
            bl = lIllIllIlI[0];
            return bl;
        }
        if (Y.lIIllIlIIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), lIllIllIlI[24]) && Y.lIIllIIlllllI(Skills.getLevel((Skill)Skill.WOODCUTTING), lIllIllIlI[23])) {
            int n3;
            int[] nArray = new int[lIllIllIlI[1]];
            nArray[Y.lIllIllIlI[0]] = lIllIllIlI[11];
            if (Y.lIIllIlIIIIII(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[lIllIllIlI[1]];
                nArray2[Y.lIllIllIlI[0]] = lIllIllIlI[10];
                if (Y.lIIllIlIIIIII(Inventory.getCount((int[])nArray2))) {
                    n3 = lIllIllIlI[1];
                    0;
                    if (3 >= 0) return n3 != 0;
                    return ((0xFE ^ 0xA9) & ~(0x46 ^ 0x11)) != 0;
                }
            }
            n3 = lIllIllIlI[0];
            return n3 != 0;
        }
        if (Y.lIIllIlIIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), lIllIllIlI[25]) && Y.lIIllIIlllllI(Skills.getLevel((Skill)Skill.WOODCUTTING), lIllIllIlI[24])) {
            int n4;
            int[] nArray = new int[lIllIllIlI[1]];
            nArray[Y.lIllIllIlI[0]] = lIllIllIlI[11];
            if (Y.lIIllIlIIIIII(Inventory.getCount((int[])nArray))) {
                int[] nArray3 = new int[lIllIllIlI[1]];
                nArray3[Y.lIllIllIlI[0]] = lIllIllIlI[10];
                if (Y.lIIllIlIIIIII(Inventory.getCount((int[])nArray3))) {
                    int[] nArray4 = new int[lIllIllIlI[1]];
                    nArray4[Y.lIllIllIlI[0]] = lIllIllIlI[9];
                    if (Y.lIIllIlIIIIII(Inventory.getCount((int[])nArray4))) {
                        n4 = lIllIllIlI[1];
                        0;
                        if (((0xA9 ^ 0x83) & ~(0xB6 ^ 0x9C)) == 0) return n4 != 0;
                        return ((0x5F ^ 7) & ~(0xD3 ^ 0x8B)) != 0;
                    }
                }
            }
            n4 = lIllIllIlI[0];
            return n4 != 0;
        }
        if (Y.lIIllIlIIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), lIllIllIlI[13]) && Y.lIIllIIlllllI(Skills.getLevel((Skill)Skill.WOODCUTTING), lIllIllIlI[25])) {
            int n5;
            int[] nArray = new int[lIllIllIlI[1]];
            nArray[Y.lIllIllIlI[0]] = lIllIllIlI[11];
            if (Y.lIIllIlIIIIII(Inventory.getCount((int[])nArray))) {
                int[] nArray5 = new int[lIllIllIlI[1]];
                nArray5[Y.lIllIllIlI[0]] = lIllIllIlI[10];
                if (Y.lIIllIlIIIIII(Inventory.getCount((int[])nArray5))) {
                    int[] nArray6 = new int[lIllIllIlI[1]];
                    nArray6[Y.lIllIllIlI[0]] = lIllIllIlI[9];
                    if (Y.lIIllIlIIIIII(Inventory.getCount((int[])nArray6))) {
                        int[] nArray7 = new int[lIllIllIlI[1]];
                        nArray7[Y.lIllIllIlI[0]] = lIllIllIlI[8];
                        if (Y.lIIllIlIIIIII(Inventory.getCount((int[])nArray7))) {
                            n5 = lIllIllIlI[1];
                            0;
                            if ((0x7A ^ 0x7E) != 0) return n5 != 0;
                            return ((0x6D ^ 0x3C) & ~(0x73 ^ 0x22)) != 0;
                        }
                    }
                }
            }
            n5 = lIllIllIlI[0];
            return n5 != 0;
        }
        int[] nArray = new int[lIllIllIlI[1]];
        nArray[Y.lIllIllIlI[0]] = lIllIllIlI[11];
        if (Y.lIIllIlIIIIII(Inventory.getCount((int[])nArray))) {
            int[] nArray8 = new int[lIllIllIlI[1]];
            nArray8[Y.lIllIllIlI[0]] = lIllIllIlI[10];
            if (Y.lIIllIlIIIIII(Inventory.getCount((int[])nArray8))) {
                int[] nArray9 = new int[lIllIllIlI[1]];
                nArray9[Y.lIllIllIlI[0]] = lIllIllIlI[9];
                if (Y.lIIllIlIIIIII(Inventory.getCount((int[])nArray9))) {
                    int[] nArray10 = new int[lIllIllIlI[1]];
                    nArray10[Y.lIllIllIlI[0]] = lIllIllIlI[8];
                    if (Y.lIIllIlIIIIII(Inventory.getCount((int[])nArray10))) {
                        int[] nArray11 = new int[lIllIllIlI[1]];
                        nArray11[Y.lIllIllIlI[0]] = lIllIllIlI[7];
                        if (Y.lIIllIlIIIIII(Inventory.getCount((int[])nArray11))) {
                            n2 = lIllIllIlI[1];
                            0;
                            if (null == null) return n2 != 0;
                            return ((59 + 18 - -27 + 36 ^ 115 + 27 - 49 + 57) & (0x3F ^ 0x52 ^ (0x7E ^ 9) ^ -1)) != 0;
                        }
                    }
                }
            }
        }
        n2 = lIllIllIlI[0];
        return n2 != 0;
    }

    private static boolean lIIllIIllllIl(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean af() {
        boolean bl;
        if (Y.lIIllIlIIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), lIllIllIlI[35])) {
            bl = lIllIllIlI[1];
            0;
            if (((0xA8 ^ 0x9E) & ~(0x7C ^ 0x4A)) >= 2) {
                return ((0x49 ^ 0x5C) & ~(0xBB ^ 0xAE)) != 0;
            }
        } else {
            bl = lIllIllIlI[0];
        }
        return bl;
    }

    static {
        Y.lIIllIIllllII();
        Y.lIIllIIlllIll();
        kX = lIllIllIlI[11];
        kU = lIllIllIlI[8];
        kW = lIllIllIlI[10];
        kT = lIllIllIlI[7];
        kV = lIllIllIlI[9];
        kY = new WorldArea(lIllIllIlI[37], lIllIllIlI[38], lIllIllIlI[34], lIllIllIlI[39], lIllIllIlI[0]);
        kZ = new WorldArea(lIllIllIlI[40], lIllIllIlI[41], lIllIllIlI[22], lIllIllIlI[34], lIllIllIlI[0]);
        la = new WorldPoint(lIllIllIlI[42], lIllIllIlI[43], lIllIllIlI[0]);
        int[] nArray = new int[lIllIllIlI[6]];
        nArray[Y.lIllIllIlI[0]] = lIllIllIlI[44];
        nArray[Y.lIllIllIlI[1]] = lIllIllIlI[45];
        nArray[Y.lIllIllIlI[3]] = lIllIllIlI[46];
        nArray[Y.lIllIllIlI[4]] = lIllIllIlI[47];
        lb = nArray;
        int[] nArray2 = new int[lIllIllIlI[1]];
        nArray2[Y.lIllIllIlI[0]] = lIllIllIlI[48];
        lc = nArray2;
        int[] nArray3 = new int[lIllIllIlI[4]];
        nArray3[Y.lIllIllIlI[0]] = lIllIllIlI[49];
        nArray3[Y.lIllIllIlI[1]] = lIllIllIlI[50];
        nArray3[Y.lIllIllIlI[3]] = lIllIllIlI[51];
        kK = nArray3;
        bp = new ArrayList<d>();
    }

    private static String lIIllIIlllIII(String lllllllllllllllllllIIIIlllIllIIl, String lllllllllllllllllllIIIIlllIlllIl) {
        lllllllllllllllllllIIIIlllIllIIl = new String(Base64.getDecoder().decode(lllllllllllllllllllIIIIlllIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllIIIIlllIlllII = new StringBuilder();
        char[] lllllllllllllllllllIIIIlllIllIll = lllllllllllllllllllIIIIlllIlllIl.toCharArray();
        int lllllllllllllllllllIIIIlllIllIlI = lIllIllIlI[0];
        char[] lllllllllllllllllllIIIIlllIlIlII = lllllllllllllllllllIIIIlllIllIIl.toCharArray();
        int lllllllllllllllllllIIIIlllIlIIll = lllllllllllllllllllIIIIlllIlIlII.length;
        int lllllllllllllllllllIIIIlllIlIIlI = lIllIllIlI[0];
        while (Y.lIIllIIlllllI(lllllllllllllllllllIIIIlllIlIIlI, lllllllllllllllllllIIIIlllIlIIll)) {
            char lllllllllllllllllllIIIIlllIlllll = lllllllllllllllllllIIIIlllIlIlII[lllllllllllllllllllIIIIlllIlIIlI];
            lllllllllllllllllllIIIIlllIlllII.append((char)(lllllllllllllllllllIIIIlllIlllll ^ lllllllllllllllllllIIIIlllIllIll[lllllllllllllllllllIIIIlllIllIlI % lllllllllllllllllllIIIIlllIllIll.length]));
            0;
            ++lllllllllllllllllllIIIIlllIllIlI;
            ++lllllllllllllllllllIIIIlllIlIIlI;
            0;
            if (((0x46 ^ 0x48) & ~(0x44 ^ 0x4A)) <= 1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllllIIIIlllIlllII);
    }

    public static void O() {
        d lllllllllllllllllllIIIIllllIlIIl;
        Object lllllllllllllllllllIIIIllllIlIlI;
        int[] nArray = new int[lIllIllIlI[1]];
        nArray[Y.lIllIllIlI[0]] = lIllIllIlI[7];
        if (Y.lIIllIIllllll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIllIllIlI[7], lIllIllIlI[1], lIllIllIlI[5]);
            bp.add(d2);
            0;
        }
        int[] nArray2 = new int[lIllIllIlI[1]];
        nArray2[Y.lIllIllIlI[0]] = lIllIllIlI[8];
        if (Y.lIIllIIllllll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllllllllllllllllllIIIIllllIlIlI = new d(lIllIllIlI[8], lIllIllIlI[1], lIllIllIlI[5]);
            bp.add((d)lllllllllllllllllllIIIIllllIlIlI);
            0;
        }
        int[] nArray3 = new int[lIllIllIlI[1]];
        nArray3[Y.lIllIllIlI[0]] = lIllIllIlI[9];
        if (Y.lIIllIIllllll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllllllllllllllllllIIIIllllIlIlI = new d(lIllIllIlI[9], lIllIllIlI[1], lIllIllIlI[26]);
            bp.add((d)lllllllllllllllllllIIIIllllIlIlI);
            0;
        }
        int[] nArray4 = new int[lIllIllIlI[1]];
        nArray4[Y.lIllIllIlI[0]] = lIllIllIlI[10];
        if (Y.lIIllIIllllll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lllllllllllllllllllIIIIllllIlIlI = new d(lIllIllIlI[10], lIllIllIlI[1], lIllIllIlI[27]);
            bp.add((d)lllllllllllllllllllIIIIllllIlIlI);
            0;
        }
        int[] nArray5 = new int[lIllIllIlI[1]];
        nArray5[Y.lIllIllIlI[0]] = lIllIllIlI[11];
        if (Y.lIIllIIllllll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lllllllllllllllllllIIIIllllIlIlI = new d(lIllIllIlI[11], lIllIllIlI[1], lIllIllIlI[28]);
            bp.add((d)lllllllllllllllllllIIIIllllIlIlI);
            0;
        }
        if (Y.lIIllIIllllll(Bank.contains((Predicate)(lllllllllllllllllllIIIIllllIlIlI = item -> item.getName().toLowerCase().contains(lIllIllIIl[lIllIllIlI[36]]))) ? 1 : 0)) {
            lllllllllllllllllllIIIIllllIlIIl = new d(lIllIllIlI[29], lIllIllIlI[12], lIllIllIlI[28]);
            bp.add(lllllllllllllllllllIIIIllllIlIIl);
            0;
        }
        int[] nArray6 = new int[lIllIllIlI[1]];
        nArray6[Y.lIllIllIlI[0]] = lIllIllIlI[30];
        if (Y.lIIllIIllllll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lllllllllllllllllllIIIIllllIlIIl = new d(lIllIllIlI[30], lIllIllIlI[31], lIllIllIlI[32]);
            bp.add(lllllllllllllllllllIIIIllllIlIIl);
            0;
        }
    }

    private static String lIIllIIlllIlI(String lllllllllllllllllllIIIIllIlllIlI, String lllllllllllllllllllIIIIllIlllIll) {
        try {
            SecretKeySpec lllllllllllllllllllIIIIllIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIIllIlllIll.getBytes(StandardCharsets.UTF_8)), lIllIllIlI[16]), "DES");
            Cipher lllllllllllllllllllIIIIllIlllllI = Cipher.getInstance("DES");
            lllllllllllllllllllIIIIllIlllllI.init(lIllIllIlI[3], lllllllllllllllllllIIIIllIllllll);
            return new String(lllllllllllllllllllIIIIllIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIIllIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllIIIIllIllllIl) {
            lllllllllllllllllllIIIIllIllllIl.printStackTrace();
            return null;
        }
    }

    private static void lIIllIIllllII() {
        lIllIllIlI = new int[53];
        Y.lIllIllIlI[0] = (0x30 ^ 0x66) & ~(0x39 ^ 0x6F);
        Y.lIllIllIlI[1] = 1;
        Y.lIllIllIlI[2] = 0xFFFFFBF3 & 0x7EF;
        Y.lIllIllIlI[3] = 2;
        Y.lIllIllIlI[4] = 3;
        Y.lIllIllIlI[5] = 0xFFFF9BFB & 0x778C;
        Y.lIllIllIlI[6] = 9 ^ 0xD;
        Y.lIllIllIlI[7] = 0xFFFFFFFF & 0x547;
        Y.lIllIllIlI[8] = -(0xFFFFBFE5 & 0x70BB) & (0xFFFFBDE9 & 0x77FF);
        Y.lIllIllIlI[9] = 0xFFFF95FF & 0x6F4B;
        Y.lIllIllIlI[10] = 0xFFFFADFD & 0x574F;
        Y.lIllIllIlI[11] = 0xFFFFCD7F & 0x37CF;
        Y.lIllIllIlI[12] = 0x5C ^ 0x59;
        Y.lIllIllIlI[13] = 0x8C ^ 0x8A;
        Y.lIllIllIlI[14] = 32 + 8 - 26 + 176 ^ 22 + 106 - 127 + 184;
        Y.lIllIllIlI[15] = 0x40 ^ 0x4F;
        Y.lIllIllIlI[16] = 0x2A ^ 0x22;
        Y.lIllIllIlI[17] = 0x49 ^ 0x40;
        Y.lIllIllIlI[18] = 0x90 ^ 0x9A;
        Y.lIllIllIlI[19] = 0x40 ^ 0xA ^ (0x82 ^ 0xC3);
        Y.lIllIllIlI[20] = 0x68 ^ 0x64;
        Y.lIllIllIlI[21] = 0x37 ^ 2 ^ (0x64 ^ 0x5C);
        Y.lIllIllIlI[22] = 0xC9 ^ 0xC7;
        Y.lIllIllIlI[23] = 6 ^ 0x59 ^ (0x10 ^ 0x66);
        Y.lIllIllIlI[24] = 0x9D ^ 0x82;
        Y.lIllIllIlI[25] = 0x21 ^ 0x1F ^ (0x99 ^ 0xB2);
        Y.lIllIllIlI[26] = -(0xFFFFFF73 & 0x18DE) & (0xFFFFBB79 & Short.MAX_VALUE);
        Y.lIllIllIlI[27] = -(0xFFFFBCFA & 0x5317) & (0xFFFFFEFD & 0x3FF3);
        Y.lIllIllIlI[28] = -(0xFFFF976C & 0x78D7) & (0xFFFFF7FB & 0x79EF);
        Y.lIllIllIlI[29] = -(0xFFFFFBF1 & 0x542F) & (0xFFFFFFED & 0x7EFE);
        Y.lIllIllIlI[30] = -(31 + 120 - -17 + 17) & (0xFFFFDFFF & 0x3FFF);
        Y.lIllIllIlI[31] = 0xA0 ^ 0xBF ^ (0x88 ^ 0xBF);
        Y.lIllIllIlI[32] = -(0xFFFFAE97 & 0x5969) & (0xFFFFBFDE & 0x4BA5);
        Y.lIllIllIlI[33] = 0xD5 ^ 0xB1;
        Y.lIllIllIlI[34] = 0x42 ^ 0x52;
        Y.lIllIllIlI[35] = 0x26 ^ 0x2D ^ (0x6F ^ 7);
        Y.lIllIllIlI[36] = 69 + 61 - 74 + 73 ^ 95 + 30 - 22 + 41;
        Y.lIllIllIlI[37] = -(0xFFFFE25F & 0x3DAB) & (0xFFFFAD7F & 0x7EDF);
        Y.lIllIllIlI[38] = -(0xFFFF9B53 & 0x66BE) & (0xFFFFAF3F & 0x5FFF);
        Y.lIllIllIlI[39] = 0x5F ^ 0x72;
        Y.lIllIllIlI[40] = -(0xFFFFBF87 & 0x71F9) & (0xFFFFFFFE & 0x3DFF);
        Y.lIllIllIlI[41] = 0xFFFFDDB9 & 0x2F67;
        Y.lIllIllIlI[42] = -(0xFFFFD7BC & 0x7A6F) & (0xFFFFDEAF & Short.MAX_VALUE);
        Y.lIllIllIlI[43] = 0xFFFFBDAF & 0x4F75;
        Y.lIllIllIlI[44] = 0xFFFFFFFE & 0x4FD;
        Y.lIllIllIlI[45] = 0xFFFFFEFE & 0x5FF;
        Y.lIllIllIlI[46] = -(5 ^ 0x18) & (0xFFFF979F & 0x6D7E);
        Y.lIllIllIlI[47] = -(0xFFFF86FF & 0x7B92) & (0xFFFFE7FF & 0x1F97);
        Y.lIllIllIlI[48] = -(0xFFFFF6AD & 0x5DFB) & (0xFFFFFFEE & 0x7EFD);
        Y.lIllIllIlI[49] = -(0xFFFFF32B & 0x5ED5) & (0xFFFFD7F7 & 0x7FEF);
        Y.lIllIllIlI[50] = 0xFFFFCFF5 & 0x35FB;
        Y.lIllIllIlI[51] = 0xFFFFCFEF & 0x35FF;
        Y.lIllIllIlI[52] = 66 + 97 - 32 + 9 ^ 118 + 97 - 76 + 19;
    }
}

