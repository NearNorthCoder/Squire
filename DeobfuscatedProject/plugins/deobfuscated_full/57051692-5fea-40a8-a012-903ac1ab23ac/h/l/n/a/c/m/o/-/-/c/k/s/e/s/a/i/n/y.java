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
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.f;
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

public class y {
    public static /* synthetic */ boolean bn;
    private static /* synthetic */ int[] dV;
    public static /* synthetic */ List<d> bp;
    private static /* synthetic */ int dT;
    private static /* synthetic */ int[] lIlllIIlIl;
    private static /* synthetic */ int dU;
    private static /* synthetic */ String[] lIlllIIlII;

    private static String lIIlllIIlIIlI(String var23, String var18) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(lIlllIIlIl[2], var1);
            return new String(var13.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static void lIIlllIIlIlII() {
        lIlllIIlII = new String[lIlllIIlIl[43]];
        y.lIlllIIlII[y.lIlllIIlIl[0]] = y."Buying items";
        y.lIlllIIlII[y.lIlllIIlIl[1]] = y."Finished buying items, switching back to gearing";
        y.lIlllIIlII[y.lIlllIIlIl[2]] = y."Get Mage Gear Util";
        y.lIlllIIlII[y.lIlllIIlIl[3]] = y."Navigating to bank";
        y.lIlllIIlII[y.lIlllIIlIl[4]] = y."Opening bank";
        y.lIlllIIlII[y.lIlllIIlIl[6]] = y."Handling banking";
        y.lIlllIIlII[y.lIlllIIlIl[9]] = y."We are missing supplies, switching to BUYING Util";
        y.lIlllIIlII[y.lIlllIIlIl[10]] = y."Wear";
        y.lIlllIIlII[y.lIlllIIlIl[11]] = y."Wear";
        y.lIlllIIlII[y.lIlllIIlIl[12]] = y."Wield";
        y.lIlllIIlII[y.lIlllIIlIl[13]] = y."Wield";
        y.lIlllIIlII[y.lIlllIIlIl[14]] = y."Equip";
        y.lIlllIIlII[y.lIlllIIlIl[15]] = y."Equip";
        y.lIlllIIlII[y.lIlllIIlIl[17]] = y."Staff of air";
        y.lIlllIIlII[y.lIlllIIlIl[18]] = y."Leather gloves";
        y.lIlllIIlII[y.lIlllIIlIl[19]] = y."Staff of air";
        y.lIlllIIlII[y.lIlllIIlIl[20]] = y."Leather gloves";
        y.lIlllIIlII[y.lIlllIIlIl[38]] = y."Wear";
        y.lIlllIIlII[y.lIlllIIlIl[39]] = y."Wear";
        y.lIlllIIlII[y.lIlllIIlIl[40]] = y."ring of wealth (";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean bv() {
        int n2;
        String[] stringArray = new String[lIlllIIlIl[1]];
        stringArray[y.lIlllIIlIl[0]] = lIlllIIlII[lIlllIIlIl[19]];
        if (y.lIIlllIIlIllI(Equipment.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lIlllIIlIl[1]];
            nArray[y.lIlllIIlIl[0]] = lIlllIIlIl[8];
            if (y.lIIlllIIlIllI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIlllIIlIl[1]];
                nArray2[y.lIlllIIlIl[0]] = lIlllIIlIl[7];
                if (y.lIIlllIIlIllI(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIlllIIlIl[1]];
                    stringArray2[y.lIlllIIlIl[0]] = lIlllIIlII[lIlllIIlIl[20]];
                    if (y.lIIlllIIlIllI(Equipment.contains((String[])stringArray2) ? 1 : 0)) {
                        n2 = lIlllIIlIl[1];
                        0;
                        if ((0xC1 ^ 0xC5) >= ((0x93 ^ 0x85) & ~(0x1D ^ 0xB))) return n2 != 0;
                        return false;
                    }
                }
            }
        }
        n2 = lIlllIIlIl[0];
        return n2 != 0;
    }

    public static void bw() {
        if (y.lIIlllIIlIllI(Inventory.contains((int[])f.be) ? 1 : 0) && y.lIIlllIIllIII(Equipment.contains((int[])f.be) ? 1 : 0)) {
            Inventory.getFirst((int[])f.be).interact(lIlllIIlII[lIlllIIlIl[38]]);
            Time.sleepTicks((int)lIlllIIlIl[1]);
            0;
        }
        if (y.lIIlllIIlIllI(Inventory.contains((int[])f.aQ) ? 1 : 0) && y.lIIlllIIllIII(Equipment.contains((int[])f.aQ) ? 1 : 0)) {
            Inventory.getFirst((int[])f.aQ).interact(lIlllIIlII[lIlllIIlIl[39]]);
            Time.sleepTicks((int)lIlllIIlIl[1]);
            0;
        }
    }

    public static void O() {
        d var12;
        Object var9;
        int[] nArray = new int[lIlllIIlIl[1]];
        nArray[y.lIlllIIlIl[0]] = dT;
        if (y.lIIlllIIllIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(dT, lIlllIIlIl[1], lIlllIIlIl[21]);
            bp.add(d2);
            0;
        }
        int[] nArray2 = new int[lIlllIIlIl[1]];
        nArray2[y.lIlllIIlIl[0]] = dU;
        if (y.lIIlllIIllIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var9 = new d(dU, lIlllIIlIl[1], lIlllIIlIl[22]);
            bp.add((d)var9);
            0;
        }
        int[] nArray3 = new int[lIlllIIlIl[1]];
        nArray3[y.lIlllIIlIl[0]] = lIlllIIlIl[8];
        if (y.lIIlllIIllIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var9 = new d(lIlllIIlIl[8], lIlllIIlIl[1], lIlllIIlIl[23]);
            bp.add((d)var9);
            0;
        }
        int[] nArray4 = new int[lIlllIIlIl[1]];
        nArray4[y.lIlllIIlIl[0]] = lIlllIIlIl[7];
        if (y.lIIlllIIllIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var9 = new d(lIlllIIlIl[7], lIlllIIlIl[1], lIlllIIlIl[24]);
            bp.add((d)var9);
            0;
        }
        int[] nArray5 = new int[lIlllIIlIl[1]];
        nArray5[y.lIlllIIlIl[0]] = lIlllIIlIl[25];
        if (y.lIIlllIIllIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var9 = new d(lIlllIIlIl[25], lIlllIIlIl[5], lIlllIIlIl[13]);
            bp.add((d)var9);
            0;
        }
        int[] nArray6 = new int[lIlllIIlIl[1]];
        nArray6[y.lIlllIIlIl[0]] = lIlllIIlIl[26];
        if (y.lIIlllIIllIII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var9 = new d(lIlllIIlIl[26], lIlllIIlIl[27], lIlllIIlIl[13]);
            bp.add((d)var9);
            0;
        }
        int[] nArray7 = new int[lIlllIIlIl[1]];
        nArray7[y.lIlllIIlIl[0]] = lIlllIIlIl[28];
        if (y.lIIlllIIllIII(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var9 = new d(lIlllIIlIl[28], lIlllIIlIl[29], lIlllIIlIl[13]);
            bp.add((d)var9);
            0;
        }
        int[] nArray8 = new int[lIlllIIlIl[1]];
        nArray8[y.lIlllIIlIl[0]] = lIlllIIlIl[30];
        if (y.lIIlllIIllIII(Bank.contains((int[])nArray8) ? 1 : 0)) {
            var9 = new d(lIlllIIlIl[30], lIlllIIlIl[31], lIlllIIlIl[13]);
            bp.add((d)var9);
            0;
        }
        int[] nArray9 = new int[lIlllIIlIl[1]];
        nArray9[y.lIlllIIlIl[0]] = lIlllIIlIl[25];
        if (y.lIIlllIIlIllI(Bank.contains((int[])nArray9) ? 1 : 0)) {
            int[] nArray10 = new int[lIlllIIlIl[1]];
            nArray10[y.lIlllIIlIl[0]] = lIlllIIlIl[25];
            if (y.lIIlllIIlIlll(Bank.getFirst((int[])nArray10).getQuantity(), lIlllIIlIl[32])) {
                var9 = new d(lIlllIIlIl[25], lIlllIIlIl[5], lIlllIIlIl[13]);
                bp.add((d)var9);
                0;
            }
        }
        int[] nArray11 = new int[lIlllIIlIl[1]];
        nArray11[y.lIlllIIlIl[0]] = lIlllIIlIl[26];
        if (y.lIIlllIIlIllI(Bank.contains((int[])nArray11) ? 1 : 0)) {
            int[] nArray12 = new int[lIlllIIlIl[1]];
            nArray12[y.lIlllIIlIl[0]] = lIlllIIlIl[26];
            if (y.lIIlllIIlIlll(Bank.getFirst((int[])nArray12).getQuantity(), lIlllIIlIl[32])) {
                var9 = new d(lIlllIIlIl[26], lIlllIIlIl[27], lIlllIIlIl[13]);
                bp.add((d)var9);
                0;
            }
        }
        int[] nArray13 = new int[lIlllIIlIl[1]];
        nArray13[y.lIlllIIlIl[0]] = lIlllIIlIl[28];
        if (y.lIIlllIIlIllI(Bank.contains((int[])nArray13) ? 1 : 0)) {
            int[] nArray14 = new int[lIlllIIlIl[1]];
            nArray14[y.lIlllIIlIl[0]] = lIlllIIlIl[28];
            if (y.lIIlllIIlIlll(Bank.getFirst((int[])nArray14).getQuantity(), lIlllIIlIl[32])) {
                var9 = new d(lIlllIIlIl[28], lIlllIIlIl[29], lIlllIIlIl[13]);
                bp.add((d)var9);
                0;
            }
        }
        int[] nArray15 = new int[lIlllIIlIl[1]];
        nArray15[y.lIlllIIlIl[0]] = lIlllIIlIl[30];
        if (y.lIIlllIIlIllI(Bank.contains((int[])nArray15) ? 1 : 0)) {
            int[] nArray16 = new int[lIlllIIlIl[1]];
            nArray16[y.lIlllIIlIl[0]] = lIlllIIlIl[30];
            if (y.lIIlllIIlIlll(Bank.getFirst((int[])nArray16).getQuantity(), lIlllIIlIl[32])) {
                var9 = new d(lIlllIIlIl[30], lIlllIIlIl[31], lIlllIIlIl[13]);
                bp.add((d)var9);
                0;
            }
        }
        if (y.lIIlllIIllIII(Bank.contains((Predicate)(var9 = item -> item.getName().toLowerCase().contains(lIlllIIlII[lIlllIIlIl[40]]))) ? 1 : 0)) {
            var12 = new d(lIlllIIlIl[33], lIlllIIlIl[6], lIlllIIlIl[34]);
            bp.add(var12);
            0;
        }
        int[] nArray17 = new int[lIlllIIlIl[1]];
        nArray17[y.lIlllIIlIl[0]] = lIlllIIlIl[35];
        if (y.lIIlllIIllIII(Bank.contains((int[])nArray17) ? 1 : 0)) {
            var12 = new d(lIlllIIlIl[35], lIlllIIlIl[36], lIlllIIlIl[37]);
            bp.add(var12);
            0;
        }
    }

    private static String lIIlllIIlIIll(String var16, String var2) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIlllIIlIl[11]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(lIlllIIlIl[2], var21);
            return new String(var15.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllIIllIIl(Object object) {
        return object != null;
    }

    private static boolean lIIlllIIllIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlllIIlIllI(int n2) {
        return n2 != 0;
    }

    private static void lIIlllIIlIlIl() {
        lIlllIIlIl = new int[44];
        y.lIlllIIlIl[0] = (29 + 129 - -9 + 37 ^ 135 + 75 - 171 + 105) & (5 ^ 0x3A ^ (0x21 ^ 0x42) ^ -1);
        y.lIlllIIlIl[1] = 1;
        y.lIlllIIlIl[2] = 2;
        y.lIlllIIlIl[3] = 3;
        y.lIlllIIlIl[4] = 91 + 84 - 117 + 96 ^ 20 + 121 - 130 + 147;
        y.lIlllIIlIl[5] = 0xFFFFD7FB & 0x3B8C;
        y.lIlllIIlIl[6] = 0x58 ^ 0x5D;
        y.lIlllIIlIl[7] = -(0xFFFFC79F & 0x7C63) & (0xFFFFCDFE & 0x7FFB);
        y.lIlllIIlIl[8] = -(0xFFFFF9DF & 0x7776) & (0xFFFFF7FF & 0x7FFD);
        y.lIlllIIlIl[9] = 0xB1 ^ 0xB6 ^ 1;
        y.lIlllIIlIl[10] = 0x59 ^ 0x5E;
        y.lIlllIIlIl[11] = 154 + 146 - 132 + 1 ^ 6 + 109 - 30 + 76;
        y.lIlllIIlIl[12] = 0x51 ^ 0x58;
        y.lIlllIIlIl[13] = 0x98 ^ 0x92;
        y.lIlllIIlIl[14] = 0x4F ^ 2 ^ (0x2B ^ 0x6D);
        y.lIlllIIlIl[15] = 0x49 ^ 0x45;
        y.lIlllIIlIl[16] = -(0xFFFFDEDA & 0x25B7) & (0xFFFFFDF5 & 0x1FFF);
        y.lIlllIIlIl[17] = 0xB8 ^ 0x99 ^ (0xB2 ^ 0x9E);
        y.lIlllIIlIl[18] = 140 + 114 - 61 + 8 ^ 99 + 98 - 77 + 79;
        y.lIlllIIlIl[19] = 0x96 ^ 0x99;
        y.lIlllIIlIl[20] = 0x13 ^ 3;
        y.lIlllIIlIl[21] = 0xFFFFE2DF & 0x3DFA;
        y.lIlllIIlIl[22] = 0xFFFF9DF6 & 0x67EF;
        y.lIlllIIlIl[23] = -(0xFFFFD807 & 0x37FA) & (0xFFFFFFFF & 0x7F5F);
        y.lIlllIIlIl[24] = 0xFFFFDDEA & 0x375F;
        y.lIlllIIlIl[25] = 0xFFFFABBE & 0x566F;
        y.lIlllIIlIl[26] = -(0xFFFFBC8D & 0x5BF7) & (0xFFFFFEBF & 0x1BEF);
        y.lIlllIIlIl[27] = 0xFFFFBFB9 & 0x4BFE;
        y.lIlllIIlIl[28] = 0xFFFF923F & 0x6FED;
        y.lIlllIIlIl[29] = 0xFFFFFFF9 & 0xFA6;
        y.lIlllIIlIl[30] = 0xFFFF97FB & 0x6A2E;
        y.lIlllIIlIl[31] = -(0xFFFFE74F & 0x58B9) & (0xFFFFDFCD & 0x7F7A);
        y.lIlllIIlIl[32] = 0xFFFFC7F6 & 0x39FD;
        y.lIlllIIlIl[33] = -(0xFFFF9DF3 & 0x731D) & (0xFFFFFFDC & 0x3FFF);
        y.lIlllIIlIl[34] = 0xFFFFE3EC & 0x7DBB;
        y.lIlllIIlIl[35] = 0xFFFFFFDF & 0x1F67;
        y.lIlllIIlIl[36] = -(0xFFFFBF5D & 0x7EA7) & (0xFFFFFF97 & 0x3FFC);
        y.lIlllIIlIl[37] = -(0xFFFFFFA7 & 0x507B) & (0xFFFFF7A6 & 0x5BFF);
        y.lIlllIIlIl[38] = 0x38 ^ 0x29;
        y.lIlllIIlIl[39] = 0x4E ^ 0x5C;
        y.lIlllIIlIl[40] = 0x3C ^ 0x2F;
        y.lIlllIIlIl[41] = -(0xFFFFB89F & 0x67E3) & (0xFFFFB7EF & 0x6DF7);
        y.lIlllIIlIl[42] = 0xFFFFC46F & 0x3FB3;
        y.lIlllIIlIl[43] = 0x95 ^ 0x81;
    }

    private static boolean lIIlllIIllIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlllIIllIlI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlllIIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean bu() {
        int n2;
        String[] stringArray = new String[lIlllIIlIl[1]];
        stringArray[y.lIlllIIlIl[0]] = lIlllIIlII[lIlllIIlIl[17]];
        if (y.lIIlllIIlIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lIlllIIlIl[1]];
            nArray[y.lIlllIIlIl[0]] = lIlllIIlIl[8];
            if (y.lIIlllIIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lIlllIIlIl[1]];
                stringArray2[y.lIlllIIlIl[0]] = lIlllIIlII[lIlllIIlIl[18]];
                if (y.lIIlllIIlIllI(Inventory.contains((String[])stringArray2) ? 1 : 0) && y.lIIlllIIlIllI(Inventory.contains((int[])f.aM) ? 1 : 0)) {
                    n2 = lIlllIIlIl[1];
                    0;
                    if (-(0x21 ^ 0x66 ^ (0x76 ^ 0x34)) < 0) return n2 != 0;
                    return ((6 + 60 - 47 + 183 ^ 138 + 2 - -1 + 16) & (0xDC ^ 0xC1 ^ (0x61 ^ 0x2B) ^ -1)) != 0;
                }
            }
        }
        n2 = lIlllIIlIl[0];
        return n2 != 0;
    }

    private static String lIIlllIIlIIIl(String var5, String var8) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var3 = var8.toCharArray();
        int var4 = lIlllIIlIl[0];
        char[] var22 = var5.toCharArray();
        int var6 = var22.length;
        int var17 = lIlllIIlIl[0];
        while (y.lIIlllIIlIlll(var17, var6)) {
            char var7 = var22[var17];
            var19.append((char)(var7 ^ var3[var4 % var3.length]));
            0;
            ++var4;
            ++var17;
            0;
            if (((0x3C ^ 0x2B) & ~(0x3D ^ 0x2A)) == 0) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    static {
        y.lIIlllIIlIlIl();
        y.lIIlllIIlIlII();
        bp = new ArrayList<d>();
        dT = lIlllIIlIl[41];
        dU = lIlllIIlIl[42];
        int[] nArray = new int[lIlllIIlIl[4]];
        nArray[y.lIlllIIlIl[0]] = dT;
        nArray[y.lIlllIIlIl[1]] = dU;
        nArray[y.lIlllIIlIl[2]] = lIlllIIlIl[8];
        nArray[y.lIlllIIlIl[3]] = lIlllIIlIl[7];
        dV = nArray;
    }

    public static void bt() {
        block28: {
            block29: {
                block34: {
                    block31: {
                        block33: {
                            block32: {
                                block30: {
                                    if (y.lIIlllIIlIllI(bn ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlllIIlII[lIlllIIlIl[0]];
                                        b.a(bp);
                                        if (y.lIIlllIIlIlll(bp.size(), lIlllIIlIl[1])) {
                                            System.out.println(lIlllIIlII[lIlllIIlIl[1]]);
                                            bn = lIlllIIlIl[0];
                                        }
                                    }
                                    if (!y.lIIlllIIllIII(bn ? 1 : 0) || !y.lIIlllIIllIII(y.bv() ? 1 : 0)) break block28;
                                    System.out.println(lIlllIIlII[lIlllIIlIl[2]]);
                                    if (!y.lIIlllIIllIII(y.bu() ? 1 : 0)) break block29;
                                    BankLocation var14 = BankLocation.getNearest();
                                    if (y.lIIlllIIllIIl(var14) && y.lIIlllIIllIII(var14.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlllIIlII[lIlllIIlIl[3]];
                                        a.a(var14);
                                    }
                                    if (!y.lIIlllIIllIIl(var14) || !y.lIIlllIIlIllI(var14.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block29;
                                    if (y.lIIlllIIllIII(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlllIIlII[lIlllIIlIl[4]];
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIlllIIlIl[5]);
                                        0;
                                    }
                                    if (!y.lIIlllIIlIllI(Bank.isOpen() ? 1 : 0)) break block29;
                                    AccBuilderShamans.c = lIlllIIlII[lIlllIIlIl[6]];
                                    if (y.lIIlllIIllIlI(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lIlllIIlIl[3]);
                                        0;
                                    }
                                    if (y.lIIlllIIllIlI(Equipment.getAll().size()) && y.lIIlllIIllIII(y.bv() ? 1 : 0)) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lIlllIIlIl[2]);
                                        0;
                                    }
                                    int[] nArray = new int[lIlllIIlIl[1]];
                                    nArray[y.lIlllIIlIl[0]] = dU;
                                    if (!y.lIIlllIIllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                    int[] nArray2 = new int[lIlllIIlIl[1]];
                                    nArray2[y.lIlllIIlIl[0]] = dU;
                                    if (!y.lIIlllIIllIll(Inventory.getCount((int[])nArray2), lIlllIIlIl[1])) break block31;
                                }
                                int[] nArray = new int[lIlllIIlIl[1]];
                                nArray[y.lIlllIIlIl[0]] = dT;
                                if (!y.lIIlllIIllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                                int[] nArray3 = new int[lIlllIIlIl[1]];
                                nArray3[y.lIlllIIlIl[0]] = dT;
                                if (!y.lIIlllIIlIllI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block31;
                            }
                            int[] nArray = new int[lIlllIIlIl[1]];
                            nArray[y.lIlllIIlIl[0]] = lIlllIIlIl[7];
                            if (!y.lIIlllIIllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                            int[] nArray4 = new int[lIlllIIlIl[1]];
                            nArray4[y.lIlllIIlIl[0]] = lIlllIIlIl[7];
                            if (!y.lIIlllIIllIll(Inventory.getCount((int[])nArray4), lIlllIIlIl[1])) break block31;
                        }
                        int[] nArray = new int[lIlllIIlIl[1]];
                        nArray[y.lIlllIIlIl[0]] = lIlllIIlIl[8];
                        if (!y.lIIlllIIllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray5 = new int[lIlllIIlIl[1]];
                        nArray5[y.lIlllIIlIl[0]] = lIlllIIlIl[8];
                        if (!y.lIIlllIIlIlll(Inventory.getCount((int[])nArray5), lIlllIIlIl[1])) break block34;
                    }
                    y.O();
                    System.out.println(lIlllIIlII[lIlllIIlIl[9]]);
                    bn = lIlllIIlIl[1];
                    return;
                }
                int[] nArray = new int[lIlllIIlIl[1]];
                nArray[y.lIlllIIlIl[0]] = dT;
                if (y.lIIlllIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray6 = new int[lIlllIIlIl[1]];
                    nArray6[y.lIlllIIlIl[0]] = dT;
                    if (y.lIIlllIIlIlll(Inventory.getCount((int[])nArray6), lIlllIIlIl[1])) {
                        Bank.withdraw((int)dT, (int)lIlllIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIlllIIlIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIIlIl[1]];
                            nArray[y.lIlllIIlIl[0]] = dT;
                            if (y.lIIlllIIllIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIIlIl[1];
                                0;
                                if (((0x1F ^ 9) & ~(0x84 ^ 0x92)) != 0) {
                                    return false;
                                }
                            } else {
                                bl = lIlllIIlIl[0];
                            }
                            return bl;
                        }, (int)lIlllIIlIl[5]);
                        0;
                    }
                }
                int[] nArray7 = new int[lIlllIIlIl[1]];
                nArray7[y.lIlllIIlIl[0]] = dU;
                if (y.lIIlllIIlIllI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[lIlllIIlIl[1]];
                    nArray8[y.lIlllIIlIl[0]] = dU;
                    if (y.lIIlllIIlIlll(Inventory.getCount((int[])nArray8), lIlllIIlIl[1])) {
                        Bank.withdraw((int)dU, (int)lIlllIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIlllIIlIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIIlIl[1]];
                            nArray[y.lIlllIIlIl[0]] = dU;
                            if (y.lIIlllIIllIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIIlIl[1];
                                0;
                                if (1 <= -1) {
                                    return ((217 + 17 - 163 + 165 ^ 142 + 136 - 203 + 101) & (0x3F ^ 0x5F ^ (0x9F ^ 0xA3) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIlllIIlIl[0];
                            }
                            return bl;
                        }, (int)lIlllIIlIl[5]);
                        0;
                    }
                }
                int[] nArray9 = new int[lIlllIIlIl[1]];
                nArray9[y.lIlllIIlIl[0]] = lIlllIIlIl[7];
                if (y.lIIlllIIlIllI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    int[] nArray10 = new int[lIlllIIlIl[1]];
                    nArray10[y.lIlllIIlIl[0]] = lIlllIIlIl[7];
                    if (y.lIIlllIIlIlll(Inventory.getCount((int[])nArray10), lIlllIIlIl[1])) {
                        Bank.withdraw((int)lIlllIIlIl[7], (int)lIlllIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIlllIIlIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIIlIl[1]];
                            nArray[y.lIlllIIlIl[0]] = lIlllIIlIl[7];
                            if (y.lIIlllIIllIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIIlIl[1];
                                0;
                                if (-1 != -1) {
                                    return false;
                                }
                            } else {
                                bl = lIlllIIlIl[0];
                            }
                            return bl;
                        }, (int)lIlllIIlIl[5]);
                        0;
                    }
                }
                int[] nArray11 = new int[lIlllIIlIl[1]];
                nArray11[y.lIlllIIlIl[0]] = lIlllIIlIl[8];
                if (y.lIIlllIIlIllI(Bank.contains((int[])nArray11) ? 1 : 0)) {
                    int[] nArray12 = new int[lIlllIIlIl[1]];
                    nArray12[y.lIlllIIlIl[0]] = lIlllIIlIl[8];
                    if (y.lIIlllIIlIlll(Inventory.getCount((int[])nArray12), lIlllIIlIl[1])) {
                        Bank.withdraw((int)lIlllIIlIl[8], (int)lIlllIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIlllIIlIl[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIIlIl[1]];
                            nArray[y.lIlllIIlIl[0]] = lIlllIIlIl[8];
                            if (y.lIIlllIIllIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIIlIl[1];
                                0;
                                if (((0xA1 ^ 0x8A) & ~(6 ^ 0x2D)) <= -1) {
                                    return false;
                                }
                            } else {
                                bl = lIlllIIlIl[0];
                            }
                            return bl;
                        }, (int)lIlllIIlIl[5]);
                        0;
                    }
                }
            }
            if (y.lIIlllIIlIllI(y.bu() ? 1 : 0)) {
                if (y.lIIlllIIlIllI(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (y.lIIlllIIllIII(Bank.isOpen() ? 1 : 0)) {
                    if (y.lIIlllIIlIllI(GrandExchange.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepTicks((int)lIlllIIlIl[1]);
                        0;
                    }
                    int var14 = lIlllIIlIl[0];
                    while (y.lIIlllIIlIlll(var14, dV.length)) {
                        int[] nArray = new int[lIlllIIlIl[1]];
                        nArray[y.lIlllIIlIl[0]] = dV[var14];
                        Item var10 = Inventory.getFirst((int[])nArray);
                        if (y.lIIlllIIllIIl(var10)) {
                            int[] nArray13 = new int[lIlllIIlIl[1]];
                            nArray13[y.lIlllIIlIl[0]] = var10.getId();
                            if (y.lIIlllIIlIllI(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                String[] stringArray = new String[lIlllIIlIl[1]];
                                stringArray[y.lIlllIIlIl[0]] = lIlllIIlII[lIlllIIlIl[10]];
                                if (y.lIIlllIIlIllI(var10.hasAction(stringArray) ? 1 : 0)) {
                                    var10.interact(lIlllIIlII[lIlllIIlIl[11]]);
                                    Time.sleepTicks((int)lIlllIIlIl[1]);
                                    0;
                                }
                                String[] stringArray2 = new String[lIlllIIlIl[1]];
                                stringArray2[y.lIlllIIlIl[0]] = lIlllIIlII[lIlllIIlIl[12]];
                                if (y.lIIlllIIlIllI(var10.hasAction(stringArray2) ? 1 : 0)) {
                                    var10.interact(lIlllIIlII[lIlllIIlIl[13]]);
                                    Time.sleepTicks((int)lIlllIIlIl[1]);
                                    0;
                                }
                                String[] stringArray3 = new String[lIlllIIlIl[1]];
                                stringArray3[y.lIlllIIlIl[0]] = lIlllIIlII[lIlllIIlIl[14]];
                                if (y.lIIlllIIlIllI(var10.hasAction(stringArray3) ? 1 : 0)) {
                                    var10.interact(lIlllIIlII[lIlllIIlIl[15]]);
                                    Time.sleepTicks((int)lIlllIIlIl[1]);
                                    0;
                                }
                                Time.sleepTicks((int)lIlllIIlIl[1]);
                                0;
                            }
                        }
                        ++var14;
                        0;
                        
                        return;
                    }
                    if (y.lIIlllIIlIllI(y.bv() ? 1 : 0) && y.lIIlllIIllIII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIlllIIlIl[16]);
                        0;
                    }
                }
            }
        }
    }
}

