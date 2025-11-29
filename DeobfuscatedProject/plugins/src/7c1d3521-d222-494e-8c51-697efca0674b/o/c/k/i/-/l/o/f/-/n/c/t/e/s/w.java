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
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.H;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.J;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.N;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.O;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.V;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aF;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aN;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ay;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.n;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.o;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.u;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.x;

public class w
implements ac {
    static /* synthetic */ WorldPoint de;
    static /* synthetic */ int di;
    static /* synthetic */ WorldArea du;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ String[] lIllllIIIl;
    static /* synthetic */ boolean dj;
    static /* synthetic */ WorldArea dv;
    private static /* synthetic */ int[] lIllllIIll;
    static /* synthetic */ WorldArea dw;
    static /* synthetic */ WorldPoint dx;
    static /* synthetic */ WorldPoint dy;
    private static /* synthetic */ String dz;
    private static /* synthetic */ String[] cE;
    private static /* synthetic */ int cY;
    public static /* synthetic */ boolean bt;

    private static boolean lIIllllllIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlllllIllll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlllllllIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIIIIIIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static void bg() {
        WorldArea worldArea = new WorldArea(lIllllIIll[52], lIllllIIll[56], lIllllIIll[16], lIllllIIll[4], lIllllIIll[1]);
        if (w.lIIlllllIllIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] stringArray = new String[lIllllIIll[0]];
            stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[142]];
            TileObjects.getNearest((String[])stringArray).interact(lIllllIIIl[lIllllIIll[143]]);
            Time.sleepTicks((int)lIllllIIll[9]);
            "".length();
        }
        if (w.lIIlllllIllll(du.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIIlllllllIlI(Players.getLocal().getWorldLocation().distanceTo(de), lIllllIIll[21])) {
            AccBuilderSotf.c = lIllllIIIl[lIllllIIll[144]];
            if (w.lIIlllllIllIl(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)de);
            "".length();
            Time.sleepTicks((int)lIllllIIll[0]);
            "".length();
        }
        if (w.lIIlllllIllIl(du.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIIlllllllIll(Players.getLocal().getWorldLocation().distanceTo(de), lIllllIIll[21])) {
            g.a(lIllllIIIl[lIllllIIll[145]], cE);
        }
        if (w.lIIlllllIllIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIllllIIll[52], lIllllIIll[53], lIllllIIll[1])) ? 1 : 0)) {
            String[] stringArray = new String[lIllllIIll[0]];
            stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[99]];
            TileObjects.getNearest((String[])stringArray).interact(lIllllIIIl[lIllllIIll[146]]);
            Time.sleepTicks((int)lIllllIIll[9]);
            "".length();
        }
    }

    private static boolean lIIlllllllIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIlllllIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlllllIllIl(int n2) {
        return n2 != 0;
    }

    private static void lIIlllllIlIll() {
        lIllllIIll = new int[182];
        w.lIllllIIll[0] = " ".length();
        w.lIllllIIll[1] = (0x38 ^ 0x59) & ~(0x48 ^ 0x29);
        w.lIllllIIll[2] = 236 + 125 - 293 + 172;
        w.lIllllIIll[3] = 0x79 ^ 0x38;
        w.lIllllIIll[4] = 0xB5 ^ 0x92 ^ (0x91 ^ 0xBC);
        w.lIllllIIll[5] = -(0xFFFFFBEF & 0x6ED2) & (0xFFFFEBEF & Short.MAX_VALUE);
        w.lIllllIIll[6] = 0xAF ^ 0xC5 ^ (0xF3 ^ 0xA5);
        w.lIllllIIll[7] = 0xFFFFEFB3 & 0x117F;
        w.lIllllIIll[8] = 0xA3 ^ 0x88 ^ (0xB2 ^ 0x9C);
        w.lIllllIIll[9] = "  ".length();
        w.lIllllIIll[10] = 0xB3 ^ 0x93;
        w.lIllllIIll[11] = "   ".length();
        w.lIllllIIll[12] = 14 + 131 - 81 + 69 ^ 104 + 43 - 19 + 22;
        w.lIllllIIll[13] = 0x42 ^ 0x39 ^ 49 + 28 - 26 + 76;
        w.lIllllIIll[14] = 0x45 ^ 0x14 ^ (0x6B ^ 0x19);
        w.lIllllIIll[15] = 0xEC ^ 0xBE ^ (0x15 ^ 0x75);
        w.lIllllIIll[16] = 55 + 109 - 31 + 4 ^ 10 + 17 - 16 + 132;
        w.lIllllIIll[17] = -(0xFFFFFB9A & 0x1C6F) & (0xFFFFBFFF & 0x5BFB);
        w.lIllllIIll[18] = 0xFFFFBEBE & 0x495D;
        w.lIllllIIll[19] = 0x18 ^ 0x11;
        w.lIllllIIll[20] = 0x3C ^ 0x3B;
        w.lIllllIIll[21] = 0x31 ^ 0x39;
        w.lIllllIIll[22] = 1 ^ 0x29;
        w.lIllllIIll[23] = 0x8A ^ 0x81;
        w.lIllllIIll[24] = 0x22 ^ 0x2E;
        w.lIllllIIll[25] = 0xE2 ^ 0xB8 ^ (0x55 ^ 2);
        w.lIllllIIll[26] = 0x66 ^ 0x54 ^ (0x8A ^ 0xB6);
        w.lIllllIIll[27] = -(0xFFFFE6F8 & 0x793F) & (0xFFFFFBFF & 0x77BF);
        w.lIllllIIll[28] = 0x9E ^ 0x91;
        w.lIllllIIll[29] = 0xFFFFA7DF & 0x5FAB;
        w.lIllllIIll[30] = 0xFFFFCFDF & 0x7CBF;
        w.lIllllIIll[31] = 0xFFFFCDBD & 0x7EE7;
        w.lIllllIIll[32] = 0xFFFFB6DE & 0x4B2F;
        w.lIllllIIll[33] = 0xFFFFABFF & 0x5D2F;
        w.lIllllIIll[34] = -(0xFFFF9EE3 & 0x6FBD) & (0xFFFFBFF7 & 0x7FF9);
        w.lIllllIIll[35] = 0x2B ^ 0x3B;
        w.lIllllIIll[36] = 0xFFFFDF57 & 0x3FEF;
        w.lIllllIIll[37] = 0xFFFF8DDB & 0x776F;
        w.lIllllIIll[38] = -(0xFFFFDFDD & 0x34F7) & (0xFFFFFDFF & 0x1FFF);
        w.lIllllIIll[39] = -(0xFFFFDED3 & 0x393D) & (0xFFFFDEDF & 0x3FFF);
        w.lIllllIIll[40] = -(0x88 ^ 0xC2) & (0xFFFF86FF & Short.MAX_VALUE);
        w.lIllllIIll[41] = -(0xFFFFDB9B & 0x3477) & (0xFFFFF957 & 0x3FBA);
        w.lIllllIIll[42] = 0xB6 ^ 0x9D ^ (0x9E ^ 0xA4);
        w.lIllllIIll[43] = 0xFFFFFFFE & 0x1F4B;
        w.lIllllIIll[44] = -(0xFFFFDF3D & 0x71D3) & (0xFFFFF37D & 0x5FBA);
        w.lIllllIIll[45] = 0xFFFFABE7 & 0x57FB;
        w.lIllllIIll[46] = 0x59 ^ 0x4B;
        w.lIllllIIll[47] = 0x9F ^ 0x87;
        w.lIllllIIll[48] = 0x7C ^ 0x63 ^ (0xC9 ^ 0xC2);
        w.lIllllIIll[49] = 0x14 ^ 1;
        w.lIllllIIll[50] = 0xBC ^ 0x90 ^ (0x79 ^ 0x43);
        w.lIllllIIll[51] = 3 ^ 0x6C ^ (0x42 ^ 0x3A);
        w.lIllllIIll[52] = 0xFFFF8C5B & 0x7FBD;
        w.lIllllIIll[53] = -(0xFFFF9EED & 0x73D7) & (0xFFFF9FEF & 0x7FF4);
        w.lIllllIIll[54] = 0x56 ^ 0x27 ^ (0xF8 ^ 0x90);
        w.lIllllIIll[55] = 51 + 83 - 107 + 107 ^ 12 + 79 - 27 + 92;
        w.lIllllIIll[56] = -(0xFFFFB6FB & 0x79E5) & (0xFFFFBDFF & 0x7FFA);
        w.lIllllIIll[57] = 0xAD ^ 0x93 ^ (0x52 ^ 0x77);
        w.lIllllIIll[58] = 0xB3 ^ 0xAF;
        w.lIllllIIll[59] = 8 ^ 0x15;
        w.lIllllIIll[60] = -(0xFFFFBA47 & 0x6DF9) & (0xFFFFBAFE & 0x7DF7);
        w.lIllllIIll[61] = 0xFFFFBED7 & 0x4F79;
        w.lIllllIIll[62] = 0xFFFFDDBF & 0x2FFF;
        w.lIllllIIll[63] = -(0xFFFFBFC1 & 0x6D3F) & (0xFFFFBDBE & Short.MAX_VALUE);
        w.lIllllIIll[64] = 124 + 129 - 215 + 100 ^ 22 + 13 - -99 + 14;
        w.lIllllIIll[65] = 0x8E ^ 0x91;
        w.lIllllIIll[66] = 0xAC ^ 0x8D;
        w.lIllllIIll[67] = 71 + 59 - 52 + 90 ^ 94 + 86 - 43 + 1;
        w.lIllllIIll[68] = 0x48 ^ 0x6C;
        w.lIllllIIll[69] = "  ".length() ^ (0x80 ^ 0xA7);
        w.lIllllIIll[70] = 0x24 ^ 0x79 ^ (0xCD ^ 0xB6);
        w.lIllllIIll[71] = 0x1F ^ 0x38;
        w.lIllllIIll[72] = 0xE8 ^ 0xC1;
        w.lIllllIIll[73] = -(0xFFFFF956 & 0x16FD) & (0xFFFFFEDF & 0xF5F7);
        w.lIllllIIll[74] = 0xFFFFFFDD & 0xF766;
        w.lIllllIIll[75] = 0x94 ^ 0x83 ^ (0x2D ^ 0x10);
        w.lIllllIIll[76] = 0xD ^ 0x26;
        w.lIllllIIll[77] = 56 + 81 - 57 + 72 ^ 129 + 106 - 155 + 100;
        w.lIllllIIll[78] = 0xBB ^ 0x96;
        w.lIllllIIll[79] = 56 + 36 - -44 + 41 ^ 89 + 40 - 8 + 38;
        w.lIllllIIll[80] = 0xD7 ^ 0x9A ^ (0x65 ^ 7);
        w.lIllllIIll[81] = (0xD2 ^ 0x93) & ~(0x38 ^ 0x79) ^ (0xF6 ^ 0xC6);
        w.lIllllIIll[82] = 0x66 ^ 0x2D ^ (0x45 ^ 0x3F);
        w.lIllllIIll[83] = -(0xFFFFFCFF & 0x3B63) & (0xFFFFFFFF & 0x3FE7);
        w.lIllllIIll[84] = 0x59 ^ 0x6A;
        w.lIllllIIll[85] = 0x6E ^ 0x5A;
        w.lIllllIIll[86] = 3 ^ 0x36;
        w.lIllllIIll[87] = 0x4D ^ 0x7B;
        w.lIllllIIll[88] = 0x80 ^ 0xB7;
        w.lIllllIIll[89] = 0xC4 ^ 0x82;
        w.lIllllIIll[90] = 0xF5 ^ 0x80 ^ (0x4C ^ 0x70);
        w.lIllllIIll[91] = -(0xFFFFF77B & 0x7AFE) & (0xFFFFFFFF & Short.MAX_VALUE);
        w.lIllllIIll[92] = -(0xFFFFE77B & 0x5A9D) & (0xFFFFEFFF & 0x5FFF);
        w.lIllllIIll[93] = 3 ^ 0x3B;
        w.lIllllIIll[94] = 0xC9 ^ 0x8C ^ (0xCB ^ 0xB7);
        w.lIllllIIll[95] = 2 ^ 0x4E;
        w.lIllllIIll[96] = 46 + 20 - -76 + 11 ^ 123 + 50 - 125 + 115;
        w.lIllllIIll[97] = 0xC5 ^ 0xBF ^ (4 ^ 0x2E);
        w.lIllllIIll[98] = 225 + 207 - 256 + 72 ^ 57 + 79 - -23 + 36;
        w.lIllllIIll[99] = 0x15 ^ 0x4F;
        w.lIllllIIll[100] = 0x77 ^ 0x52 ^ (0x28 ^ 0x69);
        w.lIllllIIll[101] = 98 + 47 - 15 + 3 ^ 36 + 2 - -49 + 97;
        w.lIllllIIll[102] = 0x5F ^ 0x1E ^ 17 + 118 - 29 + 21;
        w.lIllllIIll[103] = 0xFFFF9FED & 0x6F1F;
        w.lIllllIIll[104] = 112 + 161 - 164 + 71 ^ 89 + 49 - 32 + 33;
        w.lIllllIIll[105] = 241 + 229 - 269 + 48 ^ 52 + 106 - 90 + 61;
        w.lIllllIIll[106] = (0xAE ^ 0xC1) + (0x26 ^ 0x62) - (8 + 47 - 20 + 118) + (0x2D ^ 0x45);
        w.lIllllIIll[107] = 0x1A ^ 5 ^ (0xDB ^ 0x84);
        w.lIllllIIll[108] = (0xA7 ^ 0x9C) + (0x16 ^ 0x42) - (0x89 ^ 0xB0) + (0x6A ^ 0x5C);
        w.lIllllIIll[109] = 25 + 8 - 32 + 192 ^ 70 + 42 - 33 + 52;
        w.lIllllIIll[110] = 0xFFFFABA1 & 0x5FFF;
        w.lIllllIIll[111] = 0xFFFFCDBF & 0x3EE7;
        w.lIllllIIll[112] = -(0xFFFFFD8E & 0x1379) & (0xFFFF9FBF & 0x7DEF);
        w.lIllllIIll[113] = 0x76 ^ 0x35;
        w.lIllllIIll[114] = 0x71 ^ 0x35;
        w.lIllllIIll[115] = 8 ^ 0x4D;
        w.lIllllIIll[116] = 26 + 32 - -52 + 40;
        w.lIllllIIll[117] = 0xFFFFAD2D & 0x5EF7;
        w.lIllllIIll[118] = -(0xFFFFF08B & 0x5FFE) & (0xFFFFDDBF & 0x7FDB);
        w.lIllllIIll[119] = 0x13 ^ 0x54;
        w.lIllllIIll[120] = 0x18 ^ 0x50;
        w.lIllllIIll[121] = 39 + 131 - 52 + 42;
        w.lIllllIIll[122] = (0xB5 ^ 0xA7) + (139 + 33 - 58 + 54) - (0xAC ^ 0xB6) + (0x41 ^ 0x4B);
        w.lIllllIIll[123] = 0xFFFFABFF & 0x5F73;
        w.lIllllIIll[124] = -(0xFFFFAEB7 & 0x714F) & (0xFFFFADD7 & 0x7FFE);
        w.lIllllIIll[125] = 0xDE ^ 0x94;
        w.lIllllIIll[126] = 0x79 ^ 0x32;
        w.lIllllIIll[127] = 49 + 6 - -22 + 58 + (136 + 74 - 85 + 42) - (161 + 229 - 279 + 132) + (0xF9 ^ 0x80);
        w.lIllllIIll[128] = 0x24 ^ 0x69;
        w.lIllllIIll[129] = 0x21 ^ 0x3B ^ (0x57 ^ 3);
        w.lIllllIIll[130] = 0x2A ^ 0x65;
        w.lIllllIIll[131] = 61 + 85 - -36 + 8;
        w.lIllllIIll[132] = (0x3E ^ 0x1F) + (0xCC ^ 0x95) - (0x75 ^ 0x62) + (0xA6 ^ 0xC3);
        w.lIllllIIll[133] = 0xFFFFABE5 & 0x55FA;
        w.lIllllIIll[134] = 0xE3 ^ 0xB2;
        w.lIllllIIll[135] = 0x4B ^ 8 ^ (0x7A ^ 0x6B);
        w.lIllllIIll[136] = 163 + 173 - 250 + 124;
        w.lIllllIIll[137] = 89 + 118 - 148 + 161;
        w.lIllllIIll[138] = 0xFB ^ 0xA8;
        w.lIllllIIll[139] = 0x45 ^ 0x11;
        w.lIllllIIll[140] = 0xE6 ^ 0xB3;
        w.lIllllIIll[141] = (0xA5 ^ 0xC5) + (74 + 122 - 149 + 154) - (59 + 175 - 101 + 52) + (0xE2 ^ 0x94);
        w.lIllllIIll[142] = 0xBA ^ 0x8B ^ (0x43 ^ 0x24);
        w.lIllllIIll[143] = 0x85 ^ 0x8A ^ (0x35 ^ 0x6D);
        w.lIllllIIll[144] = 216 + 137 - 285 + 164 ^ 106 + 51 - 142 + 161;
        w.lIllllIIll[145] = 55 + 75 - -52 + 26 ^ 107 + 68 - 46 + 8;
        w.lIllllIIll[146] = 0x11 ^ 0x4A;
        w.lIllllIIll[147] = 0xFFFFCFFD & 0x357A;
        w.lIllllIIll[148] = 0xFFFFEFEA & 0x1655;
        w.lIllllIIll[149] = 0xFFFFFC7B & 0x27EC;
        w.lIllllIIll[150] = 0xFFFF9F78 & 0x7BDF;
        w.lIllllIIll[151] = -(0xFFFFF94E & 0x2EB5) & (0xFFFFAFFF & 0x7FD3);
        w.lIllllIIll[152] = 0xFFFFBFAF & 0x55FE;
        w.lIllllIIll[153] = -(0xFFFFD365 & 0x3CBB) & (0xFFFFF7EC & 0x7FF3);
        w.lIllllIIll[154] = 0xFFFFC7FA & 0x3BED;
        w.lIllllIIll[155] = -(0xFFFFAAAF & 0x7751) & (0xFFFFAFFF & 0x7F7F);
        w.lIllllIIll[156] = 0xFFFFEFCC & 0x3EFF;
        w.lIllllIIll[157] = -(0xFFFFFCBD & 0x1F53) & (0xFFFFFDF8 & 0x7FBF);
        w.lIllllIIll[158] = -(0xFFFFF2FD & 0x5FCB) & (0xFFFFF7FE & 0x5FDD);
        w.lIllllIIll[159] = 0xEF ^ 0xB3;
        w.lIllllIIll[160] = 0x53 ^ 0xE;
        w.lIllllIIll[161] = 0x5D ^ 3;
        w.lIllllIIll[162] = 0xD9 ^ 0x86;
        w.lIllllIIll[163] = -(0xFFFFB1FF & 0x7FE9) & (0xFFFFFDFF & 0x3FFB);
        w.lIllllIIll[164] = -(0xFFFFF5B7 & 0x3AD9) & (0xFFFFFFFF & 0x3DFD);
        w.lIllllIIll[165] = -(0xFFFF97DB & 0x7A75) & (0xFFFF9FFD & Short.MAX_VALUE);
        w.lIllllIIll[166] = (0x72 ^ 0x1B) + (70 + 187 - 157 + 124) - (110 + 101 - 200 + 212) + (37 + 83 - -10 + 19);
        w.lIllllIIll[167] = -(0xFFFFFAF7 & 0x45EB) & (0xFFFFFCF7 & 0x4FFF);
        w.lIllllIIll[168] = -(0xFE ^ 0xBF) & (0xFFFF8DFF & 0x7F5E);
        w.lIllllIIll[169] = 0xFFFF8AFD & 0x7FEF;
        w.lIllllIIll[170] = -(0xFFFFF7BB & 0x58CD) & (0xFFFFDDDE & Short.MAX_VALUE);
        w.lIllllIIll[171] = -(0xFFFFF9E9 & 0x36D7) & (0xFFFFFFEE & 0x3EF5);
        w.lIllllIIll[172] = -(0xFFFF9E7F & 0x63B1) & (0xFFFFAFF7 & 0x5FFF);
        w.lIllllIIll[173] = 0xF9 ^ 0xA3 ^ (7 ^ 0x3D);
        w.lIllllIIll[174] = 0x1B ^ 0x7A;
        w.lIllllIIll[175] = 213 + 107 - 110 + 27 ^ 10 + 12 - -74 + 47;
        w.lIllllIIll[176] = 0x40 ^ 0x22 ^ " ".length();
        w.lIllllIIll[177] = 0xD2 ^ 0xB7;
        w.lIllllIIll[178] = 0xA4 ^ 0xC0 ^ "  ".length();
        w.lIllllIIll[179] = 125 + 14 - 79 + 106 ^ 160 + 138 - 277 + 172;
        w.lIllllIIll[180] = 0x80 ^ 0x8F ^ (0x3A ^ 0x5D);
        w.lIllllIIll[181] = 0xFA ^ 0x93;
    }

    private static boolean lIlIIIIIIIlIl(Object object, Object object2) {
        return object == object2;
    }

    private static void Q() {
        block46: {
            d llllllllllllllllllIlllIlIllllIll;
            block45: {
                block44: {
                    block43: {
                        Object llllllllllllllllllIlllIlIlllllII;
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
                                                                        int[] nArray = new int[lIllllIIll[0]];
                                                                        nArray[w.lIllllIIll[1]] = lIllllIIll[43];
                                                                        if (!w.lIIlllllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block31;
                                                                        int[] nArray2 = new int[lIllllIIll[0]];
                                                                        nArray2[w.lIllllIIll[1]] = lIllllIIll[43];
                                                                        if (!w.lIIlllllIllIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block32;
                                                                        int[] nArray3 = new int[lIllllIIll[0]];
                                                                        nArray3[w.lIllllIIll[1]] = lIllllIIll[43];
                                                                        if (!w.lIIlllllIlllI(Bank.getFirst((int[])nArray3).getQuantity(), lIllllIIll[4])) break block32;
                                                                    }
                                                                    llllllllllllllllllIlllIlIlllllII = new d(lIllllIIll[43], lIllllIIll[4], e.c(lIllllIIll[147], lIllllIIll[148]));
                                                                    bv.add((d)llllllllllllllllllIlllIlIlllllII);
                                                                    "".length();
                                                                }
                                                                int[] nArray = new int[lIllllIIll[0]];
                                                                nArray[w.lIllllIIll[1]] = lIllllIIll[30];
                                                                if (!w.lIIlllllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                                                                int[] nArray4 = new int[lIllllIIll[0]];
                                                                nArray4[w.lIllllIIll[1]] = lIllllIIll[30];
                                                                if (!w.lIIlllllIllIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block34;
                                                                int[] nArray5 = new int[lIllllIIll[0]];
                                                                nArray5[w.lIllllIIll[1]] = lIllllIIll[30];
                                                                if (!w.lIIlllllIlllI(Bank.getFirst((int[])nArray5).getQuantity(), lIllllIIll[16])) break block34;
                                                            }
                                                            llllllllllllllllllIlllIlIlllllII = new d(lIllllIIll[30], lIllllIIll[16], lIllllIIll[149]);
                                                            bv.add((d)llllllllllllllllllIlllIlIlllllII);
                                                            "".length();
                                                        }
                                                        int[] nArray = new int[lIllllIIll[0]];
                                                        nArray[w.lIllllIIll[1]] = lIllllIIll[31];
                                                        if (!w.lIIlllllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block35;
                                                        int[] nArray6 = new int[lIllllIIll[0]];
                                                        nArray6[w.lIllllIIll[1]] = lIllllIIll[31];
                                                        if (!w.lIIlllllIllIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block36;
                                                        int[] nArray7 = new int[lIllllIIll[0]];
                                                        nArray7[w.lIllllIIll[1]] = lIllllIIll[31];
                                                        if (!w.lIIlllllIlllI(Bank.getFirst((int[])nArray7).getQuantity(), lIllllIIll[28])) break block36;
                                                    }
                                                    llllllllllllllllllIlllIlIlllllII = new d(lIllllIIll[31], lIllllIIll[28], lIllllIIll[150]);
                                                    bv.add((d)llllllllllllllllllIlllIlIlllllII);
                                                    "".length();
                                                }
                                                int[] nArray = new int[lIllllIIll[0]];
                                                nArray[w.lIllllIIll[1]] = lIllllIIll[103];
                                                if (w.lIIlllllIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    llllllllllllllllllIlllIlIlllllII = new d(lIllllIIll[103], lIllllIIll[8], lIllllIIll[151]);
                                                    bv.add((d)llllllllllllllllllIlllIlIlllllII);
                                                    "".length();
                                                }
                                                int[] nArray8 = new int[lIllllIIll[0]];
                                                nArray8[w.lIllllIIll[1]] = lIllllIIll[37];
                                                if (w.lIIlllllIllll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                                    llllllllllllllllllIlllIlIlllllII = new d(lIllllIIll[37], lIllllIIll[0], lIllllIIll[27]);
                                                    bv.add((d)llllllllllllllllllIlllIlIlllllII);
                                                    "".length();
                                                }
                                                int[] nArray9 = new int[lIllllIIll[0]];
                                                nArray9[w.lIllllIIll[1]] = lIllllIIll[32];
                                                if (!w.lIIlllllIllIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block37;
                                                int[] nArray10 = new int[lIllllIIll[0]];
                                                nArray10[w.lIllllIIll[1]] = lIllllIIll[32];
                                                if (!w.lIIlllllIllIl(Bank.contains((int[])nArray10) ? 1 : 0)) break block38;
                                                int[] nArray11 = new int[lIllllIIll[0]];
                                                nArray11[w.lIllllIIll[1]] = lIllllIIll[32];
                                                if (!w.lIIlllllIlllI(Bank.getFirst((int[])nArray11).getQuantity(), lIllllIIll[13])) break block38;
                                            }
                                            llllllllllllllllllIlllIlIlllllII = new d(lIllllIIll[32], lIllllIIll[13], lIllllIIll[27]);
                                            bv.add((d)llllllllllllllllllIlllIlIlllllII);
                                            "".length();
                                        }
                                        int[] nArray = new int[lIllllIIll[0]];
                                        nArray[w.lIllllIIll[1]] = lIllllIIll[33];
                                        if (!w.lIIlllllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block39;
                                        int[] nArray12 = new int[lIllllIIll[0]];
                                        nArray12[w.lIllllIIll[1]] = lIllllIIll[33];
                                        if (!w.lIIlllllIllIl(Bank.contains((int[])nArray12) ? 1 : 0)) break block40;
                                        int[] nArray13 = new int[lIllllIIll[0]];
                                        nArray13[w.lIllllIIll[1]] = lIllllIIll[33];
                                        if (!w.lIIlllllIlllI(Bank.getFirst((int[])nArray13).getQuantity(), lIllllIIll[8])) break block40;
                                    }
                                    llllllllllllllllllIlllIlIlllllII = new d(lIllllIIll[33], lIllllIIll[8], lIllllIIll[27]);
                                    bv.add((d)llllllllllllllllllIlllIlIlllllII);
                                    "".length();
                                }
                                int[] nArray = new int[lIllllIIll[0]];
                                nArray[w.lIllllIIll[1]] = lIllllIIll[29];
                                if (!w.lIIlllllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block41;
                                int[] nArray14 = new int[lIllllIIll[0]];
                                nArray14[w.lIllllIIll[1]] = lIllllIIll[29];
                                if (!w.lIIlllllIllIl(Bank.contains((int[])nArray14) ? 1 : 0)) break block42;
                                int[] nArray15 = new int[lIllllIIll[0]];
                                nArray15[w.lIllllIIll[1]] = lIllllIIll[29];
                                if (!w.lIIlllllIlllI(Bank.getFirst((int[])nArray15).getQuantity(), lIllllIIll[8])) break block42;
                            }
                            llllllllllllllllllIlllIlIlllllII = new d(lIllllIIll[29], lIllllIIll[13], lIllllIIll[27]);
                            bv.add((d)llllllllllllllllllIlllIlIlllllII);
                            "".length();
                        }
                        int[] nArray = new int[lIllllIIll[0]];
                        nArray[w.lIllllIIll[1]] = lIllllIIll[39];
                        if (w.lIIlllllIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            llllllllllllllllllIlllIlIlllllII = new d(lIllllIIll[39], lIllllIIll[0], lIllllIIll[27]);
                            bv.add((d)llllllllllllllllllIlllIlIlllllII);
                            "".length();
                        }
                        int[] nArray16 = new int[lIllllIIll[0]];
                        nArray16[w.lIllllIIll[1]] = lIllllIIll[38];
                        if (w.lIIlllllIllll(Bank.contains((int[])nArray16) ? 1 : 0)) {
                            llllllllllllllllllIlllIlIlllllII = new d(lIllllIIll[38], lIllllIIll[0], lIllllIIll[27]);
                            bv.add((d)llllllllllllllllllIlllIlIlllllII);
                            "".length();
                        }
                        int[] nArray17 = new int[lIllllIIll[0]];
                        nArray17[w.lIllllIIll[1]] = lIllllIIll[40];
                        if (w.lIIlllllIllll(Bank.contains((int[])nArray17) ? 1 : 0)) {
                            llllllllllllllllllIlllIlIlllllII = new d(lIllllIIll[40], lIllllIIll[0], lIllllIIll[152]);
                            bv.add((d)llllllllllllllllllIlllIlIlllllII);
                            "".length();
                        }
                        int[] nArray18 = new int[lIllllIIll[0]];
                        nArray18[w.lIllllIIll[1]] = lIllllIIll[41];
                        if (w.lIIlllllIllll(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            llllllllllllllllllIlllIlIlllllII = new d(lIllllIIll[41], lIllllIIll[0], lIllllIIll[153] + e.c(lIllllIIll[154], lIllllIIll[155]));
                            bv.add((d)llllllllllllllllllIlllIlIlllllII);
                            "".length();
                        }
                        if (w.lIIlllllIllll(Bank.contains((Predicate)(llllllllllllllllllIlllIlIlllllII = item -> item.getName().toLowerCase().contains(lIllllIIIl[lIllllIIll[161]]))) ? 1 : 0)) {
                            llllllllllllllllllIlllIlIllllIll = new d(lIllllIIll[156], lIllllIIll[8], lIllllIIll[157]);
                            bv.add(llllllllllllllllllIlllIlIllllIll);
                            "".length();
                        }
                        int[] nArray19 = new int[lIllllIIll[0]];
                        nArray19[w.lIllllIIll[1]] = lIllllIIll[34];
                        if (!w.lIIlllllIllIl(Bank.contains((int[])nArray19) ? 1 : 0)) break block43;
                        int[] nArray20 = new int[lIllllIIll[0]];
                        nArray20[w.lIllllIIll[1]] = lIllllIIll[34];
                        if (!w.lIIlllllIllIl(Bank.contains((int[])nArray20) ? 1 : 0)) break block44;
                        int[] nArray21 = new int[lIllllIIll[0]];
                        nArray21[w.lIllllIIll[1]] = lIllllIIll[34];
                        if (!w.lIIlllllIlllI(Bank.getFirst((int[])nArray21).getQuantity(), lIllllIIll[13])) break block44;
                    }
                    llllllllllllllllllIlllIlIllllIll = new d(lIllllIIll[34], lIllllIIll[13], j.cf);
                    bv.add(llllllllllllllllllIlllIlIllllIll);
                    "".length();
                }
                int[] nArray = new int[lIllllIIll[0]];
                nArray[w.lIllllIIll[1]] = lIllllIIll[36];
                if (!w.lIIlllllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray22 = new int[lIllllIIll[0]];
                nArray22[w.lIllllIIll[1]] = lIllllIIll[36];
                if (!w.lIIlllllIllIl(Bank.contains((int[])nArray22) ? 1 : 0)) break block46;
                int[] nArray23 = new int[lIllllIIll[0]];
                nArray23[w.lIllllIIll[1]] = lIllllIIll[36];
                if (!w.lIIlllllIlllI(Bank.getFirst((int[])nArray23).getQuantity(), lIllllIIll[28])) break block46;
            }
            llllllllllllllllllIlllIlIllllIll = new d(lIllllIIll[36], lIllllIIll[22], lIllllIIll[158]);
            bv.add(llllllllllllllllllIlllIlIllllIll);
            "".length();
        }
    }

    @Override
    public boolean ae() {
        return lIllllIIll[1];
    }

    private static void lIIlllllIlIlI() {
        lIllllIIIl = new String[lIllllIIll[181]];
        w.lIllllIIIl[w.lIllllIIll[1]] = w.lIIllllIllIIl("vCdwjbmppAVL9MAlhLSQhduLFpPd0pJv+oLyul7uDdSd09KRTgJzJkbUPXSu02jF", "JCugm");
        w.lIllllIIIl[w.lIllllIIll[0]] = w.lIIllllIllIIl("wquu008MAHcXq1Bz1fKeVg==", "OJWVJ");
        w.lIllllIIIl[w.lIllllIIll[9]] = w.lIIllllIllIIl("1f3i3ZvGoAM/CdqZ2mF1Yg==", "gfTnG");
        w.lIllllIIIl[w.lIllllIIll[11]] = w.lIIllllIllIlI("LAJi8ghHgxcUghco9lHsEeKWvPGGo6F/", "plJva");
        w.lIllllIIIl[w.lIllllIIll[13]] = w.lIIllllIllIIl("KtL2raAWl7lU8bNIQJDCjA==", "mFfhb");
        w.lIllllIIIl[w.lIllllIIll[8]] = w.lIIllllIllIIl("xO35ejMIfqKbTV3NdD+XLA==", "fnpUd");
        w.lIllllIIIl[w.lIllllIIll[16]] = w.lIIllllIllIlI("K3uG0J7SwsUX5tzgtQgbZw==", "FECwE");
        w.lIllllIIIl[w.lIllllIIll[20]] = w.lIIllllIllIIl("nPi9aaPQXl9ynf4Dn129eA==", "GZeOO");
        w.lIllllIIIl[w.lIllllIIll[21]] = w.lIIllllIllIll("Bx4ObDYiOTgq", "UXJLr");
        w.lIllllIIIl[w.lIllllIIll[19]] = w.lIIllllIllIlI("bQSR+/gcmKkFUTf3UCRjSQ==", "RETeJ");
        w.lIllllIIIl[w.lIllllIIll[4]] = w.lIIllllIllIll("FTgdIB0hM0klDTkm", "TViIl");
        w.lIllllIIIl[w.lIllllIIll[23]] = w.lIIllllIllIll("CwgPISM8RAkibQMLEzYoJgA=", "HdfDM");
        w.lIllllIIIl[w.lIllllIIll[24]] = w.lIIllllIllIll("LwoRBDgbAUUBKAMU", "ndemI");
        w.lIllllIIIl[w.lIllllIIll[25]] = w.lIIllllIllIIl("JILXYc9QlU4=", "XQqlQ");
        w.lIllllIIIl[w.lIllllIIll[26]] = w.lIIllllIllIIl("Yl/jQDdGf+SotuQYKEyIiA==", "FHxUx");
        w.lIllllIIIl[w.lIllllIIll[28]] = w.lIIllllIllIIl("HmUNgEC0Os5fvo988wuStRoS+X0Zfath", "fSkae");
        w.lIllllIIIl[w.lIllllIIll[35]] = w.lIIllllIllIlI("CTV7UZjz/7RMUHBfFBijurjQcIJC7s5xZk03FVA3knvL43ejHFMduaIZ6e4D0uKzYQOeXw2/+Rc=", "ChJZG");
        w.lIllllIIIl[w.lIllllIIll[42]] = w.lIIllllIllIll("LiZKBh8cYwcOHgoqBABNCDYPFBlZMB8XHRUqDxRBWTAdDhkaKwMJClk3BUcvLBojKSo=", "yCjgm");
        w.lIllllIIIl[w.lIllllIIll[46]] = w.lIIllllIllIlI("A/XCygwuSBs=", "hCLnx");
        w.lIllllIIIl[w.lIllllIIll[12]] = w.lIIllllIllIll("ABwfCBg=", "Dnvfs");
        w.lIllllIIIl[w.lIllllIIll[48]] = w.lIIllllIllIll("OzEvMCA=", "hYNBK");
        w.lIllllIIIl[w.lIllllIIll[49]] = w.lIIllllIllIIl("N09fgh/6gR4=", "ACZeF");
        w.lIllllIIIl[w.lIllllIIll[50]] = w.lIIllllIllIIl("GKhCGXDy3D4=", "OfNaX");
        w.lIllllIIIl[w.lIllllIIll[51]] = w.lIIllllIllIlI("VSmr9lLq0OW4zwj9kM6vOg==", "idFES");
        w.lIllllIIIl[w.lIllllIIll[47]] = w.lIIllllIllIll("JQY4", "dpYSe");
        w.lIllllIIIl[w.lIllllIIll[54]] = w.lIIllllIllIIl("NpwylUOw9jYBKVl16jAdCw==", "sHAhG");
        w.lIllllIIIl[w.lIllllIIll[55]] = w.lIIllllIllIll("ODQqMSQD", "kQKCG");
        w.lIllllIIIl[w.lIllllIIll[57]] = w.lIIllllIllIIl("uu42asHXycB+0EDXSD6GTw==", "spUwt");
        w.lIllllIIIl[w.lIllllIIll[58]] = w.lIIllllIllIIl("G04WRnjbHXE=", "fSvLM");
        w.lIllllIIIl[w.lIllllIIll[59]] = w.lIIllllIllIll("AC0FGQ==", "WHdkQ");
        w.lIllllIIIl[w.lIllllIIll[64]] = w.lIIllllIllIIl("tnKFv0/AV0fW85dRwmSAyA==", "kCbtq");
        w.lIllllIIIl[w.lIllllIIll[65]] = w.lIIllllIllIlI("xPCGQrRerNToCCNvnnTJOdAKp8Z7+Ye1", "avFlA");
        w.lIllllIIIl[w.lIllllIIll[10]] = w.lIIllllIllIlI("X5fXqBjkMWw=", "yhLqf");
        w.lIllllIIIl[w.lIllllIIll[66]] = w.lIIllllIllIIl("yh5Rxhcd/yE=", "mEjdj");
        w.lIllllIIIl[w.lIllllIIll[67]] = w.lIIllllIllIll("LBQYYSENVQsiIQ0=", "bunAU");
        w.lIllllIIIl[w.lIllllIIll[14]] = w.lIIllllIllIIl("02cbTKUwnMA=", "QZBdv");
        w.lIllllIIIl[w.lIllllIIll[68]] = w.lIIllllIllIIl("oU4SQ8T7qm+rAdvaJQ+fkA==", "dCFep");
        w.lIllllIIIl[w.lIllllIIll[69]] = w.lIIllllIllIlI("HUGdllfgv3vYgn8K9Bxseg==", "XlBrI");
        w.lIllllIIIl[w.lIllllIIll[70]] = w.lIIllllIllIll("ARwwKhY/", "MsQNs");
        w.lIllllIIIl[w.lIllllIIll[71]] = w.lIIllllIllIIl("EW14dX6lZss=", "LrJix");
        w.lIllllIIIl[w.lIllllIIll[22]] = w.lIIllllIllIlI("0vs1Pk3k7kQ=", "dkKjW");
        w.lIllllIIIl[w.lIllllIIll[72]] = w.lIIllllIllIll("KgEkFxwU", "fnEsy");
        w.lIllllIIIl[w.lIllllIIll[75]] = w.lIIllllIllIll("DCssBzQ=", "NDBbG");
        w.lIllllIIIl[w.lIllllIIll[76]] = w.lIIllllIllIll("AzgADCozLRIA", "PLaeX");
        w.lIllllIIIl[w.lIllllIIll[77]] = w.lIIllllIllIll("MgomPBVcAiAmGQ==", "qfOQw");
        w.lIllllIIIl[w.lIllllIIll[78]] = w.lIIllllIllIlI("boox4O+y6YJX5CO4RNuTwg==", "SRUSn");
        w.lIllllIIIl[w.lIllllIIll[79]] = w.lIIllllIllIll("LQskBy0dBiQdOA==", "hhPhK");
        w.lIllllIIIl[w.lIllllIIll[80]] = w.lIIllllIllIlI("yYkR9oTnd6o=", "tVvZE");
        w.lIllllIIIl[w.lIllllIIll[81]] = w.lIIllllIllIlI("T9JzWHyPlN8IKUahFFRKhw==", "hMjsT");
        w.lIllllIIIl[w.lIllllIIll[82]] = w.lIIllllIllIll("NBwHKwNTEAErFBoEBD0=", "sthXw");
        w.lIllllIIIl[w.lIllllIIll[15]] = w.lIIllllIllIll("CBAdFw4pHA==", "Eqqta");
        w.lIllllIIIl[w.lIllllIIll[84]] = w.lIIllllIllIIl("sOdwXVZpvpA=", "iYujw");
        w.lIllllIIIl[w.lIllllIIll[85]] = w.lIIllllIllIll("PjsOOyQfNw==", "sZbXK");
        w.lIllllIIIl[w.lIllllIIll[86]] = w.lIIllllIllIll("EyYuNRU=", "RJGVp");
        w.lIllllIIIl[w.lIllllIIll[87]] = w.lIIllllIllIll("BzcHDA4mOw==", "JVkoa");
        w.lIllllIIIl[w.lIllllIIll[88]] = w.lIIllllIllIlI("V8ypza8wGus=", "IAwag");
        w.lIllllIIIl[w.lIllllIIll[93]] = w.lIIllllIllIIl("rr7WPdfU86IEMjGcLKiAtw==", "ddwVf");
        w.lIllllIIIl[w.lIllllIIll[94]] = w.lIIllllIllIll("KBgXeAoVGx09", "gtsXi");
        w.lIllllIIIl[w.lIllllIIll[96]] = w.lIIllllIllIll("BwwqCCYmAA==", "JmFkI");
        w.lIllllIIIl[w.lIllllIIll[98]] = w.lIIllllIllIll("Azs5OhciNw==", "NZUYx");
        w.lIllllIIIl[w.lIllllIIll[6]] = w.lIIllllIllIIl("64cuczwu1Mo=", "XaAIJ");
        w.lIllllIIIl[w.lIllllIIll[101]] = w.lIIllllIllIll("AAA1DxYxTjICHjYFNAQ=", "UnQjw");
        w.lIllllIIIl[w.lIllllIIll[102]] = w.lIIllllIllIIl("CKu22n+stR2wrBjuh2NdfQ==", "VKWlf");
        w.lIllllIIIl[w.lIllllIIll[104]] = w.lIIllllIllIIl("lzY6+8ANbwIYr6TZkSt7Ag==", "hmxzY");
        w.lIllllIIIl[w.lIllllIIll[107]] = w.lIIllllIllIIl("A+yiJl8vIbQ=", "PpqJn");
        w.lIllllIIIl[w.lIllllIIll[3]] = w.lIIllllIllIll("OicSLSo=", "mNfNB");
        w.lIllllIIIl[w.lIllllIIll[109]] = w.lIIllllIllIIl("LNVapbr/HB2LQrUT5AgHrQ==", "bfqKV");
        w.lIllllIIIl[w.lIllllIIll[113]] = w.lIIllllIllIIl("VHBVTnprAU4gCX0LPq24JA==", "nAbRU");
        w.lIllllIIIl[w.lIllllIIll[114]] = w.lIIllllIllIlI("7BDFZR+rTqo=", "RwVmW");
        w.lIllllIIIl[w.lIllllIIll[115]] = w.lIIllllIllIll("HywdFRY4LBVQHD4mHw==", "LIqpu");
        w.lIllllIIIl[w.lIllllIIll[89]] = w.lIIllllIllIlI("GSev/Jh05kzdSPqXAHSrhw==", "HwDcO");
        w.lIllllIIIl[w.lIllllIIll[119]] = w.lIIllllIllIlI("hfDiGGzK3KQqMNee+SaZeg==", "DGVmm");
        w.lIllllIIIl[w.lIllllIIll[120]] = w.lIIllllIllIlI("RTLRYJ726hA=", "SprEy");
        w.lIllllIIIl[w.lIllllIIll[90]] = w.lIIllllIllIIl("GTEQq0HQkbY=", "VCwGb");
        w.lIllllIIIl[w.lIllllIIll[125]] = w.lIIllllIllIlI("97qx3wzGUe189eHiOVYR9Q==", "UHuQk");
        w.lIllllIIIl[w.lIllllIIll[126]] = w.lIIllllIllIlI("MUIR4RAIpFc=", "sSnno");
        w.lIllllIIIl[w.lIllllIIll[95]] = w.lIIllllIllIIl("mHY6jW9e2Ys=", "cofam");
        w.lIllllIIIl[w.lIllllIIll[128]] = w.lIIllllIllIlI("pPUnUtXoqUAErOrh9Qnxtg==", "qRJNW");
        w.lIllllIIIl[w.lIllllIIll[129]] = w.lIIllllIllIll("Mx0QJjYCUwAxMgM=", "fstCW");
        w.lIllllIIIl[w.lIllllIIll[130]] = w.lIIllllIllIlI("WZU07D8K9lE=", "vIrBC");
        w.lIllllIIIl[w.lIllllIIll[97]] = w.lIIllllIllIlI("tDZs6hHPu3C1F0UyfUeL6g==", "BspDJ");
        w.lIllllIIIl[w.lIllllIIll[134]] = w.lIIllllIllIll("IAI+KBkABCVtFh0TKD4=", "rgMMx");
        w.lIllllIIIl[w.lIllllIIll[135]] = w.lIIllllIllIll("ID0iDzUYLjcE", "tOCaF");
        w.lIllllIIIl[w.lIllllIIll[138]] = w.lIIllllIllIlI("//GV56s+5CnpVCGXFsaipQ==", "AiXIa");
        w.lIllllIIIl[w.lIllllIIll[139]] = w.lIIllllIllIll("D2MWFzU6JhQY", "NCfvA");
        w.lIllllIIIl[w.lIllllIIll[140]] = w.lIIllllIllIlI("pORIlVJkWlfMoqPpGajRJg==", "rvdYw");
        w.lIllllIIIl[w.lIllllIIll[142]] = w.lIIllllIllIlI("AtXkVQ3MmNsu8o7Nk++DEg==", "ctayL");
        w.lIllllIIIl[w.lIllllIIll[143]] = w.lIIllllIllIll("FSY5EzMu", "FCXaP");
        w.lIllllIIIl[w.lIllllIIll[144]] = w.lIIllllIllIll("DAwwRCEtTTUQNDAZ", "BmFdU");
        w.lIllllIIIl[w.lIllllIIll[145]] = w.lIIllllIllIIl("l8SOuCO/6+8=", "Guxak");
        w.lIllllIIIl[w.lIllllIIll[99]] = w.lIIllllIllIlI("1jjMYrWE11Mqc5m153osZg==", "KMxbz");
        w.lIllllIIIl[w.lIllllIIll[146]] = w.lIIllllIllIll("KigjACAR", "yMBrC");
        w.lIllllIIIl[w.lIllllIIll[159]] = w.lIIllllIllIIl("oSvecbS0Vqc=", "BcjFF");
        w.lIllllIIIl[w.lIllllIIll[160]] = w.lIIllllIllIll("EgM4AAc/TRwMAT0IJQQVPg==", "SmQmf");
        w.lIllllIIIl[w.lIllllIIll[161]] = w.lIIllllIllIIl("A0mQIPgZBBvPGFbLY1pfU+N6JSjNQnZn", "lDOSb");
        w.lIllllIIIl[w.lIllllIIll[162]] = w.lIIllllIllIlI("Aa7rbx+FpOc=", "YdDht");
        w.lIllllIIIl[w.lIllllIIll[173]] = w.lIIllllIllIIl("WITwph4ruHU=", "JcPcu");
        w.lIllllIIIl[w.lIllllIIll[174]] = w.lIIllllIllIlI("uXI5kcfp7HrHDkBkgw2uryVolr5YmnJP", "CLlir");
        w.lIllllIIIl[w.lIllllIIll[175]] = w.lIIllllIllIIl("giIbhbk3+C5YhFhIlPCEJeH1ubpwB9TPQOoANL8fLaSm/+aZF7rxBpJk/NEcGnyM", "QBPuQ");
        w.lIllllIIIl[w.lIllllIIll[176]] = w.lIIllllIllIll("DCcgARFvAXUPADZoIQUaPC11Dh0mKz4IGzxoOwICY2ghBRAhdw==", "OHUmu");
        w.lIllllIIIl[w.lIllllIIll[100]] = w.lIIllllIllIIl("5MyJ1FGS5RYwQCRGtmnEAWaxa9bVecTv", "NuyWh");
        w.lIllllIIIl[w.lIllllIIll[177]] = w.lIIllllIllIlI("XtHi9xewe8Ui+hKiWUTXZZojNDz1Sran", "IPsaB");
        w.lIllllIIIl[w.lIllllIIll[178]] = w.lIIllllIllIll("Pwk+JRxbTBtuHlcENzsWVw0wJgYDTCYhHAQJcj0BEgkhaRIQDTsnXQ==", "wlRIs");
        w.lIllllIIIl[w.lIllllIIll[179]] = w.lIIllllIllIlI("ArBeSYrfEt5BJQvasUSWomitG3DZ9+E5", "xILnU");
        w.lIllllIIIl[w.lIllllIIll[180]] = w.lIIllllIllIll("", "wmpnX");
    }

    static {
        w.lIIlllllIlIll();
        w.lIIlllllIlIlI();
        bv = new ArrayList<d>();
        du = new WorldArea(lIllllIIll[163], lIllllIIll[56], lIllllIIll[16], lIllllIIll[4], lIllllIIll[1]);
        dv = new WorldArea(lIllllIIll[164], lIllllIIll[165], lIllllIIll[166], lIllllIIll[142], lIllllIIll[1]);
        dw = new WorldArea(lIllllIIll[164], lIllllIIll[165], lIllllIIll[166], lIllllIIll[142], lIllllIIll[0]);
        de = new WorldPoint(lIllllIIll[167], lIllllIIll[168], lIllllIIll[1]);
        dx = new WorldPoint(lIllllIIll[169], lIllllIIll[170], lIllllIIll[1]);
        dy = new WorldPoint(lIllllIIll[171], lIllllIIll[172], lIllllIIll[1]);
        String[] stringArray = new String[lIllllIIll[21]];
        stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[173]];
        stringArray[w.lIllllIIll[0]] = lIllllIIIl[lIllllIIll[174]];
        stringArray[w.lIllllIIll[9]] = lIllllIIIl[lIllllIIll[175]];
        stringArray[w.lIllllIIll[11]] = lIllllIIIl[lIllllIIll[176]];
        stringArray[w.lIllllIIll[13]] = lIllllIIIl[lIllllIIll[100]];
        stringArray[w.lIllllIIll[8]] = lIllllIIIl[lIllllIIll[177]];
        stringArray[w.lIllllIIll[16]] = lIllllIIIl[lIllllIIll[178]];
        stringArray[w.lIllllIIll[20]] = lIllllIIIl[lIllllIIll[179]];
        cE = stringArray;
        cY = lIllllIIll[1];
        dz = lIllllIIIl[lIllllIIll[180]];
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void llllllllllllllllllIlllIllIIIIIII;
        int[] nArray = new int[lIllllIIll[20]];
        nArray[w.lIllllIIll[1]] = lIllllIIll[36];
        nArray[w.lIllllIIll[0]] = lIllllIIll[37];
        nArray[w.lIllllIIll[9]] = lIllllIIll[34];
        nArray[w.lIllllIIll[11]] = lIllllIIll[40];
        nArray[w.lIllllIIll[13]] = lIllllIIll[41];
        nArray[w.lIllllIIll[8]] = lIllllIIll[30];
        nArray[w.lIllllIIll[16]] = lIllllIIll[31];
        int[] nArray2 = nArray;
        int llllllllllllllllllIlllIlIlllllll = lIllllIIll[1];
        while (w.lIIlllllIlllI(llllllllllllllllllIlllIlIlllllll, ((void)llllllllllllllllllIlllIllIIIIIII).length)) {
            int[] nArray3 = new int[lIllllIIll[0]];
            nArray3[w.lIllllIIll[1]] = llllllllllllllllllIlllIllIIIIIII[llllllllllllllllllIlllIlIlllllll];
            if (w.lIIlllllIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIllllIIll[1];
            }
            ++llllllllllllllllllIlllIlIlllllll;
            "".length();
            if ((136 + 21 - 90 + 130 ^ 112 + 152 - 245 + 174) == (133 + 67 - 164 + 129 ^ 142 + 111 - 151 + 59)) continue;
            return ((0x7C ^ 0x4B ^ (0xFA ^ 0x9B)) & (51 + 115 - 74 + 110 ^ 142 + 14 - 124 + 124 ^ -" ".length())) != 0;
        }
        return lIllllIIll[0];
    }

    @Override
    public int af() {
        try {
            w.bf();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-(0x93 ^ 0x97) > 0) {
            return (0x60 ^ 0x28) & ~(0x18 ^ 0x50);
        }
        return lIllllIIll[100];
    }

    private static boolean lIIlllllllIII(int n2) {
        return n2 > 0;
    }

    private static boolean lIIllllllIllI(Object object) {
        return object != null;
    }

    private static boolean lIIlllllllIIl(int n2) {
        return n2 < 0;
    }

    @Override
    public String ag() {
        if (w.lIlIIIIIIIlIl(dz, lIllllIIIl[lIllllIIll[159]])) {
            return lIllllIIIl[lIllllIIll[160]];
        }
        return "Animal Magnetism - " + dz;
    }

    private static int lIIlllllIllII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static String lIIllllIllIll(String llllllllllllllllllIlllIlIlIIlllI, String llllllllllllllllllIlllIlIlIIllIl) {
        llllllllllllllllllIlllIlIlIIlllI = new String(Base64.getDecoder().decode(llllllllllllllllllIlllIlIlIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIlllIlIlIIllII = new StringBuilder();
        char[] llllllllllllllllllIlllIlIlIIlIll = llllllllllllllllllIlllIlIlIIllIl.toCharArray();
        int llllllllllllllllllIlllIlIlIIlIlI = lIllllIIll[1];
        char[] llllllllllllllllllIlllIlIlIIIlII = llllllllllllllllllIlllIlIlIIlllI.toCharArray();
        int llllllllllllllllllIlllIlIlIIIIll = llllllllllllllllllIlllIlIlIIIlII.length;
        int llllllllllllllllllIlllIlIlIIIIlI = lIllllIIll[1];
        while (w.lIIlllllIlllI(llllllllllllllllllIlllIlIlIIIIlI, llllllllllllllllllIlllIlIlIIIIll)) {
            char llllllllllllllllllIlllIlIlIIllll = llllllllllllllllllIlllIlIlIIIlII[llllllllllllllllllIlllIlIlIIIIlI];
            llllllllllllllllllIlllIlIlIIllII.append((char)(llllllllllllllllllIlllIlIlIIllll ^ llllllllllllllllllIlllIlIlIIlIll[llllllllllllllllllIlllIlIlIIlIlI % llllllllllllllllllIlllIlIlIIlIll.length]));
            "".length();
            ++llllllllllllllllllIlllIlIlIIlIlI;
            ++llllllllllllllllllIlllIlIlIIIIlI;
            "".length();
            if (" ".length() < "  ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIlllIlIlIIllII);
    }

    public static void bf() {
        block115: {
            WorldPoint llllllllllllllllllIlllIllIIIIlIl;
            Object llllllllllllllllllIlllIllIIIIllI;
            block116: {
                block123: {
                    block118: {
                        block122: {
                            block121: {
                                block120: {
                                    block119: {
                                        block117: {
                                            if (w.lIIlllllIllIl(bt ? 1 : 0)) {
                                                b.a(bv);
                                                if (w.lIIlllllIlllI(bv.size(), lIllllIIll[0])) {
                                                    System.out.println(lIllllIIIl[lIllllIIll[1]]);
                                                    bt = lIllllIIll[1];
                                                }
                                            }
                                            if (!w.lIIlllllIllll(bt ? 1 : 0) || !w.lIIlllllIlllI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[2])) break block115;
                                            if (w.lIIlllllIlllI(e.j(lIllllIIll[3]), lIllllIIll[4])) {
                                                dz = lIllllIIIl[lIllllIIll[0]];
                                                O.db();
                                            }
                                            if (w.lIIllllllIIII(e.j(lIllllIIll[3]), lIllllIIll[4]) && (!w.lIIllllllIIIl(e.j(lIllllIIll[5]), lIllllIIll[6]) || w.lIIlllllIlllI(e.j(lIllllIIll[7]), lIllllIIll[8]))) {
                                                dz = lIllllIIIl[lIllllIIll[9]];
                                                H.cf();
                                            }
                                            if (w.lIIllllllIIII(e.j(lIllllIIll[3]), lIllllIIll[4]) && w.lIIllllllIIIl(e.j(lIllllIIll[5]), lIllllIIll[6]) && w.lIIllllllIIIl(e.j(lIllllIIll[7]), lIllllIIll[8]) && w.lIIlllllIlllI(e.j(lIllllIIll[10]), lIllllIIll[11])) {
                                                dz = lIllllIIIl[lIllllIIll[11]];
                                                V.dL();
                                            }
                                            if (w.lIIllllllIIII(e.j(lIllllIIll[3]), lIllllIIll[4]) && w.lIIllllllIIIl(e.j(lIllllIIll[5]), lIllllIIll[6]) && w.lIIllllllIIIl(e.j(lIllllIIll[7]), lIllllIIll[8]) && w.lIIllllllIIII(e.j(lIllllIIll[10]), lIllllIIll[11]) && w.lIIlllllIlllI(Skills.getLevel((Skill)Skill.CRAFTING), lIllllIIll[12])) {
                                                dz = lIllllIIIl[lIllllIIll[13]];
                                                ay.fi();
                                            }
                                            if (w.lIIllllllIIII(e.j(lIllllIIll[3]), lIllllIIll[4]) && w.lIIllllllIIIl(e.j(lIllllIIll[5]), lIllllIIll[6]) && w.lIIllllllIIIl(e.j(lIllllIIll[7]), lIllllIIll[8]) && w.lIIllllllIIII(e.j(lIllllIIll[10]), lIllllIIll[11]) && w.lIIllllllIIIl(Skills.getLevel((Skill)Skill.CRAFTING), lIllllIIll[12]) && w.lIIlllllIlllI(Skills.getLevel((Skill)Skill.WOODCUTTING), lIllllIIll[14])) {
                                                dz = lIllllIIIl[lIllllIIll[8]];
                                                aF.gs();
                                            }
                                            if (w.lIIllllllIIII(e.j(lIllllIIll[3]), lIllllIIll[4]) && w.lIIllllllIIIl(e.j(lIllllIIll[5]), lIllllIIll[6]) && w.lIIllllllIIIl(e.j(lIllllIIll[7]), lIllllIIll[8]) && w.lIIllllllIIII(e.j(lIllllIIll[10]), lIllllIIll[11]) && w.lIIllllllIIIl(Skills.getLevel((Skill)Skill.CRAFTING), lIllllIIll[12]) && w.lIIllllllIIIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIllllIIll[14]) && w.lIIlllllIlllI(Skills.getLevel((Skill)Skill.RANGED), lIllllIIll[15])) {
                                                dz = lIllllIIIl[lIllllIIll[16]];
                                                if (w.lIIlllllIlllI(cY, lIllllIIll[0])) {
                                                    o.cH = lIllllIIll[1];
                                                    cY += lIllllIIll[0];
                                                }
                                                n.aA();
                                            }
                                            if (w.lIIllllllIIII(e.j(lIllllIIll[3]), lIllllIIll[4]) && w.lIIllllllIIIl(e.j(lIllllIIll[5]), lIllllIIll[6]) && w.lIIllllllIIIl(e.j(lIllllIIll[7]), lIllllIIll[8]) && w.lIIllllllIIII(e.j(lIllllIIll[10]), lIllllIIll[11]) && w.lIIllllllIIIl(Skills.getLevel((Skill)Skill.CRAFTING), lIllllIIll[12]) && w.lIIllllllIIIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIllllIIll[14]) && w.lIIllllllIIIl(Skills.getLevel((Skill)Skill.RANGED), lIllllIIll[15])) {
                                                if (!w.lIIllllllIIIl(e.j(lIllllIIll[17]), lIllllIIll[18]) || w.lIIlllllIlllI(Skills.getLevel((Skill)Skill.HUNTER), lIllllIIll[19])) {
                                                    dz = lIllllIIIl[lIllllIIll[20]];
                                                    N.cY();
                                                }
                                                if (w.lIIllllllIIIl(e.j(lIllllIIll[17]), lIllllIIll[18]) && w.lIIllllllIIIl(Skills.getLevel((Skill)Skill.HUNTER), lIllllIIll[19]) && w.lIIlllllIlllI(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIllllIIll[6])) {
                                                    dz = lIllllIIIl[lIllllIIll[21]];
                                                    J.cw();
                                                }
                                                if (w.lIIllllllIIIl(e.j(lIllllIIll[17]), lIllllIIll[18]) && w.lIIllllllIIIl(Skills.getLevel((Skill)Skill.HUNTER), lIllllIIll[19]) && w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIllllIIll[6]) && w.lIIlllllIlllI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIllllIIll[22])) {
                                                    dz = lIllllIIIl[lIllllIIll[19]];
                                                    u.aX();
                                                }
                                                if (w.lIIllllllIIIl(e.j(lIllllIIll[17]), lIllllIIll[18]) && w.lIIllllllIIIl(Skills.getLevel((Skill)Skill.HUNTER), lIllllIIll[19]) && w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIllllIIll[6]) && w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIllllIIll[22]) && w.lIIlllllIlllI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIllllIIll[19])) {
                                                    String[] stringArray = new String[lIllllIIll[0]];
                                                    stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[4]];
                                                    if (w.lIIlllllIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        dz = lIllllIIIl[lIllllIIll[23]];
                                                        x.bi();
                                                    }
                                                }
                                                x.bj();
                                            }
                                            if (!w.lIIlllllIllll(w.an() ? 1 : 0) || !w.lIIlllllIllll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId())) || !w.lIIllllllIIIl(e.j(lIllllIIll[17]), lIllllIIll[18]) || !w.lIIllllllIIIl(Skills.getLevel((Skill)Skill.HUNTER), lIllllIIll[19]) || !w.lIIllllllIIIl(Skills.getLevel((Skill)Skill.RANGED), lIllllIIll[15]) || !w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIllllIIll[6]) || !w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIllllIIll[22]) || !w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIllllIIll[19])) break block116;
                                            String[] stringArray = new String[lIllllIIll[0]];
                                            stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[24]];
                                            if (!w.lIIlllllIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block116;
                                            dz = lIllllIIIl[lIllllIIll[25]];
                                            llllllllllllllllllIlllIllIIIIllI = BankLocation.getNearest();
                                            if (w.lIIllllllIllI(llllllllllllllllllIlllIllIIIIllI) && w.lIIlllllIllll(llllllllllllllllllIlllIllIIIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderSotf.c = lIllllIIIl[lIllllIIll[26]];
                                                a.a((BankLocation)llllllllllllllllllIlllIllIIIIllI);
                                            }
                                            if (!w.lIIllllllIllI(llllllllllllllllllIlllIllIIIIllI) || !w.lIIlllllIllIl(llllllllllllllllllIlllIllIIIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block116;
                                            if (w.lIIlllllIllll(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIllllIIll[27]);
                                                "".length();
                                            }
                                            if (!w.lIIlllllIllIl(Bank.isOpen() ? 1 : 0)) break block116;
                                            AccBuilderSotf.c = lIllllIIIl[lIllllIIll[28]];
                                            if (w.lIIlllllllIII(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIllllIIll[13]);
                                                "".length();
                                            }
                                            if (w.lIIlllllllIII(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIllllIIll[9]);
                                                "".length();
                                            }
                                            int[] nArray = new int[lIllllIIll[0]];
                                            nArray[w.lIllllIIll[1]] = lIllllIIll[29];
                                            if (!w.lIIlllllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block117;
                                            int[] nArray2 = new int[lIllllIIll[0]];
                                            nArray2[w.lIllllIIll[1]] = lIllllIIll[29];
                                            if (!w.lIIllllllIIIl(Bank.getFirst((int[])nArray2).getQuantity(), lIllllIIll[8])) break block118;
                                        }
                                        int[] nArray = new int[lIllllIIll[0]];
                                        nArray[w.lIllllIIll[1]] = lIllllIIll[30];
                                        if (!w.lIIlllllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block119;
                                        int[] nArray3 = new int[lIllllIIll[0]];
                                        nArray3[w.lIllllIIll[1]] = lIllllIIll[30];
                                        if (!w.lIIllllllIIIl(Bank.getFirst((int[])nArray3).getQuantity(), lIllllIIll[16])) break block118;
                                    }
                                    int[] nArray = new int[lIllllIIll[0]];
                                    nArray[w.lIllllIIll[1]] = lIllllIIll[31];
                                    if (!w.lIIlllllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block120;
                                    int[] nArray4 = new int[lIllllIIll[0]];
                                    nArray4[w.lIllllIIll[1]] = lIllllIIll[31];
                                    if (!w.lIIllllllIIIl(Bank.getFirst((int[])nArray4).getQuantity(), lIllllIIll[28])) break block118;
                                }
                                int[] nArray = new int[lIllllIIll[0]];
                                nArray[w.lIllllIIll[1]] = lIllllIIll[32];
                                if (!w.lIIlllllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block121;
                                int[] nArray5 = new int[lIllllIIll[0]];
                                nArray5[w.lIllllIIll[1]] = lIllllIIll[32];
                                if (!w.lIIllllllIIIl(Bank.getFirst((int[])nArray5).getQuantity(), lIllllIIll[13])) break block118;
                            }
                            int[] nArray = new int[lIllllIIll[0]];
                            nArray[w.lIllllIIll[1]] = lIllllIIll[33];
                            if (!w.lIIlllllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block122;
                            int[] nArray6 = new int[lIllllIIll[0]];
                            nArray6[w.lIllllIIll[1]] = lIllllIIll[33];
                            if (!w.lIIllllllIIIl(Bank.getFirst((int[])nArray6).getQuantity(), lIllllIIll[8])) break block118;
                        }
                        int[] nArray = new int[lIllllIIll[0]];
                        nArray[w.lIllllIIll[1]] = lIllllIIll[34];
                        if (!w.lIIlllllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block123;
                        int[] nArray7 = new int[lIllllIIll[0]];
                        nArray7[w.lIllllIIll[1]] = lIllllIIll[34];
                        if (!w.lIIlllllIlllI(Bank.getFirst((int[])nArray7).getQuantity(), lIllllIIll[13])) break block123;
                    }
                    w.Q();
                    System.out.println(lIllllIIIl[lIllllIIll[35]]);
                    bt = lIllllIIll[0];
                    return;
                }
                int[] nArray = new int[lIllllIIll[23]];
                nArray[w.lIllllIIll[1]] = lIllllIIll[36];
                nArray[w.lIllllIIll[0]] = lIllllIIll[37];
                nArray[w.lIllllIIll[9]] = lIllllIIll[33];
                nArray[w.lIllllIIll[11]] = lIllllIIll[38];
                nArray[w.lIllllIIll[13]] = lIllllIIll[32];
                nArray[w.lIllllIIll[8]] = lIllllIIll[34];
                nArray[w.lIllllIIll[16]] = lIllllIIll[39];
                nArray[w.lIllllIIll[20]] = lIllllIIll[40];
                nArray[w.lIllllIIll[21]] = lIllllIIll[41];
                nArray[w.lIllllIIll[19]] = lIllllIIll[30];
                nArray[w.lIllllIIll[4]] = lIllllIIll[31];
                if (w.lIIlllllIllll(e.c(nArray) ? 1 : 0)) {
                    w.Q();
                    System.out.println(lIllllIIIl[lIllllIIll[42]]);
                    bt = lIllllIIll[0];
                    return;
                }
                int[] nArray8 = new int[lIllllIIll[23]];
                nArray8[w.lIllllIIll[1]] = lIllllIIll[36];
                nArray8[w.lIllllIIll[0]] = lIllllIIll[37];
                nArray8[w.lIllllIIll[9]] = lIllllIIll[33];
                nArray8[w.lIllllIIll[11]] = lIllllIIll[38];
                nArray8[w.lIllllIIll[13]] = lIllllIIll[32];
                nArray8[w.lIllllIIll[8]] = lIllllIIll[34];
                nArray8[w.lIllllIIll[16]] = lIllllIIll[39];
                nArray8[w.lIllllIIll[20]] = lIllllIIll[40];
                nArray8[w.lIllllIIll[21]] = lIllllIIll[41];
                nArray8[w.lIllllIIll[19]] = lIllllIIll[30];
                nArray8[w.lIllllIIll[4]] = lIllllIIll[31];
                if (w.lIIlllllIllIl(e.c(nArray8) ? 1 : 0)) {
                    a.a(lIllllIIll[34], lIllllIIll[13]);
                    a.a(lIllllIIll[37], lIllllIIll[0]);
                    a.a(lIllllIIll[43], lIllllIIll[0]);
                    a.a(lIllllIIll[32], lIllllIIll[13]);
                    a.a(lIllllIIll[29], lIllllIIll[13]);
                    a.a(lIllllIIll[40], lIllllIIll[0]);
                    a.a(lIllllIIll[41], lIllllIIll[0]);
                    a.a(lIllllIIll[36], lIllllIIll[4]);
                    a.a(lIllllIIll[30], lIllllIIll[4]);
                    a.a(lIllllIIll[31], lIllllIIll[28]);
                    a.a(lIllllIIll[44], lIllllIIll[0]);
                    a.a(lIllllIIll[45], lIllllIIll[27]);
                }
            }
            if (w.lIIlllllIllIl(Inventory.contains((int[])f.ba) ? 1 : 0) && w.lIIlllllIlllI(Movement.getRunEnergy(), lIllllIIll[15])) {
                Inventory.getFirst((int[])f.ba).interact(lIllllIIIl[lIllllIIll[46]]);
                Time.sleepTicks((int)lIllllIIll[0]);
                "".length();
            }
            if (w.lIIlllllIllIl(Inventory.contains((int[])f.aX) ? 1 : 0) && w.lIIlllllIlllI(Prayers.getPoints(), lIllllIIll[47])) {
                Inventory.getFirst((int[])f.aX).interact(lIllllIIIl[lIllllIIll[12]]);
            }
            if (w.lIIlllllllIIl(w.lIIlllllIllII(e.w(), 60.0))) {
                String[] stringArray = new String[lIllllIIll[0]];
                stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[48]];
                if (w.lIIlllllIllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIllllIIll[0]];
                    stringArray2[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[49]];
                    Inventory.getFirst((String[])stringArray2).interact(lIllllIIIl[lIllllIIll[50]]);
                    Time.sleepTicks((int)lIllllIIll[9]);
                    "".length();
                }
            }
            if (w.lIIlllllIllIl(w.an() ? 1 : 0) && w.lIIlllllIllll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()))) {
                if (w.lIIlllllIllll(du.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIIlllllllIlI(Players.getLocal().getWorldLocation().distanceTo(de), lIllllIIll[21])) {
                    AccBuilderSotf.c = lIllllIIIl[lIllllIIll[51]];
                    if (w.lIIlllllIllIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)de);
                    "".length();
                    Time.sleepTicks((int)lIllllIIll[0]);
                    "".length();
                }
                if (w.lIIlllllIllIl(du.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIIlllllllIll(Players.getLocal().getWorldLocation().distanceTo(de), lIllllIIll[21])) {
                    di = lIllllIIll[1];
                    g.a(lIllllIIIl[lIllllIIll[47]], cE);
                }
                if (w.lIIlllllIllIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIllllIIll[52], lIllllIIll[53], lIllllIIll[1])) ? 1 : 0)) {
                    String[] stringArray = new String[lIllllIIll[0]];
                    stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[54]];
                    TileObjects.getNearest((String[])stringArray).interact(lIllllIIIl[lIllllIIll[55]]);
                    Time.sleepTicks((int)lIllllIIll[9]);
                    "".length();
                }
                if (w.lIIlllllIllIl((llllllllllllllllllIlllIllIIIIllI = new WorldArea(lIllllIIll[52], lIllllIIll[56], lIllllIIll[16], lIllllIIll[4], lIllllIIll[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIllllIIll[0]];
                    stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[57]];
                    TileObjects.getNearest((String[])stringArray).interact(lIllllIIIl[lIllllIIll[58]]);
                    Time.sleepTicks((int)lIllllIIll[9]);
                    "".length();
                }
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[4])) {
                int[] nArray = new int[lIllllIIll[0]];
                nArray[w.lIllllIIll[1]] = lIllllIIll[44];
                if (w.lIIlllllIllll(Equipment.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray9 = new int[lIllllIIll[0]];
                    nArray9[w.lIllllIIll[1]] = lIllllIIll[44];
                    Inventory.getFirst((int[])nArray9).interact(lIllllIIIl[lIllllIIll[59]]);
                }
                int[] nArray10 = new int[lIllllIIll[0]];
                nArray10[w.lIllllIIll[1]] = lIllllIIll[60];
                if (w.lIIlllllIllll(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                    block114: {
                        llllllllllllllllllIlllIllIIIIllI = new WorldPoint(lIllllIIll[61], lIllllIIll[62], lIllllIIll[1]);
                        int[] nArray11 = new int[lIllllIIll[0]];
                        nArray11[w.lIllllIIll[1]] = lIllllIIll[63];
                        if (w.lIIlllllIllll(Inventory.contains((int[])nArray11) ? 1 : 0) && w.lIIlllllllIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllIlllIllIIIIllI), lIllllIIll[48])) {
                            if (w.lIIlllllllIlI(Players.getLocal().getWorldLocation().distanceTo(dx), lIllllIIll[8])) {
                                AccBuilderSotf.c = lIllllIIIl[lIllllIIll[64]];
                                Movement.walkTo((WorldPoint)dx);
                                "".length();
                                Time.sleepTicks((int)lIllllIIll[0]);
                                "".length();
                            }
                            if (w.lIIlllllllIll(Players.getLocal().getWorldLocation().distanceTo(dx), lIllllIIll[8])) {
                                if (w.lIIlllllIllll(Shop.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIllllIIll[0]];
                                    stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[65]];
                                    NPCs.getNearest((String[])stringArray).interact(lIllllIIIl[lIllllIIll[10]]);
                                    Time.sleepTicks((int)lIllllIIll[9]);
                                    "".length();
                                }
                                if (w.lIIlllllIllIl(Shop.isOpen() ? 1 : 0)) {
                                    Shop.buyFive((int)lIllllIIll[63]);
                                    Time.sleepTicks((int)lIllllIIll[11]);
                                    "".length();
                                }
                            }
                        }
                        int[] nArray12 = new int[lIllllIIll[0]];
                        nArray12[w.lIllllIIll[1]] = lIllllIIll[63];
                        if (w.lIIlllllIllIl(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                            if (w.lIIlllllIllll(dv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.lIIlllllIllll(dw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                int[] nArray13 = new int[lIllllIIll[0]];
                                nArray13[w.lIllllIIll[1]] = lIllllIIll[31];
                                if (w.lIIlllllIllIl(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                    int[] nArray14 = new int[lIllllIIll[0]];
                                    nArray14[w.lIllllIIll[1]] = lIllllIIll[31];
                                    Inventory.getFirst((int[])nArray14).interact(lIllllIIIl[lIllllIIll[66]]);
                                    Time.sleepTicks((int)lIllllIIll[20]);
                                    "".length();
                                }
                            }
                            if (!w.lIIlllllIllll(dv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || w.lIIlllllIllIl(dw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                llllllllllllllllllIlllIllIIIIlIl = new WorldPoint(lIllllIIll[61], lIllllIIll[62], lIllllIIll[1]);
                                if (w.lIIlllllllIlI(Players.getLocal().getWorldLocation().distanceTo(llllllllllllllllllIlllIllIIIIlIl), lIllllIIll[8]) && w.lIIlllllIllll(Players.getLocal().getWorldLocation().getPlane())) {
                                    AccBuilderSotf.c = lIllllIIIl[lIllllIIll[67]];
                                    Movement.walkTo((WorldPoint)llllllllllllllllllIlllIllIIIIlIl);
                                    "".length();
                                    Time.sleepTicks((int)lIllllIIll[0]);
                                    "".length();
                                }
                                String[] stringArray = new String[lIllllIIll[0]];
                                stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[14]];
                                if (w.lIIlllllIllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                    if (w.lIIlllllllIll(Players.getLocal().getWorldLocation().distanceTo(llllllllllllllllllIlllIllIIIIlIl), lIllllIIll[8]) && w.lIIlllllIllll(Players.getLocal().getWorldLocation().getPlane())) {
                                        String[] stringArray3 = new String[lIllllIIll[0]];
                                        stringArray3[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[68]];
                                        TileObjects.getNearest((String[])stringArray3).interact(lIllllIIIl[lIllllIIll[69]]);
                                        Time.sleepTicks((int)lIllllIIll[13]);
                                        "".length();
                                    }
                                    String[] stringArray4 = new String[lIllllIIll[0]];
                                    stringArray4[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[70]];
                                    if (w.lIIllllllIllI(TileObjects.getNearest((String[])stringArray4))) {
                                        String[] stringArray5 = new String[lIllllIIll[0]];
                                        stringArray5[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[71]];
                                        if (w.lIIlllllIllIl(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                                            String[] stringArray6 = new String[lIllllIIll[0]];
                                            stringArray6[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[22]];
                                            String[] stringArray7 = new String[lIllllIIll[0]];
                                            stringArray7[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[72]];
                                            Inventory.getFirst((String[])stringArray6).useOn(TileObjects.getNearest((String[])stringArray7));
                                            Time.sleep((long)e.c(lIllllIIll[73], lIllllIIll[74]));
                                            "".length();
                                        }
                                    }
                                }
                                String[] stringArray8 = new String[lIllllIIll[0]];
                                stringArray8[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[75]];
                                if (w.lIIlllllIllll(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                                    if (w.lIIllllllIIII(Players.getLocal().getWorldLocation().getPlane(), lIllllIIll[0])) {
                                        String[] stringArray9 = new String[lIllllIIll[0]];
                                        stringArray9[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[76]];
                                        TileObjects.getNearest((String[])stringArray9).interact(lIllllIIIl[lIllllIIll[77]]);
                                        Time.sleepTicks((int)lIllllIIll[8]);
                                        "".length();
                                    }
                                    if (w.lIIlllllIllll(Players.getLocal().getWorldLocation().getPlane())) {
                                        do {
                                            String[] stringArray10 = new String[lIllllIIll[0]];
                                            stringArray10[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[78]];
                                            if (!w.lIIlllllIllIl(Inventory.contains((String[])stringArray10) ? 1 : 0)) break block114;
                                            String[] stringArray11 = new String[lIllllIIll[0]];
                                            stringArray11[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[79]];
                                            TileObjects.getNearest((String[])stringArray11).interact(lIllllIIIl[lIllllIIll[80]]);
                                            Time.sleepTicks((int)lIllllIIll[9]);
                                            "".length();
                                            "".length();
                                        } while (null == null);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    int[] nArray15 = new int[lIllllIIll[0]];
                    nArray15[w.lIllllIIll[1]] = lIllllIIll[32];
                    if (w.lIIlllllIllll(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                        String[] stringArray = new String[lIllllIIll[0]];
                        stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[81]];
                        if (w.lIIlllllIllll(Inventory.contains((String[])stringArray) ? 1 : 0) && w.lIIlllllllIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllIlllIllIIIIllI), lIllllIIll[48])) {
                            if (w.lIIlllllIllll(Dialog.isOpen() ? 1 : 0)) {
                                g.a(lIllllIIIl[lIllllIIll[82]], cE);
                                Time.sleepTicks((int)lIllllIIll[0]);
                                "".length();
                            }
                            g.a(cE);
                        }
                    }
                }
                int[] nArray16 = new int[lIllllIIll[0]];
                nArray16[w.lIllllIIll[1]] = lIllllIIll[60];
                if (w.lIIlllllIllIl(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIllllIIll[9]];
                    nArray17[w.lIllllIIll[1]] = lIllllIIll[83];
                    nArray17[w.lIllllIIll[0]] = lIllllIIll[29];
                    if (w.lIIlllllIllIl(Inventory.contains((int[])nArray17) ? 1 : 0)) {
                        int[] nArray18 = new int[lIllllIIll[9]];
                        nArray18[w.lIllllIIll[1]] = lIllllIIll[83];
                        nArray18[w.lIllllIIll[0]] = lIllllIIll[29];
                        Inventory.getAll((int[])nArray18).stream().forEach(item -> item.interact(lIllllIIIl[lIllllIIll[162]]));
                    }
                    if (w.lIIlllllllIlI(Players.getLocal().getWorldLocation().distanceTo(dy), lIllllIIll[20])) {
                        Movement.walkTo((WorldPoint)dy);
                        "".length();
                        Time.sleepTicks((int)lIllllIIll[0]);
                        "".length();
                    }
                    if (w.lIIlllllllIll(Players.getLocal().getWorldLocation().distanceTo(dy), lIllllIIll[20])) {
                        g.a(lIllllIIIl[lIllllIIll[15]], cE);
                    }
                }
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[48])) {
                g.a(lIllllIIIl[lIllllIIll[84]], cE);
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[64])) {
                g.a(lIllllIIIl[lIllllIIll[85]], cE);
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[22])) {
                g.a(lIllllIIIl[lIllllIIll[86]], cE);
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[15])) {
                g.a(lIllllIIIl[lIllllIIll[87]], cE);
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[6])) {
                g.a(lIllllIIIl[lIllllIIll[88]], cE);
            }
            if (!w.lIlIIIIIIIIIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[89]) || w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[90])) {
                llllllllllllllllllIlllIllIIIIllI = new WorldPoint(lIllllIIll[91], lIllllIIll[92], lIllllIIll[1]);
                if (w.lIIlllllllIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllIlllIllIIIIllI), lIllllIIll[11])) {
                    AccBuilderSotf.c = lIllllIIIl[lIllllIIll[93]];
                    Movement.walkTo((WorldPoint)llllllllllllllllllIlllIllIIIIllI);
                    "".length();
                    Time.sleepTicks((int)lIllllIIll[0]);
                    "".length();
                }
                if (w.lIIlllllllIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllIlllIllIIIIllI), lIllllIIll[11])) {
                    g.a(lIllllIIIl[lIllllIIll[94]], cE);
                }
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[95])) {
                if (w.lIIlllllllIlI(Players.getLocal().getWorldLocation().distanceTo(dy), lIllllIIll[20])) {
                    Movement.walkTo((WorldPoint)dy);
                    "".length();
                    Time.sleepTicks((int)lIllllIIll[0]);
                    "".length();
                }
                if (w.lIIlllllllIll(Players.getLocal().getWorldLocation().distanceTo(dy), lIllllIIll[20])) {
                    g.a(lIllllIIIl[lIllllIIll[96]], cE);
                }
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[97])) {
                g.a(lIllllIIIl[lIllllIIll[98]], cE);
            }
            if (!w.lIlIIIIIIIIIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[99]) || w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[100])) {
                g.a(lIllllIIIl[lIllllIIll[6]], cE);
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[100])) {
                String[] stringArray = new String[lIllllIIll[0]];
                stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[101]];
                if (w.lIIlllllIllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray12 = new String[lIllllIIll[0]];
                    stringArray12[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[102]];
                    if (w.lIIlllllIllll(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                        llllllllllllllllllIlllIllIIIIllI = new HashMap();
                        ((HashMap)llllllllllllllllllIlllIllIIIIllI).put(lIllllIIll[33], lIllllIIll[8]);
                        "".length();
                        ((HashMap)llllllllllllllllllIlllIllIIIIllI).put(lIllllIIll[38], lIllllIIll[0]);
                        "".length();
                        ((HashMap)llllllllllllllllllIlllIllIIIIllI).put(lIllllIIll[39], lIllllIIll[0]);
                        "".length();
                        ((HashMap)llllllllllllllllllIlllIllIIIIllI).put(lIllllIIll[103], lIllllIIll[0]);
                        "".length();
                        e.a((HashMap<Integer, Integer>)llllllllllllllllllIlllIllIIIIllI, lIllllIIll[1], lIllllIIll[1]);
                    }
                    String[] stringArray13 = new String[lIllllIIll[0]];
                    stringArray13[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[104]];
                    if (w.lIIlllllIllIl(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        w.bg();
                    }
                }
            }
            if (!w.lIlIIIIIIIIIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[105]) || w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[106])) {
                String[] stringArray = new String[lIllllIIll[0]];
                stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[107]];
                llllllllllllllllllIlllIllIIIIllI = NPCs.getNearest((String[])stringArray);
                if (w.lIIllllllIllI(llllllllllllllllllIlllIllIIIIllI)) {
                    if (w.lIIlllllIllIl(Reachable.isInteractable((Locatable)llllllllllllllllllIlllIllIIIIllI) ? 1 : 0)) {
                        g.a(lIllllIIIl[lIllllIIll[3]], cE);
                    }
                    if (w.lIIlllllIllll(Reachable.isInteractable((Locatable)llllllllllllllllllIlllIllIIIIllI) ? 1 : 0)) {
                        Movement.walkTo((Locatable)llllllllllllllllllIlllIllIIIIllI);
                        "".length();
                        Time.sleepTicks((int)lIllllIIll[0]);
                        "".length();
                    }
                }
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[108])) {
                String[] stringArray = new String[lIllllIIll[0]];
                stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[109]];
                if (w.lIIlllllIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    llllllllllllllllllIlllIllIIIIllI = new WorldPoint(lIllllIIll[110], lIllllIIll[111], lIllllIIll[1]);
                    llllllllllllllllllIlllIllIIIIlIl = new WorldPoint(lIllllIIll[110], lIllllIIll[112], lIllllIIll[1]);
                    if (w.lIIlllllIllll(Players.getLocal().getWorldLocation().equals(llllllllllllllllllIlllIllIIIIllI) ? 1 : 0) && w.lIIlllllIllll(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIlllIllIIIIlIl) ? 1 : 0)) {
                        AccBuilderSotf.c = lIllllIIIl[lIllllIIll[113]];
                        Movement.walkTo((WorldPoint)llllllllllllllllllIlllIllIIIIllI);
                        "".length();
                        Time.sleepTicks((int)lIllllIIll[0]);
                        "".length();
                    }
                    if (w.lIIlllllIllIl(Players.getLocal().getWorldLocation().equals(llllllllllllllllllIlllIllIIIIllI) ? 1 : 0) && w.lIIlllllIllll(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIlllIllIIIIlIl) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llllllllllllllllllIlllIllIIIIlIl);
                        "".length();
                    }
                    if (w.lIIlllllIllIl(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIlllIllIIIIlIl) ? 1 : 0)) {
                        String[] stringArray14 = new String[lIllllIIll[0]];
                        stringArray14[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[114]];
                        String[] stringArray15 = new String[lIllllIIll[0]];
                        stringArray15[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[115]];
                        Inventory.getFirst((String[])stringArray14).useOn(Inventory.getFirst((String[])stringArray15));
                        Time.sleepTicks((int)lIllllIIll[11]);
                        "".length();
                    }
                }
                String[] stringArray16 = new String[lIllllIIll[0]];
                stringArray16[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[89]];
                if (w.lIIlllllIllIl(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                    w.bg();
                }
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[116])) {
                llllllllllllllllllIlllIllIIIIllI = new WorldPoint(lIllllIIll[117], lIllllIIll[118], lIllllIIll[1]);
                if (w.lIIlllllIllll(Players.getLocal().getWorldLocation().equals(llllllllllllllllllIlllIllIIIIllI) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)llllllllllllllllllIlllIllIIIIllI);
                    "".length();
                    Time.sleepTicks((int)lIllllIIll[0]);
                    "".length();
                }
                if (w.lIIlllllIllIl(Players.getLocal().getWorldLocation().equals(llllllllllllllllllIlllIllIIIIllI) ? 1 : 0)) {
                    String[] stringArray = new String[lIllllIIll[0]];
                    stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[119]];
                    NPCs.getNearest((String[])stringArray).interact(lIllllIIIl[lIllllIIll[120]]);
                    Time.sleepTicks((int)lIllllIIll[0]);
                    "".length();
                }
            }
            if (!w.lIlIIIIIIIIIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[121]) || w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[122])) {
                llllllllllllllllllIlllIllIIIIllI = new WorldPoint(lIllllIIll[123], lIllllIIll[124], lIllllIIll[1]);
                if (w.lIIlllllllIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllIlllIllIIIIllI), lIllllIIll[9])) {
                    if (w.lIIlllllIllIl(Inventory.contains((int[])f.aT) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.aT).interact(lIllllIIIl[lIllllIIll[90]]);
                    }
                    AccBuilderSotf.c = lIllllIIIl[lIllllIIll[125]];
                    Movement.walkTo((WorldPoint)llllllllllllllllllIlllIllIIIIllI);
                    "".length();
                    Time.sleepTicks((int)lIllllIIll[0]);
                    "".length();
                }
                if (w.lIIlllllllIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllIlllIllIIIIllI), lIllllIIll[9])) {
                    String[] stringArray = new String[lIllllIIll[0]];
                    stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[126]];
                    llllllllllllllllllIlllIllIIIIlIl = NPCs.getNearest((String[])stringArray);
                    if (w.lIIllllllIllI(llllllllllllllllllIlllIllIIIIlIl)) {
                        if (w.lIIlllllIllIl(Reachable.isInteractable((Locatable)llllllllllllllllllIlllIllIIIIlIl) ? 1 : 0)) {
                            g.a(lIllllIIIl[lIllllIIll[95]], cE);
                        }
                        if (w.lIIlllllIllll(Reachable.isInteractable((Locatable)llllllllllllllllllIlllIllIIIIlIl) ? 1 : 0)) {
                            Movement.walkTo((Locatable)llllllllllllllllllIlllIllIIIIlIl);
                            "".length();
                            Time.sleepTicks((int)lIllllIIll[0]);
                            "".length();
                        }
                    }
                }
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[127])) {
                String[] stringArray = new String[lIllllIIll[0]];
                stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[128]];
                if (w.lIIlllllIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    llllllllllllllllllIlllIllIIIIllI = new WorldPoint(lIllllIIll[117], lIllllIIll[118], lIllllIIll[1]);
                    if (w.lIIlllllIllll(Players.getLocal().getWorldLocation().equals(llllllllllllllllllIlllIllIIIIllI) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llllllllllllllllllIlllIllIIIIllI);
                        "".length();
                        Time.sleepTicks((int)lIllllIIll[0]);
                        "".length();
                    }
                    if (w.lIIlllllIllIl(Players.getLocal().getWorldLocation().equals(llllllllllllllllllIlllIllIIIIllI) ? 1 : 0)) {
                        String[] stringArray17 = new String[lIllllIIll[0]];
                        stringArray17[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[129]];
                        NPCs.getNearest((String[])stringArray17).interact(lIllllIIIl[lIllllIIll[130]]);
                        Time.sleepTicks((int)lIllllIIll[0]);
                        "".length();
                    }
                }
                String[] stringArray18 = new String[lIllllIIll[0]];
                stringArray18[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[97]];
                if (w.lIIlllllIllIl(Inventory.contains((String[])stringArray18) ? 1 : 0)) {
                    w.bg();
                }
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[131])) {
                w.bg();
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[132])) {
                if (w.lIIlllllIllIl(Widgets.get((int)lIllllIIll[133]).isEmpty() ? 1 : 0)) {
                    String[] stringArray = new String[lIllllIIll[0]];
                    stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[134]];
                    Inventory.getFirst((String[])stringArray).interact(lIllllIIIl[lIllllIIll[135]]);
                    Time.sleepTicks((int)lIllllIIll[13]);
                    "".length();
                }
                if (w.lIIlllllIllll(Widgets.get((int)lIllllIIll[133]).isEmpty() ? 1 : 0)) {
                    Mouse.click((int)Widgets.get((int)lIllllIIll[133], (int)lIllllIIll[55]).getClickPoint().getX(), (int)Widgets.get((int)lIllllIIll[133], (int)lIllllIIll[55]).getClickPoint().getY(), (boolean)lIllllIIll[0]);
                    Time.sleepTicks((int)lIllllIIll[9]);
                    "".length();
                    Mouse.click((int)Widgets.get((int)lIllllIIll[133], (int)lIllllIIll[65]).getClickPoint().getX(), (int)Widgets.get((int)lIllllIIll[133], (int)lIllllIIll[65]).getClickPoint().getY(), (boolean)lIllllIIll[0]);
                    Time.sleepTicks((int)lIllllIIll[9]);
                    "".length();
                    Mouse.click((int)Widgets.get((int)lIllllIIll[133], (int)lIllllIIll[67]).getClickPoint().getX(), (int)Widgets.get((int)lIllllIIll[133], (int)lIllllIIll[67]).getClickPoint().getY(), (boolean)lIllllIIll[0]);
                    Time.sleepTicks((int)lIllllIIll[9]);
                    "".length();
                    Mouse.click((int)Widgets.get((int)lIllllIIll[133], (int)lIllllIIll[22]).getClickPoint().getX(), (int)Widgets.get((int)lIllllIIll[133], (int)lIllllIIll[22]).getClickPoint().getY(), (boolean)lIllllIIll[0]);
                    Time.sleepTicks((int)lIllllIIll[9]);
                    "".length();
                    Mouse.click((int)Widgets.get((int)lIllllIIll[133], (int)lIllllIIll[76]).getClickPoint().getX(), (int)Widgets.get((int)lIllllIIll[133], (int)lIllllIIll[76]).getClickPoint().getY(), (boolean)lIllllIIll[0]);
                    Time.sleepTicks((int)lIllllIIll[9]);
                    "".length();
                    Mouse.click((int)Widgets.get((int)lIllllIIll[133], (int)lIllllIIll[79]).getClickPoint().getX(), (int)Widgets.get((int)lIllllIIll[133], (int)lIllllIIll[79]).getClickPoint().getY(), (boolean)lIllllIIll[0]);
                    Time.sleepTicks((int)lIllllIIll[8]);
                    "".length();
                }
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[136])) {
                w.bg();
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[137])) {
                String[] stringArray = new String[lIllllIIll[0]];
                stringArray[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[138]];
                if (w.lIIlllllIllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray19 = new String[lIllllIIll[0]];
                    stringArray19[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[139]];
                    String[] stringArray20 = new String[lIllllIIll[0]];
                    stringArray20[w.lIllllIIll[1]] = lIllllIIIl[lIllllIIll[140]];
                    Inventory.getFirst((String[])stringArray19).useOn(Inventory.getFirst((String[])stringArray20));
                    Time.sleepTicks((int)lIllllIIll[9]);
                    "".length();
                }
            }
            if (w.lIIllllllIIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[141])) {
                if (w.lIIlllllIlllI(di, lIllllIIll[0])) {
                    aN.sa += lIllllIIll[0];
                    aN.u(AccBuilderSotf.m);
                    di += lIllllIIll[0];
                    aN.sa = lIllllIIll[1];
                    dj = lIllllIIll[1];
                }
                w.bg();
            }
            g.a(cE);
        }
    }

    private static boolean lIIllllllIIII(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIIllllIllIIl(String llllllllllllllllllIlllIlIllIIIlI, String llllllllllllllllllIlllIlIllIIIIl) {
        try {
            SecretKeySpec llllllllllllllllllIlllIlIllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlllIlIllIIIIl.getBytes(StandardCharsets.UTF_8)), lIllllIIll[21]), "DES");
            Cipher llllllllllllllllllIlllIlIllIIlII = Cipher.getInstance("DES");
            llllllllllllllllllIlllIlIllIIlII.init(lIllllIIll[9], llllllllllllllllllIlllIlIllIIlIl);
            return new String(llllllllllllllllllIlllIlIllIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlllIlIllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIlllIlIllIIIll) {
            llllllllllllllllllIlllIlIllIIIll.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (w.lIIllllllIIIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIllllIIll[2])) {
            bl = lIllllIIll[0];
            "".length();
            if (((0x80 ^ 0xAA ^ (0x45 ^ 0x27)) & (0x42 ^ 0x19 ^ (0x90 ^ 0x83) ^ -" ".length())) != 0) {
                return ("  ".length() & ("  ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = lIllllIIll[1];
        }
        return bl;
    }

    private static String lIIllllIllIlI(String llllllllllllllllllIlllIlIllIllIl, String llllllllllllllllllIlllIlIllIllII) {
        try {
            SecretKeySpec llllllllllllllllllIlllIlIlllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlllIlIllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIlllIlIlllIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllllIlllIlIlllIIIl.init(lIllllIIll[9], llllllllllllllllllIlllIlIlllIIlI);
            return new String(llllllllllllllllllIlllIlIlllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlllIlIllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIlllIlIlllIIII) {
            llllllllllllllllllIlllIlIlllIIII.printStackTrace();
            return null;
        }
    }
}

