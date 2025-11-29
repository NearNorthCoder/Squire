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
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.G;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.I;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.M;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.N;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.U;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.an;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ar;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.as;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.j;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.n;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.o;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.u;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.w;
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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class v
implements ab {
    static /* synthetic */ WorldPoint dq;
    static /* synthetic */ boolean dl;
    private static /* synthetic */ int[] lIIIIIIIlI;
    private static /* synthetic */ int da;
    static /* synthetic */ WorldArea do;
    static /* synthetic */ int dk;
    public static /* synthetic */ boolean bv;
    static /* synthetic */ WorldArea dn;
    static /* synthetic */ WorldPoint dr;
    private static /* synthetic */ String ds;
    static /* synthetic */ WorldPoint dg;
    private static /* synthetic */ String[] cG;
    public static /* synthetic */ List<d> bx;
    private static /* synthetic */ String[] lllllllll;
    static /* synthetic */ WorldArea dp;

    private static boolean llIllIllIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void ba() {
        WorldArea worldArea = new WorldArea(lIIIIIIIlI[52], lIIIIIIIlI[56], lIIIIIIIlI[16], lIIIIIIIlI[4], lIIIIIIIlI[1]);
        if (v.llIllIllIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] stringArray = new String[lIIIIIIIlI[0]];
            stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[142]];
            TileObjects.getNearest((String[])stringArray).interact(lllllllll[lIIIIIIIlI[143]]);
            Time.sleepTicks((int)lIIIIIIIlI[9]);
            0;
        }
        if (v.llIllIllIlII(dn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIIIIlI[21])) {
            AccBuilderGWD.c = lllllllll[lIIIIIIIlI[144]];
            if (v.llIllIllIIlI(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)dg);
            0;
            Time.sleepTicks((int)lIIIIIIIlI[0]);
            0;
        }
        if (v.llIllIllIIlI(dn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIllIlllIll(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIIIIlI[21])) {
            g.a(lllllllll[lIIIIIIIlI[145]], cG);
        }
        if (v.llIllIllIIlI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIIIIIIlI[52], lIIIIIIIlI[53], lIIIIIIIlI[1])) ? 1 : 0)) {
            String[] stringArray = new String[lIIIIIIIlI[0]];
            stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[99]];
            TileObjects.getNearest((String[])stringArray).interact(lllllllll[lIIIIIIIlI[146]]);
            Time.sleepTicks((int)lIIIIIIIlI[9]);
            0;
        }
    }

    private static boolean llIllIllIlII(int n2) {
        return n2 == 0;
    }

    private static String llIllIIlllII(String lIIlIlIIlllII, String lIIlIlIIllIll) {
        try {
            SecretKeySpec lIIlIlIlIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIlIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlIlIlIIIII = Cipher.getInstance("Blowfish");
            lIIlIlIlIIIII.init(lIIIIIIIlI[9], lIIlIlIlIIIIl);
            return new String(lIIlIlIlIIIII.doFinal(Base64.getDecoder().decode(lIIlIlIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIlIIlllll) {
            lIIlIlIIlllll.printStackTrace();
            return null;
        }
    }

    private static void llIllIllIIII() {
        lIIIIIIIlI = new int[182];
        v.lIIIIIIIlI[0] = 1;
        v.lIIIIIIIlI[1] = (0xD4 ^ 0x99) & ~(0x4E ^ 3);
        v.lIIIIIIIlI[2] = 91 + 50 - 104 + 105 + (8 + 118 - 53 + 68) - (41 + 123 - 72 + 76) + (0xCE ^ 0xB3);
        v.lIIIIIIIlI[3] = 0x49 ^ 0x4D ^ (0x53 ^ 0x16);
        v.lIIIIIIIlI[4] = 0xB6 ^ 0xBC;
        v.lIIIIIIIlI[5] = -(0xFFFFAA77 & 0x779A) & (0xFFFFF73F & 0x2BFF);
        v.lIIIIIIIlI[6] = 0x94 ^ 0x93 ^ (0x50 ^ 0x6B);
        v.lIIIIIIIlI[7] = 0xFFFFB17B & 0x4FB7;
        v.lIIIIIIIlI[8] = 129 + 74 - 169 + 164 ^ 120 + 131 - 243 + 187;
        v.lIIIIIIIlI[9] = 2;
        v.lIIIIIIIlI[10] = 0xDC ^ 0xBD ^ (0x7E ^ 0x3F);
        v.lIIIIIIIlI[11] = 3;
        v.lIIIIIIIlI[12] = 0x70 ^ 0x24 ^ (0xD1 ^ 0x96);
        v.lIIIIIIIlI[13] = 79 + 38 - 30 + 86 ^ 113 + 33 - 28 + 51;
        v.lIIIIIIIlI[14] = 0x74 ^ 0x57;
        v.lIIIIIIIlI[15] = 91 + 119 - 200 + 131 ^ 45 + 104 - 49 + 91;
        v.lIIIIIIIlI[16] = 0xB ^ 0xD;
        v.lIIIIIIIlI[17] = 0xFFFFB3FF & 0x4FF2;
        v.lIIIIIIIlI[18] = -(0xFFFFB5A4 & 0x6E5F) & (0xFFFFEF3F & 0x3CDF);
        v.lIIIIIIIlI[19] = 0x82 ^ 0x8B;
        v.lIIIIIIIlI[20] = 0x92 ^ 0x95;
        v.lIIIIIIIlI[21] = 0x88 ^ 0xAC ^ (0x92 ^ 0xBE);
        v.lIIIIIIIlI[22] = 0x2C ^ 4;
        v.lIIIIIIIlI[23] = 158 + 68 - 208 + 185 ^ 151 + 89 - 181 + 133;
        v.lIIIIIIIlI[24] = 0x74 ^ 0x32 ^ (0xFA ^ 0xB0);
        v.lIIIIIIIlI[25] = 0x89 ^ 0x84;
        v.lIIIIIIIlI[26] = 0x62 ^ 0x6C;
        v.lIIIIIIIlI[27] = -(0xFFFFE177 & 0x3EBB) & (0xFFFFBBFF & 0x77BA);
        v.lIIIIIIIlI[28] = 0x82 ^ 0x8D;
        v.lIIIIIIIlI[29] = 0xFFFFCFEF & 0x379B;
        v.lIIIIIIIlI[30] = 0xFFFFDDBF & 0x6EDF;
        v.lIIIIIIIlI[31] = 0xFFFFEEF7 & 0x5DAD;
        v.lIIIIIIIlI[32] = -(0xFFFFD9B6 & 0x7FDB) & (0xFFFFDBFF & 0x7F9F);
        v.lIIIIIIIlI[33] = -(0xFFFFFB03 & 0x66FD) & (0xFFFFEB3F & 0x7FEF);
        v.lIIIIIIIlI[34] = -(0xFFFF9EAF & 0x6BF9) & (0xFFFFFFFB & 0x3BFD);
        v.lIIIIIIIlI[35] = 0x5F ^ 0x71 ^ (0x88 ^ 0xB6);
        v.lIIIIIIIlI[36] = 0xFFFFDF47 & 0x3FFF;
        v.lIIIIIIIlI[37] = 0xFFFFDFEF & 0x255B;
        v.lIIIIIIIlI[38] = -(0xFFFFFE7D & 0x21C7) & (0xFFFFEFFF & 0x396F);
        v.lIIIIIIIlI[39] = -(0xFFFFE937 & 0x3FD9) & (0xFFFFAFDF & Short.MAX_VALUE);
        v.lIIIIIIIlI[40] = 0xFFFFC6FE & 0x3FB7;
        v.lIIIIIIIlI[41] = 0xFFFFFDBF & 0x2B40;
        v.lIIIIIIIlI[42] = 0x29 ^ 0x38;
        v.lIIIIIIIlI[43] = -(0x2A ^ 0x38) & (0xFFFFBFFB & 0x5F5F);
        v.lIIIIIIIlI[44] = 0xFFFFCB68 & 0x36BF;
        v.lIIIIIIIlI[45] = 0xFFFFEBF3 & 0x17EF;
        v.lIIIIIIIlI[46] = 0x13 ^ 1;
        v.lIIIIIIIlI[47] = 0x6F ^ 0x77;
        v.lIIIIIIIlI[48] = 0x7E ^ 0x38 ^ (0x6B ^ 0x39);
        v.lIIIIIIIlI[49] = 0x5A ^ 0x21 ^ (0x43 ^ 0x2D);
        v.lIIIIIIIlI[50] = 0xE3 ^ 0xAB ^ (0xCD ^ 0x93);
        v.lIIIIIIIlI[51] = 0xAB ^ 0xBC;
        v.lIIIIIIIlI[52] = 0xFFFF8FF9 & 0x7C1F;
        v.lIIIIIIIlI[53] = 0xFFFFADE8 & 0x5F37;
        v.lIIIIIIIlI[54] = 0x24 ^ 0x3D;
        v.lIIIIIIIlI[55] = 0x24 ^ 0x3E;
        v.lIIIIIIIlI[56] = 0xFFFF8DBA & 0x7F5F;
        v.lIIIIIIIlI[57] = 0x4E ^ 0x55;
        v.lIIIIIIIlI[58] = 0xBE ^ 0xA2;
        v.lIIIIIIIlI[59] = 0x35 ^ 0x28;
        v.lIIIIIIIlI[60] = -(0x13 ^ 0x52) & (0xFFFF90F7 & 0x7FFE);
        v.lIIIIIIIlI[61] = 0xFFFF8EDB & 0x7F75;
        v.lIIIIIIIlI[62] = 0xFFFF9FBF & 0x6DFF;
        v.lIIIIIIIlI[63] = 0xFFFFB7BF & 0x58FE;
        v.lIIIIIIIlI[64] = 8 ^ 0x16;
        v.lIIIIIIIlI[65] = 132 + 55 - 79 + 57 ^ 29 + 50 - 72 + 179;
        v.lIIIIIIIlI[66] = 0xB5 ^ 0x94;
        v.lIIIIIIIlI[67] = 58 + 63 - 34 + 65 ^ 102 + 147 - 85 + 22;
        v.lIIIIIIIlI[68] = 48 + 145 - 77 + 49 ^ 123 + 18 - 26 + 14;
        v.lIIIIIIIlI[69] = 0xE5 ^ 0xC0;
        v.lIIIIIIIlI[70] = 0x58 ^ 0x7E;
        v.lIIIIIIIlI[71] = 0x89 ^ 0xAE;
        v.lIIIIIIIlI[72] = 0xA6 ^ 0x8F;
        v.lIIIIIIIlI[73] = 0xFFFFE5FC & 0xFE87;
        v.lIIIIIIIlI[74] = 0xFFFFFFD5 & 0xF76E;
        v.lIIIIIIIlI[75] = 86 + 54 - 11 + 14 ^ 89 + 61 - 16 + 31;
        v.lIIIIIIIlI[76] = 0x70 ^ 0x2D ^ (0xC3 ^ 0xB5);
        v.lIIIIIIIlI[77] = 0x1D ^ 0x31;
        v.lIIIIIIIlI[78] = 0x1C ^ 0x48 ^ (0x45 ^ 0x3C);
        v.lIIIIIIIlI[79] = 0x42 ^ 0x6C;
        v.lIIIIIIIlI[80] = 0xA1 ^ 0x8E;
        v.lIIIIIIIlI[81] = 0xEA ^ 0xAD ^ (0xF5 ^ 0x82);
        v.lIIIIIIIlI[82] = 0xB4 ^ 0x85;
        v.lIIIIIIIlI[83] = 0xFFFFB7DF & 0x4FA5;
        v.lIIIIIIIlI[84] = 0x80 ^ 0xB3;
        v.lIIIIIIIlI[85] = 0x23 ^ 0x10 ^ (0x9C ^ 0x9B);
        v.lIIIIIIIlI[86] = 0x72 ^ 0x47;
        v.lIIIIIIIlI[87] = 0xE6 ^ 0x88 ^ (0x49 ^ 0x11);
        v.lIIIIIIIlI[88] = 84 + 177 - 243 + 167 ^ 83 + 50 - 53 + 62;
        v.lIIIIIIIlI[89] = 2 + 115 - 112 + 208 ^ 55 + 43 - 37 + 86;
        v.lIIIIIIIlI[90] = 0x30 ^ 0x79;
        v.lIIIIIIIlI[91] = -(0xFFFFFA91 & 0x777F) & (0xFFFFFFFE & 0x7F97);
        v.lIIIIIIIlI[92] = 0xFFFFCDFF & 0x3FE7;
        v.lIIIIIIIlI[93] = 0x19 ^ 0x21;
        v.lIIIIIIIlI[94] = 0x18 ^ 0x21;
        v.lIIIIIIIlI[95] = 0x69 ^ 0x63 ^ (0x81 ^ 0xC7);
        v.lIIIIIIIlI[96] = 53 + 81 - 12 + 50 ^ 8 + 85 - 69 + 126;
        v.lIIIIIIIlI[97] = 0x80 ^ 0xA3 ^ (0x21 ^ 0x52);
        v.lIIIIIIIlI[98] = 0x49 ^ 0x40 ^ (0xBD ^ 0x8F);
        v.lIIIIIIIlI[99] = 135 + 210 - 321 + 229 ^ 128 + 126 - 92 + 5;
        v.lIIIIIIIlI[100] = 0x4F ^ 0x2B;
        v.lIIIIIIIlI[101] = 89 + 47 - 115 + 132 ^ 40 + 27 - 24 + 121;
        v.lIIIIIIIlI[102] = 150 + 5 - 107 + 103 ^ 1 + 59 - -9 + 100;
        v.lIIIIIIIlI[103] = -(0xFFFFBDFD & 0x52B3) & (0xFFFFFFFF & 0x1FBD);
        v.lIIIIIIIlI[104] = 0x28 ^ 0x17;
        v.lIIIIIIIlI[105] = 0x12 ^ 0x6A;
        v.lIIIIIIIlI[106] = 32 + 25 - -57 + 16;
        v.lIIIIIIIlI[107] = 0x12 ^ 6 ^ (0xEF ^ 0xBB);
        v.lIIIIIIIlI[108] = (0x85 ^ 0x9C) + (0xE5 ^ 0xBA) - (0x1B ^ 0xE) + (0x4C ^ 0x65);
        v.lIIIIIIIlI[109] = 0x76 ^ 0x34;
        v.lIIIIIIIlI[110] = 0xFFFFDBFF & 0x2FA1;
        v.lIIIIIIIlI[111] = -(0xFFFFF7F7 & 0x5959) & (0xFFFFFFF7 & 0x5DFF);
        v.lIIIIIIIlI[112] = -(0xFFFF98F7 & 0x775F) & (0xFFFFDDFF & 0x3EFE);
        v.lIIIIIIIlI[113] = 92 + 86 - 69 + 25 ^ 174 + 63 - 56 + 16;
        v.lIIIIIIIlI[114] = 0x1F ^ 0x5B;
        v.lIIIIIIIlI[115] = 0xA2 ^ 0x92 ^ (0x75 ^ 0);
        v.lIIIIIIIlI[116] = (0xC4 ^ 0xBE) + (0xB ^ 0x3B) - (0x2D ^ 0) + (0x83 ^ 0x9A);
        v.lIIIIIIIlI[117] = -(0xFFFFAD5F & 0x53BB) & (0xFFFFEFBF & 0x1D7F);
        v.lIIIIIIIlI[118] = 0xFFFFAFDE & 0x5D33;
        v.lIIIIIIIlI[119] = 1 ^ (0xEA ^ 0xAC);
        v.lIIIIIIIlI[120] = 0x77 ^ 0x3F;
        v.lIIIIIIIlI[121] = 103 + 138 - 167 + 84 + (0x33 ^ 3) - (103 + 61 - 73 + 91) + (58 + 97 - 23 + 4);
        v.lIIIIIIIlI[122] = (0xA4 ^ 0xC2) + (0x32 ^ 0x52) - (0x27 ^ 0xF) + (0xA3 ^ 0xAF);
        v.lIIIIIIIlI[123] = -(0xFFFFE7D7 & 0x5CA9) & (0xFFFFEFFB & 0x5FF7);
        v.lIIIIIIIlI[124] = -(0xFFFFD53B & 0x6AC7) & (0xFFFFFDDE & 0x4FF3);
        v.lIIIIIIIlI[125] = 0x60 ^ 0x2A;
        v.lIIIIIIIlI[126] = 5 ^ 0x4E;
        v.lIIIIIIIlI[127] = (0x4F ^ 0x63) + (0xB8 ^ 0x8A) - (0x94 ^ 0xA1) + (98 + 107 - 69 + 3);
        v.lIIIIIIIlI[128] = 0x79 ^ 0x34;
        v.lIIIIIIIlI[129] = 0x67 ^ 0x5C ^ (0x49 ^ 0x3C);
        v.lIIIIIIIlI[130] = 9 + 36 - 3 + 97 ^ 60 + 47 - -79 + 10;
        v.lIIIIIIIlI[131] = (0x57 ^ 0x15) + (0xAE ^ 0x8A) - -(0xA5 ^ 0xAE) + (0 ^ 0x4D);
        v.lIIIIIIIlI[132] = 154 + 4 - 84 + 126;
        v.lIIIIIIIlI[133] = 0xFFFFCBFB & 0x35E4;
        v.lIIIIIIIlI[134] = 0x3A ^ 0x6B;
        v.lIIIIIIIlI[135] = 0x41 ^ 0x13;
        v.lIIIIIIIlI[136] = 0 + 25 - -15 + 170;
        v.lIIIIIIIlI[137] = (0x50 ^ 0x3D) + (83 + 119 - 142 + 105) - (147 + 148 - 221 + 112) + (78 + 33 - 52 + 73);
        v.lIIIIIIIlI[138] = 0x71 ^ 0x22;
        v.lIIIIIIIlI[139] = 0x33 ^ 0x20 ^ (0x33 ^ 0x74);
        v.lIIIIIIIlI[140] = 87 + 137 - 99 + 25 ^ 127 + 79 - 41 + 30;
        v.lIIIIIIIlI[141] = 107 + 202 - 153 + 66 + (101 + 108 - 64 + 8) - (1 + 89 - 62 + 221) + (0x17 ^ 0x7F);
        v.lIIIIIIIlI[142] = 0x21 ^ 0x77;
        v.lIIIIIIIlI[143] = 1 ^ 0x56;
        v.lIIIIIIIlI[144] = 0xCE ^ 0x96;
        v.lIIIIIIIlI[145] = 0x16 ^ 0x4F;
        v.lIIIIIIIlI[146] = 0xF3 ^ 0xA8;
        v.lIIIIIIIlI[147] = 0xFFFF87F8 & 0x7D7F;
        v.lIIIIIIIlI[148] = 0xFFFFE6F3 & 0x1F4C;
        v.lIIIIIIIlI[149] = -(0xFFFFD3B6 & 0x6C4B) & (0xFFFFE77B & 0x7CED);
        v.lIIIIIIIlI[150] = -(0xFFFFE4A7 & 0x7FF9) & (0xFFFFFFFF & 0x7FF8);
        v.lIIIIIIIlI[151] = -(0xFFFFF26E & 0x2DBD) & (0xFFFFB7FB & 0x6FFF);
        v.lIIIIIIIlI[152] = 0xFFFFFDEE & 0x17BF;
        v.lIIIIIIIlI[153] = -(0xFFFFD5A3 & 0x3A5E) & (0xFFFFFFED & 0x77D3);
        v.lIIIIIIIlI[154] = -(0x65 ^ 0x61) & (0xFFFFBBEF & 0x47FB);
        v.lIIIIIIIlI[155] = 0xFFFFAF7F & 0x5DFF;
        v.lIIIIIIIlI[156] = 0xFFFFFFCE & 0x2EFD;
        v.lIIIIIIIlI[157] = 0xFFFFF5AD & 0x6BFA;
        v.lIIIIIIIlI[158] = -(0xFFFFE14B & 0x5EBD) & (0xFFFFE79F & 0x5D7C);
        v.lIIIIIIIlI[159] = 80 + 146 - 70 + 97 ^ 41 + 41 - -25 + 54;
        v.lIIIIIIIlI[160] = 0x94 ^ 0x9E ^ (0xC7 ^ 0x90);
        v.lIIIIIIIlI[161] = 0x5E ^ 5 ^ (0x48 ^ 0x4D);
        v.lIIIIIIIlI[162] = 0x5B ^ 0x7C ^ (0xCD ^ 0xB5);
        v.lIIIIIIIlI[163] = 0xFFFFFCBF & 0xF53;
        v.lIIIIIIIlI[164] = -(0xFFFF9BB5 & 0x76CB) & (0xFFFF9FFF & 0x7FED);
        v.lIIIIIIIlI[165] = -(0xFFFFF21F & 0x3FF3) & (0xFFFFFFBF & 0x3FFF);
        v.lIIIIIIIlI[166] = (0x9A ^ 0x8E) + (132 + 165 - 192 + 115) - (0x1F ^ 0xD) + (0x79 ^ 0x58);
        v.lIIIIIIIlI[167] = 0xFFFF9E75 & 0x6D9F;
        v.lIIIIIIIlI[168] = -(0xFFFFEAF2 & 0x77EF) & (0xFFFFFFFF & 0x6FFF);
        v.lIIIIIIIlI[169] = 0xFFFFFAED & 0xFFF;
        v.lIIIIIIIlI[170] = -(0xFFFFEFB9 & 0x726F) & (0xFFFFEFFE & 0x7F7F);
        v.lIIIIIIIlI[171] = 0xFFFFBE66 & 0x4FBD;
        v.lIIIIIIIlI[172] = -(0xFFFFB6D9 & 0x592F) & (0xFFFFBDCF & 0x5FFF);
        v.lIIIIIIIlI[173] = 160 + 88 - 196 + 147 ^ 138 + 25 - 115 + 119;
        v.lIIIIIIIlI[174] = 0x45 ^ 0x24;
        v.lIIIIIIIlI[175] = 142 + 155 - 274 + 190 ^ 110 + 182 - 171 + 62;
        v.lIIIIIIIlI[176] = 0x4F ^ 0x2C;
        v.lIIIIIIIlI[177] = 105 + 21 - 48 + 164 ^ 123 + 44 - 69 + 53;
        v.lIIIIIIIlI[178] = 0x42 ^ 0x58 ^ (0x5F ^ 0x23);
        v.lIIIIIIIlI[179] = 119 + 43 - 90 + 168 ^ 41 + 99 - 79 + 90;
        v.lIIIIIIIlI[180] = 153 + 222 - 148 + 1 ^ 137 + 9 - 40 + 34;
        v.lIIIIIIIlI[181] = 65 + 192 - 145 + 89 ^ 80 + 114 - 175 + 141;
    }

    private static void Q() {
        block46: {
            d lIIlIlIlIlIII;
            block45: {
                block44: {
                    block43: {
                        Object lIIlIlIlIlIIl;
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
                                                                        int[] nArray = new int[lIIIIIIIlI[0]];
                                                                        nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[43];
                                                                        if (!v.llIllIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block31;
                                                                        int[] nArray2 = new int[lIIIIIIIlI[0]];
                                                                        nArray2[v.lIIIIIIIlI[1]] = lIIIIIIIlI[43];
                                                                        if (!v.llIllIllIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) break block32;
                                                                        int[] nArray3 = new int[lIIIIIIIlI[0]];
                                                                        nArray3[v.lIIIIIIIlI[1]] = lIIIIIIIlI[43];
                                                                        if (!v.llIllIllIIll(Bank.getFirst((int[])nArray3).getQuantity(), lIIIIIIIlI[4])) break block32;
                                                                    }
                                                                    lIIlIlIlIlIIl = new d(lIIIIIIIlI[43], lIIIIIIIlI[4], e.c(lIIIIIIIlI[147], lIIIIIIIlI[148]));
                                                                    bx.add((d)lIIlIlIlIlIIl);
                                                                    0;
                                                                }
                                                                int[] nArray = new int[lIIIIIIIlI[0]];
                                                                nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[30];
                                                                if (!v.llIllIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                                                                int[] nArray4 = new int[lIIIIIIIlI[0]];
                                                                nArray4[v.lIIIIIIIlI[1]] = lIIIIIIIlI[30];
                                                                if (!v.llIllIllIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) break block34;
                                                                int[] nArray5 = new int[lIIIIIIIlI[0]];
                                                                nArray5[v.lIIIIIIIlI[1]] = lIIIIIIIlI[30];
                                                                if (!v.llIllIllIIll(Bank.getFirst((int[])nArray5).getQuantity(), lIIIIIIIlI[16])) break block34;
                                                            }
                                                            lIIlIlIlIlIIl = new d(lIIIIIIIlI[30], lIIIIIIIlI[16], lIIIIIIIlI[149]);
                                                            bx.add((d)lIIlIlIlIlIIl);
                                                            0;
                                                        }
                                                        int[] nArray = new int[lIIIIIIIlI[0]];
                                                        nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[31];
                                                        if (!v.llIllIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block35;
                                                        int[] nArray6 = new int[lIIIIIIIlI[0]];
                                                        nArray6[v.lIIIIIIIlI[1]] = lIIIIIIIlI[31];
                                                        if (!v.llIllIllIIlI(Bank.contains((int[])nArray6) ? 1 : 0)) break block36;
                                                        int[] nArray7 = new int[lIIIIIIIlI[0]];
                                                        nArray7[v.lIIIIIIIlI[1]] = lIIIIIIIlI[31];
                                                        if (!v.llIllIllIIll(Bank.getFirst((int[])nArray7).getQuantity(), lIIIIIIIlI[28])) break block36;
                                                    }
                                                    lIIlIlIlIlIIl = new d(lIIIIIIIlI[31], lIIIIIIIlI[28], lIIIIIIIlI[150]);
                                                    bx.add((d)lIIlIlIlIlIIl);
                                                    0;
                                                }
                                                int[] nArray = new int[lIIIIIIIlI[0]];
                                                nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[103];
                                                if (v.llIllIllIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    lIIlIlIlIlIIl = new d(lIIIIIIIlI[103], lIIIIIIIlI[8], lIIIIIIIlI[151]);
                                                    bx.add((d)lIIlIlIlIlIIl);
                                                    0;
                                                }
                                                int[] nArray8 = new int[lIIIIIIIlI[0]];
                                                nArray8[v.lIIIIIIIlI[1]] = lIIIIIIIlI[37];
                                                if (v.llIllIllIlII(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                                    lIIlIlIlIlIIl = new d(lIIIIIIIlI[37], lIIIIIIIlI[0], lIIIIIIIlI[27]);
                                                    bx.add((d)lIIlIlIlIlIIl);
                                                    0;
                                                }
                                                int[] nArray9 = new int[lIIIIIIIlI[0]];
                                                nArray9[v.lIIIIIIIlI[1]] = lIIIIIIIlI[32];
                                                if (!v.llIllIllIIlI(Bank.contains((int[])nArray9) ? 1 : 0)) break block37;
                                                int[] nArray10 = new int[lIIIIIIIlI[0]];
                                                nArray10[v.lIIIIIIIlI[1]] = lIIIIIIIlI[32];
                                                if (!v.llIllIllIIlI(Bank.contains((int[])nArray10) ? 1 : 0)) break block38;
                                                int[] nArray11 = new int[lIIIIIIIlI[0]];
                                                nArray11[v.lIIIIIIIlI[1]] = lIIIIIIIlI[32];
                                                if (!v.llIllIllIIll(Bank.getFirst((int[])nArray11).getQuantity(), lIIIIIIIlI[13])) break block38;
                                            }
                                            lIIlIlIlIlIIl = new d(lIIIIIIIlI[32], lIIIIIIIlI[13], lIIIIIIIlI[27]);
                                            bx.add((d)lIIlIlIlIlIIl);
                                            0;
                                        }
                                        int[] nArray = new int[lIIIIIIIlI[0]];
                                        nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[33];
                                        if (!v.llIllIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block39;
                                        int[] nArray12 = new int[lIIIIIIIlI[0]];
                                        nArray12[v.lIIIIIIIlI[1]] = lIIIIIIIlI[33];
                                        if (!v.llIllIllIIlI(Bank.contains((int[])nArray12) ? 1 : 0)) break block40;
                                        int[] nArray13 = new int[lIIIIIIIlI[0]];
                                        nArray13[v.lIIIIIIIlI[1]] = lIIIIIIIlI[33];
                                        if (!v.llIllIllIIll(Bank.getFirst((int[])nArray13).getQuantity(), lIIIIIIIlI[8])) break block40;
                                    }
                                    lIIlIlIlIlIIl = new d(lIIIIIIIlI[33], lIIIIIIIlI[8], lIIIIIIIlI[27]);
                                    bx.add((d)lIIlIlIlIlIIl);
                                    0;
                                }
                                int[] nArray = new int[lIIIIIIIlI[0]];
                                nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[29];
                                if (!v.llIllIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block41;
                                int[] nArray14 = new int[lIIIIIIIlI[0]];
                                nArray14[v.lIIIIIIIlI[1]] = lIIIIIIIlI[29];
                                if (!v.llIllIllIIlI(Bank.contains((int[])nArray14) ? 1 : 0)) break block42;
                                int[] nArray15 = new int[lIIIIIIIlI[0]];
                                nArray15[v.lIIIIIIIlI[1]] = lIIIIIIIlI[29];
                                if (!v.llIllIllIIll(Bank.getFirst((int[])nArray15).getQuantity(), lIIIIIIIlI[8])) break block42;
                            }
                            lIIlIlIlIlIIl = new d(lIIIIIIIlI[29], lIIIIIIIlI[13], lIIIIIIIlI[27]);
                            bx.add((d)lIIlIlIlIlIIl);
                            0;
                        }
                        int[] nArray = new int[lIIIIIIIlI[0]];
                        nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[39];
                        if (v.llIllIllIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            lIIlIlIlIlIIl = new d(lIIIIIIIlI[39], lIIIIIIIlI[0], lIIIIIIIlI[27]);
                            bx.add((d)lIIlIlIlIlIIl);
                            0;
                        }
                        int[] nArray16 = new int[lIIIIIIIlI[0]];
                        nArray16[v.lIIIIIIIlI[1]] = lIIIIIIIlI[38];
                        if (v.llIllIllIlII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                            lIIlIlIlIlIIl = new d(lIIIIIIIlI[38], lIIIIIIIlI[0], lIIIIIIIlI[27]);
                            bx.add((d)lIIlIlIlIlIIl);
                            0;
                        }
                        int[] nArray17 = new int[lIIIIIIIlI[0]];
                        nArray17[v.lIIIIIIIlI[1]] = lIIIIIIIlI[40];
                        if (v.llIllIllIlII(Bank.contains((int[])nArray17) ? 1 : 0)) {
                            lIIlIlIlIlIIl = new d(lIIIIIIIlI[40], lIIIIIIIlI[0], lIIIIIIIlI[152]);
                            bx.add((d)lIIlIlIlIlIIl);
                            0;
                        }
                        int[] nArray18 = new int[lIIIIIIIlI[0]];
                        nArray18[v.lIIIIIIIlI[1]] = lIIIIIIIlI[41];
                        if (v.llIllIllIlII(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            lIIlIlIlIlIIl = new d(lIIIIIIIlI[41], lIIIIIIIlI[0], lIIIIIIIlI[153] + e.c(lIIIIIIIlI[154], lIIIIIIIlI[155]));
                            bx.add((d)lIIlIlIlIlIIl);
                            0;
                        }
                        if (v.llIllIllIlII(Bank.contains((Predicate)(lIIlIlIlIlIIl = item -> item.getName().toLowerCase().contains(lllllllll[lIIIIIIIlI[161]]))) ? 1 : 0)) {
                            lIIlIlIlIlIII = new d(lIIIIIIIlI[156], lIIIIIIIlI[8], lIIIIIIIlI[157]);
                            bx.add(lIIlIlIlIlIII);
                            0;
                        }
                        int[] nArray19 = new int[lIIIIIIIlI[0]];
                        nArray19[v.lIIIIIIIlI[1]] = lIIIIIIIlI[34];
                        if (!v.llIllIllIIlI(Bank.contains((int[])nArray19) ? 1 : 0)) break block43;
                        int[] nArray20 = new int[lIIIIIIIlI[0]];
                        nArray20[v.lIIIIIIIlI[1]] = lIIIIIIIlI[34];
                        if (!v.llIllIllIIlI(Bank.contains((int[])nArray20) ? 1 : 0)) break block44;
                        int[] nArray21 = new int[lIIIIIIIlI[0]];
                        nArray21[v.lIIIIIIIlI[1]] = lIIIIIIIlI[34];
                        if (!v.llIllIllIIll(Bank.getFirst((int[])nArray21).getQuantity(), lIIIIIIIlI[13])) break block44;
                    }
                    lIIlIlIlIlIII = new d(lIIIIIIIlI[34], lIIIIIIIlI[13], j.ch);
                    bx.add(lIIlIlIlIlIII);
                    0;
                }
                int[] nArray = new int[lIIIIIIIlI[0]];
                nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[36];
                if (!v.llIllIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray22 = new int[lIIIIIIIlI[0]];
                nArray22[v.lIIIIIIIlI[1]] = lIIIIIIIlI[36];
                if (!v.llIllIllIIlI(Bank.contains((int[])nArray22) ? 1 : 0)) break block46;
                int[] nArray23 = new int[lIIIIIIIlI[0]];
                nArray23[v.lIIIIIIIlI[1]] = lIIIIIIIlI[36];
                if (!v.llIllIllIIll(Bank.getFirst((int[])nArray23).getQuantity(), lIIIIIIIlI[28])) break block46;
            }
            lIIlIlIlIlIII = new d(lIIIIIIIlI[36], lIIIIIIIlI[22], lIIIIIIIlI[158]);
            bx.add(lIIlIlIlIlIII);
            0;
        }
    }

    private static boolean llIllIllIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIllIlllIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIllIllllIl(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public String ag() {
        if (v.llIllIllllIl(ds, lllllllll[lIIIIIIIlI[159]])) {
            return lllllllll[lIIIIIIIlI[160]];
        }
        return "Animal Magnetism - " + ds;
    }

    private static String llIllIIllIll(String lIIlIIlllIlll, String lIIlIIllllIII) {
        try {
            SecretKeySpec lIIlIIlllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlIIllllIII.getBytes(StandardCharsets.UTF_8)), lIIIIIIIlI[21]), "DES");
            Cipher lIIlIIllllIll = Cipher.getInstance("DES");
            lIIlIIllllIll.init(lIIIIIIIlI[9], lIIlIIlllllII);
            return new String(lIIlIIllllIll.doFinal(Base64.getDecoder().decode(lIIlIIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIIllllIlI) {
            lIIlIIllllIlI.printStackTrace();
            return null;
        }
    }

    private static int llIllIllIIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llIllIllIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIllIlllIII(int n2) {
        return n2 > 0;
    }

    private static void llIllIlIllII() {
        lllllllll = new String[lIIIIIIIlI[181]];
        v.lllllllll[v.lIIIIIIIlI[1]] = v."Finished buying items, switching back to quest";
        v.lllllllll[v.lIIIIIIIlI[0]] = v."Waterfall";
        v.lllllllll[v.lIIIIIIIlI[9]] = v."Priest in Peril";
        v.lllllllll[v.lIIIIIIIlI[11]] = v."Ernest the Chicken";
        v.lllllllll[v.lIIIIIIIlI[13]] = v."Crafting";
        v.lllllllll[v.lIIIIIIIlI[8]] = v."Woodcutting";
        v.lllllllll[v.lIIIIIIIlI[16]] = v."Training range";
        v.lllllllll[v.lIIIIIIIlI[20]] = v."Varrock Quiz";
        v.lllllllll[v.lIIIIIIIlI[21]] = v."RFD Dwarf";
        v.lllllllll[v.lIIIIIIIlI[19]] = v."A Porcine";
        v.lllllllll[v.lIIIIIIIlI[4]] = v."Antique lamp";
        v.lllllllll[v.lIIIIIIIlI[23]] = v."Client of Kourend";
        v.lllllllll[v.lIIIIIIIlI[24]] = v."Antique lamp";
        v.lllllllll[v.lIIIIIIIlI[25]] = v."";
        v.lllllllll[v.lIIIIIIIlI[26]] = v."Nav to bank";
        v.lllllllll[v.lIIIIIIIlI[28]] = v."Handling banking";
        v.lllllllll[v.lIIIIIIIlI[35]] = v."We are missing quest supplies, switching to BUYING";
        v.lllllllll[v.lIIIIIIIlI[42]] = v."We are missing quest supplies, switching to BUYING";
        v.lllllllll[v.lIIIIIIIlI[46]] = v."Drink";
        v.lllllllll[v.lIIIIIIIlI[12]] = v."Drink";
        v.lllllllll[v.lIIIIIIIlI[48]] = v."Shark";
        v.lllllllll[v.lIIIIIIIlI[49]] = v."Shark";
        v.lllllllll[v.lIIIIIIIlI[50]] = v."Eat";
        v.lllllllll[v.lIIIIIIIlI[51]] = v."Nav to start";
        v.lllllllll[v.lIIIIIIIlI[47]] = v."Ava";
        v.lllllllll[v.lIIIIIIIlI[54]] = v."Bookcase";
        v.lllllllll[v.lIIIIIIIlI[55]] = v."Search";
        v.lllllllll[v.lIIIIIIIlI[57]] = v."Bookcase";
        v.lllllllll[v.lIIIIIIIlI[58]] = v."Search";
        v.lllllllll[v.lIIIIIIIlI[59]] = v."Wear";
        v.lllllllll[v.lIIIIIIIlI[64]] = v."Nav to charter";
        v.lllllllll[v.lIIIIIIIlI[65]] = v."Trader Crewmember";
        v.lllllllll[v.lIIIIIIIlI[10]] = v."Trade";
        v.lllllllll[v.lIIIIIIIlI[66]] = v."Break";
        v.lllllllll[v.lIIIIIIIlI[67]] = v."Nav to ecto";
        v.lllllllll[v.lIIIIIIIlI[14]] = v."Bones";
        v.lllllllll[v.lIIIIIIIlI[68]] = v."Staircase";
        v.lllllllll[v.lIIIIIIIlI[69]] = v."Climb-up";
        v.lllllllll[v.lIIIIIIIlI[70]] = v."Loader";
        v.lllllllll[v.lIIIIIIIlI[71]] = v."Bones";
        v.lllllllll[v.lIIIIIIIlI[22]] = v."Bones";
        v.lllllllll[v.lIIIIIIIlI[72]] = v."Loader";
        v.lllllllll[v.lIIIIIIIlI[75]] = v."Bones";
        v.lllllllll[v.lIIIIIIIlI[76]] = v."Staircase";
        v.lllllllll[v.lIIIIIIIlI[77]] = v."Climb-down";
        v.lllllllll[v.lIIIIIIIlI[78]] = v."Bonemeal";
        v.lllllllll[v.lIIIIIIIlI[79]] = v."Ectofuntus";
        v.lllllllll[v.lIIIIIIIlI[80]] = v."Worship";
        v.lllllllll[v.lIIIIIIIlI[81]] = v."Bonemeal";
        v.lllllllll[v.lIIIIIIIlI[82]] = v."Ghost disciple";
        v.lllllllll[v.lIIIIIIIlI[15]] = v."Malcolm";
        v.lllllllll[v.lIIIIIIIlI[84]] = v."Alice";
        v.lllllllll[v.lIIIIIIIlI[85]] = v."Malcolm";
        v.lllllllll[v.lIIIIIIIlI[86]] = v."Alice";
        v.lllllllll[v.lIIIIIIIlI[87]] = v."Malcolm";
        v.lllllllll[v.lIIIIIIIlI[88]] = v."Alice";
        v.lllllllll[v.lIIIIIIIlI[93]] = v."Nav to crone";
        v.lllllllll[v.lIIIIIIIlI[94]] = v."Old crone";
        v.lllllllll[v.lIIIIIIIlI[96]] = v."Malcolm";
        v.lllllllll[v.lIIIIIIIlI[98]] = v."Malcolm";
        v.lllllllll[v.lIIIIIIIlI[6]] = v."Malcolm";
        v.lllllllll[v.lIIIIIIIlI[101]] = v."Undead chicken";
        v.lllllllll[v.lIIIIIIIlI[102]] = v."Iron bar";
        v.lllllllll[v.lIIIIIIIlI[104]] = v."Iron bar";
        v.lllllllll[v.lIIIIIIIlI[107]] = v."Witch";
        v.lllllllll[v.lIIIIIIIlI[3]] = v."Witch";
        v.lllllllll[v.lIIIIIIIlI[109]] = v."Bar magnet";
        v.lllllllll[v.lIIIIIIIlI[113]] = v."Nav to mine";
        v.lllllllll[v.lIIIIIIIlI[114]] = v."Hammer";
        v.lllllllll[v.lIIIIIIIlI[115]] = v."Selected iron";
        v.lllllllll[v.lIIIIIIIlI[89]] = v."Bar magnet";
        v.lllllllll[v.lIIIIIIIlI[119]] = v."Undead tree";
        v.lllllllll[v.lIIIIIIIlI[120]] = v."Chop";
        v.lllllllll[v.lIIIIIIIlI[90]] = v."Wear";
        v.lllllllll[v.lIIIIIIIlI[125]] = v."Nav to npc";
        v.lllllllll[v.lIIIIIIIlI[126]] = v."Turael";
        v.lllllllll[v.lIIIIIIIlI[95]] = v."Turael";
        v.lllllllll[v.lIIIIIIIlI[128]] = v."Undead twigs";
        v.lllllllll[v.lIIIIIIIlI[129]] = v."Undead tree";
        v.lllllllll[v.lIIIIIIIlI[130]] = v."Chop";
        v.lllllllll[v.lIIIIIIIlI[97]] = v."Undead twigs";
        v.lllllllll[v.lIIIIIIIlI[134]] = v."Research notes";
        v.lllllllll[v.lIIIIIIIlI[135]] = v."Translate";
        v.lllllllll[v.lIIIIIIIlI[138]] = v."A pattern";
        v.lllllllll[v.lIIIIIIIlI[139]] = v."A pattern";
        v.lllllllll[v.lIIIIIIIlI[140]] = v."Hard leather";
        v.lllllllll[v.lIIIIIIIlI[142]] = v."Bookcase";
        v.lllllllll[v.lIIIIIIIlI[143]] = v."Search";
        v.lllllllll[v.lIIIIIIIlI[144]] = v."Nav to start";
        v.lllllllll[v.lIIIIIIIlI[145]] = v."Ava";
        v.lllllllll[v.lIIIIIIIlI[99]] = v."Bookcase";
        v.lllllllll[v.lIIIIIIIlI[146]] = v."Search";
        v.lllllllll[v.lIIIIIIIlI[159]] = v."";
        v.lllllllll[v.lIIIIIIIlI[160]] = v."Animal Magnetism";
        v.lllllllll[v.lIIIIIIIlI[161]] = v."ring of wealth (";
        v.lllllllll[v.lIIIIIIIlI[162]] = v."Drop";
        v.lllllllll[v.lIIIIIIIlI[173]] = v."Yes.";
        v.lllllllll[v.lIIIIIIIlI[174]] = v."I'm here about a quest.";
        v.lllllllll[v.lIIIIIIIlI[175]] = v."Okay, you need it more than I do, I suppose.";
        v.lllllllll[v.lIIIIIIIlI[176]] = v."Could I buy those chickens now, then?";
        v.lllllllll[v.lIIIIIIIlI[100]] = v."Could I buy 2 chickens?";
        v.lllllllll[v.lIIIIIIIlI[177]] = v."I'm here about a quest.";
        v.lllllllll[v.lIIIIIIIlI[178]] = v."Hello, I'm here about those trees again.";
        v.lllllllll[v.lIIIIIIIlI[179]] = v."I'd love one, thanks.";
        v.lllllllll[v.lIIIIIIIlI[180]] = v."";
    }

    public static void aZ() {
        block115: {
            WorldPoint lIIlIlIllIIlI;
            Object lIIlIlIllIIll;
            block116: {
                block123: {
                    block118: {
                        block122: {
                            block121: {
                                block120: {
                                    block119: {
                                        block117: {
                                            if (v.llIllIllIIlI(bv ? 1 : 0)) {
                                                b.a(bx);
                                                if (v.llIllIllIIll(bx.size(), lIIIIIIIlI[0])) {
                                                    System.out.println(lllllllll[lIIIIIIIlI[1]]);
                                                    bv = lIIIIIIIlI[1];
                                                }
                                            }
                                            if (!v.llIllIllIlII(bv ? 1 : 0) || !v.llIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[2])) break block115;
                                            if (v.llIllIllIIll(e.j(lIIIIIIIlI[3]), lIIIIIIIlI[4])) {
                                                ds = lllllllll[lIIIIIIIlI[0]];
                                                N.cv();
                                            }
                                            if (v.llIllIllIlIl(e.j(lIIIIIIIlI[3]), lIIIIIIIlI[4]) && (!v.llIllIllIllI(e.j(lIIIIIIIlI[5]), lIIIIIIIlI[6]) || v.llIllIllIIll(e.j(lIIIIIIIlI[7]), lIIIIIIIlI[8]))) {
                                                ds = lllllllll[lIIIIIIIlI[9]];
                                                G.bI();
                                            }
                                            if (v.llIllIllIlIl(e.j(lIIIIIIIlI[3]), lIIIIIIIlI[4]) && v.llIllIllIllI(e.j(lIIIIIIIlI[5]), lIIIIIIIlI[6]) && v.llIllIllIllI(e.j(lIIIIIIIlI[7]), lIIIIIIIlI[8]) && v.llIllIllIIll(e.j(lIIIIIIIlI[10]), lIIIIIIIlI[11])) {
                                                ds = lllllllll[lIIIIIIIlI[11]];
                                                U.de();
                                            }
                                            if (v.llIllIllIlIl(e.j(lIIIIIIIlI[3]), lIIIIIIIlI[4]) && v.llIllIllIllI(e.j(lIIIIIIIlI[5]), lIIIIIIIlI[6]) && v.llIllIllIllI(e.j(lIIIIIIIlI[7]), lIIIIIIIlI[8]) && v.llIllIllIlIl(e.j(lIIIIIIIlI[10]), lIIIIIIIlI[11]) && v.llIllIllIIll(Skills.getLevel((Skill)Skill.CRAFTING), lIIIIIIIlI[12])) {
                                                ds = lllllllll[lIIIIIIIlI[13]];
                                                an.el();
                                            }
                                            if (v.llIllIllIlIl(e.j(lIIIIIIIlI[3]), lIIIIIIIlI[4]) && v.llIllIllIllI(e.j(lIIIIIIIlI[5]), lIIIIIIIlI[6]) && v.llIllIllIllI(e.j(lIIIIIIIlI[7]), lIIIIIIIlI[8]) && v.llIllIllIlIl(e.j(lIIIIIIIlI[10]), lIIIIIIIlI[11]) && v.llIllIllIllI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIIIIIlI[12]) && v.llIllIllIIll(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIIIIIlI[14])) {
                                                ds = lllllllll[lIIIIIIIlI[8]];
                                                ar.eP();
                                            }
                                            if (v.llIllIllIlIl(e.j(lIIIIIIIlI[3]), lIIIIIIIlI[4]) && v.llIllIllIllI(e.j(lIIIIIIIlI[5]), lIIIIIIIlI[6]) && v.llIllIllIllI(e.j(lIIIIIIIlI[7]), lIIIIIIIlI[8]) && v.llIllIllIlIl(e.j(lIIIIIIIlI[10]), lIIIIIIIlI[11]) && v.llIllIllIllI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIIIIIlI[12]) && v.llIllIllIllI(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIIIIIlI[14]) && v.llIllIllIIll(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIIlI[15])) {
                                                ds = lllllllll[lIIIIIIIlI[16]];
                                                if (v.llIllIllIIll(da, lIIIIIIIlI[0])) {
                                                    o.cJ = lIIIIIIIlI[1];
                                                    da += lIIIIIIIlI[0];
                                                }
                                                n.aA();
                                            }
                                            if (v.llIllIllIlIl(e.j(lIIIIIIIlI[3]), lIIIIIIIlI[4]) && v.llIllIllIllI(e.j(lIIIIIIIlI[5]), lIIIIIIIlI[6]) && v.llIllIllIllI(e.j(lIIIIIIIlI[7]), lIIIIIIIlI[8]) && v.llIllIllIlIl(e.j(lIIIIIIIlI[10]), lIIIIIIIlI[11]) && v.llIllIllIllI(Skills.getLevel((Skill)Skill.CRAFTING), lIIIIIIIlI[12]) && v.llIllIllIllI(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIIIIIlI[14]) && v.llIllIllIllI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIIlI[15])) {
                                                if (!v.llIllIllIllI(e.j(lIIIIIIIlI[17]), lIIIIIIIlI[18]) || v.llIllIllIIll(Skills.getLevel((Skill)Skill.HUNTER), lIIIIIIIlI[19])) {
                                                    ds = lllllllll[lIIIIIIIlI[20]];
                                                    M.cs();
                                                }
                                                if (v.llIllIllIllI(e.j(lIIIIIIIlI[17]), lIIIIIIIlI[18]) && v.llIllIllIllI(Skills.getLevel((Skill)Skill.HUNTER), lIIIIIIIlI[19]) && v.llIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIIIIIlI[6])) {
                                                    ds = lllllllll[lIIIIIIIlI[21]];
                                                    I.cb();
                                                }
                                                if (v.llIllIllIllI(e.j(lIIIIIIIlI[17]), lIIIIIIIlI[18]) && v.llIllIllIllI(Skills.getLevel((Skill)Skill.HUNTER), lIIIIIIIlI[19]) && v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIIIIIlI[6]) && v.llIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIIIIIIlI[22])) {
                                                    ds = lllllllll[lIIIIIIIlI[19]];
                                                    u.aX();
                                                }
                                                if (v.llIllIllIllI(e.j(lIIIIIIIlI[17]), lIIIIIIIlI[18]) && v.llIllIllIllI(Skills.getLevel((Skill)Skill.HUNTER), lIIIIIIIlI[19]) && v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIIIIIlI[6]) && v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIIIIIIlI[22]) && v.llIllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIIIIIlI[19])) {
                                                    String[] stringArray = new String[lIIIIIIIlI[0]];
                                                    stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[4]];
                                                    if (v.llIllIllIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        ds = lllllllll[lIIIIIIIlI[23]];
                                                        w.bc();
                                                    }
                                                }
                                                w.bd();
                                            }
                                            if (!v.llIllIllIlII(v.an() ? 1 : 0) || !v.llIllIllIlII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId())) || !v.llIllIllIllI(e.j(lIIIIIIIlI[17]), lIIIIIIIlI[18]) || !v.llIllIllIllI(Skills.getLevel((Skill)Skill.HUNTER), lIIIIIIIlI[19]) || !v.llIllIllIllI(Skills.getLevel((Skill)Skill.RANGED), lIIIIIIIlI[15]) || !v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIIIIIlI[6]) || !v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIIIIIIlI[22]) || !v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIIIIIlI[19])) break block116;
                                            String[] stringArray = new String[lIIIIIIIlI[0]];
                                            stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[24]];
                                            if (!v.llIllIllIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) break block116;
                                            ds = lllllllll[lIIIIIIIlI[25]];
                                            lIIlIlIllIIll = BankLocation.getNearest();
                                            if (v.llIllIllIlll(lIIlIlIllIIll) && v.llIllIllIlII(lIIlIlIllIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderGWD.c = lllllllll[lIIIIIIIlI[26]];
                                                a.a((BankLocation)lIIlIlIllIIll);
                                            }
                                            if (!v.llIllIllIlll(lIIlIlIllIIll) || !v.llIllIllIIlI(lIIlIlIllIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block116;
                                            if (v.llIllIllIlII(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIIIlI[27]);
                                                0;
                                            }
                                            if (!v.llIllIllIIlI(Bank.isOpen() ? 1 : 0)) break block116;
                                            AccBuilderGWD.c = lllllllll[lIIIIIIIlI[28]];
                                            if (v.llIllIlllIII(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIIIIIIIlI[13]);
                                                0;
                                            }
                                            if (v.llIllIlllIII(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIIIIIIIlI[9]);
                                                0;
                                            }
                                            int[] nArray = new int[lIIIIIIIlI[0]];
                                            nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[29];
                                            if (!v.llIllIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block117;
                                            int[] nArray2 = new int[lIIIIIIIlI[0]];
                                            nArray2[v.lIIIIIIIlI[1]] = lIIIIIIIlI[29];
                                            if (!v.llIllIllIllI(Bank.getFirst((int[])nArray2).getQuantity(), lIIIIIIIlI[8])) break block118;
                                        }
                                        int[] nArray = new int[lIIIIIIIlI[0]];
                                        nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[30];
                                        if (!v.llIllIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block119;
                                        int[] nArray3 = new int[lIIIIIIIlI[0]];
                                        nArray3[v.lIIIIIIIlI[1]] = lIIIIIIIlI[30];
                                        if (!v.llIllIllIllI(Bank.getFirst((int[])nArray3).getQuantity(), lIIIIIIIlI[16])) break block118;
                                    }
                                    int[] nArray = new int[lIIIIIIIlI[0]];
                                    nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[31];
                                    if (!v.llIllIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block120;
                                    int[] nArray4 = new int[lIIIIIIIlI[0]];
                                    nArray4[v.lIIIIIIIlI[1]] = lIIIIIIIlI[31];
                                    if (!v.llIllIllIllI(Bank.getFirst((int[])nArray4).getQuantity(), lIIIIIIIlI[28])) break block118;
                                }
                                int[] nArray = new int[lIIIIIIIlI[0]];
                                nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[32];
                                if (!v.llIllIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block121;
                                int[] nArray5 = new int[lIIIIIIIlI[0]];
                                nArray5[v.lIIIIIIIlI[1]] = lIIIIIIIlI[32];
                                if (!v.llIllIllIllI(Bank.getFirst((int[])nArray5).getQuantity(), lIIIIIIIlI[13])) break block118;
                            }
                            int[] nArray = new int[lIIIIIIIlI[0]];
                            nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[33];
                            if (!v.llIllIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block122;
                            int[] nArray6 = new int[lIIIIIIIlI[0]];
                            nArray6[v.lIIIIIIIlI[1]] = lIIIIIIIlI[33];
                            if (!v.llIllIllIllI(Bank.getFirst((int[])nArray6).getQuantity(), lIIIIIIIlI[8])) break block118;
                        }
                        int[] nArray = new int[lIIIIIIIlI[0]];
                        nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[34];
                        if (!v.llIllIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block123;
                        int[] nArray7 = new int[lIIIIIIIlI[0]];
                        nArray7[v.lIIIIIIIlI[1]] = lIIIIIIIlI[34];
                        if (!v.llIllIllIIll(Bank.getFirst((int[])nArray7).getQuantity(), lIIIIIIIlI[13])) break block123;
                    }
                    v.Q();
                    System.out.println(lllllllll[lIIIIIIIlI[35]]);
                    bv = lIIIIIIIlI[0];
                    return;
                }
                int[] nArray = new int[lIIIIIIIlI[23]];
                nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[36];
                nArray[v.lIIIIIIIlI[0]] = lIIIIIIIlI[37];
                nArray[v.lIIIIIIIlI[9]] = lIIIIIIIlI[33];
                nArray[v.lIIIIIIIlI[11]] = lIIIIIIIlI[38];
                nArray[v.lIIIIIIIlI[13]] = lIIIIIIIlI[32];
                nArray[v.lIIIIIIIlI[8]] = lIIIIIIIlI[34];
                nArray[v.lIIIIIIIlI[16]] = lIIIIIIIlI[39];
                nArray[v.lIIIIIIIlI[20]] = lIIIIIIIlI[40];
                nArray[v.lIIIIIIIlI[21]] = lIIIIIIIlI[41];
                nArray[v.lIIIIIIIlI[19]] = lIIIIIIIlI[30];
                nArray[v.lIIIIIIIlI[4]] = lIIIIIIIlI[31];
                if (v.llIllIllIlII(e.d(nArray) ? 1 : 0)) {
                    v.Q();
                    System.out.println(lllllllll[lIIIIIIIlI[42]]);
                    bv = lIIIIIIIlI[0];
                    return;
                }
                int[] nArray8 = new int[lIIIIIIIlI[23]];
                nArray8[v.lIIIIIIIlI[1]] = lIIIIIIIlI[36];
                nArray8[v.lIIIIIIIlI[0]] = lIIIIIIIlI[37];
                nArray8[v.lIIIIIIIlI[9]] = lIIIIIIIlI[33];
                nArray8[v.lIIIIIIIlI[11]] = lIIIIIIIlI[38];
                nArray8[v.lIIIIIIIlI[13]] = lIIIIIIIlI[32];
                nArray8[v.lIIIIIIIlI[8]] = lIIIIIIIlI[34];
                nArray8[v.lIIIIIIIlI[16]] = lIIIIIIIlI[39];
                nArray8[v.lIIIIIIIlI[20]] = lIIIIIIIlI[40];
                nArray8[v.lIIIIIIIlI[21]] = lIIIIIIIlI[41];
                nArray8[v.lIIIIIIIlI[19]] = lIIIIIIIlI[30];
                nArray8[v.lIIIIIIIlI[4]] = lIIIIIIIlI[31];
                if (v.llIllIllIIlI(e.d(nArray8) ? 1 : 0)) {
                    a.a(lIIIIIIIlI[34], lIIIIIIIlI[13]);
                    a.a(lIIIIIIIlI[37], lIIIIIIIlI[0]);
                    a.a(lIIIIIIIlI[43], lIIIIIIIlI[0]);
                    a.a(lIIIIIIIlI[32], lIIIIIIIlI[13]);
                    a.a(lIIIIIIIlI[29], lIIIIIIIlI[13]);
                    a.a(lIIIIIIIlI[40], lIIIIIIIlI[0]);
                    a.a(lIIIIIIIlI[41], lIIIIIIIlI[0]);
                    a.a(lIIIIIIIlI[36], lIIIIIIIlI[4]);
                    a.a(lIIIIIIIlI[30], lIIIIIIIlI[4]);
                    a.a(lIIIIIIIlI[31], lIIIIIIIlI[28]);
                    a.a(lIIIIIIIlI[44], lIIIIIIIlI[0]);
                    a.a(lIIIIIIIlI[45], lIIIIIIIlI[27]);
                }
            }
            if (v.llIllIllIIlI(Inventory.contains((int[])f.bc) ? 1 : 0) && v.llIllIllIIll(Movement.getRunEnergy(), lIIIIIIIlI[15])) {
                Inventory.getFirst((int[])f.bc).interact(lllllllll[lIIIIIIIlI[46]]);
                Time.sleepTicks((int)lIIIIIIIlI[0]);
                0;
            }
            if (v.llIllIllIIlI(Inventory.contains((int[])f.aZ) ? 1 : 0) && v.llIllIllIIll(Prayers.getPoints(), lIIIIIIIlI[47])) {
                Inventory.getFirst((int[])f.aZ).interact(lllllllll[lIIIIIIIlI[12]]);
            }
            if (v.llIllIlllIIl(v.llIllIllIIIl(e.w(), 60.0))) {
                String[] stringArray = new String[lIIIIIIIlI[0]];
                stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[48]];
                if (v.llIllIllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIIIIIIlI[0]];
                    stringArray2[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[49]];
                    Inventory.getFirst((String[])stringArray2).interact(lllllllll[lIIIIIIIlI[50]]);
                    Time.sleepTicks((int)lIIIIIIIlI[9]);
                    0;
                }
            }
            if (v.llIllIllIIlI(v.an() ? 1 : 0) && v.llIllIllIlII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()))) {
                if (v.llIllIllIlII(dn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIIIIlI[21])) {
                    AccBuilderGWD.c = lllllllll[lIIIIIIIlI[51]];
                    if (v.llIllIllIIlI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)dg);
                    0;
                    Time.sleepTicks((int)lIIIIIIIlI[0]);
                    0;
                }
                if (v.llIllIllIIlI(dn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIllIlllIll(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIIIIIlI[21])) {
                    dk = lIIIIIIIlI[1];
                    g.a(lllllllll[lIIIIIIIlI[47]], cG);
                }
                if (v.llIllIllIIlI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIIIIIIlI[52], lIIIIIIIlI[53], lIIIIIIIlI[1])) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIIIIlI[0]];
                    stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[54]];
                    TileObjects.getNearest((String[])stringArray).interact(lllllllll[lIIIIIIIlI[55]]);
                    Time.sleepTicks((int)lIIIIIIIlI[9]);
                    0;
                }
                if (v.llIllIllIIlI((lIIlIlIllIIll = new WorldArea(lIIIIIIIlI[52], lIIIIIIIlI[56], lIIIIIIIlI[16], lIIIIIIIlI[4], lIIIIIIIlI[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIIIIlI[0]];
                    stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[57]];
                    TileObjects.getNearest((String[])stringArray).interact(lllllllll[lIIIIIIIlI[58]]);
                    Time.sleepTicks((int)lIIIIIIIlI[9]);
                    0;
                }
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[4])) {
                int[] nArray = new int[lIIIIIIIlI[0]];
                nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[44];
                if (v.llIllIllIlII(Equipment.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray9 = new int[lIIIIIIIlI[0]];
                    nArray9[v.lIIIIIIIlI[1]] = lIIIIIIIlI[44];
                    Inventory.getFirst((int[])nArray9).interact(lllllllll[lIIIIIIIlI[59]]);
                }
                int[] nArray10 = new int[lIIIIIIIlI[0]];
                nArray10[v.lIIIIIIIlI[1]] = lIIIIIIIlI[60];
                if (v.llIllIllIlII(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                    block114: {
                        lIIlIlIllIIll = new WorldPoint(lIIIIIIIlI[61], lIIIIIIIlI[62], lIIIIIIIlI[1]);
                        int[] nArray11 = new int[lIIIIIIIlI[0]];
                        nArray11[v.lIIIIIIIlI[1]] = lIIIIIIIlI[63];
                        if (v.llIllIllIlII(Inventory.contains((int[])nArray11) ? 1 : 0) && v.llIllIlllIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIlIllIIll), lIIIIIIIlI[48])) {
                            if (v.llIllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dq), lIIIIIIIlI[8])) {
                                AccBuilderGWD.c = lllllllll[lIIIIIIIlI[64]];
                                Movement.walkTo((WorldPoint)dq);
                                0;
                                Time.sleepTicks((int)lIIIIIIIlI[0]);
                                0;
                            }
                            if (v.llIllIlllIll(Players.getLocal().getWorldLocation().distanceTo(dq), lIIIIIIIlI[8])) {
                                if (v.llIllIllIlII(Shop.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIIIIIIIlI[0]];
                                    stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[65]];
                                    NPCs.getNearest((String[])stringArray).interact(lllllllll[lIIIIIIIlI[10]]);
                                    Time.sleepTicks((int)lIIIIIIIlI[9]);
                                    0;
                                }
                                if (v.llIllIllIIlI(Shop.isOpen() ? 1 : 0)) {
                                    Shop.buyFive((int)lIIIIIIIlI[63]);
                                    Time.sleepTicks((int)lIIIIIIIlI[11]);
                                    0;
                                }
                            }
                        }
                        int[] nArray12 = new int[lIIIIIIIlI[0]];
                        nArray12[v.lIIIIIIIlI[1]] = lIIIIIIIlI[63];
                        if (v.llIllIllIIlI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                            if (v.llIllIllIlII(do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIllIllIlII(dp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                int[] nArray13 = new int[lIIIIIIIlI[0]];
                                nArray13[v.lIIIIIIIlI[1]] = lIIIIIIIlI[31];
                                if (v.llIllIllIIlI(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                    int[] nArray14 = new int[lIIIIIIIlI[0]];
                                    nArray14[v.lIIIIIIIlI[1]] = lIIIIIIIlI[31];
                                    Inventory.getFirst((int[])nArray14).interact(lllllllll[lIIIIIIIlI[66]]);
                                    Time.sleepTicks((int)lIIIIIIIlI[20]);
                                    0;
                                }
                            }
                            if (!v.llIllIllIlII(do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || v.llIllIllIIlI(dp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                lIIlIlIllIIlI = new WorldPoint(lIIIIIIIlI[61], lIIIIIIIlI[62], lIIIIIIIlI[1]);
                                if (v.llIllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(lIIlIlIllIIlI), lIIIIIIIlI[8]) && v.llIllIllIlII(Players.getLocal().getWorldLocation().getPlane())) {
                                    AccBuilderGWD.c = lllllllll[lIIIIIIIlI[67]];
                                    Movement.walkTo((WorldPoint)lIIlIlIllIIlI);
                                    0;
                                    Time.sleepTicks((int)lIIIIIIIlI[0]);
                                    0;
                                }
                                String[] stringArray = new String[lIIIIIIIlI[0]];
                                stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[14]];
                                if (v.llIllIllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                    if (v.llIllIlllIll(Players.getLocal().getWorldLocation().distanceTo(lIIlIlIllIIlI), lIIIIIIIlI[8]) && v.llIllIllIlII(Players.getLocal().getWorldLocation().getPlane())) {
                                        String[] stringArray3 = new String[lIIIIIIIlI[0]];
                                        stringArray3[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[68]];
                                        TileObjects.getNearest((String[])stringArray3).interact(lllllllll[lIIIIIIIlI[69]]);
                                        Time.sleepTicks((int)lIIIIIIIlI[13]);
                                        0;
                                    }
                                    String[] stringArray4 = new String[lIIIIIIIlI[0]];
                                    stringArray4[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[70]];
                                    if (v.llIllIllIlll(TileObjects.getNearest((String[])stringArray4))) {
                                        String[] stringArray5 = new String[lIIIIIIIlI[0]];
                                        stringArray5[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[71]];
                                        if (v.llIllIllIIlI(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                                            String[] stringArray6 = new String[lIIIIIIIlI[0]];
                                            stringArray6[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[22]];
                                            String[] stringArray7 = new String[lIIIIIIIlI[0]];
                                            stringArray7[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[72]];
                                            Inventory.getFirst((String[])stringArray6).useOn(TileObjects.getNearest((String[])stringArray7));
                                            Time.sleep((long)e.c(lIIIIIIIlI[73], lIIIIIIIlI[74]));
                                            0;
                                        }
                                    }
                                }
                                String[] stringArray8 = new String[lIIIIIIIlI[0]];
                                stringArray8[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[75]];
                                if (v.llIllIllIlII(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                                    if (v.llIllIllIlIl(Players.getLocal().getWorldLocation().getPlane(), lIIIIIIIlI[0])) {
                                        String[] stringArray9 = new String[lIIIIIIIlI[0]];
                                        stringArray9[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[76]];
                                        TileObjects.getNearest((String[])stringArray9).interact(lllllllll[lIIIIIIIlI[77]]);
                                        Time.sleepTicks((int)lIIIIIIIlI[8]);
                                        0;
                                    }
                                    if (v.llIllIllIlII(Players.getLocal().getWorldLocation().getPlane())) {
                                        do {
                                            String[] stringArray10 = new String[lIIIIIIIlI[0]];
                                            stringArray10[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[78]];
                                            if (!v.llIllIllIIlI(Inventory.contains((String[])stringArray10) ? 1 : 0)) break block114;
                                            String[] stringArray11 = new String[lIIIIIIIlI[0]];
                                            stringArray11[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[79]];
                                            TileObjects.getNearest((String[])stringArray11).interact(lllllllll[lIIIIIIIlI[80]]);
                                            Time.sleepTicks((int)lIIIIIIIlI[9]);
                                            0;
                                            0;
                                        } while (null == null);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    int[] nArray15 = new int[lIIIIIIIlI[0]];
                    nArray15[v.lIIIIIIIlI[1]] = lIIIIIIIlI[32];
                    if (v.llIllIllIlII(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIIIIIlI[0]];
                        stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[81]];
                        if (v.llIllIllIlII(Inventory.contains((String[])stringArray) ? 1 : 0) && v.llIllIlllIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIlIllIIll), lIIIIIIIlI[48])) {
                            if (v.llIllIllIlII(Dialog.isOpen() ? 1 : 0)) {
                                g.a(lllllllll[lIIIIIIIlI[82]], cG);
                                Time.sleepTicks((int)lIIIIIIIlI[0]);
                                0;
                            }
                            g.a(cG);
                        }
                    }
                }
                int[] nArray16 = new int[lIIIIIIIlI[0]];
                nArray16[v.lIIIIIIIlI[1]] = lIIIIIIIlI[60];
                if (v.llIllIllIIlI(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIIIIIIlI[9]];
                    nArray17[v.lIIIIIIIlI[1]] = lIIIIIIIlI[83];
                    nArray17[v.lIIIIIIIlI[0]] = lIIIIIIIlI[29];
                    if (v.llIllIllIIlI(Inventory.contains((int[])nArray17) ? 1 : 0)) {
                        int[] nArray18 = new int[lIIIIIIIlI[9]];
                        nArray18[v.lIIIIIIIlI[1]] = lIIIIIIIlI[83];
                        nArray18[v.lIIIIIIIlI[0]] = lIIIIIIIlI[29];
                        Inventory.getAll((int[])nArray18).stream().forEach(item -> item.interact(lllllllll[lIIIIIIIlI[162]]));
                    }
                    if (v.llIllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dr), lIIIIIIIlI[20])) {
                        Movement.walkTo((WorldPoint)dr);
                        0;
                        Time.sleepTicks((int)lIIIIIIIlI[0]);
                        0;
                    }
                    if (v.llIllIlllIll(Players.getLocal().getWorldLocation().distanceTo(dr), lIIIIIIIlI[20])) {
                        g.a(lllllllll[lIIIIIIIlI[15]], cG);
                    }
                }
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[48])) {
                g.a(lllllllll[lIIIIIIIlI[84]], cG);
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[64])) {
                g.a(lllllllll[lIIIIIIIlI[85]], cG);
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[22])) {
                g.a(lllllllll[lIIIIIIIlI[86]], cG);
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[15])) {
                g.a(lllllllll[lIIIIIIIlI[87]], cG);
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[6])) {
                g.a(lllllllll[lIIIIIIIlI[88]], cG);
            }
            if (!v.llIllIllllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[89]) || v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[90])) {
                lIIlIlIllIIll = new WorldPoint(lIIIIIIIlI[91], lIIIIIIIlI[92], lIIIIIIIlI[1]);
                if (v.llIllIlllIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIlIllIIll), lIIIIIIIlI[11])) {
                    AccBuilderGWD.c = lllllllll[lIIIIIIIlI[93]];
                    Movement.walkTo((WorldPoint)lIIlIlIllIIll);
                    0;
                    Time.sleepTicks((int)lIIIIIIIlI[0]);
                    0;
                }
                if (v.llIllIlllIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIlIllIIll), lIIIIIIIlI[11])) {
                    g.a(lllllllll[lIIIIIIIlI[94]], cG);
                }
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[95])) {
                if (v.llIllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dr), lIIIIIIIlI[20])) {
                    Movement.walkTo((WorldPoint)dr);
                    0;
                    Time.sleepTicks((int)lIIIIIIIlI[0]);
                    0;
                }
                if (v.llIllIlllIll(Players.getLocal().getWorldLocation().distanceTo(dr), lIIIIIIIlI[20])) {
                    g.a(lllllllll[lIIIIIIIlI[96]], cG);
                }
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[97])) {
                g.a(lllllllll[lIIIIIIIlI[98]], cG);
            }
            if (!v.llIllIllllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[99]) || v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[100])) {
                g.a(lllllllll[lIIIIIIIlI[6]], cG);
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[100])) {
                String[] stringArray = new String[lIIIIIIIlI[0]];
                stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[101]];
                if (v.llIllIllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray12 = new String[lIIIIIIIlI[0]];
                    stringArray12[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[102]];
                    if (v.llIllIllIlII(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                        lIIlIlIllIIll = new HashMap();
                        ((HashMap)lIIlIlIllIIll).put(lIIIIIIIlI[33], lIIIIIIIlI[8]);
                        0;
                        ((HashMap)lIIlIlIllIIll).put(lIIIIIIIlI[38], lIIIIIIIlI[0]);
                        0;
                        ((HashMap)lIIlIlIllIIll).put(lIIIIIIIlI[39], lIIIIIIIlI[0]);
                        0;
                        ((HashMap)lIIlIlIllIIll).put(lIIIIIIIlI[103], lIIIIIIIlI[0]);
                        0;
                        e.a((HashMap<Integer, Integer>)lIIlIlIllIIll, lIIIIIIIlI[1], lIIIIIIIlI[1]);
                    }
                    String[] stringArray13 = new String[lIIIIIIIlI[0]];
                    stringArray13[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[104]];
                    if (v.llIllIllIIlI(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        v.ba();
                    }
                }
            }
            if (!v.llIllIllllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[105]) || v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[106])) {
                String[] stringArray = new String[lIIIIIIIlI[0]];
                stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[107]];
                lIIlIlIllIIll = NPCs.getNearest((String[])stringArray);
                if (v.llIllIllIlll(lIIlIlIllIIll)) {
                    if (v.llIllIllIIlI(Reachable.isInteractable((Locatable)lIIlIlIllIIll) ? 1 : 0)) {
                        g.a(lllllllll[lIIIIIIIlI[3]], cG);
                    }
                    if (v.llIllIllIlII(Reachable.isInteractable((Locatable)lIIlIlIllIIll) ? 1 : 0)) {
                        Movement.walkTo((Locatable)lIIlIlIllIIll);
                        0;
                        Time.sleepTicks((int)lIIIIIIIlI[0]);
                        0;
                    }
                }
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[108])) {
                String[] stringArray = new String[lIIIIIIIlI[0]];
                stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[109]];
                if (v.llIllIllIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    lIIlIlIllIIll = new WorldPoint(lIIIIIIIlI[110], lIIIIIIIlI[111], lIIIIIIIlI[1]);
                    lIIlIlIllIIlI = new WorldPoint(lIIIIIIIlI[110], lIIIIIIIlI[112], lIIIIIIIlI[1]);
                    if (v.llIllIllIlII(Players.getLocal().getWorldLocation().equals(lIIlIlIllIIll) ? 1 : 0) && v.llIllIllIlII(Players.getLocal().getWorldLocation().equals((Object)lIIlIlIllIIlI) ? 1 : 0)) {
                        AccBuilderGWD.c = lllllllll[lIIIIIIIlI[113]];
                        Movement.walkTo((WorldPoint)lIIlIlIllIIll);
                        0;
                        Time.sleepTicks((int)lIIIIIIIlI[0]);
                        0;
                    }
                    if (v.llIllIllIIlI(Players.getLocal().getWorldLocation().equals(lIIlIlIllIIll) ? 1 : 0) && v.llIllIllIlII(Players.getLocal().getWorldLocation().equals((Object)lIIlIlIllIIlI) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)lIIlIlIllIIlI);
                        0;
                    }
                    if (v.llIllIllIIlI(Players.getLocal().getWorldLocation().equals((Object)lIIlIlIllIIlI) ? 1 : 0)) {
                        String[] stringArray14 = new String[lIIIIIIIlI[0]];
                        stringArray14[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[114]];
                        String[] stringArray15 = new String[lIIIIIIIlI[0]];
                        stringArray15[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[115]];
                        Inventory.getFirst((String[])stringArray14).useOn(Inventory.getFirst((String[])stringArray15));
                        Time.sleepTicks((int)lIIIIIIIlI[11]);
                        0;
                    }
                }
                String[] stringArray16 = new String[lIIIIIIIlI[0]];
                stringArray16[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[89]];
                if (v.llIllIllIIlI(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                    v.ba();
                }
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[116])) {
                lIIlIlIllIIll = new WorldPoint(lIIIIIIIlI[117], lIIIIIIIlI[118], lIIIIIIIlI[1]);
                if (v.llIllIllIlII(Players.getLocal().getWorldLocation().equals(lIIlIlIllIIll) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)lIIlIlIllIIll);
                    0;
                    Time.sleepTicks((int)lIIIIIIIlI[0]);
                    0;
                }
                if (v.llIllIllIIlI(Players.getLocal().getWorldLocation().equals(lIIlIlIllIIll) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIIIIlI[0]];
                    stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[119]];
                    NPCs.getNearest((String[])stringArray).interact(lllllllll[lIIIIIIIlI[120]]);
                    Time.sleepTicks((int)lIIIIIIIlI[0]);
                    0;
                }
            }
            if (!v.llIllIllllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[121]) || v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[122])) {
                lIIlIlIllIIll = new WorldPoint(lIIIIIIIlI[123], lIIIIIIIlI[124], lIIIIIIIlI[1]);
                if (v.llIllIlllIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIlIllIIll), lIIIIIIIlI[9])) {
                    if (v.llIllIllIIlI(Inventory.contains((int[])f.aV) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.aV).interact(lllllllll[lIIIIIIIlI[90]]);
                    }
                    AccBuilderGWD.c = lllllllll[lIIIIIIIlI[125]];
                    Movement.walkTo((WorldPoint)lIIlIlIllIIll);
                    0;
                    Time.sleepTicks((int)lIIIIIIIlI[0]);
                    0;
                }
                if (v.llIllIlllIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIlIllIIll), lIIIIIIIlI[9])) {
                    String[] stringArray = new String[lIIIIIIIlI[0]];
                    stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[126]];
                    lIIlIlIllIIlI = NPCs.getNearest((String[])stringArray);
                    if (v.llIllIllIlll(lIIlIlIllIIlI)) {
                        if (v.llIllIllIIlI(Reachable.isInteractable((Locatable)lIIlIlIllIIlI) ? 1 : 0)) {
                            g.a(lllllllll[lIIIIIIIlI[95]], cG);
                        }
                        if (v.llIllIllIlII(Reachable.isInteractable((Locatable)lIIlIlIllIIlI) ? 1 : 0)) {
                            Movement.walkTo((Locatable)lIIlIlIllIIlI);
                            0;
                            Time.sleepTicks((int)lIIIIIIIlI[0]);
                            0;
                        }
                    }
                }
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[127])) {
                String[] stringArray = new String[lIIIIIIIlI[0]];
                stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[128]];
                if (v.llIllIllIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    lIIlIlIllIIll = new WorldPoint(lIIIIIIIlI[117], lIIIIIIIlI[118], lIIIIIIIlI[1]);
                    if (v.llIllIllIlII(Players.getLocal().getWorldLocation().equals(lIIlIlIllIIll) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)lIIlIlIllIIll);
                        0;
                        Time.sleepTicks((int)lIIIIIIIlI[0]);
                        0;
                    }
                    if (v.llIllIllIIlI(Players.getLocal().getWorldLocation().equals(lIIlIlIllIIll) ? 1 : 0)) {
                        String[] stringArray17 = new String[lIIIIIIIlI[0]];
                        stringArray17[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[129]];
                        NPCs.getNearest((String[])stringArray17).interact(lllllllll[lIIIIIIIlI[130]]);
                        Time.sleepTicks((int)lIIIIIIIlI[0]);
                        0;
                    }
                }
                String[] stringArray18 = new String[lIIIIIIIlI[0]];
                stringArray18[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[97]];
                if (v.llIllIllIIlI(Inventory.contains((String[])stringArray18) ? 1 : 0)) {
                    v.ba();
                }
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[131])) {
                v.ba();
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[132])) {
                if (v.llIllIllIIlI(Widgets.get((int)lIIIIIIIlI[133]).isEmpty() ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIIIIlI[0]];
                    stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[134]];
                    Inventory.getFirst((String[])stringArray).interact(lllllllll[lIIIIIIIlI[135]]);
                    Time.sleepTicks((int)lIIIIIIIlI[13]);
                    0;
                }
                if (v.llIllIllIlII(Widgets.get((int)lIIIIIIIlI[133]).isEmpty() ? 1 : 0)) {
                    Mouse.click((int)Widgets.get((int)lIIIIIIIlI[133], (int)lIIIIIIIlI[55]).getClickPoint().getX(), (int)Widgets.get((int)lIIIIIIIlI[133], (int)lIIIIIIIlI[55]).getClickPoint().getY(), (boolean)lIIIIIIIlI[0]);
                    Time.sleepTicks((int)lIIIIIIIlI[9]);
                    0;
                    Mouse.click((int)Widgets.get((int)lIIIIIIIlI[133], (int)lIIIIIIIlI[65]).getClickPoint().getX(), (int)Widgets.get((int)lIIIIIIIlI[133], (int)lIIIIIIIlI[65]).getClickPoint().getY(), (boolean)lIIIIIIIlI[0]);
                    Time.sleepTicks((int)lIIIIIIIlI[9]);
                    0;
                    Mouse.click((int)Widgets.get((int)lIIIIIIIlI[133], (int)lIIIIIIIlI[67]).getClickPoint().getX(), (int)Widgets.get((int)lIIIIIIIlI[133], (int)lIIIIIIIlI[67]).getClickPoint().getY(), (boolean)lIIIIIIIlI[0]);
                    Time.sleepTicks((int)lIIIIIIIlI[9]);
                    0;
                    Mouse.click((int)Widgets.get((int)lIIIIIIIlI[133], (int)lIIIIIIIlI[22]).getClickPoint().getX(), (int)Widgets.get((int)lIIIIIIIlI[133], (int)lIIIIIIIlI[22]).getClickPoint().getY(), (boolean)lIIIIIIIlI[0]);
                    Time.sleepTicks((int)lIIIIIIIlI[9]);
                    0;
                    Mouse.click((int)Widgets.get((int)lIIIIIIIlI[133], (int)lIIIIIIIlI[76]).getClickPoint().getX(), (int)Widgets.get((int)lIIIIIIIlI[133], (int)lIIIIIIIlI[76]).getClickPoint().getY(), (boolean)lIIIIIIIlI[0]);
                    Time.sleepTicks((int)lIIIIIIIlI[9]);
                    0;
                    Mouse.click((int)Widgets.get((int)lIIIIIIIlI[133], (int)lIIIIIIIlI[79]).getClickPoint().getX(), (int)Widgets.get((int)lIIIIIIIlI[133], (int)lIIIIIIIlI[79]).getClickPoint().getY(), (boolean)lIIIIIIIlI[0]);
                    Time.sleepTicks((int)lIIIIIIIlI[8]);
                    0;
                }
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[136])) {
                v.ba();
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[137])) {
                String[] stringArray = new String[lIIIIIIIlI[0]];
                stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[138]];
                if (v.llIllIllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray19 = new String[lIIIIIIIlI[0]];
                    stringArray19[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[139]];
                    String[] stringArray20 = new String[lIIIIIIIlI[0]];
                    stringArray20[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[140]];
                    Inventory.getFirst((String[])stringArray19).useOn(Inventory.getFirst((String[])stringArray20));
                    Time.sleepTicks((int)lIIIIIIIlI[9]);
                    0;
                }
            }
            if (v.llIllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[141])) {
                if (v.llIllIllIIll(dk, lIIIIIIIlI[0])) {
                    as.oV += lIIIIIIIlI[0];
                    as.u(AccBuilderGWD.m);
                    dk += lIIIIIIIlI[0];
                    as.oV = lIIIIIIIlI[1];
                    dl = lIIIIIIIlI[1];
                }
                v.ba();
            }
            g.a(cG);
        }
    }

    @Override
    public int af() {
        try {
            v.aZ();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-(0x2F ^ 0x52 ^ (0xE ^ 0x76)) >= 0) {
            return (0x15 ^ 0x70 ^ (0xF7 ^ 0xA2)) & (100 + 78 - 35 + 20 ^ 57 + 69 - 110 + 131 ^ -1);
        }
        return lIIIIIIIlI[100];
    }

    private static boolean llIllIlllIIl(int n2) {
        return n2 < 0;
    }

    private static boolean llIllIllIlll(Object object) {
        return object != null;
    }

    @Override
    public boolean ae() {
        return lIIIIIIIlI[1];
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (v.llIllIllIllI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIIlI[2])) {
            bl = lIIIIIIIlI[0];
            0;
            if (null != null) {
                return ((0x5E ^ 0x69) & ~(0xB ^ 0x3C)) != 0;
            }
        } else {
            bl = lIIIIIIIlI[1];
        }
        return bl;
    }

    private static boolean llIllIlllIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static String llIllIIlllIl(String lIIlIlIIIlllI, String lIIlIlIIIllIl) {
        lIIlIlIIIlllI = new String(Base64.getDecoder().decode(lIIlIlIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIlIlIIIllII = new StringBuilder();
        char[] lIIlIlIIIlIll = lIIlIlIIIllIl.toCharArray();
        int lIIlIlIIIlIlI = lIIIIIIIlI[1];
        char[] lIIlIlIIIIlII = lIIlIlIIIlllI.toCharArray();
        int lIIlIlIIIIIll = lIIlIlIIIIlII.length;
        int lIIlIlIIIIIlI = lIIIIIIIlI[1];
        while (v.llIllIllIIll(lIIlIlIIIIIlI, lIIlIlIIIIIll)) {
            char lIIlIlIIIllll = lIIlIlIIIIlII[lIIlIlIIIIIlI];
            lIIlIlIIIllII.append((char)(lIIlIlIIIllll ^ lIIlIlIIIlIll[lIIlIlIIIlIlI % lIIlIlIIIlIll.length]));
            0;
            ++lIIlIlIIIlIlI;
            ++lIIlIlIIIIIlI;
            0;
            if (-1 <= 3) continue;
            return null;
        }
        return String.valueOf(lIIlIlIIIllII);
    }

    static {
        v.llIllIllIIII();
        v.llIllIlIllII();
        bx = new ArrayList<d>();
        dn = new WorldArea(lIIIIIIIlI[163], lIIIIIIIlI[56], lIIIIIIIlI[16], lIIIIIIIlI[4], lIIIIIIIlI[1]);
        do = new WorldArea(lIIIIIIIlI[164], lIIIIIIIlI[165], lIIIIIIIlI[166], lIIIIIIIlI[142], lIIIIIIIlI[1]);
        dp = new WorldArea(lIIIIIIIlI[164], lIIIIIIIlI[165], lIIIIIIIlI[166], lIIIIIIIlI[142], lIIIIIIIlI[0]);
        dg = new WorldPoint(lIIIIIIIlI[167], lIIIIIIIlI[168], lIIIIIIIlI[1]);
        dq = new WorldPoint(lIIIIIIIlI[169], lIIIIIIIlI[170], lIIIIIIIlI[1]);
        dr = new WorldPoint(lIIIIIIIlI[171], lIIIIIIIlI[172], lIIIIIIIlI[1]);
        String[] stringArray = new String[lIIIIIIIlI[21]];
        stringArray[v.lIIIIIIIlI[1]] = lllllllll[lIIIIIIIlI[173]];
        stringArray[v.lIIIIIIIlI[0]] = lllllllll[lIIIIIIIlI[174]];
        stringArray[v.lIIIIIIIlI[9]] = lllllllll[lIIIIIIIlI[175]];
        stringArray[v.lIIIIIIIlI[11]] = lllllllll[lIIIIIIIlI[176]];
        stringArray[v.lIIIIIIIlI[13]] = lllllllll[lIIIIIIIlI[100]];
        stringArray[v.lIIIIIIIlI[8]] = lllllllll[lIIIIIIIlI[177]];
        stringArray[v.lIIIIIIIlI[16]] = lllllllll[lIIIIIIIlI[178]];
        stringArray[v.lIIIIIIIlI[20]] = lllllllll[lIIIIIIIlI[179]];
        cG = stringArray;
        da = lIIIIIIIlI[1];
        ds = lllllllll[lIIIIIIIlI[180]];
    }

    private static boolean llIllIllIllI(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void lIIlIlIlIllIl;
        int[] nArray = new int[lIIIIIIIlI[20]];
        nArray[v.lIIIIIIIlI[1]] = lIIIIIIIlI[36];
        nArray[v.lIIIIIIIlI[0]] = lIIIIIIIlI[37];
        nArray[v.lIIIIIIIlI[9]] = lIIIIIIIlI[34];
        nArray[v.lIIIIIIIlI[11]] = lIIIIIIIlI[40];
        nArray[v.lIIIIIIIlI[13]] = lIIIIIIIlI[41];
        nArray[v.lIIIIIIIlI[8]] = lIIIIIIIlI[30];
        nArray[v.lIIIIIIIlI[16]] = lIIIIIIIlI[31];
        int[] nArray2 = nArray;
        int lIIlIlIlIllII = lIIIIIIIlI[1];
        while (v.llIllIllIIll(lIIlIlIlIllII, ((void)lIIlIlIlIllIl).length)) {
            int[] nArray3 = new int[lIIIIIIIlI[0]];
            nArray3[v.lIIIIIIIlI[1]] = lIIlIlIlIllIl[lIIlIlIlIllII];
            if (v.llIllIllIlII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIIIIIIlI[1];
            }
            ++lIIlIlIlIllII;
            0;
            if (-1 != 1) continue;
            return ((0x6A ^ 0x43 ^ (0xBB ^ 0xA6)) & (0x21 ^ 0x42 ^ (0x43 ^ 0x14) ^ -1)) != 0;
        }
        return lIIIIIIIlI[0];
    }

    private static boolean llIllIllllII(int n2, int n3) {
        return n2 != n3;
    }
}

