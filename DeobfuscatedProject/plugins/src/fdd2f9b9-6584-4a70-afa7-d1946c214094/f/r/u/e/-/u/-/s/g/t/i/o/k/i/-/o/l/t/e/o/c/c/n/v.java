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
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.b;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.d;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.f;
import gg.squire.account.AccBuilderRogues;
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

public class v {
    private static /* synthetic */ int db;
    private static /* synthetic */ int dc;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ int[] dd;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ String[] lIIIIllllI;
    private static /* synthetic */ int[] lIIIIlllll;

    public static void af() {
        d llIIlllIlllI;
        Object llIIlllIllll;
        int[] nArray = new int[lIIIIlllll[1]];
        nArray[v.lIIIIlllll[0]] = db;
        if (v.lllIIllIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(db, lIIIIlllll[1], lIIIIlllll[21]);
            bv.add(d2);
            "".length();
        }
        int[] nArray2 = new int[lIIIIlllll[1]];
        nArray2[v.lIIIIlllll[0]] = dc;
        if (v.lllIIllIllII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llIIlllIllll = new d(dc, lIIIIlllll[1], lIIIIlllll[22]);
            bv.add((d)llIIlllIllll);
            "".length();
        }
        int[] nArray3 = new int[lIIIIlllll[1]];
        nArray3[v.lIIIIlllll[0]] = lIIIIlllll[8];
        if (v.lllIIllIllII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llIIlllIllll = new d(lIIIIlllll[8], lIIIIlllll[1], lIIIIlllll[23]);
            bv.add((d)llIIlllIllll);
            "".length();
        }
        int[] nArray4 = new int[lIIIIlllll[1]];
        nArray4[v.lIIIIlllll[0]] = lIIIIlllll[7];
        if (v.lllIIllIllII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llIIlllIllll = new d(lIIIIlllll[7], lIIIIlllll[1], lIIIIlllll[24]);
            bv.add((d)llIIlllIllll);
            "".length();
        }
        int[] nArray5 = new int[lIIIIlllll[1]];
        nArray5[v.lIIIIlllll[0]] = lIIIIlllll[25];
        if (v.lllIIllIllII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            llIIlllIllll = new d(lIIIIlllll[25], lIIIIlllll[5], lIIIIlllll[13]);
            bv.add((d)llIIlllIllll);
            "".length();
        }
        int[] nArray6 = new int[lIIIIlllll[1]];
        nArray6[v.lIIIIlllll[0]] = lIIIIlllll[26];
        if (v.lllIIllIllII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            llIIlllIllll = new d(lIIIIlllll[26], lIIIIlllll[27], lIIIIlllll[13]);
            bv.add((d)llIIlllIllll);
            "".length();
        }
        int[] nArray7 = new int[lIIIIlllll[1]];
        nArray7[v.lIIIIlllll[0]] = lIIIIlllll[28];
        if (v.lllIIllIllII(Bank.contains((int[])nArray7) ? 1 : 0)) {
            llIIlllIllll = new d(lIIIIlllll[28], lIIIIlllll[29], lIIIIlllll[13]);
            bv.add((d)llIIlllIllll);
            "".length();
        }
        int[] nArray8 = new int[lIIIIlllll[1]];
        nArray8[v.lIIIIlllll[0]] = lIIIIlllll[30];
        if (v.lllIIllIllII(Bank.contains((int[])nArray8) ? 1 : 0)) {
            llIIlllIllll = new d(lIIIIlllll[30], lIIIIlllll[31], lIIIIlllll[13]);
            bv.add((d)llIIlllIllll);
            "".length();
        }
        int[] nArray9 = new int[lIIIIlllll[1]];
        nArray9[v.lIIIIlllll[0]] = lIIIIlllll[25];
        if (v.lllIIllIlIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
            int[] nArray10 = new int[lIIIIlllll[1]];
            nArray10[v.lIIIIlllll[0]] = lIIIIlllll[25];
            if (v.lllIIllIlIll(Bank.getFirst((int[])nArray10).getQuantity(), lIIIIlllll[32])) {
                llIIlllIllll = new d(lIIIIlllll[25], lIIIIlllll[5], lIIIIlllll[13]);
                bv.add((d)llIIlllIllll);
                "".length();
            }
        }
        int[] nArray11 = new int[lIIIIlllll[1]];
        nArray11[v.lIIIIlllll[0]] = lIIIIlllll[26];
        if (v.lllIIllIlIlI(Bank.contains((int[])nArray11) ? 1 : 0)) {
            int[] nArray12 = new int[lIIIIlllll[1]];
            nArray12[v.lIIIIlllll[0]] = lIIIIlllll[26];
            if (v.lllIIllIlIll(Bank.getFirst((int[])nArray12).getQuantity(), lIIIIlllll[32])) {
                llIIlllIllll = new d(lIIIIlllll[26], lIIIIlllll[27], lIIIIlllll[13]);
                bv.add((d)llIIlllIllll);
                "".length();
            }
        }
        int[] nArray13 = new int[lIIIIlllll[1]];
        nArray13[v.lIIIIlllll[0]] = lIIIIlllll[28];
        if (v.lllIIllIlIlI(Bank.contains((int[])nArray13) ? 1 : 0)) {
            int[] nArray14 = new int[lIIIIlllll[1]];
            nArray14[v.lIIIIlllll[0]] = lIIIIlllll[28];
            if (v.lllIIllIlIll(Bank.getFirst((int[])nArray14).getQuantity(), lIIIIlllll[32])) {
                llIIlllIllll = new d(lIIIIlllll[28], lIIIIlllll[29], lIIIIlllll[13]);
                bv.add((d)llIIlllIllll);
                "".length();
            }
        }
        int[] nArray15 = new int[lIIIIlllll[1]];
        nArray15[v.lIIIIlllll[0]] = lIIIIlllll[30];
        if (v.lllIIllIlIlI(Bank.contains((int[])nArray15) ? 1 : 0)) {
            int[] nArray16 = new int[lIIIIlllll[1]];
            nArray16[v.lIIIIlllll[0]] = lIIIIlllll[30];
            if (v.lllIIllIlIll(Bank.getFirst((int[])nArray16).getQuantity(), lIIIIlllll[32])) {
                llIIlllIllll = new d(lIIIIlllll[30], lIIIIlllll[31], lIIIIlllll[13]);
                bv.add((d)llIIlllIllll);
                "".length();
            }
        }
        if (v.lllIIllIllII(Bank.contains((Predicate)(llIIlllIllll = item -> item.getName().toLowerCase().contains(lIIIIllllI[lIIIIlllll[40]]))) ? 1 : 0)) {
            llIIlllIlllI = new d(lIIIIlllll[33], lIIIIlllll[6], lIIIIlllll[34]);
            bv.add(llIIlllIlllI);
            "".length();
        }
        int[] nArray17 = new int[lIIIIlllll[1]];
        nArray17[v.lIIIIlllll[0]] = lIIIIlllll[35];
        if (v.lllIIllIllII(Bank.contains((int[])nArray17) ? 1 : 0)) {
            llIIlllIlllI = new d(lIIIIlllll[35], lIIIIlllll[36], lIIIIlllll[37]);
            bv.add(llIIlllIlllI);
            "".length();
        }
    }

    private static String lllIIllIIlll(String llIIllIllllI, String llIIlllIIIlI) {
        llIIllIllllI = new String(Base64.getDecoder().decode(llIIllIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIlllIIIIl = new StringBuilder();
        char[] llIIlllIIIII = llIIlllIIIlI.toCharArray();
        int llIIllIlllll = lIIIIlllll[0];
        char[] llIIllIllIIl = llIIllIllllI.toCharArray();
        int llIIllIllIII = llIIllIllIIl.length;
        int llIIllIlIlll = lIIIIlllll[0];
        while (v.lllIIllIlIll(llIIllIlIlll, llIIllIllIII)) {
            char llIIlllIIlII = llIIllIllIIl[llIIllIlIlll];
            llIIlllIIIIl.append((char)(llIIlllIIlII ^ llIIlllIIIII[llIIllIlllll % llIIlllIIIII.length]));
            "".length();
            ++llIIllIlllll;
            ++llIIllIlIlll;
            "".length();
            if (" ".length() >= 0) continue;
            return null;
        }
        return String.valueOf(llIIlllIIIIl);
    }

    static {
        v.lllIIllIlIIl();
        v.lllIIllIlIII();
        bv = new ArrayList<d>();
        db = lIIIIlllll[41];
        dc = lIIIIlllll[42];
        int[] nArray = new int[lIIIIlllll[4]];
        nArray[v.lIIIIlllll[0]] = db;
        nArray[v.lIIIIlllll[1]] = dc;
        nArray[v.lIIIIlllll[2]] = lIIIIlllll[8];
        nArray[v.lIIIIlllll[3]] = lIIIIlllll[7];
        dd = nArray;
    }

    private static boolean lllIIllIlIlI(int n2) {
        return n2 != 0;
    }

    private static void lllIIllIlIIl() {
        lIIIIlllll = new int[44];
        v.lIIIIlllll[0] = (0x46 ^ 0x10) & ~(0x28 ^ 0x7E);
        v.lIIIIlllll[1] = " ".length();
        v.lIIIIlllll[2] = "  ".length();
        v.lIIIIlllll[3] = "   ".length();
        v.lIIIIlllll[4] = 9 ^ 0xD;
        v.lIIIIlllll[5] = 0xFFFFBBDF & 0x57A8;
        v.lIIIIlllll[6] = 0xB5 ^ 0x8C ^ (0x3F ^ 3);
        v.lIIIIlllll[7] = 0xFFFF8BF8 & 0x7DFF;
        v.lIIIIlllll[8] = 0xFFFF8EEF & 0x77B8;
        v.lIIIIlllll[9] = 0x46 ^ 0x40;
        v.lIIIIlllll[10] = 0x84 ^ 0xA0 ^ (0x4E ^ 0x6D);
        v.lIIIIlllll[11] = 0x1D ^ 0x15;
        v.lIIIIlllll[12] = 0x32 ^ 0x3B;
        v.lIIIIlllll[13] = 0x2E ^ 0x24;
        v.lIIIIlllll[14] = 0x3D ^ 0x36;
        v.lIIIIlllll[15] = 151 + 64 - 149 + 91 ^ 84 + 68 - 147 + 140;
        v.lIIIIlllll[16] = -(0x24 ^ 0x20) & (0xFFFFFDEF & 0x1B77);
        v.lIIIIlllll[17] = 0xA6 ^ 0xAB;
        v.lIIIIlllll[18] = 0xBF ^ 0xB1;
        v.lIIIIlllll[19] = 0xB5 ^ 0xBA;
        v.lIIIIlllll[20] = 0xD3 ^ 0xC3;
        v.lIIIIlllll[21] = 0xFFFFA6DE & 0x79FB;
        v.lIIIIlllll[22] = 0xFFFFC7E6 & 0x3DFF;
        v.lIIIIlllll[23] = 0xFFFFFFDF & 0x6F7E;
        v.lIIIIlllll[24] = -(0xFFFFBAAF & 0x6DF1) & (0xFFFFBDFE & 0x7FEB);
        v.lIIIIlllll[25] = -(0xFFFFB977 & 0x77DA) & (0xFFFFFBFF & 0x377F);
        v.lIIIIlllll[26] = 0xFFFFC7FF & 0x3A2B;
        v.lIIIIlllll[27] = -(0xFFFFB431 & 0x5BCF) & (0xFFFFFFBD & 0x1BFA);
        v.lIIIIlllll[28] = 0xFFFF92BD & 0x6F6F;
        v.lIIIIlllll[29] = 0xFFFFCFA2 & 0x3FFD;
        v.lIIIIlllll[30] = 0xFFFFAA3A & 0x57EF;
        v.lIIIIlllll[31] = 0xFFFF9F59 & 0x7FE6;
        v.lIIIIlllll[32] = -(0xFFFFB67F & 0x7F83) & (0xFFFFBFFE & 0x77F7);
        v.lIIIIlllll[33] = 0xFFFFBEFE & 0x6FCD;
        v.lIIIIlllll[34] = -(0xFFFFB7D7 & 0x4A3D) & (0xFFFFFFFF & 0x63BC);
        v.lIIIIlllll[35] = 0xFFFFDFD7 & 0x3F6F;
        v.lIIIIlllll[36] = 0xFFFFE3BD & 0x1DD2;
        v.lIIIIlllll[37] = -(0xFFFFD7B1 & 0x6C7F) & (0xFFFFDFBD & 0x67F6);
        v.lIIIIlllll[38] = 0x62 ^ 0x56 ^ (0x8F ^ 0xAA);
        v.lIIIIlllll[39] = 0x36 ^ 0x24;
        v.lIIIIlllll[40] = 0x34 ^ 0x27;
        v.lIIIIlllll[41] = -(0xFFFFDC07 & 0x3BFB) & (0xFFFFFF7F & 0x1DE7);
        v.lIIIIlllll[42] = -(0xFFFFDD9D & 0x6B6F) & (0xFFFFFD2F & 0x4FFF);
        v.lIIIIlllll[43] = 140 + 107 - 175 + 80 ^ 130 + 138 - 212 + 84;
    }

    private static boolean lllIIllIlIll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aW() {
        int n2;
        String[] stringArray = new String[lIIIIlllll[1]];
        stringArray[v.lIIIIlllll[0]] = lIIIIllllI[lIIIIlllll[17]];
        if (v.lllIIllIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lIIIIlllll[1]];
            nArray[v.lIIIIlllll[0]] = lIIIIlllll[8];
            if (v.lllIIllIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lIIIIlllll[1]];
                stringArray2[v.lIIIIlllll[0]] = lIIIIllllI[lIIIIlllll[18]];
                if (v.lllIIllIlIlI(Inventory.contains((String[])stringArray2) ? 1 : 0) && v.lllIIllIlIlI(Inventory.contains((int[])f.aN) ? 1 : 0)) {
                    n2 = lIIIIlllll[1];
                    "".length();
                    if (-" ".length() <= -" ".length()) return n2 != 0;
                    return ((0x32 ^ 0x66 ^ (0xFF ^ 0x86)) & (130 + 73 - 202 + 150 ^ 132 + 180 - 282 + 156 ^ -" ".length())) != 0;
                }
            }
        }
        n2 = lIIIIlllll[0];
        return n2 != 0;
    }

    private static void lllIIllIlIII() {
        lIIIIllllI = new String[lIIIIlllll[43]];
        v.lIIIIllllI[v.lIIIIlllll[0]] = v.lllIIllIIlIl("r3Ap1e7LHXiGnwlV89V+Cg==", "oaHed");
        v.lIIIIllllI[v.lIIIIlllll[1]] = v.lllIIllIIllI("2DRJRje4L1yjS6/t1DL4xtiVxWp/Obhkrevumq/M8qGf89E2/hyVjl3EQTyfR//aL1bLmEropF4=", "uxFzt");
        v.lIIIIllllI[v.lIIIIlllll[2]] = v.lllIIllIIllI("szyYovpAObePFitscGdVUD3ShHJ0uQp8", "hhQtw");
        v.lIIIIllllI[v.lIIIIlllll[3]] = v.lllIIllIIlll("AyghPSQsPT46JG09OHQhLCc8", "MIWTC");
        v.lIIIIllllI[v.lIIIIlllll[4]] = v.lllIIllIIllI("5SuPXbrqKSx38cysUiAeAA==", "tWwWa");
        v.lIIIIllllI[v.lIIIIlllll[6]] = v.lllIIllIIllI("lLAczxen2JW+f/jFhiN0U95nx0CJhmbd", "lhOhA");
        v.lIIIIllllI[v.lIIIIlllll[9]] = v.lllIIllIIlll("Hh9kDDAsWikEMToTKgpiOg80HS4gHzdBYjoNLRkhIRMqCmI9FWQvFxAzCipiHA4tAQ==", "IzDmB");
        v.lIIIIllllI[v.lIIIIlllll[10]] = v.lllIIllIIlll("BA4bJQ==", "SkzWi");
        v.lIIIIllllI[v.lIIIIlllll[11]] = v.lllIIllIIlll("LQEjMQ==", "zdBCR");
        v.lIIIIllllI[v.lIIIIlllll[12]] = v.lllIIllIIlll("NBoiJhQ=", "csGJp");
        v.lIIIIllllI[v.lIIIIlllll[13]] = v.lllIIllIIlll("Ji4dBiM=", "qGxjG");
        v.lIIIIllllI[v.lIIIIlllll[14]] = v.lllIIllIIllI("nO+cS5T8byA=", "XbjJD");
        v.lIIIIllllI[v.lIIIIlllll[15]] = v.lllIIllIIlll("DQQBAiM=", "HutkS");
        v.lIIIIllllI[v.lIIIIlllll[17]] = v.lllIIllIIllI("Zhcec4tcBuLfseutkhH5yg==", "pxcwM");
        v.lIIIIllllI[v.lIIIIlllll[18]] = v.lllIIllIIllI("lX3CcL+Oh/8PCHPbA50nzQ==", "NMUIC");
        v.lIIIIllllI[v.lIIIIlllll[19]] = v.lllIIllIIlIl("nJNMw5PtvK5sy0BoWbnhTg==", "fgNEb");
        v.lIIIIllllI[v.lIIIIlllll[20]] = v.lllIIllIIlIl("oiLv6TSixlejqpo6FMLhdg==", "kgzXb");
        v.lIIIIllllI[v.lIIIIlllll[38]] = v.lllIIllIIlIl("viZ6dmBZaXA=", "eUkFZ");
        v.lIIIIllllI[v.lIIIIlllll[39]] = v.lllIIllIIlIl("EzxXWmw4A6Q=", "VyEns");
        v.lIIIIllllI[v.lIIIIlllll[40]] = v.lllIIllIIlIl("tgG0yKoSZ81YiY41sTZlOK+wEFg2Y/6k", "pOOma");
    }

    public static void aY() {
        if (v.lllIIllIlIlI(Inventory.contains((int[])f.bf) ? 1 : 0) && v.lllIIllIllII(Equipment.contains((int[])f.bf) ? 1 : 0)) {
            Inventory.getFirst((int[])f.bf).interact(lIIIIllllI[lIIIIlllll[38]]);
            Time.sleepTicks((int)lIIIIlllll[1]);
            "".length();
        }
        if (v.lllIIllIlIlI(Inventory.contains((int[])f.aR) ? 1 : 0) && v.lllIIllIllII(Equipment.contains((int[])f.aR) ? 1 : 0)) {
            Inventory.getFirst((int[])f.aR).interact(lIIIIllllI[lIIIIlllll[39]]);
            Time.sleepTicks((int)lIIIIlllll[1]);
            "".length();
        }
    }

    private static boolean lllIIllIlllI(int n2) {
        return n2 > 0;
    }

    private static String lllIIllIIlIl(String llIIlIllllll, String llIIllIIIIII) {
        try {
            SecretKeySpec llIIllIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIllIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIllIIIIll = Cipher.getInstance("Blowfish");
            llIIllIIIIll.init(lIIIIlllll[2], llIIllIIIlII);
            return new String(llIIllIIIIll.doFinal(Base64.getDecoder().decode(llIIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIllIIIIlI) {
            llIIllIIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIllIllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lllIIllIIllI(String llIIllIIlllI, String llIIllIIlIll) {
        try {
            SecretKeySpec llIIllIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIllIIlIll.getBytes(StandardCharsets.UTF_8)), lIIIIlllll[11]), "DES");
            Cipher llIIllIlIIII = Cipher.getInstance("DES");
            llIIllIlIIII.init(lIIIIlllll[2], llIIllIlIIIl);
            return new String(llIIllIlIIII.doFinal(Base64.getDecoder().decode(llIIllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIllIIllll) {
            llIIllIIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIllIllIl(Object object) {
        return object != null;
    }

    public static void aV() {
        block28: {
            block29: {
                block34: {
                    block31: {
                        block33: {
                            block32: {
                                block30: {
                                    if (v.lllIIllIlIlI(bt ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIIIllllI[lIIIIlllll[0]];
                                        b.a(bv);
                                        if (v.lllIIllIlIll(bv.size(), lIIIIlllll[1])) {
                                            System.out.println(lIIIIllllI[lIIIIlllll[1]]);
                                            bt = lIIIIlllll[0];
                                        }
                                    }
                                    if (!v.lllIIllIllII(bt ? 1 : 0) || !v.lllIIllIllII(v.aX() ? 1 : 0)) break block28;
                                    System.out.println(lIIIIllllI[lIIIIlllll[2]]);
                                    if (!v.lllIIllIllII(v.aW() ? 1 : 0)) break block29;
                                    BankLocation llIIllllIIll = BankLocation.getNearest();
                                    if (v.lllIIllIllIl(llIIllllIIll) && v.lllIIllIllII(llIIllllIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIIIllllI[lIIIIlllll[3]];
                                        a.a(llIIllllIIll);
                                    }
                                    if (!v.lllIIllIllIl(llIIllllIIll) || !v.lllIIllIlIlI(llIIllllIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block29;
                                    if (v.lllIIllIllII(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIIIllllI[lIIIIlllll[4]];
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIlllll[5]);
                                        "".length();
                                    }
                                    if (!v.lllIIllIlIlI(Bank.isOpen() ? 1 : 0)) break block29;
                                    AccBuilderRogues.c = lIIIIllllI[lIIIIlllll[6]];
                                    if (v.lllIIllIlllI(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lIIIIlllll[3]);
                                        "".length();
                                    }
                                    if (v.lllIIllIlllI(Equipment.getAll().size()) && v.lllIIllIllII(v.aX() ? 1 : 0)) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lIIIIlllll[2]);
                                        "".length();
                                    }
                                    int[] nArray = new int[lIIIIlllll[1]];
                                    nArray[v.lIIIIlllll[0]] = dc;
                                    if (!v.lllIIllIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                    int[] nArray2 = new int[lIIIIlllll[1]];
                                    nArray2[v.lIIIIlllll[0]] = dc;
                                    if (!v.lllIIllIllll(Inventory.getCount((int[])nArray2), lIIIIlllll[1])) break block31;
                                }
                                int[] nArray = new int[lIIIIlllll[1]];
                                nArray[v.lIIIIlllll[0]] = db;
                                if (!v.lllIIllIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                                int[] nArray3 = new int[lIIIIlllll[1]];
                                nArray3[v.lIIIIlllll[0]] = db;
                                if (!v.lllIIllIlIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block31;
                            }
                            int[] nArray = new int[lIIIIlllll[1]];
                            nArray[v.lIIIIlllll[0]] = lIIIIlllll[7];
                            if (!v.lllIIllIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                            int[] nArray4 = new int[lIIIIlllll[1]];
                            nArray4[v.lIIIIlllll[0]] = lIIIIlllll[7];
                            if (!v.lllIIllIllll(Inventory.getCount((int[])nArray4), lIIIIlllll[1])) break block31;
                        }
                        int[] nArray = new int[lIIIIlllll[1]];
                        nArray[v.lIIIIlllll[0]] = lIIIIlllll[8];
                        if (!v.lllIIllIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray5 = new int[lIIIIlllll[1]];
                        nArray5[v.lIIIIlllll[0]] = lIIIIlllll[8];
                        if (!v.lllIIllIlIll(Inventory.getCount((int[])nArray5), lIIIIlllll[1])) break block34;
                    }
                    v.af();
                    System.out.println(lIIIIllllI[lIIIIlllll[9]]);
                    bt = lIIIIlllll[1];
                    return;
                }
                int[] nArray = new int[lIIIIlllll[1]];
                nArray[v.lIIIIlllll[0]] = db;
                if (v.lllIIllIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray6 = new int[lIIIIlllll[1]];
                    nArray6[v.lIIIIlllll[0]] = db;
                    if (v.lllIIllIlIll(Inventory.getCount((int[])nArray6), lIIIIlllll[1])) {
                        Bank.withdraw((int)db, (int)lIIIIlllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIIIIlllll[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIIlllll[1]];
                            nArray[v.lIIIIlllll[0]] = db;
                            if (v.lllIIllIlllI(Inventory.getCount((int[])nArray))) {
                                bl = lIIIIlllll[1];
                                "".length();
                                if (" ".length() != " ".length()) {
                                    return ((0x3C ^ 0x21) & ~(0x9B ^ 0x86)) != 0;
                                }
                            } else {
                                bl = lIIIIlllll[0];
                            }
                            return bl;
                        }, (int)lIIIIlllll[5]);
                        "".length();
                    }
                }
                int[] nArray7 = new int[lIIIIlllll[1]];
                nArray7[v.lIIIIlllll[0]] = dc;
                if (v.lllIIllIlIlI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[lIIIIlllll[1]];
                    nArray8[v.lIIIIlllll[0]] = dc;
                    if (v.lllIIllIlIll(Inventory.getCount((int[])nArray8), lIIIIlllll[1])) {
                        Bank.withdraw((int)dc, (int)lIIIIlllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIIIIlllll[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIIlllll[1]];
                            nArray[v.lIIIIlllll[0]] = dc;
                            if (v.lllIIllIlllI(Inventory.getCount((int[])nArray))) {
                                bl = lIIIIlllll[1];
                                "".length();
                                if (null != null) {
                                    return ((0x7E ^ 0x65) & ~(0xB3 ^ 0xA8)) != 0;
                                }
                            } else {
                                bl = lIIIIlllll[0];
                            }
                            return bl;
                        }, (int)lIIIIlllll[5]);
                        "".length();
                    }
                }
                int[] nArray9 = new int[lIIIIlllll[1]];
                nArray9[v.lIIIIlllll[0]] = lIIIIlllll[7];
                if (v.lllIIllIlIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    int[] nArray10 = new int[lIIIIlllll[1]];
                    nArray10[v.lIIIIlllll[0]] = lIIIIlllll[7];
                    if (v.lllIIllIlIll(Inventory.getCount((int[])nArray10), lIIIIlllll[1])) {
                        Bank.withdraw((int)lIIIIlllll[7], (int)lIIIIlllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIIIIlllll[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIIlllll[1]];
                            nArray[v.lIIIIlllll[0]] = lIIIIlllll[7];
                            if (v.lllIIllIlllI(Inventory.getCount((int[])nArray))) {
                                bl = lIIIIlllll[1];
                                "".length();
                                if ("  ".length() <= ((51 + 20 - 55 + 134 ^ 153 + 110 - 231 + 129) & (0x5A ^ 4 ^ (0xA8 ^ 0xC1) ^ -" ".length()))) {
                                    return ((58 + 42 - 13 + 92 ^ 154 + 136 - 177 + 61) & (0x9D ^ 0x8B ^ (0x3C ^ 0x37) ^ -" ".length())) != 0;
                                }
                            } else {
                                bl = lIIIIlllll[0];
                            }
                            return bl;
                        }, (int)lIIIIlllll[5]);
                        "".length();
                    }
                }
                int[] nArray11 = new int[lIIIIlllll[1]];
                nArray11[v.lIIIIlllll[0]] = lIIIIlllll[8];
                if (v.lllIIllIlIlI(Bank.contains((int[])nArray11) ? 1 : 0)) {
                    int[] nArray12 = new int[lIIIIlllll[1]];
                    nArray12[v.lIIIIlllll[0]] = lIIIIlllll[8];
                    if (v.lllIIllIlIll(Inventory.getCount((int[])nArray12), lIIIIlllll[1])) {
                        Bank.withdraw((int)lIIIIlllll[8], (int)lIIIIlllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)lIIIIlllll[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIIlllll[1]];
                            nArray[v.lIIIIlllll[0]] = lIIIIlllll[8];
                            if (v.lllIIllIlllI(Inventory.getCount((int[])nArray))) {
                                bl = lIIIIlllll[1];
                                "".length();
                                if ("   ".length() == 0) {
                                    return ((146 + 46 - 19 + 27 ^ 47 + 146 - 187 + 150) & (63 + 68 - -38 + 27 ^ 77 + 142 - 164 + 89 ^ -" ".length())) != 0;
                                }
                            } else {
                                bl = lIIIIlllll[0];
                            }
                            return bl;
                        }, (int)lIIIIlllll[5]);
                        "".length();
                    }
                }
            }
            if (v.lllIIllIlIlI(v.aW() ? 1 : 0)) {
                if (v.lllIIllIlIlI(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (v.lllIIllIllII(Bank.isOpen() ? 1 : 0)) {
                    if (v.lllIIllIlIlI(GrandExchange.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepTicks((int)lIIIIlllll[1]);
                        "".length();
                    }
                    int llIIllllIIll = lIIIIlllll[0];
                    while (v.lllIIllIlIll(llIIllllIIll, dd.length)) {
                        int[] nArray = new int[lIIIIlllll[1]];
                        nArray[v.lIIIIlllll[0]] = dd[llIIllllIIll];
                        Item llIIllllIIlI = Inventory.getFirst((int[])nArray);
                        if (v.lllIIllIllIl(llIIllllIIlI)) {
                            int[] nArray13 = new int[lIIIIlllll[1]];
                            nArray13[v.lIIIIlllll[0]] = llIIllllIIlI.getId();
                            if (v.lllIIllIlIlI(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                String[] stringArray = new String[lIIIIlllll[1]];
                                stringArray[v.lIIIIlllll[0]] = lIIIIllllI[lIIIIlllll[10]];
                                if (v.lllIIllIlIlI(llIIllllIIlI.hasAction(stringArray) ? 1 : 0)) {
                                    llIIllllIIlI.interact(lIIIIllllI[lIIIIlllll[11]]);
                                    Time.sleepTicks((int)lIIIIlllll[1]);
                                    "".length();
                                }
                                String[] stringArray2 = new String[lIIIIlllll[1]];
                                stringArray2[v.lIIIIlllll[0]] = lIIIIllllI[lIIIIlllll[12]];
                                if (v.lllIIllIlIlI(llIIllllIIlI.hasAction(stringArray2) ? 1 : 0)) {
                                    llIIllllIIlI.interact(lIIIIllllI[lIIIIlllll[13]]);
                                    Time.sleepTicks((int)lIIIIlllll[1]);
                                    "".length();
                                }
                                String[] stringArray3 = new String[lIIIIlllll[1]];
                                stringArray3[v.lIIIIlllll[0]] = lIIIIllllI[lIIIIlllll[14]];
                                if (v.lllIIllIlIlI(llIIllllIIlI.hasAction(stringArray3) ? 1 : 0)) {
                                    llIIllllIIlI.interact(lIIIIllllI[lIIIIlllll[15]]);
                                    Time.sleepTicks((int)lIIIIlllll[1]);
                                    "".length();
                                }
                                Time.sleepTicks((int)lIIIIlllll[1]);
                                "".length();
                            }
                        }
                        ++llIIllllIIll;
                        "".length();
                        if ("   ".length() >= " ".length()) continue;
                        return;
                    }
                    if (v.lllIIllIlIlI(v.aX() ? 1 : 0) && v.lllIIllIllII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIlllll[16]);
                        "".length();
                    }
                }
            }
        }
    }

    private static boolean lllIIllIllII(int n2) {
        return n2 == 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aX() {
        int n2;
        String[] stringArray = new String[lIIIIlllll[1]];
        stringArray[v.lIIIIlllll[0]] = lIIIIllllI[lIIIIlllll[19]];
        if (v.lllIIllIlIlI(Equipment.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lIIIIlllll[1]];
            nArray[v.lIIIIlllll[0]] = lIIIIlllll[8];
            if (v.lllIIllIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIIIlllll[1]];
                nArray2[v.lIIIIlllll[0]] = lIIIIlllll[7];
                if (v.lllIIllIlIlI(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIIIlllll[1]];
                    stringArray2[v.lIIIIlllll[0]] = lIIIIllllI[lIIIIlllll[20]];
                    if (v.lllIIllIlIlI(Equipment.contains((String[])stringArray2) ? 1 : 0)) {
                        n2 = lIIIIlllll[1];
                        "".length();
                        if (-" ".length() <= 0) return n2 != 0;
                        return ((0x2E ^ 1 ^ (0x1D ^ 0x6F)) & (44 + 135 - 127 + 157 ^ 33 + 50 - -3 + 54 ^ -" ".length())) != 0;
                    }
                }
            }
        }
        n2 = lIIIIlllll[0];
        return n2 != 0;
    }
}

