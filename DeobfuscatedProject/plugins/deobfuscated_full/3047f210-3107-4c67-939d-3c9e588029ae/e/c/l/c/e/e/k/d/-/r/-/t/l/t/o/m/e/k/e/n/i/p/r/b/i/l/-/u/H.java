/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
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
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class H
implements S {
    static /* synthetic */ int hw;
    public static /* synthetic */ WorldPoint dv;
    public static /* synthetic */ boolean bs;
    static final /* synthetic */ int hp;
    static /* synthetic */ boolean cl;
    public static /* synthetic */ WorldPoint hq;
    static /* synthetic */ String[] bQ;
    private static /* synthetic */ int[] lIIIIIIllIl;
    private static /* synthetic */ String[] lIIIIIIlIlI;
    public static /* synthetic */ WorldPoint hs;
    public static /* synthetic */ WorldPoint hr;
    static /* synthetic */ int hu;
    public static /* synthetic */ List<d> bu;
    public static /* synthetic */ WorldPoint ht;
    static /* synthetic */ WorldArea hy;
    static /* synthetic */ WorldPoint[] hx;
    static /* synthetic */ int ck;
    static /* synthetic */ int hv;

    private static boolean llIlllIIIllll(Object object) {
        return object != null;
    }

    @Override
    public boolean S() {
        return lIIIIIIllIl[1];
    }

    private static boolean llIlllIIIllIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIlllIIlIlII(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public String U() {
        return lIIIIIIlIlI[lIIIIIIllIl[64]];
    }

    private static boolean llIlllIIIlIll(int n2) {
        return n2 != 0;
    }

    private static boolean llIlllIIIlllI(int n2, int n3) {
        return n2 == n3;
    }

    private static String llIllIllllIII(String var1, String var4) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lIIIIIIllIl[6], var15);
            return new String(var8.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static String llIllIllllIIl(String var13, String var2) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var24 = new StringBuilder();
        char[] var5 = var2.toCharArray();
        int var12 = lIIIIIIllIl[1];
        char[] var7 = var13.toCharArray();
        int var22 = var7.length;
        int var3 = lIIIIIIllIl[1];
        while (H.llIlllIIIllII(var3, var22)) {
            char var10 = var7[var3];
            var24.append((char)(var10 ^ var5[var12 % var5.length]));
            0;
            ++var12;
            ++var3;
            0;
            if (((6 ^ 1) & ~(0x6C ^ 0x6B)) == 0) continue;
            return null;
        }
        return String.valueOf(var24);
    }

    private static int llIlllIIIlIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aa() {
        int n2;
        int[] nArray = new int[lIIIIIIllIl[0]];
        nArray[H.lIIIIIIllIl[1]] = lIIIIIIllIl[13];
        if (H.llIlllIIlIIII(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[lIIIIIIllIl[0]];
            nArray2[H.lIIIIIIllIl[1]] = lIIIIIIllIl[14];
            if (H.llIlllIIlIIII(Inventory.getCount((int[])nArray2))) {
                int[] nArray3 = new int[lIIIIIIllIl[0]];
                nArray3[H.lIIIIIIllIl[1]] = lIIIIIIllIl[8];
                if (H.llIlllIIlIlIl(Inventory.getCount((int[])nArray3), lIIIIIIllIl[6])) {
                    int[] nArray4 = new int[lIIIIIIllIl[0]];
                    nArray4[H.lIIIIIIllIl[1]] = lIIIIIIllIl[11];
                    if (H.llIlllIIlIIII(Inventory.getCount((int[])nArray4))) {
                        int[] nArray5 = new int[lIIIIIIllIl[0]];
                        nArray5[H.lIIIIIIllIl[1]] = lIIIIIIllIl[12];
                        if (H.llIlllIIlIIII(Inventory.getCount((int[])nArray5))) {
                            int[] nArray6 = new int[lIIIIIIllIl[0]];
                            nArray6[H.lIIIIIIllIl[1]] = lIIIIIIllIl[16];
                            if (H.llIlllIIlIIII(Inventory.getCount((int[])nArray6)) && H.llIlllIIlIIII(Inventory.getCount((int[])f.aU))) {
                                n2 = lIIIIIIllIl[0];
                                0;
                                if (((180 + 35 - 27 + 16 ^ 161 + 63 - 60 + 34) & (0x62 ^ 0x17 ^ 71 + 26 - 39 + 69 ^ -1)) == 0) return n2 != 0;
                                return ((0x58 ^ 0x7E ^ (5 ^ 3)) & (73 + 87 - 69 + 60 ^ 99 + 71 - 160 + 173 ^ -1)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIIIIIllIl[1];
        return n2 != 0;
    }

    static {
        H.llIlllIIIlIIl();
        H.llIlllIIIlIII();
        hp = lIIIIIIllIl[4];
        bu = new ArrayList<d>();
        dv = new WorldPoint(lIIIIIIllIl[66], lIIIIIIllIl[67], lIIIIIIllIl[1]);
        hq = new WorldPoint(lIIIIIIllIl[68], lIIIIIIllIl[69], lIIIIIIllIl[1]);
        hr = new WorldPoint(lIIIIIIllIl[70], lIIIIIIllIl[71], lIIIIIIllIl[1]);
        hs = new WorldPoint(lIIIIIIllIl[72], lIIIIIIllIl[73], lIIIIIIllIl[1]);
        ht = new WorldPoint(lIIIIIIllIl[74], lIIIIIIllIl[75], lIIIIIIllIl[6]);
        hu = lIIIIIIllIl[76];
        hv = lIIIIIIllIl[77];
        hw = lIIIIIIllIl[41];
        String[] stringArray = new String[lIIIIIIllIl[23]];
        stringArray[H.lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[78]];
        stringArray[H.lIIIIIIllIl[0]] = lIIIIIIlIlI[lIIIIIIllIl[79]];
        stringArray[H.lIIIIIIllIl[6]] = lIIIIIIlIlI[lIIIIIIllIl[80]];
        stringArray[H.lIIIIIIllIl[9]] = lIIIIIIlIlI[lIIIIIIllIl[20]];
        stringArray[H.lIIIIIIllIl[7]] = lIIIIIIlIlI[lIIIIIIllIl[81]];
        stringArray[H.lIIIIIIllIl[15]] = lIIIIIIlIlI[lIIIIIIllIl[82]];
        stringArray[H.lIIIIIIllIl[17]] = lIIIIIIlIlI[lIIIIIIllIl[83]];
        stringArray[H.lIIIIIIllIl[10]] = lIIIIIIlIlI[lIIIIIIllIl[84]];
        stringArray[H.lIIIIIIllIl[21]] = lIIIIIIlIlI[lIIIIIIllIl[85]];
        stringArray[H.lIIIIIIllIl[22]] = lIIIIIIlIlI[lIIIIIIllIl[86]];
        stringArray[H.lIIIIIIllIl[19]] = lIIIIIIlIlI[lIIIIIIllIl[87]];
        bQ = stringArray;
        WorldPoint[] worldPointArray = new WorldPoint[lIIIIIIllIl[26]];
        worldPointArray[H.lIIIIIIllIl[1]] = new WorldPoint(lIIIIIIllIl[88], lIIIIIIllIl[89], lIIIIIIllIl[1]);
        worldPointArray[H.lIIIIIIllIl[0]] = new WorldPoint(lIIIIIIllIl[90], lIIIIIIllIl[91], lIIIIIIllIl[1]);
        worldPointArray[H.lIIIIIIllIl[6]] = new WorldPoint(lIIIIIIllIl[92], lIIIIIIllIl[93], lIIIIIIllIl[1]);
        worldPointArray[H.lIIIIIIllIl[9]] = new WorldPoint(lIIIIIIllIl[94], lIIIIIIllIl[95], lIIIIIIllIl[1]);
        worldPointArray[H.lIIIIIIllIl[7]] = new WorldPoint(lIIIIIIllIl[96], lIIIIIIllIl[97], lIIIIIIllIl[1]);
        worldPointArray[H.lIIIIIIllIl[15]] = new WorldPoint(lIIIIIIllIl[98], lIIIIIIllIl[99], lIIIIIIllIl[1]);
        worldPointArray[H.lIIIIIIllIl[17]] = new WorldPoint(lIIIIIIllIl[100], lIIIIIIllIl[101], lIIIIIIllIl[1]);
        worldPointArray[H.lIIIIIIllIl[10]] = new WorldPoint(lIIIIIIllIl[102], lIIIIIIllIl[103], lIIIIIIllIl[1]);
        worldPointArray[H.lIIIIIIllIl[21]] = new WorldPoint(lIIIIIIllIl[104], lIIIIIIllIl[105], lIIIIIIllIl[1]);
        worldPointArray[H.lIIIIIIllIl[22]] = new WorldPoint(lIIIIIIllIl[106], lIIIIIIllIl[107], lIIIIIIllIl[1]);
        worldPointArray[H.lIIIIIIllIl[19]] = new WorldPoint(lIIIIIIllIl[106], lIIIIIIllIl[108], lIIIIIIllIl[1]);
        worldPointArray[H.lIIIIIIllIl[23]] = new WorldPoint(lIIIIIIllIl[104], lIIIIIIllIl[109], lIIIIIIllIl[1]);
        worldPointArray[H.lIIIIIIllIl[24]] = new WorldPoint(lIIIIIIllIl[104], lIIIIIIllIl[110], lIIIIIIllIl[1]);
        worldPointArray[H.lIIIIIIllIl[25]] = new WorldPoint(lIIIIIIllIl[111], lIIIIIIllIl[112], lIIIIIIllIl[1]);
        hx = worldPointArray;
        hy = new WorldArea(lIIIIIIllIl[113], lIIIIIIllIl[114], lIIIIIIllIl[115], lIIIIIIllIl[116], lIIIIIIllIl[1]);
    }

    private static boolean llIlllIIlIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static void llIlllIIIlIIl() {
        lIIIIIIllIl = new int[118];
        H.lIIIIIIllIl[0] = 1;
        H.lIIIIIIllIl[1] = (0x78 ^ 0x71) & ~(0xBC ^ 0xB5);
        H.lIIIIIIllIl[2] = 0xBF ^ 0xA0;
        H.lIIIIIIllIl[3] = 0xFE ^ 0x9A;
        H.lIIIIIIllIl[4] = 80 + 68 - -35 + 57 ^ 36 + 61 - -36 + 5;
        H.lIIIIIIllIl[5] = 0xFFFF9B8E & 0x77F9;
        H.lIIIIIIllIl[6] = 2;
        H.lIIIIIIllIl[7] = 0x20 ^ 0x24;
        H.lIIIIIIllIl[8] = -(0xFFFFBDC5 & 0x56BB) & (0xFFFF9FBF & 0x7DEF);
        H.lIIIIIIllIl[9] = 3;
        H.lIIIIIIllIl[10] = 5 ^ 0x21 ^ (0x33 ^ 0x10);
        H.lIIIIIIllIl[11] = -(0xFFFFEDED & 0x3233) & (0xFFFFFFF7 & 0x3F6F);
        H.lIIIIIIllIl[12] = -(0xFFFFF88F & 0x47F7) & (0xFFFFFFCF & 0x5FFF);
        H.lIIIIIIllIl[13] = 0xFFFF8D7D & 0x7B97;
        H.lIIIIIIllIl[14] = -(0xFFFFFB39 & 0x3CCF) & (0xFFFFBDFB & 0x7EFD);
        H.lIIIIIIllIl[15] = 1 ^ 4;
        H.lIIIIIIllIl[16] = 0xFFFFFFFF & 0x181;
        H.lIIIIIIllIl[17] = 0x64 ^ 0x62;
        H.lIIIIIIllIl[18] = -(112 + 1 - 100 + 122) & (0xFFFFF9D7 & 0x37FF);
        H.lIIIIIIllIl[19] = 0x33 ^ 0x39;
        H.lIIIIIIllIl[20] = 101 + 117 - 217 + 141 ^ 105 + 22 - -35 + 26;
        H.lIIIIIIllIl[21] = 0x45 ^ 0x4F ^ 2;
        H.lIIIIIIllIl[22] = 6 ^ 0xF;
        H.lIIIIIIllIl[23] = 32 + 106 - -1 + 66 ^ 184 + 130 - 255 + 139;
        H.lIIIIIIllIl[24] = 0xB1 ^ 0xBD;
        H.lIIIIIIllIl[25] = 0x6D ^ 0x60;
        H.lIIIIIIllIl[26] = 0x39 ^ 0x37;
        H.lIIIIIIllIl[27] = 0xE1 ^ 0xC1 ^ (0xAB ^ 0x84);
        H.lIIIIIIllIl[28] = 0xB5 ^ 0xA5;
        H.lIIIIIIllIl[29] = 0x35 ^ 0x24;
        H.lIIIIIIllIl[30] = 155 + 41 - 195 + 171 ^ 152 + 33 - 64 + 69;
        H.lIIIIIIllIl[31] = 0x1A ^ 9;
        H.lIIIIIIllIl[32] = 3 ^ 0x17;
        H.lIIIIIIllIl[33] = 0x12 ^ 7;
        H.lIIIIIIllIl[34] = 0xD3 ^ 0xC5;
        H.lIIIIIIllIl[35] = 163 + 85 - 134 + 71 ^ 138 + 138 - 122 + 20;
        H.lIIIIIIllIl[36] = 0xEB ^ 0xBE ^ (0x7E ^ 0x33);
        H.lIIIIIIllIl[37] = 0x95 ^ 0xBC ^ (0x95 ^ 0xA5);
        H.lIIIIIIllIl[38] = -(0xFFFFF4DD & 0x2B2F) & (0xFFFFEBBF & 0x3FEF);
        H.lIIIIIIllIl[39] = 0xFFFF9F97 & 0x6D6D;
        H.lIIIIIIllIl[40] = 0x84 ^ 0xC1 ^ (0xD6 ^ 0x89);
        H.lIIIIIIllIl[41] = -(0xFFFFDBF9 & 0x3727) & (0xFFFFFBFF & 0x1FFF);
        H.lIIIIIIllIl[42] = 0xBE ^ 0xA5;
        H.lIIIIIIllIl[43] = 102 + 94 - 121 + 99 ^ 76 + 80 - 151 + 173;
        H.lIIIIIIllIl[44] = 0xFFFFDAE5 & 0x2DFA;
        H.lIIIIIIllIl[45] = 0x8F ^ 0x84 ^ (0x2B ^ 0x3D);
        H.lIIIIIIllIl[46] = 0x16 ^ 8;
        H.lIIIIIIllIl[47] = 0xC0 ^ 0x8B ^ (0x31 ^ 0x5A);
        H.lIIIIIIllIl[48] = 0xE7 ^ 0xC6;
        H.lIIIIIIllIl[49] = 0xAE ^ 0x8C;
        H.lIIIIIIllIl[50] = 0x88 ^ 0xAB;
        H.lIIIIIIllIl[51] = 0x26 ^ 2;
        H.lIIIIIIllIl[52] = 0x2A ^ 0x79 ^ (0x57 ^ 0x21);
        H.lIIIIIIllIl[53] = 83 + 85 - 130 + 92 ^ 27 + 32 - -18 + 87;
        H.lIIIIIIllIl[54] = 0x31 ^ 0x16;
        H.lIIIIIIllIl[55] = 115 + 96 - 114 + 63 ^ 2 + 112 - 54 + 76;
        H.lIIIIIIllIl[56] = 0x7B ^ 0x3E ^ (0x73 ^ 0x1F);
        H.lIIIIIIllIl[57] = 0x26 ^ 0xC;
        H.lIIIIIIllIl[58] = 0x10 ^ 0x3B;
        H.lIIIIIIllIl[59] = 0x88 ^ 0xA4;
        H.lIIIIIIllIl[60] = -(0xFFFFBBF5 & 0x5E0B) & (0xFFFFBFDF & 0x5FFC);
        H.lIIIIIIllIl[61] = 0xFFFFF38E & 0xFF5;
        H.lIIIIIIllIl[62] = -(0xFFFFCF6B & 0x71B7) & (0xFFFFEFFE & 0x7FEF);
        H.lIIIIIIllIl[63] = 0xFFFFF3E9 & 0x6DBE;
        H.lIIIIIIllIl[64] = 176 + 116 - 145 + 42 ^ 38 + 120 - 44 + 30;
        H.lIIIIIIllIl[65] = 0x84 ^ 0xAA;
        H.lIIIIIIllIl[66] = -(0xFFFFF4FD & 0x3B43) & (0xFFFFBBDF & Short.MAX_VALUE);
        H.lIIIIIIllIl[67] = -(0xFFFFC1FB & 0x7EF7) & (0xFFFFCDFF & Short.MAX_VALUE);
        H.lIIIIIIllIl[68] = 0xFFFFCCEB & 0x3F9E;
        H.lIIIIIIllIl[69] = 0xFFFFAFA7 & 0x5DFF;
        H.lIIIIIIllIl[70] = -(0xFFFFB49A & 0x7F6F) & (0xFFFFFFBF & 0x3FFF);
        H.lIIIIIIllIl[71] = 0xFFFF9ECD & 0x6D7B;
        H.lIIIIIIllIl[72] = -(0xFFFFFEBF & 0x6145) & (0xFFFFEBEF & Short.MAX_VALUE);
        H.lIIIIIIllIl[73] = -(0xFFFFAB9F & 0x5EEF) & (0xFFFFBFEF & 0x6FFE);
        H.lIIIIIIllIl[74] = -(0xFFFFF5D3 & 0x6E2D) & (0xFFFFFFA8 & 0x6FFF);
        H.lIIIIIIllIl[75] = -(0xFFFFEB5F & 0x74E1) & (0xFFFFED47 & Short.MAX_VALUE);
        H.lIIIIIIllIl[76] = 0xFFFFFF76 & 0x2CFB;
        H.lIIIIIIllIl[77] = -(0xFFFFCD5F & 0x7EE1) & (0xFFFFDFDC & 0x6EFF);
        H.lIIIIIIllIl[78] = 0x59 ^ 0x30 ^ (0xE2 ^ 0xA4);
        H.lIIIIIIllIl[79] = 0x7F ^ 0x4F;
        H.lIIIIIIllIl[80] = 0x12 ^ 0x23;
        H.lIIIIIIllIl[81] = 78 + 8 - 17 + 71 ^ 10 + 153 - 65 + 93;
        H.lIIIIIIllIl[82] = 0x3C ^ 8;
        H.lIIIIIIllIl[83] = 0x80 ^ 0xB2 ^ (0x4A ^ 0x4D);
        H.lIIIIIIllIl[84] = 0xB5 ^ 0x83;
        H.lIIIIIIllIl[85] = 0x3A ^ 0x22 ^ (0xB3 ^ 0x9C);
        H.lIIIIIIllIl[86] = 0xB2 ^ 0x8A;
        H.lIIIIIIllIl[87] = 0xFC ^ 0xA6 ^ (0xC5 ^ 0xA6);
        H.lIIIIIIllIl[88] = 0xFFFFFBDF & 0xFB6;
        H.lIIIIIIllIl[89] = -(0xFFFFD77D & 0x7AC3) & (0xFFFFDFF3 & 0x7F7E);
        H.lIIIIIIllIl[90] = -(0xFFFFDA61 & 0x65FF) & (0xFFFFCBFF & 0x7FFD);
        H.lIIIIIIllIl[91] = 0xFFFFAF7F & 0x5DB3;
        H.lIIIIIIllIl[92] = 0xFFFF9BA5 & 0x6FFE;
        H.lIIIIIIllIl[93] = 0xFFFFAD37 & 0x5FF9;
        H.lIIIIIIllIl[94] = 0xFFFFDBFF & 0x2FA9;
        H.lIIIIIIllIl[95] = -(0xFFFFB3BE & 0x7C53) & (0xFFFFBD3F & Short.MAX_VALUE);
        H.lIIIIIIllIl[96] = -(0xFFFFFF9B & 0x406F) & (0xFFFFDBFA & 0x6FBF);
        H.lIIIIIIllIl[97] = 0xFFFFFF7B & 0xDAE;
        H.lIIIIIIllIl[98] = -(0xFFFFBEC1 & 0x713F) & (0xFFFFBBF4 & 0x7FBF);
        H.lIIIIIIllIl[99] = 0xFFFFFD65 & 0xFBF;
        H.lIIIIIIllIl[100] = -(0x5D ^ 0x59) & (0xFFFFCFBB & 0x3BFF);
        H.lIIIIIIllIl[101] = -(0xFFFFB69B & 0x79F5) & (0xFFFFBDBD & 0x7FF3);
        H.lIIIIIIllIl[102] = 0xFFFF9BFC & 0x6FBF;
        H.lIIIIIIllIl[103] = -(0xFFFFFB6B & 0x66B5) & (0xFFFFFF3D & 0x6FFF);
        H.lIIIIIIllIl[104] = -(0xFFFFF8EE & 0x1713) & (0xFFFFBBFF & 0x5FBF);
        H.lIIIIIIllIl[105] = 0xFFFFFF9A & 0xD7D;
        H.lIIIIIIllIl[106] = 0xFFFF9FFF & 0x6BBF;
        H.lIIIIIIllIl[107] = 0xFFFFFD72 & 0xF9D;
        H.lIIIIIIllIl[108] = -(136 + 115 - 62 + 14) & (0xFFFFCFEE & 0x3DDF);
        H.lIIIIIIllIl[109] = 0xFFFF8FFD & 0x7CFE;
        H.lIIIIIIllIl[110] = 0xFFFFADF3 & 0x5EFE;
        H.lIIIIIIllIl[111] = -(0xFFFFBBCB & 0x7477) & (0xFFFFBFFF & 0x7BFF);
        H.lIIIIIIllIl[112] = 0xFFFFBDE9 & 0x4EFF;
        H.lIIIIIIllIl[113] = -(0xFFFFF25B & 0x7DA6) & (0xFFFFFBF9 & 0x7F7F);
        H.lIIIIIIllIl[114] = -(0xFFFFD367 & 0x7D9B) & (0xFFFFDFFB & 0x7DF7);
        H.lIIIIIIllIl[115] = 108 + 203 - 258 + 168 ^ 136 + 9 - 79 + 112;
        H.lIIIIIIllIl[116] = 0x54 ^ 6;
        H.lIIIIIIllIl[117] = 0xFB ^ 0x8F ^ (0x77 ^ 0x39);
    }

    private static boolean llIlllIIlIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static void llIlllIIIlIII() {
        lIIIIIIlIlI = new String[lIIIIIIllIl[117]];
        H.lIIIIIIlIlI[H.lIIIIIIllIl[1]] = H."Finished buying items, switching back to quest";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[0]] = H."Nav to bank";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[6]] = H."Handling banking";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[9]] = H."We are missing quest supplies, switching to BUYING";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[7]] = H."We are missing quest supplies, switching to BUYING";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[15]] = H."Drink";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[17]] = H."Eat";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[10]] = H."Nav to start";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[21]] = H."Starting quest";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[22]] = H."Squire";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[19]] = H."Nav to library guy";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[23]] = H."Talk to library guy";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[24]] = H."Reldo";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[25]] = H."Nav to DWARF";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[26]] = H."Talk to DWARF";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[27]] = H."Thurgo";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[28]] = H."Nav to ore tile";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[29]] = H."Mine rock";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[30]] = H."Mine";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[31]] = H."Nav to start";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[32]] = H."Talk squire";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[33]] = H."Squire";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[34]] = H."Blurite ore";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[35]] = H."Portrait";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[36]] = H."Nav to picture";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[37]] = H."Grabbing picture";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[40]] = H."Sir Vyvin";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[42]] = H."Open";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[43]] = H."Open";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[45]] = H."Search";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[46]] = H."Search";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[2]] = H."Blurite ore";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[47]] = H."Portrait";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[48]] = H."Nav to DWARF";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[49]] = H."Talk to DWARF";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[50]] = H."Thurgo";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[51]] = H."Blurite ore";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[52]] = H."Portrait";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[53]] = H."Nav to DWARF";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[54]] = H."Talk to DWARF";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[55]] = H."Thurgo";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[56]] = H."Blurite sword";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[57]] = H."Nav to start";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[58]] = H."Talk squire";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[59]] = H."Squire";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[64]] = H."A Knights Sword";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[65]] = H."ring of wealth (";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[78]] = H."And how is life as a squire?";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[79]] = H."I can make a new sword if you like...";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[80]] = H."So would these dwarves make another one?";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[20]] = H."Ok, I'll give it a go.";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[81]] = H."What do you know about the Imcando dwarves?";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[82]] = H."Something else.";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[83]] = H."Would you like a redberry pie?";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[84]] = H."Can you make a special sword for me?";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[85]] = H."About that sword...";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[86]] = H."Can you make that replacement sword now?";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[87]] = H."Yes.";
    }

    private static boolean llIlllIIlIIII(int n2) {
        return n2 > 0;
    }

    private static void ae() {
        d var19;
        Object var18;
        block11: {
            block10: {
                int[] nArray = new int[lIIIIIIllIl[0]];
                nArray[H.lIIIIIIllIl[1]] = lIIIIIIllIl[18];
                if (H.llIlllIIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(lIIIIIIllIl[18], lIIIIIIllIl[15], i.bp);
                    bu.add(d2);
                    0;
                }
                int[] nArray2 = new int[lIIIIIIllIl[0]];
                nArray2[H.lIIIIIIllIl[1]] = lIIIIIIllIl[13];
                if (H.llIlllIIIllIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    var18 = new d(lIIIIIIllIl[13], lIIIIIIllIl[0], i.bp);
                    bu.add((d)var18);
                    0;
                }
                int[] nArray3 = new int[lIIIIIIllIl[0]];
                nArray3[H.lIIIIIIllIl[1]] = lIIIIIIllIl[8];
                if (!H.llIlllIIIlIll(Bank.contains((int[])nArray3) ? 1 : 0)) break block10;
                int[] nArray4 = new int[lIIIIIIllIl[0]];
                nArray4[H.lIIIIIIllIl[1]] = lIIIIIIllIl[8];
                if (!H.llIlllIIIlIll(Bank.contains((int[])nArray4) ? 1 : 0)) break block11;
                int[] nArray5 = new int[lIIIIIIllIl[0]];
                nArray5[H.lIIIIIIllIl[1]] = lIIIIIIllIl[8];
                if (!H.llIlllIIIllII(Bank.getFirst((int[])nArray5).getQuantity(), lIIIIIIllIl[6])) break block11;
            }
            var18 = new d(lIIIIIIllIl[8], lIIIIIIllIl[6], i.bp);
            bu.add((d)var18);
            0;
        }
        int[] nArray = new int[lIIIIIIllIl[0]];
        nArray[H.lIIIIIIllIl[1]] = lIIIIIIllIl[14];
        if (H.llIlllIIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            var18 = new d(lIIIIIIllIl[14], lIIIIIIllIl[0], i.bp);
            bu.add((d)var18);
            0;
        }
        int[] nArray6 = new int[lIIIIIIllIl[0]];
        nArray6[H.lIIIIIIllIl[1]] = lIIIIIIllIl[16];
        if (H.llIlllIIIllIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var18 = new d(lIIIIIIllIl[16], lIIIIIIllIl[27], lIIIIIIllIl[60]);
            bu.add((d)var18);
            0;
        }
        int[] nArray7 = new int[lIIIIIIllIl[0]];
        nArray7[H.lIIIIIIllIl[1]] = lIIIIIIllIl[12];
        if (H.llIlllIIIllIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var18 = new d(lIIIIIIllIl[12], lIIIIIIllIl[19], lIIIIIIllIl[61]);
            bu.add((d)var18);
            0;
        }
        if (H.llIlllIIIllIl(Bank.contains((Predicate)(var18 = item -> item.getName().toLowerCase().contains(lIIIIIIlIlI[lIIIIIIllIl[65]]))) ? 1 : 0)) {
            var19 = new d(lIIIIIIllIl[62], lIIIIIIllIl[15], lIIIIIIllIl[63]);
            bu.add(var19);
            0;
        }
        int[] nArray8 = new int[lIIIIIIllIl[0]];
        nArray8[H.lIIIIIIllIl[1]] = lIIIIIIllIl[11];
        if (H.llIlllIIIllIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
            var19 = new d(lIIIIIIllIl[11], lIIIIIIllIl[55], lIIIIIIllIl[61]);
            bu.add(var19);
            0;
        }
    }

    private static String llIllIlllIlll(String var6, String var20) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), lIIIIIIllIl[21]), "DES");
            Cipher var17 = Cipher.getInstance("DES");
            var17.init(lIIIIIIllIl[6], var16);
            return new String(var17.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static boolean llIlllIIlIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlllIIIllII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public int T() {
        try {
            H.cS();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-3 > 0) {
            return (0x12 ^ 0x1D) & ~(0x6E ^ 0x61);
        }
        return lIIIIIIllIl[3];
    }

    private static boolean llIlllIIlIIIl(int n2) {
        return n2 < 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (H.llIlllIIIlllI(e.j(lIIIIIIllIl[4]), lIIIIIIllIl[10])) {
            bl = lIIIIIIllIl[0];
            0;
            if ((72 + 9 - -19 + 63 ^ 58 + 121 - 76 + 63) == 0) {
                return ((0xAE ^ 0xC6 ^ (0xF7 ^ 0xA2)) & ((0x8B ^ 0x80) & ~(0x50 ^ 0x5B) ^ (0xA ^ 0x37) ^ -1)) != 0;
            }
        } else {
            bl = lIIIIIIllIl[1];
        }
        return bl;
    }

    public static void cS() {
        if (H.llIlllIIIlIll(bs ? 1 : 0)) {
            b.a(bu);
            if (H.llIlllIIIllII(bu.size(), lIIIIIIllIl[0])) {
                System.out.println(lIIIIIIlIlI[lIIIIIIllIl[1]]);
                bs = lIIIIIIllIl[1];
            }
        }
        if (H.llIlllIIIllIl(bs ? 1 : 0)) {
            BankLocation var9;
            if (H.llIlllIIIllII(e.j(lIIIIIIllIl[2]), lIIIIIIllIl[3])) {
                C.cb();
            }
            if (H.llIlllIIIllIl(H.aa() ? 1 : 0) && H.llIlllIIIlllI(e.j(lIIIIIIllIl[2]), lIIIIIIllIl[3]) && H.llIlllIIIllII(e.j(lIIIIIIllIl[4]), lIIIIIIllIl[0])) {
                var9 = BankLocation.getNearest();
                if (H.llIlllIIIllll(var9) && H.llIlllIIIllIl(var9.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[0]];
                    a.a(var9);
                }
                if (H.llIlllIIIllll(var9) && H.llIlllIIIlIll(var9.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (H.llIlllIIIllIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIIllIl[5]);
                        0;
                    }
                    if (H.llIlllIIIlIll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[6]];
                        if (H.llIlllIIlIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIIIIllIl[7]);
                            0;
                        }
                        if (H.llIlllIIlIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIIIIllIl[6]);
                            0;
                        }
                        int[] nArray = new int[lIIIIIIllIl[0]];
                        nArray[H.lIIIIIIllIl[1]] = lIIIIIIllIl[8];
                        if (H.llIlllIIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray2 = new int[lIIIIIIllIl[0]];
                            nArray2[H.lIIIIIIllIl[1]] = lIIIIIIllIl[8];
                            if (H.llIlllIIIllII(Bank.getFirst((int[])nArray2).getQuantity(), lIIIIIIllIl[6])) {
                                H.ae();
                                System.out.println(lIIIIIIlIlI[lIIIIIIllIl[9]]);
                                bs = lIIIIIIllIl[0];
                                return;
                            }
                        }
                        int[] nArray3 = new int[lIIIIIIllIl[10]];
                        nArray3[H.lIIIIIIllIl[1]] = lIIIIIIllIl[11];
                        nArray3[H.lIIIIIIllIl[0]] = lIIIIIIllIl[12];
                        nArray3[H.lIIIIIIllIl[6]] = lIIIIIIllIl[13];
                        nArray3[H.lIIIIIIllIl[9]] = lIIIIIIllIl[14];
                        nArray3[H.lIIIIIIllIl[7]] = lIIIIIIllIl[8];
                        nArray3[H.lIIIIIIllIl[15]] = lIIIIIIllIl[16];
                        nArray3[H.lIIIIIIllIl[17]] = lIIIIIIllIl[18];
                        if (H.llIlllIIIllIl(e.b(nArray3) ? 1 : 0)) {
                            H.ae();
                            System.out.println(lIIIIIIlIlI[lIIIIIIllIl[7]]);
                            bs = lIIIIIIllIl[0];
                            return;
                        }
                        int[] nArray4 = new int[lIIIIIIllIl[10]];
                        nArray4[H.lIIIIIIllIl[1]] = lIIIIIIllIl[11];
                        nArray4[H.lIIIIIIllIl[0]] = lIIIIIIllIl[12];
                        nArray4[H.lIIIIIIllIl[6]] = lIIIIIIllIl[13];
                        nArray4[H.lIIIIIIllIl[9]] = lIIIIIIllIl[14];
                        nArray4[H.lIIIIIIllIl[7]] = lIIIIIIllIl[8];
                        nArray4[H.lIIIIIIllIl[15]] = lIIIIIIllIl[16];
                        nArray4[H.lIIIIIIllIl[17]] = lIIIIIIllIl[18];
                        if (H.llIlllIIIlIll(e.b(nArray4) ? 1 : 0)) {
                            a.a(lIIIIIIllIl[11], lIIIIIIllIl[19]);
                            a.a(lIIIIIIllIl[12], lIIIIIIllIl[19]);
                            a.a(lIIIIIIllIl[13], lIIIIIIllIl[0]);
                            a.a(lIIIIIIllIl[14], lIIIIIIllIl[0]);
                            a.a(lIIIIIIllIl[8], lIIIIIIllIl[6]);
                            a.a(lIIIIIIllIl[18], lIIIIIIllIl[7]);
                            a.a(lIIIIIIllIl[16], lIIIIIIllIl[19]);
                        }
                    }
                }
            }
            if (H.llIlllIIIlIll(Inventory.contains((int[])f.aU) ? 1 : 0) && H.llIlllIIIllII(Movement.getRunEnergy(), lIIIIIIllIl[20])) {
                Inventory.getFirst((int[])f.aU).interact(lIIIIIIlIlI[lIIIIIIllIl[15]]);
                Time.sleepTicks((int)lIIIIIIllIl[0]);
                0;
            }
            if (H.llIlllIIlIIIl(H.llIlllIIIlIlI(e.u(), 50.0))) {
                int[] nArray = new int[lIIIIIIllIl[0]];
                nArray[H.lIIIIIIllIl[1]] = lIIIIIIllIl[16];
                if (H.llIlllIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray5 = new int[lIIIIIIllIl[0]];
                    nArray5[H.lIIIIIIllIl[1]] = lIIIIIIllIl[16];
                    Inventory.getFirst((int[])nArray5).interact(lIIIIIIlIlI[lIIIIIIllIl[17]]);
                    Time.sleepTicks((int)lIIIIIIllIl[6]);
                    0;
                }
            }
            if (H.llIlllIIIlIll(H.aa() ? 1 : 0) && H.llIlllIIIllIl(e.j(lIIIIIIllIl[4]))) {
                if (H.llIlllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(dv), lIIIIIIllIl[17])) {
                    AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[10]];
                    if (H.llIlllIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)dv);
                    0;
                    Time.sleepTicks((int)lIIIIIIllIl[0]);
                    0;
                }
                if (H.llIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(dv), lIIIIIIllIl[17])) {
                    AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[21]];
                    g.a(lIIIIIIlIlI[lIIIIIIllIl[22]], bQ);
                }
            }
            if (H.llIlllIIIlllI(e.j(lIIIIIIllIl[4]), lIIIIIIllIl[0])) {
                ck = lIIIIIIllIl[1];
                if (H.llIlllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(hq), lIIIIIIllIl[15])) {
                    AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[19]];
                    Movement.walkTo((WorldPoint)hq);
                    0;
                    Time.sleepTicks((int)lIIIIIIllIl[0]);
                    0;
                }
                if (H.llIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(hq), lIIIIIIllIl[15])) {
                    AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[23]];
                    g.a(lIIIIIIlIlI[lIIIIIIllIl[24]], bQ);
                }
            }
            if (!H.llIlllIIlIlII(e.j(lIIIIIIllIl[4]), lIIIIIIllIl[6]) || H.llIlllIIIlllI(e.j(lIIIIIIllIl[4]), lIIIIIIllIl[9])) {
                if (H.llIlllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(hr), lIIIIIIllIl[17])) {
                    AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[25]];
                    if (H.llIlllIIIllII(Skills.getLevel((Skill)Skill.AGILITY), lIIIIIIllIl[15])) {
                        if (H.llIlllIIIlIll(hy.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Walker.walkAlong(Arrays.asList(hx), new HashMap());
                            0;
                            Time.sleepTicks((int)lIIIIIIllIl[0]);
                            0;
                        }
                        if (H.llIlllIIIllIl(hy.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)hr);
                            0;
                            Time.sleepTicks((int)lIIIIIIllIl[0]);
                            0;
                        }
                    }
                    if (H.llIlllIIlIlIl(Skills.getLevel((Skill)Skill.AGILITY), lIIIIIIllIl[15])) {
                        Movement.walkTo((WorldPoint)hr);
                        0;
                        Time.sleepTicks((int)lIIIIIIllIl[0]);
                        0;
                    }
                }
                if (H.llIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(hr), lIIIIIIllIl[17])) {
                    AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[26]];
                    g.a(lIIIIIIlIlI[lIIIIIIllIl[27]], bQ);
                }
            }
            if (H.llIlllIIIlllI(e.j(lIIIIIIllIl[4]), lIIIIIIllIl[7])) {
                int[] nArray = new int[lIIIIIIllIl[0]];
                nArray[H.lIIIIIIllIl[1]] = hv;
                if (H.llIlllIIIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    if (H.llIlllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(hs), lIIIIIIllIl[17])) {
                        AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[28]];
                        Movement.walkTo((WorldPoint)hs);
                        0;
                        Time.sleepTicks((int)lIIIIIIllIl[0]);
                        0;
                    }
                    if (H.llIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(hs), lIIIIIIllIl[17])) {
                        AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[29]];
                        int[] nArray6 = new int[lIIIIIIllIl[0]];
                        nArray6[H.lIIIIIIllIl[1]] = hu;
                        if (H.llIlllIIIllll(TileObjects.getNearest((int[])nArray6))) {
                            int[] nArray7 = new int[lIIIIIIllIl[0]];
                            nArray7[H.lIIIIIIllIl[1]] = hu;
                            TileObjects.getNearest((int[])nArray7).interact(lIIIIIIlIlI[lIIIIIIllIl[30]]);
                            Time.sleepTicks((int)lIIIIIIllIl[6]);
                            0;
                        }
                    }
                }
            }
            if (H.llIlllIIIlllI(e.j(lIIIIIIllIl[4]), lIIIIIIllIl[7])) {
                int[] nArray = new int[lIIIIIIllIl[0]];
                nArray[H.lIIIIIIllIl[1]] = hv;
                if (H.llIlllIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    if (H.llIlllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(dv), lIIIIIIllIl[17])) {
                        AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[31]];
                        Movement.walkTo((WorldPoint)dv);
                        0;
                        Time.sleepTicks((int)lIIIIIIllIl[0]);
                        0;
                    }
                    if (H.llIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(dv), lIIIIIIllIl[17])) {
                        AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[32]];
                        g.a(lIIIIIIlIlI[lIIIIIIllIl[33]], bQ);
                    }
                }
            }
            if (H.llIlllIIIlllI(e.j(lIIIIIIllIl[4]), lIIIIIIllIl[15])) {
                String[] stringArray = new String[lIIIIIIllIl[0]];
                stringArray[H.lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[34]];
                if (H.llIlllIIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIIIIIllIl[0]];
                    stringArray2[H.lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[35]];
                    if (H.llIlllIIIllIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                        if (H.llIlllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(ht), lIIIIIIllIl[9])) {
                            AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[36]];
                            Movement.walkTo((WorldPoint)ht);
                            0;
                            Time.sleepTicks((int)lIIIIIIllIl[0]);
                            0;
                        }
                        if (H.llIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(ht), lIIIIIIllIl[9])) {
                            AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[37]];
                            var9 = new WorldArea(lIIIIIIllIl[38], lIIIIIIllIl[39], lIIIIIIllIl[21], lIIIIIIllIl[7], lIIIIIIllIl[6]);
                            String[] stringArray3 = new String[lIIIIIIllIl[0]];
                            stringArray3[H.lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[40]];
                            NPC var23 = NPCs.getNearest((String[])stringArray3);
                            if (H.llIlllIIIllll(var23) && H.llIlllIIIlIll(var9.contains(var23.getWorldLocation()) ? 1 : 0)) {
                                e.B();
                            }
                            int[] nArray = new int[lIIIIIIllIl[0]];
                            nArray[H.lIIIIIIllIl[1]] = lIIIIIIllIl[41];
                            TileObject var11 = TileObjects.getNearest((int[])nArray);
                            if (H.llIlllIIIllll(var11)) {
                                String[] stringArray4 = new String[lIIIIIIllIl[0]];
                                stringArray4[H.lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[42]];
                                if (H.llIlllIIIlIll(var11.hasAction(stringArray4) ? 1 : 0)) {
                                    var11.interact(lIIIIIIlIlI[lIIIIIIllIl[43]]);
                                    Time.sleepTicks((int)lIIIIIIllIl[6]);
                                    0;
                                }
                            }
                            int[] nArray8 = new int[lIIIIIIllIl[0]];
                            nArray8[H.lIIIIIIllIl[1]] = lIIIIIIllIl[44];
                            TileObject var25 = TileObjects.getNearest((int[])nArray8);
                            if (H.llIlllIIIllll(var25)) {
                                String[] stringArray5 = new String[lIIIIIIllIl[0]];
                                stringArray5[H.lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[45]];
                                if (H.llIlllIIIlIll(var25.hasAction(stringArray5) ? 1 : 0)) {
                                    var25.interact(lIIIIIIlIlI[lIIIIIIllIl[46]]);
                                    Time.sleepTicks((int)lIIIIIIllIl[6]);
                                    0;
                                    if (H.llIlllIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.continueSpace();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (H.llIlllIIIlllI(e.j(lIIIIIIllIl[4]), lIIIIIIllIl[15])) {
                String[] stringArray = new String[lIIIIIIllIl[0]];
                stringArray[H.lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[2]];
                if (H.llIlllIIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray6 = new String[lIIIIIIllIl[0]];
                    stringArray6[H.lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[47]];
                    if (H.llIlllIIIlIll(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                        if (H.llIlllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(hr), lIIIIIIllIl[17])) {
                            AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[48]];
                            if (H.llIlllIIIllII(Skills.getLevel((Skill)Skill.AGILITY), lIIIIIIllIl[15])) {
                                if (H.llIlllIIIlIll(hy.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    Walker.walkAlong(Arrays.asList(hx), new HashMap());
                                    0;
                                    Time.sleepTicks((int)lIIIIIIllIl[0]);
                                    0;
                                }
                                if (H.llIlllIIIllIl(hy.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)hr);
                                    0;
                                    Time.sleepTicks((int)lIIIIIIllIl[0]);
                                    0;
                                }
                            }
                            if (H.llIlllIIlIlIl(Skills.getLevel((Skill)Skill.AGILITY), lIIIIIIllIl[15])) {
                                Movement.walkTo((WorldPoint)hr);
                                0;
                                Time.sleepTicks((int)lIIIIIIllIl[0]);
                                0;
                            }
                        }
                        if (H.llIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(hr), lIIIIIIllIl[17])) {
                            AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[49]];
                            g.a(lIIIIIIlIlI[lIIIIIIllIl[50]], bQ);
                        }
                    }
                }
            }
            if (H.llIlllIIIlllI(e.j(lIIIIIIllIl[4]), lIIIIIIllIl[17])) {
                String[] stringArray = new String[lIIIIIIllIl[0]];
                stringArray[H.lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[51]];
                if (H.llIlllIIlIIII(Inventory.getCount((String[])stringArray))) {
                    String[] stringArray7 = new String[lIIIIIIllIl[0]];
                    stringArray7[H.lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[52]];
                    if (H.llIlllIIIllII(Inventory.getCount((String[])stringArray7), lIIIIIIllIl[0])) {
                        if (H.llIlllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(hr), lIIIIIIllIl[17])) {
                            AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[53]];
                            Movement.walkTo((WorldPoint)hr);
                            0;
                            Time.sleepTicks((int)lIIIIIIllIl[0]);
                            0;
                        }
                        if (H.llIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(hr), lIIIIIIllIl[17])) {
                            AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[54]];
                            g.a(lIIIIIIlIlI[lIIIIIIllIl[55]], bQ);
                        }
                    }
                }
            }
            if (H.llIlllIIIlllI(e.j(lIIIIIIllIl[4]), lIIIIIIllIl[17])) {
                String[] stringArray = new String[lIIIIIIllIl[0]];
                stringArray[H.lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[56]];
                if (H.llIlllIIlIIII(Inventory.getCount((String[])stringArray))) {
                    if (H.llIlllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(dv), lIIIIIIllIl[17])) {
                        AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[57]];
                        Movement.walkTo((WorldPoint)dv);
                        0;
                        Time.sleepTicks((int)lIIIIIIllIl[0]);
                        0;
                    }
                    if (H.llIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(dv), lIIIIIIllIl[17])) {
                        AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[58]];
                        if (H.llIlllIIIllII(ck, lIIIIIIllIl[0])) {
                            ac.mT += lIIIIIIllIl[0];
                            ac.d(AccBuilderTempleTrek.m);
                            ck += lIIIIIIllIl[0];
                            ac.mT = lIIIIIIllIl[1];
                            cl = lIIIIIIllIl[1];
                        }
                        g.a(lIIIIIIlIlI[lIIIIIIllIl[59]], bQ);
                    }
                }
            }
            g.a(new String[lIIIIIIllIl[1]]);
        }
    }
}

