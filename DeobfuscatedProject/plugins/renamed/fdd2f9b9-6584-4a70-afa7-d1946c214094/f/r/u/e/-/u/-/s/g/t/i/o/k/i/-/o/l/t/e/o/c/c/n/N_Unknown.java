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
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G_Unknown;
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

public class N_Unknown
implements G {
    static final /* synthetic */ WorldPoint iN;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ int[] lIIlIllIll;
    public static final /* synthetic */ WorldPoint iM;
    public static final /* synthetic */ WorldPoint iJ;
    public static final /* synthetic */ WorldPoint iK;
    private static /* synthetic */ String[] lIIlIllIlI;
    static final /* synthetic */ WorldPoint iP;
    static final /* synthetic */ WorldPoint iO;
    public static /* synthetic */ boolean bt;
    private final /* synthetic */ int iQ = 536;
    public static final /* synthetic */ WorldPoint iL;

    @Override
    public boolean S() {
        return lIIlIllIll[1];
    }

    private static boolean lIIIIIIIIllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIIIIIIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[lIIlIllIll[2]];
                nArray[N.lIIlIllIll[1]] = lIIlIllIll[10];
                if (!N.lIIIIIIIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIIlIllIll[2]];
                nArray2[N.lIIlIllIll[1]] = lIIlIllIll[10];
                if (!N.lIIIIIIIIllII(Inventory.getFirst((int[])nArray2).getQuantity(), lIIlIllIll[13])) break block2;
                if (!N.lIIIIIIIIIllI(Inventory.contains((int[])f.ba) ? 1 : 0)) break block3;
                if (!N.lIIIIIIIIIlII(Equipment.contains((int[])f.ba) ? 1 : 0)) break block2;
                int[] nArray3 = new int[lIIlIllIll[2]];
                nArray3[N.lIIlIllIll[1]] = lIIlIllIll[0];
                if (!N.lIIIIIIIIIllI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[lIIlIllIll[2]];
                nArray4[N.lIIlIllIll[1]] = lIIlIllIll[51];
                if (!N.lIIIIIIIIIlII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block2;
            }
            n2 = lIIlIllIll[2];
            0;
            if (-2 <= 0) return n2 != 0;
            return false;
        }
        n2 = lIIlIllIll[1];
        return n2 != 0;
    }

    private static boolean lIIIIIIIIlIII(int n2) {
        return n2 > 0;
    }

    private static int cC() {
        int n2 = lIIlIllIll[70];
        if (N.lIIIIIIIIIlIl(Skills.getLevel((Skill)Skill.PRAYER), lIIlIllIll[71]) && N.lIIIIIIIIllII(Skills.getLevel((Skill)Skill.PRAYER), lIIlIllIll[3])) {
            return (n2 - Skills.getExperience((Skill)Skill.PRAYER)) / lIIlIllIll[72] + lIIlIllIll[22];
        }
        int n3 = lIIlIllIll[73];
        return (n3 - Skills.getExperience((Skill)Skill.PRAYER)) / lIIlIllIll[72] + lIIlIllIll[63];
    }

    private static void llllllllIlll() {
        lIIlIllIlI = new String[lIIlIllIll[86]];
        N.lIIlIllIlI[N.lIIlIllIll[1]] = N."Buying items";
        N.lIIlIllIlI[N.lIIlIllIll[2]] = N."Finished buying items, switching back to prayer";
        N.lIIlIllIlI[N.lIIlIllIll[4]] = N."Navigating to bank";
        N.lIIlIllIlI[N.lIIlIllIll[5]] = N."Handling banking";
        N.lIIlIllIlI[N.lIIlIllIll[7]] = N."We are missing prayer supplies, switching to BUYING";
        N.lIIlIllIlI[N.lIIlIllIll[14]] = N."Drink";
        N.lIIlIllIlI[N.lIIlIllIll[16]] = N."Tele to wildy";
        N.lIIlIllIlI[N.lIIlIllIll[18]] = N."Rub";
        N.lIIlIllIlI[N.lIIlIllIll[19]] = N."Lava Maze";
        N.lIIlIllIlI[N.lIIlIllIll[20]] = N."Okay, teleport to level 41 Wilderness.";
        N.lIIlIllIlI[N.lIIlIllIll[22]] = N."Nav to altar";
        N.lIIlIllIlI[N.lIIlIllIll[42]] = N."1 tick pray";
        N.lIIlIllIlI[N.lIIlIllIll[45]] = N."Chaos altar";
        N.lIIlIllIlI[N.lIIlIllIll[21]] = N."Large door";
        N.lIIlIllIlI[N.lIIlIllIll[47]] = N."Open";
        N.lIIlIllIlI[N.lIIlIllIll[48]] = N."Open";
        N.lIIlIllIlI[N.lIIlIllIll[49]] = N."Open";
        N.lIIlIllIlI[N.lIIlIllIll[50]] = N."Chaos altar";
        N.lIIlIllIlI[N.lIIlIllIll[52]] = N."Nav to altar";
        N.lIIlIllIlI[N.lIIlIllIll[53]] = N."Unnoting bones";
        N.lIIlIllIlI[N.lIIlIllIll[15]] = N."Elder Chaos druid";
        N.lIIlIllIlI[N.lIIlIllIll[54]] = N."Large door";
        N.lIIlIllIlI[N.lIIlIllIll[55]] = N."Open";
        N.lIIlIllIlI[N.lIIlIllIll[56]] = N."Open";
        N.lIIlIllIlI[N.lIIlIllIll[57]] = N."Open";
        N.lIIlIllIlI[N.lIIlIllIll[58]] = N."Exchange";
        N.lIIlIllIlI[N.lIIlIllIll[59]] = N."Exchange 5";
        N.lIIlIllIlI[N.lIIlIllIll[60]] = N."Exchange All";
        N.lIIlIllIlI[N.lIIlIllIll[61]] = N."Suiciding";
        N.lIIlIllIlI[N.lIIlIllIll[62]] = N."Wine of zamorak";
        N.lIIlIllIlI[N.lIIlIllIll[63]] = N."Take";
        N.lIIlIllIlI[N.lIIlIllIll[75]] = N."Prayer training";
        N.lIIlIllIlI[N.lIIlIllIll[76]] = N."ring of wealth (";
    }

    private static void af() {
        d var20;
        Object var8;
        int[] nArray = new int[lIIlIllIll[2]];
        nArray[N.lIIlIllIll[1]] = lIIlIllIll[9];
        if (N.lIIIIIIIIIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIIlIllIll[9], lIIlIllIll[14], i.bq);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[lIIlIllIll[2]];
        nArray2[N.lIIlIllIll[1]] = lIIlIllIll[0];
        if (N.lIIIIIIIIIllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var8 = new d(lIIlIllIll[0], N.cC(), lIIlIllIll[64]);
            bv.add((d)var8);
            0;
        }
        int[] nArray3 = new int[lIIlIllIll[2]];
        nArray3[N.lIIlIllIll[1]] = lIIlIllIll[8];
        if (N.lIIIIIIIIIllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var8 = new d(lIIlIllIll[8], lIIlIllIll[4], lIIlIllIll[6]);
            bv.add((d)var8);
            0;
        }
        if (N.lIIIIIIIIIllI(Bank.contains((Predicate)(var8 = item -> item.getName().toLowerCase().contains(lIIlIllIlI[lIIlIllIll[76]]))) ? 1 : 0)) {
            var20 = new d(lIIlIllIll[65], lIIlIllIll[14], lIIlIllIll[66]);
            bv.add(var20);
            0;
        }
        int[] nArray4 = new int[lIIlIllIll[2]];
        nArray4[N.lIIlIllIll[1]] = lIIlIllIll[67];
        if (N.lIIIIIIIIIllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var20 = new d(lIIlIllIll[67], lIIlIllIll[68], lIIlIllIll[69]);
            bv.add(var20);
            0;
        }
    }

    private static boolean lIIIIIIIIIllI(int n2) {
        return n2 == 0;
    }

    private static void lIIIIIIIIIIll() {
        lIIlIllIll = new int[87];
        N.lIIlIllIll[0] = 0xFFFFE719 & 0x1AFE;
        N.lIIlIllIll[1] = (0x29 ^ 0x39 ^ (0x6E ^ 0x51)) & (0x28 ^ 0x31 ^ (0x7F ^ 0x49) ^ -1);
        N.lIIlIllIll[2] = 1;
        N.lIIlIllIll[3] = 0xAC ^ 0x81;
        N.lIIlIllIll[4] = 2;
        N.lIIlIllIll[5] = 3;
        N.lIIlIllIll[6] = 0xFFFFD7ED & 0x3B9A;
        N.lIIlIllIll[7] = 0xB2 ^ 0xB6;
        N.lIIlIllIll[8] = -(0xFFFFA5E2 & 0x7F5F) & (0xFFFFFFEF & 0x77FF);
        N.lIIlIllIll[9] = 0xFFFFF7FD & 0x3953;
        N.lIIlIllIll[10] = 0xFFFFCFE7 & 0x33FB;
        N.lIIlIllIll[11] = 0xFFFFAD1C & 0x7BE7;
        N.lIIlIllIll[12] = (0x79 ^ 0x61) + 2 - (0xA1 ^ 0xB9) + (42 + 125 - 0 + 31);
        N.lIIlIllIll[13] = 58 + 100 - 140 + 121 ^ 78 + 50 - 16 + 73;
        N.lIIlIllIll[14] = 0x29 ^ 0x2C;
        N.lIIlIllIll[15] = 0x98 ^ 0x8C;
        N.lIIlIllIll[16] = 135 + 99 - 133 + 48 ^ 55 + 40 - -36 + 16;
        N.lIIlIllIll[17] = -1;
        N.lIIlIllIll[18] = 0xE5 ^ 0x9F ^ (0x39 ^ 0x44);
        N.lIIlIllIll[19] = 137 + 72 - 194 + 171 ^ 134 + 159 - 165 + 50;
        N.lIIlIllIll[20] = 0x34 ^ 0x2F ^ (0x13 ^ 1);
        N.lIIlIllIll[21] = 4 ^ 0x1B ^ (0x6A ^ 0x78);
        N.lIIlIllIll[22] = 0x81 ^ 0x8B;
        N.lIIlIllIll[23] = -(0xFFFFF11C & 0x7EE7) & (0xFFFFFBDF & 0x7FF7);
        N.lIIlIllIll[24] = -(0xFFFFE53F & 0x7AEA) & (0xFFFFEFAF & 0x7F7B);
        N.lIIlIllIll[25] = 0xFFFF9FF3 & 0x6BDE;
        N.lIIlIllIll[26] = 0xFFFFFFFB & 0xEFF;
        N.lIIlIllIll[27] = 0xFFFFDBDB & 0x2FEF;
        N.lIIlIllIll[28] = -(0xFFFFBCCF & 0x7334) & (0xFFFFBEFB & Short.MAX_VALUE);
        N.lIIlIllIll[29] = -(0xFFFFDFBF & 0x3479) & (0xFFFFFFFF & 0x1FFF);
        N.lIIlIllIll[30] = -(0xFFFFBEF7 & 0x7109) & (0xFFFFBFFD & 0x7EF7);
        N.lIIlIllIll[31] = -(0xFFFFECAD & 0x537B) & (0xFFFFEBFB & 0x5FEE);
        N.lIIlIllIll[32] = 0xFFFFEEFF & 0x1FF1;
        N.lIIlIllIll[33] = 0xFFFFBFBF & 0x4BFD;
        N.lIIlIllIll[34] = -(0xFFFFFF19 & 0x11E7) & (0xFFFFBFEE & 0x5FFF);
        N.lIIlIllIll[35] = 0xFFFFBFF7 & 0x4BBF;
        N.lIIlIllIll[36] = 0xFFFFBFEF & 0x4EFA;
        N.lIIlIllIll[37] = 0xFFFFEFBF & 0x1BEF;
        N.lIIlIllIll[38] = -(0xFFFFE145 & 0x7FBF) & (0xFFFFEFEF & Short.MAX_VALUE);
        N.lIIlIllIll[39] = -(0xFFFFFF6D & 0x34DB) & (0xFFFFBFFF & 0x7FEF);
        N.lIIlIllIll[40] = -(0xFFFFFD7E & 0x66CB) & (0xFFFFFFED & 0x6FFB);
        N.lIIlIllIll[41] = -(0xFFFFDC07 & 0x77F9) & (0xFFFFDFFA & 0x7F9F);
        N.lIIlIllIll[42] = 0xA0 ^ 0xAB;
        N.lIIlIllIll[43] = 0xFFFFFBF7 & 0xF9B;
        N.lIIlIllIll[44] = -(0xFFFFDFD7 & 0x713A) & (0xFFFFDFFF & 0x7FFD);
        N.lIIlIllIll[45] = 0xFA ^ 0xC0 ^ (0x89 ^ 0xBF);
        N.lIIlIllIll[46] = -(0xFFFFBB79 & 0x54E7) & (0xFFFF9FEF & 0x7BFF);
        N.lIIlIllIll[47] = 0x22 ^ 0x2C;
        N.lIIlIllIll[48] = 0x18 ^ 0x17;
        N.lIIlIllIll[49] = 1 ^ (0x1C ^ 0xD);
        N.lIIlIllIll[50] = 0xBB ^ 0xAA;
        N.lIIlIllIll[51] = 0xFFFFEE3B & 0x13DD;
        N.lIIlIllIll[52] = 0x36 ^ 0x24;
        N.lIIlIllIll[53] = 2 ^ 0x11;
        N.lIIlIllIll[54] = 0x64 ^ 0x71;
        N.lIIlIllIll[55] = 0x3E ^ 0x28;
        N.lIIlIllIll[56] = 0xD2 ^ 0xC5;
        N.lIIlIllIll[57] = 132 + 106 - 95 + 80 ^ 180 + 104 - 258 + 173;
        N.lIIlIllIll[58] = 0x13 ^ 0xA;
        N.lIIlIllIll[59] = 6 ^ 0x1C;
        N.lIIlIllIll[60] = 0x61 ^ 0x7A;
        N.lIIlIllIll[61] = 0x35 ^ 0x7E ^ (4 ^ 0x53);
        N.lIIlIllIll[62] = 0x3E ^ 0x79 ^ (0xD7 ^ 0x8D);
        N.lIIlIllIll[63] = 0x25 ^ 0x3B;
        N.lIIlIllIll[64] = -(0xFFFFFFBD & 0x7543) & (0xFFFFFFF4 & 0x7FFB);
        N.lIIlIllIll[65] = -(0x94 ^ 0xA0) & (0xFFFFEFFF & 0x3EFF);
        N.lIIlIllIll[66] = -(0xFFFFDFDB & 0x327C) & (0xFFFFF7FF & 0x7BFF);
        N.lIIlIllIll[67] = 0xFFFFDF67 & 0x3FDF;
        N.lIIlIllIll[68] = 0x6C ^ 0x60 ^ (2 ^ 0x26);
        N.lIIlIllIll[69] = 0xFFFF83AC & 0x7FD7;
        N.lIIlIllIll[70] = -(0xFFFFEE9F & 0x5161) & (0xFFFFFF7E & 0x46DCF);
        N.lIIlIllIll[71] = 0x6D ^ 0 ^ (0x22 ^ 0x73);
        N.lIIlIllIll[72] = -(0xFFFFFFAD & 0x7E7F) & (0xFFFFFFEE & Short.MAX_VALUE);
        N.lIIlIllIll[73] = 0xFFFFF45D & 0xFBEA;
        N.lIIlIllIll[74] = 0x60 ^ 4;
        N.lIIlIllIll[75] = 0x2E ^ 0x31;
        N.lIIlIllIll[76] = 0xDF ^ 0xC6 ^ (0x85 ^ 0xBC);
        N.lIIlIllIll[77] = 0xFFFFEBD7 & 0x1FFD;
        N.lIIlIllIll[78] = -(0xFFFFFCD3 & 0x73FF) & (0xFFFFFFFE & 0x7FD7);
        N.lIIlIllIll[79] = -(0xFFFFF7A3 & 0x7C5E) & (0xFFFFFFF3 & 0x7FBF);
        N.lIIlIllIll[80] = -(0xFFFFBB57 & 0x65BF) & (0xFFFFAFFF & Short.MAX_VALUE);
        N.lIIlIllIll[81] = 0xFFFFBBFF & 0x4F86;
        N.lIIlIllIll[82] = -(0xFFFFF177 & 0x6F8B) & (0xFFFFEFFF & 0x7FEF);
        N.lIIlIllIll[83] = -(0xFFFFEEDF & 0x757A) & (0xFFFFEFDD & Short.MAX_VALUE);
        N.lIIlIllIll[84] = -(0xFFFFF74F & 0x5AFA) & (0xFFFFFFFF & 0x5E5F);
        N.lIIlIllIll[85] = 0xFFFFDDFB & 0x2FA7;
        N.lIIlIllIll[86] = 0x74 ^ 0x55;
    }

    private static String llllllllIlII(String var6, String var5) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lIIlIllIll[19]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(lIIlIllIll[4], var12);
            return new String(var1.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    @Override
    public String U() {
        return lIIlIllIlI[lIIlIllIll[75]];
    }

    private static boolean lIIIIIIIIIlll(Object object) {
        return object != null;
    }

    public N() {
        this.iQ = lIIlIllIll[0];
    }

    private static String llllllllIllI(String var22, String var9) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var23 = Cipher.getInstance("Blowfish");
            var23.init(lIIlIllIll[4], var10);
            return new String(var23.doFinal(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (N.lIIIIIIIIllII(Skills.getLevel((Skill)Skill.PRAYER), lIIlIllIll[3])) {
            bl = lIIlIllIll[2];
            0;
            
            }
        } else {
            bl = lIIlIllIll[1];
        }
        return bl;
    }

    private static boolean lIIIIIIIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIIIIIIlIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIIIIIIIlII(int n2) {
        return n2 != 0;
    }

    static {
        N.lIIIIIIIIIIll();
        N.llllllllIlll();
        iJ = new WorldPoint(lIIlIllIll[77], lIIlIllIll[78], lIIlIllIll[1]);
        iK = new WorldPoint(lIIlIllIll[79], lIIlIllIll[80], lIIlIllIll[1]);
        iL = new WorldPoint(lIIlIllIll[81], lIIlIllIll[82], lIIlIllIll[1]);
        iM = new WorldPoint(lIIlIllIll[83], lIIlIllIll[44], lIIlIllIll[1]);
        iN = new WorldPoint(lIIlIllIll[1], lIIlIllIll[1], lIIlIllIll[1]);
        iO = new WorldPoint(lIIlIllIll[1], lIIlIllIll[1], lIIlIllIll[1]);
        iP = new WorldPoint(lIIlIllIll[84], lIIlIllIll[85], lIIlIllIll[1]);
        bv = new ArrayList<d>();
    }

    public static void cB() {
        block44: {
            TileItem var2;
            block45: {
                if (N.lIIIIIIIIIlII(bt ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIllIlI[lIIlIllIll[1]];
                    b.a(bv);
                    if (N.lIIIIIIIIIlIl(bv.size(), lIIlIllIll[2])) {
                        System.out.println(lIIlIllIlI[lIIlIllIll[2]]);
                        bt = lIIlIllIll[1];
                    }
                }
                if (!N.lIIIIIIIIIllI(bt ? 1 : 0) || !N.lIIIIIIIIIlIl(Skills.getLevel((Skill)Skill.PRAYER), lIIlIllIll[3])) break block44;
                if (N.lIIIIIIIIIllI(N.ab() ? 1 : 0) && N.lIIIIIIIIIlIl(Game.getWildyLevel(), lIIlIllIll[2])) {
                    var2 = BankLocation.getNearest();
                    if (N.lIIIIIIIIIlll(var2) && N.lIIIIIIIIIllI(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlIllIlI[lIIlIllIll[4]];
                        a.a((BankLocation)var2);
                    }
                    if (N.lIIIIIIIIIlll(var2) && N.lIIIIIIIIIlII(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlIllIlI[lIIlIllIll[5]];
                        if (N.lIIIIIIIIIllI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIllIll[6]);
                            0;
                        }
                        if (N.lIIIIIIIIIlII(Bank.isOpen() ? 1 : 0)) {
                            if (N.lIIIIIIIIlIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIlIllIll[7]);
                                0;
                            }
                            if (N.lIIIIIIIIlIII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIlIllIll[4]);
                                0;
                            }
                            int[] nArray = new int[lIIlIllIll[5]];
                            nArray[N.lIIlIllIll[1]] = lIIlIllIll[8];
                            nArray[N.lIIlIllIll[2]] = lIIlIllIll[0];
                            nArray[N.lIIlIllIll[4]] = lIIlIllIll[9];
                            if (N.lIIIIIIIIIllI(e.b(nArray) ? 1 : 0)) {
                                N.af();
                                System.out.println(lIIlIllIlI[lIIlIllIll[7]]);
                                bt = lIIlIllIll[2];
                                return;
                            }
                            int[] nArray2 = new int[lIIlIllIll[5]];
                            nArray2[N.lIIlIllIll[1]] = lIIlIllIll[8];
                            nArray2[N.lIIlIllIll[2]] = lIIlIllIll[0];
                            nArray2[N.lIIlIllIll[4]] = lIIlIllIll[9];
                            if (N.lIIIIIIIIIlII(e.b(nArray2) ? 1 : 0)) {
                                if (N.lIIIIIIIIIllI(Equipment.contains((int[])f.ba) ? 1 : 0)) {
                                    a.b(f.ba, lIIlIllIll[2]);
                                }
                                a.b(f.aV, lIIlIllIll[2]);
                                a.a(lIIlIllIll[10], lIIlIllIll[11]);
                                a.b(lIIlIllIll[0], lIIlIllIll[12]);
                            }
                        }
                    }
                }
                if (N.lIIIIIIIIIlII(N.ab() ? 1 : 0)) {
                    if (N.lIIIIIIIIIlII(Inventory.contains((int[])f.aV) ? 1 : 0) && N.lIIIIIIIIIlIl(Movement.getRunEnergy(), lIIlIllIll[13])) {
                        Inventory.getFirst((int[])f.aV).interact(lIIlIllIlI[lIIlIllIll[14]]);
                        Time.sleepTicks((int)lIIlIllIll[2]);
                        0;
                    }
                    if (N.lIIIIIIIIIllI(Movement.isRunEnabled() ? 1 : 0) && N.lIIIIIIIIlIIl(Movement.getRunEnergy(), lIIlIllIll[15])) {
                        Movement.toggleRun();
                        Time.sleepTicks((int)lIIlIllIll[14]);
                        0;
                    }
                    if (N.lIIIIIIIIIlIl(Game.getWildyLevel(), lIIlIllIll[2])) {
                        AccBuilderRogues.c = lIIlIllIlI[lIIlIllIll[16]];
                        if (N.lIIIIIIIIIlII(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (N.lIIIIIIIIIllI(Dialog.isOpen() ? 1 : 0) && N.lIIIIIIIIIlII(Inventory.contains((int[])f.ba) ? 1 : 0) && N.lIIIIIIIIlIlI(Players.getLocal().getAnimation(), lIIlIllIll[17])) {
                            Inventory.getFirst((int[])f.ba).interact(lIIlIllIlI[lIIlIllIll[18]]);
                            Time.sleepTicks((int)lIIlIllIll[4]);
                            0;
                        }
                        String[] stringArray = new String[lIIlIllIll[4]];
                        stringArray[N.lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[19]];
                        stringArray[N.lIIlIllIll[2]] = lIIlIllIlI[lIIlIllIll[20]];
                        g.a(stringArray);
                    }
                    if (N.lIIIIIIIIlIII(Game.getWildyLevel())) {
                        TileObject var13;
                        int[] nArray = new int[lIIlIllIll[2]];
                        nArray[N.lIIlIllIll[1]] = lIIlIllIll[0];
                        if (N.lIIIIIIIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            if (N.lIIIIIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(iL), lIIlIllIll[21])) {
                                AccBuilderRogues.c = lIIlIllIlI[lIIlIllIll[22]];
                                TileItem tileItem = new WorldPoint[lIIlIllIll[21]];
                                tileItem[N.lIIlIllIll[1]] = new WorldPoint(lIIlIllIll[23], lIIlIllIll[24], lIIlIllIll[1]);
                                tileItem[N.lIIlIllIll[2]] = new WorldPoint(lIIlIllIll[25], lIIlIllIll[26], lIIlIllIll[1]);
                                tileItem[N.lIIlIllIll[4]] = new WorldPoint(lIIlIllIll[27], lIIlIllIll[28], lIIlIllIll[1]);
                                tileItem[N.lIIlIllIll[5]] = new WorldPoint(lIIlIllIll[29], lIIlIllIll[30], lIIlIllIll[1]);
                                tileItem[N.lIIlIllIll[7]] = new WorldPoint(lIIlIllIll[31], lIIlIllIll[32], lIIlIllIll[1]);
                                tileItem[N.lIIlIllIll[14]] = new WorldPoint(lIIlIllIll[33], lIIlIllIll[34], lIIlIllIll[1]);
                                tileItem[N.lIIlIllIll[16]] = new WorldPoint(lIIlIllIll[35], lIIlIllIll[36], lIIlIllIll[1]);
                                tileItem[N.lIIlIllIll[18]] = new WorldPoint(lIIlIllIll[37], lIIlIllIll[38], lIIlIllIll[1]);
                                tileItem[N.lIIlIllIll[19]] = new WorldPoint(lIIlIllIll[39], lIIlIllIll[38], lIIlIllIll[1]);
                                tileItem[N.lIIlIllIll[20]] = new WorldPoint(lIIlIllIll[40], lIIlIllIll[38], lIIlIllIll[1]);
                                tileItem[N.lIIlIllIll[22]] = new WorldPoint(lIIlIllIll[41], lIIlIllIll[38], lIIlIllIll[1]);
                                tileItem[N.lIIlIllIll[42]] = new WorldPoint(lIIlIllIll[43], lIIlIllIll[44], lIIlIllIll[1]);
                                tileItem[N.lIIlIllIll[45]] = new WorldPoint(lIIlIllIll[46], lIIlIllIll[44], lIIlIllIll[1]);
                                var2 = tileItem;
                                Walker.walkAlong(Arrays.asList(var2), new HashMap());
                                0;
                                Time.sleepTicks((int)lIIlIllIll[2]);
                                0;
                            }
                            if (N.lIIIIIIIIlIll(Players.getLocal().getWorldLocation().distanceTo(iL), lIIlIllIll[21])) {
                                AccBuilderRogues.c = lIIlIllIlI[lIIlIllIll[42]];
                                String[] stringArray = new String[lIIlIllIll[2]];
                                stringArray[N.lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[45]];
                                var2 = TileObjects.getNearest((String[])stringArray);
                                String[] stringArray2 = new String[lIIlIllIll[2]];
                                stringArray2[N.lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[21]];
                                var13 = TileObjects.getNearest((String[])stringArray2);
                                String[] stringArray3 = new String[lIIlIllIll[2]];
                                stringArray3[N.lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[47]];
                                if (N.lIIIIIIIIIlII(var13.hasAction(stringArray3) ? 1 : 0)) {
                                    var13.interact(lIIlIllIlI[lIIlIllIll[48]]);
                                }
                                if (N.lIIIIIIIIIlll(var2)) {
                                    String[] stringArray4 = new String[lIIlIllIll[2]];
                                    stringArray4[N.lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[49]];
                                    if (N.lIIIIIIIIIllI(var13.hasAction(stringArray4) ? 1 : 0)) {
                                        int var17 = Skills.getExperience((Skill)Skill.PRAYER);
                                        int[] nArray3 = new int[lIIlIllIll[2]];
                                        nArray3[N.lIIlIllIll[1]] = lIIlIllIll[0];
                                        String[] stringArray5 = new String[lIIlIllIll[2]];
                                        stringArray5[N.lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[50]];
                                        Inventory.getFirst((int[])nArray3).useOn(TileObjects.getNearest((String[])stringArray5));
                                        Time.sleepTicks((int)lIIlIllIll[2]);
                                        0;
                                    }
                                }
                            }
                        }
                        int[] nArray4 = new int[lIIlIllIll[2]];
                        nArray4[N.lIIlIllIll[1]] = lIIlIllIll[0];
                        if (N.lIIIIIIIIIllI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[lIIlIllIll[2]];
                            nArray5[N.lIIlIllIll[1]] = lIIlIllIll[51];
                            if (N.lIIIIIIIIIlII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                if (N.lIIIIIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(iL), lIIlIllIll[21])) {
                                    AccBuilderRogues.c = lIIlIllIlI[lIIlIllIll[52]];
                                    WorldPoint[] worldPointArray = new WorldPoint[lIIlIllIll[21]];
                                    worldPointArray[N.lIIlIllIll[1]] = new WorldPoint(lIIlIllIll[23], lIIlIllIll[24], lIIlIllIll[1]);
                                    worldPointArray[N.lIIlIllIll[2]] = new WorldPoint(lIIlIllIll[25], lIIlIllIll[26], lIIlIllIll[1]);
                                    worldPointArray[N.lIIlIllIll[4]] = new WorldPoint(lIIlIllIll[27], lIIlIllIll[28], lIIlIllIll[1]);
                                    worldPointArray[N.lIIlIllIll[5]] = new WorldPoint(lIIlIllIll[29], lIIlIllIll[30], lIIlIllIll[1]);
                                    worldPointArray[N.lIIlIllIll[7]] = new WorldPoint(lIIlIllIll[31], lIIlIllIll[32], lIIlIllIll[1]);
                                    worldPointArray[N.lIIlIllIll[14]] = new WorldPoint(lIIlIllIll[33], lIIlIllIll[34], lIIlIllIll[1]);
                                    worldPointArray[N.lIIlIllIll[16]] = new WorldPoint(lIIlIllIll[35], lIIlIllIll[36], lIIlIllIll[1]);
                                    worldPointArray[N.lIIlIllIll[18]] = new WorldPoint(lIIlIllIll[37], lIIlIllIll[38], lIIlIllIll[1]);
                                    worldPointArray[N.lIIlIllIll[19]] = new WorldPoint(lIIlIllIll[39], lIIlIllIll[38], lIIlIllIll[1]);
                                    worldPointArray[N.lIIlIllIll[20]] = new WorldPoint(lIIlIllIll[40], lIIlIllIll[38], lIIlIllIll[1]);
                                    worldPointArray[N.lIIlIllIll[22]] = new WorldPoint(lIIlIllIll[41], lIIlIllIll[38], lIIlIllIll[1]);
                                    worldPointArray[N.lIIlIllIll[42]] = new WorldPoint(lIIlIllIll[43], lIIlIllIll[44], lIIlIllIll[1]);
                                    worldPointArray[N.lIIlIllIll[45]] = new WorldPoint(lIIlIllIll[46], lIIlIllIll[44], lIIlIllIll[1]);
                                    var2 = worldPointArray;
                                    Walker.walkAlong(Arrays.asList(var2), new HashMap());
                                    0;
                                    Time.sleepTicks((int)lIIlIllIll[2]);
                                    0;
                                }
                                if (N.lIIIIIIIIlIll(Players.getLocal().getWorldLocation().distanceTo(iL), lIIlIllIll[21])) {
                                    AccBuilderRogues.c = lIIlIllIlI[lIIlIllIll[53]];
                                    if (!N.lIIIIIIIIIllI(Dialog.canLevelUpContinue() ? 1 : 0) || N.lIIIIIIIIIlII(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    String[] stringArray = new String[lIIlIllIll[2]];
                                    stringArray[N.lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[15]];
                                    var2 = NPCs.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[lIIlIllIll[2]];
                                    stringArray6[N.lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[54]];
                                    var13 = TileObjects.getNearest((String[])stringArray6);
                                    String[] stringArray7 = new String[lIIlIllIll[2]];
                                    stringArray7[N.lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[55]];
                                    if (N.lIIIIIIIIIlII(var13.hasAction(stringArray7) ? 1 : 0)) {
                                        var13.interact(lIIlIllIlI[lIIlIllIll[56]]);
                                    }
                                    if (N.lIIIIIIIIIlll(var2)) {
                                        String[] stringArray8 = new String[lIIlIllIll[2]];
                                        stringArray8[N.lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[57]];
                                        if (N.lIIIIIIIIIllI(var13.hasAction(stringArray8) ? 1 : 0)) {
                                            List var17;
                                            if (N.lIIIIIIIIIllI(Dialog.isOpen() ? 1 : 0)) {
                                                int[] nArray6 = new int[lIIlIllIll[2]];
                                                nArray6[N.lIIlIllIll[1]] = lIIlIllIll[51];
                                                Inventory.getFirst((int[])nArray6).useOn((Actor)var2);
                                                Time.sleepTicks((int)lIIlIllIll[4]);
                                                0;
                                            }
                                            if (N.lIIIIIIIIIlII(Dialog.isOpen() ? 1 : 0) && N.lIIIIIIIIIllI((var17 = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                                                int var16 = lIIlIllIll[1];
                                                while (N.lIIIIIIIIIlIl(var16, var17.size())) {
                                                    int[] nArray7 = new int[lIIlIllIll[2]];
                                                    nArray7[N.lIIlIllIll[1]] = lIIlIllIll[51];
                                                    if (N.lIIIIIIIIlIlI(((Item)Inventory.getAll((int[])nArray7).get(lIIlIllIll[1])).getQuantity(), lIIlIllIll[2]) && N.lIIIIIIIIIlII(((Widget)var17.get(var16)).getText().contains(lIIlIllIlI[lIIlIllIll[58]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)var17.get(var16)).getClickPoint().getX(), (int)((Widget)var17.get(var16)).getClickPoint().getY(), (boolean)lIIlIllIll[2]);
                                                        Time.sleepTicks((int)lIIlIllIll[4]);
                                                        0;
                                                    }
                                                    int[] nArray8 = new int[lIIlIllIll[2]];
                                                    nArray8[N.lIIlIllIll[1]] = lIIlIllIll[51];
                                                    if (N.lIIIIIIIIlIlI(((Item)Inventory.getAll((int[])nArray8).get(lIIlIllIll[1])).getQuantity(), lIIlIllIll[14]) && N.lIIIIIIIIIlII(((Widget)var17.get(var16)).getText().contains(lIIlIllIlI[lIIlIllIll[59]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)var17.get(var16)).getClickPoint().getX(), (int)((Widget)var17.get(var16)).getClickPoint().getY(), (boolean)lIIlIllIll[2]);
                                                        Time.sleepTicks((int)lIIlIllIll[4]);
                                                        0;
                                                    }
                                                    if (N.lIIIIIIIIIlII(((Widget)var17.get(var16)).getText().contains(lIIlIllIlI[lIIlIllIll[60]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)var17.get(var16)).getClickPoint().getX(), (int)((Widget)var17.get(var16)).getClickPoint().getY(), (boolean)lIIlIllIll[2]);
                                                        Time.sleepTicks((int)lIIlIllIll[4]);
                                                        0;
                                                    }
                                                    ++var16;
                                                    0;
                                                    if (-1 < 0) continue;
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
                int[] nArray = new int[lIIlIllIll[2]];
                nArray[N.lIIlIllIll[1]] = lIIlIllIll[10];
                if (!N.lIIIIIIIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray9 = new int[lIIlIllIll[2]];
                nArray9[N.lIIlIllIll[1]] = lIIlIllIll[0];
                if (!N.lIIIIIIIIIllI(Inventory.contains((int[])nArray9) ? 1 : 0)) break block44;
                int[] nArray10 = new int[lIIlIllIll[2]];
                nArray10[N.lIIlIllIll[1]] = lIIlIllIll[51];
                if (!N.lIIIIIIIIIllI(Inventory.contains((int[])nArray10) ? 1 : 0)) break block44;
            }
            if (N.lIIIIIIIIlIll(Players.getLocal().getWorldLocation().distanceTo(iL), lIIlIllIll[21])) {
                AccBuilderRogues.c = lIIlIllIlI[lIIlIllIll[61]];
                String[] stringArray = new String[lIIlIllIll[2]];
                stringArray[N.lIIlIllIll[1]] = lIIlIllIlI[lIIlIllIll[62]];
                var2 = TileItems.getNearest((String[])stringArray);
                if (N.lIIIIIIIIIlll(var2)) {
                    var2.interact(lIIlIllIlI[lIIlIllIll[63]]);
                }
            }
        }
    }

    @Override
    public int T() {
        try {
            N.cB();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 < 1) {
            return (0x45 ^ 0x73 ^ (0x6D ^ 0x62)) & (0x22 ^ 1 ^ (0x3A ^ 0x20) ^ -1);
        }
        return lIIlIllIll[74];
    }

    private static String llllllllIlIl(String var7, String var3) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var24 = new StringBuilder();
        char[] var18 = var3.toCharArray();
        int var4 = lIIlIllIll[1];
        char[] var14 = var7.toCharArray();
        int var21 = var14.length;
        int var15 = lIIlIllIll[1];
        while (N.lIIIIIIIIIlIl(var15, var21)) {
            char var11 = var14[var15];
            var24.append((char)(var11 ^ var18[var4 % var18.length]));
            0;
            ++var4;
            ++var15;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var24);
    }

    private static boolean lIIIIIIIIlIlI(int n2, int n3) {
        return n2 == n3;
    }
}

