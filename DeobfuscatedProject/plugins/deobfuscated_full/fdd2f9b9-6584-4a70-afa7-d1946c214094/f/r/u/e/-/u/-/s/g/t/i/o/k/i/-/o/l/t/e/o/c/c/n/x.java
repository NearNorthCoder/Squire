/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Quest
 *  net.runelite.api.QuestState
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
 *  net.unethicalite.api.quests.Quests
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.B;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.P;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.U;
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
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
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
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class x
implements G {
    static /* synthetic */ int ck;
    public static /* synthetic */ List<d> bv;
    public static final /* synthetic */ WorldPoint dj;
    private static /* synthetic */ String[] lIIlIllllI;
    static /* synthetic */ boolean cl;
    private static /* synthetic */ String[] bR;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int[] lIIllIIIII;
    public static final /* synthetic */ WorldPoint dk;

    private static boolean lIIIIIIIlllII(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIIIIIllIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIIIIlllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIIIIIIIIlllI(String var19, String var2) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var7 = var2.toCharArray();
        int var15 = lIIllIIIII[4];
        char[] var12 = var19.toCharArray();
        int var14 = var12.length;
        int var21 = lIIllIIIII[4];
        while (x.lIIIIIIIlIllI(var21, var14)) {
            char var22 = var12[var21];
            var16.append((char)(var22 ^ var7[var15 % var7.length]));
            0;
            ++var15;
            ++var21;
            0;
            if ((20 + 7 - 9 + 144 ^ 74 + 37 - 12 + 67) >= 0) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    private static boolean lIIIIIIIllIII(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        String[] stringArray = new String[lIIllIIIII[3]];
        stringArray[x.lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[49]];
        if (x.lIIIIIIIlllII(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[lIIllIIIII[3]];
            nArray[x.lIIllIIIII[4]] = lIIllIIIII[14];
            if (x.lIIIIIIIlllII(Inventory.getCount((int[])nArray))) {
                String[] stringArray2 = new String[lIIllIIIII[3]];
                stringArray2[x.lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[50]];
                if (x.lIIIIIIIllIIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    int[] nArray2 = new int[lIIllIIIII[3]];
                    nArray2[x.lIIllIIIII[4]] = lIIllIIIII[18];
                    if (x.lIIIIIIIllIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                        int[] nArray3 = new int[lIIllIIIII[3]];
                        nArray3[x.lIIllIIIII[4]] = lIIllIIIII[11];
                        if (x.lIIIIIIIllIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            n2 = lIIllIIIII[3];
                            0;
                            if ((0x4D ^ 0x49) >= 0) return n2 != 0;
                            return false;
                        }
                    }
                }
            }
        }
        n2 = lIIllIIIII[4];
        return n2 != 0;
    }

    private static boolean lIIIIIIIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void af() {
        block16: {
            d var1;
            block15: {
                Object var17;
                block14: {
                    block13: {
                        int[] nArray = new int[lIIllIIIII[3]];
                        nArray[x.lIIllIIIII[4]] = lIIllIIIII[19];
                        if (x.lIIIIIIIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(lIIllIIIII[19], lIIllIIIII[2], i.bq);
                            bv.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[lIIllIIIII[3]];
                        nArray2[x.lIIllIIIII[4]] = lIIllIIIII[11];
                        if (x.lIIIIIIIllIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            var17 = new d(lIIllIIIII[11], lIIllIIIII[3], lIIllIIIII[51]);
                            bv.add((d)var17);
                            0;
                        }
                        int[] nArray3 = new int[lIIllIIIII[3]];
                        nArray3[x.lIIllIIIII[4]] = lIIllIIIII[14];
                        if (x.lIIIIIIIllIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            var17 = new d(lIIllIIIII[14], lIIllIIIII[3], lIIllIIIII[51]);
                            bv.add((d)var17);
                            0;
                        }
                        int[] nArray4 = new int[lIIllIIIII[3]];
                        nArray4[x.lIIllIIIII[4]] = lIIllIIIII[18];
                        if (x.lIIIIIIIllIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            var17 = new d(lIIllIIIII[18], lIIllIIIII[3], lIIllIIIII[51]);
                            bv.add((d)var17);
                            0;
                        }
                        int[] nArray5 = new int[lIIllIIIII[3]];
                        nArray5[x.lIIllIIIII[4]] = lIIllIIIII[16];
                        if (x.lIIIIIIIllIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            var17 = new d(lIIllIIIII[16], lIIllIIIII[3], lIIllIIIII[51]);
                            bv.add((d)var17);
                            0;
                        }
                        int[] nArray6 = new int[lIIllIIIII[3]];
                        nArray6[x.lIIllIIIII[4]] = lIIllIIIII[13];
                        if (x.lIIIIIIIllIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            var17 = new d(lIIllIIIII[13], lIIllIIIII[3], lIIllIIIII[52]);
                            bv.add((d)var17);
                            0;
                        }
                        int[] nArray7 = new int[lIIllIIIII[3]];
                        nArray7[x.lIIllIIIII[4]] = lIIllIIIII[10];
                        if (!x.lIIIIIIIllIIl(Bank.contains((int[])nArray7) ? 1 : 0)) break block13;
                        int[] nArray8 = new int[lIIllIIIII[3]];
                        nArray8[x.lIIllIIIII[4]] = lIIllIIIII[10];
                        if (!x.lIIIIIIIllIIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block14;
                        int[] nArray9 = new int[lIIllIIIII[3]];
                        nArray9[x.lIIllIIIII[4]] = lIIllIIIII[10];
                        if (!x.lIIIIIIIlIllI(Bank.getFirst((int[])nArray9).getQuantity(), lIIllIIIII[2])) break block14;
                    }
                    var17 = new d(lIIllIIIII[10], lIIllIIIII[2], lIIllIIIII[53]);
                    bv.add((d)var17);
                    0;
                }
                if (x.lIIIIIIIllIlI(Bank.contains((Predicate)(var17 = item -> item.getName().toLowerCase().contains(lIIlIllllI[lIIllIIIII[59]]))) ? 1 : 0)) {
                    var1 = new d(lIIllIIIII[54], lIIllIIIII[15], lIIllIIIII[55]);
                    bv.add(var1);
                    0;
                }
                int[] nArray = new int[lIIllIIIII[3]];
                nArray[x.lIIllIIIII[4]] = lIIllIIIII[9];
                if (!x.lIIIIIIIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block15;
                int[] nArray10 = new int[lIIllIIIII[3]];
                nArray10[x.lIIllIIIII[4]] = lIIllIIIII[9];
                if (!x.lIIIIIIIllIIl(Bank.contains((int[])nArray10) ? 1 : 0)) break block16;
                int[] nArray11 = new int[lIIllIIIII[3]];
                nArray11[x.lIIllIIIII[4]] = lIIllIIIII[9];
                if (!x.lIIIIIIIlIllI(Bank.getFirst((int[])nArray11).getQuantity(), lIIllIIIII[2])) break block16;
            }
            var1 = new d(lIIllIIIII[9], lIIllIIIII[56], lIIllIIIII[52]);
            bv.add(var1);
            0;
        }
    }

    private static String lIIIIIIIlIIII(String var4, String var8) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), lIIllIIIII[23]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lIIllIIIII[1], var20);
            return new String(var5.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    @Override
    public int T() {
        try {
            System.out.println("678: " + e.j(lIIllIIIII[5]));
            x.bh();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 == ((0x95 ^ 0x80) & ~(0x80 ^ 0x95))) {
            return (0xBE ^ 0x85) & ~(0x18 ^ 0x23);
        }
        return lIIllIIIII[57];
    }

    private static boolean lIIIIIIIlIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIIIIIIlIlIl() {
        lIIllIIIII = new int[79];
        x.lIIllIIIII[0] = 0x98 ^ 0xC5 ^ (7 ^ 0x47);
        x.lIIllIIIII[1] = 2;
        x.lIIllIIIII[2] = 0x1C ^ 0x23 ^ (0x17 ^ 0x22);
        x.lIIllIIIII[3] = 1;
        x.lIIllIIIII[4] = (210 + 231 - 440 + 246 ^ 11 + 108 - 53 + 98) & (147 + 140 - 178 + 106 ^ 56 + 111 - 56 + 21 ^ -1);
        x.lIIllIIIII[5] = -(0xFFFFF9BA & 0x5E57) & (0xFFFFDAB7 & Short.MAX_VALUE);
        x.lIIllIIIII[6] = -(0xFFFFDF77 & 0x2CBD) & (0xFFFF9FFE & 0x7FBD);
        x.lIIllIIIII[7] = 0x46 ^ 0x42;
        x.lIIllIIIII[8] = 95 + 109 - 112 + 70 ^ 138 + 39 - 102 + 90;
        x.lIIllIIIII[9] = 0xFFFFDF5F & 0x3FE7;
        x.lIIllIIIII[10] = -(0xFFFFFE73 & 0x619F) & (0xFFFFFF5F & 0x7FFA);
        x.lIIllIIIII[11] = 0xFFFF8FFF & 0x79F8;
        x.lIIllIIIII[12] = 3;
        x.lIIllIIIII[13] = 84 + 58 - -49 + 30;
        x.lIIllIIIII[14] = 0xFFFFAF77 & 0x57FD;
        x.lIIllIIIII[15] = 0x64 ^ 0x61;
        x.lIIllIIIII[16] = 0xFFFFDCFC & 0x2B27;
        x.lIIllIIIII[17] = 0x81 ^ 0x87;
        x.lIIllIIIII[18] = -(0xFFFFACF3 & 0x7F2D) & (0xFFFFAFF2 & 0x7E7D);
        x.lIIllIIIII[19] = -(0xFFFFEEEF & 0x55BB) & (0xFFFFF7FB & 0x7DFF);
        x.lIIllIIIII[20] = 0xFFFFFBFB & 0x7E7;
        x.lIIllIIIII[21] = 0x27 ^ 0x15;
        x.lIIllIIIII[22] = 0xFFFFCFF6 & 0x39DF;
        x.lIIllIIIII[23] = 0xC8 ^ 0xC0;
        x.lIIllIIIII[24] = 0xA8 ^ 0xA1;
        x.lIIllIIIII[25] = 0xFFFFBEFD & 0x4DDF;
        x.lIIllIIIII[26] = 0xFFFFEFFF & 0x1C76;
        x.lIIllIIIII[27] = 0xB6 ^ 0xC0;
        x.lIIllIIIII[28] = 8 + 77 - -40 + 12;
        x.lIIllIIIII[29] = -1;
        x.lIIllIIIII[30] = 0xE ^ 5;
        x.lIIllIIIII[31] = 0x2B ^ 0x27;
        x.lIIllIIIII[32] = 0xFFFFE57D & 0x1BAE;
        x.lIIllIIIII[33] = 0x43 ^ 0x1D ^ (4 ^ 0x57);
        x.lIIllIIIII[34] = 31 + 68 - -61 + 28 ^ 46 + 109 - 40 + 63;
        x.lIIllIIIII[35] = 0x9D ^ 0x8D;
        x.lIIllIIIII[36] = 0x5F ^ 0x50;
        x.lIIllIIIII[37] = 0xEA ^ 0xC7 ^ (0x14 ^ 0x28);
        x.lIIllIIIII[38] = 0x85 ^ 0x97;
        x.lIIllIIIII[39] = 0x5A ^ 0 ^ (0xCC ^ 0x85);
        x.lIIllIIIII[40] = 0x27 ^ 0x6E ^ (0xFA ^ 0xA7);
        x.lIIllIIIII[41] = 0x7A ^ 0x6F;
        x.lIIllIIIII[42] = 111 + 41 - 27 + 21 ^ 111 + 124 - 112 + 9;
        x.lIIllIIIII[43] = 8 ^ 0x1F;
        x.lIIllIIIII[44] = 0x7E ^ 0x10 ^ (0x1D ^ 0x6B);
        x.lIIllIIIII[45] = 5 ^ 0x4A ^ (0x6E ^ 0x38);
        x.lIIllIIIII[46] = 0x40 ^ 0x5A;
        x.lIIllIIIII[47] = 75 + 46 - 21 + 31 ^ 72 + 31 - -42 + 7;
        x.lIIllIIIII[48] = 0x6B ^ 0x77;
        x.lIIllIIIII[49] = 0x19 ^ 7;
        x.lIIllIIIII[50] = 0x99 ^ 0x86;
        x.lIIllIIIII[51] = -(135 + 28 - 72 + 58) & (0xFFFFE3FF & 0x3FBC);
        x.lIIllIIIII[52] = -(0xFFFFF5CB & 0x6E7F) & (0xFFFFE7CF & 0x7FFE);
        x.lIIllIIIII[53] = 0xFFFFCFFF & 0x376C;
        x.lIIllIIIII[54] = 0xFFFFEEEE & 0x3FDD;
        x.lIIllIIIII[55] = 0xFFFFE1E9 & 0x7FBE;
        x.lIIllIIIII[56] = 0x42 ^ 0x19 ^ (0x54 ^ 0x27);
        x.lIIllIIIII[57] = 162 + 213 - 243 + 113 ^ 101 + 69 - 121 + 96;
        x.lIIllIIIII[58] = 70 + 150 - 192 + 159 ^ 145 + 54 - 66 + 22;
        x.lIIllIIIII[59] = 0x55 ^ 0x74;
        x.lIIllIIIII[60] = 0x48 ^ 0x7E ^ (0xB3 ^ 0xA7);
        x.lIIllIIIII[61] = 0x24 ^ 0x22 ^ (0x2E ^ 0xB);
        x.lIIllIIIII[62] = 0x7A ^ 0x73 ^ (0x75 ^ 0x58);
        x.lIIllIIIII[63] = 0x5C ^ 0x79;
        x.lIIllIIIII[64] = 0xB4 ^ 0x92;
        x.lIIllIIIII[65] = 0x2F ^ 0x45 ^ (0x21 ^ 0x6C);
        x.lIIllIIIII[66] = 0xE7 ^ 0xC2 ^ (0xA2 ^ 0xAE);
        x.lIIllIIIII[67] = 0xFFFFAEC7 & 0x5DBF;
        x.lIIllIIIII[68] = 0xFFFF9FFF & 0x6C8E;
        x.lIIllIIIII[69] = 0xFFFFEDF7 & 0x1F3E;
        x.lIIllIIIII[70] = -(0x62 ^ 0x5B) & (0xFFFFBDFB & 0x4EFF);
        x.lIIllIIIII[71] = 125 + 139 - 192 + 100 ^ 65 + 71 - 92 + 90;
        x.lIIllIIIII[72] = 0x86 ^ 0xAD;
        x.lIIllIIIII[73] = 0x2C ^ 0;
        x.lIIllIIIII[74] = 0x27 ^ 0xA;
        x.lIIllIIIII[75] = 0x81 ^ 0xAF;
        x.lIIllIIIII[76] = 158 + 111 - 161 + 75 ^ 93 + 56 - 77 + 80;
        x.lIIllIIIII[77] = 0xB7 ^ 0x85 ^ 2;
        x.lIIllIIIII[78] = 0xB4 ^ 0x85;
    }

    private static boolean lIIIIIIlIIIII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIIIIIllIIl(int n2) {
        return n2 != 0;
    }

    static {
        x.lIIIIIIIlIlIl();
        x.lIIIIIIIlIlII();
        dj = new WorldPoint(lIIllIIIII[67], lIIllIIIII[68], lIIllIIIII[4]);
        dk = new WorldPoint(lIIllIIIII[69], lIIllIIIII[70], lIIllIIIII[4]);
        bv = new ArrayList<d>();
        String[] stringArray = new String[lIIllIIIII[23]];
        stringArray[x.lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[71]];
        stringArray[x.lIIllIIIII[3]] = lIIlIllllI[lIIllIIIII[72]];
        stringArray[x.lIIllIIIII[1]] = lIIlIllllI[lIIllIIIII[73]];
        stringArray[x.lIIllIIIII[12]] = lIIlIllllI[lIIllIIIII[74]];
        stringArray[x.lIIllIIIII[7]] = lIIlIllllI[lIIllIIIII[75]];
        stringArray[x.lIIllIIIII[15]] = lIIlIllllI[lIIllIIIII[76]];
        stringArray[x.lIIllIIIII[17]] = lIIlIllllI[lIIllIIIII[77]];
        stringArray[x.lIIllIIIII[8]] = lIIlIllllI[lIIllIIIII[78]];
        bR = stringArray;
    }

    private static boolean lIIIIIIIlllll(Object object) {
        return object == null;
    }

    private static boolean lIIIIIIIllllI(int n2, int n3) {
        return n2 <= n3;
    }

    public static void bh() {
        if (x.lIIIIIIIlIllI(e.j(lIIllIIIII[0]), lIIllIIIII[1])) {
            B.bF();
        }
        if (x.lIIIIIIIlIllI(Skills.getLevel((Skill)Skill.COOKING), lIIllIIIII[2]) && x.lIIIIIIIlIlll(e.j(lIIllIIIII[0]), lIIllIIIII[1])) {
            P.cL();
        }
        if (x.lIIIIIIIllIII(Skills.getLevel((Skill)Skill.COOKING), lIIllIIIII[2]) && x.lIIIIIIIlIlll(e.j(lIIllIIIII[0]), lIIllIIIII[1])) {
            if (x.lIIIIIIIllIIl(bt ? 1 : 0)) {
                b.a(bv);
                if (x.lIIIIIIIlIllI(bv.size(), lIIllIIIII[3])) {
                    System.out.println(lIIlIllllI[lIIllIIIII[4]]);
                    bt = lIIllIIIII[4];
                }
            }
            if (x.lIIIIIIIllIlI(bt ? 1 : 0)) {
                BankLocation var3;
                if (x.lIIIIIIIllIlI(x.ab() ? 1 : 0) && x.lIIIIIIIllIlI(e.j(lIIllIIIII[5]))) {
                    var3 = BankLocation.getNearest();
                    if (x.lIIIIIIIllIll(var3) && x.lIIIIIIIllIlI(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlIllllI[lIIllIIIII[3]];
                        a.a(var3);
                    }
                    if (x.lIIIIIIIllIll(var3) && x.lIIIIIIIllIIl(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (x.lIIIIIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIllIIIII[6]);
                            0;
                        }
                        if (x.lIIIIIIIllIIl(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderRogues.c = lIIlIllllI[lIIllIIIII[1]];
                            if (x.lIIIIIIIlllII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIllIIIII[7]);
                                0;
                            }
                            if (x.lIIIIIIIlllII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIllIIIII[1]);
                                0;
                            }
                            int[] nArray = new int[lIIllIIIII[8]];
                            nArray[x.lIIllIIIII[4]] = lIIllIIIII[9];
                            nArray[x.lIIllIIIII[3]] = lIIllIIIII[10];
                            nArray[x.lIIllIIIII[1]] = lIIllIIIII[11];
                            nArray[x.lIIllIIIII[12]] = lIIllIIIII[13];
                            nArray[x.lIIllIIIII[7]] = lIIllIIIII[14];
                            nArray[x.lIIllIIIII[15]] = lIIllIIIII[16];
                            nArray[x.lIIllIIIII[17]] = lIIllIIIII[18];
                            if (x.lIIIIIIIllIlI(e.b(nArray) ? 1 : 0)) {
                                x.af();
                                System.out.println(lIIlIllllI[lIIllIIIII[12]]);
                                bt = lIIllIIIII[3];
                                return;
                            }
                            int[] nArray2 = new int[lIIllIIIII[8]];
                            nArray2[x.lIIllIIIII[4]] = lIIllIIIII[9];
                            nArray2[x.lIIllIIIII[3]] = lIIllIIIII[10];
                            nArray2[x.lIIllIIIII[1]] = lIIllIIIII[11];
                            nArray2[x.lIIllIIIII[12]] = lIIllIIIII[13];
                            nArray2[x.lIIllIIIII[7]] = lIIllIIIII[14];
                            nArray2[x.lIIllIIIII[15]] = lIIllIIIII[16];
                            nArray2[x.lIIllIIIII[17]] = lIIllIIIII[18];
                            if (x.lIIIIIIIllIIl(e.b(nArray2) ? 1 : 0)) {
                                a.a(lIIllIIIII[9], lIIllIIIII[2]);
                                a.a(lIIllIIIII[10], lIIllIIIII[2]);
                                a.a(lIIllIIIII[11], lIIllIIIII[3]);
                                a.a(lIIllIIIII[13], lIIllIIIII[3]);
                                a.a(lIIllIIIII[14], lIIllIIIII[3]);
                                a.a(lIIllIIIII[16], lIIllIIIII[3]);
                                a.a(lIIllIIIII[18], lIIllIIIII[3]);
                                a.a(lIIllIIIII[19], lIIllIIIII[1]);
                                a.a(lIIllIIIII[20], lIIllIIIII[6]);
                            }
                        }
                    }
                }
                if (x.lIIIIIIIllIIl(Inventory.contains((int[])f.aV) ? 1 : 0) && x.lIIIIIIIlIllI(Movement.getRunEnergy(), lIIllIIIII[21])) {
                    Inventory.getFirst((int[])f.aV).interact(lIIlIllllI[lIIllIIIII[7]]);
                    Time.sleepTicks((int)lIIllIIIII[3]);
                    0;
                }
                if (x.lIIIIIIIllIlI(e.j(lIIllIIIII[5])) && x.lIIIIIIIllIIl(x.ab() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIllllI[lIIllIIIII[15]];
                    if (x.lIIIIIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dj), lIIllIIIII[12])) {
                        if (x.lIIIIIIIllIIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)dj);
                        0;
                        Time.sleepTicks((int)lIIllIIIII[3]);
                        0;
                    }
                    if (x.lIIIIIIIllllI(Players.getLocal().getWorldLocation().distanceTo(dj), lIIllIIIII[12])) {
                        AccBuilderRogues.c = lIIlIllllI[lIIllIIIII[17]];
                        g.a(lIIlIllllI[lIIllIIIII[8]], bR);
                    }
                }
                if (x.lIIIIIIIlIlll(e.j(lIIllIIIII[5]), lIIllIIIII[3])) {
                    int[] nArray = new int[lIIllIIIII[3]];
                    nArray[x.lIIllIIIII[4]] = lIIllIIIII[22];
                    if (x.lIIIIIIIllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray = new String[lIIllIIIII[3]];
                        stringArray[x.lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[23]];
                        if (x.lIIIIIIIllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            ck = lIIllIIIII[4];
                            if (x.lIIIIIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dk), lIIllIIIII[7])) {
                                AccBuilderRogues.c = lIIlIllllI[lIIllIIIII[24]];
                                var3 = new WorldArea(lIIllIIIII[25], lIIllIIIII[26], lIIllIIIII[27], lIIllIIIII[28], lIIllIIIII[4]);
                                if (x.lIIIIIIIllIlI(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (x.lIIIIIIIllIIl(Inventory.contains(item -> item.getName().contains(lIIlIllllI[lIIllIIIII[66]])) ? 1 : 0) && x.lIIIIIIIllIlI(Equipment.contains(item -> item.getName().contains(lIIlIllllI[lIIllIIIII[56]])) ? 1 : 0)) {
                                        Inventory.getFirst(item -> item.getName().contains(lIIlIllllI[lIIllIIIII[65]])).interact(lIIlIllllI[lIIllIIIII[2]]);
                                    }
                                    if (x.lIIIIIIIllIIl(Equipment.contains(item -> item.getName().contains(lIIlIllllI[lIIllIIIII[64]])) ? 1 : 0) && x.lIIIIIIIlIlll(Players.getLocal().getAnimation(), lIIllIIIII[29])) {
                                        Equipment.getFirst(item -> item.getName().contains(lIIlIllllI[lIIllIIIII[63]])).interact(lIIlIllllI[lIIllIIIII[30]]);
                                        Time.sleepTicks((int)lIIllIIIII[7]);
                                        0;
                                    }
                                }
                                if (x.lIIIIIIIllIIl(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)dk);
                                    0;
                                    Time.sleepTicks((int)lIIllIIIII[3]);
                                    0;
                                }
                            }
                            if (x.lIIIIIIIllllI(Players.getLocal().getWorldLocation().distanceTo(dk), lIIllIIIII[7])) {
                                AccBuilderRogues.c = lIIlIllllI[lIIllIIIII[31]];
                                if (x.lIIIIIIIllIIl(Widgets.get((int)lIIllIIIII[32]).isEmpty() ? 1 : 0)) {
                                    String[] stringArray2 = new String[lIIllIIIII[3]];
                                    stringArray2[x.lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[33]];
                                    NPCs.getNearest((String[])stringArray2).interact(lIIlIllllI[lIIllIIIII[34]]);
                                    Time.sleepTicks((int)lIIllIIIII[12]);
                                    0;
                                }
                                if (x.lIIIIIIIllIlI(Widgets.get((int)lIIllIIIII[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get((int)lIIllIIIII[32], (int)lIIllIIIII[35], (int)lIIllIIIII[3]).interact(lIIlIllllI[lIIllIIIII[36]]);
                                    Time.sleepTicks((int)lIIllIIIII[1]);
                                    0;
                                }
                                int[] nArray3 = new int[lIIllIIIII[3]];
                                nArray3[x.lIIllIIIII[4]] = lIIllIIIII[22];
                                if (x.lIIIIIIIllIIl(Inventory.contains((int[])nArray3) ? 1 : 0) && x.lIIIIIIIllIlI(Widgets.get((int)lIIllIIIII[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get((int)lIIllIIIII[32], (int)lIIllIIIII[3], (int)lIIllIIIII[30]).interact(lIIlIllllI[lIIllIIIII[35]]);
                                    Time.sleepTicks((int)lIIllIIIII[3]);
                                    0;
                                }
                            }
                        }
                    }
                    int[] nArray4 = new int[lIIllIIIII[3]];
                    nArray4[x.lIIllIIIII[4]] = lIIllIIIII[22];
                    if (x.lIIIIIIIllIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        String[] stringArray = new String[lIIllIIIII[3]];
                        stringArray[x.lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[37]];
                        if (x.lIIIIIIIllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            int[] nArray5 = new int[lIIllIIIII[3]];
                            nArray5[x.lIIllIIIII[4]] = lIIllIIIII[22];
                            if (x.lIIIIIIIllIIl(Inventory.contains((int[])nArray5) ? 1 : 0) && x.lIIIIIIIllIlI(Widgets.get((int)lIIllIIIII[32]).isEmpty() ? 1 : 0)) {
                                Widgets.get((int)lIIllIIIII[32], (int)lIIllIIIII[3], (int)lIIllIIIII[30]).interact(lIIlIllllI[lIIllIIIII[38]]);
                                Time.sleepTicks((int)lIIllIIIII[3]);
                                0;
                            }
                            int[] nArray6 = new int[lIIllIIIII[3]];
                            nArray6[x.lIIllIIIII[4]] = lIIllIIIII[18];
                            String[] stringArray3 = new String[lIIllIIIII[3]];
                            stringArray3[x.lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[39]];
                            Inventory.getFirst((int[])nArray6).useOn(Inventory.getFirst((String[])stringArray3));
                            Time.sleepTicks((int)lIIllIIIII[1]);
                            0;
                        }
                    }
                    String[] stringArray = new String[lIIllIIIII[3]];
                    stringArray[x.lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[40]];
                    if (x.lIIIIIIIllIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        if (x.lIIIIIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dj), lIIllIIIII[12])) {
                            if (x.lIIIIIIIllIIl(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            if (x.lIIIIIIIllIIl(Inventory.contains(item -> item.getName().contains(lIIlIllllI[lIIllIIIII[62]])) ? 1 : 0) && x.lIIIIIIIllIlI(Equipment.contains(item -> item.getName().contains(lIIlIllllI[lIIllIIIII[61]])) ? 1 : 0)) {
                                Inventory.getFirst(item -> item.getName().contains(lIIlIllllI[lIIllIIIII[60]])).interact(lIIlIllllI[lIIllIIIII[41]]);
                                Time.sleepTicks((int)lIIllIIIII[1]);
                                0;
                            }
                            Movement.walkTo((WorldPoint)dj);
                            0;
                            Time.sleepTicks((int)lIIllIIIII[3]);
                            0;
                        }
                        if (x.lIIIIIIIllllI(Players.getLocal().getWorldLocation().distanceTo(dj), lIIllIIIII[12])) {
                            AccBuilderRogues.c = lIIlIllllI[lIIllIIIII[42]];
                            if (x.lIIIIIIIlIllI(ck, lIIllIIIII[3])) {
                                U.lq += lIIllIIIII[3];
                                U.o(AccBuilderRogues.m);
                                ck += lIIllIIIII[3];
                                U.lq = lIIllIIIII[4];
                                cl = lIIllIIIII[4];
                            }
                            g.a(lIIlIllllI[lIIllIIIII[43]], bR);
                        }
                    }
                }
                if (x.lIIIIIIIlIlll(e.j(lIIllIIIII[5]), lIIllIIIII[1])) {
                    String[] stringArray = new String[lIIllIIIII[3]];
                    stringArray[x.lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[44]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIllllI[lIIllIIIII[45]]);
                    Time.sleepTicks((int)lIIllIIIII[1]);
                    0;
                }
            }
        }
    }

    @Override
    public boolean S() {
        return lIIllIIIII[4];
    }

    @Override
    public String U() {
        return lIIlIllllI[lIIllIIIII[58]];
    }

    private static String lIIIIIIIIllll(String var10, String var6) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(lIIllIIIII[1], var11);
            return new String(var9.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static void lIIIIIIIlIlII() {
        lIIlIllllI = new String[lIIllIIIII[21]];
        x.lIIlIllllI[x.lIIllIIIII[4]] = x."Finished buying items, switching back to quest";
        x.lIIlIllllI[x.lIIllIIIII[3]] = x."Nav to bank";
        x.lIIlIllllI[x.lIIllIIIII[1]] = x."Handling banking";
        x.lIIlIllllI[x.lIIllIIIII[12]] = x."We are missing quest supplies, switching to BUYING";
        x.lIIlIllllI[x.lIIllIIIII[7]] = x."Drink";
        x.lIIlIllllI[x.lIIllIIIII[15]] = x."Nav to start";
        x.lIIlIllllI[x.lIIllIIIII[17]] = x."Handling dialog";
        x.lIIlIllllI[x.lIIllIIIII[8]] = x."Cook";
        x.lIIlIllllI[x.lIIllIIIII[23]] = x."Dirty blast";
        x.lIIlIllllI[x.lIIllIIIII[24]] = x."Nav to rotten tomato";
        x.lIIlIllllI[x.lIIllIIIII[2]] = x."Wear";
        x.lIIlIllllI[x.lIIllIIIII[30]] = x."PvP Arena";
        x.lIIlIllllI[x.lIIllIIIII[31]] = x."Getting tomato";
        x.lIIlIllllI[x.lIIllIIIII[33]] = x."Fadli";
        x.lIIlIllllI[x.lIIllIIIII[34]] = x."Buy";
        x.lIIlIllllI[x.lIIllIIIII[36]] = x."Buy 1";
        x.lIIlIllllI[x.lIIllIIIII[35]] = x."Close";
        x.lIIlIllllI[x.lIIllIIIII[37]] = x."Dirty blast";
        x.lIIlIllllI[x.lIIllIIIII[38]] = x."Close";
        x.lIIlIllllI[x.lIIllIIIII[39]] = x."Fruit blast";
        x.lIIlIllllI[x.lIIllIIIII[40]] = x."Dirty blast";
        x.lIIlIllllI[x.lIIllIIIII[41]] = x."Wear";
        x.lIIlIllllI[x.lIIllIIIII[42]] = x."Handling dialog";
        x.lIIlIllllI[x.lIIllIIIII[43]] = x."Cook";
        x.lIIlIllllI[x.lIIllIIIII[44]] = x."Door";
        x.lIIlIllllI[x.lIIllIIIII[45]] = x."Open";
        x.lIIlIllllI[x.lIIllIIIII[46]] = x."Aris";
        x.lIIlIllllI[x.lIIllIIIII[47]] = x."Entering room";
        x.lIIlIllllI[x.lIIllIIIII[48]] = x."Door";
        x.lIIlIllllI[x.lIIllIIIII[0]] = x."Open";
        x.lIIlIllllI[x.lIIllIIIII[49]] = x."Eye of newt";
        x.lIIlIllllI[x.lIIllIIIII[50]] = x."Fruit blast";
        x.lIIlIllllI[x.lIIllIIIII[58]] = x."RFD start quest";
        x.lIIlIllllI[x.lIIllIIIII[59]] = x."ring of wealth (";
        x.lIIlIllllI[x.lIIllIIIII[60]] = x."dueling";
        x.lIIlIllllI[x.lIIllIIIII[61]] = x."dueling";
        x.lIIlIllllI[x.lIIllIIIII[62]] = x."dueling";
        x.lIIlIllllI[x.lIIllIIIII[63]] = x."dueling";
        x.lIIlIllllI[x.lIIllIIIII[64]] = x."dueling";
        x.lIIlIllllI[x.lIIllIIIII[65]] = x."dueling";
        x.lIIlIllllI[x.lIIllIIIII[56]] = x."dueling";
        x.lIIlIllllI[x.lIIllIIIII[66]] = x."dueling";
        x.lIIlIllllI[x.lIIllIIIII[71]] = x."Can you make me a cake?";
        x.lIIlIllllI[x.lIIllIIIII[72]] = x."I'm always happy to help a cook in distress.";
        x.lIIlIllllI[x.lIIllIIIII[73]] = x."Actually, I know where to find this stuff.";
        x.lIIlIllllI[x.lIIllIIIII[74]] = x."Yes.";
        x.lIIlIllllI[x.lIIllIIIII[75]] = x."What's wrong?";
        x.lIIlIllllI[x.lIIllIIIII[76]] = x."Do you have any other quests for me?";
        x.lIIlIllllI[x.lIIllIIIII[77]] = x."Angry! It makes me angry!";
        x.lIIlIllllI[x.lIIllIIIII[78]] = x."What seems to be the problem?";
    }

    private static boolean lIIIIIIIllIll(Object object) {
        return object != null;
    }

    public static void bi() {
        String[] stringArray = new String[lIIllIIIII[3]];
        stringArray[x.lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[46]];
        if (x.lIIIIIIIlllll(NPCs.getNearest((String[])stringArray))) {
            if (x.lIIIIIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dj), lIIllIIIII[12])) {
                if (x.lIIIIIIIllIIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                Movement.walkTo((WorldPoint)dj);
                0;
                Time.sleepTicks((int)lIIllIIIII[3]);
                0;
            }
            if (x.lIIIIIIIllllI(Players.getLocal().getWorldLocation().distanceTo(dj), lIIllIIIII[12])) {
                AccBuilderRogues.c = lIIlIllllI[lIIllIIIII[47]];
                String[] stringArray2 = new String[lIIllIIIII[3]];
                stringArray2[x.lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[48]];
                TileObjects.getNearest((String[])stringArray2).interact(lIIlIllllI[lIIllIIIII[0]]);
                Time.sleepTicks((int)lIIllIIIII[1]);
                0;
            }
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (x.lIIIIIIlIIIII(Quests.getState((Quest)Quest.RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST), QuestState.FINISHED)) {
            bl = lIIllIIIII[3];
            0;
            
            }
        } else {
            bl = lIIllIIIII[4];
        }
        return bl;
    }
}

