/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
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
 *  net.unethicalite.api.widgets.Dialog
 */
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.U;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.b;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.d;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.g;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.i;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.v;
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
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class D
implements G {
    private static final /* synthetic */ int ia;
    private static final /* synthetic */ int id;
    private static final /* synthetic */ int if;
    static /* synthetic */ String hK;
    private static final /* synthetic */ int ih;
    private static final /* synthetic */ int ij;
    private static final /* synthetic */ int ie;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ String[] gz;
    private static /* synthetic */ int[] lIIllIIIlI;
    private static final /* synthetic */ WorldPoint hY;
    private static final /* synthetic */ int ig;
    public static /* synthetic */ List<d> bv;
    private static final /* synthetic */ int ic;
    private static final /* synthetic */ int ii;
    static /* synthetic */ int ck;
    private static final /* synthetic */ int ib;
    private static /* synthetic */ String[] lIIlIlllll;
    private static final /* synthetic */ int hZ;
    static /* synthetic */ boolean cl;
    static /* synthetic */ int bT;

    @Override
    public boolean S() {
        return lIIllIIIlI[0];
    }

    private static void lIIIIIIlIIlIl() {
        lIIllIIIlI = new int[97];
        D.lIIllIIIlI[0] = (0x1C ^ 0x38) & ~(0x2F ^ 0xB);
        D.lIIllIIIlI[1] = 1;
        D.lIIllIIIlI[2] = 26 + 63 - -4 + 51 + (0x5E ^ 0x7F) - (57 + 99 - 26 + 25) + (85 + 40 - 30 + 43);
        D.lIIllIIIlI[3] = 2;
        D.lIIllIIIlI[4] = 3;
        D.lIIllIIIlI[5] = -(0xFFFFB5FB & 0x4E37) & (0xFFFFFFBF & 0x17FA);
        D.lIIllIIIlI[6] = 0x8D ^ 0x89;
        D.lIIllIIIlI[7] = 0xFFFFDFCD & 0x3F7B;
        D.lIIllIIIlI[8] = 0xC9 ^ 0xC3;
        D.lIIllIIIlI[9] = 0x52 ^ 0x57;
        D.lIIllIIIlI[10] = -(0xFFFFF5DD & 0x7E63) & (0xFFFFFFFF & 0x766E);
        D.lIIllIIIlI[11] = -(0xFFFFCC9C & 0x3B7B) & (0xFFFFAFFF & 0x5BFF);
        D.lIIllIIIlI[12] = 0x7B ^ 0x7D;
        D.lIIllIIIlI[13] = -(0xFFFFF5F7 & 0x5F5B) & (0xFFFFD7FF & 0x7F7F);
        D.lIIllIIIlI[14] = 0x5E ^ 0x61 ^ (0xA7 ^ 0x9F);
        D.lIIllIIIlI[15] = 0xFFFFDE3F & 0x23EB;
        D.lIIllIIIlI[16] = 9 ^ 0x62 ^ (0x56 ^ 0x35);
        D.lIIllIIIlI[17] = -(0xFFFFF09F & 0x1F7B) & (0xFFFFBFDB & 0x57FF);
        D.lIIllIIIlI[18] = 0xA3 ^ 0xAA;
        D.lIIllIIIlI[19] = 0x8F ^ 0xAF ^ (0x87 ^ 0xAC);
        D.lIIllIIIlI[20] = -(25 + 102 - 30 + 56) & (0xFFFFFFFF & 0x1FDF);
        D.lIIllIIIlI[21] = 0xFFFFB7BF & 0x4DFE;
        D.lIIllIIIlI[22] = -(0xFFFFF8AD & 0x2F56) & (0xFFFFAFFF & 0x7DC3);
        D.lIIllIIIlI[23] = 0xFFFFB7E7 & 0x4DDA;
        D.lIIllIIIlI[24] = -(0xFFFFFA37 & 0x77EC) & (0xFFFFF7F7 & 0x7FEF);
        D.lIIllIIIlI[25] = 0xFFFF93FF & 0x6D7B;
        D.lIIllIIIlI[26] = 0xFFFFC5FE & 0x3BF5;
        D.lIIllIIIlI[27] = -(0xFFFFC8AF & 0x3FDF) & (0xFFFFB9FF & 0x7FDF);
        D.lIIllIIIlI[28] = 0xFFFF9FBE & 0x6A55;
        D.lIIllIIIlI[29] = -(0xFFFFFBF7 & 0x57D9) & (0xFFFFFFD9 & 0x5FFE);
        D.lIIllIIIlI[30] = 0x73 ^ 5 ^ (0x4B ^ 0x29);
        D.lIIllIIIlI[31] = 0x45 ^ 0x4A;
        D.lIIllIIIlI[32] = 31 + 63 - -42 + 42 ^ 42 + 126 - -22 + 0;
        D.lIIllIIIlI[33] = 9 + 15 - -87 + 26 ^ 30 + 74 - 77 + 105;
        D.lIIllIIIlI[34] = 44 + 119 - 26 + 45 ^ 35 + 72 - -13 + 64;
        D.lIIllIIIlI[35] = 0 + 68 - -4 + 90 ^ 7 + 173 - 53 + 51;
        D.lIIllIIIlI[36] = 0xA ^ 0x1B;
        D.lIIllIIIlI[37] = 0xFFFFE576 & 0x3FAF;
        D.lIIllIIIlI[38] = 0x64 ^ 0x76;
        D.lIIllIIIlI[39] = -(0xFFFFFFEF & 0x4C79) & (0xFFFFFFFE & 0x6FFF);
        D.lIIllIIIlI[40] = 0xA3 ^ 0xB0;
        D.lIIllIIIlI[41] = 0x6F ^ 0x7A;
        D.lIIllIIIlI[42] = 0xC8 ^ 0xAC;
        D.lIIllIIIlI[43] = -(0xFFFFBFFF & 0x7E68) & (0xFFFFBFF7 & Short.MAX_VALUE);
        D.lIIllIIIlI[44] = 0x28 ^ 0x3E;
        D.lIIllIIIlI[45] = 10 + 167 - 94 + 102 ^ 62 + 13 - 30 + 100;
        D.lIIllIIIlI[46] = 0x3A ^ 0x2D;
        D.lIIllIIIlI[47] = -(0x3D ^ 0x34) & (0xFFFFB3FE & 0x5FFF);
        D.lIIllIIIlI[48] = 0x99 ^ 0x81;
        D.lIIllIIIlI[49] = 0xBC ^ 0xA5;
        D.lIIllIIIlI[50] = -(0xFFFF9CCE & 0x7333) & (0xFFFFBFDF & 0x7EED);
        D.lIIllIIIlI[51] = -(0xFFFF8A17 & 0x7DF9) & (0xFFFFCF78 & 0x7AFF);
        D.lIIllIIIlI[52] = 0xA7 ^ 0xBD;
        D.lIIllIIIlI[53] = -(0xFFFFEA0F & 0x1DF2) & (0xFFFFBFFF & 0x4F6D);
        D.lIIllIIIlI[54] = 0x85 ^ 0x9E;
        D.lIIllIIIlI[55] = 53 + 124 - 171 + 177 ^ 103 + 147 - 165 + 86;
        D.lIIllIIIlI[56] = 0x63 ^ 0x7E;
        D.lIIllIIIlI[57] = 0x4A ^ 0xE ^ (0x50 ^ 0xA);
        D.lIIllIIIlI[58] = 0xFFFF97F3 & 0x6FDC;
        D.lIIllIIIlI[59] = 0xFFFF867F & 0x7BAC;
        D.lIIllIIIlI[60] = 0x7D ^ 0x62;
        D.lIIllIIIlI[61] = 0xE4 ^ 0xC4;
        D.lIIllIIIlI[62] = 0xA4 ^ 0x85;
        D.lIIllIIIlI[63] = 0x11 ^ 0x29 ^ (0x88 ^ 0x92);
        D.lIIllIIIlI[64] = 0x96 ^ 0xB5;
        D.lIIllIIIlI[65] = 0x3D ^ 0xD ^ (0xA1 ^ 0xB5);
        D.lIIllIIIlI[66] = 12 + 144 - 107 + 178 ^ 48 + 76 - -8 + 66;
        D.lIIllIIIlI[67] = 0xE4 ^ 0xC2;
        D.lIIllIIIlI[68] = 0xBC ^ 0x9F ^ (0x41 ^ 0x45);
        D.lIIllIIIlI[69] = 0xA5 ^ 0xB9 ^ (0xA3 ^ 0x96);
        D.lIIllIIIlI[70] = 0x4B ^ 0x61;
        D.lIIllIIIlI[71] = 0x93 ^ 0x86 ^ (0xFE ^ 0xC0);
        D.lIIllIIIlI[72] = 0x78 ^ 0x54;
        D.lIIllIIIlI[73] = 0x4D ^ 0x60;
        D.lIIllIIIlI[74] = 0x38 ^ 0x16;
        D.lIIllIIIlI[75] = 0x45 ^ 0x25 ^ (0x61 ^ 0x2E);
        D.lIIllIIIlI[76] = 0x8D ^ 0xBD;
        D.lIIllIIIlI[77] = 18 + 90 - -70 + 4 ^ 35 + 9 - -67 + 24;
        D.lIIllIIIlI[78] = 0x23 ^ 0x11;
        D.lIIllIIIlI[79] = 0x6A ^ 0x59;
        D.lIIllIIIlI[80] = 56 + 11 - 62 + 134 ^ 156 + 187 - 289 + 137;
        D.lIIllIIIlI[81] = 0xF2 ^ 0xC7;
        D.lIIllIIIlI[82] = 0xD7 ^ 0x85 ^ (0xD5 ^ 0xB1);
        D.lIIllIIIlI[83] = 0x6D ^ 0x5A;
        D.lIIllIIIlI[84] = 0xF6 ^ 0xAB ^ (0x32 ^ 0x57);
        D.lIIllIIIlI[85] = 0x2C ^ 0x15;
        D.lIIllIIIlI[86] = -(0xFFFFDD57 & 0x3EFA) & (0xFFFFFF7B & 0x1EFF);
        D.lIIllIIIlI[87] = -(0xFFFFD3EF & 0x7C95) & (0xFFFFFEE7 & 0x5DBC);
        D.lIIllIIIlI[88] = 0xFFFF9EDF & 0x6D7B;
        D.lIIllIIIlI[89] = 0x8B ^ 0xB1;
        D.lIIllIIIlI[90] = 0xA1 ^ 0x9A;
        D.lIIllIIIlI[91] = 0x4B ^ 0x77;
        D.lIIllIIIlI[92] = 0x2F ^ 0x12;
        D.lIIllIIIlI[93] = 38 + 21 - -19 + 57 ^ 132 + 65 - 125 + 113;
        D.lIIllIIIlI[94] = 207 + 42 - 237 + 236 ^ 89 + 98 - 59 + 71;
        D.lIIllIIIlI[95] = 0x1A ^ 0x5A;
        D.lIIllIIIlI[96] = 0x73 ^ 0x32;
    }

    private static String lIIIIIIIlIIIl(String llllllllllllllllllllllIIlIIIIlII, String llllllllllllllllllllllIIIllllllI) {
        llllllllllllllllllllllIIlIIIIlII = new String(Base64.getDecoder().decode(llllllllllllllllllllllIIlIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllllllIIlIIIIIlI = new StringBuilder();
        char[] llllllllllllllllllllllIIlIIIIIIl = llllllllllllllllllllllIIIllllllI.toCharArray();
        int llllllllllllllllllllllIIlIIIIIII = lIIllIIIlI[0];
        char[] llllllllllllllllllllllIIIllllIlI = llllllllllllllllllllllIIlIIIIlII.toCharArray();
        int llllllllllllllllllllllIIIllllIIl = llllllllllllllllllllllIIIllllIlI.length;
        int llllllllllllllllllllllIIIllllIII = lIIllIIIlI[0];
        while (D.lIIIIIIlIIlll(llllllllllllllllllllllIIIllllIII, llllllllllllllllllllllIIIllllIIl)) {
            char llllllllllllllllllllllIIlIIIIlIl = llllllllllllllllllllllIIIllllIlI[llllllllllllllllllllllIIIllllIII];
            llllllllllllllllllllllIIlIIIIIlI.append((char)(llllllllllllllllllllllIIlIIIIlIl ^ llllllllllllllllllllllIIlIIIIIIl[llllllllllllllllllllllIIlIIIIIII % llllllllllllllllllllllIIlIIIIIIl.length]));
            0;
            ++llllllllllllllllllllllIIlIIIIIII;
            ++llllllllllllllllllllllIIIllllIII;
            0;
            if (((0xD4 ^ 0xC6 ^ (0xA1 ^ 0x9F)) & (0x7E ^ 0x28 ^ (0x75 ^ 0xF) ^ -1)) >= ((0x97 ^ 0x89 ^ (0x55 ^ 0x46)) & (129 + 104 - 154 + 78 ^ 90 + 56 - 58 + 56 ^ -1))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllllllIIlIIIIIlI);
    }

    private static boolean lIIIIIIlIllII(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public String U() {
        return lIIlIlllll[lIIllIIIlI[84]];
    }

    @Override
    public boolean V() {
        boolean bl;
        if (D.lIIIIIIlIlllI(e.j(lIIllIIIlI[2]), lIIllIIIlI[3])) {
            bl = lIIllIIIlI[1];
            0;
            if (-3 >= 0) {
                return ((0x3F ^ 0x60) & ~(0xC7 ^ 0x98)) != 0;
            }
        } else {
            bl = lIIllIIIlI[0];
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean bo() {
        int n2;
        String[] stringArray = new String[lIIllIIIlI[1]];
        stringArray[D.lIIllIIIlI[0]] = lIIlIlllll[lIIllIIIlI[67]];
        if (D.lIIIIIIlIIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[lIIllIIIlI[1]];
            stringArray2[D.lIIllIIIlI[0]] = lIIlIlllll[lIIllIIIlI[68]];
            if (D.lIIIIIIlIIllI(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                String[] stringArray3 = new String[lIIllIIIlI[1]];
                stringArray3[D.lIIllIIIlI[0]] = lIIlIlllll[lIIllIIIlI[45]];
                if (D.lIIIIIIlIIllI(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                    String[] stringArray4 = new String[lIIllIIIlI[1]];
                    stringArray4[D.lIIllIIIlI[0]] = lIIlIlllll[lIIllIIIlI[69]];
                    if (D.lIIIIIIlIIllI(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                        int[] nArray = new int[lIIllIIIlI[1]];
                        nArray[D.lIIllIIIlI[0]] = lIIllIIIlI[10];
                        if (D.lIIIIIIlIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray2 = new int[lIIllIIIlI[1]];
                            nArray2[D.lIIllIIIlI[0]] = lIIllIIIlI[15];
                            if (D.lIIIIIIlIIllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                                int[] nArray3 = new int[lIIllIIIlI[1]];
                                nArray3[D.lIIllIIIlI[0]] = lIIllIIIlI[13];
                                if (D.lIIIIIIlIIllI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                    int[] nArray4 = new int[lIIllIIIlI[1]];
                                    nArray4[D.lIIllIIIlI[0]] = lIIllIIIlI[7];
                                    if (D.lIIIIIIlIIllI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                                        int[] nArray5 = new int[lIIllIIIlI[1]];
                                        nArray5[D.lIIllIIIlI[0]] = lIIllIIIlI[25];
                                        if (D.lIIIIIIlIIllI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                            String[] stringArray5 = new String[lIIllIIIlI[1]];
                                            stringArray5[D.lIIllIIIlI[0]] = lIIlIlllll[lIIllIIIlI[70]];
                                            if (D.lIIIIIIlIIllI(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                                                n2 = lIIllIIIlI[1];
                                                0;
                                                if (2 <= (0x5D ^ 0x59)) return n2 != 0;
                                                return ((0x59 ^ 0x61) & ~(0x1B ^ 0x23)) != 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIllIIIlI[0];
        return n2 != 0;
    }

    private static boolean lIIIIIIlIlIIl(Object object) {
        return object != null;
    }

    static {
        D.lIIIIIIlIIlIl();
        D.lIIIIIIlIIlII();
        ii = lIIllIIIlI[25];
        ib = lIIllIIIlI[22];
        id = lIIllIIIlI[24];
        ih = lIIllIIIlI[86];
        ic = lIIllIIIlI[23];
        ia = lIIllIIIlI[21];
        ij = lIIllIIIlI[17];
        hZ = lIIllIIIlI[2];
        ie = lIIllIIIlI[10];
        if = lIIllIIIlI[15];
        ig = lIIllIIIlI[13];
        hY = new WorldPoint(lIIllIIIlI[87], lIIllIIIlI[88], lIIllIIIlI[3]);
        bv = new ArrayList<d>();
        hK = lIIlIlllll[lIIllIIIlI[89]];
        String[] stringArray = new String[lIIllIIIlI[12]];
        stringArray[D.lIIllIIIlI[0]] = lIIlIlllll[lIIllIIIlI[90]];
        stringArray[D.lIIllIIIlI[1]] = lIIlIlllll[lIIllIIIlI[91]];
        stringArray[D.lIIllIIIlI[3]] = lIIlIlllll[lIIllIIIlI[92]];
        stringArray[D.lIIllIIIlI[4]] = lIIlIlllll[lIIllIIIlI[93]];
        stringArray[D.lIIllIIIlI[6]] = lIIlIlllll[lIIllIIIlI[94]];
        stringArray[D.lIIllIIIlI[9]] = lIIlIlllll[lIIllIIIlI[95]];
        gz = stringArray;
        bT = lIIllIIIlI[0];
    }

    private static boolean lIIIIIIlIlIlI(int n2) {
        return n2 > 0;
    }

    private static String lIIIIIIIlIIlI(String llllllllllllllllllllllIIlIlIIIIl, String llllllllllllllllllllllIIlIIllllI) {
        try {
            SecretKeySpec llllllllllllllllllllllIIlIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllllIIlIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllllllIIlIlIIIll = Cipher.getInstance("Blowfish");
            llllllllllllllllllllllIIlIlIIIll.init(lIIllIIIlI[3], llllllllllllllllllllllIIlIlIIlII);
            return new String(llllllllllllllllllllllIIlIlIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllllllllIIlIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllllllIIlIlIIIlI) {
            llllllllllllllllllllllIIlIlIIIlI.printStackTrace();
            return null;
        }
    }

    private static String lIIIIIIIlIIll(String llllllllllllllllllllllIIlIIlIlII, String llllllllllllllllllllllIIlIIlIIll) {
        try {
            SecretKeySpec llllllllllllllllllllllIIlIIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllllIIlIIlIIll.getBytes(StandardCharsets.UTF_8)), lIIllIIIlI[16]), "DES");
            Cipher llllllllllllllllllllllIIlIIlIllI = Cipher.getInstance("DES");
            llllllllllllllllllllllIIlIIlIllI.init(lIIllIIIlI[3], llllllllllllllllllllllIIlIIlIlll);
            return new String(llllllllllllllllllllllIIlIIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllllllllIIlIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllllllIIlIIlIlIl) {
            llllllllllllllllllllllIIlIIlIlIl.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void bL() {
        void llllllllllllllllllllllIIlIlIlIll;
        BankLocation bankLocation = BankLocation.getNearest();
        if (D.lIIIIIIlIlIIl(bankLocation) && D.lIIIIIIlIlIII(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIlllll[lIIllIIIlI[71]];
            a.a(bankLocation);
        }
        if (D.lIIIIIIlIlIIl(llllllllllllllllllllllIIlIlIlIll) && D.lIIIIIIlIIllI(llllllllllllllllllllllIIlIlIlIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (D.lIIIIIIlIlIII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIlllll[lIIllIIIlI[72]];
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIllIIIlI[5]);
                0;
            }
            if (D.lIIIIIIlIIllI(Bank.isOpen() ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIlllll[lIIllIIIlI[73]];
                if (D.lIIIIIIlIlIlI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIllIIIlI[4]);
                    0;
                }
                if (D.lIIIIIIlIlIlI(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)lIIllIIIlI[3]);
                    0;
                }
                String[] stringArray = new String[lIIllIIIlI[1]];
                stringArray[D.lIIllIIIlI[0]] = lIIlIlllll[lIIllIIIlI[74]];
                if (D.lIIIIIIlIIllI(Bank.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIllIIIlI[1]];
                    stringArray2[D.lIIllIIIlI[0]] = lIIlIlllll[lIIllIIIlI[75]];
                    if (D.lIIIIIIlIIlll(Bank.getFirst((String[])stringArray2).getQuantity(), lIIllIIIlI[11])) {
                        D.af();
                        System.out.println(lIIlIlllll[lIIllIIIlI[76]]);
                        bt = lIIllIIIlI[1];
                        return;
                    }
                }
                String[] stringArray3 = new String[lIIllIIIlI[1]];
                stringArray3[D.lIIllIIIlI[0]] = lIIlIlllll[lIIllIIIlI[77]];
                if (D.lIIIIIIlIIllI(Bank.contains((String[])stringArray3) ? 1 : 0)) {
                    String[] stringArray4 = new String[lIIllIIIlI[1]];
                    stringArray4[D.lIIllIIIlI[0]] = lIIlIlllll[lIIllIIIlI[78]];
                    if (D.lIIIIIIlIIlll(Bank.getFirst((String[])stringArray4).getQuantity(), lIIllIIIlI[11])) {
                        D.af();
                        System.out.println(lIIlIlllll[lIIllIIIlI[79]]);
                        bt = lIIllIIIlI[1];
                        return;
                    }
                }
                String[] stringArray5 = new String[lIIllIIIlI[1]];
                stringArray5[D.lIIllIIIlI[0]] = lIIlIlllll[lIIllIIIlI[80]];
                if (D.lIIIIIIlIIllI(Bank.contains((String[])stringArray5) ? 1 : 0)) {
                    String[] stringArray6 = new String[lIIllIIIlI[1]];
                    stringArray6[D.lIIllIIIlI[0]] = lIIlIlllll[lIIllIIIlI[81]];
                    if (D.lIIIIIIlIIlll(Bank.getFirst((String[])stringArray6).getQuantity(), lIIllIIIlI[11])) {
                        D.af();
                        System.out.println(lIIlIlllll[lIIllIIIlI[82]]);
                        bt = lIIllIIIlI[1];
                        return;
                    }
                }
                int[] nArray = new int[lIIllIIIlI[19]];
                nArray[D.lIIllIIIlI[0]] = lIIllIIIlI[20];
                nArray[D.lIIllIIIlI[1]] = lIIllIIIlI[21];
                nArray[D.lIIllIIIlI[3]] = lIIllIIIlI[22];
                nArray[D.lIIllIIIlI[4]] = lIIllIIIlI[23];
                nArray[D.lIIllIIIlI[6]] = lIIllIIIlI[24];
                nArray[D.lIIllIIIlI[9]] = lIIllIIIlI[7];
                nArray[D.lIIllIIIlI[12]] = lIIllIIIlI[17];
                nArray[D.lIIllIIIlI[14]] = lIIllIIIlI[25];
                nArray[D.lIIllIIIlI[16]] = lIIllIIIlI[10];
                nArray[D.lIIllIIIlI[18]] = lIIllIIIlI[15];
                nArray[D.lIIllIIIlI[8]] = lIIllIIIlI[13];
                if (D.lIIIIIIlIlIII(e.b(nArray) ? 1 : 0)) {
                    D.af();
                    System.out.println(lIIlIlllll[lIIllIIIlI[83]]);
                    bt = lIIllIIIlI[1];
                    return;
                }
                while (D.lIIIIIIlIlIII(v.aX() ? 1 : 0)) {
                    v.aV();
                    Time.sleepTicks((int)lIIllIIIlI[1]);
                    0;
                    0;
                    if (1 > -1) continue;
                    return;
                }
                if (D.lIIIIIIlIlIII(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepTicks((int)lIIllIIIlI[6]);
                    0;
                }
                int[] nArray2 = new int[lIIllIIIlI[1]];
                nArray2[D.lIIllIIIlI[0]] = lIIllIIIlI[22];
                if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lIIllIIIlI[1]];
                    nArray3[D.lIIllIIIlI[0]] = lIIllIIIlI[22];
                    if (D.lIIIIIIlIIlll(Inventory.getCount((int[])nArray3), lIIllIIIlI[1])) {
                        Bank.withdraw((int)lIIllIIIlI[22], (int)lIIllIIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIllIIIlI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIllIIIlI[1]];
                            nArray[D.lIIllIIIlI[0]] = lIIllIIIlI[22];
                            if (D.lIIIIIIlIlIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIIllIIIlI[1];
                                0;
                                if (-1 >= (9 ^ 0x19 ^ (1 ^ 0x15))) {
                                    return ((0xAB ^ 0x92 ^ (0xC ^ 3)) & (0 + 120 - 63 + 72 ^ 30 + 5 - -134 + 14 ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIllIIIlI[0];
                            }
                            return bl;
                        }, (int)lIIllIIIlI[5]);
                        0;
                    }
                }
                int[] nArray4 = new int[lIIllIIIlI[1]];
                nArray4[D.lIIllIIIlI[0]] = lIIllIIIlI[23];
                if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    int[] nArray5 = new int[lIIllIIIlI[1]];
                    nArray5[D.lIIllIIIlI[0]] = lIIllIIIlI[23];
                    if (D.lIIIIIIlIIlll(Inventory.getCount((int[])nArray5), lIIllIIIlI[1])) {
                        Bank.withdraw((int)lIIllIIIlI[23], (int)lIIllIIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIllIIIlI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIllIIIlI[1]];
                            nArray[D.lIIllIIIlI[0]] = lIIllIIIlI[23];
                            if (D.lIIIIIIlIlIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIIllIIIlI[1];
                                0;
                                if ((0xC6 ^ 0xC2) <= ((0x20 ^ 8) & ~(0xEC ^ 0xC4))) {
                                    return ((0xAF ^ 0xB0) & ~(0x50 ^ 0x4F)) != 0;
                                }
                            } else {
                                bl = lIIllIIIlI[0];
                            }
                            return bl;
                        }, (int)lIIllIIIlI[5]);
                        0;
                    }
                }
                int[] nArray6 = new int[lIIllIIIlI[1]];
                nArray6[D.lIIllIIIlI[0]] = lIIllIIIlI[21];
                if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                    int[] nArray7 = new int[lIIllIIIlI[1]];
                    nArray7[D.lIIllIIIlI[0]] = lIIllIIIlI[21];
                    if (D.lIIIIIIlIIlll(Inventory.getCount((int[])nArray7), lIIllIIIlI[1])) {
                        Bank.withdraw((int)lIIllIIIlI[21], (int)lIIllIIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIllIIIlI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIllIIIlI[1]];
                            nArray[D.lIIllIIIlI[0]] = lIIllIIIlI[21];
                            if (D.lIIIIIIlIlIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIIllIIIlI[1];
                                0;
                                if (3 <= -1) {
                                    return ((0x2E ^ 0x23 ^ (0xA8 ^ 0x88)) & (3 ^ 0x5A ^ (0xD2 ^ 0xA6) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIllIIIlI[0];
                            }
                            return bl;
                        }, (int)lIIllIIIlI[5]);
                        0;
                    }
                }
                int[] nArray8 = new int[lIIllIIIlI[1]];
                nArray8[D.lIIllIIIlI[0]] = lIIllIIIlI[24];
                if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray8) ? 1 : 0)) {
                    int[] nArray9 = new int[lIIllIIIlI[1]];
                    nArray9[D.lIIllIIIlI[0]] = lIIllIIIlI[24];
                    if (D.lIIIIIIlIIlll(Inventory.getCount((int[])nArray9), lIIllIIIlI[1])) {
                        Bank.withdraw((int)lIIllIIIlI[24], (int)lIIllIIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIllIIIlI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIllIIIlI[1]];
                            nArray[D.lIIllIIIlI[0]] = lIIllIIIlI[24];
                            if (D.lIIIIIIlIlIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIIllIIIlI[1];
                                0;
                                if (((0x17 ^ 0x37 ^ (0xDD ^ 0xC7)) & (27 + 52 - 48 + 223 ^ 107 + 47 - 134 + 176 ^ -1)) > 0) {
                                    return ((0x97 ^ 0x99 ^ (0x49 ^ 2)) & (0xB ^ 0x77 ^ (0x99 ^ 0xA0) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIllIIIlI[0];
                            }
                            return bl;
                        }, (int)lIIllIIIlI[5]);
                        0;
                    }
                }
                int[] nArray10 = new int[lIIllIIIlI[1]];
                nArray10[D.lIIllIIIlI[0]] = lIIllIIIlI[7];
                if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    int[] nArray11 = new int[lIIllIIIlI[1]];
                    nArray11[D.lIIllIIIlI[0]] = lIIllIIIlI[7];
                    if (D.lIIIIIIlIIlll(Inventory.getCount((int[])nArray11), lIIllIIIlI[1])) {
                        Bank.withdraw((int)lIIllIIIlI[7], (int)lIIllIIIlI[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIllIIIlI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIllIIIlI[1]];
                            nArray[D.lIIllIIIlI[0]] = lIIllIIIlI[7];
                            if (D.lIIIIIIlIlIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIIllIIIlI[1];
                                0;
                                if (3 <= ((0xBB ^ 0x9E) & ~(0x1A ^ 0x3F))) {
                                    return ((0xA0 ^ 0xB3) & ~(0x10 ^ 3)) != 0;
                                }
                            } else {
                                bl = lIIllIIIlI[0];
                            }
                            return bl;
                        }, (int)lIIllIIIlI[5]);
                        0;
                    }
                }
                int[] nArray12 = new int[lIIllIIIlI[1]];
                nArray12[D.lIIllIIIlI[0]] = lIIllIIIlI[17];
                if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray12) ? 1 : 0)) {
                    int[] nArray13 = new int[lIIllIIIlI[1]];
                    nArray13[D.lIIllIIIlI[0]] = lIIllIIIlI[17];
                    if (D.lIIIIIIlIIlll(Inventory.getCount((int[])nArray13), lIIllIIIlI[1])) {
                        Bank.withdraw((int)lIIllIIIlI[17], (int)lIIllIIIlI[6], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIllIIIlI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIllIIIlI[1]];
                            nArray[D.lIIllIIIlI[0]] = lIIllIIIlI[17];
                            if (D.lIIIIIIlIlIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIIllIIIlI[1];
                                0;
                                if (-1 > 0) {
                                    return ((0x19 ^ 0x3D ^ (0xA6 ^ 0xA9)) & (0x94 ^ 0x9B ^ (0x65 ^ 0x41) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIllIIIlI[0];
                            }
                            return bl;
                        }, (int)lIIllIIIlI[5]);
                        0;
                    }
                }
                int[] nArray14 = new int[lIIllIIIlI[1]];
                nArray14[D.lIIllIIIlI[0]] = lIIllIIIlI[10];
                if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                    int[] nArray15 = new int[lIIllIIIlI[1]];
                    nArray15[D.lIIllIIIlI[0]] = lIIllIIIlI[10];
                    if (D.lIIIIIIlIIlll(Inventory.getCount((int[])nArray15), lIIllIIIlI[1])) {
                        Bank.withdraw((int)lIIllIIIlI[10], (int)lIIllIIIlI[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIllIIIlI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIllIIIlI[1]];
                            nArray[D.lIIllIIIlI[0]] = lIIllIIIlI[10];
                            if (D.lIIIIIIlIlIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIIllIIIlI[1];
                                0;
                                if (2 < -1) {
                                    return ((0x23 ^ 0x36) & ~(0x85 ^ 0x90)) != 0;
                                }
                            } else {
                                bl = lIIllIIIlI[0];
                            }
                            return bl;
                        }, (int)lIIllIIIlI[5]);
                        0;
                    }
                }
                int[] nArray16 = new int[lIIllIIIlI[1]];
                nArray16[D.lIIllIIIlI[0]] = lIIllIIIlI[15];
                if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIllIIIlI[1]];
                    nArray17[D.lIIllIIIlI[0]] = lIIllIIIlI[15];
                    if (D.lIIIIIIlIIlll(Inventory.getCount((int[])nArray17), lIIllIIIlI[1])) {
                        Bank.withdraw((int)lIIllIIIlI[15], (int)lIIllIIIlI[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIllIIIlI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIllIIIlI[1]];
                            nArray[D.lIIllIIIlI[0]] = lIIllIIIlI[15];
                            if (D.lIIIIIIlIlIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIIllIIIlI[1];
                                0;
                                if (1 <= 0) {
                                    return ((0x2D ^ 0x3C) & ~(0xD1 ^ 0xC0)) != 0;
                                }
                            } else {
                                bl = lIIllIIIlI[0];
                            }
                            return bl;
                        }, (int)lIIllIIIlI[5]);
                        0;
                    }
                }
                int[] nArray18 = new int[lIIllIIIlI[1]];
                nArray18[D.lIIllIIIlI[0]] = lIIllIIIlI[13];
                if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray18) ? 1 : 0)) {
                    int[] nArray19 = new int[lIIllIIIlI[1]];
                    nArray19[D.lIIllIIIlI[0]] = lIIllIIIlI[13];
                    if (D.lIIIIIIlIIlll(Inventory.getCount((int[])nArray19), lIIllIIIlI[1])) {
                        Bank.withdraw((int)lIIllIIIlI[13], (int)lIIllIIIlI[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIllIIIlI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIllIIIlI[1]];
                            nArray[D.lIIllIIIlI[0]] = lIIllIIIlI[13];
                            if (D.lIIIIIIlIlIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIIllIIIlI[1];
                                0;
                                if (3 != 3) {
                                    return ((0xCA ^ 0xBB ^ (0xE2 ^ 0xC2)) & (0xD8 ^ 0xA6 ^ (9 ^ 0x26) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIllIIIlI[0];
                            }
                            return bl;
                        }, (int)lIIllIIIlI[5]);
                        0;
                    }
                }
                int[] nArray20 = new int[lIIllIIIlI[1]];
                nArray20[D.lIIllIIIlI[0]] = lIIllIIIlI[27];
                if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[lIIllIIIlI[1]];
                    nArray21[D.lIIllIIIlI[0]] = lIIllIIIlI[27];
                    if (D.lIIIIIIlIlIII(Inventory.contains((int[])nArray21) ? 1 : 0)) {
                        Bank.withdraw((int)lIIllIIIlI[27], (int)lIIllIIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIllIIIlI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            int[] nArray = new int[lIIllIIIlI[1]];
                            nArray[D.lIIllIIIlI[0]] = lIIllIIIlI[27];
                            return Inventory.contains((int[])nArray);
                        }, (int)lIIllIIIlI[5]);
                        0;
                    }
                }
                int[] nArray22 = new int[lIIllIIIlI[1]];
                nArray22[D.lIIllIIIlI[0]] = lIIllIIIlI[25];
                if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray22) ? 1 : 0)) {
                    int[] nArray23 = new int[lIIllIIIlI[1]];
                    nArray23[D.lIIllIIIlI[0]] = lIIllIIIlI[25];
                    if (D.lIIIIIIlIIlll(Inventory.getCount((int[])nArray23), lIIllIIIlI[1])) {
                        Bank.withdrawAll((int)lIIllIIIlI[25], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIllIIIlI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIllIIIlI[1]];
                            nArray[D.lIIllIIIlI[0]] = lIIllIIIlI[25];
                            if (D.lIIIIIIlIlIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIIllIIIlI[1];
                                0;
                                if (null != null) {
                                    return ((0x31 ^ 0x68 ^ (0x6E ^ 0x24)) & (0x2C ^ 0xA ^ (0x6A ^ 0x5F) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIllIIIlI[0];
                            }
                            return bl;
                        }, (int)lIIllIIIlI[5]);
                        0;
                    }
                }
            }
        }
    }

    private static void af() {
        d llllllllllllllllllllllIIlIlIllIl;
        block37: {
            block36: {
                block35: {
                    block34: {
                        Object llllllllllllllllllllllIIlIlIlllI;
                        block33: {
                            block32: {
                                int[] nArray = new int[lIIllIIIlI[1]];
                                nArray[D.lIIllIIIlI[0]] = lIIllIIIlI[21];
                                if (D.lIIIIIIlIlIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    System.out.println(lIIlIlllll[lIIllIIIlI[36]]);
                                    d d2 = new d(lIIllIIIlI[21], lIIllIIIlI[1], lIIllIIIlI[37]);
                                    bv.add(d2);
                                    0;
                                }
                                int[] nArray2 = new int[lIIllIIIlI[1]];
                                nArray2[D.lIIllIIIlI[0]] = lIIllIIIlI[22];
                                if (D.lIIIIIIlIlIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    System.out.println(lIIlIlllll[lIIllIIIlI[38]]);
                                    llllllllllllllllllllllIIlIlIlllI = new d(lIIllIIIlI[22], lIIllIIIlI[1], lIIllIIIlI[39]);
                                    bv.add((d)llllllllllllllllllllllIIlIlIlllI);
                                    0;
                                }
                                int[] nArray3 = new int[lIIllIIIlI[1]];
                                nArray3[D.lIIllIIIlI[0]] = lIIllIIIlI[23];
                                if (D.lIIIIIIlIlIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                    System.out.println(lIIlIlllll[lIIllIIIlI[40]]);
                                    llllllllllllllllllllllIIlIlIlllI = new d(lIIllIIIlI[23], lIIllIIIlI[1], lIIllIIIlI[39]);
                                    bv.add((d)llllllllllllllllllllllIIlIlIlllI);
                                    0;
                                }
                                int[] nArray4 = new int[lIIllIIIlI[1]];
                                nArray4[D.lIIllIIIlI[0]] = lIIllIIIlI[24];
                                if (D.lIIIIIIlIlIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    System.out.println(lIIlIlllll[lIIllIIIlI[30]]);
                                    llllllllllllllllllllllIIlIlIlllI = new d(lIIllIIIlI[24], lIIllIIIlI[1], lIIllIIIlI[39]);
                                    bv.add((d)llllllllllllllllllllllIIlIlIlllI);
                                    0;
                                }
                                int[] nArray5 = new int[lIIllIIIlI[1]];
                                nArray5[D.lIIllIIIlI[0]] = lIIllIIIlI[25];
                                if (D.lIIIIIIlIlIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    System.out.println(lIIlIlllll[lIIllIIIlI[41]]);
                                    llllllllllllllllllllllIIlIlIlllI = new d(lIIllIIIlI[25], lIIllIIIlI[42], lIIllIIIlI[43]);
                                    bv.add((d)llllllllllllllllllllllIIlIlIlllI);
                                    0;
                                }
                                int[] nArray6 = new int[lIIllIIIlI[1]];
                                nArray6[D.lIIllIIIlI[0]] = lIIllIIIlI[25];
                                if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                    int[] nArray7 = new int[lIIllIIIlI[1]];
                                    nArray7[D.lIIllIIIlI[0]] = lIIllIIIlI[25];
                                    if (D.lIIIIIIlIIlll(Bank.getFirst((int[])nArray7).getQuantity(), lIIllIIIlI[30])) {
                                        System.out.println(lIIlIlllll[lIIllIIIlI[44]]);
                                        llllllllllllllllllllllIIlIlIlllI = new d(lIIllIIIlI[25], lIIllIIIlI[45], lIIllIIIlI[43]);
                                        bv.add((d)llllllllllllllllllllllIIlIlIlllI);
                                        0;
                                    }
                                }
                                int[] nArray8 = new int[lIIllIIIlI[1]];
                                nArray8[D.lIIllIIIlI[0]] = lIIllIIIlI[17];
                                if (D.lIIIIIIlIlIII(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                    System.out.println(lIIlIlllll[lIIllIIIlI[46]]);
                                    llllllllllllllllllllllIIlIlIlllI = new d(lIIllIIIlI[17], lIIllIIIlI[9], lIIllIIIlI[47]);
                                    bv.add((d)llllllllllllllllllllllIIlIlIlllI);
                                    0;
                                }
                                int[] nArray9 = new int[lIIllIIIlI[1]];
                                nArray9[D.lIIllIIIlI[0]] = lIIllIIIlI[17];
                                if (!D.lIIIIIIlIIllI(Bank.contains((int[])nArray9) ? 1 : 0)) break block32;
                                int[] nArray10 = new int[lIIllIIIlI[1]];
                                nArray10[D.lIIllIIIlI[0]] = lIIllIIIlI[17];
                                if (!D.lIIIIIIlIIllI(Bank.contains((int[])nArray10) ? 1 : 0)) break block33;
                                int[] nArray11 = new int[lIIllIIIlI[1]];
                                nArray11[D.lIIllIIIlI[0]] = lIIllIIIlI[17];
                                if (!D.lIIIIIIlIIlll(Bank.getFirst((int[])nArray11).getQuantity(), lIIllIIIlI[9])) break block33;
                            }
                            System.out.println(lIIlIlllll[lIIllIIIlI[48]]);
                            llllllllllllllllllllllIIlIlIlllI = new d(lIIllIIIlI[17], lIIllIIIlI[9], lIIllIIIlI[47]);
                            bv.add((d)llllllllllllllllllllllIIlIlIlllI);
                            0;
                        }
                        if (D.lIIIIIIlIlIII(Bank.contains((Predicate)(llllllllllllllllllllllIIlIlIlllI = item -> item.getName().toLowerCase().contains(lIIlIlllll[lIIllIIIlI[85]]))) ? 1 : 0)) {
                            System.out.println(lIIlIlllll[lIIllIIIlI[49]]);
                            llllllllllllllllllllllIIlIlIllIl = new d(lIIllIIIlI[50], lIIllIIIlI[38], lIIllIIIlI[51]);
                            bv.add(llllllllllllllllllllllIIlIlIllIl);
                            0;
                        }
                        int[] nArray = new int[lIIllIIIlI[1]];
                        nArray[D.lIIllIIIlI[0]] = lIIllIIIlI[20];
                        if (!D.lIIIIIIlIIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray12 = new int[lIIllIIIlI[1]];
                        nArray12[D.lIIllIIIlI[0]] = lIIllIIIlI[20];
                        if (!D.lIIIIIIlIIllI(Bank.contains((int[])nArray12) ? 1 : 0)) break block35;
                        int[] nArray13 = new int[lIIllIIIlI[1]];
                        nArray13[D.lIIllIIIlI[0]] = lIIllIIIlI[20];
                        if (!D.lIIIIIIlIIlll(Bank.getFirst((int[])nArray13).getQuantity(), lIIllIIIlI[30])) break block35;
                    }
                    System.out.println(lIIlIlllll[lIIllIIIlI[52]]);
                    llllllllllllllllllllllIIlIlIllIl = new d(lIIllIIIlI[20], lIIllIIIlI[45], lIIllIIIlI[53]);
                    bv.add(llllllllllllllllllllllIIlIlIllIl);
                    0;
                }
                int[] nArray = new int[lIIllIIIlI[1]];
                nArray[D.lIIllIIIlI[0]] = lIIllIIIlI[7];
                if (D.lIIIIIIlIlIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    System.out.println(lIIlIlllll[lIIllIIIlI[54]]);
                    llllllllllllllllllllllIIlIlIllIl = new d(lIIllIIIlI[7], lIIllIIIlI[30], lIIllIIIlI[53]);
                    bv.add(llllllllllllllllllllllIIlIlIllIl);
                    0;
                }
                int[] nArray14 = new int[lIIllIIIlI[1]];
                nArray14[D.lIIllIIIlI[0]] = lIIllIIIlI[7];
                if (!D.lIIIIIIlIIllI(Bank.contains((int[])nArray14) ? 1 : 0)) break block36;
                int[] nArray15 = new int[lIIllIIIlI[1]];
                nArray15[D.lIIllIIIlI[0]] = lIIllIIIlI[7];
                if (!D.lIIIIIIlIIllI(Bank.contains((int[])nArray15) ? 1 : 0)) break block37;
                int[] nArray16 = new int[lIIllIIIlI[1]];
                nArray16[D.lIIllIIIlI[0]] = lIIllIIIlI[7];
                if (!D.lIIIIIIlIIlll(Bank.getFirst((int[])nArray16).getQuantity(), lIIllIIIlI[30])) break block37;
            }
            System.out.println(lIIlIlllll[lIIllIIIlI[55]]);
            llllllllllllllllllllllIIlIlIllIl = new d(lIIllIIIlI[7], lIIllIIIlI[30], lIIllIIIlI[53]);
            bv.add(llllllllllllllllllllllIIlIlIllIl);
            0;
        }
        int[] nArray = new int[lIIllIIIlI[1]];
        nArray[D.lIIllIIIlI[0]] = lIIllIIIlI[27];
        if (D.lIIIIIIlIlIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            System.out.println(lIIlIlllll[lIIllIIIlI[56]]);
            llllllllllllllllllllllIIlIlIllIl = new d(lIIllIIIlI[27], lIIllIIIlI[9], i.bq);
            bv.add(llllllllllllllllllllllIIlIlIllIl);
            0;
        }
        int[] nArray17 = new int[lIIllIIIlI[1]];
        nArray17[D.lIIllIIIlI[0]] = lIIllIIIlI[10];
        if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray17) ? 1 : 0)) {
            int[] nArray18 = new int[lIIllIIIlI[1]];
            nArray18[D.lIIllIIIlI[0]] = lIIllIIIlI[10];
            if (D.lIIIIIIlIIlll(Bank.getFirst((int[])nArray18).getQuantity(), lIIllIIIlI[11])) {
                System.out.println(lIIlIlllll[lIIllIIIlI[57]]);
                llllllllllllllllllllllIIlIlIllIl = new d(lIIllIIIlI[10], lIIllIIIlI[58], lIIllIIIlI[14]);
                bv.add(llllllllllllllllllllllIIlIlIllIl);
                0;
            }
        }
        int[] nArray19 = new int[lIIllIIIlI[1]];
        nArray19[D.lIIllIIIlI[0]] = lIIllIIIlI[59];
        if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray19) ? 1 : 0)) {
            int[] nArray20 = new int[lIIllIIIlI[1]];
            nArray20[D.lIIllIIIlI[0]] = lIIllIIIlI[59];
            if (D.lIIIIIIlIIlll(Bank.getFirst((int[])nArray20).getQuantity(), lIIllIIIlI[11])) {
                System.out.println(lIIlIlllll[lIIllIIIlI[60]]);
                llllllllllllllllllllllIIlIlIllIl = new d(lIIllIIIlI[59], lIIllIIIlI[58], lIIllIIIlI[14]);
                bv.add(llllllllllllllllllllllIIlIlIllIl);
                0;
            }
        }
        int[] nArray21 = new int[lIIllIIIlI[1]];
        nArray21[D.lIIllIIIlI[0]] = lIIllIIIlI[15];
        if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray21) ? 1 : 0)) {
            int[] nArray22 = new int[lIIllIIIlI[1]];
            nArray22[D.lIIllIIIlI[0]] = lIIllIIIlI[15];
            if (D.lIIIIIIlIIlll(Bank.getFirst((int[])nArray22).getQuantity(), lIIllIIIlI[11])) {
                System.out.println(lIIlIlllll[lIIllIIIlI[61]]);
                llllllllllllllllllllllIIlIlIllIl = new d(lIIllIIIlI[15], lIIllIIIlI[58], lIIllIIIlI[14]);
                bv.add(llllllllllllllllllllllIIlIlIllIl);
                0;
            }
        }
        int[] nArray23 = new int[lIIllIIIlI[1]];
        nArray23[D.lIIllIIIlI[0]] = lIIllIIIlI[13];
        if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray23) ? 1 : 0)) {
            int[] nArray24 = new int[lIIllIIIlI[1]];
            nArray24[D.lIIllIIIlI[0]] = lIIllIIIlI[13];
            if (D.lIIIIIIlIIlll(Bank.getFirst((int[])nArray24).getQuantity(), lIIllIIIlI[11])) {
                System.out.println(lIIlIlllll[lIIllIIIlI[62]]);
                llllllllllllllllllllllIIlIlIllIl = new d(lIIllIIIlI[13], lIIllIIIlI[58], lIIllIIIlI[14]);
                bv.add(llllllllllllllllllllllIIlIlIllIl);
                0;
            }
        }
        int[] nArray25 = new int[lIIllIIIlI[1]];
        nArray25[D.lIIllIIIlI[0]] = lIIllIIIlI[59];
        if (D.lIIIIIIlIlIII(Bank.contains((int[])nArray25) ? 1 : 0)) {
            System.out.println(lIIlIlllll[lIIllIIIlI[63]]);
            llllllllllllllllllllllIIlIlIllIl = new d(lIIllIIIlI[59], lIIllIIIlI[58], lIIllIIIlI[14]);
            bv.add(llllllllllllllllllllllIIlIlIllIl);
            0;
        }
        int[] nArray26 = new int[lIIllIIIlI[1]];
        nArray26[D.lIIllIIIlI[0]] = lIIllIIIlI[15];
        if (D.lIIIIIIlIlIII(Bank.contains((int[])nArray26) ? 1 : 0)) {
            System.out.println(lIIlIlllll[lIIllIIIlI[64]]);
            llllllllllllllllllllllIIlIlIllIl = new d(lIIllIIIlI[15], lIIllIIIlI[58], lIIllIIIlI[14]);
            bv.add(llllllllllllllllllllllIIlIlIllIl);
            0;
        }
        int[] nArray27 = new int[lIIllIIIlI[1]];
        nArray27[D.lIIllIIIlI[0]] = lIIllIIIlI[13];
        if (D.lIIIIIIlIlIII(Bank.contains((int[])nArray27) ? 1 : 0)) {
            System.out.println(lIIlIlllll[lIIllIIIlI[65]]);
            llllllllllllllllllllllIIlIlIllIl = new d(lIIllIIIlI[13], lIIllIIIlI[58], lIIllIIIlI[14]);
            bv.add(llllllllllllllllllllllIIlIlIllIl);
            0;
        }
        int[] nArray28 = new int[lIIllIIIlI[1]];
        nArray28[D.lIIllIIIlI[0]] = lIIllIIIlI[10];
        if (D.lIIIIIIlIlIII(Bank.contains((int[])nArray28) ? 1 : 0)) {
            System.out.println(lIIlIlllll[lIIllIIIlI[66]]);
            llllllllllllllllllllllIIlIlIllIl = new d(lIIllIIIlI[10], lIIllIIIlI[58], lIIllIIIlI[14]);
            bv.add(llllllllllllllllllllllIIlIlIllIl);
            0;
        }
    }

    private static boolean lIIIIIIlIlIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIIIIlIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIIIIlIlIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIIIlIllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIIIIlIIllI(int n2) {
        return n2 != 0;
    }

    public static void bK() {
        if (D.lIIIIIIlIIllI(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIlllll[lIIllIIIlI[0]];
            b.a(bv);
            if (D.lIIIIIIlIIlll(bv.size(), lIIllIIIlI[1])) {
                System.out.println(lIIlIlllll[lIIllIIIlI[1]]);
                bt = lIIllIIIlI[0];
            }
        }
        if (D.lIIIIIIlIlIII(bt ? 1 : 0)) {
            if (D.lIIIIIIlIlIII(e.j(lIIllIIIlI[2]))) {
                BankLocation llllllllllllllllllllllIIlIllIIIl;
                if (D.lIIIIIIlIlIII(D.bo() ? 1 : 0)) {
                    llllllllllllllllllllllIIlIllIIIl = BankLocation.getNearest();
                    if (D.lIIIIIIlIlIIl(llllllllllllllllllllllIIlIllIIIl) && D.lIIIIIIlIlIII(llllllllllllllllllllllIIlIllIIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlIlllll[lIIllIIIlI[3]];
                        a.a(llllllllllllllllllllllIIlIllIIIl);
                    }
                    if (D.lIIIIIIlIlIIl(llllllllllllllllllllllIIlIllIIIl) && D.lIIIIIIlIIllI(llllllllllllllllllllllIIlIllIIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (D.lIIIIIIlIlIII(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderRogues.c = lIIlIlllll[lIIllIIIlI[4]];
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIllIIIlI[5]);
                            0;
                        }
                        if (D.lIIIIIIlIIllI(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderRogues.c = lIIlIlllll[lIIllIIIlI[6]];
                            if (D.lIIIIIIlIlIlI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIllIIIlI[4]);
                                0;
                            }
                            if (D.lIIIIIIlIlIlI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIllIIIlI[3]);
                                0;
                            }
                            int[] nArray = new int[lIIllIIIlI[1]];
                            nArray[D.lIIllIIIlI[0]] = lIIllIIIlI[7];
                            if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIIllIIIlI[1]];
                                nArray2[D.lIIllIIIlI[0]] = lIIllIIIlI[7];
                                if (D.lIIIIIIlIIlll(Bank.getFirst((int[])nArray2).getQuantity(), lIIllIIIlI[8])) {
                                    D.af();
                                    System.out.println(lIIlIlllll[lIIllIIIlI[9]]);
                                    bt = lIIllIIIlI[1];
                                    return;
                                }
                            }
                            int[] nArray3 = new int[lIIllIIIlI[1]];
                            nArray3[D.lIIllIIIlI[0]] = lIIllIIIlI[10];
                            if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIIllIIIlI[1]];
                                nArray4[D.lIIllIIIlI[0]] = lIIllIIIlI[10];
                                if (D.lIIIIIIlIIlll(Bank.getFirst((int[])nArray4).getQuantity(), lIIllIIIlI[11])) {
                                    D.af();
                                    System.out.println(lIIlIlllll[lIIllIIIlI[12]]);
                                    bt = lIIllIIIlI[1];
                                    return;
                                }
                            }
                            int[] nArray5 = new int[lIIllIIIlI[1]];
                            nArray5[D.lIIllIIIlI[0]] = lIIllIIIlI[13];
                            if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIIllIIIlI[1]];
                                nArray6[D.lIIllIIIlI[0]] = lIIllIIIlI[13];
                                if (D.lIIIIIIlIIlll(Bank.getFirst((int[])nArray6).getQuantity(), lIIllIIIlI[11])) {
                                    D.af();
                                    System.out.println(lIIlIlllll[lIIllIIIlI[14]]);
                                    bt = lIIllIIIlI[1];
                                    return;
                                }
                            }
                            int[] nArray7 = new int[lIIllIIIlI[1]];
                            nArray7[D.lIIllIIIlI[0]] = lIIllIIIlI[15];
                            if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIIllIIIlI[1]];
                                nArray8[D.lIIllIIIlI[0]] = lIIllIIIlI[15];
                                if (D.lIIIIIIlIIlll(Bank.getFirst((int[])nArray8).getQuantity(), lIIllIIIlI[11])) {
                                    D.af();
                                    System.out.println(lIIlIlllll[lIIllIIIlI[16]]);
                                    bt = lIIllIIIlI[1];
                                    return;
                                }
                            }
                            int[] nArray9 = new int[lIIllIIIlI[1]];
                            nArray9[D.lIIllIIIlI[0]] = lIIllIIIlI[17];
                            if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIIllIIIlI[1]];
                                nArray10[D.lIIllIIIlI[0]] = lIIllIIIlI[17];
                                if (D.lIIIIIIlIIlll(Bank.getFirst((int[])nArray10).getQuantity(), lIIllIIIlI[9])) {
                                    D.af();
                                    System.out.println(lIIlIlllll[lIIllIIIlI[18]]);
                                    bt = lIIllIIIlI[1];
                                    return;
                                }
                            }
                            int[] nArray11 = new int[lIIllIIIlI[19]];
                            nArray11[D.lIIllIIIlI[0]] = lIIllIIIlI[20];
                            nArray11[D.lIIllIIIlI[1]] = lIIllIIIlI[21];
                            nArray11[D.lIIllIIIlI[3]] = lIIllIIIlI[22];
                            nArray11[D.lIIllIIIlI[4]] = lIIllIIIlI[23];
                            nArray11[D.lIIllIIIlI[6]] = lIIllIIIlI[24];
                            nArray11[D.lIIllIIIlI[9]] = lIIllIIIlI[7];
                            nArray11[D.lIIllIIIlI[12]] = lIIllIIIlI[17];
                            nArray11[D.lIIllIIIlI[14]] = lIIllIIIlI[25];
                            nArray11[D.lIIllIIIlI[16]] = lIIllIIIlI[10];
                            nArray11[D.lIIllIIIlI[18]] = lIIllIIIlI[15];
                            nArray11[D.lIIllIIIlI[8]] = lIIllIIIlI[13];
                            if (D.lIIIIIIlIlIII(e.b(nArray11) ? 1 : 0)) {
                                D.af();
                                System.out.println(lIIlIlllll[lIIllIIIlI[8]]);
                                bt = lIIllIIIlI[1];
                                return;
                            }
                            while (D.lIIIIIIlIlIII(v.aX() ? 1 : 0)) {
                                v.aV();
                                Time.sleepTicks((int)lIIllIIIlI[1]);
                                0;
                                0;
                                if (null == null) continue;
                                return;
                            }
                            if (D.lIIIIIIlIlIII(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepTicks((int)lIIllIIIlI[6]);
                                0;
                            }
                            int[] nArray12 = new int[lIIllIIIlI[1]];
                            nArray12[D.lIIllIIIlI[0]] = lIIllIIIlI[22];
                            if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                int[] nArray13 = new int[lIIllIIIlI[1]];
                                nArray13[D.lIIllIIIlI[0]] = lIIllIIIlI[22];
                                if (D.lIIIIIIlIIlll(Inventory.getCount((int[])nArray13), lIIllIIIlI[1])) {
                                    Bank.withdraw((int)lIIllIIIlI[22], (int)lIIllIIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIllIIIlI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIllIIIlI[1]];
                                        nArray[D.lIIllIIIlI[0]] = lIIllIIIlI[22];
                                        if (D.lIIIIIIlIlIlI(Inventory.getCount((int[])nArray))) {
                                            bl = lIIllIIIlI[1];
                                            0;
                                            if (-(0xB3 ^ 0xAD ^ (0x28 ^ 0x33)) >= 0) {
                                                return ((0x7F ^ 0x77 ^ (0xCB ^ 0x82)) & (0xA5 ^ 0x85 ^ (0xE9 ^ 0x88) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIllIIIlI[0];
                                        }
                                        return bl;
                                    }, (int)lIIllIIIlI[5]);
                                    0;
                                }
                            }
                            int[] nArray14 = new int[lIIllIIIlI[1]];
                            nArray14[D.lIIllIIIlI[0]] = lIIllIIIlI[23];
                            if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                int[] nArray15 = new int[lIIllIIIlI[1]];
                                nArray15[D.lIIllIIIlI[0]] = lIIllIIIlI[23];
                                if (D.lIIIIIIlIIlll(Inventory.getCount((int[])nArray15), lIIllIIIlI[1])) {
                                    Bank.withdraw((int)lIIllIIIlI[23], (int)lIIllIIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIllIIIlI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIllIIIlI[1]];
                                        nArray[D.lIIllIIIlI[0]] = lIIllIIIlI[23];
                                        if (D.lIIIIIIlIlIlI(Inventory.getCount((int[])nArray))) {
                                            bl = lIIllIIIlI[1];
                                            0;
                                            if (3 == 0) {
                                                return ((0x10 ^ 0x40) & ~(0x18 ^ 0x48)) != 0;
                                            }
                                        } else {
                                            bl = lIIllIIIlI[0];
                                        }
                                        return bl;
                                    }, (int)lIIllIIIlI[5]);
                                    0;
                                }
                            }
                            int[] nArray16 = new int[lIIllIIIlI[1]];
                            nArray16[D.lIIllIIIlI[0]] = lIIllIIIlI[21];
                            if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray16) ? 1 : 0)) {
                                int[] nArray17 = new int[lIIllIIIlI[1]];
                                nArray17[D.lIIllIIIlI[0]] = lIIllIIIlI[21];
                                if (D.lIIIIIIlIIlll(Inventory.getCount((int[])nArray17), lIIllIIIlI[1])) {
                                    Bank.withdraw((int)lIIllIIIlI[21], (int)lIIllIIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIllIIIlI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIllIIIlI[1]];
                                        nArray[D.lIIllIIIlI[0]] = lIIllIIIlI[21];
                                        if (D.lIIIIIIlIlIlI(Inventory.getCount((int[])nArray))) {
                                            bl = lIIllIIIlI[1];
                                            0;
                                            if (null != null) {
                                                return ((75 + 68 - 106 + 102 ^ 104 + 159 - 213 + 130) & (0x8E ^ 0xB4 ^ (0x7F ^ 0x7A) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIllIIIlI[0];
                                        }
                                        return bl;
                                    }, (int)lIIllIIIlI[5]);
                                    0;
                                }
                            }
                            int[] nArray18 = new int[lIIllIIIlI[1]];
                            nArray18[D.lIIllIIIlI[0]] = lIIllIIIlI[24];
                            if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray18) ? 1 : 0)) {
                                int[] nArray19 = new int[lIIllIIIlI[1]];
                                nArray19[D.lIIllIIIlI[0]] = lIIllIIIlI[24];
                                if (D.lIIIIIIlIIlll(Inventory.getCount((int[])nArray19), lIIllIIIlI[1])) {
                                    Bank.withdraw((int)lIIllIIIlI[24], (int)lIIllIIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIllIIIlI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIllIIIlI[1]];
                                        nArray[D.lIIllIIIlI[0]] = lIIllIIIlI[24];
                                        if (D.lIIIIIIlIlIlI(Inventory.getCount((int[])nArray))) {
                                            bl = lIIllIIIlI[1];
                                            0;
                                            if ((0x5B ^ 0x5F) != (0xB2 ^ 0xB6)) {
                                                return ((0xBB ^ 0x98) & ~(0xA3 ^ 0x80)) != 0;
                                            }
                                        } else {
                                            bl = lIIllIIIlI[0];
                                        }
                                        return bl;
                                    }, (int)lIIllIIIlI[5]);
                                    0;
                                }
                            }
                            int[] nArray20 = new int[lIIllIIIlI[1]];
                            nArray20[D.lIIllIIIlI[0]] = lIIllIIIlI[7];
                            if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray20) ? 1 : 0)) {
                                int[] nArray21 = new int[lIIllIIIlI[1]];
                                nArray21[D.lIIllIIIlI[0]] = lIIllIIIlI[7];
                                if (D.lIIIIIIlIIlll(Inventory.getCount((int[])nArray21), lIIllIIIlI[1])) {
                                    Bank.withdraw((int)lIIllIIIlI[7], (int)lIIllIIIlI[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIllIIIlI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIllIIIlI[1]];
                                        nArray[D.lIIllIIIlI[0]] = lIIllIIIlI[7];
                                        if (D.lIIIIIIlIlIlI(Inventory.getCount((int[])nArray))) {
                                            bl = lIIllIIIlI[1];
                                            0;
                                            if (3 == ((136 + 112 - 154 + 63 ^ 137 + 104 - 104 + 26) & (0x98 ^ 0x9F ^ (0x7A ^ 0x43) ^ -1))) {
                                                return ((145 + 85 - 197 + 215 ^ 144 + 48 - 66 + 53) & (191 + 104 - 242 + 193 ^ 102 + 107 - 81 + 61 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIllIIIlI[0];
                                        }
                                        return bl;
                                    }, (int)lIIllIIIlI[5]);
                                    0;
                                }
                            }
                            int[] nArray22 = new int[lIIllIIIlI[1]];
                            nArray22[D.lIIllIIIlI[0]] = lIIllIIIlI[17];
                            if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray22) ? 1 : 0)) {
                                int[] nArray23 = new int[lIIllIIIlI[1]];
                                nArray23[D.lIIllIIIlI[0]] = lIIllIIIlI[17];
                                if (D.lIIIIIIlIIlll(Inventory.getCount((int[])nArray23), lIIllIIIlI[1])) {
                                    Bank.withdraw((int)lIIllIIIlI[17], (int)lIIllIIIlI[6], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIllIIIlI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIllIIIlI[1]];
                                        nArray[D.lIIllIIIlI[0]] = lIIllIIIlI[17];
                                        if (D.lIIIIIIlIlIlI(Inventory.getCount((int[])nArray))) {
                                            bl = lIIllIIIlI[1];
                                            0;
                                            if (3 != 3) {
                                                return ((81 + 229 - 132 + 72 ^ 165 + 117 - 123 + 13) & (0x6D ^ 0x61 ^ (0x14 ^ 0x4E) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIllIIIlI[0];
                                        }
                                        return bl;
                                    }, (int)lIIllIIIlI[5]);
                                    0;
                                }
                            }
                            int[] nArray24 = new int[lIIllIIIlI[1]];
                            nArray24[D.lIIllIIIlI[0]] = lIIllIIIlI[10];
                            if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray24) ? 1 : 0)) {
                                int[] nArray25 = new int[lIIllIIIlI[1]];
                                nArray25[D.lIIllIIIlI[0]] = lIIllIIIlI[10];
                                if (D.lIIIIIIlIIlll(Inventory.getCount((int[])nArray25), lIIllIIIlI[1])) {
                                    Bank.withdraw((int)lIIllIIIlI[10], (int)lIIllIIIlI[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIllIIIlI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIllIIIlI[1]];
                                        nArray[D.lIIllIIIlI[0]] = lIIllIIIlI[10];
                                        if (D.lIIIIIIlIlIlI(Inventory.getCount((int[])nArray))) {
                                            bl = lIIllIIIlI[1];
                                            0;
                                            if (1 <= ((0xBB ^ 0x80) & ~(0x2B ^ 0x10))) {
                                                return ((0x6C ^ 0xE) & ~(0xFF ^ 0x9D)) != 0;
                                            }
                                        } else {
                                            bl = lIIllIIIlI[0];
                                        }
                                        return bl;
                                    }, (int)lIIllIIIlI[5]);
                                    0;
                                }
                            }
                            int[] nArray26 = new int[lIIllIIIlI[1]];
                            nArray26[D.lIIllIIIlI[0]] = lIIllIIIlI[15];
                            if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray26) ? 1 : 0)) {
                                int[] nArray27 = new int[lIIllIIIlI[1]];
                                nArray27[D.lIIllIIIlI[0]] = lIIllIIIlI[15];
                                if (D.lIIIIIIlIIlll(Inventory.getCount((int[])nArray27), lIIllIIIlI[1])) {
                                    Bank.withdraw((int)lIIllIIIlI[15], (int)lIIllIIIlI[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIllIIIlI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIllIIIlI[1]];
                                        nArray[D.lIIllIIIlI[0]] = lIIllIIIlI[15];
                                        if (D.lIIIIIIlIlIlI(Inventory.getCount((int[])nArray))) {
                                            bl = lIIllIIIlI[1];
                                            0;
                                            if ((0x4D ^ 0x27 ^ (0x29 ^ 0x47)) < 0) {
                                                return ((142 + 151 - 214 + 99 ^ 91 + 43 - 21 + 61) & (95 + 2 - 37 + 161 ^ 12 + 114 - 93 + 160 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIllIIIlI[0];
                                        }
                                        return bl;
                                    }, (int)lIIllIIIlI[5]);
                                    0;
                                }
                            }
                            int[] nArray28 = new int[lIIllIIIlI[1]];
                            nArray28[D.lIIllIIIlI[0]] = lIIllIIIlI[13];
                            if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray28) ? 1 : 0)) {
                                int[] nArray29 = new int[lIIllIIIlI[1]];
                                nArray29[D.lIIllIIIlI[0]] = lIIllIIIlI[13];
                                if (D.lIIIIIIlIIlll(Inventory.getCount((int[])nArray29), lIIllIIIlI[1])) {
                                    Bank.withdraw((int)lIIllIIIlI[13], (int)lIIllIIIlI[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIllIIIlI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIllIIIlI[1]];
                                        nArray[D.lIIllIIIlI[0]] = lIIllIIIlI[13];
                                        if (D.lIIIIIIlIlIlI(Inventory.getCount((int[])nArray))) {
                                            bl = lIIllIIIlI[1];
                                            0;
                                            if (-(0x7C ^ 0x78) > 0) {
                                                return ((0x88 ^ 0xB4) & ~(5 ^ 0x39)) != 0;
                                            }
                                        } else {
                                            bl = lIIllIIIlI[0];
                                        }
                                        return bl;
                                    }, (int)lIIllIIIlI[5]);
                                    0;
                                }
                            }
                            int[] nArray30 = new int[lIIllIIIlI[1]];
                            nArray30[D.lIIllIIIlI[0]] = lIIllIIIlI[27];
                            if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray30) ? 1 : 0)) {
                                int[] nArray31 = new int[lIIllIIIlI[1]];
                                nArray31[D.lIIllIIIlI[0]] = lIIllIIIlI[27];
                                if (D.lIIIIIIlIlIII(Inventory.contains((int[])nArray31) ? 1 : 0)) {
                                    Bank.withdraw((int)lIIllIIIlI[27], (int)lIIllIIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIllIIIlI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[lIIllIIIlI[1]];
                                        nArray[D.lIIllIIIlI[0]] = lIIllIIIlI[27];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)lIIllIIIlI[5]);
                                    0;
                                }
                            }
                            int[] nArray32 = new int[lIIllIIIlI[1]];
                            nArray32[D.lIIllIIIlI[0]] = lIIllIIIlI[25];
                            if (D.lIIIIIIlIIllI(Bank.contains((int[])nArray32) ? 1 : 0)) {
                                int[] nArray33 = new int[lIIllIIIlI[1]];
                                nArray33[D.lIIllIIIlI[0]] = lIIllIIIlI[25];
                                if (D.lIIIIIIlIIlll(Inventory.getCount((int[])nArray33), lIIllIIIlI[1])) {
                                    Bank.withdrawAll((int)lIIllIIIlI[25], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIllIIIlI[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIllIIIlI[1]];
                                        nArray[D.lIIllIIIlI[0]] = lIIllIIIlI[25];
                                        if (D.lIIIIIIlIlIlI(Inventory.getCount((int[])nArray))) {
                                            bl = lIIllIIIlI[1];
                                            0;
                                            if (2 <= 0) {
                                                return ((140 + 44 - 118 + 85 ^ 173 + 177 - 301 + 145) & (224 + 233 - 407 + 188 ^ 94 + 177 - 184 + 100 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIllIIIlI[0];
                                        }
                                        return bl;
                                    }, (int)lIIllIIIlI[5]);
                                    0;
                                }
                            }
                        }
                    }
                }
                if (D.lIIIIIIlIlIll(Players.getLocal().getWorldLocation().distanceTo(hY), lIIllIIIlI[6]) && D.lIIIIIIlIllII(Players.getLocal().getWorldLocation().getPlane(), lIIllIIIlI[3]) && D.lIIIIIIlIIllI(D.bo() ? 1 : 0)) {
                    if (D.lIIIIIIlIIllI(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        Time.sleepTicks((int)lIIllIIIlI[6]);
                        0;
                    }
                    AccBuilderRogues.c = lIIlIlllll[lIIllIIIlI[19]];
                    if (D.lIIIIIIlIlIII(Bank.isOpen() ? 1 : 0)) {
                        if (D.lIIIIIIlIIlll(bT, lIIllIIIlI[1])) {
                            e.v();
                            bT += lIIllIIIlI[1];
                        }
                        if (D.lIIIIIIlIIllI((llllllllllllllllllllllIIlIllIIIl = new WorldArea(lIIllIIIlI[28], lIIllIIIlI[29], lIIllIIIlI[30], lIIllIIIlI[31], lIIllIIIlI[3])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray = new String[lIIllIIIlI[1]];
                            stringArray[D.lIIllIIIlI[0]] = lIIlIlllll[lIIllIIIlI[32]];
                            TileObjects.getNearest((String[])stringArray).interact(lIIlIlllll[lIIllIIIlI[33]]);
                            Time.sleepTicks((int)e.c(lIIllIIIlI[12], lIIllIIIlI[16]));
                            0;
                        }
                        Movement.walkTo((WorldPoint)hY);
                        0;
                        Time.sleepTicks((int)lIIllIIIlI[3]);
                        0;
                    }
                }
                if (D.lIIIIIIlIllIl(Players.getLocal().getWorldLocation().distanceTo(hY), lIIllIIIlI[12])) {
                    AccBuilderRogues.c = lIIlIlllll[lIIllIIIlI[34]];
                    ck = lIIllIIIlI[0];
                    g.a(hK, gz);
                    if (D.lIIIIIIlIIllI(g.K() ? 1 : 0)) {
                        g.a(gz);
                    }
                }
            }
            if (D.lIIIIIIlIlIlI(e.j(lIIllIIIlI[2])) && D.lIIIIIIlIIlll(e.j(lIIllIIIlI[2]), lIIllIIIlI[3])) {
                if (D.lIIIIIIlIlIII(D.bo() ? 1 : 0)) {
                    D.bL();
                }
                if (D.lIIIIIIlIIllI(D.bo() ? 1 : 0)) {
                    if (D.lIIIIIIlIlIll(Players.getLocal().getWorldLocation().distanceTo(hY), lIIllIIIlI[12])) {
                        AccBuilderRogues.c = lIIlIlllll[lIIllIIIlI[31]];
                        if (D.lIIIIIIlIIllI(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)hY);
                        0;
                        Time.sleepTicks((int)lIIllIIIlI[1]);
                        0;
                    }
                    if (D.lIIIIIIlIllIl(Players.getLocal().getWorldLocation().distanceTo(hY), lIIllIIIlI[12])) {
                        AccBuilderRogues.c = lIIlIlllll[lIIllIIIlI[35]];
                        if (D.lIIIIIIlIIlll(ck, lIIllIIIlI[1])) {
                            U.mO += lIIllIIIlI[1];
                            U.o(AccBuilderRogues.m);
                            ck += lIIllIIIlI[1];
                            U.mO = lIIllIIIlI[0];
                            cl = lIIllIIIlI[0];
                        }
                        g.a(hK, gz);
                        if (D.lIIIIIIlIIllI(g.K() ? 1 : 0)) {
                            g.a(gz);
                        }
                    }
                }
            }
            System.out.println("Setting: " + e.j(lIIllIIIlI[2]));
            g.a(new String[lIIllIIIlI[0]]);
        }
    }

    private static void lIIIIIIlIIlII() {
        lIIlIlllll = new String[lIIllIIIlI[96]];
        D.lIIlIlllll[D.lIIllIIIlI[0]] = D."Buying items";
        D.lIIlIlllll[D.lIIllIIIlI[1]] = D."Finished buying items, switching back to questing";
        D.lIIlIlllll[D.lIIllIIIlI[3]] = D."Navigating to bank";
        D.lIIlIlllll[D.lIIllIIIlI[4]] = D."Opening bank";
        D.lIIlIlllll[D.lIIllIIIlI[6]] = D."Handling banking";
        D.lIIlIlllll[D.lIIllIIIlI[9]] = D."We are missing supplies, switching to BUYING";
        D.lIIlIlllll[D.lIIllIIIlI[12]] = D."We are missing supplies, switching to BUYING";
        D.lIIlIlllll[D.lIIllIIIlI[14]] = D."We are missing supplies, switching to BUYING";
        D.lIIlIlllll[D.lIIllIIIlI[16]] = D."We are missing supplies, switching to BUYING";
        D.lIIlIlllll[D.lIIllIIIlI[18]] = D."We are missing supplies, switching to BUYING";
        D.lIIlIlllll[D.lIIllIIIlI[8]] = D."We are missing supplies, switching to BUYING";
        D.lIIlIlllll[D.lIIllIIIlI[19]] = D."Walking to imp start";
        D.lIIlIlllll[D.lIIllIIIlI[32]] = D."Magic Portal";
        D.lIIlIlllll[D.lIIllIIIlI[33]] = D."Enter";
        D.lIIlIlllll[D.lIIllIIIlI[34]] = D."Handling quest";
        D.lIIlIlllll[D.lIIllIIIlI[31]] = D."Nav to start";
        D.lIIlIlllll[D.lIIllIIIlI[35]] = D."Finishing quest";
        D.lIIlIlllll[D.lIIllIIIlI[36]] = D."Adding red bead to buy list";
        D.lIIlIlllll[D.lIIllIIIlI[38]] = D."Adding yellow bead to buy list";
        D.lIIlIlllll[D.lIIllIIIlI[40]] = D."Adding black bead to buy list";
        D.lIIlIlllll[D.lIIllIIIlI[30]] = D."Adding white bead to buy list";
        D.lIIlIlllll[D.lIIllIIIlI[41]] = D."Adding lobster to buy list";
        D.lIIlIlllll[D.lIIllIIIlI[44]] = D."Adding lobster to buy list";
        D.lIIlIlllll[D.lIIllIIIlI[46]] = D."Adding cheese to buy list";
        D.lIIlIlllll[D.lIIllIIIlI[48]] = D."Adding cheese to buy list";
        D.lIIlIlllll[D.lIIllIIIlI[49]] = D."Adding wealth to buy list";
        D.lIIlIlllll[D.lIIllIIIlI[52]] = D."Adding varrock tabs to buy list";
        D.lIIlIlllll[D.lIIllIIIlI[54]] = D."Adding fally tabs to buy list";
        D.lIIlIlllll[D.lIIllIIIlI[55]] = D."Adding fally tabs to buy list";
        D.lIIlIlllll[D.lIIllIIIlI[56]] = D."Adding staminas to buy list";
        D.lIIlIlllll[D.lIIllIIIlI[57]] = D."Adding mind runes to buy list";
        D.lIIlIlllll[D.lIIllIIIlI[60]] = D."Adding air runes to buy list";
        D.lIIlIlllll[D.lIIllIIIlI[61]] = D."Adding water runes to buy list";
        D.lIIlIlllll[D.lIIllIIIlI[62]] = D."Adding earth runes to buy list";
        D.lIIlIlllll[D.lIIllIIIlI[63]] = D."Adding air runes to buy list";
        D.lIIlIlllll[D.lIIllIIIlI[64]] = D."Adding water runes to buy list";
        D.lIIlIlllll[D.lIIllIIIlI[65]] = D."Adding earth runes to buy list";
        D.lIIlIlllll[D.lIIllIIIlI[66]] = D."Adding mind runes to buy list";
        D.lIIlIlllll[D.lIIllIIIlI[67]] = D."Red bead";
        D.lIIlIlllll[D.lIIllIIIlI[68]] = D."Yellow bead";
        D.lIIlIlllll[D.lIIllIIIlI[45]] = D."Black bead";
        D.lIIlIlllll[D.lIIllIIIlI[69]] = D."White bead";
        D.lIIlIlllll[D.lIIllIIIlI[70]] = D."Cheese";
        D.lIIlIlllll[D.lIIllIIIlI[71]] = D."Navigating to bank";
        D.lIIlIlllll[D.lIIllIIIlI[72]] = D."Opening bank";
        D.lIIlIlllll[D.lIIllIIIlI[73]] = D."Handling banking";
        D.lIIlIlllll[D.lIIllIIIlI[74]] = D."Mind rune";
        D.lIIlIlllll[D.lIIllIIIlI[75]] = D."Mind rune";
        D.lIIlIlllll[D.lIIllIIIlI[76]] = D."We are missing supplies, switching to BUYING";
        D.lIIlIlllll[D.lIIllIIIlI[77]] = D."Earth rune";
        D.lIIlIlllll[D.lIIllIIIlI[78]] = D."Earth rune";
        D.lIIlIlllll[D.lIIllIIIlI[79]] = D."We are missing supplies, switching to BUYING";
        D.lIIlIlllll[D.lIIllIIIlI[80]] = D."Water rune";
        D.lIIlIlllll[D.lIIllIIIlI[81]] = D."Water rune";
        D.lIIlIlllll[D.lIIllIIIlI[82]] = D."We are missing supplies, switching to BUYING";
        D.lIIlIlllll[D.lIIllIIIlI[83]] = D."We are missing supplies, switching to BUYING";
        D.lIIlIlllll[D.lIIllIIIlI[84]] = D."Imp Catcher quest";
        D.lIIlIlllll[D.lIIllIIIlI[85]] = D."ring of wealth (";
        D.lIIlIlllll[D.lIIllIIIlI[89]] = D."Wizard Mizgog";
        D.lIIlIlllll[D.lIIllIIIlI[90]] = D."Give me a quest please.";
        D.lIIlIlllll[D.lIIllIIIlI[91]] = D."I'll try.";
        D.lIIlIlllll[D.lIIllIIIlI[92]] = D."Actually, I know where to find this stuff.";
        D.lIIlIlllll[D.lIIllIIIlI[93]] = D."Yes.";
        D.lIIlIlllll[D.lIIllIIIlI[94]] = D."What's the matter?";
        D.lIIlIlllll[D.lIIllIIIlI[95]] = D."Ok, I'll see what I can do.";
    }

    private static boolean lIIIIIIlIlllI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public int T() {
        try {
            D.bK();
            0;
        }
        catch (Exception llllllllllllllllllllllIIlIlIlIIl) {
            llllllllllllllllllllllIIlIlIlIIl.printStackTrace();
        }
        if (2 <= 0) {
            return (0x92 ^ 0x85 ^ (0xB6 ^ 0xBE)) & (35 + 30 - -62 + 44 ^ 160 + 44 - 132 + 108 ^ -1);
        }
        return lIIllIIIlI[42];
    }
}

