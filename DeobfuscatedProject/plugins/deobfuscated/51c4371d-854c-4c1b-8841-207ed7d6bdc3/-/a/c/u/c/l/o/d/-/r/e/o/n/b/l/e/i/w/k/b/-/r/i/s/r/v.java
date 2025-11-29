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
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.Q;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.a;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.b;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.d;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.f;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.g;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.i;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.s;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.w;
import gg.squire.account.AccBuilderBarrows;
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

public class v
implements F {
    public static /* synthetic */ List<d> bB;
    public static /* synthetic */ boolean bz;
    static /* synthetic */ String[] bX;
    static /* synthetic */ WorldPoint dc;
    private static /* synthetic */ String[] llIlllll;
    static /* synthetic */ int dg;
    static /* synthetic */ WorldPoint de;
    static /* synthetic */ WorldPoint dd;
    private static /* synthetic */ int[] lllIIIII;
    static /* synthetic */ int ci;
    static /* synthetic */ WorldPoint df;
    static /* synthetic */ boolean cj;

    static {
        v.lIlllIIIlIl();
        v.lIlllIIIlII();
        bB = new ArrayList<d>();
        dc = new WorldPoint(lllIIIII[68], lllIIIII[69], lllIIIII[6]);
        dd = new WorldPoint(lllIIIII[70], lllIIIII[71], lllIIIII[6]);
        de = new WorldPoint(lllIIIII[72], lllIIIII[73], lllIIIII[6]);
        df = new WorldPoint(lllIIIII[74], lllIIIII[75], lllIIIII[6]);
        String[] stringArray = new String[lllIIIII[1]];
        stringArray[v.lllIIIII[6]] = llIlllll[lllIIIII[76]];
        stringArray[v.lllIIIII[5]] = llIlllll[lllIIIII[42]];
        stringArray[v.lllIIIII[8]] = llIlllll[lllIIIII[77]];
        bX = stringArray;
        dg = lllIIIII[78];
    }

    private static boolean lIlllIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlllIIIlII() {
        llIlllll = new String[lllIIIII[79]];
        v.llIlllll[v.lllIIIII[6]] = v."Finished buying items, switching back to quest";
        v.llIlllll[v.lllIIIII[5]] = v."Nav to bank";
        v.llIlllll[v.lllIIIII[8]] = v."Handling banking";
        v.llIlllll[v.lllIIIII[1]] = v."We are missing quest supplies, switching to BUYING";
        v.llIlllll[v.lllIIIII[9]] = v."We are missing quest supplies, switching to BUYING";
        v.llIlllll[v.lllIIIII[3]] = v."Drink";
        v.llIlllll[v.lllIIIII[18]] = v."Aris";
        v.llIlllll[v.lllIIIII[20]] = v."Nav to rfd room";
        v.llIlllll[v.lllIIIII[21]] = v."Aris";
        v.llIlllll[v.lllIIIII[23]] = v."Dwarf";
        v.llIlllll[v.lllIIIII[4]] = v."Inspect";
        v.llIlllll[v.lllIIIII[2]] = v."Nav to fally pub";
        v.llIlllll[v.lllIIIII[29]] = v."Handle chat";
        v.llIlllll[v.lllIIIII[30]] = v."Kaylee";
        v.llIlllll[v.lllIIIII[31]] = v."Nav to rock cake guy";
        v.llIlllll[v.lllIIIII[32]] = v."Handle chat";
        v.llIlllll[v.lllIIIII[33]] = v."An old Dwarf";
        v.llIlllll[v.lllIIIII[36]] = v."Nav to rock cake guy";
        v.llIlllll[v.lllIIIII[37]] = v."Handle chat";
        v.llIlllll[v.lllIIIII[38]] = v."An old Dwarf";
        v.llIlllll[v.lllIIIII[34]] = v."Rohak";
        v.llIlllll[v.lllIIIII[39]] = v."Handle chat";
        v.llIlllll[v.lllIIIII[40]] = v."Rohak";
        v.llIlllll[v.lllIIIII[43]] = v."Handle chat";
        v.llIlllll[v.lllIIIII[44]] = v."Rohak";
        v.llIlllll[v.lllIIIII[45]] = v."Wear";
        v.llIlllll[v.lllIIIII[47]] = v."Take";
        v.llIlllll[v.lllIIIII[48]] = v."Wield";
        v.llIlllll[v.lllIIIII[49]] = v."Nav to icefiend";
        v.llIlllll[v.lllIIIII[50]] = v."Attack icefiend";
        v.llIlllll[v.lllIIIII[41]] = v."Icefiend";
        v.llIlllll[v.lllIIIII[51]] = v."Attack";
        v.llIlllll[v.lllIIIII[55]] = v."Aris";
        v.llIlllll[v.lllIIIII[56]] = v."Nav to rfd room";
        v.llIlllll[v.lllIIIII[57]] = v."Aris";
        v.llIlllll[v.lllIIIII[58]] = v."Finishing quest";
        v.llIlllll[v.lllIIIII[59]] = v."Dwarf";
        v.llIlllll[v.lllIIIII[66]] = v."RFD Dwarf quest";
        v.llIlllll[v.lllIIIII[67]] = v."ring of wealth (";
        v.llIlllll[v.lllIIIII[76]] = v."Yes.";
        v.llIlllll[v.lllIIIII[42]] = v."What can you tell me about dwarves and ale?";
        v.llIlllll[v.lllIIIII[77]] = v."I could offer you some in return, how about 200 gold?";
    }

    private static boolean lIlllIIlIII(int n2, int n3) {
        return n2 == n3;
    }

    private static void ag() {
        d lIlIIIlllIIllII;
        Object lIlIIIlllIIllIl;
        block27: {
            block26: {
                block25: {
                    block24: {
                        block23: {
                            block22: {
                                block21: {
                                    block20: {
                                        int[] nArray = new int[lllIIIII[5]];
                                        nArray[v.lllIIIII[6]] = lllIIIII[11];
                                        if (!v.lIlllIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                        int[] nArray2 = new int[lllIIIII[5]];
                                        nArray2[v.lllIIIII[6]] = lllIIIII[11];
                                        if (!v.lIlllIIlIIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block21;
                                        int[] nArray3 = new int[lllIIIII[5]];
                                        nArray3[v.lllIIIII[6]] = lllIIIII[11];
                                        if (!v.lIlllIIIllI(Bank.getFirst((int[])nArray3).getQuantity(), lllIIIII[3])) break block21;
                                    }
                                    lIlIIIlllIIllIl = new d(lllIIIII[11], lllIIIII[3], i.bw);
                                    bB.add((d)lIlIIIlllIIllIl);
                                    0;
                                }
                                int[] nArray = new int[lllIIIII[5]];
                                nArray[v.lllIIIII[6]] = lllIIIII[25];
                                if (v.lIlllIIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    lIlIIIlllIIllIl = new d(lllIIIII[25], lllIIIII[5], lllIIIII[60]);
                                    bB.add((d)lIlIIIlllIIllIl);
                                    0;
                                }
                                int[] nArray4 = new int[lllIIIII[5]];
                                nArray4[v.lllIIIII[6]] = lllIIIII[22];
                                if (v.lIlllIIlIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    lIlIIIlllIIllIl = new d(lllIIIII[22], lllIIIII[5], lllIIIII[60]);
                                    bB.add((d)lIlIIIlllIIllIl);
                                    0;
                                }
                                int[] nArray5 = new int[lllIIIII[5]];
                                nArray5[v.lllIIIII[6]] = lllIIIII[10];
                                if (!v.lIlllIIlIIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block22;
                                int[] nArray6 = new int[lllIIIII[5]];
                                nArray6[v.lllIIIII[6]] = lllIIIII[10];
                                if (!v.lIlllIIlIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block23;
                                int[] nArray7 = new int[lllIIIII[5]];
                                nArray7[v.lllIIIII[6]] = lllIIIII[10];
                                if (!v.lIlllIIIllI(Bank.getFirst((int[])nArray7).getQuantity(), lllIIIII[9])) break block23;
                            }
                            lIlIIIlllIIllIl = new d(lllIIIII[10], lllIIIII[9], lllIIIII[61]);
                            bB.add((d)lIlIIIlllIIllIl);
                            0;
                        }
                        int[] nArray = new int[lllIIIII[5]];
                        nArray[v.lllIIIII[6]] = lllIIIII[19];
                        if (v.lIlllIIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            lIlIIIlllIIllIl = new d(lllIIIII[19], lllIIIII[5], lllIIIII[60]);
                            bB.add((d)lIlIIIlllIIllIl);
                            0;
                        }
                        int[] nArray8 = new int[lllIIIII[5]];
                        nArray8[v.lllIIIII[6]] = lllIIIII[17];
                        if (v.lIlllIIlIlI(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            lIlIIIlllIIllIl = new d(lllIIIII[17], lllIIIII[5], lllIIIII[60]);
                            bB.add((d)lIlIIIlllIIllIl);
                            0;
                        }
                        int[] nArray9 = new int[lllIIIII[5]];
                        nArray9[v.lllIIIII[6]] = lllIIIII[15];
                        if (v.lIlllIIlIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                            lIlIIIlllIIllIl = new d(lllIIIII[15], lllIIIII[5], lllIIIII[60]);
                            bB.add((d)lIlIIIlllIIllIl);
                            0;
                        }
                        int[] nArray10 = new int[lllIIIII[5]];
                        nArray10[v.lllIIIII[6]] = lllIIIII[16];
                        if (v.lIlllIIlIlI(Bank.contains((int[])nArray10) ? 1 : 0)) {
                            lIlIIIlllIIllIl = new d(lllIIIII[16], lllIIIII[5], lllIIIII[60]);
                            bB.add((d)lIlIIIlllIIllIl);
                            0;
                        }
                        int[] nArray11 = new int[lllIIIII[5]];
                        nArray11[v.lllIIIII[6]] = lllIIIII[14];
                        if (!v.lIlllIIlIIl(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                        int[] nArray12 = new int[lllIIIII[5]];
                        nArray12[v.lllIIIII[6]] = lllIIIII[14];
                        if (!v.lIlllIIlIIl(Bank.contains((int[])nArray12) ? 1 : 0)) break block25;
                        int[] nArray13 = new int[lllIIIII[5]];
                        nArray13[v.lllIIIII[6]] = lllIIIII[14];
                        if (!v.lIlllIIIllI(Bank.getFirst((int[])nArray13).getQuantity(), lllIIIII[3])) break block25;
                    }
                    lIlIIIlllIIllIl = new d(lllIIIII[14], lllIIIII[4], lllIIIII[62]);
                    bB.add((d)lIlIIIlllIIllIl);
                    0;
                }
                int[] nArray = new int[lllIIIII[5]];
                nArray[v.lllIIIII[6]] = lllIIIII[12];
                if (!v.lIlllIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                int[] nArray14 = new int[lllIIIII[5]];
                nArray14[v.lllIIIII[6]] = lllIIIII[12];
                if (!v.lIlllIIlIIl(Bank.contains((int[])nArray14) ? 1 : 0)) break block27;
                int[] nArray15 = new int[lllIIIII[5]];
                nArray15[v.lllIIIII[6]] = lllIIIII[12];
                if (!v.lIlllIIIllI(Bank.getFirst((int[])nArray15).getQuantity(), lllIIIII[4])) break block27;
            }
            lIlIIIlllIIllIl = new d(lllIIIII[12], lllIIIII[4], lllIIIII[62]);
            bB.add((d)lIlIIIlllIIllIl);
            0;
        }
        if (v.lIlllIIlIlI(Bank.contains((Predicate)(lIlIIIlllIIllIl = item -> item.getName().toLowerCase().contains(llIlllll[lllIIIII[67]]))) ? 1 : 0)) {
            lIlIIIlllIIllII = new d(lllIIIII[63], lllIIIII[3], lllIIIII[64]);
            bB.add(lIlIIIlllIIllII);
            0;
        }
        int[] nArray = new int[lllIIIII[5]];
        nArray[v.lllIIIII[6]] = lllIIIII[13];
        if (v.lIlllIIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIlIIIlllIIllII = new d(lllIIIII[13], lllIIIII[42], lllIIIII[62]);
            bB.add(lIlIIIlllIIllII);
            0;
        }
    }

    @Override
    public int U() {
        try {
            v.bd();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-3 > 0) {
            return (0x1A ^ 1) & ~(0x55 ^ 0x4E);
        }
        return lllIIIII[65];
    }

    private static void lIlllIIIlIl() {
        lllIIIII = new int[80];
        v.lllIIIII[0] = -(0xB3 ^ 0xB9) & (0xFFFF8EEF & 0x73BF);
        v.lllIIIII[1] = 3;
        v.lllIIIII[2] = 0x57 ^ 0x5C;
        v.lllIIIII[3] = 0x75 ^ 0x70;
        v.lllIIIII[4] = 0xB6 ^ 0x94 ^ (9 ^ 0x21);
        v.lllIIIII[5] = 1;
        v.lllIIIII[6] = (0x1B ^ 0x2A) & ~(0x2B ^ 0x1A);
        v.lllIIIII[7] = -(0xFFFFECE3 & 0x7B5F) & (0xFFFFFBEA & 0x7FDF);
        v.lllIIIII[8] = 2;
        v.lllIIIII[9] = 0xD0 ^ 0xC0 ^ (0x54 ^ 0x40);
        v.lllIIIII[10] = -(0xFFFFAFC7 & 0x58BD) & (0xFFFFAFFF & 0x5FF5);
        v.lllIIIII[11] = -(0xFFFFBE7F & 0x4BAF) & (0xFFFFFFFF & 0x3B7F);
        v.lllIIIII[12] = -(0xF5 ^ 0xC6) & (0xFFFF9F7F & 0x7FFB);
        v.lllIIIII[13] = -(0xFFFFDC51 & 0x63BF) & (0xFFFFFF77 & 0x5FDF);
        v.lllIIIII[14] = -(0xFFFFD6F7 & 0x69BB) & (0xFFFFDFFA & Short.MAX_VALUE);
        v.lllIIIII[15] = -(0xFFFFCE39 & 0x71D7) & (0xFFFFCFBF & 0x77D7);
        v.lllIIIII[16] = -(0xFFFFFF73 & 0x38BD) & (0xFFFFFFFF & 0x3FBD);
        v.lllIIIII[17] = -(0xFFFFB4E3 & 0x7B7D) & (0xFFFFBFFA & 0x77FD);
        v.lllIIIII[18] = 0x28 ^ 0x2E;
        v.lllIIIII[19] = 0xFFFF9FD1 & 0x67AF;
        v.lllIIIII[20] = 0x34 ^ 0x33;
        v.lllIIIII[21] = 0x18 ^ 0x10;
        v.lllIIIII[22] = 0xFFFFAD3F & 0x56E3;
        v.lllIIIII[23] = 0xE4 ^ 0xC3 ^ (0x15 ^ 0x3B);
        v.lllIIIII[24] = -(0xFFFFFEAF & 0x7B51) & (0xFFFFFFFF & 0x7B7B);
        v.lllIIIII[25] = -(0xFFFFBFEF & 0x58D9) & (0xFFFFBDFF & 0x5FFB);
        v.lllIIIII[26] = 0xFFFFCFFB & 0x33E7;
        v.lllIIIII[27] = 0x51 ^ 0x63;
        v.lllIIIII[28] = 0xFFFFCF73 & 0x37EF;
        v.lllIIIII[29] = 0xA4 ^ 0xA8;
        v.lllIIIII[30] = 0x41 ^ 0x4C;
        v.lllIIIII[31] = 0x2F ^ 0x57 ^ (0x64 ^ 0x12);
        v.lllIIIII[32] = 110 + 159 - 217 + 131 ^ 2 + 85 - -82 + 15;
        v.lllIIIII[33] = 0x32 ^ 0x22;
        v.lllIIIII[34] = 11 + 66 - 75 + 126 ^ 146 + 64 - 132 + 70;
        v.lllIIIII[35] = 0xFFFFC7BF & 0x3FFF;
        v.lllIIIII[36] = 0xB7 ^ 0xC0 ^ (0x68 ^ 0xE);
        v.lllIIIII[37] = 0x68 ^ 0x7A;
        v.lllIIIII[38] = 0xD0 ^ 0xC5 ^ (0x79 ^ 0x7F);
        v.lllIIIII[39] = 0xE3 ^ 0xAF ^ (0x25 ^ 0x7C);
        v.lllIIIII[40] = 0x67 ^ 0x71;
        v.lllIIIII[41] = 0x6E ^ 0x59 ^ (0xBD ^ 0x94);
        v.lllIIIII[42] = 0xB4 ^ 0x9C;
        v.lllIIIII[43] = 0x4C ^ 0x5B;
        v.lllIIIII[44] = 19 + 24 - -25 + 73 ^ 58 + 8 - 51 + 134;
        v.lllIIIII[45] = 125 + 13 - 84 + 80 ^ 13 + 7 - -71 + 68;
        v.lllIIIII[46] = 0xFFFFFD7D & 0x1FD7;
        v.lllIIIII[47] = 153 + 138 - 284 + 161 ^ 137 + 90 - 93 + 44;
        v.lllIIIII[48] = 0x4C ^ 0x57;
        v.lllIIIII[49] = 0x71 ^ 0x6D;
        v.lllIIIII[50] = 0xEA ^ 0x9B ^ (0xD7 ^ 0xBB);
        v.lllIIIII[51] = 0x4E ^ 0x51;
        v.lllIIIII[52] = -(0xFFFFEDA7 & 0x52F9) & (0xFFFFDDF7 & 0x7FFE);
        v.lllIIIII[53] = -(0xFFFFFEFB & 0x4316) & (0xFFFFCFD7 & 0x7EBF);
        v.lllIIIII[54] = 0xFFFFED67 & 0x1FF8;
        v.lllIIIII[55] = 0x15 ^ 0x35;
        v.lllIIIII[56] = 0x21 ^ 0;
        v.lllIIIII[57] = (0xEF ^ 0xA6) & ~(0x4C ^ 5) ^ (0x77 ^ 0x55);
        v.lllIIIII[58] = 0x69 ^ 0xD ^ (0x29 ^ 0x6E);
        v.lllIIIII[59] = 60 + 108 - 146 + 128 ^ 131 + 125 - 215 + 137;
        v.lllIIIII[60] = -(0xFFFFECC6 & 0x1F3F) & (0xFFFFFFBF & 0x2F6D);
        v.lllIIIII[61] = 0xFFFFEFB0 & 0x1FEF;
        v.lllIIIII[62] = 0xFFFFAFFE & 0x576D;
        v.lllIIIII[63] = 0xFFFFAECE & 0x7FFD;
        v.lllIIIII[64] = 0xFFFFF1AA & 0x6FFD;
        v.lllIIIII[65] = 101 + 131 - 140 + 72 ^ 84 + 47 - 59 + 120;
        v.lllIIIII[66] = (0x58 ^ 0x6D) & ~(8 ^ 0x3D) ^ (0x92 ^ 0xB7);
        v.lllIIIII[67] = 145 + 1 - 0 + 26 ^ 53 + 125 - 151 + 111;
        v.lllIIIII[68] = -(0xFFFF957D & 0x7B9B) & (0xFFFFBF9F & 0x5DFF);
        v.lllIIIII[69] = 0xFFFFBCDE & 0x4FB7;
        v.lllIIIII[70] = 0xFFFFAF9D & 0x5BEF;
        v.lllIIIII[71] = -(0xFFFFB2DD & 0x6FE3) & (0xFFFFBFEE & 0x6FFD);
        v.lllIIIII[72] = 0xFFFFAB73 & 0x5FBD;
        v.lllIIIII[73] = -(0x27 ^ 0x4C) & (0xFFFFE7FF & 0x3EFF);
        v.lllIIIII[74] = 0xFFFFDBD7 & 0x2FE9;
        v.lllIIIII[75] = 0xFFFF8F91 & 0x7DFF;
        v.lllIIIII[76] = 0x45 ^ 0x3C ^ (0x4E ^ 0x10);
        v.lllIIIII[77] = 126 + 103 - 174 + 106 ^ 109 + 3 - 56 + 80;
        v.lllIIIII[78] = 0xFFFF92BD & 0x6FEB;
        v.lllIIIII[79] = 0xFB ^ 0x9B ^ (0xD7 ^ 0x9D);
    }

    private static String lIlllIIIIII(String lIlIIIllIllllll, String lIlIIIllIlllllI) {
        lIlIIIllIllllll = new String(Base64.getDecoder().decode(lIlIIIllIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIIIllIllllIl = new StringBuilder();
        char[] lIlIIIllIllllII = lIlIIIllIlllllI.toCharArray();
        int lIlIIIllIlllIll = lllIIIII[6];
        char[] lIlIIIllIllIlIl = lIlIIIllIllllll.toCharArray();
        int lIlIIIllIllIlII = lIlIIIllIllIlIl.length;
        int lIlIIIllIllIIll = lllIIIII[6];
        while (v.lIlllIIIllI(lIlIIIllIllIIll, lIlIIIllIllIlII)) {
            char lIlIIIlllIIIIII = lIlIIIllIllIlIl[lIlIIIllIllIIll];
            lIlIIIllIllllIl.append((char)(lIlIIIlllIIIIII ^ lIlIIIllIllllII[lIlIIIllIlllIll % lIlIIIllIllllII.length]));
            0;
            ++lIlIIIllIlllIll;
            ++lIlIIIllIllIIll;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lIlIIIllIllllIl);
    }

    @Override
    public String V() {
        return llIlllll[lllIIIII[66]];
    }

    private static String lIllIllllll(String lIlIIIllIIlllIl, String lIlIIIllIIlllII) {
        try {
            SecretKeySpec lIlIIIllIlIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIIllIIlllII.getBytes(StandardCharsets.UTF_8)), lllIIIII[21]), "DES");
            Cipher lIlIIIllIIlllll = Cipher.getInstance("DES");
            lIlIIIllIIlllll.init(lllIIIII[8], lIlIIIllIlIIIII);
            return new String(lIlIIIllIIlllll.doFinal(Base64.getDecoder().decode(lIlIIIllIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIIllIIllllI) {
            lIlIIIllIIllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIlIIIl(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public boolean T() {
        return lllIIIII[6];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
        int n2;
        int[] nArray = new int[lllIIIII[5]];
        nArray[v.lllIIIII[6]] = lllIIIII[25];
        if (v.lIlllIIllII(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[lllIIIII[5]];
            nArray2[v.lllIIIII[6]] = lllIIIII[16];
            if (v.lIlllIIllII(Inventory.getCount((int[])nArray2))) {
                int[] nArray3 = new int[lllIIIII[5]];
                nArray3[v.lllIIIII[6]] = lllIIIII[17];
                if (v.lIlllIIlIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[lllIIIII[5]];
                    nArray4[v.lllIIIII[6]] = lllIIIII[19];
                    if (v.lIlllIIlIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[lllIIIII[5]];
                        nArray5[v.lllIIIII[6]] = lllIIIII[10];
                        if (v.lIlllIIlIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                            int[] nArray6 = new int[lllIIIII[5]];
                            nArray6[v.lllIIIII[6]] = lllIIIII[22];
                            if (v.lIlllIIlIIl(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                                int[] nArray7 = new int[lllIIIII[5]];
                                nArray7[v.lllIIIII[6]] = lllIIIII[26];
                                if (v.lIlllIIlIIl(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                    n2 = lllIIIII[5];
                                    0;
                                    if (((0x2C ^ 0x6A) & ~(0xF ^ 0x49)) == 0) return n2 != 0;
                                    return ((0x70 ^ 0x44) & ~(0x18 ^ 0x2C)) != 0;
                                }
                            }
                        }
                    }
                }
            }
        }
        n2 = lllIIIII[6];
        return n2 != 0;
    }

    private static boolean lIlllIIlIll(Object object) {
        return object != null;
    }

    private static boolean lIlllIIIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlllIlIIII(int n2, int n3) {
        return n2 <= n3;
    }

    public static void bd() {
        block50: {
            block58: {
                block57: {
                    BankLocation lIlIIIlllIlIIII;
                    block56: {
                        block51: {
                            block55: {
                                block53: {
                                    block54: {
                                        block52: {
                                            if (v.lIlllIIIllI(e.j(lllIIIII[0]), lllIIIII[1])) {
                                                w.bf();
                                            }
                                            if (v.lIlllIIIlll(e.j(lllIIIII[0]), lllIIIII[1]) && v.lIlllIIIllI(e.j(lllIIIII[2]), lllIIIII[3])) {
                                                s.aI();
                                            }
                                            if (!v.lIlllIIIlll(Skills.getLevel((Skill)Skill.COOKING), lllIIIII[4]) || !v.lIlllIIIlll(e.j(lllIIIII[0]), lllIIIII[1]) || !v.lIlllIIlIII(e.j(lllIIIII[2]), lllIIIII[3])) break block50;
                                            if (v.lIlllIIlIIl(bz ? 1 : 0)) {
                                                b.a(bB);
                                                if (v.lIlllIIIllI(bB.size(), lllIIIII[5])) {
                                                    System.out.println(llIlllll[lllIIIII[6]]);
                                                    bz = lllIIIII[6];
                                                }
                                            }
                                            if (!v.lIlllIIlIlI(bz ? 1 : 0)) break block50;
                                            if (!v.lIlllIIlIlI(v.ac() ? 1 : 0) || !v.lIlllIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()))) break block51;
                                            lIlIIIlllIlIIII = BankLocation.getNearest();
                                            if (v.lIlllIIlIll(lIlIIIlllIlIIII) && v.lIlllIIlIlI(lIlIIIlllIlIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderBarrows.c = llIlllll[lllIIIII[5]];
                                                a.a(lIlIIIlllIlIIII);
                                            }
                                            if (!v.lIlllIIlIll(lIlIIIlllIlIIII) || !v.lIlllIIlIIl(lIlIIIlllIlIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block51;
                                            if (v.lIlllIIlIlI(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIIII[7]);
                                                0;
                                            }
                                            if (!v.lIlllIIlIIl(Bank.isOpen() ? 1 : 0)) break block51;
                                            AccBuilderBarrows.c = llIlllll[lllIIIII[8]];
                                            if (v.lIlllIIllII(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lllIIIII[9]);
                                                0;
                                            }
                                            if (v.lIlllIIllII(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lllIIIII[8]);
                                                0;
                                            }
                                            int[] nArray = new int[lllIIIII[5]];
                                            nArray[v.lllIIIII[6]] = lllIIIII[10];
                                            if (!v.lIlllIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block52;
                                            int[] nArray2 = new int[lllIIIII[5]];
                                            nArray2[v.lllIIIII[6]] = lllIIIII[10];
                                            if (!v.lIlllIIIlll(Bank.getFirst((int[])nArray2).getQuantity(), lllIIIII[9])) break block53;
                                        }
                                        int[] nArray = new int[lllIIIII[5]];
                                        nArray[v.lllIIIII[6]] = lllIIIII[11];
                                        if (!v.lIlllIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block54;
                                        int[] nArray3 = new int[lllIIIII[5]];
                                        nArray3[v.lllIIIII[6]] = lllIIIII[11];
                                        if (!v.lIlllIIIlll(Bank.getFirst((int[])nArray3).getQuantity(), lllIIIII[3])) break block53;
                                    }
                                    int[] nArray = new int[lllIIIII[5]];
                                    nArray[v.lllIIIII[6]] = lllIIIII[12];
                                    if (!v.lIlllIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block55;
                                    int[] nArray4 = new int[lllIIIII[5]];
                                    nArray4[v.lllIIIII[6]] = lllIIIII[12];
                                    if (!v.lIlllIIIllI(Bank.getFirst((int[])nArray4).getQuantity(), lllIIIII[4])) break block55;
                                }
                                v.ag();
                                System.out.println(llIlllll[lllIIIII[1]]);
                                bz = lllIIIII[5];
                                return;
                            }
                            int[] nArray = new int[lllIIIII[2]];
                            nArray[v.lllIIIII[6]] = lllIIIII[13];
                            nArray[v.lllIIIII[5]] = lllIIIII[14];
                            nArray[v.lllIIIII[8]] = lllIIIII[12];
                            nArray[v.lllIIIII[1]] = lllIIIII[15];
                            nArray[v.lllIIIII[9]] = lllIIIII[16];
                            nArray[v.lllIIIII[3]] = lllIIIII[17];
                            nArray[v.lllIIIII[18]] = lllIIIII[19];
                            nArray[v.lllIIIII[20]] = lllIIIII[10];
                            nArray[v.lllIIIII[21]] = lllIIIII[22];
                            nArray[v.lllIIIII[23]] = lllIIIII[24];
                            nArray[v.lllIIIII[4]] = lllIIIII[25];
                            if (v.lIlllIIlIlI(e.b(nArray) ? 1 : 0)) {
                                v.ag();
                                System.out.println(llIlllll[lllIIIII[9]]);
                                bz = lllIIIII[5];
                                return;
                            }
                            int[] nArray5 = new int[lllIIIII[2]];
                            nArray5[v.lllIIIII[6]] = lllIIIII[13];
                            nArray5[v.lllIIIII[5]] = lllIIIII[14];
                            nArray5[v.lllIIIII[8]] = lllIIIII[12];
                            nArray5[v.lllIIIII[1]] = lllIIIII[15];
                            nArray5[v.lllIIIII[9]] = lllIIIII[16];
                            nArray5[v.lllIIIII[3]] = lllIIIII[17];
                            nArray5[v.lllIIIII[18]] = lllIIIII[19];
                            nArray5[v.lllIIIII[20]] = lllIIIII[10];
                            nArray5[v.lllIIIII[21]] = lllIIIII[22];
                            nArray5[v.lllIIIII[23]] = lllIIIII[24];
                            nArray5[v.lllIIIII[4]] = lllIIIII[25];
                            if (v.lIlllIIlIIl(e.b(nArray5) ? 1 : 0)) {
                                a.a(lllIIIII[13], lllIIIII[4]);
                                a.a(lllIIIII[14], lllIIIII[4]);
                                a.a(lllIIIII[12], lllIIIII[4]);
                                a.a(lllIIIII[15], lllIIIII[5]);
                                a.a(lllIIIII[16], lllIIIII[5]);
                                a.a(lllIIIII[17], lllIIIII[5]);
                                a.a(lllIIIII[19], lllIIIII[5]);
                                a.a(lllIIIII[10], lllIIIII[9]);
                                a.a(lllIIIII[22], lllIIIII[5]);
                                a.a(lllIIIII[25], lllIIIII[5]);
                                a.a(lllIIIII[24], lllIIIII[3]);
                                a.a(lllIIIII[11], lllIIIII[8]);
                                a.a(lllIIIII[26], lllIIIII[7]);
                            }
                        }
                        if (v.lIlllIIlIIl(Inventory.contains((int[])f.bb) ? 1 : 0) && v.lIlllIIIllI(Movement.getRunEnergy(), lllIIIII[27])) {
                            Inventory.getFirst((int[])f.bb).interact(llIlllll[lllIIIII[3]]);
                            Time.sleepTicks((int)lllIIIII[5]);
                            0;
                        }
                        if (v.lIlllIIlIIl(v.ac() ? 1 : 0) && v.lIlllIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()))) {
                            if (v.lIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(dc), lllIIIII[9])) {
                                String[] stringArray = new String[lllIIIII[5]];
                                stringArray[v.lllIIIII[6]] = llIlllll[lllIIIII[18]];
                                if (v.lIlllIIlllI(NPCs.getNearest((String[])stringArray))) {
                                    AccBuilderBarrows.c = llIlllll[lllIIIII[20]];
                                    w.bg();
                                }
                            }
                            String[] stringArray = new String[lllIIIII[5]];
                            stringArray[v.lllIIIII[6]] = llIlllll[lllIIIII[21]];
                            if (v.lIlllIIlIll(NPCs.getNearest((String[])stringArray))) {
                                if (v.lIlllIIlIlI(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray2 = new String[lllIIIII[5]];
                                    stringArray2[v.lllIIIII[6]] = llIlllll[lllIIIII[23]];
                                    TileObjects.getNearest((String[])stringArray2).interact(llIlllll[lllIIIII[4]]);
                                    Time.sleepTicks((int)lllIIIII[5]);
                                    0;
                                }
                                g.a(bX);
                            }
                        }
                        if (v.lIlllIIlIII(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lllIIIII[4])) {
                            if (v.lIlllIIllll(Vars.getBit((int)lllIIIII[28]), lllIIIII[5])) {
                                if (v.lIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(dd), lllIIIII[20])) {
                                    AccBuilderBarrows.c = llIlllll[lllIIIII[2]];
                                    Movement.walkTo((WorldPoint)dd);
                                    0;
                                    Time.sleepTicks((int)lllIIIII[5]);
                                    0;
                                }
                                if (v.lIlllIlIIII(Players.getLocal().getWorldLocation().distanceTo(dd), lllIIIII[20])) {
                                    AccBuilderBarrows.c = llIlllll[lllIIIII[29]];
                                    g.a(llIlllll[lllIIIII[30]], bX);
                                }
                            }
                            if (v.lIlllIIlIII(Vars.getBit((int)lllIIIII[28]), lllIIIII[5])) {
                                int[] nArray = new int[lllIIIII[5]];
                                nArray[v.lllIIIII[6]] = lllIIIII[10];
                                if (v.lIlllIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray6 = new int[lllIIIII[5]];
                                    nArray6[v.lllIIIII[6]] = lllIIIII[26];
                                    int[] nArray7 = new int[lllIIIII[5]];
                                    nArray7[v.lllIIIII[6]] = lllIIIII[10];
                                    Inventory.getFirst((int[])nArray6).useOn(Inventory.getFirst((int[])nArray7));
                                    Time.sleepTicks((int)lllIIIII[5]);
                                    0;
                                }
                                int[] nArray8 = new int[lllIIIII[5]];
                                nArray8[v.lllIIIII[6]] = lllIIIII[10];
                                if (v.lIlllIIlIlI(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                                    if (v.lIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(de), lllIIIII[20])) {
                                        AccBuilderBarrows.c = llIlllll[lllIIIII[31]];
                                        Movement.walkTo((WorldPoint)de);
                                        0;
                                        Time.sleepTicks((int)lllIIIII[5]);
                                        0;
                                    }
                                    if (v.lIlllIlIIII(Players.getLocal().getWorldLocation().distanceTo(de), lllIIIII[20])) {
                                        AccBuilderBarrows.c = llIlllll[lllIIIII[32]];
                                        g.a(llIlllll[lllIIIII[33]], bX);
                                    }
                                }
                            }
                        }
                        if (v.lIlllIIlIII(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lllIIIII[34])) {
                            if (v.lIlllIIllll(Vars.getBit((int)lllIIIII[35]), lllIIIII[9])) {
                                ci = lllIIIII[6];
                                if (v.lIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(de), lllIIIII[20])) {
                                    AccBuilderBarrows.c = llIlllll[lllIIIII[36]];
                                    Movement.walkTo((WorldPoint)de);
                                    0;
                                    Time.sleepTicks((int)lllIIIII[5]);
                                    0;
                                }
                                if (v.lIlllIlIIII(Players.getLocal().getWorldLocation().distanceTo(de), lllIIIII[20])) {
                                    AccBuilderBarrows.c = llIlllll[lllIIIII[37]];
                                    g.a(llIlllll[lllIIIII[38]], bX);
                                    g.a(llIlllll[lllIIIII[34]], bX);
                                }
                            }
                            if (v.lIlllIIlIII(Vars.getBit((int)lllIIIII[35]), lllIIIII[9])) {
                                AccBuilderBarrows.c = llIlllll[lllIIIII[39]];
                                g.a(llIlllll[lllIIIII[40]], bX);
                            }
                        }
                        if (!v.lIlllIIllll(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lllIIIII[41]) || v.lIlllIIlIII(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lllIIIII[42])) {
                            AccBuilderBarrows.c = llIlllll[lllIIIII[43]];
                            g.a(llIlllll[lllIIIII[44]], bX);
                        }
                        if (!v.lIlllIIlIII(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lllIIIII[27])) break block50;
                        int[] nArray = new int[lllIIIII[5]];
                        nArray[v.lllIIIII[6]] = lllIIIII[22];
                        if (v.lIlllIIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray9 = new int[lllIIIII[5]];
                            nArray9[v.lllIIIII[6]] = lllIIIII[22];
                            if (v.lIlllIIlIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lllIIIII[5]];
                                nArray10[v.lllIIIII[6]] = lllIIIII[22];
                                Inventory.getFirst((int[])nArray10).interact(llIlllll[lllIIIII[45]]);
                                Time.sleepTicks((int)lllIIIII[5]);
                                0;
                            }
                        }
                        int[] nArray11 = new int[lllIIIII[5]];
                        nArray11[v.lllIIIII[6]] = lllIIIII[22];
                        if (v.lIlllIIlIIl(Equipment.contains((int[])nArray11) ? 1 : 0)) {
                            int[] nArray12 = new int[lllIIIII[5]];
                            nArray12[v.lllIIIII[6]] = lllIIIII[46];
                            if (v.lIlllIIlIll(TileItems.getNearest((int[])nArray12))) {
                                int[] nArray13 = new int[lllIIIII[5]];
                                nArray13[v.lllIIIII[6]] = lllIIIII[46];
                                TileItems.getNearest((int[])nArray13).interact(llIlllll[lllIIIII[47]]);
                                Time.sleepTicks((int)lllIIIII[5]);
                                0;
                            }
                        }
                        int[] nArray14 = new int[lllIIIII[5]];
                        nArray14[v.lllIIIII[6]] = lllIIIII[46];
                        if (v.lIlllIIlIIl(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                            int[] nArray15 = new int[lllIIIII[5]];
                            nArray15[v.lllIIIII[6]] = lllIIIII[25];
                            if (v.lIlllIIlIIl(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                                int[] nArray16 = new int[lllIIIII[5]];
                                nArray16[v.lllIIIII[6]] = lllIIIII[25];
                                if (v.lIlllIIlIlI(Equipment.contains((int[])nArray16) ? 1 : 0)) {
                                    int[] nArray17 = new int[lllIIIII[5]];
                                    nArray17[v.lllIIIII[6]] = lllIIIII[25];
                                    Inventory.getFirst((int[])nArray17).interact(llIlllll[lllIIIII[48]]);
                                    Time.sleepTicks((int)lllIIIII[5]);
                                    0;
                                }
                            }
                            if (v.lIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(df), lllIIIII[18])) {
                                AccBuilderBarrows.c = llIlllll[lllIIIII[49]];
                                Movement.walkTo((WorldPoint)df);
                                0;
                                Time.sleepTicks((int)lllIIIII[5]);
                                0;
                            }
                            if (v.lIlllIlIIII(Players.getLocal().getWorldLocation().distanceTo(df), lllIIIII[18])) {
                                AccBuilderBarrows.c = llIlllll[lllIIIII[50]];
                                if (v.lIlllIIlllI(Players.getLocal().getInteracting())) {
                                    String[] stringArray = new String[lllIIIII[5]];
                                    stringArray[v.lllIIIII[6]] = llIlllll[lllIIIII[41]];
                                    NPCs.getNearest((String[])stringArray).interact(llIlllll[lllIIIII[51]]);
                                    Time.sleepTicks((int)lllIIIII[1]);
                                    0;
                                }
                            }
                        }
                        int[] nArray18 = new int[lllIIIII[5]];
                        nArray18[v.lllIIIII[6]] = lllIIIII[52];
                        if (!v.lIlllIIlIIl(Inventory.contains((int[])nArray18) ? 1 : 0)) break block50;
                        lIlIIIlllIlIIII = new WorldPoint(lllIIIII[53], lllIIIII[54], lllIIIII[6]);
                        if (!v.lIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(dc), lllIIIII[9])) break block56;
                        String[] stringArray = new String[lllIIIII[5]];
                        stringArray[v.lllIIIII[6]] = llIlllll[lllIIIII[55]];
                        if (!v.lIlllIIlIll(NPCs.getNearest((String[])stringArray))) break block57;
                    }
                    if (!v.lIlllIlIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlIIIlllIlIIII), lllIIIII[41])) break block58;
                }
                AccBuilderBarrows.c = llIlllll[lllIIIII[56]];
                w.bg();
            }
            String[] stringArray = new String[lllIIIII[5]];
            stringArray[v.lllIIIII[6]] = llIlllll[lllIIIII[57]];
            if (v.lIlllIIlIll(NPCs.getNearest((String[])stringArray))) {
                if (v.lIlllIIlIlI(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderBarrows.c = llIlllll[lllIIIII[58]];
                    if (v.lIlllIIIllI(ci, lllIIIII[5])) {
                        Q.kZ += lllIIIII[5];
                        Q.o(AccBuilderBarrows.m);
                        ci += lllIIIII[5];
                        Q.kZ = lllIIIII[6];
                        cj = lllIIIII[6];
                    }
                    int[] nArray = new int[lllIIIII[5]];
                    nArray[v.lllIIIII[6]] = lllIIIII[52];
                    String[] stringArray3 = new String[lllIIIII[5]];
                    stringArray3[v.lllIIIII[6]] = llIlllll[lllIIIII[59]];
                    Inventory.getFirst((int[])nArray).useOn(TileObjects.getNearest((String[])stringArray3));
                    Time.sleepTicks((int)lllIIIII[5]);
                    0;
                }
                g.a(bX);
            }
        }
    }

    private static boolean lIlllIIllII(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean W() {
        boolean bl;
        if (v.lIlllIlIIIl(Quests.getState((Quest)Quest.RECIPE_FOR_DISASTER__MOUNTAIN_DWARF), QuestState.FINISHED)) {
            bl = lllIIIII[5];
            0;
            if (((0x7F ^ 0x7B) & ~(0x81 ^ 0x85)) != 0) {
                return ((0x54 ^ 6) & ~(0x12 ^ 0x40)) != 0;
            }
        } else {
            bl = lllIIIII[6];
        }
        return bl;
    }

    private static boolean lIlllIIlllI(Object object) {
        return object == null;
    }

    private static String lIlllIIIIlI(String lIlIIIllIlIlIlI, String lIlIIIllIlIlIIl) {
        try {
            SecretKeySpec lIlIIIllIlIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIIllIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIIIllIlIllII = Cipher.getInstance("Blowfish");
            lIlIIIllIlIllII.init(lllIIIII[8], lIlIIIllIlIllIl);
            return new String(lIlIIIllIlIllII.doFinal(Base64.getDecoder().decode(lIlIIIllIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIIllIlIlIll) {
            lIlIIIllIlIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlllIIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllIIllll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlllIIllIl(int n2, int n3) {
        return n2 > n3;
    }
}

