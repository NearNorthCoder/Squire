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
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f;
import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

public class am
implements ab {
    public static final /* synthetic */ int mp;
    private static /* synthetic */ int[] lIIIIllIlI;
    private static /* synthetic */ String[] lIIIIllIIl;
    public static final /* synthetic */ WorldPoint ms;
    public static /* synthetic */ boolean bv;
    public static final /* synthetic */ int mo;
    public static final /* synthetic */ int mq;
    public static /* synthetic */ List<d> bx;
    public static final /* synthetic */ WorldPoint mr;

    private static boolean lllIIlIIIlII(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        am.lllIIIllllII();
        am.lllIIIlllIll();
        mp = lIIIIllIlI[9];
        mo = lIIIIllIlI[6];
        mq = lIIIIllIlI[11];
        mr = new WorldPoint(lIIIIllIlI[37], lIIIIllIlI[38], lIIIIllIlI[0]);
        ms = new WorldPoint(lIIIIllIlI[39], lIIIIllIlI[40], lIIIIllIlI[0]);
        bx = new ArrayList<d>();
    }

    private static boolean lllIIlIIIIIl(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean ae() {
        return lIIIIllIlI[0];
    }

    private static String lllIIIlllIII(String lllIIlIIIIII, String lllIIIllllIl) {
        try {
            SecretKeySpec lllIIlIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIIllllIl.getBytes(StandardCharsets.UTF_8)), lIIIIllIlI[16]), "DES");
            Cipher lllIIlIIIIlI = Cipher.getInstance("DES");
            lllIIlIIIIlI.init(lIIIIllIlI[2], lllIIlIIIIll);
            return new String(lllIIlIIIIlI.doFinal(Base64.getDecoder().decode(lllIIlIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIlIIIIIl) {
            lllIIlIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIlllllI(int n2, int n3) {
        return n2 < n3;
    }

    public static void ed() {
        if (am.lllIIIllllIl(bv ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIllIIl[lIIIIllIlI[0]];
            b.a(bx);
            if (am.lllIIIlllllI(bx.size(), lIIIIllIlI[1])) {
                System.out.println(lIIIIllIIl[lIIIIllIlI[1]]);
                bv = lIIIIllIlI[0];
            }
        }
        if (am.lllIIIllllll(bv ? 1 : 0)) {
            BankLocation lllIIlIIlllI;
            if (am.lllIIIllllll(am.an() ? 1 : 0)) {
                lllIIlIIlllI = BankLocation.getNearest();
                if (am.lllIIlIIIIII(lllIIlIIlllI) && am.lllIIIllllll(lllIIlIIlllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIllIIl[lIIIIllIlI[2]];
                    a.a(lllIIlIIlllI);
                }
                if (am.lllIIlIIIIII(lllIIlIIlllI) && am.lllIIIllllIl(lllIIlIIlllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIllIIl[lIIIIllIlI[3]];
                    if (am.lllIIIllllll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIllIlI[4]);
                        0;
                    }
                    if (am.lllIIIllllIl(Bank.isOpen() ? 1 : 0)) {
                        if (am.lllIIlIIIIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIIllIlI[1]);
                            0;
                        }
                        if (am.lllIIlIIIIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIIllIlI[2]);
                            0;
                        }
                    }
                    if (am.lllIIIlllllI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[5])) {
                        int[] nArray = new int[lIIIIllIlI[1]];
                        nArray[am.lIIIIllIlI[0]] = lIIIIllIlI[6];
                        if (am.lllIIIllllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            am.Q();
                            System.out.println(lIIIIllIIl[lIIIIllIlI[7]]);
                            bv = lIIIIllIlI[1];
                            return;
                        }
                    }
                    if (am.lllIIlIIIIlI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[5]) && am.lllIIIlllllI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[8])) {
                        int[] nArray = new int[lIIIIllIlI[1]];
                        nArray[am.lIIIIllIlI[0]] = lIIIIllIlI[9];
                        if (am.lllIIIllllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            am.Q();
                            System.out.println(lIIIIllIIl[lIIIIllIlI[10]]);
                            bv = lIIIIllIlI[1];
                            return;
                        }
                    }
                    if (am.lllIIlIIIIlI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[8])) {
                        int[] nArray = new int[lIIIIllIlI[1]];
                        nArray[am.lIIIIllIlI[0]] = lIIIIllIlI[11];
                        if (am.lllIIIllllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            am.Q();
                            System.out.println(lIIIIllIIl[lIIIIllIlI[12]]);
                            bv = lIIIIllIlI[1];
                            return;
                        }
                    }
                    int[] nArray = new int[lIIIIllIlI[1]];
                    nArray[am.lIIIIllIlI[0]] = lIIIIllIlI[13];
                    if (am.lllIIIllllll(Equipment.contains((int[])nArray) ? 1 : 0) && am.lllIIlIIIIll(Players.getLocal().getWorldLocation().distanceTo(ms), lIIIIllIlI[14])) {
                        a.b(f.aU, lIIIIllIlI[1]);
                        Time.sleepTicks((int)lIIIIllIlI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIIllIlI[1]];
                            nArray[am.lIIIIllIlI[0]] = lIIIIllIlI[13];
                            if (am.lllIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                                bl = lIIIIllIlI[1];
                                0;
                                if ((74 + 153 - 70 + 12 ^ 68 + 145 - 200 + 160) == -1) {
                                    return ((0x3A ^ 0x7D ^ (0x27 ^ 0x4D)) & (113 + 108 - 102 + 55 ^ 49 + 8 - -58 + 16 ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIIIllIlI[0];
                            }
                            return bl;
                        }, (int)lIIIIllIlI[4]);
                        0;
                    }
                    if (am.lllIIIlllllI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[5])) {
                        Bank.withdrawAll((int)lIIIIllIlI[6], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIIllIlI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIIllIlI[1]];
                            nArray[am.lIIIIllIlI[0]] = lIIIIllIlI[6];
                            if (am.lllIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                                bl = lIIIIllIlI[1];
                                0;
                                if (-1 >= ((0x2B ^ 0x15 ^ (0x6E ^ 0x33)) & (35 + 179 - 158 + 139 ^ 95 + 100 - 181 + 146 ^ -1))) {
                                    return ((0x28 ^ 0x12 ^ (0x81 ^ 0xAB)) & (0x1D ^ 0xC ^ 1 ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIIIllIlI[0];
                            }
                            return bl;
                        }, (int)lIIIIllIlI[4]);
                        0;
                    }
                    if (am.lllIIlIIIIlI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[5]) && am.lllIIIlllllI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[8])) {
                        Bank.withdrawAll((int)lIIIIllIlI[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIIllIlI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIIllIlI[1]];
                            nArray[am.lIIIIllIlI[0]] = lIIIIllIlI[9];
                            if (am.lllIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                                bl = lIIIIllIlI[1];
                                0;
                                if ((0x23 ^ 0x7A ^ (0x59 ^ 4)) == 3) {
                                    return false;
                                }
                            } else {
                                bl = lIIIIllIlI[0];
                            }
                            return bl;
                        }, (int)lIIIIllIlI[4]);
                        0;
                    }
                    if (am.lllIIlIIIIlI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[8])) {
                        Bank.withdrawAll((int)lIIIIllIlI[11], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIIllIlI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIIllIlI[1]];
                            nArray[am.lIIIIllIlI[0]] = lIIIIllIlI[11];
                            if (am.lllIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                                bl = lIIIIllIlI[1];
                                0;
                                if ((0x1E ^ 0x1B) <= 0) {
                                    return false;
                                }
                            } else {
                                bl = lIIIIllIlI[0];
                            }
                            return bl;
                        }, (int)lIIIIllIlI[4]);
                        0;
                    }
                }
            }
            if (am.lllIIIllllIl(am.an() ? 1 : 0)) {
                int[] nArray = new int[lIIIIllIlI[1]];
                nArray[am.lIIIIllIlI[0]] = lIIIIllIlI[13];
                if (am.lllIIIllllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIIIIllIlI[1]];
                    nArray2[am.lIIIIllIlI[0]] = lIIIIllIlI[13];
                    if (am.lllIIIllllll(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIllIIl[lIIIIllIlI[15]];
                        int[] nArray3 = new int[lIIIIllIlI[1]];
                        nArray3[am.lIIIIllIlI[0]] = lIIIIllIlI[13];
                        lllIIlIIlllI = Inventory.getFirst((int[])nArray3);
                        if (am.lllIIlIIIIII(lllIIlIIlllI)) {
                            lllIIlIIlllI.interact(lIIIIllIIl[lIIIIllIlI[16]]);
                            Time.sleepTicks((int)lIIIIllIlI[3]);
                            0;
                        }
                    }
                }
                if (am.lllIIlIIIIll(Players.getLocal().getWorldLocation().distanceTo(ms), lIIIIllIlI[10])) {
                    AccBuilderGWD.c = lIIIIllIIl[lIIIIllIlI[17]];
                    Movement.walkTo((WorldPoint)ms);
                    0;
                    Time.sleepTicks((int)lIIIIllIlI[7]);
                    0;
                }
                if (am.lllIIlIIIlII(Players.getLocal().getWorldLocation().distanceTo(ms), lIIIIllIlI[10])) {
                    AccBuilderGWD.c = lIIIIllIIl[lIIIIllIlI[18]];
                    String[] stringArray = new String[lIIIIllIlI[1]];
                    stringArray[am.lIIIIllIlI[0]] = lIIIIllIIl[lIIIIllIlI[19]];
                    lllIIlIIlllI = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
                    if (am.lllIIlIIIIII(lllIIlIIlllI)) {
                        if (am.lllIIIllllll(Production.isOpen() ? 1 : 0)) {
                            lllIIlIIlllI.interact(lIIIIllIIl[lIIIIllIlI[20]]);
                            Time.sleepTicks((int)lIIIIllIlI[2]);
                            0;
                            Time.sleepUntil(() -> Production.isOpen(), (int)lIIIIllIlI[4]);
                            0;
                        }
                        if (am.lllIIIllllIl(Production.isOpen() ? 1 : 0)) {
                            Production.chooseOption((int)lIIIIllIlI[1]);
                            Time.sleepTicks((int)lIIIIllIlI[7]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (!am.lllIIIllllIl(am.an() ? 1 : 0) || am.lllIIIllllIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIIIIllIlI[1];
                                    0;
                                    
                                    }
                                } else {
                                    bl = lIIIIllIlI[0];
                                }
                                return bl;
                            }, (int)lIIIIllIlI[21]);
                            0;
                        }
                    }
                }
            }
        }
    }

    private static boolean lllIIlIIIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static void Q() {
        d lllIIlIIlIII;
        Object lllIIlIIlIIl;
        Object lllIIlIIlIlI;
        if (am.lllIIIlllllI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[5])) {
            d d2 = new d(lIIIIllIlI[6], lIIIIllIlI[22], lIIIIllIlI[23]);
            bx.add(d2);
            0;
        }
        if (am.lllIIlIIIIlI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[5]) && am.lllIIIlllllI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[8])) {
            lllIIlIIlIlI = new d(lIIIIllIlI[9], lIIIIllIlI[24], lIIIIllIlI[25]);
            bx.add((d)lllIIlIIlIlI);
            0;
        }
        if (am.lllIIlIIIIlI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[8])) {
            lllIIlIIlIlI = new d(lIIIIllIlI[11], lIIIIllIlI[24], lIIIIllIlI[25]);
            bx.add((d)lllIIlIIlIlI);
            0;
        }
        if (am.lllIIIllllll(Bank.contains(lllIIlIIlIlI = item -> item.getName().toLowerCase().contains(lIIIIllIIl[lIIIIllIlI[5]])) ? 1 : 0)) {
            lllIIlIIlIIl = new d(lIIIIllIlI[13], lIIIIllIlI[26], lIIIIllIlI[27]);
            bx.add((d)lllIIlIIlIIl);
            0;
        }
        if (am.lllIIIllllll(Bank.contains(lllIIlIIlIIl = item -> item.getName().toLowerCase().contains(lIIIIllIIl[lIIIIllIlI[36]])) ? 1 : 0)) {
            lllIIlIIlIII = new d(lIIIIllIlI[28], lIIIIllIlI[10], lIIIIllIlI[29]);
            bx.add(lllIIlIIlIII);
            0;
        }
        int[] nArray = new int[lIIIIllIlI[1]];
        nArray[am.lIIIIllIlI[0]] = lIIIIllIlI[30];
        if (am.lllIIIllllll(Bank.contains((int[])nArray) ? 1 : 0)) {
            lllIIlIIlIII = new d(lIIIIllIlI[30], lIIIIllIlI[31], lIIIIllIlI[32]);
            bx.add(lllIIlIIlIII);
            0;
        }
    }

    @Override
    public int af() {
        am.ed();
        return lIIIIllIlI[33];
    }

    private static boolean an() {
        boolean bl;
        if (am.lllIIlIIIIlI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[8])) {
            boolean bl2;
            int[] nArray = new int[lIIIIllIlI[1]];
            nArray[am.lIIIIllIlI[0]] = lIIIIllIlI[11];
            if (am.lllIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                bl2 = lIIIIllIlI[1];
                0;
                if (3 == (65 + 46 - -37 + 1 ^ 132 + 106 - 191 + 98)) {
                    return ((0xE1 ^ 0xA9 ^ (0x4F ^ 0x24)) & (0x17 ^ 0x4C ^ (0x18 ^ 0x60) ^ -1)) != 0;
                }
            } else {
                bl2 = lIIIIllIlI[0];
            }
            return bl2;
        }
        if (am.lllIIlIIIIlI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[5]) && am.lllIIIlllllI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[8])) {
            boolean bl3;
            int[] nArray = new int[lIIIIllIlI[1]];
            nArray[am.lIIIIllIlI[0]] = lIIIIllIlI[9];
            if (am.lllIIlIIIIIl(Inventory.getCount((int[])nArray))) {
                bl3 = lIIIIllIlI[1];
                0;
                if (1 >= 3) {
                    return false;
                }
            } else {
                bl3 = lIIIIllIlI[0];
            }
            return bl3;
        }
        int[] nArray = new int[lIIIIllIlI[1]];
        nArray[am.lIIIIllIlI[0]] = lIIIIllIlI[6];
        if (am.lllIIlIIIIIl(Inventory.getCount((int[])nArray))) {
            bl = lIIIIllIlI[1];
            0;
            if (((0x69 ^ 9 ^ (0x53 ^ 0x79)) & (132 + 141 - 73 + 5 ^ 57 + 14 - 47 + 111 ^ -1)) != 0) {
                return ((0x4F ^ 0x37 ^ (0xDB ^ 0xAA)) & (0x23 ^ 0x7D ^ (0xF2 ^ 0xA5) ^ -1)) != 0;
            }
        } else {
            bl = lIIIIllIlI[0];
        }
        return bl;
    }

    @Override
    public String ag() {
        return lIIIIllIIl[lIIIIllIlI[34]];
    }

    private static boolean lllIIlIIIIII(Object object) {
        return object != null;
    }

    private static boolean lllIIlIIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (am.lllIIlIIIIlI(Skills.getLevel((Skill)Skill.COOKING), lIIIIllIlI[35])) {
            bl = lIIIIllIlI[1];
            0;
            if (-1 > 0) {
                return false;
            }
        } else {
            bl = lIIIIllIlI[0];
        }
        return bl;
    }

    private static String lllIIIlllIlI(String lllIIIIllIll, String lllIIIIllIlI) {
        try {
            SecretKeySpec lllIIIIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIIIlllIl = Cipher.getInstance("Blowfish");
            lllIIIIlllIl.init(lIIIIllIlI[2], lllIIIIllllI);
            return new String(lllIIIIlllIl.doFinal(Base64.getDecoder().decode(lllIIIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIIIlllII) {
            lllIIIIlllII.printStackTrace();
            return null;
        }
    }

    private static void lllIIIllllII() {
        lIIIIllIlI = new int[42];
        am.lIIIIllIlI[0] = (0x22 ^ 0x77) & ~(0x76 ^ 0x23);
        am.lIIIIllIlI[1] = 1;
        am.lIIIIllIlI[2] = 2;
        am.lIIIIllIlI[3] = 3;
        am.lIIIIllIlI[4] = -(0xFFFFB4BF & 0x6B77) & (0xFFFFFBBE & 0x37FF);
        am.lIIIIllIlI[5] = 8 + 100 - 4 + 60 ^ 124 + 115 - 206 + 138;
        am.lIIIIllIlI[6] = -(0xFFFFC84B & 0x7FF7) & (0xFFFFDD7F & 0x6BFF);
        am.lIIIIllIlI[7] = 15 + 122 - 22 + 46 ^ 48 + 78 - 119 + 158;
        am.lIIIIllIlI[8] = 0x73 ^ 0x6D;
        am.lIIIIllIlI[9] = -(0xFFFFF6EB & 0x7F35) & (0xFFFFF77F & 0x7FEF);
        am.lIIIIllIlI[10] = 113 + 151 - 208 + 137 ^ 91 + 4 - 77 + 178;
        am.lIIIIllIlI[11] = 0xFFFFA57F & 0x5BE7;
        am.lIIIIllIlI[12] = 0x6D ^ 0x6B;
        am.lIIIIllIlI[13] = -(0xFFFFF6AF & 0x7F56) & (0xFFFFFFFD & Short.MAX_VALUE);
        am.lIIIIllIlI[14] = 0xE ^ 0x17;
        am.lIIIIllIlI[15] = 0x56 ^ 0x51;
        am.lIIIIllIlI[16] = 97 + 3 - 1 + 66 ^ 34 + 139 - 28 + 28;
        am.lIIIIllIlI[17] = 0x9A ^ 0xA2 ^ (0xBF ^ 0x8E);
        am.lIIIIllIlI[18] = 0x3A ^ 0x56 ^ (9 ^ 0x6F);
        am.lIIIIllIlI[19] = 6 + 3 - -106 + 39 ^ 48 + 91 - 131 + 137;
        am.lIIIIllIlI[20] = 22 + 174 - 7 + 14 ^ 111 + 152 - 131 + 67;
        am.lIIIIllIlI[21] = -(0xFFFFAABE & 0x5753) & (0xFFFFFFFF & 0xFFF9);
        am.lIIIIllIlI[22] = 185 + 12 - 166 + 219;
        am.lIIIIllIlI[23] = 0xFFFF893D & 0x77EE;
        am.lIIIIllIlI[24] = -(0xFFFFFC09 & Short.MAX_VALUE) & (0xFFFFFDFE & 0x7FFD);
        am.lIIIIllIlI[25] = 51 + 23 - -60 + 66;
        am.lIIIIllIlI[26] = 0x1D ^ 9;
        am.lIIIIllIlI[27] = -(0xFFFFFC26 & 0x7BFB) & (0xFFFFFFFD & 0x7FF3);
        am.lIIIIllIlI[28] = 0xFFFFFECD & 0x2FFE;
        am.lIIIIllIlI[29] = -(0xFFFFFF5F & 0x1CE7) & (0xFFFFFDFF & 0x7FEE);
        am.lIIIIllIlI[30] = -(89 + 148 - 216 + 164) & (0xFFFFDFFF & 0x3FFF);
        am.lIIIIllIlI[31] = 4 ^ 0x2C;
        am.lIIIIllIlI[32] = -(0xFFFFDF2B & 0x74D6) & (0xFFFFDF97 & 0x77ED);
        am.lIIIIllIlI[33] = 0x7D ^ 0x13 ^ (0x74 ^ 0x7E);
        am.lIIIIllIlI[34] = 0x80 ^ 0xA7 ^ (0x62 ^ 0x48);
        am.lIIIIllIlI[35] = 0x28 ^ 0x3B ^ (0x58 ^ 0x28);
        am.lIIIIllIlI[36] = 0xC ^ 2;
        am.lIIIIllIlI[37] = -(0xFFFFF04B & 0x6FB7) & (0xFFFFFFDF & 0x6CE7);
        am.lIIIIllIlI[38] = 0xFFFF8C61 & 0x7FFE;
        am.lIIIIllIlI[39] = -(0xFFFFFEF4 & 0x731F) & (0xFFFFFFDF & 0x7EFB);
        am.lIIIIllIlI[40] = 0xFFFF8FFF & 0x7C6C;
        am.lIIIIllIlI[41] = 0x6A ^ 0x7A;
    }

    private static String lllIIIlllIIl(String lllIIIllIIII, String lllIIIlIllll) {
        lllIIIllIIII = new String(Base64.getDecoder().decode(lllIIIllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIIIlIlllI = new StringBuilder();
        char[] lllIIIlIllIl = lllIIIlIllll.toCharArray();
        int lllIIIlIllII = lIIIIllIlI[0];
        char[] lllIIIlIIllI = lllIIIllIIII.toCharArray();
        int lllIIIlIIlIl = lllIIIlIIllI.length;
        int lllIIIlIIlII = lIIIIllIlI[0];
        while (am.lllIIIlllllI(lllIIIlIIlII, lllIIIlIIlIl)) {
            char lllIIIllIIIl = lllIIIlIIllI[lllIIIlIIlII];
            lllIIIlIlllI.append((char)(lllIIIllIIIl ^ lllIIIlIllIl[lllIIIlIllII % lllIIIlIllIl.length]));
            0;
            ++lllIIIlIllII;
            ++lllIIIlIIlII;
            0;
            if (1 >= 0) continue;
            return null;
        }
        return String.valueOf(lllIIIlIlllI);
    }

    private static void lllIIIlllIll() {
        lIIIIllIIl = new String[lIIIIllIlI[41]];
        am.lIIIIllIIl[am.lIIIIllIlI[0]] = am."Buying items";
        am.lIIIIllIIl[am.lIIIIllIlI[1]] = am."Finished buying items, switching back to cooking";
        am.lIIIIllIIl[am.lIIIIllIlI[2]] = am."Navigating to bank";
        am.lIIIIllIIl[am.lIIIIllIlI[3]] = am."Handling banking";
        am.lIIIIllIIl[am.lIIIIllIlI[7]] = am."We are missing supplies, switching to BUYING";
        am.lIIIIllIIl[am.lIIIIllIlI[10]] = am."We are missing supplies, switching to BUYING";
        am.lIIIIllIIl[am.lIIIIllIlI[12]] = am."We are missing supplies, switching to BUYING";
        am.lIIIIllIIl[am.lIIIIllIlI[15]] = am."Equiping duel";
        am.lIIIIllIIl[am.lIIIIllIlI[16]] = am."Wear";
        am.lIIIIllIIl[am.lIIIIllIlI[17]] = am."Navigate to range";
        am.lIIIIllIIl[am.lIIIIllIlI[18]] = am."Cooking";
        am.lIIIIllIIl[am.lIIIIllIlI[19]] = am."Range";
        am.lIIIIllIIl[am.lIIIIllIlI[20]] = am."Cook";
        am.lIIIIllIIl[am.lIIIIllIlI[34]] = am."Cooking";
        am.lIIIIllIIl[am.lIIIIllIlI[36]] = am."ring of wealth (";
        am.lIIIIllIIl[am.lIIIIllIlI[5]] = am."ring of dueling(";
    }

    private static boolean lllIIIllllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIIllllll(int n2) {
        return n2 == 0;
    }
}

