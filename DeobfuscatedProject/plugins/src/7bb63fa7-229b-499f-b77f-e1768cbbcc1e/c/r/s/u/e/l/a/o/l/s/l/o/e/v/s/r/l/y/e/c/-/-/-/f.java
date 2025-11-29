/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-;

import c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.c;
import c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.e;
import c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.k;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.plugins.logout.Clues;

public class f {
    private static /* synthetic */ String[] lIIl;
    private static /* synthetic */ int[] lIll;
    public static /* synthetic */ WorldArea I;
    static /* synthetic */ WorldPoint J;

    private static boolean lllIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean s() {
        int n2;
        int[] nArray = new int[lIll[0]];
        nArray[f.lIll[1]] = Clues.k;
        if (f.llIllI(Inventory.contains((int[])nArray) ? 1 : 0) && f.llIllI(e.A() ? 1 : 0) && f.llIlIl(Inventory.contains(item -> item.getName().contains(lIIl[lIll[61]])) ? 1 : 0) && f.llIlIl(Clues.g ? 1 : 0)) {
            n2 = lIll[0];
            "".length();
            if ("  ".length() < " ".length()) {
                return ((0xBF ^ 0xB1) & ~(0x35 ^ 0x3B)) != 0;
            }
        } else {
            n2 = lIll[1];
        }
        return n2 != 0;
    }

    private static void llIIll() {
        lIll = new int[72];
        f.lIll[0] = " ".length();
        f.lIll[1] = (0x11 ^ 0x4E ^ (0x6A ^ 0x7E)) & (35 + 134 - 52 + 19 ^ 3 + 116 - 0 + 76 ^ -" ".length());
        f.lIll[2] = "  ".length();
        f.lIll[3] = -(0xFFFFEEF5 & 0x331B) & (0xFFFFEEFF & 0x3F7F);
        f.lIll[4] = 0xFFFFBD87 & 0x67FD;
        f.lIll[5] = 78 + 39 - 27 + 103 ^ 131 + 21 - 112 + 158;
        f.lIll[6] = 164 + 128 - 261 + 170 ^ 132 + 175 - 215 + 102;
        f.lIll[7] = 0xFFFFACEF & 0x5F50;
        f.lIll[8] = 0x6E ^ 0x2C;
        f.lIll[9] = 0xB0 ^ 0xB7 ^ (0x19 ^ 0x29);
        f.lIll[10] = 0xFFFF9EDE & 0x6D7F;
        f.lIll[11] = 0xFFFFBEFB & 0x4DB7;
        f.lIll[12] = 0x35 ^ 0x50 ^ (0xA6 ^ 0xC7);
        f.lIll[13] = "   ".length();
        f.lIll[14] = -(0xFFFFF4F7 & 0x5BAF) & (0xFFFFFFEE & 0x5DFF);
        f.lIll[15] = 0xFFFFDA6D & 0x35FA;
        f.lIll[16] = 0x47 ^ 0x42;
        f.lIll[17] = 0x50 ^ 0x56;
        f.lIll[18] = -(0xFFFFF5DB & 0x1A36) & (0xFFFFFCFF & 0x1FF5);
        f.lIll[19] = -(0xFFFFCFFF & 0x70C3) & (0xFFFFF3FA & 0x5DF7);
        f.lIll[20] = 0x2E ^ 0x26;
        f.lIll[21] = 0xB7 ^ 0xBE;
        f.lIll[22] = (0xF9 ^ 0xAD) + (0xAA ^ 0x8F) - (0x91 ^ 0xBC) + (90 + 24 - 73 + 128);
        f.lIll[23] = 0x52 ^ 0x58;
        f.lIll[24] = 0x5C ^ 0x50;
        f.lIll[25] = 112 + 68 - 59 + 9 ^ 90 + 126 - 131 + 67;
        f.lIll[26] = 0xC ^ 0x70 ^ (0x2A ^ 0x5B);
        f.lIll[27] = 0x97 ^ 0xB5;
        f.lIll[28] = 0xA0 ^ 0xAE;
        f.lIll[29] = 0x54 ^ 0x5B;
        f.lIll[30] = 0x31 ^ 0x21;
        f.lIll[31] = 74 + 188 - 87 + 39 ^ 185 + 181 - 204 + 37;
        f.lIll[32] = 0x8B ^ 0x99;
        f.lIll[33] = 0xC4 ^ 0xBF ^ (0xD0 ^ 0xB8);
        f.lIll[34] = 0x54 ^ 0x40;
        f.lIll[35] = 116 + 51 - 158 + 159 ^ 67 + 176 - 223 + 169;
        f.lIll[36] = 0xA0 ^ 0xB6;
        f.lIll[37] = 0x43 ^ 0x54;
        f.lIll[38] = 23 + 4 - -101 + 90 ^ 36 + 7 - -17 + 134;
        f.lIll[39] = 44 + 50 - 39 + 105 ^ 78 + 74 - 148 + 181;
        f.lIll[40] = 0 ^ 0x1B;
        f.lIll[41] = 0x7D ^ 0x39 ^ (0x41 ^ 0x19);
        f.lIll[42] = 204 + 170 - 175 + 22 ^ 81 + 42 - 82 + 151;
        f.lIll[43] = 0xAB ^ 0x89 ^ (0x5B ^ 0x67);
        f.lIll[44] = 0x69 ^ 0x76;
        f.lIll[45] = 0x96 ^ 0xB6;
        f.lIll[46] = 0x68 ^ 0x6F ^ (0x8B ^ 0xAD);
        f.lIll[47] = 0x90 ^ 0xB7 ^ (0x9B ^ 0x9F);
        f.lIll[48] = 0x81 ^ 0xA5;
        f.lIll[49] = 0x52 ^ 0x77;
        f.lIll[50] = 0xA1 ^ 0x87;
        f.lIll[51] = 0xA ^ 0x2D;
        f.lIll[52] = 0x7D ^ 0x55;
        f.lIll[53] = 0x45 ^ 0x6C;
        f.lIll[54] = 0xAD ^ 0x87;
        f.lIll[55] = 91 + 54 - 102 + 85 ^ 56 + 111 - 153 + 157;
        f.lIll[56] = 0x25 ^ 0x11 ^ (0x83 ^ 0x9B);
        f.lIll[57] = 0x7F ^ 0x1D ^ (0x34 ^ 0x7B);
        f.lIll[58] = 43 + 89 - 111 + 125 ^ 38 + 24 - -63 + 63;
        f.lIll[59] = 167 + 112 - 98 + 0 ^ 125 + 68 - 111 + 72;
        f.lIll[60] = 0x6E ^ 0x5E;
        f.lIll[61] = 0x6D ^ 0x1D ^ (0xB ^ 0x4A);
        f.lIll[62] = 0x86 ^ 0xB4;
        f.lIll[63] = 0xB6 ^ 0x93 ^ (0x59 ^ 0x4F);
        f.lIll[64] = 0x9C ^ 0x94 ^ (0x47 ^ 0x7B);
        f.lIll[65] = 0x72 ^ 0x1C ^ (0x9B ^ 0xC0);
        f.lIll[66] = 0x13 ^ 0x20 ^ (0x6B ^ 0x6E);
        f.lIll[67] = 0xFFFFBFFA & 0x4C57;
        f.lIll[68] = 0xFFFFB59F & 0x6FF6;
        f.lIll[69] = 0xFFFFBC74 & 0x4FEB;
        f.lIll[70] = -(0xFFFFEF5F & 0x1AF7) & (0xFFFFAFFF & 0x7FF7);
        f.lIll[71] = 0x3E ^ 6;
    }

    private static int llIlII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    static {
        f.llIIll();
        f.llIIlI();
        I = new WorldArea(lIll[67], lIll[68], lIll[38], lIll[33], lIll[1]);
        J = new WorldPoint(lIll[69], lIll[70], lIll[1]);
    }

    private static boolean llllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIllII(String llllllIIIlIIlIl, String llllllIIIIlllll) {
        llllllIIIlIIlIl = new String(Base64.getDecoder().decode(llllllIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllIIIlIIIll = new StringBuilder();
        char[] llllllIIIlIIIlI = llllllIIIIlllll.toCharArray();
        int llllllIIIlIIIIl = lIll[1];
        char[] llllllIIIIllIll = llllllIIIlIIlIl.toCharArray();
        int llllllIIIIllIlI = llllllIIIIllIll.length;
        int llllllIIIIllIIl = lIll[1];
        while (f.lllllI(llllllIIIIllIIl, llllllIIIIllIlI)) {
            char llllllIIIlIIllI = llllllIIIIllIll[llllllIIIIllIIl];
            llllllIIIlIIIll.append((char)(llllllIIIlIIllI ^ llllllIIIlIIIlI[llllllIIIlIIIIl % llllllIIIlIIIlI.length]));
            "".length();
            ++llllllIIIlIIIIl;
            ++llllllIIIIllIIl;
            "".length();
            if (((161 + 160 - 279 + 198 ^ 64 + 23 - 37 + 125) & (0x45 ^ 2 ^ (0xA8 ^ 0xB0) ^ -" ".length())) == 0) continue;
            return null;
        }
        return String.valueOf(llllllIIIlIIIll);
    }

    private static void llIIlI() {
        lIIl = new String[lIll[71]];
        f.lIIl[f.lIll[1]] = f.lIllII("IwQR", "feeZT");
        f.lIIl[f.lIll[0]] = f.lIllIl("FE609gDRpl83X+YDeRwJxcE7ow1Yt/Wj", "IOwci");
        f.lIIl[f.lIll[2]] = f.lIllIl("iycPQRRrVydtrvuD2IAOSA==", "hGLzE");
        f.lIIl[f.lIll[13]] = f.lIllIl("22hFeGdAX4E=", "VLNGD");
        f.lIIl[f.lIll[12]] = f.lIllII("JyEoEl07JygS", "wHKyp");
        f.lIIl[f.lIll[16]] = f.lIllII("KBouPhVGEigkGQ==", "kvGSw");
        f.lIIl[f.lIll[17]] = f.lIllII("BCsaCTJqIxwTPg==", "GGsdP");
        f.lIIl[f.lIll[5]] = f.lIllIl("9cmCii8RYPCrFeKhUjmwsA==", "MdsFa");
        f.lIIl[f.lIll[20]] = f.lIlllI("LH3gp4g2Huo=", "NuKWw");
        f.lIIl[f.lIll[21]] = f.lIlllI("QANewJLCsDWCzAcXE2zW4w==", "ceVfD");
        f.lIIl[f.lIll[23]] = f.lIlllI("82SwH66wQR8GQgMWh7PbZw==", "VUIpp");
        f.lIIl[f.lIll[6]] = f.lIlllI("AcBOkNhR3kwKWOVkaUVNKw==", "DFlPn");
        f.lIIl[f.lIll[24]] = f.lIlllI("FtwFZZhddgg=", "BxRws");
        f.lIIl[f.lIll[26]] = f.lIllIl("tBY5lz9LuRcy+ex2XnyJqA==", "fdEWh");
        f.lIIl[f.lIll[28]] = f.lIlllI("Obte8TeBL8GVcdOCIjG+0A==", "AseOJ");
        f.lIIl[f.lIll[29]] = f.lIllII("GxgjOhY8Sig1Cz4PPg==", "YjLTl");
        f.lIIl[f.lIll[30]] = f.lIllII("CR8CLwouTR0oEyAMFSQ=", "KmmAp");
        f.lIIl[f.lIll[31]] = f.lIllIl("USNECJt45Rf4bEnth6wj2w==", "CvSGJ");
        f.lIIl[f.lIll[32]] = f.lIllIl("C0P+2BoZIFIWCRcr6CZitQ==", "aoqLN");
        f.lIIl[f.lIll[33]] = f.lIllII("EBkYPnYpAhQ7NyEO", "YkwPV");
        f.lIIl[f.lIll[34]] = f.lIllIl("3/p9B9fc3DLWqzsm6jyQ9A==", "sgiRs");
        f.lIIl[f.lIll[35]] = f.lIllII("BBknADV3DDoA", "WmBeY");
        f.lIIl[f.lIll[36]] = f.lIllII("FAE2FxVnETIVHiIH", "GuSry");
        f.lIIl[f.lIll[37]] = f.lIlllI("giFaq6Qba0BtqBNKC6tycw==", "jeHoS");
        f.lIIl[f.lIll[38]] = f.lIllIl("RmjGPXfXfabnWipuDQsdeg==", "sGKVk");
        f.lIIl[f.lIll[39]] = f.lIlllI("xxL7dRRAXznYK3z6Rjn41w==", "dAznA");
        f.lIIl[f.lIll[25]] = f.lIllII("Bw4/Qy4jACQGOg==", "OoRcI");
        f.lIIl[f.lIll[40]] = f.lIllIl("VZ423QpgFnwSgNu0idnZ8g==", "VGCFY");
        f.lIIl[f.lIll[41]] = f.lIllIl("43jrXY69wffNOgyyOI5JYQ==", "gsQEc");
        f.lIIl[f.lIll[42]] = f.lIllII("GjczAxg2MQ==", "XBGww");
        f.lIIl[f.lIll[43]] = f.lIllII("IA4UIyEBC1kjNAkADDA=", "doyBF");
        f.lIIl[f.lIll[44]] = f.lIlllI("bkWHufmMUNRZEWI6zSGIDg==", "fmPMg");
        f.lIIl[f.lIll[45]] = f.lIlllI("IhmwNbzgDRY=", "aHKjn");
        f.lIIl[f.lIll[46]] = f.lIllIl("5X4WDwZmjqY=", "OoqaW");
        f.lIIl[f.lIll[27]] = f.lIllIl("/twSXWLdnQ8=", "OFsKz");
        f.lIIl[f.lIll[47]] = f.lIllII("FB4DLA8zFA==", "WqtDf");
        f.lIIl[f.lIll[48]] = f.lIlllI("geKv5r76/Bk=", "hwhEp");
        f.lIIl[f.lIll[49]] = f.lIllIl("/Jhb0E0wLYI=", "OYAaO");
        f.lIIl[f.lIll[50]] = f.lIllII("FBEUaggoEwslHy8VEA==", "FpcJi");
        f.lIIl[f.lIll[51]] = f.lIlllI("ftS8y6EmYf0yhlmpHEjniA==", "MwRRS");
        f.lIIl[f.lIll[52]] = f.lIllIl("lL5d6zNX444C186KbqjizQ==", "QqUsc");
        f.lIIl[f.lIll[53]] = f.lIllII("FjQWAjFjNQUWKQ==", "CZuwE");
        f.lIIl[f.lIll[54]] = f.lIllII("CjYICg==", "IYifg");
        f.lIIl[f.lIll[55]] = f.lIlllI("W0+0WFgllnkrTO9dZQAeAA==", "ZIGju");
        f.lIIl[f.lIll[56]] = f.lIllII("LwYXOA5aAhUpHw==", "zhtMz");
        f.lIIl[f.lIll[57]] = f.lIllII("IzsqLh1ELjYiCUQlJiIC", "dICCd");
        f.lIIl[f.lIll[58]] = f.lIllIl("yb8URb7xJllkKOBtAq1NJigB2L+dJgxF", "HZJZp");
        f.lIIl[f.lIll[59]] = f.lIllII("FRwFCQlyGg0WAj0DBQo=", "Rnldp");
        f.lIIl[f.lIll[60]] = f.lIllIl("HatiSr8GLVlc1J/JAgYkgg==", "VYboj");
        f.lIIl[f.lIll[61]] = f.lIlllI("iDIdiRWezNuvz3c5+IQ4rQ==", "uCwcn");
        f.lIIl[f.lIll[62]] = f.lIllII("FAsgAQ==", "WgUde");
        f.lIIl[f.lIll[63]] = f.lIllIl("L28oLt9KlQc=", "tvRWZ");
        f.lIIl[f.lIll[64]] = f.lIllIl("T9g/g187cCM=", "jnuBI");
        f.lIIl[f.lIll[65]] = f.lIlllI("xSYOfog0VPeS78O9EcCIjQ==", "dbFQz");
        f.lIIl[f.lIll[66]] = f.lIllIl("EF2oZaMU8fOuiTf6dcLmVw==", "MaSMZ");
        f.lIIl[f.lIll[9]] = f.lIllIl("gTMyB0ZMeOrJZwgw2vgphA==", "rocUV");
    }

    private static boolean llIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIllI(int n2) {
        return n2 != 0;
    }

    private static String lIlllI(String llllllIIIIIIIll, String llllllIIIIIIIII) {
        try {
            SecretKeySpec llllllIIIIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllIIIIIIIII.getBytes(StandardCharsets.UTF_8)), lIll[20]), "DES");
            Cipher llllllIIIIIIlIl = Cipher.getInstance("DES");
            llllllIIIIIIlIl.init(lIll[2], llllllIIIIIIllI);
            return new String(llllllIIIIIIlIl.doFinal(Base64.getDecoder().decode(llllllIIIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllIIIIIIlII) {
            llllllIIIIIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lllIll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lllIlI(Object object) {
        return object != null;
    }

    public static void E() {
        if (f.llIlIl(f.s() ? 1 : 0)) {
            e.w();
        }
        if (f.llIllI(f.s() ? 1 : 0)) {
            WorldArea llllllIIIllIllI;
            if (f.llIlll(f.llIlII(k.ae(), 70.0))) {
                int[] nArray = new int[lIll[0]];
                nArray[f.lIll[1]] = Clues.k;
                if (f.llIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIll[0]];
                    nArray2[f.lIll[1]] = Clues.k;
                    Inventory.getFirst((int[])nArray2).interact(lIIl[lIll[1]]);
                    Time.sleepTicks((int)lIll[2]);
                    "".length();
                }
            }
            WorldArea llllllIIIllIlll = new WorldArea(lIll[3], lIll[4], lIll[5], lIll[6], lIll[1]);
            if (f.llIlIl(I.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Clues.c = lIIl[lIll[0]];
                llllllIIIllIllI = new WorldArea(lIll[7], lIll[4], lIll[8], lIll[9], lIll[1]);
                if (f.llIlIl(llllllIIIllIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldPoint llllllIIIllIlIl = new WorldPoint(lIll[10], lIll[11], lIll[1]);
                    if (f.lllIII(Players.getLocal().getWorldLocation().distanceTo(llllllIIIllIlIl), lIll[12])) {
                        Movement.walkTo((WorldPoint)llllllIIIllIlIl);
                        "".length();
                        Time.sleepTicks((int)lIll[0]);
                        "".length();
                    }
                    if (f.lllIIl(Players.getLocal().getWorldLocation().distanceTo(llllllIIIllIlIl), lIll[12])) {
                        String[] stringArray = new String[lIll[0]];
                        stringArray[f.lIll[1]] = lIIl[lIll[2]];
                        TileObject llllllIIIllIlII = TileObjects.getNearest((String[])stringArray);
                        if (f.lllIlI(llllllIIIllIlII)) {
                            String[] stringArray2 = new String[lIll[0]];
                            stringArray2[f.lIll[1]] = lIIl[lIll[13]];
                            if (f.llIllI(llllllIIIllIlII.hasAction(stringArray2) ? 1 : 0)) {
                                llllllIIIllIlII.interact(lIIl[lIll[12]]);
                                Time.sleepUntil(() -> {
                                    String[] stringArray = new String[lIll[0]];
                                    stringArray[f.lIll[1]] = lIIl[lIll[66]];
                                    String[] stringArray2 = new String[lIll[0]];
                                    stringArray2[f.lIll[1]] = lIIl[lIll[9]];
                                    return TileObjects.getNearest((String[])stringArray).hasAction(stringArray2);
                                }, (int)k.c(lIll[14], lIll[15]));
                                "".length();
                            }
                            String[] stringArray3 = new String[lIll[0]];
                            stringArray3[f.lIll[1]] = lIIl[lIll[16]];
                            if (f.llIllI(llllllIIIllIlII.hasAction(stringArray3) ? 1 : 0)) {
                                llllllIIIllIlII.interact(lIIl[lIll[17]]);
                                Time.sleepUntil(() -> llllllIIIllIllI.contains(Players.getLocal().getWorldLocation()), (int)k.c(lIll[18], lIll[19]));
                                "".length();
                            }
                        }
                    }
                }
                if (f.llIllI(llllllIIIllIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (f.llIllI(llllllIIIllIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Clues.c = lIIl[lIll[5]];
                        String[] stringArray = new String[lIll[0]];
                        stringArray[f.lIll[1]] = lIIl[lIll[20]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIl[lIll[21]]);
                        Time.sleepTicks((int)lIll[12]);
                        "".length();
                    }
                    if (f.llIlIl(llllllIIIllIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)J);
                        "".length();
                        Time.sleepTicks((int)lIll[0]);
                        "".length();
                    }
                }
            }
            if (f.llIllI(I.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && f.lllIlI(llllllIIIllIllI = NPCs.getNearest(nPC -> {
                int n2;
                if (f.llIllI(nPC.getName().contains(lIIl[lIll[64]]) ? 1 : 0) && f.llIllI(I.contains((Locatable)nPC) ? 1 : 0)) {
                    String[] stringArray = new String[lIll[0]];
                    stringArray[f.lIll[1]] = lIIl[lIll[65]];
                    if (f.llIllI(nPC.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIll[0];
                        "".length();
                        if ("  ".length() != 0) return n2 != 0;
                        return ((0x29 ^ 0x11 ^ (0x37 ^ 0x12)) & (0xC5 ^ 0xA8 ^ (0xEE ^ 0x9E) ^ -" ".length())) != 0;
                    }
                }
                n2 = lIll[1];
                return n2 != 0;
            }))) {
                if (f.llIlIl(Reachable.isInteractable((Locatable)llllllIIIllIllI) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)llllllIIIllIllI.getWorldLocation());
                    "".length();
                    Time.sleepTicks((int)lIll[0]);
                    "".length();
                }
                if (f.llIllI(Reachable.isInteractable((Locatable)llllllIIIllIllI) ? 1 : 0)) {
                    if (f.lllIll(Players.getLocal().getGraphic(), lIll[22])) {
                        Clues.c = lIIl[lIll[23]];
                        llllllIIIllIllI.interact(lIIl[lIll[6]]);
                        Time.sleepTicks((int)k.c(lIll[0], lIll[2]));
                        "".length();
                    }
                    if (f.llllII(Players.getLocal().getGraphic(), lIll[22])) {
                        Clues.c = lIIl[lIll[24]];
                    }
                }
            }
            if (f.llllIl(Inventory.getAll().size(), lIll[25])) {
                Clues.c = lIIl[lIll[26]];
                WorldArea worldArea = new String[lIll[27]];
                worldArea[f.lIll[1]] = lIIl[lIll[28]];
                worldArea[f.lIll[0]] = lIIl[lIll[29]];
                worldArea[f.lIll[2]] = lIIl[lIll[30]];
                worldArea[f.lIll[13]] = lIIl[lIll[31]];
                worldArea[f.lIll[12]] = lIIl[lIll[32]];
                worldArea[f.lIll[16]] = lIIl[lIll[33]];
                worldArea[f.lIll[17]] = lIIl[lIll[34]];
                worldArea[f.lIll[5]] = lIIl[lIll[35]];
                worldArea[f.lIll[20]] = lIIl[lIll[36]];
                worldArea[f.lIll[21]] = lIIl[lIll[37]];
                worldArea[f.lIll[23]] = lIIl[lIll[38]];
                worldArea[f.lIll[6]] = lIIl[lIll[39]];
                worldArea[f.lIll[24]] = lIIl[lIll[25]];
                worldArea[f.lIll[26]] = lIIl[lIll[40]];
                worldArea[f.lIll[28]] = lIIl[lIll[41]];
                worldArea[f.lIll[29]] = lIIl[lIll[42]];
                worldArea[f.lIll[30]] = lIIl[lIll[43]];
                worldArea[f.lIll[31]] = lIIl[lIll[44]];
                worldArea[f.lIll[32]] = lIIl[lIll[45]];
                worldArea[f.lIll[33]] = lIIl[lIll[46]];
                worldArea[f.lIll[34]] = lIIl[lIll[27]];
                worldArea[f.lIll[35]] = lIIl[lIll[47]];
                worldArea[f.lIll[36]] = lIIl[lIll[48]];
                worldArea[f.lIll[37]] = lIIl[lIll[49]];
                worldArea[f.lIll[38]] = lIIl[lIll[50]];
                worldArea[f.lIll[39]] = lIIl[lIll[51]];
                worldArea[f.lIll[25]] = lIIl[lIll[52]];
                worldArea[f.lIll[40]] = lIIl[lIll[53]];
                worldArea[f.lIll[41]] = lIIl[lIll[54]];
                worldArea[f.lIll[42]] = lIIl[lIll[55]];
                worldArea[f.lIll[43]] = lIIl[lIll[56]];
                worldArea[f.lIll[44]] = lIIl[lIll[57]];
                worldArea[f.lIll[45]] = lIIl[lIll[58]];
                worldArea[f.lIll[46]] = lIIl[lIll[59]];
                llllllIIIllIllI = worldArea;
                Inventory.getAll((String[])llllllIIIllIllI).stream().forEach(Item::drop);
            }
            if (f.llIllI(Inventory.contains(item -> {
                int n2;
                if (f.llIllI(item.getName().contains(lIIl[lIll[62]]) ? 1 : 0) && f.llIlIl(item.getName().contains(lIIl[lIll[63]]) ? 1 : 0)) {
                    n2 = lIll[0];
                    "".length();
                    if ("  ".length() < 0) {
                        return ((0xA3 ^ 0x85) & ~(0x8B ^ 0xAD)) != 0;
                    }
                } else {
                    n2 = lIll[1];
                }
                return n2 != 0;
            }) ? 1 : 0)) {
                System.out.println(lIIl[lIll[60]]);
                c.E = lIll[0];
                Time.sleepTicks((int)k.c(lIll[2], lIll[13]));
                "".length();
                return;
            }
        }
    }

    private static boolean llllII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIlll(int n2) {
        return n2 < 0;
    }

    private static boolean lllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllIl(String llllllIIIIIlllI, String llllllIIIIIllIl) {
        try {
            SecretKeySpec llllllIIIIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllIIIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllIIIIlIIlI = Cipher.getInstance("Blowfish");
            llllllIIIIlIIlI.init(lIll[2], llllllIIIIlIIll);
            return new String(llllllIIIIlIIlI.doFinal(Base64.getDecoder().decode(llllllIIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllIIIIlIIIl) {
            llllllIIIIlIIIl.printStackTrace();
            return null;
        }
    }
}

