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
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.a;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.b;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.d;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.u;
import gg.squire.account.AccBuilderBarrows;
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

public class I
implements F {
    public static /* synthetic */ boolean bA;
    public static /* synthetic */ List<d> bB;
    private static /* synthetic */ String[] llllIlIl;
    static /* synthetic */ WorldPoint bE;
    static /* synthetic */ WorldPoint bD;
    private static /* synthetic */ int[] llllIllI;
    static /* synthetic */ WorldArea bC;
    public static /* synthetic */ boolean bz;

    private static String llIIlIlllII(String lIIllIllllIIlll, String lIIllIllllIIllI) {
        try {
            SecretKeySpec lIIllIllllIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllIllllIIllI.getBytes(StandardCharsets.UTF_8)), llllIllI[30]), "DES");
            Cipher lIIllIllllIlIll = Cipher.getInstance("DES");
            lIIllIllllIlIll.init(llllIllI[3], lIIllIllllIllII);
            return new String(lIIllIllllIlIll.doFinal(Base64.getDecoder().decode(lIIllIllllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllIllllIlIlI) {
            lIIllIllllIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIllIIlIl(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean T() {
        return llllIllI[0];
    }

    public static void aa() {
        if (I.llIIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (I.llIIllIIIll(bC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = llllIlIl[llllIllI[41]];
            Movement.walkTo((WorldPoint)bD);
            0;
            Time.sleepTicks((int)llllIllI[1]);
            0;
        }
        if (I.llIIllIIIIl(bC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = llllIlIl[llllIllI[42]];
            I.ab();
        }
    }

    private static void llIIllIIIII() {
        llllIllI = new int[81];
        I.llllIllI[0] = (0x13 ^ 0x4E ^ (0x5B ^ 0x57)) & (5 ^ 0x14 ^ (0x25 ^ 0x65) ^ -1);
        I.llllIllI[1] = 1;
        I.llllIllI[2] = 0xA7 ^ 0x85 ^ (0xD0 ^ 0xC0);
        I.llllIllI[3] = 2;
        I.llllIllI[4] = 3;
        I.llllIllI[5] = -(0xFFFF8526 & 0x7EFB) & (0xFFFFDFAF & 0x37F9);
        I.llllIllI[6] = 0xC6 ^ 0xC0;
        I.llllIllI[7] = 0x71 ^ 0x1C ^ (0x45 ^ 0x2C);
        I.llllIllI[8] = 118 + 107 - 221 + 140 ^ 144 + 18 - 145 + 150;
        I.llllIllI[9] = -(0xFFFF9E57 & 0x7DBA) & (0xFFFFBE7F & 0x5FBF);
        I.llllIllI[10] = 0xFFFF97DC & 0x6DFF;
        I.llllIllI[11] = 0xFFFF832B & 0x7EFF;
        I.llllIllI[12] = 0xFFFFDFF5 & 0x29CE;
        I.llllIllI[13] = -(0xFFFFC8D9 & 0x7777) & (0xFFFFDB7D & 0x66FF);
        I.llllIllI[14] = -(0xFFFFFBD7 & 0x3C3A) & (0xFFFFBF3F & 0x7AFB);
        I.llllIllI[15] = -(0xFFFFFCCA & 0xF3F) & (0xFFFFFFFF & 0x1D9D);
        I.llllIllI[16] = -(0xFFFFFD0F & 0x3FFD) & (0xFFFFBF7F & 0x7FBF);
        I.llllIllI[17] = -(0xFFFFEAEB & 0x5F9F) & (0xFFFFFFDB & 0x7BFF);
        I.llllIllI[18] = 0xFFFFBF7D & 0x5FCB;
        I.llllIllI[19] = 0x45 ^ 0x40 ^ (0x33 ^ 0x62) & ~(0x60 ^ 0x31);
        I.llllIllI[20] = -(0xFFFFEFC9 & 0x7237) & (0xFFFFE3FB & 0x7F7F);
        I.llllIllI[21] = 0x7E ^ 0x67;
        I.llllIllI[22] = 0xFFFFDF6B & 0x25FF;
        I.llllIllI[23] = 0xFFFFAFFF & 0x522C;
        I.llllIllI[24] = -(0xFFFFEFCB & 0x31F7) & (0xFFFFEBFF & 0x37F3);
        I.llllIllI[25] = 0x58 ^ 0x66;
        I.llllIllI[26] = 0x4F ^ 0x62 ^ (0x6F ^ 0x5D);
        I.llllIllI[27] = 0x66 ^ 0x61;
        I.llllIllI[28] = -1;
        I.llllIllI[29] = 0x15 ^ 0x30;
        I.llllIllI[30] = 0x5B ^ 7 ^ (0xB ^ 0x5F);
        I.llllIllI[31] = 20 + 55 - -42 + 15 ^ 28 + 43 - -65 + 33;
        I.llllIllI[32] = 47 + 113 - 50 + 41 ^ 40 + 82 - 29 + 65;
        I.llllIllI[33] = 0x90 ^ 0x9A;
        I.llllIllI[34] = 0x19 ^ 0x12;
        I.llllIllI[35] = 0xFFFF9FDB & 0x6C7E;
        I.llllIllI[36] = -(0xFFFFF5FB & 0x5A05) & (0xFFFFDF9F & 0x7DFF);
        I.llllIllI[37] = 0xE6 ^ 0xAA ^ (0x6A ^ 0x2A);
        I.llllIllI[38] = 0x41 ^ 0x7E;
        I.llllIllI[39] = 0x5D ^ 0x50;
        I.llllIllI[40] = 0xFFFF8FAD & 0x7DFE;
        I.llllIllI[41] = 33 + 60 - -52 + 33 ^ 65 + 42 - 73 + 154;
        I.llllIllI[42] = 0x49 ^ 0x44 ^ 2;
        I.llllIllI[43] = 0x14 ^ 0xA ^ (0x4E ^ 0x40);
        I.llllIllI[44] = 3 ^ 0x57 ^ (0xD7 ^ 0x92);
        I.llllIllI[45] = 0xDD ^ 0x81 ^ (0x58 ^ 0x16);
        I.llllIllI[46] = -(0xFFFFBB1B & 0x4EE7) & (0xFFFF8F67 & Short.MAX_VALUE);
        I.llllIllI[47] = 0x65 ^ 0x76;
        I.llllIllI[48] = 0xFFFFDB5D & 0x25B6;
        I.llllIllI[49] = -(0xFFFFDFFF & 0x6D07) & (0xFFFFEF7F & 0x5FD7);
        I.llllIllI[50] = 0x6D ^ 0x77;
        I.llllIllI[51] = 0x10 ^ 0x5C ^ (0xE ^ 0x56);
        I.llllIllI[52] = 0xA7 ^ 0xB2;
        I.llllIllI[53] = (0x2F ^ 0x3A) + (0x39 ^ 0x4B) - -(0x8F ^ 0xB1) + (0x84 ^ 0x80);
        I.llllIllI[54] = 0x62 ^ 0x17 ^ (0xC2 ^ 0xA1);
        I.llllIllI[55] = 0x65 ^ 0x72;
        I.llllIllI[56] = 0xDB ^ 0xA3 ^ (0x32 ^ 0x52);
        I.llllIllI[57] = 0xFFFFEBEF & 0x17F8;
        I.llllIllI[58] = 133 + 77 - 132 + 92;
        I.llllIllI[59] = -(0xFFFFB7DF & 0x582D) & (0xFFFFDFBC & 0x3FEF);
        I.llllIllI[60] = 0xFFFFEFDA & 0x17F5;
        I.llllIllI[61] = 0xFFFFDBFD & 0x2FBA;
        I.llllIllI[62] = 0xFFFFF3DD & 0x3CF6;
        I.llllIllI[63] = -(0xFFFFEF57 & 0x53FC) & (0xFFFFFFDF & Short.MAX_VALUE);
        I.llllIllI[64] = 155 + 96 - 206 + 160 ^ 160 + 172 - 221 + 70;
        I.llllIllI[65] = 143 + 114 - 109 + 2;
        I.llllIllI[66] = -(0xFFFFDD73 & 0x62EF) & (0xFFFFFBFF & 0x7EFA);
        I.llllIllI[67] = 0x35 ^ 0x5A ^ (0x96 ^ 0x9D);
        I.llllIllI[68] = -(0xFFFFCE97 & 0x3DFA) & (0xFFFF9DFF & 0x6FD1);
        I.llllIllI[69] = -(0xFFFFD73F & 0x69F3) & (0xFFFFEFFE & Short.MAX_VALUE);
        I.llllIllI[70] = -(0xFFFFBFD6 & 0x587D) & (0xFFFFFFFF & 0x79FB);
        I.llllIllI[71] = 0xFFFF9F7F & 0x7FC7;
        I.llllIllI[72] = 0xFFFFFBE7 & 0x79C;
        I.llllIllI[73] = 0xF4 ^ 0xBE ^ (5 ^ 0x54);
        I.llllIllI[74] = 0x47 ^ 0x5B;
        I.llllIllI[75] = 0x1D ^ 0;
        I.llllIllI[76] = -(0xFFFFD7BD & 0x6C73) & (0xFFFFFFFF & 0x4FFE);
        I.llllIllI[77] = -(0xFFFFDBFF & 0x671D) & (0xFFFFFFFF & 0x4FFF);
        I.llllIllI[78] = -(0xFFFFFE4D & 0x51BB) & (0xFFFFFFDF & 0x5BFF);
        I.llllIllI[79] = -(0xFFFFE3A1 & 0x7F5F) & (0xFFFFEFF9 & 0x7FEF);
        I.llllIllI[80] = 49 + 151 - 197 + 172 ^ 123 + 87 - 122 + 89;
    }

    public static void Z() {
        if (I.llIIllIIIIl(bz ? 1 : 0)) {
            AccBuilderBarrows.c = llllIlIl[llllIllI[0]];
            b.a(bB);
            if (I.llIIllIIIlI(bB.size(), llllIllI[1])) {
                System.out.println(llllIlIl[llllIllI[1]]);
                bz = llllIllI[0];
            }
        }
        if (I.llIIllIIIll(bz ? 1 : 0) && I.llIIllIIIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[2])) {
            BankLocation lIIlllIIIlIlIlI;
            if (I.llIIllIIIll(I.ac() ? 1 : 0)) {
                lIIlllIIIlIlIlI = BankLocation.getNearest();
                if (I.llIIllIIlII(lIIlllIIIlIlIlI) && I.llIIllIIIll(lIIlllIIIlIlIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = llllIlIl[llllIllI[3]];
                    a.a(lIIlllIIIlIlIlI);
                }
                if (I.llIIllIIlII(lIIlllIIIlIlIlI) && I.llIIllIIIIl(lIIlllIIIlIlIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = llllIlIl[llllIllI[4]];
                    if (I.llIIllIIIll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llllIllI[5]);
                        0;
                        Time.sleepTicks((int)llllIllI[6]);
                        0;
                    }
                    if (I.llIIllIIIIl(Bank.isOpen() ? 1 : 0)) {
                        if (I.llIIllIIlIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llllIllI[7]);
                            0;
                        }
                        while (I.llIIllIIIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[8]) && I.llIIllIIIll(u.aV() ? 1 : 0)) {
                            u.aT();
                            Time.sleepTicks((int)llllIllI[1]);
                            0;
                            0;
                            if (null == null) continue;
                            return;
                        }
                        if (I.llIIllIIIll(I.ad() ? 1 : 0)) {
                            I.ag();
                            System.out.println(llllIlIl[llllIllI[7]]);
                            bz = llllIllI[1];
                            return;
                        }
                        if (I.llIIllIIIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[8])) {
                            int[] nArray = new int[llllIllI[1]];
                            nArray[I.llllIllI[0]] = llllIllI[9];
                            if (I.llIIllIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[llllIllI[1]];
                                nArray2[I.llllIllI[0]] = llllIllI[9];
                                if (I.llIIllIIIlI(Inventory.getCount((int[])nArray2), llllIllI[1])) {
                                    Bank.withdraw((int)llllIllI[9], (int)llllIllI[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllIllI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llllIllI[1]];
                                        nArray[I.llllIllI[0]] = llllIllI[9];
                                        if (I.llIIllIIlIl(Inventory.getCount((int[])nArray))) {
                                            bl = llllIllI[1];
                                            0;
                                            if (null != null) {
                                                return ((0x6E ^ 0x3B) & ~(0x28 ^ 0x7D)) != 0;
                                            }
                                        } else {
                                            bl = llllIllI[0];
                                        }
                                        return bl;
                                    }, (int)llllIllI[5]);
                                    0;
                                }
                            }
                            int[] nArray3 = new int[llllIllI[1]];
                            nArray3[I.llllIllI[0]] = llllIllI[11];
                            if (I.llIIllIIIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[llllIllI[1]];
                                nArray4[I.llllIllI[0]] = llllIllI[11];
                                if (I.llIIllIIIlI(Inventory.getCount((int[])nArray4), llllIllI[1])) {
                                    Bank.withdraw((int)llllIllI[11], (int)llllIllI[12], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllIllI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llllIllI[1]];
                                        nArray[I.llllIllI[0]] = llllIllI[11];
                                        if (I.llIIllIIlIl(Inventory.getCount((int[])nArray))) {
                                            bl = llllIllI[1];
                                            0;
                                            if (((0x5C ^ 5) & ~(0x12 ^ 0x4B)) != 0) {
                                                return ((0x12 ^ 0xD) & ~(0x9F ^ 0x80)) != 0;
                                            }
                                        } else {
                                            bl = llllIllI[0];
                                        }
                                        return bl;
                                    }, (int)llllIllI[5]);
                                    0;
                                }
                            }
                            int[] nArray5 = new int[llllIllI[1]];
                            nArray5[I.llllIllI[0]] = llllIllI[13];
                            if (I.llIIllIIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[llllIllI[1]];
                                nArray6[I.llllIllI[0]] = llllIllI[13];
                                if (I.llIIllIIIlI(Inventory.getCount((int[])nArray6), llllIllI[1])) {
                                    Bank.withdraw((int)llllIllI[13], (int)llllIllI[12], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllIllI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llllIllI[1]];
                                        nArray[I.llllIllI[0]] = llllIllI[13];
                                        if (I.llIIllIIlIl(Inventory.getCount((int[])nArray))) {
                                            bl = llllIllI[1];
                                            0;
                                            if (((0x95 ^ 0x85 ^ (0x24 ^ 0x6F)) & (2 ^ (0x9D ^ 0xC4) ^ -1)) < 0) {
                                                return ((0x39 ^ 0x26 ^ (0xFF ^ 0xA4)) & (0x60 ^ 0x4C ^ (0xC4 ^ 0xAC) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = llllIllI[0];
                                        }
                                        return bl;
                                    }, (int)llllIllI[5]);
                                    0;
                                }
                            }
                            int[] nArray7 = new int[llllIllI[1]];
                            nArray7[I.llllIllI[0]] = llllIllI[14];
                            if (I.llIIllIIIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[llllIllI[1]];
                                nArray8[I.llllIllI[0]] = llllIllI[14];
                                if (I.llIIllIIIlI(Inventory.getCount((int[])nArray8), llllIllI[1])) {
                                    Bank.withdraw((int)llllIllI[14], (int)llllIllI[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllIllI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llllIllI[1]];
                                        nArray[I.llllIllI[0]] = llllIllI[14];
                                        if (I.llIIllIIlIl(Inventory.getCount((int[])nArray))) {
                                            bl = llllIllI[1];
                                            0;
                                            if (2 <= 0) {
                                                return ((0x5E ^ 0x4B ^ 3) & (0xA7 ^ 0x92 ^ (0x3C ^ 0x1F) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = llllIllI[0];
                                        }
                                        return bl;
                                    }, (int)llllIllI[5]);
                                    0;
                                }
                            }
                            int[] nArray9 = new int[llllIllI[1]];
                            nArray9[I.llllIllI[0]] = llllIllI[16];
                            if (I.llIIllIIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[llllIllI[1]];
                                nArray10[I.llllIllI[0]] = llllIllI[16];
                                if (I.llIIllIIIlI(Inventory.getCount((int[])nArray10), llllIllI[1])) {
                                    Bank.withdraw((int)llllIllI[16], (int)llllIllI[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllIllI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llllIllI[1]];
                                        nArray[I.llllIllI[0]] = llllIllI[16];
                                        if (I.llIIllIIlIl(Inventory.getCount((int[])nArray))) {
                                            bl = llllIllI[1];
                                            0;
                                            if (1 != 1) {
                                                return ((0x55 ^ 0x6B ^ (0xC1 ^ 0xA4)) & (163 + 22 - 171 + 206 ^ 0 + 74 - 50 + 111 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = llllIllI[0];
                                        }
                                        return bl;
                                    }, (int)llllIllI[5]);
                                    0;
                                }
                            }
                            int[] nArray11 = new int[llllIllI[1]];
                            nArray11[I.llllIllI[0]] = llllIllI[17];
                            if (I.llIIllIIIIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[llllIllI[1]];
                                nArray12[I.llllIllI[0]] = llllIllI[17];
                                if (I.llIIllIIIll(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    Bank.withdraw((int)llllIllI[17], (int)llllIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllIllI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[llllIllI[1]];
                                        nArray[I.llllIllI[0]] = llllIllI[17];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)llllIllI[5]);
                                    0;
                                }
                            }
                            Bank.withdraw((int)llllIllI[18], (int)llllIllI[19], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            int[] nArray13 = new int[llllIllI[1]];
                            nArray13[I.llllIllI[0]] = llllIllI[20];
                            if (I.llIIllIIIIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                int[] nArray14 = new int[llllIllI[1]];
                                nArray14[I.llllIllI[0]] = llllIllI[20];
                                if (I.llIIllIIIlI(Inventory.getCount((int[])nArray14), llllIllI[1]) && I.llIIllIIIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[21])) {
                                    Bank.withdrawAll((int)llllIllI[20], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllIllI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llllIllI[1]];
                                        nArray[I.llllIllI[0]] = llllIllI[20];
                                        if (I.llIIllIIlIl(Inventory.getCount((int[])nArray))) {
                                            bl = llllIllI[1];
                                            0;
                                            if (((0x50 ^ 0xB) & ~(0x46 ^ 0x1D)) > 0) {
                                                return ((0x78 ^ 0x3A) & ~(0x15 ^ 0x57)) != 0;
                                            }
                                        } else {
                                            bl = llllIllI[0];
                                        }
                                        return bl;
                                    }, (int)llllIllI[5]);
                                    0;
                                }
                            }
                        }
                        if (I.llIIllIIllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[8])) {
                            int[] nArray = new int[llllIllI[1]];
                            nArray[I.llllIllI[0]] = llllIllI[22];
                            if (I.llIIllIIIll(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)llllIllI[22], (int)llllIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)llllIllI[1]);
                                0;
                            }
                            if (I.llIIllIIIIl(bA ? 1 : 0)) {
                                Bank.withdrawAll((int)llllIllI[23], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)llllIllI[1]);
                                0;
                                Bank.withdrawAll((int)llllIllI[16], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)llllIllI[1]);
                                0;
                            }
                            Time.sleepTicks((int)llllIllI[4]);
                            0;
                            Bank.withdrawAll((int)llllIllI[24], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)llllIllI[1]);
                            0;
                            Bank.withdrawAll((int)llllIllI[25], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)llllIllI[1]);
                            0;
                        }
                    }
                }
            }
            if (I.llIIllIIIIl(I.ac() ? 1 : 0)) {
                if (I.llIIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (I.llIIllIIIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[21])) {
                    if (I.llIIllIIIll(bC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = llllIlIl[llllIllI[19]];
                        Movement.walkTo((WorldPoint)bD);
                        0;
                        Time.sleepTicks((int)llllIllI[1]);
                        0;
                    }
                    if (I.llIIllIIIIl(bC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = llllIlIl[llllIllI[6]];
                        I.ab();
                    }
                }
                if (I.llIIllIIllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[21]) && I.llIIllIIIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[26])) {
                    AccBuilderBarrows.c = llllIlIl[llllIllI[27]];
                    if (I.llIIllIIlll(Players.getLocal().getAnimation(), llllIllI[28])) {
                        Magic.cast((Spell)SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks((int)llllIllI[1]);
                        0;
                    }
                }
                if (I.llIIllIIllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[26]) && I.llIIllIIIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[29])) {
                    AccBuilderBarrows.c = llllIlIl[llllIllI[30]];
                    if (I.llIIllIIlll(Players.getLocal().getAnimation(), llllIllI[28])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)llllIllI[1]);
                        0;
                    }
                }
                if (I.llIIllIIllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[29]) && I.llIIllIIIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[31])) {
                    AccBuilderBarrows.c = llllIlIl[llllIllI[32]];
                    if (I.llIIllIIlll(Players.getLocal().getAnimation(), llllIllI[28])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)llllIllI[1]);
                        0;
                    }
                }
                if (I.llIIllIIllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[31]) && I.llIIllIIIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[8])) {
                    AccBuilderBarrows.c = llllIlIl[llllIllI[33]];
                    if (I.llIIllIIlll(Players.getLocal().getAnimation(), llllIllI[28])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)llllIllI[1]);
                        0;
                    }
                }
                if (I.llIIllIIllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[8])) {
                    int lIIlllIIIlIlIII;
                    AccBuilderBarrows.c = llllIlIl[llllIllI[34]];
                    if (I.llIIllIlIII(bE)) {
                        bE = new WorldPoint(llllIllI[35] + e.c(llllIllI[1], llllIllI[7]), llllIllI[36], llllIllI[0]);
                    }
                    int[] nArray = new int[llllIllI[1]];
                    nArray[I.llllIllI[0]] = llllIllI[22];
                    if (I.llIIllIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray15 = new int[llllIllI[1]];
                        nArray15[I.llllIllI[0]] = llllIllI[22];
                        if (I.llIIllIIIll(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[llllIllI[1]];
                            nArray16[I.llllIllI[0]] = llllIllI[22];
                            Inventory.getFirst((int[])nArray16).interact(llllIlIl[llllIllI[37]]);
                            Time.sleepTicks((int)llllIllI[1]);
                            0;
                        }
                    }
                    if (I.llIIllIIIIl(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[llllIllI[1]];
                    nArray17[I.llllIllI[0]] = llllIllI[24];
                    lIIlllIIIlIlIlI = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[llllIllI[1]];
                    nArray18[I.llllIllI[0]] = llllIllI[38];
                    Item lIIlllIIIlIlIIl = Inventory.getFirst((int[])nArray18);
                    if (I.llIIllIIIll(bA ? 1 : 0) && I.llIIllIIlII(bE)) {
                        if (I.llIIllIIIll(Players.getLocal().getWorldLocation().equals((Object)bE) ? 1 : 0)) {
                            AccBuilderBarrows.c = llllIlIl[llllIllI[39]];
                            Movement.walkTo((WorldPoint)bE);
                            0;
                            Time.sleepTicks((int)llllIllI[1]);
                            0;
                        }
                        if (I.llIIllIIIIl(Players.getLocal().getWorldLocation().equals((Object)bE) ? 1 : 0) && I.llIIllIIlII(lIIlllIIIlIlIlI) && I.llIIllIIlII(lIIlllIIIlIlIIl) && I.llIIllIIlll(Players.getLocal().getAnimation(), llllIllI[28])) {
                            lIIlllIIIlIlIII = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)lIIlllIIIlIlIIl);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (I.llIIllIllII(Skills.getExperience((Skill)Skill.MAGIC), lIIlllIIIlIlIII)) {
                                    bl = llllIllI[1];
                                    0;
                                    if (2 < 0) {
                                        return ((0xA0 ^ 0xAA) & ~(0x33 ^ 0x39)) != 0;
                                    }
                                } else {
                                    bl = llllIllI[0];
                                }
                                return bl;
                            }, (int)llllIllI[10]);
                            0;
                        }
                    }
                    if (I.llIIllIIIIl(bA ? 1 : 0)) {
                        if (I.llIIllIIlII(lIIlllIIIlIlIlI) && I.llIIllIIlII(lIIlllIIIlIlIIl) && I.llIIllIIlll(Players.getLocal().getAnimation(), llllIllI[28])) {
                            lIIlllIIIlIlIII = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)lIIlllIIIlIlIIl);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (I.llIIllIllII(Skills.getExperience((Skill)Skill.MAGIC), lIIlllIIIlIlIII)) {
                                    bl = llllIllI[1];
                                    0;
                                    if ((0xB6 ^ 0xB2) < 3) {
                                        return ((0x19 ^ 0x53) & ~(0x18 ^ 0x52)) != 0;
                                    }
                                } else {
                                    bl = llllIllI[0];
                                }
                                return bl;
                            }, (int)llllIllI[10]);
                            0;
                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (I.llIIllIIlll(Players.getLocal().getAnimation(), llllIllI[28])) {
                                bl = llllIllI[1];
                                0;
                                if ((0x48 ^ 0x61 ^ (0x7F ^ 0x52)) < ((169 + 109 - 107 + 57 ^ 108 + 12 - 89 + 101) & (164 + 21 - 61 + 42 ^ 121 + 100 - 148 + 125 ^ -1))) {
                                    return ((0xE9 ^ 0xC2 ^ (0x18 ^ 0x6C)) & (0xF5 ^ 0x9A ^ (0x88 ^ 0xB8) ^ -1)) != 0;
                                }
                            } else {
                                bl = llllIllI[0];
                            }
                            return bl;
                        }, (int)llllIllI[40]);
                        0;
                    }
                }
            }
        }
    }

    private static boolean llIIllIllII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIllIIIll(int n2) {
        return n2 == 0;
    }

    private static void ab() {
        if (I.llIIllIlIlI(I.llIIllIlIIl(e.v(), 30.0))) {
            int[] nArray = new int[llllIllI[1]];
            nArray[I.llllIllI[0]] = llllIllI[20];
            if (I.llIIllIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llllIllI[1]];
                nArray2[I.llllIllI[0]] = llllIllI[20];
                Inventory.getFirst((int[])nArray2).interact(llllIlIl[llllIllI[43]]);
                Time.sleepTicks((int)llllIllI[1]);
                0;
            }
        }
        if (I.llIIllIlIII(Players.getLocal().getInteracting())) {
            NPC lIIlllIIIlIIlIl = NPCs.getNearest(nPC -> {
                int n2;
                if (I.llIIllIIIIl(nPC.getName().contains(llllIlIl[llllIllI[75]]) ? 1 : 0) && I.llIIllIIIll(nPC.isDead() ? 1 : 0)) {
                    n2 = llllIllI[1];
                    0;
                    if ((0xBB ^ 0xBF) < 0) {
                        return ((0xF0 ^ 0xAC) & ~(0xFB ^ 0xA7)) != 0;
                    }
                } else {
                    n2 = llllIllI[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[llllIllI[3]];
            stringArray[I.llllIllI[0]] = llllIlIl[llllIllI[44]];
            stringArray[I.llllIllI[1]] = llllIlIl[llllIllI[45]];
            List lIIlllIIIlIIlII = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (I.llIIllIlIll(nPC.getInteracting(), Players.getLocal())) {
                    bl = llllIllI[1];
                    0;
                    if (((0xAC ^ 0xA7 ^ (0x25 ^ 0x17)) & (79 + 39 - 68 + 136 ^ 3 + 16 - -56 + 56 ^ -1)) != 0) {
                        return ((0x64 ^ 0x46 ^ (0x54 ^ 0x4B)) & (0x8E ^ 0xA5 ^ (0xD1 ^ 0xC7) ^ -1)) != 0;
                    }
                } else {
                    bl = llllIllI[0];
                }
                return bl;
            }).collect(Collectors.toList());
            int[] nArray = new int[llllIllI[1]];
            nArray[I.llllIllI[0]] = llllIllI[46];
            if (I.llIIllIIIIl(Equipment.contains((int[])nArray) ? 1 : 0) && I.llIIllIIIll(I.ae() ? 1 : 0)) {
                I.af();
            }
            if (I.llIIllIIlII(lIIlllIIIlIIlIl) && I.llIIllIIIll(Players.getLocal().isMoving() ? 1 : 0)) {
                lIIlllIIIlIIlIl.interact(llllIlIl[llllIllI[47]]);
                Time.sleepTicks((int)llllIllI[4]);
                0;
            }
        }
    }

    public static void af() {
        if (I.llIIllIIlII(Widgets.get((int)llllIllI[49], (int)llllIllI[50]))) {
            AccBuilderBarrows.c = llllIlIl[llllIllI[51]];
            Widgets.get((int)llllIllI[49], (int)llllIllI[50]).interact(llllIlIl[llllIllI[52]]);
            Time.sleepTicks((int)llllIllI[7]);
            0;
        }
        if (I.llIIllIlIII(Widgets.get((int)llllIllI[49], (int)llllIllI[50])) && I.llIIllIIIll(Widgets.get((int)llllIllI[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)llllIllI[1]);
            0;
            if (I.llIIllIIIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[19])) {
                Widgets.get((int)llllIllI[53], (int)llllIllI[1]).getChild(llllIllI[1]).interact(llllIlIl[llllIllI[54]]);
            }
            if (I.llIIllIIIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[32]) && I.llIIllIIllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[19])) {
                Widgets.get((int)llllIllI[53], (int)llllIllI[1]).getChild(llllIllI[3]).interact(llllIlIl[llllIllI[55]]);
            }
            if (I.llIIllIIllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[32]) && I.llIIllIIIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[39])) {
                Widgets.get((int)llllIllI[53], (int)llllIllI[1]).getChild(llllIllI[4]).interact(llllIlIl[llllIllI[56]]);
            }
            if (I.llIIllIIllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[32])) {
                int[] nArray = new int[llllIllI[1]];
                nArray[I.llllIllI[0]] = llllIllI[14];
                if (I.llIIllIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)llllIllI[53], (int)llllIllI[1]).getChild(llllIllI[4]).interact(llllIlIl[llllIllI[21]]);
                }
            }
            if (I.llIIllIIllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[39])) {
                int[] nArray = new int[llllIllI[1]];
                nArray[I.llllIllI[0]] = llllIllI[14];
                if (I.llIIllIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)llllIllI[53], (int)llllIllI[1]).getChild(llllIllI[7]).interact(llllIlIl[llllIllI[50]]);
                }
            }
            Time.sleepTicks((int)llllIllI[1]);
            0;
        }
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
                                                    if (!I.llIIllIIIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[21])) break block19;
                                                    int[] nArray = new int[llllIllI[1]];
                                                    nArray[I.llllIllI[0]] = llllIllI[9];
                                                    if (!I.llIIllIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[llllIllI[1]];
                                                    nArray2[I.llllIllI[0]] = llllIllI[13];
                                                    if (!I.llIIllIIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[llllIllI[1]];
                                                    nArray3[I.llllIllI[0]] = llllIllI[11];
                                                    if (!I.llIIllIIIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[llllIllI[1]];
                                                    nArray4[I.llllIllI[0]] = llllIllI[14];
                                                    if (!I.llIIllIIIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[llllIllI[1]];
                                                    nArray5[I.llllIllI[0]] = llllIllI[20];
                                                    if (!I.llIIllIIIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[llllIllI[1]];
                                                    nArray6[I.llllIllI[0]] = llllIllI[46];
                                                    if (!I.llIIllIIIll(Inventory.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[llllIllI[1]];
                                                    nArray7[I.llllIllI[0]] = llllIllI[46];
                                                    if (!I.llIIllIIIIl(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = llllIllI[1];
                                                0;
                                                if (1 != (3 & ~3)) return n5 != 0;
                                                return ((0x4D ^ 0x7E) & ~(0x6C ^ 0x5F)) != 0;
                                            }
                                            n5 = llllIllI[0];
                                            return n5 != 0;
                                        }
                                        if (!I.llIIllIIllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[21]) || !I.llIIllIIIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[8])) break block22;
                                        int[] nArray = new int[llllIllI[1]];
                                        nArray[I.llllIllI[0]] = llllIllI[13];
                                        if (!I.llIIllIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[llllIllI[1]];
                                        nArray8[I.llllIllI[0]] = llllIllI[11];
                                        if (!I.llIIllIIIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[llllIllI[1]];
                                        nArray9[I.llllIllI[0]] = llllIllI[14];
                                        if (!I.llIIllIIIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[llllIllI[1]];
                                        nArray10[I.llllIllI[0]] = llllIllI[16];
                                        if (!I.llIIllIIIIl(Inventory.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[llllIllI[1]];
                                        nArray11[I.llllIllI[0]] = llllIllI[46];
                                        if (!I.llIIllIIIll(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[llllIllI[1]];
                                        nArray12[I.llllIllI[0]] = llllIllI[46];
                                        if (!I.llIIllIIIIl(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = llllIllI[1];
                                    0;
                                    if (((40 + 14 - 4 + 134 ^ 82 + 8 - 36 + 84) & (23 + 71 - -11 + 43 ^ 65 + 127 - 85 + 59 ^ -1)) != -1) return n4 != 0;
                                    return ((121 + 208 - 143 + 61 ^ 7 + 129 - 87 + 112) & (0x7B ^ 0x28 ^ (0x99 ^ 0x9C) ^ -1)) != 0;
                                }
                                n4 = llllIllI[0];
                                return n4 != 0;
                            }
                            if (!I.llIIllIIllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[8]) || !I.llIIllIIIll(bA ? 1 : 0)) break block25;
                            int[] nArray = new int[llllIllI[1]];
                            nArray[I.llllIllI[0]] = llllIllI[22];
                            if (!I.llIIllIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[llllIllI[1]];
                            nArray13[I.llllIllI[0]] = llllIllI[22];
                            if (!I.llIIllIIIIl(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[llllIllI[1]];
                        nArray[I.llllIllI[0]] = llllIllI[24];
                        if (I.llIIllIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[llllIllI[1]];
                            nArray14[I.llllIllI[0]] = llllIllI[38];
                            if (I.llIIllIIIIl(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = llllIllI[1];
                                0;
                                if (3 != 2) return n3 != 0;
                                return ((0x87 ^ 0xBC) & ~(0x9B ^ 0xA0)) != 0;
                            }
                        }
                    }
                    n3 = llllIllI[0];
                    return n3 != 0;
                }
                if (!I.llIIllIIllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[8]) || !I.llIIllIIIIl(bA ? 1 : 0)) return llllIllI[0];
                int[] nArray = new int[llllIllI[1]];
                nArray[I.llllIllI[0]] = llllIllI[22];
                if (!I.llIIllIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[llllIllI[1]];
                nArray15[I.llllIllI[0]] = llllIllI[22];
                if (!I.llIIllIIIIl(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[llllIllI[1]];
            nArray[I.llllIllI[0]] = llllIllI[16];
            if (I.llIIllIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[llllIllI[1]];
                nArray16[I.llllIllI[0]] = llllIllI[23];
                if (I.llIIllIIIIl(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[llllIllI[1]];
                    nArray17[I.llllIllI[0]] = llllIllI[23];
                    if (I.llIIllIIllI(Inventory.getFirst((int[])nArray17).getQuantity(), llllIllI[19])) {
                        int[] nArray18 = new int[llllIllI[1]];
                        nArray18[I.llllIllI[0]] = llllIllI[24];
                        if (I.llIIllIIIIl(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[llllIllI[1]];
                            nArray19[I.llllIllI[0]] = llllIllI[38];
                            if (I.llIIllIIIIl(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = llllIllI[1];
                                0;
                                if (null == null) return n2 != 0;
                                return ((4 ^ 0xB ^ (0xFE ^ 0x92)) & (175 + 171 - 153 + 2 ^ 11 + 151 - 11 + 9 ^ -1)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = llllIllI[0];
        return n2 != 0;
    }

    private static boolean llIIllIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public int U() {
        try {
            I.Z();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x35 ^ 0x2F) & ~(0xB9 ^ 0xA3)) != 0) {
            return (0x40 ^ 0x51) & ~(0x4E ^ 0x5F);
        }
        return llllIllI[67];
    }

    private static int llIIllIlIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llIIllIIlII(Object object) {
        return object != null;
    }

    @Override
    public boolean W() {
        boolean bl;
        if (I.llIIllIIllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[2])) {
            bl = llllIllI[1];
            0;
            if ((0x66 ^ 0x72 ^ (0x3F ^ 0x2F)) == ((0x9C ^ 0xB1 ^ (0x3F ^ 0x5A)) & (0xBB ^ 0x84 ^ (0x15 ^ 0x62) ^ -1))) {
                return ((0xC7 ^ 0xB4 ^ (0xEF ^ 0x8A)) & (15 + 172 - 112 + 114 ^ 131 + 167 - 210 + 83 ^ -1)) != 0;
            }
        } else {
            bl = llllIllI[0];
        }
        return bl;
    }

    private static boolean llIIllIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public String V() {
        return llllIlIl[llllIllI[73]];
    }

    private static boolean llIIllIlIlI(int n2) {
        return n2 < 0;
    }

    private static String llIIlIlllIl(String lIIllIlllllIllI, String lIIllIlllllIlIl) {
        try {
            SecretKeySpec lIIllIllllllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIllIlllllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIllIllllllIII = Cipher.getInstance("Blowfish");
            lIIllIllllllIII.init(llllIllI[3], lIIllIllllllIIl);
            return new String(lIIllIllllllIII.doFinal(Base64.getDecoder().decode(lIIllIlllllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllIlllllIlll) {
            lIIllIlllllIlll.printStackTrace();
            return null;
        }
    }

    private static void llIIlIlllll() {
        llllIlIl = new String[llllIllI[80]];
        I.llllIlIl[I.llllIllI[0]] = I."Buying items";
        I.llllIlIl[I.llllIllI[1]] = I."Finished buying items, switching back to magic training";
        I.llllIlIl[I.llllIllI[3]] = I."Navigating to bank";
        I.llllIlIl[I.llllIllI[4]] = I."Handling banking";
        I.llllIlIl[I.llllIllI[7]] = I."We are missing supplies, switching to BUYING";
        I.llllIlIl[I.llllIllI[19]] = I."Nav to cows";
        I.llllIlIl[I.llllIllI[6]] = I."Attacking cows";
        I.llllIlIl[I.llllIllI[27]] = I."Casting varrock tele";
        I.llllIlIl[I.llllIllI[30]] = I."Casting lumby tele";
        I.llllIlIl[I.llllIllI[32]] = I."Casting fally tele";
        I.llllIlIl[I.llllIllI[33]] = I."Casting cammy tele";
        I.llllIlIl[I.llllIllI[34]] = I."Alching";
        I.llllIlIl[I.llllIllI[37]] = I."Wield";
        I.llllIlIl[I.llllIllI[39]] = I."Move to alch spot";
        I.llllIlIl[I.llllIllI[41]] = I."Nav to cows";
        I.llllIlIl[I.llllIllI[42]] = I."Attacking cows";
        I.llllIlIl[I.llllIllI[43]] = I."Eat";
        I.llllIlIl[I.llllIllI[44]] = I."Cow";
        I.llllIlIl[I.llllIllI[45]] = I."cow";
        I.llllIlIl[I.llllIllI[47]] = I."Attack";
        I.llllIlIl[I.llllIllI[51]] = I."Opening autocast";
        I.llllIlIl[I.llllIllI[52]] = I."Choose spell";
        I.llllIlIl[I.llllIllI[54]] = I."Wind Strike";
        I.llllIlIl[I.llllIllI[55]] = I."Water Strike";
        I.llllIlIl[I.llllIllI[56]] = I."Earth Strike";
        I.llllIlIl[I.llllIllI[21]] = I."Earth Strike";
        I.llllIlIl[I.llllIllI[50]] = I."Fire Strike";
        I.llllIlIl[I.llllIllI[73]] = I."Magic training";
        I.llllIlIl[I.llllIllI[74]] = I."ring of wealth (";
        I.llllIlIl[I.llllIllI[75]] = I."Cow";
    }

    private static boolean llIIllIlIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIIllIlIII(Object object) {
        return object == null;
    }

    public static boolean ae() {
        if (I.llIIllIIlll(Vars.getBit((int)llllIllI[48]), llllIllI[1]) && I.llIIllIIIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[19])) {
            return llllIllI[1];
        }
        if (I.llIIllIIlll(Vars.getBit((int)llllIllI[48]), llllIllI[3]) && I.llIIllIIIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[32]) && I.llIIllIIllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[19])) {
            return llllIllI[1];
        }
        if (I.llIIllIIlll(Vars.getBit((int)llllIllI[48]), llllIllI[4]) && I.llIIllIIllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[32]) && I.llIIllIIIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[39])) {
            return llllIllI[1];
        }
        if (I.llIIllIIlll(Vars.getBit((int)llllIllI[48]), llllIllI[4]) && I.llIIllIIllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[32])) {
            int[] nArray = new int[llllIllI[1]];
            nArray[I.llllIllI[0]] = llllIllI[14];
            if (I.llIIllIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return llllIllI[1];
            }
        }
        if (I.llIIllIIlll(Vars.getBit((int)llllIllI[48]), llllIllI[7]) && I.llIIllIIllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[39])) {
            int[] nArray = new int[llllIllI[1]];
            nArray[I.llllIllI[0]] = llllIllI[14];
            if (I.llIIllIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return llllIllI[1];
            }
        }
        return llllIllI[0];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ad() {
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
                                                    if (!I.llIIllIIIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[21])) break block19;
                                                    int[] nArray = new int[llllIllI[1]];
                                                    nArray[I.llllIllI[0]] = llllIllI[9];
                                                    if (!I.llIIllIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[llllIllI[1]];
                                                    nArray2[I.llllIllI[0]] = llllIllI[13];
                                                    if (!I.llIIllIIIIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[llllIllI[1]];
                                                    nArray3[I.llllIllI[0]] = llllIllI[11];
                                                    if (!I.llIIllIIIIl(Bank.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[llllIllI[1]];
                                                    nArray4[I.llllIllI[0]] = llllIllI[14];
                                                    if (!I.llIIllIIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[llllIllI[1]];
                                                    nArray5[I.llllIllI[0]] = llllIllI[20];
                                                    if (!I.llIIllIIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[llllIllI[1]];
                                                    nArray6[I.llllIllI[0]] = llllIllI[46];
                                                    if (!I.llIIllIIIll(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[llllIllI[1]];
                                                    nArray7[I.llllIllI[0]] = llllIllI[46];
                                                    if (!I.llIIllIIIIl(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = llllIllI[1];
                                                0;
                                                if (null == null) return n5 != 0;
                                                return ((0x40 ^ 0x64) & ~(2 ^ 0x26)) != 0;
                                            }
                                            n5 = llllIllI[0];
                                            return n5 != 0;
                                        }
                                        if (!I.llIIllIIllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[21]) || !I.llIIllIIIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[8])) break block22;
                                        int[] nArray = new int[llllIllI[1]];
                                        nArray[I.llllIllI[0]] = llllIllI[13];
                                        if (!I.llIIllIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[llllIllI[1]];
                                        nArray8[I.llllIllI[0]] = llllIllI[11];
                                        if (!I.llIIllIIIIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[llllIllI[1]];
                                        nArray9[I.llllIllI[0]] = llllIllI[14];
                                        if (!I.llIIllIIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[llllIllI[1]];
                                        nArray10[I.llllIllI[0]] = llllIllI[16];
                                        if (!I.llIIllIIIIl(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[llllIllI[1]];
                                        nArray11[I.llllIllI[0]] = llllIllI[46];
                                        if (!I.llIIllIIIll(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[llllIllI[1]];
                                        nArray12[I.llllIllI[0]] = llllIllI[46];
                                        if (!I.llIIllIIIIl(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = llllIllI[1];
                                    0;
                                    if (2 > -1) return n4 != 0;
                                    return ((0xC2 ^ 0xA0) & ~(0x33 ^ 0x51)) != 0;
                                }
                                n4 = llllIllI[0];
                                return n4 != 0;
                            }
                            if (!I.llIIllIIllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[8]) || !I.llIIllIIIll(bA ? 1 : 0)) break block25;
                            int[] nArray = new int[llllIllI[1]];
                            nArray[I.llllIllI[0]] = llllIllI[22];
                            if (!I.llIIllIIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[llllIllI[1]];
                            nArray13[I.llllIllI[0]] = llllIllI[22];
                            if (!I.llIIllIIIIl(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[llllIllI[1]];
                        nArray[I.llllIllI[0]] = llllIllI[24];
                        if (I.llIIllIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[llllIllI[1]];
                            nArray14[I.llllIllI[0]] = llllIllI[25];
                            if (I.llIIllIIIIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = llllIllI[1];
                                0;
                                if (2 > ((0x4E ^ 0x25 ^ (4 ^ 0x31)) & (0xE9 ^ 0xB3 ^ (0x86 ^ 0x82) ^ -1))) return n3 != 0;
                                return ((0 + 20 - -6 + 138 ^ 164 + 183 - 251 + 88) & (0x74 ^ 0x3D ^ (0x3E ^ 0x6B) ^ -1)) != 0;
                            }
                        }
                    }
                    n3 = llllIllI[0];
                    return n3 != 0;
                }
                if (!I.llIIllIIllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[8]) || !I.llIIllIIIIl(bA ? 1 : 0)) return llllIllI[0];
                int[] nArray = new int[llllIllI[1]];
                nArray[I.llllIllI[0]] = llllIllI[22];
                if (!I.llIIllIIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[llllIllI[1]];
                nArray15[I.llllIllI[0]] = llllIllI[22];
                if (!I.llIIllIIIIl(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[llllIllI[1]];
            nArray[I.llllIllI[0]] = llllIllI[16];
            if (I.llIIllIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[llllIllI[1]];
                nArray16[I.llllIllI[0]] = llllIllI[23];
                if (I.llIIllIIIIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[llllIllI[1]];
                    nArray17[I.llllIllI[0]] = llllIllI[23];
                    if (I.llIIllIIllI(Bank.getFirst((int[])nArray17).getQuantity(), llllIllI[19])) {
                        int[] nArray18 = new int[llllIllI[1]];
                        nArray18[I.llllIllI[0]] = llllIllI[24];
                        if (I.llIIllIIIIl(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[llllIllI[1]];
                            nArray19[I.llllIllI[0]] = llllIllI[25];
                            if (I.llIIllIIIIl(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = llllIllI[1];
                                0;
                                if (-1 < (0x7D ^ 0x79)) return n2 != 0;
                                return ((0x6C ^ 0x22) & ~(0x24 ^ 0x6A)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = llllIllI[0];
        return n2 != 0;
    }

    static {
        I.llIIllIIIII();
        I.llIIlIlllll();
        bA = llllIllI[0];
        bB = new ArrayList<d>();
        bC = new WorldArea(llllIllI[76], llllIllI[77], llllIllI[51], llllIllI[41], llllIllI[0]);
        bD = new WorldPoint(llllIllI[78], llllIllI[79], llllIllI[0]);
        bE = null;
    }

    private static boolean llIIllIIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static String llIIlIllllI(String lIIlllIIIIIIllI, String lIIlllIIIIIlIlI) {
        lIIlllIIIIIIllI = new String(Base64.getDecoder().decode(lIIlllIIIIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIlllIIIIIlIIl = new StringBuilder();
        char[] lIIlllIIIIIlIII = lIIlllIIIIIlIlI.toCharArray();
        int lIIlllIIIIIIlll = llllIllI[0];
        char[] lIIlllIIIIIIIIl = lIIlllIIIIIIllI.toCharArray();
        int lIIlllIIIIIIIII = lIIlllIIIIIIIIl.length;
        int lIIllIlllllllll = llllIllI[0];
        while (I.llIIllIIIlI(lIIllIlllllllll, lIIlllIIIIIIIII)) {
            char lIIlllIIIIIllII = lIIlllIIIIIIIIl[lIIllIlllllllll];
            lIIlllIIIIIlIIl.append((char)(lIIlllIIIIIllII ^ lIIlllIIIIIlIII[lIIlllIIIIIIlll % lIIlllIIIIIlIII.length]));
            0;
            ++lIIlllIIIIIIlll;
            ++lIIllIlllllllll;
            0;
            if (((0x97 ^ 0xAB) & ~(1 ^ 0x3D)) <= ((0xE ^ 0x52) & ~(0x5F ^ 3))) continue;
            return null;
        }
        return String.valueOf(lIIlllIIIIIlIIl);
    }

    private static boolean llIIllIIIIl(int n2) {
        return n2 != 0;
    }

    private static void ag() {
        d lIIlllIIIlIIIII;
        Object lIIlllIIIlIIIIl;
        if (I.llIIllIIIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[8])) {
            int[] nArray = new int[llllIllI[1]];
            nArray[I.llllIllI[0]] = llllIllI[16];
            if (I.llIIllIIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new d(llllIllI[16], llllIllI[57], llllIllI[58]);
                bB.add(d2);
                0;
            }
            int[] nArray2 = new int[llllIllI[1]];
            nArray2[I.llllIllI[0]] = llllIllI[9];
            if (I.llIIllIIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                lIIlllIIIlIIIIl = new d(llllIllI[9], llllIllI[59], llllIllI[6]);
                bB.add((d)lIIlllIIIlIIIIl);
                0;
            }
            int[] nArray3 = new int[llllIllI[1]];
            nArray3[I.llllIllI[0]] = llllIllI[11];
            if (I.llIIllIIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                lIIlllIIIlIIIIl = new d(llllIllI[11], llllIllI[60], llllIllI[6]);
                bB.add((d)lIIlllIIIlIIIIl);
                0;
            }
            int[] nArray4 = new int[llllIllI[1]];
            nArray4[I.llllIllI[0]] = llllIllI[13];
            if (I.llIIllIIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                lIIlllIIIlIIIIl = new d(llllIllI[13], llllIllI[61], llllIllI[6]);
                bB.add((d)lIIlllIIIlIIIIl);
                0;
            }
            int[] nArray5 = new int[llllIllI[1]];
            nArray5[I.llllIllI[0]] = llllIllI[14];
            if (I.llIIllIIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                lIIlllIIIlIIIIl = new d(llllIllI[14], llllIllI[5], llllIllI[6]);
                bB.add((d)lIIlllIIIlIIIIl);
                0;
            }
            int[] nArray6 = new int[llllIllI[1]];
            nArray6[I.llllIllI[0]] = llllIllI[46];
            if (I.llIIllIIIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                lIIlllIIIlIIIIl = new d(llllIllI[46], llllIllI[1], e.c(llllIllI[62], llllIllI[63]));
                bB.add((d)lIIlllIIIlIIIIl);
                0;
            }
        }
        if (I.llIIllIIllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllI[8])) {
            int[] nArray = new int[llllIllI[1]];
            nArray[I.llllIllI[0]] = llllIllI[24];
            if (I.llIIllIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[llllIllI[1]];
                nArray7[I.llllIllI[0]] = llllIllI[24];
                if (I.llIIllIIIlI(Bank.getFirst((int[])nArray7).getQuantity(), llllIllI[61])) {
                    int[] nArray8 = new int[llllIllI[1]];
                    nArray8[I.llllIllI[0]] = llllIllI[24];
                    lIIlllIIIlIIIIl = new d(llllIllI[24], llllIllI[61] - Bank.getFirst((int[])nArray8).getQuantity(), llllIllI[64]);
                    bB.add((d)lIIlllIIIlIIIIl);
                    0;
                }
            }
            int[] nArray9 = new int[llllIllI[1]];
            nArray9[I.llllIllI[0]] = llllIllI[24];
            if (I.llIIllIIIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                lIIlllIIIlIIIIl = new d(llllIllI[24], llllIllI[61], llllIllI[64]);
                bB.add((d)lIIlllIIIlIIIIl);
                0;
            }
            int[] nArray10 = new int[llllIllI[1]];
            nArray10[I.llllIllI[0]] = llllIllI[25];
            if (I.llIIllIIIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[llllIllI[1]];
                nArray11[I.llllIllI[0]] = llllIllI[25];
                if (I.llIIllIIIlI(Bank.getFirst((int[])nArray11).getQuantity(), llllIllI[61])) {
                    int[] nArray12 = new int[llllIllI[1]];
                    nArray12[I.llllIllI[0]] = llllIllI[25];
                    lIIlllIIIlIIIIl = new d(llllIllI[25], llllIllI[61] - Bank.getFirst((int[])nArray12).getQuantity(), llllIllI[65]);
                    bB.add((d)lIIlllIIIlIIIIl);
                    0;
                }
            }
            int[] nArray13 = new int[llllIllI[1]];
            nArray13[I.llllIllI[0]] = llllIllI[25];
            if (I.llIIllIIIll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                lIIlllIIIlIIIIl = new d(llllIllI[25], llllIllI[61], llllIllI[65]);
                bB.add((d)lIIlllIIIlIIIIl);
                0;
            }
            int[] nArray14 = new int[llllIllI[1]];
            nArray14[I.llllIllI[0]] = llllIllI[22];
            if (I.llIIllIIIll(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[llllIllI[1]];
                nArray15[I.llllIllI[0]] = llllIllI[22];
                if (I.llIIllIIIll(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    lIIlllIIIlIIIIl = new d(llllIllI[22], llllIllI[1], llllIllI[66]);
                    bB.add((d)lIIlllIIIlIIIIl);
                    0;
                }
            }
            if (I.llIIllIIIIl(bA ? 1 : 0)) {
                int[] nArray16 = new int[llllIllI[1]];
                nArray16[I.llllIllI[0]] = llllIllI[16];
                if (I.llIIllIIIIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[llllIllI[1]];
                    nArray17[I.llllIllI[0]] = llllIllI[16];
                    if (I.llIIllIIIlI(Bank.getFirst((int[])nArray17).getQuantity(), llllIllI[61])) {
                        int[] nArray18 = new int[llllIllI[1]];
                        nArray18[I.llllIllI[0]] = llllIllI[16];
                        lIIlllIIIlIIIIl = new d(llllIllI[16], llllIllI[61] - Bank.getFirst((int[])nArray18).getQuantity(), llllIllI[58]);
                        bB.add((d)lIIlllIIIlIIIIl);
                        0;
                    }
                }
                int[] nArray19 = new int[llllIllI[1]];
                nArray19[I.llllIllI[0]] = llllIllI[16];
                if (I.llIIllIIIll(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    lIIlllIIIlIIIIl = new d(llllIllI[16], llllIllI[61], llllIllI[58]);
                    bB.add((d)lIIlllIIIlIIIIl);
                    0;
                }
                int[] nArray20 = new int[llllIllI[1]];
                nArray20[I.llllIllI[0]] = llllIllI[23];
                if (I.llIIllIIIIl(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[llllIllI[1]];
                    nArray21[I.llllIllI[0]] = llllIllI[23];
                    if (I.llIIllIIIlI(Bank.getFirst((int[])nArray21).getQuantity(), llllIllI[66])) {
                        int[] nArray22 = new int[llllIllI[1]];
                        nArray22[I.llllIllI[0]] = llllIllI[23];
                        lIIlllIIIlIIIIl = new d(llllIllI[23], llllIllI[66] - Bank.getFirst((int[])nArray22).getQuantity(), llllIllI[6]);
                        bB.add((d)lIIlllIIIlIIIIl);
                        0;
                    }
                }
                int[] nArray23 = new int[llllIllI[1]];
                nArray23[I.llllIllI[0]] = llllIllI[23];
                if (I.llIIllIIIll(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    lIIlllIIIlIIIIl = new d(llllIllI[23], llllIllI[66], llllIllI[6]);
                    bB.add((d)lIIlllIIIlIIIIl);
                    0;
                }
            }
        }
        int[] nArray = new int[llllIllI[1]];
        nArray[I.llllIllI[0]] = llllIllI[20];
        if (I.llIIllIIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIIlllIIIlIIIIl = new d(llllIllI[20], llllIllI[67], llllIllI[68]);
            bB.add((d)lIIlllIIIlIIIIl);
            0;
        }
        if (I.llIIllIIIll(Bank.contains(lIIlllIIIlIIIIl = item -> item.getName().toLowerCase().contains(llllIlIl[llllIllI[74]])) ? 1 : 0)) {
            lIIlllIIIlIIIII = new d(llllIllI[69], llllIllI[19], llllIllI[70]);
            bB.add(lIIlllIIIlIIIII);
            0;
        }
        int[] nArray24 = new int[llllIllI[1]];
        nArray24[I.llllIllI[0]] = llllIllI[71];
        if (I.llIIllIIIll(Bank.contains((int[])nArray24) ? 1 : 0)) {
            lIIlllIIIlIIIII = new d(llllIllI[71], llllIllI[33], llllIllI[72]);
            bB.add(lIIlllIIIlIIIII);
            0;
        }
        int[] nArray25 = new int[llllIllI[1]];
        nArray25[I.llllIllI[0]] = llllIllI[18];
        if (I.llIIllIIIll(Bank.contains((int[])nArray25) ? 1 : 0)) {
            lIIlllIIIlIIIII = new d(llllIllI[18], llllIllI[33], llllIllI[72]);
            bB.add(lIIlllIIIlIIIII);
            0;
        }
    }
}

