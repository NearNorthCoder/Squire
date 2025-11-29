/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Actor
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
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
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.m;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.z;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class p
implements M {
    private static final /* synthetic */ int eq;
    private static final /* synthetic */ WorldPoint eD;
    static /* synthetic */ String fa;
    private static final /* synthetic */ WorldPoint ez;
    private static final /* synthetic */ int ep;
    private static /* synthetic */ String[] lIIlIIIIIlllI;
    private static final /* synthetic */ int eT;
    private static final /* synthetic */ int eu;
    private static final /* synthetic */ WorldPoint eG;
    public static final /* synthetic */ WorldArea eg;
    private static final /* synthetic */ int em;
    private static final /* synthetic */ WorldPoint ev;
    private static final /* synthetic */ WorldPoint eB;
    private static final /* synthetic */ WorldPoint eE;
    public static final /* synthetic */ WorldArea ed;
    private static final /* synthetic */ int eP;
    private static final /* synthetic */ int eR;
    private static final /* synthetic */ WorldPoint eJ;
    private static final /* synthetic */ WorldArea eN;
    public static final /* synthetic */ WorldArea eh;
    private static final /* synthetic */ int eU;
    private static final /* synthetic */ int eo;
    private static final /* synthetic */ int et;
    private static final /* synthetic */ WorldPoint eC;
    static /* synthetic */ boolean cp;
    private static final /* synthetic */ WorldPoint ex;
    public static final /* synthetic */ WorldArea ec;
    private static final /* synthetic */ WorldArea eL;
    private static final /* synthetic */ int ej;
    public static final /* synthetic */ WorldPoint dZ;
    private static final /* synthetic */ int eX;
    public static /* synthetic */ int eZ;
    private static final /* synthetic */ int en;
    public static final /* synthetic */ WorldArea eb;
    private static final /* synthetic */ int ek;
    public static final /* synthetic */ WorldPoint dY;
    private static final /* synthetic */ WorldArea eM;
    private static /* synthetic */ int[] lIIlIIIIIllll;
    private static final /* synthetic */ WorldPoint eF;
    private static final /* synthetic */ WorldPoint eH;
    public static final /* synthetic */ WorldPoint dX;
    private static final /* synthetic */ int eO;
    static /* synthetic */ String[] dP;
    private static final /* synthetic */ int ei;
    public static /* synthetic */ int eY;
    public static final /* synthetic */ WorldArea ee;
    private static final /* synthetic */ int eQ;
    private static final /* synthetic */ WorldPoint eA;
    public static final /* synthetic */ WorldArea ea;
    public static /* synthetic */ List<d> bA;
    private static final /* synthetic */ int eW;
    private static final /* synthetic */ int eS;
    private static final /* synthetic */ WorldPoint ew;
    private static final /* synthetic */ int er;
    public static final /* synthetic */ WorldArea ef;
    private static final /* synthetic */ WorldPoint eI;
    private static /* synthetic */ int[] fb;
    private static final /* synthetic */ int es;
    static /* synthetic */ int co;
    public static /* synthetic */ boolean by;
    private static final /* synthetic */ WorldPoint eK;
    private static final /* synthetic */ WorldPoint ey;
    private static final /* synthetic */ int el;
    private static final /* synthetic */ int eV;

    private static boolean lIlIIllllIIIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIllllIIllII(Object object) {
        return object != null;
    }

    private static boolean lIlIIllllIIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIlIIllllIIIlIl() {
        lIIlIIIIIllll = new int[175];
        p.lIIlIIIIIllll[0] = 144 + 61 - 52 + 7;
        p.lIIlIIIIIllll[1] = 2;
        p.lIIlIIIIIllll[2] = 222 + 129 - 233 + 108;
        p.lIIlIIIIIllll[3] = 1;
        p.lIIlIIIIIllll[4] = (120 + 130 - 40 + 21 ^ 17 + 112 - 16 + 63) & (116 + 59 - 104 + 145 ^ 39 + 126 - 123 + 101 ^ -1);
        p.lIIlIIIIIllll[5] = -(0xFFFFF1F5 & 0x3E1F) & (0xFFFFBE7F & 0x73BF);
        p.lIIlIIIIIllll[6] = -(0xFFFFE9DB & 0x7E77) & (0xFFFFFAFF & 0x6F7F);
        p.lIIlIIIIIllll[7] = -(0xFFFFFDF7 & 0x2BCA) & (0xFFFFFFEF & 0x2BFF);
        p.lIIlIIIIIllll[8] = 0xFFFF81FF & 0x7F7B;
        p.lIIlIIIIIllll[9] = -(0x95 ^ 0x8A) & (0xFFFF9FDF & 0x67FF);
        p.lIIlIIIIIllll[10] = 0xFFFFBF5F & 0x5FE9;
        p.lIIlIIIIIllll[11] = 30 + 131 - 126 + 115;
        p.lIIlIIIIIllll[12] = 3;
        p.lIIlIIIIIllll[13] = 49 + 63 - 77 + 92 ^ (0xD8 ^ 0xA2);
        p.lIIlIIIIIllll[14] = 135 + 14 - 142 + 134 ^ 28 + 87 - -19 + 5;
        p.lIIlIIIIIllll[15] = 0xC6 ^ 0xC2;
        p.lIIlIIIIIllll[16] = 6 ^ 0x7F ^ (0x9C ^ 0xB5);
        p.lIIlIIIIIllll[17] = 0xFFFF9BEF & 0x6D79;
        p.lIIlIIIIIllll[18] = 0x65 ^ 0x62;
        p.lIIlIIIIIllll[19] = 0xFFFF9B7F & 0x6FB3;
        p.lIIlIIIIIllll[20] = 0x5B ^ 0x53;
        p.lIIlIIIIIllll[21] = 109 + 14 - -30 + 31 ^ 141 + 26 - 118 + 128;
        p.lIIlIIIIIllll[22] = 106 + 102 - 139 + 82 ^ 121 + 51 - 53 + 38;
        p.lIIlIIIIIllll[23] = 151 + 214 - 355 + 219;
        p.lIIlIIIIIllll[24] = 0x73 ^ 0x78;
        p.lIIlIIIIIllll[25] = 0x6D ^ 0x61;
        p.lIIlIIIIIllll[26] = 0x2C ^ 0x21;
        p.lIIlIIIIIllll[27] = 0x19 ^ 0x17;
        p.lIIlIIIIIllll[28] = 0x78 ^ 0x77;
        p.lIIlIIIIIllll[29] = 0x48 ^ 0x58;
        p.lIIlIIIIIllll[30] = 50 + 20 - -76 + 23 ^ 126 + 103 - 130 + 85;
        p.lIIlIIIIIllll[31] = 0x69 ^ 0x7B;
        p.lIIlIIIIIllll[32] = 0x93 ^ 0xBB ^ (0x1C ^ 0x27);
        p.lIIlIIIIIllll[33] = 0x1B ^ 0x2D ^ (0x26 ^ 4);
        p.lIIlIIIIIllll[34] = 0x1B ^ 0xE;
        p.lIIlIIIIIllll[35] = 22 + 64 - -22 + 24 ^ 54 + 77 - 85 + 100;
        p.lIIlIIIIIllll[36] = 25 + 16 - -108 + 21 ^ 122 + 152 - 213 + 128;
        p.lIIlIIIIIllll[37] = 209 + 48 - 122 + 85 ^ 168 + 2 - 76 + 102;
        p.lIIlIIIIIllll[38] = 9 ^ 0x10;
        p.lIIlIIIIIllll[39] = 0xFFFF9D7E & 0x6BEB;
        p.lIIlIIIIIllll[40] = 0x86 ^ 0x9C;
        p.lIIlIIIIIllll[41] = 76 + 24 - -45 + 44 ^ 17 + 151 - 49 + 47;
        p.lIIlIIIIIllll[42] = 0x6D ^ 0x71;
        p.lIIlIIIIIllll[43] = 0x42 ^ 0x5F;
        p.lIIlIIIIIllll[44] = 0x2A ^ 0x34;
        p.lIIlIIIIIllll[45] = 56 + 95 - 150 + 128 ^ 60 + 115 - 111 + 94;
        p.lIIlIIIIIllll[46] = 0x97 ^ 0xB7;
        p.lIIlIIIIIllll[47] = 0x7E ^ 0x5F;
        p.lIIlIIIIIllll[48] = 0x1D ^ 0x3F;
        p.lIIlIIIIIllll[49] = 0x75 ^ 0x56;
        p.lIIlIIIIIllll[50] = 0x50 ^ 0x74;
        p.lIIlIIIIIllll[51] = 59 + 175 - 95 + 52 ^ 56 + 7 - -38 + 53;
        p.lIIlIIIIIllll[52] = 0xCB ^ 0x98 ^ (0x7A ^ 0xF);
        p.lIIlIIIIIllll[53] = 44 + 9 - -49 + 30 ^ 134 + 148 - 213 + 94;
        p.lIIlIIIIIllll[54] = 0x18 ^ 0x30;
        p.lIIlIIIIIllll[55] = 118 + 87 - 131 + 106 ^ 82 + 80 - 152 + 147;
        p.lIIlIIIIIllll[56] = 0x52 ^ 0x78;
        p.lIIlIIIIIllll[57] = 0x4D ^ 0x66;
        p.lIIlIIIIIllll[58] = 0xFFFFBFDF & 0x4B75;
        p.lIIlIIIIIllll[59] = -(0xFFFFF76C & 0x3A9F) & (0xFFFFFFDF & 0x3FAF);
        p.lIIlIIIIIllll[60] = 0xFFFFE9EF & 0x1F7B;
        p.lIIlIIIIIllll[61] = 0x97 ^ 0xBB;
        p.lIIlIIIIIllll[62] = -(0xFFFFFECB & 0x61B7) & (0xFFFFEFFF & 0x7BF7);
        p.lIIlIIIIIllll[63] = 0x8D ^ 0xA0;
        p.lIIlIIIIIllll[64] = 25 + 71 - 66 + 139 ^ 79 + 107 - 121 + 70;
        p.lIIlIIIIIllll[65] = 51 + 108 - 26 + 23 ^ 128 + 134 - 240 + 157;
        p.lIIlIIIIIllll[66] = 0x35 ^ 5;
        p.lIIlIIIIIllll[67] = 60 + 132 - 139 + 94 ^ 122 + 160 - 143 + 23;
        p.lIIlIIIIIllll[68] = 0x8D ^ 0xBF;
        p.lIIlIIIIIllll[69] = 0x52 ^ 0x61;
        p.lIIlIIIIIllll[70] = 0xF1 ^ 0xC5;
        p.lIIlIIIIIllll[71] = 129 + 54 - 146 + 123 ^ 108 + 63 - 92 + 70;
        p.lIIlIIIIIllll[72] = 0x77 ^ 0x41;
        p.lIIlIIIIIllll[73] = 0x9A ^ 0xAD;
        p.lIIlIIIIIllll[74] = 0x27 ^ 0x1C ^ 3;
        p.lIIlIIIIIllll[75] = 0xB6 ^ 0x8F;
        p.lIIlIIIIIllll[76] = 0x36 ^ 0xC;
        p.lIIlIIIIIllll[77] = 0x8E ^ 0xB5;
        p.lIIlIIIIIllll[78] = 0xAB ^ 0x97;
        p.lIIlIIIIIllll[79] = 0x4B ^ 0x76;
        p.lIIlIIIIIllll[80] = 0x8E ^ 0xB0;
        p.lIIlIIIIIllll[81] = 0xF ^ 0x46 ^ (0xC6 ^ 0xB0);
        p.lIIlIIIIIllll[82] = -(0x25 ^ 0x44) & (0xFFFFFFFB & 0xFFF);
        p.lIIlIIIIIllll[83] = 0x48 ^ 7 ^ (0x83 ^ 0x8C);
        p.lIIlIIIIIllll[84] = 0xEC ^ 0xB4 ^ (0xB9 ^ 0xA0);
        p.lIIlIIIIIllll[85] = 56 + 135 - 61 + 65 ^ 18 + 74 - -22 + 15;
        p.lIIlIIIIIllll[86] = 0x6A ^ 0x29;
        p.lIIlIIIIIllll[87] = 0x2E ^ 0x1F ^ (0x76 ^ 3);
        p.lIIlIIIIIllll[88] = 0x45 ^ 0;
        p.lIIlIIIIIllll[89] = 176 + 194 - 339 + 195 ^ 7 + 43 - -54 + 60;
        p.lIIlIIIIIllll[90] = 168 + 169 - 289 + 180 ^ 156 + 119 - 129 + 17;
        p.lIIlIIIIIllll[91] = 0x38 ^ 0x70;
        p.lIIlIIIIIllll[92] = 0x91 ^ 0xB5 ^ (0xDD ^ 0xB0);
        p.lIIlIIIIIllll[93] = 0xFFFFFFE7 & 0xB79;
        p.lIIlIIIIIllll[94] = 0xFFFFBF9F & 0x4DEA;
        p.lIIlIIIIIllll[95] = 140 + 143 - 260 + 169 ^ 131 + 74 - 93 + 26;
        p.lIIlIIIIIllll[96] = 0x22 ^ 0x69;
        p.lIIlIIIIIllll[97] = 0x33 ^ 0x7F;
        p.lIIlIIIIIllll[98] = 3 ^ 0x4E;
        p.lIIlIIIIIllll[99] = -(0x1E ^ 0xB) & (0xFFFFFF9E & 0x13FD);
        p.lIIlIIIIIllll[100] = 0xC7 ^ 0x89;
        p.lIIlIIIIIllll[101] = 0xFFFFAFEF & 0x53F8;
        p.lIIlIIIIIllll[102] = 0xA ^ 0x45;
        p.lIIlIIIIIllll[103] = 0x39 ^ 0x68;
        p.lIIlIIIIIllll[104] = 0x73 ^ 0xB ^ (0x6B ^ 0x41);
        p.lIIlIIIIIllll[105] = -(102 + 133 - 201 + 119) & (0xFFFFFFDF & 0x1FFF);
        p.lIIlIIIIIllll[106] = 0x51 ^ 0x69 ^ (0x2D ^ 0x46);
        p.lIIlIIIIIllll[107] = -(0xFFFFA61F & 0x7FEB) & (0xFFFFEFFF & 0x37FE);
        p.lIIlIIIIIllll[108] = -(0xFFFFD9CF & 0x6E3B) & (0xFFFFFF7B & 0x79DF);
        p.lIIlIIIIIllll[109] = 0x24 ^ 0x40;
        p.lIIlIIIIIllll[110] = 0xFFFFC5BD & 0x3BD2;
        p.lIIlIIIIIllll[111] = -(0xFFFFDE1F & 0x65EA) & (0xFFFFD7FF & Short.MAX_VALUE);
        p.lIIlIIIIIllll[112] = 0xFFFFBEDD & 0x6FEE;
        p.lIIlIIIIIllll[113] = 0xFFFFF7F9 & 0x4A6E;
        p.lIIlIIIIIllll[114] = -(0xFFFFB2BB & 0x7D56) & (0xFFFFBF7D & 0x77FF);
        p.lIIlIIIIIllll[115] = -(0xFFFFBA77 & 0x7DAD) & (0xFFFFFFFE & 0x3FF5);
        p.lIIlIIIIIllll[116] = 0xEB ^ 0xBF;
        p.lIIlIIIIIllll[117] = 0x97 ^ 0xA0 ^ (0x7E ^ 0x1C);
        p.lIIlIIIIIllll[118] = -(0xFFFFFE7B & 0x1985) & (0xFFFFFDFF & 0x1FBE);
        p.lIIlIIIIIllll[119] = -(0xFFFF8FAE & 0x787F) & (0xFFFFEDEF & 0x1FFF);
        p.lIIlIIIIIllll[120] = -(0xFFFFAEBF & 0x7354) & (0xFFFFE7F7 & 0x3FDF);
        p.lIIlIIIIIllll[121] = -(0xFFFFCFD7 & 0x74EE) & (0xFFFFC6FF & 0x7FEF);
        p.lIIlIIIIIllll[122] = -(0xFFFFEBA9 & 0x7E5F) & (0xFFFFEFF8 & 0x7FCF);
        p.lIIlIIIIIllll[123] = -(0xFFFFFFDD & 0x70B3) & (0xFFFFFBF4 & Short.MAX_VALUE);
        p.lIIlIIIIIllll[124] = 0xFFFFCDDF & 0x3FA8;
        p.lIIlIIIIIllll[125] = 0xFFFFFF7F & 0xBE7;
        p.lIIlIIIIIllll[126] = 0xFFFF8F54 & 0x7BFF;
        p.lIIlIIIIIllll[127] = -(0xFFFF937D & 0x7EFF) & (0xFFFFFFFF & 0x1FFF);
        p.lIIlIIIIIllll[128] = 0xFFFFEFFF & 0x1B63;
        p.lIIlIIIIIllll[129] = -(0xFFFFF577 & 0x3A89) & (0xFFFFFBF6 & 0x3F7B);
        p.lIIlIIIIIllll[130] = -(0xFFFFF2E7 & 0x7D79) & (0xFFFFFDE3 & 0x7FFE);
        p.lIIlIIIIIllll[131] = 0xFFFFBFF7 & 0x4B5E;
        p.lIIlIIIIIllll[132] = 0xFFFF9D9D & 0x6FE7;
        p.lIIlIIIIIllll[133] = -(0xFFFF99D3 & 0x76BF) & (0xFFFFBFF7 & 0x5BFF);
        p.lIIlIIIIIllll[134] = -(0xFFFFD252 & 0x3DBF) & (0xFFFFBBFB & 0x5F75);
        p.lIIlIIIIIllll[135] = -(0xA8 ^ 0xB9) & (0xFFFFCFBF & 0x3DD7);
        p.lIIlIIIIIllll[136] = 0xFFFFBBDF & 0x4F77;
        p.lIIlIIIIIllll[137] = -(0xFFFFB08F & 0x7FFB) & (0xFFFFFFFB & 0x3BFF);
        p.lIIlIIIIIllll[138] = -(0xFFFFD7DD & 0x7BEB) & (0xFFFFFFFB & 0x5FEC);
        p.lIIlIIIIIllll[139] = 0xFFFFAE7B & 0x5DDF;
        p.lIIlIIIIIllll[140] = -(0xFFFFFA6B & 0x6595) & (0xFFFFEB7F & 0x7FEF);
        p.lIIlIIIIIllll[141] = 0xFFFFBF7F & 0x4DFF;
        p.lIIlIIIIIllll[142] = -(0xFFFFF777 & 0x5C8F) & (0xFFFFFF7E & 0x5FFF);
        p.lIIlIIIIIllll[143] = 0xFFFFDBFE & 0x2F97;
        p.lIIlIIIIIllll[144] = -(0xFFFFDB9F & 0x266B) & (0xFFFFEF3F & 0x1FFF);
        p.lIIlIIIIIllll[145] = 0xFFFF9BF3 & 0x6F5F;
        p.lIIlIIIIIllll[146] = -(0xFFFFEFF9 & 0x702F) & (0xFFFFFDFF & 0x6FB9);
        p.lIIlIIIIIllll[147] = 0xFFFFEBF9 & 0x1F5F;
        p.lIIlIIIIIllll[148] = 0xFFFFCDB3 & 0x3FDF;
        p.lIIlIIIIIllll[149] = -(0xFFFFF1F7 & 0x3E89) & (0xFFFFFBFF & 0x3FDA);
        p.lIIlIIIIIllll[150] = 0xFFFFA6DD & 0x7FB6;
        p.lIIlIIIIIllll[151] = 0xFFFFE7BF & 0x3ED2;
        p.lIIlIIIIIllll[152] = -(0x28 ^ 0x21) & (0xFFFFAFFF & 0x7699);
        p.lIIlIIIIIllll[153] = 0xFFFFBFDF & 0x4DA9;
        p.lIIlIIIIIllll[154] = 0xFFFFFF5F & 0xBFF;
        p.lIIlIIIIIllll[155] = -(0xFFFFBE7B & 0x53F5) & (0xFFFFFFFF & 0x1FFD);
        p.lIIlIIIIIllll[156] = 0xFFFFEF5F & 0x1BFB;
        p.lIIlIIIIIllll[157] = 0xFFFFDFB7 & 0x2DDC;
        p.lIIlIIIIIllll[158] = -(0xFFFFFF51 & 0x1AF) & (0xFFFFE7EF & 0x3F9E);
        p.lIIlIIIIIllll[159] = -(0xFFFFEC39 & 0x73C7) & (0xFFFFEFDF & 0x7B7D);
        p.lIIlIIIIIllll[160] = 0xFFFFA79D & 0x7EF7;
        p.lIIlIIIIIllll[161] = -(0xFFFFEFD5 & 0x117F) & (0xFFFFBFD7 & 0x7D7F);
        p.lIIlIIIIIllll[162] = 0xFFFFDF83 & 0x347F;
        p.lIIlIIIIIllll[163] = 0xD ^ 0x5B;
        p.lIIlIIIIIllll[164] = 0xDA ^ 0x83 ^ (0x63 ^ 0x6D);
        p.lIIlIIIIIllll[165] = 0x1F ^ 0x47;
        p.lIIlIIIIIllll[166] = 0x85 ^ 0xC1 ^ (0x1F ^ 2);
        p.lIIlIIIIIllll[167] = 0x2E ^ 0x4E ^ (0xBC ^ 0x86);
        p.lIIlIIIIIllll[168] = 0x76 ^ 0xA ^ (0x7C ^ 0x5B);
        p.lIIlIIIIIllll[169] = 0x55 ^ 0x7F ^ (0x3E ^ 0x48);
        p.lIIlIIIIIllll[170] = -(0xFFFFF63F & 0x79E2) & (0xFFFFFFBF & 0x7FFD);
        p.lIIlIIIIIllll[171] = -(0xA8 ^ 0x8B) & (0xFFFFFFFF & 0xFBF);
        p.lIIlIIIIIllll[172] = -(0xFFFFF3D5 & 0x7C6B) & (0xFFFFFFDF & 0x7FFE);
        p.lIIlIIIIIllll[173] = 0xFFFFCFBF & 0x3FDF;
        p.lIIlIIIIIllll[174] = 0xD8 ^ 0x85;
    }

    /*
     * WARNING - void declaration
     */
    private static void aR() {
        block30: {
            block34: {
                block32: {
                    block33: {
                        block31: {
                            void var21;
                            BankLocation bankLocation = BankLocation.getNearest();
                            if (p.lIlIIllllIIllII(bankLocation) && p.lIlIIllllIIlIIl(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[97]];
                                a.a(bankLocation);
                            }
                            if (!p.lIlIIllllIIllII(var21) || !p.lIlIIllllIIlIII(var21.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block30;
                            if (p.lIlIIllllIIlIIl(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[98]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIIIIllll[99]);
                                0;
                            }
                            if (!p.lIlIIllllIIlIII(Bank.isOpen() ? 1 : 0)) break block30;
                            AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[100]];
                            if (p.lIlIIllllIIllll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIlIIIIIllll[12]);
                                0;
                            }
                            if (p.lIlIIllllIIllll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIlIIIIIllll[1]);
                                0;
                            }
                            while (p.lIlIIllllIIlIIl(m.av() ? 1 : 0) && p.lIlIIllllIIlIIl(AccBuilderRat.d ? 1 : 0)) {
                                m.at();
                                Time.sleepTicks((int)lIIlIIIIIllll[3]);
                                0;
                                0;
                                if (-1 <= 2) continue;
                                return;
                            }
                            int[] nArray = new int[lIIlIIIIIllll[3]];
                            nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[7];
                            if (p.lIlIIllllIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIIlIIIIIllll[3]];
                                nArray2[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[7];
                                if (p.lIlIIllllIIIllI(Bank.getFirst((int[])nArray2).getQuantity(), lIIlIIIIIllll[101])) {
                                    p.W();
                                    System.out.println(lIIlIIIIIlllI[lIIlIIIIIllll[102]]);
                                    by = lIIlIIIIIllll[3];
                                    return;
                                }
                            }
                            int[] nArray3 = new int[lIIlIIIIIllll[3]];
                            nArray3[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[6];
                            if (p.lIlIIllllIIlIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIIlIIIIIllll[3]];
                                nArray4[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[6];
                                if (p.lIlIIllllIIIllI(Bank.getFirst((int[])nArray4).getQuantity(), lIIlIIIIIllll[101])) {
                                    p.W();
                                    System.out.println(lIIlIIIIIlllI[lIIlIIIIIllll[16]]);
                                    by = lIIlIIIIIllll[3];
                                    return;
                                }
                            }
                            int[] nArray5 = new int[lIIlIIIIIllll[3]];
                            nArray5[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[5];
                            if (p.lIlIIllllIIlIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIIlIIIIIllll[3]];
                                nArray6[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[5];
                                if (p.lIlIIllllIIIllI(Bank.getFirst((int[])nArray6).getQuantity(), lIIlIIIIIllll[101])) {
                                    p.W();
                                    System.out.println(lIIlIIIIIlllI[lIIlIIIIIllll[103]]);
                                    by = lIIlIIIIIllll[3];
                                    return;
                                }
                            }
                            int[] nArray7 = new int[lIIlIIIIIllll[3]];
                            nArray7[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                            if (!p.lIlIIllllIIlIII(Bank.contains((int[])nArray7) ? 1 : 0)) break block31;
                            int[] nArray8 = new int[lIIlIIIIIllll[3]];
                            nArray8[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                            if (!p.lIlIIllllIIlllI(Bank.getFirst((int[])nArray8).getQuantity(), lIIlIIIIIllll[22])) break block32;
                        }
                        int[] nArray = new int[lIIlIIIIIllll[3]];
                        nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[9];
                        if (!p.lIlIIllllIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                        int[] nArray9 = new int[lIIlIIIIIllll[3]];
                        nArray9[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[9];
                        if (!p.lIlIIllllIIlllI(Bank.getFirst((int[])nArray9).getQuantity(), lIIlIIIIIllll[13])) break block32;
                    }
                    int[] nArray = new int[lIIlIIIIIllll[3]];
                    nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                    if (!p.lIlIIllllIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                    int[] nArray10 = new int[lIIlIIIIIllll[3]];
                    nArray10[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                    if (!p.lIlIIllllIIIllI(Bank.getFirst((int[])nArray10).getQuantity(), lIIlIIIIIllll[33])) break block34;
                }
                p.W();
                System.out.println(lIIlIIIIIlllI[lIIlIIIIIllll[104]]);
                by = lIIlIIIIIllll[3];
                return;
            }
            int[] nArray = new int[lIIlIIIIIllll[18]];
            nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[105];
            nArray[p.lIIlIIIIIllll[3]] = lIIlIIIIIllll[10];
            nArray[p.lIIlIIIIIllll[1]] = lIIlIIIIIllll[9];
            nArray[p.lIIlIIIIIllll[12]] = lIIlIIIIIllll[8];
            nArray[p.lIIlIIIIIllll[15]] = lIIlIIIIIllll[7];
            nArray[p.lIIlIIIIIllll[13]] = lIIlIIIIIllll[5];
            nArray[p.lIIlIIIIIllll[14]] = lIIlIIIIIllll[6];
            if (p.lIlIIllllIIlIIl(e.b(nArray) ? 1 : 0)) {
                p.W();
                System.out.println(lIIlIIIIIlllI[lIIlIIIIIllll[106]]);
                by = lIIlIIIIIllll[3];
                return;
            }
            if (p.lIlIIllllIIlIIl(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepTicks((int)lIIlIIIIIllll[15]);
                0;
            }
            int[] nArray11 = new int[lIIlIIIIIllll[3]];
            nArray11[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
            if (p.lIlIIllllIIlIII(Bank.contains((int[])nArray11) ? 1 : 0)) {
                int[] nArray12 = new int[lIIlIIIIIllll[3]];
                nArray12[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                if (p.lIlIIllllIIIllI(Inventory.getCount((int[])nArray12), lIIlIIIIIllll[3])) {
                    Bank.withdraw((int)lIIlIIIIIllll[10], (int)lIIlIIIIIllll[13], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIIIIIllll[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIlIIIIIllll[3]];
                        nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                        if (p.lIlIIllllIIllll(Inventory.getCount((int[])nArray))) {
                            bl = lIIlIIIIIllll[3];
                            0;
                            if (-1 >= 0) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIIIIllll[4];
                        }
                        return bl;
                    }, (int)lIIlIIIIIllll[99]);
                    0;
                }
            }
            int[] nArray13 = new int[lIIlIIIIIllll[3]];
            nArray13[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[9];
            if (p.lIlIIllllIIlIII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                int[] nArray14 = new int[lIIlIIIIIllll[3]];
                nArray14[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[9];
                if (p.lIlIIllllIIIllI(Inventory.getCount((int[])nArray14), lIIlIIIIIllll[3])) {
                    Bank.withdraw((int)lIIlIIIIIllll[9], (int)lIIlIIIIIllll[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIIIIIllll[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIlIIIIIllll[3]];
                        nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[9];
                        if (p.lIlIIllllIIllll(Inventory.getCount((int[])nArray))) {
                            bl = lIIlIIIIIllll[3];
                            0;
                            if (((0x71 ^ 0x51) & ~(0x82 ^ 0xA2)) > 0) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIIIIllll[4];
                        }
                        return bl;
                    }, (int)lIIlIIIIIllll[99]);
                    0;
                }
            }
            int[] nArray15 = new int[lIIlIIIIIllll[3]];
            nArray15[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[7];
            if (p.lIlIIllllIIlIII(Bank.contains((int[])nArray15) ? 1 : 0)) {
                int[] nArray16 = new int[lIIlIIIIIllll[3]];
                nArray16[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[7];
                if (p.lIlIIllllIIIllI(Inventory.getCount((int[])nArray16), lIIlIIIIIllll[3])) {
                    Bank.withdraw((int)lIIlIIIIIllll[7], (int)lIIlIIIIIllll[107], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIIIIIllll[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIlIIIIIllll[3]];
                        nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[7];
                        if (p.lIlIIllllIIllll(Inventory.getCount((int[])nArray))) {
                            bl = lIIlIIIIIllll[3];
                            0;
                            
                            }
                        } else {
                            bl = lIIlIIIIIllll[4];
                        }
                        return bl;
                    }, (int)lIIlIIIIIllll[99]);
                    0;
                }
            }
            int[] nArray17 = new int[lIIlIIIIIllll[3]];
            nArray17[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[5];
            if (p.lIlIIllllIIlIII(Bank.contains((int[])nArray17) ? 1 : 0)) {
                int[] nArray18 = new int[lIIlIIIIIllll[3]];
                nArray18[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[5];
                if (p.lIlIIllllIIIllI(Inventory.getCount((int[])nArray18), lIIlIIIIIllll[3])) {
                    Bank.withdraw((int)lIIlIIIIIllll[5], (int)lIIlIIIIIllll[107], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIIIIIllll[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIlIIIIIllll[3]];
                        nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[5];
                        if (p.lIlIIllllIIllll(Inventory.getCount((int[])nArray))) {
                            bl = lIIlIIIIIllll[3];
                            0;
                            if (-1 > ((7 ^ 3) & ~(0x3D ^ 0x39))) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIIIIllll[4];
                        }
                        return bl;
                    }, (int)lIIlIIIIIllll[99]);
                    0;
                }
            }
            int[] nArray19 = new int[lIIlIIIIIllll[3]];
            nArray19[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[6];
            if (p.lIlIIllllIIlIII(Bank.contains((int[])nArray19) ? 1 : 0)) {
                int[] nArray20 = new int[lIIlIIIIIllll[3]];
                nArray20[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[6];
                if (p.lIlIIllllIIIllI(Inventory.getCount((int[])nArray20), lIIlIIIIIllll[3])) {
                    Bank.withdraw((int)lIIlIIIIIllll[6], (int)lIIlIIIIIllll[107], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIIIIIllll[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIlIIIIIllll[3]];
                        nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[6];
                        if (p.lIlIIllllIIllll(Inventory.getCount((int[])nArray))) {
                            bl = lIIlIIIIIllll[3];
                            0;
                            if (2 <= 1) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIIIIllll[4];
                        }
                        return bl;
                    }, (int)lIIlIIIIIllll[99]);
                    0;
                }
            }
            int[] nArray21 = new int[lIIlIIIIIllll[3]];
            nArray21[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[108];
            if (p.lIlIIllllIIlIII(Bank.contains((int[])nArray21) ? 1 : 0)) {
                int[] nArray22 = new int[lIIlIIIIIllll[3]];
                nArray22[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[108];
                if (p.lIlIIllllIIlIIl(Inventory.contains((int[])nArray22) ? 1 : 0)) {
                    Bank.withdraw((int)lIIlIIIIIllll[108], (int)lIIlIIIIIllll[3], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIIIIIllll[3]);
                    0;
                    Time.sleepUntil(() -> {
                        int[] nArray = new int[lIIlIIIIIllll[3]];
                        nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[108];
                        return Inventory.contains((int[])nArray);
                    }, (int)lIIlIIIIIllll[99]);
                    0;
                }
            }
            int[] nArray23 = new int[lIIlIIIIIllll[3]];
            nArray23[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
            if (p.lIlIIllllIIlIII(Bank.contains((int[])nArray23) ? 1 : 0)) {
                int[] nArray24 = new int[lIIlIIIIIllll[3]];
                nArray24[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                if (p.lIlIIllllIIIllI(Inventory.getCount((int[])nArray24), lIIlIIIIIllll[3])) {
                    Bank.withdrawAll((int)lIIlIIIIIllll[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIIIIIllll[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIlIIIIIllll[3]];
                        nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                        if (p.lIlIIllllIIllll(Inventory.getCount((int[])nArray))) {
                            bl = lIIlIIIIIllll[3];
                            0;
                            if (3 > 3) {
                                return ((0x6F ^ 0x55 ^ (0x7C ^ 0x7A) & ~(0x6F ^ 0x69)) & (0xBE ^ 0x99 ^ (0x3E ^ 0x23) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIlIIIIIllll[4];
                        }
                        return bl;
                    }, (int)lIIlIIIIIllll[99]);
                    0;
                }
            }
        }
    }

    public static void aP() {
        TileObject llllllllllllllIlllllllIlIIIlIIII2;
        block91: {
            block93: {
                block92: {
                    block89: {
                        block90: {
                            Widget var20;
                            if (p.lIlIIllllIIIllI(e.j(lIIlIIIIIllll[0]), lIIlIIIIIllll[1])) {
                                try {
                                    z.bD();
                                    0;
                                }
                                catch (Exception llllllllllllllIlllllllIlIIIlIIII2) {
                                    llllllllllllllIlllllllIlIIIlIIII2.printStackTrace();
                                }
                                if (-1 > -1) {
                                    return;
                                }
                            }
                            if (p.lIlIIllllIIIlll(e.j(lIIlIIIIIllll[0]), lIIlIIIIIllll[1]) && p.lIlIIllllIIIllI(e.j(lIIlIIIIIllll[2]), lIIlIIIIIllll[3])) {
                                block88: {
                                    if (p.lIlIIllllIIlIII(by ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[4]];
                                        b.a(bA);
                                        if (p.lIlIIllllIIIllI(bA.size(), lIIlIIIIIllll[3])) {
                                            System.out.println(lIIlIIIIIlllI[lIIlIIIIIllll[3]]);
                                            by = lIIlIIIIIllll[4];
                                        }
                                    }
                                    do {
                                        if (p.lIlIIllllIIlIII(m.av() ? 1 : 0)) {
                                            int[] nArray = new int[lIIlIIIIIllll[3]];
                                            nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[5];
                                            if (p.lIlIIllllIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                int[] nArray2 = new int[lIIlIIIIIllll[3]];
                                                nArray2[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[6];
                                                if (p.lIlIIllllIIlIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                                                    int[] nArray3 = new int[lIIlIIIIIllll[3]];
                                                    nArray3[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[7];
                                                    if (p.lIlIIllllIIlIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                                        int[] nArray4 = new int[lIIlIIIIIllll[3]];
                                                        nArray4[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                                                        if (p.lIlIIllllIIlIII(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                                                            int[] nArray5 = new int[lIIlIIIIIllll[3]];
                                                            nArray5[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[9];
                                                            if (p.lIlIIllllIIlIII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                                                int[] nArray6 = new int[lIIlIIIIIllll[3]];
                                                                nArray6[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                                                                if (!p.lIlIIllllIIlIIl(Inventory.contains((int[])nArray6) ? 1 : 0)) break block88;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (!p.lIlIIllllIIlIIl(AccBuilderRat.d ? 1 : 0)) break block88;
                                        p.aR();
                                        Time.sleepTicks((int)lIIlIIIIIllll[3]);
                                        0;
                                        0;
                                    } while (((0x30 ^ 6) & ~(0xAA ^ 0x9C)) == 0);
                                    return;
                                }
                                if (p.lIlIIllllIIlIIl(by ? 1 : 0)) {
                                    if (p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(ew), lIIlIIIIIllll[11])) {
                                        int[] nArray = new int[lIIlIIIIIllll[3]];
                                        nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                                        if (p.lIlIIllllIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                            AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[1]];
                                            int[] nArray7 = new int[lIIlIIIIIllll[3]];
                                            nArray7[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                                            Inventory.getFirst((int[])nArray7).interact(lIIlIIIIIlllI[lIIlIIIIIllll[12]]);
                                            Time.sleepTicks((int)lIIlIIIIIllll[13]);
                                            0;
                                        }
                                    }
                                    if (p.lIlIIllllIIIllI(Players.getLocal().getWorldLocation().distanceTo(ew), lIIlIIIIIllll[11]) && p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(ew), lIIlIIIIIllll[14])) {
                                        AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[15]];
                                        if (p.lIlIIllllIIlIII(Inventory.contains((int[])f.ba) ? 1 : 0) && p.lIlIIllllIIIllI(Movement.getRunEnergy(), lIIlIIIIIllll[16])) {
                                            Inventory.getFirst((int[])f.ba).interact(lIIlIIIIIlllI[lIIlIIIIIllll[13]]);
                                            Time.sleepTicks((int)lIIlIIIIIllll[3]);
                                            0;
                                        }
                                        Movement.walkTo((WorldPoint)ew);
                                        0;
                                        Time.sleepTicks((int)lIIlIIIIIllll[3]);
                                        0;
                                    }
                                    if (p.lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(ew), lIIlIIIIIllll[14])) {
                                        g.a(lIIlIIIIIlllI[lIIlIIIIIllll[14]], dP);
                                    }
                                }
                            }
                            if (p.lIlIIllllIIIlll(e.j(lIIlIIIIIllll[0]), lIIlIIIIIllll[1]) && p.lIlIIllllIIIlll(e.j(lIIlIIIIIllll[2]), lIIlIIIIIllll[3])) {
                                if (p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(ez), lIIlIIIIIllll[15]) && p.lIlIIllllIIlIIl(eM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    int[] nArray = new int[lIIlIIIIIllll[3]];
                                    nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[17];
                                    if (p.lIlIIllllIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[18]];
                                        Movement.walkTo((WorldPoint)ez);
                                        0;
                                        Time.sleepTicks((int)lIIlIIIIIllll[3]);
                                        0;
                                    }
                                }
                                if (p.lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(ez), lIIlIIIIIllll[15]) && p.lIlIIllllIIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                                    int[] nArray = new int[lIIlIIIIIllll[3]];
                                    nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[17];
                                    if (p.lIlIIllllIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                        int[] nArray8 = new int[lIIlIIIIIllll[3]];
                                        nArray8[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[19];
                                        llllllllllllllIlllllllIlIIIlIIII2 = TileObjects.getNearest((int[])nArray8);
                                        if (p.lIlIIllllIIlIII(Inventory.isFull() ? 1 : 0)) {
                                            int[] nArray9 = new int[lIIlIIIIIllll[3]];
                                            nArray9[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                                            Inventory.getFirst((int[])nArray9).interact(lIIlIIIIIlllI[lIIlIIIIIllll[20]]);
                                            Time.sleepTicks((int)lIIlIIIIIllll[3]);
                                            0;
                                        }
                                        if (p.lIlIIllllIIlIIl(Inventory.isFull() ? 1 : 0)) {
                                            if (p.lIlIIllllIIllII(llllllllllllllIlllllllIlIIIlIIII2) && p.lIlIIllllIIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                                AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[21]];
                                                llllllllllllllIlllllllIlIIIlIIII2.interact(lIIlIIIIIlllI[lIIlIIIIIllll[22]]);
                                                Dialog.continueSpace();
                                            }
                                            if (p.lIlIIllllIIllII(var20 = Widgets.get((int)lIIlIIIIIllll[23], (int)lIIlIIIIIllll[3]))) {
                                                var20.interact(lIIlIIIIIlllI[lIIlIIIIIllll[24]]);
                                                var20.interact(lIIlIIIIIllll[4]);
                                                var20.interact(lIIlIIIIIlllI[lIIlIIIIIllll[25]]);
                                                Keyboard.type((String)lIIlIIIIIlllI[lIIlIIIIIllll[26]]);
                                            }
                                        }
                                    }
                                }
                                if (p.lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(ez), lIIlIIIIIllll[15])) {
                                    int[] nArray = new int[lIIlIIIIIllll[3]];
                                    nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[17];
                                    if (p.lIlIIllllIIlIII(Inventory.contains((int[])nArray) ? 1 : 0) && p.lIlIIllllIIlIIl(eL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[27]];
                                        Movement.walkTo((WorldPoint)eD);
                                        0;
                                        Time.sleepTicks((int)lIIlIIIIIllll[3]);
                                        0;
                                    }
                                }
                                if (p.lIlIIllllIIlIII(eM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[28]];
                                    if (p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(eD), lIIlIIIIIllll[3])) {
                                        Movement.walkTo((WorldPoint)eD);
                                        0;
                                        Time.sleepTicks((int)lIIlIIIIIllll[3]);
                                        0;
                                    }
                                    if (p.lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(eD), lIIlIIIIIllll[3])) {
                                        String[] stringArray = new String[lIIlIIIIIllll[3]];
                                        stringArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[29]];
                                        llllllllllllllIlllllllIlIIIlIIII2 = TileObjects.getNearest((String[])stringArray);
                                        AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[30]];
                                        if (p.lIlIIllllIIlIII(Inventory.isFull() ? 1 : 0)) {
                                            int[] nArray = new int[lIIlIIIIIllll[3]];
                                            nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                                            Inventory.getFirst((int[])nArray).interact(lIIlIIIIIlllI[lIIlIIIIIllll[31]]);
                                            Time.sleepTicks((int)lIIlIIIIIllll[3]);
                                            0;
                                        }
                                        if (p.lIlIIllllIIllII(llllllllllllllIlllllllIlIIIlIIII2)) {
                                            String[] stringArray2 = new String[lIIlIIIIIllll[3]];
                                            stringArray2[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[32]];
                                            if (p.lIlIIllllIIlIII(llllllllllllllIlllllllIlIIIlIIII2.hasAction(stringArray2) ? 1 : 0)) {
                                                llllllllllllllIlllllllIlIIIlIIII2.interact(lIIlIIIIIlllI[lIIlIIIIIllll[33]]);
                                                Time.sleepTicks((int)lIIlIIIIIllll[1]);
                                                0;
                                            }
                                            String[] stringArray3 = new String[lIIlIIIIIllll[3]];
                                            stringArray3[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[34]];
                                            if (p.lIlIIllllIIlIII(llllllllllllllIlllllllIlIIIlIIII2.hasAction(stringArray3) ? 1 : 0)) {
                                                llllllllllllllIlllllllIlIIIlIIII2.interact(lIIlIIIIIlllI[lIIlIIIIIllll[35]]);
                                                Time.sleepTicks((int)lIIlIIIIIllll[1]);
                                                0;
                                                var20 = Widgets.get((int)lIIlIIIIIllll[23], (int)lIIlIIIIIllll[3]);
                                                if (p.lIlIIllllIIllII(var20)) {
                                                    var20.interact(lIIlIIIIIlllI[lIIlIIIIIllll[36]]);
                                                    var20.interact(lIIlIIIIIllll[4]);
                                                    var20.interact(lIIlIIIIIlllI[lIIlIIIIIllll[37]]);
                                                    Keyboard.type((String)lIIlIIIIIlllI[lIIlIIIIIllll[38]]);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (p.lIlIIllllIIIlll(e.j(lIIlIIIIIllll[0]), lIIlIIIIIllll[1]) && p.lIlIIllllIIIlll(e.j(lIIlIIIIIllll[2]), lIIlIIIIIllll[1])) {
                                co = lIIlIIIIIllll[4];
                                if (p.lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(ew), lIIlIIIIIllll[22])) {
                                    while (p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(ez), lIIlIIIIIllll[1]) && p.lIlIIllllIIlIIl(AccBuilderRat.d ? 1 : 0)) {
                                        Movement.walkTo((WorldPoint)ez);
                                        0;
                                        Time.sleepTicks((int)lIIlIIIIIllll[3]);
                                        0;
                                        0;
                                        if (-3 <= 0) continue;
                                        return;
                                    }
                                }
                                int[] nArray = new int[lIIlIIIIIllll[3]];
                                nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[39];
                                if (p.lIlIIllllIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0) && p.lIlIIllllIIlIII(eM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[40]];
                                    if (p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(eD), lIIlIIIIIllll[3])) {
                                        Movement.walkTo((WorldPoint)eD);
                                        0;
                                        Time.sleepTicks((int)lIIlIIIIIllll[3]);
                                        0;
                                    }
                                    if (p.lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(eD), lIIlIIIIIllll[3])) {
                                        String[] stringArray = new String[lIIlIIIIIllll[3]];
                                        stringArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[41]];
                                        llllllllllllllIlllllllIlIIIlIIII2 = TileObjects.getNearest((String[])stringArray);
                                        AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[42]];
                                        if (p.lIlIIllllIIllII(llllllllllllllIlllllllIlIIIlIIII2)) {
                                            String[] stringArray4 = new String[lIIlIIIIIllll[3]];
                                            stringArray4[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[43]];
                                            if (p.lIlIIllllIIlIII(llllllllllllllIlllllllIlIIIlIIII2.hasAction(stringArray4) ? 1 : 0)) {
                                                llllllllllllllIlllllllIlIIIlIIII2.interact(lIIlIIIIIlllI[lIIlIIIIIllll[44]]);
                                                Time.sleepTicks((int)lIIlIIIIIllll[1]);
                                                0;
                                            }
                                            String[] stringArray5 = new String[lIIlIIIIIllll[3]];
                                            stringArray5[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[45]];
                                            if (p.lIlIIllllIIlIII(llllllllllllllIlllllllIlIIIlIIII2.hasAction(stringArray5) ? 1 : 0)) {
                                                llllllllllllllIlllllllIlIIIlIIII2.interact(lIIlIIIIIlllI[lIIlIIIIIllll[46]]);
                                                Time.sleepTicks((int)lIIlIIIIIllll[1]);
                                                0;
                                                var20 = Widgets.get((int)lIIlIIIIIllll[23], (int)lIIlIIIIIllll[3]);
                                                if (p.lIlIIllllIIllII(var20)) {
                                                    var20.interact(lIIlIIIIIlllI[lIIlIIIIIllll[47]]);
                                                    var20.interact(lIIlIIIIIllll[4]);
                                                    var20.interact(lIIlIIIIIlllI[lIIlIIIIIllll[48]]);
                                                    Keyboard.type((String)lIIlIIIIIlllI[lIIlIIIIIllll[49]]);
                                                }
                                            }
                                        }
                                    }
                                }
                                int[] nArray10 = new int[lIIlIIIIIllll[3]];
                                nArray10[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[39];
                                if (p.lIlIIllllIIlIII(Inventory.contains((int[])nArray10) ? 1 : 0) && p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(eA), lIIlIIIIIllll[3])) {
                                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[50]];
                                    Movement.walkTo((WorldPoint)eA);
                                    0;
                                    Time.sleepTicks((int)lIIlIIIIIllll[3]);
                                    0;
                                }
                                if (p.lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(eA), lIIlIIIIIllll[1])) {
                                    String[] stringArray = new String[lIIlIIIIIllll[3]];
                                    stringArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[51]];
                                    llllllllllllllIlllllllIlIIIlIIII2 = TileObjects.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[lIIlIIIIIllll[3]];
                                    stringArray6[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[52]];
                                    var20 = NPCs.getNearest((String[])stringArray6);
                                    if (p.lIlIIllllIIllII(llllllllllllllIlllllllIlIIIlIIII2) && p.lIlIIllllIIllIl(var20)) {
                                        AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[53]];
                                        String[] stringArray7 = new String[lIIlIIIIIllll[3]];
                                        stringArray7[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[54]];
                                        if (p.lIlIIllllIIlIII(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                                            String[] stringArray8 = new String[lIIlIIIIIllll[3]];
                                            stringArray8[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[55]];
                                            Inventory.getFirst((String[])stringArray8).useOn(llllllllllllllIlllllllIlIIIlIIII2);
                                        }
                                        Time.sleepTicks((int)lIIlIIIIIllll[3]);
                                        0;
                                    }
                                    if (p.lIlIIllllIIllII(var20)) {
                                        AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[56]];
                                        int[] nArray11 = new int[lIIlIIIIIllll[3]];
                                        nArray11[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[39];
                                        if (p.lIlIIllllIIlIII(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                            int[] nArray12 = new int[lIIlIIIIIllll[3]];
                                            nArray12[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[39];
                                            Inventory.getFirst((int[])nArray12).useOn((Actor)var20);
                                        }
                                        Time.sleepTicks((int)lIIlIIIIIllll[3]);
                                        0;
                                    }
                                }
                            }
                            if (p.lIlIIllllIIlIII(eL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && p.lIlIIllllIIIlll(e.j(lIIlIIIIIllll[2]), lIIlIIIIIllll[12])) {
                                AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[57]];
                                Movement.walkTo((WorldPoint)new WorldPoint(lIIlIIIIIllll[58], lIIlIIIIIllll[59], lIIlIIIIIllll[4]));
                                0;
                                Time.sleepTicks((int)lIIlIIIIIllll[3]);
                                0;
                            }
                            if (!p.lIlIIllllIIlIIl(eL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !p.lIlIIllllIIIlll(e.j(lIIlIIIIIllll[2]), lIIlIIIIIllll[12])) break block89;
                            int[] nArray = new int[lIIlIIIIIllll[3]];
                            nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[60];
                            if (!p.lIlIIllllIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block90;
                            int[] nArray13 = new int[lIIlIIIIIllll[3]];
                            nArray13[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[60];
                            if (!p.lIlIIllllIIlIII(Inventory.contains((int[])nArray13) ? 1 : 0) || !p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(eJ), lIIlIIIIIllll[12])) break block89;
                        }
                        AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[61]];
                        if (p.lIlIIllllIIlllI(Movement.getRunEnergy(), lIIlIIIIIllll[33])) {
                            p.aQ();
                        }
                    }
                    if (p.lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(eJ), lIIlIIIIIllll[12])) {
                        int[] nArray = new int[lIIlIIIIIllll[3]];
                        nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[60];
                        if (p.lIlIIllllIIlIII(Inventory.contains((int[])nArray) ? 1 : 0) && p.lIlIIllllIIIlll(Players.getLocal().getWorldLocation().getX(), lIIlIIIIIllll[62])) {
                            String[] stringArray = new String[lIIlIIIIIllll[3]];
                            stringArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[63]];
                            llllllllllllllIlllllllIlIIIlIIII2 = TileObjects.getNearest((String[])stringArray);
                            if (p.lIlIIllllIIllII(llllllllllllllIlllllllIlIIIlIIII2)) {
                                AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[64]];
                                int[] nArray14 = new int[lIIlIIIIIllll[3]];
                                nArray14[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[60];
                                if (p.lIlIIllllIIlIII(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                    int[] nArray15 = new int[lIIlIIIIIllll[3]];
                                    nArray15[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[60];
                                    Inventory.getFirst((int[])nArray15).useOn(llllllllllllllIlllllllIlIIIlIIII2);
                                    Time.sleepTicks((int)lIIlIIIIIllll[1]);
                                    0;
                                }
                            }
                        }
                    }
                    if (!p.lIlIIllllIIlIII(eN.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block91;
                    int[] nArray = new int[lIIlIIIIIllll[3]];
                    nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[60];
                    if (!p.lIlIIllllIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block91;
                    if (p.lIlIIllllIIlIIl(Players.getLocal().getWorldLocation().equals((Object)ex) ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[65]];
                        Movement.walkTo((WorldPoint)ex);
                        0;
                    }
                    if (p.lIlIIllllIIlIll(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lIIlIIIIIllll[13])) {
                        int[] nArray16 = new int[lIIlIIIIIllll[3]];
                        nArray16[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                        if (p.lIlIIllllIIlIII(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                            int[] nArray17 = new int[lIIlIIIIIllll[3]];
                            nArray17[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                            Inventory.getFirst((int[])nArray17).interact(lIIlIIIIIlllI[lIIlIIIIIllll[66]]);
                        }
                    }
                    if (!p.lIlIIllllIIlIII(Players.getLocal().getWorldLocation().equals((Object)ex) ? 1 : 0) || !p.lIlIIllllIIllII(llllllllllllllIlllllllIlIIIlIIII2 = NPCs.getNearest((int[])fb)) || !p.lIlIIllllIIlIIl(llllllllllllllIlllllllIlIIIlIIII2.isDead() ? 1 : 0)) break block91;
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[67]];
                    if (p.lIlIIllllIIIllI(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIIIllll[21])) {
                        Magic.cast((Spell)SpellBook.Standard.WATER_STRIKE, (NPC)llllllllllllllIlllllllIlIIIlIIII2);
                        Time.sleepTicks((int)lIIlIIIIIllll[3]);
                        0;
                    }
                    if (p.lIlIIllllIIIllI(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIIIllll[26]) && !p.lIlIIllllIIIllI(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIIIllll[21])) break block92;
                    if (!p.lIlIIllllIIlllI(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIIIllll[21])) break block93;
                    int[] nArray18 = new int[lIIlIIIIIllll[3]];
                    nArray18[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[6];
                    if (!p.lIlIIllllIIlIII(Inventory.contains((int[])nArray18) ? 1 : 0)) break block93;
                    String[] stringArray = new String[lIIlIIIIIllll[3]];
                    stringArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[68]];
                    if (!p.lIlIIllllIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block93;
                }
                Magic.cast((Spell)SpellBook.Standard.EARTH_STRIKE, (NPC)llllllllllllllIlllllllIlIIIlIIII2);
                Time.sleepTicks((int)lIIlIIIIIllll[3]);
                0;
            }
            if (p.lIlIIllllIIlllI(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIIIllll[26])) {
                String[] stringArray = new String[lIIlIIIIIllll[3]];
                stringArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[69]];
                if (p.lIlIIllllIIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    Magic.cast((Spell)SpellBook.Standard.FIRE_STRIKE, (NPC)llllllllllllllIlllllllIlIIIlIIII2);
                    Time.sleepTicks((int)lIIlIIIIIllll[3]);
                    0;
                }
            }
        }
        if (p.lIlIIllllIIIlll(e.j(lIIlIIIIIllll[2]), lIIlIIIIIllll[14])) {
            String[] stringArray = new String[lIIlIIIIIllll[3]];
            stringArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[70]];
            if (p.lIlIIllllIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray9 = new String[lIIlIIIIIllll[3]];
                stringArray9[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[71]];
                llllllllllllllIlllllllIlIIIlIIII2 = TileItems.getNearest((String[])stringArray9);
                if (p.lIlIIllllIIllII(llllllllllllllIlllllllIlIIIlIIII2)) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[72]];
                    llllllllllllllIlllllllIlIIIlIIII2.interact(lIIlIIIIIlllI[lIIlIIIIIllll[73]]);
                    Time.sleepTicks((int)lIIlIIIIIllll[1]);
                    0;
                }
            }
        }
        if (p.lIlIIllllIIIlll(e.j(lIIlIIIIIllll[2]), lIIlIIIIIllll[14])) {
            String[] stringArray = new String[lIIlIIIIIllll[3]];
            stringArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[74]];
            if (p.lIlIIllllIIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                if (p.lIlIIllllIIlIII(eN.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] nArray = new int[lIIlIIIIIllll[3]];
                    nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                    if (p.lIlIIllllIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[75]];
                        int[] nArray19 = new int[lIIlIIIIIllll[3]];
                        nArray19[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                        Inventory.getFirst((int[])nArray19).interact(lIIlIIIIIlllI[lIIlIIIIIllll[76]]);
                        Time.sleepTicks((int)lIIlIIIIIllll[13]);
                        0;
                    }
                }
                if (p.lIlIIllllIIlIIl(eN.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(ew), lIIlIIIIIllll[15])) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[77]];
                    Movement.walkTo((WorldPoint)ew);
                    0;
                    Time.sleepTicks((int)lIIlIIIIIllll[3]);
                    0;
                }
                if (p.lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(ew), lIIlIIIIIllll[13])) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[78]];
                    if (p.lIlIIllllIIIllI(co, lIIlIIIIIllll[3])) {
                        P.iw += lIIlIIIIIllll[3];
                        P.d(AccBuilderRat.m);
                        co += lIIlIIIIIllll[3];
                        P.iw = lIIlIIIIIllll[4];
                        cp = lIIlIIIIIllll[4];
                    }
                    g.a(lIIlIIIIIlllI[lIIlIIIIIllll[79]], dP);
                }
            }
        }
    }

    public static void aQ() {
        if (p.lIlIIllllIIlIII(Inventory.contains((int[])f.ba) ? 1 : 0) && p.lIlIIllllIIIllI(Movement.getRunEnergy(), lIIlIIIIIllll[68])) {
            Inventory.getFirst((int[])f.ba).interact(lIIlIIIIIlllI[lIIlIIIIIllll[80]]);
            Time.sleepTicks((int)lIIlIIIIIllll[3]);
            0;
        }
        if (p.lIlIIllllIIlIIl(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (!p.lIlIIllllIIlIIl(eL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || p.lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(eA), lIIlIIIIIllll[1])) {
            AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[81]];
            Movement.walkTo((WorldPoint)new WorldPoint(lIIlIIIIIllll[58], lIIlIIIIIllll[59], lIIlIIIIIllll[4]));
            0;
            Time.sleepTicks((int)lIIlIIIIIllll[3]);
            0;
        }
        int[] nArray = new int[lIIlIIIIIllll[3]];
        nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[82];
        NPC var14 = NPCs.getNearest((int[])nArray);
        int[] nArray2 = new int[lIIlIIIIIllll[3]];
        nArray2[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[60];
        if (p.lIlIIllllIIlIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            if (p.lIlIIllllIIlIII(ea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && p.lIlIIllllIIllII(var14) && p.lIlIIllllIIlIII(eg.contains(var14.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks((int)lIIlIIIIIllll[24]);
                0;
                while (p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(dX), lIIlIIIIIllll[3]) && p.lIlIIllllIIlIIl(AccBuilderRat.d ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[83]];
                    Movement.walkTo((WorldPoint)dX);
                    0;
                    Time.sleepTicks((int)lIIlIIIIIllll[3]);
                    0;
                    0;
                    if (-(0x48 ^ 0xE ^ (0x7E ^ 0x3C)) <= 0) continue;
                    return;
                }
            }
            if (p.lIlIIllllIIlIII(eb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && p.lIlIIllllIIllII(var14) && p.lIlIIllllIIlIII(ed.contains(var14.getWorldLocation()) ? 1 : 0)) {
                while (p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(dY), lIIlIIIIIllll[3]) && p.lIlIIllllIIlIIl(AccBuilderRat.d ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[84]];
                    Movement.walkTo((WorldPoint)dY);
                    0;
                    Time.sleepTicks((int)lIIlIIIIIllll[3]);
                    0;
                    0;
                    if (((0xE1 ^ 0xAF ^ (0x76 ^ 0x16)) & (0x94 ^ 0xC6 ^ (0x1D ^ 0x61) ^ -1)) == 0) continue;
                    return;
                }
            }
            if (p.lIlIIllllIIlIII(ec.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && p.lIlIIllllIIllII(var14) && p.lIlIIllllIIlIII(eh.contains(var14.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks((int)lIIlIIIIIllll[18]);
                0;
                while (p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(dZ), lIIlIIIIIllll[3]) && p.lIlIIllllIIlIIl(AccBuilderRat.d ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[85]];
                    Movement.walkTo((WorldPoint)dZ);
                    0;
                    Time.sleepTicks((int)lIIlIIIIIllll[3]);
                    0;
                    0;
                    if ((0x7F ^ 0x7B) > 0) continue;
                    return;
                }
            }
            if (p.lIlIIllllIIlIII(ef.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && p.lIlIIllllIIllII(var14) && p.lIlIIllllIIlIII(eh.contains(var14.getWorldLocation()) ? 1 : 0)) {
                while (p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(eK), lIIlIIIIIllll[1]) && p.lIlIIllllIIlIIl(AccBuilderRat.d ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[86]];
                    Movement.walkTo((WorldPoint)eK);
                    0;
                    Time.sleepTicks((int)lIIlIIIIIllll[3]);
                    0;
                    0;
                    if ((0x7E ^ 0x3F ^ (0x5C ^ 0x19)) >= 3) continue;
                    return;
                }
            }
            if (p.lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(eK), lIIlIIIIIllll[12])) {
                AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[87]];
                String[] stringArray = new String[lIIlIIIIIllll[3]];
                stringArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[88]];
                TileObject var9 = TileObjects.getNearest((String[])stringArray);
                if (p.lIlIIllllIIllII(var9)) {
                    var9.interact(lIIlIIIIIlllI[lIIlIIIIIllll[89]]);
                    Time.sleepTicks((int)lIIlIIIIIllll[1]);
                    0;
                    Widget var4 = Widgets.get((int)lIIlIIIIIllll[23], (int)lIIlIIIIIllll[3]);
                    if (p.lIlIIllllIIllII(var4)) {
                        var4.interact(lIIlIIIIIlllI[lIIlIIIIIllll[90]]);
                        var4.interact(lIIlIIIIIllll[4]);
                        var4.interact(lIIlIIIIIlllI[lIIlIIIIIllll[91]]);
                        Keyboard.type((String)lIIlIIIIIlllI[lIIlIIIIIllll[92]]);
                    }
                }
            }
        }
        int[] nArray3 = new int[lIIlIIIIIllll[3]];
        nArray3[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[60];
        if (p.lIlIIllllIIlIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            if (p.lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(eK), lIIlIIIIIllll[12])) {
                while (p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIIllll[93], lIIlIIIIIllll[94], lIIlIIIIIllll[4])), lIIlIIIIIllll[3]) && p.lIlIIllllIIlIIl(AccBuilderRat.d ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[95]];
                    Movement.walkTo((WorldPoint)new WorldPoint(lIIlIIIIIllll[93], lIIlIIIIIllll[94], lIIlIIIIIllll[4]));
                    0;
                    Time.sleepTicks((int)lIIlIIIIIllll[3]);
                    0;
                    0;
                    
                    return;
                }
            }
            if (p.lIlIIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIIllll[93], lIIlIIIIIllll[94], lIIlIIIIIllll[4])), lIIlIIIIIllll[1]) && p.lIlIIllllIIllII(var14) && p.lIlIIllllIIlIII(eg.contains(var14.getWorldLocation()) ? 1 : 0)) {
                while (p.lIlIIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(dY), lIIlIIIIIllll[3]) && p.lIlIIllllIIlIIl(AccBuilderRat.d ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlllI[lIIlIIIIIllll[96]];
                    Movement.walkTo((WorldPoint)dY);
                    0;
                    Time.sleepTicks((int)lIIlIIIIIllll[3]);
                    0;
                    0;
                    
                    return;
                }
            }
        }
    }

    private static String lIlIIllllIIIIIl(String var5, String var1) {
        try {
            SecretKeySpec var23 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lIIlIIIIIllll[20]), "DES");
            Cipher var19 = Cipher.getInstance("DES");
            var19.init(lIIlIIIIIllll[1], var23);
            return new String(var19.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static String lIlIIllllIIIIlI(String var24, String var2) {
        try {
            SecretKeySpec var26 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(lIIlIIIIIllll[1], var26);
            return new String(var10.doFinal(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static void lIlIIllllIIIlII() {
        lIIlIIIIIlllI = new String[lIIlIIIIIllll[174]];
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[4]] = p."Buying items";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[3]] = p."Finished buying items, switching back to questing";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[1]] = p."Breaking tab";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[12]] = p."Break";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[15]] = p."Nav to start";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[13]] = p."Drink";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[14]] = p."Boy";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[18]] = p."Navigating to outside door";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[20]] = p."Drop";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[21]] = p."Stealing key";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[22]] = p."Look-under";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[24]] = p."Continue";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[25]] = p."null";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[26]] = p." ";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[27]] = p."Nav to magnet box";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[28]] = p."Nav to magnet box";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[29]] = p."Cupboard";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[30]] = p."Taking magnet";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[31]] = p."Drop";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[32]] = p."Open";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[33]] = p."Open";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[34]] = p."Search";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[35]] = p."Search";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[36]] = p."Continue";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[37]] = p."null";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[38]] = p." ";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[40]] = p."Nav to magnet box";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[41]] = p."Cupboard";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[42]] = p."Taking magnet";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[43]] = p."Open";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[44]] = p."Open";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[45]] = p."Search";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[46]] = p."Search";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[47]] = p."Continue";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[48]] = p."null";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[49]] = p." ";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[50]] = p."Nav to cheese spot";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[51]] = p."Mouse hole";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[52]] = p."Mouse";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[53]] = p."Using cheese";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[54]] = p."Cheese";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[55]] = p."Cheese";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[56]] = p."Handle mouse";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[57]] = p."Entering maze";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[61]] = p."Handling walking";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[63]] = p."Door";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[64]] = p."Entering shed";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[65]] = p."Nav to safe spot";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[66]] = p."Eat";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[67]] = p."Casting spell";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[68]] = p."Fire rune";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[69]] = p."Fire rune";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[70]] = p."Ball";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[71]] = p."Ball";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[72]] = p."Taking ball";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[73]] = p."Take";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[74]] = p."Ball";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[75]] = p."Breaking tab";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[76]] = p."Break";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[77]] = p."Nav to witches start";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[78]] = p."Turning in quest";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[79]] = p."Boy";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[80]] = p."Drink";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[81]] = p."Entering maze";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[83]] = p."Nav to first spot";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[84]] = p."Nav to second spot";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[85]] = p."Nav to third spot";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[86]] = p."Nav to fountain";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[87]] = p."Getting key";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[88]] = p."Fountain";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[89]] = p."Check";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[90]] = p."Continue";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[91]] = p."null";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[92]] = p." ";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[95]] = p."Nav back toward maze";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[96]] = p."Nav to shed spot";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[97]] = p."Navigating to bank";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[98]] = p."Opening bank";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[100]] = p."Handling banking";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[102]] = p."We are missing supplies, switching to BUYING";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[16]] = p."We are missing supplies, switching to BUYING";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[103]] = p."We are missing supplies, switching to BUYING";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[104]] = p."We are missing supplies, switching to BUYING";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[106]] = p."We are missing supplies, switching to BUYING";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[116]] = p."Witches House quest";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[117]] = p."ring of wealth (";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[163]] = p."Wizard Mizgog";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[164]] = p."Give me a quest please.";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[165]] = p."I'll try.";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[166]] = p."Actually, I know where to find this stuff.";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[167]] = p."Yes.";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[168]] = p."What's the matter?";
        p.lIIlIIIIIlllI[p.lIIlIIIIIllll[169]] = p."Ok, I'll see what I can do.";
    }

    private static boolean lIlIIllllIIlIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIllllIIlIII(int n2) {
        return n2 != 0;
    }

    private static void W() {
        d var16;
        block21: {
            block20: {
                Object var6;
                block19: {
                    block18: {
                        int[] nArray = new int[lIIlIIIIIllll[3]];
                        nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                        if (p.lIlIIllllIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(lIIlIIIIIllll[8], lIIlIIIIIllll[109], lIIlIIIIIllll[110]);
                            bA.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[lIIlIIIIIllll[3]];
                        nArray2[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                        if (p.lIlIIllllIIlIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[lIIlIIIIIllll[3]];
                            nArray3[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[8];
                            if (p.lIlIIllllIIIllI(Bank.getFirst((int[])nArray3).getQuantity(), lIIlIIIIIllll[33])) {
                                var6 = new d(lIIlIIIIIllll[8], lIIlIIIIIllll[54], lIIlIIIIIllll[110]);
                                bA.add((d)var6);
                                0;
                            }
                        }
                        int[] nArray4 = new int[lIIlIIIIIllll[3]];
                        nArray4[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[9];
                        if (!p.lIlIIllllIIlIII(Bank.contains((int[])nArray4) ? 1 : 0)) break block18;
                        int[] nArray5 = new int[lIIlIIIIIllll[3]];
                        nArray5[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[9];
                        if (!p.lIlIIllllIIlIII(Bank.contains((int[])nArray5) ? 1 : 0)) break block19;
                        int[] nArray6 = new int[lIIlIIIIIllll[3]];
                        nArray6[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[9];
                        if (!p.lIlIIllllIIIllI(Bank.getFirst((int[])nArray6).getQuantity(), lIIlIIIIIllll[13])) break block19;
                    }
                    var6 = new d(lIIlIIIIIllll[9], lIIlIIIIIllll[13], lIIlIIIIIllll[111]);
                    bA.add((d)var6);
                    0;
                }
                if (p.lIlIIllllIIlIIl(Bank.contains((Predicate)(var6 = item -> item.getName().toLowerCase().contains(lIIlIIIIIlllI[lIIlIIIIIllll[117]]))) ? 1 : 0)) {
                    var16 = new d(lIIlIIIIIllll[112], lIIlIIIIIllll[31], lIIlIIIIIllll[113]);
                    bA.add(var16);
                    0;
                }
                int[] nArray = new int[lIIlIIIIIllll[3]];
                nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[105];
                if (p.lIlIIllllIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    var16 = new d(lIIlIIIIIllll[105], lIIlIIIIIllll[54], lIIlIIIIIllll[114]);
                    bA.add(var16);
                    0;
                }
                int[] nArray7 = new int[lIIlIIIIIllll[3]];
                nArray7[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                if (!p.lIlIIllllIIlIII(Bank.contains((int[])nArray7) ? 1 : 0)) break block20;
                int[] nArray8 = new int[lIIlIIIIIllll[3]];
                nArray8[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                if (!p.lIlIIllllIIlIII(Bank.contains((int[])nArray8) ? 1 : 0)) break block21;
                int[] nArray9 = new int[lIIlIIIIIllll[3]];
                nArray9[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[10];
                if (!p.lIlIIllllIIIllI(Bank.getFirst((int[])nArray9).getQuantity(), lIIlIIIIIllll[22])) break block21;
            }
            var16 = new d(lIIlIIIIIllll[10], lIIlIIIIIllll[33], lIIlIIIIIllll[114]);
            bA.add(var16);
            0;
        }
        int[] nArray = new int[lIIlIIIIIllll[3]];
        nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[108];
        if (p.lIlIIllllIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            var16 = new d(lIIlIIIIIllll[108], lIIlIIIIIllll[13], h.bv);
            bA.add(var16);
            0;
        }
        int[] nArray10 = new int[lIIlIIIIIllll[3]];
        nArray10[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[7];
        if (p.lIlIIllllIIlIII(Bank.contains((int[])nArray10) ? 1 : 0)) {
            int[] nArray11 = new int[lIIlIIIIIllll[3]];
            nArray11[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[7];
            if (p.lIlIIllllIIIllI(Bank.getFirst((int[])nArray11).getQuantity(), lIIlIIIIIllll[101])) {
                var16 = new d(lIIlIIIIIllll[7], lIIlIIIIIllll[115], lIIlIIIIIllll[18]);
                bA.add(var16);
                0;
            }
        }
        int[] nArray12 = new int[lIIlIIIIIllll[3]];
        nArray12[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[5];
        if (p.lIlIIllllIIlIII(Bank.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[lIIlIIIIIllll[3]];
            nArray13[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[5];
            if (p.lIlIIllllIIIllI(Bank.getFirst((int[])nArray13).getQuantity(), lIIlIIIIIllll[101])) {
                var16 = new d(lIIlIIIIIllll[5], lIIlIIIIIllll[115], lIIlIIIIIllll[18]);
                bA.add(var16);
                0;
            }
        }
        int[] nArray14 = new int[lIIlIIIIIllll[3]];
        nArray14[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[6];
        if (p.lIlIIllllIIlIII(Bank.contains((int[])nArray14) ? 1 : 0)) {
            int[] nArray15 = new int[lIIlIIIIIllll[3]];
            nArray15[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[6];
            if (p.lIlIIllllIIIllI(Bank.getFirst((int[])nArray15).getQuantity(), lIIlIIIIIllll[101])) {
                var16 = new d(lIIlIIIIIllll[6], lIIlIIIIIllll[115], lIIlIIIIIllll[18]);
                bA.add(var16);
                0;
            }
        }
    }

    private static boolean lIlIIllllIIllIl(Object object) {
        return object == null;
    }

    @Override
    public int Y() {
        p.aP();
        return lIIlIIIIIllll[109];
    }

    private static String lIlIIllllIIIIll(String var12, String var17) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var13 = var17.toCharArray();
        int var25 = lIIlIIIIIllll[4];
        char[] var8 = var12.toCharArray();
        int var22 = var8.length;
        int var3 = lIIlIIIIIllll[4];
        while (p.lIlIIllllIIIllI(var3, var22)) {
            char var11 = var8[var3];
            var15.append((char)(var11 ^ var13[var25 % var13.length]));
            0;
            ++var25;
            ++var3;
            0;
            
            return null;
        }
        return String.valueOf(var15);
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (p.lIlIIllllIIlllI(e.j(lIIlIIIIIllll[2]), lIIlIIIIIllll[18])) {
            bl = lIIlIIIIIllll[3];
            0;
            if (-3 > 0) {
                return ((40 + 82 - 13 + 68 ^ 55 + 80 - 42 + 94) & (0x25 ^ 0x23 ^ (0xA2 ^ 0xAE) ^ -1)) != 0;
            }
        } else {
            bl = lIIlIIIIIllll[4];
        }
        return bl;
    }

    private static boolean lIlIIllllIIlllI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public String Z() {
        return lIIlIIIIIlllI[lIIlIIIIIllll[116]];
    }

    @Override
    public boolean X() {
        return lIIlIIIIIllll[4];
    }

    private static boolean lIlIIllllIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIllllIIllll(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIllllIIlIll(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        p.lIlIIllllIIIlIl();
        p.lIlIIllllIIIlII();
        eq = lIIlIIIIIllll[82];
        ei = lIIlIIIIIllll[0];
        es = lIIlIIIIIllll[60];
        et = lIIlIIIIIllll[39];
        em = lIIlIIIIIllll[1];
        ep = lIIlIIIIIllll[18];
        ek = lIIlIIIIIllll[2];
        eS = lIIlIIIIIllll[7];
        eo = lIIlIIIIIllll[14];
        eO = lIIlIIIIIllll[118];
        eT = lIIlIIIIIllll[5];
        ej = lIIlIIIIIllll[1];
        eQ = lIIlIIIIIllll[119];
        eR = lIIlIIIIIllll[120];
        eV = lIIlIIIIIllll[121];
        el = lIIlIIIIIllll[3];
        er = lIIlIIIIIllll[17];
        eX = lIIlIIIIIllll[9];
        en = lIIlIIIIIllll[12];
        eP = lIIlIIIIIllll[122];
        eU = lIIlIIIIIllll[6];
        eW = lIIlIIIIIllll[8];
        eu = lIIlIIIIIllll[19];
        dX = new WorldPoint(lIIlIIIIIllll[123], lIIlIIIIIllll[59], lIIlIIIIIllll[4]);
        dY = new WorldPoint(lIIlIIIIIllll[62], lIIlIIIIIllll[124], lIIlIIIIIllll[4]);
        dZ = new WorldPoint(lIIlIIIIIllll[125], lIIlIIIIIllll[94], lIIlIIIIIllll[4]);
        ea = new WorldArea(lIIlIIIIIllll[126], lIIlIIIIIllll[127], lIIlIIIIIllll[31], lIIlIIIIIllll[14], lIIlIIIIIllll[4]);
        eb = new WorldArea(lIIlIIIIIllll[128], lIIlIIIIIllll[127], lIIlIIIIIllll[30], lIIlIIIIIllll[14], lIIlIIIIIllll[4]);
        ec = new WorldArea(lIIlIIIIIllll[129], lIIlIIIIIllll[130], lIIlIIIIIllll[15], lIIlIIIIIllll[22], lIIlIIIIIllll[4]);
        ed = new WorldArea(lIIlIIIIIllll[131], lIIlIIIIIllll[132], lIIlIIIIIllll[24], lIIlIIIIIllll[15], lIIlIIIIIllll[4]);
        ee = new WorldArea(lIIlIIIIIllll[133], lIIlIIIIIllll[132], lIIlIIIIIllll[18], lIIlIIIIIllll[13], lIIlIIIIIllll[4]);
        ef = new WorldArea(lIIlIIIIIllll[134], lIIlIIIIIllll[135], lIIlIIIIIllll[21], lIIlIIIIIllll[18], lIIlIIIIIllll[4]);
        eg = new WorldArea(lIIlIIIIIllll[136], lIIlIIIIIllll[132], lIIlIIIIIllll[15], lIIlIIIIIllll[15], lIIlIIIIIllll[4]);
        eh = new WorldArea(lIIlIIIIIllll[137], lIIlIIIIIllll[132], lIIlIIIIIllll[15], lIIlIIIIIllll[13], lIIlIIIIIllll[4]);
        ev = new WorldPoint(lIIlIIIIIllll[138], lIIlIIIIIllll[139], lIIlIIIIIllll[1]);
        ew = new WorldPoint(lIIlIIIIIllll[140], lIIlIIIIIllll[141], lIIlIIIIIllll[4]);
        ex = new WorldPoint(lIIlIIIIIllll[142], lIIlIIIIIllll[127], lIIlIIIIIllll[4]);
        ey = new WorldPoint(lIIlIIIIIllll[143], lIIlIIIIIllll[144], lIIlIIIIIllll[4]);
        ez = new WorldPoint(lIIlIIIIIllll[145], lIIlIIIIIllll[146], lIIlIIIIIllll[4]);
        eA = new WorldPoint(lIIlIIIIIllll[131], lIIlIIIIIllll[94], lIIlIIIIIllll[4]);
        eB = new WorldPoint(lIIlIIIIIllll[147], lIIlIIIIIllll[148], lIIlIIIIIllll[4]);
        eC = new WorldPoint(lIIlIIIIIllll[149], lIIlIIIIIllll[150], lIIlIIIIIllll[4]);
        eD = new WorldPoint(lIIlIIIIIllll[145], lIIlIIIIIllll[151], lIIlIIIIIllll[4]);
        eE = new WorldPoint(lIIlIIIIIllll[131], lIIlIIIIIllll[151], lIIlIIIIIllll[4]);
        eF = new WorldPoint(lIIlIIIIIllll[131], lIIlIIIIIllll[152], lIIlIIIIIllll[4]);
        eG = new WorldPoint(lIIlIIIIIllll[136], lIIlIIIIIllll[151], lIIlIIIIIllll[4]);
        eH = new WorldPoint(lIIlIIIIIllll[136], lIIlIIIIIllll[152], lIIlIIIIIllll[4]);
        eI = new WorldPoint(lIIlIIIIIllll[58], lIIlIIIIIllll[153], lIIlIIIIIllll[4]);
        eJ = new WorldPoint(lIIlIIIIIllll[62], lIIlIIIIIllll[135], lIIlIIIIIllll[4]);
        eK = new WorldPoint(lIIlIIIIIllll[154], lIIlIIIIIllll[155], lIIlIIIIIllll[4]);
        eL = new WorldArea(new WorldPoint(lIIlIIIIIllll[156], lIIlIIIIIllll[157], lIIlIIIIIllll[4]), new WorldPoint(lIIlIIIIIllll[58], lIIlIIIIIllll[94], lIIlIIIIIllll[4]));
        eM = new WorldArea(new WorldPoint(lIIlIIIIIllll[145], lIIlIIIIIllll[158], lIIlIIIIIllll[4]), new WorldPoint(lIIlIIIIIllll[159], lIIlIIIIIllll[160], lIIlIIIIIllll[4]));
        eN = new WorldArea(lIIlIIIIIllll[62], lIIlIIIIIllll[130], lIIlIIIIIllll[14], lIIlIIIIIllll[22], lIIlIIIIIllll[4]);
        bA = new ArrayList<d>();
        eY = lIIlIIIIIllll[161];
        eZ = lIIlIIIIIllll[162];
        fa = lIIlIIIIIlllI[lIIlIIIIIllll[163]];
        String[] stringArray = new String[lIIlIIIIIllll[14]];
        stringArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIlllI[lIIlIIIIIllll[164]];
        stringArray[p.lIIlIIIIIllll[3]] = lIIlIIIIIlllI[lIIlIIIIIllll[165]];
        stringArray[p.lIIlIIIIIllll[1]] = lIIlIIIIIlllI[lIIlIIIIIllll[166]];
        stringArray[p.lIIlIIIIIllll[12]] = lIIlIIIIIlllI[lIIlIIIIIllll[167]];
        stringArray[p.lIIlIIIIIllll[15]] = lIIlIIIIIlllI[lIIlIIIIIllll[168]];
        stringArray[p.lIIlIIIIIllll[13]] = lIIlIIIIIlllI[lIIlIIIIIllll[169]];
        dP = stringArray;
        int[] nArray = new int[lIIlIIIIIllll[15]];
        nArray[p.lIIlIIIIIllll[4]] = lIIlIIIIIllll[170];
        nArray[p.lIIlIIIIIllll[3]] = lIIlIIIIIllll[171];
        nArray[p.lIIlIIIIIllll[1]] = lIIlIIIIIllll[172];
        nArray[p.lIIlIIIIIllll[12]] = lIIlIIIIIllll[173];
        fb = nArray;
    }
}

