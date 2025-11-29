/*
 * Decompiled with CFR 0.152.
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class b
extends Enum<b> {
    public static final /* synthetic */ /* enum */ b FLETCH_CUTTING;
    public static final /* synthetic */ /* enum */ b JEWELRY;
    public static final /* synthetic */ /* enum */ b SMELTING;
    public static final /* synthetic */ /* enum */ b GLASS_MAKE;
    public static final /* synthetic */ /* enum */ b BOLTS;
    public static final /* synthetic */ /* enum */ b ARROWS;
    public static final /* synthetic */ /* enum */ b ZERO_TICK;
    public static final /* synthetic */ /* enum */ b CANNON_BALLS;
    public static final /* synthetic */ /* enum */ b COOKING;
    public static final /* synthetic */ /* enum */ b ENCHANT_BOLTS;
    public static final /* synthetic */ /* enum */ b DARTS;
    public static final /* synthetic */ /* enum */ b SMITHING;
    public static final /* synthetic */ /* enum */ b ALCHING;
    private static /* synthetic */ int[] lllIlIllIII;
    public static final /* synthetic */ /* enum */ b STRING_BOWS;
    public static final /* synthetic */ /* enum */ b ENCHANTING;
    public static final /* synthetic */ /* enum */ b WINES;
    public static final /* synthetic */ /* enum */ b ARMOUR;
    public static final /* synthetic */ /* enum */ b FURNACE_GLASS;
    private static final /* synthetic */ b[] $VALUES;
    public static final /* synthetic */ /* enum */ b BATTLESTAVES;
    public static final /* synthetic */ /* enum */ b GEM_CUTTING;
    private static /* synthetic */ String[] lllIlIlIlll;
    public static final /* synthetic */ /* enum */ b GLASS_BLOWING;

    private static String lIllIIIIIIIIIl(String llllllllllllllllIIlIIlIIlIIIlllI, String llllllllllllllllIIlIIlIIlIIIllll) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlIIlIIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlIIlIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIlIIlIIlIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIlIIlIIlIIlI.init(lllIlIllIII[2], llllllllllllllllIIlIIlIIlIIlIIll);
            return new String(llllllllllllllllIIlIIlIIlIIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlIIlIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIlIIlIIlIIIl) {
            llllllllllllllllIIlIIlIIlIIlIIIl.printStackTrace();
            return null;
        }
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    private static void lIllIIIIIIIlII() {
        lllIlIlIlll = new String[lllIlIllIII[23]];
        b.lllIlIlIlll[b.lllIlIllIII[0]] = b.lIllIIIIIIIIIl("AAh0+4yc1gE=", "dmYlR");
        b.lllIlIlIlll[b.lllIlIllIII[1]] = b.lIllIIIIIIIIlI("aA==", "HhjZp");
        b.lllIlIlIlll[b.lllIlIllIII[2]] = b.lIllIIIIIIIIll("5iQwbYtDA6NNv1ThlJTKiQ==", "TTeQG");
        b.lllIlIlIlll[b.lllIlIllIII[3]] = b.lIllIIIIIIIIIl("G9Esgg6onX8Yh0tB/Raw7g==", "osOun");
        b.lllIlIlIlll[b.lllIlIllIII[4]] = b.lIllIIIIIIIIlI("IzUTIDU7KQ==", "ipDey");
        b.lllIlIlIlll[b.lllIlIllIII[5]] = b.lIllIIIIIIIIIl("4liOhe0pSw0zNmrWFVZN/g==", "mjslO");
        b.lllIlIlIlll[b.lllIlIllIII[6]] = b.lIllIIIIIIIIlI("Ag8HDAM=", "FNUXP");
        b.lllIlIlIlll[b.lllIlIllIII[7]] = b.lIllIIIIIIIIll("AnV4BELWMTE=", "DirHT");
        b.lllIlIlIlll[b.lllIlIllIII[8]] = b.lIllIIIIIIIIIl("vqJr9ciO/ng6ijZaUPNvpg==", "qpAPp");
        b.lllIlIlIlll[b.lllIlIllIII[9]] = b.lIllIIIIIIIIlI("NCYUITsgLQQnIjQ=", "grFhu");
        b.lllIlIlIlll[b.lllIlIllIII[10]] = b.lIllIIIIIIIIIl("Fgnqx0L4FLc=", "MYJee");
        b.lllIlIlIlll[b.lllIlIllIII[11]] = b.lIllIIIIIIIIIl("6krxTteyUWI=", "ugvvr");
        b.lllIlIlIlll[b.lllIlIllIII[12]] = b.lIllIIIIIIIIll("TXf8JeisFvQ=", "GObNj");
        b.lllIlIlIlll[b.lllIlIllIII[13]] = b.lIllIIIIIIIIll("Iri1ZIHj8W8=", "ndxDP");
        b.lllIlIlIlll[b.lllIlIllIII[14]] = b.lIllIIIIIIIIll("JTCbmapeOsphLE1mgqiFpA==", "cWfQs");
        b.lllIlIlIlll[b.lllIlIllIII[15]] = b.lIllIIIIIIIIIl("fnZrs4poHQFQuUQEOzR1HQ==", "NZeHx");
        b.lllIlIlIlll[b.lllIlIllIII[16]] = b.lIllIIIIIIIIlI("Pj8/EhokPDE=", "mrvFR");
        b.lllIlIlIlll[b.lllIlIllIII[17]] = b.lIllIIIIIIIIlI("CT8MKwYa", "HmAdS");
        b.lllIlIlIlll[b.lllIlIllIII[18]] = b.lIllIIIIIIIIIl("8OZqFXn4iV9t1QORWKhonA==", "tJxWb");
        b.lllIlIlIlll[b.lllIlIllIII[19]] = b.lIllIIIIIIIIll("VMX8TetVVgVp8yV3APyetA==", "bMtqM");
        b.lllIlIlIlll[b.lllIlIllIII[20]] = b.lIllIIIIIIIIIl("xWpQh32E/P8dbbfQGeCK5A==", "boMLY");
        b.lllIlIlIlll[b.lllIlIllIII[21]] = b.lIllIIIIIIIIIl("6JMivo5bgjIYRe8GFUPmzQ==", "zjAQq");
        b.lllIlIlIlll[b.lllIlIllIII[22]] = b.lIllIIIIIIIIlI("DjAUFxYLIBkeGwk2FQ==", "HeFYW");
    }

    public String toString() {
        String string = super.toString();
        char c2 = string.charAt(lllIlIllIII[0]);
        return c2 + string.replaceAll(lllIlIlIlll[lllIlIllIII[0]], lllIlIlIlll[lllIlIllIII[1]]).substring(lllIlIllIII[1]).toLowerCase();
    }

    private static void lIllIIIIIIIlIl() {
        lllIlIllIII = new int[24];
        b.lllIlIllIII[0] = (0x42 ^ 0x1B ^ (0x4D ^ 0x74)) & (0xF ^ 0x17 ^ (0x76 ^ 0xE) ^ -" ".length());
        b.lllIlIllIII[1] = " ".length();
        b.lllIlIllIII[2] = "  ".length();
        b.lllIlIllIII[3] = "   ".length();
        b.lllIlIllIII[4] = 0x81 ^ 0x85;
        b.lllIlIllIII[5] = 0xB4 ^ 0xB1;
        b.lllIlIllIII[6] = 0xA4 ^ 0xA2;
        b.lllIlIllIII[7] = 0x22 ^ 0x25;
        b.lllIlIllIII[8] = 0x6B ^ 0x63;
        b.lllIlIllIII[9] = 0x3D ^ 0xC ^ (0x51 ^ 0x69);
        b.lllIlIllIII[10] = 0xD6 ^ 0x92 ^ (0x7C ^ 0x32);
        b.lllIlIllIII[11] = 0x92 ^ 0x99;
        b.lllIlIllIII[12] = 0xA4 ^ 0xA8;
        b.lllIlIllIII[13] = 0x23 ^ 0x69 ^ (0x64 ^ 0x23);
        b.lllIlIllIII[14] = 0x9F ^ 0xA0 ^ (0x6E ^ 0x5F);
        b.lllIlIllIII[15] = 160 + 152 - 185 + 40 ^ 155 + 30 - 58 + 41;
        b.lllIlIllIII[16] = 0xBB ^ 0xAB;
        b.lllIlIllIII[17] = 4 ^ 0x30 ^ (0x52 ^ 0x77);
        b.lllIlIllIII[18] = 154 + 57 - 68 + 24 ^ 125 + 164 - 154 + 46;
        b.lllIlIllIII[19] = 0x63 ^ 0x70;
        b.lllIlIllIII[20] = 0x12 ^ 6;
        b.lllIlIllIII[21] = 104 + 27 - 124 + 126 ^ 27 + 21 - 19 + 115;
        b.lllIlIllIII[22] = 0x5E ^ 0x48;
        b.lllIlIllIII[23] = 0x40 ^ 0x57;
    }

    static {
        b.lIllIIIIIIIlIl();
        b.lIllIIIIIIIlII();
        GEM_CUTTING = new b();
        BATTLESTAVES = new b();
        JEWELRY = new b();
        GLASS_BLOWING = new b();
        DARTS = new b();
        ARROWS = new b();
        FLETCH_CUTTING = new b();
        STRING_BOWS = new b();
        BOLTS = new b();
        COOKING = new b();
        WINES = new b();
        ALCHING = new b();
        GLASS_MAKE = new b();
        ENCHANTING = new b();
        SMITHING = new b();
        ARMOUR = new b();
        SMELTING = new b();
        CANNON_BALLS = new b();
        ENCHANT_BOLTS = new b();
        ZERO_TICK = new b();
        FURNACE_GLASS = new b();
        b[] bArray = new b[lllIlIllIII[21]];
        bArray[b.lllIlIllIII[0]] = GEM_CUTTING;
        bArray[b.lllIlIllIII[1]] = BATTLESTAVES;
        bArray[b.lllIlIllIII[2]] = JEWELRY;
        bArray[b.lllIlIllIII[3]] = GLASS_BLOWING;
        bArray[b.lllIlIllIII[4]] = DARTS;
        bArray[b.lllIlIllIII[5]] = ARROWS;
        bArray[b.lllIlIllIII[6]] = FLETCH_CUTTING;
        bArray[b.lllIlIllIII[7]] = STRING_BOWS;
        bArray[b.lllIlIllIII[8]] = BOLTS;
        bArray[b.lllIlIllIII[9]] = COOKING;
        bArray[b.lllIlIllIII[10]] = WINES;
        bArray[b.lllIlIllIII[11]] = ALCHING;
        bArray[b.lllIlIllIII[12]] = GLASS_MAKE;
        bArray[b.lllIlIllIII[13]] = ENCHANTING;
        bArray[b.lllIlIllIII[14]] = SMITHING;
        bArray[b.lllIlIllIII[15]] = ARMOUR;
        bArray[b.lllIlIllIII[16]] = SMELTING;
        bArray[b.lllIlIllIII[17]] = CANNON_BALLS;
        bArray[b.lllIlIllIII[18]] = ENCHANT_BOLTS;
        bArray[b.lllIlIllIII[19]] = ZERO_TICK;
        bArray[b.lllIlIllIII[20]] = FURNACE_GLASS;
        $VALUES = bArray;
    }

    private static String lIllIIIIIIIIll(String llllllllllllllllIIlIIlIIIllIlIll, String llllllllllllllllIIlIIlIIIllIlIII) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlIIIllIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlIIIllIlIII.getBytes(StandardCharsets.UTF_8)), lllIlIllIII[8]), "DES");
            Cipher llllllllllllllllIIlIIlIIIllIllIl = Cipher.getInstance("DES");
            llllllllllllllllIIlIIlIIIllIllIl.init(lllIlIllIII[2], llllllllllllllllIIlIIlIIIllIlllI);
            return new String(llllllllllllllllIIlIIlIIIllIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlIIIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIlIIIllIllII) {
            llllllllllllllllIIlIIlIIIllIllII.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIIIIIIlI(String llllllllllllllllIIlIIlIIIllllIll, String llllllllllllllllIIlIIlIIIllllIlI) {
        llllllllllllllllIIlIIlIIIllllIll = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIlIIIllllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIIlIIIllllllI = new StringBuilder();
        char[] llllllllllllllllIIlIIlIIIlllllIl = llllllllllllllllIIlIIlIIIllllIlI.toCharArray();
        int llllllllllllllllIIlIIlIIIlllllII = lllIlIllIII[0];
        char[] llllllllllllllllIIlIIlIIIlllIllI = llllllllllllllllIIlIIlIIIllllIll.toCharArray();
        int llllllllllllllllIIlIIlIIIlllIlIl = llllllllllllllllIIlIIlIIIlllIllI.length;
        int llllllllllllllllIIlIIlIIIlllIlII = lllIlIllIII[0];
        while (b.lIllIIIIIIIllI(llllllllllllllllIIlIIlIIIlllIlII, llllllllllllllllIIlIIlIIIlllIlIl)) {
            char llllllllllllllllIIlIIlIIlIIIIIIl = llllllllllllllllIIlIIlIIIlllIllI[llllllllllllllllIIlIIlIIIlllIlII];
            llllllllllllllllIIlIIlIIIllllllI.append((char)(llllllllllllllllIIlIIlIIlIIIIIIl ^ llllllllllllllllIIlIIlIIIlllllIl[llllllllllllllllIIlIIlIIIlllllII % llllllllllllllllIIlIIlIIIlllllIl.length]));
            "".length();
            ++llllllllllllllllIIlIIlIIIlllllII;
            ++llllllllllllllllIIlIIlIIIlllIlII;
            "".length();
            if ("  ".length() >= ((73 + 150 - 125 + 105 ^ 170 + 65 - 163 + 99) & (78 + 74 - -21 + 30 ^ 119 + 30 - 48 + 70 ^ -" ".length()))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIIlIIIllllllI);
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    private static boolean lIllIIIIIIIllI(int n2, int n3) {
        return n2 < n3;
    }
}

