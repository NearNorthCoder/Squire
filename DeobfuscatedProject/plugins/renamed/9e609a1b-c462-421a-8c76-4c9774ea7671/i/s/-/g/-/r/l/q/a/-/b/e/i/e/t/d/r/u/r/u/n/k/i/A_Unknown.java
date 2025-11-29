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
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.P_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.a_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.b_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.d;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.f_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.g_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.h;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.v_Unknown;
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

public class A_Unknown
implements M {
    private static /* synthetic */ String[] lIIIlllIllIIl;
    public static /* synthetic */ boolean by;
    static /* synthetic */ int gt;
    static /* synthetic */ int gu;
    static /* synthetic */ WorldArea gw;
    static /* synthetic */ boolean cp;
    static final /* synthetic */ int gn;
    public static /* synthetic */ WorldPoint gp;
    public static /* synthetic */ List<d> bA;
    public static /* synthetic */ WorldPoint gq;
    public static /* synthetic */ WorldPoint go;
    public static /* synthetic */ WorldPoint gr;
    static /* synthetic */ int co;
    public static /* synthetic */ WorldPoint ct;
    static /* synthetic */ String[] bW;
    static /* synthetic */ int gs;
    static /* synthetic */ WorldPoint[] gv;
    private static /* synthetic */ int[] lIIIlllIlllII;

    private static boolean lIlIIlIIllllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIIlIIllIIIll(String var12, String var16) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var16.toCharArray();
        int var18 = lIIIlllIlllII[1];
        char[] var7 = var12.toCharArray();
        int var6 = var7.length;
        int var21 = lIIIlllIlllII[1];
        while (A.lIlIIlIIllllIII(var21, var6)) {
            char var1 = var7[var21];
            var9.append((char)(var1 ^ var10[var18 % var10.length]));
            0;
            ++var18;
            ++var21;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean S() {
        int n2;
        int[] nArray = new int[lIIIlllIlllII[0]];
        nArray[A.lIIIlllIlllII[1]] = lIIIlllIlllII[13];
        if (A.lIlIIlIIlllllII(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[lIIIlllIlllII[0]];
            nArray2[A.lIIIlllIlllII[1]] = lIIIlllIlllII[14];
            if (A.lIlIIlIIlllllII(Inventory.getCount((int[])nArray2))) {
                int[] nArray3 = new int[lIIIlllIlllII[0]];
                nArray3[A.lIIIlllIlllII[1]] = lIIIlllIlllII[8];
                if (A.lIlIIlIlIIIIIIl(Inventory.getCount((int[])nArray3), lIIIlllIlllII[6])) {
                    int[] nArray4 = new int[lIIIlllIlllII[0]];
                    nArray4[A.lIIIlllIlllII[1]] = lIIIlllIlllII[11];
                    if (A.lIlIIlIIlllllII(Inventory.getCount((int[])nArray4))) {
                        int[] nArray5 = new int[lIIIlllIlllII[0]];
                        nArray5[A.lIIIlllIlllII[1]] = lIIIlllIlllII[12];
                        if (A.lIlIIlIIlllllII(Inventory.getCount((int[])nArray5))) {
                            int[] nArray6 = new int[lIIIlllIlllII[0]];
                            nArray6[A.lIIIlllIlllII[1]] = lIIIlllIlllII[16];
                            if (A.lIlIIlIIlllllII(Inventory.getCount((int[])nArray6)) && A.lIlIIlIIlllllII(Inventory.getCount((int[])f.ba))) {
                                n2 = lIIIlllIlllII[0];
                                0;
                                if (((0x8D ^ 0x9F) & ~(0xF ^ 0x1D)) <= ((0x44 ^ 0x50) & ~(0xB8 ^ 0xAC))) return n2 != 0;
                                return false;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIIlllIlllII[1];
        return n2 != 0;
    }

    private static int lIlIIlIIlllIllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static String lIlIIlIIllIIlIl(String var25, String var11) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), lIIIlllIlllII[21]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(lIIIlllIlllII[6], var8);
            return new String(var3.doFinal(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static void lIlIIlIIlllIlIl() {
        lIIIlllIlllII = new int[118];
        A.lIIIlllIlllII[0] = 1;
        A.lIIIlllIlllII[1] = (0x2B ^ 0x35) & ~(0x3B ^ 0x25);
        A.lIIIlllIlllII[2] = 0x32 ^ 0x2D;
        A.lIIIlllIlllII[3] = 0x94 ^ 0x9A ^ (0x24 ^ 0x4E);
        A.lIIIlllIlllII[4] = 0x15 ^ 0x6F;
        A.lIIIlllIlllII[5] = -(0xFFFFE66C & 0x7DFB) & (0xFFFFF7FF & 0x7FEF);
        A.lIIIlllIlllII[6] = 2;
        A.lIIIlllIlllII[7] = 0x4C ^ 0x48;
        A.lIIIlllIlllII[8] = 0xFFFFAF7F & 0x59AF;
        A.lIIIlllIlllII[9] = 3;
        A.lIIIlllIlllII[10] = 0x20 ^ 0x27;
        A.lIIIlllIlllII[11] = -(0xFFFFF01D & 0x2FE3) & (0xFFFFFFCF & 0x3F77);
        A.lIIIlllIlllII[12] = 0xFFFF9FEB & 0x7F5D;
        A.lIIIlllIlllII[13] = -(0xFFFFEABF & 0x75CB) & (0xFFFFFFBF & 0x69DF);
        A.lIIIlllIlllII[14] = 0xFFFFD4F3 & 0x2FFD;
        A.lIIIlllIlllII[15] = 0x54 ^ 0x1F ^ (0x58 ^ 0x16);
        A.lIIIlllIlllII[16] = 0xFFFF8BAD & 0x75D3;
        A.lIIIlllIlllII[17] = 0x1F ^ 0x19;
        A.lIIIlllIlllII[18] = -(0xFFFFDEC9 & 0x6BBF) & (0xFFFFFBDF & 0x7FF9);
        A.lIIIlllIlllII[19] = 0x70 ^ 0x7A;
        A.lIIIlllIlllII[20] = 36 + 77 - 23 + 55 ^ 103 + 28 - 97 + 129;
        A.lIIIlllIlllII[21] = 0x5B ^ 0x53;
        A.lIIIlllIlllII[22] = 0xA3 ^ 0x81 ^ (0x39 ^ 0x12);
        A.lIIIlllIlllII[23] = 137 + 6 - 19 + 63 ^ 62 + 167 - 99 + 46;
        A.lIIIlllIlllII[24] = 0xC1 ^ 0xBB ^ (0xE6 ^ 0x90);
        A.lIIIlllIlllII[25] = 0x58 ^ 0x55;
        A.lIIIlllIlllII[26] = 33 + 47 - 27 + 81 ^ 107 + 126 - 162 + 65;
        A.lIIIlllIlllII[27] = 0x9D ^ 0xB2 ^ (0x81 ^ 0xA1);
        A.lIIIlllIlllII[28] = 58 + 64 - 94 + 122 ^ 7 + 45 - -41 + 41;
        A.lIIIlllIlllII[29] = 0x42 ^ 0x53;
        A.lIIIlllIlllII[30] = 0x44 ^ 0x2C ^ (0x7D ^ 7);
        A.lIIIlllIlllII[31] = 0xDF ^ 0x83 ^ (0x1E ^ 0x51);
        A.lIIIlllIlllII[32] = 0x7A ^ 0x6E;
        A.lIIIlllIlllII[33] = 0xC5 ^ 0xC1 ^ (0x20 ^ 0x31);
        A.lIIIlllIlllII[34] = 0xA0 ^ 0xB6;
        A.lIIIlllIlllII[35] = 0x6B ^ 0x7C;
        A.lIIIlllIlllII[36] = 0x20 ^ 0x77 ^ (0xEF ^ 0xA0);
        A.lIIIlllIlllII[37] = 0x31 ^ 0x5C ^ (0xB3 ^ 0xC7);
        A.lIIIlllIlllII[38] = -(0xFFFFF85F & 0x67E1) & (0xFFFFFFE7 & 0x6BFB);
        A.lIIIlllIlllII[39] = 0xFFFFCD5D & 0x3FA7;
        A.lIIIlllIlllII[40] = 0xF ^ 0x15;
        A.lIIIlllIlllII[41] = -(0xFFFF93AB & 0x7F75) & (0xFFFF9FFF & 0x7BFF);
        A.lIIIlllIlllII[42] = 97 + 83 - 94 + 55 ^ 35 + 52 - 53 + 116;
        A.lIIIlllIlllII[43] = 0x4A ^ 0x56;
        A.lIIIlllIlllII[44] = 0xFFFFBAEA & 0x4DF5;
        A.lIIIlllIlllII[45] = 0x2A ^ 0x5B ^ (0x68 ^ 4);
        A.lIIIlllIlllII[46] = 0xC9 ^ 0xA5 ^ (0x70 ^ 2);
        A.lIIIlllIlllII[47] = 0x70 ^ 0x3E ^ (0x74 ^ 0x1A);
        A.lIIIlllIlllII[48] = 0x54 ^ 0x75;
        A.lIIIlllIlllII[49] = 0x31 ^ 0x40 ^ (0xE1 ^ 0xB2);
        A.lIIIlllIlllII[50] = 119 + 172 - 75 + 10 ^ 21 + 136 - 15 + 51;
        A.lIIIlllIlllII[51] = 33 + 123 - 146 + 117 ^ (0x5A ^ 1);
        A.lIIIlllIlllII[52] = 0x5E ^ 0x7B;
        A.lIIIlllIlllII[53] = 0xD ^ 0x2B;
        A.lIIIlllIlllII[54] = 0xC2 ^ 0x87 ^ (9 ^ 0x6B);
        A.lIIIlllIlllII[55] = 0xBC ^ 0x94;
        A.lIIIlllIlllII[56] = 0x1C ^ 0x35;
        A.lIIIlllIlllII[57] = 0x4F ^ 0x65;
        A.lIIIlllIlllII[58] = 103 + 150 - 174 + 91 ^ 17 + 64 - -24 + 24;
        A.lIIIlllIlllII[59] = 63 + 180 - 114 + 54 ^ 118 + 92 - 68 + 13;
        A.lIIIlllIlllII[60] = -(0xFFFFFB35 & 0x76CE) & (0xFFFFF7DF & Short.MAX_VALUE);
        A.lIIIlllIlllII[61] = -(0xFFFFF47D & 0x5FD3) & (0xFFFFD7F6 & 0x7FDD);
        A.lIIIlllIlllII[62] = 0xFFFFAEFD & 0x7FCE;
        A.lIIIlllIlllII[63] = -(0xFFFFFB5A & 0x1CB7) & (0xFFFFF9FD & 0x7FBB);
        A.lIIIlllIlllII[64] = 0x39 ^ 0x42 ^ (0x3C ^ 0x6A);
        A.lIIIlllIlllII[65] = 0xD4 ^ 0x95 ^ (0x4C ^ 0x23);
        A.lIIIlllIlllII[66] = 0xFFFF8FFF & 0x7B9F;
        A.lIIIlllIlllII[67] = 0xFFFF9F1F & 0x6DED;
        A.lIIIlllIlllII[68] = -(0xFFFFFEA7 & 0x735E) & (0xFFFFFECF & 0x7FBF);
        A.lIIIlllIlllII[69] = 0xFFFF9FEF & 0x6DB7;
        A.lIIIlllIlllII[70] = -(0xFFFFF4CD & 0x7F7B) & (0xFFFFFFFE & Short.MAX_VALUE);
        A.lIIIlllIlllII[71] = -(0xFFFFD39D & 0x7D67) & (0xFFFFFD4F & 0x5FFD);
        A.lIIIlllIlllII[72] = -(0xFFFFFC15 & 0x33EF) & (0xFFFFFFEF & 0x3BFF);
        A.lIIIlllIlllII[73] = -(0xFFFFFFDD & 0x583E) & (0xFFFFFF7F & 0x7DFB);
        A.lIIIlllIlllII[74] = -(0xFFFFFC79 & 0x33D7) & (0xFFFFFFFF & 0x3BF8);
        A.lIIIlllIlllII[75] = -(0xFFFFFA0B & 0x67FD) & (0xFFFFEFAF & 0x7F5F);
        A.lIIIlllIlllII[76] = -(0xFFFFF4AF & 0x4B5E) & (0xFFFFECFF & 0x7F7F);
        A.lIIIlllIlllII[77] = 0xFFFFBE9D & 0x43FE;
        A.lIIIlllIlllII[78] = 13 + 61 - -56 + 10 ^ 114 + 10 - 88 + 127;
        A.lIIIlllIlllII[79] = 3 + 117 - 105 + 143 ^ 119 + 7 - 56 + 104;
        A.lIIIlllIlllII[80] = 0x6D ^ 0x54 ^ (0x55 ^ 0x5D);
        A.lIIIlllIlllII[81] = 0x24 ^ 0x17;
        A.lIIIlllIlllII[82] = 58 + 149 - 156 + 132 ^ 85 + 0 - 63 + 109;
        A.lIIIlllIlllII[83] = 0xB4 ^ 0x81;
        A.lIIIlllIlllII[84] = (0x19 ^ 0x3C) & ~(9 ^ 0x2C) ^ (0x9D ^ 0xAB);
        A.lIIIlllIlllII[85] = 0xB4 ^ 0xBD ^ (0x7C ^ 0x42);
        A.lIIIlllIlllII[86] = 131 + 89 - 142 + 65 ^ 4 + 33 - -78 + 68;
        A.lIIIlllIlllII[87] = 0x20 ^ 0x41 ^ (0x23 ^ 0x7B);
        A.lIIIlllIlllII[88] = -(0xFFFFFEFA & 0x650F) & (0xFFFFFFDF & 0x6FBF);
        A.lIIIlllIlllII[89] = 0xFFFFBF3A & 0x4DF7;
        A.lIIIlllIlllII[90] = -(0xFFFFED4F & 0x76B1) & (0xFFFFEFDF & 0x7FBD);
        A.lIIIlllIlllII[91] = 0xFFFFFF37 & 0xDFB;
        A.lIIIlllIlllII[92] = 0xFFFF9BEE & 0x6FB5;
        A.lIIIlllIlllII[93] = 0xFFFFBD31 & 0x4FFF;
        A.lIIIlllIlllII[94] = -(0x22 ^ 0x77) & (0xFFFF9FFF & 0x6BFD);
        A.lIIIlllIlllII[95] = 0xFFFFFFAF & 0xD7E;
        A.lIIIlllIlllII[96] = 0xFFFFBFF2 & 0x4BBD;
        A.lIIIlllIlllII[97] = 0xFFFF8F3E & 0x7DEB;
        A.lIIIlllIlllII[98] = -2 & (0xFFFFEBF7 & 0x1FBD);
        A.lIIIlllIlllII[99] = 0xFFFFFDAF & 0xF75;
        A.lIIIlllIlllII[100] = -(0xFFFFF444 & Short.MAX_VALUE) & (0xFFFFFFFB & Short.MAX_VALUE);
        A.lIIIlllIlllII[101] = 0xFFFF9FBB & 0x6D65;
        A.lIIIlllIlllII[102] = -(0xFFFFC46F & 0x7B93) & (0xFFFFEBBE & 0x5FFF);
        A.lIIIlllIlllII[103] = -(0xFFFFC3C5 & 0x3EBB) & (0xFFFF9F9D & 0x6FFF);
        A.lIIIlllIlllII[104] = -(0xFFFF9507 & 0x6EF9) & (0xFFFFFFBE & 0xFFF);
        A.lIIIlllIlllII[105] = 0xFFFFAF3A & 0x5DDD;
        A.lIIIlllIlllII[106] = 0xFFFFFBBF & 0xFFF;
        A.lIIIlllIlllII[107] = 0xFFFFFD97 & 0xF78;
        A.lIIIlllIlllII[108] = 0xFFFFBD46 & 0x4FBD;
        A.lIIIlllIlllII[109] = -(0xFFFFFB9B & 0x5565) & (0xFFFFDFFC & 0x7DFF);
        A.lIIIlllIlllII[110] = 0xFFFF8DFB & 0x7EF6;
        A.lIIIlllIlllII[111] = -(0xFFFFBCF5 & 0x670B) & (0xFFFFEFFD & 0x3FBF);
        A.lIIIlllIlllII[112] = 0xFFFFADEB & 0x5EFD;
        A.lIIIlllIlllII[113] = -(0xFFFFFE87 & 0x557D) & (0xFFFFFFFF & 0x5F7C);
        A.lIIIlllIlllII[114] = 0xFFFF8CF5 & 0x7FFB;
        A.lIIIlllIlllII[115] = 0xEE ^ 0x81;
        A.lIIIlllIlllII[116] = 0x2A ^ 0x1F ^ (0xC3 ^ 0xA4);
        A.lIIIlllIlllII[117] = 0x4D ^ 0x77;
    }

    private static boolean lIlIIlIIlllllll(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public int Y() {
        try {
            A.cc();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0xC9 ^ 0x9C) & ~(0x6F ^ 0x3A)) < 0) {
            return (0xB0 ^ 0x9C) & ~(0x3D ^ 0x11);
        }
        return lIIIlllIlllII[3];
    }

    public static void cc() {
        if (A.lIlIIlIIlllIlll(by ? 1 : 0)) {
            b.a(bA);
            if (A.lIlIIlIIllllIII(bA.size(), lIIIlllIlllII[0])) {
                System.out.println(lIIIlllIllIIl[lIIIlllIlllII[1]]);
                by = lIIIlllIlllII[1];
            }
        }
        if (A.lIlIIlIIllllIIl(by ? 1 : 0)) {
            BankLocation var19;
            if (A.lIlIIlIIllllIII(e.j(lIIIlllIlllII[2]), lIIIlllIlllII[3])) {
                v.bl();
            }
            if (A.lIlIIlIIllllIIl(A.S() ? 1 : 0) && A.lIlIIlIIllllIlI(e.j(lIIIlllIlllII[2]), lIIIlllIlllII[3]) && A.lIlIIlIIllllIII(e.j(lIIIlllIlllII[4]), lIIIlllIlllII[0])) {
                var19 = BankLocation.getNearest();
                if (A.lIlIIlIIllllIll(var19) && A.lIlIIlIIllllIIl(var19.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[0]];
                    a.a(var19);
                }
                if (A.lIlIIlIIllllIll(var19) && A.lIlIIlIIlllIlll(var19.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (A.lIlIIlIIllllIIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllIlllII[5]);
                        0;
                    }
                    if (A.lIlIIlIIlllIlll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[6]];
                        if (A.lIlIIlIIlllllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIlllIlllII[7]);
                            0;
                        }
                        if (A.lIlIIlIIlllllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIlllIlllII[6]);
                            0;
                        }
                        int[] nArray = new int[lIIIlllIlllII[0]];
                        nArray[A.lIIIlllIlllII[1]] = lIIIlllIlllII[8];
                        if (A.lIlIIlIIlllIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray2 = new int[lIIIlllIlllII[0]];
                            nArray2[A.lIIIlllIlllII[1]] = lIIIlllIlllII[8];
                            if (A.lIlIIlIIllllIII(Bank.getFirst((int[])nArray2).getQuantity(), lIIIlllIlllII[6])) {
                                A.W();
                                System.out.println(lIIIlllIllIIl[lIIIlllIlllII[9]]);
                                by = lIIIlllIlllII[0];
                                return;
                            }
                        }
                        int[] nArray3 = new int[lIIIlllIlllII[10]];
                        nArray3[A.lIIIlllIlllII[1]] = lIIIlllIlllII[11];
                        nArray3[A.lIIIlllIlllII[0]] = lIIIlllIlllII[12];
                        nArray3[A.lIIIlllIlllII[6]] = lIIIlllIlllII[13];
                        nArray3[A.lIIIlllIlllII[9]] = lIIIlllIlllII[14];
                        nArray3[A.lIIIlllIlllII[7]] = lIIIlllIlllII[8];
                        nArray3[A.lIIIlllIlllII[15]] = lIIIlllIlllII[16];
                        nArray3[A.lIIIlllIlllII[17]] = lIIIlllIlllII[18];
                        if (A.lIlIIlIIllllIIl(e.b(nArray3) ? 1 : 0)) {
                            A.W();
                            System.out.println(lIIIlllIllIIl[lIIIlllIlllII[7]]);
                            by = lIIIlllIlllII[0];
                            return;
                        }
                        int[] nArray4 = new int[lIIIlllIlllII[10]];
                        nArray4[A.lIIIlllIlllII[1]] = lIIIlllIlllII[11];
                        nArray4[A.lIIIlllIlllII[0]] = lIIIlllIlllII[12];
                        nArray4[A.lIIIlllIlllII[6]] = lIIIlllIlllII[13];
                        nArray4[A.lIIIlllIlllII[9]] = lIIIlllIlllII[14];
                        nArray4[A.lIIIlllIlllII[7]] = lIIIlllIlllII[8];
                        nArray4[A.lIIIlllIlllII[15]] = lIIIlllIlllII[16];
                        nArray4[A.lIIIlllIlllII[17]] = lIIIlllIlllII[18];
                        if (A.lIlIIlIIlllIlll(e.b(nArray4) ? 1 : 0)) {
                            a.a(lIIIlllIlllII[11], lIIIlllIlllII[19]);
                            a.a(lIIIlllIlllII[12], lIIIlllIlllII[19]);
                            a.a(lIIIlllIlllII[13], lIIIlllIlllII[0]);
                            a.a(lIIIlllIlllII[14], lIIIlllIlllII[0]);
                            a.a(lIIIlllIlllII[8], lIIIlllIlllII[6]);
                            a.a(lIIIlllIlllII[18], lIIIlllIlllII[7]);
                            a.a(lIIIlllIlllII[16], lIIIlllIlllII[19]);
                        }
                    }
                }
            }
            if (A.lIlIIlIIlllIlll(Inventory.contains((int[])f.ba) ? 1 : 0) && A.lIlIIlIIllllIII(Movement.getRunEnergy(), lIIIlllIlllII[20])) {
                Inventory.getFirst((int[])f.ba).interact(lIIIlllIllIIl[lIIIlllIlllII[15]]);
                Time.sleepTicks((int)lIIIlllIlllII[0]);
                0;
            }
            if (A.lIlIIlIIlllllIl(A.lIlIIlIIlllIllI(e.v(), 50.0))) {
                int[] nArray = new int[lIIIlllIlllII[0]];
                nArray[A.lIIIlllIlllII[1]] = lIIIlllIlllII[16];
                if (A.lIlIIlIIlllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray5 = new int[lIIIlllIlllII[0]];
                    nArray5[A.lIIIlllIlllII[1]] = lIIIlllIlllII[16];
                    Inventory.getFirst((int[])nArray5).interact(lIIIlllIllIIl[lIIIlllIlllII[17]]);
                    Time.sleepTicks((int)lIIIlllIlllII[6]);
                    0;
                }
            }
            if (A.lIlIIlIIlllIlll(A.S() ? 1 : 0) && A.lIlIIlIIllllIIl(e.j(lIIIlllIlllII[4]))) {
                if (A.lIlIIlIIllllllI(Players.getLocal().getWorldLocation().distanceTo(ct), lIIIlllIlllII[17])) {
                    AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[10]];
                    if (A.lIlIIlIIlllIlll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)ct);
                    0;
                    Time.sleepTicks((int)lIIIlllIlllII[0]);
                    0;
                }
                if (A.lIlIIlIIlllllll(Players.getLocal().getWorldLocation().distanceTo(ct), lIIIlllIlllII[17])) {
                    AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[21]];
                    g.a(lIIIlllIllIIl[lIIIlllIlllII[22]], bW);
                }
            }
            if (A.lIlIIlIIllllIlI(e.j(lIIIlllIlllII[4]), lIIIlllIlllII[0])) {
                co = lIIIlllIlllII[1];
                if (A.lIlIIlIIllllllI(Players.getLocal().getWorldLocation().distanceTo(go), lIIIlllIlllII[15])) {
                    AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[19]];
                    Movement.walkTo((WorldPoint)go);
                    0;
                    Time.sleepTicks((int)lIIIlllIlllII[0]);
                    0;
                }
                if (A.lIlIIlIIlllllll(Players.getLocal().getWorldLocation().distanceTo(go), lIIIlllIlllII[15])) {
                    AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[23]];
                    g.a(lIIIlllIllIIl[lIIIlllIlllII[24]], bW);
                }
            }
            if (!A.lIlIIlIlIIIIIII(e.j(lIIIlllIlllII[4]), lIIIlllIlllII[6]) || A.lIlIIlIIllllIlI(e.j(lIIIlllIlllII[4]), lIIIlllIlllII[9])) {
                if (A.lIlIIlIIllllllI(Players.getLocal().getWorldLocation().distanceTo(gp), lIIIlllIlllII[17])) {
                    AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[25]];
                    if (A.lIlIIlIIllllIII(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllIlllII[15])) {
                        if (A.lIlIIlIIlllIlll(gw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Walker.walkAlong(Arrays.asList(gv), new HashMap());
                            0;
                            Time.sleepTicks((int)lIIIlllIlllII[0]);
                            0;
                        }
                        if (A.lIlIIlIIllllIIl(gw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)gp);
                            0;
                            Time.sleepTicks((int)lIIIlllIlllII[0]);
                            0;
                        }
                    }
                    if (A.lIlIIlIlIIIIIIl(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllIlllII[15])) {
                        Movement.walkTo((WorldPoint)gp);
                        0;
                        Time.sleepTicks((int)lIIIlllIlllII[0]);
                        0;
                    }
                }
                if (A.lIlIIlIIlllllll(Players.getLocal().getWorldLocation().distanceTo(gp), lIIIlllIlllII[17])) {
                    AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[26]];
                    g.a(lIIIlllIllIIl[lIIIlllIlllII[27]], bW);
                }
            }
            if (A.lIlIIlIIllllIlI(e.j(lIIIlllIlllII[4]), lIIIlllIlllII[7])) {
                int[] nArray = new int[lIIIlllIlllII[0]];
                nArray[A.lIIIlllIlllII[1]] = gt;
                if (A.lIlIIlIIllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    if (A.lIlIIlIIllllllI(Players.getLocal().getWorldLocation().distanceTo(gq), lIIIlllIlllII[17])) {
                        AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[28]];
                        Movement.walkTo((WorldPoint)gq);
                        0;
                        Time.sleepTicks((int)lIIIlllIlllII[0]);
                        0;
                    }
                    if (A.lIlIIlIIlllllll(Players.getLocal().getWorldLocation().distanceTo(gq), lIIIlllIlllII[17])) {
                        AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[29]];
                        int[] nArray6 = new int[lIIIlllIlllII[0]];
                        nArray6[A.lIIIlllIlllII[1]] = gs;
                        if (A.lIlIIlIIllllIll(TileObjects.getNearest((int[])nArray6))) {
                            int[] nArray7 = new int[lIIIlllIlllII[0]];
                            nArray7[A.lIIIlllIlllII[1]] = gs;
                            TileObjects.getNearest((int[])nArray7).interact(lIIIlllIllIIl[lIIIlllIlllII[30]]);
                            Time.sleepTicks((int)lIIIlllIlllII[6]);
                            0;
                        }
                    }
                }
            }
            if (A.lIlIIlIIllllIlI(e.j(lIIIlllIlllII[4]), lIIIlllIlllII[7])) {
                int[] nArray = new int[lIIIlllIlllII[0]];
                nArray[A.lIIIlllIlllII[1]] = gt;
                if (A.lIlIIlIIlllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    if (A.lIlIIlIIllllllI(Players.getLocal().getWorldLocation().distanceTo(ct), lIIIlllIlllII[17])) {
                        AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[31]];
                        Movement.walkTo((WorldPoint)ct);
                        0;
                        Time.sleepTicks((int)lIIIlllIlllII[0]);
                        0;
                    }
                    if (A.lIlIIlIIlllllll(Players.getLocal().getWorldLocation().distanceTo(ct), lIIIlllIlllII[17])) {
                        AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[32]];
                        g.a(lIIIlllIllIIl[lIIIlllIlllII[33]], bW);
                    }
                }
            }
            if (A.lIlIIlIIllllIlI(e.j(lIIIlllIlllII[4]), lIIIlllIlllII[15])) {
                String[] stringArray = new String[lIIIlllIlllII[0]];
                stringArray[A.lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[34]];
                if (A.lIlIIlIIlllIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIIlllIlllII[0]];
                    stringArray2[A.lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[35]];
                    if (A.lIlIIlIIllllIIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                        if (A.lIlIIlIIllllllI(Players.getLocal().getWorldLocation().distanceTo(gr), lIIIlllIlllII[9])) {
                            AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[36]];
                            Movement.walkTo((WorldPoint)gr);
                            0;
                            Time.sleepTicks((int)lIIIlllIlllII[0]);
                            0;
                        }
                        if (A.lIlIIlIIlllllll(Players.getLocal().getWorldLocation().distanceTo(gr), lIIIlllIlllII[9])) {
                            AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[37]];
                            var19 = new WorldArea(lIIIlllIlllII[38], lIIIlllIlllII[39], lIIIlllIlllII[21], lIIIlllIlllII[7], lIIIlllIlllII[6]);
                            String[] stringArray3 = new String[lIIIlllIlllII[0]];
                            stringArray3[A.lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[40]];
                            NPC var13 = NPCs.getNearest((String[])stringArray3);
                            if (A.lIlIIlIIllllIll(var13) && A.lIlIIlIIlllIlll(var19.contains(var13.getWorldLocation()) ? 1 : 0)) {
                                e.C();
                            }
                            int[] nArray = new int[lIIIlllIlllII[0]];
                            nArray[A.lIIIlllIlllII[1]] = lIIIlllIlllII[41];
                            TileObject var17 = TileObjects.getNearest((int[])nArray);
                            if (A.lIlIIlIIllllIll(var17)) {
                                String[] stringArray4 = new String[lIIIlllIlllII[0]];
                                stringArray4[A.lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[42]];
                                if (A.lIlIIlIIlllIlll(var17.hasAction(stringArray4) ? 1 : 0)) {
                                    var17.interact(lIIIlllIllIIl[lIIIlllIlllII[43]]);
                                    Time.sleepTicks((int)lIIIlllIlllII[6]);
                                    0;
                                }
                            }
                            int[] nArray8 = new int[lIIIlllIlllII[0]];
                            nArray8[A.lIIIlllIlllII[1]] = lIIIlllIlllII[44];
                            TileObject var20 = TileObjects.getNearest((int[])nArray8);
                            if (A.lIlIIlIIllllIll(var20)) {
                                String[] stringArray5 = new String[lIIIlllIlllII[0]];
                                stringArray5[A.lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[45]];
                                if (A.lIlIIlIIlllIlll(var20.hasAction(stringArray5) ? 1 : 0)) {
                                    var20.interact(lIIIlllIllIIl[lIIIlllIlllII[46]]);
                                    Time.sleepTicks((int)lIIIlllIlllII[6]);
                                    0;
                                    if (A.lIlIIlIIlllIlll(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.continueSpace();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (A.lIlIIlIIllllIlI(e.j(lIIIlllIlllII[4]), lIIIlllIlllII[15])) {
                String[] stringArray = new String[lIIIlllIlllII[0]];
                stringArray[A.lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[2]];
                if (A.lIlIIlIIlllIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray6 = new String[lIIIlllIlllII[0]];
                    stringArray6[A.lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[47]];
                    if (A.lIlIIlIIlllIlll(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                        if (A.lIlIIlIIllllllI(Players.getLocal().getWorldLocation().distanceTo(gp), lIIIlllIlllII[17])) {
                            AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[48]];
                            if (A.lIlIIlIIllllIII(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllIlllII[15])) {
                                if (A.lIlIIlIIlllIlll(gw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    Walker.walkAlong(Arrays.asList(gv), new HashMap());
                                    0;
                                    Time.sleepTicks((int)lIIIlllIlllII[0]);
                                    0;
                                }
                                if (A.lIlIIlIIllllIIl(gw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)gp);
                                    0;
                                    Time.sleepTicks((int)lIIIlllIlllII[0]);
                                    0;
                                }
                            }
                            if (A.lIlIIlIlIIIIIIl(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllIlllII[15])) {
                                Movement.walkTo((WorldPoint)gp);
                                0;
                                Time.sleepTicks((int)lIIIlllIlllII[0]);
                                0;
                            }
                        }
                        if (A.lIlIIlIIlllllll(Players.getLocal().getWorldLocation().distanceTo(gp), lIIIlllIlllII[17])) {
                            AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[49]];
                            g.a(lIIIlllIllIIl[lIIIlllIlllII[50]], bW);
                        }
                    }
                }
            }
            if (A.lIlIIlIIllllIlI(e.j(lIIIlllIlllII[4]), lIIIlllIlllII[17])) {
                String[] stringArray = new String[lIIIlllIlllII[0]];
                stringArray[A.lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[51]];
                if (A.lIlIIlIIlllllII(Inventory.getCount((String[])stringArray))) {
                    String[] stringArray7 = new String[lIIIlllIlllII[0]];
                    stringArray7[A.lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[52]];
                    if (A.lIlIIlIIllllIII(Inventory.getCount((String[])stringArray7), lIIIlllIlllII[0])) {
                        if (A.lIlIIlIIllllllI(Players.getLocal().getWorldLocation().distanceTo(gp), lIIIlllIlllII[17])) {
                            AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[53]];
                            Movement.walkTo((WorldPoint)gp);
                            0;
                            Time.sleepTicks((int)lIIIlllIlllII[0]);
                            0;
                        }
                        if (A.lIlIIlIIlllllll(Players.getLocal().getWorldLocation().distanceTo(gp), lIIIlllIlllII[17])) {
                            AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[54]];
                            g.a(lIIIlllIllIIl[lIIIlllIlllII[55]], bW);
                        }
                    }
                }
            }
            if (A.lIlIIlIIllllIlI(e.j(lIIIlllIlllII[4]), lIIIlllIlllII[17])) {
                String[] stringArray = new String[lIIIlllIlllII[0]];
                stringArray[A.lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[56]];
                if (A.lIlIIlIIlllllII(Inventory.getCount((String[])stringArray))) {
                    if (A.lIlIIlIIllllllI(Players.getLocal().getWorldLocation().distanceTo(ct), lIIIlllIlllII[17])) {
                        AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[57]];
                        Movement.walkTo((WorldPoint)ct);
                        0;
                        Time.sleepTicks((int)lIIIlllIlllII[0]);
                        0;
                    }
                    if (A.lIlIIlIIlllllll(Players.getLocal().getWorldLocation().distanceTo(ct), lIIIlllIlllII[17])) {
                        AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[58]];
                        if (A.lIlIIlIIllllIII(co, lIIIlllIlllII[0])) {
                            P.lv += lIIIlllIlllII[0];
                            P.d(AccBuilderRat.m);
                            co += lIIIlllIlllII[0];
                            P.lv = lIIIlllIlllII[1];
                            cp = lIIIlllIlllII[1];
                        }
                        g.a(lIIIlllIllIIl[lIIIlllIlllII[59]], bW);
                    }
                }
            }
            g.a(new String[lIIIlllIlllII[1]]);
        }
    }

    private static boolean lIlIIlIIlllIlll(int n2) {
        return n2 != 0;
    }

    private static void lIlIIlIIlllIIIl() {
        lIIIlllIllIIl = new String[lIIIlllIlllII[117]];
        A.lIIIlllIllIIl[A.lIIIlllIlllII[1]] = A."Finished buying items, switching back to quest";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[0]] = A."Nav to bank";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[6]] = A."Handling banking";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[9]] = A."We are missing quest supplies, switching to BUYING";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[7]] = A."We are missing quest supplies, switching to BUYING";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[15]] = A."Drink";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[17]] = A."Eat";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[10]] = A."Nav to start";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[21]] = A."Starting quest";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[22]] = A."Squire";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[19]] = A."Nav to library guy";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[23]] = A."Talk to library guy";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[24]] = A."Reldo";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[25]] = A."Nav to DWARF";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[26]] = A."Talk to DWARF";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[27]] = A."Thurgo";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[28]] = A."Nav to ore tile";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[29]] = A."Mine rock";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[30]] = A."Mine";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[31]] = A."Nav to start";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[32]] = A."Talk squire";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[33]] = A."Squire";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[34]] = A."Blurite ore";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[35]] = A."Portrait";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[36]] = A."Nav to picture";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[37]] = A."Grabbing picture";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[40]] = A."Sir Vyvin";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[42]] = A."Open";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[43]] = A."Open";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[45]] = A."Search";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[46]] = A."Search";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[2]] = A."Blurite ore";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[47]] = A."Portrait";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[48]] = A."Nav to DWARF";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[49]] = A."Talk to DWARF";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[50]] = A."Thurgo";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[51]] = A."Blurite ore";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[52]] = A."Portrait";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[53]] = A."Nav to DWARF";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[54]] = A."Talk to DWARF";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[55]] = A."Thurgo";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[56]] = A."Blurite sword";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[57]] = A."Nav to start";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[58]] = A."Talk squire";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[59]] = A."Squire";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[64]] = A."A Knights Sword";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[65]] = A."ring of wealth (";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[78]] = A."And how is life as a squire?";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[79]] = A."I can make a new sword if you like...";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[80]] = A."So would these dwarves make another one?";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[20]] = A."Ok, I'll give it a go.";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[81]] = A."What do you know about the Imcando dwarves?";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[82]] = A."Something else.";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[83]] = A."Would you like a redberry pie?";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[84]] = A."Can you make a special sword for me?";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[85]] = A."About that sword...";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[86]] = A."Can you make that replacement sword now?";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[87]] = A."Yes.";
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (A.lIlIIlIlIIIIIIl(e.j(lIIIlllIlllII[4]), lIIIlllIlllII[10])) {
            bl = lIIIlllIlllII[0];
            0;
            if (1 <= ((0x77 ^ 0x65) & ~(0x5C ^ 0x4E))) {
                return false;
            }
        } else {
            bl = lIIIlllIlllII[1];
        }
        return bl;
    }

    @Override
    public boolean X() {
        return lIIIlllIlllII[1];
    }

    private static void W() {
        d var23;
        Object var4;
        block11: {
            block10: {
                int[] nArray = new int[lIIIlllIlllII[0]];
                nArray[A.lIIIlllIlllII[1]] = lIIIlllIlllII[18];
                if (A.lIlIIlIIllllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(lIIIlllIlllII[18], lIIIlllIlllII[15], h.bv);
                    bA.add(d2);
                    0;
                }
                int[] nArray2 = new int[lIIIlllIlllII[0]];
                nArray2[A.lIIIlllIlllII[1]] = lIIIlllIlllII[13];
                if (A.lIlIIlIIllllIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    var4 = new d(lIIIlllIlllII[13], lIIIlllIlllII[0], h.bv);
                    bA.add((d)var4);
                    0;
                }
                int[] nArray3 = new int[lIIIlllIlllII[0]];
                nArray3[A.lIIIlllIlllII[1]] = lIIIlllIlllII[8];
                if (!A.lIlIIlIIlllIlll(Bank.contains((int[])nArray3) ? 1 : 0)) break block10;
                int[] nArray4 = new int[lIIIlllIlllII[0]];
                nArray4[A.lIIIlllIlllII[1]] = lIIIlllIlllII[8];
                if (!A.lIlIIlIIlllIlll(Bank.contains((int[])nArray4) ? 1 : 0)) break block11;
                int[] nArray5 = new int[lIIIlllIlllII[0]];
                nArray5[A.lIIIlllIlllII[1]] = lIIIlllIlllII[8];
                if (!A.lIlIIlIIllllIII(Bank.getFirst((int[])nArray5).getQuantity(), lIIIlllIlllII[6])) break block11;
            }
            var4 = new d(lIIIlllIlllII[8], lIIIlllIlllII[6], h.bv);
            bA.add((d)var4);
            0;
        }
        int[] nArray = new int[lIIIlllIlllII[0]];
        nArray[A.lIIIlllIlllII[1]] = lIIIlllIlllII[14];
        if (A.lIlIIlIIllllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            var4 = new d(lIIIlllIlllII[14], lIIIlllIlllII[0], h.bv);
            bA.add((d)var4);
            0;
        }
        int[] nArray6 = new int[lIIIlllIlllII[0]];
        nArray6[A.lIIIlllIlllII[1]] = lIIIlllIlllII[16];
        if (A.lIlIIlIIllllIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var4 = new d(lIIIlllIlllII[16], lIIIlllIlllII[27], lIIIlllIlllII[60]);
            bA.add((d)var4);
            0;
        }
        int[] nArray7 = new int[lIIIlllIlllII[0]];
        nArray7[A.lIIIlllIlllII[1]] = lIIIlllIlllII[12];
        if (A.lIlIIlIIllllIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var4 = new d(lIIIlllIlllII[12], lIIIlllIlllII[19], lIIIlllIlllII[61]);
            bA.add((d)var4);
            0;
        }
        if (A.lIlIIlIIllllIIl(Bank.contains((Predicate)(var4 = item -> item.getName().toLowerCase().contains(lIIIlllIllIIl[lIIIlllIlllII[65]]))) ? 1 : 0)) {
            var23 = new d(lIIIlllIlllII[62], lIIIlllIlllII[15], lIIIlllIlllII[63]);
            bA.add(var23);
            0;
        }
        int[] nArray8 = new int[lIIIlllIlllII[0]];
        nArray8[A.lIIIlllIlllII[1]] = lIIIlllIlllII[11];
        if (A.lIlIIlIIllllIIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
            var23 = new d(lIIIlllIlllII[11], lIIIlllIlllII[55], lIIIlllIlllII[61]);
            bA.add(var23);
            0;
        }
    }

    private static boolean lIlIIlIIlllllIl(int n2) {
        return n2 < 0;
    }

    static {
        A.lIlIIlIIlllIlIl();
        A.lIlIIlIIlllIIIl();
        gn = lIIIlllIlllII[4];
        bA = new ArrayList<d>();
        ct = new WorldPoint(lIIIlllIlllII[66], lIIIlllIlllII[67], lIIIlllIlllII[1]);
        go = new WorldPoint(lIIIlllIlllII[68], lIIIlllIlllII[69], lIIIlllIlllII[1]);
        gp = new WorldPoint(lIIIlllIlllII[70], lIIIlllIlllII[71], lIIIlllIlllII[1]);
        gq = new WorldPoint(lIIIlllIlllII[72], lIIIlllIlllII[73], lIIIlllIlllII[1]);
        gr = new WorldPoint(lIIIlllIlllII[74], lIIIlllIlllII[75], lIIIlllIlllII[6]);
        gs = lIIIlllIlllII[76];
        gt = lIIIlllIlllII[77];
        gu = lIIIlllIlllII[41];
        String[] stringArray = new String[lIIIlllIlllII[23]];
        stringArray[A.lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[78]];
        stringArray[A.lIIIlllIlllII[0]] = lIIIlllIllIIl[lIIIlllIlllII[79]];
        stringArray[A.lIIIlllIlllII[6]] = lIIIlllIllIIl[lIIIlllIlllII[80]];
        stringArray[A.lIIIlllIlllII[9]] = lIIIlllIllIIl[lIIIlllIlllII[20]];
        stringArray[A.lIIIlllIlllII[7]] = lIIIlllIllIIl[lIIIlllIlllII[81]];
        stringArray[A.lIIIlllIlllII[15]] = lIIIlllIllIIl[lIIIlllIlllII[82]];
        stringArray[A.lIIIlllIlllII[17]] = lIIIlllIllIIl[lIIIlllIlllII[83]];
        stringArray[A.lIIIlllIlllII[10]] = lIIIlllIllIIl[lIIIlllIlllII[84]];
        stringArray[A.lIIIlllIlllII[21]] = lIIIlllIllIIl[lIIIlllIlllII[85]];
        stringArray[A.lIIIlllIlllII[22]] = lIIIlllIllIIl[lIIIlllIlllII[86]];
        stringArray[A.lIIIlllIlllII[19]] = lIIIlllIllIIl[lIIIlllIlllII[87]];
        bW = stringArray;
        WorldPoint[] worldPointArray = new WorldPoint[lIIIlllIlllII[26]];
        worldPointArray[A.lIIIlllIlllII[1]] = new WorldPoint(lIIIlllIlllII[88], lIIIlllIlllII[89], lIIIlllIlllII[1]);
        worldPointArray[A.lIIIlllIlllII[0]] = new WorldPoint(lIIIlllIlllII[90], lIIIlllIlllII[91], lIIIlllIlllII[1]);
        worldPointArray[A.lIIIlllIlllII[6]] = new WorldPoint(lIIIlllIlllII[92], lIIIlllIlllII[93], lIIIlllIlllII[1]);
        worldPointArray[A.lIIIlllIlllII[9]] = new WorldPoint(lIIIlllIlllII[94], lIIIlllIlllII[95], lIIIlllIlllII[1]);
        worldPointArray[A.lIIIlllIlllII[7]] = new WorldPoint(lIIIlllIlllII[96], lIIIlllIlllII[97], lIIIlllIlllII[1]);
        worldPointArray[A.lIIIlllIlllII[15]] = new WorldPoint(lIIIlllIlllII[98], lIIIlllIlllII[99], lIIIlllIlllII[1]);
        worldPointArray[A.lIIIlllIlllII[17]] = new WorldPoint(lIIIlllIlllII[100], lIIIlllIlllII[101], lIIIlllIlllII[1]);
        worldPointArray[A.lIIIlllIlllII[10]] = new WorldPoint(lIIIlllIlllII[102], lIIIlllIlllII[103], lIIIlllIlllII[1]);
        worldPointArray[A.lIIIlllIlllII[21]] = new WorldPoint(lIIIlllIlllII[104], lIIIlllIlllII[105], lIIIlllIlllII[1]);
        worldPointArray[A.lIIIlllIlllII[22]] = new WorldPoint(lIIIlllIlllII[106], lIIIlllIlllII[107], lIIIlllIlllII[1]);
        worldPointArray[A.lIIIlllIlllII[19]] = new WorldPoint(lIIIlllIlllII[106], lIIIlllIlllII[108], lIIIlllIlllII[1]);
        worldPointArray[A.lIIIlllIlllII[23]] = new WorldPoint(lIIIlllIlllII[104], lIIIlllIlllII[109], lIIIlllIlllII[1]);
        worldPointArray[A.lIIIlllIlllII[24]] = new WorldPoint(lIIIlllIlllII[104], lIIIlllIlllII[110], lIIIlllIlllII[1]);
        worldPointArray[A.lIIIlllIlllII[25]] = new WorldPoint(lIIIlllIlllII[111], lIIIlllIlllII[112], lIIIlllIlllII[1]);
        gv = worldPointArray;
        gw = new WorldArea(lIIIlllIlllII[113], lIIIlllIlllII[114], lIIIlllIlllII[115], lIIIlllIlllII[116], lIIIlllIlllII[1]);
    }

    private static boolean lIlIIlIIlllllII(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIlIIllllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlIIllllIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIlIlIIIIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIlIIlIIllIIlII(String var22, String var2) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var24 = Cipher.getInstance("Blowfish");
            var24.init(lIIIlllIlllII[6], var15);
            return new String(var24.doFinal(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIllllIll(Object object) {
        return object != null;
    }

    private static boolean lIlIIlIIllllllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIlIlIIIIIII(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public String Z() {
        return lIIIlllIllIIl[lIIIlllIlllII[64]];
    }
}

