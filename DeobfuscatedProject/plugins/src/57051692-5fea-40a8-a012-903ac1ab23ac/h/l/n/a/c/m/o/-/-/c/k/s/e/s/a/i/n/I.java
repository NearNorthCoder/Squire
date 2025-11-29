/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
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
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.Z;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.f;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.g;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.j;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
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

public class I
implements K {
    static /* synthetic */ int dc;
    private static final /* synthetic */ WorldPoint jg;
    private static final /* synthetic */ WorldPoint ji;
    static /* synthetic */ boolean dd;
    private static /* synthetic */ String[] lIllIIlllI;
    public static final /* synthetic */ String[] jf;
    private static /* synthetic */ int[] lIllIlIIIl;
    static /* synthetic */ int cA;
    private static final /* synthetic */ WorldPoint jj;
    public static /* synthetic */ boolean bn;
    private static final /* synthetic */ WorldPoint jh;
    public static /* synthetic */ List<d> bp;

    private static void lIIllIIIlIlIl() {
        lIllIlIIIl = new int[75];
        I.lIllIlIIIl[0] = (0xE9 ^ 0xBD) & ~(0xC4 ^ 0x90);
        I.lIllIlIIIl[1] = " ".length();
        I.lIllIlIIIl[2] = 34 + 156 - 40 + 104 ^ 10 + 127 - 113 + 160;
        I.lIllIlIIIl[3] = "  ".length();
        I.lIllIlIIIl[4] = 0xFFFFD9FF & 0x277B;
        I.lIllIlIIIl[5] = "   ".length();
        I.lIllIlIIIl[6] = 96 + 145 - 237 + 241 ^ 91 + 36 - 55 + 86;
        I.lIllIlIIIl[7] = 4 ^ 0;
        I.lIllIlIIIl[8] = 79 + 167 - 209 + 151 ^ 157 + 183 - 156 + 1;
        I.lIllIlIIIl[9] = -(0xFFFF9CCF & 0x6F77) & (0xFFFFBFDF & 0x5FEE);
        I.lIllIlIIIl[10] = 0xFFFFBEEA & 0x6FDF;
        I.lIllIlIIIl[11] = -(124 + 91 - 169 + 83) & (0xFFFFBFEB & 0x5FDC);
        I.lIllIlIIIl[12] = -(0x7D ^ 0x5A) & (0xFFFFF177 & 0x3FFF);
        I.lIllIlIIIl[13] = 0xFFFFDFD7 & 0x3F6F;
        I.lIllIlIIIl[14] = 121 + 93 - 114 + 40 ^ 50 + 12 - 61 + 137;
        I.lIllIlIIIl[15] = 0x22 ^ 0x48 ^ (0xDE ^ 0xBE);
        I.lIllIlIIIl[16] = 0xFFFFEFA8 & 0x1CFF;
        I.lIllIlIIIl[17] = 0xFFFFEFDD & 0x1CA6;
        I.lIllIlIIIl[18] = 0x37 ^ 0x3F;
        I.lIllIlIIIl[19] = 0 ^ 0x27 ^ (0xBC ^ 0x90);
        I.lIllIlIIIl[20] = 0x23 ^ 0x24;
        I.lIllIlIIIl[21] = 0x2D ^ 0x4B ^ (0x48 ^ 0x27);
        I.lIllIlIIIl[22] = 0x26 ^ 0x2A;
        I.lIllIlIIIl[23] = 0x23 ^ 0x2E;
        I.lIllIlIIIl[24] = 0xCF ^ 0xC1;
        I.lIllIlIIIl[25] = 0x67 ^ 0x68;
        I.lIllIlIIIl[26] = 3 + 36 - 21 + 115 ^ 133 + 121 - 140 + 35;
        I.lIllIlIIIl[27] = -(0xFFFFEFDF & 0x79E4) & (0xFFFFFFEB & 0x6BFF);
        I.lIllIlIIIl[28] = 0x20 ^ 0x60 ^ (0xD0 ^ 0x81);
        I.lIllIlIIIl[29] = 0x34 ^ 0x26;
        I.lIllIlIIIl[30] = 0x86 ^ 0x95;
        I.lIllIlIIIl[31] = 0x70 ^ 0x64;
        I.lIllIlIIIl[32] = 138 + 3 - -29 + 1 ^ 61 + 174 - 159 + 114;
        I.lIllIlIIIl[33] = 0x5A ^ 0x4C;
        I.lIllIlIIIl[34] = " ".length() ^ (7 ^ 0x11);
        I.lIllIlIIIl[35] = 0xFB ^ 0xBE ^ (0xFB ^ 0xA6);
        I.lIllIlIIIl[36] = 0x15 ^ 0x1E ^ (0x13 ^ 1);
        I.lIllIlIIIl[37] = 0x44 ^ 0x5E;
        I.lIllIlIIIl[38] = 0x85 ^ 0x9E;
        I.lIllIlIIIl[39] = 0xD9 ^ 0xC5;
        I.lIllIlIIIl[40] = 7 ^ 0x1A;
        I.lIllIlIIIl[41] = 179 + 154 - 331 + 189 ^ 14 + 8 - -110 + 29;
        I.lIllIlIIIl[42] = 47 + 126 - 149 + 165 ^ 74 + 132 - 139 + 95;
        I.lIllIlIIIl[43] = 0 ^ 0x20;
        I.lIllIlIIIl[44] = 0x26 ^ 0xD ^ (0x4F ^ 0x45);
        I.lIllIlIIIl[45] = 0x5C ^ 0x7E;
        I.lIllIlIIIl[46] = 0xFFFFBF9E & 0x7E7D;
        I.lIllIlIIIl[47] = -(0xFFFFFE1F & 0x29E2) & (0xFFFFBFEF & 0x7F1D);
        I.lIllIlIIIl[48] = -(0xFFFFFFAC & 0x5077) & (0xFFFFFFEF & 0x7EFF);
        I.lIllIlIIIl[49] = 0xFFFFFDFD & 0x63AA;
        I.lIllIlIIIl[50] = -(0xFFFFFAF3 & 0x2D9F) & (0xFFFFEFFE & 0x3FFF);
        I.lIllIlIIIl[51] = 0x54 ^ 0x30;
        I.lIllIlIIIl[52] = 0xAB ^ 0x88;
        I.lIllIlIIIl[53] = 0x91 ^ 0xB5;
        I.lIllIlIIIl[54] = 0x7E ^ 0x5B;
        I.lIllIlIIIl[55] = 0x43 ^ 1 ^ (0x3B ^ 0x5F);
        I.lIllIlIIIl[56] = 0x91 ^ 0x84 ^ (0xAB ^ 0x99);
        I.lIllIlIIIl[57] = 82 + 9 - 32 + 104 ^ 18 + 114 - 39 + 46;
        I.lIllIlIIIl[58] = 0x80 ^ 0xA9;
        I.lIllIlIIIl[59] = 145 + 144 - 253 + 131 ^ 12 + 52 - -48 + 29;
        I.lIllIlIIIl[60] = 0x7B ^ 0x50;
        I.lIllIlIIIl[61] = 0xAA ^ 0x86;
        I.lIllIlIIIl[62] = 140 + 178 - 142 + 11 ^ 77 + 49 - -24 + 0;
        I.lIllIlIIIl[63] = 0x93 ^ 0xBD;
        I.lIllIlIIIl[64] = 81 + 74 - 147 + 173 ^ 143 + 60 - 167 + 118;
        I.lIllIlIIIl[65] = 0xDB ^ 0x90 ^ (0x78 ^ 3);
        I.lIllIlIIIl[66] = 4 ^ 0x35;
        I.lIllIlIIIl[67] = -(0xFFFFE7B6 & 0x3B5B) & (0xFFFFAF9F & 0x7FFB);
        I.lIllIlIIIl[68] = 0xFFFFDD6F & 0x2EDA;
        I.lIllIlIIIl[69] = -(0xFFFFF3BD & 0x7F46) & (0xFFFFFF6F & 0x7FFB);
        I.lIllIlIIIl[70] = -(0xFFFFF32F & 0x4EDF) & (0xFFFFDFFF & 0x6EBF);
        I.lIllIlIIIl[71] = 0xFFFFFDFA & 0xE7F;
        I.lIllIlIIIl[72] = -(0xFFFFF73E & 0x1BD3) & (0xFFFF9FBF & 0x7F7F);
        I.lIllIlIIIl[73] = -(0xFFFFF2B2 & 0x5FEF) & (0xFFFFF7FF & Short.MAX_VALUE);
        I.lIllIlIIIl[74] = 0x73 ^ 0x48 ^ (0x89 ^ 0x80);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean al() {
        int n2;
        int[] nArray = new int[lIllIlIIIl[1]];
        nArray[I.lIllIlIIIl[0]] = lIllIlIIIl[11];
        if (I.lIIllIIIlIlll(Inventory.contains((int[])nArray) ? 1 : 0) && (!I.lIIllIIIllIIl(Inventory.contains((int[])f.aQ) ? 1 : 0) || I.lIIllIIIlIlll(Equipment.contains((int[])f.aQ) ? 1 : 0)) && I.lIIllIIIlIlll(Inventory.contains((int[])f.aU) ? 1 : 0)) {
            int[] nArray2 = new int[lIllIlIIIl[1]];
            nArray2[I.lIllIlIIIl[0]] = lIllIlIIIl[13];
            if (I.lIIllIIIlIlll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lIllIlIIIl[1]];
                nArray3[I.lIllIlIIIl[0]] = lIllIlIIIl[4];
                if (I.lIIllIIIlIlll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n2 = lIllIlIIIl[1];
                    "".length();
                    if ((0xAD ^ 0xA9) >= "   ".length()) return n2 != 0;
                    return ((0xD0 ^ 0x9B) & ~(0xCF ^ 0x84)) != 0;
                }
            }
        }
        n2 = lIllIlIIIl[0];
        return n2 != 0;
    }

    private static boolean lIIllIIIllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllIIIlllII(Object object) {
        return object != null;
    }

    private static String lIIllIIIIlllI(String lllllllllllllllllllIIIlIlllIlllI, String lllllllllllllllllllIIIlIlllIllIl) {
        try {
            SecretKeySpec lllllllllllllllllllIIIlIllllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIlIlllIllIl.getBytes(StandardCharsets.UTF_8)), lIllIlIIIl[18]), "DES");
            Cipher lllllllllllllllllllIIIlIllllIIlI = Cipher.getInstance("DES");
            lllllllllllllllllllIIIlIllllIIlI.init(lIllIlIIIl[3], lllllllllllllllllllIIIlIllllIIll);
            return new String(lllllllllllllllllllIIIlIllllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIlIlllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllIIIlIllllIIIl) {
            lllllllllllllllllllIIIlIllllIIIl.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean ac() {
        return lIllIlIIIl[0];
    }

    private static void O() {
        d lllllllllllllllllllIIIllIIIIIlll;
        Object lllllllllllllllllllIIIllIIIIlIII;
        int[] nArray = new int[lIllIlIIIl[1]];
        nArray[I.lIllIlIIIl[0]] = lIllIlIIIl[10];
        if (I.lIIllIIIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIllIlIIIl[10], lIllIlIIIl[1], lIllIlIIIl[46]);
            bp.add(d2);
            "".length();
        }
        int[] nArray2 = new int[lIllIlIIIl[1]];
        nArray2[I.lIllIlIIIl[0]] = lIllIlIIIl[4];
        if (I.lIIllIIIllIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllllllllllllllllllIIIllIIIIlIII = new d(lIllIlIIIl[4], lIllIlIIIl[15], lIllIlIIIl[47]);
            bp.add((d)lllllllllllllllllllIIIllIIIIlIII);
            "".length();
        }
        if (I.lIIllIIIllIIl(Bank.contains(lllllllllllllllllllIIIllIIIIlIII = item -> item.getName().toLowerCase().contains(lIllIIlllI[lIllIlIIIl[53]])) ? 1 : 0)) {
            lllllllllllllllllllIIIllIIIIIlll = new d(lIllIlIIIl[48], lIllIlIIIl[8], lIllIlIIIl[49]);
            bp.add(lllllllllllllllllllIIIllIIIIIlll);
            "".length();
        }
        int[] nArray3 = new int[lIllIlIIIl[1]];
        nArray3[I.lIllIlIIIl[0]] = lIllIlIIIl[11];
        if (I.lIIllIIIllIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllllllllllllllllllIIIllIIIIIlll = new d(lIllIlIIIl[11], lIllIlIIIl[15], lIllIlIIIl[50]);
            bp.add(lllllllllllllllllllIIIllIIIIIlll);
            "".length();
        }
        int[] nArray4 = new int[lIllIlIIIl[1]];
        nArray4[I.lIllIlIIIl[0]] = lIllIlIIIl[13];
        if (I.lIIllIIIllIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lllllllllllllllllllIIIllIIIIIlll = new d(lIllIlIIIl[13], lIllIlIIIl[31], lIllIlIIIl[50]);
            bp.add(lllllllllllllllllllIIIllIIIIIlll);
            "".length();
        }
        int[] nArray5 = new int[lIllIlIIIl[1]];
        nArray5[I.lIllIlIIIl[0]] = lIllIlIIIl[12];
        if (I.lIIllIIIllIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lllllllllllllllllllIIIllIIIIIlll = new d(lIllIlIIIl[12], lIllIlIIIl[8], j.bZ);
            bp.add(lllllllllllllllllllIIIllIIIIIlll);
            "".length();
        }
    }

    public static void cJ() {
        if (I.lIIllIIIlIlll(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[0]];
            b.a(bp);
            if (I.lIIllIIIllIII(bp.size(), lIllIlIIIl[1])) {
                System.out.println(lIllIIlllI[lIllIlIIIl[1]]);
                bn = lIllIlIIIl[0];
            }
        }
        if (I.lIIllIIIllIIl(bn ? 1 : 0)) {
            NPC lllllllllllllllllllIIIllIIIIlIll;
            BankLocation lllllllllllllllllllIIIllIIIIllII;
            if (I.lIIllIIIlIlll(Inventory.contains((int[])f.aU) ? 1 : 0) && I.lIIllIIIllIII(Movement.getRunEnergy(), lIllIlIIIl[2])) {
                Inventory.getFirst((int[])f.aU).interact(lIllIIlllI[lIllIlIIIl[3]]);
                Time.sleepTicks((int)lIllIlIIIl[1]);
                "".length();
            }
            if (I.lIIllIIIllIlI(I.lIIllIIIlIllI(e.u(), 70.0))) {
                int[] nArray = new int[lIllIlIIIl[1]];
                nArray[I.lIllIlIIIl[0]] = lIllIlIIIl[4];
                if (I.lIIllIIIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIllIlIIIl[1]];
                    nArray2[I.lIllIlIIIl[0]] = lIllIlIIIl[4];
                    Inventory.getFirst((int[])nArray2).interact(lIllIIlllI[lIllIlIIIl[5]]);
                }
            }
            if (I.lIIllIIIllIIl(Movement.isRunEnabled() ? 1 : 0) && I.lIIllIIIllIll(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (I.lIIllIIIllIIl(I.al() ? 1 : 0) && I.lIIllIIIllIII(e.j(lIllIlIIIl[6]), lIllIlIIIl[1])) {
                lllllllllllllllllllIIIllIIIIllII = BankLocation.getNearest();
                if (I.lIIllIIIlllII(lllllllllllllllllllIIIllIIIIllII) && I.lIIllIIIllIIl(lllllllllllllllllllIIIllIIIIllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[7]];
                    a.a(lllllllllllllllllllIIIllIIIIllII);
                    Time.sleepTicks((int)lIllIlIIIl[3]);
                    "".length();
                }
                if (I.lIIllIIIlllII(lllllllllllllllllllIIIllIIIIllII) && I.lIIllIIIlIlll(lllllllllllllllllllIIIllIIIIllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[8]];
                    if (I.lIIllIIIllIIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIlIIIl[9]);
                        "".length();
                    }
                    if (I.lIIllIIIlIlll(Bank.isOpen() ? 1 : 0)) {
                        if (I.lIIllIIIllIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIllIlIIIl[7]);
                            "".length();
                        }
                        if (I.lIIllIIIllIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIllIlIIIl[3]);
                            "".length();
                        }
                        int[] nArray = new int[lIllIlIIIl[8]];
                        nArray[I.lIllIlIIIl[0]] = lIllIlIIIl[10];
                        nArray[I.lIllIlIIIl[1]] = lIllIlIIIl[11];
                        nArray[I.lIllIlIIIl[3]] = lIllIlIIIl[12];
                        nArray[I.lIllIlIIIl[5]] = lIllIlIIIl[13];
                        nArray[I.lIllIlIIIl[7]] = lIllIlIIIl[4];
                        if (I.lIIllIIIllIIl(e.b(nArray) ? 1 : 0)) {
                            I.O();
                            System.out.println(lIllIIlllI[lIllIlIIIl[14]]);
                            bn = lIllIlIIIl[1];
                            return;
                        }
                        Bank.withdraw((int)lIllIlIIIl[11], (int)lIllIlIIIl[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIllIlIIIl[1]);
                        "".length();
                        Bank.withdraw((int)lIllIlIIIl[13], (int)lIllIlIIIl[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIllIlIIIl[1]);
                        "".length();
                        Bank.withdraw((int)lIllIlIIIl[10], (int)lIllIlIIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIllIlIIIl[1]);
                        "".length();
                        a.b(f.aU, lIllIlIIIl[1]);
                        a.a(lIllIlIIIl[4], lIllIlIIIl[15]);
                        a.b(f.be, lIllIlIIIl[1]);
                    }
                }
            }
            if (I.lIIllIIIlIlll(I.al() ? 1 : 0) && I.lIIllIIIllIII(e.j(lIllIlIIIl[6]), lIllIlIIIl[1])) {
                lllllllllllllllllllIIIllIIIIllII = new WorldArea(lIllIlIIIl[16], lIllIlIIIl[17], lIllIlIIIl[18], lIllIlIIIl[19], lIllIlIIIl[0]);
                String[] stringArray = new String[lIllIlIIIl[1]];
                stringArray[I.lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[20]];
                lllllllllllllllllllIIIllIIIIlIll = NPCs.getNearest((String[])stringArray);
                if (I.lIIllIIIlllIl(lllllllllllllllllllIIIllIIIIlIll) && I.lIIllIIIllllI(Players.getLocal().getWorldLocation().distanceTo(jg), lIllIlIIIl[5]) && I.lIIllIIIllIIl(AccBuilderShamans.d ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[18]];
                    if (I.lIIllIIIllIII(cA, lIllIlIIIl[1])) {
                        e.v();
                        cA += lIllIlIIIl[1];
                    }
                    Movement.walkTo((WorldPoint)jg);
                    "".length();
                    Time.sleepTicks((int)lIllIlIIIl[1]);
                    "".length();
                }
                if (I.lIIllIIIlllII(lllllllllllllllllllIIIllIIIIlIll)) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[21]];
                    g.a(lIllIIlllI[lIllIlIIIl[15]], jf, lIllIlIIIl[1]);
                }
            }
            if (I.lIIllIIIlllll(e.j(lIllIlIIIl[6]), lIllIlIIIl[1])) {
                if (I.lIIllIIIllllI(Players.getLocal().getWorldLocation().distanceTo(jh), lIllIlIIIl[14])) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[19]];
                    Movement.walkTo((WorldPoint)jh);
                    "".length();
                    Time.sleepTicks((int)lIllIlIIIl[1]);
                    "".length();
                }
                if (I.lIIllIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(jh), lIllIlIIIl[14])) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[22]];
                    String[] stringArray = new String[lIllIlIIIl[1]];
                    stringArray[I.lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[23]];
                    lllllllllllllllllllIIIllIIIIllII = TileObjects.getNearest((String[])stringArray);
                    if (I.lIIllIIIlllII(lllllllllllllllllllIIIllIIIIllII)) {
                        String[] stringArray2 = new String[lIllIlIIIl[1]];
                        stringArray2[I.lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[24]];
                        if (I.lIIllIIIlIlll(lllllllllllllllllllIIIllIIIIllII.hasAction(stringArray2) ? 1 : 0)) {
                            lllllllllllllllllllIIIllIIIIllII.interact(lIllIIlllI[lIllIlIIIl[25]]);
                            Time.sleepTicks((int)lIllIlIIIl[8]);
                            "".length();
                        }
                    }
                    g.a(lIllIIlllI[lIllIlIIIl[26]], jf);
                }
            }
            if (I.lIIllIIIlllll(e.j(lIllIlIIIl[6]), lIllIlIIIl[3])) {
                if (I.lIIllIIIllllI(Players.getLocal().getWorldLocation().distanceTo(ji), lIllIlIIIl[3])) {
                    int[] nArray = new int[lIllIlIIIl[1]];
                    nArray[I.lIllIlIIIl[0]] = lIllIlIIIl[27];
                    if (I.lIIllIIIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray3 = new int[lIllIlIIIl[1]];
                        nArray3[I.lIllIlIIIl[0]] = lIllIlIIIl[27];
                        Inventory.getFirst((int[])nArray3).interact(lIllIIlllI[lIllIlIIIl[28]]);
                        Time.sleepTicks((int)lIllIlIIIl[1]);
                        "".length();
                    }
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[29]];
                    Movement.walkTo((WorldPoint)ji);
                    "".length();
                    Time.sleepTicks((int)lIllIlIIIl[1]);
                    "".length();
                }
                if (I.lIIllIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(ji), lIllIlIIIl[3])) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[30]];
                    String[] stringArray = new String[lIllIlIIIl[1]];
                    stringArray[I.lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[31]];
                    lllllllllllllllllllIIIllIIIIllII = NPCs.getNearest((String[])stringArray);
                    if (I.lIIllIIIlllII(lllllllllllllllllllIIIllIIIIllII)) {
                        g.a(lIllIIlllI[lIllIlIIIl[32]], jf);
                    }
                    if (I.lIIllIIIlllIl(lllllllllllllllllllIIIllIIIIllII)) {
                        String[] stringArray3 = new String[lIllIlIIIl[1]];
                        stringArray3[I.lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[33]];
                        TileObjects.getNearest((String[])stringArray3).interact(lIllIIlllI[lIllIlIIIl[34]]);
                        Time.sleepTicks((int)lIllIlIIIl[3]);
                        "".length();
                    }
                }
            }
            if (I.lIIllIIIlllll(e.j(lIllIlIIIl[6]), lIllIlIIIl[5])) {
                dc = lIllIlIIIl[0];
                if (I.lIIllIIIllllI(Players.getLocal().getWorldLocation().distanceTo(jj), lIllIlIIIl[5])) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[35]];
                    Movement.walkTo((WorldPoint)jj);
                    "".length();
                    Time.sleepTicks((int)lIllIlIIIl[1]);
                    "".length();
                }
                if (I.lIIllIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(jj), lIllIlIIIl[5])) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[36]];
                    String[] stringArray = new String[lIllIlIIIl[1]];
                    stringArray[I.lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[37]];
                    lllllllllllllllllllIIIllIIIIllII = TileObjects.getNearest((String[])stringArray);
                    if (I.lIIllIIIlllII(lllllllllllllllllllIIIllIIIIllII)) {
                        lllllllllllllllllllIIIllIIIIllII.interact(lIllIIlllI[lIllIlIIIl[38]]);
                    }
                }
            }
            if (I.lIIllIIIlllll(e.j(lIllIlIIIl[6]), lIllIlIIIl[7])) {
                if (I.lIIllIIIllllI(Players.getLocal().getWorldLocation().distanceTo(ji), lIllIlIIIl[3])) {
                    int[] nArray = new int[lIllIlIIIl[1]];
                    nArray[I.lIllIlIIIl[0]] = lIllIlIIIl[27];
                    if (I.lIIllIIIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray4 = new int[lIllIlIIIl[1]];
                        nArray4[I.lIllIlIIIl[0]] = lIllIlIIIl[27];
                        Inventory.getFirst((int[])nArray4).interact(lIllIIlllI[lIllIlIIIl[39]]);
                        Time.sleepTicks((int)lIllIlIIIl[1]);
                        "".length();
                    }
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[40]];
                    Movement.walkTo((WorldPoint)ji);
                    "".length();
                    Time.sleepTicks((int)lIllIlIIIl[1]);
                    "".length();
                }
                if (I.lIIllIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(ji), lIllIlIIIl[3])) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[41]];
                    String[] stringArray = new String[lIllIlIIIl[1]];
                    stringArray[I.lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[42]];
                    lllllllllllllllllllIIIllIIIIllII = TileObjects.getNearest((String[])stringArray);
                    if (I.lIIllIIIlllII(lllllllllllllllllllIIIllIIIIllII)) {
                        String[] stringArray4 = new String[lIllIlIIIl[1]];
                        stringArray4[I.lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[43]];
                        if (I.lIIllIIIlIlll(lllllllllllllllllllIIIllIIIIllII.hasAction(stringArray4) ? 1 : 0)) {
                            lllllllllllllllllllIIIllIIIIllII.interact(lIllIIlllI[lIllIlIIIl[44]]);
                            Time.sleepTicks((int)lIllIlIIIl[3]);
                            "".length();
                        }
                        String[] stringArray5 = new String[lIllIlIIIl[1]];
                        stringArray5[I.lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[45]];
                        lllllllllllllllllllIIIllIIIIlIll = Inventory.getFirst((String[])stringArray5);
                        if (I.lIIllIIIlllII(lllllllllllllllllllIIIllIIIIlIll)) {
                            if (I.lIIllIIIllIII(dc, lIllIlIIIl[1])) {
                                Z.ob += lIllIlIIIl[1];
                                Z.p(AccBuilderShamans.m);
                                dc += lIllIlIIIl[1];
                                Z.ob = lIllIlIIIl[0];
                                dd = lIllIlIIIl[0];
                            }
                            lllllllllllllllllllIIIllIIIIlIll.useOn((TileObject)lllllllllllllllllllIIIllIIIIllII);
                            Time.sleepTicks((int)lIllIlIIIl[5]);
                            "".length();
                        }
                    }
                }
                g.a(jf);
            }
            g.a(new String[lIllIlIIIl[0]]);
        }
    }

    private static boolean lIIllIIIllIll(int n2) {
        return n2 > 0;
    }

    private static int lIIllIIIlIllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIIllIIIllIlI(int n2) {
        return n2 < 0;
    }

    static {
        I.lIIllIIIlIlIl();
        I.lIIllIIIlIlII();
        String[] stringArray = new String[lIllIlIIIl[23]];
        stringArray[I.lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[54]];
        stringArray[I.lIllIlIIIl[1]] = lIllIIlllI[lIllIlIIIl[55]];
        stringArray[I.lIllIlIIIl[3]] = lIllIIlllI[lIllIlIIIl[56]];
        stringArray[I.lIllIlIIIl[5]] = lIllIIlllI[lIllIlIIIl[57]];
        stringArray[I.lIllIlIIIl[7]] = lIllIIlllI[lIllIlIIIl[58]];
        stringArray[I.lIllIlIIIl[8]] = lIllIIlllI[lIllIlIIIl[59]];
        stringArray[I.lIllIlIIIl[14]] = lIllIIlllI[lIllIlIIIl[60]];
        stringArray[I.lIllIlIIIl[20]] = lIllIIlllI[lIllIlIIIl[61]];
        stringArray[I.lIllIlIIIl[18]] = lIllIIlllI[lIllIlIIIl[62]];
        stringArray[I.lIllIlIIIl[21]] = lIllIIlllI[lIllIlIIIl[63]];
        stringArray[I.lIllIlIIIl[15]] = lIllIIlllI[lIllIlIIIl[64]];
        stringArray[I.lIllIlIIIl[19]] = lIllIIlllI[lIllIlIIIl[65]];
        stringArray[I.lIllIlIIIl[22]] = lIllIIlllI[lIllIlIIIl[66]];
        jf = stringArray;
        jg = new WorldPoint(lIllIlIIIl[16], lIllIlIIIl[67], lIllIlIIIl[0]);
        jh = new WorldPoint(lIllIlIIIl[68], lIllIlIIIl[69], lIllIlIIIl[0]);
        ji = new WorldPoint(lIllIlIIIl[70], lIllIlIIIl[71], lIllIlIIIl[0]);
        jj = new WorldPoint(lIllIlIIIl[72], lIllIlIIIl[73], lIllIlIIIl[0]);
        bp = new ArrayList<d>();
        cA = lIllIlIIIl[0];
    }

    private static boolean lIIllIIIlllll(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean af() {
        boolean bl;
        if (I.lIIllIIlIIIIl(e.j(lIllIlIIIl[6]), lIllIlIIIl[8])) {
            bl = lIllIlIIIl[1];
            "".length();
            if (null != null) {
                return ((0x87 ^ 0x9D ^ (0x41 ^ 0x71)) & (0x48 ^ 0x26 ^ (0x6A ^ 0x2E) ^ -" ".length())) != 0;
            }
        } else {
            bl = lIllIlIIIl[0];
        }
        return bl;
    }

    @Override
    public int ad() {
        try {
            I.cJ();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (" ".length() != " ".length()) {
            return (0x19 ^ 4) & ~(0xA6 ^ 0xBB);
        }
        return lIllIlIIIl[51];
    }

    private static String lIIllIIIIllll(String lllllllllllllllllllIIIlIlllIIIII, String lllllllllllllllllllIIIlIllIllIlI) {
        lllllllllllllllllllIIIlIlllIIIII = new String(Base64.getDecoder().decode(lllllllllllllllllllIIIlIlllIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllIIIlIllIllllI = new StringBuilder();
        char[] lllllllllllllllllllIIIlIllIlllIl = lllllllllllllllllllIIIlIllIllIlI.toCharArray();
        int lllllllllllllllllllIIIlIllIlllII = lIllIlIIIl[0];
        char[] lllllllllllllllllllIIIlIllIlIllI = lllllllllllllllllllIIIlIlllIIIII.toCharArray();
        int lllllllllllllllllllIIIlIllIlIlIl = lllllllllllllllllllIIIlIllIlIllI.length;
        int lllllllllllllllllllIIIlIllIlIlII = lIllIlIIIl[0];
        while (I.lIIllIIIllIII(lllllllllllllllllllIIIlIllIlIlII, lllllllllllllllllllIIIlIllIlIlIl)) {
            char lllllllllllllllllllIIIlIlllIIIIl = lllllllllllllllllllIIIlIllIlIllI[lllllllllllllllllllIIIlIllIlIlII];
            lllllllllllllllllllIIIlIllIllllI.append((char)(lllllllllllllllllllIIIlIlllIIIIl ^ lllllllllllllllllllIIIlIllIlllIl[lllllllllllllllllllIIIlIllIlllII % lllllllllllllllllllIIIlIllIlllIl.length]));
            "".length();
            ++lllllllllllllllllllIIIlIllIlllII;
            ++lllllllllllllllllllIIIlIllIlIlII;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllllIIIlIllIllllI);
    }

    private static boolean lIIllIIIllIIl(int n2) {
        return n2 == 0;
    }

    @Override
    public String ae() {
        return lIllIIlllI[lIllIlIIIl[52]];
    }

    private static boolean lIIllIIIllllI(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIIllIIIlIlII() {
        lIllIIlllI = new String[lIllIlIIIl[74]];
        I.lIllIIlllI[I.lIllIlIIIl[0]] = I.lIIllIIIIllIl("Z4LAiTtHkWv8hIiRlmRphQ==", "DRNYD");
        I.lIllIIlllI[I.lIllIlIIIl[1]] = I.lIIllIIIIlllI("XqRBujJ27T4SH7rUI6xoFDehuNSGhmViHzdIw9/gi1HbXw+f6uviX+ElmgBq0TpH", "VjIFP");
        I.lIllIIlllI[I.lIllIlIIIl[3]] = I.lIIllIIIIllll("PjYMOTM=", "zDeWX");
        I.lIllIIlllI[I.lIllIlIIIl[5]] = I.lIIllIIIIllIl("4F5WwJy1l80=", "vqMCX");
        I.lIllIIlllI[I.lIllIlIIIl[7]] = I.lIIllIIIIlllI("5kUHs37KSFp2qNMzoyubPw==", "MkRha");
        I.lIllIIlllI[I.lIllIlIIIl[8]] = I.lIIllIIIIllIl("0PGccxpzq+OdbPjfCHlg9uv1MlQx2hti", "suiEe");
        I.lIllIIlllI[I.lIllIlIIIl[14]] = I.lIIllIIIIllll("NQxzGT8HST4RPhEAPR9tExw2CzlCGiYIPQ4ANgthQhokETkBAToWKkIdPFgPNzAaNgo=", "biSxM");
        I.lIllIIlllI[I.lIllIlIIIl[20]] = I.lIIllIIIIllll("KgktDiceSBgDMAkLMg==", "lhYfB");
        I.lIllIIlllI[I.lIllIlIIIl[18]] = I.lIIllIIIIllll("CTkdUAEoeBgEFDUs", "GXkpu");
        I.lIllIIlllI[I.lIllIlIIIl[21]] = I.lIIllIIIIllll("MhcFBxsIDQNVHhQGFwE=", "acduo");
        I.lIllIIlllI[I.lIllIlIIIl[15]] = I.lIIllIIIIllIl("f28KWvboYhzoqkxBQuplMQ==", "kTKEf");
        I.lIllIIlllI[I.lIllIlIIIl[19]] = I.lIIllIIIIllIl("VQzNRq75/Wo6omleWt4OY8aFWAfS/lpI", "YduGi");
        I.lIllIIlllI[I.lIllIlIIIl[22]] = I.lIIllIIIIlllI("Kuu20GpmbSYd2X2V4zuZMA==", "URIDV");
        I.lIllIIlllI[I.lIllIlIIIl[23]] = I.lIIllIIIIllll("AgcGOw==", "FhiIK");
        I.lIllIIlllI[I.lIllIlIIIl[24]] = I.lIIllIIIIlllI("/TN41nCxZZI=", "kMUxE");
        I.lIllIIlllI[I.lIllIlIIIl[25]] = I.lIIllIIIIllIl("RGuqBruvr3I=", "MXpRg");
        I.lIllIIlllI[I.lIllIlIIIl[26]] = I.lIIllIIIIllll("FgkTAQ8iSDIbAj4NHg==", "Phgij");
        I.lIllIIlllI[I.lIllIlIIIl[28]] = I.lIIllIIIIllll("BSMoNg==", "RFIDk");
        I.lIllIIlllI[I.lIllIlIIIl[29]] = I.lIIllIIIIlllI("1HF+fS2sKE0jr6IGl7t9yw==", "iFwOt");
        I.lIllIIlllI[I.lIllIlIIIl[30]] = I.lIIllIIIIllIl("E01x9kS0AVAPi8OigJTyxw==", "pjmXP");
        I.lIllIIlllI[I.lIllIlIIIl[31]] = I.lIIllIIIIlllI("tws7Fr/vJyPqzZcJZmJDcA==", "PDPBL");
        I.lIllIIlllI[I.lIllIlIIIl[32]] = I.lIIllIIIIllll("JDM+EQgTJT5FAx45PhE=", "vVMed");
        I.lIllIIlllI[I.lIllIlIIIl[33]] = I.lIIllIIIIlllI("WFRWn3TEJt8=", "gjndY");
        I.lIllIIlllI[I.lIllIlIIIl[34]] = I.lIIllIIIIllIl("U4dcGDEm/u4=", "HJSOx");
        I.lIllIIlllI[I.lIllIlIIIl[35]] = I.lIIllIIIIllll("JTsPQzAEegoIMQc2", "kZycD");
        I.lIllIIlllI[I.lIllIlIIIl[36]] = I.lIIllIIIIllll("BTYYNj4sNEwxPDc/AA==", "BSlBW");
        I.lIllIIlllI[I.lIllIlIIIl[37]] = I.lIIllIIIIllll("ORQ3BCY=", "xxCeT");
        I.lIllIIlllI[I.lIllIlIIIl[38]] = I.lIIllIIIIlllI("HmKLQawFWAs=", "GPvdr");
        I.lIllIIlllI[I.lIllIlIIIl[39]] = I.lIIllIIIIllIl("jjaXBzWLra8=", "GwBWd");
        I.lIllIIlllI[I.lIllIlIIIl[40]] = I.lIIllIIIIlllI("hABxCXKUPnzvRzeXhmJx7A==", "nDPec");
        I.lIllIIlllI[I.lIllIlIIIl[41]] = I.lIIllIIIIllll("MikFFy8TJgxTIBUuDRot", "zHksC");
        I.lIllIIlllI[I.lIllIlIIIl[42]] = I.lIIllIIIIlllI("jafkDnbwUt4=", "aRBcz");
        I.lIllIIlllI[I.lIllIlIIIl[43]] = I.lIIllIIIIllll("Cwo/Pg==", "DzZPm");
        I.lIllIIlllI[I.lIllIlIIIl[44]] = I.lIIllIIIIllIl("FpN85pRPD7A=", "UlKDc");
        I.lIllIIlllI[I.lIllIlIIIl[45]] = I.lIIllIIIIllll("DzsdCgBvIFIKHz0/Hg==", "HSryt");
        I.lIllIIlllI[I.lIllIlIIIl[52]] = I.lIIllIIIIllll("CzwiECI8KiJEKTE2IhBuKCw0Fzo=", "YYQdN");
        I.lIllIIlllI[I.lIllIlIIIl[53]] = I.lIIllIIIIllIl("ldnqRH/dfclDvTcELijJR3HWmll/XomK", "VLTuW");
        I.lIllIIlllI[I.lIllIlIIIl[54]] = I.lIIllIIIIlllI("NJMkYcjjohREv2Z1uVbfoiylCLq7zqRrnD2FDA/k244=", "rWUqv");
        I.lIllIIlllI[I.lIllIlIIIl[55]] = I.lIIllIIIIlllI("gtPnWNvVW4xxXfY4JqWO77eMMOMLRl6uXKya52Y9xUbxmelQCeDdng==", "bnwMu");
        I.lIllIIlllI[I.lIllIlIIIl[56]] = I.lIIllIIIIllIl("JVc4hTdwoXdIBzlnEVOjGMDGn+nFVB4t", "GqIcU");
        I.lIllIIlllI[I.lIllIlIIIl[57]] = I.lIIllIIIIllll("IxEZYQ==", "ztjOj");
        I.lIllIIlllI[I.lIllIlIIIl[58]] = I.lIIllIIIIllll("JWopTiMDIi8HIQttIgE9TCxkHzoJPjBP", "lMDnO");
        I.lIllIIlllI[I.lIllIlIIIl[59]] = I.lIIllIIIIllll("KBtWTCECBFoBKEcYHwA9RwQSCSNJ", "gpzlM");
        I.lIllIIlllI[I.lIllIlIIIl[60]] = I.lIIllIIIIllll("HBUDBCMoVDYJND8XHEw1PxoDTCs/VAMDZi4VGwdmLhtXFSkvWg==", "ZtwlF");
        I.lIllIIlllI[I.lIllIlIIIl[61]] = I.lIIllIIIIllIl("2GXSPDhO44Yoj+JXNPFHfNJc/Pen78iqCTXkijZlGi1PsyQ8Z9E4X3LhbIMMnMMr", "holXC");
        I.lIllIIlllI[I.lIllIlIIIl[62]] = I.lIIllIIIIllll("HAgmQnArAiFOJCABOk49IE0hBjExTSIGNWUdJAEyKQg7Tjk2Qw==", "EmVnP");
        I.lIllIIlllI[I.lIllIlIIIl[63]] = I.lIIllIIIIllll("GgQVDlw=", "Iqgkr");
        I.lIllIIlllI[I.lIllIlIIIl[64]] = I.lIIllIIIIllll("H2obZxIzLAQuCzFtFylFNyADKwAibRkhRTElGTQRdj4GIgQ9bA==", "VMvGe");
        I.lIllIIlllI[I.lIllIlIIIl[65]] = I.lIIllIIIIllll("Mig1Z2YiaitrNR4/I2U=", "kMFKF");
        I.lIllIIlllI[I.lIllIlIIIl[66]] = I.lIIllIIIIllll("EhsVbRs7GkIEWDIRDj1H", "ZtbMx");
    }

    private static String lIIllIIIIllIl(String lllllllllllllllllllIIIlIlllllIll, String lllllllllllllllllllIIIlIlllllIlI) {
        try {
            SecretKeySpec lllllllllllllllllllIIIllIIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIlIlllllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllIIIlIllllllll = Cipher.getInstance("Blowfish");
            lllllllllllllllllllIIIlIllllllll.init(lIllIlIIIl[3], lllllllllllllllllllIIIllIIIIIIII);
            return new String(lllllllllllllllllllIIIlIllllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIlIlllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllIIIlIlllllllI) {
            lllllllllllllllllllIIIlIlllllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIIlIIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIllIIlIIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIllIIIlIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllIIIlllIl(Object object) {
        return object == null;
    }
}

