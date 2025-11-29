/*
 * Decompiled with CFR 0.152.
 */
package o.m.-.g.q.i.l.i.r.y.o.e.x.u.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class b
extends Enum<b> {
    public static final /* synthetic */ /* enum */ b KWUARM_POT_UNF;
    public static final /* synthetic */ /* enum */ b CADANTINE;
    public static final /* synthetic */ /* enum */ b CADANTINE_POT_UNF;
    public static final /* synthetic */ /* enum */ b IRIT_LEAF;
    private static /* synthetic */ int[] lIIIIIIIIIlIl;
    public static final /* synthetic */ /* enum */ b RANARR_POT_UNF;
    public static final /* synthetic */ /* enum */ b AVANTOE_POT_UNF;
    public static final /* synthetic */ /* enum */ b TARROMIN;
    public static final /* synthetic */ /* enum */ b SNAPDRAGON_POT_UNF;
    public static final /* synthetic */ /* enum */ b HARRALANDER_POT_UNF;
    public static final /* synthetic */ /* enum */ b MARRENTILL_POT_UNF;
    public static final /* synthetic */ /* enum */ b TOADFLAX_POT_UNF;
    public static final /* synthetic */ /* enum */ b LANTADYME;
    private final /* synthetic */ String name;
    public static final /* synthetic */ /* enum */ b DWARF_WEED;
    public static final /* synthetic */ /* enum */ b KWUARM;
    private static final /* synthetic */ b[] $VALUES;
    public static final /* synthetic */ /* enum */ b MARRENTILL;
    public static final /* synthetic */ /* enum */ b HARRALANDER;
    public static final /* synthetic */ /* enum */ b IRIT_POT_UNF;
    public static final /* synthetic */ /* enum */ b DWARF_WEED_POT_UNF;
    public static final /* synthetic */ /* enum */ b RANARR_WEED;
    public static final /* synthetic */ /* enum */ b GUAM_POT_UNF;
    public static final /* synthetic */ /* enum */ b TORSTOL_POT_UNF;
    public static final /* synthetic */ /* enum */ b TOADFLAX;
    public static final /* synthetic */ /* enum */ b GUAM_LEAF;
    public static final /* synthetic */ /* enum */ b AVANTOE;
    public static final /* synthetic */ /* enum */ b LANTA_POT_UNF;
    private static /* synthetic */ String[] lIIIIIIIIIIlI;
    private final /* synthetic */ int herbId;
    public static final /* synthetic */ /* enum */ b TARROMIN_POT_UNF;
    public static final /* synthetic */ /* enum */ b SNAPDRAGON;
    public static final /* synthetic */ /* enum */ b TORSTOL;

    private static String lIIlIllIIIIlllI(String lllllllllllllllIIlIIIIIIllllIIIl, String lllllllllllllllIIlIIIIIIlllIlIll) {
        lllllllllllllllIIlIIIIIIllllIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIIllllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIIIIIlllIllll = new StringBuilder();
        char[] lllllllllllllllIIlIIIIIIlllIlllI = lllllllllllllllIIlIIIIIIlllIlIll.toCharArray();
        int lllllllllllllllIIlIIIIIIlllIllIl = lIIIIIIIIIlIl[0];
        char[] lllllllllllllllIIlIIIIIIlllIIlll = lllllllllllllllIIlIIIIIIllllIIIl.toCharArray();
        int lllllllllllllllIIlIIIIIIlllIIllI = lllllllllllllllIIlIIIIIIlllIIlll.length;
        int lllllllllllllllIIlIIIIIIlllIIlIl = lIIIIIIIIIlIl[0];
        while (b.lIIlIllIIIlIlIl(lllllllllllllllIIlIIIIIIlllIIlIl, lllllllllllllllIIlIIIIIIlllIIllI)) {
            char lllllllllllllllIIlIIIIIIllllIIlI = lllllllllllllllIIlIIIIIIlllIIlll[lllllllllllllllIIlIIIIIIlllIIlIl];
            lllllllllllllllIIlIIIIIIlllIllll.append((char)(lllllllllllllllIIlIIIIIIllllIIlI ^ lllllllllllllllIIlIIIIIIlllIlllI[lllllllllllllllIIlIIIIIIlllIllIl % lllllllllllllllIIlIIIIIIlllIlllI.length]));
            "".length();
            ++lllllllllllllllIIlIIIIIIlllIllIl;
            ++lllllllllllllllIIlIIIIIIlllIIlIl;
            "".length();
            if ((0 + 76 - 75 + 195 ^ 4 + 149 - 87 + 126) != ((0xF4 ^ 0xAB ^ (0xFD ^ 0xB4)) & (0x10 ^ 0x37 ^ (0x1C ^ 0x2D) ^ -" ".length()))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIIIIIlllIllll);
    }

    private b(String string2, int n3) {
        this.name = string2;
        this.herbId = n3;
    }

    private static boolean lIIlIllIIIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    public String a() {
        return this.name;
    }

    private static void lIIlIllIIIlIIll() {
        lIIIIIIIIIIlI = new String[lIIIIIIIIIlIl[84]];
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[0]] = b.lIIlIllIIIIllII("oPjLO1qNmmcym5iOYbigkg==", "mMMfS");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[1]] = b.lIIlIllIIIIllIl("2GexZJ0t3czbM5rNlS+DdQ==", "LHUwR");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[3]] = b.lIIlIllIIIIllII("jZbmlY8Rb+zyKun7PExrrw==", "fZGiw");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[4]] = b.lIIlIllIIIIllII("emOijRumcvAxQrYnlct4AQ==", "tBgcZ");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[6]] = b.lIIlIllIIIIllII("ONsONfg4Qm1fEt3VGCzbGg==", "jnRPk");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[7]] = b.lIIlIllIIIIlllI("LCg5HQsVICU=", "xIKod");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[9]] = b.lIIlIllIIIIllIl("1j7sLb64uGCxv6qKK6L1HQ==", "xcISl");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[10]] = b.lIIlIllIIIIlllI("AzckNQ4nNzgjCjk=", "KVVGo");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[12]] = b.lIIlIllIIIIllII("XpJRUhh1FO11RipkRFlPMQ==", "zNLXa");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[13]] = b.lIIlIllIIIIllIl("rLcNx3yPbUazKf54QN7BQg==", "WrlwR");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[15]] = b.lIIlIllIIIIlllI("GT0HNjIBMx4=", "MrFrt");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[16]] = b.lIIlIllIIIIlllI("HDooIgokNDE=", "HUIFl");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[18]] = b.lIIlIllIIIIllIl("Qv6qHFvPZPEWEZiRSdOEOA==", "HZQVj");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[19]] = b.lIIlIllIIIIllII("hfwt4AggqVxY1JFC/KZxhw==", "sjZBt");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[21]] = b.lIIlIllIIIIlllI("Cj8JIA4ELA==", "KiHnZ");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[22]] = b.lIIlIllIIIIllIl("pmoK/rmGpFA=", "ADvLl");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[24]] = b.lIIlIllIIIIlllI("PAY7JiM6", "wQngq");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[25]] = b.lIIlIllIIIIlllI("ITUAGCYH", "jBuyT");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[27]] = b.lIIlIllIIIIlllI("Kh42IigrETA9Ig==", "yPwrl");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[28]] = b.lIIlIllIIIIlllI("BRogGxUkFSYEHw==", "VtAkq");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[30]] = b.lIIlIllIIIIlllI("GREMCxkOGQYP", "ZPHJW");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[31]] = b.lIIlIllIIIIllIl("IzDtKwEx/Ueea+WiSl6e+w==", "HzTJA");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[33]] = b.lIIlIllIIIIlllI("ASQZIzgJPBoy", "MeWwy");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[34]] = b.lIIlIllIIIIllII("JAPanc1dM7XuMMxmg7qDzA==", "LmYyD");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[36]] = b.lIIlIllIIIIlllI("KBknCyAzGSMcIg==", "lNfYf");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[37]] = b.lIIlIllIIIIllII("0wG7HL08XvQSxY+XB5J5JQ==", "WUwMx");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[39]] = b.lIIlIllIIIIllII("hhd7mpiXmj0=", "QuLUS");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[40]] = b.lIIlIllIIIIlllI("DC4TPgQ3LQ==", "XAaMp");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[42]] = b.lIIlIllIIIIllIl("BVg686PLSD5nu/7zrOjlRQ==", "DSQcf");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[43]] = b.lIIlIllIIIIllIl("Qr++Gub4KOwuQ4iX3ShOfFYxCXlr7lzW", "jkSrb");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[45]] = b.lIIlIllIIIIllIl("CCMNErjEEbH4MutLGDbbf2rIGdZszHdd", "MnSLA");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[46]] = b.lIIlIllIIIIlllI("Iis+MDQVIzQ0ehElLjg1D2pyJDQHYw==", "aJZQZ");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[48]] = b.lIIlIllIIIIllII("1rdQ8DASMd3jtjBBU9YDAg==", "HnBqM");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[49]] = b.lIIlIllIIIIllII("hMGa8Erh/Ku4TbdcU5MIqOiP+SYoZ/Dd", "zfAhZ");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[51]] = b.lIIlIllIIIIllII("O+xkyo/xUzET3m+BheVtXWhx1+UBzVl6", "WZObm");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[52]] = b.lIIlIllIIIIllII("cJ8ClhKnvIYKrnFMkHrFW34HRcg649cS", "fRLoU");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[54]] = b.lIIlIllIIIIllII("AWQTzCjKxJMKVPidg3rZIg==", "RkSrZ");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[55]] = b.lIIlIllIIIIlllI("IQ4TCyEaDUEIOgEIDhZ1XRQPHnw=", "uaaxU");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[57]] = b.lIIlIllIIIIlllI("Gwg6NBsbFiQ6HRYcOjM=", "IItuI");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[58]] = b.lIIlIllIIIIllIl("suEthALP17/EDQcRbCKlghmhsHtI/Ymd", "WjsdW");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[60]] = b.lIIlIllIIIIllIl("RGu5HNeC7SyQ5t+7BaLfLKxXYkaZ9Hw6", "ftXUJ");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[61]] = b.lIIlIllIIIIllIl("R/ITf/lKi8tGn9v6kkIOxYX2pZy0Z+wZ", "uYGxN");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[63]] = b.lIIlIllIIIIllII("1y6jPn5yMB6Hx090A7Wrmg==", "yjfbw");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[64]] = b.lIIlIllIIIIllIl("b4zs5VUBroCaaOIPlnpTzdczycxCsYqN", "GAdQm");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[66]] = b.lIIlIllIIIIllIl("OBynUNp8In2b09DJwVI0kg==", "IxhAX");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[67]] = b.lIIlIllIIIIllII("XE14RtrlFxZgf/wKKoOBPinCy5Qv2WpA", "SLsDy");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[69]] = b.lIIlIllIIIIlllI("BS0rABwEIi0fFgkzJQQHAy0s", "VcjPX");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[70]] = b.lIIlIllIIIIllII("nqLGAjIK/T65llaXL1ESQ5wqMqIlWwy6", "pUeGR");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[72]] = b.lIIlIllIIIIllII("WxUjv1MvpW/ueSC0o8XPZw==", "hoekc");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[73]] = b.lIIlIllIIIIlllI("Ejk0CkElIyEODjtsfRIPM2U=", "ULUga");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[75]] = b.lIIlIllIIIIllII("7sj2uzYeYNGyt+jpHIMmFQY0ze2lkeCd", "PfGOX");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[76]] = b.lIIlIllIIIIllIl("q1XN5Zrpkaxel+ee5qE8dJQhKcJcB1YH", "XhVVw");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[78]] = b.lIIlIllIIIIllII("JomL/EE17uIdww52w7yDhjFrbu3rkHS7", "apDOE");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[79]] = b.lIIlIllIIIIllIl("7+NJMg7MImKLKznvbox7kvU8u5Ycmrw4", "AvbJe");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[81]] = b.lIIlIllIIIIllIl("AeKObAgAbjkl4/bTmq6sxDQV8Psg8cS5", "epHIO");
        b.lIIIIIIIIIIlI[b.lIIIIIIIIIlIl[82]] = b.lIIlIllIIIIlllI("AgwGMwsmDBolDzhNBC4eIwIaYUI/AxJo", "JmtAj");
    }

    private static String lIIlIllIIIIllII(String lllllllllllllllIIlIIIIIlIIIIIIIl, String lllllllllllllllIIlIIIIIlIIIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIIIlIIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIIlIIIIIIII.getBytes(StandardCharsets.UTF_8)), lIIIIIIIIIlIl[12]), "DES");
            Cipher lllllllllllllllIIlIIIIIlIIIIIIll = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIIIlIIIIIIll.init(lIIIIIIIIIlIl[3], lllllllllllllllIIlIIIIIlIIIIIlII);
            return new String(lllllllllllllllIIlIIIIIlIIIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIlIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIIIlIIIIIIlI) {
            lllllllllllllllIIlIIIIIlIIIIIIlI.printStackTrace();
            return null;
        }
    }

    public int b() {
        return this.herbId;
    }

    private static String lIIlIllIIIIllIl(String lllllllllllllllIIlIIIIIlIIIIllII, String lllllllllllllllIIlIIIIIlIIIIllIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIIIlIIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIIlIIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIIIIlIIIlIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIIIIlIIIlIIII.init(lIIIIIIIIIlIl[3], lllllllllllllllIIlIIIIIlIIIlIIIl);
            return new String(lllllllllllllllIIlIIIIIlIIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIlIIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIIIlIIIIllll) {
            lllllllllllllllIIlIIIIIlIIIIllll.printStackTrace();
            return null;
        }
    }

    private static void lIIlIllIIIlIlII() {
        lIIIIIIIIIlIl = new int[85];
        b.lIIIIIIIIIlIl[0] = (171 + 85 - 91 + 36 ^ 144 + 94 - 186 + 105) & (0xE4 ^ 0xA7 ^ (0x10 ^ 7) ^ -" ".length());
        b.lIIIIIIIIIlIl[1] = " ".length();
        b.lIIIIIIIIIlIl[2] = 8 + 167 - 82 + 104 + (0xCC ^ 0xC5) - (0x63 ^ 0x66) + (0x2E ^ 0x1E);
        b.lIIIIIIIIIlIl[3] = "  ".length();
        b.lIIIIIIIIIlIl[4] = "   ".length();
        b.lIIIIIIIIIlIl[5] = "  ".length() + (174 + 28 - -1 + 36) - (137 + 95 - 226 + 139) + (144 + 7 - 87 + 91);
        b.lIIIIIIIIIlIl[6] = 0x81 ^ 0x85;
        b.lIIIIIIIIIlIl[7] = 0xB2 ^ 0xB7;
        b.lIIIIIIIIIlIl[8] = (0x5F ^ 0x41) + (0 + 42 - -128 + 79) - (0x6F ^ 0x3B) + (0x49 ^ 0x73);
        b.lIIIIIIIIIlIl[9] = 0x59 ^ 0x4B ^ (0x48 ^ 0x5C);
        b.lIIIIIIIIIlIl[10] = 7 ^ 0x2C ^ (0x74 ^ 0x58);
        b.lIIIIIIIIIlIl[11] = 150 + 8 - 133 + 230;
        b.lIIIIIIIIIlIl[12] = 0x9A ^ 0x92;
        b.lIIIIIIIIIlIl[13] = 0x39 ^ 0x30;
        b.lIIIIIIIIIlIl[14] = -(0xFFFFEDBD & 0x76DF) & (0xFFFFFD9F & 0x67FD);
        b.lIIIIIIIIIlIl[15] = 0x5F ^ 0x55;
        b.lIIIIIIIIIlIl[16] = 0xA4 ^ 0xAF;
        b.lIIIIIIIIIlIl[17] = -(0xFFFFB7ED & 0x685B) & (0xFFFFABFF & 0x7FFE);
        b.lIIIIIIIIIlIl[18] = 0x3C ^ 0x30;
        b.lIIIIIIIIIlIl[19] = 0x8E ^ 0x83;
        b.lIIIIIIIIIlIl[20] = 0xFFFF9F6B & 0x6197;
        b.lIIIIIIIIIlIl[21] = 0x2B ^ 0x25;
        b.lIIIIIIIIIlIl[22] = 0x76 ^ 0x7D ^ (0x20 ^ 0x24);
        b.lIIIIIIIIIlIl[23] = -(0xFFFFFEFB & 0x4FFF) & (0xFFFFCFFF & Short.MAX_VALUE);
        b.lIIIIIIIIIlIl[24] = 0x4A ^ 0x18 ^ (0x56 ^ 0x14);
        b.lIIIIIIIIIlIl[25] = 0x52 ^ 0x43;
        b.lIIIIIIIIIlIl[26] = -(0xFFFFFBFB & 0x5EE5) & (0xFFFFDFFF & 0x7BE7);
        b.lIIIIIIIIIlIl[27] = 0xB5 ^ 0xA7;
        b.lIIIIIIIIIlIl[28] = 112 + 117 - 223 + 174 ^ 147 + 75 - 66 + 11;
        b.lIIIIIIIIIlIl[29] = -" ".length() & (0xFFFFDBFB & 0x2FBC);
        b.lIIIIIIIIIlIl[30] = 10 + 37 - -2 + 92 ^ 34 + 63 - 11 + 67;
        b.lIIIIIIIIIlIl[31] = 0x84 ^ 0x91;
        b.lIIIIIIIIIlIl[32] = 0xFFFFA7DF & 0x5929;
        b.lIIIIIIIIIlIl[33] = 0x91 ^ 0x87;
        b.lIIIIIIIIIlIl[34] = 0xA1 ^ 0xB6;
        b.lIIIIIIIIIlIl[35] = 0xFFFFFBFB & 0xDB5;
        b.lIIIIIIIIIlIl[36] = 0x9F ^ 0xC3 ^ (0x62 ^ 0x26);
        b.lIIIIIIIIIlIl[37] = 0x57 ^ 0x4F ^ " ".length();
        b.lIIIIIIIIIlIl[38] = -(0xFFFFD1E5 & 0x7E3F) & (0xFFFFD5FF & 0x7B2F);
        b.lIIIIIIIIIlIl[39] = 0 ^ 5 ^ (0x49 ^ 0x56);
        b.lIIIIIIIIIlIl[40] = 85 + 67 - 54 + 88 ^ 65 + 156 - 216 + 156;
        b.lIIIIIIIIIlIl[41] = 0xFFFFEB0F & 0x15FD;
        b.lIIIIIIIIIlIl[42] = 0x5E ^ 0x42;
        b.lIIIIIIIIIlIl[43] = 26 + 103 - 0 + 8 ^ 0 + 45 - -94 + 9;
        b.lIIIIIIIIIlIl[44] = 136 + 196 - 154 + 48 ^ 22 + 56 - -51 + 6;
        b.lIIIIIIIIIlIl[45] = 0xB1 ^ 0xAF;
        b.lIIIIIIIIIlIl[46] = 0xAA ^ 0xB5;
        b.lIIIIIIIIIlIl[47] = 77 + 0 - 54 + 192 ^ 105 + 65 - -7 + 11;
        b.lIIIIIIIIIlIl[48] = 0x47 ^ 9 ^ (0x5D ^ 0x33);
        b.lIIIIIIIIIlIl[49] = 0xB2 ^ 0x93;
        b.lIIIIIIIIIlIl[50] = 0xFFFF9BBF & 0x6DF3;
        b.lIIIIIIIIIlIl[51] = 0xBB ^ 0x99;
        b.lIIIIIIIIIlIl[52] = 0x21 ^ 0x4F ^ (0x28 ^ 0x65);
        b.lIIIIIIIIIlIl[53] = 0x24 ^ 0x45 ^ (0xB6 ^ 0xBA);
        b.lIIIIIIIIIlIl[54] = 171 + 107 - 107 + 2 ^ 100 + 68 - 88 + 57;
        b.lIIIIIIIIIlIl[55] = 0xC9 ^ 0x82 ^ (0xE8 ^ 0x86);
        b.lIIIIIIIIIlIl[56] = 0xA ^ 0x65;
        b.lIIIIIIIIIlIl[57] = 0xE0 ^ 0xC6;
        b.lIIIIIIIIIlIl[58] = 7 ^ 0x70 ^ (0x3F ^ 0x6F);
        b.lIIIIIIIIIlIl[59] = 130 + 11 - -15 + 67 ^ 97 + 179 - 197 + 109;
        b.lIIIIIIIIIlIl[60] = 0xD9 ^ 0x80 ^ (0x54 ^ 0x25);
        b.lIIIIIIIIIlIl[61] = 0x8E ^ 0xA7;
        b.lIIIIIIIIIlIl[62] = 0xFFFF9BFA & 0x6FBF;
        b.lIIIIIIIIIlIl[63] = 0x54 ^ 0x7E;
        b.lIIIIIIIIIlIl[64] = 42 + 94 - 125 + 150 ^ 118 + 56 - 44 + 8;
        b.lIIIIIIIIIlIl[65] = 3 + 20 - -12 + 180 ^ 27 + 119 - 95 + 125;
        b.lIIIIIIIIIlIl[66] = 0x10 ^ 0x55 ^ (0xEB ^ 0x82);
        b.lIIIIIIIIIlIl[67] = 0x64 ^ 0xB ^ (0xC ^ 0x4E);
        b.lIIIIIIIIIlIl[68] = 0x8B ^ 0xA1 ^ (0x23 ^ 0x60);
        b.lIIIIIIIIIlIl[69] = 0x51 ^ 0x7F;
        b.lIIIIIIIIIlIl[70] = 0xE8 ^ 0xC7;
        b.lIIIIIIIIIlIl[71] = 0xFFFF9FBF & 0x6BFC;
        b.lIIIIIIIIIlIl[72] = 0x76 ^ 0x46;
        b.lIIIIIIIIIlIl[73] = 0x7C ^ 0x4D;
        b.lIIIIIIIIIlIl[74] = 0xFF ^ 0xA4;
        b.lIIIIIIIIIlIl[75] = 0xA ^ 0x38;
        b.lIIIIIIIIIlIl[76] = 0x7C ^ 0x4F;
        b.lIIIIIIIIIlIl[77] = 0xFE ^ 0xA3;
        b.lIIIIIIIIIlIl[78] = 0x70 ^ 0x44;
        b.lIIIIIIIIIlIl[79] = 0x4A ^ 0x7F;
        b.lIIIIIIIIIlIl[80] = 0xA ^ 0x55;
        b.lIIIIIIIIIlIl[81] = 0x77 ^ 0x41;
        b.lIIIIIIIIIlIl[82] = 3 ^ 0x2B ^ (0x36 ^ 0x29);
        b.lIIIIIIIIIlIl[83] = 0x2A ^ 0x74 ^ (0x96 ^ 0xA9);
        b.lIIIIIIIIIlIl[84] = 144 + 28 - 94 + 75 ^ 74 + 85 - 34 + 36;
    }

    static {
        b.lIIlIllIIIlIlII();
        b.lIIlIllIIIlIIll();
        GUAM_LEAF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[1]], lIIIIIIIIIlIl[2]);
        MARRENTILL = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[4]], lIIIIIIIIIlIl[5]);
        TARROMIN = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[7]], lIIIIIIIIIlIl[8]);
        HARRALANDER = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[10]], lIIIIIIIIIlIl[11]);
        RANARR_WEED = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[13]], lIIIIIIIIIlIl[14]);
        TOADFLAX = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[16]], lIIIIIIIIIlIl[17]);
        IRIT_LEAF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[19]], lIIIIIIIIIlIl[20]);
        AVANTOE = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[22]], lIIIIIIIIIlIl[23]);
        KWUARM = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[25]], lIIIIIIIIIlIl[26]);
        SNAPDRAGON = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[28]], lIIIIIIIIIlIl[29]);
        CADANTINE = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[31]], lIIIIIIIIIlIl[32]);
        LANTADYME = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[34]], lIIIIIIIIIlIl[35]);
        DWARF_WEED = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[37]], lIIIIIIIIIlIl[38]);
        TORSTOL = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[40]], lIIIIIIIIIlIl[41]);
        IRIT_POT_UNF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[43]], lIIIIIIIIIlIl[44]);
        CADANTINE_POT_UNF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[46]], lIIIIIIIIIlIl[47]);
        LANTA_POT_UNF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[49]], lIIIIIIIIIlIl[50]);
        DWARF_WEED_POT_UNF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[52]], lIIIIIIIIIlIl[53]);
        TORSTOL_POT_UNF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[55]], lIIIIIIIIIlIl[56]);
        RANARR_POT_UNF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[58]], lIIIIIIIIIlIl[59]);
        TOADFLAX_POT_UNF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[61]], lIIIIIIIIIlIl[62]);
        AVANTOE_POT_UNF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[64]], lIIIIIIIIIlIl[65]);
        KWUARM_POT_UNF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[67]], lIIIIIIIIIlIl[68]);
        SNAPDRAGON_POT_UNF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[70]], lIIIIIIIIIlIl[71]);
        GUAM_POT_UNF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[73]], lIIIIIIIIIlIl[74]);
        MARRENTILL_POT_UNF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[76]], lIIIIIIIIIlIl[77]);
        TARROMIN_POT_UNF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[79]], lIIIIIIIIIlIl[80]);
        HARRALANDER_POT_UNF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[82]], lIIIIIIIIIlIl[83]);
        b[] bArray = new b[lIIIIIIIIIlIl[42]];
        bArray[b.lIIIIIIIIIlIl[0]] = GUAM_LEAF;
        bArray[b.lIIIIIIIIIlIl[1]] = MARRENTILL;
        bArray[b.lIIIIIIIIIlIl[3]] = TARROMIN;
        bArray[b.lIIIIIIIIIlIl[4]] = HARRALANDER;
        bArray[b.lIIIIIIIIIlIl[6]] = RANARR_WEED;
        bArray[b.lIIIIIIIIIlIl[7]] = TOADFLAX;
        bArray[b.lIIIIIIIIIlIl[9]] = IRIT_LEAF;
        bArray[b.lIIIIIIIIIlIl[10]] = AVANTOE;
        bArray[b.lIIIIIIIIIlIl[12]] = KWUARM;
        bArray[b.lIIIIIIIIIlIl[13]] = SNAPDRAGON;
        bArray[b.lIIIIIIIIIlIl[15]] = CADANTINE;
        bArray[b.lIIIIIIIIIlIl[16]] = LANTADYME;
        bArray[b.lIIIIIIIIIlIl[18]] = DWARF_WEED;
        bArray[b.lIIIIIIIIIlIl[19]] = TORSTOL;
        bArray[b.lIIIIIIIIIlIl[21]] = IRIT_POT_UNF;
        bArray[b.lIIIIIIIIIlIl[22]] = CADANTINE_POT_UNF;
        bArray[b.lIIIIIIIIIlIl[24]] = LANTA_POT_UNF;
        bArray[b.lIIIIIIIIIlIl[25]] = DWARF_WEED_POT_UNF;
        bArray[b.lIIIIIIIIIlIl[27]] = TORSTOL_POT_UNF;
        bArray[b.lIIIIIIIIIlIl[28]] = RANARR_POT_UNF;
        bArray[b.lIIIIIIIIIlIl[30]] = TOADFLAX_POT_UNF;
        bArray[b.lIIIIIIIIIlIl[31]] = AVANTOE_POT_UNF;
        bArray[b.lIIIIIIIIIlIl[33]] = KWUARM_POT_UNF;
        bArray[b.lIIIIIIIIIlIl[34]] = SNAPDRAGON_POT_UNF;
        bArray[b.lIIIIIIIIIlIl[36]] = GUAM_POT_UNF;
        bArray[b.lIIIIIIIIIlIl[37]] = MARRENTILL_POT_UNF;
        bArray[b.lIIIIIIIIIlIl[39]] = TARROMIN_POT_UNF;
        bArray[b.lIIIIIIIIIlIl[40]] = HARRALANDER_POT_UNF;
        $VALUES = bArray;
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }
}

