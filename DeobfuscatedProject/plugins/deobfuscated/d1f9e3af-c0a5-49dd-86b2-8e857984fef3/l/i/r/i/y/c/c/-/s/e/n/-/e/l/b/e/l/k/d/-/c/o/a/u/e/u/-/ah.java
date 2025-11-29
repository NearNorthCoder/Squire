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
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

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
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
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

public class ah
implements W {
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int[] lIlIlIIII;
    public static final /* synthetic */ int lQ;
    public static /* synthetic */ List<d> bv;
    public static final /* synthetic */ int lP;
    private static /* synthetic */ String[] lIlIIllll;

    private static boolean lIIIlllIIIll(int n2) {
        return n2 > 0;
    }

    private static void lIIIllIlllll() {
        lIlIlIIII = new int[47];
        ah.lIlIlIIII[0] = (0xBA ^ 0x82) & ~(0x92 ^ 0xAA);
        ah.lIlIlIIII[1] = 1;
        ah.lIlIlIIII[2] = 0xFFFFC3FF & 0x3FE3;
        ah.lIlIlIIII[3] = 2;
        ah.lIlIlIIII[4] = 3;
        ah.lIlIlIIII[5] = -(0xFFFF9A7E & 0x6DB3) & (0xFFFFBBF9 & 0x5FBF);
        ah.lIlIlIIII[6] = 69 + 80 - 45 + 79 ^ 89 + 131 - 150 + 109;
        ah.lIlIlIIII[7] = -(0xFFFFF9BD & 0x3E53) & (0xFFFFFFFF & 0x3EFF);
        ah.lIlIlIIII[8] = -(0xFFFF9D7B & 0x6B85) & (0xFFFFAFFD & 0x5FFB);
        ah.lIlIlIIII[9] = 0xB8 ^ 0xBD;
        ah.lIlIlIIII[10] = 0x8A ^ 0x8C;
        ah.lIlIlIIII[11] = 0x22 ^ 0x68 ^ (0x15 ^ 0x58);
        ah.lIlIlIIII[12] = 0x43 ^ 0xA ^ (0xED ^ 0xAC);
        ah.lIlIlIIII[13] = 0xFFFFE69D & 0xFBF2;
        ah.lIlIlIIII[14] = 0x80 ^ 0x8C;
        ah.lIlIlIIII[15] = (0x97 ^ 0xC3) & ~(0x5F ^ 0xB) ^ (0xC9 ^ 0xC0);
        ah.lIlIlIIII[16] = 0x49 ^ 0x7F ^ (1 ^ 0x16);
        ah.lIlIlIIII[17] = 0x81 ^ 0x8B;
        ah.lIlIlIIII[18] = 14 + 44 - 26 + 119 ^ 46 + 65 - -35 + 10;
        ah.lIlIlIIII[19] = 0x62 ^ 0x75 ^ (0x6D ^ 0x50);
        ah.lIlIlIIII[20] = 0x7F ^ 0x72;
        ah.lIlIlIIII[21] = 0x66 ^ 0x48;
        ah.lIlIlIIII[22] = 0x14 ^ 0x1B ^ 1;
        ah.lIlIlIIII[23] = 0xF7 ^ 0x94 ^ (0x4F ^ 0x23);
        ah.lIlIlIIII[24] = 0xBE ^ 0x8F;
        ah.lIlIlIIII[25] = 0x1B ^ 0xB;
        ah.lIlIlIIII[26] = 0x34 ^ 0x2A ^ (0x91 ^ 0x9E);
        ah.lIlIlIIII[27] = 0x56 ^ 1;
        ah.lIlIlIIII[28] = 0xBA ^ 0xA8;
        ah.lIlIlIIII[29] = 0x33 ^ 0x2E ^ (0x2B ^ 0x25);
        ah.lIlIlIIII[30] = 0x9A ^ 0x8E;
        ah.lIlIlIIII[31] = 99 + 84 - 175 + 163 ^ 105 + 167 - 169 + 87;
        ah.lIlIlIIII[32] = 101 + 101 - 147 + 86 ^ 89 + 10 - 20 + 76;
        ah.lIlIlIIII[33] = 0xFFFFE7BF & 0x1F7A;
        ah.lIlIlIIII[34] = 174 + 150 - 299 + 194 ^ 159 + 17 - 73 + 78;
        ah.lIlIlIIII[35] = 0x8A ^ 0x9D;
        ah.lIlIlIIII[36] = 0xFFFFD7FE & 0x3DEB;
        ah.lIlIlIIII[37] = 0xFFFFFEDF & 0x2FEC;
        ah.lIlIlIIII[38] = 0xFFFFFBBB & 0x65EC;
        ah.lIlIlIIII[39] = -(0xFFFFC9BB & 0x76DD) & (0xFFFFDFDF & Short.MAX_VALUE);
        ah.lIlIlIIII[40] = 0xBC ^ 0x94;
        ah.lIlIlIIII[41] = 0xFFFFA7EF & 0x5B94;
        ah.lIlIlIIII[42] = 3 ^ (3 ^ 0x64);
        ah.lIlIlIIII[43] = 0xA4 ^ 0xBC;
        ah.lIlIlIIII[44] = 0xE4 ^ 0x87;
        ah.lIlIlIIII[45] = 46 + 119 - 104 + 78 ^ 140 + 13 - 126 + 119;
        ah.lIlIlIIII[46] = 0x7B ^ 0x65 ^ (0x90 ^ 0x94);
    }

    @Override
    public boolean S() {
        return lIlIlIIII[0];
    }

    private static boolean lIIIlllIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    public static void af() {
        d lllIlIlIIIlIlI;
        Object lllIlIlIIIlIll;
        int[] nArray = new int[lIlIlIIII[1]];
        nArray[ah.lIlIlIIII[0]] = lIlIlIIII[7];
        if (ah.lIIIlllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            System.out.println(lIlIIllll[lIlIlIIII[32]]);
            d d2 = new d(lIlIlIIII[7], lIlIlIIII[33], lIlIlIIII[34]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[lIlIlIIII[1]];
        nArray2[ah.lIlIlIIII[0]] = lIlIlIIII[8];
        if (ah.lIIIlllIIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            System.out.println(lIlIIllll[lIlIlIIII[35]]);
            lllIlIlIIIlIll = new d(lIlIlIIII[8], lIlIlIIII[1], lIlIlIIII[36]);
            bv.add((d)lllIlIlIIIlIll);
            0;
        }
        if (ah.lIIIlllIIIlI(Bank.contains(lllIlIlIIIlIll = item -> item.getName().toLowerCase().contains(lIlIIllll[lIlIlIIII[45]])) ? 1 : 0)) {
            lllIlIlIIIlIlI = new d(lIlIlIIII[37], lIlIlIIII[9], lIlIlIIII[38]);
            bv.add(lllIlIlIIIlIlI);
            0;
        }
        int[] nArray3 = new int[lIlIlIIII[1]];
        nArray3[ah.lIlIlIIII[0]] = lIlIlIIII[39];
        if (ah.lIIIlllIIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllIlIlIIIlIlI = new d(lIlIlIIII[39], lIlIlIIII[40], lIlIlIIII[41]);
            bv.add(lllIlIlIIIlIlI);
            0;
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (ah.lIIIlllIIlIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[44])) {
            bl = lIlIlIIII[1];
            0;
            if (-1 > 0) {
                return ((110 + 60 - 77 + 49 ^ 160 + 1 - 157 + 157) & (127 + 62 - 143 + 141 ^ 64 + 17 - 76 + 143 ^ -1)) != 0;
            }
        } else {
            bl = lIlIlIIII[0];
        }
        return bl;
    }

    private static boolean lIIIlllIIIII(int n2) {
        return n2 != 0;
    }

    private static String lIIIllIlllII(String lllIlIIllIlIII, String lllIlIIllIIlll) {
        try {
            SecretKeySpec lllIlIIllIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlIIllIIlll.getBytes(StandardCharsets.UTF_8)), lIlIlIIII[12]), "DES");
            Cipher lllIlIIllIllII = Cipher.getInstance("DES");
            lllIlIIllIllII.init(lIlIlIIII[3], lllIlIIllIllIl);
            return new String(lllIlIIllIllII.doFinal(Base64.getDecoder().decode(lllIlIIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlIIllIlIll) {
            lllIlIIllIlIll.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean ab() {
        int n2;
        int[] nArray = new int[lIlIlIIII[1]];
        nArray[ah.lIlIlIIII[0]] = lIlIlIIII[7];
        if (ah.lIIIlllIIIll(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[lIlIlIIII[1]];
            nArray2[ah.lIlIlIIII[0]] = lIlIlIIII[8];
            if (ah.lIIIlllIIIll(Inventory.getCount((int[])nArray2))) {
                n2 = lIlIlIIII[1];
                0;
                if (-3 < 0) return n2 != 0;
                return ((0x92 ^ 0xBD) & ~(0x67 ^ 0x48)) != 0;
            }
        }
        n2 = lIlIlIIII[0];
        return n2 != 0;
    }

    private static String lIIIllIllIll(String lllIlIIlIllIll, String lllIlIIlIlllII) {
        try {
            SecretKeySpec lllIlIIllIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlIIlIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIlIIlIlllll = Cipher.getInstance("Blowfish");
            lllIlIIlIlllll.init(lIlIlIIII[3], lllIlIIllIIIII);
            return new String(lllIlIIlIlllll.doFinal(Base64.getDecoder().decode(lllIlIIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlIIlIllllI) {
            lllIlIIlIllllI.printStackTrace();
            return null;
        }
    }

    @Override
    public String U() {
        return lIlIIllll[lIlIlIIII[43]];
    }

    static {
        ah.lIIIllIlllll();
        ah.lIIIllIllllI();
        lQ = lIlIlIIII[8];
        lP = lIlIlIIII[7];
        bv = new ArrayList<d>();
    }

    public static void dO() {
        block29: {
            BankLocation lllIlIlIIIllll;
            block31: {
                block34: {
                    block33: {
                        block32: {
                            block30: {
                                if (ah.lIIIlllIIIII(bt ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[0]];
                                    b.a(bv);
                                    if (ah.lIIIlllIIIIl(bv.size(), lIlIlIIII[1])) {
                                        System.out.println(lIlIIllll[lIlIlIIII[1]]);
                                        bt = lIlIlIIII[0];
                                    }
                                }
                                if (!ah.lIIIlllIIIlI(bt ? 1 : 0)) break block29;
                                if (!ah.lIIIlllIIIII(ah.ab() ? 1 : 0)) break block30;
                                int[] nArray = new int[lIlIlIIII[1]];
                                nArray[ah.lIlIlIIII[0]] = lIlIlIIII[2];
                                if (!ah.lIIIlllIIIll(Inventory.getCount((int[])nArray))) break block31;
                            }
                            if (ah.lIIIlllIIlII(lllIlIlIIIllll = BankLocation.getNearest()) && ah.lIIIlllIIIlI(lllIlIlIIIllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[3]];
                                a.a(lllIlIlIIIllll);
                            }
                            if (!ah.lIIIlllIIlII(lllIlIlIIIllll) || !ah.lIIIlllIIIII(lllIlIlIIIllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block31;
                            if (ah.lIIIlllIIIlI(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[4]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIlIIII[5]);
                                0;
                            }
                            if (!ah.lIIIlllIIIII(Bank.isOpen() ? 1 : 0)) break block31;
                            AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[6]];
                            if (ah.lIIIlllIIIll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIlIlIIII[4]);
                                0;
                            }
                            if (ah.lIIIlllIIIll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIlIlIIII[3]);
                                0;
                            }
                            int[] nArray = new int[lIlIlIIII[1]];
                            nArray[ah.lIlIlIIII[0]] = lIlIlIIII[7];
                            if (!ah.lIIIlllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                            int[] nArray2 = new int[lIlIlIIII[1]];
                            nArray2[ah.lIlIlIIII[0]] = lIlIlIIII[7];
                            if (!ah.lIIIlllIIlIl(Inventory.getCount((int[])nArray2), lIlIlIIII[1])) break block33;
                        }
                        int[] nArray = new int[lIlIlIIII[1]];
                        nArray[ah.lIlIlIIII[0]] = lIlIlIIII[8];
                        if (!ah.lIIIlllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray3 = new int[lIlIlIIII[1]];
                        nArray3[ah.lIlIlIIII[0]] = lIlIlIIII[8];
                        if (!ah.lIIIlllIIIIl(Inventory.getCount((int[])nArray3), lIlIlIIII[1])) break block34;
                    }
                    ah.af();
                    System.out.println(lIlIIllll[lIlIlIIII[9]]);
                    bt = lIlIlIIII[1];
                    return;
                }
                int[] nArray = new int[lIlIlIIII[1]];
                nArray[ah.lIlIlIIII[0]] = lIlIlIIII[8];
                if (ah.lIIIlllIIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray4 = new int[lIlIlIIII[1]];
                    nArray4[ah.lIlIlIIII[0]] = lIlIlIIII[8];
                    if (ah.lIIIlllIIIIl(Inventory.getCount((int[])nArray4), lIlIlIIII[1])) {
                        Bank.withdraw((int)lIlIlIIII[8], (int)lIlIlIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlIlIIII[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlIlIIII[1]];
                            nArray[ah.lIlIlIIII[0]] = lIlIlIIII[8];
                            if (ah.lIIIlllIIIll(Inventory.getCount((int[])nArray))) {
                                bl = lIlIlIIII[1];
                                0;
                                if (1 == 3) {
                                    return ((0xE4 ^ 0x80 ^ (0x2F ^ 0x6E)) & (0x91 ^ 0xAA ^ (0x8E ^ 0x90) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIlIlIIII[0];
                            }
                            return bl;
                        }, (int)lIlIlIIII[5]);
                        0;
                    }
                }
                int[] nArray5 = new int[lIlIlIIII[1]];
                nArray5[ah.lIlIlIIII[0]] = lIlIlIIII[7];
                if (ah.lIIIlllIIIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    int[] nArray6 = new int[lIlIlIIII[1]];
                    nArray6[ah.lIlIlIIII[0]] = lIlIlIIII[7];
                    if (ah.lIIIlllIIIIl(Inventory.getCount((int[])nArray6), lIlIlIIII[1])) {
                        int[] nArray7 = new int[lIlIlIIII[1]];
                        nArray7[ah.lIlIlIIII[0]] = lIlIlIIII[8];
                        if (ah.lIIIlllIIIll(Inventory.getCount((int[])nArray7))) {
                            Bank.withdrawAll((int)lIlIlIIII[7], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lIlIlIIII[1]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIlIlIIII[1]];
                                nArray[ah.lIlIlIIII[0]] = lIlIlIIII[7];
                                if (ah.lIIIlllIIIll(Inventory.getCount((int[])nArray))) {
                                    bl = lIlIlIIII[1];
                                    0;
                                    if ((0x74 ^ 0x6D ^ (0x3F ^ 0x22)) != (150 + 130 - 130 + 8 ^ 37 + 69 - 38 + 86)) {
                                        return ((0xD6 ^ 0x87 ^ (0x71 ^ 0x39)) & (0x22 ^ 0x66 ^ (0x7B ^ 0x26) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIlIlIIII[0];
                                }
                                return bl;
                            }, (int)lIlIlIIII[5]);
                            0;
                        }
                    }
                }
            }
            if (ah.lIIIlllIIIII(ah.ab() ? 1 : 0)) {
                if (ah.lIIIlllIIIII(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (ah.lIIIlllIIIlI(Bank.isOpen() ? 1 : 0) && ah.lIIIlllIIIlI(Players.getLocal().isAnimating() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[10]];
                    if (ah.lIIIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (ah.lIIIlllIIIlI(Production.isOpen() ? 1 : 0)) {
                        Time.sleepTicks((int)lIlIlIIII[3]);
                        0;
                        int[] nArray = new int[lIlIlIIII[1]];
                        nArray[ah.lIlIlIIII[0]] = lIlIlIIII[8];
                        lllIlIlIIIllll = Inventory.getFirst((int[])nArray);
                        int[] nArray8 = new int[lIlIlIIII[1]];
                        nArray8[ah.lIlIlIIII[0]] = lIlIlIIII[7];
                        Item lllIlIlIIIlllI = Inventory.getFirst((int[])nArray8);
                        if (ah.lIIIlllIIlII(lllIlIlIIIllll) && ah.lIIIlllIIlII(lllIlIlIIIlllI)) {
                            lllIlIlIIIllll.useOn(lllIlIlIIIlllI);
                            Time.sleepUntil(() -> Production.isOpen(), (int)lIlIlIIII[5]);
                            0;
                        }
                    }
                    if (ah.lIIIlllIIIII(Production.isOpen() ? 1 : 0)) {
                        if (ah.lIIIlllIIIIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[6])) {
                            AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[11]];
                            Production.chooseOption((String)lIlIIllll[lIlIlIIII[12]]);
                            Time.sleepTicks((int)lIlIlIIII[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIlIlIIII[1]];
                                nArray[ah.lIlIlIIII[0]] = lIlIlIIII[7];
                                if (!ah.lIIIlllIIlIl(Inventory.getCount((int[])nArray), lIlIlIIII[1]) || ah.lIIIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIlIlIIII[1];
                                    0;
                                    if (-3 >= 0) {
                                        return ((0x3B ^ 0x43 ^ (0x9C ^ 0xC6)) & (0x1E ^ 0x5D ^ (0xD4 ^ 0xB5) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIlIlIIII[0];
                                }
                                return bl;
                            }, (int)lIlIlIIII[13]);
                            0;
                        }
                        if (ah.lIIIlllIIlIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[6]) && ah.lIIIlllIIIIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[14])) {
                            AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[15]];
                            Production.chooseOption((int)lIlIlIIII[3]);
                            Time.sleepTicks((int)lIlIlIIII[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIlIlIIII[1]];
                                nArray[ah.lIlIlIIII[0]] = lIlIlIIII[7];
                                if (!ah.lIIIlllIIlIl(Inventory.getCount((int[])nArray), lIlIlIIII[1]) || ah.lIIIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIlIlIIII[1];
                                    0;
                                    if ((84 + 44 - 120 + 138 ^ 31 + 39 - -34 + 46) == 2) {
                                        return ((0xCE ^ 0xC0 ^ (8 ^ 0xE)) & (0xF ^ 0x2E ^ (0x4F ^ 0x66) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIlIlIIII[0];
                                }
                                return bl;
                            }, (int)lIlIlIIII[13]);
                            0;
                        }
                        if (ah.lIIIlllIIlIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[14]) && ah.lIIIlllIIIIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[16])) {
                            AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[17]];
                            Production.chooseOption((String)lIlIIllll[lIlIlIIII[18]]);
                            Time.sleepTicks((int)lIlIlIIII[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIlIlIIII[1]];
                                nArray[ah.lIlIlIIII[0]] = lIlIlIIII[7];
                                if (!ah.lIIIlllIIlIl(Inventory.getCount((int[])nArray), lIlIlIIII[1]) || ah.lIIIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIlIlIIII[1];
                                    0;
                                    if (-2 >= 0) {
                                        return ((0xDD ^ 0x9F) & ~(0x30 ^ 0x72)) != 0;
                                    }
                                } else {
                                    bl = lIlIlIIII[0];
                                }
                                return bl;
                            }, (int)lIlIlIIII[13]);
                            0;
                        }
                        if (ah.lIIIlllIIlIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[16]) && ah.lIIIlllIIIIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[19])) {
                            AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[14]];
                            Production.chooseOption((String)lIlIIllll[lIlIlIIII[20]]);
                            Time.sleepTicks((int)lIlIlIIII[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIlIlIIII[1]];
                                nArray[ah.lIlIlIIII[0]] = lIlIlIIII[7];
                                if (!ah.lIIIlllIIlIl(Inventory.getCount((int[])nArray), lIlIlIIII[1]) || ah.lIIIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIlIlIIII[1];
                                    0;
                                    if (-1 > 3) {
                                        return ((0x3D ^ 0x43 ^ (0xA2 ^ 0x8B)) & (161 + 71 - 102 + 83 ^ 60 + 24 - -23 + 23 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIlIlIIII[0];
                                }
                                return bl;
                            }, (int)lIlIlIIII[13]);
                            0;
                        }
                        if (ah.lIIIlllIIlIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[19]) && ah.lIIIlllIIIIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[21])) {
                            AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[22]];
                            Production.chooseOption((String)lIlIIllll[lIlIlIIII[23]]);
                            Time.sleepTicks((int)lIlIlIIII[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIlIlIIII[1]];
                                nArray[ah.lIlIlIIII[0]] = lIlIlIIII[7];
                                if (!ah.lIIIlllIIlIl(Inventory.getCount((int[])nArray), lIlIlIIII[1]) || ah.lIIIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIlIlIIII[1];
                                    0;
                                    if (-2 >= 0) {
                                        return ((0xB5 ^ 0x91) & ~(0x83 ^ 0xA7)) != 0;
                                    }
                                } else {
                                    bl = lIlIlIIII[0];
                                }
                                return bl;
                            }, (int)lIlIlIIII[13]);
                            0;
                        }
                        if (ah.lIIIlllIIlIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[21]) && ah.lIIIlllIIIIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[24])) {
                            AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[25]];
                            Production.chooseOption((String)lIlIIllll[lIlIlIIII[26]]);
                            Time.sleepTicks((int)lIlIlIIII[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIlIlIIII[1]];
                                nArray[ah.lIlIlIIII[0]] = lIlIlIIII[7];
                                if (!ah.lIIIlllIIlIl(Inventory.getCount((int[])nArray), lIlIlIIII[1]) || ah.lIIIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIlIlIIII[1];
                                    0;
                                    if ((0x86 ^ 0x82) < 2) {
                                        return ((0xB7 ^ 0x85) & ~(0xA0 ^ 0x92)) != 0;
                                    }
                                } else {
                                    bl = lIlIlIIII[0];
                                }
                                return bl;
                            }, (int)lIlIlIIII[13]);
                            0;
                        }
                        if (ah.lIIIlllIIlIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[24]) && ah.lIIIlllIIIIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[27])) {
                            AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[28]];
                            Production.chooseOption((String)lIlIIllll[lIlIlIIII[29]]);
                            Time.sleepTicks((int)lIlIlIIII[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIlIlIIII[1]];
                                nArray[ah.lIlIlIIII[0]] = lIlIlIIII[7];
                                if (!ah.lIIIlllIIlIl(Inventory.getCount((int[])nArray), lIlIlIIII[1]) || ah.lIIIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIlIlIIII[1];
                                    0;
                                    if (null != null) {
                                        return ((0x28 ^ 1) & ~(0x2F ^ 6)) != 0;
                                    }
                                } else {
                                    bl = lIlIlIIII[0];
                                }
                                return bl;
                            }, (int)lIlIlIIII[13]);
                            0;
                        }
                        if (ah.lIIIlllIIlIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[27])) {
                            AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[30]];
                            Production.chooseOption((String)lIlIIllll[lIlIlIIII[31]]);
                            Time.sleepTicks((int)lIlIlIIII[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIlIlIIII[1]];
                                nArray[ah.lIlIlIIII[0]] = lIlIlIIII[7];
                                if (!ah.lIIIlllIIlIl(Inventory.getCount((int[])nArray), lIlIlIIII[1]) || ah.lIIIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIlIlIIII[1];
                                    0;
                                    if (null != null) {
                                        return ((109 + 165 - 186 + 117 ^ 36 + 120 - 121 + 101) & (0xD7 ^ 0xA6 ^ (0x63 ^ 0x57) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIlIlIIII[0];
                                }
                                return bl;
                            }, (int)lIlIlIIII[13]);
                            0;
                        }
                    }
                }
            }
        }
    }

    @Override
    public int T() {
        ah.dO();
        return lIlIlIIII[42];
    }

    private static String lIIIllIlllIl(String lllIlIIlllllll, String lllIlIIllllIIl) {
        lllIlIIlllllll = new String(Base64.getDecoder().decode(lllIlIIlllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIlIIlllllIl = new StringBuilder();
        char[] lllIlIIlllllII = lllIlIIllllIIl.toCharArray();
        int lllIlIIllllIll = lIlIlIIII[0];
        char[] lllIlIIlllIlIl = lllIlIIlllllll.toCharArray();
        int lllIlIIlllIlII = lllIlIIlllIlIl.length;
        int lllIlIIlllIIll = lIlIlIIII[0];
        while (ah.lIIIlllIIIIl(lllIlIIlllIIll, lllIlIIlllIlII)) {
            char lllIlIlIIIIIII = lllIlIIlllIlIl[lllIlIIlllIIll];
            lllIlIIlllllIl.append((char)(lllIlIlIIIIIII ^ lllIlIIlllllII[lllIlIIllllIll % lllIlIIlllllII.length]));
            0;
            ++lllIlIIllllIll;
            ++lllIlIIlllIIll;
            0;
            if ((0xB2 ^ 0xB6) >= 0) continue;
            return null;
        }
        return String.valueOf(lllIlIIlllllIl);
    }

    private static boolean lIIIlllIIIlI(int n2) {
        return n2 == 0;
    }

    private static void lIIIllIllllI() {
        lIlIIllll = new String[lIlIlIIII[46]];
        ah.lIlIIllll[ah.lIlIlIIII[0]] = ah."Buying items";
        ah.lIlIIllll[ah.lIlIlIIII[1]] = ah."Finished buying items, switching back to crafting";
        ah.lIlIIllll[ah.lIlIlIIII[3]] = ah."Navigating to bank";
        ah.lIlIIllll[ah.lIlIlIIII[4]] = ah."Opening bank";
        ah.lIlIIllll[ah.lIlIlIIII[6]] = ah."Handling banking";
        ah.lIlIIllll[ah.lIlIlIIII[9]] = ah."We are missing supplies, switching to BUYING";
        ah.lIlIIllll[ah.lIlIlIIII[10]] = ah."Crafting ";
        ah.lIlIIllll[ah.lIlIlIIII[11]] = ah."Crafting glass";
        ah.lIlIIllll[ah.lIlIlIIII[12]] = ah."Beer glass";
        ah.lIlIIllll[ah.lIlIlIIII[15]] = ah."Crafting candle lantern";
        ah.lIlIIllll[ah.lIlIlIIII[17]] = ah."Crafting lamp";
        ah.lIlIIllll[ah.lIlIlIIII[18]] = ah."Oil lamp";
        ah.lIlIIllll[ah.lIlIlIIII[14]] = ah."Crafting vial";
        ah.lIlIIllll[ah.lIlIlIIII[20]] = ah."Vial";
        ah.lIlIIllll[ah.lIlIlIIII[22]] = ah."Crafting fishbowl";
        ah.lIlIIllll[ah.lIlIlIIII[23]] = ah."Fishbowl";
        ah.lIlIIllll[ah.lIlIlIIII[25]] = ah."Crafting orb";
        ah.lIlIIllll[ah.lIlIlIIII[26]] = ah."Unpowered staff orb";
        ah.lIlIIllll[ah.lIlIlIIII[28]] = ah."Crafting lens";
        ah.lIlIIllll[ah.lIlIlIIII[29]] = ah."Lantern lens";
        ah.lIlIIllll[ah.lIlIlIIII[30]] = ah."Crafting light orb";
        ah.lIlIIllll[ah.lIlIlIIII[31]] = ah."Light orb";
        ah.lIlIIllll[ah.lIlIlIIII[32]] = ah."Buying molten glass";
        ah.lIlIIllll[ah.lIlIlIIII[35]] = ah."Buying glassblowing pipe";
        ah.lIlIIllll[ah.lIlIlIIII[43]] = ah."Crafting";
        ah.lIlIIllll[ah.lIlIlIIII[45]] = ah."ring of wealth (";
    }

    private static boolean lIIIlllIIlII(Object object) {
        return object != null;
    }

    private static boolean lIIIlllIIlIl(int n2, int n3) {
        return n2 >= n3;
    }
}

