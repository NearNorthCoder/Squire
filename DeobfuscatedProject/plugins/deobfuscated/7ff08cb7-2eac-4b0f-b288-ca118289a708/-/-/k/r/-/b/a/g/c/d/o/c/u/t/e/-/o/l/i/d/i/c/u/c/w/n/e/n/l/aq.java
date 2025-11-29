/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Actor
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.j;
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
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class aq
implements ab {
    public static final /* synthetic */ WorldPoint mB;
    public static /* synthetic */ List<d> bx;
    public static final /* synthetic */ WorldPoint mz;
    public static final /* synthetic */ WorldPoint mC;
    static final /* synthetic */ WorldPoint mD;
    public static /* synthetic */ boolean bv;
    private final /* synthetic */ int mG = 536;
    public static final /* synthetic */ WorldPoint mA;
    private static /* synthetic */ int[] lIIIIIIIIl;
    static final /* synthetic */ WorldPoint mF;
    private static /* synthetic */ String[] lIIIIIIIII;
    static final /* synthetic */ WorldPoint mE;

    private static boolean llIllIlIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIllIlIIllI(Object object) {
        return object != null;
    }

    private static int eb() {
        int n2 = lIIIIIIIIl[69];
        if (aq.llIllIlIIlII(Skills.getLevel((Skill)Skill.PRAYER), lIIIIIIIIl[70]) && aq.llIllIlIlIll(Skills.getLevel((Skill)Skill.PRAYER), lIIIIIIIIl[71])) {
            return (n2 - Skills.getExperience((Skill)Skill.PRAYER)) / lIIIIIIIIl[72] + lIIIIIIIIl[21];
        }
        int n3 = lIIIIIIIIl[73];
        return (n3 - Skills.getExperience((Skill)Skill.PRAYER)) / lIIIIIIIIl[72] + lIIIIIIIIl[62];
    }

    private static void Q() {
        d lIIllIIIIlIlI;
        Object lIIllIIIIlIll;
        int[] nArray = new int[lIIIIIIIIl[2]];
        nArray[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[8];
        if (aq.llIllIlIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIIIIIIIIl[8], lIIIIIIIIl[13], j.ch);
            bx.add(d2);
            0;
        }
        int[] nArray2 = new int[lIIIIIIIIl[2]];
        nArray2[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[0];
        if (aq.llIllIlIIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIIllIIIIlIll = new d(lIIIIIIIIl[0], aq.eb(), lIIIIIIIIl[63]);
            bx.add((d)lIIllIIIIlIll);
            0;
        }
        int[] nArray3 = new int[lIIIIIIIIl[2]];
        nArray3[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[7];
        if (aq.llIllIlIIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIIllIIIIlIll = new d(lIIIIIIIIl[7], lIIIIIIIIl[3], lIIIIIIIIl[5]);
            bx.add((d)lIIllIIIIlIll);
            0;
        }
        if (aq.llIllIlIIlIl(Bank.contains((Predicate)(lIIllIIIIlIll = item -> item.getName().toLowerCase().contains(lIIIIIIIII[lIIIIIIIIl[77]]))) ? 1 : 0)) {
            lIIllIIIIlIlI = new d(lIIIIIIIIl[64], lIIIIIIIIl[13], lIIIIIIIIl[65]);
            bx.add(lIIllIIIIlIlI);
            0;
        }
        int[] nArray4 = new int[lIIIIIIIIl[2]];
        nArray4[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[66];
        if (aq.llIllIlIIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIIllIIIIlIlI = new d(lIIIIIIIIl[66], lIIIIIIIIl[67], lIIIIIIIIl[68]);
            bx.add(lIIllIIIIlIlI);
            0;
        }
    }

    public aq() {
        this.mG = lIIIIIIIIl[0];
    }

    private static boolean llIllIlIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public int af() {
        try {
            aq.ea();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 != 1) {
            return (0x68 ^ 0x59) & ~(0xF1 ^ 0xC0);
        }
        return lIIIIIIIIl[74];
    }

    private static void llIllIlIIIIl() {
        lIIIIIIIII = new String[lIIIIIIIIl[87]];
        aq.lIIIIIIIII[aq.lIIIIIIIIl[1]] = aq."Buying items";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[2]] = aq."Finished buying items, switching back to prayer";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[3]] = aq."Navigating to bank";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[4]] = aq."Handling banking";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[6]] = aq."We are missing prayer supplies, switching to BUYING";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[13]] = aq."Drink";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[15]] = aq."Tele to wildy";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[17]] = aq."Rub";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[18]] = aq."Lava Maze";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[19]] = aq."Okay, teleport to level 41 Wilderness.";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[21]] = aq."Nav to altar";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[41]] = aq."1 tick pray";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[44]] = aq."Chaos altar";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[20]] = aq."Large door";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[46]] = aq."Open";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[47]] = aq."Open";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[48]] = aq."Open";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[49]] = aq."Chaos altar";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[51]] = aq."Nav to altar";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[52]] = aq."Unnoting bones";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[14]] = aq."Elder Chaos druid";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[53]] = aq."Large door";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[54]] = aq."Open";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[55]] = aq."Open";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[56]] = aq."Open";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[57]] = aq."Exchange";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[58]] = aq."Exchange 5";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[59]] = aq."Exchange All";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[60]] = aq."Suiciding";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[61]] = aq."Wine of zamorak";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[62]] = aq."Take";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[75]] = aq."Prayer training";
        aq.lIIIIIIIII[aq.lIIIIIIIIl[77]] = aq."ring of wealth (";
    }

    private static boolean llIllIlIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIllIlIIIlI() {
        lIIIIIIIIl = new int[88];
        aq.lIIIIIIIIl[0] = -(0xFFFFBFE3 & 0x757E) & (0xFFFFB7FB & 0x7F7D);
        aq.lIIIIIIIIl[1] = (37 + 81 - -8 + 23 ^ 79 + 18 - -75 + 1) & (0xC5 ^ 0x9D ^ (0xC8 ^ 0xA8) ^ -1);
        aq.lIIIIIIIIl[2] = 1;
        aq.lIIIIIIIIl[3] = 2;
        aq.lIIIIIIIIl[4] = 3;
        aq.lIIIIIIIIl[5] = 0xFFFFBFFB & 0x538C;
        aq.lIIIIIIIIl[6] = 0xC2 ^ 0xBC ^ (0xF4 ^ 0x8E);
        aq.lIIIIIIIIl[7] = -(0xFFFFA713 & 0x5CEE) & (0xFFFFD7FF & 0x7EAF);
        aq.lIIIIIIIIl[8] = -(0xFFFFDFA1 & 0x6A7F) & (0xFFFFFFFD & 0x7B73);
        aq.lIIIIIIIIl[9] = 0xFFFFBFEB & 0x43F7;
        aq.lIIIIIIIIl[10] = -(0xFFFFEEB7 & 0x55F9) & (0xFFFFFDB7 & 0x6FFC);
        aq.lIIIIIIIIl[11] = (0x69 ^ 0x1A) + (5 + 74 - 60 + 120) - (60 + 34 - -8 + 148) + (128 + 68 - 25 + 25);
        aq.lIIIIIIIIl[12] = 77 + 238 - 313 + 244 ^ 92 + 179 - 118 + 43;
        aq.lIIIIIIIIl[13] = 14 + 32 - 22 + 168 ^ 78 + 95 - 151 + 175;
        aq.lIIIIIIIIl[14] = 0x5F ^ 0x4B;
        aq.lIIIIIIIIl[15] = 7 ^ 0x36 ^ (0x31 ^ 6);
        aq.lIIIIIIIIl[16] = -1;
        aq.lIIIIIIIIl[17] = 0x4D ^ 0x4A;
        aq.lIIIIIIIIl[18] = 0x85 ^ 0x8D;
        aq.lIIIIIIIIl[19] = 6 ^ 0x53 ^ (0x5F ^ 3);
        aq.lIIIIIIIIl[20] = 0x15 ^ 0x18;
        aq.lIIIIIIIIl[21] = 0x20 ^ 0x2A;
        aq.lIIIIIIIIl[22] = 0xFFFFFFD7 & 0xBFC;
        aq.lIIIIIIIIl[23] = -(0xFFFFFD7D & 0x62B3) & (0xFFFFEFBE & 0x7F73);
        aq.lIIIIIIIIl[24] = 0xFFFFCBF3 & 0x3FDE;
        aq.lIIIIIIIIl[25] = -(0xFFFFBA5F & 0x55A5) & (0xFFFFBFFF & 0x5EFF);
        aq.lIIIIIIIIl[26] = 0xFFFFBBCF & 0x4FFB;
        aq.lIIIIIIIIl[27] = 0xFFFF8FF8 & 0x7EFF;
        aq.lIIIIIIIIl[28] = -(0xFFFFDFBF & 0x7479) & (0xFFFFFFFF & 0x5FFF);
        aq.lIIIIIIIIl[29] = -(0xFFFFB94B & 0x57B7) & (0xFFFFBFFF & 0x5FF7);
        aq.lIIIIIIIIl[30] = -(0xFFFFFEBF & 0x7566) & (0xFFFFFFEF & 0x7FF7);
        aq.lIIIIIIIIl[31] = 0xFFFF8FF1 & 0x7EFF;
        aq.lIIIIIIIIl[32] = -(0xFFFFF681 & 0x2D7F) & (0xFFFFEFFD & 0x3FBF);
        aq.lIIIIIIIIl[33] = -(0xFFFFB67B & 0x7995) & (0xFFFFBEFF & 0x7FFE);
        aq.lIIIIIIIIl[34] = 0xFFFFFBBF & 0xFF7;
        aq.lIIIIIIIIl[35] = 0xFFFF9FFA & 0x6EEF;
        aq.lIIIIIIIIl[36] = -(0xFFFFF413 & 0x7FFD) & (0xFFFFFFBF & Short.MAX_VALUE);
        aq.lIIIIIIIIl[37] = 0xFFFF8EFF & 0x7FEB;
        aq.lIIIIIIIIl[38] = -(0xFFFFD497 & 0x2F79) & (0xFFFFEFFF & 0x1FB7);
        aq.lIIIIIIIIl[39] = -(0xFFFFFFCD & 0x107F) & (0xFFFF9FEE & 0x7BFD);
        aq.lIIIIIIIIl[40] = -(0xFFFFD477 & 0x7FED) & (0xFFFFDFFE & Short.MAX_VALUE);
        aq.lIIIIIIIIl[41] = 0x68 ^ 0x29 ^ (0x77 ^ 0x3D);
        aq.lIIIIIIIIl[42] = 0xFFFFEFBB & 0x1BD7;
        aq.lIIIIIIIIl[43] = -(0x1E ^ 0xA) & (0xFFFFBFFF & 0x4EFF);
        aq.lIIIIIIIIl[44] = 0x8B ^ 0x87;
        aq.lIIIIIIIIl[45] = -(0xFFFFFA71 & 0x75FF) & (0xFFFFFBFF & Short.MAX_VALUE);
        aq.lIIIIIIIIl[46] = 0x4B ^ 0x45;
        aq.lIIIIIIIIl[47] = 0x98 ^ 0x97;
        aq.lIIIIIIIIl[48] = 0x83 ^ 0x93;
        aq.lIIIIIIIIl[49] = 0xB9 ^ 0x9F ^ (0x7D ^ 0x4A);
        aq.lIIIIIIIIl[50] = -(0xFFFFBCCF & 0x77B3) & (0xFFFFF79B & 0x3EFF);
        aq.lIIIIIIIIl[51] = 108 + 135 - 174 + 110 ^ 40 + 2 - -112 + 7;
        aq.lIIIIIIIIl[52] = 2 ^ (0xBA ^ 0xAB);
        aq.lIIIIIIIIl[53] = 0 ^ 0x2B ^ (0x53 ^ 0x6D);
        aq.lIIIIIIIIl[54] = 0x67 ^ 0x71;
        aq.lIIIIIIIIl[55] = 0xFC ^ 0x8D ^ (0xF4 ^ 0x92);
        aq.lIIIIIIIIl[56] = 0x57 ^ 0x4F;
        aq.lIIIIIIIIl[57] = 0x2B ^ 0x32;
        aq.lIIIIIIIIl[58] = 0x41 ^ 0x5B;
        aq.lIIIIIIIIl[59] = 0x39 ^ 0x59 ^ (0x37 ^ 0x4C);
        aq.lIIIIIIIIl[60] = 0xDC ^ 0x93 ^ (9 ^ 0x5A);
        aq.lIIIIIIIIl[61] = 0x47 ^ 0x5A;
        aq.lIIIIIIIIl[62] = 153 + 144 - 124 + 7 ^ 43 + 168 - 165 + 124;
        aq.lIIIIIIIIl[63] = 0xFFFF9BFC & 0x6EF3;
        aq.lIIIIIIIIl[64] = -3 & (0xFFFFEFCF & 0x3EFE);
        aq.lIIIIIIIIl[65] = -(0xFFFFFC57 & 0x17AA) & (0xFFFFF7EF & 0x7DB9);
        aq.lIIIIIIIIl[66] = 0xFFFFFFF7 & 0x1F4F;
        aq.lIIIIIIIIl[67] = 98 + 1 - -1 + 43 ^ 49 + 88 - 32 + 62;
        aq.lIIIIIIIIl[68] = -(0xFFFFDFF6 & 0x306D) & (0xFFFFBFF7 & 0x53EF);
        aq.lIIIIIIIIl[69] = -(0xFFFFB2E7 & 0x5F9A) & (0xFFFFFFCF & 0x43FFF);
        aq.lIIIIIIIIl[70] = 5 ^ 0x15 ^ (8 ^ 0x24);
        aq.lIIIIIIIIl[71] = 0x4E ^ 0x63;
        aq.lIIIIIIIIl[72] = -(0xFFFFFD5F & 0x6EB6) & (0xFFFFFDDF & 0x6FF7);
        aq.lIIIIIIIIl[73] = 0xFFFFFCCF & 0xF378;
        aq.lIIIIIIIIl[74] = 0x14 ^ 0x7C ^ (0x97 ^ 0x9B);
        aq.lIIIIIIIIl[75] = 0x9F ^ 0x80;
        aq.lIIIIIIIIl[76] = 0x74 ^ 0x17;
        aq.lIIIIIIIIl[77] = 129 + 107 - 105 + 12 ^ 146 + 31 - 143 + 141;
        aq.lIIIIIIIIl[78] = -(0xFFFFFEAD & 0x3173) & (0xFFFFBFF7 & 0x7BFD);
        aq.lIIIIIIIIl[79] = -(0xFFFFF0FD & 0x5FEE) & (0xFFFFFFFF & 0x5FEF);
        aq.lIIIIIIIIl[80] = -(0xFFFFE0EF & 0x7F1E) & (0xFFFFEBBF & Short.MAX_VALUE);
        aq.lIIIIIIIIl[81] = 0xFFFF9EEF & 0x6FF9;
        aq.lIIIIIIIIl[82] = 0xFFFFFF96 & 0xBEF;
        aq.lIIIIIIIIl[83] = 0xFFFFFFED & 0xEFF;
        aq.lIIIIIIIIl[84] = -(0xFFFFF8F7 & 0x374C) & (0xFFFFFBEF & 0x3FD7);
        aq.lIIIIIIIIl[85] = 0xFFFF9F1E & 0x6CF7;
        aq.lIIIIIIIIl[86] = 0xFFFFFDE7 & 0xFBB;
        aq.lIIIIIIIIl[87] = 0x3B ^ 0x62 ^ (8 ^ 0x70);
    }

    private static String llIllIIllllI(String lIIlIlllIllII, String lIIlIlllIlIll) {
        lIIlIlllIllII = new String(Base64.getDecoder().decode(lIIlIlllIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIlIlllIlIlI = new StringBuilder();
        char[] lIIlIlllIlIIl = lIIlIlllIlIll.toCharArray();
        int lIIlIlllIlIII = lIIIIIIIIl[1];
        char[] lIIlIlllIIIlI = lIIlIlllIllII.toCharArray();
        int lIIlIlllIIIIl = lIIlIlllIIIlI.length;
        int lIIlIlllIIIII = lIIIIIIIIl[1];
        while (aq.llIllIlIIlII(lIIlIlllIIIII, lIIlIlllIIIIl)) {
            char lIIlIlllIllIl = lIIlIlllIIIlI[lIIlIlllIIIII];
            lIIlIlllIlIlI.append((char)(lIIlIlllIllIl ^ lIIlIlllIlIIl[lIIlIlllIlIII % lIIlIlllIlIIl.length]));
            0;
            ++lIIlIlllIlIII;
            ++lIIlIlllIIIII;
            0;
            if (3 > 1) continue;
            return null;
        }
        return String.valueOf(lIIlIlllIlIlI);
    }

    private static boolean llIllIlIlIII(int n2, int n3) {
        return n2 > n3;
    }

    private static String llIllIIlllll(String lIIlIllIlIlll, String lIIlIllIlIllI) {
        try {
            SecretKeySpec lIIlIllIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlIllIlIllI.getBytes(StandardCharsets.UTF_8)), lIIIIIIIIl[18]), "DES");
            Cipher lIIlIllIllIIl = Cipher.getInstance("DES");
            lIIlIllIllIIl.init(lIIIIIIIIl[3], lIIlIllIllIlI);
            return new String(lIIlIllIllIIl.doFinal(Base64.getDecoder().decode(lIIlIllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIllIllIII) {
            lIIlIllIllIII.printStackTrace();
            return null;
        }
    }

    @Override
    public String ag() {
        return lIIIIIIIII[lIIIIIIIIl[75]];
    }

    public static void ea() {
        block44: {
            TileItem lIIllIIIlIIIl;
            block45: {
                if (aq.llIllIlIIIll(bv ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIIIII[lIIIIIIIIl[1]];
                    b.a(bx);
                    if (aq.llIllIlIIlII(bx.size(), lIIIIIIIIl[2])) {
                        System.out.println(lIIIIIIIII[lIIIIIIIIl[2]]);
                        bv = lIIIIIIIIl[1];
                    }
                }
                if (!aq.llIllIlIIlIl(bv ? 1 : 0)) break block44;
                if (aq.llIllIlIIlIl(aq.an() ? 1 : 0) && aq.llIllIlIIlII(Game.getWildyLevel(), lIIIIIIIIl[2])) {
                    lIIllIIIlIIIl = BankLocation.getNearest();
                    if (aq.llIllIlIIllI(lIIllIIIlIIIl) && aq.llIllIlIIlIl(lIIllIIIlIIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIIIIII[lIIIIIIIIl[3]];
                        a.a((BankLocation)lIIllIIIlIIIl);
                    }
                    if (aq.llIllIlIIllI(lIIllIIIlIIIl) && aq.llIllIlIIIll(lIIllIIIlIIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIIIIII[lIIIIIIIIl[4]];
                        if (aq.llIllIlIIlIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIIIIl[5]);
                            0;
                        }
                        if (aq.llIllIlIIIll(Bank.isOpen() ? 1 : 0)) {
                            if (aq.llIllIlIIlll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIIIIIIIl[6]);
                                0;
                            }
                            if (aq.llIllIlIIlll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIIIIIIIl[3]);
                                0;
                            }
                            int[] nArray = new int[lIIIIIIIIl[4]];
                            nArray[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[7];
                            nArray[aq.lIIIIIIIIl[2]] = lIIIIIIIIl[0];
                            nArray[aq.lIIIIIIIIl[3]] = lIIIIIIIIl[8];
                            if (aq.llIllIlIIlIl(e.d(nArray) ? 1 : 0)) {
                                aq.Q();
                                System.out.println(lIIIIIIIII[lIIIIIIIIl[6]]);
                                bv = lIIIIIIIIl[2];
                                return;
                            }
                            int[] nArray2 = new int[lIIIIIIIIl[4]];
                            nArray2[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[7];
                            nArray2[aq.lIIIIIIIIl[2]] = lIIIIIIIIl[0];
                            nArray2[aq.lIIIIIIIIl[3]] = lIIIIIIIIl[8];
                            if (aq.llIllIlIIIll(e.d(nArray2) ? 1 : 0)) {
                                if (aq.llIllIlIIlIl(Equipment.contains((int[])f.bh) ? 1 : 0)) {
                                    a.b(f.bh, lIIIIIIIIl[2]);
                                }
                                a.b(f.bc, lIIIIIIIIl[2]);
                                a.a(lIIIIIIIIl[9], lIIIIIIIIl[10]);
                                a.b(lIIIIIIIIl[0], lIIIIIIIIl[11]);
                            }
                        }
                    }
                }
                if (aq.llIllIlIIIll(aq.an() ? 1 : 0)) {
                    if (aq.llIllIlIIIll(Inventory.contains((int[])f.bc) ? 1 : 0) && aq.llIllIlIIlII(Movement.getRunEnergy(), lIIIIIIIIl[12])) {
                        Inventory.getFirst((int[])f.bc).interact(lIIIIIIIII[lIIIIIIIIl[13]]);
                        Time.sleepTicks((int)lIIIIIIIIl[2]);
                        0;
                    }
                    if (aq.llIllIlIIlIl(Movement.isRunEnabled() ? 1 : 0) && aq.llIllIlIlIII(Movement.getRunEnergy(), lIIIIIIIIl[14])) {
                        Movement.toggleRun();
                        Time.sleepTicks((int)lIIIIIIIIl[13]);
                        0;
                    }
                    if (aq.llIllIlIIlII(Game.getWildyLevel(), lIIIIIIIIl[2])) {
                        AccBuilderGWD.c = lIIIIIIIII[lIIIIIIIIl[15]];
                        if (aq.llIllIlIIIll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (aq.llIllIlIIlIl(Dialog.isOpen() ? 1 : 0) && aq.llIllIlIIIll(Inventory.contains((int[])f.bh) ? 1 : 0) && aq.llIllIlIlIIl(Players.getLocal().getAnimation(), lIIIIIIIIl[16])) {
                            Inventory.getFirst((int[])f.bh).interact(lIIIIIIIII[lIIIIIIIIl[17]]);
                            Time.sleepTicks((int)lIIIIIIIIl[3]);
                            0;
                        }
                        String[] stringArray = new String[lIIIIIIIIl[3]];
                        stringArray[aq.lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[18]];
                        stringArray[aq.lIIIIIIIIl[2]] = lIIIIIIIII[lIIIIIIIIl[19]];
                        g.a(stringArray);
                    }
                    if (aq.llIllIlIIlll(Game.getWildyLevel())) {
                        TileObject lIIllIIIlIIII;
                        int[] nArray = new int[lIIIIIIIIl[2]];
                        nArray[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[0];
                        if (aq.llIllIlIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            if (aq.llIllIlIlIII(Players.getLocal().getWorldLocation().distanceTo(mB), lIIIIIIIIl[20])) {
                                AccBuilderGWD.c = lIIIIIIIII[lIIIIIIIIl[21]];
                                TileItem tileItem = new WorldPoint[lIIIIIIIIl[20]];
                                tileItem[aq.lIIIIIIIIl[1]] = new WorldPoint(lIIIIIIIIl[22], lIIIIIIIIl[23], lIIIIIIIIl[1]);
                                tileItem[aq.lIIIIIIIIl[2]] = new WorldPoint(lIIIIIIIIl[24], lIIIIIIIIl[25], lIIIIIIIIl[1]);
                                tileItem[aq.lIIIIIIIIl[3]] = new WorldPoint(lIIIIIIIIl[26], lIIIIIIIIl[27], lIIIIIIIIl[1]);
                                tileItem[aq.lIIIIIIIIl[4]] = new WorldPoint(lIIIIIIIIl[28], lIIIIIIIIl[29], lIIIIIIIIl[1]);
                                tileItem[aq.lIIIIIIIIl[6]] = new WorldPoint(lIIIIIIIIl[30], lIIIIIIIIl[31], lIIIIIIIIl[1]);
                                tileItem[aq.lIIIIIIIIl[13]] = new WorldPoint(lIIIIIIIIl[32], lIIIIIIIIl[33], lIIIIIIIIl[1]);
                                tileItem[aq.lIIIIIIIIl[15]] = new WorldPoint(lIIIIIIIIl[34], lIIIIIIIIl[35], lIIIIIIIIl[1]);
                                tileItem[aq.lIIIIIIIIl[17]] = new WorldPoint(lIIIIIIIIl[36], lIIIIIIIIl[37], lIIIIIIIIl[1]);
                                tileItem[aq.lIIIIIIIIl[18]] = new WorldPoint(lIIIIIIIIl[38], lIIIIIIIIl[37], lIIIIIIIIl[1]);
                                tileItem[aq.lIIIIIIIIl[19]] = new WorldPoint(lIIIIIIIIl[39], lIIIIIIIIl[37], lIIIIIIIIl[1]);
                                tileItem[aq.lIIIIIIIIl[21]] = new WorldPoint(lIIIIIIIIl[40], lIIIIIIIIl[37], lIIIIIIIIl[1]);
                                tileItem[aq.lIIIIIIIIl[41]] = new WorldPoint(lIIIIIIIIl[42], lIIIIIIIIl[43], lIIIIIIIIl[1]);
                                tileItem[aq.lIIIIIIIIl[44]] = new WorldPoint(lIIIIIIIIl[45], lIIIIIIIIl[43], lIIIIIIIIl[1]);
                                lIIllIIIlIIIl = tileItem;
                                Walker.walkAlong(Arrays.asList(lIIllIIIlIIIl), new HashMap());
                                0;
                                Time.sleepTicks((int)lIIIIIIIIl[2]);
                                0;
                            }
                            if (aq.llIllIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(mB), lIIIIIIIIl[20])) {
                                AccBuilderGWD.c = lIIIIIIIII[lIIIIIIIIl[41]];
                                String[] stringArray = new String[lIIIIIIIIl[2]];
                                stringArray[aq.lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[44]];
                                lIIllIIIlIIIl = TileObjects.getNearest((String[])stringArray);
                                String[] stringArray2 = new String[lIIIIIIIIl[2]];
                                stringArray2[aq.lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[20]];
                                lIIllIIIlIIII = TileObjects.getNearest((String[])stringArray2);
                                String[] stringArray3 = new String[lIIIIIIIIl[2]];
                                stringArray3[aq.lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[46]];
                                if (aq.llIllIlIIIll(lIIllIIIlIIII.hasAction(stringArray3) ? 1 : 0)) {
                                    lIIllIIIlIIII.interact(lIIIIIIIII[lIIIIIIIIl[47]]);
                                }
                                if (aq.llIllIlIIllI(lIIllIIIlIIIl)) {
                                    String[] stringArray4 = new String[lIIIIIIIIl[2]];
                                    stringArray4[aq.lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[48]];
                                    if (aq.llIllIlIIlIl(lIIllIIIlIIII.hasAction(stringArray4) ? 1 : 0)) {
                                        int lIIllIIIIllll = Skills.getExperience((Skill)Skill.PRAYER);
                                        int[] nArray3 = new int[lIIIIIIIIl[2]];
                                        nArray3[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[0];
                                        String[] stringArray5 = new String[lIIIIIIIIl[2]];
                                        stringArray5[aq.lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[49]];
                                        Inventory.getFirst((int[])nArray3).useOn(TileObjects.getNearest((String[])stringArray5));
                                        Time.sleepTicks((int)lIIIIIIIIl[2]);
                                        0;
                                    }
                                }
                            }
                        }
                        int[] nArray4 = new int[lIIIIIIIIl[2]];
                        nArray4[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[0];
                        if (aq.llIllIlIIlIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[lIIIIIIIIl[2]];
                            nArray5[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[50];
                            if (aq.llIllIlIIIll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                if (aq.llIllIlIlIII(Players.getLocal().getWorldLocation().distanceTo(mB), lIIIIIIIIl[20])) {
                                    AccBuilderGWD.c = lIIIIIIIII[lIIIIIIIIl[51]];
                                    WorldPoint[] worldPointArray = new WorldPoint[lIIIIIIIIl[20]];
                                    worldPointArray[aq.lIIIIIIIIl[1]] = new WorldPoint(lIIIIIIIIl[22], lIIIIIIIIl[23], lIIIIIIIIl[1]);
                                    worldPointArray[aq.lIIIIIIIIl[2]] = new WorldPoint(lIIIIIIIIl[24], lIIIIIIIIl[25], lIIIIIIIIl[1]);
                                    worldPointArray[aq.lIIIIIIIIl[3]] = new WorldPoint(lIIIIIIIIl[26], lIIIIIIIIl[27], lIIIIIIIIl[1]);
                                    worldPointArray[aq.lIIIIIIIIl[4]] = new WorldPoint(lIIIIIIIIl[28], lIIIIIIIIl[29], lIIIIIIIIl[1]);
                                    worldPointArray[aq.lIIIIIIIIl[6]] = new WorldPoint(lIIIIIIIIl[30], lIIIIIIIIl[31], lIIIIIIIIl[1]);
                                    worldPointArray[aq.lIIIIIIIIl[13]] = new WorldPoint(lIIIIIIIIl[32], lIIIIIIIIl[33], lIIIIIIIIl[1]);
                                    worldPointArray[aq.lIIIIIIIIl[15]] = new WorldPoint(lIIIIIIIIl[34], lIIIIIIIIl[35], lIIIIIIIIl[1]);
                                    worldPointArray[aq.lIIIIIIIIl[17]] = new WorldPoint(lIIIIIIIIl[36], lIIIIIIIIl[37], lIIIIIIIIl[1]);
                                    worldPointArray[aq.lIIIIIIIIl[18]] = new WorldPoint(lIIIIIIIIl[38], lIIIIIIIIl[37], lIIIIIIIIl[1]);
                                    worldPointArray[aq.lIIIIIIIIl[19]] = new WorldPoint(lIIIIIIIIl[39], lIIIIIIIIl[37], lIIIIIIIIl[1]);
                                    worldPointArray[aq.lIIIIIIIIl[21]] = new WorldPoint(lIIIIIIIIl[40], lIIIIIIIIl[37], lIIIIIIIIl[1]);
                                    worldPointArray[aq.lIIIIIIIIl[41]] = new WorldPoint(lIIIIIIIIl[42], lIIIIIIIIl[43], lIIIIIIIIl[1]);
                                    worldPointArray[aq.lIIIIIIIIl[44]] = new WorldPoint(lIIIIIIIIl[45], lIIIIIIIIl[43], lIIIIIIIIl[1]);
                                    lIIllIIIlIIIl = worldPointArray;
                                    Walker.walkAlong(Arrays.asList(lIIllIIIlIIIl), new HashMap());
                                    0;
                                    Time.sleepTicks((int)lIIIIIIIIl[2]);
                                    0;
                                }
                                if (aq.llIllIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(mB), lIIIIIIIIl[20])) {
                                    AccBuilderGWD.c = lIIIIIIIII[lIIIIIIIIl[52]];
                                    if (!aq.llIllIlIIlIl(Dialog.canLevelUpContinue() ? 1 : 0) || aq.llIllIlIIIll(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    String[] stringArray = new String[lIIIIIIIIl[2]];
                                    stringArray[aq.lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[14]];
                                    lIIllIIIlIIIl = NPCs.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[lIIIIIIIIl[2]];
                                    stringArray6[aq.lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[53]];
                                    lIIllIIIlIIII = TileObjects.getNearest((String[])stringArray6);
                                    String[] stringArray7 = new String[lIIIIIIIIl[2]];
                                    stringArray7[aq.lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[54]];
                                    if (aq.llIllIlIIIll(lIIllIIIlIIII.hasAction(stringArray7) ? 1 : 0)) {
                                        lIIllIIIlIIII.interact(lIIIIIIIII[lIIIIIIIIl[55]]);
                                    }
                                    if (aq.llIllIlIIllI(lIIllIIIlIIIl)) {
                                        String[] stringArray8 = new String[lIIIIIIIIl[2]];
                                        stringArray8[aq.lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[56]];
                                        if (aq.llIllIlIIlIl(lIIllIIIlIIII.hasAction(stringArray8) ? 1 : 0)) {
                                            List lIIllIIIIllll;
                                            if (aq.llIllIlIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                                int[] nArray6 = new int[lIIIIIIIIl[2]];
                                                nArray6[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[50];
                                                Inventory.getFirst((int[])nArray6).useOn((Actor)lIIllIIIlIIIl);
                                                Time.sleepTicks((int)lIIIIIIIIl[3]);
                                                0;
                                            }
                                            if (aq.llIllIlIIIll(Dialog.isOpen() ? 1 : 0) && aq.llIllIlIIlIl((lIIllIIIIllll = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                                                int lIIllIIIIlllI = lIIIIIIIIl[1];
                                                while (aq.llIllIlIIlII(lIIllIIIIlllI, lIIllIIIIllll.size())) {
                                                    int[] nArray7 = new int[lIIIIIIIIl[2]];
                                                    nArray7[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[50];
                                                    if (aq.llIllIlIlIIl(((Item)Inventory.getAll((int[])nArray7).get(lIIIIIIIIl[1])).getQuantity(), lIIIIIIIIl[2]) && aq.llIllIlIIIll(((Widget)lIIllIIIIllll.get(lIIllIIIIlllI)).getText().contains(lIIIIIIIII[lIIIIIIIIl[57]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lIIllIIIIllll.get(lIIllIIIIlllI)).getClickPoint().getX(), (int)((Widget)lIIllIIIIllll.get(lIIllIIIIlllI)).getClickPoint().getY(), (boolean)lIIIIIIIIl[2]);
                                                        Time.sleepTicks((int)lIIIIIIIIl[3]);
                                                        0;
                                                    }
                                                    int[] nArray8 = new int[lIIIIIIIIl[2]];
                                                    nArray8[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[50];
                                                    if (aq.llIllIlIlIIl(((Item)Inventory.getAll((int[])nArray8).get(lIIIIIIIIl[1])).getQuantity(), lIIIIIIIIl[13]) && aq.llIllIlIIIll(((Widget)lIIllIIIIllll.get(lIIllIIIIlllI)).getText().contains(lIIIIIIIII[lIIIIIIIIl[58]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lIIllIIIIllll.get(lIIllIIIIlllI)).getClickPoint().getX(), (int)((Widget)lIIllIIIIllll.get(lIIllIIIIlllI)).getClickPoint().getY(), (boolean)lIIIIIIIIl[2]);
                                                        Time.sleepTicks((int)lIIIIIIIIl[3]);
                                                        0;
                                                    }
                                                    if (aq.llIllIlIIIll(((Widget)lIIllIIIIllll.get(lIIllIIIIlllI)).getText().contains(lIIIIIIIII[lIIIIIIIIl[59]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lIIllIIIIllll.get(lIIllIIIIlllI)).getClickPoint().getX(), (int)((Widget)lIIllIIIIllll.get(lIIllIIIIlllI)).getClickPoint().getY(), (boolean)lIIIIIIIIl[2]);
                                                        Time.sleepTicks((int)lIIIIIIIIl[3]);
                                                        0;
                                                    }
                                                    ++lIIllIIIIlllI;
                                                    0;
                                                    if (null == null) continue;
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int[] nArray = new int[lIIIIIIIIl[2]];
                nArray[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[9];
                if (!aq.llIllIlIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray9 = new int[lIIIIIIIIl[2]];
                nArray9[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[0];
                if (!aq.llIllIlIIlIl(Inventory.contains((int[])nArray9) ? 1 : 0)) break block44;
                int[] nArray10 = new int[lIIIIIIIIl[2]];
                nArray10[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[50];
                if (!aq.llIllIlIIlIl(Inventory.contains((int[])nArray10) ? 1 : 0)) break block44;
            }
            if (aq.llIllIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(mB), lIIIIIIIIl[20])) {
                AccBuilderGWD.c = lIIIIIIIII[lIIIIIIIIl[60]];
                String[] stringArray = new String[lIIIIIIIIl[2]];
                stringArray[aq.lIIIIIIIIl[1]] = lIIIIIIIII[lIIIIIIIIl[61]];
                lIIllIIIlIIIl = TileItems.getNearest((String[])stringArray);
                if (aq.llIllIlIIllI(lIIllIIIlIIIl)) {
                    lIIllIIIlIIIl.interact(lIIIIIIIII[lIIIIIIIIl[62]]);
                }
            }
        }
    }

    private static boolean llIllIlIIIll(int n2) {
        return n2 != 0;
    }

    private static String llIllIlIIIII(String lIIlIllllllII, String lIIlIlllllIll) {
        try {
            SecretKeySpec lIIlIllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIlllllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlIlllllllI = Cipher.getInstance("Blowfish");
            lIIlIlllllllI.init(lIIIIIIIIl[3], lIIlIllllllll);
            return new String(lIIlIlllllllI.doFinal(Base64.getDecoder().decode(lIIlIllllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIllllllIl) {
            lIIlIllllllIl.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (aq.llIllIlIlIll(Skills.getLevel((Skill)Skill.PRAYER), lIIIIIIIIl[76])) {
            bl = lIIIIIIIIl[2];
            0;
            if (((0x1B ^ 0x17 ^ (0x6E ^ 0x65)) & (0x12 ^ 0x63 ^ (0x30 ^ 0x46) ^ -1)) != ((16 + 105 - 86 + 160 ^ 141 + 142 - 273 + 134) & (0x7C ^ 0x4A ^ (0x3F ^ 0x5A) ^ -1))) {
                return ((72 + 3 - -52 + 54 ^ 109 + 96 - 179 + 120) & (0x39 ^ 0x27 ^ (0x10 ^ 0x29) ^ -1)) != 0;
            }
        } else {
            bl = lIIIIIIIIl[1];
        }
        return bl;
    }

    @Override
    public boolean ae() {
        return lIIIIIIIIl[1];
    }

    private static boolean llIllIlIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIllIlIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIllIlIIlll(int n2) {
        return n2 > 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[lIIIIIIIIl[2]];
                nArray[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[9];
                if (!aq.llIllIlIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIIIIIIIIl[2]];
                nArray2[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[9];
                if (!aq.llIllIlIlIll(Inventory.getFirst((int[])nArray2).getQuantity(), lIIIIIIIIl[12])) break block2;
                if (!aq.llIllIlIIlIl(Inventory.contains((int[])f.bh) ? 1 : 0)) break block3;
                if (!aq.llIllIlIIIll(Equipment.contains((int[])f.bh) ? 1 : 0)) break block2;
                int[] nArray3 = new int[lIIIIIIIIl[2]];
                nArray3[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[0];
                if (!aq.llIllIlIIlIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[lIIIIIIIIl[2]];
                nArray4[aq.lIIIIIIIIl[1]] = lIIIIIIIIl[50];
                if (!aq.llIllIlIIIll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block2;
            }
            n2 = lIIIIIIIIl[2];
            0;
            if (((0x83 ^ 0x9B ^ (0xA7 ^ 0x85)) & (0x2D ^ 0x38 ^ (0x53 ^ 0x7C) ^ -1)) >= 0) return n2 != 0;
            return ((0x5F ^ 0x5B ^ (0x32 ^ 0x63)) & (116 + 5 - -10 + 62 ^ 20 + 58 - 6 + 76 ^ -1)) != 0;
        }
        n2 = lIIIIIIIIl[1];
        return n2 != 0;
    }

    static {
        aq.llIllIlIIIlI();
        aq.llIllIlIIIIl();
        mz = new WorldPoint(lIIIIIIIIl[78], lIIIIIIIIl[79], lIIIIIIIIl[1]);
        mA = new WorldPoint(lIIIIIIIIl[80], lIIIIIIIIl[81], lIIIIIIIIl[1]);
        mB = new WorldPoint(lIIIIIIIIl[82], lIIIIIIIIl[83], lIIIIIIIIl[1]);
        mC = new WorldPoint(lIIIIIIIIl[84], lIIIIIIIIl[43], lIIIIIIIIl[1]);
        mD = new WorldPoint(lIIIIIIIIl[1], lIIIIIIIIl[1], lIIIIIIIIl[1]);
        mE = new WorldPoint(lIIIIIIIIl[1], lIIIIIIIIl[1], lIIIIIIIIl[1]);
        mF = new WorldPoint(lIIIIIIIIl[85], lIIIIIIIIl[86], lIIIIIIIIl[1]);
        bx = new ArrayList<d>();
    }
}

