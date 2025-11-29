/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 */
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.D;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aB;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aL;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aN;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.av;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ay;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.y;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class v
implements ac {
    static /* synthetic */ WorldArea dp;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ WorldPoint dl;
    static /* synthetic */ WorldPoint dr;
    public static /* synthetic */ List<d> bv;
    static /* synthetic */ WorldPoint dn;
    static /* synthetic */ boolean dj;
    static /* synthetic */ WorldPoint ds;
    static /* synthetic */ String h;
    static /* synthetic */ WorldPoint de;
    static /* synthetic */ int di;
    static /* synthetic */ String[] cE;
    static /* synthetic */ WorldArea dq;
    private static /* synthetic */ int[] lllIIlllII;
    static /* synthetic */ WorldArea dm;
    static /* synthetic */ int dt;
    private static /* synthetic */ String[] lllIIlIIlI;
    static /* synthetic */ WorldArea do;

    private static boolean llIIIIlIlIIIl(int n2) {
        return n2 != 0;
    }

    static {
        v.llIIIIlIIlllI();
        v.llIIIIlIIllIl();
        bv = new ArrayList<d>();
        de = new WorldPoint(lllIIlllII[443], lllIIlllII[444], lllIIlllII[1]);
        dl = new WorldPoint(lllIIlllII[445], lllIIlllII[446], lllIIlllII[1]);
        dm = new WorldArea(lllIIlllII[447], lllIIlllII[448], lllIIlllII[29], lllIIlllII[24], lllIIlllII[1]);
        dn = new WorldPoint(lllIIlllII[449], lllIIlllII[450], lllIIlllII[1]);
        do = new WorldArea(lllIIlllII[67], lllIIlllII[68], lllIIlllII[148], lllIIlllII[121], lllIIlllII[1]);
        dp = new WorldArea(lllIIlllII[451], lllIIlllII[452], lllIIlllII[126], lllIIlllII[101], lllIIlllII[0]);
        dq = new WorldArea(lllIIlllII[453], lllIIlllII[452], lllIIlllII[129], lllIIlllII[103], lllIIlllII[6]);
        dr = null;
        ds = null;
        String[] stringArray = new String[lllIIlllII[56]];
        stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[454]];
        stringArray[v.lllIIlllII[0]] = lllIIlIIlI[lllIIlllII[455]];
        stringArray[v.lllIIlllII[6]] = lllIIlIIlI[lllIIlllII[456]];
        stringArray[v.lllIIlllII[7]] = lllIIlIIlI[lllIIlllII[457]];
        stringArray[v.lllIIlllII[8]] = lllIIlIIlI[lllIIlllII[458]];
        stringArray[v.lllIIlllII[9]] = lllIIlIIlI[lllIIlllII[459]];
        stringArray[v.lllIIlllII[10]] = lllIIlIIlI[lllIIlllII[460]];
        stringArray[v.lllIIlllII[12]] = lllIIlIIlI[lllIIlllII[461]];
        stringArray[v.lllIIlllII[13]] = lllIIlIIlI[lllIIlllII[462]];
        stringArray[v.lllIIlllII[14]] = lllIIlIIlI[lllIIlllII[463]];
        stringArray[v.lllIIlllII[15]] = lllIIlIIlI[lllIIlllII[464]];
        stringArray[v.lllIIlllII[17]] = lllIIlIIlI[lllIIlllII[465]];
        stringArray[v.lllIIlllII[20]] = lllIIlIIlI[lllIIlllII[466]];
        stringArray[v.lllIIlllII[24]] = lllIIlIIlI[lllIIlllII[467]];
        stringArray[v.lllIIlllII[27]] = lllIIlIIlI[lllIIlllII[468]];
        stringArray[v.lllIIlllII[28]] = lllIIlIIlI[lllIIlllII[469]];
        stringArray[v.lllIIlllII[44]] = lllIIlIIlI[lllIIlllII[470]];
        stringArray[v.lllIIlllII[46]] = lllIIlIIlI[lllIIlllII[471]];
        stringArray[v.lllIIlllII[48]] = lllIIlIIlI[lllIIlllII[472]];
        stringArray[v.lllIIlllII[50]] = lllIIlIIlI[lllIIlllII[473]];
        stringArray[v.lllIIlllII[29]] = lllIIlIIlI[lllIIlllII[474]];
        cE = stringArray;
        h = lllIIlIIlI[lllIIlllII[475]];
    }

    private static boolean llIIIIlIllIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIIIlIlIlII(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean ae() {
        return lllIIlllII[1];
    }

    private static void llIIIIlIIlllI() {
        lllIIlllII = new int[477];
        v.lllIIlllII[0] = 1;
        v.lllIIlllII[1] = (0x7C ^ 0x1D) & ~(0x6B ^ 0xA);
        v.lllIIlllII[2] = 0x4C ^ 1 ^ (0xC4 ^ 0xB9);
        v.lllIIlllII[3] = 0xD2 ^ 0x8A ^ (0x20 ^ 0x55);
        v.lllIIlllII[4] = 0x8B ^ 0x92 ^ (0x6A ^ 0x5B);
        v.lllIIlllII[5] = -(0xFFFFCF41 & 0x7CFE) & (0xFFFFFD7F & 0x4FFF);
        v.lllIIlllII[6] = 2;
        v.lllIIlllII[7] = 3;
        v.lllIIlllII[8] = 0x1B ^ 0x61 ^ (0x6B ^ 0x15);
        v.lllIIlllII[9] = 0x45 ^ 0x2F ^ (0x12 ^ 0x7D);
        v.lllIIlllII[10] = 0x5B ^ 0x5D;
        v.lllIIlllII[11] = 0x47 ^ 0x61;
        v.lllIIlllII[12] = 0x7D ^ 0x60 ^ (0xD8 ^ 0xC2);
        v.lllIIlllII[13] = 0xAD ^ 0xA5;
        v.lllIIlllII[14] = 26 + 46 - 53 + 142 ^ 32 + 114 - 21 + 43;
        v.lllIIlllII[15] = 0x61 ^ 0x7A ^ (0x1F ^ 0xE);
        v.lllIIlllII[16] = -(0xFFFFC4AB & 0x3F76) & (0xFFFFF7F9 & 0x1FAF);
        v.lllIIlllII[17] = 75 + 121 - 191 + 161 ^ 171 + 10 - 163 + 155;
        v.lllIIlllII[18] = 0xFFFFAFDA & 0x5BF5;
        v.lllIIlllII[19] = -(0xFFFFBA07 & 0x47F9) & (0xFFFFFB97 & 0x37FF);
        v.lllIIlllII[20] = 0xAF ^ 0xA3;
        v.lllIIlllII[21] = 0xFFFFDAFE & 0x272D;
        v.lllIIlllII[22] = 0xCF ^ 0xA6 ^ (0x7C ^ 0x26);
        v.lllIIlllII[23] = -(0xFFFFBBAD & 0x6CD7) & (0xFFFFFEAE & 0x2BFF);
        v.lllIIlllII[24] = 0xBC ^ 0xB1;
        v.lllIIlllII[25] = 0xFFFFB985 & 0x47FB;
        v.lllIIlllII[26] = (0x4D ^ 0x35) + (0xA3 ^ 0x9B) - (0x14 ^ 0x52) + (0x30 ^ 0x17);
        v.lllIIlllII[27] = 0xF0 ^ 0x85 ^ (0xC3 ^ 0xB8);
        v.lllIIlllII[28] = 96 + 72 - 2 + 4 ^ 134 + 160 - 183 + 54;
        v.lllIIlllII[29] = 0x48 ^ 0x77 ^ (0x72 ^ 0x59);
        v.lllIIlllII[30] = 0xFFFFBF57 & 0x5FEF;
        v.lllIIlllII[31] = 0xFFFFEDFF & 0x5EAD;
        v.lllIIlllII[32] = -(0xFFFFFF9D & 0x2C7B) & (0xFFFFFFFB & 0x2FFF);
        v.lllIIlllII[33] = 0xFFFFAFBB & 0x5BD5;
        v.lllIIlllII[34] = -(0xFFFFA5BD & 0x5B6B) & (0xFFFFD7FD & 0x2F6F);
        v.lllIIlllII[35] = -(0xFFFFED07 & 0x7AFD) & (0xFFFFEEFF & 0x7FDF);
        v.lllIIlllII[36] = 208 + 209 - 232 + 48;
        v.lllIIlllII[37] = 0xFFFF8377 & 0x7EBC;
        v.lllIIlllII[38] = 61 + 217 - 148 + 97;
        v.lllIIlllII[39] = 0xFFFF8F9F & 0x79E2;
        v.lllIIlllII[40] = -(0xFFFFC52F & 0x7ADB) & (0xFFFFFFFA & 0x6E4F);
        v.lllIIlllII[41] = 0xFFFFF9A8 & 0x1FFF;
        v.lllIIlllII[42] = 0xFFFFD3BE & 0x7F73;
        v.lllIIlllII[43] = 0xFFFFDBB5 & 0x777F;
        v.lllIIlllII[44] = 0x80 ^ 0x90;
        v.lllIIlllII[45] = -(0xFFFFABCB & 0x5CF7) & (0xFFFFDBFF & 0x7FFA);
        v.lllIIlllII[46] = 0x80 ^ 0x91;
        v.lllIIlllII[47] = -(0xFFFFCF87 & 0x767C) & (0xFFFFDF7F & Short.MAX_VALUE);
        v.lllIIlllII[48] = 0x9E ^ 0x8C;
        v.lllIIlllII[49] = 0xFFFF9ACF & 0x7F7F;
        v.lllIIlllII[50] = 0x28 ^ 0x3B;
        v.lllIIlllII[51] = 0xFFFFFD5F & 0x33F1;
        v.lllIIlllII[52] = -(0xFFFFE7AF & 0x3DDF) & (0xFFFFFFDF & 0x77BF);
        v.lllIIlllII[53] = -(0xFFFFBD3C & 0x73C7) & (0xFFFFFFBF & 0x37EB);
        v.lllIIlllII[54] = 0xFFFFAB76 & Short.MAX_VALUE;
        v.lllIIlllII[55] = 0x7F ^ 0x21 ^ (0x7C ^ 0x10);
        v.lllIIlllII[56] = 0x9C ^ 0x89;
        v.lllIIlllII[57] = 0xA0 ^ 0xB6;
        v.lllIIlllII[58] = 0x89 ^ 0x9E;
        v.lllIIlllII[59] = 0xAE ^ 0xB0 ^ (0x8E ^ 0x88);
        v.lllIIlllII[60] = 0xBE ^ 0xA2 ^ (0x32 ^ 0x37);
        v.lllIIlllII[61] = 0xFFFFAF9F & 0x5E77;
        v.lllIIlllII[62] = 0xFFFFAD7E & 0x5EFF;
        v.lllIIlllII[63] = 167 + 10 - 4 + 59 ^ 124 + 111 - 222 + 150;
        v.lllIIlllII[64] = 0x84 ^ 0x9A;
        v.lllIIlllII[65] = -(0xFFFFBB67 & 0x559D) & (0xFFFFBFF7 & 0x5F1D);
        v.lllIIlllII[66] = 0xFFFFACBF & 0x5FD2;
        v.lllIIlllII[67] = -(0xFFFFE176 & 0x1FFB) & (0xFFFFDF7F & 0x2FF7);
        v.lllIIlllII[68] = -(0xFFFFE227 & 0x1FDB) & (0xFFFF9E7B & 0x6FEF);
        v.lllIIlllII[69] = 193 + 210 - 386 + 211 ^ 71 + 92 - 109 + 144;
        v.lllIIlllII[70] = 0xC9 ^ 0x8F ^ (0x69 ^ 0x35);
        v.lllIIlllII[71] = 0x33 ^ 0x28;
        v.lllIIlllII[72] = 56 + 33 - 59 + 103 ^ 113 + 26 - 119 + 133;
        v.lllIIlllII[73] = 0xC ^ 0x11;
        v.lllIIlllII[74] = 0x6B ^ 0x74;
        v.lllIIlllII[75] = 87 + 133 - 105 + 30 ^ 161 + 74 - 199 + 141;
        v.lllIIlllII[76] = 0x30 ^ 0x11;
        v.lllIIlllII[77] = 0x19 ^ 0x3A;
        v.lllIIlllII[78] = 0x13 ^ 0x37;
        v.lllIIlllII[79] = 0x63 ^ 0x46;
        v.lllIIlllII[80] = 0x7E ^ 0x49 ^ (0x2F ^ 0x3F);
        v.lllIIlllII[81] = -(0xFFFFE2ED & 0x7D5E) & (0xFFFFEEFF & 0x7F7F);
        v.lllIIlllII[82] = -(0xFFFFDF8E & 0x30F1) & (0xFFFFBDFF & 0x5EFF);
        v.lllIIlllII[83] = -(0xFFFFEB0B & 0x75FD) & (0xFFFFEFFF & 0x7F3F);
        v.lllIIlllII[84] = -(0xFFFFD8EF & 0x6755) & (0xFFFFEDCF & 0x5EFF);
        v.lllIIlllII[85] = 0xFFFFADF9 & 0x5E9E;
        v.lllIIlllII[86] = -(0xFFFFB4DB & 0x5BE5) & (0xFFFF9EFF & 0x7FF6);
        v.lllIIlllII[87] = -(0xFFFFFBDF & 0x177F) & (0xFFFF9FFF & 0x7FFE);
        v.lllIIlllII[88] = -(0xFFFFF969 & 0x5697) & (0xFFFFFFEF & 0x5E5F);
        v.lllIIlllII[89] = -(0xFFFFBB6B & 0x67FD) & (0xFFFFFFFF & 0x2FFD);
        v.lllIIlllII[90] = 0xFFFFDE6F & 0x2FF6;
        v.lllIIlllII[91] = 0xFFFFFF97 & 0xCFF;
        v.lllIIlllII[92] = -(0xFFFFF2A5 & 0x6D5F) & (0xFFFFFF3F & 0x6EFF);
        v.lllIIlllII[93] = 0xFFFF8C8F & 0x7FFD;
        v.lllIIlllII[94] = 0xFFFFFF3F & 0xEF8;
        v.lllIIlllII[95] = -(0xFFFFFF7E & 0x73DF) & (0xFFFFFFFF & Short.MAX_VALUE);
        v.lllIIlllII[96] = -(0xFFFFF5B6 & 0x6BCB) & (0xFFFFEFBF & 0x7FFD);
        v.lllIIlllII[97] = 0xD9 ^ 0xC2 ^ (0xB4 ^ 0x86);
        v.lllIIlllII[98] = 0xD5 ^ 0x9D ^ (0xFA ^ 0x98);
        v.lllIIlllII[99] = 0x95 ^ 0xBE;
        v.lllIIlllII[100] = 0x32 ^ 0x3D ^ (0x21 ^ 2);
        v.lllIIlllII[101] = 0x84 ^ 0xAA;
        v.lllIIlllII[102] = 0xFFFF97FC & 0x7DE3;
        v.lllIIlllII[103] = 58 + 30 - -62 + 21 ^ 25 + 72 - 85 + 120;
        v.lllIIlllII[104] = 0xFFFFBFF3 & 0x4CAF;
        v.lllIIlllII[105] = 0x17 ^ 0x26;
        v.lllIIlllII[106] = 0xFFFFCE6F & 0x3FD2;
        v.lllIIlllII[107] = 0xFFFFEFBD & 0x1CDF;
        v.lllIIlllII[108] = 0xF2 ^ 0xC6;
        v.lllIIlllII[109] = 0x53 ^ 0x7C ^ (0x7E ^ 0x64);
        v.lllIIlllII[110] = 0x11 ^ 0x27;
        v.lllIIlllII[111] = 0x43 ^ 0x74;
        v.lllIIlllII[112] = 0x6F ^ 0x57;
        v.lllIIlllII[113] = 0x34 ^ 0xD;
        v.lllIIlllII[114] = 23 + 13 - -40 + 91 ^ 139 + 44 - 112 + 86;
        v.lllIIlllII[115] = 0xF4 ^ 0xBD ^ (0x61 ^ 0x13);
        v.lllIIlllII[116] = 0x9C ^ 0xA0;
        v.lllIIlllII[117] = -(0xFFFFFEB3 & 0x476D) & (0xFFFFF7FF & 0x7FF7);
        v.lllIIlllII[118] = 0x61 ^ 0x5C;
        v.lllIIlllII[119] = 0xFFFFBC6B & 0x4FFF;
        v.lllIIlllII[120] = 44 + 62 - 85 + 128;
        v.lllIIlllII[121] = 0x31 ^ 0xF;
        v.lllIIlllII[122] = 0x1C ^ 0x23;
        v.lllIIlllII[123] = 0x6B ^ 0x4D ^ (0xD9 ^ 0xBF);
        v.lllIIlllII[124] = 0x20 ^ 0x2D ^ (0xEC ^ 0xA0);
        v.lllIIlllII[125] = 0x34 ^ 0x24 ^ (0x48 ^ 0x1A);
        v.lllIIlllII[126] = 1 ^ (0x67 ^ 0x20);
        v.lllIIlllII[127] = 0x78 ^ 0xD ^ (5 ^ 0x33);
        v.lllIIlllII[128] = 0x46 ^ 0x53 ^ (0x45 ^ 0);
        v.lllIIlllII[129] = 32 + 31 - -44 + 22 ^ 122 + 76 - 175 + 174;
        v.lllIIlllII[130] = 0x23 ^ 0x77 ^ (0x5D ^ 0x4C);
        v.lllIIlllII[131] = 0xA3 ^ 0x88 ^ (0x61 ^ 0xD);
        v.lllIIlllII[132] = 0x6C ^ 0x20 ^ (0x2D ^ 0x29);
        v.lllIIlllII[133] = 0x4E ^ 4 ^ 3;
        v.lllIIlllII[134] = 0x65 ^ 0x4C ^ (9 ^ 0x6A);
        v.lllIIlllII[135] = -(0x70 ^ 0x34) & (0xFFFFFFF7 & 0x7F7F);
        v.lllIIlllII[136] = 101 + 12 - 103 + 217 ^ 168 + 157 - 299 + 149;
        v.lllIIlllII[137] = 0x45 ^ 8;
        v.lllIIlllII[138] = 0x50 ^ 0x1E;
        v.lllIIlllII[139] = 0xFFFFFF3F & 0x7FF7;
        v.lllIIlllII[140] = 0x2C ^ 0x48 ^ (0xA1 ^ 0x8A);
        v.lllIIlllII[141] = 0x51 ^ 0;
        v.lllIIlllII[142] = 0xE ^ 0x4E ^ (0x57 ^ 0x45);
        v.lllIIlllII[143] = 0x22 ^ 0x45 ^ (0x93 ^ 0xA7);
        v.lllIIlllII[144] = 0x3C ^ 0xB ^ (0xEC ^ 0x8F);
        v.lllIIlllII[145] = 0 ^ 0x35 ^ (0x45 ^ 0x25);
        v.lllIIlllII[146] = 231 + 147 - 250 + 106 ^ 13 + 179 - 37 + 33;
        v.lllIIlllII[147] = 0xB8 ^ 0x8A ^ (7 ^ 0x62);
        v.lllIIlllII[148] = 0x5C ^ 4;
        v.lllIIlllII[149] = 0x2F ^ 0x76;
        v.lllIIlllII[150] = 0xD3 ^ 0x89;
        v.lllIIlllII[151] = 0x4B ^ 0x5F ^ (0xCE ^ 0x81);
        v.lllIIlllII[152] = 0x4C ^ 0x5F ^ (0xEA ^ 0xA5);
        v.lllIIlllII[153] = 205 + 74 - 88 + 15 ^ 112 + 98 - 99 + 36;
        v.lllIIlllII[154] = 8 ^ 0x56;
        v.lllIIlllII[155] = 0x17 ^ 0x48;
        v.lllIIlllII[156] = 0xDA ^ 0xBA;
        v.lllIIlllII[157] = 0xCD ^ 0xAC;
        v.lllIIlllII[158] = 150 + 211 - 169 + 27 ^ 43 + 112 - 144 + 174;
        v.lllIIlllII[159] = 0x7D ^ 0x1E;
        v.lllIIlllII[160] = 0xCA ^ 0xC6 ^ (0x56 ^ 0x3E);
        v.lllIIlllII[161] = 0x84 ^ 0xA7 ^ (0x6F ^ 0x29);
        v.lllIIlllII[162] = 0x41 ^ 0x75 ^ (0x18 ^ 0x4A);
        v.lllIIlllII[163] = 0xCB ^ 0xAC;
        v.lllIIlllII[164] = 137 + 156 - 179 + 57 ^ 135 + 122 - 233 + 171;
        v.lllIIlllII[165] = 0xDA ^ 0xB3;
        v.lllIIlllII[166] = 128 + 239 - 162 + 38 ^ 28 + 136 - 79 + 68;
        v.lllIIlllII[167] = 0x3F ^ 0x54;
        v.lllIIlllII[168] = 0xB ^ 0xF ^ (0xD4 ^ 0xBC);
        v.lllIIlllII[169] = 0x5B ^ 0x63 ^ (0xF9 ^ 0xAC);
        v.lllIIlllII[170] = 0x89 ^ 0x94 ^ (0x78 ^ 0xB);
        v.lllIIlllII[171] = 0x55 ^ 0x3A;
        v.lllIIlllII[172] = 0x24 ^ 0x54;
        v.lllIIlllII[173] = 0x62 ^ 0x13;
        v.lllIIlllII[174] = 0x56 ^ 0x24;
        v.lllIIlllII[175] = 0x3B ^ 0x65 ^ (0x69 ^ 0x44);
        v.lllIIlllII[176] = 0x49 ^ 0x3D;
        v.lllIIlllII[177] = 59 + 118 - -72 + 2 ^ 20 + 37 - 32 + 117;
        v.lllIIlllII[178] = 0x3E ^ 0x48;
        v.lllIIlllII[179] = 0x2F ^ 0x32 ^ (0x39 ^ 0x53);
        v.lllIIlllII[180] = 9 ^ 0x71;
        v.lllIIlllII[181] = 0xC1 ^ 0xAF ^ (0xF ^ 0x18);
        v.lllIIlllII[182] = 0x6A ^ 0x19 ^ (0x31 ^ 0x38);
        v.lllIIlllII[183] = 0xFFFFAF2B & 0x5EDD;
        v.lllIIlllII[184] = 0xFFFFBDDA & 0x67F5;
        v.lllIIlllII[185] = 0x65 ^ 0x10 ^ (0x62 ^ 0x6C);
        v.lllIIlllII[186] = 0x54 ^ 0x28;
        v.lllIIlllII[187] = 0x1E ^ 0x25 ^ (0xF ^ 0x49);
        v.lllIIlllII[188] = 102 + 96 - 129 + 158 ^ 34 + 133 - 116 + 106;
        v.lllIIlllII[189] = 94 + 22 - 37 + 48;
        v.lllIIlllII[190] = (0x24 ^ 0x31) + (0x9F ^ 0x91) - -(0xE8 ^ 0xA2) + (0x73 ^ 0x60);
        v.lllIIlllII[191] = 37 + 104 - 30 + 18;
        v.lllIIlllII[192] = 19 + 14 - -20 + 77;
        v.lllIIlllII[193] = 122 + 18 - 123 + 114;
        v.lllIIlllII[194] = (0x90 ^ 0x95) + (0xAE ^ 0xA2) - -(0x57 ^ 0x37) + (0xAE ^ 0xBD);
        v.lllIIlllII[195] = (5 ^ 0x58) + (0x63 ^ 0x18) - (0x7D ^ 0xE) + (0x9A ^ 0xBA);
        v.lllIIlllII[196] = 114 + 86 - 181 + 115;
        v.lllIIlllII[197] = 26 + 53 - 48 + 104;
        v.lllIIlllII[198] = 0xFFFF8F7D & 0x7E87;
        v.lllIIlllII[199] = 0xFFFFAFF4 & 0x75CF;
        v.lllIIlllII[200] = (0x4E ^ 7) + (0x99 ^ 0x88) - -3 + (0xAB ^ 0x80);
        v.lllIIlllII[201] = (0x78 ^ 0xE) + (0x4E ^ 0x19) - (95 + 90 - 119 + 96) + (0x77 ^ 0x29);
        v.lllIIlllII[202] = (0xD6 ^ 0xB3) + (0xF ^ 0x73) - (0x14 ^ 0x4B) + (0x22 ^ 0x2A);
        v.lllIIlllII[203] = 14 + 80 - 59 + 104;
        v.lllIIlllII[204] = 59 + 61 - 1 + 21;
        v.lllIIlllII[205] = 116 + 38 - 73 + 60;
        v.lllIIlllII[206] = (0x1E ^ 0x20) + (0x1F ^ 7) - 2 + (4 ^ 0x3E);
        v.lllIIlllII[207] = (0x1B ^ 0x33) + (0x7B ^ 0x5A) - (9 ^ 0x2A) + (0x19 ^ 0x70);
        v.lllIIlllII[208] = 84 + 67 - 111 + 104;
        v.lllIIlllII[209] = (0xBE ^ 0xA4) + (120 + 26 - 28 + 24) - (0x56 ^ 0x14) + (0x5B ^ 0x77);
        v.lllIIlllII[210] = (0x72 ^ 9) + (0x1F ^ 2) - (0x3A ^ 0x34) + (0xCB ^ 0xC2);
        v.lllIIlllII[211] = 0xFFFFABFD & 0x5FD6;
        v.lllIIlllII[212] = 93 + 81 - 140 + 114;
        v.lllIIlllII[213] = 0xFFFF9BF3 & 0x6FDE;
        v.lllIIlllII[214] = -(0xB6 ^ 0xBF) & (0xFFFFAFDF & 0x5BFE);
        v.lllIIlllII[215] = 103 + 100 - 189 + 136;
        v.lllIIlllII[216] = 110 + 103 - 159 + 97;
        v.lllIIlllII[217] = (0xDD ^ 0x94) + 2 - -(0xAC ^ 0xA6) + (0x77 ^ 0x34);
        v.lllIIlllII[218] = 132 + 56 - 70 + 35;
        v.lllIIlllII[219] = (0x5F ^ 0x47) + (102 + 40 - 53 + 47) - (0x51 ^ 0x3F) + (0xEB ^ 0x83);
        v.lllIIlllII[220] = 95 + 107 - 143 + 95 + (0xE4 ^ 0xB6) - (39 + 21 - 16 + 150) + (0x7C ^ 0xD);
        v.lllIIlllII[221] = 69 + 35 - 32 + 84;
        v.lllIIlllII[222] = 83 + 12 - 5 + 67;
        v.lllIIlllII[223] = 53 + 119 - 104 + 63 + (92 + 130 - 199 + 109) - (0xFFFFAF65 & 0x519E) + (151 + 8 - 146 + 142);
        v.lllIIlllII[224] = (0x32 ^ 0x59) + (0x50 ^ 0x60) - (0x9A ^ 0x8B) + (0x73 ^ 0x66);
        v.lllIIlllII[225] = 27 + 117 - 14 + 23 + (0x2D ^ 6) - (0x4E ^ 0x15) + (0x15 ^ 0x22);
        v.lllIIlllII[226] = 1 + (0x81 ^ 0xAF) - -(0x1D ^ 0x5D) + (0x45 ^ 0x77);
        v.lllIIlllII[227] = 0xFFFF9D76 & 0x6FFD;
        v.lllIIlllII[228] = 0xFFFFBCDF & 0x4F7E;
        v.lllIIlllII[229] = (0xA8 ^ 0xC7) + (0x40 ^ 0x5B) - (0x74 ^ 0x5E) + (0xE9 ^ 0xA3);
        v.lllIIlllII[230] = 91 + 47 - 89 + 113;
        v.lllIIlllII[231] = 101 + 129 - 84 + 17;
        v.lllIIlllII[232] = (0xFB ^ 0x9A) + (0x29 ^ 0x4A) - (52 + 38 - 30 + 130) + (151 + 44 - 173 + 136);
        v.lllIIlllII[233] = 120 + 15 - 32 + 49 + (0x53 ^ 0x36) - (8 + 25 - -98 + 12) + (0x59 ^ 0x6E);
        v.lllIIlllII[234] = (0x14 ^ 0x12) + (0x45 ^ 0x16) - -(0x9F ^ 0x8E) + (0xFD ^ 0xC1);
        v.lllIIlllII[235] = 4 + 116 - -15 + 32;
        v.lllIIlllII[236] = (0x9D ^ 0x91) + (0xB9 ^ 0x86) - (0xAA ^ 0x9F) + (103 + 56 - 43 + 30);
        v.lllIIlllII[237] = 9 + 36 - -68 + 56;
        v.lllIIlllII[238] = (0x12 ^ 0x29) + (66 + 86 - 110 + 89) - (0x3D ^ 0x24) + (0x24 ^ 0x22);
        v.lllIIlllII[239] = 79 + 71 - 14 + 36;
        v.lllIIlllII[240] = (0x1D ^ 0x23) + (0x49 ^ 0x6A) - (0x67 ^ 0x4B) + (0x7A ^ 2);
        v.lllIIlllII[241] = 85 + 99 - 134 + 124;
        v.lllIIlllII[242] = 102 + 133 - 173 + 113;
        v.lllIIlllII[243] = 125 + 158 - 226 + 112 + (45 + 8 - 20 + 134) - (0xFFFF83FF & 0x7D1B) + (0x27 ^ 0x5C);
        v.lllIIlllII[244] = 93 + 106 - 56 + 34;
        v.lllIIlllII[245] = 10 + 146 - 58 + 80;
        v.lllIIlllII[246] = 152 + 37 - 188 + 178;
        v.lllIIlllII[247] = 30 + 168 - 157 + 139;
        v.lllIIlllII[248] = 116 + 115 - 206 + 105 + (0x34 ^ 0x4E) - (92 + 38 - -5 + 8) + (3 ^ 0x4B);
        v.lllIIlllII[249] = (0x43 ^ 0x77) + (0x5D ^ 0x39) - (0x28 ^ 0x77) + (0x2C ^ 0x51);
        v.lllIIlllII[250] = -(6 + 21 - -96 + 6) & (0xFFFFFFBF & Short.MAX_VALUE);
        v.lllIIlllII[251] = 46 + 88 - 6 + 34 + (115 + 85 - 106 + 44) - (110 + 102 - 83 + 4) + (0x35 ^ 0x25);
        v.lllIIlllII[252] = 40 + 24 - 16 + 123 + (0xCE ^ 0xA8) - (113 + 52 - 88 + 65) + (0xAF ^ 0x9A);
        v.lllIIlllII[253] = 103 + 68 - 55 + 69;
        v.lllIIlllII[254] = 74 + 129 - 135 + 112 + (0xFE ^ 0x8D) - (15 + 26 - -27 + 65) + (0x9D ^ 0x85);
        v.lllIIlllII[255] = 110 + 35 - 55 + 97;
        v.lllIIlllII[256] = 18 + 165 - 140 + 145;
        v.lllIIlllII[257] = 0xFFFFFF6F & 0x7FD0;
        v.lllIIlllII[258] = 39 + 143 - 179 + 150 + (0x15 ^ 0x40) - (146 + 124 - 139 + 86) + (108 + 164 - 224 + 120);
        v.lllIIlllII[259] = (0x90 ^ 0xB5) + (127 + 88 - 191 + 126) - (0x2D ^ 9) + (0x4F ^ 0x68);
        v.lllIIlllII[260] = 81 + 139 - 215 + 186;
        v.lllIIlllII[261] = (0xA8 ^ 0xA6) + (72 + 31 - 25 + 70) - (0x37 ^ 0x21) + (0x76 ^ 0x42);
        v.lllIIlllII[262] = 164 + 139 - 274 + 164;
        v.lllIIlllII[263] = 19 + 1 - -108 + 47 + (0xB ^ 0x38) - (0x86 ^ 0xB4) + (0x3F ^ 0x2D);
        v.lllIIlllII[264] = 43 + 158 - 162 + 156;
        v.lllIIlllII[265] = 174 + 8 - 143 + 157;
        v.lllIIlllII[266] = (0x9B ^ 0xBB) + (61 + 21 - -18 + 35) - (0x37 ^ 0x74) + (0x58 ^ 0x39);
        v.lllIIlllII[267] = 96 + 155 - 232 + 162 + (0x3C ^ 0x66) - (0x4B ^ 0x1F) + (0x6F ^ 0x64);
        v.lllIIlllII[268] = 0xFFFFCDBF & 0x3FE3;
        v.lllIIlllII[269] = 2 + (23 + 131 - 141 + 129) - (94 + 76 - 69 + 41) + (27 + 147 - 5 + 28);
        v.lllIIlllII[270] = 129 + 33 - 73 + 97 + (0xF4 ^ 0xAC) - (1 + 37 - 1 + 94) + (0x55 ^ 0x6C);
        v.lllIIlllII[271] = (0x45 ^ 2) + (92 + 38 - 112 + 148) - (160 + 150 - 124 + 33) + (11 + 149 - -3 + 20);
        v.lllIIlllII[272] = (0x69 ^ 0x59) + (0x6E ^ 0x24) - 2 + (0x34 ^ 0x66);
        v.lllIIlllII[273] = (0x71 ^ 0x28) + (0x18 ^ 0x72) - (88 + 119 - 115 + 66) + (70 + 139 - 169 + 126);
        v.lllIIlllII[274] = 162 + 194 - 194 + 42;
        v.lllIIlllII[275] = (0xB4 ^ 0xBC) + (0x1A ^ 0x4F) - -(0xC2 ^ 0xAE) + (0xA1 ^ 0xA5);
        v.lllIIlllII[276] = 147 + 175 - 156 + 40;
        v.lllIIlllII[277] = (0x24 ^ 5) + (0x3A ^ 0x4E) - -(0x73 ^ 0x7E) + (2 ^ 0x2F);
        v.lllIIlllII[278] = 187 + 76 - 159 + 104;
        v.lllIIlllII[279] = 31 + 141 - 131 + 158 + (0x5B ^ 0x70) - (81 + 41 - -21 + 90) + (17 + 42 - -19 + 122);
        v.lllIIlllII[280] = 71 + 18 - 7 + 63 + (135 + 50 - 96 + 89) - (17 + 15 - -34 + 78) + (0x37 ^ 0x28);
        v.lllIIlllII[281] = (0xF1 ^ 0xC2) + (0x59 ^ 0x4C) - (0x65 ^ 0x73) + (1 + 127 - 93 + 126);
        v.lllIIlllII[282] = (0xC ^ 0x78) + (107 + 45 - 45 + 102) - (44 + 69 - 104 + 129) + (0x38 ^ 0x21);
        v.lllIIlllII[283] = 58 + 29 - -38 + 88;
        v.lllIIlllII[284] = (0x32 ^ 0x20) + (0xA3 ^ 0x9C) - -(0x6F ^ 0x17) + (0x9E ^ 0x93);
        v.lllIIlllII[285] = 120 + 135 - 180 + 140;
        v.lllIIlllII[286] = 99 + 114 - 98 + 49 + (0x5E ^ 6) - (0x6C ^ 0x2A) + (0x9C ^ 0xBE);
        v.lllIIlllII[287] = (0xD7 ^ 0x97) + (0x87 ^ 0xA3) - -(0x43 ^ 0x60) + (0x72 ^ 0x20);
        v.lllIIlllII[288] = (0x1D ^ 0x23) + (53 + 25 - 21 + 71) - (0x79 ^ 0x33) + (0x64 ^ 2);
        v.lllIIlllII[289] = 161 + 132 - 159 + 85;
        v.lllIIlllII[290] = 80 + 57 - 48 + 94 + (0xDA ^ 0xB2) - (0x79 ^ 0xD) + (0x7F ^ 0x4E);
        v.lllIIlllII[291] = (8 ^ 0x23) + (108 + 28 - 124 + 130) - -(0x55 ^ 0x52) + (0x18 ^ 5);
        v.lllIIlllII[292] = 136 + 126 - 248 + 208;
        v.lllIIlllII[293] = 61 + 149 - 24 + 19 + (34 + 149 - 76 + 81) - (177 + 114 - 75 + 7) + (0x7E ^ 0x4B);
        v.lllIIlllII[294] = 203 + 36 - 35 + 20;
        v.lllIIlllII[295] = 79 + 56 - 4 + 3 + (134 + 122 - 138 + 21) - (91 + 62 - 67 + 83) + (0x55 ^ 0x2C);
        v.lllIIlllII[296] = 13 + 124 - 97 + 139 + (0xB6 ^ 0xBA) - -(0x91 ^ 0x8E) + (0x3F ^ 0x3B);
        v.lllIIlllII[297] = (0x20 ^ 0xD) + (116 + 21 - 66 + 105) - (0xAB ^ 0xB0) + (0x4B ^ 0x69);
        v.lllIIlllII[298] = (0xB2 ^ 0x8D) + (0x69 ^ 0x48) - (0x41 ^ 7) + (43 + 183 - 106 + 83);
        v.lllIIlllII[299] = (0 ^ 0x15) + (0x28 ^ 0x53) - -(0x6A ^ 0x21) + (0x91 ^ 0x9A);
        v.lllIIlllII[300] = 205 + 173 - 265 + 118;
        v.lllIIlllII[301] = (0x41 ^ 0x28) + (0x9B ^ 0x91) - (0x39 ^ 0x6A) + (83 + 52 - 23 + 88);
        v.lllIIlllII[302] = 38 + 87 - 42 + 51 + (0x14 ^ 8) - (0x78 ^ 0x50) + (0x10 ^ 0x60);
        v.lllIIlllII[303] = 209 + 115 - 112 + 23;
        v.lllIIlllII[304] = (0xEF ^ 0xBE) + (140 + 96 - 52 + 40) - (10 + 3 - 1 + 132) + (4 ^ 0x4F);
        v.lllIIlllII[305] = 89 + 17 - -64 + 67;
        v.lllIIlllII[306] = (0x40 ^ 0x1E) + (109 + 98 - 185 + 140) - (24 + 41 - -66 + 68) + (115 + 26 - 68 + 108);
        v.lllIIlllII[307] = 16 + 142 - 73 + 154;
        v.lllIIlllII[308] = 173 + 79 - 97 + 85;
        v.lllIIlllII[309] = 117 + 151 - 222 + 195;
        v.lllIIlllII[310] = (0x31 ^ 0x6D) + (141 + 84 - 59 + 6) - (6 + 2 - 7 + 185) + (162 + 85 - 156 + 73);
        v.lllIIlllII[311] = 214 + 136 - 265 + 158;
        v.lllIIlllII[312] = 112 + 187 - 148 + 93;
        v.lllIIlllII[313] = (0xC8 ^ 0x98) + (159 + 95 - 188 + 103) - (0xC6 ^ 0x85) + (0x27 ^ 0x18);
        v.lllIIlllII[314] = (0x66 ^ 0x51) + (72 + 103 - 126 + 88) - (0x66 ^ 0x16) + (149 + 74 - 145 + 88);
        v.lllIIlllII[315] = 36 + 154 - 140 + 197;
        v.lllIIlllII[316] = 52 + 39 - 7 + 87 + (75 + 98 - 22 + 48) - (0xFFFF8DB3 & 0x734F) + (32 + 54 - -35 + 16);
        v.lllIIlllII[317] = (0x9E ^ 0x84) + (2 + 137 - 44 + 43) - (0x7F ^ 0x25) + (66 + 158 - 141 + 92);
        v.lllIIlllII[318] = 101 + 220 - 191 + 120;
        v.lllIIlllII[319] = 174 + 54 - -15 + 8;
        v.lllIIlllII[320] = 57 + 171 - 177 + 201;
        v.lllIIlllII[321] = 213 + 233 - 342 + 149;
        v.lllIIlllII[322] = 93 + 129 - 211 + 124 + (0xD6 ^ 0x8F) - (8 ^ 6) + (0x52 ^ 0x7E);
        v.lllIIlllII[323] = (0xDF ^ 0x81) + (0x2A ^ 0x4B) - (0xD6 ^ 0x8D) + (53 + 29 - -12 + 61);
        v.lllIIlllII[324] = -(0xFFFF9375 & 0x6EFF) & (0xFFFFE3F6 & 0x1F7D);
        v.lllIIlllII[325] = -(0xFFFFF7ED & 0x7E77) & (0xFFFFFF77 & 0x77ED);
        v.lllIIlllII[326] = -(0xFFFFF2FF & 0x7D6E) & (0xFFFFF56F & 0x7BFF);
        v.lllIIlllII[327] = -(0xFFFFF289 & 0x6DF7) & (0xFFFFF3CB & 0x6DB7);
        v.lllIIlllII[328] = -(0xFFFFFED7 & 0x7DFC) & (0xFFFFFFD7 & 0x7DFF);
        v.lllIIlllII[329] = -(0xFFFFEAF9 & 0x3FD7) & (0xFFFFBFFF & 0x6BD5);
        v.lllIIlllII[330] = -(0xFFFFE09D & 0x7FFB) & (0xFFFFFFFF & 0x7FFB);
        v.lllIIlllII[331] = 0xFFFFB36E & 0x4D97;
        v.lllIIlllII[332] = 0xFFFFE32F & 0x1DD7;
        v.lllIIlllII[333] = 0xFFFFD17C & 0x2F8B;
        v.lllIIlllII[334] = -(0xFFFFFEC1 & 0x2DBF) & (0xFFFFFDFF & 0x2F89);
        v.lllIIlllII[335] = 0xFFFFADDF & 0x532A;
        v.lllIIlllII[336] = 0xFFFFF91B & 0x7EF;
        v.lllIIlllII[337] = 0xFFFFBFCD & 0x413E;
        v.lllIIlllII[338] = -(0xFFFFFAD7 & 0x7DE9) & (0xFFFFF9ED & 0x7FDF);
        v.lllIIlllII[339] = 0xFFFFEFEE & 0x111F;
        v.lllIIlllII[340] = -(0xFFFF9AF7 & 0x7D69) & (0xFFFF9FEF & 0x797F);
        v.lllIIlllII[341] = 0xFFFFA3BB & 0x5D54;
        v.lllIIlllII[342] = 0xFFFFF7D3 & 0x93D;
        v.lllIIlllII[343] = 0xFFFFEFDE & 0x1133;
        v.lllIIlllII[344] = -(0xFFFFBED5 & 0x75EF) & (0xFFFFF5F7 & 0x3FDF);
        v.lllIIlllII[345] = 0xFFFFB394 & 0x4D7F;
        v.lllIIlllII[346] = 0xFFFFD91D & 0x27F7;
        v.lllIIlllII[347] = -(0xFFFFEE6B & 0x7DBE) & (0xFFFFFF3F & 0x6DFF);
        v.lllIIlllII[348] = 0xFFFFBF9F & 0x4177;
        v.lllIIlllII[349] = -(0xFFFFDEF7 & 0x3FCD) & (0xFFFF9FDE & 0x7FFD);
        v.lllIIlllII[350] = -(0xFFFF9EAD & 0x7F73) & (0xFFFFFF39 & 0x1FFF);
        v.lllIIlllII[351] = 0xFFFFEB1F & 0x15FA;
        v.lllIIlllII[352] = 0xFFFF87DB & 0x793F;
        v.lllIIlllII[353] = -(0xFFFFFEFF & 0x5922) & (0xFFFFDDFF & 0x7B3D);
        v.lllIIlllII[354] = -(0xFFFFFE37 & 0x4FE9) & (0xFFFFFFFD & 0x4F3F);
        v.lllIIlllII[355] = -(0xFFFFF4F7 & 0x3FE9) & (0xFFFFBFFF & 0x75FE);
        v.lllIIlllII[356] = -(0xFFFFEFED & 0x5EB3) & (0xFFFFCFBF & Short.MAX_VALUE);
        v.lllIIlllII[357] = -(0xFFFFD046 & 0x7FFB) & (0xFFFFF97F & 0x57E1);
        v.lllIIlllII[358] = -(0x90 ^ 0xC1) & (0xFFFFDFDB & 0x6F7F);
        v.lllIIlllII[359] = 0xFFFFC739 & 0x39E7;
        v.lllIIlllII[360] = -(0xFFFFBEFF & 0x7F5E) & (0xFFFFBF7F & Short.MAX_VALUE);
        v.lllIIlllII[361] = 0xFFFFD52B & 0x2BF7;
        v.lllIIlllII[362] = 0xFFFF9DF7 & 0x632C;
        v.lllIIlllII[363] = -(0xFFFFF83B & 0x3FCD) & (0xFFFFB9FD & 0x7F2F);
        v.lllIIlllII[364] = -(0xFFFFF8BA & 0x4FDF) & (0xFFFFC9BF & Short.MAX_VALUE);
        v.lllIIlllII[365] = 0xFFFFBFFF & 0x4127;
        v.lllIIlllII[366] = -(0xFFFFFBFB & 0x3EDC) & (0xFFFFBBFF & Short.MAX_VALUE);
        v.lllIIlllII[367] = 0xFFFFADFB & 0x532D;
        v.lllIIlllII[368] = 0xFFFFF1DD & 0x3FBB;
        v.lllIIlllII[369] = 0xFFFFBFBF & 0x71DB;
        v.lllIIlllII[370] = -(0xFFFF9FFF & 0x7346) & (0xFFFF9FF7 & 0x7FFD);
        v.lllIIlllII[371] = -(0xFFFFD197 & 0x6FEA) & (0xFFFFFFAF & 0x4FFB);
        v.lllIIlllII[372] = -(0xFFFFDBAF & 0x6C75) & (0xFFFFFFBF & 0x6DF7);
        v.lllIIlllII[373] = -(0xFFFF95DE & 0x7EF7) & (0xFFFFFFFF & 0x15FF);
        v.lllIIlllII[374] = 0xFFFF95AB & 0x6B7F;
        v.lllIIlllII[375] = -(0xFFFFF797 & 0x7A69) & (0xFFFFFBEC & 0x773F);
        v.lllIIlllII[376] = 0xFFFFB36F & 0x4DBD;
        v.lllIIlllII[377] = 0xFFFFFB7F & 0x5AE;
        v.lllIIlllII[378] = -(0xFFFFBAC7 & 0x7FF9) & (0xFFFFFFFF & 0x3BEF);
        v.lllIIlllII[379] = 0xFFFFB135 & 0x4FFA;
        v.lllIIlllII[380] = -(0xFFFFFF77 & 0x73CB) & (0xFFFFFFF7 & Short.MAX_VALUE);
        v.lllIIlllII[381] = -(0xFFFFDFCF & 0x76BF) & (0xFFFFD7FF & 0x7FBF);
        v.lllIIlllII[382] = 0xFFFFCD7A & 0x33B7;
        v.lllIIlllII[383] = 0xFFFFC5BF & 0x3B73;
        v.lllIIlllII[384] = -(0xFFFFF7C2 & 0x78FF) & (0xFFFFFFFF & 0x7EED);
        v.lllIIlllII[385] = -(0xFFFFB6D1 & 0x796F) & (0xFFFFBFFF & 0x7CF7);
        v.lllIIlllII[386] = -(0xFFFFFDBF & 0x42CD) & (0xFFFFCEFF & 0x7FBF);
        v.lllIIlllII[387] = 0xFFFFADBC & 0x5EF7;
        v.lllIIlllII[388] = 0xFFFFEDB8 & 0x1EFF;
        v.lllIIlllII[389] = 0xFFFF81B7 & 0x7F7C;
        v.lllIIlllII[390] = -(0xFFFFBBBA & 0x745F) & (0xFFFFF7DF & 0x7EFF);
        v.lllIIlllII[391] = 0xFFFFE73F & 0x19F5;
        v.lllIIlllII[392] = -(0xFFFFCEEB & 0x719E) & (0xFFFFE7FF & 0x59BF);
        v.lllIIlllII[393] = 0xFFFF83F7 & 0x7D3F;
        v.lllIIlllII[394] = 0xFFFF95BE & 0x6B79;
        v.lllIIlllII[395] = 0xFFFFCFCA & 0x3E3F;
        v.lllIIlllII[396] = 0xFFFFCDC9 & 0x3EFF;
        v.lllIIlllII[397] = 0xFFFFE93F & 0x17F9;
        v.lllIIlllII[398] = 0xFFFF81BF & 0x7F7A;
        v.lllIIlllII[399] = 0xFFFF91BF & 0x6F7B;
        v.lllIIlllII[400] = -(0xFFFFFFAE & 0x36D5) & (0xFFFFBFBF & 0x77FF);
        v.lllIIlllII[401] = -(0xFFFFFCF7 & 0x37CB) & (0xFFFFB5FF & Short.MAX_VALUE);
        v.lllIIlllII[402] = 0xFFFFDFFF & 0x27D78;
        v.lllIIlllII[403] = 0xFFFFD488 & 0x2AFFF;
        v.lllIIlllII[404] = -(0xFFFFAB72 & 0x7EEF) & (0xFFFFBEF1 & 0xDFFFF);
        v.lllIIlllII[405] = -(0xFFFFDFBD & 0x6247) & (0xFFFFFFBE & 0xEFBCD);
        v.lllIIlllII[406] = -(0xFFFF81E7 & 0x7F1B) & (0xFFFFFFF2 & 0xE7FFF);
        v.lllIIlllII[407] = 0xFFFFFFBD & 0x1005D2;
        v.lllIIlllII[408] = 0xFFFFAB13 & 0x1674FC;
        v.lllIIlllII[409] = -(0xFFFFFFEF & 0x5957) & (0xFFFFFFF6 & 0x17FFFF);
        v.lllIIlllII[410] = -(0xFFFFC166 & 0x7F9F) & (0xFFFFFDFF & 0x11CF35);
        v.lllIIlllII[411] = -(0xFFFFAFF7 & 0x7D2F) & (0xFFFFBFF6 & 0x137FFF);
        v.lllIIlllII[412] = 0xFFFFD7D9 & 0xAAF76;
        v.lllIIlllII[413] = -(0xFFFFEF7B & 0x7287) & (0xFFFFFFF7 & 0xC6FFA);
        v.lllIIlllII[414] = 0xFFFFF95E & 0x1E7FF;
        v.lllIIlllII[415] = -(0xFFFFFFD7 & 0x46BA) & (0xFFFFCFFF & 0x27EFF);
        v.lllIIlllII[416] = 0xFFFFFBAA & 0x277D;
        v.lllIIlllII[417] = -(0xFFFFFDB7 & 0x52CA) & (0xFFFFF79F & 0x7DFD);
        v.lllIIlllII[418] = -(0xFFFF98FF & 0x7F92) & (0xFFFFDBFD & 0x7EFB);
        v.lllIIlllII[419] = -(0xFFFFDD9B & 0x3BE6) & (0xFFFFFFFD & 0x5FD3);
        v.lllIIlllII[420] = 0xFFFFADAC & 0x7B57;
        v.lllIIlllII[421] = -(0xFFFFD214 & 0x6DFF) & (0xFFFFEDFF & 0x7EFF);
        v.lllIIlllII[422] = -(0xFFFFF57F & 0x5EF2) & (0xFFFFFDFF & 0x77FF);
        v.lllIIlllII[423] = -(0xFFFFFED7 & 0x332E) & (0xFFFFF7F7 & 0x3EEF);
        v.lllIIlllII[424] = 0xFFFFADFF & 0x57AA;
        v.lllIIlllII[425] = -(0xFFFFDFF5 & 0x668B) & (0xFFFFE7FE & 0x7FB5);
        v.lllIIlllII[426] = -(0xFFFFEB1B & 0x56E7) & (0xFFFFFEBF & 0x77FE);
        v.lllIIlllII[427] = 0xFFFFF7FF & 0x3FDC;
        v.lllIIlllII[428] = -(0x7E ^ 0x5F) & (0xFFFFEFFE & 0x3EED);
        v.lllIIlllII[429] = -(0xFFFFDAFB & 0x3D65) & (0xFFFFFBFD & 0x7FFE);
        v.lllIIlllII[430] = -(0xFFFF9FDF & 0x74B3) & (0xFFFFFFFF & 0x7FFE);
        v.lllIIlllII[431] = 0xFFFFFFB6 & 0x3FF;
        v.lllIIlllII[432] = -(0xFFFFDAA9 & 0x3D77) & (0xFFFF9C3B & 0x7FFE);
        v.lllIIlllII[433] = 0xFFFF87FF & 0x793E;
        v.lllIIlllII[434] = 0xFFFFE57F & 0x1BBF;
        v.lllIIlllII[435] = -(121 + 159 - 153 + 45) & (0xFFFFFFEF & Short.MAX_VALUE);
        v.lllIIlllII[436] = -(42 + 146 - 44 + 33) & (0xFFFFFFFB & 0x7FFD);
        v.lllIIlllII[437] = -(0xFFFFF0BF & 0x2FFF) & (0xFFFFAFFF & 0x71FF);
        v.lllIIlllII[438] = -(0xFFFFFA7D & 0x4D9B) & (0xFFFFEB7E & 0x5DDB);
        v.lllIIlllII[439] = 0xFFFFCFF3 & 0x314F;
        v.lllIIlllII[440] = -(0xFFFF8D3F & 0x7EFA) & (0xFFFFAF7F & 0x5DFD);
        v.lllIIlllII[441] = 0xFFFFC747 & 0x39FD;
        v.lllIIlllII[442] = -(0xFFFFFCB7 & 0x7FD9) & (0xFFFFFDF6 & 0x7FDF);
        v.lllIIlllII[443] = -(0xFFFFDDED & 0x73BF) & (0xFFFFDFFE & Short.MAX_VALUE);
        v.lllIIlllII[444] = -(0xFFFFD231 & 0x3DFE) & (0xFFFFFCBF & 0x1FFF);
        v.lllIIlllII[445] = 0xFFFFFF6D & 0xED3;
        v.lllIIlllII[446] = 0xFFFFFEFB & 0xD8D;
        v.lllIIlllII[447] = 0xFFFFBE2E & 0x4FD5;
        v.lllIIlllII[448] = 0xFFFFBDDF & 0x67A7;
        v.lllIIlllII[449] = -(0xFFFFF3FF & 0x4DE2) & (0xFFFFFFF7 & 0x4FFF);
        v.lllIIlllII[450] = 0xFFFFAECE & 0x5DBF;
        v.lllIIlllII[451] = 0xFFFFFFFD & 0xE33;
        v.lllIIlllII[452] = 0xFFFFCE7D & 0x3DFE;
        v.lllIIlllII[453] = 0xFFFFEE32 & 0x1FFF;
        v.lllIIlllII[454] = 0xFFFFA967 & 0x57DF;
        v.lllIIlllII[455] = 0xFFFFD3F9 & 0x2D4E;
        v.lllIIlllII[456] = 0xFFFFFB7F & 0x5C9;
        v.lllIIlllII[457] = -(0xFFFFF7B2 & 0x7AFF) & (0xFFFFFBFB & 0x77FF);
        v.lllIIlllII[458] = -(0xFFFFAE33 & 0x7FFD) & (0xFFFFAF7B & Short.MAX_VALUE);
        v.lllIIlllII[459] = -(0xFFFFCCDC & 0x7FB7) & (0xFFFFFDFF & 0x4FDF);
        v.lllIIlllII[460] = -(0xFFFFE8AB & 0x3F77) & (0xFFFFA9FF & 0x7F6F);
        v.lllIIlllII[461] = -(0xFFFFDE8D & 0x7573) & (0xFFFFDFCE & 0x757F);
        v.lllIIlllII[462] = 0xFFFFADEF & 0x535F;
        v.lllIIlllII[463] = -(0xFFFFFC4F & 0x4FB8) & (0xFFFFCD77 & 0x7FDF);
        v.lllIIlllII[464] = 0xFFFFA9F9 & 0x5757;
        v.lllIIlllII[465] = 0xFFFFFFF7 & 0x15A;
        v.lllIIlllII[466] = -(0xFFFFD28D & 0x3FFF) & (0xFFFFBBDF & 0x57FF);
        v.lllIIlllII[467] = 0xFFFF9DD6 & 0x637D;
        v.lllIIlllII[468] = 0xFFFFABF7 & 0x555D;
        v.lllIIlllII[469] = 0xFFFF99FF & 0x6756;
        v.lllIIlllII[470] = 0xFFFFD35F & 0x2DF7;
        v.lllIIlllII[471] = 0xFFFFF7FB & 0x95C;
        v.lllIIlllII[472] = -(0xFFFFFD6F & 0x42B7) & (0xFFFFC97F & 0x77FF);
        v.lllIIlllII[473] = 0xFFFF9BFE & 0x655B;
        v.lllIIlllII[474] = -(0xFFFFEFE7 & 0x7C9D) & (0xFFFFFDFF & 0x6FDF);
        v.lllIIlllII[475] = -(0xFFFFDED3 & 0x3FAF) & (0xFFFFFFFE & 0x1FDF);
        v.lllIIlllII[476] = -(0xFFFFDE63 & 0x7BBF) & (0xFFFFDBFF & 0x7F7F);
    }

    private static boolean llIIIIlIlIIll(int n2) {
        return n2 == 0;
    }

    private static void bb() {
        if (v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dl), lllIIlllII[10])) {
            if (v.llIIIIlIlIIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
            }
            if (v.llIIIIlIlIIIl(Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
            }
            AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[357]];
            Movement.walkTo((WorldPoint)dl);
            0;
            Time.sleepTicks((int)lllIIlllII[0]);
            0;
        }
        if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dl), lllIIlllII[10])) {
            if (v.llIIIIlIlIIll(Bank.isOpen() ? 1 : 0)) {
                a.a();
            }
            if (v.llIIIIlIlIIIl(Bank.isOpen() ? 1 : 0)) {
                if (v.llIIIIlIlIllI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lllIIlllII[8]);
                    0;
                }
                if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[215])) {
                    a.a(lllIIlllII[30], lllIIlllII[15]);
                    a.b(f.ba, lllIIlllII[0]);
                }
                if (v.llIIIIlIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[215])) {
                    int[] nArray = new int[lllIIlllII[0]];
                    nArray[v.lllIIlllII[1]] = lllIIlllII[42];
                    if (v.llIIIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lllIIlllII[0]];
                        nArray2[v.lllIIlllII[1]] = lllIIlllII[42];
                        if (v.llIIIIlIlIIll(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                            a.a(lllIIlllII[42], lllIIlllII[0]);
                        }
                    }
                    int[] nArray3 = new int[lllIIlllII[0]];
                    nArray3[v.lllIIlllII[1]] = lllIIlllII[43];
                    if (v.llIIIIlIlIIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                        int[] nArray4 = new int[lllIIlllII[0]];
                        nArray4[v.lllIIlllII[1]] = lllIIlllII[43];
                        if (v.llIIIIlIlIIll(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                            a.a(lllIIlllII[43], lllIIlllII[0]);
                        }
                    }
                    int[] nArray5 = new int[lllIIlllII[0]];
                    nArray5[v.lllIIlllII[1]] = lllIIlllII[45];
                    if (v.llIIIIlIlIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                        int[] nArray6 = new int[lllIIlllII[0]];
                        nArray6[v.lllIIlllII[1]] = lllIIlllII[45];
                        if (v.llIIIIlIlIIll(Equipment.contains((int[])nArray6) ? 1 : 0)) {
                            a.a(lllIIlllII[45], lllIIlllII[0]);
                        }
                    }
                    int[] nArray7 = new int[lllIIlllII[0]];
                    nArray7[v.lllIIlllII[1]] = lllIIlllII[41];
                    if (v.llIIIIlIlIIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                        int[] nArray8 = new int[lllIIlllII[0]];
                        nArray8[v.lllIIlllII[1]] = lllIIlllII[41];
                        if (v.llIIIIlIlIIll(Equipment.contains((int[])nArray8) ? 1 : 0)) {
                            a.a(lllIIlllII[41], lllIIlllII[0]);
                        }
                    }
                    int[] nArray9 = new int[lllIIlllII[0]];
                    nArray9[v.lllIIlllII[1]] = lllIIlllII[47];
                    if (v.llIIIIlIlIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                        int[] nArray10 = new int[lllIIlllII[0]];
                        nArray10[v.lllIIlllII[1]] = lllIIlllII[47];
                        if (v.llIIIIlIlIIll(Equipment.contains((int[])nArray10) ? 1 : 0)) {
                            a.a(lllIIlllII[47], lllIIlllII[0]);
                        }
                    }
                    int[] nArray11 = new int[lllIIlllII[0]];
                    nArray11[v.lllIIlllII[1]] = lllIIlllII[358];
                    if (v.llIIIIlIlIIIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                        int[] nArray12 = new int[lllIIlllII[0]];
                        nArray12[v.lllIIlllII[1]] = lllIIlllII[358];
                        if (v.llIIIIlIlIIll(Equipment.contains((int[])nArray12) ? 1 : 0)) {
                            a.a(lllIIlllII[358], lllIIlllII[0]);
                        }
                    }
                    int[] nArray13 = new int[lllIIlllII[0]];
                    nArray13[v.lllIIlllII[1]] = lllIIlllII[40];
                    if (v.llIIIIlIlIIIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
                        int[] nArray14 = new int[lllIIlllII[0]];
                        nArray14[v.lllIIlllII[1]] = lllIIlllII[40];
                        if (v.llIIIIlIlIIll(Equipment.contains((int[])nArray14) ? 1 : 0)) {
                            a.a(lllIIlllII[40], lllIIlllII[0]);
                        }
                    }
                    int[] nArray15 = new int[lllIIlllII[0]];
                    nArray15[v.lllIIlllII[1]] = lllIIlllII[49];
                    if (v.llIIIIlIlIIIl(Bank.contains((int[])nArray15) ? 1 : 0)) {
                        int[] nArray16 = new int[lllIIlllII[0]];
                        nArray16[v.lllIIlllII[1]] = lllIIlllII[49];
                        if (v.llIIIIlIlIIll(Equipment.contains((int[])nArray16) ? 1 : 0)) {
                            a.a(lllIIlllII[49], lllIIlllII[0]);
                        }
                    }
                    int[] nArray17 = new int[lllIIlllII[0]];
                    nArray17[v.lllIIlllII[1]] = lllIIlllII[49];
                    if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray17) ? 1 : 0)) {
                        int[] nArray18 = new int[lllIIlllII[0]];
                        nArray18[v.lllIIlllII[1]] = lllIIlllII[49];
                        Inventory.getFirst((int[])nArray18).interact(lllIIlIIlI[lllIIlllII[359]]);
                    }
                    if (v.llIIIIlIlIIIl(Inventory.contains((int[])f.bk) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.bk).interact(lllIIlIIlI[lllIIlllII[360]]);
                    }
                    int[] nArray19 = new int[lllIIlllII[0]];
                    nArray19[v.lllIIlllII[1]] = lllIIlllII[42];
                    if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                        int[] nArray20 = new int[lllIIlllII[0]];
                        nArray20[v.lllIIlllII[1]] = lllIIlllII[42];
                        Inventory.getFirst((int[])nArray20).interact(lllIIlIIlI[lllIIlllII[361]]);
                    }
                    int[] nArray21 = new int[lllIIlllII[0]];
                    nArray21[v.lllIIlllII[1]] = lllIIlllII[43];
                    if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray21) ? 1 : 0)) {
                        int[] nArray22 = new int[lllIIlllII[0]];
                        nArray22[v.lllIIlllII[1]] = lllIIlllII[43];
                        Inventory.getFirst((int[])nArray22).interact(lllIIlIIlI[lllIIlllII[362]]);
                    }
                    int[] nArray23 = new int[lllIIlllII[0]];
                    nArray23[v.lllIIlllII[1]] = lllIIlllII[45];
                    if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray23) ? 1 : 0)) {
                        int[] nArray24 = new int[lllIIlllII[0]];
                        nArray24[v.lllIIlllII[1]] = lllIIlllII[45];
                        Inventory.getFirst((int[])nArray24).interact(lllIIlIIlI[lllIIlllII[363]]);
                    }
                    int[] nArray25 = new int[lllIIlllII[0]];
                    nArray25[v.lllIIlllII[1]] = lllIIlllII[41];
                    if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray25) ? 1 : 0)) {
                        int[] nArray26 = new int[lllIIlllII[0]];
                        nArray26[v.lllIIlllII[1]] = lllIIlllII[41];
                        Inventory.getFirst((int[])nArray26).interact(lllIIlIIlI[lllIIlllII[364]]);
                    }
                    int[] nArray27 = new int[lllIIlllII[0]];
                    nArray27[v.lllIIlllII[1]] = lllIIlllII[47];
                    if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray27) ? 1 : 0)) {
                        int[] nArray28 = new int[lllIIlllII[0]];
                        nArray28[v.lllIIlllII[1]] = lllIIlllII[47];
                        Inventory.getFirst((int[])nArray28).interact(lllIIlIIlI[lllIIlllII[365]]);
                    }
                    int[] nArray29 = new int[lllIIlllII[0]];
                    nArray29[v.lllIIlllII[1]] = lllIIlllII[358];
                    if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray29) ? 1 : 0)) {
                        int[] nArray30 = new int[lllIIlllII[0]];
                        nArray30[v.lllIIlllII[1]] = lllIIlllII[358];
                        Inventory.getFirst((int[])nArray30).interact(lllIIlIIlI[lllIIlllII[366]]);
                    }
                    int[] nArray31 = new int[lllIIlllII[0]];
                    nArray31[v.lllIIlllII[1]] = lllIIlllII[40];
                    if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray31) ? 1 : 0)) {
                        int[] nArray32 = new int[lllIIlllII[0]];
                        nArray32[v.lllIIlllII[1]] = lllIIlllII[40];
                        Inventory.getFirst((int[])nArray32).interact(lllIIlIIlI[lllIIlllII[367]]);
                    }
                    if (v.llIIIIlIlIIll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepTicks((int)lllIIlllII[9]);
                        0;
                    }
                    int[] nArray33 = new int[lllIIlllII[0]];
                    nArray33[v.lllIIlllII[1]] = lllIIlllII[19];
                    if (v.llIIIIlIlIIIl(Bank.contains((int[])nArray33) ? 1 : 0)) {
                        a.a(lllIIlllII[19], lllIIlllII[0]);
                    }
                    int[] nArray34 = new int[lllIIlllII[0]];
                    nArray34[v.lllIIlllII[1]] = lllIIlllII[19];
                    if (v.llIIIIlIlIIll(Inventory.contains((int[])nArray34) ? 1 : 0)) {
                        int[] nArray35 = new int[lllIIlllII[0]];
                        nArray35[v.lllIIlllII[1]] = lllIIlllII[368];
                        if (v.llIIIIlIlIIIl(Bank.contains((int[])nArray35) ? 1 : 0)) {
                            a.a(lllIIlllII[368], lllIIlllII[0]);
                        }
                    }
                    int[] nArray36 = new int[lllIIlllII[0]];
                    nArray36[v.lllIIlllII[1]] = lllIIlllII[19];
                    if (v.llIIIIlIlIIll(Inventory.contains((int[])nArray36) ? 1 : 0)) {
                        int[] nArray37 = new int[lllIIlllII[0]];
                        nArray37[v.lllIIlllII[1]] = lllIIlllII[368];
                        if (v.llIIIIlIlIIll(Inventory.contains((int[])nArray37) ? 1 : 0)) {
                            a.a(lllIIlllII[369], lllIIlllII[0]);
                        }
                    }
                    a.a(lllIIlllII[39], lllIIlllII[8]);
                    a.a(lllIIlllII[25], Inventory.getFreeSlots());
                    Time.sleepTicks((int)lllIIlllII[8]);
                    0;
                    if (v.llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ba() {
        int n2;
        int[] nArray = new int[lllIIlllII[0]];
        nArray[v.lllIIlllII[1]] = lllIIlllII[39];
        if (v.llIIIIlIlIlII(Inventory.getAll((int[])nArray).size(), lllIIlllII[7]) && v.llIIIIlIlIIIl(Inventory.contains(item -> item.getName().contains(lllIIlIIlI[lllIIlllII[5]])) ? 1 : 0)) {
            String[] stringArray = new String[lllIIlllII[0]];
            stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[356]];
            if (v.llIIIIlIlIlII(Inventory.getAll((String[])stringArray).size(), lllIIlllII[29])) {
                n2 = lllIIlllII[0];
                0;
                if (1 >= 0) return n2 != 0;
                return ((0xB8 ^ 0x89) & ~(0x21 ^ 0x10)) != 0;
            }
        }
        n2 = lllIIlllII[1];
        return n2 != 0;
    }

    private static String llIIIIIlIIlII(String lllllllllllllllllIlllIIlIllIIIIl, String lllllllllllllllllIlllIIlIllIIIII) {
        try {
            SecretKeySpec lllllllllllllllllIlllIIlIllIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIIlIllIIIII.getBytes(StandardCharsets.UTF_8)), lllIIlllII[13]), "DES");
            Cipher lllllllllllllllllIlllIIlIllIIlIl = Cipher.getInstance("DES");
            lllllllllllllllllIlllIIlIllIIlIl.init(lllIIlllII[6], lllllllllllllllllIlllIIlIllIIllI);
            return new String(lllllllllllllllllIlllIIlIllIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIIlIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlllIIlIllIIlII) {
            lllllllllllllllllIlllIIlIllIIlII.printStackTrace();
            return null;
        }
    }

    private static String llIIIIIlIIllI(String lllllllllllllllllIlllIIlIlllIIll, String lllllllllllllllllIlllIIlIlllIlll) {
        lllllllllllllllllIlllIIlIlllIIll = new String(Base64.getDecoder().decode(lllllllllllllllllIlllIIlIlllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlllIIlIlllIllI = new StringBuilder();
        char[] lllllllllllllllllIlllIIlIlllIlIl = lllllllllllllllllIlllIIlIlllIlll.toCharArray();
        int lllllllllllllllllIlllIIlIlllIlII = lllIIlllII[1];
        char[] lllllllllllllllllIlllIIlIllIlllI = lllllllllllllllllIlllIIlIlllIIll.toCharArray();
        int lllllllllllllllllIlllIIlIllIllIl = lllllllllllllllllIlllIIlIllIlllI.length;
        int lllllllllllllllllIlllIIlIllIllII = lllIIlllII[1];
        while (v.llIIIIlIlIIlI(lllllllllllllllllIlllIIlIllIllII, lllllllllllllllllIlllIIlIllIllIl)) {
            char lllllllllllllllllIlllIIlIllllIIl = lllllllllllllllllIlllIIlIllIlllI[lllllllllllllllllIlllIIlIllIllII];
            lllllllllllllllllIlllIIlIlllIllI.append((char)(lllllllllllllllllIlllIIlIllllIIl ^ lllllllllllllllllIlllIIlIlllIlIl[lllllllllllllllllIlllIIlIlllIlII % lllllllllllllllllIlllIIlIlllIlIl.length]));
            0;
            ++lllllllllllllllllIlllIIlIlllIlII;
            ++lllllllllllllllllIlllIIlIllIllII;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIlllIIlIlllIllI);
    }

    private static String llIIIIIlIIlIl(String lllllllllllllllllIlllIIllIIIIllI, String lllllllllllllllllIlllIIllIIIIlIl) {
        try {
            SecretKeySpec lllllllllllllllllIlllIIllIIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIIllIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlllIIllIIIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlllIIllIIIlIlI.init(lllIIlllII[6], lllllllllllllllllIlllIIllIIIlIll);
            return new String(lllllllllllllllllIlllIIllIIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIIllIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlllIIllIIIlIIl) {
            lllllllllllllllllIlllIIllIIIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIlIlIllI(int n2) {
        return n2 > 0;
    }

    private static boolean llIIIIlIlllII(Object object) {
        return object == null;
    }

    private static boolean llIIIIlIllIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIIIlIlIlIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public static void bc() {
        void lllllllllllllllllIlllIIllIllIlIl;
        WorldArea lllllllllllllllllIlllIIllIllIIll;
        void lllllllllllllllllIlllIIllIllIllI;
        WorldArea worldArea = new WorldArea(lllIIlllII[81], lllIIlllII[370], lllIIlllII[9], lllIIlllII[9], lllIIlllII[1]);
        WorldArea worldArea2 = new WorldArea(lllIIlllII[198], lllIIlllII[199], lllIIlllII[24], lllIIlllII[48], lllIIlllII[1]);
        WorldPoint worldPoint = new WorldPoint(lllIIlllII[371], lllIIlllII[372], lllIIlllII[1]);
        if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(y.dQ), lllIIlllII[4]) && v.llIIIIlIlIIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void lllllllllllllllllIlllIIllIllIlII;
            if (v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lllIIlllII[9])) {
                AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[373]];
                Movement.walkTo((WorldPoint)worldPoint);
                0;
                Time.sleepTicks((int)lllIIlllII[0]);
                0;
            }
            if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIlllIIllIllIlII), lllIIlllII[9])) {
                AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[374]];
                String[] stringArray = new String[lllIIlllII[0]];
                stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[375]];
                TileObjects.getNearest((String[])stringArray).interact(lllIIlIIlI[lllIIlllII[376]]);
                Time.sleepTicks((int)lllIIlllII[8]);
                0;
            }
        }
        if (v.llIIIIlIlIIIl(lllllllllllllllllIlllIIllIllIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[377]];
            String[] stringArray = new String[lllIIlllII[0]];
            stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[378]];
            TileObjects.getNearest((String[])stringArray).interact(lllIIlIIlI[lllIIlllII[379]]);
            Time.sleepTicks((int)lllIIlllII[7]);
            0;
        }
        if (v.llIIIIlIlIIIl((lllllllllllllllllIlllIIllIllIIll = new WorldArea(lllIIlllII[81], lllIIlllII[380], lllIIlllII[10], lllIIlllII[10], lllIIlllII[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[381]];
            String[] stringArray = new String[lllIIlllII[0]];
            stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[382]];
            TileObjects.getNearest((String[])stringArray).interact(lllIIlIIlI[lllIIlllII[383]]);
            Time.sleepTicks((int)lllIIlllII[7]);
            0;
        }
        WorldArea lllllllllllllllllIlllIIllIllIIlI = new WorldArea(lllIIlllII[384], lllIIlllII[385], lllIIlllII[10], lllIIlllII[9], lllIIlllII[0]);
        WorldArea lllllllllllllllllIlllIIllIllIIIl = new WorldArea(lllIIlllII[386], lllIIlllII[387], lllIIlllII[9], lllIIlllII[12], lllIIlllII[0]);
        WorldPoint lllllllllllllllllIlllIIllIllIIII = new WorldPoint(lllIIlllII[81], lllIIlllII[388], lllIIlllII[0]);
        if (v.llIIIIlIlIIIl(lllllllllllllllllIlllIIllIllIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (v.llIIIIlIlIIll(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlllIIllIllIIII) ? 1 : 0)) {
                AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[389]];
                Movement.walkTo((WorldPoint)lllllllllllllllllIlllIIllIllIIII);
                0;
            }
            if (v.llIIIIlIlIIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlllIIllIllIIII) ? 1 : 0)) {
                int[] nArray = new int[lllIIlllII[0]];
                nArray[v.lllIIlllII[1]] = lllIIlllII[390];
                TileObjects.getNearest((int[])nArray).interact(lllIIlIIlI[lllIIlllII[391]]);
                Time.sleepTicks((int)lllIIlllII[7]);
                0;
            }
        }
        if (v.llIIIIlIlIIIl(lllllllllllllllllIlllIIllIllIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[392]];
            String[] stringArray = new String[lllIIlllII[0]];
            stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[393]];
            TileObjects.getNearest((String[])stringArray).interact(lllIIlIIlI[lllIIlllII[394]]);
            Time.sleepTicks((int)lllIIlllII[7]);
            0;
        }
        WorldArea lllllllllllllllllIlllIIllIlIllll = new WorldArea(lllIIlllII[67], lllIIlllII[385], lllIIlllII[101], lllIIlllII[75], lllIIlllII[1]);
        WorldPoint lllllllllllllllllIlllIIllIlIlllI = new WorldPoint(lllIIlllII[395], lllIIlllII[396], lllIIlllII[1]);
        if (v.llIIIIlIlIIIl(lllllllllllllllllIlllIIllIlIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(lllllllllllllllllIlllIIllIllIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllllIlllIIllIlIlllI), lllIIlllII[9])) {
                AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[397]];
                Movement.walkTo((WorldPoint)lllllllllllllllllIlllIIllIlIlllI);
                0;
                Time.sleepTicks((int)lllIIlllII[0]);
                0;
            }
            if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllllIlllIIllIlIlllI), lllIIlllII[9])) {
                AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[398]];
                String[] stringArray = new String[lllIIlllII[0]];
                stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[399]];
                TileObjects.getNearest((String[])stringArray).interact(lllIIlIIlI[lllIIlllII[400]]);
                Time.sleepTicks((int)lllIIlllII[8]);
                0;
            }
        }
        if (v.llIIIIlIlIIIl(lllllllllllllllllIlllIIllIllIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            g.a(lllIIlIIlI[lllIIlllII[401]], cE);
        }
    }

    private static boolean llIIIIlIllIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIIIlIllIll(int n2) {
        return n2 < 0;
    }

    private static int llIIIIlIIllll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llIIIIlIlIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static void Q() {
        block55: {
            d lllllllllllllllllIlllIIllIlIIllI;
            block54: {
                Object lllllllllllllllllIlllIIllIlIIlll;
                block53: {
                    block52: {
                        block51: {
                            block50: {
                                block49: {
                                    block48: {
                                        block47: {
                                            block46: {
                                                block45: {
                                                    block44: {
                                                        block43: {
                                                            block42: {
                                                                block41: {
                                                                    block40: {
                                                                        int[] nArray = new int[lllIIlllII[0]];
                                                                        nArray[v.lllIIlllII[1]] = lllIIlllII[358];
                                                                        if (v.llIIIIlIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                                            d d2 = new d(lllIIlllII[358], lllIIlllII[0], e.c(lllIIlllII[402], lllIIlllII[403]));
                                                                            bv.add(d2);
                                                                            0;
                                                                        }
                                                                        int[] nArray2 = new int[lllIIlllII[0]];
                                                                        nArray2[v.lllIIlllII[1]] = lllIIlllII[40];
                                                                        if (v.llIIIIlIlIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                                                            lllllllllllllllllIlllIIllIlIIlll = new d(lllIIlllII[40], lllIIlllII[0], e.c(lllIIlllII[402], lllIIlllII[403]));
                                                                            bv.add((d)lllllllllllllllllIlllIIllIlIIlll);
                                                                            0;
                                                                        }
                                                                        int[] nArray3 = new int[lllIIlllII[0]];
                                                                        nArray3[v.lllIIlllII[1]] = lllIIlllII[41];
                                                                        if (v.llIIIIlIlIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                                                            lllllllllllllllllIlllIIllIlIIlll = new d(lllIIlllII[41], lllIIlllII[0], e.c(lllIIlllII[404], lllIIlllII[405]));
                                                                            bv.add((d)lllllllllllllllllIlllIIllIlIIlll);
                                                                            0;
                                                                        }
                                                                        int[] nArray4 = new int[lllIIlllII[0]];
                                                                        nArray4[v.lllIIlllII[1]] = lllIIlllII[42];
                                                                        if (v.llIIIIlIlIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                                                            lllllllllllllllllIlllIIllIlIIlll = new d(lllIIlllII[42], lllIIlllII[0], e.c(lllIIlllII[406], lllIIlllII[407]));
                                                                            bv.add((d)lllllllllllllllllIlllIIllIlIIlll);
                                                                            0;
                                                                        }
                                                                        int[] nArray5 = new int[lllIIlllII[0]];
                                                                        nArray5[v.lllIIlllII[1]] = lllIIlllII[43];
                                                                        if (v.llIIIIlIlIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                                                            lllllllllllllllllIlllIIllIlIIlll = new d(lllIIlllII[43], lllIIlllII[0], e.c(lllIIlllII[408], lllIIlllII[409]));
                                                                            bv.add((d)lllllllllllllllllIlllIIllIlIIlll);
                                                                            0;
                                                                        }
                                                                        int[] nArray6 = new int[lllIIlllII[0]];
                                                                        nArray6[v.lllIIlllII[1]] = lllIIlllII[45];
                                                                        if (v.llIIIIlIlIIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                                                            lllllllllllllllllIlllIIllIlIIlll = new d(lllIIlllII[45], lllIIlllII[0], e.c(lllIIlllII[410], lllIIlllII[411]));
                                                                            bv.add((d)lllllllllllllllllIlllIIllIlIIlll);
                                                                            0;
                                                                        }
                                                                        int[] nArray7 = new int[lllIIlllII[0]];
                                                                        nArray7[v.lllIIlllII[1]] = lllIIlllII[47];
                                                                        if (v.llIIIIlIlIIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                                                            lllllllllllllllllIlllIIllIlIIlll = new d(lllIIlllII[47], lllIIlllII[0], e.c(lllIIlllII[412], lllIIlllII[413]));
                                                                            bv.add((d)lllllllllllllllllIlllIIllIlIIlll);
                                                                            0;
                                                                        }
                                                                        int[] nArray8 = new int[lllIIlllII[0]];
                                                                        nArray8[v.lllIIlllII[1]] = lllIIlllII[49];
                                                                        if (v.llIIIIlIlIIll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                                                            lllllllllllllllllIlllIIllIlIIlll = new d(lllIIlllII[49], lllIIlllII[0], e.c(lllIIlllII[414], lllIIlllII[415]));
                                                                            bv.add((d)lllllllllllllllllIlllIIllIlIIlll);
                                                                            0;
                                                                        }
                                                                        int[] nArray9 = new int[lllIIlllII[0]];
                                                                        nArray9[v.lllIIlllII[1]] = lllIIlllII[36];
                                                                        if (v.llIIIIlIlIIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                                                            lllllllllllllllllIlllIIllIlIIlll = new d(lllIIlllII[36], lllIIlllII[0], e.c(lllIIlllII[416], lllIIlllII[417]));
                                                                            bv.add((d)lllllllllllllllllIlllIIllIlIIlll);
                                                                            0;
                                                                        }
                                                                        int[] nArray10 = new int[lllIIlllII[0]];
                                                                        nArray10[v.lllIIlllII[1]] = lllIIlllII[18];
                                                                        if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray10) ? 1 : 0)) break block40;
                                                                        int[] nArray11 = new int[lllIIlllII[0]];
                                                                        nArray11[v.lllIIlllII[1]] = lllIIlllII[18];
                                                                        if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray11) ? 1 : 0)) break block41;
                                                                        int[] nArray12 = new int[lllIIlllII[0]];
                                                                        nArray12[v.lllIIlllII[1]] = lllIIlllII[18];
                                                                        if (!v.llIIIIlIlIIlI(Bank.getFirst((int[])nArray12).getQuantity(), lllIIlllII[15])) break block41;
                                                                    }
                                                                    lllllllllllllllllIlllIIllIlIIlll = new d(lllIIlllII[18], lllIIlllII[15], e.c(lllIIlllII[418], lllIIlllII[419]));
                                                                    bv.add((d)lllllllllllllllllIlllIIllIlIIlll);
                                                                    0;
                                                                }
                                                                int[] nArray = new int[lllIIlllII[0]];
                                                                nArray[v.lllIIlllII[1]] = lllIIlllII[19];
                                                                if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block42;
                                                                int[] nArray13 = new int[lllIIlllII[0]];
                                                                nArray13[v.lllIIlllII[1]] = lllIIlllII[19];
                                                                if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray13) ? 1 : 0)) break block43;
                                                                int[] nArray14 = new int[lllIIlllII[0]];
                                                                nArray14[v.lllIIlllII[1]] = lllIIlllII[19];
                                                                if (!v.llIIIIlIlIIlI(Bank.getFirst((int[])nArray14).getQuantity(), lllIIlllII[15])) break block43;
                                                            }
                                                            lllllllllllllllllIlllIIllIlIIlll = new d(lllIIlllII[19], lllIIlllII[15], e.c(lllIIlllII[418], lllIIlllII[419]));
                                                            bv.add((d)lllllllllllllllllIlllIIllIlIIlll);
                                                            0;
                                                        }
                                                        int[] nArray = new int[lllIIlllII[0]];
                                                        nArray[v.lllIIlllII[1]] = lllIIlllII[38];
                                                        if (v.llIIIIlIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                            lllllllllllllllllIlllIIllIlIIlll = new d(lllIIlllII[38], lllIIlllII[0], e.c(lllIIlllII[418], lllIIlllII[419]));
                                                            bv.add((d)lllllllllllllllllIlllIIllIlIIlll);
                                                            0;
                                                        }
                                                        int[] nArray15 = new int[lllIIlllII[0]];
                                                        nArray15[v.lllIIlllII[1]] = lllIIlllII[23];
                                                        if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray15) ? 1 : 0)) break block44;
                                                        int[] nArray16 = new int[lllIIlllII[0]];
                                                        nArray16[v.lllIIlllII[1]] = lllIIlllII[23];
                                                        if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray16) ? 1 : 0)) break block45;
                                                        int[] nArray17 = new int[lllIIlllII[0]];
                                                        nArray17[v.lllIIlllII[1]] = lllIIlllII[23];
                                                        if (!v.llIIIIlIlIIlI(Bank.getFirst((int[])nArray17).getQuantity(), lllIIlllII[160])) break block45;
                                                    }
                                                    lllllllllllllllllIlllIIllIlIIlll = new d(lllIIlllII[23], lllIIlllII[160], e.c(lllIIlllII[29], lllIIlllII[58]));
                                                    bv.add((d)lllllllllllllllllIlllIIllIlIIlll);
                                                    0;
                                                }
                                                int[] nArray = new int[lllIIlllII[0]];
                                                nArray[v.lllIIlllII[1]] = lllIIlllII[21];
                                                if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block46;
                                                int[] nArray18 = new int[lllIIlllII[0]];
                                                nArray18[v.lllIIlllII[1]] = lllIIlllII[21];
                                                if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray18) ? 1 : 0)) break block47;
                                                int[] nArray19 = new int[lllIIlllII[0]];
                                                nArray19[v.lllIIlllII[1]] = lllIIlllII[21];
                                                if (!v.llIIIIlIlIIlI(Bank.getFirst((int[])nArray19).getQuantity(), lllIIlllII[3])) break block47;
                                            }
                                            lllllllllllllllllIlllIIllIlIIlll = new d(lllIIlllII[21], lllIIlllII[22], e.c(lllIIlllII[29], lllIIlllII[58]));
                                            bv.add((d)lllllllllllllllllIlllIIllIlIIlll);
                                            0;
                                        }
                                        int[] nArray = new int[lllIIlllII[0]];
                                        nArray[v.lllIIlllII[1]] = lllIIlllII[34];
                                        if (v.llIIIIlIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                            lllllllllllllllllIlllIIllIlIIlll = new d(lllIIlllII[34], lllIIlllII[0], e.c(lllIIlllII[420], lllIIlllII[421]));
                                            bv.add((d)lllllllllllllllllIlllIIllIlIIlll);
                                            0;
                                        }
                                        int[] nArray20 = new int[lllIIlllII[0]];
                                        nArray20[v.lllIIlllII[1]] = lllIIlllII[35];
                                        if (v.llIIIIlIlIIll(Bank.contains((int[])nArray20) ? 1 : 0)) {
                                            lllllllllllllllllIlllIIllIlIIlll = new d(lllIIlllII[35], lllIIlllII[0], e.c(lllIIlllII[422], lllIIlllII[417]));
                                            bv.add((d)lllllllllllllllllIlllIIllIlIIlll);
                                            0;
                                        }
                                        int[] nArray21 = new int[lllIIlllII[0]];
                                        nArray21[v.lllIIlllII[1]] = lllIIlllII[33];
                                        if (v.llIIIIlIlIIll(Bank.contains((int[])nArray21) ? 1 : 0)) {
                                            lllllllllllllllllIlllIIllIlIIlll = new d(lllIIlllII[33], lllIIlllII[0], e.c(lllIIlllII[420], lllIIlllII[421]));
                                            bv.add((d)lllllllllllllllllIlllIIllIlIIlll);
                                            0;
                                        }
                                        int[] nArray22 = new int[lllIIlllII[0]];
                                        nArray22[v.lllIIlllII[1]] = lllIIlllII[37];
                                        if (v.llIIIIlIlIIll(Bank.contains((int[])nArray22) ? 1 : 0)) {
                                            lllllllllllllllllIlllIIllIlIIlll = new d(lllIIlllII[37], lllIIlllII[0], e.c(lllIIlllII[420], lllIIlllII[421]));
                                            bv.add((d)lllllllllllllllllIlllIIllIlIIlll);
                                            0;
                                        }
                                        int[] nArray23 = new int[lllIIlllII[0]];
                                        nArray23[v.lllIIlllII[1]] = lllIIlllII[25];
                                        if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray23) ? 1 : 0)) break block48;
                                        int[] nArray24 = new int[lllIIlllII[0]];
                                        nArray24[v.lllIIlllII[1]] = lllIIlllII[25];
                                        if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray24) ? 1 : 0)) break block49;
                                        int[] nArray25 = new int[lllIIlllII[0]];
                                        nArray25[v.lllIIlllII[1]] = lllIIlllII[25];
                                        if (!v.llIIIIlIlIIlI(Bank.getFirst((int[])nArray25).getQuantity(), lllIIlllII[26])) break block49;
                                    }
                                    lllllllllllllllllIlllIIllIlIIlll = new d(lllIIlllII[25], lllIIlllII[26], e.c(lllIIlllII[423], lllIIlllII[424]));
                                    bv.add((d)lllllllllllllllllIlllIIllIlIIlll);
                                    0;
                                }
                                int[] nArray = new int[lllIIlllII[0]];
                                nArray[v.lllIIlllII[1]] = lllIIlllII[31];
                                if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block50;
                                int[] nArray26 = new int[lllIIlllII[0]];
                                nArray26[v.lllIIlllII[1]] = lllIIlllII[31];
                                if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray26) ? 1 : 0)) break block51;
                                int[] nArray27 = new int[lllIIlllII[0]];
                                nArray27[v.lllIIlllII[1]] = lllIIlllII[31];
                                if (!v.llIIIIlIlIIlI(Bank.getFirst((int[])nArray27).getQuantity(), lllIIlllII[28])) break block51;
                            }
                            lllllllllllllllllIlllIIllIlIIlll = new d(lllIIlllII[31], lllIIlllII[28], e.c(lllIIlllII[425], lllIIlllII[417]));
                            bv.add((d)lllllllllllllllllIlllIIllIlIIlll);
                            0;
                        }
                        int[] nArray = new int[lllIIlllII[0]];
                        nArray[v.lllIIlllII[1]] = lllIIlllII[39];
                        if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block52;
                        int[] nArray28 = new int[lllIIlllII[0]];
                        nArray28[v.lllIIlllII[1]] = lllIIlllII[39];
                        if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray28) ? 1 : 0)) break block53;
                        int[] nArray29 = new int[lllIIlllII[0]];
                        nArray29[v.lllIIlllII[1]] = lllIIlllII[39];
                        if (!v.llIIIIlIlIIlI(Bank.getFirst((int[])nArray29).getQuantity(), lllIIlllII[58])) break block53;
                    }
                    lllllllllllllllllIlllIIllIlIIlll = new d(lllIIlllII[39], lllIIlllII[58], e.c(lllIIlllII[426], lllIIlllII[427]));
                    bv.add((d)lllllllllllllllllIlllIIllIlIIlll);
                    0;
                }
                if (v.llIIIIlIlIIll(Bank.contains((Predicate)(lllllllllllllllllIlllIIllIlIIlll = item -> item.getName().toLowerCase().contains(lllIIlIIlI[lllIIlllII[434]]))) ? 1 : 0)) {
                    lllllllllllllllllIlllIIllIlIIllI = new d(lllIIlllII[428], lllIIlllII[9], e.c(lllIIlllII[429], lllIIlllII[430]));
                    bv.add(lllllllllllllllllIlllIIllIlIIllI);
                    0;
                }
                int[] nArray = new int[lllIIlllII[0]];
                nArray[v.lllIIlllII[1]] = lllIIlllII[51];
                if (v.llIIIIlIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    lllllllllllllllllIlllIIllIlIIllI = new d(lllIIlllII[51], lllIIlllII[8], j.cf);
                    bv.add(lllllllllllllllllIlllIIllIlIIllI);
                    0;
                }
                int[] nArray30 = new int[lllIIlllII[0]];
                nArray30[v.lllIIlllII[1]] = lllIIlllII[30];
                if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray30) ? 1 : 0)) break block54;
                int[] nArray31 = new int[lllIIlllII[0]];
                nArray31[v.lllIIlllII[1]] = lllIIlllII[30];
                if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray31) ? 1 : 0)) break block55;
                int[] nArray32 = new int[lllIIlllII[0]];
                nArray32[v.lllIIlllII[1]] = lllIIlllII[30];
                if (!v.llIIIIlIlIIlI(Bank.getFirst((int[])nArray32).getQuantity(), lllIIlllII[28])) break block55;
            }
            lllllllllllllllllIlllIIllIlIIllI = new d(lllIIlllII[30], lllIIlllII[4], e.c(lllIIlllII[431], lllIIlllII[432]));
            bv.add(lllllllllllllllllIlllIIllIlIIllI);
            0;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void lllllllllllllllllIlllIIllIlIlIll;
        int[] nArray = new int[lllIIlllII[17]];
        nArray[v.lllIIlllII[1]] = lllIIlllII[30];
        nArray[v.lllIIlllII[0]] = lllIIlllII[31];
        nArray[v.lllIIlllII[6]] = lllIIlllII[32];
        nArray[v.lllIIlllII[7]] = lllIIlllII[33];
        nArray[v.lllIIlllII[8]] = lllIIlllII[34];
        nArray[v.lllIIlllII[9]] = lllIIlllII[35];
        nArray[v.lllIIlllII[10]] = lllIIlllII[36];
        nArray[v.lllIIlllII[12]] = lllIIlllII[21];
        nArray[v.lllIIlllII[13]] = lllIIlllII[37];
        nArray[v.lllIIlllII[14]] = lllIIlllII[38];
        nArray[v.lllIIlllII[15]] = lllIIlllII[39];
        int[] nArray2 = nArray;
        int lllllllllllllllllIlllIIllIlIlIlI = lllIIlllII[1];
        while (v.llIIIIlIlIIlI(lllllllllllllllllIlllIIllIlIlIlI, ((void)lllllllllllllllllIlllIIllIlIlIll).length)) {
            int[] nArray3 = new int[lllIIlllII[0]];
            nArray3[v.lllIIlllII[1]] = lllllllllllllllllIlllIIllIlIlIll[lllllllllllllllllIlllIIllIlIlIlI];
            if (v.llIIIIlIlIIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lllIIlllII[1];
            }
            ++lllllllllllllllllIlllIIllIlIlIlI;
            0;
            if ((0x32 ^ 0x36) > 0) continue;
            return ((0xAE ^ 0x87) & ~(0x29 ^ 0)) != 0;
        }
        return lllIIlllII[0];
    }

    private static void llIIIIlIIllIl() {
        lllIIlIIlI = new String[lllIIlllII[476]];
        v.lllIIlIIlI[v.lllIIlllII[1]] = v."Finished buying items, switching back to quest";
        v.lllIIlIIlI[v.lllIIlllII[0]] = v."Tome of experience (3)";
        v.lllIIlIIlI[v.lllIIlllII[6]] = v."Tome of experience (2)";
        v.lllIIlIIlI[v.lllIIlllII[7]] = v."Tome of experience (1)";
        v.lllIIlIIlI[v.lllIIlllII[8]] = v."Tome of experience (3)";
        v.lllIIlIIlI[v.lllIIlllII[9]] = v."Tome of experience (2)";
        v.lllIIlIIlI[v.lllIIlllII[10]] = v."Tome of experience (1)";
        v.lllIIlIIlI[v.lllIIlllII[12]] = v."Tome of experience (3)";
        v.lllIIlIIlI[v.lllIIlllII[13]] = v."Tome of experience (2)";
        v.lllIIlIIlI[v.lllIIlllII[14]] = v."Tome of experience (1)";
        v.lllIIlIIlI[v.lllIIlllII[15]] = v."Nav to bank";
        v.lllIIlIIlI[v.lllIIlllII[17]] = v."Handling banking";
        v.lllIIlIIlI[v.lllIIlllII[20]] = v."We are missing super combat or super restores, switching to BUYING";
        v.lllIIlIIlI[v.lllIIlllII[24]] = v."We are missing air runes or fire runes, switching to BUYING";
        v.lllIIlIIlI[v.lllIIlllII[27]] = v."We are missing shark, switching to BUYING";
        v.lllIIlIIlI[v.lllIIlllII[28]] = v."We are missing quest supplies, switching to BUYING";
        v.lllIIlIIlI[v.lllIIlllII[44]] = v."We are missing quest supplies, switching to BUYING";
        v.lllIIlIIlI[v.lllIIlllII[46]] = v."Drink";
        v.lllIIlIIlI[v.lllIIlllII[48]] = v."Vial";
        v.lllIIlIIlI[v.lllIIlllII[50]] = v."Nav to ground city";
        v.lllIIlIIlI[v.lllIIlllII[29]] = v."Wield";
        v.lllIIlIIlI[v.lllIIlllII[56]] = v."Wear";
        v.lllIIlIIlI[v.lllIIlllII[57]] = v."Wear";
        v.lllIIlIIlI[v.lllIIlllII[58]] = v."Wear";
        v.lllIIlIIlI[v.lllIIlllII[59]] = v."Nav to start";
        v.lllIIlIIlI[v.lllIIlllII[60]] = v."Garth";
        v.lllIIlIIlI[v.lllIIlllII[70]] = v."Nav to oldman area";
        v.lllIIlIIlI[v.lllIIlllII[71]] = v."Run to base tile";
        v.lllIIlIIlI[v.lllIIlllII[72]] = v."Talk";
        v.lllIIlIIlI[v.lllIIlllII[73]] = v."Safalaan Hallow";
        v.lllIIlIIlI[v.lllIIlllII[64]] = v."Nav to ground city";
        v.lllIIlIIlI[v.lllIIlllII[74]] = v."Nav to tob wall";
        v.lllIIlIIlI[v.lllIIlllII[75]] = v."Rubble";
        v.lllIIlIIlI[v.lllIIlllII[76]] = v."Climb-up";
        v.lllIIlIIlI[v.lllIIlllII[69]] = v."Shark";
        v.lllIIlIIlI[v.lllIIlllII[77]] = v."Shark";
        v.lllIIlIIlI[v.lllIIlllII[78]] = v."Harpert";
        v.lllIIlIIlI[v.lllIIlllII[79]] = v."Go up rubble";
        v.lllIIlIIlI[v.lllIIlllII[11]] = v."Rubble";
        v.lllIIlIIlI[v.lllIIlllII[80]] = v."Climb-up";
        v.lllIIlIIlI[v.lllIIlllII[4]] = v."Nav to tile";
        v.lllIIlIIlI[v.lllIIlllII[97]] = v."NO anim going up";
        v.lllIIlIIlI[v.lllIIlllII[98]] = v."Vent";
        v.lllIIlIIlI[v.lllIIlllII[99]] = v."Climb-up";
        v.lllIIlIIlI[v.lllIIlllII[100]] = v."Go to roof tile 1";
        v.lllIIlIIlI[v.lllIIlllII[3]] = v."Roof";
        v.lllIIlIIlI[v.lllIIlllII[101]] = v."Jump-off";
        v.lllIIlIIlI[v.lllIIlllII[103]] = v."Nav to tile";
        v.lllIIlIIlI[v.lllIIlllII[2]] = v."NO anim going up";
        v.lllIIlIIlI[v.lllIIlllII[105]] = v."Vent";
        v.lllIIlIIlI[v.lllIIlllII[55]] = v."Climb-up";
        v.lllIIlIIlI[v.lllIIlllII[22]] = v."Climb-up";
        v.lllIIlIIlI[v.lllIIlllII[108]] = v."Roof";
        v.lllIIlIIlI[v.lllIIlllII[109]] = v."Climb-down";
        v.lllIIlIIlI[v.lllIIlllII[110]] = v."Nav to window";
        v.lllIIlIIlI[v.lllIIlllII[111]] = v."Window";
        v.lllIIlIIlI[v.lllIIlllII[112]] = v."Look-through";
        v.lllIIlIIlI[v.lllIIlllII[113]] = v."Shark";
        v.lllIIlIIlI[v.lllIIlllII[114]] = v."Eat";
        v.lllIIlIIlI[v.lllIIlllII[115]] = v."Break";
        v.lllIIlIIlI[v.lllIIlllII[116]] = v."Nav to burgh bank";
        v.lllIIlIIlI[v.lllIIlllII[118]] = v."Bank";
        v.lllIIlIIlI[v.lllIIlllII[121]] = v."Nav to ground city";
        v.lllIIlIIlI[v.lllIIlllII[122]] = v."Run to base tile";
        v.lllIIlIIlI[v.lllIIlllII[123]] = v."Talk";
        v.lllIIlIIlI[v.lllIIlllII[124]] = v."Safalaan Hallow";
        v.lllIIlIIlI[v.lllIIlllII[125]] = v."Flaygian Screwte";
        v.lllIIlIIlI[v.lllIIlllII[127]] = v."Safalaan Hallow";
        v.lllIIlIIlI[v.lllIIlllII[129]] = v."Shark";
        v.lllIIlIIlI[v.lllIIlllII[130]] = v."Eat";
        v.lllIIlIIlI[v.lllIIlllII[126]] = v."Unfinished potion";
        v.lllIIlIIlI[v.lllIIlllII[131]] = v."Mysterious crushed meat";
        v.lllIIlIIlI[v.lllIIlllII[132]] = v."Mysterious herb";
        v.lllIIlIIlI[v.lllIIlllII[133]] = v."Unfinished potion";
        v.lllIIlIIlI[v.lllIIlllII[134]] = v."Getting herb";
        v.lllIIlIIlI[v.lllIIlllII[63]] = v."Search";
        v.lllIIlIIlI[v.lllIIlllII[136]] = v."Mysterious herb";
        v.lllIIlIIlI[v.lllIIlllII[137]] = v."Mysterious meat";
        v.lllIIlIIlI[v.lllIIlllII[138]] = v."Getting meat";
        v.lllIIlIIlI[v.lllIIlllII[140]] = v."Search";
        v.lllIIlIIlI[v.lllIIlllII[128]] = v."Mysterious herb";
        v.lllIIlIIlI[v.lllIIlllII[141]] = v."Unfinished potion";
        v.lllIIlIIlI[v.lllIIlllII[142]] = v."Mysterious meat";
        v.lllIIlIIlI[v.lllIIlllII[143]] = v."Mixing herb with water";
        v.lllIIlIIlI[v.lllIIlllII[144]] = v."Mysterious herb";
        v.lllIIlIIlI[v.lllIIlllII[145]] = v."Vial of water";
        v.lllIIlIIlI[v.lllIIlllII[146]] = v."Unfinished potion";
        v.lllIIlIIlI[v.lllIIlllII[147]] = v."Mysterious meat";
        v.lllIIlIIlI[v.lllIIlllII[148]] = v."Grinding meat";
        v.lllIIlIIlI[v.lllIIlllII[149]] = v."Mysterious meat";
        v.lllIIlIIlI[v.lllIIlllII[150]] = v."Unfinished potion";
        v.lllIIlIIlI[v.lllIIlllII[151]] = v."Mysterious crushed meat";
        v.lllIIlIIlI[v.lllIIlllII[152]] = v."Using crushed meat on unf pot";
        v.lllIIlIIlI[v.lllIIlllII[153]] = v."Mysterious crushed meat";
        v.lllIIlIIlI[v.lllIIlllII[154]] = v."Unfinished potion";
        v.lllIIlIIlI[v.lllIIlllII[155]] = v."Potion";
        v.lllIIlIIlI[v.lllIIlllII[156]] = v."Throwing potion on door";
        v.lllIIlIIlI[v.lllIIlllII[157]] = v."Potion";
        v.lllIIlIIlI[v.lllIIlllII[158]] = v."Door";
        v.lllIIlIIlI[v.lllIIlllII[159]] = v."Safalaan Hallow";
        v.lllIIlIIlI[v.lllIIlllII[160]] = v."Mysterious herb";
        v.lllIIlIIlI[v.lllIIlllII[161]] = v."Unfinished blood potion";
        v.lllIIlIIlI[v.lllIIlllII[162]] = v."Getting herb";
        v.lllIIlIIlI[v.lllIIlllII[163]] = v."Search";
        v.lllIIlIIlI[v.lllIIlllII[164]] = v."Mysterious herb";
        v.lllIIlIIlI[v.lllIIlllII[165]] = v."Mysterious meat";
        v.lllIIlIIlI[v.lllIIlllII[166]] = v."Getting meat";
        v.lllIIlIIlI[v.lllIIlllII[167]] = v."Search";
        v.lllIIlIIlI[v.lllIIlllII[168]] = v."Mysterious herb";
        v.lllIIlIIlI[v.lllIIlllII[169]] = v."Unfinished potion";
        v.lllIIlIIlI[v.lllIIlllII[170]] = v."Mysterious meat";
        v.lllIIlIIlI[v.lllIIlllII[171]] = v."Mysterious herb";
        v.lllIIlIIlI[v.lllIIlllII[172]] = v."Vial of blood";
        v.lllIIlIIlI[v.lllIIlllII[173]] = v."Unfinished blood potion";
        v.lllIIlIIlI[v.lllIIlllII[174]] = v."Mysterious meat";
        v.lllIIlIIlI[v.lllIIlllII[175]] = v."Mysterious meat";
        v.lllIIlIIlI[v.lllIIlllII[176]] = v."Unfinished blood potion";
        v.lllIIlIIlI[v.lllIIlllII[177]] = v."Mysterious crushed meat";
        v.lllIIlIIlI[v.lllIIlllII[178]] = v."Mysterious crushed meat";
        v.lllIIlIIlI[v.lllIIlllII[179]] = v."Unfinished blood potion";
        v.lllIIlIIlI[v.lllIIlllII[180]] = v."Blood potion";
        v.lllIIlIIlI[v.lllIIlllII[181]] = v."Blood potion";
        v.lllIIlIIlI[v.lllIIlllII[182]] = v."Door";
        v.lllIIlIIlI[v.lllIIlllII[185]] = v."Door";
        v.lllIIlIIlI[v.lllIIlllII[186]] = v."Open";
        v.lllIIlIIlI[v.lllIIlllII[187]] = v."Chest";
        v.lllIIlIIlI[v.lllIIlllII[188]] = v."Open";
        v.lllIIlIIlI[v.lllIIlllII[189]] = v."Chest";
        v.lllIIlIIlI[v.lllIIlllII[190]] = v."Open";
        v.lllIIlIIlI[v.lllIIlllII[191]] = v."Chest";
        v.lllIIlIIlI[v.lllIIlllII[192]] = v."Search";
        v.lllIIlIIlI[v.lllIIlllII[193]] = v."Chest";
        v.lllIIlIIlI[v.lllIIlllII[194]] = v."Search";
        v.lllIIlIIlI[v.lllIIlllII[195]] = v."Door";
        v.lllIIlIIlI[v.lllIIlllII[196]] = v."Open";
        v.lllIIlIIlI[v.lllIIlllII[197]] = v."Safalaan Hallow";
        v.lllIIlIIlI[v.lllIIlllII[200]] = v."Break";
        v.lllIIlIIlI[v.lllIIlllII[201]] = v."Nav to ground city";
        v.lllIIlIIlI[v.lllIIlllII[202]] = v."Run to base tile";
        v.lllIIlIIlI[v.lllIIlllII[203]] = v."Talk";
        v.lllIIlIIlI[v.lllIIlllII[204]] = v."Safalaan Hallow";
        v.lllIIlIIlI[v.lllIIlllII[205]] = v."Abomination";
        v.lllIIlIIlI[v.lllIIlllII[206]] = v."Handle fight";
        v.lllIIlIIlI[v.lllIIlllII[207]] = v."Shark";
        v.lllIIlIIlI[v.lllIIlllII[208]] = v."Shark";
        v.lllIIlIIlI[v.lllIIlllII[26]] = v."Eat";
        v.lllIIlIIlI[v.lllIIlllII[209]] = v."Drink";
        v.lllIIlIIlI[v.lllIIlllII[210]] = v."Drink";
        v.lllIIlIIlI[v.lllIIlllII[212]] = v."Drink";
        v.lllIIlIIlI[v.lllIIlllII[120]] = v."Drink";
        v.lllIIlIIlI[v.lllIIlllII[215]] = v."Drink";
        v.lllIIlIIlI[v.lllIIlllII[216]] = v."Abomination";
        v.lllIIlIIlI[v.lllIIlllII[217]] = v."Attack";
        v.lllIIlIIlI[v.lllIIlllII[218]] = v."Drink";
        v.lllIIlIIlI[v.lllIIlllII[219]] = v."Drink";
        v.lllIIlIIlI[v.lllIIlllII[220]] = v."Drink";
        v.lllIIlIIlI[v.lllIIlllII[221]] = v."Drink";
        v.lllIIlIIlI[v.lllIIlllII[222]] = v."Drink";
        v.lllIIlIIlI[v.lllIIlllII[223]] = v."Shark";
        v.lllIIlIIlI[v.lllIIlllII[224]] = v."Shark";
        v.lllIIlIIlI[v.lllIIlllII[225]] = v."Eat";
        v.lllIIlIIlI[v.lllIIlllII[226]] = v."Nav to burgh bank";
        v.lllIIlIIlI[v.lllIIlllII[230]] = v."Break";
        v.lllIIlIIlI[v.lllIIlllII[231]] = v."Bank";
        v.lllIIlIIlI[v.lllIIlllII[232]] = v."Shark";
        v.lllIIlIIlI[v.lllIIlllII[233]] = v."Emerald";
        v.lllIIlIIlI[v.lllIIlllII[234]] = v."nav to oldman";
        v.lllIIlIIlI[v.lllIIlllII[235]] = v."Trapdoor";
        v.lllIIlIIlI[v.lllIIlllII[236]] = v."Open";
        v.lllIIlIIlI[v.lllIIlllII[237]] = v."Trapdoor";
        v.lllIIlIIlI[v.lllIIlllII[229]] = v."Open";
        v.lllIIlIIlI[v.lllIIlllII[238]] = v."Trapdoor";
        v.lllIIlIIlI[v.lllIIlllII[239]] = v."Climb-down";
        v.lllIIlIIlI[v.lllIIlllII[240]] = v."Trapdoor";
        v.lllIIlIIlI[v.lllIIlllII[241]] = v."Climb-down";
        v.lllIIlIIlI[v.lllIIlllII[242]] = v."Safalaan Hallow";
        v.lllIIlIIlI[v.lllIIlllII[243]] = v."Flaygian's notes";
        v.lllIIlIIlI[v.lllIIlllII[244]] = v."Vertida Sefalatis";
        v.lllIIlIIlI[v.lllIIlllII[245]] = v."Flaygian's notes";
        v.lllIIlIIlI[v.lllIIlllII[246]] = v."Flaygian's notes";
        v.lllIIlIIlI[v.lllIIlllII[247]] = v."Read";
        v.lllIIlIIlI[v.lllIIlllII[248]] = v."Ivandis flail";
        v.lllIIlIIlI[v.lllIIlllII[249]] = v."Silver sickle (b)";
        v.lllIIlIIlI[v.lllIIlllII[251]] = v."Vial";
        v.lllIIlIIlI[v.lllIIlllII[252]] = v."Vial";
        v.lllIIlIIlI[v.lllIIlllII[253]] = v."Drop";
        v.lllIIlIIlI[v.lllIIlllII[254]] = v."Search";
        v.lllIIlIIlI[v.lllIIlllII[255]] = v."Chain";
        v.lllIIlIIlI[v.lllIIlllII[256]] = v."Silver sickle (b)";
        v.lllIIlIIlI[v.lllIIlllII[258]] = v."Vial";
        v.lllIIlIIlI[v.lllIIlllII[259]] = v."Vial";
        v.lllIIlIIlI[v.lllIIlllII[260]] = v."Drop";
        v.lllIIlIIlI[v.lllIIlllII[261]] = v."Search";
        v.lllIIlIIlI[v.lllIIlllII[262]] = v."Chain";
        v.lllIIlIIlI[v.lllIIlllII[263]] = v."Silver sickle (b)";
        v.lllIIlIIlI[v.lllIIlllII[264]] = v."Rod of ivandis (10)";
        v.lllIIlIIlI[v.lllIIlllII[265]] = v."Vertida Sefalatis";
        v.lllIIlIIlI[v.lllIIlllII[266]] = v."Veliaf Hurtz";
        v.lllIIlIIlI[v.lllIIlllII[267]] = v."Nav to pub";
        v.lllIIlIIlI[v.lllIIlllII[269]] = v."Trapdoor";
        v.lllIIlIIlI[v.lllIIlllII[270]] = v."Open";
        v.lllIIlIIlI[v.lllIIlllII[271]] = v."Trapdoor";
        v.lllIIlIIlI[v.lllIIlllII[272]] = v."Climb-down";
        v.lllIIlIIlI[v.lllIIlllII[273]] = v."Veliaf Hurtz";
        v.lllIIlIIlI[v.lllIIlllII[274]] = v."Talking to veliaf";
        v.lllIIlIIlI[v.lllIIlllII[275]] = v."Veliaf Hurtz";
        v.lllIIlIIlI[v.lllIIlllII[276]] = v."Chain";
        v.lllIIlIIlI[v.lllIIlllII[277]] = v."Silver sickle (b)";
        v.lllIIlIIlI[v.lllIIlllII[278]] = v."Rod of ivandis (10)";
        v.lllIIlIIlI[v.lllIIlllII[279]] = v."Emerald";
        v.lllIIlIIlI[v.lllIIlllII[280]] = v."Silver sickle (b)";
        v.lllIIlIIlI[v.lllIIlllII[281]] = v."Emerald sickle (b)";
        v.lllIIlIIlI[v.lllIIlllII[282]] = v."Emerald sickle (b)";
        v.lllIIlIIlI[v.lllIIlllII[283]] = v."Enchanted emerald sickle (b)";
        v.lllIIlIIlI[v.lllIIlllII[284]] = v."Enchanted emerald sickle (b)";
        v.lllIIlIIlI[v.lllIIlllII[285]] = v."Rod of ivandis (10)";
        v.lllIIlIIlI[v.lllIIlllII[286]] = v."Ivandis flail";
        v.lllIIlIIlI[v.lllIIlllII[287]] = v."Veliaf Hurtz";
        v.lllIIlIIlI[v.lllIIlllII[288]] = v."Ladder";
        v.lllIIlIIlI[v.lllIIlllII[289]] = v."Climb-up";
        v.lllIIlIIlI[v.lllIIlllII[290]] = v."Veliaf Hurtz";
        v.lllIIlIIlI[v.lllIIlllII[291]] = v."nav to oldman";
        v.lllIIlIIlI[v.lllIIlllII[292]] = v."Trapdoor";
        v.lllIIlIIlI[v.lllIIlllII[293]] = v."Open";
        v.lllIIlIIlI[v.lllIIlllII[294]] = v."Trapdoor";
        v.lllIIlIIlI[v.lllIIlllII[295]] = v."Open";
        v.lllIIlIIlI[v.lllIIlllII[296]] = v."Trapdoor";
        v.lllIIlIIlI[v.lllIIlllII[38]] = v."Climb-down";
        v.lllIIlIIlI[v.lllIIlllII[297]] = v."Trapdoor";
        v.lllIIlIIlI[v.lllIIlllII[298]] = v."Climb-down";
        v.lllIIlIIlI[v.lllIIlllII[299]] = v."Safalaan Hallow";
        v.lllIIlIIlI[v.lllIIlllII[300]] = v."Ivandis flail";
        v.lllIIlIIlI[v.lllIIlllII[301]] = v."Ivandis flail";
        v.lllIIlIIlI[v.lllIIlllII[36]] = v."Wield";
        v.lllIIlIIlI[v.lllIIlllII[302]] = v."Ladder";
        v.lllIIlIIlI[v.lllIIlllII[303]] = v."Climb-up";
        v.lllIIlIIlI[v.lllIIlllII[304]] = v."Kael Forshaw";
        v.lllIIlIIlI[v.lllIIlllII[305]] = v."Ranis Drakan";
        v.lllIIlIIlI[v.lllIIlllII[306]] = v."Shark";
        v.lllIIlIIlI[v.lllIIlllII[307]] = v."Shark";
        v.lllIIlIIlI[v.lllIIlllII[308]] = v."Eat";
        v.lllIIlIIlI[v.lllIIlllII[309]] = v."Drink";
        v.lllIIlIIlI[v.lllIIlllII[310]] = v."Kael Forshaw";
        v.lllIIlIIlI[v.lllIIlllII[311]] = v."Drink";
        v.lllIIlIIlI[v.lllIIlllII[312]] = v."Shark";
        v.lllIIlIIlI[v.lllIIlllII[313]] = v."Shark";
        v.lllIIlIIlI[v.lllIIlllII[314]] = v."Eat";
        v.lllIIlIIlI[v.lllIIlllII[315]] = v."Drink";
        v.lllIIlIIlI[v.lllIIlllII[316]] = v."Shark";
        v.lllIIlIIlI[v.lllIIlllII[317]] = v."Escaping";
        v.lllIIlIIlI[v.lllIIlllII[318]] = v."Quick-escape";
        v.lllIIlIIlI[v.lllIIlllII[319]] = v."Dodging blood bomb";
        v.lllIIlIIlI[v.lllIIlllII[320]] = v."Vyrewatch";
        v.lllIIlIIlI[v.lllIIlllII[321]] = v."Vyrewatch";
        v.lllIIlIIlI[v.lllIIlllII[322]] = v."Attack";
        v.lllIIlIIlI[v.lllIIlllII[323]] = v."Attack";
        v.lllIIlIIlI[v.lllIIlllII[324]] = v."Shark";
        v.lllIIlIIlI[v.lllIIlllII[325]] = v."Attack";
        v.lllIIlIIlI[v.lllIIlllII[326]] = v."Vyrewatch";
        v.lllIIlIIlI[v.lllIIlllII[327]] = v."Vyrewatch";
        v.lllIIlIIlI[v.lllIIlllII[328]] = v."Attack";
        v.lllIIlIIlI[v.lllIIlllII[329]] = v."Attack";
        v.lllIIlIIlI[v.lllIIlllII[331]] = v."Dodge charge attack";
        v.lllIIlIIlI[v.lllIIlllII[332]] = v."Attack";
        v.lllIIlIIlI[v.lllIIlllII[333]] = v."Vyrewatch";
        v.lllIIlIIlI[v.lllIIlllII[334]] = v."Attack";
        v.lllIIlIIlI[v.lllIIlllII[335]] = v."Attack";
        v.lllIIlIIlI[v.lllIIlllII[336]] = v."Shark";
        v.lllIIlIIlI[v.lllIIlllII[337]] = v."Shark";
        v.lllIIlIIlI[v.lllIIlllII[338]] = v."Eat";
        v.lllIIlIIlI[v.lllIIlllII[339]] = v."Drink";
        v.lllIIlIIlI[v.lllIIlllII[340]] = v."nav to oldman";
        v.lllIIlIIlI[v.lllIIlllII[341]] = v."Trapdoor";
        v.lllIIlIIlI[v.lllIIlllII[342]] = v."Open";
        v.lllIIlIIlI[v.lllIIlllII[343]] = v."Trapdoor";
        v.lllIIlIIlI[v.lllIIlllII[344]] = v."Open";
        v.lllIIlIIlI[v.lllIIlllII[345]] = v."Trapdoor";
        v.lllIIlIIlI[v.lllIIlllII[346]] = v."Climb-down";
        v.lllIIlIIlI[v.lllIIlllII[347]] = v."Trapdoor";
        v.lllIIlIIlI[v.lllIIlllII[348]] = v."Climb-down";
        v.lllIIlIIlI[v.lllIIlllII[349]] = v."Safalaan Hallow";
        v.lllIIlIIlI[v.lllIIlllII[350]] = v."Tome of experience";
        v.lllIIlIIlI[v.lllIIlllII[351]] = v."Selecting agility";
        v.lllIIlIIlI[v.lllIIlllII[352]] = v."Tome of experience";
        v.lllIIlIIlI[v.lllIIlllII[353]] = v."Read";
        v.lllIIlIIlI[v.lllIIlllII[354]] = v."Agility";
        v.lllIIlIIlI[v.lllIIlllII[355]] = v."Confirm";
        v.lllIIlIIlI[v.lllIIlllII[356]] = v."Shark";
        v.lllIIlIIlI[v.lllIIlllII[357]] = v."Nav to tob bank";
        v.lllIIlIIlI[v.lllIIlllII[359]] = v."Wear";
        v.lllIIlIIlI[v.lllIIlllII[360]] = v."Wear";
        v.lllIIlIIlI[v.lllIIlllII[361]] = v."Wear";
        v.lllIIlIIlI[v.lllIIlllII[362]] = v."Wear";
        v.lllIIlIIlI[v.lllIIlllII[363]] = v."Wear";
        v.lllIIlIIlI[v.lllIIlllII[364]] = v."Wear";
        v.lllIIlIIlI[v.lllIIlllII[365]] = v."Wield";
        v.lllIIlIIlI[v.lllIIlllII[366]] = v."Equip";
        v.lllIIlIIlI[v.lllIIlllII[367]] = v."Wear";
        v.lllIIlIIlI[v.lllIIlllII[373]] = v."Nav to baseladder";
        v.lllIIlIIlI[v.lllIIlllII[374]] = v."Go up";
        v.lllIIlIIlI[v.lllIIlllII[375]] = v."Ladder";
        v.lllIIlIIlI[v.lllIIlllII[376]] = v."Climb-up";
        v.lllIIlIIlI[v.lllIIlllII[377]] = v."Pushing wall";
        v.lllIIlIIlI[v.lllIIlllII[378]] = v."Wall";
        v.lllIIlIIlI[v.lllIIlllII[379]] = v."Push";
        v.lllIIlIIlI[v.lllIIlllII[381]] = v."Go up";
        v.lllIIlIIlI[v.lllIIlllII[382]] = v."Stairs up";
        v.lllIIlIIlI[v.lllIIlllII[383]] = v."Climb-up";
        v.lllIIlIIlI[v.lllIIlllII[389]] = v."Walk to tile";
        v.lllIIlIIlI[v.lllIIlllII[391]] = v."Jump-to";
        v.lllIIlIIlI[v.lllIIlllII[392]] = v."Go down";
        v.lllIIlIIlI[v.lllIIlllII[393]] = v."Ladder";
        v.lllIIlIIlI[v.lllIIlllII[394]] = v."Climb-down";
        v.lllIIlIIlI[v.lllIIlllII[397]] = v."Nav to house ladder";
        v.lllIIlIIlI[v.lllIIlllII[398]] = v."Go down";
        v.lllIIlIIlI[v.lllIIlllII[399]] = v."Stairs";
        v.lllIIlIIlI[v.lllIIlllII[400]] = v."Climb-down";
        v.lllIIlIIlI[v.lllIIlllII[401]] = v."Safalaan Hallow";
        v.lllIIlIIlI[v.lllIIlllII[433]] = v."Tome of experience";
        v.lllIIlIIlI[v.lllIIlllII[434]] = v."ring of wealth (";
        v.lllIIlIIlI[v.lllIIlllII[5]] = v."Super combat";
        v.lllIIlIIlI[v.lllIIlllII[437]] = v."vyrewatch";
        v.lllIIlIIlI[v.lllIIlllII[438]] = v."Attack";
        v.lllIIlIIlI[v.lllIIlllII[439]] = v."Meiyerditch citizen";
        v.lllIIlIIlI[v.lllIIlllII[440]] = v."Quick-escape";
        v.lllIIlIIlI[v.lllIIlllII[441]] = v."roof";
        v.lllIIlIIlI[v.lllIIlllII[442]] = v."Climb-up";
        v.lllIIlIIlI[v.lllIIlllII[454]] = v."Yes.";
        v.lllIIlIIlI[v.lllIIlllII[455]] = v."Is there something I can do to help out?";
        v.lllIIlIIlI[v.lllIIlllII[456]] = v."Hey, look over there! (Distract and sneak away).";
        v.lllIIlIIlI[v.lllIIlllII[457]] = v."(whisper) Do you know about the Myreque?";
        v.lllIIlIIlI[v.lllIIlllII[458]] = v."(whisper) I really need to meet the Myreque.";
        v.lllIIlIIlI[v.lllIIlllII[459]] = v."How can Old Man Ral help me?";
        v.lllIIlIIlI[v.lllIIlllII[460]] = v."Someone said you could help me.";
        v.lllIIlIIlI[v.lllIIlllII[461]] = v."Old Man Ral, the sage of Sanguinesti.";
        v.lllIIlIIlI[v.lllIIlllII[462]] = v."Talk to the king about Morytania.";
        v.lllIIlIIlI[v.lllIIlllII[463]] = v."What should I do now?";
        v.lllIIlIIlI[v.lllIIlllII[464]] = v."Yes thanks. I'll accept the free teleport.";
        v.lllIIlIIlI[v.lllIIlllII[465]] = v."Okay, lead the way.";
        v.lllIIlIIlI[v.lllIIlllII[466]] = v."Fine, here's the money.";
        v.lllIIlIIlI[v.lllIIlllII[467]] = v."Fine. Here's the money.";
        v.lllIIlIIlI[v.lllIIlllII[468]] = v."I do.";
        v.lllIIlIIlI[v.lllIIlllII[469]] = v."Anything to report?";
        v.lllIIlIIlI[v.lllIIlllII[470]] = v."Why?";
        v.lllIIlIIlI[v.lllIIlllII[471]] = v."Here you go.";
        v.lllIIlIIlI[v.lllIIlllII[472]] = v."I need the Rod of Ivandis.";
        v.lllIIlIIlI[v.lllIIlllII[473]] = v."No thank you.";
        v.lllIIlIIlI[v.lllIIlllII[474]] = v."I'm ready.";
        v.lllIIlIIlI[v.lllIIlllII[475]] = v."A Taste of Hope";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean ah() {
        int n2;
        if (v.llIIIIlIlIlII(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[233])) {
            String[] stringArray = new String[lllIIlllII[0]];
            stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[433]];
            if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                n2 = lllIIlllII[0];
                0;
                if ((0xC4 ^ 0x86 ^ (0x4D ^ 0xB)) != 0) return n2 != 0;
                return ((0x79 ^ 0x5F ^ (0x51 ^ 0x64)) & (0x3D ^ 0x57 ^ (0x57 ^ 0x2E) ^ -1)) != 0;
            }
        }
        n2 = lllIIlllII[1];
        return n2 != 0;
    }

    private static int llIIIIlIlIIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static boolean llIIIIlIlllIl(int n2) {
        return n2 >= 0;
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
        if (((133 + 141 - 124 + 16 ^ 34 + 81 - 24 + 82) & (0xD0 ^ 0x81 ^ (0x62 ^ 0x38) ^ -1)) > 0) {
            return (0x83 ^ 0xB8 ^ (0x51 ^ 0x74)) & (0xE3 ^ 0x8C ^ (0xDC ^ 0xAD) ^ -1);
        }
        return lllIIlllII[160];
    }

    @Override
    public String ag() {
        return h;
    }

    private static boolean llIIIIlIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static /* synthetic */ boolean b(NPC nPC, TileObject tileObject) {
        int n2;
        if (v.llIIIIlIllIIl(tileObject.getId(), lllIIlllII[436]) && v.llIIIIlIlIlll(tileObject.getWorldLocation().distanceTo(nPC.getWorldLocation()), lllIIlllII[9])) {
            n2 = lllIIlllII[0];
            0;
            if (3 <= 1) {
                return ((0x59 ^ 8) & ~(0x95 ^ 0xC4)) != 0;
            }
        } else {
            n2 = lllIIlllII[1];
        }
        return n2 != 0;
    }

    public static void aZ() {
        block290: {
            WorldArea lllllllllllllllllIlllIIlllIIIllI;
            WorldArea lllllllllllllllllIlllIIlllIIIlll;
            Object lllllllllllllllllIlllIIlllIIlIII;
            Object lllllllllllllllllIlllIIlllIIlIIl;
            WorldArea lllllllllllllllllIlllIIlllIIlIlI;
            block291: {
                block297: {
                    block296: {
                        block295: {
                            block294: {
                                block293: {
                                    block292: {
                                        if (v.llIIIIlIlIIIl(bt ? 1 : 0)) {
                                            b.a(bv);
                                            if (v.llIIIIlIlIIlI(bv.size(), lllIIlllII[0])) {
                                                System.out.println(lllIIlIIlI[lllIIlllII[1]]);
                                                bt = lllIIlllII[1];
                                            }
                                        }
                                        if (!v.llIIIIlIlIIll(bt ? 1 : 0)) break block290;
                                        if (v.llIIIIlIlIIlI(Skills.getLevel((Skill)Skill.CRAFTING), lllIIlllII[2])) {
                                            ay.fi();
                                        }
                                        if (v.llIIIIlIlIlII(Skills.getLevel((Skill)Skill.CRAFTING), lllIIlllII[2]) && v.llIIIIlIlIIlI(Skills.getLevel((Skill)Skill.AGILITY), lllIIlllII[3])) {
                                            av.eA();
                                        }
                                        if (v.llIIIIlIlIlII(Skills.getLevel((Skill)Skill.CRAFTING), lllIIlllII[2]) && v.llIIIIlIlIlII(Skills.getLevel((Skill)Skill.AGILITY), lllIIlllII[3]) && v.llIIIIlIlIIlI(Skills.getLevel((Skill)Skill.HERBLORE), lllIIlllII[4])) {
                                            aB.fL();
                                        }
                                        if (v.llIIIIlIlIlII(Skills.getLevel((Skill)Skill.CRAFTING), lllIIlllII[2]) && v.llIIIIlIlIlII(Skills.getLevel((Skill)Skill.AGILITY), lllIIlllII[3]) && v.llIIIIlIlIlII(Skills.getLevel((Skill)Skill.HERBLORE), lllIIlllII[4]) && v.llIIIIlIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllIIlllII[5])) {
                                            String[] stringArray = new String[lllIIlllII[0]];
                                            stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[0]];
                                            if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                String[] stringArray2 = new String[lllIIlllII[0]];
                                                stringArray2[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[6]];
                                                if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                                                    String[] stringArray3 = new String[lllIIlllII[0]];
                                                    stringArray3[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[7]];
                                                    if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                                        y.bl();
                                                    }
                                                }
                                            }
                                        }
                                        if (v.llIIIIlIlIlII(Skills.getLevel((Skill)Skill.CRAFTING), lllIIlllII[2]) && v.llIIIIlIlIlII(Skills.getLevel((Skill)Skill.AGILITY), lllIIlllII[3]) && v.llIIIIlIlIlII(Skills.getLevel((Skill)Skill.HERBLORE), lllIIlllII[4]) && v.llIIIIlIlIlII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllIIlllII[5])) {
                                            String[] stringArray = new String[lllIIlllII[0]];
                                            stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[8]];
                                            if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                String[] stringArray4 = new String[lllIIlllII[0]];
                                                stringArray4[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[9]];
                                                if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                                                    String[] stringArray5 = new String[lllIIlllII[0]];
                                                    stringArray5[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[10]];
                                                    if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray5) ? 1 : 0) && v.llIIIIlIlIIlI(Skills.getLevel((Skill)Skill.SLAYER), lllIIlllII[11])) {
                                                        aL.gb();
                                                    }
                                                }
                                            }
                                        }
                                        if (!v.llIIIIlIlIIll(v.an() ? 1 : 0) || !v.llIIIIlIlIIll(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) || !v.llIIIIlIlIlII(Skills.getLevel((Skill)Skill.SLAYER), lllIIlllII[11]) || !v.llIIIIlIlIlII(Skills.getLevel((Skill)Skill.CRAFTING), lllIIlllII[2]) || !v.llIIIIlIlIlII(Skills.getLevel((Skill)Skill.AGILITY), lllIIlllII[3]) || !v.llIIIIlIlIlII(Skills.getLevel((Skill)Skill.HERBLORE), lllIIlllII[4]) || !v.llIIIIlIlIlII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllIIlllII[5])) break block291;
                                        String[] stringArray = new String[lllIIlllII[0]];
                                        stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[12]];
                                        if (!v.llIIIIlIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block291;
                                        String[] stringArray6 = new String[lllIIlllII[0]];
                                        stringArray6[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[13]];
                                        if (!v.llIIIIlIlIIll(Inventory.contains((String[])stringArray6) ? 1 : 0)) break block291;
                                        String[] stringArray7 = new String[lllIIlllII[0]];
                                        stringArray7[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[14]];
                                        if (!v.llIIIIlIlIIll(Inventory.contains((String[])stringArray7) ? 1 : 0)) break block291;
                                        lllllllllllllllllIlllIIlllIIlIlI = BankLocation.getNearest();
                                        if (v.llIIIIlIlIlIl(lllllllllllllllllIlllIIlllIIlIlI) && v.llIIIIlIlIIll(lllllllllllllllllIlllIIlllIIlIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[15]];
                                            a.a((BankLocation)lllllllllllllllllIlllIIlllIIlIlI);
                                        }
                                        if (!v.llIIIIlIlIlIl(lllllllllllllllllIlllIIlllIIlIlI) || !v.llIIIIlIlIIIl(lllllllllllllllllIlllIIlllIIlIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block291;
                                        if (v.llIIIIlIlIIll(Bank.isOpen() ? 1 : 0)) {
                                            a.a();
                                            Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIlllII[16]);
                                            0;
                                        }
                                        if (!v.llIIIIlIlIIIl(Bank.isOpen() ? 1 : 0)) break block291;
                                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[17]];
                                        if (v.llIIIIlIlIllI(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)lllIIlllII[8]);
                                            0;
                                        }
                                        if (v.llIIIIlIlIllI(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)lllIIlllII[6]);
                                            0;
                                        }
                                        int[] nArray = new int[lllIIlllII[0]];
                                        nArray[v.lllIIlllII[1]] = lllIIlllII[18];
                                        if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block292;
                                        int[] nArray2 = new int[lllIIlllII[0]];
                                        nArray2[v.lllIIlllII[1]] = lllIIlllII[18];
                                        if (!v.llIIIIlIlIlII(Bank.getFirst((int[])nArray2).getQuantity(), lllIIlllII[15])) break block293;
                                    }
                                    int[] nArray = new int[lllIIlllII[0]];
                                    nArray[v.lllIIlllII[1]] = lllIIlllII[19];
                                    if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block294;
                                    int[] nArray3 = new int[lllIIlllII[0]];
                                    nArray3[v.lllIIlllII[1]] = lllIIlllII[19];
                                    if (!v.llIIIIlIlIIlI(Bank.getFirst((int[])nArray3).getQuantity(), lllIIlllII[15])) break block294;
                                }
                                v.Q();
                                System.out.println(lllIIlIIlI[lllIIlllII[20]]);
                                bt = lllIIlllII[0];
                                return;
                            }
                            int[] nArray = new int[lllIIlllII[0]];
                            nArray[v.lllIIlllII[1]] = lllIIlllII[21];
                            if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block295;
                            int[] nArray4 = new int[lllIIlllII[0]];
                            nArray4[v.lllIIlllII[1]] = lllIIlllII[21];
                            if (!v.llIIIIlIlIlII(Bank.getFirst((int[])nArray4).getQuantity(), lllIIlllII[22])) break block296;
                        }
                        int[] nArray = new int[lllIIlllII[0]];
                        nArray[v.lllIIlllII[1]] = lllIIlllII[23];
                        if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block297;
                        int[] nArray5 = new int[lllIIlllII[0]];
                        nArray5[v.lllIIlllII[1]] = lllIIlllII[23];
                        if (!v.llIIIIlIlIIlI(Bank.getFirst((int[])nArray5).getQuantity(), lllIIlllII[22])) break block297;
                    }
                    v.Q();
                    System.out.println(lllIIlIIlI[lllIIlllII[24]]);
                    bt = lllIIlllII[0];
                    return;
                }
                int[] nArray = new int[lllIIlllII[0]];
                nArray[v.lllIIlllII[1]] = lllIIlllII[25];
                if (v.llIIIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray6 = new int[lllIIlllII[0]];
                    nArray6[v.lllIIlllII[1]] = lllIIlllII[25];
                    if (v.llIIIIlIlIIlI(Bank.getFirst((int[])nArray6).getQuantity(), lllIIlllII[26])) {
                        v.Q();
                        System.out.println(lllIIlIIlI[lllIIlllII[27]]);
                        bt = lllIIlllII[0];
                        return;
                    }
                }
                int[] nArray7 = new int[lllIIlllII[0]];
                nArray7[v.lllIIlllII[1]] = lllIIlllII[19];
                if (v.llIIIIlIlIIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[lllIIlllII[0]];
                    nArray8[v.lllIIlllII[1]] = lllIIlllII[19];
                    if (v.llIIIIlIlIIlI(Bank.getFirst((int[])nArray8).getQuantity(), lllIIlllII[15])) {
                        v.Q();
                        System.out.println(lllIIlIIlI[lllIIlllII[28]]);
                        bt = lllIIlllII[0];
                        return;
                    }
                }
                int[] nArray9 = new int[lllIIlllII[29]];
                nArray9[v.lllIIlllII[1]] = lllIIlllII[30];
                nArray9[v.lllIIlllII[0]] = lllIIlllII[31];
                nArray9[v.lllIIlllII[6]] = lllIIlllII[32];
                nArray9[v.lllIIlllII[7]] = lllIIlllII[33];
                nArray9[v.lllIIlllII[8]] = lllIIlllII[34];
                nArray9[v.lllIIlllII[9]] = lllIIlllII[35];
                nArray9[v.lllIIlllII[10]] = lllIIlllII[36];
                nArray9[v.lllIIlllII[12]] = lllIIlllII[21];
                nArray9[v.lllIIlllII[13]] = lllIIlllII[37];
                nArray9[v.lllIIlllII[14]] = lllIIlllII[23];
                nArray9[v.lllIIlllII[15]] = lllIIlllII[38];
                nArray9[v.lllIIlllII[17]] = lllIIlllII[39];
                nArray9[v.lllIIlllII[20]] = lllIIlllII[40];
                nArray9[v.lllIIlllII[24]] = lllIIlllII[41];
                nArray9[v.lllIIlllII[27]] = lllIIlllII[42];
                nArray9[v.lllIIlllII[28]] = lllIIlllII[43];
                nArray9[v.lllIIlllII[44]] = lllIIlllII[45];
                nArray9[v.lllIIlllII[46]] = lllIIlllII[47];
                nArray9[v.lllIIlllII[48]] = lllIIlllII[49];
                nArray9[v.lllIIlllII[50]] = lllIIlllII[18];
                if (v.llIIIIlIlIIll(e.c(nArray9) ? 1 : 0)) {
                    v.Q();
                    System.out.println(lllIIlIIlI[lllIIlllII[44]]);
                    bt = lllIIlllII[0];
                    return;
                }
                int[] nArray10 = new int[lllIIlllII[20]];
                nArray10[v.lllIIlllII[1]] = lllIIlllII[30];
                nArray10[v.lllIIlllII[0]] = lllIIlllII[31];
                nArray10[v.lllIIlllII[6]] = lllIIlllII[32];
                nArray10[v.lllIIlllII[7]] = lllIIlllII[33];
                nArray10[v.lllIIlllII[8]] = lllIIlllII[34];
                nArray10[v.lllIIlllII[9]] = lllIIlllII[35];
                nArray10[v.lllIIlllII[10]] = lllIIlllII[36];
                nArray10[v.lllIIlllII[12]] = lllIIlllII[21];
                nArray10[v.lllIIlllII[13]] = lllIIlllII[37];
                nArray10[v.lllIIlllII[14]] = lllIIlllII[38];
                nArray10[v.lllIIlllII[15]] = lllIIlllII[39];
                nArray10[v.lllIIlllII[17]] = lllIIlllII[18];
                if (v.llIIIIlIlIIIl(e.c(nArray10) ? 1 : 0)) {
                    a.a(lllIIlllII[51], lllIIlllII[8]);
                    a.a(lllIIlllII[30], lllIIlllII[15]);
                    a.a(lllIIlllII[31], lllIIlllII[15]);
                    a.a(lllIIlllII[32], lllIIlllII[16]);
                    a.a(lllIIlllII[33], lllIIlllII[0]);
                    a.a(lllIIlllII[34], lllIIlllII[0]);
                    a.a(lllIIlllII[35], lllIIlllII[0]);
                    a.a(lllIIlllII[36], lllIIlllII[0]);
                    a.a(lllIIlllII[21], lllIIlllII[7]);
                    a.a(lllIIlllII[38], lllIIlllII[0]);
                    a.a(lllIIlllII[37], lllIIlllII[0]);
                    a.a(lllIIlllII[39], lllIIlllII[6]);
                    a.a(lllIIlllII[52], lllIIlllII[0]);
                    a.a(lllIIlllII[53], lllIIlllII[0]);
                    a.a(lllIIlllII[19], lllIIlllII[0]);
                    int[] nArray11 = new int[lllIIlllII[0]];
                    nArray11[v.lllIIlllII[1]] = lllIIlllII[49];
                    if (v.llIIIIlIlIIIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                        a.a(lllIIlllII[49], lllIIlllII[0]);
                    }
                    int[] nArray12 = new int[lllIIlllII[0]];
                    nArray12[v.lllIIlllII[1]] = lllIIlllII[54];
                    if (v.llIIIIlIlIIIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
                        a.a(lllIIlllII[54], lllIIlllII[0]);
                    }
                }
            }
            if (v.llIIIIlIlIIIl(Inventory.contains((int[])f.ba) ? 1 : 0) && v.llIIIIlIlIIlI(Movement.getRunEnergy(), lllIIlllII[55])) {
                Inventory.getFirst((int[])f.ba).interact(lllIIlIIlI[lllIIlllII[46]]);
                Time.sleepTicks((int)lllIIlllII[0]);
                0;
            }
            String[] stringArray = new String[lllIIlllII[0]];
            stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[48]];
            if (!v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray) ? 1 : 0) || v.llIIIIlIlIIll(Dialog.isOpen() ? 1 : 0)) {
                // empty if block
            }
            if (v.llIIIIlIlIIIl(v.an() ? 1 : 0) && v.llIIIIlIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[15])) {
                if (v.llIIIIlIlIIll(do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[50]];
                    if (v.llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    int[] nArray = new int[lllIIlllII[0]];
                    nArray[v.lllIIlllII[1]] = lllIIlllII[52];
                    if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray13 = new int[lllIIlllII[0]];
                        nArray13[v.lllIIlllII[1]] = lllIIlllII[52];
                        Inventory.getFirst((int[])nArray13).interact(lllIIlIIlI[lllIIlllII[29]]);
                    }
                    int[] nArray14 = new int[lllIIlllII[0]];
                    nArray14[v.lllIIlllII[1]] = lllIIlllII[53];
                    if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                        int[] nArray15 = new int[lllIIlllII[0]];
                        nArray15[v.lllIIlllII[1]] = lllIIlllII[53];
                        Inventory.getFirst((int[])nArray15).interact(lllIIlIIlI[lllIIlllII[56]]);
                    }
                    int[] nArray16 = new int[lllIIlllII[0]];
                    nArray16[v.lllIIlllII[1]] = lllIIlllII[49];
                    if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                        int[] nArray17 = new int[lllIIlllII[0]];
                        nArray17[v.lllIIlllII[1]] = lllIIlllII[49];
                        Inventory.getFirst((int[])nArray17).interact(lllIIlIIlI[lllIIlllII[57]]);
                    }
                    int[] nArray18 = new int[lllIIlllII[0]];
                    nArray18[v.lllIIlllII[1]] = lllIIlllII[54];
                    if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                        int[] nArray19 = new int[lllIIlllII[0]];
                        nArray19[v.lllIIlllII[1]] = lllIIlllII[54];
                        Inventory.getFirst((int[])nArray19).interact(lllIIlIIlI[lllIIlllII[58]]);
                    }
                    y.bp();
                }
                if (v.llIIIIlIlIIIl(do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(de), lllIIlllII[9])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[59]];
                        Movement.walkTo((WorldPoint)de);
                        0;
                        Time.sleepTicks((int)lllIIlllII[0]);
                        0;
                    }
                    if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(de), lllIIlllII[9])) {
                        g.a(lllIIlIIlI[lllIIlllII[60]], cE);
                    }
                }
                g.a(y.cE);
            }
            if (v.llIIIIlIlIIIl(v.an() ? 1 : 0) && v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[28])) {
                lllllllllllllllllIlllIIlllIIlIlI = new WorldArea(lllIIlllII[61], lllIIlllII[62], lllIIlllII[63], lllIIlllII[64], lllIIlllII[1]);
                lllllllllllllllllIlllIIlllIIlIIl = new WorldArea(lllIIlllII[65], lllIIlllII[66], lllIIlllII[50], lllIIlllII[13], lllIIlllII[1]);
                lllllllllllllllllIlllIIlllIIlIII = new WorldArea(lllIIlllII[67], lllIIlllII[68], lllIIlllII[29], lllIIlllII[69], lllIIlllII[1]);
                if (v.llIIIIlIlIIll(lllllllllllllllllIlllIIlllIIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(lllllllllllllllllIlllIIlllIIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIIl(lllllllllllllllllIlllIIlllIIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[70]];
                    Movement.walkTo((WorldPoint)y.dP);
                    0;
                    Time.sleepTicks((int)lllIIlllII[0]);
                    0;
                }
                y.bq();
                if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(y.dQ), lllIIlllII[4])) {
                    if (v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(y.dQ), lllIIlllII[12])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[71]];
                        Movement.walkTo((WorldPoint)y.dQ);
                        0;
                        Time.sleepTicks((int)lllIIlllII[0]);
                        0;
                    }
                    if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(y.dQ), lllIIlllII[12])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[72]];
                        g.a(lllIIlIIlI[lllIIlllII[73]], cE);
                    }
                }
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[29])) {
                if (v.llIIIIlIlIIll(do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    di = lllIIlllII[1];
                    AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[64]];
                    if (v.llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    y.bp();
                }
                if (v.llIIIIlIlIIIl(do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dl), lllIIlllII[9]) && v.llIIIIlIlIIll(dp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(dq.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[74]];
                        Movement.walkTo((WorldPoint)dl);
                        0;
                        Time.sleepTicks((int)lllIIlllII[0]);
                        0;
                    }
                    if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dl), lllIIlllII[14])) {
                        String[] stringArray8 = new String[lllIIlllII[0]];
                        stringArray8[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[75]];
                        TileObjects.getNearest((String[])stringArray8).interact(lllIIlIIlI[lllIIlllII[76]]);
                        Time.sleepTicks((int)lllIIlllII[10]);
                        0;
                    }
                }
                g.a(y.cE);
            }
            if (!v.llIIIIlIllIlI(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[64]) || v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[77])) {
                String[] stringArray9 = new String[lllIIlllII[0]];
                stringArray9[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[69]];
                if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                    if (v.llIIIIlIlIIll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                    }
                    if (v.llIIIIlIlIIIl(Bank.isOpen() ? 1 : 0)) {
                        Bank.withdraw((int)lllIIlllII[25], (int)lllIIlllII[12], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    }
                }
                String[] stringArray10 = new String[lllIIlllII[0]];
                stringArray10[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[77]];
                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray10) ? 1 : 0)) {
                    if (v.llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    g.a(lllIIlIIlI[lllIIlllII[78]], cE);
                }
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[4])) {
                TileObject lllllllllllllllllIlllIIlllIIIIIl;
                if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dl), lllIIlllII[14])) {
                    AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[79]];
                    String[] stringArray11 = new String[lllIIlllII[0]];
                    stringArray11[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[11]];
                    TileObjects.getNearest((String[])stringArray11).interact(lllIIlIIlI[lllIIlllII[80]]);
                    Time.sleepTicks((int)lllIIlllII[10]);
                    0;
                }
                lllllllllllllllllIlllIIlllIIlIlI = new WorldArea(lllIIlllII[81], lllIIlllII[82], lllIIlllII[24], lllIIlllII[28], lllIIlllII[0]);
                lllllllllllllllllIlllIIlllIIlIIl = new WorldArea(lllIIlllII[83], lllIIlllII[84], lllIIlllII[20], lllIIlllII[46], lllIIlllII[6]);
                lllllllllllllllllIlllIIlllIIlIII = new WorldArea(lllIIlllII[81], lllIIlllII[85], lllIIlllII[20], lllIIlllII[24], lllIIlllII[0]);
                lllllllllllllllllIlllIIlllIIIlll = new WorldArea(lllIIlllII[86], lllIIlllII[87], lllIIlllII[59], lllIIlllII[15], lllIIlllII[6]);
                lllllllllllllllllIlllIIlllIIIllI = new WorldArea(lllIIlllII[88], lllIIlllII[89], lllIIlllII[73], lllIIlllII[57], lllIIlllII[6]);
                WorldPoint lllllllllllllllllIlllIIlllIIIlIl = new WorldPoint(lllIIlllII[90], lllIIlllII[91], lllIIlllII[6]);
                WorldPoint lllllllllllllllllIlllIIlllIIIlII = new WorldPoint(lllIIlllII[92], lllIIlllII[93], lllIIlllII[0]);
                WorldPoint lllllllllllllllllIlllIIlllIIIIll = new WorldPoint(lllIIlllII[94], lllIIlllII[95], lllIIlllII[0]);
                WorldPoint lllllllllllllllllIlllIIlllIIIIlI = new WorldPoint(lllIIlllII[96], lllIIlllII[85], lllIIlllII[6]);
                if (v.llIIIIlIlIIIl(lllllllllllllllllIlllIIlllIIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (v.llIIIIlIlIIll(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlllIIlllIIIlII) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[4]];
                        Movement.walkTo((WorldPoint)lllllllllllllllllIlllIIlllIIIlII);
                        0;
                        Time.sleepTicks((int)lllIIlllII[0]);
                        0;
                    }
                    if (v.llIIIIlIlIIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlllIIlllIIIlII) ? 1 : 0) && v.llIIIIlIlIIll(AccBuilderSotf.i.containsKey(lllllllllllllllllIlllIIlllIIIIIl = new WorldPoint(lllIIlllII[96], lllIIlllII[93], lllIIlllII[0])) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[97]];
                        String[] stringArray12 = new String[lllIIlllII[0]];
                        stringArray12[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[98]];
                        TileObjects.getNearest((String[])stringArray12).interact(lllIIlIIlI[lllIIlllII[99]]);
                        Time.sleepTicks((int)lllIIlllII[8]);
                        0;
                    }
                }
                if (v.llIIIIlIlIIIl(lllllllllllllllllIlllIIlllIIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllllIlllIIlllIIIIlI), lllIIlllII[6])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[100]];
                        Movement.walkTo((WorldPoint)lllllllllllllllllIlllIIlllIIIIlI);
                        0;
                        Time.sleepTicks((int)lllIIlllII[0]);
                        0;
                    }
                    if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllllIlllIIlllIIIIlI), lllIIlllII[6])) {
                        String[] stringArray13 = new String[lllIIlllII[0]];
                        stringArray13[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[3]];
                        TileObjects.getNearest((String[])stringArray13).interact(lllIIlIIlI[lllIIlllII[101]]);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (v.llIIIIlIllIlI(Players.getLocal().getWorldLocation().getPlane(), lllIIlllII[6])) {
                                bl = lllIIlllII[0];
                                0;
                                if (3 < 2) {
                                    return ((0x51 ^ 0x1C) & ~(0xD1 ^ 0x9C)) != 0;
                                }
                            } else {
                                bl = lllIIlllII[1];
                            }
                            return bl;
                        }, (int)lllIIlllII[102]);
                        0;
                    }
                }
                if (v.llIIIIlIlIIIl(lllllllllllllllllIlllIIlllIIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (v.llIIIIlIlIIll(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlllIIlllIIIIll) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[103]];
                        Movement.walkTo((WorldPoint)lllllllllllllllllIlllIIlllIIIIll);
                        0;
                        Time.sleepTicks((int)lllIIlllII[0]);
                        0;
                    }
                    if (v.llIIIIlIlIIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlllIIlllIIIIll) ? 1 : 0) && v.llIIIIlIlIIll(AccBuilderSotf.i.containsKey(lllllllllllllllllIlllIIlllIIIIIl = new WorldPoint(lllIIlllII[94], lllIIlllII[104], lllIIlllII[0])) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[2]];
                        String[] stringArray14 = new String[lllIIlllII[0]];
                        stringArray14[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[105]];
                        TileObjects.getNearest((String[])stringArray14).interact(lllIIlIIlI[lllIIlllII[55]]);
                        Time.sleepTicks((int)lllIIlllII[8]);
                        0;
                    }
                }
                if (v.llIIIIlIlIIIl(lllllllllllllllllIlllIIlllIIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIlIl(lllllllllllllllllIlllIIlllIIIIIl = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (v.llIIIIlIlIIIl(tileObject.getName().equalsIgnoreCase(lllIIlIIlI[lllIIlllII[441]]) ? 1 : 0)) {
                        String[] stringArray = new String[lllIIlllII[0]];
                        stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[442]];
                        if (v.llIIIIlIlIIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                            n2 = lllIIlllII[0];
                            0;
                            if (-1 < 3) return n2 != 0;
                            return ((0xDF ^ 0x81) & ~(0xF1 ^ 0xAF)) != 0;
                        }
                    }
                    n2 = lllIIlllII[1];
                    return n2 != 0;
                })) && v.llIIIIlIlIIll(Players.getLocal().isAnimating() ? 1 : 0) && v.llIIIIlIlIIll(Players.getLocal().isMoving() ? 1 : 0)) {
                    lllllllllllllllllIlllIIlllIIIIIl.interact(lllIIlIIlI[lllIIlllII[22]]);
                    Time.sleepTicks((int)lllIIlllII[6]);
                    0;
                }
                if (v.llIIIIlIlIIIl((lllllllllllllllllIlllIIlllIIIIIl = new WorldArea(lllIIlllII[106], lllIIlllII[107], lllIIlllII[58], lllIIlllII[48], lllIIlllII[7])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray15 = new String[lllIIlllII[0]];
                    stringArray15[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[108]];
                    List lllllllllllllllllIlllIIlllIIIIII = TileObjects.getAll((String[])stringArray15).stream().filter(tileObject -> {
                        boolean bl;
                        if (v.llIIIIlIlIlll(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lllIIlllII[6])) {
                            bl = lllIIlllII[0];
                            0;
                            if ((0xE6 ^ 0x92 ^ (0x3F ^ 0x4F)) != (0x21 ^ 0x6C ^ (3 ^ 0x4A))) {
                                return ((81 + 123 - 134 + 92 ^ 72 + 81 - 38 + 66) & (0x37 ^ 0x59 ^ (0x41 ^ 0x38) ^ -1)) != 0;
                            }
                        } else {
                            bl = lllIIlllII[1];
                        }
                        return bl;
                    }).collect(Collectors.toList());
                    if (v.llIIIIlIlIIll(lllllllllllllllllIlllIIlllIIIIII.isEmpty() ? 1 : 0)) {
                        ((TileObject)lllllllllllllllllIlllIIlllIIIIII.get(lllIIlllII[1])).interact(lllIIlIIlI[lllIIlllII[109]]);
                        Time.sleepTicks((int)lllIIlllII[9]);
                        0;
                    }
                }
                if (v.llIIIIlIlIIIl(lllllllllllllllllIlllIIlllIIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllllIlllIIlllIIIlIl), lllIIlllII[8])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[110]];
                        Movement.walkTo((WorldPoint)lllllllllllllllllIlllIIlllIIIlIl);
                        0;
                        Time.sleepTicks((int)lllIIlllII[0]);
                        0;
                    }
                    if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllllIlllIIlllIIIlIl), lllIIlllII[8]) && v.llIIIIlIlIIll(Dialog.isOpen() ? 1 : 0)) {
                        String[] stringArray16 = new String[lllIIlllII[0]];
                        stringArray16[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[111]];
                        TileObjects.getNearest((String[])stringArray16).interact(lllIIlIIlI[lllIIlllII[112]]);
                        Time.sleepTicks((int)lllIIlllII[7]);
                        0;
                    }
                }
                if (v.llIIIIlIlIIlI(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), Skills.getLevel((Skill)Skill.HITPOINTS) - lllIIlllII[29])) {
                    String[] stringArray17 = new String[lllIIlllII[0]];
                    stringArray17[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[113]];
                    Inventory.getFirst((String[])stringArray17).interact(lllIIlIIlI[lllIIlllII[114]]);
                    Time.sleepTicks((int)lllIIlllII[0]);
                    0;
                }
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[3])) {
                lllllllllllllllllIlllIIlllIIlIlI = new WorldArea(lllIIlllII[88], lllIIlllII[89], lllIIlllII[73], lllIIlllII[57], lllIIlllII[6]);
                if (v.llIIIIlIlIIIl(lllllllllllllllllIlllIIlllIIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(Dialog.isOpen() ? 1 : 0)) {
                    int[] nArray = new int[lllIIlllII[0]];
                    nArray[v.lllIIlllII[1]] = lllIIlllII[31];
                    Inventory.getFirst((int[])nArray).interact(lllIIlIIlI[lllIIlllII[115]]);
                    Time.sleepTicks((int)lllIIlllII[10]);
                    0;
                }
                int[] nArray = new int[lllIIlllII[0]];
                nArray[v.lllIIlllII[1]] = lllIIlllII[18];
                if (v.llIIIIlIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    if (v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(D.fa), lllIIlllII[13])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[116]];
                        Movement.walkTo((WorldPoint)D.fa);
                        0;
                        Time.sleepTicks((int)lllIIlllII[0]);
                        0;
                    }
                    if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(D.fa), lllIIlllII[13])) {
                        if (v.llIIIIlIlIIll(Bank.isOpen() ? 1 : 0)) {
                            int[] nArray20 = new int[lllIIlllII[0]];
                            nArray20[v.lllIIlllII[1]] = lllIIlllII[117];
                            if (v.llIIIIlIlIlIl(TileObjects.getNearest((int[])nArray20)) && v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(D.fa), lllIIlllII[15])) {
                                int[] nArray21 = new int[lllIIlllII[0]];
                                nArray21[v.lllIIlllII[1]] = lllIIlllII[117];
                                TileObjects.getNearest((int[])nArray21).interact(lllIIlIIlI[lllIIlllII[118]]);
                                Time.sleepTicks((int)lllIIlllII[6]);
                                0;
                            }
                        }
                        if (v.llIIIIlIlIIIl(Bank.isOpen() ? 1 : 0)) {
                            int[] nArray22 = new int[lllIIlllII[0]];
                            nArray22[v.lllIIlllII[1]] = lllIIlllII[32];
                            Bank.depositAll((int[])nArray22);
                            int[] nArray23 = new int[lllIIlllII[0]];
                            nArray23[v.lllIIlllII[1]] = lllIIlllII[34];
                            Bank.depositAll((int[])nArray23);
                            int[] nArray24 = new int[lllIIlllII[0]];
                            nArray24[v.lllIIlllII[1]] = lllIIlllII[33];
                            Bank.depositAll((int[])nArray24);
                            int[] nArray25 = new int[lllIIlllII[0]];
                            nArray25[v.lllIIlllII[1]] = lllIIlllII[21];
                            Bank.depositAll((int[])nArray25);
                            int[] nArray26 = new int[lllIIlllII[0]];
                            nArray26[v.lllIIlllII[1]] = lllIIlllII[37];
                            Bank.depositAll((int[])nArray26);
                            int[] nArray27 = new int[lllIIlllII[0]];
                            nArray27[v.lllIIlllII[1]] = lllIIlllII[19];
                            if (v.llIIIIlIlIIll(Inventory.contains((int[])nArray27) ? 1 : 0)) {
                                a.a(lllIIlllII[19], lllIIlllII[0]);
                            }
                            int[] nArray28 = new int[lllIIlllII[0]];
                            nArray28[v.lllIIlllII[1]] = lllIIlllII[18];
                            if (v.llIIIIlIlIIll(Inventory.contains((int[])nArray28) ? 1 : 0)) {
                                a.a(lllIIlllII[18], lllIIlllII[6]);
                            }
                            a.a(lllIIlllII[25], Inventory.getFreeSlots() - lllIIlllII[8]);
                        }
                    }
                }
                int[] nArray29 = new int[lllIIlllII[0]];
                nArray29[v.lllIIlllII[1]] = lllIIlllII[18];
                if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray29) ? 1 : 0)) {
                    lllllllllllllllllIlllIIlllIIlIIl = new WorldArea(lllIIlllII[67], lllIIlllII[119], lllIIlllII[111], lllIIlllII[120], lllIIlllII[1]);
                    lllllllllllllllllIlllIIlllIIlIII = new WorldArea(lllIIlllII[67], lllIIlllII[119], lllIIlllII[111], lllIIlllII[120], lllIIlllII[0]);
                    lllllllllllllllllIlllIIlllIIIlll = new WorldArea(lllIIlllII[67], lllIIlllII[119], lllIIlllII[111], lllIIlllII[120], lllIIlllII[6]);
                    lllllllllllllllllIlllIIlllIIIllI = new WorldArea(lllIIlllII[67], lllIIlllII[119], lllIIlllII[111], lllIIlllII[120], lllIIlllII[7]);
                    if (v.llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (v.llIIIIlIlIIll(do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(y.dQ), lllIIlllII[4]) && v.llIIIIlIlIIll(lllllllllllllllllIlllIIlllIIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(lllllllllllllllllIlllIIlllIIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(lllllllllllllllllIlllIIlllIIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(lllllllllllllllllIlllIIlllIIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[121]];
                        if (v.llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        y.bp();
                    }
                    y.bq();
                    if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(y.dQ), lllIIlllII[4])) {
                        if (v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(y.dQ), lllIIlllII[12])) {
                            AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[122]];
                            Movement.walkTo((WorldPoint)y.dQ);
                            0;
                            Time.sleepTicks((int)lllIIlllII[0]);
                            0;
                        }
                        if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(y.dQ), lllIIlllII[12])) {
                            AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[123]];
                            g.a(lllIIlIIlI[lllIIlllII[124]], cE);
                        }
                    }
                }
                g.a(cE);
            }
            if (!v.llIIIIlIllIlI(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[55]) || !v.llIIIIlIllIlI(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[111]) || v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[116])) {
                g.a(lllIIlIIlI[lllIIlllII[125]], cE);
            }
            if (!v.llIIIIlIllIlI(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[124]) || v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[126])) {
                g.a(lllIIlIIlI[lllIIlllII[127]], cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[63])) {
                v.bc();
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[128])) {
                if (v.llIIIIlIlIIIl(Inventory.isFull() ? 1 : 0)) {
                    String[] stringArray18 = new String[lllIIlllII[0]];
                    stringArray18[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[129]];
                    Inventory.getFirst((String[])stringArray18).interact(lllIIlIIlI[lllIIlllII[130]]);
                    Time.sleepTicks((int)lllIIlllII[6]);
                    0;
                }
                String[] stringArray19 = new String[lllIIlllII[0]];
                stringArray19[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[126]];
                if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray19) ? 1 : 0)) {
                    String[] stringArray20 = new String[lllIIlllII[0]];
                    stringArray20[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[131]];
                    if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray20) ? 1 : 0)) {
                        String[] stringArray21 = new String[lllIIlllII[0]];
                        stringArray21[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[132]];
                        if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray21) ? 1 : 0)) {
                            String[] stringArray22 = new String[lllIIlllII[0]];
                            stringArray22[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[133]];
                            if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray22) ? 1 : 0)) {
                                AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[134]];
                                int[] nArray = new int[lllIIlllII[0]];
                                nArray[v.lllIIlllII[1]] = lllIIlllII[135];
                                TileObjects.getNearest((int[])nArray).interact(lllIIlIIlI[lllIIlllII[63]]);
                                Time.sleepTicks((int)lllIIlllII[7]);
                                0;
                            }
                        }
                        String[] stringArray23 = new String[lllIIlllII[0]];
                        stringArray23[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[136]];
                        if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray23) ? 1 : 0)) {
                            String[] stringArray24 = new String[lllIIlllII[0]];
                            stringArray24[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[137]];
                            if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray24) ? 1 : 0)) {
                                AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[138]];
                                int[] nArray = new int[lllIIlllII[0]];
                                nArray[v.lllIIlllII[1]] = lllIIlllII[139];
                                TileObjects.getNearest((int[])nArray).interact(lllIIlIIlI[lllIIlllII[140]]);
                                Time.sleepTicks((int)lllIIlllII[7]);
                                0;
                            }
                        }
                        String[] stringArray25 = new String[lllIIlllII[0]];
                        stringArray25[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[128]];
                        if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray25) ? 1 : 0)) {
                            String[] stringArray26 = new String[lllIIlllII[0]];
                            stringArray26[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[141]];
                            if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray26) ? 1 : 0)) {
                                String[] stringArray27 = new String[lllIIlllII[0]];
                                stringArray27[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[142]];
                                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray27) ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[143]];
                                    String[] stringArray28 = new String[lllIIlllII[0]];
                                    stringArray28[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[144]];
                                    String[] stringArray29 = new String[lllIIlllII[0]];
                                    stringArray29[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[145]];
                                    Inventory.getFirst((String[])stringArray28).useOn(Inventory.getFirst((String[])stringArray29));
                                    Time.sleepTicks((int)lllIIlllII[6]);
                                    0;
                                }
                            }
                        }
                    }
                }
                String[] stringArray30 = new String[lllIIlllII[0]];
                stringArray30[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[146]];
                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray30) ? 1 : 0)) {
                    String[] stringArray31 = new String[lllIIlllII[0]];
                    stringArray31[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[147]];
                    if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray31) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[148]];
                        String[] stringArray32 = new String[lllIIlllII[0]];
                        stringArray32[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[149]];
                        int[] nArray = new int[lllIIlllII[0]];
                        nArray[v.lllIIlllII[1]] = lllIIlllII[36];
                        Inventory.getFirst((String[])stringArray32).useOn(Inventory.getFirst((int[])nArray));
                        Time.sleepTicks((int)lllIIlllII[6]);
                        0;
                    }
                }
                String[] stringArray33 = new String[lllIIlllII[0]];
                stringArray33[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[150]];
                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray33) ? 1 : 0)) {
                    String[] stringArray34 = new String[lllIIlllII[0]];
                    stringArray34[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[151]];
                    if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray34) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[152]];
                        String[] stringArray35 = new String[lllIIlllII[0]];
                        stringArray35[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[153]];
                        String[] stringArray36 = new String[lllIIlllII[0]];
                        stringArray36[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[154]];
                        Inventory.getFirst((String[])stringArray35).useOn(Inventory.getFirst((String[])stringArray36));
                        Time.sleepTicks((int)lllIIlllII[6]);
                        0;
                    }
                }
                String[] stringArray37 = new String[lllIIlllII[0]];
                stringArray37[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[155]];
                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray37) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[156]];
                    String[] stringArray38 = new String[lllIIlllII[0]];
                    stringArray38[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[157]];
                    String[] stringArray39 = new String[lllIIlllII[0]];
                    stringArray39[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[158]];
                    Inventory.getFirst((String[])stringArray38).useOn(TileObjects.getNearest((String[])stringArray39));
                    Time.sleepTicks((int)lllIIlllII[8]);
                    0;
                }
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[141])) {
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[142])) {
                g.a(lllIIlIIlI[lllIIlllII[159]], cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[143])) {
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[144])) {
                String[] stringArray40 = new String[lllIIlllII[0]];
                stringArray40[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[160]];
                if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray40) ? 1 : 0)) {
                    String[] stringArray41 = new String[lllIIlllII[0]];
                    stringArray41[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[161]];
                    if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray41) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[162]];
                        int[] nArray = new int[lllIIlllII[0]];
                        nArray[v.lllIIlllII[1]] = lllIIlllII[135];
                        TileObjects.getNearest((int[])nArray).interact(lllIIlIIlI[lllIIlllII[163]]);
                        Time.sleepTicks((int)lllIIlllII[7]);
                        0;
                    }
                }
                String[] stringArray42 = new String[lllIIlllII[0]];
                stringArray42[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[164]];
                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray42) ? 1 : 0)) {
                    String[] stringArray43 = new String[lllIIlllII[0]];
                    stringArray43[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[165]];
                    if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray43) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[166]];
                        int[] nArray = new int[lllIIlllII[0]];
                        nArray[v.lllIIlllII[1]] = lllIIlllII[139];
                        TileObjects.getNearest((int[])nArray).interact(lllIIlIIlI[lllIIlllII[167]]);
                        Time.sleepTicks((int)lllIIlllII[7]);
                        0;
                    }
                }
                String[] stringArray44 = new String[lllIIlllII[0]];
                stringArray44[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[168]];
                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray44) ? 1 : 0)) {
                    String[] stringArray45 = new String[lllIIlllII[0]];
                    stringArray45[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[169]];
                    if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray45) ? 1 : 0)) {
                        String[] stringArray46 = new String[lllIIlllII[0]];
                        stringArray46[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[170]];
                        if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray46) ? 1 : 0)) {
                            String[] stringArray47 = new String[lllIIlllII[0]];
                            stringArray47[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[171]];
                            String[] stringArray48 = new String[lllIIlllII[0]];
                            stringArray48[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[172]];
                            Inventory.getFirst((String[])stringArray47).useOn(Inventory.getFirst((String[])stringArray48));
                            Time.sleepTicks((int)lllIIlllII[6]);
                            0;
                        }
                    }
                }
                String[] stringArray49 = new String[lllIIlllII[0]];
                stringArray49[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[173]];
                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray49) ? 1 : 0)) {
                    String[] stringArray50 = new String[lllIIlllII[0]];
                    stringArray50[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[174]];
                    if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray50) ? 1 : 0)) {
                        String[] stringArray51 = new String[lllIIlllII[0]];
                        stringArray51[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[175]];
                        int[] nArray = new int[lllIIlllII[0]];
                        nArray[v.lllIIlllII[1]] = lllIIlllII[36];
                        Inventory.getFirst((String[])stringArray51).useOn(Inventory.getFirst((int[])nArray));
                        Time.sleepTicks((int)lllIIlllII[6]);
                        0;
                    }
                }
                String[] stringArray52 = new String[lllIIlllII[0]];
                stringArray52[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[176]];
                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray52) ? 1 : 0)) {
                    String[] stringArray53 = new String[lllIIlllII[0]];
                    stringArray53[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[177]];
                    if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray53) ? 1 : 0)) {
                        String[] stringArray54 = new String[lllIIlllII[0]];
                        stringArray54[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[178]];
                        String[] stringArray55 = new String[lllIIlllII[0]];
                        stringArray55[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[179]];
                        Inventory.getFirst((String[])stringArray54).useOn(Inventory.getFirst((String[])stringArray55));
                        Time.sleepTicks((int)lllIIlllII[6]);
                        0;
                    }
                }
                String[] stringArray56 = new String[lllIIlllII[0]];
                stringArray56[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[180]];
                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray56) ? 1 : 0)) {
                    String[] stringArray57 = new String[lllIIlllII[0]];
                    stringArray57[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[181]];
                    String[] stringArray58 = new String[lllIIlllII[0]];
                    stringArray58[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[182]];
                    Inventory.getFirst((String[])stringArray57).useOn(TileObjects.getNearest((String[])stringArray58));
                    Time.sleepTicks((int)lllIIlllII[8]);
                    0;
                }
                g.a(cE);
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[145])) {
                lllllllllllllllllIlllIIlllIIlIlI = new WorldArea(lllIIlllII[183], lllIIlllII[184], lllIIlllII[12], lllIIlllII[9], lllIIlllII[1]);
                if (v.llIIIIlIlIIll(lllllllllllllllllIlllIIlllIIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray59 = new String[lllIIlllII[0]];
                    stringArray59[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[185]];
                    TileObjects.getNearest((String[])stringArray59).interact(lllIIlIIlI[lllIIlllII[186]]);
                    Time.sleepTicks((int)lllIIlllII[8]);
                    0;
                }
                if (v.llIIIIlIlIIIl(lllllllllllllllllIlllIIlllIIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray60 = new String[lllIIlllII[0]];
                    stringArray60[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[187]];
                    String[] stringArray61 = new String[lllIIlllII[0]];
                    stringArray61[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[188]];
                    if (v.llIIIIlIlIIIl(TileObjects.getNearest((String[])stringArray60).hasAction(stringArray61) ? 1 : 0)) {
                        String[] stringArray62 = new String[lllIIlllII[0]];
                        stringArray62[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[189]];
                        TileObjects.getNearest((String[])stringArray62).interact(lllIIlIIlI[lllIIlllII[190]]);
                        Time.sleepTicks((int)lllIIlllII[7]);
                        0;
                    }
                    String[] stringArray63 = new String[lllIIlllII[0]];
                    stringArray63[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[191]];
                    String[] stringArray64 = new String[lllIIlllII[0]];
                    stringArray64[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[192]];
                    if (v.llIIIIlIlIIIl(TileObjects.getNearest((String[])stringArray63).hasAction(stringArray64) ? 1 : 0)) {
                        String[] stringArray65 = new String[lllIIlllII[0]];
                        stringArray65[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[193]];
                        TileObjects.getNearest((String[])stringArray65).interact(lllIIlIIlI[lllIIlllII[194]]);
                        Time.sleepTicks((int)lllIIlllII[7]);
                        0;
                    }
                }
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[146])) {
                lllllllllllllllllIlllIIlllIIlIlI = new WorldArea(lllIIlllII[183], lllIIlllII[184], lllIIlllII[12], lllIIlllII[9], lllIIlllII[1]);
                if (v.llIIIIlIlIIIl(lllllllllllllllllIlllIIlllIIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray66 = new String[lllIIlllII[0]];
                    stringArray66[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[195]];
                    TileObjects.getNearest((String[])stringArray66).interact(lllIIlIIlI[lllIIlllII[196]]);
                    Time.sleepTicks((int)lllIIlllII[8]);
                    0;
                }
                if (v.llIIIIlIlIIll(lllllllllllllllllIlllIIlllIIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    g.a(lllIIlIIlI[lllIIlllII[197]], cE);
                }
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[150])) {
                lllllllllllllllllIlllIIlllIIlIlI = new WorldArea(lllIIlllII[198], lllIIlllII[199], lllIIlllII[24], lllIIlllII[48], lllIIlllII[1]);
                while (v.llIIIIlIlIIIl(lllllllllllllllllIlllIIlllIIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] nArray = new int[lllIIlllII[0]];
                    nArray[v.lllIIlllII[1]] = lllIIlllII[31];
                    Inventory.getFirst((int[])nArray).interact(lllIIlIIlI[lllIIlllII[200]]);
                    Time.sleepTicks((int)lllIIlllII[9]);
                    0;
                    0;
                    if (-(8 ^ 0x7B ^ (0xB3 ^ 0xC4)) < 0) continue;
                    return;
                }
                lllllllllllllllllIlllIIlllIIlIIl = new WorldArea(lllIIlllII[67], lllIIlllII[119], lllIIlllII[111], lllIIlllII[120], lllIIlllII[1]);
                lllllllllllllllllIlllIIlllIIlIII = new WorldArea(lllIIlllII[67], lllIIlllII[119], lllIIlllII[111], lllIIlllII[120], lllIIlllII[0]);
                lllllllllllllllllIlllIIlllIIIlll = new WorldArea(lllIIlllII[67], lllIIlllII[119], lllIIlllII[111], lllIIlllII[120], lllIIlllII[6]);
                lllllllllllllllllIlllIIlllIIIllI = new WorldArea(lllIIlllII[67], lllIIlllII[119], lllIIlllII[111], lllIIlllII[120], lllIIlllII[7]);
                if (v.llIIIIlIlIIll(do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(y.dQ), lllIIlllII[4]) && v.llIIIIlIlIIll(lllllllllllllllllIlllIIlllIIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(lllllllllllllllllIlllIIlllIIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(lllllllllllllllllIlllIIlllIIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(lllllllllllllllllIlllIIlllIIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[201]];
                    if (v.llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    y.bp();
                }
                y.bq();
                if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(y.dQ), lllIIlllII[4])) {
                    if (v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(y.dQ), lllIIlllII[12])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[202]];
                        Movement.walkTo((WorldPoint)y.dQ);
                        0;
                        Time.sleepTicks((int)lllIIlllII[0]);
                        0;
                    }
                    if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(y.dQ), lllIIlllII[12])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[203]];
                        g.a(lllIIlIIlI[lllIIlllII[204]], cE);
                    }
                }
                g.a(cE);
            }
            if (!v.llIIIIlIllIlI(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[155]) || v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[160])) {
                String[] stringArray67 = new String[lllIIlllII[0]];
                stringArray67[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[205]];
                if (v.llIIIIlIlIlIl(NPCs.getNearest((String[])stringArray67))) {
                    AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[206]];
                    if (v.llIIIIlIlIIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                    }
                    if (v.llIIIIlIlIIll(Prayers.isEnabled((Prayer)Prayer.ULTIMATE_STRENGTH) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.ULTIMATE_STRENGTH);
                    }
                    if (v.llIIIIlIlIIll(Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
                    }
                    if (v.llIIIIlIllIll(v.llIIIIlIIllll(e.w(), 70.0))) {
                        String[] stringArray68 = new String[lllIIlllII[0]];
                        stringArray68[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[207]];
                        if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray68) ? 1 : 0)) {
                            String[] stringArray69 = new String[lllIIlllII[0]];
                            stringArray69[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[208]];
                            Inventory.getFirst((String[])stringArray69).interact(lllIIlIIlI[lllIIlllII[26]]);
                        }
                    }
                    if (v.llIIIIlIllIIl(Skills.getLevel((Skill)Skill.STRENGTH), Skills.getBoostedLevel((Skill)Skill.STRENGTH)) && v.llIIIIlIlIIIl(Inventory.contains((int[])f.aY) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.aY).interact(lllIIlIIlI[lllIIlllII[209]]);
                    }
                    if (v.llIIIIlIlIIlI(Prayers.getPoints(), lllIIlllII[64])) {
                        int[] nArray = new int[lllIIlllII[0]];
                        nArray[v.lllIIlllII[1]] = lllIIlllII[18];
                        if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray30 = new int[lllIIlllII[0]];
                            nArray30[v.lllIIlllII[1]] = lllIIlllII[18];
                            Inventory.getFirst((int[])nArray30).interact(lllIIlIIlI[lllIIlllII[210]]);
                        }
                        int[] nArray31 = new int[lllIIlllII[0]];
                        nArray31[v.lllIIlllII[1]] = lllIIlllII[211];
                        if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray31) ? 1 : 0)) {
                            int[] nArray32 = new int[lllIIlllII[0]];
                            nArray32[v.lllIIlllII[1]] = lllIIlllII[211];
                            Inventory.getFirst((int[])nArray32).interact(lllIIlIIlI[lllIIlllII[212]]);
                        }
                        int[] nArray33 = new int[lllIIlllII[0]];
                        nArray33[v.lllIIlllII[1]] = lllIIlllII[213];
                        if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray33) ? 1 : 0)) {
                            int[] nArray34 = new int[lllIIlllII[0]];
                            nArray34[v.lllIIlllII[1]] = lllIIlllII[213];
                            Inventory.getFirst((int[])nArray34).interact(lllIIlIIlI[lllIIlllII[120]]);
                        }
                        int[] nArray35 = new int[lllIIlllII[0]];
                        nArray35[v.lllIIlllII[1]] = lllIIlllII[214];
                        if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray35) ? 1 : 0)) {
                            int[] nArray36 = new int[lllIIlllII[0]];
                            nArray36[v.lllIIlllII[1]] = lllIIlllII[214];
                            Inventory.getFirst((int[])nArray36).interact(lllIIlIIlI[lllIIlllII[215]]);
                        }
                    }
                    if (v.llIIIIlIlllII(Players.getLocal().getInteracting())) {
                        String[] stringArray70 = new String[lllIIlllII[0]];
                        stringArray70[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[216]];
                        NPCs.getNearest((String[])stringArray70).interact(lllIIlIIlI[lllIIlllII[217]]);
                    }
                }
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[170])) {
                int[] nArray = new int[lllIIlllII[0]];
                nArray[v.lllIIlllII[1]] = lllIIlllII[34];
                if (v.llIIIIlIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    if (v.llIIIIlIlIIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                    }
                    if (v.llIIIIlIlIIIl(Prayers.isEnabled((Prayer)Prayer.ULTIMATE_STRENGTH) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.ULTIMATE_STRENGTH);
                    }
                    if (v.llIIIIlIlIIIl(Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
                    }
                    if (v.llIIIIlIlIIlI(Prayers.getPoints(), lllIIlllII[3])) {
                        int[] nArray37 = new int[lllIIlllII[0]];
                        nArray37[v.lllIIlllII[1]] = lllIIlllII[18];
                        if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray37) ? 1 : 0)) {
                            int[] nArray38 = new int[lllIIlllII[0]];
                            nArray38[v.lllIIlllII[1]] = lllIIlllII[18];
                            Inventory.getFirst((int[])nArray38).interact(lllIIlIIlI[lllIIlllII[218]]);
                        }
                        int[] nArray39 = new int[lllIIlllII[0]];
                        nArray39[v.lllIIlllII[1]] = lllIIlllII[18];
                        if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray39) ? 1 : 0)) {
                            int[] nArray40 = new int[lllIIlllII[0]];
                            nArray40[v.lllIIlllII[1]] = lllIIlllII[18];
                            Inventory.getFirst((int[])nArray40).interact(lllIIlIIlI[lllIIlllII[219]]);
                        }
                        int[] nArray41 = new int[lllIIlllII[0]];
                        nArray41[v.lllIIlllII[1]] = lllIIlllII[211];
                        if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray41) ? 1 : 0)) {
                            int[] nArray42 = new int[lllIIlllII[0]];
                            nArray42[v.lllIIlllII[1]] = lllIIlllII[211];
                            Inventory.getFirst((int[])nArray42).interact(lllIIlIIlI[lllIIlllII[220]]);
                        }
                        int[] nArray43 = new int[lllIIlllII[0]];
                        nArray43[v.lllIIlllII[1]] = lllIIlllII[213];
                        if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray43) ? 1 : 0)) {
                            int[] nArray44 = new int[lllIIlllII[0]];
                            nArray44[v.lllIIlllII[1]] = lllIIlllII[213];
                            Inventory.getFirst((int[])nArray44).interact(lllIIlIIlI[lllIIlllII[221]]);
                        }
                        int[] nArray45 = new int[lllIIlllII[0]];
                        nArray45[v.lllIIlllII[1]] = lllIIlllII[214];
                        if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray45) ? 1 : 0)) {
                            int[] nArray46 = new int[lllIIlllII[0]];
                            nArray46[v.lllIIlllII[1]] = lllIIlllII[214];
                            Inventory.getFirst((int[])nArray46).interact(lllIIlIIlI[lllIIlllII[222]]);
                        }
                    }
                    if (v.llIIIIlIllIll(v.llIIIIlIIllll(e.w(), 100.0))) {
                        String[] stringArray71 = new String[lllIIlllII[0]];
                        stringArray71[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[223]];
                        if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray71) ? 1 : 0)) {
                            String[] stringArray72 = new String[lllIIlllII[0]];
                            stringArray72[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[224]];
                            Inventory.getFirst((String[])stringArray72).interact(lllIIlIIlI[lllIIlllII[225]]);
                        }
                    }
                    if (v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(D.fa), lllIIlllII[13])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[226]];
                        lllllllllllllllllIlllIIlllIIlIlI = new WorldArea(lllIIlllII[227], lllIIlllII[228], lllIIlllII[222], lllIIlllII[229], lllIIlllII[1]);
                        if (v.llIIIIlIlIIll(lllllllllllllllllIlllIIlllIIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] nArray47 = new int[lllIIlllII[0]];
                            nArray47[v.lllIIlllII[1]] = lllIIlllII[31];
                            Inventory.getFirst((int[])nArray47).interact(lllIIlIIlI[lllIIlllII[230]]);
                            Time.sleepTicks((int)lllIIlllII[12]);
                            0;
                        }
                        if (v.llIIIIlIlIIIl(lllllllllllllllllIlllIIlllIIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)D.fa);
                            0;
                            Time.sleepTicks((int)lllIIlllII[0]);
                            0;
                        }
                    }
                    if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(D.fa), lllIIlllII[13])) {
                        if (v.llIIIIlIlIIll(Bank.isOpen() ? 1 : 0)) {
                            int[] nArray48 = new int[lllIIlllII[0]];
                            nArray48[v.lllIIlllII[1]] = lllIIlllII[117];
                            if (v.llIIIIlIlIlIl(TileObjects.getNearest((int[])nArray48)) && v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(D.fa), lllIIlllII[15])) {
                                int[] nArray49 = new int[lllIIlllII[0]];
                                nArray49[v.lllIIlllII[1]] = lllIIlllII[117];
                                TileObjects.getNearest((int[])nArray49).interact(lllIIlIIlI[lllIIlllII[231]]);
                                Time.sleepTicks((int)lllIIlllII[6]);
                                0;
                            }
                        }
                        if (v.llIIIIlIlIIIl(Bank.isOpen() ? 1 : 0)) {
                            String[] stringArray73 = new String[lllIIlllII[0]];
                            stringArray73[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[232]];
                            Bank.depositAll((String[])stringArray73);
                            int[] nArray50 = new int[lllIIlllII[0]];
                            nArray50[v.lllIIlllII[1]] = lllIIlllII[32];
                            Bank.depositAll((int[])nArray50);
                            Bank.withdraw((int)lllIIlllII[34], (int)lllIIlllII[0], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Bank.withdraw((int)lllIIlllII[33], (int)lllIIlllII[0], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Bank.withdraw((int)lllIIlllII[21], (int)lllIIlllII[7], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Bank.withdraw((int)lllIIlllII[37], (int)lllIIlllII[0], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        }
                    }
                }
                String[] stringArray74 = new String[lllIIlllII[0]];
                stringArray74[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[233]];
                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray74) ? 1 : 0) && v.llIIIIlIlIIll(do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (v.llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    y.bp();
                }
                if (v.llIIIIlIlIIIl(do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dn), lllIIlllII[9])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[234]];
                        Movement.walkTo((WorldPoint)dn);
                        0;
                        Time.sleepTicks((int)lllIIlllII[0]);
                        0;
                    }
                    if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dn), lllIIlllII[9])) {
                        String[] stringArray75 = new String[lllIIlllII[0]];
                        stringArray75[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[235]];
                        String[] stringArray76 = new String[lllIIlllII[0]];
                        stringArray76[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[236]];
                        if (v.llIIIIlIlIIIl(TileObjects.getNearest((String[])stringArray75).hasAction(stringArray76) ? 1 : 0)) {
                            String[] stringArray77 = new String[lllIIlllII[0]];
                            stringArray77[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[237]];
                            TileObjects.getNearest((String[])stringArray77).interact(lllIIlIIlI[lllIIlllII[229]]);
                            Time.sleepTicks((int)lllIIlllII[8]);
                            0;
                        }
                        String[] stringArray78 = new String[lllIIlllII[0]];
                        stringArray78[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[238]];
                        String[] stringArray79 = new String[lllIIlllII[0]];
                        stringArray79[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[239]];
                        if (v.llIIIIlIlIIIl(TileObjects.getNearest((String[])stringArray78).hasAction(stringArray79) ? 1 : 0)) {
                            String[] stringArray80 = new String[lllIIlllII[0]];
                            stringArray80[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[240]];
                            TileObjects.getNearest((String[])stringArray80).interact(lllIIlIIlI[lllIIlllII[241]]);
                            Time.sleepTicks((int)lllIIlllII[8]);
                            0;
                        }
                    }
                }
                if (v.llIIIIlIlIIIl(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    g.a(lllIIlIIlI[lllIIlllII[242]], cE);
                }
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[175])) {
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[180])) {
                String[] stringArray81 = new String[lllIIlllII[0]];
                stringArray81[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[243]];
                if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray81) ? 1 : 0)) {
                    g.a(lllIIlIIlI[lllIIlllII[244]], cE);
                }
                String[] stringArray82 = new String[lllIIlllII[0]];
                stringArray82[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[245]];
                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray82) ? 1 : 0)) {
                    String[] stringArray83 = new String[lllIIlllII[0]];
                    stringArray83[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[246]];
                    Inventory.getFirst((String[])stringArray83).interact(lllIIlIIlI[lllIIlllII[247]]);
                    Time.sleepTicks((int)lllIIlllII[6]);
                    0;
                }
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[187])) {
                String[] stringArray84 = new String[lllIIlllII[0]];
                stringArray84[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[248]];
                if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray84) ? 1 : 0)) {
                    String[] stringArray85 = new String[lllIIlllII[0]];
                    stringArray85[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[249]];
                    if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray85) ? 1 : 0)) {
                        int[] nArray = new int[lllIIlllII[0]];
                        nArray[v.lllIIlllII[1]] = lllIIlllII[250];
                        if (v.llIIIIlIlIlIl(TileObjects.getNearest((int[])nArray))) {
                            String[] stringArray86 = new String[lllIIlllII[0]];
                            stringArray86[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[251]];
                            if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray86) ? 1 : 0)) {
                                String[] stringArray87 = new String[lllIIlllII[0]];
                                stringArray87[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[252]];
                                Inventory.getFirst((String[])stringArray87).interact(lllIIlIIlI[lllIIlllII[253]]);
                            }
                            int[] nArray51 = new int[lllIIlllII[0]];
                            nArray51[v.lllIIlllII[1]] = lllIIlllII[250];
                            TileObjects.getNearest((int[])nArray51).interact(lllIIlIIlI[lllIIlllII[254]]);
                            Time.sleepTicks((int)lllIIlllII[7]);
                            0;
                        }
                    }
                    String[] stringArray88 = new String[lllIIlllII[0]];
                    stringArray88[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[255]];
                    if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray88) ? 1 : 0)) {
                        String[] stringArray89 = new String[lllIIlllII[0]];
                        stringArray89[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[256]];
                        if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray89) ? 1 : 0)) {
                            int[] nArray = new int[lllIIlllII[0]];
                            nArray[v.lllIIlllII[1]] = lllIIlllII[257];
                            if (v.llIIIIlIlIlIl(TileObjects.getNearest((int[])nArray))) {
                                String[] stringArray90 = new String[lllIIlllII[0]];
                                stringArray90[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[258]];
                                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray90) ? 1 : 0)) {
                                    String[] stringArray91 = new String[lllIIlllII[0]];
                                    stringArray91[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[259]];
                                    Inventory.getFirst((String[])stringArray91).interact(lllIIlIIlI[lllIIlllII[260]]);
                                }
                                int[] nArray52 = new int[lllIIlllII[0]];
                                nArray52[v.lllIIlllII[1]] = lllIIlllII[257];
                                TileObjects.getNearest((int[])nArray52).interact(lllIIlIIlI[lllIIlllII[261]]);
                                Time.sleepTicks((int)lllIIlllII[7]);
                                0;
                            }
                        }
                    }
                    String[] stringArray92 = new String[lllIIlllII[0]];
                    stringArray92[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[262]];
                    if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray92) ? 1 : 0)) {
                        String[] stringArray93 = new String[lllIIlllII[0]];
                        stringArray93[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[263]];
                        if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray93) ? 1 : 0)) {
                            String[] stringArray94 = new String[lllIIlllII[0]];
                            stringArray94[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[264]];
                            if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray94) ? 1 : 0)) {
                                if (v.llIIIIlIlIIlI(dt, lllIIlllII[6])) {
                                    g.a(lllIIlIIlI[lllIIlllII[265]], cE);
                                    Time.sleepTicks((int)lllIIlllII[8]);
                                    0;
                                    dt += lllIIlllII[0];
                                }
                                g.a(cE);
                                if (v.llIIIIlIlIIll(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray95 = new String[lllIIlllII[0]];
                                    stringArray95[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[266]];
                                    if (v.llIIIIlIlllII(NPCs.getNearest((String[])stringArray95))) {
                                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[267]];
                                        if (v.llIIIIlIlIIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllIIlllII[268], lllIIlllII[87], lllIIlllII[1])) ? 1 : 0)) {
                                            if (v.llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                                Dialog.close();
                                            }
                                            Movement.walkTo((WorldPoint)new WorldPoint(lllIIlllII[268], lllIIlllII[87], lllIIlllII[1]));
                                            0;
                                            Time.sleepTicks((int)lllIIlllII[0]);
                                            0;
                                        }
                                        if (v.llIIIIlIlIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllIIlllII[268], lllIIlllII[87], lllIIlllII[1])) ? 1 : 0)) {
                                            String[] stringArray96 = new String[lllIIlllII[0]];
                                            stringArray96[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[269]];
                                            TileObjects.getNearest((String[])stringArray96).interact(lllIIlIIlI[lllIIlllII[270]]);
                                            Time.sleepTicks((int)lllIIlllII[6]);
                                            0;
                                            String[] stringArray97 = new String[lllIIlllII[0]];
                                            stringArray97[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[271]];
                                            TileObjects.getNearest((String[])stringArray97).interact(lllIIlIIlI[lllIIlllII[272]]);
                                            Time.sleepTicks((int)lllIIlllII[6]);
                                            0;
                                        }
                                    }
                                    String[] stringArray98 = new String[lllIIlllII[0]];
                                    stringArray98[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[273]];
                                    if (v.llIIIIlIlIlIl(NPCs.getNearest((String[])stringArray98))) {
                                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[274]];
                                        g.a(lllIIlIIlI[lllIIlllII[275]], cE);
                                    }
                                }
                            }
                        }
                    }
                    String[] stringArray99 = new String[lllIIlllII[0]];
                    stringArray99[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[276]];
                    if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray99) ? 1 : 0)) {
                        String[] stringArray100 = new String[lllIIlllII[0]];
                        stringArray100[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[277]];
                        if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray100) ? 1 : 0)) {
                            String[] stringArray101 = new String[lllIIlllII[0]];
                            stringArray101[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[278]];
                            if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray101) ? 1 : 0)) {
                                String[] stringArray102 = new String[lllIIlllII[0]];
                                stringArray102[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[279]];
                                String[] stringArray103 = new String[lllIIlllII[0]];
                                stringArray103[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[280]];
                                Inventory.getFirst((String[])stringArray102).useOn(Inventory.getFirst((String[])stringArray103));
                            }
                        }
                    }
                    String[] stringArray104 = new String[lllIIlllII[0]];
                    stringArray104[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[281]];
                    if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray104) ? 1 : 0)) {
                        String[] stringArray105 = new String[lllIIlllII[0]];
                        stringArray105[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[282]];
                        Magic.cast((Spell)SpellBook.Standard.LVL_2_ENCHANT, (Item)Inventory.getFirst((String[])stringArray105));
                    }
                    String[] stringArray106 = new String[lllIIlllII[0]];
                    stringArray106[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[283]];
                    if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray106) ? 1 : 0)) {
                        String[] stringArray107 = new String[lllIIlllII[0]];
                        stringArray107[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[284]];
                        String[] stringArray108 = new String[lllIIlllII[0]];
                        stringArray108[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[285]];
                        Inventory.getFirst((String[])stringArray107).useOn(Inventory.getFirst((String[])stringArray108));
                    }
                }
                String[] stringArray109 = new String[lllIIlllII[0]];
                stringArray109[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[286]];
                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray109) ? 1 : 0)) {
                    String[] stringArray110 = new String[lllIIlllII[0]];
                    stringArray110[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[287]];
                    if (v.llIIIIlIlIlIl(NPCs.getNearest((String[])stringArray110))) {
                        String[] stringArray111 = new String[lllIIlllII[0]];
                        stringArray111[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[288]];
                        TileObjects.getNearest((String[])stringArray111).interact(lllIIlIIlI[lllIIlllII[289]]);
                        Time.sleepTicks((int)lllIIlllII[8]);
                        0;
                    }
                    String[] stringArray112 = new String[lllIIlllII[0]];
                    stringArray112[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[290]];
                    if (v.llIIIIlIlllII(NPCs.getNearest((String[])stringArray112))) {
                        if (v.llIIIIlIlIIll(do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (v.llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            y.bp();
                        }
                        if (v.llIIIIlIlIIIl(do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dn), lllIIlllII[9])) {
                                AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[291]];
                                Movement.walkTo((WorldPoint)dn);
                                0;
                                Time.sleepTicks((int)lllIIlllII[0]);
                                0;
                            }
                            if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dn), lllIIlllII[9])) {
                                String[] stringArray113 = new String[lllIIlllII[0]];
                                stringArray113[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[292]];
                                String[] stringArray114 = new String[lllIIlllII[0]];
                                stringArray114[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[293]];
                                if (v.llIIIIlIlIIIl(TileObjects.getNearest((String[])stringArray113).hasAction(stringArray114) ? 1 : 0)) {
                                    String[] stringArray115 = new String[lllIIlllII[0]];
                                    stringArray115[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[294]];
                                    TileObjects.getNearest((String[])stringArray115).interact(lllIIlIIlI[lllIIlllII[295]]);
                                    Time.sleepTicks((int)lllIIlllII[8]);
                                    0;
                                }
                                String[] stringArray116 = new String[lllIIlllII[0]];
                                stringArray116[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[296]];
                                String[] stringArray117 = new String[lllIIlllII[0]];
                                stringArray117[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[38]];
                                if (v.llIIIIlIlIIIl(TileObjects.getNearest((String[])stringArray116).hasAction(stringArray117) ? 1 : 0)) {
                                    String[] stringArray118 = new String[lllIIlllII[0]];
                                    stringArray118[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[297]];
                                    TileObjects.getNearest((String[])stringArray118).interact(lllIIlIIlI[lllIIlllII[298]]);
                                    Time.sleepTicks((int)lllIIlllII[8]);
                                    0;
                                }
                            }
                        }
                        if (v.llIIIIlIlIIIl(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            g.a(lllIIlIIlI[lllIIlllII[299]], cE);
                        }
                        g.a(cE);
                    }
                }
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[192])) {
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[197])) {
                g.a(cE);
                if (v.llIIIIlIlIIll(Dialog.isOpen() ? 1 : 0)) {
                    if (v.llIIIIlIlIIIl(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray119 = new String[lllIIlllII[0]];
                        stringArray119[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[300]];
                        if (v.llIIIIlIlIIll(Equipment.contains((String[])stringArray119) ? 1 : 0)) {
                            String[] stringArray120 = new String[lllIIlllII[0]];
                            stringArray120[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[301]];
                            Inventory.getFirst((String[])stringArray120).interact(lllIIlIIlI[lllIIlllII[36]]);
                        }
                        String[] stringArray121 = new String[lllIIlllII[0]];
                        stringArray121[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[302]];
                        TileObjects.getNearest((String[])stringArray121).interact(lllIIlIIlI[lllIIlllII[303]]);
                        Time.sleepTicks((int)lllIIlllII[8]);
                        0;
                    }
                    if (v.llIIIIlIlIIll(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (v.llIIIIlIlIIll(v.ba() ? 1 : 0)) {
                            v.bb();
                        }
                        if (v.llIIIIlIlIIIl(v.ba() ? 1 : 0)) {
                            g.a(lllIIlIIlI[lllIIlllII[304]], cE);
                        }
                    }
                }
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[204])) {
                String[] stringArray122 = new String[lllIIlllII[0]];
                stringArray122[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[305]];
                lllllllllllllllllIlllIIlllIIlIlI = NPCs.getNearest((String[])stringArray122);
                if (v.llIIIIlIlllII(lllllllllllllllllIlllIIlllIIlIlI)) {
                    if (v.llIIIIlIlIIIl(v.ba() ? 1 : 0)) {
                        if (v.llIIIIlIllIll(v.llIIIIlIIllll(e.w(), 100.0))) {
                            String[] stringArray123 = new String[lllIIlllII[0]];
                            stringArray123[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[306]];
                            if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray123) ? 1 : 0)) {
                                String[] stringArray124 = new String[lllIIlllII[0]];
                                stringArray124[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[307]];
                                Inventory.getFirst((String[])stringArray124).interact(lllIIlIIlI[lllIIlllII[308]]);
                                Time.sleepTicks((int)lllIIlllII[6]);
                                0;
                            }
                        }
                        if (v.llIIIIlIlIIlI(Prayers.getPoints(), lllIIlllII[3]) && v.llIIIIlIlIIIl(Inventory.contains((int[])f.aX) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aX).interact(lllIIlIIlI[lllIIlllII[309]]);
                            Time.sleepTicks((int)lllIIlllII[0]);
                            0;
                        }
                        g.a(lllIIlIIlI[lllIIlllII[310]], cE);
                    }
                    if (v.llIIIIlIlIIll(v.ba() ? 1 : 0)) {
                        v.bb();
                    }
                }
                if (v.llIIIIlIlIlIl(lllllllllllllllllIlllIIlllIIlIlI)) {
                    if (v.llIIIIlIlllII(dr)) {
                        dr = lllllllllllllllllIlllIIlllIIlIlI.getWorldLocation();
                        ds = new WorldPoint(dr.getX() - lllIIlllII[12], dr.getY(), dr.getPlane());
                    }
                    if (v.llIIIIlIlIIlI(Prayers.getPoints(), lllIIlllII[60]) && v.llIIIIlIlllIl(v.llIIIIlIlIIII(e.w(), 65.0))) {
                        Inventory.getFirst((int[])f.aX).interact(lllIIlIIlI[lllIIlllII[311]]);
                    }
                    if (v.llIIIIlIllIll(v.llIIIIlIIllll(e.w(), 65.0))) {
                        String[] stringArray125 = new String[lllIIlllII[0]];
                        stringArray125[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[312]];
                        if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray125) ? 1 : 0)) {
                            String[] stringArray126 = new String[lllIIlllII[0]];
                            stringArray126[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[313]];
                            Inventory.getFirst((String[])stringArray126).interact(lllIIlIIlI[lllIIlllII[314]]);
                        }
                    }
                    if (v.llIIIIlIlIlll(Skills.getLevel((Skill)Skill.STRENGTH) + lllIIlllII[20], Skills.getBoostedLevel((Skill)Skill.STRENGTH)) && v.llIIIIlIlIIIl(Inventory.contains((int[])f.aY) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.aY).interact(lllIIlIIlI[lllIIlllII[315]]);
                    }
                    String[] stringArray127 = new String[lllIIlllII[0]];
                    stringArray127[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[316]];
                    if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray127) ? 1 : 0) && !v.llIIIIlIlllIl(v.llIIIIlIIllll(e.w(), 50.0)) || v.llIIIIlIlIIll(Inventory.contains((int[])f.aX) ? 1 : 0) && v.llIIIIlIllIII(Prayers.getPoints(), lllIIlllII[7])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[317]];
                        lllllllllllllllllIlllIIlllIIlIIl = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (v.llIIIIlIlIIIl(tileObject.getName().equalsIgnoreCase(lllIIlIIlI[lllIIlllII[439]]) ? 1 : 0)) {
                                String[] stringArray = new String[lllIIlllII[0]];
                                stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[440]];
                                if (v.llIIIIlIlIIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n2 = lllIIlllII[0];
                                    0;
                                    if (-(0x35 ^ 0x62 ^ (0x6A ^ 0x38)) < 0) return n2 != 0;
                                    return ((0x2C ^ 0x5F ^ (0x3A ^ 0x40)) & (0x28 ^ 0x44 ^ (0x1A ^ 0x7F) ^ -1)) != 0;
                                }
                            }
                            n2 = lllIIlllII[1];
                            return n2 != 0;
                        });
                        if (v.llIIIIlIlIlIl(lllllllllllllllllIlllIIlllIIlIIl)) {
                            lllllllllllllllllIlllIIlllIIlIIl.interact(lllIIlIIlI[lllIIlllII[318]]);
                            Time.sleepTicks((int)lllIIlllII[8]);
                            0;
                        }
                    }
                    if (v.llIIIIlIlIIIl(AccBuilderSotf.i.containsKey(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[319]];
                        lllllllllllllllllIlllIIlllIIlIIl = TileObjects.getAll(tileObject -> {
                            int n2;
                            if (v.llIIIIlIllIIl(tileObject.getId(), lllIIlllII[436]) && v.llIIIIlIlIlll(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lllIIlllII[8])) {
                                n2 = lllIIlllII[0];
                                0;
                                if (-1 != -1) {
                                    return ((150 + 161 - 259 + 137 ^ 73 + 41 - 10 + 66) & (1 ^ (0xD3 ^ 0xC5) ^ -1)) != 0;
                                }
                            } else {
                                n2 = lllIIlllII[1];
                            }
                            return n2 != 0;
                        });
                        lllllllllllllllllIlllIIlllIIlIII = TileObjects.getAll(tileObject -> {
                            int n2;
                            if (v.llIIIIlIllIIl(tileObject.getId(), lllIIlllII[435]) && v.llIIIIlIlIlll(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lllIIlllII[8])) {
                                n2 = lllIIlllII[0];
                                0;
                                if (((0xA0 ^ 0x94) & ~(0xA4 ^ 0x90)) != 0) {
                                    return ((0xB4 ^ 0xBA) & ~(0x29 ^ 0x27)) != 0;
                                }
                            } else {
                                n2 = lllIIlllII[1];
                            }
                            return n2 != 0;
                        });
                        lllllllllllllllllIlllIIlllIIIlll = Players.getLocal().getWorldLocation();
                        if (v.llIIIIlIlIlII(lllllllllllllllllIlllIIlllIIIlll.distanceTo(ds), lllIIlllII[7])) {
                            Movement.walkTo((WorldPoint)ds);
                            0;
                        }
                        if (v.llIIIIlIlIlII(lllllllllllllllllIlllIIlllIIIlll.distanceTo(dr), lllIIlllII[7]) && v.llIIIIlIlIIll(Players.getLocal().isMoving() ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)dr);
                            0;
                        }
                    }
                    String[] stringArray128 = new String[lllIIlllII[0]];
                    stringArray128[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[320]];
                    if (v.llIIIIlIlIlIl(NPCs.getNearest((String[])stringArray128))) {
                        String[] stringArray129 = new String[lllIIlllII[0]];
                        stringArray129[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[321]];
                        String[] stringArray130 = new String[lllIIlllII[0]];
                        stringArray130[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[322]];
                        if (v.llIIIIlIlIIIl(NPCs.getNearest((String[])stringArray129).hasAction(stringArray130) ? 1 : 0)) {
                            String[] stringArray131 = new String[lllIIlllII[0]];
                            stringArray131[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[323]];
                            if (v.llIIIIlIlIIll(lllllllllllllllllIlllIIlllIIlIlI.hasAction(stringArray131) ? 1 : 0)) {
                                String[] stringArray132 = new String[lllIIlllII[0]];
                                stringArray132[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[324]];
                                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray132) ? 1 : 0)) {
                                    if (v.llIIIIlIlIIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                    }
                                    if (v.llIIIIlIlIIIl(Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                                        Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
                                    }
                                    if (v.llIIIIlIlIIIl(AccBuilderSotf.i.isEmpty() ? 1 : 0) && v.llIIIIlIlllII(Players.getLocal().getInteracting())) {
                                        NPCs.getNearest(nPC -> {
                                            int n2;
                                            if (v.llIIIIlIlIIIl(nPC.getName().equalsIgnoreCase(lllIIlIIlI[lllIIlllII[437]]) ? 1 : 0)) {
                                                String[] stringArray = new String[lllIIlllII[0]];
                                                stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[438]];
                                                if (v.llIIIIlIlIIIl(nPC.hasAction(stringArray) ? 1 : 0)) {
                                                    n2 = lllIIlllII[0];
                                                    0;
                                                    if (3 != ((0x66 ^ 0x3C) & ~(0xE3 ^ 0xB9))) return n2 != 0;
                                                    return ((0x63 ^ 0x67) & ~(0x36 ^ 0x32)) != 0;
                                                }
                                            }
                                            n2 = lllIIlllII[1];
                                            return n2 != 0;
                                        }).interact(lllIIlIIlI[lllIIlllII[325]]);
                                    }
                                }
                            }
                        }
                    }
                    String[] stringArray133 = new String[lllIIlllII[0]];
                    stringArray133[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[326]];
                    if (v.llIIIIlIlIlIl(NPCs.getNearest((String[])stringArray133))) {
                        String[] stringArray134 = new String[lllIIlllII[0]];
                        stringArray134[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[327]];
                        String[] stringArray135 = new String[lllIIlllII[0]];
                        stringArray135[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[328]];
                        if (v.llIIIIlIlIIll(NPCs.getNearest((String[])stringArray134).hasAction(stringArray135) ? 1 : 0)) {
                            String[] stringArray136 = new String[lllIIlllII[0]];
                            stringArray136[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[329]];
                            if (v.llIIIIlIlIIIl(lllllllllllllllllIlllIIlllIIlIlI.hasAction(stringArray136) ? 1 : 0)) {
                                if (v.llIIIIlIlIlll(lllllllllllllllllIlllIIlllIIlIlI.getHealthRatio(), lllIIlllII[29])) {
                                    if (v.llIIIIlIlIIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MAGIC) ? 1 : 0)) {
                                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MAGIC);
                                    }
                                    if (v.llIIIIlIlIIll(Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                                        Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
                                    }
                                }
                                if (v.llIIIIlIllIII(lllllllllllllllllIlllIIlllIIlIlI.getHealthRatio(), lllIIlllII[29]) && v.llIIIIlIlIIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                }
                                if (v.llIIIIlIllIIl(lllllllllllllllllIlllIIlllIIlIlI.getAnimation(), lllIIlllII[330])) {
                                    AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[331]];
                                    lllllllllllllllllIlllIIlllIIlIIl = TileObjects.getAll(arg_0 -> v.b((NPC)lllllllllllllllllIlllIIlllIIlIlI, arg_0));
                                    lllllllllllllllllIlllIIlllIIlIII = TileObjects.getAll(arg_0 -> v.a((NPC)lllllllllllllllllIlllIIlllIIlIlI, arg_0));
                                    Movement.walkTo((WorldPoint)ds);
                                    0;
                                    Time.sleepTicks((int)lllIIlllII[0]);
                                    0;
                                }
                                if (v.llIIIIlIllIlI(lllllllllllllllllIlllIIlllIIlIlI.getAnimation(), lllIIlllII[330]) && v.llIIIIlIlllII(Players.getLocal().getInteracting())) {
                                    lllllllllllllllllIlllIIlllIIlIlI.interact(lllIIlIIlI[lllIIlllII[332]]);
                                    Time.sleepTicks((int)lllIIlllII[0]);
                                    0;
                                }
                            }
                        }
                    }
                    String[] stringArray137 = new String[lllIIlllII[0]];
                    stringArray137[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[333]];
                    if (v.llIIIIlIlllII(NPCs.getNearest((String[])stringArray137))) {
                        String[] stringArray138 = new String[lllIIlllII[0]];
                        stringArray138[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[334]];
                        if (v.llIIIIlIlIIIl(lllllllllllllllllIlllIIlllIIlIlI.hasAction(stringArray138) ? 1 : 0)) {
                            if (v.llIIIIlIlIIll(Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
                            }
                            if (v.llIIIIlIlIlll(lllllllllllllllllIlllIIlllIIlIlI.getHealthRatio(), lllIIlllII[29]) && v.llIIIIlIlIIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MAGIC) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MAGIC);
                            }
                            if (v.llIIIIlIllIII(lllllllllllllllllIlllIIlllIIlIlI.getHealthRatio(), lllIIlllII[29]) && v.llIIIIlIlIIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (v.llIIIIlIllIlI(lllllllllllllllllIlllIIlllIIlIlI.getAnimation(), lllIIlllII[330]) && v.llIIIIlIlllII(Players.getLocal().getInteracting())) {
                                lllllllllllllllllIlllIIlllIIlIlI.interact(lllIIlIIlI[lllIIlllII[335]]);
                                Time.sleepTicks((int)lllIIlllII[0]);
                                0;
                            }
                        }
                    }
                }
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[26])) {
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[215])) {
                if (v.llIIIIlIlIIIl(do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] nArray = new int[lllIIlllII[0]];
                    nArray[v.lllIIlllII[1]] = lllIIlllII[30];
                    if (v.llIIIIlIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        if (v.llIIIIlIllIll(v.llIIIIlIIllll(e.w(), 100.0))) {
                            String[] stringArray139 = new String[lllIIlllII[0]];
                            stringArray139[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[336]];
                            if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray139) ? 1 : 0)) {
                                String[] stringArray140 = new String[lllIIlllII[0]];
                                stringArray140[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[337]];
                                Inventory.getFirst((String[])stringArray140).interact(lllIIlIIlI[lllIIlllII[338]]);
                            }
                        }
                        if (v.llIIIIlIlIIlI(Prayers.getPoints(), lllIIlllII[3]) && v.llIIIIlIlIIIl(Inventory.contains((int[])f.aX) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aX).interact(lllIIlIIlI[lllIIlllII[339]]);
                        }
                        v.bb();
                    }
                    int[] nArray53 = new int[lllIIlllII[0]];
                    nArray53[v.lllIIlllII[1]] = lllIIlllII[30];
                    if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray53) ? 1 : 0) && v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dn), lllIIlllII[9])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[340]];
                        Movement.walkTo((WorldPoint)dn);
                        0;
                        Time.sleepTicks((int)lllIIlllII[0]);
                        0;
                    }
                    if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dn), lllIIlllII[9])) {
                        String[] stringArray141 = new String[lllIIlllII[0]];
                        stringArray141[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[341]];
                        String[] stringArray142 = new String[lllIIlllII[0]];
                        stringArray142[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[342]];
                        if (v.llIIIIlIlIIIl(TileObjects.getNearest((String[])stringArray141).hasAction(stringArray142) ? 1 : 0)) {
                            String[] stringArray143 = new String[lllIIlllII[0]];
                            stringArray143[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[343]];
                            TileObjects.getNearest((String[])stringArray143).interact(lllIIlIIlI[lllIIlllII[344]]);
                            Time.sleepTicks((int)lllIIlllII[8]);
                            0;
                        }
                        String[] stringArray144 = new String[lllIIlllII[0]];
                        stringArray144[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[345]];
                        String[] stringArray145 = new String[lllIIlllII[0]];
                        stringArray145[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[346]];
                        if (v.llIIIIlIlIIIl(TileObjects.getNearest((String[])stringArray144).hasAction(stringArray145) ? 1 : 0)) {
                            String[] stringArray146 = new String[lllIIlllII[0]];
                            stringArray146[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[347]];
                            TileObjects.getNearest((String[])stringArray146).interact(lllIIlIIlI[lllIIlllII[348]]);
                            Time.sleepTicks((int)lllIIlllII[8]);
                            0;
                        }
                    }
                }
                if (v.llIIIIlIlIIIl(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (v.llIIIIlIlIIlI(di, lllIIlllII[0])) {
                        aN.su += lllIIlllII[0];
                        aN.u(AccBuilderSotf.m);
                        di += lllIIlllII[0];
                        aN.su = lllIIlllII[1];
                        dj = lllIIlllII[1];
                    }
                    g.a(lllIIlIIlI[lllIIlllII[349]], cE);
                }
                g.a(cE);
            }
            String[] stringArray147 = new String[lllIIlllII[0]];
            stringArray147[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[350]];
            if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray147) ? 1 : 0)) {
                AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[351]];
                String[] stringArray148 = new String[lllIIlllII[0]];
                stringArray148[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[352]];
                Inventory.getFirst((String[])stringArray148).interact(lllIIlIIlI[lllIIlllII[353]]);
                Time.sleepTicks((int)lllIIlllII[8]);
                0;
            }
            if (v.llIIIIlIlIlIl(lllllllllllllllllIlllIIlllIIlIlI = Widgets.get((int)lllIIlllII[308], (int)lllIIlllII[14]))) {
                lllllllllllllllllIlllIIlllIIlIlI.interact(lllIIlIIlI[lllIIlllII[354]]);
                Time.sleepTicks((int)lllIIlllII[0]);
                0;
            }
            if (v.llIIIIlIlIlIl(lllllllllllllllllIlllIIlllIIlIIl = Widgets.get((int)lllIIlllII[308], (int)lllIIlllII[70]))) {
                lllllllllllllllllIlllIIlllIIlIIl.interact(lllIIlIIlI[lllIIlllII[355]]);
                Time.sleepTicks((int)lllIIlllII[6]);
                0;
            }
            g.a(cE);
        }
    }

    private static /* synthetic */ boolean a(NPC nPC, TileObject tileObject) {
        int n2;
        if (v.llIIIIlIllIIl(tileObject.getId(), lllIIlllII[435]) && v.llIIIIlIlIlll(tileObject.getWorldLocation().distanceTo(nPC.getWorldLocation()), lllIIlllII[9])) {
            n2 = lllIIlllII[0];
            0;
            if (-1 != -1) {
                return (((0x13 ^ 0x54) & ~(0x29 ^ 0x6E) ^ (0xD ^ 0x5B)) & (0x74 ^ 0x29 ^ (0xBA ^ 0xB1) ^ -1) & ((5 ^ 0x18 ^ (0x81 ^ 0xB6)) & (177 + 139 - 228 + 90 ^ 49 + 36 - -62 + 5 ^ -1) ^ -1)) != 0;
            }
        } else {
            n2 = lllIIlllII[1];
        }
        return n2 != 0;
    }
}

