/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
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
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
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
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aN_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.az_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;

public class B_Unknown
implements ac {
    private static /* synthetic */ WorldPoint eu;
    public static /* synthetic */ List<d> bv;
    static /* synthetic */ String[] cE;
    static /* synthetic */ boolean ep;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ boolean dj;
    private static /* synthetic */ WorldPoint et;
    private static /* synthetic */ String[] llIlIllIII;
    private static /* synthetic */ int[] llIlIllIll;
    private static /* synthetic */ WorldPoint es;
    private static /* synthetic */ int ev;
    private static /* synthetic */ WorldPoint eq;
    static /* synthetic */ int di;
    private static /* synthetic */ WorldPoint de;
    static /* synthetic */ WorldArea eo;
    private static /* synthetic */ WorldPoint er;

    private static boolean lIllIlIIllIII(int n2) {
        return n2 > 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        int[] nArray = new int[llIlIllIll[1]];
        nArray[B.llIlIllIll[2]] = llIlIllIll[8];
        if (B.lIllIlIIllIII(Inventory.getCount((int[])nArray))) {
            String[] stringArray = new String[llIlIllIll[1]];
            stringArray[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[52]];
            if (B.lIllIlIIllIII(Inventory.getCount((String[])stringArray))) {
                String[] stringArray2 = new String[llIlIllIll[1]];
                stringArray2[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[53]];
                if (B.lIllIlIIllIII(Inventory.getCount((String[])stringArray2))) {
                    String[] stringArray3 = new String[llIlIllIll[1]];
                    stringArray3[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[54]];
                    if (B.lIllIlIIllIII(Inventory.getCount((String[])stringArray3))) {
                        String[] stringArray4 = new String[llIlIllIll[1]];
                        stringArray4[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[55]];
                        if (B.lIllIlIIllIII(Inventory.getCount((String[])stringArray4))) {
                            String[] stringArray5 = new String[llIlIllIll[1]];
                            stringArray5[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[56]];
                            if (B.lIllIlIIllIII(Inventory.getCount((String[])stringArray5))) {
                                int[] nArray2 = new int[llIlIllIll[1]];
                                nArray2[B.llIlIllIll[2]] = llIlIllIll[17];
                                if (B.lIllIlIIllIII(Inventory.getCount((int[])nArray2)) && B.lIllIlIIlIlIl(Inventory.contains((int[])f.ba) ? 1 : 0)) {
                                    n2 = llIlIllIll[1];
                                    0;
                                    if (-(0x91 ^ 0x95) <= 0) return n2 != 0;
                                    return (3 & ~3) != 0;
                                }
                            }
                        }
                    }
                }
            }
        }
        n2 = llIlIllIll[2];
        return n2 != 0;
    }

    private static boolean lIllIlIIlIlIl(int n2) {
        return n2 != 0;
    }

    @Override
    public String ag() {
        return llIlIllIII[llIlIllIll[63]];
    }

    private static void Q() {
        d var21;
        Object var16;
        int[] nArray = new int[llIlIllIll[1]];
        nArray[B.llIlIllIll[2]] = llIlIllIll[12];
        if (B.lIllIlIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llIlIllIll[12], llIlIllIll[1], llIlIllIll[57]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[llIlIllIll[1]];
        nArray2[B.llIlIllIll[2]] = llIlIllIll[10];
        if (B.lIllIlIIlIllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var16 = new d(llIlIllIll[10], llIlIllIll[1], llIlIllIll[4]);
            bv.add((d)var16);
            0;
        }
        int[] nArray3 = new int[llIlIllIll[1]];
        nArray3[B.llIlIllIll[2]] = llIlIllIll[9];
        if (B.lIllIlIIlIllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var16 = new d(llIlIllIll[9], llIlIllIll[1], llIlIllIll[4]);
            bv.add((d)var16);
            0;
        }
        int[] nArray4 = new int[llIlIllIll[1]];
        nArray4[B.llIlIllIll[2]] = llIlIllIll[14];
        if (B.lIllIlIIlIllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var16 = new d(llIlIllIll[14], llIlIllIll[24], llIlIllIll[4]);
            bv.add((d)var16);
            0;
        }
        int[] nArray5 = new int[llIlIllIll[1]];
        nArray5[B.llIlIllIll[2]] = llIlIllIll[16];
        if (B.lIllIlIIlIllI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var16 = new d(llIlIllIll[16], llIlIllIll[24], j.cf);
            bv.add((d)var16);
            0;
        }
        int[] nArray6 = new int[llIlIllIll[1]];
        nArray6[B.llIlIllIll[2]] = llIlIllIll[11];
        if (B.lIllIlIIlIllI(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var16 = new d(llIlIllIll[11], llIlIllIll[0], llIlIllIll[58]);
            bv.add((d)var16);
            0;
        }
        if (B.lIllIlIIlIllI(Bank.contains((Predicate)(var16 = item -> item.getName().toLowerCase().contains(llIlIllIII[llIlIllIll[64]]))) ? 1 : 0)) {
            var21 = new d(llIlIllIll[59], llIlIllIll[13], llIlIllIll[60]);
            bv.add(var21);
            0;
        }
        int[] nArray7 = new int[llIlIllIll[1]];
        nArray7[B.llIlIllIll[2]] = llIlIllIll[8];
        if (B.lIllIlIIlIllI(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var21 = new d(llIlIllIll[8], llIlIllIll[52], llIlIllIll[61]);
            bv.add(var21);
            0;
        }
    }

    static {
        B.lIllIlIIlIIlI();
        B.lIllIlIIlIIIl();
        bv = new ArrayList<d>();
        eo = new WorldArea(llIlIllIll[65], llIlIllIll[66], llIlIllIll[24], llIlIllIll[25], llIlIllIll[2]);
        String[] stringArray = new String[llIlIllIll[22]];
        stringArray[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[67]];
        stringArray[B.llIlIllIll[1]] = llIlIllIII[llIlIllIll[68]];
        stringArray[B.llIlIllIll[3]] = llIlIllIII[llIlIllIll[69]];
        stringArray[B.llIlIllIll[5]] = llIlIllIII[llIlIllIll[19]];
        stringArray[B.llIlIllIll[6]] = llIlIllIII[llIlIllIll[70]];
        stringArray[B.llIlIllIll[13]] = llIlIllIII[llIlIllIll[71]];
        stringArray[B.llIlIllIll[15]] = llIlIllIII[llIlIllIll[72]];
        stringArray[B.llIlIllIll[7]] = llIlIllIII[llIlIllIll[73]];
        cE = stringArray;
        de = new WorldPoint(llIlIllIll[74], llIlIllIll[75], llIlIllIll[2]);
        eq = new WorldPoint(llIlIllIll[76], llIlIllIll[77], llIlIllIll[2]);
        er = new WorldPoint(llIlIllIll[78], llIlIllIll[79], llIlIllIll[2]);
        es = new WorldPoint(llIlIllIll[80], llIlIllIll[81], llIlIllIll[2]);
        et = new WorldPoint(llIlIllIll[82], llIlIllIll[83], llIlIllIll[2]);
        eu = new WorldPoint(llIlIllIll[84], llIlIllIll[85], llIlIllIll[2]);
        ev = llIlIllIll[24];
    }

    private static void lIllIlIIlIIlI() {
        llIlIllIll = new int[87];
        B.llIlIllIll[0] = 0x81 ^ 0x8B;
        B.llIlIllIll[1] = 1;
        B.llIlIllIll[2] = (0x17 ^ 0x2F) & ~(1 ^ 0x39);
        B.llIlIllIll[3] = 2;
        B.llIlIllIll[4] = -(0x31 ^ 6) & (0xFFFFBBBE & 0x57FF);
        B.llIlIllIll[5] = 3;
        B.llIlIllIll[6] = 57 + 141 - 144 + 101 ^ 5 + 136 - 4 + 22;
        B.llIlIllIll[7] = 0x23 ^ 0x24;
        B.llIlIllIll[8] = -(0xFFFFFB7D & 0x44BB) & (0xFFFFFF7F & 0x5FFF);
        B.llIlIllIll[9] = -(0xFFFFDD53 & 0x66AD) & (0xFFFFC7BB & 0x7FFC);
        B.llIlIllIll[10] = 0xFFFF9F73 & 0x61BF;
        B.llIlIllIll[11] = -(0xFFFFBEE7 & 0x4F9B) & (0xFFFFEFFB & 0x1FBF);
        B.llIlIllIll[12] = 0xFFFF860F & 0x7FFE;
        B.llIlIllIll[13] = 0x27 ^ 0x22;
        B.llIlIllIll[14] = -(148 + 170 - 212 + 72) & (0xFFFFDFFB & 0x3FFF);
        B.llIlIllIll[15] = 0xCA ^ 0xA9 ^ (0x6D ^ 8);
        B.llIlIllIll[16] = -(0xFFFFAEFF & 0x57A3) & (0xFFFFBFFF & 0x77F3);
        B.llIlIllIll[17] = -(0xFFFFF6D9 & 0x2D2F) & (0xFFFFBFFB & 0x67EF);
        B.llIlIllIll[18] = 0xFFFFB7FD & 0x4BEA;
        B.llIlIllIll[19] = 0x3E ^ 0xC;
        B.llIlIllIll[20] = 0x21 ^ 0x3A;
        B.llIlIllIll[21] = 0x7D ^ 0x71;
        B.llIlIllIll[22] = 0x52 ^ 0x5A;
        B.llIlIllIll[23] = 0x69 ^ 0x60;
        B.llIlIllIll[24] = 19 + 85 - 60 + 124 ^ 62 + 29 - -67 + 5;
        B.llIlIllIll[25] = 0x2C ^ 0x21;
        B.llIlIllIll[26] = 4 + 53 - -11 + 67 ^ 106 + 17 - 69 + 83;
        B.llIlIllIll[27] = 0xD9 ^ 0x84 ^ (0x5E ^ 0xC);
        B.llIlIllIll[28] = 0xD0 ^ 0xC0;
        B.llIlIllIll[29] = 0x7D ^ 0x6C;
        B.llIlIllIll[30] = 22 + 86 - 9 + 88 ^ 142 + 143 - 161 + 45;
        B.llIlIllIll[31] = 80 + 6 - 77 + 139 ^ 68 + 19 - -29 + 19;
        B.llIlIllIll[32] = 0x7D ^ 0x69;
        B.llIlIllIll[33] = 0x2F ^ 0x43 ^ (0x54 ^ 0x2D);
        B.llIlIllIll[34] = 0xBB ^ 0xAD;
        B.llIlIllIll[35] = 0x5B ^ 0x4C;
        B.llIlIllIll[36] = 0xAC ^ 0x92 ^ (0x16 ^ 0x30);
        B.llIlIllIll[37] = 30 + 123 - 82 + 60 ^ 70 + 100 - 107 + 91;
        B.llIlIllIll[38] = 0x65 ^ 0x7F;
        B.llIlIllIll[39] = 0x26 ^ 0x3A;
        B.llIlIllIll[40] = 0x5F ^ 0x72 ^ (0xB9 ^ 0x89);
        B.llIlIllIll[41] = 0xA8 ^ 0x90 ^ (0x3D ^ 0x1B);
        B.llIlIllIll[42] = 64 + 149 - 93 + 55 ^ 170 + 50 - 45 + 1;
        B.llIlIllIll[43] = -(0xFFFFF83C & 0x17C7) & (0xFFFF9FFB & 0x7FF7);
        B.llIlIllIll[44] = 0xEA ^ 0x93 ^ (0xEF ^ 0xB6);
        B.llIlIllIll[45] = 123 + 1 - 60 + 94 ^ 163 + 99 - 203 + 132;
        B.llIlIllIll[46] = 0x86 ^ 0xA4;
        B.llIlIllIll[47] = 1 ^ 0x22;
        B.llIlIllIll[48] = 0x7E ^ 0x45 ^ (0x24 ^ 0x3B);
        B.llIlIllIll[49] = 131 + 173 - 131 + 9 ^ 70 + 133 - 176 + 120;
        B.llIlIllIll[50] = 0x6D ^ 0x5C ^ (0xD4 ^ 0xC3);
        B.llIlIllIll[51] = 0xA2 ^ 0x85;
        B.llIlIllIll[52] = 0x5F ^ 5 ^ (0x1B ^ 0x69);
        B.llIlIllIll[53] = 0x89 ^ 0xA0;
        B.llIlIllIll[54] = 0xA1 ^ 0x8B;
        B.llIlIllIll[55] = 187 + 151 - 170 + 71 ^ 113 + 3 - 11 + 91;
        B.llIlIllIll[56] = 0x79 ^ 0x55;
        B.llIlIllIll[57] = -(0xFFFF9EF7 & 0x7D0B) & (0xFFFFBF6A & 0x7FBF);
        B.llIlIllIll[58] = 0xFFFF85F4 & 0x7BFF;
        B.llIlIllIll[59] = 0xFFFFEFFE & 0x3ECD;
        B.llIlIllIll[60] = -(0xFFFFF21F & 0x1FF6) & (0xFFFFFFBD & 0x73FF);
        B.llIlIllIll[61] = -(0xFFFFDEFB & 0x3D37) & (0xFFFF9FBE & 0x7FF7);
        B.llIlIllIll[62] = 0x11 ^ 0x71 ^ (0x7E ^ 0x7A);
        B.llIlIllIll[63] = 18 + 128 - 65 + 90 ^ 32 + 56 - -30 + 16;
        B.llIlIllIll[64] = 0xED ^ 0xC3;
        B.llIlIllIll[65] = -(0xFFFFEFA4 & 0x35FF) & (0xFFFFFFEB & 0x2FFF);
        B.llIlIllIll[66] = 0xFFFFFDEF & 0xF7A;
        B.llIlIllIll[67] = 0xA4 ^ 0x8B;
        B.llIlIllIll[68] = 0x6C ^ 0x5C;
        B.llIlIllIll[69] = 0x57 ^ 5 ^ (0x76 ^ 0x15);
        B.llIlIllIll[70] = 0x46 ^ 0x75;
        B.llIlIllIll[71] = 0xEF ^ 0xBE ^ (0xC8 ^ 0xAD);
        B.llIlIllIll[72] = 0x71 ^ 0x15 ^ (0x46 ^ 0x17);
        B.llIlIllIll[73] = 0xA4 ^ 0x92;
        B.llIlIllIll[74] = -(0xFFFFF7FF & 0x3CD5) & (0xFFFFFFF7 & 0x3FDF);
        B.llIlIllIll[75] = 0xFFFFADF3 & 0x5FAC;
        B.llIlIllIll[76] = -(0xFFFFF4B5 & 0x2F5F) & (0xFFFFEF7F & 0x3EF7);
        B.llIlIllIll[77] = 0xFFFFFFFD & 0xDAE;
        B.llIlIllIll[78] = -(0xFFFFF7FD & 0x699B) & (0xFFFFEFDF & 0x7BFF);
        B.llIlIllIll[79] = -(0xFFFFF77B & 0x1AD5) & (0xFFFFBFFF & 0x5FF6);
        B.llIlIllIll[80] = 0xFFFFEFF4 & 0x1A5F;
        B.llIlIllIll[81] = -(0xAC ^ 0xA5) & (0xFFFFEF7E & 0x1DFB);
        B.llIlIllIll[82] = -(0xFFFFD7F7 & 0x7829) & (0xFFFFFBFF & 0x5E6E);
        B.llIlIllIll[83] = -(0xFFFFF5DB & 0x5AAF) & (0xFFFFFFFF & 0x5DFF);
        B.llIlIllIll[84] = 0xFFFFDB5B & 0x2EF5;
        B.llIlIllIll[85] = 0xFFFFAD6F & 0x5FFF;
        B.llIlIllIll[86] = 0x9E ^ 0x83 ^ (0x52 ^ 0x78);
    }

    private static String lIllIlIIIIIll(String var9, String var11) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(llIlIllIll[3], var19);
            return new String(var10.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIIlIllI(int n2) {
        return n2 == 0;
    }

    private static String lIllIlIIIIlII(String var1, String var22) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var22.getBytes(StandardCharsets.UTF_8)), llIlIllIll[22]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(llIlIllIll[3], var14);
            return new String(var2.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static String lIllIlIIIIlIl(String var13, String var12) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var17 = var12.toCharArray();
        int var15 = llIlIllIll[2];
        char[] var20 = var13.toCharArray();
        int var6 = var20.length;
        int var8 = llIlIllIll[2];
        while (B.lIllIlIIlIIll(var8, var6)) {
            char var5 = var20[var8];
            var18.append((char)(var5 ^ var17[var15 % var17.length]));
            0;
            ++var15;
            ++var8;
            0;
            if ((0x6D ^ 0x68) > 0) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    private static boolean lIllIlIIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean ae() {
        return llIlIllIll[2];
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (B.lIllIlIIlIlII(e.j(ev), llIlIllIll[13])) {
            bl = llIlIllIll[1];
            0;
            if (-1 == 2) {
                return false;
            }
        } else {
            bl = llIlIllIll[2];
        }
        return bl;
    }

    private static boolean lIllIlIIlIlll(Object object) {
        return object != null;
    }

    private static boolean lIllIlIIllIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIlIIllIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIlIIlIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIlIIllIIl(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public int af() {
        try {
            B.by();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x4F ^ 0x42) & ~(0xBD ^ 0xB0)) != 0) {
            return (0x22 ^ 0x36) & ~(0x55 ^ 0x41);
        }
        return llIlIllIll[62];
    }

    private static void lIllIlIIlIIIl() {
        llIlIllIII = new String[llIlIllIll[86]];
        B.llIlIllIII[B.llIlIllIll[2]] = B."Finished buying items, switching back to quest";
        B.llIlIllIII[B.llIlIllIll[1]] = B."Fishing pass";
        B.llIlIllIII[B.llIlIllIll[3]] = B."Nav to bank";
        B.llIlIllIII[B.llIlIllIll[5]] = B."Handling banking";
        B.llIlIllIII[B.llIlIllIll[6]] = B."We are missing quest supplies, switching to BUYING";
        B.llIlIllIII[B.llIlIllIll[13]] = B."Drink";
        B.llIlIllIII[B.llIlIllIll[15]] = B."Nav to start";
        B.llIlIllIII[B.llIlIllIll[7]] = B."Starting quest";
        B.llIlIllIII[B.llIlIllIll[22]] = B."Vestri";
        B.llIlIllIII[B.llIlIllIll[23]] = B."Fishing trophy";
        B.llIlIllIII[B.llIlIllIll[0]] = B."Red vine worm";
        B.llIlIllIII[B.llIlIllIll[24]] = B."Nav to vine";
        B.llIlIllIII[B.llIlIllIll[21]] = B."Digging";
        B.llIlIllIII[B.llIlIllIll[25]] = B."Red vine worm";
        B.llIlIllIII[B.llIlIllIll[26]] = B."Vine";
        B.llIlIllIII[B.llIlIllIll[27]] = B."Vine";
        B.llIlIllIII[B.llIlIllIll[28]] = B."Check";
        B.llIlIllIII[B.llIlIllIll[29]] = B."Red vine worm";
        B.llIlIllIII[B.llIlIllIll[30]] = B."Nav to contest";
        B.llIlIllIII[B.llIlIllIll[31]] = B."Garlic";
        B.llIlIllIII[B.llIlIllIll[32]] = B."Using garlic";
        B.llIlIllIII[B.llIlIllIll[33]] = B."Wall Pipe";
        B.llIlIllIII[B.llIlIllIll[34]] = B."Wall Pipe";
        B.llIlIllIII[B.llIlIllIll[35]] = B."Garlic";
        B.llIlIllIII[B.llIlIllIll[36]] = B."Wall Pipe";
        B.llIlIllIII[B.llIlIllIll[37]] = B."Garlic";
        B.llIlIllIII[B.llIlIllIll[38]] = B."Start contest";
        B.llIlIllIII[B.llIlIllIll[20]] = B."Bonzo";
        B.llIlIllIII[B.llIlIllIll[39]] = B."I might still be able to find a bigger fish";
        B.llIlIllIII[B.llIlIllIll[40]] = B."Garlic";
        B.llIlIllIII[B.llIlIllIll[41]] = B."Raw giant carp";
        B.llIlIllIII[B.llIlIllIll[42]] = B."Fishing";
        B.llIlIllIII[B.llIlIllIll[44]] = B."Bait";
        B.llIlIllIII[B.llIlIllIll[45]] = B."Raw giant carp";
        B.llIlIllIII[B.llIlIllIll[46]] = B."Handing in fish";
        B.llIlIllIII[B.llIlIllIll[47]] = B."Bonzo";
        B.llIlIllIII[B.llIlIllIll[48]] = B."Fishing trophy";
        B.llIlIllIII[B.llIlIllIll[49]] = B."Nav to start";
        B.llIlIllIII[B.llIlIllIll[50]] = B."Finishing quest";
        B.llIlIllIII[B.llIlIllIll[51]] = B."Vestri";
        B.llIlIllIII[B.llIlIllIll[52]] = B."Camelot teleport";
        B.llIlIllIII[B.llIlIllIll[53]] = B."Garlic";
        B.llIlIllIII[B.llIlIllIll[54]] = B."Spade";
        B.llIlIllIII[B.llIlIllIll[55]] = B."Fishing rod";
        B.llIlIllIII[B.llIlIllIll[56]] = B."Fishing bait";
        B.llIlIllIII[B.llIlIllIll[63]] = B."Fishing contest";
        B.llIlIllIII[B.llIlIllIll[64]] = B."ring of wealth (";
        B.llIlIllIII[B.llIlIllIll[67]] = B."I was wondering what was down those stairs?";
        B.llIlIllIII[B.llIlIllIll[68]] = B."Why not?";
        B.llIlIllIII[B.llIlIllIll[69]] = B."If you were my friend I wouldn't mind it.";
        B.llIlIllIII[B.llIlIllIll[19]] = B."Well, let's be friends!";
        B.llIlIllIII[B.llIlIllIll[70]] = B."And how am I meant to do that?";
        B.llIlIllIII[B.llIlIllIll[71]] = B."I'll enter the competition please.";
        B.llIlIllIII[B.llIlIllIll[72]] = B."I have this big fish. Is it enough to win?";
        B.llIlIllIII[B.llIlIllIll[73]] = B."Yes.";
    }

    public static void by() {
        if (B.lIllIlIIlIIll(Skills.getLevel((Skill)Skill.FISHING), llIlIllIll[0])) {
            az.gH();
        }
        if (B.lIllIlIIlIlII(Skills.getLevel((Skill)Skill.FISHING), llIlIllIll[0])) {
            if (B.lIllIlIIlIlIl(bt ? 1 : 0)) {
                b.a(bv);
                if (B.lIllIlIIlIIll(bv.size(), llIlIllIll[1])) {
                    System.out.println(llIlIllIII[llIlIllIll[2]]);
                    bt = llIlIllIll[2];
                }
            }
            if (B.lIllIlIIlIllI(bt ? 1 : 0)) {
                if (B.lIllIlIIlIllI(B.an() ? 1 : 0) && B.lIllIlIIlIIll(e.j(ev), llIlIllIll[1])) {
                    String[] stringArray = new String[llIlIllIll[1]];
                    stringArray[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[1]];
                    if (B.lIllIlIIlIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        BankLocation var3 = BankLocation.getNearest();
                        if (B.lIllIlIIlIlll(var3) && B.lIllIlIIlIllI(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIllIII[llIlIllIll[3]];
                            a.a(var3);
                        }
                        if (B.lIllIlIIlIlll(var3) && B.lIllIlIIlIlIl(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (B.lIllIlIIlIllI(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIllIll[4]);
                                0;
                            }
                            if (B.lIllIlIIlIlIl(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderSotf.c = llIlIllIII[llIlIllIll[5]];
                                if (B.lIllIlIIllIII(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)llIlIllIll[6]);
                                    0;
                                }
                                if (B.lIllIlIIllIII(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)llIlIllIll[3]);
                                    0;
                                }
                                int[] nArray = new int[llIlIllIll[7]];
                                nArray[B.llIlIllIll[2]] = llIlIllIll[8];
                                nArray[B.llIlIllIll[1]] = llIlIllIll[9];
                                nArray[B.llIlIllIll[3]] = llIlIllIll[10];
                                nArray[B.llIlIllIll[5]] = llIlIllIll[11];
                                nArray[B.llIlIllIll[6]] = llIlIllIll[12];
                                nArray[B.llIlIllIll[13]] = llIlIllIll[14];
                                nArray[B.llIlIllIll[15]] = llIlIllIll[16];
                                if (B.lIllIlIIlIllI(e.c(nArray) ? 1 : 0)) {
                                    B.Q();
                                    System.out.println(llIlIllIII[llIlIllIll[6]]);
                                    bt = llIlIllIll[1];
                                    return;
                                }
                                int[] nArray2 = new int[llIlIllIll[15]];
                                nArray2[B.llIlIllIll[2]] = llIlIllIll[8];
                                nArray2[B.llIlIllIll[1]] = llIlIllIll[9];
                                nArray2[B.llIlIllIll[3]] = llIlIllIll[10];
                                nArray2[B.llIlIllIll[5]] = llIlIllIll[11];
                                nArray2[B.llIlIllIll[6]] = llIlIllIll[12];
                                nArray2[B.llIlIllIll[13]] = llIlIllIll[14];
                                if (B.lIllIlIIlIlIl(e.c(nArray2) ? 1 : 0)) {
                                    a.a(llIlIllIll[8], llIlIllIll[0]);
                                    a.a(llIlIllIll[14], llIlIllIll[0]);
                                    a.a(llIlIllIll[9], llIlIllIll[1]);
                                    a.a(llIlIllIll[10], llIlIllIll[1]);
                                    a.a(llIlIllIll[11], llIlIllIll[0]);
                                    a.a(llIlIllIll[12], llIlIllIll[1]);
                                    a.a(llIlIllIll[16], llIlIllIll[5]);
                                    a.a(llIlIllIll[17], llIlIllIll[18]);
                                }
                            }
                        }
                    }
                }
                if (B.lIllIlIIlIlIl(Inventory.contains((int[])f.ba) ? 1 : 0) && B.lIllIlIIlIIll(Movement.getRunEnergy(), llIlIllIll[19])) {
                    Inventory.getFirst((int[])f.ba).interact(llIlIllIII[llIlIllIll[13]]);
                    Time.sleepTicks((int)llIlIllIll[1]);
                    0;
                }
                if (B.lIllIlIIlIlIl(B.an() ? 1 : 0) && B.lIllIlIIlIIll(e.j(ev), llIlIllIll[1])) {
                    int[] nArray = new int[llIlIllIll[1]];
                    nArray[B.llIlIllIll[2]] = llIlIllIll[20];
                    if (B.lIllIlIIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        if (B.lIllIlIIllIIl(Players.getLocal().getWorldLocation().distanceTo(de), llIlIllIll[0])) {
                            AccBuilderSotf.c = llIlIllIII[llIlIllIll[15]];
                            if (B.lIllIlIIlIlIl(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)de);
                            0;
                            Time.sleepTicks((int)llIlIllIll[1]);
                            0;
                        }
                        if (B.lIllIlIIllIlI(Players.getLocal().getWorldLocation().distanceTo(de), llIlIllIll[21])) {
                            AccBuilderSotf.c = llIlIllIII[llIlIllIll[7]];
                            g.a(llIlIllIII[llIlIllIll[22]], cE);
                        }
                    }
                }
                if (B.lIllIlIIllIll(e.j(ev), llIlIllIll[1])) {
                    int[] nArray = new int[llIlIllIll[1]];
                    nArray[B.llIlIllIll[2]] = llIlIllIll[20];
                    if (B.lIllIlIIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray = new String[llIlIllIll[1]];
                        stringArray[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[23]];
                        if (B.lIllIlIIlIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            di = llIlIllIll[2];
                            String[] stringArray2 = new String[llIlIllIll[1]];
                            stringArray2[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[0]];
                            if (B.lIllIlIIlIllI(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                                if (B.lIllIlIIllIIl(Players.getLocal().getWorldLocation().distanceTo(er), llIlIllIll[6])) {
                                    AccBuilderSotf.c = llIlIllIII[llIlIllIll[24]];
                                    Movement.walkTo((WorldPoint)er);
                                    0;
                                }
                                if (B.lIllIlIIllIlI(Players.getLocal().getWorldLocation().distanceTo(er), llIlIllIll[6])) {
                                    AccBuilderSotf.c = llIlIllIII[llIlIllIll[21]];
                                    String[] stringArray3 = new String[llIlIllIll[1]];
                                    stringArray3[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[25]];
                                    if (B.lIllIlIIlIllI(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                        String[] stringArray4 = new String[llIlIllIll[1]];
                                        stringArray4[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[26]];
                                        if (B.lIllIlIIlIlll(TileObjects.getNearest((String[])stringArray4))) {
                                            String[] stringArray5 = new String[llIlIllIll[1]];
                                            stringArray5[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[27]];
                                            TileObjects.getNearest((String[])stringArray5).interact(llIlIllIII[llIlIllIll[28]]);
                                            Time.sleepTicks((int)llIlIllIll[3]);
                                            0;
                                        }
                                    }
                                }
                            }
                            String[] stringArray6 = new String[llIlIllIll[1]];
                            stringArray6[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[29]];
                            if (B.lIllIlIIlIlIl(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                                if (B.lIllIlIIlIllI(eo.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderSotf.c = llIlIllIII[llIlIllIll[30]];
                                    if (B.lIllIlIIlIllI(Dialog.isOpen() ? 1 : 0)) {
                                        Movement.walkTo((WorldPoint)eu);
                                        0;
                                        Time.sleepTicks((int)llIlIllIll[1]);
                                        0;
                                    }
                                    g.a(cE);
                                }
                                if (B.lIllIlIIlIlIl(eo.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] stringArray7 = new String[llIlIllIll[1]];
                                    stringArray7[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[31]];
                                    if (B.lIllIlIIlIlIl(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                                        AccBuilderSotf.c = llIlIllIII[llIlIllIll[32]];
                                        String[] stringArray8 = new String[llIlIllIll[1]];
                                        stringArray8[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[33]];
                                        if (B.lIllIlIIllIIl(Players.getLocal().getWorldLocation().distanceTo(TileObjects.getNearest((String[])stringArray8).getWorldLocation()), llIlIllIll[3])) {
                                            String[] stringArray9 = new String[llIlIllIll[1]];
                                            stringArray9[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[34]];
                                            Movement.walkTo((WorldPoint)TileObjects.getNearest((String[])stringArray9).getWorldLocation());
                                            0;
                                            Time.sleepTicks((int)llIlIllIll[6]);
                                            0;
                                        }
                                        if (B.lIllIlIIlIllI(Dialog.isOpen() ? 1 : 0)) {
                                            String[] stringArray10 = new String[llIlIllIll[1]];
                                            stringArray10[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[35]];
                                            String[] stringArray11 = new String[llIlIllIll[1]];
                                            stringArray11[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[36]];
                                            Inventory.getFirst((String[])stringArray10).useOn(TileObjects.getNearest((String[])stringArray11));
                                            Time.sleepTicks((int)llIlIllIll[3]);
                                            0;
                                        }
                                        g.a(cE);
                                    }
                                    String[] stringArray12 = new String[llIlIllIll[1]];
                                    stringArray12[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[37]];
                                    if (B.lIllIlIIlIllI(Inventory.contains((String[])stringArray12) ? 1 : 0) && B.lIllIlIIlIllI(ep ? 1 : 0)) {
                                        AccBuilderSotf.c = llIlIllIII[llIlIllIll[38]];
                                        g.a(llIlIllIII[llIlIllIll[20]], cE);
                                        if (B.lIllIlIIlIlIl(Dialog.getText().contains(llIlIllIII[llIlIllIll[39]]) ? 1 : 0)) {
                                            ep = llIlIllIll[1];
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (B.lIllIlIIllIll(e.j(ev), llIlIllIll[5])) {
                    String[] stringArray = new String[llIlIllIll[1]];
                    stringArray[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[40]];
                    if (B.lIllIlIIlIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray13 = new String[llIlIllIll[1]];
                        stringArray13[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[41]];
                        if (B.lIllIlIIlIllI(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIllIII[llIlIllIll[42]];
                            int[] nArray = new int[llIlIllIll[1]];
                            nArray[B.llIlIllIll[2]] = llIlIllIll[43];
                            NPCs.getNearest((int[])nArray).interact(llIlIllIII[llIlIllIll[44]]);
                            Time.sleepTicks((int)llIlIllIll[13]);
                            0;
                        }
                    }
                    String[] stringArray14 = new String[llIlIllIll[1]];
                    stringArray14[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[45]];
                    if (B.lIllIlIIlIlIl(Inventory.contains((String[])stringArray14) ? 1 : 0)) {
                        AccBuilderSotf.c = llIlIllIII[llIlIllIll[46]];
                        g.a(llIlIllIII[llIlIllIll[47]], cE);
                    }
                }
                String[] stringArray = new String[llIlIllIll[1]];
                stringArray[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[48]];
                if (B.lIllIlIIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (B.lIllIlIIllIIl(Players.getLocal().getWorldLocation().distanceTo(de), llIlIllIll[13])) {
                        AccBuilderSotf.c = llIlIllIII[llIlIllIll[49]];
                        Movement.walkTo((WorldPoint)de);
                        0;
                        Time.sleepTicks((int)llIlIllIll[1]);
                        0;
                    }
                    if (B.lIllIlIIllIlI(Players.getLocal().getWorldLocation().distanceTo(de), llIlIllIll[13])) {
                        AccBuilderSotf.c = llIlIllIII[llIlIllIll[50]];
                        if (B.lIllIlIIlIIll(di, llIlIllIll[1])) {
                            aN.qf += llIlIllIll[1];
                            aN.u(AccBuilderSotf.m);
                            di += llIlIllIll[1];
                            aN.qf = llIlIllIll[2];
                            dj = llIlIllIll[2];
                        }
                        g.a(llIlIllIII[llIlIllIll[51]], cE);
                    }
                }
            }
        }
    }
}

