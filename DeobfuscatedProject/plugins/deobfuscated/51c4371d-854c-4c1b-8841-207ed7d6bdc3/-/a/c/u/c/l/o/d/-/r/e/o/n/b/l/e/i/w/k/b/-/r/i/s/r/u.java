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
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.a;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.b;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.d;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.f;
import gg.squire.account.AccBuilderBarrows;
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

public class u {
    public static /* synthetic */ List<d> bB;
    private static /* synthetic */ int da;
    public static /* synthetic */ boolean bz;
    private static /* synthetic */ int[] db;
    private static /* synthetic */ int[] lIllIIII;
    private static /* synthetic */ int cZ;
    private static /* synthetic */ String[] lIlIllll;

    private static boolean lIIlIIlllIl(Object object) {
        return object != null;
    }

    private static String lIIlIIlIlIl(String lIlllIlIIlllIll, String lIlllIlIIllllll) {
        lIlllIlIIlllIll = new String(Base64.getDecoder().decode(lIlllIlIIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlllIlIIlllllI = new StringBuilder();
        char[] lIlllIlIIllllIl = lIlllIlIIllllll.toCharArray();
        int lIlllIlIIllllII = lIllIIII[0];
        char[] lIlllIlIIllIllI = lIlllIlIIlllIll.toCharArray();
        int lIlllIlIIllIlIl = lIlllIlIIllIllI.length;
        int lIlllIlIIllIlII = lIllIIII[0];
        while (u.lIIlIIllIll(lIlllIlIIllIlII, lIlllIlIIllIlIl)) {
            char lIlllIlIlIIIIIl = lIlllIlIIllIllI[lIlllIlIIllIlII];
            lIlllIlIIlllllI.append((char)(lIlllIlIlIIIIIl ^ lIlllIlIIllllIl[lIlllIlIIllllII % lIlllIlIIllllIl.length]));
            0;
            ++lIlllIlIIllllII;
            ++lIlllIlIIllIlII;
            0;
            if (((0xE ^ 0x54) & ~(0x98 ^ 0xC2)) == 0) continue;
            return null;
        }
        return String.valueOf(lIlllIlIIlllllI);
    }

    static {
        u.lIIlIIllIIl();
        u.lIIlIIllIII();
        bB = new ArrayList<d>();
        cZ = lIllIIII[41];
        da = lIllIIII[42];
        int[] nArray = new int[lIllIIII[4]];
        nArray[u.lIllIIII[0]] = cZ;
        nArray[u.lIllIIII[1]] = da;
        nArray[u.lIllIIII[2]] = lIllIIII[8];
        nArray[u.lIllIIII[3]] = lIllIIII[7];
        db = nArray;
    }

    private static boolean lIIlIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIlllll(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aV() {
        int n2;
        String[] stringArray = new String[lIllIIII[1]];
        stringArray[u.lIllIIII[0]] = lIlIllll[lIllIIII[19]];
        if (u.lIIlIIllIlI(Equipment.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lIllIIII[1]];
            nArray[u.lIllIIII[0]] = lIllIIII[8];
            if (u.lIIlIIllIlI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIllIIII[1]];
                nArray2[u.lIllIIII[0]] = lIllIIII[7];
                if (u.lIIlIIllIlI(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIllIIII[1]];
                    stringArray2[u.lIllIIII[0]] = lIlIllll[lIllIIII[20]];
                    if (u.lIIlIIllIlI(Equipment.contains((String[])stringArray2) ? 1 : 0)) {
                        n2 = lIllIIII[1];
                        0;
                        if (2 != -1) return n2 != 0;
                        return ((0x7F ^ 0x3E ^ (0x62 ^ 0x3A)) & (50 + 54 - 32 + 88 ^ 17 + 142 - 125 + 151 ^ -1)) != 0;
                    }
                }
            }
        }
        n2 = lIllIIII[0];
        return n2 != 0;
    }

    public static void aW() {
        if (u.lIIlIIllIlI(Inventory.contains((int[])f.bl) ? 1 : 0) && u.lIIlIIlllII(Equipment.contains((int[])f.bl) ? 1 : 0)) {
            Inventory.getFirst((int[])f.bl).interact(lIlIllll[lIllIIII[38]]);
            Time.sleepTicks((int)lIllIIII[1]);
            0;
        }
        if (u.lIIlIIllIlI(Inventory.contains((int[])f.aX) ? 1 : 0) && u.lIIlIIlllII(Equipment.contains((int[])f.aX) ? 1 : 0)) {
            Inventory.getFirst((int[])f.aX).interact(lIlIllll[lIllIIII[39]]);
            Time.sleepTicks((int)lIllIIII[1]);
            0;
        }
    }

    private static void lIIlIIllIIl() {
        lIllIIII = new int[44];
        u.lIllIIII[0] = (0x3F ^ 0x63 ^ (0x3F ^ 0x7C)) & (0xFD ^ 0xA9 ^ (0xFF ^ 0xB4) ^ -1);
        u.lIllIIII[1] = 1;
        u.lIllIIII[2] = 2;
        u.lIllIIII[3] = 3;
        u.lIllIIII[4] = 0x16 ^ 0x10 ^ 2;
        u.lIllIIII[5] = -(0xFFFFE911 & 0x1EEF) & (0xFFFFDFAA & 0x3BDD);
        u.lIllIIII[6] = 0x10 ^ 0x38 ^ (0x30 ^ 0x1D);
        u.lIllIIII[7] = -(0xFFFFF5DF & 0x7E27) & (0xFFFFFDFE & Short.MAX_VALUE);
        u.lIllIIII[8] = 0xFFFF8EAC & 0x77FB;
        u.lIllIIII[9] = 6 ^ 0x6F ^ (0xCE ^ 0xA1);
        u.lIllIIII[10] = 0x7E ^ 0x79;
        u.lIllIIII[11] = 0x49 ^ 0x41;
        u.lIllIIII[12] = 0x29 ^ 0x32 ^ (0x64 ^ 0x76);
        u.lIllIIII[13] = 0x40 ^ 0x4A;
        u.lIllIIII[14] = 0x7B ^ 0x70;
        u.lIllIIII[15] = 0x68 ^ 0x64;
        u.lIllIIII[16] = 0xFFFFFD65 & 0x1BFE;
        u.lIllIIII[17] = 0x90 ^ 0x9D;
        u.lIllIIII[18] = 0x5D ^ 0x53;
        u.lIllIIII[19] = 0x68 ^ 0x67;
        u.lIllIIII[20] = 0x52 ^ 0x42;
        u.lIllIIII[21] = -(0xFFFFBF2D & 0x5DF7) & (0xFFFFFFFE & 0x3DFF);
        u.lIllIIII[22] = -(0xFFFFFA3A & 0x4DDF) & (0xFFFFCFFF & 0x7DFF);
        u.lIllIIII[23] = -2 & (0xFFFFEF7F & 0x7FDF);
        u.lIllIIII[24] = -(0xFFFFFBAF & 0x2E71) & (0xFFFFFFEB & 0x3F7E);
        u.lIllIIII[25] = -(0xFFFFC1F3 & 0x7F8E) & (0xFFFFF7BF & 0x4BEF);
        u.lIllIIII[26] = -(0xFFFFEDD5 & 0x17FF) & (0xFFFFBFFF & 0x47FF);
        u.lIllIIII[27] = 0xFFFF8BFD & 0x7FBA;
        u.lIllIIII[28] = -(0xFFFFB573 & 0x7FCF) & (0xFFFFBFFF & 0x776F);
        u.lIllIIII[29] = 0xFFFFFFED & 0xFB2;
        u.lIllIIII[30] = 0xFFFFCA2A & 0x37FF;
        u.lIllIIII[31] = -(0xFFFFED92 & 0x32FD) & (0xFFFFBFFF & 0x7FCF);
        u.lIllIIII[32] = 0xFFFF85FF & 0x7BF4;
        u.lIllIIII[33] = -(0x9A ^ 0xAB) & (0xFFFFEEFD & 0x3FFE);
        u.lIllIIII[34] = -(0x7F ^ 0x79) & (0xFFFFF5EF & 0x6BBD);
        u.lIllIIII[35] = -(0xFFFFBBFD & 0x6493) & (0xFFFFFFFF & 0x3FD7);
        u.lIllIIII[36] = -(0xFFFFF4EF & 0x6F37) & (0xFFFFE5BF & 0x7FF6);
        u.lIllIIII[37] = -(0xFFFFF0C7 & 0x3F79) & (0xFFFFF3D4 & 0x3FEF);
        u.lIllIIII[38] = 6 + 106 - -1 + 16 ^ 6 + 55 - 5 + 88;
        u.lIllIIII[39] = 0xBB ^ 0xAD ^ (0x2F ^ 0x2B);
        u.lIllIIII[40] = 0x21 ^ 0x32;
        u.lIllIIII[41] = -(0xFFFFBF89 & 0x78FF) & (0xFFFFBFED & 0x7DFF);
        u.lIllIIII[42] = -(0xFFFFFF85 & 0x5B7F) & (0xFFFFDF37 & 0x7FEF);
        u.lIllIIII[43] = 0x12 ^ 0x76 ^ (0x54 ^ 0x24);
    }

    public static void aT() {
        block28: {
            block29: {
                block34: {
                    block31: {
                        block33: {
                            block32: {
                                block30: {
                                    if (u.lIIlIIllIlI(bz ? 1 : 0)) {
                                        AccBuilderBarrows.c = lIlIllll[lIllIIII[0]];
                                        b.a(bB);
                                        if (u.lIIlIIllIll(bB.size(), lIllIIII[1])) {
                                            System.out.println(lIlIllll[lIllIIII[1]]);
                                            bz = lIllIIII[0];
                                        }
                                    }
                                    if (!u.lIIlIIlllII(bz ? 1 : 0) || !u.lIIlIIlllII(u.aV() ? 1 : 0)) break block28;
                                    System.out.println(lIlIllll[lIllIIII[2]]);
                                    if (!u.lIIlIIlllII(u.aU() ? 1 : 0)) break block29;
                                    BankLocation lIlllIlIlIlIIII = BankLocation.getNearest();
                                    if (u.lIIlIIlllIl(lIlllIlIlIlIIII) && u.lIIlIIlllII(lIlllIlIlIlIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderBarrows.c = lIlIllll[lIllIIII[3]];
                                        a.a(lIlllIlIlIlIIII);
                                    }
                                    if (!u.lIIlIIlllIl(lIlllIlIlIlIIII) || !u.lIIlIIllIlI(lIlllIlIlIlIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block29;
                                    if (u.lIIlIIlllII(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderBarrows.c = lIlIllll[lIllIIII[4]];
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIIII[5]);
                                        0;
                                    }
                                    if (!u.lIIlIIllIlI(Bank.isOpen() ? 1 : 0)) break block29;
                                    AccBuilderBarrows.c = lIlIllll[lIllIIII[6]];
                                    if (u.lIIlIIllllI(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lIllIIII[3]);
                                        0;
                                    }
                                    if (u.lIIlIIllllI(Equipment.getAll().size()) && u.lIIlIIlllII(u.aV() ? 1 : 0)) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lIllIIII[2]);
                                        0;
                                    }
                                    int[] nArray = new int[lIllIIII[1]];
                                    nArray[u.lIllIIII[0]] = da;
                                    if (!u.lIIlIIlllII(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                    int[] nArray2 = new int[lIllIIII[1]];
                                    nArray2[u.lIllIIII[0]] = da;
                                    if (!u.lIIlIIlllll(Inventory.getCount((int[])nArray2), lIllIIII[1])) break block31;
                                }
                                int[] nArray = new int[lIllIIII[1]];
                                nArray[u.lIllIIII[0]] = cZ;
                                if (!u.lIIlIIlllII(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                                int[] nArray3 = new int[lIllIIII[1]];
                                nArray3[u.lIllIIII[0]] = cZ;
                                if (!u.lIIlIIllIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block31;
                            }
                            int[] nArray = new int[lIllIIII[1]];
                            nArray[u.lIllIIII[0]] = lIllIIII[7];
                            if (!u.lIIlIIlllII(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                            int[] nArray4 = new int[lIllIIII[1]];
                            nArray4[u.lIllIIII[0]] = lIllIIII[7];
                            if (!u.lIIlIIlllll(Inventory.getCount((int[])nArray4), lIllIIII[1])) break block31;
                        }
                        int[] nArray = new int[lIllIIII[1]];
                        nArray[u.lIllIIII[0]] = lIllIIII[8];
                        if (!u.lIIlIIlllII(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray5 = new int[lIllIIII[1]];
                        nArray5[u.lIllIIII[0]] = lIllIIII[8];
                        if (!u.lIIlIIllIll(Inventory.getCount((int[])nArray5), lIllIIII[1])) break block34;
                    }
                    u.ag();
                    System.out.println(lIlIllll[lIllIIII[9]]);
                    bz = lIllIIII[1];
                    return;
                }
                int[] nArray = new int[lIllIIII[1]];
                nArray[u.lIllIIII[0]] = cZ;
                if (u.lIIlIIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray6 = new int[lIllIIII[1]];
                    nArray6[u.lIllIIII[0]] = cZ;
                    if (u.lIIlIIllIll(Inventory.getCount((int[])nArray6), lIllIIII[1])) {
                        Bank.withdraw((int)cZ, (int)lIllIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIllIIII[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIllIIII[1]];
                            nArray[u.lIllIIII[0]] = cZ;
                            if (u.lIIlIIllllI(Inventory.getCount((int[])nArray))) {
                                bl = lIllIIII[1];
                                0;
                                if (-1 > 0) {
                                    return ((0x2C ^ 0x4C) & ~(0x6F ^ 0xF)) != 0;
                                }
                            } else {
                                bl = lIllIIII[0];
                            }
                            return bl;
                        }, (int)lIllIIII[5]);
                        0;
                    }
                }
                int[] nArray7 = new int[lIllIIII[1]];
                nArray7[u.lIllIIII[0]] = da;
                if (u.lIIlIIllIlI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[lIllIIII[1]];
                    nArray8[u.lIllIIII[0]] = da;
                    if (u.lIIlIIllIll(Inventory.getCount((int[])nArray8), lIllIIII[1])) {
                        Bank.withdraw((int)da, (int)lIllIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIllIIII[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIllIIII[1]];
                            nArray[u.lIllIIII[0]] = da;
                            if (u.lIIlIIllllI(Inventory.getCount((int[])nArray))) {
                                bl = lIllIIII[1];
                                0;
                                if ((0xE ^ 0xA) != (0xC5 ^ 0xC1)) {
                                    return ((0x79 ^ 0x31) & ~(0x56 ^ 0x1E)) != 0;
                                }
                            } else {
                                bl = lIllIIII[0];
                            }
                            return bl;
                        }, (int)lIllIIII[5]);
                        0;
                    }
                }
                int[] nArray9 = new int[lIllIIII[1]];
                nArray9[u.lIllIIII[0]] = lIllIIII[7];
                if (u.lIIlIIllIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    int[] nArray10 = new int[lIllIIII[1]];
                    nArray10[u.lIllIIII[0]] = lIllIIII[7];
                    if (u.lIIlIIllIll(Inventory.getCount((int[])nArray10), lIllIIII[1])) {
                        Bank.withdraw((int)lIllIIII[7], (int)lIllIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIllIIII[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIllIIII[1]];
                            nArray[u.lIllIIII[0]] = lIllIIII[7];
                            if (u.lIIlIIllllI(Inventory.getCount((int[])nArray))) {
                                bl = lIllIIII[1];
                                0;
                                if (null != null) {
                                    return ((134 + 38 - 109 + 181 ^ 54 + 187 - 237 + 191) & (0x23 ^ 0x29 ^ (0x13 ^ 0x2E) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIllIIII[0];
                            }
                            return bl;
                        }, (int)lIllIIII[5]);
                        0;
                    }
                }
                int[] nArray11 = new int[lIllIIII[1]];
                nArray11[u.lIllIIII[0]] = lIllIIII[8];
                if (u.lIIlIIllIlI(Bank.contains((int[])nArray11) ? 1 : 0)) {
                    int[] nArray12 = new int[lIllIIII[1]];
                    nArray12[u.lIllIIII[0]] = lIllIIII[8];
                    if (u.lIIlIIllIll(Inventory.getCount((int[])nArray12), lIllIIII[1])) {
                        Bank.withdraw((int)lIllIIII[8], (int)lIllIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIllIIII[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIllIIII[1]];
                            nArray[u.lIllIIII[0]] = lIllIIII[8];
                            if (u.lIIlIIllllI(Inventory.getCount((int[])nArray))) {
                                bl = lIllIIII[1];
                                0;
                                if (2 == 0) {
                                    return ((80 + 21 - -24 + 12 ^ 37 + 44 - -20 + 47) & (104 + 159 - 210 + 163 ^ 152 + 44 - 165 + 166 ^ -1)) != 0;
                                }
                            } else {
                                bl = lIllIIII[0];
                            }
                            return bl;
                        }, (int)lIllIIII[5]);
                        0;
                    }
                }
            }
            if (u.lIIlIIllIlI(u.aU() ? 1 : 0)) {
                if (u.lIIlIIllIlI(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (u.lIIlIIlllII(Bank.isOpen() ? 1 : 0)) {
                    if (u.lIIlIIllIlI(GrandExchange.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepTicks((int)lIllIIII[1]);
                        0;
                    }
                    int lIlllIlIlIlIIII = lIllIIII[0];
                    while (u.lIIlIIllIll(lIlllIlIlIlIIII, db.length)) {
                        int[] nArray = new int[lIllIIII[1]];
                        nArray[u.lIllIIII[0]] = db[lIlllIlIlIlIIII];
                        Item lIlllIlIlIIllll = Inventory.getFirst((int[])nArray);
                        if (u.lIIlIIlllIl(lIlllIlIlIIllll)) {
                            int[] nArray13 = new int[lIllIIII[1]];
                            nArray13[u.lIllIIII[0]] = lIlllIlIlIIllll.getId();
                            if (u.lIIlIIllIlI(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                String[] stringArray = new String[lIllIIII[1]];
                                stringArray[u.lIllIIII[0]] = lIlIllll[lIllIIII[10]];
                                if (u.lIIlIIllIlI(lIlllIlIlIIllll.hasAction(stringArray) ? 1 : 0)) {
                                    lIlllIlIlIIllll.interact(lIlIllll[lIllIIII[11]]);
                                    Time.sleepTicks((int)lIllIIII[1]);
                                    0;
                                }
                                String[] stringArray2 = new String[lIllIIII[1]];
                                stringArray2[u.lIllIIII[0]] = lIlIllll[lIllIIII[12]];
                                if (u.lIIlIIllIlI(lIlllIlIlIIllll.hasAction(stringArray2) ? 1 : 0)) {
                                    lIlllIlIlIIllll.interact(lIlIllll[lIllIIII[13]]);
                                    Time.sleepTicks((int)lIllIIII[1]);
                                    0;
                                }
                                String[] stringArray3 = new String[lIllIIII[1]];
                                stringArray3[u.lIllIIII[0]] = lIlIllll[lIllIIII[14]];
                                if (u.lIIlIIllIlI(lIlllIlIlIIllll.hasAction(stringArray3) ? 1 : 0)) {
                                    lIlllIlIlIIllll.interact(lIlIllll[lIllIIII[15]]);
                                    Time.sleepTicks((int)lIllIIII[1]);
                                    0;
                                }
                                Time.sleepTicks((int)lIllIIII[1]);
                                0;
                            }
                        }
                        ++lIlllIlIlIlIIII;
                        0;
                        if (1 <= 1) continue;
                        return;
                    }
                    if (u.lIIlIIllIlI(u.aV() ? 1 : 0) && u.lIIlIIlllII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIIII[16]);
                        0;
                    }
                }
            }
        }
    }

    private static boolean lIIlIIllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIllllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIIlllII(int n2) {
        return n2 == 0;
    }

    private static String lIIlIIlIlll(String lIlllIlIIIlllII, String lIlllIlIIIlllIl) {
        try {
            SecretKeySpec lIlllIlIIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllIlIIIlllIl.getBytes(StandardCharsets.UTF_8)), lIllIIII[11]), "DES");
            Cipher lIlllIlIIlIIIII = Cipher.getInstance("DES");
            lIlllIlIIlIIIII.init(lIllIIII[2], lIlllIlIIlIIIIl);
            return new String(lIlllIlIIlIIIII.doFinal(Base64.getDecoder().decode(lIlllIlIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllIlIIIlllll) {
            lIlllIlIIIlllll.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aU() {
        int n2;
        String[] stringArray = new String[lIllIIII[1]];
        stringArray[u.lIllIIII[0]] = lIlIllll[lIllIIII[17]];
        if (u.lIIlIIllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lIllIIII[1]];
            nArray[u.lIllIIII[0]] = lIllIIII[8];
            if (u.lIIlIIllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lIllIIII[1]];
                stringArray2[u.lIllIIII[0]] = lIlIllll[lIllIIII[18]];
                if (u.lIIlIIllIlI(Inventory.contains((String[])stringArray2) ? 1 : 0) && u.lIIlIIllIlI(Inventory.contains((int[])f.aT) ? 1 : 0)) {
                    n2 = lIllIIII[1];
                    0;
                    if (null == null) return n2 != 0;
                    return ((0x35 ^ 0x16) & ~(0x92 ^ 0xB1)) != 0;
                }
            }
        }
        n2 = lIllIIII[0];
        return n2 != 0;
    }

    private static void lIIlIIllIII() {
        lIlIllll = new String[lIllIIII[43]];
        u.lIlIllll[u.lIllIIII[0]] = u."Buying items";
        u.lIlIllll[u.lIllIIII[1]] = u."Finished buying items, switching back to gearing";
        u.lIlIllll[u.lIllIIII[2]] = u."Get Mage Gear Util";
        u.lIlIllll[u.lIllIIII[3]] = u."Navigating to bank";
        u.lIlIllll[u.lIllIIII[4]] = u."Opening bank";
        u.lIlIllll[u.lIllIIII[6]] = u."Handling banking";
        u.lIlIllll[u.lIllIIII[9]] = u."We are missing supplies, switching to BUYING Util";
        u.lIlIllll[u.lIllIIII[10]] = u."Wear";
        u.lIlIllll[u.lIllIIII[11]] = u."Wear";
        u.lIlIllll[u.lIllIIII[12]] = u."Wield";
        u.lIlIllll[u.lIllIIII[13]] = u."Wield";
        u.lIlIllll[u.lIllIIII[14]] = u."Equip";
        u.lIlIllll[u.lIllIIII[15]] = u."Equip";
        u.lIlIllll[u.lIllIIII[17]] = u."Staff of air";
        u.lIlIllll[u.lIllIIII[18]] = u."Leather gloves";
        u.lIlIllll[u.lIllIIII[19]] = u."Staff of air";
        u.lIlIllll[u.lIllIIII[20]] = u."Leather gloves";
        u.lIlIllll[u.lIllIIII[38]] = u."Wear";
        u.lIlIllll[u.lIllIIII[39]] = u."Wear";
        u.lIlIllll[u.lIllIIII[40]] = u."ring of wealth (";
    }

    private static String lIIlIIlIllI(String lIlllIlIIlIlIll, String lIlllIlIIlIlIlI) {
        try {
            SecretKeySpec lIlllIlIIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllIlIIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlllIlIIlIllIl = Cipher.getInstance("Blowfish");
            lIlllIlIIlIllIl.init(lIllIIII[2], lIlllIlIIlIlllI);
            return new String(lIlllIlIIlIllIl.doFinal(Base64.getDecoder().decode(lIlllIlIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllIlIIlIllII) {
            lIlllIlIIlIllII.printStackTrace();
            return null;
        }
    }

    public static void ag() {
        d lIlllIlIlIIlIll;
        Object lIlllIlIlIIllII;
        int[] nArray = new int[lIllIIII[1]];
        nArray[u.lIllIIII[0]] = cZ;
        if (u.lIIlIIlllII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(cZ, lIllIIII[1], lIllIIII[21]);
            bB.add(d2);
            0;
        }
        int[] nArray2 = new int[lIllIIII[1]];
        nArray2[u.lIllIIII[0]] = da;
        if (u.lIIlIIlllII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIlllIlIlIIllII = new d(da, lIllIIII[1], lIllIIII[22]);
            bB.add((d)lIlllIlIlIIllII);
            0;
        }
        int[] nArray3 = new int[lIllIIII[1]];
        nArray3[u.lIllIIII[0]] = lIllIIII[8];
        if (u.lIIlIIlllII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIlllIlIlIIllII = new d(lIllIIII[8], lIllIIII[1], lIllIIII[23]);
            bB.add((d)lIlllIlIlIIllII);
            0;
        }
        int[] nArray4 = new int[lIllIIII[1]];
        nArray4[u.lIllIIII[0]] = lIllIIII[7];
        if (u.lIIlIIlllII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIlllIlIlIIllII = new d(lIllIIII[7], lIllIIII[1], lIllIIII[24]);
            bB.add((d)lIlllIlIlIIllII);
            0;
        }
        int[] nArray5 = new int[lIllIIII[1]];
        nArray5[u.lIllIIII[0]] = lIllIIII[25];
        if (u.lIIlIIlllII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIlllIlIlIIllII = new d(lIllIIII[25], lIllIIII[5], lIllIIII[13]);
            bB.add((d)lIlllIlIlIIllII);
            0;
        }
        int[] nArray6 = new int[lIllIIII[1]];
        nArray6[u.lIllIIII[0]] = lIllIIII[26];
        if (u.lIIlIIlllII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lIlllIlIlIIllII = new d(lIllIIII[26], lIllIIII[27], lIllIIII[13]);
            bB.add((d)lIlllIlIlIIllII);
            0;
        }
        int[] nArray7 = new int[lIllIIII[1]];
        nArray7[u.lIllIIII[0]] = lIllIIII[28];
        if (u.lIIlIIlllII(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lIlllIlIlIIllII = new d(lIllIIII[28], lIllIIII[29], lIllIIII[13]);
            bB.add((d)lIlllIlIlIIllII);
            0;
        }
        int[] nArray8 = new int[lIllIIII[1]];
        nArray8[u.lIllIIII[0]] = lIllIIII[30];
        if (u.lIIlIIlllII(Bank.contains((int[])nArray8) ? 1 : 0)) {
            lIlllIlIlIIllII = new d(lIllIIII[30], lIllIIII[31], lIllIIII[13]);
            bB.add((d)lIlllIlIlIIllII);
            0;
        }
        int[] nArray9 = new int[lIllIIII[1]];
        nArray9[u.lIllIIII[0]] = lIllIIII[25];
        if (u.lIIlIIllIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
            int[] nArray10 = new int[lIllIIII[1]];
            nArray10[u.lIllIIII[0]] = lIllIIII[25];
            if (u.lIIlIIllIll(Bank.getFirst((int[])nArray10).getQuantity(), lIllIIII[32])) {
                lIlllIlIlIIllII = new d(lIllIIII[25], lIllIIII[5], lIllIIII[13]);
                bB.add((d)lIlllIlIlIIllII);
                0;
            }
        }
        int[] nArray11 = new int[lIllIIII[1]];
        nArray11[u.lIllIIII[0]] = lIllIIII[26];
        if (u.lIIlIIllIlI(Bank.contains((int[])nArray11) ? 1 : 0)) {
            int[] nArray12 = new int[lIllIIII[1]];
            nArray12[u.lIllIIII[0]] = lIllIIII[26];
            if (u.lIIlIIllIll(Bank.getFirst((int[])nArray12).getQuantity(), lIllIIII[32])) {
                lIlllIlIlIIllII = new d(lIllIIII[26], lIllIIII[27], lIllIIII[13]);
                bB.add((d)lIlllIlIlIIllII);
                0;
            }
        }
        int[] nArray13 = new int[lIllIIII[1]];
        nArray13[u.lIllIIII[0]] = lIllIIII[28];
        if (u.lIIlIIllIlI(Bank.contains((int[])nArray13) ? 1 : 0)) {
            int[] nArray14 = new int[lIllIIII[1]];
            nArray14[u.lIllIIII[0]] = lIllIIII[28];
            if (u.lIIlIIllIll(Bank.getFirst((int[])nArray14).getQuantity(), lIllIIII[32])) {
                lIlllIlIlIIllII = new d(lIllIIII[28], lIllIIII[29], lIllIIII[13]);
                bB.add((d)lIlllIlIlIIllII);
                0;
            }
        }
        int[] nArray15 = new int[lIllIIII[1]];
        nArray15[u.lIllIIII[0]] = lIllIIII[30];
        if (u.lIIlIIllIlI(Bank.contains((int[])nArray15) ? 1 : 0)) {
            int[] nArray16 = new int[lIllIIII[1]];
            nArray16[u.lIllIIII[0]] = lIllIIII[30];
            if (u.lIIlIIllIll(Bank.getFirst((int[])nArray16).getQuantity(), lIllIIII[32])) {
                lIlllIlIlIIllII = new d(lIllIIII[30], lIllIIII[31], lIllIIII[13]);
                bB.add((d)lIlllIlIlIIllII);
                0;
            }
        }
        if (u.lIIlIIlllII(Bank.contains((Predicate)(lIlllIlIlIIllII = item -> item.getName().toLowerCase().contains(lIlIllll[lIllIIII[40]]))) ? 1 : 0)) {
            lIlllIlIlIIlIll = new d(lIllIIII[33], lIllIIII[6], lIllIIII[34]);
            bB.add(lIlllIlIlIIlIll);
            0;
        }
        int[] nArray17 = new int[lIllIIII[1]];
        nArray17[u.lIllIIII[0]] = lIllIIII[35];
        if (u.lIIlIIlllII(Bank.contains((int[])nArray17) ? 1 : 0)) {
            lIlllIlIlIIlIll = new d(lIllIIII[35], lIllIIII[36], lIllIIII[37]);
            bB.add(lIlllIlIlIIlIll);
            0;
        }
    }
}

