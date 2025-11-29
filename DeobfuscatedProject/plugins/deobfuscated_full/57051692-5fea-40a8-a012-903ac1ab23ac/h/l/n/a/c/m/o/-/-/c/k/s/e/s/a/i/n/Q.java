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
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.y;
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

public class Q
implements K {
    private static /* synthetic */ int[] lIlIIIIlIl;
    private static /* synthetic */ String[] lIlIIIIlII;
    public static /* synthetic */ boolean cc;
    static /* synthetic */ WorldPoint ce;
    public static /* synthetic */ boolean bn;
    static /* synthetic */ WorldArea cd;
    public static /* synthetic */ List<d> bp;
    static /* synthetic */ WorldPoint cf;

    private static boolean lIIIlIIIlIIll(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public int ad() {
        try {
            Q.ai();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0xA ^ 0x72 ^ (0x1C ^ 0x61)) == 0) {
            return (0x79 ^ 0x15 ^ (5 ^ 0x5C)) & (0x7C ^ 0xC ^ (0x82 ^ 0xC7) ^ -1);
        }
        return lIlIIIIlIl[68];
    }

    private static boolean lIIIlIIIlIlll(int n2) {
        return n2 < 0;
    }

    public static void ai() {
        if (Q.lIIIlIIIIlllI(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIIIlII[lIlIIIIlIl[0]];
            b.a(bp);
            if (Q.lIIIlIIIIllll(bp.size(), lIlIIIIlIl[1])) {
                System.out.println(lIlIIIIlII[lIlIIIIlIl[1]]);
                bn = lIlIIIIlIl[0];
            }
        }
        if (Q.lIIIlIIIlIIII(bn ? 1 : 0) && Q.lIIIlIIIIllll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[2])) {
            BankLocation var13;
            if (Q.lIIIlIIIlIIII(Q.al() ? 1 : 0)) {
                var13 = BankLocation.getNearest();
                if (Q.lIIIlIIIlIIIl(var13) && Q.lIIIlIIIlIIII(var13.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIIIlII[lIlIIIIlIl[3]];
                    a.a(var13);
                }
                if (Q.lIIIlIIIlIIIl(var13) && Q.lIIIlIIIIlllI(var13.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIIIlII[lIlIIIIlIl[4]];
                    if (Q.lIIIlIIIlIIII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIIIIlIl[5]);
                        0;
                        Time.sleepTicks((int)lIlIIIIlIl[6]);
                        0;
                    }
                    if (Q.lIIIlIIIIlllI(Bank.isOpen() ? 1 : 0)) {
                        if (Q.lIIIlIIIlIIlI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIlIIIIlIl[7]);
                            0;
                        }
                        while (Q.lIIIlIIIIllll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[2]) && Q.lIIIlIIIlIIII(y.bv() ? 1 : 0)) {
                            y.bt();
                            Time.sleepTicks((int)lIlIIIIlIl[1]);
                            0;
                            0;
                            if (((0x7E ^ 0x26 ^ (0x36 ^ 0xF)) & (97 + 207 - 221 + 151 ^ 115 + 132 - 184 + 76 ^ -1)) == ((0xAC ^ 0xB8 ^ (0x76 ^ 0x4C)) & (0xAE ^ 0xB2 ^ (0x1D ^ 0x2F) ^ -1))) continue;
                            return;
                        }
                        if (Q.lIIIlIIIlIIII(Q.am() ? 1 : 0)) {
                            Q.O();
                            System.out.println(lIlIIIIlII[lIlIIIIlIl[7]]);
                            bn = lIlIIIIlIl[1];
                            return;
                        }
                        if (Q.lIIIlIIIIllll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[2])) {
                            int[] nArray = new int[lIlIIIIlIl[1]];
                            nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[8];
                            if (Q.lIIIlIIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIlIIIIlIl[1]];
                                nArray2[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[8];
                                if (Q.lIIIlIIIIllll(Inventory.getCount((int[])nArray2), lIlIIIIlIl[1])) {
                                    Bank.withdraw((int)lIlIIIIlIl[8], (int)lIlIIIIlIl[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIIIIlIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlIIIIlIl[1]];
                                        nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[8];
                                        if (Q.lIIIlIIIlIIlI(Inventory.getCount((int[])nArray))) {
                                            bl = lIlIIIIlIl[1];
                                            0;
                                            if (1 <= ((0x20 ^ 2) & ~(7 ^ 0x25))) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIlIIIIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lIlIIIIlIl[5]);
                                    0;
                                }
                            }
                            int[] nArray3 = new int[lIlIIIIlIl[1]];
                            nArray3[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[10];
                            if (Q.lIIIlIIIIlllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIlIIIIlIl[1]];
                                nArray4[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[10];
                                if (Q.lIIIlIIIIllll(Inventory.getCount((int[])nArray4), lIlIIIIlIl[1])) {
                                    Bank.withdraw((int)lIlIIIIlIl[10], (int)lIlIIIIlIl[11], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIIIIlIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlIIIIlIl[1]];
                                        nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[10];
                                        if (Q.lIIIlIIIlIIlI(Inventory.getCount((int[])nArray))) {
                                            bl = lIlIIIIlIl[1];
                                            0;
                                            if (((0x88 ^ 0x8E ^ (0x26 ^ 0x70)) & (0x9A ^ 0x8C ^ (0xE2 ^ 0xA4) ^ -1)) < -1) {
                                                return ((0x3C ^ 0x36 ^ (0x4F ^ 0xC)) & (73 + 188 - 92 + 31 ^ 117 + 74 - 98 + 36 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIlIIIIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lIlIIIIlIl[5]);
                                    0;
                                }
                            }
                            int[] nArray5 = new int[lIlIIIIlIl[1]];
                            nArray5[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[12];
                            if (Q.lIIIlIIIIlllI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIlIIIIlIl[1]];
                                nArray6[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[12];
                                if (Q.lIIIlIIIIllll(Inventory.getCount((int[])nArray6), lIlIIIIlIl[1])) {
                                    Bank.withdraw((int)lIlIIIIlIl[12], (int)lIlIIIIlIl[11], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIIIIlIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlIIIIlIl[1]];
                                        nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[12];
                                        if (Q.lIIIlIIIlIIlI(Inventory.getCount((int[])nArray))) {
                                            bl = lIlIIIIlIl[1];
                                            0;
                                            if (((0x66 ^ 0x17 ^ (8 ^ 0x5F)) & (33 + 96 - 34 + 40 ^ 129 + 74 - 166 + 124 ^ -1)) > 0) {
                                                return ((0x83 ^ 0x9F ^ (0xF8 ^ 0xC2)) & (0x72 ^ 0x76 ^ (0x83 ^ 0xA1) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIlIIIIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lIlIIIIlIl[5]);
                                    0;
                                }
                            }
                            int[] nArray7 = new int[lIlIIIIlIl[1]];
                            nArray7[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[13];
                            if (Q.lIIIlIIIIlllI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIlIIIIlIl[1]];
                                nArray8[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[13];
                                if (Q.lIIIlIIIIllll(Inventory.getCount((int[])nArray8), lIlIIIIlIl[1])) {
                                    Bank.withdraw((int)lIlIIIIlIl[13], (int)lIlIIIIlIl[14], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIIIIlIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlIIIIlIl[1]];
                                        nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[13];
                                        if (Q.lIIIlIIIlIIlI(Inventory.getCount((int[])nArray))) {
                                            bl = lIlIIIIlIl[1];
                                            0;
                                            if (-3 > 0) {
                                                return ((64 + 52 - 98 + 125 ^ 79 + 40 - 105 + 137) & (0x40 ^ 0x3E ^ (0x6C ^ 0xA) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIlIIIIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lIlIIIIlIl[5]);
                                    0;
                                }
                            }
                            int[] nArray9 = new int[lIlIIIIlIl[1]];
                            nArray9[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[15];
                            if (Q.lIIIlIIIIlllI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIlIIIIlIl[1]];
                                nArray10[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[15];
                                if (Q.lIIIlIIIIllll(Inventory.getCount((int[])nArray10), lIlIIIIlIl[1])) {
                                    Bank.withdraw((int)lIlIIIIlIl[15], (int)lIlIIIIlIl[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIIIIlIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlIIIIlIl[1]];
                                        nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[15];
                                        if (Q.lIIIlIIIlIIlI(Inventory.getCount((int[])nArray))) {
                                            bl = lIlIIIIlIl[1];
                                            0;
                                            if (((134 + 174 - 170 + 67 ^ 84 + 100 - 77 + 29) & (166 + 9 - 27 + 61 ^ 11 + 58 - 14 + 93 ^ -1)) == 3) {
                                                return ((153 + 19 - 43 + 50 ^ 66 + 30 - 76 + 122) & (0x1E ^ 0x79 ^ (0x7D ^ 0x27) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIlIIIIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lIlIIIIlIl[5]);
                                    0;
                                }
                            }
                            int[] nArray11 = new int[lIlIIIIlIl[1]];
                            nArray11[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[16];
                            if (Q.lIIIlIIIIlllI(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[lIlIIIIlIl[1]];
                                nArray12[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[16];
                                if (Q.lIIIlIIIlIIII(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    Bank.withdraw((int)lIlIIIIlIl[16], (int)lIlIIIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIIIIlIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[lIlIIIIlIl[1]];
                                        nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[16];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)lIlIIIIlIl[5]);
                                    0;
                                }
                            }
                            Bank.withdraw((int)lIlIIIIlIl[17], (int)lIlIIIIlIl[18], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            int[] nArray13 = new int[lIlIIIIlIl[1]];
                            nArray13[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[19];
                            if (Q.lIIIlIIIIlllI(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                int[] nArray14 = new int[lIlIIIIlIl[1]];
                                nArray14[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[19];
                                if (Q.lIIIlIIIIllll(Inventory.getCount((int[])nArray14), lIlIIIIlIl[1]) && Q.lIIIlIIIIllll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[20])) {
                                    Bank.withdrawAll((int)lIlIIIIlIl[19], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIIIIlIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlIIIIlIl[1]];
                                        nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[19];
                                        if (Q.lIIIlIIIlIIlI(Inventory.getCount((int[])nArray))) {
                                            bl = lIlIIIIlIl[1];
                                            0;
                                            if (2 <= ((0x59 ^ 0x15) & ~(0xD0 ^ 0x9C))) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIlIIIIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lIlIIIIlIl[5]);
                                    0;
                                }
                            }
                        }
                        if (Q.lIIIlIIIlIIll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[2])) {
                            int[] nArray = new int[lIlIIIIlIl[1]];
                            nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[21];
                            if (Q.lIIIlIIIlIIII(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)lIlIIIIlIl[21], (int)lIlIIIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIlIIIIlIl[1]);
                                0;
                            }
                            if (Q.lIIIlIIIIlllI(cc ? 1 : 0)) {
                                Bank.withdrawAll((int)lIlIIIIlIl[22], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIlIIIIlIl[1]);
                                0;
                                Bank.withdrawAll((int)lIlIIIIlIl[15], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIlIIIIlIl[1]);
                                0;
                            }
                            Time.sleepTicks((int)lIlIIIIlIl[4]);
                            0;
                            Bank.withdrawAll((int)lIlIIIIlIl[23], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIlIIIIlIl[1]);
                            0;
                            Bank.withdrawAll((int)lIlIIIIlIl[24], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)lIlIIIIlIl[1]);
                            0;
                        }
                    }
                }
            }
            if (Q.lIIIlIIIIlllI(Q.al() ? 1 : 0)) {
                if (Q.lIIIlIIIIlllI(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (Q.lIIIlIIIIllll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[20])) {
                    if (Q.lIIIlIIIlIIII(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIIIlII[lIlIIIIlIl[18]];
                        Movement.walkTo((WorldPoint)ce);
                        0;
                        Time.sleepTicks((int)lIlIIIIlIl[1]);
                        0;
                    }
                    if (Q.lIIIlIIIIlllI(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIIIlII[lIlIIIIlIl[6]];
                        Q.ak();
                    }
                }
                if (Q.lIIIlIIIlIIll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[20]) && Q.lIIIlIIIIllll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[25])) {
                    AccBuilderShamans.c = lIlIIIIlII[lIlIIIIlIl[26]];
                    if (Q.lIIIlIIIlIlII(Players.getLocal().getAnimation(), lIlIIIIlIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks((int)lIlIIIIlIl[1]);
                        0;
                    }
                }
                if (Q.lIIIlIIIlIIll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[25]) && Q.lIIIlIIIIllll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[28])) {
                    AccBuilderShamans.c = lIlIIIIlII[lIlIIIIlIl[29]];
                    if (Q.lIIIlIIIlIlII(Players.getLocal().getAnimation(), lIlIIIIlIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)lIlIIIIlIl[1]);
                        0;
                    }
                }
                if (Q.lIIIlIIIlIIll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[28]) && Q.lIIIlIIIIllll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[30])) {
                    AccBuilderShamans.c = lIlIIIIlII[lIlIIIIlIl[31]];
                    if (Q.lIIIlIIIlIlII(Players.getLocal().getAnimation(), lIlIIIIlIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)lIlIIIIlIl[1]);
                        0;
                    }
                }
                if (Q.lIIIlIIIlIIll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[30]) && Q.lIIIlIIIIllll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[2])) {
                    AccBuilderShamans.c = lIlIIIIlII[lIlIIIIlIl[32]];
                    if (Q.lIIIlIIIlIlII(Players.getLocal().getAnimation(), lIlIIIIlIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)lIlIIIIlIl[1]);
                        0;
                    }
                }
                if (Q.lIIIlIIIlIIll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[2])) {
                    int var16;
                    AccBuilderShamans.c = lIlIIIIlII[lIlIIIIlIl[33]];
                    if (Q.lIIIlIIIlIlIl(cf)) {
                        cf = new WorldPoint(lIlIIIIlIl[34] + e.c(lIlIIIIlIl[1], lIlIIIIlIl[7]), lIlIIIIlIl[35], lIlIIIIlIl[0]);
                    }
                    int[] nArray = new int[lIlIIIIlIl[1]];
                    nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[21];
                    if (Q.lIIIlIIIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray15 = new int[lIlIIIIlIl[1]];
                        nArray15[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[21];
                        if (Q.lIIIlIIIlIIII(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[lIlIIIIlIl[1]];
                            nArray16[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[21];
                            Inventory.getFirst((int[])nArray16).interact(lIlIIIIlII[lIlIIIIlIl[36]]);
                            Time.sleepTicks((int)lIlIIIIlIl[1]);
                            0;
                        }
                    }
                    if (Q.lIIIlIIIIlllI(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[lIlIIIIlIl[1]];
                    nArray17[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[23];
                    var13 = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[lIlIIIIlIl[1]];
                    nArray18[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[37];
                    Item var8 = Inventory.getFirst((int[])nArray18);
                    if (Q.lIIIlIIIlIIII(cc ? 1 : 0) && Q.lIIIlIIIlIIIl(cf)) {
                        if (Q.lIIIlIIIlIIII(Players.getLocal().getWorldLocation().equals((Object)cf) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIIIIlII[lIlIIIIlIl[38]];
                            Movement.walkTo((WorldPoint)cf);
                            0;
                            Time.sleepTicks((int)lIlIIIIlIl[1]);
                            0;
                        }
                        if (Q.lIIIlIIIIlllI(Players.getLocal().getWorldLocation().equals((Object)cf) ? 1 : 0) && Q.lIIIlIIIlIIIl(var13) && Q.lIIIlIIIlIIIl(var8)) {
                            var16 = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)var8);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (Q.lIIIlIIIllIIl(Skills.getExperience((Skill)Skill.MAGIC), var16)) {
                                    bl = lIlIIIIlIl[1];
                                    0;
                                    if (2 <= -1) {
                                        return false;
                                    }
                                } else {
                                    bl = lIlIIIIlIl[0];
                                }
                                return bl;
                            }, (int)lIlIIIIlIl[9]);
                            0;
                            Time.sleep((long)e.c(lIlIIIIlIl[39], lIlIIIIlIl[40]));
                            0;
                        }
                    }
                    if (Q.lIIIlIIIIlllI(cc ? 1 : 0)) {
                        if (Q.lIIIlIIIlIIIl(var13) && Q.lIIIlIIIlIIIl(var8) && Q.lIIIlIIIlIlII(Players.getLocal().getAnimation(), lIlIIIIlIl[27])) {
                            var16 = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)var8);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (Q.lIIIlIIIllIIl(Skills.getExperience((Skill)Skill.MAGIC), var16)) {
                                    bl = lIlIIIIlIl[1];
                                    0;
                                    
                                    }
                                } else {
                                    bl = lIlIIIIlIl[0];
                                }
                                return bl;
                            }, (int)lIlIIIIlIl[9]);
                            0;
                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (Q.lIIIlIIIlIlII(Players.getLocal().getAnimation(), lIlIIIIlIl[27])) {
                                bl = lIlIIIIlIl[1];
                                0;
                                if ((0xA2 ^ 0xA6) < ((9 ^ 0x45) & ~(0x42 ^ 0xE))) {
                                    return false;
                                }
                            } else {
                                bl = lIlIIIIlIl[0];
                            }
                            return bl;
                        }, (int)lIlIIIIlIl[41]);
                        0;
                    }
                }
            }
        }
    }

    private static int lIIIlIIIlIllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    public static boolean an() {
        if (Q.lIIIlIIIlIlII(Vars.getBit((int)lIlIIIIlIl[49]), lIlIIIIlIl[1]) && Q.lIIIlIIIIllll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[18])) {
            return lIlIIIIlIl[1];
        }
        if (Q.lIIIlIIIlIlII(Vars.getBit((int)lIlIIIIlIl[49]), lIlIIIIlIl[3]) && Q.lIIIlIIIIllll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[31]) && Q.lIIIlIIIlIIll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[18])) {
            return lIlIIIIlIl[1];
        }
        if (Q.lIIIlIIIlIlII(Vars.getBit((int)lIlIIIIlIl[49]), lIlIIIIlIl[4]) && Q.lIIIlIIIlIIll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[31]) && Q.lIIIlIIIIllll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[38])) {
            return lIlIIIIlIl[1];
        }
        if (Q.lIIIlIIIlIlII(Vars.getBit((int)lIlIIIIlIl[49]), lIlIIIIlIl[4]) && Q.lIIIlIIIlIIll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[31])) {
            int[] nArray = new int[lIlIIIIlIl[1]];
            nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[13];
            if (Q.lIIIlIIIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIlIIIIlIl[1];
            }
        }
        if (Q.lIIIlIIIlIlII(Vars.getBit((int)lIlIIIIlIl[49]), lIlIIIIlIl[7]) && Q.lIIIlIIIlIIll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[38])) {
            int[] nArray = new int[lIlIIIIlIl[1]];
            nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[13];
            if (Q.lIIIlIIIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIlIIIIlIl[1];
            }
        }
        return lIlIIIIlIl[0];
    }

    private static boolean lIIIlIIIllIII(Object object, Object object2) {
        return object == object2;
    }

    static {
        Q.lIIIlIIIIllIl();
        Q.lIIIlIIIIllII();
        cc = lIlIIIIlIl[0];
        bp = new ArrayList<d>();
        cd = new WorldArea(lIlIIIIlIl[76], lIlIIIIlIl[77], lIlIIIIlIl[52], lIlIIIIlIl[42], lIlIIIIlIl[0]);
        ce = new WorldPoint(lIlIIIIlIl[78], lIlIIIIlIl[79], lIlIIIIlIl[0]);
        cf = null;
    }

    private static String lIIIlIIIIIllI(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var17 = var6.toCharArray();
        int var3 = lIlIIIIlIl[0];
        char[] var12 = var5.toCharArray();
        int var20 = var12.length;
        int var1 = lIlIIIIlIl[0];
        while (Q.lIIIlIIIIllll(var1, var20)) {
            char var15 = var12[var1];
            var7.append((char)(var15 ^ var17[var3 % var17.length]));
            0;
            ++var3;
            ++var1;
            0;
            
            return null;
        }
        return String.valueOf(var7);
    }

    private static boolean lIIIlIIIlIIIl(Object object) {
        return object != null;
    }

    private static boolean lIIIlIIIlIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIIlIIIIllIl() {
        lIlIIIIlIl = new int[81];
        Q.lIlIIIIlIl[0] = (0x73 ^ 0x20) & ~(0xC9 ^ 0x9A);
        Q.lIlIIIIlIl[1] = 1;
        Q.lIlIIIIlIl[2] = 0x3A ^ 0xD;
        Q.lIlIIIIlIl[3] = 2;
        Q.lIlIIIIlIl[4] = 3;
        Q.lIlIIIIlIl[5] = 0xFFFFDBCA & 0x37BD;
        Q.lIlIIIIlIl[6] = 0x4C ^ 0x34 ^ (0x72 ^ 0xC);
        Q.lIlIIIIlIl[7] = 0x85 ^ 0xC4 ^ (0x67 ^ 0x22);
        Q.lIlIIIIlIl[8] = -(0xFFFFDCF1 & 0x7F9F) & (0xFFFFFFBF & 0x5EFE);
        Q.lIlIIIIlIl[9] = -(0xFFFFF50B & 0x4AF5) & (0xFFFFCFFF & 0x75DC);
        Q.lIlIIIIlIl[10] = -(0xFFFFFFFB & 0x5D55) & (0xFFFFFFFF & 0x5F7B);
        Q.lIlIIIIlIl[11] = -(0x99 ^ 0xA5) & (0xFFFF99FF & 0x6FFF);
        Q.lIlIIIIlIl[12] = -(0xFFFFE535 & 0x1FDB) & (0xFFFFC7BF & 0x3F7D);
        Q.lIlIIIIlIl[13] = 0xFFFF8A6A & 0x77BF;
        Q.lIlIIIIlIl[14] = -(0xFFFFEA7E & 0x37E5) & (0xFFFFBBFF & 0x77F7);
        Q.lIlIIIIlIl[15] = 0xFFFFF7B3 & 0xA7F;
        Q.lIlIIIIlIl[16] = -(0xFFFFDFAB & 0x22D7) & (0xFFFFF3D3 & 0x3FFF);
        Q.lIlIIIIlIl[17] = -(0xFFFFE955 & 0x36BB) & (0xFFFFFF5B & 0x3FFD);
        Q.lIlIIIIlIl[18] = 0x83 ^ 0x86;
        Q.lIlIIIIlIl[19] = 0xFFFFFD7F & 0x3FB;
        Q.lIlIIIIlIl[20] = 0x33 ^ 0x2A;
        Q.lIlIIIIlIl[21] = 0xFFFFE7FF & 0x1D6B;
        Q.lIlIIIIlIl[22] = 0xFFFFC7AD & 0x3A7E;
        Q.lIlIIIIlIl[23] = -(0xFFFFF5AF & 0x5BD7) & (0xFFFFF7B7 & 0x5BFF);
        Q.lIlIIIIlIl[24] = 0xB9 ^ 0x87;
        Q.lIlIIIIlIl[25] = 0x49 ^ 0x6C ^ (0x60 ^ 0x5A);
        Q.lIlIIIIlIl[26] = 0x6A ^ 0x6D;
        Q.lIlIIIIlIl[27] = -1;
        Q.lIlIIIIlIl[28] = 0x9A ^ 0x9D ^ (0x66 ^ 0x44);
        Q.lIlIIIIlIl[29] = 0x27 ^ 0x2F;
        Q.lIlIIIIlIl[30] = 0x30 ^ 0x1D;
        Q.lIlIIIIlIl[31] = 89 + 69 - 120 + 118 ^ 14 + 24 - -12 + 99;
        Q.lIlIIIIlIl[32] = 2 ^ 8;
        Q.lIlIIIIlIl[33] = 80 + 92 - 125 + 101 ^ 9 + 148 - 135 + 137;
        Q.lIlIIIIlIl[34] = 0xFFFFBCFB & 0x4F5E;
        Q.lIlIIIIlIl[35] = -(0xFFFFC0FD & 0x7F23) & (0xFFFFDFFF & 0x6DBF);
        Q.lIlIIIIlIl[36] = 0x1A ^ 0x16;
        Q.lIlIIIIlIl[37] = 0x63 ^ 0x5C;
        Q.lIlIIIIlIl[38] = 0x50 ^ 0x56 ^ (0x70 ^ 0x7B);
        Q.lIlIIIIlIl[39] = -(0xFFFFEDFE & 0x768D) & (0xFFFFF5CF & 0x6FFB);
        Q.lIlIIIIlIl[40] = 0xFFFF92BA & 0x6F57;
        Q.lIlIIIIlIl[41] = -(0xFFFF91B5 & 0x7E4B) & (0xFFFFBFBE & 0x5DED);
        Q.lIlIIIIlIl[42] = 9 + 40 - -79 + 28 ^ 70 + 97 - 116 + 95;
        Q.lIlIIIIlIl[43] = 1 ^ 0x37 ^ (0x24 ^ 0x1D);
        Q.lIlIIIIlIl[44] = 0x77 ^ 0x67;
        Q.lIlIIIIlIl[45] = 0xD1 ^ 0xB8 ^ (0x29 ^ 0x51);
        Q.lIlIIIIlIl[46] = 18 + 114 - 97 + 99 ^ 99 + 65 - 92 + 76;
        Q.lIlIIIIlIl[47] = 0xFFFF8F75 & 0x75EF;
        Q.lIlIIIIlIl[48] = 0x36 ^ 0x3D ^ (0x42 ^ 0x5A);
        Q.lIlIIIIlIl[49] = 0xFFFF8B9D & 0x7576;
        Q.lIlIIIIlIl[50] = -(0xFFFFFA6F & 0x6DBF) & (0xFFFFFAFF & 0x6F7F);
        Q.lIlIIIIlIl[51] = 0x2A ^ 0x30;
        Q.lIlIIIIlIl[52] = 67 + 7 - 66 + 144 ^ 80 + 113 - 86 + 33;
        Q.lIlIIIIlIl[53] = 2 ^ (0x1D ^ 0xA);
        Q.lIlIIIIlIl[54] = 133 + 64 - 64 + 68;
        Q.lIlIIIIlIl[55] = 132 + 69 - 82 + 65 ^ 113 + 44 - 66 + 83;
        Q.lIlIIIIlIl[56] = 0x98 ^ 0x8F;
        Q.lIlIIIIlIl[57] = 0x36 ^ 0x66 ^ (0x5C ^ 0x14);
        Q.lIlIIIIlIl[58] = -(0xFFFFB44B & 0x5BB7) & (0xFFFF93FE & 0x7FEB);
        Q.lIlIIIIlIl[59] = 138 + 56 - 159 + 135;
        Q.lIlIIIIlIl[60] = 0xFFFFEFF1 & 0x1FAE;
        Q.lIlIIIIlIl[61] = -(0xFFFFFFEF & 0x7819) & (0xFFFFFFFB & 0x7FDC);
        Q.lIlIIIIlIl[62] = -(0xFFFFFE3B & 0x75C7) & (0xFFFFFFFB & 0x7FBE);
        Q.lIlIIIIlIl[63] = 0xFFFFF1DC & 0x3EF7;
        Q.lIlIIIIlIl[64] = -(0xFFFFCB63 & 0x77FE) & (0xFFFFFFED & Short.MAX_VALUE);
        Q.lIlIIIIlIl[65] = 115 + 162 - 91 + 67 ^ 57 + 8 - -13 + 55;
        Q.lIlIIIIlIl[66] = 93 + 104 - 137 + 90;
        Q.lIlIIIIlIl[67] = -(0x45 ^ 0x41) & (0xFFFFBFBB & 0x7ADF);
        Q.lIlIIIIlIl[68] = 0x59 ^ 0x3D;
        Q.lIlIIIIlIl[69] = -(0xFFFFD134 & 0x7FEF) & (0xFFFFFFEF & Short.MAX_VALUE);
        Q.lIlIIIIlIl[70] = 0xFFFFF1B8 & 0x6FEF;
        Q.lIlIIIIlIl[71] = -(0xFFFFEFE1 & 0x309F) & (0xFFFFBFD7 & 0x7FEF);
        Q.lIlIIIIlIl[72] = 0xFFFFCBDF & 0x37A4;
        Q.lIlIIIIlIl[73] = 111 + 34 - 64 + 46 ^ (0xED ^ 0x89);
        Q.lIlIIIIlIl[74] = 0x87 ^ 0x9B;
        Q.lIlIIIIlIl[75] = 0x35 ^ 0x28;
        Q.lIlIIIIlIl[76] = 0xFFFFCFFF & 0x3BCE;
        Q.lIlIIIIlIl[77] = -(0xFFFFDF3D & 0x73DF) & (0xFFFFDFFF & Short.MAX_VALUE);
        Q.lIlIIIIlIl[78] = -(0xFFFFBABB & 0x5565) & (0xFFFFBBFF & 0x5FF7);
        Q.lIlIIIIlIl[79] = 0xFFFFBFED & 0x4CFB;
        Q.lIlIIIIlIl[80] = 0x17 ^ 9;
    }

    private static void ak() {
        if (Q.lIIIlIIIlIlll(Q.lIIIlIIIlIllI(e.u(), 30.0))) {
            int[] nArray = new int[lIlIIIIlIl[1]];
            nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[19];
            if (Q.lIIIlIIIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIlIIIIlIl[1]];
                nArray2[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[19];
                Inventory.getFirst((int[])nArray2).interact(lIlIIIIlII[lIlIIIIlIl[44]]);
                Time.sleepTicks((int)lIlIIIIlIl[1]);
                0;
            }
        }
        if (Q.lIIIlIIIlIlIl(Players.getLocal().getInteracting())) {
            NPC var22 = NPCs.getNearest(nPC -> {
                int n2;
                if (Q.lIIIlIIIIlllI(nPC.getName().contains(lIlIIIIlII[lIlIIIIlIl[75]]) ? 1 : 0) && Q.lIIIlIIIlIIII(nPC.isDead() ? 1 : 0)) {
                    n2 = lIlIIIIlIl[1];
                    0;
                    if ((0xA1 ^ 0xA5) <= 2) {
                        return false;
                    }
                } else {
                    n2 = lIlIIIIlIl[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[lIlIIIIlIl[3]];
            stringArray[Q.lIlIIIIlIl[0]] = lIlIIIIlII[lIlIIIIlIl[45]];
            stringArray[Q.lIlIIIIlIl[1]] = lIlIIIIlII[lIlIIIIlIl[46]];
            List llllllllllllllllllllIlIllIIlIlIl = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (Q.lIIIlIIIllIII(nPC.getInteracting(), Players.getLocal())) {
                    bl = lIlIIIIlIl[1];
                    0;
                    if (-1 != -1) {
                        return false;
                    }
                } else {
                    bl = lIlIIIIlIl[0];
                }
                return bl;
            }).collect(Collectors.toList());
            int[] nArray = new int[lIlIIIIlIl[1]];
            nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[47];
            if (Q.lIIIlIIIIlllI(Equipment.contains((int[])nArray) ? 1 : 0) && Q.lIIIlIIIlIIII(Q.an() ? 1 : 0)) {
                Q.ao();
            }
            if (Q.lIIIlIIIlIIIl(var22) && Q.lIIIlIIIlIIII(Players.getLocal().isMoving() ? 1 : 0)) {
                var22.interact(lIlIIIIlII[lIlIIIIlIl[48]]);
                Time.sleepTicks((int)lIlIIIIlIl[4]);
                0;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean am() {
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
                                                    if (!Q.lIIIlIIIIllll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[20])) break block19;
                                                    int[] nArray = new int[lIlIIIIlIl[1]];
                                                    nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[8];
                                                    if (!Q.lIIIlIIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIlIIIIlIl[1]];
                                                    nArray2[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[12];
                                                    if (!Q.lIIIlIIIIlllI(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIlIIIIlIl[1]];
                                                    nArray3[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[10];
                                                    if (!Q.lIIIlIIIIlllI(Bank.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIlIIIIlIl[1]];
                                                    nArray4[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[13];
                                                    if (!Q.lIIIlIIIIlllI(Bank.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIlIIIIlIl[1]];
                                                    nArray5[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[19];
                                                    if (!Q.lIIIlIIIIlllI(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIlIIIIlIl[1]];
                                                    nArray6[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[47];
                                                    if (!Q.lIIIlIIIlIIII(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIlIIIIlIl[1]];
                                                    nArray7[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[47];
                                                    if (!Q.lIIIlIIIIlllI(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIlIIIIlIl[1];
                                                0;
                                                if (((0xE8 ^ 0xB6 ^ (0xF9 ^ 0xAB)) & (0x4D ^ 0x13 ^ (0xDF ^ 0x8D) ^ -1)) == 0) return n5 != 0;
                                                return ((0xE7 ^ 0x93 ^ (0xDD ^ 0x81)) & (0x4B ^ 0x7C ^ (0x9D ^ 0x82) ^ -1)) != 0;
                                            }
                                            n5 = lIlIIIIlIl[0];
                                            return n5 != 0;
                                        }
                                        if (!Q.lIIIlIIIlIIll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[20]) || !Q.lIIIlIIIIllll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[2])) break block22;
                                        int[] nArray = new int[lIlIIIIlIl[1]];
                                        nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[12];
                                        if (!Q.lIIIlIIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIlIIIIlIl[1]];
                                        nArray8[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[10];
                                        if (!Q.lIIIlIIIIlllI(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIlIIIIlIl[1]];
                                        nArray9[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[13];
                                        if (!Q.lIIIlIIIIlllI(Bank.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIlIIIIlIl[1]];
                                        nArray10[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[15];
                                        if (!Q.lIIIlIIIIlllI(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIlIIIIlIl[1]];
                                        nArray11[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[47];
                                        if (!Q.lIIIlIIIlIIII(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIlIIIIlIl[1]];
                                        nArray12[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[47];
                                        if (!Q.lIIIlIIIIlllI(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIlIIIIlIl[1];
                                    0;
                                    if (((0x48 ^ 0x6E) & ~(0x8F ^ 0xA9)) == 0) return n4 != 0;
                                    return false;
                                }
                                n4 = lIlIIIIlIl[0];
                                return n4 != 0;
                            }
                            if (!Q.lIIIlIIIlIIll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[2]) || !Q.lIIIlIIIlIIII(cc ? 1 : 0)) break block25;
                            int[] nArray = new int[lIlIIIIlIl[1]];
                            nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[21];
                            if (!Q.lIIIlIIIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIlIIIIlIl[1]];
                            nArray13[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[21];
                            if (!Q.lIIIlIIIIlllI(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIlIIIIlIl[1]];
                        nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[23];
                        if (Q.lIIIlIIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIlIIIIlIl[1]];
                            nArray14[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[24];
                            if (Q.lIIIlIIIIlllI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIlIIIIlIl[1];
                                0;
                                if (((118 + 89 - 161 + 106 ^ 63 + 97 - 153 + 122) & (0x4D ^ 0x63 ^ (0xF0 ^ 0xC7) ^ -1)) == 0) return n3 != 0;
                                return false;
                            }
                        }
                    }
                    n3 = lIlIIIIlIl[0];
                    return n3 != 0;
                }
                if (!Q.lIIIlIIIlIIll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[2]) || !Q.lIIIlIIIIlllI(cc ? 1 : 0)) return lIlIIIIlIl[0];
                int[] nArray = new int[lIlIIIIlIl[1]];
                nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[21];
                if (!Q.lIIIlIIIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIlIIIIlIl[1]];
                nArray15[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[21];
                if (!Q.lIIIlIIIIlllI(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIlIIIIlIl[1]];
            nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[15];
            if (Q.lIIIlIIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIlIIIIlIl[1]];
                nArray16[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[22];
                if (Q.lIIIlIIIIlllI(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIlIIIIlIl[1]];
                    nArray17[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[22];
                    if (Q.lIIIlIIIlIIll(Bank.getFirst((int[])nArray17).getQuantity(), lIlIIIIlIl[18])) {
                        int[] nArray18 = new int[lIlIIIIlIl[1]];
                        nArray18[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[23];
                        if (Q.lIIIlIIIIlllI(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIlIIIIlIl[1]];
                            nArray19[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[24];
                            if (Q.lIIIlIIIIlllI(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIlIIIIlIl[1];
                                0;
                                if (null == null) return n2 != 0;
                                return false;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIlIIIIlIl[0];
        return n2 != 0;
    }

    private static boolean lIIIlIIIIllll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean al() {
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
                                                    if (!Q.lIIIlIIIIllll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[20])) break block19;
                                                    int[] nArray = new int[lIlIIIIlIl[1]];
                                                    nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[8];
                                                    if (!Q.lIIIlIIIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIlIIIIlIl[1]];
                                                    nArray2[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[12];
                                                    if (!Q.lIIIlIIIIlllI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIlIIIIlIl[1]];
                                                    nArray3[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[10];
                                                    if (!Q.lIIIlIIIIlllI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIlIIIIlIl[1]];
                                                    nArray4[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[13];
                                                    if (!Q.lIIIlIIIIlllI(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIlIIIIlIl[1]];
                                                    nArray5[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[19];
                                                    if (!Q.lIIIlIIIIlllI(Inventory.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIlIIIIlIl[1]];
                                                    nArray6[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[47];
                                                    if (!Q.lIIIlIIIlIIII(Inventory.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIlIIIIlIl[1]];
                                                    nArray7[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[47];
                                                    if (!Q.lIIIlIIIIlllI(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIlIIIIlIl[1];
                                                0;
                                                if (-1 <= 2) return n5 != 0;
                                                return false;
                                            }
                                            n5 = lIlIIIIlIl[0];
                                            return n5 != 0;
                                        }
                                        if (!Q.lIIIlIIIlIIll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[20]) || !Q.lIIIlIIIIllll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[2])) break block22;
                                        int[] nArray = new int[lIlIIIIlIl[1]];
                                        nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[12];
                                        if (!Q.lIIIlIIIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIlIIIIlIl[1]];
                                        nArray8[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[10];
                                        if (!Q.lIIIlIIIIlllI(Inventory.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIlIIIIlIl[1]];
                                        nArray9[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[13];
                                        if (!Q.lIIIlIIIIlllI(Inventory.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIlIIIIlIl[1]];
                                        nArray10[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[15];
                                        if (!Q.lIIIlIIIIlllI(Inventory.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIlIIIIlIl[1]];
                                        nArray11[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[47];
                                        if (!Q.lIIIlIIIlIIII(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIlIIIIlIl[1]];
                                        nArray12[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[47];
                                        if (!Q.lIIIlIIIIlllI(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIlIIIIlIl[1];
                                    0;
                                    if (1 <= (15 + 58 - -42 + 14 ^ 10 + 114 - 76 + 85)) return n4 != 0;
                                    return ((0xCB ^ 0xBA ^ (0x28 ^ 0x6D)) & (0x8D ^ 0xB5 ^ (0x87 ^ 0x8B) ^ -1)) != 0;
                                }
                                n4 = lIlIIIIlIl[0];
                                return n4 != 0;
                            }
                            if (!Q.lIIIlIIIlIIll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[2]) || !Q.lIIIlIIIlIIII(cc ? 1 : 0)) break block25;
                            int[] nArray = new int[lIlIIIIlIl[1]];
                            nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[21];
                            if (!Q.lIIIlIIIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIlIIIIlIl[1]];
                            nArray13[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[21];
                            if (!Q.lIIIlIIIIlllI(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIlIIIIlIl[1]];
                        nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[23];
                        if (Q.lIIIlIIIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIlIIIIlIl[1]];
                            nArray14[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[37];
                            if (Q.lIIIlIIIIlllI(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIlIIIIlIl[1];
                                0;
                                if (((0x32 ^ 0x39) & ~(0x71 ^ 0x7A)) == 0) return n3 != 0;
                                return false;
                            }
                        }
                    }
                    n3 = lIlIIIIlIl[0];
                    return n3 != 0;
                }
                if (!Q.lIIIlIIIlIIll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[2]) || !Q.lIIIlIIIIlllI(cc ? 1 : 0)) return lIlIIIIlIl[0];
                int[] nArray = new int[lIlIIIIlIl[1]];
                nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[21];
                if (!Q.lIIIlIIIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIlIIIIlIl[1]];
                nArray15[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[21];
                if (!Q.lIIIlIIIIlllI(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIlIIIIlIl[1]];
            nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[15];
            if (Q.lIIIlIIIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIlIIIIlIl[1]];
                nArray16[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[22];
                if (Q.lIIIlIIIIlllI(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIlIIIIlIl[1]];
                    nArray17[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[22];
                    if (Q.lIIIlIIIlIIll(Inventory.getFirst((int[])nArray17).getQuantity(), lIlIIIIlIl[18])) {
                        int[] nArray18 = new int[lIlIIIIlIl[1]];
                        nArray18[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[23];
                        if (Q.lIIIlIIIIlllI(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIlIIIIlIl[1]];
                            nArray19[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[37];
                            if (Q.lIIIlIIIIlllI(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIlIIIIlIl[1];
                                0;
                                if (2 >= ((240 + 202 - 249 + 60 ^ 179 + 148 - 253 + 114) & (68 + 37 - 47 + 69 ^ (0x7E ^ 0x40) ^ -1))) return n2 != 0;
                                return false;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIlIIIIlIl[0];
        return n2 != 0;
    }

    private static boolean lIIIlIIIlIIlI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIlIIIlIlIl(Object object) {
        return object == null;
    }

    private static boolean lIIIlIIIlIIII(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean ac() {
        return lIlIIIIlIl[0];
    }

    private static boolean lIIIlIIIllIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIIIlIIIIIlIl(String var23, String var14) {
        try {
            SecretKeySpec var24 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), lIlIIIIlIl[29]), "DES");
            Cipher var21 = Cipher.getInstance("DES");
            var21.init(lIlIIIIlIl[3], var24);
            return new String(var21.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    public static void ao() {
        if (Q.lIIIlIIIlIIIl(Widgets.get((int)lIlIIIIlIl[50], (int)lIlIIIIlIl[51]))) {
            AccBuilderShamans.c = lIlIIIIlII[lIlIIIIlIl[52]];
            Widgets.get((int)lIlIIIIlIl[50], (int)lIlIIIIlIl[51]).interact(lIlIIIIlII[lIlIIIIlIl[53]]);
            Time.sleepTicks((int)lIlIIIIlIl[7]);
            0;
        }
        if (Q.lIIIlIIIlIlIl(Widgets.get((int)lIlIIIIlIl[50], (int)lIlIIIIlIl[51])) && Q.lIIIlIIIlIIII(Widgets.get((int)lIlIIIIlIl[54]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)lIlIIIIlIl[1]);
            0;
            if (Q.lIIIlIIIIllll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[18])) {
                Widgets.get((int)lIlIIIIlIl[54], (int)lIlIIIIlIl[1]).getChild(lIlIIIIlIl[1]).interact(lIlIIIIlII[lIlIIIIlIl[55]]);
            }
            if (Q.lIIIlIIIIllll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[31]) && Q.lIIIlIIIlIIll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[18])) {
                Widgets.get((int)lIlIIIIlIl[54], (int)lIlIIIIlIl[1]).getChild(lIlIIIIlIl[3]).interact(lIlIIIIlII[lIlIIIIlIl[56]]);
            }
            if (Q.lIIIlIIIlIIll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[31]) && Q.lIIIlIIIIllll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[38])) {
                Widgets.get((int)lIlIIIIlIl[54], (int)lIlIIIIlIl[1]).getChild(lIlIIIIlIl[4]).interact(lIlIIIIlII[lIlIIIIlIl[57]]);
            }
            if (Q.lIIIlIIIlIIll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[31])) {
                int[] nArray = new int[lIlIIIIlIl[1]];
                nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[13];
                if (Q.lIIIlIIIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIlIIIIlIl[54], (int)lIlIIIIlIl[1]).getChild(lIlIIIIlIl[4]).interact(lIlIIIIlII[lIlIIIIlIl[20]]);
                }
            }
            if (Q.lIIIlIIIlIIll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[38])) {
                int[] nArray = new int[lIlIIIIlIl[1]];
                nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[13];
                if (Q.lIIIlIIIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIlIIIIlIl[54], (int)lIlIIIIlIl[1]).getChild(lIlIIIIlIl[7]).interact(lIlIIIIlII[lIlIIIIlIl[51]]);
                }
            }
            Time.sleepTicks((int)lIlIIIIlIl[1]);
            0;
        }
    }

    private static void lIIIlIIIIllII() {
        lIlIIIIlII = new String[lIlIIIIlIl[80]];
        Q.lIlIIIIlII[Q.lIlIIIIlIl[0]] = Q."Buying items";
        Q.lIlIIIIlII[Q.lIlIIIIlIl[1]] = Q."Finished buying items, switching back to magic training";
        Q.lIlIIIIlII[Q.lIlIIIIlIl[3]] = Q."Navigating to bank";
        Q.lIlIIIIlII[Q.lIlIIIIlIl[4]] = Q."Handling banking";
        Q.lIlIIIIlII[Q.lIlIIIIlIl[7]] = Q."We are missing supplies, switching to BUYING";
        Q.lIlIIIIlII[Q.lIlIIIIlIl[18]] = Q."Nav to cows";
        Q.lIlIIIIlII[Q.lIlIIIIlIl[6]] = Q."Attacking cows";
        Q.lIlIIIIlII[Q.lIlIIIIlIl[26]] = Q."Casting varrock tele";
        Q.lIlIIIIlII[Q.lIlIIIIlIl[29]] = Q."Casting lumby tele";
        Q.lIlIIIIlII[Q.lIlIIIIlIl[31]] = Q."Casting fally tele";
        Q.lIlIIIIlII[Q.lIlIIIIlIl[32]] = Q."Casting cammy tele";
        Q.lIlIIIIlII[Q.lIlIIIIlIl[33]] = Q."Alching";
        Q.lIlIIIIlII[Q.lIlIIIIlIl[36]] = Q."Wield";
        Q.lIlIIIIlII[Q.lIlIIIIlIl[38]] = Q."Move to alch spot";
        Q.lIlIIIIlII[Q.lIlIIIIlIl[42]] = Q."Nav to cows";
        Q.lIlIIIIlII[Q.lIlIIIIlIl[43]] = Q."Attacking cows";
        Q.lIlIIIIlII[Q.lIlIIIIlIl[44]] = Q."Eat";
        Q.lIlIIIIlII[Q.lIlIIIIlIl[45]] = Q."Cow";
        Q.lIlIIIIlII[Q.lIlIIIIlIl[46]] = Q."cow";
        Q.lIlIIIIlII[Q.lIlIIIIlIl[48]] = Q."Attack";
        Q.lIlIIIIlII[Q.lIlIIIIlIl[52]] = Q."Opening autocast";
        Q.lIlIIIIlII[Q.lIlIIIIlIl[53]] = Q."Choose spell";
        Q.lIlIIIIlII[Q.lIlIIIIlIl[55]] = Q."Wind Strike";
        Q.lIlIIIIlII[Q.lIlIIIIlIl[56]] = Q."Water Strike";
        Q.lIlIIIIlII[Q.lIlIIIIlIl[57]] = Q."Earth Strike";
        Q.lIlIIIIlII[Q.lIlIIIIlIl[20]] = Q."Earth Strike";
        Q.lIlIIIIlII[Q.lIlIIIIlIl[51]] = Q."Fire Strike";
        Q.lIlIIIIlII[Q.lIlIIIIlIl[73]] = Q."Magic training";
        Q.lIlIIIIlII[Q.lIlIIIIlIl[74]] = Q."ring of wealth (";
        Q.lIlIIIIlII[Q.lIlIIIIlIl[75]] = Q."Cow";
    }

    public static void aj() {
        if (Q.lIIIlIIIIlllI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (Q.lIIIlIIIlIIII(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIIIlII[lIlIIIIlIl[42]];
            Movement.walkTo((WorldPoint)ce);
            0;
            Time.sleepTicks((int)lIlIIIIlIl[1]);
            0;
        }
        if (Q.lIIIlIIIIlllI(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIIIlII[lIlIIIIlIl[43]];
            Q.ak();
        }
    }

    private static String lIIIlIIIIIlll(String var10, String var19) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var18 = Cipher.getInstance("Blowfish");
            var18.init(lIlIIIIlIl[3], var9);
            return new String(var18.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static void O() {
        d var25;
        Object var4;
        if (Q.lIIIlIIIIllll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[2])) {
            int[] nArray = new int[lIlIIIIlIl[1]];
            nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[15];
            if (Q.lIIIlIIIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new d(lIlIIIIlIl[15], lIlIIIIlIl[58], lIlIIIIlIl[59]);
                bp.add(d2);
                0;
            }
            int[] nArray2 = new int[lIlIIIIlIl[1]];
            nArray2[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[8];
            if (Q.lIIIlIIIlIIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                var4 = new d(lIlIIIIlIl[8], lIlIIIIlIl[60], lIlIIIIlIl[6]);
                bp.add((d)var4);
                0;
            }
            int[] nArray3 = new int[lIlIIIIlIl[1]];
            nArray3[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[10];
            if (Q.lIIIlIIIlIIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                var4 = new d(lIlIIIIlIl[10], lIlIIIIlIl[61], lIlIIIIlIl[6]);
                bp.add((d)var4);
                0;
            }
            int[] nArray4 = new int[lIlIIIIlIl[1]];
            nArray4[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[12];
            if (Q.lIIIlIIIlIIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                var4 = new d(lIlIIIIlIl[12], lIlIIIIlIl[62], lIlIIIIlIl[6]);
                bp.add((d)var4);
                0;
            }
            int[] nArray5 = new int[lIlIIIIlIl[1]];
            nArray5[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[13];
            if (Q.lIIIlIIIlIIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                var4 = new d(lIlIIIIlIl[13], lIlIIIIlIl[5], lIlIIIIlIl[6]);
                bp.add((d)var4);
                0;
            }
            int[] nArray6 = new int[lIlIIIIlIl[1]];
            nArray6[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[47];
            if (Q.lIIIlIIIlIIII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                var4 = new d(lIlIIIIlIl[47], lIlIIIIlIl[1], e.c(lIlIIIIlIl[63], lIlIIIIlIl[64]));
                bp.add((d)var4);
                0;
            }
        }
        if (Q.lIIIlIIIlIIll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[2])) {
            int[] nArray = new int[lIlIIIIlIl[1]];
            nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[23];
            if (Q.lIIIlIIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[lIlIIIIlIl[1]];
                nArray7[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[23];
                if (Q.lIIIlIIIIllll(Bank.getFirst((int[])nArray7).getQuantity(), lIlIIIIlIl[62])) {
                    int[] nArray8 = new int[lIlIIIIlIl[1]];
                    nArray8[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[23];
                    var4 = new d(lIlIIIIlIl[23], lIlIIIIlIl[62] - Bank.getFirst((int[])nArray8).getQuantity(), lIlIIIIlIl[65]);
                    bp.add((d)var4);
                    0;
                }
            }
            int[] nArray9 = new int[lIlIIIIlIl[1]];
            nArray9[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[23];
            if (Q.lIIIlIIIlIIII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                var4 = new d(lIlIIIIlIl[23], lIlIIIIlIl[62], lIlIIIIlIl[65]);
                bp.add((d)var4);
                0;
            }
            int[] nArray10 = new int[lIlIIIIlIl[1]];
            nArray10[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[24];
            if (Q.lIIIlIIIIlllI(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[lIlIIIIlIl[1]];
                nArray11[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[24];
                if (Q.lIIIlIIIIllll(Bank.getFirst((int[])nArray11).getQuantity(), lIlIIIIlIl[62])) {
                    int[] nArray12 = new int[lIlIIIIlIl[1]];
                    nArray12[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[24];
                    var4 = new d(lIlIIIIlIl[24], lIlIIIIlIl[62] - Bank.getFirst((int[])nArray12).getQuantity(), lIlIIIIlIl[66]);
                    bp.add((d)var4);
                    0;
                }
            }
            int[] nArray13 = new int[lIlIIIIlIl[1]];
            nArray13[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[24];
            if (Q.lIIIlIIIlIIII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                var4 = new d(lIlIIIIlIl[24], lIlIIIIlIl[62], lIlIIIIlIl[66]);
                bp.add((d)var4);
                0;
            }
            int[] nArray14 = new int[lIlIIIIlIl[1]];
            nArray14[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[21];
            if (Q.lIIIlIIIlIIII(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[lIlIIIIlIl[1]];
                nArray15[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[21];
                if (Q.lIIIlIIIlIIII(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    var4 = new d(lIlIIIIlIl[21], lIlIIIIlIl[1], lIlIIIIlIl[67]);
                    bp.add((d)var4);
                    0;
                }
            }
            if (Q.lIIIlIIIIlllI(cc ? 1 : 0)) {
                int[] nArray16 = new int[lIlIIIIlIl[1]];
                nArray16[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[15];
                if (Q.lIIIlIIIIlllI(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIlIIIIlIl[1]];
                    nArray17[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[15];
                    if (Q.lIIIlIIIIllll(Bank.getFirst((int[])nArray17).getQuantity(), lIlIIIIlIl[62])) {
                        int[] nArray18 = new int[lIlIIIIlIl[1]];
                        nArray18[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[15];
                        var4 = new d(lIlIIIIlIl[15], lIlIIIIlIl[62] - Bank.getFirst((int[])nArray18).getQuantity(), lIlIIIIlIl[59]);
                        bp.add((d)var4);
                        0;
                    }
                }
                int[] nArray19 = new int[lIlIIIIlIl[1]];
                nArray19[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[15];
                if (Q.lIIIlIIIlIIII(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    var4 = new d(lIlIIIIlIl[15], lIlIIIIlIl[62], lIlIIIIlIl[59]);
                    bp.add((d)var4);
                    0;
                }
                int[] nArray20 = new int[lIlIIIIlIl[1]];
                nArray20[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[22];
                if (Q.lIIIlIIIIlllI(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[lIlIIIIlIl[1]];
                    nArray21[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[22];
                    if (Q.lIIIlIIIIllll(Bank.getFirst((int[])nArray21).getQuantity(), lIlIIIIlIl[67])) {
                        int[] nArray22 = new int[lIlIIIIlIl[1]];
                        nArray22[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[22];
                        var4 = new d(lIlIIIIlIl[22], lIlIIIIlIl[67] - Bank.getFirst((int[])nArray22).getQuantity(), lIlIIIIlIl[6]);
                        bp.add((d)var4);
                        0;
                    }
                }
                int[] nArray23 = new int[lIlIIIIlIl[1]];
                nArray23[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[22];
                if (Q.lIIIlIIIlIIII(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    var4 = new d(lIlIIIIlIl[22], lIlIIIIlIl[67], lIlIIIIlIl[6]);
                    bp.add((d)var4);
                    0;
                }
            }
        }
        int[] nArray = new int[lIlIIIIlIl[1]];
        nArray[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[19];
        if (Q.lIIIlIIIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            var4 = new d(lIlIIIIlIl[19], lIlIIIIlIl[68], lIlIIIIlIl[39]);
            bp.add((d)var4);
            0;
        }
        if (Q.lIIIlIIIlIIII(Bank.contains(var4 = item -> item.getName().toLowerCase().contains(lIlIIIIlII[lIlIIIIlIl[74]])) ? 1 : 0)) {
            var25 = new d(lIlIIIIlIl[69], lIlIIIIlIl[18], lIlIIIIlIl[70]);
            bp.add(var25);
            0;
        }
        int[] nArray24 = new int[lIlIIIIlIl[1]];
        nArray24[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[71];
        if (Q.lIIIlIIIlIIII(Bank.contains((int[])nArray24) ? 1 : 0)) {
            var25 = new d(lIlIIIIlIl[71], lIlIIIIlIl[32], lIlIIIIlIl[72]);
            bp.add(var25);
            0;
        }
        int[] nArray25 = new int[lIlIIIIlIl[1]];
        nArray25[Q.lIlIIIIlIl[0]] = lIlIIIIlIl[17];
        if (Q.lIIIlIIIlIIII(Bank.contains((int[])nArray25) ? 1 : 0)) {
            var25 = new d(lIlIIIIlIl[17], lIlIIIIlIl[32], lIlIIIIlIl[72]);
            bp.add(var25);
            0;
        }
    }

    @Override
    public boolean af() {
        boolean bl;
        if (Q.lIIIlIIIlIIll(Skills.getLevel((Skill)Skill.MAGIC), lIlIIIIlIl[2])) {
            bl = lIlIIIIlIl[1];
            0;
            if (1 < 1) {
                return ((171 + 58 - 198 + 190 ^ 110 + 19 - -19 + 47) & (0xF ^ 0x67 ^ (0x43 ^ 0x35) ^ -1)) != 0;
            }
        } else {
            bl = lIlIIIIlIl[0];
        }
        return bl;
    }

    @Override
    public String ae() {
        return lIlIIIIlII[lIlIIIIlIl[73]];
    }

    private static boolean lIIIlIIIIlllI(int n2) {
        return n2 != 0;
    }
}

