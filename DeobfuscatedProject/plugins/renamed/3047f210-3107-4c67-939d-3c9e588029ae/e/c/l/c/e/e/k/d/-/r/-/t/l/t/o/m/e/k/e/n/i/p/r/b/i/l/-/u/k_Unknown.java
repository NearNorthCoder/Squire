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
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.t_Unknown;
import gg.squire.account.AccBuilderTempleTrek;
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

public class k_Unknown
implements S {
    static /* synthetic */ WorldArea bv;
    private static /* synthetic */ String[] llllIlllIl;
    public static /* synthetic */ boolean bs;
    static /* synthetic */ WorldPoint bw;
    private static /* synthetic */ int[] llllIllllI;
    public static /* synthetic */ List<d> bu;
    static /* synthetic */ WorldPoint bx;
    public static /* synthetic */ boolean bt;

    public static boolean ac() {
        if (k.llIlIIIlIllll(Vars.getBit((int)llllIllllI[48]), llllIllllI[1]) && k.llIlIIIlIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[17])) {
            return llllIllllI[1];
        }
        if (k.llIlIIIlIllll(Vars.getBit((int)llllIllllI[48]), llllIllllI[2]) && k.llIlIIIlIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[31]) && k.llIlIIIlIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[17])) {
            return llllIllllI[1];
        }
        if (k.llIlIIIlIllll(Vars.getBit((int)llllIllllI[48]), llllIllllI[3]) && k.llIlIIIlIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[31]) && k.llIlIIIlIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[36])) {
            return llllIllllI[1];
        }
        if (k.llIlIIIlIllll(Vars.getBit((int)llllIllllI[48]), llllIllllI[3]) && k.llIlIIIlIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[31])) {
            int[] nArray = new int[llllIllllI[1]];
            nArray[k.llllIllllI[0]] = llllIllllI[12];
            if (k.llIlIIIlIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return llllIllllI[1];
            }
        }
        if (k.llIlIIIlIllll(Vars.getBit((int)llllIllllI[48]), llllIllllI[5]) && k.llIlIIIlIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[36])) {
            int[] nArray = new int[llllIllllI[1]];
            nArray[k.llllIllllI[0]] = llllIllllI[12];
            if (k.llIlIIIlIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return llllIllllI[1];
            }
        }
        return llllIllllI[0];
    }

    private static boolean llIlIIIlIlIll(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIIIllIIlI(Object object) {
        return object == null;
    }

    private static boolean llIlIIIlIlIIl(int n2) {
        return n2 != 0;
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
                                                    if (!k.llIlIIIlIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[19])) break block19;
                                                    int[] nArray = new int[llllIllllI[1]];
                                                    nArray[k.llllIllllI[0]] = llllIllllI[7];
                                                    if (!k.llIlIIIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[llllIllllI[1]];
                                                    nArray2[k.llllIllllI[0]] = llllIllllI[11];
                                                    if (!k.llIlIIIlIlIIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[llllIllllI[1]];
                                                    nArray3[k.llllIllllI[0]] = llllIllllI[9];
                                                    if (!k.llIlIIIlIlIIl(Bank.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[llllIllllI[1]];
                                                    nArray4[k.llllIllllI[0]] = llllIllllI[12];
                                                    if (!k.llIlIIIlIlIIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[llllIllllI[1]];
                                                    nArray5[k.llllIllllI[0]] = llllIllllI[18];
                                                    if (!k.llIlIIIlIlIIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[llllIllllI[1]];
                                                    nArray6[k.llllIllllI[0]] = llllIllllI[44];
                                                    if (!k.llIlIIIlIlIll(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[llllIllllI[1]];
                                                    nArray7[k.llllIllllI[0]] = llllIllllI[44];
                                                    if (!k.llIlIIIlIlIIl(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = llllIllllI[1];
                                                0;
                                                if (-1 <= 0) return n5 != 0;
                                                return false;
                                            }
                                            n5 = llllIllllI[0];
                                            return n5 != 0;
                                        }
                                        if (!k.llIlIIIlIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[19]) || !k.llIlIIIlIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[6])) break block22;
                                        int[] nArray = new int[llllIllllI[1]];
                                        nArray[k.llllIllllI[0]] = llllIllllI[11];
                                        if (!k.llIlIIIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[llllIllllI[1]];
                                        nArray8[k.llllIllllI[0]] = llllIllllI[9];
                                        if (!k.llIlIIIlIlIIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[llllIllllI[1]];
                                        nArray9[k.llllIllllI[0]] = llllIllllI[12];
                                        if (!k.llIlIIIlIlIIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[llllIllllI[1]];
                                        nArray10[k.llllIllllI[0]] = llllIllllI[14];
                                        if (!k.llIlIIIlIlIIl(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[llllIllllI[1]];
                                        nArray11[k.llllIllllI[0]] = llllIllllI[44];
                                        if (!k.llIlIIIlIlIll(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[llllIllllI[1]];
                                        nArray12[k.llllIllllI[0]] = llllIllllI[44];
                                        if (!k.llIlIIIlIlIIl(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = llllIllllI[1];
                                    0;
                                    if (((0xDE ^ 0xC6) & ~(0x6D ^ 0x75)) == 0) return n4 != 0;
                                    return false;
                                }
                                n4 = llllIllllI[0];
                                return n4 != 0;
                            }
                            if (!k.llIlIIIlIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[6]) || !k.llIlIIIlIlIll(bt ? 1 : 0)) break block25;
                            int[] nArray = new int[llllIllllI[1]];
                            nArray[k.llllIllllI[0]] = llllIllllI[20];
                            if (!k.llIlIIIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[llllIllllI[1]];
                            nArray13[k.llllIllllI[0]] = llllIllllI[20];
                            if (!k.llIlIIIlIlIIl(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[llllIllllI[1]];
                        nArray[k.llllIllllI[0]] = llllIllllI[22];
                        if (k.llIlIIIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[llllIllllI[1]];
                            nArray14[k.llllIllllI[0]] = llllIllllI[23];
                            if (k.llIlIIIlIlIIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = llllIllllI[1];
                                0;
                                if (1 > -1) return n3 != 0;
                                return ((201 + 36 - 173 + 173 ^ 115 + 1 - -22 + 58) & (0x9E ^ 0x9A ^ (0x29 ^ 4) ^ -1)) != 0;
                            }
                        }
                    }
                    n3 = llllIllllI[0];
                    return n3 != 0;
                }
                if (!k.llIlIIIlIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[6]) || !k.llIlIIIlIlIIl(bt ? 1 : 0)) return llllIllllI[0];
                int[] nArray = new int[llllIllllI[1]];
                nArray[k.llllIllllI[0]] = llllIllllI[20];
                if (!k.llIlIIIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[llllIllllI[1]];
                nArray15[k.llllIllllI[0]] = llllIllllI[20];
                if (!k.llIlIIIlIlIIl(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[llllIllllI[1]];
            nArray[k.llllIllllI[0]] = llllIllllI[14];
            if (k.llIlIIIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[llllIllllI[1]];
                nArray16[k.llllIllllI[0]] = llllIllllI[21];
                if (k.llIlIIIlIlIIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[llllIllllI[1]];
                    nArray17[k.llllIllllI[0]] = llllIllllI[21];
                    if (k.llIlIIIlIlllI(Bank.getFirst((int[])nArray17).getQuantity(), llllIllllI[17])) {
                        int[] nArray18 = new int[llllIllllI[1]];
                        nArray18[k.llllIllllI[0]] = llllIllllI[22];
                        if (k.llIlIIIlIlIIl(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[llllIllllI[1]];
                            nArray19[k.llllIllllI[0]] = llllIllllI[23];
                            if (k.llIlIIIlIlIIl(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = llllIllllI[1];
                                0;
                                if ((0x8B ^ 0x8F) >= (0xBE ^ 0xBA)) return n2 != 0;
                                return false;
                            }
                        }
                    }
                }
            }
        }
        n2 = llllIllllI[0];
        return n2 != 0;
    }

    @Override
    public boolean S() {
        return llllIllllI[0];
    }

    private static void llIlIIIlIlIII() {
        llllIllllI = new int[82];
        k.llllIllllI[0] = (0x3C ^ 0x30) & ~(0x2B ^ 0x27);
        k.llllIllllI[1] = 1;
        k.llllIllllI[2] = 2;
        k.llllIllllI[3] = 3;
        k.llllIllllI[4] = 0xFFFFFFA9 & 0x13DE;
        k.llllIllllI[5] = 0x13 ^ 0x50 ^ (0x51 ^ 0x16);
        k.llllIllllI[6] = 0x98 ^ 0xAF;
        k.llllIllllI[7] = -(0xFFFFAF07 & 0x71FA) & (0xFFFFFBFF & 0x272F);
        k.llllIllllI[8] = -(0xFFFFBDE7 & 0x7A3B) & (0xFFFFFDFF & 0x3FFE);
        k.llllIllllI[9] = 0xFFFFBBBF & 0x466B;
        k.llllIllllI[10] = 0xFFFFABED & 0x5DD6;
        k.llllIllllI[11] = -(0xFFFFDDDB & 0x6F75) & (0xFFFFFFFD & 0x4F7F);
        k.llllIllllI[12] = -(0xFFFFC7D6 & 0x3CBF) & (0xFFFFC6BF & 0x3FFF);
        k.llllIllllI[13] = -(0xFFFFFEFE & 0x276B) & (0xFFFFB7FF & 0x7FFD);
        k.llllIllllI[14] = 0xFFFFEEB7 & 0x137B;
        k.llllIllllI[15] = 0xFFFFFD75 & 0x33DB;
        k.llllIllllI[16] = -(0xFFFFA6E7 & 0x79BB) & (0xFFFFFFFF & 0x3FEB);
        k.llllIllllI[17] = 0x99 ^ 0x9C;
        k.llllIllllI[18] = -(0xFFFF9FEF & 0x7A95) & (0xFFFF9FFF & 0x7BFF);
        k.llllIllllI[19] = 0x55 ^ 0x4C;
        k.llllIllllI[20] = -(0xFFFFDF4F & 0x70B1) & (0xFFFFFDFF & 0x576B);
        k.llllIllllI[21] = -(0xFFFF8B73 & 0x7D8F) & (0xFFFFBBEE & 0x4F3F);
        k.llllIllllI[22] = -(0xFFFF94B7 & 0x6FCD) & (0xFFFFAFF5 & 0x56BF);
        k.llllIllllI[23] = 0xFE ^ 0xC0;
        k.llllIllllI[24] = 0x46 ^ 0x40;
        k.llllIllllI[25] = 0xB2 ^ 0xAD;
        k.llllIllllI[26] = 0x87 ^ 0xB6 ^ (0xA2 ^ 0x94);
        k.llllIllllI[27] = -1;
        k.llllIllllI[28] = 0xE5 ^ 0xC0;
        k.llllIllllI[29] = 0xBB ^ 0xC6 ^ (0x79 ^ 0xC);
        k.llllIllllI[30] = 0x39 ^ 0x14;
        k.llllIllllI[31] = 0x47 ^ 0x4E;
        k.llllIllllI[32] = 0x43 ^ 0x49;
        k.llllIllllI[33] = 0x66 ^ 0x6D;
        k.llllIllllI[34] = 0x8B ^ 0x87;
        k.llllIllllI[35] = 0x77 ^ 0x48;
        k.llllIllllI[36] = 0x71 ^ 0x7C;
        k.llllIllllI[37] = 0xFFFFEBF6 & 0x1549;
        k.llllIllllI[38] = -(0xFFFFEBFF & 0x7DE6) & (0xFFFFFBFF & 0x6FF7);
        k.llllIllllI[39] = 0xFFFFBFBF & 0x4DEC;
        k.llllIllllI[40] = 0x4A ^ 0x44;
        k.llllIllllI[41] = 0x60 ^ 0x2A ^ (0xC6 ^ 0x83);
        k.llllIllllI[42] = 0x2F ^ 0x3F;
        k.llllIllllI[43] = 87 + 16 - 47 + 125 ^ 156 + 41 - 195 + 162;
        k.llllIllllI[44] = -(0xFFFFE9F5 & 0x569B) & (0xFFFFDDFF & 0x67F5);
        k.llllIllllI[45] = 33 + 84 - 38 + 87 ^ 152 + 95 - 199 + 132;
        k.llllIllllI[46] = 26 + 100 - 110 + 126 ^ 79 + 151 - 145 + 72;
        k.llllIllllI[47] = 195 + 206 - 386 + 193 ^ 117 + 169 - 161 + 71;
        k.llllIllllI[48] = -(0xFFFFEEF9 & 0x55EF) & (0xFFFFCFFC & 0x75FF);
        k.llllIllllI[49] = 0xFFFFE3DF & 0x1E71;
        k.llllIllllI[50] = 0x12 ^ 8;
        k.llllIllllI[51] = 0x75 ^ 0x6F ^ (0x5A ^ 0x55);
        k.llllIllllI[52] = 126 + 121 - 160 + 69 ^ 47 + 125 - 119 + 85;
        k.llllIllllI[53] = 78 + 160 - 98 + 61;
        k.llllIllllI[54] = 0xA8 ^ 0xBF;
        k.llllIllllI[55] = 130 + 106 - 135 + 31 ^ 133 + 11 - 58 + 70;
        k.llllIllllI[56] = 0xBE ^ 0xA5;
        k.llllIllllI[57] = 0xFFFFBBE9 & 0x47FE;
        k.llllIllllI[58] = 64 + 33 - -28 + 6 + (0x32 ^ 0x2E) - (0xE8 ^ 0xAF) + (0x22 ^ 0x70);
        k.llllIllllI[59] = 0xFFFF8FEB & 0x7FB4;
        k.llllIllllI[60] = 0xFFFF8FD1 & 0x77FE;
        k.llllIllllI[61] = -(0xFFFFFDE6 & 0x765D) & (0xFFFFFFFB & Short.MAX_VALUE);
        k.llllIllllI[62] = -(0xFFFFDD23 & 0x67FD) & (0xFFFFF7FE & 0x7DF5);
        k.llllIllllI[63] = -(0xFFFFDE5D & 0x63F3) & (0xFFFFFEDF & 0x7FFC);
        k.llllIllllI[64] = 0x71 ^ 9;
        k.llllIllllI[65] = 47 + 61 - -17 + 25;
        k.llllIllllI[66] = -(0xFFFFF807 & 0x47FF) & (0xFFFFFABF & 0x7FDE);
        k.llllIllllI[67] = 0xDB ^ 0xBF;
        k.llllIllllI[68] = -2 & (0xFFFFFEFF & 0x2FCD);
        k.llllIllllI[69] = -(0xFFFFAE42 & 0x53FF) & (0xFFFFF7FD & 0x6BEB);
        k.llllIllllI[70] = -(0xFFFFCDC7 & 0x72B9) & (0xFFFFFFFF & 0x5FC7);
        k.llllIllllI[71] = -(0xFFFFDCFB & 0x6B35) & (0xFFFFCFBF & 0x7BF4);
        k.llllIllllI[72] = 0x5F ^ 0x39 ^ (0x19 ^ 0x63);
        k.llllIllllI[73] = 0x11 ^ 0x77 ^ (0xA5 ^ 0xA0);
        k.llllIllllI[74] = 54 + 173 - 147 + 95 ^ 116 + 82 - 194 + 174;
        k.llllIllllI[75] = 0xDD ^ 0xC3;
        k.llllIllllI[76] = 0xFFFFFFDE & 0xBEF;
        k.llllIllllI[77] = 0xFFFFFDE7 & 0xEFB;
        k.llllIllllI[78] = 0xFFFFCBF7 & 0x3FDF;
        k.llllIllllI[79] = 0xFFFFAEF9 & 0x5DEF;
        k.llllIllllI[80] = -(0xFFFFE07F & 0x3FA5) & (0xFFFFFF7F & 0x2CFE);
        k.llllIllllI[81] = 0xFFFF8DFF & 0x7F9F;
    }

    public static void Y() {
        if (k.llIlIIIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (k.llIlIIIlIlIll(bv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[40]];
            Movement.walkTo((WorldPoint)bw);
            0;
            Time.sleepTicks((int)llllIllllI[1]);
            0;
        }
        if (k.llIlIIIlIlIIl(bv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            k.Z();
        }
    }

    public static void ad() {
        if (k.llIlIIIlIllII(Widgets.get((int)llllIllllI[49], (int)llllIllllI[50]))) {
            AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[51]];
            Widgets.get((int)llllIllllI[49], (int)llllIllllI[50]).interact(llllIlllIl[llllIllllI[52]]);
            Time.sleepTicks((int)llllIllllI[5]);
            0;
        }
        if (k.llIlIIIllIIlI(Widgets.get((int)llllIllllI[49], (int)llllIllllI[50])) && k.llIlIIIlIlIll(Widgets.get((int)llllIllllI[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)llllIllllI[1]);
            0;
            if (k.llIlIIIlIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[17])) {
                Widgets.get((int)llllIllllI[53], (int)llllIllllI[1]).getChild(llllIllllI[1]).interact(llllIlllIl[llllIllllI[54]]);
            }
            if (k.llIlIIIlIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[31]) && k.llIlIIIlIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[17])) {
                Widgets.get((int)llllIllllI[53], (int)llllIllllI[1]).getChild(llllIllllI[2]).interact(llllIlllIl[llllIllllI[55]]);
            }
            if (k.llIlIIIlIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[31]) && k.llIlIIIlIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[36])) {
                Widgets.get((int)llllIllllI[53], (int)llllIllllI[1]).getChild(llllIllllI[3]).interact(llllIlllIl[llllIllllI[19]]);
            }
            if (k.llIlIIIlIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[31])) {
                int[] nArray = new int[llllIllllI[1]];
                nArray[k.llllIllllI[0]] = llllIllllI[12];
                if (k.llIlIIIlIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)llllIllllI[53], (int)llllIllllI[1]).getChild(llllIllllI[3]).interact(llllIlllIl[llllIllllI[50]]);
                }
            }
            if (k.llIlIIIlIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[36])) {
                int[] nArray = new int[llllIllllI[1]];
                nArray[k.llllIllllI[0]] = llllIllllI[12];
                if (k.llIlIIIlIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)llllIllllI[53], (int)llllIllllI[1]).getChild(llllIllllI[5]).interact(llllIlllIl[llllIllllI[56]]);
                }
            }
            Time.sleepTicks((int)llllIllllI[1]);
            0;
        }
    }

    private static boolean llIlIIIlIlllI(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aa() {
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
                                                    if (!k.llIlIIIlIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[19])) break block19;
                                                    int[] nArray = new int[llllIllllI[1]];
                                                    nArray[k.llllIllllI[0]] = llllIllllI[7];
                                                    if (!k.llIlIIIlIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[llllIllllI[1]];
                                                    nArray2[k.llllIllllI[0]] = llllIllllI[11];
                                                    if (!k.llIlIIIlIlIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[llllIllllI[1]];
                                                    nArray3[k.llllIllllI[0]] = llllIllllI[9];
                                                    if (!k.llIlIIIlIlIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[llllIllllI[1]];
                                                    nArray4[k.llllIllllI[0]] = llllIllllI[12];
                                                    if (!k.llIlIIIlIlIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[llllIllllI[1]];
                                                    nArray5[k.llllIllllI[0]] = llllIllllI[18];
                                                    if (!k.llIlIIIlIlIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[llllIllllI[1]];
                                                    nArray6[k.llllIllllI[0]] = llllIllllI[44];
                                                    if (!k.llIlIIIlIlIll(Inventory.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[llllIllllI[1]];
                                                    nArray7[k.llllIllllI[0]] = llllIllllI[44];
                                                    if (!k.llIlIIIlIlIIl(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = llllIllllI[1];
                                                0;
                                                if (3 >= 0) return n5 != 0;
                                                return ((25 + 93 - 19 + 79 ^ 27 + 183 - 184 + 160) & (95 + 69 - 104 + 67 ^ (0 ^ 0x77) ^ -1)) != 0;
                                            }
                                            n5 = llllIllllI[0];
                                            return n5 != 0;
                                        }
                                        if (!k.llIlIIIlIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[19]) || !k.llIlIIIlIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[6])) break block22;
                                        int[] nArray = new int[llllIllllI[1]];
                                        nArray[k.llllIllllI[0]] = llllIllllI[11];
                                        if (!k.llIlIIIlIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[llllIllllI[1]];
                                        nArray8[k.llllIllllI[0]] = llllIllllI[9];
                                        if (!k.llIlIIIlIlIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[llllIllllI[1]];
                                        nArray9[k.llllIllllI[0]] = llllIllllI[12];
                                        if (!k.llIlIIIlIlIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[llllIllllI[1]];
                                        nArray10[k.llllIllllI[0]] = llllIllllI[14];
                                        if (!k.llIlIIIlIlIIl(Inventory.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[llllIllllI[1]];
                                        nArray11[k.llllIllllI[0]] = llllIllllI[44];
                                        if (!k.llIlIIIlIlIll(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[llllIllllI[1]];
                                        nArray12[k.llllIllllI[0]] = llllIllllI[44];
                                        if (!k.llIlIIIlIlIIl(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = llllIllllI[1];
                                    0;
                                    if (1 == 1) return n4 != 0;
                                    return false;
                                }
                                n4 = llllIllllI[0];
                                return n4 != 0;
                            }
                            if (!k.llIlIIIlIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[6]) || !k.llIlIIIlIlIll(bt ? 1 : 0)) break block25;
                            int[] nArray = new int[llllIllllI[1]];
                            nArray[k.llllIllllI[0]] = llllIllllI[20];
                            if (!k.llIlIIIlIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[llllIllllI[1]];
                            nArray13[k.llllIllllI[0]] = llllIllllI[20];
                            if (!k.llIlIIIlIlIIl(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[llllIllllI[1]];
                        nArray[k.llllIllllI[0]] = llllIllllI[22];
                        if (k.llIlIIIlIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[llllIllllI[1]];
                            nArray14[k.llllIllllI[0]] = llllIllllI[35];
                            if (k.llIlIIIlIlIIl(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = llllIllllI[1];
                                0;
                                if (2 == 2) return n3 != 0;
                                return false;
                            }
                        }
                    }
                    n3 = llllIllllI[0];
                    return n3 != 0;
                }
                if (!k.llIlIIIlIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[6]) || !k.llIlIIIlIlIIl(bt ? 1 : 0)) return llllIllllI[0];
                int[] nArray = new int[llllIllllI[1]];
                nArray[k.llllIllllI[0]] = llllIllllI[20];
                if (!k.llIlIIIlIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[llllIllllI[1]];
                nArray15[k.llllIllllI[0]] = llllIllllI[20];
                if (!k.llIlIIIlIlIIl(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[llllIllllI[1]];
            nArray[k.llllIllllI[0]] = llllIllllI[14];
            if (k.llIlIIIlIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[llllIllllI[1]];
                nArray16[k.llllIllllI[0]] = llllIllllI[21];
                if (k.llIlIIIlIlIIl(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[llllIllllI[1]];
                    nArray17[k.llllIllllI[0]] = llllIllllI[21];
                    if (k.llIlIIIlIlllI(Inventory.getFirst((int[])nArray17).getQuantity(), llllIllllI[17])) {
                        int[] nArray18 = new int[llllIllllI[1]];
                        nArray18[k.llllIllllI[0]] = llllIllllI[22];
                        if (k.llIlIIIlIlIIl(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[llllIllllI[1]];
                            nArray19[k.llllIllllI[0]] = llllIllllI[35];
                            if (k.llIlIIIlIlIIl(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = llllIllllI[1];
                                0;
                                if (((0x33 ^ 0x72) & ~(0x1A ^ 0x5B)) >= 0) return n2 != 0;
                                return false;
                            }
                        }
                    }
                }
            }
        }
        n2 = llllIllllI[0];
        return n2 != 0;
    }

    public static void X() {
        if (k.llIlIIIlIlIIl(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[0]];
            b.a(bu);
            if (k.llIlIIIlIlIlI(bu.size(), llllIllllI[1])) {
                System.out.println(llllIlllIl[llllIllllI[1]]);
                bs = llllIllllI[0];
            }
        }
        if (k.llIlIIIlIlIll(bs ? 1 : 0)) {
            BankLocation var6;
            if (k.llIlIIIlIlIll(k.aa() ? 1 : 0)) {
                var6 = BankLocation.getNearest();
                if (k.llIlIIIlIllII(var6) && k.llIlIIIlIlIll(var6.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[2]];
                    a.a(var6);
                }
                if (k.llIlIIIlIllII(var6) && k.llIlIIIlIlIIl(var6.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[3]];
                    if (k.llIlIIIlIlIll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llllIllllI[4]);
                        0;
                    }
                    if (k.llIlIIIlIlIIl(Bank.isOpen() ? 1 : 0)) {
                        if (k.llIlIIIlIllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llllIllllI[5]);
                            0;
                        }
                        while (k.llIlIIIlIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[6]) && k.llIlIIIlIlIll(t.bl() ? 1 : 0)) {
                            t.bj();
                            Time.sleepTicks((int)llllIllllI[1]);
                            0;
                            0;
                            if (2 == 2) continue;
                            return;
                        }
                        if (k.llIlIIIlIlIll(k.ab() ? 1 : 0)) {
                            k.ae();
                            System.out.println(llllIlllIl[llllIllllI[5]]);
                            bs = llllIllllI[1];
                            return;
                        }
                        if (k.llIlIIIlIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[6])) {
                            int[] nArray = new int[llllIllllI[1]];
                            nArray[k.llllIllllI[0]] = llllIllllI[7];
                            if (k.llIlIIIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[llllIllllI[1]];
                                nArray2[k.llllIllllI[0]] = llllIllllI[7];
                                if (k.llIlIIIlIlIlI(Inventory.getCount((int[])nArray2), llllIllllI[1])) {
                                    Bank.withdraw((int)llllIllllI[7], (int)llllIllllI[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllIllllI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llllIllllI[1]];
                                        nArray[k.llllIllllI[0]] = llllIllllI[7];
                                        if (k.llIlIIIlIllIl(Inventory.getCount((int[])nArray))) {
                                            bl = llllIllllI[1];
                                            0;
                                            if (((0x6B ^ 0x52) & ~(0x79 ^ 0x40)) != ((0x1C ^ 0x26) & ~(0xF8 ^ 0xC2))) {
                                                return false;
                                            }
                                        } else {
                                            bl = llllIllllI[0];
                                        }
                                        return bl;
                                    }, (int)llllIllllI[4]);
                                    0;
                                }
                            }
                            int[] nArray3 = new int[llllIllllI[1]];
                            nArray3[k.llllIllllI[0]] = llllIllllI[9];
                            if (k.llIlIIIlIlIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[llllIllllI[1]];
                                nArray4[k.llllIllllI[0]] = llllIllllI[9];
                                if (k.llIlIIIlIlIlI(Inventory.getCount((int[])nArray4), llllIllllI[1])) {
                                    Bank.withdraw((int)llllIllllI[9], (int)llllIllllI[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllIllllI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llllIllllI[1]];
                                        nArray[k.llllIllllI[0]] = llllIllllI[9];
                                        if (k.llIlIIIlIllIl(Inventory.getCount((int[])nArray))) {
                                            bl = llllIllllI[1];
                                            0;
                                            if (1 <= 0) {
                                                return (1 & (1 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = llllIllllI[0];
                                        }
                                        return bl;
                                    }, (int)llllIllllI[4]);
                                    0;
                                }
                            }
                            int[] nArray5 = new int[llllIllllI[1]];
                            nArray5[k.llllIllllI[0]] = llllIllllI[11];
                            if (k.llIlIIIlIlIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[llllIllllI[1]];
                                nArray6[k.llllIllllI[0]] = llllIllllI[11];
                                if (k.llIlIIIlIlIlI(Inventory.getCount((int[])nArray6), llllIllllI[1])) {
                                    Bank.withdraw((int)llllIllllI[11], (int)llllIllllI[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllIllllI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llllIllllI[1]];
                                        nArray[k.llllIllllI[0]] = llllIllllI[11];
                                        if (k.llIlIIIlIllIl(Inventory.getCount((int[])nArray))) {
                                            bl = llllIllllI[1];
                                            0;
                                            if (3 > (69 + 32 - -44 + 10 ^ 86 + 49 - 85 + 109)) {
                                                return (2 & (2 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = llllIllllI[0];
                                        }
                                        return bl;
                                    }, (int)llllIllllI[4]);
                                    0;
                                }
                            }
                            int[] nArray7 = new int[llllIllllI[1]];
                            nArray7[k.llllIllllI[0]] = llllIllllI[12];
                            if (k.llIlIIIlIlIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[llllIllllI[1]];
                                nArray8[k.llllIllllI[0]] = llllIllllI[12];
                                if (k.llIlIIIlIlIlI(Inventory.getCount((int[])nArray8), llllIllllI[1])) {
                                    Bank.withdraw((int)llllIllllI[12], (int)llllIllllI[13], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllIllllI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llllIllllI[1]];
                                        nArray[k.llllIllllI[0]] = llllIllllI[12];
                                        if (k.llIlIIIlIllIl(Inventory.getCount((int[])nArray))) {
                                            bl = llllIllllI[1];
                                            0;
                                            if (((0x30 ^ 0x14) & ~(0x49 ^ 0x6D)) != ((0x39 ^ 0x76) & ~(0x2E ^ 0x61))) {
                                                return false;
                                            }
                                        } else {
                                            bl = llllIllllI[0];
                                        }
                                        return bl;
                                    }, (int)llllIllllI[4]);
                                    0;
                                }
                            }
                            int[] nArray9 = new int[llllIllllI[1]];
                            nArray9[k.llllIllllI[0]] = llllIllllI[14];
                            if (k.llIlIIIlIlIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[llllIllllI[1]];
                                nArray10[k.llllIllllI[0]] = llllIllllI[14];
                                if (k.llIlIIIlIlIlI(Inventory.getCount((int[])nArray10), llllIllllI[1])) {
                                    Bank.withdraw((int)llllIllllI[14], (int)llllIllllI[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllIllllI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llllIllllI[1]];
                                        nArray[k.llllIllllI[0]] = llllIllllI[14];
                                        if (k.llIlIIIlIllIl(Inventory.getCount((int[])nArray))) {
                                            bl = llllIllllI[1];
                                            0;
                                            if (-3 > 0) {
                                                return ((59 + 44 - 85 + 153 ^ 126 + 47 - 79 + 61) & (125 + 14 - 55 + 43 ^ (0 ^ 0x4F) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = llllIllllI[0];
                                        }
                                        return bl;
                                    }, (int)llllIllllI[4]);
                                    0;
                                }
                            }
                            int[] nArray11 = new int[llllIllllI[1]];
                            nArray11[k.llllIllllI[0]] = llllIllllI[15];
                            if (k.llIlIIIlIlIIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[llllIllllI[1]];
                                nArray12[k.llllIllllI[0]] = llllIllllI[15];
                                if (k.llIlIIIlIlIll(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    Bank.withdraw((int)llllIllllI[15], (int)llllIllllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllIllllI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[llllIllllI[1]];
                                        nArray[k.llllIllllI[0]] = llllIllllI[15];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)llllIllllI[4]);
                                    0;
                                }
                            }
                            Bank.withdraw((int)llllIllllI[16], (int)llllIllllI[17], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            int[] nArray13 = new int[llllIllllI[1]];
                            nArray13[k.llllIllllI[0]] = llllIllllI[18];
                            if (k.llIlIIIlIlIIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                int[] nArray14 = new int[llllIllllI[1]];
                                nArray14[k.llllIllllI[0]] = llllIllllI[18];
                                if (k.llIlIIIlIlIlI(Inventory.getCount((int[])nArray14), llllIllllI[1]) && k.llIlIIIlIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[19])) {
                                    Bank.withdrawAll((int)llllIllllI[18], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllIllllI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llllIllllI[1]];
                                        nArray[k.llllIllllI[0]] = llllIllllI[18];
                                        if (k.llIlIIIlIllIl(Inventory.getCount((int[])nArray))) {
                                            bl = llllIllllI[1];
                                            0;
                                            if (-2 > 0) {
                                                return ((0x45 ^ 0x73 ^ (0x42 ^ 0x4F)) & (0x5A ^ 0 ^ (0xD4 ^ 0xB5) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = llllIllllI[0];
                                        }
                                        return bl;
                                    }, (int)llllIllllI[4]);
                                    0;
                                }
                            }
                        }
                        if (k.llIlIIIlIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[6])) {
                            int[] nArray = new int[llllIllllI[1]];
                            nArray[k.llllIllllI[0]] = llllIllllI[20];
                            if (k.llIlIIIlIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)llllIllllI[20], (int)llllIllllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)llllIllllI[1]);
                                0;
                            }
                            if (k.llIlIIIlIlIIl(bt ? 1 : 0)) {
                                Bank.withdrawAll((int)llllIllllI[21], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)llllIllllI[1]);
                                0;
                                Bank.withdrawAll((int)llllIllllI[14], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)llllIllllI[1]);
                                0;
                            }
                            Bank.withdrawAll((int)llllIllllI[22], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)llllIllllI[1]);
                            0;
                            Bank.withdrawAll((int)llllIllllI[23], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)llllIllllI[1]);
                            0;
                        }
                    }
                }
            }
            if (k.llIlIIIlIlIIl(k.aa() ? 1 : 0)) {
                if (k.llIlIIIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (k.llIlIIIlIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[19])) {
                    if (k.llIlIIIlIlIll(bv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[17]];
                        Movement.walkTo((WorldPoint)bw);
                        0;
                        Time.sleepTicks((int)llllIllllI[1]);
                        0;
                    }
                    if (k.llIlIIIlIlIIl(bv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[24]];
                        k.Z();
                    }
                }
                if (k.llIlIIIlIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[19]) && k.llIlIIIlIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[25])) {
                    AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[26]];
                    if (k.llIlIIIlIllll(Players.getLocal().getAnimation(), llllIllllI[27])) {
                        Magic.cast((Spell)SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks((int)llllIllllI[1]);
                        0;
                    }
                }
                if (k.llIlIIIlIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[25]) && k.llIlIIIlIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[28])) {
                    AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[29]];
                    if (k.llIlIIIlIllll(Players.getLocal().getAnimation(), llllIllllI[27])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)llllIllllI[1]);
                        0;
                    }
                }
                if (k.llIlIIIlIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[28]) && k.llIlIIIlIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[30])) {
                    AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[31]];
                    if (k.llIlIIIlIllll(Players.getLocal().getAnimation(), llllIllllI[27])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)llllIllllI[1]);
                        0;
                    }
                }
                if (k.llIlIIIlIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[30]) && k.llIlIIIlIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[6])) {
                    AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[32]];
                    if (k.llIlIIIlIllll(Players.getLocal().getAnimation(), llllIllllI[27])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)llllIllllI[1]);
                        0;
                    }
                }
                if (k.llIlIIIlIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[6])) {
                    int var18;
                    AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[33]];
                    int[] nArray = new int[llllIllllI[1]];
                    nArray[k.llllIllllI[0]] = llllIllllI[20];
                    if (k.llIlIIIlIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray15 = new int[llllIllllI[1]];
                        nArray15[k.llllIllllI[0]] = llllIllllI[20];
                        if (k.llIlIIIlIlIll(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[llllIllllI[1]];
                            nArray16[k.llllIllllI[0]] = llllIllllI[20];
                            Inventory.getFirst((int[])nArray16).interact(llllIlllIl[llllIllllI[34]]);
                            Time.sleepTicks((int)llllIllllI[1]);
                            0;
                        }
                    }
                    if (k.llIlIIIlIlIIl(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[llllIllllI[1]];
                    nArray17[k.llllIllllI[0]] = llllIllllI[22];
                    var6 = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[llllIllllI[1]];
                    nArray18[k.llllIllllI[0]] = llllIllllI[35];
                    Item var8 = Inventory.getFirst((int[])nArray18);
                    if (k.llIlIIIlIlIll(bt ? 1 : 0)) {
                        if (k.llIlIIIlIlIll(Players.getLocal().getWorldLocation().equals((Object)bx) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[36]];
                            Movement.walkTo((WorldPoint)bx);
                            0;
                            Time.sleepTicks((int)llllIllllI[1]);
                            0;
                        }
                        if (k.llIlIIIlIlIIl(Players.getLocal().getWorldLocation().equals((Object)bx) ? 1 : 0) && k.llIlIIIlIllII(var6) && k.llIlIIIlIllII(var8)) {
                            var18 = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)var8);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (k.llIlIIIllIlII(Skills.getExperience((Skill)Skill.MAGIC), var18)) {
                                    bl = llllIllllI[1];
                                    0;
                                    if (-1 >= 2) {
                                        return ((0x60 ^ 0x20 ^ (0x75 ^ 0x68)) & (0x11 ^ 0x21 ^ (0x57 ^ 0x3A) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = llllIllllI[0];
                                }
                                return bl;
                            }, (int)llllIllllI[8]);
                            0;
                            Time.sleep((long)e.c(llllIllllI[37], llllIllllI[38]));
                            0;
                        }
                    }
                    if (k.llIlIIIlIlIIl(bt ? 1 : 0)) {
                        if (k.llIlIIIlIllII(var6) && k.llIlIIIlIllII(var8) && k.llIlIIIlIllll(Players.getLocal().getAnimation(), llllIllllI[27])) {
                            var18 = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)var8);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (k.llIlIIIllIlII(Skills.getExperience((Skill)Skill.MAGIC), var18)) {
                                    bl = llllIllllI[1];
                                    0;
                                    
                                    }
                                } else {
                                    bl = llllIllllI[0];
                                }
                                return bl;
                            }, (int)llllIllllI[8]);
                            0;
                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (k.llIlIIIlIllll(Players.getLocal().getAnimation(), llllIllllI[27])) {
                                bl = llllIllllI[1];
                                0;
                                if (((0x1D ^ 0x55) & ~(0x45 ^ 0xD)) != 0) {
                                    return false;
                                }
                            } else {
                                bl = llllIllllI[0];
                            }
                            return bl;
                        }, (int)llllIllllI[39]);
                        0;
                    }
                }
            }
        }
    }

    private static void ae() {
        d var3;
        Object var25;
        if (k.llIlIIIlIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[6])) {
            int[] nArray = new int[llllIllllI[1]];
            nArray[k.llllIllllI[0]] = llllIllllI[14];
            if (k.llIlIIIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new d(llllIllllI[14], llllIllllI[57], llllIllllI[58]);
                bu.add(d2);
                0;
            }
            int[] nArray2 = new int[llllIllllI[1]];
            nArray2[k.llllIllllI[0]] = llllIllllI[7];
            if (k.llIlIIIlIlIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                var25 = new d(llllIllllI[7], llllIllllI[59], llllIllllI[24]);
                bu.add((d)var25);
                0;
            }
            int[] nArray3 = new int[llllIllllI[1]];
            nArray3[k.llllIllllI[0]] = llllIllllI[9];
            if (k.llIlIIIlIlIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                var25 = new d(llllIllllI[9], llllIllllI[60], llllIllllI[24]);
                bu.add((d)var25);
                0;
            }
            int[] nArray4 = new int[llllIllllI[1]];
            nArray4[k.llllIllllI[0]] = llllIllllI[11];
            if (k.llIlIIIlIlIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                var25 = new d(llllIllllI[11], llllIllllI[61], llllIllllI[24]);
                bu.add((d)var25);
                0;
            }
            int[] nArray5 = new int[llllIllllI[1]];
            nArray5[k.llllIllllI[0]] = llllIllllI[12];
            if (k.llIlIIIlIlIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                var25 = new d(llllIllllI[12], llllIllllI[4], llllIllllI[24]);
                bu.add((d)var25);
                0;
            }
            int[] nArray6 = new int[llllIllllI[1]];
            nArray6[k.llllIllllI[0]] = llllIllllI[44];
            if (k.llIlIIIlIlIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                var25 = new d(llllIllllI[44], llllIllllI[1], e.c(llllIllllI[62], llllIllllI[63]));
                bu.add((d)var25);
                0;
            }
        }
        if (k.llIlIIIlIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[6])) {
            int[] nArray = new int[llllIllllI[1]];
            nArray[k.llllIllllI[0]] = llllIllllI[22];
            if (k.llIlIIIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[llllIllllI[1]];
                nArray7[k.llllIllllI[0]] = llllIllllI[22];
                if (k.llIlIIIlIlIlI(Bank.getFirst((int[])nArray7).getQuantity(), llllIllllI[61])) {
                    int[] nArray8 = new int[llllIllllI[1]];
                    nArray8[k.llllIllllI[0]] = llllIllllI[22];
                    var25 = new d(llllIllllI[22], llllIllllI[61] - Bank.getFirst((int[])nArray8).getQuantity(), llllIllllI[64]);
                    bu.add((d)var25);
                    0;
                }
            }
            int[] nArray9 = new int[llllIllllI[1]];
            nArray9[k.llllIllllI[0]] = llllIllllI[22];
            if (k.llIlIIIlIlIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                var25 = new d(llllIllllI[22], llllIllllI[61], llllIllllI[64]);
                bu.add((d)var25);
                0;
            }
            int[] nArray10 = new int[llllIllllI[1]];
            nArray10[k.llllIllllI[0]] = llllIllllI[23];
            if (k.llIlIIIlIlIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[llllIllllI[1]];
                nArray11[k.llllIllllI[0]] = llllIllllI[23];
                if (k.llIlIIIlIlIlI(Bank.getFirst((int[])nArray11).getQuantity(), llllIllllI[61])) {
                    int[] nArray12 = new int[llllIllllI[1]];
                    nArray12[k.llllIllllI[0]] = llllIllllI[23];
                    var25 = new d(llllIllllI[23], llllIllllI[61] - Bank.getFirst((int[])nArray12).getQuantity(), llllIllllI[65]);
                    bu.add((d)var25);
                    0;
                }
            }
            int[] nArray13 = new int[llllIllllI[1]];
            nArray13[k.llllIllllI[0]] = llllIllllI[23];
            if (k.llIlIIIlIlIll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                var25 = new d(llllIllllI[23], llllIllllI[61], llllIllllI[65]);
                bu.add((d)var25);
                0;
            }
            int[] nArray14 = new int[llllIllllI[1]];
            nArray14[k.llllIllllI[0]] = llllIllllI[20];
            if (k.llIlIIIlIlIll(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[llllIllllI[1]];
                nArray15[k.llllIllllI[0]] = llllIllllI[20];
                if (k.llIlIIIlIlIll(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    var25 = new d(llllIllllI[20], llllIllllI[1], llllIllllI[66]);
                    bu.add((d)var25);
                    0;
                }
            }
            if (k.llIlIIIlIlIIl(bt ? 1 : 0)) {
                int[] nArray16 = new int[llllIllllI[1]];
                nArray16[k.llllIllllI[0]] = llllIllllI[14];
                if (k.llIlIIIlIlIIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[llllIllllI[1]];
                    nArray17[k.llllIllllI[0]] = llllIllllI[14];
                    if (k.llIlIIIlIlIlI(Bank.getFirst((int[])nArray17).getQuantity(), llllIllllI[61])) {
                        int[] nArray18 = new int[llllIllllI[1]];
                        nArray18[k.llllIllllI[0]] = llllIllllI[14];
                        var25 = new d(llllIllllI[14], llllIllllI[61] - Bank.getFirst((int[])nArray18).getQuantity(), llllIllllI[58]);
                        bu.add((d)var25);
                        0;
                    }
                }
                int[] nArray19 = new int[llllIllllI[1]];
                nArray19[k.llllIllllI[0]] = llllIllllI[14];
                if (k.llIlIIIlIlIll(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    var25 = new d(llllIllllI[14], llllIllllI[61], llllIllllI[58]);
                    bu.add((d)var25);
                    0;
                }
                int[] nArray20 = new int[llllIllllI[1]];
                nArray20[k.llllIllllI[0]] = llllIllllI[21];
                if (k.llIlIIIlIlIIl(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[llllIllllI[1]];
                    nArray21[k.llllIllllI[0]] = llllIllllI[21];
                    if (k.llIlIIIlIlIlI(Bank.getFirst((int[])nArray21).getQuantity(), llllIllllI[66])) {
                        int[] nArray22 = new int[llllIllllI[1]];
                        nArray22[k.llllIllllI[0]] = llllIllllI[21];
                        var25 = new d(llllIllllI[21], llllIllllI[66] - Bank.getFirst((int[])nArray22).getQuantity(), llllIllllI[24]);
                        bu.add((d)var25);
                        0;
                    }
                }
                int[] nArray23 = new int[llllIllllI[1]];
                nArray23[k.llllIllllI[0]] = llllIllllI[21];
                if (k.llIlIIIlIlIll(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    var25 = new d(llllIllllI[21], llllIllllI[66], llllIllllI[24]);
                    bu.add((d)var25);
                    0;
                }
            }
        }
        int[] nArray = new int[llllIllllI[1]];
        nArray[k.llllIllllI[0]] = llllIllllI[18];
        if (k.llIlIIIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            var25 = new d(llllIllllI[18], llllIllllI[67], llllIllllI[37]);
            bu.add((d)var25);
            0;
        }
        if (k.llIlIIIlIlIll(Bank.contains(var25 = item -> item.getName().toLowerCase().contains(llllIlllIl[llllIllllI[74]])) ? 1 : 0)) {
            var3 = new d(llllIllllI[68], llllIllllI[17], llllIllllI[69]);
            bu.add(var3);
            0;
        }
        int[] nArray24 = new int[llllIllllI[1]];
        nArray24[k.llllIllllI[0]] = llllIllllI[70];
        if (k.llIlIIIlIlIll(Bank.contains((int[])nArray24) ? 1 : 0)) {
            var3 = new d(llllIllllI[70], llllIllllI[32], llllIllllI[71]);
            bu.add(var3);
            0;
        }
        int[] nArray25 = new int[llllIllllI[1]];
        nArray25[k.llllIllllI[0]] = llllIllllI[16];
        if (k.llIlIIIlIlIll(Bank.contains((int[])nArray25) ? 1 : 0)) {
            var3 = new d(llllIllllI[16], llllIllllI[32], llllIllllI[71]);
            bu.add(var3);
            0;
        }
    }

    @Override
    public String U() {
        return llllIlllIl[llllIllllI[72]];
    }

    private static void llIlIIIlIIlll() {
        llllIlllIl = new String[llllIllllI[25]];
        k.llllIlllIl[k.llllIllllI[0]] = k."Buying items";
        k.llllIlllIl[k.llllIllllI[1]] = k."Finished buying items, switching back to magic training";
        k.llllIlllIl[k.llllIllllI[2]] = k."Navigating to bank";
        k.llllIlllIl[k.llllIllllI[3]] = k."Handling banking";
        k.llllIlllIl[k.llllIllllI[5]] = k."We are missing supplies, switching to BUYING";
        k.llllIlllIl[k.llllIllllI[17]] = k."Nav to cows";
        k.llllIlllIl[k.llllIllllI[24]] = k."Attacking cows";
        k.llllIlllIl[k.llllIllllI[26]] = k."Casting varrock tele";
        k.llllIlllIl[k.llllIllllI[29]] = k."Casting lumby tele";
        k.llllIlllIl[k.llllIllllI[31]] = k."Casting fally tele";
        k.llllIlllIl[k.llllIllllI[32]] = k."Casting cammy tele";
        k.llllIlllIl[k.llllIllllI[33]] = k."Alching";
        k.llllIlllIl[k.llllIllllI[34]] = k."Wield";
        k.llllIlllIl[k.llllIllllI[36]] = k."Move to alch spot";
        k.llllIlllIl[k.llllIllllI[40]] = k."Nav to cows";
        k.llllIlllIl[k.llllIllllI[41]] = k."Eat";
        k.llllIlllIl[k.llllIllllI[42]] = k."Cow";
        k.llllIlllIl[k.llllIllllI[43]] = k."cow";
        k.llllIlllIl[k.llllIllllI[45]] = k."Attacking cows";
        k.llllIlllIl[k.llllIllllI[46]] = k."Attack";
        k.llllIlllIl[k.llllIllllI[47]] = k."In combat";
        k.llllIlllIl[k.llllIllllI[51]] = k."Opening autocast";
        k.llllIlllIl[k.llllIllllI[52]] = k."Choose spell";
        k.llllIlllIl[k.llllIllllI[54]] = k."Wind Strike";
        k.llllIlllIl[k.llllIllllI[55]] = k."Water Strike";
        k.llllIlllIl[k.llllIllllI[19]] = k."Earth Strike";
        k.llllIlllIl[k.llllIllllI[50]] = k."Earth Strike";
        k.llllIlllIl[k.llllIllllI[56]] = k."Fire Strike";
        k.llllIlllIl[k.llllIllllI[72]] = k."Magic training";
        k.llllIlllIl[k.llllIllllI[74]] = k."ring of wealth (";
        k.llllIlllIl[k.llllIllllI[75]] = k."Cow";
    }

    private static void Z() {
        if (k.llIlIIIllIIIl(k.llIlIIIllIIII(e.u(), 30.0))) {
            int[] nArray = new int[llllIllllI[1]];
            nArray[k.llllIllllI[0]] = llllIllllI[18];
            if (k.llIlIIIlIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llllIllllI[1]];
                nArray2[k.llllIllllI[0]] = llllIllllI[18];
                Inventory.getFirst((int[])nArray2).interact(llllIlllIl[llllIllllI[41]]);
                Time.sleepTicks((int)llllIllllI[1]);
                0;
            }
        }
        if (k.llIlIIIllIIlI(Players.getLocal().getInteracting())) {
            NPC var7 = NPCs.getNearest(nPC -> {
                int n2;
                if (k.llIlIIIlIlIIl(nPC.getName().contains(llllIlllIl[llllIllllI[75]]) ? 1 : 0) && k.llIlIIIlIlIll(nPC.isDead() ? 1 : 0)) {
                    n2 = llllIllllI[1];
                    0;
                    if (2 != 2) {
                        return false;
                    }
                } else {
                    n2 = llllIllllI[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[llllIllllI[2]];
            stringArray[k.llllIllllI[0]] = llllIlllIl[llllIllllI[42]];
            stringArray[k.llllIllllI[1]] = llllIlllIl[llllIllllI[43]];
            List lllllllllllllllllIlIlIIIIlIIIIIl = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (k.llIlIIIllIIll(nPC.getInteracting(), Players.getLocal())) {
                    bl = llllIllllI[1];
                    0;
                    if (-(10 + 125 - 50 + 97 ^ 83 + 139 - 70 + 26) > 0) {
                        return ((0x7E ^ 0x77 ^ (0x94 ^ 0x8C)) & (0x13 ^ 0x7D ^ 82 + 81 - 63 + 27 ^ -1)) != 0;
                    }
                } else {
                    bl = llllIllllI[0];
                }
                return bl;
            }).collect(Collectors.toList());
            int[] nArray = new int[llllIllllI[1]];
            nArray[k.llllIllllI[0]] = llllIllllI[44];
            if (k.llIlIIIlIlIIl(Equipment.contains((int[])nArray) ? 1 : 0) && k.llIlIIIlIlIll(k.ac() ? 1 : 0)) {
                k.ad();
            }
            if (k.llIlIIIlIllII(var7) && k.llIlIIIlIlIll(Players.getLocal().isMoving() ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[45]];
                var7.interact(llllIlllIl[llllIllllI[46]]);
                Time.sleepTicks((int)llllIllllI[3]);
                0;
            }
        }
        if (k.llIlIIIlIllII(Players.getLocal().getInteracting())) {
            AccBuilderTempleTrek.c = llllIlllIl[llllIllllI[47]];
            Time.sleepTicks((int)llllIllllI[1]);
            0;
        }
    }

    private static boolean llIlIIIlIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIlIIIllIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static String llIlIIIlIIlII(String var19, String var1) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var11 = var1.toCharArray();
        int var9 = llllIllllI[0];
        char[] var2 = var19.toCharArray();
        int var15 = var2.length;
        int var12 = llllIllllI[0];
        while (k.llIlIIIlIlIlI(var12, var15)) {
            char var10 = var2[var12];
            var22.append((char)(var10 ^ var11[var9 % var11.length]));
            0;
            ++var9;
            ++var12;
            0;
            if (2 >= ((0xBF ^ 0x83) & ~(0x16 ^ 0x2A))) continue;
            return null;
        }
        return String.valueOf(var22);
    }

    private static boolean llIlIIIlIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        k.llIlIIIlIlIII();
        k.llIlIIIlIIlll();
        bu = new ArrayList<d>();
        bv = new WorldArea(llllIllllI[76], llllIllllI[77], llllIllllI[47], llllIllllI[40], llllIllllI[0]);
        bw = new WorldPoint(llllIllllI[78], llllIllllI[79], llllIllllI[0]);
        bx = new WorldPoint(llllIllllI[80] + e.c(llllIllllI[1], llllIllllI[5]), llllIllllI[81], llllIllllI[0]);
    }

    private static String llIlIIIlIIlIl(String var16, String var20) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(llllIllllI[2], var17);
            return new String(var13.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (k.llIlIIIlIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllIllllI[73])) {
            bl = llllIllllI[1];
            0;
            if (3 <= 0) {
                return false;
            }
        } else {
            bl = llllIllllI[0];
        }
        return bl;
    }

    private static boolean llIlIIIllIIIl(int n2) {
        return n2 < 0;
    }

    private static boolean llIlIIIlIllII(Object object) {
        return object != null;
    }

    @Override
    public int T() {
        try {
            k.X();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return llllIllllI[67];
    }

    private static boolean llIlIIIlIllIl(int n2) {
        return n2 > 0;
    }

    private static int llIlIIIllIIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llIlIIIllIIll(Object object, Object object2) {
        return object == object2;
    }

    private static String llIlIIIlIIllI(String var21, String var5) {
        try {
            SecretKeySpec var23 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), llllIllllI[29]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(llllIllllI[2], var23);
            return new String(var14.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }
}

