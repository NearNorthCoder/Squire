/*
 * Decompiled with CFR 0.152.
 */
package h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f;

import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.a;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.c;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.d;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class b
extends Enum<b> {
    private static final /* synthetic */ b[] $VALUES;
    private final /* synthetic */ d prayerPriority;
    public static final /* synthetic */ /* enum */ b RANGER;
    public static final /* synthetic */ /* enum */ b JAD;
    public static final /* synthetic */ /* enum */ b MELEER;
    private final /* synthetic */ int[] npcID;
    private final /* synthetic */ int attackSpeedInTicks;
    private static /* synthetic */ String[] llIIIllIllIl;
    public static final /* synthetic */ /* enum */ b BLOB;
    public static final /* synthetic */ /* enum */ b HEALER;
    public static final /* synthetic */ /* enum */ b BAT;
    private final /* synthetic */ a attackStyle;
    private static /* synthetic */ int[] llIIIllIlllI;
    public static final /* synthetic */ /* enum */ b MAGER;
    public static final /* synthetic */ /* enum */ b SMALL_BLOB;
    private final /* synthetic */ String name;

    public int e() {
        return this.attackSpeedInTicks;
    }

    public a b() {
        return this.attackStyle;
    }

    private static boolean llllIllIlIlIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllIllIlIIllI(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public static b a(int n2) {
        void lllllllllllllllIlIlIIIllIlIIIlII;
        b[] bArray = b.values();
        int n4 = bArray.length;
        int lllllllllllllllIlIlIIIllIlIIIIll = llIIIllIlllI[0];
        while (b.llllIllIlIIllI(lllllllllllllllIlIlIIIllIlIIIIll, (int)lllllllllllllllIlIlIIIllIlIIIlII)) {
            int lllllllllllllllIlIlIIIllIlIIIllI;
            void lllllllllllllllIlIlIIIllIlIIIlIl;
            void lllllllllllllllIlIlIIIllIlIIIIlI = lllllllllllllllIlIlIIIllIlIIIlIl[lllllllllllllllIlIlIIIllIlIIIIll];
            if (b.llllIllIlIIlll(Arrays.stream(lllllllllllllllIlIlIIIllIlIIIIlI.c()).anyMatch(n3 -> {
                boolean bl;
                if (b.llllIllIlIlIII(n3, lllllllllllllllIlIlIIIllIlIIIllI)) {
                    bl = llIIIllIlllI[1];
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return ((0xC3 ^ 0xBF ^ (0x1B ^ 0x23)) & (0x8A ^ 0xB9 ^ (0x67 ^ 0x10) ^ -" ".length())) != 0;
                    }
                } else {
                    bl = llIIIllIlllI[0];
                }
                return bl;
            }) ? 1 : 0)) {
                return lllllllllllllllIlIlIIIllIlIIIIlI;
            }
            ++lllllllllllllllIlIlIIIllIlIIIIll;
            "".length();
            if ((0x63 ^ 0x67) > 0) continue;
            return null;
        }
        return null;
    }

    public String d() {
        return this.name;
    }

    private static void llllIllIlIIlIl() {
        llIIIllIlllI = new int[17];
        b.llIIIllIlllI[0] = (0x94 ^ 0x81 ^ (0x53 ^ 0xA)) & (0x12 ^ 0x67 ^ (0x1B ^ 0x22) ^ -" ".length());
        b.llIIIllIlllI[1] = " ".length();
        b.llIIIllIlllI[2] = 0x74 ^ 0x70;
        b.llIIIllIlllI[3] = "  ".length();
        b.llIIIllIlllI[4] = "   ".length();
        b.llIIIllIlllI[5] = 0x52 ^ 0x46 ^ (0x2B ^ 0x3A);
        b.llIIIllIlllI[6] = 0xD8 ^ 0x93 ^ (0xC ^ 0x41);
        b.llIIIllIlllI[7] = 0x7A ^ 0x7D;
        b.llIIIllIlllI[8] = 49 + 174 - 165 + 125 ^ 158 + 100 - 205 + 138;
        b.llIIIllIlllI[9] = 1 ^ 8;
        b.llIIIllIlllI[10] = 0 ^ 0x54 ^ (0x2C ^ 0x72);
        b.llIIIllIlllI[11] = 0x97 ^ 0x9C;
        b.llIIIllIlllI[12] = 0xB0 ^ 0xBC;
        b.llIIIllIlllI[13] = 0xCF ^ 0xC2;
        b.llIIIllIlllI[14] = 82 + 22 - 30 + 59 ^ 79 + 52 - 68 + 76;
        b.llIIIllIlllI[15] = 0x32 ^ 0x3D;
        b.llIIIllIlllI[16] = 0x69 ^ 0x79;
    }

    private static String llllIllIlIIIIl(String lllllllllllllllIlIlIIIllIIIIllll, String lllllllllllllllIlIlIIIllIIIIlllI) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIllIIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIllIIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIIIllIIIlIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIIllIIIlIIll.init(llIIIllIlllI[3], lllllllllllllllIlIlIIIllIIIlIlII);
            return new String(lllllllllllllllIlIlIIIllIIIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIllIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIIIllIIIlIIlI) {
            lllllllllllllllIlIlIIIllIIIlIIlI.printStackTrace();
            return null;
        }
    }

    private static String llllIllIlIIIlI(String lllllllllllllllIlIlIIIllIIllIIll, String lllllllllllllllIlIlIIIllIIllIIlI) {
        lllllllllllllllIlIlIIIllIIllIIll = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIIllIIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIIIllIIllIIIl = new StringBuilder();
        char[] lllllllllllllllIlIlIIIllIIllIIII = lllllllllllllllIlIlIIIllIIllIIlI.toCharArray();
        int lllllllllllllllIlIlIIIllIIlIllll = llIIIllIlllI[0];
        char[] lllllllllllllllIlIlIIIllIIlIlIIl = lllllllllllllllIlIlIIIllIIllIIll.toCharArray();
        int lllllllllllllllIlIlIIIllIIlIlIII = lllllllllllllllIlIlIIIllIIlIlIIl.length;
        int lllllllllllllllIlIlIIIllIIlIIlll = llIIIllIlllI[0];
        while (b.llllIllIlIIllI(lllllllllllllllIlIlIIIllIIlIIlll, lllllllllllllllIlIlIIIllIIlIlIII)) {
            char lllllllllllllllIlIlIIIllIIllIlII = lllllllllllllllIlIlIIIllIIlIlIIl[lllllllllllllllIlIlIIIllIIlIIlll];
            lllllllllllllllIlIlIIIllIIllIIIl.append((char)(lllllllllllllllIlIlIIIllIIllIlII ^ lllllllllllllllIlIlIIIllIIllIIII[lllllllllllllllIlIlIIIllIIlIllll % lllllllllllllllIlIlIIIllIIllIIII.length]));
            "".length();
            ++lllllllllllllllIlIlIIIllIIlIllll;
            ++lllllllllllllllIlIlIIIllIIlIIlll;
            "".length();
            if (-(0x1E ^ 0x1A) <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlIIIllIIllIIIl);
    }

    public d f() {
        return this.prayerPriority;
    }

    private static boolean llllIllIlIIlll(int n2) {
        return n2 != 0;
    }

    private b(int[] nArray, String string2, int n3, d d2, a a2) {
        this.npcID = nArray;
        this.name = string2;
        this.attackSpeedInTicks = n3;
        this.prayerPriority = d2;
        this.attackStyle = a2;
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    private static String llllIllIlIIIll(String lllllllllllllllIlIlIIIllIIIllllI, String lllllllllllllllIlIlIIIllIIIlllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIllIIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIllIIIlllIl.getBytes(StandardCharsets.UTF_8)), llIIIllIlllI[8]), "DES");
            Cipher lllllllllllllllIlIlIIIllIIlIIIII = Cipher.getInstance("DES");
            lllllllllllllllIlIlIIIllIIlIIIII.init(llIIIllIlllI[3], lllllllllllllllIlIlIIIllIIlIIIIl);
            return new String(lllllllllllllllIlIlIIIllIIlIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIllIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIIIllIIIlllll) {
            lllllllllllllllIlIlIIIllIIIlllll.printStackTrace();
            return null;
        }
    }

    private static void llllIllIlIIlII() {
        llIIIllIllIl = new String[llIIIllIlllI[16]];
        b.llIIIllIllIl[b.llIIIllIlllI[0]] = b.llllIllIlIIIIl("wJydnQoCbeM=", "MIxih");
        b.llIIIllIllIl[b.llIIIllIlllI[1]] = b.llllIllIlIIIlI("Nz57HRoL", "cDVVs");
        b.llIIIllIllIl[b.llIIIllIlllI[3]] = b.llllIllIlIIIIl("Rsn0wT3JWjU=", "whlqP");
        b.llIIIllIllIl[b.llIIIllIlllI[4]] = b.llllIllIlIIIll("ob0vIL+WMgg=", "XgkRO");
        b.llIIIllIllIl[b.llIIIllIlllI[2]] = b.llllIllIlIIIll("aUvJBfy7TNy4ZVJ1qd21vQ==", "hNwtr");
        b.llIIIllIllIl[b.llIIIllIlllI[5]] = b.llllIllIlIIIlI("Jh9GJTYZ", "reknS");
        b.llIIIllIllIl[b.llIIIllIlllI[6]] = b.llllIllIlIIIIl("PDd17H/u4a0=", "DNTZp");
        b.llIIIllIllIl[b.llIIIllIlllI[7]] = b.llllIllIlIIIll("3ZaGNf4rdro=", "Xczdy");
        b.llIIIllIllIl[b.llIIIllIlllI[8]] = b.llllIllIlIIIIl("8u+ybFxBEYE=", "LTahW");
        b.llIIIllIllIl[b.llIIIllIlllI[9]] = b.llllIllIlIIIlI("PT1MLCMOAg4V", "dIaaF");
        b.llIIIllIllIl[b.llIIIllIlllI[10]] = b.llllIllIlIIIlI("OxQoHSc=", "vUoXu");
        b.llIIIllIllIl[b.llIIIllIlllI[11]] = b.llllIllIlIIIll("BdXH0dfqDvY=", "DQWfr");
        b.llIIIllIllIl[b.llIIIllIlllI[12]] = b.llllIllIlIIIlI("Lik+", "dhzDY");
        b.llIIIllIllIl[b.llIIIllIlllI[13]] = b.llllIllIlIIIll("U7h+uVszXEHv1qJ1nQGtgw==", "UbWlD");
        b.llIIIllIllIl[b.llIIIllIlllI[14]] = b.llllIllIlIIIlI("Bw8UJQgd", "OJUiM");
        b.llIIIllIllIl[b.llIIIllIlllI[15]] = b.llllIllIlIIIlI("FzdFGgA8CAcm", "NChRu");
    }

    public int[] c() {
        return this.npcID;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    static {
        b.llllIllIlIIlIl();
        b.llllIllIlIIlII();
        BAT = new b(c.p, llIIIllIllIl[llIIIllIlllI[1]], llIIIllIlllI[2], d.VERY_LOW, a.MELEE);
        BLOB = new b(c.q, llIIIllIllIl[llIIIllIlllI[4]], llIIIllIlllI[2], d.LOW, a.MELEE);
        SMALL_BLOB = new b(c.r, llIIIllIllIl[llIIIllIlllI[5]], llIIIllIlllI[2], d.VERY_LOW, a.MELEE);
        RANGER = new b(c.s, llIIIllIllIl[llIIIllIlllI[7]], llIIIllIlllI[2], d.HIGH, a.RANGED);
        MELEER = new b(c.t, llIIIllIllIl[llIIIllIlllI[9]], llIIIllIlllI[2], d.MEDIUM, a.MELEE);
        MAGER = new b(c.u, llIIIllIllIl[llIIIllIlllI[11]], llIIIllIlllI[2], d.VERY_HIGH, a.MAGIC);
        JAD = new b(c.v, llIIIllIllIl[llIIIllIlllI[13]], llIIIllIlllI[8], d.VERY_HIGH, a.MIXED);
        HEALER = new b(c.w, llIIIllIllIl[llIIIllIlllI[15]], llIIIllIlllI[2], d.VERY_LOW, a.MELEE);
        b[] bArray = new b[llIIIllIlllI[8]];
        bArray[b.llIIIllIlllI[0]] = BAT;
        bArray[b.llIIIllIlllI[1]] = BLOB;
        bArray[b.llIIIllIlllI[3]] = SMALL_BLOB;
        bArray[b.llIIIllIlllI[4]] = RANGER;
        bArray[b.llIIIllIlllI[2]] = MELEER;
        bArray[b.llIIIllIlllI[5]] = MAGER;
        bArray[b.llIIIllIlllI[6]] = JAD;
        bArray[b.llIIIllIlllI[7]] = HEALER;
        $VALUES = bArray;
    }
}

