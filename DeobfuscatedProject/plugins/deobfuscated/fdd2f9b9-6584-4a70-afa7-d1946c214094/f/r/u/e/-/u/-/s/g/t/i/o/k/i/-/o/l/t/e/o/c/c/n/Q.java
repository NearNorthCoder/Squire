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
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.b;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.d;
import gg.squire.account.AccBuilderRogues;
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

public class Q
implements G {
    public static final /* synthetic */ int jo;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int[] lIIIllIlII;
    public static final /* synthetic */ int jn;
    private static /* synthetic */ String[] lIIIllIIll;
    public static /* synthetic */ List<d> bv;

    private static boolean lllIllllIIll(int n2) {
        return n2 == 0;
    }

    public static void cT() {
        block29: {
            BankLocation lllllIIIIll;
            block31: {
                block34: {
                    block33: {
                        block32: {
                            block30: {
                                if (Q.lllIllllIIIl(bt ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[0]];
                                    b.a(bv);
                                    if (Q.lllIllllIIlI(bv.size(), lIIIllIlII[1])) {
                                        System.out.println(lIIIllIIll[lIIIllIlII[1]]);
                                        bt = lIIIllIlII[0];
                                    }
                                }
                                if (!Q.lllIllllIIll(bt ? 1 : 0)) break block29;
                                if (!Q.lllIllllIIIl(Q.ab() ? 1 : 0)) break block30;
                                int[] nArray = new int[lIIIllIlII[1]];
                                nArray[Q.lIIIllIlII[0]] = lIIIllIlII[2];
                                if (!Q.lllIllllIlII(Inventory.getCount((int[])nArray))) break block31;
                            }
                            if (Q.lllIllllIlIl(lllllIIIIll = BankLocation.getNearest()) && Q.lllIllllIIll(lllllIIIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[3]];
                                a.a(lllllIIIIll);
                            }
                            if (!Q.lllIllllIlIl(lllllIIIIll) || !Q.lllIllllIIIl(lllllIIIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block31;
                            if (Q.lllIllllIIll(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[4]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIllIlII[5]);
                                0;
                            }
                            if (!Q.lllIllllIIIl(Bank.isOpen() ? 1 : 0)) break block31;
                            AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[6]];
                            if (Q.lllIllllIlII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIIllIlII[4]);
                                0;
                            }
                            if (Q.lllIllllIlII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIIllIlII[3]);
                                0;
                            }
                            int[] nArray = new int[lIIIllIlII[1]];
                            nArray[Q.lIIIllIlII[0]] = lIIIllIlII[7];
                            if (!Q.lllIllllIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                            int[] nArray2 = new int[lIIIllIlII[1]];
                            nArray2[Q.lIIIllIlII[0]] = lIIIllIlII[7];
                            if (!Q.lllIllllIllI(Inventory.getCount((int[])nArray2), lIIIllIlII[1])) break block33;
                        }
                        int[] nArray = new int[lIIIllIlII[1]];
                        nArray[Q.lIIIllIlII[0]] = lIIIllIlII[8];
                        if (!Q.lllIllllIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray3 = new int[lIIIllIlII[1]];
                        nArray3[Q.lIIIllIlII[0]] = lIIIllIlII[8];
                        if (!Q.lllIllllIIlI(Inventory.getCount((int[])nArray3), lIIIllIlII[1])) break block34;
                    }
                    Q.af();
                    System.out.println(lIIIllIIll[lIIIllIlII[9]]);
                    bt = lIIIllIlII[1];
                    return;
                }
                int[] nArray = new int[lIIIllIlII[1]];
                nArray[Q.lIIIllIlII[0]] = lIIIllIlII[8];
                if (Q.lllIllllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray4 = new int[lIIIllIlII[1]];
                    nArray4[Q.lIIIllIlII[0]] = lIIIllIlII[8];
                    if (Q.lllIllllIIlI(Inventory.getCount((int[])nArray4), lIIIllIlII[1])) {
                        Bank.withdraw((int)lIIIllIlII[8], (int)lIIIllIlII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIllIlII[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIllIlII[1]];
                            nArray[Q.lIIIllIlII[0]] = lIIIllIlII[8];
                            if (Q.lllIllllIlII(Inventory.getCount((int[])nArray))) {
                                bl = lIIIllIlII[1];
                                0;
                                if (-1 >= 3) {
                                    return ((0xC0 ^ 0xA6 ^ (0x4F ^ 0x3E)) & (20 + 38 - -82 + 14 ^ 46 + 64 - 9 + 40 ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIIllIlII[0];
                            }
                            return bl;
                        }, (int)lIIIllIlII[5]);
                        0;
                    }
                }
                int[] nArray5 = new int[lIIIllIlII[1]];
                nArray5[Q.lIIIllIlII[0]] = lIIIllIlII[7];
                if (Q.lllIllllIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    int[] nArray6 = new int[lIIIllIlII[1]];
                    nArray6[Q.lIIIllIlII[0]] = lIIIllIlII[7];
                    if (Q.lllIllllIIlI(Inventory.getCount((int[])nArray6), lIIIllIlII[1])) {
                        int[] nArray7 = new int[lIIIllIlII[1]];
                        nArray7[Q.lIIIllIlII[0]] = lIIIllIlII[8];
                        if (Q.lllIllllIlII(Inventory.getCount((int[])nArray7))) {
                            Bank.withdrawAll((int)lIIIllIlII[7], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lIIIllIlII[1]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIllIlII[1]];
                                nArray[Q.lIIIllIlII[0]] = lIIIllIlII[7];
                                if (Q.lllIllllIlII(Inventory.getCount((int[])nArray))) {
                                    bl = lIIIllIlII[1];
                                    0;
                                    if (((0xAF ^ 0xB8 ^ (0x64 ^ 0x7F)) & (0x37 ^ 0x71 ^ (0x5C ^ 0x16) ^ -1)) == 3) {
                                        return ((54 + 60 - 0 + 77 ^ 5 + 119 - 16 + 52) & (0x6C ^ 0x7D ^ (3 ^ 0xD) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIIllIlII[0];
                                }
                                return bl;
                            }, (int)lIIIllIlII[5]);
                            0;
                        }
                    }
                }
            }
            if (Q.lllIllllIIIl(Q.ab() ? 1 : 0)) {
                if (Q.lllIllllIIIl(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (Q.lllIllllIIll(Bank.isOpen() ? 1 : 0) && Q.lllIllllIIll(Players.getLocal().isAnimating() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[10]];
                    if (Q.lllIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (Q.lllIllllIIll(Production.isOpen() ? 1 : 0)) {
                        Time.sleepTicks((int)lIIIllIlII[3]);
                        0;
                        int[] nArray = new int[lIIIllIlII[1]];
                        nArray[Q.lIIIllIlII[0]] = lIIIllIlII[8];
                        lllllIIIIll = Inventory.getFirst((int[])nArray);
                        int[] nArray8 = new int[lIIIllIlII[1]];
                        nArray8[Q.lIIIllIlII[0]] = lIIIllIlII[7];
                        Item lllllIIIIlI = Inventory.getFirst((int[])nArray8);
                        if (Q.lllIllllIlIl(lllllIIIIll) && Q.lllIllllIlIl(lllllIIIIlI)) {
                            lllllIIIIll.useOn(lllllIIIIlI);
                            Time.sleepUntil(() -> Production.isOpen(), (int)lIIIllIlII[5]);
                            0;
                        }
                    }
                    if (Q.lllIllllIIIl(Production.isOpen() ? 1 : 0)) {
                        if (Q.lllIllllIIlI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[6])) {
                            AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[11]];
                            Production.chooseOption((String)lIIIllIIll[lIIIllIlII[12]]);
                            Time.sleepTicks((int)lIIIllIlII[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIllIlII[1]];
                                nArray[Q.lIIIllIlII[0]] = lIIIllIlII[7];
                                if (!Q.lllIllllIllI(Inventory.getCount((int[])nArray), lIIIllIlII[1]) || Q.lllIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIIIllIlII[1];
                                    0;
                                    if (((0x55 ^ 0x41) & ~(0x70 ^ 0x64)) > 0) {
                                        return ((0xAD ^ 0xB1) & ~(0x3A ^ 0x26)) != 0;
                                    }
                                } else {
                                    bl = lIIIllIlII[0];
                                }
                                return bl;
                            }, (int)lIIIllIlII[13]);
                            0;
                        }
                        if (Q.lllIllllIllI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[6]) && Q.lllIllllIIlI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[14])) {
                            AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[15]];
                            Production.chooseOption((int)lIIIllIlII[3]);
                            Time.sleepTicks((int)lIIIllIlII[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIllIlII[1]];
                                nArray[Q.lIIIllIlII[0]] = lIIIllIlII[7];
                                if (!Q.lllIllllIllI(Inventory.getCount((int[])nArray), lIIIllIlII[1]) || Q.lllIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIIIllIlII[1];
                                    0;
                                    if (1 <= ((79 + 19 - 30 + 122 ^ 89 + 13 - -81 + 1) & (0x9A ^ 0xBF ^ (0x69 ^ 0x4A) ^ -1))) {
                                        return (1 & (1 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIIllIlII[0];
                                }
                                return bl;
                            }, (int)lIIIllIlII[13]);
                            0;
                        }
                        if (Q.lllIllllIllI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[14]) && Q.lllIllllIIlI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[16])) {
                            AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[17]];
                            Production.chooseOption((String)lIIIllIIll[lIIIllIlII[18]]);
                            Time.sleepTicks((int)lIIIllIlII[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIllIlII[1]];
                                nArray[Q.lIIIllIlII[0]] = lIIIllIlII[7];
                                if (!Q.lllIllllIllI(Inventory.getCount((int[])nArray), lIIIllIlII[1]) || Q.lllIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIIIllIlII[1];
                                    0;
                                    if (null != null) {
                                        return ((0x7F ^ 0x69 ^ (0x55 ^ 0x6E)) & (0xB3 ^ 0x88 ^ (0x85 ^ 0x93) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIIllIlII[0];
                                }
                                return bl;
                            }, (int)lIIIllIlII[13]);
                            0;
                        }
                        if (Q.lllIllllIllI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[16]) && Q.lllIllllIIlI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[19])) {
                            AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[14]];
                            Production.chooseOption((String)lIIIllIIll[lIIIllIlII[20]]);
                            Time.sleepTicks((int)lIIIllIlII[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIllIlII[1]];
                                nArray[Q.lIIIllIlII[0]] = lIIIllIlII[7];
                                if (!Q.lllIllllIllI(Inventory.getCount((int[])nArray), lIIIllIlII[1]) || Q.lllIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIIIllIlII[1];
                                    0;
                                    if (-(0x1A ^ 0x1E) >= 0) {
                                        return ((0x7E ^ 0x2A) & ~(0x1F ^ 0x4B)) != 0;
                                    }
                                } else {
                                    bl = lIIIllIlII[0];
                                }
                                return bl;
                            }, (int)lIIIllIlII[13]);
                            0;
                        }
                        if (Q.lllIllllIllI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[19]) && Q.lllIllllIIlI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[21])) {
                            AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[22]];
                            Production.chooseOption((String)lIIIllIIll[lIIIllIlII[23]]);
                            Time.sleepTicks((int)lIIIllIlII[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIllIlII[1]];
                                nArray[Q.lIIIllIlII[0]] = lIIIllIlII[7];
                                if (!Q.lllIllllIllI(Inventory.getCount((int[])nArray), lIIIllIlII[1]) || Q.lllIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIIIllIlII[1];
                                    0;
                                    if (((0xEC ^ 0x95 ^ (0xE2 ^ 0x9E)) & (0xDF ^ 0xBA ^ (0x7A ^ 0x1A) ^ -1)) > 0) {
                                        return (((0x71 ^ 0x3D) & ~(0x69 ^ 0x25) ^ (1 ^ 0x31)) & (0xF1 ^ 0xB1 ^ (0x60 ^ 0x10) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIIllIlII[0];
                                }
                                return bl;
                            }, (int)lIIIllIlII[13]);
                            0;
                        }
                        if (Q.lllIllllIllI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[21]) && Q.lllIllllIIlI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[24])) {
                            AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[25]];
                            Production.chooseOption((String)lIIIllIIll[lIIIllIlII[26]]);
                            Time.sleepTicks((int)lIIIllIlII[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIllIlII[1]];
                                nArray[Q.lIIIllIlII[0]] = lIIIllIlII[7];
                                if (!Q.lllIllllIllI(Inventory.getCount((int[])nArray), lIIIllIlII[1]) || Q.lllIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIIIllIlII[1];
                                    0;
                                    if (2 <= 0) {
                                        return ((0xEA ^ 0xB4) & ~(0x70 ^ 0x2E)) != 0;
                                    }
                                } else {
                                    bl = lIIIllIlII[0];
                                }
                                return bl;
                            }, (int)lIIIllIlII[13]);
                            0;
                        }
                        if (Q.lllIllllIllI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[24]) && Q.lllIllllIIlI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[27])) {
                            AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[28]];
                            Production.chooseOption((String)lIIIllIIll[lIIIllIlII[29]]);
                            Time.sleepTicks((int)lIIIllIlII[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIllIlII[1]];
                                nArray[Q.lIIIllIlII[0]] = lIIIllIlII[7];
                                if (!Q.lllIllllIllI(Inventory.getCount((int[])nArray), lIIIllIlII[1]) || Q.lllIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIIIllIlII[1];
                                    0;
                                    if (((0x41 ^ 0x4A ^ (0x31 ^ 0x19)) & (75 + 92 - 133 + 94 ^ 43 + 98 - 65 + 87 ^ -1)) > 0) {
                                        return ((24 + 150 - 155 + 134 ^ 139 + 104 - 76 + 27) & (17 + 51 - 48 + 192 ^ 124 + 121 - 193 + 91 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIIllIlII[0];
                                }
                                return bl;
                            }, (int)lIIIllIlII[13]);
                            0;
                        }
                        if (Q.lllIllllIllI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[27])) {
                            AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[30]];
                            Production.chooseOption((String)lIIIllIIll[lIIIllIlII[31]]);
                            Time.sleepTicks((int)lIIIllIlII[10]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIllIlII[1]];
                                nArray[Q.lIIIllIlII[0]] = lIIIllIlII[7];
                                if (!Q.lllIllllIllI(Inventory.getCount((int[])nArray), lIIIllIlII[1]) || Q.lllIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIIIllIlII[1];
                                    0;
                                    if (1 != 1) {
                                        return ((63 + 193 - 184 + 137 ^ 40 + 43 - 21 + 81) & (213 + 0 - 137 + 142 ^ 92 + 75 - 35 + 0 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIIllIlII[0];
                                }
                                return bl;
                            }, (int)lIIIllIlII[13]);
                            0;
                        }
                    }
                }
            }
        }
    }

    @Override
    public boolean S() {
        return lIIIllIlII[0];
    }

    private static boolean lllIllllIlII(int n2) {
        return n2 > 0;
    }

    private static String lllIlllIllII(String llllIllIlII, String llllIllIIll) {
        try {
            SecretKeySpec llllIlllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllIlllIII = Cipher.getInstance("Blowfish");
            llllIlllIII.init(lIIIllIlII[3], llllIlllIIl);
            return new String(llllIlllIII.doFinal(Base64.getDecoder().decode(llllIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIllIlll) {
            llllIllIlll.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (Q.lllIllllIllI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[44])) {
            bl = lIIIllIlII[1];
            0;
            if ((2 ^ 6) != (0xA2 ^ 0xA6)) {
                return ((0xED ^ 0xBC) & ~(0x29 ^ 0x78)) != 0;
            }
        } else {
            bl = lIIIllIlII[0];
        }
        return bl;
    }

    @Override
    public String U() {
        return lIIIllIIll[lIIIllIlII[43]];
    }

    public static void af() {
        d llllIlllllI;
        Object llllIllllll;
        int[] nArray = new int[lIIIllIlII[1]];
        nArray[Q.lIIIllIlII[0]] = lIIIllIlII[7];
        if (Q.lllIllllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            System.out.println(lIIIllIIll[lIIIllIlII[32]]);
            d d2 = new d(lIIIllIlII[7], lIIIllIlII[33], lIIIllIlII[34]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[lIIIllIlII[1]];
        nArray2[Q.lIIIllIlII[0]] = lIIIllIlII[8];
        if (Q.lllIllllIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            System.out.println(lIIIllIIll[lIIIllIlII[35]]);
            llllIllllll = new d(lIIIllIlII[8], lIIIllIlII[1], lIIIllIlII[36]);
            bv.add((d)llllIllllll);
            0;
        }
        if (Q.lllIllllIIll(Bank.contains(llllIllllll = item -> item.getName().toLowerCase().contains(lIIIllIIll[lIIIllIlII[45]])) ? 1 : 0)) {
            llllIlllllI = new d(lIIIllIlII[37], lIIIllIlII[9], lIIIllIlII[38]);
            bv.add(llllIlllllI);
            0;
        }
        int[] nArray3 = new int[lIIIllIlII[1]];
        nArray3[Q.lIIIllIlII[0]] = lIIIllIlII[39];
        if (Q.lllIllllIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llllIlllllI = new d(lIIIllIlII[39], lIIIllIlII[40], lIIIllIlII[41]);
            bv.add(llllIlllllI);
            0;
        }
    }

    private static void lllIllllIIII() {
        lIIIllIlII = new int[47];
        Q.lIIIllIlII[0] = (0xB8 ^ 0x8E ^ (0x5D ^ 0x64)) & (0x42 ^ 0x1E ^ (0x1C ^ 0x4F) ^ -1);
        Q.lIIIllIlII[1] = 1;
        Q.lIIIllIlII[2] = 0xFFFF87E7 & 0x7BFB;
        Q.lIIIllIlII[3] = 2;
        Q.lIIIllIlII[4] = 3;
        Q.lIIIllIlII[5] = -(0xFFFFFFBF & 0x4465) & (0xFFFFF7ED & 0x5FBE);
        Q.lIIIllIlII[6] = 57 + 1 - -5 + 75 ^ 20 + 25 - 44 + 141;
        Q.lIIIllIlII[7] = -(0xFFFFBDD3 & 0x633D) & (0xFFFFA7FF & Short.MAX_VALUE);
        Q.lIIIllIlII[8] = -(0xFFFFF953 & 0x1FAF) & (0xFFFF9FFB & Short.MAX_VALUE);
        Q.lIIIllIlII[9] = 0xB ^ 0x63 ^ (0x7B ^ 0x16);
        Q.lIIIllIlII[10] = 0x42 ^ 6 ^ (0x22 ^ 0x60);
        Q.lIIIllIlII[11] = 0x99 ^ 0x9E;
        Q.lIIIllIlII[12] = 0xAC ^ 0xA4;
        Q.lIIIllIlII[13] = 0xFFFFF699 & 0xEBF6;
        Q.lIIIllIlII[14] = 0x3D ^ 0x31;
        Q.lIIIllIlII[15] = 0x5C ^ 0x55;
        Q.lIIIllIlII[16] = 0x78 ^ 0x36 ^ (0x4A ^ 0x25);
        Q.lIIIllIlII[17] = 0x79 ^ 0x73;
        Q.lIIIllIlII[18] = 0xCA ^ 0xC1;
        Q.lIIIllIlII[19] = 107 + 98 - 83 + 10 ^ 106 + 107 - 106 + 67;
        Q.lIIIllIlII[20] = 0x52 ^ 0x5F;
        Q.lIIIllIlII[21] = 0x95 ^ 0xBB;
        Q.lIIIllIlII[22] = 0xD8 ^ 0xB2 ^ (0x56 ^ 0x32);
        Q.lIIIllIlII[23] = 0x9A ^ 0xB8 ^ (0xAC ^ 0x81);
        Q.lIIIllIlII[24] = 47 + 50 - -12 + 26 ^ 23 + 135 - 26 + 50;
        Q.lIIIllIlII[25] = 0x4F ^ 0x49 ^ (0x1C ^ 0xA);
        Q.lIIIllIlII[26] = 0x77 ^ 0x39 ^ (0xE ^ 0x51);
        Q.lIIIllIlII[27] = 0x22 ^ 0x36 ^ (0x19 ^ 0x5A);
        Q.lIIIllIlII[28] = 0xD5 ^ 0xC7;
        Q.lIIIllIlII[29] = 0x1D ^ 0xE;
        Q.lIIIllIlII[30] = 0x42 ^ 0x28 ^ (0x25 ^ 0x5B);
        Q.lIIIllIlII[31] = 0x82 ^ 0x99 ^ (0x29 ^ 0x27);
        Q.lIIIllIlII[32] = 137 + 51 - 168 + 163 ^ 4 + 73 - -24 + 60;
        Q.lIIIllIlII[33] = -2 & (0xFFFFC73B & 0x3FFF);
        Q.lIIIllIlII[34] = 0x6B ^ 0x60 ^ (5 ^ 0x60);
        Q.lIIIllIlII[35] = 0x85 ^ 0x92;
        Q.lIIIllIlII[36] = -(0xFFFFFB5F & 0x6CA6) & (0xFFFFFDEF & Short.MAX_VALUE);
        Q.lIIIllIlII[37] = -(0xFFFFFF97 & 0x1179) & (0xFFFFBFDF & 0x7FFC);
        Q.lIIIllIlII[38] = 0xFFFFF9EF & 0x67B8;
        Q.lIIIllIlII[39] = 0xFFFF9FC7 & 0x7F7F;
        Q.lIIIllIlII[40] = 0xF1 ^ 0x92 ^ (0xF2 ^ 0xB9);
        Q.lIIIllIlII[41] = 0xFFFF9397 & 0x6FEC;
        Q.lIIIllIlII[42] = 0x73 ^ 0x48 ^ (0x46 ^ 0x19);
        Q.lIIIllIlII[43] = 0xA6 ^ 0xBE;
        Q.lIIIllIlII[44] = 8 ^ 0x19 ^ (0 ^ 0x72);
        Q.lIIIllIlII[45] = 9 + 146 - 50 + 68 ^ 36 + 107 - 68 + 105;
        Q.lIIIllIlII[46] = 0xB6 ^ 0xAC;
    }

    private static boolean lllIllllIIIl(int n2) {
        return n2 != 0;
    }

    static {
        Q.lllIllllIIII();
        Q.lllIlllIlllI();
        jo = lIIIllIlII[8];
        jn = lIIIllIlII[7];
        bv = new ArrayList<d>();
    }

    @Override
    public int T() {
        Q.cT();
        return lIIIllIlII[42];
    }

    private static boolean lllIllllIlIl(Object object) {
        return object != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean ab() {
        int n2;
        int[] nArray = new int[lIIIllIlII[1]];
        nArray[Q.lIIIllIlII[0]] = lIIIllIlII[7];
        if (Q.lllIllllIlII(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[lIIIllIlII[1]];
            nArray2[Q.lIIIllIlII[0]] = lIIIllIlII[8];
            if (Q.lllIllllIlII(Inventory.getCount((int[])nArray2))) {
                n2 = lIIIllIlII[1];
                0;
                if ((0x72 ^ 0x77) != 0) return n2 != 0;
                return ((0x10 ^ 0x5F) & ~(0xA ^ 0x45)) != 0;
            }
        }
        n2 = lIIIllIlII[0];
        return n2 != 0;
    }

    private static String lllIlllIllIl(String llllIIlIlII, String llllIIlIIll) {
        llllIIlIlII = new String(Base64.getDecoder().decode(llllIIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllIIlIlll = new StringBuilder();
        char[] llllIIlIllI = llllIIlIIll.toCharArray();
        int llllIIlIlIl = lIIIllIlII[0];
        char[] llllIIIllll = llllIIlIlII.toCharArray();
        int llllIIIlllI = llllIIIllll.length;
        int llllIIIllIl = lIIIllIlII[0];
        while (Q.lllIllllIIlI(llllIIIllIl, llllIIIlllI)) {
            char llllIIllIlI = llllIIIllll[llllIIIllIl];
            llllIIlIlll.append((char)(llllIIllIlI ^ llllIIlIllI[llllIIlIlIl % llllIIlIllI.length]));
            0;
            ++llllIIlIlIl;
            ++llllIIIllIl;
            0;
            if ((67 + 96 - 54 + 24 ^ 28 + 4 - -59 + 38) != 2) continue;
            return null;
        }
        return String.valueOf(llllIIlIlll);
    }

    private static boolean lllIllllIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllIllllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lllIlllIlllI() {
        lIIIllIIll = new String[lIIIllIlII[46]];
        Q.lIIIllIIll[Q.lIIIllIlII[0]] = Q."Buying items";
        Q.lIIIllIIll[Q.lIIIllIlII[1]] = Q."Finished buying items, switching back to crafting";
        Q.lIIIllIIll[Q.lIIIllIlII[3]] = Q."Navigating to bank";
        Q.lIIIllIIll[Q.lIIIllIlII[4]] = Q."Opening bank";
        Q.lIIIllIIll[Q.lIIIllIlII[6]] = Q."Handling banking";
        Q.lIIIllIIll[Q.lIIIllIlII[9]] = Q."We are missing supplies, switching to BUYING";
        Q.lIIIllIIll[Q.lIIIllIlII[10]] = Q."Crafting ";
        Q.lIIIllIIll[Q.lIIIllIlII[11]] = Q."Crafting glass";
        Q.lIIIllIIll[Q.lIIIllIlII[12]] = Q."Beer glass";
        Q.lIIIllIIll[Q.lIIIllIlII[15]] = Q."Crafting candle lantern";
        Q.lIIIllIIll[Q.lIIIllIlII[17]] = Q."Crafting lamp";
        Q.lIIIllIIll[Q.lIIIllIlII[18]] = Q."Oil lamp";
        Q.lIIIllIIll[Q.lIIIllIlII[14]] = Q."Crafting vial";
        Q.lIIIllIIll[Q.lIIIllIlII[20]] = Q."Vial";
        Q.lIIIllIIll[Q.lIIIllIlII[22]] = Q."Crafting fishbowl";
        Q.lIIIllIIll[Q.lIIIllIlII[23]] = Q."Fishbowl";
        Q.lIIIllIIll[Q.lIIIllIlII[25]] = Q."Crafting orb";
        Q.lIIIllIIll[Q.lIIIllIlII[26]] = Q."Unpowered staff orb";
        Q.lIIIllIIll[Q.lIIIllIlII[28]] = Q."Crafting lens";
        Q.lIIIllIIll[Q.lIIIllIlII[29]] = Q."Lantern lens";
        Q.lIIIllIIll[Q.lIIIllIlII[30]] = Q."Crafting light orb";
        Q.lIIIllIIll[Q.lIIIllIlII[31]] = Q."Light orb";
        Q.lIIIllIIll[Q.lIIIllIlII[32]] = Q."Buying molten glass";
        Q.lIIIllIIll[Q.lIIIllIlII[35]] = Q."Buying glassblowing pipe";
        Q.lIIIllIIll[Q.lIIIllIlII[43]] = Q."Crafting";
        Q.lIIIllIIll[Q.lIIIllIlII[45]] = Q."ring of wealth (";
    }

    private static String lllIlllIlIll(String llllIlIlIIl, String llllIlIIllI) {
        try {
            SecretKeySpec llllIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIlIIllI.getBytes(StandardCharsets.UTF_8)), lIIIllIlII[12]), "DES");
            Cipher llllIlIlIll = Cipher.getInstance("DES");
            llllIlIlIll.init(lIIIllIlII[3], llllIlIllII);
            return new String(llllIlIlIll.doFinal(Base64.getDecoder().decode(llllIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIlIlIlI) {
            llllIlIlIlI.printStackTrace();
            return null;
        }
    }
}

