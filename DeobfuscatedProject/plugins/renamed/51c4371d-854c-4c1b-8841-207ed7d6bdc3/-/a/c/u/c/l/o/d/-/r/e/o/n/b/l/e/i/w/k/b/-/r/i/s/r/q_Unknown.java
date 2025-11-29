/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 */
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.B_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.M_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.P_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.Q_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.a_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.b_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.d;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.f_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.g_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.i;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.m_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.n_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.p_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.r_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.t_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.v_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.x_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.y_Unknown;
import gg.squire.account.AccBuilderBarrows;
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
import net.runelite.api.Locatable;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;

public class q_Unknown
implements F {
    private static /* synthetic */ int cq;
    static /* synthetic */ WorldArea cl;
    public static /* synthetic */ boolean bz;
    private static /* synthetic */ String[] bX;
    static /* synthetic */ WorldArea cn;
    private static /* synthetic */ int[] llIllIIl;
    private static /* synthetic */ String cr;
    static /* synthetic */ boolean cj;
    static /* synthetic */ WorldPoint ce;
    private static /* synthetic */ String[] llIllIII;
    public static /* synthetic */ List<d> bB;
    static /* synthetic */ WorldPoint co;
    static /* synthetic */ WorldArea cm;
    static /* synthetic */ int ci;
    static /* synthetic */ WorldPoint cp;

    @Override
    public String V() {
        if (q.lIllIlllIll(cr, llIllIII[llIllIIl[159]])) {
            return llIllIII[llIllIIl[160]];
        }
        return "Animal Magnetism - " + cr;
    }

    @Override
    public boolean T() {
        return llIllIIl[1];
    }

    @Override
    public boolean W() {
        boolean bl;
        if (q.lIllIllIlII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[2])) {
            bl = llIllIIl[0];
            0;
            if (-3 > 0) {
                return false;
            }
        } else {
            bl = llIllIIl[1];
        }
        return bl;
    }

    private static boolean lIllIllIlll(int n2) {
        return n2 < 0;
    }

    private static boolean lIllIlllIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIllIllIIII(int n2) {
        return n2 != 0;
    }

    private static String lIllIIllllI(String lIlIIIllllllIll, String lIlIIIlllllllII) {
        try {
            SecretKeySpec lIlIIlIIIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIIlllllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIIIlllllllll = Cipher.getInstance("Blowfish");
            lIlIIIlllllllll.init(llIllIIl[9], lIlIIlIIIIIIIII);
            return new String(lIlIIIlllllllll.doFinal(Base64.getDecoder().decode(lIlIIIllllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIIllllllllI) {
            lIlIIIllllllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIllIIlI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean ac() {
        void lIlIIlIIIllIIIl;
        int[] nArray = new int[llIllIIl[20]];
        nArray[q.llIllIIl[1]] = llIllIIl[36];
        nArray[q.llIllIIl[0]] = llIllIIl[37];
        nArray[q.llIllIIl[9]] = llIllIIl[34];
        nArray[q.llIllIIl[11]] = llIllIIl[40];
        nArray[q.llIllIIl[13]] = llIllIIl[41];
        nArray[q.llIllIIl[8]] = llIllIIl[30];
        nArray[q.llIllIIl[16]] = llIllIIl[31];
        int[] nArray2 = nArray;
        int lIlIIlIIIllIIII = llIllIIl[1];
        while (q.lIllIllIIIl(lIlIIlIIIllIIII, ((void)lIlIIlIIIllIIIl).length)) {
            int[] nArray3 = new int[llIllIIl[0]];
            nArray3[q.llIllIIl[1]] = lIlIIlIIIllIIIl[lIlIIlIIIllIIII];
            if (q.lIllIllIIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return llIllIIl[1];
            }
            ++lIlIIlIIIllIIII;
            0;
            if (-1 <= 2) continue;
            return ((0xC2 ^ 0xBB ^ (0x5E ^ 0x1E)) & (0xA3 ^ 0x90 ^ (0x9B ^ 0x91) ^ -1)) != 0;
        }
        return llIllIIl[0];
    }

    private static boolean lIllIllIlIl(Object object) {
        return object != null;
    }

    private static boolean lIllIlllIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static int lIllIlIllll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIllIllIllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIlIlllI() {
        llIllIIl = new int[182];
        q.llIllIIl[0] = 1;
        q.llIllIIl[1] = (0xF5 ^ 0xAF ^ (0x77 ^ 9)) & (133 + 105 - 83 + 4 ^ 61 + 153 - 141 + 114 ^ -1);
        q.llIllIIl[2] = 163 + 231 - 370 + 216;
        q.llIllIIl[3] = 6 ^ 0x47;
        q.llIllIIl[4] = 0x61 ^ 0x43 ^ (0xA9 ^ 0x81);
        q.llIllIIl[5] = -(0xFFFFEF29 & 0x76D7) & (0xFFFFFFEF & 0x673E);
        q.llIllIIl[6] = 134 + 145 - 124 + 13 ^ 58 + 147 - 180 + 123;
        q.llIllIIl[7] = -(0xFFFFFF87 & 0x3AFD) & (0xFFFFFFF7 & 0x3BBF);
        q.llIllIIl[8] = 0x1F ^ 0x1A;
        q.llIllIIl[9] = 2;
        q.llIllIIl[10] = 0x4A ^ 0xC ^ (0xD5 ^ 0xB3);
        q.llIllIIl[11] = 3;
        q.llIllIIl[12] = 6 ^ 0x30 ^ (0x18 ^ 0x3D);
        q.llIllIIl[13] = 0x64 ^ 0x60;
        q.llIllIIl[14] = 0xB9 ^ 0x9A;
        q.llIllIIl[15] = 0x5E ^ 0x58 ^ (0x46 ^ 0x72);
        q.llIllIIl[16] = 0x90 ^ 0x96;
        q.llIllIIl[17] = -(0xFFFFFDE5 & 0x761F) & (0xFFFFF7F6 & Short.MAX_VALUE);
        q.llIllIIl[18] = 0xFFFFAA7E & 0x5D9D;
        q.llIllIIl[19] = 0x52 ^ 0x5B;
        q.llIllIIl[20] = 0xAA ^ 0xAD;
        q.llIllIIl[21] = 0x7B ^ 0x73;
        q.llIllIIl[22] = 0x6C ^ 0x44;
        q.llIllIIl[23] = 0xA6 ^ 0xAD;
        q.llIllIIl[24] = 42 + 29 - -8 + 54 ^ 43 + 84 - 68 + 78;
        q.llIllIIl[25] = 101 + 110 - 41 + 34 ^ 47 + 0 - 20 + 166;
        q.llIllIIl[26] = 0x5A ^ 0x54;
        q.llIllIIl[27] = -(0xFFFFADFC & 0x7277) & (0xFFFFFFFB & 0x33FF);
        q.llIllIIl[28] = 0x32 ^ 0x3D;
        q.llIllIIl[29] = 0xFFFFC7CF & 0x3FBB;
        q.llIllIIl[30] = -(0xFFFFF36D & 0x3CF3) & (0xFFFFFCFF & Short.MAX_VALUE);
        q.llIllIIl[31] = 0xFFFFECBF & 0x5FE5;
        q.llIllIIl[32] = -(0xFFFFC7BB & 0x7D75) & (0xFFFFE73F & 0x5FFE);
        q.llIllIIl[33] = 0xFFFFCFAF & 0x397F;
        q.llIllIIl[34] = 0xFFFFFFD3 & 0x317D;
        q.llIllIIl[35] = 0x78 ^ 0x1A ^ (0x50 ^ 0x22);
        q.llIllIIl[36] = -(0xFFFFFAF9 & 0x45BF) & (0xFFFFFFFF & 0x5FFF);
        q.llIllIIl[37] = -(0xFFFFF67F & 0x1B91) & (0xFFFFD7FB & 0x3F5F);
        q.llIllIIl[38] = 0xFFFFA93F & 0x5FEB;
        q.llIllIIl[39] = 0xFFFFCFFF & 0x36CF;
        q.llIllIIl[40] = 0xFFFF9FBE & 0x66F7;
        q.llIllIIl[41] = 0xFFFFB9C5 & 0x6F3A;
        q.llIllIIl[42] = 0x1B ^ 0x31 ^ (0x83 ^ 0xB8);
        q.llIllIIl[43] = -(86 + 3 - 17 + 77) & (0xFFFFBFFE & 0x5FDF);
        q.llIllIIl[44] = -(0xFFFFBBD6 & 0x7CFB) & (0xFFFFBFFB & 0x7AFD);
        q.llIllIIl[45] = -(0xFFFFAC65 & 0x739F) & (0xFFFFEFEF & 0x33F7);
        q.llIllIIl[46] = 0xD ^ 0x27 ^ (0x43 ^ 0x7B);
        q.llIllIIl[47] = 0x75 ^ 0x68 ^ (0x28 ^ 0x2D);
        q.llIllIIl[48] = 1 ^ (0x9A ^ 0x8F);
        q.llIllIIl[49] = 0xB4 ^ 0xA1;
        q.llIllIIl[50] = 0x16 ^ 0;
        q.llIllIIl[51] = (0x85 ^ 0xA0) & ~(0x90 ^ 0xB5) ^ (0x6E ^ 0x79);
        q.llIllIIl[52] = -(0xFFFFFE97 & 0x73EB) & (0xFFFFFEBF & 0x7FDB);
        q.llIllIIl[53] = -(0xFFFFF64B & 0x5BBF) & (0xFFFFFF3A & 0x5FEF);
        q.llIllIIl[54] = 0x4F ^ 0x56;
        q.llIllIIl[55] = 0xA2 ^ 0xA8 ^ (0xB8 ^ 0xA8);
        q.llIllIIl[56] = 0xFFFF8F5B & 0x7DBE;
        q.llIllIIl[57] = 9 ^ 0x12;
        q.llIllIIl[58] = 0x22 ^ 0x71 ^ (0xE1 ^ 0xAE);
        q.llIllIIl[59] = 6 ^ 0x1B;
        q.llIllIIl[60] = -(0xFFFFFFBA & 0x64F) & (0xFFFF96FF & 0x7FBF);
        q.llIllIIl[61] = -(0xFFFFF321 & 0x6CFF) & (0xFFFFFFF9 & 0x6E77);
        q.llIllIIl[62] = -(0xFFFFF675 & 0x7BCB) & (0xFFFFFFFF & Short.MAX_VALUE);
        q.llIllIIl[63] = -(0xFFFFCF41 & 0x3DFF) & (0xFFFFDFFE & 0x3DFF);
        q.llIllIIl[64] = 0xC0 ^ 0xA7 ^ (0xD ^ 0x74);
        q.llIllIIl[65] = 2 ^ 0x1D;
        q.llIllIIl[66] = 0x7F ^ 0x5E;
        q.llIllIIl[67] = 0x82 ^ 0xA0;
        q.llIllIIl[68] = 0xB4 ^ 0xBE ^ (0xB6 ^ 0x98);
        q.llIllIIl[69] = 0xF2 ^ 0xC1 ^ (0x8D ^ 0x9B);
        q.llIllIIl[70] = 11 + 136 - 67 + 98 ^ 113 + 80 - 67 + 22;
        q.llIllIIl[71] = 0x3D ^ 0x3A ^ (0x61 ^ 0x41);
        q.llIllIIl[72] = 0x2C ^ 5;
        q.llIllIIl[73] = -(0xFFFF9E7C & 0x71CF) & (0xFFFFFCCF & 0xF7FF);
        q.llIllIIl[74] = -(42 + 117 - 75 + 87) & (0xFFFFFFEF & 0xF7FE);
        q.llIllIIl[75] = 0x9F ^ 0xB5;
        q.llIllIIl[76] = 0x69 ^ 0x12 ^ (0xEC ^ 0xBC);
        q.llIllIIl[77] = 0x52 ^ 0x7E;
        q.llIllIIl[78] = 0x4F ^ 0x62;
        q.llIllIIl[79] = 28 + 60 - 59 + 103 ^ 144 + 23 - 41 + 44;
        q.llIllIIl[80] = 0x65 ^ 0x25 ^ (0x3E ^ 0x51);
        q.llIllIIl[81] = 0xAB ^ 0x9B;
        q.llIllIIl[82] = 0x9C ^ 0xAD;
        q.llIllIIl[83] = -(0xFFFFDC17 & 0x2BE9) & (0xFFFF8FA5 & 0x7FDF);
        q.llIllIIl[84] = 0x52 ^ 0x47 ^ (0xE5 ^ 0xC3);
        q.llIllIIl[85] = 0x86 ^ 0xB2;
        q.llIllIIl[86] = 0x56 ^ 0x63;
        q.llIllIIl[87] = 0x13 ^ 0x1D ^ (3 ^ 0x3B);
        q.llIllIIl[88] = 0x4B ^ 0x7C;
        q.llIllIIl[89] = 3 ^ 0x45;
        q.llIllIIl[90] = 0xD9 ^ 0x90;
        q.llIllIIl[91] = -(0xFFFFFE7F & 0x73CA) & (0xFFFFFFCF & Short.MAX_VALUE);
        q.llIllIIl[92] = -(0xFFFFFAFF & 0x7511) & (0xFFFFFFF7 & 0x7DFF);
        q.llIllIIl[93] = 0x43 ^ 0x7B;
        q.llIllIIl[94] = 0xA ^ 0x33;
        q.llIllIIl[95] = 0x2E ^ 0x62;
        q.llIllIIl[96] = 0x25 ^ 0x1F;
        q.llIllIIl[97] = 0xC2 ^ 0x92;
        q.llIllIIl[98] = 0x5A ^ 0x61;
        q.llIllIIl[99] = 0xC7 ^ 0xAB ^ (0x9E ^ 0xA8);
        q.llIllIIl[100] = 0x63 ^ 0x4C ^ (0x5B ^ 0x10);
        q.llIllIIl[101] = 0xBA ^ 0x87;
        q.llIllIIl[102] = 0x22 ^ 0x10 ^ (0x8B ^ 0x87);
        q.llIllIIl[103] = 0xFFFFEF9F & 0x1F6D;
        q.llIllIIl[104] = 0x69 ^ 0x5A ^ (0x4A ^ 0x46);
        q.llIllIIl[105] = 0x61 ^ 0x18 ^ 1;
        q.llIllIIl[106] = 115 + 14 - 71 + 72;
        q.llIllIIl[107] = 0xEB ^ 0xAB;
        q.llIllIIl[108] = (0x4A ^ 0x19) + (6 ^ 0x45) - (5 ^ 0x5F) + (0x23 ^ 0x73);
        q.llIllIIl[109] = 0xCA ^ 0x83 ^ (0x18 ^ 0x13);
        q.llIllIIl[110] = 0xFFFFABAD & 0x5FF3;
        q.llIllIIl[111] = 0xFFFF9CE7 & 0x6FBF;
        q.llIllIIl[112] = -(0xFFFFDD1F & 0x62E7) & (0xFFFFEDEF & 0x5EBE);
        q.llIllIIl[113] = 0x74 ^ 0x5D ^ (0xD0 ^ 0xBA);
        q.llIllIIl[114] = 0x2B ^ 6 ^ (0x52 ^ 0x3B);
        q.llIllIIl[115] = 0x68 ^ 0x2D;
        q.llIllIIl[116] = 4 + 9 - -51 + 86;
        q.llIllIIl[117] = -(0xFFFFDF59 & 0x72EF) & (0xFFFFDEFD & 0x7F6F);
        q.llIllIIl[118] = -(0xFFFFF7F9 & 0x38EF) & (0xFFFFFFFA & 0x3DFF);
        q.llIllIIl[119] = 192 + 109 - 120 + 54 ^ 15 + 141 - 25 + 41;
        q.llIllIIl[120] = 0xE6 ^ 0xAE;
        q.llIllIIl[121] = (0x62 ^ 0x28) + (0xD9 ^ 0x92) - (0x2B ^ 0x55) + (24 + 86 - 30 + 57);
        q.llIllIIl[122] = (0xEE ^ 0xA3) + (4 + 95 - 23 + 61) - (0 + 115 - 20 + 41) + (0x61 ^ 0x3D);
        q.llIllIIl[123] = 0xFFFF8F7B & 0x7BF7;
        q.llIllIIl[124] = 0xFFFFCFF1 & 0x3DDE;
        q.llIllIIl[125] = 0x4F ^ 5;
        q.llIllIIl[126] = 33 + 176 - 72 + 75 ^ 46 + 104 - -5 + 4;
        q.llIllIIl[127] = (0xF ^ 0x35) + (0x6D ^ 0x58) - -(0x37 ^ 0x1A) + (7 ^ 0x1F);
        q.llIllIIl[128] = 0x7A ^ 0x37;
        q.llIllIIl[129] = 173 + 153 - 310 + 182 ^ 21 + 76 - 81 + 120;
        q.llIllIIl[130] = 3 ^ 0x4C;
        q.llIllIIl[131] = 152 + 66 - 134 + 106;
        q.llIllIIl[132] = 179 + 131 - 159 + 49;
        q.llIllIIl[133] = 0xFFFFE7E3 & 0x19FC;
        q.llIllIIl[134] = 0x46 ^ 0x17;
        q.llIllIIl[135] = 0x49 ^ 0x42 ^ (0x7B ^ 0x22);
        q.llIllIIl[136] = (0x1D ^ 0x72) + (147 + 36 - 118 + 88) - (63 + 80 - 49 + 144) + (156 + 1 - 66 + 93);
        q.llIllIIl[137] = (0xED ^ 0x96) + (0x77 ^ 0x40) - (33 + 80 - -1 + 20) + (87 + 163 - 93 + 19);
        q.llIllIIl[138] = 0x81 ^ 0xA7 ^ (0xB4 ^ 0xC1);
        q.llIllIIl[139] = 0xD6 ^ 0x82 ^ (0xCE ^ 0xC4) & ~(0x92 ^ 0x98);
        q.llIllIIl[140] = 0x60 ^ 3 ^ (0x53 ^ 0x65);
        q.llIllIIl[141] = 72 + 55 - -74 + 29;
        q.llIllIIl[142] = 0x18 ^ 0x1E ^ (0xC0 ^ 0x90);
        q.llIllIIl[143] = 0xC8 ^ 0x9F;
        q.llIllIIl[144] = 0x36 ^ 0x78 ^ (0xB1 ^ 0xA7);
        q.llIllIIl[145] = 0xDA ^ 0x83;
        q.llIllIIl[146] = 0x9E ^ 0x92 ^ (0xF2 ^ 0xA5);
        q.llIllIIl[147] = -(0xFFFFFABF & 0x7FC8) & (0xFFFFFFFF & Short.MAX_VALUE);
        q.llIllIIl[148] = -(0xFFFFCF3D & 0x79FB) & (0xFFFFCFFB & 0x7F7C);
        q.llIllIIl[149] = -(0xFFFFD75C & 0x69BB) & (0xFFFFF77F & 0x6DFF);
        q.llIllIIl[150] = -(0xFFFFF5AF & 0xED7) & (0xFFFFDFDE & 0x3FFF);
        q.llIllIIl[151] = -(0xFFFFFB3F & 0x6CE3) & (0xFFFFEFF6 & 0x7FFB);
        q.llIllIIl[152] = 0xFFFFB7EE & 0x5DBF;
        q.llIllIIl[153] = 0xFFFFEFC4 & 0x77FB;
        q.llIllIIl[154] = 0xFFFFCFEA & 0x33FD;
        q.llIllIIl[155] = -(0xFFFFBAE9 & 0x5797) & (0xFFFFFFFF & 0x1FFF);
        q.llIllIIl[156] = -(0xFFFFC69F & 0x7972) & (0xFFFFFFDD & 0x6EFF);
        q.llIllIIl[157] = -(0xFFFFDEFF & 0x3D43) & (0xFFFFFDEB & 0x7FFE);
        q.llIllIIl[158] = 0xFFFF8DD5 & 0x773E;
        q.llIllIIl[159] = 0x1B ^ 0x47;
        q.llIllIIl[160] = 0x24 ^ 0x79;
        q.llIllIIl[161] = 0xD3 ^ 0x8D;
        q.llIllIIl[162] = 0x49 ^ 0x57 ^ (0xD4 ^ 0x95);
        q.llIllIIl[163] = -(0xFFFFF1FF & 0x7FED) & (0xFFFFFFFF & 0x7DFF);
        q.llIllIIl[164] = 0xFFFF8D6F & 0x7FFD;
        q.llIllIIl[165] = 0xFFFFDDAD & 0x2FFF;
        q.llIllIIl[166] = (0x34 ^ 0xC) + (89 + 40 - -4 + 7) - (0x7F ^ 6) + (72 + 147 - 74 + 35);
        q.llIllIIl[167] = -(0xFFFFF5EB & 0x7B95) & (0xFFFFFFF5 & 0x7D9F);
        q.llIllIIl[168] = -(0xFFFFBAA6 & 0x575B) & (0xFFFFFFDF & 0x1F3F);
        q.llIllIIl[169] = -(0xFFFFFFF5 & 0x311B) & (0xFFFFFBFF & 0x3FFD);
        q.llIllIIl[170] = -(0 ^ 0x2A) & (0xFFFFCD7F & 0x3FFF);
        q.llIllIIl[171] = 0xFFFFDFBF & 0x2E64;
        q.llIllIIl[172] = -(0xFFFFA2FF & 0x5F29) & (0xFFFFFFEF & 0xFFF);
        q.llIllIIl[173] = 0x92 ^ 0xC6 ^ (0x48 ^ 0x7C);
        q.llIllIIl[174] = 0x78 ^ 0x19;
        q.llIllIIl[175] = 0xF3 ^ 0x91;
        q.llIllIIl[176] = 0xFC ^ 0xA8 ^ (0x8C ^ 0xBB);
        q.llIllIIl[177] = 0xD7 ^ 0xB2;
        q.llIllIIl[178] = 185 + 17 - 84 + 85 ^ 112 + 80 - 80 + 61;
        q.llIllIIl[179] = 0x4B ^ 0x24 ^ (0x3E ^ 0x36);
        q.llIllIIl[180] = 0xE0 ^ 0x88;
        q.llIllIIl[181] = 37 + 97 - 26 + 106 ^ 122 + 187 - 221 + 103;
    }

    private static void ag() {
        block46: {
            d lIlIIlIIIlIllII;
            block45: {
                block44: {
                    block43: {
                        Object lIlIIlIIIlIllIl;
                        block42: {
                            block41: {
                                block40: {
                                    block39: {
                                        block38: {
                                            block37: {
                                                block36: {
                                                    block35: {
                                                        block34: {
                                                            block33: {
                                                                block32: {
                                                                    block31: {
                                                                        int[] nArray = new int[llIllIIl[0]];
                                                                        nArray[q.llIllIIl[1]] = llIllIIl[43];
                                                                        if (!q.lIllIllIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block31;
                                                                        int[] nArray2 = new int[llIllIIl[0]];
                                                                        nArray2[q.llIllIIl[1]] = llIllIIl[43];
                                                                        if (!q.lIllIllIIII(Bank.contains((int[])nArray2) ? 1 : 0)) break block32;
                                                                        int[] nArray3 = new int[llIllIIl[0]];
                                                                        nArray3[q.llIllIIl[1]] = llIllIIl[43];
                                                                        if (!q.lIllIllIIIl(Bank.getFirst((int[])nArray3).getQuantity(), llIllIIl[4])) break block32;
                                                                    }
                                                                    lIlIIlIIIlIllIl = new d(llIllIIl[43], llIllIIl[4], e.c(llIllIIl[147], llIllIIl[148]));
                                                                    bB.add((d)lIlIIlIIIlIllIl);
                                                                    0;
                                                                }
                                                                int[] nArray = new int[llIllIIl[0]];
                                                                nArray[q.llIllIIl[1]] = llIllIIl[30];
                                                                if (!q.lIllIllIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                                                                int[] nArray4 = new int[llIllIIl[0]];
                                                                nArray4[q.llIllIIl[1]] = llIllIIl[30];
                                                                if (!q.lIllIllIIII(Bank.contains((int[])nArray4) ? 1 : 0)) break block34;
                                                                int[] nArray5 = new int[llIllIIl[0]];
                                                                nArray5[q.llIllIIl[1]] = llIllIIl[30];
                                                                if (!q.lIllIllIIIl(Bank.getFirst((int[])nArray5).getQuantity(), llIllIIl[16])) break block34;
                                                            }
                                                            lIlIIlIIIlIllIl = new d(llIllIIl[30], llIllIIl[16], llIllIIl[149]);
                                                            bB.add((d)lIlIIlIIIlIllIl);
                                                            0;
                                                        }
                                                        int[] nArray = new int[llIllIIl[0]];
                                                        nArray[q.llIllIIl[1]] = llIllIIl[31];
                                                        if (!q.lIllIllIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block35;
                                                        int[] nArray6 = new int[llIllIIl[0]];
                                                        nArray6[q.llIllIIl[1]] = llIllIIl[31];
                                                        if (!q.lIllIllIIII(Bank.contains((int[])nArray6) ? 1 : 0)) break block36;
                                                        int[] nArray7 = new int[llIllIIl[0]];
                                                        nArray7[q.llIllIIl[1]] = llIllIIl[31];
                                                        if (!q.lIllIllIIIl(Bank.getFirst((int[])nArray7).getQuantity(), llIllIIl[28])) break block36;
                                                    }
                                                    lIlIIlIIIlIllIl = new d(llIllIIl[31], llIllIIl[28], llIllIIl[150]);
                                                    bB.add((d)lIlIIlIIIlIllIl);
                                                    0;
                                                }
                                                int[] nArray = new int[llIllIIl[0]];
                                                nArray[q.llIllIIl[1]] = llIllIIl[103];
                                                if (q.lIllIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    lIlIIlIIIlIllIl = new d(llIllIIl[103], llIllIIl[8], llIllIIl[151]);
                                                    bB.add((d)lIlIIlIIIlIllIl);
                                                    0;
                                                }
                                                int[] nArray8 = new int[llIllIIl[0]];
                                                nArray8[q.llIllIIl[1]] = llIllIIl[37];
                                                if (q.lIllIllIIlI(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                                    lIlIIlIIIlIllIl = new d(llIllIIl[37], llIllIIl[0], llIllIIl[27]);
                                                    bB.add((d)lIlIIlIIIlIllIl);
                                                    0;
                                                }
                                                int[] nArray9 = new int[llIllIIl[0]];
                                                nArray9[q.llIllIIl[1]] = llIllIIl[32];
                                                if (!q.lIllIllIIII(Bank.contains((int[])nArray9) ? 1 : 0)) break block37;
                                                int[] nArray10 = new int[llIllIIl[0]];
                                                nArray10[q.llIllIIl[1]] = llIllIIl[32];
                                                if (!q.lIllIllIIII(Bank.contains((int[])nArray10) ? 1 : 0)) break block38;
                                                int[] nArray11 = new int[llIllIIl[0]];
                                                nArray11[q.llIllIIl[1]] = llIllIIl[32];
                                                if (!q.lIllIllIIIl(Bank.getFirst((int[])nArray11).getQuantity(), llIllIIl[13])) break block38;
                                            }
                                            lIlIIlIIIlIllIl = new d(llIllIIl[32], llIllIIl[13], llIllIIl[27]);
                                            bB.add((d)lIlIIlIIIlIllIl);
                                            0;
                                        }
                                        int[] nArray = new int[llIllIIl[0]];
                                        nArray[q.llIllIIl[1]] = llIllIIl[33];
                                        if (!q.lIllIllIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block39;
                                        int[] nArray12 = new int[llIllIIl[0]];
                                        nArray12[q.llIllIIl[1]] = llIllIIl[33];
                                        if (!q.lIllIllIIII(Bank.contains((int[])nArray12) ? 1 : 0)) break block40;
                                        int[] nArray13 = new int[llIllIIl[0]];
                                        nArray13[q.llIllIIl[1]] = llIllIIl[33];
                                        if (!q.lIllIllIIIl(Bank.getFirst((int[])nArray13).getQuantity(), llIllIIl[8])) break block40;
                                    }
                                    lIlIIlIIIlIllIl = new d(llIllIIl[33], llIllIIl[8], llIllIIl[27]);
                                    bB.add((d)lIlIIlIIIlIllIl);
                                    0;
                                }
                                int[] nArray = new int[llIllIIl[0]];
                                nArray[q.llIllIIl[1]] = llIllIIl[29];
                                if (!q.lIllIllIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block41;
                                int[] nArray14 = new int[llIllIIl[0]];
                                nArray14[q.llIllIIl[1]] = llIllIIl[29];
                                if (!q.lIllIllIIII(Bank.contains((int[])nArray14) ? 1 : 0)) break block42;
                                int[] nArray15 = new int[llIllIIl[0]];
                                nArray15[q.llIllIIl[1]] = llIllIIl[29];
                                if (!q.lIllIllIIIl(Bank.getFirst((int[])nArray15).getQuantity(), llIllIIl[8])) break block42;
                            }
                            lIlIIlIIIlIllIl = new d(llIllIIl[29], llIllIIl[13], llIllIIl[27]);
                            bB.add((d)lIlIIlIIIlIllIl);
                            0;
                        }
                        int[] nArray = new int[llIllIIl[0]];
                        nArray[q.llIllIIl[1]] = llIllIIl[39];
                        if (q.lIllIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            lIlIIlIIIlIllIl = new d(llIllIIl[39], llIllIIl[0], llIllIIl[27]);
                            bB.add((d)lIlIIlIIIlIllIl);
                            0;
                        }
                        int[] nArray16 = new int[llIllIIl[0]];
                        nArray16[q.llIllIIl[1]] = llIllIIl[38];
                        if (q.lIllIllIIlI(Bank.contains((int[])nArray16) ? 1 : 0)) {
                            lIlIIlIIIlIllIl = new d(llIllIIl[38], llIllIIl[0], llIllIIl[27]);
                            bB.add((d)lIlIIlIIIlIllIl);
                            0;
                        }
                        int[] nArray17 = new int[llIllIIl[0]];
                        nArray17[q.llIllIIl[1]] = llIllIIl[40];
                        if (q.lIllIllIIlI(Bank.contains((int[])nArray17) ? 1 : 0)) {
                            lIlIIlIIIlIllIl = new d(llIllIIl[40], llIllIIl[0], llIllIIl[152]);
                            bB.add((d)lIlIIlIIIlIllIl);
                            0;
                        }
                        int[] nArray18 = new int[llIllIIl[0]];
                        nArray18[q.llIllIIl[1]] = llIllIIl[41];
                        if (q.lIllIllIIlI(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            lIlIIlIIIlIllIl = new d(llIllIIl[41], llIllIIl[0], llIllIIl[153] + e.c(llIllIIl[154], llIllIIl[155]));
                            bB.add((d)lIlIIlIIIlIllIl);
                            0;
                        }
                        if (q.lIllIllIIlI(Bank.contains((Predicate)(lIlIIlIIIlIllIl = item -> item.getName().toLowerCase().contains(llIllIII[llIllIIl[161]]))) ? 1 : 0)) {
                            lIlIIlIIIlIllII = new d(llIllIIl[156], llIllIIl[8], llIllIIl[157]);
                            bB.add(lIlIIlIIIlIllII);
                            0;
                        }
                        int[] nArray19 = new int[llIllIIl[0]];
                        nArray19[q.llIllIIl[1]] = llIllIIl[34];
                        if (!q.lIllIllIIII(Bank.contains((int[])nArray19) ? 1 : 0)) break block43;
                        int[] nArray20 = new int[llIllIIl[0]];
                        nArray20[q.llIllIIl[1]] = llIllIIl[34];
                        if (!q.lIllIllIIII(Bank.contains((int[])nArray20) ? 1 : 0)) break block44;
                        int[] nArray21 = new int[llIllIIl[0]];
                        nArray21[q.llIllIIl[1]] = llIllIIl[34];
                        if (!q.lIllIllIIIl(Bank.getFirst((int[])nArray21).getQuantity(), llIllIIl[13])) break block44;
                    }
                    lIlIIlIIIlIllII = new d(llIllIIl[34], llIllIIl[13], i.bw);
                    bB.add(lIlIIlIIIlIllII);
                    0;
                }
                int[] nArray = new int[llIllIIl[0]];
                nArray[q.llIllIIl[1]] = llIllIIl[36];
                if (!q.lIllIllIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray22 = new int[llIllIIl[0]];
                nArray22[q.llIllIIl[1]] = llIllIIl[36];
                if (!q.lIllIllIIII(Bank.contains((int[])nArray22) ? 1 : 0)) break block46;
                int[] nArray23 = new int[llIllIIl[0]];
                nArray23[q.llIllIIl[1]] = llIllIIl[36];
                if (!q.lIllIllIIIl(Bank.getFirst((int[])nArray23).getQuantity(), llIllIIl[28])) break block46;
            }
            lIlIIlIIIlIllII = new d(llIllIIl[36], llIllIIl[22], llIllIIl[158]);
            bB.add(lIlIIlIIIlIllII);
            0;
        }
    }

    private static String lIllIIlllll(String lIlIIlIIIIIllIl, String lIlIIlIIIIIllII) {
        lIlIIlIIIIIllIl = new String(Base64.getDecoder().decode(lIlIIlIIIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIIlIIIIlIIII = new StringBuilder();
        char[] lIlIIlIIIIIllll = lIlIIlIIIIIllII.toCharArray();
        int lIlIIlIIIIIlllI = llIllIIl[1];
        char[] lIlIIlIIIIIlIII = lIlIIlIIIIIllIl.toCharArray();
        int lIlIIlIIIIIIlll = lIlIIlIIIIIlIII.length;
        int lIlIIlIIIIIIllI = llIllIIl[1];
        while (q.lIllIllIIIl(lIlIIlIIIIIIllI, lIlIIlIIIIIIlll)) {
            char lIlIIlIIIIlIIll = lIlIIlIIIIIlIII[lIlIIlIIIIIIllI];
            lIlIIlIIIIlIIII.append((char)(lIlIIlIIIIlIIll ^ lIlIIlIIIIIllll[lIlIIlIIIIIlllI % lIlIIlIIIIIllll.length]));
            0;
            ++lIlIIlIIIIIlllI;
            ++lIlIIlIIIIIIllI;
            0;
            
            return null;
        }
        return String.valueOf(lIlIIlIIIIlIIII);
    }

    private static boolean lIllIllIlII(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public int U() {
        try {
            q.aC();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0xF4 ^ 0x96 ^ (0xB8 ^ 0x8B)) & (38 + 84 - 52 + 138 ^ 49 + 42 - 34 + 72 ^ -1)) != 0) {
            return (26 + 101 - 7 + 15 ^ 0 + 43 - -77 + 63) & (0x65 ^ 0x2E ^ (0xFD ^ 0x86) ^ -1);
        }
        return llIllIIl[100];
    }

    private static void aD() {
        WorldArea worldArea = new WorldArea(llIllIIl[52], llIllIIl[56], llIllIIl[16], llIllIIl[4], llIllIIl[1]);
        if (q.lIllIllIIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] stringArray = new String[llIllIIl[0]];
            stringArray[q.llIllIIl[1]] = llIllIII[llIllIIl[142]];
            TileObjects.getNearest((String[])stringArray).interact(llIllIII[llIllIIl[143]]);
            Time.sleepTicks((int)llIllIIl[9]);
            0;
        }
        if (q.lIllIllIIlI(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && q.lIllIlllIII(Players.getLocal().getWorldLocation().distanceTo(ce), llIllIIl[21])) {
            AccBuilderBarrows.c = llIllIII[llIllIIl[144]];
            if (q.lIllIllIIII(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)ce);
            0;
            Time.sleepTicks((int)llIllIIl[0]);
            0;
        }
        if (q.lIllIllIIII(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && q.lIllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(ce), llIllIIl[21])) {
            g.a(llIllIII[llIllIIl[145]], bX);
        }
        if (q.lIllIllIIII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIllIIl[52], llIllIIl[53], llIllIIl[1])) ? 1 : 0)) {
            String[] stringArray = new String[llIllIIl[0]];
            stringArray[q.llIllIIl[1]] = llIllIII[llIllIIl[99]];
            TileObjects.getNearest((String[])stringArray).interact(llIllIII[llIllIIl[146]]);
            Time.sleepTicks((int)llIllIIl[9]);
            0;
        }
    }

    private static boolean lIllIlllIll(Object object, Object object2) {
        return object == object2;
    }

    private static String lIllIlIIIII(String lIlIIlIIIlIIIII, String lIlIIlIIIIlllll) {
        try {
            SecretKeySpec lIlIIlIIIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIlIIIIlllll.getBytes(StandardCharsets.UTF_8)), llIllIIl[21]), "DES");
            Cipher lIlIIlIIIlIIlII = Cipher.getInstance("DES");
            lIlIIlIIIlIIlII.init(llIllIIl[9], lIlIIlIIIlIIlIl);
            return new String(lIlIIlIIIlIIlII.doFinal(Base64.getDecoder().decode(lIlIIlIIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIlIIIlIIIll) {
            lIlIIlIIIlIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlllIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIllIlIllIl() {
        llIllIII = new String[llIllIIl[181]];
        q.llIllIII[q.llIllIIl[1]] = q."Finished buying items, switching back to quest";
        q.llIllIII[q.llIllIIl[0]] = q."Waterfall";
        q.llIllIII[q.llIllIIl[9]] = q."Priest in Peril";
        q.llIllIII[q.llIllIIl[11]] = q."Ernest the Chicken";
        q.llIllIII[q.llIllIIl[13]] = q."Crafting";
        q.llIllIII[q.llIllIIl[8]] = q."Woodcutting";
        q.llIllIII[q.llIllIIl[16]] = q."Training range";
        q.llIllIII[q.llIllIIl[20]] = q."Varrock Quiz";
        q.llIllIII[q.llIllIIl[21]] = q."RFD Dwarf";
        q.llIllIII[q.llIllIIl[19]] = q."A Porcine";
        q.llIllIII[q.llIllIIl[4]] = q."Antique lamp";
        q.llIllIII[q.llIllIIl[23]] = q."Client of Kourend";
        q.llIllIII[q.llIllIIl[24]] = q."Antique lamp";
        q.llIllIII[q.llIllIIl[25]] = q."";
        q.llIllIII[q.llIllIIl[26]] = q."Nav to bank";
        q.llIllIII[q.llIllIIl[28]] = q."Handling banking";
        q.llIllIII[q.llIllIIl[35]] = q."We are missing quest supplies, switching to BUYING";
        q.llIllIII[q.llIllIIl[42]] = q."We are missing quest supplies, switching to BUYING";
        q.llIllIII[q.llIllIIl[46]] = q."Drink";
        q.llIllIII[q.llIllIIl[12]] = q."Drink";
        q.llIllIII[q.llIllIIl[48]] = q."Shark";
        q.llIllIII[q.llIllIIl[49]] = q."Shark";
        q.llIllIII[q.llIllIIl[50]] = q."Eat";
        q.llIllIII[q.llIllIIl[51]] = q."Nav to start";
        q.llIllIII[q.llIllIIl[47]] = q."Ava";
        q.llIllIII[q.llIllIIl[54]] = q."Bookcase";
        q.llIllIII[q.llIllIIl[55]] = q."Search";
        q.llIllIII[q.llIllIIl[57]] = q."Bookcase";
        q.llIllIII[q.llIllIIl[58]] = q."Search";
        q.llIllIII[q.llIllIIl[59]] = q."Wear";
        q.llIllIII[q.llIllIIl[64]] = q."Nav to charter";
        q.llIllIII[q.llIllIIl[65]] = q."Trader Crewmember";
        q.llIllIII[q.llIllIIl[10]] = q."Trade";
        q.llIllIII[q.llIllIIl[66]] = q."Break";
        q.llIllIII[q.llIllIIl[67]] = q."Nav to ecto";
        q.llIllIII[q.llIllIIl[14]] = q."Bones";
        q.llIllIII[q.llIllIIl[68]] = q."Staircase";
        q.llIllIII[q.llIllIIl[69]] = q."Climb-up";
        q.llIllIII[q.llIllIIl[70]] = q."Loader";
        q.llIllIII[q.llIllIIl[71]] = q."Bones";
        q.llIllIII[q.llIllIIl[22]] = q."Bones";
        q.llIllIII[q.llIllIIl[72]] = q."Loader";
        q.llIllIII[q.llIllIIl[75]] = q."Bones";
        q.llIllIII[q.llIllIIl[76]] = q."Staircase";
        q.llIllIII[q.llIllIIl[77]] = q."Climb-down";
        q.llIllIII[q.llIllIIl[78]] = q."Bonemeal";
        q.llIllIII[q.llIllIIl[79]] = q."Ectofuntus";
        q.llIllIII[q.llIllIIl[80]] = q."Worship";
        q.llIllIII[q.llIllIIl[81]] = q."Bonemeal";
        q.llIllIII[q.llIllIIl[82]] = q."Ghost disciple";
        q.llIllIII[q.llIllIIl[15]] = q."Malcolm";
        q.llIllIII[q.llIllIIl[84]] = q."Alice";
        q.llIllIII[q.llIllIIl[85]] = q."Malcolm";
        q.llIllIII[q.llIllIIl[86]] = q."Alice";
        q.llIllIII[q.llIllIIl[87]] = q."Malcolm";
        q.llIllIII[q.llIllIIl[88]] = q."Alice";
        q.llIllIII[q.llIllIIl[93]] = q."Nav to crone";
        q.llIllIII[q.llIllIIl[94]] = q."Old crone";
        q.llIllIII[q.llIllIIl[96]] = q."Malcolm";
        q.llIllIII[q.llIllIIl[98]] = q."Malcolm";
        q.llIllIII[q.llIllIIl[6]] = q."Malcolm";
        q.llIllIII[q.llIllIIl[101]] = q."Undead chicken";
        q.llIllIII[q.llIllIIl[102]] = q."Iron bar";
        q.llIllIII[q.llIllIIl[104]] = q."Iron bar";
        q.llIllIII[q.llIllIIl[107]] = q."Witch";
        q.llIllIII[q.llIllIIl[3]] = q."Witch";
        q.llIllIII[q.llIllIIl[109]] = q."Bar magnet";
        q.llIllIII[q.llIllIIl[113]] = q."Nav to mine";
        q.llIllIII[q.llIllIIl[114]] = q."Hammer";
        q.llIllIII[q.llIllIIl[115]] = q."Selected iron";
        q.llIllIII[q.llIllIIl[89]] = q."Bar magnet";
        q.llIllIII[q.llIllIIl[119]] = q."Undead tree";
        q.llIllIII[q.llIllIIl[120]] = q."Chop";
        q.llIllIII[q.llIllIIl[90]] = q."Wear";
        q.llIllIII[q.llIllIIl[125]] = q."Nav to npc";
        q.llIllIII[q.llIllIIl[126]] = q."Turael";
        q.llIllIII[q.llIllIIl[95]] = q."Turael";
        q.llIllIII[q.llIllIIl[128]] = q."Undead twigs";
        q.llIllIII[q.llIllIIl[129]] = q."Undead tree";
        q.llIllIII[q.llIllIIl[130]] = q."Chop";
        q.llIllIII[q.llIllIIl[97]] = q."Undead twigs";
        q.llIllIII[q.llIllIIl[134]] = q."Research notes";
        q.llIllIII[q.llIllIIl[135]] = q."Translate";
        q.llIllIII[q.llIllIIl[138]] = q."A pattern";
        q.llIllIII[q.llIllIIl[139]] = q."A pattern";
        q.llIllIII[q.llIllIIl[140]] = q."Hard leather";
        q.llIllIII[q.llIllIIl[142]] = q."Bookcase";
        q.llIllIII[q.llIllIIl[143]] = q."Search";
        q.llIllIII[q.llIllIIl[144]] = q."Nav to start";
        q.llIllIII[q.llIllIIl[145]] = q."Ava";
        q.llIllIII[q.llIllIIl[99]] = q."Bookcase";
        q.llIllIII[q.llIllIIl[146]] = q."Search";
        q.llIllIII[q.llIllIIl[159]] = q."";
        q.llIllIII[q.llIllIIl[160]] = q."Animal Magnetism";
        q.llIllIII[q.llIllIIl[161]] = q."ring of wealth (";
        q.llIllIII[q.llIllIIl[162]] = q."Drop";
        q.llIllIII[q.llIllIIl[173]] = q."Yes.";
        q.llIllIII[q.llIllIIl[174]] = q."I'm here about a quest.";
        q.llIllIII[q.llIllIIl[175]] = q."Okay, you need it more than I do, I suppose.";
        q.llIllIII[q.llIllIIl[176]] = q."Could I buy those chickens now, then?";
        q.llIllIII[q.llIllIIl[100]] = q."Could I buy 2 chickens?";
        q.llIllIII[q.llIllIIl[177]] = q."I'm here about a quest.";
        q.llIllIII[q.llIllIIl[178]] = q."Hello, I'm here about those trees again.";
        q.llIllIII[q.llIllIIl[179]] = q."I'd love one, thanks.";
        q.llIllIII[q.llIllIIl[180]] = q."";
    }

    public static void aC() {
        block115: {
            WorldPoint lIlIIlIIIllIllI;
            Object lIlIIlIIIllIlll;
            block116: {
                block123: {
                    block118: {
                        block122: {
                            block121: {
                                block120: {
                                    block119: {
                                        block117: {
                                            if (q.lIllIllIIII(bz ? 1 : 0)) {
                                                b.a(bB);
                                                if (q.lIllIllIIIl(bB.size(), llIllIIl[0])) {
                                                    System.out.println(llIllIII[llIllIIl[1]]);
                                                    bz = llIllIIl[1];
                                                }
                                            }
                                            if (!q.lIllIllIIlI(bz ? 1 : 0) || !q.lIllIllIIIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[2])) break block115;
                                            if (q.lIllIllIIIl(e.j(llIllIIl[3]), llIllIIl[4])) {
                                                cr = llIllIII[llIllIIl[0]];
                                                y.bl();
                                            }
                                            if (q.lIllIllIIll(e.j(llIllIIl[3]), llIllIIl[4]) && (!q.lIllIllIlII(e.j(llIllIIl[5]), llIllIIl[6]) || q.lIllIllIIIl(e.j(llIllIIl[7]), llIllIIl[8]))) {
                                                cr = llIllIII[llIllIIl[9]];
                                                t.aK();
                                            }
                                            if (q.lIllIllIIll(e.j(llIllIIl[3]), llIllIIl[4]) && q.lIllIllIlII(e.j(llIllIIl[5]), llIllIIl[6]) && q.lIllIllIlII(e.j(llIllIIl[7]), llIllIIl[8]) && q.lIllIllIIIl(e.j(llIllIIl[10]), llIllIIl[11])) {
                                                cr = llIllIII[llIllIIl[11]];
                                                B.bF();
                                            }
                                            if (q.lIllIllIIll(e.j(llIllIIl[3]), llIllIIl[4]) && q.lIllIllIlII(e.j(llIllIIl[5]), llIllIIl[6]) && q.lIllIllIlII(e.j(llIllIIl[7]), llIllIIl[8]) && q.lIllIllIIll(e.j(llIllIIl[10]), llIllIIl[11]) && q.lIllIllIIIl(Skills.getLevel((Skill)Skill.CRAFTING), llIllIIl[12])) {
                                                cr = llIllIII[llIllIIl[13]];
                                                M.cK();
                                            }
                                            if (q.lIllIllIIll(e.j(llIllIIl[3]), llIllIIl[4]) && q.lIllIllIlII(e.j(llIllIIl[5]), llIllIIl[6]) && q.lIllIllIlII(e.j(llIllIIl[7]), llIllIIl[8]) && q.lIllIllIIll(e.j(llIllIIl[10]), llIllIIl[11]) && q.lIllIllIlII(Skills.getLevel((Skill)Skill.CRAFTING), llIllIIl[12]) && q.lIllIllIIIl(Skills.getLevel((Skill)Skill.WOODCUTTING), llIllIIl[14])) {
                                                cr = llIllIII[llIllIIl[8]];
                                                P.dj();
                                            }
                                            if (q.lIllIllIIll(e.j(llIllIIl[3]), llIllIIl[4]) && q.lIllIllIlII(e.j(llIllIIl[5]), llIllIIl[6]) && q.lIllIllIlII(e.j(llIllIIl[7]), llIllIIl[8]) && q.lIllIllIIll(e.j(llIllIIl[10]), llIllIIl[11]) && q.lIllIllIlII(Skills.getLevel((Skill)Skill.CRAFTING), llIllIIl[12]) && q.lIllIllIlII(Skills.getLevel((Skill)Skill.WOODCUTTING), llIllIIl[14]) && q.lIllIllIIIl(Skills.getLevel((Skill)Skill.RANGED), llIllIIl[15])) {
                                                cr = llIllIII[llIllIIl[16]];
                                                if (q.lIllIllIIIl(cq, llIllIIl[0])) {
                                                    n.ca = llIllIIl[1];
                                                    cq += llIllIIl[0];
                                                }
                                                m.aq();
                                            }
                                            if (q.lIllIllIIll(e.j(llIllIIl[3]), llIllIIl[4]) && q.lIllIllIlII(e.j(llIllIIl[5]), llIllIIl[6]) && q.lIllIllIlII(e.j(llIllIIl[7]), llIllIIl[8]) && q.lIllIllIIll(e.j(llIllIIl[10]), llIllIIl[11]) && q.lIllIllIlII(Skills.getLevel((Skill)Skill.CRAFTING), llIllIIl[12]) && q.lIllIllIlII(Skills.getLevel((Skill)Skill.WOODCUTTING), llIllIIl[14]) && q.lIllIllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIIl[15])) {
                                                if (!q.lIllIllIlII(e.j(llIllIIl[17]), llIllIIl[18]) || q.lIllIllIIIl(Skills.getLevel((Skill)Skill.HUNTER), llIllIIl[19])) {
                                                    cr = llIllIII[llIllIIl[20]];
                                                    x.bi();
                                                }
                                                if (q.lIllIllIlII(e.j(llIllIIl[17]), llIllIIl[18]) && q.lIllIllIlII(Skills.getLevel((Skill)Skill.HUNTER), llIllIIl[19]) && q.lIllIllIIIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), llIllIIl[6])) {
                                                    cr = llIllIII[llIllIIl[21]];
                                                    v.bd();
                                                }
                                                if (q.lIllIllIlII(e.j(llIllIIl[17]), llIllIIl[18]) && q.lIllIllIlII(Skills.getLevel((Skill)Skill.HUNTER), llIllIIl[19]) && q.lIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), llIllIIl[6]) && q.lIllIllIIIl(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIllIIl[22])) {
                                                    cr = llIllIII[llIllIIl[19]];
                                                    p.aA();
                                                }
                                                if (q.lIllIllIlII(e.j(llIllIIl[17]), llIllIIl[18]) && q.lIllIllIlII(Skills.getLevel((Skill)Skill.HUNTER), llIllIIl[19]) && q.lIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), llIllIIl[6]) && q.lIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIllIIl[22]) && q.lIllIllIIIl(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIllIIl[19])) {
                                                    String[] stringArray = new String[llIllIIl[0]];
                                                    stringArray[q.llIllIIl[1]] = llIllIII[llIllIIl[4]];
                                                    if (q.lIllIllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        cr = llIllIII[llIllIIl[23]];
                                                        r.aF();
                                                    }
                                                }
                                                r.aG();
                                            }
                                            if (!q.lIllIllIIlI(q.ac() ? 1 : 0) || !q.lIllIllIIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId())) || !q.lIllIllIlII(e.j(llIllIIl[17]), llIllIIl[18]) || !q.lIllIllIlII(Skills.getLevel((Skill)Skill.HUNTER), llIllIIl[19]) || !q.lIllIllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIIl[15]) || !q.lIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), llIllIIl[6]) || !q.lIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIllIIl[22]) || !q.lIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIllIIl[19])) break block116;
                                            String[] stringArray = new String[llIllIIl[0]];
                                            stringArray[q.llIllIIl[1]] = llIllIII[llIllIIl[24]];
                                            if (!q.lIllIllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block116;
                                            cr = llIllIII[llIllIIl[25]];
                                            lIlIIlIIIllIlll = BankLocation.getNearest();
                                            if (q.lIllIllIlIl(lIlIIlIIIllIlll) && q.lIllIllIIlI(lIlIIlIIIllIlll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderBarrows.c = llIllIII[llIllIIl[26]];
                                                a.a((BankLocation)lIlIIlIIIllIlll);
                                            }
                                            if (!q.lIllIllIlIl(lIlIIlIIIllIlll) || !q.lIllIllIIII(lIlIIlIIIllIlll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block116;
                                            if (q.lIllIllIIlI(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIllIIl[27]);
                                                0;
                                            }
                                            if (!q.lIllIllIIII(Bank.isOpen() ? 1 : 0)) break block116;
                                            AccBuilderBarrows.c = llIllIII[llIllIIl[28]];
                                            if (q.lIllIllIllI(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)llIllIIl[13]);
                                                0;
                                            }
                                            if (q.lIllIllIllI(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)llIllIIl[9]);
                                                0;
                                            }
                                            int[] nArray = new int[llIllIIl[0]];
                                            nArray[q.llIllIIl[1]] = llIllIIl[29];
                                            if (!q.lIllIllIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block117;
                                            int[] nArray2 = new int[llIllIIl[0]];
                                            nArray2[q.llIllIIl[1]] = llIllIIl[29];
                                            if (!q.lIllIllIlII(Bank.getFirst((int[])nArray2).getQuantity(), llIllIIl[8])) break block118;
                                        }
                                        int[] nArray = new int[llIllIIl[0]];
                                        nArray[q.llIllIIl[1]] = llIllIIl[30];
                                        if (!q.lIllIllIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block119;
                                        int[] nArray3 = new int[llIllIIl[0]];
                                        nArray3[q.llIllIIl[1]] = llIllIIl[30];
                                        if (!q.lIllIllIlII(Bank.getFirst((int[])nArray3).getQuantity(), llIllIIl[16])) break block118;
                                    }
                                    int[] nArray = new int[llIllIIl[0]];
                                    nArray[q.llIllIIl[1]] = llIllIIl[31];
                                    if (!q.lIllIllIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block120;
                                    int[] nArray4 = new int[llIllIIl[0]];
                                    nArray4[q.llIllIIl[1]] = llIllIIl[31];
                                    if (!q.lIllIllIlII(Bank.getFirst((int[])nArray4).getQuantity(), llIllIIl[28])) break block118;
                                }
                                int[] nArray = new int[llIllIIl[0]];
                                nArray[q.llIllIIl[1]] = llIllIIl[32];
                                if (!q.lIllIllIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block121;
                                int[] nArray5 = new int[llIllIIl[0]];
                                nArray5[q.llIllIIl[1]] = llIllIIl[32];
                                if (!q.lIllIllIlII(Bank.getFirst((int[])nArray5).getQuantity(), llIllIIl[13])) break block118;
                            }
                            int[] nArray = new int[llIllIIl[0]];
                            nArray[q.llIllIIl[1]] = llIllIIl[33];
                            if (!q.lIllIllIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block122;
                            int[] nArray6 = new int[llIllIIl[0]];
                            nArray6[q.llIllIIl[1]] = llIllIIl[33];
                            if (!q.lIllIllIlII(Bank.getFirst((int[])nArray6).getQuantity(), llIllIIl[8])) break block118;
                        }
                        int[] nArray = new int[llIllIIl[0]];
                        nArray[q.llIllIIl[1]] = llIllIIl[34];
                        if (!q.lIllIllIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block123;
                        int[] nArray7 = new int[llIllIIl[0]];
                        nArray7[q.llIllIIl[1]] = llIllIIl[34];
                        if (!q.lIllIllIIIl(Bank.getFirst((int[])nArray7).getQuantity(), llIllIIl[13])) break block123;
                    }
                    q.ag();
                    System.out.println(llIllIII[llIllIIl[35]]);
                    bz = llIllIIl[0];
                    return;
                }
                int[] nArray = new int[llIllIIl[23]];
                nArray[q.llIllIIl[1]] = llIllIIl[36];
                nArray[q.llIllIIl[0]] = llIllIIl[37];
                nArray[q.llIllIIl[9]] = llIllIIl[33];
                nArray[q.llIllIIl[11]] = llIllIIl[38];
                nArray[q.llIllIIl[13]] = llIllIIl[32];
                nArray[q.llIllIIl[8]] = llIllIIl[34];
                nArray[q.llIllIIl[16]] = llIllIIl[39];
                nArray[q.llIllIIl[20]] = llIllIIl[40];
                nArray[q.llIllIIl[21]] = llIllIIl[41];
                nArray[q.llIllIIl[19]] = llIllIIl[30];
                nArray[q.llIllIIl[4]] = llIllIIl[31];
                if (q.lIllIllIIlI(e.b(nArray) ? 1 : 0)) {
                    q.ag();
                    System.out.println(llIllIII[llIllIIl[42]]);
                    bz = llIllIIl[0];
                    return;
                }
                int[] nArray8 = new int[llIllIIl[23]];
                nArray8[q.llIllIIl[1]] = llIllIIl[36];
                nArray8[q.llIllIIl[0]] = llIllIIl[37];
                nArray8[q.llIllIIl[9]] = llIllIIl[33];
                nArray8[q.llIllIIl[11]] = llIllIIl[38];
                nArray8[q.llIllIIl[13]] = llIllIIl[32];
                nArray8[q.llIllIIl[8]] = llIllIIl[34];
                nArray8[q.llIllIIl[16]] = llIllIIl[39];
                nArray8[q.llIllIIl[20]] = llIllIIl[40];
                nArray8[q.llIllIIl[21]] = llIllIIl[41];
                nArray8[q.llIllIIl[19]] = llIllIIl[30];
                nArray8[q.llIllIIl[4]] = llIllIIl[31];
                if (q.lIllIllIIII(e.b(nArray8) ? 1 : 0)) {
                    a.a(llIllIIl[34], llIllIIl[13]);
                    a.a(llIllIIl[37], llIllIIl[0]);
                    a.a(llIllIIl[43], llIllIIl[0]);
                    a.a(llIllIIl[32], llIllIIl[13]);
                    a.a(llIllIIl[29], llIllIIl[13]);
                    a.a(llIllIIl[40], llIllIIl[0]);
                    a.a(llIllIIl[41], llIllIIl[0]);
                    a.a(llIllIIl[36], llIllIIl[4]);
                    a.a(llIllIIl[30], llIllIIl[4]);
                    a.a(llIllIIl[31], llIllIIl[28]);
                    a.a(llIllIIl[44], llIllIIl[0]);
                    a.a(llIllIIl[45], llIllIIl[27]);
                }
            }
            if (q.lIllIllIIII(Inventory.contains((int[])f.bb) ? 1 : 0) && q.lIllIllIIIl(Movement.getRunEnergy(), llIllIIl[15])) {
                Inventory.getFirst((int[])f.bb).interact(llIllIII[llIllIIl[46]]);
                Time.sleepTicks((int)llIllIIl[0]);
                0;
            }
            if (q.lIllIllIIII(Inventory.contains((int[])f.aY) ? 1 : 0) && q.lIllIllIIIl(Prayers.getPoints(), llIllIIl[47])) {
                Inventory.getFirst((int[])f.aY).interact(llIllIII[llIllIIl[12]]);
            }
            if (q.lIllIllIlll(q.lIllIlIllll(e.v(), 60.0))) {
                String[] stringArray = new String[llIllIIl[0]];
                stringArray[q.llIllIIl[1]] = llIllIII[llIllIIl[48]];
                if (q.lIllIllIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[llIllIIl[0]];
                    stringArray2[q.llIllIIl[1]] = llIllIII[llIllIIl[49]];
                    Inventory.getFirst((String[])stringArray2).interact(llIllIII[llIllIIl[50]]);
                    Time.sleepTicks((int)llIllIIl[9]);
                    0;
                }
            }
            if (q.lIllIllIIII(q.ac() ? 1 : 0) && q.lIllIllIIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()))) {
                if (q.lIllIllIIlI(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && q.lIllIlllIII(Players.getLocal().getWorldLocation().distanceTo(ce), llIllIIl[21])) {
                    AccBuilderBarrows.c = llIllIII[llIllIIl[51]];
                    if (q.lIllIllIIII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)ce);
                    0;
                    Time.sleepTicks((int)llIllIIl[0]);
                    0;
                }
                if (q.lIllIllIIII(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && q.lIllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(ce), llIllIIl[21])) {
                    ci = llIllIIl[1];
                    g.a(llIllIII[llIllIIl[47]], bX);
                }
                if (q.lIllIllIIII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIllIIl[52], llIllIIl[53], llIllIIl[1])) ? 1 : 0)) {
                    String[] stringArray = new String[llIllIIl[0]];
                    stringArray[q.llIllIIl[1]] = llIllIII[llIllIIl[54]];
                    TileObjects.getNearest((String[])stringArray).interact(llIllIII[llIllIIl[55]]);
                    Time.sleepTicks((int)llIllIIl[9]);
                    0;
                }
                if (q.lIllIllIIII((lIlIIlIIIllIlll = new WorldArea(llIllIIl[52], llIllIIl[56], llIllIIl[16], llIllIIl[4], llIllIIl[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[llIllIIl[0]];
                    stringArray[q.llIllIIl[1]] = llIllIII[llIllIIl[57]];
                    TileObjects.getNearest((String[])stringArray).interact(llIllIII[llIllIIl[58]]);
                    Time.sleepTicks((int)llIllIIl[9]);
                    0;
                }
            }
            if (q.lIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[4])) {
                int[] nArray = new int[llIllIIl[0]];
                nArray[q.llIllIIl[1]] = llIllIIl[44];
                if (q.lIllIllIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray9 = new int[llIllIIl[0]];
                    nArray9[q.llIllIIl[1]] = llIllIIl[44];
                    Inventory.getFirst((int[])nArray9).interact(llIllIII[llIllIIl[59]]);
                }
                int[] nArray10 = new int[llIllIIl[0]];
                nArray10[q.llIllIIl[1]] = llIllIIl[60];
                if (q.lIllIllIIlI(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                    block114: {
                        lIlIIlIIIllIlll = new WorldPoint(llIllIIl[61], llIllIIl[62], llIllIIl[1]);
                        int[] nArray11 = new int[llIllIIl[0]];
                        nArray11[q.llIllIIl[1]] = llIllIIl[63];
                        if (q.lIllIllIIlI(Inventory.contains((int[])nArray11) ? 1 : 0) && q.lIllIlllIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlIIlIIIllIlll), llIllIIl[48])) {
                            if (q.lIllIlllIII(Players.getLocal().getWorldLocation().distanceTo(co), llIllIIl[8])) {
                                AccBuilderBarrows.c = llIllIII[llIllIIl[64]];
                                Movement.walkTo((WorldPoint)co);
                                0;
                                Time.sleepTicks((int)llIllIIl[0]);
                                0;
                            }
                            if (q.lIllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(co), llIllIIl[8])) {
                                if (q.lIllIllIIlI(Shop.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[llIllIIl[0]];
                                    stringArray[q.llIllIIl[1]] = llIllIII[llIllIIl[65]];
                                    NPCs.getNearest((String[])stringArray).interact(llIllIII[llIllIIl[10]]);
                                    Time.sleepTicks((int)llIllIIl[9]);
                                    0;
                                }
                                if (q.lIllIllIIII(Shop.isOpen() ? 1 : 0)) {
                                    Shop.buyFive((int)llIllIIl[63]);
                                    Time.sleepTicks((int)llIllIIl[11]);
                                    0;
                                }
                            }
                        }
                        int[] nArray12 = new int[llIllIIl[0]];
                        nArray12[q.llIllIIl[1]] = llIllIIl[63];
                        if (q.lIllIllIIII(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                            if (q.lIllIllIIlI(cm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && q.lIllIllIIlI(cn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                int[] nArray13 = new int[llIllIIl[0]];
                                nArray13[q.llIllIIl[1]] = llIllIIl[31];
                                if (q.lIllIllIIII(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                    int[] nArray14 = new int[llIllIIl[0]];
                                    nArray14[q.llIllIIl[1]] = llIllIIl[31];
                                    Inventory.getFirst((int[])nArray14).interact(llIllIII[llIllIIl[66]]);
                                    Time.sleepTicks((int)llIllIIl[20]);
                                    0;
                                }
                            }
                            if (!q.lIllIllIIlI(cm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || q.lIllIllIIII(cn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                lIlIIlIIIllIllI = new WorldPoint(llIllIIl[61], llIllIIl[62], llIllIIl[1]);
                                if (q.lIllIlllIII(Players.getLocal().getWorldLocation().distanceTo(lIlIIlIIIllIllI), llIllIIl[8]) && q.lIllIllIIlI(Players.getLocal().getWorldLocation().getPlane())) {
                                    AccBuilderBarrows.c = llIllIII[llIllIIl[67]];
                                    Movement.walkTo((WorldPoint)lIlIIlIIIllIllI);
                                    0;
                                    Time.sleepTicks((int)llIllIIl[0]);
                                    0;
                                }
                                String[] stringArray = new String[llIllIIl[0]];
                                stringArray[q.llIllIIl[1]] = llIllIII[llIllIIl[14]];
                                if (q.lIllIllIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                    if (q.lIllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(lIlIIlIIIllIllI), llIllIIl[8]) && q.lIllIllIIlI(Players.getLocal().getWorldLocation().getPlane())) {
                                        String[] stringArray3 = new String[llIllIIl[0]];
                                        stringArray3[q.llIllIIl[1]] = llIllIII[llIllIIl[68]];
                                        TileObjects.getNearest((String[])stringArray3).interact(llIllIII[llIllIIl[69]]);
                                        Time.sleepTicks((int)llIllIIl[13]);
                                        0;
                                    }
                                    String[] stringArray4 = new String[llIllIIl[0]];
                                    stringArray4[q.llIllIIl[1]] = llIllIII[llIllIIl[70]];
                                    if (q.lIllIllIlIl(TileObjects.getNearest((String[])stringArray4))) {
                                        String[] stringArray5 = new String[llIllIIl[0]];
                                        stringArray5[q.llIllIIl[1]] = llIllIII[llIllIIl[71]];
                                        if (q.lIllIllIIII(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                                            String[] stringArray6 = new String[llIllIIl[0]];
                                            stringArray6[q.llIllIIl[1]] = llIllIII[llIllIIl[22]];
                                            String[] stringArray7 = new String[llIllIIl[0]];
                                            stringArray7[q.llIllIIl[1]] = llIllIII[llIllIIl[72]];
                                            Inventory.getFirst((String[])stringArray6).useOn(TileObjects.getNearest((String[])stringArray7));
                                            Time.sleep((long)e.c(llIllIIl[73], llIllIIl[74]));
                                            0;
                                        }
                                    }
                                }
                                String[] stringArray8 = new String[llIllIIl[0]];
                                stringArray8[q.llIllIIl[1]] = llIllIII[llIllIIl[75]];
                                if (q.lIllIllIIlI(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                                    if (q.lIllIllIIll(Players.getLocal().getWorldLocation().getPlane(), llIllIIl[0])) {
                                        String[] stringArray9 = new String[llIllIIl[0]];
                                        stringArray9[q.llIllIIl[1]] = llIllIII[llIllIIl[76]];
                                        TileObjects.getNearest((String[])stringArray9).interact(llIllIII[llIllIIl[77]]);
                                        Time.sleepTicks((int)llIllIIl[8]);
                                        0;
                                    }
                                    if (q.lIllIllIIlI(Players.getLocal().getWorldLocation().getPlane())) {
                                        do {
                                            String[] stringArray10 = new String[llIllIIl[0]];
                                            stringArray10[q.llIllIIl[1]] = llIllIII[llIllIIl[78]];
                                            if (!q.lIllIllIIII(Inventory.contains((String[])stringArray10) ? 1 : 0)) break block114;
                                            String[] stringArray11 = new String[llIllIIl[0]];
                                            stringArray11[q.llIllIIl[1]] = llIllIII[llIllIIl[79]];
                                            TileObjects.getNearest((String[])stringArray11).interact(llIllIII[llIllIIl[80]]);
                                            Time.sleepTicks((int)llIllIIl[9]);
                                            0;
                                            0;
                                        } while (((50 + 101 - 37 + 101 ^ 138 + 63 - 99 + 79) & (0xF5 ^ 0x82 ^ (0x34 ^ 0x21) ^ -1)) != (72 + 32 - -2 + 66 ^ 141 + 109 - 117 + 35));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    int[] nArray15 = new int[llIllIIl[0]];
                    nArray15[q.llIllIIl[1]] = llIllIIl[32];
                    if (q.lIllIllIIlI(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                        String[] stringArray = new String[llIllIIl[0]];
                        stringArray[q.llIllIIl[1]] = llIllIII[llIllIIl[81]];
                        if (q.lIllIllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0) && q.lIllIlllIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlIIlIIIllIlll), llIllIIl[48])) {
                            if (q.lIllIllIIlI(Dialog.isOpen() ? 1 : 0)) {
                                g.a(llIllIII[llIllIIl[82]], bX);
                                Time.sleepTicks((int)llIllIIl[0]);
                                0;
                            }
                            g.a(bX);
                        }
                    }
                }
                int[] nArray16 = new int[llIllIIl[0]];
                nArray16[q.llIllIIl[1]] = llIllIIl[60];
                if (q.lIllIllIIII(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[llIllIIl[9]];
                    nArray17[q.llIllIIl[1]] = llIllIIl[83];
                    nArray17[q.llIllIIl[0]] = llIllIIl[29];
                    if (q.lIllIllIIII(Inventory.contains((int[])nArray17) ? 1 : 0)) {
                        int[] nArray18 = new int[llIllIIl[9]];
                        nArray18[q.llIllIIl[1]] = llIllIIl[83];
                        nArray18[q.llIllIIl[0]] = llIllIIl[29];
                        Inventory.getAll((int[])nArray18).stream().forEach(item -> item.interact(llIllIII[llIllIIl[162]]));
                    }
                    if (q.lIllIlllIII(Players.getLocal().getWorldLocation().distanceTo(cp), llIllIIl[20])) {
                        Movement.walkTo((WorldPoint)cp);
                        0;
                        Time.sleepTicks((int)llIllIIl[0]);
                        0;
                    }
                    if (q.lIllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(cp), llIllIIl[20])) {
                        g.a(llIllIII[llIllIIl[15]], bX);
                    }
                }
            }
            if (q.lIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[48])) {
                g.a(llIllIII[llIllIIl[84]], bX);
            }
            if (q.lIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[64])) {
                g.a(llIllIII[llIllIIl[85]], bX);
            }
            if (q.lIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[22])) {
                g.a(llIllIII[llIllIIl[86]], bX);
            }
            if (q.lIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[15])) {
                g.a(llIllIII[llIllIIl[87]], bX);
            }
            if (q.lIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[6])) {
                g.a(llIllIII[llIllIIl[88]], bX);
            }
            if (!q.lIllIlllIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[89]) || q.lIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[90])) {
                lIlIIlIIIllIlll = new WorldPoint(llIllIIl[91], llIllIIl[92], llIllIIl[1]);
                if (q.lIllIlllIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlIIlIIIllIlll), llIllIIl[11])) {
                    AccBuilderBarrows.c = llIllIII[llIllIIl[93]];
                    Movement.walkTo((WorldPoint)lIlIIlIIIllIlll);
                    0;
                    Time.sleepTicks((int)llIllIIl[0]);
                    0;
                }
                if (q.lIllIlllIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlIIlIIIllIlll), llIllIIl[11])) {
                    g.a(llIllIII[llIllIIl[94]], bX);
                }
            }
            if (q.lIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[95])) {
                if (q.lIllIlllIII(Players.getLocal().getWorldLocation().distanceTo(cp), llIllIIl[20])) {
                    Movement.walkTo((WorldPoint)cp);
                    0;
                    Time.sleepTicks((int)llIllIIl[0]);
                    0;
                }
                if (q.lIllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(cp), llIllIIl[20])) {
                    g.a(llIllIII[llIllIIl[96]], bX);
                }
            }
            if (q.lIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[97])) {
                g.a(llIllIII[llIllIIl[98]], bX);
            }
            if (!q.lIllIlllIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[99]) || q.lIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[100])) {
                g.a(llIllIII[llIllIIl[6]], bX);
            }
            if (q.lIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[100])) {
                String[] stringArray = new String[llIllIIl[0]];
                stringArray[q.llIllIIl[1]] = llIllIII[llIllIIl[101]];
                if (q.lIllIllIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray12 = new String[llIllIIl[0]];
                    stringArray12[q.llIllIIl[1]] = llIllIII[llIllIIl[102]];
                    if (q.lIllIllIIlI(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                        lIlIIlIIIllIlll = new HashMap();
                        ((HashMap)lIlIIlIIIllIlll).put(llIllIIl[33], llIllIIl[8]);
                        0;
                        ((HashMap)lIlIIlIIIllIlll).put(llIllIIl[38], llIllIIl[0]);
                        0;
                        ((HashMap)lIlIIlIIIllIlll).put(llIllIIl[39], llIllIIl[0]);
                        0;
                        ((HashMap)lIlIIlIIIllIlll).put(llIllIIl[103], llIllIIl[0]);
                        0;
                        e.a((HashMap<Integer, Integer>)lIlIIlIIIllIlll, llIllIIl[1], llIllIIl[1]);
                    }
                    String[] stringArray13 = new String[llIllIIl[0]];
                    stringArray13[q.llIllIIl[1]] = llIllIII[llIllIIl[104]];
                    if (q.lIllIllIIII(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        q.aD();
                    }
                }
            }
            if (!q.lIllIlllIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[105]) || q.lIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[106])) {
                String[] stringArray = new String[llIllIIl[0]];
                stringArray[q.llIllIIl[1]] = llIllIII[llIllIIl[107]];
                lIlIIlIIIllIlll = NPCs.getNearest((String[])stringArray);
                if (q.lIllIllIlIl(lIlIIlIIIllIlll)) {
                    if (q.lIllIllIIII(Reachable.isInteractable((Locatable)lIlIIlIIIllIlll) ? 1 : 0)) {
                        g.a(llIllIII[llIllIIl[3]], bX);
                    }
                    if (q.lIllIllIIlI(Reachable.isInteractable((Locatable)lIlIIlIIIllIlll) ? 1 : 0)) {
                        Movement.walkTo((Locatable)lIlIIlIIIllIlll);
                        0;
                        Time.sleepTicks((int)llIllIIl[0]);
                        0;
                    }
                }
            }
            if (q.lIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[108])) {
                String[] stringArray = new String[llIllIIl[0]];
                stringArray[q.llIllIIl[1]] = llIllIII[llIllIIl[109]];
                if (q.lIllIllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    lIlIIlIIIllIlll = new WorldPoint(llIllIIl[110], llIllIIl[111], llIllIIl[1]);
                    lIlIIlIIIllIllI = new WorldPoint(llIllIIl[110], llIllIIl[112], llIllIIl[1]);
                    if (q.lIllIllIIlI(Players.getLocal().getWorldLocation().equals(lIlIIlIIIllIlll) ? 1 : 0) && q.lIllIllIIlI(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIIIllIllI) ? 1 : 0)) {
                        AccBuilderBarrows.c = llIllIII[llIllIIl[113]];
                        Movement.walkTo((WorldPoint)lIlIIlIIIllIlll);
                        0;
                        Time.sleepTicks((int)llIllIIl[0]);
                        0;
                    }
                    if (q.lIllIllIIII(Players.getLocal().getWorldLocation().equals(lIlIIlIIIllIlll) ? 1 : 0) && q.lIllIllIIlI(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIIIllIllI) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)lIlIIlIIIllIllI);
                        0;
                    }
                    if (q.lIllIllIIII(Players.getLocal().getWorldLocation().equals((Object)lIlIIlIIIllIllI) ? 1 : 0)) {
                        String[] stringArray14 = new String[llIllIIl[0]];
                        stringArray14[q.llIllIIl[1]] = llIllIII[llIllIIl[114]];
                        String[] stringArray15 = new String[llIllIIl[0]];
                        stringArray15[q.llIllIIl[1]] = llIllIII[llIllIIl[115]];
                        Inventory.getFirst((String[])stringArray14).useOn(Inventory.getFirst((String[])stringArray15));
                        Time.sleepTicks((int)llIllIIl[11]);
                        0;
                    }
                }
                String[] stringArray16 = new String[llIllIIl[0]];
                stringArray16[q.llIllIIl[1]] = llIllIII[llIllIIl[89]];
                if (q.lIllIllIIII(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                    q.aD();
                }
            }
            if (q.lIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[116])) {
                lIlIIlIIIllIlll = new WorldPoint(llIllIIl[117], llIllIIl[118], llIllIIl[1]);
                if (q.lIllIllIIlI(Players.getLocal().getWorldLocation().equals(lIlIIlIIIllIlll) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)lIlIIlIIIllIlll);
                    0;
                    Time.sleepTicks((int)llIllIIl[0]);
                    0;
                }
                if (q.lIllIllIIII(Players.getLocal().getWorldLocation().equals(lIlIIlIIIllIlll) ? 1 : 0)) {
                    String[] stringArray = new String[llIllIIl[0]];
                    stringArray[q.llIllIIl[1]] = llIllIII[llIllIIl[119]];
                    NPCs.getNearest((String[])stringArray).interact(llIllIII[llIllIIl[120]]);
                    Time.sleepTicks((int)llIllIIl[0]);
                    0;
                }
            }
            if (!q.lIllIlllIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[121]) || q.lIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[122])) {
                lIlIIlIIIllIlll = new WorldPoint(llIllIIl[123], llIllIIl[124], llIllIIl[1]);
                if (q.lIllIlllIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlIIlIIIllIlll), llIllIIl[9])) {
                    if (q.lIllIllIIII(Inventory.contains((int[])f.aU) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.aU).interact(llIllIII[llIllIIl[90]]);
                    }
                    AccBuilderBarrows.c = llIllIII[llIllIIl[125]];
                    Movement.walkTo((WorldPoint)lIlIIlIIIllIlll);
                    0;
                    Time.sleepTicks((int)llIllIIl[0]);
                    0;
                }
                if (q.lIllIlllIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlIIlIIIllIlll), llIllIIl[9])) {
                    String[] stringArray = new String[llIllIIl[0]];
                    stringArray[q.llIllIIl[1]] = llIllIII[llIllIIl[126]];
                    lIlIIlIIIllIllI = NPCs.getNearest((String[])stringArray);
                    if (q.lIllIllIlIl(lIlIIlIIIllIllI)) {
                        if (q.lIllIllIIII(Reachable.isInteractable((Locatable)lIlIIlIIIllIllI) ? 1 : 0)) {
                            g.a(llIllIII[llIllIIl[95]], bX);
                        }
                        if (q.lIllIllIIlI(Reachable.isInteractable((Locatable)lIlIIlIIIllIllI) ? 1 : 0)) {
                            Movement.walkTo((Locatable)lIlIIlIIIllIllI);
                            0;
                            Time.sleepTicks((int)llIllIIl[0]);
                            0;
                        }
                    }
                }
            }
            if (q.lIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[127])) {
                String[] stringArray = new String[llIllIIl[0]];
                stringArray[q.llIllIIl[1]] = llIllIII[llIllIIl[128]];
                if (q.lIllIllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    lIlIIlIIIllIlll = new WorldPoint(llIllIIl[117], llIllIIl[118], llIllIIl[1]);
                    if (q.lIllIllIIlI(Players.getLocal().getWorldLocation().equals(lIlIIlIIIllIlll) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)lIlIIlIIIllIlll);
                        0;
                        Time.sleepTicks((int)llIllIIl[0]);
                        0;
                    }
                    if (q.lIllIllIIII(Players.getLocal().getWorldLocation().equals(lIlIIlIIIllIlll) ? 1 : 0)) {
                        String[] stringArray17 = new String[llIllIIl[0]];
                        stringArray17[q.llIllIIl[1]] = llIllIII[llIllIIl[129]];
                        NPCs.getNearest((String[])stringArray17).interact(llIllIII[llIllIIl[130]]);
                        Time.sleepTicks((int)llIllIIl[0]);
                        0;
                    }
                }
                String[] stringArray18 = new String[llIllIIl[0]];
                stringArray18[q.llIllIIl[1]] = llIllIII[llIllIIl[97]];
                if (q.lIllIllIIII(Inventory.contains((String[])stringArray18) ? 1 : 0)) {
                    q.aD();
                }
            }
            if (q.lIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[131])) {
                q.aD();
            }
            if (q.lIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[132])) {
                if (q.lIllIllIIII(Widgets.get((int)llIllIIl[133]).isEmpty() ? 1 : 0)) {
                    String[] stringArray = new String[llIllIIl[0]];
                    stringArray[q.llIllIIl[1]] = llIllIII[llIllIIl[134]];
                    Inventory.getFirst((String[])stringArray).interact(llIllIII[llIllIIl[135]]);
                    Time.sleepTicks((int)llIllIIl[13]);
                    0;
                }
                if (q.lIllIllIIlI(Widgets.get((int)llIllIIl[133]).isEmpty() ? 1 : 0)) {
                    Mouse.click((int)Widgets.get((int)llIllIIl[133], (int)llIllIIl[55]).getClickPoint().getX(), (int)Widgets.get((int)llIllIIl[133], (int)llIllIIl[55]).getClickPoint().getY(), (boolean)llIllIIl[0]);
                    Time.sleepTicks((int)llIllIIl[9]);
                    0;
                    Mouse.click((int)Widgets.get((int)llIllIIl[133], (int)llIllIIl[65]).getClickPoint().getX(), (int)Widgets.get((int)llIllIIl[133], (int)llIllIIl[65]).getClickPoint().getY(), (boolean)llIllIIl[0]);
                    Time.sleepTicks((int)llIllIIl[9]);
                    0;
                    Mouse.click((int)Widgets.get((int)llIllIIl[133], (int)llIllIIl[67]).getClickPoint().getX(), (int)Widgets.get((int)llIllIIl[133], (int)llIllIIl[67]).getClickPoint().getY(), (boolean)llIllIIl[0]);
                    Time.sleepTicks((int)llIllIIl[9]);
                    0;
                    Mouse.click((int)Widgets.get((int)llIllIIl[133], (int)llIllIIl[22]).getClickPoint().getX(), (int)Widgets.get((int)llIllIIl[133], (int)llIllIIl[22]).getClickPoint().getY(), (boolean)llIllIIl[0]);
                    Time.sleepTicks((int)llIllIIl[9]);
                    0;
                    Mouse.click((int)Widgets.get((int)llIllIIl[133], (int)llIllIIl[76]).getClickPoint().getX(), (int)Widgets.get((int)llIllIIl[133], (int)llIllIIl[76]).getClickPoint().getY(), (boolean)llIllIIl[0]);
                    Time.sleepTicks((int)llIllIIl[9]);
                    0;
                    Mouse.click((int)Widgets.get((int)llIllIIl[133], (int)llIllIIl[79]).getClickPoint().getX(), (int)Widgets.get((int)llIllIIl[133], (int)llIllIIl[79]).getClickPoint().getY(), (boolean)llIllIIl[0]);
                    Time.sleepTicks((int)llIllIIl[8]);
                    0;
                }
            }
            if (q.lIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[136])) {
                q.aD();
            }
            if (q.lIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[137])) {
                String[] stringArray = new String[llIllIIl[0]];
                stringArray[q.llIllIIl[1]] = llIllIII[llIllIIl[138]];
                if (q.lIllIllIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray19 = new String[llIllIIl[0]];
                    stringArray19[q.llIllIIl[1]] = llIllIII[llIllIIl[139]];
                    String[] stringArray20 = new String[llIllIIl[0]];
                    stringArray20[q.llIllIIl[1]] = llIllIII[llIllIIl[140]];
                    Inventory.getFirst((String[])stringArray19).useOn(Inventory.getFirst((String[])stringArray20));
                    Time.sleepTicks((int)llIllIIl[9]);
                    0;
                }
            }
            if (q.lIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIl[141])) {
                if (q.lIllIllIIIl(ci, llIllIIl[0])) {
                    Q.lw += llIllIIl[0];
                    Q.o(AccBuilderBarrows.m);
                    ci += llIllIIl[0];
                    Q.lw = llIllIIl[1];
                    cj = llIllIIl[1];
                }
                q.aD();
            }
            g.a(bX);
        }
    }

    static {
        q.lIllIlIlllI();
        q.lIllIlIllIl();
        bB = new ArrayList<d>();
        cl = new WorldArea(llIllIIl[163], llIllIIl[56], llIllIIl[16], llIllIIl[4], llIllIIl[1]);
        cm = new WorldArea(llIllIIl[164], llIllIIl[165], llIllIIl[166], llIllIIl[142], llIllIIl[1]);
        cn = new WorldArea(llIllIIl[164], llIllIIl[165], llIllIIl[166], llIllIIl[142], llIllIIl[0]);
        ce = new WorldPoint(llIllIIl[167], llIllIIl[168], llIllIIl[1]);
        co = new WorldPoint(llIllIIl[169], llIllIIl[170], llIllIIl[1]);
        cp = new WorldPoint(llIllIIl[171], llIllIIl[172], llIllIIl[1]);
        String[] stringArray = new String[llIllIIl[21]];
        stringArray[q.llIllIIl[1]] = llIllIII[llIllIIl[173]];
        stringArray[q.llIllIIl[0]] = llIllIII[llIllIIl[174]];
        stringArray[q.llIllIIl[9]] = llIllIII[llIllIIl[175]];
        stringArray[q.llIllIIl[11]] = llIllIII[llIllIIl[176]];
        stringArray[q.llIllIIl[13]] = llIllIII[llIllIIl[100]];
        stringArray[q.llIllIIl[8]] = llIllIII[llIllIIl[177]];
        stringArray[q.llIllIIl[16]] = llIllIII[llIllIIl[178]];
        stringArray[q.llIllIIl[20]] = llIllIII[llIllIIl[179]];
        bX = stringArray;
        cq = llIllIIl[1];
        cr = llIllIII[llIllIIl[180]];
    }
}

