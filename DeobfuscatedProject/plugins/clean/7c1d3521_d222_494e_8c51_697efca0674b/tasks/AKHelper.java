/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.IHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;

public class AKHelper
implements ac {
    static  WorldPoint ck;
    static  WorldPoint cl;
    
    public static  List<d> bv;
    
    public static  boolean ci;
    public static  boolean bt;
    static  WorldArea cj;

    public static boolean ap() {
        if (ak.lIlllIIlllIII(Vars.getBit((int)llIlllIIll[48]), llIlllIIll[1]) && ak.lIlllIIllIIll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[19])) {
            return llIlllIIll[1];
        }
        if (ak.lIlllIIlllIII(Vars.getBit((int)llIlllIIll[48]), llIlllIIll[3]) && ak.lIlllIIllIIll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[32]) && ak.lIlllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[19])) {
            return llIlllIIll[1];
        }
        if (ak.lIlllIIlllIII(Vars.getBit((int)llIlllIIll[48]), llIlllIIll[4]) && ak.lIlllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[32]) && ak.lIlllIIllIIll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[39])) {
            return llIlllIIll[1];
        }
        if (ak.lIlllIIlllIII(Vars.getBit((int)llIlllIIll[48]), llIlllIIll[4]) && ak.lIlllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[32])) {
            int[] nArray = new int[llIlllIIll[1]];
            nArray[ak.llIlllIIll[0]] = llIlllIIll[14];
            if (ak.lIlllIIllIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return llIlllIIll[1];
            }
        }
        if (ak.lIlllIIlllIII(Vars.getBit((int)llIlllIIll[48]), llIlllIIll[7]) && ak.lIlllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[39])) {
            int[] nArray = new int[llIlllIIll[1]];
            nArray[ak.llIlllIIll[0]] = llIlllIIll[14];
            if (ak.lIlllIIllIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return llIlllIIll[1];
            }
        }
        return llIlllIIll[0];
    }

    private static boolean lIlllIIllIlII(int n2) {
        return n2 == 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        block29: {
            block28: {
                block25: {
                    int n3;
                    block27: {
                        block26: {
                            block22: {
                                int n4;
                                block23: {
                                    block24: {
                                        block19: {
                                            int n5;
                                            block20: {
                                                block21: {
                                                    if (!ak.lIlllIIllIIll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[21])) break block19;
                                                    int[] nArray = new int[llIlllIIll[1]];
                                                    nArray[ak.llIlllIIll[0]] = llIlllIIll[9];
                                                    if (!ak.lIlllIIllIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[llIlllIIll[1]];
                                                    nArray2[ak.llIlllIIll[0]] = llIlllIIll[13];
                                                    if (!ak.lIlllIIllIIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[llIlllIIll[1]];
                                                    nArray3[ak.llIlllIIll[0]] = llIlllIIll[11];
                                                    if (!ak.lIlllIIllIIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[llIlllIIll[1]];
                                                    nArray4[ak.llIlllIIll[0]] = llIlllIIll[14];
                                                    if (!ak.lIlllIIllIIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[llIlllIIll[1]];
                                                    nArray5[ak.llIlllIIll[0]] = llIlllIIll[20];
                                                    if (!ak.lIlllIIllIIlI(Inventory.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[llIlllIIll[1]];
                                                    nArray6[ak.llIlllIIll[0]] = llIlllIIll[46];
                                                    if (!ak.lIlllIIllIlII(Inventory.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[llIlllIIll[1]];
                                                    nArray7[ak.llIlllIIll[0]] = llIlllIIll[46];
                                                    if (!ak.lIlllIIllIIlI(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = llIlllIIll[1];

                                                if (-3 <= 0) return n5 != 0;
                                                return false;
                                            }
                                            n5 = llIlllIIll[0];
                                            return n5 != 0;
                                        }
                                        if (!ak.lIlllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[21]) || !ak.lIlllIIllIIll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[8])) break block22;
                                        int[] nArray = new int[llIlllIIll[1]];
                                        nArray[ak.llIlllIIll[0]] = llIlllIIll[13];
                                        if (!ak.lIlllIIllIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[llIlllIIll[1]];
                                        nArray8[ak.llIlllIIll[0]] = llIlllIIll[11];
                                        if (!ak.lIlllIIllIIlI(Inventory.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[llIlllIIll[1]];
                                        nArray9[ak.llIlllIIll[0]] = llIlllIIll[14];
                                        if (!ak.lIlllIIllIIlI(Inventory.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[llIlllIIll[1]];
                                        nArray10[ak.llIlllIIll[0]] = llIlllIIll[16];
                                        if (!ak.lIlllIIllIIlI(Inventory.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[llIlllIIll[1]];
                                        nArray11[ak.llIlllIIll[0]] = llIlllIIll[46];
                                        if (!ak.lIlllIIllIlII(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[llIlllIIll[1]];
                                        nArray12[ak.llIlllIIll[0]] = llIlllIIll[46];
                                        if (!ak.lIlllIIllIIlI(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = llIlllIIll[1];

                                    if (3 > 2) return n4 != 0;
                                    return ((159 + 115 - 87 + 34 ^ 13 + 122 - 45 + 42) & (0xE9 ^ 0xA6 ^ (0x60 ^ 0x76) ^ -1)) != 0;
                                }
                                n4 = llIlllIIll[0];
                                return n4 != 0;
                            }
                            if (!ak.lIlllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[8]) || !ak.lIlllIIllIlII(ci ? 1 : 0)) break block25;
                            int[] nArray = new int[llIlllIIll[1]];
                            nArray[ak.llIlllIIll[0]] = llIlllIIll[22];
                            if (!ak.lIlllIIllIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[llIlllIIll[1]];
                            nArray13[ak.llIlllIIll[0]] = llIlllIIll[22];
                            if (!ak.lIlllIIllIIlI(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[llIlllIIll[1]];
                        nArray[ak.llIlllIIll[0]] = llIlllIIll[24];
                        if (ak.lIlllIIllIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[llIlllIIll[1]];
                            nArray14[ak.llIlllIIll[0]] = llIlllIIll[38];
                            if (ak.lIlllIIllIIlI(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = llIlllIIll[1];

                                if (2 > 0) return n3 != 0;
                                return (2 & ~2) != 0;
                            }
                        }
                    }
                    n3 = llIlllIIll[0];
                    return n3 != 0;
                }
                if (!ak.lIlllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[8]) || !ak.lIlllIIllIIlI(ci ? 1 : 0)) return llIlllIIll[0];
                int[] nArray = new int[llIlllIIll[1]];
                nArray[ak.llIlllIIll[0]] = llIlllIIll[22];
                if (!ak.lIlllIIllIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[llIlllIIll[1]];
                nArray15[ak.llIlllIIll[0]] = llIlllIIll[22];
                if (!ak.lIlllIIllIIlI(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[llIlllIIll[1]];
            nArray[ak.llIlllIIll[0]] = llIlllIIll[16];
            if (ak.lIlllIIllIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[llIlllIIll[1]];
                nArray16[ak.llIlllIIll[0]] = llIlllIIll[23];
                if (ak.lIlllIIllIIlI(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[llIlllIIll[1]];
                    nArray17[ak.llIlllIIll[0]] = llIlllIIll[23];
                    if (ak.lIlllIIllIlll(Inventory.getFirst((int[])nArray17).getQuantity(), llIlllIIll[19])) {
                        int[] nArray18 = new int[llIlllIIll[1]];
                        nArray18[ak.llIlllIIll[0]] = llIlllIIll[24];
                        if (ak.lIlllIIllIIlI(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[llIlllIIll[1]];
                            nArray19[ak.llIlllIIll[0]] = llIlllIIll[38];
                            if (ak.lIlllIIllIIlI(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = llIlllIIll[1];

                                if ((0x2C ^ 0x28) == (0xA8 ^ 0xAC)) return n2 != 0;
                                return false;
                            }
                        }
                    }
                }
            }
        }
        n2 = llIlllIIll[0];
        return n2 != 0;
    }

    public static void AKHelper() {
        if (ak.lIlllIIllIIlI(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIlllIIlI[llIlllIIll[0]];
            b.a(bv);
            if (ak.lIlllIIllIIll(bv.size(), llIlllIIll[1])) {
                System.out.println(llIlllIIlI[llIlllIIll[1]]);
                bt = llIlllIIll[0];
            }
        }
        if (ak.lIlllIIllIlII(bt ? 1 : 0) && ak.lIlllIIllIIll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[2])) {
            BankLocation var1;
            if (ak.lIlllIIllIlII(ak.an() ? 1 : 0)) {
                var1 = BankLocation.getNearest();
                if (ak.lIlllIIllIlIl(var1) && ak.lIlllIIllIlII(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlllIIlI[llIlllIIll[3]];
                    a.a(var1);
                }
                if (ak.lIlllIIllIlIl(var1) && ak.lIlllIIllIIlI(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlllIIlI[llIlllIIll[4]];
                    if (ak.lIlllIIllIlII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIlllIIll[5]);

                        Time.sleepTicks((int)llIlllIIll[6]);

                    }
                    if (ak.lIlllIIllIIlI(Bank.isOpen() ? 1 : 0)) {
                        if (ak.lIlllIIllIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llIlllIIll[7]);

                        }
                        while (ak.lIlllIIllIIll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[8]) && ak.lIlllIIllIlII(I.co() ? 1 : 0)) {
                            I.cm();
                            Time.sleepTicks((int)llIlllIIll[1]);

                            if (-3 < 0) continue;
                            return;
                        }
                        if (ak.lIlllIIllIlII(ak.ao() ? 1 : 0)) {
                            ak.Q();
                            System.out.println(llIlllIIlI[llIlllIIll[7]]);
                            bt = llIlllIIll[1];
                            return;
                        }
                        if (ak.lIlllIIllIIll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[8])) {
                            int[] nArray = new int[llIlllIIll[1]];
                            nArray[ak.llIlllIIll[0]] = llIlllIIll[9];
                            if (ak.lIlllIIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[llIlllIIll[1]];
                                nArray2[ak.llIlllIIll[0]] = llIlllIIll[9];
                                if (ak.lIlllIIllIIll(Inventory.getCount((int[])nArray2), llIlllIIll[1])) {
                                    Bank.withdraw((int)llIlllIIll[9], (int)llIlllIIll[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlllIIll[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIlllIIll[1]];
                                        nArray[ak.llIlllIIll[0]] = llIlllIIll[9];
                                        if (ak.lIlllIIllIllI(Inventory.getCount((int[])nArray))) {
                                            bl = llIlllIIll[1];

                                        } else {
                                            bl = llIlllIIll[0];
                                        }
                                        return bl;
                                    }, (int)llIlllIIll[5]);

                                }
                            }
                            int[] nArray3 = new int[llIlllIIll[1]];
                            nArray3[ak.llIlllIIll[0]] = llIlllIIll[11];
                            if (ak.lIlllIIllIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[llIlllIIll[1]];
                                nArray4[ak.llIlllIIll[0]] = llIlllIIll[11];
                                if (ak.lIlllIIllIIll(Inventory.getCount((int[])nArray4), llIlllIIll[1])) {
                                    Bank.withdraw((int)llIlllIIll[11], (int)llIlllIIll[12], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlllIIll[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIlllIIll[1]];
                                        nArray[ak.llIlllIIll[0]] = llIlllIIll[11];
                                        if (ak.lIlllIIllIllI(Inventory.getCount((int[])nArray))) {
                                            bl = llIlllIIll[1];

                                            if (1 > 2) {
                                                return ((5 ^ 0x75 ^ (0x7D ^ 0x21)) & (0x5E ^ 0x55 ^ (0x3A ^ 0x1D) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = llIlllIIll[0];
                                        }
                                        return bl;
                                    }, (int)llIlllIIll[5]);

                                }
                            }
                            int[] nArray5 = new int[llIlllIIll[1]];
                            nArray5[ak.llIlllIIll[0]] = llIlllIIll[13];
                            if (ak.lIlllIIllIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[llIlllIIll[1]];
                                nArray6[ak.llIlllIIll[0]] = llIlllIIll[13];
                                if (ak.lIlllIIllIIll(Inventory.getCount((int[])nArray6), llIlllIIll[1])) {
                                    Bank.withdraw((int)llIlllIIll[13], (int)llIlllIIll[12], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlllIIll[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIlllIIll[1]];
                                        nArray[ak.llIlllIIll[0]] = llIlllIIll[13];
                                        if (ak.lIlllIIllIllI(Inventory.getCount((int[])nArray))) {
                                            bl = llIlllIIll[1];

                                            }
                                        } else {
                                            bl = llIlllIIll[0];
                                        }
                                        return bl;
                                    }, (int)llIlllIIll[5]);

                                }
                            }
                            int[] nArray7 = new int[llIlllIIll[1]];
                            nArray7[ak.llIlllIIll[0]] = llIlllIIll[14];
                            if (ak.lIlllIIllIIlI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[llIlllIIll[1]];
                                nArray8[ak.llIlllIIll[0]] = llIlllIIll[14];
                                if (ak.lIlllIIllIIll(Inventory.getCount((int[])nArray8), llIlllIIll[1])) {
                                    Bank.withdraw((int)llIlllIIll[14], (int)llIlllIIll[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlllIIll[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIlllIIll[1]];
                                        nArray[ak.llIlllIIll[0]] = llIlllIIll[14];
                                        if (ak.lIlllIIllIllI(Inventory.getCount((int[])nArray))) {
                                            bl = llIlllIIll[1];

                                            if ((90 + 139 - 198 + 131 ^ 32 + 81 - 0 + 54) <= 0) {
                                                return ((99 + 11 - 43 + 116 ^ 164 + 14 - 55 + 48) & (0xFD ^ 0xC5 ^ (0x4A ^ 0x6E) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = llIlllIIll[0];
                                        }
                                        return bl;
                                    }, (int)llIlllIIll[5]);

                                }
                            }
                            int[] nArray9 = new int[llIlllIIll[1]];
                            nArray9[ak.llIlllIIll[0]] = llIlllIIll[16];
                            if (ak.lIlllIIllIIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[llIlllIIll[1]];
                                nArray10[ak.llIlllIIll[0]] = llIlllIIll[16];
                                if (ak.lIlllIIllIIll(Inventory.getCount((int[])nArray10), llIlllIIll[1])) {
                                    Bank.withdraw((int)llIlllIIll[16], (int)llIlllIIll[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlllIIll[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIlllIIll[1]];
                                        nArray[ak.llIlllIIll[0]] = llIlllIIll[16];
                                        if (ak.lIlllIIllIllI(Inventory.getCount((int[])nArray))) {
                                            bl = llIlllIIll[1];

                                            if (((0x13 ^ 0x72 ^ (0x6E ^ 0x51)) & (3 ^ (0x98 ^ 0xC5) ^ -1)) != 0) {
                                                return ((0xB0 ^ 0x99 ^ (0x35 ^ 0x5F)) & (53 + 133 - 67 + 15 ^ 162 + 22 - 99 + 112 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = llIlllIIll[0];
                                        }
                                        return bl;
                                    }, (int)llIlllIIll[5]);

                                }
                            }
                            int[] nArray11 = new int[llIlllIIll[1]];
                            nArray11[ak.llIlllIIll[0]] = llIlllIIll[17];
                            if (ak.lIlllIIllIIlI(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[llIlllIIll[1]];
                                nArray12[ak.llIlllIIll[0]] = llIlllIIll[17];
                                if (ak.lIlllIIllIlII(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    Bank.withdraw((int)llIlllIIll[17], (int)llIlllIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlllIIll[1]);

                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[llIlllIIll[1]];
                                        nArray[ak.llIlllIIll[0]] = llIlllIIll[17];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)llIlllIIll[5]);

                                }
                            }
                            Bank.withdraw((int)llIlllIIll[18], (int)llIlllIIll[19], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            int[] nArray13 = new int[llIlllIIll[1]];
                            nArray13[ak.llIlllIIll[0]] = llIlllIIll[20];
                            if (ak.lIlllIIllIIlI(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                int[] nArray14 = new int[llIlllIIll[1]];
                                nArray14[ak.llIlllIIll[0]] = llIlllIIll[20];
                                if (ak.lIlllIIllIIll(Inventory.getCount((int[])nArray14), llIlllIIll[1]) && ak.lIlllIIllIIll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[21])) {
                                    Bank.withdrawAll((int)llIlllIIll[20], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlllIIll[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIlllIIll[1]];
                                        nArray[ak.llIlllIIll[0]] = llIlllIIll[20];
                                        if (ak.lIlllIIllIllI(Inventory.getCount((int[])nArray))) {
                                            bl = llIlllIIll[1];

                                            if (((0x76 ^ 0x70) & ~(0x59 ^ 0x5F)) != 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = llIlllIIll[0];
                                        }
                                        return bl;
                                    }, (int)llIlllIIll[5]);

                                }
                            }
                        }
                        if (ak.lIlllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[8])) {
                            int[] nArray = new int[llIlllIIll[1]];
                            nArray[ak.llIlllIIll[0]] = llIlllIIll[22];
                            if (ak.lIlllIIllIlII(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)llIlllIIll[22], (int)llIlllIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)llIlllIIll[1]);

                            }
                            if (ak.lIlllIIllIIlI(ci ? 1 : 0)) {
                                Bank.withdrawAll((int)llIlllIIll[23], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)llIlllIIll[1]);

                                Bank.withdrawAll((int)llIlllIIll[16], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)llIlllIIll[1]);

                            }
                            Time.sleepTicks((int)llIlllIIll[4]);

                            Bank.withdrawAll((int)llIlllIIll[24], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)llIlllIIll[1]);

                            Bank.withdrawAll((int)llIlllIIll[25], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)llIlllIIll[1]);

                        }
                    }
                }
            }
            if (ak.lIlllIIllIIlI(ak.an() ? 1 : 0)) {
                if (ak.lIlllIIllIIlI(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (ak.lIlllIIllIIll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[21])) {
                    if (ak.lIlllIIllIlII(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = llIlllIIlI[llIlllIIll[19]];
                        Movement.walkTo((WorldPoint)ck);

                        Time.sleepTicks((int)llIlllIIll[1]);

                    }
                    if (ak.lIlllIIllIIlI(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = llIlllIIlI[llIlllIIll[6]];
                        ak.am();
                    }
                }
                if (ak.lIlllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[21]) && ak.lIlllIIllIIll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[26])) {
                    AccBuilderSotf.c = llIlllIIlI[llIlllIIll[27]];
                    if (ak.lIlllIIlllIII(Players.getLocal().getAnimation(), llIlllIIll[28])) {
                        Magic.cast((Spell)SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks((int)llIlllIIll[1]);

                    }
                }
                if (ak.lIlllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[26]) && ak.lIlllIIllIIll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[29])) {
                    AccBuilderSotf.c = llIlllIIlI[llIlllIIll[30]];
                    if (ak.lIlllIIlllIII(Players.getLocal().getAnimation(), llIlllIIll[28])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)llIlllIIll[1]);

                    }
                }
                if (ak.lIlllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[29]) && ak.lIlllIIllIIll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[31])) {
                    AccBuilderSotf.c = llIlllIIlI[llIlllIIll[32]];
                    if (ak.lIlllIIlllIII(Players.getLocal().getAnimation(), llIlllIIll[28])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)llIlllIIll[1]);

                    }
                }
                if (ak.lIlllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[31]) && ak.lIlllIIllIIll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[8])) {
                    AccBuilderSotf.c = llIlllIIlI[llIlllIIll[33]];
                    if (ak.lIlllIIlllIII(Players.getLocal().getAnimation(), llIlllIIll[28])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)llIlllIIll[1]);

                    }
                }
                if (ak.lIlllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[8])) {
                    int var2;
                    AccBuilderSotf.c = llIlllIIlI[llIlllIIll[34]];
                    if (ak.lIlllIIlllIIl(cl)) {
                        cl = new WorldPoint(llIlllIIll[35] + e.c(llIlllIIll[1], llIlllIIll[7]), llIlllIIll[36], llIlllIIll[0]);
                    }
                    int[] nArray = new int[llIlllIIll[1]];
                    nArray[ak.llIlllIIll[0]] = llIlllIIll[22];
                    if (ak.lIlllIIllIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray15 = new int[llIlllIIll[1]];
                        nArray15[ak.llIlllIIll[0]] = llIlllIIll[22];
                        if (ak.lIlllIIllIlII(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[llIlllIIll[1]];
                            nArray16[ak.llIlllIIll[0]] = llIlllIIll[22];
                            Inventory.getFirst((int[])nArray16).interact(llIlllIIlI[llIlllIIll[37]]);
                            Time.sleepTicks((int)llIlllIIll[1]);

                        }
                    }
                    if (ak.lIlllIIllIIlI(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[llIlllIIll[1]];
                    nArray17[ak.llIlllIIll[0]] = llIlllIIll[24];
                    var1 = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[llIlllIIll[1]];
                    nArray18[ak.llIlllIIll[0]] = llIlllIIll[38];
                    Item var3 = Inventory.getFirst((int[])nArray18);
                    if (ak.lIlllIIllIlII(ci ? 1 : 0) && ak.lIlllIIllIlIl(cl)) {
                        if (ak.lIlllIIllIlII(Players.getLocal().getWorldLocation().equals((Object)cl) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlllIIlI[llIlllIIll[39]];
                            Movement.walkTo((WorldPoint)cl);

                            Time.sleepTicks((int)llIlllIIll[1]);

                        }
                        if (ak.lIlllIIllIIlI(Players.getLocal().getWorldLocation().equals((Object)cl) ? 1 : 0) && ak.lIlllIIllIlIl(var1) && ak.lIlllIIllIlIl(var3) && ak.lIlllIIlllIII(Players.getLocal().getAnimation(), llIlllIIll[28])) {
                            var2 = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)var3);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (ak.lIlllIIllllIl(Skills.getExperience((Skill)Skill.MAGIC), var2)) {
                                    bl = llIlllIIll[1];

                                    if (1 < 0) {
                                        return false;
                                    }
                                } else {
                                    bl = llIlllIIll[0];
                                }
                                return bl;
                            }, (int)llIlllIIll[10]);

                        }
                    }
                    if (ak.lIlllIIllIIlI(ci ? 1 : 0)) {
                        if (ak.lIlllIIllIlIl(var1) && ak.lIlllIIllIlIl(var3) && ak.lIlllIIlllIII(Players.getLocal().getAnimation(), llIlllIIll[28])) {
                            var2 = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)var3);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (ak.lIlllIIllllIl(Skills.getExperience((Skill)Skill.MAGIC), var2)) {
                                    bl = llIlllIIll[1];

                                    if ((0xA6 ^ 0xA2) == 0) {
                                        return false;
                                    }
                                } else {
                                    bl = llIlllIIll[0];
                                }
                                return bl;
                            }, (int)llIlllIIll[10]);

                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (ak.lIlllIIlllIII(Players.getLocal().getAnimation(), llIlllIIll[28])) {
                                bl = llIlllIIll[1];

                                if ((0xA2 ^ 0xA6) < 0) {
                                    return false;
                                }
                            } else {
                                bl = llIlllIIll[0];
                            }
                            return bl;
                        }, (int)llIlllIIll[40]);

                    }
                }
            }
        }
    }

    private static boolean lIlllIIllIIll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String ag() {
        return llIlllIIlI[llIlllIIll[73]];
    }

    static {
        ak.lIlllIIllIIIl();
        ak.lIlllIIlIIllI();
        ci = llIlllIIll[0];
        bv = new ArrayList<d>();
        cj = new WorldArea(llIlllIIll[76], llIlllIIll[77], llIlllIIll[51], llIlllIIll[41], llIlllIIll[0]);
        ck = new WorldPoint(llIlllIIll[78], llIlllIIll[79], llIlllIIll[0]);
        cl = null;
    }

    private static void Q() {
        d var4;
        Object var5;
        if (ak.lIlllIIllIIll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[8])) {
            int[] nArray = new int[llIlllIIll[1]];
            nArray[ak.llIlllIIll[0]] = llIlllIIll[16];
            if (ak.lIlllIIllIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new DHelper(llIlllIIll[16], llIlllIIll[57], llIlllIIll[58]);
                bv.add(d2);

            }
            int[] nArray2 = new int[llIlllIIll[1]];
            nArray2[ak.llIlllIIll[0]] = llIlllIIll[9];
            if (ak.lIlllIIllIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                var5 = new DHelper(llIlllIIll[9], llIlllIIll[59], llIlllIIll[6]);
                bv.add((DHelper) ar5);

            }
            int[] nArray3 = new int[llIlllIIll[1]];
            nArray3[ak.llIlllIIll[0]] = llIlllIIll[11];
            if (ak.lIlllIIllIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                var5 = new DHelper(llIlllIIll[11], llIlllIIll[60], llIlllIIll[6]);
                bv.add((DHelper) ar5);

            }
            int[] nArray4 = new int[llIlllIIll[1]];
            nArray4[ak.llIlllIIll[0]] = llIlllIIll[13];
            if (ak.lIlllIIllIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                var5 = new DHelper(llIlllIIll[13], llIlllIIll[61], llIlllIIll[6]);
                bv.add((DHelper) ar5);

            }
            int[] nArray5 = new int[llIlllIIll[1]];
            nArray5[ak.llIlllIIll[0]] = llIlllIIll[14];
            if (ak.lIlllIIllIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                var5 = new DHelper(llIlllIIll[14], llIlllIIll[5], llIlllIIll[6]);
                bv.add((DHelper) ar5);

            }
            int[] nArray6 = new int[llIlllIIll[1]];
            nArray6[ak.llIlllIIll[0]] = llIlllIIll[46];
            if (ak.lIlllIIllIlII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                var5 = new DHelper(llIlllIIll[46], llIlllIIll[1], e.c(llIlllIIll[62], llIlllIIll[63]));
                bv.add((DHelper) ar5);

            }
        }
        if (ak.lIlllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[8])) {
            int[] nArray = new int[llIlllIIll[1]];
            nArray[ak.llIlllIIll[0]] = llIlllIIll[24];
            if (ak.lIlllIIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[llIlllIIll[1]];
                nArray7[ak.llIlllIIll[0]] = llIlllIIll[24];
                if (ak.lIlllIIllIIll(Bank.getFirst((int[])nArray7).getQuantity(), llIlllIIll[61])) {
                    int[] nArray8 = new int[llIlllIIll[1]];
                    nArray8[ak.llIlllIIll[0]] = llIlllIIll[24];
                    var5 = new DHelper(llIlllIIll[24], llIlllIIll[61] - Bank.getFirst((int[])nArray8).getQuantity(), llIlllIIll[64]);
                    bv.add((DHelper) ar5);

                }
            }
            int[] nArray9 = new int[llIlllIIll[1]];
            nArray9[ak.llIlllIIll[0]] = llIlllIIll[24];
            if (ak.lIlllIIllIlII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                var5 = new DHelper(llIlllIIll[24], llIlllIIll[61], llIlllIIll[64]);
                bv.add((DHelper) ar5);

            }
            int[] nArray10 = new int[llIlllIIll[1]];
            nArray10[ak.llIlllIIll[0]] = llIlllIIll[25];
            if (ak.lIlllIIllIIlI(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[llIlllIIll[1]];
                nArray11[ak.llIlllIIll[0]] = llIlllIIll[25];
                if (ak.lIlllIIllIIll(Bank.getFirst((int[])nArray11).getQuantity(), llIlllIIll[61])) {
                    int[] nArray12 = new int[llIlllIIll[1]];
                    nArray12[ak.llIlllIIll[0]] = llIlllIIll[25];
                    var5 = new DHelper(llIlllIIll[25], llIlllIIll[61] - Bank.getFirst((int[])nArray12).getQuantity(), llIlllIIll[65]);
                    bv.add((DHelper) ar5);

                }
            }
            int[] nArray13 = new int[llIlllIIll[1]];
            nArray13[ak.llIlllIIll[0]] = llIlllIIll[25];
            if (ak.lIlllIIllIlII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                var5 = new DHelper(llIlllIIll[25], llIlllIIll[61], llIlllIIll[65]);
                bv.add((DHelper) ar5);

            }
            int[] nArray14 = new int[llIlllIIll[1]];
            nArray14[ak.llIlllIIll[0]] = llIlllIIll[22];
            if (ak.lIlllIIllIlII(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[llIlllIIll[1]];
                nArray15[ak.llIlllIIll[0]] = llIlllIIll[22];
                if (ak.lIlllIIllIlII(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    var5 = new DHelper(llIlllIIll[22], llIlllIIll[1], llIlllIIll[66]);
                    bv.add((DHelper) ar5);

                }
            }
            if (ak.lIlllIIllIIlI(ci ? 1 : 0)) {
                int[] nArray16 = new int[llIlllIIll[1]];
                nArray16[ak.llIlllIIll[0]] = llIlllIIll[16];
                if (ak.lIlllIIllIIlI(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[llIlllIIll[1]];
                    nArray17[ak.llIlllIIll[0]] = llIlllIIll[16];
                    if (ak.lIlllIIllIIll(Bank.getFirst((int[])nArray17).getQuantity(), llIlllIIll[61])) {
                        int[] nArray18 = new int[llIlllIIll[1]];
                        nArray18[ak.llIlllIIll[0]] = llIlllIIll[16];
                        var5 = new DHelper(llIlllIIll[16], llIlllIIll[61] - Bank.getFirst((int[])nArray18).getQuantity(), llIlllIIll[58]);
                        bv.add((DHelper) ar5);

                    }
                }
                int[] nArray19 = new int[llIlllIIll[1]];
                nArray19[ak.llIlllIIll[0]] = llIlllIIll[16];
                if (ak.lIlllIIllIlII(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    var5 = new DHelper(llIlllIIll[16], llIlllIIll[61], llIlllIIll[58]);
                    bv.add((DHelper) ar5);

                }
                int[] nArray20 = new int[llIlllIIll[1]];
                nArray20[ak.llIlllIIll[0]] = llIlllIIll[23];
                if (ak.lIlllIIllIIlI(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[llIlllIIll[1]];
                    nArray21[ak.llIlllIIll[0]] = llIlllIIll[23];
                    if (ak.lIlllIIllIIll(Bank.getFirst((int[])nArray21).getQuantity(), llIlllIIll[66])) {
                        int[] nArray22 = new int[llIlllIIll[1]];
                        nArray22[ak.llIlllIIll[0]] = llIlllIIll[23];
                        var5 = new DHelper(llIlllIIll[23], llIlllIIll[66] - Bank.getFirst((int[])nArray22).getQuantity(), llIlllIIll[6]);
                        bv.add((DHelper) ar5);

                    }
                }
                int[] nArray23 = new int[llIlllIIll[1]];
                nArray23[ak.llIlllIIll[0]] = llIlllIIll[23];
                if (ak.lIlllIIllIlII(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    var5 = new DHelper(llIlllIIll[23], llIlllIIll[66], llIlllIIll[6]);
                    bv.add((DHelper) ar5);

                }
            }
        }
        int[] nArray = new int[llIlllIIll[1]];
        nArray[ak.llIlllIIll[0]] = llIlllIIll[20];
        if (ak.lIlllIIllIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
            var5 = new DHelper(llIlllIIll[20], llIlllIIll[67], llIlllIIll[68]);
            bv.add((DHelper) ar5);

        }
        if (ak.lIlllIIllIlII(Bank.contains(var5 = item -> item.getName().toLowerCase().contains(llIlllIIlI[llIlllIIll[74]])) ? 1 : 0)) {
            var4 = new DHelper(llIlllIIll[69], llIlllIIll[19], llIlllIIll[70]);
            bv.add(var4);

        }
        int[] nArray24 = new int[llIlllIIll[1]];
        nArray24[ak.llIlllIIll[0]] = llIlllIIll[71];
        if (ak.lIlllIIllIlII(Bank.contains((int[])nArray24) ? 1 : 0)) {
            var4 = new DHelper(llIlllIIll[71], llIlllIIll[33], llIlllIIll[72]);
            bv.add(var4);

        }
        int[] nArray25 = new int[llIlllIIll[1]];
        nArray25[ak.llIlllIIll[0]] = llIlllIIll[18];
        if (ak.lIlllIIllIlII(Bank.contains((int[])nArray25) ? 1 : 0)) {
            var4 = new DHelper(llIlllIIll[18], llIlllIIll[33], llIlllIIll[72]);
            bv.add(var4);

        }
    }

    private static boolean lIlllIIllIIlI(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ao() {
        int n2;
        block29: {
            block28: {
                block25: {
                    int n3;
                    block27: {
                        block26: {
                            block22: {
                                int n4;
                                block23: {
                                    block24: {
                                        block19: {
                                            int n5;
                                            block20: {
                                                block21: {
                                                    if (!ak.lIlllIIllIIll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[21])) break block19;
                                                    int[] nArray = new int[llIlllIIll[1]];
                                                    nArray[ak.llIlllIIll[0]] = llIlllIIll[9];
                                                    if (!ak.lIlllIIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[llIlllIIll[1]];
                                                    nArray2[ak.llIlllIIll[0]] = llIlllIIll[13];
                                                    if (!ak.lIlllIIllIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[llIlllIIll[1]];
                                                    nArray3[ak.llIlllIIll[0]] = llIlllIIll[11];
                                                    if (!ak.lIlllIIllIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[llIlllIIll[1]];
                                                    nArray4[ak.llIlllIIll[0]] = llIlllIIll[14];
                                                    if (!ak.lIlllIIllIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[llIlllIIll[1]];
                                                    nArray5[ak.llIlllIIll[0]] = llIlllIIll[20];
                                                    if (!ak.lIlllIIllIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[llIlllIIll[1]];
                                                    nArray6[ak.llIlllIIll[0]] = llIlllIIll[46];
                                                    if (!ak.lIlllIIllIlII(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[llIlllIIll[1]];
                                                    nArray7[ak.llIlllIIll[0]] = llIlllIIll[46];
                                                    if (!ak.lIlllIIllIIlI(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = llIlllIIll[1];

                                                if (((0x1F ^ 0x58) & ~(0xF ^ 0x48)) == 0) return n5 != 0;
                                                return false;
                                            }
                                            n5 = llIlllIIll[0];
                                            return n5 != 0;
                                        }
                                        if (!ak.lIlllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[21]) || !ak.lIlllIIllIIll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[8])) break block22;
                                        int[] nArray = new int[llIlllIIll[1]];
                                        nArray[ak.llIlllIIll[0]] = llIlllIIll[13];
                                        if (!ak.lIlllIIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[llIlllIIll[1]];
                                        nArray8[ak.llIlllIIll[0]] = llIlllIIll[11];
                                        if (!ak.lIlllIIllIIlI(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[llIlllIIll[1]];
                                        nArray9[ak.llIlllIIll[0]] = llIlllIIll[14];
                                        if (!ak.lIlllIIllIIlI(Bank.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[llIlllIIll[1]];
                                        nArray10[ak.llIlllIIll[0]] = llIlllIIll[16];
                                        if (!ak.lIlllIIllIIlI(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[llIlllIIll[1]];
                                        nArray11[ak.llIlllIIll[0]] = llIlllIIll[46];
                                        if (!ak.lIlllIIllIlII(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[llIlllIIll[1]];
                                        nArray12[ak.llIlllIIll[0]] = llIlllIIll[46];
                                        if (!ak.lIlllIIllIIlI(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = llIlllIIll[1];

                                    if (3 >= 2) return n4 != 0;
                                    return ((0x74 ^ 0x60 ^ (0x67 ^ 0x59)) & (0xFB ^ 0xBE ^ (0xC0 ^ 0xAF) ^ -1)) != 0;
                                }
                                n4 = llIlllIIll[0];
                                return n4 != 0;
                            }
                            if (!ak.lIlllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[8]) || !ak.lIlllIIllIlII(ci ? 1 : 0)) break block25;
                            int[] nArray = new int[llIlllIIll[1]];
                            nArray[ak.llIlllIIll[0]] = llIlllIIll[22];
                            if (!ak.lIlllIIllIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[llIlllIIll[1]];
                            nArray13[ak.llIlllIIll[0]] = llIlllIIll[22];
                            if (!ak.lIlllIIllIIlI(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[llIlllIIll[1]];
                        nArray[ak.llIlllIIll[0]] = llIlllIIll[24];
                        if (ak.lIlllIIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[llIlllIIll[1]];
                            nArray14[ak.llIlllIIll[0]] = llIlllIIll[25];
                            if (ak.lIlllIIllIIlI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = llIlllIIll[1];

                                if (((0x42 ^ 0x6C) & ~(0x99 ^ 0xB7)) == 0) return n3 != 0;
                                return false;
                            }
                        }
                    }
                    n3 = llIlllIIll[0];
                    return n3 != 0;
                }
                if (!ak.lIlllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[8]) || !ak.lIlllIIllIIlI(ci ? 1 : 0)) return llIlllIIll[0];
                int[] nArray = new int[llIlllIIll[1]];
                nArray[ak.llIlllIIll[0]] = llIlllIIll[22];
                if (!ak.lIlllIIllIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[llIlllIIll[1]];
                nArray15[ak.llIlllIIll[0]] = llIlllIIll[22];
                if (!ak.lIlllIIllIIlI(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[llIlllIIll[1]];
            nArray[ak.llIlllIIll[0]] = llIlllIIll[16];
            if (ak.lIlllIIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[llIlllIIll[1]];
                nArray16[ak.llIlllIIll[0]] = llIlllIIll[23];
                if (ak.lIlllIIllIIlI(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[llIlllIIll[1]];
                    nArray17[ak.llIlllIIll[0]] = llIlllIIll[23];
                    if (ak.lIlllIIllIlll(Bank.getFirst((int[])nArray17).getQuantity(), llIlllIIll[19])) {
                        int[] nArray18 = new int[llIlllIIll[1]];
                        nArray18[ak.llIlllIIll[0]] = llIlllIIll[24];
                        if (ak.lIlllIIllIIlI(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[llIlllIIll[1]];
                            nArray19[ak.llIlllIIll[0]] = llIlllIIll[25];
                            if (ak.lIlllIIllIIlI(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = llIlllIIll[1];

                                if ((0x7B ^ 0x7E) > 0) return n2 != 0;
                                return (1 & ~1) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = llIlllIIll[0];
        return n2 != 0;
    }

    private static void lIlllIIlIIllI() {
        llIlllIIlI = new String[llIlllIIll[80]];
        ak.llIlllIIlI[ak.llIlllIIll[0]] = "Buying items";
        ak.llIlllIIlI[ak.llIlllIIll[1]] = "Finished buying items, switching back to magic training";
        ak.llIlllIIlI[ak.llIlllIIll[3]] = "Navigating to bank";
        ak.llIlllIIlI[ak.llIlllIIll[4]] = "Handling banking";
        ak.llIlllIIlI[ak.llIlllIIll[7]] = "We are missing supplies, switching to BUYING";
        ak.llIlllIIlI[ak.llIlllIIll[19]] = "Nav to cows";
        ak.llIlllIIlI[ak.llIlllIIll[6]] = "Attacking cows";
        ak.llIlllIIlI[ak.llIlllIIll[27]] = "Casting varrock tele";
        ak.llIlllIIlI[ak.llIlllIIll[30]] = "Casting lumby tele";
        ak.llIlllIIlI[ak.llIlllIIll[32]] = "Casting fally tele";
        ak.llIlllIIlI[ak.llIlllIIll[33]] = "Casting cammy tele";
        ak.llIlllIIlI[ak.llIlllIIll[34]] = "Alching";
        ak.llIlllIIlI[ak.llIlllIIll[37]] = "Wield";
        ak.llIlllIIlI[ak.llIlllIIll[39]] = "Move to alch spot";
        ak.llIlllIIlI[ak.llIlllIIll[41]] = "Nav to cows";
        ak.llIlllIIlI[ak.llIlllIIll[42]] = "Attacking cows";
        ak.llIlllIIlI[ak.llIlllIIll[43]] = "Eat";
        ak.llIlllIIlI[ak.llIlllIIll[44]] = "Cow";
        ak.llIlllIIlI[ak.llIlllIIll[45]] = "cow";
        ak.llIlllIIlI[ak.llIlllIIll[47]] = "Attack";
        ak.llIlllIIlI[ak.llIlllIIll[51]] = "Opening autocast";
        ak.llIlllIIlI[ak.llIlllIIll[52]] = "Choose spell";
        ak.llIlllIIlI[ak.llIlllIIll[54]] = "Wind Strike";
        ak.llIlllIIlI[ak.llIlllIIll[55]] = "Water Strike";
        ak.llIlllIIlI[ak.llIlllIIll[56]] = "Earth Strike";
        ak.llIlllIIlI[ak.llIlllIIll[21]] = "Earth Strike";
        ak.llIlllIIlI[ak.llIlllIIll[50]] = "Fire Strike";
        ak.llIlllIIlI[ak.llIlllIIll[73]] = "Magic training";
        ak.llIlllIIlI[ak.llIlllIIll[74]] = "ring of wealth (";
        ak.llIlllIIlI[ak.llIlllIIll[75]] = "Cow";
    }

    private static boolean lIlllIIllllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void am() {
        if (ak.lIlllIIlllIll(ak.lIlllIIlllIlI(e.w(), 30.0))) {
            int[] nArray = new int[llIlllIIll[1]];
            nArray[ak.llIlllIIll[0]] = llIlllIIll[20];
            if (ak.lIlllIIllIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIlllIIll[1]];
                nArray2[ak.llIlllIIll[0]] = llIlllIIll[20];
                Inventory.getFirst((int[])nArray2).interact(llIlllIIlI[llIlllIIll[43]]);
                Time.sleepTicks((int)llIlllIIll[1]);

            }
        }
        if (ak.lIlllIIlllIIl(Players.getLocal().getInteracting())) {
            NPC var6 = NPCs.getNearest(nPC -> {
                int n2;
                if (ak.lIlllIIllIIlI(nPC.getName().contains(llIlllIIlI[llIlllIIll[75]]) ? 1 : 0) && ak.lIlllIIllIlII(nPC.isDead() ? 1 : 0)) {
                    n2 = llIlllIIll[1];

                    }
                } else {
                    n2 = llIlllIIll[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[llIlllIIll[3]];
            stringArray[ak.llIlllIIll[0]] = llIlllIIlI[llIlllIIll[44]];
            stringArray[ak.llIlllIIll[1]] = llIlllIIlI[llIlllIIll[45]];
            List var7 = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (ak.lIlllIIllllII(nPC.getInteracting(), Players.getLocal())) {
                    bl = llIlllIIll[1];

                    if (2 <= -1) {
                        return false;
                    }
                } else {
                    bl = llIlllIIll[0];
                }
                return bl;
            }).collect(Collectors.toList());
            int[] nArray = new int[llIlllIIll[1]];
            nArray[ak.llIlllIIll[0]] = llIlllIIll[46];
            if (ak.lIlllIIllIIlI(Equipment.contains((int[])nArray) ? 1 : 0) && ak.lIlllIIllIlII(ak.ap() ? 1 : 0)) {
                ak.aq();
            }
            if (ak.lIlllIIllIlIl(var6) && ak.lIlllIIllIlII(Players.getLocal().isMoving() ? 1 : 0)) {
                var6.interact(llIlllIIlI[llIlllIIll[47]]);
                Time.sleepTicks((int)llIlllIIll[4]);

            }
        }
    }

    private static boolean lIlllIIlllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlllIIllIlll(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (ak.lIlllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[2])) {
            bl = llIlllIIll[1];

            if ((0xB6 ^ 0xB3) == 0) {
                return false;
            }
        } else {
            bl = llIlllIIll[0];
        }
        return bl;
    }

    @Override
    public boolean ae() {
        return llIlllIIll[0];
    }

    @Override
    public int af() {
        try {
            ak.AKHelper();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 <= 0) {
            return (0x3C ^ 0x73) & ~(0xEE ^ 0xA1);
        }
        return llIlllIIll[67];
    }

    private static int lIlllIIlllIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    public static void al() {
        if (ak.lIlllIIllIIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (ak.lIlllIIllIlII(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIlllIIlI[llIlllIIll[41]];
            Movement.walkTo((WorldPoint)ck);

            Time.sleepTicks((int)llIlllIIll[1]);

        }
        if (ak.lIlllIIllIIlI(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIlllIIlI[llIlllIIll[42]];
            ak.am();
        }
    }

    private static boolean lIlllIIlllIll(int n2) {
        return n2 < 0;
    }

    public static void aq() {
        if (ak.lIlllIIllIlIl(Widgets.get((int)llIlllIIll[49], (int)llIlllIIll[50]))) {
            AccBuilderSotf.c = llIlllIIlI[llIlllIIll[51]];
            Widgets.get((int)llIlllIIll[49], (int)llIlllIIll[50]).interact(llIlllIIlI[llIlllIIll[52]]);
            Time.sleepTicks((int)llIlllIIll[7]);

        }
        if (ak.lIlllIIlllIIl(Widgets.get((int)llIlllIIll[49], (int)llIlllIIll[50])) && ak.lIlllIIllIlII(Widgets.get((int)llIlllIIll[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)llIlllIIll[1]);

            if (ak.lIlllIIllIIll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[19])) {
                Widgets.get((int)llIlllIIll[53], (int)llIlllIIll[1]).getChild(llIlllIIll[1]).interact(llIlllIIlI[llIlllIIll[54]]);
            }
            if (ak.lIlllIIllIIll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[32]) && ak.lIlllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[19])) {
                Widgets.get((int)llIlllIIll[53], (int)llIlllIIll[1]).getChild(llIlllIIll[3]).interact(llIlllIIlI[llIlllIIll[55]]);
            }
            if (ak.lIlllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[32]) && ak.lIlllIIllIIll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[39])) {
                Widgets.get((int)llIlllIIll[53], (int)llIlllIIll[1]).getChild(llIlllIIll[4]).interact(llIlllIIlI[llIlllIIll[56]]);
            }
            if (ak.lIlllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[32])) {
                int[] nArray = new int[llIlllIIll[1]];
                nArray[ak.llIlllIIll[0]] = llIlllIIll[14];
                if (ak.lIlllIIllIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)llIlllIIll[53], (int)llIlllIIll[1]).getChild(llIlllIIll[4]).interact(llIlllIIlI[llIlllIIll[21]]);
                }
            }
            if (ak.lIlllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[39])) {
                int[] nArray = new int[llIlllIIll[1]];
                nArray[ak.llIlllIIll[0]] = llIlllIIll[14];
                if (ak.lIlllIIllIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)llIlllIIll[53], (int)llIlllIIll[1]).getChild(llIlllIIll[7]).interact(llIlllIIlI[llIlllIIll[50]]);
                }
            }
            Time.sleepTicks((int)llIlllIIll[1]);

        }
    }

    private static boolean lIlllIIllllII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlllIIllIllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIlllIIlllIIl(Object object) {
        return object == null;
    }

        return String.valueOf(var8);
    }

    private static boolean lIlllIIllIlIl(Object object) {
        return object != null;
    }
}

