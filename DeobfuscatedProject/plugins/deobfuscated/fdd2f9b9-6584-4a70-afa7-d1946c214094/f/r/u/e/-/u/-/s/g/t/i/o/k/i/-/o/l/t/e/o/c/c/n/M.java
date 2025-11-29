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
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.b;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.d;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.v;
import gg.squire.account.AccBuilderRogues;
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

public class M
implements G {
    public static /* synthetic */ boolean bu;
    static /* synthetic */ WorldArea bw;
    private static /* synthetic */ int[] lIIlllllll;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ String[] lIIllllllI;
    static /* synthetic */ WorldPoint by;
    static /* synthetic */ WorldPoint bx;
    public static /* synthetic */ boolean bt;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
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
                                                    if (!M.lIIIIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[20])) break block19;
                                                    int[] nArray = new int[lIIlllllll[1]];
                                                    nArray[M.lIIlllllll[0]] = lIIlllllll[8];
                                                    if (!M.lIIIIlllIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIIlllllll[1]];
                                                    nArray2[M.lIIlllllll[0]] = lIIlllllll[12];
                                                    if (!M.lIIIIlllIIlII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIIlllllll[1]];
                                                    nArray3[M.lIIlllllll[0]] = lIIlllllll[10];
                                                    if (!M.lIIIIlllIIlII(Inventory.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIIlllllll[1]];
                                                    nArray4[M.lIIlllllll[0]] = lIIlllllll[13];
                                                    if (!M.lIIIIlllIIlII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIIlllllll[1]];
                                                    nArray5[M.lIIlllllll[0]] = lIIlllllll[19];
                                                    if (!M.lIIIIlllIIlII(Inventory.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIIlllllll[1]];
                                                    nArray6[M.lIIlllllll[0]] = lIIlllllll[47];
                                                    if (!M.lIIIIlllIIllI(Inventory.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIIlllllll[1]];
                                                    nArray7[M.lIIlllllll[0]] = lIIlllllll[47];
                                                    if (!M.lIIIIlllIIlII(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIIlllllll[1];
                                                0;
                                                if ((4 ^ 0) > -1) return n5 != 0;
                                                return ((0x4C ^ 0x7C) & ~(0x32 ^ 2)) != 0;
                                            }
                                            n5 = lIIlllllll[0];
                                            return n5 != 0;
                                        }
                                        if (!M.lIIIIlllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[20]) || !M.lIIIIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[7])) break block22;
                                        int[] nArray = new int[lIIlllllll[1]];
                                        nArray[M.lIIlllllll[0]] = lIIlllllll[12];
                                        if (!M.lIIIIlllIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIIlllllll[1]];
                                        nArray8[M.lIIlllllll[0]] = lIIlllllll[10];
                                        if (!M.lIIIIlllIIlII(Inventory.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIIlllllll[1]];
                                        nArray9[M.lIIlllllll[0]] = lIIlllllll[13];
                                        if (!M.lIIIIlllIIlII(Inventory.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIIlllllll[1]];
                                        nArray10[M.lIIlllllll[0]] = lIIlllllll[15];
                                        if (!M.lIIIIlllIIlII(Inventory.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIIlllllll[1]];
                                        nArray11[M.lIIlllllll[0]] = lIIlllllll[47];
                                        if (!M.lIIIIlllIIllI(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIIlllllll[1]];
                                        nArray12[M.lIIlllllll[0]] = lIIlllllll[47];
                                        if (!M.lIIIIlllIIlII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIIlllllll[1];
                                    0;
                                    if (2 <= 2) return n4 != 0;
                                    return ((0x20 ^ 0x41 ^ (6 ^ 0x49)) & (0xD ^ 0x78 ^ (0x4B ^ 0x10) ^ -1)) != 0;
                                }
                                n4 = lIIlllllll[0];
                                return n4 != 0;
                            }
                            if (!M.lIIIIlllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[7]) || !M.lIIIIlllIIllI(bu ? 1 : 0)) break block25;
                            int[] nArray = new int[lIIlllllll[1]];
                            nArray[M.lIIlllllll[0]] = lIIlllllll[21];
                            if (!M.lIIIIlllIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIIlllllll[1]];
                            nArray13[M.lIIlllllll[0]] = lIIlllllll[21];
                            if (!M.lIIIIlllIIlII(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIIlllllll[1]];
                        nArray[M.lIIlllllll[0]] = lIIlllllll[23];
                        if (M.lIIIIlllIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIIlllllll[1]];
                            nArray14[M.lIIlllllll[0]] = lIIlllllll[37];
                            if (M.lIIIIlllIIlII(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIIlllllll[1];
                                0;
                                if (null == null) return n3 != 0;
                                return ((0x90 ^ 0xBE) & ~(0x29 ^ 7)) != 0;
                            }
                        }
                    }
                    n3 = lIIlllllll[0];
                    return n3 != 0;
                }
                if (!M.lIIIIlllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[7]) || !M.lIIIIlllIIlII(bu ? 1 : 0)) return lIIlllllll[0];
                int[] nArray = new int[lIIlllllll[1]];
                nArray[M.lIIlllllll[0]] = lIIlllllll[21];
                if (!M.lIIIIlllIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIIlllllll[1]];
                nArray15[M.lIIlllllll[0]] = lIIlllllll[21];
                if (!M.lIIIIlllIIlII(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIIlllllll[1]];
            nArray[M.lIIlllllll[0]] = lIIlllllll[15];
            if (M.lIIIIlllIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIIlllllll[1]];
                nArray16[M.lIIlllllll[0]] = lIIlllllll[22];
                if (M.lIIIIlllIIlII(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIlllllll[1]];
                    nArray17[M.lIIlllllll[0]] = lIIlllllll[22];
                    if (M.lIIIIlllIlIIl(Inventory.getFirst((int[])nArray17).getQuantity(), lIIlllllll[18])) {
                        int[] nArray18 = new int[lIIlllllll[1]];
                        nArray18[M.lIIlllllll[0]] = lIIlllllll[23];
                        if (M.lIIIIlllIIlII(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIIlllllll[1]];
                            nArray19[M.lIIlllllll[0]] = lIIlllllll[37];
                            if (M.lIIIIlllIIlII(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIIlllllll[1];
                                0;
                                if (null == null) return n2 != 0;
                                return ((0x15 ^ 5) & ~(0x65 ^ 0x75)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIlllllll[0];
        return n2 != 0;
    }

    public static void Y() {
        if (M.lIIIIlllIIlII(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIllllllI[lIIlllllll[0]];
            b.a(bv);
            if (M.lIIIIlllIIlIl(bv.size(), lIIlllllll[1])) {
                System.out.println(lIIllllllI[lIIlllllll[1]]);
                bt = lIIlllllll[0];
            }
        }
        if (M.lIIIIlllIIllI(bt ? 1 : 0)) {
            BankLocation llllllllllllllllllllIllIlIllIIll;
            if (M.lIIIIlllIIllI(M.ab() ? 1 : 0)) {
                llllllllllllllllllllIllIlIllIIll = BankLocation.getNearest();
                if (M.lIIIIlllIIlll(llllllllllllllllllllIllIlIllIIll) && M.lIIIIlllIIllI(llllllllllllllllllllIllIlIllIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllllllI[lIIlllllll[2]];
                    a.a(llllllllllllllllllllIllIlIllIIll);
                }
                if (M.lIIIIlllIIlll(llllllllllllllllllllIllIlIllIIll) && M.lIIIIlllIIlII(llllllllllllllllllllIllIlIllIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllllllI[lIIlllllll[3]];
                    if (M.lIIIIlllIIllI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlllllll[4]);
                        0;
                        Time.sleepTicks((int)lIIlllllll[5]);
                        0;
                    }
                    if (M.lIIIIlllIIlII(Bank.isOpen() ? 1 : 0)) {
                        if (M.lIIIIlllIlIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIlllllll[6]);
                            0;
                        }
                        while (M.lIIIIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[7]) && M.lIIIIlllIIllI(v.aX() ? 1 : 0)) {
                            v.aV();
                            Time.sleepTicks((int)lIIlllllll[1]);
                            0;
                            0;
                            if (1 >= 0) continue;
                            return;
                        }
                        if (M.lIIIIlllIIllI(M.ac() ? 1 : 0)) {
                            M.af();
                            System.out.println(lIIllllllI[lIIlllllll[6]]);
                            bt = lIIlllllll[1];
                            return;
                        }
                        if (M.lIIIIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[7])) {
                            int[] nArray = new int[lIIlllllll[1]];
                            nArray[M.lIIlllllll[0]] = lIIlllllll[8];
                            if (M.lIIIIlllIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIIlllllll[1]];
                                nArray2[M.lIIlllllll[0]] = lIIlllllll[8];
                                if (M.lIIIIlllIIlIl(Inventory.getCount((int[])nArray2), lIIlllllll[1])) {
                                    Bank.withdraw((int)lIIlllllll[8], (int)lIIlllllll[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIlllllll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlllllll[1]];
                                        nArray[M.lIIlllllll[0]] = lIIlllllll[8];
                                        if (M.lIIIIlllIlIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlllllll[1];
                                            0;
                                            if (null != null) {
                                                return ((0x76 ^ 0x26) & ~(0x6D ^ 0x3D)) != 0;
                                            }
                                        } else {
                                            bl = lIIlllllll[0];
                                        }
                                        return bl;
                                    }, (int)lIIlllllll[4]);
                                    0;
                                }
                            }
                            int[] nArray3 = new int[lIIlllllll[1]];
                            nArray3[M.lIIlllllll[0]] = lIIlllllll[10];
                            if (M.lIIIIlllIIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIIlllllll[1]];
                                nArray4[M.lIIlllllll[0]] = lIIlllllll[10];
                                if (M.lIIIIlllIIlIl(Inventory.getCount((int[])nArray4), lIIlllllll[1])) {
                                    Bank.withdraw((int)lIIlllllll[10], (int)lIIlllllll[11], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIlllllll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlllllll[1]];
                                        nArray[M.lIIlllllll[0]] = lIIlllllll[10];
                                        if (M.lIIIIlllIlIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlllllll[1];
                                            0;
                                            if (null != null) {
                                                return ((3 ^ (0x25 ^ 9)) & (0xDA ^ 0xAC ^ (0xF4 ^ 0xAD) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIlllllll[0];
                                        }
                                        return bl;
                                    }, (int)lIIlllllll[4]);
                                    0;
                                }
                            }
                            int[] nArray5 = new int[lIIlllllll[1]];
                            nArray5[M.lIIlllllll[0]] = lIIlllllll[12];
                            if (M.lIIIIlllIIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIIlllllll[1]];
                                nArray6[M.lIIlllllll[0]] = lIIlllllll[12];
                                if (M.lIIIIlllIIlIl(Inventory.getCount((int[])nArray6), lIIlllllll[1])) {
                                    Bank.withdraw((int)lIIlllllll[12], (int)lIIlllllll[11], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIlllllll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlllllll[1]];
                                        nArray[M.lIIlllllll[0]] = lIIlllllll[12];
                                        if (M.lIIIIlllIlIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlllllll[1];
                                            0;
                                            if (1 < ((0x37 ^ 0x16) & ~(0x96 ^ 0xB7))) {
                                                return ((0x35 ^ 0x23) & ~(0xA1 ^ 0xB7)) != 0;
                                            }
                                        } else {
                                            bl = lIIlllllll[0];
                                        }
                                        return bl;
                                    }, (int)lIIlllllll[4]);
                                    0;
                                }
                            }
                            int[] nArray7 = new int[lIIlllllll[1]];
                            nArray7[M.lIIlllllll[0]] = lIIlllllll[13];
                            if (M.lIIIIlllIIlII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIIlllllll[1]];
                                nArray8[M.lIIlllllll[0]] = lIIlllllll[13];
                                if (M.lIIIIlllIIlIl(Inventory.getCount((int[])nArray8), lIIlllllll[1])) {
                                    Bank.withdraw((int)lIIlllllll[13], (int)lIIlllllll[14], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIlllllll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlllllll[1]];
                                        nArray[M.lIIlllllll[0]] = lIIlllllll[13];
                                        if (M.lIIIIlllIlIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlllllll[1];
                                            0;
                                            if ((45 + 165 - 22 + 6 ^ 72 + 143 - 158 + 141) < 2) {
                                                return ((0x4C ^ 7 ^ (0x5B ^ 0x5F)) & (0x15 ^ 9 ^ (0x48 ^ 0x1B) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIlllllll[0];
                                        }
                                        return bl;
                                    }, (int)lIIlllllll[4]);
                                    0;
                                }
                            }
                            int[] nArray9 = new int[lIIlllllll[1]];
                            nArray9[M.lIIlllllll[0]] = lIIlllllll[15];
                            if (M.lIIIIlllIIlII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIIlllllll[1]];
                                nArray10[M.lIIlllllll[0]] = lIIlllllll[15];
                                if (M.lIIIIlllIIlIl(Inventory.getCount((int[])nArray10), lIIlllllll[1])) {
                                    Bank.withdraw((int)lIIlllllll[15], (int)lIIlllllll[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIlllllll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlllllll[1]];
                                        nArray[M.lIIlllllll[0]] = lIIlllllll[15];
                                        if (M.lIIIIlllIlIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlllllll[1];
                                            0;
                                            if (1 < 0) {
                                                return ((0x69 ^ 0x5E) & ~(6 ^ 0x31)) != 0;
                                            }
                                        } else {
                                            bl = lIIlllllll[0];
                                        }
                                        return bl;
                                    }, (int)lIIlllllll[4]);
                                    0;
                                }
                            }
                            int[] nArray11 = new int[lIIlllllll[1]];
                            nArray11[M.lIIlllllll[0]] = lIIlllllll[16];
                            if (M.lIIIIlllIIlII(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[lIIlllllll[1]];
                                nArray12[M.lIIlllllll[0]] = lIIlllllll[16];
                                if (M.lIIIIlllIIllI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    Bank.withdraw((int)lIIlllllll[16], (int)lIIlllllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIlllllll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[lIIlllllll[1]];
                                        nArray[M.lIIlllllll[0]] = lIIlllllll[16];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)lIIlllllll[4]);
                                    0;
                                }
                            }
                            Bank.withdraw((int)lIIlllllll[17], (int)lIIlllllll[18], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            int[] nArray13 = new int[lIIlllllll[1]];
                            nArray13[M.lIIlllllll[0]] = lIIlllllll[19];
                            if (M.lIIIIlllIIlII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                int[] nArray14 = new int[lIIlllllll[1]];
                                nArray14[M.lIIlllllll[0]] = lIIlllllll[19];
                                if (M.lIIIIlllIIlIl(Inventory.getCount((int[])nArray14), lIIlllllll[1]) && M.lIIIIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[20])) {
                                    Bank.withdrawAll((int)lIIlllllll[19], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIlllllll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlllllll[1]];
                                        nArray[M.lIIlllllll[0]] = lIIlllllll[19];
                                        if (M.lIIIIlllIlIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlllllll[1];
                                            0;
                                            if (-3 >= 0) {
                                                return ((0xD3 ^ 0x86) & ~(0x91 ^ 0xC4)) != 0;
                                            }
                                        } else {
                                            bl = lIIlllllll[0];
                                        }
                                        return bl;
                                    }, (int)lIIlllllll[4]);
                                    0;
                                }
                            }
                        }
                        if (M.lIIIIlllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[7])) {
                            int[] nArray = new int[lIIlllllll[1]];
                            nArray[M.lIIlllllll[0]] = lIIlllllll[21];
                            if (M.lIIIIlllIIllI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)lIIlllllll[21], (int)lIIlllllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIlllllll[1]);
                                0;
                            }
                            if (M.lIIIIlllIIlII(bu ? 1 : 0)) {
                                Bank.withdrawAll((int)lIIlllllll[22], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIlllllll[1]);
                                0;
                                Bank.withdrawAll((int)lIIlllllll[15], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIlllllll[1]);
                                0;
                            }
                            Time.sleepTicks((int)lIIlllllll[3]);
                            0;
                            Bank.withdrawAll((int)lIIlllllll[23], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIIlllllll[1]);
                            0;
                            Bank.withdrawAll((int)lIIlllllll[24], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)lIIlllllll[1]);
                            0;
                        }
                    }
                }
            }
            if (M.lIIIIlllIIlII(M.ab() ? 1 : 0)) {
                if (M.lIIIIlllIIlII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (M.lIIIIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[20])) {
                    if (M.lIIIIlllIIllI(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIllllllI[lIIlllllll[18]];
                        Movement.walkTo((WorldPoint)bx);
                        0;
                        Time.sleepTicks((int)lIIlllllll[1]);
                        0;
                    }
                    if (M.lIIIIlllIIlII(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIllllllI[lIIlllllll[5]];
                        M.aa();
                    }
                }
                if (M.lIIIIlllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[20]) && M.lIIIIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[25])) {
                    AccBuilderRogues.c = lIIllllllI[lIIlllllll[26]];
                    if (M.lIIIIlllIlIlI(Players.getLocal().getAnimation(), lIIlllllll[27])) {
                        Magic.cast((Spell)SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks((int)lIIlllllll[1]);
                        0;
                    }
                }
                if (M.lIIIIlllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[25]) && M.lIIIIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[28])) {
                    AccBuilderRogues.c = lIIllllllI[lIIlllllll[29]];
                    if (M.lIIIIlllIlIlI(Players.getLocal().getAnimation(), lIIlllllll[27])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)lIIlllllll[1]);
                        0;
                    }
                }
                if (M.lIIIIlllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[28]) && M.lIIIIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[30])) {
                    AccBuilderRogues.c = lIIllllllI[lIIlllllll[31]];
                    if (M.lIIIIlllIlIlI(Players.getLocal().getAnimation(), lIIlllllll[27])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)lIIlllllll[1]);
                        0;
                    }
                }
                if (M.lIIIIlllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[30]) && M.lIIIIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[7])) {
                    AccBuilderRogues.c = lIIllllllI[lIIlllllll[32]];
                    if (M.lIIIIlllIlIlI(Players.getLocal().getAnimation(), lIIlllllll[27])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)lIIlllllll[1]);
                        0;
                    }
                }
                if (M.lIIIIlllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[7])) {
                    int llllllllllllllllllllIllIlIllIIIl;
                    AccBuilderRogues.c = lIIllllllI[lIIlllllll[33]];
                    if (M.lIIIIlllIlIll(by)) {
                        by = new WorldPoint(lIIlllllll[34] + e.c(lIIlllllll[1], lIIlllllll[6]), lIIlllllll[35], lIIlllllll[0]);
                    }
                    int[] nArray = new int[lIIlllllll[1]];
                    nArray[M.lIIlllllll[0]] = lIIlllllll[21];
                    if (M.lIIIIlllIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray15 = new int[lIIlllllll[1]];
                        nArray15[M.lIIlllllll[0]] = lIIlllllll[21];
                        if (M.lIIIIlllIIllI(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[lIIlllllll[1]];
                            nArray16[M.lIIlllllll[0]] = lIIlllllll[21];
                            Inventory.getFirst((int[])nArray16).interact(lIIllllllI[lIIlllllll[36]]);
                            Time.sleepTicks((int)lIIlllllll[1]);
                            0;
                        }
                    }
                    if (M.lIIIIlllIIlII(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[lIIlllllll[1]];
                    nArray17[M.lIIlllllll[0]] = lIIlllllll[23];
                    llllllllllllllllllllIllIlIllIIll = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[lIIlllllll[1]];
                    nArray18[M.lIIlllllll[0]] = lIIlllllll[37];
                    Item llllllllllllllllllllIllIlIllIIlI = Inventory.getFirst((int[])nArray18);
                    if (M.lIIIIlllIIllI(bu ? 1 : 0) && M.lIIIIlllIIlll(by)) {
                        if (M.lIIIIlllIIllI(Players.getLocal().getWorldLocation().equals((Object)by) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIllllllI[lIIlllllll[38]];
                            Movement.walkTo((WorldPoint)by);
                            0;
                            Time.sleepTicks((int)lIIlllllll[1]);
                            0;
                        }
                        if (M.lIIIIlllIIlII(Players.getLocal().getWorldLocation().equals((Object)by) ? 1 : 0) && M.lIIIIlllIIlll(llllllllllllllllllllIllIlIllIIll) && M.lIIIIlllIIlll(llllllllllllllllllllIllIlIllIIlI)) {
                            llllllllllllllllllllIllIlIllIIIl = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)llllllllllllllllllllIllIlIllIIlI);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (M.lIIIIlllIllll(Skills.getExperience((Skill)Skill.MAGIC), llllllllllllllllllllIllIlIllIIIl)) {
                                    bl = lIIlllllll[1];
                                    0;
                                    if (3 < 3) {
                                        return (3 & (3 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIlllllll[0];
                                }
                                return bl;
                            }, (int)lIIlllllll[9]);
                            0;
                            Time.sleep((long)e.c(lIIlllllll[39], lIIlllllll[40]));
                            0;
                        }
                    }
                    if (M.lIIIIlllIIlII(bu ? 1 : 0)) {
                        if (M.lIIIIlllIIlll(llllllllllllllllllllIllIlIllIIll) && M.lIIIIlllIIlll(llllllllllllllllllllIllIlIllIIlI) && M.lIIIIlllIlIlI(Players.getLocal().getAnimation(), lIIlllllll[27])) {
                            llllllllllllllllllllIllIlIllIIIl = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)llllllllllllllllllllIllIlIllIIlI);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (M.lIIIIlllIllll(Skills.getExperience((Skill)Skill.MAGIC), llllllllllllllllllllIllIlIllIIIl)) {
                                    bl = lIIlllllll[1];
                                    0;
                                    if (3 < 0) {
                                        return ((0xA8 ^ 0x8A) & ~(0x32 ^ 0x10)) != 0;
                                    }
                                } else {
                                    bl = lIIlllllll[0];
                                }
                                return bl;
                            }, (int)lIIlllllll[9]);
                            0;
                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (M.lIIIIlllIlIlI(Players.getLocal().getAnimation(), lIIlllllll[27])) {
                                bl = lIIlllllll[1];
                                0;
                                if (((1 ^ 0xC) & ~(0x1A ^ 0x17)) > 1) {
                                    return ((0xF9 ^ 0xA4) & ~(0xFF ^ 0xA2)) != 0;
                                }
                            } else {
                                bl = lIIlllllll[0];
                            }
                            return bl;
                        }, (int)lIIlllllll[41]);
                        0;
                    }
                }
            }
        }
    }

    private static boolean lIIIIlllIlIII(int n2) {
        return n2 > 0;
    }

    private static void aa() {
        if (M.lIIIIlllIllIl(M.lIIIIlllIllII(e.u(), 30.0))) {
            int[] nArray = new int[lIIlllllll[1]];
            nArray[M.lIIlllllll[0]] = lIIlllllll[19];
            if (M.lIIIIlllIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIlllllll[1]];
                nArray2[M.lIIlllllll[0]] = lIIlllllll[19];
                Inventory.getFirst((int[])nArray2).interact(lIIllllllI[lIIlllllll[44]]);
                Time.sleepTicks((int)lIIlllllll[1]);
                0;
            }
        }
        if (M.lIIIIlllIlIll(Players.getLocal().getInteracting())) {
            NPC llllllllllllllllllllIllIlIlIlllI = NPCs.getNearest(nPC -> {
                int n2;
                if (M.lIIIIlllIIlII(nPC.getName().contains(lIIllllllI[lIIlllllll[76]]) ? 1 : 0) && M.lIIIIlllIIllI(nPC.isDead() ? 1 : 0)) {
                    n2 = lIIlllllll[1];
                    0;
                    if (null != null) {
                        return ((0xDC ^ 0x95 ^ (0x2D ^ 0x4D)) & (91 + 96 - 80 + 38 ^ 180 + 103 - 191 + 92 ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIlllllll[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[lIIlllllll[2]];
            stringArray[M.lIIlllllll[0]] = lIIllllllI[lIIlllllll[45]];
            stringArray[M.lIIlllllll[1]] = lIIllllllI[lIIlllllll[46]];
            List llllllllllllllllllllIllIlIlIllIl = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (M.lIIIIlllIlllI(nPC.getInteracting(), Players.getLocal())) {
                    bl = lIIlllllll[1];
                    0;
                    if (-3 >= 0) {
                        return ((0x9C ^ 0x8F ^ (0xCE ^ 0x83)) & (220 + 80 - 96 + 36 ^ 74 + 81 - 89 + 108 ^ -1)) != 0;
                    }
                } else {
                    bl = lIIlllllll[0];
                }
                return bl;
            }).collect(Collectors.toList());
            int[] nArray = new int[lIIlllllll[1]];
            nArray[M.lIIlllllll[0]] = lIIlllllll[47];
            if (M.lIIIIlllIIlII(Equipment.contains((int[])nArray) ? 1 : 0) && M.lIIIIlllIIllI(M.ad() ? 1 : 0)) {
                M.ae();
            }
            if (M.lIIIIlllIIlll(llllllllllllllllllllIllIlIlIlllI) && M.lIIIIlllIIllI(Players.getLocal().isMoving() ? 1 : 0)) {
                llllllllllllllllllllIllIlIlIlllI.interact(lIIllllllI[lIIlllllll[48]]);
                Time.sleepTicks((int)lIIlllllll[3]);
                0;
            }
        }
    }

    @Override
    public boolean S() {
        return lIIlllllll[0];
    }

    private static void lIIIIlllIIIlI() {
        lIIllllllI = new String[lIIlllllll[81]];
        M.lIIllllllI[M.lIIlllllll[0]] = M."Buying items";
        M.lIIllllllI[M.lIIlllllll[1]] = M."Finished buying items, switching back to magic training";
        M.lIIllllllI[M.lIIlllllll[2]] = M."Navigating to bank";
        M.lIIllllllI[M.lIIlllllll[3]] = M."Handling banking";
        M.lIIllllllI[M.lIIlllllll[6]] = M."We are missing supplies, switching to BUYING";
        M.lIIllllllI[M.lIIlllllll[18]] = M."Nav to cows";
        M.lIIllllllI[M.lIIlllllll[5]] = M."Attacking cows";
        M.lIIllllllI[M.lIIlllllll[26]] = M."Casting varrock tele";
        M.lIIllllllI[M.lIIlllllll[29]] = M."Casting lumby tele";
        M.lIIllllllI[M.lIIlllllll[31]] = M."Casting fally tele";
        M.lIIllllllI[M.lIIlllllll[32]] = M."Casting cammy tele";
        M.lIIllllllI[M.lIIlllllll[33]] = M."Alching";
        M.lIIllllllI[M.lIIlllllll[36]] = M."Wield";
        M.lIIllllllI[M.lIIlllllll[38]] = M."Move to alch spot";
        M.lIIllllllI[M.lIIlllllll[42]] = M."Nav to cows";
        M.lIIllllllI[M.lIIlllllll[43]] = M."Attacking cows";
        M.lIIllllllI[M.lIIlllllll[44]] = M."Eat";
        M.lIIllllllI[M.lIIlllllll[45]] = M."Cow";
        M.lIIllllllI[M.lIIlllllll[46]] = M."cow";
        M.lIIllllllI[M.lIIlllllll[48]] = M."Attack";
        M.lIIllllllI[M.lIIlllllll[52]] = M."Opening autocast";
        M.lIIllllllI[M.lIIlllllll[53]] = M."Choose spell";
        M.lIIllllllI[M.lIIlllllll[55]] = M."Wind Strike";
        M.lIIllllllI[M.lIIlllllll[56]] = M."Water Strike";
        M.lIIllllllI[M.lIIlllllll[57]] = M."Earth Strike";
        M.lIIllllllI[M.lIIlllllll[20]] = M."Earth Strike";
        M.lIIllllllI[M.lIIlllllll[51]] = M."Fire Strike";
        M.lIIllllllI[M.lIIlllllll[73]] = M."Magic training";
        M.lIIllllllI[M.lIIlllllll[75]] = M."ring of wealth (";
        M.lIIllllllI[M.lIIlllllll[76]] = M."Cow";
    }

    private static boolean lIIIIlllIIlll(Object object) {
        return object != null;
    }

    @Override
    public int T() {
        try {
            M.Y();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x1D ^ 0x34) & ~(0x85 ^ 0xAC)) >= (0x9D ^ 0x99)) {
            return (1 ^ 0x5A) & ~(0x60 ^ 0x3B);
        }
        return lIIlllllll[68];
    }

    private static String lIIIIlllIIIIl(String llllllllllllllllllllIllIlIIlIlll, String llllllllllllllllllllIllIlIIlIllI) {
        try {
            SecretKeySpec llllllllllllllllllllIllIlIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIllIlIIlIllI.getBytes(StandardCharsets.UTF_8)), lIIlllllll[29]), "DES");
            Cipher llllllllllllllllllllIllIlIIllIIl = Cipher.getInstance("DES");
            llllllllllllllllllllIllIlIIllIIl.init(lIIlllllll[2], llllllllllllllllllllIllIlIIllIlI);
            return new String(llllllllllllllllllllIllIlIIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIllIlIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllllIllIlIIllIII) {
            llllllllllllllllllllIllIlIIllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIlllIIllI(int n2) {
        return n2 == 0;
    }

    private static int lIIIIlllIllII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    static {
        M.lIIIIlllIIIll();
        M.lIIIIlllIIIlI();
        bu = lIIlllllll[0];
        bv = new ArrayList<d>();
        bw = new WorldArea(lIIlllllll[77], lIIlllllll[78], lIIlllllll[52], lIIlllllll[42], lIIlllllll[0]);
        bx = new WorldPoint(lIIlllllll[79], lIIlllllll[80], lIIlllllll[0]);
        by = null;
    }

    @Override
    public String U() {
        return lIIllllllI[lIIlllllll[73]];
    }

    private static boolean lIIIIlllIlIll(Object object) {
        return object == null;
    }

    private static void af() {
        d llllllllllllllllllllIllIlIlIlIIl;
        Object llllllllllllllllllllIllIlIlIlIlI;
        if (M.lIIIIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[7])) {
            int[] nArray = new int[lIIlllllll[1]];
            nArray[M.lIIlllllll[0]] = lIIlllllll[15];
            if (M.lIIIIlllIIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new d(lIIlllllll[15], lIIlllllll[58], lIIlllllll[59]);
                bv.add(d2);
                0;
            }
            int[] nArray2 = new int[lIIlllllll[1]];
            nArray2[M.lIIlllllll[0]] = lIIlllllll[8];
            if (M.lIIIIlllIIllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                llllllllllllllllllllIllIlIlIlIlI = new d(lIIlllllll[8], lIIlllllll[60], lIIlllllll[5]);
                bv.add((d)llllllllllllllllllllIllIlIlIlIlI);
                0;
            }
            int[] nArray3 = new int[lIIlllllll[1]];
            nArray3[M.lIIlllllll[0]] = lIIlllllll[10];
            if (M.lIIIIlllIIllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                llllllllllllllllllllIllIlIlIlIlI = new d(lIIlllllll[10], lIIlllllll[61], lIIlllllll[5]);
                bv.add((d)llllllllllllllllllllIllIlIlIlIlI);
                0;
            }
            int[] nArray4 = new int[lIIlllllll[1]];
            nArray4[M.lIIlllllll[0]] = lIIlllllll[12];
            if (M.lIIIIlllIIllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                llllllllllllllllllllIllIlIlIlIlI = new d(lIIlllllll[12], lIIlllllll[62], lIIlllllll[5]);
                bv.add((d)llllllllllllllllllllIllIlIlIlIlI);
                0;
            }
            int[] nArray5 = new int[lIIlllllll[1]];
            nArray5[M.lIIlllllll[0]] = lIIlllllll[13];
            if (M.lIIIIlllIIllI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                llllllllllllllllllllIllIlIlIlIlI = new d(lIIlllllll[13], lIIlllllll[4], lIIlllllll[5]);
                bv.add((d)llllllllllllllllllllIllIlIlIlIlI);
                0;
            }
            int[] nArray6 = new int[lIIlllllll[1]];
            nArray6[M.lIIlllllll[0]] = lIIlllllll[47];
            if (M.lIIIIlllIIllI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                llllllllllllllllllllIllIlIlIlIlI = new d(lIIlllllll[47], lIIlllllll[1], e.c(lIIlllllll[63], lIIlllllll[64]));
                bv.add((d)llllllllllllllllllllIllIlIlIlIlI);
                0;
            }
        }
        if (M.lIIIIlllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[7])) {
            int[] nArray = new int[lIIlllllll[1]];
            nArray[M.lIIlllllll[0]] = lIIlllllll[23];
            if (M.lIIIIlllIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[lIIlllllll[1]];
                nArray7[M.lIIlllllll[0]] = lIIlllllll[23];
                if (M.lIIIIlllIIlIl(Bank.getFirst((int[])nArray7).getQuantity(), lIIlllllll[62])) {
                    int[] nArray8 = new int[lIIlllllll[1]];
                    nArray8[M.lIIlllllll[0]] = lIIlllllll[23];
                    llllllllllllllllllllIllIlIlIlIlI = new d(lIIlllllll[23], lIIlllllll[62] - Bank.getFirst((int[])nArray8).getQuantity(), lIIlllllll[65]);
                    bv.add((d)llllllllllllllllllllIllIlIlIlIlI);
                    0;
                }
            }
            int[] nArray9 = new int[lIIlllllll[1]];
            nArray9[M.lIIlllllll[0]] = lIIlllllll[23];
            if (M.lIIIIlllIIllI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                llllllllllllllllllllIllIlIlIlIlI = new d(lIIlllllll[23], lIIlllllll[62], lIIlllllll[65]);
                bv.add((d)llllllllllllllllllllIllIlIlIlIlI);
                0;
            }
            int[] nArray10 = new int[lIIlllllll[1]];
            nArray10[M.lIIlllllll[0]] = lIIlllllll[24];
            if (M.lIIIIlllIIlII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[lIIlllllll[1]];
                nArray11[M.lIIlllllll[0]] = lIIlllllll[24];
                if (M.lIIIIlllIIlIl(Bank.getFirst((int[])nArray11).getQuantity(), lIIlllllll[62])) {
                    int[] nArray12 = new int[lIIlllllll[1]];
                    nArray12[M.lIIlllllll[0]] = lIIlllllll[24];
                    llllllllllllllllllllIllIlIlIlIlI = new d(lIIlllllll[24], lIIlllllll[62] - Bank.getFirst((int[])nArray12).getQuantity(), lIIlllllll[66]);
                    bv.add((d)llllllllllllllllllllIllIlIlIlIlI);
                    0;
                }
            }
            int[] nArray13 = new int[lIIlllllll[1]];
            nArray13[M.lIIlllllll[0]] = lIIlllllll[24];
            if (M.lIIIIlllIIllI(Bank.contains((int[])nArray13) ? 1 : 0)) {
                llllllllllllllllllllIllIlIlIlIlI = new d(lIIlllllll[24], lIIlllllll[62], lIIlllllll[66]);
                bv.add((d)llllllllllllllllllllIllIlIlIlIlI);
                0;
            }
            int[] nArray14 = new int[lIIlllllll[1]];
            nArray14[M.lIIlllllll[0]] = lIIlllllll[21];
            if (M.lIIIIlllIIllI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[lIIlllllll[1]];
                nArray15[M.lIIlllllll[0]] = lIIlllllll[21];
                if (M.lIIIIlllIIllI(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    llllllllllllllllllllIllIlIlIlIlI = new d(lIIlllllll[21], lIIlllllll[1], lIIlllllll[67]);
                    bv.add((d)llllllllllllllllllllIllIlIlIlIlI);
                    0;
                }
            }
            if (M.lIIIIlllIIlII(bu ? 1 : 0)) {
                int[] nArray16 = new int[lIIlllllll[1]];
                nArray16[M.lIIlllllll[0]] = lIIlllllll[15];
                if (M.lIIIIlllIIlII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIlllllll[1]];
                    nArray17[M.lIIlllllll[0]] = lIIlllllll[15];
                    if (M.lIIIIlllIIlIl(Bank.getFirst((int[])nArray17).getQuantity(), lIIlllllll[62])) {
                        int[] nArray18 = new int[lIIlllllll[1]];
                        nArray18[M.lIIlllllll[0]] = lIIlllllll[15];
                        llllllllllllllllllllIllIlIlIlIlI = new d(lIIlllllll[15], lIIlllllll[62] - Bank.getFirst((int[])nArray18).getQuantity(), lIIlllllll[59]);
                        bv.add((d)llllllllllllllllllllIllIlIlIlIlI);
                        0;
                    }
                }
                int[] nArray19 = new int[lIIlllllll[1]];
                nArray19[M.lIIlllllll[0]] = lIIlllllll[15];
                if (M.lIIIIlllIIllI(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    llllllllllllllllllllIllIlIlIlIlI = new d(lIIlllllll[15], lIIlllllll[62], lIIlllllll[59]);
                    bv.add((d)llllllllllllllllllllIllIlIlIlIlI);
                    0;
                }
                int[] nArray20 = new int[lIIlllllll[1]];
                nArray20[M.lIIlllllll[0]] = lIIlllllll[22];
                if (M.lIIIIlllIIlII(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[lIIlllllll[1]];
                    nArray21[M.lIIlllllll[0]] = lIIlllllll[22];
                    if (M.lIIIIlllIIlIl(Bank.getFirst((int[])nArray21).getQuantity(), lIIlllllll[67])) {
                        int[] nArray22 = new int[lIIlllllll[1]];
                        nArray22[M.lIIlllllll[0]] = lIIlllllll[22];
                        llllllllllllllllllllIllIlIlIlIlI = new d(lIIlllllll[22], lIIlllllll[67] - Bank.getFirst((int[])nArray22).getQuantity(), lIIlllllll[5]);
                        bv.add((d)llllllllllllllllllllIllIlIlIlIlI);
                        0;
                    }
                }
                int[] nArray23 = new int[lIIlllllll[1]];
                nArray23[M.lIIlllllll[0]] = lIIlllllll[22];
                if (M.lIIIIlllIIllI(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    llllllllllllllllllllIllIlIlIlIlI = new d(lIIlllllll[22], lIIlllllll[67], lIIlllllll[5]);
                    bv.add((d)llllllllllllllllllllIllIlIlIlIlI);
                    0;
                }
            }
        }
        int[] nArray = new int[lIIlllllll[1]];
        nArray[M.lIIlllllll[0]] = lIIlllllll[19];
        if (M.lIIIIlllIIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            llllllllllllllllllllIllIlIlIlIlI = new d(lIIlllllll[19], lIIlllllll[68], lIIlllllll[39]);
            bv.add((d)llllllllllllllllllllIllIlIlIlIlI);
            0;
        }
        if (M.lIIIIlllIIllI(Bank.contains(llllllllllllllllllllIllIlIlIlIlI = item -> item.getName().toLowerCase().contains(lIIllllllI[lIIlllllll[75]])) ? 1 : 0)) {
            llllllllllllllllllllIllIlIlIlIIl = new d(lIIlllllll[69], lIIlllllll[18], lIIlllllll[70]);
            bv.add(llllllllllllllllllllIllIlIlIlIIl);
            0;
        }
        int[] nArray24 = new int[lIIlllllll[1]];
        nArray24[M.lIIlllllll[0]] = lIIlllllll[71];
        if (M.lIIIIlllIIllI(Bank.contains((int[])nArray24) ? 1 : 0)) {
            llllllllllllllllllllIllIlIlIlIIl = new d(lIIlllllll[71], lIIlllllll[32], lIIlllllll[72]);
            bv.add(llllllllllllllllllllIllIlIlIlIIl);
            0;
        }
        int[] nArray25 = new int[lIIlllllll[1]];
        nArray25[M.lIIlllllll[0]] = lIIlllllll[17];
        if (M.lIIIIlllIIllI(Bank.contains((int[])nArray25) ? 1 : 0)) {
            llllllllllllllllllllIllIlIlIlIIl = new d(lIIlllllll[17], lIIlllllll[32], lIIlllllll[72]);
            bv.add(llllllllllllllllllllIllIlIlIlIIl);
            0;
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (M.lIIIIlllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[74])) {
            bl = lIIlllllll[1];
            0;
            if ((0x84 ^ 0xC7 ^ (0xC1 ^ 0x87)) <= 0) {
                return ((0x47 ^ 0x39 ^ (0x1F ^ 0x75)) & (0xBE ^ 0x83 ^ (0x11 ^ 0x38) ^ -1)) != 0;
            }
        } else {
            bl = lIIlllllll[0];
        }
        return bl;
    }

    public static void Z() {
        if (M.lIIIIlllIIlII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (M.lIIIIlllIIllI(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIllllllI[lIIlllllll[42]];
            Movement.walkTo((WorldPoint)bx);
            0;
            Time.sleepTicks((int)lIIlllllll[1]);
            0;
        }
        if (M.lIIIIlllIIlII(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIllllllI[lIIlllllll[43]];
            M.aa();
        }
    }

    private static boolean lIIIIlllIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIIIIlllIIIII(String llllllllllllllllllllIllIIllllIlI, String llllllllllllllllllllIllIIlllIlII) {
        llllllllllllllllllllIllIIllllIlI = new String(Base64.getDecoder().decode(llllllllllllllllllllIllIIllllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllllIllIIllllIII = new StringBuilder();
        char[] llllllllllllllllllllIllIIlllIlll = llllllllllllllllllllIllIIlllIlII.toCharArray();
        int llllllllllllllllllllIllIIlllIllI = lIIlllllll[0];
        char[] llllllllllllllllllllIllIIlllIIII = llllllllllllllllllllIllIIllllIlI.toCharArray();
        int llllllllllllllllllllIllIIllIllll = llllllllllllllllllllIllIIlllIIII.length;
        int llllllllllllllllllllIllIIllIlllI = lIIlllllll[0];
        while (M.lIIIIlllIIlIl(llllllllllllllllllllIllIIllIlllI, llllllllllllllllllllIllIIllIllll)) {
            char llllllllllllllllllllIllIIllllIll = llllllllllllllllllllIllIIlllIIII[llllllllllllllllllllIllIIllIlllI];
            llllllllllllllllllllIllIIllllIII.append((char)(llllllllllllllllllllIllIIllllIll ^ llllllllllllllllllllIllIIlllIlll[llllllllllllllllllllIllIIlllIllI % llllllllllllllllllllIllIIlllIlll.length]));
            0;
            ++llllllllllllllllllllIllIIlllIllI;
            ++llllllllllllllllllllIllIIllIlllI;
            0;
            if (3 != 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllllIllIIllllIII);
    }

    private static void lIIIIlllIIIll() {
        lIIlllllll = new int[82];
        M.lIIlllllll[0] = (0x46 ^ 0x4B) & ~(0x46 ^ 0x4B);
        M.lIIlllllll[1] = 1;
        M.lIIlllllll[2] = 2;
        M.lIIlllllll[3] = 3;
        M.lIIlllllll[4] = -(0xFFFFBD77 & 0x6EAF) & (0xFFFFFFAF & 0x3FFE);
        M.lIIlllllll[5] = 0xCA ^ 0xA6 ^ (0xA9 ^ 0xC3);
        M.lIIlllllll[6] = 0x26 ^ 0x2B ^ (0x42 ^ 0x4B);
        M.lIIlllllll[7] = 0x5F ^ 0x68;
        M.lIIlllllll[8] = 0xFFFFEA2E & 0x17FF;
        M.lIIlllllll[9] = -(0xFFFFBB3E & 0x56C3) & (0xFFFF97FD & 0x7FDF);
        M.lIIlllllll[10] = 0xFFFFEBFB & 0x162F;
        M.lIIlllllll[11] = -(0xFFFFD75F & 0x7AB9) & (0xFFFFFBDC & 0x5FFF);
        M.lIIlllllll[12] = -(0xFFFFFD51 & 0x7BAF) & (0xFFFFFF6F & 0x7BBD);
        M.lIIlllllll[13] = -(0xFFFFDDCD & 0x3FF3) & (0xFFFFFFEB & 0x1FFE);
        M.lIIlllllll[14] = -(0xFFFF8DEF & 0x7613) & (0xFFFFFDFF & 0x1796);
        M.lIIlllllll[15] = -(0xFFFFEF6F & 0x55DD) & (0xFFFFCFFF & 0x777F);
        M.lIIlllllll[16] = -(0xFFFFCFF9 & 0x762F) & (0xFFFFF779 & Short.MAX_VALUE);
        M.lIIlllllll[17] = 0xFFFF9FDB & 0x7F6D;
        M.lIIlllllll[18] = 102 + 84 - 61 + 6 ^ 61 + 53 - 5 + 25;
        M.lIIlllllll[19] = 0xFFFFADFB & 0x537F;
        M.lIIlllllll[20] = 0x39 ^ 0x20;
        M.lIIlllllll[21] = 0xFFFFDF6F & 0x25FB;
        M.lIIlllllll[22] = -(0xFFFFFFC9 & 0x65F7) & (0xFFFFF7FD & 0x6FEE);
        M.lIIlllllll[23] = 0xFFFF9BF1 & 0x663F;
        M.lIIlllllll[24] = 0x2C ^ 0x16 ^ (0x19 ^ 0x1D);
        M.lIIlllllll[25] = 0x2A ^ 0x35;
        M.lIIlllllll[26] = 0x4C ^ 0x4B;
        M.lIIlllllll[27] = -1;
        M.lIIlllllll[28] = 0x23 ^ 0x1F ^ (7 ^ 0x1E);
        M.lIIlllllll[29] = 0x3A ^ 0x3F ^ (0x36 ^ 0x3B);
        M.lIIlllllll[30] = 0x9C ^ 0xA9 ^ (0x8D ^ 0x95);
        M.lIIlllllll[31] = 0x65 ^ 0x6C;
        M.lIIlllllll[32] = 0x85 ^ 0x8F;
        M.lIIlllllll[33] = 0x68 ^ 0x29 ^ (0xED ^ 0xA7);
        M.lIIlllllll[34] = 0xFFFFDEDA & 0x2D7F;
        M.lIIlllllll[35] = 0xFFFF9DFF & 0x6F9F;
        M.lIIlllllll[36] = 0x65 ^ 0x69;
        M.lIIlllllll[37] = 0xC4 ^ 0x8D ^ (0xF1 ^ 0x87);
        M.lIIlllllll[38] = 0x9A ^ 0xBE ^ (0xBE ^ 0x97);
        M.lIIlllllll[39] = -(0xFFFF9511 & 0x6EFF) & (0xFFFF8FD4 & 0x757B);
        M.lIIlllllll[40] = 0xFFFFFE77 & 0x39A;
        M.lIIlllllll[41] = 0xFFFF8DBF & 0x7FEC;
        M.lIIlllllll[42] = 52 + 0 - -53 + 39 ^ 135 + 70 - 50 + 3;
        M.lIIlllllll[43] = 0x93 ^ 0x9C;
        M.lIIlllllll[44] = 0x70 ^ 0x60;
        M.lIIlllllll[45] = 53 + 18 - -32 + 42 ^ 42 + 96 - 20 + 10;
        M.lIIlllllll[46] = 0x6E ^ 0x7C;
        M.lIIlllllll[47] = -(0xFFFFDDD3 & 0x72BD) & (0xFFFFF5FF & 0x5FF5);
        M.lIIlllllll[48] = 0xD1 ^ 0xC2;
        M.lIIlllllll[49] = -(0xFFFFBC2B & 0x5BFD) & (0xFFFFD9FD & 0x3F3E);
        M.lIIlllllll[50] = 0xFFFF8AF3 & 0x775D;
        M.lIIlllllll[51] = 0x2D ^ 0x4A ^ (0xFD ^ 0x80);
        M.lIIlllllll[52] = 104 + 128 - 108 + 56 ^ 128 + 156 - 244 + 120;
        M.lIIlllllll[53] = 0x55 ^ 0x40;
        M.lIIlllllll[54] = 80 + 56 - 118 + 183;
        M.lIIlllllll[55] = 0x3E ^ 0x24 ^ (7 ^ 0xB);
        M.lIIlllllll[56] = 129 + 188 - 309 + 203 ^ 86 + 83 - 113 + 140;
        M.lIIlllllll[57] = 0x4B ^ 0x53;
        M.lIIlllllll[58] = 0xFFFF8BFF & 0x77E8;
        M.lIIlllllll[59] = (0xBF ^ 0xC5) + (0x78 ^ 0x10) - (98 + 179 - 191 + 131) + (102 + 61 - 84 + 82);
        M.lIIlllllll[60] = -(0xFFFFF4DF & 0x6B3B) & (0xFFFFEFFE & 0x7FBB);
        M.lIIlllllll[61] = 0xFFFFCFD8 & 0x37F7;
        M.lIIlllllll[62] = -(0xFFFFEC5F & 0x37A2) & (0xFFFFFFFB & 0x2FBD);
        M.lIIlllllll[63] = 0xFFFFB3F6 & 0x7CDD;
        M.lIIlllllll[64] = 0xFFFFFECC & 0x3DBF;
        M.lIIlllllll[65] = 0xE2 ^ 0x9C ^ (0xB1 ^ 0xB7);
        M.lIIlllllll[66] = 31 + 24 - -47 + 36 + (0x1E ^ 0x76) - (0x51 ^ 0x3F) + (0x27 ^ 0x35);
        M.lIIlllllll[67] = -(0xFFFFDDAD & 0x2757) & (0xFFFFBFFD & 0x7F9E);
        M.lIIlllllll[68] = 146 + 62 - 61 + 96 ^ 96 + 123 - 197 + 129;
        M.lIIlllllll[69] = 0xFFFFBFCF & 0x6EFC;
        M.lIIlllllll[70] = -(0xFFFFF9BA & 0xE47) & (0xFFFFEBBB & 0x7DED);
        M.lIIlllllll[71] = -(0xFFFFE3FD & 0x5C8B) & (0xFFFFFFFF & 0x5FCF);
        M.lIIlllllll[72] = 0xFFFFC3EC & 0x3F97;
        M.lIIlllllll[73] = 0x20 ^ 0x32 ^ (0x3D ^ 0x34);
        M.lIIlllllll[74] = 0x11 ^ 0x2A ^ (0x63 ^ 0x13);
        M.lIIlllllll[75] = 0x37 ^ 0x2B;
        M.lIIlllllll[76] = 0x54 ^ 5 ^ (0xE0 ^ 0xAC);
        M.lIIlllllll[77] = -(0xFFFFE937 & 0x36EA) & (0xFFFFAFEF & 0x7BFF);
        M.lIIlllllll[78] = 0xFFFFCEF7 & 0x3DEB;
        M.lIIlllllll[79] = -(0xFFFFEC39 & 0x77EF) & (0xFFFFFFFF & 0x6FFF);
        M.lIIlllllll[80] = -(0xFFFFFB97 & 0x376F) & (0xFFFFFFEF & 0x3FFF);
        M.lIIlllllll[81] = 0x60 ^ 0x7E;
    }

    public static void ae() {
        if (M.lIIIIlllIIlll(Widgets.get((int)lIIlllllll[50], (int)lIIlllllll[51]))) {
            AccBuilderRogues.c = lIIllllllI[lIIlllllll[52]];
            Widgets.get((int)lIIlllllll[50], (int)lIIlllllll[51]).interact(lIIllllllI[lIIlllllll[53]]);
            Time.sleepTicks((int)lIIlllllll[6]);
            0;
        }
        if (M.lIIIIlllIlIll(Widgets.get((int)lIIlllllll[50], (int)lIIlllllll[51])) && M.lIIIIlllIIllI(Widgets.get((int)lIIlllllll[54]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)lIIlllllll[1]);
            0;
            if (M.lIIIIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[18])) {
                Widgets.get((int)lIIlllllll[54], (int)lIIlllllll[1]).getChild(lIIlllllll[1]).interact(lIIllllllI[lIIlllllll[55]]);
            }
            if (M.lIIIIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[31]) && M.lIIIIlllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[18])) {
                Widgets.get((int)lIIlllllll[54], (int)lIIlllllll[1]).getChild(lIIlllllll[2]).interact(lIIllllllI[lIIlllllll[56]]);
            }
            if (M.lIIIIlllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[31]) && M.lIIIIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[38])) {
                Widgets.get((int)lIIlllllll[54], (int)lIIlllllll[1]).getChild(lIIlllllll[3]).interact(lIIllllllI[lIIlllllll[57]]);
            }
            if (M.lIIIIlllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[31])) {
                int[] nArray = new int[lIIlllllll[1]];
                nArray[M.lIIlllllll[0]] = lIIlllllll[13];
                if (M.lIIIIlllIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIIlllllll[54], (int)lIIlllllll[1]).getChild(lIIlllllll[3]).interact(lIIllllllI[lIIlllllll[20]]);
                }
            }
            if (M.lIIIIlllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[38])) {
                int[] nArray = new int[lIIlllllll[1]];
                nArray[M.lIIlllllll[0]] = lIIlllllll[13];
                if (M.lIIIIlllIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIIlllllll[54], (int)lIIlllllll[1]).getChild(lIIlllllll[6]).interact(lIIllllllI[lIIlllllll[51]]);
                }
            }
            Time.sleepTicks((int)lIIlllllll[1]);
            0;
        }
    }

    private static boolean lIIIIlllIlllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIIlllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIIlllIllIl(int n2) {
        return n2 < 0;
    }

    private static String lIIIIllIlllll(String llllllllllllllllllllIllIlIIIlIII, String llllllllllllllllllllIllIlIIIIlll) {
        try {
            SecretKeySpec llllllllllllllllllllIllIlIIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIllIlIIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllllIllIlIIIllII = Cipher.getInstance("Blowfish");
            llllllllllllllllllllIllIlIIIllII.init(lIIlllllll[2], llllllllllllllllllllIllIlIIIllIl);
            return new String(llllllllllllllllllllIllIlIIIllII.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIllIlIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllllIllIlIIIlIll) {
            llllllllllllllllllllIllIlIIIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIlllIllll(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
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
                                                    if (!M.lIIIIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[20])) break block19;
                                                    int[] nArray = new int[lIIlllllll[1]];
                                                    nArray[M.lIIlllllll[0]] = lIIlllllll[8];
                                                    if (!M.lIIIIlllIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIIlllllll[1]];
                                                    nArray2[M.lIIlllllll[0]] = lIIlllllll[12];
                                                    if (!M.lIIIIlllIIlII(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIIlllllll[1]];
                                                    nArray3[M.lIIlllllll[0]] = lIIlllllll[10];
                                                    if (!M.lIIIIlllIIlII(Bank.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIIlllllll[1]];
                                                    nArray4[M.lIIlllllll[0]] = lIIlllllll[13];
                                                    if (!M.lIIIIlllIIlII(Bank.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIIlllllll[1]];
                                                    nArray5[M.lIIlllllll[0]] = lIIlllllll[19];
                                                    if (!M.lIIIIlllIIlII(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIIlllllll[1]];
                                                    nArray6[M.lIIlllllll[0]] = lIIlllllll[47];
                                                    if (!M.lIIIIlllIIllI(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIIlllllll[1]];
                                                    nArray7[M.lIIlllllll[0]] = lIIlllllll[47];
                                                    if (!M.lIIIIlllIIlII(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIIlllllll[1];
                                                0;
                                                if ((29 + 50 - 51 + 133 ^ 37 + 39 - -51 + 38) >= 2) return n5 != 0;
                                                return ((6 ^ 0x45 ^ (0xCD ^ 0xBF)) & ((0x42 ^ 0x72) & ~(0x98 ^ 0xA8) ^ (0x5F ^ 0x6E) ^ -1)) != 0;
                                            }
                                            n5 = lIIlllllll[0];
                                            return n5 != 0;
                                        }
                                        if (!M.lIIIIlllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[20]) || !M.lIIIIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[7])) break block22;
                                        int[] nArray = new int[lIIlllllll[1]];
                                        nArray[M.lIIlllllll[0]] = lIIlllllll[12];
                                        if (!M.lIIIIlllIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIIlllllll[1]];
                                        nArray8[M.lIIlllllll[0]] = lIIlllllll[10];
                                        if (!M.lIIIIlllIIlII(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIIlllllll[1]];
                                        nArray9[M.lIIlllllll[0]] = lIIlllllll[13];
                                        if (!M.lIIIIlllIIlII(Bank.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIIlllllll[1]];
                                        nArray10[M.lIIlllllll[0]] = lIIlllllll[15];
                                        if (!M.lIIIIlllIIlII(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIIlllllll[1]];
                                        nArray11[M.lIIlllllll[0]] = lIIlllllll[47];
                                        if (!M.lIIIIlllIIllI(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIIlllllll[1]];
                                        nArray12[M.lIIlllllll[0]] = lIIlllllll[47];
                                        if (!M.lIIIIlllIIlII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIIlllllll[1];
                                    0;
                                    if (((0x39 ^ 0x6D ^ (0x4B ^ 0x31)) & (160 + 57 - 187 + 133 ^ 12 + 124 - 95 + 100 ^ -1)) == 0) return n4 != 0;
                                    return ((78 + 119 - 103 + 95 ^ 19 + 30 - -56 + 54) & (0x75 ^ 0x2F ^ (0x3E ^ 0x46) ^ -1)) != 0;
                                }
                                n4 = lIIlllllll[0];
                                return n4 != 0;
                            }
                            if (!M.lIIIIlllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[7]) || !M.lIIIIlllIIllI(bu ? 1 : 0)) break block25;
                            int[] nArray = new int[lIIlllllll[1]];
                            nArray[M.lIIlllllll[0]] = lIIlllllll[21];
                            if (!M.lIIIIlllIIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIIlllllll[1]];
                            nArray13[M.lIIlllllll[0]] = lIIlllllll[21];
                            if (!M.lIIIIlllIIlII(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIIlllllll[1]];
                        nArray[M.lIIlllllll[0]] = lIIlllllll[23];
                        if (M.lIIIIlllIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIIlllllll[1]];
                            nArray14[M.lIIlllllll[0]] = lIIlllllll[24];
                            if (M.lIIIIlllIIlII(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIIlllllll[1];
                                0;
                                if (3 > 1) return n3 != 0;
                                return ((3 + 228 - 187 + 202 ^ 101 + 143 - 160 + 104) & (0x76 ^ 7 ^ (1 ^ 0x3A) ^ -1)) != 0;
                            }
                        }
                    }
                    n3 = lIIlllllll[0];
                    return n3 != 0;
                }
                if (!M.lIIIIlllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[7]) || !M.lIIIIlllIIlII(bu ? 1 : 0)) return lIIlllllll[0];
                int[] nArray = new int[lIIlllllll[1]];
                nArray[M.lIIlllllll[0]] = lIIlllllll[21];
                if (!M.lIIIIlllIIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIIlllllll[1]];
                nArray15[M.lIIlllllll[0]] = lIIlllllll[21];
                if (!M.lIIIIlllIIlII(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIIlllllll[1]];
            nArray[M.lIIlllllll[0]] = lIIlllllll[15];
            if (M.lIIIIlllIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIIlllllll[1]];
                nArray16[M.lIIlllllll[0]] = lIIlllllll[22];
                if (M.lIIIIlllIIlII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIlllllll[1]];
                    nArray17[M.lIIlllllll[0]] = lIIlllllll[22];
                    if (M.lIIIIlllIlIIl(Bank.getFirst((int[])nArray17).getQuantity(), lIIlllllll[18])) {
                        int[] nArray18 = new int[lIIlllllll[1]];
                        nArray18[M.lIIlllllll[0]] = lIIlllllll[23];
                        if (M.lIIIIlllIIlII(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIIlllllll[1]];
                            nArray19[M.lIIlllllll[0]] = lIIlllllll[24];
                            if (M.lIIIIlllIIlII(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIIlllllll[1];
                                0;
                                if (((0x32 ^ 0x54 ^ (0x3C ^ 8)) & (6 ^ 0x5E ^ (0xA7 ^ 0xAD) ^ -1)) == 0) return n2 != 0;
                                return ((0x9D ^ 0x8E ^ (0x22 ^ 0x65)) & (106 + 239 - 297 + 204 ^ 147 + 103 - 215 + 133 ^ -1)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIlllllll[0];
        return n2 != 0;
    }

    public static boolean ad() {
        if (M.lIIIIlllIlIlI(Vars.getBit((int)lIIlllllll[49]), lIIlllllll[1]) && M.lIIIIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[18])) {
            return lIIlllllll[1];
        }
        if (M.lIIIIlllIlIlI(Vars.getBit((int)lIIlllllll[49]), lIIlllllll[2]) && M.lIIIIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[31]) && M.lIIIIlllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[18])) {
            return lIIlllllll[1];
        }
        if (M.lIIIIlllIlIlI(Vars.getBit((int)lIIlllllll[49]), lIIlllllll[3]) && M.lIIIIlllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[31]) && M.lIIIIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[38])) {
            return lIIlllllll[1];
        }
        if (M.lIIIIlllIlIlI(Vars.getBit((int)lIIlllllll[49]), lIIlllllll[3]) && M.lIIIIlllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[31])) {
            int[] nArray = new int[lIIlllllll[1]];
            nArray[M.lIIlllllll[0]] = lIIlllllll[13];
            if (M.lIIIIlllIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIIlllllll[1];
            }
        }
        if (M.lIIIIlllIlIlI(Vars.getBit((int)lIIlllllll[49]), lIIlllllll[6]) && M.lIIIIlllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlllllll[38])) {
            int[] nArray = new int[lIIlllllll[1]];
            nArray[M.lIIlllllll[0]] = lIIlllllll[13];
            if (M.lIIIIlllIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIIlllllll[1];
            }
        }
        return lIIlllllll[0];
    }

    private static boolean lIIIIlllIlIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIIlllIIlII(int n2) {
        return n2 != 0;
    }
}

