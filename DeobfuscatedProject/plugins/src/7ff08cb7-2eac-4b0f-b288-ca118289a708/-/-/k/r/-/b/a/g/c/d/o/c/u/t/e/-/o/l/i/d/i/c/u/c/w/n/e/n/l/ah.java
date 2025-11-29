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
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.H;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import gg.squire.account.AccBuilderGWD;
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

public class ah
implements ab {
    public static /* synthetic */ List<d> bx;
    public static /* synthetic */ boolean ck;
    static /* synthetic */ WorldArea cl;
    private static /* synthetic */ String[] lllIlIlII;
    static /* synthetic */ WorldPoint cm;
    static /* synthetic */ WorldPoint cn;
    public static /* synthetic */ boolean bv;
    private static /* synthetic */ int[] lllIlIlIl;

    private static boolean llIIIlllIIII(Object object) {
        return object != null;
    }

    private static boolean llIIIllIllll(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIllIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIllllIII(int n2, int n3) {
        return n2 > n3;
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
                                                    if (!ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[20])) break block19;
                                                    int[] nArray = new int[lllIlIlIl[1]];
                                                    nArray[ah.lllIlIlIl[0]] = lllIlIlIl[8];
                                                    if (!ah.llIIIllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lllIlIlIl[1]];
                                                    nArray2[ah.lllIlIlIl[0]] = lllIlIlIl[12];
                                                    if (!ah.llIIIllIllIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lllIlIlIl[1]];
                                                    nArray3[ah.lllIlIlIl[0]] = lllIlIlIl[10];
                                                    if (!ah.llIIIllIllIl(Bank.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lllIlIlIl[1]];
                                                    nArray4[ah.lllIlIlIl[0]] = lllIlIlIl[13];
                                                    if (!ah.llIIIllIllIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lllIlIlIl[1]];
                                                    nArray5[ah.lllIlIlIl[0]] = lllIlIlIl[19];
                                                    if (!ah.llIIIllIllIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lllIlIlIl[1]];
                                                    nArray6[ah.lllIlIlIl[0]] = lllIlIlIl[47];
                                                    if (!ah.llIIIllIllll(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lllIlIlIl[1]];
                                                    nArray7[ah.lllIlIlIl[0]] = lllIlIlIl[47];
                                                    if (!ah.llIIIllIllIl(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lllIlIlIl[1];
                                                "".length();
                                                if (-"  ".length() < 0) return n5 != 0;
                                                return ((0x13 ^ 0x6E ^ (0xE2 ^ 0xAC)) & (0x1D ^ 0x33 ^ (0x94 ^ 0x89) ^ -" ".length())) != 0;
                                            }
                                            n5 = lllIlIlIl[0];
                                            return n5 != 0;
                                        }
                                        if (!ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[20]) || !ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[7])) break block22;
                                        int[] nArray = new int[lllIlIlIl[1]];
                                        nArray[ah.lllIlIlIl[0]] = lllIlIlIl[12];
                                        if (!ah.llIIIllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lllIlIlIl[1]];
                                        nArray8[ah.lllIlIlIl[0]] = lllIlIlIl[10];
                                        if (!ah.llIIIllIllIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lllIlIlIl[1]];
                                        nArray9[ah.lllIlIlIl[0]] = lllIlIlIl[13];
                                        if (!ah.llIIIllIllIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lllIlIlIl[1]];
                                        nArray10[ah.lllIlIlIl[0]] = lllIlIlIl[15];
                                        if (!ah.llIIIllIllIl(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lllIlIlIl[1]];
                                        nArray11[ah.lllIlIlIl[0]] = lllIlIlIl[47];
                                        if (!ah.llIIIllIllll(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lllIlIlIl[1]];
                                        nArray12[ah.lllIlIlIl[0]] = lllIlIlIl[47];
                                        if (!ah.llIIIllIllIl(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lllIlIlIl[1];
                                    "".length();
                                    if ((0x86 ^ 0xB9 ^ (0x6E ^ 0x54)) != 0) return n4 != 0;
                                    return ((73 + 152 - 88 + 101 ^ 118 + 36 - 136 + 154) & (123 + 175 - 168 + 64 ^ 35 + 16 - -58 + 19 ^ -" ".length())) != 0;
                                }
                                n4 = lllIlIlIl[0];
                                return n4 != 0;
                            }
                            if (!ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[7]) || !ah.llIIIllIllll(ck ? 1 : 0)) break block25;
                            int[] nArray = new int[lllIlIlIl[1]];
                            nArray[ah.lllIlIlIl[0]] = lllIlIlIl[21];
                            if (!ah.llIIIllIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lllIlIlIl[1]];
                            nArray13[ah.lllIlIlIl[0]] = lllIlIlIl[21];
                            if (!ah.llIIIllIllIl(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lllIlIlIl[1]];
                        nArray[ah.lllIlIlIl[0]] = lllIlIlIl[23];
                        if (ah.llIIIllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lllIlIlIl[1]];
                            nArray14[ah.lllIlIlIl[0]] = lllIlIlIl[24];
                            if (ah.llIIIllIllIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lllIlIlIl[1];
                                "".length();
                                if (((0xFF ^ 0x9E) & ~(0xDF ^ 0xBE)) == ((0x86 ^ 0xBF) & ~(0x4D ^ 0x74))) return n3 != 0;
                                return ((0xA1 ^ 0x85) & ~(0xBE ^ 0x9A)) != 0;
                            }
                        }
                    }
                    n3 = lllIlIlIl[0];
                    return n3 != 0;
                }
                if (!ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[7]) || !ah.llIIIllIllIl(ck ? 1 : 0)) return lllIlIlIl[0];
                int[] nArray = new int[lllIlIlIl[1]];
                nArray[ah.lllIlIlIl[0]] = lllIlIlIl[21];
                if (!ah.llIIIllIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lllIlIlIl[1]];
                nArray15[ah.lllIlIlIl[0]] = lllIlIlIl[21];
                if (!ah.llIIIllIllIl(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lllIlIlIl[1]];
            nArray[ah.lllIlIlIl[0]] = lllIlIlIl[15];
            if (ah.llIIIllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lllIlIlIl[1]];
                nArray16[ah.lllIlIlIl[0]] = lllIlIlIl[22];
                if (ah.llIIIllIllIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lllIlIlIl[1]];
                    nArray17[ah.lllIlIlIl[0]] = lllIlIlIl[22];
                    if (ah.llIIIlllIIlI(Bank.getFirst((int[])nArray17).getQuantity(), lllIlIlIl[18])) {
                        int[] nArray18 = new int[lllIlIlIl[1]];
                        nArray18[ah.lllIlIlIl[0]] = lllIlIlIl[23];
                        if (ah.llIIIllIllIl(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lllIlIlIl[1]];
                            nArray19[ah.lllIlIlIl[0]] = lllIlIlIl[24];
                            if (ah.llIIIllIllIl(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lllIlIlIl[1];
                                "".length();
                                if ("   ".length() <= "   ".length()) return n2 != 0;
                                return ((0x71 ^ 0x3F ^ (0x28 ^ 0x58)) & (6 + 63 - 34 + 214 ^ 96 + 85 - -18 + 0 ^ -" ".length())) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lllIlIlIl[0];
        return n2 != 0;
    }

    @Override
    public boolean ae() {
        return lllIlIlIl[0];
    }

    private static String llIIIllIlIIl(String llIlllIlIIlII, String llIlllIlIIIll) {
        llIlllIlIIlII = new String(Base64.getDecoder().decode(llIlllIlIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlllIlIIlll = new StringBuilder();
        char[] llIlllIlIIllI = llIlllIlIIIll.toCharArray();
        int llIlllIlIIlIl = lllIlIlIl[0];
        char[] llIlllIIlllll = llIlllIlIIlII.toCharArray();
        int llIlllIIllllI = llIlllIIlllll.length;
        int llIlllIIlllIl = lllIlIlIl[0];
        while (ah.llIIIllIlllI(llIlllIIlllIl, llIlllIIllllI)) {
            char llIlllIlIlIlI = llIlllIIlllll[llIlllIIlllIl];
            llIlllIlIIlll.append((char)(llIlllIlIlIlI ^ llIlllIlIIllI[llIlllIlIIlIl % llIlllIlIIllI.length]));
            "".length();
            ++llIlllIlIIlIl;
            ++llIlllIIlllIl;
            "".length();
            if (" ".length() >= 0) continue;
            return null;
        }
        return String.valueOf(llIlllIlIIlll);
    }

    @Override
    public String ag() {
        return lllIlIlII[lllIlIlIl[73]];
    }

    private static int llIIIlllIlIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static void llIIIllIllII() {
        lllIlIlIl = new int[82];
        ah.lllIlIlIl[0] = (0xB8 ^ 0xB5) & ~(0x61 ^ 0x6C);
        ah.lllIlIlIl[1] = " ".length();
        ah.lllIlIlIl[2] = "  ".length();
        ah.lllIlIlIl[3] = "   ".length();
        ah.lllIlIlIl[4] = 0xFFFFFFC8 & 0x13BF;
        ah.lllIlIlIl[5] = 0x2D ^ 0x28 ^ "   ".length();
        ah.lllIlIlIl[6] = 8 ^ 0xC;
        ah.lllIlIlIl[7] = 0xE ^ 0x39;
        ah.lllIlIlIl[8] = 0xFFFFE63E & 0x1BEF;
        ah.lllIlIlIl[9] = -(0x26 ^ 0x22) & (0xFFFFCFFF & 0x35DF);
        ah.lllIlIlIl[10] = 0xFFFFF23B & 0xFEF;
        ah.lllIlIlIl[11] = -(0xFFFFFBF7 & 0x5439) & (0xFFFFFDFD & 0x5BF6);
        ah.lllIlIlIl[12] = -(0xFFFFEDD9 & 0x7FF7) & (0xFFFFEFFD & Short.MAX_VALUE);
        ah.lllIlIlIl[13] = 0xFFFFCE7A & 0x33AF;
        ah.lllIlIlIl[14] = -(0xFFFFEBEF & 0x7E39) & (0xFFFFFBFE & 0x7FBD);
        ah.lllIlIlIl[15] = -(0xFFFFD4BD & 0x3FC7) & (0xFFFFBEF7 & 0x57BF);
        ah.lllIlIlIl[16] = 0xFFFFB3FF & 0x7D51;
        ah.lllIlIlIl[17] = 0xFFFFDF4D & 0x3FFB;
        ah.lllIlIlIl[18] = 0xFF ^ 0xA0 ^ (0x7D ^ 0x27);
        ah.lllIlIlIl[19] = 0xFFFF81FF & 0x7F7B;
        ah.lllIlIlIl[20] = 108 + 77 - 60 + 11 ^ 57 + 57 - 71 + 102;
        ah.lllIlIlIl[21] = -(0xFFFFDA93 & 0x6FED) & (0xFFFFCFEF & 0x7FFB);
        ah.lllIlIlIl[22] = 0xFFFFA77D & 0x5AAE;
        ah.lllIlIlIl[23] = 0xFFFFEE3B & 0x13F5;
        ah.lllIlIlIl[24] = 0x8D ^ 0xB3;
        ah.lllIlIlIl[25] = 90 + 121 - 76 + 28 ^ 105 + 34 - -48 + 1;
        ah.lllIlIlIl[26] = 83 + 62 - 82 + 97 ^ 106 + 158 - 240 + 143;
        ah.lllIlIlIl[27] = -" ".length();
        ah.lllIlIlIl[28] = 0x89 ^ 0x84 ^ (0x7B ^ 0x53);
        ah.lllIlIlIl[29] = 0x5B ^ 0x27 ^ (0x44 ^ 0x30);
        ah.lllIlIlIl[30] = 0x83 ^ 0xAE;
        ah.lllIlIlIl[31] = 0x14 ^ 0x1D;
        ah.lllIlIlIl[32] = 0x2F ^ 0x30 ^ (0x1F ^ 0xA);
        ah.lllIlIlIl[33] = 0x6F ^ 0x19 ^ (0x3B ^ 0x46);
        ah.lllIlIlIl[34] = -(0xFFFFF9AA & 0x76F7) & (0xFFFFFFFB & 0x7CFF);
        ah.lllIlIlIl[35] = 0xFFFF9DBF & 0x6FDF;
        ah.lllIlIlIl[36] = 0x9E ^ 0x85 ^ (0x77 ^ 0x60);
        ah.lllIlIlIl[37] = 0x8A ^ 0xB5;
        ah.lllIlIlIl[38] = 0x52 ^ 0x5F;
        ah.lllIlIlIl[39] = 0xFFFFFBE9 & 0x556;
        ah.lllIlIlIl[40] = 0xFFFFC75A & 0x3AB7;
        ah.lllIlIlIl[41] = -(0xFFFFFB77 & 0x668C) & (0xFFFFFFBF & 0x6FEF);
        ah.lllIlIlIl[42] = 0x95 ^ 0x9B;
        ah.lllIlIlIl[43] = 0x7C ^ 0x73;
        ah.lllIlIlIl[44] = 0x4B ^ 0x5B;
        ah.lllIlIlIl[45] = 0xFE ^ 0xC1 ^ (0x6C ^ 0x42);
        ah.lllIlIlIl[46] = 0xFD ^ 0xC3 ^ (0x18 ^ 0x34);
        ah.lllIlIlIl[47] = 0xFFFF8DFD & 0x7767;
        ah.lllIlIlIl[48] = 0xAC ^ 0xBF;
        ah.lllIlIlIl[49] = 0xFFFFC534 & 0x3BDF;
        ah.lllIlIlIl[50] = 0xFFFFBFDF & 0x4271;
        ah.lllIlIlIl[51] = 0x11 ^ 7 ^ (0x20 ^ 0x2C);
        ah.lllIlIlIl[52] = 0xBF ^ 0xAB;
        ah.lllIlIlIl[53] = 139 + 81 - 174 + 104 ^ 56 + 83 - 116 + 108;
        ah.lllIlIlIl[54] = 69 + 150 - 130 + 112;
        ah.lllIlIlIl[55] = 92 + 26 - 101 + 113 ^ 95 + 97 - 94 + 50;
        ah.lllIlIlIl[56] = 0xBE ^ 0x87 ^ (0x93 ^ 0xBD);
        ah.lllIlIlIl[57] = 26 + 40 - -1 + 64 ^ 62 + 141 - 96 + 48;
        ah.lllIlIlIl[58] = -(0xFFFFBFFF & 0x5418) & (0xFFFF97FF & Short.MAX_VALUE);
        ah.lllIlIlIl[59] = 38 + 55 - 77 + 154;
        ah.lllIlIlIl[60] = 0xFFFFFFFC & 0xFA3;
        ah.lllIlIlIl[61] = -(0xFFFFF75E & 0x78AF) & (0xFFFFFFFD & 0x77DF);
        ah.lllIlIlIl[62] = 0xFFFFDFBE & 0x2BF9;
        ah.lllIlIlIl[63] = -(0xFFFFFC3B & 0x7E5) & (0xFFFFF4FD & 0x3FF6);
        ah.lllIlIlIl[64] = -(0xFFFFDFDF & 0x2162) & (0xFFFFBDDF & 0x7FED);
        ah.lllIlIlIl[65] = 0xE8 ^ 0x90;
        ah.lllIlIlIl[66] = (0x47 ^ 0x1E) + (30 + 35 - 47 + 126) - (147 + 123 - 161 + 46) + (0x22 ^ 0x6A);
        ah.lllIlIlIl[67] = 0xFFFFFEB9 & 0x3BDE;
        ah.lllIlIlIl[68] = 1 ^ 0x65;
        ah.lllIlIlIl[69] = -(0xFFFFE129 & 0x5EF7) & (0xFFFFFFEF & 0x6EFC);
        ah.lllIlIlIl[70] = 0xFFFFE7FF & 0x79A8;
        ah.lllIlIlIl[71] = -(0xFFFFEEBB & 0x71FD) & (0xFFFFFFFF & Short.MAX_VALUE);
        ah.lllIlIlIl[72] = 0xFFFF9BB7 & 0x67CC;
        ah.lllIlIlIl[73] = 0x29 ^ 0x50 ^ (0x1E ^ 0x7C);
        ah.lllIlIlIl[74] = 0x33 ^ 0x78;
        ah.lllIlIlIl[75] = 0x9D ^ 0xB8 ^ (0x26 ^ 0x1F);
        ah.lllIlIlIl[76] = 0x47 ^ 0xB ^ (5 ^ 0x54);
        ah.lllIlIlIl[77] = 0xFFFFFBCF & 0xFFE;
        ah.lllIlIlIl[78] = -(0xFFFFEFBD & 0x7347) & (0xFFFFFFFF & 0x6FE7);
        ah.lllIlIlIl[79] = -(0xFFFFFDAD & 0x665B) & (0xFFFFEFFF & 0x7FDF);
        ah.lllIlIlIl[80] = 0xFFFF8DFB & 0x7EED;
        ah.lllIlIlIl[81] = 0xA2 ^ 0xBC;
    }

    private static boolean llIIIlllIlII(Object object) {
        return object == null;
    }

    private static boolean llIIIllIllIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIlllIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void Q() {
        d llIllllIllIII;
        Object llIllllIllIIl;
        if (ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[7])) {
            int[] nArray = new int[lllIlIlIl[1]];
            nArray[ah.lllIlIlIl[0]] = lllIlIlIl[15];
            if (ah.llIIIllIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new d(lllIlIlIl[15], lllIlIlIl[58], lllIlIlIl[59]);
                bx.add(d2);
                "".length();
            }
            int[] nArray2 = new int[lllIlIlIl[1]];
            nArray2[ah.lllIlIlIl[0]] = lllIlIlIl[8];
            if (ah.llIIIllIllll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                llIllllIllIIl = new d(lllIlIlIl[8], lllIlIlIl[60], lllIlIlIl[5]);
                bx.add((d)llIllllIllIIl);
                "".length();
            }
            int[] nArray3 = new int[lllIlIlIl[1]];
            nArray3[ah.lllIlIlIl[0]] = lllIlIlIl[10];
            if (ah.llIIIllIllll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                llIllllIllIIl = new d(lllIlIlIl[10], lllIlIlIl[61], lllIlIlIl[5]);
                bx.add((d)llIllllIllIIl);
                "".length();
            }
            int[] nArray4 = new int[lllIlIlIl[1]];
            nArray4[ah.lllIlIlIl[0]] = lllIlIlIl[12];
            if (ah.llIIIllIllll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                llIllllIllIIl = new d(lllIlIlIl[12], lllIlIlIl[62], lllIlIlIl[5]);
                bx.add((d)llIllllIllIIl);
                "".length();
            }
            int[] nArray5 = new int[lllIlIlIl[1]];
            nArray5[ah.lllIlIlIl[0]] = lllIlIlIl[13];
            if (ah.llIIIllIllll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                llIllllIllIIl = new d(lllIlIlIl[13], lllIlIlIl[4], lllIlIlIl[5]);
                bx.add((d)llIllllIllIIl);
                "".length();
            }
            int[] nArray6 = new int[lllIlIlIl[1]];
            nArray6[ah.lllIlIlIl[0]] = lllIlIlIl[47];
            if (ah.llIIIllIllll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                llIllllIllIIl = new d(lllIlIlIl[47], lllIlIlIl[1], e.c(lllIlIlIl[63], lllIlIlIl[64]));
                bx.add((d)llIllllIllIIl);
                "".length();
            }
        }
        if (ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[7])) {
            int[] nArray = new int[lllIlIlIl[1]];
            nArray[ah.lllIlIlIl[0]] = lllIlIlIl[23];
            if (ah.llIIIllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[lllIlIlIl[1]];
                nArray7[ah.lllIlIlIl[0]] = lllIlIlIl[23];
                if (ah.llIIIllIlllI(Bank.getFirst((int[])nArray7).getQuantity(), lllIlIlIl[62])) {
                    int[] nArray8 = new int[lllIlIlIl[1]];
                    nArray8[ah.lllIlIlIl[0]] = lllIlIlIl[23];
                    llIllllIllIIl = new d(lllIlIlIl[23], lllIlIlIl[62] - Bank.getFirst((int[])nArray8).getQuantity(), lllIlIlIl[65]);
                    bx.add((d)llIllllIllIIl);
                    "".length();
                }
            }
            int[] nArray9 = new int[lllIlIlIl[1]];
            nArray9[ah.lllIlIlIl[0]] = lllIlIlIl[23];
            if (ah.llIIIllIllll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                llIllllIllIIl = new d(lllIlIlIl[23], lllIlIlIl[62], lllIlIlIl[65]);
                bx.add((d)llIllllIllIIl);
                "".length();
            }
            int[] nArray10 = new int[lllIlIlIl[1]];
            nArray10[ah.lllIlIlIl[0]] = lllIlIlIl[24];
            if (ah.llIIIllIllIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[lllIlIlIl[1]];
                nArray11[ah.lllIlIlIl[0]] = lllIlIlIl[24];
                if (ah.llIIIllIlllI(Bank.getFirst((int[])nArray11).getQuantity(), lllIlIlIl[62])) {
                    int[] nArray12 = new int[lllIlIlIl[1]];
                    nArray12[ah.lllIlIlIl[0]] = lllIlIlIl[24];
                    llIllllIllIIl = new d(lllIlIlIl[24], lllIlIlIl[62] - Bank.getFirst((int[])nArray12).getQuantity(), lllIlIlIl[66]);
                    bx.add((d)llIllllIllIIl);
                    "".length();
                }
            }
            int[] nArray13 = new int[lllIlIlIl[1]];
            nArray13[ah.lllIlIlIl[0]] = lllIlIlIl[24];
            if (ah.llIIIllIllll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                llIllllIllIIl = new d(lllIlIlIl[24], lllIlIlIl[62], lllIlIlIl[66]);
                bx.add((d)llIllllIllIIl);
                "".length();
            }
            int[] nArray14 = new int[lllIlIlIl[1]];
            nArray14[ah.lllIlIlIl[0]] = lllIlIlIl[21];
            if (ah.llIIIllIllll(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[lllIlIlIl[1]];
                nArray15[ah.lllIlIlIl[0]] = lllIlIlIl[21];
                if (ah.llIIIllIllll(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    llIllllIllIIl = new d(lllIlIlIl[21], lllIlIlIl[1], lllIlIlIl[67]);
                    bx.add((d)llIllllIllIIl);
                    "".length();
                }
            }
            if (ah.llIIIllIllIl(ck ? 1 : 0)) {
                int[] nArray16 = new int[lllIlIlIl[1]];
                nArray16[ah.lllIlIlIl[0]] = lllIlIlIl[15];
                if (ah.llIIIllIllIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lllIlIlIl[1]];
                    nArray17[ah.lllIlIlIl[0]] = lllIlIlIl[15];
                    if (ah.llIIIllIlllI(Bank.getFirst((int[])nArray17).getQuantity(), lllIlIlIl[62])) {
                        int[] nArray18 = new int[lllIlIlIl[1]];
                        nArray18[ah.lllIlIlIl[0]] = lllIlIlIl[15];
                        llIllllIllIIl = new d(lllIlIlIl[15], lllIlIlIl[62] - Bank.getFirst((int[])nArray18).getQuantity(), lllIlIlIl[59]);
                        bx.add((d)llIllllIllIIl);
                        "".length();
                    }
                }
                int[] nArray19 = new int[lllIlIlIl[1]];
                nArray19[ah.lllIlIlIl[0]] = lllIlIlIl[15];
                if (ah.llIIIllIllll(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    llIllllIllIIl = new d(lllIlIlIl[15], lllIlIlIl[62], lllIlIlIl[59]);
                    bx.add((d)llIllllIllIIl);
                    "".length();
                }
                int[] nArray20 = new int[lllIlIlIl[1]];
                nArray20[ah.lllIlIlIl[0]] = lllIlIlIl[22];
                if (ah.llIIIllIllIl(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[lllIlIlIl[1]];
                    nArray21[ah.lllIlIlIl[0]] = lllIlIlIl[22];
                    if (ah.llIIIllIlllI(Bank.getFirst((int[])nArray21).getQuantity(), lllIlIlIl[67])) {
                        int[] nArray22 = new int[lllIlIlIl[1]];
                        nArray22[ah.lllIlIlIl[0]] = lllIlIlIl[22];
                        llIllllIllIIl = new d(lllIlIlIl[22], lllIlIlIl[67] - Bank.getFirst((int[])nArray22).getQuantity(), lllIlIlIl[5]);
                        bx.add((d)llIllllIllIIl);
                        "".length();
                    }
                }
                int[] nArray23 = new int[lllIlIlIl[1]];
                nArray23[ah.lllIlIlIl[0]] = lllIlIlIl[22];
                if (ah.llIIIllIllll(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    llIllllIllIIl = new d(lllIlIlIl[22], lllIlIlIl[67], lllIlIlIl[5]);
                    bx.add((d)llIllllIllIIl);
                    "".length();
                }
            }
        }
        int[] nArray = new int[lllIlIlIl[1]];
        nArray[ah.lllIlIlIl[0]] = lllIlIlIl[19];
        if (ah.llIIIllIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
            llIllllIllIIl = new d(lllIlIlIl[19], lllIlIlIl[68], lllIlIlIl[39]);
            bx.add((d)llIllllIllIIl);
            "".length();
        }
        if (ah.llIIIllIllll(Bank.contains(llIllllIllIIl = item -> item.getName().toLowerCase().contains(lllIlIlII[lllIlIlIl[75]])) ? 1 : 0)) {
            llIllllIllIII = new d(lllIlIlIl[69], lllIlIlIl[18], lllIlIlIl[70]);
            bx.add(llIllllIllIII);
            "".length();
        }
        int[] nArray24 = new int[lllIlIlIl[1]];
        nArray24[ah.lllIlIlIl[0]] = lllIlIlIl[71];
        if (ah.llIIIllIllll(Bank.contains((int[])nArray24) ? 1 : 0)) {
            llIllllIllIII = new d(lllIlIlIl[71], lllIlIlIl[32], lllIlIlIl[72]);
            bx.add(llIllllIllIII);
            "".length();
        }
        int[] nArray25 = new int[lllIlIlIl[1]];
        nArray25[ah.lllIlIlIl[0]] = lllIlIlIl[17];
        if (ah.llIIIllIllll(Bank.contains((int[])nArray25) ? 1 : 0)) {
            llIllllIllIII = new d(lllIlIlIl[17], lllIlIlIl[32], lllIlIlIl[72]);
            bx.add(llIllllIllIII);
            "".length();
        }
    }

    @Override
    public int af() {
        try {
            ah.ak();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (null != null) {
            return (" ".length() ^ (0x18 ^ 0x3D)) & (19 + 83 - 73 + 112 ^ 63 + 153 - 151 + 104 ^ -" ".length());
        }
        return lllIlIlIl[68];
    }

    private static boolean llIIIlllIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIIlllIllI(int n2) {
        return n2 < 0;
    }

    public static void al() {
        if (ah.llIIIllIllIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (ah.llIIIllIllll(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllIlIlII[lllIlIlIl[42]];
            Movement.walkTo((WorldPoint)cm);
            "".length();
            Time.sleepTicks((int)lllIlIlIl[1]);
            "".length();
        }
        if (ah.llIIIllIllIl(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllIlIlII[lllIlIlIl[43]];
            ah.am();
        }
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[74])) {
            bl = lllIlIlIl[1];
            "".length();
            if ((0x6E ^ 0x6B) <= 0) {
                return ((0x14 ^ 0x39) & ~(0x81 ^ 0xAC)) != 0;
            }
        } else {
            bl = lllIlIlIl[0];
        }
        return bl;
    }

    public static void ak() {
        if (ah.llIIIllIllIl(bv ? 1 : 0)) {
            AccBuilderGWD.c = lllIlIlII[lllIlIlIl[0]];
            b.a(bx);
            if (ah.llIIIllIlllI(bx.size(), lllIlIlIl[1])) {
                System.out.println(lllIlIlII[lllIlIlIl[1]]);
                bv = lllIlIlIl[0];
            }
        }
        if (ah.llIIIllIllll(bv ? 1 : 0)) {
            BankLocation llIlllllIIIlI;
            if (ah.llIIIllIllll(ah.an() ? 1 : 0)) {
                llIlllllIIIlI = BankLocation.getNearest();
                if (ah.llIIIlllIIII(llIlllllIIIlI) && ah.llIIIllIllll(llIlllllIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllIlIlII[lllIlIlIl[2]];
                    a.a(llIlllllIIIlI);
                }
                if (ah.llIIIlllIIII(llIlllllIIIlI) && ah.llIIIllIllIl(llIlllllIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllIlIlII[lllIlIlIl[3]];
                    if (ah.llIIIllIllll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lllIlIlIl[4]);
                        "".length();
                        Time.sleepTicks((int)lllIlIlIl[5]);
                        "".length();
                    }
                    if (ah.llIIIllIllIl(Bank.isOpen() ? 1 : 0)) {
                        if (ah.llIIIlllIIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lllIlIlIl[6]);
                            "".length();
                        }
                        while (ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[7]) && ah.llIIIllIllll(H.bT() ? 1 : 0)) {
                            H.bR();
                            Time.sleepTicks((int)lllIlIlIl[1]);
                            "".length();
                            "".length();
                            if (((0x23 ^ 0x30) & ~(0x4B ^ 0x58)) < " ".length()) continue;
                            return;
                        }
                        if (ah.llIIIllIllll(ah.ao() ? 1 : 0)) {
                            ah.Q();
                            System.out.println(lllIlIlII[lllIlIlIl[6]]);
                            bv = lllIlIlIl[1];
                            return;
                        }
                        if (ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[7])) {
                            int[] nArray = new int[lllIlIlIl[1]];
                            nArray[ah.lllIlIlIl[0]] = lllIlIlIl[8];
                            if (ah.llIIIllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lllIlIlIl[1]];
                                nArray2[ah.lllIlIlIl[0]] = lllIlIlIl[8];
                                if (ah.llIIIllIlllI(Inventory.getCount((int[])nArray2), lllIlIlIl[1])) {
                                    Bank.withdraw((int)lllIlIlIl[8], (int)lllIlIlIl[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIlIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lllIlIlIl[1]];
                                        nArray[ah.lllIlIlIl[0]] = lllIlIlIl[8];
                                        if (ah.llIIIlllIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = lllIlIlIl[1];
                                            "".length();
                                            if (-(9 ^ 0x7C ^ (0xDA ^ 0xAB)) > 0) {
                                                return ((63 + 27 - -27 + 89 ^ 95 + 152 - 200 + 109) & ((0xA6 ^ 0xB6) & ~(0x5F ^ 0x4F) ^ (0xD1 ^ 0x83) ^ -" ".length())) != 0;
                                            }
                                        } else {
                                            bl = lllIlIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lllIlIlIl[4]);
                                    "".length();
                                }
                            }
                            int[] nArray3 = new int[lllIlIlIl[1]];
                            nArray3[ah.lllIlIlIl[0]] = lllIlIlIl[10];
                            if (ah.llIIIllIllIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lllIlIlIl[1]];
                                nArray4[ah.lllIlIlIl[0]] = lllIlIlIl[10];
                                if (ah.llIIIllIlllI(Inventory.getCount((int[])nArray4), lllIlIlIl[1])) {
                                    Bank.withdraw((int)lllIlIlIl[10], (int)lllIlIlIl[11], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIlIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lllIlIlIl[1]];
                                        nArray[ah.lllIlIlIl[0]] = lllIlIlIl[10];
                                        if (ah.llIIIlllIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = lllIlIlIl[1];
                                            "".length();
                                            if (null != null) {
                                                return ((0x16 ^ 0x27 ^ (5 ^ 0x54)) & (0x58 ^ 0x7F ^ (0x38 ^ 0x7F) ^ -" ".length())) != 0;
                                            }
                                        } else {
                                            bl = lllIlIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lllIlIlIl[4]);
                                    "".length();
                                }
                            }
                            int[] nArray5 = new int[lllIlIlIl[1]];
                            nArray5[ah.lllIlIlIl[0]] = lllIlIlIl[12];
                            if (ah.llIIIllIllIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lllIlIlIl[1]];
                                nArray6[ah.lllIlIlIl[0]] = lllIlIlIl[12];
                                if (ah.llIIIllIlllI(Inventory.getCount((int[])nArray6), lllIlIlIl[1])) {
                                    Bank.withdraw((int)lllIlIlIl[12], (int)lllIlIlIl[11], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIlIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lllIlIlIl[1]];
                                        nArray[ah.lllIlIlIl[0]] = lllIlIlIl[12];
                                        if (ah.llIIIlllIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = lllIlIlIl[1];
                                            "".length();
                                            if (" ".length() <= -" ".length()) {
                                                return ((0xBB ^ 0xAF ^ (0xD1 ^ 0x89)) & (0x48 ^ 0x54 ^ (0x91 ^ 0xC1) ^ -" ".length())) != 0;
                                            }
                                        } else {
                                            bl = lllIlIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lllIlIlIl[4]);
                                    "".length();
                                }
                            }
                            int[] nArray7 = new int[lllIlIlIl[1]];
                            nArray7[ah.lllIlIlIl[0]] = lllIlIlIl[13];
                            if (ah.llIIIllIllIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lllIlIlIl[1]];
                                nArray8[ah.lllIlIlIl[0]] = lllIlIlIl[13];
                                if (ah.llIIIllIlllI(Inventory.getCount((int[])nArray8), lllIlIlIl[1])) {
                                    Bank.withdraw((int)lllIlIlIl[13], (int)lllIlIlIl[14], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIlIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lllIlIlIl[1]];
                                        nArray[ah.lllIlIlIl[0]] = lllIlIlIl[13];
                                        if (ah.llIIIlllIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = lllIlIlIl[1];
                                            "".length();
                                            if (null != null) {
                                                return ((0xBD ^ 0xB6 ^ (0x2F ^ 0x79)) & (0x29 ^ 0x57 ^ (0x2F ^ 0xC) ^ -" ".length())) != 0;
                                            }
                                        } else {
                                            bl = lllIlIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lllIlIlIl[4]);
                                    "".length();
                                }
                            }
                            int[] nArray9 = new int[lllIlIlIl[1]];
                            nArray9[ah.lllIlIlIl[0]] = lllIlIlIl[15];
                            if (ah.llIIIllIllIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lllIlIlIl[1]];
                                nArray10[ah.lllIlIlIl[0]] = lllIlIlIl[15];
                                if (ah.llIIIllIlllI(Inventory.getCount((int[])nArray10), lllIlIlIl[1])) {
                                    Bank.withdraw((int)lllIlIlIl[15], (int)lllIlIlIl[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIlIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lllIlIlIl[1]];
                                        nArray[ah.lllIlIlIl[0]] = lllIlIlIl[15];
                                        if (ah.llIIIlllIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = lllIlIlIl[1];
                                            "".length();
                                            if (-"   ".length() >= 0) {
                                                return ((0xEF ^ 0xB0 ^ (0x26 ^ 0x2C)) & (0x58 ^ 0x73 ^ (0x16 ^ 0x68) ^ -" ".length())) != 0;
                                            }
                                        } else {
                                            bl = lllIlIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lllIlIlIl[4]);
                                    "".length();
                                }
                            }
                            int[] nArray11 = new int[lllIlIlIl[1]];
                            nArray11[ah.lllIlIlIl[0]] = lllIlIlIl[16];
                            if (ah.llIIIllIllIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[lllIlIlIl[1]];
                                nArray12[ah.lllIlIlIl[0]] = lllIlIlIl[16];
                                if (ah.llIIIllIllll(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    Bank.withdraw((int)lllIlIlIl[16], (int)lllIlIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIlIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[lllIlIlIl[1]];
                                        nArray[ah.lllIlIlIl[0]] = lllIlIlIl[16];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)lllIlIlIl[4]);
                                    "".length();
                                }
                            }
                            Bank.withdraw((int)lllIlIlIl[17], (int)lllIlIlIl[18], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            int[] nArray13 = new int[lllIlIlIl[1]];
                            nArray13[ah.lllIlIlIl[0]] = lllIlIlIl[19];
                            if (ah.llIIIllIllIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                int[] nArray14 = new int[lllIlIlIl[1]];
                                nArray14[ah.lllIlIlIl[0]] = lllIlIlIl[19];
                                if (ah.llIIIllIlllI(Inventory.getCount((int[])nArray14), lllIlIlIl[1]) && ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[20])) {
                                    Bank.withdrawAll((int)lllIlIlIl[19], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIlIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lllIlIlIl[1]];
                                        nArray[ah.lllIlIlIl[0]] = lllIlIlIl[19];
                                        if (ah.llIIIlllIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = lllIlIlIl[1];
                                            "".length();
                                            if (-(0x36 ^ 0x32 ^ (0x3F ^ 0x28) & ~(0xAA ^ 0xBD)) >= 0) {
                                                return ((97 + 243 - 215 + 119 ^ 62 + 145 - 86 + 40) & (0x6E ^ 0x22 ^ (0x19 ^ 0) ^ -" ".length())) != 0;
                                            }
                                        } else {
                                            bl = lllIlIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lllIlIlIl[4]);
                                    "".length();
                                }
                            }
                        }
                        if (ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[7])) {
                            int[] nArray = new int[lllIlIlIl[1]];
                            nArray[ah.lllIlIlIl[0]] = lllIlIlIl[21];
                            if (ah.llIIIllIllll(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)lllIlIlIl[21], (int)lllIlIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lllIlIlIl[1]);
                                "".length();
                            }
                            if (ah.llIIIllIllIl(ck ? 1 : 0)) {
                                Bank.withdrawAll((int)lllIlIlIl[22], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lllIlIlIl[1]);
                                "".length();
                                Bank.withdrawAll((int)lllIlIlIl[15], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lllIlIlIl[1]);
                                "".length();
                            }
                            Time.sleepTicks((int)lllIlIlIl[3]);
                            "".length();
                            Bank.withdrawAll((int)lllIlIlIl[23], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lllIlIlIl[1]);
                            "".length();
                            Bank.withdrawAll((int)lllIlIlIl[24], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)lllIlIlIl[1]);
                            "".length();
                        }
                    }
                }
            }
            if (ah.llIIIllIllIl(ah.an() ? 1 : 0)) {
                if (ah.llIIIllIllIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[20])) {
                    if (ah.llIIIllIllll(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lllIlIlII[lllIlIlIl[18]];
                        Movement.walkTo((WorldPoint)cm);
                        "".length();
                        Time.sleepTicks((int)lllIlIlIl[1]);
                        "".length();
                    }
                    if (ah.llIIIllIllIl(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lllIlIlII[lllIlIlIl[5]];
                        ah.am();
                    }
                }
                if (ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[20]) && ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[25])) {
                    AccBuilderGWD.c = lllIlIlII[lllIlIlIl[26]];
                    if (ah.llIIIlllIIll(Players.getLocal().getAnimation(), lllIlIlIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks((int)lllIlIlIl[1]);
                        "".length();
                    }
                }
                if (ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[25]) && ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[28])) {
                    AccBuilderGWD.c = lllIlIlII[lllIlIlIl[29]];
                    if (ah.llIIIlllIIll(Players.getLocal().getAnimation(), lllIlIlIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)lllIlIlIl[1]);
                        "".length();
                    }
                }
                if (ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[28]) && ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[30])) {
                    AccBuilderGWD.c = lllIlIlII[lllIlIlIl[31]];
                    if (ah.llIIIlllIIll(Players.getLocal().getAnimation(), lllIlIlIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)lllIlIlIl[1]);
                        "".length();
                    }
                }
                if (ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[30]) && ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[7])) {
                    AccBuilderGWD.c = lllIlIlII[lllIlIlIl[32]];
                    if (ah.llIIIlllIIll(Players.getLocal().getAnimation(), lllIlIlIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)lllIlIlIl[1]);
                        "".length();
                    }
                }
                if (ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[7])) {
                    int llIlllllIIIII;
                    AccBuilderGWD.c = lllIlIlII[lllIlIlIl[33]];
                    if (ah.llIIIlllIlII(cn)) {
                        cn = new WorldPoint(lllIlIlIl[34] + e.c(lllIlIlIl[1], lllIlIlIl[6]), lllIlIlIl[35], lllIlIlIl[0]);
                    }
                    int[] nArray = new int[lllIlIlIl[1]];
                    nArray[ah.lllIlIlIl[0]] = lllIlIlIl[21];
                    if (ah.llIIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray15 = new int[lllIlIlIl[1]];
                        nArray15[ah.lllIlIlIl[0]] = lllIlIlIl[21];
                        if (ah.llIIIllIllll(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[lllIlIlIl[1]];
                            nArray16[ah.lllIlIlIl[0]] = lllIlIlIl[21];
                            Inventory.getFirst((int[])nArray16).interact(lllIlIlII[lllIlIlIl[36]]);
                            Time.sleepTicks((int)lllIlIlIl[1]);
                            "".length();
                        }
                    }
                    if (ah.llIIIllIllIl(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[lllIlIlIl[1]];
                    nArray17[ah.lllIlIlIl[0]] = lllIlIlIl[23];
                    llIlllllIIIlI = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[lllIlIlIl[1]];
                    nArray18[ah.lllIlIlIl[0]] = lllIlIlIl[37];
                    Item llIlllllIIIIl = Inventory.getFirst((int[])nArray18);
                    if (ah.llIIIllIllll(ck ? 1 : 0) && ah.llIIIlllIIII(cn)) {
                        if (ah.llIIIllIllll(Players.getLocal().getWorldLocation().equals((Object)cn) ? 1 : 0)) {
                            AccBuilderGWD.c = lllIlIlII[lllIlIlIl[38]];
                            Movement.walkTo((WorldPoint)cn);
                            "".length();
                            Time.sleepTicks((int)lllIlIlIl[1]);
                            "".length();
                        }
                        if (ah.llIIIllIllIl(Players.getLocal().getWorldLocation().equals((Object)cn) ? 1 : 0) && ah.llIIIlllIIII(llIlllllIIIlI) && ah.llIIIlllIIII(llIlllllIIIIl)) {
                            llIlllllIIIII = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)llIlllllIIIIl);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (ah.llIIIllllIII(Skills.getExperience((Skill)Skill.MAGIC), llIlllllIIIII)) {
                                    bl = lllIlIlIl[1];
                                    "".length();
                                    if ("  ".length() == 0) {
                                        return ((86 + 149 - 222 + 156 ^ 41 + 103 - 139 + 142) & (149 + 82 - 122 + 46 ^ 149 + 28 - 130 + 114 ^ -" ".length())) != 0;
                                    }
                                } else {
                                    bl = lllIlIlIl[0];
                                }
                                return bl;
                            }, (int)lllIlIlIl[9]);
                            "".length();
                            Time.sleep((long)e.c(lllIlIlIl[39], lllIlIlIl[40]));
                            "".length();
                        }
                    }
                    if (ah.llIIIllIllIl(ck ? 1 : 0)) {
                        if (ah.llIIIlllIIII(llIlllllIIIlI) && ah.llIIIlllIIII(llIlllllIIIIl) && ah.llIIIlllIIll(Players.getLocal().getAnimation(), lllIlIlIl[27])) {
                            llIlllllIIIII = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)llIlllllIIIIl);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (ah.llIIIllllIII(Skills.getExperience((Skill)Skill.MAGIC), llIlllllIIIII)) {
                                    bl = lllIlIlIl[1];
                                    "".length();
                                    if (null != null) {
                                        return ((0xBB ^ 0x8F) & ~(0x68 ^ 0x5C)) != 0;
                                    }
                                } else {
                                    bl = lllIlIlIl[0];
                                }
                                return bl;
                            }, (int)lllIlIlIl[9]);
                            "".length();
                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (ah.llIIIlllIIll(Players.getLocal().getAnimation(), lllIlIlIl[27])) {
                                bl = lllIlIlIl[1];
                                "".length();
                                if (null != null) {
                                    return ((0x41 ^ 0x22) & ~(0x4A ^ 0x29)) != 0;
                                }
                            } else {
                                bl = lllIlIlIl[0];
                            }
                            return bl;
                        }, (int)lllIlIlIl[41]);
                        "".length();
                    }
                }
            }
        }
    }

    public static void aq() {
        if (ah.llIIIlllIIII(Widgets.get((int)lllIlIlIl[50], (int)lllIlIlIl[51]))) {
            AccBuilderGWD.c = lllIlIlII[lllIlIlIl[52]];
            Widgets.get((int)lllIlIlIl[50], (int)lllIlIlIl[51]).interact(lllIlIlII[lllIlIlIl[53]]);
            Time.sleepTicks((int)lllIlIlIl[6]);
            "".length();
        }
        if (ah.llIIIlllIlII(Widgets.get((int)lllIlIlIl[50], (int)lllIlIlIl[51])) && ah.llIIIllIllll(Widgets.get((int)lllIlIlIl[54]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)lllIlIlIl[1]);
            "".length();
            if (ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[18])) {
                Widgets.get((int)lllIlIlIl[54], (int)lllIlIlIl[1]).getChild(lllIlIlIl[1]).interact(lllIlIlII[lllIlIlIl[55]]);
            }
            if (ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[31]) && ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[18])) {
                Widgets.get((int)lllIlIlIl[54], (int)lllIlIlIl[1]).getChild(lllIlIlIl[2]).interact(lllIlIlII[lllIlIlIl[56]]);
            }
            if (ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[31]) && ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[38])) {
                Widgets.get((int)lllIlIlIl[54], (int)lllIlIlIl[1]).getChild(lllIlIlIl[3]).interact(lllIlIlII[lllIlIlIl[57]]);
            }
            if (ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[31])) {
                int[] nArray = new int[lllIlIlIl[1]];
                nArray[ah.lllIlIlIl[0]] = lllIlIlIl[13];
                if (ah.llIIIllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lllIlIlIl[54], (int)lllIlIlIl[1]).getChild(lllIlIlIl[3]).interact(lllIlIlII[lllIlIlIl[20]]);
                }
            }
            if (ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[38])) {
                int[] nArray = new int[lllIlIlIl[1]];
                nArray[ah.lllIlIlIl[0]] = lllIlIlIl[13];
                if (ah.llIIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lllIlIlIl[54], (int)lllIlIlIl[1]).getChild(lllIlIlIl[6]).interact(lllIlIlII[lllIlIlIl[51]]);
                }
            }
            Time.sleepTicks((int)lllIlIlIl[1]);
            "".length();
        }
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
                                                    if (!ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[20])) break block19;
                                                    int[] nArray = new int[lllIlIlIl[1]];
                                                    nArray[ah.lllIlIlIl[0]] = lllIlIlIl[8];
                                                    if (!ah.llIIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lllIlIlIl[1]];
                                                    nArray2[ah.lllIlIlIl[0]] = lllIlIlIl[12];
                                                    if (!ah.llIIIllIllIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lllIlIlIl[1]];
                                                    nArray3[ah.lllIlIlIl[0]] = lllIlIlIl[10];
                                                    if (!ah.llIIIllIllIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lllIlIlIl[1]];
                                                    nArray4[ah.lllIlIlIl[0]] = lllIlIlIl[13];
                                                    if (!ah.llIIIllIllIl(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lllIlIlIl[1]];
                                                    nArray5[ah.lllIlIlIl[0]] = lllIlIlIl[19];
                                                    if (!ah.llIIIllIllIl(Inventory.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lllIlIlIl[1]];
                                                    nArray6[ah.lllIlIlIl[0]] = lllIlIlIl[47];
                                                    if (!ah.llIIIllIllll(Inventory.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lllIlIlIl[1]];
                                                    nArray7[ah.lllIlIlIl[0]] = lllIlIlIl[47];
                                                    if (!ah.llIIIllIllIl(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lllIlIlIl[1];
                                                "".length();
                                                if (" ".length() < "   ".length()) return n5 != 0;
                                                return ((0x7D ^ 0x4C) & ~(0x20 ^ 0x11)) != 0;
                                            }
                                            n5 = lllIlIlIl[0];
                                            return n5 != 0;
                                        }
                                        if (!ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[20]) || !ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[7])) break block22;
                                        int[] nArray = new int[lllIlIlIl[1]];
                                        nArray[ah.lllIlIlIl[0]] = lllIlIlIl[12];
                                        if (!ah.llIIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lllIlIlIl[1]];
                                        nArray8[ah.lllIlIlIl[0]] = lllIlIlIl[10];
                                        if (!ah.llIIIllIllIl(Inventory.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lllIlIlIl[1]];
                                        nArray9[ah.lllIlIlIl[0]] = lllIlIlIl[13];
                                        if (!ah.llIIIllIllIl(Inventory.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lllIlIlIl[1]];
                                        nArray10[ah.lllIlIlIl[0]] = lllIlIlIl[15];
                                        if (!ah.llIIIllIllIl(Inventory.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lllIlIlIl[1]];
                                        nArray11[ah.lllIlIlIl[0]] = lllIlIlIl[47];
                                        if (!ah.llIIIllIllll(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lllIlIlIl[1]];
                                        nArray12[ah.lllIlIlIl[0]] = lllIlIlIl[47];
                                        if (!ah.llIIIllIllIl(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lllIlIlIl[1];
                                    "".length();
                                    if (null == null) return n4 != 0;
                                    return ((0x12 ^ 0x67 ^ (0xC4 ^ 0x97)) & (0xAF ^ 0x99 ^ (0xD2 ^ 0xC2) ^ -" ".length())) != 0;
                                }
                                n4 = lllIlIlIl[0];
                                return n4 != 0;
                            }
                            if (!ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[7]) || !ah.llIIIllIllll(ck ? 1 : 0)) break block25;
                            int[] nArray = new int[lllIlIlIl[1]];
                            nArray[ah.lllIlIlIl[0]] = lllIlIlIl[21];
                            if (!ah.llIIIllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lllIlIlIl[1]];
                            nArray13[ah.lllIlIlIl[0]] = lllIlIlIl[21];
                            if (!ah.llIIIllIllIl(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lllIlIlIl[1]];
                        nArray[ah.lllIlIlIl[0]] = lllIlIlIl[23];
                        if (ah.llIIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lllIlIlIl[1]];
                            nArray14[ah.lllIlIlIl[0]] = lllIlIlIl[37];
                            if (ah.llIIIllIllIl(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lllIlIlIl[1];
                                "".length();
                                if (null == null) return n3 != 0;
                                return ((0xB7 ^ 0x98) & ~(0x3E ^ 0x11)) != 0;
                            }
                        }
                    }
                    n3 = lllIlIlIl[0];
                    return n3 != 0;
                }
                if (!ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[7]) || !ah.llIIIllIllIl(ck ? 1 : 0)) return lllIlIlIl[0];
                int[] nArray = new int[lllIlIlIl[1]];
                nArray[ah.lllIlIlIl[0]] = lllIlIlIl[21];
                if (!ah.llIIIllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lllIlIlIl[1]];
                nArray15[ah.lllIlIlIl[0]] = lllIlIlIl[21];
                if (!ah.llIIIllIllIl(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lllIlIlIl[1]];
            nArray[ah.lllIlIlIl[0]] = lllIlIlIl[15];
            if (ah.llIIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lllIlIlIl[1]];
                nArray16[ah.lllIlIlIl[0]] = lllIlIlIl[22];
                if (ah.llIIIllIllIl(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lllIlIlIl[1]];
                    nArray17[ah.lllIlIlIl[0]] = lllIlIlIl[22];
                    if (ah.llIIIlllIIlI(Inventory.getFirst((int[])nArray17).getQuantity(), lllIlIlIl[18])) {
                        int[] nArray18 = new int[lllIlIlIl[1]];
                        nArray18[ah.lllIlIlIl[0]] = lllIlIlIl[23];
                        if (ah.llIIIllIllIl(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lllIlIlIl[1]];
                            nArray19[ah.lllIlIlIl[0]] = lllIlIlIl[37];
                            if (ah.llIIIllIllIl(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lllIlIlIl[1];
                                "".length();
                                if (-"   ".length() < 0) return n2 != 0;
                                return ((0x9B ^ 0x87) & ~(0x9F ^ 0x83)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lllIlIlIl[0];
        return n2 != 0;
    }

    private static void llIIIllIlIll() {
        lllIlIlII = new String[lllIlIlIl[81]];
        ah.lllIlIlII[ah.lllIlIlIl[0]] = ah.llIIIllIlIII("sw03b7OQ1KleKh6+CDgqAg==", "dfRkP");
        ah.lllIlIlII[ah.lllIlIlIl[1]] = ah.llIIIllIlIII("ZiP15vg4Ve9hvvSxpmtqylFJzdw8/QB7pVR2+ETor53Z48qDV1TzX55NKabHY7+nWJuePed152M=", "tGzgm");
        ah.lllIlIlII[ah.lllIlIlIl[2]] = ah.llIIIllIlIII("jpCDzRGfxtpEymkNjGzvvxNKq9BCNBpZ", "xKFKW");
        ah.lllIlIlII[ah.lllIlIlIl[3]] = ah.llIIIllIlIIl("ETsbKj4wNBJuMDg0Hic8Pg==", "YZuNR");
        ah.lllIlIlII[ah.lllIlIlIl[6]] = ah.llIIIllIlIII("n/x8Y/kUFXZpDmX7XMd9ZqyWknAF4O81s+DDUv5MM2hoB6mdlo/L062M0a35ULWD", "MoOHB");
        ah.lllIlIlII[ah.lllIlIlIl[18]] = ah.llIIIllIlIII("9H2JgfSPej91OCTx/WEf8Q==", "BexxK");
        ah.lllIlIlII[ah.lllIlIlIl[5]] = ah.llIIIllIlIlI("hOzpQhQtuW0vc5ZROy0hWQ==", "dabFF");
        ah.lllIlIlII[ah.lllIlIlIl[26]] = ah.llIIIllIlIlI("m0v7Cx5X14WPiGOQObPEruTuYrWsASlX", "fRYnn");
        ah.lllIlIlII[ah.lllIlIlIl[29]] = ah.llIIIllIlIlI("5kl9PhK2/tTkoptxEsmXXoNcwpbh/j12", "ZcmoR");
        ah.lllIlIlII[ah.lllIlIlIl[31]] = ah.llIIIllIlIIl("DxkePigiH00sICAUFGo1KRQI", "LxmJA");
        ah.lllIlIlII[ah.lllIlIlIl[32]] = ah.llIIIllIlIlI("hU5DaKpWzq/+vkOjkcWhVPR+q8NTOZZw", "CIwZi");
        ah.lllIlIlII[ah.lllIlIlIl[33]] = ah.llIIIllIlIlI("1tG7sZSf9xM=", "LKTnD");
        ah.lllIlIlII[ah.lllIlIlIl[36]] = ah.llIIIllIlIII("daue/GPYBRs=", "xGNtu");
        ah.lllIlIlII[ah.lllIlIlIl[38]] = ah.llIIIllIlIlI("e4/SXO7whsYaqd5m1LkjMbKlMu+h1Mfc", "cILET");
        ah.lllIlIlII[ah.lllIlIlIl[42]] = ah.llIIIllIlIII("YItnflSRTf5xeQrypbIjXA==", "TQYPL");
        ah.lllIlIlII[ah.lllIlIlIl[43]] = ah.llIIIllIlIII("2ozEdhFX5xdGj+8+6zE1HA==", "YbKgz");
        ah.lllIlIlII[ah.lllIlIlIl[44]] = ah.llIIIllIlIII("NXIeXO6YmKs=", "pstaS");
        ah.lllIlIlII[ah.lllIlIlIl[45]] = ah.llIIIllIlIIl("Egoe", "QeiIg");
        ah.lllIlIlII[ah.lllIlIlIl[46]] = ah.llIIIllIlIIl("DjUW", "mZatH");
        ah.lllIlIlII[ah.lllIlIlIl[48]] = ah.llIIIllIlIlI("mH6R/f2b4vk=", "JfuEs");
        ah.lllIlIlII[ah.lllIlIlIl[52]] = ah.llIIIllIlIII("aZSkldZHA037qq+Xk4AjQLaHf8CFZypQ", "rXeyC");
        ah.lllIlIlII[ah.lllIlIlIl[53]] = ah.llIIIllIlIlI("uIowcvcjHR5zcGZPMkUDpw==", "PqdzH");
        ah.lllIlIlII[ah.lllIlIlIl[55]] = ah.llIIIllIlIII("nTkgbdaZU/EtHDWYEBUw3g==", "OTFan");
        ah.lllIlIlII[ah.lllIlIlIl[56]] = ah.llIIIllIlIIl("NTUYCjRCBxgdLwkx", "bTloF");
        ah.lllIlIlII[ah.lllIlIlIl[57]] = ah.llIIIllIlIII("fEou99Zy123NFuvBGI2koQ==", "DkdIp");
        ah.lllIlIlII[ah.lllIlIlIl[20]] = ah.llIIIllIlIII("ZlCvtBYuWI1MKUJDjOsTMA==", "DLtzA");
        ah.lllIlIlII[ah.lllIlIlIl[51]] = ah.llIIIllIlIIl("FwQDKlICGQMmGTQ=", "QmqOr");
        ah.lllIlIlII[ah.lllIlIlIl[73]] = ah.llIIIllIlIII("BHws4mzjMT0/X7qgP6HKCQ==", "bbwKx");
        ah.lllIlIlII[ah.lllIlIlIl[75]] = ah.llIIIllIlIII("yeQvEKA/yn4PXvOizk9nfng8q197q2wK", "rIgdE");
        ah.lllIlIlII[ah.lllIlIlIl[76]] = ah.llIIIllIlIII("E7BoNr5LO0A=", "pyDaQ");
    }

    private static void am() {
        if (ah.llIIIlllIllI(ah.llIIIlllIlIl(e.w(), 30.0))) {
            int[] nArray = new int[lllIlIlIl[1]];
            nArray[ah.lllIlIlIl[0]] = lllIlIlIl[19];
            if (ah.llIIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllIlIlIl[1]];
                nArray2[ah.lllIlIlIl[0]] = lllIlIlIl[19];
                Inventory.getFirst((int[])nArray2).interact(lllIlIlII[lllIlIlIl[44]]);
                Time.sleepTicks((int)lllIlIlIl[1]);
                "".length();
            }
        }
        if (ah.llIIIlllIlII(Players.getLocal().getInteracting())) {
            NPC llIllllIlllIl = NPCs.getNearest(nPC -> {
                int n2;
                if (ah.llIIIllIllIl(nPC.getName().contains(lllIlIlII[lllIlIlIl[76]]) ? 1 : 0) && ah.llIIIllIllll(nPC.isDead() ? 1 : 0)) {
                    n2 = lllIlIlIl[1];
                    "".length();
                    if (" ".length() < " ".length()) {
                        return ((0xBF ^ 0xAF) & ~(0x88 ^ 0x98)) != 0;
                    }
                } else {
                    n2 = lllIlIlIl[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[lllIlIlIl[2]];
            stringArray[ah.lllIlIlIl[0]] = lllIlIlII[lllIlIlIl[45]];
            stringArray[ah.lllIlIlIl[1]] = lllIlIlII[lllIlIlIl[46]];
            List llIllllIlllII = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (ah.llIIIlllIlll(nPC.getInteracting(), Players.getLocal())) {
                    bl = lllIlIlIl[1];
                    "".length();
                    if ((0x4E ^ 0x30 ^ (0x15 ^ 0x6F)) == "  ".length()) {
                        return (("   ".length() ^ (0x48 ^ 0x2B)) & (0x2A ^ 0x53 ^ (0x97 ^ 0x8E) ^ -" ".length())) != 0;
                    }
                } else {
                    bl = lllIlIlIl[0];
                }
                return bl;
            }).collect(Collectors.toList());
            int[] nArray = new int[lllIlIlIl[1]];
            nArray[ah.lllIlIlIl[0]] = lllIlIlIl[47];
            if (ah.llIIIllIllIl(Equipment.contains((int[])nArray) ? 1 : 0) && ah.llIIIllIllll(ah.ap() ? 1 : 0)) {
                ah.aq();
            }
            if (ah.llIIIlllIIII(llIllllIlllIl) && ah.llIIIllIllll(Players.getLocal().isMoving() ? 1 : 0)) {
                llIllllIlllIl.interact(lllIlIlII[lllIlIlIl[48]]);
                Time.sleepTicks((int)lllIlIlIl[3]);
                "".length();
            }
        }
    }

    private static String llIIIllIlIlI(String llIllllIIIllI, String llIllllIIIlIl) {
        try {
            SecretKeySpec llIllllIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllllIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIllllIIlIII = Cipher.getInstance("Blowfish");
            llIllllIIlIII.init(lllIlIlIl[2], llIllllIIlIIl);
            return new String(llIllllIIlIII.doFinal(Base64.getDecoder().decode(llIllllIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIllllIIIlll) {
            llIllllIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlllIlll(Object object, Object object2) {
        return object == object2;
    }

    private static String llIIIllIlIII(String llIlllIlllIIl, String llIlllIlllIII) {
        try {
            SecretKeySpec llIlllIllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlllIlllIII.getBytes(StandardCharsets.UTF_8)), lllIlIlIl[29]), "DES");
            Cipher llIlllIlllIll = Cipher.getInstance("DES");
            llIlllIlllIll.init(lllIlIlIl[2], llIlllIllllII);
            return new String(llIlllIlllIll.doFinal(Base64.getDecoder().decode(llIlllIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlllIlllIlI) {
            llIlllIlllIlI.printStackTrace();
            return null;
        }
    }

    static {
        ah.llIIIllIllII();
        ah.llIIIllIlIll();
        ck = lllIlIlIl[0];
        bx = new ArrayList<d>();
        cl = new WorldArea(lllIlIlIl[77], lllIlIlIl[78], lllIlIlIl[52], lllIlIlIl[42], lllIlIlIl[0]);
        cm = new WorldPoint(lllIlIlIl[79], lllIlIlIl[80], lllIlIlIl[0]);
        cn = null;
    }

    private static boolean llIIIlllIIIl(int n2) {
        return n2 > 0;
    }

    public static boolean ap() {
        if (ah.llIIIlllIIll(Vars.getBit((int)lllIlIlIl[49]), lllIlIlIl[1]) && ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[18])) {
            return lllIlIlIl[1];
        }
        if (ah.llIIIlllIIll(Vars.getBit((int)lllIlIlIl[49]), lllIlIlIl[2]) && ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[31]) && ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[18])) {
            return lllIlIlIl[1];
        }
        if (ah.llIIIlllIIll(Vars.getBit((int)lllIlIlIl[49]), lllIlIlIl[3]) && ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[31]) && ah.llIIIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[38])) {
            return lllIlIlIl[1];
        }
        if (ah.llIIIlllIIll(Vars.getBit((int)lllIlIlIl[49]), lllIlIlIl[3]) && ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[31])) {
            int[] nArray = new int[lllIlIlIl[1]];
            nArray[ah.lllIlIlIl[0]] = lllIlIlIl[13];
            if (ah.llIIIllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lllIlIlIl[1];
            }
        }
        if (ah.llIIIlllIIll(Vars.getBit((int)lllIlIlIl[49]), lllIlIlIl[6]) && ah.llIIIlllIIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIl[38])) {
            int[] nArray = new int[lllIlIlIl[1]];
            nArray[ah.lllIlIlIl[0]] = lllIlIlIl[13];
            if (ah.llIIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lllIlIlIl[1];
            }
        }
        return lllIlIlIl[0];
    }
}

