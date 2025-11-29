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
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.J_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.Z_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.f_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.g_Unknown;
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
public class v_Unknown
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
        v.lIlllIlIIl[0] = 1;
        v.lIlllIlIIl[1] = (0x71 ^ 0x6E ^ (0x50 ^ 0x71)) & (154 + 182 - 164 + 17 ^ 75 + 70 - 35 + 21 ^ -1);
        v.lIlllIlIIl[2] = 0xE4 ^ 0xC4 ^ (0xA9 ^ 0x81);
        v.lIlllIlIIl[3] = -(0xFFFF9DF7 & 0x679F) & (0xFFFFDFB7 & 0x7FFE);
        v.lIlllIlIIl[4] = -(0xFFFFA535 & 0x7EEB) & (0xFFFFBFFD & 0x77AA);
        v.lIlllIlIIl[5] = 2;
        v.lIlllIlIIl[6] = 95 + 91 - 171 + 141 ^ 67 + 95 - 104 + 94;
        v.lIlllIlIIl[7] = 0xFFFFDF5F & 0x3FE7;
        v.lIlllIlIIl[8] = 0xFFFFFF7B & 0x1FCD;
        v.lIlllIlIIl[9] = 0xFFFFDD3A & 0x23FF;
        v.lIlllIlIIl[10] = 3;
        v.lIlllIlIIl[11] = 0xFFFFB1D1 & 0x7F7F;
        v.lIlllIlIIl[12] = 0x33 ^ 0x39;
        v.lIlllIlIIl[13] = 0xB1 ^ 0x99 ^ (0x96 ^ 0xBB);
        v.lIlllIlIIl[14] = -(0xFFFFAB9D & 0x7667) & (0xFFFFBFFF & 0x637F);
        v.lIlllIlIIl[15] = 0x75 ^ 0x79;
        v.lIlllIlIIl[16] = 0x2E ^ 0x4E ^ (0xE0 ^ 0xC1);
        v.lIlllIlIIl[17] = 7 + 88 - 51 + 149 ^ 99 + 152 - 131 + 79;
        v.lIlllIlIIl[18] = 0x11 ^ 0x17 ^ 1;
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
        d var14;
        Object var11;
        int[] nArray = new int[lIlllIlIIl[0]];
        nArray[v.lIlllIlIIl[1]] = lIlllIlIIl[9];
        if (v.lIIlllIllIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIlllIlIIl[9], lIlllIlIIl[12], lIlllIlIIl[74]);
            bp.add(d2);
            0;
        }
        int[] nArray2 = new int[lIlllIlIIl[0]];
        nArray2[v.lIlllIlIIl[1]] = lIlllIlIIl[11];
        if (v.lIIlllIllIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var11 = new d(lIlllIlIIl[11], lIlllIlIIl[13], j.bZ);
            bp.add((d)var11);
            0;
        }
        if (v.lIIlllIllIlII(Bank.contains(var11 = item -> item.getName().toLowerCase().contains(lIlllIIlll[lIlllIlIIl[80]])) ? 1 : 0)) {
            var14 = new d(lIlllIlIIl[75], lIlllIlIIl[13], lIlllIlIIl[76]);
            bp.add(var14);
            0;
        }
        int[] nArray3 = new int[lIlllIlIIl[0]];
        nArray3[v.lIlllIlIIl[1]] = lIlllIlIIl[7];
        if (v.lIIlllIllIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var14 = new d(lIlllIlIIl[7], lIlllIlIIl[53], lIlllIlIIl[74]);
            bp.add(var14);
            0;
        }
        int[] nArray4 = new int[lIlllIlIIl[0]];
        nArray4[v.lIlllIlIIl[1]] = lIlllIlIIl[8];
        if (v.lIIlllIllIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var14 = new d(lIlllIlIIl[8], lIlllIlIIl[12], lIlllIlIIl[74]);
            bp.add(var14);
            0;
        }
    }

    private static boolean lIIlllIllIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlllIlllIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIIlllIlIIIIl(String var3, String var23) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var6 = var23.toCharArray();
        int var2 = lIlllIlIIl[1];
        char[] var8 = var3.toCharArray();
        int var9 = var8.length;
        int var1 = lIlllIlIIl[1];
        while (v.lIIlllIllIIll(var1, var9)) {
            char var17 = var8[var1];
            var7.append((char)(var17 ^ var6[var2 % var6.length]));
            0;
            ++var2;
            ++var1;
            0;
            if (((87 + 109 - 113 + 67 ^ 88 + 164 - 198 + 128) & (0x36 ^ 0x5F ^ (0x8E ^ 0xC7) ^ -1)) <= 0) continue;
            return null;
        }
        return String.valueOf(var7);
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
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 > (0x91 ^ 0xA2 ^ (0x28 ^ 0x1F))) {
            return (0xE7 ^ 0xB1 ^ (0x6D ^ 0x2F)) & (0x98 ^ 0x96 ^ (0x4F ^ 0x55) ^ -1);
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
                0;
                if (((0x48 ^ 1) & ~(0x79 ^ 0x30)) >= 0) return n2 != 0;
                return false;
            }
        }
        n2 = lIlllIlIIl[1];
        return n2 != 0;
    }

    private static String lIIlllIlIIIII(String var21, String var18) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(lIlllIlIIl[5], var4);
            return new String(var10.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static void lIIlllIllIIII() {
        lIlllIIlll = new String[lIlllIlIIl[125]];
        v.lIlllIIlll[v.lIlllIlIIl[1]] = v."Finished buying items, switching back to quest";
        v.lIlllIIlll[v.lIlllIlIIl[0]] = v."Nav to bank";
        v.lIlllIIlll[v.lIlllIlIIl[5]] = v."Handling banking";
        v.lIlllIIlll[v.lIlllIlIIl[10]] = v."We are missing quest supplies, switching to BUYING";
        v.lIlllIIlll[v.lIlllIlIIl[6]] = v."Eat";
        v.lIlllIIlll[v.lIlllIlIIl[13]] = v."Drink";
        v.lIlllIIlll[v.lIlllIlIIl[17]] = v."Nav to start";
        v.lIlllIIlll[v.lIlllIlIIl[18]] = v."Starting quest";
        v.lIlllIIlll[v.lIlllIlIIl[2]] = v."Veos";
        v.lIlllIIlll[v.lIlllIlIIl[24]] = v."Enchanted scroll";
        v.lIlllIIlll[v.lIlllIlIIl[12]] = v."Feather";
        v.lIlllIIlll[v.lIlllIlIIl[25]] = v."Enchanted quill";
        v.lIlllIIlll[v.lIlllIlIIl[15]] = v."Enchanted scroll";
        v.lIlllIIlll[v.lIlllIlIIl[26]] = v."Feather";
        v.lIlllIIlll[v.lIlllIlIIl[27]] = v."Enchanted quill";
        v.lIlllIIlll[v.lIlllIlIIl[28]] = v."Nav to pisc tile";
        v.lIlllIIlll[v.lIlllIlIIl[29]] = v."Talking pisc";
        v.lIlllIIlll[v.lIlllIlIIl[30]] = v."Leenz";
        v.lIlllIIlll[v.lIlllIlIIl[31]] = v."Finished pisc";
        v.lIlllIIlll[v.lIlllIlIIl[32]] = v."Nav to arc tile";
        v.lIlllIIlll[v.lIlllIlIIl[33]] = v."Talking arc";
        v.lIlllIIlll[v.lIlllIlIIl[34]] = v."Regath";
        v.lIlllIIlll[v.lIlllIlIIl[35]] = v."Finished arc";
        v.lIlllIIlll[v.lIlllIlIIl[36]] = v."Nav to lova tile";
        v.lIlllIIlll[v.lIlllIlIIl[37]] = v."Talking lova";
        v.lIlllIIlll[v.lIlllIlIIl[38]] = v."Munty";
        v.lIlllIIlll[v.lIlllIlIIl[39]] = v."Finished munty";
        v.lIlllIIlll[v.lIlllIlIIl[40]] = v."Nav to shyzien tile";
        v.lIlllIIlll[v.lIlllIlIIl[41]] = v."Talking shyzien";
        v.lIlllIIlll[v.lIlllIlIIl[42]] = v."Jennifer";
        v.lIlllIIlll[v.lIlllIlIIl[43]] = v."Finished shyzien";
        v.lIlllIIlll[v.lIlllIlIIl[44]] = v."Nav to hosidius tile";
        v.lIlllIIlll[v.lIlllIlIIl[45]] = v."Talking hosidius";
        v.lIlllIIlll[v.lIlllIlIIl[46]] = v."Horace";
        v.lIlllIIlll[v.lIlllIlIIl[47]] = v."Finished hosidius";
        v.lIlllIIlll[v.lIlllIlIIl[48]] = v."Nav to start";
        v.lIlllIIlll[v.lIlllIlIIl[49]] = v."talking veos";
        v.lIlllIIlll[v.lIlllIlIIl[50]] = v."Veos";
        v.lIlllIIlll[v.lIlllIlIIl[51]] = v."Nav to dark altar";
        v.lIlllIIlll[v.lIlllIlIIl[52]] = v."Mysterious orb";
        v.lIlllIIlll[v.lIlllIlIIl[53]] = v."Mysterious orb";
        v.lIlllIIlll[v.lIlllIlIIl[54]] = v."Activate";
        v.lIlllIIlll[v.lIlllIlIIl[55]] = v."Nav to start";
        v.lIlllIIlll[v.lIlllIlIIl[56]] = v."talking veos";
        v.lIlllIIlll[v.lIlllIlIIl[57]] = v."Veos";
        v.lIlllIIlll[v.lIlllIlIIl[58]] = v."Antique lamp";
        v.lIlllIIlll[v.lIlllIlIIl[60]] = v."Rubbing lamp";
        v.lIlllIIlll[v.lIlllIlIIl[61]] = v."Antique lamp";
        v.lIlllIIlll[v.lIlllIlIIl[62]] = v."Rub";
        v.lIlllIIlll[v.lIlllIlIIl[63]] = v."Selecting slayer";
        v.lIlllIIlll[v.lIlllIlIIl[64]] = v."Slayer";
        v.lIlllIIlll[v.lIlllIlIIl[65]] = v."Confirm";
        v.lIlllIIlll[v.lIlllIlIIl[66]] = v."Antique lamp";
        v.lIlllIIlll[v.lIlllIlIIl[67]] = v."Rubbing lamp";
        v.lIlllIIlll[v.lIlllIlIIl[68]] = v."Antique lamp";
        v.lIlllIIlll[v.lIlllIlIIl[69]] = v."Rub";
        v.lIlllIIlll[v.lIlllIlIIl[70]] = v."Selecting slayer";
        v.lIlllIIlll[v.lIlllIlIIl[71]] = v."Slayer";
        v.lIlllIIlll[v.lIlllIlIIl[72]] = v."Confirm";
        v.lIlllIIlll[v.lIlllIlIIl[73]] = v."Feather";
        v.lIlllIIlll[v.lIlllIlIIl[78]] = v."Client of Kourend";
        v.lIlllIIlll[v.lIlllIlIIl[79]] = v."Antique lamp";
        v.lIlllIIlll[v.lIlllIlIIl[80]] = v."ring of wealth (";
        v.lIlllIIlll[v.lIlllIlIIl[81]] = v."Can I ask you about Hosidius?";
        v.lIlllIIlll[v.lIlllIlIIl[82]] = v."let's trade.";
        v.lIlllIIlll[v.lIlllIlIIl[16]] = v."Let's trade.";
        v.lIlllIIlll[v.lIlllIlIIl[83]] = v."Can I ask you about Shayzien?";
        v.lIlllIIlll[v.lIlllIlIIl[84]] = v."Let's trade.";
        v.lIlllIIlll[v.lIlllIlIIl[85]] = v."Can I ask you about Lovakengj?";
        v.lIlllIIlll[v.lIlllIlIIl[86]] = v."Let's trade.";
        v.lIlllIIlll[v.lIlllIlIIl[87]] = v."Can I ask you about Arceuus?";
        v.lIlllIIlll[v.lIlllIlIIl[88]] = v."I don't need anything.";
        v.lIlllIIlll[v.lIlllIlIIl[89]] = v."Can I ask you about Port Piscarilius?";
        v.lIlllIIlll[v.lIlllIlIIl[90]] = v."I don't need anything right now.";
        v.lIlllIIlll[v.lIlllIlIIl[105]] = v."Have you got any quests for me?";
        v.lIlllIIlll[v.lIlllIlIIl[106]] = v."Yes.";
        v.lIlllIIlll[v.lIlllIlIIl[107]] = v."yes.";
        v.lIlllIIlll[v.lIlllIlIIl[108]] = v."Can I ask you about Port Piscarilius?";
        v.lIlllIIlll[v.lIlllIlIIl[109]] = v."Why should I gain favour with Port Piscarilius?";
        v.lIlllIIlll[v.lIlllIlIIl[110]] = v."Can I ask you about Port Arceuus?";
        v.lIlllIIlll[v.lIlllIlIIl[111]] = v."Can I ask you about Arceuus?";
        v.lIlllIIlll[v.lIlllIlIIl[112]] = v."Why should I gain favour with Arceuus?";
        v.lIlllIIlll[v.lIlllIlIIl[113]] = v."Can I ask you about Lovakengj?";
        v.lIlllIIlll[v.lIlllIlIIl[114]] = v."Why should I gain favour with Lovakengj?";
        v.lIlllIIlll[v.lIlllIlIIl[115]] = v."Can I ask you about Shayzien?";
        v.lIlllIIlll[v.lIlllIlIIl[116]] = v."Why should I gain favour with Shayzien?";
        v.lIlllIIlll[v.lIlllIlIIl[117]] = v."Can I ask you about Hosidius?";
        v.lIlllIIlll[v.lIlllIlIIl[118]] = v."Why should I gain favour with Hosidius?";
        v.lIlllIIlll[v.lIlllIlIIl[119]] = v."What is there to do in Port Piscarilius?";
        v.lIlllIIlll[v.lIlllIlIIl[120]] = v."What is there to do in Arceuus?";
        v.lIlllIIlll[v.lIlllIlIIl[121]] = v."What is there to do in Lovakengj?";
        v.lIlllIIlll[v.lIlllIlIIl[122]] = v."What is there to do in Shayzien?";
        v.lIlllIIlll[v.lIlllIlIIl[123]] = v."What is there to do in Hosidius?";
        v.lIlllIIlll[v.lIlllIlIIl[124]] = v."Let's talk about your client...";
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
                Widget var25;
                AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[67]];
                String[] stringArray2 = new String[lIlllIlIIl[0]];
                stringArray2[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[68]];
                Inventory.getFirst((String[])stringArray2).interact(lIlllIIlll[lIlllIlIIl[69]]);
                Time.sleepTicks((int)lIlllIlIIl[6]);
                0;
                AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[70]];
                Widget widget = Widgets.get((int)lIlllIlIIl[59], (int)lIlllIlIIl[27]);
                if (v.lIIlllIllIlll(widget)) {
                    widget.interact(lIlllIIlll[lIlllIlIIl[71]]);
                    Time.sleepTicks((int)lIlllIlIIl[0]);
                    0;
                }
                if (v.lIIlllIllIlll(var25 = Widgets.get((int)lIlllIlIIl[59], (int)lIlllIlIIl[39]))) {
                    var25.interact(lIlllIIlll[lIlllIlIIl[72]]);
                    Time.sleepTicks((int)lIlllIlIIl[5]);
                    0;
                }
            }
            Time.sleepTicks((int)lIlllIlIIl[0]);
            0;
        }
    }

    private static String lIIlllIIlllll(String var22, String var20) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), lIlllIlIIl[2]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(lIlllIlIIl[5], var16);
            return new String(var12.doFinal(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    public static void bf() {
        block80: {
            Widget var15;
            Object var24;
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
                    var24 = BankLocation.getNearest();
                    if (v.lIIlllIllIlll(var24) && v.lIIlllIllIlII(var24.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[0]];
                        a.a((BankLocation)var24);
                    }
                    if (v.lIIlllIllIlll(var24) && v.lIIlllIllIIlI(var24.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (v.lIIlllIllIlII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIlllIlIIl[4]);
                            0;
                        }
                        if (v.lIIlllIllIIlI(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[5]];
                            if (v.lIIlllIlllIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIlllIlIIl[6]);
                                0;
                            }
                            if (v.lIIlllIlllIII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIlllIlIIl[5]);
                                0;
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
                0;
            }
            if (v.lIIlllIllIIlI(Inventory.contains((int[])f.aU) ? 1 : 0) && v.lIIlllIllIIll(Movement.getRunEnergy(), lIlllIlIIl[16])) {
                Inventory.getFirst((int[])f.aU).interact(lIlllIIlll[lIlllIlIIl[13]]);
                Time.sleepTicks((int)lIlllIlIIl[0]);
                0;
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
                int var19;
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
                                0;
                            }
                        }
                    }
                    String[] stringArray6 = new String[lIlllIlIIl[0]];
                    stringArray6[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[27]];
                    if (v.lIIlllIllIIlI(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                        if (v.lIIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dt), lIlllIlIIl[2])) {
                            AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[28]];
                            Movement.walkTo((WorldPoint)dt);
                            0;
                            Time.sleepTicks((int)lIlllIlIIl[0]);
                            0;
                        }
                        if (v.lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dt), lIlllIlIIl[2])) {
                            AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[29]];
                            g.a(lIlllIIlll[lIlllIlIIl[30]], cy, lIlllIlIIl[0]);
                            Time.sleepTicks((int)lIlllIlIIl[0]);
                            0;
                            var24 = Dialog.getOptions();
                            var15 = new ArrayList();
                            if (v.lIIlllIllIlII(var24.isEmpty() ? 1 : 0)) {
                                var19 = lIlllIlIIl[1];
                                while (v.lIIlllIllIIll(var19, var24.size())) {
                                    var15.add(((Widget)var24.get(var19)).getText());
                                    0;
                                    ++var19;
                                    0;
                                    if (((0x90 ^ 0xAA) & ~(0x14 ^ 0x2E)) >= -1) continue;
                                    return;
                                }
                                var19 = var15.stream().anyMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[90]])) ? 1 : 0;
                                int n2 = var15.stream().noneMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[89]]));
                                if (v.lIIlllIllIIlI(var19) && v.lIIlllIllIIlI(n2)) {
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
                        0;
                        Time.sleepTicks((int)lIlllIlIIl[0]);
                        0;
                    }
                    if (v.lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(du), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[33]];
                        g.a(lIlllIIlll[lIlllIlIIl[34]], cy, lIlllIlIIl[0]);
                        Time.sleepTicks((int)lIlllIlIIl[0]);
                        0;
                        var24 = Dialog.getOptions();
                        var15 = new ArrayList();
                        if (v.lIIlllIllIlII(var24.isEmpty() ? 1 : 0)) {
                            var19 = lIlllIlIIl[1];
                            while (v.lIIlllIllIIll(var19, var24.size())) {
                                var15.add(((Widget)var24.get(var19)).getText());
                                0;
                                ++var19;
                                0;
                                if (((0x15 ^ 0x27) & ~(0x6D ^ 0x5F)) == 0) continue;
                                return;
                            }
                            var19 = var15.stream().anyMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[88]])) ? 1 : 0;
                            int n3 = var15.stream().noneMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[87]]));
                            if (v.lIIlllIllIIlI(var19) && v.lIIlllIllIIlI(n3)) {
                                System.out.println(lIlllIIlll[lIlllIlIIl[35]]);
                            }
                        }
                    }
                }
                if (v.lIIlllIllIlII(do ? 1 : 0) && v.lIIlllIllIIlI(dn ? 1 : 0) && v.lIIlllIllIIlI(dm ? 1 : 0)) {
                    if (v.lIIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dv), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[36]];
                        Movement.walkTo((WorldPoint)dv);
                        0;
                        Time.sleepTicks((int)lIlllIlIIl[0]);
                        0;
                    }
                    if (v.lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dv), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[37]];
                        g.a(lIlllIIlll[lIlllIlIIl[38]], cy, lIlllIlIIl[0]);
                        Time.sleepTicks((int)lIlllIlIIl[0]);
                        0;
                        var24 = Dialog.getOptions();
                        var15 = new ArrayList();
                        if (v.lIIlllIllIlII(var24.isEmpty() ? 1 : 0)) {
                            var19 = lIlllIlIIl[1];
                            while (v.lIIlllIllIIll(var19, var24.size())) {
                                var15.add(((Widget)var24.get(var19)).getText());
                                0;
                                ++var19;
                                0;
                                if (3 >= 0) continue;
                                return;
                            }
                            var19 = var15.stream().anyMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[86]])) ? 1 : 0;
                            int n4 = var15.stream().noneMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[85]]));
                            if (v.lIIlllIllIIlI(var19) && v.lIIlllIllIIlI(n4)) {
                                System.out.println(lIlllIIlll[lIlllIlIIl[39]]);
                            }
                        }
                    }
                }
                if (v.lIIlllIllIlII(dp ? 1 : 0) && v.lIIlllIllIIlI(do ? 1 : 0) && v.lIIlllIllIIlI(dn ? 1 : 0) && v.lIIlllIllIIlI(dm ? 1 : 0)) {
                    if (v.lIIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dw), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[40]];
                        Movement.walkTo((WorldPoint)dw);
                        0;
                        Time.sleepTicks((int)lIlllIlIIl[0]);
                        0;
                    }
                    if (v.lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dw), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[41]];
                        g.a(lIlllIIlll[lIlllIlIIl[42]], cy, lIlllIlIIl[0]);
                        Time.sleepTicks((int)lIlllIlIIl[0]);
                        0;
                        var24 = Dialog.getOptions();
                        var15 = new ArrayList();
                        if (v.lIIlllIllIlII(var24.isEmpty() ? 1 : 0)) {
                            var19 = lIlllIlIIl[1];
                            while (v.lIIlllIllIIll(var19, var24.size())) {
                                var15.add(((Widget)var24.get(var19)).getText());
                                0;
                                ++var19;
                                0;
                                if (((0x83 ^ 0x94 ^ (0x14 ^ 0x25)) & (125 + 41 - 83 + 81 ^ 104 + 120 - 162 + 68 ^ -1)) <= 0) continue;
                                return;
                            }
                            var19 = var15.stream().anyMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[84]])) ? 1 : 0;
                            int n5 = var15.stream().noneMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[83]]));
                            if (v.lIIlllIllIIlI(var19) && v.lIIlllIllIIlI(n5)) {
                                System.out.println(lIlllIIlll[lIlllIlIIl[43]]);
                            }
                        }
                    }
                }
                if (v.lIIlllIllIlII(dq ? 1 : 0) && v.lIIlllIllIIlI(dp ? 1 : 0) && v.lIIlllIllIIlI(do ? 1 : 0) && v.lIIlllIllIIlI(dn ? 1 : 0) && v.lIIlllIllIIlI(dm ? 1 : 0)) {
                    if (v.lIIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dx), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[44]];
                        Movement.walkTo((WorldPoint)dx);
                        0;
                        Time.sleepTicks((int)lIlllIlIIl[0]);
                        0;
                    }
                    if (v.lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dx), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[45]];
                        g.a(lIlllIIlll[lIlllIlIIl[46]], cy, lIlllIlIIl[0]);
                        Time.sleepTicks((int)lIlllIlIIl[0]);
                        0;
                        var24 = Dialog.getOptions();
                        var15 = new ArrayList();
                        if (v.lIIlllIllIlII(var24.isEmpty() ? 1 : 0)) {
                            var19 = lIlllIlIIl[1];
                            while (v.lIIlllIllIIll(var19, var24.size())) {
                                var15.add(((Widget)var24.get(var19)).getText());
                                0;
                                ++var19;
                                0;
                                if (((2 ^ 0x14) & ~(0x9B ^ 0x8D)) == 0) continue;
                                return;
                            }
                            var19 = var15.stream().anyMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[16]])) ? 1 : 0;
                            int n6 = var15.stream().anyMatch(string -> string.contains(lIlllIIlll[lIlllIlIIl[82]]));
                            int n7 = var15.stream().noneMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[81]]));
                            if ((!v.lIIlllIllIlII(var19) || v.lIIlllIllIIlI(n6)) && v.lIIlllIllIIlI(n7)) {
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
                    0;
                    Time.sleepTicks((int)lIlllIlIIl[0]);
                    0;
                }
                if (v.lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dy), lIlllIlIIl[6])) {
                    String[] stringArray = new String[lIlllIlIIl[0]];
                    stringArray[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[52]];
                    if (v.lIIlllIllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray7 = new String[lIlllIlIIl[0]];
                        stringArray7[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[53]];
                        Inventory.getFirst((String[])stringArray7).interact(lIlllIIlll[lIlllIlIIl[54]]);
                        Time.sleepTicks((int)lIlllIlIIl[10]);
                        0;
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
                        0;
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[63]];
                        var24 = Widgets.get((int)lIlllIlIIl[59], (int)lIlllIlIIl[27]);
                        if (v.lIIlllIllIlll(var24)) {
                            var24.interact(lIlllIIlll[lIlllIlIIl[64]]);
                            Time.sleepTicks((int)lIlllIlIIl[0]);
                            0;
                        }
                        if (v.lIIlllIllIlll(var15 = Widgets.get((int)lIlllIlIIl[59], (int)lIlllIlIIl[39]))) {
                            var15.interact(lIlllIIlll[lIlllIlIIl[65]]);
                            Time.sleepTicks((int)lIlllIlIIl[5]);
                            0;
                        }
                    }
                    Time.sleepTicks((int)lIlllIlIIl[0]);
                    0;
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
                    0;
                    if (3 >= 3) return n2 != 0;
                    return ((0x74 ^ 0x65 ^ (0x16 ^ 0x57)) & (164 + 197 - 311 + 166 ^ 104 + 109 - 168 + 91 ^ -1)) != 0;
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

