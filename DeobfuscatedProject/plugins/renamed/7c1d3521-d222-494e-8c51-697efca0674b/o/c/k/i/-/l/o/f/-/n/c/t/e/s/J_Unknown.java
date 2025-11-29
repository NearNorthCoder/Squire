/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Quest
 *  net.runelite.api.QuestState
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.quests.Quests
 *  net.unethicalite.api.widgets.Dialog
 */
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.B_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.K_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aN_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;

public class J_Unknown
implements ac {
    private static /* synthetic */ String[] llIIllIlll;
    static /* synthetic */ int di;
    private static /* synthetic */ int[] llIIlllIII;
    static /* synthetic */ WorldPoint gi;
    static /* synthetic */ WorldPoint gg;
    static /* synthetic */ WorldPoint gh;
    static /* synthetic */ WorldPoint gf;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ List<d> bv;
    static /* synthetic */ boolean dj;
    static /* synthetic */ String[] cE;
    static /* synthetic */ int gj;

    private static boolean lIlIlllIIIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static void Q() {
        d var9;
        Object var16;
        block27: {
            block26: {
                block25: {
                    block24: {
                        block23: {
                            block22: {
                                block21: {
                                    block20: {
                                        int[] nArray = new int[llIIlllIII[5]];
                                        nArray[J.llIIlllIII[6]] = llIIlllIII[11];
                                        if (!J.lIlIllIlllIll(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                        int[] nArray2 = new int[llIIlllIII[5]];
                                        nArray2[J.llIIlllIII[6]] = llIIlllIII[11];
                                        if (!J.lIlIllIlllIll(Bank.contains((int[])nArray2) ? 1 : 0)) break block21;
                                        int[] nArray3 = new int[llIIlllIII[5]];
                                        nArray3[J.llIIlllIII[6]] = llIIlllIII[11];
                                        if (!J.lIlIllIlllIII(Bank.getFirst((int[])nArray3).getQuantity(), llIIlllIII[3])) break block21;
                                    }
                                    var16 = new d(llIIlllIII[11], llIIlllIII[3], j.cf);
                                    bv.add((d)var16);
                                    0;
                                }
                                int[] nArray = new int[llIIlllIII[5]];
                                nArray[J.llIIlllIII[6]] = llIIlllIII[25];
                                if (J.lIlIllIllllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    var16 = new d(llIIlllIII[25], llIIlllIII[5], llIIlllIII[60]);
                                    bv.add((d)var16);
                                    0;
                                }
                                int[] nArray4 = new int[llIIlllIII[5]];
                                nArray4[J.llIIlllIII[6]] = llIIlllIII[22];
                                if (J.lIlIllIllllII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    var16 = new d(llIIlllIII[22], llIIlllIII[5], llIIlllIII[60]);
                                    bv.add((d)var16);
                                    0;
                                }
                                int[] nArray5 = new int[llIIlllIII[5]];
                                nArray5[J.llIIlllIII[6]] = llIIlllIII[10];
                                if (!J.lIlIllIlllIll(Bank.contains((int[])nArray5) ? 1 : 0)) break block22;
                                int[] nArray6 = new int[llIIlllIII[5]];
                                nArray6[J.llIIlllIII[6]] = llIIlllIII[10];
                                if (!J.lIlIllIlllIll(Bank.contains((int[])nArray6) ? 1 : 0)) break block23;
                                int[] nArray7 = new int[llIIlllIII[5]];
                                nArray7[J.llIIlllIII[6]] = llIIlllIII[10];
                                if (!J.lIlIllIlllIII(Bank.getFirst((int[])nArray7).getQuantity(), llIIlllIII[9])) break block23;
                            }
                            var16 = new d(llIIlllIII[10], llIIlllIII[9], llIIlllIII[61]);
                            bv.add((d)var16);
                            0;
                        }
                        int[] nArray = new int[llIIlllIII[5]];
                        nArray[J.llIIlllIII[6]] = llIIlllIII[19];
                        if (J.lIlIllIllllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            var16 = new d(llIIlllIII[19], llIIlllIII[5], llIIlllIII[60]);
                            bv.add((d)var16);
                            0;
                        }
                        int[] nArray8 = new int[llIIlllIII[5]];
                        nArray8[J.llIIlllIII[6]] = llIIlllIII[17];
                        if (J.lIlIllIllllII(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            var16 = new d(llIIlllIII[17], llIIlllIII[5], llIIlllIII[60]);
                            bv.add((d)var16);
                            0;
                        }
                        int[] nArray9 = new int[llIIlllIII[5]];
                        nArray9[J.llIIlllIII[6]] = llIIlllIII[15];
                        if (J.lIlIllIllllII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                            var16 = new d(llIIlllIII[15], llIIlllIII[5], llIIlllIII[60]);
                            bv.add((d)var16);
                            0;
                        }
                        int[] nArray10 = new int[llIIlllIII[5]];
                        nArray10[J.llIIlllIII[6]] = llIIlllIII[16];
                        if (J.lIlIllIllllII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                            var16 = new d(llIIlllIII[16], llIIlllIII[5], llIIlllIII[60]);
                            bv.add((d)var16);
                            0;
                        }
                        int[] nArray11 = new int[llIIlllIII[5]];
                        nArray11[J.llIIlllIII[6]] = llIIlllIII[14];
                        if (!J.lIlIllIlllIll(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                        int[] nArray12 = new int[llIIlllIII[5]];
                        nArray12[J.llIIlllIII[6]] = llIIlllIII[14];
                        if (!J.lIlIllIlllIll(Bank.contains((int[])nArray12) ? 1 : 0)) break block25;
                        int[] nArray13 = new int[llIIlllIII[5]];
                        nArray13[J.llIIlllIII[6]] = llIIlllIII[14];
                        if (!J.lIlIllIlllIII(Bank.getFirst((int[])nArray13).getQuantity(), llIIlllIII[3])) break block25;
                    }
                    var16 = new d(llIIlllIII[14], llIIlllIII[4], llIIlllIII[62]);
                    bv.add((d)var16);
                    0;
                }
                int[] nArray = new int[llIIlllIII[5]];
                nArray[J.llIIlllIII[6]] = llIIlllIII[12];
                if (!J.lIlIllIlllIll(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                int[] nArray14 = new int[llIIlllIII[5]];
                nArray14[J.llIIlllIII[6]] = llIIlllIII[12];
                if (!J.lIlIllIlllIll(Bank.contains((int[])nArray14) ? 1 : 0)) break block27;
                int[] nArray15 = new int[llIIlllIII[5]];
                nArray15[J.llIIlllIII[6]] = llIIlllIII[12];
                if (!J.lIlIllIlllIII(Bank.getFirst((int[])nArray15).getQuantity(), llIIlllIII[4])) break block27;
            }
            var16 = new d(llIIlllIII[12], llIIlllIII[4], llIIlllIII[62]);
            bv.add((d)var16);
            0;
        }
        if (J.lIlIllIllllII(Bank.contains((Predicate)(var16 = item -> item.getName().toLowerCase().contains(llIIllIlll[llIIlllIII[67]]))) ? 1 : 0)) {
            var9 = new d(llIIlllIII[63], llIIlllIII[3], llIIlllIII[64]);
            bv.add(var9);
            0;
        }
        int[] nArray = new int[llIIlllIII[5]];
        nArray[J.llIIlllIII[6]] = llIIlllIII[13];
        if (J.lIlIllIllllII(Bank.contains((int[])nArray) ? 1 : 0)) {
            var9 = new d(llIIlllIII[13], llIIlllIII[42], llIIlllIII[62]);
            bv.add(var9);
            0;
        }
    }

    private static boolean lIlIlllIIIIII(Object object) {
        return object == null;
    }

    private static boolean lIlIlllIIIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIllIlllllI(int n2) {
        return n2 > 0;
    }

    private static void lIlIllIllIlll() {
        llIIlllIII = new int[80];
        J.llIIlllIII[0] = 0xFFFFC7AF & 0x3AF6;
        J.llIIlllIII[1] = 3;
        J.llIIlllIII[2] = 0x66 ^ 7 ^ (0xE8 ^ 0x82);
        J.llIIlllIII[3] = 0x32 ^ 0x37;
        J.llIIlllIII[4] = 0x1B ^ 0x35 ^ (0x4E ^ 0x6A);
        J.llIIlllIII[5] = 1;
        J.llIIlllIII[6] = (79 + 96 - 93 + 92 ^ 167 + 158 - 262 + 127) & (0xE1 ^ 0xB8 ^ (0x7E ^ 0x37) ^ -1);
        J.llIIlllIII[7] = -(0xFFFFCFDF & 0x7C62) & (0xFFFFFFE9 & 0x5FDF);
        J.llIIlllIII[8] = 2;
        J.llIIlllIII[9] = 0x3C ^ 0x38;
        J.llIIlllIII[10] = -(0xFFFFFEAD & 0x9DF) & (0xFFFFBFFD & 0x4FFF);
        J.llIIlllIII[11] = -(0xFFFFFEBF & 0x94D) & (0xFFFFFD5F & 0x3BFD);
        J.llIIlllIII[12] = -(0xFFFFC861 & 0x779F) & (0xFFFFFFFF & 0x5F49);
        J.llIIlllIII[13] = 0xFFFFDF57 & 0x3FEF;
        J.llIIlllIII[14] = 0xFFFFBF4D & 0x5FFA;
        J.llIIlllIII[15] = -(0xFFFFD5FB & 0x7A05) & (0xFFFFFFBF & 0x57C7);
        J.llIIlllIII[16] = -(0xFFFFFD6D & 0x7AB3) & (0xFFFFFFAD & Short.MAX_VALUE);
        J.llIIlllIII[17] = -(0xFFFFD97D & 0x76E3) & (0xFFFFFFFB & 0x57FC);
        J.llIIlllIII[18] = 0x5A ^ 0x70 ^ (0x3D ^ 0x11);
        J.llIIlllIII[19] = -(0xFFFFEEEF & 0x7977) & (0xFFFFFFFF & 0x6FE7);
        J.llIIlllIII[20] = 0x3A ^ 0x76 ^ (0x4F ^ 4);
        J.llIIlllIII[21] = 0x6D ^ 0x23 ^ (0xD3 ^ 0x95);
        J.llIIlllIII[22] = 0xFFFFB5AB & 0x4E77;
        J.llIIlllIII[23] = 0x9C ^ 0x95;
        J.llIIlllIII[24] = -(0xFFFFEFA7 & 0x3CDD) & (0xFFFFEDFF & 0x3FFF);
        J.llIIlllIII[25] = 0xFFFFB533 & 0x4FFF;
        J.llIIlllIII[26] = 0xFFFFAFFB & 0x53E7;
        J.llIIlllIII[27] = 0x59 ^ 0x34 ^ (0xF2 ^ 0xAD);
        J.llIIlllIII[28] = -(0xFFFFEF3D & 0x58DB) & (0xFFFFCFFF & 0x7F7B);
        J.llIIlllIII[29] = 0xF2 ^ 0x95 ^ (0x79 ^ 0x12);
        J.llIIlllIII[30] = 0x79 ^ 0x1D ^ (0x4E ^ 0x27);
        J.llIIlllIII[31] = 0xBA ^ 0xB4;
        J.llIIlllIII[32] = 0x4F ^ 0x40;
        J.llIIlllIII[33] = 0x3B ^ 0x2B;
        J.llIIlllIII[34] = 88 + 82 - 115 + 118 ^ 41 + 21 - 61 + 184;
        J.llIIlllIII[35] = 0xFFFFE7BF & 0x1FFF;
        J.llIIlllIII[36] = 0xC2 ^ 0xBF ^ (0xCB ^ 0xA7);
        J.llIIlllIII[37] = 0x2E ^ 0x3C;
        J.llIIlllIII[38] = 0xE ^ 0x1D;
        J.llIIlllIII[39] = 108 + 12 - 42 + 104 ^ 25 + 44 - -83 + 11;
        J.llIIlllIII[40] = 129 + 49 - 155 + 139 ^ 56 + 156 - 204 + 172;
        J.llIIlllIII[41] = 0x6A ^ 0x74;
        J.llIIlllIII[42] = 0x83 ^ 0x91 ^ (0x39 ^ 3);
        J.llIIlllIII[43] = 0xA ^ 0x1D;
        J.llIIlllIII[44] = 91 + 118 - 60 + 30 ^ 95 + 150 - 157 + 83;
        J.llIIlllIII[45] = 0x8D ^ 0x94;
        J.llIIlllIII[46] = -(0xFFFFC32D & 0x3EDB) & (0xFFFFDF7F & 0x3FDD);
        J.llIIlllIII[47] = 0x8B ^ 0x91;
        J.llIIlllIII[48] = 0x82 ^ 0x99;
        J.llIIlllIII[49] = 72 + 26 - -22 + 11 ^ 89 + 20 - 54 + 104;
        J.llIIlllIII[50] = 0xAE ^ 0xA1 ^ (0x5E ^ 0x4C);
        J.llIIlllIII[51] = 0xDE ^ 0xC1;
        J.llIIlllIII[52] = 0xFFFFFF7F & 0x1DD6;
        J.llIIlllIII[53] = 0xFFFF9DE6 & 0x6E9F;
        J.llIIlllIII[54] = -(0xFFFFFB9F & 0x76ED) & (0xFFFFFFFC & 0x7FEF);
        J.llIIlllIII[55] = 0x48 ^ 0x68;
        J.llIIlllIII[56] = 0x18 ^ 0x39;
        J.llIIlllIII[57] = 0x7A ^ 0x54 ^ (0xCC ^ 0xC0);
        J.llIIlllIII[58] = 0x2D ^ 0xE;
        J.llIIlllIII[59] = 0x37 ^ 0x13;
        J.llIIlllIII[60] = -(0xFFFFD4DF & 0x6BB7) & (0xFFFFF3FF & 0x6FBE);
        J.llIIlllIII[61] = 0xFFFFAFB5 & 0x5FEA;
        J.llIIlllIII[62] = -(0xFFFFFE1F & 0x61E1) & (0xFFFFF7FE & 0x6F6D);
        J.llIIlllIII[63] = 0xFFFFAFDD & 0x7EEE;
        J.llIIlllIII[64] = -(0xFFFFDB66 & 0x3CDF) & (0xFFFFFFFD & 0x79EF);
        J.llIIlllIII[65] = 0x43 ^ 0xC ^ (0x9F ^ 0xB4);
        J.llIIlllIII[66] = 0x60 ^ 0x45;
        J.llIIlllIII[67] = 102 + 153 - 149 + 119 ^ 26 + 4 - -107 + 62;
        J.llIIlllIII[68] = -(0xFFFFF7E9 & 0x4B7F) & (0xFFFFEFFF & 0x5FEF);
        J.llIIlllIII[69] = -(0xFFFFD22A & 0x2FF7) & (0xFFFFDFFF & 0x2EB7);
        J.llIIlllIII[70] = -(0xFFFFDDE3 & 0x721D) & (0xFFFFFBCF & 0x5FBD);
        J.llIIlllIII[71] = -(0xFFFFDA4F & 0x75F3) & (0xFFFFDF6E & 0x7DFF);
        J.llIIlllIII[72] = 0xFFFFBF77 & 0x4BB9;
        J.llIIlllIII[73] = 0xFFFFEFDD & 0x36B7;
        J.llIIlllIII[74] = -(0xFFFFFFDB & 0x743F) & (0xFFFFFFDF & 0x7FFB);
        J.llIIlllIII[75] = -(0xFFFFF6FB & 0x7B2F) & (0xFFFFFFBF & 0x7FFB);
        J.llIIlllIII[76] = 0x2F ^ 8;
        J.llIIlllIII[77] = 0x3F ^ 0x16;
        J.llIIlllIII[78] = -(0xFFFF9FDF & 0x7C77) & (0xFFFFDFFF & 0x3EFF);
        J.llIIlllIII[79] = 0xF6 ^ 0x96 ^ (0x53 ^ 0x19);
    }

    private static boolean lIlIllIlllIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIlIllIllIllI() {
        llIIllIlll = new String[llIIlllIII[79]];
        J.llIIllIlll[J.llIIlllIII[6]] = J."Finished buying items, switching back to quest";
        J.llIIllIlll[J.llIIlllIII[5]] = J."Nav to bank";
        J.llIIllIlll[J.llIIlllIII[8]] = J."Handling banking";
        J.llIIllIlll[J.llIIlllIII[1]] = J."We are missing quest supplies, switching to BUYING";
        J.llIIllIlll[J.llIIlllIII[9]] = J."We are missing quest supplies, switching to BUYING";
        J.llIIllIlll[J.llIIlllIII[3]] = J."Drink";
        J.llIIllIlll[J.llIIlllIII[18]] = J."Aris";
        J.llIIllIlll[J.llIIlllIII[20]] = J."Nav to rfd room";
        J.llIIllIlll[J.llIIlllIII[21]] = J."Aris";
        J.llIIllIlll[J.llIIlllIII[23]] = J."Dwarf";
        J.llIIllIlll[J.llIIlllIII[4]] = J."Inspect";
        J.llIIllIlll[J.llIIlllIII[2]] = J."Nav to fally pub";
        J.llIIllIlll[J.llIIlllIII[29]] = J."Handle chat";
        J.llIIllIlll[J.llIIlllIII[30]] = J."Kaylee";
        J.llIIllIlll[J.llIIlllIII[31]] = J."Nav to rock cake guy";
        J.llIIllIlll[J.llIIlllIII[32]] = J."Handle chat";
        J.llIIllIlll[J.llIIlllIII[33]] = J."An old Dwarf";
        J.llIIllIlll[J.llIIlllIII[36]] = J."Nav to rock cake guy";
        J.llIIllIlll[J.llIIlllIII[37]] = J."Handle chat";
        J.llIIllIlll[J.llIIlllIII[38]] = J."An old Dwarf";
        J.llIIllIlll[J.llIIlllIII[34]] = J."Rohak";
        J.llIIllIlll[J.llIIlllIII[39]] = J."Handle chat";
        J.llIIllIlll[J.llIIlllIII[40]] = J."Rohak";
        J.llIIllIlll[J.llIIlllIII[43]] = J."Handle chat";
        J.llIIllIlll[J.llIIlllIII[44]] = J."Rohak";
        J.llIIllIlll[J.llIIlllIII[45]] = J."Wear";
        J.llIIllIlll[J.llIIlllIII[47]] = J."Take";
        J.llIIllIlll[J.llIIlllIII[48]] = J."Wield";
        J.llIIllIlll[J.llIIlllIII[49]] = J."Nav to icefiend";
        J.llIIllIlll[J.llIIlllIII[50]] = J."Attack icefiend";
        J.llIIllIlll[J.llIIlllIII[41]] = J."Icefiend";
        J.llIIllIlll[J.llIIlllIII[51]] = J."Attack";
        J.llIIllIlll[J.llIIlllIII[55]] = J."Aris";
        J.llIIllIlll[J.llIIlllIII[56]] = J."Nav to rfd room";
        J.llIIllIlll[J.llIIlllIII[57]] = J."Aris";
        J.llIIllIlll[J.llIIlllIII[58]] = J."Finishing quest";
        J.llIIllIlll[J.llIIlllIII[59]] = J."Dwarf";
        J.llIIllIlll[J.llIIlllIII[66]] = J."RFD Dwarf quest";
        J.llIIllIlll[J.llIIlllIII[67]] = J."ring of wealth (";
        J.llIIllIlll[J.llIIlllIII[76]] = J."Yes.";
        J.llIIllIlll[J.llIIlllIII[42]] = J."What can you tell me about dwarves and ale?";
        J.llIIllIlll[J.llIIlllIII[77]] = J."I could offer you some in return, how about 200 gold?";
    }

    private static String lIlIllIllIlIl(String var15, String var21) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(llIIlllIII[8], var18);
            return new String(var1.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIlllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIllIllllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIllIllllIl(Object object) {
        return object != null;
    }

    private static String lIlIllIllIlII(String var22, String var12) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), llIIlllIII[21]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(llIIlllIII[8], var8);
            return new String(var2.doFinal(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIlllIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIlllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIllIllllII(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (J.lIlIlllIIIIll(Quests.getState((Quest)Quest.RECIPE_FOR_DISASTER__MOUNTAIN_DWARF), QuestState.FINISHED)) {
            bl = llIIlllIII[5];
            0;
            if (-1 >= 2) {
                return false;
            }
        } else {
            bl = llIIlllIII[6];
        }
        return bl;
    }

    static {
        J.lIlIllIllIlll();
        J.lIlIllIllIllI();
        bv = new ArrayList<d>();
        gf = new WorldPoint(llIIlllIII[68], llIIlllIII[69], llIIlllIII[6]);
        gg = new WorldPoint(llIIlllIII[70], llIIlllIII[71], llIIlllIII[6]);
        gh = new WorldPoint(llIIlllIII[72], llIIlllIII[73], llIIlllIII[6]);
        gi = new WorldPoint(llIIlllIII[74], llIIlllIII[75], llIIlllIII[6]);
        String[] stringArray = new String[llIIlllIII[1]];
        stringArray[J.llIIlllIII[6]] = llIIllIlll[llIIlllIII[76]];
        stringArray[J.llIIlllIII[5]] = llIIllIlll[llIIlllIII[42]];
        stringArray[J.llIIlllIII[8]] = llIIllIlll[llIIlllIII[77]];
        cE = stringArray;
        gj = llIIlllIII[78];
    }

    @Override
    public String ag() {
        return llIIllIlll[llIIlllIII[66]];
    }

    private static boolean lIlIlllIIIIll(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public int af() {
        try {
            J.cw();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((((0xE ^ 0x2F) & ~(0x2C ^ 0xD) ^ (0x96 ^ 0x9F)) & (67 + 119 - 125 + 83 ^ 52 + 99 - 14 + 16 ^ -1)) == 2) {
            return (0x5A ^ 0x70 ^ (0xB3 ^ 0xA8)) & (9 + 9 - -101 + 123 ^ 117 + 55 - 97 + 120 ^ -1);
        }
        return llIIlllIII[65];
    }

    @Override
    public boolean ae() {
        return llIIlllIII[6];
    }

    private static String lIlIllIllIIll(String var11, String var20) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var6 = var20.toCharArray();
        int var7 = llIIlllIII[6];
        char[] var19 = var11.toCharArray();
        int var13 = var19.length;
        int var17 = llIIlllIII[6];
        while (J.lIlIllIlllIII(var17, var13)) {
            char var14 = var19[var17];
            var10.append((char)(var14 ^ var6[var7 % var6.length]));
            0;
            ++var7;
            ++var17;
            0;
            if (1 == 1) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    public static void cw() {
        block50: {
            block58: {
                block57: {
                    BankLocation var5;
                    block56: {
                        block51: {
                            block55: {
                                block53: {
                                    block54: {
                                        block52: {
                                            if (J.lIlIllIlllIII(e.j(llIIlllIII[0]), llIIlllIII[1])) {
                                                K.cy();
                                            }
                                            if (J.lIlIllIlllIIl(e.j(llIIlllIII[0]), llIIlllIII[1]) && J.lIlIllIlllIII(e.j(llIIlllIII[2]), llIIlllIII[3])) {
                                                B.by();
                                            }
                                            if (!J.lIlIllIlllIIl(Skills.getLevel((Skill)Skill.COOKING), llIIlllIII[4]) || !J.lIlIllIlllIIl(e.j(llIIlllIII[0]), llIIlllIII[1]) || !J.lIlIllIlllIlI(e.j(llIIlllIII[2]), llIIlllIII[3])) break block50;
                                            if (J.lIlIllIlllIll(bt ? 1 : 0)) {
                                                b.a(bv);
                                                if (J.lIlIllIlllIII(bv.size(), llIIlllIII[5])) {
                                                    System.out.println(llIIllIlll[llIIlllIII[6]]);
                                                    bt = llIIlllIII[6];
                                                }
                                            }
                                            if (!J.lIlIllIllllII(bt ? 1 : 0)) break block50;
                                            if (!J.lIlIllIllllII(J.an() ? 1 : 0) || !J.lIlIllIllllII(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()))) break block51;
                                            var5 = BankLocation.getNearest();
                                            if (J.lIlIllIllllIl(var5) && J.lIlIllIllllII(var5.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderSotf.c = llIIllIlll[llIIlllIII[5]];
                                                a.a(var5);
                                            }
                                            if (!J.lIlIllIllllIl(var5) || !J.lIlIllIlllIll(var5.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block51;
                                            if (J.lIlIllIllllII(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlllIII[7]);
                                                0;
                                            }
                                            if (!J.lIlIllIlllIll(Bank.isOpen() ? 1 : 0)) break block51;
                                            AccBuilderSotf.c = llIIllIlll[llIIlllIII[8]];
                                            if (J.lIlIllIlllllI(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)llIIlllIII[9]);
                                                0;
                                            }
                                            if (J.lIlIllIlllllI(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)llIIlllIII[8]);
                                                0;
                                            }
                                            int[] nArray = new int[llIIlllIII[5]];
                                            nArray[J.llIIlllIII[6]] = llIIlllIII[10];
                                            if (!J.lIlIllIlllIll(Bank.contains((int[])nArray) ? 1 : 0)) break block52;
                                            int[] nArray2 = new int[llIIlllIII[5]];
                                            nArray2[J.llIIlllIII[6]] = llIIlllIII[10];
                                            if (!J.lIlIllIlllIIl(Bank.getFirst((int[])nArray2).getQuantity(), llIIlllIII[9])) break block53;
                                        }
                                        int[] nArray = new int[llIIlllIII[5]];
                                        nArray[J.llIIlllIII[6]] = llIIlllIII[11];
                                        if (!J.lIlIllIlllIll(Bank.contains((int[])nArray) ? 1 : 0)) break block54;
                                        int[] nArray3 = new int[llIIlllIII[5]];
                                        nArray3[J.llIIlllIII[6]] = llIIlllIII[11];
                                        if (!J.lIlIllIlllIIl(Bank.getFirst((int[])nArray3).getQuantity(), llIIlllIII[3])) break block53;
                                    }
                                    int[] nArray = new int[llIIlllIII[5]];
                                    nArray[J.llIIlllIII[6]] = llIIlllIII[12];
                                    if (!J.lIlIllIlllIll(Bank.contains((int[])nArray) ? 1 : 0)) break block55;
                                    int[] nArray4 = new int[llIIlllIII[5]];
                                    nArray4[J.llIIlllIII[6]] = llIIlllIII[12];
                                    if (!J.lIlIllIlllIII(Bank.getFirst((int[])nArray4).getQuantity(), llIIlllIII[4])) break block55;
                                }
                                J.Q();
                                System.out.println(llIIllIlll[llIIlllIII[1]]);
                                bt = llIIlllIII[5];
                                return;
                            }
                            int[] nArray = new int[llIIlllIII[2]];
                            nArray[J.llIIlllIII[6]] = llIIlllIII[13];
                            nArray[J.llIIlllIII[5]] = llIIlllIII[14];
                            nArray[J.llIIlllIII[8]] = llIIlllIII[12];
                            nArray[J.llIIlllIII[1]] = llIIlllIII[15];
                            nArray[J.llIIlllIII[9]] = llIIlllIII[16];
                            nArray[J.llIIlllIII[3]] = llIIlllIII[17];
                            nArray[J.llIIlllIII[18]] = llIIlllIII[19];
                            nArray[J.llIIlllIII[20]] = llIIlllIII[10];
                            nArray[J.llIIlllIII[21]] = llIIlllIII[22];
                            nArray[J.llIIlllIII[23]] = llIIlllIII[24];
                            nArray[J.llIIlllIII[4]] = llIIlllIII[25];
                            if (J.lIlIllIllllII(e.c(nArray) ? 1 : 0)) {
                                J.Q();
                                System.out.println(llIIllIlll[llIIlllIII[9]]);
                                bt = llIIlllIII[5];
                                return;
                            }
                            int[] nArray5 = new int[llIIlllIII[2]];
                            nArray5[J.llIIlllIII[6]] = llIIlllIII[13];
                            nArray5[J.llIIlllIII[5]] = llIIlllIII[14];
                            nArray5[J.llIIlllIII[8]] = llIIlllIII[12];
                            nArray5[J.llIIlllIII[1]] = llIIlllIII[15];
                            nArray5[J.llIIlllIII[9]] = llIIlllIII[16];
                            nArray5[J.llIIlllIII[3]] = llIIlllIII[17];
                            nArray5[J.llIIlllIII[18]] = llIIlllIII[19];
                            nArray5[J.llIIlllIII[20]] = llIIlllIII[10];
                            nArray5[J.llIIlllIII[21]] = llIIlllIII[22];
                            nArray5[J.llIIlllIII[23]] = llIIlllIII[24];
                            nArray5[J.llIIlllIII[4]] = llIIlllIII[25];
                            if (J.lIlIllIlllIll(e.c(nArray5) ? 1 : 0)) {
                                a.a(llIIlllIII[13], llIIlllIII[4]);
                                a.a(llIIlllIII[14], llIIlllIII[4]);
                                a.a(llIIlllIII[12], llIIlllIII[4]);
                                a.a(llIIlllIII[15], llIIlllIII[5]);
                                a.a(llIIlllIII[16], llIIlllIII[5]);
                                a.a(llIIlllIII[17], llIIlllIII[5]);
                                a.a(llIIlllIII[19], llIIlllIII[5]);
                                a.a(llIIlllIII[10], llIIlllIII[9]);
                                a.a(llIIlllIII[22], llIIlllIII[5]);
                                a.a(llIIlllIII[25], llIIlllIII[5]);
                                a.a(llIIlllIII[24], llIIlllIII[3]);
                                a.a(llIIlllIII[11], llIIlllIII[8]);
                                a.a(llIIlllIII[26], llIIlllIII[7]);
                            }
                        }
                        if (J.lIlIllIlllIll(Inventory.contains((int[])f.ba) ? 1 : 0) && J.lIlIllIlllIII(Movement.getRunEnergy(), llIIlllIII[27])) {
                            Inventory.getFirst((int[])f.ba).interact(llIIllIlll[llIIlllIII[3]]);
                            Time.sleepTicks((int)llIIlllIII[5]);
                            0;
                        }
                        if (J.lIlIllIlllIll(J.an() ? 1 : 0) && J.lIlIllIllllII(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()))) {
                            if (J.lIlIllIllllll(Players.getLocal().getWorldLocation().distanceTo(gf), llIIlllIII[9])) {
                                String[] stringArray = new String[llIIlllIII[5]];
                                stringArray[J.llIIlllIII[6]] = llIIllIlll[llIIlllIII[18]];
                                if (J.lIlIlllIIIIII(NPCs.getNearest((String[])stringArray))) {
                                    AccBuilderSotf.c = llIIllIlll[llIIlllIII[20]];
                                    K.cz();
                                }
                            }
                            String[] stringArray = new String[llIIlllIII[5]];
                            stringArray[J.llIIlllIII[6]] = llIIllIlll[llIIlllIII[21]];
                            if (J.lIlIllIllllIl(NPCs.getNearest((String[])stringArray))) {
                                if (J.lIlIllIllllII(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray2 = new String[llIIlllIII[5]];
                                    stringArray2[J.llIIlllIII[6]] = llIIllIlll[llIIlllIII[23]];
                                    TileObjects.getNearest((String[])stringArray2).interact(llIIllIlll[llIIlllIII[4]]);
                                    Time.sleepTicks((int)llIIlllIII[5]);
                                    0;
                                }
                                g.a(cE);
                            }
                        }
                        if (J.lIlIllIlllIlI(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), llIIlllIII[4])) {
                            if (J.lIlIlllIIIIIl(Vars.getBit((int)llIIlllIII[28]), llIIlllIII[5])) {
                                if (J.lIlIllIllllll(Players.getLocal().getWorldLocation().distanceTo(gg), llIIlllIII[20])) {
                                    AccBuilderSotf.c = llIIllIlll[llIIlllIII[2]];
                                    Movement.walkTo((WorldPoint)gg);
                                    0;
                                    Time.sleepTicks((int)llIIlllIII[5]);
                                    0;
                                }
                                if (J.lIlIlllIIIIlI(Players.getLocal().getWorldLocation().distanceTo(gg), llIIlllIII[20])) {
                                    AccBuilderSotf.c = llIIllIlll[llIIlllIII[29]];
                                    g.a(llIIllIlll[llIIlllIII[30]], cE);
                                }
                            }
                            if (J.lIlIllIlllIlI(Vars.getBit((int)llIIlllIII[28]), llIIlllIII[5])) {
                                int[] nArray = new int[llIIlllIII[5]];
                                nArray[J.llIIlllIII[6]] = llIIlllIII[10];
                                if (J.lIlIllIlllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray6 = new int[llIIlllIII[5]];
                                    nArray6[J.llIIlllIII[6]] = llIIlllIII[26];
                                    int[] nArray7 = new int[llIIlllIII[5]];
                                    nArray7[J.llIIlllIII[6]] = llIIlllIII[10];
                                    Inventory.getFirst((int[])nArray6).useOn(Inventory.getFirst((int[])nArray7));
                                    Time.sleepTicks((int)llIIlllIII[5]);
                                    0;
                                }
                                int[] nArray8 = new int[llIIlllIII[5]];
                                nArray8[J.llIIlllIII[6]] = llIIlllIII[10];
                                if (J.lIlIllIllllII(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                                    if (J.lIlIllIllllll(Players.getLocal().getWorldLocation().distanceTo(gh), llIIlllIII[20])) {
                                        AccBuilderSotf.c = llIIllIlll[llIIlllIII[31]];
                                        Movement.walkTo((WorldPoint)gh);
                                        0;
                                        Time.sleepTicks((int)llIIlllIII[5]);
                                        0;
                                    }
                                    if (J.lIlIlllIIIIlI(Players.getLocal().getWorldLocation().distanceTo(gh), llIIlllIII[20])) {
                                        AccBuilderSotf.c = llIIllIlll[llIIlllIII[32]];
                                        g.a(llIIllIlll[llIIlllIII[33]], cE);
                                    }
                                }
                            }
                        }
                        if (J.lIlIllIlllIlI(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), llIIlllIII[34])) {
                            if (J.lIlIlllIIIIIl(Vars.getBit((int)llIIlllIII[35]), llIIlllIII[9])) {
                                di = llIIlllIII[6];
                                if (J.lIlIllIllllll(Players.getLocal().getWorldLocation().distanceTo(gh), llIIlllIII[20])) {
                                    AccBuilderSotf.c = llIIllIlll[llIIlllIII[36]];
                                    Movement.walkTo((WorldPoint)gh);
                                    0;
                                    Time.sleepTicks((int)llIIlllIII[5]);
                                    0;
                                }
                                if (J.lIlIlllIIIIlI(Players.getLocal().getWorldLocation().distanceTo(gh), llIIlllIII[20])) {
                                    AccBuilderSotf.c = llIIllIlll[llIIlllIII[37]];
                                    g.a(llIIllIlll[llIIlllIII[38]], cE);
                                    g.a(llIIllIlll[llIIlllIII[34]], cE);
                                }
                            }
                            if (J.lIlIllIlllIlI(Vars.getBit((int)llIIlllIII[35]), llIIlllIII[9])) {
                                AccBuilderSotf.c = llIIllIlll[llIIlllIII[39]];
                                g.a(llIIllIlll[llIIlllIII[40]], cE);
                            }
                        }
                        if (!J.lIlIlllIIIIIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), llIIlllIII[41]) || J.lIlIllIlllIlI(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), llIIlllIII[42])) {
                            AccBuilderSotf.c = llIIllIlll[llIIlllIII[43]];
                            g.a(llIIllIlll[llIIlllIII[44]], cE);
                        }
                        if (!J.lIlIllIlllIlI(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), llIIlllIII[27])) break block50;
                        int[] nArray = new int[llIIlllIII[5]];
                        nArray[J.llIIlllIII[6]] = llIIlllIII[22];
                        if (J.lIlIllIllllII(Equipment.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray9 = new int[llIIlllIII[5]];
                            nArray9[J.llIIlllIII[6]] = llIIlllIII[22];
                            if (J.lIlIllIlllIll(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[llIIlllIII[5]];
                                nArray10[J.llIIlllIII[6]] = llIIlllIII[22];
                                Inventory.getFirst((int[])nArray10).interact(llIIllIlll[llIIlllIII[45]]);
                                Time.sleepTicks((int)llIIlllIII[5]);
                                0;
                            }
                        }
                        int[] nArray11 = new int[llIIlllIII[5]];
                        nArray11[J.llIIlllIII[6]] = llIIlllIII[22];
                        if (J.lIlIllIlllIll(Equipment.contains((int[])nArray11) ? 1 : 0)) {
                            int[] nArray12 = new int[llIIlllIII[5]];
                            nArray12[J.llIIlllIII[6]] = llIIlllIII[46];
                            if (J.lIlIllIllllIl(TileItems.getNearest((int[])nArray12))) {
                                int[] nArray13 = new int[llIIlllIII[5]];
                                nArray13[J.llIIlllIII[6]] = llIIlllIII[46];
                                TileItems.getNearest((int[])nArray13).interact(llIIllIlll[llIIlllIII[47]]);
                                Time.sleepTicks((int)llIIlllIII[5]);
                                0;
                            }
                        }
                        int[] nArray14 = new int[llIIlllIII[5]];
                        nArray14[J.llIIlllIII[6]] = llIIlllIII[46];
                        if (J.lIlIllIlllIll(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                            int[] nArray15 = new int[llIIlllIII[5]];
                            nArray15[J.llIIlllIII[6]] = llIIlllIII[25];
                            if (J.lIlIllIlllIll(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                                int[] nArray16 = new int[llIIlllIII[5]];
                                nArray16[J.llIIlllIII[6]] = llIIlllIII[25];
                                if (J.lIlIllIllllII(Equipment.contains((int[])nArray16) ? 1 : 0)) {
                                    int[] nArray17 = new int[llIIlllIII[5]];
                                    nArray17[J.llIIlllIII[6]] = llIIlllIII[25];
                                    Inventory.getFirst((int[])nArray17).interact(llIIllIlll[llIIlllIII[48]]);
                                    Time.sleepTicks((int)llIIlllIII[5]);
                                    0;
                                }
                            }
                            if (J.lIlIllIllllll(Players.getLocal().getWorldLocation().distanceTo(gi), llIIlllIII[18])) {
                                AccBuilderSotf.c = llIIllIlll[llIIlllIII[49]];
                                Movement.walkTo((WorldPoint)gi);
                                0;
                                Time.sleepTicks((int)llIIlllIII[5]);
                                0;
                            }
                            if (J.lIlIlllIIIIlI(Players.getLocal().getWorldLocation().distanceTo(gi), llIIlllIII[18])) {
                                AccBuilderSotf.c = llIIllIlll[llIIlllIII[50]];
                                if (J.lIlIlllIIIIII(Players.getLocal().getInteracting())) {
                                    String[] stringArray = new String[llIIlllIII[5]];
                                    stringArray[J.llIIlllIII[6]] = llIIllIlll[llIIlllIII[41]];
                                    NPCs.getNearest((String[])stringArray).interact(llIIllIlll[llIIlllIII[51]]);
                                    Time.sleepTicks((int)llIIlllIII[1]);
                                    0;
                                }
                            }
                        }
                        int[] nArray18 = new int[llIIlllIII[5]];
                        nArray18[J.llIIlllIII[6]] = llIIlllIII[52];
                        if (!J.lIlIllIlllIll(Inventory.contains((int[])nArray18) ? 1 : 0)) break block50;
                        var5 = new WorldPoint(llIIlllIII[53], llIIlllIII[54], llIIlllIII[6]);
                        if (!J.lIlIllIllllll(Players.getLocal().getWorldLocation().distanceTo(gf), llIIlllIII[9])) break block56;
                        String[] stringArray = new String[llIIlllIII[5]];
                        stringArray[J.llIIlllIII[6]] = llIIllIlll[llIIlllIII[55]];
                        if (!J.lIlIllIllllIl(NPCs.getNearest((String[])stringArray))) break block57;
                    }
                    if (!J.lIlIlllIIIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var5), llIIlllIII[41])) break block58;
                }
                AccBuilderSotf.c = llIIllIlll[llIIlllIII[56]];
                K.cz();
            }
            String[] stringArray = new String[llIIlllIII[5]];
            stringArray[J.llIIlllIII[6]] = llIIllIlll[llIIlllIII[57]];
            if (J.lIlIllIllllIl(NPCs.getNearest((String[])stringArray))) {
                if (J.lIlIllIllllII(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIllIlll[llIIlllIII[58]];
                    if (J.lIlIllIlllIII(di, llIIlllIII[5])) {
                        aN.rD += llIIlllIII[5];
                        aN.u(AccBuilderSotf.m);
                        di += llIIlllIII[5];
                        aN.rD = llIIlllIII[6];
                        dj = llIIlllIII[6];
                    }
                    int[] nArray = new int[llIIlllIII[5]];
                    nArray[J.llIIlllIII[6]] = llIIlllIII[52];
                    String[] stringArray3 = new String[llIIlllIII[5]];
                    stringArray3[J.llIIlllIII[6]] = llIIllIlll[llIIlllIII[59]];
                    Inventory.getFirst((int[])nArray).useOn(TileObjects.getNearest((String[])stringArray3));
                    Time.sleepTicks((int)llIIlllIII[5]);
                    0;
                }
                g.a(cE);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        int[] nArray = new int[llIIlllIII[5]];
        nArray[J.llIIlllIII[6]] = llIIlllIII[25];
        if (J.lIlIllIlllllI(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[llIIlllIII[5]];
            nArray2[J.llIIlllIII[6]] = llIIlllIII[16];
            if (J.lIlIllIlllllI(Inventory.getCount((int[])nArray2))) {
                int[] nArray3 = new int[llIIlllIII[5]];
                nArray3[J.llIIlllIII[6]] = llIIlllIII[17];
                if (J.lIlIllIlllIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[llIIlllIII[5]];
                    nArray4[J.llIIlllIII[6]] = llIIlllIII[19];
                    if (J.lIlIllIlllIll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[llIIlllIII[5]];
                        nArray5[J.llIIlllIII[6]] = llIIlllIII[10];
                        if (J.lIlIllIlllIll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                            int[] nArray6 = new int[llIIlllIII[5]];
                            nArray6[J.llIIlllIII[6]] = llIIlllIII[22];
                            if (J.lIlIllIlllIll(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                                int[] nArray7 = new int[llIIlllIII[5]];
                                nArray7[J.llIIlllIII[6]] = llIIlllIII[26];
                                if (J.lIlIllIlllIll(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                    n2 = llIIlllIII[5];
                                    0;
                                    if ((0x6F ^ 0x6B) > 2) return n2 != 0;
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        n2 = llIIlllIII[6];
        return n2 != 0;
    }
}

