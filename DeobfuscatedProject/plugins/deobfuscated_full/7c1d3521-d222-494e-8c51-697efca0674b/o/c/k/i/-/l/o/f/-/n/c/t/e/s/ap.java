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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;

public class ap
implements ac {
    private static /* synthetic */ int[] llIIIIlIlI;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ String[] llIIIIlIIl;
    static final /* synthetic */ WorldPoint nD;
    private final /* synthetic */ int nG = 536;
    static final /* synthetic */ WorldPoint nF;
    public static final /* synthetic */ WorldPoint nC;
    public static final /* synthetic */ WorldPoint nB;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ WorldPoint nA;
    static final /* synthetic */ WorldPoint nE;
    public static final /* synthetic */ WorldPoint nz;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[llIIIIlIlI[2]];
                nArray[ap.llIIIIlIlI[1]] = llIIIIlIlI[10];
                if (!ap.lIlIIlIIIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[llIIIIlIlI[2]];
                nArray2[ap.llIIIIlIlI[1]] = llIIIIlIlI[10];
                if (!ap.lIlIIlIIIlIII(Inventory.getFirst((int[])nArray2).getQuantity(), llIIIIlIlI[13])) break block2;
                if (!ap.lIlIIlIIIIIlI(Inventory.contains((int[])f.bf) ? 1 : 0)) break block3;
                if (!ap.lIlIIlIIIIIII(Equipment.contains((int[])f.bf) ? 1 : 0)) break block2;
                int[] nArray3 = new int[llIIIIlIlI[2]];
                nArray3[ap.llIIIIlIlI[1]] = llIIIIlIlI[0];
                if (!ap.lIlIIlIIIIIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[llIIIIlIlI[2]];
                nArray4[ap.llIIIIlIlI[1]] = llIIIIlIlI[51];
                if (!ap.lIlIIlIIIIIII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block2;
            }
            n2 = llIIIIlIlI[2];
            0;
            if (2 > 1) return n2 != 0;
            return false;
        }
        n2 = llIIIIlIlI[1];
        return n2 != 0;
    }

    private static void lIlIIIllllllI() {
        llIIIIlIIl = new String[llIIIIlIlI[86]];
        ap.llIIIIlIIl[ap.llIIIIlIlI[1]] = ap."Buying items";
        ap.llIIIIlIIl[ap.llIIIIlIlI[2]] = ap."Finished buying items, switching back to prayer";
        ap.llIIIIlIIl[ap.llIIIIlIlI[4]] = ap."Navigating to bank";
        ap.llIIIIlIIl[ap.llIIIIlIlI[5]] = ap."Handling banking";
        ap.llIIIIlIIl[ap.llIIIIlIlI[7]] = ap."We are missing prayer supplies, switching to BUYING";
        ap.llIIIIlIIl[ap.llIIIIlIlI[14]] = ap."Drink";
        ap.llIIIIlIIl[ap.llIIIIlIlI[16]] = ap."Tele to wildy";
        ap.llIIIIlIIl[ap.llIIIIlIlI[18]] = ap."Rub";
        ap.llIIIIlIIl[ap.llIIIIlIlI[19]] = ap."Lava Maze";
        ap.llIIIIlIIl[ap.llIIIIlIlI[20]] = ap."Okay, teleport to level 41 Wilderness.";
        ap.llIIIIlIIl[ap.llIIIIlIlI[22]] = ap."Nav to altar";
        ap.llIIIIlIIl[ap.llIIIIlIlI[42]] = ap."1 tick pray";
        ap.llIIIIlIIl[ap.llIIIIlIlI[45]] = ap."Chaos altar";
        ap.llIIIIlIIl[ap.llIIIIlIlI[21]] = ap."Large door";
        ap.llIIIIlIIl[ap.llIIIIlIlI[47]] = ap."Open";
        ap.llIIIIlIIl[ap.llIIIIlIlI[48]] = ap."Open";
        ap.llIIIIlIIl[ap.llIIIIlIlI[49]] = ap."Open";
        ap.llIIIIlIIl[ap.llIIIIlIlI[50]] = ap."Chaos altar";
        ap.llIIIIlIIl[ap.llIIIIlIlI[52]] = ap."Nav to altar";
        ap.llIIIIlIIl[ap.llIIIIlIlI[53]] = ap."Unnoting bones";
        ap.llIIIIlIIl[ap.llIIIIlIlI[15]] = ap."Elder Chaos druid";
        ap.llIIIIlIIl[ap.llIIIIlIlI[54]] = ap."Large door";
        ap.llIIIIlIIl[ap.llIIIIlIlI[55]] = ap."Open";
        ap.llIIIIlIIl[ap.llIIIIlIlI[56]] = ap."Open";
        ap.llIIIIlIIl[ap.llIIIIlIlI[57]] = ap."Open";
        ap.llIIIIlIIl[ap.llIIIIlIlI[58]] = ap."Exchange";
        ap.llIIIIlIIl[ap.llIIIIlIlI[59]] = ap."Exchange 5";
        ap.llIIIIlIIl[ap.llIIIIlIlI[60]] = ap."Exchange All";
        ap.llIIIIlIIl[ap.llIIIIlIlI[61]] = ap."Suiciding";
        ap.llIIIIlIIl[ap.llIIIIlIlI[62]] = ap."Wine of zamorak";
        ap.llIIIIlIIl[ap.llIIIIlIlI[63]] = ap."Take";
        ap.llIIIIlIIl[ap.llIIIIlIlI[75]] = ap."Prayer training";
        ap.llIIIIlIIl[ap.llIIIIlIlI[76]] = ap."ring of wealth (";
    }

    private static boolean lIlIIlIIIlIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIlIIIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIlIIIIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIIIlllllII(String var10, String var18) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var24 = Cipher.getInstance("Blowfish");
            var24.init(llIIIIlIlI[4], var5);
            return new String(var24.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIIIlll(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public String ag() {
        return llIIIIlIIl[llIIIIlIlI[75]];
    }

    private static void lIlIIIlllllll() {
        llIIIIlIlI = new int[87];
        ap.llIIIIlIlI[0] = 0xFFFF8E19 & 0x73FE;
        ap.llIIIIlIlI[1] = (0xD2 ^ 0xC2 ^ (0x9F ^ 0xB5)) & (71 + 58 - -48 + 13 ^ 90 + 49 - 45 + 38 ^ -1);
        ap.llIIIIlIlI[2] = 1;
        ap.llIIIIlIlI[3] = 0xBB ^ 0xA0 ^ (0x6F ^ 0x59);
        ap.llIIIIlIlI[4] = 2;
        ap.llIIIIlIlI[5] = 3;
        ap.llIIIIlIlI[6] = -(0xFFFFF9FD & 0x6E57) & (0xFFFFFBFF & 0x7FDC);
        ap.llIIIIlIlI[7] = 0xA6 ^ 0xA2;
        ap.llIIIIlIlI[8] = 0xFFFFDAEF & 0x77BE;
        ap.llIIIIlIlI[9] = -(0xFFFFDA9F & 0x2F6D) & (0xFFFFFB7D & 0x3FDF);
        ap.llIIIIlIlI[10] = 0xFFFFEBE3 & 0x17FF;
        ap.llIIIIlIlI[11] = -(0xFFFFF6CF & 0x5FBA) & (0xFFFFFFEF & 0x7F9D);
        ap.llIIIIlIlI[12] = 64 + 55 - 10 + 68 + (0xA0 ^ 0xAF) - (0xC5 ^ 0xAC) + (0x7B ^ 0xA);
        ap.llIIIIlIlI[13] = 4 ^ 0x36;
        ap.llIIIIlIlI[14] = 0xA5 ^ 0xA0;
        ap.llIIIIlIlI[15] = 0x74 ^ 2 ^ (0x4D ^ 0x2F);
        ap.llIIIIlIlI[16] = 0xB4 ^ 0xB2;
        ap.llIIIIlIlI[17] = -1;
        ap.llIIIIlIlI[18] = 0x9A ^ 0x9D;
        ap.llIIIIlIlI[19] = 0xAA ^ 0xA2;
        ap.llIIIIlIlI[20] = 0x1A ^ 0x13;
        ap.llIIIIlIlI[21] = 79 + 91 - 69 + 83 ^ 132 + 175 - 242 + 116;
        ap.llIIIIlIlI[22] = 0x36 ^ 0x33 ^ (0x6B ^ 0x64);
        ap.llIIIIlIlI[23] = -(0xFFFFE5E3 & 0x5E3F) & (0xFFFFCFFF & 0x7FF6);
        ap.llIIIIlIlI[24] = 0xFFFF9F1A & 0x6FE7;
        ap.llIIIIlIlI[25] = -(0xFFFFFDE3 & 0x523E) & (0xFFFFFFFB & 0x5BF7);
        ap.llIIIIlIlI[26] = -(0x59 ^ 0x5C) & (0xFFFFFEFF & 0xFFF);
        ap.llIIIIlIlI[27] = 0xFFFFDFEF & 0x2BDB;
        ap.llIIIIlIlI[28] = -(0x4C ^ 0x49) & (0xFFFFAFFD & 0x5EFE);
        ap.llIIIIlIlI[29] = -(0xFFFFE51B & 0x5EF5) & (0xFFFFFFD7 & 0x4FFF);
        ap.llIIIIlIlI[30] = -(0xFFFFFF77 & 0x718B) & (0xFFFFFFF7 & Short.MAX_VALUE);
        ap.llIIIIlIlI[31] = 0xFFFFABCE & 0x5FF3;
        ap.llIIIIlIlI[32] = -(0xFFFFD00F & 0x3FFD) & (0xFFFFDEFF & 0x3FFD);
        ap.llIIIIlIlI[33] = 0xFFFFEFBF & 0x1BFD;
        ap.llIIIIlIlI[34] = 0xFFFFDEEF & 0x2FFE;
        ap.llIIIIlIlI[35] = 0xFFFFEBBF & 0x1FF7;
        ap.llIIIIlIlI[36] = 0xFFFFFFEA & 0xEFF;
        ap.llIIIIlIlI[37] = 0xFFFFABEF & 0x5FBF;
        ap.llIIIIlIlI[38] = -(0xFFFFF5FD & 0x1A17) & (0xFFFFDFFF & 0x3EFF);
        ap.llIIIIlIlI[39] = -(0x4B ^ 0x42) & (0xFFFFAFAF & 0x5BFF);
        ap.llIIIIlIlI[40] = -(0xFFFFD466 & 0x2FB9) & (0xFFFF8FFF & 0x7FBF);
        ap.llIIIIlIlI[41] = 0xFFFFDFBA & 0x2BDF;
        ap.llIIIIlIlI[42] = 0x6A ^ 0x61;
        ap.llIIIIlIlI[43] = -(0xFFFFFD25 & 0x36FB) & (0xFFFFBFFB & 0x7FB7);
        ap.llIIIIlIlI[44] = 0xFFFF9FEC & 0x6EFF;
        ap.llIIIIlIlI[45] = 0x14 ^ 0x18;
        ap.llIIIIlIlI[46] = 0xFFFF9FBF & 0x6BCF;
        ap.llIIIIlIlI[47] = 37 + 128 - 97 + 70 ^ 131 + 93 - 150 + 58;
        ap.llIIIIlIlI[48] = 1 ^ (0xA1 ^ 0xAF);
        ap.llIIIIlIlI[49] = 0xAB ^ 0xB9 ^ 2;
        ap.llIIIIlIlI[50] = 0x8B ^ 0x97 ^ (0x6B ^ 0x66);
        ap.llIIIIlIlI[51] = -(0xFFFFDDE3 & 0x6EBD) & (0xFFFFCEFD & 0x7FBB);
        ap.llIIIIlIlI[52] = 143 + 58 - 84 + 42 ^ 75 + 38 - -14 + 14;
        ap.llIIIIlIlI[53] = 0x12 ^ 1;
        ap.llIIIIlIlI[54] = 0xA2 ^ 0xB7;
        ap.llIIIIlIlI[55] = 0xB4 ^ 0xA2;
        ap.llIIIIlIlI[56] = 0x5F ^ 0x48;
        ap.llIIIIlIlI[57] = 0x18 ^ 0;
        ap.llIIIIlIlI[58] = 9 ^ 0x10;
        ap.llIIIIlIlI[59] = 0xB5 ^ 0xAF;
        ap.llIIIIlIlI[60] = 0x7B ^ 0x60;
        ap.llIIIIlIlI[61] = 0x46 ^ 0x41 ^ (0x14 ^ 0xF);
        ap.llIIIIlIlI[62] = 105 + 163 - 112 + 16 ^ 139 + 100 - 65 + 3;
        ap.llIIIIlIlI[63] = 0xB5 ^ 0xAB;
        ap.llIIIIlIlI[64] = 0xFFFFEAF1 & 0x1FFE;
        ap.llIIIIlIlI[65] = 0xFFFFAECE & 0x7FFD;
        ap.llIIIIlIlI[66] = 0xFFFFFBAD & 0x65FA;
        ap.llIIIIlIlI[67] = 0xFFFFFFD7 & 0x1F6F;
        ap.llIIIIlIlI[68] = 0x5D ^ 0x75;
        ap.llIIIIlIlI[69] = -(0xFFFFEF1B & 0x1CF7) & (0xFFFFEFF6 & 0x1F9F);
        ap.llIIIIlIlI[70] = 0xFFFFEDDF & 0x43F6E;
        ap.llIIIIlIlI[71] = 9 ^ 0x35;
        ap.llIIIIlIlI[72] = -(0xFFFF95B9 & 0x7E7F) & (0xFFFF9DFF & 0x77FA);
        ap.llIIIIlIlI[73] = -(0xFFFFE5DF & 0x1F37) & (0xFFFFF5FF & 0xFF5E);
        ap.llIIIIlIlI[74] = 0x39 ^ 0x5D;
        ap.llIIIIlIlI[75] = 0x7E ^ 0x16 ^ (0xB5 ^ 0xC2);
        ap.llIIIIlIlI[76] = 0x28 ^ 8;
        ap.llIIIIlIlI[77] = -(0xFFFFD46B & 0x3BB5) & (0xFFFFBFFD & 0x5BF7);
        ap.llIIIIlIlI[78] = -(0x71 ^ 0x10) & (0xFFFFCF64 & 0x3FFF);
        ap.llIIIIlIlI[79] = -(0xFFFF8607 & 0x7DF9) & (0xFFFFEFFF & 0x1FB2);
        ap.llIIIIlIlI[80] = -(0xFFFFD337 & 0x3CCD) & (0xFFFFBEFD & 0x5FEF);
        ap.llIIIIlIlI[81] = -(0xFFFFF6BD & 0x5953) & (0xFFFFFBBF & 0x5FD6);
        ap.llIIIIlIlI[82] = -(0x4C ^ 0x5D) & (0xFFFFAEFF & 0x5FFD);
        ap.llIIIIlIlI[83] = 0xFFFF9BD4 & 0x6FAF;
        ap.llIIIIlIlI[84] = -(0xFFFFF3AB & 0x5EDE) & (0xFFFFDFFF & 0x7E9F);
        ap.llIIIIlIlI[85] = 0xFFFFDFBF & 0x2DE3;
        ap.llIIIIlIlI[86] = 0xF ^ 0x42 ^ (0x70 ^ 0x1C);
    }

    private static int fZ() {
        int n2 = llIIIIlIlI[70];
        if (ap.lIlIIlIIIIIIl(Skills.getLevel((Skill)Skill.PRAYER), llIIIIlIlI[71]) && ap.lIlIIlIIIlIII(Skills.getLevel((Skill)Skill.PRAYER), llIIIIlIlI[3])) {
            return (n2 - Skills.getExperience((Skill)Skill.PRAYER)) / llIIIIlIlI[72] + llIIIIlIlI[22];
        }
        int n3 = llIIIIlIlI[73];
        return (n3 - Skills.getExperience((Skill)Skill.PRAYER)) / llIIIIlIlI[72] + llIIIIlIlI[63];
    }

    static {
        ap.lIlIIIlllllll();
        ap.lIlIIIllllllI();
        nz = new WorldPoint(llIIIIlIlI[77], llIIIIlIlI[78], llIIIIlIlI[1]);
        nA = new WorldPoint(llIIIIlIlI[79], llIIIIlIlI[80], llIIIIlIlI[1]);
        nB = new WorldPoint(llIIIIlIlI[81], llIIIIlIlI[82], llIIIIlIlI[1]);
        nC = new WorldPoint(llIIIIlIlI[83], llIIIIlIlI[44], llIIIIlIlI[1]);
        nD = new WorldPoint(llIIIIlIlI[1], llIIIIlIlI[1], llIIIIlIlI[1]);
        nE = new WorldPoint(llIIIIlIlI[1], llIIIIlIlI[1], llIIIIlIlI[1]);
        nF = new WorldPoint(llIIIIlIlI[84], llIIIIlIlI[85], llIIIIlIlI[1]);
        bv = new ArrayList<d>();
    }

    private static boolean lIlIIlIIIIIll(Object object) {
        return object != null;
    }

    private static String lIlIIIllllIll(String var22, String var1) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var21 = var1.toCharArray();
        int var17 = llIIIIlIlI[1];
        char[] var12 = var22.toCharArray();
        int var2 = var12.length;
        int var3 = llIIIIlIlI[1];
        while (ap.lIlIIlIIIIIIl(var3, var2)) {
            char var19 = var12[var3];
            var9.append((char)(var19 ^ var21[var17 % var21.length]));
            0;
            ++var17;
            ++var3;
            0;
            if (((0xB8 ^ 0xA7) & ~(0x7D ^ 0x62)) < 2) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    public ap() {
        this.nG = llIIIIlIlI[0];
    }

    private static boolean lIlIIlIIIIIII(int n2) {
        return n2 != 0;
    }

    @Override
    public int af() {
        try {
            ap.fY();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((3 & (3 ^ -1)) != 0) {
            return (0x98 ^ 0xAA ^ (0xAD ^ 0xBD)) & (147 + 90 - 181 + 111 ^ 23 + 68 - -20 + 22 ^ -1);
        }
        return llIIIIlIlI[74];
    }

    public static void fY() {
        block44: {
            TileItem var15;
            block45: {
                if (ap.lIlIIlIIIIIII(bt ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[1]];
                    b.a(bv);
                    if (ap.lIlIIlIIIIIIl(bv.size(), llIIIIlIlI[2])) {
                        System.out.println(llIIIIlIIl[llIIIIlIlI[2]]);
                        bt = llIIIIlIlI[1];
                    }
                }
                if (!ap.lIlIIlIIIIIlI(bt ? 1 : 0) || !ap.lIlIIlIIIIIIl(Skills.getLevel((Skill)Skill.PRAYER), llIIIIlIlI[3])) break block44;
                if (ap.lIlIIlIIIIIlI(ap.an() ? 1 : 0) && ap.lIlIIlIIIIIIl(Game.getWildyLevel(), llIIIIlIlI[2])) {
                    var15 = BankLocation.getNearest();
                    if (ap.lIlIIlIIIIIll(var15) && ap.lIlIIlIIIIIlI(var15.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[4]];
                        a.a((BankLocation)var15);
                    }
                    if (ap.lIlIIlIIIIIll(var15) && ap.lIlIIlIIIIIII(var15.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[5]];
                        if (ap.lIlIIlIIIIIlI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIIlIlI[6]);
                            0;
                        }
                        if (ap.lIlIIlIIIIIII(Bank.isOpen() ? 1 : 0)) {
                            if (ap.lIlIIlIIIIlII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIIIIlIlI[7]);
                                0;
                            }
                            if (ap.lIlIIlIIIIlII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llIIIIlIlI[4]);
                                0;
                            }
                            int[] nArray = new int[llIIIIlIlI[5]];
                            nArray[ap.llIIIIlIlI[1]] = llIIIIlIlI[8];
                            nArray[ap.llIIIIlIlI[2]] = llIIIIlIlI[0];
                            nArray[ap.llIIIIlIlI[4]] = llIIIIlIlI[9];
                            if (ap.lIlIIlIIIIIlI(e.c(nArray) ? 1 : 0)) {
                                ap.Q();
                                System.out.println(llIIIIlIIl[llIIIIlIlI[7]]);
                                bt = llIIIIlIlI[2];
                                return;
                            }
                            int[] nArray2 = new int[llIIIIlIlI[5]];
                            nArray2[ap.llIIIIlIlI[1]] = llIIIIlIlI[8];
                            nArray2[ap.llIIIIlIlI[2]] = llIIIIlIlI[0];
                            nArray2[ap.llIIIIlIlI[4]] = llIIIIlIlI[9];
                            if (ap.lIlIIlIIIIIII(e.c(nArray2) ? 1 : 0)) {
                                if (ap.lIlIIlIIIIIlI(Equipment.contains((int[])f.bf) ? 1 : 0)) {
                                    a.b(f.bf, llIIIIlIlI[2]);
                                }
                                a.b(f.ba, llIIIIlIlI[2]);
                                a.a(llIIIIlIlI[10], llIIIIlIlI[11]);
                                a.b(llIIIIlIlI[0], llIIIIlIlI[12]);
                            }
                        }
                    }
                }
                if (ap.lIlIIlIIIIIII(ap.an() ? 1 : 0)) {
                    if (ap.lIlIIlIIIIIII(Inventory.contains((int[])f.ba) ? 1 : 0) && ap.lIlIIlIIIIIIl(Movement.getRunEnergy(), llIIIIlIlI[13])) {
                        Inventory.getFirst((int[])f.ba).interact(llIIIIlIIl[llIIIIlIlI[14]]);
                        Time.sleepTicks((int)llIIIIlIlI[2]);
                        0;
                    }
                    if (ap.lIlIIlIIIIIlI(Movement.isRunEnabled() ? 1 : 0) && ap.lIlIIlIIIIlIl(Movement.getRunEnergy(), llIIIIlIlI[15])) {
                        Movement.toggleRun();
                        Time.sleepTicks((int)llIIIIlIlI[14]);
                        0;
                    }
                    if (ap.lIlIIlIIIIIIl(Game.getWildyLevel(), llIIIIlIlI[2])) {
                        AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[16]];
                        if (ap.lIlIIlIIIIIII(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (ap.lIlIIlIIIIIlI(Dialog.isOpen() ? 1 : 0) && ap.lIlIIlIIIIIII(Inventory.contains((int[])f.bf) ? 1 : 0) && ap.lIlIIlIIIIllI(Players.getLocal().getAnimation(), llIIIIlIlI[17])) {
                            Inventory.getFirst((int[])f.bf).interact(llIIIIlIIl[llIIIIlIlI[18]]);
                            Time.sleepTicks((int)llIIIIlIlI[4]);
                            0;
                        }
                        String[] stringArray = new String[llIIIIlIlI[4]];
                        stringArray[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[19]];
                        stringArray[ap.llIIIIlIlI[2]] = llIIIIlIIl[llIIIIlIlI[20]];
                        g.a(stringArray);
                    }
                    if (ap.lIlIIlIIIIlII(Game.getWildyLevel())) {
                        TileObject var6;
                        int[] nArray = new int[llIIIIlIlI[2]];
                        nArray[ap.llIIIIlIlI[1]] = llIIIIlIlI[0];
                        if (ap.lIlIIlIIIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            if (ap.lIlIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(nB), llIIIIlIlI[21])) {
                                AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[22]];
                                TileItem tileItem = new WorldPoint[llIIIIlIlI[21]];
                                tileItem[ap.llIIIIlIlI[1]] = new WorldPoint(llIIIIlIlI[23], llIIIIlIlI[24], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[2]] = new WorldPoint(llIIIIlIlI[25], llIIIIlIlI[26], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[4]] = new WorldPoint(llIIIIlIlI[27], llIIIIlIlI[28], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[5]] = new WorldPoint(llIIIIlIlI[29], llIIIIlIlI[30], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[7]] = new WorldPoint(llIIIIlIlI[31], llIIIIlIlI[32], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[14]] = new WorldPoint(llIIIIlIlI[33], llIIIIlIlI[34], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[16]] = new WorldPoint(llIIIIlIlI[35], llIIIIlIlI[36], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[18]] = new WorldPoint(llIIIIlIlI[37], llIIIIlIlI[38], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[19]] = new WorldPoint(llIIIIlIlI[39], llIIIIlIlI[38], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[20]] = new WorldPoint(llIIIIlIlI[40], llIIIIlIlI[38], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[22]] = new WorldPoint(llIIIIlIlI[41], llIIIIlIlI[38], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[42]] = new WorldPoint(llIIIIlIlI[43], llIIIIlIlI[44], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[45]] = new WorldPoint(llIIIIlIlI[46], llIIIIlIlI[44], llIIIIlIlI[1]);
                                var15 = tileItem;
                                Walker.walkAlong(Arrays.asList(var15), new HashMap());
                                0;
                                Time.sleepTicks((int)llIIIIlIlI[2]);
                                0;
                            }
                            if (ap.lIlIIlIIIIlll(Players.getLocal().getWorldLocation().distanceTo(nB), llIIIIlIlI[21])) {
                                AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[42]];
                                String[] stringArray = new String[llIIIIlIlI[2]];
                                stringArray[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[45]];
                                var15 = TileObjects.getNearest((String[])stringArray);
                                String[] stringArray2 = new String[llIIIIlIlI[2]];
                                stringArray2[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[21]];
                                var6 = TileObjects.getNearest((String[])stringArray2);
                                String[] stringArray3 = new String[llIIIIlIlI[2]];
                                stringArray3[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[47]];
                                if (ap.lIlIIlIIIIIII(var6.hasAction(stringArray3) ? 1 : 0)) {
                                    var6.interact(llIIIIlIIl[llIIIIlIlI[48]]);
                                }
                                if (ap.lIlIIlIIIIIll(var15)) {
                                    String[] stringArray4 = new String[llIIIIlIlI[2]];
                                    stringArray4[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[49]];
                                    if (ap.lIlIIlIIIIIlI(var6.hasAction(stringArray4) ? 1 : 0)) {
                                        int var14 = Skills.getExperience((Skill)Skill.PRAYER);
                                        int[] nArray3 = new int[llIIIIlIlI[2]];
                                        nArray3[ap.llIIIIlIlI[1]] = llIIIIlIlI[0];
                                        String[] stringArray5 = new String[llIIIIlIlI[2]];
                                        stringArray5[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[50]];
                                        Inventory.getFirst((int[])nArray3).useOn(TileObjects.getNearest((String[])stringArray5));
                                        Time.sleepTicks((int)llIIIIlIlI[2]);
                                        0;
                                    }
                                }
                            }
                        }
                        int[] nArray4 = new int[llIIIIlIlI[2]];
                        nArray4[ap.llIIIIlIlI[1]] = llIIIIlIlI[0];
                        if (ap.lIlIIlIIIIIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[llIIIIlIlI[2]];
                            nArray5[ap.llIIIIlIlI[1]] = llIIIIlIlI[51];
                            if (ap.lIlIIlIIIIIII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                if (ap.lIlIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(nB), llIIIIlIlI[21])) {
                                    AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[52]];
                                    WorldPoint[] worldPointArray = new WorldPoint[llIIIIlIlI[21]];
                                    worldPointArray[ap.llIIIIlIlI[1]] = new WorldPoint(llIIIIlIlI[23], llIIIIlIlI[24], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[2]] = new WorldPoint(llIIIIlIlI[25], llIIIIlIlI[26], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[4]] = new WorldPoint(llIIIIlIlI[27], llIIIIlIlI[28], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[5]] = new WorldPoint(llIIIIlIlI[29], llIIIIlIlI[30], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[7]] = new WorldPoint(llIIIIlIlI[31], llIIIIlIlI[32], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[14]] = new WorldPoint(llIIIIlIlI[33], llIIIIlIlI[34], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[16]] = new WorldPoint(llIIIIlIlI[35], llIIIIlIlI[36], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[18]] = new WorldPoint(llIIIIlIlI[37], llIIIIlIlI[38], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[19]] = new WorldPoint(llIIIIlIlI[39], llIIIIlIlI[38], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[20]] = new WorldPoint(llIIIIlIlI[40], llIIIIlIlI[38], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[22]] = new WorldPoint(llIIIIlIlI[41], llIIIIlIlI[38], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[42]] = new WorldPoint(llIIIIlIlI[43], llIIIIlIlI[44], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[45]] = new WorldPoint(llIIIIlIlI[46], llIIIIlIlI[44], llIIIIlIlI[1]);
                                    var15 = worldPointArray;
                                    Walker.walkAlong(Arrays.asList(var15), new HashMap());
                                    0;
                                    Time.sleepTicks((int)llIIIIlIlI[2]);
                                    0;
                                }
                                if (ap.lIlIIlIIIIlll(Players.getLocal().getWorldLocation().distanceTo(nB), llIIIIlIlI[21])) {
                                    AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[53]];
                                    if (!ap.lIlIIlIIIIIlI(Dialog.canLevelUpContinue() ? 1 : 0) || ap.lIlIIlIIIIIII(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    String[] stringArray = new String[llIIIIlIlI[2]];
                                    stringArray[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[15]];
                                    var15 = NPCs.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[llIIIIlIlI[2]];
                                    stringArray6[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[54]];
                                    var6 = TileObjects.getNearest((String[])stringArray6);
                                    String[] stringArray7 = new String[llIIIIlIlI[2]];
                                    stringArray7[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[55]];
                                    if (ap.lIlIIlIIIIIII(var6.hasAction(stringArray7) ? 1 : 0)) {
                                        var6.interact(llIIIIlIIl[llIIIIlIlI[56]]);
                                    }
                                    if (ap.lIlIIlIIIIIll(var15)) {
                                        String[] stringArray8 = new String[llIIIIlIlI[2]];
                                        stringArray8[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[57]];
                                        if (ap.lIlIIlIIIIIlI(var6.hasAction(stringArray8) ? 1 : 0)) {
                                            List var14;
                                            if (ap.lIlIIlIIIIIlI(Dialog.isOpen() ? 1 : 0)) {
                                                int[] nArray6 = new int[llIIIIlIlI[2]];
                                                nArray6[ap.llIIIIlIlI[1]] = llIIIIlIlI[51];
                                                Inventory.getFirst((int[])nArray6).useOn((Actor)var15);
                                                Time.sleepTicks((int)llIIIIlIlI[4]);
                                                0;
                                            }
                                            if (ap.lIlIIlIIIIIII(Dialog.isOpen() ? 1 : 0) && ap.lIlIIlIIIIIlI((var14 = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                                                int var25 = llIIIIlIlI[1];
                                                while (ap.lIlIIlIIIIIIl(var25, var14.size())) {
                                                    int[] nArray7 = new int[llIIIIlIlI[2]];
                                                    nArray7[ap.llIIIIlIlI[1]] = llIIIIlIlI[51];
                                                    if (ap.lIlIIlIIIIllI(((Item)Inventory.getAll((int[])nArray7).get(llIIIIlIlI[1])).getQuantity(), llIIIIlIlI[2]) && ap.lIlIIlIIIIIII(((Widget)var14.get(var25)).getText().contains(llIIIIlIIl[llIIIIlIlI[58]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)var14.get(var25)).getClickPoint().getX(), (int)((Widget)var14.get(var25)).getClickPoint().getY(), (boolean)llIIIIlIlI[2]);
                                                        Time.sleepTicks((int)llIIIIlIlI[4]);
                                                        0;
                                                    }
                                                    int[] nArray8 = new int[llIIIIlIlI[2]];
                                                    nArray8[ap.llIIIIlIlI[1]] = llIIIIlIlI[51];
                                                    if (ap.lIlIIlIIIIllI(((Item)Inventory.getAll((int[])nArray8).get(llIIIIlIlI[1])).getQuantity(), llIIIIlIlI[14]) && ap.lIlIIlIIIIIII(((Widget)var14.get(var25)).getText().contains(llIIIIlIIl[llIIIIlIlI[59]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)var14.get(var25)).getClickPoint().getX(), (int)((Widget)var14.get(var25)).getClickPoint().getY(), (boolean)llIIIIlIlI[2]);
                                                        Time.sleepTicks((int)llIIIIlIlI[4]);
                                                        0;
                                                    }
                                                    if (ap.lIlIIlIIIIIII(((Widget)var14.get(var25)).getText().contains(llIIIIlIIl[llIIIIlIlI[60]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)var14.get(var25)).getClickPoint().getX(), (int)((Widget)var14.get(var25)).getClickPoint().getY(), (boolean)llIIIIlIlI[2]);
                                                        Time.sleepTicks((int)llIIIIlIlI[4]);
                                                        0;
                                                    }
                                                    ++var25;
                                                    0;
                                                    if (3 != 0) continue;
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                    e.t();
                                }
                            }
                        }
                    }
                }
                int[] nArray = new int[llIIIIlIlI[2]];
                nArray[ap.llIIIIlIlI[1]] = llIIIIlIlI[10];
                if (!ap.lIlIIlIIIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray9 = new int[llIIIIlIlI[2]];
                nArray9[ap.llIIIIlIlI[1]] = llIIIIlIlI[0];
                if (!ap.lIlIIlIIIIIlI(Inventory.contains((int[])nArray9) ? 1 : 0)) break block44;
                int[] nArray10 = new int[llIIIIlIlI[2]];
                nArray10[ap.llIIIIlIlI[1]] = llIIIIlIlI[51];
                if (!ap.lIlIIlIIIIIlI(Inventory.contains((int[])nArray10) ? 1 : 0)) break block44;
            }
            if (ap.lIlIIlIIIIlll(Players.getLocal().getWorldLocation().distanceTo(nB), llIIIIlIlI[21])) {
                AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[61]];
                String[] stringArray = new String[llIIIIlIlI[2]];
                stringArray[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[62]];
                var15 = TileItems.getNearest((String[])stringArray);
                if (ap.lIlIIlIIIIIll(var15)) {
                    var15.interact(llIIIIlIIl[llIIIIlIlI[63]]);
                }
            }
        }
    }

    private static String lIlIIIlllllIl(String var11, String var4) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), llIIIIlIlI[19]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(llIIIIlIlI[4], var8);
            return new String(var7.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIIIIlI(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (ap.lIlIIlIIIlIII(Skills.getLevel((Skill)Skill.PRAYER), llIIIIlIlI[3])) {
            bl = llIIIIlIlI[2];
            0;
            if (1 == 0) {
                return ((0xBB ^ 0xA8 ^ (0xB4 ^ 0x98)) & (62 + 122 - 21 + 18 ^ 97 + 111 - 164 + 94 ^ -1)) != 0;
            }
        } else {
            bl = llIIIIlIlI[1];
        }
        return bl;
    }

    private static boolean lIlIIlIIIIlII(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean ae() {
        return llIIIIlIlI[1];
    }

    private static boolean lIlIIlIIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void Q() {
        d var23;
        Object var20;
        int[] nArray = new int[llIIIIlIlI[2]];
        nArray[ap.llIIIIlIlI[1]] = llIIIIlIlI[9];
        if (ap.lIlIIlIIIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llIIIIlIlI[9], llIIIIlIlI[14], j.cf);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[llIIIIlIlI[2]];
        nArray2[ap.llIIIIlIlI[1]] = llIIIIlIlI[0];
        if (ap.lIlIIlIIIIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var20 = new d(llIIIIlIlI[0], ap.fZ(), llIIIIlIlI[64]);
            bv.add((d)var20);
            0;
        }
        int[] nArray3 = new int[llIIIIlIlI[2]];
        nArray3[ap.llIIIIlIlI[1]] = llIIIIlIlI[8];
        if (ap.lIlIIlIIIIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var20 = new d(llIIIIlIlI[8], llIIIIlIlI[4], llIIIIlIlI[6]);
            bv.add((d)var20);
            0;
        }
        if (ap.lIlIIlIIIIIlI(Bank.contains((Predicate)(var20 = item -> item.getName().toLowerCase().contains(llIIIIlIIl[llIIIIlIlI[76]]))) ? 1 : 0)) {
            var23 = new d(llIIIIlIlI[65], llIIIIlIlI[14], llIIIIlIlI[66]);
            bv.add(var23);
            0;
        }
        int[] nArray4 = new int[llIIIIlIlI[2]];
        nArray4[ap.llIIIIlIlI[1]] = llIIIIlIlI[67];
        if (ap.lIlIIlIIIIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var23 = new d(llIIIIlIlI[67], llIIIIlIlI[68], llIIIIlIlI[69]);
            bv.add(var23);
            0;
        }
    }
}

