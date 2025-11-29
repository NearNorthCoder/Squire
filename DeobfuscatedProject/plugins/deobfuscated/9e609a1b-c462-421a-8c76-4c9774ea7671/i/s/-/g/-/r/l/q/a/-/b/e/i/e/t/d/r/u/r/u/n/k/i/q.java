/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 */
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.P;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.a;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.b;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.d;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.f;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.g;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.h;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.v;
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
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;

public class q
implements M {
    /* synthetic */ WorldArea fl;
    public static /* synthetic */ WorldPoint fi;
    static /* synthetic */ int co;
    private static /* synthetic */ int[] lIIIlllIlIIII;
    public static /* synthetic */ WorldPoint ff;
    public static /* synthetic */ WorldPoint fj;
    public static /* synthetic */ boolean by;
    private static /* synthetic */ String[] lIIIlllIIllll;
    public static /* synthetic */ List<d> bA;
    public static /* synthetic */ WorldPoint fg;
    static /* synthetic */ String[] bW;
    public static /* synthetic */ WorldPoint fh;
    public static /* synthetic */ WorldArea fc;
    public static /* synthetic */ WorldPoint fe;
    /* synthetic */ WorldArea fm;
    static /* synthetic */ boolean cp;
    /* synthetic */ WorldArea fk;
    public static /* synthetic */ WorldPoint fd;

    private static boolean lIlIIlIIIIlllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIlIIIlIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIlIIIIllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIlIIlIIIIllIII() {
        lIIIlllIlIIII = new int[119];
        q.lIIIlllIlIIII[0] = -(0xFFFFDFBB & 0x6ADD) & (0xFFFFDFFF & 0x6EBF);
        q.lIIIlllIlIIII[1] = -(0xFFFFCC2D & 0x73FF) & (0xFFFFEDFF & 0x5BFF);
        q.lIIIlllIlIIII[2] = -(0xFFFFE5D3 & 0x5E6D) & (0xFFFFDF79 & 0x6FF7);
        q.lIIIlllIlIIII[3] = 0xFFFFFFBF & 0x66F;
        q.lIIIlllIlIIII[4] = (0x33 ^ 0x66) & ~(0xF6 ^ 0xA3);
        q.lIIIlllIlIIII[5] = 1;
        q.lIIIlllIlIIII[6] = 2;
        q.lIIIlllIlIIII[7] = 0 ^ 0x1F;
        q.lIIIlllIlIIII[8] = 38 + 252 - 159 + 122 ^ 47 + 28 - 13 + 91;
        q.lIIIlllIlIIII[9] = 0xD3 ^ 0xC3;
        q.lIIIlllIlIIII[10] = 0xFFFFB3E9 & 0x5F9E;
        q.lIIIlllIlIIII[11] = 3;
        q.lIIIlllIlIIII[12] = 0x5B ^ 0x5F;
        q.lIIIlllIlIIII[13] = 7 ^ 0x16 ^ (0x41 ^ 0x58);
        q.lIIIlllIlIIII[14] = -(0xFFFFC8FB & 0x7795) & (0xFFFFDFF7 & 0x7FDF);
        q.lIIIlllIlIIII[15] = -(0xFFFFDF75 & 0x6CAB) & (0xFFFFFDF9 & 0x7F77);
        q.lIIIlllIlIIII[16] = -(0xFFFFBD6E & 0x5E9F) & (0xFFFFBFBF & 0x5FFF);
        q.lIIIlllIlIIII[17] = 0xFFFFBB45 & 0x4DBF;
        q.lIIIlllIlIIII[18] = -(0xFFFFD91F & 0x66E3) & (0xFFFFFF7F & 0x47FF);
        q.lIIIlllIlIIII[19] = 0xA7 ^ 0xC6 ^ (0xCA ^ 0xAE);
        q.lIIIlllIlIIII[20] = -(0xFFFFC7BB & 0x7CC5) & (0xFFFFCEDE & 0x7DFF);
        q.lIIIlllIlIIII[21] = 26 + 103 - -5 + 37 ^ 127 + 77 - 76 + 45;
        q.lIIIlllIlIIII[22] = -(79 + 23 - -29 + 18) & (0xFFFF9FFD & 0x7FDF);
        q.lIIIlllIlIIII[23] = 0xC3 ^ 0xC4;
        q.lIIIlllIlIIII[24] = -(0xFFFFFF97 & 0x3A69) & (0xFFFFBFF3 & 0x7EFD);
        q.lIIIlllIlIIII[25] = 81 + 22 - 17 + 63 ^ 18 + 69 - 48 + 120;
        q.lIIIlllIlIIII[26] = 0xFFFF9DE7 & 0x6B9A;
        q.lIIIlllIlIIII[27] = -(0xFFFFFBC3 & 0x7EFF) & (0xFFFFFFF7 & Short.MAX_VALUE);
        q.lIIIlllIlIIII[28] = 0xFFFFFBFB & 0x57F;
        q.lIIIlllIlIIII[29] = 0xFFFFBF73 & 0x71DF;
        q.lIIIlllIlIIII[30] = 0x4B ^ 0x79;
        q.lIIIlllIlIIII[31] = 0x45 ^ 0x52;
        q.lIIIlllIlIIII[32] = 0x5D ^ 0x47 ^ (0x96 ^ 0x85);
        q.lIIIlllIlIIII[33] = 0xFFFFBFAD & 0x6F73;
        q.lIIIlllIlIIII[34] = 112 + 126 - 132 + 60 ^ 105 + 1 - 5 + 68;
        q.lIIIlllIlIIII[35] = 0xB4 ^ 0xC7 ^ (0xC1 ^ 0xB9);
        q.lIIIlllIlIIII[36] = 0x5D ^ 0 ^ (0x74 ^ 0x25);
        q.lIIIlllIlIIII[37] = 0x17 ^ 0x1A;
        q.lIIIlllIlIIII[38] = 0x95 ^ 0xAA ^ (0x14 ^ 0x25);
        q.lIIIlllIlIIII[39] = 0xFFFFBD17 & 0x4EED;
        q.lIIIlllIlIIII[40] = 0xFFFFAD7D & 0x5FEE;
        q.lIIIlllIlIIII[41] = -(0xFFFFB1F7 & 0x6FAA) & (0xFFFFBFFF & 0x6DA7);
        q.lIIIlllIlIIII[42] = 0xFFFFBDEF & 0x4F79;
        q.lIIIlllIlIIII[43] = -(0xFFFFDB4B & 0x66FD) & (0xFFFFFEEF & 0x4F5F);
        q.lIIIlllIlIIII[44] = -(0xFFFFD7BD & 0x6ADF) & (0xFFFFDFFF & 0x6FFF);
        q.lIIIlllIlIIII[45] = 0xFFFFEC2F & 0x1FDB;
        q.lIIIlllIlIIII[46] = 0xFFFFDF5E & 0x2DFF;
        q.lIIIlllIlIIII[47] = 0xFFFFAF8D & 0x5C7F;
        q.lIIIlllIlIIII[48] = -(0xFFFFE6EF & 0x3916) & (0xFFFFEFDD & 0x3D7F);
        q.lIIIlllIlIIII[49] = 36 + 134 - 17 + 63;
        q.lIIIlllIlIIII[50] = 0x3B ^ 0x13;
        q.lIIIlllIlIIII[51] = 0x8A ^ 0x84 ^ (0x56 ^ 0x49);
        q.lIIIlllIlIIII[52] = 0x96 ^ 0x84;
        q.lIIIlllIlIIII[53] = 0x11 ^ 2;
        q.lIIIlllIlIIII[54] = 0xFFFFED1F & 0x1EE2;
        q.lIIIlllIlIIII[55] = 0x35 ^ 0x21;
        q.lIIIlllIlIIII[56] = -(0xFFFFDEF7 & 0x739E) & (0xFFFFDFFF & Short.MAX_VALUE);
        q.lIIIlllIlIIII[57] = 0x56 ^ 0x43;
        q.lIIIlllIlIIII[58] = 0x4C ^ 0x5A;
        q.lIIIlllIlIIII[59] = 0x21 ^ 0x39;
        q.lIIIlllIlIIII[60] = 0x33 ^ 0x6A ^ (0x14 ^ 0x54);
        q.lIIIlllIlIIII[61] = 0x69 ^ 0x73;
        q.lIIIlllIlIIII[62] = 0x58 ^ 0x43;
        q.lIIIlllIlIIII[63] = 0x4B ^ 0x57;
        q.lIIIlllIlIIII[64] = 1 + 76 - 36 + 122 ^ 50 + 153 - 28 + 15;
        q.lIIIlllIlIIII[65] = 0xFFFFAF69 & 0x7FB6;
        q.lIIIlllIlIIII[66] = 0x3E ^ 0x20;
        q.lIIIlllIlIIII[67] = 0x41 ^ 0x61;
        q.lIIIlllIlIIII[68] = 0x57 ^ 0x76;
        q.lIIIlllIlIIII[69] = 0xB5 ^ 0x9A ^ (0x7A ^ 0x77);
        q.lIIIlllIlIIII[70] = 0x4E ^ 0x6D;
        q.lIIIlllIlIIII[71] = 5 ^ 0x21;
        q.lIIIlllIlIIII[72] = 0x3B ^ 0x6D ^ (0xE9 ^ 0x9A);
        q.lIIIlllIlIIII[73] = 0x6A ^ 0x4C;
        q.lIIIlllIlIIII[74] = 0x71 ^ 0x46 ^ (0xC ^ 0x1C);
        q.lIIIlllIlIIII[75] = 0x84 ^ 0xAD;
        q.lIIIlllIlIIII[76] = 0x14 ^ 0x3E;
        q.lIIIlllIlIIII[77] = 0x85 ^ 0xAE;
        q.lIIIlllIlIIII[78] = 0x5F ^ 2 ^ (0x73 ^ 2);
        q.lIIIlllIlIIII[79] = 0x52 ^ 0x7F;
        q.lIIIlllIlIIII[80] = 0x71 ^ 0x5F;
        q.lIIIlllIlIIII[81] = 0xB0 ^ 0x9F;
        q.lIIIlllIlIIII[82] = 0x38 ^ 0x4F ^ (0x4D ^ 0xA);
        q.lIIIlllIlIIII[83] = 0xA2 ^ 0x93;
        q.lIIIlllIlIIII[84] = 0x69 ^ 0x5A;
        q.lIIIlllIlIIII[85] = 6 ^ 0x7E;
        q.lIIIlllIlIIII[86] = 0x5B ^ 0x6F;
        q.lIIIlllIlIIII[87] = 122 + 98 - 126 + 73 ^ 106 + 72 - 155 + 123;
        q.lIIIlllIlIIII[88] = -(0xFFFFBBE4 & 0x749F) & (0xFFFFFFFB & 0x3BEF);
        q.lIIIlllIlIIII[89] = 0xFFFFBFEB & 0x66D4;
        q.lIIIlllIlIIII[90] = -(0xFFFFB966 & 0x7E9F) & (0xFFFFFFFF & 0x3EBD);
        q.lIIIlllIlIIII[91] = 0xFFFFEEFD & 0x3FCE;
        q.lIIIlllIlIIII[92] = -(0xFFFFCB69 & 0x3CDE) & (0xFFFFF9FF & 0x6FEF);
        q.lIIIlllIlIIII[93] = 0xFFFF8D7C & 0x77FB;
        q.lIIIlllIlIIII[94] = 97 + 134 - 170 + 92 ^ 64 + 91 - 20 + 40;
        q.lIIIlllIlIIII[95] = 0x53 ^ 0x4D ^ (0x84 ^ 0xAD);
        q.lIIIlllIlIIII[96] = 0x6A ^ 0x52;
        q.lIIIlllIlIIII[97] = 0x91 ^ 0x89 ^ (0xBA ^ 0x9B);
        q.lIIIlllIlIIII[98] = -(0xFFFFF73F & 0x5BE5) & (0xFFFFFF7D & 0x5FFF);
        q.lIIIlllIlIIII[99] = -(0xFFFFF7F3 & 0x7A5D) & (0xFFFFFFFB & 0x7F76);
        q.lIIIlllIlIIII[100] = 109 + 52 - 66 + 33;
        q.lIIIlllIlIIII[101] = 0x4B ^ 0x2C;
        q.lIIIlllIlIIII[102] = 0xFFFF8FFF & 0x7BBB;
        q.lIIIlllIlIIII[103] = 0xFFFFADCF & 0x5E3E;
        q.lIIIlllIlIIII[104] = 0xFFFFCDFF & 0x3F57;
        q.lIIIlllIlIIII[105] = 0xFFFFDCBE & 0x2F45;
        q.lIIIlllIlIIII[106] = -(0xFFFFF376 & 0x1E9B) & (0xFFFFDFFF & 0x3F7F);
        q.lIIIlllIlIIII[107] = -(0xFFFFD5FB & 0x7B85) & (0xFFFFFDFC & 0x5F93);
        q.lIIIlllIlIIII[108] = 0xFFFFDD92 & 0x2FFD;
        q.lIIIlllIlIIII[109] = 0xFFFFDCFF & 0x2F9E;
        q.lIIIlllIlIIII[110] = -(0xFFFFFEDF & 0x6321) & (0xFFFFFF47 & 0x6FFF);
        q.lIIIlllIlIIII[111] = 0xFFFFDBED & 0x2F9F;
        q.lIIIlllIlIIII[112] = 0xFFFF8DBF & 0x7F69;
        q.lIIIlllIlIIII[113] = -(0xFFFF963D & 0x79CF) & (0xFFFFDFFF & 0x3BBF);
        q.lIIIlllIlIIII[114] = -(0xFFFFF392 & 0x3C7F) & (0xFFFFFDF7 & 0x3FBF);
        q.lIIIlllIlIIII[115] = 0x92 ^ 0xA8;
        q.lIIIlllIlIIII[116] = 86 + 173 - 223 + 219 ^ 159 + 106 - 117 + 48;
        q.lIIIlllIlIIII[117] = 0xE ^ 0x32;
        q.lIIIlllIlIIII[118] = 0x9F ^ 0xA2;
    }

    private static boolean lIlIIlIIIIlllII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean S() {
        void lllllllllllllllIIIIIlIlllllIlIll;
        int[] nArray = new int[lIIIlllIlIIII[13]];
        nArray[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[14];
        nArray[q.lIIIlllIlIIII[5]] = lIIIlllIlIIII[15];
        nArray[q.lIIIlllIlIIII[6]] = lIIIlllIlIIII[16];
        nArray[q.lIIIlllIlIIII[11]] = lIIIlllIlIIII[17];
        nArray[q.lIIIlllIlIIII[12]] = lIIIlllIlIIII[18];
        nArray[q.lIIIlllIlIIII[19]] = lIIIlllIlIIII[20];
        nArray[q.lIIIlllIlIIII[21]] = lIIIlllIlIIII[22];
        nArray[q.lIIIlllIlIIII[23]] = lIIIlllIlIIII[24];
        int[] nArray2 = nArray;
        int lllllllllllllllIIIIIlIlllllIlIlI = lIIIlllIlIIII[4];
        while (q.lIlIIlIIIIllIll(lllllllllllllllIIIIIlIlllllIlIlI, ((void)lllllllllllllllIIIIIlIlllllIlIll).length)) {
            int[] nArray3 = new int[lIIIlllIlIIII[5]];
            nArray3[q.lIIIlllIlIIII[4]] = lllllllllllllllIIIIIlIlllllIlIll[lllllllllllllllIIIIIlIlllllIlIlI];
            if (q.lIlIIlIIIIlllII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIIlllIlIIII[4];
            }
            ++lllllllllllllllIIIIIlIlllllIlIlI;
            0;
            if (((0xF7 ^ 0xC5) & ~(0x45 ^ 0x77)) == 0) continue;
            return ((0xCB ^ 0xC7) & ~(0x72 ^ 0x7E)) != 0;
        }
        return lIIIlllIlIIII[5];
    }

    private static String lIlIIlIIIIlIllI(String lllllllllllllllIIIIIlIlllIlllIll, String lllllllllllllllIIIIIlIlllIlllIlI) {
        lllllllllllllllIIIIIlIlllIlllIll = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIlIlllIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIIlIlllIlllIIl = new StringBuilder();
        char[] lllllllllllllllIIIIIlIlllIlllIII = lllllllllllllllIIIIIlIlllIlllIlI.toCharArray();
        int lllllllllllllllIIIIIlIlllIllIlll = lIIIlllIlIIII[4];
        char[] lllllllllllllllIIIIIlIlllIllIIIl = lllllllllllllllIIIIIlIlllIlllIll.toCharArray();
        int lllllllllllllllIIIIIlIlllIllIIII = lllllllllllllllIIIIIlIlllIllIIIl.length;
        int lllllllllllllllIIIIIlIlllIlIllll = lIIIlllIlIIII[4];
        while (q.lIlIIlIIIIllIll(lllllllllllllllIIIIIlIlllIlIllll, lllllllllllllllIIIIIlIlllIllIIII)) {
            char lllllllllllllllIIIIIlIlllIllllII = lllllllllllllllIIIIIlIlllIllIIIl[lllllllllllllllIIIIIlIlllIlIllll];
            lllllllllllllllIIIIIlIlllIlllIIl.append((char)(lllllllllllllllIIIIIlIlllIllllII ^ lllllllllllllllIIIIIlIlllIlllIII[lllllllllllllllIIIIIlIlllIllIlll % lllllllllllllllIIIIIlIlllIlllIII.length]));
            0;
            ++lllllllllllllllIIIIIlIlllIllIlll;
            ++lllllllllllllllIIIIIlIlllIlIllll;
            0;
            if (((0xCE ^ 0x93) & ~(0xCA ^ 0x97)) != 3) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIIlIlllIlllIIl);
    }

    static {
        q.lIlIIlIIIIllIII();
        q.lIlIIlIIIIlIlll();
        fc = new WorldArea(lIIIlllIlIIII[98], lIIIlllIlIIII[99], lIIIlllIlIIII[100], lIIIlllIlIIII[101], lIIIlllIlIIII[4]);
        bA = new ArrayList<d>();
        fd = new WorldPoint(lIIIlllIlIIII[102], lIIIlllIlIIII[56], lIIIlllIlIIII[4]);
        fe = new WorldPoint(lIIIlllIlIIII[103], lIIIlllIlIIII[104], lIIIlllIlIIII[4]);
        ff = new WorldPoint(lIIIlllIlIIII[105], lIIIlllIlIIII[106], lIIIlllIlIIII[4]);
        fg = new WorldPoint(lIIIlllIlIIII[107], lIIIlllIlIIII[108], lIIIlllIlIIII[4]);
        fh = new WorldPoint(lIIIlllIlIIII[109], lIIIlllIlIIII[110], lIIIlllIlIIII[4]);
        fi = new WorldPoint(lIIIlllIlIIII[111], lIIIlllIlIIII[112], lIIIlllIlIIII[4]);
        fj = new WorldPoint(lIIIlllIlIIII[113], lIIIlllIlIIII[114], lIIIlllIlIIII[4]);
        String[] stringArray = new String[lIIIlllIlIIII[11]];
        stringArray[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[115]];
        stringArray[q.lIIIlllIlIIII[5]] = lIIIlllIIllll[lIIIlllIlIIII[116]];
        stringArray[q.lIIIlllIlIIII[6]] = lIIIlllIIllll[lIIIlllIlIIII[117]];
        bW = stringArray;
    }

    private static String lIlIIlIIIIlIlII(String lllllllllllllllIIIIIlIllllIllIII, String lllllllllllllllIIIIIlIllllIlIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIIIIlIllllIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlIllllIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIlIllllIllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIlIllllIllIlI.init(lIIIlllIlIIII[6], lllllllllllllllIIIIIlIllllIllIll);
            return new String(lllllllllllllllIIIIIlIllllIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlIllllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIIlIllllIllIIl) {
            lllllllllllllllIIIIIlIllllIllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIIlIIIll(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIlIIlIIIIlIlll() {
        lIIIlllIIllll = new String[lIIIlllIlIIII[118]];
        q.lIIIlllIIllll[q.lIIIlllIlIIII[4]] = q."Finished buying items, switching back to quest";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[5]] = q."Need 16 QP";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[6]] = q."Nav to bank";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[11]] = q."Handling banking";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[12]] = q."We are missing quest supplies, switching to BUYING";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[19]] = q."Drink";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[21]] = q."Drink";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[23]] = q."Nav to start";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[13]] = q."Starting quest";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[32]] = q."Willow";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[25]] = q."Longhall door";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[35]] = q."Open";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[36]] = q."Longhall door";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[37]] = q."Open";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[38]] = q."Longhall door";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[34]] = q."Open";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[9]] = q."Nav to checkal";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[51]] = q."Perform";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[52]] = q."talk";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[53]] = q."Checkal";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[55]] = q."Nav to atlas";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[57]] = q."Longhall door";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[58]] = q."Open";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[31]] = q."Longhall door";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[59]] = q."Open";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[60]] = q."Longhall door";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[61]] = q."Open";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[62]] = q."Atlas";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[63]] = q."talk";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[64]] = q."Atlas";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[66]] = q."Nav to marley";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[7]] = q."Talk";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[67]] = q."Marley";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[68]] = q."Nav to cook";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[69]] = q."talk";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[70]] = q."Cook";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[71]] = q."Steak sandwich";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[72]] = q."Knife";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[73]] = q."Bread";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[74]] = q."Steak sandwich";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[50]] = q."Nav to marley";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[75]] = q."Talk";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[76]] = q."Marley";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[77]] = q."Nav to burntof";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[78]] = q."Burntof";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[79]] = q."Nav to dungeon";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[80]] = q."Starting quest";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[81]] = q."Willow";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[82]] = q."Wield";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[83]] = q."Mining pillars";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[30]] = q."Mine";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[84]] = q."Eat";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[86]] = q."Tele to varrock";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[87]] = q."Break";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[94]] = q."Below Ice Mountain";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[95]] = q."ring of wealth (";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[96]] = q."pillar";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[97]] = q."Mine";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[115]] = q."Yes.";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[116]] = q."I was wondering if you'd be able to make me a Steak sandwich?";
        q.lIIIlllIIllll[q.lIIIlllIlIIII[117]] = q."Rock.";
    }

    @Override
    public boolean aa() {
        int n2;
        if (!(!q.lIlIIlIIIIllllI(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[85]) || q.lIlIIlIIIIlllII(fc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && q.lIlIIlIIIIlllII(this.fk.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && q.lIlIIlIIIIlllII(this.fl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !q.lIlIIlIIIIllIlI(this.fm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0))) {
            n2 = lIIIlllIlIIII[5];
            0;
            if ((0x5F ^ 0x5A) <= 0) {
                return ((0x82 ^ 0xB3) & ~(4 ^ 0x35)) != 0;
            }
        } else {
            n2 = lIIIlllIlIIII[4];
        }
        return n2 != 0;
    }

    private static void W() {
        block12: {
            d lllllllllllllllIIIIIlIlllllIIllI;
            block11: {
                Object lllllllllllllllIIIIIlIlllllIIlll;
                int[] nArray = new int[lIIIlllIlIIII[5]];
                nArray[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[18];
                if (q.lIlIIlIIIIlllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(lIIIlllIlIIII[18], lIIIlllIlIIII[5], lIIIlllIlIIII[88]);
                    bA.add(d2);
                    0;
                }
                int[] nArray2 = new int[lIIIlllIlIIII[5]];
                nArray2[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[24];
                if (q.lIlIIlIIIIlllII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lllllllllllllllIIIIIlIlllllIIlll = new d(lIIIlllIlIIII[24], lIIIlllIlIIII[5], lIIIlllIlIIII[88]);
                    bA.add((d)lllllllllllllllIIIIIlIlllllIIlll);
                    0;
                }
                int[] nArray3 = new int[lIIIlllIlIIII[5]];
                nArray3[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[16];
                if (q.lIlIIlIIIIlllII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    lllllllllllllllIIIIIlIlllllIIlll = new d(lIIIlllIlIIII[16], lIIIlllIlIIII[5], lIIIlllIlIIII[88]);
                    bA.add((d)lllllllllllllllIIIIIlIlllllIIlll);
                    0;
                }
                int[] nArray4 = new int[lIIIlllIlIIII[5]];
                nArray4[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[20];
                if (q.lIlIIlIIIIlllII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    lllllllllllllllIIIIIlIlllllIIlll = new d(lIIIlllIlIIII[20], lIIIlllIlIIII[5], lIIIlllIlIIII[89]);
                    bA.add((d)lllllllllllllllIIIIIlIlllllIIlll);
                    0;
                }
                int[] nArray5 = new int[lIIIlllIlIIII[5]];
                nArray5[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[17];
                if (q.lIlIIlIIIIlllII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    lllllllllllllllIIIIIlIlllllIIlll = new d(lIIIlllIlIIII[17], lIIIlllIlIIII[5], lIIIlllIlIIII[89]);
                    bA.add((d)lllllllllllllllIIIIIlIlllllIIlll);
                    0;
                }
                int[] nArray6 = new int[lIIIlllIlIIII[5]];
                nArray6[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[22];
                if (q.lIlIIlIIIIlllII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                    lllllllllllllllIIIIIlIlllllIIlll = new d(lIIIlllIlIIII[22], lIIIlllIlIIII[25], lIIIlllIlIIII[90]);
                    bA.add((d)lllllllllllllllIIIIIlIlllllIIlll);
                    0;
                }
                if (q.lIlIIlIIIIlllII(Bank.contains((Predicate)(lllllllllllllllIIIIIlIlllllIIlll = item -> item.getName().toLowerCase().contains(lIIIlllIIllll[lIIIlllIlIIII[95]]))) ? 1 : 0)) {
                    lllllllllllllllIIIIIlIlllllIIllI = new d(lIIIlllIlIIII[91], lIIIlllIlIIII[19], lIIIlllIlIIII[92]);
                    bA.add(lllllllllllllllIIIIIlIlllllIIllI);
                    0;
                }
                int[] nArray7 = new int[lIIIlllIlIIII[5]];
                nArray7[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[15];
                if (q.lIlIIlIIIIlllII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    lllllllllllllllIIIIIlIlllllIIllI = new d(lIIIlllIlIIII[15], lIIIlllIlIIII[12], h.bv);
                    bA.add(lllllllllllllllIIIIIlIlllllIIllI);
                    0;
                }
                int[] nArray8 = new int[lIIIlllIlIIII[5]];
                nArray8[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[14];
                if (!q.lIlIIlIIIIllIlI(Bank.contains((int[])nArray8) ? 1 : 0)) break block11;
                int[] nArray9 = new int[lIIIlllIlIIII[5]];
                nArray9[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[14];
                if (!q.lIlIIlIIIIllIlI(Bank.contains((int[])nArray9) ? 1 : 0)) break block12;
                int[] nArray10 = new int[lIIIlllIlIIII[5]];
                nArray10[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[14];
                if (!q.lIlIIlIIIIllIll(Bank.getFirst((int[])nArray10).getQuantity(), lIIIlllIlIIII[34])) break block12;
            }
            lllllllllllllllIIIIIlIlllllIIllI = new d(lIIIlllIlIIII[14], lIIIlllIlIIII[50], lIIIlllIlIIII[93]);
            bA.add(lllllllllllllllIIIIIlIlllllIIllI);
            0;
        }
    }

    private static String lIlIIlIIIIlIlIl(String lllllllllllllllIIIIIlIllllIIlIIl, String lllllllllllllllIIIIIlIllllIIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIIIIIlIllllIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlIllllIIlIlI.getBytes(StandardCharsets.UTF_8)), lIIIlllIlIIII[13]), "DES");
            Cipher lllllllllllllllIIIIIlIllllIIllIl = Cipher.getInstance("DES");
            lllllllllllllllIIIIIlIllllIIllIl.init(lIIIlllIlIIII[6], lllllllllllllllIIIIIlIllllIIlllI);
            return new String(lllllllllllllllIIIIIlIllllIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlIllllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIIlIllllIIllII) {
            lllllllllllllllIIIIIlIllllIIllII.printStackTrace();
            return null;
        }
    }

    public static void ba() {
        if (q.lIlIIlIIIIllIlI(by ? 1 : 0)) {
            b.a(bA);
            if (q.lIlIIlIIIIllIll(bA.size(), lIIIlllIlIIII[5])) {
                System.out.println(lIIIlllIIllll[lIIIlllIlIIII[4]]);
                by = lIIIlllIlIIII[4];
            }
        }
        if (q.lIlIIlIIIIlllII(by ? 1 : 0)) {
            WorldArea lllllllllllllllIIIIIlIlllllIlllI;
            if (q.lIlIIlIIIIllIll(e.j(lIIIlllIlIIII[7]), lIIIlllIlIIII[8])) {
                v.bl();
            }
            if (q.lIlIIlIIIIlllIl(e.j(lIIIlllIlIIII[7]), lIIIlllIlIIII[8]) && q.lIlIIlIIIIllIll(e.I(), lIIIlllIlIIII[9])) {
                System.out.println(lIIIlllIIllll[lIIIlllIlIIII[5]]);
                AccBuilderRat.d = lIIIlllIlIIII[5];
                return;
            }
            if (q.lIlIIlIIIIlllII(q.S() ? 1 : 0) && q.lIlIIlIIIIlllII(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId())) && q.lIlIIlIIIIlllIl(e.j(lIIIlllIlIIII[7]), lIIIlllIlIIII[8]) && q.lIlIIlIIIIllllI(e.I(), lIIIlllIlIIII[9])) {
                lllllllllllllllIIIIIlIlllllIlllI = BankLocation.getNearest();
                if (q.lIlIIlIIIIlllll(lllllllllllllllIIIIIlIlllllIlllI) && q.lIlIIlIIIIlllII(lllllllllllllllIIIIIlIlllllIlllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[6]];
                    a.a((BankLocation)lllllllllllllllIIIIIlIlllllIlllI);
                }
                if (q.lIlIIlIIIIlllll(lllllllllllllllIIIIIlIlllllIlllI) && q.lIlIIlIIIIllIlI(lllllllllllllllIIIIIlIlllllIlllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (q.lIlIIlIIIIlllII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllIlIIII[10]);
                        0;
                    }
                    if (q.lIlIIlIIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[11]];
                        if (q.lIlIIlIIIlIIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIlllIlIIII[12]);
                            0;
                        }
                        if (q.lIlIIlIIIlIIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIlllIlIIII[6]);
                            0;
                        }
                        int[] nArray = new int[lIIIlllIlIIII[13]];
                        nArray[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[14];
                        nArray[q.lIIIlllIlIIII[5]] = lIIIlllIlIIII[15];
                        nArray[q.lIIIlllIlIIII[6]] = lIIIlllIlIIII[16];
                        nArray[q.lIIIlllIlIIII[11]] = lIIIlllIlIIII[17];
                        nArray[q.lIIIlllIlIIII[12]] = lIIIlllIlIIII[18];
                        nArray[q.lIIIlllIlIIII[19]] = lIIIlllIlIIII[20];
                        nArray[q.lIIIlllIlIIII[21]] = lIIIlllIlIIII[22];
                        nArray[q.lIIIlllIlIIII[23]] = lIIIlllIlIIII[24];
                        if (q.lIlIIlIIIIlllII(e.b(nArray) ? 1 : 0)) {
                            q.W();
                            System.out.println(lIIIlllIIllll[lIIIlllIlIIII[12]]);
                            by = lIIIlllIlIIII[5];
                            return;
                        }
                        int[] nArray2 = new int[lIIIlllIlIIII[13]];
                        nArray2[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[14];
                        nArray2[q.lIIIlllIlIIII[5]] = lIIIlllIlIIII[15];
                        nArray2[q.lIIIlllIlIIII[6]] = lIIIlllIlIIII[16];
                        nArray2[q.lIIIlllIlIIII[11]] = lIIIlllIlIIII[17];
                        nArray2[q.lIIIlllIlIIII[12]] = lIIIlllIlIIII[18];
                        nArray2[q.lIIIlllIlIIII[19]] = lIIIlllIlIIII[20];
                        nArray2[q.lIIIlllIlIIII[21]] = lIIIlllIlIIII[22];
                        nArray2[q.lIIIlllIlIIII[23]] = lIIIlllIlIIII[24];
                        if (q.lIlIIlIIIIllIlI(e.b(nArray2) ? 1 : 0)) {
                            a.a(lIIIlllIlIIII[14], lIIIlllIlIIII[25]);
                            a.a(lIIIlllIlIIII[22], lIIIlllIlIIII[25]);
                            a.a(lIIIlllIlIIII[15], lIIIlllIlIIII[6]);
                            a.a(lIIIlllIlIIII[16], lIIIlllIlIIII[5]);
                            a.a(lIIIlllIlIIII[17], lIIIlllIlIIII[5]);
                            a.a(lIIIlllIlIIII[18], lIIIlllIlIIII[5]);
                            a.a(lIIIlllIlIIII[24], lIIIlllIlIIII[5]);
                            a.a(lIIIlllIlIIII[20], lIIIlllIlIIII[5]);
                            a.a(lIIIlllIlIIII[26], lIIIlllIlIIII[6]);
                            a.a(lIIIlllIlIIII[27], lIIIlllIlIIII[5]);
                            a.a(lIIIlllIlIIII[28], lIIIlllIlIIII[19]);
                            int[] nArray3 = new int[lIIIlllIlIIII[5]];
                            nArray3[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[15];
                            if (q.lIlIIlIIIIlllIl(Inventory.getAll((int[])nArray3).size(), lIIIlllIlIIII[5])) {
                                a.a(lIIIlllIlIIII[29], lIIIlllIlIIII[6]);
                            }
                        }
                    }
                }
            }
            if (q.lIlIIlIIIIllIlI(Inventory.contains((int[])f.ba) ? 1 : 0) && q.lIlIIlIIIIllIll(Movement.getRunEnergy(), lIIIlllIlIIII[30])) {
                Inventory.getFirst((int[])f.ba).interact(lIIIlllIIllll[lIIIlllIlIIII[19]]);
                Time.sleepTicks((int)lIIIlllIlIIII[5]);
                0;
            }
            if (q.lIlIIlIIIIllIll(Prayers.getPoints(), lIIIlllIlIIII[31]) && q.lIlIIlIIIIllIlI(Inventory.contains((int[])f.aX) ? 1 : 0)) {
                Inventory.getFirst((int[])f.aX).interact(lIIIlllIIllll[lIIIlllIlIIII[21]]);
                Time.sleepTicks((int)lIIIlllIlIIII[6]);
                0;
            }
            if (q.lIlIIlIIIIllIlI(q.S() ? 1 : 0) && q.lIlIIlIIIIlllII(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()))) {
                if (q.lIlIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(fd), lIIIlllIlIIII[19])) {
                    AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[23]];
                    if (q.lIlIIlIIIIllIlI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)fd);
                    0;
                    Time.sleepTicks((int)lIIIlllIlIIII[5]);
                    0;
                }
                if (q.lIlIIlIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(fd), lIIIlllIlIIII[19])) {
                    AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[13]];
                    g.a(lIIIlllIIllll[lIIIlllIlIIII[32]], bW);
                }
            }
            if (!q.lIlIIlIIIlIIIll(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[19]) || q.lIlIIlIIIIlllIl(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[23])) {
                g.a(bW);
            }
            if (q.lIlIIlIIIIlllIl(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[25])) {
                if (!q.lIlIIlIIIIllllI(Vars.getBit((int)lIIIlllIlIIII[33]), lIIIlllIlIIII[19]) || q.lIlIIlIIIIlllIl(Vars.getBit((int)lIIIlllIlIIII[33]), lIIIlllIlIIII[34])) {
                    if (q.lIlIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(fe), lIIIlllIlIIII[5])) {
                        if (q.lIlIIlIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(ff), lIIIlllIlIIII[21])) {
                            String[] stringArray = new String[lIIIlllIlIIII[5]];
                            stringArray[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[25]];
                            String[] stringArray2 = new String[lIIIlllIlIIII[5]];
                            stringArray2[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[35]];
                            if (q.lIlIIlIIIIllIlI(TileObjects.getNearest((String[])stringArray).hasAction(stringArray2) ? 1 : 0)) {
                                String[] stringArray3 = new String[lIIIlllIlIIII[5]];
                                stringArray3[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[36]];
                                TileObjects.getNearest((String[])stringArray3).interact(lIIIlllIIllll[lIIIlllIlIIII[37]]);
                                Time.sleepTicks((int)lIIIlllIlIIII[6]);
                                0;
                            }
                            String[] stringArray4 = new String[lIIIlllIlIIII[5]];
                            stringArray4[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[38]];
                            String[] stringArray5 = new String[lIIIlllIlIIII[5]];
                            stringArray5[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[34]];
                            if (q.lIlIIlIIIIlllII(TileObjects.getNearest((String[])stringArray4).hasAction(stringArray5) ? 1 : 0)) {
                                WorldArea worldArea = new WorldPoint[lIIIlllIlIIII[19]];
                                worldArea[q.lIIIlllIlIIII[4]] = new WorldPoint(lIIIlllIlIIII[39], lIIIlllIlIIII[40], lIIIlllIlIIII[4]);
                                worldArea[q.lIIIlllIlIIII[5]] = new WorldPoint(lIIIlllIlIIII[41], lIIIlllIlIIII[42], lIIIlllIlIIII[4]);
                                worldArea[q.lIIIlllIlIIII[6]] = new WorldPoint(lIIIlllIlIIII[43], lIIIlllIlIIII[44], lIIIlllIlIIII[4]);
                                worldArea[q.lIIIlllIlIIII[11]] = new WorldPoint(lIIIlllIlIIII[45], lIIIlllIlIIII[46], lIIIlllIlIIII[4]);
                                worldArea[q.lIIIlllIlIIII[12]] = new WorldPoint(lIIIlllIlIIII[47], lIIIlllIlIIII[48], lIIIlllIlIIII[4]);
                                lllllllllllllllIIIIIlIlllllIlllI = worldArea;
                                Walker.walkAlong(Arrays.asList(lllllllllllllllIIIIIlIlllllIlllI), new HashMap());
                                0;
                                Time.sleepTicks((int)lIIIlllIlIIII[5]);
                                0;
                            }
                        }
                        if (q.lIlIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(ff), lIIIlllIlIIII[21])) {
                            AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[9]];
                            Movement.walkTo((WorldPoint)fe);
                            0;
                            Time.sleepTicks((int)lIIIlllIlIIII[5]);
                            0;
                        }
                    }
                    if (q.lIlIIlIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(fe), lIIIlllIlIIII[5])) {
                        if (q.lIlIIlIIIIlllIl(Vars.getBit((int)lIIIlllIlIIII[33]), lIIIlllIlIIII[34]) && q.lIlIIlIIIIlllll(Widgets.get((int)lIIIlllIlIIII[49], (int)lIIIlllIlIIII[6])) && q.lIlIIlIIIIlllII(Players.getLocal().isAnimating() ? 1 : 0)) {
                            Widgets.get((int)lIIIlllIlIIII[49], (int)lIIIlllIlIIII[6]).getChild(lIIIlllIlIIII[50]).interact(lIIIlllIIllll[lIIIlllIlIIII[51]]);
                            Time.sleepTicks((int)lIIIlllIlIIII[6]);
                            0;
                        }
                        if (q.lIlIIlIIIIllIll(Vars.getBit((int)lIIIlllIlIIII[33]), lIIIlllIlIIII[19])) {
                            AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[52]];
                            g.a(lIIIlllIIllll[lIIIlllIlIIII[53]], bW);
                        }
                    }
                }
                if (q.lIlIIlIIIIlllIl(Vars.getBit((int)lIIIlllIlIIII[33]), lIIIlllIlIIII[19])) {
                    lllllllllllllllIIIIIlIlllllIlllI = new WorldArea(lIIIlllIlIIII[54], lIIIlllIlIIII[40], lIIIlllIlIIII[32], lIIIlllIlIIII[25], lIIIlllIlIIII[4]);
                    if (q.lIlIIlIIIIlllII(lllllllllllllllIIIIIlIlllllIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[55]];
                        if (q.lIlIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(ff), lIIIlllIlIIII[21])) {
                            Movement.walkTo((WorldPoint)new WorldPoint(lIIIlllIlIIII[41], lIIIlllIlIIII[56], lIIIlllIlIIII[4]));
                            0;
                            Time.sleepTicks((int)lIIIlllIlIIII[5]);
                            0;
                        }
                        if (q.lIlIIlIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(ff), lIIIlllIlIIII[21])) {
                            String[] stringArray = new String[lIIIlllIlIIII[5]];
                            stringArray[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[57]];
                            String[] stringArray6 = new String[lIIIlllIlIIII[5]];
                            stringArray6[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[58]];
                            if (q.lIlIIlIIIIllIlI(TileObjects.getNearest((String[])stringArray).hasAction(stringArray6) ? 1 : 0)) {
                                String[] stringArray7 = new String[lIIIlllIlIIII[5]];
                                stringArray7[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[31]];
                                TileObjects.getNearest((String[])stringArray7).interact(lIIIlllIIllll[lIIIlllIlIIII[59]]);
                                Time.sleepTicks((int)lIIIlllIlIIII[6]);
                                0;
                            }
                            String[] stringArray8 = new String[lIIIlllIlIIII[5]];
                            stringArray8[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[60]];
                            String[] stringArray9 = new String[lIIIlllIlIIII[5]];
                            stringArray9[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[61]];
                            if (q.lIlIIlIIIIlllII(TileObjects.getNearest((String[])stringArray8).hasAction(stringArray9) ? 1 : 0)) {
                                g.a(lIIIlllIIllll[lIIIlllIlIIII[62]], bW);
                            }
                        }
                    }
                    if (q.lIlIIlIIIIllIlI(lllllllllllllllIIIIIlIlllllIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[63]];
                        g.a(lIIIlllIIllll[lIIIlllIlIIII[64]], bW);
                    }
                }
                if (q.lIlIIlIIIIlllIl(Vars.getBit((int)lIIIlllIlIIII[33]), lIIIlllIlIIII[25])) {
                    g.a(bW);
                }
            }
            if (q.lIlIIlIIIIlllIl(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[34])) {
                co = lIIIlllIlIIII[4];
                if (q.lIlIIlIIIIlllII(Vars.getBit((int)lIIIlllIlIIII[65]))) {
                    if (q.lIlIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(fg), lIIIlllIlIIII[19])) {
                        AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[66]];
                        Movement.walkTo((WorldPoint)fg);
                        0;
                        Time.sleepTicks((int)lIIIlllIlIIII[5]);
                        0;
                    }
                    if (q.lIlIIlIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(fg), lIIIlllIlIIII[19])) {
                        AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[7]];
                        g.a(lIIIlllIIllll[lIIIlllIlIIII[67]], bW);
                    }
                }
                if (q.lIlIIlIIIIlllIl(Vars.getBit((int)lIIIlllIlIIII[65]), lIIIlllIlIIII[19])) {
                    if (q.lIlIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(fh), lIIIlllIlIIII[21])) {
                        AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[68]];
                        Movement.walkTo((WorldPoint)fh);
                        0;
                        Time.sleepTicks((int)lIIIlllIlIIII[5]);
                        0;
                    }
                    if (q.lIlIIlIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(fh), lIIIlllIlIIII[21])) {
                        AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[69]];
                        g.a(lIIIlllIIllll[lIIIlllIlIIII[70]], bW);
                    }
                }
                if (q.lIlIIlIIIIlllIl(Vars.getBit((int)lIIIlllIlIIII[65]), lIIIlllIlIIII[25])) {
                    String[] stringArray = new String[lIIIlllIlIIII[5]];
                    stringArray[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[71]];
                    if (q.lIlIIlIIIIlllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray10 = new String[lIIIlllIlIIII[5]];
                        stringArray10[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[72]];
                        String[] stringArray11 = new String[lIIIlllIlIIII[5]];
                        stringArray11[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[73]];
                        Inventory.getFirst((String[])stringArray10).useOn(Inventory.getFirst((String[])stringArray11));
                        Time.sleepTicks((int)lIIIlllIlIIII[5]);
                        0;
                    }
                    String[] stringArray12 = new String[lIIIlllIlIIII[5]];
                    stringArray12[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[74]];
                    if (q.lIlIIlIIIIllIlI(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                        if (q.lIlIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(fg), lIIIlllIlIIII[19])) {
                            AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[50]];
                            Movement.walkTo((WorldPoint)fg);
                            0;
                            Time.sleepTicks((int)lIIIlllIlIIII[5]);
                            0;
                        }
                        if (q.lIlIIlIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(fg), lIIIlllIlIIII[19])) {
                            AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[75]];
                            g.a(lIIIlllIIllll[lIIIlllIlIIII[76]], bW);
                        }
                    }
                }
                if (q.lIlIIlIIIIlllIl(Vars.getBit((int)lIIIlllIlIIII[65]), lIIIlllIlIIII[70])) {
                    g.a(bW);
                }
                if (q.lIlIIlIIIIlllIl(Vars.getBit((int)lIIIlllIlIIII[65]), lIIIlllIlIIII[50])) {
                    if (q.lIlIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(fi), lIIIlllIlIIII[13])) {
                        AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[77]];
                        Movement.walkTo((WorldPoint)fi);
                        0;
                        Time.sleepTicks((int)lIIIlllIlIIII[5]);
                        0;
                    }
                    if (q.lIlIIlIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(fi), lIIIlllIlIIII[13])) {
                        g.a(lIIIlllIIllll[lIIIlllIlIIII[78]], bW);
                    }
                }
                g.a(bW);
            }
            if (q.lIlIIlIIIIlllIl(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[55])) {
                if (q.lIlIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(fj), lIIIlllIlIIII[19])) {
                    AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[79]];
                    if (q.lIlIIlIIIIllIlI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)fj);
                    0;
                    Time.sleepTicks((int)lIIIlllIlIIII[5]);
                    0;
                }
                if (q.lIlIIlIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(fj), lIIIlllIlIIII[19])) {
                    AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[80]];
                    g.a(lIIIlllIIllll[lIIIlllIlIIII[81]], bW);
                }
            }
            if (!q.lIlIIlIIIlIIIll(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[60]) || !q.lIlIIlIIIlIIIll(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[66]) || q.lIlIIlIIIIlllIl(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[50])) {
                g.a(bW);
            }
            if (q.lIlIIlIIIIlllIl(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[70])) {
                g.a(bW);
                int[] nArray = new int[lIIIlllIlIIII[5]];
                nArray[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[27];
                if (q.lIlIIlIIIIlllII(Equipment.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray4 = new int[lIIIlllIlIIII[5]];
                    nArray4[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[27];
                    if (q.lIlIIlIIIIllIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[lIIIlllIlIIII[5]];
                        nArray5[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[27];
                        Inventory.getFirst((int[])nArray5).interact(lIIIlllIIllll[lIIIlllIlIIII[82]]);
                        Time.sleepTicks((int)lIIIlllIlIIII[5]);
                        0;
                    }
                }
                if (q.lIlIIlIIIIlllII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0) && q.lIlIIlIIIIllllI(Skills.getLevel((Skill)Skill.PRAYER), lIIIlllIlIIII[77]) && q.lIlIIlIIIlIIIII(Prayers.getPoints())) {
                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                }
                if (q.lIlIIlIIIIlllll(lllllllllllllllIIIIIlIlllllIlllI = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (q.lIlIIlIIIIllIlI(tileObject.getName().contains(lIIIlllIIllll[lIIIlllIlIIII[96]]) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIlllIlIIII[5]];
                        stringArray[q.lIIIlllIlIIII[4]] = lIIIlllIIllll[lIIIlllIlIIII[97]];
                        if (q.lIlIIlIIIIllIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                            n2 = lIIIlllIlIIII[5];
                            0;
                            if (2 <= 2) return n2 != 0;
                            return ((175 + 77 - 61 + 40 ^ 33 + 21 - -83 + 45) & (3 ^ 0x59 ^ (0x5E ^ 0x55) ^ -1)) != 0;
                        }
                    }
                    n2 = lIIIlllIlIIII[4];
                    return n2 != 0;
                }))) {
                    AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[83]];
                    lllllllllllllllIIIIIlIlllllIlllI.interact(lIIIlllIIllll[lIIIlllIlIIII[30]]);
                    Time.sleepTicks((int)lIIIlllIlIIII[12]);
                    0;
                }
                if (q.lIlIIlIIIlIIlII(q.lIlIIlIIIIllIIl(e.v(), 50.0))) {
                    int[] nArray6 = new int[lIIIlllIlIIII[5]];
                    nArray6[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[28];
                    if (q.lIlIIlIIIIllIlI(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                        int[] nArray7 = new int[lIIIlllIlIIII[5]];
                        nArray7[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[28];
                        Inventory.getFirst((int[])nArray7).interact(lIIIlllIIllll[lIIIlllIlIIII[84]]);
                        Time.sleepTicks((int)lIIIlllIlIIII[5]);
                        0;
                    }
                }
            }
            if (q.lIlIIlIIIIlllIl(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIIIlllIlIIII[85]) && q.lIlIIlIIIIlllII(fc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllIIllll[lIIIlllIlIIII[86]];
                if (q.lIlIIlIIIIllIll(co, lIIIlllIlIIII[5])) {
                    P.lF += lIIIlllIlIIII[5];
                    P.d(AccBuilderRat.m);
                    co += lIIIlllIlIIII[5];
                    P.lF = lIIIlllIlIIII[4];
                    cp = lIIIlllIlIIII[4];
                }
                int[] nArray = new int[lIIIlllIlIIII[5]];
                nArray[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[14];
                if (q.lIlIIlIIIIllIlI(Inventory.contains((int[])nArray) ? 1 : 0) && q.lIlIIlIIIIlllII(Players.getLocal().isAnimating() ? 1 : 0)) {
                    int[] nArray8 = new int[lIIIlllIlIIII[5]];
                    nArray8[q.lIIIlllIlIIII[4]] = lIIIlllIlIIII[14];
                    Inventory.getFirst((int[])nArray8).interact(lIIIlllIIllll[lIIIlllIlIIII[87]]);
                    Time.sleepTicks((int)lIIIlllIlIIII[12]);
                    0;
                }
            }
            g.a(new String[lIIIlllIlIIII[4]]);
        }
    }

    private static boolean lIlIIlIIIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlIIIlIIIII(int n2) {
        return n2 > 0;
    }

    @Override
    public String Z() {
        return lIIIlllIIllll[lIIIlllIlIIII[94]];
    }

    private static boolean lIlIIlIIIlIIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public int Y() {
        try {
            q.ba();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (null != null) {
            return (0x48 ^ 0x1F) & ~(0x74 ^ 0x23);
        }
        return lIIIlllIlIIII[8];
    }

    private static boolean lIlIIlIIIIlllll(Object object) {
        return object != null;
    }

    private static boolean lIlIIlIIIIllIlI(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean X() {
        return lIIIlllIlIIII[4];
    }

    public q() {
        this.fk = new WorldArea(lIIIlllIlIIII[0], lIIIlllIlIIII[1], lIIIlllIlIIII[2], lIIIlllIlIIII[3], lIIIlllIlIIII[4]);
        this.fl = new WorldArea(lIIIlllIlIIII[0], lIIIlllIlIIII[1], lIIIlllIlIIII[2], lIIIlllIlIIII[3], lIIIlllIlIIII[5]);
        this.fm = new WorldArea(lIIIlllIlIIII[0], lIIIlllIlIIII[1], lIIIlllIlIIII[2], lIIIlllIlIIII[3], lIIIlllIlIIII[6]);
    }

    private static boolean lIlIIlIIIlIIlII(int n2) {
        return n2 < 0;
    }

    private static int lIlIIlIIIIllIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }
}

