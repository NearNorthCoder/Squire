/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 */
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.R;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.as;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.j;
import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;

public class Q
implements ab {
    static /* synthetic */ String[] cG;
    private static /* synthetic */ String[] kU;
    static /* synthetic */ WorldPoint dg;
    private static final /* synthetic */ HashMap<Integer, String> kL;
    private static /* synthetic */ String[] lllIllIll;
    public static /* synthetic */ boolean bv;
    static /* synthetic */ WorldPoint kR;
    public static /* synthetic */ boolean kN;
    static /* synthetic */ WorldPoint kP;
    static /* synthetic */ WorldPoint kO;
    static /* synthetic */ int dk;
    static /* synthetic */ WorldPoint kQ;
    public static /* synthetic */ List<d> bx;
    private static final /* synthetic */ String kM;
    static /* synthetic */ boolean dl;
    private static /* synthetic */ int[] lllIlllIl;
    private final /* synthetic */ int kV = 0;
    static /* synthetic */ WorldPoint kT;
    static /* synthetic */ WorldPoint kS;

    public Q() {
        this.kV = lllIlllIl[0];
    }

    @Override
    public String ag() {
        return lllIllIll[lllIlllIl[87]];
    }

    private static void cP() {
        if (!Q.llIIlIlllllI(kU) || Q.llIIlIllIllI(Vars.getBit((int)lllIlllIl[70])) && Q.llIIlIllIllI(Vars.getBit((int)lllIlllIl[71]))) {
            return;
        }
        String[] stringArray = new String[lllIlllIl[10]];
        stringArray[Q.lllIlllIl[0]] = kL.get(Vars.getBit((int)lllIlllIl[70]));
        stringArray[Q.lllIlllIl[1]] = kL.get(Vars.getBit((int)lllIlllIl[71]));
        stringArray[Q.lllIlllIl[3]] = kL.get(Vars.getBit((int)lllIlllIl[72]));
        stringArray[Q.lllIlllIl[5]] = kL.get(Vars.getBit((int)lllIlllIl[73]));
        stringArray[Q.lllIlllIl[4]] = kL.get(Vars.getBit((int)lllIlllIl[74]));
        kU = stringArray;
        String string = "Say the following in order: " + String.join((CharSequence)lllIllIll[lllIlllIl[75]], kU);
        System.out.println(string);
    }

    private static void llIIlIllIIlI() {
        lllIlllIl = new int[122];
        Q.lllIlllIl[0] = (0x6D ^ 0x3D) & ~(0xC3 ^ 0x93);
        Q.lllIlllIl[1] = 1;
        Q.lllIlllIl[2] = 0xFFFFD3BB & 0x3FCC;
        Q.lllIlllIl[3] = 2;
        Q.lllIlllIl[4] = 69 + 0 - -14 + 50 ^ 83 + 25 - 48 + 69;
        Q.lllIlllIl[5] = 3;
        Q.lllIlllIl[6] = -(0xFFFFF3ED & 0x2CBB) & (0xFFFFFFEF & 0x3FFF);
        Q.lllIlllIl[7] = -(0xFFFFF55B & 0x7FB5) & (0xFFFFF77E & 0x7F9F);
        Q.lllIlllIl[8] = 0xFFFFAF8D & 0x57FB;
        Q.lllIlllIl[9] = 0x65 ^ 0x7C;
        Q.lllIlllIl[10] = 0x55 ^ 0x50;
        Q.lllIlllIl[11] = 0xFFFFBDF3 & 0x735D;
        Q.lllIlllIl[12] = 0x5E ^ 0x54;
        Q.lllIlllIl[13] = -(0xFFFFAD9B & 0x767D) & (0xFFFFE7FB & 0x3FFF);
        Q.lllIlllIl[14] = 0xFFFFDBE8 & 0x27FF;
        Q.lllIlllIl[15] = 0xA9 ^ 0x9B;
        Q.lllIlllIl[16] = 0xA5 ^ 0xA3;
        Q.lllIlllIl[17] = 0xFFFFEB7B & 0x15FF;
        Q.lllIlllIl[18] = 0x59 ^ 0x5E;
        Q.lllIlllIl[19] = 0x21 ^ 0x29;
        Q.lllIlllIl[20] = 139 + 66 - 140 + 79 ^ 10 + 74 - -54 + 15;
        Q.lllIlllIl[21] = 0xFFFF8FFF & 0x7C7F;
        Q.lllIlllIl[22] = -(0xFFFFFBB3 & 0x247F) & (0xFFFFFFFF & 0x2DBF);
        Q.lllIlllIl[23] = 139 + 122 - 137 + 16 ^ 40 + 80 - -14 + 1;
        Q.lllIlllIl[24] = 0xFFFFDF67 & 0x29F8;
        Q.lllIlllIl[25] = 0x90 ^ 0x9C;
        Q.lllIlllIl[26] = 0xB8 ^ 0xB5;
        Q.lllIlllIl[27] = 0x49 ^ 0x47;
        Q.lllIlllIl[28] = 1 ^ (0x9A ^ 0x94);
        Q.lllIlllIl[29] = 0x8A ^ 0x9A;
        Q.lllIlllIl[30] = 8 ^ 0x19;
        Q.lllIlllIl[31] = 74 + 7 - -48 + 49 ^ 126 + 6 - 41 + 69;
        Q.lllIlllIl[32] = 0xB7 ^ 0xA4;
        Q.lllIlllIl[33] = 0x5C ^ 0x48;
        Q.lllIlllIl[34] = 0xF ^ 0x49 ^ (0xD1 ^ 0x82);
        Q.lllIlllIl[35] = 0x20 ^ 0x36;
        Q.lllIlllIl[36] = 0x63 ^ 0x74;
        Q.lllIlllIl[37] = 0xB6 ^ 0xAE;
        Q.lllIlllIl[38] = 0xB6 ^ 0xAC;
        Q.lllIlllIl[39] = 0x39 ^ 0x5E ^ (6 ^ 0x7A);
        Q.lllIlllIl[40] = 0x6E ^ 0x72;
        Q.lllIlllIl[41] = 19 + 44 - 7 + 72 ^ 124 + 76 - 43 + 0;
        Q.lllIlllIl[42] = 0x83 ^ 0x9D;
        Q.lllIlllIl[43] = 134 + 28 - 46 + 62 ^ 148 + 118 - 260 + 167;
        Q.lllIlllIl[44] = 0xB0 ^ 0x90;
        Q.lllIlllIl[45] = 0x36 ^ 0x10 ^ (0 ^ 7);
        Q.lllIlllIl[46] = -(0xFFFFFEB7 & 0x7DB) & (0xFFFF8FFB & 0x7FF7);
        Q.lllIlllIl[47] = 0x17 ^ 0x73 ^ (0xE8 ^ 0xAE);
        Q.lllIlllIl[48] = -(0xFFFFF1ED & 0x5E93) & (0xFFFFDDFF & 0x7BDF);
        Q.lllIlllIl[49] = 0x17 ^ 0x5A ^ (7 ^ 0x69);
        Q.lllIlllIl[50] = 0x48 ^ 0x6C;
        Q.lllIlllIl[51] = 0x65 ^ 0x40;
        Q.lllIlllIl[52] = 0xA2 ^ 0x9C ^ (0x7D ^ 0x65);
        Q.lllIlllIl[53] = 0x32 ^ 0x5A ^ (0x89 ^ 0xC6);
        Q.lllIlllIl[54] = 148 + 22 - 22 + 15 ^ 26 + 113 - 105 + 105;
        Q.lllIlllIl[55] = 22 + 33 - -79 + 15 ^ 159 + 17 - 64 + 76;
        Q.lllIlllIl[56] = 0x81 ^ 0xAB;
        Q.lllIlllIl[57] = 0x29 ^ 0x41 ^ (0xC5 ^ 0x86);
        Q.lllIlllIl[58] = 0xB5 ^ 0x99;
        Q.lllIlllIl[59] = 128 + 119 - 70 + 8 ^ 57 + 61 - 42 + 72;
        Q.lllIlllIl[60] = 0x39 ^ 0x5C ^ (0x47 ^ 0xC);
        Q.lllIlllIl[61] = 0xE8 ^ 0xAE ^ (0xD0 ^ 0xB9);
        Q.lllIlllIl[62] = 0x8E ^ 0xBE;
        Q.lllIlllIl[63] = 0x3F ^ 0xE;
        Q.lllIlllIl[64] = 0xBE ^ 0x8D;
        Q.lllIlllIl[65] = 0x22 ^ 4 ^ (0x8D ^ 0x9F);
        Q.lllIlllIl[66] = 91 + 136 - 167 + 82 ^ 137 + 146 - 207 + 111;
        Q.lllIlllIl[67] = 0xC3 ^ 0xAF ^ (0xF6 ^ 0xAC);
        Q.lllIlllIl[68] = 3 ^ (0x6F ^ 0x5B);
        Q.lllIlllIl[69] = 0xFE ^ 0xC6;
        Q.lllIlllIl[70] = 0xFFFFFA07 & 0xFFA;
        Q.lllIlllIl[71] = -(0xFFFFBEF1 & 0x75CF) & (0xFFFFBFD3 & 0x7EEF);
        Q.lllIlllIl[72] = -(0xFFFFDFDB & 0x25F7) & (0xFFFF8FDE & 0x7FF7);
        Q.lllIlllIl[73] = 0xFFFFEB97 & 0x1E6D;
        Q.lllIlllIl[74] = 0xFFFFCEC7 & 0x3B3E;
        Q.lllIlllIl[75] = 0x46 ^ 0x7F;
        Q.lllIlllIl[76] = 0xBA ^ 0x80;
        Q.lllIlllIl[77] = 0x50 ^ 0x6B;
        Q.lllIlllIl[78] = 0xFFFFF7D3 & 0x397F;
        Q.lllIlllIl[79] = 0x4F ^ 0x73;
        Q.lllIlllIl[80] = 0xFFFFB3F6 & 0x4E9D;
        Q.lllIlllIl[81] = -(0xFFFFE677 & 0x39FF) & (0xFFFFEFFF & 0x37F6);
        Q.lllIlllIl[82] = 0xFFFFAECD & 0x7FFE;
        Q.lllIlllIl[83] = -(0xFFFFC7AF & 0x3A57) & (0xFFFFEFFE & 0x73AF);
        Q.lllIlllIl[84] = -(0xFFFFFDF9 & 0x2A87) & (0xFFFFADAF & 0x7BFC);
        Q.lllIlllIl[85] = 0xFFFFEF7D & 0x17EE;
        Q.lllIlllIl[86] = 5 ^ 0x61;
        Q.lllIlllIl[87] = 0x83 ^ 0xBE;
        Q.lllIlllIl[88] = 0 ^ 0x3E;
        Q.lllIlllIl[89] = 0x7B ^ 0x3F ^ (0xF0 ^ 0x8B);
        Q.lllIlllIl[90] = 0xF0 ^ 0xB0;
        Q.lllIlllIl[91] = -(0xFFFFC3F7 & 0x7F7D) & (0xFFFFFFFF & 0x4FF7);
        Q.lllIlllIl[92] = 0xFFFFCDE5 & 0x3F7A;
        Q.lllIlllIl[93] = 0xFFFF8DCD & 0x7EB6;
        Q.lllIlllIl[94] = -(0xFFFFDA7D & 0x27E7) & (0xFFFFEFFE & 0x1FF5);
        Q.lllIlllIl[95] = 0xFFFF9FAF & 0x6DF9;
        Q.lllIlllIl[96] = 0xFFFF9FFE & 0x6C9B;
        Q.lllIlllIl[97] = -(0xFFFFBBE4 & 0x745F) & (0xFFFFBDEF & 0x7FFB);
        Q.lllIlllIl[98] = 0xFFFFA7AB & 0x7EFD;
        Q.lllIlllIl[99] = -(0xFFFF97FB & 0x6B97) & (0xFFFFCFBB & 0x3FFF);
        Q.lllIlllIl[100] = -(13 + 19 - -22 + 112) & (0xFFFFBEFF & 0x4DFF);
        Q.lllIlllIl[101] = 0xFFFFFFFF & 0xC9B;
        Q.lllIlllIl[102] = -(0xFFFFEFF5 & 0x325B) & (0xFFFFEFFB & 0x3F7F);
        Q.lllIlllIl[103] = 0xC6 ^ 0x87;
        Q.lllIlllIl[104] = 0x1B ^ 0x59;
        Q.lllIlllIl[105] = 0x6D ^ 0x2E;
        Q.lllIlllIl[106] = 53 + 121 - 48 + 1 ^ (0x16 ^ 0x2D);
        Q.lllIlllIl[107] = 0x3D ^ 0x78;
        Q.lllIlllIl[108] = 0x1E ^ 0x58;
        Q.lllIlllIl[109] = 9 ^ 0x60 ^ (0x7A ^ 0x54);
        Q.lllIlllIl[110] = 0x90 ^ 0x83 ^ (0xB ^ 0x50);
        Q.lllIlllIl[111] = 0x33 ^ 0x7A;
        Q.lllIlllIl[112] = 0xDC ^ 0x96;
        Q.lllIlllIl[113] = 0xB5 ^ 0x86 ^ (0xE1 ^ 0x99);
        Q.lllIlllIl[114] = 3 ^ 0x4F;
        Q.lllIlllIl[115] = 0x49 ^ 4;
        Q.lllIlllIl[116] = 36 + 132 - 14 + 47 ^ 88 + 106 - 65 + 6;
        Q.lllIlllIl[117] = 0x67 ^ 0x2E ^ (0x60 ^ 0x66);
        Q.lllIlllIl[118] = 128 + 195 - 161 + 54 ^ 121 + 43 - 96 + 68;
        Q.lllIlllIl[119] = 80 + 8 - 56 + 113 ^ 112 + 117 - 182 + 145;
        Q.lllIlllIl[120] = 35 + 158 - -18 + 15 ^ 21 + 34 - -24 + 97;
        Q.lllIlllIl[121] = 0x7C ^ 0x2F;
    }

    private static boolean llIIlIllllII(int n2, int n3) {
        return n2 == n3;
    }

    private static void Q() {
        block17: {
            d llIlIIIlIIllI;
            block16: {
                block15: {
                    block14: {
                        Object llIlIIIlIIlll;
                        block13: {
                            block12: {
                                int[] nArray = new int[lllIlllIl[1]];
                                nArray[Q.lllIlllIl[0]] = lllIlllIl[7];
                                if (!Q.llIIlIllIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block12;
                                int[] nArray2 = new int[lllIlllIl[1]];
                                nArray2[Q.lllIlllIl[0]] = lllIlllIl[7];
                                if (!Q.llIIlIllIlII(Bank.contains((int[])nArray2) ? 1 : 0)) break block13;
                                int[] nArray3 = new int[lllIlllIl[1]];
                                nArray3[Q.lllIlllIl[0]] = lllIlllIl[7];
                                if (!Q.llIIlIllIlIl(Bank.getFirst((int[])nArray3).getQuantity(), lllIlllIl[9])) break block13;
                            }
                            llIlIIIlIIlll = new d(lllIlllIl[7], lllIlllIl[9], lllIlllIl[80]);
                            bx.add((d)llIlIIIlIIlll);
                            0;
                        }
                        int[] nArray = new int[lllIlllIl[1]];
                        nArray[Q.lllIlllIl[0]] = lllIlllIl[8];
                        if (Q.llIIlIllIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            llIlIIIlIIlll = new d(lllIlllIl[8], lllIlllIl[1], lllIlllIl[81]);
                            bx.add((d)llIlIIIlIIlll);
                            0;
                        }
                        if (Q.llIIlIllIllI(Bank.contains((Predicate)(llIlIIIlIIlll = item -> item.getName().toLowerCase().contains(lllIllIll[lllIlllIl[88]]))) ? 1 : 0)) {
                            llIlIIIlIIllI = new d(lllIlllIl[82], lllIlllIl[10], lllIlllIl[83]);
                            bx.add(llIlIIIlIIllI);
                            0;
                        }
                        int[] nArray4 = new int[lllIlllIl[1]];
                        nArray4[Q.lllIlllIl[0]] = lllIlllIl[17];
                        if (!Q.llIIlIllIlII(Bank.contains((int[])nArray4) ? 1 : 0)) break block14;
                        int[] nArray5 = new int[lllIlllIl[1]];
                        nArray5[Q.lllIlllIl[0]] = lllIlllIl[17];
                        if (!Q.llIIlIllIlII(Bank.contains((int[])nArray5) ? 1 : 0)) break block15;
                        int[] nArray6 = new int[lllIlllIl[1]];
                        nArray6[Q.lllIlllIl[0]] = lllIlllIl[17];
                        if (!Q.llIIlIllIlIl(Bank.getFirst((int[])nArray6).getQuantity(), lllIlllIl[10])) break block15;
                    }
                    llIlIIIlIIllI = new d(lllIlllIl[17], lllIlllIl[12], lllIlllIl[84]);
                    bx.add(llIlIIIlIIllI);
                    0;
                }
                int[] nArray = new int[lllIlllIl[1]];
                nArray[Q.lllIlllIl[0]] = lllIlllIl[11];
                if (Q.llIIlIllIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    llIlIIIlIIllI = new d(lllIlllIl[11], lllIlllIl[4], j.ch);
                    bx.add(llIlIIIlIIllI);
                    0;
                }
                int[] nArray7 = new int[lllIlllIl[1]];
                nArray7[Q.lllIlllIl[0]] = lllIlllIl[6];
                if (!Q.llIIlIllIlII(Bank.contains((int[])nArray7) ? 1 : 0)) break block16;
                int[] nArray8 = new int[lllIlllIl[1]];
                nArray8[Q.lllIlllIl[0]] = lllIlllIl[6];
                if (!Q.llIIlIllIlII(Bank.contains((int[])nArray8) ? 1 : 0)) break block17;
                int[] nArray9 = new int[lllIlllIl[1]];
                nArray9[Q.lllIlllIl[0]] = lllIlllIl[6];
                if (!Q.llIIlIllIlIl(Bank.getFirst((int[])nArray9).getQuantity(), lllIlllIl[28])) break block17;
            }
            llIlIIIlIIllI = new d(lllIlllIl[6], lllIlllIl[54], lllIlllIl[85]);
            bx.add(llIlIIIlIIllI);
            0;
        }
    }

    private static boolean llIIlIllIlll(Object object) {
        return object != null;
    }

    private static String llIIlIIlllII(String llIlIIIIIlIll, String llIlIIIIIlIlI) {
        try {
            SecretKeySpec llIlIIIIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlIIIIIllll = Cipher.getInstance("Blowfish");
            llIlIIIIIllll.init(lllIlllIl[3], llIlIIIIlIIII);
            return new String(llIlIIIIIllll.doFinal(Base64.getDecoder().decode(llIlIIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIIIIIlllI) {
            llIlIIIIIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIlIllIlII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIlIlllIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIlIlllIIl(int n2) {
        return n2 < 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void llIlIIIlIlIll;
        int[] nArray = new int[lllIlllIl[3]];
        nArray[Q.lllIlllIl[0]] = lllIlllIl[6];
        nArray[Q.lllIlllIl[1]] = lllIlllIl[8];
        int[] nArray2 = nArray;
        int llIlIIIlIlIlI = lllIlllIl[0];
        while (Q.llIIlIllIlIl(llIlIIIlIlIlI, ((void)llIlIIIlIlIll).length)) {
            int[] nArray3 = new int[lllIlllIl[1]];
            nArray3[Q.lllIlllIl[0]] = llIlIIIlIlIll[llIlIIIlIlIlI];
            if (Q.llIIlIllIllI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lllIlllIl[0];
            }
            ++llIlIIIlIlIlI;
            0;
            if (3 < (0x21 ^ 0x51 ^ (0x12 ^ 0x66))) continue;
            return ((0xB7 ^ 0xA0 ^ (0x1B ^ 0x28)) & (3 ^ (0x43 ^ 0x64) ^ -1)) != 0;
        }
        return lllIlllIl[1];
    }

    private static boolean llIIlIllIllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlIlllllI(Object object) {
        return object == null;
    }

    @Override
    public int af() {
        try {
            Q.cO();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (2 != 2) {
            return (0x63 ^ 0x64) & ~(0x6B ^ 0x6C);
        }
        return lllIlllIl[86];
    }

    private static boolean llIIllIIIIII(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (Q.llIIlIllllll(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()), lllIlllIl[5])) {
            bl = lllIlllIl[1];
            0;
            if ((0x81 ^ 0x85) > (0x4B ^ 0x4F)) {
                return false;
            }
        } else {
            bl = lllIlllIl[0];
        }
        return bl;
    }

    private static boolean llIIlIllllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static String llIIlIIllIlI(String llIIllllllIII, String llIIlllllllII) {
        llIIllllllIII = new String(Base64.getDecoder().decode(llIIllllllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIllllllIll = new StringBuilder();
        char[] llIIllllllIlI = llIIlllllllII.toCharArray();
        int llIIllllllIIl = lllIlllIl[0];
        char[] llIIlllllIIll = llIIllllllIII.toCharArray();
        int llIIlllllIIlI = llIIlllllIIll.length;
        int llIIlllllIIIl = lllIlllIl[0];
        while (Q.llIIlIllIlIl(llIIlllllIIIl, llIIlllllIIlI)) {
            char llIIllllllllI = llIIlllllIIll[llIIlllllIIIl];
            llIIllllllIll.append((char)(llIIllllllllI ^ llIIllllllIlI[llIIllllllIIl % llIIllllllIlI.length]));
            0;
            ++llIIllllllIIl;
            ++llIIlllllIIIl;
            0;
            if (-1 <= 1) continue;
            return null;
        }
        return String.valueOf(llIIllllllIll);
    }

    private static boolean llIIlIllllIl(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public boolean ae() {
        return lllIlllIl[0];
    }

    private static int llIIlIllIIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    public static void cO() {
        block77: {
            block78: {
                Object llIlIIIllIlIl;
                block80: {
                    block79: {
                        if (Q.llIIlIllIlII(bv ? 1 : 0)) {
                            b.a(bx);
                            if (Q.llIIlIllIlIl(bx.size(), lllIlllIl[1])) {
                                System.out.println(lllIllIll[lllIlllIl[0]]);
                                bv = lllIlllIl[0];
                            }
                        }
                        if (!Q.llIIlIllIllI(bv ? 1 : 0)) break block77;
                        if (Q.llIIlIllIllI(Q.an() ? 1 : 0) && Q.llIIlIllIllI(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()))) {
                            llIlIIIllIlIl = BankLocation.getNearest();
                            if (Q.llIIlIllIlll(llIlIIIllIlIl) && Q.llIIlIllIllI(llIlIIIllIlIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderGWD.c = lllIllIll[lllIlllIl[1]];
                                a.a((BankLocation)llIlIIIllIlIl);
                            }
                            if (Q.llIIlIllIlll(llIlIIIllIlIl) && Q.llIIlIllIlII(llIlIIIllIlIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (Q.llIIlIllIllI(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lllIlllIl[2]);
                                    0;
                                }
                                if (Q.llIIlIllIlII(Bank.isOpen() ? 1 : 0)) {
                                    AccBuilderGWD.c = lllIllIll[lllIlllIl[3]];
                                    if (Q.llIIlIlllIII(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lllIlllIl[4]);
                                        0;
                                    }
                                    if (Q.llIIlIlllIII(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lllIlllIl[3]);
                                        0;
                                    }
                                    int[] nArray = new int[lllIlllIl[5]];
                                    nArray[Q.lllIlllIl[0]] = lllIlllIl[6];
                                    nArray[Q.lllIlllIl[1]] = lllIlllIl[7];
                                    nArray[Q.lllIlllIl[3]] = lllIlllIl[8];
                                    if (Q.llIIlIllIllI(e.d(nArray) ? 1 : 0)) {
                                        Q.Q();
                                        System.out.println(lllIllIll[lllIlllIl[5]]);
                                        bv = lllIlllIl[1];
                                        return;
                                    }
                                    int[] nArray2 = new int[lllIlllIl[1]];
                                    nArray2[Q.lllIlllIl[0]] = lllIlllIl[7];
                                    if (Q.llIIlIllIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                        int[] nArray3 = new int[lllIlllIl[1]];
                                        nArray3[Q.lllIlllIl[0]] = lllIlllIl[7];
                                        if (Q.llIIlIllIlIl(Bank.getFirst((int[])nArray3).getQuantity(), lllIlllIl[9])) {
                                            Q.Q();
                                            System.out.println(lllIllIll[lllIlllIl[4]]);
                                            bv = lllIlllIl[1];
                                            return;
                                        }
                                    }
                                    int[] nArray4 = new int[lllIlllIl[5]];
                                    nArray4[Q.lllIlllIl[0]] = lllIlllIl[6];
                                    nArray4[Q.lllIlllIl[1]] = lllIlllIl[7];
                                    nArray4[Q.lllIlllIl[3]] = lllIlllIl[8];
                                    if (Q.llIIlIllIlII(e.d(nArray4) ? 1 : 0)) {
                                        if (Q.llIIlIllIllI(Equipment.contains((int[])f.aY) ? 1 : 0) && Q.llIIlIllIllI(Inventory.contains((int[])f.aY) ? 1 : 0)) {
                                            a.b(f.aY, lllIlllIl[1]);
                                        }
                                        if (Q.llIIlIllIlII(Inventory.contains((int[])f.aY) ? 1 : 0)) {
                                            Inventory.getFirst((int[])f.aY).interact(lllIllIll[lllIlllIl[10]]);
                                            Time.sleepTicks((int)lllIlllIl[5]);
                                            0;
                                        }
                                        if (Q.llIIlIllIllI(Bank.isOpen() ? 1 : 0)) {
                                            a.a();
                                            Time.sleepTicks((int)lllIlllIl[5]);
                                            0;
                                        }
                                        a.a(lllIlllIl[11], lllIlllIl[1]);
                                        a.a(lllIlllIl[8], lllIlllIl[1]);
                                        a.a(lllIlllIl[6], lllIlllIl[12]);
                                        a.a(lllIlllIl[13], lllIlllIl[14]);
                                    }
                                }
                            }
                        }
                        if (Q.llIIlIllIlII(Inventory.contains((int[])f.bc) ? 1 : 0) && Q.llIIlIllIlIl(Movement.getRunEnergy(), lllIlllIl[15])) {
                            Inventory.getFirst((int[])f.bc).interact(lllIllIll[lllIlllIl[16]]);
                            Time.sleepTicks((int)lllIlllIl[1]);
                            0;
                        }
                        int[] nArray = new int[lllIlllIl[1]];
                        nArray[Q.lllIlllIl[0]] = lllIlllIl[17];
                        if (Q.llIIlIllIlII(Inventory.contains((int[])nArray) ? 1 : 0) && Q.llIIlIlllIIl(Q.llIIlIllIIll(e.w(), 55.0))) {
                            int[] nArray5 = new int[lllIlllIl[1]];
                            nArray5[Q.lllIlllIl[0]] = lllIlllIl[17];
                            Inventory.getFirst((int[])nArray5).interact(lllIllIll[lllIlllIl[18]]);
                        }
                        if (Q.llIIlIllIlII(Q.an() ? 1 : 0) && Q.llIIlIllIllI(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()))) {
                            if (Q.llIIlIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dg), lllIlllIl[4]) && Q.llIIlIllIllI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                                AccBuilderGWD.c = lllIllIll[lllIlllIl[19]];
                                Movement.walkTo((WorldPoint)dg);
                                0;
                                Time.sleepTicks((int)lllIlllIl[1]);
                                0;
                            }
                            if (Q.llIIlIlllIll(Players.getLocal().getWorldLocation().distanceTo(dg), lllIlllIl[4])) {
                                g.a(lllIllIll[lllIlllIl[20]], cG);
                            }
                        }
                        if (Q.llIIlIllllII(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()), lllIlllIl[1])) {
                            llIlIIIllIlIl = new WorldArea(lllIlllIl[21], lllIlllIl[22], lllIlllIl[19], lllIlllIl[18], lllIlllIl[0]);
                            if (Q.llIIlIllIllI(llIlIIIllIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderGWD.c = lllIllIll[lllIlllIl[12]];
                                Movement.walkTo((WorldPoint)kO);
                                0;
                                Time.sleepTicks((int)lllIlllIl[1]);
                                0;
                            }
                            if (Q.llIIlIllIlII(llIlIIIllIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                g.a(lllIllIll[lllIlllIl[23]], cG);
                            }
                        }
                        if (!Q.llIIlIllllII(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()), lllIlllIl[3])) break block78;
                        dk = lllIlllIl[0];
                        int[] nArray6 = new int[lllIlllIl[1]];
                        nArray6[Q.lllIlllIl[0]] = lllIlllIl[24];
                        if (Q.llIIlIllIllI(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                            String[] stringArray = new String[lllIlllIl[1]];
                            stringArray[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[25]];
                            if (Q.llIIlIllIllI(Equipment.contains((String[])stringArray) ? 1 : 0) && Q.llIIlIllIllI(kN ? 1 : 0)) {
                                if (!Q.llIIlIlllIll(Players.getLocal().getWorldLocation().distanceTo(kP), lllIlllIl[4]) || Q.llIIlIllllIl(Players.getLocal().getWorldLocation().getPlane(), lllIlllIl[3])) {
                                    AccBuilderGWD.c = lllIllIll[lllIlllIl[26]];
                                    Movement.walkTo((WorldPoint)kP);
                                    0;
                                    Time.sleepTicks((int)lllIlllIl[1]);
                                    0;
                                }
                                if (Q.llIIlIlllIll(Players.getLocal().getWorldLocation().distanceTo(kP), lllIlllIl[4])) {
                                    g.a(lllIllIll[lllIlllIl[27]], cG);
                                }
                            }
                        }
                        int[] nArray7 = new int[lllIlllIl[1]];
                        nArray7[Q.lllIlllIl[0]] = lllIlllIl[24];
                        if (Q.llIIlIllIlII(Inventory.contains((int[])nArray7) ? 1 : 0) && Q.llIIlIllIllI(kN ? 1 : 0)) {
                            String[] stringArray = new String[lllIlllIl[1]];
                            stringArray[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[28]];
                            if (Q.llIIlIllIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                if (Q.llIIlIlllIlI(Players.getLocal().getWorldLocation().distanceTo(kQ), lllIlllIl[4])) {
                                    AccBuilderGWD.c = lllIllIll[lllIlllIl[29]];
                                    Movement.walkTo((WorldPoint)kQ);
                                    0;
                                    Time.sleepTicks((int)lllIlllIl[1]);
                                    0;
                                }
                                if (Q.llIIlIlllIll(Players.getLocal().getWorldLocation().distanceTo(kQ), lllIlllIl[4])) {
                                    String[] stringArray2 = new String[lllIlllIl[1]];
                                    stringArray2[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[30]];
                                    String[] stringArray3 = new String[lllIlllIl[1]];
                                    stringArray3[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[31]];
                                    Inventory.getFirst((String[])stringArray2).useOn(TileObjects.getNearest((String[])stringArray3));
                                    Time.sleepTicks((int)lllIlllIl[10]);
                                    0;
                                }
                            }
                            String[] stringArray4 = new String[lllIlllIl[1]];
                            stringArray4[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[32]];
                            if (Q.llIIlIllIllI(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                                if (Q.llIIlIlllIlI(Players.getLocal().getWorldLocation().distanceTo(kR), lllIlllIl[4])) {
                                    AccBuilderGWD.c = lllIllIll[lllIlllIl[33]];
                                    String[] stringArray5 = new String[lllIlllIl[1]];
                                    stringArray5[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[34]];
                                    if (Q.llIIlIllIlll(TileObjects.getNearest((String[])stringArray5))) {
                                        String[] stringArray6 = new String[lllIlllIl[1]];
                                        stringArray6[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[35]];
                                        String[] stringArray7 = new String[lllIlllIl[1]];
                                        stringArray7[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[36]];
                                        if (Q.llIIlIllIlII(TileObjects.getNearest((String[])stringArray6).hasAction(stringArray7) ? 1 : 0)) {
                                            String[] stringArray8 = new String[lllIlllIl[1]];
                                            stringArray8[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[37]];
                                            TileObjects.getNearest((String[])stringArray8).interact(lllIllIll[lllIlllIl[9]]);
                                            Time.sleepTicks((int)lllIlllIl[3]);
                                            0;
                                        }
                                    }
                                    String[] stringArray9 = new String[lllIlllIl[1]];
                                    stringArray9[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[38]];
                                    if (Q.llIIlIllIlll(TileObjects.getNearest((String[])stringArray9))) {
                                        String[] stringArray10 = new String[lllIlllIl[1]];
                                        stringArray10[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[39]];
                                        String[] stringArray11 = new String[lllIlllIl[1]];
                                        stringArray11[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[40]];
                                        if (Q.llIIlIllIlII(TileObjects.getNearest((String[])stringArray10).hasAction(stringArray11) ? 1 : 0)) {
                                            String[] stringArray12 = new String[lllIlllIl[1]];
                                            stringArray12[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[41]];
                                            TileObjects.getNearest((String[])stringArray12).interact(lllIllIll[lllIlllIl[42]]);
                                            Time.sleepTicks((int)lllIlllIl[3]);
                                            0;
                                        }
                                    }
                                    Movement.walkTo((WorldPoint)kR);
                                    0;
                                    Time.sleepTicks((int)lllIlllIl[1]);
                                    0;
                                }
                                if (Q.llIIlIlllIll(Players.getLocal().getWorldLocation().distanceTo(kR), lllIlllIl[4])) {
                                    String[] stringArray13 = new String[lllIlllIl[1]];
                                    stringArray13[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[43]];
                                    if (Q.llIIlIllIlll(TileObjects.getNearest((String[])stringArray13))) {
                                        String[] stringArray14 = new String[lllIlllIl[1]];
                                        stringArray14[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[44]];
                                        TileObjects.getNearest((String[])stringArray14).interact(lllIllIll[lllIlllIl[45]]);
                                        Time.sleepTicks((int)lllIlllIl[4]);
                                        0;
                                    }
                                }
                            }
                        }
                        int[] nArray8 = new int[lllIlllIl[1]];
                        nArray8[Q.lllIlllIl[0]] = lllIlllIl[24];
                        if (Q.llIIlIllIlII(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                            int[] nArray9 = new int[lllIlllIl[1]];
                            nArray9[Q.lllIlllIl[0]] = lllIlllIl[46];
                            if (Q.llIIlIllIlII(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                kN = lllIlllIl[1];
                            }
                        }
                        if (Q.llIIlIllIlII(kN ? 1 : 0)) {
                            String[] stringArray = new String[lllIlllIl[1]];
                            stringArray[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[47]];
                            if (Q.llIIlIllIllI(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                                int[] nArray10 = new int[lllIlllIl[1]];
                                nArray10[Q.lllIlllIl[0]] = lllIlllIl[48];
                                if (Q.llIIlIllIllI(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                                    String[] stringArray15 = new String[lllIlllIl[1]];
                                    stringArray15[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[49]];
                                    if (Q.llIIlIllIllI(Inventory.contains((String[])stringArray15) ? 1 : 0)) {
                                        Q.cQ();
                                    }
                                    String[] stringArray16 = new String[lllIlllIl[1]];
                                    stringArray16[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[50]];
                                    if (Q.llIIlIllIlII(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                                        if (Q.llIIlIlllIlI(Players.getLocal().getWorldLocation().distanceTo(kS), lllIlllIl[3])) {
                                            AccBuilderGWD.c = lllIllIll[lllIlllIl[51]];
                                            Movement.walkTo((WorldPoint)kS);
                                            0;
                                            Time.sleepTicks((int)lllIlllIl[1]);
                                            0;
                                        }
                                        if (Q.llIIlIlllIll(Players.getLocal().getWorldLocation().distanceTo(kS), lllIlllIl[3])) {
                                            g.a(lllIllIll[lllIlllIl[52]], cG);
                                        }
                                    }
                                }
                            }
                        }
                        if (Q.llIIlIllIlII(kN ? 1 : 0)) {
                            int[] nArray11 = new int[lllIlllIl[1]];
                            nArray11[Q.lllIlllIl[0]] = lllIlllIl[48];
                            if (Q.llIIlIllIlII(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                String[] stringArray = new String[lllIlllIl[1]];
                                stringArray[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[53]];
                                if (Q.llIIlIllIllI(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                                    int[] nArray12 = new int[lllIlllIl[1]];
                                    nArray12[Q.lllIlllIl[0]] = lllIlllIl[24];
                                    if (Q.llIIlIllIllI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                        Q.cQ();
                                    }
                                    int[] nArray13 = new int[lllIlllIl[1]];
                                    nArray13[Q.lllIlllIl[0]] = lllIlllIl[24];
                                    if (Q.llIIlIllIlII(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                        llIlIIIllIlIl = new WorldArea(lllIlllIl[21], lllIlllIl[22], lllIlllIl[19], lllIlllIl[18], lllIlllIl[0]);
                                        if (Q.llIIlIllIllI(llIlIIIllIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderGWD.c = lllIllIll[lllIlllIl[54]];
                                            Movement.walkTo((WorldPoint)kO);
                                            0;
                                            Time.sleepTicks((int)lllIlllIl[1]);
                                            0;
                                        }
                                        if (Q.llIIlIllIlII(llIlIIIllIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            g.a(lllIllIll[lllIlllIl[55]], cG);
                                        }
                                    }
                                }
                            }
                        }
                        String[] stringArray = new String[lllIlllIl[1]];
                        stringArray[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[56]];
                        if (!Q.llIIlIllIlII(Equipment.contains((String[])stringArray) ? 1 : 0)) break block78;
                        String[] stringArray17 = new String[lllIlllIl[1]];
                        stringArray17[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[57]];
                        if (Q.llIIlIlllllI(NPCs.getNearest((String[])stringArray17))) {
                            String[] stringArray18 = new String[lllIlllIl[1]];
                            stringArray18[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[58]];
                            if (Q.llIIlIlllllI(NPCs.getNearest((String[])stringArray18))) {
                                AccBuilderGWD.c = lllIllIll[lllIlllIl[59]];
                                Movement.walkTo((WorldPoint)kT);
                                0;
                                Time.sleepTicks((int)lllIlllIl[1]);
                                0;
                            }
                        }
                        String[] stringArray19 = new String[lllIlllIl[1]];
                        stringArray19[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[60]];
                        if (!Q.llIIlIlllllI(NPCs.getNearest((String[])stringArray19))) break block79;
                        String[] stringArray20 = new String[lllIlllIl[1]];
                        stringArray20[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[61]];
                        if (!Q.llIIlIllIlll(NPCs.getNearest((String[])stringArray20))) break block80;
                    }
                    if (Q.llIIlIlllllI(kU)) {
                        Q.cP();
                    }
                    if (Q.llIIlIllIlll(llIlIIIllIlIl = NPCs.getNearest(nPC -> {
                        int n2;
                        if (Q.llIIlIllIlII(nPC.getName().contains(lllIllIll[lllIlllIl[89]]) ? 1 : 0) && Q.llIIllIIIIII(nPC.getInteracting(), Players.getLocal())) {
                            n2 = lllIlllIl[1];
                            0;
                            if (((2 ^ 0x42) & ~(0xC2 ^ 0x82)) != 0) {
                                return false;
                            }
                        } else {
                            n2 = lllIlllIl[0];
                        }
                        return n2 != 0;
                    })) && Q.llIIlIlllllI(Players.getLocal().getInteracting())) {
                        llIlIIIllIlIl.interact(lllIllIll[lllIlllIl[62]]);
                        Time.sleepTicks((int)lllIlllIl[3]);
                        0;
                    }
                    if (Q.llIIlIlllllI(llIlIIIllIlIl) && Q.llIIlIlllllI(Players.getLocal().getInteracting())) {
                        String[] stringArray = new String[lllIlllIl[1]];
                        stringArray[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[63]];
                        if (Q.llIIlIllIlll(NPCs.getNearest((String[])stringArray))) {
                            String[] stringArray21 = new String[lllIlllIl[1]];
                            stringArray21[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[15]];
                            if (Q.llIIlIllIllI(NPCs.getNearest((String[])stringArray21).isDead() ? 1 : 0) && Q.llIIlIllIllI(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray22 = new String[lllIlllIl[1]];
                                stringArray22[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[64]];
                                NPCs.getNearest((String[])stringArray22).interact(lllIllIll[lllIlllIl[65]]);
                            }
                        }
                    }
                    if (Q.llIIlIllIlII(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = lllIllIll[lllIlllIl[66]];
                        List llIlIIIllIlII = Dialog.getOptions();
                        if (Q.llIIlIllIllI(llIlIIIllIlII.isEmpty() ? 1 : 0)) {
                            int llIlIIIllIIll = lllIlllIl[0];
                            while (Q.llIIlIllIlIl(llIlIIIllIIll, llIlIIIllIlII.size())) {
                                if (Q.llIIlIllIlII(((Widget)llIlIIIllIlII.get(llIlIIIllIIll)).getText().contains(lllIllIll[lllIlllIl[67]]) ? 1 : 0)) {
                                    String[] stringArray = new String[lllIlllIl[1]];
                                    stringArray[Q.lllIlllIl[0]] = ((Widget)llIlIIIllIlII.get(llIlIIIllIIll)).getText();
                                    Dialog.chooseOption((String[])stringArray);
                                    0;
                                    Time.sleepTicks((int)lllIlllIl[3]);
                                    0;
                                    0;
                                    if (((0x24 ^ 0x30) & ~(0x33 ^ 0x27)) > -1) break;
                                    return;
                                }
                                ++llIlIIIllIIll;
                                0;
                                if ((39 + 23 - -56 + 35 ^ 0 + 110 - -6 + 41) != 0) continue;
                                return;
                            }
                        }
                    }
                }
                String[] stringArray = new String[lllIlllIl[1]];
                stringArray[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[68]];
                if (Q.llIIlIllIlll(NPCs.getNearest((String[])stringArray))) {
                    if (Q.llIIlIllIlIl(dk, lllIlllIl[1]) && Q.llIIlIllIllI(dl ? 1 : 0)) {
                        as.pZ += lllIlllIl[1];
                        as.u(AccBuilderGWD.m);
                        dk += lllIlllIl[1];
                        as.pZ = lllIlllIl[0];
                        dl = lllIlllIl[1];
                    }
                    if (Q.llIIlIllIlII(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = lllIllIll[lllIlllIl[69]];
                        llIlIIIllIlIl = Dialog.getOptions();
                        if (Q.llIIlIllIllI(llIlIIIllIlIl.isEmpty() ? 1 : 0)) {
                            int llIlIIIllIlII = lllIlllIl[0];
                            while (Q.llIIlIllIlIl(llIlIIIllIlII, llIlIIIllIlIl.size())) {
                                String llIlIIIllIIll = kU[llIlIIIllIlII];
                                int llIlIIIllIIlI = lllIlllIl[0];
                                while (Q.llIIlIllIlIl(llIlIIIllIIlI, llIlIIIllIlIl.size())) {
                                    if (Q.llIIlIllIlII(((Widget)llIlIIIllIlIl.get(llIlIIIllIIlI)).getText().contains(llIlIIIllIIll) ? 1 : 0)) {
                                        System.out.println("Selecting: " + ((Widget)llIlIIIllIlIl.get(llIlIIIllIIlI)).getText());
                                        Time.sleepTicks((int)lllIlllIl[3]);
                                        0;
                                        String[] stringArray23 = new String[lllIlllIl[1]];
                                        stringArray23[Q.lllIlllIl[0]] = ((Widget)llIlIIIllIlIl.get(llIlIIIllIIlI)).getText();
                                        Dialog.chooseOption((String[])stringArray23);
                                        0;
                                        Time.sleepTicks((int)lllIlllIl[12]);
                                        0;
                                        0;
                                        if (2 > 0) break;
                                        return;
                                    }
                                    ++llIlIIIllIIlI;
                                    0;
                                    if (1 == 1) continue;
                                    return;
                                }
                                ++llIlIIIllIlII;
                                0;
                                if (3 >= 0) continue;
                                return;
                            }
                        }
                    }
                }
            }
            g.a(cG);
        }
    }

    static {
        Q.llIIlIllIIlI();
        Q.llIIlIllIIII();
        kM = lllIllIll[lllIlllIl[90]];
        kL = new R();
        bx = new ArrayList<d>();
        dg = new WorldPoint(lllIlllIl[91], lllIlllIl[92], lllIlllIl[0]);
        kO = new WorldPoint(lllIlllIl[93], lllIlllIl[94], lllIlllIl[0]);
        kP = new WorldPoint(lllIlllIl[93], lllIlllIl[95], lllIlllIl[3]);
        kQ = new WorldPoint(lllIlllIl[96], lllIlllIl[97], lllIlllIl[0]);
        kR = new WorldPoint(lllIlllIl[96], lllIlllIl[98], lllIlllIl[0]);
        kS = new WorldPoint(lllIlllIl[99], lllIlllIl[100], lllIlllIl[1]);
        kT = new WorldPoint(lllIlllIl[101], lllIlllIl[102], lllIlllIl[0]);
        String[] stringArray = new String[lllIlllIl[31]];
        stringArray[Q.lllIlllIl[0]] = lllIllIll[lllIlllIl[103]];
        stringArray[Q.lllIlllIl[1]] = lllIllIll[lllIlllIl[104]];
        stringArray[Q.lllIlllIl[3]] = lllIllIll[lllIlllIl[105]];
        stringArray[Q.lllIlllIl[5]] = lllIllIll[lllIlllIl[106]];
        stringArray[Q.lllIlllIl[4]] = lllIllIll[lllIlllIl[107]];
        stringArray[Q.lllIlllIl[10]] = lllIllIll[lllIlllIl[108]];
        stringArray[Q.lllIlllIl[16]] = lllIllIll[lllIlllIl[109]];
        stringArray[Q.lllIlllIl[18]] = lllIllIll[lllIlllIl[110]];
        stringArray[Q.lllIlllIl[19]] = lllIllIll[lllIlllIl[111]];
        stringArray[Q.lllIlllIl[20]] = lllIllIll[lllIlllIl[112]];
        stringArray[Q.lllIlllIl[12]] = lllIllIll[lllIlllIl[113]];
        stringArray[Q.lllIlllIl[23]] = lllIllIll[lllIlllIl[114]];
        stringArray[Q.lllIlllIl[25]] = lllIllIll[lllIlllIl[115]];
        stringArray[Q.lllIlllIl[26]] = lllIllIll[lllIlllIl[116]];
        stringArray[Q.lllIlllIl[27]] = lllIllIll[lllIlllIl[117]];
        stringArray[Q.lllIlllIl[28]] = lllIllIll[lllIlllIl[118]];
        stringArray[Q.lllIlllIl[29]] = lllIllIll[lllIlllIl[119]];
        stringArray[Q.lllIlllIl[30]] = lllIllIll[lllIlllIl[120]];
        cG = stringArray;
    }

    /*
     * WARNING - void declaration
     */
    private static void cQ() {
        void llIlIIIlIlllI;
        BankLocation bankLocation = BankLocation.getNearest();
        if (Q.llIIlIllIlll(bankLocation) && Q.llIIlIllIllI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllIllIll[lllIlllIl[76]];
            a.a(bankLocation);
        }
        if (Q.llIIlIllIlll(llIlIIIlIlllI) && Q.llIIlIllIlII(llIlIIIlIlllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (Q.llIIlIllIllI(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIlllIl[2]);
                0;
                Time.sleepTicks((int)lllIlllIl[5]);
                0;
            }
            if (Q.llIIlIllIlII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderGWD.c = lllIllIll[lllIlllIl[77]];
                if (Q.llIIlIllIlII(kN ? 1 : 0)) {
                    int[] nArray = new int[lllIlllIl[1]];
                    nArray[Q.lllIlllIl[0]] = lllIlllIl[48];
                    if (Q.llIIlIllIllI(Inventory.contains((int[])nArray) ? 1 : 0) && Q.llIIlIlllIII(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)lllIlllIl[4]);
                        0;
                    }
                }
                if (Q.llIIlIlllIII(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)lllIlllIl[3]);
                    0;
                }
                if (Q.llIIlIllIlII(kN ? 1 : 0)) {
                    int[] nArray = new int[lllIlllIl[1]];
                    nArray[Q.lllIlllIl[0]] = lllIlllIl[48];
                    if (Q.llIIlIllIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        a.a(lllIlllIl[11], lllIlllIl[1]);
                        a.a(lllIlllIl[6], lllIlllIl[12]);
                        a.a(lllIlllIl[48], lllIlllIl[1]);
                        a.a(lllIlllIl[24], lllIlllIl[1]);
                        a.a(lllIlllIl[46], lllIlllIl[1]);
                        Time.sleepTicks((int)lllIlllIl[1]);
                        0;
                        int[] nArray2 = new int[lllIlllIl[1]];
                        nArray2[Q.lllIlllIl[0]] = lllIlllIl[11];
                        if (Q.llIIlIllIllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                            a.a(lllIlllIl[78], lllIlllIl[1]);
                        }
                        a.a(lllIlllIl[17], Inventory.getFreeSlots() - lllIlllIl[1]);
                    }
                }
                if (Q.llIIlIllIlII(kN ? 1 : 0)) {
                    int[] nArray = new int[lllIlllIl[1]];
                    nArray[Q.lllIlllIl[0]] = lllIlllIl[48];
                    if (Q.llIIlIllIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        if (Q.llIIlIllIllI(Equipment.contains((int[])f.aY) ? 1 : 0) && Q.llIIlIllIllI(Inventory.contains((int[])f.aY) ? 1 : 0)) {
                            a.b(f.aY, lllIlllIl[1]);
                        }
                        if (Q.llIIlIllIlII(Inventory.contains((int[])f.aY) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aY).interact(lllIllIll[lllIlllIl[79]]);
                            Time.sleepTicks((int)lllIlllIl[5]);
                            0;
                        }
                        if (Q.llIIlIllIllI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)lllIlllIl[10]);
                            0;
                        }
                        if (Q.llIIlIllIlII(Bank.isOpen() ? 1 : 0)) {
                            a.a(lllIlllIl[11], lllIlllIl[1]);
                            a.a(lllIlllIl[6], lllIlllIl[12]);
                            a.a(lllIlllIl[7], lllIlllIl[9]);
                        }
                    }
                }
            }
        }
    }

    private static boolean llIIlIlllIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIlIlllIII(int n2) {
        return n2 > 0;
    }

    private static void llIIlIllIIII() {
        lllIllIll = new String[lllIlllIl[121]];
        Q.lllIllIll[Q.lllIlllIl[0]] = Q."Finished buying items, switching back to quest";
        Q.lllIllIll[Q.lllIlllIl[1]] = Q."Nav to bank";
        Q.lllIllIll[Q.lllIlllIl[3]] = Q."Handling banking";
        Q.lllIllIll[Q.lllIlllIl[5]] = Q."We are missing quest supplies, switching to BUYING";
        Q.lllIllIll[Q.lllIlllIl[4]] = Q."We are missing quest supplies, switching to BUYING";
        Q.lllIllIll[Q.lllIlllIl[10]] = Q."Wear";
        Q.lllIllIll[Q.lllIlllIl[16]] = Q."Drink";
        Q.lllIllIll[Q.lllIlllIl[18]] = Q."Eat";
        Q.lllIllIll[Q.lllIlllIl[19]] = Q."Nav to start";
        Q.lllIllIll[Q.lllIlllIl[20]] = Q."Aris";
        Q.lllIllIll[Q.lllIlllIl[12]] = Q."Nav to sir pyrsin";
        Q.lllIllIll[Q.lllIlllIl[23]] = Q."Sir Prysin";
        Q.lllIllIll[Q.lllIlllIl[25]] = Q."Silverlight";
        Q.lllIllIll[Q.lllIlllIl[26]] = Q."Nav to captain";
        Q.lllIllIll[Q.lllIlllIl[27]] = Q."Captain Rovin";
        Q.lllIllIll[Q.lllIlllIl[28]] = Q."Bucket of water";
        Q.lllIllIll[Q.lllIlllIl[29]] = Q."Nav to drain";
        Q.lllIllIll[Q.lllIlllIl[30]] = Q."Bucket of water";
        Q.lllIllIll[Q.lllIlllIl[31]] = Q."Drain";
        Q.lllIllIll[Q.lllIlllIl[32]] = Q."Bucket of water";
        Q.lllIllIll[Q.lllIlllIl[33]] = Q."Nav to sewer key";
        Q.lllIllIll[Q.lllIlllIl[34]] = Q."Manhole";
        Q.lllIllIll[Q.lllIlllIl[35]] = Q."Manhole";
        Q.lllIllIll[Q.lllIlllIl[36]] = Q."Open";
        Q.lllIllIll[Q.lllIlllIl[37]] = Q."Manhole";
        Q.lllIllIll[Q.lllIlllIl[9]] = Q."Open";
        Q.lllIllIll[Q.lllIlllIl[38]] = Q."Manhole";
        Q.lllIllIll[Q.lllIlllIl[39]] = Q."Manhole";
        Q.lllIllIll[Q.lllIlllIl[40]] = Q."Climb-down";
        Q.lllIllIll[Q.lllIlllIl[41]] = Q."Manhole";
        Q.lllIllIll[Q.lllIlllIl[42]] = Q."Climb-down";
        Q.lllIllIll[Q.lllIlllIl[43]] = Q."Rusty key";
        Q.lllIllIll[Q.lllIlllIl[44]] = Q."Rusty key";
        Q.lllIllIll[Q.lllIlllIl[45]] = Q."Take";
        Q.lllIllIll[Q.lllIlllIl[47]] = Q."Silverlight";
        Q.lllIllIll[Q.lllIlllIl[49]] = Q."Bones";
        Q.lllIllIll[Q.lllIlllIl[50]] = Q."Bones";
        Q.lllIllIll[Q.lllIlllIl[51]] = Q."Nav to wizard";
        Q.lllIllIll[Q.lllIlllIl[52]] = Q."Wizard Traiborn";
        Q.lllIllIll[Q.lllIlllIl[53]] = Q."Silverlight";
        Q.lllIllIll[Q.lllIlllIl[54]] = Q."Nav to sir pyrsin";
        Q.lllIllIll[Q.lllIlllIl[55]] = Q."Sir Prysin";
        Q.lllIllIll[Q.lllIlllIl[56]] = Q."Silverlight";
        Q.lllIllIll[Q.lllIlllIl[57]] = Q."Delrith";
        Q.lllIllIll[Q.lllIlllIl[58]] = Q."Weakened Delrith";
        Q.lllIllIll[Q.lllIlllIl[59]] = Q."Nav to demon";
        Q.lllIllIll[Q.lllIlllIl[60]] = Q."Delrith";
        Q.lllIllIll[Q.lllIlllIl[61]] = Q."Weakened Delrith";
        Q.lllIllIll[Q.lllIlllIl[62]] = Q."Attack";
        Q.lllIllIll[Q.lllIlllIl[63]] = Q."Delrith";
        Q.lllIllIll[Q.lllIlllIl[15]] = Q."Delrith";
        Q.lllIllIll[Q.lllIlllIl[64]] = Q."Delrith";
        Q.lllIllIll[Q.lllIlllIl[65]] = Q."Attack";
        Q.lllIllIll[Q.lllIlllIl[66]] = Q."Banishing";
        Q.lllIllIll[Q.lllIlllIl[67]] = Q."[";
        Q.lllIllIll[Q.lllIlllIl[68]] = Q."Weakened Delrith";
        Q.lllIllIll[Q.lllIlllIl[69]] = Q."Banishing";
        Q.lllIllIll[Q.lllIlllIl[75]] = Q.", ";
        Q.lllIllIll[Q.lllIlllIl[76]] = Q."Nav to bank";
        Q.lllIllIll[Q.lllIlllIl[77]] = Q."Handling banking";
        Q.lllIllIll[Q.lllIlllIl[79]] = Q."Wear";
        Q.lllIllIll[Q.lllIlllIl[87]] = Q."Demon Slayer";
        Q.lllIllIll[Q.lllIlllIl[88]] = Q."ring of wealth (";
        Q.lllIllIll[Q.lllIlllIl[89]] = Q."wizard";
        Q.lllIllIll[Q.lllIlllIl[90]] = Q."Now what was that incantation again?";
        Q.lllIllIll[Q.lllIlllIl[103]] = Q."Yes.";
        Q.lllIllIll[Q.lllIlllIl[104]] = Q."The Demon Slayer Quest";
        Q.lllIllIll[Q.lllIlllIl[105]] = Q."Okay, where is he? I'll kill him for you!";
        Q.lllIllIll[Q.lllIlllIl[106]] = Q."So how did Wally kill Delrith?";
        Q.lllIllIll[Q.lllIlllIl[107]] = Q."What is the magical incantation?";
        Q.lllIllIll[Q.lllIlllIl[108]] = Q."Aris said I should come and talk to you.";
        Q.lllIllIll[Q.lllIlllIl[109]] = Q."I need to find Silverlight.";
        Q.lllIllIll[Q.lllIlllIl[110]] = Q."He's back and unfortunately I've got to deal with him.";
        Q.lllIllIll[Q.lllIlllIl[111]] = Q."So give me the keys!";
        Q.lllIllIll[Q.lllIlllIl[112]] = Q."Yes I know, but this is important.";
        Q.lllIllIll[Q.lllIlllIl[113]] = Q."There's a demon who wants to invade this city.";
        Q.lllIllIll[Q.lllIlllIl[114]] = Q."Yes, very.";
        Q.lllIllIll[Q.lllIlllIl[115]] = Q."It's not them who are going to fight the demon, it's me.";
        Q.lllIllIll[Q.lllIlllIl[116]] = Q."Sir Prysin said you would give me the key.";
        Q.lllIllIll[Q.lllIlllIl[117]] = Q."Why did he give you one of the keys then?";
        Q.lllIllIll[Q.lllIlllIl[118]] = Q."Talk about Demon Slayer.";
        Q.lllIllIll[Q.lllIlllIl[119]] = Q."Well, have you got any keys knocking around?";
        Q.lllIllIll[Q.lllIlllIl[120]] = Q."I'll get the bones for you.";
    }

    private static String llIIlIIllIll(String llIlIIIIllIII, String llIlIIIIlIlll) {
        try {
            SecretKeySpec llIlIIIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIIIIlIlll.getBytes(StandardCharsets.UTF_8)), lllIlllIl[19]), "DES");
            Cipher llIlIIIIlllII = Cipher.getInstance("DES");
            llIlIIIIlllII.init(lllIlllIl[3], llIlIIIIlllIl);
            return new String(llIlIIIIlllII.doFinal(Base64.getDecoder().decode(llIlIIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIIIIllIll) {
            llIlIIIIllIll.printStackTrace();
            return null;
        }
    }
}

