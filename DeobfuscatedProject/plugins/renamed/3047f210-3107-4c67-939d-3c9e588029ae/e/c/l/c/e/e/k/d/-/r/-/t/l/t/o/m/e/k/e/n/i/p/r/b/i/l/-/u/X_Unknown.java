/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
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
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g_Unknown;
import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class X_Unknown
implements S {
    public static final /* synthetic */ WorldPoint jf;
    public static /* synthetic */ boolean bs;
    public static /* synthetic */ List<d> bu;
    public static final /* synthetic */ int jg;
    private static /* synthetic */ int[] lllIlIlIll;
    static /* synthetic */ String[] bQ;
    private static /* synthetic */ String[] lllIlIlIIl;

    private static String llIIIlIlllllI(String var21, String var10) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), lllIlIlIll[13]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(lllIlIlIll[2], var9);
            return new String(var18.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIllIlIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIIllIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String U() {
        return lllIlIlIIl[lllIlIlIll[92]];
    }

    private static boolean llIIIllIIllll(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIllIlIllI(int n2, int n3) {
        return n2 <= n3;
    }

    static boolean dJ() {
        boolean bl;
        int[] nArray = new int[lllIlIlIll[1]];
        nArray[X.lllIlIlIll[0]] = lllIlIlIll[101];
        if (X.llIIIllIlIIlI(TileObjects.getNearest((int[])nArray))) {
            bl = lllIlIlIll[1];
            0;
            if ((0x63 ^ 0x67) == -1) {
                return false;
            }
        } else {
            bl = lllIlIlIll[0];
        }
        return bl;
    }

    @Override
    public boolean S() {
        return lllIlIlIll[0];
    }

    static {
        X.llIIIllIIlllI();
        X.llIIIllIIllIl();
        jg = lllIlIlIll[31];
        jf = new WorldPoint(lllIlIlIll[138], lllIlIlIll[139], lllIlIlIll[0]);
        bu = new ArrayList<d>();
        String[] stringArray = new String[lllIlIlIll[2]];
        stringArray[X.lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[140]];
        stringArray[X.lllIlIlIll[1]] = lllIlIlIIl[lllIlIlIll[141]];
        bQ = stringArray;
    }

    private static boolean dL() {
        boolean bl;
        if (X.llIIIllIllIII(Vars.getBit((int)lllIlIlIll[103]), lllIlIlIll[1])) {
            bl = lllIlIlIll[1];
            0;
            
            }
        } else {
            bl = lllIlIlIll[0];
        }
        return bl;
    }

    private static void ae() {
        d var5;
        Object var15;
        Object var8;
        block24: {
            block23: {
                block21: {
                    block22: {
                        block17: {
                            block20: {
                                block19: {
                                    block18: {
                                        if (!X.llIIIllIlIIII(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIlIlIll[16])) break block17;
                                        int[] nArray = new int[lllIlIlIll[1]];
                                        nArray[X.lllIlIlIll[0]] = lllIlIlIll[19];
                                        if (!X.llIIIllIIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block18;
                                        int[] nArray2 = new int[lllIlIlIll[1]];
                                        nArray2[X.lllIlIlIll[0]] = lllIlIlIll[19];
                                        if (!X.llIIIllIIllll(Bank.contains((int[])nArray2) ? 1 : 0)) break block19;
                                        int[] nArray3 = new int[lllIlIlIll[1]];
                                        nArray3[X.lllIlIlIll[0]] = lllIlIlIll[19];
                                        if (!X.llIIIllIlIIII(Bank.getFirst((int[])nArray3).getQuantity(), lllIlIlIll[67])) break block19;
                                    }
                                    var8 = new d(lllIlIlIll[19], lllIlIlIll[121], e.c(lllIlIlIll[122], lllIlIlIll[123]));
                                    bu.add((d)var8);
                                    0;
                                }
                                int[] nArray = new int[lllIlIlIll[1]];
                                nArray[X.lllIlIlIll[0]] = lllIlIlIll[17];
                                if (!X.llIIIllIIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                int[] nArray4 = new int[lllIlIlIll[1]];
                                nArray4[X.lllIlIlIll[0]] = lllIlIlIll[17];
                                if (!X.llIIIllIIllll(Bank.contains((int[])nArray4) ? 1 : 0)) break block17;
                                int[] nArray5 = new int[lllIlIlIll[1]];
                                nArray5[X.lllIlIlIll[0]] = lllIlIlIll[17];
                                if (!X.llIIIllIlIIII(Bank.getFirst((int[])nArray5).getQuantity(), lllIlIlIll[121])) break block17;
                            }
                            var8 = new d(lllIlIlIll[17], lllIlIlIll[23], lllIlIlIll[67]);
                            bu.add((d)var8);
                            0;
                        }
                        if (!X.llIIIllIlIlII(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIlIlIll[16])) break block21;
                        int[] nArray = new int[lllIlIlIll[1]];
                        nArray[X.lllIlIlIll[0]] = lllIlIlIll[21];
                        if (!X.llIIIllIIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block22;
                        int[] nArray6 = new int[lllIlIlIll[1]];
                        nArray6[X.lllIlIlIll[0]] = lllIlIlIll[21];
                        if (!X.llIIIllIIllll(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                        int[] nArray7 = new int[lllIlIlIll[1]];
                        nArray7[X.lllIlIlIll[0]] = lllIlIlIll[21];
                        if (!X.llIIIllIlIIII(Bank.getFirst((int[])nArray7).getQuantity(), lllIlIlIll[121])) break block21;
                    }
                    var8 = new d(lllIlIlIll[21], lllIlIlIll[124], lllIlIlIll[125]);
                    bu.add((d)var8);
                    0;
                }
                int[] nArray = new int[lllIlIlIll[1]];
                nArray[X.lllIlIlIll[0]] = lllIlIlIll[14];
                if (!X.llIIIllIIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                int[] nArray8 = new int[lllIlIlIll[1]];
                nArray8[X.lllIlIlIll[0]] = lllIlIlIll[14];
                if (!X.llIIIllIIllll(Bank.contains((int[])nArray8) ? 1 : 0)) break block24;
                int[] nArray9 = new int[lllIlIlIll[1]];
                nArray9[X.lllIlIlIll[0]] = lllIlIlIll[14];
                if (!X.llIIIllIlIIII(Bank.getFirst((int[])nArray9).getQuantity(), lllIlIlIll[67])) break block24;
            }
            var8 = new d(lllIlIlIll[14], lllIlIlIll[126], lllIlIlIll[127]);
            bu.add((d)var8);
            0;
        }
        int[] nArray = new int[lllIlIlIll[1]];
        nArray[X.lllIlIlIll[0]] = lllIlIlIll[12];
        if (X.llIIIllIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            var8 = new d(lllIlIlIll[12], lllIlIlIll[1], lllIlIlIll[128]);
            bu.add((d)var8);
            0;
        }
        int[] nArray10 = new int[lllIlIlIll[1]];
        nArray10[X.lllIlIlIll[0]] = lllIlIlIll[10];
        if (X.llIIIllIlIIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
            var8 = new d(lllIlIlIll[10], lllIlIlIll[1], lllIlIlIll[128]);
            bu.add((d)var8);
            0;
        }
        if (X.llIIIllIlIIIl(Bank.contains((Predicate)(var8 = item -> item.getName().toLowerCase().contains(lllIlIlIIl[lllIlIlIll[136]]))) ? 1 : 0)) {
            var15 = new d(lllIlIlIll[28], lllIlIlIll[39], lllIlIlIll[129]);
            bu.add((d)var15);
            0;
        }
        if (X.llIIIllIlIIIl(Bank.contains(var15 = item -> item.getName().toLowerCase().contains(lllIlIlIIl[lllIlIlIll[135]])) ? 1 : 0)) {
            var5 = new d(lllIlIlIll[130], lllIlIlIll[2], lllIlIlIll[26]);
            bu.add(var5);
            0;
        }
        int[] nArray11 = new int[lllIlIlIll[1]];
        nArray11[X.lllIlIlIll[0]] = lllIlIlIll[131];
        if (X.llIIIllIlIIIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
            var5 = new d(lllIlIlIll[131], lllIlIlIll[67], lllIlIlIll[132]);
            bu.add(var5);
            0;
        }
    }

    private static boolean llIIIllIllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIIllIlIIlI(Object object) {
        return object != null;
    }

    private static boolean llIIIllIlIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void llIIIllIIlllI() {
        lllIlIlIll = new int[143];
        X.lllIlIlIll[0] = (0x23 ^ 0x3F) & ~(0xB3 ^ 0xAF);
        X.lllIlIlIll[1] = 1;
        X.lllIlIlIll[2] = 2;
        X.lllIlIlIll[3] = 3;
        X.lllIlIlIll[4] = -(0xFFFFF29B & 0x1DEF) & (0xFFFFF7BF & 0x39FE);
        X.lllIlIlIll[5] = 0x6D ^ 0x69;
        X.lllIlIlIll[6] = 0x43 ^ 0x46;
        X.lllIlIlIll[7] = 0xFFFF9FB8 & 0x73CF;
        X.lllIlIlIll[8] = -(0xFFFF97EB & 0x785C) & (0xFFFFDBFF & 0x3FFF);
        X.lllIlIlIll[9] = 0xA ^ 0xC;
        X.lllIlIlIll[10] = 0xFFFFEFDF & 0x327A;
        X.lllIlIlIll[11] = 0xA ^ 0xD;
        X.lllIlIlIll[12] = 0xFFFFBDAB & 0x4B7F;
        X.lllIlIlIll[13] = 0xF ^ 7;
        X.lllIlIlIll[14] = -(0xFFFFFF4B & 0x60B5) & (0xFFFFFFDF & 0x7F6D);
        X.lllIlIlIll[15] = 0x20 ^ 0x40 ^ (0xD1 ^ 0xB8);
        X.lllIlIlIll[16] = 118 + 130 - 196 + 115 ^ 31 + 53 - -58 + 34;
        X.lllIlIlIll[17] = -(0xFFFFAE7D & 0x7D8E) & (0xFFFFBEFF & 0x7FDF);
        X.lllIlIlIll[18] = 0x38 ^ 0x32;
        X.lllIlIlIll[19] = -(0xFFFFDCDB & 0x7F2D) & (0xFFFFDFC8 & Short.MAX_VALUE);
        X.lllIlIlIll[20] = 104 + 37 - 16 + 20 ^ 129 + 100 - 78 + 3;
        X.lllIlIlIll[21] = 0xFFFFE7DE & 0x3A6B;
        X.lllIlIlIll[22] = 0x8F ^ 0xAA ^ (0x69 ^ 0x40);
        X.lllIlIlIll[23] = 0xFFFFE3E9 & 0x1FFE;
        X.lllIlIlIll[24] = -(0xFFFFFED3 & 0x51FF) & (0xFFFFFDFF & 0x53FE);
        X.lllIlIlIll[25] = -(0x1B ^ 0xE) & (0xFFFFC7FF & 0x3BF7);
        X.lllIlIlIll[26] = 0xFFFFEDBE & 0x73E9;
        X.lllIlIlIll[27] = 0x33 ^ 0x7D ^ (0x57 ^ 5);
        X.lllIlIlIll[28] = 0xFFFFEBFE & 0x1DF9;
        X.lllIlIlIll[29] = 0x8F ^ 0x82;
        X.lllIlIlIll[30] = 0x24 ^ 0x2A;
        X.lllIlIlIll[31] = 0xFFFFBFF6 & 0x42EB;
        X.lllIlIlIll[32] = 124 + 34 - 44 + 87 ^ 162 + 6 - 82 + 112;
        X.lllIlIlIll[33] = 0xD4 ^ 0xC4;
        X.lllIlIlIll[34] = 0x8B ^ 0x9A;
        X.lllIlIlIll[35] = -(0xFFFFD3F2 & 0x6D0F) & (0xFFFFFD7F & 0x7FF7);
        X.lllIlIlIll[36] = 108 + 2 - 70 + 92 ^ 93 + 100 - 56 + 13;
        X.lllIlIlIll[37] = 0x81 ^ 0x92;
        X.lllIlIlIll[38] = 0xFFFF9FAF & 0x71FD;
        X.lllIlIlIll[39] = 0x16 ^ 2 ^ (0x6C ^ 0x7D) & ~(0x3D ^ 0x2C);
        X.lllIlIlIll[40] = 0x60 ^ 0x75;
        X.lllIlIlIll[41] = 0x63 ^ 0x75 ^ (0x16 ^ 0x40) & ~(0xEA ^ 0xBC);
        X.lllIlIlIll[42] = -(0xFFFFFE1D & 0x2BF3) & (0xFFFFFFFD & 0x3BB7);
        X.lllIlIlIll[43] = 112 + 60 - 99 + 71 ^ 14 + 39 - -19 + 64;
        X.lllIlIlIll[44] = -(0xFFFFEF97 & 0x167D) & (0xFFFFEFDF & 0x17FE);
        X.lllIlIlIll[45] = 0xFFFFB3B7 & 0x5DDC;
        X.lllIlIlIll[46] = 0x27 ^ 0x3E;
        X.lllIlIlIll[47] = -(0xFFFFF57D & 0x6F9F) & (0xFFFFFF7D & 0x7FFE);
        X.lllIlIlIll[48] = 0x64 ^ 0x7E ^ (0xD1 ^ 0xC0) & ~(0x7D ^ 0x6C);
        X.lllIlIlIll[49] = 0xAC ^ 0xC0 ^ (6 ^ 0x71);
        X.lllIlIlIll[50] = 0xFFFFBEAB & 0x7D7F;
        X.lllIlIlIll[51] = 0x61 ^ 0x2E ^ (0xEF ^ 0xBD);
        X.lllIlIlIll[52] = -(0xFFFFE36F & 0x5EF4) & (0xFFFFE7FF & 0x7F7F);
        X.lllIlIlIll[53] = 110 + 147 - 115 + 8 ^ 79 + 111 - 95 + 41;
        X.lllIlIlIll[54] = 0xFFFFF6FD & 0x3DFF;
        X.lllIlIlIll[55] = 0xF2 ^ 0xA2 ^ (0x25 ^ 0x6A);
        X.lllIlIlIll[56] = 0x8E ^ 0xAE;
        X.lllIlIlIll[57] = 0x2F ^ 0xE;
        X.lllIlIlIll[58] = 0xE2 ^ 0xC0;
        X.lllIlIlIll[59] = -(0xFFFFD5F5 & 0x6E2B) & (0xFFFFFFE3 & Short.MAX_VALUE);
        X.lllIlIlIll[60] = 0xFFFFBDF4 & 0x5B6F;
        X.lllIlIlIll[61] = 0x4E ^ 0x78 ^ (0x99 ^ 0x8C);
        X.lllIlIlIll[62] = -(0xFFFFADAB & 0x5E57) & (0xFFFFBFF7 & Short.MAX_VALUE);
        X.lllIlIlIll[63] = 0x71 ^ 0xF ^ (0x76 ^ 0x2C);
        X.lllIlIlIll[64] = 0x41 ^ 0x64;
        X.lllIlIlIll[65] = 0x47 ^ 0x61;
        X.lllIlIlIll[66] = 3 ^ 0x24;
        X.lllIlIlIll[67] = 0x41 ^ 0x69;
        X.lllIlIlIll[68] = 0xA4 ^ 0x8D;
        X.lllIlIlIll[69] = -(0xFFFFA3E7 & 0x5D1A) & (0xFFFFFDFF & 0x37FF);
        X.lllIlIlIll[70] = 0x22 ^ 0x64 ^ (0x5C ^ 0x30);
        X.lllIlIlIll[71] = 0x55 ^ 0x7E;
        X.lllIlIlIll[72] = 146 + 58 - 148 + 100 ^ 158 + 98 - 160 + 80;
        X.lllIlIlIll[73] = 111 + 89 - 176 + 106 ^ 69 + 13 - 38 + 131;
        X.lllIlIlIll[74] = 154 + 204 - 290 + 144;
        X.lllIlIlIll[75] = -(0xFFFFFE56 & 0x4BBB) & (0xFFFFDFF7 & 0x6BBF);
        X.lllIlIlIll[76] = 0 ^ 0x74;
        X.lllIlIlIll[77] = 0x9C ^ 0xB2;
        X.lllIlIlIll[78] = -(0xFFFFFF87 & 0x62FE) & (0xFFFFE7FF & 0x7BF7);
        X.lllIlIlIll[79] = 0xAE ^ 0x8B ^ (0xA1 ^ 0xAB);
        X.lllIlIlIll[80] = 30 + 185 - 188 + 219 ^ 97 + 73 - 143 + 156;
        X.lllIlIlIll[81] = 155 + 127 - 102 + 9 ^ 102 + 140 - 135 + 34;
        X.lllIlIlIll[82] = 0xD3 ^ 0x88;
        X.lllIlIlIll[83] = 94 + 145 - 105 + 31 ^ 57 + 121 - 39 + 9;
        X.lllIlIlIll[84] = 0 + 77 - -37 + 16 ^ 146 + 40 - 77 + 67;
        X.lllIlIlIll[85] = 0x7E ^ 0x21 ^ (2 ^ 0x6E);
        X.lllIlIlIll[86] = 0xB6 ^ 0x88;
        X.lllIlIlIll[87] = 0x16 ^ 0x22;
        X.lllIlIlIll[88] = 0x12 ^ 0x27;
        X.lllIlIlIll[89] = 0xB8 ^ 0x9F ^ (0xD6 ^ 0xC7);
        X.lllIlIlIll[90] = 0x2D ^ 6 ^ (0xBE ^ 0xA2);
        X.lllIlIlIll[91] = 0x42 ^ 0x5A ^ (0xA ^ 0x2A);
        X.lllIlIlIll[92] = 0x39 ^ 0x6A;
        X.lllIlIlIll[93] = 0xB9 ^ 0x80;
        X.lllIlIlIll[94] = 8 + 117 - 105 + 157 ^ 104 + 5 - -26 + 4;
        X.lllIlIlIll[95] = 0x5B ^ 0x60;
        X.lllIlIlIll[96] = 0x3E ^ 2;
        X.lllIlIlIll[97] = 0xFA ^ 0xC7;
        X.lllIlIlIll[98] = 0x5A ^ 0x66 ^ 3;
        X.lllIlIlIll[99] = 23 + 58 - -34 + 96 ^ 101 + 96 - 181 + 131;
        X.lllIlIlIll[100] = -(0xFFFFAB5B & 0x57F5) & (0xFFFFBF79 & Short.MAX_VALUE);
        X.lllIlIlIll[101] = 0xFFFFFBDD & 0x3FE7;
        X.lllIlIlIll[102] = 0xFFFFBFDE & 0x7BE3;
        X.lllIlIlIll[103] = 0xFFFFCEC1 & 0x39BE;
        X.lllIlIlIll[104] = 0x46 ^ 0x37 ^ (0x5C ^ 0x6F);
        X.lllIlIlIll[105] = 0x16 ^ 0x55;
        X.lllIlIlIll[106] = 0xF6 ^ 0xB2;
        X.lllIlIlIll[107] = 0xB ^ 0x79 ^ (0x9B ^ 0xAC);
        X.lllIlIlIll[108] = 0x10 ^ 0 ^ (0x55 ^ 3);
        X.lllIlIlIll[109] = 146 + 75 - 32 + 58 ^ 175 + 172 - 289 + 118;
        X.lllIlIlIll[110] = 0x77 ^ 0x3F;
        X.lllIlIlIll[111] = 0xDE ^ 0x97;
        X.lllIlIlIll[112] = 0x24 ^ 0x6E;
        X.lllIlIlIll[113] = 0x7B ^ 0x25 ^ (0x92 ^ 0x87);
        X.lllIlIlIll[114] = 0xC8 ^ 0xA6 ^ (0xE0 ^ 0xC2);
        X.lllIlIlIll[115] = 0x68 ^ 0x25;
        X.lllIlIlIll[116] = 0xE ^ 0x74 ^ (0xA6 ^ 0x92);
        X.lllIlIlIll[117] = 0x59 ^ 0x16;
        X.lllIlIlIll[118] = 0x14 ^ 0x44;
        X.lllIlIlIll[119] = 138 + 108 - 98 + 105 ^ 153 + 47 - 190 + 162;
        X.lllIlIlIll[120] = 0x74 ^ 0x7C ^ (0xDC ^ 0x86);
        X.lllIlIlIll[121] = -(0xFFFFC07D & 0x7FF6) & (0xFFFFD17F & 0x6FF7);
        X.lllIlIlIll[122] = 0xFFFFD3BB & 0x2DFC;
        X.lllIlIlIll[123] = 0xFFFFD3FA & 0x2DD7;
        X.lllIlIlIll[124] = 0xFFFFA5FC & 0x5BF7;
        X.lllIlIlIll[125] = 0xFFFF8FCC & 0x7277;
        X.lllIlIlIll[126] = 86 + 221 - 73 + 16;
        X.lllIlIlIll[127] = -(0xFFFFBE1C & 0x6DFB) & (0xFFFFBFFF & 0x6EBF);
        X.lllIlIlIll[128] = -(0xFFFFDA7F & 0x27BD) & (0xFFFFFF7D & 0x17FE);
        X.lllIlIlIll[129] = -(0xFFFFE8BE & 0x3F4F) & (0xFFFFBFDF & 0x6FFD);
        X.lllIlIlIll[130] = -(0x3D ^ 0x2E) & (0xFFFFEFFF & 0x3EDE);
        X.lllIlIlIll[131] = 0xFFFFDF47 & 0x3FFF;
        X.lllIlIlIll[132] = -(0xFFFFF669 & 0x5D97) & (0xFFFFDFFE & 0x7785);
        X.lllIlIlIll[133] = 133 + 61 - 132 + 134 ^ 69 + 149 - 112 + 54;
        X.lllIlIlIll[134] = 0x68 ^ 0xB;
        X.lllIlIlIll[135] = 0xB3 ^ 0x99 ^ (0x31 ^ 0x4F);
        X.lllIlIlIll[136] = 0x59 ^ 0xC;
        X.lllIlIlIll[137] = 0x97 ^ 0xC1;
        X.lllIlIlIll[138] = 0xFFFFCCF9 & 0x3FAE;
        X.lllIlIlIll[139] = 0xFFFF9DBB & 0x6FD6;
        X.lllIlIlIll[140] = 116 + 46 - -61 + 1 ^ 25 + 121 - 17 + 54;
        X.lllIlIlIll[141] = 0x77 ^ 0x2F;
        X.lllIlIlIll[142] = 0x32 ^ 9 ^ (0xF6 ^ 0x94);
    }

    private static boolean llIIIllIlIIll(int n2) {
        return n2 > 0;
    }

    @Override
    public int T() {
        try {
            X.dE();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-(145 + 54 - 194 + 155 ^ 71 + 16 - 22 + 99) >= 0) {
            return ((0x4A ^ 0x17) & ~(0x17 ^ 0x4A) ^ (0x52 ^ 0x4C)) & (67 + 150 - 59 + 9 ^ 137 + 70 - 186 + 164 ^ -1);
        }
        return lllIlIlIll[133];
    }

    @Override
    public boolean V() {
        boolean bl;
        if (X.llIIIllIlIlII(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIlIlIll[134])) {
            bl = lllIlIlIll[1];
            0;
            if (((1 ^ 0x4C) & ~(0xC5 ^ 0x88)) != 0) {
                return false;
            }
        } else {
            bl = lllIlIlIll[0];
        }
        return bl;
    }

    static boolean dI() {
        boolean bl;
        int[] nArray = new int[lllIlIlIll[1]];
        nArray[X.lllIlIlIll[0]] = lllIlIlIll[100];
        if (X.llIIIllIlIIlI(TileObjects.getNearest((int[])nArray))) {
            bl = lllIlIlIll[1];
            0;
            if ((0x21 ^ 0x24) <= 0) {
                return false;
            }
        } else {
            bl = lllIlIlIll[0];
        }
        return bl;
    }

    private static void dG() {
        AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[73]];
        if (X.llIIIllIlIIIl(X.dI() ? 1 : 0)) {
            if (X.llIIIllIIllll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (X.llIIIllIIllll(Widgets.get((int)lllIlIlIll[74]).isEmpty() ? 1 : 0) && X.llIIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                if (X.llIIIllIlIlll(Widgets.get((int)lllIlIlIll[75], (int)lllIlIlIll[6]))) {
                    if (X.llIIIllIlIIlI(Widgets.get((int)lllIlIlIll[76], (int)lllIlIlIll[55]))) {
                        Widgets.get((int)lllIlIlIll[76], (int)lllIlIlIll[55]).interact(lllIlIlIIl[lllIlIlIll[77]]);
                        Time.sleepTicks((int)lllIlIlIll[2]);
                        0;
                    }
                    if (X.llIIIllIlIIlI(Widgets.get((int)lllIlIlIll[78], (int)lllIlIlIll[1]))) {
                        Widgets.get((int)lllIlIlIll[78], (int)lllIlIlIll[1]).interact(lllIlIlIIl[lllIlIlIll[79]]);
                        Time.sleepTicks((int)lllIlIlIll[5]);
                        0;
                    }
                }
                if (X.llIIIllIlIIlI(Widgets.get((int)lllIlIlIll[75], (int)lllIlIlIll[6]))) {
                    String[] stringArray = new String[lllIlIlIll[1]];
                    stringArray[X.lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[81]];
                    if (X.llIIIllIlIIIl(Widgets.get((int)lllIlIlIll[75], (int)lllIlIlIll[80]).hasAction(stringArray) ? 1 : 0)) {
                        Widgets.get((int)lllIlIlIll[75], (int)lllIlIlIll[6]).getChild(lllIlIlIll[82]).interact(lllIlIlIIl[lllIlIlIll[83]]);
                        Time.sleepTicks((int)lllIlIlIll[3]);
                        0;
                    }
                }
            }
            if (X.llIIIllIlIIIl(Widgets.get((int)lllIlIlIll[74]).isEmpty() ? 1 : 0) && X.llIIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                Widgets.get((int)lllIlIlIll[74], (int)lllIlIlIll[15]).interact(lllIlIlIIl[lllIlIlIll[84]]);
                Time.sleepTicks((int)lllIlIlIll[6]);
                0;
            }
            if (X.llIIIllIlIIlI(Widgets.get((int)lllIlIlIll[75], (int)lllIlIlIll[6]))) {
                String[] stringArray = new String[lllIlIlIll[1]];
                stringArray[X.lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[85]];
                if (X.llIIIllIIllll(Widgets.get((int)lllIlIlIll[75], (int)lllIlIlIll[80]).hasAction(stringArray) ? 1 : 0)) {
                    Widgets.get((int)lllIlIlIll[75], (int)lllIlIlIll[86]).interact(lllIlIlIIl[lllIlIlIll[87]]);
                    Time.sleepTicks((int)lllIlIlIll[2]);
                    0;
                    Widgets.get((int)lllIlIlIll[75], (int)lllIlIlIll[80]).interact(lllIlIlIIl[lllIlIlIll[88]]);
                    Time.sleepTicks((int)lllIlIlIll[3]);
                    0;
                }
            }
        }
        if (X.llIIIllIlIIIl(X.dJ() ? 1 : 0) && X.llIIIllIIllll(X.dI() ? 1 : 0)) {
            if (X.llIIIllIIllll(Widgets.get((int)lllIlIlIll[74]).isEmpty() ? 1 : 0) && X.llIIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                if (X.llIIIllIlIlll(Widgets.get((int)lllIlIlIll[75], (int)lllIlIlIll[6]))) {
                    if (X.llIIIllIlIIlI(Widgets.get((int)lllIlIlIll[76], (int)lllIlIlIll[55]))) {
                        Widgets.get((int)lllIlIlIll[76], (int)lllIlIlIll[55]).interact(lllIlIlIIl[lllIlIlIll[89]]);
                        Time.sleepTicks((int)lllIlIlIll[2]);
                        0;
                    }
                    if (X.llIIIllIlIIlI(Widgets.get((int)lllIlIlIll[78], (int)lllIlIlIll[1]))) {
                        Widgets.get((int)lllIlIlIll[78], (int)lllIlIlIll[1]).interact(lllIlIlIIl[lllIlIlIll[90]]);
                        Time.sleepTicks((int)lllIlIlIll[5]);
                        0;
                    }
                }
                if (X.llIIIllIlIIlI(Widgets.get((int)lllIlIlIll[75], (int)lllIlIlIll[6]))) {
                    String[] stringArray = new String[lllIlIlIll[1]];
                    stringArray[X.lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[91]];
                    if (X.llIIIllIlIIIl(Widgets.get((int)lllIlIlIll[75], (int)lllIlIlIll[80]).hasAction(stringArray) ? 1 : 0)) {
                        Widgets.get((int)lllIlIlIll[75], (int)lllIlIlIll[6]).getChild(lllIlIlIll[92]).interact(lllIlIlIIl[lllIlIlIll[93]]);
                        Time.sleepTicks((int)lllIlIlIll[3]);
                        0;
                    }
                }
            }
            if (X.llIIIllIlIIIl(Widgets.get((int)lllIlIlIll[74]).isEmpty() ? 1 : 0) && X.llIIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                Widgets.get((int)lllIlIlIll[74], (int)lllIlIlIll[20]).interact(lllIlIlIIl[lllIlIlIll[94]]);
                Time.sleepTicks((int)lllIlIlIll[6]);
                0;
            }
            if (X.llIIIllIlIIlI(Widgets.get((int)lllIlIlIll[75], (int)lllIlIlIll[6]))) {
                String[] stringArray = new String[lllIlIlIll[1]];
                stringArray[X.lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[95]];
                if (X.llIIIllIIllll(Widgets.get((int)lllIlIlIll[75], (int)lllIlIlIll[80]).hasAction(stringArray) ? 1 : 0)) {
                    Widgets.get((int)lllIlIlIll[75], (int)lllIlIlIll[86]).interact(lllIlIlIIl[lllIlIlIll[96]]);
                    Time.sleepTicks((int)lllIlIlIll[2]);
                    0;
                    Widgets.get((int)lllIlIlIll[75], (int)lllIlIlIll[80]).interact(lllIlIlIIl[lllIlIlIll[97]]);
                    Time.sleepTicks((int)lllIlIlIll[3]);
                    0;
                }
            }
        }
        String[] stringArray = new String[lllIlIlIll[1]];
        stringArray[X.lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[86]];
        g.a(stringArray);
    }

    private static boolean llIIIllIlIIIl(int n2) {
        return n2 == 0;
    }

    public static void dE() {
        block39: {
            BankLocation var19;
            block40: {
                block41: {
                    block42: {
                        Predicate<Item> var2;
                        if (X.llIIIllIIllll(bs ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[0]];
                            b.a(bu);
                            if (X.llIIIllIlIIII(bu.size(), lllIlIlIll[1])) {
                                System.out.println(lllIlIlIIl[lllIlIlIll[1]]);
                                bs = lllIlIlIll[0];
                            }
                        }
                        if (!X.llIIIllIlIIIl(bs ? 1 : 0)) break block39;
                        if (!X.llIIIllIlIIIl(X.aa() ? 1 : 0)) break block40;
                        var19 = BankLocation.getNearest();
                        if (X.llIIIllIlIIlI(var19) && X.llIIIllIlIIIl(var19.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[2]];
                            if (X.llIIIllIIllll(Equipment.contains((int[])f.aM) ? 1 : 0)) {
                                Equipment.getFirst((int[])f.aM).interact(lllIlIlIIl[lllIlIlIll[3]]);
                                Time.sleepUntil(() -> {
                                    boolean bl;
                                    int[] nArray = new int[lllIlIlIll[1]];
                                    nArray[X.lllIlIlIll[0]] = lllIlIlIll[38];
                                    if (X.llIIIllIlIlll(TileObjects.getNearest((int[])nArray))) {
                                        bl = lllIlIlIll[1];
                                        0;
                                        if (-(0xE1 ^ 0xBB ^ (0x28 ^ 0x76)) >= 0) {
                                            return ((0x45 ^ 0x18 ^ (0x17 ^ 6)) & (0x48 ^ 0x40 ^ (0x62 ^ 0x26) ^ -1)) != 0;
                                        }
                                    } else {
                                        bl = lllIlIlIll[0];
                                    }
                                    return bl;
                                }, (int)lllIlIlIll[4]);
                                0;
                            }
                            if (X.llIIIllIlIIIl(Equipment.contains((int[])f.aM) ? 1 : 0) && X.llIIIllIIllll(Inventory.contains((int[])f.aM) ? 1 : 0)) {
                                Inventory.getFirst((int[])f.aM).interact(lllIlIlIIl[lllIlIlIll[5]]);
                            }
                            if (X.llIIIllIlIIIl(Equipment.contains((int[])f.aM) ? 1 : 0) && X.llIIIllIlIIIl(Inventory.contains((int[])f.aM) ? 1 : 0)) {
                                a.a(var19);
                                Time.sleepTicks((int)lllIlIlIll[1]);
                                0;
                            }
                        }
                        if (!X.llIIIllIlIIlI(var19) || !X.llIIIllIIllll(var19.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block40;
                        AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[6]];
                        if (X.llIIIllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lllIlIlIll[7]);
                            0;
                        }
                        if (X.llIIIllIIllll(Bank.isOpen() ? 1 : 0) && X.llIIIllIlIIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (X.llIIIllIlIIIl(Inventory.getAll().size())) {
                                    bl = lllIlIlIll[1];
                                    0;
                                    if (1 == 0) {
                                        return ((0x7A ^ 0x22 ^ (0x6A ^ 0x7C)) & (98 + 69 - -58 + 27 ^ 109 + 16 - 25 + 78 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lllIlIlIll[0];
                                }
                                return bl;
                            }, (int)lllIlIlIll[8]);
                            0;
                            Time.sleepTicks((int)lllIlIlIll[1]);
                            0;
                        }
                        if (X.llIIIllIlIIIl(Bank.contains(var2 = item -> item.getName().toLowerCase().contains(lllIlIlIIl[lllIlIlIll[137]])) ? 1 : 0)) {
                            X.ae();
                            System.out.println(lllIlIlIIl[lllIlIlIll[9]]);
                            bs = lllIlIlIll[1];
                            return;
                        }
                        int[] nArray = new int[lllIlIlIll[1]];
                        nArray[X.lllIlIlIll[0]] = lllIlIlIll[10];
                        if (X.llIIIllIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            X.ae();
                            System.out.println(lllIlIlIIl[lllIlIlIll[11]]);
                            bs = lllIlIlIll[1];
                            return;
                        }
                        int[] nArray2 = new int[lllIlIlIll[1]];
                        nArray2[X.lllIlIlIll[0]] = lllIlIlIll[12];
                        if (X.llIIIllIlIIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            X.ae();
                            System.out.println(lllIlIlIIl[lllIlIlIll[13]]);
                            bs = lllIlIlIll[1];
                            return;
                        }
                        int[] nArray3 = new int[lllIlIlIll[1]];
                        nArray3[X.lllIlIlIll[0]] = lllIlIlIll[14];
                        if (X.llIIIllIlIIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[lllIlIlIll[1]];
                            nArray4[X.lllIlIlIll[0]] = lllIlIlIll[14];
                            if (X.llIIIllIlIIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                                X.ae();
                                System.out.println(lllIlIlIIl[lllIlIlIll[15]]);
                                bs = lllIlIlIll[1];
                                return;
                            }
                        }
                        if (X.llIIIllIlIIII(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIlIlIll[16])) {
                            int[] nArray5 = new int[lllIlIlIll[1]];
                            nArray5[X.lllIlIlIll[0]] = lllIlIlIll[17];
                            if (X.llIIIllIlIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                X.ae();
                                System.out.println(lllIlIlIIl[lllIlIlIll[18]]);
                                bs = lllIlIlIll[1];
                                return;
                            }
                            int[] nArray6 = new int[lllIlIlIll[1]];
                            nArray6[X.lllIlIlIll[0]] = lllIlIlIll[19];
                            if (X.llIIIllIlIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                X.ae();
                                System.out.println(lllIlIlIIl[lllIlIlIll[20]]);
                                bs = lllIlIlIll[1];
                                return;
                            }
                        }
                        if (!X.llIIIllIlIlII(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIlIlIll[16])) break block41;
                        int[] nArray7 = new int[lllIlIlIll[1]];
                        nArray7[X.lllIlIlIll[0]] = lllIlIlIll[21];
                        if (!X.llIIIllIIllll(Bank.contains((int[])nArray7) ? 1 : 0)) break block42;
                        int[] nArray8 = new int[lllIlIlIll[1]];
                        nArray8[X.lllIlIlIll[0]] = lllIlIlIll[21];
                        if (!X.llIIIllIIllll(Bank.contains((int[])nArray8) ? 1 : 0)) break block41;
                        int[] nArray9 = new int[lllIlIlIll[1]];
                        nArray9[X.lllIlIlIll[0]] = lllIlIlIll[21];
                        if (!X.llIIIllIlIIII(Bank.getFirst((int[])nArray9).getQuantity(), lllIlIlIll[13])) break block41;
                    }
                    X.ae();
                    System.out.println(lllIlIlIIl[lllIlIlIll[22]]);
                    bs = lllIlIlIll[1];
                    return;
                }
                if (X.llIIIllIlIIIl(Equipment.contains((int[])f.aM) ? 1 : 0) && X.llIIIllIlIIIl(Inventory.contains((int[])f.aM) ? 1 : 0)) {
                    a.b(f.aM, lllIlIlIll[1]);
                    Time.sleepTicks((int)lllIlIlIll[1]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIlIlIll[1]];
                        nArray[X.lllIlIlIll[0]] = lllIlIlIll[28];
                        if (X.llIIIllIlIIll(Inventory.getCount((int[])nArray))) {
                            bl = lllIlIlIll[1];
                            0;
                            if ((0xC7 ^ 0xC3) == 0) {
                                return false;
                            }
                        } else {
                            bl = lllIlIlIll[0];
                        }
                        return bl;
                    }, (int)lllIlIlIll[7]);
                    0;
                }
                if (X.llIIIllIlIIII(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIlIlIll[16])) {
                    a.a(lllIlIlIll[17], lllIlIlIll[23]);
                    a.a(lllIlIlIll[14], lllIlIlIll[24]);
                    a.a(lllIlIlIll[10], lllIlIlIll[1]);
                    a.a(lllIlIlIll[12], lllIlIlIll[1]);
                    a.a(lllIlIlIll[25], lllIlIlIll[26]);
                    a.a(lllIlIlIll[19], lllIlIlIll[27]);
                }
                if (X.llIIIllIlIlII(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIlIlIll[16])) {
                    a.a(lllIlIlIll[14], lllIlIlIll[24]);
                    a.a(lllIlIlIll[10], lllIlIlIll[1]);
                    a.a(lllIlIlIll[12], lllIlIlIll[1]);
                    a.a(lllIlIlIll[21], lllIlIlIll[27]);
                }
            }
            if (X.llIIIllIIllll(X.aa() ? 1 : 0)) {
                int[] nArray = new int[lllIlIlIll[1]];
                nArray[X.lllIlIlIll[0]] = lllIlIlIll[28];
                if (X.llIIIllIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray10 = new int[lllIlIlIll[1]];
                    nArray10[X.lllIlIlIll[0]] = lllIlIlIll[28];
                    if (X.llIIIllIlIIIl(Equipment.contains((int[])nArray10) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[29]];
                        Bank.close();
                        Time.sleepTicks((int)lllIlIlIll[1]);
                        0;
                        int[] nArray11 = new int[lllIlIlIll[1]];
                        nArray11[X.lllIlIlIll[0]] = lllIlIlIll[28];
                        var19 = Inventory.getFirst((int[])nArray11);
                        if (X.llIIIllIlIIlI(var19)) {
                            var19.interact(lllIlIlIIl[lllIlIlIll[30]]);
                            Time.sleepTicks((int)lllIlIlIll[3]);
                            0;
                        }
                    }
                }
                if (X.llIIIllIlIIII(e.j(lllIlIlIll[31]), lllIlIlIll[1])) {
                    if (X.llIIIllIIllll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (X.llIIIllIlIlIl(Players.getLocal().getWorldLocation().distanceTo(jf), lllIlIlIll[2]) && X.llIIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[32]];
                        Movement.walkTo((WorldPoint)jf);
                        0;
                        Time.sleepTicks((int)lllIlIlIll[1]);
                        0;
                    }
                    if (X.llIIIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(jf), lllIlIlIll[3])) {
                        AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[33]];
                        g.a(lllIlIlIIl[lllIlIlIll[34]], bQ);
                    }
                }
                if (X.llIIIllIlIIll(e.j(lllIlIlIll[31]))) {
                    int[] nArray12 = new int[lllIlIlIll[1]];
                    nArray12[X.lllIlIlIll[0]] = lllIlIlIll[35];
                    if (X.llIIIllIlIIlI(TileObjects.getNearest((int[])nArray12))) {
                        AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[36]];
                        int[] nArray13 = new int[lllIlIlIll[1]];
                        nArray13[X.lllIlIlIll[0]] = lllIlIlIll[35];
                        TileObjects.getNearest((int[])nArray13).interact(lllIlIlIIl[lllIlIlIll[37]]);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllIlIlIll[1]];
                            nArray[X.lllIlIlIll[0]] = lllIlIlIll[38];
                            if (X.llIIIllIlIIlI(TileObjects.getNearest((int[])nArray))) {
                                bl = lllIlIlIll[1];
                                0;
                                if (-2 > 0) {
                                    return ((0x9D ^ 0xC0 ^ (0x6B ^ 0x15)) & (155 + 147 - 270 + 125 ^ 8 + 131 - 25 + 76 ^ -1)) != 0;
                                }
                            } else {
                                bl = lllIlIlIll[0];
                            }
                            return bl;
                        }, (int)lllIlIlIll[4]);
                        0;
                    }
                    int[] nArray14 = new int[lllIlIlIll[1]];
                    nArray14[X.lllIlIlIll[0]] = lllIlIlIll[38];
                    if (X.llIIIllIlIlll(TileObjects.getNearest((int[])nArray14))) {
                        int[] nArray15 = new int[lllIlIlIll[1]];
                        nArray15[X.lllIlIlIll[0]] = lllIlIlIll[35];
                        if (X.llIIIllIlIlll(TileObjects.getNearest((int[])nArray15))) {
                            AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[39]];
                            Bank.close();
                            int[] nArray16 = new int[lllIlIlIll[1]];
                            nArray16[X.lllIlIlIll[0]] = lllIlIlIll[14];
                            Inventory.getFirst((int[])nArray16).interact(lllIlIlIIl[lllIlIlIll[40]]);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lllIlIlIll[1]];
                                nArray[X.lllIlIlIll[0]] = lllIlIlIll[38];
                                if (X.llIIIllIlIIlI(TileObjects.getNearest((int[])nArray))) {
                                    bl = lllIlIlIll[1];
                                    0;
                                    if (3 != 3) {
                                        return false;
                                    }
                                } else {
                                    bl = lllIlIlIll[0];
                                }
                                return bl;
                            }, (int)lllIlIlIll[4]);
                            0;
                            Time.sleepTicks((int)lllIlIlIll[3]);
                            0;
                        }
                    }
                    int[] nArray17 = new int[lllIlIlIll[1]];
                    nArray17[X.lllIlIlIll[0]] = lllIlIlIll[38];
                    if (X.llIIIllIlIIlI(TileObjects.getNearest((int[])nArray17))) {
                        if (X.llIIIllIlIIIl(X.dL() ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[41]];
                            X.dH();
                        }
                        if (X.llIIIllIIllll(X.dL() ? 1 : 0)) {
                            if (X.llIIIllIlIlII(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIlIlIll[18]) && X.llIIIllIlIIIl(X.dK() ? 1 : 0)) {
                                X.dG();
                            }
                            if (X.llIIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                X.dF();
                            }
                            String[] stringArray = new String[lllIlIlIll[1]];
                            stringArray[X.lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[16]];
                            g.a(stringArray);
                        }
                    }
                }
            }
        }
    }

    private static boolean llIIIllIlIlll(Object object) {
        return object == null;
    }

    private static String llIIIlIllllll(String var14, String var7) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var24 = new StringBuilder();
        char[] var16 = var7.toCharArray();
        int var6 = lllIlIlIll[0];
        char[] var13 = var14.toCharArray();
        int var25 = var13.length;
        int var11 = lllIlIlIll[0];
        while (X.llIIIllIlIIII(var11, var25)) {
            char var22 = var13[var11];
            var24.append((char)(var22 ^ var16[var6 % var16.length]));
            0;
            ++var6;
            ++var11;
            0;
            if (-1 <= 3) continue;
            return null;
        }
        return String.valueOf(var24);
    }

    private static void dF() {
        Widget var20;
        if (X.llIIIllIlIIII(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIlIlIll[18])) {
            int[] nArray = new int[lllIlIlIll[1]];
            nArray[X.lllIlIlIll[0]] = lllIlIlIll[42];
            if (X.llIIIllIlIIlI(TileObjects.getNearest((int[])nArray))) {
                Widget widget;
                AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[43]];
                if (X.llIIIllIlIIIl(Widgets.get((int)lllIlIlIll[44]).isEmpty() ? 1 : 0) && X.llIIIllIlIIlI(widget = Widgets.get((int)lllIlIlIll[44], (int)lllIlIlIll[5]))) {
                    Mouse.click((int)widget.getChild(lllIlIlIll[9]).getClickPoint().getX(), (int)widget.getChild(lllIlIlIll[9]).getClickPoint().getY(), (boolean)lllIlIlIll[1]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIlIlIll[1]];
                        nArray[X.lllIlIlIll[0]] = lllIlIlIll[47];
                        if (X.llIIIllIlIIlI(TileObjects.getNearest((int[])nArray))) {
                            bl = lllIlIlIll[1];
                            0;
                            if (-1 >= ((9 ^ 0xD) & ~(0xAB ^ 0xAF))) {
                                return false;
                            }
                        } else {
                            bl = lllIlIlIll[0];
                        }
                        return bl;
                    }, (int)lllIlIlIll[45]);
                    0;
                }
                if (X.llIIIllIIllll(Widgets.get((int)lllIlIlIll[44]).isEmpty() ? 1 : 0)) {
                    int[] nArray2 = new int[lllIlIlIll[1]];
                    nArray2[X.lllIlIlIll[0]] = lllIlIlIll[42];
                    if (X.llIIIllIlIIlI(TileObjects.getNearest((int[])nArray2))) {
                        int[] nArray3 = new int[lllIlIlIll[1]];
                        nArray3[X.lllIlIlIll[0]] = lllIlIlIll[42];
                        TileObjects.getNearest((int[])nArray3).interact(lllIlIlIIl[lllIlIlIll[46]]);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (X.llIIIllIlIIIl(Widgets.get((int)lllIlIlIll[44]).isEmpty() ? 1 : 0)) {
                                bl = lllIlIlIll[1];
                                0;
                                
                                }
                            } else {
                                bl = lllIlIlIll[0];
                            }
                            return bl;
                        }, (int)lllIlIlIll[45]);
                        0;
                    }
                }
            }
            int[] nArray4 = new int[lllIlIlIll[1]];
            nArray4[X.lllIlIlIll[0]] = lllIlIlIll[47];
            if (X.llIIIllIlIIlI(TileObjects.getNearest((int[])nArray4))) {
                AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[48]];
                if (X.llIIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)lllIlIlIll[1]);
                    0;
                    int[] nArray5 = new int[lllIlIlIll[1]];
                    nArray5[X.lllIlIlIll[0]] = lllIlIlIll[47];
                    TileObjects.getNearest((int[])nArray5).interact(lllIlIlIIl[lllIlIlIll[49]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)lllIlIlIll[45]);
                    0;
                }
                String[] stringArray = new String[lllIlIlIll[1]];
                stringArray[X.lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[27]];
                g.a(stringArray);
            }
        }
        if (X.llIIIllIlIlII(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIlIlIll[18]) && X.llIIIllIlIIII(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIlIlIll[16]) && X.llIIIllIIllll(X.dK() ? 1 : 0)) {
            int[] nArray = new int[lllIlIlIll[1]];
            nArray[X.lllIlIlIll[0]] = lllIlIlIll[50];
            if (X.llIIIllIlIIlI(TileObjects.getNearest((int[])nArray))) {
                AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[51]];
                if (X.llIIIllIlIIIl(Widgets.get((int)lllIlIlIll[44]).isEmpty() ? 1 : 0) && X.llIIIllIlIIlI(var20 = Widgets.get((int)lllIlIlIll[44], (int)lllIlIlIll[5]))) {
                    Mouse.click((int)var20.getChild(lllIlIlIll[9]).getClickPoint().getX(), (int)var20.getChild(lllIlIlIll[9]).getClickPoint().getY(), (boolean)lllIlIlIll[1]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIlIlIll[1]];
                        nArray[X.lllIlIlIll[0]] = lllIlIlIll[50];
                        if (X.llIIIllIlIIlI(TileObjects.getNearest((int[])nArray))) {
                            bl = lllIlIlIll[1];
                            0;
                            if (3 == 0) {
                                return ((0x20 ^ 0x37 ^ (0xC5 ^ 0x8E)) & (0x36 ^ 0x23 ^ (0xCA ^ 0x83) ^ -1)) != 0;
                            }
                        } else {
                            bl = lllIlIlIll[0];
                        }
                        return bl;
                    }, (int)lllIlIlIll[52]);
                    0;
                }
                if (X.llIIIllIIllll(Widgets.get((int)lllIlIlIll[44]).isEmpty() ? 1 : 0)) {
                    int[] nArray6 = new int[lllIlIlIll[1]];
                    nArray6[X.lllIlIlIll[0]] = lllIlIlIll[50];
                    if (X.llIIIllIlIIlI(TileObjects.getNearest((int[])nArray6))) {
                        int[] nArray7 = new int[lllIlIlIll[1]];
                        nArray7[X.lllIlIlIll[0]] = lllIlIlIll[50];
                        TileObjects.getNearest((int[])nArray7).interact(lllIlIlIIl[lllIlIlIll[53]]);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (X.llIIIllIlIIIl(Widgets.get((int)lllIlIlIll[44]).isEmpty() ? 1 : 0)) {
                                bl = lllIlIlIll[1];
                                0;
                                if (((0x2D ^ 0x31 ^ (0x55 ^ 0x41)) & (0x14 ^ 0x79 ^ (0x60 ^ 5) ^ -1)) > 0) {
                                    return (2 & (2 ^ -1)) != 0;
                                }
                            } else {
                                bl = lllIlIlIll[0];
                            }
                            return bl;
                        }, (int)lllIlIlIll[45]);
                        0;
                    }
                }
            }
            int[] nArray8 = new int[lllIlIlIll[1]];
            nArray8[X.lllIlIlIll[0]] = lllIlIlIll[54];
            if (X.llIIIllIlIIlI(TileObjects.getNearest((int[])nArray8))) {
                AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[55]];
                if (X.llIIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)lllIlIlIll[1]);
                    0;
                    int[] nArray9 = new int[lllIlIlIll[1]];
                    nArray9[X.lllIlIlIll[0]] = lllIlIlIll[54];
                    TileObjects.getNearest((int[])nArray9).interact(lllIlIlIIl[lllIlIlIll[56]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)lllIlIlIll[45]);
                    0;
                }
                String[] stringArray = new String[lllIlIlIll[1]];
                stringArray[X.lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[57]];
                g.a(stringArray);
            }
        }
        if (X.llIIIllIlIlII(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIlIlIll[16]) && X.llIIIllIlIIII(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIlIlIll[57]) && X.llIIIllIIllll(X.dK() ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[58]];
            int[] nArray = new int[lllIlIlIll[1]];
            nArray[X.lllIlIlIll[0]] = lllIlIlIll[59];
            if (X.llIIIllIlIIlI(TileObjects.getNearest((int[])nArray))) {
                if (X.llIIIllIlIIIl(Widgets.get((int)lllIlIlIll[44]).isEmpty() ? 1 : 0) && X.llIIIllIlIIlI(var20 = Widgets.get((int)lllIlIlIll[44], (int)lllIlIlIll[6]))) {
                    Mouse.click((int)var20.getChild(lllIlIlIll[5]).getClickPoint().getX(), (int)var20.getChild(lllIlIlIll[5]).getClickPoint().getY(), (boolean)lllIlIlIll[1]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIlIlIll[1]];
                        nArray[X.lllIlIlIll[0]] = lllIlIlIll[62];
                        if (X.llIIIllIlIIlI(TileObjects.getNearest((int[])nArray))) {
                            bl = lllIlIlIll[1];
                            0;
                            if (-2 > 0) {
                                return ((0xC1 ^ 0xA8 ^ (0x9D ^ 0xBA)) & (0x50 ^ 0x77 ^ (0xC3 ^ 0xAA) ^ -1)) != 0;
                            }
                        } else {
                            bl = lllIlIlIll[0];
                        }
                        return bl;
                    }, (int)lllIlIlIll[60]);
                    0;
                }
                if (X.llIIIllIIllll(Widgets.get((int)lllIlIlIll[44]).isEmpty() ? 1 : 0)) {
                    int[] nArray10 = new int[lllIlIlIll[1]];
                    nArray10[X.lllIlIlIll[0]] = lllIlIlIll[59];
                    if (X.llIIIllIlIIlI(TileObjects.getNearest((int[])nArray10))) {
                        int[] nArray11 = new int[lllIlIlIll[1]];
                        nArray11[X.lllIlIlIll[0]] = lllIlIlIll[59];
                        TileObjects.getNearest((int[])nArray11).interact(lllIlIlIIl[lllIlIlIll[61]]);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (X.llIIIllIlIIIl(Widgets.get((int)lllIlIlIll[44]).isEmpty() ? 1 : 0)) {
                                bl = lllIlIlIll[1];
                                0;
                                if (((0x51 ^ 0x62) & ~(0x16 ^ 0x25)) != ((5 ^ 0x35) & ~(0x36 ^ 6))) {
                                    return false;
                                }
                            } else {
                                bl = lllIlIlIll[0];
                            }
                            return bl;
                        }, (int)lllIlIlIll[45]);
                        0;
                    }
                }
            }
            int[] nArray12 = new int[lllIlIlIll[1]];
            nArray12[X.lllIlIlIll[0]] = lllIlIlIll[62];
            if (X.llIIIllIlIIlI(TileObjects.getNearest((int[])nArray12))) {
                AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[63]];
                if (X.llIIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)lllIlIlIll[1]);
                    0;
                    int[] nArray13 = new int[lllIlIlIll[1]];
                    nArray13[X.lllIlIlIll[0]] = lllIlIlIll[62];
                    TileObjects.getNearest((int[])nArray13).interact(lllIlIlIIl[lllIlIlIll[64]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)lllIlIlIll[45]);
                    0;
                }
                String[] stringArray = new String[lllIlIlIll[1]];
                stringArray[X.lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[65]];
                g.a(stringArray);
            }
        }
        if (X.llIIIllIlIlII(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIlIlIll[57]) && X.llIIIllIIllll(X.dK() ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[66]];
            int[] nArray = new int[lllIlIlIll[1]];
            nArray[X.lllIlIlIll[0]] = lllIlIlIll[54];
            if (X.llIIIllIlIIlI(TileObjects.getNearest((int[])nArray)) && X.llIIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                Time.sleepTicks((int)lllIlIlIll[1]);
                0;
                int[] nArray14 = new int[lllIlIlIll[1]];
                nArray14[X.lllIlIlIll[0]] = lllIlIlIll[54];
                TileObjects.getNearest((int[])nArray14).interact(lllIlIlIIl[lllIlIlIll[67]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)lllIlIlIll[45]);
                0;
            }
            int[] nArray15 = new int[lllIlIlIll[1]];
            nArray15[X.lllIlIlIll[0]] = lllIlIlIll[50];
            if (X.llIIIllIlIIlI(TileObjects.getNearest((int[])nArray15))) {
                if (X.llIIIllIlIIIl(Widgets.get((int)lllIlIlIll[44]).isEmpty() ? 1 : 0) && X.llIIIllIlIIlI(var20 = Widgets.get((int)lllIlIlIll[44], (int)lllIlIlIll[6]))) {
                    Mouse.click((int)var20.getChild(lllIlIlIll[5]).getClickPoint().getX(), (int)var20.getChild(lllIlIlIll[5]).getClickPoint().getY(), (boolean)lllIlIlIll[1]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIlIlIll[1]];
                        nArray[X.lllIlIlIll[0]] = lllIlIlIll[69];
                        if (X.llIIIllIlIIlI(TileObjects.getNearest((int[])nArray))) {
                            bl = lllIlIlIll[1];
                            0;
                            if (((0x18 ^ 0x20) & ~(0x98 ^ 0xA0)) >= (0x96 ^ 0x92)) {
                                return false;
                            }
                        } else {
                            bl = lllIlIlIll[0];
                        }
                        return bl;
                    }, (int)lllIlIlIll[60]);
                    0;
                }
                if (X.llIIIllIIllll(Widgets.get((int)lllIlIlIll[44]).isEmpty() ? 1 : 0)) {
                    int[] nArray16 = new int[lllIlIlIll[1]];
                    nArray16[X.lllIlIlIll[0]] = lllIlIlIll[50];
                    if (X.llIIIllIlIIlI(TileObjects.getNearest((int[])nArray16))) {
                        int[] nArray17 = new int[lllIlIlIll[1]];
                        nArray17[X.lllIlIlIll[0]] = lllIlIlIll[50];
                        TileObjects.getNearest((int[])nArray17).interact(lllIlIlIIl[lllIlIlIll[68]]);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (X.llIIIllIlIIIl(Widgets.get((int)lllIlIlIll[44]).isEmpty() ? 1 : 0)) {
                                bl = lllIlIlIll[1];
                                0;
                                if (1 < ((0xDC ^ 0xA8 ^ (0x75 ^ 0xE)) & (0xDF ^ 0xAE ^ (0xD0 ^ 0xAE) ^ -1))) {
                                    return ((0x9F ^ 0xB1 ^ (0x7B ^ 0x52)) & (5 + 130 - 95 + 110 ^ 28 + 64 - 45 + 98 ^ -1)) != 0;
                                }
                            } else {
                                bl = lllIlIlIll[0];
                            }
                            return bl;
                        }, (int)lllIlIlIll[45]);
                        0;
                    }
                }
            }
            int[] nArray18 = new int[lllIlIlIll[1]];
            nArray18[X.lllIlIlIll[0]] = lllIlIlIll[69];
            if (X.llIIIllIlIIlI(TileObjects.getNearest((int[])nArray18))) {
                AccBuilderTempleTrek.c = lllIlIlIIl[lllIlIlIll[70]];
                if (X.llIIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)lllIlIlIll[1]);
                    0;
                    int[] nArray19 = new int[lllIlIlIll[1]];
                    nArray19[X.lllIlIlIll[0]] = lllIlIlIll[69];
                    TileObjects.getNearest((int[])nArray19).interact(lllIlIlIIl[lllIlIlIll[71]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)lllIlIlIll[45]);
                    0;
                }
                String[] stringArray = new String[lllIlIlIll[1]];
                stringArray[X.lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[72]];
                g.a(stringArray);
            }
        }
    }

    private static String llIIIllIIIIII(String var4, String var3) {
        try {
            SecretKeySpec var23 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lllIlIlIll[2], var23);
            return new String(var1.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aa() {
        int n2;
        if (X.llIIIllIlIIII(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIlIlIll[18])) {
            int n3;
            String[] stringArray = new String[lllIlIlIll[1]];
            stringArray[X.lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[80]];
            if (X.llIIIllIIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lllIlIlIll[1]];
                stringArray2[X.lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[104]];
                if (X.llIIIllIIllll(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    String[] stringArray3 = new String[lllIlIlIll[1]];
                    stringArray3[X.lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[105]];
                    if (X.llIIIllIIllll(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                        String[] stringArray4 = new String[lllIlIlIll[1]];
                        stringArray4[X.lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[106]];
                        if (X.llIIIllIIllll(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                            int[] nArray = new int[lllIlIlIll[1]];
                            nArray[X.lllIlIlIll[0]] = lllIlIlIll[25];
                            if (X.llIIIllIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                String[] stringArray5 = new String[lllIlIlIll[1]];
                                stringArray5[X.lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[107]];
                                if (X.llIIIllIIllll(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                                    String[] stringArray6 = new String[lllIlIlIll[1]];
                                    stringArray6[X.lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[108]];
                                    if (X.llIIIllIlIlII(Inventory.getAll((String[])stringArray6).size(), lllIlIlIll[2]) && (!X.llIIIllIlIIIl(Inventory.contains((int[])f.aM) ? 1 : 0) || X.llIIIllIIllll(Equipment.contains((int[])f.aM) ? 1 : 0))) {
                                        n3 = lllIlIlIll[1];
                                        0;
                                        if (-1 <= ((156 + 92 - 96 + 82 ^ 4 + 170 - 73 + 79) & (0x37 ^ 0x16 ^ 4 + 87 - -17 + 19 ^ -1))) return n3 != 0;
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            n3 = lllIlIlIll[0];
            return n3 != 0;
        }
        if (X.llIIIllIlIlII(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIlIlIll[18]) && X.llIIIllIlIIII(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIlIlIll[16])) {
            int n4;
            String[] stringArray = new String[lllIlIlIll[1]];
            stringArray[X.lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[109]];
            if (X.llIIIllIIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray7 = new String[lllIlIlIll[1]];
                stringArray7[X.lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[110]];
                if (X.llIIIllIIllll(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                    String[] stringArray8 = new String[lllIlIlIll[1]];
                    stringArray8[X.lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[111]];
                    if (X.llIIIllIIllll(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                        String[] stringArray9 = new String[lllIlIlIll[1]];
                        stringArray9[X.lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[112]];
                        if (X.llIIIllIIllll(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                            int[] nArray = new int[lllIlIlIll[1]];
                            nArray[X.lllIlIlIll[0]] = lllIlIlIll[25];
                            if (X.llIIIllIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                String[] stringArray10 = new String[lllIlIlIll[1]];
                                stringArray10[X.lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[113]];
                                if (X.llIIIllIIllll(Inventory.contains((String[])stringArray10) ? 1 : 0)) {
                                    String[] stringArray11 = new String[lllIlIlIll[1]];
                                    stringArray11[X.lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[114]];
                                    if (X.llIIIllIlIlII(Inventory.getAll((String[])stringArray11).size(), lllIlIlIll[13]) && (!X.llIIIllIlIIIl(Inventory.contains((int[])f.aM) ? 1 : 0) || X.llIIIllIIllll(Equipment.contains((int[])f.aM) ? 1 : 0))) {
                                        n4 = lllIlIlIll[1];
                                        0;
                                        if (-2 <= 0) return n4 != 0;
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            n4 = lllIlIlIll[0];
            return n4 != 0;
        }
        if (X.llIIIllIlIlII(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIlIlIll[16]) && X.llIIIllIlIIII(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIlIlIll[57])) {
            int n5;
            String[] stringArray = new String[lllIlIlIll[1]];
            stringArray[X.lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[115]];
            if (X.llIIIllIIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray12 = new String[lllIlIlIll[1]];
                stringArray12[X.lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[116]];
                if (X.llIIIllIIllll(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                    String[] stringArray13 = new String[lllIlIlIll[1]];
                    stringArray13[X.lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[117]];
                    if (X.llIIIllIIllll(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        int[] nArray = new int[lllIlIlIll[1]];
                        nArray[X.lllIlIlIll[0]] = lllIlIlIll[21];
                        if (X.llIIIllIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray2 = new int[lllIlIlIll[1]];
                            nArray2[X.lllIlIlIll[0]] = lllIlIlIll[21];
                            if (X.llIIIllIlIlII(Inventory.getAll((int[])nArray2).size(), lllIlIlIll[5]) && (!X.llIIIllIlIIIl(Inventory.contains((int[])f.aM) ? 1 : 0) || X.llIIIllIIllll(Equipment.contains((int[])f.aM) ? 1 : 0))) {
                                n5 = lllIlIlIll[1];
                                0;
                                if (-3 <= 0) return n5 != 0;
                                return false;
                            }
                        }
                    }
                }
            }
            n5 = lllIlIlIll[0];
            return n5 != 0;
        }
        if (!X.llIIIllIlIlII(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIlIlIll[57])) return lllIlIlIll[0];
        String[] stringArray = new String[lllIlIlIll[1]];
        stringArray[X.lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[118]];
        if (X.llIIIllIIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray14 = new String[lllIlIlIll[1]];
            stringArray14[X.lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[119]];
            if (X.llIIIllIIllll(Inventory.contains((String[])stringArray14) ? 1 : 0)) {
                String[] stringArray15 = new String[lllIlIlIll[1]];
                stringArray15[X.lllIlIlIll[0]] = lllIlIlIIl[lllIlIlIll[120]];
                if (X.llIIIllIIllll(Inventory.contains((String[])stringArray15) ? 1 : 0)) {
                    int[] nArray = new int[lllIlIlIll[1]];
                    nArray[X.lllIlIlIll[0]] = lllIlIlIll[21];
                    if (X.llIIIllIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray3 = new int[lllIlIlIll[1]];
                        nArray3[X.lllIlIlIll[0]] = lllIlIlIll[21];
                        if (X.llIIIllIlIlII(Inventory.getAll((int[])nArray3).size(), lllIlIlIll[13]) && (!X.llIIIllIlIIIl(Inventory.contains((int[])f.aM) ? 1 : 0) || X.llIIIllIIllll(Equipment.contains((int[])f.aM) ? 1 : 0))) {
                            n2 = lllIlIlIll[1];
                            0;
                            if (((0x21 ^ 0x34) & ~(0x77 ^ 0x62)) <= ((0x58 ^ 0x16) & ~(0x4E ^ 0))) return n2 != 0;
                            return false;
                        }
                    }
                }
            }
        }
        n2 = lllIlIlIll[0];
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean dK() {
        int n2;
        int[] nArray = new int[lllIlIlIll[1]];
        nArray[X.lllIlIlIll[0]] = lllIlIlIll[100];
        if (X.llIIIllIlIIlI(TileObjects.getNearest((int[])nArray))) {
            int[] nArray2 = new int[lllIlIlIll[1]];
            nArray2[X.lllIlIlIll[0]] = lllIlIlIll[102];
            if (X.llIIIllIlIIlI(TileObjects.getNearest((int[])nArray2))) {
                n2 = lllIlIlIll[1];
                0;
                if ((0xC6 ^ 0xC3) != 0) return n2 != 0;
                return false;
            }
        }
        n2 = lllIlIlIll[0];
        return n2 != 0;
    }

    private static void llIIIllIIllIl() {
        lllIlIlIIl = new String[lllIlIlIll[142]];
        X.lllIlIlIIl[X.lllIlIlIll[0]] = X."Buying items";
        X.lllIlIlIIl[X.lllIlIlIll[1]] = X."Finished buying items, switching back to construction";
        X.lllIlIlIIl[X.lllIlIlIll[2]] = X."Navigating to bank";
        X.lllIlIlIIl[X.lllIlIlIll[3]] = X."Castle Wars";
        X.lllIlIlIIl[X.lllIlIlIll[5]] = X."Wear";
        X.lllIlIlIIl[X.lllIlIlIll[6]] = X."Handling banking";
        X.lllIlIlIIl[X.lllIlIlIll[9]] = X."We are missing rings, switching to BUYING";
        X.lllIlIlIIl[X.lllIlIlIll[11]] = X."We are missing saw, switching to BUYING";
        X.lllIlIlIIl[X.lllIlIlIll[13]] = X."We are missing hammer, switching to BUYING";
        X.lllIlIlIIl[X.lllIlIlIll[15]] = X."We are missing house tab, switching to BUYING";
        X.lllIlIlIIl[X.lllIlIlIll[18]] = X."We are missing nails, switching to BUYING";
        X.lllIlIlIIl[X.lllIlIlIll[20]] = X."We are missing plank, switching to BUYING";
        X.lllIlIlIIl[X.lllIlIlIll[22]] = X."We are missing oak planks, switching to BUYING";
        X.lllIlIlIIl[X.lllIlIlIll[29]] = X."Equiping duel";
        X.lllIlIlIIl[X.lllIlIlIll[30]] = X."Wear";
        X.lllIlIlIIl[X.lllIlIlIll[32]] = X."Nav to house guy";
        X.lllIlIlIIl[X.lllIlIlIll[33]] = X."Buy house";
        X.lllIlIlIIl[X.lllIlIlIll[34]] = X."Estate agent";
        X.lllIlIlIIl[X.lllIlIlIll[36]] = X."Entering portal";
        X.lllIlIlIIl[X.lllIlIlIll[37]] = X."Build mode";
        X.lllIlIlIIl[X.lllIlIlIll[39]] = X."Tele to house";
        X.lllIlIlIIl[X.lllIlIlIll[40]] = X."Break";
        X.lllIlIlIIl[X.lllIlIlIll[41]] = X."Turning on build mode";
        X.lllIlIlIIl[X.lllIlIlIll[16]] = X."Yes";
        X.lllIlIlIIl[X.lllIlIlIll[43]] = X."Building chair";
        X.lllIlIlIIl[X.lllIlIlIll[46]] = X."Build";
        X.lllIlIlIIl[X.lllIlIlIll[48]] = X."Removing";
        X.lllIlIlIIl[X.lllIlIlIll[49]] = X."Remove";
        X.lllIlIlIIl[X.lllIlIlIll[27]] = X."Yes";
        X.lllIlIlIIl[X.lllIlIlIll[51]] = X."Building wood larder";
        X.lllIlIlIIl[X.lllIlIlIll[53]] = X."Build";
        X.lllIlIlIIl[X.lllIlIlIll[55]] = X."Removing";
        X.lllIlIlIIl[X.lllIlIlIll[56]] = X."Remove";
        X.lllIlIlIIl[X.lllIlIlIll[57]] = X."Yes";
        X.lllIlIlIIl[X.lllIlIlIll[58]] = X."Build oak table";
        X.lllIlIlIIl[X.lllIlIlIll[61]] = X."Build";
        X.lllIlIlIIl[X.lllIlIlIll[63]] = X."Removing";
        X.lllIlIlIIl[X.lllIlIlIll[64]] = X."Remove";
        X.lllIlIlIIl[X.lllIlIlIll[65]] = X."Yes";
        X.lllIlIlIIl[X.lllIlIlIll[66]] = X."Build oak larder";
        X.lllIlIlIIl[X.lllIlIlIll[67]] = X."Remove";
        X.lllIlIlIIl[X.lllIlIlIll[68]] = X."Build";
        X.lllIlIlIIl[X.lllIlIlIll[70]] = X."Removing";
        X.lllIlIlIIl[X.lllIlIlIll[71]] = X."Remove";
        X.lllIlIlIIl[X.lllIlIlIll[72]] = X."Yes";
        X.lllIlIlIIl[X.lllIlIlIll[73]] = X."Building rooms";
        X.lllIlIlIIl[X.lllIlIlIll[77]] = X."View House Options";
        X.lllIlIlIIl[X.lllIlIlIll[79]] = X."Viewer";
        X.lllIlIlIIl[X.lllIlIlIll[81]] = X."Done";
        X.lllIlIlIIl[X.lllIlIlIll[83]] = X."Add room";
        X.lllIlIlIIl[X.lllIlIlIll[84]] = X."Kitchen";
        X.lllIlIlIIl[X.lllIlIlIll[85]] = X."Done";
        X.lllIlIlIIl[X.lllIlIlIll[87]] = X."Counter-clockwise";
        X.lllIlIlIIl[X.lllIlIlIll[88]] = X."Done";
        X.lllIlIlIIl[X.lllIlIlIll[89]] = X."View House Options";
        X.lllIlIlIIl[X.lllIlIlIll[90]] = X."Viewer";
        X.lllIlIlIIl[X.lllIlIlIll[91]] = X."Done";
        X.lllIlIlIIl[X.lllIlIlIll[93]] = X."Add room";
        X.lllIlIlIIl[X.lllIlIlIll[94]] = X."Dining room";
        X.lllIlIlIIl[X.lllIlIlIll[95]] = X."Done";
        X.lllIlIlIIl[X.lllIlIlIll[96]] = X."Counter-clockwise";
        X.lllIlIlIIl[X.lllIlIlIll[97]] = X."Done";
        X.lllIlIlIIl[X.lllIlIlIll[86]] = X."Build";
        X.lllIlIlIIl[X.lllIlIlIll[98]] = X."View House Options";
        X.lllIlIlIIl[X.lllIlIlIll[99]] = X."On";
        X.lllIlIlIIl[X.lllIlIlIll[80]] = X."Iron nails";
        X.lllIlIlIIl[X.lllIlIlIll[104]] = X."Teleport to house";
        X.lllIlIlIIl[X.lllIlIlIll[105]] = X."Saw";
        X.lllIlIlIIl[X.lllIlIlIll[106]] = X."Hammer";
        X.lllIlIlIIl[X.lllIlIlIll[107]] = X."Plank";
        X.lllIlIlIIl[X.lllIlIlIll[108]] = X."Plank";
        X.lllIlIlIIl[X.lllIlIlIll[109]] = X."Iron nails";
        X.lllIlIlIIl[X.lllIlIlIll[110]] = X."Teleport to house";
        X.lllIlIlIIl[X.lllIlIlIll[111]] = X."Saw";
        X.lllIlIlIIl[X.lllIlIlIll[112]] = X."Hammer";
        X.lllIlIlIIl[X.lllIlIlIll[113]] = X."Plank";
        X.lllIlIlIIl[X.lllIlIlIll[114]] = X."Plank";
        X.lllIlIlIIl[X.lllIlIlIll[115]] = X."Teleport to house";
        X.lllIlIlIIl[X.lllIlIlIll[116]] = X."Saw";
        X.lllIlIlIIl[X.lllIlIlIll[117]] = X."Hammer";
        X.lllIlIlIIl[X.lllIlIlIll[118]] = X."Teleport to house";
        X.lllIlIlIIl[X.lllIlIlIll[119]] = X."Saw";
        X.lllIlIlIIl[X.lllIlIlIll[120]] = X."Hammer";
        X.lllIlIlIIl[X.lllIlIlIll[92]] = X."Construction";
        X.lllIlIlIIl[X.lllIlIlIll[135]] = X."ring of wealth (";
        X.lllIlIlIIl[X.lllIlIlIll[136]] = X."ring of dueling(";
        X.lllIlIlIIl[X.lllIlIlIll[137]] = X."ring of dueling(";
        X.lllIlIlIIl[X.lllIlIlIll[140]] = X."How can I get a house?";
        X.lllIlIlIIl[X.lllIlIlIll[141]] = X."Yes please!";
    }

    private static void dH() {
        if (X.llIIIllIIllll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (X.llIIIllIlIIlI(Widgets.get((int)lllIlIlIll[76], (int)lllIlIlIll[55]))) {
            Widgets.get((int)lllIlIlIll[76], (int)lllIlIlIll[55]).interact(lllIlIlIIl[lllIlIlIll[98]]);
            Time.sleepTicks((int)lllIlIlIll[2]);
            0;
        }
        if (X.llIIIllIlIIlI(Widgets.get((int)lllIlIlIll[78], (int)lllIlIlIll[6]))) {
            Widgets.get((int)lllIlIlIll[78], (int)lllIlIlIll[6]).interact(lllIlIlIIl[lllIlIlIll[99]]);
            Time.sleepTicks((int)lllIlIlIll[5]);
            0;
        }
    }
}

