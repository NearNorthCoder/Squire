/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 */
package r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;

public final class g
extends Enum<g> {
    public static final /* synthetic */ /* enum */ g PATCH_9;
    public static final /* synthetic */ /* enum */ g PATCH_13;
    public static final /* synthetic */ /* enum */ g PATCH_6_NORTH;
    public static final /* synthetic */ /* enum */ g PATCH_10;
    private final /* synthetic */ int regionY;
    public static final /* synthetic */ /* enum */ g PATCH_15;
    public static final /* synthetic */ /* enum */ g PATCH_6;
    public static final /* synthetic */ /* enum */ g PATCH_14;
    public static final /* synthetic */ /* enum */ g PATCH_2;
    public static final /* synthetic */ /* enum */ g PATCH_3;
    public static final /* synthetic */ /* enum */ g PATCH_1;
    public static final /* synthetic */ /* enum */ g PATCH_1_NORTH;
    public static final /* synthetic */ /* enum */ g PATCH_16_NORTH;
    public static final /* synthetic */ /* enum */ g PATCH_11_NORTH;
    private static /* synthetic */ int[] lIIllllllllll;
    public static final /* synthetic */ /* enum */ g PATCH_4_NORTH;
    private static /* synthetic */ String[] lIIlllllllIll;
    public static final /* synthetic */ /* enum */ g PATCH_14_NORTH;
    public static final /* synthetic */ /* enum */ g PATCH_13_NORTH;
    public static final /* synthetic */ /* enum */ g PATCH_11;
    public static final /* synthetic */ /* enum */ g PATCH_12_NORTH;
    public static final /* synthetic */ /* enum */ g PATCH_2_NORTH;
    public static final /* synthetic */ /* enum */ g PATCH_8;
    public static final /* synthetic */ /* enum */ g PATCH_7;
    public static final /* synthetic */ /* enum */ g PATCH_7_NORTH;
    public static final /* synthetic */ /* enum */ g PATCH_9_NORTH;
    public static final /* synthetic */ /* enum */ g PATCH_3_NORTH;
    public static final /* synthetic */ /* enum */ g PATCH_13_SOUTH;
    public static final /* synthetic */ /* enum */ g PATCH_4;
    public static final /* synthetic */ /* enum */ g PATCH_12;
    private final /* synthetic */ int regionX;
    public static final /* synthetic */ /* enum */ g PATCH_5_NORTH;
    public static final /* synthetic */ /* enum */ g PATCH_10_NORTH;
    public static final /* synthetic */ /* enum */ g PATCH_16;
    public static final /* synthetic */ /* enum */ g PATCH_5;
    private static final /* synthetic */ g[] $VALUES;
    public static final /* synthetic */ /* enum */ g PATCH_8_NORTH;
    public static final /* synthetic */ /* enum */ g PATCH_15_NORTH;

    private static void lIllIllIIllIlIl() {
        lIIlllllllIll = new String[lIIllllllllll[42]];
        g.lIIlllllllIll[g.lIIllllllllll[0]] = g.lIllIllIIlIIlll("3Fg/2tq59KU=", "YcANg");
        g.lIIlllllllIll[g.lIIllllllllll[2]] = g.lIllIllIIlIlIII("BzgROgEISw==", "WyEyI");
        g.lIIlllllllIll[g.lIIllllllllll[6]] = g.lIllIllIIlIIlll("i25Y9dCzzLY=", "QMCmI");
        g.lIIlllllllIll[g.lIIllllllllll[8]] = g.lIllIllIIlIlIII("MjIuFyA9Rw==", "bszTh");
        g.lIIlllllllIll[g.lIIllllllllll[10]] = g.lIllIllIIlIlIIl("JocuKwyjVoemxp0KD0EYPA==", "cZZLL");
        g.lIIlllllllIll[g.lIIllllllllll[12]] = g.lIllIllIIlIIlll("ZxKmi7KvoukGZ2ads4xjyg==", "OHOFU");
        g.lIIlllllllIll[g.lIIllllllllll[14]] = g.lIllIllIIlIlIIl("LPTEHWHwI6eWd6URUooohQ==", "rFAGw");
        g.lIIlllllllIll[g.lIIllllllllll[16]] = g.lIllIllIIlIlIIl("15Nao2u1OktJHRT2Z503/Q==", "hifVz");
        g.lIIlllllllIll[g.lIIllllllllll[18]] = g.lIllIllIIlIlIII("MwQAGx48cA==", "cETXV");
        g.lIIlllllllIll[g.lIIllllllllll[20]] = g.lIllIllIIlIlIII("ExknBA8cbg==", "CXsGG");
        g.lIIlllllllIll[g.lIIllllllllll[21]] = g.lIllIllIIlIlIII("PjsuNQ4xTQ==", "nzzvF");
        g.lIIlllllllIll[g.lIIllllllllll[22]] = g.lIllIllIIlIlIIl("1yLYgG1iN2I=", "ivauK");
        g.lIIlllllllIll[g.lIIllllllllll[23]] = g.lIllIllIIlIIlll("NVIBXw24TdFxiscemWevWw==", "GLYch");
        g.lIIlllllllIll[g.lIIllllllllll[24]] = g.lIllIllIIlIIlll("ImA0zrzxRHFw7ROuww2eXQ==", "zTzkA");
        g.lIIlllllllIll[g.lIIllllllllll[25]] = g.lIllIllIIlIlIIl("72pMn0q6tNdA6IGPuVDdTA==", "KqSFL");
        g.lIIlllllllIll[g.lIIllllllllll[26]] = g.lIllIllIIlIlIII("JDMOEgErSgUfBiYmEg==", "trZQI");
        g.lIIlllllllIll[g.lIIllllllllll[27]] = g.lIllIllIIlIlIIl("aCGuZh7++No=", "QtcdV");
        g.lIIlllllllIll[g.lIIllllllllll[29]] = g.lIllIllIIlIIlll("f2USH2vV+33oKHbzt3LGkg==", "hpNjl");
        g.lIIlllllllIll[g.lIIllllllllll[30]] = g.lIllIllIIlIlIII("HhgyJDsRaFc=", "NYfgs");
        g.lIIlllllllIll[g.lIIllllllllll[31]] = g.lIllIllIIlIlIIl("SwzNWttul/+xUR3qBpWPKw==", "Bnoas");
        g.lIIlllllllIll[g.lIIllllllllll[32]] = g.lIllIllIIlIlIII("IwcHNxEsd2ArCjwTBzw=", "sFStY");
        g.lIIlllllllIll[g.lIIllllllllll[33]] = g.lIllIllIIlIlIIl("1/NlfgTYmddsw/XHWl4JDg==", "wwmQU");
        g.lIIlllllllIll[g.lIIllllllllll[34]] = g.lIllIllIIlIIlll("wsPxn4DS6dzzpoO7cIyPfw==", "MhCGE");
        g.lIIlllllllIll[g.lIIllllllllll[35]] = g.lIllIllIIlIIlll("gl3QxoJYn0Q9+VyYneC8QQ==", "IQaIe");
        g.lIIlllllllIll[g.lIIllllllllll[36]] = g.lIllIllIIlIlIII("JzQtGxIoREsHFDgnLRA=", "wuyXZ");
        g.lIIlllllllIll[g.lIIllllllllll[4]] = g.lIllIllIIlIlIII("PTI6BTAyQl0=", "msnFx");
        g.lIIlllllllIll[g.lIIllllllllll[37]] = g.lIllIllIIlIIlll("enj4g5RgWR3agmRRSeeJwg==", "DnNHx");
        g.lIIlllllllIll[g.lIIllllllllll[38]] = g.lIllIllIIlIlIIl("y5Z3hYXFj4PSa96Jh6ICRQ==", "decro");
        g.lIIlllllllIll[g.lIIllllllllll[5]] = g.lIllIllIIlIlIII("Owo4GSs0elo=", "kKlZc");
        g.lIIlllllllIll[g.lIIllllllllll[39]] = g.lIllIllIIlIlIIl("4RoUv2VXmdsNv0T44yuOaQ==", "XaNwX");
        g.lIIlllllllIll[g.lIIllllllllll[40]] = g.lIllIllIIlIIlll("gCmvTG1lHRnvOIGiOTH3IQ==", "ufwpT");
        g.lIIlllllllIll[g.lIIllllllllll[7]] = g.lIllIllIIlIlIIl("KzplD5QXncN5QhBfKZ9tDA==", "cRgci");
        g.lIIlllllllIll[g.lIIllllllllll[41]] = g.lIllIllIIlIlIIl("ficwUGslezL0QKgSBJsqXA==", "VYTGu");
    }

    private g(int n3, int n4) {
        this.regionX = n3;
        this.regionY = n4;
    }

    private static String lIllIllIIlIlIIl(String llllllllllllllIlllIIlIlIlIIIlIlI, String llllllllllllllIlllIIlIlIlIIIlIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIlIlIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIlIlIIIlIIl.getBytes(StandardCharsets.UTF_8)), lIIllllllllll[18]), "DES");
            Cipher llllllllllllllIlllIIlIlIlIIIlllI = Cipher.getInstance("DES");
            llllllllllllllIlllIIlIlIlIIIlllI.init(lIIllllllllll[6], llllllllllllllIlllIIlIlIlIIIllll);
            return new String(llllllllllllllIlllIIlIlIlIIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIlIlIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlIlIlIIIllIl) {
            llllllllllllllIlllIIlIlIlIIIllIl.printStackTrace();
            return null;
        }
    }

    static {
        g.lIllIllIIllIlll();
        g.lIllIllIIllIlIl();
        PATCH_1 = new g(lIIllllllllll[3], lIIllllllllll[4]);
        PATCH_2 = new g(lIIllllllllll[3], lIIllllllllll[5]);
        PATCH_3 = new g(lIIllllllllll[3], lIIllllllllll[7]);
        PATCH_4 = new g(lIIllllllllll[3], lIIllllllllll[9]);
        PATCH_1_NORTH = new g(lIIllllllllll[3], lIIllllllllll[11]);
        PATCH_2_NORTH = new g(lIIllllllllll[3], lIIllllllllll[13]);
        PATCH_3_NORTH = new g(lIIllllllllll[3], lIIllllllllll[15]);
        PATCH_4_NORTH = new g(lIIllllllllll[3], lIIllllllllll[17]);
        PATCH_5 = new g(lIIllllllllll[19], lIIllllllllll[4]);
        PATCH_6 = new g(lIIllllllllll[19], lIIllllllllll[5]);
        PATCH_7 = new g(lIIllllllllll[19], lIIllllllllll[7]);
        PATCH_8 = new g(lIIllllllllll[19], lIIllllllllll[9]);
        PATCH_5_NORTH = new g(lIIllllllllll[19], lIIllllllllll[11]);
        PATCH_6_NORTH = new g(lIIllllllllll[19], lIIllllllllll[13]);
        PATCH_7_NORTH = new g(lIIllllllllll[19], lIIllllllllll[15]);
        PATCH_8_NORTH = new g(lIIllllllllll[19], lIIllllllllll[17]);
        PATCH_9 = new g(lIIllllllllll[28], lIIllllllllll[4]);
        PATCH_10 = new g(lIIllllllllll[28], lIIllllllllll[5]);
        PATCH_11 = new g(lIIllllllllll[28], lIIllllllllll[7]);
        PATCH_12 = new g(lIIllllllllll[28], lIIllllllllll[9]);
        PATCH_13_SOUTH = new g(lIIllllllllll[28], lIIllllllllll[31]);
        PATCH_9_NORTH = new g(lIIllllllllll[28], lIIllllllllll[11]);
        PATCH_10_NORTH = new g(lIIllllllllll[28], lIIllllllllll[13]);
        PATCH_11_NORTH = new g(lIIllllllllll[28], lIIllllllllll[15]);
        PATCH_12_NORTH = new g(lIIllllllllll[28], lIIllllllllll[17]);
        PATCH_13 = new g(lIIllllllllll[11], lIIllllllllll[4]);
        PATCH_14 = new g(lIIllllllllll[11], lIIllllllllll[5]);
        PATCH_15 = new g(lIIllllllllll[11], lIIllllllllll[7]);
        PATCH_16 = new g(lIIllllllllll[11], lIIllllllllll[9]);
        PATCH_13_NORTH = new g(lIIllllllllll[11], lIIllllllllll[11]);
        PATCH_14_NORTH = new g(lIIllllllllll[11], lIIllllllllll[13]);
        PATCH_15_NORTH = new g(lIIllllllllll[11], lIIllllllllll[15]);
        PATCH_16_NORTH = new g(lIIllllllllll[11], lIIllllllllll[17]);
        g[] gArray = new g[lIIllllllllll[42]];
        gArray[g.lIIllllllllll[0]] = PATCH_1;
        gArray[g.lIIllllllllll[2]] = PATCH_2;
        gArray[g.lIIllllllllll[6]] = PATCH_3;
        gArray[g.lIIllllllllll[8]] = PATCH_4;
        gArray[g.lIIllllllllll[10]] = PATCH_1_NORTH;
        gArray[g.lIIllllllllll[12]] = PATCH_2_NORTH;
        gArray[g.lIIllllllllll[14]] = PATCH_3_NORTH;
        gArray[g.lIIllllllllll[16]] = PATCH_4_NORTH;
        gArray[g.lIIllllllllll[18]] = PATCH_5;
        gArray[g.lIIllllllllll[20]] = PATCH_6;
        gArray[g.lIIllllllllll[21]] = PATCH_7;
        gArray[g.lIIllllllllll[22]] = PATCH_8;
        gArray[g.lIIllllllllll[23]] = PATCH_5_NORTH;
        gArray[g.lIIllllllllll[24]] = PATCH_6_NORTH;
        gArray[g.lIIllllllllll[25]] = PATCH_7_NORTH;
        gArray[g.lIIllllllllll[26]] = PATCH_8_NORTH;
        gArray[g.lIIllllllllll[27]] = PATCH_9;
        gArray[g.lIIllllllllll[29]] = PATCH_10;
        gArray[g.lIIllllllllll[30]] = PATCH_11;
        gArray[g.lIIllllllllll[31]] = PATCH_12;
        gArray[g.lIIllllllllll[32]] = PATCH_13_SOUTH;
        gArray[g.lIIllllllllll[33]] = PATCH_9_NORTH;
        gArray[g.lIIllllllllll[34]] = PATCH_10_NORTH;
        gArray[g.lIIllllllllll[35]] = PATCH_11_NORTH;
        gArray[g.lIIllllllllll[36]] = PATCH_12_NORTH;
        gArray[g.lIIllllllllll[4]] = PATCH_13;
        gArray[g.lIIllllllllll[37]] = PATCH_14;
        gArray[g.lIIllllllllll[38]] = PATCH_15;
        gArray[g.lIIllllllllll[5]] = PATCH_16;
        gArray[g.lIIllllllllll[39]] = PATCH_13_NORTH;
        gArray[g.lIIllllllllll[40]] = PATCH_14_NORTH;
        gArray[g.lIIllllllllll[7]] = PATCH_15_NORTH;
        gArray[g.lIIllllllllll[41]] = PATCH_16_NORTH;
        $VALUES = gArray;
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    private static void lIllIllIIllIlll() {
        lIIllllllllll = new int[43];
        g.lIIllllllllll[0] = (0x11 ^ 0x55 ^ (0x1E ^ 0x13)) & (6 + 162 - -20 + 44 ^ 158 + 154 - 255 + 104 ^ -" ".length());
        g.lIIllllllllll[1] = 0xFFFFBD3F & 0x5EF6;
        g.lIIllllllllll[2] = " ".length();
        g.lIIllllllllll[3] = 0xBB ^ 0x8C;
        g.lIIllllllllll[4] = 147 + 35 - 10 + 19 ^ 23 + 71 - -13 + 59;
        g.lIIllllllllll[5] = 0x1C ^ 0x5B ^ (4 ^ 0x5F);
        g.lIIllllllllll[6] = "  ".length();
        g.lIIllllllllll[7] = 0x16 ^ 9;
        g.lIIllllllllll[8] = "   ".length();
        g.lIIllllllllll[9] = 9 ^ 0x4D ^ (0x73 ^ 0x15);
        g.lIIllllllllll[10] = 0xC8 ^ 0xA6 ^ (0x3E ^ 0x54);
        g.lIIllllllllll[11] = 0xFF ^ 0xAB ^ (0xC9 ^ 0xB5);
        g.lIIllllllllll[12] = (0x59 ^ 0x46) & ~(0x9D ^ 0x82) ^ (0x6E ^ 0x6B);
        g.lIIllllllllll[13] = 0x20 ^ 0x28 ^ (0x3C ^ 0x1F);
        g.lIIllllllllll[14] = 0x8F ^ 0x89;
        g.lIIllllllllll[15] = 0xAC ^ 0x82;
        g.lIIllllllllll[16] = 5 ^ 2;
        g.lIIllllllllll[17] = 5 ^ 0x34;
        g.lIIllllllllll[18] = 0x25 ^ 0x2D;
        g.lIIllllllllll[19] = 0x81 ^ 0xB3;
        g.lIIllllllllll[20] = 0xFD ^ 0xB5 ^ (0xE4 ^ 0xA5);
        g.lIIllllllllll[21] = 0x3C ^ 0x36;
        g.lIIllllllllll[22] = 0x70 ^ 0x7B;
        g.lIIllllllllll[23] = 0x4D ^ 0x69 ^ (0x82 ^ 0xAA);
        g.lIIllllllllll[24] = 0x85 ^ 0x88;
        g.lIIllllllllll[25] = 0x4F ^ 0x67 ^ (0x5F ^ 0x79);
        g.lIIllllllllll[26] = 0x22 ^ 0x2D;
        g.lIIllllllllll[27] = 0xF6 ^ 0x9A ^ (1 ^ 0x7D);
        g.lIIllllllllll[28] = 0x4D ^ 0x41 ^ (0x32 ^ 0x13);
        g.lIIllllllllll[29] = 31 + 73 - 60 + 110 ^ 91 + 123 - 205 + 130;
        g.lIIllllllllll[30] = 0x7D ^ 0x6F;
        g.lIIllllllllll[31] = 0x71 ^ 0x35 ^ (0x3F ^ 0x68);
        g.lIIllllllllll[32] = 31 + 80 - -33 + 26 ^ 61 + 15 - -107 + 7;
        g.lIIllllllllll[33] = 0x82 ^ 0x97;
        g.lIIllllllllll[34] = 0xAE ^ 0xB8;
        g.lIIllllllllll[35] = 0x48 ^ 8 ^ (0x48 ^ 0x1F);
        g.lIIllllllllll[36] = 0xAA ^ 0x89 ^ (0x95 ^ 0xAE);
        g.lIIllllllllll[37] = 0xA6 ^ 0x9F ^ (0x74 ^ 0x57);
        g.lIIllllllllll[38] = 0x8C ^ 0x97;
        g.lIIllllllllll[39] = 0xA6 ^ 0xBB;
        g.lIIllllllllll[40] = "  ".length() ^ (0x4D ^ 0x51);
        g.lIIllllllllll[41] = 0xE2 ^ 0x9E ^ (0x2C ^ 0x70);
        g.lIIllllllllll[42] = 0x11 ^ 0x30;
    }

    private static boolean lIllIllIIlllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIllIllIIlIlIII(String llllllllllllllIlllIIlIlIIlllllII, String llllllllllllllIlllIIlIlIIlllIllI) {
        llllllllllllllIlllIIlIlIIlllllII = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlIlIIlllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIlIlIIllllIlI = new StringBuilder();
        char[] llllllllllllllIlllIIlIlIIllllIIl = llllllllllllllIlllIIlIlIIlllIllI.toCharArray();
        int llllllllllllllIlllIIlIlIIllllIII = lIIllllllllll[0];
        char[] llllllllllllllIlllIIlIlIIlllIIlI = llllllllllllllIlllIIlIlIIlllllII.toCharArray();
        int llllllllllllllIlllIIlIlIIlllIIIl = llllllllllllllIlllIIlIlIIlllIIlI.length;
        int llllllllllllllIlllIIlIlIIlllIIII = lIIllllllllll[0];
        while (g.lIllIllIIlllIlI(llllllllllllllIlllIIlIlIIlllIIII, llllllllllllllIlllIIlIlIIlllIIIl)) {
            char llllllllllllllIlllIIlIlIIlllllIl = llllllllllllllIlllIIlIlIIlllIIlI[llllllllllllllIlllIIlIlIIlllIIII];
            llllllllllllllIlllIIlIlIIllllIlI.append((char)(llllllllllllllIlllIIlIlIIlllllIl ^ llllllllllllllIlllIIlIlIIllllIIl[llllllllllllllIlllIIlIlIIllllIII % llllllllllllllIlllIIlIlIIllllIIl.length]));
            "".length();
            ++llllllllllllllIlllIIlIlIIllllIII;
            ++llllllllllllllIlllIIlIlIIlllIIII;
            "".length();
            if ("   ".length() >= -" ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIlIlIIllllIlI);
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }

    public WorldPoint n() {
        return WorldPoint.fromRegion((int)lIIllllllllll[1], (int)this.regionX, (int)this.regionY, (int)lIIllllllllll[0]);
    }

    private static boolean lIllIllIIlllIlI(int n2, int n3) {
        return n2 < n3;
    }

    public boolean a(TileObject tileObject) {
        int n2;
        RegionPoint regionPoint = RegionPoint.fromWorld((WorldPoint)tileObject.getWorldLocation());
        if (g.lIllIllIIlllIII(regionPoint.getX(), this.regionX) && g.lIllIllIIlllIII(regionPoint.getY(), this.regionY)) {
            n2 = lIIllllllllll[2];
            "".length();
            if (null != null) {
                return ((157 + 134 - 66 + 4 ^ 141 + 84 - 111 + 60) & (96 + 74 - 107 + 132 ^ 56 + 120 - 115 + 75 ^ -" ".length())) != 0;
            }
        } else {
            n2 = lIIllllllllll[0];
        }
        return n2 != 0;
    }

    private static String lIllIllIIlIIlll(String llllllllllllllIlllIIlIlIlIIllIIl, String llllllllllllllIlllIIlIlIlIIllIII) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIlIlIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIlIlIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIlIlIlIIllIll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIlIlIlIIllIll.init(lIIllllllllll[6], llllllllllllllIlllIIlIlIlIIlllII);
            return new String(llllllllllllllIlllIIlIlIlIIllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIlIlIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlIlIlIIllIlI) {
            llllllllllllllIlllIIlIlIlIIllIlI.printStackTrace();
            return null;
        }
    }

    public RegionPoint m() {
        return new RegionPoint(this.regionX, this.regionY, lIIllllllllll[0], lIIllllllllll[1]);
    }
}

