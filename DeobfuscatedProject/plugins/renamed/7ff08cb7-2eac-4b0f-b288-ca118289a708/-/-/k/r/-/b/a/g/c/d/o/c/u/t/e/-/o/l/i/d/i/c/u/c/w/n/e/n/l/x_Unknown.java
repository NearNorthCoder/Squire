/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 */
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.as_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.j;
import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;

public class x_Unknown
implements ab {
    public static /* synthetic */ boolean dH;
    public static /* synthetic */ boolean dK;
    private static /* synthetic */ int[] lllIIIllI;
    private static /* synthetic */ String[] lllIIIIll;
    static /* synthetic */ int dL;
    static /* synthetic */ int dk;
    public static /* synthetic */ boolean bv;
    public static /* synthetic */ List<d> bx;
    public static /* synthetic */ boolean dJ;
    public static /* synthetic */ boolean dI;
    static /* synthetic */ WorldPoint dg;
    public static /* synthetic */ boolean dG;
    private static /* synthetic */ String[] cG;

    static {
        x.llIIIIIIIlll();
        x.llIIIIIIIllI();
        bx = new ArrayList<d>();
        dg = new WorldPoint(lllIIIllI[117], lllIIIllI[118], lllIIIllI[1]);
        dL = lllIIIllI[119];
        dk = lllIIIllI[1];
        String[] stringArray = new String[lllIIIllI[10]];
        stringArray[x.lllIIIllI[1]] = lllIIIIll[lllIIIllI[120]];
        stringArray[x.lllIIIllI[0]] = lllIIIIll[lllIIIllI[121]];
        stringArray[x.lllIIIllI[3]] = lllIIIIll[lllIIIllI[122]];
        stringArray[x.lllIIIllI[6]] = lllIIIIll[lllIIIllI[123]];
        stringArray[x.lllIIIllI[4]] = lllIIIIll[lllIIIllI[124]];
        cG = stringArray;
    }

    private static void Q() {
        block28: {
            d lllllIlIIlllI;
            block27: {
                block26: {
                    block25: {
                        Object lllllIlIIllll;
                        block24: {
                            block23: {
                                block22: {
                                    block21: {
                                        block20: {
                                            block19: {
                                                int[] nArray = new int[lllIIIllI[0]];
                                                nArray[x.lllIIIllI[1]] = lllIIIllI[9];
                                                if (!x.llIIIIIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block19;
                                                int[] nArray2 = new int[lllIIIllI[0]];
                                                nArray2[x.lllIIIllI[1]] = lllIIIllI[9];
                                                if (!x.llIIIIIIlIIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                int[] nArray3 = new int[lllIIIllI[0]];
                                                nArray3[x.lllIIIllI[1]] = lllIIIllI[9];
                                                if (!x.llIIIIIIlIlI(Bank.getFirst((int[])nArray3).getQuantity(), lllIIIllI[8])) break block20;
                                            }
                                            lllllIlIIllll = new d(lllIIIllI[9], lllIIIllI[8], lllIIIllI[96]);
                                            bx.add((d)lllllIlIIllll);
                                            0;
                                        }
                                        int[] nArray = new int[lllIIIllI[0]];
                                        nArray[x.lllIIIllI[1]] = lllIIIllI[7];
                                        if (!x.llIIIIIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block21;
                                        int[] nArray4 = new int[lllIIIllI[0]];
                                        nArray4[x.lllIIIllI[1]] = lllIIIllI[7];
                                        if (!x.llIIIIIIlIIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block22;
                                        int[] nArray5 = new int[lllIIIllI[0]];
                                        nArray5[x.lllIIIllI[1]] = lllIIIllI[7];
                                        if (!x.llIIIIIIlIlI(Bank.getFirst((int[])nArray5).getQuantity(), lllIIIllI[8])) break block22;
                                    }
                                    lllllIlIIllll = new d(lllIIIllI[7], lllIIIllI[8], lllIIIllI[96]);
                                    bx.add((d)lllllIlIIllll);
                                    0;
                                }
                                int[] nArray = new int[lllIIIllI[0]];
                                nArray[x.lllIIIllI[1]] = lllIIIllI[13];
                                if (x.llIIIIIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    lllllIlIIllll = new d(lllIIIllI[13], lllIIIllI[3], lllIIIllI[97]);
                                    bx.add((d)lllllIlIIllll);
                                    0;
                                }
                                int[] nArray6 = new int[lllIIIllI[0]];
                                nArray6[x.lllIIIllI[1]] = lllIIIllI[15];
                                if (x.llIIIIIIlIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                    lllllIlIIllll = new d(lllIIIllI[15], lllIIIllI[0], lllIIIllI[97]);
                                    bx.add((d)lllllIlIIllll);
                                    0;
                                }
                                int[] nArray7 = new int[lllIIIllI[0]];
                                nArray7[x.lllIIIllI[1]] = lllIIIllI[14];
                                if (x.llIIIIIIlIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                    lllllIlIIllll = new d(lllIIIllI[14], lllIIIllI[0], lllIIIllI[97]);
                                    bx.add((d)lllllIlIIllll);
                                    0;
                                }
                                int[] nArray8 = new int[lllIIIllI[0]];
                                nArray8[x.lllIIIllI[1]] = lllIIIllI[5];
                                if (!x.llIIIIIIlIIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                int[] nArray9 = new int[lllIIIllI[0]];
                                nArray9[x.lllIIIllI[1]] = lllIIIllI[5];
                                if (!x.llIIIIIIlIIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block24;
                                int[] nArray10 = new int[lllIIIllI[0]];
                                nArray10[x.lllIIIllI[1]] = lllIIIllI[5];
                                if (!x.llIIIIIIlIlI(Bank.getFirst((int[])nArray10).getQuantity(), lllIIIllI[3])) break block24;
                            }
                            lllllIlIIllll = new d(lllIIIllI[5], lllIIIllI[3], lllIIIllI[98]);
                            bx.add((d)lllllIlIIllll);
                            0;
                        }
                        if (x.llIIIIIIlIll(Bank.contains((Predicate)(lllllIlIIllll = item -> item.getName().toLowerCase().contains(lllIIIIll[lllIIIllI[105]]))) ? 1 : 0)) {
                            lllllIlIIlllI = new d(lllIIIllI[99], lllIIIllI[10], lllIIIllI[100]);
                            bx.add(lllllIlIIlllI);
                            0;
                        }
                        int[] nArray = new int[lllIIIllI[0]];
                        nArray[x.lllIIIllI[1]] = lllIIIllI[17];
                        if (!x.llIIIIIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block25;
                        int[] nArray11 = new int[lllIIIllI[0]];
                        nArray11[x.lllIIIllI[1]] = lllIIIllI[17];
                        if (!x.llIIIIIIlIIl(Bank.contains((int[])nArray11) ? 1 : 0)) break block26;
                        int[] nArray12 = new int[lllIIIllI[0]];
                        nArray12[x.lllIIIllI[1]] = lllIIIllI[17];
                        if (!x.llIIIIIIlIlI(Bank.getFirst((int[])nArray12).getQuantity(), lllIIIllI[4])) break block26;
                    }
                    lllllIlIIlllI = new d(lllIIIllI[17], lllIIIllI[4], j.ch);
                    bx.add(lllllIlIIlllI);
                    0;
                }
                int[] nArray = new int[lllIIIllI[0]];
                nArray[x.lllIIIllI[1]] = lllIIIllI[12];
                if (!x.llIIIIIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block27;
                int[] nArray13 = new int[lllIIIllI[0]];
                nArray13[x.lllIIIllI[1]] = lllIIIllI[12];
                if (!x.llIIIIIIlIIl(Bank.contains((int[])nArray13) ? 1 : 0)) break block28;
                int[] nArray14 = new int[lllIIIllI[0]];
                nArray14[x.lllIIIllI[1]] = lllIIIllI[12];
                if (!x.llIIIIIIlIlI(Bank.getFirst((int[])nArray14).getQuantity(), lllIIIllI[31])) break block28;
            }
            lllllIlIIlllI = new d(lllIIIllI[12], lllIIIllI[33], lllIIIllI[101]);
            bx.add(lllllIlIIlllI);
            0;
        }
    }

    private static String lIllllllIIll(String lllllIIlIIllI, String lllllIIlIIlIl) {
        lllllIIlIIllI = new String(Base64.getDecoder().decode(lllllIIlIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllIIlIlIIl = new StringBuilder();
        char[] lllllIIlIlIII = lllllIIlIIlIl.toCharArray();
        int lllllIIlIIlll = lllIIIllI[1];
        char[] lllllIIlIIIIl = lllllIIlIIllI.toCharArray();
        int lllllIIlIIIII = lllllIIlIIIIl.length;
        int lllllIIIlllll = lllIIIllI[1];
        while (x.llIIIIIIlIlI(lllllIIIlllll, lllllIIlIIIII)) {
            char lllllIIlIllII = lllllIIlIIIIl[lllllIIIlllll];
            lllllIIlIlIIl.append((char)(lllllIIlIllII ^ lllllIIlIlIII[lllllIIlIIlll % lllllIIlIlIII.length]));
            0;
            ++lllllIIlIIlll;
            ++lllllIIIlllll;
            0;
            if (1 > 0) continue;
            return null;
        }
        return String.valueOf(lllllIIlIlIIl);
    }

    private static String lIllllllIlII(String lllllIIIIlIIl, String lllllIIIIlIII) {
        try {
            SecretKeySpec lllllIIIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllIIIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllIIIIlIll = Cipher.getInstance("Blowfish");
            lllllIIIIlIll.init(lllIIIllI[3], lllllIIIIllII);
            return new String(lllllIIIIlIll.doFinal(Base64.getDecoder().decode(lllllIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllIIIIlIlI) {
            lllllIIIIlIlI.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (x.llIIIIIlIlII(e.j(dL), lllIIIllI[104])) {
            bl = lllIIIllI[0];
            0;
            if ((0x67 ^ 0x62) == 0) {
                return false;
            }
        } else {
            bl = lllIIIllI[1];
        }
        return bl;
    }

    private static boolean llIIIIIlIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIIIIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public int af() {
        try {
            x.bf();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (2 <= 0) {
            return (0xF2 ^ 0xB9 ^ (0x39 ^ 0x4E)) & (53 + 102 - 103 + 92 ^ 151 + 21 - 169 + 169 ^ -1);
        }
        return lllIIIllI[102];
    }

    private static boolean llIIIIIIllII(Object object) {
        return object != null;
    }

    private static boolean llIIIIIIllIl(int n2) {
        return n2 > 0;
    }

    private static int llIIIIIIlIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public String ag() {
        return lllIIIIll[lllIIIllI[103]];
    }

    private static boolean llIIIIIIlIll(int n2) {
        return n2 == 0;
    }

    private static void llIIIIIIIlll() {
        lllIIIllI = new int[126];
        x.lllIIIllI[0] = 1;
        x.lllIIIllI[1] = (0x7B ^ 8 ^ (0x87 ^ 0xA7)) & (0x2C ^ 0x24 ^ (0x4A ^ 0x11) ^ -1);
        x.lllIIIllI[2] = -(0xFFFFE96D & 0x7ED7) & (0xFFFFFFCE & 0x7BFD);
        x.lllIIIllI[3] = 2;
        x.lllIIIllI[4] = 0xBF ^ 0xBB;
        x.lllIIIllI[5] = -(0xFFFFBCF3 & 0x736F) & (0xFFFFBFFF & 0x7F6F);
        x.lllIIIllI[6] = 3;
        x.lllIIIllI[7] = 0xFFFFA9FD & 0x5F07;
        x.lllIIIllI[8] = 0x10 ^ 7 ^ (0xDD ^ 0xC0);
        x.lllIIIllI[9] = -(0xFFFFFFB7 & 0x52DB) & (0xFFFFDFDF & 0x73FF);
        x.lllIIIllI[10] = 0x2A ^ 4 ^ (0xBA ^ 0x91);
        x.lllIIIllI[11] = 0x86 ^ 0x81;
        x.lllIIIllI[12] = -(0xFFFFB4AF & 0x6B79) & (0xFFFFBFFF & 0x7F6F);
        x.lllIIIllI[13] = -(0xFFFFFBDD & 0x7CA3) & (0xFFFFFFF7 & 0x7FF9);
        x.lllIIIllI[14] = 0xFFFFDFFF & 0x27EC;
        x.lllIIIllI[15] = 0xFFFFF9AF & 0xF7F;
        x.lllIIIllI[16] = 0x6C ^ 0x73 ^ (0x32 ^ 0x2B);
        x.lllIIIllI[17] = -(0xFFFFFDAF & 0xAF7) & (0xFFFFFDF7 & 0x3BFF);
        x.lllIIIllI[18] = 0xFFFFFBFF & 0x7E3;
        x.lllIIIllI[19] = 0xFFFFFF9B & 0x3AFC;
        x.lllIIIllI[20] = 0x97 ^ 0x91 ^ (0x8A ^ 0xBE);
        x.lllIIIllI[21] = 0x12 ^ 0xA;
        x.lllIIIllI[22] = 0xA6 ^ 0xBD ^ (0x83 ^ 0x90);
        x.lllIIIllI[23] = 0xB6 ^ 0xBF;
        x.lllIIIllI[24] = 34 + 94 - 59 + 62 ^ 4 + 86 - -6 + 40;
        x.lllIIIllI[25] = 0xD2 ^ 0xA1 ^ 43 + 59 - 31 + 56;
        x.lllIIIllI[26] = 186 + 57 - 195 + 152 ^ 113 + 188 - 155 + 51;
        x.lllIIIllI[27] = 0x2A ^ 0x34;
        x.lllIIIllI[28] = -(0xFFFFB7BB & 0x6CEE) & (0xFFFFAFFD & Short.MAX_VALUE);
        x.lllIIIllI[29] = 0xFFFFDFEF & 0x2DFF;
        x.lllIIIllI[30] = 0x44 ^ 0x4C ^ (0x70 ^ 0x76);
        x.lllIIIllI[31] = 0xA1 ^ 0xAE;
        x.lllIIIllI[32] = 31 + 23 - -75 + 37 ^ 7 + 156 - 9 + 24;
        x.lllIIIllI[33] = 0x11 ^ 0x39;
        x.lllIIIllI[34] = 0xFFFFDB7F & 0x2FDA;
        x.lllIIIllI[35] = 0xFFFFCFD7 & 0x3DFD;
        x.lllIIIllI[36] = 0x27 ^ 0x37;
        x.lllIIIllI[37] = 0x1C ^ 0x4D ^ (0x82 ^ 0xC2);
        x.lllIIIllI[38] = 0x5C ^ 0x1D ^ (0x71 ^ 0x22);
        x.lllIIIllI[39] = 0x1F ^ 0xC;
        x.lllIIIllI[40] = 93 + 150 - 180 + 182 ^ 107 + 98 - 201 + 146;
        x.lllIIIllI[41] = 0x3B ^ 0x7D ^ (0xE ^ 0x5D);
        x.lllIIIllI[42] = 103 + 30 - 50 + 109 ^ 66 + 21 - 16 + 94;
        x.lllIIIllI[43] = 27 + 40 - 17 + 94 ^ 10 + 13 - -31 + 86;
        x.lllIIIllI[44] = 0x6F ^ 0x58 ^ (0x11 ^ 0x37) & ~(0x44 ^ 0x62);
        x.lllIIIllI[45] = 0x60 ^ 0x76;
        x.lllIIIllI[46] = 0xA6 ^ 0xB1;
        x.lllIIIllI[47] = 0x67 ^ 0x48 ^ (0xB4 ^ 0xA7);
        x.lllIIIllI[48] = -(0xFFFFD691 & 0x6DFF) & (0xFFFFFFFF & 0x4FDF);
        x.lllIIIllI[49] = -1 & (0xFFFFDFEF & 0x2DFB);
        x.lllIIIllI[50] = 0xB4 ^ 0xA5 ^ (0x92 ^ 0x9A);
        x.lllIIIllI[51] = 0x53 ^ 0x49;
        x.lllIIIllI[52] = 0x24 ^ 0x3F;
        x.lllIIIllI[53] = 0xFFFFADED & 0x5E37;
        x.lllIIIllI[54] = -(0xFFFFCFFB & 0x3356) & (0xFFFFBF77 & 0x4FFF);
        x.lllIIIllI[55] = 0x55 ^ 7 ^ (0x36 ^ 0x79);
        x.lllIIIllI[56] = -(0xFFFFF36D & 0x6FDB) & (0xFFFFFFEF & 0x6F7F);
        x.lllIIIllI[57] = -(0xFFFF9B5B & 0x67E5) & (0xFFFFFFEB & 0xF7C);
        x.lllIIIllI[58] = 0x34 ^ 0x60 ^ (0xE5 ^ 0xAE);
        x.lllIIIllI[59] = -(0xFFFFB95B & 0x76F5) & (0xFFFFFCF9 & 0x3F7F);
        x.lllIIIllI[60] = 0x98 ^ 0xB8;
        x.lllIIIllI[61] = 0x47 ^ 1;
        x.lllIIIllI[62] = 20 + 103 - 75 + 114 ^ 95 + 45 - 128 + 119;
        x.lllIIIllI[63] = 61 + 178 - 92 + 42 ^ 17 + 133 - 125 + 134;
        x.lllIIIllI[64] = 37 + 56 - 43 + 84 ^ 38 + 53 - 79 + 153;
        x.lllIIIllI[65] = -(0xFFFFB3FD & 0x6C97) & (0xFFFFAFBF & 0x7BFE);
        x.lllIIIllI[66] = -(0xFFFFBFF7 & 0x420D) & (0xFFFFDFFD & 0x2FFF);
        x.lllIIIllI[67] = 0x9A ^ 0xBE;
        x.lllIIIllI[68] = 0x7F ^ 0x5A;
        x.lllIIIllI[69] = 0x4E ^ 0x68;
        x.lllIIIllI[70] = 76 + 103 - 134 + 90 ^ 49 + 134 - 86 + 63;
        x.lllIIIllI[71] = 0xB5 ^ 0x89 ^ (0x4D ^ 0x58);
        x.lllIIIllI[72] = 0x21 ^ 0xB;
        x.lllIIIllI[73] = 0xA4 ^ 0x8F;
        x.lllIIIllI[74] = 0xFFFF9B7E & 0x6F85;
        x.lllIIIllI[75] = 0xFFFFEFED & 0x1DF6;
        x.lllIIIllI[76] = 0x98 ^ 0xB4;
        x.lllIIIllI[77] = 0x70 ^ 0x7C ^ (2 ^ 0x23);
        x.lllIIIllI[78] = 0x9B ^ 0xB5;
        x.lllIIIllI[79] = 0xFFFFBF6E & 0x4BF9;
        x.lllIIIllI[80] = 0xFFFFEFF5 & 0x1DFF;
        x.lllIIIllI[81] = 0xB2 ^ 0x9D;
        x.lllIIIllI[82] = 0xA9 ^ 0x96 ^ (0x91 ^ 0x9E);
        x.lllIIIllI[83] = 1 ^ 0x30;
        x.lllIIIllI[84] = 0x14 ^ 0x4E ^ (0x21 ^ 0x48);
        x.lllIIIllI[85] = 0x27 ^ 0xB ^ (0x9D ^ 0x85);
        x.lllIIIllI[86] = 0x19 ^ 0x2C;
        x.lllIIIllI[87] = 0x51 ^ 0x67;
        x.lllIIIllI[88] = 0x27 ^ 0x1F;
        x.lllIIIllI[89] = 51 + 61 - 85 + 129 ^ 158 + 103 - 115 + 19;
        x.lllIIIllI[90] = 0x1B ^ 0x21;
        x.lllIIIllI[91] = 0xFFFF9BBB & 0x6F7E;
        x.lllIIIllI[92] = -(0xFFFFD86B & 0x67DD) & (0xFFFFCEDF & 0x7F7F);
        x.lllIIIllI[93] = 0x47 ^ 0x7C;
        x.lllIIIllI[94] = 0xB ^ 0x36;
        x.lllIIIllI[95] = 61 + 10 - -51 + 61 ^ 89 + 91 - 175 + 132;
        x.lllIIIllI[96] = -(0xFFFFBD6B & 0x7E97) & (0xFFFFBFFF & 0x7FFE);
        x.lllIIIllI[97] = 0xFFFFAFBF & 0x7FFC;
        x.lllIIIllI[98] = -(0xFFFFEBA9 & 0x76D7) & (0xFFFFFFEF & 0x76F4);
        x.lllIIIllI[99] = 0xFFFFBEDF & 0x6FEC;
        x.lllIIIllI[100] = -(0xFFFF8A7F & 0x7FD3) & (0xFFFFEFFF & 0x7BFA);
        x.lllIIIllI[101] = -(0xFFFFE06E & 0x7FF5) & (0xFFFFEFE7 & 0x73FF);
        x.lllIIIllI[102] = 204 + 116 - 303 + 202 ^ 28 + 131 - 110 + 142;
        x.lllIIIllI[103] = 2 ^ (0x97 ^ 0xAA);
        x.lllIIIllI[104] = 0xF3 ^ 0x8F ^ (0xC ^ 0x20);
        x.lllIIIllI[105] = 64 + 71 - 87 + 82 ^ 146 + 115 - 150 + 83;
        x.lllIIIllI[106] = 0x78 ^ 0x6A ^ (0x44 ^ 0x17);
        x.lllIIIllI[107] = 0xFFFFBDFE & 0x4FED;
        x.lllIIIllI[108] = 0x3D ^ 0x7F;
        x.lllIIIllI[109] = 7 ^ 0x44;
        x.lllIIIllI[110] = 0xFFFFADEF & 0x5FFA;
        x.lllIIIllI[111] = 0x78 ^ 0x3C;
        x.lllIIIllI[112] = 0xFFFFEB4F & 0x1FFE;
        x.lllIIIllI[113] = 0xC1 ^ 0x84;
        x.lllIIIllI[114] = 2 ^ (0x7D ^ 0x38);
        x.lllIIIllI[115] = -(0xFFFFE5CF & 0x7EBD) & (0xFFFFFFDF & 0x6FFE);
        x.lllIIIllI[116] = -(0xFFFFF3AD & 0x6E5B) & (0xFFFFEFED & Short.MAX_VALUE);
        x.lllIIIllI[117] = 0xFFFFAFFE & 0x5B51;
        x.lllIIIllI[118] = 0xFFFFBDCE & 0x4FF9;
        x.lllIIIllI[119] = -(0xFFFFFECE & 0x3DF7) & (0xFFFFFDFF & 0x3FFF);
        x.lllIIIllI[120] = 191 + 0 - 156 + 171 ^ 65 + 69 - 72 + 72;
        x.lllIIIllI[121] = 0xC ^ 0x45;
        x.lllIIIllI[122] = 0x15 ^ 0x5F;
        x.lllIIIllI[123] = 117 + 145 - 251 + 188 ^ 61 + 25 - 54 + 108;
        x.lllIIIllI[124] = 0xC3 ^ 0x8F;
        x.lllIIIllI[125] = 0x21 ^ 0x6C;
    }

    private static boolean llIIIIIlIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIIIIIlllI(int n2) {
        return n2 < 0;
    }

    @Override
    public boolean ae() {
        return lllIIIllI[1];
    }

    private static boolean llIIIIIIlIIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void lllllIlIlIIll;
        int[] nArray = new int[lllIIIllI[11]];
        nArray[x.lllIIIllI[1]] = lllIIIllI[12];
        nArray[x.lllIIIllI[0]] = lllIIIllI[7];
        nArray[x.lllIIIllI[3]] = lllIIIllI[9];
        nArray[x.lllIIIllI[6]] = lllIIIllI[13];
        nArray[x.lllIIIllI[4]] = lllIIIllI[14];
        nArray[x.lllIIIllI[10]] = lllIIIllI[15];
        nArray[x.lllIIIllI[16]] = lllIIIllI[17];
        int[] nArray2 = nArray;
        int lllllIlIlIIlI = lllIIIllI[1];
        while (x.llIIIIIIlIlI(lllllIlIlIIlI, ((void)lllllIlIlIIll).length)) {
            int[] nArray3 = new int[lllIIIllI[0]];
            nArray3[x.lllIIIllI[1]] = lllllIlIlIIll[lllllIlIlIIlI];
            if (x.llIIIIIIlIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lllIIIllI[1];
            }
            ++lllllIlIlIIlI;
            0;
            if ((0x3C ^ 0x4F ^ (0x4D ^ 0x3A)) > 2) continue;
            return ((0x7F ^ 0x4A ^ (0x28 ^ 8)) & (0xDC ^ 0x81 ^ (0xF9 ^ 0xB1) ^ -1)) != 0;
        }
        return lllIIIllI[0];
    }

    private static boolean llIIIIIlIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIIIIIllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIIIIlIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIllllllIlll(String lllllIIIlIlII, String lllllIIIlIIll) {
        try {
            SecretKeySpec lllllIIIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllIIIlIIll.getBytes(StandardCharsets.UTF_8)), lllIIIllI[22]), "DES");
            Cipher lllllIIIllIII = Cipher.getInstance("DES");
            lllllIIIllIII.init(lllIIIllI[3], lllllIIIllIIl);
            return new String(lllllIIIllIII.doFinal(Base64.getDecoder().decode(lllllIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllIIIlIlll) {
            lllllIIIlIlll.printStackTrace();
            return null;
        }
    }

    private static void llIIIIIIIllI() {
        lllIIIIll = new String[lllIIIllI[125]];
        x.lllIIIIll[x.lllIIIllI[1]] = x."Finished buying items, switching back to quest";
        x.lllIIIIll[x.lllIIIllI[0]] = x."Nav to bank";
        x.lllIIIIll[x.lllIIIllI[3]] = x."Handling banking";
        x.lllIIIIll[x.lllIIIllI[6]] = x."We are missing quest supplies, switching to BUYING";
        x.lllIIIIll[x.lllIIIllI[4]] = x."We are missing quest supplies, switching to BUYING";
        x.lllIIIIll[x.lllIIIllI[10]] = x."We are missing quest supplies, switching to BUYING";
        x.lllIIIIll[x.lllIIIllI[16]] = x."We are missing quest supplies, switching to BUYING";
        x.lllIIIIll[x.lllIIIllI[11]] = x."Drink";
        x.lllIIIIll[x.lllIIIllI[22]] = x."Drink";
        x.lllIIIIll[x.lllIIIllI[23]] = x."Shark";
        x.lllIIIIll[x.lllIIIllI[8]] = x."Shark";
        x.lllIIIIll[x.lllIIIllI[24]] = x."Eat";
        x.lllIIIIll[x.lllIIIllI[25]] = x."Nav to start";
        x.lllIIIIll[x.lllIIIllI[26]] = x."Denulth";
        x.lllIIIIll[x.lllIIIllI[30]] = x."Nav to Eohric";
        x.lllIIIIll[x.lllIIIllI[31]] = x."Eohric";
        x.lllIIIIll[x.lllIIIllI[36]] = x."Nav to Harold";
        x.lllIIIIll[x.lllIIIllI[37]] = x."Harold";
        x.lllIIIIll[x.lllIIIllI[38]] = x."Harold";
        x.lllIIIIll[x.lllIIIllI[39]] = x."Can I buy you a drink?";
        x.lllIIIIll[x.lllIIIllI[32]] = x."Harold";
        x.lllIIIIll[x.lllIIIllI[41]] = x."Would you like to gamble?";
        x.lllIIIIll[x.lllIIIllI[45]] = x."Iou";
        x.lllIIIIll[x.lllIIIllI[46]] = x."Iou";
        x.lllIIIIll[x.lllIIIllI[21]] = x."Read";
        x.lllIIIIll[x.lllIIIllI[50]] = x."Nav to puzzle";
        x.lllIIIIll[x.lllIIIllI[51]] = x."Opening door";
        x.lllIIIIll[x.lllIIIllI[52]] = x."Open";
        x.lllIIIIll[x.lllIIIllI[43]] = x."Take";
        x.lllIIIIll[x.lllIIIllI[55]] = x."Take";
        x.lllIIIIll[x.lllIIIllI[27]] = x."Take";
        x.lllIIIIll[x.lllIIIllI[58]] = x."Take";
        x.lllIIIIll[x.lllIIIllI[60]] = x."Take";
        x.lllIIIIll[x.lllIIIllI[62]] = x."Spiked boots";
        x.lllIIIIll[x.lllIIIllI[63]] = x."Climbing boots";
        x.lllIIIIll[x.lllIIIllI[64]] = x."Saba";
        x.lllIIIIll[x.lllIIIllI[67]] = x."Nav to cave";
        x.lllIIIIll[x.lllIIIllI[68]] = x."Cave Entrance";
        x.lllIIIIll[x.lllIIIllI[69]] = x."Enter";
        x.lllIIIIll[x.lllIIIllI[70]] = x."Saba";
        x.lllIIIIll[x.lllIIIllI[33]] = x."Saba";
        x.lllIIIIll[x.lllIIIllI[71]] = x."Do you know of another way up Death Plateau?";
        x.lllIIIIll[x.lllIIIllI[72]] = x."Climbing boots";
        x.lllIIIIll[x.lllIIIllI[73]] = x."Climbing boots";
        x.lllIIIIll[x.lllIIIllI[76]] = x."Nav to Tenzing";
        x.lllIIIIll[x.lllIIIllI[77]] = x."Tenzing";
        x.lllIIIIll[x.lllIIIllI[78]] = x."Climbing boots";
        x.lllIIIIll[x.lllIIIllI[81]] = x."Nav to smith";
        x.lllIIIIll[x.lllIIIllI[82]] = x."Dunstan";
        x.lllIIIIll[x.lllIIIllI[83]] = x."Nav to start";
        x.lllIIIIll[x.lllIIIllI[20]] = x."Denulth";
        x.lllIIIIll[x.lllIIIllI[84]] = x."Nav to smith";
        x.lllIIIIll[x.lllIIIllI[85]] = x."Dunstan";
        x.lllIIIIll[x.lllIIIllI[86]] = x."Spiked boots";
        x.lllIIIIll[x.lllIIIllI[87]] = x."Nav to Tenzing";
        x.lllIIIIll[x.lllIIIllI[44]] = x."Tenzing";
        x.lllIIIIll[x.lllIIIllI[88]] = x."Secret way map";
        x.lllIIIIll[x.lllIIIllI[89]] = x."Tenzing";
        x.lllIIIIll[x.lllIIIllI[90]] = x."Secret way map";
        x.lllIIIIll[x.lllIIIllI[93]] = x."Finding path";
        x.lllIIIIll[x.lllIIIllI[47]] = x."Nav to start";
        x.lllIIIIll[x.lllIIIllI[94]] = x."Denulth";
        x.lllIIIIll[x.lllIIIllI[95]] = x."Certificate";
        x.lllIIIIll[x.lllIIIllI[103]] = x."Death Plateau";
        x.lllIIIIll[x.lllIIIllI[105]] = x."ring of wealth (";
        x.lllIIIIll[x.lllIIIllI[106]] = x."Stone Mechanism";
        x.lllIIIIll[x.lllIIIllI[108]] = x."Stone Mechanism";
        x.lllIIIIll[x.lllIIIllI[109]] = x."Stone Mechanism";
        x.lllIIIIll[x.lllIIIllI[111]] = x."Stone Mechanism";
        x.lllIIIIll[x.lllIIIllI[113]] = x."Stone Mechanism";
        x.lllIIIIll[x.lllIIIllI[61]] = x."door";
        x.lllIIIIll[x.lllIIIllI[114]] = x."Open";
        x.lllIIIIll[x.lllIIIllI[120]] = x."Yes.";
        x.lllIIIIll[x.lllIIIllI[121]] = x."Do you have any quests for me?";
        x.lllIIIIll[x.lllIIIllI[122]] = x."I'm looking for the guard that was on last night.";
        x.lllIIIIll[x.lllIIIllI[123]] = x."You're the guard that was on duty last night?";
        x.lllIIIIll[x.lllIIIllI[124]] = x."OK, I'll get those for you.";
    }

    public static void bf() {
        block107: {
            TileItem lllllIlIllIll;
            BankLocation lllllIlIlllII;
            block108: {
                block110: {
                    block109: {
                        if (x.llIIIIIIlIIl(bv ? 1 : 0)) {
                            b.a(bx);
                            if (x.llIIIIIIlIlI(bx.size(), lllIIIllI[0])) {
                                System.out.println(lllIIIIll[lllIIIllI[1]]);
                                bv = lllIIIllI[1];
                            }
                        }
                        if (!x.llIIIIIIlIll(bv ? 1 : 0)) break block107;
                        if (x.llIIIIIIlIll(x.an() ? 1 : 0) && x.llIIIIIIlIlI(e.j(dL), lllIIIllI[0])) {
                            lllllIlIlllII = BankLocation.getNearest();
                            if (x.llIIIIIIllII(lllllIlIlllII) && x.llIIIIIIlIll(lllllIlIlllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderGWD.c = lllIIIIll[lllIIIllI[0]];
                                a.a(lllllIlIlllII);
                            }
                            if (x.llIIIIIIllII(lllllIlIlllII) && x.llIIIIIIlIIl(lllllIlIlllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (x.llIIIIIIlIll(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIIllI[2]);
                                    0;
                                }
                                if (x.llIIIIIIlIIl(Bank.isOpen() ? 1 : 0)) {
                                    AccBuilderGWD.c = lllIIIIll[lllIIIllI[3]];
                                    if (x.llIIIIIIllIl(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lllIIIllI[4]);
                                        0;
                                    }
                                    if (x.llIIIIIIllIl(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lllIIIllI[3]);
                                        0;
                                    }
                                    int[] nArray = new int[lllIIIllI[0]];
                                    nArray[x.lllIIIllI[1]] = lllIIIllI[5];
                                    if (x.llIIIIIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                        x.Q();
                                        System.out.println(lllIIIIll[lllIIIllI[6]]);
                                        bv = lllIIIllI[0];
                                        return;
                                    }
                                    int[] nArray2 = new int[lllIIIllI[0]];
                                    nArray2[x.lllIIIllI[1]] = lllIIIllI[7];
                                    if (x.llIIIIIIlIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                        int[] nArray3 = new int[lllIIIllI[0]];
                                        nArray3[x.lllIIIllI[1]] = lllIIIllI[7];
                                        if (x.llIIIIIIlIlI(Bank.getFirst((int[])nArray3).getQuantity(), lllIIIllI[8])) {
                                            x.Q();
                                            System.out.println(lllIIIIll[lllIIIllI[4]]);
                                            bv = lllIIIllI[0];
                                            return;
                                        }
                                    }
                                    int[] nArray4 = new int[lllIIIllI[0]];
                                    nArray4[x.lllIIIllI[1]] = lllIIIllI[9];
                                    if (x.llIIIIIIlIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                        int[] nArray5 = new int[lllIIIllI[0]];
                                        nArray5[x.lllIIIllI[1]] = lllIIIllI[9];
                                        if (x.llIIIIIIlIlI(Bank.getFirst((int[])nArray5).getQuantity(), lllIIIllI[8])) {
                                            x.Q();
                                            System.out.println(lllIIIIll[lllIIIllI[10]]);
                                            bv = lllIIIllI[0];
                                            return;
                                        }
                                    }
                                    int[] nArray6 = new int[lllIIIllI[11]];
                                    nArray6[x.lllIIIllI[1]] = lllIIIllI[12];
                                    nArray6[x.lllIIIllI[0]] = lllIIIllI[7];
                                    nArray6[x.lllIIIllI[3]] = lllIIIllI[9];
                                    nArray6[x.lllIIIllI[6]] = lllIIIllI[13];
                                    nArray6[x.lllIIIllI[4]] = lllIIIllI[14];
                                    nArray6[x.lllIIIllI[10]] = lllIIIllI[15];
                                    nArray6[x.lllIIIllI[16]] = lllIIIllI[17];
                                    if (x.llIIIIIIlIll(e.d(nArray6) ? 1 : 0)) {
                                        x.Q();
                                        System.out.println(lllIIIIll[lllIIIllI[16]]);
                                        bv = lllIIIllI[0];
                                        return;
                                    }
                                    int[] nArray7 = new int[lllIIIllI[11]];
                                    nArray7[x.lllIIIllI[1]] = lllIIIllI[12];
                                    nArray7[x.lllIIIllI[0]] = lllIIIllI[7];
                                    nArray7[x.lllIIIllI[3]] = lllIIIllI[9];
                                    nArray7[x.lllIIIllI[6]] = lllIIIllI[13];
                                    nArray7[x.lllIIIllI[4]] = lllIIIllI[14];
                                    nArray7[x.lllIIIllI[10]] = lllIIIllI[15];
                                    nArray7[x.lllIIIllI[16]] = lllIIIllI[17];
                                    if (x.llIIIIIIlIIl(e.d(nArray7) ? 1 : 0)) {
                                        if (x.llIIIIIIllIl(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)lllIIIllI[4]);
                                            0;
                                        }
                                        a.a(lllIIIllI[17], lllIIIllI[0]);
                                        a.a(lllIIIllI[12], lllIIIllI[8]);
                                        a.a(lllIIIllI[5], lllIIIllI[0]);
                                        a.a(lllIIIllI[15], lllIIIllI[0]);
                                        a.a(lllIIIllI[13], lllIIIllI[0]);
                                        a.a(lllIIIllI[14], lllIIIllI[0]);
                                        a.a(lllIIIllI[9], lllIIIllI[8]);
                                        a.a(lllIIIllI[7], lllIIIllI[8]);
                                        a.a(lllIIIllI[18], lllIIIllI[19]);
                                    }
                                }
                            }
                        }
                        if (x.llIIIIIIlIIl(Inventory.contains((int[])f.bc) ? 1 : 0) && x.llIIIIIIlIlI(Movement.getRunEnergy(), lllIIIllI[20])) {
                            Inventory.getFirst((int[])f.bc).interact(lllIIIIll[lllIIIllI[11]]);
                            Time.sleepTicks((int)lllIIIllI[0]);
                            0;
                        }
                        if (x.llIIIIIIlIIl(Inventory.contains((int[])f.aZ) ? 1 : 0) && x.llIIIIIIlIlI(Prayers.getPoints(), lllIIIllI[21])) {
                            Inventory.getFirst((int[])f.aZ).interact(lllIIIIll[lllIIIllI[22]]);
                        }
                        if (x.llIIIIIIlllI(x.llIIIIIIlIII(e.w(), 60.0))) {
                            String[] stringArray = new String[lllIIIllI[0]];
                            stringArray[x.lllIIIllI[1]] = lllIIIIll[lllIIIllI[23]];
                            if (x.llIIIIIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                String[] stringArray2 = new String[lllIIIllI[0]];
                                stringArray2[x.lllIIIllI[1]] = lllIIIIll[lllIIIllI[8]];
                                Inventory.getFirst((String[])stringArray2).interact(lllIIIIll[lllIIIllI[24]]);
                                Time.sleepTicks((int)lllIIIllI[3]);
                                0;
                            }
                        }
                        if (x.llIIIIIIlIIl(x.an() ? 1 : 0) && x.llIIIIIIlIll(e.j(dL))) {
                            if (x.llIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(dg), lllIIIllI[22])) {
                                AccBuilderGWD.c = lllIIIIll[lllIIIllI[25]];
                                if (x.llIIIIIIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                e.l(lllIIIllI[5]);
                                Movement.walkTo((WorldPoint)dg);
                                0;
                                Time.sleepTicks((int)lllIIIllI[0]);
                                0;
                            }
                            if (x.llIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(dg), lllIIIllI[22])) {
                                g.a(lllIIIIll[lllIIIllI[26]], cG, lllIIIllI[0]);
                            }
                        }
                        if (!x.llIIIIIlIIIl(e.j(dL), lllIIIllI[8]) || x.llIIIIIlIIlI(e.j(dL), lllIIIllI[27])) {
                            lllllIlIlllII = new WorldPoint(lllIIIllI[28], lllIIIllI[29], lllIIIllI[0]);
                            dk = lllIIIllI[1];
                            if (x.llIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllIlIlllII), lllIIIllI[22])) {
                                AccBuilderGWD.c = lllIIIIll[lllIIIllI[30]];
                                Movement.walkTo((WorldPoint)lllllIlIlllII);
                                0;
                                Time.sleepTicks((int)lllIIIllI[0]);
                                0;
                            }
                            if (x.llIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllIlIlllII), lllIIIllI[22])) {
                                g.a(lllIIIIll[lllIIIllI[31]], cG, lllIIIllI[0]);
                            }
                        }
                        if (!x.llIIIIIlIIIl(e.j(dL), lllIIIllI[32]) || x.llIIIIIlIIlI(e.j(dL), lllIIIllI[33])) {
                            lllllIlIlllII = new WorldPoint(lllIIIllI[34], lllIIIllI[35], lllIIIllI[0]);
                            if (x.llIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllIlIlllII), lllIIIllI[22])) {
                                AccBuilderGWD.c = lllIIIIll[lllIIIllI[36]];
                                Movement.walkTo((WorldPoint)lllllIlIlllII);
                                0;
                                Time.sleepTicks((int)lllIIIllI[0]);
                                0;
                            }
                            if (x.llIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllIlIlllII), lllIIIllI[22])) {
                                g.a(lllIIIIll[lllIIIllI[37]], cG, lllIIIllI[0]);
                            }
                        }
                        if (!x.llIIIIIlIIlI(e.j(dL), lllIIIllI[20])) break block108;
                        int[] nArray = new int[lllIIIllI[0]];
                        nArray[x.lllIIIllI[1]] = lllIIIllI[13];
                        if (!x.llIIIIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block109;
                        int[] nArray8 = new int[lllIIIllI[0]];
                        nArray8[x.lllIIIllI[1]] = lllIIIllI[14];
                        if (!x.llIIIIIIlIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) break block110;
                    }
                    String[] stringArray = new String[lllIIIllI[0]];
                    stringArray[x.lllIIIllI[1]] = lllIIIIll[lllIIIllI[39]];
                    g.a(lllIIIIll[lllIIIllI[38]], stringArray, lllIIIllI[0]);
                }
                int[] nArray = new int[lllIIIllI[0]];
                nArray[x.lllIIIllI[1]] = lllIIIllI[13];
                if (x.llIIIIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray9 = new int[lllIIIllI[0]];
                    nArray9[x.lllIIIllI[1]] = lllIIIllI[14];
                    if (x.llIIIIIIlIll(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                        if (x.llIIIIIIlIIl(Widgets.get((int)lllIIIllI[40]).isEmpty() ? 1 : 0)) {
                            if (x.llIIIIIIlIll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                                String[] stringArray = new String[lllIIIllI[0]];
                                stringArray[x.lllIIIllI[1]] = lllIIIIll[lllIIIllI[41]];
                                g.a(lllIIIIll[lllIIIllI[32]], stringArray, lllIIIllI[0]);
                            }
                            if (x.llIIIIIIlIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
                                Dialog.enterAmount((int)lllIIIllI[42]);
                            }
                        }
                        if (x.llIIIIIIlIll(Widgets.get((int)lllIIIllI[40]).isEmpty() ? 1 : 0)) {
                            lllllIlIlllII = Widgets.get((int)lllIIIllI[40], (int)lllIIIllI[43]);
                            lllllIlIllIll = Widgets.get((int)lllIIIllI[40], (int)lllIIIllI[27]);
                            if (x.llIIIIIIllII(lllllIlIlllII)) {
                                Time.sleepTicks((int)lllIIIllI[0]);
                                0;
                                Mouse.click((int)Widgets.get((int)lllIIIllI[40], (int)lllIIIllI[43]).getClickPoint().getX(), (int)Widgets.get((int)lllIIIllI[40], (int)lllIIIllI[43]).getClickPoint().getY(), (boolean)lllIIIllI[0]);
                                Time.sleepTicks((int)lllIIIllI[3]);
                                0;
                            }
                            if (x.llIIIIIIllII(lllllIlIllIll)) {
                                Time.sleepTicks((int)lllIIIllI[0]);
                                0;
                                Mouse.click((int)Widgets.get((int)lllIIIllI[40], (int)lllIIIllI[27]).getClickPoint().getX(), (int)Widgets.get((int)lllIIIllI[40], (int)lllIIIllI[27]).getClickPoint().getY(), (boolean)lllIIIllI[0]);
                                Time.sleepTicks((int)lllIIIllI[3]);
                                0;
                            }
                        }
                    }
                }
                g.a(cG);
            }
            if (x.llIIIIIlIIlI(e.j(dL), lllIIIllI[44])) {
                String[] stringArray = new String[lllIIIllI[0]];
                stringArray[x.lllIIIllI[1]] = lllIIIIll[lllIIIllI[45]];
                if (x.llIIIIIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0) && x.llIIIIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray3 = new String[lllIIIllI[0]];
                    stringArray3[x.lllIIIllI[1]] = lllIIIIll[lllIIIllI[46]];
                    Inventory.getFirst((String[])stringArray3).interact(lllIIIIll[lllIIIllI[21]]);
                    Time.sleepTicks((int)lllIIIllI[3]);
                    0;
                }
                g.a(cG);
            }
            if (x.llIIIIIlIIlI(e.j(dL), lllIIIllI[47])) {
                lllllIlIlllII = new WorldPoint(lllIIIllI[48], lllIIIllI[49], lllIIIllI[1]);
                if (x.llIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllIlIlllII), lllIIIllI[10])) {
                    AccBuilderGWD.c = lllIIIIll[lllIIIllI[50]];
                    Movement.walkTo((WorldPoint)lllllIlIlllII);
                    0;
                    Time.sleepTicks((int)lllIIIllI[0]);
                    0;
                }
                if (x.llIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllIlIlllII), lllIIIllI[10])) {
                    g.a(cG);
                    lllllIlIllIll = TileItems.getNearest(tileItem -> {
                        int n2;
                        if (x.llIIIIIlIIlI(tileItem.getId(), lllIIIllI[53]) && x.llIIIIIIlIIl(tileItem.getWorldLocation().equals((Object)new WorldPoint(lllIIIllI[112], lllIIIllI[49], lllIIIllI[1])) ? 1 : 0)) {
                            n2 = lllIIIllI[0];
                            0;
                            
                            }
                        } else {
                            n2 = lllIIIllI[1];
                        }
                        return n2 != 0;
                    });
                    TileItem lllllIlIllIlI = TileItems.getNearest(tileItem -> {
                        int n2;
                        if (x.llIIIIIlIIlI(tileItem.getId(), lllIIIllI[54]) && x.llIIIIIIlIIl(tileItem.getWorldLocation().equals((Object)new WorldPoint(lllIIIllI[112], lllIIIllI[110], lllIIIllI[1])) ? 1 : 0)) {
                            n2 = lllIIIllI[0];
                            0;
                            if (1 == 0) {
                                return ((119 + 0 - 15 + 80 ^ 109 + 12 - 49 + 66) & (0x3D ^ 0x39 ^ (0x87 ^ 0xB1) ^ -1)) != 0;
                            }
                        } else {
                            n2 = lllIIIllI[1];
                        }
                        return n2 != 0;
                    });
                    TileItem lllllIlIllIIl = TileItems.getNearest(tileItem -> {
                        int n2;
                        if (x.llIIIIIlIIlI(tileItem.getId(), lllIIIllI[57]) && x.llIIIIIIlIIl(tileItem.getWorldLocation().equals((Object)new WorldPoint(lllIIIllI[48], lllIIIllI[49], lllIIIllI[1])) ? 1 : 0)) {
                            n2 = lllIIIllI[0];
                            0;
                            
                            }
                        } else {
                            n2 = lllIIIllI[1];
                        }
                        return n2 != 0;
                    });
                    TileItem lllllIlIllIII = TileItems.getNearest(tileItem -> {
                        int n2;
                        if (x.llIIIIIlIIlI(tileItem.getId(), lllIIIllI[59]) && x.llIIIIIIlIIl(tileItem.getWorldLocation().equals((Object)new WorldPoint(lllIIIllI[48], lllIIIllI[107], lllIIIllI[1])) ? 1 : 0)) {
                            n2 = lllIIIllI[0];
                            0;
                            if (3 == ((124 + 167 - 250 + 137 ^ 104 + 16 - 29 + 41) & (0xA7 ^ 0xB1 ^ (0x5B ^ 0x7B) ^ -1))) {
                                return ((0x59 ^ 0x11 ^ (0xB5 ^ 0xC3)) & (9 ^ 0x49 ^ (0xD ^ 0x73) ^ -1)) != 0;
                            }
                        } else {
                            n2 = lllIIIllI[1];
                        }
                        return n2 != 0;
                    });
                    TileItem lllllIlIlIlll = TileItems.getNearest(tileItem -> {
                        int n2;
                        if (x.llIIIIIlIIlI(tileItem.getId(), lllIIIllI[56]) && x.llIIIIIIlIIl(tileItem.getWorldLocation().equals((Object)new WorldPoint(lllIIIllI[48], lllIIIllI[110], lllIIIllI[1])) ? 1 : 0)) {
                            n2 = lllIIIllI[0];
                            0;
                            if (((0xBE ^ 0x8C) & ~(0x18 ^ 0x2A)) < -1) {
                                return false;
                            }
                        } else {
                            n2 = lllIIIllI[1];
                        }
                        return n2 != 0;
                    });
                    TileObject lllllIlIlIllI = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (x.llIIIIIIlIIl(tileObject.getName().contains(lllIIIIll[lllIIIllI[61]]) ? 1 : 0)) {
                            String[] stringArray = new String[lllIIIllI[0]];
                            stringArray[x.lllIIIllI[1]] = lllIIIIll[lllIIIllI[114]];
                            if (x.llIIIIIIlIIl(tileObject.hasAction(stringArray) ? 1 : 0) && x.llIIIIIlIIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllIIIllI[115], lllIIIllI[116], lllIIIllI[1])), lllIIIllI[3])) {
                                n2 = lllIIIllI[0];
                                0;
                                if (3 >= 1) return n2 != 0;
                                return false;
                            }
                        }
                        n2 = lllIIIllI[1];
                        return n2 != 0;
                    });
                    if (x.llIIIIIIllII(lllllIlIlIllI)) {
                        AccBuilderGWD.c = lllIIIIll[lllIIIllI[51]];
                        lllllIlIlIllI.interact(lllIIIIll[lllIIIllI[52]]);
                        Time.sleepTicks((int)lllIIIllI[16]);
                        0;
                    }
                    if (x.llIIIIIlIIll(lllllIlIllIll)) {
                        int[] nArray = new int[lllIIIllI[0]];
                        nArray[x.lllIIIllI[1]] = lllIIIllI[53];
                        if (x.llIIIIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray10 = new int[lllIIIllI[0]];
                            nArray10[x.lllIIIllI[1]] = lllIIIllI[53];
                            TileItems.getNearest((int[])nArray10).interact(lllIIIIll[lllIIIllI[43]]);
                            Time.sleepTicks((int)lllIIIllI[3]);
                            0;
                        }
                        int[] nArray11 = new int[lllIIIllI[0]];
                        nArray11[x.lllIIIllI[1]] = lllIIIllI[53];
                        if (x.llIIIIIIlIIl(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                            int[] nArray12 = new int[lllIIIllI[0]];
                            nArray12[x.lllIIIllI[1]] = lllIIIllI[53];
                            Inventory.getFirst((int[])nArray12).useOn(TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (x.llIIIIIIlIIl(tileObject.getName().contains(lllIIIIll[lllIIIllI[113]]) ? 1 : 0) && x.llIIIIIIlIIl(tileObject.getWorldLocation().equals((Object)new WorldPoint(lllIIIllI[112], lllIIIllI[49], lllIIIllI[1])) ? 1 : 0)) {
                                    n2 = lllIIIllI[0];
                                    0;
                                    if ((0x5F ^ 0x5B) <= ((0x23 ^ 4) & ~(0x24 ^ 3))) {
                                        return false;
                                    }
                                } else {
                                    n2 = lllIIIllI[1];
                                }
                                return n2 != 0;
                            }));
                        }
                    }
                    if (x.llIIIIIIllII(lllllIlIllIll) && x.llIIIIIlIIll(lllllIlIllIlI)) {
                        int[] nArray = new int[lllIIIllI[0]];
                        nArray[x.lllIIIllI[1]] = lllIIIllI[54];
                        if (x.llIIIIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray13 = new int[lllIIIllI[0]];
                            nArray13[x.lllIIIllI[1]] = lllIIIllI[54];
                            TileItems.getNearest((int[])nArray13).interact(lllIIIIll[lllIIIllI[55]]);
                            Time.sleepTicks((int)lllIIIllI[3]);
                            0;
                        }
                        int[] nArray14 = new int[lllIIIllI[0]];
                        nArray14[x.lllIIIllI[1]] = lllIIIllI[54];
                        if (x.llIIIIIIlIIl(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                            int[] nArray15 = new int[lllIIIllI[0]];
                            nArray15[x.lllIIIllI[1]] = lllIIIllI[54];
                            Inventory.getFirst((int[])nArray15).useOn(TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (x.llIIIIIIlIIl(tileObject.getName().contains(lllIIIIll[lllIIIllI[111]]) ? 1 : 0) && x.llIIIIIIlIIl(tileObject.getWorldLocation().equals((Object)new WorldPoint(lllIIIllI[112], lllIIIllI[110], lllIIIllI[1])) ? 1 : 0)) {
                                    n2 = lllIIIllI[0];
                                    0;
                                    if ((0x31 ^ 0x34) == 0) {
                                        return false;
                                    }
                                } else {
                                    n2 = lllIIIllI[1];
                                }
                                return n2 != 0;
                            }));
                        }
                    }
                    if (x.llIIIIIIllII(lllllIlIllIll) && x.llIIIIIIllII(lllllIlIllIlI) && x.llIIIIIlIIll(lllllIlIlIlll)) {
                        int[] nArray = new int[lllIIIllI[0]];
                        nArray[x.lllIIIllI[1]] = lllIIIllI[56];
                        if (x.llIIIIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray16 = new int[lllIIIllI[0]];
                            nArray16[x.lllIIIllI[1]] = lllIIIllI[56];
                            TileItems.getNearest((int[])nArray16).interact(lllIIIIll[lllIIIllI[27]]);
                            Time.sleepTicks((int)lllIIIllI[3]);
                            0;
                        }
                        int[] nArray17 = new int[lllIIIllI[0]];
                        nArray17[x.lllIIIllI[1]] = lllIIIllI[56];
                        if (x.llIIIIIIlIIl(Inventory.contains((int[])nArray17) ? 1 : 0)) {
                            int[] nArray18 = new int[lllIIIllI[0]];
                            nArray18[x.lllIIIllI[1]] = lllIIIllI[56];
                            Inventory.getFirst((int[])nArray18).useOn(TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (x.llIIIIIIlIIl(tileObject.getName().contains(lllIIIIll[lllIIIllI[109]]) ? 1 : 0) && x.llIIIIIIlIIl(tileObject.getWorldLocation().equals((Object)new WorldPoint(lllIIIllI[48], lllIIIllI[110], lllIIIllI[1])) ? 1 : 0)) {
                                    n2 = lllIIIllI[0];
                                    0;
                                    
                                    }
                                } else {
                                    n2 = lllIIIllI[1];
                                }
                                return n2 != 0;
                            }));
                        }
                    }
                    if (x.llIIIIIIllII(lllllIlIllIll) && x.llIIIIIIllII(lllllIlIllIlI) && x.llIIIIIIllII(lllllIlIlIlll) && x.llIIIIIlIIll(lllllIlIllIIl)) {
                        int[] nArray = new int[lllIIIllI[0]];
                        nArray[x.lllIIIllI[1]] = lllIIIllI[57];
                        if (x.llIIIIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray19 = new int[lllIIIllI[0]];
                            nArray19[x.lllIIIllI[1]] = lllIIIllI[57];
                            TileItems.getNearest((int[])nArray19).interact(lllIIIIll[lllIIIllI[58]]);
                            Time.sleepTicks((int)lllIIIllI[3]);
                            0;
                        }
                        int[] nArray20 = new int[lllIIIllI[0]];
                        nArray20[x.lllIIIllI[1]] = lllIIIllI[57];
                        if (x.llIIIIIIlIIl(Inventory.contains((int[])nArray20) ? 1 : 0)) {
                            int[] nArray21 = new int[lllIIIllI[0]];
                            nArray21[x.lllIIIllI[1]] = lllIIIllI[57];
                            Inventory.getFirst((int[])nArray21).useOn(TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (x.llIIIIIIlIIl(tileObject.getName().contains(lllIIIIll[lllIIIllI[108]]) ? 1 : 0) && x.llIIIIIIlIIl(tileObject.getWorldLocation().equals((Object)new WorldPoint(lllIIIllI[48], lllIIIllI[49], lllIIIllI[1])) ? 1 : 0)) {
                                    n2 = lllIIIllI[0];
                                    0;
                                    if (2 < ((0x77 ^ 0x2F) & ~(0x49 ^ 0x11))) {
                                        return false;
                                    }
                                } else {
                                    n2 = lllIIIllI[1];
                                }
                                return n2 != 0;
                            }));
                        }
                    }
                    if (x.llIIIIIIllII(lllllIlIllIll) && x.llIIIIIIllII(lllllIlIllIlI) && x.llIIIIIIllII(lllllIlIlIlll) && x.llIIIIIIllII(lllllIlIllIIl) && x.llIIIIIlIIll(lllllIlIllIII)) {
                        int[] nArray = new int[lllIIIllI[0]];
                        nArray[x.lllIIIllI[1]] = lllIIIllI[59];
                        if (x.llIIIIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray22 = new int[lllIIIllI[0]];
                            nArray22[x.lllIIIllI[1]] = lllIIIllI[59];
                            TileItems.getNearest((int[])nArray22).interact(lllIIIIll[lllIIIllI[60]]);
                            Time.sleepTicks((int)lllIIIllI[3]);
                            0;
                        }
                        int[] nArray23 = new int[lllIIIllI[0]];
                        nArray23[x.lllIIIllI[1]] = lllIIIllI[59];
                        if (x.llIIIIIIlIIl(Inventory.contains((int[])nArray23) ? 1 : 0)) {
                            int[] nArray24 = new int[lllIIIllI[0]];
                            nArray24[x.lllIIIllI[1]] = lllIIIllI[59];
                            Inventory.getFirst((int[])nArray24).useOn(TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (x.llIIIIIIlIIl(tileObject.getName().contains(lllIIIIll[lllIIIllI[106]]) ? 1 : 0) && x.llIIIIIIlIIl(tileObject.getWorldLocation().equals((Object)new WorldPoint(lllIIIllI[48], lllIIIllI[107], lllIIIllI[1])) ? 1 : 0)) {
                                    n2 = lllIIIllI[0];
                                    0;
                                    if (((0x5D ^ 0x3E ^ (0x21 ^ 0x73)) & (32 + 32 - -43 + 20 ^ (0x29 ^ 0x67) ^ -1)) != 0) {
                                        return ((0xC8 ^ 0xA7 ^ (0xF2 ^ 0xB9)) & (0x5C ^ 0x2B ^ (0xF6 ^ 0xA5) ^ -1)) != 0;
                                    }
                                } else {
                                    n2 = lllIIIllI[1];
                                }
                                return n2 != 0;
                            }));
                        }
                    }
                }
            }
            if (x.llIIIIIlIIlI(e.j(dL), lllIIIllI[61])) {
                if (x.llIIIIIIlIll(dK ? 1 : 0)) {
                    String[] stringArray = new String[lllIIIllI[0]];
                    stringArray[x.lllIIIllI[1]] = lllIIIIll[lllIIIllI[62]];
                    if (x.llIIIIIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        if (x.llIIIIIIlIll(dG ? 1 : 0)) {
                            String[] stringArray4 = new String[lllIIIllI[0]];
                            stringArray4[x.lllIIIllI[1]] = lllIIIIll[lllIIIllI[63]];
                            if (x.llIIIIIIlIll(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                                String[] stringArray5 = new String[lllIIIllI[0]];
                                stringArray5[x.lllIIIllI[1]] = lllIIIIll[lllIIIllI[64]];
                                if (x.llIIIIIlIIll(NPCs.getNearest((String[])stringArray5))) {
                                    lllllIlIlllII = new WorldPoint(lllIIIllI[65], lllIIIllI[66], lllIIIllI[1]);
                                    if (x.llIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllIlIlllII), lllIIIllI[4])) {
                                        AccBuilderGWD.c = lllIIIIll[lllIIIllI[67]];
                                        Movement.walkTo((WorldPoint)lllllIlIlllII);
                                        0;
                                        Time.sleepTicks((int)lllIIIllI[0]);
                                        0;
                                    }
                                    if (x.llIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllIlIlllII), lllIIIllI[4])) {
                                        String[] stringArray6 = new String[lllIIIllI[0]];
                                        stringArray6[x.lllIIIllI[1]] = lllIIIIll[lllIIIllI[68]];
                                        TileObjects.getNearest((String[])stringArray6).interact(lllIIIIll[lllIIIllI[69]]);
                                        Time.sleepTicks((int)lllIIIllI[4]);
                                        0;
                                    }
                                }
                                String[] stringArray7 = new String[lllIIIllI[0]];
                                stringArray7[x.lllIIIllI[1]] = lllIIIIll[lllIIIllI[70]];
                                if (x.llIIIIIIllII(NPCs.getNearest((String[])stringArray7))) {
                                    String[] stringArray8 = new String[lllIIIllI[0]];
                                    stringArray8[x.lllIIIllI[1]] = lllIIIIll[lllIIIllI[71]];
                                    g.a(lllIIIIll[lllIIIllI[33]], stringArray8);
                                }
                            }
                        }
                        if (x.llIIIIIIlIIl(dG ? 1 : 0)) {
                            String[] stringArray9 = new String[lllIIIllI[0]];
                            stringArray9[x.lllIIIllI[1]] = lllIIIIll[lllIIIllI[72]];
                            if (x.llIIIIIIlIll(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                                String[] stringArray10 = new String[lllIIIllI[0]];
                                stringArray10[x.lllIIIllI[1]] = lllIIIIll[lllIIIllI[73]];
                                if (x.llIIIIIIlIll(Inventory.contains((String[])stringArray10) ? 1 : 0)) {
                                    lllllIlIlllII = new WorldPoint(lllIIIllI[74], lllIIIllI[75], lllIIIllI[1]);
                                    if (x.llIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllIlIlllII), lllIIIllI[4])) {
                                        AccBuilderGWD.c = lllIIIIll[lllIIIllI[76]];
                                        Movement.walkTo((WorldPoint)lllllIlIlllII);
                                        0;
                                        Time.sleepTicks((int)lllIIIllI[0]);
                                        0;
                                    }
                                    if (x.llIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllIlIlllII), lllIIIllI[4])) {
                                        g.a(lllIIIIll[lllIIIllI[77]], cG, lllIIIllI[0]);
                                    }
                                }
                            }
                        }
                        if (x.llIIIIIIlIIl(dG ? 1 : 0)) {
                            String[] stringArray11 = new String[lllIIIllI[0]];
                            stringArray11[x.lllIIIllI[1]] = lllIIIIll[lllIIIllI[78]];
                            if (x.llIIIIIIlIIl(Inventory.contains((String[])stringArray11) ? 1 : 0) && x.llIIIIIIlIll(dH ? 1 : 0) && x.llIIIIIIlIll(dI ? 1 : 0)) {
                                lllllIlIlllII = new WorldPoint(lllIIIllI[79], lllIIIllI[80], lllIIIllI[1]);
                                if (x.llIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllIlIlllII), lllIIIllI[10])) {
                                    AccBuilderGWD.c = lllIIIIll[lllIIIllI[81]];
                                    Movement.walkTo((WorldPoint)lllllIlIlllII);
                                    0;
                                    Time.sleepTicks((int)lllIIIllI[0]);
                                    0;
                                }
                                if (x.llIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllIlIlllII), lllIIIllI[10])) {
                                    g.a(lllIIIIll[lllIIIllI[82]], cG, lllIIIllI[0]);
                                }
                            }
                        }
                        if (x.llIIIIIIlIIl(dH ? 1 : 0)) {
                            if (x.llIIIIIIlIll(dI ? 1 : 0)) {
                                if (x.llIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(dg), lllIIIllI[22])) {
                                    AccBuilderGWD.c = lllIIIIll[lllIIIllI[83]];
                                    if (x.llIIIIIIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    e.l(lllIIIllI[5]);
                                    Movement.walkTo((WorldPoint)dg);
                                    0;
                                    Time.sleepTicks((int)lllIIIllI[0]);
                                    0;
                                }
                                if (x.llIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(dg), lllIIIllI[22])) {
                                    g.a(lllIIIIll[lllIIIllI[20]], cG, lllIIIllI[0]);
                                }
                            }
                            if (x.llIIIIIIlIIl(dI ? 1 : 0)) {
                                lllllIlIlllII = new WorldPoint(lllIIIllI[79], lllIIIllI[80], lllIIIllI[1]);
                                if (x.llIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllIlIlllII), lllIIIllI[10])) {
                                    AccBuilderGWD.c = lllIIIIll[lllIIIllI[84]];
                                    Movement.walkTo((WorldPoint)lllllIlIlllII);
                                    0;
                                    Time.sleepTicks((int)lllIIIllI[0]);
                                    0;
                                }
                                if (x.llIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllIlIlllII), lllIIIllI[10])) {
                                    g.a(lllIIIIll[lllIIIllI[85]], cG, lllIIIllI[0]);
                                }
                            }
                        }
                    }
                    String[] stringArray12 = new String[lllIIIllI[0]];
                    stringArray12[x.lllIIIllI[1]] = lllIIIIll[lllIIIllI[86]];
                    if (x.llIIIIIIlIIl(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                        lllllIlIlllII = new WorldPoint(lllIIIllI[74], lllIIIllI[75], lllIIIllI[1]);
                        if (x.llIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllIlIlllII), lllIIIllI[4])) {
                            AccBuilderGWD.c = lllIIIIll[lllIIIllI[87]];
                            Movement.walkTo((WorldPoint)lllllIlIlllII);
                            0;
                            Time.sleepTicks((int)lllIIIllI[0]);
                            0;
                        }
                        if (x.llIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllIlIlllII), lllIIIllI[4])) {
                            g.a(lllIIIIll[lllIIIllI[44]], cG, lllIIIllI[0]);
                        }
                    }
                }
                if (x.llIIIIIIlIIl(dK ? 1 : 0) && x.llIIIIIIlIll(dJ ? 1 : 0)) {
                    String[] stringArray = new String[lllIIIllI[0]];
                    stringArray[x.lllIIIllI[1]] = lllIIIIll[lllIIIllI[88]];
                    if (x.llIIIIIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        lllllIlIlllII = new WorldPoint(lllIIIllI[74], lllIIIllI[75], lllIIIllI[1]);
                        if (x.llIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllIlIlllII), lllIIIllI[30])) {
                            g.a(lllIIIIll[lllIIIllI[89]], cG, lllIIIllI[0]);
                        }
                    }
                    String[] stringArray13 = new String[lllIIIllI[0]];
                    stringArray13[x.lllIIIllI[1]] = lllIIIIll[lllIIIllI[90]];
                    if (x.llIIIIIIlIIl(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        lllllIlIlllII = new WorldPoint(lllIIIllI[91], lllIIIllI[92], lllIIIllI[1]);
                        if (x.llIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllIlIlllII), lllIIIllI[3])) {
                            AccBuilderGWD.c = lllIIIIll[lllIIIllI[93]];
                            Movement.walkTo((WorldPoint)lllllIlIlllII);
                            0;
                            Time.sleepTicks((int)lllIIIllI[0]);
                            0;
                        }
                        if (x.llIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllIlIlllII), lllIIIllI[3])) {
                            dJ = lllIIIllI[0];
                        }
                    }
                }
                if (x.llIIIIIIlIIl(dJ ? 1 : 0)) {
                    if (x.llIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(dg), lllIIIllI[22])) {
                        AccBuilderGWD.c = lllIIIIll[lllIIIllI[47]];
                        if (x.llIIIIIIlIIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        e.l(lllIIIllI[5]);
                        Movement.walkTo((WorldPoint)dg);
                        0;
                        Time.sleepTicks((int)lllIIIllI[0]);
                        0;
                    }
                    if (x.llIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(dg), lllIIIllI[22])) {
                        if (x.llIIIIIIlIlI(dk, lllIIIllI[0])) {
                            as.nD += lllIIIllI[0];
                            as.u(AccBuilderGWD.m);
                            dk += lllIIIllI[0];
                            as.nD = lllIIIllI[1];
                        }
                        g.a(lllIIIIll[lllIIIllI[94]], cG, lllIIIllI[0]);
                    }
                }
            }
            if (x.llIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllIIIllI[74], lllIIIllI[75], lllIIIllI[1])), lllIIIllI[31])) {
                int[] nArray = new int[lllIIIllI[0]];
                nArray[x.lllIIIllI[1]] = lllIIIllI[9];
                if (x.llIIIIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray25 = new int[lllIIIllI[0]];
                    nArray25[x.lllIIIllI[1]] = lllIIIllI[7];
                    if (x.llIIIIIIlIll(Inventory.contains((int[])nArray25) ? 1 : 0)) {
                        dK = lllIIIllI[0];
                    }
                }
            }
            String[] stringArray = new String[lllIIIllI[0]];
            stringArray[x.lllIIIllI[1]] = lllIIIIll[lllIIIllI[95]];
            if (x.llIIIIIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                dI = lllIIIllI[0];
            }
        }
    }

    private static boolean llIIIIIlIIll(Object object) {
        return object == null;
    }
}

