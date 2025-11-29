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

public class aj
implements ab {
    private static /* synthetic */ int[] lIIIIIllll;
    private final /* synthetic */ int mn = 536;
    public static final /* synthetic */ WorldPoint mh;
    static final /* synthetic */ WorldPoint mk;
    static final /* synthetic */ WorldPoint ml;
    public static /* synthetic */ boolean bv;
    public static final /* synthetic */ WorldPoint mi;
    private static /* synthetic */ String[] lIIIIIlllI;
    public static /* synthetic */ List<d> bx;
    public static final /* synthetic */ WorldPoint mj;
    public static final /* synthetic */ WorldPoint mg;
    static final /* synthetic */ WorldPoint mm;

    private static boolean llIllllllIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlllllIlII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String ag() {
        return lIIIIIlllI[lIIIIIllll[75]];
    }

    private static boolean llIlllllIlIl(int n2) {
        return n2 == 0;
    }

    public aj() {
        this.mn = lIIIIIllll[0];
    }

    @Override
    public int af() {
        try {
            aj.ea();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIIIIIllll[74];
    }

    @Override
    public boolean ae() {
        return lIIIIIllll[1];
    }

    private static String llIllllIllll(String lllllIlIlIII, String lllllIlIIlIl) {
        try {
            SecretKeySpec lllllIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllIlIlIlI = Cipher.getInstance("Blowfish");
            lllllIlIlIlI.init(lIIIIIllll[4], lllllIlIlIll);
            return new String(lllllIlIlIlI.doFinal(Base64.getDecoder().decode(lllllIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllIlIlIIl) {
            lllllIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static void llIlllllIIlI() {
        lIIIIIllll = new int[87];
        aj.lIIIIIllll[0] = -(0xFFFFF4FB & 0x7FC6) & (0xFFFFFFFF & 0x76D9);
        aj.lIIIIIllll[1] = (75 + 49 - 61 + 77 ^ 48 + 81 - 7 + 7) & (0x12 ^ 0xB ^ (0x63 ^ 0x77) ^ -1);
        aj.lIIIIIllll[2] = 1;
        aj.lIIIIIllll[3] = 0x83 ^ 0xB6 ^ (0x52 ^ 0x4A);
        aj.lIIIIIllll[4] = 2;
        aj.lIIIIIllll[5] = 3;
        aj.lIIIIIllll[6] = 0xFFFFBFAD & 0x53DA;
        aj.lIIIIIllll[7] = 0x3D ^ 0x39;
        aj.lIIIIIllll[8] = 0xFFFFFAFE & 0x57AF;
        aj.lIIIIIllll[9] = -(0xFFFFC9CF & 0x7EBB) & (0xFFFFFFDF & 0x79FB);
        aj.lIIIIIllll[10] = 0xFFFFE3E7 & 0x1FFB;
        aj.lIIIIIllll[11] = -(0xFFFF98FB & 0x77D7) & (0xFFFFFFF6 & 0x39DF);
        aj.lIIIIIllll[12] = 81 + 153 - 212 + 178;
        aj.lIIIIIllll[13] = 0x4C ^ 0x7E;
        aj.lIIIIIllll[14] = 0x58 ^ 0x5D;
        aj.lIIIIIllll[15] = 5 + 56 - -43 + 42 ^ 37 + 45 - 45 + 97;
        aj.lIIIIIllll[16] = 0xFA ^ 0xB2 ^ (0x64 ^ 0x2A);
        aj.lIIIIIllll[17] = -1;
        aj.lIIIIIllll[18] = 0x7C ^ 0x7B;
        aj.lIIIIIllll[19] = 64 + 3 - 51 + 132 ^ 137 + 121 - 243 + 141;
        aj.lIIIIIllll[20] = 103 + 114 - 188 + 122 ^ 30 + 27 - -16 + 85;
        aj.lIIIIIllll[21] = 0xC1 ^ 0x9F ^ (0xD6 ^ 0x85);
        aj.lIIIIIllll[22] = 0x73 ^ 0x7F ^ (0x2B ^ 0x2D);
        aj.lIIIIIllll[23] = -(0xFFFFFE0B & 0x51F5) & (0xFFFFFBF4 & 0x5FDF);
        aj.lIIIIIllll[24] = -(0xFFFFCAEA & 0x75F7) & (0xFFFFCFFF & 0x7FE3);
        aj.lIIIIIllll[25] = 0xFFFFEFF3 & 0x1BDE;
        aj.lIIIIIllll[26] = 0xFFFF9FFF & 0x6EFB;
        aj.lIIIIIllll[27] = 0xFFFFABCB & 0x5FFF;
        aj.lIIIIIllll[28] = -(0xFFFFF207 & 0x5DFB) & (0xFFFFFEFE & 0x5FFB);
        aj.lIIIIIllll[29] = 0xFFFF8FF7 & 0x7BCF;
        aj.lIIIIIllll[30] = -(0xFFFFF1EF & 0x3F19) & (0xFFFFFFFD & 0x3FFF);
        aj.lIIIIIllll[31] = -(0xFFFFD55F & 0x6AB5) & (0xFFFFFBF6 & 0x4FDF);
        aj.lIIIIIllll[32] = -(0xFFFFFAC9 & 0x653F) & (0xFFFFEEFB & 0x7FFD);
        aj.lIIIIIllll[33] = -(0xFFFFE6FB & 0x3D47) & (0xFFFFBFFF & 0x6FFF);
        aj.lIIIIIllll[34] = 0xFFFFAEFE & 0x5FEF;
        aj.lIIIIIllll[35] = -(0xFFFFB2F7 & 0x5D49) & (0xFFFFDBFF & 0x3FF7);
        aj.lIIIIIllll[36] = 0xFFFF9EEA & 0x6FFF;
        aj.lIIIIIllll[37] = -(0xFFFFED7B & 0x5685) & (0xFFFFCFEF & 0x7FBF);
        aj.lIIIIIllll[38] = -(0xFFFFE72F & 0x19D5) & (0xFFFFEFEF & 0x1FFF);
        aj.lIIIIIllll[39] = 0xFFFF9FE7 & 0x6BBF;
        aj.lIIIIIllll[40] = 0xFFFFCBBF & 0x3FE0;
        aj.lIIIIIllll[41] = 0xFFFFDBFE & 0x2F9B;
        aj.lIIIIIllll[42] = 0xCF ^ 0xC4;
        aj.lIIIIIllll[43] = 0xFFFFCFB3 & 0x3BDF;
        aj.lIIIIIllll[44] = 0xFFFFDEEF & 0x2FFC;
        aj.lIIIIIllll[45] = 0x58 ^ 0x48 ^ (0x5C ^ 0x40);
        aj.lIIIIIllll[46] = -(0xFFFFEE95 & 0x716B) & (0xFFFFEB8F & Short.MAX_VALUE);
        aj.lIIIIIllll[47] = 0x27 ^ 0x29;
        aj.lIIIIIllll[48] = 0x6F ^ 0x4C ^ (0x73 ^ 0x5F);
        aj.lIIIIIllll[49] = 0x43 ^ 2 ^ (0x18 ^ 0x49);
        aj.lIIIIIllll[50] = 0xC ^ 0x1D;
        aj.lIIIIIllll[51] = 0xFFFF9E7D & 0x639B;
        aj.lIIIIIllll[52] = 0x1B ^ 0x49 ^ (0x35 ^ 0x75);
        aj.lIIIIIllll[53] = 0x67 ^ 0x74;
        aj.lIIIIIllll[54] = 0xBD ^ 0xA8;
        aj.lIIIIIllll[55] = 0x9E ^ 0x88;
        aj.lIIIIIllll[56] = 0xEA ^ 0x92 ^ (0xFD ^ 0x92);
        aj.lIIIIIllll[57] = 63 + 136 - 71 + 57 ^ 135 + 94 - 138 + 70;
        aj.lIIIIIllll[58] = 1 ^ (0xA8 ^ 0xB0);
        aj.lIIIIIllll[59] = 0x1F ^ 5;
        aj.lIIIIIllll[60] = 1 ^ (0x29 ^ 0x33);
        aj.lIIIIIllll[61] = 0x17 ^ 0xB;
        aj.lIIIIIllll[62] = 89 + 28 - 58 + 113 ^ 141 + 164 - 240 + 112;
        aj.lIIIIIllll[63] = 0x51 ^ 0x4F;
        aj.lIIIIIllll[64] = -(0xFFFFDF5D & 0x65A7) & (0xFFFFEFFC & 0x5FF7);
        aj.lIIIIIllll[65] = -(0xFFFFD35B & 0x6CA6) & (0xFFFFEEFF & 0x7FCD);
        aj.lIIIIIllll[66] = 0xFFFFE7AA & 0x79FD;
        aj.lIIIIIllll[67] = -(0 + 109 - 49 + 69) & (0xFFFF9FCF & 0x7FF7);
        aj.lIIIIIllll[68] = 51 + 28 - 53 + 131 ^ 109 + 79 - 180 + 173;
        aj.lIIIIIllll[69] = -(0xFFFFB7FA & 0x7877) & (0xFFFFB3FD & 0x7FF7);
        aj.lIIIIIllll[70] = -(0xFFFFFABD & 0x5773) & (0xFFFFFF7F & 0x47FFE);
        aj.lIIIIIllll[71] = 0x28 ^ 0x14;
        aj.lIIIIIllll[72] = 0xFFFF9BC3 & 0x65FE;
        aj.lIIIIIllll[73] = 0xFFFFFB4F & 0xF4F8;
        aj.lIIIIIllll[74] = 0x60 ^ 4;
        aj.lIIIIIllll[75] = 0x20 ^ 0x3F;
        aj.lIIIIIllll[76] = 0xB5 ^ 0x95;
        aj.lIIIIIllll[77] = -(0xFFFFF2F7 & 0x7D29) & (0xFFFFFFFF & 0x7BF5);
        aj.lIIIIIllll[78] = 0xFFFF9F84 & 0x6F7F;
        aj.lIIIIIllll[79] = -(0xFFFFBF77 & 0x74CD) & (0xFFFFFFFE & 0x3FF7);
        aj.lIIIIIllll[80] = -(0xFFFFFE3F & 0x51D7) & (0xFFFFFFFF & 0x5EFF);
        aj.lIIIIIllll[81] = 0xFFFFAFBF & 0x5BC6;
        aj.lIIIIIllll[82] = -(0xFFFFF92F & 0x26D1) & (0xFFFFBFEF & 0x6EFD);
        aj.lIIIIIllll[83] = 0xFFFF8BBF & 0x7FC4;
        aj.lIIIIIllll[84] = 0xFFFFEC96 & 0x1F7F;
        aj.lIIIIIllll[85] = -(0xFFFFBB99 & 0x567F) & (0xFFFFBFFF & 0x5FBB);
        aj.lIIIIIllll[86] = 0xC0 ^ 0xB5 ^ (0x24 ^ 0x70);
    }

    private static boolean llIlllllIIll(int n2) {
        return n2 != 0;
    }

    private static boolean llIllllllIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void llIlllllIIIl() {
        lIIIIIlllI = new String[lIIIIIllll[86]];
        aj.lIIIIIlllI[aj.lIIIIIllll[1]] = aj."Buying items";
        aj.lIIIIIlllI[aj.lIIIIIllll[2]] = aj."Finished buying items, switching back to prayer";
        aj.lIIIIIlllI[aj.lIIIIIllll[4]] = aj."Navigating to bank";
        aj.lIIIIIlllI[aj.lIIIIIllll[5]] = aj."Handling banking";
        aj.lIIIIIlllI[aj.lIIIIIllll[7]] = aj."We are missing prayer supplies, switching to BUYING";
        aj.lIIIIIlllI[aj.lIIIIIllll[14]] = aj."Drink";
        aj.lIIIIIlllI[aj.lIIIIIllll[16]] = aj."Tele to wildy";
        aj.lIIIIIlllI[aj.lIIIIIllll[18]] = aj."Rub";
        aj.lIIIIIlllI[aj.lIIIIIllll[19]] = aj."Lava Maze";
        aj.lIIIIIlllI[aj.lIIIIIllll[20]] = aj."Okay, teleport to level 41 Wilderness.";
        aj.lIIIIIlllI[aj.lIIIIIllll[22]] = aj."Nav to altar";
        aj.lIIIIIlllI[aj.lIIIIIllll[42]] = aj."1 tick pray";
        aj.lIIIIIlllI[aj.lIIIIIllll[45]] = aj."Chaos altar";
        aj.lIIIIIlllI[aj.lIIIIIllll[21]] = aj."Large door";
        aj.lIIIIIlllI[aj.lIIIIIllll[47]] = aj."Open";
        aj.lIIIIIlllI[aj.lIIIIIllll[48]] = aj."Open";
        aj.lIIIIIlllI[aj.lIIIIIllll[49]] = aj."Open";
        aj.lIIIIIlllI[aj.lIIIIIllll[50]] = aj."Chaos altar";
        aj.lIIIIIlllI[aj.lIIIIIllll[52]] = aj."Nav to altar";
        aj.lIIIIIlllI[aj.lIIIIIllll[53]] = aj."Unnoting bones";
        aj.lIIIIIlllI[aj.lIIIIIllll[15]] = aj."Elder Chaos druid";
        aj.lIIIIIlllI[aj.lIIIIIllll[54]] = aj."Large door";
        aj.lIIIIIlllI[aj.lIIIIIllll[55]] = aj."Open";
        aj.lIIIIIlllI[aj.lIIIIIllll[56]] = aj."Open";
        aj.lIIIIIlllI[aj.lIIIIIllll[57]] = aj."Open";
        aj.lIIIIIlllI[aj.lIIIIIllll[58]] = aj."Exchange";
        aj.lIIIIIlllI[aj.lIIIIIllll[59]] = aj."Exchange 5";
        aj.lIIIIIlllI[aj.lIIIIIllll[60]] = aj."Exchange All";
        aj.lIIIIIlllI[aj.lIIIIIllll[61]] = aj."Suiciding";
        aj.lIIIIIlllI[aj.lIIIIIllll[62]] = aj."Wine of zamorak";
        aj.lIIIIIlllI[aj.lIIIIIllll[63]] = aj."Take";
        aj.lIIIIIlllI[aj.lIIIIIllll[75]] = aj."Prayer training";
        aj.lIIIIIlllI[aj.lIIIIIllll[76]] = aj."ring of wealth (";
    }

    private static String llIllllIlllI(String lllllIIllIIl, String lllllIIllIII) {
        try {
            SecretKeySpec lllllIIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllIIllIII.getBytes(StandardCharsets.UTF_8)), lIIIIIllll[19]), "DES");
            Cipher lllllIIlllIl = Cipher.getInstance("DES");
            lllllIIlllIl.init(lIIIIIllll[4], lllllIIllllI);
            return new String(lllllIIlllIl.doFinal(Base64.getDecoder().decode(lllllIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllIIlllII) {
            lllllIIlllII.printStackTrace();
            return null;
        }
    }

    private static int eb() {
        int n2 = lIIIIIllll[70];
        if (aj.llIlllllIlII(Skills.getLevel((Skill)Skill.PRAYER), lIIIIIllll[71]) && aj.llIllllllIll(Skills.getLevel((Skill)Skill.PRAYER), lIIIIIllll[3])) {
            return (n2 - Skills.getExperience((Skill)Skill.PRAYER)) / lIIIIIllll[72] + lIIIIIllll[22];
        }
        int n3 = lIIIIIllll[73];
        return (n3 - Skills.getExperience((Skill)Skill.PRAYER)) / lIIIIIllll[72] + lIIIIIllll[63];
    }

    private static boolean llIllllllIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIllllllIlI(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[lIIIIIllll[2]];
                nArray[aj.lIIIIIllll[1]] = lIIIIIllll[10];
                if (!aj.llIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIIIIIllll[2]];
                nArray2[aj.lIIIIIllll[1]] = lIIIIIllll[10];
                if (!aj.llIllllllIll(Inventory.getFirst((int[])nArray2).getQuantity(), lIIIIIllll[13])) break block2;
                if (!aj.llIlllllIlIl(Inventory.contains((int[])f.bh) ? 1 : 0)) break block3;
                if (!aj.llIlllllIIll(Equipment.contains((int[])f.bh) ? 1 : 0)) break block2;
                int[] nArray3 = new int[lIIIIIllll[2]];
                nArray3[aj.lIIIIIllll[1]] = lIIIIIllll[0];
                if (!aj.llIlllllIlIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[lIIIIIllll[2]];
                nArray4[aj.lIIIIIllll[1]] = lIIIIIllll[51];
                if (!aj.llIlllllIIll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block2;
            }
            n2 = lIIIIIllll[2];
            0;
            if (2 > -1) return n2 != 0;
            return (1 & ~1) != 0;
        }
        n2 = lIIIIIllll[1];
        return n2 != 0;
    }

    static {
        aj.llIlllllIIlI();
        aj.llIlllllIIIl();
        mg = new WorldPoint(lIIIIIllll[77], lIIIIIllll[78], lIIIIIllll[1]);
        mh = new WorldPoint(lIIIIIllll[79], lIIIIIllll[80], lIIIIIllll[1]);
        mi = new WorldPoint(lIIIIIllll[81], lIIIIIllll[82], lIIIIIllll[1]);
        mj = new WorldPoint(lIIIIIllll[83], lIIIIIllll[44], lIIIIIllll[1]);
        mk = new WorldPoint(lIIIIIllll[1], lIIIIIllll[1], lIIIIIllll[1]);
        ml = new WorldPoint(lIIIIIllll[1], lIIIIIllll[1], lIIIIIllll[1]);
        mm = new WorldPoint(lIIIIIllll[84], lIIIIIllll[85], lIIIIIllll[1]);
        bx = new ArrayList<d>();
    }

    public static void ea() {
        block44: {
            TileItem lllllIllllIl;
            block45: {
                if (aj.llIlllllIIll(bv ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIlllI[lIIIIIllll[1]];
                    b.a(bx);
                    if (aj.llIlllllIlII(bx.size(), lIIIIIllll[2])) {
                        System.out.println(lIIIIIlllI[lIIIIIllll[2]]);
                        bv = lIIIIIllll[1];
                    }
                }
                if (!aj.llIlllllIlIl(bv ? 1 : 0) || !aj.llIlllllIlII(Skills.getLevel((Skill)Skill.PRAYER), lIIIIIllll[3])) break block44;
                if (aj.llIlllllIlIl(aj.an() ? 1 : 0) && aj.llIlllllIlII(Game.getWildyLevel(), lIIIIIllll[2])) {
                    lllllIllllIl = BankLocation.getNearest();
                    if (aj.llIlllllIllI(lllllIllllIl) && aj.llIlllllIlIl(lllllIllllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIIlllI[lIIIIIllll[4]];
                        a.a((BankLocation)lllllIllllIl);
                    }
                    if (aj.llIlllllIllI(lllllIllllIl) && aj.llIlllllIIll(lllllIllllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIIlllI[lIIIIIllll[5]];
                        if (aj.llIlllllIlIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIllll[6]);
                            0;
                        }
                        if (aj.llIlllllIIll(Bank.isOpen() ? 1 : 0)) {
                            if (aj.llIlllllIlll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIIIIllll[7]);
                                0;
                            }
                            if (aj.llIlllllIlll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIIIIllll[4]);
                                0;
                            }
                            int[] nArray = new int[lIIIIIllll[5]];
                            nArray[aj.lIIIIIllll[1]] = lIIIIIllll[8];
                            nArray[aj.lIIIIIllll[2]] = lIIIIIllll[0];
                            nArray[aj.lIIIIIllll[4]] = lIIIIIllll[9];
                            if (aj.llIlllllIlIl(e.d(nArray) ? 1 : 0)) {
                                aj.Q();
                                System.out.println(lIIIIIlllI[lIIIIIllll[7]]);
                                bv = lIIIIIllll[2];
                                return;
                            }
                            int[] nArray2 = new int[lIIIIIllll[5]];
                            nArray2[aj.lIIIIIllll[1]] = lIIIIIllll[8];
                            nArray2[aj.lIIIIIllll[2]] = lIIIIIllll[0];
                            nArray2[aj.lIIIIIllll[4]] = lIIIIIllll[9];
                            if (aj.llIlllllIIll(e.d(nArray2) ? 1 : 0)) {
                                if (aj.llIlllllIlIl(Equipment.contains((int[])f.bh) ? 1 : 0)) {
                                    a.b(f.bh, lIIIIIllll[2]);
                                }
                                a.b(f.bc, lIIIIIllll[2]);
                                a.a(lIIIIIllll[10], lIIIIIllll[11]);
                                a.b(lIIIIIllll[0], lIIIIIllll[12]);
                            }
                        }
                    }
                }
                if (aj.llIlllllIIll(aj.an() ? 1 : 0)) {
                    if (aj.llIlllllIIll(Inventory.contains((int[])f.bc) ? 1 : 0) && aj.llIlllllIlII(Movement.getRunEnergy(), lIIIIIllll[13])) {
                        Inventory.getFirst((int[])f.bc).interact(lIIIIIlllI[lIIIIIllll[14]]);
                        Time.sleepTicks((int)lIIIIIllll[2]);
                        0;
                    }
                    if (aj.llIlllllIlIl(Movement.isRunEnabled() ? 1 : 0) && aj.llIllllllIII(Movement.getRunEnergy(), lIIIIIllll[15])) {
                        Movement.toggleRun();
                        Time.sleepTicks((int)lIIIIIllll[14]);
                        0;
                    }
                    if (aj.llIlllllIlII(Game.getWildyLevel(), lIIIIIllll[2])) {
                        AccBuilderGWD.c = lIIIIIlllI[lIIIIIllll[16]];
                        if (aj.llIlllllIIll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (aj.llIlllllIlIl(Dialog.isOpen() ? 1 : 0) && aj.llIlllllIIll(Inventory.contains((int[])f.bh) ? 1 : 0) && aj.llIllllllIIl(Players.getLocal().getAnimation(), lIIIIIllll[17])) {
                            Inventory.getFirst((int[])f.bh).interact(lIIIIIlllI[lIIIIIllll[18]]);
                            Time.sleepTicks((int)lIIIIIllll[4]);
                            0;
                        }
                        String[] stringArray = new String[lIIIIIllll[4]];
                        stringArray[aj.lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[19]];
                        stringArray[aj.lIIIIIllll[2]] = lIIIIIlllI[lIIIIIllll[20]];
                        g.a(stringArray);
                    }
                    if (aj.llIlllllIlll(Game.getWildyLevel())) {
                        TileObject lllllIllllII;
                        int[] nArray = new int[lIIIIIllll[2]];
                        nArray[aj.lIIIIIllll[1]] = lIIIIIllll[0];
                        if (aj.llIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            if (aj.llIllllllIII(Players.getLocal().getWorldLocation().distanceTo(mi), lIIIIIllll[21])) {
                                AccBuilderGWD.c = lIIIIIlllI[lIIIIIllll[22]];
                                TileItem tileItem = new WorldPoint[lIIIIIllll[21]];
                                tileItem[aj.lIIIIIllll[1]] = new WorldPoint(lIIIIIllll[23], lIIIIIllll[24], lIIIIIllll[1]);
                                tileItem[aj.lIIIIIllll[2]] = new WorldPoint(lIIIIIllll[25], lIIIIIllll[26], lIIIIIllll[1]);
                                tileItem[aj.lIIIIIllll[4]] = new WorldPoint(lIIIIIllll[27], lIIIIIllll[28], lIIIIIllll[1]);
                                tileItem[aj.lIIIIIllll[5]] = new WorldPoint(lIIIIIllll[29], lIIIIIllll[30], lIIIIIllll[1]);
                                tileItem[aj.lIIIIIllll[7]] = new WorldPoint(lIIIIIllll[31], lIIIIIllll[32], lIIIIIllll[1]);
                                tileItem[aj.lIIIIIllll[14]] = new WorldPoint(lIIIIIllll[33], lIIIIIllll[34], lIIIIIllll[1]);
                                tileItem[aj.lIIIIIllll[16]] = new WorldPoint(lIIIIIllll[35], lIIIIIllll[36], lIIIIIllll[1]);
                                tileItem[aj.lIIIIIllll[18]] = new WorldPoint(lIIIIIllll[37], lIIIIIllll[38], lIIIIIllll[1]);
                                tileItem[aj.lIIIIIllll[19]] = new WorldPoint(lIIIIIllll[39], lIIIIIllll[38], lIIIIIllll[1]);
                                tileItem[aj.lIIIIIllll[20]] = new WorldPoint(lIIIIIllll[40], lIIIIIllll[38], lIIIIIllll[1]);
                                tileItem[aj.lIIIIIllll[22]] = new WorldPoint(lIIIIIllll[41], lIIIIIllll[38], lIIIIIllll[1]);
                                tileItem[aj.lIIIIIllll[42]] = new WorldPoint(lIIIIIllll[43], lIIIIIllll[44], lIIIIIllll[1]);
                                tileItem[aj.lIIIIIllll[45]] = new WorldPoint(lIIIIIllll[46], lIIIIIllll[44], lIIIIIllll[1]);
                                lllllIllllIl = tileItem;
                                Walker.walkAlong(Arrays.asList(lllllIllllIl), new HashMap());
                                0;
                                Time.sleepTicks((int)lIIIIIllll[2]);
                                0;
                            }
                            if (aj.llIllllllIlI(Players.getLocal().getWorldLocation().distanceTo(mi), lIIIIIllll[21])) {
                                AccBuilderGWD.c = lIIIIIlllI[lIIIIIllll[42]];
                                String[] stringArray = new String[lIIIIIllll[2]];
                                stringArray[aj.lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[45]];
                                lllllIllllIl = TileObjects.getNearest((String[])stringArray);
                                String[] stringArray2 = new String[lIIIIIllll[2]];
                                stringArray2[aj.lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[21]];
                                lllllIllllII = TileObjects.getNearest((String[])stringArray2);
                                String[] stringArray3 = new String[lIIIIIllll[2]];
                                stringArray3[aj.lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[47]];
                                if (aj.llIlllllIIll(lllllIllllII.hasAction(stringArray3) ? 1 : 0)) {
                                    lllllIllllII.interact(lIIIIIlllI[lIIIIIllll[48]]);
                                }
                                if (aj.llIlllllIllI(lllllIllllIl)) {
                                    String[] stringArray4 = new String[lIIIIIllll[2]];
                                    stringArray4[aj.lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[49]];
                                    if (aj.llIlllllIlIl(lllllIllllII.hasAction(stringArray4) ? 1 : 0)) {
                                        int lllllIlllIll = Skills.getExperience((Skill)Skill.PRAYER);
                                        int[] nArray3 = new int[lIIIIIllll[2]];
                                        nArray3[aj.lIIIIIllll[1]] = lIIIIIllll[0];
                                        String[] stringArray5 = new String[lIIIIIllll[2]];
                                        stringArray5[aj.lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[50]];
                                        Inventory.getFirst((int[])nArray3).useOn(TileObjects.getNearest((String[])stringArray5));
                                        Time.sleepTicks((int)lIIIIIllll[2]);
                                        0;
                                    }
                                }
                            }
                        }
                        int[] nArray4 = new int[lIIIIIllll[2]];
                        nArray4[aj.lIIIIIllll[1]] = lIIIIIllll[0];
                        if (aj.llIlllllIlIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[lIIIIIllll[2]];
                            nArray5[aj.lIIIIIllll[1]] = lIIIIIllll[51];
                            if (aj.llIlllllIIll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                if (aj.llIllllllIII(Players.getLocal().getWorldLocation().distanceTo(mi), lIIIIIllll[21])) {
                                    AccBuilderGWD.c = lIIIIIlllI[lIIIIIllll[52]];
                                    WorldPoint[] worldPointArray = new WorldPoint[lIIIIIllll[21]];
                                    worldPointArray[aj.lIIIIIllll[1]] = new WorldPoint(lIIIIIllll[23], lIIIIIllll[24], lIIIIIllll[1]);
                                    worldPointArray[aj.lIIIIIllll[2]] = new WorldPoint(lIIIIIllll[25], lIIIIIllll[26], lIIIIIllll[1]);
                                    worldPointArray[aj.lIIIIIllll[4]] = new WorldPoint(lIIIIIllll[27], lIIIIIllll[28], lIIIIIllll[1]);
                                    worldPointArray[aj.lIIIIIllll[5]] = new WorldPoint(lIIIIIllll[29], lIIIIIllll[30], lIIIIIllll[1]);
                                    worldPointArray[aj.lIIIIIllll[7]] = new WorldPoint(lIIIIIllll[31], lIIIIIllll[32], lIIIIIllll[1]);
                                    worldPointArray[aj.lIIIIIllll[14]] = new WorldPoint(lIIIIIllll[33], lIIIIIllll[34], lIIIIIllll[1]);
                                    worldPointArray[aj.lIIIIIllll[16]] = new WorldPoint(lIIIIIllll[35], lIIIIIllll[36], lIIIIIllll[1]);
                                    worldPointArray[aj.lIIIIIllll[18]] = new WorldPoint(lIIIIIllll[37], lIIIIIllll[38], lIIIIIllll[1]);
                                    worldPointArray[aj.lIIIIIllll[19]] = new WorldPoint(lIIIIIllll[39], lIIIIIllll[38], lIIIIIllll[1]);
                                    worldPointArray[aj.lIIIIIllll[20]] = new WorldPoint(lIIIIIllll[40], lIIIIIllll[38], lIIIIIllll[1]);
                                    worldPointArray[aj.lIIIIIllll[22]] = new WorldPoint(lIIIIIllll[41], lIIIIIllll[38], lIIIIIllll[1]);
                                    worldPointArray[aj.lIIIIIllll[42]] = new WorldPoint(lIIIIIllll[43], lIIIIIllll[44], lIIIIIllll[1]);
                                    worldPointArray[aj.lIIIIIllll[45]] = new WorldPoint(lIIIIIllll[46], lIIIIIllll[44], lIIIIIllll[1]);
                                    lllllIllllIl = worldPointArray;
                                    Walker.walkAlong(Arrays.asList(lllllIllllIl), new HashMap());
                                    0;
                                    Time.sleepTicks((int)lIIIIIllll[2]);
                                    0;
                                }
                                if (aj.llIllllllIlI(Players.getLocal().getWorldLocation().distanceTo(mi), lIIIIIllll[21])) {
                                    AccBuilderGWD.c = lIIIIIlllI[lIIIIIllll[53]];
                                    if (!aj.llIlllllIlIl(Dialog.canLevelUpContinue() ? 1 : 0) || aj.llIlllllIIll(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    String[] stringArray = new String[lIIIIIllll[2]];
                                    stringArray[aj.lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[15]];
                                    lllllIllllIl = NPCs.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[lIIIIIllll[2]];
                                    stringArray6[aj.lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[54]];
                                    lllllIllllII = TileObjects.getNearest((String[])stringArray6);
                                    String[] stringArray7 = new String[lIIIIIllll[2]];
                                    stringArray7[aj.lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[55]];
                                    if (aj.llIlllllIIll(lllllIllllII.hasAction(stringArray7) ? 1 : 0)) {
                                        lllllIllllII.interact(lIIIIIlllI[lIIIIIllll[56]]);
                                    }
                                    if (aj.llIlllllIllI(lllllIllllIl)) {
                                        String[] stringArray8 = new String[lIIIIIllll[2]];
                                        stringArray8[aj.lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[57]];
                                        if (aj.llIlllllIlIl(lllllIllllII.hasAction(stringArray8) ? 1 : 0)) {
                                            List lllllIlllIll;
                                            if (aj.llIlllllIlIl(Dialog.isOpen() ? 1 : 0)) {
                                                int[] nArray6 = new int[lIIIIIllll[2]];
                                                nArray6[aj.lIIIIIllll[1]] = lIIIIIllll[51];
                                                Inventory.getFirst((int[])nArray6).useOn((Actor)lllllIllllIl);
                                                Time.sleepTicks((int)lIIIIIllll[4]);
                                                0;
                                            }
                                            if (aj.llIlllllIIll(Dialog.isOpen() ? 1 : 0) && aj.llIlllllIlIl((lllllIlllIll = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                                                int lllllIlllIlI = lIIIIIllll[1];
                                                while (aj.llIlllllIlII(lllllIlllIlI, lllllIlllIll.size())) {
                                                    int[] nArray7 = new int[lIIIIIllll[2]];
                                                    nArray7[aj.lIIIIIllll[1]] = lIIIIIllll[51];
                                                    if (aj.llIllllllIIl(((Item)Inventory.getAll((int[])nArray7).get(lIIIIIllll[1])).getQuantity(), lIIIIIllll[2]) && aj.llIlllllIIll(((Widget)lllllIlllIll.get(lllllIlllIlI)).getText().contains(lIIIIIlllI[lIIIIIllll[58]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lllllIlllIll.get(lllllIlllIlI)).getClickPoint().getX(), (int)((Widget)lllllIlllIll.get(lllllIlllIlI)).getClickPoint().getY(), (boolean)lIIIIIllll[2]);
                                                        Time.sleepTicks((int)lIIIIIllll[4]);
                                                        0;
                                                    }
                                                    int[] nArray8 = new int[lIIIIIllll[2]];
                                                    nArray8[aj.lIIIIIllll[1]] = lIIIIIllll[51];
                                                    if (aj.llIllllllIIl(((Item)Inventory.getAll((int[])nArray8).get(lIIIIIllll[1])).getQuantity(), lIIIIIllll[14]) && aj.llIlllllIIll(((Widget)lllllIlllIll.get(lllllIlllIlI)).getText().contains(lIIIIIlllI[lIIIIIllll[59]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lllllIlllIll.get(lllllIlllIlI)).getClickPoint().getX(), (int)((Widget)lllllIlllIll.get(lllllIlllIlI)).getClickPoint().getY(), (boolean)lIIIIIllll[2]);
                                                        Time.sleepTicks((int)lIIIIIllll[4]);
                                                        0;
                                                    }
                                                    if (aj.llIlllllIIll(((Widget)lllllIlllIll.get(lllllIlllIlI)).getText().contains(lIIIIIlllI[lIIIIIllll[60]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lllllIlllIll.get(lllllIlllIlI)).getClickPoint().getX(), (int)((Widget)lllllIlllIll.get(lllllIlllIlI)).getClickPoint().getY(), (boolean)lIIIIIllll[2]);
                                                        Time.sleepTicks((int)lIIIIIllll[4]);
                                                        0;
                                                    }
                                                    ++lllllIlllIlI;
                                                    0;
                                                    if (1 >= 0) continue;
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
                int[] nArray = new int[lIIIIIllll[2]];
                nArray[aj.lIIIIIllll[1]] = lIIIIIllll[10];
                if (!aj.llIlllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray9 = new int[lIIIIIllll[2]];
                nArray9[aj.lIIIIIllll[1]] = lIIIIIllll[0];
                if (!aj.llIlllllIlIl(Inventory.contains((int[])nArray9) ? 1 : 0)) break block44;
                int[] nArray10 = new int[lIIIIIllll[2]];
                nArray10[aj.lIIIIIllll[1]] = lIIIIIllll[51];
                if (!aj.llIlllllIlIl(Inventory.contains((int[])nArray10) ? 1 : 0)) break block44;
            }
            if (aj.llIllllllIlI(Players.getLocal().getWorldLocation().distanceTo(mi), lIIIIIllll[21])) {
                AccBuilderGWD.c = lIIIIIlllI[lIIIIIllll[61]];
                String[] stringArray = new String[lIIIIIllll[2]];
                stringArray[aj.lIIIIIllll[1]] = lIIIIIlllI[lIIIIIllll[62]];
                lllllIllllIl = TileItems.getNearest((String[])stringArray);
                if (aj.llIlllllIllI(lllllIllllIl)) {
                    lllllIllllIl.interact(lIIIIIlllI[lIIIIIllll[63]]);
                }
            }
        }
    }

    private static boolean llIlllllIllI(Object object) {
        return object != null;
    }

    private static boolean llIlllllIlll(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (aj.llIllllllIll(Skills.getLevel((Skill)Skill.PRAYER), lIIIIIllll[3])) {
            bl = lIIIIIllll[2];
            0;
            if (3 <= 0) {
                return false;
            }
        } else {
            bl = lIIIIIllll[1];
        }
        return bl;
    }

    private static String llIlllllIIII(String lllllIIIlIll, String lllllIIIIlIl) {
        lllllIIIlIll = new String(Base64.getDecoder().decode(lllllIIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllIIIlIIl = new StringBuilder();
        char[] lllllIIIlIII = lllllIIIIlIl.toCharArray();
        int lllllIIIIlll = lIIIIIllll[1];
        char[] lllllIIIIIIl = lllllIIIlIll.toCharArray();
        int lllllIIIIIII = lllllIIIIIIl.length;
        int llllIlllllll = lIIIIIllll[1];
        while (aj.llIlllllIlII(llllIlllllll, lllllIIIIIII)) {
            char lllllIIIllII = lllllIIIIIIl[llllIlllllll];
            lllllIIIlIIl.append((char)(lllllIIIllII ^ lllllIIIlIII[lllllIIIIlll % lllllIIIlIII.length]));
            0;
            ++lllllIIIIlll;
            ++llllIlllllll;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(lllllIIIlIIl);
    }

    private static void Q() {
        d lllllIllIllI;
        Object lllllIllIlll;
        int[] nArray = new int[lIIIIIllll[2]];
        nArray[aj.lIIIIIllll[1]] = lIIIIIllll[9];
        if (aj.llIlllllIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIIIIIllll[9], lIIIIIllll[14], j.ch);
            bx.add(d2);
            0;
        }
        int[] nArray2 = new int[lIIIIIllll[2]];
        nArray2[aj.lIIIIIllll[1]] = lIIIIIllll[0];
        if (aj.llIlllllIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllllIllIlll = new d(lIIIIIllll[0], aj.eb(), lIIIIIllll[64]);
            bx.add((d)lllllIllIlll);
            0;
        }
        int[] nArray3 = new int[lIIIIIllll[2]];
        nArray3[aj.lIIIIIllll[1]] = lIIIIIllll[8];
        if (aj.llIlllllIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllllIllIlll = new d(lIIIIIllll[8], lIIIIIllll[4], lIIIIIllll[6]);
            bx.add((d)lllllIllIlll);
            0;
        }
        if (aj.llIlllllIlIl(Bank.contains((Predicate)(lllllIllIlll = item -> item.getName().toLowerCase().contains(lIIIIIlllI[lIIIIIllll[76]]))) ? 1 : 0)) {
            lllllIllIllI = new d(lIIIIIllll[65], lIIIIIllll[14], lIIIIIllll[66]);
            bx.add(lllllIllIllI);
            0;
        }
        int[] nArray4 = new int[lIIIIIllll[2]];
        nArray4[aj.lIIIIIllll[1]] = lIIIIIllll[67];
        if (aj.llIlllllIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lllllIllIllI = new d(lIIIIIllll[67], lIIIIIllll[68], lIIIIIllll[69]);
            bx.add(lllllIllIllI);
            0;
        }
    }
}

