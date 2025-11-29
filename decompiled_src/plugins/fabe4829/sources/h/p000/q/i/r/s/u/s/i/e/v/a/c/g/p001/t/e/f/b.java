package h.p000.q.i.r.s.u.s.i.e.v.a.c.g.p001.t.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.b  reason: invalid package */
/* loaded from: fabe4829-ed55-47a3-b654-ca361772d01e.jar:h/-/q/i/r/s/u/s/i/e/v/a/c/g/-/t/e/f/b.class */
public final class b {
    private static final /* synthetic */ b[] $VALUES;
    private final /* synthetic */ d prayerPriority;
    public static final /* synthetic */ b RANGER;
    public static final /* synthetic */ b JAD;
    public static final /* synthetic */ b MELEER;
    private final /* synthetic */ int[] npcID;
    private final /* synthetic */ int attackSpeedInTicks;
    private static /* synthetic */ String[] llIIIllIllIl;
    public static final /* synthetic */ b BLOB;
    public static final /* synthetic */ b HEALER;
    public static final /* synthetic */ b BAT;
    private final /* synthetic */ a attackStyle;
    private static /* synthetic */ int[] llIIIllIlllI;
    public static final /* synthetic */ b MAGER;
    public static final /* synthetic */ b SMALL_BLOB;
    private final /* synthetic */ String name;

    public int e() {
        return this.attackSpeedInTicks;
    }

    public a b() {
        return this.attackStyle;
    }

    private static boolean llllIllIlIlIII(int i, int i2) {
        return i == i2;
    }

    private static boolean llllIllIlIIllI(int i, int i2) {
        return i < i2;
    }

    public static b a(int i) {
        b[] values = values();
        int length = values.length;
        int i2 = llIIIllIlllI[0];
        while (llllIllIlIIllI(i2, length)) {
            b bVar = values[i2];
            if (llllIllIlIIlll(Arrays.stream(bVar.c()).anyMatch(i3 -> {
                if (llllIllIlIlIII(i3, i)) {
                    ?? r0 = llIIIllIlllI[1];
                    "".length();
                    return "  ".length() != "  ".length() ? ((195 ^ 191) ^ (27 ^ 35)) & (((138 ^ 185) ^ (103 ^ 16)) ^ (-" ".length())) : r0;
                }
                return llIIIllIlllI[0];
            }) ? 1 : 0)) {
                return bVar;
            }
            i2++;
            "".length();
            if ((99 ^ 103) <= 0) {
                return null;
            }
        }
        return null;
    }

    public String d() {
        return this.name;
    }

    private static void llllIllIlIIlIl() {
        llIIIllIlllI = new int[17];
        llIIIllIlllI[0] = ((148 ^ 129) ^ (83 ^ 10)) & (((18 ^ 103) ^ (27 ^ 34)) ^ (-" ".length()));
        llIIIllIlllI[1] = " ".length();
        llIIIllIlllI[2] = 116 ^ 112;
        llIIIllIlllI[3] = "  ".length();
        llIIIllIlllI[4] = "   ".length();
        llIIIllIlllI[5] = (82 ^ 70) ^ (43 ^ 58);
        llIIIllIlllI[6] = (216 ^ 147) ^ (12 ^ 65);
        llIIIllIlllI[7] = 122 ^ 125;
        llIIIllIlllI[8] = (((49 + 174) - 165) + 125) ^ (((158 + 100) - 205) + 138);
        llIIIllIlllI[9] = 1 ^ 8;
        llIIIllIlllI[10] = (0 ^ 84) ^ (44 ^ 114);
        llIIIllIlllI[11] = 151 ^ 156;
        llIIIllIlllI[12] = 176 ^ 188;
        llIIIllIlllI[13] = 207 ^ 194;
        llIIIllIlllI[14] = (((82 + 22) - 30) + 59) ^ (((79 + 52) - 68) + 76);
        llIIIllIlllI[15] = 50 ^ 61;
        llIIIllIlllI[16] = 105 ^ 121;
    }

    private static String llllIllIlIIIIl(String lllllllllllllllIlIlIIIllIIIlIIIl, String lllllllllllllllIlIlIIIllIIIlIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIllIIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIllIlllI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIllIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIIllIIIlIIlI) {
            lllllllllllllllIlIlIIIllIIIlIIlI.printStackTrace();
            return null;
        }
    }

    private static String llllIllIlIIIlI(String lllllllllllllllIlIlIIIllIIllIIll, String lllllllllllllllIlIlIIIllIIlIllIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIIllIIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIIIllIIllIIIl = new StringBuilder();
        char[] lllllllllllllllIlIlIIIllIIllIIII = lllllllllllllllIlIlIIIllIIlIllIl.toCharArray();
        int lllllllllllllllIlIlIIIllIIlIllll = llIIIllIlllI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIIllIlllI[0];
        while (llllIllIlIIllI(i, length)) {
            lllllllllllllllIlIlIIIllIIllIIIl.append((char) (charArray[i] ^ lllllllllllllllIlIlIIIllIIllIIII[lllllllllllllllIlIlIIIllIIlIllll % lllllllllllllllIlIlIIIllIIllIIII.length]));
            "".length();
            lllllllllllllllIlIlIIIllIIlIllll++;
            i++;
            "".length();
            if ((-(30 ^ 26)) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlIIIllIIllIIIl);
    }

    public d f() {
        return this.prayerPriority;
    }

    private static boolean llllIllIlIIlll(int i) {
        return i != 0;
    }

    private b(String str, int i, int[] iArr, String str2, int i2, d dVar, a aVar) {
        this.npcID = iArr;
        this.name = str2;
        this.attackSpeedInTicks = i2;
        this.prayerPriority = dVar;
        this.attackStyle = aVar;
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    private static String llllIllIlIIIll(String lllllllllllllllIlIlIIIllIIIllllI, String lllllllllllllllIlIlIIIllIIIlllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIllIIIlllIl.getBytes(StandardCharsets.UTF_8)), llIIIllIlllI[8]), "DES");
            Cipher lllllllllllllllIlIlIIIllIIlIIIII = Cipher.getInstance("DES");
            lllllllllllllllIlIlIIIllIIlIIIII.init(llIIIllIlllI[3], secretKeySpec);
            return new String(lllllllllllllllIlIlIIIllIIlIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIllIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIIllIIIlllll) {
            lllllllllllllllIlIlIIIllIIIlllll.printStackTrace();
            return null;
        }
    }

    private static void llllIllIlIIlII() {
        llIIIllIllIl = new String[llIIIllIlllI[16]];
        llIIIllIllIl[llIIIllIlllI[0]] = llllIllIlIIIIl("wJydnQoCbeM=", "MIxih");
        llIIIllIllIl[llIIIllIlllI[1]] = llllIllIlIIIlI("Nz57HRoL", "cDVVs");
        llIIIllIllIl[llIIIllIlllI[3]] = llllIllIlIIIIl("Rsn0wT3JWjU=", "whlqP");
        llIIIllIllIl[llIIIllIlllI[4]] = llllIllIlIIIll("ob0vIL+WMgg=", "XgkRO");
        llIIIllIllIl[llIIIllIlllI[2]] = llllIllIlIIIll("aUvJBfy7TNy4ZVJ1qd21vQ==", "hNwtr");
        llIIIllIllIl[llIIIllIlllI[5]] = llllIllIlIIIlI("Jh9GJTYZ", "reknS");
        llIIIllIllIl[llIIIllIlllI[6]] = llllIllIlIIIIl("PDd17H/u4a0=", "DNTZp");
        llIIIllIllIl[llIIIllIlllI[7]] = llllIllIlIIIll("3ZaGNf4rdro=", "Xczdy");
        llIIIllIllIl[llIIIllIlllI[8]] = llllIllIlIIIIl("8u+ybFxBEYE=", "LTahW");
        llIIIllIllIl[llIIIllIlllI[9]] = llllIllIlIIIlI("PT1MLCMOAg4V", "dIaaF");
        llIIIllIllIl[llIIIllIlllI[10]] = llllIllIlIIIlI("OxQoHSc=", "vUoXu");
        llIIIllIllIl[llIIIllIlllI[11]] = llllIllIlIIIll("BdXH0dfqDvY=", "DQWfr");
        llIIIllIllIl[llIIIllIlllI[12]] = llllIllIlIIIlI("Lik+", "dhzDY");
        llIIIllIllIl[llIIIllIlllI[13]] = llllIllIlIIIll("U7h+uVszXEHv1qJ1nQGtgw==", "UbWlD");
        llIIIllIllIl[llIIIllIlllI[14]] = llllIllIlIIIlI("Bw8UJQgd", "OJUiM");
        llIIIllIllIl[llIIIllIlllI[15]] = llllIllIlIIIlI("FzdFGgA8CAcm", "NChRu");
    }

    public int[] c() {
        return this.npcID;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    static {
        llllIllIlIIlIl();
        llllIllIlIIlII();
        BAT = new b(llIIIllIllIl[llIIIllIlllI[0]], llIIIllIlllI[0], c.p, llIIIllIllIl[llIIIllIlllI[1]], llIIIllIlllI[2], d.VERY_LOW, a.MELEE);
        BLOB = new b(llIIIllIllIl[llIIIllIlllI[3]], llIIIllIlllI[1], c.q, llIIIllIllIl[llIIIllIlllI[4]], llIIIllIlllI[2], d.LOW, a.MELEE);
        SMALL_BLOB = new b(llIIIllIllIl[llIIIllIlllI[2]], llIIIllIlllI[3], c.r, llIIIllIllIl[llIIIllIlllI[5]], llIIIllIlllI[2], d.VERY_LOW, a.MELEE);
        RANGER = new b(llIIIllIllIl[llIIIllIlllI[6]], llIIIllIlllI[4], c.s, llIIIllIllIl[llIIIllIlllI[7]], llIIIllIlllI[2], d.HIGH, a.RANGED);
        MELEER = new b(llIIIllIllIl[llIIIllIlllI[8]], llIIIllIlllI[2], c.t, llIIIllIllIl[llIIIllIlllI[9]], llIIIllIlllI[2], d.MEDIUM, a.MELEE);
        MAGER = new b(llIIIllIllIl[llIIIllIlllI[10]], llIIIllIlllI[5], c.u, llIIIllIllIl[llIIIllIlllI[11]], llIIIllIlllI[2], d.VERY_HIGH, a.MAGIC);
        JAD = new b(llIIIllIllIl[llIIIllIlllI[12]], llIIIllIlllI[6], c.v, llIIIllIllIl[llIIIllIlllI[13]], llIIIllIlllI[8], d.VERY_HIGH, a.MIXED);
        HEALER = new b(llIIIllIllIl[llIIIllIlllI[14]], llIIIllIlllI[7], c.w, llIIIllIllIl[llIIIllIlllI[15]], llIIIllIlllI[2], d.VERY_LOW, a.MELEE);
        b[] bVarArr = new b[llIIIllIlllI[8]];
        bVarArr[llIIIllIlllI[0]] = BAT;
        bVarArr[llIIIllIlllI[1]] = BLOB;
        bVarArr[llIIIllIlllI[3]] = SMALL_BLOB;
        bVarArr[llIIIllIlllI[4]] = RANGER;
        bVarArr[llIIIllIlllI[2]] = MELEER;
        bVarArr[llIIIllIlllI[5]] = MAGER;
        bVarArr[llIIIllIlllI[6]] = JAD;
        bVarArr[llIIIllIlllI[7]] = HEALER;
        $VALUES = bVarArr;
    }
}
