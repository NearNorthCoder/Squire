/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
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
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g;

public class af
implements ac {
    public static /* synthetic */ List<d> bv;
    public static final /* synthetic */ WorldPoint na;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int[] llIIIllIIl;
    public static final /* synthetic */ int nb;
    private static /* synthetic */ String[] llIIIlIlll;
    static /* synthetic */ String[] cE;

    private static void lIlIIllIIlIII() {
        llIIIlIlll = new String[llIIIllIIl[141]];
        af.llIIIlIlll[af.llIIIllIIl[0]] = af."Buying items";
        af.llIIIlIlll[af.llIIIllIIl[1]] = af."Finished buying items, switching back to construction";
        af.llIIIlIlll[af.llIIIllIIl[3]] = af."Navigating to bank";
        af.llIIIlIlll[af.llIIIllIIl[4]] = af."Castle Wars";
        af.llIIIlIlll[af.llIIIllIIl[6]] = af."Wear";
        af.llIIIlIlll[af.llIIIllIIl[2]] = af."Handling banking";
        af.llIIIlIlll[af.llIIIllIIl[9]] = af."We are missing rings, switching to BUYING";
        af.llIIIlIlll[af.llIIIllIIl[11]] = af."We are missing saw, switching to BUYING";
        af.llIIIlIlll[af.llIIIllIIl[13]] = af."We are missing hammer, switching to BUYING";
        af.llIIIlIlll[af.llIIIllIIl[15]] = af."We are missing house tab, switching to BUYING";
        af.llIIIlIlll[af.llIIIllIIl[18]] = af."We are missing nails, switching to BUYING";
        af.llIIIlIlll[af.llIIIllIIl[20]] = af."We are missing plank, switching to BUYING";
        af.llIIIlIlll[af.llIIIllIIl[22]] = af."We are missing oak planks, switching to BUYING";
        af.llIIIlIlll[af.llIIIllIIl[29]] = af."Equiping duel";
        af.llIIIlIlll[af.llIIIllIIl[30]] = af."Wear";
        af.llIIIlIlll[af.llIIIllIIl[32]] = af."Nav to house guy";
        af.llIIIlIlll[af.llIIIllIIl[33]] = af."Buy house";
        af.llIIIlIlll[af.llIIIllIIl[34]] = af."Estate agent";
        af.llIIIlIlll[af.llIIIllIIl[36]] = af."Entering portal";
        af.llIIIlIlll[af.llIIIllIIl[37]] = af."Build mode";
        af.llIIIlIlll[af.llIIIllIIl[39]] = af."Tele to house";
        af.llIIIlIlll[af.llIIIllIIl[40]] = af."Break";
        af.llIIIlIlll[af.llIIIllIIl[41]] = af."Turning on build mode";
        af.llIIIlIlll[af.llIIIllIIl[16]] = af."Yes";
        af.llIIIlIlll[af.llIIIllIIl[43]] = af."Building chair";
        af.llIIIlIlll[af.llIIIllIIl[46]] = af."Build";
        af.llIIIlIlll[af.llIIIllIIl[48]] = af."Removing";
        af.llIIIlIlll[af.llIIIllIIl[49]] = af."Remove";
        af.llIIIlIlll[af.llIIIllIIl[27]] = af."Yes";
        af.llIIIlIlll[af.llIIIllIIl[51]] = af."Building wood larder";
        af.llIIIlIlll[af.llIIIllIIl[53]] = af."Build";
        af.llIIIlIlll[af.llIIIllIIl[55]] = af."Removing";
        af.llIIIlIlll[af.llIIIllIIl[56]] = af."Remove";
        af.llIIIlIlll[af.llIIIllIIl[57]] = af."Yes";
        af.llIIIlIlll[af.llIIIllIIl[58]] = af."Build oak table";
        af.llIIIlIlll[af.llIIIllIIl[61]] = af."Build";
        af.llIIIlIlll[af.llIIIllIIl[63]] = af."Removing";
        af.llIIIlIlll[af.llIIIllIIl[64]] = af."Remove";
        af.llIIIlIlll[af.llIIIllIIl[65]] = af."Yes";
        af.llIIIlIlll[af.llIIIllIIl[66]] = af."Build oak larder";
        af.llIIIlIlll[af.llIIIllIIl[67]] = af."Remove";
        af.llIIIlIlll[af.llIIIllIIl[68]] = af."Build";
        af.llIIIlIlll[af.llIIIllIIl[70]] = af."Removing";
        af.llIIIlIlll[af.llIIIllIIl[71]] = af."Remove";
        af.llIIIlIlll[af.llIIIllIIl[72]] = af."Yes";
        af.llIIIlIlll[af.llIIIllIIl[73]] = af."Building rooms";
        af.llIIIlIlll[af.llIIIllIIl[77]] = af."View House Options";
        af.llIIIlIlll[af.llIIIllIIl[79]] = af."Viewer";
        af.llIIIlIlll[af.llIIIllIIl[81]] = af."Done";
        af.llIIIlIlll[af.llIIIllIIl[83]] = af."Add room";
        af.llIIIlIlll[af.llIIIllIIl[84]] = af."Kitchen";
        af.llIIIlIlll[af.llIIIllIIl[85]] = af."Done";
        af.llIIIlIlll[af.llIIIllIIl[87]] = af."Counter-clockwise";
        af.llIIIlIlll[af.llIIIllIIl[88]] = af."Done";
        af.llIIIlIlll[af.llIIIllIIl[89]] = af."View House Options";
        af.llIIIlIlll[af.llIIIllIIl[90]] = af."Viewer";
        af.llIIIlIlll[af.llIIIllIIl[91]] = af."Done";
        af.llIIIlIlll[af.llIIIllIIl[93]] = af."Add room";
        af.llIIIlIlll[af.llIIIllIIl[94]] = af."Dining room";
        af.llIIIlIlll[af.llIIIllIIl[95]] = af."Done";
        af.llIIIlIlll[af.llIIIllIIl[96]] = af."Counter-clockwise";
        af.llIIIlIlll[af.llIIIllIIl[97]] = af."Done";
        af.llIIIlIlll[af.llIIIllIIl[86]] = af."Build";
        af.llIIIlIlll[af.llIIIllIIl[98]] = af."View House Options";
        af.llIIIlIlll[af.llIIIllIIl[99]] = af."On";
        af.llIIIlIlll[af.llIIIllIIl[80]] = af."Iron nails";
        af.llIIIlIlll[af.llIIIllIIl[104]] = af."Teleport to house";
        af.llIIIlIlll[af.llIIIllIIl[105]] = af."Saw";
        af.llIIIlIlll[af.llIIIllIIl[106]] = af."Hammer";
        af.llIIIlIlll[af.llIIIllIIl[107]] = af."Plank";
        af.llIIIlIlll[af.llIIIllIIl[108]] = af."Plank";
        af.llIIIlIlll[af.llIIIllIIl[109]] = af."Iron nails";
        af.llIIIlIlll[af.llIIIllIIl[110]] = af."Teleport to house";
        af.llIIIlIlll[af.llIIIllIIl[111]] = af."Saw";
        af.llIIIlIlll[af.llIIIllIIl[112]] = af."Hammer";
        af.llIIIlIlll[af.llIIIllIIl[113]] = af."Plank";
        af.llIIIlIlll[af.llIIIllIIl[114]] = af."Plank";
        af.llIIIlIlll[af.llIIIllIIl[115]] = af."Teleport to house";
        af.llIIIlIlll[af.llIIIllIIl[116]] = af."Saw";
        af.llIIIlIlll[af.llIIIllIIl[117]] = af."Hammer";
        af.llIIIlIlll[af.llIIIllIIl[118]] = af."Teleport to house";
        af.llIIIlIlll[af.llIIIllIIl[119]] = af."Saw";
        af.llIIIlIlll[af.llIIIllIIl[120]] = af."Hammer";
        af.llIIIlIlll[af.llIIIllIIl[92]] = af."Construction";
        af.llIIIlIlll[af.llIIIllIIl[134]] = af."ring of wealth (";
        af.llIIIlIlll[af.llIIIllIIl[135]] = af."ring of dueling(";
        af.llIIIlIlll[af.llIIIllIIl[136]] = af."ring of dueling(";
        af.llIIIlIlll[af.llIIIllIIl[139]] = af."How can I get a house?";
        af.llIIIlIlll[af.llIIIllIIl[140]] = af."Yes please!";
    }

    private static String lIlIIllIIIlII(String var13, String var16) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var9 = var16.toCharArray();
        int var20 = llIIIllIIl[0];
        char[] var5 = var13.toCharArray();
        int var8 = var5.length;
        int var15 = llIIIllIIl[0];
        while (af.lIlIIllIIlllI(var15, var8)) {
            char var19 = var5[var15];
            var4.append((char)(var19 ^ var9[var20 % var9.length]));
            0;
            ++var20;
            ++var15;
            0;
            if (((0x5B ^ 1) & ~(0xEB ^ 0xB1)) != (0xB0 ^ 0xB4)) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    private static void lIlIIllIIlIll() {
        llIIIllIIl = new int[142];
        af.llIIIllIIl[0] = (0x1B ^ 0x41) & ~(0xDA ^ 0x80);
        af.llIIIllIIl[1] = 1;
        af.llIIIllIIl[2] = 0x2C ^ 8 ^ (0x36 ^ 0x17);
        af.llIIIllIIl[3] = 2;
        af.llIIIllIIl[4] = 3;
        af.llIIIllIIl[5] = -(0xFFFFE2DF & 0x1FEA) & (0xFFFFA3FD & Short.MAX_VALUE);
        af.llIIIllIIl[6] = 0xB3 ^ 0xB7;
        af.llIIIllIIl[7] = 0xFFFFB3B9 & 0x5FCE;
        af.llIIIllIIl[8] = -(0xFFFFBFE1 & 0x645F) & (0xFFFFAFFD & 0x7FFA);
        af.llIIIllIIl[9] = 75 + 126 - 83 + 47 ^ 1 + 109 - 52 + 105;
        af.llIIIllIIl[10] = -(0xFFFFDDEF & 0x2A15) & (0xFFFFBA5E & 0x6FFF);
        af.llIIIllIIl[11] = 0x89 ^ 0x8E;
        af.llIIIllIIl[12] = -(0xFFFFFC5D & 0x33A7) & (0xFFFFBF6F & 0x79BF);
        af.llIIIllIIl[13] = 56 + 174 - 86 + 31 ^ 82 + 3 - 57 + 139;
        af.llIIIllIIl[14] = 0xFFFFFFCD & 0x1F7F;
        af.llIIIllIIl[15] = 0xAF ^ 0xA6;
        af.llIIIllIIl[16] = 0xF4 ^ 0xA4 ^ (0xC9 ^ 0x8E);
        af.llIIIllIIl[17] = -(0xFFFFE98F & 0x1F7C) & (0xFFFFBFFF & 0x5BDF);
        af.llIIIllIIl[18] = 0x8E ^ 0x84;
        af.llIIIllIIl[19] = -(0xFFFFBB71 & 0x64AF) & (0xFFFFFBF1 & 0x27EE);
        af.llIIIllIIl[20] = 0xB7 ^ 0xBC;
        af.llIIIllIIl[21] = 0xFFFFE6EA & 0x3B5F;
        af.llIIIllIIl[22] = 0x3F ^ 0x21 ^ (0x68 ^ 0x7A);
        af.llIIIllIIl[23] = -(0xD6 ^ 0xC7) & (0xFFFF83FF & 0x7FF8);
        af.llIIIllIIl[24] = 0xFFFFA3AF & 0x5D7C;
        af.llIIIllIIl[25] = -(0xFFFFBF1D & 0x78EB) & (0xFFFFBBEF & 0x7FFB);
        af.llIIIllIIl[26] = 0xFFFFE7A8 & 0x79FF;
        af.llIIIllIIl[27] = 0xDD ^ 0xC1;
        af.llIIIllIIl[28] = -(0xFFFFEA0F & 0x57F2) & (0xFFFFCFF9 & 0x7BFF);
        af.llIIIllIIl[29] = 0x73 ^ 0x7E;
        af.llIIIllIIl[30] = 0xB7 ^ 0xB9;
        af.llIIIllIIl[31] = -(0xFFFFB7F6 & 0x791B) & (0xFFFFFFFF & 0x33F3);
        af.llIIIllIIl[32] = 0x7A ^ 0x75;
        af.llIIIllIIl[33] = 2 ^ (0x72 ^ 0x60);
        af.llIIIllIIl[34] = 0xA1 ^ 0xA8 ^ (0x89 ^ 0x91);
        af.llIIIllIIl[35] = -(83 + 82 - 119 + 91) & (0xFFFFFFFF & 0x3CFE);
        af.llIIIllIIl[36] = 58 + 71 - 64 + 62 ^ (0xC8 ^ 0xA5);
        af.llIIIllIIl[37] = 54 + 82 - 75 + 130 ^ 167 + 111 - 274 + 168;
        af.llIIIllIIl[38] = 0xFFFFF1BF & 0x1FED;
        af.llIIIllIIl[39] = 0xE ^ 0x69 ^ (0x37 ^ 0x44);
        af.llIIIllIIl[40] = 0xF7 ^ 0xBF ^ (0x6C ^ 0x31);
        af.llIIIllIIl[41] = 0x87 ^ 0x91;
        af.llIIIllIIl[42] = -(0xFFFFACAF & 0x735B) & (0xFFFFF1BF & 0x3FEF);
        af.llIIIllIIl[43] = 7 ^ 9 ^ (0x8A ^ 0x9C);
        af.llIIIllIIl[44] = -(0xFFFFF73F & 0x7ED5) & (0xFFFFFFDF & 0x77FE);
        af.llIIIllIIl[45] = 0xFFFFB5BF & 0x5BD4;
        af.llIIIllIIl[46] = 0x89 ^ 0x90;
        af.llIIIllIIl[47] = -(0xFFFFC1DA & 0x7FAF) & (0xFFFFFBF9 & 0x5FEF);
        af.llIIIllIIl[48] = 0x94 ^ 0xA4 ^ (0x63 ^ 0x49);
        af.llIIIllIIl[49] = 0x30 ^ 0x2B;
        af.llIIIllIIl[50] = 0xFFFFFC2F & 0x3FFB;
        af.llIIIllIIl[51] = 0x82 ^ 0x9F;
        af.llIIIllIIl[52] = -(0xFFFFFBFF & 0x5C22) & (0xFFFFFF7F & 0x7DBD);
        af.llIIIllIIl[53] = 0xAA ^ 0xB4;
        af.llIIIllIIl[54] = 0xFFFFFEFD & 0x35FF;
        af.llIIIllIIl[55] = 0xCF ^ 0x99 ^ (0xD9 ^ 0x90);
        af.llIIIllIIl[56] = 0x72 ^ 0x15 ^ (0x27 ^ 0x60);
        af.llIIIllIIl[57] = 162 + 125 - 162 + 48 ^ 26 + 95 - 37 + 56;
        af.llIIIllIIl[58] = 150 + 98 - 143 + 54 ^ 15 + 132 - 12 + 54;
        af.llIIIllIIl[59] = 0xFFFFBBCF & 0x7FF3;
        af.llIIIllIIl[60] = -(0xFFFFEF5E & 0x76AB) & (0xFFFFFFEF & 0x7F7D);
        af.llIIIllIIl[61] = 0x3E ^ 0x1D;
        af.llIIIllIIl[62] = 0xFFFFB3F7 & 0x7FFD;
        af.llIIIllIIl[63] = 0xE9 ^ 0x90 ^ (0x14 ^ 0x49);
        af.llIIIllIIl[64] = 69 + 131 - 53 + 34 ^ 15 + 25 - 13 + 117;
        af.llIIIllIIl[65] = 0x67 ^ 0x4A ^ (0xBF ^ 0xB4);
        af.llIIIllIIl[66] = 0xD2 ^ 0xA8 ^ (0x2D ^ 0x70);
        af.llIIIllIIl[67] = 0x47 ^ 0x3F ^ (0x12 ^ 0x42);
        af.llIIIllIIl[68] = 0xA ^ 0x1D ^ (0x4C ^ 0x72);
        af.llIIIllIIl[69] = -(0xFFFFEB99 & 0x5E67) & (0xFFFFFFFF & 0x7EFE);
        af.llIIIllIIl[70] = 124 + 115 - 93 + 35 ^ 52 + 77 - 117 + 147;
        af.llIIIllIIl[71] = 0x5E ^ 0x75;
        af.llIIIllIIl[72] = 0x3B ^ 0x19 ^ (0x4A ^ 0x44);
        af.llIIIllIIl[73] = 0x38 ^ 0x44 ^ (0xE9 ^ 0xB8);
        af.llIIIllIIl[74] = 26 + 20 - -36 + 68 + (18 + 111 - 83 + 119) - (0xFFFFEF6A & 0x11BF) + (89 + 12 - 27 + 121);
        af.llIIIllIIl[75] = 0xFFFFB3F6 & 0x4DAF;
        af.llIIIllIIl[76] = 3 ^ 0x77;
        af.llIIIllIIl[77] = 0x9E ^ 0xB0;
        af.llIIIllIIl[78] = -(0xFFFFE7CF & 0x5EBD) & (0xFFFFCFFE & 0x77FF);
        af.llIIIllIIl[79] = 2 ^ 0x2D;
        af.llIIIllIIl[80] = 0x1F ^ 0x34 ^ (0x40 ^ 0x2A);
        af.llIIIllIIl[81] = 0x20 ^ 0x10;
        af.llIIIllIIl[82] = 7 ^ 0x5C;
        af.llIIIllIIl[83] = 0x6A ^ 0x5B;
        af.llIIIllIIl[84] = 89 + 44 - 32 + 55 ^ 154 + 58 - 82 + 44;
        af.llIIIllIIl[85] = 0x42 ^ 0x71;
        af.llIIIllIIl[86] = 0x79 ^ 0x58 ^ (0x8E ^ 0x91);
        af.llIIIllIIl[87] = 0x14 ^ 0x28 ^ (0x66 ^ 0x6E);
        af.llIIIllIIl[88] = 0xBC ^ 0x9C ^ (0xA ^ 0x1F);
        af.llIIIllIIl[89] = 0xA0 ^ 0x96;
        af.llIIIllIIl[90] = 6 + 123 - 98 + 119 ^ 75 + 101 - 15 + 0;
        af.llIIIllIIl[91] = 0x6F ^ 0x45 ^ (0x93 ^ 0x81);
        af.llIIIllIIl[92] = 0x8F ^ 0x82 ^ (0x32 ^ 0x6C);
        af.llIIIllIIl[93] = 0x77 ^ 0x27 ^ (0x15 ^ 0x7C);
        af.llIIIllIIl[94] = 0x5B ^ 0x61;
        af.llIIIllIIl[95] = 0x79 ^ 0x42;
        af.llIIIllIIl[96] = 0x6F ^ 0x21 ^ (0x6A ^ 0x18);
        af.llIIIllIIl[97] = 0x62 ^ 0x5F;
        af.llIIIllIIl[98] = 1 ^ 0x71 ^ (0xC4 ^ 0x8B);
        af.llIIIllIIl[99] = 0xDA ^ 0x9A;
        af.llIIIllIIl[100] = -(0xFFFFD34F & 0x2FB7) & (0xFFFFFFEF & 0x3F3F);
        af.llIIIllIIl[101] = -(0xFFFFD533 & 0x6ACF) & (0xFFFFFFCF & 0x7BF7);
        af.llIIIllIIl[102] = 0xFFFFBFE6 & 0x7BDB;
        af.llIIIllIIl[103] = -(0xFFFFFEBF & 0x635B) & (0xFFFFFE9A & 0x6BFF);
        af.llIIIllIIl[104] = 0xF5 ^ 0xA8 ^ (0xBC ^ 0xA3);
        af.llIIIllIIl[105] = 0x39 ^ 0x7A;
        af.llIIIllIIl[106] = 0xAE ^ 0xC7 ^ (0x37 ^ 0x1A);
        af.llIIIllIIl[107] = 0x24 ^ 0x61;
        af.llIIIllIIl[108] = 0x21 ^ 0x67;
        af.llIIIllIIl[109] = 0xA5 ^ 0x99 ^ (5 ^ 0x7E);
        af.llIIIllIIl[110] = 89 + 65 - 44 + 102 ^ 8 + 83 - 53 + 118;
        af.llIIIllIIl[111] = 2 ^ (7 ^ 0x4C);
        af.llIIIllIIl[112] = 0xF5 ^ 0xBF;
        af.llIIIllIIl[113] = 62 + 99 - 38 + 124 ^ 1 + 13 - -4 + 170;
        af.llIIIllIIl[114] = 0x24 ^ 0x68;
        af.llIIIllIIl[115] = 0xF1 ^ 0xAA ^ (0x4F ^ 0x59);
        af.llIIIllIIl[116] = 91 + 128 - 160 + 137 ^ 13 + 23 - 19 + 121;
        af.llIIIllIIl[117] = 0x60 ^ 0x1B ^ (0xAC ^ 0x98);
        af.llIIIllIIl[118] = 4 + 37 - -76 + 27 ^ 64 + 70 - -31 + 27;
        af.llIIIllIIl[119] = 181 + 151 - 323 + 203 ^ 108 + 3 - 102 + 124;
        af.llIIIllIIl[120] = 2 ^ (0xC4 ^ 0x94);
        af.llIIIllIIl[121] = 0xFFFF8F3E & 0x71C5;
        af.llIIIllIIl[122] = 0xFFFFD9BA & 0x27FD;
        af.llIIIllIIl[123] = -(0xFFFFEFF3 & 0x722D) & (0xFFFFFFFB & 0x63F6);
        af.llIIIllIIl[124] = -(0xFFFFFC97 & 0x5769) & (0xFFFFDFF7 & 0x75FC);
        af.llIIIllIIl[125] = 0xFFFFA365 & 0x5EDE;
        af.llIIIllIIl[126] = 108 + 18 - -2 + 122;
        af.llIIIllIIl[127] = -(0xFFFFF95C & 0x37BB) & (0xFFFFB3BF & Short.MAX_VALUE);
        af.llIIIllIIl[128] = -(0x31 ^ 0x19) & (0xFFFFF767 & 0x1DFF);
        af.llIIIllIIl[129] = -(0xFFFFFBAE & 0x1C7F) & (0xFFFFBFFF & 0x5FFD);
        af.llIIIllIIl[130] = -(0xFFFFD1F7 & 0x3E3A) & (0xFFFFFEFF & 0x3FFD);
        af.llIIIllIIl[131] = 0xFFFF9FEF & 0x7F57;
        af.llIIIllIIl[132] = -(0xFFFFDEE2 & 0x3D7F) & (0xFFFFFFE5 & 0x1FFF);
        af.llIIIllIIl[133] = 0xFD ^ 0x99;
        af.llIIIllIIl[134] = 0x37 ^ 0xF ^ (0x15 ^ 0x79);
        af.llIIIllIIl[135] = 0x70 ^ 0x12 ^ (0x2E ^ 0x19);
        af.llIIIllIIl[136] = 0xE7 ^ 0xB1;
        af.llIIIllIIl[137] = 0xFFFFACFF & 0x5FA8;
        af.llIIIllIIl[138] = 0xFFFFAD9B & 0x5FF6;
        af.llIIIllIIl[139] = 0xE5 ^ 0x9C ^ (0xB4 ^ 0x9A);
        af.llIIIllIIl[140] = 0xD0 ^ 0x88;
        af.llIIIllIIl[141] = 0x10 ^ 0x49;
    }

    public static void eH() {
        block39: {
            BankLocation var1;
            block40: {
                block41: {
                    block42: {
                        Predicate<Item> var12;
                        if (af.lIlIIllIIllIl(bt ? 1 : 0)) {
                            AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[0]];
                            b.a(bv);
                            if (af.lIlIIllIIlllI(bv.size(), llIIIllIIl[1])) {
                                System.out.println(llIIIlIlll[llIIIllIIl[1]]);
                                bt = llIIIllIIl[0];
                            }
                        }
                        if (!af.lIlIIllIlIIII(bt ? 1 : 0) || !af.lIlIIllIIlllI(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIllIIl[2])) break block39;
                        if (!af.lIlIIllIlIIII(af.an() ? 1 : 0)) break block40;
                        var1 = BankLocation.getNearest();
                        if (af.lIlIIllIlIIlI(var1) && af.lIlIIllIlIIII(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[3]];
                            if (af.lIlIIllIIllIl(Equipment.contains((int[])f.aS) ? 1 : 0)) {
                                Equipment.getFirst((int[])f.aS).interact(llIIIlIlll[llIIIllIIl[4]]);
                                Time.sleepUntil(() -> {
                                    boolean bl;
                                    int[] nArray = new int[llIIIllIIl[1]];
                                    nArray[af.llIIIllIIl[0]] = llIIIllIIl[38];
                                    if (af.lIlIIllIlllIl(TileObjects.getNearest((int[])nArray))) {
                                        bl = llIIIllIIl[1];
                                        0;
                                        if (-1 >= 0) {
                                            return ((0x5E ^ 7 ^ (0x7F ^ 0x23)) & (0x4E ^ 0x19 ^ (0xC0 ^ 0x92) ^ -1)) != 0;
                                        }
                                    } else {
                                        bl = llIIIllIIl[0];
                                    }
                                    return bl;
                                }, (int)llIIIllIIl[5]);
                                0;
                            }
                            if (af.lIlIIllIlIIII(Equipment.contains((int[])f.aS) ? 1 : 0) && af.lIlIIllIIllIl(Inventory.contains((int[])f.aS) ? 1 : 0)) {
                                Inventory.getFirst((int[])f.aS).interact(llIIIlIlll[llIIIllIIl[6]]);
                            }
                            if (af.lIlIIllIlIIII(Equipment.contains((int[])f.aS) ? 1 : 0) && af.lIlIIllIlIIII(Inventory.contains((int[])f.aS) ? 1 : 0)) {
                                a.a(var1);
                                Time.sleepTicks((int)llIIIllIIl[1]);
                                0;
                            }
                        }
                        if (!af.lIlIIllIlIIlI(var1) || !af.lIlIIllIIllIl(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block40;
                        AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[2]];
                        if (af.lIlIIllIlIIII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIllIIl[7]);
                            0;
                        }
                        if (af.lIlIIllIIllIl(Bank.isOpen() ? 1 : 0) && af.lIlIIllIlIlII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (af.lIlIIllIlIIII(Inventory.getAll().size())) {
                                    bl = llIIIllIIl[1];
                                    0;
                                    if ((0x54 ^ 0x51) <= 0) {
                                        return false;
                                    }
                                } else {
                                    bl = llIIIllIIl[0];
                                }
                                return bl;
                            }, (int)llIIIllIIl[8]);
                            0;
                            Time.sleepTicks((int)llIIIllIIl[1]);
                            0;
                        }
                        if (af.lIlIIllIlIIII(Bank.contains(var12 = item -> item.getName().toLowerCase().contains(llIIIlIlll[llIIIllIIl[136]])) ? 1 : 0)) {
                            af.Q();
                            System.out.println(llIIIlIlll[llIIIllIIl[9]]);
                            bt = llIIIllIIl[1];
                            return;
                        }
                        int[] nArray = new int[llIIIllIIl[1]];
                        nArray[af.llIIIllIIl[0]] = llIIIllIIl[10];
                        if (af.lIlIIllIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            af.Q();
                            System.out.println(llIIIlIlll[llIIIllIIl[11]]);
                            bt = llIIIllIIl[1];
                            return;
                        }
                        int[] nArray2 = new int[llIIIllIIl[1]];
                        nArray2[af.llIIIllIIl[0]] = llIIIllIIl[12];
                        if (af.lIlIIllIlIIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            af.Q();
                            System.out.println(llIIIlIlll[llIIIllIIl[13]]);
                            bt = llIIIllIIl[1];
                            return;
                        }
                        int[] nArray3 = new int[llIIIllIIl[1]];
                        nArray3[af.llIIIllIIl[0]] = llIIIllIIl[14];
                        if (af.lIlIIllIlIIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[llIIIllIIl[1]];
                            nArray4[af.llIIIllIIl[0]] = llIIIllIIl[14];
                            if (af.lIlIIllIlIIII(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                                af.Q();
                                System.out.println(llIIIlIlll[llIIIllIIl[15]]);
                                bt = llIIIllIIl[1];
                                return;
                            }
                        }
                        if (af.lIlIIllIIlllI(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIllIIl[16])) {
                            int[] nArray5 = new int[llIIIllIIl[1]];
                            nArray5[af.llIIIllIIl[0]] = llIIIllIIl[17];
                            if (af.lIlIIllIlIIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                af.Q();
                                System.out.println(llIIIlIlll[llIIIllIIl[18]]);
                                bt = llIIIllIIl[1];
                                return;
                            }
                            int[] nArray6 = new int[llIIIllIIl[1]];
                            nArray6[af.llIIIllIIl[0]] = llIIIllIIl[19];
                            if (af.lIlIIllIlIIII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                af.Q();
                                System.out.println(llIIIlIlll[llIIIllIIl[20]]);
                                bt = llIIIllIIl[1];
                                return;
                            }
                        }
                        if (!af.lIlIIllIllIII(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIllIIl[16])) break block41;
                        int[] nArray7 = new int[llIIIllIIl[1]];
                        nArray7[af.llIIIllIIl[0]] = llIIIllIIl[21];
                        if (!af.lIlIIllIIllIl(Bank.contains((int[])nArray7) ? 1 : 0)) break block42;
                        int[] nArray8 = new int[llIIIllIIl[1]];
                        nArray8[af.llIIIllIIl[0]] = llIIIllIIl[21];
                        if (!af.lIlIIllIIllIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block41;
                        int[] nArray9 = new int[llIIIllIIl[1]];
                        nArray9[af.llIIIllIIl[0]] = llIIIllIIl[21];
                        if (!af.lIlIIllIIlllI(Bank.getFirst((int[])nArray9).getQuantity(), llIIIllIIl[13])) break block41;
                    }
                    af.Q();
                    System.out.println(llIIIlIlll[llIIIllIIl[22]]);
                    bt = llIIIllIIl[1];
                    return;
                }
                if (af.lIlIIllIlIIII(Equipment.contains((int[])f.aS) ? 1 : 0) && af.lIlIIllIlIIII(Inventory.contains((int[])f.aS) ? 1 : 0)) {
                    a.b(f.aS, llIIIllIIl[1]);
                    Time.sleepTicks((int)llIIIllIIl[1]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llIIIllIIl[1]];
                        nArray[af.llIIIllIIl[0]] = llIIIllIIl[28];
                        if (af.lIlIIllIlIlII(Inventory.getCount((int[])nArray))) {
                            bl = llIIIllIIl[1];
                            0;
                            if (-1 != -1) {
                                return false;
                            }
                        } else {
                            bl = llIIIllIIl[0];
                        }
                        return bl;
                    }, (int)llIIIllIIl[7]);
                    0;
                }
                if (af.lIlIIllIIlllI(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIllIIl[16])) {
                    a.a(llIIIllIIl[17], llIIIllIIl[23]);
                    a.a(llIIIllIIl[14], llIIIllIIl[24]);
                    a.a(llIIIllIIl[10], llIIIllIIl[1]);
                    a.a(llIIIllIIl[12], llIIIllIIl[1]);
                    a.a(llIIIllIIl[25], llIIIllIIl[26]);
                    a.a(llIIIllIIl[19], llIIIllIIl[27]);
                }
                if (af.lIlIIllIllIII(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIllIIl[16])) {
                    a.a(llIIIllIIl[14], llIIIllIIl[24]);
                    a.a(llIIIllIIl[10], llIIIllIIl[1]);
                    a.a(llIIIllIIl[12], llIIIllIIl[1]);
                    a.a(llIIIllIIl[21], llIIIllIIl[27]);
                }
            }
            if (af.lIlIIllIIllIl(af.an() ? 1 : 0)) {
                int[] nArray = new int[llIIIllIIl[1]];
                nArray[af.llIIIllIIl[0]] = llIIIllIIl[28];
                if (af.lIlIIllIIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray10 = new int[llIIIllIIl[1]];
                    nArray10[af.llIIIllIIl[0]] = llIIIllIIl[28];
                    if (af.lIlIIllIlIIII(Equipment.contains((int[])nArray10) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[29]];
                        Bank.close();
                        Time.sleepTicks((int)llIIIllIIl[1]);
                        0;
                        int[] nArray11 = new int[llIIIllIIl[1]];
                        nArray11[af.llIIIllIIl[0]] = llIIIllIIl[28];
                        var1 = Inventory.getFirst((int[])nArray11);
                        if (af.lIlIIllIlIIlI(var1)) {
                            var1.interact(llIIIlIlll[llIIIllIIl[30]]);
                            Time.sleepTicks((int)llIIIllIIl[4]);
                            0;
                        }
                    }
                }
                if (af.lIlIIllIIlllI(e.j(llIIIllIIl[31]), llIIIllIIl[1])) {
                    if (af.lIlIIllIIllIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (af.lIlIIllIllIIl(Players.getLocal().getWorldLocation().distanceTo(na), llIIIllIIl[3]) && af.lIlIIllIlIIII(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[32]];
                        Movement.walkTo((WorldPoint)na);
                        0;
                        Time.sleepTicks((int)llIIIllIIl[1]);
                        0;
                    }
                    if (af.lIlIIllIllIll(Players.getLocal().getWorldLocation().distanceTo(na), llIIIllIIl[4])) {
                        AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[33]];
                        g.a(llIIIlIlll[llIIIllIIl[34]], cE);
                    }
                }
                if (af.lIlIIllIlIlII(e.j(llIIIllIIl[31]))) {
                    int[] nArray12 = new int[llIIIllIIl[1]];
                    nArray12[af.llIIIllIIl[0]] = llIIIllIIl[35];
                    if (af.lIlIIllIlIIlI(TileObjects.getNearest((int[])nArray12))) {
                        AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[36]];
                        int[] nArray13 = new int[llIIIllIIl[1]];
                        nArray13[af.llIIIllIIl[0]] = llIIIllIIl[35];
                        TileObjects.getNearest((int[])nArray13).interact(llIIIlIlll[llIIIllIIl[37]]);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIIIllIIl[1]];
                            nArray[af.llIIIllIIl[0]] = llIIIllIIl[38];
                            if (af.lIlIIllIlIIlI(TileObjects.getNearest((int[])nArray))) {
                                bl = llIIIllIIl[1];
                                0;
                                if (((0xAC ^ 0xC2 ^ (0x57 ^ 0x34)) & (0x7B ^ 0x65 ^ (0xB6 ^ 0xA5) ^ -1)) < 0) {
                                    return ((15 + 73 - -61 + 103 ^ 156 + 158 - 257 + 139) & (3 ^ (0x84 ^ 0xBF) ^ -1)) != 0;
                                }
                            } else {
                                bl = llIIIllIIl[0];
                            }
                            return bl;
                        }, (int)llIIIllIIl[5]);
                        0;
                    }
                    int[] nArray14 = new int[llIIIllIIl[1]];
                    nArray14[af.llIIIllIIl[0]] = llIIIllIIl[38];
                    if (af.lIlIIllIlllIl(TileObjects.getNearest((int[])nArray14))) {
                        int[] nArray15 = new int[llIIIllIIl[1]];
                        nArray15[af.llIIIllIIl[0]] = llIIIllIIl[35];
                        if (af.lIlIIllIlllIl(TileObjects.getNearest((int[])nArray15))) {
                            AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[39]];
                            Bank.close();
                            int[] nArray16 = new int[llIIIllIIl[1]];
                            nArray16[af.llIIIllIIl[0]] = llIIIllIIl[14];
                            Inventory.getFirst((int[])nArray16).interact(llIIIlIlll[llIIIllIIl[40]]);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIIllIIl[1]];
                                nArray[af.llIIIllIIl[0]] = llIIIllIIl[38];
                                if (af.lIlIIllIlIIlI(TileObjects.getNearest((int[])nArray))) {
                                    bl = llIIIllIIl[1];
                                    0;
                                    if (-(0x69 ^ 0x6D) > 0) {
                                        return false;
                                    }
                                } else {
                                    bl = llIIIllIIl[0];
                                }
                                return bl;
                            }, (int)llIIIllIIl[5]);
                            0;
                            Time.sleepTicks((int)llIIIllIIl[4]);
                            0;
                        }
                    }
                    int[] nArray17 = new int[llIIIllIIl[1]];
                    nArray17[af.llIIIllIIl[0]] = llIIIllIIl[38];
                    if (af.lIlIIllIlIIlI(TileObjects.getNearest((int[])nArray17))) {
                        if (af.lIlIIllIlIIII(af.eO() ? 1 : 0)) {
                            AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[41]];
                            af.eK();
                        }
                        if (af.lIlIIllIIllIl(af.eO() ? 1 : 0)) {
                            if (af.lIlIIllIllIII(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIllIIl[18]) && af.lIlIIllIlIIII(af.eN() ? 1 : 0)) {
                                af.eJ();
                            }
                            if (af.lIlIIllIlIIII(Dialog.isOpen() ? 1 : 0)) {
                                af.eI();
                            }
                            String[] stringArray = new String[llIIIllIIl[1]];
                            stringArray[af.llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[16]];
                            g.a(stringArray);
                        }
                    }
                }
            }
        }
    }

    private static boolean lIlIIllIlIlII(int n2) {
        return n2 > 0;
    }

    static boolean eM() {
        boolean bl;
        int[] nArray = new int[llIIIllIIl[1]];
        nArray[af.llIIIllIIl[0]] = llIIIllIIl[101];
        if (af.lIlIIllIlIIlI(TileObjects.getNearest((int[])nArray))) {
            bl = llIIIllIIl[1];
            0;
            
            }
        } else {
            bl = llIIIllIIl[0];
        }
        return bl;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (af.lIlIIllIllIII(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIllIIl[2])) {
            bl = llIIIllIIl[1];
            0;
            if (3 < 0) {
                return false;
            }
        } else {
            bl = llIIIllIIl[0];
        }
        return bl;
    }

    @Override
    public boolean ae() {
        return llIIIllIIl[0];
    }

    @Override
    public String ag() {
        return llIIIlIlll[llIIIllIIl[92]];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean eN() {
        int n2;
        int[] nArray = new int[llIIIllIIl[1]];
        nArray[af.llIIIllIIl[0]] = llIIIllIIl[100];
        if (af.lIlIIllIlIIlI(TileObjects.getNearest((int[])nArray))) {
            int[] nArray2 = new int[llIIIllIIl[1]];
            nArray2[af.llIIIllIIl[0]] = llIIIllIIl[102];
            if (af.lIlIIllIlIIlI(TileObjects.getNearest((int[])nArray2))) {
                n2 = llIIIllIIl[1];
                0;
                if (null == null) return n2 != 0;
                return ((0x31 ^ 0x7B ^ (0xAC ^ 0xB6)) & (0x7C ^ 0x18 ^ (0x61 ^ 0x55) ^ -1)) != 0;
            }
        }
        n2 = llIIIllIIl[0];
        return n2 != 0;
    }

    private static boolean lIlIIllIllIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIllIlllIl(Object object) {
        return object == null;
    }

    private static boolean lIlIIllIIllIl(int n2) {
        return n2 != 0;
    }

    private static void Q() {
        d var14;
        Object var11;
        Object var10;
        block24: {
            block23: {
                block21: {
                    block22: {
                        block17: {
                            block20: {
                                block19: {
                                    block18: {
                                        if (!af.lIlIIllIIlllI(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIllIIl[16])) break block17;
                                        int[] nArray = new int[llIIIllIIl[1]];
                                        nArray[af.llIIIllIIl[0]] = llIIIllIIl[19];
                                        if (!af.lIlIIllIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block18;
                                        int[] nArray2 = new int[llIIIllIIl[1]];
                                        nArray2[af.llIIIllIIl[0]] = llIIIllIIl[19];
                                        if (!af.lIlIIllIIllIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block19;
                                        int[] nArray3 = new int[llIIIllIIl[1]];
                                        nArray3[af.llIIIllIIl[0]] = llIIIllIIl[19];
                                        if (!af.lIlIIllIIlllI(Bank.getFirst((int[])nArray3).getQuantity(), llIIIllIIl[67])) break block19;
                                    }
                                    var10 = new d(llIIIllIIl[19], llIIIllIIl[121], e.c(llIIIllIIl[122], llIIIllIIl[123]));
                                    bv.add((d)var10);
                                    0;
                                }
                                int[] nArray = new int[llIIIllIIl[1]];
                                nArray[af.llIIIllIIl[0]] = llIIIllIIl[17];
                                if (!af.lIlIIllIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                int[] nArray4 = new int[llIIIllIIl[1]];
                                nArray4[af.llIIIllIIl[0]] = llIIIllIIl[17];
                                if (!af.lIlIIllIIllIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block17;
                                int[] nArray5 = new int[llIIIllIIl[1]];
                                nArray5[af.llIIIllIIl[0]] = llIIIllIIl[17];
                                if (!af.lIlIIllIIlllI(Bank.getFirst((int[])nArray5).getQuantity(), llIIIllIIl[121])) break block17;
                            }
                            var10 = new d(llIIIllIIl[17], llIIIllIIl[23], llIIIllIIl[67]);
                            bv.add((d)var10);
                            0;
                        }
                        if (!af.lIlIIllIllIII(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIllIIl[16])) break block21;
                        int[] nArray = new int[llIIIllIIl[1]];
                        nArray[af.llIIIllIIl[0]] = llIIIllIIl[21];
                        if (!af.lIlIIllIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block22;
                        int[] nArray6 = new int[llIIIllIIl[1]];
                        nArray6[af.llIIIllIIl[0]] = llIIIllIIl[21];
                        if (!af.lIlIIllIIllIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                        int[] nArray7 = new int[llIIIllIIl[1]];
                        nArray7[af.llIIIllIIl[0]] = llIIIllIIl[21];
                        if (!af.lIlIIllIIlllI(Bank.getFirst((int[])nArray7).getQuantity(), llIIIllIIl[121])) break block21;
                    }
                    var10 = new d(llIIIllIIl[21], llIIIllIIl[124], llIIIllIIl[125]);
                    bv.add((d)var10);
                    0;
                }
                int[] nArray = new int[llIIIllIIl[1]];
                nArray[af.llIIIllIIl[0]] = llIIIllIIl[14];
                if (!af.lIlIIllIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                int[] nArray8 = new int[llIIIllIIl[1]];
                nArray8[af.llIIIllIIl[0]] = llIIIllIIl[14];
                if (!af.lIlIIllIIllIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block24;
                int[] nArray9 = new int[llIIIllIIl[1]];
                nArray9[af.llIIIllIIl[0]] = llIIIllIIl[14];
                if (!af.lIlIIllIIlllI(Bank.getFirst((int[])nArray9).getQuantity(), llIIIllIIl[67])) break block24;
            }
            var10 = new d(llIIIllIIl[14], llIIIllIIl[126], llIIIllIIl[127]);
            bv.add((d)var10);
            0;
        }
        int[] nArray = new int[llIIIllIIl[1]];
        nArray[af.llIIIllIIl[0]] = llIIIllIIl[12];
        if (af.lIlIIllIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            var10 = new d(llIIIllIIl[12], llIIIllIIl[1], llIIIllIIl[128]);
            bv.add((d)var10);
            0;
        }
        int[] nArray10 = new int[llIIIllIIl[1]];
        nArray10[af.llIIIllIIl[0]] = llIIIllIIl[10];
        if (af.lIlIIllIlIIII(Bank.contains((int[])nArray10) ? 1 : 0)) {
            var10 = new d(llIIIllIIl[10], llIIIllIIl[1], llIIIllIIl[128]);
            bv.add((d)var10);
            0;
        }
        if (af.lIlIIllIlIIII(Bank.contains((Predicate)(var10 = item -> item.getName().toLowerCase().contains(llIIIlIlll[llIIIllIIl[135]]))) ? 1 : 0)) {
            var11 = new d(llIIIllIIl[28], llIIIllIIl[39], llIIIllIIl[129]);
            bv.add((d)var11);
            0;
        }
        if (af.lIlIIllIlIIII(Bank.contains(var11 = item -> item.getName().toLowerCase().contains(llIIIlIlll[llIIIllIIl[134]])) ? 1 : 0)) {
            var14 = new d(llIIIllIIl[130], llIIIllIIl[3], llIIIllIIl[26]);
            bv.add(var14);
            0;
        }
        int[] nArray11 = new int[llIIIllIIl[1]];
        nArray11[af.llIIIllIIl[0]] = llIIIllIIl[131];
        if (af.lIlIIllIlIIII(Bank.contains((int[])nArray11) ? 1 : 0)) {
            var14 = new d(llIIIllIIl[131], llIIIllIIl[67], llIIIllIIl[132]);
            bv.add(var14);
            0;
        }
    }

    private static boolean lIlIIllIlIIlI(Object object) {
        return object != null;
    }

    private static void eI() {
        Widget var7;
        if (af.lIlIIllIIlllI(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIllIIl[18])) {
            int[] nArray = new int[llIIIllIIl[1]];
            nArray[af.llIIIllIIl[0]] = llIIIllIIl[42];
            if (af.lIlIIllIlIIlI(TileObjects.getNearest((int[])nArray))) {
                Widget widget;
                AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[43]];
                if (af.lIlIIllIlIIII(Widgets.get((int)llIIIllIIl[44]).isEmpty() ? 1 : 0) && af.lIlIIllIlIIlI(widget = Widgets.get((int)llIIIllIIl[44], (int)llIIIllIIl[6]))) {
                    Mouse.click((int)widget.getChild(llIIIllIIl[9]).getClickPoint().getX(), (int)widget.getChild(llIIIllIIl[9]).getClickPoint().getY(), (boolean)llIIIllIIl[1]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llIIIllIIl[1]];
                        nArray[af.llIIIllIIl[0]] = llIIIllIIl[47];
                        if (af.lIlIIllIlIIlI(TileObjects.getNearest((int[])nArray))) {
                            bl = llIIIllIIl[1];
                            0;
                            if (((0xA5 ^ 0xC0 ^ (0x24 ^ 0xA)) & (115 + 12 - 64 + 176 ^ 109 + 6 - 14 + 63 ^ -1)) != 0) {
                                return ((0xD1 ^ 0x92 ^ (0x44 ^ 0x1D)) & (97 + 92 - 152 + 186 ^ 133 + 149 - 246 + 161 ^ -1)) != 0;
                            }
                        } else {
                            bl = llIIIllIIl[0];
                        }
                        return bl;
                    }, (int)llIIIllIIl[45]);
                    0;
                }
                if (af.lIlIIllIIllIl(Widgets.get((int)llIIIllIIl[44]).isEmpty() ? 1 : 0)) {
                    int[] nArray2 = new int[llIIIllIIl[1]];
                    nArray2[af.llIIIllIIl[0]] = llIIIllIIl[42];
                    if (af.lIlIIllIlIIlI(TileObjects.getNearest((int[])nArray2))) {
                        int[] nArray3 = new int[llIIIllIIl[1]];
                        nArray3[af.llIIIllIIl[0]] = llIIIllIIl[42];
                        TileObjects.getNearest((int[])nArray3).interact(llIIIlIlll[llIIIllIIl[46]]);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (af.lIlIIllIlIIII(Widgets.get((int)llIIIllIIl[44]).isEmpty() ? 1 : 0)) {
                                bl = llIIIllIIl[1];
                                0;
                                if (-(0x1F ^ 0x1B) > 0) {
                                    return false;
                                }
                            } else {
                                bl = llIIIllIIl[0];
                            }
                            return bl;
                        }, (int)llIIIllIIl[45]);
                        0;
                    }
                }
            }
            int[] nArray4 = new int[llIIIllIIl[1]];
            nArray4[af.llIIIllIIl[0]] = llIIIllIIl[47];
            if (af.lIlIIllIlIIlI(TileObjects.getNearest((int[])nArray4))) {
                AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[48]];
                if (af.lIlIIllIlIIII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIllIIl[1]);
                    0;
                    int[] nArray5 = new int[llIIIllIIl[1]];
                    nArray5[af.llIIIllIIl[0]] = llIIIllIIl[47];
                    TileObjects.getNearest((int[])nArray5).interact(llIIIlIlll[llIIIllIIl[49]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)llIIIllIIl[45]);
                    0;
                }
                String[] stringArray = new String[llIIIllIIl[1]];
                stringArray[af.llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[27]];
                g.a(stringArray);
            }
        }
        if (af.lIlIIllIllIII(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIllIIl[18]) && af.lIlIIllIIlllI(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIllIIl[16]) && af.lIlIIllIIllIl(af.eN() ? 1 : 0)) {
            int[] nArray = new int[llIIIllIIl[1]];
            nArray[af.llIIIllIIl[0]] = llIIIllIIl[50];
            if (af.lIlIIllIlIIlI(TileObjects.getNearest((int[])nArray))) {
                AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[51]];
                if (af.lIlIIllIlIIII(Widgets.get((int)llIIIllIIl[44]).isEmpty() ? 1 : 0) && af.lIlIIllIlIIlI(var7 = Widgets.get((int)llIIIllIIl[44], (int)llIIIllIIl[6]))) {
                    Mouse.click((int)var7.getChild(llIIIllIIl[9]).getClickPoint().getX(), (int)var7.getChild(llIIIllIIl[9]).getClickPoint().getY(), (boolean)llIIIllIIl[1]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llIIIllIIl[1]];
                        nArray[af.llIIIllIIl[0]] = llIIIllIIl[50];
                        if (af.lIlIIllIlIIlI(TileObjects.getNearest((int[])nArray))) {
                            bl = llIIIllIIl[1];
                            0;
                            if (2 >= (0x7A ^ 0x7E)) {
                                return false;
                            }
                        } else {
                            bl = llIIIllIIl[0];
                        }
                        return bl;
                    }, (int)llIIIllIIl[52]);
                    0;
                }
                if (af.lIlIIllIIllIl(Widgets.get((int)llIIIllIIl[44]).isEmpty() ? 1 : 0)) {
                    int[] nArray6 = new int[llIIIllIIl[1]];
                    nArray6[af.llIIIllIIl[0]] = llIIIllIIl[50];
                    if (af.lIlIIllIlIIlI(TileObjects.getNearest((int[])nArray6))) {
                        int[] nArray7 = new int[llIIIllIIl[1]];
                        nArray7[af.llIIIllIIl[0]] = llIIIllIIl[50];
                        TileObjects.getNearest((int[])nArray7).interact(llIIIlIlll[llIIIllIIl[53]]);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (af.lIlIIllIlIIII(Widgets.get((int)llIIIllIIl[44]).isEmpty() ? 1 : 0)) {
                                bl = llIIIllIIl[1];
                                0;
                                if (((0x29 ^ 0x1D) & ~(0x7D ^ 0x49)) == (0xAC ^ 0xA8)) {
                                    return false;
                                }
                            } else {
                                bl = llIIIllIIl[0];
                            }
                            return bl;
                        }, (int)llIIIllIIl[45]);
                        0;
                    }
                }
            }
            int[] nArray8 = new int[llIIIllIIl[1]];
            nArray8[af.llIIIllIIl[0]] = llIIIllIIl[54];
            if (af.lIlIIllIlIIlI(TileObjects.getNearest((int[])nArray8))) {
                AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[55]];
                if (af.lIlIIllIlIIII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIllIIl[1]);
                    0;
                    int[] nArray9 = new int[llIIIllIIl[1]];
                    nArray9[af.llIIIllIIl[0]] = llIIIllIIl[54];
                    TileObjects.getNearest((int[])nArray9).interact(llIIIlIlll[llIIIllIIl[56]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)llIIIllIIl[45]);
                    0;
                }
                String[] stringArray = new String[llIIIllIIl[1]];
                stringArray[af.llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[57]];
                g.a(stringArray);
            }
        }
        if (af.lIlIIllIllIII(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIllIIl[16]) && af.lIlIIllIIlllI(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIllIIl[57]) && af.lIlIIllIIllIl(af.eN() ? 1 : 0)) {
            AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[58]];
            int[] nArray = new int[llIIIllIIl[1]];
            nArray[af.llIIIllIIl[0]] = llIIIllIIl[59];
            if (af.lIlIIllIlIIlI(TileObjects.getNearest((int[])nArray))) {
                if (af.lIlIIllIlIIII(Widgets.get((int)llIIIllIIl[44]).isEmpty() ? 1 : 0) && af.lIlIIllIlIIlI(var7 = Widgets.get((int)llIIIllIIl[44], (int)llIIIllIIl[2]))) {
                    Mouse.click((int)var7.getChild(llIIIllIIl[6]).getClickPoint().getX(), (int)var7.getChild(llIIIllIIl[6]).getClickPoint().getY(), (boolean)llIIIllIIl[1]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llIIIllIIl[1]];
                        nArray[af.llIIIllIIl[0]] = llIIIllIIl[62];
                        if (af.lIlIIllIlIIlI(TileObjects.getNearest((int[])nArray))) {
                            bl = llIIIllIIl[1];
                            0;
                            if (1 > 2) {
                                return false;
                            }
                        } else {
                            bl = llIIIllIIl[0];
                        }
                        return bl;
                    }, (int)llIIIllIIl[60]);
                    0;
                }
                if (af.lIlIIllIIllIl(Widgets.get((int)llIIIllIIl[44]).isEmpty() ? 1 : 0)) {
                    int[] nArray10 = new int[llIIIllIIl[1]];
                    nArray10[af.llIIIllIIl[0]] = llIIIllIIl[59];
                    if (af.lIlIIllIlIIlI(TileObjects.getNearest((int[])nArray10))) {
                        int[] nArray11 = new int[llIIIllIIl[1]];
                        nArray11[af.llIIIllIIl[0]] = llIIIllIIl[59];
                        TileObjects.getNearest((int[])nArray11).interact(llIIIlIlll[llIIIllIIl[61]]);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (af.lIlIIllIlIIII(Widgets.get((int)llIIIllIIl[44]).isEmpty() ? 1 : 0)) {
                                bl = llIIIllIIl[1];
                                0;
                                if (3 != 3) {
                                    return ((0xB1 ^ 0x94 ^ (0x2E ^ 0x5C)) & (156 + 101 - 62 + 51 ^ 53 + 64 - 76 + 120 ^ -1)) != 0;
                                }
                            } else {
                                bl = llIIIllIIl[0];
                            }
                            return bl;
                        }, (int)llIIIllIIl[45]);
                        0;
                    }
                }
            }
            int[] nArray12 = new int[llIIIllIIl[1]];
            nArray12[af.llIIIllIIl[0]] = llIIIllIIl[62];
            if (af.lIlIIllIlIIlI(TileObjects.getNearest((int[])nArray12))) {
                AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[63]];
                if (af.lIlIIllIlIIII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIllIIl[1]);
                    0;
                    int[] nArray13 = new int[llIIIllIIl[1]];
                    nArray13[af.llIIIllIIl[0]] = llIIIllIIl[62];
                    TileObjects.getNearest((int[])nArray13).interact(llIIIlIlll[llIIIllIIl[64]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)llIIIllIIl[45]);
                    0;
                }
                String[] stringArray = new String[llIIIllIIl[1]];
                stringArray[af.llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[65]];
                g.a(stringArray);
            }
        }
        if (af.lIlIIllIllIII(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIllIIl[57]) && af.lIlIIllIIllIl(af.eN() ? 1 : 0)) {
            AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[66]];
            int[] nArray = new int[llIIIllIIl[1]];
            nArray[af.llIIIllIIl[0]] = llIIIllIIl[54];
            if (af.lIlIIllIlIIlI(TileObjects.getNearest((int[])nArray)) && af.lIlIIllIlIIII(Dialog.isOpen() ? 1 : 0)) {
                Time.sleepTicks((int)llIIIllIIl[1]);
                0;
                int[] nArray14 = new int[llIIIllIIl[1]];
                nArray14[af.llIIIllIIl[0]] = llIIIllIIl[54];
                TileObjects.getNearest((int[])nArray14).interact(llIIIlIlll[llIIIllIIl[67]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)llIIIllIIl[45]);
                0;
            }
            int[] nArray15 = new int[llIIIllIIl[1]];
            nArray15[af.llIIIllIIl[0]] = llIIIllIIl[50];
            if (af.lIlIIllIlIIlI(TileObjects.getNearest((int[])nArray15))) {
                if (af.lIlIIllIlIIII(Widgets.get((int)llIIIllIIl[44]).isEmpty() ? 1 : 0) && af.lIlIIllIlIIlI(var7 = Widgets.get((int)llIIIllIIl[44], (int)llIIIllIIl[2]))) {
                    Mouse.click((int)var7.getChild(llIIIllIIl[6]).getClickPoint().getX(), (int)var7.getChild(llIIIllIIl[6]).getClickPoint().getY(), (boolean)llIIIllIIl[1]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llIIIllIIl[1]];
                        nArray[af.llIIIllIIl[0]] = llIIIllIIl[69];
                        if (af.lIlIIllIlIIlI(TileObjects.getNearest((int[])nArray))) {
                            bl = llIIIllIIl[1];
                            0;
                            
                            }
                        } else {
                            bl = llIIIllIIl[0];
                        }
                        return bl;
                    }, (int)llIIIllIIl[60]);
                    0;
                }
                if (af.lIlIIllIIllIl(Widgets.get((int)llIIIllIIl[44]).isEmpty() ? 1 : 0)) {
                    int[] nArray16 = new int[llIIIllIIl[1]];
                    nArray16[af.llIIIllIIl[0]] = llIIIllIIl[50];
                    if (af.lIlIIllIlIIlI(TileObjects.getNearest((int[])nArray16))) {
                        int[] nArray17 = new int[llIIIllIIl[1]];
                        nArray17[af.llIIIllIIl[0]] = llIIIllIIl[50];
                        TileObjects.getNearest((int[])nArray17).interact(llIIIlIlll[llIIIllIIl[68]]);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (af.lIlIIllIlIIII(Widgets.get((int)llIIIllIIl[44]).isEmpty() ? 1 : 0)) {
                                bl = llIIIllIIl[1];
                                0;
                                if (1 > 1) {
                                    return ((0x5C ^ 0x2D ^ (0xDD ^ 0xA7)) & (0x5D ^ 0x41 ^ (0x67 ^ 0x70) ^ -1)) != 0;
                                }
                            } else {
                                bl = llIIIllIIl[0];
                            }
                            return bl;
                        }, (int)llIIIllIIl[45]);
                        0;
                    }
                }
            }
            int[] nArray18 = new int[llIIIllIIl[1]];
            nArray18[af.llIIIllIIl[0]] = llIIIllIIl[69];
            if (af.lIlIIllIlIIlI(TileObjects.getNearest((int[])nArray18))) {
                AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[70]];
                if (af.lIlIIllIlIIII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIllIIl[1]);
                    0;
                    int[] nArray19 = new int[llIIIllIIl[1]];
                    nArray19[af.llIIIllIIl[0]] = llIIIllIIl[69];
                    TileObjects.getNearest((int[])nArray19).interact(llIIIlIlll[llIIIllIIl[71]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)llIIIllIIl[45]);
                    0;
                }
                String[] stringArray = new String[llIIIllIIl[1]];
                stringArray[af.llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[72]];
                g.a(stringArray);
            }
        }
    }

    private static boolean lIlIIllIllIIl(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public int af() {
        try {
            af.eH();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return llIIIllIIl[133];
    }

    private static void eJ() {
        AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[73]];
        if (af.lIlIIllIlIIII(af.eL() ? 1 : 0)) {
            if (af.lIlIIllIIllIl(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (af.lIlIIllIIllIl(Widgets.get((int)llIIIllIIl[74]).isEmpty() ? 1 : 0) && af.lIlIIllIlIIII(Dialog.isOpen() ? 1 : 0)) {
                if (af.lIlIIllIlllIl(Widgets.get((int)llIIIllIIl[75], (int)llIIIllIIl[2]))) {
                    if (af.lIlIIllIlIIlI(Widgets.get((int)llIIIllIIl[76], (int)llIIIllIIl[55]))) {
                        Widgets.get((int)llIIIllIIl[76], (int)llIIIllIIl[55]).interact(llIIIlIlll[llIIIllIIl[77]]);
                        Time.sleepTicks((int)llIIIllIIl[3]);
                        0;
                    }
                    if (af.lIlIIllIlIIlI(Widgets.get((int)llIIIllIIl[78], (int)llIIIllIIl[1]))) {
                        Widgets.get((int)llIIIllIIl[78], (int)llIIIllIIl[1]).interact(llIIIlIlll[llIIIllIIl[79]]);
                        Time.sleepTicks((int)llIIIllIIl[6]);
                        0;
                    }
                }
                if (af.lIlIIllIlIIlI(Widgets.get((int)llIIIllIIl[75], (int)llIIIllIIl[2]))) {
                    String[] stringArray = new String[llIIIllIIl[1]];
                    stringArray[af.llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[81]];
                    if (af.lIlIIllIlIIII(Widgets.get((int)llIIIllIIl[75], (int)llIIIllIIl[80]).hasAction(stringArray) ? 1 : 0)) {
                        Widgets.get((int)llIIIllIIl[75], (int)llIIIllIIl[2]).getChild(llIIIllIIl[82]).interact(llIIIlIlll[llIIIllIIl[83]]);
                        Time.sleepTicks((int)llIIIllIIl[4]);
                        0;
                    }
                }
            }
            if (af.lIlIIllIlIIII(Widgets.get((int)llIIIllIIl[74]).isEmpty() ? 1 : 0) && af.lIlIIllIlIIII(Dialog.isOpen() ? 1 : 0)) {
                Widgets.get((int)llIIIllIIl[74], (int)llIIIllIIl[15]).interact(llIIIlIlll[llIIIllIIl[84]]);
                Time.sleepTicks((int)llIIIllIIl[2]);
                0;
            }
            if (af.lIlIIllIlIIlI(Widgets.get((int)llIIIllIIl[75], (int)llIIIllIIl[2]))) {
                String[] stringArray = new String[llIIIllIIl[1]];
                stringArray[af.llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[85]];
                if (af.lIlIIllIIllIl(Widgets.get((int)llIIIllIIl[75], (int)llIIIllIIl[80]).hasAction(stringArray) ? 1 : 0)) {
                    Widgets.get((int)llIIIllIIl[75], (int)llIIIllIIl[86]).interact(llIIIlIlll[llIIIllIIl[87]]);
                    Time.sleepTicks((int)llIIIllIIl[3]);
                    0;
                    Widgets.get((int)llIIIllIIl[75], (int)llIIIllIIl[80]).interact(llIIIlIlll[llIIIllIIl[88]]);
                    Time.sleepTicks((int)llIIIllIIl[4]);
                    0;
                }
            }
        }
        if (af.lIlIIllIlIIII(af.eM() ? 1 : 0) && af.lIlIIllIIllIl(af.eL() ? 1 : 0)) {
            if (af.lIlIIllIIllIl(Widgets.get((int)llIIIllIIl[74]).isEmpty() ? 1 : 0) && af.lIlIIllIlIIII(Dialog.isOpen() ? 1 : 0)) {
                if (af.lIlIIllIlllIl(Widgets.get((int)llIIIllIIl[75], (int)llIIIllIIl[2]))) {
                    if (af.lIlIIllIlIIlI(Widgets.get((int)llIIIllIIl[76], (int)llIIIllIIl[55]))) {
                        Widgets.get((int)llIIIllIIl[76], (int)llIIIllIIl[55]).interact(llIIIlIlll[llIIIllIIl[89]]);
                        Time.sleepTicks((int)llIIIllIIl[3]);
                        0;
                    }
                    if (af.lIlIIllIlIIlI(Widgets.get((int)llIIIllIIl[78], (int)llIIIllIIl[1]))) {
                        Widgets.get((int)llIIIllIIl[78], (int)llIIIllIIl[1]).interact(llIIIlIlll[llIIIllIIl[90]]);
                        Time.sleepTicks((int)llIIIllIIl[6]);
                        0;
                    }
                }
                if (af.lIlIIllIlIIlI(Widgets.get((int)llIIIllIIl[75], (int)llIIIllIIl[2]))) {
                    String[] stringArray = new String[llIIIllIIl[1]];
                    stringArray[af.llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[91]];
                    if (af.lIlIIllIlIIII(Widgets.get((int)llIIIllIIl[75], (int)llIIIllIIl[80]).hasAction(stringArray) ? 1 : 0)) {
                        Widgets.get((int)llIIIllIIl[75], (int)llIIIllIIl[2]).getChild(llIIIllIIl[92]).interact(llIIIlIlll[llIIIllIIl[93]]);
                        Time.sleepTicks((int)llIIIllIIl[4]);
                        0;
                    }
                }
            }
            if (af.lIlIIllIlIIII(Widgets.get((int)llIIIllIIl[74]).isEmpty() ? 1 : 0) && af.lIlIIllIlIIII(Dialog.isOpen() ? 1 : 0)) {
                Widgets.get((int)llIIIllIIl[74], (int)llIIIllIIl[20]).interact(llIIIlIlll[llIIIllIIl[94]]);
                Time.sleepTicks((int)llIIIllIIl[2]);
                0;
            }
            if (af.lIlIIllIlIIlI(Widgets.get((int)llIIIllIIl[75], (int)llIIIllIIl[2]))) {
                String[] stringArray = new String[llIIIllIIl[1]];
                stringArray[af.llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[95]];
                if (af.lIlIIllIIllIl(Widgets.get((int)llIIIllIIl[75], (int)llIIIllIIl[80]).hasAction(stringArray) ? 1 : 0)) {
                    Widgets.get((int)llIIIllIIl[75], (int)llIIIllIIl[86]).interact(llIIIlIlll[llIIIllIIl[96]]);
                    Time.sleepTicks((int)llIIIllIIl[3]);
                    0;
                    Widgets.get((int)llIIIllIIl[75], (int)llIIIllIIl[80]).interact(llIIIlIlll[llIIIllIIl[97]]);
                    Time.sleepTicks((int)llIIIllIIl[4]);
                    0;
                }
            }
        }
        String[] stringArray = new String[llIIIllIIl[1]];
        stringArray[af.llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[86]];
        g.a(stringArray);
    }

    private static boolean lIlIIllIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIllIllIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIlIIllIIIllI(String var3, String var22) {
        try {
            SecretKeySpec var23 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var22.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var17 = Cipher.getInstance("Blowfish");
            var17.init(llIIIllIIl[3], var23);
            return new String(var17.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        if (af.lIlIIllIIlllI(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIllIIl[18])) {
            int n3;
            String[] stringArray = new String[llIIIllIIl[1]];
            stringArray[af.llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[80]];
            if (af.lIlIIllIIllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[llIIIllIIl[1]];
                stringArray2[af.llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[104]];
                if (af.lIlIIllIIllIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    String[] stringArray3 = new String[llIIIllIIl[1]];
                    stringArray3[af.llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[105]];
                    if (af.lIlIIllIIllIl(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                        String[] stringArray4 = new String[llIIIllIIl[1]];
                        stringArray4[af.llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[106]];
                        if (af.lIlIIllIIllIl(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                            int[] nArray = new int[llIIIllIIl[1]];
                            nArray[af.llIIIllIIl[0]] = llIIIllIIl[25];
                            if (af.lIlIIllIIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                String[] stringArray5 = new String[llIIIllIIl[1]];
                                stringArray5[af.llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[107]];
                                if (af.lIlIIllIIllIl(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                                    String[] stringArray6 = new String[llIIIllIIl[1]];
                                    stringArray6[af.llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[108]];
                                    if (af.lIlIIllIllIII(Inventory.getAll((String[])stringArray6).size(), llIIIllIIl[3]) && (!af.lIlIIllIlIIII(Inventory.contains((int[])f.aS) ? 1 : 0) || af.lIlIIllIIllIl(Equipment.contains((int[])f.aS) ? 1 : 0))) {
                                        n3 = llIIIllIIl[1];
                                        0;
                                        if (3 <= (0x79 ^ 0x49 ^ (0x60 ^ 0x54))) return n3 != 0;
                                        return ((0xF5 ^ 0xB8 ^ (0x5E ^ 0x44)) & (1 ^ (0x28 ^ 0x7E) ^ -1)) != 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            n3 = llIIIllIIl[0];
            return n3 != 0;
        }
        if (af.lIlIIllIllIII(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIllIIl[18]) && af.lIlIIllIIlllI(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIllIIl[16])) {
            int n4;
            String[] stringArray = new String[llIIIllIIl[1]];
            stringArray[af.llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[109]];
            if (af.lIlIIllIIllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray7 = new String[llIIIllIIl[1]];
                stringArray7[af.llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[110]];
                if (af.lIlIIllIIllIl(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                    String[] stringArray8 = new String[llIIIllIIl[1]];
                    stringArray8[af.llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[111]];
                    if (af.lIlIIllIIllIl(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                        String[] stringArray9 = new String[llIIIllIIl[1]];
                        stringArray9[af.llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[112]];
                        if (af.lIlIIllIIllIl(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                            int[] nArray = new int[llIIIllIIl[1]];
                            nArray[af.llIIIllIIl[0]] = llIIIllIIl[25];
                            if (af.lIlIIllIIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                String[] stringArray10 = new String[llIIIllIIl[1]];
                                stringArray10[af.llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[113]];
                                if (af.lIlIIllIIllIl(Inventory.contains((String[])stringArray10) ? 1 : 0)) {
                                    String[] stringArray11 = new String[llIIIllIIl[1]];
                                    stringArray11[af.llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[114]];
                                    if (af.lIlIIllIllIII(Inventory.getAll((String[])stringArray11).size(), llIIIllIIl[13]) && (!af.lIlIIllIlIIII(Inventory.contains((int[])f.aS) ? 1 : 0) || af.lIlIIllIIllIl(Equipment.contains((int[])f.aS) ? 1 : 0))) {
                                        n4 = llIIIllIIl[1];
                                        0;
                                        if (null == null) return n4 != 0;
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            n4 = llIIIllIIl[0];
            return n4 != 0;
        }
        if (af.lIlIIllIllIII(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIllIIl[16]) && af.lIlIIllIIlllI(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIllIIl[57])) {
            int n5;
            String[] stringArray = new String[llIIIllIIl[1]];
            stringArray[af.llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[115]];
            if (af.lIlIIllIIllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray12 = new String[llIIIllIIl[1]];
                stringArray12[af.llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[116]];
                if (af.lIlIIllIIllIl(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                    String[] stringArray13 = new String[llIIIllIIl[1]];
                    stringArray13[af.llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[117]];
                    if (af.lIlIIllIIllIl(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        int[] nArray = new int[llIIIllIIl[1]];
                        nArray[af.llIIIllIIl[0]] = llIIIllIIl[21];
                        if (af.lIlIIllIIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray2 = new int[llIIIllIIl[1]];
                            nArray2[af.llIIIllIIl[0]] = llIIIllIIl[21];
                            if (af.lIlIIllIllIII(Inventory.getAll((int[])nArray2).size(), llIIIllIIl[6]) && (!af.lIlIIllIlIIII(Inventory.contains((int[])f.aS) ? 1 : 0) || af.lIlIIllIIllIl(Equipment.contains((int[])f.aS) ? 1 : 0))) {
                                n5 = llIIIllIIl[1];
                                0;
                                if (null == null) return n5 != 0;
                                return false;
                            }
                        }
                    }
                }
            }
            n5 = llIIIllIIl[0];
            return n5 != 0;
        }
        if (!af.lIlIIllIllIII(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIIIllIIl[57])) return llIIIllIIl[0];
        String[] stringArray = new String[llIIIllIIl[1]];
        stringArray[af.llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[118]];
        if (af.lIlIIllIIllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray14 = new String[llIIIllIIl[1]];
            stringArray14[af.llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[119]];
            if (af.lIlIIllIIllIl(Inventory.contains((String[])stringArray14) ? 1 : 0)) {
                String[] stringArray15 = new String[llIIIllIIl[1]];
                stringArray15[af.llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[120]];
                if (af.lIlIIllIIllIl(Inventory.contains((String[])stringArray15) ? 1 : 0)) {
                    int[] nArray = new int[llIIIllIIl[1]];
                    nArray[af.llIIIllIIl[0]] = llIIIllIIl[21];
                    if (af.lIlIIllIIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray3 = new int[llIIIllIIl[1]];
                        nArray3[af.llIIIllIIl[0]] = llIIIllIIl[21];
                        if (af.lIlIIllIllIII(Inventory.getAll((int[])nArray3).size(), llIIIllIIl[13]) && (!af.lIlIIllIlIIII(Inventory.contains((int[])f.aS) ? 1 : 0) || af.lIlIIllIIllIl(Equipment.contains((int[])f.aS) ? 1 : 0))) {
                            n2 = llIIIllIIl[1];
                            0;
                            if ((0x73 ^ 0x77) >= ((0x25 ^ 0x66) & ~(0x54 ^ 0x17))) return n2 != 0;
                            return false;
                        }
                    }
                }
            }
        }
        n2 = llIIIllIIl[0];
        return n2 != 0;
    }

    private static void eK() {
        if (af.lIlIIllIIllIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (af.lIlIIllIlIIlI(Widgets.get((int)llIIIllIIl[76], (int)llIIIllIIl[55]))) {
            Widgets.get((int)llIIIllIIl[76], (int)llIIIllIIl[55]).interact(llIIIlIlll[llIIIllIIl[98]]);
            Time.sleepTicks((int)llIIIllIIl[3]);
            0;
        }
        if (af.lIlIIllIlIIlI(Widgets.get((int)llIIIllIIl[78], (int)llIIIllIIl[2]))) {
            Widgets.get((int)llIIIllIIl[78], (int)llIIIllIIl[2]).interact(llIIIlIlll[llIIIllIIl[99]]);
            Time.sleepTicks((int)llIIIllIIl[6]);
            0;
        }
    }

    private static boolean eO() {
        boolean bl;
        if (af.lIlIIlllIIIIl(Vars.getBit((int)llIIIllIIl[103]), llIIIllIIl[1])) {
            bl = llIIIllIIl[1];
            0;
            if (-1 >= 0) {
                return ((0x38 ^ 0x6F ^ (0x3A ^ 0x52)) & (155 + 42 - 111 + 84 ^ 18 + 69 - -17 + 45 ^ -1)) != 0;
            }
        } else {
            bl = llIIIllIIl[0];
        }
        return bl;
    }

    static boolean eL() {
        boolean bl;
        int[] nArray = new int[llIIIllIIl[1]];
        nArray[af.llIIIllIIl[0]] = llIIIllIIl[100];
        if (af.lIlIIllIlIIlI(TileObjects.getNearest((int[])nArray))) {
            bl = llIIIllIIl[1];
            0;
            if (1 != 1) {
                return false;
            }
        } else {
            bl = llIIIllIIl[0];
        }
        return bl;
    }

    private static boolean lIlIIllIlIIII(int n2) {
        return n2 == 0;
    }

    static {
        af.lIlIIllIIlIll();
        af.lIlIIllIIlIII();
        nb = llIIIllIIl[31];
        na = new WorldPoint(llIIIllIIl[137], llIIIllIIl[138], llIIIllIIl[0]);
        bv = new ArrayList<d>();
        String[] stringArray = new String[llIIIllIIl[3]];
        stringArray[af.llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[139]];
        stringArray[af.llIIIllIIl[1]] = llIIIlIlll[llIIIllIIl[140]];
        cE = stringArray;
    }

    private static boolean lIlIIlllIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIIllIIIlIl(String var6, String var24) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), llIIIllIIl[13]), "DES");
            Cipher var25 = Cipher.getInstance("DES");
            var25.init(llIIIllIIl[3], var18);
            return new String(var25.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }
}

