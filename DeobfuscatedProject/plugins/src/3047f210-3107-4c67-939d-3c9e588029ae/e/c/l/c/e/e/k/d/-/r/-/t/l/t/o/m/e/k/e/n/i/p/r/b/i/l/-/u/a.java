/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.Q;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class a {
    private static /* synthetic */ String[] llllIlIIIl;
    public static final /* synthetic */ WorldArea A;
    public static /* synthetic */ WorldPoint G;
    public static final /* synthetic */ WorldArea E;
    static /* synthetic */ WorldPoint H;
    public static final /* synthetic */ WorldArea z;
    public static final /* synthetic */ WorldArea y;
    public static final /* synthetic */ WorldArea D;
    private static /* synthetic */ int[] llllIlIIlI;
    public static final /* synthetic */ WorldArea C;
    public static final /* synthetic */ WorldArea w;
    public static /* synthetic */ WorldPoint F;
    public static final /* synthetic */ WorldPoint x;
    public static final /* synthetic */ WorldArea B;

    private static boolean llIIlllIllllI(int n2, int n3) {
        return n2 == n3;
    }

    public static void a(int[] nArray) {
        int[] lllllllllllllllllIlIlIllllllIllI;
        int lllllllllllllllllIlIlIllllllIlIl = llllIlIIlI[2];
        while (a.llIIllllIIlII(lllllllllllllllllIlIlIllllllIlIl, lllllllllllllllllIlIlIllllllIllI.length)) {
            Bank.withdraw((int)lllllllllllllllllIlIlIllllllIllI[lllllllllllllllllIlIlIllllllIlIl], (int)llllIlIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)llllIlIIlI[1]);
            "".length();
            ++lllllllllllllllllIlIlIllllllIlIl;
            "".length();
            if (null == null) continue;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void b(int[] nArray, int n2) {
        int[] lllllllllllllllllIlIlIlllllIlIll;
        int lllllllllllllllllIlIlIlllllIlIIl = llllIlIIlI[2];
        while (a.llIIllllIIlII(lllllllllllllllllIlIlIlllllIlIIl, lllllllllllllllllIlIlIlllllIlIll.length)) {
            void lllllllllllllllllIlIlIlllllIlIlI;
            Bank.withdraw((int)lllllllllllllllllIlIlIlllllIlIll[lllllllllllllllllIlIlIlllllIlIIl], (int)lllllllllllllllllIlIlIlllllIlIlI, (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)llllIlIIlI[1]);
            "".length();
            int[] nArray2 = new int[llllIlIIlI[1]];
            nArray2[a.llllIlIIlI[2]] = lllllllllllllllllIlIlIlllllIlIll[lllllllllllllllllIlIlIlllllIlIIl];
            if (a.llIIlllIlllll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                "".length();
                if ((0x65 ^ 0x60) > 0) break;
                return;
            }
            ++lllllllllllllllllIlIlIlllllIlIIl;
            "".length();
            if (((0x35 ^ 0x12) & ~(0x30 ^ 0x17)) < " ".length()) continue;
            return;
        }
    }

    private static boolean llIIllllIIIII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void a(int[] nArray, int n2) {
        int[] lllllllllllllllllIlIlIllllllIIIl;
        int lllllllllllllllllIlIlIlllllIllll = llllIlIIlI[2];
        while (a.llIIllllIIlII(lllllllllllllllllIlIlIlllllIllll, lllllllllllllllllIlIlIllllllIIIl.length)) {
            void lllllllllllllllllIlIlIllllllIIII;
            Bank.withdraw((int)lllllllllllllllllIlIlIllllllIIIl[lllllllllllllllllIlIlIlllllIllll], (int)lllllllllllllllllIlIlIllllllIIII, (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)llllIlIIlI[1]);
            "".length();
            ++lllllllllllllllllIlIlIlllllIllll;
            "".length();
            if (-" ".length() < " ".length()) continue;
            return;
        }
    }

    static {
        a.llIIlllIlllIl();
        a.llIIlllIlllII();
        w = new WorldArea(llllIlIIlI[40], llllIlIIlI[41], llllIlIIlI[42], llllIlIIlI[43], llllIlIIlI[2]);
        x = new WorldPoint(llllIlIIlI[44], llllIlIIlI[45], llllIlIIlI[2]);
        y = new WorldArea(llllIlIIlI[46], llllIlIIlI[47], llllIlIIlI[48], llllIlIIlI[48], llllIlIIlI[2]);
        z = new WorldArea(llllIlIIlI[49], llllIlIIlI[50], llllIlIIlI[51], llllIlIIlI[52], llllIlIIlI[2]);
        A = new WorldArea(llllIlIIlI[53], llllIlIIlI[54], llllIlIIlI[38], llllIlIIlI[11], llllIlIIlI[2]);
        B = new WorldArea(llllIlIIlI[55], llllIlIIlI[56], llllIlIIlI[57], llllIlIIlI[58], llllIlIIlI[2]);
        C = new WorldArea(llllIlIIlI[59], llllIlIIlI[60], llllIlIIlI[61], llllIlIIlI[62], llllIlIIlI[2]);
        D = new WorldArea(llllIlIIlI[63], llllIlIIlI[64], llllIlIIlI[35], llllIlIIlI[36], llllIlIIlI[2]);
        E = new WorldArea(llllIlIIlI[7], llllIlIIlI[65], llllIlIIlI[66], llllIlIIlI[67], llllIlIIlI[2]);
        F = new WorldPoint(llllIlIIlI[68], llllIlIIlI[69], llllIlIIlI[2]);
        G = new WorldPoint(llllIlIIlI[70], llllIlIIlI[71], llllIlIIlI[2]);
        H = new WorldPoint(llllIlIIlI[72], llllIlIIlI[73], llllIlIIlI[1]);
    }

    private static void llIIlllIlllII() {
        llllIlIIIl = new String[llllIlIIlI[11]];
        a.llllIlIIIl[a.llllIlIIlI[2]] = a.llIIlllIllIIl("BLkY6mBaSOg=", "qiPqh");
        a.llllIlIIIl[a.llllIlIIlI[1]] = a.llIIlllIllIlI("DwU2MxI=", "MwSRy");
        a.llllIlIIIl[a.llllIlIIlI[14]] = a.llIIlllIllIIl("7NXknGle+kg=", "zfBCX");
        a.llllIlIIIl[a.llllIlIIlI[15]] = a.llIIlllIllIIl("PXR1VXIEFwo=", "akAxB");
        a.llllIlIIIl[a.llllIlIIlI[24]] = a.llIIlllIllIlI("JBUmFjE=", "fgCwZ");
        a.llllIlIIIl[a.llllIlIIlI[19]] = a.llIIlllIllIll("2GYqKzht2kQ=", "Fzztz");
        a.llllIlIIIl[a.llllIlIIlI[13]] = a.llIIlllIllIIl("ykhmADsyrNk=", "agduH");
        a.llllIlIIIl[a.llllIlIIlI[27]] = a.llIIlllIllIIl("v9i/fxUQAN/6r8grXFT3GOdSWhgJ2kHU", "PkIGi");
        a.llllIlIIIl[a.llllIlIIlI[29]] = a.llIIlllIllIlI("BhYePw==", "DwpTt");
        a.llllIlIIIl[a.llllIlIIlI[31]] = a.llIIlllIllIlI("DDkmPkotMC0mHg==", "NXHUj");
        a.llllIlIIIl[a.llllIlIIlI[23]] = a.llIIlllIllIll("zF8qH7I7syk=", "PJVse");
        a.llllIlIIIl[a.llllIlIIlI[22]] = a.llIIlllIllIIl("qKjEGlkJQFg=", "uPsng");
        a.llllIlIIIl[a.llllIlIIlI[32]] = a.llIIlllIllIll("t06pa5L/azI=", "JbQRC");
        a.llllIlIIIl[a.llllIlIIlI[33]] = a.llIIlllIllIll("ntcR00PpUl8=", "drzxg");
        a.llllIlIIIl[a.llllIlIIlI[34]] = a.llIIlllIllIll("6H6BfaR/PqTJs34M/TrOew==", "laLpo");
        a.llllIlIIIl[a.llllIlIIlI[35]] = a.llIIlllIllIll("udlRJzpD3yw=", "fcdjB");
        a.llllIlIIIl[a.llllIlIIlI[36]] = a.llIIlllIllIlI("PRQnED8mAz8=", "IqKuO");
        a.llllIlIIIl[a.llllIlIIlI[37]] = a.llIIlllIllIlI("HhcZEAcFAAE=", "jruuw");
        a.llllIlIIIl[a.llllIlIIlI[38]] = a.llIIlllIllIll("4UubtbFARNIHd4X6+FBWeg==", "grJgV");
        a.llllIlIIIl[a.llllIlIIlI[39]] = a.llIIlllIllIIl("iZ3IH6ABqhAopIWDxmg/Fw==", "dtROS");
    }

    private static String llIIlllIllIlI(String lllllllllllllllllIlIlIllllIIllIl, String lllllllllllllllllIlIlIllllIIIlll) {
        lllllllllllllllllIlIlIllllIIllIl = new String(Base64.getDecoder().decode(lllllllllllllllllIlIlIllllIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIlIllllIIlIll = new StringBuilder();
        char[] lllllllllllllllllIlIlIllllIIlIlI = lllllllllllllllllIlIlIllllIIIlll.toCharArray();
        int lllllllllllllllllIlIlIllllIIlIIl = llllIlIIlI[2];
        char[] lllllllllllllllllIlIlIllllIIIIll = lllllllllllllllllIlIlIllllIIllIl.toCharArray();
        int lllllllllllllllllIlIlIllllIIIIlI = lllllllllllllllllIlIlIllllIIIIll.length;
        int lllllllllllllllllIlIlIllllIIIIIl = llllIlIIlI[2];
        while (a.llIIllllIIlII(lllllllllllllllllIlIlIllllIIIIIl, lllllllllllllllllIlIlIllllIIIIlI)) {
            char lllllllllllllllllIlIlIllllIIlllI = lllllllllllllllllIlIlIllllIIIIll[lllllllllllllllllIlIlIllllIIIIIl];
            lllllllllllllllllIlIlIllllIIlIll.append((char)(lllllllllllllllllIlIlIllllIIlllI ^ lllllllllllllllllIlIlIllllIIlIlI[lllllllllllllllllIlIlIllllIIlIIl % lllllllllllllllllIlIlIllllIIlIlI.length]));
            "".length();
            ++lllllllllllllllllIlIlIllllIIlIIl;
            ++lllllllllllllllllIlIlIllllIIIIIl;
            "".length();
            if ((0x3C ^ 0x39) != 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIlIlIllllIIlIll);
    }

    private static boolean llIIlllIlllll(int n2) {
        return n2 != 0;
    }

    private static boolean llIIllllIIIll(Object object) {
        return object != null;
    }

    private static void llIIlllIlllIl() {
        llllIlIIlI = new int[74];
        a.llllIlIIlI[0] = -(0xFFFFFF35 & 0x67DF) & (0xFFFFEFD7 & 0x7FBC);
        a.llllIlIIlI[1] = " ".length();
        a.llllIlIIlI[2] = " ".length() & (" ".length() ^ -" ".length());
        a.llllIlIIlI[3] = -(0xFFFFB7FB & 0x6C4F) & (0xFFFFBFFF & 0x6DDE);
        a.llllIlIIlI[4] = 0xFFFF91FF & 0x7F79;
        a.llllIlIIlI[5] = -(0xFFFFB366 & 0x7CFD) & (0xFFFFBFEB & 0x7BFF);
        a.llllIlIIlI[6] = 0xFFFFFF9D & 0x16EF;
        a.llllIlIIlI[7] = -(0xFFFFB7D7 & 0x5CAB) & (0xFFFFDFFF & 0x3FFE);
        a.llllIlIIlI[8] = -(0xFFFFEBF6 & 0x743B) & (0xFFFFFFBD & 0x76F3);
        a.llllIlIIlI[9] = 0xD9 ^ 0xC2;
        a.llllIlIIlI[10] = 0x82 ^ 0x9E;
        a.llllIlIIlI[11] = 0x9D ^ 0x89;
        a.llllIlIIlI[12] = -" ".length();
        a.llllIlIIlI[13] = 0x9D ^ 0x9B;
        a.llllIlIIlI[14] = "  ".length();
        a.llllIlIIlI[15] = "   ".length();
        a.llllIlIIlI[16] = 0xA3 ^ 0x8B;
        a.llllIlIIlI[17] = 0xFFFFBEBD & 0x4B72;
        a.llllIlIIlI[18] = 0xFFFFCFC5 & 0x3D7A;
        a.llllIlIIlI[19] = 0x7D ^ 0x78;
        a.llllIlIIlI[20] = -(0xFFFFD6F9 & 0x3D3F) & (0xFFFFDEFE & 0x3F3D);
        a.llllIlIIlI[21] = -(0xFFFFF0D5 & 0x3FAE) & (0xFFFFBBAF & Short.MAX_VALUE);
        a.llllIlIIlI[22] = 0xA1 ^ 0xB7 ^ (0x4B ^ 0x56);
        a.llllIlIIlI[23] = 0xCA ^ 0xC0;
        a.llllIlIIlI[24] = 0x70 ^ 0x37 ^ (0xCD ^ 0x8E);
        a.llllIlIIlI[25] = -(0xFFFFC701 & 0x3BFF) & (0xFFFFBFEF & 0x4F5F);
        a.llllIlIIlI[26] = 0xFFFFAFFB & 0x5F55;
        a.llllIlIIlI[27] = 0x1D ^ 0x42 ^ (0x17 ^ 0x4F);
        a.llllIlIIlI[28] = 149 + 10 - 113 + 123 ^ 67 + 177 - 220 + 159;
        a.llllIlIIlI[29] = 0x35 ^ 0x3D;
        a.llllIlIIlI[30] = 0xFFFFDFB1 & 0x2FEE;
        a.llllIlIIlI[31] = 0xAD ^ 0xA1 ^ (0x9B ^ 0x9E);
        a.llllIlIIlI[32] = 0x5D ^ 0x29 ^ (0xC5 ^ 0xBD);
        a.llllIlIIlI[33] = 0x79 ^ 0x74;
        a.llllIlIIlI[34] = 0xD2 ^ 0x9A ^ (0x32 ^ 0x74);
        a.llllIlIIlI[35] = 0x35 ^ 0x3A;
        a.llllIlIIlI[36] = 0xD4 ^ 0xC4;
        a.llllIlIIlI[37] = 101 + 34 - 25 + 27 ^ 100 + 5 - 101 + 148;
        a.llllIlIIlI[38] = 0xB ^ 0x19;
        a.llllIlIIlI[39] = 15 + 131 - 93 + 161 ^ 117 + 61 - 159 + 178;
        a.llllIlIIlI[40] = -(0xFFFFFC7F & 0x13A1) & (0xFFFFBC77 & 0x5FEF);
        a.llllIlIIlI[41] = -(0xB6 ^ 0x9F) & (0xFFFFEDB9 & 0x1FFF);
        a.llllIlIIlI[42] = "  ".length() ^ (0x27 ^ 0xC);
        a.llllIlIIlI[43] = 0x24 ^ 0xB ^ (0x4D ^ 0x45);
        a.llllIlIIlI[44] = 0xFFFF9CB5 & 0x6FCE;
        a.llllIlIIlI[45] = -(0xFFFFEB7F & 0x7699) & (0xFFFFEF3F & 0x7FFD);
        a.llllIlIIlI[46] = -(0xFFFFFE9F & 0x1565) & (0xFFFFFFFF & 0x1F5F);
        a.llllIlIIlI[47] = 0xFFFF9FDB & 0x6CAE;
        a.llllIlIIlI[48] = 74 + 141 - 47 + 27 ^ 27 + 59 - -43 + 41;
        a.llllIlIIlI[49] = -(0xFFFFB784 & 0x5BFF) & (0xFFFFDFFF & 0x3FFF);
        a.llllIlIIlI[50] = 0xFFFF9F77 & 0x6DAE;
        a.llllIlIIlI[51] = 187 + 224 - 189 + 8 ^ 55 + 71 - 95 + 166;
        a.llllIlIIlI[52] = 0xB4 ^ 0x8E;
        a.llllIlIIlI[53] = 0xFFFFBC35 & 0x4FFF;
        a.llllIlIIlI[54] = -(0xFFFF937F & 0x7CD9) & (0xFFFF9E7F & 0x7FFB);
        a.llllIlIIlI[55] = 0xFFFFAE5F & 0x5FBE;
        a.llllIlIIlI[56] = 0xFFFFDDFF & 0x2F5A;
        a.llllIlIIlI[57] = 0x23 ^ 0x7F;
        a.llllIlIIlI[58] = 0x68 ^ 0x79 ^ (0x20 ^ 0x14);
        a.llllIlIIlI[59] = -(0xFFFFF1ED & 0x6F17) & (0xFFFFEDFF & 0x7F3E);
        a.llllIlIIlI[60] = -(0xFFFFB21F & 0x5DEB) & (0xFFFF9FFF & 0x7D7B);
        a.llllIlIIlI[61] = 0x94 ^ 0xA5;
        a.llllIlIIlI[62] = 0xCA ^ 0x8E;
        a.llllIlIIlI[63] = 0xFFFFCE7F & 0x37DE;
        a.llllIlIIlI[64] = 0xFFFF8F70 & 0x7FEF;
        a.llllIlIIlI[65] = -(0xFFFFEF9F & 0x5371) & (0xFFFFFFFF & 0x4FFD);
        a.llllIlIIlI[66] = 0x93 ^ 0xBE;
        a.llllIlIIlI[67] = 0x2C ^ 8;
        a.llllIlIIlI[68] = 0xFFFF9BFF & 0x6F9F;
        a.llllIlIIlI[69] = 0xFFFFDDBA & 0x2EEF;
        a.llllIlIIlI[70] = 0xFFFF8EBF & 0x77FA;
        a.llllIlIIlI[71] = -(0xFFFFBB4D & 0x56F7) & (0xFFFF9FDD & 0x7FEF);
        a.llllIlIIlI[72] = -(0xFFFFFC7F & 0x1393) & (0xFFFFDFF7 & 0x3BFE);
        a.llllIlIIlI[73] = 0xFFFFFB7D & 0x17EF;
    }

    public static void a(BankLocation bankLocation) {
        if (a.llIIlllIllllI(Vars.getBit((int)llllIlIIlI[0]), llllIlIIlI[1]) && a.llIIlllIlllll(Dialog.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[llllIlIIlI[1]];
            stringArray[a.llllIlIIlI[2]] = llllIlIIIl[llllIlIIlI[2]];
            g.a(stringArray);
        }
        WorldPoint lllllllllllllllllIlIllIIIIIIIIIl = new WorldPoint(llllIlIIlI[3], llllIlIIlI[4], llllIlIIlI[2]);
        WorldPoint lllllllllllllllllIlIllIIIIIIIIII = new WorldPoint(llllIlIIlI[5], llllIlIIlI[6], llllIlIIlI[2]);
        WorldArea lllllllllllllllllIlIlIllllllllll = new WorldArea(llllIlIIlI[7], llllIlIIlI[8], llllIlIIlI[9], llllIlIIlI[10], llllIlIIlI[2]);
        if ((!a.llIIllllIIIII(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIllIIIIIIIIIl) ? 1 : 0) || !a.llIIllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllllIlIllIIIIIIIIII), llllIlIIlI[11]) || a.llIIlllIlllll(lllllllllllllllllIlIlIllllllllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && a.llIIlllIlllll(Inventory.contains(item -> item.getName().contains(llllIlIIIl[llllIlIIlI[39]])) ? 1 : 0) && a.llIIlllIllllI(Players.getLocal().getAnimation(), llllIlIIlI[12])) {
            Inventory.getFirst(item -> item.getName().contains(llllIlIIIl[llllIlIIlI[38]])).interact(llllIlIIIl[llllIlIIlI[1]]);
            Time.sleepTicks((int)llllIlIIlI[13]);
            "".length();
        }
        if (a.llIIlllIlllll(Inventory.contains((int[])f.be) ? 1 : 0) && a.llIIllllIIIII(Equipment.contains((int[])f.be) ? 1 : 0)) {
            Inventory.getFirst((int[])f.be).interact(llllIlIIIl[llllIlIIlI[14]]);
            Time.sleepTicks((int)llllIlIIlI[14]);
            "".length();
        }
        if (a.llIIlllIlllll(Inventory.contains((int[])f.aN) ? 1 : 0) && a.llIIllllIIIII(Equipment.contains((int[])f.aN) ? 1 : 0)) {
            Inventory.getFirst((int[])f.aN).interact(llllIlIIIl[llllIlIIlI[15]]);
            Time.sleepTicks((int)llllIlIIlI[14]);
            "".length();
        }
        if (!a.llIIllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(x), llllIlIIlI[11]) || a.llIIlllIlllll(z.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((BankLocation)BankLocation.VARROCK_WEST_BANK);
            "".length();
            Time.sleepTicks((int)llllIlIIlI[14]);
            "".length();
            "".length();
            if ((0x1E ^ 0x1A) < 0) {
                return;
            }
        } else if (!a.llIIllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(F), llllIlIIlI[16]) || !a.llIIllllIIIII(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !a.llIIllllIIIII(B.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || a.llIIllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(Q.iH), llllIlIIlI[16])) {
            Movement.walkTo((BankLocation)BankLocation.FALADOR_EAST_BANK);
            "".length();
            Time.sleepTicks((int)llllIlIIlI[14]);
            "".length();
            "".length();
            if ("  ".length() > "  ".length()) {
                return;
            }
        } else if (a.llIIlllIlllll(E.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((BankLocation)BankLocation.FALADOR_WEST_BANK);
            "".length();
            Time.sleepTicks((int)llllIlIIlI[14]);
            "".length();
            "".length();
            if (null != null) {
                return;
            }
        } else if (a.llIIlllIlllll(C.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)b.I);
            "".length();
            Time.sleepTicks((int)llllIlIIlI[14]);
            "".length();
            "".length();
            if ("  ".length() > "  ".length()) {
                return;
            }
        } else {
            BankLocation lllllllllllllllllIlIllIIIIIIIIlI;
            WorldArea lllllllllllllllllIlIlIllllllllII;
            WorldArea lllllllllllllllllIlIlIlllllllllI = new WorldArea(llllIlIIlI[17], llllIlIIlI[18], llllIlIIlI[13], llllIlIIlI[19], llllIlIIlI[2]);
            WorldArea lllllllllllllllllIlIlIllllllllIl = new WorldArea(llllIlIIlI[20], llllIlIIlI[21], llllIlIIlI[22], llllIlIIlI[23], llllIlIIlI[2]);
            if ((!a.llIIllllIIIII(lllllllllllllllllIlIlIlllllllllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || a.llIIlllIlllll(lllllllllllllllllIlIlIllllllllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && a.llIIlllIlllll(Inventory.contains(item -> item.getName().contains(llllIlIIIl[llllIlIIlI[37]])) ? 1 : 0)) {
                Inventory.getFirst(item -> item.getName().contains(llllIlIIIl[llllIlIIlI[36]])).interact(llllIlIIIl[llllIlIIlI[24]]);
                Time.sleepTicks((int)llllIlIIlI[24]);
                "".length();
            }
            if (a.llIIlllIlllll((lllllllllllllllllIlIlIllllllllII = new WorldArea(llllIlIIlI[25], llllIlIIlI[26], llllIlIIlI[27], llllIlIIlI[13], llllIlIIlI[2])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] stringArray = new String[llllIlIIlI[1]];
                stringArray[a.llllIlIIlI[2]] = llllIlIIIl[llllIlIIlI[19]];
                TileObject lllllllllllllllllIlIlIlllllllIll = TileObjects.getNearest((String[])stringArray);
                if (a.llIIllllIIIll(lllllllllllllllllIlIlIlllllllIll)) {
                    lllllllllllllllllIlIlIlllllllIll.interact(llllIlIIIl[llllIlIIlI[13]]);
                    Time.sleepTicks((int)llllIlIIlI[24]);
                    "".length();
                }
            }
            Movement.walkTo((BankLocation)lllllllllllllllllIlIllIIIIIIIIlI);
            "".length();
            Time.sleepTicks((int)llllIlIIlI[14]);
            "".length();
        }
    }

    public static void a() {
        if (a.llIIllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(H), llllIlIIlI[28])) {
            String[] stringArray = new String[llllIlIIlI[1]];
            stringArray[a.llllIlIIlI[2]] = llllIlIIIl[llllIlIIlI[27]];
            NPCs.getNearest((String[])stringArray).interact(llllIlIIIl[llllIlIIlI[29]]);
            Time.sleepUntil(() -> Bank.isOpen(), (int)llllIlIIlI[30]);
            "".length();
        }
        if (!a.llIIllllIIIII(BankLocation.GRAND_EXCHANGE_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || a.llIIlllIlllll(w.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            GrandExchange.openBank();
            Time.sleepTicks((int)llllIlIIlI[15]);
            "".length();
            Time.sleepUntil(() -> Bank.isOpen(), (int)llllIlIIlI[30]);
            "".length();
            "".length();
            if (((0x1B ^ 0x7A ^ (0xC7 ^ 0x89) & ~(0x55 ^ 0x1B)) & (184 + 62 - 233 + 207 ^ 15 + 184 - 56 + 46 ^ -" ".length())) > " ".length()) {
                return;
            }
        } else if (!(a.llIIllllIIIII(BankLocation.CASTLE_WARS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.llIIllllIIIII(BankLocation.BARBARIAN_OUTPOST_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.llIIllllIIIII(BankLocation.SHANTAY_PASS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.llIIllllIIIII(A.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.llIIllllIIIII(D.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !a.llIIllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(G), llllIlIIlI[11]))) {
            String[] stringArray = new String[llllIlIIlI[1]];
            stringArray[a.llllIlIIlI[2]] = llllIlIIIl[llllIlIIlI[31]];
            TileObject lllllllllllllllllIlIlIlllllllIIl = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
            if (a.llIIllllIIIll(lllllllllllllllllIlIlIlllllllIIl)) {
                String[] stringArray2 = new String[llllIlIIlI[1]];
                stringArray2[a.llllIlIIlI[2]] = llllIlIIIl[llllIlIIlI[23]];
                if (a.llIIlllIlllll(lllllllllllllllllIlIlIlllllllIIl.hasAction(stringArray2) ? 1 : 0)) {
                    lllllllllllllllllIlIlIlllllllIIl.interact(llllIlIIIl[llllIlIIlI[22]]);
                    Time.sleepTicks((int)llllIlIIlI[15]);
                    "".length();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)llllIlIIlI[30]);
                    "".length();
                }
                String[] stringArray3 = new String[llllIlIIlI[1]];
                stringArray3[a.llllIlIIlI[2]] = llllIlIIIl[llllIlIIlI[32]];
                if (a.llIIlllIlllll(lllllllllllllllllIlIlIlllllllIIl.hasAction(stringArray3) ? 1 : 0)) {
                    lllllllllllllllllIlIlIlllllllIIl.interact(llllIlIIIl[llllIlIIlI[33]]);
                    Time.sleepTicks((int)llllIlIIlI[15]);
                    "".length();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)llllIlIIlI[30]);
                    "".length();
                }
            }
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
        } else if (a.llIIllllIIIII(w.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && a.llIIllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(H), llllIlIIlI[28])) {
            String[] stringArray = new String[llllIlIIlI[1]];
            stringArray[a.llllIlIIlI[2]] = llllIlIIIl[llllIlIIlI[34]];
            TileObject lllllllllllllllllIlIlIlllllllIIl = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
            if (a.llIIllllIIIll(lllllllllllllllllIlIlIlllllllIIl)) {
                lllllllllllllllllIlIlIlllllllIIl.interact(llllIlIIIl[llllIlIIlI[35]]);
                Time.sleepTicks((int)llllIlIIlI[15]);
                "".length();
                Time.sleepUntil(() -> Bank.isOpen(), (int)llllIlIIlI[30]);
                "".length();
            }
        }
    }

    private static boolean llIIllllIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIlllIllIIl(String lllllllllllllllllIlIlIllllIllIll, String lllllllllllllllllIlIlIllllIllIlI) {
        try {
            SecretKeySpec lllllllllllllllllIlIlIlllllIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIlIllllIllIlI.getBytes(StandardCharsets.UTF_8)), llllIlIIlI[29]), "DES");
            Cipher lllllllllllllllllIlIlIllllIlllll = Cipher.getInstance("DES");
            lllllllllllllllllIlIlIllllIlllll.init(llllIlIIlI[14], lllllllllllllllllIlIlIlllllIIIII);
            return new String(lllllllllllllllllIlIlIllllIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIlIllllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIlIllllIllllI) {
            lllllllllllllllllIlIlIllllIllllI.printStackTrace();
            return null;
        }
    }

    private static String llIIlllIllIll(String lllllllllllllllllIlIlIlllIllIllI, String lllllllllllllllllIlIlIlllIllIlIl) {
        try {
            SecretKeySpec lllllllllllllllllIlIlIlllIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIlIlllIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIlIlllIlllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIlIlllIlllIlI.init(llllIlIIlI[14], lllllllllllllllllIlIlIlllIlllIll);
            return new String(lllllllllllllllllIlIlIlllIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIlIlllIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIlIlllIlllIIl) {
            lllllllllllllllllIlIlIlllIlllIIl.printStackTrace();
            return null;
        }
    }

    public static void b(int n2, int n3) {
        Bank.withdraw((int)n2, (int)n3, (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
        Time.sleepTicks((int)llllIlIIlI[1]);
        "".length();
    }

    /*
     * WARNING - void declaration
     */
    public static void a(int n2, int n3) {
        int lllllllllllllllllIlIlIlllllIIllI;
        int[] nArray = new int[llllIlIIlI[1]];
        nArray[a.llllIlIIlI[2]] = n2;
        if (a.llIIllllIIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            System.out.println("[Plugin] Missing " + n2 + " item id");
        }
        int[] nArray2 = new int[llllIlIIlI[1]];
        nArray2[a.llllIlIIlI[2]] = lllllllllllllllllIlIlIlllllIIllI;
        if (a.llIIlllIlllll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            void lllllllllllllllllIlIlIlllllIIlIl;
            Bank.withdraw((int)lllllllllllllllllIlIlIlllllIIllI, (int)lllllllllllllllllIlIlIlllllIIlIl, (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks((int)llllIlIIlI[1]);
            "".length();
        }
    }

    private static boolean llIIllllIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIllllIIIlI(int n2, int n3) {
        return n2 <= n3;
    }
}

