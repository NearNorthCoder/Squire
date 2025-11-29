/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
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
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.v;
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
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class P
implements S {
    public static final /* synthetic */ WorldPoint iC;
    static /* synthetic */ int ck;
    public static /* synthetic */ List<d> bu;
    public static /* synthetic */ boolean bs;
    private static /* synthetic */ int[] llllllIlII;
    static /* synthetic */ int bS;
    public static final /* synthetic */ WorldPoint iF;
    public static final /* synthetic */ String[] iG;
    static /* synthetic */ boolean cl;
    public static final /* synthetic */ WorldPoint iE;
    private static /* synthetic */ String[] llllllIIll;
    public static final /* synthetic */ WorldPoint iD;

    @Override
    public boolean S() {
        return llllllIlII[0];
    }

    private static String llIlIllIlIIll(String lllllllllllllllllIlIIIllIIlIIIII, String lllllllllllllllllIlIIIllIIIlllll) {
        try {
            SecretKeySpec lllllllllllllllllIlIIIllIIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIllIIIlllll.getBytes(StandardCharsets.UTF_8)), llllllIlII[21]), "DES");
            Cipher lllllllllllllllllIlIIIllIIlIIIlI = Cipher.getInstance("DES");
            lllllllllllllllllIlIIIllIIlIIIlI.init(llllllIlII[5], lllllllllllllllllIlIIIllIIlIIIll);
            return new String(lllllllllllllllllIlIIIllIIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIllIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIIIllIIlIIIIl) {
            lllllllllllllllllIlIIIllIIlIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIllIllllI(int n2) {
        return n2 < 0;
    }

    private static boolean llIlIllIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIlIllIlIlII(String lllllllllllllllllIlIIIllIIIlIIII, String lllllllllllllllllIlIIIllIIIIlIlI) {
        lllllllllllllllllIlIIIllIIIlIIII = new String(Base64.getDecoder().decode(lllllllllllllllllIlIIIllIIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIIIllIIIIlllI = new StringBuilder();
        char[] lllllllllllllllllIlIIIllIIIIllIl = lllllllllllllllllIlIIIllIIIIlIlI.toCharArray();
        int lllllllllllllllllIlIIIllIIIIllII = llllllIlII[0];
        char[] lllllllllllllllllIlIIIllIIIIIllI = lllllllllllllllllIlIIIllIIIlIIII.toCharArray();
        int lllllllllllllllllIlIIIllIIIIIlIl = lllllllllllllllllIlIIIllIIIIIllI.length;
        int lllllllllllllllllIlIIIllIIIIIlII = llllllIlII[0];
        while (P.llIlIllIllIll(lllllllllllllllllIlIIIllIIIIIlII, lllllllllllllllllIlIIIllIIIIIlIl)) {
            char lllllllllllllllllIlIIIllIIIlIIIl = lllllllllllllllllIlIIIllIIIIIllI[lllllllllllllllllIlIIIllIIIIIlII];
            lllllllllllllllllIlIIIllIIIIlllI.append((char)(lllllllllllllllllIlIIIllIIIlIIIl ^ lllllllllllllllllIlIIIllIIIIllIl[lllllllllllllllllIlIIIllIIIIllII % lllllllllllllllllIlIIIllIIIIllIl.length]));
            0;
            ++lllllllllllllllllIlIIIllIIIIllII;
            ++lllllllllllllllllIlIIIllIIIIIlII;
            0;
            if (((9 ^ 0x6E ^ (0xB1 ^ 0x9B)) & (0x98 ^ 0x97 ^ (7 ^ 0x45) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIlIIIllIIIIlllI);
    }

    private static int llIlIllIllIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aa() {
        int n2;
        String[] stringArray = new String[llllllIlII[1]];
        stringArray[P.llllllIlII[0]] = llllllIIll[llllllIlII[47]];
        if (P.llIlIllIllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[llllllIlII[1]];
            stringArray2[P.llllllIlII[0]] = llllllIIll[llllllIlII[48]];
            if (P.llIlIllIllIlI(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                String[] stringArray3 = new String[llllllIlII[1]];
                stringArray3[P.llllllIlII[0]] = llllllIIll[llllllIlII[49]];
                if (P.llIlIllIllIlI(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                    n2 = llllllIlII[1];
                    0;
                    if (null == null) return n2 != 0;
                    return ((0xE8 ^ 0xC2) & ~(0x2C ^ 6)) != 0;
                }
            }
        }
        n2 = llllllIlII[0];
        return n2 != 0;
    }

    private static boolean llIlIlllIIIll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIlIlllIIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIlIlllIIIII(Object object) {
        return object != null;
    }

    @Override
    public int T() {
        try {
            P.dl();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0x7E ^ 0x7A) <= 0) {
            return (2 ^ 0x10) & ~(0x78 ^ 0x6A);
        }
        return llllllIlII[59];
    }

    static {
        P.llIlIllIllIII();
        P.llIlIllIlIlll();
        iC = new WorldPoint(llllllIlII[62], llllllIlII[63], llllllIlII[0]);
        iD = new WorldPoint(llllllIlII[64], llllllIlII[65], llllllIlII[0]);
        iE = new WorldPoint(llllllIlII[66], llllllIlII[67], llllllIlII[0]);
        iF = new WorldPoint(llllllIlII[68], llllllIlII[69], llllllIlII[0]);
        String[] stringArray = new String[llllllIlII[10]];
        stringArray[P.llllllIlII[0]] = llllllIIll[llllllIlII[70]];
        stringArray[P.llllllIlII[1]] = llllllIIll[llllllIlII[53]];
        stringArray[P.llllllIlII[5]] = llllllIIll[llllllIlII[71]];
        stringArray[P.llllllIlII[7]] = llllllIIll[llllllIlII[72]];
        iG = stringArray;
        bu = new ArrayList<d>();
        bS = llllllIlII[0];
    }

    private static boolean llIlIllIllIlI(int n2) {
        return n2 != 0;
    }

    private static String llIlIllIlIlIl(String lllllllllllllllllIlIIIllIIlIlIll, String lllllllllllllllllIlIIIllIIlIlIlI) {
        try {
            SecretKeySpec lllllllllllllllllIlIIIllIIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIllIIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIIIllIIlIllll = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIIIllIIlIllll.init(llllllIlII[5], lllllllllllllllllIlIIIllIIllIIII);
            return new String(lllllllllllllllllIlIIIllIIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIllIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIIIllIIlIlllI) {
            lllllllllllllllllIlIIIllIIlIlllI.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean V() {
        int n2;
        if (P.llIlIlllIIlIl(e.j(llllllIlII[9]), llllllIlII[7]) && P.llIlIlllIIIIl(Players.getLocal().getWorldLocation().distanceTo(iF), llllllIlII[43])) {
            n2 = llllllIlII[1];
            0;
            if ((0x3E ^ 0x75 ^ (0xE8 ^ 0xA7)) != (43 + 183 - 179 + 142 ^ 32 + 160 - 167 + 160)) {
                return ((4 + 71 - 38 + 119 ^ 90 + 14 - 39 + 75) & (0x17 ^ 0x1F ^ (0xA0 ^ 0xB8) ^ -1)) != 0;
            }
        } else {
            n2 = llllllIlII[0];
        }
        return n2 != 0;
    }

    private static void llIlIllIllIII() {
        llllllIlII = new int[74];
        P.llllllIlII[0] = (11 + 145 - 83 + 119 ^ 5 + 29 - -1 + 163) & (0x55 ^ 0x7E ^ (0x5E ^ 0x73) ^ -1);
        P.llllllIlII[1] = 1;
        P.llllllIlII[2] = 97 + 64 - 124 + 92 ^ 191 + 58 - 222 + 165;
        P.llllllIlII[3] = 0x61 ^ 0x68 ^ 3;
        P.llllllIlII[4] = 181 + 210 - 216 + 38 ^ 64 + 23 - 56 + 116;
        P.llllllIlII[5] = 2;
        P.llllllIlII[6] = 0xFFFFC17B & 0x3FFF;
        P.llllllIlII[7] = 3;
        P.llllllIlII[8] = -(0xFFFFB15B & 0x7EB5) & (0xFFFFBBF3 & 0x77FF);
        P.llllllIlII[9] = 173 + 118 - 185 + 72;
        P.llllllIlII[10] = 164 + 12 - 9 + 20 ^ 6 + 161 - 20 + 44;
        P.llllllIlII[11] = 0xB7 ^ 0xB2;
        P.llllllIlII[12] = 0xFFFFB7FA & 0x5B8D;
        P.llllllIlII[13] = -(0xFFFFEF3B & 0x18C7) & (0xFFFFCF7F & 0x3FFF);
        P.llllllIlII[14] = -(0xFFFFEB19 & 0x35F7) & (0xFFFFBF3F & 0x67DE);
        P.llllllIlII[15] = 0xFFFFCF2F & 0x39FB;
        P.llllllIlII[16] = -(0xFFFFB95B & 0x66AD) & (0xFFFFBF7F & 0x7FCF);
        P.llllllIlII[17] = -(0xFFFFFBDB & 0x5EED) & (0xFFFFFFFD & 0x5FFF);
        P.llllllIlII[18] = 0x71 ^ 0x77;
        P.llllllIlII[19] = -(0xFFFFC1B6 & 0x7F4B) & (0xFFFFEFDF & 0x7FEB);
        P.llllllIlII[20] = 0x67 ^ 0x60;
        P.llllllIlII[21] = 0xC9 ^ 0x93 ^ (0xFE ^ 0xAC);
        P.llllllIlII[22] = 61 + 91 - 116 + 153 ^ 10 + 157 - 152 + 165;
        P.llllllIlII[23] = 0xA3 ^ 0xC4 ^ (0xD2 ^ 0xBE);
        P.llllllIlII[24] = 0xD ^ 1;
        P.llllllIlII[25] = 0x8E ^ 0x83;
        P.llllllIlII[26] = 0x2E ^ 0x20;
        P.llllllIlII[27] = 0x6A ^ 0x72 ^ (0x31 ^ 0x26);
        P.llllllIlII[28] = 0x51 ^ 0x6F ^ (0x3E ^ 0x10);
        P.llllllIlII[29] = 0xFF ^ 0x83 ^ (0xA ^ 0x67);
        P.llllllIlII[30] = 0xC7 ^ 0x99 ^ (0x48 ^ 4);
        P.llllllIlII[31] = 0xBB ^ 0xA8;
        P.llllllIlII[32] = 0x2D ^ 0x39;
        P.llllllIlII[33] = 0xFFFFC7FE & 0x3ACB;
        P.llllllIlII[34] = 0x43 ^ 0x56;
        P.llllllIlII[35] = 0x5C ^ 9 ^ (0x46 ^ 5);
        P.llllllIlII[36] = 38 + 15 - -53 + 40 ^ 131 + 30 - 149 + 121;
        P.llllllIlII[37] = 0x45 ^ 0x6C ^ (0x89 ^ 0xB8);
        P.llllllIlII[38] = 0x11 ^ 8;
        P.llllllIlII[39] = 84 + 41 - 45 + 60 ^ 112 + 16 - 123 + 145;
        P.llllllIlII[40] = 0x13 ^ 0x3D ^ (8 ^ 0x3D);
        P.llllllIlII[41] = 0xA2 ^ 0xC1 ^ 20 + 54 - 22 + 75;
        P.llllllIlII[42] = 0x5F ^ 0x42;
        P.llllllIlII[43] = 66 + 74 - 73 + 155 ^ 145 + 49 - 95 + 93;
        P.llllllIlII[44] = 0xAF ^ 0xB0;
        P.llllllIlII[45] = 161 + 216 - 207 + 60 ^ 193 + 57 - 171 + 119;
        P.llllllIlII[46] = 112 + 44 - 58 + 41 ^ 42 + 38 - 77 + 167;
        P.llllllIlII[47] = 0x35 ^ 0x13 ^ (0x2A ^ 0x2E);
        P.llllllIlII[48] = 0xDF ^ 0x82 ^ (0xE8 ^ 0x96);
        P.llllllIlII[49] = 0x66 ^ 0x42;
        P.llllllIlII[50] = 0xFFFFF72D & 0x1FDE;
        P.llllllIlII[51] = 0xFFFFED6F & 0x77BC;
        P.llllllIlII[52] = 0xFFFFBE1E & 0x7FFD;
        P.llllllIlII[53] = 72 + 180 - 190 + 125 ^ 71 + 140 - 140 + 76;
        P.llllllIlII[54] = 0xFFFF8BF8 & 0x7597;
        P.llllllIlII[55] = 0xFFFFBFFF & 0x6ECC;
        P.llllllIlII[56] = -(0xFFFF9C7D & 0x77C7) & (0xFFFFF7FF & 0x7DEC);
        P.llllllIlII[57] = -(0xFFFFF893 & 0x37FD) & (0xFFFFFFFF & 0x37FC);
        P.llllllIlII[58] = 0xFFFFB579 & 0x7BD7;
        P.llllllIlII[59] = 145 + 110 - 135 + 42 ^ 142 + 120 - 129 + 65;
        P.llllllIlII[60] = 0x25 ^ 0;
        P.llllllIlII[61] = 0xC ^ 0x2A;
        P.llllllIlII[62] = 0xFFFFFCDF & 0xF3A;
        P.llllllIlII[63] = 0xFFFF8DD7 & 0x7EEC;
        P.llllllIlII[64] = -(0xFFFFFFCB & 0x623D) & (0xFFFFFEBF & 0x6FDF);
        P.llllllIlII[65] = -(59 + 107 - 65 + 28) & (0xFFFFCDDB & 0x3FE7);
        P.llllllIlII[66] = -(0xFFFFE6D7 & 0x7B7A) & (0xFFFFFF7D & 0x6EFF);
        P.llllllIlII[67] = 0xFFFFCF1D & 0x3DFE;
        P.llllllIlII[68] = 0xFFFF8FB5 & 0x7C4F;
        P.llllllIlII[69] = -(0xFFFFFDDF & 0x53F1) & (0xFFFFFFFF & 0x77FB);
        P.llllllIlII[70] = 0x36 ^ 0x11;
        P.llllllIlII[71] = 0x80 ^ 0xA9;
        P.llllllIlII[72] = 0x5A ^ 0x70;
        P.llllllIlII[73] = 0x4D ^ 0x5F ^ (0x52 ^ 0x6B);
    }

    public static void dl() {
        block44: {
            BankLocation lllllllllllllllllIlIIIllIIlllIll;
            block47: {
                block48: {
                    block46: {
                        block45: {
                            if (P.llIlIllIllIlI(bs ? 1 : 0)) {
                                AccBuilderTempleTrek.c = llllllIIll[llllllIlII[0]];
                                b.a(bu);
                                if (P.llIlIllIllIll(bu.size(), llllllIlII[1])) {
                                    System.out.println(llllllIIll[llllllIlII[1]]);
                                    bs = llllllIlII[0];
                                }
                            }
                            if (P.llIlIllIlllII(bs ? 1 : 0) && P.llIlIllIllIll(e.j(llllllIlII[2]), llllllIlII[3])) {
                                v.by();
                            }
                            if (!P.llIlIllIlllII(bs ? 1 : 0) || !P.llIlIllIlllIl(e.j(llllllIlII[2]), llllllIlII[3])) break block44;
                            if (P.llIlIllIllIlI(Inventory.contains((int[])f.aU) ? 1 : 0) && P.llIlIllIllIll(Movement.getRunEnergy(), llllllIlII[4])) {
                                Inventory.getFirst((int[])f.aU).interact(llllllIIll[llllllIlII[5]]);
                                Time.sleepTicks((int)llllllIlII[1]);
                                0;
                            }
                            if (P.llIlIllIllllI(P.llIlIllIllIIl(e.u(), 70.0))) {
                                int[] nArray = new int[llllllIlII[1]];
                                nArray[P.llllllIlII[0]] = llllllIlII[6];
                                if (P.llIlIllIllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray2 = new int[llllllIlII[1]];
                                    nArray2[P.llllllIlII[0]] = llllllIlII[6];
                                    Inventory.getFirst((int[])nArray2).interact(llllllIIll[llllllIlII[7]]);
                                }
                            }
                            if (P.llIlIllIlllII(Movement.isRunEnabled() ? 1 : 0) && P.llIlIllIlllll(Movement.getRunEnergy())) {
                                Movement.toggleRun();
                            }
                            if (!P.llIlIllIllIlI(P.aa() ? 1 : 0)) break block45;
                            int[] nArray = new int[llllllIlII[1]];
                            nArray[P.llllllIlII[0]] = llllllIlII[8];
                            if (!P.llIlIllIlllll(Inventory.getCount((int[])nArray))) break block46;
                        }
                        if (P.llIlIllIllIll(e.j(llllllIlII[9]), llllllIlII[1])) {
                            lllllllllllllllllIlIIIllIIlllIll = BankLocation.getNearest();
                            if (P.llIlIlllIIIII(lllllllllllllllllIlIIIllIIlllIll) && P.llIlIllIlllII(lllllllllllllllllIlIIIllIIlllIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = llllllIIll[llllllIlII[10]];
                                a.a(lllllllllllllllllIlIIIllIIlllIll);
                                Time.sleepTicks((int)llllllIlII[5]);
                                0;
                            }
                            if (P.llIlIlllIIIII(lllllllllllllllllIlIIIllIIlllIll) && P.llIlIllIllIlI(lllllllllllllllllIlIIIllIIlllIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = llllllIIll[llllllIlII[11]];
                                if (P.llIlIllIlllII(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)llllllIlII[12]);
                                    0;
                                }
                                if (P.llIlIllIllIlI(Bank.isOpen() ? 1 : 0)) {
                                    if (P.llIlIllIlllll(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)llllllIlII[10]);
                                        0;
                                    }
                                    if (P.llIlIllIlllll(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)llllllIlII[5]);
                                        0;
                                    }
                                    int[] nArray = new int[llllllIlII[11]];
                                    nArray[P.llllllIlII[0]] = llllllIlII[13];
                                    nArray[P.llllllIlII[1]] = llllllIlII[14];
                                    nArray[P.llllllIlII[5]] = llllllIlII[15];
                                    nArray[P.llllllIlII[7]] = llllllIlII[16];
                                    nArray[P.llllllIlII[10]] = llllllIlII[17];
                                    if (P.llIlIllIlllII(e.b(nArray) ? 1 : 0)) {
                                        P.ae();
                                        System.out.println(llllllIIll[llllllIlII[18]]);
                                        bs = llllllIlII[1];
                                        return;
                                    }
                                    Bank.withdraw((int)llllllIlII[13], (int)llllllIlII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllllIlII[1]);
                                    0;
                                    Bank.withdraw((int)llllllIlII[14], (int)llllllIlII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllllIlII[1]);
                                    0;
                                    Bank.withdraw((int)llllllIlII[15], (int)llllllIlII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllllIlII[1]);
                                    0;
                                    Bank.withdraw((int)llllllIlII[16], (int)llllllIlII[11], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllllIlII[1]);
                                    0;
                                    Bank.withdraw((int)llllllIlII[19], (int)llllllIlII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllllIlII[1]);
                                    0;
                                    Bank.withdraw((int)llllllIlII[17], (int)llllllIlII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllllIlII[1]);
                                    0;
                                    a.b(f.aU, llllllIlII[1]);
                                    a.a(llllllIlII[6], llllllIlII[3]);
                                    a.b(f.be, llllllIlII[1]);
                                }
                            }
                        }
                    }
                    if (P.llIlIllIllIlI(P.aa() ? 1 : 0) && P.llIlIllIllIll(e.j(llllllIlII[9]), llllllIlII[1])) {
                        if (P.llIlIlllIIIIl(Players.getLocal().getWorldLocation().distanceTo(iC), llllllIlII[5])) {
                            AccBuilderTempleTrek.c = llllllIIll[llllllIlII[20]];
                            if (P.llIlIllIlllII(Equipment.contains((int[])f.aQ) ? 1 : 0) && P.llIlIllIllIlI(Inventory.contains((int[])f.aQ) ? 1 : 0)) {
                                Inventory.getFirst((int[])f.aQ).interact(llllllIIll[llllllIlII[21]]);
                                Time.sleepTicks((int)llllllIlII[1]);
                                0;
                            }
                            if (P.llIlIllIllIll(bS, llllllIlII[1])) {
                                e.v();
                                bS += llllllIlII[1];
                            }
                            Movement.walkTo((WorldPoint)iC);
                            0;
                            Time.sleepTicks((int)llllllIlII[1]);
                            0;
                        }
                        if (P.llIlIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(iC), llllllIlII[7])) {
                            AccBuilderTempleTrek.c = llllllIIll[llllllIlII[22]];
                            g.a(llllllIIll[llllllIlII[3]], iG);
                        }
                    }
                    if (P.llIlIllIlllIl(e.j(llllllIlII[9]), llllllIlII[1])) {
                        ck = llllllIlII[0];
                        if (P.llIlIlllIIIIl(Players.getLocal().getWorldLocation().distanceTo(iD), llllllIlII[21])) {
                            AccBuilderTempleTrek.c = llllllIIll[llllllIlII[23]];
                            Movement.walkTo((WorldPoint)iD);
                            0;
                            Time.sleepTicks((int)llllllIlII[1]);
                            0;
                        }
                        if (P.llIlIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(iD), llllllIlII[21])) {
                            AccBuilderTempleTrek.c = llllllIIll[llllllIlII[24]];
                            g.a(llllllIIll[llllllIlII[25]], iG);
                        }
                    }
                    if (!P.llIlIllIlllIl(e.j(llllllIlII[9]), llllllIlII[5])) break block47;
                    String[] stringArray = new String[llllllIlII[1]];
                    stringArray[P.llllllIlII[0]] = llllllIIll[llllllIlII[26]];
                    if (!P.llIlIllIlllII(Inventory.contains((String[])stringArray) ? 1 : 0)) break block48;
                    String[] stringArray2 = new String[llllllIlII[1]];
                    stringArray2[P.llllllIlII[0]] = llllllIIll[llllllIlII[27]];
                    if (!P.llIlIllIlllII(Inventory.contains((String[])stringArray2) ? 1 : 0)) break block47;
                }
                AccBuilderTempleTrek.c = llllllIIll[llllllIlII[28]];
                g.a(llllllIIll[llllllIlII[29]], iG);
                g.a(iG);
            }
            if (P.llIlIllIlllIl(e.j(llllllIlII[9]), llllllIlII[5])) {
                String[] stringArray = new String[llllllIlII[1]];
                stringArray[P.llllllIlII[0]] = llllllIIll[llllllIlII[30]];
                if (P.llIlIllIlllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray3 = new String[llllllIlII[1]];
                    stringArray3[P.llllllIlII[0]] = llllllIIll[llllllIlII[31]];
                    if (P.llIlIllIllIlI(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                        if (P.llIlIlllIIIIl(Players.getLocal().getWorldLocation().distanceTo(iE), llllllIlII[5]) && P.llIlIlllIIIIl(Players.getLocal().getWorldLocation().distanceTo(iF), llllllIlII[3])) {
                            AccBuilderTempleTrek.c = llllllIIll[llllllIlII[32]];
                            if (P.llIlIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(iD), llllllIlII[3]) && P.llIlIllIllIlI(Equipment.contains((int[])f.aQ) ? 1 : 0) && P.llIlIlllIIIll(Players.getLocal().getAnimation(), llllllIlII[33])) {
                                Equipment.getFirst((int[])f.aQ).interact(llllllIIll[llllllIlII[34]]);
                                Time.sleepTicks((int)llllllIlII[7]);
                                0;
                            }
                            Movement.walkTo((WorldPoint)iE);
                            0;
                            Time.sleepTicks((int)llllllIlII[1]);
                            0;
                        }
                        if (P.llIlIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(iE), llllllIlII[10])) {
                            AccBuilderTempleTrek.c = llllllIIll[llllllIlII[35]];
                            String[] stringArray4 = new String[llllllIlII[1]];
                            stringArray4[P.llllllIlII[0]] = llllllIIll[llllllIlII[36]];
                            lllllllllllllllllIlIIIllIIlllIll = TileObjects.getNearest((String[])stringArray4);
                            lllllllllllllllllIlIIIllIIlllIll.interact(llllllIIll[llllllIlII[37]]);
                            Time.sleepTicks((int)llllllIlII[7]);
                            0;
                        }
                        if (P.llIlIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(iF), llllllIlII[3])) {
                            String[] stringArray5 = new String[llllllIlII[1]];
                            stringArray5[P.llllllIlII[0]] = llllllIIll[llllllIlII[38]];
                            if (P.llIlIlllIIlII(NPCs.getNearest((String[])stringArray5))) {
                                AccBuilderTempleTrek.c = llllllIIll[llllllIlII[39]];
                                if (P.llIlIllIllIll(ck, llllllIlII[1])) {
                                    ac.mK += llllllIlII[1];
                                    ac.d(AccBuilderTempleTrek.m);
                                    ck += llllllIlII[1];
                                    ac.mK = llllllIlII[0];
                                    cl = llllllIlII[0];
                                }
                                String[] stringArray6 = new String[llllllIlII[1]];
                                stringArray6[P.llllllIlII[0]] = llllllIIll[llllllIlII[40]];
                                TileObjects.getNearest((String[])stringArray6).interact(llllllIIll[llllllIlII[41]]);
                                Time.sleepTicks((int)llllllIlII[10]);
                                0;
                            }
                            String[] stringArray7 = new String[llllllIlII[1]];
                            stringArray7[P.llllllIlII[0]] = llllllIIll[llllllIlII[42]];
                            lllllllllllllllllIlIIIllIIlllIll = NPCs.getNearest((String[])stringArray7);
                            if (P.llIlIlllIIIII(lllllllllllllllllIlIIIllIIlllIll)) {
                                AccBuilderTempleTrek.c = llllllIIll[llllllIlII[43]];
                                int[] nArray = new int[llllllIlII[1]];
                                nArray[P.llllllIlII[0]] = llllllIlII[17];
                                if (P.llIlIllIlllII(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray3 = new int[llllllIlII[1]];
                                    nArray3[P.llllllIlII[0]] = llllllIlII[17];
                                    if (P.llIlIllIllIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                        int[] nArray4 = new int[llllllIlII[1]];
                                        nArray4[P.llllllIlII[0]] = llllllIlII[17];
                                        Inventory.getFirst((int[])nArray4).interact(llllllIIll[llllllIlII[44]]);
                                        Time.sleepTicks((int)llllllIlII[1]);
                                        0;
                                    }
                                }
                                if (P.llIlIlllIIlII(Players.getLocal().getInteracting()) && P.llIlIllIlllII(lllllllllllllllllIlIIIllIIlllIll.isDead() ? 1 : 0)) {
                                    lllllllllllllllllIlIIIllIIlllIll.interact(llllllIIll[llllllIlII[45]]);
                                    Time.sleepTicks((int)llllllIlII[5]);
                                    0;
                                }
                            }
                        }
                    }
                }
            }
            if (P.llIlIllIlllIl(e.j(llllllIlII[9]), llllllIlII[7]) && P.llIlIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(iF), llllllIlII[3])) {
                int[] nArray = new int[llllllIlII[1]];
                nArray[P.llllllIlII[0]] = llllllIlII[16];
                if (P.llIlIllIllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray5 = new int[llllllIlII[1]];
                    nArray5[P.llllllIlII[0]] = llllllIlII[16];
                    Inventory.getFirst((int[])nArray5).interact(llllllIIll[llllllIlII[46]]);
                    Time.sleepTicks((int)llllllIlII[5]);
                    0;
                }
            }
            g.a(new String[llllllIlII[0]]);
        }
    }

    private static void ae() {
        d lllllllllllllllllIlIIIllIIllIlll;
        Object lllllllllllllllllIlIIIllIIlllIII;
        int[] nArray = new int[llllllIlII[1]];
        nArray[P.llllllIlII[0]] = llllllIlII[13];
        if (P.llIlIllIlllII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llllllIlII[13], llllllIlII[1], llllllIlII[50]);
            bu.add(d2);
            0;
        }
        int[] nArray2 = new int[llllllIlII[1]];
        nArray2[P.llllllIlII[0]] = llllllIlII[15];
        if (P.llIlIllIlllII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllllllllllllllllIlIIIllIIlllIII = new d(llllllIlII[15], llllllIlII[1], llllllIlII[50]);
            bu.add((d)lllllllllllllllllIlIIIllIIlllIII);
            0;
        }
        int[] nArray3 = new int[llllllIlII[1]];
        nArray3[P.llllllIlII[0]] = llllllIlII[17];
        if (P.llIlIllIlllII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllllllllllllllllIlIIIllIIlllIII = new d(llllllIlII[17], llllllIlII[1], llllllIlII[51]);
            bu.add((d)lllllllllllllllllIlIIIllIIlllIII);
            0;
        }
        int[] nArray4 = new int[llllllIlII[1]];
        nArray4[P.llllllIlII[0]] = llllllIlII[14];
        if (P.llIlIllIlllII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lllllllllllllllllIlIIIllIIlllIII = new d(llllllIlII[14], llllllIlII[1], llllllIlII[50]);
            bu.add((d)lllllllllllllllllIlIIIllIIlllIII);
            0;
        }
        int[] nArray5 = new int[llllllIlII[1]];
        nArray5[P.llllllIlII[0]] = llllllIlII[19];
        if (P.llIlIllIlllII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lllllllllllllllllIlIIIllIIlllIII = new d(llllllIlII[19], llllllIlII[1], llllllIlII[52]);
            bu.add((d)lllllllllllllllllIlIIIllIIlllIII);
            0;
        }
        int[] nArray6 = new int[llllllIlII[1]];
        nArray6[P.llllllIlII[0]] = llllllIlII[6];
        if (P.llIlIllIlllII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lllllllllllllllllIlIIIllIIlllIII = new d(llllllIlII[6], llllllIlII[3], llllllIlII[50]);
            bu.add((d)lllllllllllllllllIlIIIllIIlllIII);
            0;
        }
        int[] nArray7 = new int[llllllIlII[1]];
        nArray7[P.llllllIlII[0]] = llllllIlII[6];
        if (P.llIlIllIllIlI(Bank.contains((int[])nArray7) ? 1 : 0)) {
            int[] nArray8 = new int[llllllIlII[1]];
            nArray8[P.llllllIlII[0]] = llllllIlII[6];
            if (P.llIlIllIllIll(Bank.getFirst((int[])nArray8).getQuantity(), llllllIlII[32])) {
                lllllllllllllllllIlIIIllIIlllIII = new d(llllllIlII[6], llllllIlII[53], llllllIlII[54]);
                bu.add((d)lllllllllllllllllIlIIIllIIlllIII);
                0;
            }
        }
        if (P.llIlIllIlllII(Bank.contains((Predicate)(lllllllllllllllllIlIIIllIIlllIII = item -> item.getName().toLowerCase().contains(llllllIIll[llllllIlII[61]]))) ? 1 : 0)) {
            lllllllllllllllllIlIIIllIIllIlll = new d(llllllIlII[55], llllllIlII[11], llllllIlII[56]);
            bu.add(lllllllllllllllllIlIIIllIIllIlll);
            0;
        }
        int[] nArray9 = new int[llllllIlII[1]];
        nArray9[P.llllllIlII[0]] = llllllIlII[16];
        if (P.llIlIllIlllII(Bank.contains((int[])nArray9) ? 1 : 0)) {
            lllllllllllllllllIlIIIllIIllIlll = new d(llllllIlII[16], llllllIlII[53], llllllIlII[57]);
            bu.add(lllllllllllllllllIlIIIllIIllIlll);
            0;
        }
        int[] nArray10 = new int[llllllIlII[1]];
        nArray10[P.llllllIlII[0]] = llllllIlII[58];
        if (P.llIlIllIlllII(Bank.contains((int[])nArray10) ? 1 : 0)) {
            lllllllllllllllllIlIIIllIIllIlll = new d(llllllIlII[58], llllllIlII[11], i.bp);
            bu.add(lllllllllllllllllIlIIIllIIllIlll);
            0;
        }
    }

    private static void llIlIllIlIlll() {
        llllllIIll = new String[llllllIlII[73]];
        P.llllllIIll[P.llllllIlII[0]] = P."Buying items";
        P.llllllIIll[P.llllllIlII[1]] = P."Finished buying items, switching back to quest";
        P.llllllIIll[P.llllllIlII[5]] = P."Drink";
        P.llllllIIll[P.llllllIlII[7]] = P."Eat";
        P.llllllIIll[P.llllllIlII[10]] = P."Nav to bank";
        P.llllllIIll[P.llllllIlII[11]] = P."Handling banking";
        P.llllllIIll[P.llllllIlII[18]] = P."We are missing quest supplies, switching to BUYING";
        P.llllllIIll[P.llllllIlII[20]] = P."Nav to start";
        P.llllllIIll[P.llllllIlII[21]] = P."Wear";
        P.llllllIIll[P.llllllIlII[22]] = P."Talking npc";
        P.llllllIIll[P.llllllIlII[3]] = P."Morgan";
        P.llllllIIll[P.llllllIlII[23]] = P."Nav to pub";
        P.llllllIIll[P.llllllIlII[24]] = P."Talk to drunk";
        P.llllllIIll[P.llllllIlII[25]] = P."Dr Harlow";
        P.llllllIIll[P.llllllIlII[26]] = P."Beer";
        P.llllllIIll[P.llllllIlII[27]] = P."Stake";
        P.llllllIIll[P.llllllIlII[28]] = P."Talk to drunk";
        P.llllllIIll[P.llllllIlII[29]] = P."Dr Harlow";
        P.llllllIIll[P.llllllIlII[30]] = P."Beer";
        P.llllllIIll[P.llllllIlII[31]] = P."Stake";
        P.llllllIIll[P.llllllIlII[32]] = P."Nav to stairs";
        P.llllllIIll[P.llllllIlII[34]] = P."Draynor Village";
        P.llllllIIll[P.llllllIlII[35]] = P."Walking down stairs";
        P.llllllIIll[P.llllllIlII[36]] = P."Stairs";
        P.llllllIIll[P.llllllIlII[37]] = P."Walk-Down";
        P.llllllIIll[P.llllllIlII[38]] = P."Count Draynor";
        P.llllllIIll[P.llllllIlII[39]] = P."Starting fight";
        P.llllllIIll[P.llllllIlII[40]] = P."Coffin";
        P.llllllIIll[P.llllllIlII[41]] = P."Open";
        P.llllllIIll[P.llllllIlII[42]] = P."Count Draynor";
        P.llllllIIll[P.llllllIlII[43]] = P."Fighting";
        P.llllllIIll[P.llllllIlII[44]] = P."Wield";
        P.llllllIIll[P.llllllIlII[45]] = P."Attack";
        P.llllllIIll[P.llllllIlII[46]] = P."Break";
        P.llllllIIll[P.llllllIlII[47]] = P."Beer";
        P.llllllIIll[P.llllllIlII[48]] = P."Garlic";
        P.llllllIIll[P.llllllIlII[49]] = P."Hammer";
        P.llllllIIll[P.llllllIlII[60]] = P."Vampire slayer quest";
        P.llllllIIll[P.llllllIlII[61]] = P."ring of wealth (";
        P.llllllIIll[P.llllllIlII[70]] = P."Ok, I'm up for an adventure.";
        P.llllllIIll[P.llllllIlII[53]] = P."A glass of your finest ale please.";
        P.llllllIIll[P.llllllIlII[71]] = P."Morgan needs your help!";
        P.llllllIIll[P.llllllIlII[72]] = P."Yes.";
    }

    private static boolean llIlIllIlllll(int n2) {
        return n2 > 0;
    }

    private static boolean llIlIlllIIlII(Object object) {
        return object == null;
    }

    private static boolean llIlIlllIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIlIlllIIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public String U() {
        return llllllIIll[llllllIlII[60]];
    }

    private static boolean llIlIllIlllII(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIllIlllIl(int n2, int n3) {
        return n2 == n3;
    }
}

