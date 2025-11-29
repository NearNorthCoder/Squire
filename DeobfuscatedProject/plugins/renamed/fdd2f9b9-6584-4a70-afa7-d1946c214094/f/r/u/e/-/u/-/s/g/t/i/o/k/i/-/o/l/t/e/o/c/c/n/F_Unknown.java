/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Widgets
 */
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.U_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.b_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.d;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.f_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.g_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.i;
import gg.squire.account.AccBuilderRogues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Widgets;

public class F_Unknown
implements G {
    private static /* synthetic */ String[] lIIIlIIlII;
    private static final /* synthetic */ WorldPoint it;
    static /* synthetic */ int ck;
    static /* synthetic */ boolean cl;
    public static /* synthetic */ List<d> bv;
    private static final /* synthetic */ WorldPoint iv;
    private static /* synthetic */ int[] lIIIlIIlll;
    public static final /* synthetic */ String[] ip;
    private static final /* synthetic */ WorldPoint iu;
    public static /* synthetic */ long g;
    static /* synthetic */ int bT;
    public static /* synthetic */ boolean bt;
    private static final /* synthetic */ WorldPoint is;
    private static final /* synthetic */ WorldPoint iq;
    private static final /* synthetic */ WorldPoint ir;

    private static String lllIlIIIllll(String lIlIIllIlIll, String lIlIIllIllII) {
        try {
            SecretKeySpec lIlIIlllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIIllIllll = Cipher.getInstance("Blowfish");
            lIlIIllIllll.init(lIIIlIIlll[3], lIlIIlllIIII);
            return new String(lIlIIllIllll.doFinal(Base64.getDecoder().decode(lIlIIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIllIlllI) {
            lIlIIllIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIlIIlIl(int n2) {
        return n2 > 0;
    }

    private static void lllIlIIllllI() {
        lIIIlIIlll = new int[89];
        F.lIIIlIIlll[0] = (0xE7 ^ 0xBF ^ (0xC8 ^ 0xB8)) & (8 + 235 - 54 + 50 ^ 124 + 154 - 191 + 112 ^ -1);
        F.lIIIlIIlll[1] = 1;
        F.lIIIlIIlll[2] = 0x66 ^ 0x38 ^ (0x43 ^ 0x5B);
        F.lIIIlIIlll[3] = 2;
        F.lIIIlIIlll[4] = 0xFFFFB1FF & 0x4F7B;
        F.lIIIlIIlll[5] = 3;
        F.lIIIlIIlll[6] = 0x20 ^ 0x24;
        F.lIIIlIIlll[7] = 0x21 ^ 0x24;
        F.lIIIlIIlll[8] = -(0x12 ^ 0x45) & (0xFFFFD3FE & 0x3FDF);
        F.lIIIlIIlll[9] = 0xAD ^ 0xAB;
        F.lIIIlIIlll[10] = -(0xFFFF9D7E & 0x73B7) & (0xFFFFFFFF & 0x3FFF);
        F.lIIIlIIlll[11] = -(0xFFFFD8EF & 0x6716) & (0xFFFFDF6D & 0x7FDF);
        F.lIIIlIIlll[12] = 0xFFFFF37B & 0x3DD5;
        F.lIIIlIIlll[13] = -(0x1D ^ 4) & (0xFFFFDFDF & 0x3F7F);
        F.lIIIlIIlll[14] = 0xFFFFFBFA & 0x7BD;
        F.lIIIlIIlll[15] = 0x32 ^ 0x38;
        F.lIIIlIIlll[16] = -(0xFFFFBE27 & 0x61FB) & (0xFFFFBF7B & 0x7FEF);
        F.lIIIlIIlll[17] = 0xA5 ^ 0xB9 ^ (0x74 ^ 0x6F);
        F.lIIIlIIlll[18] = 31 + 70 - 4 + 81 ^ 147 + 174 - 138 + 3;
        F.lIIIlIIlll[19] = 0x13 ^ 0x1A;
        F.lIIIlIIlll[20] = 29 + 106 - 1 + 4 ^ 67 + 85 - 46 + 23;
        F.lIIIlIIlll[21] = 0x98 ^ 0x94;
        F.lIIIlIIlll[22] = 0xB3 ^ 0xBE;
        F.lIIIlIIlll[23] = 0x4A ^ 0x44;
        F.lIIIlIIlll[24] = 0x32 ^ 0x3B ^ (0x5D ^ 0x5B);
        F.lIIIlIIlll[25] = 0x7E ^ 0x6E;
        F.lIIIlIIlll[26] = 0x1B ^ 0xA;
        F.lIIIlIIlll[27] = 0x14 ^ 6;
        F.lIIIlIIlll[28] = 0xD7 ^ 0xC4;
        F.lIIIlIIlll[29] = 35 + 103 - 19 + 65 ^ 78 + 117 - 58 + 35;
        F.lIIIlIIlll[30] = 0x3D ^ 0x28;
        F.lIIIlIIlll[31] = 53 + 101 - 31 + 20 ^ 48 + 140 - 147 + 112;
        F.lIIIlIIlll[32] = 0x3F ^ 0x53 ^ (0x6F ^ 0x14);
        F.lIIIlIIlll[33] = 0xA0 ^ 0xB8;
        F.lIIIlIIlll[34] = 0x91 ^ 0x88;
        F.lIIIlIIlll[35] = 79 + 21 - 41 + 69 ^ 153 + 62 - 109 + 48;
        F.lIIIlIIlll[36] = 107 + 9 - -15 + 51 ^ 124 + 161 - 112 + 0;
        F.lIIIlIIlll[37] = 0x88 ^ 0x94;
        F.lIIIlIIlll[38] = -(0xFFFF8D73 & 0x77CE) & (0xFFFFDF63 & 0x7FFD);
        F.lIIIlIIlll[39] = 44 + 228 - 122 + 90;
        F.lIIIlIIlll[40] = 0x57 ^ 0x13 ^ (0x6D ^ 0x34);
        F.lIIIlIIlll[41] = 0x38 ^ 0x26;
        F.lIIIlIIlll[42] = 0x3D ^ 0x71 ^ (0x46 ^ 0x15);
        F.lIIIlIIlll[43] = 111 + 111 - 191 + 124 ^ 125 + 63 - 50 + 49;
        F.lIIIlIIlll[44] = 0xB8 ^ 0x99;
        F.lIIIlIIlll[45] = 0x6A ^ 0x64 ^ (0x4F ^ 0x63);
        F.lIIIlIIlll[46] = 0xFFFFBF1D & 0x7EFE;
        F.lIIIlIIlll[47] = -(85 + 125 - 18 + 3) & (0xFFFF97FE & 0x7FCF);
        F.lIIIlIIlll[48] = 0xF ^ 0x38;
        F.lIIIlIIlll[49] = -(0xFFFFF76E & 0x2C9D) & (0xFFFFEDFF & 0x37FF);
        F.lIIIlIIlll[50] = 0xFFFFBFEE & 0x6EDD;
        F.lIIIlIIlll[51] = -(0xFFFFFB45 & 0x14FE) & (0xFFFFFFFF & 0x71EB);
        F.lIIIlIIlll[52] = -(0xFFFFE4F7 & 0x7B9B) & (0xFFFFE7FF & 0x7FFE);
        F.lIIIlIIlll[53] = 0xBF ^ 0x97;
        F.lIIIlIIlll[54] = 0x59 ^ 0x3D;
        F.lIIIlIIlll[55] = 0x4E ^ 0x6F ^ 2;
        F.lIIIlIIlll[56] = 0x16 ^ 0x32;
        F.lIIIlIIlll[57] = 0x69 ^ 0x4C;
        F.lIIIlIIlll[58] = 0x74 ^ 0x52;
        F.lIIIlIIlll[59] = 115 + 53 - 63 + 84 ^ 68 + 143 - 115 + 58;
        F.lIIIlIIlll[60] = 0x93 ^ 0xBA;
        F.lIIIlIIlll[61] = 0xA2 ^ 0x88;
        F.lIIIlIIlll[62] = 0xAF ^ 0x84;
        F.lIIIlIIlll[63] = 0x20 ^ 0xC;
        F.lIIIlIIlll[64] = 0x2A ^ 7;
        F.lIIIlIIlll[65] = 189 + 139 - 232 + 95 ^ 24 + 120 - 94 + 95;
        F.lIIIlIIlll[66] = 0x28 ^ 0x77 ^ (0x22 ^ 0x52);
        F.lIIIlIIlll[67] = 0x28 ^ 0x46 ^ (0xCC ^ 0x92);
        F.lIIIlIIlll[68] = 0xB ^ 0x30 ^ (0x29 ^ 0x23);
        F.lIIIlIIlll[69] = 0xA1 ^ 0xC2 ^ (0x26 ^ 0x77);
        F.lIIIlIIlll[70] = 0x30 ^ 3;
        F.lIIIlIIlll[71] = 0x35 ^ 0x7E ^ 111 + 45 - 107 + 78;
        F.lIIIlIIlll[72] = 0xF0 ^ 0xC5;
        F.lIIIlIIlll[73] = 0x8F ^ 0xB9;
        F.lIIIlIIlll[74] = 0x6F ^ 0x62 ^ (0x33 ^ 6);
        F.lIIIlIIlll[75] = 0x3C ^ 5;
        F.lIIIlIIlll[76] = -(0xFFFFB463 & 0x7BFF) & (0xFFFFBEFF & 0x7DFF);
        F.lIIIlIIlll[77] = 0xFFFFEFB8 & 0x1CEF;
        F.lIIIlIIlll[78] = -(0xFFFFF163 & 0x7FDD) & (0xFFFFFDDE & Short.MAX_VALUE);
        F.lIIIlIIlll[79] = 0xFFFFDCEB & 0x2F9D;
        F.lIIIlIIlll[80] = 0xFFFFCEE7 & 0x3D9B;
        F.lIIIlIIlll[81] = 0xFFFFBCEE & 0x4F9D;
        F.lIIIlIIlll[82] = 0xFFFFCDAF & 0x3E75;
        F.lIIIlIIlll[83] = -(0xFFFFDFF6 & 0x703F) & (0xFFFFFCF7 & 0x5FFD);
        F.lIIIlIIlll[84] = -(0xFFFFF3EE & 0x6EDB) & (0xFFFFFFCF & 0x6EFF);
        F.lIIIlIIlll[85] = 0xFFFFAFFF & 0x5CBB;
        F.lIIIlIIlll[86] = 0xFFFF9FFF & 0x6BEE;
        F.lIIIlIIlll[87] = -(0xFFFFB37E & 0x6CC3) & (0xFFFFEDFF & 0x3EEF);
        F.lIIIlIIlll[88] = 0x76 ^ 0x4C;
    }

    private static String lllIlIIlIIIl(String lIlIIllllIII, String lIlIIlllIlll) {
        try {
            SecretKeySpec lIlIIlllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIlllIlll.getBytes(StandardCharsets.UTF_8)), lIIIlIIlll[18]), "DES");
            Cipher lIlIIlllllII = Cipher.getInstance("DES");
            lIlIIlllllII.init(lIIIlIIlll[3], lIlIIlllllIl);
            return new String(lIlIIlllllII.doFinal(Base64.getDecoder().decode(lIlIIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIllllIll) {
            lIlIIllllIll.printStackTrace();
            return null;
        }
    }

    private static int lllIlIIlllll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static void af() {
        d lIlIlIIlllII;
        Object lIlIlIIlllIl;
        int[] nArray = new int[lIIIlIIlll[1]];
        nArray[F.lIIIlIIlll[0]] = lIIIlIIlll[10];
        if (F.lllIlIlIIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIIIlIIlll[10], lIIIlIIlll[1], lIIIlIIlll[46]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[lIIIlIIlll[1]];
        nArray2[F.lIIIlIIlll[0]] = lIIIlIIlll[14];
        if (F.lllIlIlIIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIlIlIIlllIl = new d(lIIIlIIlll[14], lIIIlIIlll[1], lIIIlIIlll[47]);
            bv.add((d)lIlIlIIlllIl);
            0;
        }
        int[] nArray3 = new int[lIIIlIIlll[1]];
        nArray3[F.lIIIlIIlll[0]] = lIIIlIIlll[4];
        if (F.lllIlIlIIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIlIlIIlllIl = new d(lIIIlIIlll[4], lIIIlIIlll[48], lIIIlIIlll[49]);
            bv.add((d)lIlIlIIlllIl);
            0;
        }
        if (F.lllIlIlIIIll(Bank.contains((Predicate)(lIlIlIIlllIl = item -> item.getName().toLowerCase().contains(lIIIlIIlII[lIIIlIIlll[56]]))) ? 1 : 0)) {
            lIlIlIIlllII = new d(lIIIlIIlll[50], lIIIlIIlll[7], lIIIlIIlll[51]);
            bv.add(lIlIlIIlllII);
            0;
        }
        int[] nArray4 = new int[lIIIlIIlll[1]];
        nArray4[F.lIIIlIIlll[0]] = lIIIlIIlll[11];
        if (F.lllIlIlIIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIlIlIIlllII = new d(lIIIlIIlll[11], lIIIlIIlll[15], lIIIlIIlll[52]);
            bv.add(lIlIlIIlllII);
            0;
        }
        int[] nArray5 = new int[lIIIlIIlll[1]];
        nArray5[F.lIIIlIIlll[0]] = lIIIlIIlll[16];
        if (F.lllIlIlIIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIlIlIIlllII = new d(lIIIlIIlll[16], lIIIlIIlll[15], lIIIlIIlll[52]);
            bv.add(lIlIlIIlllII);
            0;
        }
        int[] nArray6 = new int[lIIIlIIlll[1]];
        nArray6[F.lIIIlIIlll[0]] = lIIIlIIlll[13];
        if (F.lllIlIlIIIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lIlIlIIlllII = new d(lIIIlIIlll[13], lIIIlIIlll[53], lIIIlIIlll[52]);
            bv.add(lIlIlIIlllII);
            0;
        }
        int[] nArray7 = new int[lIIIlIIlll[1]];
        nArray7[F.lIIIlIIlll[0]] = lIIIlIIlll[12];
        if (F.lllIlIlIIIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lIlIlIIlllII = new d(lIIIlIIlll[12], lIIIlIIlll[7], i.bq);
            bv.add(lIlIlIIlllII);
            0;
        }
    }

    @Override
    public boolean S() {
        return lIIIlIIlll[0];
    }

    private static boolean lllIlIlIIlII(int n2) {
        return n2 < 0;
    }

    private static boolean lllIlIlIIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIlIlIlIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lllIlIlIIllI(Object object) {
        return object != null;
    }

    private static boolean lllIlIlIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllIlIlIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static int lllIlIlIIIII(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static void lllIlIIlllIl() {
        lIIIlIIlII = new String[lIIIlIIlll[88]];
        F.lIIIlIIlII[F.lIIIlIIlll[0]] = F."Buying items";
        F.lIIIlIIlII[F.lIIIlIIlll[1]] = F."Finished buying items, switching back to quest";
        F.lIIIlIIlII[F.lIIIlIIlll[3]] = F."Drink";
        F.lIIIlIIlII[F.lIIIlIIlll[5]] = F."Eat";
        F.lIIIlIIlII[F.lIIIlIIlll[6]] = F."Nav to bank";
        F.lIIIlIIlII[F.lIIIlIIlll[7]] = F."Handling banking";
        F.lIIIlIIlII[F.lIIIlIIlll[9]] = F."We are missing quest supplies, switching to BUYING";
        F.lIIIlIIlII[F.lIIIlIIlll[17]] = F."Nav to start";
        F.lIIIlIIlII[F.lIIIlIIlll[18]] = F."Interact npc";
        F.lIIIlIIlII[F.lIIIlIIlll[19]] = F."Drop";
        F.lIIIlIIlII[F.lIIIlIIlll[15]] = F."Veos";
        F.lIIIlIIlII[F.lIIIlIIlll[20]] = F."Treasure scroll";
        F.lIIIlIIlII[F.lIIIlIIlll[21]] = F."Wear";
        F.lIIIlIIlII[F.lIIIlIIlll[22]] = F."Wear";
        F.lIIIlIIlII[F.lIIIlIIlll[23]] = F."Nav to dig 1";
        F.lIIIlIIlII[F.lIIIlIIlll[24]] = F."Spade";
        F.lIIIlIIlII[F.lIIIlIIlll[25]] = F."Dig";
        F.lIIIlIIlII[F.lIIIlIIlll[26]] = F."Nav to dig 2";
        F.lIIIlIIlII[F.lIIIlIIlll[27]] = F."Spade";
        F.lIIIlIIlII[F.lIIIlIIlll[28]] = F."Dig";
        F.lIIIlIIlII[F.lIIIlIIlll[29]] = F."Nav to dig 3";
        F.lIIIlIIlII[F.lIIIlIIlll[30]] = F."Spade";
        F.lIIIlIIlII[F.lIIIlIIlll[31]] = F."Dig";
        F.lIIIlIIlII[F.lIIIlIIlll[32]] = F."Nav to dig 4";
        F.lIIIlIIlII[F.lIIIlIIlll[33]] = F."Spade";
        F.lIIIlIIlII[F.lIIIlIIlll[34]] = F."Dig";
        F.lIIIlIIlII[F.lIIIlIIlll[35]] = F."Nav to veos finish";
        F.lIIIlIIlII[F.lIIIlIIlll[36]] = F."Interact npc";
        F.lIIIlIIlII[F.lIIIlIIlll[37]] = F."Veos";
        F.lIIIlIIlII[F.lIIIlIIlll[40]] = F."Rubbing lamp";
        F.lIIIlIIlII[F.lIIIlIIlll[41]] = F."Rub";
        F.lIIIlIIlII[F.lIIIlIIlll[42]] = F."Selecting slayer";
        F.lIIIlIIlII[F.lIIIlIIlll[43]] = F."Slayer";
        F.lIIIlIIlII[F.lIIIlIIlll[44]] = F."Confirm";
        F.lIIIlIIlII[F.lIIIlIIlll[45]] = F."Spade";
        F.lIIIlIIlII[F.lIIIlIIlll[55]] = F."X marks the spot quest";
        F.lIIIlIIlII[F.lIIIlIIlll[56]] = F."ring of wealth (";
        F.lIIIlIIlII[F.lIIIlIIlll[57]] = F."wealth";
        F.lIIIlIIlII[F.lIIIlIIlll[58]] = F."wealth";
        F.lIIIlIIlII[F.lIIIlIIlll[59]] = F."wealth";
        F.lIIIlIIlII[F.lIIIlIIlll[53]] = F."glory";
        F.lIIIlIIlII[F.lIIIlIIlll[60]] = F."glory";
        F.lIIIlIIlII[F.lIIIlIIlll[61]] = F."glory";
        F.lIIIlIIlII[F.lIIIlIIlll[62]] = F."Ok, I'm up for an adventure.";
        F.lIIIlIIlII[F.lIIIlIIlll[63]] = F."A glass of your finest ale please.";
        F.lIIIlIIlII[F.lIIIlIIlll[64]] = F."Morgan needs your help!";
        F.lIIIlIIlII[F.lIIIlIIlll[65]] = F."Yes.";
        F.lIIIlIIlII[F.lIIIlIIlll[66]] = F."I'm looking for a quest!";
        F.lIIIlIIlII[F.lIIIlIIlll[67]] = F."Ok, let me help then.";
        F.lIIIlIIlII[F.lIIIlIIlll[68]] = F."Father Aereck sent me to talk to you.";
        F.lIIIlIIlII[F.lIIIlIIlll[69]] = F."He's got a ghost haunting his graveyard.";
        F.lIIIlIIlII[F.lIIIlIIlll[70]] = F."Yep, now tell me what the problem is.";
        F.lIIIlIIlII[F.lIIIlIIlll[71]] = F."Sure.";
        F.lIIIlIIlII[F.lIIIlIIlll[72]] = F."I'm wearing an amulet of ghost speak!";
        F.lIIIlIIlII[F.lIIIlIIlll[73]] = F."Yes, I'm sure.";
        F.lIIIlIIlII[F.lIIIlIIlll[48]] = F."How can I help?";
        F.lIIIlIIlII[F.lIIIlIIlll[74]] = F."I'm looking for a quest.";
        F.lIIIlIIlII[F.lIIIlIIlll[75]] = F."Can I help?";
    }

    static {
        F.lllIlIIllllI();
        F.lllIlIIlllIl();
        String[] stringArray = new String[lIIIlIIlll[24]];
        stringArray[F.lIIIlIIlll[0]] = lIIIlIIlII[lIIIlIIlll[62]];
        stringArray[F.lIIIlIIlll[1]] = lIIIlIIlII[lIIIlIIlll[63]];
        stringArray[F.lIIIlIIlll[3]] = lIIIlIIlII[lIIIlIIlll[64]];
        stringArray[F.lIIIlIIlll[5]] = lIIIlIIlII[lIIIlIIlll[65]];
        stringArray[F.lIIIlIIlll[6]] = lIIIlIIlII[lIIIlIIlll[66]];
        stringArray[F.lIIIlIIlll[7]] = lIIIlIIlII[lIIIlIIlll[67]];
        stringArray[F.lIIIlIIlll[9]] = lIIIlIIlII[lIIIlIIlll[68]];
        stringArray[F.lIIIlIIlll[17]] = lIIIlIIlII[lIIIlIIlll[69]];
        stringArray[F.lIIIlIIlll[18]] = lIIIlIIlII[lIIIlIIlll[70]];
        stringArray[F.lIIIlIIlll[19]] = lIIIlIIlII[lIIIlIIlll[71]];
        stringArray[F.lIIIlIIlll[15]] = lIIIlIIlII[lIIIlIIlll[72]];
        stringArray[F.lIIIlIIlll[20]] = lIIIlIIlII[lIIIlIIlll[73]];
        stringArray[F.lIIIlIIlll[21]] = lIIIlIIlII[lIIIlIIlll[48]];
        stringArray[F.lIIIlIIlll[22]] = lIIIlIIlII[lIIIlIIlll[74]];
        stringArray[F.lIIIlIIlll[23]] = lIIIlIIlII[lIIIlIIlll[75]];
        ip = stringArray;
        iq = new WorldPoint(lIIIlIIlll[76], lIIIlIIlll[77], lIIIlIIlll[0]);
        ir = new WorldPoint(lIIIlIIlll[78], lIIIlIIlll[79], lIIIlIIlll[0]);
        is = new WorldPoint(lIIIlIIlll[80], lIIIlIIlll[81], lIIIlIIlll[0]);
        it = new WorldPoint(lIIIlIIlll[82], lIIIlIIlll[83], lIIIlIIlll[0]);
        iu = new WorldPoint(lIIIlIIlll[84], lIIIlIIlll[85], lIIIlIIlll[0]);
        iv = new WorldPoint(lIIIlIIlll[86], lIIIlIIlll[87], lIIIlIIlll[0]);
        bv = new ArrayList<d>();
        bT = lIIIlIIlll[0];
    }

    private static boolean lllIlIlIIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lllIlIlIlIlI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public int T() {
        try {
            F.cm();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIIIlIIlll[54];
    }

    private static String lllIlIIIlllI(String lIlIlIIIllll, String lIlIlIIIlIIl) {
        lIlIlIIIllll = new String(Base64.getDecoder().decode(lIlIlIIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIlIIIllIl = new StringBuilder();
        char[] lIlIlIIIllII = lIlIlIIIlIIl.toCharArray();
        int lIlIlIIIlIll = lIIIlIIlll[0];
        char[] lIlIlIIIIlIl = lIlIlIIIllll.toCharArray();
        int lIlIlIIIIlII = lIlIlIIIIlIl.length;
        int lIlIlIIIIIll = lIIIlIIlll[0];
        while (F.lllIlIlIIIlI(lIlIlIIIIIll, lIlIlIIIIlII)) {
            char lIlIlIIlIIII = lIlIlIIIIlIl[lIlIlIIIIIll];
            lIlIlIIIllIl.append((char)(lIlIlIIlIIII ^ lIlIlIIIllII[lIlIlIIIlIll % lIlIlIIIllII.length]));
            0;
            ++lIlIlIIIlIll;
            ++lIlIlIIIIIll;
            0;
            if ((0xAC ^ 0xA9) > 0) continue;
            return null;
        }
        return String.valueOf(lIlIlIIIllIl);
    }

    @Override
    public String U() {
        return lIIIlIIlII[lIIIlIIlll[55]];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean V() {
        int n2;
        if (F.lllIlIlIlIlI(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIIlIIlll[18])) {
            int[] nArray = new int[lIIIlIIlll[1]];
            nArray[F.lIIIlIIlll[0]] = lIIIlIIlll[38];
            if (F.lllIlIlIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lIIIlIIlll[1];
                0;
                if (null == null) return n2 != 0;
                return false;
            }
        }
        n2 = lIIIlIIlll[0];
        return n2 != 0;
    }

    private static boolean lllIlIlIIIIl(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        String[] stringArray = new String[lIIIlIIlll[1]];
        stringArray[F.lIIIlIIlll[0]] = lIIIlIIlII[lIIIlIIlll[45]];
        if (F.lllIlIlIIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lIIIlIIlll[1]];
            nArray[F.lIIIlIIlll[0]] = lIIIlIIlll[4];
            if (F.lllIlIlIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lIIIlIIlll[1];
                0;
                if (-(0xAC ^ 0xA8) <= 0) return n2 != 0;
                return false;
            }
        }
        n2 = lIIIlIIlll[0];
        return n2 != 0;
    }

    public static void cm() {
        if (F.lllIlIlIIIIl(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIIlIIlII[lIIIlIIlll[0]];
            b.a(bv);
            if (F.lllIlIlIIIlI(bv.size(), lIIIlIIlll[1])) {
                System.out.println(lIIIlIIlII[lIIIlIIlll[1]]);
                bt = lIIIlIIlll[0];
            }
        }
        if (F.lllIlIlIIIll(bt ? 1 : 0)) {
            block49: {
                BankLocation lIlIlIlIIIIl;
                if (F.lllIlIlIIIIl(Inventory.contains((int[])f.aV) ? 1 : 0) && F.lllIlIlIIIlI(Movement.getRunEnergy(), lIIIlIIlll[2])) {
                    Inventory.getFirst((int[])f.aV).interact(lIIIlIIlII[lIIIlIIlll[3]]);
                    Time.sleepTicks((int)lIIIlIIlll[1]);
                    0;
                }
                if (F.lllIlIlIIlII(F.lllIlIIlllll(e.u(), 70.0))) {
                    int[] nArray = new int[lIIIlIIlll[1]];
                    nArray[F.lIIIlIIlll[0]] = lIIIlIIlll[4];
                    if (F.lllIlIlIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lIIIlIIlll[1]];
                        nArray2[F.lIIIlIIlll[0]] = lIIIlIIlll[4];
                        Inventory.getFirst((int[])nArray2).interact(lIIIlIIlII[lIIIlIIlll[5]]);
                    }
                }
                if (F.lllIlIlIIIll(Movement.isRunEnabled() ? 1 : 0) && F.lllIlIlIIlIl(Movement.getRunEnergy())) {
                    Movement.toggleRun();
                }
                if (F.lllIlIlIIIll(F.ab() ? 1 : 0) && F.lllIlIlIIIll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()))) {
                    lIlIlIlIIIIl = BankLocation.getNearest();
                    if (F.lllIlIlIIllI(lIlIlIlIIIIl) && F.lllIlIlIIIll(lIlIlIlIIIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIIlIIlII[lIIIlIIlll[6]];
                        a.a(lIlIlIlIIIIl);
                        Time.sleepTicks((int)lIIIlIIlll[3]);
                        0;
                    }
                    if (F.lllIlIlIIllI(lIlIlIlIIIIl) && F.lllIlIlIIIIl(lIlIlIlIIIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIIlIIlII[lIIIlIIlll[7]];
                        if (F.lllIlIlIIIll(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlIIlll[8]);
                            0;
                        }
                        if (F.lllIlIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                            if (F.lllIlIlIIlIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIIlIIlll[6]);
                                0;
                            }
                            if (F.lllIlIlIIlIl(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIIlIIlll[3]);
                                0;
                            }
                            int[] nArray = new int[lIIIlIIlll[9]];
                            nArray[F.lIIIlIIlll[0]] = lIIIlIIlll[10];
                            nArray[F.lIIIlIIlll[1]] = lIIIlIIlll[11];
                            nArray[F.lIIIlIIlll[3]] = lIIIlIIlll[12];
                            nArray[F.lIIIlIIlll[5]] = lIIIlIIlll[13];
                            nArray[F.lIIIlIIlll[6]] = lIIIlIIlll[4];
                            nArray[F.lIIIlIIlll[7]] = lIIIlIIlll[14];
                            if (F.lllIlIlIIIll(e.b(nArray) ? 1 : 0)) {
                                F.af();
                                System.out.println(lIIIlIIlII[lIIIlIIlll[9]]);
                                bt = lIIIlIIlll[1];
                                return;
                            }
                            int[] nArray3 = new int[lIIIlIIlll[9]];
                            nArray3[F.lIIIlIIlll[0]] = lIIIlIIlll[10];
                            nArray3[F.lIIIlIIlll[1]] = lIIIlIIlll[11];
                            nArray3[F.lIIIlIIlll[3]] = lIIIlIIlll[12];
                            nArray3[F.lIIIlIIlll[5]] = lIIIlIIlll[13];
                            nArray3[F.lIIIlIIlll[6]] = lIIIlIIlll[4];
                            nArray3[F.lIIIlIIlll[7]] = lIIIlIIlll[14];
                            if (F.lllIlIlIIIIl(e.b(nArray3) ? 1 : 0)) {
                                Bank.withdraw((int)lIIIlIIlll[11], (int)lIIIlIIlll[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIIIlIIlll[1]);
                                0;
                                Bank.withdraw((int)lIIIlIIlll[14], (int)lIIIlIIlll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIIIlIIlll[1]);
                                0;
                                Bank.withdraw((int)lIIIlIIlll[16], (int)lIIIlIIlll[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIIIlIIlll[1]);
                                0;
                                Bank.withdraw((int)lIIIlIIlll[13], (int)lIIIlIIlll[7], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIIIlIIlll[1]);
                                0;
                                Bank.withdraw((int)lIIIlIIlll[10], (int)lIIIlIIlll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIIIlIIlll[1]);
                                0;
                                a.b(f.aV, lIIIlIIlll[6]);
                                a.a(lIIIlIIlll[4], lIIIlIIlll[15]);
                                a.b(f.bf, lIIIlIIlll[1]);
                            }
                        }
                    }
                }
                if (F.lllIlIlIIIll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId())) && F.lllIlIlIIIIl(F.ab() ? 1 : 0)) {
                    if (F.lllIlIlIIlll(Players.getLocal().getWorldLocation().distanceTo(iq), lIIIlIIlll[3])) {
                        AccBuilderRogues.c = lIIIlIIlII[lIIIlIIlll[17]];
                        if (F.lllIlIlIIIlI(bT, lIIIlIIlll[1])) {
                            e.v();
                            bT += lIIIlIIlll[1];
                        }
                        Movement.walkTo((WorldPoint)iq);
                        0;
                        Time.sleepTicks((int)lIIIlIIlll[1]);
                        0;
                    }
                    if (F.lllIlIlIlIII(Players.getLocal().getWorldLocation().distanceTo(iq), lIIIlIIlll[3])) {
                        AccBuilderRogues.c = lIIIlIIlII[lIIIlIIlll[18]];
                        if (F.lllIlIlIIIll(F.lllIlIlIIIII(g, 0L))) {
                            g = System.currentTimeMillis();
                        }
                        if (F.lllIlIlIIIIl(F.lllIlIlIIIII(g, 0L)) && F.lllIlIlIIlIl(F.lllIlIlIIIII(e.a(g), 30000L))) {
                            bT = lIIIlIIlll[0];
                            g = System.currentTimeMillis();
                        }
                        if (F.lllIlIlIIIlI(bT, lIIIlIIlll[1])) {
                            e.v();
                            bT += lIIIlIIlll[1];
                        }
                        if (F.lllIlIlIIIIl(Inventory.isFull() ? 1 : 0)) {
                            int[] nArray = new int[lIIIlIIlll[1]];
                            nArray[F.lIIIlIIlll[0]] = lIIIlIIlll[4];
                            Inventory.getFirst((int[])nArray).interact(lIIIlIIlII[lIIIlIIlll[19]]);
                            Time.sleepTicks((int)lIIIlIIlll[3]);
                            0;
                        }
                        f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.g_Unknown.a(lIIIlIIlII[lIIIlIIlll[15]], ip, lIIIlIIlll[1]);
                    }
                }
                if (F.lllIlIlIlIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIIlIIlll[1])) {
                    ck = lIIIlIIlll[0];
                    String[] stringArray = new String[lIIIlIIlll[1]];
                    stringArray[F.lIIIlIIlll[0]] = lIIIlIIlII[lIIIlIIlll[20]];
                    if (F.lllIlIlIIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.g_Unknown.a(ip);
                    }
                }
                if (F.lllIlIlIlIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIIlIIlll[3])) {
                    if (F.lllIlIlIIIIl(Inventory.contains(item -> item.getName().contains(lIIIlIIlII[lIIIlIIlll[61]])) ? 1 : 0) && F.lllIlIlIIIll(Equipment.contains(item -> item.getName().contains(lIIIlIIlII[lIIIlIIlll[60]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(lIIIlIIlII[lIIIlIIlll[53]])).interact(lIIIlIIlII[lIIIlIIlll[21]]);
                    }
                    if (F.lllIlIlIIIIl(Inventory.contains(item -> item.getName().contains(lIIIlIIlII[lIIIlIIlll[59]])) ? 1 : 0) && F.lllIlIlIIIll(Equipment.contains(item -> item.getName().contains(lIIIlIIlII[lIIIlIIlll[58]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(lIIIlIIlII[lIIIlIIlll[57]])).interact(lIIIlIIlII[lIIIlIIlll[22]]);
                    }
                    if (F.lllIlIlIIIll(Players.getLocal().getWorldLocation().equals((Object)ir) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIIlIIlII[lIIIlIIlll[23]];
                        Movement.walkTo((WorldPoint)ir);
                        0;
                        Time.sleepTicks((int)lIIIlIIlll[1]);
                        0;
                    }
                    if (F.lllIlIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)ir) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIlIIlll[1]];
                        stringArray[F.lIIIlIIlll[0]] = lIIIlIIlII[lIIIlIIlll[24]];
                        Inventory.getFirst((String[])stringArray).interact(lIIIlIIlII[lIIIlIIlll[25]]);
                        Time.sleepTicks((int)lIIIlIIlll[3]);
                        0;
                    }
                }
                if (F.lllIlIlIlIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIIlIIlll[5])) {
                    if (F.lllIlIlIIIll(Players.getLocal().getWorldLocation().equals((Object)is) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIIlIIlII[lIIIlIIlll[26]];
                        Movement.walkTo((WorldPoint)is);
                        0;
                        Time.sleepTicks((int)lIIIlIIlll[1]);
                        0;
                    }
                    if (F.lllIlIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)is) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIlIIlll[1]];
                        stringArray[F.lIIIlIIlll[0]] = lIIIlIIlII[lIIIlIIlll[27]];
                        Inventory.getFirst((String[])stringArray).interact(lIIIlIIlII[lIIIlIIlll[28]]);
                        Time.sleepTicks((int)lIIIlIIlll[3]);
                        0;
                    }
                }
                if (F.lllIlIlIlIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIIlIIlll[6])) {
                    if (F.lllIlIlIIIll(Players.getLocal().getWorldLocation().equals((Object)it) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIIlIIlII[lIIIlIIlll[29]];
                        Movement.walkTo((WorldPoint)it);
                        0;
                        Time.sleepTicks((int)lIIIlIIlll[1]);
                        0;
                    }
                    if (F.lllIlIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)it) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIlIIlll[1]];
                        stringArray[F.lIIIlIIlll[0]] = lIIIlIIlII[lIIIlIIlll[30]];
                        Inventory.getFirst((String[])stringArray).interact(lIIIlIIlII[lIIIlIIlll[31]]);
                        Time.sleepTicks((int)lIIIlIIlll[3]);
                        0;
                    }
                }
                if (F.lllIlIlIlIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIIlIIlll[7])) {
                    if (F.lllIlIlIIIll(Players.getLocal().getWorldLocation().equals((Object)iu) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIIlIIlII[lIIIlIIlll[32]];
                        Movement.walkTo((WorldPoint)iu);
                        0;
                        Time.sleepTicks((int)lIIIlIIlll[1]);
                        0;
                    }
                    if (F.lllIlIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)iu) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIlIIlll[1]];
                        stringArray[F.lIIIlIIlll[0]] = lIIIlIIlII[lIIIlIIlll[33]];
                        Inventory.getFirst((String[])stringArray).interact(lIIIlIIlII[lIIIlIIlll[34]]);
                        Time.sleepTicks((int)lIIIlIIlll[3]);
                        0;
                    }
                }
                if (F.lllIlIlIlIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIIlIIlll[9])) {
                    if (F.lllIlIlIIlll(Players.getLocal().getWorldLocation().distanceTo(iv), lIIIlIIlll[5])) {
                        AccBuilderRogues.c = lIIIlIIlII[lIIIlIIlll[35]];
                        Movement.walkTo((WorldPoint)iv);
                        0;
                        Time.sleepTicks((int)lIIIlIIlll[1]);
                        0;
                    }
                    if (F.lllIlIlIlIII(Players.getLocal().getWorldLocation().distanceTo(iv), lIIIlIIlll[5])) {
                        AccBuilderRogues.c = lIIIlIIlII[lIIIlIIlll[36]];
                        if (F.lllIlIlIIIlI(ck, lIIIlIIlll[1])) {
                            U.mC += lIIIlIIlll[1];
                            U.o(AccBuilderRogues.m);
                            ck += lIIIlIIlll[1];
                            U.mC = lIIIlIIlll[0];
                            cl = lIIIlIIlll[0];
                        }
                        f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.g_Unknown.a(lIIIlIIlII[lIIIlIIlll[37]], ip);
                    }
                }
                if (F.lllIlIlIlIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIIlIIlll[17])) {
                    f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.g_Unknown.a(ip);
                }
                do {
                    int[] nArray = new int[lIIIlIIlll[1]];
                    nArray[F.lIIIlIIlll[0]] = lIIIlIIlll[38];
                    if (!F.lllIlIlIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block49;
                    if (F.lllIlIlIIllI(Widgets.get((int)lIIIlIIlll[39]))) {
                        Widget lIlIlIlIIIII;
                        AccBuilderRogues.c = lIIIlIIlII[lIIIlIIlll[40]];
                        int[] nArray4 = new int[lIIIlIIlll[1]];
                        nArray4[F.lIIIlIIlll[0]] = lIIIlIIlll[38];
                        Inventory.getFirst((int[])nArray4).interact(lIIIlIIlII[lIIIlIIlll[41]]);
                        Time.sleepTicks((int)lIIIlIIlll[6]);
                        0;
                        AccBuilderRogues.c = lIIIlIIlII[lIIIlIIlll[42]];
                        lIlIlIlIIIIl = Widgets.get((int)lIIIlIIlll[39], (int)lIIIlIIlll[23]);
                        if (F.lllIlIlIIllI(lIlIlIlIIIIl)) {
                            lIlIlIlIIIIl.interact(lIIIlIIlII[lIIIlIIlll[43]]);
                            Time.sleepTicks((int)lIIIlIIlll[1]);
                            0;
                        }
                        if (F.lllIlIlIIllI(lIlIlIlIIIII = Widgets.get((int)lIIIlIIlll[39], (int)lIIIlIIlll[35]))) {
                            lIlIlIlIIIII.interact(lIIIlIIlII[lIIIlIIlll[44]]);
                            Time.sleepTicks((int)lIIIlIIlll[3]);
                            0;
                        }
                    }
                    Time.sleepTicks((int)lIIIlIIlll[1]);
                    0;
                    0;
                } while (1 > -1);
                return;
            }
            f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.g_Unknown.a(new String[lIIIlIIlll[0]]);
        }
    }
}

