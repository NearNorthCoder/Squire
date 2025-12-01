package m.e.i.q.u.r.p000.n.s.e.r.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.a  reason: invalid package and case insensitive filesystem */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/a.class */
public final class EnumC0000a {
    /* synthetic */ String activityName;
    public static final /* synthetic */ EnumC0000a GRANITE;
    public static final /* synthetic */ EnumC0000a BONE_SHARDS;
    public static final /* synthetic */ EnumC0000a GEM_ROCKS;
    public static final /* synthetic */ EnumC0000a ESSENCE;
    private static /* synthetic */ int[] lllllIIllIlI;
    public static final /* synthetic */ EnumC0000a VOLCANIC_ASH;
    public static final /* synthetic */ EnumC0000a MOTHERLODE_MINE;
    public static final /* synthetic */ EnumC0000a SUPERHEAT_MINE;
    public static final /* synthetic */ EnumC0000a DAEYALT;
    public static final /* synthetic */ EnumC0000a SANDSTONE;
    public static final /* synthetic */ EnumC0000a AMETHYST;
    private static /* synthetic */ String[] lllllIIllIIl;
    private static final /* synthetic */ EnumC0000a[] $VALUES;
    public static final /* synthetic */ EnumC0000a GUILD_IRON;
    public static final /* synthetic */ EnumC0000a ARDY_IRON;

    public static EnumC0000a valueOf(String str) {
        return (EnumC0000a) Enum.valueOf(EnumC0000a.class, str);
    }

    static {
        lIIlIIlIlllIlII();
        lIIlIIlIlllIIll();
        MOTHERLODE_MINE = new EnumC0000a(lllllIIllIIl[lllllIIllIlI[0]], lllllIIllIlI[0], lllllIIllIIl[lllllIIllIlI[1]]);
        SANDSTONE = new EnumC0000a(lllllIIllIIl[lllllIIllIlI[2]], lllllIIllIlI[1], lllllIIllIIl[lllllIIllIlI[3]]);
        GEM_ROCKS = new EnumC0000a(lllllIIllIIl[lllllIIllIlI[4]], lllllIIllIlI[2], lllllIIllIIl[lllllIIllIlI[5]]);
        GUILD_IRON = new EnumC0000a(lllllIIllIIl[lllllIIllIlI[6]], lllllIIllIlI[3], lllllIIllIIl[lllllIIllIlI[7]]);
        ARDY_IRON = new EnumC0000a(lllllIIllIIl[lllllIIllIlI[8]], lllllIIllIlI[4], lllllIIllIIl[lllllIIllIlI[9]]);
        GRANITE = new EnumC0000a(lllllIIllIIl[lllllIIllIlI[10]], lllllIIllIlI[5], lllllIIllIIl[lllllIIllIlI[11]]);
        AMETHYST = new EnumC0000a(lllllIIllIIl[lllllIIllIlI[12]], lllllIIllIlI[6], lllllIIllIIl[lllllIIllIlI[13]]);
        VOLCANIC_ASH = new EnumC0000a(lllllIIllIIl[lllllIIllIlI[14]], lllllIIllIlI[7], lllllIIllIIl[lllllIIllIlI[15]]);
        SUPERHEAT_MINE = new EnumC0000a(lllllIIllIIl[lllllIIllIlI[16]], lllllIIllIlI[8], lllllIIllIIl[lllllIIllIlI[17]]);
        ESSENCE = new EnumC0000a(lllllIIllIIl[lllllIIllIlI[18]], lllllIIllIlI[9], lllllIIllIIl[lllllIIllIlI[19]]);
        DAEYALT = new EnumC0000a(lllllIIllIIl[lllllIIllIlI[20]], lllllIIllIlI[10], lllllIIllIIl[lllllIIllIlI[21]]);
        BONE_SHARDS = new EnumC0000a(lllllIIllIIl[lllllIIllIlI[22]], lllllIIllIlI[11], lllllIIllIIl[lllllIIllIlI[23]]);
        EnumC0000a[] enumC0000aArr = new EnumC0000a[lllllIIllIlI[12]];
        enumC0000aArr[lllllIIllIlI[0]] = MOTHERLODE_MINE;
        enumC0000aArr[lllllIIllIlI[1]] = SANDSTONE;
        enumC0000aArr[lllllIIllIlI[2]] = GEM_ROCKS;
        enumC0000aArr[lllllIIllIlI[3]] = GUILD_IRON;
        enumC0000aArr[lllllIIllIlI[4]] = ARDY_IRON;
        enumC0000aArr[lllllIIllIlI[5]] = GRANITE;
        enumC0000aArr[lllllIIllIlI[6]] = AMETHYST;
        enumC0000aArr[lllllIIllIlI[7]] = VOLCANIC_ASH;
        enumC0000aArr[lllllIIllIlI[8]] = SUPERHEAT_MINE;
        enumC0000aArr[lllllIIllIlI[9]] = ESSENCE;
        enumC0000aArr[lllllIIllIlI[10]] = DAEYALT;
        enumC0000aArr[lllllIIllIlI[11]] = BONE_SHARDS;
        $VALUES = enumC0000aArr;
    }

    public static EnumC0000a[] values() {
        return (EnumC0000a[]) $VALUES.clone();
    }

    private static void lIIlIIlIlllIlII() {
        lllllIIllIlI = new int[25];
        lllllIIllIlI[0] = ((((73 + 118) - 79) + 84) ^ (((2 + 34) - (-61)) + 46)) & (((87 ^ 35) ^ (158 ^ 161)) ^ (-" ".length()));
        lllllIIllIlI[1] = " ".length();
        lllllIIllIlI[2] = "  ".length();
        lllllIIllIlI[3] = "   ".length();
        lllllIIllIlI[4] = 159 ^ 155;
        lllllIIllIlI[5] = 88 ^ 93;
        lllllIIllIlI[6] = 138 ^ 140;
        lllllIIllIlI[7] = 12 ^ 11;
        lllllIIllIlI[8] = (((157 + 23) - 19) + 28) ^ (((143 + 8) - (-19)) + 11);
        lllllIIllIlI[9] = "  ".length() ^ (29 ^ 22);
        lllllIIllIlI[10] = (110 ^ 18) ^ (56 ^ 78);
        lllllIIllIlI[11] = 118 ^ 125;
        lllllIIllIlI[12] = (((98 + 137) - 162) + 70) ^ (((48 + 27) - (-25)) + 31);
        lllllIIllIlI[13] = (66 ^ 123) ^ (76 ^ 120);
        lllllIIllIlI[14] = (((149 + 76) - 200) + 127) ^ (((145 + 121) - 119) + 3);
        lllllIIllIlI[15] = 162 ^ 173;
        lllllIIllIlI[16] = 172 ^ 188;
        lllllIIllIlI[17] = 151 ^ 134;
        lllllIIllIlI[18] = (((73 + 43) - (-60)) + 0) ^ (((138 + 81) - 208) + 151);
        lllllIIllIlI[19] = 86 ^ 69;
        lllllIIllIlI[20] = (20 ^ 68) ^ (199 ^ 131);
        lllllIIllIlI[21] = 169 ^ 188;
        lllllIIllIlI[22] = 87 ^ 65;
        lllllIIllIlI[23] = 114 ^ 101;
        lllllIIllIlI[24] = 72 ^ 80;
    }

    public String c() {
        return this.activityName;
    }

    private static void lIIlIIlIlllIIll() {
        lllllIIllIIl = new String[lllllIIllIlI[24]];
        lllllIIllIIl[lllllIIllIlI[0]] = lIIlIIlIlllIIII("OAgtGQ4nCzYVDioKMB8O", "uGyQK");
        lllllIIllIIl[lllllIIllIlI[1]] = lIIlIIlIlllIIII("BC0jES47LjgdLhYPPhcu", "IBWyK");
        lllllIIllIIl[lllllIIllIlI[2]] = lIIlIIlIlllIIII("PxsLKAA4FQsp", "lZElS");
        lllllIIllIIl[lllllIIllIlI[3]] = lIIlIIlIlllIIIl("1OSSPDAaTBSzuOTxeaVCcg==", "DTvdo");
        lllllIIllIIl[lllllIIllIlI[4]] = lIIlIIlIlllIIIl("cRIr+bkFEgx3hD76UNNWVw==", "VrqWT");
        lllllIIllIIl[lllllIIllIlI[5]] = lIIlIIlIlllIIII("Iz8GaBULOQA7", "dZkHg");
        lllllIIllIIl[lllllIIllIlI[6]] = lIIlIIlIlllIIII("Bj8TFiweIwgVJg==", "AjZZh");
        lllllIIllIIl[lllllIIllIlI[7]] = lIIlIIlIlllIIlI("vbtzGz5Q+/6LPX3NlyjVsA==", "NsOqy");
        lllllIIllIIl[lllllIIllIlI[8]] = lIIlIIlIlllIIII("DwMJHgwHAwIJ", "NQMGS");
        lllllIIllIIl[lllllIIllIlI[9]] = lIIlIIlIlllIIlI("pEKe9Jydlv6mZdhV7XIxGA==", "FoQxy");
        lllllIIllIIl[lllllIIllIlI[10]] = lIIlIIlIlllIIII("KD4GCx87KQ==", "olGEV");
        lllllIIllIIl[lllllIIllIlI[11]] = lIIlIIlIlllIIII("NyooBwsEPQ==", "pXIib");
        lllllIIllIIl[lllllIIllIlI[12]] = lIIlIIlIlllIIIl("P/7xtemYXA/VtBVoRuJEGw==", "IZvAg");
        lllllIIllIIl[lllllIIllIlI[13]] = lIIlIIlIlllIIlI("FWbGQaydVH47LcX2FYBlZQ==", "RgBbo");
        lllllIIllIIl[lllllIIllIlI[14]] = lIIlIIlIlllIIIl("iRCqwFP0Bq1Re/1EycZXDg==", "xqUEH");
        lllllIIllIIl[lllllIIllIlI[15]] = lIIlIIlIlllIIlI("s/pzhU1In17uYXEQ6pUmfA==", "vSDYz");
        lllllIIllIIl[lllllIIllIlI[16]] = lIIlIIlIlllIIII("Nz8JCAssLxgZBikjFwg=", "djYMY");
        lllllIIllIIl[lllllIIllIlI[17]] = lIIlIIlIlllIIIl("aNhAl+bZm80nnaCtgxa/Ig==", "IBSWh");
        lllllIIllIIl[lllllIIllIlI[18]] = lIIlIIlIlllIIIl("N0PYeft6Fp4=", "kgxpq");
        lllllIIllIIl[lllllIIllIlI[19]] = lIIlIIlIlllIIlI("zFvj3VZzYh33uhOH5pNE+g==", "syBrQ");
        lllllIIllIIl[lllllIIllIlI[20]] = lIIlIIlIlllIIlI("5Sdw0LYRtbM=", "PmCZo");
        lllllIIllIIl[lllllIIllIlI[21]] = lIIlIIlIlllIIIl("PNWgPbtM2iZMLnrk1Zvy9g==", "gKtiW");
        lllllIIllIIl[lllllIIllIlI[22]] = lIIlIIlIlllIIlI("x3m16YqNGG4n7t8mPNM9cQ==", "HqxnS");
        lllllIIllIIl[lllllIIllIlI[23]] = lIIlIIlIlllIIlI("41+oVcOwQJbk8O5qH8dffA==", "plaIE");
    }

    private static String lIIlIIlIlllIIlI(String lllllllllllllllIIlIIlIlllIIllIlI, String lllllllllllllllIIlIIlIlllIIllIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlIlllIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIlllIIllIIl.getBytes(StandardCharsets.UTF_8)), lllllIIllIlI[8]), "DES");
            Cipher lllllllllllllllIIlIIlIlllIIlllII = Cipher.getInstance("DES");
            lllllllllllllllIIlIIlIlllIIlllII.init(lllllIIllIlI[2], lllllllllllllllIIlIIlIlllIIlllIl);
            return new String(lllllllllllllllIIlIIlIlllIIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIlllIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlIlllIIllIll) {
            lllllllllllllllIIlIIlIlllIIllIll.printStackTrace();
            return null;
        }
    }

    private EnumC0000a(String str, int i, String str2) {
        this.activityName = str2;
    }

    private static boolean lIIlIIlIlllIlIl(int i, int i2) {
        return i < i2;
    }

    private static String lIIlIIlIlllIIIl(String lllllllllllllllIIlIIlIlllIlIIlll, String lllllllllllllllIIlIIlIlllIlIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIlllIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllllIIllIlI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIlllIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlIlllIlIlIII) {
            lllllllllllllllIIlIIlIlllIlIlIII.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIlIlllIIII(String lllllllllllllllIIlIIlIlllIIIlIlI, String lllllllllllllllIIlIIlIlllIIIlIIl) {
        String lllllllllllllllIIlIIlIlllIIIlIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIlIlllIIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIlIlllIIIlIII = new StringBuilder();
        char[] lllllllllllllllIIlIIlIlllIIIIlll = lllllllllllllllIIlIIlIlllIIIlIIl.toCharArray();
        int lllllllllllllllIIlIIlIlllIIIIllI = lllllIIllIlI[0];
        char[] charArray = lllllllllllllllIIlIIlIlllIIIlIlI2.toCharArray();
        int length = charArray.length;
        int i = lllllIIllIlI[0];
        while (lIIlIIlIlllIlIl(i, length)) {
            lllllllllllllllIIlIIlIlllIIIlIII.append((char) (charArray[i] ^ lllllllllllllllIIlIIlIlllIIIIlll[lllllllllllllllIIlIIlIlllIIIIllI % lllllllllllllllIIlIIlIlllIIIIlll.length]));
            "".length();
            lllllllllllllllIIlIIlIlllIIIIllI++;
            i++;
            "".length();
            if ((-" ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIIlIlllIIIlIII);
    }
}
