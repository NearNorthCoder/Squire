/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 */
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.C;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.ac;
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
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;

public class x
implements S {
    static /* synthetic */ String[] bQ;
    public static /* synthetic */ WorldPoint gh;
    /* synthetic */ WorldArea gn;
    public static /* synthetic */ WorldArea ge;
    public static /* synthetic */ WorldPoint gi;
    public static /* synthetic */ WorldPoint gg;
    private static /* synthetic */ String[] llllIIlIIl;
    /* synthetic */ WorldArea go;
    static /* synthetic */ boolean cl;
    public static /* synthetic */ WorldPoint gj;
    public static /* synthetic */ List<d> bu;
    public static /* synthetic */ boolean bs;
    public static /* synthetic */ WorldPoint gk;
    private static /* synthetic */ int[] llllIIlIlI;
    static /* synthetic */ int ck;
    public static /* synthetic */ WorldPoint gf;
    public static /* synthetic */ WorldPoint gl;
    /* synthetic */ WorldArea gm;

    private static boolean llIIllIllIIII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIllIlIlIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean aa() {
        void lllllllllllllllllIlIllIlIlllIIll;
        int[] nArray = new int[llllIIlIlI[13]];
        nArray[x.llllIIlIlI[4]] = llllIIlIlI[14];
        nArray[x.llllIIlIlI[5]] = llllIIlIlI[15];
        nArray[x.llllIIlIlI[6]] = llllIIlIlI[16];
        nArray[x.llllIIlIlI[11]] = llllIIlIlI[17];
        nArray[x.llllIIlIlI[12]] = llllIIlIlI[18];
        nArray[x.llllIIlIlI[19]] = llllIIlIlI[20];
        nArray[x.llllIIlIlI[21]] = llllIIlIlI[22];
        nArray[x.llllIIlIlI[23]] = llllIIlIlI[24];
        int[] nArray2 = nArray;
        int lllllllllllllllllIlIllIlIlllIIlI = llllIIlIlI[4];
        while (x.llIIllIlIlIII(lllllllllllllllllIlIllIlIlllIIlI, ((void)lllllllllllllllllIlIllIlIlllIIll).length)) {
            int[] nArray3 = new int[llllIIlIlI[5]];
            nArray3[x.llllIIlIlI[4]] = lllllllllllllllllIlIllIlIlllIIll[lllllllllllllllllIlIllIlIlllIIlI];
            if (x.llIIllIlIlIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return llllIIlIlI[4];
            }
            ++lllllllllllllllllIlIllIlIlllIIlI;
            0;
            if (-2 <= 0) continue;
            return ((0x70 ^ 0x26) & ~(0x93 ^ 0xC5)) != 0;
        }
        return llllIIlIlI[5];
    }

    private static boolean llIIllIlIllll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIllIlIllII(Object object) {
        return object != null;
    }

    private static boolean llIIllIlIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIllIlIIlll(int n2) {
        return n2 != 0;
    }

    public x() {
        this.gm = new WorldArea(llllIIlIlI[0], llllIIlIlI[1], llllIIlIlI[2], llllIIlIlI[3], llllIIlIlI[4]);
        this.gn = new WorldArea(llllIIlIlI[0], llllIIlIlI[1], llllIIlIlI[2], llllIIlIlI[3], llllIIlIlI[5]);
        this.go = new WorldArea(llllIIlIlI[0], llllIIlIlI[1], llllIIlIlI[2], llllIIlIlI[3], llllIIlIlI[6]);
    }

    private static void llIIllIlIIlIl() {
        llllIIlIlI = new int[119];
        x.llllIIlIlI[0] = 0xFFFF84EF & 0x7F37;
        x.llllIIlIlI[1] = -(0xFFFFFB79 & 0x44AF) & (0xFFFFE9FB & 0x5FFF);
        x.llllIIlIlI[2] = -(0xFFFFE3C5 & 0x3CFB) & (0xFFFFEFF9 & 0x3BF7);
        x.llllIIlIlI[3] = 0xFFFFE67F & 0x1FAF;
        x.llllIIlIlI[4] = (2 ^ 0x15) & ~(0x86 ^ 0x91);
        x.llllIIlIlI[5] = 1;
        x.llllIIlIlI[6] = 2;
        x.llllIIlIlI[7] = 0x7F ^ 0x60;
        x.llllIIlIlI[8] = 0x3A ^ 0x37 ^ (0xFF ^ 0x96);
        x.llllIIlIlI[9] = 0 ^ 0x10;
        x.llllIIlIlI[10] = 0xFFFFD39E & 0x3FE9;
        x.llllIIlIlI[11] = 3;
        x.llllIIlIlI[12] = 1 ^ (0x80 ^ 0x85);
        x.llllIIlIlI[13] = 104 + 73 - 63 + 52 ^ 111 + 131 - 134 + 66;
        x.llllIIlIlI[14] = -(0xFFFFF8DF & 0x4729) & (0xFFFFDF4F & Short.MAX_VALUE);
        x.llllIIlIlI[15] = -(0xFFFFCE8F & 0x77FD) & (0xFFFFF7DD & Short.MAX_VALUE);
        x.llllIIlIlI[16] = -(0xFFFFDDDF & 0x7E6D) & (0xFFFFFFFE & 0x5FFF);
        x.llllIIlIlI[17] = 0xFFFF99DF & 0x6F25;
        x.llllIIlIlI[18] = 0xFFFFB7FF & 0x4F7D;
        x.llllIIlIlI[19] = 0x8C ^ 0x89;
        x.llllIIlIlI[20] = -(0xFFFFF076 & 0x7FAB) & (0xFFFFFA7F & 0x7DFF);
        x.llllIIlIlI[21] = 0xA1 ^ 0xA7;
        x.llllIIlIlI[22] = 0xFFFFFFCD & 0x1F7B;
        x.llllIIlIlI[23] = 0x86 ^ 0x81;
        x.llllIIlIlI[24] = -(0xFFFFFD7B & 0x7B85) & (0xFFFFFFF5 & 0x7DFB);
        x.llllIIlIlI[25] = 0x18 ^ 0x38 ^ (0x77 ^ 0x5D);
        x.llllIIlIlI[26] = -(0xFFFFF67F & 0x6FF6) & (0xFFFFFFFF & 0x6FF7);
        x.llllIIlIlI[27] = -(0xFFFFF6E3 & 0x799F) & (0xFFFFF5F7 & 0x7FBF);
        x.llllIIlIlI[28] = 0xFFFFD97B & 0x27FF;
        x.llllIIlIlI[29] = 0xFFFFB753 & 0x79FF;
        x.llllIIlIlI[30] = 0x51 ^ 0x63;
        x.llllIIlIlI[31] = 0x83 ^ 0x90 ^ (0x4F ^ 0x4B);
        x.llllIIlIlI[32] = 0x28 ^ 0x21;
        x.llllIIlIlI[33] = -(0xFFFF9FDB & 0x70FF) & (0xFFFFFFFF & 0x3FFB);
        x.llllIIlIlI[34] = 0x58 ^ 0x57;
        x.llllIIlIlI[35] = 0x1E ^ 0x19 ^ (0x23 ^ 0x2F);
        x.llllIIlIlI[36] = 0x8D ^ 0x81;
        x.llllIIlIlI[37] = 0x51 ^ 0x5C;
        x.llllIIlIlI[38] = 0xB2 ^ 0xBC;
        x.llllIIlIlI[39] = -(0xFFFF9EDF & 0x73E9) & (0xFFFFFECF & 0x1FFD);
        x.llllIIlIlI[40] = -(0xFFFFF2A3 & 0x7D5F) & (0xFFFFFFFE & 0x7D6F);
        x.llllIIlIlI[41] = 0xFFFFEFDE & 0x1C27;
        x.llllIIlIlI[42] = 0xFFFFFDFD & 0xF6B;
        x.llllIIlIlI[43] = -(0xFFFFE7FD & 0x59BB) & (0xFFFFCDFF & 0x7FBF);
        x.llllIIlIlI[44] = 0xFFFFBDEB & 0x4F77;
        x.llllIIlIlI[45] = 0xFFFF8E2F & 0x7DDB;
        x.llllIIlIlI[46] = 0xFFFFCD7F & 0x3FDE;
        x.llllIIlIlI[47] = -(0xFFFFB5EF & 0x7A13) & (0xFFFFFD9F & 0x3E6F);
        x.llllIIlIlI[48] = 0xFFFF8DFB & 0x7F5C;
        x.llllIIlIlI[49] = 157 + 34 - 95 + 82 + (0x77 ^ 0x5E) - (0xD4 ^ 0xB4) + (0xF1 ^ 0xAC);
        x.llllIIlIlI[50] = 0x22 ^ 0xA;
        x.llllIIlIlI[51] = 0x79 ^ 5 ^ (0xFF ^ 0x92);
        x.llllIIlIlI[52] = 0x9F ^ 0x8D;
        x.llllIIlIlI[53] = 0x16 ^ 0x25 ^ (0xA2 ^ 0x82);
        x.llllIIlIlI[54] = -(0xFFFFF7FB & 0x7A3D) & (0xFFFFFE7F & 0x7FBA);
        x.llllIIlIlI[55] = 0x6E ^ 0x7A;
        x.llllIIlIlI[56] = 0xFFFF9D6B & 0x6FFE;
        x.llllIIlIlI[57] = 0x14 ^ 1;
        x.llllIIlIlI[58] = 0x4A ^ 0x55 ^ (0xA9 ^ 0xA0);
        x.llllIIlIlI[59] = 0x25 ^ 3 ^ (0x95 ^ 0xAB);
        x.llllIIlIlI[60] = 0x95 ^ 0x8C;
        x.llllIIlIlI[61] = 0x70 ^ 0x6A;
        x.llllIIlIlI[62] = 0x84 ^ 0x9F;
        x.llllIIlIlI[63] = 0x11 ^ 0xD;
        x.llllIIlIlI[64] = 6 ^ 0x1B;
        x.llllIIlIlI[65] = 0xFFFFEFE1 & 0x3F3E;
        x.llllIIlIlI[66] = 0xE9 ^ 0xB0 ^ (0xE7 ^ 0xA0);
        x.llllIIlIlI[67] = 0x4C ^ 0x28 ^ (0x7E ^ 0x3A);
        x.llllIIlIlI[68] = 0x10 ^ 0x78 ^ (0x8C ^ 0xC5);
        x.llllIIlIlI[69] = 0x2F ^ 0xD;
        x.llllIIlIlI[70] = 0x84 ^ 0xBD ^ (0xAD ^ 0xB7);
        x.llllIIlIlI[71] = 0x61 ^ 0x5C ^ (0x7C ^ 0x65);
        x.llllIIlIlI[72] = 0x45 ^ 6 ^ (0xE6 ^ 0x80);
        x.llllIIlIlI[73] = 0x7B ^ 0xD ^ (0x90 ^ 0xC0);
        x.llllIIlIlI[74] = 0x26 ^ 0x48 ^ (0x70 ^ 0x39);
        x.llllIIlIlI[75] = 0x42 ^ 9 ^ (0x30 ^ 0x52);
        x.llllIIlIlI[76] = 0x1A ^ 0x3F ^ (0xB2 ^ 0xBD);
        x.llllIIlIlI[77] = 0x41 ^ 0x6A;
        x.llllIIlIlI[78] = 53 + 35 - -1 + 51 ^ 32 + 74 - 77 + 131;
        x.llllIIlIlI[79] = 122 + 7 - 6 + 54 ^ 85 + 38 - 103 + 136;
        x.llllIIlIlI[80] = 0x56 ^ 0x20 ^ (0xFB ^ 0xA3);
        x.llllIIlIlI[81] = 137 + 48 - 143 + 105 ^ 139 + 33 - 142 + 158;
        x.llllIIlIlI[82] = 0x13 ^ 0x23 ^ (0x86 ^ 0x89) & ~(0xCF ^ 0xC0);
        x.llllIIlIlI[83] = 0x73 ^ 0x42;
        x.llllIIlIlI[84] = 0x9B ^ 0xAB ^ 3;
        x.llllIIlIlI[85] = 0xC3 ^ 0xBB;
        x.llllIIlIlI[86] = 0xF8 ^ 0x89 ^ (0x5D ^ 0x18);
        x.llllIIlIlI[87] = 0x60 ^ 0x55;
        x.llllIIlIlI[88] = -(0xFFFFDD79 & 0x729E) & (0xFFFFDB7F & Short.MAX_VALUE);
        x.llllIIlIlI[89] = -(0xFFFFDD2D & 0x63FF) & (0xFFFFEFFE & 0x77ED);
        x.llllIIlIlI[90] = -(0xFFFFFFBF & 0x6841) & (0xFFFFFFBC & 0x6EFB);
        x.llllIIlIlI[91] = 0xFFFFAFFF & 0x7ECC;
        x.llllIIlIlI[92] = -(0xFFFF9F5E & 0x7CA9) & (0xFFFFFFFF & 0x7DAF);
        x.llllIIlIlI[93] = 0xFFFF977E & 0x6DF9;
        x.llllIIlIlI[94] = 112 + 166 - 134 + 26 ^ 68 + 106 - 149 + 131;
        x.llllIIlIlI[95] = 0x28 ^ 0x1F;
        x.llllIIlIlI[96] = 0x26 ^ 0x73 ^ (0xFE ^ 0x93);
        x.llllIIlIlI[97] = 120 + 9 - 14 + 39 ^ 28 + 71 - -21 + 43;
        x.llllIIlIlI[98] = -(0xFFFFEEED & 0x7137) & (0xFFFFFFFF & 0x6C7D);
        x.llllIIlIlI[99] = -(0xFFFFB8FE & 0x7717) & (0xFFFFBFFF & 0x7D37);
        x.llllIIlIlI[100] = 60 + 98 - 126 + 96;
        x.llllIIlIlI[101] = 0x3F ^ 3 ^ (0x10 ^ 0x4B);
        x.llllIIlIlI[102] = 0xFFFFDBFF & 0x2FBB;
        x.llllIIlIlI[103] = 0xFFFFCD3E & 0x3ECF;
        x.llllIIlIlI[104] = -(0xFFFFB7B9 & 0x5ACF) & (0xFFFFDFFF & 0x3FDF);
        x.llllIIlIlI[105] = 0xFFFFAC2D & 0x5FD6;
        x.llllIIlIlI[106] = 0xFFFFCD7F & 0x3FEE;
        x.llllIIlIlI[107] = -(0xFFFFF3BF & 0x7DED) & (0xFFFFFFBF & 0x7DFC);
        x.llllIIlIlI[108] = 0xFFFFDFF3 & 0x2D9C;
        x.llllIIlIlI[109] = 0xFFFFFFFE & 0xC9F;
        x.llllIIlIlI[110] = 0xFFFFBF77 & 0x4DCF;
        x.llllIIlIlI[111] = -(0xFFFFDF0F & 0x30F1) & (0xFFFFFBFF & 0x1F8D);
        x.llllIIlIlI[112] = 0xFFFFAFED & 0x5D3B;
        x.llllIIlIlI[113] = -(0xFFFFB9FD & 0x764B) & (0xFFFFFBFB & 0x3FFF);
        x.llllIIlIlI[114] = -(0xFFFFEE4F & 0x71FA) & (0xFFFFFDFF & 0x6FEF);
        x.llllIIlIlI[115] = 0xAE ^ 0x94;
        x.llllIIlIlI[116] = 0x20 ^ 0x15 ^ (0x89 ^ 0x87);
        x.llllIIlIlI[117] = 0x4D ^ 0x71;
        x.llllIIlIlI[118] = 0x78 ^ 0x45;
    }

    public static void bQ() {
        if (x.llIIllIlIIlll(bs ? 1 : 0)) {
            b.a(bu);
            if (x.llIIllIlIlIII(bu.size(), llllIIlIlI[5])) {
                System.out.println(llllIIlIIl[llllIIlIlI[4]]);
                bs = llllIIlIlI[4];
            }
        }
        if (x.llIIllIlIlIIl(bs ? 1 : 0)) {
            WorldArea lllllllllllllllllIlIllIlIlllIllI;
            if (x.llIIllIlIlIII(e.j(llllIIlIlI[7]), llllIIlIlI[8])) {
                C.cb();
            }
            if (x.llIIllIlIlIlI(e.j(llllIIlIlI[7]), llllIIlIlI[8]) && x.llIIllIlIlIII(e.H(), llllIIlIlI[9])) {
                System.out.println(llllIIlIIl[llllIIlIlI[5]]);
                AccBuilderTempleTrek.d = llllIIlIlI[5];
                return;
            }
            if (x.llIIllIlIlIIl(x.aa() ? 1 : 0) && x.llIIllIlIlIIl(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId())) && x.llIIllIlIlIlI(e.j(llllIIlIlI[7]), llllIIlIlI[8]) && x.llIIllIlIlIll(e.H(), llllIIlIlI[9])) {
                lllllllllllllllllIlIllIlIlllIllI = BankLocation.getNearest();
                if (x.llIIllIlIllII(lllllllllllllllllIlIllIlIlllIllI) && x.llIIllIlIlIIl(lllllllllllllllllIlIllIlIlllIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[6]];
                    a.a((BankLocation)lllllllllllllllllIlIllIlIlllIllI);
                }
                if (x.llIIllIlIllII(lllllllllllllllllIlIllIlIlllIllI) && x.llIIllIlIIlll(lllllllllllllllllIlIllIlIlllIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (x.llIIllIlIlIIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llllIIlIlI[10]);
                        0;
                    }
                    if (x.llIIllIlIIlll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[11]];
                        if (x.llIIllIlIllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llllIIlIlI[12]);
                            0;
                        }
                        if (x.llIIllIlIllIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llllIIlIlI[6]);
                            0;
                        }
                        int[] nArray = new int[llllIIlIlI[13]];
                        nArray[x.llllIIlIlI[4]] = llllIIlIlI[14];
                        nArray[x.llllIIlIlI[5]] = llllIIlIlI[15];
                        nArray[x.llllIIlIlI[6]] = llllIIlIlI[16];
                        nArray[x.llllIIlIlI[11]] = llllIIlIlI[17];
                        nArray[x.llllIIlIlI[12]] = llllIIlIlI[18];
                        nArray[x.llllIIlIlI[19]] = llllIIlIlI[20];
                        nArray[x.llllIIlIlI[21]] = llllIIlIlI[22];
                        nArray[x.llllIIlIlI[23]] = llllIIlIlI[24];
                        if (x.llIIllIlIlIIl(e.b(nArray) ? 1 : 0)) {
                            x.ae();
                            System.out.println(llllIIlIIl[llllIIlIlI[12]]);
                            bs = llllIIlIlI[5];
                            return;
                        }
                        int[] nArray2 = new int[llllIIlIlI[13]];
                        nArray2[x.llllIIlIlI[4]] = llllIIlIlI[14];
                        nArray2[x.llllIIlIlI[5]] = llllIIlIlI[15];
                        nArray2[x.llllIIlIlI[6]] = llllIIlIlI[16];
                        nArray2[x.llllIIlIlI[11]] = llllIIlIlI[17];
                        nArray2[x.llllIIlIlI[12]] = llllIIlIlI[18];
                        nArray2[x.llllIIlIlI[19]] = llllIIlIlI[20];
                        nArray2[x.llllIIlIlI[21]] = llllIIlIlI[22];
                        nArray2[x.llllIIlIlI[23]] = llllIIlIlI[24];
                        if (x.llIIllIlIIlll(e.b(nArray2) ? 1 : 0)) {
                            a.a(llllIIlIlI[14], llllIIlIlI[25]);
                            a.a(llllIIlIlI[22], llllIIlIlI[25]);
                            a.a(llllIIlIlI[15], llllIIlIlI[6]);
                            a.a(llllIIlIlI[16], llllIIlIlI[5]);
                            a.a(llllIIlIlI[17], llllIIlIlI[5]);
                            a.a(llllIIlIlI[18], llllIIlIlI[5]);
                            a.a(llllIIlIlI[24], llllIIlIlI[5]);
                            a.a(llllIIlIlI[20], llllIIlIlI[5]);
                            a.a(llllIIlIlI[26], llllIIlIlI[6]);
                            a.a(llllIIlIlI[27], llllIIlIlI[5]);
                            a.a(llllIIlIlI[28], llllIIlIlI[19]);
                            int[] nArray3 = new int[llllIIlIlI[5]];
                            nArray3[x.llllIIlIlI[4]] = llllIIlIlI[15];
                            if (x.llIIllIlIlIlI(Inventory.getAll((int[])nArray3).size(), llllIIlIlI[5])) {
                                a.a(llllIIlIlI[29], llllIIlIlI[6]);
                            }
                        }
                    }
                }
            }
            if (x.llIIllIlIIlll(Inventory.contains((int[])f.aU) ? 1 : 0) && x.llIIllIlIlIII(Movement.getRunEnergy(), llllIIlIlI[30])) {
                Inventory.getFirst((int[])f.aU).interact(llllIIlIIl[llllIIlIlI[19]]);
                Time.sleepTicks((int)llllIIlIlI[5]);
                0;
            }
            if (x.llIIllIlIlIII(Prayers.getPoints(), llllIIlIlI[31]) && x.llIIllIlIIlll(Inventory.contains((int[])f.aR) ? 1 : 0)) {
                Inventory.getFirst((int[])f.aR).interact(llllIIlIIl[llllIIlIlI[21]]);
                Time.sleepTicks((int)llllIIlIlI[6]);
                0;
            }
            if (x.llIIllIlIIlll(x.aa() ? 1 : 0) && x.llIIllIlIlIIl(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()))) {
                if (x.llIIllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gf), llllIIlIlI[19])) {
                    AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[23]];
                    if (x.llIIllIlIIlll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)gf);
                    0;
                    Time.sleepTicks((int)llllIIlIlI[5]);
                    0;
                }
                if (x.llIIllIlIllll(Players.getLocal().getWorldLocation().distanceTo(gf), llllIIlIlI[19])) {
                    AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[13]];
                    g.a(llllIIlIIl[llllIIlIlI[32]], bQ);
                }
            }
            if (!x.llIIllIllIIII(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[19]) || x.llIIllIlIlIlI(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[23])) {
                g.a(bQ);
            }
            if (x.llIIllIlIlIlI(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[25])) {
                if (!x.llIIllIlIlIll(Vars.getBit((int)llllIIlIlI[33]), llllIIlIlI[19]) || x.llIIllIlIlIlI(Vars.getBit((int)llllIIlIlI[33]), llllIIlIlI[34])) {
                    if (x.llIIllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gg), llllIIlIlI[5])) {
                        if (x.llIIllIlIllll(Players.getLocal().getWorldLocation().distanceTo(gh), llllIIlIlI[21])) {
                            String[] stringArray = new String[llllIIlIlI[5]];
                            stringArray[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[25]];
                            String[] stringArray2 = new String[llllIIlIlI[5]];
                            stringArray2[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[35]];
                            if (x.llIIllIlIIlll(TileObjects.getNearest((String[])stringArray).hasAction(stringArray2) ? 1 : 0)) {
                                String[] stringArray3 = new String[llllIIlIlI[5]];
                                stringArray3[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[36]];
                                TileObjects.getNearest((String[])stringArray3).interact(llllIIlIIl[llllIIlIlI[37]]);
                                Time.sleepTicks((int)llllIIlIlI[6]);
                                0;
                            }
                            String[] stringArray4 = new String[llllIIlIlI[5]];
                            stringArray4[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[38]];
                            String[] stringArray5 = new String[llllIIlIlI[5]];
                            stringArray5[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[34]];
                            if (x.llIIllIlIlIIl(TileObjects.getNearest((String[])stringArray4).hasAction(stringArray5) ? 1 : 0)) {
                                WorldArea worldArea = new WorldPoint[llllIIlIlI[19]];
                                worldArea[x.llllIIlIlI[4]] = new WorldPoint(llllIIlIlI[39], llllIIlIlI[40], llllIIlIlI[4]);
                                worldArea[x.llllIIlIlI[5]] = new WorldPoint(llllIIlIlI[41], llllIIlIlI[42], llllIIlIlI[4]);
                                worldArea[x.llllIIlIlI[6]] = new WorldPoint(llllIIlIlI[43], llllIIlIlI[44], llllIIlIlI[4]);
                                worldArea[x.llllIIlIlI[11]] = new WorldPoint(llllIIlIlI[45], llllIIlIlI[46], llllIIlIlI[4]);
                                worldArea[x.llllIIlIlI[12]] = new WorldPoint(llllIIlIlI[47], llllIIlIlI[48], llllIIlIlI[4]);
                                lllllllllllllllllIlIllIlIlllIllI = worldArea;
                                Walker.walkAlong(Arrays.asList(lllllllllllllllllIlIllIlIlllIllI), new HashMap());
                                0;
                                Time.sleepTicks((int)llllIIlIlI[5]);
                                0;
                            }
                        }
                        if (x.llIIllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gh), llllIIlIlI[21])) {
                            AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[9]];
                            Movement.walkTo((WorldPoint)gg);
                            0;
                            Time.sleepTicks((int)llllIIlIlI[5]);
                            0;
                        }
                    }
                    if (x.llIIllIlIllll(Players.getLocal().getWorldLocation().distanceTo(gg), llllIIlIlI[5])) {
                        if (x.llIIllIlIlIlI(Vars.getBit((int)llllIIlIlI[33]), llllIIlIlI[34]) && x.llIIllIlIllII(Widgets.get((int)llllIIlIlI[49], (int)llllIIlIlI[6])) && x.llIIllIlIlIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
                            Widgets.get((int)llllIIlIlI[49], (int)llllIIlIlI[6]).getChild(llllIIlIlI[50]).interact(llllIIlIIl[llllIIlIlI[51]]);
                            Time.sleepTicks((int)llllIIlIlI[6]);
                            0;
                        }
                        if (x.llIIllIlIlIII(Vars.getBit((int)llllIIlIlI[33]), llllIIlIlI[19])) {
                            AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[52]];
                            g.a(llllIIlIIl[llllIIlIlI[53]], bQ);
                        }
                    }
                }
                if (x.llIIllIlIlIlI(Vars.getBit((int)llllIIlIlI[33]), llllIIlIlI[19])) {
                    lllllllllllllllllIlIllIlIlllIllI = new WorldArea(llllIIlIlI[54], llllIIlIlI[40], llllIIlIlI[32], llllIIlIlI[25], llllIIlIlI[4]);
                    if (x.llIIllIlIlIIl(lllllllllllllllllIlIllIlIlllIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[55]];
                        if (x.llIIllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gh), llllIIlIlI[21])) {
                            Movement.walkTo((WorldPoint)new WorldPoint(llllIIlIlI[41], llllIIlIlI[56], llllIIlIlI[4]));
                            0;
                            Time.sleepTicks((int)llllIIlIlI[5]);
                            0;
                        }
                        if (x.llIIllIlIllll(Players.getLocal().getWorldLocation().distanceTo(gh), llllIIlIlI[21])) {
                            String[] stringArray = new String[llllIIlIlI[5]];
                            stringArray[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[57]];
                            String[] stringArray6 = new String[llllIIlIlI[5]];
                            stringArray6[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[58]];
                            if (x.llIIllIlIIlll(TileObjects.getNearest((String[])stringArray).hasAction(stringArray6) ? 1 : 0)) {
                                String[] stringArray7 = new String[llllIIlIlI[5]];
                                stringArray7[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[31]];
                                TileObjects.getNearest((String[])stringArray7).interact(llllIIlIIl[llllIIlIlI[59]]);
                                Time.sleepTicks((int)llllIIlIlI[6]);
                                0;
                            }
                            String[] stringArray8 = new String[llllIIlIlI[5]];
                            stringArray8[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[60]];
                            String[] stringArray9 = new String[llllIIlIlI[5]];
                            stringArray9[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[61]];
                            if (x.llIIllIlIlIIl(TileObjects.getNearest((String[])stringArray8).hasAction(stringArray9) ? 1 : 0)) {
                                g.a(llllIIlIIl[llllIIlIlI[62]], bQ);
                            }
                        }
                    }
                    if (x.llIIllIlIIlll(lllllllllllllllllIlIllIlIlllIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[63]];
                        g.a(llllIIlIIl[llllIIlIlI[64]], bQ);
                    }
                }
                if (x.llIIllIlIlIlI(Vars.getBit((int)llllIIlIlI[33]), llllIIlIlI[25])) {
                    g.a(bQ);
                }
            }
            if (x.llIIllIlIlIlI(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[34])) {
                ck = llllIIlIlI[4];
                if (x.llIIllIlIlIIl(Vars.getBit((int)llllIIlIlI[65]))) {
                    if (x.llIIllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gi), llllIIlIlI[19])) {
                        AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[66]];
                        Movement.walkTo((WorldPoint)gi);
                        0;
                        Time.sleepTicks((int)llllIIlIlI[5]);
                        0;
                    }
                    if (x.llIIllIlIllll(Players.getLocal().getWorldLocation().distanceTo(gi), llllIIlIlI[19])) {
                        AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[7]];
                        g.a(llllIIlIIl[llllIIlIlI[67]], bQ);
                    }
                }
                if (x.llIIllIlIlIlI(Vars.getBit((int)llllIIlIlI[65]), llllIIlIlI[19])) {
                    if (x.llIIllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gj), llllIIlIlI[21])) {
                        AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[68]];
                        Movement.walkTo((WorldPoint)gj);
                        0;
                        Time.sleepTicks((int)llllIIlIlI[5]);
                        0;
                    }
                    if (x.llIIllIlIllll(Players.getLocal().getWorldLocation().distanceTo(gj), llllIIlIlI[21])) {
                        AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[69]];
                        g.a(llllIIlIIl[llllIIlIlI[70]], bQ);
                    }
                }
                if (x.llIIllIlIlIlI(Vars.getBit((int)llllIIlIlI[65]), llllIIlIlI[25])) {
                    String[] stringArray = new String[llllIIlIlI[5]];
                    stringArray[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[71]];
                    if (x.llIIllIlIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray10 = new String[llllIIlIlI[5]];
                        stringArray10[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[72]];
                        String[] stringArray11 = new String[llllIIlIlI[5]];
                        stringArray11[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[73]];
                        Inventory.getFirst((String[])stringArray10).useOn(Inventory.getFirst((String[])stringArray11));
                        Time.sleepTicks((int)llllIIlIlI[5]);
                        0;
                    }
                    String[] stringArray12 = new String[llllIIlIlI[5]];
                    stringArray12[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[74]];
                    if (x.llIIllIlIIlll(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                        if (x.llIIllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gi), llllIIlIlI[19])) {
                            AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[50]];
                            Movement.walkTo((WorldPoint)gi);
                            0;
                            Time.sleepTicks((int)llllIIlIlI[5]);
                            0;
                        }
                        if (x.llIIllIlIllll(Players.getLocal().getWorldLocation().distanceTo(gi), llllIIlIlI[19])) {
                            AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[75]];
                            g.a(llllIIlIIl[llllIIlIlI[76]], bQ);
                        }
                    }
                }
                if (x.llIIllIlIlIlI(Vars.getBit((int)llllIIlIlI[65]), llllIIlIlI[70])) {
                    g.a(bQ);
                }
                if (x.llIIllIlIlIlI(Vars.getBit((int)llllIIlIlI[65]), llllIIlIlI[50])) {
                    if (x.llIIllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gk), llllIIlIlI[13])) {
                        AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[77]];
                        Movement.walkTo((WorldPoint)gk);
                        0;
                        Time.sleepTicks((int)llllIIlIlI[5]);
                        0;
                    }
                    if (x.llIIllIlIllll(Players.getLocal().getWorldLocation().distanceTo(gk), llllIIlIlI[13])) {
                        g.a(llllIIlIIl[llllIIlIlI[78]], bQ);
                    }
                }
                g.a(bQ);
            }
            if (x.llIIllIlIlIlI(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[55])) {
                if (x.llIIllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gl), llllIIlIlI[19])) {
                    AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[79]];
                    if (x.llIIllIlIIlll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)gl);
                    0;
                    Time.sleepTicks((int)llllIIlIlI[5]);
                    0;
                }
                if (x.llIIllIlIllll(Players.getLocal().getWorldLocation().distanceTo(gl), llllIIlIlI[19])) {
                    AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[80]];
                    g.a(llllIIlIIl[llllIIlIlI[81]], bQ);
                }
            }
            if (!x.llIIllIllIIII(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[60]) || !x.llIIllIllIIII(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[66]) || x.llIIllIlIlIlI(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[50])) {
                g.a(bQ);
            }
            if (x.llIIllIlIlIlI(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[70])) {
                g.a(bQ);
                int[] nArray = new int[llllIIlIlI[5]];
                nArray[x.llllIIlIlI[4]] = llllIIlIlI[27];
                if (x.llIIllIlIlIIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray4 = new int[llllIIlIlI[5]];
                    nArray4[x.llllIIlIlI[4]] = llllIIlIlI[27];
                    if (x.llIIllIlIIlll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[llllIIlIlI[5]];
                        nArray5[x.llllIIlIlI[4]] = llllIIlIlI[27];
                        Inventory.getFirst((int[])nArray5).interact(llllIIlIIl[llllIIlIlI[82]]);
                        Time.sleepTicks((int)llllIIlIlI[5]);
                        0;
                    }
                }
                if (x.llIIllIlIlIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0) && x.llIIllIlIlIll(Skills.getLevel((Skill)Skill.PRAYER), llllIIlIlI[77]) && x.llIIllIlIllIl(Prayers.getPoints())) {
                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                }
                if (x.llIIllIlIllII(lllllllllllllllllIlIllIlIlllIllI = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (x.llIIllIlIIlll(tileObject.getName().contains(llllIIlIIl[llllIIlIlI[96]]) ? 1 : 0)) {
                        String[] stringArray = new String[llllIIlIlI[5]];
                        stringArray[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[97]];
                        if (x.llIIllIlIIlll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                            n2 = llllIIlIlI[5];
                            0;
                            if (2 <= 2) return n2 != 0;
                            return ((0xD8 ^ 0xC4) & ~(0x62 ^ 0x7E)) != 0;
                        }
                    }
                    n2 = llllIIlIlI[4];
                    return n2 != 0;
                }))) {
                    AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[83]];
                    lllllllllllllllllIlIllIlIlllIllI.interact(llllIIlIIl[llllIIlIlI[30]]);
                    Time.sleepTicks((int)llllIIlIlI[12]);
                    0;
                }
                if (x.llIIllIllIIIl(x.llIIllIlIIllI(e.u(), 50.0))) {
                    int[] nArray6 = new int[llllIIlIlI[5]];
                    nArray6[x.llllIIlIlI[4]] = llllIIlIlI[28];
                    if (x.llIIllIlIIlll(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                        int[] nArray7 = new int[llllIIlIlI[5]];
                        nArray7[x.llllIIlIlI[4]] = llllIIlIlI[28];
                        Inventory.getFirst((int[])nArray7).interact(llllIIlIIl[llllIIlIlI[84]]);
                        Time.sleepTicks((int)llllIIlIlI[5]);
                        0;
                    }
                }
            }
            if (x.llIIllIlIlIlI(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[85]) && x.llIIllIlIlIIl(ge.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[86]];
                if (x.llIIllIlIlIII(ck, llllIIlIlI[5])) {
                    ac.nd += llllIIlIlI[5];
                    ac.d(AccBuilderTempleTrek.m);
                    ck += llllIIlIlI[5];
                    ac.nd = llllIIlIlI[4];
                    cl = llllIIlIlI[4];
                }
                int[] nArray = new int[llllIIlIlI[5]];
                nArray[x.llllIIlIlI[4]] = llllIIlIlI[14];
                if (x.llIIllIlIIlll(Inventory.contains((int[])nArray) ? 1 : 0) && x.llIIllIlIlIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
                    int[] nArray8 = new int[llllIIlIlI[5]];
                    nArray8[x.llllIIlIlI[4]] = llllIIlIlI[14];
                    Inventory.getFirst((int[])nArray8).interact(llllIIlIIl[llllIIlIlI[87]]);
                    Time.sleepTicks((int)llllIIlIlI[12]);
                    0;
                }
            }
            g.a(new String[llllIIlIlI[4]]);
        }
    }

    static {
        x.llIIllIlIIlIl();
        x.llIIllIlIIIll();
        ge = new WorldArea(llllIIlIlI[98], llllIIlIlI[99], llllIIlIlI[100], llllIIlIlI[101], llllIIlIlI[4]);
        bu = new ArrayList<d>();
        gf = new WorldPoint(llllIIlIlI[102], llllIIlIlI[56], llllIIlIlI[4]);
        gg = new WorldPoint(llllIIlIlI[103], llllIIlIlI[104], llllIIlIlI[4]);
        gh = new WorldPoint(llllIIlIlI[105], llllIIlIlI[106], llllIIlIlI[4]);
        gi = new WorldPoint(llllIIlIlI[107], llllIIlIlI[108], llllIIlIlI[4]);
        gj = new WorldPoint(llllIIlIlI[109], llllIIlIlI[110], llllIIlIlI[4]);
        gk = new WorldPoint(llllIIlIlI[111], llllIIlIlI[112], llllIIlIlI[4]);
        gl = new WorldPoint(llllIIlIlI[113], llllIIlIlI[114], llllIIlIlI[4]);
        String[] stringArray = new String[llllIIlIlI[11]];
        stringArray[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[115]];
        stringArray[x.llllIIlIlI[5]] = llllIIlIIl[llllIIlIlI[116]];
        stringArray[x.llllIIlIlI[6]] = llllIIlIIl[llllIIlIlI[117]];
        bQ = stringArray;
    }

    private static boolean llIIllIlIlllI(int n2, int n3) {
        return n2 > n3;
    }

    private static String llIIllIlIIIII(String lllllllllllllllllIlIllIlIlIlIIll, String lllllllllllllllllIlIllIlIlIlIIlI) {
        try {
            SecretKeySpec lllllllllllllllllIlIllIlIlIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIllIlIlIlIIlI.getBytes(StandardCharsets.UTF_8)), llllIIlIlI[13]), "DES");
            Cipher lllllllllllllllllIlIllIlIlIlIlIl = Cipher.getInstance("DES");
            lllllllllllllllllIlIllIlIlIlIlIl.init(llllIIlIlI[6], lllllllllllllllllIlIllIlIlIlIllI);
            return new String(lllllllllllllllllIlIllIlIlIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIllIlIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIllIlIlIlIlII) {
            lllllllllllllllllIlIllIlIlIlIlII.printStackTrace();
            return null;
        }
    }

    private static String llIIllIlIIIIl(String lllllllllllllllllIlIllIlIlIllllI, String lllllllllllllllllIlIllIlIlIlllll) {
        try {
            SecretKeySpec lllllllllllllllllIlIllIlIllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIllIlIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIllIlIllIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIllIlIllIIIlI.init(llllIIlIlI[6], lllllllllllllllllIlIllIlIllIIIll);
            return new String(lllllllllllllllllIlIllIlIllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIllIlIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIllIlIllIIIIl) {
            lllllllllllllllllIlIllIlIllIIIIl.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean S() {
        return llllIIlIlI[4];
    }

    private static boolean llIIllIlIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIllIlIllIl(int n2) {
        return n2 > 0;
    }

    private static int llIIllIlIIllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static void llIIllIlIIIll() {
        llllIIlIIl = new String[llllIIlIlI[118]];
        x.llllIIlIIl[x.llllIIlIlI[4]] = x."Finished buying items, switching back to quest";
        x.llllIIlIIl[x.llllIIlIlI[5]] = x."Need 16 QP";
        x.llllIIlIIl[x.llllIIlIlI[6]] = x."Nav to bank";
        x.llllIIlIIl[x.llllIIlIlI[11]] = x."Handling banking";
        x.llllIIlIIl[x.llllIIlIlI[12]] = x."We are missing quest supplies, switching to BUYING";
        x.llllIIlIIl[x.llllIIlIlI[19]] = x."Drink";
        x.llllIIlIIl[x.llllIIlIlI[21]] = x."Drink";
        x.llllIIlIIl[x.llllIIlIlI[23]] = x."Nav to start";
        x.llllIIlIIl[x.llllIIlIlI[13]] = x."Starting quest";
        x.llllIIlIIl[x.llllIIlIlI[32]] = x."Willow";
        x.llllIIlIIl[x.llllIIlIlI[25]] = x."Longhall door";
        x.llllIIlIIl[x.llllIIlIlI[35]] = x."Open";
        x.llllIIlIIl[x.llllIIlIlI[36]] = x."Longhall door";
        x.llllIIlIIl[x.llllIIlIlI[37]] = x."Open";
        x.llllIIlIIl[x.llllIIlIlI[38]] = x."Longhall door";
        x.llllIIlIIl[x.llllIIlIlI[34]] = x."Open";
        x.llllIIlIIl[x.llllIIlIlI[9]] = x."Nav to checkal";
        x.llllIIlIIl[x.llllIIlIlI[51]] = x."Perform";
        x.llllIIlIIl[x.llllIIlIlI[52]] = x."talk";
        x.llllIIlIIl[x.llllIIlIlI[53]] = x."Checkal";
        x.llllIIlIIl[x.llllIIlIlI[55]] = x."Nav to atlas";
        x.llllIIlIIl[x.llllIIlIlI[57]] = x."Longhall door";
        x.llllIIlIIl[x.llllIIlIlI[58]] = x."Open";
        x.llllIIlIIl[x.llllIIlIlI[31]] = x."Longhall door";
        x.llllIIlIIl[x.llllIIlIlI[59]] = x."Open";
        x.llllIIlIIl[x.llllIIlIlI[60]] = x."Longhall door";
        x.llllIIlIIl[x.llllIIlIlI[61]] = x."Open";
        x.llllIIlIIl[x.llllIIlIlI[62]] = x."Atlas";
        x.llllIIlIIl[x.llllIIlIlI[63]] = x."talk";
        x.llllIIlIIl[x.llllIIlIlI[64]] = x."Atlas";
        x.llllIIlIIl[x.llllIIlIlI[66]] = x."Nav to marley";
        x.llllIIlIIl[x.llllIIlIlI[7]] = x."Talk";
        x.llllIIlIIl[x.llllIIlIlI[67]] = x."Marley";
        x.llllIIlIIl[x.llllIIlIlI[68]] = x."Nav to cook";
        x.llllIIlIIl[x.llllIIlIlI[69]] = x."talk";
        x.llllIIlIIl[x.llllIIlIlI[70]] = x."Cook";
        x.llllIIlIIl[x.llllIIlIlI[71]] = x."Steak sandwich";
        x.llllIIlIIl[x.llllIIlIlI[72]] = x."Knife";
        x.llllIIlIIl[x.llllIIlIlI[73]] = x."Bread";
        x.llllIIlIIl[x.llllIIlIlI[74]] = x."Steak sandwich";
        x.llllIIlIIl[x.llllIIlIlI[50]] = x."Nav to marley";
        x.llllIIlIIl[x.llllIIlIlI[75]] = x."Talk";
        x.llllIIlIIl[x.llllIIlIlI[76]] = x."Marley";
        x.llllIIlIIl[x.llllIIlIlI[77]] = x."Nav to burntof";
        x.llllIIlIIl[x.llllIIlIlI[78]] = x."Burntof";
        x.llllIIlIIl[x.llllIIlIlI[79]] = x."Nav to dungeon";
        x.llllIIlIIl[x.llllIIlIlI[80]] = x."Starting quest";
        x.llllIIlIIl[x.llllIIlIlI[81]] = x."Willow";
        x.llllIIlIIl[x.llllIIlIlI[82]] = x."Wield";
        x.llllIIlIIl[x.llllIIlIlI[83]] = x."Mining pillars";
        x.llllIIlIIl[x.llllIIlIlI[30]] = x."Mine";
        x.llllIIlIIl[x.llllIIlIlI[84]] = x."Eat";
        x.llllIIlIIl[x.llllIIlIlI[86]] = x."Tele to varrock";
        x.llllIIlIIl[x.llllIIlIlI[87]] = x."Break";
        x.llllIIlIIl[x.llllIIlIlI[94]] = x."Below Ice Mountain";
        x.llllIIlIIl[x.llllIIlIlI[95]] = x."ring of wealth (";
        x.llllIIlIIl[x.llllIIlIlI[96]] = x."pillar";
        x.llllIIlIIl[x.llllIIlIlI[97]] = x."Mine";
        x.llllIIlIIl[x.llllIIlIlI[115]] = x."Yes.";
        x.llllIIlIIl[x.llllIIlIlI[116]] = x."I was wondering if you'd be able to make me a Steak sandwich?";
        x.llllIIlIIl[x.llllIIlIlI[117]] = x."Rock.";
    }

    private static boolean llIIllIllIIIl(int n2) {
        return n2 < 0;
    }

    @Override
    public boolean V() {
        int n2;
        if (!(!x.llIIllIlIlIlI(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[85]) || x.llIIllIlIlIIl(ge.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && x.llIIllIlIlIIl(this.gm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && x.llIIllIlIlIIl(this.gn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !x.llIIllIlIIlll(this.go.contains(Players.getLocal().getWorldLocation()) ? 1 : 0))) {
            n2 = llllIIlIlI[5];
            0;
            if (((0x16 ^ 0x58) & ~(0x45 ^ 0xB)) >= 1) {
                return ((0x2E ^ 0x4F) & ~(0x2A ^ 0x4B)) != 0;
            }
        } else {
            n2 = llllIIlIlI[4];
        }
        return n2 != 0;
    }

    @Override
    public String U() {
        return llllIIlIIl[llllIIlIlI[94]];
    }

    @Override
    public int T() {
        try {
            x.bQ();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0x3E ^ 0x3A) <= 2) {
            return (0xAB ^ 0xB1) & ~(0x4F ^ 0x55);
        }
        return llllIIlIlI[8];
    }

    private static void ae() {
        block12: {
            d lllllllllllllllllIlIllIlIllIlllI;
            block11: {
                Object lllllllllllllllllIlIllIlIllIllll;
                int[] nArray = new int[llllIIlIlI[5]];
                nArray[x.llllIIlIlI[4]] = llllIIlIlI[18];
                if (x.llIIllIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(llllIIlIlI[18], llllIIlIlI[5], llllIIlIlI[88]);
                    bu.add(d2);
                    0;
                }
                int[] nArray2 = new int[llllIIlIlI[5]];
                nArray2[x.llllIIlIlI[4]] = llllIIlIlI[24];
                if (x.llIIllIlIlIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lllllllllllllllllIlIllIlIllIllll = new d(llllIIlIlI[24], llllIIlIlI[5], llllIIlIlI[88]);
                    bu.add((d)lllllllllllllllllIlIllIlIllIllll);
                    0;
                }
                int[] nArray3 = new int[llllIIlIlI[5]];
                nArray3[x.llllIIlIlI[4]] = llllIIlIlI[16];
                if (x.llIIllIlIlIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    lllllllllllllllllIlIllIlIllIllll = new d(llllIIlIlI[16], llllIIlIlI[5], llllIIlIlI[88]);
                    bu.add((d)lllllllllllllllllIlIllIlIllIllll);
                    0;
                }
                int[] nArray4 = new int[llllIIlIlI[5]];
                nArray4[x.llllIIlIlI[4]] = llllIIlIlI[20];
                if (x.llIIllIlIlIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    lllllllllllllllllIlIllIlIllIllll = new d(llllIIlIlI[20], llllIIlIlI[5], llllIIlIlI[89]);
                    bu.add((d)lllllllllllllllllIlIllIlIllIllll);
                    0;
                }
                int[] nArray5 = new int[llllIIlIlI[5]];
                nArray5[x.llllIIlIlI[4]] = llllIIlIlI[17];
                if (x.llIIllIlIlIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    lllllllllllllllllIlIllIlIllIllll = new d(llllIIlIlI[17], llllIIlIlI[5], llllIIlIlI[89]);
                    bu.add((d)lllllllllllllllllIlIllIlIllIllll);
                    0;
                }
                int[] nArray6 = new int[llllIIlIlI[5]];
                nArray6[x.llllIIlIlI[4]] = llllIIlIlI[22];
                if (x.llIIllIlIlIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                    lllllllllllllllllIlIllIlIllIllll = new d(llllIIlIlI[22], llllIIlIlI[25], llllIIlIlI[90]);
                    bu.add((d)lllllllllllllllllIlIllIlIllIllll);
                    0;
                }
                if (x.llIIllIlIlIIl(Bank.contains((Predicate)(lllllllllllllllllIlIllIlIllIllll = item -> item.getName().toLowerCase().contains(llllIIlIIl[llllIIlIlI[95]]))) ? 1 : 0)) {
                    lllllllllllllllllIlIllIlIllIlllI = new d(llllIIlIlI[91], llllIIlIlI[19], llllIIlIlI[92]);
                    bu.add(lllllllllllllllllIlIllIlIllIlllI);
                    0;
                }
                int[] nArray7 = new int[llllIIlIlI[5]];
                nArray7[x.llllIIlIlI[4]] = llllIIlIlI[15];
                if (x.llIIllIlIlIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    lllllllllllllllllIlIllIlIllIlllI = new d(llllIIlIlI[15], llllIIlIlI[12], i.bp);
                    bu.add(lllllllllllllllllIlIllIlIllIlllI);
                    0;
                }
                int[] nArray8 = new int[llllIIlIlI[5]];
                nArray8[x.llllIIlIlI[4]] = llllIIlIlI[14];
                if (!x.llIIllIlIIlll(Bank.contains((int[])nArray8) ? 1 : 0)) break block11;
                int[] nArray9 = new int[llllIIlIlI[5]];
                nArray9[x.llllIIlIlI[4]] = llllIIlIlI[14];
                if (!x.llIIllIlIIlll(Bank.contains((int[])nArray9) ? 1 : 0)) break block12;
                int[] nArray10 = new int[llllIIlIlI[5]];
                nArray10[x.llllIIlIlI[4]] = llllIIlIlI[14];
                if (!x.llIIllIlIlIII(Bank.getFirst((int[])nArray10).getQuantity(), llllIIlIlI[34])) break block12;
            }
            lllllllllllllllllIlIllIlIllIlllI = new d(llllIIlIlI[14], llllIIlIlI[50], llllIIlIlI[93]);
            bu.add(lllllllllllllllllIlIllIlIllIlllI);
            0;
        }
    }

    private static String llIIllIlIIIlI(String lllllllllllllllllIlIllIlIlIIIIll, String lllllllllllllllllIlIllIlIlIIIIlI) {
        lllllllllllllllllIlIllIlIlIIIIll = new String(Base64.getDecoder().decode(lllllllllllllllllIlIllIlIlIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIllIlIlIIIIIl = new StringBuilder();
        char[] lllllllllllllllllIlIllIlIlIIIIII = lllllllllllllllllIlIllIlIlIIIIlI.toCharArray();
        int lllllllllllllllllIlIllIlIIllllll = llllIIlIlI[4];
        char[] lllllllllllllllllIlIllIlIIlllIIl = lllllllllllllllllIlIllIlIlIIIIll.toCharArray();
        int lllllllllllllllllIlIllIlIIlllIII = lllllllllllllllllIlIllIlIIlllIIl.length;
        int lllllllllllllllllIlIllIlIIllIlll = llllIIlIlI[4];
        while (x.llIIllIlIlIII(lllllllllllllllllIlIllIlIIllIlll, lllllllllllllllllIlIllIlIIlllIII)) {
            char lllllllllllllllllIlIllIlIlIIIlII = lllllllllllllllllIlIllIlIIlllIIl[lllllllllllllllllIlIllIlIIllIlll];
            lllllllllllllllllIlIllIlIlIIIIIl.append((char)(lllllllllllllllllIlIllIlIlIIIlII ^ lllllllllllllllllIlIllIlIlIIIIII[lllllllllllllllllIlIllIlIIllllll % lllllllllllllllllIlIllIlIlIIIIII.length]));
            0;
            ++lllllllllllllllllIlIllIlIIllllll;
            ++lllllllllllllllllIlIllIlIIllIlll;
            0;
            if ((0xF ^ 0xB) > 3) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIlIllIlIlIIIIIl);
    }

    private static boolean llIIllIlIlIIl(int n2) {
        return n2 == 0;
    }
}

