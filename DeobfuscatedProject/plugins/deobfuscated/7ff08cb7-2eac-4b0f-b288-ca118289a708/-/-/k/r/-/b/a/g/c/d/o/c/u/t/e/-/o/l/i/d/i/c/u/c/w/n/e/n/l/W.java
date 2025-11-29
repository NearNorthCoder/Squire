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
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.H;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.as;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.j;
import gg.squire.account.AccBuilderGWD;
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
public class W
implements ab {
    private static final /* synthetic */ int lA;
    private static final /* synthetic */ int lB;
    static /* synthetic */ int dk;
    static /* synthetic */ boolean dl;
    private static /* synthetic */ int[] llIlllIIl;
    private static final /* synthetic */ int lC;
    private static final /* synthetic */ WorldPoint lr;
    private static final /* synthetic */ int lv;
    private static final /* synthetic */ int lt;
    private static final /* synthetic */ int lu;
    static /* synthetic */ int cI;
    static /* synthetic */ String[] eY;
    private static final /* synthetic */ int lx;
    public static /* synthetic */ List<d> bx;
    private static final /* synthetic */ int ls;
    public static /* synthetic */ boolean bv;
    private static final /* synthetic */ int ly;
    private static final /* synthetic */ int lw;
    static /* synthetic */ String kD;
    private static /* synthetic */ String[] llIllIllI;
    private static final /* synthetic */ int lz;

    private static boolean lIlllIIlllll(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (W.lIlllIlIIlll(e.j(llIlllIIl[2]), llIlllIIl[3])) {
            bl = llIlllIIl[1];
            0;
            if (1 <= ((0x31 ^ 0x2F) & ~(0xD8 ^ 0xC6))) {
                return ((0x42 ^ 7) & ~(0xE5 ^ 0xA0)) != 0;
            }
        } else {
            bl = llIlllIIl[0];
        }
        return bl;
    }

    private static void lIlllIIllllI() {
        llIlllIIl = new int[97];
        W.llIlllIIl[0] = (0x17 ^ 0x64 ^ (0x8D ^ 0xC7)) & (85 + 93 - 145 + 111 ^ 92 + 120 - 183 + 140 ^ -1);
        W.llIlllIIl[1] = 1;
        W.llIlllIIl[2] = 61 + 83 - 20 + 36;
        W.llIlllIIl[3] = 2;
        W.llIlllIIl[4] = 3;
        W.llIlllIIl[5] = -(0x3D ^ 0x75) & (0xFFFF9BFF & 0x77CF);
        W.llIlllIIl[6] = 0x18 ^ 0x1C;
        W.llIlllIIl[7] = 0xFFFFFF6D & 0x1FDB;
        W.llIlllIIl[8] = 0x21 ^ 0xE ^ (0x88 ^ 0xAD);
        W.llIlllIIl[9] = 0x12 ^ 0x17;
        W.llIlllIIl[10] = -(0xFFFFDDEB & 0x7F55) & (0xFFFFDFEE & 0x7F7F);
        W.llIlllIIl[11] = -(0xFFFFFC1B & 0x77F5) & (0xFFFFFFFE & 0x77F9);
        W.llIlllIIl[12] = 0x67 ^ 0x61;
        W.llIlllIIl[13] = -(0xFFFFBCEB & 0x7F55) & (0xFFFFBEFD & 0x7F6F);
        W.llIlllIIl[14] = 0x48 ^ 0x4F;
        W.llIlllIIl[15] = -(0xFFFFA6DF & 0x7D35) & (0xFFFFEF7F & 0x36BF);
        W.llIlllIIl[16] = 9 ^ 1;
        W.llIlllIIl[17] = 0xFFFFC7CD & 0x3FF3;
        W.llIlllIIl[18] = 0x56 ^ 0x5F;
        W.llIlllIIl[19] = 0xDD ^ 0xB9 ^ (0x79 ^ 0x16);
        W.llIlllIIl[20] = -(0xFFFFEDBB & 0x52CD) & (0xFFFFFFEF & 0x5FDF);
        W.llIlllIIl[21] = -(0xFFFFC37A & 0x7CC7) & (0xFFFFFDFF & 0x47FF);
        W.llIlllIIl[22] = 0xFFFF85C4 & 0x7FFB;
        W.llIlllIIl[23] = -(0xFFFFE83F & 0x5FC2) & (0xFFFFFDE3 & 0x4FDF);
        W.llIlllIIl[24] = 0xFFFF8DC6 & 0x77FD;
        W.llIlllIIl[25] = 0xFFFFFD7B & 0x3FF;
        W.llIlllIIl[26] = 0xFFFFB1FE & 0x4FF5;
        W.llIlllIIl[27] = 0xFFFFF151 & 0x3FFF;
        W.llIlllIIl[28] = 0xFFFFAB5E & 0x5EB5;
        W.llIlllIIl[29] = 0xFFFFFE5D & 0xDAA;
        W.llIlllIIl[30] = 81 + 7 - 18 + 95 ^ 4 + 2 - -64 + 107;
        W.llIlllIIl[31] = 0x78 ^ 0x67 ^ (0x7E ^ 0x6E);
        W.llIlllIIl[32] = 0x73 ^ 1 ^ (0x19 ^ 0x67);
        W.llIlllIIl[33] = 0xBB ^ 0xB6;
        W.llIlllIIl[34] = 0x71 ^ 0x7F;
        W.llIlllIIl[35] = 0x58 ^ 0x48;
        W.llIlllIIl[36] = 0x30 ^ 0x21;
        W.llIlllIIl[37] = -(0xFFFFFF0F & 0x5AFA) & (0xFFFFFFAF & 0x7F7F);
        W.llIlllIIl[38] = 0x16 ^ 4;
        W.llIlllIIl[39] = 0xFFFFFBFF & 0x2796;
        W.llIlllIIl[40] = 82 + 87 - 144 + 146 ^ 137 + 167 - 270 + 150;
        W.llIlllIIl[41] = 0xB0 ^ 0xA5;
        W.llIlllIIl[42] = 0xE3 ^ 0x87;
        W.llIlllIIl[43] = 0xFFFF83F5 & 0x7D9A;
        W.llIlllIIl[44] = 0x38 ^ 0x2E;
        W.llIlllIIl[45] = 61 + 147 - 63 + 29 ^ 41 + 114 - 85 + 64;
        W.llIlllIIl[46] = 0x47 ^ 0x50;
        W.llIlllIIl[47] = -(0xFFFFFEB7 & 0x4D4A) & (0xFFFFDFFF & 0x7FF7);
        W.llIlllIIl[48] = 0x71 ^ 0x69;
        W.llIlllIIl[49] = 0x92 ^ 0x9A ^ (0x7B ^ 0x6A);
        W.llIlllIIl[50] = 0xFFFFBFDC & 0x6EEF;
        W.llIlllIIl[51] = 0xFFFFCB7A & 0x76ED;
        W.llIlllIIl[52] = 0x3F ^ 0x29 ^ (0x97 ^ 0x9B);
        W.llIlllIIl[53] = 0xFFFFFFEE & 0x77D;
        W.llIlllIIl[54] = 0x88 ^ 0xC0 ^ (0x22 ^ 0x71);
        W.llIlllIIl[55] = 0x6D ^ 0x71;
        W.llIlllIIl[56] = 0xF5 ^ 0x8F ^ (0xC6 ^ 0xA1);
        W.llIlllIIl[57] = 0x6B ^ 0x75;
        W.llIlllIIl[58] = -(0xFFFF9DEF & 0x723E) & (0xFFFFF7FF & 0x1FFD);
        W.llIlllIIl[59] = 0xFFFFCF3E & 0x32ED;
        W.llIlllIIl[60] = 0xAF ^ 0xB0;
        W.llIlllIIl[61] = 0x30 ^ 0x10;
        W.llIlllIIl[62] = 0xF9 ^ 0x85 ^ (0xC3 ^ 0x9E);
        W.llIlllIIl[63] = 0x33 ^ 0x11;
        W.llIlllIIl[64] = 0xB5 ^ 0xAA ^ (0xFB ^ 0xC7);
        W.llIlllIIl[65] = 0x9F ^ 0xBB;
        W.llIlllIIl[66] = 0x89 ^ 0xAC;
        W.llIlllIIl[67] = 0x30 ^ 0x16;
        W.llIlllIIl[68] = 0x93 ^ 0xB4;
        W.llIlllIIl[69] = 0x5D ^ 0x74;
        W.llIlllIIl[70] = 0x1E ^ 0x34;
        W.llIlllIIl[71] = 102 + 134 - 147 + 147 ^ 169 + 83 - 135 + 82;
        W.llIlllIIl[72] = 0x44 ^ 0x16 ^ (0x46 ^ 0x38);
        W.llIlllIIl[73] = 0xA1 ^ 0xB8 ^ (0xF5 ^ 0xC1);
        W.llIlllIIl[74] = 0x68 ^ 0x21 ^ (0xEF ^ 0x88);
        W.llIlllIIl[75] = 0x35 ^ 0x5B ^ (0x4B ^ 0xA);
        W.llIlllIIl[76] = 0x4E ^ 0x7E;
        W.llIlllIIl[77] = 0x9C ^ 0xAD;
        W.llIlllIIl[78] = 0x54 ^ 0x66;
        W.llIlllIIl[79] = 108 + 116 - 53 + 17 ^ 58 + 103 - 79 + 61;
        W.llIlllIIl[80] = 0xCF ^ 0x8D ^ (0x3F ^ 0x49);
        W.llIlllIIl[81] = 0x8C ^ 0xB9;
        W.llIlllIIl[82] = 0x15 ^ 0x23;
        W.llIlllIIl[83] = 0xAF ^ 0x98;
        W.llIlllIIl[84] = 0x3A ^ 0x35 ^ (0xF ^ 0x38);
        W.llIlllIIl[85] = 31 + 32 - 51 + 124 ^ 154 + 170 - 267 + 120;
        W.llIlllIIl[86] = -(0xFFFFBDEF & 0x77D6) & (0xFFFFBFFF & 0x77EF);
        W.llIlllIIl[87] = 0xFFFF9CBA & 0x6F65;
        W.llIlllIIl[88] = 0xFFFFAFFB & 0x5C5F;
        W.llIlllIIl[89] = 0xB8 ^ 0xA0 ^ (0x17 ^ 0x35);
        W.llIlllIIl[90] = 0x40 ^ 0x2F ^ (0xCF ^ 0x9B);
        W.llIlllIIl[91] = 0x59 ^ 0x1A ^ 61 + 20 - 22 + 68;
        W.llIlllIIl[92] = 0x8E ^ 0xB3;
        W.llIlllIIl[93] = 0x59 ^ 0x67;
        W.llIlllIIl[94] = 0x21 ^ 0xF ^ (0x5E ^ 0x4F);
        W.llIlllIIl[95] = 0x4C ^ 0xC;
        W.llIlllIIl[96] = 0x51 ^ 0x10;
    }

    private static boolean lIlllIlIIlIl(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void bm() {
        void lIIIIllIlIlIlI;
        BankLocation bankLocation = BankLocation.getNearest();
        if (W.lIlllIlIIIlI(bankLocation) && W.lIlllIlIIIIl(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIllIllI[llIlllIIl[71]];
            a.a(bankLocation);
        }
        if (W.lIlllIlIIIlI(lIIIIllIlIlIlI) && W.lIlllIIlllll(lIIIIllIlIlIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (W.lIlllIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderGWD.c = llIllIllI[llIlllIIl[72]];
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)llIlllIIl[5]);
                0;
            }
            if (W.lIlllIIlllll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderGWD.c = llIllIllI[llIlllIIl[73]];
                if (W.lIlllIlIIIll(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)llIlllIIl[4]);
                    0;
                }
                if (W.lIlllIlIIIll(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)llIlllIIl[3]);
                    0;
                }
                String[] stringArray = new String[llIlllIIl[1]];
                stringArray[W.llIlllIIl[0]] = llIllIllI[llIlllIIl[74]];
                if (W.lIlllIIlllll(Bank.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[llIlllIIl[1]];
                    stringArray2[W.llIlllIIl[0]] = llIllIllI[llIlllIIl[75]];
                    if (W.lIlllIlIIIII(Bank.getFirst((String[])stringArray2).getQuantity(), llIlllIIl[11])) {
                        W.Q();
                        System.out.println(llIllIllI[llIlllIIl[76]]);
                        bv = llIlllIIl[1];
                        return;
                    }
                }
                String[] stringArray3 = new String[llIlllIIl[1]];
                stringArray3[W.llIlllIIl[0]] = llIllIllI[llIlllIIl[77]];
                if (W.lIlllIIlllll(Bank.contains((String[])stringArray3) ? 1 : 0)) {
                    String[] stringArray4 = new String[llIlllIIl[1]];
                    stringArray4[W.llIlllIIl[0]] = llIllIllI[llIlllIIl[78]];
                    if (W.lIlllIlIIIII(Bank.getFirst((String[])stringArray4).getQuantity(), llIlllIIl[11])) {
                        W.Q();
                        System.out.println(llIllIllI[llIlllIIl[79]]);
                        bv = llIlllIIl[1];
                        return;
                    }
                }
                String[] stringArray5 = new String[llIlllIIl[1]];
                stringArray5[W.llIlllIIl[0]] = llIllIllI[llIlllIIl[80]];
                if (W.lIlllIIlllll(Bank.contains((String[])stringArray5) ? 1 : 0)) {
                    String[] stringArray6 = new String[llIlllIIl[1]];
                    stringArray6[W.llIlllIIl[0]] = llIllIllI[llIlllIIl[81]];
                    if (W.lIlllIlIIIII(Bank.getFirst((String[])stringArray6).getQuantity(), llIlllIIl[11])) {
                        W.Q();
                        System.out.println(llIllIllI[llIlllIIl[82]]);
                        bv = llIlllIIl[1];
                        return;
                    }
                }
                int[] nArray = new int[llIlllIIl[19]];
                nArray[W.llIlllIIl[0]] = llIlllIIl[20];
                nArray[W.llIlllIIl[1]] = llIlllIIl[21];
                nArray[W.llIlllIIl[3]] = llIlllIIl[22];
                nArray[W.llIlllIIl[4]] = llIlllIIl[23];
                nArray[W.llIlllIIl[6]] = llIlllIIl[24];
                nArray[W.llIlllIIl[9]] = llIlllIIl[7];
                nArray[W.llIlllIIl[12]] = llIlllIIl[17];
                nArray[W.llIlllIIl[14]] = llIlllIIl[25];
                nArray[W.llIlllIIl[16]] = llIlllIIl[10];
                nArray[W.llIlllIIl[18]] = llIlllIIl[15];
                nArray[W.llIlllIIl[8]] = llIlllIIl[13];
                if (W.lIlllIlIIIIl(e.d(nArray) ? 1 : 0)) {
                    W.Q();
                    System.out.println(llIllIllI[llIlllIIl[83]]);
                    bv = llIlllIIl[1];
                    return;
                }
                while (W.lIlllIlIIIIl(H.bT() ? 1 : 0)) {
                    H.bR();
                    Time.sleepTicks((int)llIlllIIl[1]);
                    0;
                    0;
                    if (1 != 3) continue;
                    return;
                }
                if (W.lIlllIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepTicks((int)llIlllIIl[6]);
                    0;
                }
                int[] nArray2 = new int[llIlllIIl[1]];
                nArray2[W.llIlllIIl[0]] = llIlllIIl[22];
                if (W.lIlllIIlllll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[llIlllIIl[1]];
                    nArray3[W.llIlllIIl[0]] = llIlllIIl[22];
                    if (W.lIlllIlIIIII(Inventory.getCount((int[])nArray3), llIlllIIl[1])) {
                        Bank.withdraw((int)llIlllIIl[22], (int)llIlllIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIlllIIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIlllIIl[1]];
                            nArray[W.llIlllIIl[0]] = llIlllIIl[22];
                            if (W.lIlllIlIIIll(Inventory.getCount((int[])nArray))) {
                                bl = llIlllIIl[1];
                                0;
                                if (null != null) {
                                    return ((41 + 86 - 76 + 80 ^ 61 + 98 - 112 + 92) & (0x91 ^ 0xB0 ^ (0x7D ^ 0x54) ^ -1)) != 0;
                                }
                            } else {
                                bl = llIlllIIl[0];
                            }
                            return bl;
                        }, (int)llIlllIIl[5]);
                        0;
                    }
                }
                int[] nArray4 = new int[llIlllIIl[1]];
                nArray4[W.llIlllIIl[0]] = llIlllIIl[23];
                if (W.lIlllIIlllll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    int[] nArray5 = new int[llIlllIIl[1]];
                    nArray5[W.llIlllIIl[0]] = llIlllIIl[23];
                    if (W.lIlllIlIIIII(Inventory.getCount((int[])nArray5), llIlllIIl[1])) {
                        Bank.withdraw((int)llIlllIIl[23], (int)llIlllIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIlllIIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIlllIIl[1]];
                            nArray[W.llIlllIIl[0]] = llIlllIIl[23];
                            if (W.lIlllIlIIIll(Inventory.getCount((int[])nArray))) {
                                bl = llIlllIIl[1];
                                0;
                                if (2 <= ((0x27 ^ 0x47 ^ (0xFE ^ 0x85)) & (0xFD ^ 0x8B ^ (0xE0 ^ 0x8D) ^ -1))) {
                                    return ((0x1E ^ 2 ^ (0x52 ^ 0x18)) & (136 + 132 - 267 + 216 ^ 6 + 100 - 6 + 43 ^ -1)) != 0;
                                }
                            } else {
                                bl = llIlllIIl[0];
                            }
                            return bl;
                        }, (int)llIlllIIl[5]);
                        0;
                    }
                }
                int[] nArray6 = new int[llIlllIIl[1]];
                nArray6[W.llIlllIIl[0]] = llIlllIIl[21];
                if (W.lIlllIIlllll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                    int[] nArray7 = new int[llIlllIIl[1]];
                    nArray7[W.llIlllIIl[0]] = llIlllIIl[21];
                    if (W.lIlllIlIIIII(Inventory.getCount((int[])nArray7), llIlllIIl[1])) {
                        Bank.withdraw((int)llIlllIIl[21], (int)llIlllIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIlllIIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIlllIIl[1]];
                            nArray[W.llIlllIIl[0]] = llIlllIIl[21];
                            if (W.lIlllIlIIIll(Inventory.getCount((int[])nArray))) {
                                bl = llIlllIIl[1];
                                0;
                                if (((0x2B ^ 0x15 ^ (0x53 ^ 0x39)) & (0x30 ^ 0x26 ^ (0x1A ^ 0x58) ^ -1)) != 0) {
                                    return ((0x9D ^ 0x9B ^ (0x66 ^ 0x21)) & (0xE4 ^ 0xC6 ^ (0xC1 ^ 0xA2) ^ -1)) != 0;
                                }
                            } else {
                                bl = llIlllIIl[0];
                            }
                            return bl;
                        }, (int)llIlllIIl[5]);
                        0;
                    }
                }
                int[] nArray8 = new int[llIlllIIl[1]];
                nArray8[W.llIlllIIl[0]] = llIlllIIl[24];
                if (W.lIlllIIlllll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                    int[] nArray9 = new int[llIlllIIl[1]];
                    nArray9[W.llIlllIIl[0]] = llIlllIIl[24];
                    if (W.lIlllIlIIIII(Inventory.getCount((int[])nArray9), llIlllIIl[1])) {
                        Bank.withdraw((int)llIlllIIl[24], (int)llIlllIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIlllIIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIlllIIl[1]];
                            nArray[W.llIlllIIl[0]] = llIlllIIl[24];
                            if (W.lIlllIlIIIll(Inventory.getCount((int[])nArray))) {
                                bl = llIlllIIl[1];
                                0;
                                if (-1 > 2) {
                                    return ((0xDF ^ 0xA7 ^ (0xE4 ^ 0xA0)) & (75 + 85 - 65 + 75 ^ 140 + 128 - 260 + 142 ^ -1)) != 0;
                                }
                            } else {
                                bl = llIlllIIl[0];
                            }
                            return bl;
                        }, (int)llIlllIIl[5]);
                        0;
                    }
                }
                int[] nArray10 = new int[llIlllIIl[1]];
                nArray10[W.llIlllIIl[0]] = llIlllIIl[7];
                if (W.lIlllIIlllll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    int[] nArray11 = new int[llIlllIIl[1]];
                    nArray11[W.llIlllIIl[0]] = llIlllIIl[7];
                    if (W.lIlllIlIIIII(Inventory.getCount((int[])nArray11), llIlllIIl[1])) {
                        Bank.withdraw((int)llIlllIIl[7], (int)llIlllIIl[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIlllIIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIlllIIl[1]];
                            nArray[W.llIlllIIl[0]] = llIlllIIl[7];
                            if (W.lIlllIlIIIll(Inventory.getCount((int[])nArray))) {
                                bl = llIlllIIl[1];
                                0;
                                if (2 <= ((0x27 ^ 0x67) & ~(0x7D ^ 0x3D))) {
                                    return ((0x92 ^ 0x8C) & ~(0xDB ^ 0xC5)) != 0;
                                }
                            } else {
                                bl = llIlllIIl[0];
                            }
                            return bl;
                        }, (int)llIlllIIl[5]);
                        0;
                    }
                }
                int[] nArray12 = new int[llIlllIIl[1]];
                nArray12[W.llIlllIIl[0]] = llIlllIIl[17];
                if (W.lIlllIIlllll(Bank.contains((int[])nArray12) ? 1 : 0)) {
                    int[] nArray13 = new int[llIlllIIl[1]];
                    nArray13[W.llIlllIIl[0]] = llIlllIIl[17];
                    if (W.lIlllIlIIIII(Inventory.getCount((int[])nArray13), llIlllIIl[1])) {
                        Bank.withdraw((int)llIlllIIl[17], (int)llIlllIIl[6], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIlllIIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIlllIIl[1]];
                            nArray[W.llIlllIIl[0]] = llIlllIIl[17];
                            if (W.lIlllIlIIIll(Inventory.getCount((int[])nArray))) {
                                bl = llIlllIIl[1];
                                0;
                                if (3 <= 0) {
                                    return ((0x65 ^ 3 ^ (0xBE ^ 0xC6)) & (0x6A ^ 0x44 ^ (0x87 ^ 0xB7) ^ -1)) != 0;
                                }
                            } else {
                                bl = llIlllIIl[0];
                            }
                            return bl;
                        }, (int)llIlllIIl[5]);
                        0;
                    }
                }
                int[] nArray14 = new int[llIlllIIl[1]];
                nArray14[W.llIlllIIl[0]] = llIlllIIl[10];
                if (W.lIlllIIlllll(Bank.contains((int[])nArray14) ? 1 : 0)) {
                    int[] nArray15 = new int[llIlllIIl[1]];
                    nArray15[W.llIlllIIl[0]] = llIlllIIl[10];
                    if (W.lIlllIlIIIII(Inventory.getCount((int[])nArray15), llIlllIIl[1])) {
                        Bank.withdraw((int)llIlllIIl[10], (int)llIlllIIl[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIlllIIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIlllIIl[1]];
                            nArray[W.llIlllIIl[0]] = llIlllIIl[10];
                            if (W.lIlllIlIIIll(Inventory.getCount((int[])nArray))) {
                                bl = llIlllIIl[1];
                                0;
                                if (-1 == (0xCC ^ 0xAD ^ (0x22 ^ 0x47))) {
                                    return ((0xE ^ 0x21 ^ (0x83 ^ 0xB7)) & (0xA6 ^ 0x8A ^ (0xF7 ^ 0xC0) ^ -1)) != 0;
                                }
                            } else {
                                bl = llIlllIIl[0];
                            }
                            return bl;
                        }, (int)llIlllIIl[5]);
                        0;
                    }
                }
                int[] nArray16 = new int[llIlllIIl[1]];
                nArray16[W.llIlllIIl[0]] = llIlllIIl[15];
                if (W.lIlllIIlllll(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[llIlllIIl[1]];
                    nArray17[W.llIlllIIl[0]] = llIlllIIl[15];
                    if (W.lIlllIlIIIII(Inventory.getCount((int[])nArray17), llIlllIIl[1])) {
                        Bank.withdraw((int)llIlllIIl[15], (int)llIlllIIl[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIlllIIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIlllIIl[1]];
                            nArray[W.llIlllIIl[0]] = llIlllIIl[15];
                            if (W.lIlllIlIIIll(Inventory.getCount((int[])nArray))) {
                                bl = llIlllIIl[1];
                                0;
                                if (1 > 3) {
                                    return ((0x90 ^ 0x9F) & ~(0x65 ^ 0x6A)) != 0;
                                }
                            } else {
                                bl = llIlllIIl[0];
                            }
                            return bl;
                        }, (int)llIlllIIl[5]);
                        0;
                    }
                }
                int[] nArray18 = new int[llIlllIIl[1]];
                nArray18[W.llIlllIIl[0]] = llIlllIIl[13];
                if (W.lIlllIIlllll(Bank.contains((int[])nArray18) ? 1 : 0)) {
                    int[] nArray19 = new int[llIlllIIl[1]];
                    nArray19[W.llIlllIIl[0]] = llIlllIIl[13];
                    if (W.lIlllIlIIIII(Inventory.getCount((int[])nArray19), llIlllIIl[1])) {
                        Bank.withdraw((int)llIlllIIl[13], (int)llIlllIIl[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIlllIIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIlllIIl[1]];
                            nArray[W.llIlllIIl[0]] = llIlllIIl[13];
                            if (W.lIlllIlIIIll(Inventory.getCount((int[])nArray))) {
                                bl = llIlllIIl[1];
                                0;
                                if (null != null) {
                                    return ((0x1D ^ 0xA ^ (0x59 ^ 0x6D)) & (0x9B ^ 0xBF ^ (0xA7 ^ 0xA0) ^ -1)) != 0;
                                }
                            } else {
                                bl = llIlllIIl[0];
                            }
                            return bl;
                        }, (int)llIlllIIl[5]);
                        0;
                    }
                }
                int[] nArray20 = new int[llIlllIIl[1]];
                nArray20[W.llIlllIIl[0]] = llIlllIIl[27];
                if (W.lIlllIIlllll(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[llIlllIIl[1]];
                    nArray21[W.llIlllIIl[0]] = llIlllIIl[27];
                    if (W.lIlllIlIIIIl(Inventory.contains((int[])nArray21) ? 1 : 0)) {
                        Bank.withdraw((int)llIlllIIl[27], (int)llIlllIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIlllIIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            int[] nArray = new int[llIlllIIl[1]];
                            nArray[W.llIlllIIl[0]] = llIlllIIl[27];
                            return Inventory.contains((int[])nArray);
                        }, (int)llIlllIIl[5]);
                        0;
                    }
                }
                int[] nArray22 = new int[llIlllIIl[1]];
                nArray22[W.llIlllIIl[0]] = llIlllIIl[25];
                if (W.lIlllIIlllll(Bank.contains((int[])nArray22) ? 1 : 0)) {
                    int[] nArray23 = new int[llIlllIIl[1]];
                    nArray23[W.llIlllIIl[0]] = llIlllIIl[25];
                    if (W.lIlllIlIIIII(Inventory.getCount((int[])nArray23), llIlllIIl[1])) {
                        Bank.withdrawAll((int)llIlllIIl[25], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIlllIIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIlllIIl[1]];
                            nArray[W.llIlllIIl[0]] = llIlllIIl[25];
                            if (W.lIlllIlIIIll(Inventory.getCount((int[])nArray))) {
                                bl = llIlllIIl[1];
                                0;
                                if ((46 + 104 - 92 + 78 ^ 122 + 57 - 67 + 29) <= 0) {
                                    return ((45 + 128 - 158 + 147 ^ 91 + 179 - 178 + 96) & (0x5F ^ 0x3B ^ (0x21 ^ 0x5B) ^ -1)) != 0;
                                }
                            } else {
                                bl = llIlllIIl[0];
                            }
                            return bl;
                        }, (int)llIlllIIl[5]);
                        0;
                    }
                }
            }
        }
    }

    private static boolean lIlllIlIIIlI(Object object) {
        return object != null;
    }

    private static boolean lIlllIlIIlll(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean ae() {
        return llIlllIIl[0];
    }

    private static boolean lIlllIlIIIIl(int n2) {
        return n2 == 0;
    }

    static {
        W.lIlllIIllllI();
        W.lIlllIIlllIl();
        lC = llIlllIIl[17];
        lw = llIlllIIl[24];
        lu = llIlllIIl[22];
        lz = llIlllIIl[13];
        lA = llIlllIIl[86];
        ls = llIlllIIl[2];
        lt = llIlllIIl[21];
        lx = llIlllIIl[10];
        lB = llIlllIIl[25];
        lv = llIlllIIl[23];
        ly = llIlllIIl[15];
        lr = new WorldPoint(llIlllIIl[87], llIlllIIl[88], llIlllIIl[3]);
        bx = new ArrayList<d>();
        kD = llIllIllI[llIlllIIl[89]];
        String[] stringArray = new String[llIlllIIl[12]];
        stringArray[W.llIlllIIl[0]] = llIllIllI[llIlllIIl[90]];
        stringArray[W.llIlllIIl[1]] = llIllIllI[llIlllIIl[91]];
        stringArray[W.llIlllIIl[3]] = llIllIllI[llIlllIIl[92]];
        stringArray[W.llIlllIIl[4]] = llIllIllI[llIlllIIl[93]];
        stringArray[W.llIlllIIl[6]] = llIllIllI[llIlllIIl[94]];
        stringArray[W.llIlllIIl[9]] = llIllIllI[llIlllIIl[95]];
        eY = stringArray;
        cI = llIlllIIl[0];
    }

    @Override
    public String ag() {
        return llIllIllI[llIlllIIl[84]];
    }

    private static boolean lIlllIlIIIll(int n2) {
        return n2 > 0;
    }

    private static boolean lIlllIlIIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlllIlIIllI(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aM() {
        int n2;
        String[] stringArray = new String[llIlllIIl[1]];
        stringArray[W.llIlllIIl[0]] = llIllIllI[llIlllIIl[67]];
        if (W.lIlllIIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[llIlllIIl[1]];
            stringArray2[W.llIlllIIl[0]] = llIllIllI[llIlllIIl[68]];
            if (W.lIlllIIlllll(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                String[] stringArray3 = new String[llIlllIIl[1]];
                stringArray3[W.llIlllIIl[0]] = llIllIllI[llIlllIIl[45]];
                if (W.lIlllIIlllll(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                    String[] stringArray4 = new String[llIlllIIl[1]];
                    stringArray4[W.llIlllIIl[0]] = llIllIllI[llIlllIIl[69]];
                    if (W.lIlllIIlllll(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                        int[] nArray = new int[llIlllIIl[1]];
                        nArray[W.llIlllIIl[0]] = llIlllIIl[10];
                        if (W.lIlllIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray2 = new int[llIlllIIl[1]];
                            nArray2[W.llIlllIIl[0]] = llIlllIIl[15];
                            if (W.lIlllIIlllll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                                int[] nArray3 = new int[llIlllIIl[1]];
                                nArray3[W.llIlllIIl[0]] = llIlllIIl[13];
                                if (W.lIlllIIlllll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                    int[] nArray4 = new int[llIlllIIl[1]];
                                    nArray4[W.llIlllIIl[0]] = llIlllIIl[7];
                                    if (W.lIlllIIlllll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                                        int[] nArray5 = new int[llIlllIIl[1]];
                                        nArray5[W.llIlllIIl[0]] = llIlllIIl[25];
                                        if (W.lIlllIIlllll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                            String[] stringArray5 = new String[llIlllIIl[1]];
                                            stringArray5[W.llIlllIIl[0]] = llIllIllI[llIlllIIl[70]];
                                            if (W.lIlllIIlllll(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                                                n2 = llIlllIIl[1];
                                                0;
                                                if (-3 < 0) return n2 != 0;
                                                return ((129 + 185 - 101 + 28 ^ 115 + 111 - 85 + 37) & (38 + 38 - -57 + 88 ^ 3 + 72 - 52 + 135 ^ -1)) != 0;
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
        n2 = llIlllIIl[0];
        return n2 != 0;
    }

    public static void dk() {
        if (W.lIlllIIlllll(bv ? 1 : 0)) {
            AccBuilderGWD.c = llIllIllI[llIlllIIl[0]];
            b.a(bx);
            if (W.lIlllIlIIIII(bx.size(), llIlllIIl[1])) {
                System.out.println(llIllIllI[llIlllIIl[1]]);
                bv = llIlllIIl[0];
            }
        }
        if (W.lIlllIlIIIIl(bv ? 1 : 0)) {
            if (W.lIlllIlIIIIl(e.j(llIlllIIl[2]))) {
                BankLocation lIIIIllIllIIII;
                if (W.lIlllIlIIIIl(W.aM() ? 1 : 0)) {
                    lIIIIllIllIIII = BankLocation.getNearest();
                    if (W.lIlllIlIIIlI(lIIIIllIllIIII) && W.lIlllIlIIIIl(lIIIIllIllIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = llIllIllI[llIlllIIl[3]];
                        a.a(lIIIIllIllIIII);
                    }
                    if (W.lIlllIlIIIlI(lIIIIllIllIIII) && W.lIlllIIlllll(lIIIIllIllIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (W.lIlllIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderGWD.c = llIllIllI[llIlllIIl[4]];
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIlllIIl[5]);
                            0;
                        }
                        if (W.lIlllIIlllll(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderGWD.c = llIllIllI[llIlllIIl[6]];
                            if (W.lIlllIlIIIll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIlllIIl[4]);
                                0;
                            }
                            if (W.lIlllIlIIIll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llIlllIIl[3]);
                                0;
                            }
                            int[] nArray = new int[llIlllIIl[1]];
                            nArray[W.llIlllIIl[0]] = llIlllIIl[7];
                            if (W.lIlllIIlllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[llIlllIIl[1]];
                                nArray2[W.llIlllIIl[0]] = llIlllIIl[7];
                                if (W.lIlllIlIIIII(Bank.getFirst((int[])nArray2).getQuantity(), llIlllIIl[8])) {
                                    W.Q();
                                    System.out.println(llIllIllI[llIlllIIl[9]]);
                                    bv = llIlllIIl[1];
                                    return;
                                }
                            }
                            int[] nArray3 = new int[llIlllIIl[1]];
                            nArray3[W.llIlllIIl[0]] = llIlllIIl[10];
                            if (W.lIlllIIlllll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[llIlllIIl[1]];
                                nArray4[W.llIlllIIl[0]] = llIlllIIl[10];
                                if (W.lIlllIlIIIII(Bank.getFirst((int[])nArray4).getQuantity(), llIlllIIl[11])) {
                                    W.Q();
                                    System.out.println(llIllIllI[llIlllIIl[12]]);
                                    bv = llIlllIIl[1];
                                    return;
                                }
                            }
                            int[] nArray5 = new int[llIlllIIl[1]];
                            nArray5[W.llIlllIIl[0]] = llIlllIIl[13];
                            if (W.lIlllIIlllll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[llIlllIIl[1]];
                                nArray6[W.llIlllIIl[0]] = llIlllIIl[13];
                                if (W.lIlllIlIIIII(Bank.getFirst((int[])nArray6).getQuantity(), llIlllIIl[11])) {
                                    W.Q();
                                    System.out.println(llIllIllI[llIlllIIl[14]]);
                                    bv = llIlllIIl[1];
                                    return;
                                }
                            }
                            int[] nArray7 = new int[llIlllIIl[1]];
                            nArray7[W.llIlllIIl[0]] = llIlllIIl[15];
                            if (W.lIlllIIlllll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[llIlllIIl[1]];
                                nArray8[W.llIlllIIl[0]] = llIlllIIl[15];
                                if (W.lIlllIlIIIII(Bank.getFirst((int[])nArray8).getQuantity(), llIlllIIl[11])) {
                                    W.Q();
                                    System.out.println(llIllIllI[llIlllIIl[16]]);
                                    bv = llIlllIIl[1];
                                    return;
                                }
                            }
                            int[] nArray9 = new int[llIlllIIl[1]];
                            nArray9[W.llIlllIIl[0]] = llIlllIIl[17];
                            if (W.lIlllIIlllll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[llIlllIIl[1]];
                                nArray10[W.llIlllIIl[0]] = llIlllIIl[17];
                                if (W.lIlllIlIIIII(Bank.getFirst((int[])nArray10).getQuantity(), llIlllIIl[9])) {
                                    W.Q();
                                    System.out.println(llIllIllI[llIlllIIl[18]]);
                                    bv = llIlllIIl[1];
                                    return;
                                }
                            }
                            int[] nArray11 = new int[llIlllIIl[19]];
                            nArray11[W.llIlllIIl[0]] = llIlllIIl[20];
                            nArray11[W.llIlllIIl[1]] = llIlllIIl[21];
                            nArray11[W.llIlllIIl[3]] = llIlllIIl[22];
                            nArray11[W.llIlllIIl[4]] = llIlllIIl[23];
                            nArray11[W.llIlllIIl[6]] = llIlllIIl[24];
                            nArray11[W.llIlllIIl[9]] = llIlllIIl[7];
                            nArray11[W.llIlllIIl[12]] = llIlllIIl[17];
                            nArray11[W.llIlllIIl[14]] = llIlllIIl[25];
                            nArray11[W.llIlllIIl[16]] = llIlllIIl[10];
                            nArray11[W.llIlllIIl[18]] = llIlllIIl[15];
                            nArray11[W.llIlllIIl[8]] = llIlllIIl[13];
                            if (W.lIlllIlIIIIl(e.d(nArray11) ? 1 : 0)) {
                                W.Q();
                                System.out.println(llIllIllI[llIlllIIl[8]]);
                                bv = llIlllIIl[1];
                                return;
                            }
                            while (W.lIlllIlIIIIl(H.bT() ? 1 : 0)) {
                                H.bR();
                                Time.sleepTicks((int)llIlllIIl[1]);
                                0;
                                0;
                                if (3 != 1) continue;
                                return;
                            }
                            if (W.lIlllIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepTicks((int)llIlllIIl[6]);
                                0;
                            }
                            int[] nArray12 = new int[llIlllIIl[1]];
                            nArray12[W.llIlllIIl[0]] = llIlllIIl[22];
                            if (W.lIlllIIlllll(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                int[] nArray13 = new int[llIlllIIl[1]];
                                nArray13[W.llIlllIIl[0]] = llIlllIIl[22];
                                if (W.lIlllIlIIIII(Inventory.getCount((int[])nArray13), llIlllIIl[1])) {
                                    Bank.withdraw((int)llIlllIIl[22], (int)llIlllIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlllIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIlllIIl[1]];
                                        nArray[W.llIlllIIl[0]] = llIlllIIl[22];
                                        if (W.lIlllIlIIIll(Inventory.getCount((int[])nArray))) {
                                            bl = llIlllIIl[1];
                                            0;
                                            if (2 <= 0) {
                                                return ((0x44 ^ 0x5D) & ~(0x2D ^ 0x34)) != 0;
                                            }
                                        } else {
                                            bl = llIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)llIlllIIl[5]);
                                    0;
                                }
                            }
                            int[] nArray14 = new int[llIlllIIl[1]];
                            nArray14[W.llIlllIIl[0]] = llIlllIIl[23];
                            if (W.lIlllIIlllll(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                int[] nArray15 = new int[llIlllIIl[1]];
                                nArray15[W.llIlllIIl[0]] = llIlllIIl[23];
                                if (W.lIlllIlIIIII(Inventory.getCount((int[])nArray15), llIlllIIl[1])) {
                                    Bank.withdraw((int)llIlllIIl[23], (int)llIlllIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlllIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIlllIIl[1]];
                                        nArray[W.llIlllIIl[0]] = llIlllIIl[23];
                                        if (W.lIlllIlIIIll(Inventory.getCount((int[])nArray))) {
                                            bl = llIlllIIl[1];
                                            0;
                                            if (null != null) {
                                                return ((5 ^ 0x5B) & ~(0x4F ^ 0x11)) != 0;
                                            }
                                        } else {
                                            bl = llIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)llIlllIIl[5]);
                                    0;
                                }
                            }
                            int[] nArray16 = new int[llIlllIIl[1]];
                            nArray16[W.llIlllIIl[0]] = llIlllIIl[21];
                            if (W.lIlllIIlllll(Bank.contains((int[])nArray16) ? 1 : 0)) {
                                int[] nArray17 = new int[llIlllIIl[1]];
                                nArray17[W.llIlllIIl[0]] = llIlllIIl[21];
                                if (W.lIlllIlIIIII(Inventory.getCount((int[])nArray17), llIlllIIl[1])) {
                                    Bank.withdraw((int)llIlllIIl[21], (int)llIlllIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlllIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIlllIIl[1]];
                                        nArray[W.llIlllIIl[0]] = llIlllIIl[21];
                                        if (W.lIlllIlIIIll(Inventory.getCount((int[])nArray))) {
                                            bl = llIlllIIl[1];
                                            0;
                                            if (null != null) {
                                                return ((1 ^ (0x70 ^ 0x48)) & (160 + 186 - 159 + 4 ^ 117 + 8 - 30 + 39 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = llIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)llIlllIIl[5]);
                                    0;
                                }
                            }
                            int[] nArray18 = new int[llIlllIIl[1]];
                            nArray18[W.llIlllIIl[0]] = llIlllIIl[24];
                            if (W.lIlllIIlllll(Bank.contains((int[])nArray18) ? 1 : 0)) {
                                int[] nArray19 = new int[llIlllIIl[1]];
                                nArray19[W.llIlllIIl[0]] = llIlllIIl[24];
                                if (W.lIlllIlIIIII(Inventory.getCount((int[])nArray19), llIlllIIl[1])) {
                                    Bank.withdraw((int)llIlllIIl[24], (int)llIlllIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlllIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIlllIIl[1]];
                                        nArray[W.llIlllIIl[0]] = llIlllIIl[24];
                                        if (W.lIlllIlIIIll(Inventory.getCount((int[])nArray))) {
                                            bl = llIlllIIl[1];
                                            0;
                                            if (3 < 0) {
                                                return ((0xC9 ^ 0x99) & ~(0xF0 ^ 0xA0)) != 0;
                                            }
                                        } else {
                                            bl = llIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)llIlllIIl[5]);
                                    0;
                                }
                            }
                            int[] nArray20 = new int[llIlllIIl[1]];
                            nArray20[W.llIlllIIl[0]] = llIlllIIl[7];
                            if (W.lIlllIIlllll(Bank.contains((int[])nArray20) ? 1 : 0)) {
                                int[] nArray21 = new int[llIlllIIl[1]];
                                nArray21[W.llIlllIIl[0]] = llIlllIIl[7];
                                if (W.lIlllIlIIIII(Inventory.getCount((int[])nArray21), llIlllIIl[1])) {
                                    Bank.withdraw((int)llIlllIIl[7], (int)llIlllIIl[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlllIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIlllIIl[1]];
                                        nArray[W.llIlllIIl[0]] = llIlllIIl[7];
                                        if (W.lIlllIlIIIll(Inventory.getCount((int[])nArray))) {
                                            bl = llIlllIIl[1];
                                            0;
                                            if (1 == 2) {
                                                return ((0x4D ^ 0x60 ^ 16 + 90 - 37 + 58) & (9 ^ 0x6E ^ (0x72 ^ 0x47) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = llIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)llIlllIIl[5]);
                                    0;
                                }
                            }
                            int[] nArray22 = new int[llIlllIIl[1]];
                            nArray22[W.llIlllIIl[0]] = llIlllIIl[17];
                            if (W.lIlllIIlllll(Bank.contains((int[])nArray22) ? 1 : 0)) {
                                int[] nArray23 = new int[llIlllIIl[1]];
                                nArray23[W.llIlllIIl[0]] = llIlllIIl[17];
                                if (W.lIlllIlIIIII(Inventory.getCount((int[])nArray23), llIlllIIl[1])) {
                                    Bank.withdraw((int)llIlllIIl[17], (int)llIlllIIl[6], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlllIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIlllIIl[1]];
                                        nArray[W.llIlllIIl[0]] = llIlllIIl[17];
                                        if (W.lIlllIlIIIll(Inventory.getCount((int[])nArray))) {
                                            bl = llIlllIIl[1];
                                            0;
                                            if (3 < ((0x91 ^ 0xA5) & ~(0x35 ^ 1))) {
                                                return ((0xB ^ 0x6B) & ~(0x5D ^ 0x3D)) != 0;
                                            }
                                        } else {
                                            bl = llIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)llIlllIIl[5]);
                                    0;
                                }
                            }
                            int[] nArray24 = new int[llIlllIIl[1]];
                            nArray24[W.llIlllIIl[0]] = llIlllIIl[10];
                            if (W.lIlllIIlllll(Bank.contains((int[])nArray24) ? 1 : 0)) {
                                int[] nArray25 = new int[llIlllIIl[1]];
                                nArray25[W.llIlllIIl[0]] = llIlllIIl[10];
                                if (W.lIlllIlIIIII(Inventory.getCount((int[])nArray25), llIlllIIl[1])) {
                                    Bank.withdraw((int)llIlllIIl[10], (int)llIlllIIl[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlllIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIlllIIl[1]];
                                        nArray[W.llIlllIIl[0]] = llIlllIIl[10];
                                        if (W.lIlllIlIIIll(Inventory.getCount((int[])nArray))) {
                                            bl = llIlllIIl[1];
                                            0;
                                            if (3 < 1) {
                                                return ((0x6C ^ 0x47) & ~(0x2C ^ 7)) != 0;
                                            }
                                        } else {
                                            bl = llIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)llIlllIIl[5]);
                                    0;
                                }
                            }
                            int[] nArray26 = new int[llIlllIIl[1]];
                            nArray26[W.llIlllIIl[0]] = llIlllIIl[15];
                            if (W.lIlllIIlllll(Bank.contains((int[])nArray26) ? 1 : 0)) {
                                int[] nArray27 = new int[llIlllIIl[1]];
                                nArray27[W.llIlllIIl[0]] = llIlllIIl[15];
                                if (W.lIlllIlIIIII(Inventory.getCount((int[])nArray27), llIlllIIl[1])) {
                                    Bank.withdraw((int)llIlllIIl[15], (int)llIlllIIl[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlllIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIlllIIl[1]];
                                        nArray[W.llIlllIIl[0]] = llIlllIIl[15];
                                        if (W.lIlllIlIIIll(Inventory.getCount((int[])nArray))) {
                                            bl = llIlllIIl[1];
                                            0;
                                            if (((0x9B ^ 0xBA) & ~(0x66 ^ 0x47)) != 0) {
                                                return ((0x92 ^ 0x97) & ~(0x29 ^ 0x2C)) != 0;
                                            }
                                        } else {
                                            bl = llIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)llIlllIIl[5]);
                                    0;
                                }
                            }
                            int[] nArray28 = new int[llIlllIIl[1]];
                            nArray28[W.llIlllIIl[0]] = llIlllIIl[13];
                            if (W.lIlllIIlllll(Bank.contains((int[])nArray28) ? 1 : 0)) {
                                int[] nArray29 = new int[llIlllIIl[1]];
                                nArray29[W.llIlllIIl[0]] = llIlllIIl[13];
                                if (W.lIlllIlIIIII(Inventory.getCount((int[])nArray29), llIlllIIl[1])) {
                                    Bank.withdraw((int)llIlllIIl[13], (int)llIlllIIl[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlllIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIlllIIl[1]];
                                        nArray[W.llIlllIIl[0]] = llIlllIIl[13];
                                        if (W.lIlllIlIIIll(Inventory.getCount((int[])nArray))) {
                                            bl = llIlllIIl[1];
                                            0;
                                            if (((0x40 ^ 1) & ~(0x5B ^ 0x1A)) < -1) {
                                                return ((0x45 ^ 8) & ~(0x56 ^ 0x1B)) != 0;
                                            }
                                        } else {
                                            bl = llIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)llIlllIIl[5]);
                                    0;
                                }
                            }
                            int[] nArray30 = new int[llIlllIIl[1]];
                            nArray30[W.llIlllIIl[0]] = llIlllIIl[27];
                            if (W.lIlllIIlllll(Bank.contains((int[])nArray30) ? 1 : 0)) {
                                int[] nArray31 = new int[llIlllIIl[1]];
                                nArray31[W.llIlllIIl[0]] = llIlllIIl[27];
                                if (W.lIlllIlIIIIl(Inventory.contains((int[])nArray31) ? 1 : 0)) {
                                    Bank.withdraw((int)llIlllIIl[27], (int)llIlllIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlllIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[llIlllIIl[1]];
                                        nArray[W.llIlllIIl[0]] = llIlllIIl[27];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)llIlllIIl[5]);
                                    0;
                                }
                            }
                            int[] nArray32 = new int[llIlllIIl[1]];
                            nArray32[W.llIlllIIl[0]] = llIlllIIl[25];
                            if (W.lIlllIIlllll(Bank.contains((int[])nArray32) ? 1 : 0)) {
                                int[] nArray33 = new int[llIlllIIl[1]];
                                nArray33[W.llIlllIIl[0]] = llIlllIIl[25];
                                if (W.lIlllIlIIIII(Inventory.getCount((int[])nArray33), llIlllIIl[1])) {
                                    Bank.withdrawAll((int)llIlllIIl[25], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlllIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIlllIIl[1]];
                                        nArray[W.llIlllIIl[0]] = llIlllIIl[25];
                                        if (W.lIlllIlIIIll(Inventory.getCount((int[])nArray))) {
                                            bl = llIlllIIl[1];
                                            0;
                                            if (null != null) {
                                                return ((0x6C ^ 0x38 ^ (0x14 ^ 0x6C)) & (0xB9 ^ 0x9B ^ (0x17 ^ 0x19) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = llIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)llIlllIIl[5]);
                                    0;
                                }
                            }
                        }
                    }
                }
                if (W.lIlllIlIIlII(Players.getLocal().getWorldLocation().distanceTo(lr), llIlllIIl[6]) && W.lIlllIlIIlIl(Players.getLocal().getWorldLocation().getPlane(), llIlllIIl[3]) && W.lIlllIIlllll(W.aM() ? 1 : 0)) {
                    if (W.lIlllIIlllll(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        Time.sleepTicks((int)llIlllIIl[6]);
                        0;
                    }
                    AccBuilderGWD.c = llIllIllI[llIlllIIl[19]];
                    if (W.lIlllIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                        if (W.lIlllIlIIIII(cI, llIlllIIl[1])) {
                            e.x();
                            cI += llIlllIIl[1];
                        }
                        if (W.lIlllIIlllll((lIIIIllIllIIII = new WorldArea(llIlllIIl[28], llIlllIIl[29], llIlllIIl[30], llIlllIIl[31], llIlllIIl[3])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray = new String[llIlllIIl[1]];
                            stringArray[W.llIlllIIl[0]] = llIllIllI[llIlllIIl[32]];
                            TileObjects.getNearest((String[])stringArray).interact(llIllIllI[llIlllIIl[33]]);
                            Time.sleepTicks((int)e.c(llIlllIIl[12], llIlllIIl[16]));
                            0;
                        }
                        Movement.walkTo((WorldPoint)lr);
                        0;
                        Time.sleepTicks((int)llIlllIIl[3]);
                        0;
                    }
                }
                if (W.lIlllIlIIllI(Players.getLocal().getWorldLocation().distanceTo(lr), llIlllIIl[12])) {
                    AccBuilderGWD.c = llIllIllI[llIlllIIl[34]];
                    dk = llIlllIIl[0];
                    g.a(kD, eY);
                    if (W.lIlllIIlllll(g.M() ? 1 : 0)) {
                        g.a(eY);
                    }
                }
            }
            if (W.lIlllIlIIIll(e.j(llIlllIIl[2])) && W.lIlllIlIIIII(e.j(llIlllIIl[2]), llIlllIIl[3])) {
                if (W.lIlllIlIIIIl(W.aM() ? 1 : 0)) {
                    W.bm();
                }
                if (W.lIlllIIlllll(W.aM() ? 1 : 0)) {
                    if (W.lIlllIlIIlII(Players.getLocal().getWorldLocation().distanceTo(lr), llIlllIIl[12])) {
                        AccBuilderGWD.c = llIllIllI[llIlllIIl[31]];
                        if (W.lIlllIIlllll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)lr);
                        0;
                        Time.sleepTicks((int)llIlllIIl[1]);
                        0;
                    }
                    if (W.lIlllIlIIllI(Players.getLocal().getWorldLocation().distanceTo(lr), llIlllIIl[12])) {
                        AccBuilderGWD.c = llIllIllI[llIlllIIl[35]];
                        if (W.lIlllIlIIIII(dk, llIlllIIl[1])) {
                            as.pU += llIlllIIl[1];
                            as.u(AccBuilderGWD.m);
                            dk += llIlllIIl[1];
                            as.pU = llIlllIIl[0];
                            dl = llIlllIIl[0];
                        }
                        g.a(kD, eY);
                        if (W.lIlllIIlllll(g.M() ? 1 : 0)) {
                            g.a(eY);
                        }
                    }
                }
            }
            System.out.println("Setting: " + e.j(llIlllIIl[2]));
            g.a(new String[llIlllIIl[0]]);
        }
    }

    private static String lIlllIIIllII(String lIIIIlIllllIIl, String lIIIIlIllllIlI) {
        try {
            SecretKeySpec lIIIIlIllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIlIllllIlI.getBytes(StandardCharsets.UTF_8)), llIlllIIl[16]), "DES");
            Cipher lIIIIlIlllllIl = Cipher.getInstance("DES");
            lIIIIlIlllllIl.init(llIlllIIl[3], lIIIIlIllllllI);
            return new String(lIIIIlIlllllIl.doFinal(Base64.getDecoder().decode(lIIIIlIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIlIlllllII) {
            lIIIIlIlllllII.printStackTrace();
            return null;
        }
    }

    @Override
    public int af() {
        try {
            W.dk();
            0;
        }
        catch (Exception lIIIIllIlIlIII) {
            lIIIIllIlIlIII.printStackTrace();
        }
        if (-1 >= 2) {
            return (0x67 ^ 0x38 ^ (0x54 ^ 0x5A)) & (24 + 157 - 23 + 58 ^ 72 + 106 - 120 + 79 ^ -1);
        }
        return llIlllIIl[42];
    }

    private static boolean lIlllIlIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlllIIIlIll(String lIIIIllIIIlIII, String lIIIIllIIIIlIl) {
        try {
            SecretKeySpec lIIIIllIIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIllIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIIllIIIlIlI = Cipher.getInstance("Blowfish");
            lIIIIllIIIlIlI.init(llIlllIIl[3], lIIIIllIIIlIll);
            return new String(lIIIIllIIIlIlI.doFinal(Base64.getDecoder().decode(lIIIIllIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIllIIIlIIl) {
            lIIIIllIIIlIIl.printStackTrace();
            return null;
        }
    }

    private static void lIlllIIlllIl() {
        llIllIllI = new String[llIlllIIl[96]];
        W.llIllIllI[W.llIlllIIl[0]] = W."Buying items";
        W.llIllIllI[W.llIlllIIl[1]] = W."Finished buying items, switching back to questing";
        W.llIllIllI[W.llIlllIIl[3]] = W."Navigating to bank";
        W.llIllIllI[W.llIlllIIl[4]] = W."Opening bank";
        W.llIllIllI[W.llIlllIIl[6]] = W."Handling banking";
        W.llIllIllI[W.llIlllIIl[9]] = W."We are missing supplies, switching to BUYING";
        W.llIllIllI[W.llIlllIIl[12]] = W."We are missing supplies, switching to BUYING";
        W.llIllIllI[W.llIlllIIl[14]] = W."We are missing supplies, switching to BUYING";
        W.llIllIllI[W.llIlllIIl[16]] = W."We are missing supplies, switching to BUYING";
        W.llIllIllI[W.llIlllIIl[18]] = W."We are missing supplies, switching to BUYING";
        W.llIllIllI[W.llIlllIIl[8]] = W."We are missing supplies, switching to BUYING";
        W.llIllIllI[W.llIlllIIl[19]] = W."Walking to imp start";
        W.llIllIllI[W.llIlllIIl[32]] = W."Magic Portal";
        W.llIllIllI[W.llIlllIIl[33]] = W."Enter";
        W.llIllIllI[W.llIlllIIl[34]] = W."Handling quest";
        W.llIllIllI[W.llIlllIIl[31]] = W."Nav to start";
        W.llIllIllI[W.llIlllIIl[35]] = W."Finishing quest";
        W.llIllIllI[W.llIlllIIl[36]] = W."Adding red bead to buy list";
        W.llIllIllI[W.llIlllIIl[38]] = W."Adding yellow bead to buy list";
        W.llIllIllI[W.llIlllIIl[40]] = W."Adding black bead to buy list";
        W.llIllIllI[W.llIlllIIl[30]] = W."Adding white bead to buy list";
        W.llIllIllI[W.llIlllIIl[41]] = W."Adding lobster to buy list";
        W.llIllIllI[W.llIlllIIl[44]] = W."Adding lobster to buy list";
        W.llIllIllI[W.llIlllIIl[46]] = W."Adding cheese to buy list";
        W.llIllIllI[W.llIlllIIl[48]] = W."Adding cheese to buy list";
        W.llIllIllI[W.llIlllIIl[49]] = W."Adding wealth to buy list";
        W.llIllIllI[W.llIlllIIl[52]] = W."Adding varrock tabs to buy list";
        W.llIllIllI[W.llIlllIIl[54]] = W."Adding fally tabs to buy list";
        W.llIllIllI[W.llIlllIIl[55]] = W."Adding fally tabs to buy list";
        W.llIllIllI[W.llIlllIIl[56]] = W."Adding staminas to buy list";
        W.llIllIllI[W.llIlllIIl[57]] = W."Adding mind runes to buy list";
        W.llIllIllI[W.llIlllIIl[60]] = W."Adding air runes to buy list";
        W.llIllIllI[W.llIlllIIl[61]] = W."Adding water runes to buy list";
        W.llIllIllI[W.llIlllIIl[62]] = W."Adding earth runes to buy list";
        W.llIllIllI[W.llIlllIIl[63]] = W."Adding air runes to buy list";
        W.llIllIllI[W.llIlllIIl[64]] = W."Adding water runes to buy list";
        W.llIllIllI[W.llIlllIIl[65]] = W."Adding earth runes to buy list";
        W.llIllIllI[W.llIlllIIl[66]] = W."Adding mind runes to buy list";
        W.llIllIllI[W.llIlllIIl[67]] = W."Red bead";
        W.llIllIllI[W.llIlllIIl[68]] = W."Yellow bead";
        W.llIllIllI[W.llIlllIIl[45]] = W."Black bead";
        W.llIllIllI[W.llIlllIIl[69]] = W."White bead";
        W.llIllIllI[W.llIlllIIl[70]] = W."Cheese";
        W.llIllIllI[W.llIlllIIl[71]] = W."Navigating to bank";
        W.llIllIllI[W.llIlllIIl[72]] = W."Opening bank";
        W.llIllIllI[W.llIlllIIl[73]] = W."Handling banking";
        W.llIllIllI[W.llIlllIIl[74]] = W."Mind rune";
        W.llIllIllI[W.llIlllIIl[75]] = W."Mind rune";
        W.llIllIllI[W.llIlllIIl[76]] = W."We are missing supplies, switching to BUYING";
        W.llIllIllI[W.llIlllIIl[77]] = W."Earth rune";
        W.llIllIllI[W.llIlllIIl[78]] = W."Earth rune";
        W.llIllIllI[W.llIlllIIl[79]] = W."We are missing supplies, switching to BUYING";
        W.llIllIllI[W.llIlllIIl[80]] = W."Water rune";
        W.llIllIllI[W.llIlllIIl[81]] = W."Water rune";
        W.llIllIllI[W.llIlllIIl[82]] = W."We are missing supplies, switching to BUYING";
        W.llIllIllI[W.llIlllIIl[83]] = W."We are missing supplies, switching to BUYING";
        W.llIllIllI[W.llIlllIIl[84]] = W."Imp Catcher quest";
        W.llIllIllI[W.llIlllIIl[85]] = W."ring of wealth (";
        W.llIllIllI[W.llIlllIIl[89]] = W."Wizard Mizgog";
        W.llIllIllI[W.llIlllIIl[90]] = W."Give me a quest please.";
        W.llIllIllI[W.llIlllIIl[91]] = W."I'll try.";
        W.llIllIllI[W.llIlllIIl[92]] = W."Actually, I know where to find this stuff.";
        W.llIllIllI[W.llIlllIIl[93]] = W."Yes.";
        W.llIllIllI[W.llIlllIIl[94]] = W."What's the matter?";
        W.llIllIllI[W.llIlllIIl[95]] = W."Ok, I'll see what I can do.";
    }

    private static String lIlllIIIlIlI(String lIIIIllIIlllIl, String lIIIIllIIlllII) {
        lIIIIllIIlllIl = new String(Base64.getDecoder().decode(lIIIIllIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIIllIIllIll = new StringBuilder();
        char[] lIIIIllIIllIlI = lIIIIllIIlllII.toCharArray();
        int lIIIIllIIllIIl = llIlllIIl[0];
        char[] lIIIIllIIlIIll = lIIIIllIIlllIl.toCharArray();
        int lIIIIllIIlIIlI = lIIIIllIIlIIll.length;
        int lIIIIllIIlIIIl = llIlllIIl[0];
        while (W.lIlllIlIIIII(lIIIIllIIlIIIl, lIIIIllIIlIIlI)) {
            char lIIIIllIIllllI = lIIIIllIIlIIll[lIIIIllIIlIIIl];
            lIIIIllIIllIll.append((char)(lIIIIllIIllllI ^ lIIIIllIIllIlI[lIIIIllIIllIIl % lIIIIllIIllIlI.length]));
            0;
            ++lIIIIllIIllIIl;
            ++lIIIIllIIlIIIl;
            0;
            if (1 >= ((92 + 21 - 100 + 120 ^ 34 + 67 - -9 + 46) & (0xB9 ^ 0x9E ^ (0x9D ^ 0xA3) ^ -1))) continue;
            return null;
        }
        return String.valueOf(lIIIIllIIllIll);
    }

    private static void Q() {
        d lIIIIllIlIllII;
        block37: {
            block36: {
                block35: {
                    block34: {
                        Object lIIIIllIlIllIl;
                        block33: {
                            block32: {
                                int[] nArray = new int[llIlllIIl[1]];
                                nArray[W.llIlllIIl[0]] = llIlllIIl[21];
                                if (W.lIlllIlIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    System.out.println(llIllIllI[llIlllIIl[36]]);
                                    d d2 = new d(llIlllIIl[21], llIlllIIl[1], llIlllIIl[37]);
                                    bx.add(d2);
                                    0;
                                }
                                int[] nArray2 = new int[llIlllIIl[1]];
                                nArray2[W.llIlllIIl[0]] = llIlllIIl[22];
                                if (W.lIlllIlIIIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    System.out.println(llIllIllI[llIlllIIl[38]]);
                                    lIIIIllIlIllIl = new d(llIlllIIl[22], llIlllIIl[1], llIlllIIl[39]);
                                    bx.add((d)lIIIIllIlIllIl);
                                    0;
                                }
                                int[] nArray3 = new int[llIlllIIl[1]];
                                nArray3[W.llIlllIIl[0]] = llIlllIIl[23];
                                if (W.lIlllIlIIIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                    System.out.println(llIllIllI[llIlllIIl[40]]);
                                    lIIIIllIlIllIl = new d(llIlllIIl[23], llIlllIIl[1], llIlllIIl[39]);
                                    bx.add((d)lIIIIllIlIllIl);
                                    0;
                                }
                                int[] nArray4 = new int[llIlllIIl[1]];
                                nArray4[W.llIlllIIl[0]] = llIlllIIl[24];
                                if (W.lIlllIlIIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    System.out.println(llIllIllI[llIlllIIl[30]]);
                                    lIIIIllIlIllIl = new d(llIlllIIl[24], llIlllIIl[1], llIlllIIl[39]);
                                    bx.add((d)lIIIIllIlIllIl);
                                    0;
                                }
                                int[] nArray5 = new int[llIlllIIl[1]];
                                nArray5[W.llIlllIIl[0]] = llIlllIIl[25];
                                if (W.lIlllIlIIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    System.out.println(llIllIllI[llIlllIIl[41]]);
                                    lIIIIllIlIllIl = new d(llIlllIIl[25], llIlllIIl[42], llIlllIIl[43]);
                                    bx.add((d)lIIIIllIlIllIl);
                                    0;
                                }
                                int[] nArray6 = new int[llIlllIIl[1]];
                                nArray6[W.llIlllIIl[0]] = llIlllIIl[25];
                                if (W.lIlllIIlllll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                    int[] nArray7 = new int[llIlllIIl[1]];
                                    nArray7[W.llIlllIIl[0]] = llIlllIIl[25];
                                    if (W.lIlllIlIIIII(Bank.getFirst((int[])nArray7).getQuantity(), llIlllIIl[30])) {
                                        System.out.println(llIllIllI[llIlllIIl[44]]);
                                        lIIIIllIlIllIl = new d(llIlllIIl[25], llIlllIIl[45], llIlllIIl[43]);
                                        bx.add((d)lIIIIllIlIllIl);
                                        0;
                                    }
                                }
                                int[] nArray8 = new int[llIlllIIl[1]];
                                nArray8[W.llIlllIIl[0]] = llIlllIIl[17];
                                if (W.lIlllIlIIIIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                    System.out.println(llIllIllI[llIlllIIl[46]]);
                                    lIIIIllIlIllIl = new d(llIlllIIl[17], llIlllIIl[9], llIlllIIl[47]);
                                    bx.add((d)lIIIIllIlIllIl);
                                    0;
                                }
                                int[] nArray9 = new int[llIlllIIl[1]];
                                nArray9[W.llIlllIIl[0]] = llIlllIIl[17];
                                if (!W.lIlllIIlllll(Bank.contains((int[])nArray9) ? 1 : 0)) break block32;
                                int[] nArray10 = new int[llIlllIIl[1]];
                                nArray10[W.llIlllIIl[0]] = llIlllIIl[17];
                                if (!W.lIlllIIlllll(Bank.contains((int[])nArray10) ? 1 : 0)) break block33;
                                int[] nArray11 = new int[llIlllIIl[1]];
                                nArray11[W.llIlllIIl[0]] = llIlllIIl[17];
                                if (!W.lIlllIlIIIII(Bank.getFirst((int[])nArray11).getQuantity(), llIlllIIl[9])) break block33;
                            }
                            System.out.println(llIllIllI[llIlllIIl[48]]);
                            lIIIIllIlIllIl = new d(llIlllIIl[17], llIlllIIl[9], llIlllIIl[47]);
                            bx.add((d)lIIIIllIlIllIl);
                            0;
                        }
                        if (W.lIlllIlIIIIl(Bank.contains((Predicate)(lIIIIllIlIllIl = item -> item.getName().toLowerCase().contains(llIllIllI[llIlllIIl[85]]))) ? 1 : 0)) {
                            System.out.println(llIllIllI[llIlllIIl[49]]);
                            lIIIIllIlIllII = new d(llIlllIIl[50], llIlllIIl[38], llIlllIIl[51]);
                            bx.add(lIIIIllIlIllII);
                            0;
                        }
                        int[] nArray = new int[llIlllIIl[1]];
                        nArray[W.llIlllIIl[0]] = llIlllIIl[20];
                        if (!W.lIlllIIlllll(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray12 = new int[llIlllIIl[1]];
                        nArray12[W.llIlllIIl[0]] = llIlllIIl[20];
                        if (!W.lIlllIIlllll(Bank.contains((int[])nArray12) ? 1 : 0)) break block35;
                        int[] nArray13 = new int[llIlllIIl[1]];
                        nArray13[W.llIlllIIl[0]] = llIlllIIl[20];
                        if (!W.lIlllIlIIIII(Bank.getFirst((int[])nArray13).getQuantity(), llIlllIIl[30])) break block35;
                    }
                    System.out.println(llIllIllI[llIlllIIl[52]]);
                    lIIIIllIlIllII = new d(llIlllIIl[20], llIlllIIl[45], llIlllIIl[53]);
                    bx.add(lIIIIllIlIllII);
                    0;
                }
                int[] nArray = new int[llIlllIIl[1]];
                nArray[W.llIlllIIl[0]] = llIlllIIl[7];
                if (W.lIlllIlIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    System.out.println(llIllIllI[llIlllIIl[54]]);
                    lIIIIllIlIllII = new d(llIlllIIl[7], llIlllIIl[30], llIlllIIl[53]);
                    bx.add(lIIIIllIlIllII);
                    0;
                }
                int[] nArray14 = new int[llIlllIIl[1]];
                nArray14[W.llIlllIIl[0]] = llIlllIIl[7];
                if (!W.lIlllIIlllll(Bank.contains((int[])nArray14) ? 1 : 0)) break block36;
                int[] nArray15 = new int[llIlllIIl[1]];
                nArray15[W.llIlllIIl[0]] = llIlllIIl[7];
                if (!W.lIlllIIlllll(Bank.contains((int[])nArray15) ? 1 : 0)) break block37;
                int[] nArray16 = new int[llIlllIIl[1]];
                nArray16[W.llIlllIIl[0]] = llIlllIIl[7];
                if (!W.lIlllIlIIIII(Bank.getFirst((int[])nArray16).getQuantity(), llIlllIIl[30])) break block37;
            }
            System.out.println(llIllIllI[llIlllIIl[55]]);
            lIIIIllIlIllII = new d(llIlllIIl[7], llIlllIIl[30], llIlllIIl[53]);
            bx.add(lIIIIllIlIllII);
            0;
        }
        int[] nArray = new int[llIlllIIl[1]];
        nArray[W.llIlllIIl[0]] = llIlllIIl[27];
        if (W.lIlllIlIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            System.out.println(llIllIllI[llIlllIIl[56]]);
            lIIIIllIlIllII = new d(llIlllIIl[27], llIlllIIl[9], j.ch);
            bx.add(lIIIIllIlIllII);
            0;
        }
        int[] nArray17 = new int[llIlllIIl[1]];
        nArray17[W.llIlllIIl[0]] = llIlllIIl[10];
        if (W.lIlllIIlllll(Bank.contains((int[])nArray17) ? 1 : 0)) {
            int[] nArray18 = new int[llIlllIIl[1]];
            nArray18[W.llIlllIIl[0]] = llIlllIIl[10];
            if (W.lIlllIlIIIII(Bank.getFirst((int[])nArray18).getQuantity(), llIlllIIl[11])) {
                System.out.println(llIllIllI[llIlllIIl[57]]);
                lIIIIllIlIllII = new d(llIlllIIl[10], llIlllIIl[58], llIlllIIl[14]);
                bx.add(lIIIIllIlIllII);
                0;
            }
        }
        int[] nArray19 = new int[llIlllIIl[1]];
        nArray19[W.llIlllIIl[0]] = llIlllIIl[59];
        if (W.lIlllIIlllll(Bank.contains((int[])nArray19) ? 1 : 0)) {
            int[] nArray20 = new int[llIlllIIl[1]];
            nArray20[W.llIlllIIl[0]] = llIlllIIl[59];
            if (W.lIlllIlIIIII(Bank.getFirst((int[])nArray20).getQuantity(), llIlllIIl[11])) {
                System.out.println(llIllIllI[llIlllIIl[60]]);
                lIIIIllIlIllII = new d(llIlllIIl[59], llIlllIIl[58], llIlllIIl[14]);
                bx.add(lIIIIllIlIllII);
                0;
            }
        }
        int[] nArray21 = new int[llIlllIIl[1]];
        nArray21[W.llIlllIIl[0]] = llIlllIIl[15];
        if (W.lIlllIIlllll(Bank.contains((int[])nArray21) ? 1 : 0)) {
            int[] nArray22 = new int[llIlllIIl[1]];
            nArray22[W.llIlllIIl[0]] = llIlllIIl[15];
            if (W.lIlllIlIIIII(Bank.getFirst((int[])nArray22).getQuantity(), llIlllIIl[11])) {
                System.out.println(llIllIllI[llIlllIIl[61]]);
                lIIIIllIlIllII = new d(llIlllIIl[15], llIlllIIl[58], llIlllIIl[14]);
                bx.add(lIIIIllIlIllII);
                0;
            }
        }
        int[] nArray23 = new int[llIlllIIl[1]];
        nArray23[W.llIlllIIl[0]] = llIlllIIl[13];
        if (W.lIlllIIlllll(Bank.contains((int[])nArray23) ? 1 : 0)) {
            int[] nArray24 = new int[llIlllIIl[1]];
            nArray24[W.llIlllIIl[0]] = llIlllIIl[13];
            if (W.lIlllIlIIIII(Bank.getFirst((int[])nArray24).getQuantity(), llIlllIIl[11])) {
                System.out.println(llIllIllI[llIlllIIl[62]]);
                lIIIIllIlIllII = new d(llIlllIIl[13], llIlllIIl[58], llIlllIIl[14]);
                bx.add(lIIIIllIlIllII);
                0;
            }
        }
        int[] nArray25 = new int[llIlllIIl[1]];
        nArray25[W.llIlllIIl[0]] = llIlllIIl[59];
        if (W.lIlllIlIIIIl(Bank.contains((int[])nArray25) ? 1 : 0)) {
            System.out.println(llIllIllI[llIlllIIl[63]]);
            lIIIIllIlIllII = new d(llIlllIIl[59], llIlllIIl[58], llIlllIIl[14]);
            bx.add(lIIIIllIlIllII);
            0;
        }
        int[] nArray26 = new int[llIlllIIl[1]];
        nArray26[W.llIlllIIl[0]] = llIlllIIl[15];
        if (W.lIlllIlIIIIl(Bank.contains((int[])nArray26) ? 1 : 0)) {
            System.out.println(llIllIllI[llIlllIIl[64]]);
            lIIIIllIlIllII = new d(llIlllIIl[15], llIlllIIl[58], llIlllIIl[14]);
            bx.add(lIIIIllIlIllII);
            0;
        }
        int[] nArray27 = new int[llIlllIIl[1]];
        nArray27[W.llIlllIIl[0]] = llIlllIIl[13];
        if (W.lIlllIlIIIIl(Bank.contains((int[])nArray27) ? 1 : 0)) {
            System.out.println(llIllIllI[llIlllIIl[65]]);
            lIIIIllIlIllII = new d(llIlllIIl[13], llIlllIIl[58], llIlllIIl[14]);
            bx.add(lIIIIllIlIllII);
            0;
        }
        int[] nArray28 = new int[llIlllIIl[1]];
        nArray28[W.llIlllIIl[0]] = llIlllIIl[10];
        if (W.lIlllIlIIIIl(Bank.contains((int[])nArray28) ? 1 : 0)) {
            System.out.println(llIllIllI[llIlllIIl[66]]);
            lIIIIllIlIllII = new d(llIlllIIl[10], llIlllIIl[58], llIlllIIl[14]);
            bx.add(lIIIIllIlIllII);
            0;
        }
    }
}

