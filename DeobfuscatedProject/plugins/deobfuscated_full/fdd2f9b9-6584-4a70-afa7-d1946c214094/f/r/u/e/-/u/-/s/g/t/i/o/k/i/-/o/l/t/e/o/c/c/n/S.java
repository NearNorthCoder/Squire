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

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.b;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.d;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.f;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.g;
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

public class S
implements G {
    static final /* synthetic */ WorldPoint jy;
    public static final /* synthetic */ WorldPoint jt;
    private static /* synthetic */ int[] lIIllIlllI;
    public static /* synthetic */ boolean bt;
    private final /* synthetic */ int jA = 536;
    public static final /* synthetic */ WorldPoint jv;
    public static /* synthetic */ List<d> bv;
    static final /* synthetic */ WorldPoint jz;
    private static /* synthetic */ String[] lIIllIllIl;
    static final /* synthetic */ WorldPoint jx;
    public static final /* synthetic */ WorldPoint jw;
    public static final /* synthetic */ WorldPoint ju;

    @Override
    public boolean V() {
        boolean bl;
        if (S.lIIIIIllIlIII(Skills.getLevel((Skill)Skill.PRAYER), lIIllIlllI[76])) {
            bl = lIIllIlllI[2];
            0;
            if (1 >= (8 ^ 0xC)) {
                return false;
            }
        } else {
            bl = lIIllIlllI[1];
        }
        return bl;
    }

    private static boolean lIIIIIllIIIlI(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean S() {
        return lIIllIlllI[1];
    }

    private static void lIIIIIlIlllll() {
        lIIllIlllI = new int[88];
        S.lIIllIlllI[0] = 0xFFFFBA7F & 0x4798;
        S.lIIllIlllI[1] = (0xCB ^ 0xB8 ^ (0xA8 ^ 0x81)) & (37 + 82 - 29 + 117 ^ 23 + 91 - 10 + 45 ^ -1);
        S.lIIllIlllI[2] = 1;
        S.lIIllIlllI[3] = 2;
        S.lIIllIlllI[4] = 3;
        S.lIIllIlllI[5] = -(0xFFFFA47C & 0x7FFB) & (0xFFFFF7FF & 0x3FFF);
        S.lIIllIlllI[6] = 0x69 ^ 0x42 ^ (0x65 ^ 0x4A);
        S.lIIllIlllI[7] = 0xFFFFFABE & 0x57EF;
        S.lIIllIlllI[8] = 0xFFFFF3D3 & 0x3D7D;
        S.lIIllIlllI[9] = -(0xFFFFFD1B & 0x26F5) & (0xFFFFE7F3 & 0x3FFF);
        S.lIIllIlllI[10] = -(0xFFFFEEF7 & 0x557A) & (0xFFFFFFFF & 0x6D75);
        S.lIIllIlllI[11] = 13 + 101 - 100 + 186;
        S.lIIllIlllI[12] = 0x73 ^ 0x37 ^ (0xF7 ^ 0x81);
        S.lIIllIlllI[13] = 0x9C ^ 0xB4 ^ (0xAF ^ 0x82);
        S.lIIllIlllI[14] = 0xC ^ 0x18;
        S.lIIllIlllI[15] = 0 ^ 0xE ^ (0xA3 ^ 0xAB);
        S.lIIllIlllI[16] = -1;
        S.lIIllIlllI[17] = 101 + 168 - 220 + 137 ^ 14 + 79 - -18 + 78;
        S.lIIllIlllI[18] = 0x72 ^ 0x7A;
        S.lIIllIlllI[19] = 15 + 81 - 53 + 161 ^ 177 + 127 - 299 + 192;
        S.lIIllIlllI[20] = 0x7C ^ 0x71;
        S.lIIllIlllI[21] = 0xA9 ^ 0xA3;
        S.lIIllIlllI[22] = 0xFFFFABFD & 0x5FD6;
        S.lIIllIlllI[23] = -(0xFFFFFFDB & 0x60BE) & (0xFFFFFFFF & 0x6F9B);
        S.lIIllIlllI[24] = 0xFFFFFFD6 & 0xBFB;
        S.lIIllIlllI[25] = -(0xFFFFF5A7 & 0x5B59) & (0xFFFFFFFF & 0x5FFB);
        S.lIIllIlllI[26] = -(0xFFFFF57F & 0x6A85) & (0xFFFFFFFF & 0x6BCF);
        S.lIIllIlllI[27] = 0xFFFFBFF8 & 0x4EFF;
        S.lIIllIlllI[28] = 0xFFFFBBF7 & 0x4FCF;
        S.lIIllIlllI[29] = -3 & (0xFFFF8EFF & 0x7FF7);
        S.lIIllIlllI[30] = 0xFFFFEFD2 & 0x1BEF;
        S.lIIllIlllI[31] = -(0xFFFFF83B & 0x37C5) & (0xFFFFFFFB & 0x3EF5);
        S.lIIllIlllI[32] = -(0xFFFFC7BB & 0x3C47) & (0xFFFFEFFF & 0x1FBF);
        S.lIIllIlllI[33] = 0xFFFFBEFF & 0x4FEE;
        S.lIIllIlllI[34] = 0xFFFF9FB7 & 0x6BFF;
        S.lIIllIlllI[35] = -(0xFFFFE7F5 & 0x591F) & (0xFFFFFFFF & 0x4FFE);
        S.lIIllIlllI[36] = 0xFFFFDFAF & 0x2BFF;
        S.lIIllIlllI[37] = 0xFFFFAEFB & 0x5FEF;
        S.lIIllIlllI[38] = -(0xFFFFEFDF & 0x7461) & (0xFFFFEFEF & 0x7FF7);
        S.lIIllIlllI[39] = 0xFFFFBBE4 & 0x4FBB;
        S.lIIllIlllI[40] = -(0xFFFFFD07 & 0x52FE) & (0xFFFFDBFF & 0x7F9F);
        S.lIIllIlllI[41] = 0xB5 ^ 0xBE;
        S.lIIllIlllI[42] = -(0xFFFFFCE7 & 0x4739) & (0xFFFFEFBF & 0x5FF3);
        S.lIIllIlllI[43] = 0xFFFFCFFF & 0x3EEC;
        S.lIIllIlllI[44] = 0x33 ^ 0x27 ^ (0x5D ^ 0x45);
        S.lIIllIlllI[45] = 0xFFFFABAF & 0x5FDF;
        S.lIIllIlllI[46] = 0x29 ^ 0x12 ^ (0x10 ^ 0x25);
        S.lIIllIlllI[47] = 0xFD ^ 0xBC ^ (3 ^ 0x4D);
        S.lIIllIlllI[48] = 0x5B ^ 0x4B;
        S.lIIllIlllI[49] = 0x7F ^ 0x6E;
        S.lIIllIlllI[50] = 0xFFFF833F & 0x7ED9;
        S.lIIllIlllI[51] = 0x18 ^ 0x51 ^ (0xA ^ 0x51);
        S.lIIllIlllI[52] = 0x49 ^ 0x25 ^ 66 + 6 - 47 + 102;
        S.lIIllIlllI[53] = 0xB2 ^ 0xA7;
        S.lIIllIlllI[54] = 44 + 89 - 17 + 14 ^ 22 + 38 - 4 + 92;
        S.lIIllIlllI[55] = 0x5A ^ 0x4D;
        S.lIIllIlllI[56] = 0x9B ^ 0x83;
        S.lIIllIlllI[57] = 0x5B ^ 0x42;
        S.lIIllIlllI[58] = 0x2B ^ 0x31;
        S.lIIllIlllI[59] = 0xA8 ^ 0xB3;
        S.lIIllIlllI[60] = 0x1F ^ 0xD ^ (0x87 ^ 0x89);
        S.lIIllIlllI[61] = 0x94 ^ 0x89;
        S.lIIllIlllI[62] = 0x34 ^ 0x18 ^ (0x39 ^ 0xB);
        S.lIIllIlllI[63] = 0xFFFF8AF1 & 0x7FFE;
        S.lIIllIlllI[64] = 0xFFFFEECD & 0x3FFE;
        S.lIIllIlllI[65] = 0xFFFFEFE9 & 0x71BE;
        S.lIIllIlllI[66] = 0xFFFFBF77 & 0x5FCF;
        S.lIIllIlllI[67] = 97 + 111 - 133 + 115 ^ 36 + 76 - -36 + 2;
        S.lIIllIlllI[68] = 0xFFFFFBDC & 0x7A7;
        S.lIIllIlllI[69] = 0xFFFFBDEE & 0x46F5F;
        S.lIIllIlllI[70] = 0x4E ^ 0x72;
        S.lIIllIlllI[71] = 10 + 143 - -41 + 42 ^ 187 + 185 - 271 + 92;
        S.lIIllIlllI[72] = 0xFFFFFFDB & 0x1E6;
        S.lIIllIlllI[73] = 0xFFFFFAC9 & 0xF57E;
        S.lIIllIlllI[74] = 72 + 217 - 196 + 154 ^ 70 + 13 - -58 + 6;
        S.lIIllIlllI[75] = 0x1A ^ 0x36 ^ (0x3C ^ 0xF);
        S.lIIllIlllI[76] = 8 ^ 0x6B;
        S.lIIllIlllI[77] = 0x65 ^ 0x5C ^ (0x3B ^ 0x22);
        S.lIIllIlllI[78] = 0xFFFFABD7 & 0x5FFD;
        S.lIIllIlllI[79] = 0xFFFF8F07 & 0x7FFC;
        S.lIIllIlllI[80] = 0xFFFFFBBB & 0xFF6;
        S.lIIllIlllI[81] = -3 & (0xFFFF8FEB & 0x7EFF);
        S.lIIllIlllI[82] = 0xFFFFCBA6 & 0x3FDF;
        S.lIIllIlllI[83] = 0xFFFFBFEF & 0x4EFD;
        S.lIIllIlllI[84] = -(0xFFFFE45B & 0x3FFF) & (0xFFFFEFFF & 0x3FDE);
        S.lIIllIlllI[85] = -(0xFFFFF7E1 & 0x79FF) & (0xFFFFFFF6 & 0x7DFF);
        S.lIIllIlllI[86] = -(0xB1 ^ 0xB4) & (0xFFFFCFE7 & 0x3DBF);
        S.lIIllIlllI[87] = 38 + 32 - -3 + 62 ^ 152 + 77 - 166 + 103;
    }

    private static boolean lIIIIIllIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public int T() {
        try {
            S.cB();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 < ((0x71 ^ 0xD ^ (0x4C ^ 0x26)) & (0x5B ^ 0x47 ^ (0xA9 ^ 0xA3) ^ -1))) {
            return (133 + 106 - 73 + 45 ^ 45 + 17 - 53 + 129) & (0xC7 ^ 0xAC ^ (0x93 ^ 0xA1) ^ -1);
        }
        return lIIllIlllI[74];
    }

    private static String lIIIIIlIlllII(String var24, String var13) {
        var24 = new String(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var25 = var13.toCharArray();
        int var8 = lIIllIlllI[1];
        char[] var2 = var24.toCharArray();
        int var7 = var2.length;
        int var12 = lIIllIlllI[1];
        while (S.lIIIIIllIIIIl(var12, var7)) {
            char var15 = var2[var12];
            var9.append((char)(var15 ^ var25[var8 % var25.length]));
            0;
            ++var8;
            ++var12;
            0;
            if (3 >= 1) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static boolean lIIIIIllIlIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIIIllIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIllIIlII(int n2) {
        return n2 > 0;
    }

    @Override
    public String U() {
        return lIIllIllIl[lIIllIlllI[75]];
    }

    private static int cC() {
        int n2 = lIIllIlllI[69];
        if (S.lIIIIIllIIIIl(Skills.getLevel((Skill)Skill.PRAYER), lIIllIlllI[70]) && S.lIIIIIllIlIII(Skills.getLevel((Skill)Skill.PRAYER), lIIllIlllI[71])) {
            return (n2 - Skills.getExperience((Skill)Skill.PRAYER)) / lIIllIlllI[72] + lIIllIlllI[21];
        }
        int n3 = lIIllIlllI[73];
        return (n3 - Skills.getExperience((Skill)Skill.PRAYER)) / lIIllIlllI[72] + lIIllIlllI[62];
    }

    private static String lIIIIIlIllIll(String var5, String var18) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), lIIllIlllI[18]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(lIIllIlllI[3], var21);
            return new String(var3.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static String lIIIIIlIllIlI(String var23, String var11) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var22 = Cipher.getInstance("Blowfish");
            var22.init(lIIllIlllI[3], var6);
            return new String(var22.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static void af() {
        d var19;
        Object var10;
        int[] nArray = new int[lIIllIlllI[2]];
        nArray[S.lIIllIlllI[1]] = lIIllIlllI[8];
        if (S.lIIIIIllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIIllIlllI[8], lIIllIlllI[13], i.bq);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[lIIllIlllI[2]];
        nArray2[S.lIIllIlllI[1]] = lIIllIlllI[0];
        if (S.lIIIIIllIIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var10 = new d(lIIllIlllI[0], S.cC(), lIIllIlllI[63]);
            bv.add((d)var10);
            0;
        }
        int[] nArray3 = new int[lIIllIlllI[2]];
        nArray3[S.lIIllIlllI[1]] = lIIllIlllI[7];
        if (S.lIIIIIllIIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var10 = new d(lIIllIlllI[7], lIIllIlllI[3], lIIllIlllI[5]);
            bv.add((d)var10);
            0;
        }
        if (S.lIIIIIllIIIlI(Bank.contains((Predicate)(var10 = item -> item.getName().toLowerCase().contains(lIIllIllIl[lIIllIlllI[77]]))) ? 1 : 0)) {
            var19 = new d(lIIllIlllI[64], lIIllIlllI[13], lIIllIlllI[65]);
            bv.add(var19);
            0;
        }
        int[] nArray4 = new int[lIIllIlllI[2]];
        nArray4[S.lIIllIlllI[1]] = lIIllIlllI[66];
        if (S.lIIIIIllIIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var19 = new d(lIIllIlllI[66], lIIllIlllI[67], lIIllIlllI[68]);
            bv.add(var19);
            0;
        }
    }

    private static void lIIIIIlIlllIl() {
        lIIllIllIl = new String[lIIllIlllI[87]];
        S.lIIllIllIl[S.lIIllIlllI[1]] = S."Buying items";
        S.lIIllIllIl[S.lIIllIlllI[2]] = S."Finished buying items, switching back to prayer";
        S.lIIllIllIl[S.lIIllIlllI[3]] = S."Navigating to bank";
        S.lIIllIllIl[S.lIIllIlllI[4]] = S."Handling banking";
        S.lIIllIllIl[S.lIIllIlllI[6]] = S."We are missing prayer supplies, switching to BUYING";
        S.lIIllIllIl[S.lIIllIlllI[13]] = S."Drink";
        S.lIIllIllIl[S.lIIllIlllI[15]] = S."Tele to wildy";
        S.lIIllIllIl[S.lIIllIlllI[17]] = S."Rub";
        S.lIIllIllIl[S.lIIllIlllI[18]] = S."Lava Maze";
        S.lIIllIllIl[S.lIIllIlllI[19]] = S."Okay, teleport to level 41 Wilderness.";
        S.lIIllIllIl[S.lIIllIlllI[21]] = S."Nav to altar";
        S.lIIllIllIl[S.lIIllIlllI[41]] = S."1 tick pray";
        S.lIIllIllIl[S.lIIllIlllI[44]] = S."Chaos altar";
        S.lIIllIllIl[S.lIIllIlllI[20]] = S."Large door";
        S.lIIllIllIl[S.lIIllIlllI[46]] = S."Open";
        S.lIIllIllIl[S.lIIllIlllI[47]] = S."Open";
        S.lIIllIllIl[S.lIIllIlllI[48]] = S."Open";
        S.lIIllIllIl[S.lIIllIlllI[49]] = S."Chaos altar";
        S.lIIllIllIl[S.lIIllIlllI[51]] = S."Nav to altar";
        S.lIIllIllIl[S.lIIllIlllI[52]] = S."Unnoting bones";
        S.lIIllIllIl[S.lIIllIlllI[14]] = S."Elder Chaos druid";
        S.lIIllIllIl[S.lIIllIlllI[53]] = S."Large door";
        S.lIIllIllIl[S.lIIllIlllI[54]] = S."Open";
        S.lIIllIllIl[S.lIIllIlllI[55]] = S."Open";
        S.lIIllIllIl[S.lIIllIlllI[56]] = S."Open";
        S.lIIllIllIl[S.lIIllIlllI[57]] = S."Exchange";
        S.lIIllIllIl[S.lIIllIlllI[58]] = S."Exchange 5";
        S.lIIllIllIl[S.lIIllIlllI[59]] = S."Exchange All";
        S.lIIllIllIl[S.lIIllIlllI[60]] = S."Suiciding";
        S.lIIllIllIl[S.lIIllIlllI[61]] = S."Wine of zamorak";
        S.lIIllIllIl[S.lIIllIlllI[62]] = S."Take";
        S.lIIllIllIl[S.lIIllIlllI[75]] = S."Prayer training";
        S.lIIllIllIl[S.lIIllIlllI[77]] = S."ring of wealth (";
    }

    public S() {
        this.jA = lIIllIlllI[0];
    }

    private static boolean lIIIIIllIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        S.lIIIIIlIlllll();
        S.lIIIIIlIlllIl();
        jt = new WorldPoint(lIIllIlllI[78], lIIllIlllI[79], lIIllIlllI[1]);
        ju = new WorldPoint(lIIllIlllI[80], lIIllIlllI[81], lIIllIlllI[1]);
        jv = new WorldPoint(lIIllIlllI[82], lIIllIlllI[83], lIIllIlllI[1]);
        jw = new WorldPoint(lIIllIlllI[84], lIIllIlllI[43], lIIllIlllI[1]);
        jx = new WorldPoint(lIIllIlllI[1], lIIllIlllI[1], lIIllIlllI[1]);
        jy = new WorldPoint(lIIllIlllI[1], lIIllIlllI[1], lIIllIlllI[1]);
        jz = new WorldPoint(lIIllIlllI[85], lIIllIlllI[86], lIIllIlllI[1]);
        bv = new ArrayList<d>();
    }

    private static boolean lIIIIIllIIllI(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[lIIllIlllI[2]];
                nArray[S.lIIllIlllI[1]] = lIIllIlllI[9];
                if (!S.lIIIIIllIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIIllIlllI[2]];
                nArray2[S.lIIllIlllI[1]] = lIIllIlllI[9];
                if (!S.lIIIIIllIlIII(Inventory.getFirst((int[])nArray2).getQuantity(), lIIllIlllI[12])) break block2;
                if (!S.lIIIIIllIIIlI(Inventory.contains((int[])f.ba) ? 1 : 0)) break block3;
                if (!S.lIIIIIllIIIII(Equipment.contains((int[])f.ba) ? 1 : 0)) break block2;
                int[] nArray3 = new int[lIIllIlllI[2]];
                nArray3[S.lIIllIlllI[1]] = lIIllIlllI[0];
                if (!S.lIIIIIllIIIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[lIIllIlllI[2]];
                nArray4[S.lIIllIlllI[1]] = lIIllIlllI[50];
                if (!S.lIIIIIllIIIII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block2;
            }
            n2 = lIIllIlllI[2];
            0;
            if (((0x7F ^ 0x23 ^ (0x3A ^ 0x74)) & (145 + 168 - 269 + 166 ^ 78 + 152 - 81 + 43 ^ -1)) == 0) return n2 != 0;
            return ((0x3F ^ 0x76 ^ (0x4E ^ 0x33)) & (0x52 ^ 0x1A ^ (0xCE ^ 0xB2) ^ -1)) != 0;
        }
        n2 = lIIllIlllI[1];
        return n2 != 0;
    }

    private static boolean lIIIIIllIIIll(Object object) {
        return object != null;
    }

    public static void cB() {
        block44: {
            TileItem var14;
            block45: {
                if (S.lIIIIIllIIIII(bt ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllIllIl[lIIllIlllI[1]];
                    b.a(bv);
                    if (S.lIIIIIllIIIIl(bv.size(), lIIllIlllI[2])) {
                        System.out.println(lIIllIllIl[lIIllIlllI[2]]);
                        bt = lIIllIlllI[1];
                    }
                }
                if (!S.lIIIIIllIIIlI(bt ? 1 : 0)) break block44;
                if (S.lIIIIIllIIIlI(S.ab() ? 1 : 0) && S.lIIIIIllIIIIl(Game.getWildyLevel(), lIIllIlllI[2])) {
                    var14 = BankLocation.getNearest();
                    if (S.lIIIIIllIIIll(var14) && S.lIIIIIllIIIlI(var14.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIllIllIl[lIIllIlllI[3]];
                        a.a((BankLocation)var14);
                    }
                    if (S.lIIIIIllIIIll(var14) && S.lIIIIIllIIIII(var14.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIllIllIl[lIIllIlllI[4]];
                        if (S.lIIIIIllIIIlI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIllIlllI[5]);
                            0;
                        }
                        if (S.lIIIIIllIIIII(Bank.isOpen() ? 1 : 0)) {
                            if (S.lIIIIIllIIlII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIllIlllI[6]);
                                0;
                            }
                            if (S.lIIIIIllIIlII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIllIlllI[3]);
                                0;
                            }
                            int[] nArray = new int[lIIllIlllI[4]];
                            nArray[S.lIIllIlllI[1]] = lIIllIlllI[7];
                            nArray[S.lIIllIlllI[2]] = lIIllIlllI[0];
                            nArray[S.lIIllIlllI[3]] = lIIllIlllI[8];
                            if (S.lIIIIIllIIIlI(e.b(nArray) ? 1 : 0)) {
                                S.af();
                                System.out.println(lIIllIllIl[lIIllIlllI[6]]);
                                bt = lIIllIlllI[2];
                                return;
                            }
                            int[] nArray2 = new int[lIIllIlllI[4]];
                            nArray2[S.lIIllIlllI[1]] = lIIllIlllI[7];
                            nArray2[S.lIIllIlllI[2]] = lIIllIlllI[0];
                            nArray2[S.lIIllIlllI[3]] = lIIllIlllI[8];
                            if (S.lIIIIIllIIIII(e.b(nArray2) ? 1 : 0)) {
                                if (S.lIIIIIllIIIlI(Equipment.contains((int[])f.ba) ? 1 : 0)) {
                                    a.b(f.ba, lIIllIlllI[2]);
                                }
                                a.b(f.aV, lIIllIlllI[2]);
                                a.a(lIIllIlllI[9], lIIllIlllI[10]);
                                a.b(lIIllIlllI[0], lIIllIlllI[11]);
                            }
                        }
                    }
                }
                if (S.lIIIIIllIIIII(S.ab() ? 1 : 0)) {
                    if (S.lIIIIIllIIIII(Inventory.contains((int[])f.aV) ? 1 : 0) && S.lIIIIIllIIIIl(Movement.getRunEnergy(), lIIllIlllI[12])) {
                        Inventory.getFirst((int[])f.aV).interact(lIIllIllIl[lIIllIlllI[13]]);
                        Time.sleepTicks((int)lIIllIlllI[2]);
                        0;
                    }
                    if (S.lIIIIIllIIIlI(Movement.isRunEnabled() ? 1 : 0) && S.lIIIIIllIIlIl(Movement.getRunEnergy(), lIIllIlllI[14])) {
                        Movement.toggleRun();
                        Time.sleepTicks((int)lIIllIlllI[13]);
                        0;
                    }
                    if (S.lIIIIIllIIIIl(Game.getWildyLevel(), lIIllIlllI[2])) {
                        AccBuilderRogues.c = lIIllIllIl[lIIllIlllI[15]];
                        if (S.lIIIIIllIIIII(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (S.lIIIIIllIIIlI(Dialog.isOpen() ? 1 : 0) && S.lIIIIIllIIIII(Inventory.contains((int[])f.ba) ? 1 : 0) && S.lIIIIIllIIllI(Players.getLocal().getAnimation(), lIIllIlllI[16])) {
                            Inventory.getFirst((int[])f.ba).interact(lIIllIllIl[lIIllIlllI[17]]);
                            Time.sleepTicks((int)lIIllIlllI[3]);
                            0;
                        }
                        String[] stringArray = new String[lIIllIlllI[3]];
                        stringArray[S.lIIllIlllI[1]] = lIIllIllIl[lIIllIlllI[18]];
                        stringArray[S.lIIllIlllI[2]] = lIIllIllIl[lIIllIlllI[19]];
                        g.a(stringArray);
                    }
                    if (S.lIIIIIllIIlII(Game.getWildyLevel())) {
                        TileObject var16;
                        int[] nArray = new int[lIIllIlllI[2]];
                        nArray[S.lIIllIlllI[1]] = lIIllIlllI[0];
                        if (S.lIIIIIllIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            if (S.lIIIIIllIIlIl(Players.getLocal().getWorldLocation().distanceTo(jv), lIIllIlllI[20])) {
                                AccBuilderRogues.c = lIIllIllIl[lIIllIlllI[21]];
                                TileItem tileItem = new WorldPoint[lIIllIlllI[20]];
                                tileItem[S.lIIllIlllI[1]] = new WorldPoint(lIIllIlllI[22], lIIllIlllI[23], lIIllIlllI[1]);
                                tileItem[S.lIIllIlllI[2]] = new WorldPoint(lIIllIlllI[24], lIIllIlllI[25], lIIllIlllI[1]);
                                tileItem[S.lIIllIlllI[3]] = new WorldPoint(lIIllIlllI[26], lIIllIlllI[27], lIIllIlllI[1]);
                                tileItem[S.lIIllIlllI[4]] = new WorldPoint(lIIllIlllI[28], lIIllIlllI[29], lIIllIlllI[1]);
                                tileItem[S.lIIllIlllI[6]] = new WorldPoint(lIIllIlllI[30], lIIllIlllI[31], lIIllIlllI[1]);
                                tileItem[S.lIIllIlllI[13]] = new WorldPoint(lIIllIlllI[32], lIIllIlllI[33], lIIllIlllI[1]);
                                tileItem[S.lIIllIlllI[15]] = new WorldPoint(lIIllIlllI[34], lIIllIlllI[35], lIIllIlllI[1]);
                                tileItem[S.lIIllIlllI[17]] = new WorldPoint(lIIllIlllI[36], lIIllIlllI[37], lIIllIlllI[1]);
                                tileItem[S.lIIllIlllI[18]] = new WorldPoint(lIIllIlllI[38], lIIllIlllI[37], lIIllIlllI[1]);
                                tileItem[S.lIIllIlllI[19]] = new WorldPoint(lIIllIlllI[39], lIIllIlllI[37], lIIllIlllI[1]);
                                tileItem[S.lIIllIlllI[21]] = new WorldPoint(lIIllIlllI[40], lIIllIlllI[37], lIIllIlllI[1]);
                                tileItem[S.lIIllIlllI[41]] = new WorldPoint(lIIllIlllI[42], lIIllIlllI[43], lIIllIlllI[1]);
                                tileItem[S.lIIllIlllI[44]] = new WorldPoint(lIIllIlllI[45], lIIllIlllI[43], lIIllIlllI[1]);
                                var14 = tileItem;
                                Walker.walkAlong(Arrays.asList(var14), new HashMap());
                                0;
                                Time.sleepTicks((int)lIIllIlllI[2]);
                                0;
                            }
                            if (S.lIIIIIllIIlll(Players.getLocal().getWorldLocation().distanceTo(jv), lIIllIlllI[20])) {
                                AccBuilderRogues.c = lIIllIllIl[lIIllIlllI[41]];
                                String[] stringArray = new String[lIIllIlllI[2]];
                                stringArray[S.lIIllIlllI[1]] = lIIllIllIl[lIIllIlllI[44]];
                                var14 = TileObjects.getNearest((String[])stringArray);
                                String[] stringArray2 = new String[lIIllIlllI[2]];
                                stringArray2[S.lIIllIlllI[1]] = lIIllIllIl[lIIllIlllI[20]];
                                var16 = TileObjects.getNearest((String[])stringArray2);
                                String[] stringArray3 = new String[lIIllIlllI[2]];
                                stringArray3[S.lIIllIlllI[1]] = lIIllIllIl[lIIllIlllI[46]];
                                if (S.lIIIIIllIIIII(var16.hasAction(stringArray3) ? 1 : 0)) {
                                    var16.interact(lIIllIllIl[lIIllIlllI[47]]);
                                }
                                if (S.lIIIIIllIIIll(var14)) {
                                    String[] stringArray4 = new String[lIIllIlllI[2]];
                                    stringArray4[S.lIIllIlllI[1]] = lIIllIllIl[lIIllIlllI[48]];
                                    if (S.lIIIIIllIIIlI(var16.hasAction(stringArray4) ? 1 : 0)) {
                                        int var4 = Skills.getExperience((Skill)Skill.PRAYER);
                                        int[] nArray3 = new int[lIIllIlllI[2]];
                                        nArray3[S.lIIllIlllI[1]] = lIIllIlllI[0];
                                        String[] stringArray5 = new String[lIIllIlllI[2]];
                                        stringArray5[S.lIIllIlllI[1]] = lIIllIllIl[lIIllIlllI[49]];
                                        Inventory.getFirst((int[])nArray3).useOn(TileObjects.getNearest((String[])stringArray5));
                                        Time.sleepTicks((int)lIIllIlllI[2]);
                                        0;
                                    }
                                }
                            }
                        }
                        int[] nArray4 = new int[lIIllIlllI[2]];
                        nArray4[S.lIIllIlllI[1]] = lIIllIlllI[0];
                        if (S.lIIIIIllIIIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[lIIllIlllI[2]];
                            nArray5[S.lIIllIlllI[1]] = lIIllIlllI[50];
                            if (S.lIIIIIllIIIII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                if (S.lIIIIIllIIlIl(Players.getLocal().getWorldLocation().distanceTo(jv), lIIllIlllI[20])) {
                                    AccBuilderRogues.c = lIIllIllIl[lIIllIlllI[51]];
                                    WorldPoint[] worldPointArray = new WorldPoint[lIIllIlllI[20]];
                                    worldPointArray[S.lIIllIlllI[1]] = new WorldPoint(lIIllIlllI[22], lIIllIlllI[23], lIIllIlllI[1]);
                                    worldPointArray[S.lIIllIlllI[2]] = new WorldPoint(lIIllIlllI[24], lIIllIlllI[25], lIIllIlllI[1]);
                                    worldPointArray[S.lIIllIlllI[3]] = new WorldPoint(lIIllIlllI[26], lIIllIlllI[27], lIIllIlllI[1]);
                                    worldPointArray[S.lIIllIlllI[4]] = new WorldPoint(lIIllIlllI[28], lIIllIlllI[29], lIIllIlllI[1]);
                                    worldPointArray[S.lIIllIlllI[6]] = new WorldPoint(lIIllIlllI[30], lIIllIlllI[31], lIIllIlllI[1]);
                                    worldPointArray[S.lIIllIlllI[13]] = new WorldPoint(lIIllIlllI[32], lIIllIlllI[33], lIIllIlllI[1]);
                                    worldPointArray[S.lIIllIlllI[15]] = new WorldPoint(lIIllIlllI[34], lIIllIlllI[35], lIIllIlllI[1]);
                                    worldPointArray[S.lIIllIlllI[17]] = new WorldPoint(lIIllIlllI[36], lIIllIlllI[37], lIIllIlllI[1]);
                                    worldPointArray[S.lIIllIlllI[18]] = new WorldPoint(lIIllIlllI[38], lIIllIlllI[37], lIIllIlllI[1]);
                                    worldPointArray[S.lIIllIlllI[19]] = new WorldPoint(lIIllIlllI[39], lIIllIlllI[37], lIIllIlllI[1]);
                                    worldPointArray[S.lIIllIlllI[21]] = new WorldPoint(lIIllIlllI[40], lIIllIlllI[37], lIIllIlllI[1]);
                                    worldPointArray[S.lIIllIlllI[41]] = new WorldPoint(lIIllIlllI[42], lIIllIlllI[43], lIIllIlllI[1]);
                                    worldPointArray[S.lIIllIlllI[44]] = new WorldPoint(lIIllIlllI[45], lIIllIlllI[43], lIIllIlllI[1]);
                                    var14 = worldPointArray;
                                    Walker.walkAlong(Arrays.asList(var14), new HashMap());
                                    0;
                                    Time.sleepTicks((int)lIIllIlllI[2]);
                                    0;
                                }
                                if (S.lIIIIIllIIlll(Players.getLocal().getWorldLocation().distanceTo(jv), lIIllIlllI[20])) {
                                    AccBuilderRogues.c = lIIllIllIl[lIIllIlllI[52]];
                                    if (!S.lIIIIIllIIIlI(Dialog.canLevelUpContinue() ? 1 : 0) || S.lIIIIIllIIIII(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    String[] stringArray = new String[lIIllIlllI[2]];
                                    stringArray[S.lIIllIlllI[1]] = lIIllIllIl[lIIllIlllI[14]];
                                    var14 = NPCs.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[lIIllIlllI[2]];
                                    stringArray6[S.lIIllIlllI[1]] = lIIllIllIl[lIIllIlllI[53]];
                                    var16 = TileObjects.getNearest((String[])stringArray6);
                                    String[] stringArray7 = new String[lIIllIlllI[2]];
                                    stringArray7[S.lIIllIlllI[1]] = lIIllIllIl[lIIllIlllI[54]];
                                    if (S.lIIIIIllIIIII(var16.hasAction(stringArray7) ? 1 : 0)) {
                                        var16.interact(lIIllIllIl[lIIllIlllI[55]]);
                                    }
                                    if (S.lIIIIIllIIIll(var14)) {
                                        String[] stringArray8 = new String[lIIllIlllI[2]];
                                        stringArray8[S.lIIllIlllI[1]] = lIIllIllIl[lIIllIlllI[56]];
                                        if (S.lIIIIIllIIIlI(var16.hasAction(stringArray8) ? 1 : 0)) {
                                            List var4;
                                            if (S.lIIIIIllIIIlI(Dialog.isOpen() ? 1 : 0)) {
                                                int[] nArray6 = new int[lIIllIlllI[2]];
                                                nArray6[S.lIIllIlllI[1]] = lIIllIlllI[50];
                                                Inventory.getFirst((int[])nArray6).useOn((Actor)var14);
                                                Time.sleepTicks((int)lIIllIlllI[3]);
                                                0;
                                            }
                                            if (S.lIIIIIllIIIII(Dialog.isOpen() ? 1 : 0) && S.lIIIIIllIIIlI((var4 = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                                                int var20 = lIIllIlllI[1];
                                                while (S.lIIIIIllIIIIl(var20, var4.size())) {
                                                    int[] nArray7 = new int[lIIllIlllI[2]];
                                                    nArray7[S.lIIllIlllI[1]] = lIIllIlllI[50];
                                                    if (S.lIIIIIllIIllI(((Item)Inventory.getAll((int[])nArray7).get(lIIllIlllI[1])).getQuantity(), lIIllIlllI[2]) && S.lIIIIIllIIIII(((Widget)var4.get(var20)).getText().contains(lIIllIllIl[lIIllIlllI[57]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)var4.get(var20)).getClickPoint().getX(), (int)((Widget)var4.get(var20)).getClickPoint().getY(), (boolean)lIIllIlllI[2]);
                                                        Time.sleepTicks((int)lIIllIlllI[3]);
                                                        0;
                                                    }
                                                    int[] nArray8 = new int[lIIllIlllI[2]];
                                                    nArray8[S.lIIllIlllI[1]] = lIIllIlllI[50];
                                                    if (S.lIIIIIllIIllI(((Item)Inventory.getAll((int[])nArray8).get(lIIllIlllI[1])).getQuantity(), lIIllIlllI[13]) && S.lIIIIIllIIIII(((Widget)var4.get(var20)).getText().contains(lIIllIllIl[lIIllIlllI[58]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)var4.get(var20)).getClickPoint().getX(), (int)((Widget)var4.get(var20)).getClickPoint().getY(), (boolean)lIIllIlllI[2]);
                                                        Time.sleepTicks((int)lIIllIlllI[3]);
                                                        0;
                                                    }
                                                    if (S.lIIIIIllIIIII(((Widget)var4.get(var20)).getText().contains(lIIllIllIl[lIIllIlllI[59]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)var4.get(var20)).getClickPoint().getX(), (int)((Widget)var4.get(var20)).getClickPoint().getY(), (boolean)lIIllIlllI[2]);
                                                        Time.sleepTicks((int)lIIllIlllI[3]);
                                                        0;
                                                    }
                                                    ++var20;
                                                    0;
                                                    if (-1 <= 0) continue;
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
                int[] nArray = new int[lIIllIlllI[2]];
                nArray[S.lIIllIlllI[1]] = lIIllIlllI[9];
                if (!S.lIIIIIllIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray9 = new int[lIIllIlllI[2]];
                nArray9[S.lIIllIlllI[1]] = lIIllIlllI[0];
                if (!S.lIIIIIllIIIlI(Inventory.contains((int[])nArray9) ? 1 : 0)) break block44;
                int[] nArray10 = new int[lIIllIlllI[2]];
                nArray10[S.lIIllIlllI[1]] = lIIllIlllI[50];
                if (!S.lIIIIIllIIIlI(Inventory.contains((int[])nArray10) ? 1 : 0)) break block44;
            }
            if (S.lIIIIIllIIlll(Players.getLocal().getWorldLocation().distanceTo(jv), lIIllIlllI[20])) {
                AccBuilderRogues.c = lIIllIllIl[lIIllIlllI[60]];
                String[] stringArray = new String[lIIllIlllI[2]];
                stringArray[S.lIIllIlllI[1]] = lIIllIllIl[lIIllIlllI[61]];
                var14 = TileItems.getNearest((String[])stringArray);
                if (S.lIIIIIllIIIll(var14)) {
                    var14.interact(lIIllIllIl[lIIllIlllI[62]]);
                }
            }
        }
    }

    private static boolean lIIIIIllIIlll(int n2, int n3) {
        return n2 <= n3;
    }
}

