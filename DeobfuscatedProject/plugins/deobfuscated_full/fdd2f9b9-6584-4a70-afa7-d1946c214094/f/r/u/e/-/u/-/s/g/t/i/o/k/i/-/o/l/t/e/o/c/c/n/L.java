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

public class L
implements G {
    static /* synthetic */ WorldArea bw;
    static /* synthetic */ WorldPoint bx;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ WorldPoint by;
    private static /* synthetic */ String[] lIIIllIlll;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ int[] lIIIlllIIl;
    public static /* synthetic */ boolean bu;

    private static String llllIIIIIIII(String llIllllllII, String llIllllIllI) {
        llIllllllII = new String(Base64.getDecoder().decode(llIllllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlllllIlI = new StringBuilder();
        char[] llIlllllIIl = llIllllIllI.toCharArray();
        int llIlllllIII = lIIIlllIIl[0];
        char[] llIllllIIlI = llIllllllII.toCharArray();
        int llIllllIIIl = llIllllIIlI.length;
        int llIllllIIII = lIIIlllIIl[0];
        while (L.llllIIIlIIIl(llIllllIIII, llIllllIIIl)) {
            char llIllllllIl = llIllllIIlI[llIllllIIII];
            llIlllllIlI.append((char)(llIllllllIl ^ llIlllllIIl[llIlllllIII % llIlllllIIl.length]));
            0;
            ++llIlllllIII;
            ++llIllllIIII;
            0;
            if (((0x7C ^ 0x34 ^ (0x78 ^ 0xC)) & (0xA4 ^ 0x8B ^ (0xBC ^ 0xAF) ^ -1)) >= (2 & (2 ^ -1))) continue;
            return null;
        }
        return String.valueOf(llIlllllIlI);
    }

    private static String lllIllllllll(String llIllIllIII, String llIllIllIIl) {
        try {
            SecretKeySpec llIllIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIllIlllII = Cipher.getInstance("Blowfish");
            llIllIlllII.init(lIIIlllIIl[3], llIllIlllIl);
            return new String(llIllIlllII.doFinal(Base64.getDecoder().decode(llIllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIllIllIll) {
            llIllIllIll.printStackTrace();
            return null;
        }
    }

    private static void llllIIIIllll() {
        lIIIlllIIl = new int[81];
        L.lIIIlllIIl[0] = (0x33 ^ 0x40 ^ (0xE4 ^ 0xC1)) & (8 + 48 - 37 + 131 ^ 96 + 71 - 86 + 111 ^ -1);
        L.lIIIlllIIl[1] = 1;
        L.lIIIlllIIl[2] = 0x5D ^ 0xB ^ (0xE ^ 0x6A);
        L.lIIIlllIIl[3] = 2;
        L.lIIIlllIIl[4] = 3;
        L.lIIIlllIIl[5] = 0xFFFF9FDF & 0x73A8;
        L.lIIIlllIIl[6] = 0xD0 ^ 0xB8 ^ (3 ^ 0x6D);
        L.lIIIlllIIl[7] = 0x6C ^ 0x15 ^ (0x68 ^ 0x15);
        L.lIIIlllIIl[8] = 0x84 ^ 0x80 ^ (0x62 ^ 0x51);
        L.lIIIlllIIl[9] = -(0xFFFFEFEE & 0x1C93) & (0xFFFFDEAF & 0x2FFF);
        L.lIIIlllIIl[10] = -(0xFFFFEAB7 & 0x1D49) & (0xFFFFBDFE & 0x4FDD);
        L.lIIIlllIIl[11] = -(0xFFFFEDF7 & 0x7EDD) & (0xFFFFFEFF & 0x6FFF);
        L.lIIIlllIIl[12] = 0xFFFF9DD6 & 0x6BED;
        L.lIIIlllIIl[13] = -(0xFFFFD67B & 0x2D87) & (0xFFFFBE2F & 0x47FF);
        L.lIIIlllIIl[14] = 0xFFFFAB2F & 0x56FA;
        L.lIIIlllIIl[15] = -(0xFFFFFB3E & 0x6CEB) & (0xFFFFF9BD & Short.MAX_VALUE);
        L.lIIIlllIIl[16] = -(0xFFFFFE7B & 0x398D) & (0xFFFFBA3F & 0x7FFB);
        L.lIIIlllIIl[17] = 0xFFFFB1D7 & 0x7F79;
        L.lIIIlllIIl[18] = 0xFFFF9F79 & 0x7FCF;
        L.lIIIlllIIl[19] = 5 + 56 - 53 + 129 ^ 138 + 18 - 40 + 24;
        L.lIIIlllIIl[20] = -(0xFFFFD9E3 & 0x2E9D) & (0xFFFFBDFF & 0x4BFB);
        L.lIIIlllIIl[21] = 0x30 ^ 0x29;
        L.lIIIlllIIl[22] = 0xFFFFA76B & 0x5DFF;
        L.lIIIlllIIl[23] = -(0xFFFFFF59 & 0x4CF7) & (0xFFFFDEFE & 0x6F7D);
        L.lIIIlllIIl[24] = -(0xFFFFF7DF & 0x49AD) & (0xFFFFE3FF & 0x5FBD);
        L.lIIIlllIIl[25] = 0x7C ^ 0x42;
        L.lIIIlllIIl[26] = 0x82 ^ 0x9D;
        L.lIIIlllIIl[27] = 0x4B ^ 0x4C;
        L.lIIIlllIIl[28] = -1;
        L.lIIIlllIIl[29] = 0x50 ^ 0x75;
        L.lIIIlllIIl[30] = 109 + 10 - 100 + 108 ^ (0x7B ^ 0xC);
        L.lIIIlllIIl[31] = 3 ^ 0x2E;
        L.lIIIlllIIl[32] = 86 + 153 - 234 + 198 ^ 67 + 60 - 13 + 80;
        L.lIIIlllIIl[33] = 49 + 176 - 54 + 35 ^ 149 + 178 - 134 + 3;
        L.lIIIlllIIl[34] = 0xE ^ 5;
        L.lIIIlllIIl[35] = -(0xFFFFF9FE & 0x7723) & (0xFFFFFD7B & Short.MAX_VALUE);
        L.lIIIlllIIl[36] = 0xFFFFFF9F & 0xDFF;
        L.lIIIlllIIl[37] = 0xE1 ^ 0xAC ^ (0x45 ^ 4);
        L.lIIIlllIIl[38] = 0x47 ^ 0x78;
        L.lIIIlllIIl[39] = 0x67 ^ 0x7D ^ (0xA9 ^ 0xBE);
        L.lIIIlllIIl[40] = 0xFFFFEDAC & 0x1FFF;
        L.lIIIlllIIl[41] = 0xCB ^ 0xC5;
        L.lIIIlllIIl[42] = 0x81 ^ 0x8E;
        L.lIIIlllIIl[43] = 0x6A ^ 0x7A;
        L.lIIIlllIIl[44] = 0xAE ^ 0xBF;
        L.lIIIlllIIl[45] = 0xE3 ^ 0xA2 ^ (0xEF ^ 0xBC);
        L.lIIIlllIIl[46] = -(0xFFFFEF5F & 0x7AB9) & (0xFFFFEF7D & Short.MAX_VALUE);
        L.lIIIlllIIl[47] = 0x13 ^ 0;
        L.lIIIlllIIl[48] = -(0xFFFFFAA3 & 0x7F7F) & (0xFFFFFB37 & 0x7FFE);
        L.lIIIlllIIl[49] = -(0xFFFFE9E7 & 0x5FBF) & (0xFFFFDFFF & 0x6BF7);
        L.lIIIlllIIl[50] = 0x30 ^ 0x16 ^ (0x85 ^ 0xB9);
        L.lIIIlllIIl[51] = 0x59 ^ 0x30 ^ (6 ^ 0x7B);
        L.lIIIlllIIl[52] = 0xF ^ 0x1A;
        L.lIIIlllIIl[53] = 126 + 39 - 51 + 87;
        L.lIIIlllIIl[54] = 0x8E ^ 0x98;
        L.lIIIlllIIl[55] = 0x81 ^ 0x96;
        L.lIIIlllIIl[56] = 0x78 ^ 1 ^ (0x10 ^ 0x71);
        L.lIIIlllIIl[57] = -(0xFFFFFFAF & 0x5C53) & (0xFFFFFFEA & 0x5FFF);
        L.lIIIlllIIl[58] = 150 + 91 - 113 + 42;
        L.lIIIlllIIl[59] = -(0xFFFFC177 & 0x7EDF) & (0xFFFFDFF6 & 0x6FFF);
        L.lIIIlllIIl[60] = 0xFFFFBFF9 & 0x47D6;
        L.lIIIlllIIl[61] = -(0xFFFFD645 & 0x79BF) & (0xFFFFDFBD & 0x7BFE);
        L.lIIIlllIIl[62] = -(0xFFFFC7EF & 0x7C1B) & (0xFFFFF7DE & 0x7CFF);
        L.lIIIlllIIl[63] = 0xFFFFBFEE & 0x7C9D;
        L.lIIIlllIIl[64] = 0x65 ^ 0x1D;
        L.lIIIlllIIl[65] = 64 + 59 - 97 + 124;
        L.lIIIlllIIl[66] = -(0x54 ^ 0x52) & (0xFFFFFEFF & 0x3B9D);
        L.lIIIlllIIl[67] = 0xC2 ^ 0xA6;
        L.lIIIlllIIl[68] = -(0xFFFFFFF7 & 0x78A9) & (0xFFFFFBE9 & 0x7DF6);
        L.lIIIlllIIl[69] = -(0xFFFFF273 & 0x1DAF) & (0xFFFFFFFF & 0x3EEE);
        L.lIIIlllIIl[70] = 0xFFFFE1EB & 0x7FBC;
        L.lIIIlllIIl[71] = 0xFFFFDFDF & 0x3F67;
        L.lIIIlllIIl[72] = -(0xFFFFF3FB & 0x1C3F) & (0xFFFFBFFF & 0x53BE);
        L.lIIIlllIIl[73] = 0x53 ^ 0x48;
        L.lIIIlllIIl[74] = 0x2B ^ 0x37;
        L.lIIIlllIIl[75] = 31 + 99 - 17 + 39 ^ 21 + 102 - 84 + 94;
        L.lIIIlllIIl[76] = -(0xFFFFB661 & 0x6D9F) & (0xFFFFFFFE & 0x2FCF);
        L.lIIIlllIIl[77] = -(0xFFFFDD3B & 0x63DD) & (0xFFFFEDFB & 0x5FFF);
        L.lIIIlllIIl[78] = -(0xFFFFB14D & 0x5EBB) & (0xFFFFDFFF & 0x3BDF);
        L.lIIIlllIIl[79] = 0xFFFFBFEB & 0x4CFD;
        L.lIIIlllIIl[80] = 0xDF ^ 0x91 ^ (0xFD ^ 0xAD);
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
                                                    if (!L.llllIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[21])) break block19;
                                                    int[] nArray = new int[lIIIlllIIl[1]];
                                                    nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[9];
                                                    if (!L.llllIIIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIIIlllIIl[1]];
                                                    nArray2[L.lIIIlllIIl[0]] = lIIIlllIIl[13];
                                                    if (!L.llllIIIlIIII(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIIIlllIIl[1]];
                                                    nArray3[L.lIIIlllIIl[0]] = lIIIlllIIl[11];
                                                    if (!L.llllIIIlIIII(Bank.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIIIlllIIl[1]];
                                                    nArray4[L.lIIIlllIIl[0]] = lIIIlllIIl[14];
                                                    if (!L.llllIIIlIIII(Bank.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIIIlllIIl[1]];
                                                    nArray5[L.lIIIlllIIl[0]] = lIIIlllIIl[20];
                                                    if (!L.llllIIIlIIII(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIIIlllIIl[1]];
                                                    nArray6[L.lIIIlllIIl[0]] = lIIIlllIIl[46];
                                                    if (!L.llllIIIlIIlI(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIIIlllIIl[1]];
                                                    nArray7[L.lIIIlllIIl[0]] = lIIIlllIIl[46];
                                                    if (!L.llllIIIlIIII(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIIIlllIIl[1];
                                                0;
                                                if (1 >= -1) return n5 != 0;
                                                return ((2 + 217 - 136 + 138 ^ 98 + 59 - 135 + 109) & (0xF1 ^ 0xB5 ^ (0x46 ^ 0x5C) ^ -1)) != 0;
                                            }
                                            n5 = lIIIlllIIl[0];
                                            return n5 != 0;
                                        }
                                        if (!L.llllIIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[21]) || !L.llllIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[8])) break block22;
                                        int[] nArray = new int[lIIIlllIIl[1]];
                                        nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[13];
                                        if (!L.llllIIIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIIIlllIIl[1]];
                                        nArray8[L.lIIIlllIIl[0]] = lIIIlllIIl[11];
                                        if (!L.llllIIIlIIII(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIIIlllIIl[1]];
                                        nArray9[L.lIIIlllIIl[0]] = lIIIlllIIl[14];
                                        if (!L.llllIIIlIIII(Bank.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIIIlllIIl[1]];
                                        nArray10[L.lIIIlllIIl[0]] = lIIIlllIIl[16];
                                        if (!L.llllIIIlIIII(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIIIlllIIl[1]];
                                        nArray11[L.lIIIlllIIl[0]] = lIIIlllIIl[46];
                                        if (!L.llllIIIlIIlI(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIIIlllIIl[1]];
                                        nArray12[L.lIIIlllIIl[0]] = lIIIlllIIl[46];
                                        if (!L.llllIIIlIIII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIIIlllIIl[1];
                                    0;
                                    if (null == null) return n4 != 0;
                                    return ((0x65 ^ 0x47 ^ (0x45 ^ 0x50)) & (124 + 45 - 79 + 54 ^ 133 + 109 - 216 + 141 ^ -1)) != 0;
                                }
                                n4 = lIIIlllIIl[0];
                                return n4 != 0;
                            }
                            if (!L.llllIIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[8]) || !L.llllIIIlIIlI(bu ? 1 : 0)) break block25;
                            int[] nArray = new int[lIIIlllIIl[1]];
                            nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[22];
                            if (!L.llllIIIlIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIIIlllIIl[1]];
                            nArray13[L.lIIIlllIIl[0]] = lIIIlllIIl[22];
                            if (!L.llllIIIlIIII(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIIIlllIIl[1]];
                        nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[24];
                        if (L.llllIIIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIIIlllIIl[1]];
                            nArray14[L.lIIIlllIIl[0]] = lIIIlllIIl[25];
                            if (L.llllIIIlIIII(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIIIlllIIl[1];
                                0;
                                if (2 >= 1) return n3 != 0;
                                return false;
                            }
                        }
                    }
                    n3 = lIIIlllIIl[0];
                    return n3 != 0;
                }
                if (!L.llllIIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[8]) || !L.llllIIIlIIII(bu ? 1 : 0)) return lIIIlllIIl[0];
                int[] nArray = new int[lIIIlllIIl[1]];
                nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[22];
                if (!L.llllIIIlIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIIIlllIIl[1]];
                nArray15[L.lIIIlllIIl[0]] = lIIIlllIIl[22];
                if (!L.llllIIIlIIII(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIIIlllIIl[1]];
            nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[16];
            if (L.llllIIIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIIIlllIIl[1]];
                nArray16[L.lIIIlllIIl[0]] = lIIIlllIIl[23];
                if (L.llllIIIlIIII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIIlllIIl[1]];
                    nArray17[L.lIIIlllIIl[0]] = lIIIlllIIl[23];
                    if (L.llllIIIlIlIl(Bank.getFirst((int[])nArray17).getQuantity(), lIIIlllIIl[19])) {
                        int[] nArray18 = new int[lIIIlllIIl[1]];
                        nArray18[L.lIIIlllIIl[0]] = lIIIlllIIl[24];
                        if (L.llllIIIlIIII(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIIIlllIIl[1]];
                            nArray19[L.lIIIlllIIl[0]] = lIIIlllIIl[25];
                            if (L.llllIIIlIIII(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIIIlllIIl[1];
                                0;
                                if (1 >= 1) return n2 != 0;
                                return ((0x2E ^ 0x3E ^ (0x49 ^ 0x47)) & (0x7C ^ 0x5D ^ (0xAA ^ 0x95) ^ -1)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIIlllIIl[0];
        return n2 != 0;
    }

    private static String llllIIIIllIl(String llIlllIIlll, String llIlllIIlII) {
        try {
            SecretKeySpec llIlllIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlllIIlII.getBytes(StandardCharsets.UTF_8)), lIIIlllIIl[30]), "DES");
            Cipher llIlllIlIIl = Cipher.getInstance("DES");
            llIlllIlIIl.init(lIIIlllIIl[3], llIlllIlIlI);
            return new String(llIlllIlIIl.doFinal(Base64.getDecoder().decode(llIlllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlllIlIII) {
            llIlllIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean llllIIIlIIlI(int n2) {
        return n2 == 0;
    }

    public static boolean ad() {
        if (L.llllIIIlIllI(Vars.getBit((int)lIIIlllIIl[48]), lIIIlllIIl[1]) && L.llllIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[19])) {
            return lIIIlllIIl[1];
        }
        if (L.llllIIIlIllI(Vars.getBit((int)lIIIlllIIl[48]), lIIIlllIIl[3]) && L.llllIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[32]) && L.llllIIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[19])) {
            return lIIIlllIIl[1];
        }
        if (L.llllIIIlIllI(Vars.getBit((int)lIIIlllIIl[48]), lIIIlllIIl[4]) && L.llllIIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[32]) && L.llllIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[39])) {
            return lIIIlllIIl[1];
        }
        if (L.llllIIIlIllI(Vars.getBit((int)lIIIlllIIl[48]), lIIIlllIIl[4]) && L.llllIIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[32])) {
            int[] nArray = new int[lIIIlllIIl[1]];
            nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[14];
            if (L.llllIIIlIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIIIlllIIl[1];
            }
        }
        if (L.llllIIIlIllI(Vars.getBit((int)lIIIlllIIl[48]), lIIIlllIIl[7]) && L.llllIIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[39])) {
            int[] nArray = new int[lIIIlllIIl[1]];
            nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[14];
            if (L.llllIIIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIIIlllIIl[1];
            }
        }
        return lIIIlllIIl[0];
    }

    static {
        L.llllIIIIllll();
        L.llllIIIIlllI();
        bu = lIIIlllIIl[0];
        bv = new ArrayList<d>();
        bw = new WorldArea(lIIIlllIIl[76], lIIIlllIIl[77], lIIIlllIIl[51], lIIIlllIIl[41], lIIIlllIIl[0]);
        bx = new WorldPoint(lIIIlllIIl[78], lIIIlllIIl[79], lIIIlllIIl[0]);
        by = null;
    }

    private static boolean llllIIIllIIl(int n2) {
        return n2 < 0;
    }

    @Override
    public String U() {
        return lIIIllIlll[lIIIlllIIl[73]];
    }

    private static void llllIIIIlllI() {
        lIIIllIlll = new String[lIIIlllIIl[80]];
        L.lIIIllIlll[L.lIIIlllIIl[0]] = L."Buying items";
        L.lIIIllIlll[L.lIIIlllIIl[1]] = L."Finished buying items, switching back to magic training";
        L.lIIIllIlll[L.lIIIlllIIl[3]] = L."Navigating to bank";
        L.lIIIllIlll[L.lIIIlllIIl[4]] = L."Handling banking";
        L.lIIIllIlll[L.lIIIlllIIl[7]] = L."We are missing supplies, switching to BUYING";
        L.lIIIllIlll[L.lIIIlllIIl[19]] = L."Nav to cows";
        L.lIIIllIlll[L.lIIIlllIIl[6]] = L."Attacking cows";
        L.lIIIllIlll[L.lIIIlllIIl[27]] = L."Casting varrock tele";
        L.lIIIllIlll[L.lIIIlllIIl[30]] = L."Casting lumby tele";
        L.lIIIllIlll[L.lIIIlllIIl[32]] = L."Casting fally tele";
        L.lIIIllIlll[L.lIIIlllIIl[33]] = L."Casting cammy tele";
        L.lIIIllIlll[L.lIIIlllIIl[34]] = L."Alching";
        L.lIIIllIlll[L.lIIIlllIIl[37]] = L."Wield";
        L.lIIIllIlll[L.lIIIlllIIl[39]] = L."Move to alch spot";
        L.lIIIllIlll[L.lIIIlllIIl[41]] = L."Nav to cows";
        L.lIIIllIlll[L.lIIIlllIIl[42]] = L."Attacking cows";
        L.lIIIllIlll[L.lIIIlllIIl[43]] = L."Eat";
        L.lIIIllIlll[L.lIIIlllIIl[44]] = L."Cow";
        L.lIIIllIlll[L.lIIIlllIIl[45]] = L."cow";
        L.lIIIllIlll[L.lIIIlllIIl[47]] = L."Attack";
        L.lIIIllIlll[L.lIIIlllIIl[51]] = L."Opening autocast";
        L.lIIIllIlll[L.lIIIlllIIl[52]] = L."Choose spell";
        L.lIIIllIlll[L.lIIIlllIIl[54]] = L."Wind Strike";
        L.lIIIllIlll[L.lIIIlllIIl[55]] = L."Water Strike";
        L.lIIIllIlll[L.lIIIlllIIl[56]] = L."Earth Strike";
        L.lIIIllIlll[L.lIIIlllIIl[21]] = L."Earth Strike";
        L.lIIIllIlll[L.lIIIlllIIl[50]] = L."Fire Strike";
        L.lIIIllIlll[L.lIIIlllIIl[73]] = L."Magic training";
        L.lIIIllIlll[L.lIIIlllIIl[74]] = L."ring of wealth (";
        L.lIIIllIlll[L.lIIIlllIIl[75]] = L."Cow";
    }

    private static boolean llllIIIllIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llllIIIlIIll(Object object) {
        return object != null;
    }

    @Override
    public boolean S() {
        return lIIIlllIIl[0];
    }

    private static void af() {
        d lllIIIlIIIl;
        Object lllIIIlIIlI;
        if (L.llllIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[8])) {
            int[] nArray = new int[lIIIlllIIl[1]];
            nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[16];
            if (L.llllIIIlIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new d(lIIIlllIIl[16], lIIIlllIIl[57], lIIIlllIIl[58]);
                bv.add(d2);
                0;
            }
            int[] nArray2 = new int[lIIIlllIIl[1]];
            nArray2[L.lIIIlllIIl[0]] = lIIIlllIIl[9];
            if (L.llllIIIlIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                lllIIIlIIlI = new d(lIIIlllIIl[9], lIIIlllIIl[59], lIIIlllIIl[6]);
                bv.add((d)lllIIIlIIlI);
                0;
            }
            int[] nArray3 = new int[lIIIlllIIl[1]];
            nArray3[L.lIIIlllIIl[0]] = lIIIlllIIl[11];
            if (L.llllIIIlIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                lllIIIlIIlI = new d(lIIIlllIIl[11], lIIIlllIIl[60], lIIIlllIIl[6]);
                bv.add((d)lllIIIlIIlI);
                0;
            }
            int[] nArray4 = new int[lIIIlllIIl[1]];
            nArray4[L.lIIIlllIIl[0]] = lIIIlllIIl[13];
            if (L.llllIIIlIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                lllIIIlIIlI = new d(lIIIlllIIl[13], lIIIlllIIl[61], lIIIlllIIl[6]);
                bv.add((d)lllIIIlIIlI);
                0;
            }
            int[] nArray5 = new int[lIIIlllIIl[1]];
            nArray5[L.lIIIlllIIl[0]] = lIIIlllIIl[14];
            if (L.llllIIIlIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                lllIIIlIIlI = new d(lIIIlllIIl[14], lIIIlllIIl[5], lIIIlllIIl[6]);
                bv.add((d)lllIIIlIIlI);
                0;
            }
            int[] nArray6 = new int[lIIIlllIIl[1]];
            nArray6[L.lIIIlllIIl[0]] = lIIIlllIIl[46];
            if (L.llllIIIlIIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                lllIIIlIIlI = new d(lIIIlllIIl[46], lIIIlllIIl[1], e.c(lIIIlllIIl[62], lIIIlllIIl[63]));
                bv.add((d)lllIIIlIIlI);
                0;
            }
        }
        if (L.llllIIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[8])) {
            int[] nArray = new int[lIIIlllIIl[1]];
            nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[24];
            if (L.llllIIIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[lIIIlllIIl[1]];
                nArray7[L.lIIIlllIIl[0]] = lIIIlllIIl[24];
                if (L.llllIIIlIIIl(Bank.getFirst((int[])nArray7).getQuantity(), lIIIlllIIl[61])) {
                    int[] nArray8 = new int[lIIIlllIIl[1]];
                    nArray8[L.lIIIlllIIl[0]] = lIIIlllIIl[24];
                    lllIIIlIIlI = new d(lIIIlllIIl[24], lIIIlllIIl[61] - Bank.getFirst((int[])nArray8).getQuantity(), lIIIlllIIl[64]);
                    bv.add((d)lllIIIlIIlI);
                    0;
                }
            }
            int[] nArray9 = new int[lIIIlllIIl[1]];
            nArray9[L.lIIIlllIIl[0]] = lIIIlllIIl[24];
            if (L.llllIIIlIIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                lllIIIlIIlI = new d(lIIIlllIIl[24], lIIIlllIIl[61], lIIIlllIIl[64]);
                bv.add((d)lllIIIlIIlI);
                0;
            }
            int[] nArray10 = new int[lIIIlllIIl[1]];
            nArray10[L.lIIIlllIIl[0]] = lIIIlllIIl[25];
            if (L.llllIIIlIIII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[lIIIlllIIl[1]];
                nArray11[L.lIIIlllIIl[0]] = lIIIlllIIl[25];
                if (L.llllIIIlIIIl(Bank.getFirst((int[])nArray11).getQuantity(), lIIIlllIIl[61])) {
                    int[] nArray12 = new int[lIIIlllIIl[1]];
                    nArray12[L.lIIIlllIIl[0]] = lIIIlllIIl[25];
                    lllIIIlIIlI = new d(lIIIlllIIl[25], lIIIlllIIl[61] - Bank.getFirst((int[])nArray12).getQuantity(), lIIIlllIIl[65]);
                    bv.add((d)lllIIIlIIlI);
                    0;
                }
            }
            int[] nArray13 = new int[lIIIlllIIl[1]];
            nArray13[L.lIIIlllIIl[0]] = lIIIlllIIl[25];
            if (L.llllIIIlIIlI(Bank.contains((int[])nArray13) ? 1 : 0)) {
                lllIIIlIIlI = new d(lIIIlllIIl[25], lIIIlllIIl[61], lIIIlllIIl[65]);
                bv.add((d)lllIIIlIIlI);
                0;
            }
            int[] nArray14 = new int[lIIIlllIIl[1]];
            nArray14[L.lIIIlllIIl[0]] = lIIIlllIIl[22];
            if (L.llllIIIlIIlI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[lIIIlllIIl[1]];
                nArray15[L.lIIIlllIIl[0]] = lIIIlllIIl[22];
                if (L.llllIIIlIIlI(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    lllIIIlIIlI = new d(lIIIlllIIl[22], lIIIlllIIl[1], lIIIlllIIl[66]);
                    bv.add((d)lllIIIlIIlI);
                    0;
                }
            }
            if (L.llllIIIlIIII(bu ? 1 : 0)) {
                int[] nArray16 = new int[lIIIlllIIl[1]];
                nArray16[L.lIIIlllIIl[0]] = lIIIlllIIl[16];
                if (L.llllIIIlIIII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIIlllIIl[1]];
                    nArray17[L.lIIIlllIIl[0]] = lIIIlllIIl[16];
                    if (L.llllIIIlIIIl(Bank.getFirst((int[])nArray17).getQuantity(), lIIIlllIIl[61])) {
                        int[] nArray18 = new int[lIIIlllIIl[1]];
                        nArray18[L.lIIIlllIIl[0]] = lIIIlllIIl[16];
                        lllIIIlIIlI = new d(lIIIlllIIl[16], lIIIlllIIl[61] - Bank.getFirst((int[])nArray18).getQuantity(), lIIIlllIIl[58]);
                        bv.add((d)lllIIIlIIlI);
                        0;
                    }
                }
                int[] nArray19 = new int[lIIIlllIIl[1]];
                nArray19[L.lIIIlllIIl[0]] = lIIIlllIIl[16];
                if (L.llllIIIlIIlI(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    lllIIIlIIlI = new d(lIIIlllIIl[16], lIIIlllIIl[61], lIIIlllIIl[58]);
                    bv.add((d)lllIIIlIIlI);
                    0;
                }
                int[] nArray20 = new int[lIIIlllIIl[1]];
                nArray20[L.lIIIlllIIl[0]] = lIIIlllIIl[23];
                if (L.llllIIIlIIII(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[lIIIlllIIl[1]];
                    nArray21[L.lIIIlllIIl[0]] = lIIIlllIIl[23];
                    if (L.llllIIIlIIIl(Bank.getFirst((int[])nArray21).getQuantity(), lIIIlllIIl[66])) {
                        int[] nArray22 = new int[lIIIlllIIl[1]];
                        nArray22[L.lIIIlllIIl[0]] = lIIIlllIIl[23];
                        lllIIIlIIlI = new d(lIIIlllIIl[23], lIIIlllIIl[66] - Bank.getFirst((int[])nArray22).getQuantity(), lIIIlllIIl[6]);
                        bv.add((d)lllIIIlIIlI);
                        0;
                    }
                }
                int[] nArray23 = new int[lIIIlllIIl[1]];
                nArray23[L.lIIIlllIIl[0]] = lIIIlllIIl[23];
                if (L.llllIIIlIIlI(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    lllIIIlIIlI = new d(lIIIlllIIl[23], lIIIlllIIl[66], lIIIlllIIl[6]);
                    bv.add((d)lllIIIlIIlI);
                    0;
                }
            }
        }
        int[] nArray = new int[lIIIlllIIl[1]];
        nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[20];
        if (L.llllIIIlIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            lllIIIlIIlI = new d(lIIIlllIIl[20], lIIIlllIIl[67], lIIIlllIIl[68]);
            bv.add((d)lllIIIlIIlI);
            0;
        }
        if (L.llllIIIlIIlI(Bank.contains(lllIIIlIIlI = item -> item.getName().toLowerCase().contains(lIIIllIlll[lIIIlllIIl[74]])) ? 1 : 0)) {
            lllIIIlIIIl = new d(lIIIlllIIl[69], lIIIlllIIl[19], lIIIlllIIl[70]);
            bv.add(lllIIIlIIIl);
            0;
        }
        int[] nArray24 = new int[lIIIlllIIl[1]];
        nArray24[L.lIIIlllIIl[0]] = lIIIlllIIl[71];
        if (L.llllIIIlIIlI(Bank.contains((int[])nArray24) ? 1 : 0)) {
            lllIIIlIIIl = new d(lIIIlllIIl[71], lIIIlllIIl[33], lIIIlllIIl[72]);
            bv.add(lllIIIlIIIl);
            0;
        }
        int[] nArray25 = new int[lIIIlllIIl[1]];
        nArray25[L.lIIIlllIIl[0]] = lIIIlllIIl[18];
        if (L.llllIIIlIIlI(Bank.contains((int[])nArray25) ? 1 : 0)) {
            lllIIIlIIIl = new d(lIIIlllIIl[18], lIIIlllIIl[33], lIIIlllIIl[72]);
            bv.add(lllIIIlIIIl);
            0;
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (L.llllIIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[2])) {
            bl = lIIIlllIIl[1];
            0;
            if (2 <= 0) {
                return false;
            }
        } else {
            bl = lIIIlllIIl[0];
        }
        return bl;
    }

    private static void aa() {
        if (L.llllIIIllIIl(L.llllIIIllIII(e.u(), 30.0))) {
            int[] nArray = new int[lIIIlllIIl[1]];
            nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[20];
            if (L.llllIIIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIIlllIIl[1]];
                nArray2[L.lIIIlllIIl[0]] = lIIIlllIIl[20];
                Inventory.getFirst((int[])nArray2).interact(lIIIllIlll[lIIIlllIIl[43]]);
                Time.sleepTicks((int)lIIIlllIIl[1]);
                0;
            }
        }
        if (L.llllIIIlIlll(Players.getLocal().getInteracting())) {
            NPC lllIIIlIllI = NPCs.getNearest(nPC -> {
                int n2;
                if (L.llllIIIlIIII(nPC.getName().contains(lIIIllIlll[lIIIlllIIl[75]]) ? 1 : 0) && L.llllIIIlIIlI(nPC.isDead() ? 1 : 0)) {
                    n2 = lIIIlllIIl[1];
                    0;
                    if (((0xA ^ 0x5A) & ~(0x5C ^ 0xC)) > 0) {
                        return false;
                    }
                } else {
                    n2 = lIIIlllIIl[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[lIIIlllIIl[3]];
            stringArray[L.lIIIlllIIl[0]] = lIIIllIlll[lIIIlllIIl[44]];
            stringArray[L.lIIIlllIIl[1]] = lIIIllIlll[lIIIlllIIl[45]];
            List lllIIIlIlIl = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (L.llllIIIllIlI(nPC.getInteracting(), Players.getLocal())) {
                    bl = lIIIlllIIl[1];
                    0;
                    if (3 <= ((0x6C ^ 0x57) & ~(0xA3 ^ 0x98))) {
                        return false;
                    }
                } else {
                    bl = lIIIlllIIl[0];
                }
                return bl;
            }).collect(Collectors.toList());
            int[] nArray = new int[lIIIlllIIl[1]];
            nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[46];
            if (L.llllIIIlIIII(Equipment.contains((int[])nArray) ? 1 : 0) && L.llllIIIlIIlI(L.ad() ? 1 : 0)) {
                L.ae();
            }
            if (L.llllIIIlIIll(lllIIIlIllI) && L.llllIIIlIIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                lllIIIlIllI.interact(lIIIllIlll[lIIIlllIIl[47]]);
                Time.sleepTicks((int)lIIIlllIIl[4]);
                0;
            }
        }
    }

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
                                                    if (!L.llllIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[21])) break block19;
                                                    int[] nArray = new int[lIIIlllIIl[1]];
                                                    nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[9];
                                                    if (!L.llllIIIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIIIlllIIl[1]];
                                                    nArray2[L.lIIIlllIIl[0]] = lIIIlllIIl[13];
                                                    if (!L.llllIIIlIIII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIIIlllIIl[1]];
                                                    nArray3[L.lIIIlllIIl[0]] = lIIIlllIIl[11];
                                                    if (!L.llllIIIlIIII(Inventory.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIIIlllIIl[1]];
                                                    nArray4[L.lIIIlllIIl[0]] = lIIIlllIIl[14];
                                                    if (!L.llllIIIlIIII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIIIlllIIl[1]];
                                                    nArray5[L.lIIIlllIIl[0]] = lIIIlllIIl[20];
                                                    if (!L.llllIIIlIIII(Inventory.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIIIlllIIl[1]];
                                                    nArray6[L.lIIIlllIIl[0]] = lIIIlllIIl[46];
                                                    if (!L.llllIIIlIIlI(Inventory.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIIIlllIIl[1]];
                                                    nArray7[L.lIIIlllIIl[0]] = lIIIlllIIl[46];
                                                    if (!L.llllIIIlIIII(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIIIlllIIl[1];
                                                0;
                                                if (null == null) return n5 != 0;
                                                return false;
                                            }
                                            n5 = lIIIlllIIl[0];
                                            return n5 != 0;
                                        }
                                        if (!L.llllIIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[21]) || !L.llllIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[8])) break block22;
                                        int[] nArray = new int[lIIIlllIIl[1]];
                                        nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[13];
                                        if (!L.llllIIIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIIIlllIIl[1]];
                                        nArray8[L.lIIIlllIIl[0]] = lIIIlllIIl[11];
                                        if (!L.llllIIIlIIII(Inventory.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIIIlllIIl[1]];
                                        nArray9[L.lIIIlllIIl[0]] = lIIIlllIIl[14];
                                        if (!L.llllIIIlIIII(Inventory.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIIIlllIIl[1]];
                                        nArray10[L.lIIIlllIIl[0]] = lIIIlllIIl[16];
                                        if (!L.llllIIIlIIII(Inventory.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIIIlllIIl[1]];
                                        nArray11[L.lIIIlllIIl[0]] = lIIIlllIIl[46];
                                        if (!L.llllIIIlIIlI(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIIIlllIIl[1]];
                                        nArray12[L.lIIIlllIIl[0]] = lIIIlllIIl[46];
                                        if (!L.llllIIIlIIII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIIIlllIIl[1];
                                    0;
                                    if (null == null) return n4 != 0;
                                    return ((82 + 100 - 58 + 36 ^ 108 + 37 - 87 + 111) & (0x49 ^ 0x78 ^ (0xBB ^ 0x83) ^ -1)) != 0;
                                }
                                n4 = lIIIlllIIl[0];
                                return n4 != 0;
                            }
                            if (!L.llllIIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[8]) || !L.llllIIIlIIlI(bu ? 1 : 0)) break block25;
                            int[] nArray = new int[lIIIlllIIl[1]];
                            nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[22];
                            if (!L.llllIIIlIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIIIlllIIl[1]];
                            nArray13[L.lIIIlllIIl[0]] = lIIIlllIIl[22];
                            if (!L.llllIIIlIIII(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIIIlllIIl[1]];
                        nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[24];
                        if (L.llllIIIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIIIlllIIl[1]];
                            nArray14[L.lIIIlllIIl[0]] = lIIIlllIIl[38];
                            if (L.llllIIIlIIII(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIIIlllIIl[1];
                                0;
                                if (-3 < 0) return n3 != 0;
                                return ((0x94 ^ 0xB7 ^ (0x37 ^ 0x20)) & (43 + 92 - 101 + 97 ^ 175 + 122 - 189 + 75 ^ -1)) != 0;
                            }
                        }
                    }
                    n3 = lIIIlllIIl[0];
                    return n3 != 0;
                }
                if (!L.llllIIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[8]) || !L.llllIIIlIIII(bu ? 1 : 0)) return lIIIlllIIl[0];
                int[] nArray = new int[lIIIlllIIl[1]];
                nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[22];
                if (!L.llllIIIlIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIIIlllIIl[1]];
                nArray15[L.lIIIlllIIl[0]] = lIIIlllIIl[22];
                if (!L.llllIIIlIIII(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIIIlllIIl[1]];
            nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[16];
            if (L.llllIIIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIIIlllIIl[1]];
                nArray16[L.lIIIlllIIl[0]] = lIIIlllIIl[23];
                if (L.llllIIIlIIII(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIIlllIIl[1]];
                    nArray17[L.lIIIlllIIl[0]] = lIIIlllIIl[23];
                    if (L.llllIIIlIlIl(Inventory.getFirst((int[])nArray17).getQuantity(), lIIIlllIIl[19])) {
                        int[] nArray18 = new int[lIIIlllIIl[1]];
                        nArray18[L.lIIIlllIIl[0]] = lIIIlllIIl[24];
                        if (L.llllIIIlIIII(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIIIlllIIl[1]];
                            nArray19[L.lIIIlllIIl[0]] = lIIIlllIIl[38];
                            if (L.llllIIIlIIII(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIIIlllIIl[1];
                                0;
                                if (3 != -1) return n2 != 0;
                                return false;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIIlllIIl[0];
        return n2 != 0;
    }

    private static boolean llllIIIllIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llllIIIlIlII(int n2) {
        return n2 > 0;
    }

    private static boolean llllIIIlIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllIIIlIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llllIIIlIIII(int n2) {
        return n2 != 0;
    }

    public static void Y() {
        if (L.llllIIIlIIII(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIIllIlll[lIIIlllIIl[0]];
            b.a(bv);
            if (L.llllIIIlIIIl(bv.size(), lIIIlllIIl[1])) {
                System.out.println(lIIIllIlll[lIIIlllIIl[1]]);
                bt = lIIIlllIIl[0];
            }
        }
        if (L.llllIIIlIIlI(bt ? 1 : 0) && L.llllIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[2])) {
            BankLocation lllIIIllIll;
            if (L.llllIIIlIIlI(L.ab() ? 1 : 0)) {
                lllIIIllIll = BankLocation.getNearest();
                if (L.llllIIIlIIll(lllIIIllIll) && L.llllIIIlIIlI(lllIIIllIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIllIlll[lIIIlllIIl[3]];
                    a.a(lllIIIllIll);
                }
                if (L.llllIIIlIIll(lllIIIllIll) && L.llllIIIlIIII(lllIIIllIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIllIlll[lIIIlllIIl[4]];
                    if (L.llllIIIlIIlI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllIIl[5]);
                        0;
                        Time.sleepTicks((int)lIIIlllIIl[6]);
                        0;
                    }
                    if (L.llllIIIlIIII(Bank.isOpen() ? 1 : 0)) {
                        if (L.llllIIIlIlII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIlllIIl[7]);
                            0;
                        }
                        while (L.llllIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[8]) && L.llllIIIlIIlI(v.aX() ? 1 : 0)) {
                            v.aV();
                            Time.sleepTicks((int)lIIIlllIIl[1]);
                            0;
                            0;
                            
                            return;
                        }
                        if (L.llllIIIlIIlI(L.ac() ? 1 : 0)) {
                            L.af();
                            System.out.println(lIIIllIlll[lIIIlllIIl[7]]);
                            bt = lIIIlllIIl[1];
                            return;
                        }
                        if (L.llllIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[8])) {
                            int[] nArray = new int[lIIIlllIIl[1]];
                            nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[9];
                            if (L.llllIIIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIIIlllIIl[1]];
                                nArray2[L.lIIIlllIIl[0]] = lIIIlllIIl[9];
                                if (L.llllIIIlIIIl(Inventory.getCount((int[])nArray2), lIIIlllIIl[1])) {
                                    Bank.withdraw((int)lIIIlllIIl[9], (int)lIIIlllIIl[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIlllIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIlllIIl[1]];
                                        nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[9];
                                        if (L.llllIIIlIlII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIlllIIl[1];
                                            0;
                                            if (-2 >= 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIIIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIIlllIIl[5]);
                                    0;
                                }
                            }
                            int[] nArray3 = new int[lIIIlllIIl[1]];
                            nArray3[L.lIIIlllIIl[0]] = lIIIlllIIl[11];
                            if (L.llllIIIlIIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIIIlllIIl[1]];
                                nArray4[L.lIIIlllIIl[0]] = lIIIlllIIl[11];
                                if (L.llllIIIlIIIl(Inventory.getCount((int[])nArray4), lIIIlllIIl[1])) {
                                    Bank.withdraw((int)lIIIlllIIl[11], (int)lIIIlllIIl[12], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIlllIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIlllIIl[1]];
                                        nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[11];
                                        if (L.llllIIIlIlII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIlllIIl[1];
                                            0;
                                            if (-1 > 0) {
                                                return ((0xC0 ^ 0xB1 ^ (0xF1 ^ 0x87)) & (136 + 186 - 190 + 63 ^ 72 + 134 - 17 + 7 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIIlllIIl[5]);
                                    0;
                                }
                            }
                            int[] nArray5 = new int[lIIIlllIIl[1]];
                            nArray5[L.lIIIlllIIl[0]] = lIIIlllIIl[13];
                            if (L.llllIIIlIIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIIIlllIIl[1]];
                                nArray6[L.lIIIlllIIl[0]] = lIIIlllIIl[13];
                                if (L.llllIIIlIIIl(Inventory.getCount((int[])nArray6), lIIIlllIIl[1])) {
                                    Bank.withdraw((int)lIIIlllIIl[13], (int)lIIIlllIIl[12], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIlllIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIlllIIl[1]];
                                        nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[13];
                                        if (L.llllIIIlIlII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIlllIIl[1];
                                            0;
                                            if (1 < 0) {
                                                return ((0xBF ^ 0x90 ^ (0x75 ^ 0x6A)) & (73 + 66 - 28 + 46 ^ 9 + 50 - 5 + 119 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIIlllIIl[5]);
                                    0;
                                }
                            }
                            int[] nArray7 = new int[lIIIlllIIl[1]];
                            nArray7[L.lIIIlllIIl[0]] = lIIIlllIIl[14];
                            if (L.llllIIIlIIII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIIIlllIIl[1]];
                                nArray8[L.lIIIlllIIl[0]] = lIIIlllIIl[14];
                                if (L.llllIIIlIIIl(Inventory.getCount((int[])nArray8), lIIIlllIIl[1])) {
                                    Bank.withdraw((int)lIIIlllIIl[14], (int)lIIIlllIIl[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIlllIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIlllIIl[1]];
                                        nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[14];
                                        if (L.llllIIIlIlII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIlllIIl[1];
                                            0;
                                            if (3 == 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIIIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIIlllIIl[5]);
                                    0;
                                }
                            }
                            int[] nArray9 = new int[lIIIlllIIl[1]];
                            nArray9[L.lIIIlllIIl[0]] = lIIIlllIIl[16];
                            if (L.llllIIIlIIII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIIIlllIIl[1]];
                                nArray10[L.lIIIlllIIl[0]] = lIIIlllIIl[16];
                                if (L.llllIIIlIIIl(Inventory.getCount((int[])nArray10), lIIIlllIIl[1])) {
                                    Bank.withdraw((int)lIIIlllIIl[16], (int)lIIIlllIIl[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIlllIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIlllIIl[1]];
                                        nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[16];
                                        if (L.llllIIIlIlII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIlllIIl[1];
                                            0;
                                            if (2 >= 3) {
                                                return ((0x32 ^ 0x7F ^ (0x31 ^ 0x3A)) & (0xF7 ^ 0x96 ^ (0xE7 ^ 0xC0) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIIlllIIl[5]);
                                    0;
                                }
                            }
                            int[] nArray11 = new int[lIIIlllIIl[1]];
                            nArray11[L.lIIIlllIIl[0]] = lIIIlllIIl[17];
                            if (L.llllIIIlIIII(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[lIIIlllIIl[1]];
                                nArray12[L.lIIIlllIIl[0]] = lIIIlllIIl[17];
                                if (L.llllIIIlIIlI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    Bank.withdraw((int)lIIIlllIIl[17], (int)lIIIlllIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIlllIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[lIIIlllIIl[1]];
                                        nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[17];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)lIIIlllIIl[5]);
                                    0;
                                }
                            }
                            Bank.withdraw((int)lIIIlllIIl[18], (int)lIIIlllIIl[19], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            int[] nArray13 = new int[lIIIlllIIl[1]];
                            nArray13[L.lIIIlllIIl[0]] = lIIIlllIIl[20];
                            if (L.llllIIIlIIII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                int[] nArray14 = new int[lIIIlllIIl[1]];
                                nArray14[L.lIIIlllIIl[0]] = lIIIlllIIl[20];
                                if (L.llllIIIlIIIl(Inventory.getCount((int[])nArray14), lIIIlllIIl[1]) && L.llllIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[21])) {
                                    Bank.withdrawAll((int)lIIIlllIIl[20], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIlllIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIlllIIl[1]];
                                        nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[20];
                                        if (L.llllIIIlIlII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIlllIIl[1];
                                            0;
                                            
                                            }
                                        } else {
                                            bl = lIIIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIIlllIIl[5]);
                                    0;
                                }
                            }
                        }
                        if (L.llllIIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[8])) {
                            int[] nArray = new int[lIIIlllIIl[1]];
                            nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[22];
                            if (L.llllIIIlIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)lIIIlllIIl[22], (int)lIIIlllIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIIlllIIl[1]);
                                0;
                            }
                            if (L.llllIIIlIIII(bu ? 1 : 0)) {
                                Bank.withdrawAll((int)lIIIlllIIl[23], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIIlllIIl[1]);
                                0;
                                Bank.withdrawAll((int)lIIIlllIIl[16], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIIlllIIl[1]);
                                0;
                            }
                            Time.sleepTicks((int)lIIIlllIIl[4]);
                            0;
                            Bank.withdrawAll((int)lIIIlllIIl[24], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIIIlllIIl[1]);
                            0;
                            Bank.withdrawAll((int)lIIIlllIIl[25], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)lIIIlllIIl[1]);
                            0;
                        }
                    }
                }
            }
            if (L.llllIIIlIIII(L.ab() ? 1 : 0)) {
                if (L.llllIIIlIIII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (L.llllIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[21])) {
                    if (L.llllIIIlIIlI(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIIllIlll[lIIIlllIIl[19]];
                        Movement.walkTo((WorldPoint)bx);
                        0;
                        Time.sleepTicks((int)lIIIlllIIl[1]);
                        0;
                    }
                    if (L.llllIIIlIIII(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIIllIlll[lIIIlllIIl[6]];
                        L.aa();
                    }
                }
                if (L.llllIIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[21]) && L.llllIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[26])) {
                    AccBuilderRogues.c = lIIIllIlll[lIIIlllIIl[27]];
                    if (L.llllIIIlIllI(Players.getLocal().getAnimation(), lIIIlllIIl[28])) {
                        Magic.cast((Spell)SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks((int)lIIIlllIIl[1]);
                        0;
                    }
                }
                if (L.llllIIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[26]) && L.llllIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[29])) {
                    AccBuilderRogues.c = lIIIllIlll[lIIIlllIIl[30]];
                    if (L.llllIIIlIllI(Players.getLocal().getAnimation(), lIIIlllIIl[28])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)lIIIlllIIl[1]);
                        0;
                    }
                }
                if (L.llllIIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[29]) && L.llllIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[31])) {
                    AccBuilderRogues.c = lIIIllIlll[lIIIlllIIl[32]];
                    if (L.llllIIIlIllI(Players.getLocal().getAnimation(), lIIIlllIIl[28])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)lIIIlllIIl[1]);
                        0;
                    }
                }
                if (L.llllIIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[31]) && L.llllIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[8])) {
                    AccBuilderRogues.c = lIIIllIlll[lIIIlllIIl[33]];
                    if (L.llllIIIlIllI(Players.getLocal().getAnimation(), lIIIlllIIl[28])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)lIIIlllIIl[1]);
                        0;
                    }
                }
                if (L.llllIIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[8])) {
                    int lllIIIllIIl;
                    AccBuilderRogues.c = lIIIllIlll[lIIIlllIIl[34]];
                    if (L.llllIIIlIlll(by)) {
                        by = new WorldPoint(lIIIlllIIl[35] + e.c(lIIIlllIIl[1], lIIIlllIIl[7]), lIIIlllIIl[36], lIIIlllIIl[0]);
                    }
                    int[] nArray = new int[lIIIlllIIl[1]];
                    nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[22];
                    if (L.llllIIIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray15 = new int[lIIIlllIIl[1]];
                        nArray15[L.lIIIlllIIl[0]] = lIIIlllIIl[22];
                        if (L.llllIIIlIIlI(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[lIIIlllIIl[1]];
                            nArray16[L.lIIIlllIIl[0]] = lIIIlllIIl[22];
                            Inventory.getFirst((int[])nArray16).interact(lIIIllIlll[lIIIlllIIl[37]]);
                            Time.sleepTicks((int)lIIIlllIIl[1]);
                            0;
                        }
                    }
                    if (L.llllIIIlIIII(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[lIIIlllIIl[1]];
                    nArray17[L.lIIIlllIIl[0]] = lIIIlllIIl[24];
                    lllIIIllIll = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[lIIIlllIIl[1]];
                    nArray18[L.lIIIlllIIl[0]] = lIIIlllIIl[38];
                    Item lllIIIllIlI = Inventory.getFirst((int[])nArray18);
                    if (L.llllIIIlIIlI(bu ? 1 : 0) && L.llllIIIlIIll(by)) {
                        if (L.llllIIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)by) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIIllIlll[lIIIlllIIl[39]];
                            Movement.walkTo((WorldPoint)by);
                            0;
                            Time.sleepTicks((int)lIIIlllIIl[1]);
                            0;
                        }
                        if (L.llllIIIlIIII(Players.getLocal().getWorldLocation().equals((Object)by) ? 1 : 0) && L.llllIIIlIIll(lllIIIllIll) && L.llllIIIlIIll(lllIIIllIlI) && L.llllIIIlIllI(Players.getLocal().getAnimation(), lIIIlllIIl[28])) {
                            lllIIIllIIl = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)lllIIIllIlI);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (L.llllIIIllIll(Skills.getExperience((Skill)Skill.MAGIC), lllIIIllIIl)) {
                                    bl = lIIIlllIIl[1];
                                    0;
                                    if (-3 >= 0) {
                                        return false;
                                    }
                                } else {
                                    bl = lIIIlllIIl[0];
                                }
                                return bl;
                            }, (int)lIIIlllIIl[10]);
                            0;
                        }
                    }
                    if (L.llllIIIlIIII(bu ? 1 : 0)) {
                        if (L.llllIIIlIIll(lllIIIllIll) && L.llllIIIlIIll(lllIIIllIlI) && L.llllIIIlIllI(Players.getLocal().getAnimation(), lIIIlllIIl[28])) {
                            lllIIIllIIl = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)lllIIIllIlI);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (L.llllIIIllIll(Skills.getExperience((Skill)Skill.MAGIC), lllIIIllIIl)) {
                                    bl = lIIIlllIIl[1];
                                    0;
                                    if (3 < 0) {
                                        return ((0xD ^ 0x41 ^ (0x3E ^ 0x30)) & (0xE8 ^ 0x90 ^ (0x75 ^ 0x4F) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIIlllIIl[0];
                                }
                                return bl;
                            }, (int)lIIIlllIIl[10]);
                            0;
                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (L.llllIIIlIllI(Players.getLocal().getAnimation(), lIIIlllIIl[28])) {
                                bl = lIIIlllIIl[1];
                                0;
                                if (-(0x4D ^ 0x49) >= 0) {
                                    return false;
                                }
                            } else {
                                bl = lIIIlllIIl[0];
                            }
                            return bl;
                        }, (int)lIIIlllIIl[40]);
                        0;
                    }
                }
            }
        }
    }

    public static void Z() {
        if (L.llllIIIlIIII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (L.llllIIIlIIlI(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIIllIlll[lIIIlllIIl[41]];
            Movement.walkTo((WorldPoint)bx);
            0;
            Time.sleepTicks((int)lIIIlllIIl[1]);
            0;
        }
        if (L.llllIIIlIIII(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIIllIlll[lIIIlllIIl[42]];
            L.aa();
        }
    }

    @Override
    public int T() {
        try {
            L.Y();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 <= 0) {
            return (0 ^ 0x10) & ~(0x77 ^ 0x67);
        }
        return lIIIlllIIl[67];
    }

    private static boolean llllIIIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    public static void ae() {
        if (L.llllIIIlIIll(Widgets.get((int)lIIIlllIIl[49], (int)lIIIlllIIl[50]))) {
            AccBuilderRogues.c = lIIIllIlll[lIIIlllIIl[51]];
            Widgets.get((int)lIIIlllIIl[49], (int)lIIIlllIIl[50]).interact(lIIIllIlll[lIIIlllIIl[52]]);
            Time.sleepTicks((int)lIIIlllIIl[7]);
            0;
        }
        if (L.llllIIIlIlll(Widgets.get((int)lIIIlllIIl[49], (int)lIIIlllIIl[50])) && L.llllIIIlIIlI(Widgets.get((int)lIIIlllIIl[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)lIIIlllIIl[1]);
            0;
            if (L.llllIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[19])) {
                Widgets.get((int)lIIIlllIIl[53], (int)lIIIlllIIl[1]).getChild(lIIIlllIIl[1]).interact(lIIIllIlll[lIIIlllIIl[54]]);
            }
            if (L.llllIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[32]) && L.llllIIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[19])) {
                Widgets.get((int)lIIIlllIIl[53], (int)lIIIlllIIl[1]).getChild(lIIIlllIIl[3]).interact(lIIIllIlll[lIIIlllIIl[55]]);
            }
            if (L.llllIIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[32]) && L.llllIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[39])) {
                Widgets.get((int)lIIIlllIIl[53], (int)lIIIlllIIl[1]).getChild(lIIIlllIIl[4]).interact(lIIIllIlll[lIIIlllIIl[56]]);
            }
            if (L.llllIIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[32])) {
                int[] nArray = new int[lIIIlllIIl[1]];
                nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[14];
                if (L.llllIIIlIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIIIlllIIl[53], (int)lIIIlllIIl[1]).getChild(lIIIlllIIl[4]).interact(lIIIllIlll[lIIIlllIIl[21]]);
                }
            }
            if (L.llllIIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIl[39])) {
                int[] nArray = new int[lIIIlllIIl[1]];
                nArray[L.lIIIlllIIl[0]] = lIIIlllIIl[14];
                if (L.llllIIIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIIIlllIIl[53], (int)lIIIlllIIl[1]).getChild(lIIIlllIIl[7]).interact(lIIIllIlll[lIIIlllIIl[50]]);
                }
            }
            Time.sleepTicks((int)lIIIlllIIl[1]);
            0;
        }
    }

    private static int llllIIIllIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llllIIIlIlll(Object object) {
        return object == null;
    }
}

