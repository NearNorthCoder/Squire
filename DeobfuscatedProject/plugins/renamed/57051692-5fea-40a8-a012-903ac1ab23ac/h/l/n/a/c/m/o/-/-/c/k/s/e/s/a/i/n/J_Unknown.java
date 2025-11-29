/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Widgets
 */
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.Z_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.f_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.g_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.j;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Widgets;

public class J_Unknown
implements K {
    public static /* synthetic */ List<d> bp;
    private static final /* synthetic */ WorldPoint jl;
    private static final /* synthetic */ WorldPoint jn;
    static /* synthetic */ int cA;
    public static /* synthetic */ long g;
    public static final /* synthetic */ String[] jk;
    private static final /* synthetic */ WorldPoint jo;
    private static final /* synthetic */ WorldPoint jp;
    public static /* synthetic */ boolean bn;
    static /* synthetic */ int dc;
    private static final /* synthetic */ WorldPoint jm;
    private static /* synthetic */ String[] lIlIIIIIIl;
    private static /* synthetic */ int[] lIlIIIIIlI;
    private static final /* synthetic */ WorldPoint jq;
    static /* synthetic */ boolean dd;

    private static void lIIIIllllIllI() {
        lIlIIIIIIl = new String[lIlIIIIIlI[88]];
        J.lIlIIIIIIl[J.lIlIIIIIlI[0]] = J."Buying items";
        J.lIlIIIIIIl[J.lIlIIIIIlI[1]] = J."Finished buying items, switching back to quest";
        J.lIlIIIIIIl[J.lIlIIIIIlI[3]] = J."Drink";
        J.lIlIIIIIIl[J.lIlIIIIIlI[5]] = J."Eat";
        J.lIlIIIIIIl[J.lIlIIIIIlI[6]] = J."Nav to bank";
        J.lIlIIIIIIl[J.lIlIIIIIlI[7]] = J."Handling banking";
        J.lIlIIIIIIl[J.lIlIIIIIlI[9]] = J."We are missing quest supplies, switching to BUYING";
        J.lIlIIIIIIl[J.lIlIIIIIlI[17]] = J."Nav to start";
        J.lIlIIIIIIl[J.lIlIIIIIlI[18]] = J."Interact npc";
        J.lIlIIIIIIl[J.lIlIIIIIlI[19]] = J."Drop";
        J.lIlIIIIIIl[J.lIlIIIIIlI[15]] = J."Veos";
        J.lIlIIIIIIl[J.lIlIIIIIlI[20]] = J."Treasure scroll";
        J.lIlIIIIIIl[J.lIlIIIIIlI[21]] = J."Wear";
        J.lIlIIIIIIl[J.lIlIIIIIlI[22]] = J."Wear";
        J.lIlIIIIIIl[J.lIlIIIIIlI[23]] = J."Nav to dig 1";
        J.lIlIIIIIIl[J.lIlIIIIIlI[24]] = J."Spade";
        J.lIlIIIIIIl[J.lIlIIIIIlI[25]] = J."Dig";
        J.lIlIIIIIIl[J.lIlIIIIIlI[26]] = J."Nav to dig 2";
        J.lIlIIIIIIl[J.lIlIIIIIlI[27]] = J."Spade";
        J.lIlIIIIIIl[J.lIlIIIIIlI[28]] = J."Dig";
        J.lIlIIIIIIl[J.lIlIIIIIlI[29]] = J."Nav to dig 3";
        J.lIlIIIIIIl[J.lIlIIIIIlI[30]] = J."Spade";
        J.lIlIIIIIIl[J.lIlIIIIIlI[31]] = J."Dig";
        J.lIlIIIIIIl[J.lIlIIIIIlI[32]] = J."Nav to dig 4";
        J.lIlIIIIIIl[J.lIlIIIIIlI[33]] = J."Spade";
        J.lIlIIIIIIl[J.lIlIIIIIlI[34]] = J."Dig";
        J.lIlIIIIIIl[J.lIlIIIIIlI[35]] = J."Nav to veos finish";
        J.lIlIIIIIIl[J.lIlIIIIIlI[36]] = J."Interact npc";
        J.lIlIIIIIIl[J.lIlIIIIIlI[37]] = J."Veos";
        J.lIlIIIIIIl[J.lIlIIIIIlI[40]] = J."Rubbing lamp";
        J.lIlIIIIIIl[J.lIlIIIIIlI[41]] = J."Rub";
        J.lIlIIIIIIl[J.lIlIIIIIlI[42]] = J."Selecting slayer";
        J.lIlIIIIIIl[J.lIlIIIIIlI[43]] = J."Slayer";
        J.lIlIIIIIIl[J.lIlIIIIIlI[44]] = J."Confirm";
        J.lIlIIIIIIl[J.lIlIIIIIlI[45]] = J."Spade";
        J.lIlIIIIIIl[J.lIlIIIIIlI[55]] = J."X marks the spot quest";
        J.lIlIIIIIIl[J.lIlIIIIIlI[56]] = J."ring of wealth (";
        J.lIlIIIIIIl[J.lIlIIIIIlI[57]] = J."wealth";
        J.lIlIIIIIIl[J.lIlIIIIIlI[58]] = J."wealth";
        J.lIlIIIIIIl[J.lIlIIIIIlI[59]] = J."wealth";
        J.lIlIIIIIIl[J.lIlIIIIIlI[53]] = J."glory";
        J.lIlIIIIIIl[J.lIlIIIIIlI[60]] = J."glory";
        J.lIlIIIIIIl[J.lIlIIIIIlI[61]] = J."glory";
        J.lIlIIIIIIl[J.lIlIIIIIlI[62]] = J."Ok, I'm up for an adventure.";
        J.lIlIIIIIIl[J.lIlIIIIIlI[63]] = J."A glass of your finest ale please.";
        J.lIlIIIIIIl[J.lIlIIIIIlI[64]] = J."Morgan needs your help!";
        J.lIlIIIIIIl[J.lIlIIIIIlI[65]] = J."Yes.";
        J.lIlIIIIIIl[J.lIlIIIIIlI[66]] = J."I'm looking for a quest!";
        J.lIlIIIIIIl[J.lIlIIIIIlI[67]] = J."Ok, let me help then.";
        J.lIlIIIIIIl[J.lIlIIIIIlI[68]] = J."Father Aereck sent me to talk to you.";
        J.lIlIIIIIIl[J.lIlIIIIIlI[69]] = J."He's got a ghost haunting his graveyard.";
        J.lIlIIIIIIl[J.lIlIIIIIlI[70]] = J."Yep, now tell me what the problem is.";
        J.lIlIIIIIIl[J.lIlIIIIIlI[71]] = J."Sure.";
        J.lIlIIIIIIl[J.lIlIIIIIlI[72]] = J."I'm wearing an amulet of ghost speak!";
        J.lIlIIIIIIl[J.lIlIIIIIlI[73]] = J."Yes, I'm sure.";
        J.lIlIIIIIIl[J.lIlIIIIIlI[48]] = J."How can I help?";
        J.lIlIIIIIIl[J.lIlIIIIIlI[74]] = J."I'm looking for a quest.";
        J.lIlIIIIIIl[J.lIlIIIIIlI[75]] = J."Can I help?";
    }

    private static void lIIIIllllIlll() {
        lIlIIIIIlI = new int[89];
        J.lIlIIIIIlI[0] = (0x9A ^ 0xB2) & ~(1 ^ 0x29);
        J.lIlIIIIIlI[1] = 1;
        J.lIlIIIIIlI[2] = 0xCB ^ 0x8D;
        J.lIlIIIIIlI[3] = 2;
        J.lIlIIIIIlI[4] = 0xFFFFE77F & 0x19FB;
        J.lIlIIIIIlI[5] = 3;
        J.lIlIIIIIlI[6] = 0x52 ^ 0x3C ^ (0xE ^ 0x64);
        J.lIlIIIIIlI[7] = 91 + 148 - 156 + 86 ^ 60 + 152 - 110 + 70;
        J.lIlIIIIIlI[8] = -(0xFFFFF463 & 0x6BFF) & (0xFFFFFBFB & 0x77EE);
        J.lIlIIIIIlI[9] = 149 + 81 - 206 + 132 ^ 22 + 122 - 58 + 68;
        J.lIlIIIIIlI[10] = -(0xFFFFC1F7 & 0x7F3E) & (0xFFFFFFFF & 0x6FFF);
        J.lIlIIIIIlI[11] = -(0x4B ^ 0x6A) & (0xFFFFFF7B & 0x1FEC);
        J.lIlIIIIIlI[12] = -(53 + 94 - 113 + 107) & (0xFFFFF9FD & 0x37DF);
        J.lIlIIIIIlI[13] = -(0x9C ^ 0xBD) & (0xFFFFDFFF & 0x3F67);
        J.lIlIIIIIlI[14] = 0xFFFFE7FE & 0x1BB9;
        J.lIlIIIIIlI[15] = 0x14 ^ 0x1E;
        J.lIlIIIIIlI[16] = -(0xFFFFE7BF & 0x38F7) & (0xFFFFFFFF & 0x3FFF);
        J.lIlIIIIIlI[17] = 5 ^ 2;
        J.lIlIIIIIlI[18] = 118 + 116 - 223 + 178 ^ 2 + 46 - -128 + 5;
        J.lIlIIIIIlI[19] = 0x58 ^ 0x51 ^ (0x30 ^ 0x65) & ~(0xD0 ^ 0x85);
        J.lIlIIIIIlI[20] = 0x4B ^ 0x40;
        J.lIlIIIIIlI[21] = 0x80 ^ 0x8C;
        J.lIlIIIIIlI[22] = 0x20 ^ 0x2D;
        J.lIlIIIIIlI[23] = 0xE8 ^ 0xB0 ^ (0xD5 ^ 0x83);
        J.lIlIIIIIlI[24] = 0x2C ^ 0x66 ^ (8 ^ 0x4D);
        J.lIlIIIIIlI[25] = 0xB8 ^ 0xA8;
        J.lIlIIIIIlI[26] = 0x4F ^ 0x79 ^ (0x92 ^ 0xB5);
        J.lIlIIIIIlI[27] = 0xD ^ 0x1F;
        J.lIlIIIIIlI[28] = 0xE4 ^ 0xA7 ^ (0xEA ^ 0xBA);
        J.lIlIIIIIlI[29] = 0xE ^ 0x1A;
        J.lIlIIIIIlI[30] = 4 + 177 - 141 + 150 ^ 111 + 85 - 175 + 150;
        J.lIlIIIIIlI[31] = 0x92 ^ 0x84;
        J.lIlIIIIIlI[32] = 0x48 ^ 0x5F;
        J.lIlIIIIIlI[33] = 136 + 51 - 98 + 87 ^ 165 + 47 - 140 + 96;
        J.lIlIIIIIlI[34] = 0x9B ^ 0x82;
        J.lIlIIIIIlI[35] = 65 + 95 - 158 + 140 ^ 130 + 106 - 128 + 40;
        J.lIlIIIIIlI[36] = 0x76 ^ 0x38 ^ (0xDE ^ 0x8B);
        J.lIlIIIIIlI[37] = 0xB2 ^ 0xAE;
        J.lIlIIIIIlI[38] = 0xFFFFDE62 & 0x7BBD;
        J.lIlIIIIIlI[39] = (2 ^ 0x5F) + (1 ^ 0x52) - (0x25 ^ 0xC) + (0x5F ^ 0x36);
        J.lIlIIIIIlI[40] = 9 ^ 0x14;
        J.lIlIIIIIlI[41] = 3 + 78 - 5 + 54 ^ 59 + 131 - 86 + 52;
        J.lIlIIIIIlI[42] = 0x35 ^ 0x2A;
        J.lIlIIIIIlI[43] = 0x14 ^ 0x24 ^ (0xB9 ^ 0xA9);
        J.lIlIIIIIlI[44] = 0x44 ^ 0x58 ^ (0x3F ^ 2);
        J.lIlIIIIIlI[45] = 0x5F ^ 0x7D;
        J.lIlIIIIIlI[46] = 0xFFFFBFFC & 0x7E1F;
        J.lIlIIIIIlI[47] = -(0xFFFFAF4F & 0x58F2) & (0xFFFFDFED & 0x3F5F);
        J.lIlIIIIIlI[48] = 0xD7 ^ 0xAC ^ (0x47 ^ 0xB);
        J.lIlIIIIIlI[49] = -(0xFFFFDEBC & 0x2F4F) & (0xFFFF8FFF & Short.MAX_VALUE);
        J.lIlIIIIIlI[50] = -(0xFFFFED73 & 0x539E) & (0xFFFFEFFD & 0x7FDF);
        J.lIlIIIIIlI[51] = -(0xFFFFBD7F & 0x5ED4) & (0xFFFFFFFF & 0x7DFB);
        J.lIlIIIIIlI[52] = 0xFFFFBFEE & 0x477D;
        J.lIlIIIIIlI[53] = 0x1E ^ 8 ^ (0x79 ^ 0x47);
        J.lIlIIIIIlI[54] = 0x7A ^ 0x1E;
        J.lIlIIIIIlI[55] = 0 + 103 - 82 + 112 ^ 159 + 83 - 110 + 34;
        J.lIlIIIIIlI[56] = 0x85 ^ 0xA1;
        J.lIlIIIIIlI[57] = 0x24 ^ 1;
        J.lIlIIIIIlI[58] = 0x6F ^ 0x51 ^ (0x44 ^ 0x5C);
        J.lIlIIIIIlI[59] = 0xC2 ^ 0xBB ^ (0x4D ^ 0x13);
        J.lIlIIIIIlI[60] = 0x8A ^ 0xA3;
        J.lIlIIIIIlI[61] = 0x8B ^ 0xA1;
        J.lIlIIIIIlI[62] = 173 + 114 - 252 + 150 ^ 81 + 138 - 176 + 103;
        J.lIlIIIIIlI[63] = 0x10 ^ 0x3C;
        J.lIlIIIIIlI[64] = 9 ^ 0x2F ^ (0x5F ^ 0x54);
        J.lIlIIIIIlI[65] = 0x51 ^ 0x7F;
        J.lIlIIIIIlI[66] = 0x9B ^ 0xB4;
        J.lIlIIIIIlI[67] = 0xC1 ^ 0xA4 ^ (0x17 ^ 0x42);
        J.lIlIIIIIlI[68] = 0xD4 ^ 0xBB ^ (0x2A ^ 0x74);
        J.lIlIIIIIlI[69] = 128 + 72 - 177 + 164 ^ 33 + 65 - 81 + 120;
        J.lIlIIIIIlI[70] = 0xB4 ^ 0x87;
        J.lIlIIIIIlI[71] = 0x80 ^ 0xB4;
        J.lIlIIIIIlI[72] = 0xA7 ^ 0x92;
        J.lIlIIIIIlI[73] = 176 + 42 - 190 + 161 ^ 66 + 36 - 9 + 46;
        J.lIlIIIIIlI[74] = 0x71 ^ 0x49;
        J.lIlIIIIIlI[75] = 2 ^ (0x50 ^ 0x6B);
        J.lIlIIIIIlI[76] = -(0xFFFFCB7B & 0x37C5) & (0xFFFFDFFF & 0x2FDD);
        J.lIlIIIIIlI[77] = 0xFFFF9EBC & 0x6DEB;
        J.lIlIIIIIlI[78] = 0xFFFF8DDF & 0x7EBE;
        J.lIlIIIIIlI[79] = -(0xFFFFD33F & 0x7CD5) & (0xFFFFFFBF & 0x5CDD);
        J.lIlIIIIIlI[80] = 0xFFFF8FA7 & 0x7CDB;
        J.lIlIIIIIlI[81] = -(0xFFFFF6FE & 0x3935) & (0xFFFFFEFF & 0x3DBF);
        J.lIlIIIIIlI[82] = -(0xFFFFF3CB & 0x6FFD) & (0xFFFFFFED & 0x6FFF);
        J.lIlIIIIIlI[83] = -(0xFFFFDB25 & 0x27FF) & (0xFFFF9FFC & 0x6FE7);
        J.lIlIIIIIlI[84] = -(0xFFFFB679 & 0x4BEF) & (0xFFFFCEFE & 0x3F6F);
        J.lIlIIIIIlI[85] = 0xFFFFDFBB & 0x2CFF;
        J.lIlIIIIIlI[86] = -(0xFFFFC571 & 0x7E8F) & (0xFFFFDFFF & 0x6FEE);
        J.lIlIIIIIlI[87] = 0xFFFFAEFF & 0x5DAE;
        J.lIlIIIIIlI[88] = 0xF8 ^ 0x8B ^ (0xFC ^ 0xB5);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean al() {
        int n2;
        String[] stringArray = new String[lIlIIIIIlI[1]];
        stringArray[J.lIlIIIIIlI[0]] = lIlIIIIIIl[lIlIIIIIlI[45]];
        if (J.lIIIIlllllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lIlIIIIIlI[1]];
            nArray[J.lIlIIIIIlI[0]] = lIlIIIIIlI[4];
            if (J.lIIIIlllllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lIlIIIIIlI[1];
                0;
                if (-3 <= 0) return n2 != 0;
                return false;
            }
        }
        n2 = lIlIIIIIlI[0];
        return n2 != 0;
    }

    @Override
    public String ae() {
        return lIlIIIIIIl[lIlIIIIIlI[55]];
    }

    static {
        J.lIIIIllllIlll();
        J.lIIIIllllIllI();
        String[] stringArray = new String[lIlIIIIIlI[24]];
        stringArray[J.lIlIIIIIlI[0]] = lIlIIIIIIl[lIlIIIIIlI[62]];
        stringArray[J.lIlIIIIIlI[1]] = lIlIIIIIIl[lIlIIIIIlI[63]];
        stringArray[J.lIlIIIIIlI[3]] = lIlIIIIIIl[lIlIIIIIlI[64]];
        stringArray[J.lIlIIIIIlI[5]] = lIlIIIIIIl[lIlIIIIIlI[65]];
        stringArray[J.lIlIIIIIlI[6]] = lIlIIIIIIl[lIlIIIIIlI[66]];
        stringArray[J.lIlIIIIIlI[7]] = lIlIIIIIIl[lIlIIIIIlI[67]];
        stringArray[J.lIlIIIIIlI[9]] = lIlIIIIIIl[lIlIIIIIlI[68]];
        stringArray[J.lIlIIIIIlI[17]] = lIlIIIIIIl[lIlIIIIIlI[69]];
        stringArray[J.lIlIIIIIlI[18]] = lIlIIIIIIl[lIlIIIIIlI[70]];
        stringArray[J.lIlIIIIIlI[19]] = lIlIIIIIIl[lIlIIIIIlI[71]];
        stringArray[J.lIlIIIIIlI[15]] = lIlIIIIIIl[lIlIIIIIlI[72]];
        stringArray[J.lIlIIIIIlI[20]] = lIlIIIIIIl[lIlIIIIIlI[73]];
        stringArray[J.lIlIIIIIlI[21]] = lIlIIIIIIl[lIlIIIIIlI[48]];
        stringArray[J.lIlIIIIIlI[22]] = lIlIIIIIIl[lIlIIIIIlI[74]];
        stringArray[J.lIlIIIIIlI[23]] = lIlIIIIIIl[lIlIIIIIlI[75]];
        jk = stringArray;
        jl = new WorldPoint(lIlIIIIIlI[76], lIlIIIIIlI[77], lIlIIIIIlI[0]);
        jm = new WorldPoint(lIlIIIIIlI[78], lIlIIIIIlI[79], lIlIIIIIlI[0]);
        jn = new WorldPoint(lIlIIIIIlI[80], lIlIIIIIlI[81], lIlIIIIIlI[0]);
        jo = new WorldPoint(lIlIIIIIlI[82], lIlIIIIIlI[83], lIlIIIIIlI[0]);
        jp = new WorldPoint(lIlIIIIIlI[84], lIlIIIIIlI[85], lIlIIIIIlI[0]);
        jq = new WorldPoint(lIlIIIIIlI[86], lIlIIIIIlI[87], lIlIIIIIlI[0]);
        bp = new ArrayList<d>();
        cA = lIlIIIIIlI[0];
    }

    private static boolean lIIIlIIIIIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIIllllllll(Object object) {
        return object != null;
    }

    private static boolean lIIIlIIIIIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIIIIllllIIll(String var6, String var10) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), lIlIIIIIlI[18]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(lIlIIIIIlI[3], var16);
            return new String(var7.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIllllllII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlIIIIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIIIIllllIlIl(String var18, String var2) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var22 = Cipher.getInstance("Blowfish");
            var22.init(lIlIIIIIlI[3], var8);
            return new String(var22.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIIIIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean af() {
        int n2;
        if (J.lIIIlIIIIIIll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIIIIIlI[18])) {
            int[] nArray = new int[lIlIIIIIlI[1]];
            nArray[J.lIlIIIIIlI[0]] = lIlIIIIIlI[38];
            if (J.lIIIIllllllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lIlIIIIIlI[1];
                0;
                if (null == null) return n2 != 0;
                return false;
            }
        }
        n2 = lIlIIIIIlI[0];
        return n2 != 0;
    }

    private static boolean lIIIIlllllllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIIlllllIll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public int ad() {
        try {
            J.cL();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 >= 2) {
            return (3 ^ (0x89 ^ 0x86)) & (0x18 ^ 0x47 ^ (0x3C ^ 0x6F) ^ -1);
        }
        return lIlIIIIIlI[54];
    }

    private static int lIIIIlllllIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static int lIIIIlllllIIl(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static String lIIIIllllIlII(String var17, String var9) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var13 = lIlIIIIIlI[0];
        char[] var21 = var17.toCharArray();
        int var1 = var21.length;
        int var23 = lIlIIIIIlI[0];
        while (J.lIIIIlllllIll(var23, var1)) {
            char var12 = var21[var23];
            var14.append((char)(var12 ^ var11[var13 % var11.length]));
            0;
            ++var13;
            ++var23;
            0;
            if ((0x54 ^ 0x7E ^ (0x25 ^ 0xB)) == (0x4B ^ 0x64 ^ (0x2B ^ 0))) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static boolean lIIIIlllllIlI(int n2) {
        return n2 != 0;
    }

    public static void cL() {
        if (J.lIIIIlllllIlI(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIIIIIl[lIlIIIIIlI[0]];
            b.a(bp);
            if (J.lIIIIlllllIll(bp.size(), lIlIIIIIlI[1])) {
                System.out.println(lIlIIIIIIl[lIlIIIIIlI[1]]);
                bn = lIlIIIIIlI[0];
            }
        }
        if (J.lIIIIllllllII(bn ? 1 : 0)) {
            block49: {
                BankLocation var20;
                if (J.lIIIIlllllIlI(Inventory.contains((int[])f.aU) ? 1 : 0) && J.lIIIIlllllIll(Movement.getRunEnergy(), lIlIIIIIlI[2])) {
                    Inventory.getFirst((int[])f.aU).interact(lIlIIIIIIl[lIlIIIIIlI[3]]);
                    Time.sleepTicks((int)lIlIIIIIlI[1]);
                    0;
                }
                if (J.lIIIIllllllIl(J.lIIIIlllllIII(e.u(), 70.0))) {
                    int[] nArray = new int[lIlIIIIIlI[1]];
                    nArray[J.lIlIIIIIlI[0]] = lIlIIIIIlI[4];
                    if (J.lIIIIlllllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lIlIIIIIlI[1]];
                        nArray2[J.lIlIIIIIlI[0]] = lIlIIIIIlI[4];
                        Inventory.getFirst((int[])nArray2).interact(lIlIIIIIIl[lIlIIIIIlI[5]]);
                    }
                }
                if (J.lIIIIllllllII(Movement.isRunEnabled() ? 1 : 0) && J.lIIIIlllllllI(Movement.getRunEnergy())) {
                    Movement.toggleRun();
                }
                if (J.lIIIIllllllII(J.al() ? 1 : 0) && J.lIIIIllllllII(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()))) {
                    var20 = BankLocation.getNearest();
                    if (J.lIIIIllllllll(var20) && J.lIIIIllllllII(var20.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIIIIIl[lIlIIIIIlI[6]];
                        a.a(var20);
                        Time.sleepTicks((int)lIlIIIIIlI[3]);
                        0;
                    }
                    if (J.lIIIIllllllll(var20) && J.lIIIIlllllIlI(var20.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIIIIIl[lIlIIIIIlI[7]];
                        if (J.lIIIIllllllII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIIIIIlI[8]);
                            0;
                        }
                        if (J.lIIIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
                            if (J.lIIIIlllllllI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIlIIIIIlI[6]);
                                0;
                            }
                            if (J.lIIIIlllllllI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIlIIIIIlI[3]);
                                0;
                            }
                            int[] nArray = new int[lIlIIIIIlI[9]];
                            nArray[J.lIlIIIIIlI[0]] = lIlIIIIIlI[10];
                            nArray[J.lIlIIIIIlI[1]] = lIlIIIIIlI[11];
                            nArray[J.lIlIIIIIlI[3]] = lIlIIIIIlI[12];
                            nArray[J.lIlIIIIIlI[5]] = lIlIIIIIlI[13];
                            nArray[J.lIlIIIIIlI[6]] = lIlIIIIIlI[4];
                            nArray[J.lIlIIIIIlI[7]] = lIlIIIIIlI[14];
                            if (J.lIIIIllllllII(e.b(nArray) ? 1 : 0)) {
                                J.O();
                                System.out.println(lIlIIIIIIl[lIlIIIIIlI[9]]);
                                bn = lIlIIIIIlI[1];
                                return;
                            }
                            int[] nArray3 = new int[lIlIIIIIlI[9]];
                            nArray3[J.lIlIIIIIlI[0]] = lIlIIIIIlI[10];
                            nArray3[J.lIlIIIIIlI[1]] = lIlIIIIIlI[11];
                            nArray3[J.lIlIIIIIlI[3]] = lIlIIIIIlI[12];
                            nArray3[J.lIlIIIIIlI[5]] = lIlIIIIIlI[13];
                            nArray3[J.lIlIIIIIlI[6]] = lIlIIIIIlI[4];
                            nArray3[J.lIlIIIIIlI[7]] = lIlIIIIIlI[14];
                            if (J.lIIIIlllllIlI(e.b(nArray3) ? 1 : 0)) {
                                Bank.withdraw((int)lIlIIIIIlI[11], (int)lIlIIIIIlI[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIlIIIIIlI[1]);
                                0;
                                Bank.withdraw((int)lIlIIIIIlI[14], (int)lIlIIIIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIlIIIIIlI[1]);
                                0;
                                Bank.withdraw((int)lIlIIIIIlI[16], (int)lIlIIIIIlI[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIlIIIIIlI[1]);
                                0;
                                Bank.withdraw((int)lIlIIIIIlI[13], (int)lIlIIIIIlI[7], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIlIIIIIlI[1]);
                                0;
                                Bank.withdraw((int)lIlIIIIIlI[10], (int)lIlIIIIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIlIIIIIlI[1]);
                                0;
                                a.b(f.aU, lIlIIIIIlI[6]);
                                a.a(lIlIIIIIlI[4], lIlIIIIIlI[15]);
                                a.b(f.be, lIlIIIIIlI[1]);
                            }
                        }
                    }
                }
                if (J.lIIIIllllllII(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId())) && J.lIIIIlllllIlI(J.al() ? 1 : 0)) {
                    if (J.lIIIlIIIIIIII(Players.getLocal().getWorldLocation().distanceTo(jl), lIlIIIIIlI[3])) {
                        AccBuilderShamans.c = lIlIIIIIIl[lIlIIIIIlI[17]];
                        if (J.lIIIIlllllIll(cA, lIlIIIIIlI[1])) {
                            e.v();
                            cA += lIlIIIIIlI[1];
                        }
                        Movement.walkTo((WorldPoint)jl);
                        0;
                        Time.sleepTicks((int)lIlIIIIIlI[1]);
                        0;
                    }
                    if (J.lIIIlIIIIIIIl(Players.getLocal().getWorldLocation().distanceTo(jl), lIlIIIIIlI[3])) {
                        AccBuilderShamans.c = lIlIIIIIIl[lIlIIIIIlI[18]];
                        if (J.lIIIIllllllII(J.lIIIIlllllIIl(g, 0L))) {
                            g = System.currentTimeMillis();
                        }
                        if (J.lIIIIlllllIlI(J.lIIIIlllllIIl(g, 0L)) && J.lIIIIlllllllI(J.lIIIIlllllIIl(e.a(g), 30000L))) {
                            cA = lIlIIIIIlI[0];
                            g = System.currentTimeMillis();
                        }
                        if (J.lIIIIlllllIll(cA, lIlIIIIIlI[1])) {
                            e.v();
                            cA += lIlIIIIIlI[1];
                        }
                        if (J.lIIIIlllllIlI(Inventory.isFull() ? 1 : 0)) {
                            int[] nArray = new int[lIlIIIIIlI[1]];
                            nArray[J.lIlIIIIIlI[0]] = lIlIIIIIlI[4];
                            Inventory.getFirst((int[])nArray).interact(lIlIIIIIIl[lIlIIIIIlI[19]]);
                            Time.sleepTicks((int)lIlIIIIIlI[3]);
                            0;
                        }
                        h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.g_Unknown.a(lIlIIIIIIl[lIlIIIIIlI[15]], jk, lIlIIIIIlI[1]);
                    }
                }
                if (J.lIIIlIIIIIIlI(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIIIIIlI[1])) {
                    dc = lIlIIIIIlI[0];
                    String[] stringArray = new String[lIlIIIIIlI[1]];
                    stringArray[J.lIlIIIIIlI[0]] = lIlIIIIIIl[lIlIIIIIlI[20]];
                    if (J.lIIIIllllllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.g_Unknown.a(jk);
                    }
                }
                if (J.lIIIlIIIIIIlI(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIIIIIlI[3])) {
                    if (J.lIIIIlllllIlI(Inventory.contains(item -> item.getName().contains(lIlIIIIIIl[lIlIIIIIlI[61]])) ? 1 : 0) && J.lIIIIllllllII(Equipment.contains(item -> item.getName().contains(lIlIIIIIIl[lIlIIIIIlI[60]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(lIlIIIIIIl[lIlIIIIIlI[53]])).interact(lIlIIIIIIl[lIlIIIIIlI[21]]);
                    }
                    if (J.lIIIIlllllIlI(Inventory.contains(item -> item.getName().contains(lIlIIIIIIl[lIlIIIIIlI[59]])) ? 1 : 0) && J.lIIIIllllllII(Equipment.contains(item -> item.getName().contains(lIlIIIIIIl[lIlIIIIIlI[58]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(lIlIIIIIIl[lIlIIIIIlI[57]])).interact(lIlIIIIIIl[lIlIIIIIlI[22]]);
                    }
                    if (J.lIIIIllllllII(Players.getLocal().getWorldLocation().equals((Object)jm) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIIIIIl[lIlIIIIIlI[23]];
                        Movement.walkTo((WorldPoint)jm);
                        0;
                        Time.sleepTicks((int)lIlIIIIIlI[1]);
                        0;
                    }
                    if (J.lIIIIlllllIlI(Players.getLocal().getWorldLocation().equals((Object)jm) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIIIIIlI[1]];
                        stringArray[J.lIlIIIIIlI[0]] = lIlIIIIIIl[lIlIIIIIlI[24]];
                        Inventory.getFirst((String[])stringArray).interact(lIlIIIIIIl[lIlIIIIIlI[25]]);
                        Time.sleepTicks((int)lIlIIIIIlI[3]);
                        0;
                    }
                }
                if (J.lIIIlIIIIIIlI(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIIIIIlI[5])) {
                    if (J.lIIIIllllllII(Players.getLocal().getWorldLocation().equals((Object)jn) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIIIIIl[lIlIIIIIlI[26]];
                        Movement.walkTo((WorldPoint)jn);
                        0;
                        Time.sleepTicks((int)lIlIIIIIlI[1]);
                        0;
                    }
                    if (J.lIIIIlllllIlI(Players.getLocal().getWorldLocation().equals((Object)jn) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIIIIIlI[1]];
                        stringArray[J.lIlIIIIIlI[0]] = lIlIIIIIIl[lIlIIIIIlI[27]];
                        Inventory.getFirst((String[])stringArray).interact(lIlIIIIIIl[lIlIIIIIlI[28]]);
                        Time.sleepTicks((int)lIlIIIIIlI[3]);
                        0;
                    }
                }
                if (J.lIIIlIIIIIIlI(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIIIIIlI[6])) {
                    if (J.lIIIIllllllII(Players.getLocal().getWorldLocation().equals((Object)jo) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIIIIIl[lIlIIIIIlI[29]];
                        Movement.walkTo((WorldPoint)jo);
                        0;
                        Time.sleepTicks((int)lIlIIIIIlI[1]);
                        0;
                    }
                    if (J.lIIIIlllllIlI(Players.getLocal().getWorldLocation().equals((Object)jo) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIIIIIlI[1]];
                        stringArray[J.lIlIIIIIlI[0]] = lIlIIIIIIl[lIlIIIIIlI[30]];
                        Inventory.getFirst((String[])stringArray).interact(lIlIIIIIIl[lIlIIIIIlI[31]]);
                        Time.sleepTicks((int)lIlIIIIIlI[3]);
                        0;
                    }
                }
                if (J.lIIIlIIIIIIlI(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIIIIIlI[7])) {
                    if (J.lIIIIllllllII(Players.getLocal().getWorldLocation().equals((Object)jp) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIIIIIl[lIlIIIIIlI[32]];
                        Movement.walkTo((WorldPoint)jp);
                        0;
                        Time.sleepTicks((int)lIlIIIIIlI[1]);
                        0;
                    }
                    if (J.lIIIIlllllIlI(Players.getLocal().getWorldLocation().equals((Object)jp) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIIIIIlI[1]];
                        stringArray[J.lIlIIIIIlI[0]] = lIlIIIIIIl[lIlIIIIIlI[33]];
                        Inventory.getFirst((String[])stringArray).interact(lIlIIIIIIl[lIlIIIIIlI[34]]);
                        Time.sleepTicks((int)lIlIIIIIlI[3]);
                        0;
                    }
                }
                if (J.lIIIlIIIIIIlI(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIIIIIlI[9])) {
                    if (J.lIIIlIIIIIIII(Players.getLocal().getWorldLocation().distanceTo(jq), lIlIIIIIlI[5])) {
                        AccBuilderShamans.c = lIlIIIIIIl[lIlIIIIIlI[35]];
                        Movement.walkTo((WorldPoint)jq);
                        0;
                        Time.sleepTicks((int)lIlIIIIIlI[1]);
                        0;
                    }
                    if (J.lIIIlIIIIIIIl(Players.getLocal().getWorldLocation().distanceTo(jq), lIlIIIIIlI[5])) {
                        AccBuilderShamans.c = lIlIIIIIIl[lIlIIIIIlI[36]];
                        if (J.lIIIIlllllIll(dc, lIlIIIIIlI[1])) {
                            Z.nU += lIlIIIIIlI[1];
                            Z.p(AccBuilderShamans.m);
                            dc += lIlIIIIIlI[1];
                            Z.nU = lIlIIIIIlI[0];
                            dd = lIlIIIIIlI[0];
                        }
                        h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.g_Unknown.a(lIlIIIIIIl[lIlIIIIIlI[37]], jk);
                    }
                }
                if (J.lIIIlIIIIIIlI(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIIIIIlI[17])) {
                    h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.g_Unknown.a(jk);
                }
                do {
                    int[] nArray = new int[lIlIIIIIlI[1]];
                    nArray[J.lIlIIIIIlI[0]] = lIlIIIIIlI[38];
                    if (!J.lIIIIlllllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block49;
                    if (J.lIIIIllllllll(Widgets.get((int)lIlIIIIIlI[39]))) {
                        Widget var5;
                        AccBuilderShamans.c = lIlIIIIIIl[lIlIIIIIlI[40]];
                        int[] nArray4 = new int[lIlIIIIIlI[1]];
                        nArray4[J.lIlIIIIIlI[0]] = lIlIIIIIlI[38];
                        Inventory.getFirst((int[])nArray4).interact(lIlIIIIIIl[lIlIIIIIlI[41]]);
                        Time.sleepTicks((int)lIlIIIIIlI[6]);
                        0;
                        AccBuilderShamans.c = lIlIIIIIIl[lIlIIIIIlI[42]];
                        var20 = Widgets.get((int)lIlIIIIIlI[39], (int)lIlIIIIIlI[23]);
                        if (J.lIIIIllllllll(var20)) {
                            var20.interact(lIlIIIIIIl[lIlIIIIIlI[43]]);
                            Time.sleepTicks((int)lIlIIIIIlI[1]);
                            0;
                        }
                        if (J.lIIIIllllllll(var5 = Widgets.get((int)lIlIIIIIlI[39], (int)lIlIIIIIlI[35]))) {
                            var5.interact(lIlIIIIIIl[lIlIIIIIlI[44]]);
                            Time.sleepTicks((int)lIlIIIIIlI[3]);
                            0;
                        }
                    }
                    Time.sleepTicks((int)lIlIIIIIlI[1]);
                    0;
                    0;
                } while (null == null);
                return;
            }
            h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.g_Unknown.a(new String[lIlIIIIIlI[0]]);
        }
    }

    private static void O() {
        d var3;
        Object var19;
        int[] nArray = new int[lIlIIIIIlI[1]];
        nArray[J.lIlIIIIIlI[0]] = lIlIIIIIlI[10];
        if (J.lIIIIllllllII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIlIIIIIlI[10], lIlIIIIIlI[1], lIlIIIIIlI[46]);
            bp.add(d2);
            0;
        }
        int[] nArray2 = new int[lIlIIIIIlI[1]];
        nArray2[J.lIlIIIIIlI[0]] = lIlIIIIIlI[14];
        if (J.lIIIIllllllII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var19 = new d(lIlIIIIIlI[14], lIlIIIIIlI[1], lIlIIIIIlI[47]);
            bp.add((d)var19);
            0;
        }
        int[] nArray3 = new int[lIlIIIIIlI[1]];
        nArray3[J.lIlIIIIIlI[0]] = lIlIIIIIlI[4];
        if (J.lIIIIllllllII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var19 = new d(lIlIIIIIlI[4], lIlIIIIIlI[48], lIlIIIIIlI[49]);
            bp.add((d)var19);
            0;
        }
        if (J.lIIIIllllllII(Bank.contains((Predicate)(var19 = item -> item.getName().toLowerCase().contains(lIlIIIIIIl[lIlIIIIIlI[56]]))) ? 1 : 0)) {
            var3 = new d(lIlIIIIIlI[50], lIlIIIIIlI[7], lIlIIIIIlI[51]);
            bp.add(var3);
            0;
        }
        int[] nArray4 = new int[lIlIIIIIlI[1]];
        nArray4[J.lIlIIIIIlI[0]] = lIlIIIIIlI[11];
        if (J.lIIIIllllllII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var3 = new d(lIlIIIIIlI[11], lIlIIIIIlI[15], lIlIIIIIlI[52]);
            bp.add(var3);
            0;
        }
        int[] nArray5 = new int[lIlIIIIIlI[1]];
        nArray5[J.lIlIIIIIlI[0]] = lIlIIIIIlI[16];
        if (J.lIIIIllllllII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var3 = new d(lIlIIIIIlI[16], lIlIIIIIlI[15], lIlIIIIIlI[52]);
            bp.add(var3);
            0;
        }
        int[] nArray6 = new int[lIlIIIIIlI[1]];
        nArray6[J.lIlIIIIIlI[0]] = lIlIIIIIlI[13];
        if (J.lIIIIllllllII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var3 = new d(lIlIIIIIlI[13], lIlIIIIIlI[53], lIlIIIIIlI[52]);
            bp.add(var3);
            0;
        }
        int[] nArray7 = new int[lIlIIIIIlI[1]];
        nArray7[J.lIlIIIIIlI[0]] = lIlIIIIIlI[12];
        if (J.lIIIIllllllII(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var3 = new d(lIlIIIIIlI[12], lIlIIIIIlI[7], j.bZ);
            bp.add(var3);
            0;
        }
    }

    private static boolean lIIIIllllllIl(int n2) {
        return n2 < 0;
    }

    @Override
    public boolean ac() {
        return lIlIIIIIlI[0];
    }
}

