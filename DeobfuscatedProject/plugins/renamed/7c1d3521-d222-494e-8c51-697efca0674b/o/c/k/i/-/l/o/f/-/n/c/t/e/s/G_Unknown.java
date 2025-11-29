/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Actor
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
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
import net.runelite.api.Actor;
import net.runelite.api.Prayer;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.H_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aN_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;

public class G_Unknown
implements ac {
    public static final /* synthetic */ int fJ;
    public static final /* synthetic */ WorldPoint fO;
    private static /* synthetic */ String[] lIllllIIII;
    public static final /* synthetic */ WorldPoint fQ;
    static /* synthetic */ WorldArea fR;
    public static final /* synthetic */ int fK;
    public static final /* synthetic */ WorldPoint fM;
    static /* synthetic */ int dF;
    public static /* synthetic */ List<d> bv;
    public static final /* synthetic */ WorldPoint fP;
    static /* synthetic */ String[] cE;
    public static final /* synthetic */ int fI;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ boolean dj;
    public static final /* synthetic */ int fH;
    private static /* synthetic */ int[] lIllllIIlI;
    public static final /* synthetic */ WorldPoint fN;
    static /* synthetic */ int di;
    public static final /* synthetic */ WorldPoint fL;

    private static boolean lIIlllllIlIIl(Object object) {
        return object == null;
    }

    private static String lIIllllIlIllI(String var20, String var30) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var15 = var30.toCharArray();
        int var10 = lIllllIIlI[1];
        char[] var18 = var20.toCharArray();
        int var6 = var18.length;
        int var1 = lIllllIIlI[1];
        while (G.lIIlllllIIIII(var1, var6)) {
            char var11 = var18[var1];
            var5.append((char)(var11 ^ var15[var10 % var15.length]));
            0;
            ++var10;
            ++var1;
            0;
            if (3 != ((0x2D ^ 0x71) & ~(0x4B ^ 0x17))) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    private static boolean lIIllllIlllll(int n2) {
        return n2 != 0;
    }

    @Override
    public int af() {
        try {
            G.cb();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 <= 0) {
            return (0xC5 ^ 0xC2) & ~(0x21 ^ 0x26);
        }
        return lIllllIIlI[135];
    }

    @Override
    public boolean ae() {
        return lIllllIIlI[1];
    }

    private static boolean lIIlllllIlIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIlllllIIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlllllIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public String ag() {
        return lIllllIIII[lIllllIIlI[178]];
    }

    private static int lIIllllIllllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIIlllllIIlII(Object object) {
        return object != null;
    }

    private static boolean lIIlllllIIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static void cc() {
        if (G.lIIlllllIIlll(Players.getLocal().getWorldLocation().distanceTo(fP), lIllllIIlI[8])) {
            Widget var25;
            Widget var26;
            AccBuilderSotf.c = lIllllIIII[lIllllIIlI[162]];
            Movement.walkTo((WorldPoint)fP);
            0;
            Time.sleepTicks((int)lIllllIIlI[0]);
            0;
            if (G.lIIllllIlllll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIllllIIlI[35], lIllllIIlI[36], lIllllIIlI[1])) ? 1 : 0)) {
                e.c(new WorldPoint(lIllllIIlI[38], lIllllIIlI[39], lIllllIIlI[1]));
                Time.sleepTicks((int)lIllllIIlI[8]);
                0;
            }
            if (G.lIIlllllIIlII(var26 = Widgets.get((int)lIllllIIlI[40], (int)lIllllIIlI[30]))) {
                Mouse.click((int)var26.getClickPoint().getX(), (int)var26.getClickPoint().getY(), (boolean)lIllllIIlI[0]);
                Time.sleepTicks((int)lIllllIIlI[11]);
                0;
            }
            if (G.lIIlllllIIlII(var25 = Widgets.get((int)lIllllIIlI[40], (int)lIllllIIlI[41]))) {
                Mouse.click((int)var25.getClickPoint().getX(), (int)var25.getClickPoint().getY(), (boolean)lIllllIIlI[0]);
                Time.sleepTicks((int)lIllllIIlI[11]);
                0;
            }
        }
    }

    private static boolean lIIlllllIIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static void Q() {
        d var19;
        Object var24;
        block12: {
            block11: {
                int[] nArray = new int[lIllllIIlI[0]];
                nArray[G.lIllllIIlI[1]] = lIllllIIlI[20];
                if (G.lIIlllllIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(lIllllIIlI[20], lIllllIIlI[0], lIllllIIlI[169]);
                    bv.add(d2);
                    0;
                }
                int[] nArray2 = new int[lIllllIIlI[0]];
                nArray2[G.lIllllIIlI[1]] = lIllllIIlI[18];
                if (G.lIIlllllIIIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    var24 = new d(lIllllIIlI[18], lIllllIIlI[0], lIllllIIlI[170]);
                    bv.add((d)var24);
                    0;
                }
                int[] nArray3 = new int[lIllllIIlI[0]];
                nArray3[G.lIllllIIlI[1]] = lIllllIIlI[14];
                if (G.lIIlllllIIIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    var24 = new d(lIllllIIlI[14], lIllllIIlI[10], e.c(lIllllIIlI[171], lIllllIIlI[172]));
                    bv.add((d)var24);
                    0;
                }
                int[] nArray4 = new int[lIllllIIlI[0]];
                nArray4[G.lIllllIIlI[1]] = lIllllIIlI[16];
                if (G.lIIlllllIIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    var24 = new d(lIllllIIlI[16], lIllllIIlI[11], lIllllIIlI[173]);
                    bv.add((d)var24);
                    0;
                }
                int[] nArray5 = new int[lIllllIIlI[0]];
                nArray5[G.lIllllIIlI[1]] = lIllllIIlI[17];
                if (G.lIIlllllIIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    var24 = new d(lIllllIIlI[17], lIllllIIlI[5], j.cf);
                    bv.add((d)var24);
                    0;
                }
                int[] nArray6 = new int[lIllllIIlI[0]];
                nArray6[G.lIllllIIlI[1]] = lIllllIIlI[9];
                if (!G.lIIllllIlllll(Bank.contains((int[])nArray6) ? 1 : 0)) break block11;
                int[] nArray7 = new int[lIllllIIlI[0]];
                nArray7[G.lIllllIIlI[1]] = lIllllIIlI[9];
                if (!G.lIIllllIlllll(Bank.contains((int[])nArray7) ? 1 : 0)) break block12;
                int[] nArray8 = new int[lIllllIIlI[0]];
                nArray8[G.lIllllIIlI[1]] = lIllllIIlI[9];
                if (!G.lIIlllllIIIII(Bank.getFirst((int[])nArray8).getQuantity(), lIllllIIlI[10])) break block12;
            }
            var24 = new d(lIllllIIlI[9], lIllllIIlI[61], lIllllIIlI[174]);
            bv.add((d)var24);
            0;
        }
        int[] nArray = new int[lIllllIIlI[0]];
        nArray[G.lIllllIIlI[1]] = lIllllIIlI[15];
        if (G.lIIlllllIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            var24 = new d(lIllllIIlI[15], lIllllIIlI[0], lIllllIIlI[169]);
            bv.add((d)var24);
            0;
        }
        if (G.lIIlllllIIIIl(Bank.contains((Predicate)(var24 = item -> item.getName().toLowerCase().contains(lIllllIIII[lIllllIIlI[179]]))) ? 1 : 0)) {
            var19 = new d(lIllllIIlI[175], lIllllIIlI[5], lIllllIIlI[176]);
            bv.add(var19);
            0;
        }
        int[] nArray9 = new int[lIllllIIlI[0]];
        nArray9[G.lIllllIIlI[1]] = lIllllIIlI[13];
        if (G.lIIlllllIIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
            var19 = new d(lIllllIIlI[13], lIllllIIlI[71], lIllllIIlI[177]);
            bv.add(var19);
            0;
        }
    }

    private static boolean lIIlllllIIIII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (G.lIIlllllIIIlI(e.j(lIllllIIlI[4]), lIllllIIlI[145])) {
            bl = lIllllIIlI[0];
            0;
            if (((99 + 43 - 37 + 29 ^ 109 + 123 - 114 + 26) & (0x10 ^ 0x2E ^ (0x86 ^ 0xAE) ^ -1)) < 0) {
                return ((127 + 196 - 187 + 69 ^ 28 + 17 - -97 + 33) & (0x41 ^ 0x3C ^ (0x7F ^ 0x60) ^ -1)) != 0;
            }
        } else {
            bl = lIllllIIlI[1];
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean cd() {
        int n2;
        block2: {
            block4: {
                block3: {
                    String[] stringArray = new String[lIllllIIlI[0]];
                    stringArray[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[163]];
                    if (!G.lIIllllIlllll(Inventory.contains((String[])stringArray) ? 1 : 0) || !G.lIIllllIlllll(Inventory.contains((int[])f.ba) ? 1 : 0)) break block2;
                    int[] nArray = new int[lIllllIIlI[0]];
                    nArray[G.lIllllIIlI[1]] = lIllllIIlI[9];
                    if (!G.lIIllllIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                    String[] stringArray2 = new String[lIllllIIlI[0]];
                    stringArray2[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[164]];
                    if (!G.lIIlllllIIIIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) break block3;
                    String[] stringArray3 = new String[lIllllIIlI[0]];
                    stringArray3[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[165]];
                    if (!G.lIIllllIlllll(Equipment.contains((String[])stringArray3) ? 1 : 0)) break block2;
                }
                String[] stringArray = new String[lIllllIIlI[0]];
                stringArray[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[166]];
                if (!G.lIIllllIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block2;
                int[] nArray = new int[lIllllIIlI[0]];
                nArray[G.lIllllIIlI[1]] = lIllllIIlI[19];
                if (!G.lIIlllllIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block4;
                int[] nArray2 = new int[lIllllIIlI[0]];
                nArray2[G.lIllllIIlI[1]] = lIllllIIlI[19];
                if (!G.lIIllllIlllll(Equipment.contains((int[])nArray2) ? 1 : 0)) break block2;
            }
            n2 = lIllllIIlI[0];
            0;
            if (2 >= ((0xC6 ^ 0x91) & ~(0x1E ^ 0x49))) return n2 != 0;
            return false;
        }
        n2 = lIllllIIlI[1];
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        String[] stringArray = new String[lIllllIIlI[0]];
        stringArray[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[167]];
        if (G.lIIlllllIIlIl(Inventory.getCount((String[])stringArray))) {
            String[] stringArray2 = new String[lIllllIIlI[0]];
            stringArray2[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[168]];
            if (G.lIIlllllIIlIl(Inventory.getCount((String[])stringArray2))) {
                n2 = lIllllIIlI[0];
                0;
                if (3 >= 1) return n2 != 0;
                return false;
            }
        }
        n2 = lIllllIIlI[1];
        return n2 != 0;
    }

    private static void lIIllllIlllIl() {
        lIllllIIlI = new int[212];
        G.lIllllIIlI[0] = 1;
        G.lIllllIIlI[1] = (0x72 ^ 0x2E ^ (0x4D ^ 0x16)) & (133 + 36 - 141 + 120 ^ 119 + 0 - 47 + 75 ^ -1);
        G.lIllllIIlI[2] = -(0xFFFF9DC5 & 0x763B) & (0xFFFF9D7F & 0x77AE);
        G.lIllllIIlI[3] = 0x2B ^ 0x78 ^ (0xF6 ^ 0x99);
        G.lIllllIIlI[4] = -(0xFFFFF7D7 & 0x6E69) & (0xFFFFEF77 & 0x77FB);
        G.lIllllIIlI[5] = 0xB2 ^ 0xB7;
        G.lIllllIIlI[6] = 0xFFFFBF88 & 0x53FF;
        G.lIllllIIlI[7] = 2;
        G.lIllllIIlI[8] = 28 + 141 - 136 + 110 ^ 124 + 54 - 89 + 50;
        G.lIllllIIlI[9] = -(0xFFFFFDFF & 0x3605) & (0xFFFFB57F & Short.MAX_VALUE);
        G.lIllllIIlI[10] = 127 + 163 - 142 + 17 ^ 5 + 75 - 77 + 172;
        G.lIllllIIlI[11] = 3;
        G.lIllllIIlI[12] = 0xA1 ^ 0xB7 ^ (0xBE ^ 0xAE);
        G.lIllllIIlI[13] = -(0xFFFFF8FB & 0x47B5) & (0xFFFFDFF7 & Short.MAX_VALUE);
        G.lIllllIIlI[14] = 0xFFFFCEAB & 0x7DF7;
        G.lIllllIIlI[15] = -(0xFFFFF2FD & 0x5D67) & (0xFFFFDFF5 & 0x7BFF);
        G.lIllllIIlI[16] = -(0xFFFFC41E & 0x7FE7) & (0xFFFFEFDF & 0x5FBF);
        G.lIllllIIlI[17] = 0xFFFFBDF7 & 0x7359;
        G.lIllllIIlI[18] = 0xFFFFC9B3 & 0x3FCE;
        G.lIllllIIlI[19] = -(0xFFFFCFC3 & 0x71BF) & (0xFFFFDFBA & 0x63EF);
        G.lIllllIIlI[20] = 0xFFFFAF73 & 0x55BF;
        G.lIllllIIlI[21] = 0x11 ^ 0x4E ^ (0x6E ^ 0x36);
        G.lIllllIIlI[22] = 94 + 48 - 20 + 59 ^ 34 + 79 - 93 + 115;
        G.lIllllIIlI[23] = 0xFFFFEDE8 & 0x1F7F;
        G.lIllllIIlI[24] = -2 & (0xFFFFEFE9 & 0x1D97);
        G.lIllllIIlI[25] = 0xFFFFBDF9 & 0x4F6F;
        G.lIllllIIlI[26] = 0xFFFF9D7E & 0x6FEB;
        G.lIllllIIlI[27] = -(0xFFFFFC0F & 0x73F1) & (0xFFFFFD7B & 0x7FEF);
        G.lIllllIIlI[28] = 0xA0 ^ 0xC7 ^ (0xFE ^ 0x91);
        G.lIllllIIlI[29] = 0x1B ^ 0x71 ^ (0xDE ^ 0xBB);
        G.lIllllIIlI[30] = 24 + 53 - 67 + 148 ^ 73 + 100 - 66 + 31;
        G.lIllllIIlI[31] = 45 + 109 - 136 + 122;
        G.lIllllIIlI[32] = 134 + 164 - 126 + 19 ^ 92 + 169 - 213 + 134;
        G.lIllllIIlI[33] = -1;
        G.lIllllIIlI[34] = 0x18 ^ 0x13;
        G.lIllllIIlI[35] = 0xFFFF9D77 & 0x6FFC;
        G.lIllllIIlI[36] = 0xFFFFBF95 & 0x4DEB;
        G.lIllllIIlI[37] = -(0xFFFFB7CD & 0x6A37) & (0xFFFFFFF7 & 0x2F7F);
        G.lIllllIIlI[38] = -(0xFFFFD2FD & 0x7F03) & (0xFFFFDFED & 0x7F7F);
        G.lIllllIIlI[39] = -(0xFFFFF3F1 & 0x7E8F) & (0xFFFFFFFF & 0x7FFD);
        G.lIllllIIlI[40] = 0xFFFFCEE5 & 0x335E;
        G.lIllllIIlI[41] = 0x94 ^ 0x85;
        G.lIllllIIlI[42] = -(0xFFFFD71A & 0x7AF7) & (0xFFFFDF7D & 0x7FF7);
        G.lIllllIIlI[43] = 0xFFFF9F27 & 0x6DDB;
        G.lIllllIIlI[44] = -(0xFFFFBEB7 & 0x634F) & (0xFFFFFF7F & 0x2FF7);
        G.lIllllIIlI[45] = -(0xFFFFFEC9 & 0x7337) & (0xFFFFFFFF & 0x7EFF);
        G.lIllllIIlI[46] = 0x20 ^ 0x2C;
        G.lIllllIIlI[47] = 0x5F ^ 0x2B ^ (0x46 ^ 0x3F);
        G.lIllllIIlI[48] = 0x68 ^ 0x66;
        G.lIllllIIlI[49] = 0xB8 ^ 0xA3 ^ (0xCE ^ 0xC5);
        G.lIllllIIlI[50] = 0x86 ^ 0x94;
        G.lIllllIIlI[51] = 0x79 ^ 0x6A;
        G.lIllllIIlI[52] = 0x3D ^ 0x28;
        G.lIllllIIlI[53] = 0x7B ^ 0x48 ^ (0x37 ^ 0x12);
        G.lIllllIIlI[54] = 0xE3 ^ 0xB4 ^ (0xC9 ^ 0x89);
        G.lIllllIIlI[55] = 0xAE ^ 0x90 ^ (0xA ^ 0x2C);
        G.lIllllIIlI[56] = 0xD2 ^ 0x8A ^ (0x15 ^ 0x54);
        G.lIllllIIlI[57] = 30 + 66 - 2 + 92 ^ 28 + 78 - 101 + 155;
        G.lIllllIIlI[58] = 0x9E ^ 0x85;
        G.lIllllIIlI[59] = 0x7A ^ 0x66;
        G.lIllllIIlI[60] = 0xEE ^ 0x9E ^ (0xF ^ 0x62);
        G.lIllllIIlI[61] = 5 + 161 - 41 + 66 ^ 119 + 135 - 206 + 113;
        G.lIllllIIlI[62] = 143 + 68 - 103 + 82 ^ 56 + 94 - 131 + 142;
        G.lIllllIIlI[63] = 0x9E ^ 0xC0 ^ (0x3A ^ 0x44);
        G.lIllllIIlI[64] = 0x3A ^ 0x1B;
        G.lIllllIIlI[65] = 15 + 72 - 62 + 114 ^ 110 + 120 - 99 + 38;
        G.lIllllIIlI[66] = 56 + 102 - 68 + 50 ^ 116 + 111 - 176 + 124;
        G.lIllllIIlI[67] = 85 + 15 - -34 + 16 ^ 56 + 96 - 66 + 92;
        G.lIllllIIlI[68] = 0x36 ^ 0x61 ^ (0xB5 ^ 0xC7);
        G.lIllllIIlI[69] = 0x83 ^ 0xA5;
        G.lIllllIIlI[70] = 113 + 133 - 166 + 79 ^ 45 + 83 - 12 + 68;
        G.lIllllIIlI[71] = 0x67 ^ 0x14 ^ (0x49 ^ 0x12);
        G.lIllllIIlI[72] = 0x61 ^ 0x48;
        G.lIllllIIlI[73] = 0x9F ^ 0xB5;
        G.lIllllIIlI[74] = 0x7A ^ 0x47 ^ (0x14 ^ 2);
        G.lIllllIIlI[75] = 0x6B ^ 0x47;
        G.lIllllIIlI[76] = 0x47 ^ 0x5B ^ (0x8A ^ 0xBB);
        G.lIllllIIlI[77] = 0xBB ^ 0x9C ^ (0x89 ^ 0x80);
        G.lIllllIIlI[78] = 0x22 ^ 0xD;
        G.lIllllIIlI[79] = 0x66 ^ 0x56;
        G.lIllllIIlI[80] = 0xF6 ^ 0xC7;
        G.lIllllIIlI[81] = 52 + 48 - 35 + 77 ^ 88 + 128 - 168 + 141;
        G.lIllllIIlI[82] = 77 + 41 - 108 + 126 ^ 89 + 177 - 137 + 59;
        G.lIllllIIlI[83] = 46 + 139 - 50 + 14 ^ 109 + 19 - -12 + 20;
        G.lIllllIIlI[84] = 0x62 ^ 0x37 ^ (0x4A ^ 0x29);
        G.lIllllIIlI[85] = 0x2A ^ 0xF ^ (0xA5 ^ 0xB7);
        G.lIllllIIlI[86] = 0x5E ^ 0x66;
        G.lIllllIIlI[87] = 0x9D ^ 0xA4;
        G.lIllllIIlI[88] = 0x26 ^ 0x1C;
        G.lIllllIIlI[89] = 0x25 ^ 0x1E;
        G.lIllllIIlI[90] = -(0xFFFFBDEC & 0x767B) & (0xFFFFFFFF & 0x3FFF);
        G.lIllllIIlI[91] = 0x78 ^ 0x1E ^ (0x54 ^ 0xF);
        G.lIllllIIlI[92] = 0xF5 ^ 0xB7 ^ (2 ^ 0x7E);
        G.lIllllIIlI[93] = 0x54 ^ 0x6B;
        G.lIllllIIlI[94] = 1 ^ (0xD ^ 0x4C);
        G.lIllllIIlI[95] = 0x35 ^ 0x74;
        G.lIllllIIlI[96] = 0x52 ^ 0x10;
        G.lIllllIIlI[97] = 245 + 31 - 60 + 37 ^ 110 + 170 - 146 + 56;
        G.lIllllIIlI[98] = 127 + 135 - 156 + 126 ^ 80 + 41 - -4 + 47;
        G.lIllllIIlI[99] = 195 + 98 - 236 + 159 ^ 31 + 14 - -18 + 94;
        G.lIllllIIlI[100] = 0x1A ^ 0x5C;
        G.lIllllIIlI[101] = 0xD4 ^ 0xA4 ^ (0x26 ^ 0x11);
        G.lIllllIIlI[102] = 3 + 68 - -163 + 1 ^ 43 + 106 - 42 + 56;
        G.lIllllIIlI[103] = 0x4D ^ 0x1F ^ (0x3A ^ 0x21);
        G.lIllllIIlI[104] = 0x3E ^ 0x74;
        G.lIllllIIlI[105] = -(0xFFFFA3F9 & 0x5E1F) & (0xFFFFCFFF & 0x3FDF);
        G.lIllllIIlI[106] = 0xA6 ^ 0xA3 ^ (0x89 ^ 0xC7);
        G.lIllllIIlI[107] = 0x79 ^ 0x35;
        G.lIllllIIlI[108] = -(0xFFFFE7AF & 0x5A53) & (0xFFFFCFCB & Short.MAX_VALUE);
        G.lIllllIIlI[109] = 0x1A ^ 0x59 ^ (0x3F ^ 0x31);
        G.lIllllIIlI[110] = 0x60 ^ 0x2E;
        G.lIllllIIlI[111] = 0xFFFFCFEF & 0x3DD8;
        G.lIllllIIlI[112] = 0x37 ^ 0x78;
        G.lIllllIIlI[113] = 0xFC ^ 0xA2 ^ (0x54 ^ 0x5A);
        G.lIllllIIlI[114] = 100 + 58 - -29 + 57 ^ 57 + 104 - 69 + 73;
        G.lIllllIIlI[115] = 0x1E ^ 3 ^ (0x55 ^ 0x1A);
        G.lIllllIIlI[116] = 0xE3 ^ 0xB0;
        G.lIllllIIlI[117] = -(0xFFFFE6D6 & 0x3B3F) & (0xFFFFBFD7 & 0x6FFD);
        G.lIllllIIlI[118] = 106 + 206 - 175 + 78 ^ 55 + 15 - -48 + 13;
        G.lIllllIIlI[119] = 0x3B ^ 0x71 ^ (0x70 ^ 0x6F);
        G.lIllllIIlI[120] = 0x65 ^ 0x45 ^ (0x6F ^ 0x19);
        G.lIllllIIlI[121] = 0x57 ^ 0;
        G.lIllllIIlI[122] = 0x30 ^ 0x7D ^ (0x56 ^ 0x43);
        G.lIllllIIlI[123] = 0x6F ^ 7 ^ (0x66 ^ 0x57);
        G.lIllllIIlI[124] = 0x5D ^ 7;
        G.lIllllIIlI[125] = 0xAF ^ 0xB3 ^ (0xD4 ^ 0x93);
        G.lIllllIIlI[126] = 0x67 ^ 0x38 ^ 3;
        G.lIllllIIlI[127] = 0x61 ^ 0x3C;
        G.lIllllIIlI[128] = 0x80 ^ 0xB9 ^ (0xF8 ^ 0x9F);
        G.lIllllIIlI[129] = 4 ^ 0x6D ^ (0x1C ^ 0x2A);
        G.lIllllIIlI[130] = 0x38 ^ 4 ^ (0x31 ^ 0x6D);
        G.lIllllIIlI[131] = 0x26 ^ 0x5E ^ (0x24 ^ 0x3D);
        G.lIllllIIlI[132] = 0x50 ^ 0x32;
        G.lIllllIIlI[133] = 0xD0 ^ 0xB3;
        G.lIllllIIlI[134] = 0xFFFF9BD3 & 0x6FBF;
        G.lIllllIIlI[135] = 0x30 ^ 0x1D ^ (0xCC ^ 0x85);
        G.lIllllIIlI[136] = 0x5F ^ 0x6A ^ (0xD3 ^ 0x83);
        G.lIllllIIlI[137] = 0x6F ^ 9;
        G.lIllllIIlI[138] = 0x2E ^ 0x49;
        G.lIllllIIlI[139] = 0xB0 ^ 0xBE ^ (0x22 ^ 0x44);
        G.lIllllIIlI[140] = 0x34 ^ 0x71 ^ (0x11 ^ 0x3D);
        G.lIllllIIlI[141] = 0xE2 ^ 0x88;
        G.lIllllIIlI[142] = 0xDF ^ 0xC0 ^ (0x47 ^ 0x33);
        G.lIllllIIlI[143] = 134 + 130 - 69 + 36 ^ 105 + 68 - 41 + 7;
        G.lIllllIIlI[144] = 0x4D ^ 0x53 ^ (0xD5 ^ 0xA6);
        G.lIllllIIlI[145] = 0x8C ^ 0xBE ^ (0xF9 ^ 0xA5);
        G.lIllllIIlI[146] = 0xE0 ^ 0xA2 ^ (0x86 ^ 0xAB);
        G.lIllllIIlI[147] = 0xE5 ^ 0x95;
        G.lIllllIIlI[148] = 0x42 ^ 0x33;
        G.lIllllIIlI[149] = 0x3D ^ 9 ^ (0x28 ^ 0x6E);
        G.lIllllIIlI[150] = 0x5B ^ 0x79 ^ (0x73 ^ 0x22);
        G.lIllllIIlI[151] = 41 + 141 - 13 + 26 ^ 137 + 158 - 237 + 125;
        G.lIllllIIlI[152] = 93 + 81 - -41 + 23 ^ 56 + 108 - 19 + 10;
        G.lIllllIIlI[153] = 0x68 ^ 0x1E;
        G.lIllllIIlI[154] = 0x70 ^ 0x74 ^ (0xB4 ^ 0xC7);
        G.lIllllIIlI[155] = 0x6A ^ 0x12;
        G.lIllllIIlI[156] = 0xA4 ^ 0x94 ^ (0x6B ^ 0x22);
        G.lIllllIIlI[157] = 9 ^ 0x73;
        G.lIllllIIlI[158] = 0x19 ^ 0x54 ^ (0x44 ^ 0x72);
        G.lIllllIIlI[159] = 56 + 36 - -20 + 106 ^ 44 + 132 - 52 + 42;
        G.lIllllIIlI[160] = 0x18 ^ 0x28 ^ (0xD0 ^ 0x9D);
        G.lIllllIIlI[161] = 0x3D ^ 0x43;
        G.lIllllIIlI[162] = (0x4D ^ 0x37) + (0xC8 ^ 0xAD) - (37 + 140 - 104 + 93) + (0xC ^ 0x4A);
        G.lIllllIIlI[163] = 108 + 19 - 82 + 83;
        G.lIllllIIlI[164] = 41 + 50 - -23 + 15;
        G.lIllllIIlI[165] = 18 + 94 - 10 + 28;
        G.lIllllIIlI[166] = 94 + 87 - 141 + 91;
        G.lIllllIIlI[167] = 93 + 34 - 7 + 12;
        G.lIllllIIlI[168] = 82 + 8 - 11 + 54;
        G.lIllllIIlI[169] = -(0xFFFF9DF3 & 0x76DF) & (0xFFFFFFFA & 0x37FF);
        G.lIllllIIlI[170] = -(0xFFFFF1F1 & 0xF6F) & (0xFFFFBBFB & 0x7FFC);
        G.lIllllIIlI[171] = 0xFFFF99DE & 0x7EBD;
        G.lIllllIIlI[172] = -(0xFFFFFDDA & 0x23ED) & (0xFFFFFFFF & 0x3DE7);
        G.lIllllIIlI[173] = -(0xFFFFBE0B & 0x69FC) & (0xFFFFEFFF & 0x3BEF);
        G.lIllllIIlI[174] = 0xFFFF89BE & 0x776D;
        G.lIllllIIlI[175] = -(0xFFFFD2B6 & 0x3D4D) & (0xFFFFFECF & 0x3FFF);
        G.lIllllIIlI[176] = 0xFFFFFDB8 & 0x63EF;
        G.lIllllIIlI[177] = 0xFFFFF7D4 & 0xBAF;
        G.lIllllIIlI[178] = (0x89 ^ 0xC1) + (0x6B ^ 0xB) - (0x1D ^ 0x5F) + (0x1D ^ 0x3D);
        G.lIllllIIlI[179] = 126 + 26 - 68 + 43 + (0xF4 ^ 0xBF) - (0x6C ^ 0x18) + (0xA5 ^ 0x94);
        G.lIllllIIlI[180] = (0xE6 ^ 0xAD) + (0xCB ^ 0xC7) - (0x65 ^ 0x52) + (0xAE ^ 0xC6);
        G.lIllllIIlI[181] = (0xE0 ^ 0xC2) + (0xEF ^ 0x8C) - (0x7E ^ 0x5B) + (0x62 ^ 0x4B);
        G.lIllllIIlI[182] = 0xFFFFC7BF & 0x3B7B;
        G.lIllllIIlI[183] = -(0xFFFFF163 & 0x5EFE) & (0xFFFFFFFD & 0x5DE7);
        G.lIllllIIlI[184] = 0xFFFFCDF5 & 0x3F7A;
        G.lIllllIIlI[185] = -(0xFFFFE262 & 0x7F9F) & (0xFFFFEEFF & Short.MAX_VALUE);
        G.lIllllIIlI[186] = 0xFFFFDD7D & 0x2FDF;
        G.lIllllIIlI[187] = -(0xFFFFB63F & 0x5BD1) & (0xFFFFBFFF & 0x5F7F);
        G.lIllllIIlI[188] = 0xFFFFFE19 & 0x27EF;
        G.lIllllIIlI[189] = -(0xFFFFF327 & 0x7EDC) & (0xFFFFFF4F & 0x7FBB);
        G.lIllllIIlI[190] = -(0xFFFFF2DF & 0x1D79) & (0xFFFFF7FF & 0x3EFF);
        G.lIllllIIlI[191] = 0xFFFFBFF7 & 0x4DEF;
        G.lIllllIIlI[192] = 41 + 48 - 41 + 90;
        G.lIllllIIlI[193] = 131 + 4 - 100 + 104;
        G.lIllllIIlI[194] = (0xF9 ^ 0xC5) + (120 + 81 - 196 + 129) - (0x3A ^ 0x7B) + (0xA6 ^ 0xAA);
        G.lIllllIIlI[195] = 89 + 28 - 85 + 110;
        G.lIllllIIlI[196] = (0x23 ^ 9) + (0xEB ^ 0xB2) - (0x4B ^ 0x2D) + (0xE2 ^ 0x90);
        G.lIllllIIlI[197] = 64 + 86 - 77 + 71;
        G.lIllllIIlI[198] = (0xEB ^ 0xA8) + (0x1A ^ 0x7C) - (0xF5 ^ 0xAE) + (0x6D ^ 0x2E);
        G.lIllllIIlI[199] = 129 + 125 - 238 + 130;
        G.lIllllIIlI[200] = 23 + 104 - -1 + 19;
        G.lIllllIIlI[201] = 85 + 128 - 166 + 101;
        G.lIllllIIlI[202] = (0xAC ^ 0xBF) + (120 + 58 - 165 + 114) - -1 + 2;
        G.lIllllIIlI[203] = 92 + 48 - 57 + 52 + (0x33 ^ 0x5A) - (77 + 31 - 14 + 114) + (0x1E ^ 0x68);
        G.lIllllIIlI[204] = 82 + 45 - 95 + 119;
        G.lIllllIIlI[205] = (0x58 ^ 0) + (0x7D ^ 0x4A) - (0xB ^ 0x6F) + (0xF1 ^ 0x9C);
        G.lIllllIIlI[206] = (0xDC ^ 0xB0) + (0xA6 ^ 0xBA) - (0x41 ^ 0x39) + (69 + 117 - 174 + 125);
        G.lIllllIIlI[207] = 46 + 113 - 31 + 19 + (0x50 ^ 0xA) - (6 + 111 - 64 + 96) + (5 ^ 0x47);
        G.lIllllIIlI[208] = 110 + 7 - 89 + 127;
        G.lIllllIIlI[209] = 59 + 117 - 110 + 67 + (0xEE ^ 0xAA) - (19 + 0 - -87 + 94) + (85 + 3 - -60 + 7);
        G.lIllllIIlI[210] = 107 + 36 - 103 + 117;
        G.lIllllIIlI[211] = 135 + 9 - -12 + 2;
    }

    public static void cb() {
        if (G.lIIllllIlllll(bt ? 1 : 0)) {
            b.a(bv);
            if (G.lIIlllllIIIII(bv.size(), lIllllIIlI[0])) {
                System.out.println(lIllllIIII[lIllllIIlI[1]]);
                bt = lIllllIIlI[1];
            }
        }
        if (G.lIIlllllIIIIl(bt ? 1 : 0)) {
            WorldPoint var12;
            TileItem var7;
            Object var28;
            BankLocation var23;
            if (!G.lIIlllllIIIlI(e.j(lIllllIIlI[2]), lIllllIIlI[3]) || G.lIIlllllIIIII(e.j(lIllllIIlI[4]), lIllllIIlI[5])) {
                H.cf();
            }
            if (G.lIIlllllIIIIl(G.cd() ? 1 : 0) && G.lIIlllllIIIll(e.j(lIllllIIlI[4]), lIllllIIlI[5]) && G.lIIlllllIIIlI(e.j(lIllllIIlI[2]), lIllllIIlI[3])) {
                var23 = BankLocation.getNearest();
                if (G.lIIlllllIIlII(var23) && G.lIIlllllIIIIl(var23.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lIllllIIII[lIllllIIlI[0]];
                    a.a(var23);
                }
                if (G.lIIlllllIIlII(var23) && G.lIIllllIlllll(var23.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (G.lIIlllllIIIIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIllllIIlI[6]);
                        0;
                    }
                    if (G.lIIllllIlllll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = lIllllIIII[lIllllIIlI[7]];
                        if (G.lIIlllllIIlIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIllllIIlI[8]);
                            0;
                        }
                        if (G.lIIlllllIIlIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIllllIIlI[7]);
                            0;
                        }
                        int[] nArray = new int[lIllllIIlI[0]];
                        nArray[G.lIllllIIlI[1]] = lIllllIIlI[9];
                        if (G.lIIllllIlllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray2 = new int[lIllllIIlI[0]];
                            nArray2[G.lIllllIIlI[1]] = lIllllIIlI[9];
                            if (G.lIIlllllIIIII(Bank.getFirst((int[])nArray2).getQuantity(), lIllllIIlI[10])) {
                                G.Q();
                                System.out.println(lIllllIIII[lIllllIIlI[11]]);
                                bt = lIllllIIlI[0];
                                return;
                            }
                        }
                        int[] nArray3 = new int[lIllllIIlI[12]];
                        nArray3[G.lIllllIIlI[1]] = lIllllIIlI[13];
                        nArray3[G.lIllllIIlI[0]] = lIllllIIlI[14];
                        nArray3[G.lIllllIIlI[7]] = lIllllIIlI[15];
                        nArray3[G.lIllllIIlI[11]] = lIllllIIlI[16];
                        nArray3[G.lIllllIIlI[8]] = lIllllIIlI[9];
                        nArray3[G.lIllllIIlI[5]] = lIllllIIlI[17];
                        if (G.lIIlllllIIIIl(e.c(nArray3) ? 1 : 0)) {
                            G.Q();
                            System.out.println(lIllllIIII[lIllllIIlI[8]]);
                            bt = lIllllIIlI[0];
                            return;
                        }
                        int[] nArray4 = new int[lIllllIIlI[12]];
                        nArray4[G.lIllllIIlI[1]] = lIllllIIlI[13];
                        nArray4[G.lIllllIIlI[0]] = lIllllIIlI[14];
                        nArray4[G.lIllllIIlI[7]] = lIllllIIlI[15];
                        nArray4[G.lIllllIIlI[11]] = lIllllIIlI[16];
                        nArray4[G.lIllllIIlI[8]] = lIllllIIlI[9];
                        nArray4[G.lIllllIIlI[5]] = lIllllIIlI[17];
                        if (G.lIIllllIlllll(e.c(nArray4) ? 1 : 0)) {
                            a.a(lIllllIIlI[18], lIllllIIlI[7]);
                            a.a(lIllllIIlI[19], lIllllIIlI[0]);
                            a.a(lIllllIIlI[20], lIllllIIlI[0]);
                            a.a(lIllllIIlI[13], lIllllIIlI[10]);
                            a.a(lIllllIIlI[14], lIllllIIlI[10]);
                            a.a(lIllllIIlI[15], lIllllIIlI[0]);
                            a.a(lIllllIIlI[16], lIllllIIlI[11]);
                            a.a(lIllllIIlI[17], lIllllIIlI[8]);
                            a.a(lIllllIIlI[9], lIllllIIlI[21]);
                        }
                    }
                }
            }
            if (G.lIIllllIlllll(Inventory.contains((int[])f.ba) ? 1 : 0) && G.lIIlllllIIIII(Movement.getRunEnergy(), lIllllIIlI[22])) {
                Inventory.getFirst((int[])f.ba).interact(lIllllIIII[lIllllIIlI[5]]);
                Time.sleepTicks((int)lIllllIIlI[0]);
                0;
            }
            int[] nArray = new int[lIllllIIlI[0]];
            nArray[G.lIllllIIlI[1]] = lIllllIIlI[9];
            if (G.lIIllllIlllll(Inventory.contains((int[])nArray) ? 1 : 0) && G.lIIlllllIIllI(G.lIIllllIllllI(e.w(), 60.0))) {
                int[] nArray5 = new int[lIllllIIlI[0]];
                nArray5[G.lIllllIIlI[1]] = lIllllIIlI[9];
                Inventory.getFirst((int[])nArray5).interact(lIllllIIII[lIllllIIlI[12]]);
                Time.sleepTicks((int)lIllllIIlI[0]);
                0;
            }
            var23 = new WorldPoint(lIllllIIlI[23], lIllllIIlI[24], lIllllIIlI[1]);
            WorldPoint var17 = new WorldPoint(lIllllIIlI[25], lIllllIIlI[24], lIllllIIlI[1]);
            WorldPoint var4 = new WorldPoint(lIllllIIlI[26], lIllllIIlI[24], lIllllIIlI[1]);
            WorldPoint var13 = new WorldPoint(lIllllIIlI[27], lIllllIIlI[24], lIllllIIlI[1]);
            if (!G.lIIlllllIIIIl(Players.getLocal().getWorldLocation().equals((Object)var23) ? 1 : 0) || !G.lIIlllllIIIIl(Players.getLocal().getWorldLocation().equals((Object)var17) ? 1 : 0) || !G.lIIlllllIIIIl(Players.getLocal().getWorldLocation().equals((Object)var4) ? 1 : 0) || G.lIIllllIlllll(Players.getLocal().getWorldLocation().equals((Object)var13) ? 1 : 0)) {
                String[] stringArray = new String[lIllllIIlI[0]];
                stringArray[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[21]];
                TileObjects.getNearest((String[])stringArray).interact(lIllllIIII[lIllllIIlI[28]]);
                Time.sleepTicks((int)lIllllIIlI[29]);
                0;
            }
            if (G.lIIlllllIIIlI(e.j(lIllllIIlI[4]), lIllllIIlI[5]) && G.lIIlllllIIIII(e.j(lIllllIIlI[4]), lIllllIIlI[30]) && G.lIIllllIlllll(G.cd() ? 1 : 0)) {
                if (G.lIIlllllIIlll(Players.getLocal().getWorldLocation().distanceTo(fL), lIllllIIlI[31])) {
                    AccBuilderSotf.c = lIllllIIII[lIllllIIlI[32]];
                    int[] nArray6 = new int[lIllllIIlI[0]];
                    nArray6[G.lIllllIIlI[1]] = lIllllIIlI[14];
                    if (G.lIIllllIlllll(Inventory.contains((int[])nArray6) ? 1 : 0) && G.lIIlllllIIIll(Players.getLocal().getAnimation(), lIllllIIlI[33])) {
                        int[] nArray7 = new int[lIllllIIlI[0]];
                        nArray7[G.lIllllIIlI[1]] = lIllllIIlI[14];
                        Inventory.getFirst((int[])nArray7).interact(lIllllIIII[lIllllIIlI[10]]);
                        Time.sleepTicks((int)lIllllIIlI[7]);
                        0;
                    }
                }
                if (G.lIIlllllIlIII(Players.getLocal().getWorldLocation().distanceTo(fL), lIllllIIlI[31])) {
                    if (G.lIIlllllIIlll(Players.getLocal().getWorldLocation().distanceTo(fP), lIllllIIlI[8])) {
                        AccBuilderSotf.c = lIllllIIII[lIllllIIlI[34]];
                        if (G.lIIllllIlllll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (!G.lIIlllllIIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIllllIIlI[35], lIllllIIlI[36], lIllllIIlI[1])) ? 1 : 0) || G.lIIllllIlllll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIllllIIlI[37], lIllllIIlI[36], lIllllIIlI[1])) ? 1 : 0)) {
                            e.c(new WorldPoint(lIllllIIlI[38], lIllllIIlI[39], lIllllIIlI[1]));
                            Time.sleepTicks((int)lIllllIIlI[8]);
                            0;
                        }
                        if (G.lIIlllllIIlII(var28 = Widgets.get((int)lIllllIIlI[40], (int)lIllllIIlI[30]))) {
                            Mouse.click((int)var28.getClickPoint().getX(), (int)var28.getClickPoint().getY(), (boolean)lIllllIIlI[0]);
                            Time.sleepTicks((int)lIllllIIlI[11]);
                            0;
                        }
                        if (G.lIIlllllIIlII(var7 = Widgets.get((int)lIllllIIlI[40], (int)lIllllIIlI[41]))) {
                            Mouse.click((int)var7.getClickPoint().getX(), (int)var7.getClickPoint().getY(), (boolean)lIllllIIlI[0]);
                            Time.sleepTicks((int)lIllllIIlI[11]);
                            0;
                        }
                        var12 = new WorldPoint(lIllllIIlI[42], lIllllIIlI[43], lIllllIIlI[1]);
                        if (G.lIIllllIlllll(Players.getLocal().getWorldLocation().equals((Object)var12) ? 1 : 0)) {
                            e.c(new WorldPoint(lIllllIIlI[44], lIllllIIlI[45], lIllllIIlI[1]));
                            Time.sleepTicks((int)e.c(lIllllIIlI[5], lIllllIIlI[28]));
                            0;
                        }
                        if (G.lIIlllllIIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIllllIIlI[35], lIllllIIlI[36], lIllllIIlI[1])) ? 1 : 0) && G.lIIlllllIIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIllllIIlI[37], lIllllIIlI[36], lIllllIIlI[1])) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)fP);
                            0;
                            Time.sleepTicks((int)lIllllIIlI[0]);
                            0;
                        }
                    }
                    if (G.lIIlllllIlIII(Players.getLocal().getWorldLocation().distanceTo(fP), lIllllIIlI[8])) {
                        e.l(lIllllIIlI[19]);
                        String[] stringArray = new String[lIllllIIlI[0]];
                        stringArray[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[46]];
                        if (G.lIIlllllIIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            AccBuilderSotf.c = lIllllIIII[lIllllIIlI[47]];
                            String[] stringArray2 = new String[lIllllIIlI[0]];
                            stringArray2[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[48]];
                            var28 = TileItems.getNearest((String[])stringArray2);
                            if (G.lIIlllllIIlII(var28)) {
                                String[] stringArray3 = new String[lIllllIIlI[0]];
                                stringArray3[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[29]];
                                if (G.lIIlllllIlIIl(TileItems.getNearest((String[])stringArray3))) {
                                    var28.interact(lIllllIIII[lIllllIIlI[49]]);
                                    Time.sleepTicks((int)lIllllIIlI[7]);
                                    0;
                                }
                            }
                            String[] stringArray4 = new String[lIllllIIlI[0]];
                            stringArray4[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[41]];
                            var7 = TileItems.getNearest((String[])stringArray4);
                            if (G.lIIlllllIIlII(var7)) {
                                var7.interact(lIllllIIII[lIllllIIlI[50]]);
                                Time.sleepTicks((int)lIllllIIlI[0]);
                                0;
                            }
                        }
                        String[] stringArray5 = new String[lIllllIIlI[0]];
                        stringArray5[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[51]];
                        if (G.lIIllllIlllll(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                            String[] stringArray6 = new String[lIllllIIlI[0]];
                            stringArray6[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[30]];
                            if (G.lIIlllllIIIIl(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                                String[] stringArray7 = new String[lIllllIIlI[0]];
                                stringArray7[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[52]];
                                TileObjects.getNearest((String[])stringArray7).interact(lIllllIIII[lIllllIIlI[53]]);
                                Time.sleepTicks((int)lIllllIIlI[7]);
                                0;
                            }
                        }
                        String[] stringArray8 = new String[lIllllIIlI[0]];
                        stringArray8[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[54]];
                        if (G.lIIlllllIlIIl(NPCs.getNearest((String[])stringArray8))) {
                            String[] stringArray9 = new String[lIllllIIlI[0]];
                            stringArray9[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[55]];
                            TileObjects.getNearest((String[])stringArray9).interact(lIllllIIII[lIllllIIlI[56]]);
                            Time.sleepTicks((int)lIllllIIlI[8]);
                            0;
                        }
                        String[] stringArray10 = new String[lIllllIIlI[0]];
                        stringArray10[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[57]];
                        if (G.lIIlllllIIlII(NPCs.getNearest((String[])stringArray10))) {
                            g.a(lIllllIIII[lIllllIIlI[58]], cE);
                        }
                    }
                }
            }
            if (G.lIIlllllIIIll(e.j(lIllllIIlI[4]), lIllllIIlI[30])) {
                di = lIllllIIlI[1];
                String[] stringArray = new String[lIllllIIlI[0]];
                stringArray[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[59]];
                if (G.lIIllllIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray11 = new String[lIllllIIlI[0]];
                    stringArray11[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[60]];
                    if (G.lIIllllIlllll(Inventory.contains((String[])stringArray11) ? 1 : 0)) {
                        int[] nArray8 = new int[lIllllIIlI[0]];
                        nArray8[G.lIllllIIlI[1]] = lIllllIIlI[19];
                        if (G.lIIllllIlllll(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                            int[] nArray9 = new int[lIllllIIlI[0]];
                            nArray9[G.lIllllIIlI[1]] = lIllllIIlI[19];
                            if (G.lIIlllllIIIIl(Equipment.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIllllIIlI[0]];
                                nArray10[G.lIllllIIlI[1]] = lIllllIIlI[19];
                                Inventory.getFirst((int[])nArray10).interact(lIllllIIII[lIllllIIlI[61]]);
                            }
                        }
                        String[] stringArray12 = new String[lIllllIIlI[0]];
                        stringArray12[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[62]];
                        if (G.lIIlllllIlIIl(NPCs.getNearest((String[])stringArray12))) {
                            String[] stringArray13 = new String[lIllllIIlI[0]];
                            stringArray13[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[63]];
                            TileObjects.getNearest((String[])stringArray13).interact(lIllllIIII[lIllllIIlI[64]]);
                            Time.sleepTicks((int)lIllllIIlI[8]);
                            0;
                        }
                        String[] stringArray14 = new String[lIllllIIlI[0]];
                        stringArray14[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[65]];
                        if (G.lIIlllllIIlII(NPCs.getNearest((String[])stringArray14))) {
                            if (G.lIIlllllIIIII(dF, lIllllIIlI[0])) {
                                String[] stringArray15 = new String[lIllllIIlI[0]];
                                stringArray15[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[66]];
                                String[] stringArray16 = new String[lIllllIIlI[0]];
                                stringArray16[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[67]];
                                Inventory.getFirst((String[])stringArray15).useOn((Actor)NPCs.getNearest((String[])stringArray16));
                                Time.sleepTicks((int)lIllllIIlI[11]);
                                0;
                                dF += lIllllIIlI[0];
                            }
                            if (G.lIIlllllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray17 = new String[lIllllIIlI[0]];
                                stringArray17[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[68]];
                                String[] stringArray18 = new String[lIllllIIlI[0]];
                                stringArray18[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[69]];
                                Inventory.getFirst((String[])stringArray17).useOn((Actor)NPCs.getNearest((String[])stringArray18));
                                Time.sleepTicks((int)lIllllIIlI[11]);
                                0;
                            }
                            g.a(cE);
                        }
                    }
                }
            }
            if (G.lIIlllllIIIll(e.j(lIllllIIlI[4]), lIllllIIlI[56])) {
                String[] stringArray = new String[lIllllIIlI[0]];
                stringArray[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[70]];
                if (G.lIIlllllIlIIl(NPCs.getNearest((String[])stringArray))) {
                    String[] stringArray19 = new String[lIllllIIlI[0]];
                    stringArray19[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[71]];
                    TileObjects.getNearest((String[])stringArray19).interact(lIllllIIII[lIllllIIlI[72]]);
                    Time.sleepTicks((int)lIllllIIlI[8]);
                    0;
                }
                if (G.lIIlllllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray20 = new String[lIllllIIlI[0]];
                    stringArray20[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[73]];
                    String[] stringArray21 = new String[lIllllIIlI[0]];
                    stringArray21[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[74]];
                    Inventory.getFirst((String[])stringArray20).useOn((Actor)NPCs.getNearest((String[])stringArray21));
                }
                g.a(cE);
            }
            if (G.lIIlllllIIIll(e.j(lIllllIIlI[4]), lIllllIIlI[61])) {
                String[] stringArray = new String[lIllllIIlI[0]];
                stringArray[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[75]];
                if (G.lIIlllllIlIIl(NPCs.getNearest((String[])stringArray))) {
                    String[] stringArray22 = new String[lIllllIIlI[0]];
                    stringArray22[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[76]];
                    TileObjects.getNearest((String[])stringArray22).interact(lIllllIIII[lIllllIIlI[77]]);
                    Time.sleepTicks((int)lIllllIIlI[8]);
                    0;
                }
                String[] stringArray23 = new String[lIllllIIlI[0]];
                stringArray23[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[78]];
                if (G.lIIlllllIIlII(NPCs.getNearest((String[])stringArray23))) {
                    g.a(lIllllIIII[lIllllIIlI[79]], cE);
                }
            }
            if (G.lIIlllllIIIll(e.j(lIllllIIlI[4]), lIllllIIlI[66])) {
                if (G.lIIlllllIlIII(Players.getLocal().getWorldLocation().distanceTo(fP), lIllllIIlI[12])) {
                    AccBuilderSotf.c = lIllllIIII[lIllllIIlI[80]];
                    int[] nArray11 = new int[lIllllIIlI[0]];
                    nArray11[G.lIllllIIlI[1]] = lIllllIIlI[14];
                    if (G.lIIllllIlllll(Inventory.contains((int[])nArray11) ? 1 : 0) && G.lIIlllllIIIll(Players.getLocal().getAnimation(), lIllllIIlI[33])) {
                        int[] nArray12 = new int[lIllllIIlI[0]];
                        nArray12[G.lIllllIIlI[1]] = lIllllIIlI[14];
                        Inventory.getFirst((int[])nArray12).interact(lIllllIIII[lIllllIIlI[22]]);
                        Time.sleepTicks((int)lIllllIIlI[7]);
                        0;
                    }
                }
                if (G.lIIlllllIIlll(Players.getLocal().getWorldLocation().distanceTo(fP), lIllllIIlI[12]) && G.lIIlllllIIlll(Players.getLocal().getWorldLocation().distanceTo(fQ), lIllllIIlI[12])) {
                    AccBuilderSotf.c = lIllllIIII[lIllllIIlI[81]];
                    Movement.walkTo((WorldPoint)fQ);
                    0;
                    Time.sleepTicks((int)lIllllIIlI[0]);
                    0;
                }
                String[] stringArray = new String[lIllllIIlI[0]];
                stringArray[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[82]];
                if (G.lIIlllllIIlII(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray24 = new String[lIllllIIlI[0]];
                    stringArray24[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[83]];
                    TileObjects.getNearest((String[])stringArray24).interact(lIllllIIII[lIllllIIlI[84]]);
                    Time.sleepTicks((int)lIllllIIlI[11]);
                    0;
                }
                if (G.lIIlllllIlIII(Players.getLocal().getWorldLocation().distanceTo(fQ), lIllllIIlI[29])) {
                    AccBuilderSotf.c = lIllllIIII[lIllllIIlI[85]];
                    g.a(lIllllIIII[lIllllIIlI[86]], cE);
                }
            }
            if (G.lIIlllllIIIll(e.j(lIllllIIlI[4]), lIllllIIlI[71])) {
                if (G.lIIlllllIlIII(Players.getLocal().getWorldLocation().distanceTo(fQ), lIllllIIlI[12])) {
                    AccBuilderSotf.c = lIllllIIII[lIllllIIlI[87]];
                    int[] nArray13 = new int[lIllllIIlI[0]];
                    nArray13[G.lIllllIIlI[1]] = lIllllIIlI[14];
                    if (G.lIIllllIlllll(Inventory.contains((int[])nArray13) ? 1 : 0) && G.lIIlllllIIIll(Players.getLocal().getAnimation(), lIllllIIlI[33])) {
                        int[] nArray14 = new int[lIllllIIlI[0]];
                        nArray14[G.lIllllIIlI[1]] = lIllllIIlI[14];
                        Inventory.getFirst((int[])nArray14).interact(lIllllIIII[lIllllIIlI[88]]);
                        Time.sleepTicks((int)lIllllIIlI[7]);
                        0;
                    }
                }
                if (G.lIIlllllIIIIl(Players.getLocal().getWorldLocation().equals((Object)fN) ? 1 : 0) && G.lIIlllllIIlll(Players.getLocal().getWorldLocation().distanceTo(fQ), lIllllIIlI[12])) {
                    AccBuilderSotf.c = lIllllIIII[lIllllIIlI[89]];
                    Movement.walkTo((WorldPoint)fN);
                    0;
                    Time.sleepTicks((int)lIllllIIlI[0]);
                    0;
                    var28 = Widgets.get((int)lIllllIIlI[40], (int)lIllllIIlI[30]);
                    if (G.lIIlllllIIlII(var28)) {
                        Mouse.click((int)var28.getClickPoint().getX(), (int)var28.getClickPoint().getY(), (boolean)lIllllIIlI[0]);
                        Time.sleepTicks((int)lIllllIIlI[11]);
                        0;
                    }
                    if (G.lIIlllllIIlII(var7 = Widgets.get((int)lIllllIIlI[40], (int)lIllllIIlI[41]))) {
                        Mouse.click((int)var7.getClickPoint().getX(), (int)var7.getClickPoint().getY(), (boolean)lIllllIIlI[0]);
                        Time.sleepTicks((int)lIllllIIlI[11]);
                        0;
                    }
                }
                if (G.lIIllllIlllll(Players.getLocal().getWorldLocation().equals((Object)fN) ? 1 : 0)) {
                    int[] nArray15 = new int[lIllllIIlI[0]];
                    nArray15[G.lIllllIIlI[1]] = lIllllIIlI[90];
                    if (G.lIIllllIlllll(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                        int[] nArray16 = new int[lIllllIIlI[0]];
                        nArray16[G.lIllllIIlI[1]] = lIllllIIlI[90];
                        Inventory.getFirst((int[])nArray16).interact(lIllllIIII[lIllllIIlI[3]]);
                        Time.sleepTicks((int)lIllllIIlI[7]);
                        0;
                    }
                }
            }
            if (G.lIIlllllIIIll(e.j(lIllllIIlI[4]), lIllllIIlI[76])) {
                String[] stringArray = new String[lIllllIIlI[0]];
                stringArray[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[91]];
                var28 = TileObjects.getNearest((String[])stringArray);
                if (G.lIIlllllIIlII(var28)) {
                    var28.interact(lIllllIIII[lIllllIIlI[92]]);
                    Time.sleepTicks((int)lIllllIIlI[7]);
                    0;
                }
                String[] stringArray25 = new String[lIllllIIlI[0]];
                stringArray25[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[93]];
                var7 = TileItems.getNearest((String[])stringArray25);
                if (G.lIIlllllIIlII(var7)) {
                    var7.interact(lIllllIIII[lIllllIIlI[94]]);
                    Time.sleepTicks((int)lIllllIIlI[7]);
                    0;
                }
            }
            if (G.lIIlllllIIIll(e.j(lIllllIIlI[4]), lIllllIIlI[22])) {
                if (G.lIIlllllIIlll(Players.getLocal().getWorldLocation().distanceTo(fP), lIllllIIlI[8])) {
                    AccBuilderSotf.c = lIllllIIII[lIllllIIlI[95]];
                    Movement.walkTo((WorldPoint)fP);
                    0;
                    Time.sleepTicks((int)lIllllIIlI[0]);
                    0;
                    var28 = new WorldPoint(lIllllIIlI[42], lIllllIIlI[43], lIllllIIlI[1]);
                    if (G.lIIllllIlllll(Players.getLocal().getWorldLocation().equals(var28) ? 1 : 0)) {
                        e.c(new WorldPoint(lIllllIIlI[44], lIllllIIlI[45], lIllllIIlI[1]));
                        Time.sleepTicks((int)e.c(lIllllIIlI[5], lIllllIIlI[28]));
                        0;
                    }
                    if (G.lIIllllIlllll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIllllIIlI[35], lIllllIIlI[36], lIllllIIlI[1])) ? 1 : 0)) {
                        e.c(new WorldPoint(lIllllIIlI[38], lIllllIIlI[39], lIllllIIlI[1]));
                        Time.sleepTicks((int)lIllllIIlI[8]);
                        0;
                    }
                    if (G.lIIlllllIIlII(var7 = Widgets.get((int)lIllllIIlI[40], (int)lIllllIIlI[30]))) {
                        Mouse.click((int)var7.getClickPoint().getX(), (int)var7.getClickPoint().getY(), (boolean)lIllllIIlI[0]);
                        Time.sleepTicks((int)lIllllIIlI[11]);
                        0;
                    }
                    if (G.lIIlllllIIlII(var12 = Widgets.get((int)lIllllIIlI[40], (int)lIllllIIlI[41]))) {
                        Mouse.click((int)var12.getClickPoint().getX(), (int)var12.getClickPoint().getY(), (boolean)lIllllIIlI[0]);
                        Time.sleepTicks((int)lIllllIIlI[11]);
                        0;
                    }
                }
                if (G.lIIlllllIlIII(Players.getLocal().getWorldLocation().distanceTo(fP), lIllllIIlI[8])) {
                    String[] stringArray = new String[lIllllIIlI[0]];
                    stringArray[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[96]];
                    if (G.lIIlllllIlIIl(NPCs.getNearest((String[])stringArray))) {
                        String[] stringArray26 = new String[lIllllIIlI[0]];
                        stringArray26[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[97]];
                        TileObjects.getNearest((String[])stringArray26).interact(lIllllIIII[lIllllIIlI[98]]);
                        Time.sleepTicks((int)lIllllIIlI[8]);
                        0;
                    }
                    String[] stringArray27 = new String[lIllllIIlI[0]];
                    stringArray27[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[99]];
                    if (G.lIIlllllIIlII(NPCs.getNearest((String[])stringArray27))) {
                        g.a(lIllllIIII[lIllllIIlI[100]], cE);
                    }
                }
            }
            if (G.lIIlllllIIIll(e.j(lIllllIIlI[4]), lIllllIIlI[85])) {
                String[] stringArray = new String[lIllllIIlI[0]];
                stringArray[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[101]];
                if (G.lIIllllIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray28 = new String[lIllllIIlI[0]];
                    stringArray28[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[102]];
                    if (G.lIIlllllIIlll(Inventory.getAll((String[])stringArray28).size(), lIllllIIlI[11])) {
                        AccBuilderSotf.c = lIllllIIII[lIllllIIlI[103]];
                        String[] stringArray29 = new String[lIllllIIlI[0]];
                        stringArray29[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[104]];
                        int[] nArray17 = new int[lIllllIIlI[0]];
                        nArray17[G.lIllllIIlI[1]] = lIllllIIlI[105];
                        Inventory.getFirst((String[])stringArray29).useOn(TileObjects.getNearest((int[])nArray17));
                        Time.sleepTicks((int)lIllllIIlI[11]);
                        0;
                    }
                }
                String[] stringArray30 = new String[lIllllIIlI[0]];
                stringArray30[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[106]];
                if (G.lIIllllIlllll(Inventory.contains((String[])stringArray30) ? 1 : 0)) {
                    String[] stringArray31 = new String[lIllllIIlI[0]];
                    stringArray31[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[107]];
                    int[] nArray18 = new int[lIllllIIlI[0]];
                    nArray18[G.lIllllIIlI[1]] = lIllllIIlI[108];
                    Inventory.getFirst((String[])stringArray31).useOn(TileObjects.getNearest((int[])nArray18));
                    Time.sleepTicks((int)lIllllIIlI[11]);
                    0;
                }
                String[] stringArray32 = new String[lIllllIIlI[0]];
                stringArray32[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[109]];
                if (G.lIIlllllIIIIl(Inventory.contains((String[])stringArray32) ? 1 : 0)) {
                    String[] stringArray33 = new String[lIllllIIlI[0]];
                    stringArray33[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[110]];
                    if (G.lIIlllllIlIII(Inventory.getAll((String[])stringArray33).size(), lIllllIIlI[11])) {
                        int[] nArray19 = new int[lIllllIIlI[0]];
                        nArray19[G.lIllllIIlI[1]] = lIllllIIlI[111];
                        var28 = TileObjects.getNearest((int[])nArray19).getWorldLocation();
                        if (G.lIIlllllIIIIl(Players.getLocal().getWorldLocation().equals(var28) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)var28);
                            0;
                            Time.sleepTicks((int)lIllllIIlI[0]);
                            0;
                        }
                        if (G.lIIllllIlllll(Players.getLocal().getWorldLocation().equals(var28) ? 1 : 0)) {
                            AccBuilderSotf.c = lIllllIIII[lIllllIIlI[112]];
                            g.a(lIllllIIII[lIllllIIlI[113]], cE);
                        }
                    }
                }
            }
            if (G.lIIlllllIIIll(e.j(lIllllIIlI[4]), lIllllIIlI[3]) && G.lIIlllllIIlll(Players.getLocal().getWorldLocation().distanceTo(fO), lIllllIIlI[10])) {
                String[] stringArray = new String[lIllllIIlI[0]];
                stringArray[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[114]];
                TileObjects.getNearest((String[])stringArray).interact(lIllllIIII[lIllllIIlI[115]]);
                Time.sleepTicks((int)lIllllIIlI[8]);
                0;
            }
            if (G.lIIlllllIIIll(e.j(lIllllIIlI[4]), lIllllIIlI[95])) {
                String[] stringArray = new String[lIllllIIlI[0]];
                stringArray[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[116]];
                if (G.lIIlllllIlIIl(NPCs.getNearest((String[])stringArray))) {
                    int[] nArray20 = new int[lIllllIIlI[0]];
                    nArray20[G.lIllllIIlI[1]] = lIllllIIlI[117];
                    TileObjects.getNearest((int[])nArray20).interact(lIllllIIII[lIllllIIlI[118]]);
                    Time.sleepTicks((int)lIllllIIlI[8]);
                    0;
                }
                String[] stringArray34 = new String[lIllllIIlI[0]];
                stringArray34[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[119]];
                if (G.lIIlllllIIlII(NPCs.getNearest((String[])stringArray34))) {
                    g.a(lIllllIIII[lIllllIIlI[120]], cE);
                }
            }
            if (G.lIIlllllIIIll(e.j(lIllllIIlI[4]), lIllllIIlI[100])) {
                String[] stringArray = new String[lIllllIIlI[0]];
                stringArray[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[121]];
                if (G.lIIlllllIlIIl(NPCs.getNearest((String[])stringArray))) {
                    String[] stringArray35 = new String[lIllllIIlI[0]];
                    stringArray35[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[122]];
                    if (G.lIIlllllIlIIl(NPCs.getNearest((String[])stringArray35))) {
                        int[] nArray21 = new int[lIllllIIlI[0]];
                        nArray21[G.lIllllIIlI[1]] = lIllllIIlI[117];
                        TileObjects.getNearest((int[])nArray21).interact(lIllllIIII[lIllllIIlI[123]]);
                        Time.sleepTicks((int)lIllllIIlI[8]);
                        0;
                    }
                }
                String[] stringArray36 = new String[lIllllIIlI[0]];
                stringArray36[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[124]];
                if (G.lIIlllllIIlII(NPCs.getNearest((String[])stringArray36))) {
                    g.a(lIllllIIII[lIllllIIlI[125]], cE);
                }
                String[] stringArray37 = new String[lIllllIIlI[0]];
                stringArray37[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[126]];
                if (G.lIIlllllIIlII(NPCs.getNearest((String[])stringArray37))) {
                    g.a(lIllllIIII[lIllllIIlI[127]], cE);
                }
            }
            if (G.lIIlllllIIIlI(e.j(lIllllIIlI[4]), lIllllIIlI[106]) && G.lIIlllllIlIII(e.j(lIllllIIlI[4]), lIllllIIlI[119])) {
                if (G.lIIllllIlllll(Dialog.isOpen() ? 1 : 0)) {
                    g.a(cE);
                }
                String[] stringArray = new String[lIllllIIlI[0]];
                stringArray[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[128]];
                if (G.lIIlllllIIlII(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray38 = new String[lIllllIIlI[0]];
                    stringArray38[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[129]];
                    if (G.lIIllllIlllll(Inventory.contains((String[])stringArray38) ? 1 : 0)) {
                        AccBuilderSotf.c = lIllllIIII[lIllllIIlI[130]];
                        int[] nArray22 = new int[lIllllIIlI[0]];
                        nArray22[G.lIllllIIlI[1]] = lIllllIIlI[14];
                        if (G.lIIllllIlllll(Inventory.contains((int[])nArray22) ? 1 : 0) && G.lIIlllllIIIll(Players.getLocal().getAnimation(), lIllllIIlI[33])) {
                            int[] nArray23 = new int[lIllllIIlI[0]];
                            nArray23[G.lIllllIIlI[1]] = lIllllIIlI[14];
                            Inventory.getFirst((int[])nArray23).interact(lIllllIIII[lIllllIIlI[131]]);
                            Time.sleepTicks((int)lIllllIIlI[7]);
                            0;
                        }
                    }
                }
                if (G.lIIlllllIIIIl(Players.getLocal().getWorldLocation().equals((Object)fN) ? 1 : 0) && G.lIIlllllIIlll(Players.getLocal().getWorldLocation().distanceTo(fQ), lIllllIIlI[12])) {
                    String[] stringArray39 = new String[lIllllIIlI[0]];
                    stringArray39[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[132]];
                    if (G.lIIlllllIlIIl(TileObjects.getNearest((String[])stringArray39))) {
                        AccBuilderSotf.c = lIllllIIII[lIllllIIlI[133]];
                        Movement.walkTo((WorldPoint)fN);
                        0;
                        Time.sleepTicks((int)lIllllIIlI[0]);
                        0;
                        var28 = Widgets.get((int)lIllllIIlI[40], (int)lIllllIIlI[30]);
                        if (G.lIIlllllIIlII(var28)) {
                            Mouse.click((int)var28.getClickPoint().getX(), (int)var28.getClickPoint().getY(), (boolean)lIllllIIlI[0]);
                            Time.sleepTicks((int)lIllllIIlI[11]);
                            0;
                        }
                        if (G.lIIlllllIIlII(var7 = Widgets.get((int)lIllllIIlI[40], (int)lIllllIIlI[41]))) {
                            Mouse.click((int)var7.getClickPoint().getX(), (int)var7.getClickPoint().getY(), (boolean)lIllllIIlI[0]);
                            Time.sleepTicks((int)lIllllIIlI[11]);
                            0;
                        }
                    }
                }
                if (G.lIIllllIlllll(Players.getLocal().getWorldLocation().equals((Object)fN) ? 1 : 0)) {
                    int[] nArray24 = new int[lIllllIIlI[0]];
                    nArray24[G.lIllllIIlI[1]] = lIllllIIlI[134];
                    if (G.lIIllllIlllll(Inventory.contains((int[])nArray24) ? 1 : 0)) {
                        int[] nArray25 = new int[lIllllIIlI[0]];
                        nArray25[G.lIllllIIlI[1]] = lIllllIIlI[134];
                        Inventory.getFirst((int[])nArray25).interact(lIllllIIII[lIllllIIlI[135]]);
                        Time.sleepTicks((int)lIllllIIlI[7]);
                        0;
                    }
                }
                String[] stringArray40 = new String[lIllllIIlI[0]];
                stringArray40[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[136]];
                var28 = TileObjects.getNearest((String[])stringArray40);
                if (G.lIIlllllIIlII(var28)) {
                    var28.interact(lIllllIIII[lIllllIIlI[137]]);
                    Time.sleepTicks((int)lIllllIIlI[7]);
                    0;
                }
                String[] stringArray41 = new String[lIllllIIlI[0]];
                stringArray41[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[138]];
                var7 = TileItems.getNearest((String[])stringArray41);
                if (G.lIIlllllIIlII(var7)) {
                    var7.interact(lIllllIIII[lIllllIIlI[139]]);
                    Time.sleepTicks((int)lIllllIIlI[7]);
                    0;
                }
                String[] stringArray42 = new String[lIllllIIlI[0]];
                stringArray42[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[140]];
                if (G.lIIllllIlllll(Inventory.contains((String[])stringArray42) ? 1 : 0) && G.lIIllllIlllll(Players.getLocal().getWorldLocation().equals((Object)fN) ? 1 : 0)) {
                    String[] stringArray43 = new String[lIllllIIlI[0]];
                    stringArray43[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[141]];
                    if (G.lIIllllIlllll(Inventory.contains((String[])stringArray43) ? 1 : 0)) {
                        String[] stringArray44 = new String[lIllllIIlI[0]];
                        stringArray44[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[142]];
                        Inventory.getFirst((String[])stringArray44).interact(lIllllIIII[lIllllIIlI[143]]);
                        Time.sleepTicks((int)lIllllIIlI[0]);
                        0;
                    }
                }
            }
            if (G.lIIlllllIIIlI(e.j(lIllllIIlI[4]), lIllllIIlI[124]) && G.lIIlllllIIIII(e.j(lIllllIIlI[4]), lIllllIIlI[140])) {
                int[] nArray26 = new int[lIllllIIlI[0]];
                nArray26[G.lIllllIIlI[1]] = lIllllIIlI[20];
                if (G.lIIlllllIIIIl(Equipment.contains((int[])nArray26) ? 1 : 0)) {
                    int[] nArray27 = new int[lIllllIIlI[0]];
                    nArray27[G.lIllllIIlI[1]] = lIllllIIlI[20];
                    if (G.lIIllllIlllll(Inventory.contains((int[])nArray27) ? 1 : 0)) {
                        int[] nArray28 = new int[lIllllIIlI[0]];
                        nArray28[G.lIllllIIlI[1]] = lIllllIIlI[20];
                        Inventory.getFirst((int[])nArray28).interact(lIllllIIII[lIllllIIlI[144]]);
                    }
                }
                String[] stringArray = new String[lIllllIIlI[0]];
                stringArray[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[145]];
                var28 = NPCs.getAll((String[])stringArray);
                var7 = var28.stream().filter(nPC -> {
                    String[] stringArray = new String[lIllllIIlI[0]];
                    stringArray[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[181]];
                    return nPC.hasAction(stringArray);
                }).findFirst().orElse(null);
                if (G.lIIlllllIIIII(Prayers.getPoints(), lIllllIIlI[30])) {
                    Inventory.getFirst(item -> item.getName().contains(lIllllIIII[lIllllIIlI[180]])).interact(lIllllIIII[lIllllIIlI[146]]);
                }
                if (G.lIIlllllIlIIl(var7)) {
                    AccBuilderSotf.c = lIllllIIII[lIllllIIlI[147]];
                    if (G.lIIllllIlllll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                    }
                    String[] stringArray45 = new String[lIllllIIlI[0]];
                    stringArray45[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[148]];
                    String[] stringArray46 = new String[lIllllIIlI[0]];
                    stringArray46[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[149]];
                    Inventory.getFirst((String[])stringArray45).useOn((Actor)NPCs.getNearest((String[])stringArray46));
                    Time.sleepTicks((int)lIllllIIlI[32]);
                    0;
                }
                if (G.lIIlllllIIlII(var7)) {
                    AccBuilderSotf.c = lIllllIIII[lIllllIIlI[150]];
                    if (G.lIIlllllIIIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                    }
                }
                if (G.lIIlllllIIlII(var7) && G.lIIlllllIlIIl(Players.getLocal().getInteracting())) {
                    AccBuilderSotf.c = lIllllIIII[lIllllIIlI[151]];
                    var7.interact(lIllllIIII[lIllllIIlI[152]]);
                    Time.sleepTicks((int)lIllllIIlI[7]);
                    0;
                }
            }
            if (G.lIIlllllIIIll(e.j(lIllllIIlI[4]), lIllllIIlI[140])) {
                if (G.lIIllllIlllll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                }
                if (G.lIIlllllIIlll(Players.getLocal().getWorldLocation().distanceTo(fP), lIllllIIlI[8]) && G.lIIlllllIIlll(Players.getLocal().getWorldLocation().distanceTo(fO), lIllllIIlI[29])) {
                    G.cc();
                }
                if (G.lIIlllllIlIII(Players.getLocal().getWorldLocation().distanceTo(fP), lIllllIIlI[8])) {
                    String[] stringArray = new String[lIllllIIlI[0]];
                    stringArray[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[153]];
                    TileObjects.getNearest((String[])stringArray).interact(lIllllIIII[lIllllIIlI[154]]);
                    Time.sleepTicks((int)lIllllIIlI[8]);
                    0;
                }
                if (G.lIIlllllIlIII(Players.getLocal().getWorldLocation().distanceTo(fO), lIllllIIlI[29])) {
                    if (G.lIIlllllIIIII(di, lIllllIIlI[0])) {
                        aN.qH += lIllllIIlI[0];
                        aN.u(AccBuilderSotf.m);
                        di += lIllllIIlI[0];
                        aN.qH = lIllllIIlI[1];
                        dj = lIllllIIlI[1];
                    }
                    String[] stringArray = new String[lIllllIIlI[0]];
                    stringArray[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[155]];
                    if (G.lIIlllllIlIIl(NPCs.getNearest((String[])stringArray))) {
                        String[] stringArray47 = new String[lIllllIIlI[0]];
                        stringArray47[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[156]];
                        if (G.lIIlllllIlIIl(NPCs.getNearest((String[])stringArray47))) {
                            int[] nArray29 = new int[lIllllIIlI[0]];
                            nArray29[G.lIllllIIlI[1]] = lIllllIIlI[117];
                            TileObjects.getNearest((int[])nArray29).interact(lIllllIIII[lIllllIIlI[157]]);
                            Time.sleepTicks((int)lIllllIIlI[8]);
                            0;
                        }
                    }
                    String[] stringArray48 = new String[lIllllIIlI[0]];
                    stringArray48[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[158]];
                    if (G.lIIlllllIIlII(NPCs.getNearest((String[])stringArray48))) {
                        g.a(lIllllIIII[lIllllIIlI[159]], cE);
                    }
                    String[] stringArray49 = new String[lIllllIIlI[0]];
                    stringArray49[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[160]];
                    if (G.lIIlllllIIlII(NPCs.getNearest((String[])stringArray49))) {
                        g.a(lIllllIIII[lIllllIIlI[161]], cE);
                    }
                }
            }
        }
    }

    private static boolean lIIlllllIIllI(int n2) {
        return n2 < 0;
    }

    private static String lIIllllIllIII(String var14, String var29) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var29.getBytes(StandardCharsets.UTF_8)), lIllllIIlI[28]), "DES");
            Cipher var21 = Cipher.getInstance("DES");
            var21.init(lIllllIIlI[7], var9);
            return new String(var21.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllllIIlIl(int n2) {
        return n2 > 0;
    }

    private static void lIIllllIlllII() {
        lIllllIIII = new String[lIllllIIlI[211]];
        G.lIllllIIII[G.lIllllIIlI[1]] = G."Finished buying items, switching back to quest";
        G.lIllllIIII[G.lIllllIIlI[0]] = G."Nav to bank";
        G.lIllllIIII[G.lIllllIIlI[7]] = G."Handling banking";
        G.lIllllIIII[G.lIllllIIlI[11]] = G."We are missing quest supplies, switching to BUYING";
        G.lIllllIIII[G.lIllllIIlI[8]] = G."We are missing quest supplies, switching to BUYING";
        G.lIllllIIII[G.lIllllIIlI[5]] = G."Drink";
        G.lIllllIIII[G.lIllllIIlI[12]] = G."Eat";
        G.lIllllIIII[G.lIllllIIlI[21]] = G."Gate";
        G.lIllllIIII[G.lIllllIIlI[28]] = G."Open";
        G.lIllllIIII[G.lIllllIIlI[32]] = G."Using salve tele";
        G.lIllllIIII[G.lIllllIIlI[10]] = G."Break";
        G.lIllllIIII[G.lIllllIIlI[34]] = G."Nav to grotto";
        G.lIllllIIII[G.lIllllIIlI[46]] = G."Mirror";
        G.lIllllIIII[G.lIllllIIlI[47]] = G."Getting mirror";
        G.lIllllIIII[G.lIllllIIlI[48]] = G."Washing bowl";
        G.lIllllIIII[G.lIllllIIlI[29]] = G."Mirror";
        G.lIllllIIII[G.lIllllIIlI[49]] = G."Take";
        G.lIllllIIII[G.lIllllIIlI[41]] = G."Mirror";
        G.lIllllIIII[G.lIllllIIlI[50]] = G."Take";
        G.lIllllIIII[G.lIllllIIlI[51]] = G."Mirror";
        G.lIllllIIII[G.lIllllIIlI[30]] = G."Journal";
        G.lIllllIIII[G.lIllllIIlI[52]] = G."Grotto tree";
        G.lIllllIIII[G.lIllllIIlI[53]] = G."Search";
        G.lIllllIIII[G.lIllllIIlI[54]] = G."Filliman Tarlock";
        G.lIllllIIII[G.lIllllIIlI[55]] = G."Grotto";
        G.lIllllIIII[G.lIllllIIlI[56]] = G."Enter";
        G.lIllllIIII[G.lIllllIIlI[57]] = G."Filliman Tarlock";
        G.lIllllIIII[G.lIllllIIlI[58]] = G."Filliman Tarlock";
        G.lIllllIIII[G.lIllllIIlI[59]] = G."Mirror";
        G.lIllllIIII[G.lIllllIIlI[60]] = G."Journal";
        G.lIllllIIII[G.lIllllIIlI[61]] = G."Wear";
        G.lIllllIIII[G.lIllllIIlI[62]] = G."Filliman Tarlock";
        G.lIllllIIII[G.lIllllIIlI[63]] = G."Grotto";
        G.lIllllIIII[G.lIllllIIlI[64]] = G."Enter";
        G.lIllllIIII[G.lIllllIIlI[65]] = G."Filliman Tarlock";
        G.lIllllIIII[G.lIllllIIlI[66]] = G."Mirror";
        G.lIllllIIII[G.lIllllIIlI[67]] = G."Filliman Tarlock";
        G.lIllllIIII[G.lIllllIIlI[68]] = G."Mirror";
        G.lIllllIIII[G.lIllllIIlI[69]] = G."Filliman Tarlock";
        G.lIllllIIII[G.lIllllIIlI[70]] = G."Filliman Tarlock";
        G.lIllllIIII[G.lIllllIIlI[71]] = G."Grotto";
        G.lIllllIIII[G.lIllllIIlI[72]] = G."Enter";
        G.lIllllIIII[G.lIllllIIlI[73]] = G."Journal";
        G.lIllllIIII[G.lIllllIIlI[74]] = G."Filliman Tarlock";
        G.lIllllIIII[G.lIllllIIlI[75]] = G."Filliman Tarlock";
        G.lIllllIIII[G.lIllllIIlI[76]] = G."Grotto";
        G.lIllllIIII[G.lIllllIIlI[77]] = G."Enter";
        G.lIllllIIII[G.lIllllIIlI[78]] = G."Filliman Tarlock";
        G.lIllllIIII[G.lIllllIIlI[79]] = G."Filliman Tarlock";
        G.lIllllIIII[G.lIllllIIlI[80]] = G."Breaking tab";
        G.lIllllIIII[G.lIllllIIlI[22]] = G."Break";
        G.lIllllIIII[G.lIllllIIlI[81]] = G."Nav to priest";
        G.lIllllIIII[G.lIllllIIlI[82]] = G."Trapdoor";
        G.lIllllIIII[G.lIllllIIlI[83]] = G."Trapdoor";
        G.lIllllIIII[G.lIllllIIlI[84]] = G."Open";
        G.lIllllIIII[G.lIllllIIlI[85]] = G."Interact priest";
        G.lIllllIIII[G.lIllllIIlI[86]] = G."Drezel";
        G.lIllllIIII[G.lIllllIIlI[87]] = G."Breaking tab";
        G.lIllllIIII[G.lIllllIIlI[88]] = G."Break";
        G.lIllllIIII[G.lIllllIIlI[89]] = G."Nav to log";
        G.lIllllIIII[G.lIllllIIlI[3]] = G."Cast";
        G.lIllllIIII[G.lIllllIIlI[91]] = G."Fungi on log";
        G.lIllllIIII[G.lIllllIIlI[92]] = G."Pick";
        G.lIllllIIII[G.lIllllIIlI[93]] = G."Fungi on log";
        G.lIllllIIII[G.lIllllIIlI[94]] = G."Pick";
        G.lIllllIIII[G.lIllllIIlI[95]] = G."Nav to grotto";
        G.lIllllIIII[G.lIllllIIlI[96]] = G."Filliman Tarlock";
        G.lIllllIIII[G.lIllllIIlI[97]] = G."Grotto";
        G.lIllllIIII[G.lIllllIIlI[98]] = G."Enter";
        G.lIllllIIII[G.lIllllIIlI[99]] = G."Filliman Tarlock";
        G.lIllllIIII[G.lIllllIIlI[100]] = G."Filliman Tarlock";
        G.lIllllIIII[G.lIllllIIlI[101]] = G."Mort myre fungus";
        G.lIllllIIII[G.lIllllIIlI[102]] = G."Mort myre fungus";
        G.lIllllIIII[G.lIllllIIlI[103]] = G."Solving puzzle";
        G.lIllllIIII[G.lIllllIIlI[104]] = G."Mort myre fungus";
        G.lIllllIIII[G.lIllllIIlI[106]] = G."A used spell";
        G.lIllllIIII[G.lIllllIIlI[107]] = G."A used spell";
        G.lIllllIIII[G.lIllllIIlI[109]] = G."A used spell";
        G.lIllllIIII[G.lIllllIIlI[110]] = G."Mort myre fungus";
        G.lIllllIIII[G.lIllllIIlI[112]] = G."Talking to filliman";
        G.lIllllIIII[G.lIllllIIlI[113]] = G."Filliman Tarlock";
        G.lIllllIIII[G.lIllllIIlI[114]] = G."Grotto";
        G.lIllllIIII[G.lIllllIIlI[115]] = G."Enter";
        G.lIllllIIII[G.lIllllIIlI[116]] = G."Filliman Tarlock";
        G.lIllllIIII[G.lIllllIIlI[118]] = G."Search";
        G.lIllllIIII[G.lIllllIIlI[119]] = G."Filliman Tarlock";
        G.lIllllIIII[G.lIllllIIlI[120]] = G."Filliman Tarlock";
        G.lIllllIIII[G.lIllllIIlI[121]] = G."Filliman Tarlock";
        G.lIllllIIII[G.lIllllIIlI[122]] = G."Nature Spirit";
        G.lIllllIIII[G.lIllllIIlI[123]] = G."Search";
        G.lIllllIIII[G.lIllllIIlI[124]] = G."Filliman Tarlock";
        G.lIllllIIII[G.lIllllIIlI[125]] = G."Filliman Tarlock";
        G.lIllllIIII[G.lIllllIIlI[126]] = G."Nature Spirit";
        G.lIllllIIII[G.lIllllIIlI[127]] = G."Nature Spirit";
        G.lIllllIIII[G.lIllllIIlI[128]] = G."Grotto";
        G.lIllllIIII[G.lIllllIIlI[129]] = G."Druid pouch";
        G.lIllllIIII[G.lIllllIIlI[130]] = G."Breaking tab";
        G.lIllllIIII[G.lIllllIIlI[131]] = G."Break";
        G.lIllllIIII[G.lIllllIIlI[132]] = G."Grotto";
        G.lIllllIIII[G.lIllllIIlI[133]] = G."Nav to log";
        G.lIllllIIII[G.lIllllIIlI[135]] = G."Cast Bloom";
        G.lIllllIIII[G.lIllllIIlI[136]] = G."Fungi on log";
        G.lIllllIIII[G.lIllllIIlI[137]] = G."Pick";
        G.lIllllIIII[G.lIllllIIlI[138]] = G."Fungi on log";
        G.lIllllIIII[G.lIllllIIlI[139]] = G."Pick";
        G.lIllllIIII[G.lIllllIIlI[140]] = G."Mort myre fungus";
        G.lIllllIIII[G.lIllllIIlI[141]] = G."Druid pouch";
        G.lIllllIIII[G.lIllllIIlI[142]] = G."Druid pouch";
        G.lIllllIIII[G.lIllllIIlI[143]] = G."Fill";
        G.lIllllIIII[G.lIllllIIlI[144]] = G."Wield";
        G.lIllllIIII[G.lIllllIIlI[145]] = G."Ghast";
        G.lIllllIIII[G.lIllllIIlI[146]] = G."Drink";
        G.lIllllIIII[G.lIllllIIlI[147]] = G."Using druid pouch on ghast";
        G.lIllllIIII[G.lIllllIIlI[148]] = G."Druid pouch";
        G.lIllllIIII[G.lIllllIIlI[149]] = G."Ghast";
        G.lIllllIIII[G.lIllllIIlI[150]] = G."Killing ghasts";
        G.lIllllIIII[G.lIllllIIlI[151]] = G."Killing ghasts, no interacting";
        G.lIllllIIII[G.lIllllIIlI[152]] = G."Attack";
        G.lIllllIIII[G.lIllllIIlI[153]] = G."Grotto";
        G.lIllllIIII[G.lIllllIIlI[154]] = G."Enter";
        G.lIllllIIII[G.lIllllIIlI[155]] = G."Filliman Tarlock";
        G.lIllllIIII[G.lIllllIIlI[156]] = G."Nature Spirit";
        G.lIllllIIII[G.lIllllIIlI[157]] = G."Search";
        G.lIllllIIII[G.lIllllIIlI[158]] = G."Filliman Tarlock";
        G.lIllllIIII[G.lIllllIIlI[159]] = G."Filliman Tarlock";
        G.lIllllIIII[G.lIllllIIlI[160]] = G."Nature Spirit";
        G.lIllllIIII[G.lIllllIIlI[161]] = G."Nature Spirit";
        G.lIllllIIII[G.lIllllIIlI[162]] = G."Nav to grotto";
        G.lIllllIIII[G.lIllllIIlI[163]] = G."Salve graveyard teleport";
        G.lIllllIIII[G.lIllllIIlI[164]] = G."Silver sickle";
        G.lIllllIIII[G.lIllllIIlI[165]] = G."Silver sickle";
        G.lIllllIIII[G.lIllllIIlI[166]] = G."Mort myre fungus";
        G.lIllllIIII[G.lIllllIIlI[167]] = G."";
        G.lIllllIIII[G.lIllllIIlI[168]] = G."";
        G.lIllllIIII[G.lIllllIIlI[178]] = G."Nature spirit";
        G.lIllllIIII[G.lIllllIIlI[179]] = G."ring of wealth (";
        G.lIllllIIII[G.lIllllIIlI[180]] = G."Prayer";
        G.lIllllIIII[G.lIllllIIlI[181]] = G."Attack";
        G.lIllllIIII[G.lIllllIIlI[192]] = G."I'm looking for a quest!";
        G.lIllllIIII[G.lIllllIIlI[193]] = G."Yes.";
        G.lIllllIIII[G.lIllllIIlI[31]] = G."Ok, let me help then.";
        G.lIllllIIII[G.lIllllIIlI[194]] = G."Yep, now tell me what the problem is.";
        G.lIllllIIII[G.lIllllIIlI[195]] = G."Sure.";
        G.lIllllIIII[G.lIllllIIlI[196]] = G."You're right, we don't.";
        G.lIllllIIII[G.lIllllIIlI[197]] = G."Is there anything else interesting to do around here?";
        G.lIllllIIII[G.lIllllIIlI[198]] = G."Well, what is it, I may be able to help?";
        G.lIllllIIII[G.lIllllIIlI[199]] = G."Yes, I'll go and look for him.";
        G.lIllllIIII[G.lIllllIIlI[200]] = G."Yes, I'm sure.";
        G.lIllllIIII[G.lIllllIIlI[201]] = G."I'll get going.";
        G.lIllllIIII[G.lIllllIIlI[202]] = G."I think I've solved the puzzle!";
        G.lIllllIIII[G.lIllllIIlI[203]] = G."How can I help?";
        G.lIllllIIII[G.lIllllIIlI[204]] = G."Roald sent me to check on Drezel.";
        G.lIllllIIII[G.lIllllIIlI[205]] = G."Why is the river such a good defence?";
        G.lIllllIIII[G.lIllllIIlI[206]] = G."You're right, we don't.";
        G.lIllllIIII[G.lIllllIIlI[207]] = G."Yes, of course.";
        G.lIllllIIII[G.lIllllIIlI[208]] = G."Do you know of anything I can do in Morytania?";
        G.lIllllIIII[G.lIllllIIlI[209]] = G."How long have you been a ghost?";
        G.lIllllIIII[G.lIllllIIlI[210]] = G."What's this pouch for?";
    }

    static {
        G.lIIllllIlllIl();
        G.lIIllllIlllII();
        fH = lIllllIIlI[182];
        fI = lIllllIIlI[142];
        fJ = lIllllIIlI[2];
        fK = lIllllIIlI[4];
        fL = new WorldPoint(lIllllIIlI[37], lIllllIIlI[183], lIllllIIlI[1]);
        fM = new WorldPoint(lIllllIIlI[184], lIllllIIlI[185], lIllllIIlI[1]);
        fN = new WorldPoint(lIllllIIlI[186], lIllllIIlI[187], lIllllIIlI[1]);
        fO = new WorldPoint(lIllllIIlI[44], lIllllIIlI[188], lIllllIIlI[1]);
        fP = new WorldPoint(lIllllIIlI[184], lIllllIIlI[189], lIllllIIlI[1]);
        fQ = new WorldPoint(lIllllIIlI[184], lIllllIIlI[190], lIllllIIlI[1]);
        bv = new ArrayList<d>();
        dF = lIllllIIlI[1];
        fR = new WorldArea(lIllllIIlI[191], lIllllIIlI[43], lIllllIIlI[51], lIllllIIlI[47], lIllllIIlI[1]);
        String[] stringArray = new String[lIllllIIlI[30]];
        stringArray[G.lIllllIIlI[1]] = lIllllIIII[lIllllIIlI[192]];
        stringArray[G.lIllllIIlI[0]] = lIllllIIII[lIllllIIlI[193]];
        stringArray[G.lIllllIIlI[7]] = lIllllIIII[lIllllIIlI[31]];
        stringArray[G.lIllllIIlI[11]] = lIllllIIII[lIllllIIlI[194]];
        stringArray[G.lIllllIIlI[8]] = lIllllIIII[lIllllIIlI[195]];
        stringArray[G.lIllllIIlI[5]] = lIllllIIII[lIllllIIlI[196]];
        stringArray[G.lIllllIIlI[12]] = lIllllIIII[lIllllIIlI[197]];
        stringArray[G.lIllllIIlI[21]] = lIllllIIII[lIllllIIlI[198]];
        stringArray[G.lIllllIIlI[28]] = lIllllIIII[lIllllIIlI[199]];
        stringArray[G.lIllllIIlI[32]] = lIllllIIII[lIllllIIlI[200]];
        stringArray[G.lIllllIIlI[10]] = lIllllIIII[lIllllIIlI[201]];
        stringArray[G.lIllllIIlI[34]] = lIllllIIII[lIllllIIlI[202]];
        stringArray[G.lIllllIIlI[46]] = lIllllIIII[lIllllIIlI[203]];
        stringArray[G.lIllllIIlI[47]] = lIllllIIII[lIllllIIlI[204]];
        stringArray[G.lIllllIIlI[48]] = lIllllIIII[lIllllIIlI[205]];
        stringArray[G.lIllllIIlI[29]] = lIllllIIII[lIllllIIlI[206]];
        stringArray[G.lIllllIIlI[49]] = lIllllIIII[lIllllIIlI[207]];
        stringArray[G.lIllllIIlI[41]] = lIllllIIII[lIllllIIlI[208]];
        stringArray[G.lIllllIIlI[50]] = lIllllIIII[lIllllIIlI[209]];
        stringArray[G.lIllllIIlI[51]] = lIllllIIII[lIllllIIlI[210]];
        cE = stringArray;
    }

    private static String lIIllllIlIlll(String var8, String var16) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lIllllIIlI[7], var22);
            return new String(var2.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }
}

