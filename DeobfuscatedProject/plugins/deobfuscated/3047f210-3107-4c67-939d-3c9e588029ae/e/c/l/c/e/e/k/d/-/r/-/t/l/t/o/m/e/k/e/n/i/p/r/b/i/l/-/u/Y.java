/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Production
 */
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;

public class Y
implements S {
    private static /* synthetic */ String[] lIIIIIIIIIl;
    public static final /* synthetic */ int jh;
    public static final /* synthetic */ int ji;
    public static /* synthetic */ boolean bs;
    public static /* synthetic */ List<d> bu;
    private static /* synthetic */ int[] lIIIIIIIIlI;

    @Override
    public boolean S() {
        return lIIIIIIIIlI[0];
    }

    private static String llIllIIllIIlI(String lllllllllllllllllIlIIIIIlllIlllI, String lllllllllllllllllIlIIIIIlllIllIl) {
        lllllllllllllllllIlIIIIIlllIlllI = new String(Base64.getDecoder().decode(lllllllllllllllllIlIIIIIlllIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIIIIIlllIllII = new StringBuilder();
        char[] lllllllllllllllllIlIIIIIlllIlIll = lllllllllllllllllIlIIIIIlllIllIl.toCharArray();
        int lllllllllllllllllIlIIIIIlllIlIlI = lIIIIIIIIlI[0];
        char[] lllllllllllllllllIlIIIIIlllIIlII = lllllllllllllllllIlIIIIIlllIlllI.toCharArray();
        int lllllllllllllllllIlIIIIIlllIIIll = lllllllllllllllllIlIIIIIlllIIlII.length;
        int lllllllllllllllllIlIIIIIlllIIIlI = lIIIIIIIIlI[0];
        while (Y.llIllIIlllIII(lllllllllllllllllIlIIIIIlllIIIlI, lllllllllllllllllIlIIIIIlllIIIll)) {
            char lllllllllllllllllIlIIIIIlllIllll = lllllllllllllllllIlIIIIIlllIIlII[lllllllllllllllllIlIIIIIlllIIIlI];
            lllllllllllllllllIlIIIIIlllIllII.append((char)(lllllllllllllllllIlIIIIIlllIllll ^ lllllllllllllllllIlIIIIIlllIlIll[lllllllllllllllllIlIIIIIlllIlIlI % lllllllllllllllllIlIIIIIlllIlIll.length]));
            0;
            ++lllllllllllllllllIlIIIIIlllIlIlI;
            ++lllllllllllllllllIlIIIIIlllIIIlI;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIlIIIIIlllIllII);
    }

    public static void ae() {
        d lllllllllllllllllIlIIIIIlllllIIl;
        Object lllllllllllllllllIlIIIIIlllllIlI;
        int[] nArray = new int[lIIIIIIIIlI[1]];
        nArray[Y.lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
        if (Y.llIllIIlllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            System.out.println(lIIIIIIIIIl[lIIIIIIIIlI[32]]);
            d d2 = new d(lIIIIIIIIlI[7], lIIIIIIIIlI[33], lIIIIIIIIlI[34]);
            bu.add(d2);
            0;
        }
        int[] nArray2 = new int[lIIIIIIIIlI[1]];
        nArray2[Y.lIIIIIIIIlI[0]] = lIIIIIIIIlI[8];
        if (Y.llIllIIlllIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            System.out.println(lIIIIIIIIIl[lIIIIIIIIlI[35]]);
            lllllllllllllllllIlIIIIIlllllIlI = new d(lIIIIIIIIlI[8], lIIIIIIIIlI[1], lIIIIIIIIlI[36]);
            bu.add((d)lllllllllllllllllIlIIIIIlllllIlI);
            0;
        }
        if (Y.llIllIIlllIIl(Bank.contains(lllllllllllllllllIlIIIIIlllllIlI = item -> item.getName().toLowerCase().contains(lIIIIIIIIIl[lIIIIIIIIlI[45]])) ? 1 : 0)) {
            lllllllllllllllllIlIIIIIlllllIIl = new d(lIIIIIIIIlI[37], lIIIIIIIIlI[9], lIIIIIIIIlI[38]);
            bu.add(lllllllllllllllllIlIIIIIlllllIIl);
            0;
        }
        int[] nArray3 = new int[lIIIIIIIIlI[1]];
        nArray3[Y.lIIIIIIIIlI[0]] = lIIIIIIIIlI[39];
        if (Y.llIllIIlllIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllllllllllllllllIlIIIIIlllllIIl = new d(lIIIIIIIIlI[39], lIIIIIIIIlI[40], lIIIIIIIIlI[41]);
            bu.add(lllllllllllllllllIlIIIIIlllllIIl);
            0;
        }
    }

    private static void llIllIIllIllI() {
        lIIIIIIIIlI = new int[47];
        Y.lIIIIIIIIlI[0] = (3 ^ (0x8A ^ 0xB9)) & (0x68 ^ 3 ^ (0x51 ^ 0xA) ^ -1);
        Y.lIIIIIIIIlI[1] = 1;
        Y.lIIIIIIIIlI[2] = -(0xFFFFB2DD & 0x7D2F) & (0xFFFFB7FF & 0x7BEF);
        Y.lIIIIIIIIlI[3] = 2;
        Y.lIIIIIIIIlI[4] = 3;
        Y.lIIIIIIIIlI[5] = -(0xFFFFFC6F & 0x27F5) & (0xFFFFF7ED & 0x3FFE);
        Y.lIIIIIIIIlI[6] = 0xB0 ^ 0xBE ^ (0x95 ^ 0x9F);
        Y.lIIIIIIIIlI[7] = -(0xFFFFDD17 & 0x3BF9) & (0xFFFF9FFF & Short.MAX_VALUE);
        Y.lIIIIIIIIlI[8] = 0xFFFFBFFD & 0x46FB;
        Y.lIIIIIIIIlI[9] = 0x8C ^ 0xB6 ^ (0x1B ^ 0x24);
        Y.lIIIIIIIIlI[10] = 119 + 82 - 109 + 45 ^ 121 + 120 - 107 + 9;
        Y.lIIIIIIIIlI[11] = 0x26 ^ 0x21;
        Y.lIIIIIIIIlI[12] = 0x46 ^ 0x4E;
        Y.lIIIIIIIIlI[13] = 0xFFFFF6D4 & 0xEBBB;
        Y.lIIIIIIIIlI[14] = 0x86 ^ 0x8A;
        Y.lIIIIIIIIlI[15] = 0x77 ^ 0x7E;
        Y.lIIIIIIIIlI[16] = 0x4E ^ 0x35 ^ (0xFC ^ 0xA6);
        Y.lIIIIIIIIlI[17] = 108 + 9 - 13 + 77 ^ 63 + 172 - 165 + 121;
        Y.lIIIIIIIIlI[18] = 0x79 ^ 0x49 ^ (6 ^ 0x3D);
        Y.lIIIIIIIIlI[19] = 0x4E ^ 0x64;
        Y.lIIIIIIIIlI[20] = 0x94 ^ 0x99;
        Y.lIIIIIIIIlI[21] = 56 + 102 - 88 + 60 ^ 19 + 138 - 13 + 28;
        Y.lIIIIIIIIlI[22] = 0xD ^ 3;
        Y.lIIIIIIIIlI[23] = 0x3B ^ 0x4A ^ (0x73 ^ 0xD);
        Y.lIIIIIIIIlI[24] = 0xA ^ 0x3B;
        Y.lIIIIIIIIlI[25] = 0x26 ^ 0x1C ^ (0xA1 ^ 0x8B);
        Y.lIIIIIIIIlI[26] = 0x6B ^ 0x7A;
        Y.lIIIIIIIIlI[27] = 50 + 23 - 12 + 88 ^ 94 + 153 - 105 + 52;
        Y.lIIIIIIIIlI[28] = 0xA5 ^ 0xBC ^ (6 ^ 0xD);
        Y.lIIIIIIIIlI[29] = 1 ^ 0x36 ^ (0xA2 ^ 0x86);
        Y.lIIIIIIIIlI[30] = 0x9B ^ 0x8F;
        Y.lIIIIIIIIlI[31] = 0x8C ^ 0x99;
        Y.lIIIIIIIIlI[32] = 11 + 53 - 45 + 111 ^ 74 + 74 - 48 + 48;
        Y.lIIIIIIIIlI[33] = 0xFFFF8F7E & 0x77BB;
        Y.lIIIIIIIIlI[34] = 0x17 ^ 0x79;
        Y.lIIIIIIIIlI[35] = 0x14 ^ 3;
        Y.lIIIIIIIIlI[36] = 0xFFFFFFFB & 0x15EE;
        Y.lIIIIIIIIlI[37] = 0xFFFFFECD & 0x2FFE;
        Y.lIIIIIIIIlI[38] = 0xFFFFE9AD & 0x77FA;
        Y.lIIIIIIIIlI[39] = -(0xFFFFB4F9 & 0x6BBF) & (0xFFFFBFFF & Short.MAX_VALUE);
        Y.lIIIIIIIIlI[40] = 0xE9 ^ 0xC1;
        Y.lIIIIIIIIlI[41] = 0xFFFFAFA4 & 0x53DF;
        Y.lIIIIIIIIlI[42] = 0xB4 ^ 0x8E ^ (0x75 ^ 0x2B);
        Y.lIIIIIIIIlI[43] = 0xBB ^ 0xA3;
        Y.lIIIIIIIIlI[44] = 0xC7 ^ 0xA4;
        Y.lIIIIIIIIlI[45] = 0xA1 ^ 0xB0 ^ (0x71 ^ 0x79);
        Y.lIIIIIIIIlI[46] = 42 + 44 - 8 + 110 ^ 44 + 72 - 9 + 59;
    }

    private static boolean llIllIIllllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIllIIlllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIllIIlllIIl(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (Y.llIllIIllllII(Skills.getLevel((Skill)Skill.CRAFTING), lIIIIIIIIlI[44])) {
            bl = lIIIIIIIIlI[1];
            0;
            if (-1 > (0x18 ^ 6 ^ (0x9A ^ 0x80))) {
                return ((1 ^ 0xF ^ (5 ^ 0x17)) & (0xC5 ^ 0x9A ^ (7 ^ 0x44) ^ -1)) != 0;
            }
        } else {
            bl = lIIIIIIIIlI[0];
        }
        return bl;
    }

    private static boolean llIllIIllIlll(int n2) {
        return n2 != 0;
    }

    @Override
    public String U() {
        return lIIIIIIIIIl[lIIIIIIIIlI[43]];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aa() {
        int n2;
        int[] nArray = new int[lIIIIIIIIlI[1]];
        nArray[Y.lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
        if (Y.llIllIIlllIlI(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[lIIIIIIIIlI[1]];
            nArray2[Y.lIIIIIIIIlI[0]] = lIIIIIIIIlI[8];
            if (Y.llIllIIlllIlI(Inventory.getCount((int[])nArray2))) {
                n2 = lIIIIIIIIlI[1];
                0;
                if (-1 < 3) return n2 != 0;
                return ((0xF8 ^ 0xB5 ^ (0x16 ^ 0x1E)) & (0x14 ^ 0x7F ^ (0x63 ^ 0x4D) ^ -1)) != 0;
            }
        }
        n2 = lIIIIIIIIlI[0];
        return n2 != 0;
    }

    public static void ef() {
        block29: {
            BankLocation lllllllllllllllllIlIIIIIlllllllI;
            block31: {
                block34: {
                    block33: {
                        block32: {
                            block30: {
                                if (Y.llIllIIllIlll(bs ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lIIIIIIIIIl[lIIIIIIIIlI[0]];
                                    b.a(bu);
                                    if (Y.llIllIIlllIII(bu.size(), lIIIIIIIIlI[1])) {
                                        System.out.println(lIIIIIIIIIl[lIIIIIIIIlI[1]]);
                                        bs = lIIIIIIIIlI[0];
                                    }
                                }
                                if (!Y.llIllIIlllIIl(bs ? 1 : 0)) break block29;
                                if (!Y.llIllIIllIlll(Y.aa() ? 1 : 0)) break block30;
                                int[] nArray = new int[lIIIIIIIIlI[1]];
                                nArray[Y.lIIIIIIIIlI[0]] = lIIIIIIIIlI[2];
                                if (!Y.llIllIIlllIlI(Inventory.getCount((int[])nArray))) break block31;
                            }
                            if (Y.llIllIIlllIll(lllllllllllllllllIlIIIIIlllllllI = BankLocation.getNearest()) && Y.llIllIIlllIIl(lllllllllllllllllIlIIIIIlllllllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lIIIIIIIIIl[lIIIIIIIIlI[3]];
                                a.a(lllllllllllllllllIlIIIIIlllllllI);
                            }
                            if (!Y.llIllIIlllIll(lllllllllllllllllIlIIIIIlllllllI) || !Y.llIllIIllIlll(lllllllllllllllllIlIIIIIlllllllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block31;
                            if (Y.llIllIIlllIIl(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lIIIIIIIIIl[lIIIIIIIIlI[4]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIIIIlI[5]);
                                0;
                            }
                            if (!Y.llIllIIllIlll(Bank.isOpen() ? 1 : 0)) break block31;
                            AccBuilderTempleTrek.c = lIIIIIIIIIl[lIIIIIIIIlI[6]];
                            if (Y.llIllIIlllIlI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIIIIIIIlI[4]);
                                0;
                            }
                            if (Y.llIllIIlllIlI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIIIIIIIlI[3]);
                                0;
                            }
                            int[] nArray = new int[lIIIIIIIIlI[1]];
                            nArray[Y.lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
                            if (!Y.llIllIIlllIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                            int[] nArray2 = new int[lIIIIIIIIlI[1]];
                            nArray2[Y.lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
                            if (!Y.llIllIIllllII(Inventory.getCount((int[])nArray2), lIIIIIIIIlI[1])) break block33;
                        }
                        int[] nArray = new int[lIIIIIIIIlI[1]];
                        nArray[Y.lIIIIIIIIlI[0]] = lIIIIIIIIlI[8];
                        if (!Y.llIllIIlllIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray3 = new int[lIIIIIIIIlI[1]];
                        nArray3[Y.lIIIIIIIIlI[0]] = lIIIIIIIIlI[8];
                        if (!Y.llIllIIlllIII(Inventory.getCount((int[])nArray3), lIIIIIIIIlI[1])) break block34;
                    }
                    Y.ae();
                    System.out.println(lIIIIIIIIIl[lIIIIIIIIlI[9]]);
                    bs = lIIIIIIIIlI[1];
                    return;
                }
                int[] nArray = new int[lIIIIIIIIlI[1]];
                nArray[Y.lIIIIIIIIlI[0]] = lIIIIIIIIlI[8];
                if (Y.llIllIIllIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray4 = new int[lIIIIIIIIlI[1]];
                    nArray4[Y.lIIIIIIIIlI[0]] = lIIIIIIIIlI[8];
                    if (Y.llIllIIlllIII(Inventory.getCount((int[])nArray4), lIIIIIIIIlI[1])) {
                        Bank.withdraw((int)lIIIIIIIIlI[8], (int)lIIIIIIIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIIIIIIlI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIIIIIIlI[1]];
                            nArray[Y.lIIIIIIIIlI[0]] = lIIIIIIIIlI[8];
                            if (Y.llIllIIlllIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIIIIIIIIlI[1];
                                0;
                                if (3 == 0) {
                                    return ((0xC ^ 0x33) & ~(0x1A ^ 0x25)) != 0;
                                }
                            } else {
                                bl = lIIIIIIIIlI[0];
                            }
                            return bl;
                        }, (int)lIIIIIIIIlI[5]);
                        0;
                    }
                }
                int[] nArray5 = new int[lIIIIIIIIlI[1]];
                nArray5[Y.lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
                if (Y.llIllIIllIlll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    int[] nArray6 = new int[lIIIIIIIIlI[1]];
                    nArray6[Y.lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
                    if (Y.llIllIIlllIII(Inventory.getCount((int[])nArray6), lIIIIIIIIlI[1])) {
                        int[] nArray7 = new int[lIIIIIIIIlI[1]];
                        nArray7[Y.lIIIIIIIIlI[0]] = lIIIIIIIIlI[8];
                        if (Y.llIllIIlllIlI(Inventory.getCount((int[])nArray7))) {
                            Bank.withdrawAll((int)lIIIIIIIIlI[7], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lIIIIIIIIlI[1]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIIIIIIlI[1]];
                                nArray[Y.lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
                                if (Y.llIllIIlllIlI(Inventory.getCount((int[])nArray))) {
                                    bl = lIIIIIIIIlI[1];
                                    0;
                                    if (null != null) {
                                        return ((0xF9 ^ 0xA8) & ~(0x55 ^ 4)) != 0;
                                    }
                                } else {
                                    bl = lIIIIIIIIlI[0];
                                }
                                return bl;
                            }, (int)lIIIIIIIIlI[5]);
                            0;
                        }
                    }
                }
            }
            if (Y.llIllIIllIlll(Y.aa() ? 1 : 0)) {
                if (Y.llIllIIllIlll(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (Y.llIllIIlllIIl(Bank.isOpen() ? 1 : 0) && Y.llIllIIlllIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lIIIIIIIIIl[lIIIIIIIIlI[10]];
                    if (Y.llIllIIllIlll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (Y.llIllIIlllIIl(Production.isOpen() ? 1 : 0)) {
                        Time.sleepTicks((int)lIIIIIIIIlI[3]);
                        0;
                        int[] nArray = new int[lIIIIIIIIlI[1]];
                        nArray[Y.lIIIIIIIIlI[0]] = lIIIIIIIIlI[8];
                        lllllllllllllllllIlIIIIIlllllllI = Inventory.getFirst((int[])nArray);
                        int[] nArray8 = new int[lIIIIIIIIlI[1]];
                        nArray8[Y.lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
                        Item lllllllllllllllllIlIIIIIllllllIl = Inventory.getFirst((int[])nArray8);
                        if (Y.llIllIIlllIll(lllllllllllllllllIlIIIIIlllllllI) && Y.llIllIIlllIll(lllllllllllllllllIlIIIIIllllllIl)) {
                            lllllllllllllllllIlIIIIIlllllllI.useOn(lllllllllllllllllIlIIIIIllllllIl);
                            Time.sleepUntil(() -> Production.isOpen(), (int)lIIIIIIIIlI[5]);
                            0;
                        }
                    }
                    if (Y.llIllIIllIlll(Production.isOpen() ? 1 : 0)) {
                        if (Y.llIllIIlllIII(Skills.getLevel((Skill)Skill.CRAFTING), lIIIIIIIIlI[6])) {
                            AccBuilderTempleTrek.c = lIIIIIIIIIl[lIIIIIIIIlI[11]];
                            Production.chooseOption((String)lIIIIIIIIIl[lIIIIIIIIlI[12]]);
                            Time.sleepTicks((int)lIIIIIIIIlI[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIIIIIIlI[1]];
                                nArray[Y.lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
                                if (!Y.llIllIIllllII(Inventory.getCount((int[])nArray), lIIIIIIIIlI[1]) || Y.llIllIIllIlll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIIIIIIIIlI[1];
                                    0;
                                    if (1 >= (0x37 ^ 3 ^ (0x6D ^ 0x5D))) {
                                        return ((0x3E ^ 0x68 ^ (0x39 ^ 0x75)) & (0x4F ^ 0x72 ^ (0x57 ^ 0x70) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIIIIIIIlI[0];
                                }
                                return bl;
                            }, (int)lIIIIIIIIlI[13]);
                            0;
                        }
                        if (Y.llIllIIllllII(Skills.getLevel((Skill)Skill.CRAFTING), lIIIIIIIIlI[6]) && Y.llIllIIlllIII(Skills.getLevel((Skill)Skill.CRAFTING), lIIIIIIIIlI[14])) {
                            AccBuilderTempleTrek.c = lIIIIIIIIIl[lIIIIIIIIlI[15]];
                            Production.chooseOption((int)lIIIIIIIIlI[3]);
                            Time.sleepTicks((int)lIIIIIIIIlI[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIIIIIIlI[1]];
                                nArray[Y.lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
                                if (!Y.llIllIIllllII(Inventory.getCount((int[])nArray), lIIIIIIIIlI[1]) || Y.llIllIIllIlll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIIIIIIIIlI[1];
                                    0;
                                    if (((0xDF ^ 0x9F ^ 51 + 26 - -47 + 3) & (118 + 77 - 48 + 14 ^ 151 + 118 - 139 + 28 ^ -1)) <= -1) {
                                        return ((128 + 17 - 124 + 188 ^ 30 + 155 - 71 + 62) & (0x2D ^ 0x60 ^ (0xB3 ^ 0x9F) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIIIIIIIlI[0];
                                }
                                return bl;
                            }, (int)lIIIIIIIIlI[13]);
                            0;
                        }
                        if (Y.llIllIIllllII(Skills.getLevel((Skill)Skill.CRAFTING), lIIIIIIIIlI[14]) && Y.llIllIIlllIII(Skills.getLevel((Skill)Skill.CRAFTING), lIIIIIIIIlI[16])) {
                            AccBuilderTempleTrek.c = lIIIIIIIIIl[lIIIIIIIIlI[17]];
                            Production.chooseOption((String)lIIIIIIIIIl[lIIIIIIIIlI[18]]);
                            Time.sleepTicks((int)lIIIIIIIIlI[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIIIIIIlI[1]];
                                nArray[Y.lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
                                if (!Y.llIllIIllllII(Inventory.getCount((int[])nArray), lIIIIIIIIlI[1]) || Y.llIllIIllIlll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIIIIIIIIlI[1];
                                    0;
                                    if (null != null) {
                                        return ((0x4E ^ 0x76) & ~(0x97 ^ 0xAF)) != 0;
                                    }
                                } else {
                                    bl = lIIIIIIIIlI[0];
                                }
                                return bl;
                            }, (int)lIIIIIIIIlI[13]);
                            0;
                        }
                        if (Y.llIllIIllllII(Skills.getLevel((Skill)Skill.CRAFTING), lIIIIIIIIlI[16]) && Y.llIllIIlllIII(Skills.getLevel((Skill)Skill.CRAFTING), lIIIIIIIIlI[19])) {
                            AccBuilderTempleTrek.c = lIIIIIIIIIl[lIIIIIIIIlI[14]];
                            Production.chooseOption((String)lIIIIIIIIIl[lIIIIIIIIlI[20]]);
                            Time.sleepTicks((int)lIIIIIIIIlI[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIIIIIIlI[1]];
                                nArray[Y.lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
                                if (!Y.llIllIIllllII(Inventory.getCount((int[])nArray), lIIIIIIIIlI[1]) || Y.llIllIIllIlll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIIIIIIIIlI[1];
                                    0;
                                    if (3 == 1) {
                                        return ((0x9B ^ 0xA0) & ~(0x84 ^ 0xBF)) != 0;
                                    }
                                } else {
                                    bl = lIIIIIIIIlI[0];
                                }
                                return bl;
                            }, (int)lIIIIIIIIlI[13]);
                            0;
                        }
                        if (Y.llIllIIllllII(Skills.getLevel((Skill)Skill.CRAFTING), lIIIIIIIIlI[19]) && Y.llIllIIlllIII(Skills.getLevel((Skill)Skill.CRAFTING), lIIIIIIIIlI[21])) {
                            AccBuilderTempleTrek.c = lIIIIIIIIIl[lIIIIIIIIlI[22]];
                            Production.chooseOption((String)lIIIIIIIIIl[lIIIIIIIIlI[23]]);
                            Time.sleepTicks((int)lIIIIIIIIlI[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIIIIIIlI[1]];
                                nArray[Y.lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
                                if (!Y.llIllIIllllII(Inventory.getCount((int[])nArray), lIIIIIIIIlI[1]) || Y.llIllIIllIlll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIIIIIIIIlI[1];
                                    0;
                                    if (2 < ((4 ^ 0x26) & ~(0x8B ^ 0xA9))) {
                                        return ((0x53 ^ 0x68) & ~(0x58 ^ 0x63)) != 0;
                                    }
                                } else {
                                    bl = lIIIIIIIIlI[0];
                                }
                                return bl;
                            }, (int)lIIIIIIIIlI[13]);
                            0;
                        }
                        if (Y.llIllIIllllII(Skills.getLevel((Skill)Skill.CRAFTING), lIIIIIIIIlI[21]) && Y.llIllIIlllIII(Skills.getLevel((Skill)Skill.CRAFTING), lIIIIIIIIlI[24])) {
                            AccBuilderTempleTrek.c = lIIIIIIIIIl[lIIIIIIIIlI[25]];
                            Production.chooseOption((String)lIIIIIIIIIl[lIIIIIIIIlI[26]]);
                            Time.sleepTicks((int)lIIIIIIIIlI[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIIIIIIlI[1]];
                                nArray[Y.lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
                                if (!Y.llIllIIllllII(Inventory.getCount((int[])nArray), lIIIIIIIIlI[1]) || Y.llIllIIllIlll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIIIIIIIIlI[1];
                                    0;
                                    if (3 < ((0xF1 ^ 0xA5 ^ (0x83 ^ 0x91)) & (0x34 ^ 0x27 ^ (0x41 ^ 0x14) ^ -1))) {
                                        return ((100 + 185 - 112 + 17 ^ 131 + 43 - 115 + 81) & (16 + 133 - 117 + 112 ^ 14 + 3 - -115 + 30 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIIIIIIIlI[0];
                                }
                                return bl;
                            }, (int)lIIIIIIIIlI[13]);
                            0;
                        }
                        if (Y.llIllIIllllII(Skills.getLevel((Skill)Skill.CRAFTING), lIIIIIIIIlI[24]) && Y.llIllIIlllIII(Skills.getLevel((Skill)Skill.CRAFTING), lIIIIIIIIlI[27])) {
                            AccBuilderTempleTrek.c = lIIIIIIIIIl[lIIIIIIIIlI[28]];
                            Production.chooseOption((String)lIIIIIIIIIl[lIIIIIIIIlI[29]]);
                            Time.sleepTicks((int)lIIIIIIIIlI[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIIIIIIlI[1]];
                                nArray[Y.lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
                                if (!Y.llIllIIllllII(Inventory.getCount((int[])nArray), lIIIIIIIIlI[1]) || Y.llIllIIllIlll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIIIIIIIIlI[1];
                                    0;
                                    if (-(0x45 ^ 0x4E ^ (0x68 ^ 0x67)) >= 0) {
                                        return ((0xA4 ^ 0xAD ^ (0x4A ^ 0x10)) & (0x7A ^ 0x7F ^ (0x2B ^ 0x7D) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIIIIIIIlI[0];
                                }
                                return bl;
                            }, (int)lIIIIIIIIlI[13]);
                            0;
                        }
                        if (Y.llIllIIllllII(Skills.getLevel((Skill)Skill.CRAFTING), lIIIIIIIIlI[27])) {
                            AccBuilderTempleTrek.c = lIIIIIIIIIl[lIIIIIIIIlI[30]];
                            Production.chooseOption((String)lIIIIIIIIIl[lIIIIIIIIlI[31]]);
                            Time.sleepTicks((int)lIIIIIIIIlI[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIIIIIIlI[1]];
                                nArray[Y.lIIIIIIIIlI[0]] = lIIIIIIIIlI[7];
                                if (!Y.llIllIIllllII(Inventory.getCount((int[])nArray), lIIIIIIIIlI[1]) || Y.llIllIIllIlll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIIIIIIIIlI[1];
                                    0;
                                    if (1 < 0) {
                                        return ((0x29 ^ 0x25) & ~(0x24 ^ 0x28)) != 0;
                                    }
                                } else {
                                    bl = lIIIIIIIIlI[0];
                                }
                                return bl;
                            }, (int)lIIIIIIIIlI[13]);
                            0;
                        }
                    }
                }
            }
        }
    }

    static {
        Y.llIllIIllIllI();
        Y.llIllIIllIlIl();
        jh = lIIIIIIIIlI[7];
        ji = lIIIIIIIIlI[8];
        bu = new ArrayList<d>();
    }

    private static String llIllIIllIlII(String lllllllllllllllllIlIIIIIllIlIlll, String lllllllllllllllllIlIIIIIllIllIII) {
        try {
            SecretKeySpec lllllllllllllllllIlIIIIIllIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIIIllIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIIIIIllIllIll = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIIIIIllIllIll.init(lIIIIIIIIlI[3], lllllllllllllllllIlIIIIIllIlllII);
            return new String(lllllllllllllllllIlIIIIIllIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIIIllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIIIIIllIllIlI) {
            lllllllllllllllllIlIIIIIllIllIlI.printStackTrace();
            return null;
        }
    }

    @Override
    public int T() {
        Y.ef();
        return lIIIIIIIIlI[42];
    }

    private static boolean llIllIIlllIlI(int n2) {
        return n2 > 0;
    }

    private static boolean llIllIIlllIll(Object object) {
        return object != null;
    }

    private static void llIllIIllIlIl() {
        lIIIIIIIIIl = new String[lIIIIIIIIlI[46]];
        Y.lIIIIIIIIIl[Y.lIIIIIIIIlI[0]] = Y."Buying items";
        Y.lIIIIIIIIIl[Y.lIIIIIIIIlI[1]] = Y."Finished buying items, switching back to crafting";
        Y.lIIIIIIIIIl[Y.lIIIIIIIIlI[3]] = Y."Navigating to bank";
        Y.lIIIIIIIIIl[Y.lIIIIIIIIlI[4]] = Y."Opening bank";
        Y.lIIIIIIIIIl[Y.lIIIIIIIIlI[6]] = Y."Handling banking";
        Y.lIIIIIIIIIl[Y.lIIIIIIIIlI[9]] = Y."We are missing supplies, switching to BUYING";
        Y.lIIIIIIIIIl[Y.lIIIIIIIIlI[10]] = Y."Crafting ";
        Y.lIIIIIIIIIl[Y.lIIIIIIIIlI[11]] = Y."Crafting glass";
        Y.lIIIIIIIIIl[Y.lIIIIIIIIlI[12]] = Y."Beer glass";
        Y.lIIIIIIIIIl[Y.lIIIIIIIIlI[15]] = Y."Crafting candle lantern";
        Y.lIIIIIIIIIl[Y.lIIIIIIIIlI[17]] = Y."Crafting lamp";
        Y.lIIIIIIIIIl[Y.lIIIIIIIIlI[18]] = Y."Oil lamp";
        Y.lIIIIIIIIIl[Y.lIIIIIIIIlI[14]] = Y."Crafting vial";
        Y.lIIIIIIIIIl[Y.lIIIIIIIIlI[20]] = Y."Vial";
        Y.lIIIIIIIIIl[Y.lIIIIIIIIlI[22]] = Y."Crafting fishbowl";
        Y.lIIIIIIIIIl[Y.lIIIIIIIIlI[23]] = Y."Fishbowl";
        Y.lIIIIIIIIIl[Y.lIIIIIIIIlI[25]] = Y."Crafting orb";
        Y.lIIIIIIIIIl[Y.lIIIIIIIIlI[26]] = Y."Unpowered staff orb";
        Y.lIIIIIIIIIl[Y.lIIIIIIIIlI[28]] = Y."Crafting lens";
        Y.lIIIIIIIIIl[Y.lIIIIIIIIlI[29]] = Y."Lantern lens";
        Y.lIIIIIIIIIl[Y.lIIIIIIIIlI[30]] = Y."Crafting light orb";
        Y.lIIIIIIIIIl[Y.lIIIIIIIIlI[31]] = Y."Light orb";
        Y.lIIIIIIIIIl[Y.lIIIIIIIIlI[32]] = Y."Buying molten glass";
        Y.lIIIIIIIIIl[Y.lIIIIIIIIlI[35]] = Y."Buying glassblowing pipe";
        Y.lIIIIIIIIIl[Y.lIIIIIIIIlI[43]] = Y."Crafting";
        Y.lIIIIIIIIIl[Y.lIIIIIIIIlI[45]] = Y."ring of wealth (";
    }

    private static String llIllIIllIIll(String lllllllllllllllllIlIIIIIllIIlIlI, String lllllllllllllllllIlIIIIIllIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllllIlIIIIIllIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIIIllIIlIIl.getBytes(StandardCharsets.UTF_8)), lIIIIIIIIlI[12]), "DES");
            Cipher lllllllllllllllllIlIIIIIllIIlllI = Cipher.getInstance("DES");
            lllllllllllllllllIlIIIIIllIIlllI.init(lIIIIIIIIlI[3], lllllllllllllllllIlIIIIIllIIllll);
            return new String(lllllllllllllllllIlIIIIIllIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIIIllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIIIIIllIIllIl) {
            lllllllllllllllllIlIIIIIllIIllIl.printStackTrace();
            return null;
        }
    }
}

