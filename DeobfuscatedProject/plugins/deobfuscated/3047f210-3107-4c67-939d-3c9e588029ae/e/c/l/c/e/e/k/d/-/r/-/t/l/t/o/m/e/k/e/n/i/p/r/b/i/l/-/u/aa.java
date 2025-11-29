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
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.i;
import gg.squire.account.AccBuilderTempleTrek;
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

public class aa
implements S {
    private final /* synthetic */ int jz = 536;
    static final /* synthetic */ WorldPoint jx;
    public static final /* synthetic */ WorldPoint jv;
    static final /* synthetic */ WorldPoint jw;
    public static final /* synthetic */ WorldPoint ju;
    public static final /* synthetic */ WorldPoint js;
    public static final /* synthetic */ WorldPoint jt;
    private static /* synthetic */ String[] lIIIIIIlIll;
    public static /* synthetic */ List<d> bu;
    static final /* synthetic */ WorldPoint jy;
    public static /* synthetic */ boolean bs;
    private static /* synthetic */ int[] lIIIIIIllII;

    private static boolean llIlllIIIIIll(int n2) {
        return n2 > 0;
    }

    private static String llIllIlllllII(String lllllllllllllllllIIllllIlllIIIll, String lllllllllllllllllIIllllIlllIIIII) {
        try {
            SecretKeySpec lllllllllllllllllIIllllIlllIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIIllllIlllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIIllllIlllIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllIIllllIlllIIlIl.init(lIIIIIIllII[3], lllllllllllllllllIIllllIlllIIllI);
            return new String(lllllllllllllllllIIllllIlllIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIIllllIlllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIIllllIlllIIlII) {
            lllllllllllllllllIIllllIlllIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIlllllll(int n2) {
        return n2 != 0;
    }

    private static boolean llIlllIIIIllI(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        aa.llIllIllllllI();
        aa.llIllIlllllIl();
        js = new WorldPoint(lIIIIIIllII[78], lIIIIIIllII[79], lIIIIIIllII[1]);
        jt = new WorldPoint(lIIIIIIllII[80], lIIIIIIllII[81], lIIIIIIllII[1]);
        ju = new WorldPoint(lIIIIIIllII[82], lIIIIIIllII[83], lIIIIIIllII[1]);
        jv = new WorldPoint(lIIIIIIllII[84], lIIIIIIllII[43], lIIIIIIllII[1]);
        jw = new WorldPoint(lIIIIIIllII[1], lIIIIIIllII[1], lIIIIIIllII[1]);
        jx = new WorldPoint(lIIIIIIllII[1], lIIIIIIllII[1], lIIIIIIllII[1]);
        jy = new WorldPoint(lIIIIIIllII[85], lIIIIIIllII[86], lIIIIIIllII[1]);
        bu = new ArrayList<d>();
    }

    private static void llIllIllllllI() {
        lIIIIIIllII = new int[88];
        aa.lIIIIIIllII[0] = -(0xFFFFBFFD & 0x79C7) & (0xFFFFBBDF & 0x7FFC);
        aa.lIIIIIIllII[1] = (0xB3 ^ 0xAE ^ (0x19 ^ 0x3C)) & (40 + 28 - 44 + 139 ^ 127 + 123 - 169 + 74 ^ -1);
        aa.lIIIIIIllII[2] = 1;
        aa.lIIIIIIllII[3] = 2;
        aa.lIIIIIIllII[4] = 3;
        aa.lIIIIIIllII[5] = 0xFFFFF3DF & 0x1FA8;
        aa.lIIIIIIllII[6] = 0x41 ^ 0x45;
        aa.lIIIIIIllII[7] = -(0xFFFFB3FD & 0x6D53) & (0xFFFFF7FF & 0x7BFE);
        aa.lIIIIIIllII[8] = 0xFFFFF75B & 0x39F5;
        aa.lIIIIIIllII[9] = 0xFFFFEBFB & 0x17E7;
        aa.lIIIIIIllII[10] = 0xFFFFBFA5 & 0x695E;
        aa.lIIIIIIllII[11] = 56 + 42 - -55 + 47;
        aa.lIIIIIIllII[12] = 0xE ^ 0x3C;
        aa.lIIIIIIllII[13] = 0xD1 ^ 0xA0 ^ (0xFE ^ 0x8A);
        aa.lIIIIIIllII[14] = 0x14 ^ 0;
        aa.lIIIIIIllII[15] = 65 + 94 - 154 + 127 ^ 94 + 23 - 85 + 98;
        aa.lIIIIIIllII[16] = -1;
        aa.lIIIIIIllII[17] = 0x78 ^ 0x3F ^ (0x79 ^ 0x39);
        aa.lIIIIIIllII[18] = 0x9D ^ 0x95;
        aa.lIIIIIIllII[19] = 0xAC ^ 0xA5;
        aa.lIIIIIIllII[20] = 0x97 ^ 0x9A;
        aa.lIIIIIIllII[21] = 0x6F ^ 0x20 ^ (0xD8 ^ 0x9D);
        aa.lIIIIIIllII[22] = 0xFFFFBFFE & 0x4BD5;
        aa.lIIIIIIllII[23] = 0xFFFF9F07 & 0x6FFA;
        aa.lIIIIIIllII[24] = 0xFFFFEFFE & 0x1BD3;
        aa.lIIIIIIllII[25] = -(0x5A ^ 0x5F) & (0xFFFFAFFF & 0x5EFF);
        aa.lIIIIIIllII[26] = 0xFFFF8FEB & 0x7BDF;
        aa.lIIIIIIllII[27] = -(0xFFFFED8C & 0x7377) & (0xFFFFEFFF & 0x7FFB);
        aa.lIIIIIIllII[28] = -(0xFFFFF39D & 0x1C7B) & (0xFFFF9FDF & 0x7BFF);
        aa.lIIIIIIllII[29] = -(0xFFFFB3EF & 0x7D19) & (0xFFFFBFFF & 0x7FFD);
        aa.lIIIIIIllII[30] = 0xFFFF9BD7 & 0x6FEA;
        aa.lIIIIIIllII[31] = 0xFFFFAEFF & 0x5FF1;
        aa.lIIIIIIllII[32] = 0xFFFFBBFD & 0x4FBF;
        aa.lIIIIIIllII[33] = 0xFFFFBFFE & 0x4EEF;
        aa.lIIIIIIllII[34] = 0xFFFF8FBF & 0x7BF7;
        aa.lIIIIIIllII[35] = 0xFFFF8EEF & 0x7FFA;
        aa.lIIIIIIllII[36] = -(0xFFFF9B9D & 0x7473) & (0xFFFFFFFF & 0x1BBF);
        aa.lIIIIIIllII[37] = 0xFFFFFEFB & 0xFEF;
        aa.lIIIIIIllII[38] = -(0xFFFFFB99 & 0x747F) & (0xFFFFFBBF & Short.MAX_VALUE);
        aa.lIIIIIIllII[39] = -(0xFFFFFD7E & 0x56CB) & (0xFFFFFFEF & 0x5FF9);
        aa.lIIIIIIllII[40] = -(0xFFFFB5F6 & 0x6E6F) & (0xFFFFFFFF & 0x2FFF);
        aa.lIIIIIIllII[41] = 25 + 148 - 149 + 163 ^ 47 + 34 - 30 + 125;
        aa.lIIIIIIllII[42] = 0xFFFF8BB7 & 0x7FDB;
        aa.lIIIIIIllII[43] = 0xFFFFEFEC & 0x1EFF;
        aa.lIIIIIIllII[44] = 0x59 ^ 0x55;
        aa.lIIIIIIllII[45] = -(0xFFFFBA37 & 0x65F9) & (0xFFFFFFBF & 0x2BFF);
        aa.lIIIIIIllII[46] = 0x9A ^ 0x94;
        aa.lIIIIIIllII[47] = 0x6E ^ 0x61;
        aa.lIIIIIIllII[48] = 0x58 ^ 0x43 ^ (0x3F ^ 0x34);
        aa.lIIIIIIllII[49] = 0x37 ^ 0x11 ^ (0x8E ^ 0xB9);
        aa.lIIIIIIllII[50] = 0xFFFFB379 & 0x4E9F;
        aa.lIIIIIIllII[51] = 0xF ^ 0x52 ^ (0xD3 ^ 0x9C);
        aa.lIIIIIIllII[52] = 0xB3 ^ 0xA0;
        aa.lIIIIIIllII[53] = 0x5C ^ 0x49;
        aa.lIIIIIIllII[54] = 1 ^ (0x29 ^ 0x3E);
        aa.lIIIIIIllII[55] = 100 + 126 - 129 + 44 ^ 58 + 7 - -21 + 68;
        aa.lIIIIIIllII[56] = 0x4D ^ 0x55;
        aa.lIIIIIIllII[57] = 0x98 ^ 0x81;
        aa.lIIIIIIllII[58] = 0x2D ^ 0x19 ^ (0xB7 ^ 0x99);
        aa.lIIIIIIllII[59] = 0 ^ 0x1B;
        aa.lIIIIIIllII[60] = 0x98 ^ 0x84;
        aa.lIIIIIIllII[61] = 0x16 ^ 0xB;
        aa.lIIIIIIllII[62] = 0x25 ^ 0x3B;
        aa.lIIIIIIllII[63] = 0xFFFFFAF4 & 0xFFB;
        aa.lIIIIIIllII[64] = 0xFFFFAEED & 0x7FDE;
        aa.lIIIIIIllII[65] = 0xFFFFEBAA & 0x75FD;
        aa.lIIIIIIllII[66] = -(0xFFFFE819 & 0x77EF) & (0xFFFFFF6F & 0x7FDF);
        aa.lIIIIIIllII[67] = 8 + 38 - -11 + 78 ^ 40 + 167 - 137 + 105;
        aa.lIIIIIIllII[68] = 0xFFFFDBB6 & 0x27CD;
        aa.lIIIIIIllII[69] = -(0xFFFFDFEF & 0x32B1) & (0xFFFFFFFF & 0x43FEE);
        aa.lIIIIIIllII[70] = 0x34 ^ 8;
        aa.lIIIIIIllII[71] = 0xD ^ 0x20;
        aa.lIIIIIIllII[72] = -(0xFFFFB459 & 0x7FBF) & (0xFFFFBFFB & 0x75DE);
        aa.lIIIIIIllII[73] = 0xFFFFF178 & 0xFECF;
        aa.lIIIIIIllII[74] = 40 + 178 - 172 + 177 ^ 79 + 90 - 37 + 55;
        aa.lIIIIIIllII[75] = 0xA9 ^ 0xB6;
        aa.lIIIIIIllII[76] = 0xFF ^ 0x9C;
        aa.lIIIIIIllII[77] = 0x95 ^ 0xB5;
        aa.lIIIIIIllII[78] = 0xFFFFBBFF & 0x4FD5;
        aa.lIIIIIIllII[79] = -(0xFFFFB2FF & 0x5DEB) & (0xFFFFDFFF & 0x3FEE);
        aa.lIIIIIIllII[80] = 0xFFFFCFB6 & 0x3BFB;
        aa.lIIIIIIllII[81] = -(0xFFFFEAD3 & 0x753F) & (0xFFFFEFFB & 0x7EFF);
        aa.lIIIIIIllII[82] = 0xFFFFEB8E & 0x1FF7;
        aa.lIIIIIIllII[83] = -(0xFFFFBD3B & 0x73C7) & (0xFFFFBFFF & 0x7FEF);
        aa.lIIIIIIllII[84] = -(0xFFFFFFB9 & 0x446F) & (0xFFFFCFEF & 0x7FBC);
        aa.lIIIIIIllII[85] = -(0xFFFFF3EB & 0xE55) & (0xFFFFEE76 & 0x1FDF);
        aa.lIIIIIIllII[86] = 0xFFFF9FF3 & 0x6DAF;
        aa.lIIIIIIllII[87] = 0x51 ^ 0x70;
    }

    private static boolean llIlllIIIIIlI(Object object) {
        return object != null;
    }

    private static boolean llIlllIIIIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIlllIIIIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlllIIIIIIl(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (aa.llIlllIIIIlll(Skills.getLevel((Skill)Skill.PRAYER), lIIIIIIllII[76])) {
            bl = lIIIIIIllII[2];
            0;
            if ((0x72 ^ 0xC ^ (0x7A ^ 0)) <= 2) {
                return ((0x5C ^ 0x51 ^ (0x5C ^ 0x56)) & (11 + 13 - 13 + 121 ^ 35 + 4 - -35 + 57 ^ -1)) != 0;
            }
        } else {
            bl = lIIIIIIllII[1];
        }
        return bl;
    }

    public aa() {
        this.jz = lIIIIIIllII[0];
    }

    @Override
    public boolean S() {
        return lIIIIIIllII[1];
    }

    private static boolean llIlllIIIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIllIlllllIl() {
        lIIIIIIlIll = new String[lIIIIIIllII[87]];
        aa.lIIIIIIlIll[aa.lIIIIIIllII[1]] = aa."Buying items";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[2]] = aa."Finished buying items, switching back to prayer";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[3]] = aa."Navigating to bank";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[4]] = aa."Handling banking";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[6]] = aa."We are missing prayer supplies, switching to BUYING";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[13]] = aa."Drink";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[15]] = aa."Tele to wildy";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[17]] = aa."Rub";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[18]] = aa."Lava Maze";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[19]] = aa."Okay, teleport to level 41 Wilderness.";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[21]] = aa."Nav to altar";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[41]] = aa."1 tick pray";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[44]] = aa."Chaos altar";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[20]] = aa."Large door";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[46]] = aa."Open";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[47]] = aa."Open";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[48]] = aa."Open";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[49]] = aa."Chaos altar";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[51]] = aa."Nav to altar";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[52]] = aa."Unnoting bones";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[14]] = aa."Elder Chaos druid";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[53]] = aa."Large door";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[54]] = aa."Open";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[55]] = aa."Open";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[56]] = aa."Open";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[57]] = aa."Exchange";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[58]] = aa."Exchange 5";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[59]] = aa."Exchange All";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[60]] = aa."Suiciding";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[61]] = aa."Wine of zamorak";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[62]] = aa."Take";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[75]] = aa."Prayer training";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[77]] = aa."ring of wealth (";
    }

    private static String llIllIllllIll(String lllllllllllllllllIIllllIllIlIlII, String lllllllllllllllllIIllllIllIlIIll) {
        try {
            SecretKeySpec lllllllllllllllllIIllllIllIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIIllllIllIlIIll.getBytes(StandardCharsets.UTF_8)), lIIIIIIllII[18]), "DES");
            Cipher lllllllllllllllllIIllllIllIllIII = Cipher.getInstance("DES");
            lllllllllllllllllIIllllIllIllIII.init(lIIIIIIllII[3], lllllllllllllllllIIllllIllIllIIl);
            return new String(lllllllllllllllllIIllllIllIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIIllllIllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIIllllIllIlIlll) {
            lllllllllllllllllIIllllIllIlIlll.printStackTrace();
            return null;
        }
    }

    private static void ae() {
        d lllllllllllllllllIIlllllIIIIlIIl;
        Object lllllllllllllllllIIlllllIIIIlIlI;
        int[] nArray = new int[lIIIIIIllII[2]];
        nArray[aa.lIIIIIIllII[1]] = lIIIIIIllII[8];
        if (aa.llIlllIIIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIIIIIIllII[8], lIIIIIIllII[13], i.bp);
            bu.add(d2);
            0;
        }
        int[] nArray2 = new int[lIIIIIIllII[2]];
        nArray2[aa.lIIIIIIllII[1]] = lIIIIIIllII[0];
        if (aa.llIlllIIIIIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllllllllllllllllIIlllllIIIIlIlI = new d(lIIIIIIllII[0], aa.eB(), lIIIIIIllII[63]);
            bu.add((d)lllllllllllllllllIIlllllIIIIlIlI);
            0;
        }
        int[] nArray3 = new int[lIIIIIIllII[2]];
        nArray3[aa.lIIIIIIllII[1]] = lIIIIIIllII[7];
        if (aa.llIlllIIIIIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllllllllllllllllIIlllllIIIIlIlI = new d(lIIIIIIllII[7], lIIIIIIllII[3], lIIIIIIllII[5]);
            bu.add((d)lllllllllllllllllIIlllllIIIIlIlI);
            0;
        }
        if (aa.llIlllIIIIIIl(Bank.contains((Predicate)(lllllllllllllllllIIlllllIIIIlIlI = item -> item.getName().toLowerCase().contains(lIIIIIIlIll[lIIIIIIllII[77]]))) ? 1 : 0)) {
            lllllllllllllllllIIlllllIIIIlIIl = new d(lIIIIIIllII[64], lIIIIIIllII[13], lIIIIIIllII[65]);
            bu.add(lllllllllllllllllIIlllllIIIIlIIl);
            0;
        }
        int[] nArray4 = new int[lIIIIIIllII[2]];
        nArray4[aa.lIIIIIIllII[1]] = lIIIIIIllII[66];
        if (aa.llIlllIIIIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lllllllllllllllllIIlllllIIIIlIIl = new d(lIIIIIIllII[66], lIIIIIIllII[67], lIIIIIIllII[68]);
            bu.add(lllllllllllllllllIIlllllIIIIlIIl);
            0;
        }
    }

    @Override
    public int T() {
        try {
            aa.eA();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-3 >= 0) {
            return (0x12 ^ 0x58) & ~(0xEF ^ 0xA5);
        }
        return lIIIIIIllII[74];
    }

    private static int eB() {
        int n2 = lIIIIIIllII[69];
        if (aa.llIlllIIIIIII(Skills.getLevel((Skill)Skill.PRAYER), lIIIIIIllII[70]) && aa.llIlllIIIIlll(Skills.getLevel((Skill)Skill.PRAYER), lIIIIIIllII[71])) {
            return (n2 - Skills.getExperience((Skill)Skill.PRAYER)) / lIIIIIIllII[72] + lIIIIIIllII[21];
        }
        int n3 = lIIIIIIllII[73];
        return (n3 - Skills.getExperience((Skill)Skill.PRAYER)) / lIIIIIIllII[72] + lIIIIIIllII[62];
    }

    @Override
    public String U() {
        return lIIIIIIlIll[lIIIIIIllII[75]];
    }

    private static boolean llIlllIIIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    public static void eA() {
        block44: {
            TileItem lllllllllllllllllIIlllllIIIlIIII;
            block45: {
                if (aa.llIllIlllllll(bs ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lIIIIIIlIll[lIIIIIIllII[1]];
                    b.a(bu);
                    if (aa.llIlllIIIIIII(bu.size(), lIIIIIIllII[2])) {
                        System.out.println(lIIIIIIlIll[lIIIIIIllII[2]]);
                        bs = lIIIIIIllII[1];
                    }
                }
                if (!aa.llIlllIIIIIIl(bs ? 1 : 0)) break block44;
                if (aa.llIlllIIIIIIl(aa.aa() ? 1 : 0) && aa.llIlllIIIIIII(Game.getWildyLevel(), lIIIIIIllII[2])) {
                    lllllllllllllllllIIlllllIIIlIIII = BankLocation.getNearest();
                    if (aa.llIlllIIIIIlI(lllllllllllllllllIIlllllIIIlIIII) && aa.llIlllIIIIIIl(lllllllllllllllllIIlllllIIIlIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIIlIll[lIIIIIIllII[3]];
                        a.a((BankLocation)lllllllllllllllllIIlllllIIIlIIII);
                    }
                    if (aa.llIlllIIIIIlI(lllllllllllllllllIIlllllIIIlIIII) && aa.llIllIlllllll(lllllllllllllllllIIlllllIIIlIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIIlIll[lIIIIIIllII[4]];
                        if (aa.llIlllIIIIIIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIIllII[5]);
                            0;
                        }
                        if (aa.llIllIlllllll(Bank.isOpen() ? 1 : 0)) {
                            if (aa.llIlllIIIIIll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIIIIIllII[6]);
                                0;
                            }
                            if (aa.llIlllIIIIIll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIIIIIllII[3]);
                                0;
                            }
                            int[] nArray = new int[lIIIIIIllII[4]];
                            nArray[aa.lIIIIIIllII[1]] = lIIIIIIllII[7];
                            nArray[aa.lIIIIIIllII[2]] = lIIIIIIllII[0];
                            nArray[aa.lIIIIIIllII[3]] = lIIIIIIllII[8];
                            if (aa.llIlllIIIIIIl(e.b(nArray) ? 1 : 0)) {
                                aa.ae();
                                System.out.println(lIIIIIIlIll[lIIIIIIllII[6]]);
                                bs = lIIIIIIllII[2];
                                return;
                            }
                            int[] nArray2 = new int[lIIIIIIllII[4]];
                            nArray2[aa.lIIIIIIllII[1]] = lIIIIIIllII[7];
                            nArray2[aa.lIIIIIIllII[2]] = lIIIIIIllII[0];
                            nArray2[aa.lIIIIIIllII[3]] = lIIIIIIllII[8];
                            if (aa.llIllIlllllll(e.b(nArray2) ? 1 : 0)) {
                                if (aa.llIlllIIIIIIl(Equipment.contains((int[])f.aZ) ? 1 : 0)) {
                                    a.b(f.aZ, lIIIIIIllII[2]);
                                }
                                a.b(f.aU, lIIIIIIllII[2]);
                                a.a(lIIIIIIllII[9], lIIIIIIllII[10]);
                                a.b(lIIIIIIllII[0], lIIIIIIllII[11]);
                            }
                        }
                    }
                }
                if (aa.llIllIlllllll(aa.aa() ? 1 : 0)) {
                    if (aa.llIllIlllllll(Inventory.contains((int[])f.aU) ? 1 : 0) && aa.llIlllIIIIIII(Movement.getRunEnergy(), lIIIIIIllII[12])) {
                        Inventory.getFirst((int[])f.aU).interact(lIIIIIIlIll[lIIIIIIllII[13]]);
                        Time.sleepTicks((int)lIIIIIIllII[2]);
                        0;
                    }
                    if (aa.llIlllIIIIIIl(Movement.isRunEnabled() ? 1 : 0) && aa.llIlllIIIIlII(Movement.getRunEnergy(), lIIIIIIllII[14])) {
                        Movement.toggleRun();
                        Time.sleepTicks((int)lIIIIIIllII[13]);
                        0;
                    }
                    if (aa.llIlllIIIIIII(Game.getWildyLevel(), lIIIIIIllII[2])) {
                        AccBuilderTempleTrek.c = lIIIIIIlIll[lIIIIIIllII[15]];
                        if (aa.llIllIlllllll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (aa.llIlllIIIIIIl(Dialog.isOpen() ? 1 : 0) && aa.llIllIlllllll(Inventory.contains((int[])f.aZ) ? 1 : 0) && aa.llIlllIIIIlIl(Players.getLocal().getAnimation(), lIIIIIIllII[16])) {
                            Inventory.getFirst((int[])f.aZ).interact(lIIIIIIlIll[lIIIIIIllII[17]]);
                            Time.sleepTicks((int)lIIIIIIllII[3]);
                            0;
                        }
                        String[] stringArray = new String[lIIIIIIllII[3]];
                        stringArray[aa.lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[18]];
                        stringArray[aa.lIIIIIIllII[2]] = lIIIIIIlIll[lIIIIIIllII[19]];
                        g.a(stringArray);
                    }
                    if (aa.llIlllIIIIIll(Game.getWildyLevel())) {
                        TileObject lllllllllllllllllIIlllllIIIIllll;
                        int[] nArray = new int[lIIIIIIllII[2]];
                        nArray[aa.lIIIIIIllII[1]] = lIIIIIIllII[0];
                        if (aa.llIllIlllllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            if (aa.llIlllIIIIlII(Players.getLocal().getWorldLocation().distanceTo(ju), lIIIIIIllII[20])) {
                                AccBuilderTempleTrek.c = lIIIIIIlIll[lIIIIIIllII[21]];
                                TileItem tileItem = new WorldPoint[lIIIIIIllII[20]];
                                tileItem[aa.lIIIIIIllII[1]] = new WorldPoint(lIIIIIIllII[22], lIIIIIIllII[23], lIIIIIIllII[1]);
                                tileItem[aa.lIIIIIIllII[2]] = new WorldPoint(lIIIIIIllII[24], lIIIIIIllII[25], lIIIIIIllII[1]);
                                tileItem[aa.lIIIIIIllII[3]] = new WorldPoint(lIIIIIIllII[26], lIIIIIIllII[27], lIIIIIIllII[1]);
                                tileItem[aa.lIIIIIIllII[4]] = new WorldPoint(lIIIIIIllII[28], lIIIIIIllII[29], lIIIIIIllII[1]);
                                tileItem[aa.lIIIIIIllII[6]] = new WorldPoint(lIIIIIIllII[30], lIIIIIIllII[31], lIIIIIIllII[1]);
                                tileItem[aa.lIIIIIIllII[13]] = new WorldPoint(lIIIIIIllII[32], lIIIIIIllII[33], lIIIIIIllII[1]);
                                tileItem[aa.lIIIIIIllII[15]] = new WorldPoint(lIIIIIIllII[34], lIIIIIIllII[35], lIIIIIIllII[1]);
                                tileItem[aa.lIIIIIIllII[17]] = new WorldPoint(lIIIIIIllII[36], lIIIIIIllII[37], lIIIIIIllII[1]);
                                tileItem[aa.lIIIIIIllII[18]] = new WorldPoint(lIIIIIIllII[38], lIIIIIIllII[37], lIIIIIIllII[1]);
                                tileItem[aa.lIIIIIIllII[19]] = new WorldPoint(lIIIIIIllII[39], lIIIIIIllII[37], lIIIIIIllII[1]);
                                tileItem[aa.lIIIIIIllII[21]] = new WorldPoint(lIIIIIIllII[40], lIIIIIIllII[37], lIIIIIIllII[1]);
                                tileItem[aa.lIIIIIIllII[41]] = new WorldPoint(lIIIIIIllII[42], lIIIIIIllII[43], lIIIIIIllII[1]);
                                tileItem[aa.lIIIIIIllII[44]] = new WorldPoint(lIIIIIIllII[45], lIIIIIIllII[43], lIIIIIIllII[1]);
                                lllllllllllllllllIIlllllIIIlIIII = tileItem;
                                Walker.walkAlong(Arrays.asList(lllllllllllllllllIIlllllIIIlIIII), new HashMap());
                                0;
                                Time.sleepTicks((int)lIIIIIIllII[2]);
                                0;
                            }
                            if (aa.llIlllIIIIllI(Players.getLocal().getWorldLocation().distanceTo(ju), lIIIIIIllII[20])) {
                                AccBuilderTempleTrek.c = lIIIIIIlIll[lIIIIIIllII[41]];
                                String[] stringArray = new String[lIIIIIIllII[2]];
                                stringArray[aa.lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[44]];
                                lllllllllllllllllIIlllllIIIlIIII = TileObjects.getNearest((String[])stringArray);
                                String[] stringArray2 = new String[lIIIIIIllII[2]];
                                stringArray2[aa.lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[20]];
                                lllllllllllllllllIIlllllIIIIllll = TileObjects.getNearest((String[])stringArray2);
                                String[] stringArray3 = new String[lIIIIIIllII[2]];
                                stringArray3[aa.lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[46]];
                                if (aa.llIllIlllllll(lllllllllllllllllIIlllllIIIIllll.hasAction(stringArray3) ? 1 : 0)) {
                                    lllllllllllllllllIIlllllIIIIllll.interact(lIIIIIIlIll[lIIIIIIllII[47]]);
                                }
                                if (aa.llIlllIIIIIlI(lllllllllllllllllIIlllllIIIlIIII)) {
                                    String[] stringArray4 = new String[lIIIIIIllII[2]];
                                    stringArray4[aa.lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[48]];
                                    if (aa.llIlllIIIIIIl(lllllllllllllllllIIlllllIIIIllll.hasAction(stringArray4) ? 1 : 0)) {
                                        int lllllllllllllllllIIlllllIIIIlllI = Skills.getExperience((Skill)Skill.PRAYER);
                                        int[] nArray3 = new int[lIIIIIIllII[2]];
                                        nArray3[aa.lIIIIIIllII[1]] = lIIIIIIllII[0];
                                        String[] stringArray5 = new String[lIIIIIIllII[2]];
                                        stringArray5[aa.lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[49]];
                                        Inventory.getFirst((int[])nArray3).useOn(TileObjects.getNearest((String[])stringArray5));
                                        Time.sleepTicks((int)lIIIIIIllII[2]);
                                        0;
                                    }
                                }
                            }
                        }
                        int[] nArray4 = new int[lIIIIIIllII[2]];
                        nArray4[aa.lIIIIIIllII[1]] = lIIIIIIllII[0];
                        if (aa.llIlllIIIIIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[lIIIIIIllII[2]];
                            nArray5[aa.lIIIIIIllII[1]] = lIIIIIIllII[50];
                            if (aa.llIllIlllllll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                if (aa.llIlllIIIIlII(Players.getLocal().getWorldLocation().distanceTo(ju), lIIIIIIllII[20])) {
                                    AccBuilderTempleTrek.c = lIIIIIIlIll[lIIIIIIllII[51]];
                                    WorldPoint[] worldPointArray = new WorldPoint[lIIIIIIllII[20]];
                                    worldPointArray[aa.lIIIIIIllII[1]] = new WorldPoint(lIIIIIIllII[22], lIIIIIIllII[23], lIIIIIIllII[1]);
                                    worldPointArray[aa.lIIIIIIllII[2]] = new WorldPoint(lIIIIIIllII[24], lIIIIIIllII[25], lIIIIIIllII[1]);
                                    worldPointArray[aa.lIIIIIIllII[3]] = new WorldPoint(lIIIIIIllII[26], lIIIIIIllII[27], lIIIIIIllII[1]);
                                    worldPointArray[aa.lIIIIIIllII[4]] = new WorldPoint(lIIIIIIllII[28], lIIIIIIllII[29], lIIIIIIllII[1]);
                                    worldPointArray[aa.lIIIIIIllII[6]] = new WorldPoint(lIIIIIIllII[30], lIIIIIIllII[31], lIIIIIIllII[1]);
                                    worldPointArray[aa.lIIIIIIllII[13]] = new WorldPoint(lIIIIIIllII[32], lIIIIIIllII[33], lIIIIIIllII[1]);
                                    worldPointArray[aa.lIIIIIIllII[15]] = new WorldPoint(lIIIIIIllII[34], lIIIIIIllII[35], lIIIIIIllII[1]);
                                    worldPointArray[aa.lIIIIIIllII[17]] = new WorldPoint(lIIIIIIllII[36], lIIIIIIllII[37], lIIIIIIllII[1]);
                                    worldPointArray[aa.lIIIIIIllII[18]] = new WorldPoint(lIIIIIIllII[38], lIIIIIIllII[37], lIIIIIIllII[1]);
                                    worldPointArray[aa.lIIIIIIllII[19]] = new WorldPoint(lIIIIIIllII[39], lIIIIIIllII[37], lIIIIIIllII[1]);
                                    worldPointArray[aa.lIIIIIIllII[21]] = new WorldPoint(lIIIIIIllII[40], lIIIIIIllII[37], lIIIIIIllII[1]);
                                    worldPointArray[aa.lIIIIIIllII[41]] = new WorldPoint(lIIIIIIllII[42], lIIIIIIllII[43], lIIIIIIllII[1]);
                                    worldPointArray[aa.lIIIIIIllII[44]] = new WorldPoint(lIIIIIIllII[45], lIIIIIIllII[43], lIIIIIIllII[1]);
                                    lllllllllllllllllIIlllllIIIlIIII = worldPointArray;
                                    Walker.walkAlong(Arrays.asList(lllllllllllllllllIIlllllIIIlIIII), new HashMap());
                                    0;
                                    Time.sleepTicks((int)lIIIIIIllII[2]);
                                    0;
                                }
                                if (aa.llIlllIIIIllI(Players.getLocal().getWorldLocation().distanceTo(ju), lIIIIIIllII[20])) {
                                    AccBuilderTempleTrek.c = lIIIIIIlIll[lIIIIIIllII[52]];
                                    if (!aa.llIlllIIIIIIl(Dialog.canLevelUpContinue() ? 1 : 0) || aa.llIllIlllllll(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    String[] stringArray = new String[lIIIIIIllII[2]];
                                    stringArray[aa.lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[14]];
                                    lllllllllllllllllIIlllllIIIlIIII = NPCs.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[lIIIIIIllII[2]];
                                    stringArray6[aa.lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[53]];
                                    lllllllllllllllllIIlllllIIIIllll = TileObjects.getNearest((String[])stringArray6);
                                    String[] stringArray7 = new String[lIIIIIIllII[2]];
                                    stringArray7[aa.lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[54]];
                                    if (aa.llIllIlllllll(lllllllllllllllllIIlllllIIIIllll.hasAction(stringArray7) ? 1 : 0)) {
                                        lllllllllllllllllIIlllllIIIIllll.interact(lIIIIIIlIll[lIIIIIIllII[55]]);
                                    }
                                    if (aa.llIlllIIIIIlI(lllllllllllllllllIIlllllIIIlIIII)) {
                                        String[] stringArray8 = new String[lIIIIIIllII[2]];
                                        stringArray8[aa.lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[56]];
                                        if (aa.llIlllIIIIIIl(lllllllllllllllllIIlllllIIIIllll.hasAction(stringArray8) ? 1 : 0)) {
                                            List lllllllllllllllllIIlllllIIIIlllI;
                                            if (aa.llIlllIIIIIIl(Dialog.isOpen() ? 1 : 0)) {
                                                int[] nArray6 = new int[lIIIIIIllII[2]];
                                                nArray6[aa.lIIIIIIllII[1]] = lIIIIIIllII[50];
                                                Inventory.getFirst((int[])nArray6).useOn((Actor)lllllllllllllllllIIlllllIIIlIIII);
                                                Time.sleepTicks((int)lIIIIIIllII[3]);
                                                0;
                                            }
                                            if (aa.llIllIlllllll(Dialog.isOpen() ? 1 : 0) && aa.llIlllIIIIIIl((lllllllllllllllllIIlllllIIIIlllI = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                                                int lllllllllllllllllIIlllllIIIIllIl = lIIIIIIllII[1];
                                                while (aa.llIlllIIIIIII(lllllllllllllllllIIlllllIIIIllIl, lllllllllllllllllIIlllllIIIIlllI.size())) {
                                                    int[] nArray7 = new int[lIIIIIIllII[2]];
                                                    nArray7[aa.lIIIIIIllII[1]] = lIIIIIIllII[50];
                                                    if (aa.llIlllIIIIlIl(((Item)Inventory.getAll((int[])nArray7).get(lIIIIIIllII[1])).getQuantity(), lIIIIIIllII[2]) && aa.llIllIlllllll(((Widget)lllllllllllllllllIIlllllIIIIlllI.get(lllllllllllllllllIIlllllIIIIllIl)).getText().contains(lIIIIIIlIll[lIIIIIIllII[57]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lllllllllllllllllIIlllllIIIIlllI.get(lllllllllllllllllIIlllllIIIIllIl)).getClickPoint().getX(), (int)((Widget)lllllllllllllllllIIlllllIIIIlllI.get(lllllllllllllllllIIlllllIIIIllIl)).getClickPoint().getY(), (boolean)lIIIIIIllII[2]);
                                                        Time.sleepTicks((int)lIIIIIIllII[3]);
                                                        0;
                                                    }
                                                    int[] nArray8 = new int[lIIIIIIllII[2]];
                                                    nArray8[aa.lIIIIIIllII[1]] = lIIIIIIllII[50];
                                                    if (aa.llIlllIIIIlIl(((Item)Inventory.getAll((int[])nArray8).get(lIIIIIIllII[1])).getQuantity(), lIIIIIIllII[13]) && aa.llIllIlllllll(((Widget)lllllllllllllllllIIlllllIIIIlllI.get(lllllllllllllllllIIlllllIIIIllIl)).getText().contains(lIIIIIIlIll[lIIIIIIllII[58]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lllllllllllllllllIIlllllIIIIlllI.get(lllllllllllllllllIIlllllIIIIllIl)).getClickPoint().getX(), (int)((Widget)lllllllllllllllllIIlllllIIIIlllI.get(lllllllllllllllllIIlllllIIIIllIl)).getClickPoint().getY(), (boolean)lIIIIIIllII[2]);
                                                        Time.sleepTicks((int)lIIIIIIllII[3]);
                                                        0;
                                                    }
                                                    if (aa.llIllIlllllll(((Widget)lllllllllllllllllIIlllllIIIIlllI.get(lllllllllllllllllIIlllllIIIIllIl)).getText().contains(lIIIIIIlIll[lIIIIIIllII[59]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lllllllllllllllllIIlllllIIIIlllI.get(lllllllllllllllllIIlllllIIIIllIl)).getClickPoint().getX(), (int)((Widget)lllllllllllllllllIIlllllIIIIlllI.get(lllllllllllllllllIIlllllIIIIllIl)).getClickPoint().getY(), (boolean)lIIIIIIllII[2]);
                                                        Time.sleepTicks((int)lIIIIIIllII[3]);
                                                        0;
                                                    }
                                                    ++lllllllllllllllllIIlllllIIIIllIl;
                                                    0;
                                                    if (((94 + 119 - 92 + 23 ^ 39 + 122 - 146 + 145) & (140 + 118 - 152 + 70 ^ 81 + 57 - 93 + 83 ^ -1)) == 0) continue;
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
                int[] nArray = new int[lIIIIIIllII[2]];
                nArray[aa.lIIIIIIllII[1]] = lIIIIIIllII[9];
                if (!aa.llIllIlllllll(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray9 = new int[lIIIIIIllII[2]];
                nArray9[aa.lIIIIIIllII[1]] = lIIIIIIllII[0];
                if (!aa.llIlllIIIIIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) break block44;
                int[] nArray10 = new int[lIIIIIIllII[2]];
                nArray10[aa.lIIIIIIllII[1]] = lIIIIIIllII[50];
                if (!aa.llIlllIIIIIIl(Inventory.contains((int[])nArray10) ? 1 : 0)) break block44;
            }
            if (aa.llIlllIIIIllI(Players.getLocal().getWorldLocation().distanceTo(ju), lIIIIIIllII[20])) {
                AccBuilderTempleTrek.c = lIIIIIIlIll[lIIIIIIllII[60]];
                String[] stringArray = new String[lIIIIIIllII[2]];
                stringArray[aa.lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[61]];
                lllllllllllllllllIIlllllIIIlIIII = TileItems.getNearest((String[])stringArray);
                if (aa.llIlllIIIIIlI(lllllllllllllllllIIlllllIIIlIIII)) {
                    lllllllllllllllllIIlllllIIIlIIII.interact(lIIIIIIlIll[lIIIIIIllII[62]]);
                }
            }
        }
    }

    private static String llIllIllllIlI(String lllllllllllllllllIIllllIllllIIll, String lllllllllllllllllIIllllIllllIIlI) {
        lllllllllllllllllIIllllIllllIIll = new String(Base64.getDecoder().decode(lllllllllllllllllIIllllIllllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIIllllIllllIllI = new StringBuilder();
        char[] lllllllllllllllllIIllllIllllIlIl = lllllllllllllllllIIllllIllllIIlI.toCharArray();
        int lllllllllllllllllIIllllIllllIlII = lIIIIIIllII[1];
        char[] lllllllllllllllllIIllllIlllIlllI = lllllllllllllllllIIllllIllllIIll.toCharArray();
        int lllllllllllllllllIIllllIlllIllIl = lllllllllllllllllIIllllIlllIlllI.length;
        int lllllllllllllllllIIllllIlllIllII = lIIIIIIllII[1];
        while (aa.llIlllIIIIIII(lllllllllllllllllIIllllIlllIllII, lllllllllllllllllIIllllIlllIllIl)) {
            char lllllllllllllllllIIllllIlllllIIl = lllllllllllllllllIIllllIlllIlllI[lllllllllllllllllIIllllIlllIllII];
            lllllllllllllllllIIllllIllllIllI.append((char)(lllllllllllllllllIIllllIlllllIIl ^ lllllllllllllllllIIllllIllllIlIl[lllllllllllllllllIIllllIllllIlII % lllllllllllllllllIIllllIllllIlIl.length]));
            0;
            ++lllllllllllllllllIIllllIllllIlII;
            ++lllllllllllllllllIIllllIlllIllII;
            0;
            if (1 > -1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIIllllIllllIllI);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aa() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[lIIIIIIllII[2]];
                nArray[aa.lIIIIIIllII[1]] = lIIIIIIllII[9];
                if (!aa.llIllIlllllll(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIIIIIIllII[2]];
                nArray2[aa.lIIIIIIllII[1]] = lIIIIIIllII[9];
                if (!aa.llIlllIIIIlll(Inventory.getFirst((int[])nArray2).getQuantity(), lIIIIIIllII[12])) break block2;
                if (!aa.llIlllIIIIIIl(Inventory.contains((int[])f.aZ) ? 1 : 0)) break block3;
                if (!aa.llIllIlllllll(Equipment.contains((int[])f.aZ) ? 1 : 0)) break block2;
                int[] nArray3 = new int[lIIIIIIllII[2]];
                nArray3[aa.lIIIIIIllII[1]] = lIIIIIIllII[0];
                if (!aa.llIlllIIIIIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[lIIIIIIllII[2]];
                nArray4[aa.lIIIIIIllII[1]] = lIIIIIIllII[50];
                if (!aa.llIllIlllllll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block2;
            }
            n2 = lIIIIIIllII[2];
            0;
            if (1 > 0) return n2 != 0;
            return ((129 + 157 - 190 + 98 ^ 121 + 123 - 200 + 153) & (0xFD ^ 0x83 ^ (0xF8 ^ 0x81) ^ -1)) != 0;
        }
        n2 = lIIIIIIllII[1];
        return n2 != 0;
    }
}

