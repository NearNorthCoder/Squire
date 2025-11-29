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
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.a;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.b;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.d;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.f;
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

public class m {
    public static /* synthetic */ boolean by;
    private static /* synthetic */ int cr;
    private static /* synthetic */ int[] lIIIlllllllII;
    private static /* synthetic */ int cq;
    private static /* synthetic */ String[] lIIIllllllIll;
    private static /* synthetic */ int[] cs;
    public static /* synthetic */ List<d> bA;

    private static boolean lIlIIllIlIlIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIllIlIlIllI(int n2) {
        return n2 > 0;
    }

    private static String lIlIIllIlIIllIl(String var2, String var9) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), lIIIlllllllII[11]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(lIIIlllllllII[2], var17);
            return new String(var11.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllIlIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIIllIlIIllll(String var19, String var16) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(lIIIlllllllII[2], var3);
            return new String(var14.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllIlIlIlII(int n2) {
        return n2 == 0;
    }

    public static void W() {
        d var4;
        Object var7;
        int[] nArray = new int[lIIIlllllllII[1]];
        nArray[m.lIIIlllllllII[0]] = cq;
        if (m.lIlIIllIlIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(cq, lIIIlllllllII[1], lIIIlllllllII[21]);
            bA.add(d2);
            0;
        }
        int[] nArray2 = new int[lIIIlllllllII[1]];
        nArray2[m.lIIIlllllllII[0]] = cr;
        if (m.lIlIIllIlIlIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var7 = new d(cr, lIIIlllllllII[1], lIIIlllllllII[22]);
            bA.add((d)var7);
            0;
        }
        int[] nArray3 = new int[lIIIlllllllII[1]];
        nArray3[m.lIIIlllllllII[0]] = lIIIlllllllII[8];
        if (m.lIlIIllIlIlIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var7 = new d(lIIIlllllllII[8], lIIIlllllllII[1], lIIIlllllllII[23]);
            bA.add((d)var7);
            0;
        }
        int[] nArray4 = new int[lIIIlllllllII[1]];
        nArray4[m.lIIIlllllllII[0]] = lIIIlllllllII[7];
        if (m.lIlIIllIlIlIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var7 = new d(lIIIlllllllII[7], lIIIlllllllII[1], lIIIlllllllII[24]);
            bA.add((d)var7);
            0;
        }
        int[] nArray5 = new int[lIIIlllllllII[1]];
        nArray5[m.lIIIlllllllII[0]] = lIIIlllllllII[25];
        if (m.lIlIIllIlIlIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var7 = new d(lIIIlllllllII[25], lIIIlllllllII[5], lIIIlllllllII[13]);
            bA.add((d)var7);
            0;
        }
        int[] nArray6 = new int[lIIIlllllllII[1]];
        nArray6[m.lIIIlllllllII[0]] = lIIIlllllllII[26];
        if (m.lIlIIllIlIlIlII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var7 = new d(lIIIlllllllII[26], lIIIlllllllII[27], lIIIlllllllII[13]);
            bA.add((d)var7);
            0;
        }
        int[] nArray7 = new int[lIIIlllllllII[1]];
        nArray7[m.lIIIlllllllII[0]] = lIIIlllllllII[28];
        if (m.lIlIIllIlIlIlII(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var7 = new d(lIIIlllllllII[28], lIIIlllllllII[29], lIIIlllllllII[13]);
            bA.add((d)var7);
            0;
        }
        int[] nArray8 = new int[lIIIlllllllII[1]];
        nArray8[m.lIIIlllllllII[0]] = lIIIlllllllII[30];
        if (m.lIlIIllIlIlIlII(Bank.contains((int[])nArray8) ? 1 : 0)) {
            var7 = new d(lIIIlllllllII[30], lIIIlllllllII[31], lIIIlllllllII[13]);
            bA.add((d)var7);
            0;
        }
        int[] nArray9 = new int[lIIIlllllllII[1]];
        nArray9[m.lIIIlllllllII[0]] = lIIIlllllllII[25];
        if (m.lIlIIllIlIlIIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
            int[] nArray10 = new int[lIIIlllllllII[1]];
            nArray10[m.lIIIlllllllII[0]] = lIIIlllllllII[25];
            if (m.lIlIIllIlIlIIll(Bank.getFirst((int[])nArray10).getQuantity(), lIIIlllllllII[32])) {
                var7 = new d(lIIIlllllllII[25], lIIIlllllllII[5], lIIIlllllllII[13]);
                bA.add((d)var7);
                0;
            }
        }
        int[] nArray11 = new int[lIIIlllllllII[1]];
        nArray11[m.lIIIlllllllII[0]] = lIIIlllllllII[26];
        if (m.lIlIIllIlIlIIlI(Bank.contains((int[])nArray11) ? 1 : 0)) {
            int[] nArray12 = new int[lIIIlllllllII[1]];
            nArray12[m.lIIIlllllllII[0]] = lIIIlllllllII[26];
            if (m.lIlIIllIlIlIIll(Bank.getFirst((int[])nArray12).getQuantity(), lIIIlllllllII[32])) {
                var7 = new d(lIIIlllllllII[26], lIIIlllllllII[27], lIIIlllllllII[13]);
                bA.add((d)var7);
                0;
            }
        }
        int[] nArray13 = new int[lIIIlllllllII[1]];
        nArray13[m.lIIIlllllllII[0]] = lIIIlllllllII[28];
        if (m.lIlIIllIlIlIIlI(Bank.contains((int[])nArray13) ? 1 : 0)) {
            int[] nArray14 = new int[lIIIlllllllII[1]];
            nArray14[m.lIIIlllllllII[0]] = lIIIlllllllII[28];
            if (m.lIlIIllIlIlIIll(Bank.getFirst((int[])nArray14).getQuantity(), lIIIlllllllII[32])) {
                var7 = new d(lIIIlllllllII[28], lIIIlllllllII[29], lIIIlllllllII[13]);
                bA.add((d)var7);
                0;
            }
        }
        int[] nArray15 = new int[lIIIlllllllII[1]];
        nArray15[m.lIIIlllllllII[0]] = lIIIlllllllII[30];
        if (m.lIlIIllIlIlIIlI(Bank.contains((int[])nArray15) ? 1 : 0)) {
            int[] nArray16 = new int[lIIIlllllllII[1]];
            nArray16[m.lIIIlllllllII[0]] = lIIIlllllllII[30];
            if (m.lIlIIllIlIlIIll(Bank.getFirst((int[])nArray16).getQuantity(), lIIIlllllllII[32])) {
                var7 = new d(lIIIlllllllII[30], lIIIlllllllII[31], lIIIlllllllII[13]);
                bA.add((d)var7);
                0;
            }
        }
        if (m.lIlIIllIlIlIlII(Bank.contains((Predicate)(var7 = item -> item.getName().toLowerCase().contains(lIIIllllllIll[lIIIlllllllII[40]]))) ? 1 : 0)) {
            var4 = new d(lIIIlllllllII[33], lIIIlllllllII[6], lIIIlllllllII[34]);
            bA.add(var4);
            0;
        }
        int[] nArray17 = new int[lIIIlllllllII[1]];
        nArray17[m.lIIIlllllllII[0]] = lIIIlllllllII[35];
        if (m.lIlIIllIlIlIlII(Bank.contains((int[])nArray17) ? 1 : 0)) {
            var4 = new d(lIIIlllllllII[35], lIIIlllllllII[36], lIIIlllllllII[37]);
            bA.add(var4);
            0;
        }
    }

    private static boolean lIlIIllIlIlIlIl(Object object) {
        return object != null;
    }

    private static boolean lIlIIllIlIlIIlI(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean av() {
        int n2;
        String[] stringArray = new String[lIIIlllllllII[1]];
        stringArray[m.lIIIlllllllII[0]] = lIIIllllllIll[lIIIlllllllII[19]];
        if (m.lIlIIllIlIlIIlI(Equipment.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lIIIlllllllII[1]];
            nArray[m.lIIIlllllllII[0]] = lIIIlllllllII[8];
            if (m.lIlIIllIlIlIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIIlllllllII[1]];
                nArray2[m.lIIIlllllllII[0]] = lIIIlllllllII[7];
                if (m.lIlIIllIlIlIIlI(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIIlllllllII[1]];
                    stringArray2[m.lIIIlllllllII[0]] = lIIIllllllIll[lIIIlllllllII[20]];
                    if (m.lIlIIllIlIlIIlI(Equipment.contains((String[])stringArray2) ? 1 : 0)) {
                        n2 = lIIIlllllllII[1];
                        0;
                        if (3 == 3) return n2 != 0;
                        return false;
                    }
                }
            }
        }
        n2 = lIIIlllllllII[0];
        return n2 != 0;
    }

    static {
        m.lIlIIllIlIlIIIl();
        m.lIlIIllIlIlIIII();
        bA = new ArrayList<d>();
        cq = lIIIlllllllII[41];
        cr = lIIIlllllllII[42];
        int[] nArray = new int[lIIIlllllllII[4]];
        nArray[m.lIIIlllllllII[0]] = cq;
        nArray[m.lIIIlllllllII[1]] = cr;
        nArray[m.lIIIlllllllII[2]] = lIIIlllllllII[8];
        nArray[m.lIIIlllllllII[3]] = lIIIlllllllII[7];
        cs = nArray;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean au() {
        int n2;
        String[] stringArray = new String[lIIIlllllllII[1]];
        stringArray[m.lIIIlllllllII[0]] = lIIIllllllIll[lIIIlllllllII[17]];
        if (m.lIlIIllIlIlIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lIIIlllllllII[1]];
            nArray[m.lIIIlllllllII[0]] = lIIIlllllllII[8];
            if (m.lIlIIllIlIlIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lIIIlllllllII[1]];
                stringArray2[m.lIIIlllllllII[0]] = lIIIllllllIll[lIIIlllllllII[18]];
                if (m.lIlIIllIlIlIIlI(Inventory.contains((String[])stringArray2) ? 1 : 0) && m.lIlIIllIlIlIIlI(Inventory.contains((int[])f.aS) ? 1 : 0)) {
                    n2 = lIIIlllllllII[1];
                    0;
                    if (null == null) return n2 != 0;
                    return ((0xD0 ^ 0xA8 ^ (0xF6 ^ 0x84)) & (84 + 67 - 53 + 32 ^ 77 + 101 - 98 + 56 ^ -1)) != 0;
                }
            }
        }
        n2 = lIIIlllllllII[0];
        return n2 != 0;
    }

    private static void lIlIIllIlIlIIIl() {
        lIIIlllllllII = new int[44];
        m.lIIIlllllllII[0] = (0x4B ^ 0x4F ^ (0x49 ^ 0x6C)) & (107 + 144 - 187 + 92 ^ 185 + 40 - 104 + 68 ^ -1);
        m.lIIIlllllllII[1] = 1;
        m.lIIIlllllllII[2] = 2;
        m.lIIIlllllllII[3] = 3;
        m.lIIIlllllllII[4] = 0x91 ^ 0x95;
        m.lIIIlllllllII[5] = 0xFFFFFFA9 & 0x13DE;
        m.lIIIlllllllII[6] = 0x67 ^ 0x62;
        m.lIIIlllllllII[7] = -(0xFFFFF7DF & 0x5E27) & (0xFFFFFFFE & 0x5FFF);
        m.lIIIlllllllII[8] = 0xFFFFFEA8 & 0x7FF;
        m.lIIIlllllllII[9] = 102 + 180 - 243 + 149 ^ 148 + 17 - -12 + 9;
        m.lIIIlllllllII[10] = 96 + 136 - 125 + 48 ^ 154 + 131 - 196 + 67;
        m.lIIIlllllllII[11] = 0x3F ^ 0x71 ^ (0x7A ^ 0x3C);
        m.lIIIlllllllII[12] = 0x28 ^ 0x60 ^ (0x64 ^ 0x25);
        m.lIIIlllllllII[13] = 103 + 131 - 130 + 38 ^ 74 + 52 - 34 + 40;
        m.lIIIlllllllII[14] = 0x31 ^ 0x3A;
        m.lIIIlllllllII[15] = 0xD3 ^ 0xA1 ^ (0x6A ^ 0x14);
        m.lIIIlllllllII[16] = -(0xFFFFC7FB & 0x3A1F) & (0xFFFFBF7F & 0x5BFE);
        m.lIIIlllllllII[17] = 82 + 44 - 94 + 112 ^ 18 + 153 - 21 + 7;
        m.lIIIlllllllII[18] = 0xC9 ^ 0xC7;
        m.lIIIlllllllII[19] = 3 + 188 - 90 + 101 ^ 82 + 116 - 80 + 79;
        m.lIIIlllllllII[20] = 0x6A ^ 0x7A;
        m.lIIIlllllllII[21] = 0xFFFFF0FF & 0x2FDA;
        m.lIIIlllllllII[22] = 0xFFFF9DEF & 0x67F6;
        m.lIIIlllllllII[23] = -(0xFFFF90BF & 0x7FE2) & (0xFFFFFFFF & Short.MAX_VALUE);
        m.lIIIlllllllII[24] = -(0xFFFFBAF7 & 0x4F3A) & (0xFFFFFFFB & 0x1F7F);
        m.lIIIlllllllII[25] = 0xFFFFF7FF & 0xA2E;
        m.lIIIlllllllII[26] = 0xFFFFE2EB & 0x1F3F;
        m.lIIIlllllllII[27] = 0xFFFFFFFE & 0xBB9;
        m.lIIIlllllllII[28] = -(0xFFFFDBF5 & 0x7DDB) & (0xFFFFFFFD & 0x5BFF);
        m.lIIIlllllllII[29] = -(0x29 ^ 0x2C) & (0xFFFFEFA4 & 0x1FFF);
        m.lIIIlllllllII[30] = -(0xFFFFFCDB & 0x7FF6) & (0xFFFFFFFB & 0x7EFF);
        m.lIIIlllllllII[31] = 0xFFFFDF65 & 0x3FDA;
        m.lIIIlllllllII[32] = -(0xFFFFF642 & 0x6DBF) & (0xFFFFE7FF & 0x7DF5);
        m.lIIIlllllllII[33] = 0xFFFFFFEF & 0x2EDC;
        m.lIIIlllllllII[34] = -(0xFFFFDFCF & 0x3438) & (0xFFFFFDAF & 0x77FF);
        m.lIIIlllllllII[35] = -(0xFFFFE591 & 0x7AFF) & (0xFFFFFFD7 & Short.MAX_VALUE);
        m.lIIIlllllllII[36] = 0xFFFFEBD9 & 0x15B6;
        m.lIIIlllllllII[37] = 0xFFFFFB96 & 0x7ED;
        m.lIIIlllllllII[38] = 99 + 2 - 70 + 141 ^ 46 + 129 - -2 + 12;
        m.lIIIlllllllII[39] = 0x21 ^ 0x33;
        m.lIIIlllllllII[40] = 9 ^ 0x5F ^ (0x2B ^ 0x6E);
        m.lIIIlllllllII[41] = -(0xFFFFFFD5 & 0x70BB) & (0xFFFFF7F7 & 0x7DFD);
        m.lIIIlllllllII[42] = -(0xFFFF9BC7 & 0x76FD) & (0xFFFFD6FF & 0x3FE7);
        m.lIIIlllllllII[43] = 0x6F ^ 0x7B;
    }

    public static void at() {
        block28: {
            block29: {
                block34: {
                    block31: {
                        block33: {
                            block32: {
                                block30: {
                                    if (m.lIlIIllIlIlIIlI(by ? 1 : 0)) {
                                        AccBuilderRat.c = lIIIllllllIll[lIIIlllllllII[0]];
                                        b.a(bA);
                                        if (m.lIlIIllIlIlIIll(bA.size(), lIIIlllllllII[1])) {
                                            System.out.println(lIIIllllllIll[lIIIlllllllII[1]]);
                                            by = lIIIlllllllII[0];
                                        }
                                    }
                                    if (!m.lIlIIllIlIlIlII(by ? 1 : 0) || !m.lIlIIllIlIlIlII(m.av() ? 1 : 0)) break block28;
                                    System.out.println(lIIIllllllIll[lIIIlllllllII[2]]);
                                    if (!m.lIlIIllIlIlIlII(m.au() ? 1 : 0)) break block29;
                                    BankLocation var22 = BankLocation.getNearest();
                                    if (m.lIlIIllIlIlIlIl(var22) && m.lIlIIllIlIlIlII(var22.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIIllllllIll[lIIIlllllllII[3]];
                                        a.a(var22);
                                    }
                                    if (!m.lIlIIllIlIlIlIl(var22) || !m.lIlIIllIlIlIIlI(var22.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block29;
                                    if (m.lIlIIllIlIlIlII(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderRat.c = lIIIllllllIll[lIIIlllllllII[4]];
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllllllII[5]);
                                        0;
                                    }
                                    if (!m.lIlIIllIlIlIIlI(Bank.isOpen() ? 1 : 0)) break block29;
                                    AccBuilderRat.c = lIIIllllllIll[lIIIlllllllII[6]];
                                    if (m.lIlIIllIlIlIllI(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lIIIlllllllII[3]);
                                        0;
                                    }
                                    if (m.lIlIIllIlIlIllI(Equipment.getAll().size()) && m.lIlIIllIlIlIlII(m.av() ? 1 : 0)) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lIIIlllllllII[2]);
                                        0;
                                    }
                                    int[] nArray = new int[lIIIlllllllII[1]];
                                    nArray[m.lIIIlllllllII[0]] = cr;
                                    if (!m.lIlIIllIlIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                    int[] nArray2 = new int[lIIIlllllllII[1]];
                                    nArray2[m.lIIIlllllllII[0]] = cr;
                                    if (!m.lIlIIllIlIlIlll(Inventory.getCount((int[])nArray2), lIIIlllllllII[1])) break block31;
                                }
                                int[] nArray = new int[lIIIlllllllII[1]];
                                nArray[m.lIIIlllllllII[0]] = cq;
                                if (!m.lIlIIllIlIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                                int[] nArray3 = new int[lIIIlllllllII[1]];
                                nArray3[m.lIIIlllllllII[0]] = cq;
                                if (!m.lIlIIllIlIlIIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block31;
                            }
                            int[] nArray = new int[lIIIlllllllII[1]];
                            nArray[m.lIIIlllllllII[0]] = lIIIlllllllII[7];
                            if (!m.lIlIIllIlIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                            int[] nArray4 = new int[lIIIlllllllII[1]];
                            nArray4[m.lIIIlllllllII[0]] = lIIIlllllllII[7];
                            if (!m.lIlIIllIlIlIlll(Inventory.getCount((int[])nArray4), lIIIlllllllII[1])) break block31;
                        }
                        int[] nArray = new int[lIIIlllllllII[1]];
                        nArray[m.lIIIlllllllII[0]] = lIIIlllllllII[8];
                        if (!m.lIlIIllIlIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray5 = new int[lIIIlllllllII[1]];
                        nArray5[m.lIIIlllllllII[0]] = lIIIlllllllII[8];
                        if (!m.lIlIIllIlIlIIll(Inventory.getCount((int[])nArray5), lIIIlllllllII[1])) break block34;
                    }
                    m.W();
                    System.out.println(lIIIllllllIll[lIIIlllllllII[9]]);
                    by = lIIIlllllllII[1];
                    return;
                }
                int[] nArray = new int[lIIIlllllllII[1]];
                nArray[m.lIIIlllllllII[0]] = cq;
                if (m.lIlIIllIlIlIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray6 = new int[lIIIlllllllII[1]];
                    nArray6[m.lIIIlllllllII[0]] = cq;
                    if (m.lIlIIllIlIlIIll(Inventory.getCount((int[])nArray6), lIIIlllllllII[1])) {
                        Bank.withdraw((int)cq, (int)lIIIlllllllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIIIlllllllII[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlllllllII[1]];
                            nArray[m.lIIIlllllllII[0]] = cq;
                            if (m.lIlIIllIlIlIllI(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlllllllII[1];
                                0;
                                
                                }
                            } else {
                                bl = lIIIlllllllII[0];
                            }
                            return bl;
                        }, (int)lIIIlllllllII[5]);
                        0;
                    }
                }
                int[] nArray7 = new int[lIIIlllllllII[1]];
                nArray7[m.lIIIlllllllII[0]] = cr;
                if (m.lIlIIllIlIlIIlI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[lIIIlllllllII[1]];
                    nArray8[m.lIIIlllllllII[0]] = cr;
                    if (m.lIlIIllIlIlIIll(Inventory.getCount((int[])nArray8), lIIIlllllllII[1])) {
                        Bank.withdraw((int)cr, (int)lIIIlllllllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIIIlllllllII[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlllllllII[1]];
                            nArray[m.lIIIlllllllII[0]] = cr;
                            if (m.lIlIIllIlIlIllI(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlllllllII[1];
                                0;
                                if (1 >= 3) {
                                    return ((0x5E ^ 0x6F ^ (0x2A ^ 0x27)) & (99 + 60 - 95 + 80 ^ 140 + 50 - 39 + 21 ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIIlllllllII[0];
                            }
                            return bl;
                        }, (int)lIIIlllllllII[5]);
                        0;
                    }
                }
                int[] nArray9 = new int[lIIIlllllllII[1]];
                nArray9[m.lIIIlllllllII[0]] = lIIIlllllllII[7];
                if (m.lIlIIllIlIlIIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    int[] nArray10 = new int[lIIIlllllllII[1]];
                    nArray10[m.lIIIlllllllII[0]] = lIIIlllllllII[7];
                    if (m.lIlIIllIlIlIIll(Inventory.getCount((int[])nArray10), lIIIlllllllII[1])) {
                        Bank.withdraw((int)lIIIlllllllII[7], (int)lIIIlllllllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIIIlllllllII[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlllllllII[1]];
                            nArray[m.lIIIlllllllII[0]] = lIIIlllllllII[7];
                            if (m.lIlIIllIlIlIllI(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlllllllII[1];
                                0;
                                if (-1 > 1) {
                                    return ((0x76 ^ 0x21 ^ (0x12 ^ 0x5D)) & (0x80 ^ 0x9B ^ 3 ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIIlllllllII[0];
                            }
                            return bl;
                        }, (int)lIIIlllllllII[5]);
                        0;
                    }
                }
                int[] nArray11 = new int[lIIIlllllllII[1]];
                nArray11[m.lIIIlllllllII[0]] = lIIIlllllllII[8];
                if (m.lIlIIllIlIlIIlI(Bank.contains((int[])nArray11) ? 1 : 0)) {
                    int[] nArray12 = new int[lIIIlllllllII[1]];
                    nArray12[m.lIIIlllllllII[0]] = lIIIlllllllII[8];
                    if (m.lIlIIllIlIlIIll(Inventory.getCount((int[])nArray12), lIIIlllllllII[1])) {
                        Bank.withdraw((int)lIIIlllllllII[8], (int)lIIIlllllllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIIIlllllllII[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlllllllII[1]];
                            nArray[m.lIIIlllllllII[0]] = lIIIlllllllII[8];
                            if (m.lIlIIllIlIlIllI(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlllllllII[1];
                                0;
                                if ((0x91 ^ 0x87 ^ (0xA5 ^ 0xB6)) <= 0) {
                                    return ((0x40 ^ 0x39 ^ (0xF3 ^ 0x99)) & (0x54 ^ 0x38 ^ 15 + 70 - 76 + 118 ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIIlllllllII[0];
                            }
                            return bl;
                        }, (int)lIIIlllllllII[5]);
                        0;
                    }
                }
            }
            if (m.lIlIIllIlIlIIlI(m.au() ? 1 : 0)) {
                if (m.lIlIIllIlIlIIlI(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (m.lIlIIllIlIlIlII(Bank.isOpen() ? 1 : 0)) {
                    if (m.lIlIIllIlIlIIlI(GrandExchange.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepTicks((int)lIIIlllllllII[1]);
                        0;
                    }
                    int var22 = lIIIlllllllII[0];
                    while (m.lIlIIllIlIlIIll(var22, cs.length)) {
                        int[] nArray = new int[lIIIlllllllII[1]];
                        nArray[m.lIIIlllllllII[0]] = cs[var22];
                        Item var12 = Inventory.getFirst((int[])nArray);
                        if (m.lIlIIllIlIlIlIl(var12)) {
                            int[] nArray13 = new int[lIIIlllllllII[1]];
                            nArray13[m.lIIIlllllllII[0]] = var12.getId();
                            if (m.lIlIIllIlIlIIlI(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                String[] stringArray = new String[lIIIlllllllII[1]];
                                stringArray[m.lIIIlllllllII[0]] = lIIIllllllIll[lIIIlllllllII[10]];
                                if (m.lIlIIllIlIlIIlI(var12.hasAction(stringArray) ? 1 : 0)) {
                                    var12.interact(lIIIllllllIll[lIIIlllllllII[11]]);
                                    Time.sleepTicks((int)lIIIlllllllII[1]);
                                    0;
                                }
                                String[] stringArray2 = new String[lIIIlllllllII[1]];
                                stringArray2[m.lIIIlllllllII[0]] = lIIIllllllIll[lIIIlllllllII[12]];
                                if (m.lIlIIllIlIlIIlI(var12.hasAction(stringArray2) ? 1 : 0)) {
                                    var12.interact(lIIIllllllIll[lIIIlllllllII[13]]);
                                    Time.sleepTicks((int)lIIIlllllllII[1]);
                                    0;
                                }
                                String[] stringArray3 = new String[lIIIlllllllII[1]];
                                stringArray3[m.lIIIlllllllII[0]] = lIIIllllllIll[lIIIlllllllII[14]];
                                if (m.lIlIIllIlIlIIlI(var12.hasAction(stringArray3) ? 1 : 0)) {
                                    var12.interact(lIIIllllllIll[lIIIlllllllII[15]]);
                                    Time.sleepTicks((int)lIIIlllllllII[1]);
                                    0;
                                }
                                Time.sleepTicks((int)lIIIlllllllII[1]);
                                0;
                            }
                        }
                        ++var22;
                        0;
                        if ((0xB0 ^ 0x99 ^ (0x5E ^ 0x73)) <= (0x14 ^ 0x69 ^ (0x53 ^ 0x2A))) continue;
                        return;
                    }
                    if (m.lIlIIllIlIlIIlI(m.av() ? 1 : 0) && m.lIlIIllIlIlIlII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllllllII[16]);
                        0;
                    }
                }
            }
        }
    }

    private static void lIlIIllIlIlIIII() {
        lIIIllllllIll = new String[lIIIlllllllII[43]];
        m.lIIIllllllIll[m.lIIIlllllllII[0]] = m."Buying items";
        m.lIIIllllllIll[m.lIIIlllllllII[1]] = m."Finished buying items, switching back to gearing";
        m.lIIIllllllIll[m.lIIIlllllllII[2]] = m."Get Mage Gear Util";
        m.lIIIllllllIll[m.lIIIlllllllII[3]] = m."Navigating to bank";
        m.lIIIllllllIll[m.lIIIlllllllII[4]] = m."Opening bank";
        m.lIIIllllllIll[m.lIIIlllllllII[6]] = m."Handling banking";
        m.lIIIllllllIll[m.lIIIlllllllII[9]] = m."We are missing supplies, switching to BUYING Util";
        m.lIIIllllllIll[m.lIIIlllllllII[10]] = m."Wear";
        m.lIIIllllllIll[m.lIIIlllllllII[11]] = m."Wear";
        m.lIIIllllllIll[m.lIIIlllllllII[12]] = m."Wield";
        m.lIIIllllllIll[m.lIIIlllllllII[13]] = m."Wield";
        m.lIIIllllllIll[m.lIIIlllllllII[14]] = m."Equip";
        m.lIIIllllllIll[m.lIIIlllllllII[15]] = m."Equip";
        m.lIIIllllllIll[m.lIIIlllllllII[17]] = m."Staff of air";
        m.lIIIllllllIll[m.lIIIlllllllII[18]] = m."Leather gloves";
        m.lIIIllllllIll[m.lIIIlllllllII[19]] = m."Staff of air";
        m.lIIIllllllIll[m.lIIIlllllllII[20]] = m."Leather gloves";
        m.lIIIllllllIll[m.lIIIlllllllII[38]] = m."Wear";
        m.lIIIllllllIll[m.lIIIlllllllII[39]] = m."Wear";
        m.lIIIllllllIll[m.lIIIlllllllII[40]] = m."ring of wealth (";
    }

    private static String lIlIIllIlIIlllI(String var18, String var5) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var13 = var5.toCharArray();
        int var1 = lIIIlllllllII[0];
        char[] var8 = var18.toCharArray();
        int var23 = var8.length;
        int var21 = lIIIlllllllII[0];
        while (m.lIlIIllIlIlIIll(var21, var23)) {
            char var15 = var8[var21];
            var20.append((char)(var15 ^ var13[var1 % var13.length]));
            0;
            ++var1;
            ++var21;
            0;
            if (1 > 0) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    public static void aw() {
        if (m.lIlIIllIlIlIIlI(Inventory.contains((int[])f.bk) ? 1 : 0) && m.lIlIIllIlIlIlII(Equipment.contains((int[])f.bk) ? 1 : 0)) {
            Inventory.getFirst((int[])f.bk).interact(lIIIllllllIll[lIIIlllllllII[38]]);
            Time.sleepTicks((int)lIIIlllllllII[1]);
            0;
        }
        if (m.lIlIIllIlIlIIlI(Inventory.contains((int[])f.aW) ? 1 : 0) && m.lIlIIllIlIlIlII(Equipment.contains((int[])f.aW) ? 1 : 0)) {
            Inventory.getFirst((int[])f.aW).interact(lIIIllllllIll[lIIIlllllllII[39]]);
            Time.sleepTicks((int)lIIIlllllllII[1]);
            0;
        }
    }
}

