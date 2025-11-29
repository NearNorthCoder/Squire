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
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.C;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.Q;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.T;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.U;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.b;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.d;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.f;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.g;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.i;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.m;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.n;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.q;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.s;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.u;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.w;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.y;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.z;
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

public class r
implements G {
    static /* synthetic */ WorldArea co;
    private static /* synthetic */ String ct;
    static /* synthetic */ int ck;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ WorldPoint cr;
    static /* synthetic */ WorldPoint cq;
    private static /* synthetic */ String[] bR;
    static /* synthetic */ boolean cl;
    static /* synthetic */ WorldPoint cg;
    static /* synthetic */ WorldArea cp;
    private static /* synthetic */ String[] lIIIlllIll;
    private static /* synthetic */ int cs;
    static /* synthetic */ WorldArea cn;
    private static /* synthetic */ int[] lIIlIIIIII;
    public static /* synthetic */ List<d> bv;

    private static void aF() {
        WorldArea worldArea = new WorldArea(lIIlIIIIII[52], lIIlIIIIII[56], lIIlIIIIII[16], lIIlIIIIII[4], lIIlIIIIII[1]);
        if (r.llllIlIIlIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] stringArray = new String[lIIlIIIIII[0]];
            stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[142]];
            TileObjects.getNearest((String[])stringArray).interact(lIIIlllIll[lIIlIIIIII[143]]);
            Time.sleepTicks((int)lIIlIIIIII[9]);
            0;
        }
        if (r.llllIlIIlIll(cn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && r.llllIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(cg), lIIlIIIIII[21])) {
            AccBuilderRogues.c = lIIIlllIll[lIIlIIIIII[144]];
            if (r.llllIlIIlIIl(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)cg);
            0;
            Time.sleepTicks((int)lIIlIIIIII[0]);
            0;
        }
        if (r.llllIlIIlIIl(cn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && r.llllIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo(cg), lIIlIIIIII[21])) {
            g.a(lIIIlllIll[lIIlIIIIII[145]], bR);
        }
        if (r.llllIlIIlIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIII[52], lIIlIIIIII[53], lIIlIIIIII[1])) ? 1 : 0)) {
            String[] stringArray = new String[lIIlIIIIII[0]];
            stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[99]];
            TileObjects.getNearest((String[])stringArray).interact(lIIIlllIll[lIIlIIIIII[146]]);
            Time.sleepTicks((int)lIIlIIIIII[9]);
            0;
        }
    }

    private static boolean llllIlIIlIIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean ab() {
        void llIIIlIlllI;
        int[] nArray = new int[lIIlIIIIII[20]];
        nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[36];
        nArray[r.lIIlIIIIII[0]] = lIIlIIIIII[37];
        nArray[r.lIIlIIIIII[9]] = lIIlIIIIII[34];
        nArray[r.lIIlIIIIII[11]] = lIIlIIIIII[40];
        nArray[r.lIIlIIIIII[13]] = lIIlIIIIII[41];
        nArray[r.lIIlIIIIII[8]] = lIIlIIIIII[30];
        nArray[r.lIIlIIIIII[16]] = lIIlIIIIII[31];
        int[] nArray2 = nArray;
        int llIIIlIllIl = lIIlIIIIII[1];
        while (r.llllIlIIlIlI(llIIIlIllIl, ((void)llIIIlIlllI).length)) {
            int[] nArray3 = new int[lIIlIIIIII[0]];
            nArray3[r.lIIlIIIIII[1]] = llIIIlIlllI[llIIIlIllIl];
            if (r.llllIlIIlIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIlIIIIII[1];
            }
            ++llIIIlIllIl;
            0;
            if (1 >= 0) continue;
            return ((32 + 110 - -32 + 10 ^ 105 + 119 - 130 + 65) & (0xD ^ 0x75 ^ (0xD5 ^ 0x8A) ^ -1)) != 0;
        }
        return lIIlIIIIII[0];
    }

    private static boolean llllIlIlIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void llllIlIIIlll() {
        lIIlIIIIII = new int[182];
        r.lIIlIIIIII[0] = 1;
        r.lIIlIIIIII[1] = (55 + 81 - 109 + 106 ^ 63 + 26 - 32 + 79) & (0x5F ^ 0x6B ^ (0x92 ^ 0xAB) ^ -1);
        r.lIIlIIIIII[2] = 86 + 120 - 68 + 102;
        r.lIIlIIIIII[3] = 0x56 ^ 0x17;
        r.lIIlIIIIII[4] = 0x57 ^ 0x1F ^ (0x17 ^ 0x55);
        r.lIIlIIIIII[5] = -(0xFFFFB849 & 0x6FF7) & (0xFFFFEB7F & 0x3DEE);
        r.lIIlIIIIII[6] = (0xF ^ 1) & ~(0x38 ^ 0x36) ^ (0x5A ^ 0x66);
        r.lIIlIIIIII[7] = 0xFFFFFF7F & 0x1B3;
        r.lIIlIIIIII[8] = 0x87 ^ 0x82;
        r.lIIlIIIIII[9] = 2;
        r.lIIlIIIIII[10] = 0x4E ^ 0x50 ^ (0x43 ^ 0x7D);
        r.lIIlIIIIII[11] = 3;
        r.lIIlIIIIII[12] = 0x6B ^ 0x78;
        r.lIIlIIIIII[13] = 0x54 ^ 0x16 ^ (0xF8 ^ 0xBE);
        r.lIIlIIIIII[14] = 118 + 131 - 165 + 56 ^ 50 + 36 - 54 + 143;
        r.lIIlIIIIII[15] = 0x32 ^ 0;
        r.lIIlIIIIII[16] = 0x47 ^ 0x41;
        r.lIIlIIIIII[17] = 0xFFFFB7F2 & 0x4BFF;
        r.lIIlIIIIII[18] = -(0xFFFFFBCE & 0x47F5) & (0xFFFFDBDF & 0x6FFF);
        r.lIIlIIIIII[19] = 0x45 ^ 0x4C;
        r.lIIlIIIIII[20] = 0x34 ^ 0x6E ^ (0xF8 ^ 0xA5);
        r.lIIlIIIIII[21] = 130 + 119 - 102 + 13 ^ 120 + 30 - 97 + 115;
        r.lIIlIIIIII[22] = 0xA3 ^ 0x8B;
        r.lIIlIIIIII[23] = 44 + 43 - -84 + 1 ^ 150 + 90 - 208 + 135;
        r.lIIlIIIIII[24] = 0xCE ^ 0xC2;
        r.lIIlIIIIII[25] = 0x5E ^ 0x24 ^ (0x25 ^ 0x52);
        r.lIIlIIIIII[26] = 0x18 ^ 0x16;
        r.lIIlIIIIII[27] = -(0xFFFFEF71 & 0x3CFF) & (0xFFFFFFF8 & 0x3FFF);
        r.lIIlIIIIII[28] = 0x9B ^ 0x94;
        r.lIIlIIIIII[29] = 0xFFFFAF8B & 0x57FF;
        r.lIIlIIIIII[30] = 0xFFFFCFBF & 0x7CDF;
        r.lIIlIIIIII[31] = 0xFFFFEDA5 & 0x5EFF;
        r.lIIlIIIIII[32] = 0xFFFFCB9F & 0x366E;
        r.lIIlIIIIII[33] = -(0xFFFFFEF5 & 0x13DB) & (0xFFFFDBFF & 0x3FFF);
        r.lIIlIIIIII[34] = -(0xFFFFCBEB & 0x3CBD) & (0xFFFFFFFB & 0x39FD);
        r.lIIlIIIIII[35] = 0x82 ^ 0x92;
        r.lIIlIIIIII[36] = -(0xFFFFB443 & 0x6BBD) & (0xFFFFBFD7 & 0x7F6F);
        r.lIIlIIIIII[37] = -(0xFFFFEC3D & 0x73F3) & (0xFFFFFD7F & 0x67FB);
        r.lIIlIIIIII[38] = 0xFFFFD9FF & 0x2F2B;
        r.lIIlIIIIII[39] = 0xFFFFA6EF & 0x5FDF;
        r.lIIlIIIIII[40] = -(0xFFFFD1DA & 0x7F2F) & (0xFFFFF7FF & 0x5FBF);
        r.lIIlIIIIII[41] = 0xFFFFBD30 & 0x6BCF;
        r.lIIlIIIIII[42] = 0x46 ^ 0x57;
        r.lIIlIIIIII[43] = 0xFFFFBFDB & 0x5F6E;
        r.lIIlIIIIII[44] = 0xFFFFAE3B & 0x53EC;
        r.lIIlIIIIII[45] = 0xFFFFCFFB & 0x33E7;
        r.lIIlIIIIII[46] = 0x33 ^ 0x21;
        r.lIIlIIIIII[47] = 0x99 ^ 0x81;
        r.lIIlIIIIII[48] = 0xD3 ^ 0xC7;
        r.lIIlIIIIII[49] = 0x1D ^ 8;
        r.lIIlIIIIII[50] = 130 + 127 - 165 + 80 ^ 173 + 185 - 214 + 42;
        r.lIIlIIIIII[51] = 0x60 ^ 0x77;
        r.lIIlIIIIII[52] = -(0xFFFFF67F & 0x7BE7) & (0xFFFFFEFF & 0x7F7F);
        r.lIIlIIIIII[53] = 0xFFFFEFFA & 0x1D25;
        r.lIIlIIIIII[54] = 0x4F ^ 0x25 ^ (0x79 ^ 0xA);
        r.lIIlIIIIII[55] = 0xB7 ^ 0xAD;
        r.lIIlIIIIII[56] = -(131 + 117 - 149 + 67) & (0xFFFFCFFF & 0x3DBF);
        r.lIIlIIIIII[57] = 105 + 13 - -8 + 55 ^ 84 + 64 - 124 + 150;
        r.lIIlIIIIII[58] = 58 + 24 - 14 + 105 ^ 41 + 153 - 72 + 55;
        r.lIIlIIIIII[59] = 0xE4 ^ 0x80 ^ (0x72 ^ 0xB);
        r.lIIlIIIIII[60] = -(0xFFFFADEB & 0x7B56) & (0xFFFFFFF7 & 0x39FF);
        r.lIIlIIIIII[61] = 0xFFFFBF5D & 0x4EF3;
        r.lIIlIIIIII[62] = 0xFFFFCDFF & 0x3FBF;
        r.lIIlIIIIII[63] = -(0xFFFFDF65 & 0x6B9B) & (0xFFFFFFFF & 0x5BBE);
        r.lIIlIIIIII[64] = 0x96 ^ 0x88;
        r.lIIlIIIIII[65] = 0xE2 ^ 0x89 ^ (0xC ^ 0x78);
        r.lIIlIIIIII[66] = 0x8F ^ 0xAE;
        r.lIIlIIIIII[67] = 0x29 ^ 0xB;
        r.lIIlIIIIII[68] = 0x15 ^ 0x54 ^ (0x73 ^ 0x16);
        r.lIIlIIIIII[69] = 0xA ^ 0x7A ^ (0x55 ^ 0);
        r.lIIlIIIIII[70] = 0x25 ^ 0x14 ^ (0xB8 ^ 0xAF);
        r.lIIlIIIIII[71] = 0x1D ^ 0x3A;
        r.lIIlIIIIII[72] = 35 + 71 - 35 + 65 ^ 100 + 129 - 87 + 19;
        r.lIIlIIIIII[73] = 0xFFFFF4C7 & 0xEFBC;
        r.lIIlIIIIII[74] = 0xFFFFFF66 & 0xF7DD;
        r.lIIlIIIIII[75] = 99 + 209 - 136 + 61 ^ 58 + 115 - 22 + 44;
        r.lIIlIIIIII[76] = (0x2B ^ 0xE) & ~(0xA3 ^ 0x86) ^ (0x32 ^ 0x19);
        r.lIIlIIIIII[77] = 0x60 ^ 0x4C;
        r.lIIlIIIIII[78] = 0x1D ^ 0x30;
        r.lIIlIIIIII[79] = 2 ^ 0x5D ^ (0xEF ^ 0x9E);
        r.lIIlIIIIII[80] = 0x10 ^ 0x3F;
        r.lIIlIIIIII[81] = 0xA1 ^ 0xC7 ^ (0xD ^ 0x5B);
        r.lIIlIIIIII[82] = 0x2A ^ 0x1B;
        r.lIIlIIIIII[83] = 0xFFFFFFFD & 0x787;
        r.lIIlIIIIII[84] = 117 + 149 - 151 + 37 ^ 150 + 139 - 259 + 141;
        r.lIIlIIIIII[85] = 0x21 ^ 3 ^ (0x37 ^ 0x21);
        r.lIIlIIIIII[86] = 0x35 ^ 0;
        r.lIIlIIIIII[87] = 0xB1 ^ 0x87;
        r.lIIlIIIIII[88] = 100 + 50 - 22 + 23 ^ 51 + 58 - -29 + 22;
        r.lIIlIIIIII[89] = 0xF0 ^ 0xB6;
        r.lIIlIIIIII[90] = 0x71 ^ 0x38;
        r.lIIlIIIIII[91] = -(0xFFFFCF63 & 0x72BE) & (0xFFFFDFEF & 0x6FB7);
        r.lIIlIIIIII[92] = 0xFFFFAFF7 & 0x5DEF;
        r.lIIlIIIIII[93] = 0x2C ^ 0x7E ^ (0x3B ^ 0x51);
        r.lIIlIIIIII[94] = 0x36 ^ 0xF;
        r.lIIlIIIIII[95] = 0x70 ^ 0x7E ^ (0xCB ^ 0x89);
        r.lIIlIIIIII[96] = 0x70 ^ 0x4A;
        r.lIIlIIIIII[97] = 0x5E ^ 2 ^ (0x5F ^ 0x53);
        r.lIIlIIIIII[98] = 0x18 ^ 0x23;
        r.lIIlIIIIII[99] = 206 + 68 - 207 + 142 ^ 135 + 46 - 134 + 92;
        r.lIIlIIIIII[100] = 0xFE ^ 0x8A ^ (0x12 ^ 2);
        r.lIIlIIIIII[101] = 0x87 ^ 0xBA;
        r.lIIlIIIIII[102] = 0xD ^ 0x3D ^ (0x76 ^ 0x78);
        r.lIIlIIIIII[103] = 0xFFFFCF4D & 0x3FBF;
        r.lIIlIIIIII[104] = 0x12 ^ 0x2D;
        r.lIIlIIIIII[105] = 0xA ^ 0x72;
        r.lIIlIIIIII[106] = 59 + 126 - 148 + 93;
        r.lIIlIIIIII[107] = 0xED ^ 0xAD;
        r.lIIlIIIIII[108] = (0x54 ^ 0x25) + (115 + 24 - 101 + 92) - (0x75 ^ 7) + (0x27 ^ 0x2C);
        r.lIIlIIIIII[109] = 0x56 ^ 0x12 ^ (0xBF ^ 0xB9);
        r.lIIlIIIIII[110] = 0xFFFFAFF1 & 0x5BAF;
        r.lIIlIIIIII[111] = -(0xFFFFF219 & 0x6FEF) & (0xFFFFEEBF & 0x7FEF);
        r.lIIlIIIIII[112] = 0xFFFFDFED & 0x2CBA;
        r.lIIlIIIIII[113] = 0x6D ^ 0x4C ^ (0xDB ^ 0xB9);
        r.lIIlIIIIII[114] = 0xA0 ^ 0x8A ^ (0x65 ^ 0xB);
        r.lIIlIIIIII[115] = 0xDF ^ 0x9A;
        r.lIIlIIIIII[116] = 65 + 82 - 40 + 43;
        r.lIIlIIIIII[117] = -(0xFFFFD7CF & 0x3B7B) & (0xFFFFFFEF & 0x1F7F);
        r.lIIlIIIIII[118] = -(0xFFFFEE2D & 0x31F7) & (0xFFFFAF36 & 0x7DFF);
        r.lIIlIIIIII[119] = 0x1B ^ 0x5C;
        r.lIIlIIIIII[120] = 0x8D ^ 0xC5;
        r.lIIlIIIIII[121] = 120 + 80 - 144 + 104;
        r.lIIlIIIIII[122] = (0x5D ^ 7) + (25 + 154 - 139 + 120) - (133 + 62 - 45 + 61) + (16 + 36 - -23 + 56);
        r.lIIlIIIIII[123] = 0xFFFFEFF7 & 0x1B7B;
        r.lIIlIIIIII[124] = -(0xFFFFB7B8 & 0x584F) & (0xFFFFDFDF & 0x3DF7);
        r.lIIlIIIIII[125] = 0x36 ^ 0x7C;
        r.lIIlIIIIII[126] = 0x11 ^ 0x5A;
        r.lIIlIIIIII[127] = 111 + 90 - 172 + 118 + (90 + 150 - 185 + 123) - (0xFFFFF74F & 0x9F3) + (126 + 143 - 247 + 156);
        r.lIIlIIIIII[128] = 1 ^ (0x34 ^ 0x78);
        r.lIIlIIIIII[129] = 0x1E ^ 0x50;
        r.lIIlIIIIII[130] = 127 + 20 - 45 + 101 ^ 31 + 104 - 120 + 117;
        r.lIIlIIIIII[131] = 25 + 109 - 106 + 162;
        r.lIIlIIIIII[132] = (0x43 ^ 0x24) + (0 ^ 0xD) - (0xDF ^ 0xB3) + (173 + 174 - 214 + 59);
        r.lIIlIIIIII[133] = -(0xFFFFBA6C & 0x7D97) & (0xFFFFBFEB & 0x79F7);
        r.lIIlIIIIII[134] = 0xB ^ 0x5A;
        r.lIIlIIIIII[135] = 0xF2 ^ 0xA0;
        r.lIIlIIIIII[136] = (0x73 ^ 0x54) + (0x26 ^ 0x11) - -(0x7B ^ 0x26) + (0x29 ^ 0x3E);
        r.lIIlIIIIII[137] = 62 + 51 - 10 + 31 + (0xB1 ^ 0x97) - (0x64 ^ 0x5B) + (0x4A ^ 0x25);
        r.lIIlIIIIII[138] = 0x10 ^ 0x43;
        r.lIIlIIIIII[139] = 0x56 ^ 2;
        r.lIIlIIIIII[140] = 0x79 ^ 0x2C;
        r.lIIlIIIIII[141] = (0xC6 ^ 0x88) + (136 + 174 - 215 + 115) - (63 + 28 - 3 + 84) + (0xDF ^ 0xAD);
        r.lIIlIIIIII[142] = 3 + 7 - -89 + 102 ^ 60 + 49 - -12 + 38;
        r.lIIlIIIIII[143] = 7 ^ 0x50;
        r.lIIlIIIIII[144] = 53 + 119 - 59 + 115 ^ 22 + 55 - -65 + 46;
        r.lIIlIIIIII[145] = 0x6D ^ 0xD ^ (0x95 ^ 0xAC);
        r.lIIlIIIIII[146] = 0x22 ^ 0x79;
        r.lIIlIIIIII[147] = 0xFFFFB779 & 0x4DFE;
        r.lIIlIIIIII[148] = -(0xFFFFD5EF & 0x3B96) & (0xFFFF9FCD & 0x77F7);
        r.lIIlIIIIII[149] = -(0xFFFFCFD5 & 0x39AE) & (0xFFFFFDEB & 0x2FFF);
        r.lIIlIIIIII[150] = -(0xFFFFF7EF & 0x6C94) & (0xFFFFFFDB & Short.MAX_VALUE);
        r.lIIlIIIIII[151] = -(0xFFFF9375 & 0x7CAF) & (0xFFFFDFF7 & 0x37FC);
        r.lIIlIIIIII[152] = -(0xFFFFEFD7 & 0x3869) & (0xFFFFFFFF & 0x3DEE);
        r.lIIlIIIIII[153] = 0xFFFFFFFD & 0x67C2;
        r.lIIlIIIIII[154] = 0xFFFF83FD & 0x7FEA;
        r.lIIlIIIIII[155] = -(0xFFFFFE9D & 0x5363) & (0xFFFFFF7F & 0x5FFF);
        r.lIIlIIIIII[156] = -(0x8E ^ 0xAA) & (0xFFFFEEEF & 0x3FFF);
        r.lIIlIIIIII[157] = 0xFFFFE1F9 & 0x7FAE;
        r.lIIlIIIIII[158] = 0xFFFFFD5F & 0x7B4;
        r.lIIlIIIIII[159] = 0x98 ^ 0xA0 ^ (0xF ^ 0x6B);
        r.lIIlIIIIII[160] = 0xA4 ^ 0x9C ^ (0xA2 ^ 0xC7);
        r.lIIlIIIIII[161] = 0x1A ^ 0x44;
        r.lIIlIIIIII[162] = 0x21 ^ 0x7E;
        r.lIIlIIIIII[163] = 0xFFFFCC57 & 0x3FBB;
        r.lIIlIIIIII[164] = -(0xFFFFF6BD & 0x7BD3) & (0xFFFFFFFF & 0x7FFD);
        r.lIIlIIIIII[165] = -(0xFFFFBF7B & 0x7297) & (0xFFFFFFBF & 0x3FFF);
        r.lIIlIIIIII[166] = (0x9A ^ 0x8F) + (0xA4 ^ 0xAF) - -(0x5B ^ 0x23) + (0xEE ^ 0x89);
        r.lIIlIIIIII[167] = -(0xFFFFF8DB & 0x57ED) & (0xFFFFFFDF & 0x5CFD);
        r.lIIlIIIIII[168] = -(0xFFFFC9F5 & 0x76CB) & (0xFFFFFFFF & 0x4DDE);
        r.lIIlIIIIII[169] = -(0xFFFFA449 & 0x5FB7) & (0xFFFF9EED & 0x6FFF);
        r.lIIlIIIIII[170] = 0xFFFFBF7E & 0x4DD7;
        r.lIIlIIIIII[171] = -(0xFFFFB7CF & 0x7979) & (0xFFFFFFFF & 0x3F6C);
        r.lIIlIIIIII[172] = 0xFFFFBDEF & 0x4FD7;
        r.lIIlIIIIII[173] = 9 ^ 0x69;
        r.lIIlIIIIII[174] = 0xEC ^ 0x8D;
        r.lIIlIIIIII[175] = 0x33 ^ 0x51;
        r.lIIlIIIIII[176] = 0xE ^ 0x6D;
        r.lIIlIIIIII[177] = 0xDC ^ 0x8D ^ (0x49 ^ 0x7D);
        r.lIIlIIIIII[178] = 0x31 ^ 0x39 ^ (0xF3 ^ 0x9D);
        r.lIIlIIIIII[179] = 0x21 ^ 0x46;
        r.lIIlIIIIII[180] = 0xC1 ^ 0xA9;
        r.lIIlIIIIII[181] = 0xC7 ^ 0xAE;
    }

    private static void llllIIllIlII() {
        lIIIlllIll = new String[lIIlIIIIII[181]];
        r.lIIIlllIll[r.lIIlIIIIII[1]] = r."Finished buying items, switching back to quest";
        r.lIIIlllIll[r.lIIlIIIIII[0]] = r."Waterfall";
        r.lIIIlllIll[r.lIIlIIIIII[9]] = r."Priest in Peril";
        r.lIIIlllIll[r.lIIlIIIIII[11]] = r."Ernest the Chicken";
        r.lIIIlllIll[r.lIIlIIIIII[13]] = r."Crafting";
        r.lIIIlllIll[r.lIIlIIIIII[8]] = r."Woodcutting";
        r.lIIIlllIll[r.lIIlIIIIII[16]] = r."Training range";
        r.lIIIlllIll[r.lIIlIIIIII[20]] = r."Varrock Quiz";
        r.lIIIlllIll[r.lIIlIIIIII[21]] = r."RFD Dwarf";
        r.lIIIlllIll[r.lIIlIIIIII[19]] = r."A Porcine";
        r.lIIIlllIll[r.lIIlIIIIII[4]] = r."Antique lamp";
        r.lIIIlllIll[r.lIIlIIIIII[23]] = r."Client of Kourend";
        r.lIIIlllIll[r.lIIlIIIIII[24]] = r."Antique lamp";
        r.lIIIlllIll[r.lIIlIIIIII[25]] = r."";
        r.lIIIlllIll[r.lIIlIIIIII[26]] = r."Nav to bank";
        r.lIIIlllIll[r.lIIlIIIIII[28]] = r."Handling banking";
        r.lIIIlllIll[r.lIIlIIIIII[35]] = r."We are missing quest supplies, switching to BUYING";
        r.lIIIlllIll[r.lIIlIIIIII[42]] = r."We are missing quest supplies, switching to BUYING";
        r.lIIIlllIll[r.lIIlIIIIII[46]] = r."Drink";
        r.lIIIlllIll[r.lIIlIIIIII[12]] = r."Drink";
        r.lIIIlllIll[r.lIIlIIIIII[48]] = r."Shark";
        r.lIIIlllIll[r.lIIlIIIIII[49]] = r."Shark";
        r.lIIIlllIll[r.lIIlIIIIII[50]] = r."Eat";
        r.lIIIlllIll[r.lIIlIIIIII[51]] = r."Nav to start";
        r.lIIIlllIll[r.lIIlIIIIII[47]] = r."Ava";
        r.lIIIlllIll[r.lIIlIIIIII[54]] = r."Bookcase";
        r.lIIIlllIll[r.lIIlIIIIII[55]] = r."Search";
        r.lIIIlllIll[r.lIIlIIIIII[57]] = r."Bookcase";
        r.lIIIlllIll[r.lIIlIIIIII[58]] = r."Search";
        r.lIIIlllIll[r.lIIlIIIIII[59]] = r."Wear";
        r.lIIIlllIll[r.lIIlIIIIII[64]] = r."Nav to charter";
        r.lIIIlllIll[r.lIIlIIIIII[65]] = r."Trader Crewmember";
        r.lIIIlllIll[r.lIIlIIIIII[10]] = r."Trade";
        r.lIIIlllIll[r.lIIlIIIIII[66]] = r."Break";
        r.lIIIlllIll[r.lIIlIIIIII[67]] = r."Nav to ecto";
        r.lIIIlllIll[r.lIIlIIIIII[14]] = r."Bones";
        r.lIIIlllIll[r.lIIlIIIIII[68]] = r."Staircase";
        r.lIIIlllIll[r.lIIlIIIIII[69]] = r."Climb-up";
        r.lIIIlllIll[r.lIIlIIIIII[70]] = r."Loader";
        r.lIIIlllIll[r.lIIlIIIIII[71]] = r."Bones";
        r.lIIIlllIll[r.lIIlIIIIII[22]] = r."Bones";
        r.lIIIlllIll[r.lIIlIIIIII[72]] = r."Loader";
        r.lIIIlllIll[r.lIIlIIIIII[75]] = r."Bones";
        r.lIIIlllIll[r.lIIlIIIIII[76]] = r."Staircase";
        r.lIIIlllIll[r.lIIlIIIIII[77]] = r."Climb-down";
        r.lIIIlllIll[r.lIIlIIIIII[78]] = r."Bonemeal";
        r.lIIIlllIll[r.lIIlIIIIII[79]] = r."Ectofuntus";
        r.lIIIlllIll[r.lIIlIIIIII[80]] = r."Worship";
        r.lIIIlllIll[r.lIIlIIIIII[81]] = r."Bonemeal";
        r.lIIIlllIll[r.lIIlIIIIII[82]] = r."Ghost disciple";
        r.lIIIlllIll[r.lIIlIIIIII[15]] = r."Malcolm";
        r.lIIIlllIll[r.lIIlIIIIII[84]] = r."Alice";
        r.lIIIlllIll[r.lIIlIIIIII[85]] = r."Malcolm";
        r.lIIIlllIll[r.lIIlIIIIII[86]] = r."Alice";
        r.lIIIlllIll[r.lIIlIIIIII[87]] = r."Malcolm";
        r.lIIIlllIll[r.lIIlIIIIII[88]] = r."Alice";
        r.lIIIlllIll[r.lIIlIIIIII[93]] = r."Nav to crone";
        r.lIIIlllIll[r.lIIlIIIIII[94]] = r."Old crone";
        r.lIIIlllIll[r.lIIlIIIIII[96]] = r."Malcolm";
        r.lIIIlllIll[r.lIIlIIIIII[98]] = r."Malcolm";
        r.lIIIlllIll[r.lIIlIIIIII[6]] = r."Malcolm";
        r.lIIIlllIll[r.lIIlIIIIII[101]] = r."Undead chicken";
        r.lIIIlllIll[r.lIIlIIIIII[102]] = r."Iron bar";
        r.lIIIlllIll[r.lIIlIIIIII[104]] = r."Iron bar";
        r.lIIIlllIll[r.lIIlIIIIII[107]] = r."Witch";
        r.lIIIlllIll[r.lIIlIIIIII[3]] = r."Witch";
        r.lIIIlllIll[r.lIIlIIIIII[109]] = r."Bar magnet";
        r.lIIIlllIll[r.lIIlIIIIII[113]] = r."Nav to mine";
        r.lIIIlllIll[r.lIIlIIIIII[114]] = r."Hammer";
        r.lIIIlllIll[r.lIIlIIIIII[115]] = r."Selected iron";
        r.lIIIlllIll[r.lIIlIIIIII[89]] = r."Bar magnet";
        r.lIIIlllIll[r.lIIlIIIIII[119]] = r."Undead tree";
        r.lIIIlllIll[r.lIIlIIIIII[120]] = r."Chop";
        r.lIIIlllIll[r.lIIlIIIIII[90]] = r."Wear";
        r.lIIIlllIll[r.lIIlIIIIII[125]] = r."Nav to npc";
        r.lIIIlllIll[r.lIIlIIIIII[126]] = r."Turael";
        r.lIIIlllIll[r.lIIlIIIIII[95]] = r."Turael";
        r.lIIIlllIll[r.lIIlIIIIII[128]] = r."Undead twigs";
        r.lIIIlllIll[r.lIIlIIIIII[129]] = r."Undead tree";
        r.lIIIlllIll[r.lIIlIIIIII[130]] = r."Chop";
        r.lIIIlllIll[r.lIIlIIIIII[97]] = r."Undead twigs";
        r.lIIIlllIll[r.lIIlIIIIII[134]] = r."Research notes";
        r.lIIIlllIll[r.lIIlIIIIII[135]] = r."Translate";
        r.lIIIlllIll[r.lIIlIIIIII[138]] = r."A pattern";
        r.lIIIlllIll[r.lIIlIIIIII[139]] = r."A pattern";
        r.lIIIlllIll[r.lIIlIIIIII[140]] = r."Hard leather";
        r.lIIIlllIll[r.lIIlIIIIII[142]] = r."Bookcase";
        r.lIIIlllIll[r.lIIlIIIIII[143]] = r."Search";
        r.lIIIlllIll[r.lIIlIIIIII[144]] = r."Nav to start";
        r.lIIIlllIll[r.lIIlIIIIII[145]] = r."Ava";
        r.lIIIlllIll[r.lIIlIIIIII[99]] = r."Bookcase";
        r.lIIIlllIll[r.lIIlIIIIII[146]] = r."Search";
        r.lIIIlllIll[r.lIIlIIIIII[159]] = r."";
        r.lIIIlllIll[r.lIIlIIIIII[160]] = r."Animal Magnetism";
        r.lIIIlllIll[r.lIIlIIIIII[161]] = r."ring of wealth (";
        r.lIIIlllIll[r.lIIlIIIIII[162]] = r."Drop";
        r.lIIIlllIll[r.lIIlIIIIII[173]] = r."Yes.";
        r.lIIIlllIll[r.lIIlIIIIII[174]] = r."I'm here about a quest.";
        r.lIIIlllIll[r.lIIlIIIIII[175]] = r."Okay, you need it more than I do, I suppose.";
        r.lIIIlllIll[r.lIIlIIIIII[176]] = r."Could I buy those chickens now, then?";
        r.lIIIlllIll[r.lIIlIIIIII[100]] = r."Could I buy 2 chickens?";
        r.lIIIlllIll[r.lIIlIIIIII[177]] = r."I'm here about a quest.";
        r.lIIIlllIll[r.lIIlIIIIII[178]] = r."Hello, I'm here about those trees again.";
        r.lIIIlllIll[r.lIIlIIIIII[179]] = r."I'd love one, thanks.";
        r.lIIIlllIll[r.lIIlIIIIII[180]] = r."";
    }

    private static boolean llllIlIIlllI(Object object) {
        return object != null;
    }

    private static void af() {
        block46: {
            d llIIIlIlIIl;
            block45: {
                block44: {
                    block43: {
                        Object llIIIlIlIlI;
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
                                                                        int[] nArray = new int[lIIlIIIIII[0]];
                                                                        nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[43];
                                                                        if (!r.llllIlIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block31;
                                                                        int[] nArray2 = new int[lIIlIIIIII[0]];
                                                                        nArray2[r.lIIlIIIIII[1]] = lIIlIIIIII[43];
                                                                        if (!r.llllIlIIlIIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block32;
                                                                        int[] nArray3 = new int[lIIlIIIIII[0]];
                                                                        nArray3[r.lIIlIIIIII[1]] = lIIlIIIIII[43];
                                                                        if (!r.llllIlIIlIlI(Bank.getFirst((int[])nArray3).getQuantity(), lIIlIIIIII[4])) break block32;
                                                                    }
                                                                    llIIIlIlIlI = new d(lIIlIIIIII[43], lIIlIIIIII[4], e.c(lIIlIIIIII[147], lIIlIIIIII[148]));
                                                                    bv.add((d)llIIIlIlIlI);
                                                                    0;
                                                                }
                                                                int[] nArray = new int[lIIlIIIIII[0]];
                                                                nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[30];
                                                                if (!r.llllIlIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                                                                int[] nArray4 = new int[lIIlIIIIII[0]];
                                                                nArray4[r.lIIlIIIIII[1]] = lIIlIIIIII[30];
                                                                if (!r.llllIlIIlIIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block34;
                                                                int[] nArray5 = new int[lIIlIIIIII[0]];
                                                                nArray5[r.lIIlIIIIII[1]] = lIIlIIIIII[30];
                                                                if (!r.llllIlIIlIlI(Bank.getFirst((int[])nArray5).getQuantity(), lIIlIIIIII[16])) break block34;
                                                            }
                                                            llIIIlIlIlI = new d(lIIlIIIIII[30], lIIlIIIIII[16], lIIlIIIIII[149]);
                                                            bv.add((d)llIIIlIlIlI);
                                                            0;
                                                        }
                                                        int[] nArray = new int[lIIlIIIIII[0]];
                                                        nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[31];
                                                        if (!r.llllIlIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block35;
                                                        int[] nArray6 = new int[lIIlIIIIII[0]];
                                                        nArray6[r.lIIlIIIIII[1]] = lIIlIIIIII[31];
                                                        if (!r.llllIlIIlIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block36;
                                                        int[] nArray7 = new int[lIIlIIIIII[0]];
                                                        nArray7[r.lIIlIIIIII[1]] = lIIlIIIIII[31];
                                                        if (!r.llllIlIIlIlI(Bank.getFirst((int[])nArray7).getQuantity(), lIIlIIIIII[28])) break block36;
                                                    }
                                                    llIIIlIlIlI = new d(lIIlIIIIII[31], lIIlIIIIII[28], lIIlIIIIII[150]);
                                                    bv.add((d)llIIIlIlIlI);
                                                    0;
                                                }
                                                int[] nArray = new int[lIIlIIIIII[0]];
                                                nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[103];
                                                if (r.llllIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    llIIIlIlIlI = new d(lIIlIIIIII[103], lIIlIIIIII[8], lIIlIIIIII[151]);
                                                    bv.add((d)llIIIlIlIlI);
                                                    0;
                                                }
                                                int[] nArray8 = new int[lIIlIIIIII[0]];
                                                nArray8[r.lIIlIIIIII[1]] = lIIlIIIIII[37];
                                                if (r.llllIlIIlIll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                                    llIIIlIlIlI = new d(lIIlIIIIII[37], lIIlIIIIII[0], lIIlIIIIII[27]);
                                                    bv.add((d)llIIIlIlIlI);
                                                    0;
                                                }
                                                int[] nArray9 = new int[lIIlIIIIII[0]];
                                                nArray9[r.lIIlIIIIII[1]] = lIIlIIIIII[32];
                                                if (!r.llllIlIIlIIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block37;
                                                int[] nArray10 = new int[lIIlIIIIII[0]];
                                                nArray10[r.lIIlIIIIII[1]] = lIIlIIIIII[32];
                                                if (!r.llllIlIIlIIl(Bank.contains((int[])nArray10) ? 1 : 0)) break block38;
                                                int[] nArray11 = new int[lIIlIIIIII[0]];
                                                nArray11[r.lIIlIIIIII[1]] = lIIlIIIIII[32];
                                                if (!r.llllIlIIlIlI(Bank.getFirst((int[])nArray11).getQuantity(), lIIlIIIIII[13])) break block38;
                                            }
                                            llIIIlIlIlI = new d(lIIlIIIIII[32], lIIlIIIIII[13], lIIlIIIIII[27]);
                                            bv.add((d)llIIIlIlIlI);
                                            0;
                                        }
                                        int[] nArray = new int[lIIlIIIIII[0]];
                                        nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[33];
                                        if (!r.llllIlIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block39;
                                        int[] nArray12 = new int[lIIlIIIIII[0]];
                                        nArray12[r.lIIlIIIIII[1]] = lIIlIIIIII[33];
                                        if (!r.llllIlIIlIIl(Bank.contains((int[])nArray12) ? 1 : 0)) break block40;
                                        int[] nArray13 = new int[lIIlIIIIII[0]];
                                        nArray13[r.lIIlIIIIII[1]] = lIIlIIIIII[33];
                                        if (!r.llllIlIIlIlI(Bank.getFirst((int[])nArray13).getQuantity(), lIIlIIIIII[8])) break block40;
                                    }
                                    llIIIlIlIlI = new d(lIIlIIIIII[33], lIIlIIIIII[8], lIIlIIIIII[27]);
                                    bv.add((d)llIIIlIlIlI);
                                    0;
                                }
                                int[] nArray = new int[lIIlIIIIII[0]];
                                nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[29];
                                if (!r.llllIlIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block41;
                                int[] nArray14 = new int[lIIlIIIIII[0]];
                                nArray14[r.lIIlIIIIII[1]] = lIIlIIIIII[29];
                                if (!r.llllIlIIlIIl(Bank.contains((int[])nArray14) ? 1 : 0)) break block42;
                                int[] nArray15 = new int[lIIlIIIIII[0]];
                                nArray15[r.lIIlIIIIII[1]] = lIIlIIIIII[29];
                                if (!r.llllIlIIlIlI(Bank.getFirst((int[])nArray15).getQuantity(), lIIlIIIIII[8])) break block42;
                            }
                            llIIIlIlIlI = new d(lIIlIIIIII[29], lIIlIIIIII[13], lIIlIIIIII[27]);
                            bv.add((d)llIIIlIlIlI);
                            0;
                        }
                        int[] nArray = new int[lIIlIIIIII[0]];
                        nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[39];
                        if (r.llllIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            llIIIlIlIlI = new d(lIIlIIIIII[39], lIIlIIIIII[0], lIIlIIIIII[27]);
                            bv.add((d)llIIIlIlIlI);
                            0;
                        }
                        int[] nArray16 = new int[lIIlIIIIII[0]];
                        nArray16[r.lIIlIIIIII[1]] = lIIlIIIIII[38];
                        if (r.llllIlIIlIll(Bank.contains((int[])nArray16) ? 1 : 0)) {
                            llIIIlIlIlI = new d(lIIlIIIIII[38], lIIlIIIIII[0], lIIlIIIIII[27]);
                            bv.add((d)llIIIlIlIlI);
                            0;
                        }
                        int[] nArray17 = new int[lIIlIIIIII[0]];
                        nArray17[r.lIIlIIIIII[1]] = lIIlIIIIII[40];
                        if (r.llllIlIIlIll(Bank.contains((int[])nArray17) ? 1 : 0)) {
                            llIIIlIlIlI = new d(lIIlIIIIII[40], lIIlIIIIII[0], lIIlIIIIII[152]);
                            bv.add((d)llIIIlIlIlI);
                            0;
                        }
                        int[] nArray18 = new int[lIIlIIIIII[0]];
                        nArray18[r.lIIlIIIIII[1]] = lIIlIIIIII[41];
                        if (r.llllIlIIlIll(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            llIIIlIlIlI = new d(lIIlIIIIII[41], lIIlIIIIII[0], lIIlIIIIII[153] + e.c(lIIlIIIIII[154], lIIlIIIIII[155]));
                            bv.add((d)llIIIlIlIlI);
                            0;
                        }
                        if (r.llllIlIIlIll(Bank.contains((Predicate)(llIIIlIlIlI = item -> item.getName().toLowerCase().contains(lIIIlllIll[lIIlIIIIII[161]]))) ? 1 : 0)) {
                            llIIIlIlIIl = new d(lIIlIIIIII[156], lIIlIIIIII[8], lIIlIIIIII[157]);
                            bv.add(llIIIlIlIIl);
                            0;
                        }
                        int[] nArray19 = new int[lIIlIIIIII[0]];
                        nArray19[r.lIIlIIIIII[1]] = lIIlIIIIII[34];
                        if (!r.llllIlIIlIIl(Bank.contains((int[])nArray19) ? 1 : 0)) break block43;
                        int[] nArray20 = new int[lIIlIIIIII[0]];
                        nArray20[r.lIIlIIIIII[1]] = lIIlIIIIII[34];
                        if (!r.llllIlIIlIIl(Bank.contains((int[])nArray20) ? 1 : 0)) break block44;
                        int[] nArray21 = new int[lIIlIIIIII[0]];
                        nArray21[r.lIIlIIIIII[1]] = lIIlIIIIII[34];
                        if (!r.llllIlIIlIlI(Bank.getFirst((int[])nArray21).getQuantity(), lIIlIIIIII[13])) break block44;
                    }
                    llIIIlIlIIl = new d(lIIlIIIIII[34], lIIlIIIIII[13], i.bq);
                    bv.add(llIIIlIlIIl);
                    0;
                }
                int[] nArray = new int[lIIlIIIIII[0]];
                nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[36];
                if (!r.llllIlIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray22 = new int[lIIlIIIIII[0]];
                nArray22[r.lIIlIIIIII[1]] = lIIlIIIIII[36];
                if (!r.llllIlIIlIIl(Bank.contains((int[])nArray22) ? 1 : 0)) break block46;
                int[] nArray23 = new int[lIIlIIIIII[0]];
                nArray23[r.lIIlIIIIII[1]] = lIIlIIIIII[36];
                if (!r.llllIlIIlIlI(Bank.getFirst((int[])nArray23).getQuantity(), lIIlIIIIII[28])) break block46;
            }
            llIIIlIlIIl = new d(lIIlIIIIII[36], lIIlIIIIII[22], lIIlIIIIII[158]);
            bv.add(llIIIlIlIIl);
            0;
        }
    }

    private static boolean llllIlIlIlII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llllIlIlIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static String llllIIlIIIIl(String llIIIIlIIII, String llIIIIlIIIl) {
        try {
            SecretKeySpec llIIIIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIIIlIlII = Cipher.getInstance("Blowfish");
            llIIIIlIlII.init(lIIlIIIIII[9], llIIIIlIlIl);
            return new String(llIIIIlIlII.doFinal(Base64.getDecoder().decode(llIIIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIIlIIll) {
            llIIIIlIIll.printStackTrace();
            return null;
        }
    }

    private static boolean llllIlIlIIII(int n2) {
        return n2 < 0;
    }

    private static boolean llllIlIlIIll(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public String U() {
        if (r.llllIlIlIlII(ct, lIIIlllIll[lIIlIIIIII[159]])) {
            return lIIIlllIll[lIIlIIIIII[160]];
        }
        return "Animal Magnetism - " + ct;
    }

    public static void aE() {
        block115: {
            WorldPoint llIIIllIIll;
            Object llIIIllIlII;
            block116: {
                block123: {
                    block118: {
                        block122: {
                            block121: {
                                block120: {
                                    block119: {
                                        block117: {
                                            if (r.llllIlIIlIIl(bt ? 1 : 0)) {
                                                b.a(bv);
                                                if (r.llllIlIIlIlI(bv.size(), lIIlIIIIII[0])) {
                                                    System.out.println(lIIIlllIll[lIIlIIIIII[1]]);
                                                    bt = lIIlIIIIII[1];
                                                }
                                            }
                                            if (!r.llllIlIIlIll(bt ? 1 : 0) || !r.llllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[2])) break block115;
                                            if (r.llllIlIIlIlI(e.j(lIIlIIIIII[3]), lIIlIIIIII[4])) {
                                                ct = lIIIlllIll[lIIlIIIIII[0]];
                                                z.bn();
                                            }
                                            if (r.llllIlIIllII(e.j(lIIlIIIIII[3]), lIIlIIIIII[4]) && (!r.llllIlIIllIl(e.j(lIIlIIIIII[5]), lIIlIIIIII[6]) || r.llllIlIIlIlI(e.j(lIIlIIIIII[7]), lIIlIIIIII[8]))) {
                                                ct = lIIIlllIll[lIIlIIIIII[9]];
                                                u.aM();
                                            }
                                            if (r.llllIlIIllII(e.j(lIIlIIIIII[3]), lIIlIIIIII[4]) && r.llllIlIIllIl(e.j(lIIlIIIIII[5]), lIIlIIIIII[6]) && r.llllIlIIllIl(e.j(lIIlIIIIII[7]), lIIlIIIIII[8]) && r.llllIlIIlIlI(e.j(lIIlIIIIII[10]), lIIlIIIIII[11])) {
                                                ct = lIIIlllIll[lIIlIIIIII[11]];
                                                C.bH();
                                            }
                                            if (r.llllIlIIllII(e.j(lIIlIIIIII[3]), lIIlIIIIII[4]) && r.llllIlIIllIl(e.j(lIIlIIIIII[5]), lIIlIIIIII[6]) && r.llllIlIIllIl(e.j(lIIlIIIIII[7]), lIIlIIIIII[8]) && r.llllIlIIllII(e.j(lIIlIIIIII[10]), lIIlIIIIII[11]) && r.llllIlIIlIlI(Skills.getLevel((Skill)Skill.CRAFTING), lIIlIIIIII[12])) {
                                                ct = lIIIlllIll[lIIlIIIIII[13]];
                                                Q.cT();
                                            }
                                            if (r.llllIlIIllII(e.j(lIIlIIIIII[3]), lIIlIIIIII[4]) && r.llllIlIIllIl(e.j(lIIlIIIIII[5]), lIIlIIIIII[6]) && r.llllIlIIllIl(e.j(lIIlIIIIII[7]), lIIlIIIIII[8]) && r.llllIlIIllII(e.j(lIIlIIIIII[10]), lIIlIIIIII[11]) && r.llllIlIIllIl(Skills.getLevel((Skill)Skill.CRAFTING), lIIlIIIIII[12]) && r.llllIlIIlIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIlIIIIII[14])) {
                                                ct = lIIIlllIll[lIIlIIIIII[8]];
                                                T.ds();
                                            }
                                            if (r.llllIlIIllII(e.j(lIIlIIIIII[3]), lIIlIIIIII[4]) && r.llllIlIIllIl(e.j(lIIlIIIIII[5]), lIIlIIIIII[6]) && r.llllIlIIllIl(e.j(lIIlIIIIII[7]), lIIlIIIIII[8]) && r.llllIlIIllII(e.j(lIIlIIIIII[10]), lIIlIIIIII[11]) && r.llllIlIIllIl(Skills.getLevel((Skill)Skill.CRAFTING), lIIlIIIIII[12]) && r.llllIlIIllIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIlIIIIII[14]) && r.llllIlIIlIlI(Skills.getLevel((Skill)Skill.RANGED), lIIlIIIIII[15])) {
                                                ct = lIIIlllIll[lIIlIIIIII[16]];
                                                if (r.llllIlIIlIlI(cs, lIIlIIIIII[0])) {
                                                    n.bU = lIIlIIIIII[1];
                                                    cs += lIIlIIIIII[0];
                                                }
                                                m.ap();
                                            }
                                            if (r.llllIlIIllII(e.j(lIIlIIIIII[3]), lIIlIIIIII[4]) && r.llllIlIIllIl(e.j(lIIlIIIIII[5]), lIIlIIIIII[6]) && r.llllIlIIllIl(e.j(lIIlIIIIII[7]), lIIlIIIIII[8]) && r.llllIlIIllII(e.j(lIIlIIIIII[10]), lIIlIIIIII[11]) && r.llllIlIIllIl(Skills.getLevel((Skill)Skill.CRAFTING), lIIlIIIIII[12]) && r.llllIlIIllIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIlIIIIII[14]) && r.llllIlIIllIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIIIIII[15])) {
                                                if (!r.llllIlIIllIl(e.j(lIIlIIIIII[17]), lIIlIIIIII[18]) || r.llllIlIIlIlI(Skills.getLevel((Skill)Skill.HUNTER), lIIlIIIIII[19])) {
                                                    ct = lIIIlllIll[lIIlIIIIII[20]];
                                                    y.bk();
                                                }
                                                if (r.llllIlIIllIl(e.j(lIIlIIIIII[17]), lIIlIIIIII[18]) && r.llllIlIIllIl(Skills.getLevel((Skill)Skill.HUNTER), lIIlIIIIII[19]) && r.llllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIlIIIIII[6])) {
                                                    ct = lIIIlllIll[lIIlIIIIII[21]];
                                                    w.bf();
                                                }
                                                if (r.llllIlIIllIl(e.j(lIIlIIIIII[17]), lIIlIIIIII[18]) && r.llllIlIIllIl(Skills.getLevel((Skill)Skill.HUNTER), lIIlIIIIII[19]) && r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIlIIIIII[6]) && r.llllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIlIIIIII[22])) {
                                                    ct = lIIIlllIll[lIIlIIIIII[19]];
                                                    q.aC();
                                                }
                                                if (r.llllIlIIllIl(e.j(lIIlIIIIII[17]), lIIlIIIIII[18]) && r.llllIlIIllIl(Skills.getLevel((Skill)Skill.HUNTER), lIIlIIIIII[19]) && r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIlIIIIII[6]) && r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIlIIIIII[22]) && r.llllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIlIIIIII[19])) {
                                                    String[] stringArray = new String[lIIlIIIIII[0]];
                                                    stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[4]];
                                                    if (r.llllIlIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        ct = lIIIlllIll[lIIlIIIIII[23]];
                                                        s.aH();
                                                    }
                                                }
                                                s.aI();
                                            }
                                            if (!r.llllIlIIlIll(r.ab() ? 1 : 0) || !r.llllIlIIlIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId())) || !r.llllIlIIllIl(e.j(lIIlIIIIII[17]), lIIlIIIIII[18]) || !r.llllIlIIllIl(Skills.getLevel((Skill)Skill.HUNTER), lIIlIIIIII[19]) || !r.llllIlIIllIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIIIIII[15]) || !r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIlIIIIII[6]) || !r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIlIIIIII[22]) || !r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIlIIIIII[19])) break block116;
                                            String[] stringArray = new String[lIIlIIIIII[0]];
                                            stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[24]];
                                            if (!r.llllIlIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block116;
                                            ct = lIIIlllIll[lIIlIIIIII[25]];
                                            llIIIllIlII = BankLocation.getNearest();
                                            if (r.llllIlIIlllI(llIIIllIlII) && r.llllIlIIlIll(llIIIllIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderRogues.c = lIIIlllIll[lIIlIIIIII[26]];
                                                a.a((BankLocation)llIIIllIlII);
                                            }
                                            if (!r.llllIlIIlllI(llIIIllIlII) || !r.llllIlIIlIIl(llIIIllIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block116;
                                            if (r.llllIlIIlIll(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIIIII[27]);
                                                0;
                                            }
                                            if (!r.llllIlIIlIIl(Bank.isOpen() ? 1 : 0)) break block116;
                                            AccBuilderRogues.c = lIIIlllIll[lIIlIIIIII[28]];
                                            if (r.llllIlIIllll(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIIlIIIIII[13]);
                                                0;
                                            }
                                            if (r.llllIlIIllll(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIIlIIIIII[9]);
                                                0;
                                            }
                                            int[] nArray = new int[lIIlIIIIII[0]];
                                            nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[29];
                                            if (!r.llllIlIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block117;
                                            int[] nArray2 = new int[lIIlIIIIII[0]];
                                            nArray2[r.lIIlIIIIII[1]] = lIIlIIIIII[29];
                                            if (!r.llllIlIIllIl(Bank.getFirst((int[])nArray2).getQuantity(), lIIlIIIIII[8])) break block118;
                                        }
                                        int[] nArray = new int[lIIlIIIIII[0]];
                                        nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[30];
                                        if (!r.llllIlIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block119;
                                        int[] nArray3 = new int[lIIlIIIIII[0]];
                                        nArray3[r.lIIlIIIIII[1]] = lIIlIIIIII[30];
                                        if (!r.llllIlIIllIl(Bank.getFirst((int[])nArray3).getQuantity(), lIIlIIIIII[16])) break block118;
                                    }
                                    int[] nArray = new int[lIIlIIIIII[0]];
                                    nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[31];
                                    if (!r.llllIlIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block120;
                                    int[] nArray4 = new int[lIIlIIIIII[0]];
                                    nArray4[r.lIIlIIIIII[1]] = lIIlIIIIII[31];
                                    if (!r.llllIlIIllIl(Bank.getFirst((int[])nArray4).getQuantity(), lIIlIIIIII[28])) break block118;
                                }
                                int[] nArray = new int[lIIlIIIIII[0]];
                                nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[32];
                                if (!r.llllIlIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block121;
                                int[] nArray5 = new int[lIIlIIIIII[0]];
                                nArray5[r.lIIlIIIIII[1]] = lIIlIIIIII[32];
                                if (!r.llllIlIIllIl(Bank.getFirst((int[])nArray5).getQuantity(), lIIlIIIIII[13])) break block118;
                            }
                            int[] nArray = new int[lIIlIIIIII[0]];
                            nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[33];
                            if (!r.llllIlIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block122;
                            int[] nArray6 = new int[lIIlIIIIII[0]];
                            nArray6[r.lIIlIIIIII[1]] = lIIlIIIIII[33];
                            if (!r.llllIlIIllIl(Bank.getFirst((int[])nArray6).getQuantity(), lIIlIIIIII[8])) break block118;
                        }
                        int[] nArray = new int[lIIlIIIIII[0]];
                        nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[34];
                        if (!r.llllIlIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block123;
                        int[] nArray7 = new int[lIIlIIIIII[0]];
                        nArray7[r.lIIlIIIIII[1]] = lIIlIIIIII[34];
                        if (!r.llllIlIIlIlI(Bank.getFirst((int[])nArray7).getQuantity(), lIIlIIIIII[13])) break block123;
                    }
                    r.af();
                    System.out.println(lIIIlllIll[lIIlIIIIII[35]]);
                    bt = lIIlIIIIII[0];
                    return;
                }
                int[] nArray = new int[lIIlIIIIII[23]];
                nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[36];
                nArray[r.lIIlIIIIII[0]] = lIIlIIIIII[37];
                nArray[r.lIIlIIIIII[9]] = lIIlIIIIII[33];
                nArray[r.lIIlIIIIII[11]] = lIIlIIIIII[38];
                nArray[r.lIIlIIIIII[13]] = lIIlIIIIII[32];
                nArray[r.lIIlIIIIII[8]] = lIIlIIIIII[34];
                nArray[r.lIIlIIIIII[16]] = lIIlIIIIII[39];
                nArray[r.lIIlIIIIII[20]] = lIIlIIIIII[40];
                nArray[r.lIIlIIIIII[21]] = lIIlIIIIII[41];
                nArray[r.lIIlIIIIII[19]] = lIIlIIIIII[30];
                nArray[r.lIIlIIIIII[4]] = lIIlIIIIII[31];
                if (r.llllIlIIlIll(e.b(nArray) ? 1 : 0)) {
                    r.af();
                    System.out.println(lIIIlllIll[lIIlIIIIII[42]]);
                    bt = lIIlIIIIII[0];
                    return;
                }
                int[] nArray8 = new int[lIIlIIIIII[23]];
                nArray8[r.lIIlIIIIII[1]] = lIIlIIIIII[36];
                nArray8[r.lIIlIIIIII[0]] = lIIlIIIIII[37];
                nArray8[r.lIIlIIIIII[9]] = lIIlIIIIII[33];
                nArray8[r.lIIlIIIIII[11]] = lIIlIIIIII[38];
                nArray8[r.lIIlIIIIII[13]] = lIIlIIIIII[32];
                nArray8[r.lIIlIIIIII[8]] = lIIlIIIIII[34];
                nArray8[r.lIIlIIIIII[16]] = lIIlIIIIII[39];
                nArray8[r.lIIlIIIIII[20]] = lIIlIIIIII[40];
                nArray8[r.lIIlIIIIII[21]] = lIIlIIIIII[41];
                nArray8[r.lIIlIIIIII[19]] = lIIlIIIIII[30];
                nArray8[r.lIIlIIIIII[4]] = lIIlIIIIII[31];
                if (r.llllIlIIlIIl(e.b(nArray8) ? 1 : 0)) {
                    a.a(lIIlIIIIII[34], lIIlIIIIII[13]);
                    a.a(lIIlIIIIII[37], lIIlIIIIII[0]);
                    a.a(lIIlIIIIII[43], lIIlIIIIII[0]);
                    a.a(lIIlIIIIII[32], lIIlIIIIII[13]);
                    a.a(lIIlIIIIII[29], lIIlIIIIII[13]);
                    a.a(lIIlIIIIII[40], lIIlIIIIII[0]);
                    a.a(lIIlIIIIII[41], lIIlIIIIII[0]);
                    a.a(lIIlIIIIII[36], lIIlIIIIII[4]);
                    a.a(lIIlIIIIII[30], lIIlIIIIII[4]);
                    a.a(lIIlIIIIII[31], lIIlIIIIII[28]);
                    a.a(lIIlIIIIII[44], lIIlIIIIII[0]);
                    a.a(lIIlIIIIII[45], lIIlIIIIII[27]);
                }
            }
            if (r.llllIlIIlIIl(Inventory.contains((int[])f.aV) ? 1 : 0) && r.llllIlIIlIlI(Movement.getRunEnergy(), lIIlIIIIII[15])) {
                Inventory.getFirst((int[])f.aV).interact(lIIIlllIll[lIIlIIIIII[46]]);
                Time.sleepTicks((int)lIIlIIIIII[0]);
                0;
            }
            if (r.llllIlIIlIIl(Inventory.contains((int[])f.aS) ? 1 : 0) && r.llllIlIIlIlI(Prayers.getPoints(), lIIlIIIIII[47])) {
                Inventory.getFirst((int[])f.aS).interact(lIIIlllIll[lIIlIIIIII[12]]);
            }
            if (r.llllIlIlIIII(r.llllIlIIlIII(e.u(), 60.0))) {
                String[] stringArray = new String[lIIlIIIIII[0]];
                stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[48]];
                if (r.llllIlIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIlIIIIII[0]];
                    stringArray2[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[49]];
                    Inventory.getFirst((String[])stringArray2).interact(lIIIlllIll[lIIlIIIIII[50]]);
                    Time.sleepTicks((int)lIIlIIIIII[9]);
                    0;
                }
            }
            if (r.llllIlIIlIIl(r.ab() ? 1 : 0) && r.llllIlIIlIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()))) {
                if (r.llllIlIIlIll(cn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && r.llllIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(cg), lIIlIIIIII[21])) {
                    AccBuilderRogues.c = lIIIlllIll[lIIlIIIIII[51]];
                    if (r.llllIlIIlIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)cg);
                    0;
                    Time.sleepTicks((int)lIIlIIIIII[0]);
                    0;
                }
                if (r.llllIlIIlIIl(cn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && r.llllIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo(cg), lIIlIIIIII[21])) {
                    ck = lIIlIIIIII[1];
                    g.a(lIIIlllIll[lIIlIIIIII[47]], bR);
                }
                if (r.llllIlIIlIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIII[52], lIIlIIIIII[53], lIIlIIIIII[1])) ? 1 : 0)) {
                    String[] stringArray = new String[lIIlIIIIII[0]];
                    stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[54]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlllIll[lIIlIIIIII[55]]);
                    Time.sleepTicks((int)lIIlIIIIII[9]);
                    0;
                }
                if (r.llllIlIIlIIl((llIIIllIlII = new WorldArea(lIIlIIIIII[52], lIIlIIIIII[56], lIIlIIIIII[16], lIIlIIIIII[4], lIIlIIIIII[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIlIIIIII[0]];
                    stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[57]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlllIll[lIIlIIIIII[58]]);
                    Time.sleepTicks((int)lIIlIIIIII[9]);
                    0;
                }
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[4])) {
                int[] nArray = new int[lIIlIIIIII[0]];
                nArray[r.lIIlIIIIII[1]] = lIIlIIIIII[44];
                if (r.llllIlIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray9 = new int[lIIlIIIIII[0]];
                    nArray9[r.lIIlIIIIII[1]] = lIIlIIIIII[44];
                    Inventory.getFirst((int[])nArray9).interact(lIIIlllIll[lIIlIIIIII[59]]);
                }
                int[] nArray10 = new int[lIIlIIIIII[0]];
                nArray10[r.lIIlIIIIII[1]] = lIIlIIIIII[60];
                if (r.llllIlIIlIll(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                    block114: {
                        llIIIllIlII = new WorldPoint(lIIlIIIIII[61], lIIlIIIIII[62], lIIlIIIIII[1]);
                        int[] nArray11 = new int[lIIlIIIIII[0]];
                        nArray11[r.lIIlIIIIII[1]] = lIIlIIIIII[63];
                        if (r.llllIlIIlIll(Inventory.contains((int[])nArray11) ? 1 : 0) && r.llllIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIIIllIlII), lIIlIIIIII[48])) {
                            if (r.llllIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(cq), lIIlIIIIII[8])) {
                                AccBuilderRogues.c = lIIIlllIll[lIIlIIIIII[64]];
                                Movement.walkTo((WorldPoint)cq);
                                0;
                                Time.sleepTicks((int)lIIlIIIIII[0]);
                                0;
                            }
                            if (r.llllIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo(cq), lIIlIIIIII[8])) {
                                if (r.llllIlIIlIll(Shop.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIIlIIIIII[0]];
                                    stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[65]];
                                    NPCs.getNearest((String[])stringArray).interact(lIIIlllIll[lIIlIIIIII[10]]);
                                    Time.sleepTicks((int)lIIlIIIIII[9]);
                                    0;
                                }
                                if (r.llllIlIIlIIl(Shop.isOpen() ? 1 : 0)) {
                                    Shop.buyFive((int)lIIlIIIIII[63]);
                                    Time.sleepTicks((int)lIIlIIIIII[11]);
                                    0;
                                }
                            }
                        }
                        int[] nArray12 = new int[lIIlIIIIII[0]];
                        nArray12[r.lIIlIIIIII[1]] = lIIlIIIIII[63];
                        if (r.llllIlIIlIIl(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                            if (r.llllIlIIlIll(co.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && r.llllIlIIlIll(cp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                int[] nArray13 = new int[lIIlIIIIII[0]];
                                nArray13[r.lIIlIIIIII[1]] = lIIlIIIIII[31];
                                if (r.llllIlIIlIIl(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                    int[] nArray14 = new int[lIIlIIIIII[0]];
                                    nArray14[r.lIIlIIIIII[1]] = lIIlIIIIII[31];
                                    Inventory.getFirst((int[])nArray14).interact(lIIIlllIll[lIIlIIIIII[66]]);
                                    Time.sleepTicks((int)lIIlIIIIII[20]);
                                    0;
                                }
                            }
                            if (!r.llllIlIIlIll(co.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || r.llllIlIIlIIl(cp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                llIIIllIIll = new WorldPoint(lIIlIIIIII[61], lIIlIIIIII[62], lIIlIIIIII[1]);
                                if (r.llllIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(llIIIllIIll), lIIlIIIIII[8]) && r.llllIlIIlIll(Players.getLocal().getWorldLocation().getPlane())) {
                                    AccBuilderRogues.c = lIIIlllIll[lIIlIIIIII[67]];
                                    Movement.walkTo((WorldPoint)llIIIllIIll);
                                    0;
                                    Time.sleepTicks((int)lIIlIIIIII[0]);
                                    0;
                                }
                                String[] stringArray = new String[lIIlIIIIII[0]];
                                stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[14]];
                                if (r.llllIlIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                    if (r.llllIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo(llIIIllIIll), lIIlIIIIII[8]) && r.llllIlIIlIll(Players.getLocal().getWorldLocation().getPlane())) {
                                        String[] stringArray3 = new String[lIIlIIIIII[0]];
                                        stringArray3[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[68]];
                                        TileObjects.getNearest((String[])stringArray3).interact(lIIIlllIll[lIIlIIIIII[69]]);
                                        Time.sleepTicks((int)lIIlIIIIII[13]);
                                        0;
                                    }
                                    String[] stringArray4 = new String[lIIlIIIIII[0]];
                                    stringArray4[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[70]];
                                    if (r.llllIlIIlllI(TileObjects.getNearest((String[])stringArray4))) {
                                        String[] stringArray5 = new String[lIIlIIIIII[0]];
                                        stringArray5[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[71]];
                                        if (r.llllIlIIlIIl(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                                            String[] stringArray6 = new String[lIIlIIIIII[0]];
                                            stringArray6[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[22]];
                                            String[] stringArray7 = new String[lIIlIIIIII[0]];
                                            stringArray7[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[72]];
                                            Inventory.getFirst((String[])stringArray6).useOn(TileObjects.getNearest((String[])stringArray7));
                                            Time.sleep((long)e.c(lIIlIIIIII[73], lIIlIIIIII[74]));
                                            0;
                                        }
                                    }
                                }
                                String[] stringArray8 = new String[lIIlIIIIII[0]];
                                stringArray8[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[75]];
                                if (r.llllIlIIlIll(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                                    if (r.llllIlIIllII(Players.getLocal().getWorldLocation().getPlane(), lIIlIIIIII[0])) {
                                        String[] stringArray9 = new String[lIIlIIIIII[0]];
                                        stringArray9[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[76]];
                                        TileObjects.getNearest((String[])stringArray9).interact(lIIIlllIll[lIIlIIIIII[77]]);
                                        Time.sleepTicks((int)lIIlIIIIII[8]);
                                        0;
                                    }
                                    if (r.llllIlIIlIll(Players.getLocal().getWorldLocation().getPlane())) {
                                        do {
                                            String[] stringArray10 = new String[lIIlIIIIII[0]];
                                            stringArray10[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[78]];
                                            if (!r.llllIlIIlIIl(Inventory.contains((String[])stringArray10) ? 1 : 0)) break block114;
                                            String[] stringArray11 = new String[lIIlIIIIII[0]];
                                            stringArray11[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[79]];
                                            TileObjects.getNearest((String[])stringArray11).interact(lIIIlllIll[lIIlIIIIII[80]]);
                                            Time.sleepTicks((int)lIIlIIIIII[9]);
                                            0;
                                            0;
                                        } while (1 <= 3);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    int[] nArray15 = new int[lIIlIIIIII[0]];
                    nArray15[r.lIIlIIIIII[1]] = lIIlIIIIII[32];
                    if (r.llllIlIIlIll(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                        String[] stringArray = new String[lIIlIIIIII[0]];
                        stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[81]];
                        if (r.llllIlIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0) && r.llllIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIIIllIlII), lIIlIIIIII[48])) {
                            if (r.llllIlIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                g.a(lIIIlllIll[lIIlIIIIII[82]], bR);
                                Time.sleepTicks((int)lIIlIIIIII[0]);
                                0;
                            }
                            g.a(bR);
                        }
                    }
                }
                int[] nArray16 = new int[lIIlIIIIII[0]];
                nArray16[r.lIIlIIIIII[1]] = lIIlIIIIII[60];
                if (r.llllIlIIlIIl(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIlIIIIII[9]];
                    nArray17[r.lIIlIIIIII[1]] = lIIlIIIIII[83];
                    nArray17[r.lIIlIIIIII[0]] = lIIlIIIIII[29];
                    if (r.llllIlIIlIIl(Inventory.contains((int[])nArray17) ? 1 : 0)) {
                        int[] nArray18 = new int[lIIlIIIIII[9]];
                        nArray18[r.lIIlIIIIII[1]] = lIIlIIIIII[83];
                        nArray18[r.lIIlIIIIII[0]] = lIIlIIIIII[29];
                        Inventory.getAll((int[])nArray18).stream().forEach(item -> item.interact(lIIIlllIll[lIIlIIIIII[162]]));
                    }
                    if (r.llllIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(cr), lIIlIIIIII[20])) {
                        Movement.walkTo((WorldPoint)cr);
                        0;
                        Time.sleepTicks((int)lIIlIIIIII[0]);
                        0;
                    }
                    if (r.llllIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo(cr), lIIlIIIIII[20])) {
                        g.a(lIIIlllIll[lIIlIIIIII[15]], bR);
                    }
                }
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[48])) {
                g.a(lIIIlllIll[lIIlIIIIII[84]], bR);
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[64])) {
                g.a(lIIIlllIll[lIIlIIIIII[85]], bR);
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[22])) {
                g.a(lIIIlllIll[lIIlIIIIII[86]], bR);
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[15])) {
                g.a(lIIIlllIll[lIIlIIIIII[87]], bR);
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[6])) {
                g.a(lIIIlllIll[lIIlIIIIII[88]], bR);
            }
            if (!r.llllIlIlIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[89]) || r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[90])) {
                llIIIllIlII = new WorldPoint(lIIlIIIIII[91], lIIlIIIIII[92], lIIlIIIIII[1]);
                if (r.llllIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIIIllIlII), lIIlIIIIII[11])) {
                    AccBuilderRogues.c = lIIIlllIll[lIIlIIIIII[93]];
                    Movement.walkTo((WorldPoint)llIIIllIlII);
                    0;
                    Time.sleepTicks((int)lIIlIIIIII[0]);
                    0;
                }
                if (r.llllIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIIIllIlII), lIIlIIIIII[11])) {
                    g.a(lIIIlllIll[lIIlIIIIII[94]], bR);
                }
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[95])) {
                if (r.llllIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(cr), lIIlIIIIII[20])) {
                    Movement.walkTo((WorldPoint)cr);
                    0;
                    Time.sleepTicks((int)lIIlIIIIII[0]);
                    0;
                }
                if (r.llllIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo(cr), lIIlIIIIII[20])) {
                    g.a(lIIIlllIll[lIIlIIIIII[96]], bR);
                }
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[97])) {
                g.a(lIIIlllIll[lIIlIIIIII[98]], bR);
            }
            if (!r.llllIlIlIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[99]) || r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[100])) {
                g.a(lIIIlllIll[lIIlIIIIII[6]], bR);
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[100])) {
                String[] stringArray = new String[lIIlIIIIII[0]];
                stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[101]];
                if (r.llllIlIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray12 = new String[lIIlIIIIII[0]];
                    stringArray12[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[102]];
                    if (r.llllIlIIlIll(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                        llIIIllIlII = new HashMap();
                        ((HashMap)llIIIllIlII).put(lIIlIIIIII[33], lIIlIIIIII[8]);
                        0;
                        ((HashMap)llIIIllIlII).put(lIIlIIIIII[38], lIIlIIIIII[0]);
                        0;
                        ((HashMap)llIIIllIlII).put(lIIlIIIIII[39], lIIlIIIIII[0]);
                        0;
                        ((HashMap)llIIIllIlII).put(lIIlIIIIII[103], lIIlIIIIII[0]);
                        0;
                        e.a((HashMap<Integer, Integer>)llIIIllIlII, lIIlIIIIII[1], lIIlIIIIII[1]);
                    }
                    String[] stringArray13 = new String[lIIlIIIIII[0]];
                    stringArray13[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[104]];
                    if (r.llllIlIIlIIl(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        r.aF();
                    }
                }
            }
            if (!r.llllIlIlIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[105]) || r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[106])) {
                String[] stringArray = new String[lIIlIIIIII[0]];
                stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[107]];
                llIIIllIlII = NPCs.getNearest((String[])stringArray);
                if (r.llllIlIIlllI(llIIIllIlII)) {
                    if (r.llllIlIIlIIl(Reachable.isInteractable((Locatable)llIIIllIlII) ? 1 : 0)) {
                        g.a(lIIIlllIll[lIIlIIIIII[3]], bR);
                    }
                    if (r.llllIlIIlIll(Reachable.isInteractable((Locatable)llIIIllIlII) ? 1 : 0)) {
                        Movement.walkTo((Locatable)llIIIllIlII);
                        0;
                        Time.sleepTicks((int)lIIlIIIIII[0]);
                        0;
                    }
                }
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[108])) {
                String[] stringArray = new String[lIIlIIIIII[0]];
                stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[109]];
                if (r.llllIlIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    llIIIllIlII = new WorldPoint(lIIlIIIIII[110], lIIlIIIIII[111], lIIlIIIIII[1]);
                    llIIIllIIll = new WorldPoint(lIIlIIIIII[110], lIIlIIIIII[112], lIIlIIIIII[1]);
                    if (r.llllIlIIlIll(Players.getLocal().getWorldLocation().equals(llIIIllIlII) ? 1 : 0) && r.llllIlIIlIll(Players.getLocal().getWorldLocation().equals((Object)llIIIllIIll) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIIlllIll[lIIlIIIIII[113]];
                        Movement.walkTo((WorldPoint)llIIIllIlII);
                        0;
                        Time.sleepTicks((int)lIIlIIIIII[0]);
                        0;
                    }
                    if (r.llllIlIIlIIl(Players.getLocal().getWorldLocation().equals(llIIIllIlII) ? 1 : 0) && r.llllIlIIlIll(Players.getLocal().getWorldLocation().equals((Object)llIIIllIIll) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIllIIll);
                        0;
                    }
                    if (r.llllIlIIlIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIllIIll) ? 1 : 0)) {
                        String[] stringArray14 = new String[lIIlIIIIII[0]];
                        stringArray14[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[114]];
                        String[] stringArray15 = new String[lIIlIIIIII[0]];
                        stringArray15[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[115]];
                        Inventory.getFirst((String[])stringArray14).useOn(Inventory.getFirst((String[])stringArray15));
                        Time.sleepTicks((int)lIIlIIIIII[11]);
                        0;
                    }
                }
                String[] stringArray16 = new String[lIIlIIIIII[0]];
                stringArray16[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[89]];
                if (r.llllIlIIlIIl(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                    r.aF();
                }
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[116])) {
                llIIIllIlII = new WorldPoint(lIIlIIIIII[117], lIIlIIIIII[118], lIIlIIIIII[1]);
                if (r.llllIlIIlIll(Players.getLocal().getWorldLocation().equals(llIIIllIlII) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)llIIIllIlII);
                    0;
                    Time.sleepTicks((int)lIIlIIIIII[0]);
                    0;
                }
                if (r.llllIlIIlIIl(Players.getLocal().getWorldLocation().equals(llIIIllIlII) ? 1 : 0)) {
                    String[] stringArray = new String[lIIlIIIIII[0]];
                    stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[119]];
                    NPCs.getNearest((String[])stringArray).interact(lIIIlllIll[lIIlIIIIII[120]]);
                    Time.sleepTicks((int)lIIlIIIIII[0]);
                    0;
                }
            }
            if (!r.llllIlIlIIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[121]) || r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[122])) {
                llIIIllIlII = new WorldPoint(lIIlIIIIII[123], lIIlIIIIII[124], lIIlIIIIII[1]);
                if (r.llllIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIIIllIlII), lIIlIIIIII[9])) {
                    if (r.llllIlIIlIIl(Inventory.contains((int[])f.aO) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.aO).interact(lIIIlllIll[lIIlIIIIII[90]]);
                    }
                    AccBuilderRogues.c = lIIIlllIll[lIIlIIIIII[125]];
                    Movement.walkTo((WorldPoint)llIIIllIlII);
                    0;
                    Time.sleepTicks((int)lIIlIIIIII[0]);
                    0;
                }
                if (r.llllIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIIIllIlII), lIIlIIIIII[9])) {
                    String[] stringArray = new String[lIIlIIIIII[0]];
                    stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[126]];
                    llIIIllIIll = NPCs.getNearest((String[])stringArray);
                    if (r.llllIlIIlllI(llIIIllIIll)) {
                        if (r.llllIlIIlIIl(Reachable.isInteractable((Locatable)llIIIllIIll) ? 1 : 0)) {
                            g.a(lIIIlllIll[lIIlIIIIII[95]], bR);
                        }
                        if (r.llllIlIIlIll(Reachable.isInteractable((Locatable)llIIIllIIll) ? 1 : 0)) {
                            Movement.walkTo((Locatable)llIIIllIIll);
                            0;
                            Time.sleepTicks((int)lIIlIIIIII[0]);
                            0;
                        }
                    }
                }
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[127])) {
                String[] stringArray = new String[lIIlIIIIII[0]];
                stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[128]];
                if (r.llllIlIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    llIIIllIlII = new WorldPoint(lIIlIIIIII[117], lIIlIIIIII[118], lIIlIIIIII[1]);
                    if (r.llllIlIIlIll(Players.getLocal().getWorldLocation().equals(llIIIllIlII) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIllIlII);
                        0;
                        Time.sleepTicks((int)lIIlIIIIII[0]);
                        0;
                    }
                    if (r.llllIlIIlIIl(Players.getLocal().getWorldLocation().equals(llIIIllIlII) ? 1 : 0)) {
                        String[] stringArray17 = new String[lIIlIIIIII[0]];
                        stringArray17[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[129]];
                        NPCs.getNearest((String[])stringArray17).interact(lIIIlllIll[lIIlIIIIII[130]]);
                        Time.sleepTicks((int)lIIlIIIIII[0]);
                        0;
                    }
                }
                String[] stringArray18 = new String[lIIlIIIIII[0]];
                stringArray18[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[97]];
                if (r.llllIlIIlIIl(Inventory.contains((String[])stringArray18) ? 1 : 0)) {
                    r.aF();
                }
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[131])) {
                r.aF();
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[132])) {
                if (r.llllIlIIlIIl(Widgets.get((int)lIIlIIIIII[133]).isEmpty() ? 1 : 0)) {
                    String[] stringArray = new String[lIIlIIIIII[0]];
                    stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[134]];
                    Inventory.getFirst((String[])stringArray).interact(lIIIlllIll[lIIlIIIIII[135]]);
                    Time.sleepTicks((int)lIIlIIIIII[13]);
                    0;
                }
                if (r.llllIlIIlIll(Widgets.get((int)lIIlIIIIII[133]).isEmpty() ? 1 : 0)) {
                    Mouse.click((int)Widgets.get((int)lIIlIIIIII[133], (int)lIIlIIIIII[55]).getClickPoint().getX(), (int)Widgets.get((int)lIIlIIIIII[133], (int)lIIlIIIIII[55]).getClickPoint().getY(), (boolean)lIIlIIIIII[0]);
                    Time.sleepTicks((int)lIIlIIIIII[9]);
                    0;
                    Mouse.click((int)Widgets.get((int)lIIlIIIIII[133], (int)lIIlIIIIII[65]).getClickPoint().getX(), (int)Widgets.get((int)lIIlIIIIII[133], (int)lIIlIIIIII[65]).getClickPoint().getY(), (boolean)lIIlIIIIII[0]);
                    Time.sleepTicks((int)lIIlIIIIII[9]);
                    0;
                    Mouse.click((int)Widgets.get((int)lIIlIIIIII[133], (int)lIIlIIIIII[67]).getClickPoint().getX(), (int)Widgets.get((int)lIIlIIIIII[133], (int)lIIlIIIIII[67]).getClickPoint().getY(), (boolean)lIIlIIIIII[0]);
                    Time.sleepTicks((int)lIIlIIIIII[9]);
                    0;
                    Mouse.click((int)Widgets.get((int)lIIlIIIIII[133], (int)lIIlIIIIII[22]).getClickPoint().getX(), (int)Widgets.get((int)lIIlIIIIII[133], (int)lIIlIIIIII[22]).getClickPoint().getY(), (boolean)lIIlIIIIII[0]);
                    Time.sleepTicks((int)lIIlIIIIII[9]);
                    0;
                    Mouse.click((int)Widgets.get((int)lIIlIIIIII[133], (int)lIIlIIIIII[76]).getClickPoint().getX(), (int)Widgets.get((int)lIIlIIIIII[133], (int)lIIlIIIIII[76]).getClickPoint().getY(), (boolean)lIIlIIIIII[0]);
                    Time.sleepTicks((int)lIIlIIIIII[9]);
                    0;
                    Mouse.click((int)Widgets.get((int)lIIlIIIIII[133], (int)lIIlIIIIII[79]).getClickPoint().getX(), (int)Widgets.get((int)lIIlIIIIII[133], (int)lIIlIIIIII[79]).getClickPoint().getY(), (boolean)lIIlIIIIII[0]);
                    Time.sleepTicks((int)lIIlIIIIII[8]);
                    0;
                }
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[136])) {
                r.aF();
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[137])) {
                String[] stringArray = new String[lIIlIIIIII[0]];
                stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[138]];
                if (r.llllIlIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray19 = new String[lIIlIIIIII[0]];
                    stringArray19[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[139]];
                    String[] stringArray20 = new String[lIIlIIIIII[0]];
                    stringArray20[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[140]];
                    Inventory.getFirst((String[])stringArray19).useOn(Inventory.getFirst((String[])stringArray20));
                    Time.sleepTicks((int)lIIlIIIIII[9]);
                    0;
                }
            }
            if (r.llllIlIIllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[141])) {
                if (r.llllIlIIlIlI(ck, lIIlIIIIII[0])) {
                    U.lP += lIIlIIIIII[0];
                    U.o(AccBuilderRogues.m);
                    ck += lIIlIIIIII[0];
                    U.lP = lIIlIIIIII[1];
                    cl = lIIlIIIIII[1];
                }
                r.aF();
            }
            g.a(bR);
        }
    }

    private static boolean llllIlIIllII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllIlIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllIlIIllll(int n2) {
        return n2 > 0;
    }

    @Override
    public int T() {
        try {
            r.aE();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIIlIIIIII[100];
    }

    static {
        r.llllIlIIIlll();
        r.llllIIllIlII();
        bv = new ArrayList<d>();
        cn = new WorldArea(lIIlIIIIII[163], lIIlIIIIII[56], lIIlIIIIII[16], lIIlIIIIII[4], lIIlIIIIII[1]);
        co = new WorldArea(lIIlIIIIII[164], lIIlIIIIII[165], lIIlIIIIII[166], lIIlIIIIII[142], lIIlIIIIII[1]);
        cp = new WorldArea(lIIlIIIIII[164], lIIlIIIIII[165], lIIlIIIIII[166], lIIlIIIIII[142], lIIlIIIIII[0]);
        cg = new WorldPoint(lIIlIIIIII[167], lIIlIIIIII[168], lIIlIIIIII[1]);
        cq = new WorldPoint(lIIlIIIIII[169], lIIlIIIIII[170], lIIlIIIIII[1]);
        cr = new WorldPoint(lIIlIIIIII[171], lIIlIIIIII[172], lIIlIIIIII[1]);
        String[] stringArray = new String[lIIlIIIIII[21]];
        stringArray[r.lIIlIIIIII[1]] = lIIIlllIll[lIIlIIIIII[173]];
        stringArray[r.lIIlIIIIII[0]] = lIIIlllIll[lIIlIIIIII[174]];
        stringArray[r.lIIlIIIIII[9]] = lIIIlllIll[lIIlIIIIII[175]];
        stringArray[r.lIIlIIIIII[11]] = lIIIlllIll[lIIlIIIIII[176]];
        stringArray[r.lIIlIIIIII[13]] = lIIIlllIll[lIIlIIIIII[100]];
        stringArray[r.lIIlIIIIII[8]] = lIIIlllIll[lIIlIIIIII[177]];
        stringArray[r.lIIlIIIIII[16]] = lIIIlllIll[lIIlIIIIII[178]];
        stringArray[r.lIIlIIIIII[20]] = lIIIlllIll[lIIlIIIIII[179]];
        bR = stringArray;
        cs = lIIlIIIIII[1];
        ct = lIIIlllIll[lIIlIIIIII[180]];
    }

    private static int llllIlIIlIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public boolean V() {
        boolean bl;
        if (r.llllIlIIllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIIIIII[2])) {
            bl = lIIlIIIIII[0];
            0;
            if (((0x57 ^ 0x65 ^ (0x63 ^ 0x5D)) & (0x19 ^ 0x2A ^ (0x70 ^ 0x4F) ^ -1)) != 0) {
                return (2 & (2 ^ -1)) != 0;
            }
        } else {
            bl = lIIlIIIIII[1];
        }
        return bl;
    }

    private static String llllIIlIIIII(String llIIIIlllIl, String llIIIIlllII) {
        try {
            SecretKeySpec llIIIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIlllII.getBytes(StandardCharsets.UTF_8)), lIIlIIIIII[21]), "DES");
            Cipher llIIIlIIIIl = Cipher.getInstance("DES");
            llIIIlIIIIl.init(lIIlIIIIII[9], llIIIlIIIlI);
            return new String(llIIIlIIIIl.doFinal(Base64.getDecoder().decode(llIIIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIlIIIII) {
            llIIIlIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean llllIlIIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean S() {
        return lIIlIIIIII[1];
    }

    private static boolean llllIlIIlIll(int n2) {
        return n2 == 0;
    }

    private static String llllIIlIIIlI(String lIlllllllIl, String lIlllllllII) {
        lIlllllllIl = new String(Base64.getDecoder().decode(lIlllllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIIIIIIII = new StringBuilder();
        char[] lIlllllllll = lIlllllllII.toCharArray();
        int lIllllllllI = lIIlIIIIII[1];
        char[] lIllllllIII = lIlllllllIl.toCharArray();
        int lIlllllIlll = lIllllllIII.length;
        int lIlllllIllI = lIIlIIIIII[1];
        while (r.llllIlIIlIlI(lIlllllIllI, lIlllllIlll)) {
            char llIIIIIIIll = lIllllllIII[lIlllllIllI];
            llIIIIIIIII.append((char)(llIIIIIIIll ^ lIlllllllll[lIllllllllI % lIlllllllll.length]));
            0;
            ++lIllllllllI;
            ++lIlllllIllI;
            0;
            if (-(0xB6 ^ 0xB2) <= 0) continue;
            return null;
        }
        return String.valueOf(llIIIIIIIII);
    }
}

