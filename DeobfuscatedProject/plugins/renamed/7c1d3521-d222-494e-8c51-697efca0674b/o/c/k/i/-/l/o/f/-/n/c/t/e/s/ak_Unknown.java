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
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.I_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e_Unknown;

public class ak_Unknown
implements ac {
    static /* synthetic */ WorldPoint ck;
    static /* synthetic */ WorldPoint cl;
    private static /* synthetic */ int[] llIlllIIll;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ String[] llIlllIIlI;
    public static /* synthetic */ boolean ci;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ WorldArea cj;

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

    private static void lIlllIIllIIIl() {
        llIlllIIll = new int[81];
        ak.llIlllIIll[0] = (146 + 4 - 146 + 147 ^ 23 + 109 - -21 + 35) & (0x23 ^ 0x52 ^ (0xD6 ^ 0x8C) ^ -1);
        ak.llIlllIIll[1] = 1;
        ak.llIlllIIll[2] = 0x5B ^ 0x69;
        ak.llIlllIIll[3] = 2;
        ak.llIlllIIll[4] = 3;
        ak.llIlllIIll[5] = 0xFFFFDF8E & 0x33F9;
        ak.llIlllIIll[6] = 0x65 ^ 0x5B ^ (3 ^ 0x3B);
        ak.llIlllIIll[7] = 0x15 ^ 0x11;
        ak.llIlllIIll[8] = 0xF1 ^ 0xC6;
        ak.llIlllIIll[9] = 0xFFFFE3AF & 0x1E7E;
        ak.llIlllIIll[10] = -(0xFFFFFB4B & 0x6EB7) & (0xFFFFFFDE & 0x6FFF);
        ak.llIlllIIll[11] = -(0xFFFFFF95 & 0x117F) & (0xFFFFD3FF & 0x3F3F);
        ak.llIlllIIll[12] = -(0xFFFFDBE9 & 0x763F) & (0xFFFFFBFF & 0x5FEC);
        ak.llIlllIIll[13] = -(0xFFFFADD7 & 0x7A7B) & (0xFFFFEF7F & 0x3AFF);
        ak.llIlllIIll[14] = -(0xFFFFE99F & 0x5F72) & (0xFFFFFBFF & 0x4F3B);
        ak.llIlllIIll[15] = 0xFFFFF3B5 & 0x1DDE;
        ak.llIlllIIll[16] = 0xFFFFC23F & 0x3FF3;
        ak.llIlllIIll[17] = 0xFFFFBD7D & 0x73D3;
        ak.llIlllIIll[18] = 0xFFFFBFCD & 0x5F7B;
        ak.llIlllIIll[19] = 0xCD ^ 0x92 ^ (0x44 ^ 0x1E);
        ak.llIlllIIll[20] = 0xFFFFEDFB & 0x137F;
        ak.llIlllIIll[21] = 0xEF ^ 0xB1 ^ (0x1D ^ 0x5A);
        ak.llIlllIIll[22] = -(0xFFFFFBF5 & 0x4E1B) & (0xFFFFFFFB & 0x4F7F);
        ak.llIlllIIll[23] = -(0xFFFFDE3E & 0x7DD3) & (0xFFFFDF3D & 0x7EFF);
        ak.llIlllIIll[24] = 0xFFFF97BF & 0x6A71;
        ak.llIlllIIll[25] = 0x2D ^ 0x29 ^ (0x9D ^ 0xA7);
        ak.llIlllIIll[26] = 22 + 77 - -39 + 5 ^ 0 + 141 - 43 + 46;
        ak.llIlllIIll[27] = 122 + 13 - 62 + 77 ^ 56 + 44 - -22 + 23;
        ak.llIlllIIll[28] = -1;
        ak.llIlllIIll[29] = 0x7F ^ 0x5A;
        ak.llIlllIIll[30] = 0x75 ^ 0x7D;
        ak.llIlllIIll[31] = 0x93 ^ 0xBE;
        ak.llIlllIIll[32] = 0x61 ^ 0x68;
        ak.llIlllIIll[33] = 0x3B ^ 0x31 ^ (0x81 ^ 0xAD) & ~(0x21 ^ 0xD);
        ak.llIlllIIll[34] = 56 + 31 - 76 + 140 ^ 101 + 63 - 17 + 9;
        ak.llIlllIIll[35] = 0xFFFFBEDE & 0x4D7B;
        ak.llIlllIIll[36] = -(0xFFFFF96D & 0x76F3) & (0xFFFFFDFF & Short.MAX_VALUE);
        ak.llIlllIIll[37] = 0x15 ^ 0x33 ^ (0x57 ^ 0x7D);
        ak.llIlllIIll[38] = 0x13 ^ 0x2C;
        ak.llIlllIIll[39] = 0xCF ^ 0xC2;
        ak.llIlllIIll[40] = -(0xFFFFF36A & 0x1CD7) & (0xFFFFDFED & 0x3DFF);
        ak.llIlllIIll[41] = 0x45 ^ 0x4B;
        ak.llIlllIIll[42] = 138 + 85 - 96 + 26 ^ 93 + 4 - 83 + 136;
        ak.llIlllIIll[43] = 0x9F ^ 0xA2 ^ (0x28 ^ 5);
        ak.llIlllIIll[44] = 0x95 ^ 0x84;
        ak.llIlllIIll[45] = 0x52 ^ 0x40;
        ak.llIlllIIll[46] = 0xFFFFD577 & 0x2FED;
        ak.llIlllIIll[47] = 0x30 ^ 0x23;
        ak.llIlllIIll[48] = 0xFFFFDBBF & 0x2554;
        ak.llIlllIIll[49] = -(0xFFFFF9AD & 0x4FDF) & (0xFFFFCFDF & 0x7BFD);
        ak.llIlllIIll[50] = 73 + 62 - 74 + 79 ^ 15 + 49 - 17 + 103;
        ak.llIlllIIll[51] = 0xA1 ^ 0xB5;
        ak.llIlllIIll[52] = 0xD3 ^ 0xC6;
        ak.llIlllIIll[53] = 154 + 189 - 142 + 0;
        ak.llIlllIIll[54] = 0x63 ^ 0x18 ^ (0x72 ^ 0x1F);
        ak.llIlllIIll[55] = 0xAD ^ 0xBA;
        ak.llIlllIIll[56] = 0x4D ^ 0x55;
        ak.llIlllIIll[57] = 0xFFFFB3EB & 0x4FFC;
        ak.llIlllIIll[58] = 49 + 122 - 105 + 104;
        ak.llIlllIIll[59] = -(0xFFFFB3FF & 0x5C5D) & (0xFFFFFFFE & 0x1FFD);
        ak.llIlllIIll[60] = 0xFFFF97F4 & 0x6FDB;
        ak.llIlllIIll[61] = 0xFFFFBFBE & 0x4BF9;
        ak.llIlllIIll[62] = -(0xFFFFFD36 & 0x4FED) & (0xFFFFFDFF & 0x7FF7);
        ak.llIlllIIll[63] = 0xFFFFBD9C & 0x7EEF;
        ak.llIlllIIll[64] = 1 ^ 0x16 ^ (0xE2 ^ 0x8D);
        ak.llIlllIIll[65] = 68 + 109 - 67 + 40;
        ak.llIlllIIll[66] = 0xFFFFFEDA & 0x3BBD;
        ak.llIlllIIll[67] = 15 + 118 - -40 + 48 ^ 163 + 67 - 150 + 105;
        ak.llIlllIIll[68] = 0xFFFFF3F3 & 0xD4C;
        ak.llIlllIIll[69] = -(0xFFFF8336 & 0x7DDD) & (0xFFFFFFDF & 0x2FFF);
        ak.llIlllIIll[70] = 0xFFFFE9A8 & 0x77FF;
        ak.llIlllIIll[71] = -(0x39 ^ 8) & (0xFFFFDFFF & 0x3F77);
        ak.llIlllIIll[72] = 0xFFFFA7C4 & 0x5BBF;
        ak.llIlllIIll[73] = 0xA9 ^ 0xB2;
        ak.llIlllIIll[74] = 106 + 56 - 104 + 104 ^ 111 + 83 - 79 + 75;
        ak.llIlllIIll[75] = 0xF0 ^ 0xA5 ^ (0x3A ^ 0x72);
        ak.llIlllIIll[76] = 0xFFFF8FCF & 0x7BFE;
        ak.llIlllIIll[77] = -(0xFFFFF7CB & 0x4A3D) & (0xFFFFEFEF & 0x5EFB);
        ak.llIlllIIll[78] = 0xFFFF9BF7 & 0x6FDF;
        ak.llIlllIIll[79] = -(0xFFFFF33F & 0x5FD3) & (0xFFFFFFFF & 0x5FFB);
        ak.llIlllIIll[80] = 0xDE ^ 0xC0;
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
                                                0;
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
                                    0;
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
                                0;
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
                                0;
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

    public static void ak() {
        if (ak.lIlllIIllIIlI(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIlllIIlI[llIlllIIll[0]];
            b.a(bv);
            if (ak.lIlllIIllIIll(bv.size(), llIlllIIll[1])) {
                System.out.println(llIlllIIlI[llIlllIIll[1]]);
                bt = llIlllIIll[0];
            }
        }
        if (ak.lIlllIIllIlII(bt ? 1 : 0) && ak.lIlllIIllIIll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[2])) {
            BankLocation var18;
            if (ak.lIlllIIllIlII(ak.an() ? 1 : 0)) {
                var18 = BankLocation.getNearest();
                if (ak.lIlllIIllIlIl(var18) && ak.lIlllIIllIlII(var18.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlllIIlI[llIlllIIll[3]];
                    a.a(var18);
                }
                if (ak.lIlllIIllIlIl(var18) && ak.lIlllIIllIIlI(var18.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlllIIlI[llIlllIIll[4]];
                    if (ak.lIlllIIllIlII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIlllIIll[5]);
                        0;
                        Time.sleepTicks((int)llIlllIIll[6]);
                        0;
                    }
                    if (ak.lIlllIIllIIlI(Bank.isOpen() ? 1 : 0)) {
                        if (ak.lIlllIIllIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llIlllIIll[7]);
                            0;
                        }
                        while (ak.lIlllIIllIIll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[8]) && ak.lIlllIIllIlII(I.co() ? 1 : 0)) {
                            I.cm();
                            Time.sleepTicks((int)llIlllIIll[1]);
                            0;
                            0;
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
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIlllIIll[1]];
                                        nArray[ak.llIlllIIll[0]] = llIlllIIll[9];
                                        if (ak.lIlllIIllIllI(Inventory.getCount((int[])nArray))) {
                                            bl = llIlllIIll[1];
                                            0;
                                            if (-2 > 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = llIlllIIll[0];
                                        }
                                        return bl;
                                    }, (int)llIlllIIll[5]);
                                    0;
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
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIlllIIll[1]];
                                        nArray[ak.llIlllIIll[0]] = llIlllIIll[11];
                                        if (ak.lIlllIIllIllI(Inventory.getCount((int[])nArray))) {
                                            bl = llIlllIIll[1];
                                            0;
                                            if (1 > 2) {
                                                return ((5 ^ 0x75 ^ (0x7D ^ 0x21)) & (0x5E ^ 0x55 ^ (0x3A ^ 0x1D) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = llIlllIIll[0];
                                        }
                                        return bl;
                                    }, (int)llIlllIIll[5]);
                                    0;
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
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIlllIIll[1]];
                                        nArray[ak.llIlllIIll[0]] = llIlllIIll[13];
                                        if (ak.lIlllIIllIllI(Inventory.getCount((int[])nArray))) {
                                            bl = llIlllIIll[1];
                                            0;
                                            
                                            }
                                        } else {
                                            bl = llIlllIIll[0];
                                        }
                                        return bl;
                                    }, (int)llIlllIIll[5]);
                                    0;
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
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIlllIIll[1]];
                                        nArray[ak.llIlllIIll[0]] = llIlllIIll[14];
                                        if (ak.lIlllIIllIllI(Inventory.getCount((int[])nArray))) {
                                            bl = llIlllIIll[1];
                                            0;
                                            if ((90 + 139 - 198 + 131 ^ 32 + 81 - 0 + 54) <= 0) {
                                                return ((99 + 11 - 43 + 116 ^ 164 + 14 - 55 + 48) & (0xFD ^ 0xC5 ^ (0x4A ^ 0x6E) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = llIlllIIll[0];
                                        }
                                        return bl;
                                    }, (int)llIlllIIll[5]);
                                    0;
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
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIlllIIll[1]];
                                        nArray[ak.llIlllIIll[0]] = llIlllIIll[16];
                                        if (ak.lIlllIIllIllI(Inventory.getCount((int[])nArray))) {
                                            bl = llIlllIIll[1];
                                            0;
                                            if (((0x13 ^ 0x72 ^ (0x6E ^ 0x51)) & (3 ^ (0x98 ^ 0xC5) ^ -1)) != 0) {
                                                return ((0xB0 ^ 0x99 ^ (0x35 ^ 0x5F)) & (53 + 133 - 67 + 15 ^ 162 + 22 - 99 + 112 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = llIlllIIll[0];
                                        }
                                        return bl;
                                    }, (int)llIlllIIll[5]);
                                    0;
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
                                    0;
                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[llIlllIIll[1]];
                                        nArray[ak.llIlllIIll[0]] = llIlllIIll[17];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)llIlllIIll[5]);
                                    0;
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
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIlllIIll[1]];
                                        nArray[ak.llIlllIIll[0]] = llIlllIIll[20];
                                        if (ak.lIlllIIllIllI(Inventory.getCount((int[])nArray))) {
                                            bl = llIlllIIll[1];
                                            0;
                                            if (((0x76 ^ 0x70) & ~(0x59 ^ 0x5F)) != 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = llIlllIIll[0];
                                        }
                                        return bl;
                                    }, (int)llIlllIIll[5]);
                                    0;
                                }
                            }
                        }
                        if (ak.lIlllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[8])) {
                            int[] nArray = new int[llIlllIIll[1]];
                            nArray[ak.llIlllIIll[0]] = llIlllIIll[22];
                            if (ak.lIlllIIllIlII(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)llIlllIIll[22], (int)llIlllIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)llIlllIIll[1]);
                                0;
                            }
                            if (ak.lIlllIIllIIlI(ci ? 1 : 0)) {
                                Bank.withdrawAll((int)llIlllIIll[23], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)llIlllIIll[1]);
                                0;
                                Bank.withdrawAll((int)llIlllIIll[16], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)llIlllIIll[1]);
                                0;
                            }
                            Time.sleepTicks((int)llIlllIIll[4]);
                            0;
                            Bank.withdrawAll((int)llIlllIIll[24], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)llIlllIIll[1]);
                            0;
                            Bank.withdrawAll((int)llIlllIIll[25], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)llIlllIIll[1]);
                            0;
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
                        0;
                        Time.sleepTicks((int)llIlllIIll[1]);
                        0;
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
                        0;
                    }
                }
                if (ak.lIlllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[26]) && ak.lIlllIIllIIll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[29])) {
                    AccBuilderSotf.c = llIlllIIlI[llIlllIIll[30]];
                    if (ak.lIlllIIlllIII(Players.getLocal().getAnimation(), llIlllIIll[28])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)llIlllIIll[1]);
                        0;
                    }
                }
                if (ak.lIlllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[29]) && ak.lIlllIIllIIll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[31])) {
                    AccBuilderSotf.c = llIlllIIlI[llIlllIIll[32]];
                    if (ak.lIlllIIlllIII(Players.getLocal().getAnimation(), llIlllIIll[28])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)llIlllIIll[1]);
                        0;
                    }
                }
                if (ak.lIlllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[31]) && ak.lIlllIIllIIll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[8])) {
                    AccBuilderSotf.c = llIlllIIlI[llIlllIIll[33]];
                    if (ak.lIlllIIlllIII(Players.getLocal().getAnimation(), llIlllIIll[28])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)llIlllIIll[1]);
                        0;
                    }
                }
                if (ak.lIlllIIllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[8])) {
                    int var9;
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
                            0;
                        }
                    }
                    if (ak.lIlllIIllIIlI(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[llIlllIIll[1]];
                    nArray17[ak.llIlllIIll[0]] = llIlllIIll[24];
                    var18 = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[llIlllIIll[1]];
                    nArray18[ak.llIlllIIll[0]] = llIlllIIll[38];
                    Item var4 = Inventory.getFirst((int[])nArray18);
                    if (ak.lIlllIIllIlII(ci ? 1 : 0) && ak.lIlllIIllIlIl(cl)) {
                        if (ak.lIlllIIllIlII(Players.getLocal().getWorldLocation().equals((Object)cl) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlllIIlI[llIlllIIll[39]];
                            Movement.walkTo((WorldPoint)cl);
                            0;
                            Time.sleepTicks((int)llIlllIIll[1]);
                            0;
                        }
                        if (ak.lIlllIIllIIlI(Players.getLocal().getWorldLocation().equals((Object)cl) ? 1 : 0) && ak.lIlllIIllIlIl(var18) && ak.lIlllIIllIlIl(var4) && ak.lIlllIIlllIII(Players.getLocal().getAnimation(), llIlllIIll[28])) {
                            var9 = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)var4);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (ak.lIlllIIllllIl(Skills.getExperience((Skill)Skill.MAGIC), var9)) {
                                    bl = llIlllIIll[1];
                                    0;
                                    if (1 < 0) {
                                        return false;
                                    }
                                } else {
                                    bl = llIlllIIll[0];
                                }
                                return bl;
                            }, (int)llIlllIIll[10]);
                            0;
                        }
                    }
                    if (ak.lIlllIIllIIlI(ci ? 1 : 0)) {
                        if (ak.lIlllIIllIlIl(var18) && ak.lIlllIIllIlIl(var4) && ak.lIlllIIlllIII(Players.getLocal().getAnimation(), llIlllIIll[28])) {
                            var9 = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)var4);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (ak.lIlllIIllllIl(Skills.getExperience((Skill)Skill.MAGIC), var9)) {
                                    bl = llIlllIIll[1];
                                    0;
                                    if ((0xA6 ^ 0xA2) == 0) {
                                        return false;
                                    }
                                } else {
                                    bl = llIlllIIll[0];
                                }
                                return bl;
                            }, (int)llIlllIIll[10]);
                            0;
                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (ak.lIlllIIlllIII(Players.getLocal().getAnimation(), llIlllIIll[28])) {
                                bl = llIlllIIll[1];
                                0;
                                if ((0xA2 ^ 0xA6) < 0) {
                                    return false;
                                }
                            } else {
                                bl = llIlllIIll[0];
                            }
                            return bl;
                        }, (int)llIlllIIll[40]);
                        0;
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
        d var11;
        Object var16;
        if (ak.lIlllIIllIIll(Skills.getLevel((Skill)Skill.MAGIC), llIlllIIll[8])) {
            int[] nArray = new int[llIlllIIll[1]];
            nArray[ak.llIlllIIll[0]] = llIlllIIll[16];
            if (ak.lIlllIIllIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new d(llIlllIIll[16], llIlllIIll[57], llIlllIIll[58]);
                bv.add(d2);
                0;
            }
            int[] nArray2 = new int[llIlllIIll[1]];
            nArray2[ak.llIlllIIll[0]] = llIlllIIll[9];
            if (ak.lIlllIIllIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                var16 = new d(llIlllIIll[9], llIlllIIll[59], llIlllIIll[6]);
                bv.add((d)var16);
                0;
            }
            int[] nArray3 = new int[llIlllIIll[1]];
            nArray3[ak.llIlllIIll[0]] = llIlllIIll[11];
            if (ak.lIlllIIllIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                var16 = new d(llIlllIIll[11], llIlllIIll[60], llIlllIIll[6]);
                bv.add((d)var16);
                0;
            }
            int[] nArray4 = new int[llIlllIIll[1]];
            nArray4[ak.llIlllIIll[0]] = llIlllIIll[13];
            if (ak.lIlllIIllIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                var16 = new d(llIlllIIll[13], llIlllIIll[61], llIlllIIll[6]);
                bv.add((d)var16);
                0;
            }
            int[] nArray5 = new int[llIlllIIll[1]];
            nArray5[ak.llIlllIIll[0]] = llIlllIIll[14];
            if (ak.lIlllIIllIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                var16 = new d(llIlllIIll[14], llIlllIIll[5], llIlllIIll[6]);
                bv.add((d)var16);
                0;
            }
            int[] nArray6 = new int[llIlllIIll[1]];
            nArray6[ak.llIlllIIll[0]] = llIlllIIll[46];
            if (ak.lIlllIIllIlII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                var16 = new d(llIlllIIll[46], llIlllIIll[1], e.c(llIlllIIll[62], llIlllIIll[63]));
                bv.add((d)var16);
                0;
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
                    var16 = new d(llIlllIIll[24], llIlllIIll[61] - Bank.getFirst((int[])nArray8).getQuantity(), llIlllIIll[64]);
                    bv.add((d)var16);
                    0;
                }
            }
            int[] nArray9 = new int[llIlllIIll[1]];
            nArray9[ak.llIlllIIll[0]] = llIlllIIll[24];
            if (ak.lIlllIIllIlII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                var16 = new d(llIlllIIll[24], llIlllIIll[61], llIlllIIll[64]);
                bv.add((d)var16);
                0;
            }
            int[] nArray10 = new int[llIlllIIll[1]];
            nArray10[ak.llIlllIIll[0]] = llIlllIIll[25];
            if (ak.lIlllIIllIIlI(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[llIlllIIll[1]];
                nArray11[ak.llIlllIIll[0]] = llIlllIIll[25];
                if (ak.lIlllIIllIIll(Bank.getFirst((int[])nArray11).getQuantity(), llIlllIIll[61])) {
                    int[] nArray12 = new int[llIlllIIll[1]];
                    nArray12[ak.llIlllIIll[0]] = llIlllIIll[25];
                    var16 = new d(llIlllIIll[25], llIlllIIll[61] - Bank.getFirst((int[])nArray12).getQuantity(), llIlllIIll[65]);
                    bv.add((d)var16);
                    0;
                }
            }
            int[] nArray13 = new int[llIlllIIll[1]];
            nArray13[ak.llIlllIIll[0]] = llIlllIIll[25];
            if (ak.lIlllIIllIlII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                var16 = new d(llIlllIIll[25], llIlllIIll[61], llIlllIIll[65]);
                bv.add((d)var16);
                0;
            }
            int[] nArray14 = new int[llIlllIIll[1]];
            nArray14[ak.llIlllIIll[0]] = llIlllIIll[22];
            if (ak.lIlllIIllIlII(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[llIlllIIll[1]];
                nArray15[ak.llIlllIIll[0]] = llIlllIIll[22];
                if (ak.lIlllIIllIlII(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    var16 = new d(llIlllIIll[22], llIlllIIll[1], llIlllIIll[66]);
                    bv.add((d)var16);
                    0;
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
                        var16 = new d(llIlllIIll[16], llIlllIIll[61] - Bank.getFirst((int[])nArray18).getQuantity(), llIlllIIll[58]);
                        bv.add((d)var16);
                        0;
                    }
                }
                int[] nArray19 = new int[llIlllIIll[1]];
                nArray19[ak.llIlllIIll[0]] = llIlllIIll[16];
                if (ak.lIlllIIllIlII(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    var16 = new d(llIlllIIll[16], llIlllIIll[61], llIlllIIll[58]);
                    bv.add((d)var16);
                    0;
                }
                int[] nArray20 = new int[llIlllIIll[1]];
                nArray20[ak.llIlllIIll[0]] = llIlllIIll[23];
                if (ak.lIlllIIllIIlI(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[llIlllIIll[1]];
                    nArray21[ak.llIlllIIll[0]] = llIlllIIll[23];
                    if (ak.lIlllIIllIIll(Bank.getFirst((int[])nArray21).getQuantity(), llIlllIIll[66])) {
                        int[] nArray22 = new int[llIlllIIll[1]];
                        nArray22[ak.llIlllIIll[0]] = llIlllIIll[23];
                        var16 = new d(llIlllIIll[23], llIlllIIll[66] - Bank.getFirst((int[])nArray22).getQuantity(), llIlllIIll[6]);
                        bv.add((d)var16);
                        0;
                    }
                }
                int[] nArray23 = new int[llIlllIIll[1]];
                nArray23[ak.llIlllIIll[0]] = llIlllIIll[23];
                if (ak.lIlllIIllIlII(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    var16 = new d(llIlllIIll[23], llIlllIIll[66], llIlllIIll[6]);
                    bv.add((d)var16);
                    0;
                }
            }
        }
        int[] nArray = new int[llIlllIIll[1]];
        nArray[ak.llIlllIIll[0]] = llIlllIIll[20];
        if (ak.lIlllIIllIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
            var16 = new d(llIlllIIll[20], llIlllIIll[67], llIlllIIll[68]);
            bv.add((d)var16);
            0;
        }
        if (ak.lIlllIIllIlII(Bank.contains(var16 = item -> item.getName().toLowerCase().contains(llIlllIIlI[llIlllIIll[74]])) ? 1 : 0)) {
            var11 = new d(llIlllIIll[69], llIlllIIll[19], llIlllIIll[70]);
            bv.add(var11);
            0;
        }
        int[] nArray24 = new int[llIlllIIll[1]];
        nArray24[ak.llIlllIIll[0]] = llIlllIIll[71];
        if (ak.lIlllIIllIlII(Bank.contains((int[])nArray24) ? 1 : 0)) {
            var11 = new d(llIlllIIll[71], llIlllIIll[33], llIlllIIll[72]);
            bv.add(var11);
            0;
        }
        int[] nArray25 = new int[llIlllIIll[1]];
        nArray25[ak.llIlllIIll[0]] = llIlllIIll[18];
        if (ak.lIlllIIllIlII(Bank.contains((int[])nArray25) ? 1 : 0)) {
            var11 = new d(llIlllIIll[18], llIlllIIll[33], llIlllIIll[72]);
            bv.add(var11);
            0;
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
                                                0;
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
                                    0;
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
                                0;
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
                                0;
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
        ak.llIlllIIlI[ak.llIlllIIll[0]] = ak."Buying items";
        ak.llIlllIIlI[ak.llIlllIIll[1]] = ak."Finished buying items, switching back to magic training";
        ak.llIlllIIlI[ak.llIlllIIll[3]] = ak."Navigating to bank";
        ak.llIlllIIlI[ak.llIlllIIll[4]] = ak."Handling banking";
        ak.llIlllIIlI[ak.llIlllIIll[7]] = ak."We are missing supplies, switching to BUYING";
        ak.llIlllIIlI[ak.llIlllIIll[19]] = ak."Nav to cows";
        ak.llIlllIIlI[ak.llIlllIIll[6]] = ak."Attacking cows";
        ak.llIlllIIlI[ak.llIlllIIll[27]] = ak."Casting varrock tele";
        ak.llIlllIIlI[ak.llIlllIIll[30]] = ak."Casting lumby tele";
        ak.llIlllIIlI[ak.llIlllIIll[32]] = ak."Casting fally tele";
        ak.llIlllIIlI[ak.llIlllIIll[33]] = ak."Casting cammy tele";
        ak.llIlllIIlI[ak.llIlllIIll[34]] = ak."Alching";
        ak.llIlllIIlI[ak.llIlllIIll[37]] = ak."Wield";
        ak.llIlllIIlI[ak.llIlllIIll[39]] = ak."Move to alch spot";
        ak.llIlllIIlI[ak.llIlllIIll[41]] = ak."Nav to cows";
        ak.llIlllIIlI[ak.llIlllIIll[42]] = ak."Attacking cows";
        ak.llIlllIIlI[ak.llIlllIIll[43]] = ak."Eat";
        ak.llIlllIIlI[ak.llIlllIIll[44]] = ak."Cow";
        ak.llIlllIIlI[ak.llIlllIIll[45]] = ak."cow";
        ak.llIlllIIlI[ak.llIlllIIll[47]] = ak."Attack";
        ak.llIlllIIlI[ak.llIlllIIll[51]] = ak."Opening autocast";
        ak.llIlllIIlI[ak.llIlllIIll[52]] = ak."Choose spell";
        ak.llIlllIIlI[ak.llIlllIIll[54]] = ak."Wind Strike";
        ak.llIlllIIlI[ak.llIlllIIll[55]] = ak."Water Strike";
        ak.llIlllIIlI[ak.llIlllIIll[56]] = ak."Earth Strike";
        ak.llIlllIIlI[ak.llIlllIIll[21]] = ak."Earth Strike";
        ak.llIlllIIlI[ak.llIlllIIll[50]] = ak."Fire Strike";
        ak.llIlllIIlI[ak.llIlllIIll[73]] = ak."Magic training";
        ak.llIlllIIlI[ak.llIlllIIll[74]] = ak."ring of wealth (";
        ak.llIlllIIlI[ak.llIlllIIll[75]] = ak."Cow";
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
                0;
            }
        }
        if (ak.lIlllIIlllIIl(Players.getLocal().getInteracting())) {
            NPC var15 = NPCs.getNearest(nPC -> {
                int n2;
                if (ak.lIlllIIllIIlI(nPC.getName().contains(llIlllIIlI[llIlllIIll[75]]) ? 1 : 0) && ak.lIlllIIllIlII(nPC.isDead() ? 1 : 0)) {
                    n2 = llIlllIIll[1];
                    0;
                    
                    }
                } else {
                    n2 = llIlllIIll[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[llIlllIIll[3]];
            stringArray[ak.llIlllIIll[0]] = llIlllIIlI[llIlllIIll[44]];
            stringArray[ak.llIlllIIll[1]] = llIlllIIlI[llIlllIIll[45]];
            List llllllllllllllllllIIIIIlllIllIlI = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (ak.lIlllIIllllII(nPC.getInteracting(), Players.getLocal())) {
                    bl = llIlllIIll[1];
                    0;
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
            if (ak.lIlllIIllIlIl(var15) && ak.lIlllIIllIlII(Players.getLocal().isMoving() ? 1 : 0)) {
                var15.interact(llIlllIIlI[llIlllIIll[47]]);
                Time.sleepTicks((int)llIlllIIll[4]);
                0;
            }
        }
    }

    private static String lIlllIIlIIlIl(String var17, String var21) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var25 = Cipher.getInstance("Blowfish");
            var25.init(llIlllIIll[3], var7);
            return new String(var25.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static String lIlllIIlIIIll(String var5, String var13) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), llIlllIIll[30]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(llIlllIIll[3], var22);
            return new String(var2.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
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
            0;
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
            ak.ak();
            0;
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
            0;
            Time.sleepTicks((int)llIlllIIll[1]);
            0;
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
            0;
        }
        if (ak.lIlllIIlllIIl(Widgets.get((int)llIlllIIll[49], (int)llIlllIIll[50])) && ak.lIlllIIllIlII(Widgets.get((int)llIlllIIll[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)llIlllIIll[1]);
            0;
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
            0;
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

    private static String lIlllIIlIIlII(String var14, String var23) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var8 = var23.toCharArray();
        int var3 = llIlllIIll[0];
        char[] var10 = var14.toCharArray();
        int var1 = var10.length;
        int var20 = llIlllIIll[0];
        while (ak.lIlllIIllIIll(var20, var1)) {
            char var24 = var10[var20];
            var12.append((char)(var24 ^ var8[var3 % var8.length]));
            0;
            ++var3;
            ++var20;
            0;
            if (((0x84 ^ 0x8C) & ~(0x63 ^ 0x6B)) == 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    private static boolean lIlllIIllIlIl(Object object) {
        return object != null;
    }
}

