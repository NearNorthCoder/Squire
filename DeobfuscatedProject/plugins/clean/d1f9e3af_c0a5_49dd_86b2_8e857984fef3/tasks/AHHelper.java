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

public class AHHelper
implements W {
    public static  boolean bt;
    
    public static final  int lQ;
    public static  List<d> bv;
    public static final  int lP;

    private static boolean lIIIlllIIIll(int n2) {
        return n2 > 0;
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
            d d2 = new DHelper(lIlIlIIII[7], lIlIlIIII[33], lIlIlIIII[34]);
            bv.add(d2);

        }
        int[] nArray2 = new int[lIlIlIIII[1]];
        nArray2[ah.lIlIlIIII[0]] = lIlIlIIII[8];
        if (ah.lIIIlllIIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            System.out.println(lIlIIllll[lIlIlIIII[35]]);
            lllIlIlIIIlIll = new DHelper(lIlIlIIII[8], lIlIlIIII[1], lIlIlIIII[36]);
            bv.add((DHelper) llIlIlIIIlIll);

        }
        if (ah.lIIIlllIIIlI(Bank.contains(lllIlIlIIIlIll = item -> item.getName().toLowerCase().contains(lIlIIllll[lIlIlIIII[45]])) ? 1 : 0)) {
            lllIlIlIIIlIlI = new DHelper(lIlIlIIII[37], lIlIlIIII[9], lIlIlIIII[38]);
            bv.add(lllIlIlIIIlIlI);

        }
        int[] nArray3 = new int[lIlIlIIII[1]];
        nArray3[ah.lIlIlIIII[0]] = lIlIlIIII[39];
        if (ah.lIIIlllIIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllIlIlIIIlIlI = new DHelper(lIlIlIIII[39], lIlIlIIII[40], lIlIlIIII[41]);
            bv.add(lllIlIlIIIlIlI);

        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (ah.lIIIlllIIlIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[44])) {
            bl = lIlIlIIII[1];

        } else {
            bl = lIlIlIIII[0];
        }
        return bl;
    }

    private static boolean lIIIlllIIIII(int n2) {
        return n2 != 0;
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

                if (-3 < 0) return n2 != 0;
                return false;
            }
        }
        n2 = lIlIlIIII[0];
        return n2 != 0;
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

                            }
                            if (!ah.lIIIlllIIIII(Bank.isOpen() ? 1 : 0)) break block31;
                            AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[6]];
                            if (ah.lIIIlllIIIll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIlIlIIII[4]);

                            }
                            if (ah.lIIIlllIIIll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIlIlIIII[3]);

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

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlIlIIII[1]];
                            nArray[ah.lIlIlIIII[0]] = lIlIlIIII[8];
                            if (ah.lIIIlllIIIll(Inventory.getCount((int[])nArray))) {
                                bl = lIlIlIIII[1];

                                if (1 == 3) {
                                    return ((0xE4 ^ 0x80 ^ (0x2F ^ 0x6E)) & (0x91 ^ 0xAA ^ (0x8E ^ 0x90) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIlIlIIII[0];
                            }
                            return bl;
                        }, (int)lIlIlIIII[5]);

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

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIlIlIIII[1]];
                                nArray[ah.lIlIlIIII[0]] = lIlIlIIII[7];
                                if (ah.lIIIlllIIIll(Inventory.getCount((int[])nArray))) {
                                    bl = lIlIlIIII[1];

                                    if ((0x74 ^ 0x6D ^ (0x3F ^ 0x22)) != (150 + 130 - 130 + 8 ^ 37 + 69 - 38 + 86)) {
                                        return ((0xD6 ^ 0x87 ^ (0x71 ^ 0x39)) & (0x22 ^ 0x66 ^ (0x7B ^ 0x26) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIlIlIIII[0];
                                }
                                return bl;
                            }, (int)lIlIlIIII[5]);

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

                        int[] nArray = new int[lIlIlIIII[1]];
                        nArray[ah.lIlIlIIII[0]] = lIlIlIIII[8];
                        lllIlIlIIIllll = Inventory.getFirst((int[])nArray);
                        int[] nArray8 = new int[lIlIlIIII[1]];
                        nArray8[ah.lIlIlIIII[0]] = lIlIlIIII[7];
                        Item lllIlIlIIIlllI = Inventory.getFirst((int[])nArray8);
                        if (ah.lIIIlllIIlII(lllIlIlIIIllll) && ah.lIIIlllIIlII(lllIlIlIIIlllI)) {
                            lllIlIlIIIllll.useOn(lllIlIlIIIlllI);
                            Time.sleepUntil(() -> Production.isOpen(), (int)lIlIlIIII[5]);

                        }
                    }
                    if (ah.lIIIlllIIIII(Production.isOpen() ? 1 : 0)) {
                        if (ah.lIIIlllIIIIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[6])) {
                            AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[11]];
                            Production.chooseOption((String)lIlIIllll[lIlIlIIII[12]]);
                            Time.sleepTicks((int)lIlIlIIII[10]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIlIlIIII[1]];
                                nArray[ah.lIlIlIIII[0]] = lIlIlIIII[7];
                                if (!ah.lIIIlllIIlIl(Inventory.getCount((int[])nArray), lIlIlIIII[1]) || ah.lIIIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIlIlIIII[1];

                                } else {
                                    bl = lIlIlIIII[0];
                                }
                                return bl;
                            }, (int)lIlIlIIII[13]);

                        }
                        if (ah.lIIIlllIIlIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[6]) && ah.lIIIlllIIIIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[14])) {
                            AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[15]];
                            Production.chooseOption((int)lIlIlIIII[3]);
                            Time.sleepTicks((int)lIlIlIIII[10]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIlIlIIII[1]];
                                nArray[ah.lIlIlIIII[0]] = lIlIlIIII[7];
                                if (!ah.lIIIlllIIlIl(Inventory.getCount((int[])nArray), lIlIlIIII[1]) || ah.lIIIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIlIlIIII[1];

                                    if ((84 + 44 - 120 + 138 ^ 31 + 39 - -34 + 46) == 2) {
                                        return ((0xCE ^ 0xC0 ^ (8 ^ 0xE)) & (0xF ^ 0x2E ^ (0x4F ^ 0x66) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIlIlIIII[0];
                                }
                                return bl;
                            }, (int)lIlIlIIII[13]);

                        }
                        if (ah.lIIIlllIIlIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[14]) && ah.lIIIlllIIIIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[16])) {
                            AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[17]];
                            Production.chooseOption((String)lIlIIllll[lIlIlIIII[18]]);
                            Time.sleepTicks((int)lIlIlIIII[10]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIlIlIIII[1]];
                                nArray[ah.lIlIlIIII[0]] = lIlIlIIII[7];
                                if (!ah.lIIIlllIIlIl(Inventory.getCount((int[])nArray), lIlIlIIII[1]) || ah.lIIIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIlIlIIII[1];

                                } else {
                                    bl = lIlIlIIII[0];
                                }
                                return bl;
                            }, (int)lIlIlIIII[13]);

                        }
                        if (ah.lIIIlllIIlIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[16]) && ah.lIIIlllIIIIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[19])) {
                            AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[14]];
                            Production.chooseOption((String)lIlIIllll[lIlIlIIII[20]]);
                            Time.sleepTicks((int)lIlIlIIII[10]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIlIlIIII[1]];
                                nArray[ah.lIlIlIIII[0]] = lIlIlIIII[7];
                                if (!ah.lIIIlllIIlIl(Inventory.getCount((int[])nArray), lIlIlIIII[1]) || ah.lIIIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIlIlIIII[1];

                                    if (-1 > 3) {
                                        return ((0x3D ^ 0x43 ^ (0xA2 ^ 0x8B)) & (161 + 71 - 102 + 83 ^ 60 + 24 - -23 + 23 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIlIlIIII[0];
                                }
                                return bl;
                            }, (int)lIlIlIIII[13]);

                        }
                        if (ah.lIIIlllIIlIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[19]) && ah.lIIIlllIIIIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[21])) {
                            AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[22]];
                            Production.chooseOption((String)lIlIIllll[lIlIlIIII[23]]);
                            Time.sleepTicks((int)lIlIlIIII[10]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIlIlIIII[1]];
                                nArray[ah.lIlIlIIII[0]] = lIlIlIIII[7];
                                if (!ah.lIIIlllIIlIl(Inventory.getCount((int[])nArray), lIlIlIIII[1]) || ah.lIIIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIlIlIIII[1];

                                } else {
                                    bl = lIlIlIIII[0];
                                }
                                return bl;
                            }, (int)lIlIlIIII[13]);

                        }
                        if (ah.lIIIlllIIlIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[21]) && ah.lIIIlllIIIIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[24])) {
                            AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[25]];
                            Production.chooseOption((String)lIlIIllll[lIlIlIIII[26]]);
                            Time.sleepTicks((int)lIlIlIIII[10]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIlIlIIII[1]];
                                nArray[ah.lIlIlIIII[0]] = lIlIlIIII[7];
                                if (!ah.lIIIlllIIlIl(Inventory.getCount((int[])nArray), lIlIlIIII[1]) || ah.lIIIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIlIlIIII[1];

                                    if ((0x86 ^ 0x82) < 2) {
                                        return false;
                                    }
                                } else {
                                    bl = lIlIlIIII[0];
                                }
                                return bl;
                            }, (int)lIlIlIIII[13]);

                        }
                        if (ah.lIIIlllIIlIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[24]) && ah.lIIIlllIIIIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[27])) {
                            AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[28]];
                            Production.chooseOption((String)lIlIIllll[lIlIlIIII[29]]);
                            Time.sleepTicks((int)lIlIlIIII[10]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIlIlIIII[1]];
                                nArray[ah.lIlIlIIII[0]] = lIlIlIIII[7];
                                if (!ah.lIIIlllIIlIl(Inventory.getCount((int[])nArray), lIlIlIIII[1]) || ah.lIIIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIlIlIIII[1];

                                    }
                                } else {
                                    bl = lIlIlIIII[0];
                                }
                                return bl;
                            }, (int)lIlIlIIII[13]);

                        }
                        if (ah.lIIIlllIIlIl(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlIIII[27])) {
                            AccBuilderEasyClues.c = lIlIIllll[lIlIlIIII[30]];
                            Production.chooseOption((String)lIlIIllll[lIlIlIIII[31]]);
                            Time.sleepTicks((int)lIlIlIIII[10]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIlIlIIII[1]];
                                nArray[ah.lIlIlIIII[0]] = lIlIlIIII[7];
                                if (!ah.lIIIlllIIlIl(Inventory.getCount((int[])nArray), lIlIlIIII[1]) || ah.lIIIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIlIlIIII[1];

                                    }
                                } else {
                                    bl = lIlIlIIII[0];
                                }
                                return bl;
                            }, (int)lIlIlIIII[13]);

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

        return String.valueOf(lllIlIIlllllIl);
    }

    private static boolean lIIIlllIIIlI(int n2) {
        return n2 == 0;
    }

    private static void lIIIllIllllI() {
        lIlIIllll = new String[lIlIlIIII[46]];
        ah.lIlIIllll[ah.lIlIlIIII[0]] = "Buying items";
        ah.lIlIIllll[ah.lIlIlIIII[1]] = "Finished buying items, switching back to crafting";
        ah.lIlIIllll[ah.lIlIlIIII[3]] = "Navigating to bank";
        ah.lIlIIllll[ah.lIlIlIIII[4]] = "Opening bank";
        ah.lIlIIllll[ah.lIlIlIIII[6]] = "Handling banking";
        ah.lIlIIllll[ah.lIlIlIIII[9]] = "We are missing supplies, switching to BUYING";
        ah.lIlIIllll[ah.lIlIlIIII[10]] = "Crafting ";
        ah.lIlIIllll[ah.lIlIlIIII[11]] = "Crafting glass";
        ah.lIlIIllll[ah.lIlIlIIII[12]] = "Beer glass";
        ah.lIlIIllll[ah.lIlIlIIII[15]] = "Crafting candle lantern";
        ah.lIlIIllll[ah.lIlIlIIII[17]] = "Crafting lamp";
        ah.lIlIIllll[ah.lIlIlIIII[18]] = "Oil lamp";
        ah.lIlIIllll[ah.lIlIlIIII[14]] = "Crafting vial";
        ah.lIlIIllll[ah.lIlIlIIII[20]] = "Vial";
        ah.lIlIIllll[ah.lIlIlIIII[22]] = "Crafting fishbowl";
        ah.lIlIIllll[ah.lIlIlIIII[23]] = "Fishbowl";
        ah.lIlIIllll[ah.lIlIlIIII[25]] = "Crafting orb";
        ah.lIlIIllll[ah.lIlIlIIII[26]] = "Unpowered staff orb";
        ah.lIlIIllll[ah.lIlIlIIII[28]] = "Crafting lens";
        ah.lIlIIllll[ah.lIlIlIIII[29]] = "Lantern lens";
        ah.lIlIIllll[ah.lIlIlIIII[30]] = "Crafting light orb";
        ah.lIlIIllll[ah.lIlIlIIII[31]] = "Light orb";
        ah.lIlIIllll[ah.lIlIlIIII[32]] = "Buying molten glass";
        ah.lIlIIllll[ah.lIlIlIIII[35]] = "Buying glassblowing pipe";
        ah.lIlIIllll[ah.lIlIlIIII[43]] = "Crafting";
        ah.lIlIIllll[ah.lIlIlIIII[45]] = "ring of wealth (";
    }

    private static boolean lIIIlllIIlII(Object object) {
        return object != null;
    }

    private static boolean lIIIlllIIlIl(int n2, int n3) {
        return n2 >= n3;
    }
}

