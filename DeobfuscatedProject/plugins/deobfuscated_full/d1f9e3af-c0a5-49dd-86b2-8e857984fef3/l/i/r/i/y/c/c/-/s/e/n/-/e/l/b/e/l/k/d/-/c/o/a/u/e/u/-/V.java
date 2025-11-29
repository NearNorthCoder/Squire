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
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.an;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
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

public class V
implements W {
    private static final /* synthetic */ WorldPoint kt;
    static /* synthetic */ int cl;
    private static final /* synthetic */ WorldPoint kr;
    public static /* synthetic */ List<d> bv;
    public static /* synthetic */ long g;
    public static /* synthetic */ boolean bt;
    private static final /* synthetic */ WorldPoint ks;
    private static /* synthetic */ int[] lIlIlllIl;
    private static final /* synthetic */ WorldPoint kv;
    static /* synthetic */ int bT;
    static /* synthetic */ boolean cm;
    public static final /* synthetic */ String[] kq;
    private static final /* synthetic */ WorldPoint ku;
    private static /* synthetic */ String[] lIlIllIll;
    private static final /* synthetic */ WorldPoint kw;

    static {
        V.lIIlIIllIlII();
        V.lIIlIIllIIll();
        String[] stringArray = new String[lIlIlllIl[24]];
        stringArray[V.lIlIlllIl[0]] = lIlIllIll[lIlIlllIl[62]];
        stringArray[V.lIlIlllIl[1]] = lIlIllIll[lIlIlllIl[63]];
        stringArray[V.lIlIlllIl[3]] = lIlIllIll[lIlIlllIl[64]];
        stringArray[V.lIlIlllIl[5]] = lIlIllIll[lIlIlllIl[65]];
        stringArray[V.lIlIlllIl[6]] = lIlIllIll[lIlIlllIl[66]];
        stringArray[V.lIlIlllIl[7]] = lIlIllIll[lIlIlllIl[67]];
        stringArray[V.lIlIlllIl[9]] = lIlIllIll[lIlIlllIl[68]];
        stringArray[V.lIlIlllIl[17]] = lIlIllIll[lIlIlllIl[69]];
        stringArray[V.lIlIlllIl[18]] = lIlIllIll[lIlIlllIl[70]];
        stringArray[V.lIlIlllIl[19]] = lIlIllIll[lIlIlllIl[71]];
        stringArray[V.lIlIlllIl[15]] = lIlIllIll[lIlIlllIl[72]];
        stringArray[V.lIlIlllIl[20]] = lIlIllIll[lIlIlllIl[73]];
        stringArray[V.lIlIlllIl[21]] = lIlIllIll[lIlIlllIl[48]];
        stringArray[V.lIlIlllIl[22]] = lIlIllIll[lIlIlllIl[74]];
        stringArray[V.lIlIlllIl[23]] = lIlIllIll[lIlIlllIl[75]];
        kq = stringArray;
        kr = new WorldPoint(lIlIlllIl[76], lIlIlllIl[77], lIlIlllIl[0]);
        ks = new WorldPoint(lIlIlllIl[78], lIlIlllIl[79], lIlIlllIl[0]);
        kt = new WorldPoint(lIlIlllIl[80], lIlIlllIl[81], lIlIlllIl[0]);
        ku = new WorldPoint(lIlIlllIl[82], lIlIlllIl[83], lIlIlllIl[0]);
        kv = new WorldPoint(lIlIlllIl[84], lIlIlllIl[85], lIlIlllIl[0]);
        kw = new WorldPoint(lIlIlllIl[86], lIlIlllIl[87], lIlIlllIl[0]);
        bv = new ArrayList<d>();
        bT = lIlIlllIl[0];
    }

    private static boolean lIIlIIllIlll(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean V() {
        int n2;
        if (V.lIIlIlIIIIII(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIlllIl[18])) {
            int[] nArray = new int[lIlIlllIl[1]];
            nArray[V.lIlIlllIl[0]] = lIlIlllIl[38];
            if (V.lIIlIIlllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lIlIlllIl[1];
                0;
                if ((130 + 14 - 31 + 30 ^ 42 + 12 - 6 + 91) > ((9 + 126 - -54 + 27 ^ 82 + 21 - 48 + 80) & (126 + 49 - 40 + 19 ^ 166 + 80 - 235 + 186 ^ -1))) return n2 != 0;
                return ((0xB2 ^ 0x9D ^ (0x96 ^ 0x84)) & (0x72 ^ 0x67 ^ (0x79 ^ 0x51) ^ -1)) != 0;
            }
        }
        n2 = lIlIlllIl[0];
        return n2 != 0;
    }

    @Override
    public boolean S() {
        return lIlIlllIl[0];
    }

    @Override
    public String U() {
        return lIlIllIll[lIlIlllIl[55]];
    }

    private static void lIIlIIllIIll() {
        lIlIllIll = new String[lIlIlllIl[88]];
        V.lIlIllIll[V.lIlIlllIl[0]] = V."Buying items";
        V.lIlIllIll[V.lIlIlllIl[1]] = V."Finished buying items, switching back to quest";
        V.lIlIllIll[V.lIlIlllIl[3]] = V."Drink";
        V.lIlIllIll[V.lIlIlllIl[5]] = V."Eat";
        V.lIlIllIll[V.lIlIlllIl[6]] = V."Nav to bank";
        V.lIlIllIll[V.lIlIlllIl[7]] = V."Handling banking";
        V.lIlIllIll[V.lIlIlllIl[9]] = V."We are missing quest supplies, switching to BUYING";
        V.lIlIllIll[V.lIlIlllIl[17]] = V."Nav to start";
        V.lIlIllIll[V.lIlIlllIl[18]] = V."Interact npc";
        V.lIlIllIll[V.lIlIlllIl[19]] = V."Drop";
        V.lIlIllIll[V.lIlIlllIl[15]] = V."Veos";
        V.lIlIllIll[V.lIlIlllIl[20]] = V."Treasure scroll";
        V.lIlIllIll[V.lIlIlllIl[21]] = V."Wear";
        V.lIlIllIll[V.lIlIlllIl[22]] = V."Wear";
        V.lIlIllIll[V.lIlIlllIl[23]] = V."Nav to dig 1";
        V.lIlIllIll[V.lIlIlllIl[24]] = V."Spade";
        V.lIlIllIll[V.lIlIlllIl[25]] = V."Dig";
        V.lIlIllIll[V.lIlIlllIl[26]] = V."Nav to dig 2";
        V.lIlIllIll[V.lIlIlllIl[27]] = V."Spade";
        V.lIlIllIll[V.lIlIlllIl[28]] = V."Dig";
        V.lIlIllIll[V.lIlIlllIl[29]] = V."Nav to dig 3";
        V.lIlIllIll[V.lIlIlllIl[30]] = V."Spade";
        V.lIlIllIll[V.lIlIlllIl[31]] = V."Dig";
        V.lIlIllIll[V.lIlIlllIl[32]] = V."Nav to dig 4";
        V.lIlIllIll[V.lIlIlllIl[33]] = V."Spade";
        V.lIlIllIll[V.lIlIlllIl[34]] = V."Dig";
        V.lIlIllIll[V.lIlIlllIl[35]] = V."Nav to veos finish";
        V.lIlIllIll[V.lIlIlllIl[36]] = V."Interact npc";
        V.lIlIllIll[V.lIlIlllIl[37]] = V."Veos";
        V.lIlIllIll[V.lIlIlllIl[40]] = V."Rubbing lamp";
        V.lIlIllIll[V.lIlIlllIl[41]] = V."Rub";
        V.lIlIllIll[V.lIlIlllIl[42]] = V."Selecting slayer";
        V.lIlIllIll[V.lIlIlllIl[43]] = V."Slayer";
        V.lIlIllIll[V.lIlIlllIl[44]] = V."Confirm";
        V.lIlIllIll[V.lIlIlllIl[45]] = V."Spade";
        V.lIlIllIll[V.lIlIlllIl[55]] = V."X marks the spot quest";
        V.lIlIllIll[V.lIlIlllIl[56]] = V."ring of wealth (";
        V.lIlIllIll[V.lIlIlllIl[57]] = V."wealth";
        V.lIlIllIll[V.lIlIlllIl[58]] = V."wealth";
        V.lIlIllIll[V.lIlIlllIl[59]] = V."wealth";
        V.lIlIllIll[V.lIlIlllIl[53]] = V."glory";
        V.lIlIllIll[V.lIlIlllIl[60]] = V."glory";
        V.lIlIllIll[V.lIlIlllIl[61]] = V."glory";
        V.lIlIllIll[V.lIlIlllIl[62]] = V."Ok, I'm up for an adventure.";
        V.lIlIllIll[V.lIlIlllIl[63]] = V."A glass of your finest ale please.";
        V.lIlIllIll[V.lIlIlllIl[64]] = V."Morgan needs your help!";
        V.lIlIllIll[V.lIlIlllIl[65]] = V."Yes.";
        V.lIlIllIll[V.lIlIlllIl[66]] = V."I'm looking for a quest!";
        V.lIlIllIll[V.lIlIlllIl[67]] = V."Ok, let me help then.";
        V.lIlIllIll[V.lIlIlllIl[68]] = V."Father Aereck sent me to talk to you.";
        V.lIlIllIll[V.lIlIlllIl[69]] = V."He's got a ghost haunting his graveyard.";
        V.lIlIllIll[V.lIlIlllIl[70]] = V."Yep, now tell me what the problem is.";
        V.lIlIllIll[V.lIlIlllIl[71]] = V."Sure.";
        V.lIlIllIll[V.lIlIlllIl[72]] = V."I'm wearing an amulet of ghost speak!";
        V.lIlIllIll[V.lIlIlllIl[73]] = V."Yes, I'm sure.";
        V.lIlIllIll[V.lIlIlllIl[48]] = V."How can I help?";
        V.lIlIllIll[V.lIlIlllIl[74]] = V."I'm looking for a quest.";
        V.lIlIllIll[V.lIlIlllIl[75]] = V."Can I help?";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        String[] stringArray = new String[lIlIlllIl[1]];
        stringArray[V.lIlIlllIl[0]] = lIlIllIll[lIlIlllIl[45]];
        if (V.lIIlIIllIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lIlIlllIl[1]];
            nArray[V.lIlIlllIl[0]] = lIlIlllIl[4];
            if (V.lIIlIIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lIlIlllIl[1];
                0;
                if ((92 + 30 - 113 + 129 ^ 111 + 104 - 206 + 133) >= 0) return n2 != 0;
                return false;
            }
        }
        n2 = lIlIlllIl[0];
        return n2 != 0;
    }

    private static boolean lIIlIlIIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIIlIIllIlII() {
        lIlIlllIl = new int[89];
        V.lIlIlllIl[0] = (0x76 ^ 0x38) & ~(0x17 ^ 0x59);
        V.lIlIlllIl[1] = 1;
        V.lIlIlllIl[2] = 0x24 ^ 7 ^ (0xD3 ^ 0xB6);
        V.lIlIlllIl[3] = 2;
        V.lIlIlllIl[4] = 0xFFFFA3FB & 0x5D7F;
        V.lIlIlllIl[5] = 3;
        V.lIlIlllIl[6] = 0x2E ^ 0x2A;
        V.lIlIlllIl[7] = 8 + 89 - 73 + 131 ^ 129 + 85 - 127 + 71;
        V.lIlIlllIl[8] = -(0xF5 ^ 0xB0) & (0xFFFFD7FF & 0x3BCC);
        V.lIlIlllIl[9] = 0x3F ^ 0x4E ^ (0xE9 ^ 0x9E);
        V.lIlIlllIl[10] = 0xFFFFAEDF & 0x7FEA;
        V.lIlIlllIl[11] = -(0xFFFFB8F7 & 0x67B9) & (0xFFFFFFFC & 0x3FFB);
        V.lIlIlllIl[12] = 0xFFFFFBF5 & 0x355B;
        V.lIlIlllIl[13] = 0xFFFF9F6F & 0x7FD7;
        V.lIlIlllIl[14] = -(0xFFFFE7FF & 0x5C44) & (0xFFFFD7FB & 0x6FFF);
        V.lIlIlllIl[15] = 0xE7 ^ 0xA4 ^ (0x5F ^ 0x16);
        V.lIlIlllIl[16] = -(0xAA ^ 0x99) & (0xFFFFFF7B & 0x1FFF);
        V.lIlIlllIl[17] = 0x87 ^ 0x80;
        V.lIlIlllIl[18] = 0x5F ^ 0x2B ^ (0x5F ^ 0x23);
        V.lIlIlllIl[19] = 0xB1 ^ 0xC0 ^ (0x7A ^ 2);
        V.lIlIlllIl[20] = 0x72 ^ 0x79;
        V.lIlIlllIl[21] = 115 + 132 - 97 + 23 ^ 129 + 130 - 200 + 102;
        V.lIlIlllIl[22] = 0x79 ^ 0x74;
        V.lIlIlllIl[23] = 0x4D ^ 0x43;
        V.lIlIlllIl[24] = 0x94 ^ 0x9B;
        V.lIlIlllIl[25] = 174 + 119 - 124 + 18 ^ 1 + 63 - -7 + 100;
        V.lIlIlllIl[26] = 0xA8 ^ 0xB9;
        V.lIlIlllIl[27] = 0x19 ^ 0x4E ^ (3 ^ 0x46);
        V.lIlIlllIl[28] = 0x1E ^ 0x5E ^ (0xDA ^ 0x89);
        V.lIlIlllIl[29] = 128 + 114 - 222 + 157 ^ 157 + 132 - 206 + 82;
        V.lIlIlllIl[30] = 0xCF ^ 0xC5 ^ (0xBA ^ 0xA5);
        V.lIlIlllIl[31] = 0xDE ^ 0xAB ^ (0x7B ^ 0x18);
        V.lIlIlllIl[32] = 1 + 137 - 21 + 25 ^ 31 + 70 - -44 + 8;
        V.lIlIlllIl[33] = 0x71 ^ 2 ^ (0xC6 ^ 0xAD);
        V.lIlIlllIl[34] = 169 + 56 - 145 + 109 ^ 30 + 47 - -12 + 75;
        V.lIlIlllIl[35] = 0xDF ^ 0x91 ^ (9 ^ 0x5D);
        V.lIlIlllIl[36] = 97 + 87 - 60 + 39 ^ 55 + 84 - 132 + 177;
        V.lIlIlllIl[37] = 0xA1 ^ 0xB3 ^ (0x82 ^ 0x8C);
        V.lIlIlllIl[38] = -(0xFFFFC5DC & 0x3FF7) & (0xFFFFFFF7 & 0x5FFB);
        V.lIlIlllIl[39] = 36 + 130 - 55 + 42 + (178 + 156 - 324 + 195) - (69 + 88 - 68 + 40) + (0x5B ^ 0x50);
        V.lIlIlllIl[40] = 0xB8 ^ 0xA5;
        V.lIlIlllIl[41] = 2 ^ 0x1C;
        V.lIlIlllIl[42] = 0x17 ^ 8;
        V.lIlIlllIl[43] = 0xA9 ^ 0x89;
        V.lIlIlllIl[44] = 0x3B ^ 0x1A;
        V.lIlIlllIl[45] = 29 + 33 - 60 + 139 ^ 20 + 113 - 63 + 105;
        V.lIlIlllIl[46] = 0xFFFFFF7F & 0x3E9C;
        V.lIlIlllIl[47] = 0xFFFFDF0F & 0x37FC;
        V.lIlIlllIl[48] = 22 + 72 - -2 + 53 ^ 31 + 4 - -76 + 51;
        V.lIlIlllIl[49] = 0xFFFFE3F5 & 0x1DFE;
        V.lIlIlllIl[50] = 0xFFFFBFEF & 0x6EDC;
        V.lIlIlllIl[51] = 0xFFFFE1B9 & 0x7FEE;
        V.lIlIlllIl[52] = 0xFFFFCFEF & 0x377C;
        V.lIlIlllIl[53] = 0x8E ^ 0xA6;
        V.lIlIlllIl[54] = 0x25 ^ 7 ^ (9 ^ 0x4F);
        V.lIlIlllIl[55] = 0x85 ^ 0xA6;
        V.lIlIlllIl[56] = 101 + 9 - 63 + 133 ^ 61 + 71 - 57 + 69;
        V.lIlIlllIl[57] = 0x53 ^ 0x76;
        V.lIlIlllIl[58] = 4 + 92 - 82 + 123 ^ 163 + 150 - 262 + 124;
        V.lIlIlllIl[59] = 0xA6 ^ 0x81;
        V.lIlIlllIl[60] = 98 + 46 - 89 + 92 ^ 92 + 102 - 21 + 13;
        V.lIlIlllIl[61] = 0x29 ^ 3;
        V.lIlIlllIl[62] = 0x95 ^ 0xBE;
        V.lIlIlllIl[63] = 0x70 ^ 0x5C;
        V.lIlIlllIl[64] = 0xA9 ^ 0x84;
        V.lIlIlllIl[65] = 68 + 109 - 174 + 231 ^ 86 + 161 - 228 + 177;
        V.lIlIlllIl[66] = 0x1E ^ 0x31;
        V.lIlIlllIl[67] = 0xD1 ^ 0xA3 ^ (0xE5 ^ 0xA7);
        V.lIlIlllIl[68] = 0xD1 ^ 0x9D ^ (0x20 ^ 0x5D);
        V.lIlIlllIl[69] = 0x3A ^ 0x66 ^ (0xC6 ^ 0xA8);
        V.lIlIlllIl[70] = 0x37 ^ 4;
        V.lIlIlllIl[71] = 0xA1 ^ 0x95;
        V.lIlIlllIl[72] = 0x69 ^ 0x36 ^ (0xEE ^ 0x84);
        V.lIlIlllIl[73] = 0x5A ^ 0x67 ^ (0 ^ 0xB);
        V.lIlIlllIl[74] = 0xB8 ^ 0x96 ^ (0x32 ^ 0x24);
        V.lIlIlllIl[75] = 143 + 150 - 264 + 158 ^ 38 + 47 - 64 + 109;
        V.lIlIlllIl[76] = -(0xFFFFA5F7 & 0x7B4B) & (0xFFFFAFDF & 0x7DFF);
        V.lIlIlllIl[77] = 0xFFFFAFE8 & 0x5CBF;
        V.lIlIlllIl[78] = -(0x5C ^ 0x1D) & (0xFFFFFDDF & 0xEFE);
        V.lIlIlllIl[79] = 0xFFFF8DAD & 0x7EDB;
        V.lIlIlllIl[80] = 0xFFFFBC83 & 0x4FFF;
        V.lIlIlllIl[81] = -(0xFFFFD3C3 & 0x7F7F) & (0xFFFFDFDE & 0x7FEF);
        V.lIlIlllIl[82] = -(0xFFFFFBDF & 0x44B9) & (0xFFFFDDBD & 0x6EFF);
        V.lIlIlllIl[83] = 0xFFFF8DFE & 0x7EC1;
        V.lIlIlllIl[84] = 0xFFFF9D9E & 0x6E67;
        V.lIlIlllIl[85] = 0xFFFFAEBF & 0x5DFB;
        V.lIlIlllIl[86] = -(0xFFFFBEC6 & 0x753B) & (0xFFFFBFFF & 0x7FEF);
        V.lIlIlllIl[87] = 0xFFFFCDAE & 0x3EFF;
        V.lIlIlllIl[88] = 0xFE ^ 0xC4;
    }

    public static void dd() {
        if (V.lIIlIIllIlll(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIllIll[lIlIlllIl[0]];
            b.a(bv);
            if (V.lIIlIIlllIII(bv.size(), lIlIlllIl[1])) {
                System.out.println(lIlIllIll[lIlIlllIl[1]]);
                bt = lIlIlllIl[0];
            }
        }
        if (V.lIIlIIlllIIl(bt ? 1 : 0)) {
            block49: {
                BankLocation lllIIIIllIlIll;
                if (V.lIIlIIllIlll(Inventory.contains((int[])f.aV) ? 1 : 0) && V.lIIlIIlllIII(Movement.getRunEnergy(), lIlIlllIl[2])) {
                    Inventory.getFirst((int[])f.aV).interact(lIlIllIll[lIlIlllIl[3]]);
                    Time.sleepTicks((int)lIlIlllIl[1]);
                    0;
                }
                if (V.lIIlIIlllIlI(V.lIIlIIllIlIl(e.u(), 70.0))) {
                    int[] nArray = new int[lIlIlllIl[1]];
                    nArray[V.lIlIlllIl[0]] = lIlIlllIl[4];
                    if (V.lIIlIIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lIlIlllIl[1]];
                        nArray2[V.lIlIlllIl[0]] = lIlIlllIl[4];
                        Inventory.getFirst((int[])nArray2).interact(lIlIllIll[lIlIlllIl[5]]);
                    }
                }
                if (V.lIIlIIlllIIl(Movement.isRunEnabled() ? 1 : 0) && V.lIIlIIlllIll(Movement.getRunEnergy())) {
                    Movement.toggleRun();
                }
                if (V.lIIlIIlllIIl(V.ab() ? 1 : 0) && V.lIIlIIlllIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()))) {
                    lllIIIIllIlIll = BankLocation.getNearest();
                    if (V.lIIlIIllllII(lllIIIIllIlIll) && V.lIIlIIlllIIl(lllIIIIllIlIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlIllIll[lIlIlllIl[6]];
                        a.a(lllIIIIllIlIll);
                        Time.sleepTicks((int)lIlIlllIl[3]);
                        0;
                    }
                    if (V.lIIlIIllllII(lllIIIIllIlIll) && V.lIIlIIllIlll(lllIIIIllIlIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlIllIll[lIlIlllIl[7]];
                        if (V.lIIlIIlllIIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIlllIl[8]);
                            0;
                        }
                        if (V.lIIlIIllIlll(Bank.isOpen() ? 1 : 0)) {
                            if (V.lIIlIIlllIll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIlIlllIl[6]);
                                0;
                            }
                            if (V.lIIlIIlllIll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIlIlllIl[3]);
                                0;
                            }
                            int[] nArray = new int[lIlIlllIl[9]];
                            nArray[V.lIlIlllIl[0]] = lIlIlllIl[10];
                            nArray[V.lIlIlllIl[1]] = lIlIlllIl[11];
                            nArray[V.lIlIlllIl[3]] = lIlIlllIl[12];
                            nArray[V.lIlIlllIl[5]] = lIlIlllIl[13];
                            nArray[V.lIlIlllIl[6]] = lIlIlllIl[4];
                            nArray[V.lIlIlllIl[7]] = lIlIlllIl[14];
                            if (V.lIIlIIlllIIl(e.b(nArray) ? 1 : 0)) {
                                V.af();
                                System.out.println(lIlIllIll[lIlIlllIl[9]]);
                                bt = lIlIlllIl[1];
                                return;
                            }
                            int[] nArray3 = new int[lIlIlllIl[9]];
                            nArray3[V.lIlIlllIl[0]] = lIlIlllIl[10];
                            nArray3[V.lIlIlllIl[1]] = lIlIlllIl[11];
                            nArray3[V.lIlIlllIl[3]] = lIlIlllIl[12];
                            nArray3[V.lIlIlllIl[5]] = lIlIlllIl[13];
                            nArray3[V.lIlIlllIl[6]] = lIlIlllIl[4];
                            nArray3[V.lIlIlllIl[7]] = lIlIlllIl[14];
                            if (V.lIIlIIllIlll(e.b(nArray3) ? 1 : 0)) {
                                Bank.withdraw((int)lIlIlllIl[11], (int)lIlIlllIl[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIlIlllIl[1]);
                                0;
                                Bank.withdraw((int)lIlIlllIl[14], (int)lIlIlllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIlIlllIl[1]);
                                0;
                                Bank.withdraw((int)lIlIlllIl[16], (int)lIlIlllIl[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIlIlllIl[1]);
                                0;
                                Bank.withdraw((int)lIlIlllIl[13], (int)lIlIlllIl[7], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIlIlllIl[1]);
                                0;
                                Bank.withdraw((int)lIlIlllIl[10], (int)lIlIlllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIlIlllIl[1]);
                                0;
                                a.b(f.aV, lIlIlllIl[6]);
                                a.a(lIlIlllIl[4], lIlIlllIl[15]);
                                a.b(f.bf, lIlIlllIl[1]);
                            }
                        }
                    }
                }
                if (V.lIIlIIlllIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId())) && V.lIIlIIllIlll(V.ab() ? 1 : 0)) {
                    if (V.lIIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(kr), lIlIlllIl[3])) {
                        AccBuilderEasyClues.c = lIlIllIll[lIlIlllIl[17]];
                        if (V.lIIlIIlllIII(bT, lIlIlllIl[1])) {
                            e.v();
                            bT += lIlIlllIl[1];
                        }
                        Movement.walkTo((WorldPoint)kr);
                        0;
                        Time.sleepTicks((int)lIlIlllIl[1]);
                        0;
                    }
                    if (V.lIIlIIlllllI(Players.getLocal().getWorldLocation().distanceTo(kr), lIlIlllIl[3])) {
                        AccBuilderEasyClues.c = lIlIllIll[lIlIlllIl[18]];
                        if (V.lIIlIIlllIIl(V.lIIlIIllIllI(g, 0L))) {
                            g = System.currentTimeMillis();
                        }
                        if (V.lIIlIIllIlll(V.lIIlIIllIllI(g, 0L)) && V.lIIlIIlllIll(V.lIIlIIllIllI(e.a(g), 30000L))) {
                            bT = lIlIlllIl[0];
                            g = System.currentTimeMillis();
                        }
                        if (V.lIIlIIlllIII(bT, lIlIlllIl[1])) {
                            e.v();
                            bT += lIlIlllIl[1];
                        }
                        if (V.lIIlIIllIlll(Inventory.isFull() ? 1 : 0)) {
                            int[] nArray = new int[lIlIlllIl[1]];
                            nArray[V.lIlIlllIl[0]] = lIlIlllIl[4];
                            Inventory.getFirst((int[])nArray).interact(lIlIllIll[lIlIlllIl[19]]);
                            Time.sleepTicks((int)lIlIlllIl[3]);
                            0;
                        }
                        l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g.a(lIlIllIll[lIlIlllIl[15]], kq, lIlIlllIl[1]);
                    }
                }
                if (V.lIIlIIllllll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIlllIl[1])) {
                    cl = lIlIlllIl[0];
                    String[] stringArray = new String[lIlIlllIl[1]];
                    stringArray[V.lIlIlllIl[0]] = lIlIllIll[lIlIlllIl[20]];
                    if (V.lIIlIIlllIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g.a(kq);
                    }
                }
                if (V.lIIlIIllllll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIlllIl[3])) {
                    if (V.lIIlIIllIlll(Inventory.contains(item -> item.getName().contains(lIlIllIll[lIlIlllIl[61]])) ? 1 : 0) && V.lIIlIIlllIIl(Equipment.contains(item -> item.getName().contains(lIlIllIll[lIlIlllIl[60]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(lIlIllIll[lIlIlllIl[53]])).interact(lIlIllIll[lIlIlllIl[21]]);
                    }
                    if (V.lIIlIIllIlll(Inventory.contains(item -> item.getName().contains(lIlIllIll[lIlIlllIl[59]])) ? 1 : 0) && V.lIIlIIlllIIl(Equipment.contains(item -> item.getName().contains(lIlIllIll[lIlIlllIl[58]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(lIlIllIll[lIlIlllIl[57]])).interact(lIlIllIll[lIlIlllIl[22]]);
                    }
                    if (V.lIIlIIlllIIl(Players.getLocal().getWorldLocation().equals((Object)ks) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlIllIll[lIlIlllIl[23]];
                        Movement.walkTo((WorldPoint)ks);
                        0;
                        Time.sleepTicks((int)lIlIlllIl[1]);
                        0;
                    }
                    if (V.lIIlIIllIlll(Players.getLocal().getWorldLocation().equals((Object)ks) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIlllIl[1]];
                        stringArray[V.lIlIlllIl[0]] = lIlIllIll[lIlIlllIl[24]];
                        Inventory.getFirst((String[])stringArray).interact(lIlIllIll[lIlIlllIl[25]]);
                        Time.sleepTicks((int)lIlIlllIl[3]);
                        0;
                    }
                }
                if (V.lIIlIIllllll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIlllIl[5])) {
                    if (V.lIIlIIlllIIl(Players.getLocal().getWorldLocation().equals((Object)kt) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlIllIll[lIlIlllIl[26]];
                        Movement.walkTo((WorldPoint)kt);
                        0;
                        Time.sleepTicks((int)lIlIlllIl[1]);
                        0;
                    }
                    if (V.lIIlIIllIlll(Players.getLocal().getWorldLocation().equals((Object)kt) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIlllIl[1]];
                        stringArray[V.lIlIlllIl[0]] = lIlIllIll[lIlIlllIl[27]];
                        Inventory.getFirst((String[])stringArray).interact(lIlIllIll[lIlIlllIl[28]]);
                        Time.sleepTicks((int)lIlIlllIl[3]);
                        0;
                    }
                }
                if (V.lIIlIIllllll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIlllIl[6])) {
                    if (V.lIIlIIlllIIl(Players.getLocal().getWorldLocation().equals((Object)ku) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlIllIll[lIlIlllIl[29]];
                        Movement.walkTo((WorldPoint)ku);
                        0;
                        Time.sleepTicks((int)lIlIlllIl[1]);
                        0;
                    }
                    if (V.lIIlIIllIlll(Players.getLocal().getWorldLocation().equals((Object)ku) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIlllIl[1]];
                        stringArray[V.lIlIlllIl[0]] = lIlIllIll[lIlIlllIl[30]];
                        Inventory.getFirst((String[])stringArray).interact(lIlIllIll[lIlIlllIl[31]]);
                        Time.sleepTicks((int)lIlIlllIl[3]);
                        0;
                    }
                }
                if (V.lIIlIIllllll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIlllIl[7])) {
                    if (V.lIIlIIlllIIl(Players.getLocal().getWorldLocation().equals((Object)kv) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlIllIll[lIlIlllIl[32]];
                        Movement.walkTo((WorldPoint)kv);
                        0;
                        Time.sleepTicks((int)lIlIlllIl[1]);
                        0;
                    }
                    if (V.lIIlIIllIlll(Players.getLocal().getWorldLocation().equals((Object)kv) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIlllIl[1]];
                        stringArray[V.lIlIlllIl[0]] = lIlIllIll[lIlIlllIl[33]];
                        Inventory.getFirst((String[])stringArray).interact(lIlIllIll[lIlIlllIl[34]]);
                        Time.sleepTicks((int)lIlIlllIl[3]);
                        0;
                    }
                }
                if (V.lIIlIIllllll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIlllIl[9])) {
                    if (V.lIIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(kw), lIlIlllIl[5])) {
                        AccBuilderEasyClues.c = lIlIllIll[lIlIlllIl[35]];
                        Movement.walkTo((WorldPoint)kw);
                        0;
                        Time.sleepTicks((int)lIlIlllIl[1]);
                        0;
                    }
                    if (V.lIIlIIlllllI(Players.getLocal().getWorldLocation().distanceTo(kw), lIlIlllIl[5])) {
                        AccBuilderEasyClues.c = lIlIllIll[lIlIlllIl[36]];
                        if (V.lIIlIIlllIII(cl, lIlIlllIl[1])) {
                            an.py += lIlIlllIl[1];
                            an.o(AccBuilderEasyClues.m);
                            cl += lIlIlllIl[1];
                            an.py = lIlIlllIl[0];
                            cm = lIlIlllIl[0];
                        }
                        l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g.a(lIlIllIll[lIlIlllIl[37]], kq);
                    }
                }
                if (V.lIIlIIllllll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIlllIl[17])) {
                    l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g.a(kq);
                }
                do {
                    int[] nArray = new int[lIlIlllIl[1]];
                    nArray[V.lIlIlllIl[0]] = lIlIlllIl[38];
                    if (!V.lIIlIIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block49;
                    if (V.lIIlIIllllII(Widgets.get((int)lIlIlllIl[39]))) {
                        Widget lllIIIIllIlIlI;
                        AccBuilderEasyClues.c = lIlIllIll[lIlIlllIl[40]];
                        int[] nArray4 = new int[lIlIlllIl[1]];
                        nArray4[V.lIlIlllIl[0]] = lIlIlllIl[38];
                        Inventory.getFirst((int[])nArray4).interact(lIlIllIll[lIlIlllIl[41]]);
                        Time.sleepTicks((int)lIlIlllIl[6]);
                        0;
                        AccBuilderEasyClues.c = lIlIllIll[lIlIlllIl[42]];
                        lllIIIIllIlIll = Widgets.get((int)lIlIlllIl[39], (int)lIlIlllIl[23]);
                        if (V.lIIlIIllllII(lllIIIIllIlIll)) {
                            lllIIIIllIlIll.interact(lIlIllIll[lIlIlllIl[43]]);
                            Time.sleepTicks((int)lIlIlllIl[1]);
                            0;
                        }
                        if (V.lIIlIIllllII(lllIIIIllIlIlI = Widgets.get((int)lIlIlllIl[39], (int)lIlIlllIl[35]))) {
                            lllIIIIllIlIlI.interact(lIlIllIll[lIlIlllIl[44]]);
                            Time.sleepTicks((int)lIlIlllIl[3]);
                            0;
                        }
                    }
                    Time.sleepTicks((int)lIlIlllIl[1]);
                    0;
                    0;
                } while (3 > -1);
                return;
            }
            l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g.a(new String[lIlIlllIl[0]]);
        }
    }

    private static boolean lIIlIIlllIlI(int n2) {
        return n2 < 0;
    }

    private static boolean lIIlIIllllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void af() {
        d lllIIIIllIIllI;
        Object lllIIIIllIIlll;
        int[] nArray = new int[lIlIlllIl[1]];
        nArray[V.lIlIlllIl[0]] = lIlIlllIl[10];
        if (V.lIIlIIlllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIlIlllIl[10], lIlIlllIl[1], lIlIlllIl[46]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[lIlIlllIl[1]];
        nArray2[V.lIlIlllIl[0]] = lIlIlllIl[14];
        if (V.lIIlIIlllIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllIIIIllIIlll = new d(lIlIlllIl[14], lIlIlllIl[1], lIlIlllIl[47]);
            bv.add((d)lllIIIIllIIlll);
            0;
        }
        int[] nArray3 = new int[lIlIlllIl[1]];
        nArray3[V.lIlIlllIl[0]] = lIlIlllIl[4];
        if (V.lIIlIIlllIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllIIIIllIIlll = new d(lIlIlllIl[4], lIlIlllIl[48], lIlIlllIl[49]);
            bv.add((d)lllIIIIllIIlll);
            0;
        }
        if (V.lIIlIIlllIIl(Bank.contains((Predicate)(lllIIIIllIIlll = item -> item.getName().toLowerCase().contains(lIlIllIll[lIlIlllIl[56]]))) ? 1 : 0)) {
            lllIIIIllIIllI = new d(lIlIlllIl[50], lIlIlllIl[7], lIlIlllIl[51]);
            bv.add(lllIIIIllIIllI);
            0;
        }
        int[] nArray4 = new int[lIlIlllIl[1]];
        nArray4[V.lIlIlllIl[0]] = lIlIlllIl[11];
        if (V.lIIlIIlllIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lllIIIIllIIllI = new d(lIlIlllIl[11], lIlIlllIl[15], lIlIlllIl[52]);
            bv.add(lllIIIIllIIllI);
            0;
        }
        int[] nArray5 = new int[lIlIlllIl[1]];
        nArray5[V.lIlIlllIl[0]] = lIlIlllIl[16];
        if (V.lIIlIIlllIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lllIIIIllIIllI = new d(lIlIlllIl[16], lIlIlllIl[15], lIlIlllIl[52]);
            bv.add(lllIIIIllIIllI);
            0;
        }
        int[] nArray6 = new int[lIlIlllIl[1]];
        nArray6[V.lIlIlllIl[0]] = lIlIlllIl[13];
        if (V.lIIlIIlllIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lllIIIIllIIllI = new d(lIlIlllIl[13], lIlIlllIl[53], lIlIlllIl[52]);
            bv.add(lllIIIIllIIllI);
            0;
        }
        int[] nArray7 = new int[lIlIlllIl[1]];
        nArray7[V.lIlIlllIl[0]] = lIlIlllIl[12];
        if (V.lIIlIIlllIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lllIIIIllIIllI = new d(lIlIlllIl[12], lIlIlllIl[7], i.bq);
            bv.add(lllIIIIllIIllI);
            0;
        }
    }

    private static boolean lIIlIIlllllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIlIIlllIII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public int T() {
        try {
            V.dd();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 < ((0x30 ^ 0x6C) & ~(0x17 ^ 0x4B))) {
            return 3 & ~3;
        }
        return lIlIlllIl[54];
    }

    private static boolean lIIlIIllllII(Object object) {
        return object != null;
    }

    private static String lIIlIIlIlllI(String lllIIIIIllIlIl, String lllIIIIIllIlII) {
        try {
            SecretKeySpec lllIIIIIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIIIIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIIIIlllIIl = Cipher.getInstance("Blowfish");
            lllIIIIIlllIIl.init(lIlIlllIl[3], lllIIIIIlllIlI);
            return new String(lllIIIIIlllIIl.doFinal(Base64.getDecoder().decode(lllIIIIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIIIIlllIII) {
            lllIIIIIlllIII.printStackTrace();
            return null;
        }
    }

    private static int lIIlIIllIlIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIIlIIlllIll(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIIllllll(int n2, int n3) {
        return n2 == n3;
    }

    private static int lIIlIIllIllI(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static String lIIlIIlIllIl(String lllIIIIlIIIIlI, String lllIIIIlIIIIll) {
        try {
            SecretKeySpec lllIIIIlIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIIIlIIIIll.getBytes(StandardCharsets.UTF_8)), lIlIlllIl[18]), "DES");
            Cipher lllIIIIlIIIllI = Cipher.getInstance("DES");
            lllIIIIlIIIllI.init(lIlIlllIl[3], lllIIIIlIIIlll);
            return new String(lllIIIIlIIIllI.doFinal(Base64.getDecoder().decode(lllIIIIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIIIlIIIlIl) {
            lllIIIIlIIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIlllIIl(int n2) {
        return n2 == 0;
    }

    private static String lIIlIIlIllII(String lllIIIIlIllIIl, String lllIIIIlIllIII) {
        lllIIIIlIllIIl = new String(Base64.getDecoder().decode(lllIIIIlIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIIIIlIlIlll = new StringBuilder();
        char[] lllIIIIlIlIllI = lllIIIIlIllIII.toCharArray();
        int lllIIIIlIlIlIl = lIlIlllIl[0];
        char[] lllIIIIlIIllll = lllIIIIlIllIIl.toCharArray();
        int lllIIIIlIIlllI = lllIIIIlIIllll.length;
        int lllIIIIlIIllIl = lIlIlllIl[0];
        while (V.lIIlIIlllIII(lllIIIIlIIllIl, lllIIIIlIIlllI)) {
            char lllIIIIlIllIlI = lllIIIIlIIllll[lllIIIIlIIllIl];
            lllIIIIlIlIlll.append((char)(lllIIIIlIllIlI ^ lllIIIIlIlIllI[lllIIIIlIlIlIl % lllIIIIlIlIllI.length]));
            0;
            ++lllIIIIlIlIlIl;
            ++lllIIIIlIIllIl;
            0;
            if (3 >= 2) continue;
            return null;
        }
        return String.valueOf(lllIIIIlIlIlll);
    }
}

