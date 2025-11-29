/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.a;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.b;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.d;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.f;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.h;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class N
implements M {
    public static /* synthetic */ int if;
    public static /* synthetic */ int ie;
    public static /* synthetic */ List<d> bA;
    public static /* synthetic */ int ig;
    static /* synthetic */ WorldArea ij;
    static /* synthetic */ WorldArea ih;
    static /* synthetic */ WorldArea ii;
    private static /* synthetic */ int[] lIIIlllllIllI;
    public static /* synthetic */ boolean by;
    private static /* synthetic */ String[] lIIIlllllIlIl;
    private static /* synthetic */ WorldPoint ik;

    private static boolean lIlIIllIIlllIIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (N.lIlIIllIIllIlll(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllllIllI[18])) {
            bl = lIIIlllllIllI[1];
            0;
            if (((0x52 ^ 0x2E ^ (0x19 ^ 0x4A)) & (109 + 109 - 48 + 69 ^ 76 + 21 - -75 + 20 ^ -1)) != 0) {
                return ((57 + 76 - 76 + 76 ^ 40 + 121 - 58 + 63) & (1 ^ 0x5E ^ (0xF9 ^ 0x85) ^ -1)) != 0;
            }
        } else {
            bl = lIIIlllllIllI[0];
        }
        return bl;
    }

    static {
        N.lIlIIllIIllIIII();
        N.lIlIIllIIlIlllI();
        bA = new ArrayList<d>();
        ie = lIIIlllllIllI[27];
        if = lIIIlllllIllI[23];
        ih = new WorldArea(lIIIlllllIllI[235], lIIIlllllIllI[52], lIIIlllllIllI[69], lIIIlllllIllI[72], lIIIlllllIllI[0]);
        ii = new WorldArea(lIIIlllllIllI[235], lIIIlllllIllI[52], lIIIlllllIllI[69], lIIIlllllIllI[72], lIIIlllllIllI[1]);
        ij = new WorldArea(lIIIlllllIllI[235], lIIIlllllIllI[52], lIIIlllllIllI[69], lIIIlllllIllI[72], lIIIlllllIllI[2]);
        ik = new WorldPoint(lIIIlllllIllI[236], lIIIlllllIllI[237], lIIIlllllIllI[0]);
    }

    private static void lIlIIllIIllIIII() {
        lIIIlllllIllI = new int[239];
        N.lIIIlllllIllI[0] = (0x1F ^ 0x2A) & ~(0x17 ^ 0x22);
        N.lIIIlllllIllI[1] = 1;
        N.lIIIlllllIllI[2] = 2;
        N.lIIIlllllIllI[3] = 0xFFFF9FD7 & 0x6DAF;
        N.lIIIlllllIllI[4] = 0xFFFFAD95 & 0x5FEF;
        N.lIIIlllllIllI[5] = 128 + 135 - 175 + 51 ^ 31 + 164 - 39 + 25;
        N.lIIIlllllIllI[6] = 0xE1 ^ 0xB7 ^ (0xFF ^ 0x9A);
        N.lIIIlllllIllI[7] = 0xFFFFBFB9 & 0x4DFE;
        N.lIIIlllllIllI[8] = 0xFFFF8FB9 & 0x7DDE;
        N.lIIIlllllIllI[9] = 3;
        N.lIIIlllllIllI[10] = 0xFFFF97B9 & 0x7BCE;
        N.lIIIlllllIllI[11] = 0x54 ^ 0x7D ^ (0x9D ^ 0xBE);
        N.lIIIlllllIllI[12] = 0xFFFFBFC7 & 0x5F7F;
        N.lIIIlllllIllI[13] = 0xFFFFDFDF & 0x3F68;
        N.lIIIlllllIllI[14] = 0xFFFFDFE9 & 0x3F5F;
        N.lIIIlllllIllI[15] = 0xFFFFAF6D & 0x5F9F;
        N.lIIIlllllIllI[16] = 0x9A ^ 0x9E;
        N.lIIIlllllIllI[17] = 0xFFFFEFEC & 0x3EDF;
        N.lIIIlllllIllI[18] = 0x80 ^ 0x88 ^ (0x15 ^ 0x18);
        N.lIIIlllllIllI[19] = 0xFFFFF7FB & 0x3955;
        N.lIIIlllllIllI[20] = 0x6A ^ 0x6C;
        N.lIIIlllllIllI[21] = 0xFFFFBF4A & 0x5FFF;
        N.lIIIlllllIllI[22] = 5 ^ 2;
        N.lIIIlllllIllI[23] = -(0xFFFFE61F & 0x7FED) & (0xFFFFFFDF & 0x67AD);
        N.lIIIlllllIllI[24] = 0xC8 ^ 0xC0;
        N.lIIIlllllIllI[25] = -(0xFFFFFC6B & 0x23D5) & (0xFFFFFFFF & 0x6CE3);
        N.lIIIlllllIllI[26] = 54 + 33 - 5 + 51 ^ 138 + 110 - 145 + 37;
        N.lIIIlllllIllI[27] = -(0xFFFF8EF7 & 0x750A) & (0xFFFFD79F & 0x7EFB);
        N.lIIIlllllIllI[28] = -(70 + 11 - 51 + 108) & (0xFFFFFEDF & 0x2FFD);
        N.lIIIlllllIllI[29] = -(0xFFFFFBDD & 0x55AF) & (0xFFFFFFDF & 0x7FFC);
        N.lIIIlllllIllI[30] = 0xFFFFAFEE & 0x7E5F;
        N.lIIIlllllIllI[31] = -(0xFFFFEDB3 & 0x53DF) & (0xFFFFFFFE & 0x6FDF);
        N.lIIIlllllIllI[32] = -(0xFFFF87FE & 0x798B) & (0xFFFFAFFB & 0x7FDF);
        N.lIIIlllllIllI[33] = -(0xFFFFC156 & 0x7FBB) & (0xFFFFFF5F & 0x6FFB);
        N.lIIIlllllIllI[34] = 0xFFFFAFD8 & 0x7EE7;
        N.lIIIlllllIllI[35] = 0x5F ^ 0xA ^ (0x84 ^ 0x89);
        N.lIIIlllllIllI[36] = 0xFFFFCF2F & 0x7FDB;
        N.lIIIlllllIllI[37] = 74 + 133 - 134 + 64 ^ 51 + 6 - -80 + 24;
        N.lIIIlllllIllI[38] = 0x22 ^ 0x2D;
        N.lIIIlllllIllI[39] = 0x86 ^ 0xB4;
        N.lIIIlllllIllI[40] = 0xDF ^ 0xBF ^ (0xB4 ^ 0xC0);
        N.lIIIlllllIllI[41] = 0x6C ^ 0x3B ^ (0x56 ^ 0x18);
        N.lIIIlllllIllI[42] = 0x9C ^ 0x8F ^ (0xA8 ^ 0xA5);
        N.lIIIlllllIllI[43] = 0xFFFFFB6F & 0x5BE;
        N.lIIIlllllIllI[44] = 76 + 168 - 128 + 67 ^ 10 + 55 - -60 + 14;
        N.lIIIlllllIllI[45] = -(0xFFFFF3FD & 0x7E4F) & (0xFFFFFBFF & 0x777F);
        N.lIIIlllllIllI[46] = 0xFFFFCDFD & 0x3BA7;
        N.lIIIlllllIllI[47] = -(0xFFFFFBD7 & 0x3639) & (0xFFFFBF7F & 0x7FFB);
        N.lIIIlllllIllI[48] = -(0xFFFFBB1B & 0x74F7) & (0xFFFFBFFE & 0x7D73);
        N.lIIIlllllIllI[49] = 0x6B ^ 0x60;
        N.lIIIlllllIllI[50] = 0xFFFFCD5F & 0x3FFD;
        N.lIIIlllllIllI[51] = 0xFFFF8BF3 & 0x7DAD;
        N.lIIIlllllIllI[52] = -(0xFFFFFABB & 0x376D) & (0xFFFFFFFF & 0x3F7F);
        N.lIIIlllllIllI[53] = 81 + 10 - 44 + 133 ^ 54 + 165 - 188 + 155;
        N.lIIIlllllIllI[54] = 0x55 ^ 0x47;
        N.lIIIlllllIllI[55] = -(0xFFFFFBC5 & 0x663F) & (0xFFFFEBF7 & 0x7FBF);
        N.lIIIlllllIllI[56] = 0xFFFFADDB & 0x5F7C;
        N.lIIIlllllIllI[57] = 0xFFFFEFFE & 0x19B3;
        N.lIIIlllllIllI[58] = -(0xFFFFD85D & 0x77A7) & (0xFFFFFF5D & 0x5DFF);
        N.lIIIlllllIllI[59] = -(0xFFFFBE95 & 0x656B) & (0xFFFFBDF3 & 0x6FBD);
        N.lIIIlllllIllI[60] = 0xFFFFDDEF & 0x2F73;
        N.lIIIlllllIllI[61] = 0x1B ^ 0x11 ^ (0xAE ^ 0xB2);
        N.lIIIlllllIllI[62] = -1;
        N.lIIIlllllIllI[63] = 0x1F ^ 0x13;
        N.lIIIlllllIllI[64] = 0x26 ^ 0x2B;
        N.lIIIlllllIllI[65] = 4 ^ 0x14;
        N.lIIIlllllIllI[66] = 0x18 ^ 9;
        N.lIIIlllllIllI[67] = 0x97 ^ 0x84;
        N.lIIIlllllIllI[68] = 0x3A ^ 0x2F;
        N.lIIIlllllIllI[69] = 0x62 ^ 0x75 ^ (0xA ^ 0x43) & ~(0x28 ^ 0x61);
        N.lIIIlllllIllI[70] = 9 ^ 0x11;
        N.lIIIlllllIllI[71] = 31 + 40 - -21 + 41 ^ 67 + 157 - 108 + 43;
        N.lIIIlllllIllI[72] = 0x67 ^ 0x7C;
        N.lIIIlllllIllI[73] = 0x28 ^ 0x7B ^ (0xC1 ^ 0x8E);
        N.lIIIlllllIllI[74] = 0xB0 ^ 0x90 ^ (0x93 ^ 0xAE);
        N.lIIIlllllIllI[75] = 0x9F ^ 0x80;
        N.lIIIlllllIllI[76] = -(0xFFFFFFA7 & 0x43D9) & (0xFFFFDFDF & 0x6FFF);
        N.lIIIlllllIllI[77] = 0xFFFF9FDF & 0x6D36;
        N.lIIIlllllIllI[78] = 4 + 31 - -40 + 62;
        N.lIIIlllllIllI[79] = 0xC4 ^ 0x9A;
        N.lIIIlllllIllI[80] = -(0xFFFFF5CD & 0x7B7F) & (0xFFFFFDDF & Short.MAX_VALUE);
        N.lIIIlllllIllI[81] = -(0xFFFFE7AF & 0x3AF3) & (0xFFFFAFFB & 0x7FF7);
        N.lIIIlllllIllI[82] = -(0xFFFFB55B & 0x5BE6) & (0xFFFFBDFF & 0x5FCD);
        N.lIIIlllllIllI[83] = 0xFFFFFCFF & 0xF7E;
        N.lIIIlllllIllI[84] = 0xFFFFADFD & 0x5F56;
        N.lIIIlllllIllI[85] = 0xFFFF9EF6 & 0x6D7F;
        N.lIIIlllllIllI[86] = -(0xFFFF9F9B & 0x7267) & (0xFFFFBF5F & 0x5FF7);
        N.lIIIlllllIllI[87] = -(35 + 77 - 70 + 125) & (0xFFFFBDFF & 0x4FEF);
        N.lIIIlllllIllI[88] = 0xFFFF8C7B & 0x7FEF;
        N.lIIIlllllIllI[89] = -(0xFFFFF2C9 & 0x7FBF) & (0xFFFFFFBF & 0x7FFE);
        N.lIIIlllllIllI[90] = -(0xFFFFEB6F & 0x779F) & (0xFFFFFFDF & 0x6FBF);
        N.lIIIlllllIllI[91] = -(0xFFFFB6C7 & 0x7BBC) & (0xFFFFBFCF & 0x7FF3);
        N.lIIIlllllIllI[92] = -(0xFFFFDE2F & 0x73D1) & (0xFFFFDEE3 & 0x7FBE);
        N.lIIIlllllIllI[93] = 0xFFFFCDEB & 0x3F5E;
        N.lIIIlllllIllI[94] = -(0xFFFFDEF6 & 0x630B) & (0xFFFFEF5B & 0x5FF7);
        N.lIIIlllllIllI[95] = 0xE4 ^ 0xBB ^ 19 + 59 - -34 + 15;
        N.lIIIlllllIllI[96] = 0xFFFF8DFF & 0x7E98;
        N.lIIIlllllIllI[97] = 0xB0 ^ 0x91;
        N.lIIIlllllIllI[98] = 195 + 188 - 346 + 188 ^ 165 + 65 - 58 + 23;
        N.lIIIlllllIllI[99] = 72 + 52 - 37 + 46 ^ 80 + 46 - 23 + 63;
        N.lIIIlllllIllI[100] = 0x7C ^ 0x53 ^ (0x6C ^ 0x67);
        N.lIIIlllllIllI[101] = 0xF5 ^ 0xA3 ^ (0x35 ^ 0x46);
        N.lIIIlllllIllI[102] = 14 + 75 - -23 + 71 ^ 4 + 66 - -72 + 3;
        N.lIIIlllllIllI[103] = 22 + 128 - 142 + 133 ^ 141 + 35 - 63 + 57;
        N.lIIIlllllIllI[104] = -(0xFFFFDDAC & 0x6A5F) & (0xFFFFFD7F & 0x6BBF);
        N.lIIIlllllIllI[105] = 0xD ^ 0x24;
        N.lIIIlllllIllI[106] = 0x57 ^ 0x7D;
        N.lIIIlllllIllI[107] = 0xEB ^ 0x85 ^ (0xFF ^ 0xBA);
        N.lIIIlllllIllI[108] = 0x78 ^ 0x54;
        N.lIIIlllllIllI[109] = 68 + 114 - 150 + 99 ^ 130 + 132 - 224 + 136;
        N.lIIIlllllIllI[110] = 0x87 ^ 0xA9;
        N.lIIIlllllIllI[111] = 0x13 ^ 0x3C;
        N.lIIIlllllIllI[112] = 91 + 29 - 49 + 74 ^ 69 + 58 - 105 + 139;
        N.lIIIlllllIllI[113] = 0x70 ^ 0x41;
        N.lIIIlllllIllI[114] = 0x8A ^ 0xBE ^ (0xAC ^ 0x85) & ~(0x8B ^ 0xA2);
        N.lIIIlllllIllI[115] = -1 & (0xFFFFBFFF & 0x79F2);
        N.lIIIlllllIllI[116] = 0x16 ^ 0x53 ^ (0xDC ^ 0xAC);
        N.lIIIlllllIllI[117] = 0x68 ^ 0x5E;
        N.lIIIlllllIllI[118] = -(0xFFFFCF3F & 0x74C5) & (0xFFFFFDFF & 0x7FF7);
        N.lIIIlllllIllI[119] = 0xD9 ^ 0x9B ^ (0xF1 ^ 0x84);
        N.lIIIlllllIllI[120] = 0x8F ^ 0xB7;
        N.lIIIlllllIllI[121] = 0xFFFFF9FD & 0x3FF6;
        N.lIIIlllllIllI[122] = 98 + 52 - 93 + 111 ^ 109 + 72 - 148 + 112;
        N.lIIIlllllIllI[123] = 0x8D ^ 0xB7;
        N.lIIIlllllIllI[124] = 0x11 ^ 0x79 ^ (0x96 ^ 0xC5);
        N.lIIIlllllIllI[125] = -(0xFFFFB179 & 0x5EE7) & (0xFFFF9FEF & 0x7DFF);
        N.lIIIlllllIllI[126] = 0xFFFFBDCA & 0x4FBF;
        N.lIIIlllllIllI[127] = 0xFFFFADBE & 0x5FEF;
        N.lIIIlllllIllI[128] = -(0xFFFF99AF & 0x765A) & (0xFFFFFDEB & 0x1FBF);
        N.lIIIlllllIllI[129] = 0xFFFFADF7 & 0x5FAF;
        N.lIIIlllllIllI[130] = 0xFFFFCF9F & 0x3DFB;
        N.lIIIlllllIllI[131] = -(0xFFFFFB7B & 0x76C7) & (0xFFFFFFEB & Short.MAX_VALUE);
        N.lIIIlllllIllI[132] = -(0xFFFFD3FB & 0x3E05) & (0xFFFFBFFC & 0x5F93);
        N.lIIIlllllIllI[133] = -(0xFFFFF3EF & 0x5E59) & (0xFFFFFFED & 0x5FFB);
        N.lIIIlllllIllI[134] = -(0xFFFFE065 & 0x7FFB) & (0xFFFFEFF3 & 0x7DFF);
        N.lIIIlllllIllI[135] = -(0xFFFFF64D & 0x49F3) & (0xFFFFCFFD & 0x7DDF);
        N.lIIIlllllIllI[136] = 0xFFFFFDBF & 0xFCB;
        N.lIIIlllllIllI[137] = 0xFFFF9DF2 & 0x6FBF;
        N.lIIIlllllIllI[138] = 0xFFFFAFB7 & 0x5DD9;
        N.lIIIlllllIllI[139] = -(0xFFFFF273 & 0x3FEE) & (0xFFFFBFFF & Short.MAX_VALUE);
        N.lIIIlllllIllI[140] = 133 + 143 - 219 + 94 ^ 144 + 120 - 126 + 32;
        N.lIIIlllllIllI[141] = 68 + 125 - 153 + 102 ^ 113 + 44 - -5 + 15;
        N.lIIIlllllIllI[142] = 0x5F ^ 0x1F;
        N.lIIIlllllIllI[143] = 0x4E ^ 0xF;
        N.lIIIlllllIllI[144] = 0x7D ^ 0x57 ^ (0x23 ^ 0x4B);
        N.lIIIlllllIllI[145] = 0x12 ^ 0x51;
        N.lIIIlllllIllI[146] = 0xE ^ 0x4A;
        N.lIIIlllllIllI[147] = 0x46 ^ 0x4C ^ (0xE6 ^ 0xA9);
        N.lIIIlllllIllI[148] = 0x4A ^ 0xC;
        N.lIIIlllllIllI[149] = 0x62 ^ 0x25;
        N.lIIIlllllIllI[150] = 0x63 ^ 0x2B;
        N.lIIIlllllIllI[151] = 0x6B ^ 0x22;
        N.lIIIlllllIllI[152] = 0x52 ^ 0x18;
        N.lIIIlllllIllI[153] = 0x34 ^ 0x15 ^ (7 ^ 0x6D);
        N.lIIIlllllIllI[154] = 0xD6 ^ 0x9A;
        N.lIIIlllllIllI[155] = 0x2B ^ 0x66;
        N.lIIIlllllIllI[156] = 0x70 ^ 0x3E;
        N.lIIIlllllIllI[157] = 1 ^ (0x12 ^ 0x5C);
        N.lIIIlllllIllI[158] = 3 ^ 0x53;
        N.lIIIlllllIllI[159] = 0x9E ^ 0x97 ^ (0xE2 ^ 0xBA);
        N.lIIIlllllIllI[160] = 0x50 ^ 2;
        N.lIIIlllllIllI[161] = 0x6F ^ 0x3C;
        N.lIIIlllllIllI[162] = 0xFFFFEF7F & 0x1AFF;
        N.lIIIlllllIllI[163] = 0xFFFFBFFE & 0x4D7F;
        N.lIIIlllllIllI[164] = 0xFFFFAEBF & 0x5BDF;
        N.lIIIlllllIllI[165] = -(0xFFFFE195 & 0x5F6B) & (0xFFFFEBEF & 0x5F9D);
        N.lIIIlllllIllI[166] = 0xFFFFDEF3 & 0x2B9F;
        N.lIIIlllllIllI[167] = 0xFFFFDBAF & 0x2ED9;
        N.lIIIlllllIllI[168] = -(0x8A ^ 0x95) & (0xFFFFDE9F & 0x2BFE);
        N.lIIIlllllIllI[169] = -(0xFFFF9EFF & 0x6377) & (0xFFFFCFF7 & 0x3FFF);
        N.lIIIlllllIllI[170] = -(0xFFFFBE57 & 0x75FD) & (0xFFFFFFFD & 0x3EFF);
        N.lIIIlllllIllI[171] = 0xFFFFBDAB & 0x4FF4;
        N.lIIIlllllIllI[172] = 0xCF ^ 0x9B;
        N.lIIIlllllIllI[173] = 0x14 ^ 0x41;
        N.lIIIlllllIllI[174] = 0x69 ^ 8 ^ (0xC ^ 0x3B);
        N.lIIIlllllIllI[175] = 141 + 139 - 181 + 93 ^ 25 + 68 - -35 + 23;
        N.lIIIlllllIllI[176] = 0xEA ^ 0x9D ^ (0xA8 ^ 0x86);
        N.lIIIlllllIllI[177] = 0xA1 ^ 0x97 ^ (0x76 ^ 0x1A);
        N.lIIIlllllIllI[178] = 0x51 ^ 0xA;
        N.lIIIlllllIllI[179] = 0x6C ^ 0x30;
        N.lIIIlllllIllI[180] = 0x25 ^ 0x77 ^ (0x23 ^ 0x2C);
        N.lIIIlllllIllI[181] = 0x5D ^ 2;
        N.lIIIlllllIllI[182] = 0xA4 ^ 0xAF ^ (0x4D ^ 0x26);
        N.lIIIlllllIllI[183] = 0xF8 ^ 0x99;
        N.lIIIlllllIllI[184] = 0x24 ^ 0x1C ^ (0xF7 ^ 0xAD);
        N.lIIIlllllIllI[185] = 0xEB ^ 0x88;
        N.lIIIlllllIllI[186] = 0x2D ^ 0x49;
        N.lIIIlllllIllI[187] = 0x7C ^ 0x6E ^ (0x76 ^ 1);
        N.lIIIlllllIllI[188] = 0xF6 ^ 0x90;
        N.lIIIlllllIllI[189] = 0xFFFF8E77 & 0x7DFF;
        N.lIIIlllllIllI[190] = 0xFFFFCF57 & 0x3DFE;
        N.lIIIlllllIllI[191] = -(0xFFFFD2BF & 0x7FD2) & (0xFFFFDEFF & Short.MAX_VALUE);
        N.lIIIlllllIllI[192] = -(0xFFFFC3FF & 0x7C41) & (0xFFFFDDFF & 0x6F7B);
        N.lIIIlllllIllI[193] = 0xFFFFFFE9 & 0x2E5F;
        N.lIIIlllllIllI[194] = 0x1E ^ 0x3D ^ (6 ^ 0x42);
        N.lIIIlllllIllI[195] = 0xFFFF9DFF & 0x777C;
        N.lIIIlllllIllI[196] = -(0xFFFFDFF7 & 0x3E0A) & (0xFFFFFFED & 0x7FBB);
        N.lIIIlllllIllI[197] = 0xFFFFB3FC & 0x4F87;
        N.lIIIlllllIllI[198] = -(0xFFFFFB9A & 0x246F) & (0xFFFFA7FF & 0x7BBF);
        N.lIIIlllllIllI[199] = -(0xFFFFC92E & 0x7ED3) & (0xFFFFCFBF & 0x7FDF);
        N.lIIIlllllIllI[200] = -(0xFFFFD10E & 0x7FFB) & (0xFFFFFFFF & 0x73FF);
        N.lIIIlllllIllI[201] = -(0xFFFFDD3F & 0x73D5) & (0xFFFFFFDF & 0x7FFE);
        N.lIIIlllllIllI[202] = -(0xFFFF9A47 & 0x7DBA) & (0xFFFFFD7F & 0x7FDF);
        N.lIIIlllllIllI[203] = 0x41 ^ 0x46 ^ (0x2D ^ 0x42);
        N.lIIIlllllIllI[204] = 0xEF ^ 0x8F ^ (0x43 ^ 0x4A);
        N.lIIIlllllIllI[205] = 0x2B ^ 0x41;
        N.lIIIlllllIllI[206] = 0xE9 ^ 0xB3 ^ (0x60 ^ 0x51);
        N.lIIIlllllIllI[207] = 0x6E ^ 2;
        N.lIIIlllllIllI[208] = 0xB5 ^ 0x93 ^ (0xDF ^ 0x94);
        N.lIIIlllllIllI[209] = -(0xFFFFEDFB & 0x3775) & (0xFFFFFFFF & 0x2FFF);
        N.lIIIlllllIllI[210] = -(0xFFFFF66D & 0x5BD7) & (0xFFFFFFCF & 0x5FFD);
        N.lIIIlllllIllI[211] = 0x11 ^ 0x46 ^ (0x53 ^ 0x6A);
        N.lIIIlllllIllI[212] = 0xFFFFDFDF & 0x2DAD;
        N.lIIIlllllIllI[213] = 203 + 61 - 120 + 106 ^ 84 + 12 - -45 + 8;
        N.lIIIlllllIllI[214] = 0xFFFFBEDF & 0x4BB7;
        N.lIIIlllllIllI[215] = -(0xFFFFFAED & 0x573B) & (0xFFFFFFFD & 0x5FBE);
        N.lIIIlllllIllI[216] = 0x2A ^ 0x5A;
        N.lIIIlllllIllI[217] = 0xFFFFBFBF & 0x4AD6;
        N.lIIIlllllIllI[218] = 0x36 ^ 0x47;
        N.lIIIlllllIllI[219] = 0xFFFFCFA5 & 0x3AFB;
        N.lIIIlllllIllI[220] = 0xFFFFAFE7 & 0x5DBD;
        N.lIIIlllllIllI[221] = 0xD7 ^ 0xA5;
        N.lIIIlllllIllI[222] = 0xFFFFDFF7 & 0x2DBE;
        N.lIIIlllllIllI[223] = 0xFFFFFDFC & 0xF9F;
        N.lIIIlllllIllI[224] = 0x38 ^ 0x4B;
        N.lIIIlllllIllI[225] = -1 & (0xFFFFEFBF & 0x1DEF);
        N.lIIIlllllIllI[226] = 0x75 ^ 0x54 ^ (0x91 ^ 0xC4);
        N.lIIIlllllIllI[227] = 0xDC ^ 0xA9;
        N.lIIIlllllIllI[228] = -(0xFFFFED61 & 0x32DF) & (0xFFFFEDFE & 0x3FD7);
        N.lIIIlllllIllI[229] = 0xFFFFADFF & 0x5FA4;
        N.lIIIlllllIllI[230] = 0x3A ^ 0x4B ^ (0xB5 ^ 0xB2);
        N.lIIIlllllIllI[231] = 0xFFFFAFBF & 0x5DEB;
        N.lIIIlllllIllI[232] = 0x66 ^ 0x11;
        N.lIIIlllllIllI[233] = 0xDF ^ 0xA7;
        N.lIIIlllllIllI[234] = 0xFFFF9FFD & 0x6DB3;
        N.lIIIlllllIllI[235] = -(0xFFFFFA6B & 0x479F) & (0xFFFFDBBF & 0x6FEE);
        N.lIIIlllllIllI[236] = -(0xFFFFBB5F & 0x64E5) & (0xFFFFFFEE & 0x29FF);
        N.lIIIlllllIllI[237] = 0xFFFFDF6F & 0x2DFD;
        N.lIIIlllllIllI[238] = 0x88 ^ 0x8D ^ (0x3D ^ 0x41);
    }

    private static boolean lIlIIllIIllIllI(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void cF() {
        WorldArea worldArea = new WorldArea(lIIIlllllIllI[46], lIIIlllllIllI[47], lIIIlllllIllI[11], lIIIlllllIllI[20], lIIIlllllIllI[0]);
        WorldArea worldArea2 = new WorldArea(lIIIlllllIllI[46], lIIIlllllIllI[48], lIIIlllllIllI[49], lIIIlllllIllI[24], lIIIlllllIllI[0]);
        WorldArea worldArea3 = new WorldArea(lIIIlllllIllI[46], lIIIlllllIllI[50], lIIIlllllIllI[49], lIIIlllllIllI[24], lIIIlllllIllI[1]);
        WorldArea worldArea4 = new WorldArea(lIIIlllllIllI[51], lIIIlllllIllI[52], lIIIlllllIllI[53], lIIIlllllIllI[54], lIIIlllllIllI[2]);
        WorldArea worldArea5 = new WorldArea(lIIIlllllIllI[55], lIIIlllllIllI[56], lIIIlllllIllI[24], lIIIlllllIllI[11], lIIIlllllIllI[2]);
        WorldArea worldArea6 = new WorldArea(lIIIlllllIllI[57], lIIIlllllIllI[58], lIIIlllllIllI[49], lIIIlllllIllI[11], lIIIlllllIllI[0]);
        WorldArea worldArea7 = new WorldArea(lIIIlllllIllI[59], lIIIlllllIllI[60], lIIIlllllIllI[11], lIIIlllllIllI[20], lIIIlllllIllI[0]);
        WorldArea worldArea8 = new WorldArea(lIIIlllllIllI[46], lIIIlllllIllI[47], lIIIlllllIllI[61], lIIIlllllIllI[20], lIIIlllllIllI[0]);
        if (N.lIlIIllIIllIIll(ih.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(ii.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(ij.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[11]];
            e.a(ik);
            Time.sleepTicks((int)lIIIlllllIllI[1]);
            0;
        }
        if ((!N.lIlIIllIIllIIll(ih.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !N.lIlIIllIIllIIll(ii.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || N.lIlIIllIIllIIIl(ij.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && N.lIlIIllIIlllIII(Players.getLocal().getAnimation(), lIIIlllllIllI[62]) && N.lIlIIllIIllIIll(Players.getLocal().isMoving() ? 1 : 0)) {
            void var66;
            void var59;
            void var32;
            void var36;
            void var3;
            void var37;
            void var6;
            if (N.lIlIIllIIllIIIl(var6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[49]];
                String[] stringArray = new String[lIIIlllllIllI[1]];
                stringArray[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[63]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIlllllIlIl[lIIIlllllIllI[64]]);
                Time.sleepTicks((int)lIIIlllllIllI[2]);
                0;
            }
            if (N.lIlIIllIIllIIIl(var37.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[53]];
                String[] stringArray = new String[lIIIlllllIllI[1]];
                stringArray[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[38]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIlllllIlIl[lIIIlllllIllI[65]]);
                Time.sleepTicks((int)lIIIlllllIllI[2]);
                0;
            }
            if (N.lIlIIllIIllIIIl(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[66]];
                String[] stringArray = new String[lIIIlllllIllI[1]];
                stringArray[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[54]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIlllllIlIl[lIIIlllllIllI[67]]);
                Time.sleepTicks((int)lIIIlllllIllI[2]);
                0;
            }
            if (N.lIlIIllIIllIIIl(var36.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[40]];
                String[] stringArray = new String[lIIIlllllIllI[1]];
                stringArray[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[68]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIlllllIlIl[lIIIlllllIllI[61]]);
                Time.sleepTicks((int)lIIIlllllIllI[18]);
                0;
            }
            if (N.lIlIIllIIllIIIl(var32.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[69]];
                String[] stringArray = new String[lIIIlllllIllI[1]];
                stringArray[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[70]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIlllllIlIl[lIIIlllllIllI[41]]);
                Time.sleepTicks((int)lIIIlllllIllI[16]);
                0;
            }
            if (N.lIlIIllIIllIIIl(var59.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[71]];
                String[] stringArray = new String[lIIIlllllIllI[1]];
                stringArray[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[72]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIlllllIlIl[lIIIlllllIllI[73]]);
                Time.sleepTicks((int)lIIIlllllIllI[9]);
                0;
            }
            if (N.lIlIIllIIllIIIl(var66.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[74]];
                String[] stringArray = new String[lIIIlllllIllI[1]];
                stringArray[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[42]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIlllllIlIl[lIIIlllllIllI[75]]);
                Time.sleepTicks((int)lIIIlllllIllI[16]);
                0;
            }
        }
    }

    private static String lIlIIllIIlIllII(String var61, String var69) {
        try {
            SecretKeySpec var42 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var69.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var53 = Cipher.getInstance("Blowfish");
            var53.init(lIIIlllllIllI[2], var42);
            return new String(var53.doFinal(Base64.getDecoder().decode(var61.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }

    private static void lIlIIllIIlIlllI() {
        lIIIlllllIlIl = new String[lIIIlllllIllI[238]];
        N.lIIIlllllIlIl[N.lIIIlllllIllI[0]] = N."Buying items";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[1]] = N."Finished buying items, switching back to agility";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[2]] = N."Navigating to bank";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[9]] = N."Handling banking";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[16]] = N."We are missing quest supplies, switching to BUYING";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[18]] = N."Vial";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[20]] = N."Vial";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[22]] = N."Drop";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[24]] = N."Drink";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[26]] = N."Eat";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[11]] = N."Nav to gnome course";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[49]] = N."Crossing log";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[63]] = N."Log balance";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[64]] = N."Walk-across";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[53]] = N."Climbing net";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[38]] = N."Obstacle net";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[65]] = N."Climb-over";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[66]] = N."Climbing branch";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[54]] = N."Tree branch";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[67]] = N."Climb";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[40]] = N."Crossing rope";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[68]] = N."Balancing rope";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[61]] = N."Walk-on";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[69]] = N."Climbing down";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[70]] = N."Tree branch";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[41]] = N."Climb-down";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[71]] = N."Climbing net";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[72]] = N."Obstacle net";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[73]] = N."Climb-over";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[74]] = N."Crossing pipe";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[42]] = N."Obstacle pipe";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[75]] = N."Squeeze-through";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[95]] = N."Nav to start";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[97]] = N."Mark of grace";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[98]] = N."Taking mark";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[99]] = N."Found mark on ground";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[100]] = N."Take";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[101]] = N."Starting course";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[102]] = N."Rough wall";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[103]] = N."Climb";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[37]] = N."Crossing clothes line";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[105]] = N."Clothes line";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[106]] = N."Cross";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[107]] = N."Leaping";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[108]] = N."Gap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[109]] = N."Leap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[110]] = N."Balancing";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[111]] = N."Wall";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[112]] = N."Balance";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[113]] = N."Jumping gap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[39]] = N."Gap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[6]] = N."Leap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[114]] = N."Jumping gap 2";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[116]] = N."Leap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[117]] = N."Jumping gap 3";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[119]] = N."Leap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[120]] = N."Hurdle roof";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[122]] = N."Hurdle";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[123]] = N."Finishing course";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[124]] = N."Edge";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[44]] = N."Jump-off";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[140]] = N."Nav to canafis course";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[5]] = N."Nav to start";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[141]] = N."Starting course";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[142]] = N."Tall tree";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[143]] = N."Climb";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[144]] = N."Mark of grace";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[145]] = N."Taking mark";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[146]] = N."Found mark on ground";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[147]] = N."Take";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[148]] = N."Jumping gap 1";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[149]] = N."Jump";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[150]] = N."Jumping gap 2";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[151]] = N."Jump";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[152]] = N."Jumping gap 3";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[153]] = N."Jump";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[154]] = N."Jumping gap 4";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[155]] = N."Jump";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[156]] = N."Vaulting";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[157]] = N."Vault";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[158]] = N."Jumping gap 5";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[159]] = N."Jump";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[160]] = N."Jumping gap 6";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[161]] = N."Jump";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[172]] = N."Nav to canafis course";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[173]] = N."Nav to start";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[174]] = N."Starting course";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[175]] = N."Wall";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[35]] = N."Climb-up";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[176]] = N."Mark of grace";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[177]] = N."Taking mark";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[178]] = N."Found mark on ground";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[179]] = N."Take";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[180]] = N."Jumping gap 1";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[79]] = N."Jump";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[181]] = N."cross rope";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[182]] = N."Cross";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[183]] = N."Jumping gap 3";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[184]] = N."Jump";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[185]] = N."Jumping gap 4";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[186]] = N."Jump";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[187]] = N."Jumping Edge";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[188]] = N."Jump";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[194]] = N."Found mark on ground";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[203]] = N."Agility";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[204]] = N."passage";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[205]] = N."passage";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[206]] = N."passage";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[207]] = N."passage";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[208]] = N."Edge";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[211]] = N."Gap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[213]] = N."Gap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[216]] = N."Tightrope";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[218]] = N."Gap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[221]] = N."Gap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[224]] = N."Gap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[226]] = N."Pole-vault";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[227]] = N."Gap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[230]] = N."Gap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[232]] = N."Gap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[233]] = N."Gap";
    }

    private static String lIlIIllIIlIllIl(String var38, String var19) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), lIIIlllllIllI[24]), "DES");
            Cipher var48 = Cipher.getInstance("DES");
            var48.init(lIIIlllllIllI[2], var1);
            return new String(var48.doFinal(Base64.getDecoder().decode(var38.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean X() {
        return lIIIlllllIllI[0];
    }

    public static void W() {
        d var4;
        block18: {
            block17: {
                block16: {
                    block15: {
                        int[] nArray = new int[lIIIlllllIllI[1]];
                        nArray[N.lIIIlllllIllI[0]] = lIIIlllllIllI[15];
                        if (N.lIlIIllIIllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(lIIIlllllIllI[15], lIIIlllllIllI[1], lIIIlllllIllI[195]);
                            bA.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[lIIIlllllIllI[1]];
                        nArray2[N.lIIIlllllIllI[0]] = lIIIlllllIllI[17];
                        if (N.lIlIIllIIllIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            var4 = new d(lIIIlllllIllI[17], lIIIlllllIllI[2], lIIIlllllIllI[196]);
                            bA.add(var4);
                            0;
                        }
                        int[] nArray3 = new int[lIIIlllllIllI[1]];
                        nArray3[N.lIIIlllllIllI[0]] = lIIIlllllIllI[27];
                        if (N.lIlIIllIIllIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            var4 = new d(lIIIlllllIllI[27], lIIIlllllIllI[2], lIIIlllllIllI[196]);
                            bA.add(var4);
                            0;
                        }
                        int[] nArray4 = new int[lIIIlllllIllI[1]];
                        nArray4[N.lIIIlllllIllI[0]] = lIIIlllllIllI[12];
                        if (N.lIlIIllIIllIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            var4 = new d(lIIIlllllIllI[12], lIIIlllllIllI[11], lIIIlllllIllI[197]);
                            bA.add(var4);
                            0;
                        }
                        int[] nArray5 = new int[lIIIlllllIllI[1]];
                        nArray5[N.lIIIlllllIllI[0]] = lIIIlllllIllI[21];
                        if (N.lIlIIllIIllIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            var4 = new d(lIIIlllllIllI[21], lIIIlllllIllI[11], lIIIlllllIllI[198]);
                            bA.add(var4);
                            0;
                        }
                        int[] nArray6 = new int[lIIIlllllIllI[1]];
                        nArray6[N.lIIIlllllIllI[0]] = lIIIlllllIllI[14];
                        if (N.lIlIIllIIllIIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            var4 = new d(lIIIlllllIllI[14], lIIIlllllIllI[11], lIIIlllllIllI[198]);
                            bA.add(var4);
                            0;
                        }
                        int[] nArray7 = new int[lIIIlllllIllI[1]];
                        nArray7[N.lIIIlllllIllI[0]] = lIIIlllllIllI[13];
                        if (N.lIlIIllIIllIIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            var4 = new d(lIIIlllllIllI[13], lIIIlllllIllI[11], lIIIlllllIllI[198]);
                            bA.add(var4);
                            0;
                        }
                        int[] nArray8 = new int[lIIIlllllIllI[1]];
                        nArray8[N.lIIIlllllIllI[0]] = lIIIlllllIllI[23];
                        if (!N.lIlIIllIIllIIIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block15;
                        int[] nArray9 = new int[lIIIlllllIllI[1]];
                        nArray9[N.lIIIlllllIllI[0]] = lIIIlllllIllI[23];
                        if (!N.lIlIIllIIllIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block16;
                        int[] nArray10 = new int[lIIIlllllIllI[1]];
                        nArray10[N.lIIIlllllIllI[0]] = lIIIlllllIllI[23];
                        if (!N.lIlIIllIIllIIlI(Bank.getFirst((int[])nArray10).getQuantity(), lIIIlllllIllI[11])) break block16;
                    }
                    var4 = new d(if, lIIIlllllIllI[44], lIIIlllllIllI[199]);
                    bA.add(var4);
                    0;
                }
                int[] nArray = new int[lIIIlllllIllI[1]];
                nArray[N.lIIIlllllIllI[0]] = lIIIlllllIllI[25];
                if (!N.lIlIIllIIllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block17;
                int[] nArray11 = new int[lIIIlllllIllI[1]];
                nArray11[N.lIIIlllllIllI[0]] = lIIIlllllIllI[25];
                if (!N.lIlIIllIIllIIIl(Bank.contains((int[])nArray11) ? 1 : 0)) break block18;
                int[] nArray12 = new int[lIIIlllllIllI[1]];
                nArray12[N.lIIIlllllIllI[0]] = lIIIlllllIllI[25];
                if (!N.lIlIIllIIllIIlI(Bank.getFirst((int[])nArray12).getQuantity(), lIIIlllllIllI[11])) break block18;
            }
            var4 = new d(lIIIlllllIllI[25], lIIIlllllIllI[11], lIIIlllllIllI[200]);
            bA.add(var4);
            0;
        }
        int[] nArray = new int[lIIIlllllIllI[1]];
        nArray[N.lIIIlllllIllI[0]] = lIIIlllllIllI[201];
        if (N.lIlIIllIIllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            var4 = new d(lIIIlllllIllI[201], lIIIlllllIllI[1], lIIIlllllIllI[202]);
            bA.add(var4);
            0;
        }
        int[] nArray13 = new int[lIIIlllllIllI[1]];
        nArray13[N.lIIIlllllIllI[0]] = lIIIlllllIllI[19];
        if (N.lIlIIllIIllIIll(Bank.contains((int[])nArray13) ? 1 : 0)) {
            var4 = new d(lIIIlllllIllI[19], lIIIlllllIllI[40], h.bv);
            bA.add(var4);
            0;
        }
    }

    @Override
    public String Z() {
        return lIIIlllllIlIl[lIIIlllllIllI[203]];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean S() {
        int n2;
        if (N.lIlIIllIIllIlll(Skills.getBoostedLevel((Skill)Skill.AGILITY), lIIIlllllIllI[37])) {
            int n3;
            int[] nArray = new int[lIIIlllllIllI[1]];
            nArray[N.lIIIlllllIllI[0]] = lIIIlllllIllI[12];
            if (N.lIlIIllIIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIIlllllIllI[1]];
                nArray2[N.lIIIlllllIllI[0]] = lIIIlllllIllI[25];
                if (N.lIlIIllIIllIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lIIIlllllIllI[1]];
                    nArray3[N.lIIIlllllIllI[0]] = lIIIlllllIllI[23];
                    if (!(!N.lIlIIllIIllIIIl(Inventory.contains((int[])nArray3) ? 1 : 0) || N.lIlIIllIIllIIll(Inventory.contains(item -> item.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[207]])) ? 1 : 0) && !N.lIlIIllIIllIIIl(Equipment.contains(item -> item.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[206]])) ? 1 : 0) || N.lIlIIllIIllIIll(Inventory.contains((int[])f.bk) ? 1 : 0) && !N.lIlIIllIIllIIIl(Equipment.contains((int[])f.bk) ? 1 : 0))) {
                        n3 = lIIIlllllIllI[1];
                        0;
                        if (2 < 3) return n3 != 0;
                        return ((16 + 3 - -33 + 81 ^ 52 + 50 - -56 + 11) & (0x4E ^ 0 ^ (0xCB ^ 0xA9) ^ -1)) != 0;
                    }
                }
            }
            n3 = lIIIlllllIllI[0];
            return n3 != 0;
        }
        int[] nArray = new int[lIIIlllllIllI[1]];
        nArray[N.lIIIlllllIllI[0]] = lIIIlllllIllI[12];
        if (N.lIlIIllIIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[lIIIlllllIllI[1]];
            nArray4[N.lIIIlllllIllI[0]] = lIIIlllllIllI[14];
            if (N.lIlIIllIIllIIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                int[] nArray5 = new int[lIIIlllllIllI[1]];
                nArray5[N.lIIIlllllIllI[0]] = lIIIlllllIllI[13];
                if (!(!N.lIlIIllIIllIIIl(Inventory.contains((int[])nArray5) ? 1 : 0) || N.lIlIIllIIllIIll(Inventory.contains(item -> item.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[205]])) ? 1 : 0) && !N.lIlIIllIIllIIIl(Equipment.contains(item -> item.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[204]])) ? 1 : 0) || N.lIlIIllIIllIIll(Inventory.contains((int[])f.bk) ? 1 : 0) && !N.lIlIIllIIllIIIl(Equipment.contains((int[])f.bk) ? 1 : 0))) {
                    n2 = lIIIlllllIllI[1];
                    0;
                    if (2 == 2) return n2 != 0;
                    return ((0x4D ^ 0x37 ^ (9 ^ 0x29)) & (0x35 ^ 0x49 ^ (0x54 ^ 0x72) ^ -1)) != 0;
                }
            }
        }
        n2 = lIIIlllllIllI[0];
        return n2 != 0;
    }

    @Override
    public int Y() {
        try {
            N.cE();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 >= 0) {
            return (0xF ^ 0x1C) & ~(0xD5 ^ 0xC6);
        }
        return lIIIlllllIllI[186];
    }

    /*
     * WARNING - void declaration
     */
    private static void cG() {
        WorldArea worldArea = new WorldArea(lIIIlllllIllI[76], lIIIlllllIllI[77], lIIIlllllIllI[78], lIIIlllllIllI[79], lIIIlllllIllI[1]);
        WorldArea worldArea2 = new WorldArea(lIIIlllllIllI[76], lIIIlllllIllI[77], lIIIlllllIllI[78], lIIIlllllIllI[79], lIIIlllllIllI[2]);
        WorldArea worldArea3 = new WorldArea(lIIIlllllIllI[76], lIIIlllllIllI[77], lIIIlllllIllI[78], lIIIlllllIllI[79], lIIIlllllIllI[9]);
        WorldArea worldArea4 = new WorldArea(lIIIlllllIllI[80], lIIIlllllIllI[81], lIIIlllllIllI[69], lIIIlllllIllI[64], lIIIlllllIllI[0]);
        WorldArea worldArea5 = new WorldArea(lIIIlllllIllI[82], lIIIlllllIllI[81], lIIIlllllIllI[11], lIIIlllllIllI[64], lIIIlllllIllI[9]);
        WorldArea worldArea6 = new WorldArea(lIIIlllllIllI[83], lIIIlllllIllI[84], lIIIlllllIllI[63], lIIIlllllIllI[49], lIIIlllllIllI[9]);
        WorldArea worldArea7 = new WorldArea(lIIIlllllIllI[85], lIIIlllllIllI[86], lIIIlllllIllI[26], lIIIlllllIllI[22], lIIIlllllIllI[1]);
        WorldArea worldArea8 = new WorldArea(lIIIlllllIllI[85], lIIIlllllIllI[87], lIIIlllllIllI[11], lIIIlllllIllI[24], lIIIlllllIllI[9]);
        WorldArea worldArea9 = new WorldArea(lIIIlllllIllI[88], lIIIlllllIllI[89], lIIIlllllIllI[75], lIIIlllllIllI[40], lIIIlllllIllI[9]);
        WorldArea worldArea10 = new WorldArea(lIIIlllllIllI[90], lIIIlllllIllI[91], lIIIlllllIllI[66], lIIIlllllIllI[64], lIIIlllllIllI[9]);
        WorldArea worldArea11 = new WorldArea(lIIIlllllIllI[92], lIIIlllllIllI[93], lIIIlllllIllI[22], lIIIlllllIllI[26], lIIIlllllIllI[9]);
        WorldArea worldArea12 = new WorldArea(lIIIlllllIllI[92], lIIIlllllIllI[94], lIIIlllllIllI[11], lIIIlllllIllI[22], lIIIlllllIllI[9]);
        if (N.lIlIIllIIllIIll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[95]];
            if (N.lIlIIllIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (N.lIlIIllIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)new WorldPoint(lIIIlllllIllI[96], lIIIlllllIllI[52], lIIIlllllIllI[0]));
            0;
            Time.sleepTicks((int)lIIIlllllIllI[1]);
            0;
        }
        if (N.lIlIIllIIlllIII(Players.getLocal().getAnimation(), lIIIlllllIllI[62]) && N.lIlIIllIIllIIll(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] stringArray = new String[lIIIlllllIllI[1]];
            stringArray[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[97]];
            TileItem var29 = TileItems.getNearest((String[])stringArray);
            if (N.lIlIIllIIllIlII(var29) && N.lIlIIllIIllIIIl(N.cJ() ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[98]];
                System.out.println(lIIIlllllIlIl[lIIIlllllIllI[99]]);
                var29.interact(lIIIlllllIlIl[lIIIlllllIllI[100]]);
                Time.sleepTicks((int)lIIIlllllIllI[9]);
                0;
            }
            if (N.lIlIIllIIllIIll(N.cJ() ? 1 : 0)) {
                void var44;
                void var15;
                void var17;
                void var21;
                void var12;
                void var54;
                void var71;
                void var23;
                int var65;
                void var33;
                if (N.lIlIIllIIllIIIl(var33.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(N.cJ() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[101]];
                    var65 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray2 = new String[lIIIlllllIllI[1]];
                    stringArray2[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[102]];
                    TileObjects.getNearest((String[])stringArray2).interact(lIIIlllllIlIl[lIIIlllllIllI[103]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var65)) {
                            bl = lIIIlllllIllI[1];
                            0;
                            if (((0xE ^ 0x3E ^ (0xF4 ^ 0x9F)) & (0x47 ^ 0x64 ^ (0xF2 ^ 0x8A) ^ -1)) >= (0x5E ^ 0x50 ^ (0x3F ^ 0x35))) {
                                return ((140 + 131 - 59 + 8 ^ 76 + 78 - 14 + 19) & (72 + 119 - 130 + 66 ^ (0x33 ^ 0xF) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIIlllllIllI[0];
                        }
                        return bl;
                    }, (int)lIIIlllllIllI[104]);
                    0;
                    Time.sleepTicks((int)lIIIlllllIllI[1]);
                    0;
                }
                if (N.lIlIIllIIllIIIl(var23.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(N.cJ() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[37]];
                    var65 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray3 = new String[lIIIlllllIllI[1]];
                    stringArray3[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[105]];
                    TileObjects.getNearest((String[])stringArray3).interact(lIIIlllllIlIl[lIIIlllllIllI[106]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var65)) {
                            bl = lIIIlllllIllI[1];
                            0;
                            if (((0x61 ^ 0x75) & ~(0x3B ^ 0x2F)) != 0) {
                                return false;
                            }
                        } else {
                            bl = lIIIlllllIllI[0];
                        }
                        return bl;
                    }, (int)lIIIlllllIllI[104]);
                    0;
                    Time.sleepTicks((int)lIIIlllllIllI[1]);
                    0;
                }
                if (N.lIlIIllIIllIIIl(var71.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(N.cJ() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[107]];
                    var65 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray4 = new String[lIIIlllllIllI[1]];
                    stringArray4[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[108]];
                    TileObjects.getNearest((String[])stringArray4).interact(lIIIlllllIlIl[lIIIlllllIllI[109]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var65)) {
                            bl = lIIIlllllIllI[1];
                            0;
                            if (-1 > 3) {
                                return ((93 + 35 - -19 + 12 ^ 97 + 13 - -27 + 48) & (0xE5 ^ 0x82 ^ (0xE9 ^ 0xA8) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIIlllllIllI[0];
                        }
                        return bl;
                    }, (int)lIIIlllllIllI[104]);
                    0;
                    Time.sleepTicks((int)lIIIlllllIllI[1]);
                    0;
                }
                if (N.lIlIIllIIllIIIl(var54.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(N.cJ() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[110]];
                    var65 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray5 = new String[lIIIlllllIllI[1]];
                    stringArray5[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[111]];
                    TileObjects.getNearest((String[])stringArray5).interact(lIIIlllllIlIl[lIIIlllllIllI[112]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var65)) {
                            bl = lIIIlllllIllI[1];
                            0;
                            if (-1 >= 0) {
                                return false;
                            }
                        } else {
                            bl = lIIIlllllIllI[0];
                        }
                        return bl;
                    }, (int)lIIIlllllIllI[104]);
                    0;
                    Time.sleepTicks((int)lIIIlllllIllI[1]);
                    0;
                }
                if (N.lIlIIllIIllIIIl(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(N.cJ() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[113]];
                    var65 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray6 = new String[lIIIlllllIllI[1]];
                    stringArray6[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[39]];
                    TileObjects.getNearest((String[])stringArray6).interact(lIIIlllllIlIl[lIIIlllllIllI[6]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var65)) {
                            bl = lIIIlllllIllI[1];
                            0;
                            if ((0x24 ^ 0x21) <= 0) {
                                return false;
                            }
                        } else {
                            bl = lIIIlllllIllI[0];
                        }
                        return bl;
                    }, (int)lIIIlllllIllI[104]);
                    0;
                    Time.sleepTicks((int)lIIIlllllIllI[1]);
                    0;
                }
                if (N.lIlIIllIIllIIIl(var21.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(N.cJ() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[114]];
                    var65 = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIIIlllllIllI[1]];
                    nArray[N.lIIIlllllIllI[0]] = lIIIlllllIllI[115];
                    TileObjects.getNearest((int[])nArray).interact(lIIIlllllIlIl[lIIIlllllIllI[116]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var65)) {
                            bl = lIIIlllllIllI[1];
                            0;
                            if (((0xDA ^ 0x98) & ~(0x11 ^ 0x53)) != 0) {
                                return false;
                            }
                        } else {
                            bl = lIIIlllllIllI[0];
                        }
                        return bl;
                    }, (int)lIIIlllllIllI[104]);
                    0;
                    Time.sleepTicks((int)lIIIlllllIllI[1]);
                    0;
                }
                if (N.lIlIIllIIllIIIl(var17.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(N.cJ() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[117]];
                    var65 = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIIIlllllIllI[1]];
                    nArray[N.lIIIlllllIllI[0]] = lIIIlllllIllI[118];
                    TileObjects.getNearest((int[])nArray).interact(lIIIlllllIlIl[lIIIlllllIllI[119]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var65)) {
                            bl = lIIIlllllIllI[1];
                            0;
                            if (((0x99 ^ 0xC1) & ~(0x99 ^ 0xC1)) != 0) {
                                return false;
                            }
                        } else {
                            bl = lIIIlllllIllI[0];
                        }
                        return bl;
                    }, (int)lIIIlllllIllI[104]);
                    0;
                    Time.sleepTicks((int)lIIIlllllIllI[1]);
                    0;
                }
                if (N.lIlIIllIIllIIIl(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(N.cJ() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[120]];
                    var65 = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIIIlllllIllI[1]];
                    nArray[N.lIIIlllllIllI[0]] = lIIIlllllIllI[121];
                    TileObjects.getNearest((int[])nArray).interact(lIIIlllllIlIl[lIIIlllllIllI[122]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var65)) {
                            bl = lIIIlllllIllI[1];
                            0;
                            if (2 < 0) {
                                return false;
                            }
                        } else {
                            bl = lIIIlllllIllI[0];
                        }
                        return bl;
                    }, (int)lIIIlllllIllI[104]);
                    0;
                    Time.sleepTicks((int)lIIIlllllIllI[1]);
                    0;
                }
                if (N.lIlIIllIIllIIIl(var44.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(N.cJ() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[123]];
                    var65 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray7 = new String[lIIIlllllIllI[1]];
                    stringArray7[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[124]];
                    TileObjects.getNearest((String[])stringArray7).interact(lIIIlllllIlIl[lIIIlllllIllI[44]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var65)) {
                            bl = lIIIlllllIllI[1];
                            0;
                            if (-1 > (157 + 186 - 266 + 110 ^ 190 + 86 - 272 + 187)) {
                                return ((0x37 ^ 0x6B ^ (0x18 ^ 0x27)) & (0xCD ^ 0x9F ^ (0x3E ^ 0xF) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIIlllllIllI[0];
                        }
                        return bl;
                    }, (int)lIIIlllllIllI[104]);
                    0;
                    Time.sleepTicks((int)lIIIlllllIllI[1]);
                    0;
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void cI() {
        void var11;
        void var43;
        void var63;
        void var51;
        void var45;
        WorldArea worldArea = new WorldArea(lIIIlllllIllI[162], lIIIlllllIllI[163], lIIIlllllIllI[111], lIIIlllllIllI[111], lIIIlllllIllI[0]);
        WorldArea worldArea2 = new WorldArea(lIIIlllllIllI[162], lIIIlllllIllI[163], lIIIlllllIllI[111], lIIIlllllIllI[111], lIIIlllllIllI[1]);
        WorldArea worldArea3 = new WorldArea(lIIIlllllIllI[162], lIIIlllllIllI[163], lIIIlllllIllI[111], lIIIlllllIllI[111], lIIIlllllIllI[2]);
        WorldArea worldArea4 = new WorldArea(lIIIlllllIllI[162], lIIIlllllIllI[163], lIIIlllllIllI[111], lIIIlllllIllI[111], lIIIlllllIllI[9]);
        WorldArea worldArea5 = new WorldArea(lIIIlllllIllI[164], lIIIlllllIllI[133], lIIIlllllIllI[64], lIIIlllllIllI[11], lIIIlllllIllI[9]);
        WorldArea worldArea6 = new WorldArea(lIIIlllllIllI[165], lIIIlllllIllI[139], lIIIlllllIllI[38], lIIIlllllIllI[53], lIIIlllllIllI[2]);
        WorldArea worldArea7 = new WorldArea(lIIIlllllIllI[166], lIIIlllllIllI[134], lIIIlllllIllI[49], lIIIlllllIllI[26], lIIIlllllIllI[2]);
        WorldArea worldArea8 = new WorldArea(lIIIlllllIllI[167], lIIIlllllIllI[136], lIIIlllllIllI[70], lIIIlllllIllI[64], lIIIlllllIllI[9]);
        WorldArea worldArea9 = new WorldArea(lIIIlllllIllI[168], lIIIlllllIllI[169], lIIIlllllIllI[54], lIIIlllllIllI[63], lIIIlllllIllI[2]);
        WorldPoint worldPoint = new WorldPoint(lIIIlllllIllI[170], lIIIlllllIllI[171], lIIIlllllIllI[0]);
        if (N.lIlIIllIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (N.lIlIIllIIllIIll(var45.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(var51.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(var63.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(var43.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[172]];
            Movement.walkTo((WorldPoint)var11);
            0;
            Time.sleepTicks((int)lIIIlllllIllI[1]);
            0;
        }
        if (N.lIlIIllIIllIIIl(var45.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (N.lIlIIllIIllIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var11), lIIIlllllIllI[20])) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[173]];
                Movement.walkTo((WorldPoint)var11);
                0;
                Time.sleepTicks((int)lIIIlllllIllI[1]);
                0;
            }
            if (N.lIlIIllIIlllIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var11), lIIIlllllIllI[20])) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[174]];
                int var7 = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[lIIIlllllIllI[1]];
                stringArray[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[175]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIlllllIlIl[lIIIlllllIllI[35]]);
                Time.sleepTicks((int)e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var7)) {
                        bl = lIIIlllllIllI[1];
                        0;
                        if (-1 < -1) {
                            return (2 & ~2) != 0;
                        }
                    } else {
                        bl = lIIIlllllIllI[0];
                    }
                    return bl;
                }, (int)lIIIlllllIllI[104]);
                0;
                Time.sleepTicks((int)lIIIlllllIllI[1]);
                0;
            }
        }
        String[] stringArray = new String[lIIIlllllIllI[1]];
        stringArray[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[176]];
        TileItem var7 = TileItems.getNearest((String[])stringArray);
        if (N.lIlIIllIIllIlII(var7) && N.lIlIIllIIllIIIl(N.cJ() ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[177]];
            System.out.println(lIIIlllllIlIl[lIIIlllllIllI[178]]);
            var7.interact(lIIIlllllIlIl[lIIIlllllIllI[179]]);
            Time.sleepTicks((int)lIIIlllllIllI[9]);
            0;
        }
        if (N.lIlIIllIIllIIll(N.cJ() ? 1 : 0)) {
            void var31;
            void var20;
            void var58;
            void var49;
            int var24;
            TileObject var60;
            void var5;
            if (N.lIlIIllIIllIIIl(var5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIlII(var60 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (N.lIlIIllIIllIIIl(tileObject.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[218]]) ? 1 : 0) && N.lIlIIllIIlllIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[219], lIIIlllllIllI[220], lIIIlllllIllI[9])), lIIIlllllIllI[2])) {
                    n2 = lIIIlllllIllI[1];
                    0;
                    if (((0xB1 ^ 0xA8) & ~(0xB4 ^ 0xAD)) >= 3) {
                        return false;
                    }
                } else {
                    n2 = lIIIlllllIllI[0];
                }
                return n2 != 0;
            }))) {
                var24 = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[180]];
                var60.interact(lIIIlllllIlIl[lIIIlllllIllI[79]]);
                Time.sleepTicks((int)e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var24)) {
                        bl = lIIIlllllIllI[1];
                        0;
                        if (3 <= 0) {
                            return ((0x6E ^ 0xE ^ (0x60 ^ 0x2C)) & (43 + 104 - 5 + 40 ^ 10 + 124 - -6 + 14 ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIIlllllIllI[0];
                    }
                    return bl;
                }, (int)lIIIlllllIllI[104]);
                0;
                Time.sleepTicks((int)lIIIlllllIllI[1]);
                0;
            }
            if (N.lIlIIllIIllIIIl(N.cJ() ? 1 : 0)) {
                return;
            }
            if (N.lIlIIllIIllIIIl(var49.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIlII(var60 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (N.lIlIIllIIllIIIl(tileObject.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[216]]) ? 1 : 0) && N.lIlIIllIIlllIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[217], lIIIlllllIllI[128], lIIIlllllIllI[2])), lIIIlllllIllI[2])) {
                    n2 = lIIIlllllIllI[1];
                    0;
                    if (2 >= 3) {
                        return false;
                    }
                } else {
                    n2 = lIIIlllllIllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[181]];
                var24 = Skills.getExperience((Skill)Skill.AGILITY);
                var60.interact(lIIIlllllIlIl[lIIIlllllIllI[182]]);
                Time.sleepTicks((int)e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var24)) {
                        bl = lIIIlllllIllI[1];
                        0;
                        if (-1 != -1) {
                            return false;
                        }
                    } else {
                        bl = lIIIlllllIllI[0];
                    }
                    return bl;
                }, (int)lIIIlllllIllI[104]);
                0;
                Time.sleepTicks((int)lIIIlllllIllI[1]);
                0;
            }
            if (N.lIlIIllIIllIIIl(N.cJ() ? 1 : 0)) {
                return;
            }
            if (N.lIlIIllIIllIIIl(var58.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIlII(var60 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (N.lIlIIllIIllIIIl(tileObject.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[213]]) ? 1 : 0) && N.lIlIIllIIlllIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[214], lIIIlllllIllI[215], lIIIlllllIllI[2])), lIIIlllllIllI[2])) {
                    n2 = lIIIlllllIllI[1];
                    0;
                    if (-2 >= 0) {
                        return ((0x15 ^ 0x3B ^ (0xFD ^ 0x99)) & (73 + 138 - 128 + 114 ^ 1 + 45 - -64 + 33 ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIIlllllIllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[183]];
                var24 = Skills.getExperience((Skill)Skill.AGILITY);
                var60.interact(lIIIlllllIlIl[lIIIlllllIllI[184]]);
                Time.sleepTicks((int)e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var24)) {
                        bl = lIIIlllllIllI[1];
                        0;
                        if (1 < 0) {
                            return false;
                        }
                    } else {
                        bl = lIIIlllllIllI[0];
                    }
                    return bl;
                }, (int)lIIIlllllIllI[104]);
                0;
                Time.sleepTicks((int)lIIIlllllIllI[1]);
                0;
            }
            if (N.lIlIIllIIllIIIl(N.cJ() ? 1 : 0)) {
                return;
            }
            if (N.lIlIIllIIllIIIl(var20.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIlII(var60 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (N.lIlIIllIIllIIIl(tileObject.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[211]]) ? 1 : 0) && N.lIlIIllIIlllIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[209], lIIIlllllIllI[212], lIIIlllllIllI[9])), lIIIlllllIllI[2])) {
                    n2 = lIIIlllllIllI[1];
                    0;
                    if (2 < 1) {
                        return false;
                    }
                } else {
                    n2 = lIIIlllllIllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[185]];
                var24 = Skills.getExperience((Skill)Skill.AGILITY);
                var60.interact(lIIIlllllIlIl[lIIIlllllIllI[186]]);
                Time.sleepTicks((int)e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var24)) {
                        bl = lIIIlllllIllI[1];
                        0;
                        if (((0x14 ^ 0x28 ^ (0xA7 ^ 0x92)) & (0xCD ^ 0xB1 ^ (0xF9 ^ 0x8C) ^ -1)) != 0) {
                            return ((35 + 82 - 4 + 30 ^ 28 + 29 - 24 + 154) & (0x51 ^ 0x28 ^ (0xE4 ^ 0xA9) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIIlllllIllI[0];
                    }
                    return bl;
                }, (int)lIIIlllllIllI[104]);
                0;
                Time.sleepTicks((int)lIIIlllllIllI[1]);
                0;
            }
            if (N.lIlIIllIIllIIIl(N.cJ() ? 1 : 0)) {
                return;
            }
            if (N.lIlIIllIIllIIIl(var31.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIlII(var60 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (N.lIlIIllIIllIIIl(tileObject.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[208]]) ? 1 : 0) && N.lIlIIllIIlllIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[209], lIIIlllllIllI[210], lIIIlllllIllI[2])), lIIIlllllIllI[2])) {
                    n2 = lIIIlllllIllI[1];
                    0;
                    
                    }
                } else {
                    n2 = lIIIlllllIllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[187]];
                var24 = Skills.getExperience((Skill)Skill.AGILITY);
                var60.interact(lIIIlllllIlIl[lIIIlllllIllI[188]]);
                Time.sleepTicks((int)e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var24)) {
                        bl = lIIIlllllIllI[1];
                        0;
                        if (3 < 3) {
                            return ((0x25 ^ 0x2E ^ (0x19 ^ 0x53)) & (0xE5 ^ 0xB4 ^ (0xB4 ^ 0xA4) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIIlllllIllI[0];
                    }
                    return bl;
                }, (int)lIIIlllllIllI[104]);
                0;
                Time.sleepTicks((int)lIIIlllllIllI[1]);
                0;
            }
        }
    }

    private static boolean lIlIIllIIlllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIllIIllIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIlIIllIIlIlIll(String var39, String var28) {
        var39 = new String(Base64.getDecoder().decode(var39.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var68 = var28.toCharArray();
        int var10 = lIIIlllllIllI[0];
        char[] var13 = var39.toCharArray();
        int var35 = var13.length;
        int var70 = lIIIlllllIllI[0];
        while (N.lIlIIllIIllIIlI(var70, var35)) {
            char var50 = var13[var70];
            var9.append((char)(var50 ^ var68[var10 % var68.length]));
            0;
            ++var10;
            ++var70;
            0;
            if (((0x49 ^ 0x6C ^ (0xE ^ 0x2C)) & (0xC9 ^ 0xA4 ^ (0xAD ^ 0xC7) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static boolean lIlIIllIIllIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIllIIllIlll(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void cH() {
        void var55;
        void var47;
        void var67;
        void var56;
        void var52;
        WorldArea worldArea = new WorldArea(lIIIlllllIllI[125], lIIIlllllIllI[126], lIIIlllllIllI[112], lIIIlllllIllI[107], lIIIlllllIllI[0]);
        WorldArea worldArea2 = new WorldArea(lIIIlllllIllI[125], lIIIlllllIllI[126], lIIIlllllIllI[112], lIIIlllllIllI[107], lIIIlllllIllI[1]);
        WorldArea worldArea3 = new WorldArea(lIIIlllllIllI[125], lIIIlllllIllI[126], lIIIlllllIllI[112], lIIIlllllIllI[107], lIIIlllllIllI[2]);
        WorldArea worldArea4 = new WorldArea(lIIIlllllIllI[125], lIIIlllllIllI[126], lIIIlllllIllI[112], lIIIlllllIllI[107], lIIIlllllIllI[9]);
        WorldArea worldArea5 = new WorldArea(lIIIlllllIllI[127], lIIIlllllIllI[128], lIIIlllllIllI[49], lIIIlllllIllI[11], lIIIlllllIllI[2]);
        WorldArea worldArea6 = new WorldArea(lIIIlllllIllI[129], lIIIlllllIllI[127], lIIIlllllIllI[49], lIIIlllllIllI[24], lIIIlllllIllI[2]);
        WorldArea worldArea7 = new WorldArea(lIIIlllllIllI[130], lIIIlllllIllI[131], lIIIlllllIllI[63], lIIIlllllIllI[49], lIIIlllllIllI[2]);
        WorldArea worldArea8 = new WorldArea(lIIIlllllIllI[132], lIIIlllllIllI[133], lIIIlllllIllI[11], lIIIlllllIllI[64], lIIIlllllIllI[9]);
        WorldArea worldArea9 = new WorldArea(lIIIlllllIllI[134], lIIIlllllIllI[8], lIIIlllllIllI[49], lIIIlllllIllI[26], lIIIlllllIllI[2]);
        WorldArea worldArea10 = new WorldArea(lIIIlllllIllI[135], lIIIlllllIllI[136], lIIIlllllIllI[68], lIIIlllllIllI[53], lIIIlllllIllI[9]);
        WorldArea worldArea11 = new WorldArea(lIIIlllllIllI[137], lIIIlllllIllI[138], lIIIlllllIllI[63], lIIIlllllIllI[64], lIIIlllllIllI[2]);
        WorldPoint worldPoint = new WorldPoint(lIIIlllllIllI[137], lIIIlllllIllI[139], lIIIlllllIllI[0]);
        if (N.lIlIIllIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (N.lIlIIllIIllIIll(var52.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(var56.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(var67.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(var47.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[140]];
            Movement.walkTo((WorldPoint)var55);
            0;
            Time.sleepTicks((int)lIIIlllllIllI[1]);
            0;
        }
        if (N.lIlIIllIIllIIIl(var52.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (N.lIlIIllIIllIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var55), lIIIlllllIllI[20])) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[5]];
                Movement.walkTo((WorldPoint)var55);
                0;
                Time.sleepTicks((int)lIIIlllllIllI[1]);
                0;
            }
            if (N.lIlIIllIIlllIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var55), lIIIlllllIllI[20])) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[141]];
                int var8 = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[lIIIlllllIllI[1]];
                stringArray[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[142]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIlllllIlIl[lIIIlllllIllI[143]]);
                Time.sleepTicks((int)e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var8)) {
                        bl = lIIIlllllIllI[1];
                        0;
                        if (3 <= 0) {
                            return false;
                        }
                    } else {
                        bl = lIIIlllllIllI[0];
                    }
                    return bl;
                }, (int)lIIIlllllIllI[104]);
                0;
                Time.sleepTicks((int)lIIIlllllIllI[1]);
                0;
            }
        }
        String[] stringArray = new String[lIIIlllllIllI[1]];
        stringArray[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[144]];
        TileItem var8 = TileItems.getNearest((String[])stringArray);
        if (N.lIlIIllIIllIlII(var8) && N.lIlIIllIIllIIIl(N.cJ() ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[145]];
            System.out.println(lIIIlllllIlIl[lIIIlllllIllI[146]]);
            var8.interact(lIIIlllllIlIl[lIIIlllllIllI[147]]);
            Time.sleepTicks((int)lIIIlllllIllI[9]);
            0;
        }
        if (N.lIlIIllIIllIIll(N.cJ() ? 1 : 0)) {
            void var40;
            void var34;
            void var62;
            void var46;
            void var16;
            void var64;
            int var57;
            TileObject var27;
            void var14;
            if (N.lIlIIllIIllIIIl(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIlII(var27 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (N.lIlIIllIIllIIIl(tileObject.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[233]]) ? 1 : 0) && N.lIlIIllIIlllIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[234], lIIIlllllIllI[131], lIIIlllllIllI[2])), lIIIlllllIllI[2])) {
                    n2 = lIIIlllllIllI[1];
                    0;
                    if (3 <= 1) {
                        return ((0xCE ^ 0xB5 ^ (0xBF ^ 0x8A)) & (28 + 155 - 9 + 19 ^ 93 + 28 - 7 + 29 ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIIlllllIllI[0];
                }
                return n2 != 0;
            }))) {
                var57 = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[148]];
                var27.interact(lIIIlllllIlIl[lIIIlllllIllI[149]]);
                Time.sleepTicks((int)e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var57)) {
                        bl = lIIIlllllIllI[1];
                        0;
                        if (((0x67 ^ 0x7A) & ~(0x31 ^ 0x2C)) < 0) {
                            return false;
                        }
                    } else {
                        bl = lIIIlllllIllI[0];
                    }
                    return bl;
                }, (int)lIIIlllllIllI[104]);
                0;
                Time.sleepTicks((int)lIIIlllllIllI[1]);
                0;
            }
            if (N.lIlIIllIIllIIIl(N.cJ() ? 1 : 0)) {
                return;
            }
            if (N.lIlIIllIIllIIIl(var64.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIlII(var27 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (N.lIlIIllIIllIIIl(tileObject.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[232]]) ? 1 : 0) && N.lIlIIllIIlllIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[131], lIIIlllllIllI[225], lIIIlllllIllI[2])), lIIIlllllIllI[2])) {
                    n2 = lIIIlllllIllI[1];
                    0;
                    
                    }
                } else {
                    n2 = lIIIlllllIllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[150]];
                var57 = Skills.getExperience((Skill)Skill.AGILITY);
                var27.interact(lIIIlllllIlIl[lIIIlllllIllI[151]]);
                Time.sleepTicks((int)e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var57)) {
                        bl = lIIIlllllIllI[1];
                        0;
                        if (-1 >= 3) {
                            return ((0x83 ^ 0xC7 ^ (0x4F ^ 0x48)) & (120 + 2 - 41 + 133 ^ 133 + 2 - 64 + 78 ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIIlllllIllI[0];
                    }
                    return bl;
                }, (int)lIIIlllllIllI[104]);
                0;
                Time.sleepTicks((int)lIIIlllllIllI[1]);
                0;
            }
            if (N.lIlIIllIIllIIIl(N.cJ() ? 1 : 0)) {
                return;
            }
            if (N.lIlIIllIIllIIIl(var16.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIlII(var27 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (N.lIlIIllIIllIIIl(tileObject.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[230]]) ? 1 : 0) && N.lIlIIllIIlllIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[139], lIIIlllllIllI[231], lIIIlllllIllI[2])), lIIIlllllIllI[2])) {
                    n2 = lIIIlllllIllI[1];
                    0;
                    if (-1 > 0) {
                        return false;
                    }
                } else {
                    n2 = lIIIlllllIllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[152]];
                var57 = Skills.getExperience((Skill)Skill.AGILITY);
                var27.interact(lIIIlllllIlIl[lIIIlllllIllI[153]]);
                Time.sleepTicks((int)e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var57)) {
                        bl = lIIIlllllIllI[1];
                        0;
                        if ((0xA4 ^ 0xA0) <= (1 & ~1)) {
                            return false;
                        }
                    } else {
                        bl = lIIIlllllIllI[0];
                    }
                    return bl;
                }, (int)lIIIlllllIllI[104]);
                0;
                Time.sleepTicks((int)lIIIlllllIllI[1]);
                0;
            }
            if (N.lIlIIllIIllIIIl(N.cJ() ? 1 : 0)) {
                return;
            }
            if (N.lIlIIllIIllIIIl(var46.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIlII(var27 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (N.lIlIIllIIllIIIl(tileObject.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[227]]) ? 1 : 0) && N.lIlIIllIIlllIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[228], lIIIlllllIllI[229], lIIIlllllIllI[9])), lIIIlllllIllI[2])) {
                    n2 = lIIIlllllIllI[1];
                    0;
                    if (3 > 3) {
                        return false;
                    }
                } else {
                    n2 = lIIIlllllIllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[154]];
                var57 = Skills.getExperience((Skill)Skill.AGILITY);
                var27.interact(lIIIlllllIlIl[lIIIlllllIllI[155]]);
                Time.sleepTicks((int)e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var57)) {
                        bl = lIIIlllllIllI[1];
                        0;
                        if ((0x1B ^ 0x1F) < 2) {
                            return false;
                        }
                    } else {
                        bl = lIIIlllllIllI[0];
                    }
                    return bl;
                }, (int)lIIIlllllIllI[104]);
                0;
                Time.sleepTicks((int)lIIIlllllIllI[1]);
                0;
            }
            if (N.lIlIIllIIllIIIl(N.cJ() ? 1 : 0)) {
                return;
            }
            if (N.lIlIIllIIllIIIl(var62.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIlII(var27 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (N.lIlIIllIIllIIIl(tileObject.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[226]]) ? 1 : 0) && N.lIlIIllIIlllIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[8], lIIIlllllIllI[130], lIIIlllllIllI[2])), lIIIlllllIllI[2])) {
                    n2 = lIIIlllllIllI[1];
                    0;
                    if (-1 > 0) {
                        return false;
                    }
                } else {
                    n2 = lIIIlllllIllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[156]];
                var57 = Skills.getExperience((Skill)Skill.AGILITY);
                var27.interact(lIIIlllllIlIl[lIIIlllllIllI[157]]);
                Time.sleepTicks((int)e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var57)) {
                        bl = lIIIlllllIllI[1];
                        0;
                        if ((0x51 ^ 0x55) < 2) {
                            return false;
                        }
                    } else {
                        bl = lIIIlllllIllI[0];
                    }
                    return bl;
                }, (int)lIIIlllllIllI[104]);
                0;
                Time.sleepTicks((int)lIIIlllllIllI[1]);
                0;
            }
            if (N.lIlIIllIIllIIIl(N.cJ() ? 1 : 0)) {
                return;
            }
            if (N.lIlIIllIIllIIIl(var34.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIlII(var27 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (N.lIlIIllIIllIIIl(tileObject.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[224]]) ? 1 : 0) && N.lIlIIllIIlllIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[225], lIIIlllllIllI[215], lIIIlllllIllI[9])), lIIIlllllIllI[2])) {
                    n2 = lIIIlllllIllI[1];
                    0;
                    if (2 > 2) {
                        return ((3 ^ 0xD ^ (0x72 ^ 0x5C)) & (0xD ^ 0x75 ^ (0xC7 ^ 0x9F) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIIlllllIllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[158]];
                var57 = Skills.getExperience((Skill)Skill.AGILITY);
                var27.interact(lIIIlllllIlIl[lIIIlllllIllI[159]]);
                Time.sleepTicks((int)e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var57)) {
                        bl = lIIIlllllIllI[1];
                        0;
                        if (((0x31 ^ 0x17 ^ (0xD2 ^ 0xA8)) & (0x36 ^ 0x56 ^ (0x9F ^ 0xA3) ^ -1)) > ((182 + 139 - 136 + 3 ^ 108 + 107 - 70 + 35) & (128 + 86 - 186 + 108 ^ 101 + 66 - 153 + 114 ^ -1))) {
                            return (((0x32 ^ 0x3F) & ~(0x37 ^ 0x3A) ^ (0xC3 ^ 0x8A)) & (0x54 ^ 0x3C ^ (0xE0 ^ 0xC1) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIIlllllIllI[0];
                    }
                    return bl;
                }, (int)lIIIlllllIllI[104]);
                0;
                Time.sleepTicks((int)lIIIlllllIllI[1]);
                0;
            }
            if (N.lIlIIllIIllIIIl(N.cJ() ? 1 : 0)) {
                return;
            }
            if (N.lIlIIllIIllIIIl(var40.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIlII(var27 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (N.lIlIIllIIllIIIl(tileObject.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[221]]) ? 1 : 0) && N.lIlIIllIIlllIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[222], lIIIlllllIllI[223], lIIIlllllIllI[2])), lIIIlllllIllI[2])) {
                    n2 = lIIIlllllIllI[1];
                    0;
                    
                    }
                } else {
                    n2 = lIIIlllllIllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[160]];
                var57 = Skills.getExperience((Skill)Skill.AGILITY);
                var27.interact(lIIIlllllIlIl[lIIIlllllIllI[161]]);
                Time.sleepTicks((int)e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var57)) {
                        bl = lIIIlllllIllI[1];
                        0;
                        if (-(0x4E ^ 0x1A ^ (0x72 ^ 0x22)) > 0) {
                            return ((0x69 ^ 0x73 ^ (0x55 ^ 0x62)) & (0xFB ^ 0x90 ^ (0xF0 ^ 0xB6) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIIlllllIllI[0];
                    }
                    return bl;
                }, (int)lIIIlllllIllI[104]);
                0;
                Time.sleepTicks((int)lIIIlllllIllI[1]);
                0;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static boolean cJ() {
        WorldArea worldArea = new WorldArea(lIIIlllllIllI[80], lIIIlllllIllI[81], lIIIlllllIllI[69], lIIIlllllIllI[64], lIIIlllllIllI[0]);
        WorldArea worldArea2 = new WorldArea(lIIIlllllIllI[82], lIIIlllllIllI[81], lIIIlllllIllI[11], lIIIlllllIllI[64], lIIIlllllIllI[9]);
        WorldArea worldArea3 = new WorldArea(lIIIlllllIllI[83], lIIIlllllIllI[84], lIIIlllllIllI[63], lIIIlllllIllI[49], lIIIlllllIllI[9]);
        WorldArea worldArea4 = new WorldArea(lIIIlllllIllI[189], lIIIlllllIllI[190], lIIIlllllIllI[24], lIIIlllllIllI[18], lIIIlllllIllI[1]);
        WorldArea worldArea5 = new WorldArea(lIIIlllllIllI[85], lIIIlllllIllI[87], lIIIlllllIllI[11], lIIIlllllIllI[24], lIIIlllllIllI[9]);
        WorldArea worldArea6 = new WorldArea(lIIIlllllIllI[191], lIIIlllllIllI[192], lIIIlllllIllI[73], lIIIlllllIllI[38], lIIIlllllIllI[9]);
        WorldArea worldArea7 = new WorldArea(lIIIlllllIllI[90], lIIIlllllIllI[91], lIIIlllllIllI[66], lIIIlllllIllI[64], lIIIlllllIllI[9]);
        WorldArea worldArea8 = new WorldArea(lIIIlllllIllI[92], lIIIlllllIllI[93], lIIIlllllIllI[22], lIIIlllllIllI[26], lIIIlllllIllI[9]);
        WorldArea worldArea9 = new WorldArea(lIIIlllllIllI[92], lIIIlllllIllI[94], lIIIlllllIllI[11], lIIIlllllIllI[22], lIIIlllllIllI[9]);
        WorldArea worldArea10 = new WorldArea(lIIIlllllIllI[127], lIIIlllllIllI[128], lIIIlllllIllI[49], lIIIlllllIllI[11], lIIIlllllIllI[2]);
        WorldArea worldArea11 = new WorldArea(lIIIlllllIllI[129], lIIIlllllIllI[127], lIIIlllllIllI[49], lIIIlllllIllI[24], lIIIlllllIllI[2]);
        WorldArea worldArea12 = new WorldArea(lIIIlllllIllI[130], lIIIlllllIllI[131], lIIIlllllIllI[63], lIIIlllllIllI[49], lIIIlllllIllI[2]);
        WorldArea worldArea13 = new WorldArea(lIIIlllllIllI[132], lIIIlllllIllI[133], lIIIlllllIllI[11], lIIIlllllIllI[64], lIIIlllllIllI[9]);
        WorldArea worldArea14 = new WorldArea(lIIIlllllIllI[134], lIIIlllllIllI[8], lIIIlllllIllI[49], lIIIlllllIllI[26], lIIIlllllIllI[2]);
        WorldArea worldArea15 = new WorldArea(lIIIlllllIllI[135], lIIIlllllIllI[136], lIIIlllllIllI[68], lIIIlllllIllI[53], lIIIlllllIllI[9]);
        WorldArea worldArea16 = new WorldArea(lIIIlllllIllI[137], lIIIlllllIllI[138], lIIIlllllIllI[63], lIIIlllllIllI[64], lIIIlllllIllI[2]);
        WorldArea worldArea17 = new WorldArea(lIIIlllllIllI[164], lIIIlllllIllI[133], lIIIlllllIllI[64], lIIIlllllIllI[11], lIIIlllllIllI[9]);
        WorldArea worldArea18 = new WorldArea(lIIIlllllIllI[165], lIIIlllllIllI[139], lIIIlllllIllI[38], lIIIlllllIllI[53], lIIIlllllIllI[2]);
        WorldArea worldArea19 = new WorldArea(lIIIlllllIllI[166], lIIIlllllIllI[134], lIIIlllllIllI[49], lIIIlllllIllI[26], lIIIlllllIllI[2]);
        WorldArea worldArea20 = new WorldArea(lIIIlllllIllI[167], lIIIlllllIllI[136], lIIIlllllIllI[70], lIIIlllllIllI[64], lIIIlllllIllI[9]);
        WorldArea worldArea21 = new WorldArea(lIIIlllllIllI[168], lIIIlllllIllI[169], lIIIlllllIllI[54], lIIIlllllIllI[63], lIIIlllllIllI[2]);
        WorldArea[] worldAreaArray = new WorldArea[lIIIlllllIllI[68]];
        worldAreaArray[N.lIIIlllllIllI[0]] = worldArea;
        worldAreaArray[N.lIIIlllllIllI[1]] = worldArea2;
        worldAreaArray[N.lIIIlllllIllI[2]] = worldArea3;
        worldAreaArray[N.lIIIlllllIllI[9]] = worldArea4;
        worldAreaArray[N.lIIIlllllIllI[16]] = worldArea5;
        worldAreaArray[N.lIIIlllllIllI[18]] = worldArea6;
        worldAreaArray[N.lIIIlllllIllI[20]] = worldArea7;
        worldAreaArray[N.lIIIlllllIllI[22]] = worldArea8;
        worldAreaArray[N.lIIIlllllIllI[24]] = worldArea9;
        worldAreaArray[N.lIIIlllllIllI[26]] = worldArea10;
        worldAreaArray[N.lIIIlllllIllI[11]] = worldArea11;
        worldAreaArray[N.lIIIlllllIllI[49]] = worldArea12;
        worldAreaArray[N.lIIIlllllIllI[63]] = worldArea13;
        worldAreaArray[N.lIIIlllllIllI[64]] = worldArea14;
        worldAreaArray[N.lIIIlllllIllI[53]] = worldArea15;
        worldAreaArray[N.lIIIlllllIllI[38]] = worldArea16;
        worldAreaArray[N.lIIIlllllIllI[65]] = worldArea17;
        worldAreaArray[N.lIIIlllllIllI[66]] = worldArea18;
        worldAreaArray[N.lIIIlllllIllI[54]] = worldArea19;
        worldAreaArray[N.lIIIlllllIllI[67]] = worldArea20;
        worldAreaArray[N.lIIIlllllIllI[40]] = worldArea21;
        WorldArea[] worldAreaArray2 = worldAreaArray;
        int[] nArray = new int[lIIIlllllIllI[1]];
        nArray[N.lIIIlllllIllI[0]] = lIIIlllllIllI[193];
        if (N.lIlIIllIIllIlII(TileItems.getNearest((int[])nArray))) {
            void var2;
            System.out.println(lIIIlllllIlIl[lIIIlllllIllI[194]]);
            int var41 = lIIIlllllIllI[0];
            while (N.lIlIIllIIllIIlI(var41, ((void)var2).length)) {
                int[] nArray2 = new int[lIIIlllllIllI[1]];
                nArray2[N.lIIIlllllIllI[0]] = lIIIlllllIllI[193];
                if (N.lIlIIllIIllIIIl(var2[var41].contains(TileItems.getNearest((int[])nArray2).getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIIl(var2[var41].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return lIIIlllllIllI[1];
                }
                ++var41;
                0;
                if (1 != (0x18 ^ 0x45 ^ (0x78 ^ 0x21))) continue;
                return ((0x80 ^ 0x9B ^ (0x80 ^ 0xB5)) & (0x2C ^ 0x7C ^ (0x52 ^ 0x2C) ^ -1)) != 0;
            }
        }
        return lIIIlllllIllI[0];
    }

    private static boolean lIlIIllIIllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public static void cE() {
        if (N.lIlIIllIIllIIIl(by ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[0]];
            b.a(bA);
            if (N.lIlIIllIIllIIlI(bA.size(), lIIIlllllIllI[1])) {
                System.out.println(lIIIlllllIlIl[lIIIlllllIllI[1]]);
                by = lIIIlllllIllI[0];
            }
        }
        if (N.lIlIIllIIllIIll(by ? 1 : 0)) {
            if (N.lIlIIllIIllIIll(N.S() ? 1 : 0)) {
                BankLocation var22 = BankLocation.getNearest();
                if (N.lIlIIllIIllIlII(var22) && N.lIlIIllIIllIIll(var22.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[2]];
                    WorldArea var25 = new WorldArea(lIIIlllllIllI[3], lIIIlllllIllI[4], lIIIlllllIllI[5], lIIIlllllIllI[6], lIIIlllllIllI[0]);
                    if (N.lIlIIllIIllIIIl(var25.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint var18 = new WorldPoint(lIIIlllllIllI[7], lIIIlllllIllI[8], lIIIlllllIllI[0]);
                        if (N.lIlIIllIIllIlIl(Players.getLocal().getWorldLocation().distanceTo(var18), lIIIlllllIllI[9])) {
                            Movement.walkTo((WorldPoint)var18);
                            0;
                            Time.sleepTicks((int)lIIIlllllIllI[1]);
                            0;
                        }
                    }
                    a.a(var22);
                }
                if (N.lIlIIllIIllIlII(var22) && N.lIlIIllIIllIIIl(var22.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[9]];
                    if (N.lIlIIllIIllIIll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllllIllI[10]);
                        0;
                    }
                    if (N.lIlIIllIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                        if (N.lIlIIllIIllIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIlllllIllI[1]);
                            0;
                        }
                        if (N.lIlIIllIIllIllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIlllllIllI[2]);
                            0;
                        }
                    }
                    int[] nArray = new int[lIIIlllllIllI[11]];
                    nArray[N.lIIIlllllIllI[0]] = lIIIlllllIllI[12];
                    nArray[N.lIIIlllllIllI[1]] = lIIIlllllIllI[13];
                    nArray[N.lIIIlllllIllI[2]] = lIIIlllllIllI[14];
                    nArray[N.lIIIlllllIllI[9]] = lIIIlllllIllI[15];
                    nArray[N.lIIIlllllIllI[16]] = lIIIlllllIllI[17];
                    nArray[N.lIIIlllllIllI[18]] = lIIIlllllIllI[19];
                    nArray[N.lIIIlllllIllI[20]] = lIIIlllllIllI[21];
                    nArray[N.lIIIlllllIllI[22]] = lIIIlllllIllI[23];
                    nArray[N.lIIIlllllIllI[24]] = lIIIlllllIllI[25];
                    nArray[N.lIIIlllllIllI[26]] = lIIIlllllIllI[27];
                    if (N.lIlIIllIIllIIll(e.b(nArray) ? 1 : 0)) {
                        N.W();
                        System.out.println(lIIIlllllIlIl[lIIIlllllIllI[16]]);
                        by = lIIIlllllIllI[1];
                        return;
                    }
                    int[] nArray2 = new int[lIIIlllllIllI[11]];
                    nArray2[N.lIIIlllllIllI[0]] = lIIIlllllIllI[12];
                    nArray2[N.lIIIlllllIllI[1]] = lIIIlllllIllI[13];
                    nArray2[N.lIIIlllllIllI[2]] = lIIIlllllIllI[14];
                    nArray2[N.lIIIlllllIllI[9]] = lIIIlllllIllI[15];
                    nArray2[N.lIIIlllllIllI[16]] = lIIIlllllIllI[17];
                    nArray2[N.lIIIlllllIllI[18]] = lIIIlllllIllI[19];
                    nArray2[N.lIIIlllllIllI[20]] = lIIIlllllIllI[21];
                    nArray2[N.lIIIlllllIllI[22]] = lIIIlllllIllI[23];
                    nArray2[N.lIIIlllllIllI[24]] = lIIIlllllIllI[25];
                    nArray2[N.lIIIlllllIllI[26]] = lIIIlllllIllI[27];
                    if (N.lIlIIllIIllIIIl(e.b(nArray2) ? 1 : 0)) {
                        a.a(lIIIlllllIllI[28], lIIIlllllIllI[1]);
                        a.a(lIIIlllllIllI[29], lIIIlllllIllI[1]);
                        a.a(lIIIlllllIllI[30], lIIIlllllIllI[1]);
                        a.a(lIIIlllllIllI[31], lIIIlllllIllI[1]);
                        a.a(lIIIlllllIllI[32], lIIIlllllIllI[1]);
                        a.a(lIIIlllllIllI[33], lIIIlllllIllI[1]);
                        a.a(lIIIlllllIllI[34], lIIIlllllIllI[1]);
                        int[] nArray3 = new int[lIIIlllllIllI[1]];
                        nArray3[N.lIIIlllllIllI[0]] = lIIIlllllIllI[28];
                        if (N.lIlIIllIIllIIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[lIIIlllllIllI[1]];
                            nArray4[N.lIIIlllllIllI[0]] = lIIIlllllIllI[28];
                            if (N.lIlIIllIIllIIll(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                                int[] nArray5 = new int[lIIIlllllIllI[1]];
                                nArray5[N.lIIIlllllIllI[0]] = lIIIlllllIllI[28];
                                if (N.lIlIIllIIllIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    a.a(lIIIlllllIllI[35], lIIIlllllIllI[1]);
                                }
                            }
                        }
                        a.a(lIIIlllllIllI[17], lIIIlllllIllI[1]);
                        e.l(lIIIlllllIllI[28]);
                        e.l(lIIIlllllIllI[29]);
                        e.l(lIIIlllllIllI[30]);
                        e.l(lIIIlllllIllI[31]);
                        e.l(lIIIlllllIllI[32]);
                        Time.sleepTicks((int)lIIIlllllIllI[1]);
                        0;
                        e.l(lIIIlllllIllI[34]);
                        e.l(lIIIlllllIllI[36]);
                        e.l(lIIIlllllIllI[33]);
                        e.l(lIIIlllllIllI[35]);
                        e.l(lIIIlllllIllI[17]);
                        Time.sleepTicks((int)lIIIlllllIllI[9]);
                        0;
                        if (N.lIlIIllIIllIIll(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)lIIIlllllIllI[20]);
                            0;
                        }
                        if (N.lIlIIllIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                            if (N.lIlIIllIIllIIlI(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllllIllI[37])) {
                                a.a(lIIIlllllIllI[12], lIIIlllllIllI[11]);
                                a.a(lIIIlllllIllI[13], lIIIlllllIllI[11]);
                                a.a(lIIIlllllIllI[21], lIIIlllllIllI[11]);
                                a.a(lIIIlllllIllI[14], lIIIlllllIllI[11]);
                                a.b(f.bk, lIIIlllllIllI[1]);
                                a.a(lIIIlllllIllI[27], lIIIlllllIllI[1]);
                                a.a(lIIIlllllIllI[19], lIIIlllllIllI[18]);
                                a.a(lIIIlllllIllI[23], lIIIlllllIllI[38]);
                            }
                            if (N.lIlIIllIIllIlll(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllllIllI[37])) {
                                a.a(lIIIlllllIllI[12], lIIIlllllIllI[11]);
                                a.a(lIIIlllllIllI[21], lIIIlllllIllI[11]);
                                a.a(lIIIlllllIllI[25], lIIIlllllIllI[11]);
                                a.b(f.bk, lIIIlllllIllI[1]);
                                a.a(lIIIlllllIllI[27], lIIIlllllIllI[1]);
                                a.a(lIIIlllllIllI[19], lIIIlllllIllI[24]);
                                a.a(lIIIlllllIllI[23], lIIIlllllIllI[11]);
                            }
                        }
                    }
                }
            }
            if (N.lIlIIllIIllIIIl(N.S() ? 1 : 0)) {
                String[] stringArray = new String[lIIIlllllIllI[1]];
                stringArray[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[18]];
                if (N.lIlIIllIIllIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIIlllllIllI[1]];
                    stringArray2[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[20]];
                    Inventory.getFirst((String[])stringArray2).interact(lIIIlllllIlIl[lIIIlllllIllI[22]]);
                }
                if (N.lIlIIllIIllIIIl(Inventory.contains((int[])f.ba) ? 1 : 0) && N.lIlIIllIIllIIlI(Movement.getRunEnergy(), lIIIlllllIllI[39])) {
                    Inventory.getFirst((int[])f.ba).interact(lIIIlllllIlIl[lIIIlllllIllI[24]]);
                    Time.sleepTicks((int)lIIIlllllIllI[1]);
                    0;
                }
                if (N.lIlIIllIIllIlIl(Combat.getMissingHealth(), lIIIlllllIllI[40])) {
                    int[] nArray = new int[lIIIlllllIllI[1]];
                    nArray[N.lIIIlllllIllI[0]] = lIIIlllllIllI[23];
                    if (N.lIlIIllIIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[lIIIlllllIllI[1]];
                        nArray6[N.lIIIlllllIllI[0]] = lIIIlllllIllI[23];
                        Inventory.getFirst((int[])nArray6).interact(lIIIlllllIlIl[lIIIlllllIllI[26]]);
                        Time.sleepTicks((int)lIIIlllllIllI[2]);
                        0;
                    }
                }
                if (N.lIlIIllIIllIlIl(Movement.getRunEnergy(), lIIIlllllIllI[41]) && N.lIlIIllIIllIIll(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (N.lIlIIllIIllIIlI(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllllIllI[42])) {
                    N.cF();
                }
                if ((!N.lIlIIllIIllIlll(e.j(lIIIlllllIllI[43]), lIIIlllllIllI[44]) || N.lIlIIllIIllIIlI(e.j(lIIIlllllIllI[45]), lIIIlllllIllI[18])) && N.lIlIIllIIllIlll(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllllIllI[42]) && N.lIlIIllIIllIIlI(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllllIllI[44])) {
                    N.cG();
                }
                if (N.lIlIIllIIllIlll(e.j(lIIIlllllIllI[43]), lIIIlllllIllI[44]) && N.lIlIIllIIllIlll(e.j(lIIIlllllIllI[45]), lIIIlllllIllI[18])) {
                    if (N.lIlIIllIIllIlll(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllllIllI[42]) && N.lIlIIllIIllIIlI(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllllIllI[37])) {
                        N.cG();
                    }
                    if (N.lIlIIllIIllIlll(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllllIllI[37]) && N.lIlIIllIIllIIlI(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllllIllI[44])) {
                        N.cH();
                    }
                }
                if (N.lIlIIllIIllIlll(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllllIllI[44])) {
                    N.cI();
                }
            }
        }
    }

    private static boolean lIlIIllIIllIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIllIIllIlII(Object object) {
        return object != null;
    }
}

