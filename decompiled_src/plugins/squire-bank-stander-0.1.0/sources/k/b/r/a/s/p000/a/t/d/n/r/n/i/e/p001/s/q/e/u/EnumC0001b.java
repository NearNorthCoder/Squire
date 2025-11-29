package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/b.class */
public final class EnumC0001b {
    public static final /* synthetic */ EnumC0001b FLETCH_CUTTING;
    public static final /* synthetic */ EnumC0001b JEWELRY;
    public static final /* synthetic */ EnumC0001b SMELTING;
    public static final /* synthetic */ EnumC0001b GLASS_MAKE;
    public static final /* synthetic */ EnumC0001b BOLTS;
    public static final /* synthetic */ EnumC0001b ARROWS;
    public static final /* synthetic */ EnumC0001b ZERO_TICK;
    public static final /* synthetic */ EnumC0001b CANNON_BALLS;
    public static final /* synthetic */ EnumC0001b COOKING;
    public static final /* synthetic */ EnumC0001b ENCHANT_BOLTS;
    public static final /* synthetic */ EnumC0001b DARTS;
    public static final /* synthetic */ EnumC0001b SMITHING;
    public static final /* synthetic */ EnumC0001b ALCHING;
    private static /* synthetic */ int[] lllIlIllIII;
    public static final /* synthetic */ EnumC0001b STRING_BOWS;
    public static final /* synthetic */ EnumC0001b ENCHANTING;
    public static final /* synthetic */ EnumC0001b WINES;
    public static final /* synthetic */ EnumC0001b ARMOUR;
    public static final /* synthetic */ EnumC0001b FURNACE_GLASS;
    private static final /* synthetic */ EnumC0001b[] $VALUES;
    public static final /* synthetic */ EnumC0001b BATTLESTAVES;
    public static final /* synthetic */ EnumC0001b GEM_CUTTING;
    private static /* synthetic */ String[] lllIlIlIlll;
    public static final /* synthetic */ EnumC0001b GLASS_BLOWING;

    private static String lIllIIIIIIIIIl(String llllllllllllllllIIlIIlIIlIIlIIII, String llllllllllllllllIIlIIlIIlIIIllIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlIIlIIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlIIlIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIlIllIII[2], llllllllllllllllIIlIIlIIlIIlIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlIIlIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIlIIlIIlIIIl) {
            llllllllllllllllIIlIIlIIlIIlIIIl.printStackTrace();
            return null;
        }
    }

    public static EnumC0001b valueOf(String str) {
        return (EnumC0001b) Enum.valueOf(EnumC0001b.class, str);
    }

    private static void lIllIIIIIIIlII() {
        lllIlIlIlll = new String[lllIlIllIII[23]];
        lllIlIlIlll[lllIlIllIII[0]] = lIllIIIIIIIIIl("AAh0+4yc1gE=", "dmYlR");
        lllIlIlIlll[lllIlIllIII[1]] = lIllIIIIIIIIlI("aA==", "HhjZp");
        lllIlIlIlll[lllIlIllIII[2]] = lIllIIIIIIIIll("5iQwbYtDA6NNv1ThlJTKiQ==", "TTeQG");
        lllIlIlIlll[lllIlIllIII[3]] = lIllIIIIIIIIIl("G9Esgg6onX8Yh0tB/Raw7g==", "osOun");
        lllIlIlIlll[lllIlIllIII[4]] = lIllIIIIIIIIlI("IzUTIDU7KQ==", "ipDey");
        lllIlIlIlll[lllIlIllIII[5]] = lIllIIIIIIIIIl("4liOhe0pSw0zNmrWFVZN/g==", "mjslO");
        lllIlIlIlll[lllIlIllIII[6]] = lIllIIIIIIIIlI("Ag8HDAM=", "FNUXP");
        lllIlIlIlll[lllIlIllIII[7]] = lIllIIIIIIIIll("AnV4BELWMTE=", "DirHT");
        lllIlIlIlll[lllIlIllIII[8]] = lIllIIIIIIIIIl("vqJr9ciO/ng6ijZaUPNvpg==", "qpAPp");
        lllIlIlIlll[lllIlIllIII[9]] = lIllIIIIIIIIlI("NCYUITsgLQQnIjQ=", "grFhu");
        lllIlIlIlll[lllIlIllIII[10]] = lIllIIIIIIIIIl("Fgnqx0L4FLc=", "MYJee");
        lllIlIlIlll[lllIlIllIII[11]] = lIllIIIIIIIIIl("6krxTteyUWI=", "ugvvr");
        lllIlIlIlll[lllIlIllIII[12]] = lIllIIIIIIIIll("TXf8JeisFvQ=", "GObNj");
        lllIlIlIlll[lllIlIllIII[13]] = lIllIIIIIIIIll("Iri1ZIHj8W8=", "ndxDP");
        lllIlIlIlll[lllIlIllIII[14]] = lIllIIIIIIIIll("JTCbmapeOsphLE1mgqiFpA==", "cWfQs");
        lllIlIlIlll[lllIlIllIII[15]] = lIllIIIIIIIIIl("fnZrs4poHQFQuUQEOzR1HQ==", "NZeHx");
        lllIlIlIlll[lllIlIllIII[16]] = lIllIIIIIIIIlI("Pj8/EhokPDE=", "mrvFR");
        lllIlIlIlll[lllIlIllIII[17]] = lIllIIIIIIIIlI("CT8MKwYa", "HmAdS");
        lllIlIlIlll[lllIlIllIII[18]] = lIllIIIIIIIIIl("8OZqFXn4iV9t1QORWKhonA==", "tJxWb");
        lllIlIlIlll[lllIlIllIII[19]] = lIllIIIIIIIIll("VMX8TetVVgVp8yV3APyetA==", "bMtqM");
        lllIlIlIlll[lllIlIllIII[20]] = lIllIIIIIIIIIl("xWpQh32E/P8dbbfQGeCK5A==", "boMLY");
        lllIlIlIlll[lllIlIllIII[21]] = lIllIIIIIIIIIl("6JMivo5bgjIYRe8GFUPmzQ==", "zjAQq");
        lllIlIlIlll[lllIlIllIII[22]] = lIllIIIIIIIIlI("DjAUFxYLIBkeGwk2FQ==", "HeFYW");
    }

    @Override // java.lang.Enum
    public String toString() {
        String str = super.toString();
        return str.charAt(lllIlIllIII[0]) + str.replaceAll(lllIlIlIlll[lllIlIllIII[0]], lllIlIlIlll[lllIlIllIII[1]]).substring(lllIlIllIII[1]).toLowerCase();
    }

    private static void lIllIIIIIIIlIl() {
        lllIlIllIII = new int[24];
        lllIlIllIII[0] = ((66 ^ 27) ^ (77 ^ 116)) & (((15 ^ 23) ^ (118 ^ 14)) ^ (-" ".length()));
        lllIlIllIII[1] = " ".length();
        lllIlIllIII[2] = "  ".length();
        lllIlIllIII[3] = "   ".length();
        lllIlIllIII[4] = 129 ^ 133;
        lllIlIllIII[5] = 180 ^ 177;
        lllIlIllIII[6] = 164 ^ 162;
        lllIlIllIII[7] = 34 ^ 37;
        lllIlIllIII[8] = 107 ^ 99;
        lllIlIllIII[9] = (61 ^ 12) ^ (81 ^ 105);
        lllIlIllIII[10] = (214 ^ 146) ^ (124 ^ 50);
        lllIlIllIII[11] = 146 ^ 153;
        lllIlIllIII[12] = 164 ^ 168;
        lllIlIllIII[13] = (35 ^ 105) ^ (100 ^ 35);
        lllIlIllIII[14] = (159 ^ 160) ^ (110 ^ 95);
        lllIlIllIII[15] = (((160 + 152) - 185) + 40) ^ (((155 + 30) - 58) + 41);
        lllIlIllIII[16] = 187 ^ 171;
        lllIlIllIII[17] = (4 ^ 48) ^ (82 ^ 119);
        lllIlIllIII[18] = (((154 + 57) - 68) + 24) ^ (((125 + 164) - 154) + 46);
        lllIlIllIII[19] = 99 ^ 112;
        lllIlIllIII[20] = 18 ^ 6;
        lllIlIllIII[21] = (((104 + 27) - 124) + 126) ^ (((27 + 21) - 19) + 115);
        lllIlIllIII[22] = 94 ^ 72;
        lllIlIllIII[23] = 64 ^ 87;
    }

    static {
        lIllIIIIIIIlIl();
        lIllIIIIIIIlII();
        GEM_CUTTING = new EnumC0001b(lllIlIlIlll[lllIlIllIII[2]], lllIlIllIII[0]);
        BATTLESTAVES = new EnumC0001b(lllIlIlIlll[lllIlIllIII[3]], lllIlIllIII[1]);
        JEWELRY = new EnumC0001b(lllIlIlIlll[lllIlIllIII[4]], lllIlIllIII[2]);
        GLASS_BLOWING = new EnumC0001b(lllIlIlIlll[lllIlIllIII[5]], lllIlIllIII[3]);
        DARTS = new EnumC0001b(lllIlIlIlll[lllIlIllIII[6]], lllIlIllIII[4]);
        ARROWS = new EnumC0001b(lllIlIlIlll[lllIlIllIII[7]], lllIlIllIII[5]);
        FLETCH_CUTTING = new EnumC0001b(lllIlIlIlll[lllIlIllIII[8]], lllIlIllIII[6]);
        STRING_BOWS = new EnumC0001b(lllIlIlIlll[lllIlIllIII[9]], lllIlIllIII[7]);
        BOLTS = new EnumC0001b(lllIlIlIlll[lllIlIllIII[10]], lllIlIllIII[8]);
        COOKING = new EnumC0001b(lllIlIlIlll[lllIlIllIII[11]], lllIlIllIII[9]);
        WINES = new EnumC0001b(lllIlIlIlll[lllIlIllIII[12]], lllIlIllIII[10]);
        ALCHING = new EnumC0001b(lllIlIlIlll[lllIlIllIII[13]], lllIlIllIII[11]);
        GLASS_MAKE = new EnumC0001b(lllIlIlIlll[lllIlIllIII[14]], lllIlIllIII[12]);
        ENCHANTING = new EnumC0001b(lllIlIlIlll[lllIlIllIII[15]], lllIlIllIII[13]);
        SMITHING = new EnumC0001b(lllIlIlIlll[lllIlIllIII[16]], lllIlIllIII[14]);
        ARMOUR = new EnumC0001b(lllIlIlIlll[lllIlIllIII[17]], lllIlIllIII[15]);
        SMELTING = new EnumC0001b(lllIlIlIlll[lllIlIllIII[18]], lllIlIllIII[16]);
        CANNON_BALLS = new EnumC0001b(lllIlIlIlll[lllIlIllIII[19]], lllIlIllIII[17]);
        ENCHANT_BOLTS = new EnumC0001b(lllIlIlIlll[lllIlIllIII[20]], lllIlIllIII[18]);
        ZERO_TICK = new EnumC0001b(lllIlIlIlll[lllIlIllIII[21]], lllIlIllIII[19]);
        FURNACE_GLASS = new EnumC0001b(lllIlIlIlll[lllIlIllIII[22]], lllIlIllIII[20]);
        EnumC0001b[] enumC0001bArr = new EnumC0001b[lllIlIllIII[21]];
        enumC0001bArr[lllIlIllIII[0]] = GEM_CUTTING;
        enumC0001bArr[lllIlIllIII[1]] = BATTLESTAVES;
        enumC0001bArr[lllIlIllIII[2]] = JEWELRY;
        enumC0001bArr[lllIlIllIII[3]] = GLASS_BLOWING;
        enumC0001bArr[lllIlIllIII[4]] = DARTS;
        enumC0001bArr[lllIlIllIII[5]] = ARROWS;
        enumC0001bArr[lllIlIllIII[6]] = FLETCH_CUTTING;
        enumC0001bArr[lllIlIllIII[7]] = STRING_BOWS;
        enumC0001bArr[lllIlIllIII[8]] = BOLTS;
        enumC0001bArr[lllIlIllIII[9]] = COOKING;
        enumC0001bArr[lllIlIllIII[10]] = WINES;
        enumC0001bArr[lllIlIllIII[11]] = ALCHING;
        enumC0001bArr[lllIlIllIII[12]] = GLASS_MAKE;
        enumC0001bArr[lllIlIllIII[13]] = ENCHANTING;
        enumC0001bArr[lllIlIllIII[14]] = SMITHING;
        enumC0001bArr[lllIlIllIII[15]] = ARMOUR;
        enumC0001bArr[lllIlIllIII[16]] = SMELTING;
        enumC0001bArr[lllIlIllIII[17]] = CANNON_BALLS;
        enumC0001bArr[lllIlIllIII[18]] = ENCHANT_BOLTS;
        enumC0001bArr[lllIlIllIII[19]] = ZERO_TICK;
        enumC0001bArr[lllIlIllIII[20]] = FURNACE_GLASS;
        $VALUES = enumC0001bArr;
    }

    private static String lIllIIIIIIIIll(String llllllllllllllllIIlIIlIIIllIlIll, String llllllllllllllllIIlIIlIIIllIlIlI) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlIIIllIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlIIIllIlIlI.getBytes(StandardCharsets.UTF_8)), lllIlIllIII[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIlIllIII[2], llllllllllllllllIIlIIlIIIllIlllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlIIIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIlIIIllIllII) {
            llllllllllllllllIIlIIlIIIllIllII.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIIIIIIlI(String llllllllllllllllIIlIIlIIlIIIIIII, String llllllllllllllllIIlIIlIIIlllllll) {
        String llllllllllllllllIIlIIlIIlIIIIIII2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIlIIlIIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIIlIIIllllllI = new StringBuilder();
        char[] llllllllllllllllIIlIIlIIIlllllIl = llllllllllllllllIIlIIlIIIlllllll.toCharArray();
        int llllllllllllllllIIlIIlIIIlllllII = lllIlIllIII[0];
        char[] charArray = llllllllllllllllIIlIIlIIlIIIIIII2.toCharArray();
        int length = charArray.length;
        int i = lllIlIllIII[0];
        while (lIllIIIIIIIllI(i, length)) {
            char llllllllllllllllIIlIIlIIlIIIIIIl = charArray[i];
            llllllllllllllllIIlIIlIIIllllllI.append((char) (llllllllllllllllIIlIIlIIlIIIIIIl ^ llllllllllllllllIIlIIlIIIlllllIl[llllllllllllllllIIlIIlIIIlllllII % llllllllllllllllIIlIIlIIIlllllIl.length]));
            "".length();
            llllllllllllllllIIlIIlIIIlllllII++;
            i++;
            "".length();
            if ("  ".length() < (((((73 + 150) - 125) + 105) ^ (((170 + 65) - 163) + 99)) & (((((78 + 74) - (-21)) + 30) ^ (((119 + 30) - 48) + 70)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlIIlIIIllllllI);
    }

    public static EnumC0001b[] values() {
        return (EnumC0001b[]) $VALUES.clone();
    }

    private static boolean lIllIIIIIIIllI(int i, int i2) {
        return i < i2;
    }

    private EnumC0001b(String str, int i) {
    }
}
