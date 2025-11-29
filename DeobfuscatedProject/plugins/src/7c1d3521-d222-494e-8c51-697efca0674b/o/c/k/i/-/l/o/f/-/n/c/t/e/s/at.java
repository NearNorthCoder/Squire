/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
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
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;

public class at
implements ac {
    public static final /* synthetic */ WorldPoint on;
    public static final /* synthetic */ WorldPoint oj;
    static /* synthetic */ int cG;
    public static final /* synthetic */ WorldPoint og;
    static /* synthetic */ int oc;
    public static /* synthetic */ long oa;
    static /* synthetic */ int dF;
    public static /* synthetic */ String[] ob;
    public static final /* synthetic */ WorldPoint ol;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ WorldPoint nY;
    static /* synthetic */ int od;
    public static final /* synthetic */ WorldPoint oi;
    private static /* synthetic */ int[] lllIIIlIII;
    public static final /* synthetic */ WorldPoint oh;
    private static /* synthetic */ String[] lllIIIIllI;
    static /* synthetic */ WorldArea oe;
    public static /* synthetic */ List<d> bv;
    public static /* synthetic */ WorldPoint nZ;
    public static final /* synthetic */ WorldPoint ok;
    public static final /* synthetic */ WorldPoint of;
    public static /* synthetic */ WorldPoint nX;
    static /* synthetic */ int cI;
    public static final /* synthetic */ WorldPoint om;

    private static boolean lIlllllIlIIll(int n2) {
        return n2 != 0;
    }

    private static int lIlllllIllIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static String lIllllIllllll(String lllllllllllllllllIllllIIllIIllll, String lllllllllllllllllIllllIIllIIllIl) {
        try {
            SecretKeySpec lllllllllllllllllIllllIIllIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllllIIllIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIllllIIllIlIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllllIllllIIllIlIllI.init(lllIIIlIII[3], lllllllllllllllllIllllIIllIllIIl);
            return new String(lllllllllllllllllIllllIIllIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllllIIllIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIllllIIllIlIlII) {
            lllllllllllllllllIllllIIllIlIlII.printStackTrace();
            return null;
        }
    }

    static {
        at.lIlllllIlIIlI();
        at.lIlllllIIIlII();
        bv = new ArrayList<d>();
        nX = new WorldPoint(lllIIIlIII[55], lllIIIlIII[56], lllIIIlIII[0]);
        nY = new WorldPoint(lllIIIlIII[57], lllIIIlIII[58], lllIIIlIII[0]);
        nZ = new WorldPoint(lllIIIlIII[0], lllIIIlIII[0], lllIIIlIII[0]);
        oa = System.currentTimeMillis();
        String[] stringArray = new String[lllIIIlIII[54]];
        stringArray[at.lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[6]];
        stringArray[at.lllIIIlIII[1]] = lllIIIIllI[lllIIIlIII[59]];
        stringArray[at.lllIIIlIII[3]] = lllIIIIllI[lllIIIlIII[60]];
        stringArray[at.lllIIIlIII[4]] = lllIIIIllI[lllIIIlIII[61]];
        stringArray[at.lllIIIlIII[9]] = lllIIIIllI[lllIIIlIII[62]];
        stringArray[at.lllIIIlIII[13]] = lllIIIIllI[lllIIIlIII[63]];
        stringArray[at.lllIIIlIII[18]] = lllIIIIllI[lllIIIlIII[64]];
        stringArray[at.lllIIIlIII[19]] = lllIIIIllI[lllIIIlIII[65]];
        stringArray[at.lllIIIlIII[21]] = lllIIIIllI[lllIIIlIII[66]];
        stringArray[at.lllIIIlIII[22]] = lllIIIIllI[lllIIIlIII[67]];
        stringArray[at.lllIIIlIII[14]] = lllIIIIllI[lllIIIlIII[68]];
        stringArray[at.lllIIIlIII[23]] = lllIIIIllI[lllIIIlIII[69]];
        stringArray[at.lllIIIlIII[24]] = lllIIIIllI[lllIIIlIII[70]];
        stringArray[at.lllIIIlIII[25]] = lllIIIIllI[lllIIIlIII[71]];
        stringArray[at.lllIIIlIII[26]] = lllIIIIllI[lllIIIlIII[72]];
        stringArray[at.lllIIIlIII[17]] = lllIIIIllI[lllIIIlIII[73]];
        stringArray[at.lllIIIlIII[27]] = lllIIIIllI[lllIIIlIII[74]];
        stringArray[at.lllIIIlIII[28]] = lllIIIIllI[lllIIIlIII[75]];
        stringArray[at.lllIIIlIII[30]] = lllIIIIllI[lllIIIlIII[76]];
        stringArray[at.lllIIIlIII[31]] = lllIIIIllI[lllIIIlIII[77]];
        stringArray[at.lllIIIlIII[15]] = lllIIIIllI[lllIIIlIII[78]];
        stringArray[at.lllIIIlIII[32]] = lllIIIIllI[lllIIIlIII[79]];
        stringArray[at.lllIIIlIII[2]] = lllIIIIllI[lllIIIlIII[80]];
        stringArray[at.lllIIIlIII[33]] = lllIIIIllI[lllIIIlIII[81]];
        stringArray[at.lllIIIlIII[34]] = lllIIIIllI[lllIIIlIII[82]];
        stringArray[at.lllIIIlIII[29]] = lllIIIIllI[lllIIIlIII[83]];
        stringArray[at.lllIIIlIII[35]] = lllIIIIllI[lllIIIlIII[84]];
        stringArray[at.lllIIIlIII[36]] = lllIIIIllI[lllIIIlIII[85]];
        stringArray[at.lllIIIlIII[37]] = lllIIIIllI[lllIIIlIII[86]];
        stringArray[at.lllIIIlIII[38]] = lllIIIIllI[lllIIIlIII[87]];
        stringArray[at.lllIIIlIII[40]] = lllIIIIllI[lllIIIlIII[88]];
        stringArray[at.lllIIIlIII[48]] = lllIIIIllI[lllIIIlIII[89]];
        stringArray[at.lllIIIlIII[49]] = lllIIIIllI[lllIIIlIII[90]];
        stringArray[at.lllIIIlIII[50]] = lllIIIIllI[lllIIIlIII[91]];
        stringArray[at.lllIIIlIII[51]] = lllIIIIllI[lllIIIlIII[92]];
        stringArray[at.lllIIIlIII[52]] = lllIIIIllI[lllIIIlIII[93]];
        stringArray[at.lllIIIlIII[53]] = lllIIIIllI[lllIIIlIII[94]];
        ob = stringArray;
        oc = lllIIIlIII[95];
        dF = lllIIIlIII[0];
        cI = e.c(lllIIIlIII[21], lllIIIlIII[2]);
        od = e.c(lllIIIlIII[6], lllIIIlIII[74]);
        cG = lllIIIlIII[1];
        oe = new WorldArea(lllIIIlIII[96], lllIIIlIII[97], lllIIIlIII[2], lllIIIlIII[29], lllIIIlIII[0]);
        of = new WorldPoint(lllIIIlIII[98], lllIIIlIII[99], lllIIIlIII[0]);
        og = new WorldPoint(lllIIIlIII[100], lllIIIlIII[101], lllIIIlIII[0]);
        oh = new WorldPoint(lllIIIlIII[102], lllIIIlIII[103], lllIIIlIII[0]);
        oi = new WorldPoint(lllIIIlIII[104], lllIIIlIII[105], lllIIIlIII[0]);
        oj = new WorldPoint(lllIIIlIII[106], lllIIIlIII[107], lllIIIlIII[0]);
        ok = new WorldPoint(lllIIIlIII[108], lllIIIlIII[109], lllIIIlIII[0]);
        ol = of;
        on = om = og;
    }

    private static boolean lIlllllIlIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlllllIllllI(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIlllllIlIIlI() {
        lllIIIlIII = new int[111];
        at.lllIIIlIII[0] = (0xC7 ^ 0x94 ^ (0xF5 ^ 0x93)) & (221 + 243 - 429 + 210 ^ 76 + 86 - 71 + 101 ^ -" ".length());
        at.lllIIIlIII[1] = " ".length();
        at.lllIIIlIII[2] = 0x7C ^ 0x6A;
        at.lllIIIlIII[3] = "  ".length();
        at.lllIIIlIII[4] = "   ".length();
        at.lllIIIlIII[5] = 0xFFFF9FAC & 0x73DB;
        at.lllIIIlIII[6] = 0x56 ^ 0x70;
        at.lllIIIlIII[7] = -(0xFFFFABCB & 0x7D75) & (0xFFFFFFFF & 0x7BD7);
        at.lllIIIlIII[8] = 0xFFFFFFD9 & 0x7EF;
        at.lllIIIlIII[9] = 0x2B ^ 0x2F;
        at.lllIIIlIII[10] = 0xFFFFBF5F & 0x5FE7;
        at.lllIIIlIII[11] = 0xFFFFBF5B & 0x5FEC;
        at.lllIIIlIII[12] = 0xFFFFED7F & 0x13FB;
        at.lllIIIlIII[13] = 4 ^ 1;
        at.lllIIIlIII[14] = 49 + 150 - 66 + 56 ^ 55 + 55 - 8 + 81;
        at.lllIIIlIII[15] = 0x47 ^ 0x37 ^ (2 ^ 0x66);
        at.lllIIIlIII[16] = -(0xFFFFDD89 & 0x6AFF) & (0xFFFFFFFF & 0x4FEB);
        at.lllIIIlIII[17] = 0x4D ^ 0x10 ^ (0xF3 ^ 0xA1);
        at.lllIIIlIII[18] = 0x90 ^ 0xA5 ^ (0x32 ^ 1);
        at.lllIIIlIII[19] = 0x4D ^ 9 ^ (0x35 ^ 0x76);
        at.lllIIIlIII[20] = 113 + 199 - 283 + 187 + (0x41 ^ 0xE) - (64 + 22 - -53 + 77) + (7 + 102 - 6 + 63);
        at.lllIIIlIII[21] = 0x44 ^ 0x58 ^ (0x98 ^ 0x8C);
        at.lllIIIlIII[22] = 0x9E ^ 0x97;
        at.lllIIIlIII[23] = 0x65 ^ 0x30 ^ (0x15 ^ 0x4B);
        at.lllIIIlIII[24] = 0x32 ^ 0x3E;
        at.lllIIIlIII[25] = 0x44 ^ 0x78 ^ (0xAE ^ 0x9F);
        at.lllIIIlIII[26] = 0x3F ^ 0xA ^ (0x66 ^ 0x5D);
        at.lllIIIlIII[27] = 0x44 ^ 0x54;
        at.lllIIIlIII[28] = 0x41 ^ 0x50;
        at.lllIIIlIII[29] = 0x15 ^ 0xC;
        at.lllIIIlIII[30] = 0x16 ^ 4;
        at.lllIIIlIII[31] = 0x61 ^ 0x23 ^ (0x74 ^ 0x25);
        at.lllIIIlIII[32] = 0xE3 ^ 0xA7 ^ (0xC9 ^ 0x98);
        at.lllIIIlIII[33] = 0xCB ^ 0x98 ^ (1 ^ 0x45);
        at.lllIIIlIII[34] = 0xDE ^ 0xC6;
        at.lllIIIlIII[35] = 0x33 ^ 0x29;
        at.lllIIIlIII[36] = 0x45 ^ 0x1C ^ (0x35 ^ 0x77);
        at.lllIIIlIII[37] = 0x4C ^ 0x32 ^ (0x44 ^ 0x26);
        at.lllIIIlIII[38] = 87 + 122 - 136 + 69 ^ 84 + 61 - 32 + 34;
        at.lllIIIlIII[39] = -(0xFFFF93C7 & 0x7C3F) & (0xFFFFBFEE & 0x5FB7);
        at.lllIIIlIII[40] = 0xB3 ^ 0xAF ^ "  ".length();
        at.lllIIIlIII[41] = 0xFFFF8FFF & 0x77BA;
        at.lllIIIlIII[42] = 0xFFFFCFD7 & 0x33AC;
        at.lllIIIlIII[43] = 0xFFFFADEF & 0x533C;
        at.lllIIIlIII[44] = -(0xFFFFF82D & 0x4FD7) & (0xFFFFFBF7 & 0x7D5D);
        at.lllIIIlIII[45] = -(0xFFFFC336 & 0x7DED) & (0xFFFFFBBB & Short.MAX_VALUE);
        at.lllIIIlIII[46] = 0xFFFFEFBF & 0x17DE;
        at.lllIIIlIII[47] = 0xCC ^ 0xA8;
        at.lllIIIlIII[48] = 88 + 27 - 73 + 87 ^ 44 + 56 - -17 + 41;
        at.lllIIIlIII[49] = 148 + 97 - 87 + 25 ^ 115 + 145 - 170 + 61;
        at.lllIIIlIII[50] = 3 + 19 - -100 + 6 ^ 7 + 146 - 39 + 47;
        at.lllIIIlIII[51] = 0x41 ^ 0x63;
        at.lllIIIlIII[52] = 0x41 ^ 0x62;
        at.lllIIIlIII[53] = 0x67 ^ 0xB ^ (0x24 ^ 0x6C);
        at.lllIIIlIII[54] = 0x23 ^ 6;
        at.lllIIIlIII[55] = -(0xFFFFFFF7 & 0x732B) & (0xFFFFFFF6 & 0x7FBF);
        at.lllIIIlIII[56] = -(0xFFFFF2BF & 0x7F6D) & (0xFFFFFFBF & 0x7EFF);
        at.lllIIIlIII[57] = 0xFFFFEEEC & 0x1DD7;
        at.lllIIIlIII[58] = 0xFFFFFDDE & 0xF73;
        at.lllIIIlIII[59] = 0x5E ^ 0x5B ^ (0x1D ^ 0x3F);
        at.lllIIIlIII[60] = 52 + 111 - 47 + 123 ^ 79 + 176 - 125 + 69;
        at.lllIIIlIII[61] = 0xA0 ^ 0x88 ^ " ".length();
        at.lllIIIlIII[62] = 0x35 ^ 0x1F;
        at.lllIIIlIII[63] = 0xA8 ^ 0x83;
        at.lllIIIlIII[64] = 133 + 15 - 103 + 120 ^ 86 + 83 - 79 + 47;
        at.lllIIIlIII[65] = 0xAE ^ 0xBF ^ (0x3F ^ 3);
        at.lllIIIlIII[66] = 88 + 64 - 120 + 136 ^ 86 + 133 - 103 + 18;
        at.lllIIIlIII[67] = 36 + 178 - 207 + 174 ^ 114 + 16 - 65 + 89;
        at.lllIIIlIII[68] = 0x44 ^ 0x74;
        at.lllIIIlIII[69] = 0x8D ^ 0xB5 ^ (0x7D ^ 0x74);
        at.lllIIIlIII[70] = 0x88 ^ 0xBA;
        at.lllIIIlIII[71] = 0x24 ^ 0x78 ^ (0xE ^ 0x61);
        at.lllIIIlIII[72] = 0x79 ^ 0x4D;
        at.lllIIIlIII[73] = 0xC9 ^ 0xA6 ^ (0x7A ^ 0x20);
        at.lllIIIlIII[74] = 0x64 ^ 0x38 ^ (0xD4 ^ 0xBE);
        at.lllIIIlIII[75] = 3 ^ 0x66 ^ (0x95 ^ 0xC7);
        at.lllIIIlIII[76] = 57 + 0 - -2 + 78 ^ 100 + 32 - -1 + 44;
        at.lllIIIlIII[77] = 0xB7 ^ 0x8E;
        at.lllIIIlIII[78] = 0x8B ^ 0xB1;
        at.lllIIIlIII[79] = 69 + 100 - 105 + 103 ^ 43 + 20 - -8 + 85;
        at.lllIIIlIII[80] = 0x1D ^ 0x21;
        at.lllIIIlIII[81] = 0xAF ^ 0x92;
        at.lllIIIlIII[82] = 72 + 86 - 27 + 10 ^ 135 + 46 - 29 + 27;
        at.lllIIIlIII[83] = 81 + 135 - 132 + 71 ^ 112 + 136 - 99 + 15;
        at.lllIIIlIII[84] = 0xAC ^ 0x99 ^ (0xFE ^ 0x8B);
        at.lllIIIlIII[85] = 0xD1 ^ 0x90;
        at.lllIIIlIII[86] = 118 + 146 - 158 + 103 ^ 41 + 3 - -102 + 1;
        at.lllIIIlIII[87] = 0x3E ^ 0x5B ^ (0x66 ^ 0x40);
        at.lllIIIlIII[88] = 0x67 ^ 0x23;
        at.lllIIIlIII[89] = 0xDE ^ 0xA0 ^ (0xBD ^ 0x86);
        at.lllIIIlIII[90] = 106 + 105 - 94 + 13 ^ 149 + 185 - 172 + 34;
        at.lllIIIlIII[91] = 0x15 ^ 0x52;
        at.lllIIIlIII[92] = 0x11 ^ 0x4F ^ (0xAD ^ 0xBB);
        at.lllIIIlIII[93] = 9 ^ 0x40;
        at.lllIIIlIII[94] = 0x66 ^ 0x2C;
        at.lllIIIlIII[95] = -(0xFFFFFB21 & 0x2CDF) & (0xFFFFFFFB & 0x7FFD);
        at.lllIIIlIII[96] = -" ".length() & (0xFFFF9FFE & 0x6BFD);
        at.lllIIIlIII[97] = 0xFFFFBCF7 & 0x4FAF;
        at.lllIIIlIII[98] = 0xFFFFFD59 & 0xEAF;
        at.lllIIIlIII[99] = -(0xFFFFABDD & 0x772F) & (0xFFFFEFFF & 0x3FBF);
        at.lllIIIlIII[100] = 0xFFFFFF3D & 0xCD6;
        at.lllIIIlIII[101] = 0xFFFFBCEB & 0x4FBF;
        at.lllIIIlIII[102] = 0xFFFF9CFB & 0x6F1F;
        at.lllIIIlIII[103] = -(0xFFFFD3E7 & 0x7C59) & (0xFFFFDFF7 & 0x7CFA);
        at.lllIIIlIII[104] = 0xFFFFE6EA & 0x1FF5;
        at.lllIIIlIII[105] = 0xFFFFFEAD & 0xF7F;
        at.lllIIIlIII[106] = -(0xFFFFF7BF & 0x6849) & (0xFFFFF7FF & 0x6EDD);
        at.lllIIIlIII[107] = 0xFFFFEE2F & 0x1FDF;
        at.lllIIIlIII[108] = 0xFFFFE6CF & 0x1FFB;
        at.lllIIIlIII[109] = 0xFFFFAF7F & 0x5EB2;
        at.lllIIIlIII[110] = 0x48 ^ 3;
    }

    private static boolean lIlllllIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static int lIllllllIIIII(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean lIlllllIllIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlllllIlIlll(int n2) {
        return n2 > 0;
    }

    public static void gn() {
        if (at.lIlllllIlIIll(Inventory.isFull() ? 1 : 0)) {
            Inventory.getAll((String[])ob).forEach(item -> item.interact(lllIIIIllI[lllIIIlIII[54]]));
        }
        if (at.lIlllllIlIlIl(Inventory.isFull() ? 1 : 0)) {
            int[] nArray = new int[lllIIIlIII[1]];
            nArray[at.lllIIIlIII[0]] = lllIIIlIII[8];
            if (at.lIlllllIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllIIIlIII[1]];
                nArray2[at.lllIIIlIII[0]] = lllIIIlIII[7];
                if (at.lIlllllIlIlIl(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lllIIIlIII[1]];
                    nArray3[at.lllIIIlIII[0]] = lllIIIlIII[7];
                    if (at.lIlllllIlIIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                        int[] nArray4 = new int[lllIIIlIII[1]];
                        nArray4[at.lllIIIlIII[0]] = lllIIIlIII[7];
                        Inventory.getFirst((int[])nArray4).interact(lllIIIIllI[lllIIIlIII[18]]);
                        Time.sleepTicks((int)lllIIIlIII[1]);
                        "".length();
                    }
                }
            }
        }
        if (at.lIlllllIllIIl(Players.getLocal().getWorldLocation().distanceTo(ol), lllIIIlIII[17])) {
            AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[19]];
            Movement.walkTo((WorldPoint)ol);
            "".length();
            Time.sleepTicks((int)lllIIIlIII[1]);
            "".length();
        }
        if (at.lIlllllIllIll(Players.getLocal().getWorldLocation().distanceTo(ol), lllIIIlIII[17])) {
            if (at.lIlllllIlIlIl(oe.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)ol);
                "".length();
                Time.sleepTicks((int)lllIIIlIII[1]);
                "".length();
            }
            if (at.lIlllllIlIIll(Dialog.canLevelUpContinue() ? 1 : 0)) {
                Dialog.close();
            }
            if (at.lIlllllIlllII(Players.getLocal().getGraphic(), lllIIIlIII[20])) {
                AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[21]];
                String[] stringArray = new String[lllIIIlIII[1]];
                stringArray[at.lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[22]];
                if (at.lIlllllIlIllI(NPCs.getNearest((String[])stringArray)) && at.lIlllllIlllIl(Players.getLocal().getInteracting())) {
                    String[] stringArray2 = new String[lllIIIlIII[1]];
                    stringArray2[at.lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[14]];
                    NPCs.getNearest((String[])stringArray2).interact(lllIIIIllI[lllIIIlIII[23]]);
                    Time.sleepTicks((int)lllIIIlIII[1]);
                    "".length();
                }
            }
            if (at.lIlllllIllllI(Players.getLocal().getGraphic(), lllIIIlIII[20])) {
                AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[24]];
                if (!at.lIlllllIlllll(at.lIlllllIllIlI(e.w(), 70.0)) || at.lIlllllIllIll(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lllIIIlIII[9])) {
                    int[] nArray = new int[lllIIIlIII[1]];
                    nArray[at.lllIIIlIII[0]] = lllIIIlIII[8];
                    if (at.lIlllllIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray5 = new int[lllIIIlIII[1]];
                        nArray5[at.lllIIIlIII[0]] = lllIIIlIII[8];
                        Inventory.getFirst((int[])nArray5).interact(lllIIIIllI[lllIIIlIII[25]]);
                        Time.sleepTicks((int)lllIIIlIII[1]);
                        "".length();
                    }
                }
                String[] stringArray = new String[lllIIIlIII[1]];
                stringArray[at.lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[26]];
                if (at.lIlllllIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray3 = new String[lllIIIlIII[1]];
                    stringArray3[at.lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[17]];
                    Inventory.getAll((String[])stringArray3).stream().forEach(item -> item.interact(lllIIIIllI[lllIIIlIII[53]]));
                }
                Inventory.getAll((String[])ob).forEach(item -> item.interact(lllIIIIllI[lllIIIlIII[52]]));
            }
        }
    }

    private static boolean lIlllllIlllll(int n2) {
        return n2 >= 0;
    }

    private static boolean lIlllllIllIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIllllIlllllI(String lllllllllllllllllIllllIlIIIIIIII, String lllllllllllllllllIllllIIllllllll) {
        lllllllllllllllllIllllIlIIIIIIII = new String(Base64.getDecoder().decode(lllllllllllllllllIllllIlIIIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIllllIIlllllllI = new StringBuilder();
        char[] lllllllllllllllllIllllIIllllllIl = lllllllllllllllllIllllIIllllllll.toCharArray();
        int lllllllllllllllllIllllIIllllllII = lllIIIlIII[0];
        char[] lllllllllllllllllIllllIIllllIllI = lllllllllllllllllIllllIlIIIIIIII.toCharArray();
        int lllllllllllllllllIllllIIllllIlIl = lllllllllllllllllIllllIIllllIllI.length;
        int lllllllllllllllllIllllIIllllIlII = lllIIIlIII[0];
        while (at.lIlllllIlIlII(lllllllllllllllllIllllIIllllIlII, lllllllllllllllllIllllIIllllIlIl)) {
            char lllllllllllllllllIllllIlIIIIIIIl = lllllllllllllllllIllllIIllllIllI[lllllllllllllllllIllllIIllllIlII];
            lllllllllllllllllIllllIIlllllllI.append((char)(lllllllllllllllllIllllIlIIIIIIIl ^ lllllllllllllllllIllllIIllllllIl[lllllllllllllllllIllllIIllllllII % lllllllllllllllllIllllIIllllllIl.length]));
            "".length();
            ++lllllllllllllllllIllllIIllllllII;
            ++lllllllllllllllllIllllIIllllIlII;
            "".length();
            if (-" ".length() <= ((0x81 ^ 0xC1) & ~(0x51 ^ 0x11))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIllllIIlllllllI);
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (at.lIlllllIllIII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[2])) {
            bl = lllIIIlIII[1];
            "".length();
            if (((7 ^ 0x3B ^ (0xF7 ^ 0x9C)) & (112 + 61 - 73 + 47 ^ 93 + 42 - 94 + 155 ^ -" ".length())) >= " ".length()) {
                return ((6 ^ 0x53 ^ (0xCE ^ 0xA0)) & (0xF2 ^ 0xBC ^ (0x7A ^ 0xF) ^ -" ".length())) != 0;
            }
        } else {
            bl = lllIIIlIII[0];
        }
        return bl;
    }

    @Override
    public boolean ae() {
        return lllIIIlIII[0];
    }

    public static void gm() {
        block20: {
            block21: {
                block22: {
                    block26: {
                        block25: {
                            block23: {
                                block24: {
                                    if (at.lIlllllIlIIll(bt ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[0]];
                                        b.a(bv);
                                        if (at.lIlllllIlIlII(bv.size(), lllIIIlIII[1])) {
                                            System.out.println(lllIIIIllI[lllIIIlIII[1]]);
                                            bt = lllIIIlIII[0];
                                        }
                                    }
                                    if (!at.lIlllllIlIlIl(bt ? 1 : 0) || !at.lIlllllIlIlII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[2])) break block20;
                                    if (!at.lIlllllIlIlIl(at.an() ? 1 : 0)) break block21;
                                    BankLocation lllllllllllllllllIllllIlIIlIlIII = BankLocation.getNearest();
                                    if (at.lIlllllIlIllI(lllllllllllllllllIllllIlIIlIlIII) && at.lIlllllIlIlIl(lllllllllllllllllIllllIlIIlIlIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[3]];
                                        a.a(lllllllllllllllllIllllIlIIlIlIII);
                                    }
                                    if (!at.lIlllllIlIllI(lllllllllllllllllIllllIlIIlIlIII) || !at.lIlllllIlIIll(lllllllllllllllllIllllIlIIlIlIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block22;
                                    AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[4]];
                                    if (at.lIlllllIlIlIl(Bank.isOpen() ? 1 : 0)) {
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIIlIII[5]);
                                        "".length();
                                    }
                                    if (!at.lIlllllIlIIll(Bank.isOpen() ? 1 : 0)) break block22;
                                    if (at.lIlllllIlIlll(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lllIIIlIII[4]);
                                        "".length();
                                    }
                                    if (!at.lIlllllIllIII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[6])) break block23;
                                    int[] nArray = new int[lllIIIlIII[1]];
                                    nArray[at.lllIIIlIII[0]] = lllIIIlIII[7];
                                    if (!at.lIlllllIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block24;
                                    int[] nArray2 = new int[lllIIIlIII[1]];
                                    nArray2[at.lllIIIlIII[0]] = lllIIIlIII[8];
                                    if (!at.lIlllllIlIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block23;
                                }
                                at.Q();
                                System.out.println(lllIIIIllI[lllIIIlIII[9]]);
                                bt = lllIIIlIII[1];
                                return;
                            }
                            int[] nArray = new int[lllIIIlIII[1]];
                            nArray[at.lllIIIlIII[0]] = lllIIIlIII[10];
                            if (!at.lIlllllIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block25;
                            int[] nArray3 = new int[lllIIIlIII[1]];
                            nArray3[at.lllIIIlIII[0]] = lllIIIlIII[11];
                            if (!at.lIlllllIlIIll(Bank.contains((int[])nArray3) ? 1 : 0)) break block25;
                            int[] nArray4 = new int[lllIIIlIII[1]];
                            nArray4[at.lllIIIlIII[0]] = lllIIIlIII[12];
                            if (!at.lIlllllIlIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block26;
                        }
                        at.Q();
                        System.out.println(lllIIIIllI[lllIIIlIII[13]]);
                        bt = lllIIIlIII[1];
                        return;
                    }
                    if (at.lIlllllIlIlII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[13])) {
                        a.a(lllIIIlIII[11], lllIIIlIII[13]);
                        a.a(lllIIIlIII[10], lllIIIlIII[13]);
                        a.a(lllIIIlIII[12], lllIIIlIII[14]);
                    }
                    if (at.lIlllllIllIII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[13]) && at.lIlllllIlIlII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[6])) {
                        a.a(lllIIIlIII[10], lllIIIlIII[13]);
                    }
                    if (at.lIlllllIllIII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[6])) {
                        a.a(lllIIIlIII[7], lllIIIlIII[13]);
                        a.a(lllIIIlIII[8], lllIIIlIII[15]);
                        a.a(lllIIIlIII[16], lllIIIlIII[15]);
                    }
                    cG += lllIIIlIII[1];
                }
                if (at.lIlllllIllIIl(Inventory.getFreeSlots(), lllIIIlIII[17])) {
                    cG += lllIIIlIII[1];
                }
            }
            if (at.lIlllllIlIIll(at.an() ? 1 : 0) && at.lIlllllIlIlll(cG)) {
                if (at.lIlllllIlIIll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (at.lIlllllIlIlII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[13])) {
                    at.go();
                }
                if (at.lIlllllIllIII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[13]) && at.lIlllllIlIlII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[6])) {
                    at.gp();
                }
                if (at.lIlllllIllIII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[6])) {
                    at.gn();
                }
            }
        }
    }

    @Override
    public int af() {
        at.gm();
        return lllIIIlIII[47];
    }

    private static boolean lIlllllIlllIl(Object object) {
        return object == null;
    }

    private static int lIllllllIIIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean fN() {
        return lllIIIlIII[0];
    }

    private static boolean lIlllllIlllII(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIlllllIIIlII() {
        lllIIIIllI = new String[lllIIIlIII[110]];
        at.lllIIIIllI[at.lllIIIlIII[0]] = at.lIllllIlllllI("BB0AJDshSBA5MCsb", "FhyMU");
        at.lllIIIIllI[at.lllIIIlIII[1]] = at.lIllllIllllll("M3pMkMMPQr9wwNSS+ZIqDVElC7x9y5Oe4MoslGLm3qppbBRZem1Ipn16RXhONqBv", "cIrxt");
        at.lllIIIIllI[at.lllIIIlIII[3]] = at.lIllllIlllllI("DDgaPCYjLQU7JmItA3UjIzcH", "BYlUA");
        at.lllIIIIllI[at.lllIIIlIII[4]] = at.lIlllllIIIIlI("ZMRLHNqOPZY9LaSFUjkhazuStyD89jv0", "aHBCn");
        at.lllIIIIllI[at.lllIIIlIII[9]] = at.lIlllllIIIIlI("FPwGz6U8RSxLBdRCDhEKAqhVxs6hfngXu9/32IId4u6nEzyeJN5+mFmk/SPWpy4c", "lovVO");
        at.lllIIIIllI[at.lllIIIlIII[13]] = at.lIllllIlllllI("EiJRGxQgZxwTFTYuHx1GNjIBCgosIgJWRjYwGA4FLS4fHUYxKFE4MxwOPz0=", "EGqzf");
        at.lllIIIIllI[at.lllIIIlIII[18]] = at.lIllllIllllll("kay6BOKs9b0=", "wFoGQ");
        at.lllIIIIllI[at.lllIIIlIII[19]] = at.lIllllIlllllI("KS4TUAQIbwMRAgoqFw==", "gOepp");
        at.lllIIIIllI[at.lllIIIlIII[21]] = at.lIllllIllllll("yN6A8UU28PIbwxI7XVPdYw==", "WrAvw");
        at.lllIIIIllI[at.lllIIIlIII[22]] = at.lIllllIlllllI("CiUHMzE1ZDImJiohBg==", "GDtGT");
        at.lllIIIIllI[at.lllIIIlIII[14]] = at.lIllllIlllllI("GjU6ET0ldA8EKjoxOw==", "WTIeX");
        at.lllIIIIllI[at.lllIIIlIII[23]] = at.lIllllIlllllI("Ax0mHjg8Fy4QPA==", "StEuH");
        at.lllIIIIllI[at.lllIIIlIII[24]] = at.lIllllIllllll("rQiTiuqaLq8=", "HdHZY");
        at.lllIIIIllI[at.lllIIIlIII[25]] = at.lIllllIllllll("VVQrygSjPVg=", "hFhtj");
        at.lllIIIIllI[at.lllIIIlIII[26]] = at.lIllllIlllllI("GhIo", "PgOYm");
        at.lllIIIIllI[at.lllIIIlIII[17]] = at.lIllllIllllll("cWNJYvFjQwU=", "QBHyB");
        at.lllIIIIllI[at.lllIIIlIII[27]] = at.lIllllIllllll("9HxuWL16xKGmdduJtQcuPg==", "QbuUL");
        at.lllIIIIllI[at.lllIIIlIII[28]] = at.lIllllIllllll("GUsdXCdgok1IV1YOxuWdTg==", "RIIeS");
        at.lllIIIIllI[at.lllIIIlIII[30]] = at.lIllllIlllllI("NQgnPWIbFC4=", "zxBSO");
        at.lllIIIIllI[at.lllIIIlIII[31]] = at.lIlllllIIIIlI("khSs3+iShGQ=", "ZHAfy");
        at.lllIIIIllI[at.lllIIIlIII[15]] = at.lIllllIllllll("VaxScZzia9c=", "YCwas");
        at.lllIIIIllI[at.lllIIIlIII[32]] = at.lIlllllIIIIlI("owiUlxJKx+FEiVuUZogBYA==", "ugLjW");
        at.lllIIIIllI[at.lllIIIlIII[2]] = at.lIllllIlllllI("Bzo+PA0xKg==", "TNKRc");
        at.lllIIIIllI[at.lllIIIlIII[33]] = at.lIllllIllllll("ybIAjJoIOCA=", "KDuCO");
        at.lllIIIIllI[at.lllIIIlIII[34]] = at.lIllllIlllllI("CiAdZAArYR8hFWQ1AigR", "DAkDt");
        at.lllIIIIllI[at.lllIIIlIII[29]] = at.lIllllIlllllI("AgIhGEEsHig=", "MrDvl");
        at.lllIIIIllI[at.lllIIIlIII[35]] = at.lIllllIllllll("YT8Jyrtp5HuwOMPoYFDDSg==", "sfzjm");
        at.lllIIIIllI[at.lllIIIlIII[36]] = at.lIlllllIIIIlI("pxRHDjTsYDWbsWSQnUhOMg==", "coFbB");
        at.lllIIIIllI[at.lllIIIlIII[37]] = at.lIllllIlllllI("BAY1Yh0kAjgu", "PcTBn");
        at.lllIIIIllI[at.lllIIIlIII[38]] = at.lIllllIlllllI("PBAxLztCAiYhOg==", "odTNW");
        at.lllIIIIllI[at.lllIIIlIII[40]] = at.lIllllIlllllI("HhQjExUzCCs=", "ZfLce");
        at.lllIIIIllI[at.lllIIIlIII[48]] = at.lIlllllIIIIlI("hbzArNCuByf0VMDV49v1Ag==", "JMDHy");
        at.lllIIIIllI[at.lllIIIlIII[49]] = at.lIllllIllllll("uAW3XnPtESQ=", "BgBhI");
        at.lllIIIIllI[at.lllIIIlIII[50]] = at.lIllllIllllll("T0yPtnu9Ic4=", "NZmSR");
        at.lllIIIIllI[at.lllIIIlIII[51]] = at.lIlllllIIIIlI("Y0iFLrS7P3efnFK9uXQ24w==", "Lfhqx");
        at.lllIIIIllI[at.lllIIIlIII[52]] = at.lIlllllIIIIlI("dswsa8XUxwQ=", "UsVaG");
        at.lllIIIIllI[at.lllIIIlIII[53]] = at.lIllllIlllllI("ABYaFQ==", "DdueM");
        at.lllIIIIllI[at.lllIIIlIII[54]] = at.lIlllllIIIIlI("Mr42TCsTNsc=", "BBEpv");
        at.lllIIIIllI[at.lllIIIlIII[6]] = at.lIllllIlllllI("GhwzHAB1AT8WCg==", "UrZsn");
        at.lllIIIIllI[at.lllIIIlIII[59]] = at.lIllllIllllll("yCPCCR984GucGlbDVnMwFQ==", "pXpLw");
        at.lllIIIIllI[at.lllIIIlIII[60]] = at.lIllllIllllll("2EN/9IjK2B1kjgcj+fulyQ==", "tbxva");
        at.lllIIIIllI[at.lllIIIlIII[61]] = at.lIlllllIIIIlI("NTA6aB96x5w0XcRm4SvyAw==", "PTVNL");
        at.lllIIIIllI[at.lllIIIlIII[62]] = at.lIllllIllllll("W/kEIgiRF/DOMIjToyKnLQ==", "iVWXY");
        at.lllIIIIllI[at.lllIIIlIII[63]] = at.lIlllllIIIIlI("00BkIiUBh07AhHG0gOPseA==", "xYfdR");
        at.lllIIIIllI[at.lllIIIlIII[64]] = at.lIllllIllllll("A0gIWWZzHu5NJgX0MIVg+Q==", "FDAZB");
        at.lllIIIIllI[at.lllIIIlIII[65]] = at.lIllllIllllll("Pqu4CeWdu6iuZB8Qkbxx1A==", "FWDhS");
        at.lllIIIIllI[at.lllIIIlIII[66]] = at.lIllllIllllll("lCRXeMQQ1HdYFCe2CyrcQpgJRf57eNMh", "FEBkk");
        at.lllIIIIllI[at.lllIIIlIII[67]] = at.lIllllIlllllI("Jw0wPSMNBnE6NgoBNDUw", "deQRW");
        at.lllIIIIllI[at.lllIIIlIII[68]] = at.lIllllIlllllI("Ji0MDDIWNRsHZgY/DA0=", "uZiiF");
        at.lllIIIIllI[at.lllIIIlIII[69]] = at.lIllllIlllllI("ASoHPU8lIAM9", "VEfYo");
        at.lllIIIIllI[at.lllIIIlIII[70]] = at.lIllllIlllllI("PTM3JSgdJCpnPgozNw==", "oVSGM");
        at.lllIIIIllI[at.lllIIIlIII[71]] = at.lIlllllIIIIlI("8214IoZdlD5mhMYdljXt2ctvm3znuP28", "GXBiq");
        at.lllIIIIllI[at.lllIIIlIII[72]] = at.lIllllIllllll("OCglzEagma30/HQ66EyOMg==", "CNBIb");
        at.lllIIIIllI[at.lllIIIlIII[73]] = at.lIllllIlllllI("BCULJyg3OAFiNjMvHA==", "VJxBE");
        at.lllIIIIllI[at.lllIIIlIII[74]] = at.lIllllIllllll("ys/QC1VTJ3zLysshH/F+EA==", "lTWYQ");
        at.lllIIIIllI[at.lllIIIlIII[75]] = at.lIllllIllllll("Hswo0fK77XAb6tYD0MVouGu3wrRCXHSH", "zJaJm");
        at.lllIIIIllI[at.lllIIIlIII[76]] = at.lIllllIlllllI("JRY2FDsKDDAbaRcANBE=", "deQuI");
        at.lllIIIIllI[at.lllIIIlIII[77]] = at.lIllllIllllll("06uKhfPf/YdICiEKZiGiwg==", "CotrM");
        at.lllIIIIllI[at.lllIIIlIII[78]] = at.lIlllllIIIIlI("tPfUPbgJGdKufJS/er06KQ==", "TiVZL");
        at.lllIIIIllI[at.lllIIIlIII[79]] = at.lIllllIlllllI("Ayg/LRA4LjwtUickNi0=", "TASIr");
        at.lllIIIIllI[at.lllIIIlIII[80]] = at.lIllllIlllllI("AREmPjAjHDB3JCkVMA==", "LpTWW");
        at.lllIIIIllI[at.lllIIIlIII[81]] = at.lIlllllIIIIlI("vW/sexrGUH4BB5aB0XUHRA==", "ogfQa");
        at.lllIIIIllI[at.lllIIIlIII[82]] = at.lIlllllIIIIlI("WfA64xwIOp95qnaLm+NEw0cmZ0IC9cyW", "gGHjP");
        at.lllIIIIllI[at.lllIIIlIII[83]] = at.lIllllIllllll("ckqf2g5wpaVub91cTgRBgQ==", "TXHdL");
        at.lllIIIIllI[at.lllIIIlIII[84]] = at.lIllllIlllllI("IRQBBQgZFwoQHxJVHAcIDw==", "kuobm");
        at.lllIIIIllI[at.lllIIIlIII[85]] = at.lIllllIllllll("FxJr7I1sMymFO/4Z52VFlw==", "DhmvX");
        at.lllIIIIllI[at.lllIIIlIII[86]] = at.lIlllllIIIIlI("3G2Fd1PhQA1AHnxYaPIelQ==", "YMMpr");
        at.lllIIIIllI[at.lllIIIlIII[87]] = at.lIllllIllllll("kG1RYylDAYJjxZ+tB3Nm6w==", "NhBEy");
        at.lllIIIIllI[at.lllIIIlIII[88]] = at.lIllllIlllllI("Ngw+FQMPBCJHHwcIKA==", "bmLgl");
        at.lllIIIIllI[at.lllIIIlIII[89]] = at.lIllllIlllllI("ICIVPg4EIgkoChpjFCkKDA==", "hCgLo");
        at.lllIIIIllI[at.lllIIIlIII[90]] = at.lIllllIlllllI("BhI7PDokCCV0OzsIOjE=", "KgHTH");
        at.lllIIIIllI[at.lllIIIlIII[91]] = at.lIlllllIIIIlI("/oPsdQkFPDoH3G+NZbt8Tg==", "ZVeBA");
        at.lllIIIIllI[at.lllIIIlIII[92]] = at.lIllllIllllll("tpQ5t/kCLNQAV52sur5oSQ==", "lUDCk");
        at.lllIIIIllI[at.lllIIIlIII[93]] = at.lIllllIllllll("QOlBwkj09s6H3/Q3d6R1k9HssdleCjWS", "oyAIb");
        at.lllIIIIllI[at.lllIIIlIII[94]] = at.lIllllIlllllI("Kzcr", "aBLeA");
    }

    private static String lIlllllIIIIlI(String lllllllllllllllllIllllIIlllIlIII, String lllllllllllllllllIllllIIlllIIIll) {
        try {
            SecretKeySpec lllllllllllllllllIllllIIlllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllllIIlllIIIll.getBytes(StandardCharsets.UTF_8)), lllIIIlIII[21]), "DES");
            Cipher lllllllllllllllllIllllIIlllIlIlI = Cipher.getInstance("DES");
            lllllllllllllllllIllllIIlllIlIlI.init(lllIIIlIII[3], lllllllllllllllllIllllIIlllIlIll);
            return new String(lllllllllllllllllIllllIIlllIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllllIIlllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIllllIIlllIlIIl) {
            lllllllllllllllllIllllIIlllIlIIl.printStackTrace();
            return null;
        }
    }

    @Override
    public String ag() {
        return lllIIIIllI[lllIIIlIII[48]];
    }

    private static boolean lIlllllIlIllI(Object object) {
        return object != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        block7: {
            block8: {
                if (at.lIlllllIlIlII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[13])) {
                    int n3;
                    int[] nArray = new int[lllIIIlIII[1]];
                    nArray[at.lllIIIlIII[0]] = lllIIIlIII[12];
                    if (at.lIlllllIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lllIIIlIII[1]];
                        nArray2[at.lllIIIlIII[0]] = lllIIIlIII[11];
                        int[] nArray3 = new int[lllIIIlIII[1]];
                        nArray3[at.lllIIIlIII[0]] = lllIIIlIII[10];
                        if (at.lIlllllIlIIll(Inventory.contains((int[])nArray2) & Inventory.contains((int[])nArray3)) && at.lIlllllIlIlll(cG)) {
                            n3 = lllIIIlIII[1];
                            "".length();
                            if (-" ".length() < 0) return n3 != 0;
                            return ((0x6B ^ 0x40) & ~(0x65 ^ 0x4E)) != 0;
                        }
                    }
                    n3 = lllIIIlIII[0];
                    return n3 != 0;
                }
                if (at.lIlllllIllIII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[13]) && at.lIlllllIlIlII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[6])) {
                    return lllIIIlIII[1];
                }
                if (!at.lIlllllIllIII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[6])) return lllIIIlIII[0];
                int[] nArray = new int[lllIIIlIII[1]];
                nArray[at.lllIIIlIII[0]] = lllIIIlIII[8];
                if (!at.lIlllllIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block7;
                int[] nArray4 = new int[lllIIIlIII[1]];
                nArray4[at.lllIIIlIII[0]] = lllIIIlIII[7];
                if (!at.lIlllllIlIlIl(Inventory.contains((int[])nArray4) ? 1 : 0)) break block8;
                int[] nArray5 = new int[lllIIIlIII[1]];
                nArray5[at.lllIIIlIII[0]] = lllIIIlIII[7];
                if (!at.lIlllllIlIIll(Equipment.contains((int[])nArray5) ? 1 : 0)) break block7;
            }
            n2 = lllIIIlIII[1];
            "".length();
            if (((0x28 ^ 0x4F ^ (0xDC ^ 0x91)) & (89 + 103 - 58 + 22 ^ 6 + 40 - -130 + 6 ^ -" ".length())) == 0) return n2 != 0;
            return ((0xF2 ^ 0xB8 ^ (0x78 ^ 0x75)) & (204 + 95 - 204 + 143 ^ 64 + 148 - 208 + 165 ^ -" ".length()) & ((0x6D ^ 0x5D ^ (0x5F ^ 0x51)) & (8 + 176 - 44 + 39 ^ 66 + 89 - 146 + 132 ^ -" ".length()) ^ -" ".length())) != 0;
        }
        n2 = lllIIIlIII[0];
        return n2 != 0;
    }

    private static void go() {
        if (at.lIlllllIllIIl(Players.getLocal().getWorldLocation().distanceTo(nX), lllIIIlIII[17])) {
            AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[27]];
            Movement.walkTo((WorldPoint)nX);
            "".length();
            Time.sleepTicks((int)lllIIIlIII[1]);
            "".length();
        }
        if (at.lIlllllIllIll(Players.getLocal().getWorldLocation().distanceTo(nX), lllIIIlIII[17])) {
            if (at.lIlllllIlIIll(Dialog.canLevelUpContinue() ? 1 : 0)) {
                Dialog.close();
            }
            if (at.lIlllllIlllll(at.lIllllllIIIII(System.currentTimeMillis(), oa))) {
                AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[28]];
                int[] nArray = new int[lllIIIlIII[1]];
                nArray[at.lllIIIlIII[0]] = oc;
                if (at.lIlllllIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lllIIIlIII[1]];
                    nArray2[at.lllIIIlIII[0]] = oc;
                    if (at.lIlllllIllIII(Inventory.getFirst((int[])nArray2).getQuantity(), lllIIIlIII[29])) {
                        int[] nArray3 = new int[lllIIIlIII[1]];
                        nArray3[at.lllIIIlIII[0]] = oc;
                        Inventory.getFirst((int[])nArray3).interact(lllIIIIllI[lllIIIlIII[30]]);
                        Time.sleepTicks((int)lllIIIlIII[1]);
                        "".length();
                    }
                }
                String[] stringArray = new String[lllIIIlIII[1]];
                stringArray[at.lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[31]];
                if (at.lIlllllIlIllI(NPCs.getNearest((String[])stringArray)) && at.lIlllllIlllIl(Players.getLocal().getInteracting()) && at.lIlllllIlIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
                    String[] stringArray2 = new String[lllIIIlIII[1]];
                    stringArray2[at.lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[15]];
                    NPCs.getNearest((String[])stringArray2).interact(lllIIIIllI[lllIIIlIII[32]]);
                    Time.sleepTicks((int)lllIIIlIII[1]);
                    "".length();
                }
            }
            if (at.lIllllllIIIlI(at.lIllllllIIIII(System.currentTimeMillis(), oa))) {
                AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[2]];
                if (!at.lIlllllIlllll(at.lIllllllIIIIl(e.w(), 30.0)) || at.lIlllllIllIll(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lllIIIlIII[9])) {
                    int[] nArray = new int[lllIIIlIII[1]];
                    nArray[at.lllIIIlIII[0]] = lllIIIlIII[12];
                    if (at.lIlllllIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray4 = new int[lllIIIlIII[1]];
                        nArray4[at.lllIIIlIII[0]] = lllIIIlIII[12];
                        Inventory.getFirst((int[])nArray4).interact(lllIIIIllI[lllIIIlIII[33]]);
                        Time.sleepTicks((int)lllIIIlIII[1]);
                        "".length();
                    }
                }
            }
        }
    }

    private static boolean lIllllllIIIlI(int n2) {
        return n2 <= 0;
    }

    public static void Q() {
        d lllllllllllllllllIllllIlIIIlllll;
        int[] nArray = new int[lllIIIlIII[1]];
        nArray[at.lllIIIlIII[0]] = lllIIIlIII[10];
        if (at.lIlllllIlIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lllIIIlIII[10], lllIIIlIII[14], lllIIIlIII[42]);
            bv.add(d2);
            "".length();
        }
        int[] nArray2 = new int[lllIIIlIII[1]];
        nArray2[at.lllIIIlIII[0]] = lllIIIlIII[11];
        if (at.lIlllllIlIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllllllllllllllllIllllIlIIIlllll = new d(lllIIIlIII[11], lllIIIlIII[14], lllIIIlIII[42]);
            bv.add(lllllllllllllllllIllllIlIIIlllll);
            "".length();
        }
        int[] nArray3 = new int[lllIIIlIII[1]];
        nArray3[at.lllIIIlIII[0]] = lllIIIlIII[12];
        if (at.lIlllllIlIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllllllllllllllllIllllIlIIIlllll = new d(lllIIIlIII[12], lllIIIlIII[40], lllIIIlIII[43]);
            bv.add(lllllllllllllllllIllllIlIIIlllll);
            "".length();
        }
        int[] nArray4 = new int[lllIIIlIII[1]];
        nArray4[at.lllIIIlIII[0]] = lllIIIlIII[44];
        if (at.lIlllllIlIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lllllllllllllllllIllllIlIIIlllll = new d(lllIIIlIII[44], lllIIIlIII[13], j.cf);
            bv.add(lllllllllllllllllIllllIlIIIlllll);
            "".length();
        }
        if (at.lIlllllIllIII(Skills.getLevel((Skill)Skill.THIEVING), lllIIIlIII[6])) {
            int[] nArray5 = new int[lllIIIlIII[1]];
            nArray5[at.lllIIIlIII[0]] = lllIIIlIII[8];
            if (at.lIlllllIlIlIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                lllllllllllllllllIllllIlIIIlllll = new d(lllIIIlIII[8], lllIIIlIII[45], lllIIIlIII[21]);
                bv.add(lllllllllllllllllIllllIlIIIlllll);
                "".length();
            }
            int[] nArray6 = new int[lllIIIlIII[1]];
            nArray6[at.lllIIIlIII[0]] = lllIIIlIII[7];
            if (at.lIlllllIlIlIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                lllllllllllllllllIllllIlIIIlllll = new d(lllIIIlIII[7], lllIIIlIII[43], lllIIIlIII[46]);
                bv.add(lllllllllllllllllIllllIlIIIlllll);
                "".length();
            }
        }
    }

    private static boolean lIlllllIllIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static void gp() {
        if (at.lIlllllIlIlIl(Players.getLocal().getWorldLocation().equals((Object)nY) ? 1 : 0)) {
            AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[34]];
            if (at.lIlllllIlIIll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)nY);
            "".length();
            Time.sleepTicks((int)lllIIIlIII[1]);
            "".length();
        }
        if (at.lIlllllIlIIll(Players.getLocal().getWorldLocation().equals((Object)nY) ? 1 : 0)) {
            int[] nArray = new int[lllIIIlIII[1]];
            nArray[at.lllIIIlIII[0]] = oc;
            if (at.lIlllllIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllIIIlIII[1]];
                nArray2[at.lllIIIlIII[0]] = oc;
                Inventory.getFirst((int[])nArray2).interact(lllIIIIllI[lllIIIlIII[29]]);
                Time.sleepTicks((int)lllIIIlIII[1]);
                "".length();
            }
            if (at.lIlllllIlIlIl(Inventory.isFull() ? 1 : 0)) {
                AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[35]];
                String[] stringArray = new String[lllIIIlIII[1]];
                stringArray[at.lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[36]];
                if (at.lIlllllIlIllI(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray2 = new String[lllIIIlIII[1]];
                    stringArray2[at.lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[37]];
                    TileObjects.getNearest((String[])stringArray2).interact(lllIIIIllI[lllIIIlIII[38]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lllIIIlIII[1]];
                        stringArray[at.lllIIIlIII[0]] = lllIIIIllI[lllIIIlIII[51]];
                        if (at.lIlllllIlllIl(TileObjects.getNearest((String[])stringArray))) {
                            bl = lllIIIlIII[1];
                            "".length();
                            if (-" ".length() >= " ".length()) {
                                return ((0xDF ^ 0x87) & ~(0xE3 ^ 0xBB)) != 0;
                            }
                        } else {
                            bl = lllIIIlIII[0];
                        }
                        return bl;
                    }, (int)lllIIIlIII[39]);
                    "".length();
                }
            }
            if (at.lIlllllIlIIll(Inventory.isFull() ? 1 : 0)) {
                AccBuilderSotf.c = lllIIIIllI[lllIIIlIII[40]];
                int[] nArray3 = new int[lllIIIlIII[1]];
                nArray3[at.lllIIIlIII[0]] = lllIIIlIII[41];
                Inventory.getAll((int[])nArray3).forEach(item -> item.interact(lllIIIIllI[lllIIIlIII[50]]));
                int[] nArray4 = new int[lllIIIlIII[1]];
                nArray4[at.lllIIIlIII[0]] = lllIIIlIII[12];
                if (at.lIlllllIlIIll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                    int[] nArray5 = new int[lllIIIlIII[1]];
                    nArray5[at.lllIIIlIII[0]] = lllIIIlIII[12];
                    Inventory.getAll((int[])nArray5).forEach(item -> item.interact(lllIIIIllI[lllIIIlIII[49]]));
                }
            }
        }
    }
}

