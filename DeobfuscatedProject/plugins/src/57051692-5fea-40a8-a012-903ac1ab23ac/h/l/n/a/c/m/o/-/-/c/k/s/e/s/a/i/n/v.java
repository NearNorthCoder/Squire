/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.J;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.Z;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.f;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.g;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.j;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class v
implements K {
    private static /* synthetic */ WorldPoint dy;
    public static /* synthetic */ boolean bn;
    public static /* synthetic */ List<d> bp;
    private static /* synthetic */ int[] lIlllIlIIl;
    private static /* synthetic */ String[] lIlllIIlll;
    public static /* synthetic */ boolean do;
    public static /* synthetic */ boolean dq;
    private static /* synthetic */ WorldPoint dw;
    public static /* synthetic */ boolean dp;
    static /* synthetic */ int dc;
    private static /* synthetic */ WorldPoint dt;
    private static /* synthetic */ WorldPoint dv;
    private static /* synthetic */ WorldPoint ds;
    private static /* synthetic */ WorldPoint dx;
    public static /* synthetic */ boolean dm;
    static /* synthetic */ int dr;
    private static /* synthetic */ WorldPoint du;
    static /* synthetic */ boolean dd;
    private static /* synthetic */ String[] cy;
    public static /* synthetic */ boolean dn;

    @Override
    public boolean ac() {
        return lIlllIlIIl[1];
    }

    private static void lIIlllIllIIIl() {
        lIlllIlIIl = new int[126];
        v.lIlllIlIIl[0] = " ".length();
        v.lIlllIlIIl[1] = (0x71 ^ 0x6E ^ (0x50 ^ 0x71)) & (154 + 182 - 164 + 17 ^ 75 + 70 - 35 + 21 ^ -" ".length());
        v.lIlllIlIIl[2] = 0xE4 ^ 0xC4 ^ (0xA9 ^ 0x81);
        v.lIlllIlIIl[3] = -(0xFFFF9DF7 & 0x679F) & (0xFFFFDFB7 & 0x7FFE);
        v.lIlllIlIIl[4] = -(0xFFFFA535 & 0x7EEB) & (0xFFFFBFFD & 0x77AA);
        v.lIlllIlIIl[5] = "  ".length();
        v.lIlllIlIIl[6] = 95 + 91 - 171 + 141 ^ 67 + 95 - 104 + 94;
        v.lIlllIlIIl[7] = 0xFFFFDF5F & 0x3FE7;
        v.lIlllIlIIl[8] = 0xFFFFFF7B & 0x1FCD;
        v.lIlllIlIIl[9] = 0xFFFFDD3A & 0x23FF;
        v.lIlllIlIIl[10] = "   ".length();
        v.lIlllIlIIl[11] = 0xFFFFB1D1 & 0x7F7F;
        v.lIlllIlIIl[12] = 0x33 ^ 0x39;
        v.lIlllIlIIl[13] = 0xB1 ^ 0x99 ^ (0x96 ^ 0xBB);
        v.lIlllIlIIl[14] = -(0xFFFFAB9D & 0x7667) & (0xFFFFBFFF & 0x637F);
        v.lIlllIlIIl[15] = 0x75 ^ 0x79;
        v.lIlllIlIIl[16] = 0x2E ^ 0x4E ^ (0xE0 ^ 0xC1);
        v.lIlllIlIIl[17] = 7 + 88 - 51 + 149 ^ 99 + 152 - 131 + 79;
        v.lIlllIlIIl[18] = 0x11 ^ 0x17 ^ " ".length();
        v.lIlllIlIIl[19] = -(0xFFFFF64E & 0x2BB3) & (0xFFFFFFF7 & 0x37FD);
        v.lIlllIlIIl[20] = -(0xFFFFCFFB & 0x320F) & (0xFFFF9FFF & 0x77FF);
        v.lIlllIlIIl[21] = -(0xFFFFF7EA & 0xA1F) & (0xFFFFF7FF & 0x1FFF);
        v.lIlllIlIIl[22] = 0xFFFF95FF & 0x7FF7;
        v.lIlllIlIIl[23] = 0xFFFFDDF8 & 0x37FF;
        v.lIlllIlIIl[24] = 64 + 151 - 52 + 8 ^ 40 + 53 - 33 + 102;
        v.lIlllIlIIl[25] = 0x41 ^ 0x70 ^ (0x62 ^ 0x58);
        v.lIlllIlIIl[26] = 0x40 ^ 0x4D;
        v.lIlllIlIIl[27] = 106 + 16 - 101 + 112 ^ 131 + 20 - 138 + 126;
        v.lIlllIlIIl[28] = 0x50 ^ 0x5F;
        v.lIlllIlIIl[29] = (0xBB ^ 0xAD) & ~(0xAD ^ 0xBB) ^ (0x16 ^ 6);
        v.lIlllIlIIl[30] = 0xE7 ^ 0xA9 ^ (0x31 ^ 0x6E);
        v.lIlllIlIIl[31] = 0x2F ^ 0x12 ^ (0x49 ^ 0x66);
        v.lIlllIlIIl[32] = 43 + 112 - 125 + 124 ^ 130 + 99 - 182 + 90;
        v.lIlllIlIIl[33] = 0xB8 ^ 0xB2 ^ (0xB4 ^ 0xAA);
        v.lIlllIlIIl[34] = 0x60 ^ 0x75;
        v.lIlllIlIIl[35] = 0x71 ^ 0x2E ^ (0x68 ^ 0x21);
        v.lIlllIlIIl[36] = 20 + 30 - -96 + 26 ^ 97 + 9 - 54 + 135;
        v.lIlllIlIIl[37] = 0x79 ^ 0x61;
        v.lIlllIlIIl[38] = 0x39 ^ 0x20;
        v.lIlllIlIIl[39] = 0xBC ^ 0xA6;
        v.lIlllIlIIl[40] = 31 + 25 - -57 + 29 ^ 142 + 89 - 144 + 62;
        v.lIlllIlIIl[41] = 0x31 ^ 0x2D;
        v.lIlllIlIIl[42] = 0x13 ^ 0xE;
        v.lIlllIlIIl[43] = 132 + 68 - 158 + 111 ^ 29 + 92 - 23 + 37;
        v.lIlllIlIIl[44] = 0x54 ^ 9 ^ (0xE1 ^ 0xA3);
        v.lIlllIlIIl[45] = 0x9B ^ 0xBB;
        v.lIlllIlIIl[46] = 110 + 109 - 178 + 91 ^ 125 + 19 - 28 + 49;
        v.lIlllIlIIl[47] = 0x7D ^ 0x5F;
        v.lIlllIlIIl[48] = 0x83 ^ 0xA0;
        v.lIlllIlIIl[49] = 0xE6 ^ 0xC2;
        v.lIlllIlIIl[50] = 0x61 ^ 0x44;
        v.lIlllIlIIl[51] = 0x11 ^ 0x37;
        v.lIlllIlIIl[52] = 0x29 ^ 0x22 ^ (0x13 ^ 0x3F);
        v.lIlllIlIIl[53] = 0x1D ^ 0x17 ^ (0x6E ^ 0x4C);
        v.lIlllIlIIl[54] = 0x1C ^ 0x35;
        v.lIlllIlIIl[55] = 0xE9 ^ 0xC3;
        v.lIlllIlIIl[56] = 0xB ^ 0x29 ^ (0x26 ^ 0x2F);
        v.lIlllIlIIl[57] = 0x2D ^ 0x57 ^ (0xDA ^ 0x8C);
        v.lIlllIlIIl[58] = 0xED ^ 0xC0;
        v.lIlllIlIIl[59] = 172 + 69 - 171 + 170;
        v.lIlllIlIIl[60] = 0x17 ^ 0x39;
        v.lIlllIlIIl[61] = 0xA8 ^ 0x87;
        v.lIlllIlIIl[62] = 0x58 ^ 0x48 ^ (0xA7 ^ 0x87);
        v.lIlllIlIIl[63] = 67 + 64 - 43 + 55 ^ 24 + 19 - -27 + 120;
        v.lIlllIlIIl[64] = 0x9C ^ 0xAE;
        v.lIlllIlIIl[65] = 0x3E ^ 0 ^ (0x56 ^ 0x5B);
        v.lIlllIlIIl[66] = 0xEF ^ 0x80 ^ (0x3A ^ 0x61);
        v.lIlllIlIIl[67] = 0x4A ^ 0x7F;
        v.lIlllIlIIl[68] = 0xC3 ^ 0x85 ^ (0x21 ^ 0x51);
        v.lIlllIlIIl[69] = 213 + 179 - 261 + 110 ^ 129 + 128 - 232 + 173;
        v.lIlllIlIIl[70] = 0xBF ^ 0x87;
        v.lIlllIlIIl[71] = 75 + 127 - 70 + 3 ^ 29 + 167 - 71 + 65;
        v.lIlllIlIIl[72] = 3 + 78 - 55 + 134 ^ 125 + 120 - 212 + 121;
        v.lIlllIlIIl[73] = 0x6E ^ 0x58 ^ (0xA2 ^ 0xAF);
        v.lIlllIlIIl[74] = -(0xFFFFFAEA & 0x1D37) & (0xFFFFDBEF & 0x3FB5);
        v.lIlllIlIIl[75] = -(0xFFFF9E41 & 0x71BF) & (0xFFFFBEFD & 0x7FCE);
        v.lIlllIlIIl[76] = -(0xFFFFBEF7 & 0x5D0E) & (0xFFFFFDAD & Short.MAX_VALUE);
        v.lIlllIlIIl[77] = 229 + 198 - 282 + 86 ^ 42 + 99 - 25 + 15;
        v.lIlllIlIIl[78] = 0x9A ^ 0xA6;
        v.lIlllIlIIl[79] = 0xAF ^ 0x92;
        v.lIlllIlIIl[80] = 0x28 ^ 0x16;
        v.lIlllIlIIl[81] = 0xC4 ^ 0x86 ^ (0x4B ^ 0x36);
        v.lIlllIlIIl[82] = 0xF4 ^ 0xB4;
        v.lIlllIlIIl[83] = 0xB3 ^ 0xB9 ^ (0x5F ^ 0x17);
        v.lIlllIlIIl[84] = 0x56 ^ 0x15;
        v.lIlllIlIIl[85] = 0xFD ^ 0xB9;
        v.lIlllIlIIl[86] = 1 ^ 0x44;
        v.lIlllIlIIl[87] = 0x6E ^ 0x28;
        v.lIlllIlIIl[88] = 0x63 ^ 0x30 ^ (0x5D ^ 0x49);
        v.lIlllIlIIl[89] = 0xC8 ^ 0x9A ^ (0xB7 ^ 0xAD);
        v.lIlllIlIIl[90] = 0xDB ^ 0x92;
        v.lIlllIlIIl[91] = 0xFFFFC733 & 0x3FED;
        v.lIlllIlIIl[92] = 0xFFFFDEFA & 0x2F6F;
        v.lIlllIlIIl[93] = -(0xFFFFFB3F & 0x24D1) & (0xFFFFA79F & 0x7F7F);
        v.lIlllIlIIl[94] = 0xFFFF9FEF & 0x6E9E;
        v.lIlllIlIIl[95] = 0xFFFFCEF7 & 0x37BF;
        v.lIlllIlIIl[96] = 0xFFFF8EDD & 0x7FAF;
        v.lIlllIlIIl[97] = -(0xFFFFE5A5 & 0x1B7B) & (0xFFFFA76F & 0x5FBF);
        v.lIlllIlIIl[98] = 0xFFFFBFB5 & 0x4EEF;
        v.lIlllIlIIl[99] = 0xFFFFC5FB & 0x3FF4;
        v.lIlllIlIIl[100] = 0xFFFFCE07 & 0x3FFF;
        v.lIlllIlIIl[101] = 0xFFFFA7EF & 0x5EFE;
        v.lIlllIlIIl[102] = 0xFFFF8EBC & 0x7F47;
        v.lIlllIlIIl[103] = 0xFFFF8EBC & 0x77F3;
        v.lIlllIlIIl[104] = -(0xFFFFF3B1 & 0x4CDF) & (0xFFFFFFBF & 0x4FFB);
        v.lIlllIlIIl[105] = 0xF8 ^ 0xB2;
        v.lIlllIlIIl[106] = 0x49 ^ 2;
        v.lIlllIlIIl[107] = 0x34 ^ 0x2F ^ (0xD3 ^ 0x84);
        v.lIlllIlIIl[108] = 6 ^ 0x4B;
        v.lIlllIlIIl[109] = 0x40 ^ 0xE;
        v.lIlllIlIIl[110] = 0x48 ^ 7;
        v.lIlllIlIIl[111] = 0x34 ^ 0x2A ^ (0xE2 ^ 0xAC);
        v.lIlllIlIIl[112] = 0x6D ^ 0x2F ^ (0x55 ^ 0x46);
        v.lIlllIlIIl[113] = 0x97 ^ 0xC5;
        v.lIlllIlIIl[114] = 0xE4 ^ 0xB7;
        v.lIlllIlIIl[115] = 0xF2 ^ 0xA6;
        v.lIlllIlIIl[116] = 16 + 185 - 146 + 181 ^ 150 + 74 - 154 + 115;
        v.lIlllIlIIl[117] = 0x96 ^ 0xC0;
        v.lIlllIlIIl[118] = 0x51 ^ 0x18 ^ (0xAE ^ 0xB0);
        v.lIlllIlIIl[119] = 43 + 46 - -29 + 35 ^ 65 + 26 - 76 + 178;
        v.lIlllIlIIl[120] = 0x35 ^ 0x6C;
        v.lIlllIlIIl[121] = 0xF9 ^ 0x8E ^ (0x91 ^ 0xBC);
        v.lIlllIlIIl[122] = 154 + 122 - 106 + 53 ^ 43 + 86 - 1 + 4;
        v.lIlllIlIIl[123] = 92 + 1 - 38 + 179 ^ 27 + 120 - 138 + 173;
        v.lIlllIlIIl[124] = 0x9F ^ 0xC2;
        v.lIlllIlIIl[125] = 0xD1 ^ 0x85 ^ (0x25 ^ 0x2F);
    }

    private static boolean lIIlllIlllIII(int n2) {
        return n2 > 0;
    }

    private static void O() {
        d llllllllllllllllllIllllIlllIIlll;
        Object llllllllllllllllllIllllIlllIlIII;
        int[] nArray = new int[lIlllIlIIl[0]];
        nArray[v.lIlllIlIIl[1]] = lIlllIlIIl[9];
        if (v.lIIlllIllIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIlllIlIIl[9], lIlllIlIIl[12], lIlllIlIIl[74]);
            bp.add(d2);
            "".length();
        }
        int[] nArray2 = new int[lIlllIlIIl[0]];
        nArray2[v.lIlllIlIIl[1]] = lIlllIlIIl[11];
        if (v.lIIlllIllIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llllllllllllllllllIllllIlllIlIII = new d(lIlllIlIIl[11], lIlllIlIIl[13], j.bZ);
            bp.add((d)llllllllllllllllllIllllIlllIlIII);
            "".length();
        }
        if (v.lIIlllIllIlII(Bank.contains(llllllllllllllllllIllllIlllIlIII = item -> item.getName().toLowerCase().contains(lIlllIIlll[lIlllIlIIl[80]])) ? 1 : 0)) {
            llllllllllllllllllIllllIlllIIlll = new d(lIlllIlIIl[75], lIlllIlIIl[13], lIlllIlIIl[76]);
            bp.add(llllllllllllllllllIllllIlllIIlll);
            "".length();
        }
        int[] nArray3 = new int[lIlllIlIIl[0]];
        nArray3[v.lIlllIlIIl[1]] = lIlllIlIIl[7];
        if (v.lIIlllIllIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llllllllllllllllllIllllIlllIIlll = new d(lIlllIlIIl[7], lIlllIlIIl[53], lIlllIlIIl[74]);
            bp.add(llllllllllllllllllIllllIlllIIlll);
            "".length();
        }
        int[] nArray4 = new int[lIlllIlIIl[0]];
        nArray4[v.lIlllIlIIl[1]] = lIlllIlIIl[8];
        if (v.lIIlllIllIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llllllllllllllllllIllllIlllIIlll = new d(lIlllIlIIl[8], lIlllIlIIl[12], lIlllIlIIl[74]);
            bp.add(llllllllllllllllllIllllIlllIIlll);
            "".length();
        }
    }

    private static boolean lIIlllIllIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlllIlllIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIIlllIlIIIIl(String llllllllllllllllllIllllIlIlllIll, String llllllllllllllllllIllllIlIlllIlI) {
        llllllllllllllllllIllllIlIlllIll = new String(Base64.getDecoder().decode(llllllllllllllllllIllllIlIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIllllIlIlllllI = new StringBuilder();
        char[] llllllllllllllllllIllllIlIllllIl = llllllllllllllllllIllllIlIlllIlI.toCharArray();
        int llllllllllllllllllIllllIlIllllII = lIlllIlIIl[1];
        char[] llllllllllllllllllIllllIlIllIllI = llllllllllllllllllIllllIlIlllIll.toCharArray();
        int llllllllllllllllllIllllIlIllIlIl = llllllllllllllllllIllllIlIllIllI.length;
        int llllllllllllllllllIllllIlIllIlII = lIlllIlIIl[1];
        while (v.lIIlllIllIIll(llllllllllllllllllIllllIlIllIlII, llllllllllllllllllIllllIlIllIlIl)) {
            char llllllllllllllllllIllllIllIIIIIl = llllllllllllllllllIllllIlIllIllI[llllllllllllllllllIllllIlIllIlII];
            llllllllllllllllllIllllIlIlllllI.append((char)(llllllllllllllllllIllllIllIIIIIl ^ llllllllllllllllllIllllIlIllllIl[llllllllllllllllllIllllIlIllllII % llllllllllllllllllIllllIlIllllIl.length]));
            "".length();
            ++llllllllllllllllllIllllIlIllllII;
            ++llllllllllllllllllIllllIlIllIlII;
            "".length();
            if (((87 + 109 - 113 + 67 ^ 88 + 164 - 198 + 128) & (0x36 ^ 0x5F ^ (0x8E ^ 0xC7) ^ -" ".length())) <= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIllllIlIlllllI);
    }

    static {
        v.lIIlllIllIIIl();
        v.lIIlllIllIIII();
        bp = new ArrayList<d>();
        dr = lIlllIlIIl[1];
        ds = new WorldPoint(lIlllIlIIl[91], lIlllIlIIl[92], lIlllIlIIl[1]);
        dt = new WorldPoint(lIlllIlIIl[93], lIlllIlIIl[94], lIlllIlIIl[1]);
        du = new WorldPoint(lIlllIlIIl[95], lIlllIlIIl[96], lIlllIlIIl[1]);
        dv = new WorldPoint(lIlllIlIIl[97], lIlllIlIIl[98], lIlllIlIIl[1]);
        dw = new WorldPoint(lIlllIlIIl[99], lIlllIlIIl[100], lIlllIlIIl[1]);
        dx = new WorldPoint(lIlllIlIIl[101], lIlllIlIIl[102], lIlllIlIIl[1]);
        dy = new WorldPoint(lIlllIlIIl[103], lIlllIlIIl[104], lIlllIlIIl[1]);
        String[] stringArray = new String[lIlllIlIIl[33]];
        stringArray[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[105]];
        stringArray[v.lIlllIlIIl[0]] = lIlllIIlll[lIlllIlIIl[106]];
        stringArray[v.lIlllIlIIl[5]] = lIlllIIlll[lIlllIlIIl[107]];
        stringArray[v.lIlllIlIIl[10]] = lIlllIIlll[lIlllIlIIl[108]];
        stringArray[v.lIlllIlIIl[6]] = lIlllIIlll[lIlllIlIIl[109]];
        stringArray[v.lIlllIlIIl[13]] = lIlllIIlll[lIlllIlIIl[110]];
        stringArray[v.lIlllIlIIl[17]] = lIlllIIlll[lIlllIlIIl[111]];
        stringArray[v.lIlllIlIIl[18]] = lIlllIIlll[lIlllIlIIl[112]];
        stringArray[v.lIlllIlIIl[2]] = lIlllIIlll[lIlllIlIIl[113]];
        stringArray[v.lIlllIlIIl[24]] = lIlllIIlll[lIlllIlIIl[114]];
        stringArray[v.lIlllIlIIl[12]] = lIlllIIlll[lIlllIlIIl[115]];
        stringArray[v.lIlllIlIIl[25]] = lIlllIIlll[lIlllIlIIl[116]];
        stringArray[v.lIlllIlIIl[15]] = lIlllIIlll[lIlllIlIIl[117]];
        stringArray[v.lIlllIlIIl[26]] = lIlllIIlll[lIlllIlIIl[118]];
        stringArray[v.lIlllIlIIl[27]] = lIlllIIlll[lIlllIlIIl[119]];
        stringArray[v.lIlllIlIIl[28]] = lIlllIIlll[lIlllIlIIl[120]];
        stringArray[v.lIlllIlIIl[29]] = lIlllIIlll[lIlllIlIIl[121]];
        stringArray[v.lIlllIlIIl[30]] = lIlllIIlll[lIlllIlIIl[122]];
        stringArray[v.lIlllIlIIl[31]] = lIlllIIlll[lIlllIlIIl[123]];
        stringArray[v.lIlllIlIIl[32]] = lIlllIIlll[lIlllIlIIl[124]];
        cy = stringArray;
    }

    private static boolean lIIlllIlllIll(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public int ad() {
        try {
            v.bf();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ("   ".length() > (0x91 ^ 0xA2 ^ (0x28 ^ 0x1F))) {
            return (0xE7 ^ 0xB1 ^ (0x6D ^ 0x2F)) & (0x98 ^ 0x96 ^ (0x4F ^ 0x55) ^ -" ".length());
        }
        return lIlllIlIIl[77];
    }

    private static boolean lIIlllIllIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlllIllIlll(Object object) {
        return object != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean af() {
        int n2;
        if (v.lIIlllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[24])) {
            String[] stringArray = new String[lIlllIlIIl[0]];
            stringArray[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[79]];
            if (v.lIIlllIllIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                n2 = lIlllIlIIl[0];
                "".length();
                if (((0x48 ^ 1) & ~(0x79 ^ 0x30)) >= 0) return n2 != 0;
                return ((0x84 ^ 0xBC) & ~(0x92 ^ 0xAA)) != 0;
            }
        }
        n2 = lIlllIlIIl[1];
        return n2 != 0;
    }

    private static String lIIlllIlIIIII(String llllllllllllllllllIllllIllIlllIl, String llllllllllllllllllIllllIllIlllII) {
        try {
            SecretKeySpec llllllllllllllllllIllllIlllIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIllllIllIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIllllIllIlllll = Cipher.getInstance("Blowfish");
            llllllllllllllllllIllllIllIlllll.init(lIlllIlIIl[5], llllllllllllllllllIllllIlllIIIII);
            return new String(llllllllllllllllllIllllIllIlllll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIllllIllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIllllIllIllllI) {
            llllllllllllllllllIllllIllIllllI.printStackTrace();
            return null;
        }
    }

    private static void lIIlllIllIIII() {
        lIlllIIlll = new String[lIlllIlIIl[125]];
        v.lIlllIIlll[v.lIlllIlIIl[1]] = v.lIIlllIIlllll("PTkPVtA1iDLkdtTBEhPPYeZKwqD6jgTscsZjdM9bnCOSCKsWbs92qNcO5diHxwCY", "wWvxh");
        v.lIlllIIlll[v.lIlllIlIIl[0]] = v.lIIlllIlIIIII("tR6FTaMxCP6/Y3ZqrCs3qg==", "eqabx");
        v.lIlllIIlll[v.lIlllIlIIl[5]] = v.lIIlllIlIIIIl("IBgeLQ0BFxdpAwkXGyAPDw==", "hypIa");
        v.lIlllIIlll[v.lIlllIlIIl[10]] = v.lIIlllIlIIIII("R96/mQhVcmDSXp/UGcljd6wwdv7h24+PHa9tjYrwmdAdo0x02uQbjpGA2slisri313gO0EHKYM0=", "IvCDA");
        v.lIlllIIlll[v.lIlllIlIIl[6]] = v.lIIlllIlIIIII("l6AEbNq+HrE=", "deEXH");
        v.lIlllIIlll[v.lIlllIlIIl[13]] = v.lIIlllIIlllll("4QFnPuwrMtQ=", "LxnEu");
        v.lIlllIIlll[v.lIlllIlIIl[17]] = v.lIIlllIlIIIII("YijrKHYZeDyU3P9jZ8KKLg==", "GHpNQ");
        v.lIlllIIlll[v.lIlllIlIIl[18]] = v.lIIlllIlIIIIl("HgEzNA4kGzVmCzgQITI=", "MuRFz");
        v.lIlllIIlll[v.lIlllIlIIl[2]] = v.lIIlllIIlllll("uba3Njk94LY=", "wLBEG");
        v.lIlllIIlll[v.lIlllIlIIl[24]] = v.lIIlllIIlllll("ZQHF2Kf6YhJpSUC3MLgszphx9nS2DCxS", "ttUZw");
        v.lIlllIIlll[v.lIlllIlIIl[12]] = v.lIIlllIIlllll("exQPiRA4z0g=", "QmKRV");
        v.lIlllIIlll[v.lIlllIlIIl[25]] = v.lIIlllIlIIIII("YN6Y3mIGV4IMlsvvTeTFlg==", "sswPA");
        v.lIlllIIlll[v.lIlllIlIIl[15]] = v.lIIlllIlIIIIl("ABkpCjYrAy8GdzYUOA07KQ==", "EwJbW");
        v.lIlllIIlll[v.lIlllIlIIl[26]] = v.lIIlllIlIIIIl("MzElECMQJg==", "uTDdK");
        v.lIlllIIlll[v.lIlllIlIIl[27]] = v.lIIlllIlIIIIl("KTw0ITkCJjIteB0nPiU0", "lRWIX");
        v.lIlllIIlll[v.lIlllIlIIl[28]] = v.lIIlllIlIIIII("P1JtwY3Zc/DLir77UH6aCZ6rgkcL5RuP", "yVhyx");
        v.lIlllIIlll[v.lIlllIlIIl[29]] = v.lIIlllIlIIIIl("AwUvOA45A2MjDiQH", "WdCSg");
        v.lIlllIIlll[v.lIlllIlIIl[30]] = v.lIIlllIlIIIII("+P1/elyV1yw=", "lpHVx");
        v.lIlllIIlll[v.lIlllIlIIl[31]] = v.lIIlllIIlllll("U+nHIKl0IX2bIQ+ldnya2A==", "zMBYw");
        v.lIlllIIlll[v.lIlllIlIIl[32]] = v.lIIlllIIlllll("MSGR2/64CKQ9+DtqWm/+Aw==", "CfhoM");
        v.lIlllIIlll[v.lIlllIlIIl[33]] = v.lIIlllIlIIIII("J4tN9EKtKCUontOmgek7tg==", "SqKSO");
        v.lIlllIIlll[v.lIlllIlIIl[34]] = v.lIIlllIIlllll("9UrQti3Ev70=", "cBbhR");
        v.lIlllIIlll[v.lIlllIlIIl[35]] = v.lIIlllIlIIIIl("Bx80LgApEz5nEjMV", "AvZGs");
        v.lIlllIIlll[v.lIlllIlIIl[36]] = v.lIIlllIIlllll("WusxBN9Xg0eu0p56IGScxX50LCp4w68f", "Detnv");
        v.lIlllIIlll[v.lIlllIlIIl[37]] = v.lIIlllIIlllll("tgZ0/W7GNFmWh1YRP3oj6A==", "UMUxT");
        v.lIlllIIlll[v.lIlllIlIIl[38]] = v.lIIlllIlIIIII("xYIJ7S5INqc=", "Zabkd");
        v.lIlllIIlll[v.lIlllIlIIl[39]] = v.lIIlllIlIIIIl("FycHGjs5Kw1TJSQgHQo=", "QNisH");
        v.lIlllIIlll[v.lIlllIlIIl[40]] = v.lIIlllIlIIIIl("BQwPeAAkTQowDTEEHDZUPwQVPQ==", "KmyXt");
        v.lIlllIIlll[v.lIlllIlIIl[41]] = v.lIIlllIlIIIIl("OjgWPScAPlolJhcjEzMg", "nYzVN");
        v.lIlllIIlll[v.lIlllIlIIl[42]] = v.lIIlllIIlllll("B8HMJPb9wKp7cIUL0VMBMA==", "CKotK");
        v.lIlllIIlll[v.lIlllIlIIl[43]] = v.lIIlllIlIIIII("eLyOyWQyH03XOGxlVF/XSQjrMD5DjnGF", "BxevT");
        v.lIlllIIlll[v.lIlllIlIIl[44]] = v.lIIlllIlIIIII("JD/ug0pkj4rTIpbgWi61drudtwCFoag3", "ZfbIL");
        v.lIlllIIlll[v.lIlllIlIIl[45]] = v.lIIlllIlIIIII("eKxmYx4zhPTNHnjPdsW9Yq562rJ6HWQu", "dPyVx");
        v.lIlllIIlll[v.lIlllIlIIl[46]] = v.lIIlllIlIIIIl("DTgHFxEg", "EWuvr");
        v.lIlllIIlll[v.lIlllIlIIl[47]] = v.lIIlllIlIIIII("+E91G7upCIXazSD2bOYJ2OFPjni0raOC", "XTpGF");
        v.lIlllIIlll[v.lIlllIlIIl[48]] = v.lIIlllIlIIIIl("NC0yTwIVbDcbFwg4", "zLDov");
        v.lIlllIIlll[v.lIlllIlIIl[49]] = v.lIIlllIlIIIII("OL9DoPR15blz938I7rZ9eA==", "oeZwX");
        v.lIlllIIlll[v.lIlllIlIIl[50]] = v.lIIlllIIlllll("gvwO+kX0gE0=", "zOeYW");
        v.lIlllIIlll[v.lIlllIlIIl[51]] = v.lIIlllIlIIIII("MkTi/gLl5YE3UJgw4brBI8YRALueggkZ", "yRuvl");
        v.lIlllIIlll[v.lIlllIlIIl[52]] = v.lIIlllIlIIIII("SN7GmKtHV+TT1mjzd99ing==", "zxKcq");
        v.lIlllIIlll[v.lIlllIlIIl[53]] = v.lIIlllIlIIIII("/luOcODZZZGoICdPQw2P5Q==", "xHWWD");
        v.lIlllIIlll[v.lIlllIlIIl[54]] = v.lIIlllIlIIIII("arsW0YThPj5AgbSEkxRKuQ==", "sEeQH");
        v.lIlllIIlll[v.lIlllIlIIl[55]] = v.lIIlllIlIIIII("h3KTB5MK0H6ORTevkosskw==", "bWrXX");
        v.lIlllIIlll[v.lIlllIlIIl[56]] = v.lIIlllIlIIIIl("MikbMyIoL1cuLik7", "FHwXK");
        v.lIlllIIlll[v.lIlllIlIIl[57]] = v.lIIlllIlIIIIl("AjU2Ag==", "TPYqT");
        v.lIlllIIlll[v.lIlllIlIIl[58]] = v.lIIlllIlIIIII("FRRWm795OfI8Njg1R+xyNg==", "cTRkz");
        v.lIlllIIlll[v.lIlllIlIIl[60]] = v.lIIlllIIlllll("FZ3nZP54T11CVAyl2hh0mA==", "YBvit");
        v.lIlllIIlll[v.lIlllIlIIl[61]] = v.lIIlllIIlllll("3cVJBqMI+QD/flsAy+lBZw==", "kQFYS");
        v.lIlllIIlll[v.lIlllIlIIl[62]] = v.lIIlllIlIIIII("0tdQ0bj9ZzA=", "yrVLr");
        v.lIlllIIlll[v.lIlllIlIIl[63]] = v.lIIlllIIlllll("tRooyVnSIjNgqxrDFatEkYDsddaFj0xq", "aBIch");
        v.lIlllIIlll[v.lIlllIlIIl[64]] = v.lIIlllIlIIIII("BS98iEoVCjQ=", "soHEJ");
        v.lIlllIIlll[v.lIlllIlIIl[65]] = v.lIIlllIlIIIII("stMT/lW+lDM=", "NseaJ");
        v.lIlllIIlll[v.lIlllIlIIl[66]] = v.lIIlllIlIIIII("7LISCyhGev9hJWj17zWsaA==", "NgKtg");
        v.lIlllIIlll[v.lIlllIlIIl[67]] = v.lIIlllIlIIIII("sZlIC0RZ+5yqk7TZqkVkCw==", "oGQbW");
        v.lIlllIIlll[v.lIlllIlIIl[68]] = v.lIIlllIIlllll("k5/YsN4br8Hko+ILkrxK9Q==", "paZMB");
        v.lIlllIIlll[v.lIlllIlIIl[69]] = v.lIIlllIlIIIIl("IBk6", "rlXIw");
        v.lIlllIIlll[v.lIlllIlIIl[70]] = v.lIIlllIlIIIIl("Kh0eNwsNERw1SAoUEysNCw==", "yxrRh");
        v.lIlllIIlll[v.lIlllIlIIl[71]] = v.lIIlllIlIIIII("2hmTykeWHT4=", "aXqco");
        v.lIlllIIlll[v.lIlllIlIIl[72]] = v.lIIlllIlIIIII("xZoyXzkuMBo=", "dgAyM");
        v.lIlllIIlll[v.lIlllIlIIl[73]] = v.lIIlllIlIIIIl("KCIMFjoLNQ==", "nGmbR");
        v.lIlllIIlll[v.lIlllIlIIl[78]] = v.lIIlllIlIIIII("FtcS34YwEISA/AFY7HMYTjkmVj8e5PKW", "WKICY");
        v.lIlllIIlll[v.lIlllIlIIl[79]] = v.lIIlllIlIIIII("N8d4Ellv7U+vfnpxQa+irA==", "AhcAv");
        v.lIlllIIlll[v.lIlllIlIIl[80]] = v.lIIlllIIlllll("kcmHn5+p04enkmVNkZdby53HRx0sPwWp", "uuKKk");
        v.lIlllIIlll[v.lIlllIlIIl[81]] = v.lIIlllIlIIIII("zA2JrNQalxiLg9j8UNg6S4hEvUR1sup8Cyvp3AbMWsE=", "MrpEO");
        v.lIlllIIlll[v.lIlllIlIIl[82]] = v.lIIlllIlIIIIl("ODECcyJ0IAQ1NTF6", "TTvTQ");
        v.lIlllIIlll[v.lIlllIlIIl[16]] = v.lIIlllIlIIIII("k6mixA4fUIgZYn8dojAKTw==", "Nranp");
        v.lIlllIIlll[v.lIlllIlIIl[83]] = v.lIIlllIlIIIIl("DykqTyFsKTcESDUnMU8JLicxG0gfICUWEiUtKlA=", "LHDoh");
        v.lIlllIIlll[v.lIlllIlIIl[84]] = v.lIIlllIlIIIII("CMDyTZpM9uTJIgj+pn439g==", "AHnZS");
        v.lIlllIIlll[v.lIlllIlIIl[85]] = v.lIIlllIIlllll("QgPpkVm4QhRtkrpMPqX3b/TnOjgA2gz0Z/sjG9onn2k=", "diqDi");
        v.lIlllIIlll[v.lIlllIlIIl[86]] = v.lIIlllIlIIIIl("KT8kdhlFLiIwDgB0", "eZPQj");
        v.lIlllIIlll[v.lIlllIlIIl[87]] = v.lIIlllIlIIIIl("LxgMSRFMGBECeBUWF0k5DhYXHXgtCwEMLRkKXQ==", "lybiX");
        v.lIlllIIlll[v.lIlllIlIIl[88]] = v.lIIlllIlIIIIl("B1YQFx5pAlQWFSsSVBkeNwIcER4pWA==", "Nvtxp");
        v.lIlllIIlll[v.lIlllIlIIl[89]] = v.lIIlllIlIIIIl("EwMbSQxwAwYCZSkNAEkkMg0AHWUADQcdZQALBgokIgsZADAjXQ==", "PbuiE");
        v.lIlllIIlll[v.lIlllIlIIl[90]] = v.lIIlllIIlllll("85gHbiGJI4kSSBliFpfAUeduEmbiobOpiwjSSyXQ9ARzAwO4onASDQ==", "vvzaU");
        v.lIlllIIlll[v.lIlllIlIIl[105]] = v.lIIlllIlIIIIl("LCo4IHUdJDtlMgs/biQ7HWs/MDAXPz1lMws5bigwWw==", "dKNEU");
        v.lIlllIIlll[v.lIlllIlIIl[106]] = v.lIIlllIlIIIIl("GhwLRA==", "Cyxjg");
        v.lIlllIIlll[v.lIlllIlIIl[107]] = v.lIIlllIIlllll("KNy8Gc4h/hU=", "IxRVZ");
        v.lIlllIIlll[v.lIlllIlIIl[108]] = v.lIIlllIIlllll("IFS3LwwQJw6L8rJ8nFuVLQUxK5sWr1v/Xevd46NIPtMKoeojrgvXXg==", "uwfzS");
        v.lIlllIIlll[v.lIlllIlIIl[109]] = v.lIIlllIIlllll("dJJv1k9m3h5yl1sRN+ofZSK4K9fo95lp4GpvR0ny8HaFOPBnPrrrAAFjTkgUTref", "QFOBU");
        v.lIlllIIlll[v.lIlllIlIIl[110]] = v.lIIlllIlIIIII("OxAzkQanrp+Fk4EwDFCfUq3boDP5JwZxLHEEiCjBBC5DCzojTFbVdA==", "ubRqv");
        v.lIlllIIlll[v.lIlllIlIIl[111]] = v.lIIlllIlIIIII("6lqxVyr/vDgUIgC5lygsUEpdfmxKzADQ2I54Dz/HmHw=", "cslDW");
        v.lIlllIIlll[v.lIlllIlIIl[112]] = v.lIIlllIIlllll("uvZp0C2rZDoivojJ15lo/loS5Wq2EmAwMeHXLxOB1r/b2yaNcPsK5w==", "ZhbQQ");
        v.lIlllIIlll[v.lIlllIlIIl[113]] = v.lIIlllIlIIIII("Abe/okLuDyRVpYgla6+JTVCa2Tsx6DpCga6FTr9bzr0=", "SbDAR");
        v.lIlllIIlll[v.lIlllIlIIl[114]] = v.lIIlllIlIIIIl("GjoqQh8lPSYOCG0bcwUNJDxzBA07PSYQTDo7JwpMAT0lAwcoPDQIUw==", "MRSbl");
        v.lIlllIIlll[v.lIlllIlIIl[115]] = v.lIIlllIIlllll("9q/UKjhaLOoItxjhZNaHMdiOdEijk+cf6zdMuVO0HOs=", "TMYZj");
        v.lIlllIIlll[v.lIlllIlIIl[116]] = v.lIIlllIlIIIIl("ES4XZAcuKRsoEGYPTiMVLyhOIhUwKRs2VDEvGixUFS4PPQ4vIwB7", "FFnDt");
        v.lIlllIIlll[v.lIlllIlIIl[117]] = v.lIIlllIlIIIII("OVqqPappAFVskM4qI5vKT0i7Ut8/2nzwFJ2h76bdu/0=", "PIaul");
        v.lIlllIIlll[v.lIlllIlIIl[118]] = v.lIIlllIIlllll("Ica9bjdgsneSLw4SLZwKoFmoPhT9r5mXqpUnJGXNx7Zax2yYw+Z+Zg==", "vZVIj");
        v.lIlllIIlll[v.lIlllIlIIl[119]] = v.lIIlllIlIIIIl("Mis2AVQMMHcBHAAxMlUACmMzGlQMLXclGxc3dyUdFiA2Bx0JKiIGSw==", "eCWut");
        v.lIlllIIlll[v.lIlllIlIIl[120]] = v.lIIlllIlIIIIl("FAcvN0oqHG43AiYdK2MeLE8qLEoqAW4CGCAKOzYZfA==", "CoNCj");
        v.lIlllIIlll[v.lIlllIlIIl[121]] = v.lIIlllIlIIIIl("BRILGkM7CUoaCzcID04XPVoOAUM7FEoiDCQbAQsNNRBV", "Rzjnc");
        v.lIlllIIlll[v.lIlllIlIIl[122]] = v.lIIlllIlIIIII("FZhZQdy+TQQoaQm75lNAmKg2JbExJTi69A9zH2O46iiVIEvDsYrx/w==", "NmDJg");
        v.lIlllIIlll[v.lIlllIlIIl[123]] = v.lIIlllIlIIIIl("DSARBnEzO1AGOT86FVIlNWgUHXEzJlA6PikhFBskKXc=", "ZHprQ");
        v.lIlllIIlll[v.lIlllIlIIl[124]] = v.lIIlllIIlllll("iEebO6X3RVWTN4VkxqCJzgzlYgBxM5uJ9E/E4qFMX9U=", "zNAjQ");
    }

    private static boolean lIIlllIllIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlllIllIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlllIlllIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIlllIllIllI(int n2, int n3) {
        return n2 == n3;
    }

    public static void bg() {
        String[] stringArray = new String[lIlllIlIIl[0]];
        stringArray[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[66]];
        if (v.lIIlllIllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            if (v.lIIlllIllIlll(Widgets.get((int)lIlllIlIIl[59]))) {
                Widget llllllllllllllllllIllllIlllIlIll;
                AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[67]];
                String[] stringArray2 = new String[lIlllIlIIl[0]];
                stringArray2[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[68]];
                Inventory.getFirst((String[])stringArray2).interact(lIlllIIlll[lIlllIlIIl[69]]);
                Time.sleepTicks((int)lIlllIlIIl[6]);
                "".length();
                AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[70]];
                Widget widget = Widgets.get((int)lIlllIlIIl[59], (int)lIlllIlIIl[27]);
                if (v.lIIlllIllIlll(widget)) {
                    widget.interact(lIlllIIlll[lIlllIlIIl[71]]);
                    Time.sleepTicks((int)lIlllIlIIl[0]);
                    "".length();
                }
                if (v.lIIlllIllIlll(llllllllllllllllllIllllIlllIlIll = Widgets.get((int)lIlllIlIIl[59], (int)lIlllIlIIl[39]))) {
                    llllllllllllllllllIllllIlllIlIll.interact(lIlllIIlll[lIlllIlIIl[72]]);
                    Time.sleepTicks((int)lIlllIlIIl[5]);
                    "".length();
                }
            }
            Time.sleepTicks((int)lIlllIlIIl[0]);
            "".length();
        }
    }

    private static String lIIlllIIlllll(String llllllllllllllllllIllllIllIlIIII, String llllllllllllllllllIllllIllIIllIl) {
        try {
            SecretKeySpec llllllllllllllllllIllllIllIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIllllIllIIllIl.getBytes(StandardCharsets.UTF_8)), lIlllIlIIl[2]), "DES");
            Cipher llllllllllllllllllIllllIllIlIIlI = Cipher.getInstance("DES");
            llllllllllllllllllIllllIllIlIIlI.init(lIlllIlIIl[5], llllllllllllllllllIllllIllIlIIll);
            return new String(llllllllllllllllllIllllIllIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIllllIllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIllllIllIlIIIl) {
            llllllllllllllllllIllllIllIlIIIl.printStackTrace();
            return null;
        }
    }

    public static void bf() {
        block80: {
            Widget llllllllllllllllllIllllIllllIIlI;
            Object llllllllllllllllllIllllIllllIIll;
            block82: {
                block81: {
                    if (v.lIIlllIllIIlI(bn ? 1 : 0)) {
                        b.a(bp);
                        if (v.lIIlllIllIIll(bp.size(), lIlllIlIIl[0])) {
                            System.out.println(lIlllIIlll[lIlllIlIIl[1]]);
                            bn = lIlllIlIIl[1];
                        }
                    }
                    if (!v.lIIlllIllIlII(bn ? 1 : 0)) break block80;
                    if (!v.lIIlllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlllIlIIl[2])) break block81;
                    int[] nArray = new int[lIlllIlIIl[0]];
                    nArray[v.lIlllIlIIl[1]] = lIlllIlIIl[3];
                    if (!v.lIIlllIllIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block82;
                }
                J.cL();
            }
            if (v.lIIlllIllIlII(v.al() ? 1 : 0) && v.lIIlllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[0]) && v.lIIlllIllIllI(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlllIlIIl[2])) {
                int[] nArray = new int[lIlllIlIIl[0]];
                nArray[v.lIlllIlIIl[1]] = lIlllIlIIl[3];
                if (v.lIIlllIllIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    llllllllllllllllllIllllIllllIIll = BankLocation.getNearest();
                    if (v.lIIlllIllIlll(llllllllllllllllllIllllIllllIIll) && v.lIIlllIllIlII(llllllllllllllllllIllllIllllIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[0]];
                        a.a((BankLocation)llllllllllllllllllIllllIllllIIll);
                    }
                    if (v.lIIlllIllIlll(llllllllllllllllllIllllIllllIIll) && v.lIIlllIllIIlI(llllllllllllllllllIllllIllllIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (v.lIIlllIllIlII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIlllIlIIl[4]);
                            "".length();
                        }
                        if (v.lIIlllIllIIlI(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[5]];
                            if (v.lIIlllIlllIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIlllIlIIl[6]);
                                "".length();
                            }
                            if (v.lIIlllIlllIII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIlllIlIIl[5]);
                                "".length();
                            }
                            int[] nArray2 = new int[lIlllIlIIl[6]];
                            nArray2[v.lIlllIlIIl[1]] = lIlllIlIIl[7];
                            nArray2[v.lIlllIlIIl[0]] = lIlllIlIIl[8];
                            nArray2[v.lIlllIlIIl[5]] = lIlllIlIIl[9];
                            nArray2[v.lIlllIlIIl[10]] = lIlllIlIIl[11];
                            if (v.lIIlllIllIlII(e.b(nArray2) ? 1 : 0)) {
                                v.O();
                                System.out.println(lIlllIIlll[lIlllIlIIl[10]]);
                                bn = lIlllIlIIl[0];
                                return;
                            }
                            int[] nArray3 = new int[lIlllIlIIl[6]];
                            nArray3[v.lIlllIlIIl[1]] = lIlllIlIIl[7];
                            nArray3[v.lIlllIlIIl[0]] = lIlllIlIIl[8];
                            nArray3[v.lIlllIlIIl[5]] = lIlllIlIIl[9];
                            nArray3[v.lIlllIlIIl[10]] = lIlllIlIIl[11];
                            if (v.lIIlllIllIIlI(e.b(nArray3) ? 1 : 0)) {
                                a.a(lIlllIlIIl[7], lIlllIlIIl[12]);
                                a.a(lIlllIlIIl[8], lIlllIlIIl[12]);
                                a.a(lIlllIlIIl[9], lIlllIlIIl[0]);
                                a.a(lIlllIlIIl[11], lIlllIlIIl[13]);
                                a.a(lIlllIlIIl[14], lIlllIlIIl[13]);
                            }
                        }
                    }
                }
            }
            int[] nArray = new int[lIlllIlIIl[0]];
            nArray[v.lIlllIlIIl[1]] = lIlllIlIIl[14];
            if (v.lIIlllIllIIlI(Inventory.contains((int[])nArray) ? 1 : 0) && v.lIIlllIllIlIl(Combat.getMissingHealth(), lIlllIlIIl[15])) {
                int[] nArray4 = new int[lIlllIlIIl[0]];
                nArray4[v.lIlllIlIIl[1]] = lIlllIlIIl[14];
                Inventory.getFirst((int[])nArray4).interact(lIlllIIlll[lIlllIlIIl[6]]);
                Time.sleepTicks((int)lIlllIlIIl[5]);
                "".length();
            }
            if (v.lIIlllIllIIlI(Inventory.contains((int[])f.aU) ? 1 : 0) && v.lIIlllIllIIll(Movement.getRunEnergy(), lIlllIlIIl[16])) {
                Inventory.getFirst((int[])f.aU).interact(lIlllIIlll[lIlllIlIIl[13]]);
                Time.sleepTicks((int)lIlllIlIIl[0]);
                "".length();
            }
            if (v.lIIlllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[0]) && v.lIIlllIllIIlI(v.al() ? 1 : 0) && v.lIIlllIllIllI(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlllIlIIl[2])) {
                int[] nArray5 = new int[lIlllIlIIl[0]];
                nArray5[v.lIlllIlIIl[1]] = lIlllIlIIl[3];
                if (v.lIIlllIllIlII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                    if (v.lIIlllIllIlII(Players.getLocal().getWorldLocation().equals((Object)ds) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[17]];
                        if (v.lIIlllIllIIlI(Dialog.isOpen() ? 1 : 0) && v.lIIlllIllIIll(dr, lIlllIlIIl[5])) {
                            Dialog.close();
                            dr += lIlllIlIIl[0];
                        }
                        e.a(ds);
                    }
                    if (v.lIIlllIllIIlI(Players.getLocal().getWorldLocation().equals((Object)ds) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[18]];
                        g.a(lIlllIIlll[lIlllIlIIl[2]], cy);
                    }
                }
            }
            System.out.println("5620: " + Vars.getBit((int)lIlllIlIIl[19]));
            System.out.println("5621: " + Vars.getBit((int)lIlllIlIIl[20]));
            System.out.println("5622: " + Vars.getBit((int)lIlllIlIIl[21]));
            System.out.println("5623: " + Vars.getBit((int)lIlllIlIIl[22]));
            System.out.println("5624: " + Vars.getBit((int)lIlllIlIIl[23]));
            if (v.lIIlllIllIllI(Vars.getBit((int)lIlllIlIIl[19]), lIlllIlIIl[0])) {
                dm = lIlllIlIIl[0];
            }
            if (v.lIIlllIllIllI(Vars.getBit((int)lIlllIlIIl[20]), lIlllIlIIl[0])) {
                dn = lIlllIlIIl[0];
            }
            if (v.lIIlllIllIllI(Vars.getBit((int)lIlllIlIIl[21]), lIlllIlIIl[0])) {
                do = lIlllIlIIl[0];
            }
            if (v.lIIlllIllIllI(Vars.getBit((int)lIlllIlIIl[22]), lIlllIlIIl[0])) {
                dp = lIlllIlIIl[0];
            }
            if (v.lIIlllIllIllI(Vars.getBit((int)lIlllIlIIl[23]), lIlllIlIIl[0])) {
                dq = lIlllIlIIl[0];
            }
            if (v.lIIlllIllIllI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[0])) {
                int llllllllllllllllllIllllIllllIIIl;
                dc = lIlllIlIIl[1];
                if (v.lIIlllIllIlII(dm ? 1 : 0)) {
                    String[] stringArray = new String[lIlllIlIIl[0]];
                    stringArray[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[24]];
                    if (v.lIIlllIllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray2 = new String[lIlllIlIIl[0]];
                        stringArray2[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[12]];
                        if (v.lIIlllIllIIlI(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                            String[] stringArray3 = new String[lIlllIlIIl[0]];
                            stringArray3[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[25]];
                            if (v.lIIlllIllIlII(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                String[] stringArray4 = new String[lIlllIlIIl[0]];
                                stringArray4[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[15]];
                                String[] stringArray5 = new String[lIlllIlIIl[0]];
                                stringArray5[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[26]];
                                Inventory.getFirst((String[])stringArray4).useOn(Inventory.getFirst((String[])stringArray5));
                                Time.sleepTicks((int)lIlllIlIIl[5]);
                                "".length();
                            }
                        }
                    }
                    String[] stringArray6 = new String[lIlllIlIIl[0]];
                    stringArray6[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[27]];
                    if (v.lIIlllIllIIlI(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                        if (v.lIIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dt), lIlllIlIIl[2])) {
                            AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[28]];
                            Movement.walkTo((WorldPoint)dt);
                            "".length();
                            Time.sleepTicks((int)lIlllIlIIl[0]);
                            "".length();
                        }
                        if (v.lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dt), lIlllIlIIl[2])) {
                            AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[29]];
                            g.a(lIlllIIlll[lIlllIlIIl[30]], cy, lIlllIlIIl[0]);
                            Time.sleepTicks((int)lIlllIlIIl[0]);
                            "".length();
                            llllllllllllllllllIllllIllllIIll = Dialog.getOptions();
                            llllllllllllllllllIllllIllllIIlI = new ArrayList();
                            if (v.lIIlllIllIlII(llllllllllllllllllIllllIllllIIll.isEmpty() ? 1 : 0)) {
                                llllllllllllllllllIllllIllllIIIl = lIlllIlIIl[1];
                                while (v.lIIlllIllIIll(llllllllllllllllllIllllIllllIIIl, llllllllllllllllllIllllIllllIIll.size())) {
                                    llllllllllllllllllIllllIllllIIlI.add(((Widget)llllllllllllllllllIllllIllllIIll.get(llllllllllllllllllIllllIllllIIIl)).getText());
                                    "".length();
                                    ++llllllllllllllllllIllllIllllIIIl;
                                    "".length();
                                    if (((0x90 ^ 0xAA) & ~(0x14 ^ 0x2E)) >= -" ".length()) continue;
                                    return;
                                }
                                llllllllllllllllllIllllIllllIIIl = llllllllllllllllllIllllIllllIIlI.stream().anyMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[90]])) ? 1 : 0;
                                int n2 = llllllllllllllllllIllllIllllIIlI.stream().noneMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[89]]));
                                if (v.lIIlllIllIIlI(llllllllllllllllllIllllIllllIIIl) && v.lIIlllIllIIlI(n2)) {
                                    System.out.println(lIlllIIlll[lIlllIlIIl[31]]);
                                }
                            }
                        }
                    }
                }
                if (v.lIIlllIllIlII(dn ? 1 : 0) && v.lIIlllIllIIlI(dm ? 1 : 0)) {
                    if (v.lIIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(du), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[32]];
                        Movement.walkTo((WorldPoint)du);
                        "".length();
                        Time.sleepTicks((int)lIlllIlIIl[0]);
                        "".length();
                    }
                    if (v.lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(du), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[33]];
                        g.a(lIlllIIlll[lIlllIlIIl[34]], cy, lIlllIlIIl[0]);
                        Time.sleepTicks((int)lIlllIlIIl[0]);
                        "".length();
                        llllllllllllllllllIllllIllllIIll = Dialog.getOptions();
                        llllllllllllllllllIllllIllllIIlI = new ArrayList();
                        if (v.lIIlllIllIlII(llllllllllllllllllIllllIllllIIll.isEmpty() ? 1 : 0)) {
                            llllllllllllllllllIllllIllllIIIl = lIlllIlIIl[1];
                            while (v.lIIlllIllIIll(llllllllllllllllllIllllIllllIIIl, llllllllllllllllllIllllIllllIIll.size())) {
                                llllllllllllllllllIllllIllllIIlI.add(((Widget)llllllllllllllllllIllllIllllIIll.get(llllllllllllllllllIllllIllllIIIl)).getText());
                                "".length();
                                ++llllllllllllllllllIllllIllllIIIl;
                                "".length();
                                if (((0x15 ^ 0x27) & ~(0x6D ^ 0x5F)) == 0) continue;
                                return;
                            }
                            llllllllllllllllllIllllIllllIIIl = llllllllllllllllllIllllIllllIIlI.stream().anyMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[88]])) ? 1 : 0;
                            int n3 = llllllllllllllllllIllllIllllIIlI.stream().noneMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[87]]));
                            if (v.lIIlllIllIIlI(llllllllllllllllllIllllIllllIIIl) && v.lIIlllIllIIlI(n3)) {
                                System.out.println(lIlllIIlll[lIlllIlIIl[35]]);
                            }
                        }
                    }
                }
                if (v.lIIlllIllIlII(do ? 1 : 0) && v.lIIlllIllIIlI(dn ? 1 : 0) && v.lIIlllIllIIlI(dm ? 1 : 0)) {
                    if (v.lIIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dv), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[36]];
                        Movement.walkTo((WorldPoint)dv);
                        "".length();
                        Time.sleepTicks((int)lIlllIlIIl[0]);
                        "".length();
                    }
                    if (v.lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dv), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[37]];
                        g.a(lIlllIIlll[lIlllIlIIl[38]], cy, lIlllIlIIl[0]);
                        Time.sleepTicks((int)lIlllIlIIl[0]);
                        "".length();
                        llllllllllllllllllIllllIllllIIll = Dialog.getOptions();
                        llllllllllllllllllIllllIllllIIlI = new ArrayList();
                        if (v.lIIlllIllIlII(llllllllllllllllllIllllIllllIIll.isEmpty() ? 1 : 0)) {
                            llllllllllllllllllIllllIllllIIIl = lIlllIlIIl[1];
                            while (v.lIIlllIllIIll(llllllllllllllllllIllllIllllIIIl, llllllllllllllllllIllllIllllIIll.size())) {
                                llllllllllllllllllIllllIllllIIlI.add(((Widget)llllllllllllllllllIllllIllllIIll.get(llllllllllllllllllIllllIllllIIIl)).getText());
                                "".length();
                                ++llllllllllllllllllIllllIllllIIIl;
                                "".length();
                                if ("   ".length() >= 0) continue;
                                return;
                            }
                            llllllllllllllllllIllllIllllIIIl = llllllllllllllllllIllllIllllIIlI.stream().anyMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[86]])) ? 1 : 0;
                            int n4 = llllllllllllllllllIllllIllllIIlI.stream().noneMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[85]]));
                            if (v.lIIlllIllIIlI(llllllllllllllllllIllllIllllIIIl) && v.lIIlllIllIIlI(n4)) {
                                System.out.println(lIlllIIlll[lIlllIlIIl[39]]);
                            }
                        }
                    }
                }
                if (v.lIIlllIllIlII(dp ? 1 : 0) && v.lIIlllIllIIlI(do ? 1 : 0) && v.lIIlllIllIIlI(dn ? 1 : 0) && v.lIIlllIllIIlI(dm ? 1 : 0)) {
                    if (v.lIIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dw), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[40]];
                        Movement.walkTo((WorldPoint)dw);
                        "".length();
                        Time.sleepTicks((int)lIlllIlIIl[0]);
                        "".length();
                    }
                    if (v.lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dw), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[41]];
                        g.a(lIlllIIlll[lIlllIlIIl[42]], cy, lIlllIlIIl[0]);
                        Time.sleepTicks((int)lIlllIlIIl[0]);
                        "".length();
                        llllllllllllllllllIllllIllllIIll = Dialog.getOptions();
                        llllllllllllllllllIllllIllllIIlI = new ArrayList();
                        if (v.lIIlllIllIlII(llllllllllllllllllIllllIllllIIll.isEmpty() ? 1 : 0)) {
                            llllllllllllllllllIllllIllllIIIl = lIlllIlIIl[1];
                            while (v.lIIlllIllIIll(llllllllllllllllllIllllIllllIIIl, llllllllllllllllllIllllIllllIIll.size())) {
                                llllllllllllllllllIllllIllllIIlI.add(((Widget)llllllllllllllllllIllllIllllIIll.get(llllllllllllllllllIllllIllllIIIl)).getText());
                                "".length();
                                ++llllllllllllllllllIllllIllllIIIl;
                                "".length();
                                if (((0x83 ^ 0x94 ^ (0x14 ^ 0x25)) & (125 + 41 - 83 + 81 ^ 104 + 120 - 162 + 68 ^ -" ".length())) <= 0) continue;
                                return;
                            }
                            llllllllllllllllllIllllIllllIIIl = llllllllllllllllllIllllIllllIIlI.stream().anyMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[84]])) ? 1 : 0;
                            int n5 = llllllllllllllllllIllllIllllIIlI.stream().noneMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[83]]));
                            if (v.lIIlllIllIIlI(llllllllllllllllllIllllIllllIIIl) && v.lIIlllIllIIlI(n5)) {
                                System.out.println(lIlllIIlll[lIlllIlIIl[43]]);
                            }
                        }
                    }
                }
                if (v.lIIlllIllIlII(dq ? 1 : 0) && v.lIIlllIllIIlI(dp ? 1 : 0) && v.lIIlllIllIIlI(do ? 1 : 0) && v.lIIlllIllIIlI(dn ? 1 : 0) && v.lIIlllIllIIlI(dm ? 1 : 0)) {
                    if (v.lIIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dx), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[44]];
                        Movement.walkTo((WorldPoint)dx);
                        "".length();
                        Time.sleepTicks((int)lIlllIlIIl[0]);
                        "".length();
                    }
                    if (v.lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dx), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[45]];
                        g.a(lIlllIIlll[lIlllIlIIl[46]], cy, lIlllIlIIl[0]);
                        Time.sleepTicks((int)lIlllIlIIl[0]);
                        "".length();
                        llllllllllllllllllIllllIllllIIll = Dialog.getOptions();
                        llllllllllllllllllIllllIllllIIlI = new ArrayList();
                        if (v.lIIlllIllIlII(llllllllllllllllllIllllIllllIIll.isEmpty() ? 1 : 0)) {
                            llllllllllllllllllIllllIllllIIIl = lIlllIlIIl[1];
                            while (v.lIIlllIllIIll(llllllllllllllllllIllllIllllIIIl, llllllllllllllllllIllllIllllIIll.size())) {
                                llllllllllllllllllIllllIllllIIlI.add(((Widget)llllllllllllllllllIllllIllllIIll.get(llllllllllllllllllIllllIllllIIIl)).getText());
                                "".length();
                                ++llllllllllllllllllIllllIllllIIIl;
                                "".length();
                                if (((2 ^ 0x14) & ~(0x9B ^ 0x8D)) == 0) continue;
                                return;
                            }
                            llllllllllllllllllIllllIllllIIIl = llllllllllllllllllIllllIllllIIlI.stream().anyMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[16]])) ? 1 : 0;
                            int n6 = llllllllllllllllllIllllIllllIIlI.stream().anyMatch(string -> string.contains(lIlllIIlll[lIlllIlIIl[82]]));
                            int n7 = llllllllllllllllllIllllIllllIIlI.stream().noneMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[81]]));
                            if ((!v.lIIlllIllIlII(llllllllllllllllllIllllIllllIIIl) || v.lIIlllIllIIlI(n6)) && v.lIIlllIllIIlI(n7)) {
                                System.out.println(lIlllIIlll[lIlllIlIIl[47]]);
                            }
                        }
                    }
                }
            }
            if (v.lIIlllIllIllI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[5])) {
                if (v.lIIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(ds), lIlllIlIIl[5])) {
                    AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[48]];
                    if (v.lIIlllIllIIlI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    e.a(ds);
                }
                if (v.lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(ds), lIlllIlIIl[5])) {
                    AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[49]];
                    g.a(lIlllIIlll[lIlllIlIIl[50]], cy);
                }
            }
            if (!v.lIIlllIlllIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[10]) || v.lIIlllIllIllI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[17])) {
                g.a(cy);
            }
            if (v.lIIlllIllIllI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[6])) {
                if (v.lIIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dy), lIlllIlIIl[6])) {
                    AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[51]];
                    Movement.walkTo((WorldPoint)dy);
                    "".length();
                    Time.sleepTicks((int)lIlllIlIIl[0]);
                    "".length();
                }
                if (v.lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dy), lIlllIlIIl[6])) {
                    String[] stringArray = new String[lIlllIlIIl[0]];
                    stringArray[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[52]];
                    if (v.lIIlllIllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray7 = new String[lIlllIlIIl[0]];
                        stringArray7[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[53]];
                        Inventory.getFirst((String[])stringArray7).interact(lIlllIIlll[lIlllIlIIl[54]]);
                        Time.sleepTicks((int)lIlllIlIIl[10]);
                        "".length();
                    }
                }
            }
            if (v.lIIlllIllIllI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[13])) {
                if (v.lIIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(ds), lIlllIlIIl[5])) {
                    AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[55]];
                    e.a(ds);
                }
                if (v.lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(ds), lIlllIlIIl[5])) {
                    AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[56]];
                    g.a(lIlllIIlll[lIlllIlIIl[57]], cy);
                }
            }
            if (!v.lIIlllIlllIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[18]) || v.lIIlllIllIllI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[2])) {
                if (v.lIIlllIllIIll(dc, lIlllIlIIl[0])) {
                    Z.nu += lIlllIlIIl[0];
                    Z.p(AccBuilderShamans.m);
                    dc += lIlllIlIIl[0];
                    Z.nu = lIlllIlIIl[1];
                    dd = lIlllIlIIl[1];
                }
                String[] stringArray = new String[lIlllIlIIl[0]];
                stringArray[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[58]];
                if (v.lIIlllIllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (v.lIIlllIllIlll(Widgets.get((int)lIlllIlIIl[59]))) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[60]];
                        String[] stringArray8 = new String[lIlllIlIIl[0]];
                        stringArray8[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[61]];
                        Inventory.getFirst((String[])stringArray8).interact(lIlllIIlll[lIlllIlIIl[62]]);
                        Time.sleepTicks((int)lIlllIlIIl[6]);
                        "".length();
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[63]];
                        llllllllllllllllllIllllIllllIIll = Widgets.get((int)lIlllIlIIl[59], (int)lIlllIlIIl[27]);
                        if (v.lIIlllIllIlll(llllllllllllllllllIllllIllllIIll)) {
                            llllllllllllllllllIllllIllllIIll.interact(lIlllIIlll[lIlllIlIIl[64]]);
                            Time.sleepTicks((int)lIlllIlIIl[0]);
                            "".length();
                        }
                        if (v.lIIlllIllIlll(llllllllllllllllllIllllIllllIIlI = Widgets.get((int)lIlllIlIIl[59], (int)lIlllIlIIl[39]))) {
                            llllllllllllllllllIllllIllllIIlI.interact(lIlllIIlll[lIlllIlIIl[65]]);
                            Time.sleepTicks((int)lIlllIlIIl[5]);
                            "".length();
                        }
                    }
                    Time.sleepTicks((int)lIlllIlIIl[0]);
                    "".length();
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean al() {
        int n2;
        String[] stringArray = new String[lIlllIlIIl[0]];
        stringArray[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[73]];
        if (v.lIIlllIlllIII(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[lIlllIlIIl[0]];
            nArray[v.lIlllIlIIl[1]] = lIlllIlIIl[7];
            if (v.lIIlllIlllIII(Inventory.getCount((int[])nArray)) && v.lIIlllIlllIII(Inventory.getCount((int[])f.aU))) {
                int[] nArray2 = new int[lIlllIlIIl[0]];
                nArray2[v.lIlllIlIIl[1]] = lIlllIlIIl[8];
                if (v.lIIlllIlllIII(Inventory.getCount((int[])nArray2))) {
                    n2 = lIlllIlIIl[0];
                    "".length();
                    if ("   ".length() >= "   ".length()) return n2 != 0;
                    return ((0x74 ^ 0x65 ^ (0x16 ^ 0x57)) & (164 + 197 - 311 + 166 ^ 104 + 109 - 168 + 91 ^ -" ".length())) != 0;
                }
            }
        }
        n2 = lIlllIlIIl[1];
        return n2 != 0;
    }

    @Override
    public String ae() {
        return lIlllIIlll[lIlllIlIIl[78]];
    }
}

