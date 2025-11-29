/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.ac_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.i;
import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

public class L_Unknown
implements S {
    static /* synthetic */ int bS;
    private static /* synthetic */ int[] lllllIIIII;
    public static /* synthetic */ String[] bQ;
    static /* synthetic */ boolean cl;
    public static /* synthetic */ boolean bs;
    public static final /* synthetic */ WorldPoint hZ;
    static /* synthetic */ int ck;
    public static final /* synthetic */ WorldPoint ib;
    public static final /* synthetic */ WorldPoint hY;
    public static final /* synthetic */ WorldPoint ia;
    public static /* synthetic */ List<d> bu;
    private static /* synthetic */ String[] llllIlllll;

    private static void llIlIIIlllIIl() {
        lllllIIIII = new int[76];
        L.lllllIIIII[0] = (16 + 80 - 85 + 146 ^ 0 + 14 - -73 + 109) & (0xE0 ^ 0x8D ^ (0xB7 ^ 0x83) ^ -1);
        L.lllllIIIII[1] = 1;
        L.lllllIIIII[2] = 0x33 ^ 1;
        L.lllllIIIII[3] = 2;
        L.lllllIIIII[4] = -(0xFFFFBEFD & 0x490F) & (0xFFFFABFF & 0x5FEF);
        L.lllllIIIII[5] = 122 + 132 - 128 + 18;
        L.lllllIIIII[6] = 3;
        L.lllllIIIII[7] = 0x11 ^ 0 ^ (0x53 ^ 0x46);
        L.lllllIIIII[8] = 0xFFFFD3EA & 0x3F9D;
        L.lllllIIIII[9] = -(0xFFFFFDA7 & 0x565B) & (0xFFFFD7F7 & 0x7EFB);
        L.lllllIIIII[10] = 0x51 ^ 0x54;
        L.lllllIIIII[11] = -(0xFFFFFB9D & 0x4473) & (0xFFFFDFFF & 0x7F57);
        L.lllllIIIII[12] = 0x47 ^ 0x40 ^ (0xBF ^ 0xB2);
        L.lllllIIIII[13] = 0x60 ^ 0x68;
        L.lllllIIIII[14] = 0x95 ^ 0x93;
        L.lllllIIIII[15] = 6 ^ 0x4D ^ (0x16 ^ 0x5A);
        L.lllllIIIII[16] = 0x7B ^ 0x72;
        L.lllllIIIII[17] = 0xB6 ^ 0xBD;
        L.lllllIIIII[18] = 0x38 ^ 0x34;
        L.lllllIIIII[19] = 0x7A ^ 0x77;
        L.lllllIIIII[20] = 0xB3 ^ 0x96 ^ (0x2F ^ 0x1E);
        L.lllllIIIII[21] = 0x9A ^ 0x94;
        L.lllllIIIII[22] = 77 + 7 - 50 + 150 ^ 42 + 0 - -91 + 50;
        L.lllllIIIII[23] = 0x43 ^ 2 ^ (0x65 ^ 0x34);
        L.lllllIIIII[24] = 17 + 71 - 30 + 123 ^ 4 + 168 - 17 + 16;
        L.lllllIIIII[25] = 0x27 ^ 0x6D ^ (0xC ^ 0x57);
        L.lllllIIIII[26] = 131 + 76 - 57 + 17 ^ 133 + 69 - 39 + 18;
        L.lllllIIIII[27] = 0x4A ^ 0x4E ^ (0x67 ^ 0x70);
        L.lllllIIIII[28] = 0x63 ^ 0x4B;
        L.lllllIIIII[29] = 0xA7 ^ 0xB2;
        L.lllllIIIII[30] = 0x18 ^ 0xE;
        L.lllllIIIII[31] = 0x48 ^ 0x3D ^ (0x30 ^ 0x52);
        L.lllllIIIII[32] = 0x34 ^ 0x2C;
        L.lllllIIIII[33] = 0x2A ^ 0x33;
        L.lllllIIIII[34] = 0x76 ^ 0x6C;
        L.lllllIIIII[35] = 8 ^ 0x1A ^ (0xB6 ^ 0xBF);
        L.lllllIIIII[36] = 6 ^ 0x1A;
        L.lllllIIIII[37] = 0x70 ^ 0x6D;
        L.lllllIIIII[38] = 0x13 ^ 0xC;
        L.lllllIIIII[39] = 0x73 ^ 0x53;
        L.lllllIIIII[40] = 73 + 8 - -57 + 31 ^ 18 + 73 - 67 + 112;
        L.lllllIIIII[41] = 0xDB ^ 0x8A ^ (0x30 ^ 0x5D);
        L.lllllIIIII[42] = 103 + 81 - 46 + 4 ^ 127 + 141 - 157 + 61;
        L.lllllIIIII[43] = 0x90 ^ 0xC0 ^ (0x50 ^ 0x23);
        L.lllllIIIII[44] = 0xA0 ^ 0xB0 ^ (0x84 ^ 0xB0);
        L.lllllIIIII[45] = 0x5C ^ 0x34 ^ (0xF3 ^ 0xBE);
        L.lllllIIIII[46] = 0xAF ^ 0x96 ^ (0xA5 ^ 0xBA);
        L.lllllIIIII[47] = 0x1B ^ 0x33 ^ (0xD ^ 2);
        L.lllllIIIII[48] = 0xFFFFBDD5 & 0x737B;
        L.lllllIIIII[49] = 0xFFFFDF6F & 0x379C;
        L.lllllIIIII[50] = 0xFFFFEEEF & 0x3FDC;
        L.lllllIIIII[51] = 0xFFFFFFF8 & 0x61AF;
        L.lllllIIIII[52] = 0xFFFFE7FF & 0x1F6C;
        L.lllllIIIII[53] = 0x7C ^ 0x18;
        L.lllllIIIII[54] = 0xB5 ^ 0x9C;
        L.lllllIIIII[55] = 0x1C ^ 0x36;
        L.lllllIIIII[56] = -(0xFFFFF12B & 0x3FD6) & (0xFFFFFDDF & 0x3F77);
        L.lllllIIIII[57] = -(71 + 109 - 165 + 115) & (0xFFFF9DF7 & 0x6FEB);
        L.lllllIIIII[58] = 111 + 23 - 129 + 146 ^ 170 + 29 - 149 + 138;
        L.lllllIIIII[59] = 4 ^ 0x52 ^ (0x6C ^ 0x16);
        L.lllllIIIII[60] = 8 + 71 - -20 + 74 ^ 42 + 18 - -29 + 39;
        L.lllllIIIII[61] = -(0xFFFFF7B6 & 0x3B7D) & (0xFFFFBFFF & 0x7FBF);
        L.lllllIIIII[62] = 0xFFFFED6D & 0x1FF2;
        L.lllllIIIII[63] = -(0xFFFFC39B & 0x7FEF) & (0xFFFFCFFF & 0x7FDF);
        L.lllllIIIII[64] = -(0xFFFFD77D & 0x7A9F) & (0xFFFFFFFD & 0x5F7F);
        L.lllllIIIII[65] = 0xFFFFFFF7 & 0xCBF;
        L.lllllIIIII[66] = 0xFFFFBD9E & 0x4FFD;
        L.lllllIIIII[67] = 0xFFFFECFF & 0x1F7B;
        L.lllllIIIII[68] = -(0xFFFFB3FF & 0x6EB2) & (0xFFFFAFFD & Short.MAX_VALUE);
        L.lllllIIIII[69] = 0x44 ^ 0x6A;
        L.lllllIIIII[70] = 0x34 ^ 0x1B;
        L.lllllIIIII[71] = 0xA4 ^ 0xB9 ^ (0xB8 ^ 0x95);
        L.lllllIIIII[72] = 0x66 ^ 0x57;
        L.lllllIIIII[73] = 0x5A ^ 0x70 ^ (0x24 ^ 0x3D);
        L.lllllIIIII[74] = 2 + 34 - -46 + 50 ^ 24 + 51 - 23 + 124;
        L.lllllIIIII[75] = 0x78 ^ 0x42 ^ (0xB8 ^ 0xB7);
    }

    @Override
    public int T() {
        try {
            L.da();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (2 == 0) {
            return (0xE8 ^ 0xA6) & ~(0x4A ^ 4);
        }
        return lllllIIIII[53];
    }

    @Override
    public String U() {
        return llllIlllll[lllllIIIII[28]];
    }

    private static boolean llIlIIIlllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIIlIIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void llIlIIIlllIII() {
        llllIlllll = new String[lllllIIIII[75]];
        L.llllIlllll[L.lllllIIIII[0]] = L."Buying items";
        L.llllIlllll[L.lllllIIIII[1]] = L."Finished buying items, switching back to quest";
        L.llllIlllll[L.lllllIIIII[3]] = L."Drink";
        L.llllIlllll[L.lllllIIIII[6]] = L."Nav to bank";
        L.llllIlllll[L.lllllIIIII[7]] = L."Handling banking";
        L.llllIlllll[L.lllllIIIII[10]] = L."We are missing quest supplies, switching to BUYING";
        L.llllIlllll[L.lllllIIIII[14]] = L."Nav to romeo";
        L.llllIlllll[L.lllllIIIII[15]] = L."Starting quest";
        L.llllIlllll[L.lllllIIIII[13]] = L."Romeo";
        L.llllIlllll[L.lllllIIIII[16]] = L."Wear";
        L.llllIlllll[L.lllllIIIII[12]] = L."Nav to juliet";
        L.llllIlllll[L.lllllIIIII[17]] = L."Talk to juliet";
        L.llllIlllll[L.lllllIIIII[18]] = L."Open";
        L.llllIlllll[L.lllllIIIII[19]] = L."Juliet";
        L.llllIlllll[L.lllllIIIII[21]] = L."Nav to romeo";
        L.llllIlllll[L.lllllIIIII[22]] = L."Starting quest";
        L.llllIlllll[L.lllllIIIII[23]] = L."Romeo";
        L.llllIlllll[L.lllllIIIII[25]] = L."Nav to father";
        L.llllIlllll[L.lllllIIIII[26]] = L."talk father";
        L.llllIlllll[L.lllllIIIII[27]] = L."Father Lawrence";
        L.llllIlllll[L.lllllIIIII[20]] = L."Nav to potion guy";
        L.llllIlllll[L.lllllIIIII[29]] = L."talk potions";
        L.llllIlllll[L.lllllIIIII[30]] = L."Apothecary";
        L.llllIlllll[L.lllllIIIII[31]] = L."Cadava potion";
        L.llllIlllll[L.lllllIIIII[32]] = L."Nav to potion guy";
        L.llllIlllll[L.lllllIIIII[33]] = L."Cadava potion";
        L.llllIlllll[L.lllllIIIII[34]] = L."talk potions";
        L.llllIlllll[L.lllllIIIII[35]] = L."Apothecary";
        L.llllIlllll[L.lllllIIIII[36]] = L."Cadava potion";
        L.llllIlllll[L.lllllIIIII[37]] = L."Wear";
        L.llllIlllll[L.lllllIIIII[24]] = L."Nav to juliet";
        L.llllIlllll[L.lllllIIIII[38]] = L."Talk to juliet";
        L.llllIlllll[L.lllllIIIII[39]] = L."Open";
        L.llllIlllll[L.lllllIIIII[40]] = L."Juliet";
        L.llllIlllll[L.lllllIIIII[42]] = L."Nav to romeo";
        L.llllIlllll[L.lllllIIIII[43]] = L."Finishing quest";
        L.llllIlllll[L.lllllIIIII[44]] = L."Romeo";
        L.llllIlllll[L.lllllIIIII[45]] = L."Nav to bank";
        L.llllIlllll[L.lllllIIIII[46]] = L."Handling banking";
        L.llllIlllll[L.lllllIIIII[47]] = L."We are missing quest supplies, switching to BUYING";
        L.llllIlllll[L.lllllIIIII[28]] = L."Romeo & Juliet quest";
        L.llllIlllll[L.lllllIIIII[54]] = L."ring of wealth (";
        L.llllIlllll[L.lllllIIIII[55]] = L."Door";
        L.llllIlllll[L.lllllIIIII[58]] = L."Open";
        L.llllIlllll[L.lllllIIIII[59]] = L."Door";
        L.llllIlllll[L.lllllIIIII[60]] = L."Open";
        L.llllIlllll[L.lllllIIIII[69]] = L."Yes, I have seen her actually!";
        L.llllIlllll[L.lllllIIIII[70]] = L."Yes, ok, I'll let her know.";
        L.llllIlllll[L.lllllIIIII[71]] = L."Ok, thanks.";
        L.llllIlllll[L.lllllIIIII[72]] = L."Talk about something else.";
        L.llllIlllll[L.lllllIIIII[2]] = L."Talk about Romeo & Juliet.";
        L.llllIlllll[L.lllllIIIII[73]] = L."Ok, thanks.";
        L.llllIlllll[L.lllllIIIII[74]] = L."Yes.";
    }

    private static boolean llIlIIIllllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIlIIIlllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIIlIIIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static String llIlIIIllIlIl(String var10, String var13) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), lllllIIIII[13]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(lllllIIIII[3], var2);
            return new String(var16.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean aa() {
        int[] nArray = new int[lllllIIIII[1]];
        nArray[L.lllllIIIII[0]] = lllllIIIII[9];
        return Inventory.contains((int[])nArray);
    }

    /*
     * WARNING - void declaration
     */
    private static void cc() {
        void var15;
        BankLocation bankLocation = BankLocation.getNearest();
        if (L.llIlIIIlllllI(bankLocation) && L.llIlIIIllllII(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlllll[lllllIIIII[45]];
            a.a(bankLocation);
            Time.sleepTicks((int)lllllIIIII[3]);
            0;
        }
        if (L.llIlIIIlllllI(var15) && L.llIlIIIlllIlI(var15.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlllll[lllllIIIII[46]];
            if (L.llIlIIIllllII(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lllllIIIII[8]);
                0;
            }
            if (L.llIlIIIlllIlI(Bank.isOpen() ? 1 : 0)) {
                if (L.llIlIIIllllIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lllllIIIII[7]);
                    0;
                }
                if (L.llIlIIIllllIl(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)lllllIIIII[3]);
                    0;
                }
                int[] nArray = new int[lllllIIIII[1]];
                nArray[L.lllllIIIII[0]] = lllllIIIII[9];
                if (L.llIlIIIllllII(e.b(nArray) ? 1 : 0)) {
                    L.ae();
                    System.out.println(llllIlllll[lllllIIIII[47]]);
                    bs = lllllIIIII[1];
                    return;
                }
                int[] nArray2 = new int[lllllIIIII[1]];
                nArray2[L.lllllIIIII[0]] = lllllIIIII[9];
                if (L.llIlIIIlllIlI(e.b(nArray2) ? 1 : 0)) {
                    a.a(lllllIIIII[9], lllllIIIII[1]);
                    a.b(f.aU, lllllIIIII[3]);
                    a.a(lllllIIIII[11], lllllIIIII[12]);
                    a.b(f.be, lllllIIIII[1]);
                }
            }
        }
    }

    private static boolean llIlIIlIIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        L.llIlIIIlllIIl();
        L.llIlIIIlllIII();
        hY = new WorldPoint(lllllIIIII[61], lllllIIIII[62], lllllIIIII[0]);
        hZ = new WorldPoint(lllllIIIII[63], lllllIIIII[64], lllllIIIII[1]);
        ia = new WorldPoint(lllllIIIII[65], lllllIIIII[66], lllllIIIII[0]);
        ib = new WorldPoint(lllllIIIII[67], lllllIIIII[68], lllllIIIII[0]);
        String[] stringArray = new String[lllllIIIII[15]];
        stringArray[L.lllllIIIII[0]] = llllIlllll[lllllIIIII[69]];
        stringArray[L.lllllIIIII[1]] = llllIlllll[lllllIIIII[70]];
        stringArray[L.lllllIIIII[3]] = llllIlllll[lllllIIIII[71]];
        stringArray[L.lllllIIIII[6]] = llllIlllll[lllllIIIII[72]];
        stringArray[L.lllllIIIII[7]] = llllIlllll[lllllIIIII[2]];
        stringArray[L.lllllIIIII[10]] = llllIlllll[lllllIIIII[73]];
        stringArray[L.lllllIIIII[14]] = llllIlllll[lllllIIIII[74]];
        bQ = stringArray;
        bu = new ArrayList<d>();
        bS = lllllIIIII[0];
    }

    @Override
    public boolean S() {
        return lllllIIIII[0];
    }

    private static boolean llIlIIIllllIl(int n2) {
        return n2 > 0;
    }

    private static String llIlIIIllIlll(String var17, String var23) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var3 = var23.toCharArray();
        int var12 = lllllIIIII[0];
        char[] var7 = var17.toCharArray();
        int var18 = var7.length;
        int var22 = lllllIIIII[0];
        while (L.llIlIIIlllIll(var22, var18)) {
            char var21 = var7[var22];
            var4.append((char)(var21 ^ var3[var12 % var3.length]));
            0;
            ++var12;
            ++var22;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    private static boolean llIlIIIlllllI(Object object) {
        return object != null;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (L.llIlIIlIIIIlI(e.j(lllllIIIII[5]), lllllIIIII[53])) {
            bl = lllllIIIII[1];
            0;
            if (2 < -1) {
                return ((20 + 61 - -52 + 35 ^ 130 + 15 - 44 + 39) & (0x99 ^ 0x8E ^ (0x16 ^ 0x25) ^ -1)) != 0;
            }
        } else {
            bl = lllllIIIII[0];
        }
        return bl;
    }

    public static void da() {
        block52: {
            BankLocation var19;
            block54: {
                block53: {
                    if (L.llIlIIIlllIlI(bs ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIlllll[lllllIIIII[0]];
                        b.a(bu);
                        if (L.llIlIIIlllIll(bu.size(), lllllIIIII[1])) {
                            System.out.println(llllIlllll[lllllIIIII[1]]);
                            bs = lllllIIIII[0];
                        }
                    }
                    if (!L.llIlIIIllllII(bs ? 1 : 0)) break block52;
                    if (L.llIlIIIlllIlI(Inventory.contains((int[])f.aU) ? 1 : 0) && L.llIlIIIlllIll(Movement.getRunEnergy(), lllllIIIII[2])) {
                        Inventory.getFirst((int[])f.aU).interact(llllIlllll[lllllIIIII[3]]);
                        Time.sleepTicks((int)lllllIIIII[1]);
                        0;
                    }
                    if (L.llIlIIIllllII(Movement.isRunEnabled() ? 1 : 0) && L.llIlIIIllllIl(Movement.getRunEnergy())) {
                        Movement.toggleRun();
                    }
                    if (!L.llIlIIIlllIlI(L.aa() ? 1 : 0)) break block53;
                    int[] nArray = new int[lllllIIIII[1]];
                    nArray[L.lllllIIIII[0]] = lllllIIIII[4];
                    if (!L.llIlIIIllllIl(Inventory.getCount((int[])nArray))) break block54;
                }
                if (L.llIlIIIlllIll(e.j(lllllIIIII[5]), lllllIIIII[1])) {
                    var19 = BankLocation.getNearest();
                    if (L.llIlIIIlllllI(var19) && L.llIlIIIllllII(var19.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIlllll[lllllIIIII[6]];
                        a.a(var19);
                        Time.sleepTicks((int)lllllIIIII[3]);
                        0;
                    }
                    if (L.llIlIIIlllllI(var19) && L.llIlIIIlllIlI(var19.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIlllll[lllllIIIII[7]];
                        if (L.llIlIIIllllII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lllllIIIII[8]);
                            0;
                        }
                        if (L.llIlIIIlllIlI(Bank.isOpen() ? 1 : 0)) {
                            if (L.llIlIIIllllIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lllllIIIII[7]);
                                0;
                            }
                            if (L.llIlIIIllllIl(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lllllIIIII[3]);
                                0;
                            }
                            int[] nArray = new int[lllllIIIII[1]];
                            nArray[L.lllllIIIII[0]] = lllllIIIII[9];
                            if (L.llIlIIIllllII(e.b(nArray) ? 1 : 0)) {
                                L.ae();
                                System.out.println(llllIlllll[lllllIIIII[10]]);
                                bs = lllllIIIII[1];
                                return;
                            }
                            int[] nArray2 = new int[lllllIIIII[1]];
                            nArray2[L.lllllIIIII[0]] = lllllIIIII[9];
                            if (L.llIlIIIlllIlI(e.b(nArray2) ? 1 : 0)) {
                                a.a(lllllIIIII[9], lllllIIIII[1]);
                                a.b(f.aU, lllllIIIII[3]);
                                a.a(lllllIIIII[11], lllllIIIII[12]);
                                a.b(f.be, lllllIIIII[1]);
                            }
                        }
                    }
                }
            }
            if (L.llIlIIIlllIlI(L.aa() ? 1 : 0) && L.llIlIIIlllIll(e.j(lllllIIIII[5]), lllllIIIII[1])) {
                if (L.llIlIIIllllll(Players.getLocal().getWorldLocation().distanceTo(hY), lllllIIIII[13])) {
                    AccBuilderTempleTrek.c = llllIlllll[lllllIIIII[14]];
                    if (L.llIlIIIlllIll(bS, lllllIIIII[1])) {
                        e.v();
                        bS += lllllIIIII[1];
                    }
                    Movement.walkTo((WorldPoint)hY);
                    0;
                    Time.sleepTicks((int)lllllIIIII[1]);
                    0;
                }
                if (L.llIlIIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(hY), lllllIIIII[13])) {
                    AccBuilderTempleTrek.c = llllIlllll[lllllIIIII[15]];
                    g.a(llllIlllll[lllllIIIII[13]], bQ);
                }
            }
            if (L.llIlIIlIIIIIl(e.j(lllllIIIII[5]), lllllIIIII[12])) {
                if (L.llIlIIIllllll(Players.getLocal().getWorldLocation().distanceTo(hZ), lllllIIIII[3])) {
                    if (L.llIlIIIlllIlI(Inventory.contains((int[])f.be) ? 1 : 0) && L.llIlIIIllllII(Equipment.contains((int[])f.be) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.be).interact(llllIlllll[lllllIIIII[16]]);
                        Time.sleepTicks((int)lllllIIIII[1]);
                        0;
                    }
                    AccBuilderTempleTrek.c = llllIlllll[lllllIIIII[12]];
                    Movement.walkTo((WorldPoint)hZ);
                    0;
                    Time.sleepTicks((int)lllllIIIII[1]);
                    0;
                }
                if (L.llIlIIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(hZ), lllllIIIII[3])) {
                    AccBuilderTempleTrek.c = llllIlllll[lllllIIIII[17]];
                    var19 = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (L.llIlIIIlllIlI(tileObject.getName().contains(llllIlllll[lllllIIIII[59]]) ? 1 : 0) && L.llIlIIlIIIIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllIIIII[56], lllllIIIII[57], lllllIIIII[1])), lllllIIIII[3])) {
                            String[] stringArray = new String[lllllIIIII[1]];
                            stringArray[L.lllllIIIII[0]] = llllIlllll[lllllIIIII[60]];
                            if (L.llIlIIIlllIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = lllllIIIII[1];
                                0;
                                if (((0x3D ^ 0x7D ^ (0x6A ^ 0x30)) & (107 + 138 - 227 + 142 ^ 95 + 153 - 112 + 50 ^ -1)) < 1) return n2 != 0;
                                return ((0x19 ^ 0x3F ^ (0xBF ^ 0x85)) & (4 ^ 0x18 ^ (0x2B ^ 0x23) & ~(0x73 ^ 0x7B) ^ -1)) != 0;
                            }
                        }
                        n2 = lllllIIIII[0];
                        return n2 != 0;
                    });
                    if (L.llIlIIIlllllI(var19)) {
                        var19.interact(llllIlllll[lllllIIIII[18]]);
                        Time.sleepTicks((int)lllllIIIII[6]);
                        0;
                    }
                    g.a(llllIlllll[lllllIIIII[19]], bQ);
                }
            }
            if (L.llIlIIlIIIIIl(e.j(lllllIIIII[5]), lllllIIIII[20])) {
                if (L.llIlIIIllllll(Players.getLocal().getWorldLocation().distanceTo(hY), lllllIIIII[13])) {
                    AccBuilderTempleTrek.c = llllIlllll[lllllIIIII[21]];
                    Movement.walkTo((WorldPoint)hY);
                    0;
                    Time.sleepTicks((int)lllllIIIII[1]);
                    0;
                }
                if (L.llIlIIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(hY), lllllIIIII[13])) {
                    AccBuilderTempleTrek.c = llllIlllll[lllllIIIII[22]];
                    g.a(llllIlllll[lllllIIIII[23]], bQ);
                }
            }
            if (L.llIlIIlIIIIIl(e.j(lllllIIIII[5]), lllllIIIII[24])) {
                if (L.llIlIIIllllll(Players.getLocal().getWorldLocation().distanceTo(ia), lllllIIIII[10])) {
                    AccBuilderTempleTrek.c = llllIlllll[lllllIIIII[25]];
                    Movement.walkTo((WorldPoint)ia);
                    0;
                    Time.sleepTicks((int)lllllIIIII[1]);
                    0;
                }
                if (L.llIlIIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(ia), lllllIIIII[10])) {
                    AccBuilderTempleTrek.c = llllIlllll[lllllIIIII[26]];
                    g.a(llllIlllll[lllllIIIII[27]], bQ);
                }
                g.a(bQ);
            }
            if (L.llIlIIlIIIIIl(e.j(lllllIIIII[5]), lllllIIIII[28])) {
                if (L.llIlIIIllllII(L.aa() ? 1 : 0)) {
                    L.cc();
                }
                if (L.llIlIIIlllIlI(L.aa() ? 1 : 0)) {
                    if (L.llIlIIIllllll(Players.getLocal().getWorldLocation().distanceTo(ib), lllllIIIII[10])) {
                        AccBuilderTempleTrek.c = llllIlllll[lllllIIIII[20]];
                        Movement.walkTo((WorldPoint)ib);
                        0;
                        Time.sleepTicks((int)lllllIIIII[1]);
                        0;
                    }
                    if (L.llIlIIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(ib), lllllIIIII[10])) {
                        AccBuilderTempleTrek.c = llllIlllll[lllllIIIII[29]];
                        g.a(llllIlllll[lllllIIIII[30]], bQ);
                    }
                }
            }
            if (L.llIlIIlIIIIIl(e.j(lllllIIIII[5]), lllllIIIII[2])) {
                String[] stringArray = new String[lllllIIIII[1]];
                stringArray[L.lllllIIIII[0]] = llllIlllll[lllllIIIII[31]];
                if (L.llIlIIIllllII(Inventory.contains((String[])stringArray) ? 1 : 0) && L.llIlIIIllllll(Players.getLocal().getWorldLocation().distanceTo(ib), lllllIIIII[10])) {
                    if (L.llIlIIIllllII(L.aa() ? 1 : 0)) {
                        L.cc();
                    }
                    if (L.llIlIIIlllIlI(L.aa() ? 1 : 0) && L.llIlIIIllllll(Players.getLocal().getWorldLocation().distanceTo(ib), lllllIIIII[10])) {
                        AccBuilderTempleTrek.c = llllIlllll[lllllIIIII[32]];
                        Movement.walkTo((WorldPoint)ib);
                        0;
                        Time.sleepTicks((int)lllllIIIII[1]);
                        0;
                    }
                }
            }
            if (L.llIlIIlIIIIIl(e.j(lllllIIIII[5]), lllllIIIII[2])) {
                String[] stringArray = new String[lllllIIIII[1]];
                stringArray[L.lllllIIIII[0]] = llllIlllll[lllllIIIII[33]];
                if (L.llIlIIIllllII(Inventory.contains((String[])stringArray) ? 1 : 0) && L.llIlIIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(ib), lllllIIIII[10])) {
                    ck = lllllIIIII[0];
                    AccBuilderTempleTrek.c = llllIlllll[lllllIIIII[34]];
                    g.a(llllIlllll[lllllIIIII[35]], bQ);
                }
            }
            if (L.llIlIIlIIIIIl(e.j(lllllIIIII[5]), lllllIIIII[2])) {
                String[] stringArray = new String[lllllIIIII[1]];
                stringArray[L.lllllIIIII[0]] = llllIlllll[lllllIIIII[36]];
                if (L.llIlIIIlllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (L.llIlIIIllllll(Players.getLocal().getWorldLocation().distanceTo(hZ), lllllIIIII[3])) {
                        if (L.llIlIIIlllIlI(Inventory.contains((int[])f.be) ? 1 : 0) && L.llIlIIIllllII(Equipment.contains((int[])f.be) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.be).interact(llllIlllll[lllllIIIII[37]]);
                            Time.sleepTicks((int)lllllIIIII[1]);
                            0;
                        }
                        AccBuilderTempleTrek.c = llllIlllll[lllllIIIII[24]];
                        Movement.walkTo((WorldPoint)hZ);
                        0;
                        Time.sleepTicks((int)lllllIIIII[1]);
                        0;
                    }
                    if (L.llIlIIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(hZ), lllllIIIII[3])) {
                        AccBuilderTempleTrek.c = llllIlllll[lllllIIIII[38]];
                        var19 = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (L.llIlIIIlllIlI(tileObject.getName().contains(llllIlllll[lllllIIIII[55]]) ? 1 : 0) && L.llIlIIlIIIIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllIIIII[56], lllllIIIII[57], lllllIIIII[1])), lllllIIIII[3])) {
                                String[] stringArray = new String[lllllIIIII[1]];
                                stringArray[L.lllllIIIII[0]] = llllIlllll[lllllIIIII[58]];
                                if (L.llIlIIIlllIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n2 = lllllIIIII[1];
                                    0;
                                    if (-1 <= -1) return n2 != 0;
                                    return ((0x93 ^ 0xBB ^ (0x69 ^ 0x17)) & (123 + 44 - 96 + 79 ^ 109 + 48 - 72 + 107 ^ -1)) != 0;
                                }
                            }
                            n2 = lllllIIIII[0];
                            return n2 != 0;
                        });
                        if (L.llIlIIIlllllI(var19)) {
                            var19.interact(llllIlllll[lllllIIIII[39]]);
                            Time.sleepTicks((int)lllllIIIII[6]);
                            0;
                        }
                        g.a(llllIlllll[lllllIIIII[40]], bQ);
                    }
                    g.a(bQ);
                }
            }
            if (L.llIlIIlIIIIIl(e.j(lllllIIIII[5]), lllllIIIII[41])) {
                if (L.llIlIIIllllll(Players.getLocal().getWorldLocation().distanceTo(hY), lllllIIIII[13]) && L.llIlIIIllllII(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlllll[lllllIIIII[42]];
                    Movement.walkTo((WorldPoint)hY);
                    0;
                    Time.sleepTicks((int)lllllIIIII[1]);
                    0;
                }
                if (L.llIlIIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(hY), lllllIIIII[13])) {
                    AccBuilderTempleTrek.c = llllIlllll[lllllIIIII[43]];
                    if (L.llIlIIIlllIll(ck, lllllIIIII[1])) {
                        ac.mO += lllllIIIII[1];
                        ac.d(AccBuilderTempleTrek.m);
                        ck += lllllIIIII[1];
                        ac.mO = lllllIIIII[0];
                        cl = lllllIIIII[0];
                    }
                    g.a(llllIlllll[lllllIIIII[44]], bQ);
                    Time.sleepTicks((int)lllllIIIII[10]);
                    0;
                }
            }
            g.a(bQ);
            System.out.println("Setting: " + e.j(lllllIIIII[5]));
        }
    }

    private static void ae() {
        d var11;
        Object var14;
        int[] nArray = new int[lllllIIIII[1]];
        nArray[L.lllllIIIII[0]] = lllllIIIII[48];
        if (L.llIlIIIllllII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lllllIIIII[48], lllllIIIII[10], i.bp);
            bu.add(d2);
            0;
        }
        int[] nArray2 = new int[lllllIIIII[1]];
        nArray2[L.lllllIIIII[0]] = lllllIIIII[9];
        if (L.llIlIIIllllII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var14 = new d(lllllIIIII[9], lllllIIIII[1], lllllIIIII[49]);
            bu.add((d)var14);
            0;
        }
        if (L.llIlIIIllllII(Bank.contains(var14 = item -> item.getName().toLowerCase().contains(llllIlllll[lllllIIIII[54]])) ? 1 : 0)) {
            var11 = new d(lllllIIIII[50], lllllIIIII[10], lllllIIIII[51]);
            bu.add(var11);
            0;
        }
        int[] nArray3 = new int[lllllIIIII[1]];
        nArray3[L.lllllIIIII[0]] = lllllIIIII[11];
        if (L.llIlIIIllllII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var11 = new d(lllllIIIII[11], lllllIIIII[20], lllllIIIII[52]);
            bu.add(var11);
            0;
        }
    }

    private static String llIlIIIllIllI(String var20, String var9) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lllllIIIII[3], var5);
            return new String(var6.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIIllllII(int n2) {
        return n2 == 0;
    }
}

