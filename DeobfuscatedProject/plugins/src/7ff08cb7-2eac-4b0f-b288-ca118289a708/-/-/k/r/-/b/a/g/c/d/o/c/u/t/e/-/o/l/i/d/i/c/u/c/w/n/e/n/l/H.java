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
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f;
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
import net.runelite.api.Item;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class H {
    private static /* synthetic */ int fE;
    private static /* synthetic */ int fD;
    public static /* synthetic */ boolean bv;
    private static /* synthetic */ String[] llIlIIIII;
    public static /* synthetic */ List<d> bx;
    private static /* synthetic */ int[] llIlIIIIl;
    private static /* synthetic */ int[] fF;

    private static void lIllIIIIIIII() {
        llIlIIIIl = new int[44];
        H.llIlIIIIl[0] = (97 + 70 - 78 + 157 ^ 139 + 116 - 252 + 177) & (232 + 182 - 195 + 34 ^ 63 + 59 - -30 + 39 ^ -" ".length());
        H.llIlIIIIl[1] = " ".length();
        H.llIlIIIIl[2] = "  ".length();
        H.llIlIIIIl[3] = "   ".length();
        H.llIlIIIIl[4] = 0x53 ^ 0x6C ^ (0x9A ^ 0xA1);
        H.llIlIIIIl[5] = -(0xFFFFF6FC & 0x6D5B) & (0xFFFFFFFF & 0x77DF);
        H.llIlIIIIl[6] = 0xF ^ 0xA;
        H.llIlIIIIl[7] = -(0xFFFFADD3 & 0x562F) & (0xFFFFBFFF & 0x4DFA);
        H.llIlIIIIl[8] = -(0xFFFFFF77 & 0x51DB) & (0xFFFFDFFA & 0x77FF);
        H.llIlIIIIl[9] = 67 + 108 - 118 + 110 ^ 71 + 19 - 24 + 95;
        H.llIlIIIIl[10] = 0x46 ^ 0x41;
        H.llIlIIIIl[11] = 0x98 ^ 0x90;
        H.llIlIIIIl[12] = 0x27 ^ 0x6D ^ (0xE5 ^ 0xA6);
        H.llIlIIIIl[13] = 0xA0 ^ 0xAA;
        H.llIlIIIIl[14] = 0x50 ^ 0x3B ^ (0x58 ^ 0x38);
        H.llIlIIIIl[15] = 0x5C ^ 0x50;
        H.llIlIIIIl[16] = 0xFFFFDBF4 & 0x3D6F;
        H.llIlIIIIl[17] = 128 + 105 - 135 + 104 ^ 55 + 155 - 47 + 36;
        H.llIlIIIIl[18] = 0xC ^ 2;
        H.llIlIIIIl[19] = 0x19 ^ 0x26 ^ (0x2D ^ 0x1D);
        H.llIlIIIIl[20] = 71 + 13 - 75 + 122 ^ 82 + 135 - 191 + 121;
        H.llIlIIIIl[21] = -(0xFFFFB865 & 0x4FBF) & (0xFFFFA8FE & Short.MAX_VALUE);
        H.llIlIIIIl[22] = -(0xFFFFDA65 & 0x779B) & (0xFFFFD7F7 & 0x7FEE);
        H.llIlIIIIl[23] = -(0xFFFFDDC7 & 0x3239) & (0xFFFFFFDF & 0x7F7E);
        H.llIlIIIIl[24] = 0xFFFFBFEF & 0x555A;
        H.llIlIIIIl[25] = -(0xFFFFD5CE & 0x7E73) & (0xFFFFD7EF & 0x7E7F);
        H.llIlIIIIl[26] = -(0xFFFFDDCF & 0x3775) & (0xFFFFBF6F & 0x57FF);
        H.llIlIIIIl[27] = 0xFFFF9FFF & 0x6BB8;
        H.llIlIIIIl[28] = -(0xFFFFC99D & 0x7FF3) & (0xFFFFFFBD & 0x4BFF);
        H.llIlIIIIl[29] = -(0xFFFFF85E & 0x57A7) & (0xFFFFFFB5 & 0x5FEF);
        H.llIlIIIIl[30] = 0xFFFFC7BA & 0x3A6F;
        H.llIlIIIIl[31] = -(0xFFFFABF7 & 0x742E) & (0xFFFFFF67 & 0x3FFD);
        H.llIlIIIIl[32] = 0xFFFF9BF5 & 0x65FE;
        H.llIlIIIIl[33] = -(0xFFFFBB43 & 0x55BF) & (0xFFFFBFFF & 0x7FCE);
        H.llIlIIIIl[34] = -(0xFFFFBD39 & 0x5ED7) & (0xFFFFFFB8 & 0x7DFF);
        H.llIlIIIIl[35] = -(0xFFFFD9AD & 0x66D3) & (0xFFFFDFF7 & 0x7FCF);
        H.llIlIIIIl[36] = -(0xFFFFC5E7 & 0x7A3A) & (0xFFFFEBF1 & 0x55BF);
        H.llIlIIIIl[37] = -(0xFFFFDD4B & 0x7AF5) & (0xFFFFFFF4 & 0x5BCF);
        H.llIlIIIIl[38] = 0x55 ^ 0x44;
        H.llIlIIIIl[39] = 0x90 ^ 0x98 ^ (0x9D ^ 0x87);
        H.llIlIIIIl[40] = 38 + 85 - 78 + 96 ^ 83 + 152 - 112 + 35;
        H.llIlIIIIl[41] = -(0xFFFFEEE7 & 0x7199) & (0xFFFFE7EF & 0x7DF5);
        H.llIlIIIIl[42] = 0xFFFFAFE7 & 0x543B;
        H.llIlIIIIl[43] = 0xBD ^ 0xA9;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean bS() {
        int n2;
        String[] stringArray = new String[llIlIIIIl[1]];
        stringArray[H.llIlIIIIl[0]] = llIlIIIII[llIlIIIIl[17]];
        if (H.lIllIIIIIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[llIlIIIIl[1]];
            nArray[H.llIlIIIIl[0]] = llIlIIIIl[8];
            if (H.lIllIIIIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                String[] stringArray2 = new String[llIlIIIIl[1]];
                stringArray2[H.llIlIIIIl[0]] = llIlIIIII[llIlIIIIl[18]];
                if (H.lIllIIIIIIIl(Inventory.contains((String[])stringArray2) ? 1 : 0) && H.lIllIIIIIIIl(Inventory.contains((int[])f.aU) ? 1 : 0)) {
                    n2 = llIlIIIIl[1];
                    "".length();
                    if (((0x57 ^ 0x48 ^ (0xB2 ^ 0xA3)) & (119 + 2 - 102 + 163 ^ 35 + 111 - -32 + 6 ^ -" ".length())) == 0) return n2 != 0;
                    return ((16 + 21 - 2 + 103 ^ 73 + 10 - -1 + 66) & (0x77 ^ 0x5E ^ (0x82 ^ 0xB7) ^ -" ".length())) != 0;
                }
            }
        }
        n2 = llIlIIIIl[0];
        return n2 != 0;
    }

    private static boolean lIllIIIIIIIl(int n2) {
        return n2 != 0;
    }

    private static String lIlIllllllIl(String lIIlllIlIIlIlI, String lIIlllIlIIlIll) {
        try {
            SecretKeySpec lIIlllIlIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlllIlIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlllIlIIlllI = Cipher.getInstance("Blowfish");
            lIIlllIlIIlllI.init(llIlIIIIl[2], lIIlllIlIIllll);
            return new String(lIIlllIlIIlllI.doFinal(Base64.getDecoder().decode(lIIlllIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlllIlIIllIl) {
            lIIlllIlIIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIIlIl(int n2) {
        return n2 > 0;
    }

    static {
        H.lIllIIIIIIII();
        H.lIlIllllllll();
        bx = new ArrayList<d>();
        fD = llIlIIIIl[41];
        fE = llIlIIIIl[42];
        int[] nArray = new int[llIlIIIIl[4]];
        nArray[H.llIlIIIIl[0]] = fD;
        nArray[H.llIlIIIIl[1]] = fE;
        nArray[H.llIlIIIIl[2]] = llIlIIIIl[8];
        nArray[H.llIlIIIIl[3]] = llIlIIIIl[7];
        fF = nArray;
    }

    public static void Q() {
        d lIIlllIlIlIlII;
        Object lIIlllIlIlIlIl;
        int[] nArray = new int[llIlIIIIl[1]];
        nArray[H.llIlIIIIl[0]] = fD;
        if (H.lIllIIIIIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(fD, llIlIIIIl[1], llIlIIIIl[21]);
            bx.add(d2);
            "".length();
        }
        int[] nArray2 = new int[llIlIIIIl[1]];
        nArray2[H.llIlIIIIl[0]] = fE;
        if (H.lIllIIIIIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIIlllIlIlIlIl = new d(fE, llIlIIIIl[1], llIlIIIIl[22]);
            bx.add((d)lIIlllIlIlIlIl);
            "".length();
        }
        int[] nArray3 = new int[llIlIIIIl[1]];
        nArray3[H.llIlIIIIl[0]] = llIlIIIIl[8];
        if (H.lIllIIIIIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIIlllIlIlIlIl = new d(llIlIIIIl[8], llIlIIIIl[1], llIlIIIIl[23]);
            bx.add((d)lIIlllIlIlIlIl);
            "".length();
        }
        int[] nArray4 = new int[llIlIIIIl[1]];
        nArray4[H.llIlIIIIl[0]] = llIlIIIIl[7];
        if (H.lIllIIIIIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIIlllIlIlIlIl = new d(llIlIIIIl[7], llIlIIIIl[1], llIlIIIIl[24]);
            bx.add((d)lIIlllIlIlIlIl);
            "".length();
        }
        int[] nArray5 = new int[llIlIIIIl[1]];
        nArray5[H.llIlIIIIl[0]] = llIlIIIIl[25];
        if (H.lIllIIIIIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIIlllIlIlIlIl = new d(llIlIIIIl[25], llIlIIIIl[5], llIlIIIIl[13]);
            bx.add((d)lIIlllIlIlIlIl);
            "".length();
        }
        int[] nArray6 = new int[llIlIIIIl[1]];
        nArray6[H.llIlIIIIl[0]] = llIlIIIIl[26];
        if (H.lIllIIIIIIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lIIlllIlIlIlIl = new d(llIlIIIIl[26], llIlIIIIl[27], llIlIIIIl[13]);
            bx.add((d)lIIlllIlIlIlIl);
            "".length();
        }
        int[] nArray7 = new int[llIlIIIIl[1]];
        nArray7[H.llIlIIIIl[0]] = llIlIIIIl[28];
        if (H.lIllIIIIIIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lIIlllIlIlIlIl = new d(llIlIIIIl[28], llIlIIIIl[29], llIlIIIIl[13]);
            bx.add((d)lIIlllIlIlIlIl);
            "".length();
        }
        int[] nArray8 = new int[llIlIIIIl[1]];
        nArray8[H.llIlIIIIl[0]] = llIlIIIIl[30];
        if (H.lIllIIIIIIll(Bank.contains((int[])nArray8) ? 1 : 0)) {
            lIIlllIlIlIlIl = new d(llIlIIIIl[30], llIlIIIIl[31], llIlIIIIl[13]);
            bx.add((d)lIIlllIlIlIlIl);
            "".length();
        }
        int[] nArray9 = new int[llIlIIIIl[1]];
        nArray9[H.llIlIIIIl[0]] = llIlIIIIl[25];
        if (H.lIllIIIIIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
            int[] nArray10 = new int[llIlIIIIl[1]];
            nArray10[H.llIlIIIIl[0]] = llIlIIIIl[25];
            if (H.lIllIIIIIIlI(Bank.getFirst((int[])nArray10).getQuantity(), llIlIIIIl[32])) {
                lIIlllIlIlIlIl = new d(llIlIIIIl[25], llIlIIIIl[5], llIlIIIIl[13]);
                bx.add((d)lIIlllIlIlIlIl);
                "".length();
            }
        }
        int[] nArray11 = new int[llIlIIIIl[1]];
        nArray11[H.llIlIIIIl[0]] = llIlIIIIl[26];
        if (H.lIllIIIIIIIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
            int[] nArray12 = new int[llIlIIIIl[1]];
            nArray12[H.llIlIIIIl[0]] = llIlIIIIl[26];
            if (H.lIllIIIIIIlI(Bank.getFirst((int[])nArray12).getQuantity(), llIlIIIIl[32])) {
                lIIlllIlIlIlIl = new d(llIlIIIIl[26], llIlIIIIl[27], llIlIIIIl[13]);
                bx.add((d)lIIlllIlIlIlIl);
                "".length();
            }
        }
        int[] nArray13 = new int[llIlIIIIl[1]];
        nArray13[H.llIlIIIIl[0]] = llIlIIIIl[28];
        if (H.lIllIIIIIIIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
            int[] nArray14 = new int[llIlIIIIl[1]];
            nArray14[H.llIlIIIIl[0]] = llIlIIIIl[28];
            if (H.lIllIIIIIIlI(Bank.getFirst((int[])nArray14).getQuantity(), llIlIIIIl[32])) {
                lIIlllIlIlIlIl = new d(llIlIIIIl[28], llIlIIIIl[29], llIlIIIIl[13]);
                bx.add((d)lIIlllIlIlIlIl);
                "".length();
            }
        }
        int[] nArray15 = new int[llIlIIIIl[1]];
        nArray15[H.llIlIIIIl[0]] = llIlIIIIl[30];
        if (H.lIllIIIIIIIl(Bank.contains((int[])nArray15) ? 1 : 0)) {
            int[] nArray16 = new int[llIlIIIIl[1]];
            nArray16[H.llIlIIIIl[0]] = llIlIIIIl[30];
            if (H.lIllIIIIIIlI(Bank.getFirst((int[])nArray16).getQuantity(), llIlIIIIl[32])) {
                lIIlllIlIlIlIl = new d(llIlIIIIl[30], llIlIIIIl[31], llIlIIIIl[13]);
                bx.add((d)lIIlllIlIlIlIl);
                "".length();
            }
        }
        if (H.lIllIIIIIIll(Bank.contains((Predicate)(lIIlllIlIlIlIl = item -> item.getName().toLowerCase().contains(llIlIIIII[llIlIIIIl[40]]))) ? 1 : 0)) {
            lIIlllIlIlIlII = new d(llIlIIIIl[33], llIlIIIIl[6], llIlIIIIl[34]);
            bx.add(lIIlllIlIlIlII);
            "".length();
        }
        int[] nArray17 = new int[llIlIIIIl[1]];
        nArray17[H.llIlIIIIl[0]] = llIlIIIIl[35];
        if (H.lIllIIIIIIll(Bank.contains((int[])nArray17) ? 1 : 0)) {
            lIIlllIlIlIlII = new d(llIlIIIIl[35], llIlIIIIl[36], llIlIIIIl[37]);
            bx.add(lIIlllIlIlIlII);
            "".length();
        }
    }

    private static void lIlIllllllll() {
        llIlIIIII = new String[llIlIIIIl[43]];
        H.llIlIIIII[H.llIlIIIIl[0]] = H.lIlIllllllII("MDA0JwIVZSQ6CR82", "rEMNl");
        H.llIlIIIII[H.llIlIIIIl[1]] = H.lIlIllllllII("MC06LT0eITBkLAM9PSopVi0gISMFaHQ3OR8wNywnGCN0Ji8VL3QwIVYjMSU8Hyoz", "vDTDN");
        H.llIlIIIII[H.llIlIIIIl[2]] = H.lIlIllllllIl("pA8XVl1U3D+f9m+UbwNjwCpNAKrYrkjl", "HrFwm");
        H.llIlIIIII[H.llIlIIIIl[3]] = H.lIlIllllllIl("JHjrCqeBM7RGaToV4ujNjDTCUvU9g7JM", "lRfPK");
        H.llIlIIIII[H.llIlIIIIl[4]] = H.lIlIllllllII("HBYHJC89AUIoJz0N", "SfbJF");
        H.llIlIIIII[H.llIlIIIIl[6]] = H.lIlIlllllllI("f3+B/N805jrIbosGFn4JY0m5BaEQvXr9", "bcJAR");
        H.llIlIIIII[H.llIlIIIIl[9]] = H.lIlIllllllII("OylZNzYJbBQ/Nx8lFzFkHzkJJigFKQp6ZB87ECInBCUXMWQYI1kUETUFNxFkOTgQOg==", "lLyVD");
        H.llIlIIIII[H.llIlIIIIl[10]] = H.lIlIllllllIl("ZGzVluOFCOA=", "VQMlT");
        H.llIlIIIII[H.llIlIIIIl[11]] = H.lIlIllllllIl("If4/Q7dqCj4=", "kfKmF");
        H.llIlIIIII[H.llIlIIIIl[12]] = H.lIlIlllllllI("kc+MMoWQPpE=", "vEHBk");
        H.llIlIIIII[H.llIlIIIIl[13]] = H.lIlIllllllIl("Txxbi1WavWM=", "mVdwJ");
        H.llIlIIIII[H.llIlIIIIl[14]] = H.lIlIllllllIl("unjg1qfU4hA=", "kGDAI");
        H.llIlIIIII[H.llIlIIIIl[15]] = H.lIlIllllllIl("OUlkrZHRkU0=", "AWDSg");
        H.llIlIIIII[H.llIlIIIIl[17]] = H.lIlIlllllllI("67E+zUvUxmkkieai/QYTLw==", "linMw");
        H.llIlIIIII[H.llIlIIIIl[18]] = H.lIlIllllllIl("2YP/hvpn0sg1xVUY1cje1g==", "Hnmve");
        H.llIlIIIII[H.llIlIIIIl[19]] = H.lIlIlllllllI("cBLwRSgwRBeJSczK/V3zMw==", "svXEX");
        H.llIlIIIII[H.llIlIIIIl[20]] = H.lIlIllllllII("ORQHOzAQA0YoNBoHAzw=", "uqfOX");
        H.llIlIIIII[H.llIlIIIIl[38]] = H.lIlIllllllIl("t6+KoAlC6mE=", "VMXpy");
        H.llIlIIIII[H.llIlIIIIl[39]] = H.lIlIllllllIl("9X6h1whZybM=", "tKwJC");
        H.llIlIIIII[H.llIlIIIIl[40]] = H.lIlIlllllllI("KoVYykIKRfpLsoYfDE6fOcfqxfNLZmfG", "vnjVt");
    }

    private static String lIlIllllllII(String lIIlllIIlIllll, String lIIlllIIlIlllI) {
        lIIlllIIlIllll = new String(Base64.getDecoder().decode(lIIlllIIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIlllIIlIllIl = new StringBuilder();
        char[] lIIlllIIlIllII = lIIlllIIlIlllI.toCharArray();
        int lIIlllIIlIlIll = llIlIIIIl[0];
        char[] lIIlllIIlIIlIl = lIIlllIIlIllll.toCharArray();
        int lIIlllIIlIIlII = lIIlllIIlIIlIl.length;
        int lIIlllIIlIIIll = llIlIIIIl[0];
        while (H.lIllIIIIIIlI(lIIlllIIlIIIll, lIIlllIIlIIlII)) {
            char lIIlllIIllIIII = lIIlllIIlIIlIl[lIIlllIIlIIIll];
            lIIlllIIlIllIl.append((char)(lIIlllIIllIIII ^ lIIlllIIlIllII[lIIlllIIlIlIll % lIIlllIIlIllII.length]));
            "".length();
            ++lIIlllIIlIlIll;
            ++lIIlllIIlIIIll;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lIIlllIIlIllIl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean bT() {
        int n2;
        String[] stringArray = new String[llIlIIIIl[1]];
        stringArray[H.llIlIIIIl[0]] = llIlIIIII[llIlIIIIl[19]];
        if (H.lIllIIIIIIIl(Equipment.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[llIlIIIIl[1]];
            nArray[H.llIlIIIIl[0]] = llIlIIIIl[8];
            if (H.lIllIIIIIIIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIlIIIIl[1]];
                nArray2[H.llIlIIIIl[0]] = llIlIIIIl[7];
                if (H.lIllIIIIIIIl(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                    String[] stringArray2 = new String[llIlIIIIl[1]];
                    stringArray2[H.llIlIIIIl[0]] = llIlIIIII[llIlIIIIl[20]];
                    if (H.lIllIIIIIIIl(Equipment.contains((String[])stringArray2) ? 1 : 0)) {
                        n2 = llIlIIIIl[1];
                        "".length();
                        if ((0xA ^ 0xE) >= (0x49 ^ 0x4D)) return n2 != 0;
                        return ((0x35 ^ 0x54) & ~(0xA2 ^ 0xC3)) != 0;
                    }
                }
            }
        }
        n2 = llIlIIIIl[0];
        return n2 != 0;
    }

    public static void bR() {
        block28: {
            block29: {
                block34: {
                    block31: {
                        block33: {
                            block32: {
                                block30: {
                                    if (H.lIllIIIIIIIl(bv ? 1 : 0)) {
                                        AccBuilderGWD.c = llIlIIIII[llIlIIIIl[0]];
                                        b.a(bx);
                                        if (H.lIllIIIIIIlI(bx.size(), llIlIIIIl[1])) {
                                            System.out.println(llIlIIIII[llIlIIIIl[1]]);
                                            bv = llIlIIIIl[0];
                                        }
                                    }
                                    if (!H.lIllIIIIIIll(bv ? 1 : 0) || !H.lIllIIIIIIll(H.bT() ? 1 : 0)) break block28;
                                    System.out.println(llIlIIIII[llIlIIIIl[2]]);
                                    if (!H.lIllIIIIIIll(H.bS() ? 1 : 0)) break block29;
                                    BankLocation lIIlllIlIllIIl = BankLocation.getNearest();
                                    if (H.lIllIIIIIlII(lIIlllIlIllIIl) && H.lIllIIIIIIll(lIIlllIlIllIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderGWD.c = llIlIIIII[llIlIIIIl[3]];
                                        a.a(lIIlllIlIllIIl);
                                    }
                                    if (!H.lIllIIIIIlII(lIIlllIlIllIIl) || !H.lIllIIIIIIIl(lIIlllIlIllIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block29;
                                    if (H.lIllIIIIIIll(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderGWD.c = llIlIIIII[llIlIIIIl[4]];
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIIIIl[5]);
                                        "".length();
                                    }
                                    if (!H.lIllIIIIIIIl(Bank.isOpen() ? 1 : 0)) break block29;
                                    AccBuilderGWD.c = llIlIIIII[llIlIIIIl[6]];
                                    if (H.lIllIIIIIlIl(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)llIlIIIIl[3]);
                                        "".length();
                                    }
                                    if (H.lIllIIIIIlIl(Equipment.getAll().size()) && H.lIllIIIIIIll(H.bT() ? 1 : 0)) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)llIlIIIIl[2]);
                                        "".length();
                                    }
                                    int[] nArray = new int[llIlIIIIl[1]];
                                    nArray[H.llIlIIIIl[0]] = fE;
                                    if (!H.lIllIIIIIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                    int[] nArray2 = new int[llIlIIIIl[1]];
                                    nArray2[H.llIlIIIIl[0]] = fE;
                                    if (!H.lIllIIIIIllI(Inventory.getCount((int[])nArray2), llIlIIIIl[1])) break block31;
                                }
                                int[] nArray = new int[llIlIIIIl[1]];
                                nArray[H.llIlIIIIl[0]] = fD;
                                if (!H.lIllIIIIIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                                int[] nArray3 = new int[llIlIIIIl[1]];
                                nArray3[H.llIlIIIIl[0]] = fD;
                                if (!H.lIllIIIIIIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block31;
                            }
                            int[] nArray = new int[llIlIIIIl[1]];
                            nArray[H.llIlIIIIl[0]] = llIlIIIIl[7];
                            if (!H.lIllIIIIIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                            int[] nArray4 = new int[llIlIIIIl[1]];
                            nArray4[H.llIlIIIIl[0]] = llIlIIIIl[7];
                            if (!H.lIllIIIIIllI(Inventory.getCount((int[])nArray4), llIlIIIIl[1])) break block31;
                        }
                        int[] nArray = new int[llIlIIIIl[1]];
                        nArray[H.llIlIIIIl[0]] = llIlIIIIl[8];
                        if (!H.lIllIIIIIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray5 = new int[llIlIIIIl[1]];
                        nArray5[H.llIlIIIIl[0]] = llIlIIIIl[8];
                        if (!H.lIllIIIIIIlI(Inventory.getCount((int[])nArray5), llIlIIIIl[1])) break block34;
                    }
                    H.Q();
                    System.out.println(llIlIIIII[llIlIIIIl[9]]);
                    bv = llIlIIIIl[1];
                    return;
                }
                int[] nArray = new int[llIlIIIIl[1]];
                nArray[H.llIlIIIIl[0]] = fD;
                if (H.lIllIIIIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray6 = new int[llIlIIIIl[1]];
                    nArray6[H.llIlIIIIl[0]] = fD;
                    if (H.lIllIIIIIIlI(Inventory.getCount((int[])nArray6), llIlIIIIl[1])) {
                        Bank.withdraw((int)fD, (int)llIlIIIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)llIlIIIIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIlIIIIl[1]];
                            nArray[H.llIlIIIIl[0]] = fD;
                            if (H.lIllIIIIIlIl(Inventory.getCount((int[])nArray))) {
                                bl = llIlIIIIl[1];
                                "".length();
                                if (-(0x35 ^ 0x30) >= 0) {
                                    return ((0xD ^ 0x5A) & ~(0xF5 ^ 0xA2)) != 0;
                                }
                            } else {
                                bl = llIlIIIIl[0];
                            }
                            return bl;
                        }, (int)llIlIIIIl[5]);
                        "".length();
                    }
                }
                int[] nArray7 = new int[llIlIIIIl[1]];
                nArray7[H.llIlIIIIl[0]] = fE;
                if (H.lIllIIIIIIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[llIlIIIIl[1]];
                    nArray8[H.llIlIIIIl[0]] = fE;
                    if (H.lIllIIIIIIlI(Inventory.getCount((int[])nArray8), llIlIIIIl[1])) {
                        Bank.withdraw((int)fE, (int)llIlIIIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)llIlIIIIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIlIIIIl[1]];
                            nArray[H.llIlIIIIl[0]] = fE;
                            if (H.lIllIIIIIlIl(Inventory.getCount((int[])nArray))) {
                                bl = llIlIIIIl[1];
                                "".length();
                                if (((0x5E ^ 0x6A) & ~(0x10 ^ 0x24)) != 0) {
                                    return ("   ".length() & ~"   ".length()) != 0;
                                }
                            } else {
                                bl = llIlIIIIl[0];
                            }
                            return bl;
                        }, (int)llIlIIIIl[5]);
                        "".length();
                    }
                }
                int[] nArray9 = new int[llIlIIIIl[1]];
                nArray9[H.llIlIIIIl[0]] = llIlIIIIl[7];
                if (H.lIllIIIIIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    int[] nArray10 = new int[llIlIIIIl[1]];
                    nArray10[H.llIlIIIIl[0]] = llIlIIIIl[7];
                    if (H.lIllIIIIIIlI(Inventory.getCount((int[])nArray10), llIlIIIIl[1])) {
                        Bank.withdraw((int)llIlIIIIl[7], (int)llIlIIIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)llIlIIIIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIlIIIIl[1]];
                            nArray[H.llIlIIIIl[0]] = llIlIIIIl[7];
                            if (H.lIllIIIIIlIl(Inventory.getCount((int[])nArray))) {
                                bl = llIlIIIIl[1];
                                "".length();
                                if (-"   ".length() > 0) {
                                    return ((0xE8 ^ 0x89) & ~(0x42 ^ 0x23)) != 0;
                                }
                            } else {
                                bl = llIlIIIIl[0];
                            }
                            return bl;
                        }, (int)llIlIIIIl[5]);
                        "".length();
                    }
                }
                int[] nArray11 = new int[llIlIIIIl[1]];
                nArray11[H.llIlIIIIl[0]] = llIlIIIIl[8];
                if (H.lIllIIIIIIIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                    int[] nArray12 = new int[llIlIIIIl[1]];
                    nArray12[H.llIlIIIIl[0]] = llIlIIIIl[8];
                    if (H.lIllIIIIIIlI(Inventory.getCount((int[])nArray12), llIlIIIIl[1])) {
                        Bank.withdraw((int)llIlIIIIl[8], (int)llIlIIIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)llIlIIIIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIlIIIIl[1]];
                            nArray[H.llIlIIIIl[0]] = llIlIIIIl[8];
                            if (H.lIllIIIIIlIl(Inventory.getCount((int[])nArray))) {
                                bl = llIlIIIIl[1];
                                "".length();
                                if (" ".length() == 0) {
                                    return ((0x2C ^ 0x65) & ~(0x7C ^ 0x35)) != 0;
                                }
                            } else {
                                bl = llIlIIIIl[0];
                            }
                            return bl;
                        }, (int)llIlIIIIl[5]);
                        "".length();
                    }
                }
            }
            if (H.lIllIIIIIIIl(H.bS() ? 1 : 0)) {
                if (H.lIllIIIIIIIl(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (H.lIllIIIIIIll(Bank.isOpen() ? 1 : 0)) {
                    if (H.lIllIIIIIIIl(GrandExchange.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepTicks((int)llIlIIIIl[1]);
                        "".length();
                    }
                    int lIIlllIlIllIIl = llIlIIIIl[0];
                    while (H.lIllIIIIIIlI(lIIlllIlIllIIl, fF.length)) {
                        int[] nArray = new int[llIlIIIIl[1]];
                        nArray[H.llIlIIIIl[0]] = fF[lIIlllIlIllIIl];
                        Item lIIlllIlIllIII = Inventory.getFirst((int[])nArray);
                        if (H.lIllIIIIIlII(lIIlllIlIllIII)) {
                            int[] nArray13 = new int[llIlIIIIl[1]];
                            nArray13[H.llIlIIIIl[0]] = lIIlllIlIllIII.getId();
                            if (H.lIllIIIIIIIl(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                String[] stringArray = new String[llIlIIIIl[1]];
                                stringArray[H.llIlIIIIl[0]] = llIlIIIII[llIlIIIIl[10]];
                                if (H.lIllIIIIIIIl(lIIlllIlIllIII.hasAction(stringArray) ? 1 : 0)) {
                                    lIIlllIlIllIII.interact(llIlIIIII[llIlIIIIl[11]]);
                                    Time.sleepTicks((int)llIlIIIIl[1]);
                                    "".length();
                                }
                                String[] stringArray2 = new String[llIlIIIIl[1]];
                                stringArray2[H.llIlIIIIl[0]] = llIlIIIII[llIlIIIIl[12]];
                                if (H.lIllIIIIIIIl(lIIlllIlIllIII.hasAction(stringArray2) ? 1 : 0)) {
                                    lIIlllIlIllIII.interact(llIlIIIII[llIlIIIIl[13]]);
                                    Time.sleepTicks((int)llIlIIIIl[1]);
                                    "".length();
                                }
                                String[] stringArray3 = new String[llIlIIIIl[1]];
                                stringArray3[H.llIlIIIIl[0]] = llIlIIIII[llIlIIIIl[14]];
                                if (H.lIllIIIIIIIl(lIIlllIlIllIII.hasAction(stringArray3) ? 1 : 0)) {
                                    lIIlllIlIllIII.interact(llIlIIIII[llIlIIIIl[15]]);
                                    Time.sleepTicks((int)llIlIIIIl[1]);
                                    "".length();
                                }
                                Time.sleepTicks((int)llIlIIIIl[1]);
                                "".length();
                            }
                        }
                        ++lIIlllIlIllIIl;
                        "".length();
                        if (null == null) continue;
                        return;
                    }
                    if (H.lIllIIIIIIIl(H.bT() ? 1 : 0) && H.lIllIIIIIIll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIIIIl[16]);
                        "".length();
                    }
                }
            }
        }
    }

    private static String lIlIlllllllI(String lIIlllIIllllIl, String lIIlllIIlllllI) {
        try {
            SecretKeySpec lIIlllIlIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlllIIlllllI.getBytes(StandardCharsets.UTF_8)), llIlIIIIl[11]), "DES");
            Cipher lIIlllIlIIIIIl = Cipher.getInstance("DES");
            lIIlllIlIIIIIl.init(llIlIIIIl[2], lIIlllIlIIIIlI);
            return new String(lIIlllIlIIIIIl.doFinal(Base64.getDecoder().decode(lIIlllIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlllIlIIIIII) {
            lIIlllIlIIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIIIlII(Object object) {
        return object != null;
    }

    public static void bU() {
        if (H.lIllIIIIIIIl(Inventory.contains((int[])f.bm) ? 1 : 0) && H.lIllIIIIIIll(Equipment.contains((int[])f.bm) ? 1 : 0)) {
            Inventory.getFirst((int[])f.bm).interact(llIlIIIII[llIlIIIIl[38]]);
            Time.sleepTicks((int)llIlIIIIl[1]);
            "".length();
        }
        if (H.lIllIIIIIIIl(Inventory.contains((int[])f.aY) ? 1 : 0) && H.lIllIIIIIIll(Equipment.contains((int[])f.aY) ? 1 : 0)) {
            Inventory.getFirst((int[])f.aY).interact(llIlIIIII[llIlIIIIl[39]]);
            Time.sleepTicks((int)llIlIIIIl[1]);
            "".length();
        }
    }

    private static boolean lIllIIIIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIIIIIIll(int n2) {
        return n2 == 0;
    }
}

