/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

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
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Q
implements S {
    public static /* synthetic */ boolean bs;
    public static final /* synthetic */ WorldPoint iH;
    private static /* synthetic */ int[] lllIllIIII;
    static /* synthetic */ int ck;
    static /* synthetic */ boolean cl;
    private static final /* synthetic */ String[] iK;
    public static final /* synthetic */ WorldPoint iI;
    private static /* synthetic */ String[] lllIlIllll;
    public static /* synthetic */ List<d> bu;
    public static final /* synthetic */ WorldPoint iJ;
    static /* synthetic */ int bS;

    private static boolean llIIIlllllIIl(int n2) {
        return n2 <= 0;
    }

    private static boolean llIIIllllIlII(int n2) {
        return n2 > 0;
    }

    private static void llIIIlllIllIl() {
        lllIlIllll = new String[lllIllIIII[65]];
        Q.lllIlIllll[Q.lllIllIIII[0]] = Q."Buying items";
        Q.lllIlIllll[Q.lllIllIIII[1]] = Q."Finished buying items, switching back to quest";
        Q.lllIlIllll[Q.lllIllIIII[3]] = Q."Drink";
        Q.lllIlIllll[Q.lllIllIIII[5]] = Q."Eat";
        Q.lllIlIllll[Q.lllIllIIII[8]] = Q."Nav to bank";
        Q.lllIlIllll[Q.lllIllIIII[9]] = Q."Handling banking";
        Q.lllIlIllll[Q.lllIllIIII[16]] = Q."We are missing quest supplies, switching to BUYING";
        Q.lllIlIllll[Q.lllIllIIII[19]] = Q."Nav to start";
        Q.lllIlIllll[Q.lllIllIIII[20]] = Q."Starting quest";
        Q.lllIlIllll[Q.lllIllIIII[21]] = Q."Door";
        Q.lllIlIllll[Q.lllIllIIII[18]] = Q."Open";
        Q.lllIlIllll[Q.lllIllIIII[22]] = Q."Open";
        Q.lllIlIllll[Q.lllIllIIII[23]] = Q."Hetty";
        Q.lllIlIllll[Q.lllIllIIII[24]] = Q."Burnt meat";
        Q.lllIlIllll[Q.lllIllIIII[25]] = Q."Raw rat meat";
        Q.lllIlIllll[Q.lllIllIIII[26]] = Q."Cooked meat";
        Q.lllIlIllll[Q.lllIllIIII[27]] = Q."Nav to range";
        Q.lllIlIllll[Q.lllIllIIII[28]] = Q."Raw rat meat";
        Q.lllIlIllll[Q.lllIllIIII[29]] = Q."Cooked meat";
        Q.lllIlIllll[Q.lllIllIIII[30]] = Q."Range";
        Q.lllIlIllll[Q.lllIllIIII[31]] = Q."Range";
        Q.lllIlIllll[Q.lllIllIIII[32]] = Q." ";
        Q.lllIlIllll[Q.lllIllIIII[33]] = Q."Burnt meat";
        Q.lllIlIllll[Q.lllIllIIII[34]] = Q."Rat's tail";
        Q.lllIlIllll[Q.lllIllIIII[35]] = Q."Nav to rat";
        Q.lllIlIllll[Q.lllIllIIII[36]] = Q."Rat's tail";
        Q.lllIlIllll[Q.lllIllIIII[37]] = Q."Rat";
        Q.lllIlIllll[Q.lllIllIIII[38]] = Q."Attack";
        Q.lllIlIllll[Q.lllIllIIII[39]] = Q."Take";
        Q.lllIlIllll[Q.lllIllIIII[40]] = Q."Burnt meat";
        Q.lllIlIllll[Q.lllIllIIII[41]] = Q."Rat's tail";
        Q.lllIlIllll[Q.lllIllIIII[42]] = Q."Nav to start";
        Q.lllIlIllll[Q.lllIllIIII[43]] = Q."Starting quest";
        Q.lllIlIllll[Q.lllIllIIII[44]] = Q."Hetty";
        Q.lllIlIllll[Q.lllIllIIII[45]] = Q."Cauldron";
        Q.lllIlIllll[Q.lllIllIIII[46]] = Q."Drink From";
        Q.lllIlIllll[Q.lllIllIIII[47]] = Q."Drink From";
        Q.lllIlIllll[Q.lllIllIIII[48]] = Q."Break";
        Q.lllIlIllll[Q.lllIllIIII[55]] = Q."Witches potion quest";
        Q.lllIlIllll[Q.lllIllIIII[56]] = Q."ring of wealth (";
        Q.lllIlIllll[Q.lllIllIIII[53]] = Q."I am in search of a quest.";
        Q.lllIlIllll[Q.lllIllIIII[63]] = Q."Yes, help me become one with my darker side.";
        Q.lllIlIllll[Q.lllIllIIII[64]] = Q."Yes.";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aa() {
        int n2;
        int[] nArray = new int[lllIllIIII[1]];
        nArray[Q.lllIllIIII[0]] = lllIllIIII[14];
        if (Q.llIIIllllIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lllIllIIII[1]];
            nArray2[Q.lllIllIIII[0]] = lllIllIIII[11];
            if (Q.llIIIllllIIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lllIllIIII[1]];
                nArray3[Q.lllIllIIII[0]] = lllIllIIII[15];
                if (Q.llIIIllllIIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n2 = lllIllIIII[1];
                    0;
                    if (1 != 3) return n2 != 0;
                    return ((0x75 ^ 0x7B) & ~(0xB3 ^ 0xBD)) != 0;
                }
            }
        }
        n2 = lllIllIIII[0];
        return n2 != 0;
    }

    private static int llIIIlllIllll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public String U() {
        return lllIlIllll[lllIllIIII[55]];
    }

    private static boolean llIIIllllIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIIllllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIIlllIllII(String lllllllllllllllllIllIlIIlllllIIl, String lllllllllllllllllIllIlIIllllIllI) {
        try {
            SecretKeySpec lllllllllllllllllIllIlIIllllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIlIIllllIllI.getBytes(StandardCharsets.UTF_8)), lllIllIIII[20]), "DES");
            Cipher lllllllllllllllllIllIlIIlllllIll = Cipher.getInstance("DES");
            lllllllllllllllllIllIlIIlllllIll.init(lllIllIIII[3], lllllllllllllllllIllIlIIllllllII);
            return new String(lllllllllllllllllIllIlIIlllllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIlIIlllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIllIlIIlllllIlI) {
            lllllllllllllllllIllIlIIlllllIlI.printStackTrace();
            return null;
        }
    }

    private static void llIIIlllIlllI() {
        lllIllIIII = new int[66];
        Q.lllIllIIII[0] = (0x14 ^ 0x1F) & ~(0xA7 ^ 0xAC);
        Q.lllIllIIII[1] = 1;
        Q.lllIllIIII[2] = 0x36 ^ 0x12 ^ (0x4D ^ 0x2F);
        Q.lllIllIIII[3] = 2;
        Q.lllIllIIII[4] = -(0xFFFFFFF1 & 0x3A0F) & (0xFFFFBB7F & 0x7FFB);
        Q.lllIllIIII[5] = 3;
        Q.lllIllIIII[6] = -(0xFFFFBD9F & 0x7E7D) & (0xFFFFBFFF & Short.MAX_VALUE);
        Q.lllIllIIII[7] = 0x80 ^ 0xC3;
        Q.lllIllIIII[8] = 0xCB ^ 0x9A ^ (0x41 ^ 0x14);
        Q.lllIllIIII[9] = 0x42 ^ 0x5B ^ (0xB7 ^ 0xAB);
        Q.lllIllIIII[10] = -(0xFFFFEEA7 & 0x3D7D) & (0xFFFFFFED & 0x3FBE);
        Q.lllIllIIII[11] = 0xFFFF9D57 & 0x6AFE;
        Q.lllIllIIII[12] = 0xFFFFFB79 & 0x35D7;
        Q.lllIllIIII[13] = 0xFFFFBF7F & 0x5FC7;
        Q.lllIllIIII[14] = (0x1C ^ 0x3E) + (17 + 124 - -9 + 70) - (2 ^ 0x51) + (0x67 ^ 0x55);
        Q.lllIllIIII[15] = -(0xFFFFD9DB & 0x367F) & (0xFFFFBFFF & 0x57FF);
        Q.lllIllIIII[16] = 0x2E ^ 0x4A ^ (0xA7 ^ 0xC5);
        Q.lllIllIIII[17] = 0xFFFFBFDF & 0x5F69;
        Q.lllIllIIII[18] = 0x5B ^ 0x79 ^ (3 ^ 0x2B);
        Q.lllIllIIII[19] = 0xBC ^ 0xBB;
        Q.lllIllIIII[20] = 0x3C ^ 0x34;
        Q.lllIllIIII[21] = 0x1B ^ 0x15 ^ (0x26 ^ 0x21);
        Q.lllIllIIII[22] = 45 + 109 - 48 + 44 ^ 138 + 156 - 233 + 96;
        Q.lllIllIIII[23] = 0xCA ^ 0xC6;
        Q.lllIllIIII[24] = 0x2B ^ 0x26;
        Q.lllIllIIII[25] = 0x69 ^ 0x67;
        Q.lllIllIIII[26] = 0x79 ^ 0x76;
        Q.lllIllIIII[27] = 0x89 ^ 0x99;
        Q.lllIllIIII[28] = 0x44 ^ 0x55;
        Q.lllIllIIII[29] = 0x54 ^ 0x46;
        Q.lllIllIIII[30] = 0x88 ^ 0xAE ^ (0x16 ^ 0x23);
        Q.lllIllIIII[31] = 0x55 ^ 0x24 ^ (0xE9 ^ 0x8C);
        Q.lllIllIIII[32] = 141 + 110 - 178 + 73 ^ 117 + 40 - 104 + 82;
        Q.lllIllIIII[33] = 0 ^ 0x7C ^ (0xA8 ^ 0xC2);
        Q.lllIllIIII[34] = 0x5E ^ 0x23 ^ (0xC1 ^ 0xAB);
        Q.lllIllIIII[35] = 0xDB ^ 0x97 ^ (0xC8 ^ 0x9C);
        Q.lllIllIIII[36] = 0xDA ^ 0xC3;
        Q.lllIllIIII[37] = 0xAF ^ 0xBC ^ (0xA7 ^ 0xAE);
        Q.lllIllIIII[38] = 0x85 ^ 0x9E;
        Q.lllIllIIII[39] = 0x65 ^ 0x79;
        Q.lllIllIIII[40] = 0x11 ^ 0xC;
        Q.lllIllIIII[41] = 0x56 ^ 0x63 ^ (0x5B ^ 0x70);
        Q.lllIllIIII[42] = 0x8C ^ 0x93;
        Q.lllIllIIII[43] = 67 + 127 - 148 + 106 ^ 171 + 0 - 5 + 18;
        Q.lllIllIIII[44] = 30 + 107 - 31 + 75 ^ 89 + 49 - 69 + 79;
        Q.lllIllIIII[45] = 0xC ^ 0x2E;
        Q.lllIllIIII[46] = 0xF3 ^ 0x83 ^ (0x21 ^ 0x72);
        Q.lllIllIIII[47] = 0x1F ^ 0x3B;
        Q.lllIllIIII[48] = 1 + 85 - -48 + 96 ^ 156 + 143 - 230 + 126;
        Q.lllIllIIII[49] = 0xFFFF97BC & 0x7F4F;
        Q.lllIllIIII[50] = 0xFFFFBECF & 0x6FFC;
        Q.lllIllIIII[51] = 0xFFFFEBE9 & 0x75BE;
        Q.lllIllIIII[52] = 0xFFFFCFFF & 0x376C;
        Q.lllIllIIII[53] = 0x4D ^ 0x65;
        Q.lllIllIIII[54] = 0xD ^ 0x69;
        Q.lllIllIIII[55] = 85 + 56 - 128 + 155 ^ 53 + 2 - -26 + 61;
        Q.lllIllIIII[56] = 0xA6 ^ 0x81;
        Q.lllIllIIII[57] = -(0xFFFFFF7F & 0x24C5) & (0xFFFFAFDE & 0x7FFD);
        Q.lllIllIIII[58] = -(0xFFFFFB7D & 0x569B) & (0xFFFFDFBF & 0x7EDD);
        Q.lllIllIIII[59] = 0xFFFF8F9D & 0x7BFB;
        Q.lllIllIIII[60] = 0xFFFF9CAB & 0x6FDF;
        Q.lllIllIIII[61] = -(0xFFFFE7F3 & 0x787F) & (0xFFFFEBFF & Short.MAX_VALUE);
        Q.lllIllIIII[62] = -(0xFFFFF37D & 0x6E83) & (0xFFFFFED7 & 0x6FAB);
        Q.lllIllIIII[63] = 0xB8 ^ 0xBE ^ (2 ^ 0x2D);
        Q.lllIllIIII[64] = 0x74 ^ 0x5E;
        Q.lllIllIIII[65] = 88 + 162 - 174 + 91 ^ 124 + 132 - 178 + 62;
    }

    private static boolean llIIIllllIIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIllllIIll(int n2) {
        return n2 < 0;
    }

    static {
        Q.llIIIlllIlllI();
        Q.llIIIlllIllIl();
        iH = new WorldPoint(lllIllIIII[57], lllIllIIII[58], lllIllIIII[0]);
        iI = new WorldPoint(lllIllIIII[59], lllIllIIII[60], lllIllIIII[0]);
        iJ = new WorldPoint(lllIllIIII[61], lllIllIIII[62], lllIllIIII[0]);
        String[] stringArray = new String[lllIllIIII[5]];
        stringArray[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[53]];
        stringArray[Q.lllIllIIII[1]] = lllIlIllll[lllIllIIII[63]];
        stringArray[Q.lllIllIIII[3]] = lllIlIllll[lllIllIIII[64]];
        iK = stringArray;
        bu = new ArrayList<d>();
        bS = lllIllIIII[0];
    }

    private static boolean llIIIllllIlIl(Object object) {
        return object != null;
    }

    private static void ae() {
        d lllllllllllllllllIllIlIlIIlIlIII;
        Object lllllllllllllllllIllIlIlIIlIlIIl;
        int[] nArray = new int[lllIllIIII[1]];
        nArray[Q.lllIllIIII[0]] = lllIllIIII[15];
        if (Q.llIIIllllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lllIllIIII[15], lllIllIIII[1], lllIllIIII[49]);
            bu.add(d2);
            0;
        }
        int[] nArray2 = new int[lllIllIIII[1]];
        nArray2[Q.lllIllIIII[0]] = lllIllIIII[11];
        if (Q.llIIIllllIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllllllllllllllllIllIlIlIIlIlIIl = new d(lllIllIIII[11], lllIllIIII[1], lllIllIIII[49]);
            bu.add((d)lllllllllllllllllIllIlIlIIlIlIIl);
            0;
        }
        int[] nArray3 = new int[lllIllIIII[1]];
        nArray3[Q.lllIllIIII[0]] = lllIllIIII[14];
        if (Q.llIIIllllIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllllllllllllllllIllIlIlIIlIlIIl = new d(lllIllIIII[14], lllIllIIII[1], lllIllIIII[49]);
            bu.add((d)lllllllllllllllllIllIlIlIIlIlIIl);
            0;
        }
        if (Q.llIIIllllIIlI(Bank.contains((Predicate)(lllllllllllllllllIllIlIlIIlIlIIl = item -> item.getName().toLowerCase().contains(lllIlIllll[lllIllIIII[56]]))) ? 1 : 0)) {
            lllllllllllllllllIllIlIlIIlIlIII = new d(lllIllIIII[50], lllIllIIII[9], lllIllIIII[51]);
            bu.add(lllllllllllllllllIllIlIlIIlIlIII);
            0;
        }
        int[] nArray4 = new int[lllIllIIII[1]];
        nArray4[Q.lllIllIIII[0]] = lllIllIIII[17];
        if (Q.llIIIllllIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lllllllllllllllllIllIlIlIIlIlIII = new d(lllIllIIII[17], lllIllIIII[18], lllIllIIII[52]);
            bu.add(lllllllllllllllllIllIlIlIIlIlIII);
            0;
        }
        int[] nArray5 = new int[lllIllIIII[1]];
        nArray5[Q.lllIllIIII[0]] = lllIllIIII[13];
        if (Q.llIIIllllIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lllllllllllllllllIllIlIlIIlIlIII = new d(lllIllIIII[13], lllIllIIII[53], lllIllIIII[52]);
            bu.add(lllllllllllllllllIllIlIlIIlIlIII);
            0;
        }
        int[] nArray6 = new int[lllIllIIII[1]];
        nArray6[Q.lllIllIIII[0]] = lllIllIIII[12];
        if (Q.llIIIllllIIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lllllllllllllllllIllIlIlIIlIlIII = new d(lllIllIIII[12], lllIllIIII[9], i.bp);
            bu.add(lllllllllllllllllIllIlIlIIlIlIII);
            0;
        }
    }

    private static String llIIIlllIlIlI(String lllllllllllllllllIllIlIlIIIlllII, String lllllllllllllllllIllIlIlIIIllIll) {
        try {
            SecretKeySpec lllllllllllllllllIllIlIlIIlIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIlIlIIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIllIlIlIIlIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllllIllIlIlIIlIIIII.init(lllIllIIII[3], lllllllllllllllllIllIlIlIIlIIIIl);
            return new String(lllllllllllllllllIllIlIlIIlIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIlIlIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIllIlIlIIIlllll) {
            lllllllllllllllllIllIlIlIIIlllll.printStackTrace();
            return null;
        }
    }

    private static String llIIIlllIlIll(String lllllllllllllllllIllIlIlIIIIlIIl, String lllllllllllllllllIllIlIlIIIIlIII) {
        lllllllllllllllllIllIlIlIIIIlIIl = new String(Base64.getDecoder().decode(lllllllllllllllllIllIlIlIIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIllIlIlIIIIllII = new StringBuilder();
        char[] lllllllllllllllllIllIlIlIIIIlIll = lllllllllllllllllIllIlIlIIIIlIII.toCharArray();
        int lllllllllllllllllIllIlIlIIIIlIlI = lllIllIIII[0];
        char[] lllllllllllllllllIllIlIlIIIIIlII = lllllllllllllllllIllIlIlIIIIlIIl.toCharArray();
        int lllllllllllllllllIllIlIlIIIIIIll = lllllllllllllllllIllIlIlIIIIIlII.length;
        int lllllllllllllllllIllIlIlIIIIIIlI = lllIllIIII[0];
        while (Q.llIIIllllIIIl(lllllllllllllllllIllIlIlIIIIIIlI, lllllllllllllllllIllIlIlIIIIIIll)) {
            char lllllllllllllllllIllIlIlIIIIllll = lllllllllllllllllIllIlIlIIIIIlII[lllllllllllllllllIllIlIlIIIIIIlI];
            lllllllllllllllllIllIlIlIIIIllII.append((char)(lllllllllllllllllIllIlIlIIIIllll ^ lllllllllllllllllIllIlIlIIIIlIll[lllllllllllllllllIllIlIlIIIIlIlI % lllllllllllllllllIllIlIlIIIIlIll.length]));
            0;
            ++lllllllllllllllllIllIlIlIIIIlIlI;
            ++lllllllllllllllllIllIlIlIIIIIIlI;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIllIlIlIIIIllII);
    }

    public static void dn() {
        block48: {
            BankLocation lllllllllllllllllIllIlIlIIlIllIl;
            block51: {
                block52: {
                    block50: {
                        block49: {
                            if (Q.llIIIllllIIII(bs ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllIlIllll[lllIllIIII[0]];
                                b.a(bu);
                                if (Q.llIIIllllIIIl(bu.size(), lllIllIIII[1])) {
                                    System.out.println(lllIlIllll[lllIllIIII[1]]);
                                    bs = lllIllIIII[0];
                                }
                            }
                            if (!Q.llIIIllllIIlI(bs ? 1 : 0)) break block48;
                            if (Q.llIIIllllIIII(Inventory.contains((int[])f.aU) ? 1 : 0) && Q.llIIIllllIIIl(Movement.getRunEnergy(), lllIllIIII[2])) {
                                Inventory.getFirst((int[])f.aU).interact(lllIlIllll[lllIllIIII[3]]);
                                Time.sleepTicks((int)lllIllIIII[1]);
                                0;
                            }
                            if (Q.llIIIllllIIll(Q.llIIIlllIllll(e.u(), 70.0))) {
                                int[] nArray = new int[lllIllIIII[1]];
                                nArray[Q.lllIllIIII[0]] = lllIllIIII[4];
                                if (Q.llIIIllllIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray2 = new int[lllIllIIII[1]];
                                    nArray2[Q.lllIllIIII[0]] = lllIllIIII[4];
                                    Inventory.getFirst((int[])nArray2).interact(lllIlIllll[lllIllIIII[5]]);
                                }
                            }
                            if (Q.llIIIllllIIlI(Movement.isRunEnabled() ? 1 : 0) && Q.llIIIllllIlII(Movement.getRunEnergy())) {
                                Movement.toggleRun();
                            }
                            if (!Q.llIIIllllIIII(Q.aa() ? 1 : 0)) break block49;
                            int[] nArray = new int[lllIllIIII[1]];
                            nArray[Q.lllIllIIII[0]] = lllIllIIII[6];
                            if (!Q.llIIIllllIlII(Inventory.getCount((int[])nArray))) break block50;
                        }
                        if (Q.llIIIllllIIIl(e.j(lllIllIIII[7]), lllIllIIII[1])) {
                            lllllllllllllllllIllIlIlIIlIllIl = BankLocation.getNearest();
                            if (Q.llIIIllllIlIl(lllllllllllllllllIllIlIlIIlIllIl) && Q.llIIIllllIIlI(lllllllllllllllllIllIlIlIIlIllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllIlIllll[lllIllIIII[8]];
                                Movement.walkTo((BankLocation)lllllllllllllllllIllIlIlIIlIllIl);
                                0;
                                Time.sleepTicks((int)lllIllIIII[3]);
                                0;
                            }
                            if (Q.llIIIllllIlIl(lllllllllllllllllIllIlIlIIlIllIl) && Q.llIIIllllIIII(lllllllllllllllllIllIlIlIIlIllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllIlIllll[lllIllIIII[9]];
                                if (Q.llIIIllllIIlI(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lllIllIIII[10]);
                                    0;
                                }
                                if (Q.llIIIllllIIII(Bank.isOpen() ? 1 : 0)) {
                                    if (Q.llIIIllllIlII(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lllIllIIII[8]);
                                        0;
                                    }
                                    if (Q.llIIIllllIlII(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lllIllIIII[3]);
                                        0;
                                    }
                                    int[] nArray = new int[lllIllIIII[9]];
                                    nArray[Q.lllIllIIII[0]] = lllIllIIII[11];
                                    nArray[Q.lllIllIIII[1]] = lllIllIIII[12];
                                    nArray[Q.lllIllIIII[3]] = lllIllIIII[13];
                                    nArray[Q.lllIllIIII[5]] = lllIllIIII[14];
                                    nArray[Q.lllIllIIII[8]] = lllIllIIII[15];
                                    if (Q.llIIIllllIIlI(e.b(nArray) ? 1 : 0)) {
                                        Q.ae();
                                        System.out.println(lllIlIllll[lllIllIIII[16]]);
                                        bs = lllIllIIII[1];
                                        return;
                                    }
                                    Bank.withdraw((int)lllIllIIII[11], (int)lllIllIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIllIIII[1]);
                                    0;
                                    Bank.withdraw((int)lllIllIIII[14], (int)lllIllIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIllIIII[1]);
                                    0;
                                    Bank.withdraw((int)lllIllIIII[15], (int)lllIllIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIllIIII[1]);
                                    0;
                                    Bank.withdraw((int)lllIllIIII[17], (int)lllIllIIII[18], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIllIIII[1]);
                                    0;
                                    Bank.withdraw((int)lllIllIIII[13], (int)lllIllIIII[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIllIIII[1]);
                                    0;
                                    a.b(f.aU, lllIllIIII[1]);
                                    a.a(lllIllIIII[4], lllIllIIII[18]);
                                    a.b(f.be, lllIllIIII[1]);
                                }
                            }
                        }
                    }
                    if (Q.llIIIllllIIIl(e.j(lllIllIIII[7]), lllIllIIII[1]) && Q.llIIIllllIIII(Q.aa() ? 1 : 0)) {
                        if (Q.llIIIllllIllI(Players.getLocal().getWorldLocation().distanceTo(iH), lllIllIIII[5])) {
                            AccBuilderTempleTrek.c = lllIlIllll[lllIllIIII[19]];
                            if (Q.llIIIllllIIIl(bS, lllIllIIII[1])) {
                                e.v();
                                bS += lllIllIIII[1];
                            }
                            Movement.walkTo((WorldPoint)iH);
                            0;
                            Time.sleepTicks((int)lllIllIIII[1]);
                            0;
                        }
                        if (Q.llIIIllllIlll(Players.getLocal().getWorldLocation().distanceTo(iH), lllIllIIII[9])) {
                            AccBuilderTempleTrek.c = lllIlIllll[lllIllIIII[20]];
                            String[] stringArray = new String[lllIllIIII[1]];
                            stringArray[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[21]];
                            lllllllllllllllllIllIlIlIIlIllIl = TileObjects.getNearest((String[])stringArray);
                            if (Q.llIIIllllIlIl(lllllllllllllllllIllIlIlIIlIllIl)) {
                                String[] stringArray2 = new String[lllIllIIII[1]];
                                stringArray2[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[18]];
                                if (Q.llIIIllllIIII(lllllllllllllllllIllIlIlIIlIllIl.hasAction(stringArray2) ? 1 : 0) && Q.llIIIllllIlll(lllllllllllllllllIllIlIlIIlIllIl.getWorldLocation().distanceTo(iH), lllIllIIII[16])) {
                                    lllllllllllllllllIllIlIlIIlIllIl.interact(lllIlIllll[lllIllIIII[22]]);
                                    Time.sleepTicks((int)lllIllIIII[5]);
                                    0;
                                }
                            }
                            g.a(lllIlIllll[lllIllIIII[23]], iK, lllIllIIII[1]);
                        }
                    }
                    if (!Q.llIIIlllllIII(e.j(lllIllIIII[7]), lllIllIIII[1])) break block51;
                    String[] stringArray = new String[lllIllIIII[1]];
                    stringArray[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[24]];
                    if (!Q.llIIIllllIIIl(Inventory.getCount((String[])stringArray), lllIllIIII[1])) break block51;
                    String[] stringArray3 = new String[lllIllIIII[1]];
                    stringArray3[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[25]];
                    if (!Q.llIIIlllllIIl(Inventory.getCount((String[])stringArray3))) break block52;
                    String[] stringArray4 = new String[lllIllIIII[1]];
                    stringArray4[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[26]];
                    if (!Q.llIIIllllIlII(Inventory.getCount((String[])stringArray4))) break block51;
                }
                ck = lllIllIIII[0];
                if (Q.llIIIllllIllI(Players.getLocal().getWorldLocation().distanceTo(iI), lllIllIIII[3])) {
                    AccBuilderTempleTrek.c = lllIlIllll[lllIllIIII[27]];
                    Movement.walkTo((WorldPoint)iI);
                    0;
                    Time.sleepTicks((int)lllIllIIII[1]);
                    0;
                }
                if (Q.llIIIllllIlll(Players.getLocal().getWorldLocation().distanceTo(iI), lllIllIIII[3])) {
                    String[] stringArray = new String[lllIllIIII[1]];
                    stringArray[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[28]];
                    lllllllllllllllllIllIlIlIIlIllIl = Inventory.getFirst((String[])stringArray);
                    String[] stringArray5 = new String[lllIllIIII[1]];
                    stringArray5[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[29]];
                    Item lllllllllllllllllIllIlIlIIlIllII = Inventory.getFirst((String[])stringArray5);
                    if (Q.llIIIllllIlIl(lllllllllllllllllIllIlIlIIlIllIl)) {
                        String[] stringArray6 = new String[lllIllIIII[1]];
                        stringArray6[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[30]];
                        lllllllllllllllllIllIlIlIIlIllIl.useOn(TileObjects.getNearest((String[])stringArray6));
                        Time.sleepTicks((int)lllIllIIII[3]);
                        0;
                    }
                    if (Q.llIIIllllIlIl(lllllllllllllllllIllIlIlIIlIllII)) {
                        String[] stringArray7 = new String[lllIllIIII[1]];
                        stringArray7[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[31]];
                        lllllllllllllllllIllIlIlIIlIllII.useOn(TileObjects.getNearest((String[])stringArray7));
                        Time.sleepTicks((int)lllIllIIII[3]);
                        0;
                    }
                    Keyboard.type((String)lllIlIllll[lllIllIIII[32]]);
                }
            }
            if (Q.llIIIlllllIII(e.j(lllIllIIII[7]), lllIllIIII[1])) {
                String[] stringArray = new String[lllIllIIII[1]];
                stringArray[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[33]];
                if (Q.llIIIllllIlII(Inventory.getCount((String[])stringArray))) {
                    String[] stringArray8 = new String[lllIllIIII[1]];
                    stringArray8[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[34]];
                    if (Q.llIIIllllIIIl(Inventory.getCount((String[])stringArray8), lllIllIIII[1])) {
                        if (Q.llIIIllllIllI(Players.getLocal().getWorldLocation().distanceTo(iJ), lllIllIIII[3])) {
                            AccBuilderTempleTrek.c = lllIlIllll[lllIllIIII[35]];
                            Movement.walkTo((WorldPoint)iJ);
                            0;
                            Time.sleepTicks((int)lllIllIIII[1]);
                            0;
                        }
                        if (Q.llIIIllllIlll(Players.getLocal().getWorldLocation().distanceTo(iJ), lllIllIIII[3])) {
                            String[] stringArray9 = new String[lllIllIIII[1]];
                            stringArray9[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[36]];
                            lllllllllllllllllIllIlIlIIlIllIl = TileItems.getNearest((String[])stringArray9);
                            if (Q.llIIIlllllIlI(lllllllllllllllllIllIlIlIIlIllIl)) {
                                String[] stringArray10 = new String[lllIllIIII[1]];
                                stringArray10[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[37]];
                                NPCs.getNearest((String[])stringArray10).interact(lllIlIllll[lllIllIIII[38]]);
                                Time.sleepTicks((int)lllIllIIII[9]);
                                0;
                            }
                            if (Q.llIIIllllIlIl(lllllllllllllllllIllIlIlIIlIllIl)) {
                                lllllllllllllllllIllIlIlIIlIllIl.interact(lllIlIllll[lllIllIIII[39]]);
                                Time.sleepTicks((int)lllIllIIII[3]);
                                0;
                            }
                        }
                    }
                }
            }
            if (Q.llIIIlllllIII(e.j(lllIllIIII[7]), lllIllIIII[1])) {
                String[] stringArray = new String[lllIllIIII[1]];
                stringArray[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[40]];
                if (Q.llIIIllllIlII(Inventory.getCount((String[])stringArray))) {
                    String[] stringArray11 = new String[lllIllIIII[1]];
                    stringArray11[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[41]];
                    if (Q.llIIIllllIlII(Inventory.getCount((String[])stringArray11))) {
                        if (Q.llIIIllllIllI(Players.getLocal().getWorldLocation().distanceTo(iH), lllIllIIII[5])) {
                            AccBuilderTempleTrek.c = lllIlIllll[lllIllIIII[42]];
                            Movement.walkTo((WorldPoint)iH);
                            0;
                            Time.sleepTicks((int)lllIllIIII[1]);
                            0;
                        }
                        if (Q.llIIIllllIlll(Players.getLocal().getWorldLocation().distanceTo(iH), lllIllIIII[9])) {
                            AccBuilderTempleTrek.c = lllIlIllll[lllIllIIII[43]];
                            g.a(lllIlIllll[lllIllIIII[44]], iK, lllIllIIII[1]);
                        }
                    }
                }
            }
            if (Q.llIIIlllllIII(e.j(lllIllIIII[7]), lllIllIIII[3])) {
                String[] stringArray = new String[lllIllIIII[1]];
                stringArray[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[45]];
                lllllllllllllllllIllIlIlIIlIllIl = TileObjects.getNearest((String[])stringArray);
                if (Q.llIIIllllIlIl(lllllllllllllllllIllIlIlIIlIllIl)) {
                    String[] stringArray12 = new String[lllIllIIII[1]];
                    stringArray12[Q.lllIllIIII[0]] = lllIlIllll[lllIllIIII[46]];
                    if (Q.llIIIllllIIII(lllllllllllllllllIllIlIlIIlIllIl.hasAction(stringArray12) ? 1 : 0)) {
                        if (Q.llIIIllllIIIl(ck, lllIllIIII[1])) {
                            ac.mJ += lllIllIIII[1];
                            ac.d(AccBuilderTempleTrek.m);
                            ck += lllIllIIII[1];
                            ac.mJ = lllIllIIII[0];
                            cl = lllIllIIII[0];
                        }
                        lllllllllllllllllIllIlIlIIlIllIl.interact(lllIlIllll[lllIllIIII[47]]);
                        Time.sleepTicks((int)lllIllIIII[5]);
                        0;
                    }
                }
                g.a(iK);
            }
            if (Q.llIIIlllllIII(e.j(lllIllIIII[7]), lllIllIIII[5]) && Q.llIIIllllIlll(Players.getLocal().getWorldLocation().distanceTo(iH), lllIllIIII[41])) {
                int[] nArray = new int[lllIllIIII[1]];
                nArray[Q.lllIllIIII[0]] = lllIllIIII[13];
                if (Q.llIIIllllIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray3 = new int[lllIllIIII[1]];
                    nArray3[Q.lllIllIIII[0]] = lllIllIIII[13];
                    Inventory.getFirst((int[])nArray3).interact(lllIlIllll[lllIllIIII[48]]);
                    Time.sleepTicks((int)lllIllIIII[16]);
                    0;
                }
            }
            g.a(new String[lllIllIIII[0]]);
            System.out.println("Setting: " + e.j(lllIllIIII[7]));
        }
    }

    private static boolean llIIIllllIlll(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public int T() {
        try {
            Q.dn();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 > (0x7C ^ 0x78)) {
            return (0xDF ^ 0x87) & ~(0x60 ^ 0x38);
        }
        return lllIllIIII[54];
    }

    private static boolean llIIIlllllIlI(Object object) {
        return object == null;
    }

    private static boolean llIIIlllllIII(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean V() {
        int n2;
        if (Q.llIIIlllllIII(e.j(lllIllIIII[7]), lllIllIIII[5]) && Q.llIIIllllIllI(Players.getLocal().getWorldLocation().distanceTo(iH), lllIllIIII[41])) {
            n2 = lllIllIIII[1];
            0;
            if (3 == 0) {
                return ((0x40 ^ 0x7F ^ (0x6A ^ 0x4E)) & (137 + 67 - 57 + 22 ^ 134 + 106 - 78 + 16 ^ -1)) != 0;
            }
        } else {
            n2 = lllIllIIII[0];
        }
        return n2 != 0;
    }

    private static boolean llIIIllllIIlI(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean S() {
        return lllIllIIII[0];
    }
}

