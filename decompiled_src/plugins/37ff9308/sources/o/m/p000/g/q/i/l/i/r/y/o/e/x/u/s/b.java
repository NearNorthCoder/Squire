package o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.b  reason: invalid package */
/* loaded from: 37ff9308-5bb6-4332-83e0-8ab13e118f7a.jar:o/m/-/g/q/i/l/i/r/y/o/e/x/u/s/b.class */
public final class b {
    public static final /* synthetic */ b KWUARM_POT_UNF;
    public static final /* synthetic */ b CADANTINE;
    public static final /* synthetic */ b CADANTINE_POT_UNF;
    public static final /* synthetic */ b IRIT_LEAF;
    private static /* synthetic */ int[] lIIIIIIIIIlIl;
    public static final /* synthetic */ b RANARR_POT_UNF;
    public static final /* synthetic */ b AVANTOE_POT_UNF;
    public static final /* synthetic */ b TARROMIN;
    public static final /* synthetic */ b SNAPDRAGON_POT_UNF;
    public static final /* synthetic */ b HARRALANDER_POT_UNF;
    public static final /* synthetic */ b MARRENTILL_POT_UNF;
    public static final /* synthetic */ b TOADFLAX_POT_UNF;
    public static final /* synthetic */ b LANTADYME;
    private final /* synthetic */ String name;
    public static final /* synthetic */ b DWARF_WEED;
    public static final /* synthetic */ b KWUARM;
    private static final /* synthetic */ b[] $VALUES;
    public static final /* synthetic */ b MARRENTILL;
    public static final /* synthetic */ b HARRALANDER;
    public static final /* synthetic */ b IRIT_POT_UNF;
    public static final /* synthetic */ b DWARF_WEED_POT_UNF;
    public static final /* synthetic */ b RANARR_WEED;
    public static final /* synthetic */ b GUAM_POT_UNF;
    public static final /* synthetic */ b TORSTOL_POT_UNF;
    public static final /* synthetic */ b TOADFLAX;
    public static final /* synthetic */ b GUAM_LEAF;
    public static final /* synthetic */ b AVANTOE;
    public static final /* synthetic */ b LANTA_POT_UNF;
    private static /* synthetic */ String[] lIIIIIIIIIIlI;
    private final /* synthetic */ int herbId;
    public static final /* synthetic */ b TARROMIN_POT_UNF;
    public static final /* synthetic */ b SNAPDRAGON;
    public static final /* synthetic */ b TORSTOL;

    private static String lIIlIllIIIIlllI(String lllllllllllllllIIlIIIIIIllllIIIl, String lllllllllllllllIIlIIIIIIllllIIII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIIllllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIlIIIIIIlllIlllI = lllllllllllllllIIlIIIIIIllllIIII.toCharArray();
        int lllllllllllllllIIlIIIIIIlllIllIl = lIIIIIIIIIlIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int lllllllllllllllIIlIIIIIIlllIIlIl = lIIIIIIIIIlIl[0];
        while (lIIlIllIIIlIlIl(lllllllllllllllIIlIIIIIIlllIIlIl, length)) {
            char lllllllllllllllIIlIIIIIIllllIIlI = charArray[lllllllllllllllIIlIIIIIIlllIIlIl];
            sb.append((char) (lllllllllllllllIIlIIIIIIllllIIlI ^ lllllllllllllllIIlIIIIIIlllIlllI[lllllllllllllllIIlIIIIIIlllIllIl % lllllllllllllllIIlIIIIIIlllIlllI.length]));
            "".length();
            lllllllllllllllIIlIIIIIIlllIllIl++;
            lllllllllllllllIIlIIIIIIlllIIlIl++;
            "".length();
            if (((((0 + 76) - 75) + 195) ^ (((4 + 149) - 87) + 126)) == (((244 ^ 171) ^ (253 ^ 180)) & (((16 ^ 55) ^ (28 ^ 45)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private b(String str, int i, String str2, int i2) {
        this.name = str2;
        this.herbId = i2;
    }

    private static boolean lIIlIllIIIlIlIl(int i, int i2) {
        return i < i2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public String a() {
        return this.name;
    }

    private static void lIIlIllIIIlIIll() {
        lIIIIIIIIIIlI = new String[lIIIIIIIIIlIl[84]];
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[0]] = lIIlIllIIIIllII("oPjLO1qNmmcym5iOYbigkg==", "mMMfS");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[1]] = lIIlIllIIIIllIl("2GexZJ0t3czbM5rNlS+DdQ==", "LHUwR");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[3]] = lIIlIllIIIIllII("jZbmlY8Rb+zyKun7PExrrw==", "fZGiw");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[4]] = lIIlIllIIIIllII("emOijRumcvAxQrYnlct4AQ==", "tBgcZ");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[6]] = lIIlIllIIIIllII("ONsONfg4Qm1fEt3VGCzbGg==", "jnRPk");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[7]] = lIIlIllIIIIlllI("LCg5HQsVICU=", "xIKod");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[9]] = lIIlIllIIIIllIl("1j7sLb64uGCxv6qKK6L1HQ==", "xcISl");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[10]] = lIIlIllIIIIlllI("AzckNQ4nNzgjCjk=", "KVVGo");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[12]] = lIIlIllIIIIllII("XpJRUhh1FO11RipkRFlPMQ==", "zNLXa");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[13]] = lIIlIllIIIIllIl("rLcNx3yPbUazKf54QN7BQg==", "WrlwR");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[15]] = lIIlIllIIIIlllI("GT0HNjIBMx4=", "MrFrt");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[16]] = lIIlIllIIIIlllI("HDooIgokNDE=", "HUIFl");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[18]] = lIIlIllIIIIllIl("Qv6qHFvPZPEWEZiRSdOEOA==", "HZQVj");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[19]] = lIIlIllIIIIllII("hfwt4AggqVxY1JFC/KZxhw==", "sjZBt");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[21]] = lIIlIllIIIIlllI("Cj8JIA4ELA==", "KiHnZ");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[22]] = lIIlIllIIIIllIl("pmoK/rmGpFA=", "ADvLl");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[24]] = lIIlIllIIIIlllI("PAY7JiM6", "wQngq");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[25]] = lIIlIllIIIIlllI("ITUAGCYH", "jBuyT");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[27]] = lIIlIllIIIIlllI("Kh42IigrETA9Ig==", "yPwrl");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[28]] = lIIlIllIIIIlllI("BRogGxUkFSYEHw==", "VtAkq");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[30]] = lIIlIllIIIIlllI("GREMCxkOGQYP", "ZPHJW");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[31]] = lIIlIllIIIIllIl("IzDtKwEx/Ueea+WiSl6e+w==", "HzTJA");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[33]] = lIIlIllIIIIlllI("ASQZIzgJPBoy", "MeWwy");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[34]] = lIIlIllIIIIllII("JAPanc1dM7XuMMxmg7qDzA==", "LmYyD");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[36]] = lIIlIllIIIIlllI("KBknCyAzGSMcIg==", "lNfYf");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[37]] = lIIlIllIIIIllII("0wG7HL08XvQSxY+XB5J5JQ==", "WUwMx");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[39]] = lIIlIllIIIIllII("hhd7mpiXmj0=", "QuLUS");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[40]] = lIIlIllIIIIlllI("DC4TPgQ3LQ==", "XAaMp");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[42]] = lIIlIllIIIIllIl("BVg686PLSD5nu/7zrOjlRQ==", "DSQcf");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[43]] = lIIlIllIIIIllIl("Qr++Gub4KOwuQ4iX3ShOfFYxCXlr7lzW", "jkSrb");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[45]] = lIIlIllIIIIllIl("CCMNErjEEbH4MutLGDbbf2rIGdZszHdd", "MnSLA");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[46]] = lIIlIllIIIIlllI("Iis+MDQVIzQ0ehElLjg1D2pyJDQHYw==", "aJZQZ");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[48]] = lIIlIllIIIIllII("1rdQ8DASMd3jtjBBU9YDAg==", "HnBqM");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[49]] = lIIlIllIIIIllII("hMGa8Erh/Ku4TbdcU5MIqOiP+SYoZ/Dd", "zfAhZ");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[51]] = lIIlIllIIIIllII("O+xkyo/xUzET3m+BheVtXWhx1+UBzVl6", "WZObm");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[52]] = lIIlIllIIIIllII("cJ8ClhKnvIYKrnFMkHrFW34HRcg649cS", "fRLoU");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[54]] = lIIlIllIIIIllII("AWQTzCjKxJMKVPidg3rZIg==", "RkSrZ");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[55]] = lIIlIllIIIIlllI("IQ4TCyEaDUEIOgEIDhZ1XRQPHnw=", "uaaxU");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[57]] = lIIlIllIIIIlllI("Gwg6NBsbFiQ6HRYcOjM=", "IItuI");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[58]] = lIIlIllIIIIllIl("suEthALP17/EDQcRbCKlghmhsHtI/Ymd", "WjsdW");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[60]] = lIIlIllIIIIllIl("RGu5HNeC7SyQ5t+7BaLfLKxXYkaZ9Hw6", "ftXUJ");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[61]] = lIIlIllIIIIllIl("R/ITf/lKi8tGn9v6kkIOxYX2pZy0Z+wZ", "uYGxN");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[63]] = lIIlIllIIIIllII("1y6jPn5yMB6Hx090A7Wrmg==", "yjfbw");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[64]] = lIIlIllIIIIllIl("b4zs5VUBroCaaOIPlnpTzdczycxCsYqN", "GAdQm");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[66]] = lIIlIllIIIIllIl("OBynUNp8In2b09DJwVI0kg==", "IxhAX");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[67]] = lIIlIllIIIIllII("XE14RtrlFxZgf/wKKoOBPinCy5Qv2WpA", "SLsDy");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[69]] = lIIlIllIIIIlllI("BS0rABwEIi0fFgkzJQQHAy0s", "VcjPX");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[70]] = lIIlIllIIIIllII("nqLGAjIK/T65llaXL1ESQ5wqMqIlWwy6", "pUeGR");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[72]] = lIIlIllIIIIllII("WxUjv1MvpW/ueSC0o8XPZw==", "hoekc");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[73]] = lIIlIllIIIIlllI("Ejk0CkElIyEODjtsfRIPM2U=", "ULUga");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[75]] = lIIlIllIIIIllII("7sj2uzYeYNGyt+jpHIMmFQY0ze2lkeCd", "PfGOX");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[76]] = lIIlIllIIIIllIl("q1XN5Zrpkaxel+ee5qE8dJQhKcJcB1YH", "XhVVw");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[78]] = lIIlIllIIIIllII("JomL/EE17uIdww52w7yDhjFrbu3rkHS7", "apDOE");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[79]] = lIIlIllIIIIllIl("7+NJMg7MImKLKznvbox7kvU8u5Ycmrw4", "AvbJe");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[81]] = lIIlIllIIIIllIl("AeKObAgAbjkl4/bTmq6sxDQV8Psg8cS5", "epHIO");
        lIIIIIIIIIIlI[lIIIIIIIIIlIl[82]] = lIIlIllIIIIlllI("AgwGMwsmDBolDzhNBC4eIwIaYUI/AxJo", "JmtAj");
    }

    private static String lIIlIllIIIIllII(String lllllllllllllllIIlIIIIIlIIIIIIIl, String lllllllllllllllIIlIIIIIlIIIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIIIlIIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIIlIIIIIIII.getBytes(StandardCharsets.UTF_8)), lIIIIIIIIIlIl[12]), "DES");
            Cipher lllllllllllllllIIlIIIIIlIIIIIIll = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIIIlIIIIIIll.init(lIIIIIIIIIlIl[3], lllllllllllllllIIlIIIIIlIIIIIlII);
            return new String(lllllllllllllllIIlIIIIIlIIIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIlIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIIIlIIIIIIlI) {
            lllllllllllllllIIlIIIIIlIIIIIIlI.printStackTrace();
            return null;
        }
    }

    public int b() {
        return this.herbId;
    }

    private static String lIIlIllIIIIllIl(String lllllllllllllllIIlIIIIIlIIIIlllI, String lllllllllllllllIIlIIIIIlIIIIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIIlIIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIIIIIIIlIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIlIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIIIlIIIIllll) {
            lllllllllllllllIIlIIIIIlIIIIllll.printStackTrace();
            return null;
        }
    }

    private static void lIIlIllIIIlIlII() {
        lIIIIIIIIIlIl = new int[85];
        lIIIIIIIIIlIl[0] = ((((171 + 85) - 91) + 36) ^ (((144 + 94) - 186) + 105)) & (((228 ^ 167) ^ (16 ^ 7)) ^ (-" ".length()));
        lIIIIIIIIIlIl[1] = " ".length();
        lIIIIIIIIIlIl[2] = (((((8 + 167) - 82) + 104) + (204 ^ 197)) - (99 ^ 102)) + (46 ^ 30);
        lIIIIIIIIIlIl[3] = "  ".length();
        lIIIIIIIIIlIl[4] = "   ".length();
        lIIIIIIIIIlIl[5] = (("  ".length() + (((174 + 28) - (-1)) + 36)) - (((137 + 95) - 226) + 139)) + ((144 + 7) - 87) + 91;
        lIIIIIIIIIlIl[6] = 129 ^ 133;
        lIIIIIIIIIlIl[7] = 178 ^ 183;
        lIIIIIIIIIlIl[8] = (((95 ^ 65) + (((0 + 42) - (-128)) + 79)) - (111 ^ 59)) + (73 ^ 115);
        lIIIIIIIIIlIl[9] = (89 ^ 75) ^ (72 ^ 92);
        lIIIIIIIIIlIl[10] = (7 ^ 44) ^ (116 ^ 88);
        lIIIIIIIIIlIl[11] = ((150 + 8) - 133) + 230;
        lIIIIIIIIIlIl[12] = 154 ^ 146;
        lIIIIIIIIIlIl[13] = 57 ^ 48;
        lIIIIIIIIIlIl[14] = (-((-4675) & 30431)) & (-609) & 26621;
        lIIIIIIIIIlIl[15] = 95 ^ 85;
        lIIIIIIIIIlIl[16] = 164 ^ 175;
        lIIIIIIIIIlIl[17] = (-((-18451) & 26715)) & (-21505) & 32766;
        lIIIIIIIIIlIl[18] = 60 ^ 48;
        lIIIIIIIIIlIl[19] = 142 ^ 131;
        lIIIIIIIIIlIl[20] = (-24725) & 24983;
        lIIIIIIIIIlIl[21] = 43 ^ 37;
        lIIIIIIIIIlIl[22] = (118 ^ 125) ^ (32 ^ 36);
        lIIIIIIIIIlIl[23] = (-((-261) & 20479)) & (-12289) & 32767;
        lIIIIIIIIIlIl[24] = (74 ^ 24) ^ (86 ^ 20);
        lIIIIIIIIIlIl[25] = 82 ^ 67;
        lIIIIIIIIIlIl[26] = (-((-1029) & 24293)) & (-8193) & 31719;
        lIIIIIIIIIlIl[27] = 181 ^ 167;
        lIIIIIIIIIlIl[28] = (((112 + 117) - 223) + 174) ^ (((147 + 75) - 66) + 11);
        lIIIIIIIIIlIl[29] = (-" ".length()) & (-9221) & 12220;
        lIIIIIIIIIlIl[30] = (((10 + 37) - (-2)) + 92) ^ (((34 + 63) - 11) + 67);
        lIIIIIIIIIlIl[31] = 132 ^ 145;
        lIIIIIIIIIlIl[32] = (-22561) & 22825;
        lIIIIIIIIIlIl[33] = 145 ^ 135;
        lIIIIIIIIIlIl[34] = 161 ^ 182;
        lIIIIIIIIIlIl[35] = (-1029) & 3509;
        lIIIIIIIIIlIl[36] = (159 ^ 195) ^ (98 ^ 38);
        lIIIIIIIIIlIl[37] = (87 ^ 79) ^ " ".length();
        lIIIIIIIIIlIl[38] = (-((-11803) & 32319)) & (-10753) & 31535;
        lIIIIIIIIIlIl[39] = (0 ^ 5) ^ (73 ^ 86);
        lIIIIIIIIIlIl[40] = (((85 + 67) - 54) + 88) ^ (((65 + 156) - 216) + 156);
        lIIIIIIIIIlIl[41] = (-5361) & 5629;
        lIIIIIIIIIlIl[42] = 94 ^ 66;
        lIIIIIIIIIlIl[43] = (((26 + 103) - 0) + 8) ^ (((0 + 45) - (-94)) + 9);
        lIIIIIIIIIlIl[44] = (((136 + 196) - 154) + 48) ^ (((22 + 56) - (-51)) + 6);
        lIIIIIIIIIlIl[45] = 177 ^ 175;
        lIIIIIIIIIlIl[46] = 170 ^ 181;
        lIIIIIIIIIlIl[47] = (((77 + 0) - 54) + 192) ^ (((105 + 65) - (-7)) + 11);
        lIIIIIIIIIlIl[48] = (71 ^ 9) ^ (93 ^ 51);
        lIIIIIIIIIlIl[49] = 178 ^ 147;
        lIIIIIIIIIlIl[50] = (-25665) & 28147;
        lIIIIIIIIIlIl[51] = 187 ^ 153;
        lIIIIIIIIIlIl[52] = (33 ^ 79) ^ (40 ^ 101);
        lIIIIIIIIIlIl[53] = (36 ^ 69) ^ (182 ^ 186);
        lIIIIIIIIIlIl[54] = (((171 + 107) - 107) + 2) ^ (((100 + 68) - 88) + 57);
        lIIIIIIIIIlIl[55] = (201 ^ 130) ^ (232 ^ 134);
        lIIIIIIIIIlIl[56] = 10 ^ 101;
        lIIIIIIIIIlIl[57] = 224 ^ 198;
        lIIIIIIIIIlIl[58] = (7 ^ 112) ^ (63 ^ 111);
        lIIIIIIIIIlIl[59] = (((130 + 11) - (-15)) + 67) ^ (((97 + 179) - 197) + 109);
        lIIIIIIIIIlIl[60] = (217 ^ 128) ^ (84 ^ 37);
        lIIIIIIIIIlIl[61] = 142 ^ 167;
        lIIIIIIIIIlIl[62] = (-25606) & 28607;
        lIIIIIIIIIlIl[63] = 84 ^ 126;
        lIIIIIIIIIlIl[64] = (((42 + 94) - 125) + 150) ^ (((118 + 56) - 44) + 8);
        lIIIIIIIIIlIl[65] = (((3 + 20) - (-12)) + 180) ^ (((27 + 119) - 95) + 125);
        lIIIIIIIIIlIl[66] = (16 ^ 85) ^ (235 ^ 130);
        lIIIIIIIIIlIl[67] = (100 ^ 11) ^ (12 ^ 78);
        lIIIIIIIIIlIl[68] = (139 ^ 161) ^ (35 ^ 96);
        lIIIIIIIIIlIl[69] = 81 ^ 127;
        lIIIIIIIIIlIl[70] = 232 ^ 199;
        lIIIIIIIIIlIl[71] = (-24641) & 27644;
        lIIIIIIIIIlIl[72] = 118 ^ 70;
        lIIIIIIIIIlIl[73] = 124 ^ 77;
        lIIIIIIIIIlIl[74] = 255 ^ 164;
        lIIIIIIIIIlIl[75] = 10 ^ 56;
        lIIIIIIIIIlIl[76] = 124 ^ 79;
        lIIIIIIIIIlIl[77] = 254 ^ 163;
        lIIIIIIIIIlIl[78] = 112 ^ 68;
        lIIIIIIIIIlIl[79] = 74 ^ 127;
        lIIIIIIIIIlIl[80] = 10 ^ 85;
        lIIIIIIIIIlIl[81] = 119 ^ 65;
        lIIIIIIIIIlIl[82] = (3 ^ 43) ^ (54 ^ 41);
        lIIIIIIIIIlIl[83] = (42 ^ 116) ^ (150 ^ 169);
        lIIIIIIIIIlIl[84] = (((144 + 28) - 94) + 75) ^ (((74 + 85) - 34) + 36);
    }

    static {
        lIIlIllIIIlIlII();
        lIIlIllIIIlIIll();
        GUAM_LEAF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[0]], lIIIIIIIIIlIl[0], lIIIIIIIIIIlI[lIIIIIIIIIlIl[1]], lIIIIIIIIIlIl[2]);
        MARRENTILL = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[3]], lIIIIIIIIIlIl[1], lIIIIIIIIIIlI[lIIIIIIIIIlIl[4]], lIIIIIIIIIlIl[5]);
        TARROMIN = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[6]], lIIIIIIIIIlIl[3], lIIIIIIIIIIlI[lIIIIIIIIIlIl[7]], lIIIIIIIIIlIl[8]);
        HARRALANDER = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[9]], lIIIIIIIIIlIl[4], lIIIIIIIIIIlI[lIIIIIIIIIlIl[10]], lIIIIIIIIIlIl[11]);
        RANARR_WEED = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[12]], lIIIIIIIIIlIl[6], lIIIIIIIIIIlI[lIIIIIIIIIlIl[13]], lIIIIIIIIIlIl[14]);
        TOADFLAX = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[15]], lIIIIIIIIIlIl[7], lIIIIIIIIIIlI[lIIIIIIIIIlIl[16]], lIIIIIIIIIlIl[17]);
        IRIT_LEAF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[18]], lIIIIIIIIIlIl[9], lIIIIIIIIIIlI[lIIIIIIIIIlIl[19]], lIIIIIIIIIlIl[20]);
        AVANTOE = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[21]], lIIIIIIIIIlIl[10], lIIIIIIIIIIlI[lIIIIIIIIIlIl[22]], lIIIIIIIIIlIl[23]);
        KWUARM = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[24]], lIIIIIIIIIlIl[12], lIIIIIIIIIIlI[lIIIIIIIIIlIl[25]], lIIIIIIIIIlIl[26]);
        SNAPDRAGON = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[27]], lIIIIIIIIIlIl[13], lIIIIIIIIIIlI[lIIIIIIIIIlIl[28]], lIIIIIIIIIlIl[29]);
        CADANTINE = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[30]], lIIIIIIIIIlIl[15], lIIIIIIIIIIlI[lIIIIIIIIIlIl[31]], lIIIIIIIIIlIl[32]);
        LANTADYME = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[33]], lIIIIIIIIIlIl[16], lIIIIIIIIIIlI[lIIIIIIIIIlIl[34]], lIIIIIIIIIlIl[35]);
        DWARF_WEED = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[36]], lIIIIIIIIIlIl[18], lIIIIIIIIIIlI[lIIIIIIIIIlIl[37]], lIIIIIIIIIlIl[38]);
        TORSTOL = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[39]], lIIIIIIIIIlIl[19], lIIIIIIIIIIlI[lIIIIIIIIIlIl[40]], lIIIIIIIIIlIl[41]);
        IRIT_POT_UNF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[42]], lIIIIIIIIIlIl[21], lIIIIIIIIIIlI[lIIIIIIIIIlIl[43]], lIIIIIIIIIlIl[44]);
        CADANTINE_POT_UNF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[45]], lIIIIIIIIIlIl[22], lIIIIIIIIIIlI[lIIIIIIIIIlIl[46]], lIIIIIIIIIlIl[47]);
        LANTA_POT_UNF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[48]], lIIIIIIIIIlIl[24], lIIIIIIIIIIlI[lIIIIIIIIIlIl[49]], lIIIIIIIIIlIl[50]);
        DWARF_WEED_POT_UNF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[51]], lIIIIIIIIIlIl[25], lIIIIIIIIIIlI[lIIIIIIIIIlIl[52]], lIIIIIIIIIlIl[53]);
        TORSTOL_POT_UNF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[54]], lIIIIIIIIIlIl[27], lIIIIIIIIIIlI[lIIIIIIIIIlIl[55]], lIIIIIIIIIlIl[56]);
        RANARR_POT_UNF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[57]], lIIIIIIIIIlIl[28], lIIIIIIIIIIlI[lIIIIIIIIIlIl[58]], lIIIIIIIIIlIl[59]);
        TOADFLAX_POT_UNF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[60]], lIIIIIIIIIlIl[30], lIIIIIIIIIIlI[lIIIIIIIIIlIl[61]], lIIIIIIIIIlIl[62]);
        AVANTOE_POT_UNF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[63]], lIIIIIIIIIlIl[31], lIIIIIIIIIIlI[lIIIIIIIIIlIl[64]], lIIIIIIIIIlIl[65]);
        KWUARM_POT_UNF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[66]], lIIIIIIIIIlIl[33], lIIIIIIIIIIlI[lIIIIIIIIIlIl[67]], lIIIIIIIIIlIl[68]);
        SNAPDRAGON_POT_UNF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[69]], lIIIIIIIIIlIl[34], lIIIIIIIIIIlI[lIIIIIIIIIlIl[70]], lIIIIIIIIIlIl[71]);
        GUAM_POT_UNF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[72]], lIIIIIIIIIlIl[36], lIIIIIIIIIIlI[lIIIIIIIIIlIl[73]], lIIIIIIIIIlIl[74]);
        MARRENTILL_POT_UNF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[75]], lIIIIIIIIIlIl[37], lIIIIIIIIIIlI[lIIIIIIIIIlIl[76]], lIIIIIIIIIlIl[77]);
        TARROMIN_POT_UNF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[78]], lIIIIIIIIIlIl[39], lIIIIIIIIIIlI[lIIIIIIIIIlIl[79]], lIIIIIIIIIlIl[80]);
        HARRALANDER_POT_UNF = new b(lIIIIIIIIIIlI[lIIIIIIIIIlIl[81]], lIIIIIIIIIlIl[40], lIIIIIIIIIIlI[lIIIIIIIIIlIl[82]], lIIIIIIIIIlIl[83]);
        b[] bVarArr = new b[lIIIIIIIIIlIl[42]];
        bVarArr[lIIIIIIIIIlIl[0]] = GUAM_LEAF;
        bVarArr[lIIIIIIIIIlIl[1]] = MARRENTILL;
        bVarArr[lIIIIIIIIIlIl[3]] = TARROMIN;
        bVarArr[lIIIIIIIIIlIl[4]] = HARRALANDER;
        bVarArr[lIIIIIIIIIlIl[6]] = RANARR_WEED;
        bVarArr[lIIIIIIIIIlIl[7]] = TOADFLAX;
        bVarArr[lIIIIIIIIIlIl[9]] = IRIT_LEAF;
        bVarArr[lIIIIIIIIIlIl[10]] = AVANTOE;
        bVarArr[lIIIIIIIIIlIl[12]] = KWUARM;
        bVarArr[lIIIIIIIIIlIl[13]] = SNAPDRAGON;
        bVarArr[lIIIIIIIIIlIl[15]] = CADANTINE;
        bVarArr[lIIIIIIIIIlIl[16]] = LANTADYME;
        bVarArr[lIIIIIIIIIlIl[18]] = DWARF_WEED;
        bVarArr[lIIIIIIIIIlIl[19]] = TORSTOL;
        bVarArr[lIIIIIIIIIlIl[21]] = IRIT_POT_UNF;
        bVarArr[lIIIIIIIIIlIl[22]] = CADANTINE_POT_UNF;
        bVarArr[lIIIIIIIIIlIl[24]] = LANTA_POT_UNF;
        bVarArr[lIIIIIIIIIlIl[25]] = DWARF_WEED_POT_UNF;
        bVarArr[lIIIIIIIIIlIl[27]] = TORSTOL_POT_UNF;
        bVarArr[lIIIIIIIIIlIl[28]] = RANARR_POT_UNF;
        bVarArr[lIIIIIIIIIlIl[30]] = TOADFLAX_POT_UNF;
        bVarArr[lIIIIIIIIIlIl[31]] = AVANTOE_POT_UNF;
        bVarArr[lIIIIIIIIIlIl[33]] = KWUARM_POT_UNF;
        bVarArr[lIIIIIIIIIlIl[34]] = SNAPDRAGON_POT_UNF;
        bVarArr[lIIIIIIIIIlIl[36]] = GUAM_POT_UNF;
        bVarArr[lIIIIIIIIIlIl[37]] = MARRENTILL_POT_UNF;
        bVarArr[lIIIIIIIIIlIl[39]] = TARROMIN_POT_UNF;
        bVarArr[lIIIIIIIIIlIl[40]] = HARRALANDER_POT_UNF;
        $VALUES = bVarArr;
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
