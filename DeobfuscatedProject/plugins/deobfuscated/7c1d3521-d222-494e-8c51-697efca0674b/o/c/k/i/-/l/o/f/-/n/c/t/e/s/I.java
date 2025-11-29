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
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;

public class I {
    private static /* synthetic */ int gd;
    private static /* synthetic */ int[] lllIIllIlI;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int[] ge;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ int gc;
    private static /* synthetic */ String[] lllIIllIIl;

    private static void llIIIIlIIIIll() {
        lllIIllIlI = new int[44];
        I.lllIIllIlI[0] = (0x50 ^ 0x41 ^ (0xB6 ^ 0x86)) & (0xF9 ^ 0xBC ^ (0x6F ^ 0xB) ^ -1);
        I.lllIIllIlI[1] = 1;
        I.lllIIllIlI[2] = 2;
        I.lllIIllIlI[3] = 3;
        I.lllIIllIlI[4] = 0x12 ^ 0x16;
        I.lllIIllIlI[5] = -(0xFFFFFE53 & 0x49BF) & (0xFFFFFB9B & 0x5FFE);
        I.lllIIllIlI[6] = 156 + 5 - 128 + 139 ^ 63 + 94 - 11 + 23;
        I.lllIIllIlI[7] = -(0xFFFFCF7F & 0x7688) & (0xFFFFFFFF & 0x4FFF);
        I.lllIIllIlI[8] = -(0xFFFFF15C & 0x2EF7) & (0xFFFFBEFB & 0x67FF);
        I.lllIIllIlI[9] = 0x67 ^ 0x71 ^ (0xA1 ^ 0xB1);
        I.lllIIllIlI[10] = 0x54 ^ 0x1C ^ (0x75 ^ 0x3A);
        I.lllIIllIlI[11] = 158 + 81 - 162 + 130 ^ 99 + 43 - 2 + 59;
        I.lllIIllIlI[12] = 0x25 ^ 0x2C;
        I.lllIIllIlI[13] = 55 + 81 - 23 + 48 ^ 113 + 98 - 205 + 165;
        I.lllIIllIlI[14] = 4 ^ 0x5F ^ (0x70 ^ 0x20);
        I.lllIIllIlI[15] = 0x83 ^ 0x8F;
        I.lllIIllIlI[16] = 0xFFFFBB6F & 0x5DF4;
        I.lllIIllIlI[17] = 0x9A ^ 0x97;
        I.lllIIllIlI[18] = 0x67 ^ 0x69;
        I.lllIIllIlI[19] = 0x55 ^ 0x5A;
        I.lllIIllIlI[20] = 0x2A ^ 0x53 ^ (0x66 ^ 0xF);
        I.lllIIllIlI[21] = 0xFFFFADFB & 0x72DE;
        I.lllIIllIlI[22] = -(0xFFFFAFDB & 0x7825) & (0xFFFFBDFE & 0x6FE7);
        I.lllIIllIlI[23] = -1 & (0xFFFFEF7E & 0x7FDF);
        I.lllIIllIlI[24] = -(0xFFFFF1F9 & 0x6E07) & (0xFFFFF7EB & 0x7D5E);
        I.lllIIllIlI[25] = -(0xFFFFDDCE & 0x6633) & (0xFFFFF72F & 0x4EFF);
        I.lllIIllIlI[26] = 0xFFFFE3FF & 0x1E2B;
        I.lllIIllIlI[27] = 0xFFFFFBBE & 0xFF9;
        I.lllIIllIlI[28] = -(0xFFFFC959 & 0x7EF7) & (0xFFFFDB7D & 0x6EFF);
        I.lllIIllIlI[29] = 0xFFFFCFBB & 0x3FE4;
        I.lllIIllIlI[30] = -(0xFFFFFBF9 & 0x7DD7) & (0xFFFFFBFB & 0x7FFE);
        I.lllIIllIlI[31] = -(0x53 ^ 0x66) & (0xFFFFFFFE & 0x1F75);
        I.lllIIllIlI[32] = 0xFFFFB9FC & 0x47F7;
        I.lllIIllIlI[33] = -(0xFFFFD497 & 0x7B69) & (0xFFFFFEDC & 0x7FEF);
        I.lllIIllIlI[34] = 0xFFFFEDEF & 0x73B8;
        I.lllIIllIlI[35] = 0xFFFFFF47 & 0x1FFF;
        I.lllIIllIlI[36] = 0xFFFFFBDB & 0x5B4;
        I.lllIIllIlI[37] = -(0xFFFFE8FE & 0x777D) & (0xFFFFF7FF & 0x6BFF);
        I.lllIIllIlI[38] = 0xD5 ^ 0xC4;
        I.lllIIllIlI[39] = 124 + 146 - 128 + 70 ^ 64 + 59 - -42 + 33;
        I.lllIIllIlI[40] = 47 + 132 - 143 + 110 ^ 40 + 94 - 112 + 107;
        I.lllIIllIlI[41] = 0xFFFFB7FD & 0x4D67;
        I.lllIIllIlI[42] = -(0xFFFFA6FF & 0x5B41) & (0xFFFFFE6F & 0x7F3);
        I.lllIIllIlI[43] = 0x65 ^ 2 ^ (0x7C ^ 0xF);
    }

    private static String llIIIIIllllll(String lllllllllllllllllIlllIIllllIlllI, String lllllllllllllllllIlllIIllllIllIl) {
        lllllllllllllllllIlllIIllllIlllI = new String(Base64.getDecoder().decode(lllllllllllllllllIlllIIllllIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlllIIlllllIIIl = new StringBuilder();
        char[] lllllllllllllllllIlllIIlllllIIII = lllllllllllllllllIlllIIllllIllIl.toCharArray();
        int lllllllllllllllllIlllIIllllIllll = lllIIllIlI[0];
        char[] lllllllllllllllllIlllIIllllIlIIl = lllllllllllllllllIlllIIllllIlllI.toCharArray();
        int lllllllllllllllllIlllIIllllIlIII = lllllllllllllllllIlllIIllllIlIIl.length;
        int lllllllllllllllllIlllIIllllIIlll = lllIIllIlI[0];
        while (I.llIIIIlIIIlIl(lllllllllllllllllIlllIIllllIIlll, lllllllllllllllllIlllIIllllIlIII)) {
            char lllllllllllllllllIlllIIlllllIlII = lllllllllllllllllIlllIIllllIlIIl[lllllllllllllllllIlllIIllllIIlll];
            lllllllllllllllllIlllIIlllllIIIl.append((char)(lllllllllllllllllIlllIIlllllIlII ^ lllllllllllllllllIlllIIlllllIIII[lllllllllllllllllIlllIIllllIllll % lllllllllllllllllIlllIIlllllIIII.length]));
            0;
            ++lllllllllllllllllIlllIIllllIllll;
            ++lllllllllllllllllIlllIIllllIIlll;
            0;
            if ((0x4D ^ 0x48) != 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIlllIIlllllIIIl);
    }

    private static String llIIIIlIIIIII(String lllllllllllllllllIlllIlIIIIlIIII, String lllllllllllllllllIlllIlIIIIIllll) {
        try {
            SecretKeySpec lllllllllllllllllIlllIlIIIIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIlIIIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlllIlIIIIlIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlllIlIIIIlIIlI.init(lllIIllIlI[2], lllllllllllllllllIlllIlIIIIlIIll);
            return new String(lllllllllllllllllIlllIlIIIIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIlIIIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlllIlIIIIlIIIl) {
            lllllllllllllllllIlllIlIIIIlIIIl.printStackTrace();
            return null;
        }
    }

    public static void cp() {
        if (I.llIIIIlIIIlII(Inventory.contains((int[])f.bk) ? 1 : 0) && I.llIIIIlIIIllI(Equipment.contains((int[])f.bk) ? 1 : 0)) {
            Inventory.getFirst((int[])f.bk).interact(lllIIllIIl[lllIIllIlI[38]]);
            Time.sleepTicks((int)lllIIllIlI[1]);
            0;
        }
        if (I.llIIIIlIIIlII(Inventory.contains((int[])f.aW) ? 1 : 0) && I.llIIIIlIIIllI(Equipment.contains((int[])f.aW) ? 1 : 0)) {
            Inventory.getFirst((int[])f.aW).interact(lllIIllIIl[lllIIllIlI[39]]);
            Time.sleepTicks((int)lllIIllIlI[1]);
            0;
        }
    }

    private static boolean llIIIIlIIIllI(int n2) {
        return n2 == 0;
    }

    private static String llIIIIlIIIIIl(String lllllllllllllllllIlllIlIIIIIIIll, String lllllllllllllllllIlllIlIIIIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllllIlllIlIIIIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIlIIIIIIIlI.getBytes(StandardCharsets.UTF_8)), lllIIllIlI[11]), "DES");
            Cipher lllllllllllllllllIlllIlIIIIIIlIl = Cipher.getInstance("DES");
            lllllllllllllllllIlllIlIIIIIIlIl.init(lllIIllIlI[2], lllllllllllllllllIlllIlIIIIIIllI);
            return new String(lllllllllllllllllIlllIlIIIIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIlIIIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlllIlIIIIIIlII) {
            lllllllllllllllllIlllIlIIIIIIlII.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean cn() {
        int n2;
        String[] stringArray = new String[lllIIllIlI[1]];
        stringArray[I.lllIIllIlI[0]] = lllIIllIIl[lllIIllIlI[17]];
        if (I.llIIIIlIIIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lllIIllIlI[1]];
            nArray[I.lllIIllIlI[0]] = lllIIllIlI[8];
            if (I.llIIIIlIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lllIIllIlI[1]];
                stringArray2[I.lllIIllIlI[0]] = lllIIllIIl[lllIIllIlI[18]];
                if (I.llIIIIlIIIlII(Inventory.contains((String[])stringArray2) ? 1 : 0) && I.llIIIIlIIIlII(Inventory.contains((int[])f.aS) ? 1 : 0)) {
                    n2 = lllIIllIlI[1];
                    0;
                    if (3 == 3) return n2 != 0;
                    return ((0x9D ^ 0x99) & ~(0x25 ^ 0x21)) != 0;
                }
            }
        }
        n2 = lllIIllIlI[0];
        return n2 != 0;
    }

    private static boolean llIIIIlIIIlll(Object object) {
        return object != null;
    }

    private static boolean llIIIIlIIlIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIIIlIIIlII(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean co() {
        int n2;
        String[] stringArray = new String[lllIIllIlI[1]];
        stringArray[I.lllIIllIlI[0]] = lllIIllIIl[lllIIllIlI[19]];
        if (I.llIIIIlIIIlII(Equipment.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lllIIllIlI[1]];
            nArray[I.lllIIllIlI[0]] = lllIIllIlI[8];
            if (I.llIIIIlIIIlII(Equipment.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllIIllIlI[1]];
                nArray2[I.lllIIllIlI[0]] = lllIIllIlI[7];
                if (I.llIIIIlIIIlII(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                    String[] stringArray2 = new String[lllIIllIlI[1]];
                    stringArray2[I.lllIIllIlI[0]] = lllIIllIIl[lllIIllIlI[20]];
                    if (I.llIIIIlIIIlII(Equipment.contains((String[])stringArray2) ? 1 : 0)) {
                        n2 = lllIIllIlI[1];
                        0;
                        if ((0x29 ^ 0x2D) > 0) return n2 != 0;
                        return (1 & ~1) != 0;
                    }
                }
            }
        }
        n2 = lllIIllIlI[0];
        return n2 != 0;
    }

    public static void cm() {
        block28: {
            block29: {
                block34: {
                    block31: {
                        block33: {
                            block32: {
                                block30: {
                                    if (I.llIIIIlIIIlII(bt ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIIllIIl[lllIIllIlI[0]];
                                        b.a(bv);
                                        if (I.llIIIIlIIIlIl(bv.size(), lllIIllIlI[1])) {
                                            System.out.println(lllIIllIIl[lllIIllIlI[1]]);
                                            bt = lllIIllIlI[0];
                                        }
                                    }
                                    if (!I.llIIIIlIIIllI(bt ? 1 : 0) || !I.llIIIIlIIIllI(I.co() ? 1 : 0)) break block28;
                                    System.out.println(lllIIllIIl[lllIIllIlI[2]]);
                                    if (!I.llIIIIlIIIllI(I.cn() ? 1 : 0)) break block29;
                                    BankLocation lllllllllllllllllIlllIlIIIIlllIl = BankLocation.getNearest();
                                    if (I.llIIIIlIIIlll(lllllllllllllllllIlllIlIIIIlllIl) && I.llIIIIlIIIllI(lllllllllllllllllIlllIlIIIIlllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIIllIIl[lllIIllIlI[3]];
                                        a.a(lllllllllllllllllIlllIlIIIIlllIl);
                                    }
                                    if (!I.llIIIIlIIIlll(lllllllllllllllllIlllIlIIIIlllIl) || !I.llIIIIlIIIlII(lllllllllllllllllIlllIlIIIIlllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block29;
                                    if (I.llIIIIlIIIllI(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIIllIIl[lllIIllIlI[4]];
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIllIlI[5]);
                                        0;
                                    }
                                    if (!I.llIIIIlIIIlII(Bank.isOpen() ? 1 : 0)) break block29;
                                    AccBuilderSotf.c = lllIIllIIl[lllIIllIlI[6]];
                                    if (I.llIIIIlIIlIII(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lllIIllIlI[3]);
                                        0;
                                    }
                                    if (I.llIIIIlIIlIII(Equipment.getAll().size()) && I.llIIIIlIIIllI(I.co() ? 1 : 0)) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lllIIllIlI[2]);
                                        0;
                                    }
                                    int[] nArray = new int[lllIIllIlI[1]];
                                    nArray[I.lllIIllIlI[0]] = gd;
                                    if (!I.llIIIIlIIIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                    int[] nArray2 = new int[lllIIllIlI[1]];
                                    nArray2[I.lllIIllIlI[0]] = gd;
                                    if (!I.llIIIIlIIlIIl(Inventory.getCount((int[])nArray2), lllIIllIlI[1])) break block31;
                                }
                                int[] nArray = new int[lllIIllIlI[1]];
                                nArray[I.lllIIllIlI[0]] = gc;
                                if (!I.llIIIIlIIIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                                int[] nArray3 = new int[lllIIllIlI[1]];
                                nArray3[I.lllIIllIlI[0]] = gc;
                                if (!I.llIIIIlIIIlII(Inventory.contains((int[])nArray3) ? 1 : 0)) break block31;
                            }
                            int[] nArray = new int[lllIIllIlI[1]];
                            nArray[I.lllIIllIlI[0]] = lllIIllIlI[7];
                            if (!I.llIIIIlIIIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                            int[] nArray4 = new int[lllIIllIlI[1]];
                            nArray4[I.lllIIllIlI[0]] = lllIIllIlI[7];
                            if (!I.llIIIIlIIlIIl(Inventory.getCount((int[])nArray4), lllIIllIlI[1])) break block31;
                        }
                        int[] nArray = new int[lllIIllIlI[1]];
                        nArray[I.lllIIllIlI[0]] = lllIIllIlI[8];
                        if (!I.llIIIIlIIIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray5 = new int[lllIIllIlI[1]];
                        nArray5[I.lllIIllIlI[0]] = lllIIllIlI[8];
                        if (!I.llIIIIlIIIlIl(Inventory.getCount((int[])nArray5), lllIIllIlI[1])) break block34;
                    }
                    I.Q();
                    System.out.println(lllIIllIIl[lllIIllIlI[9]]);
                    bt = lllIIllIlI[1];
                    return;
                }
                int[] nArray = new int[lllIIllIlI[1]];
                nArray[I.lllIIllIlI[0]] = gc;
                if (I.llIIIIlIIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray6 = new int[lllIIllIlI[1]];
                    nArray6[I.lllIIllIlI[0]] = gc;
                    if (I.llIIIIlIIIlIl(Inventory.getCount((int[])nArray6), lllIIllIlI[1])) {
                        Bank.withdraw((int)gc, (int)lllIIllIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lllIIllIlI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllIIllIlI[1]];
                            nArray[I.lllIIllIlI[0]] = gc;
                            if (I.llIIIIlIIlIII(Inventory.getCount((int[])nArray))) {
                                bl = lllIIllIlI[1];
                                0;
                                if (2 < 0) {
                                    return ((26 + 29 - 48 + 144 ^ 53 + 52 - 10 + 77) & (141 + 93 - 233 + 190 ^ 131 + 56 - 110 + 55 ^ -1)) != 0;
                                }
                            } else {
                                bl = lllIIllIlI[0];
                            }
                            return bl;
                        }, (int)lllIIllIlI[5]);
                        0;
                    }
                }
                int[] nArray7 = new int[lllIIllIlI[1]];
                nArray7[I.lllIIllIlI[0]] = gd;
                if (I.llIIIIlIIIlII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[lllIIllIlI[1]];
                    nArray8[I.lllIIllIlI[0]] = gd;
                    if (I.llIIIIlIIIlIl(Inventory.getCount((int[])nArray8), lllIIllIlI[1])) {
                        Bank.withdraw((int)gd, (int)lllIIllIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lllIIllIlI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllIIllIlI[1]];
                            nArray[I.lllIIllIlI[0]] = gd;
                            if (I.llIIIIlIIlIII(Inventory.getCount((int[])nArray))) {
                                bl = lllIIllIlI[1];
                                0;
                                if (-1 > 1) {
                                    return ((0xF8 ^ 0xB7) & ~(0x71 ^ 0x3E)) != 0;
                                }
                            } else {
                                bl = lllIIllIlI[0];
                            }
                            return bl;
                        }, (int)lllIIllIlI[5]);
                        0;
                    }
                }
                int[] nArray9 = new int[lllIIllIlI[1]];
                nArray9[I.lllIIllIlI[0]] = lllIIllIlI[7];
                if (I.llIIIIlIIIlII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    int[] nArray10 = new int[lllIIllIlI[1]];
                    nArray10[I.lllIIllIlI[0]] = lllIIllIlI[7];
                    if (I.llIIIIlIIIlIl(Inventory.getCount((int[])nArray10), lllIIllIlI[1])) {
                        Bank.withdraw((int)lllIIllIlI[7], (int)lllIIllIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lllIIllIlI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllIIllIlI[1]];
                            nArray[I.lllIIllIlI[0]] = lllIIllIlI[7];
                            if (I.llIIIIlIIlIII(Inventory.getCount((int[])nArray))) {
                                bl = lllIIllIlI[1];
                                0;
                                if (2 == 0) {
                                    return ((123 + 37 - 54 + 97 ^ 93 + 101 - 96 + 43) & (0x98 ^ 0xBD ^ (0x7A ^ 0x19) ^ -1)) != 0;
                                }
                            } else {
                                bl = lllIIllIlI[0];
                            }
                            return bl;
                        }, (int)lllIIllIlI[5]);
                        0;
                    }
                }
                int[] nArray11 = new int[lllIIllIlI[1]];
                nArray11[I.lllIIllIlI[0]] = lllIIllIlI[8];
                if (I.llIIIIlIIIlII(Bank.contains((int[])nArray11) ? 1 : 0)) {
                    int[] nArray12 = new int[lllIIllIlI[1]];
                    nArray12[I.lllIIllIlI[0]] = lllIIllIlI[8];
                    if (I.llIIIIlIIIlIl(Inventory.getCount((int[])nArray12), lllIIllIlI[1])) {
                        Bank.withdraw((int)lllIIllIlI[8], (int)lllIIllIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lllIIllIlI[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllIIllIlI[1]];
                            nArray[I.lllIIllIlI[0]] = lllIIllIlI[8];
                            if (I.llIIIIlIIlIII(Inventory.getCount((int[])nArray))) {
                                bl = lllIIllIlI[1];
                                0;
                                if ((0x16 ^ 0x12) <= ((0x48 ^ 3) & ~(0xF8 ^ 0xB3))) {
                                    return ((0xA4 ^ 0x89) & ~(0xE8 ^ 0xC5)) != 0;
                                }
                            } else {
                                bl = lllIIllIlI[0];
                            }
                            return bl;
                        }, (int)lllIIllIlI[5]);
                        0;
                    }
                }
            }
            if (I.llIIIIlIIIlII(I.cn() ? 1 : 0)) {
                if (I.llIIIIlIIIlII(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (I.llIIIIlIIIllI(Bank.isOpen() ? 1 : 0)) {
                    if (I.llIIIIlIIIlII(GrandExchange.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepTicks((int)lllIIllIlI[1]);
                        0;
                    }
                    int lllllllllllllllllIlllIlIIIIlllIl = lllIIllIlI[0];
                    while (I.llIIIIlIIIlIl(lllllllllllllllllIlllIlIIIIlllIl, ge.length)) {
                        int[] nArray = new int[lllIIllIlI[1]];
                        nArray[I.lllIIllIlI[0]] = ge[lllllllllllllllllIlllIlIIIIlllIl];
                        Item lllllllllllllllllIlllIlIIIIlllII = Inventory.getFirst((int[])nArray);
                        if (I.llIIIIlIIIlll(lllllllllllllllllIlllIlIIIIlllII)) {
                            int[] nArray13 = new int[lllIIllIlI[1]];
                            nArray13[I.lllIIllIlI[0]] = lllllllllllllllllIlllIlIIIIlllII.getId();
                            if (I.llIIIIlIIIlII(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                String[] stringArray = new String[lllIIllIlI[1]];
                                stringArray[I.lllIIllIlI[0]] = lllIIllIIl[lllIIllIlI[10]];
                                if (I.llIIIIlIIIlII(lllllllllllllllllIlllIlIIIIlllII.hasAction(stringArray) ? 1 : 0)) {
                                    lllllllllllllllllIlllIlIIIIlllII.interact(lllIIllIIl[lllIIllIlI[11]]);
                                    Time.sleepTicks((int)lllIIllIlI[1]);
                                    0;
                                }
                                String[] stringArray2 = new String[lllIIllIlI[1]];
                                stringArray2[I.lllIIllIlI[0]] = lllIIllIIl[lllIIllIlI[12]];
                                if (I.llIIIIlIIIlII(lllllllllllllllllIlllIlIIIIlllII.hasAction(stringArray2) ? 1 : 0)) {
                                    lllllllllllllllllIlllIlIIIIlllII.interact(lllIIllIIl[lllIIllIlI[13]]);
                                    Time.sleepTicks((int)lllIIllIlI[1]);
                                    0;
                                }
                                String[] stringArray3 = new String[lllIIllIlI[1]];
                                stringArray3[I.lllIIllIlI[0]] = lllIIllIIl[lllIIllIlI[14]];
                                if (I.llIIIIlIIIlII(lllllllllllllllllIlllIlIIIIlllII.hasAction(stringArray3) ? 1 : 0)) {
                                    lllllllllllllllllIlllIlIIIIlllII.interact(lllIIllIIl[lllIIllIlI[15]]);
                                    Time.sleepTicks((int)lllIIllIlI[1]);
                                    0;
                                }
                                Time.sleepTicks((int)lllIIllIlI[1]);
                                0;
                            }
                        }
                        ++lllllllllllllllllIlllIlIIIIlllIl;
                        0;
                        if (-(0x84 ^ 0x80) <= 0) continue;
                        return;
                    }
                    if (I.llIIIIlIIIlII(I.co() ? 1 : 0) && I.llIIIIlIIIllI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIllIlI[16]);
                        0;
                    }
                }
            }
        }
    }

    private static boolean llIIIIlIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    public static void Q() {
        d lllllllllllllllllIlllIlIIIIllIII;
        Object lllllllllllllllllIlllIlIIIIllIIl;
        int[] nArray = new int[lllIIllIlI[1]];
        nArray[I.lllIIllIlI[0]] = gc;
        if (I.llIIIIlIIIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(gc, lllIIllIlI[1], lllIIllIlI[21]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[lllIIllIlI[1]];
        nArray2[I.lllIIllIlI[0]] = gd;
        if (I.llIIIIlIIIllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllllllllllllllllIlllIlIIIIllIIl = new d(gd, lllIIllIlI[1], lllIIllIlI[22]);
            bv.add((d)lllllllllllllllllIlllIlIIIIllIIl);
            0;
        }
        int[] nArray3 = new int[lllIIllIlI[1]];
        nArray3[I.lllIIllIlI[0]] = lllIIllIlI[8];
        if (I.llIIIIlIIIllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllllllllllllllllIlllIlIIIIllIIl = new d(lllIIllIlI[8], lllIIllIlI[1], lllIIllIlI[23]);
            bv.add((d)lllllllllllllllllIlllIlIIIIllIIl);
            0;
        }
        int[] nArray4 = new int[lllIIllIlI[1]];
        nArray4[I.lllIIllIlI[0]] = lllIIllIlI[7];
        if (I.llIIIIlIIIllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lllllllllllllllllIlllIlIIIIllIIl = new d(lllIIllIlI[7], lllIIllIlI[1], lllIIllIlI[24]);
            bv.add((d)lllllllllllllllllIlllIlIIIIllIIl);
            0;
        }
        int[] nArray5 = new int[lllIIllIlI[1]];
        nArray5[I.lllIIllIlI[0]] = lllIIllIlI[25];
        if (I.llIIIIlIIIllI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lllllllllllllllllIlllIlIIIIllIIl = new d(lllIIllIlI[25], lllIIllIlI[5], lllIIllIlI[13]);
            bv.add((d)lllllllllllllllllIlllIlIIIIllIIl);
            0;
        }
        int[] nArray6 = new int[lllIIllIlI[1]];
        nArray6[I.lllIIllIlI[0]] = lllIIllIlI[26];
        if (I.llIIIIlIIIllI(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lllllllllllllllllIlllIlIIIIllIIl = new d(lllIIllIlI[26], lllIIllIlI[27], lllIIllIlI[13]);
            bv.add((d)lllllllllllllllllIlllIlIIIIllIIl);
            0;
        }
        int[] nArray7 = new int[lllIIllIlI[1]];
        nArray7[I.lllIIllIlI[0]] = lllIIllIlI[28];
        if (I.llIIIIlIIIllI(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lllllllllllllllllIlllIlIIIIllIIl = new d(lllIIllIlI[28], lllIIllIlI[29], lllIIllIlI[13]);
            bv.add((d)lllllllllllllllllIlllIlIIIIllIIl);
            0;
        }
        int[] nArray8 = new int[lllIIllIlI[1]];
        nArray8[I.lllIIllIlI[0]] = lllIIllIlI[30];
        if (I.llIIIIlIIIllI(Bank.contains((int[])nArray8) ? 1 : 0)) {
            lllllllllllllllllIlllIlIIIIllIIl = new d(lllIIllIlI[30], lllIIllIlI[31], lllIIllIlI[13]);
            bv.add((d)lllllllllllllllllIlllIlIIIIllIIl);
            0;
        }
        int[] nArray9 = new int[lllIIllIlI[1]];
        nArray9[I.lllIIllIlI[0]] = lllIIllIlI[25];
        if (I.llIIIIlIIIlII(Bank.contains((int[])nArray9) ? 1 : 0)) {
            int[] nArray10 = new int[lllIIllIlI[1]];
            nArray10[I.lllIIllIlI[0]] = lllIIllIlI[25];
            if (I.llIIIIlIIIlIl(Bank.getFirst((int[])nArray10).getQuantity(), lllIIllIlI[32])) {
                lllllllllllllllllIlllIlIIIIllIIl = new d(lllIIllIlI[25], lllIIllIlI[5], lllIIllIlI[13]);
                bv.add((d)lllllllllllllllllIlllIlIIIIllIIl);
                0;
            }
        }
        int[] nArray11 = new int[lllIIllIlI[1]];
        nArray11[I.lllIIllIlI[0]] = lllIIllIlI[26];
        if (I.llIIIIlIIIlII(Bank.contains((int[])nArray11) ? 1 : 0)) {
            int[] nArray12 = new int[lllIIllIlI[1]];
            nArray12[I.lllIIllIlI[0]] = lllIIllIlI[26];
            if (I.llIIIIlIIIlIl(Bank.getFirst((int[])nArray12).getQuantity(), lllIIllIlI[32])) {
                lllllllllllllllllIlllIlIIIIllIIl = new d(lllIIllIlI[26], lllIIllIlI[27], lllIIllIlI[13]);
                bv.add((d)lllllllllllllllllIlllIlIIIIllIIl);
                0;
            }
        }
        int[] nArray13 = new int[lllIIllIlI[1]];
        nArray13[I.lllIIllIlI[0]] = lllIIllIlI[28];
        if (I.llIIIIlIIIlII(Bank.contains((int[])nArray13) ? 1 : 0)) {
            int[] nArray14 = new int[lllIIllIlI[1]];
            nArray14[I.lllIIllIlI[0]] = lllIIllIlI[28];
            if (I.llIIIIlIIIlIl(Bank.getFirst((int[])nArray14).getQuantity(), lllIIllIlI[32])) {
                lllllllllllllllllIlllIlIIIIllIIl = new d(lllIIllIlI[28], lllIIllIlI[29], lllIIllIlI[13]);
                bv.add((d)lllllllllllllllllIlllIlIIIIllIIl);
                0;
            }
        }
        int[] nArray15 = new int[lllIIllIlI[1]];
        nArray15[I.lllIIllIlI[0]] = lllIIllIlI[30];
        if (I.llIIIIlIIIlII(Bank.contains((int[])nArray15) ? 1 : 0)) {
            int[] nArray16 = new int[lllIIllIlI[1]];
            nArray16[I.lllIIllIlI[0]] = lllIIllIlI[30];
            if (I.llIIIIlIIIlIl(Bank.getFirst((int[])nArray16).getQuantity(), lllIIllIlI[32])) {
                lllllllllllllllllIlllIlIIIIllIIl = new d(lllIIllIlI[30], lllIIllIlI[31], lllIIllIlI[13]);
                bv.add((d)lllllllllllllllllIlllIlIIIIllIIl);
                0;
            }
        }
        if (I.llIIIIlIIIllI(Bank.contains((Predicate)(lllllllllllllllllIlllIlIIIIllIIl = item -> item.getName().toLowerCase().contains(lllIIllIIl[lllIIllIlI[40]]))) ? 1 : 0)) {
            lllllllllllllllllIlllIlIIIIllIII = new d(lllIIllIlI[33], lllIIllIlI[6], lllIIllIlI[34]);
            bv.add(lllllllllllllllllIlllIlIIIIllIII);
            0;
        }
        int[] nArray17 = new int[lllIIllIlI[1]];
        nArray17[I.lllIIllIlI[0]] = lllIIllIlI[35];
        if (I.llIIIIlIIIllI(Bank.contains((int[])nArray17) ? 1 : 0)) {
            lllllllllllllllllIlllIlIIIIllIII = new d(lllIIllIlI[35], lllIIllIlI[36], lllIIllIlI[37]);
            bv.add(lllllllllllllllllIlllIlIIIIllIII);
            0;
        }
    }

    private static void llIIIIlIIIIlI() {
        lllIIllIIl = new String[lllIIllIlI[43]];
        I.lllIIllIIl[I.lllIIllIlI[0]] = I."Buying items";
        I.lllIIllIIl[I.lllIIllIlI[1]] = I."Finished buying items, switching back to gearing";
        I.lllIIllIIl[I.lllIIllIlI[2]] = I."Get Mage Gear Util";
        I.lllIIllIIl[I.lllIIllIlI[3]] = I."Navigating to bank";
        I.lllIIllIIl[I.lllIIllIlI[4]] = I."Opening bank";
        I.lllIIllIIl[I.lllIIllIlI[6]] = I."Handling banking";
        I.lllIIllIIl[I.lllIIllIlI[9]] = I."We are missing supplies, switching to BUYING Util";
        I.lllIIllIIl[I.lllIIllIlI[10]] = I."Wear";
        I.lllIIllIIl[I.lllIIllIlI[11]] = I."Wear";
        I.lllIIllIIl[I.lllIIllIlI[12]] = I."Wield";
        I.lllIIllIIl[I.lllIIllIlI[13]] = I."Wield";
        I.lllIIllIIl[I.lllIIllIlI[14]] = I."Equip";
        I.lllIIllIIl[I.lllIIllIlI[15]] = I."Equip";
        I.lllIIllIIl[I.lllIIllIlI[17]] = I."Staff of air";
        I.lllIIllIIl[I.lllIIllIlI[18]] = I."Leather gloves";
        I.lllIIllIIl[I.lllIIllIlI[19]] = I."Staff of air";
        I.lllIIllIIl[I.lllIIllIlI[20]] = I."Leather gloves";
        I.lllIIllIIl[I.lllIIllIlI[38]] = I."Wear";
        I.lllIIllIIl[I.lllIIllIlI[39]] = I."Wear";
        I.lllIIllIIl[I.lllIIllIlI[40]] = I."ring of wealth (";
    }

    static {
        I.llIIIIlIIIIll();
        I.llIIIIlIIIIlI();
        bv = new ArrayList<d>();
        gc = lllIIllIlI[41];
        gd = lllIIllIlI[42];
        int[] nArray = new int[lllIIllIlI[4]];
        nArray[I.lllIIllIlI[0]] = gc;
        nArray[I.lllIIllIlI[1]] = gd;
        nArray[I.lllIIllIlI[2]] = lllIIllIlI[8];
        nArray[I.lllIIllIlI[3]] = lllIIllIlI[7];
        ge = nArray;
    }

    private static boolean llIIIIlIIlIII(int n2) {
        return n2 > 0;
    }
}

