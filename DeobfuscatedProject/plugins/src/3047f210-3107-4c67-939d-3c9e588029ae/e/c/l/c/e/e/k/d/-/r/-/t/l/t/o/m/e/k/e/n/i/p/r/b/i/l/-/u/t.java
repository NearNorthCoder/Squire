/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f;
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
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class t {
    private static /* synthetic */ String[] lllIllIlIl;
    private static /* synthetic */ int ds;
    private static /* synthetic */ int dt;
    public static /* synthetic */ List<d> bu;
    public static /* synthetic */ boolean bs;
    private static /* synthetic */ int[] du;
    private static /* synthetic */ int[] lllIllIllI;

    public static void ae() {
        d lllllllllllllllllIllIlIIIlIIIlII;
        Object lllllllllllllllllIllIlIIIlIIIlIl;
        int[] nArray = new int[lllIllIllI[1]];
        nArray[t.lllIllIllI[0]] = ds;
        if (t.llIIlIIIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(ds, lllIllIllI[1], lllIllIllI[21]);
            bu.add(d2);
            "".length();
        }
        int[] nArray2 = new int[lllIllIllI[1]];
        nArray2[t.lllIllIllI[0]] = dt;
        if (t.llIIlIIIllIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllllllllllllllllIllIlIIIlIIIlIl = new d(dt, lllIllIllI[1], lllIllIllI[22]);
            bu.add((d)lllllllllllllllllIllIlIIIlIIIlIl);
            "".length();
        }
        int[] nArray3 = new int[lllIllIllI[1]];
        nArray3[t.lllIllIllI[0]] = lllIllIllI[8];
        if (t.llIIlIIIllIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllllllllllllllllIllIlIIIlIIIlIl = new d(lllIllIllI[8], lllIllIllI[1], lllIllIllI[23]);
            bu.add((d)lllllllllllllllllIllIlIIIlIIIlIl);
            "".length();
        }
        int[] nArray4 = new int[lllIllIllI[1]];
        nArray4[t.lllIllIllI[0]] = lllIllIllI[7];
        if (t.llIIlIIIllIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lllllllllllllllllIllIlIIIlIIIlIl = new d(lllIllIllI[7], lllIllIllI[1], lllIllIllI[24]);
            bu.add((d)lllllllllllllllllIllIlIIIlIIIlIl);
            "".length();
        }
        int[] nArray5 = new int[lllIllIllI[1]];
        nArray5[t.lllIllIllI[0]] = lllIllIllI[25];
        if (t.llIIlIIIllIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lllllllllllllllllIllIlIIIlIIIlIl = new d(lllIllIllI[25], lllIllIllI[5], lllIllIllI[13]);
            bu.add((d)lllllllllllllllllIllIlIIIlIIIlIl);
            "".length();
        }
        int[] nArray6 = new int[lllIllIllI[1]];
        nArray6[t.lllIllIllI[0]] = lllIllIllI[26];
        if (t.llIIlIIIllIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lllllllllllllllllIllIlIIIlIIIlIl = new d(lllIllIllI[26], lllIllIllI[27], lllIllIllI[13]);
            bu.add((d)lllllllllllllllllIllIlIIIlIIIlIl);
            "".length();
        }
        int[] nArray7 = new int[lllIllIllI[1]];
        nArray7[t.lllIllIllI[0]] = lllIllIllI[28];
        if (t.llIIlIIIllIlI(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lllllllllllllllllIllIlIIIlIIIlIl = new d(lllIllIllI[28], lllIllIllI[29], lllIllIllI[13]);
            bu.add((d)lllllllllllllllllIllIlIIIlIIIlIl);
            "".length();
        }
        int[] nArray8 = new int[lllIllIllI[1]];
        nArray8[t.lllIllIllI[0]] = lllIllIllI[30];
        if (t.llIIlIIIllIlI(Bank.contains((int[])nArray8) ? 1 : 0)) {
            lllllllllllllllllIllIlIIIlIIIlIl = new d(lllIllIllI[30], lllIllIllI[31], lllIllIllI[13]);
            bu.add((d)lllllllllllllllllIllIlIIIlIIIlIl);
            "".length();
        }
        int[] nArray9 = new int[lllIllIllI[1]];
        nArray9[t.lllIllIllI[0]] = lllIllIllI[25];
        if (t.llIIlIIIllIII(Bank.contains((int[])nArray9) ? 1 : 0)) {
            int[] nArray10 = new int[lllIllIllI[1]];
            nArray10[t.lllIllIllI[0]] = lllIllIllI[25];
            if (t.llIIlIIIllIIl(Bank.getFirst((int[])nArray10).getQuantity(), lllIllIllI[32])) {
                lllllllllllllllllIllIlIIIlIIIlIl = new d(lllIllIllI[25], lllIllIllI[5], lllIllIllI[13]);
                bu.add((d)lllllllllllllllllIllIlIIIlIIIlIl);
                "".length();
            }
        }
        int[] nArray11 = new int[lllIllIllI[1]];
        nArray11[t.lllIllIllI[0]] = lllIllIllI[26];
        if (t.llIIlIIIllIII(Bank.contains((int[])nArray11) ? 1 : 0)) {
            int[] nArray12 = new int[lllIllIllI[1]];
            nArray12[t.lllIllIllI[0]] = lllIllIllI[26];
            if (t.llIIlIIIllIIl(Bank.getFirst((int[])nArray12).getQuantity(), lllIllIllI[32])) {
                lllllllllllllllllIllIlIIIlIIIlIl = new d(lllIllIllI[26], lllIllIllI[27], lllIllIllI[13]);
                bu.add((d)lllllllllllllllllIllIlIIIlIIIlIl);
                "".length();
            }
        }
        int[] nArray13 = new int[lllIllIllI[1]];
        nArray13[t.lllIllIllI[0]] = lllIllIllI[28];
        if (t.llIIlIIIllIII(Bank.contains((int[])nArray13) ? 1 : 0)) {
            int[] nArray14 = new int[lllIllIllI[1]];
            nArray14[t.lllIllIllI[0]] = lllIllIllI[28];
            if (t.llIIlIIIllIIl(Bank.getFirst((int[])nArray14).getQuantity(), lllIllIllI[32])) {
                lllllllllllllllllIllIlIIIlIIIlIl = new d(lllIllIllI[28], lllIllIllI[29], lllIllIllI[13]);
                bu.add((d)lllllllllllllllllIllIlIIIlIIIlIl);
                "".length();
            }
        }
        int[] nArray15 = new int[lllIllIllI[1]];
        nArray15[t.lllIllIllI[0]] = lllIllIllI[30];
        if (t.llIIlIIIllIII(Bank.contains((int[])nArray15) ? 1 : 0)) {
            int[] nArray16 = new int[lllIllIllI[1]];
            nArray16[t.lllIllIllI[0]] = lllIllIllI[30];
            if (t.llIIlIIIllIIl(Bank.getFirst((int[])nArray16).getQuantity(), lllIllIllI[32])) {
                lllllllllllllllllIllIlIIIlIIIlIl = new d(lllIllIllI[30], lllIllIllI[31], lllIllIllI[13]);
                bu.add((d)lllllllllllllllllIllIlIIIlIIIlIl);
                "".length();
            }
        }
        if (t.llIIlIIIllIlI(Bank.contains((Predicate)(lllllllllllllllllIllIlIIIlIIIlIl = item -> item.getName().toLowerCase().contains(lllIllIlIl[lllIllIllI[40]]))) ? 1 : 0)) {
            lllllllllllllllllIllIlIIIlIIIlII = new d(lllIllIllI[33], lllIllIllI[6], lllIllIllI[34]);
            bu.add(lllllllllllllllllIllIlIIIlIIIlII);
            "".length();
        }
        int[] nArray17 = new int[lllIllIllI[1]];
        nArray17[t.lllIllIllI[0]] = lllIllIllI[35];
        if (t.llIIlIIIllIlI(Bank.contains((int[])nArray17) ? 1 : 0)) {
            lllllllllllllllllIllIlIIIlIIIlII = new d(lllIllIllI[35], lllIllIllI[36], lllIllIllI[37]);
            bu.add(lllllllllllllllllIllIlIIIlIIIlII);
            "".length();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean bl() {
        int n2;
        String[] stringArray = new String[lllIllIllI[1]];
        stringArray[t.lllIllIllI[0]] = lllIllIlIl[lllIllIllI[19]];
        if (t.llIIlIIIllIII(Equipment.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lllIllIllI[1]];
            nArray[t.lllIllIllI[0]] = lllIllIllI[8];
            if (t.llIIlIIIllIII(Equipment.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllIllIllI[1]];
                nArray2[t.lllIllIllI[0]] = lllIllIllI[7];
                if (t.llIIlIIIllIII(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                    String[] stringArray2 = new String[lllIllIllI[1]];
                    stringArray2[t.lllIllIllI[0]] = lllIllIlIl[lllIllIllI[20]];
                    if (t.llIIlIIIllIII(Equipment.contains((String[])stringArray2) ? 1 : 0)) {
                        n2 = lllIllIllI[1];
                        "".length();
                        if ((0x8B ^ 0x8E) != 0) return n2 != 0;
                        return ((0x44 ^ 0x78) & ~(0x35 ^ 9)) != 0;
                    }
                }
            }
        }
        n2 = lllIllIllI[0];
        return n2 != 0;
    }

    private static String llIIlIIIlIlIl(String lllllllllllllllllIllIlIIIIlIIIlI, String lllllllllllllllllIllIlIIIIlIIIIl) {
        try {
            SecretKeySpec lllllllllllllllllIllIlIIIIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIlIIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIllIlIIIIlIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllllIllIlIIIIlIIllI.init(lllIllIllI[2], lllllllllllllllllIllIlIIIIlIIlll);
            return new String(lllllllllllllllllIllIlIIIIlIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIlIIIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIllIlIIIIlIIlIl) {
            lllllllllllllllllIllIlIIIIlIIlIl.printStackTrace();
            return null;
        }
    }

    private static String llIIlIIIlIIll(String lllllllllllllllllIllIlIIIIIlIlll, String lllllllllllllllllIllIlIIIIIlIlII) {
        try {
            SecretKeySpec lllllllllllllllllIllIlIIIIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIlIIIIIlIlII.getBytes(StandardCharsets.UTF_8)), lllIllIllI[11]), "DES");
            Cipher lllllllllllllllllIllIlIIIIIllIIl = Cipher.getInstance("DES");
            lllllllllllllllllIllIlIIIIIllIIl.init(lllIllIllI[2], lllllllllllllllllIllIlIIIIIllIlI);
            return new String(lllllllllllllllllIllIlIIIIIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIlIIIIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIllIlIIIIIllIII) {
            lllllllllllllllllIllIlIIIIIllIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIIllIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIlIIIllIlI(int n2) {
        return n2 == 0;
    }

    public static void bm() {
        if (t.llIIlIIIllIII(Inventory.contains((int[])f.be) ? 1 : 0) && t.llIIlIIIllIlI(Equipment.contains((int[])f.be) ? 1 : 0)) {
            Inventory.getFirst((int[])f.be).interact(lllIllIlIl[lllIllIllI[38]]);
            Time.sleepTicks((int)lllIllIllI[1]);
            "".length();
        }
        if (t.llIIlIIIllIII(Inventory.contains((int[])f.aQ) ? 1 : 0) && t.llIIlIIIllIlI(Equipment.contains((int[])f.aQ) ? 1 : 0)) {
            Inventory.getFirst((int[])f.aQ).interact(lllIllIlIl[lllIllIllI[39]]);
            Time.sleepTicks((int)lllIllIllI[1]);
            "".length();
        }
    }

    private static boolean llIIlIIIlllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIlIIIlllII(int n2) {
        return n2 > 0;
    }

    private static boolean llIIlIIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIlIIIllIll(Object object) {
        return object != null;
    }

    private static void llIIlIIIlIlll() {
        lllIllIllI = new int[44];
        t.lllIllIllI[0] = (0xF5 ^ 0x8E ^ (0xDC ^ 0xA9)) & (0x11 ^ 0xD ^ (0x81 ^ 0x93) ^ -" ".length());
        t.lllIllIllI[1] = " ".length();
        t.lllIllIllI[2] = "  ".length();
        t.lllIllIllI[3] = "   ".length();
        t.lllIllIllI[4] = 100 + 152 - 106 + 33 ^ 176 + 22 - 177 + 162;
        t.lllIllIllI[5] = 0xFFFFBBD8 & 0x57AF;
        t.lllIllIllI[6] = 0x2C ^ 0x71 ^ (0xB ^ 0x53);
        t.lllIllIllI[7] = 0xFFFFA9F9 & 0x5FFE;
        t.lllIllIllI[8] = 0xFFFFC7EC & 0x3EBB;
        t.lllIllIllI[9] = 0x91 ^ 0x97;
        t.lllIllIllI[10] = 0xDA ^ 0x80 ^ (0xF ^ 0x52);
        t.lllIllIllI[11] = 0x8E ^ 0x86;
        t.lllIllIllI[12] = 0x19 ^ 0x10;
        t.lllIllIllI[13] = 0xE6 ^ 0xB1 ^ (0x74 ^ 0x29);
        t.lllIllIllI[14] = 0xE5 ^ 0x8E ^ (0xE2 ^ 0x82);
        t.lllIllIllI[15] = 67 + 25 - 73 + 186 ^ 96 + 174 - 100 + 23;
        t.lllIllIllI[16] = 0xFFFF99FD & 0x7F66;
        t.lllIllIllI[17] = 171 + 170 - 203 + 40 ^ 20 + 68 - 15 + 118;
        t.lllIllIllI[18] = 0xA6 ^ 0xA0 ^ (0x4D ^ 0x45);
        t.lllIllIllI[19] = 0x4C ^ 0x43;
        t.lllIllIllI[20] = 0x6D ^ 0x7D;
        t.lllIllIllI[21] = 0xFFFFF0FE & 0x2FDB;
        t.lllIllIllI[22] = 0xFFFFEDF7 & 0x17EE;
        t.lllIllIllI[23] = 0xFFFFFF5E & 0x6FFF;
        t.lllIllIllI[24] = 0xFFFFBF6B & 0x55DE;
        t.lllIllIllI[25] = 0xFFFFC66F & 0x3BBE;
        t.lllIllIllI[26] = -(0xFFFFC75D & 0x7DB7) & (0xFFFFEF3F & 0x57FF);
        t.lllIllIllI[27] = 0xFFFFFBFE & 0xFB9;
        t.lllIllIllI[28] = 0xFFFFC3AD & 0x3E7F;
        t.lllIllIllI[29] = 0xFFFFCFEA & 0x3FB5;
        t.lllIllIllI[30] = 0xFFFF926A & 0x6FBF;
        t.lllIllIllI[31] = 0xFFFF9F60 & 0x7FDF;
        t.lllIllIllI[32] = -(0xFFFFEECB & 0x1337) & (0xFFFFDFF6 & 0x23FF);
        t.lllIllIllI[33] = 0xFFFFEFDE & 0x3EED;
        t.lllIllIllI[34] = -(0xFFFFEA5C & 0x1FBB) & (0xFFFFEBFF & 0x7FBF);
        t.lllIllIllI[35] = 0xFFFFDFEF & 0x3F57;
        t.lllIllIllI[36] = 0xFFFFEFD9 & 0x11B6;
        t.lllIllIllI[37] = -(0xFFFFEC76 & 0x7FAB) & (0xFFFFFFEF & 0x6FB5);
        t.lllIllIllI[38] = 0x35 ^ 0x24;
        t.lllIllIllI[39] = 0x5B ^ 0x49;
        t.lllIllIllI[40] = 7 ^ 0x14;
        t.lllIllIllI[41] = -(0xFFFFBCEF & 0x6B99) & (0xFFFFBFFF & 0x6DED);
        t.lllIllIllI[42] = -(0xFFFFFFE9 & 0x43DF) & (0xFFFFDFEB & 0x67FF);
        t.lllIllIllI[43] = 0x17 ^ 0x69 ^ (0x3B ^ 0x51);
    }

    static {
        t.llIIlIIIlIlll();
        t.llIIlIIIlIllI();
        bu = new ArrayList<d>();
        ds = lllIllIllI[41];
        dt = lllIllIllI[42];
        int[] nArray = new int[lllIllIllI[4]];
        nArray[t.lllIllIllI[0]] = ds;
        nArray[t.lllIllIllI[1]] = dt;
        nArray[t.lllIllIllI[2]] = lllIllIllI[8];
        nArray[t.lllIllIllI[3]] = lllIllIllI[7];
        du = nArray;
    }

    public static void bj() {
        block28: {
            block29: {
                block34: {
                    block31: {
                        block33: {
                            block32: {
                                block30: {
                                    if (t.llIIlIIIllIII(bs ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllIllIlIl[lllIllIllI[0]];
                                        b.a(bu);
                                        if (t.llIIlIIIllIIl(bu.size(), lllIllIllI[1])) {
                                            System.out.println(lllIllIlIl[lllIllIllI[1]]);
                                            bs = lllIllIllI[0];
                                        }
                                    }
                                    if (!t.llIIlIIIllIlI(bs ? 1 : 0) || !t.llIIlIIIllIlI(t.bl() ? 1 : 0)) break block28;
                                    System.out.println(lllIllIlIl[lllIllIllI[2]]);
                                    if (!t.llIIlIIIllIlI(t.bk() ? 1 : 0)) break block29;
                                    BankLocation lllllllllllllllllIllIlIIIlIIlIIl = BankLocation.getNearest();
                                    if (t.llIIlIIIllIll(lllllllllllllllllIllIlIIIlIIlIIl) && t.llIIlIIIllIlI(lllllllllllllllllIllIlIIIlIIlIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllIllIlIl[lllIllIllI[3]];
                                        a.a(lllllllllllllllllIllIlIIIlIIlIIl);
                                    }
                                    if (!t.llIIlIIIllIll(lllllllllllllllllIllIlIIIlIIlIIl) || !t.llIIlIIIllIII(lllllllllllllllllIllIlIIIlIIlIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block29;
                                    if (t.llIIlIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllIllIlIl[lllIllIllI[4]];
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lllIllIllI[5]);
                                        "".length();
                                    }
                                    if (!t.llIIlIIIllIII(Bank.isOpen() ? 1 : 0)) break block29;
                                    AccBuilderTempleTrek.c = lllIllIlIl[lllIllIllI[6]];
                                    if (t.llIIlIIIlllII(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lllIllIllI[3]);
                                        "".length();
                                    }
                                    if (t.llIIlIIIlllII(Equipment.getAll().size()) && t.llIIlIIIllIlI(t.bl() ? 1 : 0)) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lllIllIllI[2]);
                                        "".length();
                                    }
                                    int[] nArray = new int[lllIllIllI[1]];
                                    nArray[t.lllIllIllI[0]] = dt;
                                    if (!t.llIIlIIIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                    int[] nArray2 = new int[lllIllIllI[1]];
                                    nArray2[t.lllIllIllI[0]] = dt;
                                    if (!t.llIIlIIIlllIl(Inventory.getCount((int[])nArray2), lllIllIllI[1])) break block31;
                                }
                                int[] nArray = new int[lllIllIllI[1]];
                                nArray[t.lllIllIllI[0]] = ds;
                                if (!t.llIIlIIIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                                int[] nArray3 = new int[lllIllIllI[1]];
                                nArray3[t.lllIllIllI[0]] = ds;
                                if (!t.llIIlIIIllIII(Inventory.contains((int[])nArray3) ? 1 : 0)) break block31;
                            }
                            int[] nArray = new int[lllIllIllI[1]];
                            nArray[t.lllIllIllI[0]] = lllIllIllI[7];
                            if (!t.llIIlIIIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                            int[] nArray4 = new int[lllIllIllI[1]];
                            nArray4[t.lllIllIllI[0]] = lllIllIllI[7];
                            if (!t.llIIlIIIlllIl(Inventory.getCount((int[])nArray4), lllIllIllI[1])) break block31;
                        }
                        int[] nArray = new int[lllIllIllI[1]];
                        nArray[t.lllIllIllI[0]] = lllIllIllI[8];
                        if (!t.llIIlIIIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray5 = new int[lllIllIllI[1]];
                        nArray5[t.lllIllIllI[0]] = lllIllIllI[8];
                        if (!t.llIIlIIIllIIl(Inventory.getCount((int[])nArray5), lllIllIllI[1])) break block34;
                    }
                    t.ae();
                    System.out.println(lllIllIlIl[lllIllIllI[9]]);
                    bs = lllIllIllI[1];
                    return;
                }
                int[] nArray = new int[lllIllIllI[1]];
                nArray[t.lllIllIllI[0]] = ds;
                if (t.llIIlIIIllIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray6 = new int[lllIllIllI[1]];
                    nArray6[t.lllIllIllI[0]] = ds;
                    if (t.llIIlIIIllIIl(Inventory.getCount((int[])nArray6), lllIllIllI[1])) {
                        Bank.withdraw((int)ds, (int)lllIllIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lllIllIllI[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllIllIllI[1]];
                            nArray[t.lllIllIllI[0]] = ds;
                            if (t.llIIlIIIlllII(Inventory.getCount((int[])nArray))) {
                                bl = lllIllIllI[1];
                                "".length();
                                if (null != null) {
                                    return ((0xF4 ^ 0x9C ^ (0xFA ^ 0x86)) & (31 + 122 - 108 + 82 ^ (0x53 ^ 0x38) ^ -" ".length())) != 0;
                                }
                            } else {
                                bl = lllIllIllI[0];
                            }
                            return bl;
                        }, (int)lllIllIllI[5]);
                        "".length();
                    }
                }
                int[] nArray7 = new int[lllIllIllI[1]];
                nArray7[t.lllIllIllI[0]] = dt;
                if (t.llIIlIIIllIII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[lllIllIllI[1]];
                    nArray8[t.lllIllIllI[0]] = dt;
                    if (t.llIIlIIIllIIl(Inventory.getCount((int[])nArray8), lllIllIllI[1])) {
                        Bank.withdraw((int)dt, (int)lllIllIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lllIllIllI[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllIllIllI[1]];
                            nArray[t.lllIllIllI[0]] = dt;
                            if (t.llIIlIIIlllII(Inventory.getCount((int[])nArray))) {
                                bl = lllIllIllI[1];
                                "".length();
                                if (-(0x23 ^ 0x26) >= 0) {
                                    return ((0xC ^ 0x56) & ~(0x24 ^ 0x7E)) != 0;
                                }
                            } else {
                                bl = lllIllIllI[0];
                            }
                            return bl;
                        }, (int)lllIllIllI[5]);
                        "".length();
                    }
                }
                int[] nArray9 = new int[lllIllIllI[1]];
                nArray9[t.lllIllIllI[0]] = lllIllIllI[7];
                if (t.llIIlIIIllIII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    int[] nArray10 = new int[lllIllIllI[1]];
                    nArray10[t.lllIllIllI[0]] = lllIllIllI[7];
                    if (t.llIIlIIIllIIl(Inventory.getCount((int[])nArray10), lllIllIllI[1])) {
                        Bank.withdraw((int)lllIllIllI[7], (int)lllIllIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lllIllIllI[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllIllIllI[1]];
                            nArray[t.lllIllIllI[0]] = lllIllIllI[7];
                            if (t.llIIlIIIlllII(Inventory.getCount((int[])nArray))) {
                                bl = lllIllIllI[1];
                                "".length();
                                if ("   ".length() != "   ".length()) {
                                    return ((59 + 157 - 98 + 95 ^ 76 + 80 - 68 + 43) & (216 + 7 - 2 + 18 ^ 168 + 13 - 62 + 66 ^ -" ".length())) != 0;
                                }
                            } else {
                                bl = lllIllIllI[0];
                            }
                            return bl;
                        }, (int)lllIllIllI[5]);
                        "".length();
                    }
                }
                int[] nArray11 = new int[lllIllIllI[1]];
                nArray11[t.lllIllIllI[0]] = lllIllIllI[8];
                if (t.llIIlIIIllIII(Bank.contains((int[])nArray11) ? 1 : 0)) {
                    int[] nArray12 = new int[lllIllIllI[1]];
                    nArray12[t.lllIllIllI[0]] = lllIllIllI[8];
                    if (t.llIIlIIIllIIl(Inventory.getCount((int[])nArray12), lllIllIllI[1])) {
                        Bank.withdraw((int)lllIllIllI[8], (int)lllIllIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lllIllIllI[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllIllIllI[1]];
                            nArray[t.lllIllIllI[0]] = lllIllIllI[8];
                            if (t.llIIlIIIlllII(Inventory.getCount((int[])nArray))) {
                                bl = lllIllIllI[1];
                                "".length();
                                if ((0xB8 ^ 0xBD) == 0) {
                                    return ((0x59 ^ 0x6D) & ~(0x1A ^ 0x2E)) != 0;
                                }
                            } else {
                                bl = lllIllIllI[0];
                            }
                            return bl;
                        }, (int)lllIllIllI[5]);
                        "".length();
                    }
                }
            }
            if (t.llIIlIIIllIII(t.bk() ? 1 : 0)) {
                if (t.llIIlIIIllIII(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (t.llIIlIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                    if (t.llIIlIIIllIII(GrandExchange.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepTicks((int)lllIllIllI[1]);
                        "".length();
                    }
                    int lllllllllllllllllIllIlIIIlIIlIIl = lllIllIllI[0];
                    while (t.llIIlIIIllIIl(lllllllllllllllllIllIlIIIlIIlIIl, du.length)) {
                        int[] nArray = new int[lllIllIllI[1]];
                        nArray[t.lllIllIllI[0]] = du[lllllllllllllllllIllIlIIIlIIlIIl];
                        Item lllllllllllllllllIllIlIIIlIIlIII = Inventory.getFirst((int[])nArray);
                        if (t.llIIlIIIllIll(lllllllllllllllllIllIlIIIlIIlIII)) {
                            int[] nArray13 = new int[lllIllIllI[1]];
                            nArray13[t.lllIllIllI[0]] = lllllllllllllllllIllIlIIIlIIlIII.getId();
                            if (t.llIIlIIIllIII(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                String[] stringArray = new String[lllIllIllI[1]];
                                stringArray[t.lllIllIllI[0]] = lllIllIlIl[lllIllIllI[10]];
                                if (t.llIIlIIIllIII(lllllllllllllllllIllIlIIIlIIlIII.hasAction(stringArray) ? 1 : 0)) {
                                    lllllllllllllllllIllIlIIIlIIlIII.interact(lllIllIlIl[lllIllIllI[11]]);
                                    Time.sleepTicks((int)lllIllIllI[1]);
                                    "".length();
                                }
                                String[] stringArray2 = new String[lllIllIllI[1]];
                                stringArray2[t.lllIllIllI[0]] = lllIllIlIl[lllIllIllI[12]];
                                if (t.llIIlIIIllIII(lllllllllllllllllIllIlIIIlIIlIII.hasAction(stringArray2) ? 1 : 0)) {
                                    lllllllllllllllllIllIlIIIlIIlIII.interact(lllIllIlIl[lllIllIllI[13]]);
                                    Time.sleepTicks((int)lllIllIllI[1]);
                                    "".length();
                                }
                                String[] stringArray3 = new String[lllIllIllI[1]];
                                stringArray3[t.lllIllIllI[0]] = lllIllIlIl[lllIllIllI[14]];
                                if (t.llIIlIIIllIII(lllllllllllllllllIllIlIIIlIIlIII.hasAction(stringArray3) ? 1 : 0)) {
                                    lllllllllllllllllIllIlIIIlIIlIII.interact(lllIllIlIl[lllIllIllI[15]]);
                                    Time.sleepTicks((int)lllIllIllI[1]);
                                    "".length();
                                }
                                Time.sleepTicks((int)lllIllIllI[1]);
                                "".length();
                            }
                        }
                        ++lllllllllllllllllIllIlIIIlIIlIIl;
                        "".length();
                        if (-" ".length() == -" ".length()) continue;
                        return;
                    }
                    if (t.llIIlIIIllIII(t.bl() ? 1 : 0) && t.llIIlIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lllIllIllI[16]);
                        "".length();
                    }
                }
            }
        }
    }

    private static void llIIlIIIlIllI() {
        lllIllIlIl = new String[lllIllIllI[43]];
        t.lllIllIlIl[t.lllIllIllI[0]] = t.llIIlIIIlIIll("EOQm+FzL8egSpu2L6aHFxQ==", "YHtVV");
        t.lllIllIlIl[t.lllIllIllI[1]] = t.llIIlIIIlIIll("aXNXImrYP74SC6IRDCpi+3Dt77jz/Of4GkOnpRhOY7T1bjnLQNeeorl76vyHItIfogzba0du99M=", "PRKBO");
        t.lllIllIlIl[t.lllIllIllI[2]] = t.llIIlIIIlIIll("95+SQD6w5IU6ijtaqJJbBywA19D7LRdd", "AVXMW");
        t.lllIllIlIl[t.lllIllIllI[3]] = t.llIIlIIIlIlII("GQwOEBA2GREXEHcZF1kVNgMT", "Wmxyw");
        t.lllIllIlIl[t.lllIllIllI[4]] = t.llIIlIIIlIlII("ISASOSgAN1c1IAA7", "nPwWA");
        t.lllIllIlIl[t.lllIllIllI[6]] = t.llIIlIIIlIlIl("lkrVDPWsKbst2teU+eptcy9S/u/xSgmd", "gYNEV");
        t.lllIllIlIl[t.lllIllIllI[9]] = t.llIIlIIIlIlII("ICxzJQoSaT4tCwQgPSNYBDwjNBQeLCBoWAQ+OjAbHyA9I1gDJnMGLS4AHQNYIj06KA==", "wISDx");
        t.lllIllIlIl[t.lllIllIllI[10]] = t.llIIlIIIlIIll("Z5GiBVYRjxA=", "bLqbx");
        t.lllIllIlIl[t.lllIllIllI[11]] = t.llIIlIIIlIIll("QOsulTdCVb4=", "jEtxQ");
        t.lllIllIlIl[t.lllIllIllI[12]] = t.llIIlIIIlIlII("Lx0vDiM=", "xtJbG");
        t.lllIllIlIl[t.lllIllIllI[13]] = t.llIIlIIIlIIll("0hYm0YPZ41k=", "ueuik");
        t.lllIllIlIl[t.lllIllIllI[14]] = t.llIIlIIIlIIll("f83oqXfL52g=", "fLFtY");
        t.lllIllIlIl[t.lllIllIllI[15]] = t.llIIlIIIlIIll("0ig0sRgEbT0=", "KsdOw");
        t.lllIllIlIl[t.lllIllIllI[17]] = t.llIIlIIIlIlII("Mi4yPzJBNTV5NQgo", "aZSYT");
        t.lllIllIlIl[t.lllIllIllI[18]] = t.llIIlIIIlIIll("G7cwBGrrKBVRjcaiklExqw==", "ywImY");
        t.lllIllIlIl[t.lllIllIllI[19]] = t.llIIlIIIlIlIl("p9zxkAvy/nL8h7idYs3eoQ==", "Yhkyw");
        t.lllIllIlIl[t.lllIllIllI[20]] = t.llIIlIIIlIIll("70dsapR+UPpaDHkFUFyEeA==", "wEgft");
        t.lllIllIlIl[t.lllIllIllI[38]] = t.llIIlIIIlIlIl("c6OZWDLW7qM=", "unlPh");
        t.lllIllIlIl[t.lllIllIllI[39]] = t.llIIlIIIlIlIl("Xjy5lQlzqns=", "LPyAX");
        t.lllIllIlIl[t.lllIllIllI[40]] = t.llIIlIIIlIIll("PLhDW2KbCM+/L83WkVn7K8SszOnHpU1j", "XNQyn");
    }

    private static String llIIlIIIlIlII(String lllllllllllllllllIllIlIIIIlllIIl, String lllllllllllllllllIllIlIIIIllIIll) {
        lllllllllllllllllIllIlIIIIlllIIl = new String(Base64.getDecoder().decode(lllllllllllllllllIllIlIIIIlllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIllIlIIIIllIlll = new StringBuilder();
        char[] lllllllllllllllllIllIlIIIIllIllI = lllllllllllllllllIllIlIIIIllIIll.toCharArray();
        int lllllllllllllllllIllIlIIIIllIlIl = lllIllIllI[0];
        char[] lllllllllllllllllIllIlIIIIlIllll = lllllllllllllllllIllIlIIIIlllIIl.toCharArray();
        int lllllllllllllllllIllIlIIIIlIlllI = lllllllllllllllllIllIlIIIIlIllll.length;
        int lllllllllllllllllIllIlIIIIlIllIl = lllIllIllI[0];
        while (t.llIIlIIIllIIl(lllllllllllllllllIllIlIIIIlIllIl, lllllllllllllllllIllIlIIIIlIlllI)) {
            char lllllllllllllllllIllIlIIIIlllIlI = lllllllllllllllllIllIlIIIIlIllll[lllllllllllllllllIllIlIIIIlIllIl];
            lllllllllllllllllIllIlIIIIllIlll.append((char)(lllllllllllllllllIllIlIIIIlllIlI ^ lllllllllllllllllIllIlIIIIllIllI[lllllllllllllllllIllIlIIIIllIlIl % lllllllllllllllllIllIlIIIIllIllI.length]));
            "".length();
            ++lllllllllllllllllIllIlIIIIllIlIl;
            ++lllllllllllllllllIllIlIIIIlIllIl;
            "".length();
            if (-" ".length() >= -" ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIllIlIIIIllIlll);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean bk() {
        int n2;
        String[] stringArray = new String[lllIllIllI[1]];
        stringArray[t.lllIllIllI[0]] = lllIllIlIl[lllIllIllI[17]];
        if (t.llIIlIIIllIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lllIllIllI[1]];
            nArray[t.lllIllIllI[0]] = lllIllIllI[8];
            if (t.llIIlIIIllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lllIllIllI[1]];
                stringArray2[t.lllIllIllI[0]] = lllIllIlIl[lllIllIllI[18]];
                if (t.llIIlIIIllIII(Inventory.contains((String[])stringArray2) ? 1 : 0) && t.llIIlIIIllIII(Inventory.contains((int[])f.aM) ? 1 : 0)) {
                    n2 = lllIllIllI[1];
                    "".length();
                    if (null == null) return n2 != 0;
                    return ((0x7D ^ 0x49) & ~(0x44 ^ 0x70)) != 0;
                }
            }
        }
        n2 = lllIllIllI[0];
        return n2 != 0;
    }
}

