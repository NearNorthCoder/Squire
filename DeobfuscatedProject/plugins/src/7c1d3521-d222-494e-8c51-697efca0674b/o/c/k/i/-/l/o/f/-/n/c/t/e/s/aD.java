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

public class aD
implements ac {
    static final /* synthetic */ WorldPoint pi;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int[] llIIlIllII;
    public static final /* synthetic */ WorldPoint pe;
    private static /* synthetic */ String[] llIIlIlIll;
    public static final /* synthetic */ WorldPoint pd;
    public static /* synthetic */ List<d> bv;
    private final /* synthetic */ int pk = 536;
    public static final /* synthetic */ WorldPoint pg;
    public static final /* synthetic */ WorldPoint pf;
    static final /* synthetic */ WorldPoint ph;
    static final /* synthetic */ WorldPoint pj;

    private static void lIlIlIlIllIll() {
        llIIlIllII = new int[88];
        aD.llIIlIllII[0] = -(0xFFFFEFA7 & 0x1D7F) & (0xFFFFEF3F & 0x1FFE);
        aD.llIIlIllII[1] = (0x21 ^ 0x1E) & ~(0x9B ^ 0xA4);
        aD.llIIlIllII[2] = " ".length();
        aD.llIIlIllII[3] = "  ".length();
        aD.llIIlIllII[4] = "   ".length();
        aD.llIIlIllII[5] = 0xFFFFF3AC & 0x1FDB;
        aD.llIIlIllII[6] = 0xC3 ^ 0xC7;
        aD.llIIlIllII[7] = -(0xFFFFBFDA & 0x4877) & (0xFFFFFBFF & 0x5EFF);
        aD.llIIlIllII[8] = -(0xFFFFDFFF & 0x6E03) & (0xFFFFFFFF & 0x7F53);
        aD.llIIlIllII[9] = -(0xFFFFFB83 & 0x747D) & (0xFFFFFFFB & 0x73E7);
        aD.llIIlIllII[10] = -(0xFFFFF414 & 0x4BFF) & (0xFFFFE9BF & 0x7F57);
        aD.llIIlIllII[11] = 22 + 171 - 183 + 190;
        aD.llIIlIllII[12] = 0xBF ^ 0xB0 ^ (0x5A ^ 0x67);
        aD.llIIlIllII[13] = 0xA2 ^ 0x91 ^ (0x49 ^ 0x7F);
        aD.llIIlIllII[14] = 70 + 12 - 43 + 104 ^ 94 + 77 - 50 + 34;
        aD.llIIlIllII[15] = 0x24 ^ 0x22;
        aD.llIIlIllII[16] = -" ".length();
        aD.llIIlIllII[17] = 82 + 145 - 143 + 69 ^ 63 + 141 - 92 + 46;
        aD.llIIlIllII[18] = 6 ^ 0xD ^ "   ".length();
        aD.llIIlIllII[19] = 0x1B ^ 0x12;
        aD.llIIlIllII[20] = 0x2A ^ 0x27;
        aD.llIIlIllII[21] = 0x39 ^ 0x33;
        aD.llIIlIllII[22] = 0xFFFFABF7 & 0x5FDC;
        aD.llIIlIllII[23] = -(0xFFFFF0BF & 0x5FF1) & (0xFFFFDFBB & 0x7FF6);
        aD.llIIlIllII[24] = -(0xFFFFD81B & 0x37EE) & (0xFFFFFFFF & 0x1BDB);
        aD.llIIlIllII[25] = -(0xFFFFD7E1 & 0x391F) & (0xFFFFFFFF & 0x1FFB);
        aD.llIIlIllII[26] = -(0xFFFFEF77 & 0x70BD) & (0xFFFFEBFF & Short.MAX_VALUE);
        aD.llIIlIllII[27] = 0xFFFF9EF8 & 0x6FFF;
        aD.llIIlIllII[28] = -(0x93 ^ 0x8A) & (0xFFFFBFDF & 0x4BFF);
        aD.llIIlIllII[29] = 0xFFFF9EFD & 0x6FF7;
        aD.llIIlIllII[30] = -(0xFFFFE5AE & 0x7A5B) & (0xFFFFEBDB & 0x7FEF);
        aD.llIIlIllII[31] = 0xFFFF8EF9 & 0x7FF7;
        aD.llIIlIllII[32] = -(0xFFFFDD77 & 0x3289) & (0xFFFFFFFD & 0x1BBF);
        aD.llIIlIllII[33] = 0xFFFFDEFF & 0x2FEE;
        aD.llIIlIllII[34] = -(0xFFFFE70D & 0x3CF3) & (0xFFFFBFF7 & 0x6FBF);
        aD.llIIlIllII[35] = -(0xFFFFEDB9 & 0x5357) & (0xFFFFDFFA & 0x6FFF);
        aD.llIIlIllII[36] = -(0xFFFFB429 & 0x7BD7) & (0xFFFFFFEF & 0x3BBF);
        aD.llIIlIllII[37] = -(0xFFFFC39D & 0x7D63) & (0xFFFFDFFB & 0x6FEF);
        aD.llIIlIllII[38] = 0xFFFFFFAF & 0xBF7;
        aD.llIIlIllII[39] = -(0xFFFFDEFA & 0x715D) & (0xFFFFFFFF & 0x5BF7);
        aD.llIIlIllII[40] = 0xFFFFEBBB & 0x1FDE;
        aD.llIIlIllII[41] = 0x2B ^ 0x68 ^ (0xE3 ^ 0xAB);
        aD.llIIlIllII[42] = -(0x34 ^ 0x15) & (0xFFFFEBB7 & 0x1FFB);
        aD.llIIlIllII[43] = 0xFFFFFEED & 0xFFE;
        aD.llIIlIllII[44] = 0xA9 ^ 0xA5;
        aD.llIIlIllII[45] = 0xFFFFAF9F & 0x5BEF;
        aD.llIIlIllII[46] = 0x65 ^ 0x53 ^ (0x7A ^ 0x42);
        aD.llIIlIllII[47] = 22 + 83 - 101 + 127 ^ 15 + 78 - -12 + 35;
        aD.llIIlIllII[48] = 0x1A ^ 0xA;
        aD.llIIlIllII[49] = 94 + 1 - -17 + 49 ^ 16 + 125 - -29 + 6;
        aD.llIIlIllII[50] = -(0xFFFFF8EB & 0x77F7) & (0xFFFFF6FB & 0x7BFF);
        aD.llIIlIllII[51] = 141 + 107 - 220 + 131 ^ 34 + 101 - -4 + 2;
        aD.llIIlIllII[52] = 0x6D ^ 0x7E;
        aD.llIIlIllII[53] = 0x4F ^ 0x5A;
        aD.llIIlIllII[54] = 135 + 150 - 194 + 82 ^ 185 + 20 - 35 + 17;
        aD.llIIlIllII[55] = 0x34 ^ 0x11 ^ (0x3E ^ 0xC);
        aD.llIIlIllII[56] = 59 + 29 - -59 + 18 ^ 58 + 39 - 5 + 97;
        aD.llIIlIllII[57] = 0x76 ^ 0x6F;
        aD.llIIlIllII[58] = 0x19 ^ 0x59 ^ (0xD9 ^ 0x83);
        aD.llIIlIllII[59] = 161 + 99 - 160 + 120 ^ 114 + 113 - 102 + 74;
        aD.llIIlIllII[60] = 0xAE ^ 0xB8 ^ (0x83 ^ 0x89);
        aD.llIIlIllII[61] = 133 + 148 - 150 + 19 ^ 52 + 133 - 48 + 2;
        aD.llIIlIllII[62] = 0xA6 ^ 0xB8;
        aD.llIIlIllII[63] = 0xFFFFDAF2 & 0x2FFD;
        aD.llIIlIllII[64] = 0xFFFFAFCC & 0x7EFF;
        aD.llIIlIllII[65] = -(0xFFFFBE1F & 0x5FF8) & (0xFFFFFFBF & Short.MAX_VALUE);
        aD.llIIlIllII[66] = -(0x54 ^ 0x5D) & (0xFFFFBF6F & 0x5FDF);
        aD.llIIlIllII[67] = 0x73 ^ 0x5B;
        aD.llIIlIllII[68] = 0xFFFF8F96 & 0x73ED;
        aD.llIIlIllII[69] = 0xFFFFED4E & 0x43FFF;
        aD.llIIlIllII[70] = 0xA9 ^ 0x95;
        aD.llIIlIllII[71] = 56 + 187 - 46 + 42 ^ 31 + 111 - 119 + 171;
        aD.llIIlIllII[72] = 0xFFFFBDC7 & 0x43FA;
        aD.llIIlIllII[73] = -(0xFFFFCFF9 & 0x3E97) & (0xFFFFFEDD & 0xFFFA);
        aD.llIIlIllII[74] = 4 ^ 0x33 ^ (0xEC ^ 0xBF);
        aD.llIIlIllII[75] = 0x87 ^ 0xAC ^ (0x4E ^ 0x7A);
        aD.llIIlIllII[76] = 0x2E ^ 0x29 ^ (0x51 ^ 0x35);
        aD.llIIlIllII[77] = 7 + 62 - 29 + 92 ^ 155 + 84 - 141 + 66;
        aD.llIIlIllII[78] = -(0xFFFFE6FB & 0x392F) & (0xFFFFEBFF & 0x3FFF);
        aD.llIIlIllII[79] = -(0xFFFFF5BE & 0x7AFD) & (0xFFFFFFBF & Short.MAX_VALUE);
        aD.llIIlIllII[80] = -(0xFFFFFDEF & 0x1659) & (0xFFFFBFFF & 0x5FFA);
        aD.llIIlIllII[81] = -(0xFFFFE5FF & 0x5A17) & (0xFFFFCFFF & 0x7EFF);
        aD.llIIlIllII[82] = 0xFFFFEBDE & 0x1FA7;
        aD.llIIlIllII[83] = 0xFFFFFEFF & 0xFED;
        aD.llIIlIllII[84] = -(0xFFFFF755 & 0x7CAB) & (0xFFFFFFD6 & 0x7FAD);
        aD.llIIlIllII[85] = -(0xFFFFA9E9 & 0x57FF) & (0xFFFFAFFE & 0x5DFF);
        aD.llIIlIllII[86] = 0xFFFFEDF3 & 0x1FAF;
        aD.llIIlIllII[87] = 104 + 50 - 15 + 21 ^ 9 + 119 - 32 + 33;
    }

    static {
        aD.lIlIlIlIllIll();
        aD.lIlIlIlIllIIl();
        pd = new WorldPoint(llIIlIllII[78], llIIlIllII[79], llIIlIllII[1]);
        pe = new WorldPoint(llIIlIllII[80], llIIlIllII[81], llIIlIllII[1]);
        pf = new WorldPoint(llIIlIllII[82], llIIlIllII[83], llIIlIllII[1]);
        pg = new WorldPoint(llIIlIllII[84], llIIlIllII[43], llIIlIllII[1]);
        ph = new WorldPoint(llIIlIllII[1], llIIlIllII[1], llIIlIllII[1]);
        pi = new WorldPoint(llIIlIllII[1], llIIlIllII[1], llIIlIllII[1]);
        pj = new WorldPoint(llIIlIllII[85], llIIlIllII[86], llIIlIllII[1]);
        bv = new ArrayList<d>();
    }

    private static boolean lIlIlIllIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIlIllIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIlIllIIIll(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public String ag() {
        return llIIlIlIll[llIIlIllII[75]];
    }

    @Override
    public int af() {
        try {
            aD.fY();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0xCF ^ 0x99) & ~(6 ^ 0x50)) != 0) {
            return (0x8E ^ 0x91) & ~(0x54 ^ 0x4B);
        }
        return llIIlIllII[74];
    }

    private static int fZ() {
        int n2 = llIIlIllII[69];
        if (aD.lIlIlIlIlllIl(Skills.getLevel((Skill)Skill.PRAYER), llIIlIllII[70]) && aD.lIlIlIllIIlII(Skills.getLevel((Skill)Skill.PRAYER), llIIlIllII[71])) {
            return (n2 - Skills.getExperience((Skill)Skill.PRAYER)) / llIIlIllII[72] + llIIlIllII[21];
        }
        int n3 = llIIlIllII[73];
        return (n3 - Skills.getExperience((Skill)Skill.PRAYER)) / llIIlIllII[72] + llIIlIllII[62];
    }

    @Override
    public boolean ae() {
        return llIIlIllII[1];
    }

    private static boolean lIlIlIlIlllll(Object object) {
        return object != null;
    }

    private static boolean lIlIlIlIllllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIlIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlIllIIIII(int n2) {
        return n2 > 0;
    }

    public aD() {
        this.pk = llIIlIllII[0];
    }

    private static boolean lIlIlIllIIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void Q() {
        d llllllllllllllllllIlIIlIIlIlIIll;
        Object llllllllllllllllllIlIIlIIlIlIlII;
        int[] nArray = new int[llIIlIllII[2]];
        nArray[aD.llIIlIllII[1]] = llIIlIllII[8];
        if (aD.lIlIlIlIllllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llIIlIllII[8], llIIlIllII[13], j.cf);
            bv.add(d2);
            "".length();
        }
        int[] nArray2 = new int[llIIlIllII[2]];
        nArray2[aD.llIIlIllII[1]] = llIIlIllII[0];
        if (aD.lIlIlIlIllllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llllllllllllllllllIlIIlIIlIlIlII = new d(llIIlIllII[0], aD.fZ(), llIIlIllII[63]);
            bv.add((d)llllllllllllllllllIlIIlIIlIlIlII);
            "".length();
        }
        int[] nArray3 = new int[llIIlIllII[2]];
        nArray3[aD.llIIlIllII[1]] = llIIlIllII[7];
        if (aD.lIlIlIlIllllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llllllllllllllllllIlIIlIIlIlIlII = new d(llIIlIllII[7], llIIlIllII[3], llIIlIllII[5]);
            bv.add((d)llllllllllllllllllIlIIlIIlIlIlII);
            "".length();
        }
        if (aD.lIlIlIlIllllI(Bank.contains((Predicate)(llllllllllllllllllIlIIlIIlIlIlII = item -> item.getName().toLowerCase().contains(llIIlIlIll[llIIlIllII[77]]))) ? 1 : 0)) {
            llllllllllllllllllIlIIlIIlIlIIll = new d(llIIlIllII[64], llIIlIllII[13], llIIlIllII[65]);
            bv.add(llllllllllllllllllIlIIlIIlIlIIll);
            "".length();
        }
        int[] nArray4 = new int[llIIlIllII[2]];
        nArray4[aD.llIIlIllII[1]] = llIIlIllII[66];
        if (aD.lIlIlIlIllllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llllllllllllllllllIlIIlIIlIlIIll = new d(llIIlIllII[66], llIIlIllII[67], llIIlIllII[68]);
            bv.add(llllllllllllllllllIlIIlIIlIlIIll);
            "".length();
        }
    }

    private static boolean lIlIlIlIlllII(int n2) {
        return n2 != 0;
    }

    private static void lIlIlIlIllIIl() {
        llIIlIlIll = new String[llIIlIllII[87]];
        aD.llIIlIlIll[aD.llIIlIllII[1]] = aD.lIlIlIlIlIllI("+UoJvQgg/3X6c/QXQUB2PA==", "WSBWw");
        aD.llIIlIlIll[aD.llIIlIllII[2]] = aD.lIlIlIlIlIllI("zRS+U/FWMurtp+Il+vMdi7uxxfCXXHa4nUL0VJs8scoT2fwIsc2vzkmpDj3rfR/V", "eZbsV");
        aD.llIIlIlIll[aD.llIIlIllII[3]] = aD.lIlIlIlIlIllI("fe3DQIOA1yuwvEnOI6XpQ3U/x7sxjest", "juzSn");
        aD.llIIlIlIll[aD.llIIlIllII[4]] = aD.lIlIlIlIlIllI("c4bbwfIfmE5j5bagMf33LhpeoPj3oM55", "Oimqk");
        aD.llIIlIlIll[aD.llIIlIllII[6]] = aD.lIlIlIlIlIlll("6vqHYjuGWWNNWGha8kV8d7FDEG8J8cXD8RcxzgbHJzLKdnUahpB86qx9qvbdrVv03eiI0u7Bwsc=", "ldPyZ");
        aD.llIIlIlIll[aD.llIIlIllII[13]] = aD.lIlIlIlIlIllI("pWi1/DMtK28=", "TTBbo");
        aD.llIIlIlIll[aD.llIIlIllII[15]] = aD.lIlIlIlIlIllI("ao8Nsev2KiohaUdXT5gTZg==", "alfSB");
        aD.llIIlIlIll[aD.llIIlIllII[17]] = aD.lIlIlIlIllIII("AgE1", "PtWhB");
        aD.llIIlIlIll[aD.llIIlIllII[18]] = aD.lIlIlIlIlIllI("dxBrK+HhQ0eMKnVGBnO7Ug==", "PVozU");
        aD.llIIlIlIll[aD.llIIlIllII[19]] = aD.lIlIlIlIlIlll("vWILk2dsJme+f+OMhuMSEAIHUU1sAWgBkUjop/CaU+0rkUYf3BoYMQ==", "ELMxP");
        aD.llIIlIlIll[aD.llIIlIllII[21]] = aD.lIlIlIlIlIllI("wJBV0M8GpgO1+0AwhZ00fg==", "dgLDn");
        aD.llIIlIlIll[aD.llIIlIllII[41]] = aD.lIlIlIlIllIII("aUMeCBEzQxoTEyE=", "Xcjar");
        aD.llIIlIlIll[aD.llIIlIllII[44]] = aD.lIlIlIlIlIllI("+S0Kdvy69Hq0h73/rBZxgg==", "UUrwf");
        aD.llIIlIlIll[aD.llIIlIllII[20]] = aD.lIlIlIlIllIII("KAUnEhBEADoaBw==", "ddUuu");
        aD.llIIlIlIll[aD.llIIlIllII[46]] = aD.lIlIlIlIlIllI("glXabByevtQ=", "jACRO");
        aD.llIIlIlIll[aD.llIIlIllII[47]] = aD.lIlIlIlIllIII("JzY2Jg==", "hFSHO");
        aD.llIIlIlIll[aD.llIIlIllII[48]] = aD.lIlIlIlIlIllI("ip4OIodJgi0=", "cBLAo");
        aD.llIIlIlIll[aD.llIIlIllII[49]] = aD.lIlIlIlIllIII("LD85KjFPNjQxIx0=", "oWXEB");
        aD.llIIlIlIll[aD.llIIlIllII[51]] = aD.lIlIlIlIlIllI("BoSpngnMZ58rNVKuXYNqMA==", "SHYke");
        aD.llIIlIlIll[aD.llIIlIllII[52]] = aD.lIlIlIlIllIII("LDw6JTMQPDNqJRY8MTk=", "yRTJG");
        aD.llIIlIlIll[aD.llIIlIllII[14]] = aD.lIlIlIlIlIllI("9QNtXTq4T+c73GRhswuh82AzvGMjv/Os", "mzKPk");
        aD.llIIlIlIll[aD.llIIlIllII[53]] = aD.lIlIlIlIlIlll("eg7Yd0w0Z0nRnJOlIbw1/A==", "YnRtQ");
        aD.llIIlIlIll[aD.llIIlIllII[54]] = aD.lIlIlIlIlIlll("GHDp2KboN2w=", "Wvzwp");
        aD.llIIlIlIll[aD.llIIlIllII[55]] = aD.lIlIlIlIlIlll("ToIF2xTj5Ow=", "MPYbT");
        aD.llIIlIlIll[aD.llIIlIllII[56]] = aD.lIlIlIlIlIlll("HmxMB4OOjis=", "HCrDc");
        aD.llIIlIlIll[aD.llIIlIllII[57]] = aD.lIlIlIlIllIII("IhkHGxgJBgE=", "gadsy");
        aD.llIIlIlIll[aD.llIIlIllII[58]] = aD.lIlIlIlIllIII("NSIzKiMePTVidw==", "pZPBB");
        aD.llIIlIlIll[aD.llIIlIllII[59]] = aD.lIlIlIlIlIlll("PjA63SrKZrVFbL4t9z/lCw==", "cctnb");
        aD.llIIlIlIll[aD.llIIlIllII[60]] = aD.lIlIlIlIlIlll("tB8myTSS52wt44MC2+MpOg==", "OXvkz");
        aD.llIIlIlIll[aD.llIIlIllII[61]] = aD.lIlIlIlIlIlll("lkPIBSxgH4HNQMA3iAlwQg==", "bitiM");
        aD.llIIlIlIll[aD.llIIlIllII[62]] = aD.lIlIlIlIllIII("BRM7Bg==", "QrPcp");
        aD.llIIlIlIll[aD.llIIlIllII[75]] = aD.lIlIlIlIlIllI("6EzkSKC48FjDZkbqCG254w==", "Qdkjv");
        aD.llIIlIlIll[aD.llIIlIllII[77]] = aD.lIlIlIlIllIII("KBAvKlc1H2E6EjsVNSVXcg==", "ZyAMw");
    }

    private static String lIlIlIlIlIllI(String llllllllllllllllllIlIIlIIIlIlIll, String llllllllllllllllllIlIIlIIIlIllII) {
        try {
            SecretKeySpec llllllllllllllllllIlIIlIIIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIIlIIIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIlIIlIIIlIllll = Cipher.getInstance("Blowfish");
            llllllllllllllllllIlIIlIIIlIllll.init(llIIlIllII[3], llllllllllllllllllIlIIlIIIllIIII);
            return new String(llllllllllllllllllIlIIlIIIlIllll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIIlIIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIlIIlIIIlIlllI) {
            llllllllllllllllllIlIIlIIIlIlllI.printStackTrace();
            return null;
        }
    }

    private static String lIlIlIlIllIII(String llllllllllllllllllIlIIlIIIllllIl, String llllllllllllllllllIlIIlIIIllllII) {
        llllllllllllllllllIlIIlIIIllllIl = new String(Base64.getDecoder().decode(llllllllllllllllllIlIIlIIIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIlIIlIIlIIIIII = new StringBuilder();
        char[] llllllllllllllllllIlIIlIIIllllll = llllllllllllllllllIlIIlIIIllllII.toCharArray();
        int llllllllllllllllllIlIIlIIIlllllI = llIIlIllII[1];
        char[] llllllllllllllllllIlIIlIIIlllIII = llllllllllllllllllIlIIlIIIllllIl.toCharArray();
        int llllllllllllllllllIlIIlIIIllIlll = llllllllllllllllllIlIIlIIIlllIII.length;
        int llllllllllllllllllIlIIlIIIllIllI = llIIlIllII[1];
        while (aD.lIlIlIlIlllIl(llllllllllllllllllIlIIlIIIllIllI, llllllllllllllllllIlIIlIIIllIlll)) {
            char llllllllllllllllllIlIIlIIlIIIIll = llllllllllllllllllIlIIlIIIlllIII[llllllllllllllllllIlIIlIIIllIllI];
            llllllllllllllllllIlIIlIIlIIIIII.append((char)(llllllllllllllllllIlIIlIIlIIIIll ^ llllllllllllllllllIlIIlIIIllllll[llllllllllllllllllIlIIlIIIlllllI % llllllllllllllllllIlIIlIIIllllll.length]));
            "".length();
            ++llllllllllllllllllIlIIlIIIlllllI;
            ++llllllllllllllllllIlIIlIIIllIllI;
            "".length();
            if (((1 ^ 0x6C ^ (0xF0 ^ 0x82)) & (0xD0 ^ 0x9B ^ (0xCB ^ 0x9F) ^ -" ".length())) == 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIlIIlIIlIIIIII);
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (aD.lIlIlIllIIlII(Skills.getLevel((Skill)Skill.PRAYER), llIIlIllII[76])) {
            bl = llIIlIllII[2];
            "".length();
            if (((0xA ^ 0x2B) & ~(0x2E ^ 0xF)) == -" ".length()) {
                return ((0xF7 ^ 0xAF) & ~(0x67 ^ 0x3F)) != 0;
            }
        } else {
            bl = llIIlIllII[1];
        }
        return bl;
    }

    public static void fY() {
        block44: {
            TileItem llllllllllllllllllIlIIlIIlIllIlI;
            block45: {
                if (aD.lIlIlIlIlllII(bt ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlIlIll[llIIlIllII[1]];
                    b.a(bv);
                    if (aD.lIlIlIlIlllIl(bv.size(), llIIlIllII[2])) {
                        System.out.println(llIIlIlIll[llIIlIllII[2]]);
                        bt = llIIlIllII[1];
                    }
                }
                if (!aD.lIlIlIlIllllI(bt ? 1 : 0)) break block44;
                if (aD.lIlIlIlIllllI(aD.an() ? 1 : 0) && aD.lIlIlIlIlllIl(Game.getWildyLevel(), llIIlIllII[2])) {
                    llllllllllllllllllIlIIlIIlIllIlI = BankLocation.getNearest();
                    if (aD.lIlIlIlIlllll(llllllllllllllllllIlIIlIIlIllIlI) && aD.lIlIlIlIllllI(llllllllllllllllllIlIIlIIlIllIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIlIlIll[llIIlIllII[3]];
                        a.a((BankLocation)llllllllllllllllllIlIIlIIlIllIlI);
                    }
                    if (aD.lIlIlIlIlllll(llllllllllllllllllIlIIlIIlIllIlI) && aD.lIlIlIlIlllII(llllllllllllllllllIlIIlIIlIllIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIlIlIll[llIIlIllII[4]];
                        if (aD.lIlIlIlIllllI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlIllII[5]);
                            "".length();
                        }
                        if (aD.lIlIlIlIlllII(Bank.isOpen() ? 1 : 0)) {
                            if (aD.lIlIlIllIIIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIIlIllII[6]);
                                "".length();
                            }
                            if (aD.lIlIlIllIIIII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llIIlIllII[3]);
                                "".length();
                            }
                            int[] nArray = new int[llIIlIllII[4]];
                            nArray[aD.llIIlIllII[1]] = llIIlIllII[7];
                            nArray[aD.llIIlIllII[2]] = llIIlIllII[0];
                            nArray[aD.llIIlIllII[3]] = llIIlIllII[8];
                            if (aD.lIlIlIlIllllI(e.c(nArray) ? 1 : 0)) {
                                aD.Q();
                                System.out.println(llIIlIlIll[llIIlIllII[6]]);
                                bt = llIIlIllII[2];
                                return;
                            }
                            int[] nArray2 = new int[llIIlIllII[4]];
                            nArray2[aD.llIIlIllII[1]] = llIIlIllII[7];
                            nArray2[aD.llIIlIllII[2]] = llIIlIllII[0];
                            nArray2[aD.llIIlIllII[3]] = llIIlIllII[8];
                            if (aD.lIlIlIlIlllII(e.c(nArray2) ? 1 : 0)) {
                                if (aD.lIlIlIlIllllI(Equipment.contains((int[])f.bf) ? 1 : 0)) {
                                    a.b(f.bf, llIIlIllII[2]);
                                }
                                a.b(f.ba, llIIlIllII[2]);
                                a.a(llIIlIllII[9], llIIlIllII[10]);
                                a.b(llIIlIllII[0], llIIlIllII[11]);
                            }
                        }
                    }
                }
                if (aD.lIlIlIlIlllII(aD.an() ? 1 : 0)) {
                    if (aD.lIlIlIlIlllII(Inventory.contains((int[])f.ba) ? 1 : 0) && aD.lIlIlIlIlllIl(Movement.getRunEnergy(), llIIlIllII[12])) {
                        Inventory.getFirst((int[])f.ba).interact(llIIlIlIll[llIIlIllII[13]]);
                        Time.sleepTicks((int)llIIlIllII[2]);
                        "".length();
                    }
                    if (aD.lIlIlIlIllllI(Movement.isRunEnabled() ? 1 : 0) && aD.lIlIlIllIIIIl(Movement.getRunEnergy(), llIIlIllII[14])) {
                        Movement.toggleRun();
                        Time.sleepTicks((int)llIIlIllII[13]);
                        "".length();
                    }
                    if (aD.lIlIlIlIlllIl(Game.getWildyLevel(), llIIlIllII[2])) {
                        AccBuilderSotf.c = llIIlIlIll[llIIlIllII[15]];
                        if (aD.lIlIlIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (aD.lIlIlIlIllllI(Dialog.isOpen() ? 1 : 0) && aD.lIlIlIlIlllII(Inventory.contains((int[])f.bf) ? 1 : 0) && aD.lIlIlIllIIIlI(Players.getLocal().getAnimation(), llIIlIllII[16])) {
                            Inventory.getFirst((int[])f.bf).interact(llIIlIlIll[llIIlIllII[17]]);
                            Time.sleepTicks((int)llIIlIllII[3]);
                            "".length();
                        }
                        String[] stringArray = new String[llIIlIllII[3]];
                        stringArray[aD.llIIlIllII[1]] = llIIlIlIll[llIIlIllII[18]];
                        stringArray[aD.llIIlIllII[2]] = llIIlIlIll[llIIlIllII[19]];
                        g.a(stringArray);
                    }
                    if (aD.lIlIlIllIIIII(Game.getWildyLevel())) {
                        TileObject llllllllllllllllllIlIIlIIlIllIIl;
                        int[] nArray = new int[llIIlIllII[2]];
                        nArray[aD.llIIlIllII[1]] = llIIlIllII[0];
                        if (aD.lIlIlIlIlllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            if (aD.lIlIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(pf), llIIlIllII[20])) {
                                AccBuilderSotf.c = llIIlIlIll[llIIlIllII[21]];
                                TileItem tileItem = new WorldPoint[llIIlIllII[20]];
                                tileItem[aD.llIIlIllII[1]] = new WorldPoint(llIIlIllII[22], llIIlIllII[23], llIIlIllII[1]);
                                tileItem[aD.llIIlIllII[2]] = new WorldPoint(llIIlIllII[24], llIIlIllII[25], llIIlIllII[1]);
                                tileItem[aD.llIIlIllII[3]] = new WorldPoint(llIIlIllII[26], llIIlIllII[27], llIIlIllII[1]);
                                tileItem[aD.llIIlIllII[4]] = new WorldPoint(llIIlIllII[28], llIIlIllII[29], llIIlIllII[1]);
                                tileItem[aD.llIIlIllII[6]] = new WorldPoint(llIIlIllII[30], llIIlIllII[31], llIIlIllII[1]);
                                tileItem[aD.llIIlIllII[13]] = new WorldPoint(llIIlIllII[32], llIIlIllII[33], llIIlIllII[1]);
                                tileItem[aD.llIIlIllII[15]] = new WorldPoint(llIIlIllII[34], llIIlIllII[35], llIIlIllII[1]);
                                tileItem[aD.llIIlIllII[17]] = new WorldPoint(llIIlIllII[36], llIIlIllII[37], llIIlIllII[1]);
                                tileItem[aD.llIIlIllII[18]] = new WorldPoint(llIIlIllII[38], llIIlIllII[37], llIIlIllII[1]);
                                tileItem[aD.llIIlIllII[19]] = new WorldPoint(llIIlIllII[39], llIIlIllII[37], llIIlIllII[1]);
                                tileItem[aD.llIIlIllII[21]] = new WorldPoint(llIIlIllII[40], llIIlIllII[37], llIIlIllII[1]);
                                tileItem[aD.llIIlIllII[41]] = new WorldPoint(llIIlIllII[42], llIIlIllII[43], llIIlIllII[1]);
                                tileItem[aD.llIIlIllII[44]] = new WorldPoint(llIIlIllII[45], llIIlIllII[43], llIIlIllII[1]);
                                llllllllllllllllllIlIIlIIlIllIlI = tileItem;
                                Walker.walkAlong(Arrays.asList(llllllllllllllllllIlIIlIIlIllIlI), new HashMap());
                                "".length();
                                Time.sleepTicks((int)llIIlIllII[2]);
                                "".length();
                            }
                            if (aD.lIlIlIllIIIll(Players.getLocal().getWorldLocation().distanceTo(pf), llIIlIllII[20])) {
                                AccBuilderSotf.c = llIIlIlIll[llIIlIllII[41]];
                                String[] stringArray = new String[llIIlIllII[2]];
                                stringArray[aD.llIIlIllII[1]] = llIIlIlIll[llIIlIllII[44]];
                                llllllllllllllllllIlIIlIIlIllIlI = TileObjects.getNearest((String[])stringArray);
                                String[] stringArray2 = new String[llIIlIllII[2]];
                                stringArray2[aD.llIIlIllII[1]] = llIIlIlIll[llIIlIllII[20]];
                                llllllllllllllllllIlIIlIIlIllIIl = TileObjects.getNearest((String[])stringArray2);
                                String[] stringArray3 = new String[llIIlIllII[2]];
                                stringArray3[aD.llIIlIllII[1]] = llIIlIlIll[llIIlIllII[46]];
                                if (aD.lIlIlIlIlllII(llllllllllllllllllIlIIlIIlIllIIl.hasAction(stringArray3) ? 1 : 0)) {
                                    llllllllllllllllllIlIIlIIlIllIIl.interact(llIIlIlIll[llIIlIllII[47]]);
                                }
                                if (aD.lIlIlIlIlllll(llllllllllllllllllIlIIlIIlIllIlI)) {
                                    String[] stringArray4 = new String[llIIlIllII[2]];
                                    stringArray4[aD.llIIlIllII[1]] = llIIlIlIll[llIIlIllII[48]];
                                    if (aD.lIlIlIlIllllI(llllllllllllllllllIlIIlIIlIllIIl.hasAction(stringArray4) ? 1 : 0)) {
                                        int llllllllllllllllllIlIIlIIlIllIII = Skills.getExperience((Skill)Skill.PRAYER);
                                        int[] nArray3 = new int[llIIlIllII[2]];
                                        nArray3[aD.llIIlIllII[1]] = llIIlIllII[0];
                                        String[] stringArray5 = new String[llIIlIllII[2]];
                                        stringArray5[aD.llIIlIllII[1]] = llIIlIlIll[llIIlIllII[49]];
                                        Inventory.getFirst((int[])nArray3).useOn(TileObjects.getNearest((String[])stringArray5));
                                        Time.sleepTicks((int)llIIlIllII[2]);
                                        "".length();
                                    }
                                }
                            }
                        }
                        int[] nArray4 = new int[llIIlIllII[2]];
                        nArray4[aD.llIIlIllII[1]] = llIIlIllII[0];
                        if (aD.lIlIlIlIllllI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[llIIlIllII[2]];
                            nArray5[aD.llIIlIllII[1]] = llIIlIllII[50];
                            if (aD.lIlIlIlIlllII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                if (aD.lIlIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(pf), llIIlIllII[20])) {
                                    AccBuilderSotf.c = llIIlIlIll[llIIlIllII[51]];
                                    WorldPoint[] worldPointArray = new WorldPoint[llIIlIllII[20]];
                                    worldPointArray[aD.llIIlIllII[1]] = new WorldPoint(llIIlIllII[22], llIIlIllII[23], llIIlIllII[1]);
                                    worldPointArray[aD.llIIlIllII[2]] = new WorldPoint(llIIlIllII[24], llIIlIllII[25], llIIlIllII[1]);
                                    worldPointArray[aD.llIIlIllII[3]] = new WorldPoint(llIIlIllII[26], llIIlIllII[27], llIIlIllII[1]);
                                    worldPointArray[aD.llIIlIllII[4]] = new WorldPoint(llIIlIllII[28], llIIlIllII[29], llIIlIllII[1]);
                                    worldPointArray[aD.llIIlIllII[6]] = new WorldPoint(llIIlIllII[30], llIIlIllII[31], llIIlIllII[1]);
                                    worldPointArray[aD.llIIlIllII[13]] = new WorldPoint(llIIlIllII[32], llIIlIllII[33], llIIlIllII[1]);
                                    worldPointArray[aD.llIIlIllII[15]] = new WorldPoint(llIIlIllII[34], llIIlIllII[35], llIIlIllII[1]);
                                    worldPointArray[aD.llIIlIllII[17]] = new WorldPoint(llIIlIllII[36], llIIlIllII[37], llIIlIllII[1]);
                                    worldPointArray[aD.llIIlIllII[18]] = new WorldPoint(llIIlIllII[38], llIIlIllII[37], llIIlIllII[1]);
                                    worldPointArray[aD.llIIlIllII[19]] = new WorldPoint(llIIlIllII[39], llIIlIllII[37], llIIlIllII[1]);
                                    worldPointArray[aD.llIIlIllII[21]] = new WorldPoint(llIIlIllII[40], llIIlIllII[37], llIIlIllII[1]);
                                    worldPointArray[aD.llIIlIllII[41]] = new WorldPoint(llIIlIllII[42], llIIlIllII[43], llIIlIllII[1]);
                                    worldPointArray[aD.llIIlIllII[44]] = new WorldPoint(llIIlIllII[45], llIIlIllII[43], llIIlIllII[1]);
                                    llllllllllllllllllIlIIlIIlIllIlI = worldPointArray;
                                    Walker.walkAlong(Arrays.asList(llllllllllllllllllIlIIlIIlIllIlI), new HashMap());
                                    "".length();
                                    Time.sleepTicks((int)llIIlIllII[2]);
                                    "".length();
                                }
                                if (aD.lIlIlIllIIIll(Players.getLocal().getWorldLocation().distanceTo(pf), llIIlIllII[20])) {
                                    AccBuilderSotf.c = llIIlIlIll[llIIlIllII[52]];
                                    if (!aD.lIlIlIlIllllI(Dialog.canLevelUpContinue() ? 1 : 0) || aD.lIlIlIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    String[] stringArray = new String[llIIlIllII[2]];
                                    stringArray[aD.llIIlIllII[1]] = llIIlIlIll[llIIlIllII[14]];
                                    llllllllllllllllllIlIIlIIlIllIlI = NPCs.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[llIIlIllII[2]];
                                    stringArray6[aD.llIIlIllII[1]] = llIIlIlIll[llIIlIllII[53]];
                                    llllllllllllllllllIlIIlIIlIllIIl = TileObjects.getNearest((String[])stringArray6);
                                    String[] stringArray7 = new String[llIIlIllII[2]];
                                    stringArray7[aD.llIIlIllII[1]] = llIIlIlIll[llIIlIllII[54]];
                                    if (aD.lIlIlIlIlllII(llllllllllllllllllIlIIlIIlIllIIl.hasAction(stringArray7) ? 1 : 0)) {
                                        llllllllllllllllllIlIIlIIlIllIIl.interact(llIIlIlIll[llIIlIllII[55]]);
                                    }
                                    if (aD.lIlIlIlIlllll(llllllllllllllllllIlIIlIIlIllIlI)) {
                                        String[] stringArray8 = new String[llIIlIllII[2]];
                                        stringArray8[aD.llIIlIllII[1]] = llIIlIlIll[llIIlIllII[56]];
                                        if (aD.lIlIlIlIllllI(llllllllllllllllllIlIIlIIlIllIIl.hasAction(stringArray8) ? 1 : 0)) {
                                            List llllllllllllllllllIlIIlIIlIllIII;
                                            if (aD.lIlIlIlIllllI(Dialog.isOpen() ? 1 : 0)) {
                                                int[] nArray6 = new int[llIIlIllII[2]];
                                                nArray6[aD.llIIlIllII[1]] = llIIlIllII[50];
                                                Inventory.getFirst((int[])nArray6).useOn((Actor)llllllllllllllllllIlIIlIIlIllIlI);
                                                Time.sleepTicks((int)llIIlIllII[3]);
                                                "".length();
                                            }
                                            if (aD.lIlIlIlIlllII(Dialog.isOpen() ? 1 : 0) && aD.lIlIlIlIllllI((llllllllllllllllllIlIIlIIlIllIII = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                                                int llllllllllllllllllIlIIlIIlIlIlll = llIIlIllII[1];
                                                while (aD.lIlIlIlIlllIl(llllllllllllllllllIlIIlIIlIlIlll, llllllllllllllllllIlIIlIIlIllIII.size())) {
                                                    int[] nArray7 = new int[llIIlIllII[2]];
                                                    nArray7[aD.llIIlIllII[1]] = llIIlIllII[50];
                                                    if (aD.lIlIlIllIIIlI(((Item)Inventory.getAll((int[])nArray7).get(llIIlIllII[1])).getQuantity(), llIIlIllII[2]) && aD.lIlIlIlIlllII(((Widget)llllllllllllllllllIlIIlIIlIllIII.get(llllllllllllllllllIlIIlIIlIlIlll)).getText().contains(llIIlIlIll[llIIlIllII[57]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)llllllllllllllllllIlIIlIIlIllIII.get(llllllllllllllllllIlIIlIIlIlIlll)).getClickPoint().getX(), (int)((Widget)llllllllllllllllllIlIIlIIlIllIII.get(llllllllllllllllllIlIIlIIlIlIlll)).getClickPoint().getY(), (boolean)llIIlIllII[2]);
                                                        Time.sleepTicks((int)llIIlIllII[3]);
                                                        "".length();
                                                    }
                                                    int[] nArray8 = new int[llIIlIllII[2]];
                                                    nArray8[aD.llIIlIllII[1]] = llIIlIllII[50];
                                                    if (aD.lIlIlIllIIIlI(((Item)Inventory.getAll((int[])nArray8).get(llIIlIllII[1])).getQuantity(), llIIlIllII[13]) && aD.lIlIlIlIlllII(((Widget)llllllllllllllllllIlIIlIIlIllIII.get(llllllllllllllllllIlIIlIIlIlIlll)).getText().contains(llIIlIlIll[llIIlIllII[58]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)llllllllllllllllllIlIIlIIlIllIII.get(llllllllllllllllllIlIIlIIlIlIlll)).getClickPoint().getX(), (int)((Widget)llllllllllllllllllIlIIlIIlIllIII.get(llllllllllllllllllIlIIlIIlIlIlll)).getClickPoint().getY(), (boolean)llIIlIllII[2]);
                                                        Time.sleepTicks((int)llIIlIllII[3]);
                                                        "".length();
                                                    }
                                                    if (aD.lIlIlIlIlllII(((Widget)llllllllllllllllllIlIIlIIlIllIII.get(llllllllllllllllllIlIIlIIlIlIlll)).getText().contains(llIIlIlIll[llIIlIllII[59]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)llllllllllllllllllIlIIlIIlIllIII.get(llllllllllllllllllIlIIlIIlIlIlll)).getClickPoint().getX(), (int)((Widget)llllllllllllllllllIlIIlIIlIllIII.get(llllllllllllllllllIlIIlIIlIlIlll)).getClickPoint().getY(), (boolean)llIIlIllII[2]);
                                                        Time.sleepTicks((int)llIIlIllII[3]);
                                                        "".length();
                                                    }
                                                    ++llllllllllllllllllIlIIlIIlIlIlll;
                                                    "".length();
                                                    if (" ".length() != ((0xF7 ^ 0xC7 ^ (0x7F ^ 0x4A)) & (0xA1 ^ 0xC6 ^ (0xF0 ^ 0x92) ^ -" ".length()))) continue;
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
                int[] nArray = new int[llIIlIllII[2]];
                nArray[aD.llIIlIllII[1]] = llIIlIllII[9];
                if (!aD.lIlIlIlIlllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray9 = new int[llIIlIllII[2]];
                nArray9[aD.llIIlIllII[1]] = llIIlIllII[0];
                if (!aD.lIlIlIlIllllI(Inventory.contains((int[])nArray9) ? 1 : 0)) break block44;
                int[] nArray10 = new int[llIIlIllII[2]];
                nArray10[aD.llIIlIllII[1]] = llIIlIllII[50];
                if (!aD.lIlIlIlIllllI(Inventory.contains((int[])nArray10) ? 1 : 0)) break block44;
            }
            if (aD.lIlIlIllIIIll(Players.getLocal().getWorldLocation().distanceTo(pf), llIIlIllII[20])) {
                AccBuilderSotf.c = llIIlIlIll[llIIlIllII[60]];
                String[] stringArray = new String[llIIlIllII[2]];
                stringArray[aD.llIIlIllII[1]] = llIIlIlIll[llIIlIllII[61]];
                llllllllllllllllllIlIIlIIlIllIlI = TileItems.getNearest((String[])stringArray);
                if (aD.lIlIlIlIlllll(llllllllllllllllllIlIIlIIlIllIlI)) {
                    llllllllllllllllllIlIIlIIlIllIlI.interact(llIIlIlIll[llIIlIllII[62]]);
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[llIIlIllII[2]];
                nArray[aD.llIIlIllII[1]] = llIIlIllII[9];
                if (!aD.lIlIlIlIlllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[llIIlIllII[2]];
                nArray2[aD.llIIlIllII[1]] = llIIlIllII[9];
                if (!aD.lIlIlIllIIlII(Inventory.getFirst((int[])nArray2).getQuantity(), llIIlIllII[12])) break block2;
                if (!aD.lIlIlIlIllllI(Inventory.contains((int[])f.bf) ? 1 : 0)) break block3;
                if (!aD.lIlIlIlIlllII(Equipment.contains((int[])f.bf) ? 1 : 0)) break block2;
                int[] nArray3 = new int[llIIlIllII[2]];
                nArray3[aD.llIIlIllII[1]] = llIIlIllII[0];
                if (!aD.lIlIlIlIllllI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[llIIlIllII[2]];
                nArray4[aD.llIIlIllII[1]] = llIIlIllII[50];
                if (!aD.lIlIlIlIlllII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block2;
            }
            n2 = llIIlIllII[2];
            "".length();
            if (((0xDC ^ 0xBD) & ~(0xF3 ^ 0x92)) != "  ".length()) return n2 != 0;
            return ((0x79 ^ 0x52) & ~(0x54 ^ 0x7F)) != 0;
        }
        n2 = llIIlIllII[1];
        return n2 != 0;
    }

    private static String lIlIlIlIlIlll(String llllllllllllllllllIlIIlIIIIllllI, String llllllllllllllllllIlIIlIIIIlllll) {
        try {
            SecretKeySpec llllllllllllllllllIlIIlIIIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIIlIIIIlllll.getBytes(StandardCharsets.UTF_8)), llIIlIllII[18]), "DES");
            Cipher llllllllllllllllllIlIIlIIIlIIIlI = Cipher.getInstance("DES");
            llllllllllllllllllIlIIlIIIlIIIlI.init(llIIlIllII[3], llllllllllllllllllIlIIlIIIlIIIll);
            return new String(llllllllllllllllllIlIIlIIIlIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIIlIIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIlIIlIIIlIIIIl) {
            llllllllllllllllllIlIIlIIIlIIIIl.printStackTrace();
            return null;
        }
    }
}

