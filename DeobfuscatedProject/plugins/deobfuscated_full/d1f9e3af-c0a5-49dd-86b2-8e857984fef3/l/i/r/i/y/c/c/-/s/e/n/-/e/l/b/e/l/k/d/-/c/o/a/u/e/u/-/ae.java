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
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
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
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
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

public class ae
implements W {
    public static final /* synthetic */ WorldPoint lD;
    private static /* synthetic */ int[] lIllIIIII;
    static final /* synthetic */ WorldPoint lI;
    private final /* synthetic */ int lJ = 536;
    static final /* synthetic */ WorldPoint lG;
    public static /* synthetic */ List<d> bv;
    public static final /* synthetic */ WorldPoint lE;
    public static final /* synthetic */ WorldPoint lF;
    public static final /* synthetic */ WorldPoint lC;
    public static /* synthetic */ boolean bt;
    static final /* synthetic */ WorldPoint lH;
    private static /* synthetic */ String[] lIlIlllII;

    @Override
    public int T() {
        try {
            ae.dD();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((158 + 53 - 159 + 107 ^ 61 + 44 - 53 + 137) & (0x62 ^ 0x40 ^ (0x49 ^ 0x7C) & ~(0x28 ^ 0x1D) ^ -1)) >= 2) {
            return (53 + 34 - 44 + 128 ^ 2 + 95 - 69 + 139) & (66 + 95 - 37 + 21 ^ 69 + 20 - 30 + 98 ^ -1);
        }
        return lIllIIIII[74];
    }

    @Override
    public boolean S() {
        return lIllIIIII[1];
    }

    private static boolean lIIlIlIIIlIl(int n2) {
        return n2 == 0;
    }

    private static void lIIlIlIIIIlI() {
        lIllIIIII = new int[87];
        ae.lIllIIIII[0] = -(0xFFFFCBBF & 0x7D65) & (0xFFFFEBBC & 0x5F7F);
        ae.lIllIIIII[1] = (23 + 173 - 128 + 185 ^ 158 + 84 - 149 + 75) & (0x36 ^ 0x46 ^ (0xE6 ^ 0xC3) ^ -1);
        ae.lIllIIIII[2] = 1;
        ae.lIllIIIII[3] = 8 ^ 0x25;
        ae.lIllIIIII[4] = 2;
        ae.lIllIIIII[5] = 3;
        ae.lIllIIIII[6] = 0xFFFFFFAF & 0x13D8;
        ae.lIllIIIII[7] = 0x6A ^ 0x6E;
        ae.lIllIIIII[8] = -(0xFFFFDD1B & 0x2FE6) & (0xFFFFFFEF & 0x5FBF);
        ae.lIllIIIII[9] = -(41 + 97 - 51 + 46) & (0xFFFFFFDD & 0x31F7);
        ae.lIllIIIII[10] = -(0xFFFFF51B & 0x6EE5) & (0xFFFFE7F3 & 0x7FEF);
        ae.lIllIIIII[11] = -(0xFFFF9CFF & 0x7369) & (0xFFFFFDFE & 0x3B6D);
        ae.lIllIIIII[12] = (0xE3 ^ 0x90) + (134 + 138 - 137 + 41) - (23 + 53 - -41 + 15) + (0x57 ^ 0x7E);
        ae.lIllIIIII[13] = 0x81 ^ 0xB3;
        ae.lIllIIIII[14] = 68 + 142 - 158 + 146 ^ 182 + 21 - 48 + 40;
        ae.lIllIIIII[15] = 0x2A ^ 0x3E;
        ae.lIllIIIII[16] = 0xFE ^ 0xA3 ^ (0x98 ^ 0xC3);
        ae.lIllIIIII[17] = -1;
        ae.lIllIIIII[18] = 123 + 89 - 127 + 90 ^ 86 + 38 - -40 + 4;
        ae.lIllIIIII[19] = 0x74 ^ 0x7C;
        ae.lIllIIIII[20] = 125 + 76 - 124 + 88 ^ 109 + 42 - 36 + 57;
        ae.lIllIIIII[21] = 0x76 ^ 0x3E ^ (0xD0 ^ 0x95);
        ae.lIllIIIII[22] = 0x7A ^ 0x70;
        ae.lIllIIIII[23] = 0xFFFFEFD6 & 0x1BFD;
        ae.lIllIIIII[24] = -(0xFFFFEDFB & 0x72F5) & (0xFFFFFFF2 & 0x6FFF);
        ae.lIllIIIII[25] = -(0xFFFFB6F5 & 0x7D0F) & (0xFFFFBFFF & 0x7FD6);
        ae.lIllIIIII[26] = -(0xFFFFFEFF & 0x6101) & (0xFFFFFFFB & 0x6EFF);
        ae.lIllIIIII[27] = -(0xFFFFCF9D & 0x3467) & (0xFFFF9FDF & 0x6FEF);
        ae.lIllIIIII[28] = -(0xFFFFB58E & 0x7B75) & (0xFFFFFFFF & 0x3FFB);
        ae.lIllIIIII[29] = -(0xFFFFAE67 & 0x55B9) & (0xFFFFAFFF & 0x5FE7);
        ae.lIllIIIII[30] = 0xFFFF9FF7 & 0x6EFD;
        ae.lIllIIIII[31] = 0xFFFFCBEE & 0x3FD3;
        ae.lIllIIIII[32] = 0xFFFFAFFD & 0x5EF3;
        ae.lIllIIIII[33] = 0xFFFF9FFD & 0x6BBF;
        ae.lIllIIIII[34] = -(0xFFFFBB8F & 0x7472) & (0xFFFFFFEF & 0x3EFF);
        ae.lIllIIIII[35] = 0xFFFFBBB7 & 0x4FFF;
        ae.lIllIIIII[36] = 0xFFFFBFFF & 0x4EEA;
        ae.lIllIIIII[37] = -(0xFFFFDB71 & 0x74DF) & (0xFFFFDFFF & 0x7BFF);
        ae.lIllIIIII[38] = -(0xFFFFFF55 & 0x30BB) & (0xFFFFBEFF & 0x7FFB);
        ae.lIllIIIII[39] = 0xFFFF8FF7 & 0x7BAF;
        ae.lIllIIIII[40] = -(0xFFFFF45F & 0x7BFF) & (0xFFFFFBFE & Short.MAX_VALUE);
        ae.lIllIIIII[41] = -(0xFFFF97DD & 0x7C67) & (0xFFFFBFFE & 0x5FDF);
        ae.lIllIIIII[42] = 0xF9 ^ 0xAE ^ (0x44 ^ 0x18);
        ae.lIllIIIII[43] = 0xFFFFABB3 & 0x5FDF;
        ae.lIllIIIII[44] = -(0xFFFFB35F & 0x4DB2) & (0xFFFFBFFD & 0x4FFF);
        ae.lIllIIIII[45] = 0x73 ^ 0x7F;
        ae.lIllIIIII[46] = -(0xFFFFF6A1 & 0x297F) & (0xFFFFAFFF & 0x7BAF);
        ae.lIllIIIII[47] = 0x59 ^ 0x57;
        ae.lIllIIIII[48] = 0xAF ^ 0xA0;
        ae.lIllIIIII[49] = 0xA3 ^ 0xB0 ^ 3;
        ae.lIllIIIII[50] = 0x5B ^ 0x4A;
        ae.lIllIIIII[51] = -(0xFFFFF7E5 & 0x6D5B) & (0xFFFFE75B & 0x7FFD);
        ae.lIllIIIII[52] = 0x16 ^ 4;
        ae.lIllIIIII[53] = 94 + 44 - 135 + 147 ^ 89 + 28 - 75 + 91;
        ae.lIllIIIII[54] = 0xA5 ^ 0xB0;
        ae.lIllIIIII[55] = 0x3E ^ 0x64 ^ (0xEA ^ 0xA6);
        ae.lIllIIIII[56] = 0x1C ^ 0xB;
        ae.lIllIIIII[57] = 0x86 ^ 0x9E;
        ae.lIllIIIII[58] = 0x97 ^ 0x8E;
        ae.lIllIIIII[59] = 0x98 ^ 0x82;
        ae.lIllIIIII[60] = 112 + 135 - 219 + 155 ^ 122 + 27 - 98 + 121;
        ae.lIllIIIII[61] = 0x7E ^ 0x62;
        ae.lIllIIIII[62] = 0x4B ^ 0x55 ^ 3;
        ae.lIllIIIII[63] = 0x31 ^ 0x2F;
        ae.lIllIIIII[64] = 0xFFFFBAFE & 0x4FF1;
        ae.lIllIIIII[65] = 0xFFFFEEDF & 0x3FEC;
        ae.lIllIIIII[66] = -(0xFFFFFFFD & 0x1657) & (0xFFFFF7FF & 0x7FFC);
        ae.lIllIIIII[67] = -(0xFFFFED31 & 0x32FF) & (0xFFFFBFFF & 0x7F77);
        ae.lIllIIIII[68] = 0x75 ^ 0x5D;
        ae.lIllIIIII[69] = 0xFFFF93E5 & 0x6F9E;
        ae.lIllIIIII[70] = -(0xFFFFD9BF & 0x7662) & (0xFFFFFFFF & 0x47D6F);
        ae.lIllIIIII[71] = 0x49 ^ 0x73 ^ (0xA7 ^ 0xA1);
        ae.lIllIIIII[72] = -(0xFFFFAF55 & 0x7ABF) & (0xFFFFFFFE & 0x2BD7);
        ae.lIllIIIII[73] = 0xFFFFFE5D & 0xF1EA;
        ae.lIllIIIII[74] = 0x3B ^ 2 ^ (0x2F ^ 0x72);
        ae.lIllIIIII[75] = 0x41 ^ 0x6B ^ (0xE ^ 0x3B);
        ae.lIllIIIII[76] = 0x2B ^ 0xB;
        ae.lIllIIIII[77] = -(0xFFFFFF69 & 0x549F) & (0xFFFFDFFF & 0x7FDD);
        ae.lIllIIIII[78] = -(0xFFFF92EF & 0x7D33) & (0xFFFFFFBF & 0x1F66);
        ae.lIllIIIII[79] = 0xFFFFEBF3 & 0x1FBE;
        ae.lIllIIIII[80] = -(0xFFFFFF9B & 0x7177) & (0xFFFFFFFF & 0x7FFB);
        ae.lIllIIIII[81] = -(0xFFFFBFBD & 0x445B) & (0xFFFFDFDF & 0x2FBE);
        ae.lIllIIIII[82] = 0xFFFFCEEF & 0x3FFD;
        ae.lIllIIIII[83] = 0xFFFF8BDC & 0x7FA7;
        ae.lIllIIIII[84] = 0xFFFF8EB6 & 0x7D5F;
        ae.lIllIIIII[85] = 0xFFFFEDB7 & 0x1FEB;
        ae.lIllIIIII[86] = 9 ^ 0x28;
    }

    private static void lIIlIlIIIIIl() {
        lIlIlllII = new String[lIllIIIII[86]];
        ae.lIlIlllII[ae.lIllIIIII[1]] = ae."Buying items";
        ae.lIlIlllII[ae.lIllIIIII[2]] = ae."Finished buying items, switching back to prayer";
        ae.lIlIlllII[ae.lIllIIIII[4]] = ae."Navigating to bank";
        ae.lIlIlllII[ae.lIllIIIII[5]] = ae."Handling banking";
        ae.lIlIlllII[ae.lIllIIIII[7]] = ae."We are missing prayer supplies, switching to BUYING";
        ae.lIlIlllII[ae.lIllIIIII[14]] = ae."Drink";
        ae.lIlIlllII[ae.lIllIIIII[16]] = ae."Tele to wildy";
        ae.lIlIlllII[ae.lIllIIIII[18]] = ae."Rub";
        ae.lIlIlllII[ae.lIllIIIII[19]] = ae."Lava Maze";
        ae.lIlIlllII[ae.lIllIIIII[20]] = ae."Okay, teleport to level 41 Wilderness.";
        ae.lIlIlllII[ae.lIllIIIII[22]] = ae."Nav to altar";
        ae.lIlIlllII[ae.lIllIIIII[42]] = ae."1 tick pray";
        ae.lIlIlllII[ae.lIllIIIII[45]] = ae."Chaos altar";
        ae.lIlIlllII[ae.lIllIIIII[21]] = ae."Large door";
        ae.lIlIlllII[ae.lIllIIIII[47]] = ae."Open";
        ae.lIlIlllII[ae.lIllIIIII[48]] = ae."Open";
        ae.lIlIlllII[ae.lIllIIIII[49]] = ae."Open";
        ae.lIlIlllII[ae.lIllIIIII[50]] = ae."Chaos altar";
        ae.lIlIlllII[ae.lIllIIIII[52]] = ae."Nav to altar";
        ae.lIlIlllII[ae.lIllIIIII[53]] = ae."Unnoting bones";
        ae.lIlIlllII[ae.lIllIIIII[15]] = ae."Elder Chaos druid";
        ae.lIlIlllII[ae.lIllIIIII[54]] = ae."Large door";
        ae.lIlIlllII[ae.lIllIIIII[55]] = ae."Open";
        ae.lIlIlllII[ae.lIllIIIII[56]] = ae."Open";
        ae.lIlIlllII[ae.lIllIIIII[57]] = ae."Open";
        ae.lIlIlllII[ae.lIllIIIII[58]] = ae."Exchange";
        ae.lIlIlllII[ae.lIllIIIII[59]] = ae."Exchange 5";
        ae.lIlIlllII[ae.lIllIIIII[60]] = ae."Exchange All";
        ae.lIlIlllII[ae.lIllIIIII[61]] = ae."Suiciding";
        ae.lIlIlllII[ae.lIllIIIII[62]] = ae."Wine of zamorak";
        ae.lIlIlllII[ae.lIllIIIII[63]] = ae."Take";
        ae.lIlIlllII[ae.lIllIIIII[75]] = ae."Prayer training";
        ae.lIlIlllII[ae.lIllIIIII[76]] = ae."ring of wealth (";
    }

    @Override
    public String U() {
        return lIlIlllII[lIllIIIII[75]];
    }

    private static int dE() {
        int n2 = lIllIIIII[70];
        if (ae.lIIlIlIIIlII(Skills.getLevel((Skill)Skill.PRAYER), lIllIIIII[71]) && ae.lIIlIlIIlIll(Skills.getLevel((Skill)Skill.PRAYER), lIllIIIII[3])) {
            return (n2 - Skills.getExperience((Skill)Skill.PRAYER)) / lIllIIIII[72] + lIllIIIII[22];
        }
        int n3 = lIllIIIII[73];
        return (n3 - Skills.getExperience((Skill)Skill.PRAYER)) / lIllIIIII[72] + lIllIIIII[63];
    }

    private static void af() {
        d lllIIIIIIIlIII;
        Object lllIIIIIIIlIIl;
        int[] nArray = new int[lIllIIIII[2]];
        nArray[ae.lIllIIIII[1]] = lIllIIIII[9];
        if (ae.lIIlIlIIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIllIIIII[9], lIllIIIII[14], i.bq);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[lIllIIIII[2]];
        nArray2[ae.lIllIIIII[1]] = lIllIIIII[0];
        if (ae.lIIlIlIIIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllIIIIIIIlIIl = new d(lIllIIIII[0], ae.dE(), lIllIIIII[64]);
            bv.add((d)lllIIIIIIIlIIl);
            0;
        }
        int[] nArray3 = new int[lIllIIIII[2]];
        nArray3[ae.lIllIIIII[1]] = lIllIIIII[8];
        if (ae.lIIlIlIIIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllIIIIIIIlIIl = new d(lIllIIIII[8], lIllIIIII[4], lIllIIIII[6]);
            bv.add((d)lllIIIIIIIlIIl);
            0;
        }
        if (ae.lIIlIlIIIlIl(Bank.contains((Predicate)(lllIIIIIIIlIIl = item -> item.getName().toLowerCase().contains(lIlIlllII[lIllIIIII[76]]))) ? 1 : 0)) {
            lllIIIIIIIlIII = new d(lIllIIIII[65], lIllIIIII[14], lIllIIIII[66]);
            bv.add(lllIIIIIIIlIII);
            0;
        }
        int[] nArray4 = new int[lIllIIIII[2]];
        nArray4[ae.lIllIIIII[1]] = lIllIIIII[67];
        if (ae.lIIlIlIIIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lllIIIIIIIlIII = new d(lIllIIIII[67], lIllIIIII[68], lIllIIIII[69]);
            bv.add(lllIIIIIIIlIII);
            0;
        }
    }

    public static void dD() {
        block44: {
            TileItem lllIIIIIIIllll;
            block45: {
                if (ae.lIIlIlIIIIll(bt ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIlllII[lIllIIIII[1]];
                    b.a(bv);
                    if (ae.lIIlIlIIIlII(bv.size(), lIllIIIII[2])) {
                        System.out.println(lIlIlllII[lIllIIIII[2]]);
                        bt = lIllIIIII[1];
                    }
                }
                if (!ae.lIIlIlIIIlIl(bt ? 1 : 0) || !ae.lIIlIlIIIlII(Skills.getLevel((Skill)Skill.PRAYER), lIllIIIII[3])) break block44;
                if (ae.lIIlIlIIIlIl(ae.ab() ? 1 : 0) && ae.lIIlIlIIIlII(Game.getWildyLevel(), lIllIIIII[2])) {
                    lllIIIIIIIllll = BankLocation.getNearest();
                    if (ae.lIIlIlIIIllI(lllIIIIIIIllll) && ae.lIIlIlIIIlIl(lllIIIIIIIllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlIlllII[lIllIIIII[4]];
                        a.a((BankLocation)lllIIIIIIIllll);
                    }
                    if (ae.lIIlIlIIIllI(lllIIIIIIIllll) && ae.lIIlIlIIIIll(lllIIIIIIIllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlIlllII[lIllIIIII[5]];
                        if (ae.lIIlIlIIIlIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIIIII[6]);
                            0;
                        }
                        if (ae.lIIlIlIIIIll(Bank.isOpen() ? 1 : 0)) {
                            if (ae.lIIlIlIIIlll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIllIIIII[7]);
                                0;
                            }
                            if (ae.lIIlIlIIIlll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIllIIIII[4]);
                                0;
                            }
                            int[] nArray = new int[lIllIIIII[5]];
                            nArray[ae.lIllIIIII[1]] = lIllIIIII[8];
                            nArray[ae.lIllIIIII[2]] = lIllIIIII[0];
                            nArray[ae.lIllIIIII[4]] = lIllIIIII[9];
                            if (ae.lIIlIlIIIlIl(e.b(nArray) ? 1 : 0)) {
                                ae.af();
                                System.out.println(lIlIlllII[lIllIIIII[7]]);
                                bt = lIllIIIII[2];
                                return;
                            }
                            int[] nArray2 = new int[lIllIIIII[5]];
                            nArray2[ae.lIllIIIII[1]] = lIllIIIII[8];
                            nArray2[ae.lIllIIIII[2]] = lIllIIIII[0];
                            nArray2[ae.lIllIIIII[4]] = lIllIIIII[9];
                            if (ae.lIIlIlIIIIll(e.b(nArray2) ? 1 : 0)) {
                                if (ae.lIIlIlIIIlIl(Equipment.contains((int[])f.ba) ? 1 : 0)) {
                                    a.b(f.ba, lIllIIIII[2]);
                                }
                                a.b(f.aV, lIllIIIII[2]);
                                a.a(lIllIIIII[10], lIllIIIII[11]);
                                a.b(lIllIIIII[0], lIllIIIII[12]);
                            }
                        }
                    }
                }
                if (ae.lIIlIlIIIIll(ae.ab() ? 1 : 0)) {
                    if (ae.lIIlIlIIIIll(Inventory.contains((int[])f.aV) ? 1 : 0) && ae.lIIlIlIIIlII(Movement.getRunEnergy(), lIllIIIII[13])) {
                        Inventory.getFirst((int[])f.aV).interact(lIlIlllII[lIllIIIII[14]]);
                        Time.sleepTicks((int)lIllIIIII[2]);
                        0;
                    }
                    if (ae.lIIlIlIIIlIl(Movement.isRunEnabled() ? 1 : 0) && ae.lIIlIlIIlIII(Movement.getRunEnergy(), lIllIIIII[15])) {
                        Movement.toggleRun();
                        Time.sleepTicks((int)lIllIIIII[14]);
                        0;
                    }
                    if (ae.lIIlIlIIIlII(Game.getWildyLevel(), lIllIIIII[2])) {
                        AccBuilderEasyClues.c = lIlIlllII[lIllIIIII[16]];
                        if (ae.lIIlIlIIIIll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (ae.lIIlIlIIIlIl(Dialog.isOpen() ? 1 : 0) && ae.lIIlIlIIIIll(Inventory.contains((int[])f.ba) ? 1 : 0) && ae.lIIlIlIIlIIl(Players.getLocal().getAnimation(), lIllIIIII[17])) {
                            Inventory.getFirst((int[])f.ba).interact(lIlIlllII[lIllIIIII[18]]);
                            Time.sleepTicks((int)lIllIIIII[4]);
                            0;
                        }
                        String[] stringArray = new String[lIllIIIII[4]];
                        stringArray[ae.lIllIIIII[1]] = lIlIlllII[lIllIIIII[19]];
                        stringArray[ae.lIllIIIII[2]] = lIlIlllII[lIllIIIII[20]];
                        g.a(stringArray);
                    }
                    if (ae.lIIlIlIIIlll(Game.getWildyLevel())) {
                        TileObject lllIIIIIIIlllI;
                        int[] nArray = new int[lIllIIIII[2]];
                        nArray[ae.lIllIIIII[1]] = lIllIIIII[0];
                        if (ae.lIIlIlIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            if (ae.lIIlIlIIlIII(Players.getLocal().getWorldLocation().distanceTo(lE), lIllIIIII[21])) {
                                AccBuilderEasyClues.c = lIlIlllII[lIllIIIII[22]];
                                TileItem tileItem = new WorldPoint[lIllIIIII[21]];
                                tileItem[ae.lIllIIIII[1]] = new WorldPoint(lIllIIIII[23], lIllIIIII[24], lIllIIIII[1]);
                                tileItem[ae.lIllIIIII[2]] = new WorldPoint(lIllIIIII[25], lIllIIIII[26], lIllIIIII[1]);
                                tileItem[ae.lIllIIIII[4]] = new WorldPoint(lIllIIIII[27], lIllIIIII[28], lIllIIIII[1]);
                                tileItem[ae.lIllIIIII[5]] = new WorldPoint(lIllIIIII[29], lIllIIIII[30], lIllIIIII[1]);
                                tileItem[ae.lIllIIIII[7]] = new WorldPoint(lIllIIIII[31], lIllIIIII[32], lIllIIIII[1]);
                                tileItem[ae.lIllIIIII[14]] = new WorldPoint(lIllIIIII[33], lIllIIIII[34], lIllIIIII[1]);
                                tileItem[ae.lIllIIIII[16]] = new WorldPoint(lIllIIIII[35], lIllIIIII[36], lIllIIIII[1]);
                                tileItem[ae.lIllIIIII[18]] = new WorldPoint(lIllIIIII[37], lIllIIIII[38], lIllIIIII[1]);
                                tileItem[ae.lIllIIIII[19]] = new WorldPoint(lIllIIIII[39], lIllIIIII[38], lIllIIIII[1]);
                                tileItem[ae.lIllIIIII[20]] = new WorldPoint(lIllIIIII[40], lIllIIIII[38], lIllIIIII[1]);
                                tileItem[ae.lIllIIIII[22]] = new WorldPoint(lIllIIIII[41], lIllIIIII[38], lIllIIIII[1]);
                                tileItem[ae.lIllIIIII[42]] = new WorldPoint(lIllIIIII[43], lIllIIIII[44], lIllIIIII[1]);
                                tileItem[ae.lIllIIIII[45]] = new WorldPoint(lIllIIIII[46], lIllIIIII[44], lIllIIIII[1]);
                                lllIIIIIIIllll = tileItem;
                                Walker.walkAlong(Arrays.asList(lllIIIIIIIllll), new HashMap());
                                0;
                                Time.sleepTicks((int)lIllIIIII[2]);
                                0;
                            }
                            if (ae.lIIlIlIIlIlI(Players.getLocal().getWorldLocation().distanceTo(lE), lIllIIIII[21])) {
                                AccBuilderEasyClues.c = lIlIlllII[lIllIIIII[42]];
                                String[] stringArray = new String[lIllIIIII[2]];
                                stringArray[ae.lIllIIIII[1]] = lIlIlllII[lIllIIIII[45]];
                                lllIIIIIIIllll = TileObjects.getNearest((String[])stringArray);
                                String[] stringArray2 = new String[lIllIIIII[2]];
                                stringArray2[ae.lIllIIIII[1]] = lIlIlllII[lIllIIIII[21]];
                                lllIIIIIIIlllI = TileObjects.getNearest((String[])stringArray2);
                                String[] stringArray3 = new String[lIllIIIII[2]];
                                stringArray3[ae.lIllIIIII[1]] = lIlIlllII[lIllIIIII[47]];
                                if (ae.lIIlIlIIIIll(lllIIIIIIIlllI.hasAction(stringArray3) ? 1 : 0)) {
                                    lllIIIIIIIlllI.interact(lIlIlllII[lIllIIIII[48]]);
                                }
                                if (ae.lIIlIlIIIllI(lllIIIIIIIllll)) {
                                    String[] stringArray4 = new String[lIllIIIII[2]];
                                    stringArray4[ae.lIllIIIII[1]] = lIlIlllII[lIllIIIII[49]];
                                    if (ae.lIIlIlIIIlIl(lllIIIIIIIlllI.hasAction(stringArray4) ? 1 : 0)) {
                                        int lllIIIIIIIllIl = Skills.getExperience((Skill)Skill.PRAYER);
                                        int[] nArray3 = new int[lIllIIIII[2]];
                                        nArray3[ae.lIllIIIII[1]] = lIllIIIII[0];
                                        String[] stringArray5 = new String[lIllIIIII[2]];
                                        stringArray5[ae.lIllIIIII[1]] = lIlIlllII[lIllIIIII[50]];
                                        Inventory.getFirst((int[])nArray3).useOn(TileObjects.getNearest((String[])stringArray5));
                                        Time.sleepTicks((int)lIllIIIII[2]);
                                        0;
                                    }
                                }
                            }
                        }
                        int[] nArray4 = new int[lIllIIIII[2]];
                        nArray4[ae.lIllIIIII[1]] = lIllIIIII[0];
                        if (ae.lIIlIlIIIlIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[lIllIIIII[2]];
                            nArray5[ae.lIllIIIII[1]] = lIllIIIII[51];
                            if (ae.lIIlIlIIIIll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                if (ae.lIIlIlIIlIII(Players.getLocal().getWorldLocation().distanceTo(lE), lIllIIIII[21])) {
                                    AccBuilderEasyClues.c = lIlIlllII[lIllIIIII[52]];
                                    WorldPoint[] worldPointArray = new WorldPoint[lIllIIIII[21]];
                                    worldPointArray[ae.lIllIIIII[1]] = new WorldPoint(lIllIIIII[23], lIllIIIII[24], lIllIIIII[1]);
                                    worldPointArray[ae.lIllIIIII[2]] = new WorldPoint(lIllIIIII[25], lIllIIIII[26], lIllIIIII[1]);
                                    worldPointArray[ae.lIllIIIII[4]] = new WorldPoint(lIllIIIII[27], lIllIIIII[28], lIllIIIII[1]);
                                    worldPointArray[ae.lIllIIIII[5]] = new WorldPoint(lIllIIIII[29], lIllIIIII[30], lIllIIIII[1]);
                                    worldPointArray[ae.lIllIIIII[7]] = new WorldPoint(lIllIIIII[31], lIllIIIII[32], lIllIIIII[1]);
                                    worldPointArray[ae.lIllIIIII[14]] = new WorldPoint(lIllIIIII[33], lIllIIIII[34], lIllIIIII[1]);
                                    worldPointArray[ae.lIllIIIII[16]] = new WorldPoint(lIllIIIII[35], lIllIIIII[36], lIllIIIII[1]);
                                    worldPointArray[ae.lIllIIIII[18]] = new WorldPoint(lIllIIIII[37], lIllIIIII[38], lIllIIIII[1]);
                                    worldPointArray[ae.lIllIIIII[19]] = new WorldPoint(lIllIIIII[39], lIllIIIII[38], lIllIIIII[1]);
                                    worldPointArray[ae.lIllIIIII[20]] = new WorldPoint(lIllIIIII[40], lIllIIIII[38], lIllIIIII[1]);
                                    worldPointArray[ae.lIllIIIII[22]] = new WorldPoint(lIllIIIII[41], lIllIIIII[38], lIllIIIII[1]);
                                    worldPointArray[ae.lIllIIIII[42]] = new WorldPoint(lIllIIIII[43], lIllIIIII[44], lIllIIIII[1]);
                                    worldPointArray[ae.lIllIIIII[45]] = new WorldPoint(lIllIIIII[46], lIllIIIII[44], lIllIIIII[1]);
                                    lllIIIIIIIllll = worldPointArray;
                                    Walker.walkAlong(Arrays.asList(lllIIIIIIIllll), new HashMap());
                                    0;
                                    Time.sleepTicks((int)lIllIIIII[2]);
                                    0;
                                }
                                if (ae.lIIlIlIIlIlI(Players.getLocal().getWorldLocation().distanceTo(lE), lIllIIIII[21])) {
                                    AccBuilderEasyClues.c = lIlIlllII[lIllIIIII[53]];
                                    if (!ae.lIIlIlIIIlIl(Dialog.canLevelUpContinue() ? 1 : 0) || ae.lIIlIlIIIIll(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    String[] stringArray = new String[lIllIIIII[2]];
                                    stringArray[ae.lIllIIIII[1]] = lIlIlllII[lIllIIIII[15]];
                                    lllIIIIIIIllll = NPCs.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[lIllIIIII[2]];
                                    stringArray6[ae.lIllIIIII[1]] = lIlIlllII[lIllIIIII[54]];
                                    lllIIIIIIIlllI = TileObjects.getNearest((String[])stringArray6);
                                    String[] stringArray7 = new String[lIllIIIII[2]];
                                    stringArray7[ae.lIllIIIII[1]] = lIlIlllII[lIllIIIII[55]];
                                    if (ae.lIIlIlIIIIll(lllIIIIIIIlllI.hasAction(stringArray7) ? 1 : 0)) {
                                        lllIIIIIIIlllI.interact(lIlIlllII[lIllIIIII[56]]);
                                    }
                                    if (ae.lIIlIlIIIllI(lllIIIIIIIllll)) {
                                        String[] stringArray8 = new String[lIllIIIII[2]];
                                        stringArray8[ae.lIllIIIII[1]] = lIlIlllII[lIllIIIII[57]];
                                        if (ae.lIIlIlIIIlIl(lllIIIIIIIlllI.hasAction(stringArray8) ? 1 : 0)) {
                                            List lllIIIIIIIllIl;
                                            if (ae.lIIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                                int[] nArray6 = new int[lIllIIIII[2]];
                                                nArray6[ae.lIllIIIII[1]] = lIllIIIII[51];
                                                Inventory.getFirst((int[])nArray6).useOn((Actor)lllIIIIIIIllll);
                                                Time.sleepTicks((int)lIllIIIII[4]);
                                                0;
                                            }
                                            if (ae.lIIlIlIIIIll(Dialog.isOpen() ? 1 : 0) && ae.lIIlIlIIIlIl((lllIIIIIIIllIl = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                                                int lllIIIIIIIllII = lIllIIIII[1];
                                                while (ae.lIIlIlIIIlII(lllIIIIIIIllII, lllIIIIIIIllIl.size())) {
                                                    int[] nArray7 = new int[lIllIIIII[2]];
                                                    nArray7[ae.lIllIIIII[1]] = lIllIIIII[51];
                                                    if (ae.lIIlIlIIlIIl(((Item)Inventory.getAll((int[])nArray7).get(lIllIIIII[1])).getQuantity(), lIllIIIII[2]) && ae.lIIlIlIIIIll(((Widget)lllIIIIIIIllIl.get(lllIIIIIIIllII)).getText().contains(lIlIlllII[lIllIIIII[58]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lllIIIIIIIllIl.get(lllIIIIIIIllII)).getClickPoint().getX(), (int)((Widget)lllIIIIIIIllIl.get(lllIIIIIIIllII)).getClickPoint().getY(), (boolean)lIllIIIII[2]);
                                                        Time.sleepTicks((int)lIllIIIII[4]);
                                                        0;
                                                    }
                                                    int[] nArray8 = new int[lIllIIIII[2]];
                                                    nArray8[ae.lIllIIIII[1]] = lIllIIIII[51];
                                                    if (ae.lIIlIlIIlIIl(((Item)Inventory.getAll((int[])nArray8).get(lIllIIIII[1])).getQuantity(), lIllIIIII[14]) && ae.lIIlIlIIIIll(((Widget)lllIIIIIIIllIl.get(lllIIIIIIIllII)).getText().contains(lIlIlllII[lIllIIIII[59]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lllIIIIIIIllIl.get(lllIIIIIIIllII)).getClickPoint().getX(), (int)((Widget)lllIIIIIIIllIl.get(lllIIIIIIIllII)).getClickPoint().getY(), (boolean)lIllIIIII[2]);
                                                        Time.sleepTicks((int)lIllIIIII[4]);
                                                        0;
                                                    }
                                                    if (ae.lIIlIlIIIIll(((Widget)lllIIIIIIIllIl.get(lllIIIIIIIllII)).getText().contains(lIlIlllII[lIllIIIII[60]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lllIIIIIIIllIl.get(lllIIIIIIIllII)).getClickPoint().getX(), (int)((Widget)lllIIIIIIIllIl.get(lllIIIIIIIllII)).getClickPoint().getY(), (boolean)lIllIIIII[2]);
                                                        Time.sleepTicks((int)lIllIIIII[4]);
                                                        0;
                                                    }
                                                    ++lllIIIIIIIllII;
                                                    0;
                                                    if (1 >= -1) continue;
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
                int[] nArray = new int[lIllIIIII[2]];
                nArray[ae.lIllIIIII[1]] = lIllIIIII[10];
                if (!ae.lIIlIlIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray9 = new int[lIllIIIII[2]];
                nArray9[ae.lIllIIIII[1]] = lIllIIIII[0];
                if (!ae.lIIlIlIIIlIl(Inventory.contains((int[])nArray9) ? 1 : 0)) break block44;
                int[] nArray10 = new int[lIllIIIII[2]];
                nArray10[ae.lIllIIIII[1]] = lIllIIIII[51];
                if (!ae.lIIlIlIIIlIl(Inventory.contains((int[])nArray10) ? 1 : 0)) break block44;
            }
            if (ae.lIIlIlIIlIlI(Players.getLocal().getWorldLocation().distanceTo(lE), lIllIIIII[21])) {
                AccBuilderEasyClues.c = lIlIlllII[lIllIIIII[61]];
                String[] stringArray = new String[lIllIIIII[2]];
                stringArray[ae.lIllIIIII[1]] = lIlIlllII[lIllIIIII[62]];
                lllIIIIIIIllll = TileItems.getNearest((String[])stringArray);
                if (ae.lIIlIlIIIllI(lllIIIIIIIllll)) {
                    lllIIIIIIIllll.interact(lIlIlllII[lIllIIIII[63]]);
                }
            }
        }
    }

    private static String lIIlIIllIIlI(String llIllllllllIII, String llIllllllllIIl) {
        try {
            SecretKeySpec llIlllllllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllllllllIIl.getBytes(StandardCharsets.UTF_8)), lIllIIIII[19]), "DES");
            Cipher llIlllllllllII = Cipher.getInstance("DES");
            llIlllllllllII.init(lIllIIIII[4], llIlllllllllIl);
            return new String(llIlllllllllII.doFinal(Base64.getDecoder().decode(llIllllllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIllllllllIll) {
            llIllllllllIll.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIllIIIl(String llIllllllIIlIl, String llIllllllIIlII) {
        llIllllllIIlIl = new String(Base64.getDecoder().decode(llIllllllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIllllllIlIII = new StringBuilder();
        char[] llIllllllIIlll = llIllllllIIlII.toCharArray();
        int llIllllllIIllI = lIllIIIII[1];
        char[] llIllllllIIIII = llIllllllIIlIl.toCharArray();
        int llIlllllIlllll = llIllllllIIIII.length;
        int llIlllllIllllI = lIllIIIII[1];
        while (ae.lIIlIlIIIlII(llIlllllIllllI, llIlllllIlllll)) {
            char llIllllllIlIll = llIllllllIIIII[llIlllllIllllI];
            llIllllllIlIII.append((char)(llIllllllIlIll ^ llIllllllIIlll[llIllllllIIllI % llIllllllIIlll.length]));
            0;
            ++llIllllllIIllI;
            ++llIlllllIllllI;
            0;
            if (((0x57 ^ 0x5E ^ (5 ^ 0x20)) & (0x7C ^ 0x16 ^ (0xD1 ^ 0x97) ^ -1)) >= ((0x1D ^ 0x63 ^ (0x1E ^ 0)) & (93 + 127 - 123 + 144 ^ 140 + 24 - 121 + 102 ^ -1))) continue;
            return null;
        }
        return String.valueOf(llIllllllIlIII);
    }

    private static boolean lIIlIlIIIlll(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIlIIIIll(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (ae.lIIlIlIIlIll(Skills.getLevel((Skill)Skill.PRAYER), lIllIIIII[3])) {
            bl = lIllIIIII[2];
            0;
            if ((2 & ~2) > 0) {
                return false;
            }
        } else {
            bl = lIllIIIII[1];
        }
        return bl;
    }

    public ae() {
        this.lJ = lIllIIIII[0];
    }

    static {
        ae.lIIlIlIIIIlI();
        ae.lIIlIlIIIIIl();
        lC = new WorldPoint(lIllIIIII[77], lIllIIIII[78], lIllIIIII[1]);
        lD = new WorldPoint(lIllIIIII[79], lIllIIIII[80], lIllIIIII[1]);
        lE = new WorldPoint(lIllIIIII[81], lIllIIIII[82], lIllIIIII[1]);
        lF = new WorldPoint(lIllIIIII[83], lIllIIIII[44], lIllIIIII[1]);
        lG = new WorldPoint(lIllIIIII[1], lIllIIIII[1], lIllIIIII[1]);
        lH = new WorldPoint(lIllIIIII[1], lIllIIIII[1], lIllIIIII[1]);
        lI = new WorldPoint(lIllIIIII[84], lIllIIIII[85], lIllIIIII[1]);
        bv = new ArrayList<d>();
    }

    private static boolean lIIlIlIIIllI(Object object) {
        return object != null;
    }

    private static boolean lIIlIlIIlIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIlIIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIlIIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[lIllIIIII[2]];
                nArray[ae.lIllIIIII[1]] = lIllIIIII[10];
                if (!ae.lIIlIlIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIllIIIII[2]];
                nArray2[ae.lIllIIIII[1]] = lIllIIIII[10];
                if (!ae.lIIlIlIIlIll(Inventory.getFirst((int[])nArray2).getQuantity(), lIllIIIII[13])) break block2;
                if (!ae.lIIlIlIIIlIl(Inventory.contains((int[])f.ba) ? 1 : 0)) break block3;
                if (!ae.lIIlIlIIIIll(Equipment.contains((int[])f.ba) ? 1 : 0)) break block2;
                int[] nArray3 = new int[lIllIIIII[2]];
                nArray3[ae.lIllIIIII[1]] = lIllIIIII[0];
                if (!ae.lIIlIlIIIlIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[lIllIIIII[2]];
                nArray4[ae.lIllIIIII[1]] = lIllIIIII[51];
                if (!ae.lIIlIlIIIIll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block2;
            }
            n2 = lIllIIIII[2];
            0;
            if (((148 + 180 - 273 + 153 ^ 7 + 115 - 75 + 96) & (0xFF ^ 0x8C ^ (0x3C ^ 0x10) ^ -1)) == 0) return n2 != 0;
            return ((1 ^ 0x5A ^ (0xE ^ 0x49)) & (9 ^ 5 ^ (0 ^ 0x10) ^ -1)) != 0;
        }
        n2 = lIllIIIII[1];
        return n2 != 0;
    }

    private static boolean lIIlIlIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlIIllIIII(String llIlllllIlIIll, String llIlllllIlIlII) {
        try {
            SecretKeySpec llIlllllIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlllllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlllllIlIlll = Cipher.getInstance("Blowfish");
            llIlllllIlIlll.init(lIllIIIII[4], llIlllllIllIII);
            return new String(llIlllllIlIlll.doFinal(Base64.getDecoder().decode(llIlllllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlllllIlIllI) {
            llIlllllIlIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIlIll(int n2, int n3) {
        return n2 >= n3;
    }
}

