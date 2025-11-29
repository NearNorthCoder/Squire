package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/N.class */
public final class N {
    private final /* synthetic */ String name;
    public static final /* synthetic */ N SCAVENGERS;
    public static final /* synthetic */ N TEKTON;
    public static final /* synthetic */ N MUTTADILES;
    public static final /* synthetic */ int ROOM_MAX_SIZE;
    public static final /* synthetic */ N SHAMANS;
    public static final /* synthetic */ N TIGHTROPE;
    public static final /* synthetic */ N THIEVING;
    private static /* synthetic */ String[] lIlIlIIIIlll;
    public static final /* synthetic */ N VESPULA;
    public static final /* synthetic */ N EMPTY;
    public static final /* synthetic */ N GUARDIANS;
    public static final /* synthetic */ N VASA;
    public static final /* synthetic */ N END;
    public static final /* synthetic */ N CRABS;
    public static final /* synthetic */ N MYSTICS;
    private final /* synthetic */ P type;
    public static final /* synthetic */ N ICE_DEMON;
    public static final /* synthetic */ N UNKNOWN_COMBAT;
    public static final /* synthetic */ N FARMING;
    public static final /* synthetic */ N VANGUARDS;
    private static /* synthetic */ int[] lIlIlIIIlIII;
    public static final /* synthetic */ N UNKNOWN_PUZZLE;
    public static final /* synthetic */ N START;
    private static final /* synthetic */ N[] $VALUES;

    private static String llIllIllllllll(String lllllllllllllllIllIlIlIIllIlIIIl, String lllllllllllllllIllIlIlIIllIlIIII) {
        try {
            SecretKeySpec lllllllllllllllIllIlIlIIllIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIlIIllIlIIII.getBytes(StandardCharsets.UTF_8)), lIlIlIIIlIII[9]), "DES");
            Cipher lllllllllllllllIllIlIlIIllIlIIll = Cipher.getInstance("DES");
            lllllllllllllllIllIlIlIIllIlIIll.init(lIlIlIIIlIII[3], lllllllllllllllIllIlIlIIllIlIlII);
            return new String(lllllllllllllllIllIlIlIIllIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIlIIllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIlIIllIlIIlI) {
            lllllllllllllllIllIlIlIIllIlIIlI.printStackTrace();
            return null;
        }
    }

    private static void llIlllIIIIIIII() {
        lIlIlIIIIlll = new String[lIlIlIIIlIII[38]];
        lIlIlIIIIlll[lIlIlIIIlIII[1]] = llIllIllllllIl("H3kC/GxnY3M=", "zISAQ");
        lIlIlIIIIlll[lIlIlIIIlIII[2]] = llIllIlllllllI("GhwMPhc=", "IhmLc");
        lIlIlIIIIlll[lIlIlIIIlIII[3]] = llIllIllllllll("hUgsSitbJr8=", "CxCAK");
        lIlIlIIIIlll[lIlIlIIIlIII[4]] = llIllIllllllll("IHaUwH/+iz8=", "Utgut");
        lIlIlIIIIlll[lIlIlIIIlIII[5]] = llIllIllllllll("pJSsxX0tL93780LvXkkWaA==", "MFbVJ");
        lIlIlIIIIlll[lIlIlIIIlIII[6]] = llIllIlllllllI("JxUOIj8aEQomKQ==", "tvoTZ");
        lIlIlIIIIlll[lIlIlIIIlIII[7]] = llIllIlllllllI("Fg0rJDkeCw==", "PLyip");
        lIlIlIIIIlll[lIlIlIIIlIII[8]] = llIllIllllllIl("dkX810fqpSI=", "KAcFa");
        lIlIlIIIIlll[lIlIlIIIlIII[9]] = llIllIllllllIl("KPrlcxkKSZY=", "ubZrk");
        lIlIlIIIIlll[lIlIlIIIlIII[10]] = llIllIllllllll("X6xNFr27vLk=", "oqomX");
        lIlIlIIIIlll[lIlIlIIIlIII[11]] = llIllIlllllllI("HjYCNiUE", "JsIbj");
        lIlIlIIIIlll[lIlIlIIIlIII[12]] = llIllIlllllllI("LCgnOiYW", "xMLNI");
        lIlIlIIIIlll[lIlIlIIIlIII[13]] = llIllIllllllll("ZuJshtYYklRUiAv6x3DAFw==", "UYdjW");
        lIlIlIIIIlll[lIlIlIIIlIII[14]] = llIllIllllllIl("7vboeyFr9ppVmI0R6r4kPA==", "MKXtl");
        lIlIlIIIIlll[lIlIlIIIlIII[15]] = llIllIllllllll("GKIXVB/YIPgiJZuKZyl0lg==", "uLDsX");
        lIlIlIIIIlll[lIlIlIIIlIII[16]] = llIllIllllllll("6tEjC1lsotcjjO0qBn7EVA==", "acuGi");
        lIlIlIIIIlll[lIlIlIIIlIII[17]] = llIllIllllllll("M/hpaQoKfx4=", "jgppq");
        lIlIlIIIIlll[lIlIlIIIlIII[18]] = llIllIllllllll("B8UjVYAhH0s=", "clcUI");
        lIlIlIIIIlll[lIlIlIIIlIII[19]] = llIllIllllllll("EA79rcjkR4I=", "QHzyO");
        lIlIlIIIIlll[lIlIlIIIlIII[20]] = llIllIlllllllI("NRAQKzAICw==", "fxqFQ");
        lIlIlIIIIlll[lIlIlIIIlIII[21]] = llIllIllllllll("XSglXXByl+o=", "pLDwj");
        lIlIlIIIIlll[lIlIlIIIlIII[22]] = llIllIllllllIl("wZjUq2g/wA0=", "WniMm");
        lIlIlIIIIlll[lIlIlIIIlIII[23]] = llIllIlllllllI("DCYWCSIbNRwd", "ZgXNw");
        lIlIlIIIIlll[lIlIlIIIlIII[24]] = llIllIlllllllI("IC4NJDAXPQcw", "vOcCE");
        lIlIlIIIIlll[lIlIlIIIlIII[25]] = llIllIlllllllI("BwAHMCQJCg==", "JYTdm");
        lIlIlIIIIlll[lIlIlIIIlIII[26]] = llIllIlllllllI("NRwWNg0bFg==", "xeeBd");
        lIlIlIIIIlll[lIlIlIIIlIII[27]] = llIllIllllllll("UX3uonvz/hQzjVcnJvwyHQ==", "ulGCk");
        lIlIlIIIIlll[lIlIlIIIlIII[28]] = llIllIllllllll("fPMSi3yi0SW0XYauZokPJrc+ZRiqGQAr", "ZdqzT");
        lIlIlIIIIlll[lIlIlIIIlIII[29]] = llIllIllllllll("Pf4UOB180OA=", "mcxgj");
        lIlIlIIIIlll[lIlIlIIIlIII[30]] = llIllIlllllllI("ChU0KyM=", "IgUIP");
        lIlIlIIIIlll[lIlIlIIIlIII[31]] = llIllIlllllllI("HyUWMBUTKxwh", "VfSoQ");
        lIlIlIIIIlll[lIlIlIIIlIII[32]] = llIllIllllllIl("QYWqLSLMIjnMTn0yNJGzXw==", "NAbmk");
        lIlIlIIIIlll[lIlIlIIIlIII[0]] = llIllIllllllIl("aULdP4AenKQHoJsVgaODgw==", "iRkeX");
        lIlIlIIIIlll[lIlIlIIIlIII[33]] = llIllIllllllIl("z2DKR+4nTuAqV9aBX8Xf2Q==", "iOSyD");
        lIlIlIIIIlll[lIlIlIIIlIII[34]] = llIllIllllllIl("biwYwWU98gvayPTgTTJ98A==", "hctAy");
        lIlIlIIIIlll[lIlIlIIIlIII[35]] = llIllIlllllllI("HjwrLT0jOiU=", "JTBHK");
        lIlIlIIIIlll[lIlIlIIIlIII[36]] = llIllIllllllll("cUFgM2YR/IHnUZbs08Lakw==", "RNnsY");
        lIlIlIIIIlll[lIlIlIIIlIII[37]] = llIllIllllllll("T6Ta74AlZP8fYoDCFJunZeKb8t7Hyrtv", "kNMha");
    }

    private static void llIlllIIIIIIIl() {
        lIlIlIIIlIII = new int[39];
        lIlIlIIIlIII[0] = 109 ^ 77;
        lIlIlIIIlIII[1] = ((233 ^ 147) ^ (77 ^ 35)) & (((((132 + 105) - 121) + 21) ^ (((111 + 69) - 92) + 69)) ^ (-" ".length()));
        lIlIlIIIlIII[2] = " ".length();
        lIlIlIIIlIII[3] = "  ".length();
        lIlIlIIIlIII[4] = "   ".length();
        lIlIlIIIlIII[5] = 100 ^ 96;
        lIlIlIIIlIII[6] = 165 ^ 160;
        lIlIlIIIlIII[7] = 193 ^ 199;
        lIlIlIIIlIII[8] = 19 ^ 20;
        lIlIlIIIlIII[9] = 97 ^ 105;
        lIlIlIIIlIII[10] = 84 ^ 93;
        lIlIlIIIlIII[11] = 72 ^ 66;
        lIlIlIIIlIII[12] = (((135 + 134) - 116) + 20) ^ (((30 + 75) - (-47)) + 14);
        lIlIlIIIlIII[13] = (71 ^ 37) ^ (112 ^ 30);
        lIlIlIIIlIII[14] = (((65 + 95) - 83) + 57) ^ (((121 + 38) - 92) + 72);
        lIlIlIIIlIII[15] = (122 ^ 127) ^ (104 ^ 99);
        lIlIlIIIlIII[16] = (82 ^ 57) ^ (99 ^ 7);
        lIlIlIIIlIII[17] = (((86 + 70) - 86) + 57) ^ (63 ^ 80);
        lIlIlIIIlIII[18] = 153 ^ 136;
        lIlIlIIIlIII[19] = (((100 + 69) - 110) + 100) ^ (((140 + 139) - 252) + 114);
        lIlIlIIIlIII[20] = (201 ^ 137) ^ (239 ^ 188);
        lIlIlIIIlIII[21] = (129 ^ 194) ^ (24 ^ 79);
        lIlIlIIIlIII[22] = (94 ^ 73) ^ "  ".length();
        lIlIlIIIlIII[23] = 109 ^ 123;
        lIlIlIIIlIII[24] = (11 ^ 84) ^ (64 ^ 8);
        lIlIlIIIlIII[25] = 141 ^ 149;
        lIlIlIIIlIII[26] = 180 ^ 173;
        lIlIlIIIlIII[27] = 64 ^ 90;
        lIlIlIIIlIII[28] = 114 ^ 105;
        lIlIlIIIlIII[29] = (((95 + 24) - 67) + 107) ^ (((39 + 36) - 66) + 122);
        lIlIlIIIlIII[30] = 107 ^ 118;
        lIlIlIIIlIII[31] = (((37 + 177) - 102) + 71) ^ (((15 + 139) - 128) + 143);
        lIlIlIIIlIII[32] = 221 ^ 194;
        lIlIlIIIlIII[33] = (75 ^ 76) ^ (181 ^ 147);
        lIlIlIIIlIII[34] = 96 ^ 66;
        lIlIlIIIlIII[35] = 42 ^ 9;
        lIlIlIIIlIII[36] = (15 ^ 0) ^ (37 ^ 14);
        lIlIlIIIlIII[37] = 164 ^ 129;
        lIlIlIIIlIII[38] = (0 ^ 100) ^ (211 ^ 145);
    }

    public P bY() {
        return this.type;
    }

    private static String llIllIllllllIl(String lllllllllllllllIllIlIlIIlIlIllII, String lllllllllllllllIllIlIlIIlIlIlIll) {
        try {
            SecretKeySpec lllllllllllllllIllIlIlIIlIlIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIlIIlIlIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIIIlIII[3], lllllllllllllllIllIlIlIIlIlIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIlIIlIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIlIIlIlIllIl) {
            lllllllllllllllIllIlIlIIlIlIllIl.printStackTrace();
            return null;
        }
    }

    private static String llIllIlllllllI(String lllllllllllllllIllIlIlIIllIIIIIl, String lllllllllllllllIllIlIlIIllIIIIII) {
        String lllllllllllllllIllIlIlIIllIIIIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIlIlIIllIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIlIlIIlIllllll = new StringBuilder();
        char[] charArray = lllllllllllllllIllIlIlIIllIIIIII.toCharArray();
        int lllllllllllllllIllIlIlIIlIllllIl = lIlIlIIIlIII[1];
        char[] charArray2 = lllllllllllllllIllIlIlIIllIIIIIl2.toCharArray();
        int length = charArray2.length;
        int i = lIlIlIIIlIII[1];
        while (llIlllIIIIIIlI(i, length)) {
            lllllllllllllllIllIlIlIIlIllllll.append((char) (charArray2[i] ^ charArray[lllllllllllllllIllIlIlIIlIllllIl % charArray.length]));
            "".length();
            lllllllllllllllIllIlIlIIlIllllIl++;
            i++;
            "".length();
            if ("  ".length() <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIlIlIIlIllllll);
    }

    public static N[] values() {
        return (N[]) $VALUES.clone();
    }

    private N(String str, int i, String str2, P p) {
        this.name = str2;
        this.type = p;
    }

    public String bX() {
        return this.name;
    }

    private static boolean llIlllIIIIIIlI(int i, int i2) {
        return i < i2;
    }

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    static {
        llIlllIIIIIIIl();
        llIlllIIIIIIII();
        ROOM_MAX_SIZE = lIlIlIIIlIII[0];
        START = new N(lIlIlIIIIlll[lIlIlIIIlIII[1]], lIlIlIIIlIII[1], lIlIlIIIIlll[lIlIlIIIlIII[2]], P.START);
        END = new N(lIlIlIIIIlll[lIlIlIIIlIII[3]], lIlIlIIIlIII[2], lIlIlIIIIlll[lIlIlIIIlIII[4]], P.END);
        SCAVENGERS = new N(lIlIlIIIIlll[lIlIlIIIlIII[5]], lIlIlIIIlIII[3], lIlIlIIIIlll[lIlIlIIIlIII[6]], P.SCAVENGERS);
        FARMING = new N(lIlIlIIIIlll[lIlIlIIIlIII[7]], lIlIlIIIlIII[4], lIlIlIIIIlll[lIlIlIIIlIII[8]], P.FARMING);
        EMPTY = new N(lIlIlIIIIlll[lIlIlIIIlIII[9]], lIlIlIIIlIII[5], lIlIlIIIIlll[lIlIlIIIlIII[10]], P.EMPTY);
        TEKTON = new N(lIlIlIIIIlll[lIlIlIIIlIII[11]], lIlIlIIIlIII[6], lIlIlIIIIlll[lIlIlIIIlIII[12]], P.COMBAT);
        MUTTADILES = new N(lIlIlIIIIlll[lIlIlIIIlIII[13]], lIlIlIIIlIII[7], lIlIlIIIIlll[lIlIlIIIlIII[14]], P.COMBAT);
        GUARDIANS = new N(lIlIlIIIIlll[lIlIlIIIlIII[15]], lIlIlIIIlIII[8], lIlIlIIIIlll[lIlIlIIIlIII[16]], P.COMBAT);
        VESPULA = new N(lIlIlIIIIlll[lIlIlIIIlIII[17]], lIlIlIIIlIII[9], lIlIlIIIIlll[lIlIlIIIlIII[18]], P.COMBAT);
        SHAMANS = new N(lIlIlIIIIlll[lIlIlIIIlIII[19]], lIlIlIIIlIII[10], lIlIlIIIIlll[lIlIlIIIlIII[20]], P.COMBAT);
        VASA = new N(lIlIlIIIIlll[lIlIlIIIlIII[21]], lIlIlIIIlIII[11], lIlIlIIIIlll[lIlIlIIIlIII[22]], P.COMBAT);
        VANGUARDS = new N(lIlIlIIIIlll[lIlIlIIIlIII[23]], lIlIlIIIlIII[12], lIlIlIIIIlll[lIlIlIIIlIII[24]], P.COMBAT);
        MYSTICS = new N(lIlIlIIIIlll[lIlIlIIIlIII[25]], lIlIlIIIlIII[13], lIlIlIIIIlll[lIlIlIIIlIII[26]], P.COMBAT);
        UNKNOWN_COMBAT = new N(lIlIlIIIIlll[lIlIlIIIlIII[27]], lIlIlIIIlIII[14], lIlIlIIIIlll[lIlIlIIIlIII[28]], P.COMBAT);
        CRABS = new N(lIlIlIIIIlll[lIlIlIIIlIII[29]], lIlIlIIIlIII[15], lIlIlIIIIlll[lIlIlIIIlIII[30]], P.PUZZLE);
        ICE_DEMON = new N(lIlIlIIIIlll[lIlIlIIIlIII[31]], lIlIlIIIlIII[16], lIlIlIIIIlll[lIlIlIIIlIII[32]], P.PUZZLE);
        TIGHTROPE = new N(lIlIlIIIIlll[lIlIlIIIlIII[0]], lIlIlIIIlIII[17], lIlIlIIIIlll[lIlIlIIIlIII[33]], P.PUZZLE);
        THIEVING = new N(lIlIlIIIIlll[lIlIlIIIlIII[34]], lIlIlIIIlIII[18], lIlIlIIIIlll[lIlIlIIIlIII[35]], P.PUZZLE);
        UNKNOWN_PUZZLE = new N(lIlIlIIIIlll[lIlIlIIIlIII[36]], lIlIlIIIlIII[19], lIlIlIIIIlll[lIlIlIIIlIII[37]], P.PUZZLE);
        N[] nArr = new N[lIlIlIIIlIII[20]];
        nArr[lIlIlIIIlIII[1]] = START;
        nArr[lIlIlIIIlIII[2]] = END;
        nArr[lIlIlIIIlIII[3]] = SCAVENGERS;
        nArr[lIlIlIIIlIII[4]] = FARMING;
        nArr[lIlIlIIIlIII[5]] = EMPTY;
        nArr[lIlIlIIIlIII[6]] = TEKTON;
        nArr[lIlIlIIIlIII[7]] = MUTTADILES;
        nArr[lIlIlIIIlIII[8]] = GUARDIANS;
        nArr[lIlIlIIIlIII[9]] = VESPULA;
        nArr[lIlIlIIIlIII[10]] = SHAMANS;
        nArr[lIlIlIIIlIII[11]] = VASA;
        nArr[lIlIlIIIlIII[12]] = VANGUARDS;
        nArr[lIlIlIIIlIII[13]] = MYSTICS;
        nArr[lIlIlIIIlIII[14]] = UNKNOWN_COMBAT;
        nArr[lIlIlIIIlIII[15]] = CRABS;
        nArr[lIlIlIIIlIII[16]] = ICE_DEMON;
        nArr[lIlIlIIIlIII[17]] = TIGHTROPE;
        nArr[lIlIlIIIlIII[18]] = THIEVING;
        nArr[lIlIlIIIlIII[19]] = UNKNOWN_PUZZLE;
        $VALUES = nArr;
    }
}
