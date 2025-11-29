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
package gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.AHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.BHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.DHelper;
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

public class QHelper
implements G {
    public static final  int jo;
    public static  boolean bt;
    
    public static final  int jn;
    
    public static  List<d> bv;

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

                            }
                            if (!Q.lllIllllIIIl(Bank.isOpen() ? 1 : 0)) break block31;
                            AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[6]];
                            if (Q.lllIllllIlII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIIllIlII[4]);

                            }
                            if (Q.lllIllllIlII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIIllIlII[3]);

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

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIllIlII[1]];
                            nArray[Q.lIIIllIlII[0]] = lIIIllIlII[8];
                            if (Q.lllIllllIlII(Inventory.getCount((int[])nArray))) {
                                bl = lIIIllIlII[1];

                                if (-1 >= 3) {
                                    return ((0xC0 ^ 0xA6 ^ (0x4F ^ 0x3E)) & (20 + 38 - -82 + 14 ^ 46 + 64 - 9 + 40 ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIIllIlII[0];
                            }
                            return bl;
                        }, (int)lIIIllIlII[5]);

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

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIllIlII[1]];
                                nArray[Q.lIIIllIlII[0]] = lIIIllIlII[7];
                                if (Q.lllIllllIlII(Inventory.getCount((int[])nArray))) {
                                    bl = lIIIllIlII[1];

                                    if (((0xAF ^ 0xB8 ^ (0x64 ^ 0x7F)) & (0x37 ^ 0x71 ^ (0x5C ^ 0x16) ^ -1)) == 3) {
                                        return ((54 + 60 - 0 + 77 ^ 5 + 119 - 16 + 52) & (0x6C ^ 0x7D ^ (3 ^ 0xD) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIIllIlII[0];
                                }
                                return bl;
                            }, (int)lIIIllIlII[5]);

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

                        int[] nArray = new int[lIIIllIlII[1]];
                        nArray[Q.lIIIllIlII[0]] = lIIIllIlII[8];
                        lllllIIIIll = Inventory.getFirst((int[])nArray);
                        int[] nArray8 = new int[lIIIllIlII[1]];
                        nArray8[Q.lIIIllIlII[0]] = lIIIllIlII[7];
                        Item lllllIIIIlI = Inventory.getFirst((int[])nArray8);
                        if (Q.lllIllllIlIl(lllllIIIIll) && Q.lllIllllIlIl(lllllIIIIlI)) {
                            lllllIIIIll.useOn(lllllIIIIlI);
                            Time.sleepUntil(() -> Production.isOpen(), (int)lIIIllIlII[5]);

                        }
                    }
                    if (Q.lllIllllIIIl(Production.isOpen() ? 1 : 0)) {
                        if (Q.lllIllllIIlI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[6])) {
                            AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[11]];
                            Production.chooseOption((String)lIIIllIIll[lIIIllIlII[12]]);
                            Time.sleepTicks((int)lIIIllIlII[10]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIllIlII[1]];
                                nArray[Q.lIIIllIlII[0]] = lIIIllIlII[7];
                                if (!Q.lllIllllIllI(Inventory.getCount((int[])nArray), lIIIllIlII[1]) || Q.lllIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIIIllIlII[1];

                                    if (((0x55 ^ 0x41) & ~(0x70 ^ 0x64)) > 0) {
                                        return false;
                                    }
                                } else {
                                    bl = lIIIllIlII[0];
                                }
                                return bl;
                            }, (int)lIIIllIlII[13]);

                        }
                        if (Q.lllIllllIllI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[6]) && Q.lllIllllIIlI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[14])) {
                            AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[15]];
                            Production.chooseOption((int)lIIIllIlII[3]);
                            Time.sleepTicks((int)lIIIllIlII[10]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIllIlII[1]];
                                nArray[Q.lIIIllIlII[0]] = lIIIllIlII[7];
                                if (!Q.lllIllllIllI(Inventory.getCount((int[])nArray), lIIIllIlII[1]) || Q.lllIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIIIllIlII[1];

                                    if (1 <= ((79 + 19 - 30 + 122 ^ 89 + 13 - -81 + 1) & (0x9A ^ 0xBF ^ (0x69 ^ 0x4A) ^ -1))) {
                                        return (1 & (1 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIIllIlII[0];
                                }
                                return bl;
                            }, (int)lIIIllIlII[13]);

                        }
                        if (Q.lllIllllIllI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[14]) && Q.lllIllllIIlI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[16])) {
                            AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[17]];
                            Production.chooseOption((String)lIIIllIIll[lIIIllIlII[18]]);
                            Time.sleepTicks((int)lIIIllIlII[10]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIllIlII[1]];
                                nArray[Q.lIIIllIlII[0]] = lIIIllIlII[7];
                                if (!Q.lllIllllIllI(Inventory.getCount((int[])nArray), lIIIllIlII[1]) || Q.lllIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIIIllIlII[1];

                                    }
                                } else {
                                    bl = lIIIllIlII[0];
                                }
                                return bl;
                            }, (int)lIIIllIlII[13]);

                        }
                        if (Q.lllIllllIllI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[16]) && Q.lllIllllIIlI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[19])) {
                            AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[14]];
                            Production.chooseOption((String)lIIIllIIll[lIIIllIlII[20]]);
                            Time.sleepTicks((int)lIIIllIlII[10]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIllIlII[1]];
                                nArray[Q.lIIIllIlII[0]] = lIIIllIlII[7];
                                if (!Q.lllIllllIllI(Inventory.getCount((int[])nArray), lIIIllIlII[1]) || Q.lllIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIIIllIlII[1];

                                    if (-(0x1A ^ 0x1E) >= 0) {
                                        return false;
                                    }
                                } else {
                                    bl = lIIIllIlII[0];
                                }
                                return bl;
                            }, (int)lIIIllIlII[13]);

                        }
                        if (Q.lllIllllIllI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[19]) && Q.lllIllllIIlI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[21])) {
                            AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[22]];
                            Production.chooseOption((String)lIIIllIIll[lIIIllIlII[23]]);
                            Time.sleepTicks((int)lIIIllIlII[10]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIllIlII[1]];
                                nArray[Q.lIIIllIlII[0]] = lIIIllIlII[7];
                                if (!Q.lllIllllIllI(Inventory.getCount((int[])nArray), lIIIllIlII[1]) || Q.lllIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIIIllIlII[1];

                                    if (((0xEC ^ 0x95 ^ (0xE2 ^ 0x9E)) & (0xDF ^ 0xBA ^ (0x7A ^ 0x1A) ^ -1)) > 0) {
                                        return (((0x71 ^ 0x3D) & ~(0x69 ^ 0x25) ^ (1 ^ 0x31)) & (0xF1 ^ 0xB1 ^ (0x60 ^ 0x10) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIIllIlII[0];
                                }
                                return bl;
                            }, (int)lIIIllIlII[13]);

                        }
                        if (Q.lllIllllIllI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[21]) && Q.lllIllllIIlI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[24])) {
                            AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[25]];
                            Production.chooseOption((String)lIIIllIIll[lIIIllIlII[26]]);
                            Time.sleepTicks((int)lIIIllIlII[10]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIllIlII[1]];
                                nArray[Q.lIIIllIlII[0]] = lIIIllIlII[7];
                                if (!Q.lllIllllIllI(Inventory.getCount((int[])nArray), lIIIllIlII[1]) || Q.lllIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIIIllIlII[1];

                                    if (2 <= 0) {
                                        return false;
                                    }
                                } else {
                                    bl = lIIIllIlII[0];
                                }
                                return bl;
                            }, (int)lIIIllIlII[13]);

                        }
                        if (Q.lllIllllIllI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[24]) && Q.lllIllllIIlI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[27])) {
                            AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[28]];
                            Production.chooseOption((String)lIIIllIIll[lIIIllIlII[29]]);
                            Time.sleepTicks((int)lIIIllIlII[10]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIllIlII[1]];
                                nArray[Q.lIIIllIlII[0]] = lIIIllIlII[7];
                                if (!Q.lllIllllIllI(Inventory.getCount((int[])nArray), lIIIllIlII[1]) || Q.lllIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIIIllIlII[1];

                                    if (((0x41 ^ 0x4A ^ (0x31 ^ 0x19)) & (75 + 92 - 133 + 94 ^ 43 + 98 - 65 + 87 ^ -1)) > 0) {
                                        return false;
                                    }
                                } else {
                                    bl = lIIIllIlII[0];
                                }
                                return bl;
                            }, (int)lIIIllIlII[13]);

                        }
                        if (Q.lllIllllIllI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[27])) {
                            AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[30]];
                            Production.chooseOption((String)lIIIllIIll[lIIIllIlII[31]]);
                            Time.sleepTicks((int)lIIIllIlII[10]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIllIlII[1]];
                                nArray[Q.lIIIllIlII[0]] = lIIIllIlII[7];
                                if (!Q.lllIllllIllI(Inventory.getCount((int[])nArray), lIIIllIlII[1]) || Q.lllIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIIIllIlII[1];

                                    if (1 != 1) {
                                        return false;
                                    }
                                } else {
                                    bl = lIIIllIlII[0];
                                }
                                return bl;
                            }, (int)lIIIllIlII[13]);

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

    @Override
    public boolean V() {
        boolean bl;
        if (Q.lllIllllIllI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIlII[44])) {
            bl = lIIIllIlII[1];

            if ((2 ^ 6) != (0xA2 ^ 0xA6)) {
                return false;
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
            d d2 = new DHelper(lIIIllIlII[7], lIIIllIlII[33], lIIIllIlII[34]);
            bv.add(d2);

        }
        int[] nArray2 = new int[lIIIllIlII[1]];
        nArray2[Q.lIIIllIlII[0]] = lIIIllIlII[8];
        if (Q.lllIllllIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            System.out.println(lIIIllIIll[lIIIllIlII[35]]);
            llllIllllll = new DHelper(lIIIllIlII[8], lIIIllIlII[1], lIIIllIlII[36]);
            bv.add((DHelper) lllIllllll);

        }
        if (Q.lllIllllIIll(Bank.contains(llllIllllll = item -> item.getName().toLowerCase().contains(lIIIllIIll[lIIIllIlII[45]])) ? 1 : 0)) {
            llllIlllllI = new DHelper(lIIIllIlII[37], lIIIllIlII[9], lIIIllIlII[38]);
            bv.add(llllIlllllI);

        }
        int[] nArray3 = new int[lIIIllIlII[1]];
        nArray3[Q.lIIIllIlII[0]] = lIIIllIlII[39];
        if (Q.lllIllllIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llllIlllllI = new DHelper(lIIIllIlII[39], lIIIllIlII[40], lIIIllIlII[41]);
            bv.add(llllIlllllI);

        }
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

                if ((0x72 ^ 0x77) != 0) return n2 != 0;
                return false;
            }
        }
        n2 = lIIIllIlII[0];
        return n2 != 0;
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
        Q.lIIIllIIll[Q.lIIIllIlII[0]] = "Buying items";
        Q.lIIIllIIll[Q.lIIIllIlII[1]] = "Finished buying items, switching back to crafting";
        Q.lIIIllIIll[Q.lIIIllIlII[3]] = "Navigating to bank";
        Q.lIIIllIIll[Q.lIIIllIlII[4]] = "Opening bank";
        Q.lIIIllIIll[Q.lIIIllIlII[6]] = "Handling banking";
        Q.lIIIllIIll[Q.lIIIllIlII[9]] = "We are missing supplies, switching to BUYING";
        Q.lIIIllIIll[Q.lIIIllIlII[10]] = "Crafting ";
        Q.lIIIllIIll[Q.lIIIllIlII[11]] = "Crafting glass";
        Q.lIIIllIIll[Q.lIIIllIlII[12]] = "Beer glass";
        Q.lIIIllIIll[Q.lIIIllIlII[15]] = "Crafting candle lantern";
        Q.lIIIllIIll[Q.lIIIllIlII[17]] = "Crafting lamp";
        Q.lIIIllIIll[Q.lIIIllIlII[18]] = "Oil lamp";
        Q.lIIIllIIll[Q.lIIIllIlII[14]] = "Crafting vial";
        Q.lIIIllIIll[Q.lIIIllIlII[20]] = "Vial";
        Q.lIIIllIIll[Q.lIIIllIlII[22]] = "Crafting fishbowl";
        Q.lIIIllIIll[Q.lIIIllIlII[23]] = "Fishbowl";
        Q.lIIIllIIll[Q.lIIIllIlII[25]] = "Crafting orb";
        Q.lIIIllIIll[Q.lIIIllIlII[26]] = "Unpowered staff orb";
        Q.lIIIllIIll[Q.lIIIllIlII[28]] = "Crafting lens";
        Q.lIIIllIIll[Q.lIIIllIlII[29]] = "Lantern lens";
        Q.lIIIllIIll[Q.lIIIllIlII[30]] = "Crafting light orb";
        Q.lIIIllIIll[Q.lIIIllIlII[31]] = "Light orb";
        Q.lIIIllIIll[Q.lIIIllIlII[32]] = "Buying molten glass";
        Q.lIIIllIIll[Q.lIIIllIlII[35]] = "Buying glassblowing pipe";
        Q.lIIIllIIll[Q.lIIIllIlII[43]] = "Crafting";
        Q.lIIIllIIll[Q.lIIIllIlII[45]] = "ring of wealth (";
    }

}

