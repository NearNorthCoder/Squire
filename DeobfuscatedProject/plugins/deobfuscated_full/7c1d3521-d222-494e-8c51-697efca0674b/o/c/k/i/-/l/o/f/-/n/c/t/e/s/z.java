/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
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
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aN;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;

public class z
implements ac {
    private static /* synthetic */ String[] cE;
    static /* synthetic */ int cG;
    static /* synthetic */ boolean dj;
    public static final /* synthetic */ WorldPoint eb;
    static /* synthetic */ int di;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ String[] lllIIIllIl;
    public static /* synthetic */ List<d> bv;
    public static final /* synthetic */ WorldPoint ea;
    public static final /* synthetic */ WorldPoint ec;
    private static /* synthetic */ int[] lllIIIlllI;

    @Override
    public int af() {
        try {
            z.bt();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x5F ^ 0x59) & ~(0x4B ^ 0x4D)) > 3) {
            return (0x71 ^ 0x7B) & ~(0x71 ^ 0x7B);
        }
        return lllIIIlllI[51];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        String[] stringArray = new String[lllIIIlllI[1]];
        stringArray[z.lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[40]];
        if (z.llIIIIIIIIIlI(Inventory.getCount((String[])stringArray))) {
            String[] stringArray2 = new String[lllIIIlllI[1]];
            stringArray2[z.lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[41]];
            if (z.llIIIIIIIIIlI(Inventory.getCount((String[])stringArray2))) {
                String[] stringArray3 = new String[lllIIIlllI[1]];
                stringArray3[z.lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[42]];
                if (z.llIIIIIIIIIlI(Inventory.getCount((String[])stringArray3))) {
                    String[] stringArray4 = new String[lllIIIlllI[1]];
                    stringArray4[z.lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[43]];
                    if (z.llIIIIIIIIIlI(Inventory.getCount((String[])stringArray4))) {
                        n2 = lllIIIlllI[1];
                        0;
                        if (2 >= 0) return n2 != 0;
                        return ((0x25 ^ 0x6D ^ (0x2C ^ 0x4B)) & (131 + 86 - 178 + 106 ^ 167 + 155 - 152 + 20 ^ -1)) != 0;
                    }
                }
            }
        }
        n2 = lllIIIlllI[0];
        return n2 != 0;
    }

    private static void Q() {
        d var15;
        Object var17;
        int[] nArray = new int[lllIIIlllI[1]];
        nArray[z.lllIIIlllI[0]] = lllIIIlllI[44];
        if (z.llIIIIIIIIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lllIIIlllI[44], lllIIIlllI[9], j.cf);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[lllIIIlllI[1]];
        nArray2[z.lllIIIlllI[0]] = lllIIIlllI[11];
        if (z.llIIIIIIIIIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var17 = new d(lllIIIlllI[11], lllIIIlllI[1], lllIIIlllI[45]);
            bv.add((d)var17);
            0;
        }
        int[] nArray3 = new int[lllIIIlllI[1]];
        nArray3[z.lllIIIlllI[0]] = lllIIIlllI[12];
        if (z.llIIIIIIIIIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var17 = new d(lllIIIlllI[12], lllIIIlllI[1], lllIIIlllI[45]);
            bv.add((d)var17);
            0;
        }
        int[] nArray4 = new int[lllIIIlllI[1]];
        nArray4[z.lllIIIlllI[0]] = lllIIIlllI[14];
        if (z.llIIIIIIIIIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var17 = new d(lllIIIlllI[14], lllIIIlllI[1], lllIIIlllI[45]);
            bv.add((d)var17);
            0;
        }
        int[] nArray5 = new int[lllIIIlllI[1]];
        nArray5[z.lllIIIlllI[0]] = lllIIIlllI[13];
        if (z.llIIIIIIIIIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var17 = new d(lllIIIlllI[13], lllIIIlllI[1], lllIIIlllI[45]);
            bv.add((d)var17);
            0;
        }
        int[] nArray6 = new int[lllIIIlllI[1]];
        nArray6[z.lllIIIlllI[0]] = lllIIIlllI[4];
        if (z.llIIIIIIIIIII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var17 = new d(lllIIIlllI[4], lllIIIlllI[17], lllIIIlllI[45]);
            bv.add((d)var17);
            0;
        }
        if (z.llIIIIIIIIIII(Bank.contains((Predicate)(var17 = item -> item.getName().toLowerCase().contains(lllIIIllIl[lllIIIlllI[53]]))) ? 1 : 0)) {
            var15 = new d(lllIIIlllI[46], lllIIIlllI[9], lllIIIlllI[47]);
            bv.add(var15);
            0;
        }
        int[] nArray7 = new int[lllIIIlllI[1]];
        nArray7[z.lllIIIlllI[0]] = lllIIIlllI[48];
        if (z.llIIIIIIIIIII(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var15 = new d(lllIIIlllI[48], lllIIIlllI[49], lllIIIlllI[50]);
            bv.add(var15);
            0;
        }
    }

    private static boolean llIIIIIIIIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllllllllllI(int n2) {
        return n2 != 0;
    }

    private static String lIlllllllIlll(String var4, String var3) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lllIIIlllI[19]), "DES");
            Cipher var25 = Cipher.getInstance("DES");
            var25.init(lllIIIlllI[3], var12);
            return new String(var25.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllllllllll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        z.lIlllllllllII();
        z.lIllllllllIlI();
        ea = new WorldPoint(lllIIIlllI[54], lllIIIlllI[55], lllIIIlllI[0]);
        eb = new WorldPoint(lllIIIlllI[56], lllIIIlllI[57], lllIIIlllI[1]);
        ec = new WorldPoint(lllIIIlllI[58], lllIIIlllI[59], lllIIIlllI[0]);
        bv = new ArrayList<d>();
        cG = lllIIIlllI[0];
        String[] stringArray = new String[lllIIIlllI[9]];
        stringArray[z.lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[60]];
        stringArray[z.lllIIIlllI[1]] = lllIIIllIl[lllIIIlllI[61]];
        stringArray[z.lllIIIlllI[3]] = lllIIIllIl[lllIIIlllI[62]];
        stringArray[z.lllIIIlllI[5]] = lllIIIllIl[lllIIIlllI[63]];
        stringArray[z.lllIIIlllI[8]] = lllIIIllIl[lllIIIlllI[64]];
        cE = stringArray;
    }

    private static void lIlllllllllII() {
        lllIIIlllI = new int[65];
        z.lllIIIlllI[0] = (0x99 ^ 0xC0) & ~(0xEF ^ 0xB6);
        z.lllIIIlllI[1] = 1;
        z.lllIIIlllI[2] = 164 + 82 - 125 + 56 ^ 96 + 3 - 61 + 93;
        z.lllIIIlllI[3] = 2;
        z.lllIIIlllI[4] = -(0xFFFFDCAD & 0x3FD3) & (0xFFFFFFFB & 0x1DFF);
        z.lllIIIlllI[5] = 3;
        z.lllIIIlllI[6] = -(0xFFFFF59F & 0x6E75) & (0xFFFFEFF7 & 0x77FF);
        z.lllIIIlllI[7] = 0x19 ^ 0x44 ^ (0x1F ^ 0x12);
        z.lllIIIlllI[8] = 0xFF ^ 0xB3 ^ (0xDF ^ 0x97);
        z.lllIIIlllI[9] = 0xC7 ^ 0xC2;
        z.lllIIIlllI[10] = -(0xFFFFEF7F & 0x74B7) & (0xFFFFF7FE & 0x7FBF);
        z.lllIIIlllI[11] = -(0xFFFFF697 & 0x5DEE) & (0xFFFFFCDF & 0x5FFF);
        z.lllIIIlllI[12] = -(0xFFFFF3FF & 0x6DA9) & (0xFFFFEBFC & 0x7DFF);
        z.lllIIIlllI[13] = -(0xFFFFFFFF & 0x7223) & (0xFFFFFBFA & 0x7E7F);
        z.lllIIIlllI[14] = -(0xFFFFE4FD & 0x1FAB) & (0xFFFFAEFE & 0x5DFF);
        z.lllIIIlllI[15] = 0x40 ^ 0x46;
        z.lllIIIlllI[16] = 0xFFFFDF7D & 0x3FCB;
        z.lllIIIlllI[17] = 0xFE ^ 0x9D ^ (0xD1 ^ 0xB8);
        z.lllIIIlllI[18] = 0x14 ^ 0x13;
        z.lllIIIlllI[19] = 0x6D ^ 0x43 ^ (0xA5 ^ 0x83);
        z.lllIIIlllI[20] = 0xC8 ^ 0xC1;
        z.lllIIIlllI[21] = 0xAA ^ 0x96 ^ (0x76 ^ 0x41);
        z.lllIIIlllI[22] = 0x7E ^ 0x72;
        z.lllIIIlllI[23] = 0x32 ^ 0x3B ^ (0x6B ^ 0x6F);
        z.lllIIIlllI[24] = 0x9B ^ 0x95;
        z.lllIIIlllI[25] = -(0xFFFFA393 & 0x7FED) & (0xFFFFFBDF & 0x2FFE);
        z.lllIIIlllI[26] = 54 + 0 - -35 + 45 ^ 17 + 19 - 1 + 102;
        z.lllIIIlllI[27] = 0x59 ^ 0x4C ^ (0x8D ^ 0x88);
        z.lllIIIlllI[28] = 0x8C ^ 0xB3 ^ (0x27 ^ 9);
        z.lllIIIlllI[29] = 0xA5 ^ 0xB7;
        z.lllIIIlllI[30] = 0x74 ^ 0x67;
        z.lllIIIlllI[31] = 0x70 ^ 0x64;
        z.lllIIIlllI[32] = 0x8D ^ 0x98;
        z.lllIIIlllI[33] = 0xB4 ^ 0xA2;
        z.lllIIIlllI[34] = 141 + 7 - 118 + 138 ^ 112 + 59 - 168 + 188;
        z.lllIIIlllI[35] = 30 + 24 - -7 + 101 ^ 0 + 118 - 22 + 90;
        z.lllIIIlllI[36] = 0x6A ^ 0x73;
        z.lllIIIlllI[37] = 0x2E ^ 0x5F ^ (0xF4 ^ 0x9F);
        z.lllIIIlllI[38] = 18 + 29 - -57 + 42 ^ 27 + 109 - 106 + 107;
        z.lllIIIlllI[39] = 0xE ^ 0x4B ^ (0x1C ^ 0x45);
        z.lllIIIlllI[40] = 0x74 ^ 0x16 ^ 70 + 98 - 73 + 32;
        z.lllIIIlllI[41] = 151 + 83 - 117 + 51 ^ 168 + 96 - 131 + 49;
        z.lllIIIlllI[42] = 0xEE ^ 0x85 ^ (0xC4 ^ 0xB0);
        z.lllIIIlllI[43] = 0x90 ^ 0xB0;
        z.lllIIIlllI[44] = -(0xFFFFFBCF & 0x44B3) & (0xFFFFFFF3 & 0x71DF);
        z.lllIIIlllI[45] = -(0xFFFFD9EF & 0x66B4) & (0xFFFFDFFF & 0x77AF);
        z.lllIIIlllI[46] = -(0xFFFFDF9F & 0x7161) & (0xFFFFFFDF & 0x7FEC);
        z.lllIIIlllI[47] = 0xFFFFE5FD & 0x7BAA;
        z.lllIIIlllI[48] = 0xFFFFFFC7 & 0x1F7F;
        z.lllIIIlllI[49] = 0xE8 ^ 0xAB ^ (0x79 ^ 0x12);
        z.lllIIIlllI[50] = 0xFFFFCFEE & 0x3395;
        z.lllIIIlllI[51] = 0x29 ^ 0x4D;
        z.lllIIIlllI[52] = 0x37 ^ 0x74 ^ (0x6D ^ 0xF);
        z.lllIIIlllI[53] = 167 + 102 - 68 + 28 ^ 68 + 60 - 7 + 78;
        z.lllIIIlllI[54] = -(0xFFFFEEB7 & 0x71D9) & (0xFFFFFFFF & 0x6BFF);
        z.lllIIIlllI[55] = -(0xFFFFD9E3 & 0x763F) & (0xFFFFFDBF & 0x5FFE);
        z.lllIIIlllI[56] = 0xFFFFBF5A & 0x4BF7;
        z.lllIIIlllI[57] = -(0xFFFFFC9B & 0x13FD) & (0xFFFFFFFF & 0x1DFB);
        z.lllIIIlllI[58] = 0xFFFFEBEE & 0x1F5D;
        z.lllIIIlllI[59] = 0xFFFFE6FF & 0x3F67;
        z.lllIIIlllI[60] = 0x68 ^ 0x4B;
        z.lllIIIlllI[61] = 0x23 ^ 7;
        z.lllIIIlllI[62] = 0x3D ^ 0x18;
        z.lllIIIlllI[63] = 17 + 72 - -30 + 57 ^ 19 + 56 - -66 + 9;
        z.lllIIIlllI[64] = 0xB5 ^ 0xB9 ^ (0xD ^ 0x26);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean bu() {
        int n2;
        String[] stringArray = new String[lllIIIlllI[1]];
        stringArray[z.lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[36]];
        if (z.llIIIIIIIIIlI(Inventory.getCount((String[])stringArray))) {
            String[] stringArray2 = new String[lllIIIlllI[1]];
            stringArray2[z.lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[37]];
            if (z.llIIIIIIIIIlI(Inventory.getCount((String[])stringArray2))) {
                String[] stringArray3 = new String[lllIIIlllI[1]];
                stringArray3[z.lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[38]];
                if (z.llIIIIIIIIIlI(Inventory.getCount((String[])stringArray3))) {
                    String[] stringArray4 = new String[lllIIIlllI[1]];
                    stringArray4[z.lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[39]];
                    if (z.llIIIIIIIIIlI(Inventory.getCount((String[])stringArray4))) {
                        n2 = lllIIIlllI[1];
                        0;
                        if ((0x4C ^ 0x49) > 0) return n2 != 0;
                        return false;
                    }
                }
            }
        }
        n2 = lllIIIlllI[0];
        return n2 != 0;
    }

    private static boolean llIIIIIIIIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static int lIlllllllllIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llIIIIIIIIIIl(int n2) {
        return n2 < 0;
    }

    private static boolean llIIIIIIIIIll(Object object) {
        return object != null;
    }

    private static void lIllllllllIlI() {
        lllIIIllIl = new String[lllIIIlllI[49]];
        z.lllIIIllIl[z.lllIIIlllI[0]] = z."Buying items";
        z.lllIIIllIl[z.lllIIIlllI[1]] = z."Finished buying items, switching back to quest";
        z.lllIIIllIl[z.lllIIIlllI[3]] = z."Drink";
        z.lllIIIllIl[z.lllIIIlllI[5]] = z."Eat";
        z.lllIIIllIl[z.lllIIIlllI[8]] = z."Nav to bank";
        z.lllIIIllIl[z.lllIIIlllI[9]] = z."Handling banking";
        z.lllIIIllIl[z.lllIIIlllI[15]] = z."We are missing quest supplies, switching to BUYING";
        z.lllIIIllIl[z.lllIIIlllI[18]] = z."Nav to start";
        z.lllIIIllIl[z.lllIIIlllI[19]] = z."Talk npc";
        z.lllIIIllIl[z.lllIIIlllI[20]] = z."Kaqemeex";
        z.lllIIIllIl[z.lllIIIlllI[17]] = z."Nav to sanfew";
        z.lllIIIllIl[z.lllIIIlllI[21]] = z."Talk sanfew";
        z.lllIIIllIl[z.lllIIIlllI[22]] = z."Sanfew";
        z.lllIIIllIl[z.lllIIIlllI[23]] = z."Nav to couldren";
        z.lllIIIllIl[z.lllIIIlllI[24]] = z."Enchanting";
        z.lllIIIllIl[z.lllIIIlllI[26]] = z."Raw beef";
        z.lllIIIllIl[z.lllIIIlllI[27]] = z."Raw rat meat";
        z.lllIIIllIl[z.lllIIIlllI[28]] = z."Raw chicken";
        z.lllIIIllIl[z.lllIIIlllI[29]] = z."Raw bear meat";
        z.lllIIIllIl[z.lllIIIlllI[30]] = z."Nav to sanfew";
        z.lllIIIllIl[z.lllIIIlllI[31]] = z."Talk sanfew";
        z.lllIIIllIl[z.lllIIIlllI[32]] = z."Sanfew";
        z.lllIIIllIl[z.lllIIIlllI[33]] = z."Nav to start";
        z.lllIIIllIl[z.lllIIIlllI[34]] = z."Talk npc";
        z.lllIIIllIl[z.lllIIIlllI[35]] = z."Kaqemeex";
        z.lllIIIllIl[z.lllIIIlllI[36]] = z."Enchanted bear";
        z.lllIIIllIl[z.lllIIIlllI[37]] = z."Enchanted chicken";
        z.lllIIIllIl[z.lllIIIlllI[38]] = z."Enchanted rat";
        z.lllIIIllIl[z.lllIIIlllI[39]] = z."Enchanted beef";
        z.lllIIIllIl[z.lllIIIlllI[40]] = z."Raw chicken";
        z.lllIIIllIl[z.lllIIIlllI[41]] = z."Raw beef";
        z.lllIIIllIl[z.lllIIIlllI[42]] = z."Raw bear meat";
        z.lllIIIllIl[z.lllIIIlllI[43]] = z."Raw rat meat";
        z.lllIIIllIl[z.lllIIIlllI[52]] = z."Druidic ritual quest";
        z.lllIIIllIl[z.lllIIIlllI[53]] = z."ring of wealth (";
        z.lllIIIllIl[z.lllIIIlllI[60]] = z."I'm in search of a quest.";
        z.lllIIIllIl[z.lllIIIlllI[61]] = z."Okay, I will try and help.";
        z.lllIIIllIl[z.lllIIIlllI[62]] = z."Yes.";
        z.lllIIIllIl[z.lllIIIlllI[63]] = z."I've been sent to help purify the Varrock stone circle.";
        z.lllIIIllIl[z.lllIIIlllI[64]] = z."Ok, I'll do that then.";
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (z.llIIIIIIIIlll(e.j(lllIIIlllI[7]), lllIIIlllI[8])) {
            bl = lllIIIlllI[1];
            0;
            
            }
        } else {
            bl = lllIIIlllI[0];
        }
        return bl;
    }

    @Override
    public String ag() {
        return lllIIIllIl[lllIIIlllI[52]];
    }

    @Override
    public boolean ae() {
        return lllIIIlllI[0];
    }

    private static boolean llIIIIIIIIlll(int n2, int n3) {
        return n2 >= n3;
    }

    public static void bt() {
        block40: {
            BankLocation var8;
            block42: {
                block41: {
                    if (z.lIllllllllllI(bt ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[0]];
                        b.a(bv);
                        if (z.lIlllllllllll(bv.size(), lllIIIlllI[1])) {
                            System.out.println(lllIIIllIl[lllIIIlllI[1]]);
                            bt = lllIIIlllI[0];
                        }
                    }
                    if (!z.llIIIIIIIIIII(bt ? 1 : 0)) break block40;
                    if (z.lIllllllllllI(Inventory.contains((int[])f.ba) ? 1 : 0) && z.lIlllllllllll(Movement.getRunEnergy(), lllIIIlllI[2])) {
                        Inventory.getFirst((int[])f.ba).interact(lllIIIllIl[lllIIIlllI[3]]);
                        Time.sleepTicks((int)lllIIIlllI[1]);
                        0;
                    }
                    if (z.llIIIIIIIIIIl(z.lIlllllllllIl(e.w(), 70.0))) {
                        int[] nArray = new int[lllIIIlllI[1]];
                        nArray[z.lllIIIlllI[0]] = lllIIIlllI[4];
                        if (z.lIllllllllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray2 = new int[lllIIIlllI[1]];
                            nArray2[z.lllIIIlllI[0]] = lllIIIlllI[4];
                            Inventory.getFirst((int[])nArray2).interact(lllIIIllIl[lllIIIlllI[5]]);
                        }
                    }
                    if (z.llIIIIIIIIIII(Movement.isRunEnabled() ? 1 : 0) && z.llIIIIIIIIIlI(Movement.getRunEnergy())) {
                        Movement.toggleRun();
                    }
                    if (!z.lIllllllllllI(z.an() ? 1 : 0)) break block41;
                    int[] nArray = new int[lllIIIlllI[1]];
                    nArray[z.lllIIIlllI[0]] = lllIIIlllI[6];
                    if (!z.llIIIIIIIIIlI(Inventory.getCount((int[])nArray))) break block42;
                }
                if (z.lIlllllllllll(e.j(lllIIIlllI[7]), lllIIIlllI[1])) {
                    var8 = BankLocation.getNearest();
                    if (z.llIIIIIIIIIll(var8) && z.llIIIIIIIIIII(var8.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[8]];
                        a.a(var8);
                        Time.sleepTicks((int)lllIIIlllI[3]);
                        0;
                    }
                    if (z.llIIIIIIIIIll(var8) && z.lIllllllllllI(var8.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[9]];
                        if (z.llIIIIIIIIIII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIIlllI[10]);
                            0;
                        }
                        if (z.lIllllllllllI(Bank.isOpen() ? 1 : 0)) {
                            if (z.llIIIIIIIIIlI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lllIIIlllI[8]);
                                0;
                            }
                            if (z.llIIIIIIIIIlI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lllIIIlllI[3]);
                                0;
                            }
                            int[] nArray = new int[lllIIIlllI[9]];
                            nArray[z.lllIIIlllI[0]] = lllIIIlllI[11];
                            nArray[z.lllIIIlllI[1]] = lllIIIlllI[12];
                            nArray[z.lllIIIlllI[3]] = lllIIIlllI[13];
                            nArray[z.lllIIIlllI[5]] = lllIIIlllI[14];
                            nArray[z.lllIIIlllI[8]] = lllIIIlllI[4];
                            if (z.llIIIIIIIIIII(e.c(nArray) ? 1 : 0)) {
                                z.Q();
                                System.out.println(lllIIIllIl[lllIIIlllI[15]]);
                                bt = lllIIIlllI[1];
                                return;
                            }
                            int[] nArray3 = new int[lllIIIlllI[9]];
                            nArray3[z.lllIIIlllI[0]] = lllIIIlllI[11];
                            nArray3[z.lllIIIlllI[1]] = lllIIIlllI[12];
                            nArray3[z.lllIIIlllI[3]] = lllIIIlllI[13];
                            nArray3[z.lllIIIlllI[5]] = lllIIIlllI[14];
                            nArray3[z.lllIIIlllI[8]] = lllIIIlllI[4];
                            if (z.lIllllllllllI(e.c(nArray3) ? 1 : 0)) {
                                Bank.withdraw((int)lllIIIlllI[11], (int)lllIIIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lllIIIlllI[1]);
                                0;
                                Bank.withdraw((int)lllIIIlllI[12], (int)lllIIIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lllIIIlllI[1]);
                                0;
                                Bank.withdraw((int)lllIIIlllI[13], (int)lllIIIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lllIIIlllI[1]);
                                0;
                                Bank.withdraw((int)lllIIIlllI[14], (int)lllIIIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lllIIIlllI[1]);
                                0;
                                a.a(lllIIIlllI[16], lllIIIlllI[9]);
                                a.b(f.ba, lllIIIlllI[9]);
                                a.a(lllIIIlllI[4], lllIIIlllI[17]);
                                a.b(f.bk, lllIIIlllI[1]);
                            }
                        }
                    }
                }
            }
            if (z.lIllllllllllI(z.an() ? 1 : 0) && z.lIlllllllllll(e.j(lllIIIlllI[7]), lllIIIlllI[1])) {
                if (z.llIIIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(ea), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[18]];
                    if (z.lIlllllllllll(cG, lllIIIlllI[1])) {
                        e.x();
                        cG += lllIIIlllI[1];
                    }
                    Movement.walkTo((WorldPoint)ea);
                    0;
                    Time.sleepTicks((int)lllIIIlllI[1]);
                    0;
                }
                if (z.llIIIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(ea), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[19]];
                    g.a(lllIIIllIl[lllIIIlllI[20]], cE);
                }
            }
            if (z.llIIIIIIIIllI(e.j(lllIIIlllI[7]), lllIIIlllI[1])) {
                di = lllIIIlllI[0];
                if (z.llIIIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(eb), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[17]];
                    Movement.walkTo((WorldPoint)eb);
                    0;
                    Time.sleepTicks((int)lllIIIlllI[1]);
                    0;
                }
                if (z.llIIIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(eb), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[21]];
                    g.a(lllIIIllIl[lllIIIlllI[22]], cE);
                }
            }
            if (z.llIIIIIIIIllI(e.j(lllIIIlllI[7]), lllIIIlllI[3]) && z.llIIIIIIIIIII(z.bu() ? 1 : 0)) {
                if (z.llIIIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(ec), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[23]];
                    Movement.walkTo((WorldPoint)ec);
                    0;
                    Time.sleepTicks((int)lllIIIlllI[1]);
                    0;
                }
                if (z.llIIIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(ec), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[24]];
                    int[] nArray = new int[lllIIIlllI[1]];
                    nArray[z.lllIIIlllI[0]] = lllIIIlllI[25];
                    var8 = TileObjects.getNearest((int[])nArray);
                    if (z.llIIIIIIIIIll(var8)) {
                        String[] stringArray = new String[lllIIIlllI[1]];
                        stringArray[z.lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[26]];
                        Item var19 = Inventory.getFirst((String[])stringArray);
                        String[] stringArray2 = new String[lllIIIlllI[1]];
                        stringArray2[z.lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[27]];
                        Item var7 = Inventory.getFirst((String[])stringArray2);
                        String[] stringArray3 = new String[lllIIIlllI[1]];
                        stringArray3[z.lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[28]];
                        Item var23 = Inventory.getFirst((String[])stringArray3);
                        String[] stringArray4 = new String[lllIIIlllI[1]];
                        stringArray4[z.lllIIIlllI[0]] = lllIIIllIl[lllIIIlllI[29]];
                        Item var6 = Inventory.getFirst((String[])stringArray4);
                        if (z.llIIIIIIIIIll(var19)) {
                            var19.useOn((TileObject)var8);
                            Time.sleepTicks((int)lllIIIlllI[1]);
                            0;
                        }
                        if (z.llIIIIIIIIIll(var7)) {
                            var7.useOn((TileObject)var8);
                            Time.sleepTicks((int)lllIIIlllI[1]);
                            0;
                        }
                        if (z.llIIIIIIIIIll(var23)) {
                            var23.useOn((TileObject)var8);
                            Time.sleepTicks((int)lllIIIlllI[1]);
                            0;
                        }
                        if (z.llIIIIIIIIIll(var6)) {
                            var6.useOn((TileObject)var8);
                            Time.sleepTicks((int)lllIIIlllI[1]);
                            0;
                        }
                    }
                }
            }
            if (z.llIIIIIIIIllI(e.j(lllIIIlllI[7]), lllIIIlllI[3]) && z.lIllllllllllI(z.bu() ? 1 : 0)) {
                if (z.llIIIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(eb), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[30]];
                    Movement.walkTo((WorldPoint)eb);
                    0;
                    Time.sleepTicks((int)lllIIIlllI[1]);
                    0;
                }
                if (z.llIIIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(eb), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[31]];
                    g.a(lllIIIllIl[lllIIIlllI[32]], cE);
                }
            }
            if (z.llIIIIIIIIllI(e.j(lllIIIlllI[7]), lllIIIlllI[5])) {
                if (z.llIIIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(ea), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[33]];
                    Movement.walkTo((WorldPoint)ea);
                    0;
                    Time.sleepTicks((int)lllIIIlllI[1]);
                    0;
                }
                if (z.llIIIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(ea), lllIIIlllI[5])) {
                    AccBuilderSotf.c = lllIIIllIl[lllIIIlllI[34]];
                    if (z.lIlllllllllll(di, lllIIIlllI[1])) {
                        aN.pX += lllIIIlllI[1];
                        aN.u(AccBuilderSotf.m);
                        di += lllIIIlllI[1];
                        aN.pX = lllIIIlllI[0];
                    }
                    g.a(lllIIIllIl[lllIIIlllI[35]], cE);
                }
            }
            g.a(cE);
        }
    }

    private static String lIllllllllIII(String var20, String var1) {
        try {
            SecretKeySpec var24 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var21 = Cipher.getInstance("Blowfish");
            var21.init(lllIIIlllI[3], var24);
            return new String(var21.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private static String lIllllllllIIl(String var9, String var16) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var22 = var16.toCharArray();
        int var13 = lllIIIlllI[0];
        char[] var11 = var9.toCharArray();
        int var5 = var11.length;
        int var2 = lllIIIlllI[0];
        while (z.lIlllllllllll(var2, var5)) {
            char var18 = var11[var2];
            var14.append((char)(var18 ^ var22[var13 % var22.length]));
            0;
            ++var13;
            ++var2;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static boolean llIIIIIIIIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIIIIIIIIlI(int n2) {
        return n2 > 0;
    }

    private static boolean llIIIIIIIIlIl(int n2, int n3) {
        return n2 <= n3;
    }
}

