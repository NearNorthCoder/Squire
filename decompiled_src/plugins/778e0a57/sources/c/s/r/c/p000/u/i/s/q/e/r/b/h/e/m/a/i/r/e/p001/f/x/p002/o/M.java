package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.M  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/M.class */
public final class M {
    public static final /* synthetic */ M RAIDS_SHAMANS1;
    public static final /* synthetic */ M RAIDS_SCAVENGERS12;
    public static final /* synthetic */ M RAIDS_GUARDIANS2;
    public static final /* synthetic */ M RAIDS_TEKTON1;
    public static final /* synthetic */ M RAIDS_LOBBY2;
    public static final /* synthetic */ M RAIDS_FARMING12;
    public static final /* synthetic */ M RAIDS_EMPTY;
    public static final /* synthetic */ M RAIDS_VANGUARDS2;
    public static final /* synthetic */ M RAIDS_FARMING23;
    public static final /* synthetic */ M RAIDS_END2;
    public static final /* synthetic */ M RAIDS_VESPULA1;
    public static final /* synthetic */ M RAIDS_VASA3;
    public static final /* synthetic */ M RAIDS_VANGUARDS1;
    private static /* synthetic */ String[] lIlIllIlIllI;
    public static final /* synthetic */ M RAIDS_END3;
    public static final /* synthetic */ M RAIDS_FARMING21;
    public static final /* synthetic */ M RAIDS_MYSTICS3;
    public static final /* synthetic */ M RAIDS_GUARDIANS1;
    public static final /* synthetic */ M RAIDS_VASA2;
    public static final /* synthetic */ M RAIDS_MYSTICS2;
    public static final /* synthetic */ M RAIDS_START3;
    public static final /* synthetic */ M RAIDS_LOBBY1;
    private static final /* synthetic */ M[] $VALUES;
    public static final /* synthetic */ M RAIDS_START2;
    public static final /* synthetic */ M RAIDS_LOBBY3;
    public static final /* synthetic */ M RAIDS_CRABS2;
    public static final /* synthetic */ M RAIDS_CRABS3;
    public static final /* synthetic */ M RAIDS_VESPULA2;
    public static final /* synthetic */ M RAIDS_THIEVING2;
    public static final /* synthetic */ M RAIDS_END1;
    public static final /* synthetic */ M RAIDS_FARMING13;
    public static final /* synthetic */ M RAIDS_ICE_DEMON1;
    public static final /* synthetic */ M RAIDS_TEKTON2;
    private final /* synthetic */ int baseY;
    public static final /* synthetic */ M RAIDS_VASA1;
    public static final /* synthetic */ M RAIDS_ICE_DEMON2;
    public static final /* synthetic */ M RAIDS_ICE_DEMON3;
    public static final /* synthetic */ M RAIDS_TIGHTROPE2;
    private final /* synthetic */ int baseX;
    public static final /* synthetic */ M RAIDS_MUTTADILES2;
    public static final /* synthetic */ M RAIDS_SCAVENGERS11;
    public static final /* synthetic */ M RAIDS_SHAMANS2;
    public static final /* synthetic */ M RAIDS_MUTTADILES1;
    public static final /* synthetic */ M RAIDS_TIGHTROPE1;
    public static final /* synthetic */ M RAIDS_THIEVING3;
    public static final /* synthetic */ M RAIDS_CRABS1;
    public static final /* synthetic */ M RAIDS_SHAMANS3;
    public static final /* synthetic */ M RAIDS_MUTTADILES3;
    private static /* synthetic */ int[] lIlIllIllIIl;
    public static final /* synthetic */ M RAIDS_FARMING11;
    public static final /* synthetic */ M RAIDS_TIGHTROPE3;
    public static final /* synthetic */ M RAIDS_MYSTICS1;
    public static final /* synthetic */ M RAIDS_SCAVENGERS23;
    public static final /* synthetic */ M RAIDS_TEKTON3;
    public static final /* synthetic */ M RAIDS_VESPULA3;
    public static final /* synthetic */ M RAIDS_SCAVENGERS13;
    public static final /* synthetic */ M RAIDS_SCAVENGERS21;
    public static final /* synthetic */ M RAIDS_SCAVENGERS22;
    private final /* synthetic */ int plane;
    public static final /* synthetic */ M RAIDS_START1;
    public static final /* synthetic */ M RAIDS_VANGUARDS3;
    public static final /* synthetic */ M RAIDS_FARMING22;
    public static final /* synthetic */ M RAIDS_THIEVING1;
    public static final /* synthetic */ M RAIDS_GUARDIANS3;
    private final /* synthetic */ int width = lIlIllIllIIl[8];
    private final /* synthetic */ int height = lIlIllIllIIl[8];

    public static M[] values() {
        return (M[]) $VALUES.clone();
    }

    public int bS() {
        return this.baseX;
    }

    public int bU() {
        return this.plane;
    }

    public int bV() {
        return this.width;
    }

    public static M x(int i) {
        int i2 = (i >> lIlIllIllIIl[0]) & lIlIllIllIIl[1];
        int lllllllllllllllIllIIlIIlllIIlIlI = ((i >> lIlIllIllIIl[1]) & lIlIllIllIIl[2]) * lIlIllIllIIl[3];
        int i3 = ((i >> lIlIllIllIIl[4]) & lIlIllIllIIl[5]) * lIlIllIllIIl[3];
        int i4 = (i >> lIlIllIllIIl[6]) & lIlIllIllIIl[1];
        M[] values = values();
        int length = values.length;
        int i5 = lIlIllIllIIl[7];
        while (lllIIIIIlllIll(i5, length)) {
            M m = values[i5];
            if (lllIIIIIllllII(i4, m.bU()) && lllIIIIIllllIl(i3, m.bS()) && lllIIIIIlllIll(i3, m.bS() + m.bV()) && lllIIIIIllllIl(lllllllllllllllIllIIlIIlllIIlIlI, m.bT()) && lllIIIIIlllIll(lllllllllllllllIllIIlIIlllIIlIlI, m.bT() + m.bW())) {
                return m;
            }
            i5++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return null;
    }

    private static String lllIIIIIlIlllI(String lllllllllllllllIllIIlIIllIIlllll, String lllllllllllllllIllIIlIIllIIllllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIIlIIllIIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIlIIllIIlllIl = new StringBuilder();
        char[] lllllllllllllllIllIIlIIllIIlllII = lllllllllllllllIllIIlIIllIIllllI.toCharArray();
        int lllllllllllllllIllIIlIIllIIllIll = lIlIllIllIIl[7];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIllIllIIl[7];
        while (lllIIIIIlllIll(i, length)) {
            lllllllllllllllIllIIlIIllIIlllIl.append((char) (charArray[i] ^ lllllllllllllllIllIIlIIllIIlllII[lllllllllllllllIllIIlIIllIIllIll % lllllllllllllllIllIIlIIllIIlllII.length]));
            "".length();
            lllllllllllllllIllIIlIIllIIllIll++;
            i++;
            "".length();
            if ((((((54 + 88) - 105) + 90) ^ (102 ^ 123)) & (((188 ^ 180) ^ (251 ^ 145)) ^ (-" ".length()))) < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIIlIIllIIlllIl);
    }

    private static boolean lllIIIIIllllIl(int i, int i2) {
        return i >= i2;
    }

    private static String lllIIIIIlIllll(String lllllllllllllllIllIIlIIllIlIllll, String lllllllllllllllIllIIlIIllIlIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIIllIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIllIllIIl[12], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIIllIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIlIIllIlIlIll) {
            lllllllllllllllIllIIlIIllIlIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIIIlllIll(int i, int i2) {
        return i < i2;
    }

    private static void lllIIIIIlllIIl() {
        lIlIllIlIllI = new String[lIlIllIllIIl[73]];
        lIlIllIlIllI[lIlIllIllIIl[7]] = lllIIIIIlIllIl("Ls2xk1cIHBERV90e5+KdBg==", "FpGEW");
        lIlIllIlIllI[lIlIllIllIIl[0]] = lllIIIIIlIlllI("ESYiNCYcKyQyNxpV", "Cgkpu");
        lIlIllIlIllI[lIlIllIllIIl[12]] = lllIIIIIlIlllI("KygEJzQmJQIhJSBa", "yiMcg");
        lIlIllIlIllI[lIlIllIllIIl[1]] = lllIIIIIlIlllI("OzUFDgM2JxgLAj1F", "itLJP");
        lIlIllIlIllI[lIlIllIllIIl[15]] = lllIIIIIlIllll("NV8cYQZxkmHLRrMNnLVvLA==", "JTEFL");
        lIlIllIlIllI[lIlIllIllIIl[16]] = lllIIIIIlIlllI("Ky8sPCImPTE5Iy1d", "ynexq");
        lIlIllIlIllI[lIlIllIllIIl[17]] = lllIIIIIlIllIl("+pZkvH+QCAqwyTHqxvYHQw==", "YLrnu");
        lIlIllIlIllI[lIlIllIllIIl[19]] = lllIIIIIlIllll("Cn36CURneHuv80FvK6VKJA==", "uDXXE");
        lIlIllIlIllI[lIlIllIllIIl[3]] = lllIIIIIlIllIl("A8r8I4seHg27/rxWarTjfw==", "fipML");
        lIlIllIlIllI[lIlIllIllIIl[20]] = lllIIIIIlIllIl("vNoLr9wPOJ7ccbFRyBtC9Ju8JU6GmH8b", "KwHEg");
        lIlIllIlIllI[lIlIllIllIIl[22]] = lllIIIIIlIllIl("xOJOiN5t7IK6MwO0vjzyZhBVBoz7tEi3", "SgFvi");
        lIlIllIlIllI[lIlIllIllIIl[23]] = lllIIIIIlIllll("YsN2YvdlmgMHkQQ3cP3WohRXAyT+LABg", "RxCbd");
        lIlIllIlIllI[lIlIllIllIIl[24]] = lllIIIIIlIllll("JsmoNTnLwLw4Z3VuUQQQmQ==", "NfSnY");
        lIlIllIlIllI[lIlIllIllIIl[26]] = lllIIIIIlIlllI("CwkvPQEGGy44HxgGNUs=", "YHfyR");
        lIlIllIlIllI[lIlIllIllIIl[4]] = lllIIIIIlIllIl("s/XQE3T/gcdjjfyCSOt9sg==", "PTUjS");
        lIlIllIlIllI[lIlIllIllIIl[27]] = lllIIIIIlIllIl("JbkuMGK3laKEMBi65HyNmw==", "Uweoo");
        lIlIllIlIllI[lIlIllIllIIl[29]] = lllIIIIIlIlllI("PisKFRczPAICBV4=", "ljCQD");
        lIlIllIlIllI[lIlIllIllIIl[30]] = lllIIIIIlIlllI("AA4RBgUNGRkRF2E=", "ROXBV");
        lIlIllIlIllI[lIlIllIllIIl[31]] = lllIIIIIlIllIl("DrbgvVGqw5AAIMdsuNcE1jYzF9rX0KW6", "vebWo");
        lIlIllIlIllI[lIlIllIllIIl[33]] = lllIIIIIlIllIl("8yVdUzTSeIHx82lyWsnKw5uNGPxKV4QD", "cWTMh");
        lIlIllIlIllI[lIlIllIllIIl[34]] = lllIIIIIlIllIl("rMk6nWsRFwusNHJoHfu7AO5IILLopAZD", "bchuR");
        lIlIllIlIllI[lIlIllIllIIl[35]] = lllIIIIIlIllIl("3YISHjcxSZTlWgR4BxSbx9L8PaJQYtR0", "vyLze");
        lIlIllIlIllI[lIlIllIllIIl[37]] = lllIIIIIlIlllI("IiU8KhkvLTYrFTQhOCEEQg==", "pdunJ");
        lIlIllIlIllI[lIlIllIllIIl[38]] = lllIIIIIlIllll("LPlTsOWuWDZydrrxkmeaUbUpo9cVsyfd", "lrVNj");
        lIlIllIlIllI[lIlIllIllIIl[6]] = lllIIIIIlIlllI("NwUQMwY6EBE+EDMNFzBk", "eDYwU");
        lIlIllIlIllI[lIlIllIllIIl[40]] = lllIIIIIlIllIl("TJQeGlRiDWme/YpEslnkIQ==", "wCGvF");
        lIlIllIlIllI[lIlIllIllIIl[41]] = lllIIIIIlIllll("PFJADo06XKgNimdcmkJbmg==", "YxAmT");
        lIlIllIlIllI[lIlIllIllIIl[42]] = lllIIIIIlIllll("6WvHMLHMaYpIUw+VzhMBFw==", "LkXFd");
        lIlIllIlIllI[lIlIllIllIIl[44]] = lllIIIIIlIllll("FX2ibXQghO7ETOp9CAZ4nA==", "YjtCo");
        lIlIllIlIllI[lIlIllIllIIl[45]] = lllIIIIIlIlllI("HwYOMjESAQYkLwQJAEdR", "MGGvb");
        lIlIllIlIllI[lIlIllIllIIl[46]] = lllIIIIIlIllll("LjZiyAZ4uvKS2HmQ1hHDIfzSb314/ves", "YzhLX");
        lIlIllIlIllI[lIlIllIllIIl[47]] = lllIIIIIlIllll("Ps5wP1mr+X6xQqUDRRyef0mn5BD4qJbn", "ENNQW");
        lIlIllIlIllI[lIlIllIllIIl[8]] = lllIIIIIlIllIl("4bwBzmgc4WlyI3bA0hGRcuNiSv5J0Gut", "mCSUe");
        lIlIllIlIllI[lIlIllIllIIl[48]] = lllIIIIIlIllIl("CylJeq+qM9N5BSumxIrxgNqqfFw7H8m1", "wGDLb");
        lIlIllIlIllI[lIlIllIllIIl[49]] = lllIIIIIlIlllI("MQk4NBg8BSQkHyIMODwOMHo=", "cHqpK");
        lIlIllIlIllI[lIlIllIllIIl[50]] = lllIIIIIlIllll("qRRS1SQ9iLL0tC3mL/0aHBrrx/gM1OmT", "ulaCf");
        lIlIllIlIllI[lIlIllIllIIl[51]] = lllIIIIIlIllIl("ageSbJQzXMMZ5TR+QiQdXw==", "IapMV");
        lIlIllIlIllI[lIlIllIllIIl[52]] = lllIIIIIlIllll("chEpEnyCLn9B6o3Oxg8yNg==", "NyFGY");
        lIlIllIlIllI[lIlIllIllIIl[53]] = lllIIIIIlIlllI("ESonDiYcJjcZIQooPXk=", "CknJu");
        lIlIllIlIllI[lIlIllIllIIl[54]] = lllIIIIIlIllll("2D+QkDSYjd7BZtGj7ISgiQ==", "wkVmG");
        lIlIllIlIllI[lIlIllIllIIl[55]] = lllIIIIIlIllll("Fs6iZzMmZRPyvojdfOOfqA==", "ZwqcS");
        lIlIllIlIllI[lIlIllIllIIl[56]] = lllIIIIIlIllIl("oXJ5UHUmDE3VSfYzT9hDtQ==", "CmnbR");
        lIlIllIlIllI[lIlIllIllIIl[57]] = lllIIIIIlIlllI("AgAtKSMPFS0qOAQTKz01YQ==", "PAdmp");
        lIlIllIlIllI[lIlIllIllIIl[58]] = lllIIIIIlIllll("7z8pRN6loTWXpnuWDAmhpwOGHPiIfC5u", "SKtcP");
        lIlIllIlIllI[lIlIllIllIIl[59]] = lllIIIIIlIlllI("GQ8iJhcUGiIlDB8cJDIBeA==", "KNkbD");
        lIlIllIlIllI[lIlIllIllIIl[60]] = lllIIIIIlIlllI("CzkICQQGPgAfGhA2Bn9m", "YxAMW");
        lIlIllIlIllI[lIlIllIllIIl[61]] = lllIIIIIlIlllI("IC4GCSEtKQ4fPzshCH9A", "roOMr");
        lIlIllIlIllI[lIlIllIllIIl[62]] = lllIIIIIlIllIl("rYphMYVFeWPMwTu72awKkA==", "xoFfn");
        lIlIllIlIllI[lIlIllIllIIl[63]] = lllIIIIIlIlllI("PhcDCzwzER8OPSgfCwE8XQ==", "lVJOo");
        lIlIllIlIllI[lIlIllIllIIl[64]] = lllIIIIIlIllIl("a41qGA7U06kpeKf9ZC38XgVOvn9A8GWc", "wQpoC");
        lIlIllIlIllI[lIlIllIllIIl[65]] = lllIIIIIlIllll("7AredkpAKuJ60V/HhLUOrm7TNOTv9rTb", "KSSxW");
        lIlIllIlIllI[lIlIllIllIIl[66]] = lllIIIIIlIlllI("HAwgCx0RGywcHhsBKH4=", "NMiON");
        lIlIllIlIllI[lIlIllIllIIl[67]] = lllIIIIIlIllll("Evo5KmKKfhHPeRL1m2BtPQ==", "Eyphi");
        lIlIllIlIllI[lIlIllIllIIl[68]] = lllIIIIIlIllIl("tPkpYjNnCbumjk/u3Cpz5w==", "oAIjU");
        lIlIllIlIllI[lIlIllIllIIl[69]] = lllIIIIIlIlllI("GScRAzkUJQoGKBhX", "KfXGj");
        lIlIllIlIllI[lIlIllIllIIl[70]] = lllIIIIIlIlllI("JQ4mKSAoDD0sMSR9", "wOoms");
        lIlIllIlIllI[lIlIllIllIIl[71]] = lllIIIIIlIlllI("NAYFFBU5BB4RBDV0", "fGLPF");
        lIlIllIlIllI[lIlIllIllIIl[72]] = lllIIIIIlIllll("BkHk+mUhy4WClSTpss2+UA==", "scwMv");
    }

    public static M valueOf(String str) {
        return (M) Enum.valueOf(M.class, str);
    }

    public int bW() {
        return this.height;
    }

    private static void lllIIIIIlllIlI() {
        lIlIllIllIIl = new int[74];
        lIlIllIllIIl[0] = " ".length();
        lIlIllIllIIl[1] = "   ".length();
        lIlIllIllIIl[2] = (-((-1933) & 24461)) & (-1) & 24575;
        lIlIllIllIIl[3] = (165 ^ 180) ^ (171 ^ 178);
        lIlIllIllIIl[4] = (10 ^ 64) ^ (130 ^ 198);
        lIlIllIllIIl[5] = (-5121) & 6143;
        lIlIllIllIIl[6] = 101 ^ 125;
        lIlIllIllIIl[7] = ((20 ^ 82) ^ (206 ^ 154)) & (((((99 + 135) - 105) + 36) ^ (((125 + 6) - (-18)) + 34)) ^ (-" ".length()));
        lIlIllIllIIl[8] = (((150 + 144) - 293) + 176) ^ (((80 + 15) - (-33)) + 17);
        lIlIllIllIIl[9] = (-((-2584) & 31551)) & (-1) & 32231;
        lIlIllIllIIl[10] = (-641) & 5824;
        lIlIllIllIIl[11] = (-21257) & 24552;
        lIlIllIllIIl[12] = "  ".length();
        lIlIllIllIIl[13] = (-764) & 4091;
        lIlIllIllIIl[14] = (-((-1335) & 19958)) & (-8449) & 32767;
        lIlIllIllIIl[15] = 79 ^ 75;
        lIlIllIllIIl[16] = (((49 + 63) - 93) + 156) ^ (((148 + 33) - 42) + 31);
        lIlIllIllIIl[17] = 51 ^ 53;
        lIlIllIllIIl[18] = (-3034) & 8185;
        lIlIllIllIIl[19] = 56 ^ 63;
        lIlIllIllIIl[20] = (187 ^ 147) ^ (135 ^ 166);
        lIlIllIllIIl[21] = (-27412) & 32627;
        lIlIllIllIIl[22] = 89 ^ 83;
        lIlIllIllIIl[23] = 185 ^ 178;
        lIlIllIllIIl[24] = (((4 + 76) - (-11)) + 77) ^ (((133 + 33) - 143) + 141);
        lIlIllIllIIl[25] = (-16956) & 22203;
        lIlIllIllIIl[26] = (26 ^ 100) ^ (75 ^ 56);
        lIlIllIllIIl[27] = (7 ^ 10) ^ "  ".length();
        lIlIllIllIIl[28] = (-((-20513) & 23163)) & (-261) & 8190;
        lIlIllIllIIl[29] = (77 ^ 26) ^ (127 ^ 56);
        lIlIllIllIIl[30] = ((49 ^ 43) & ((23 ^ 13) ^ (-1))) ^ (163 ^ 178);
        lIlIllIllIIl[31] = 163 ^ 177;
        lIlIllIllIIl[32] = (-((-5889) & 16138)) & (-291) & 15851;
        lIlIllIllIIl[33] = (151 ^ 187) ^ (66 ^ 125);
        lIlIllIllIIl[34] = 109 ^ 121;
        lIlIllIllIIl[35] = 35 ^ 54;
        lIlIllIllIIl[36] = (-518) & 5861;
        lIlIllIllIIl[37] = (13 ^ 45) ^ (73 ^ 127);
        lIlIllIllIIl[38] = 126 ^ 105;
        lIlIllIllIIl[39] = (-(((148 + 0) - 113) + 124)) & (-24578) & 30111;
        lIlIllIllIIl[40] = (116 ^ 91) ^ (242 ^ 196);
        lIlIllIllIIl[41] = (193 ^ 196) ^ (66 ^ 93);
        lIlIllIllIIl[42] = 72 ^ 83;
        lIlIllIllIIl[43] = (-((-13649) & 32599)) & (-153) & 24542;
        lIlIllIllIIl[44] = 51 ^ 47;
        lIlIllIllIIl[45] = 31 ^ 2;
        lIlIllIllIIl[46] = 138 ^ 148;
        lIlIllIllIIl[47] = (50 ^ 74) ^ (77 ^ 42);
        lIlIllIllIIl[48] = 183 ^ 150;
        lIlIllIllIIl[49] = (121 ^ 12) ^ (235 ^ 188);
        lIlIllIllIIl[50] = 93 ^ 126;
        lIlIllIllIIl[51] = 31 ^ 59;
        lIlIllIllIIl[52] = 167 ^ 130;
        lIlIllIllIIl[53] = (150 ^ 157) ^ (63 ^ 18);
        lIlIllIllIIl[54] = (((59 + 43) - (-37)) + 50) ^ (((131 + 68) - 188) + 143);
        lIlIllIllIIl[55] = "  ".length() ^ (10 ^ 32);
        lIlIllIllIIl[56] = (20 ^ 18) ^ (20 ^ 59);
        lIlIllIllIIl[57] = 81 ^ 123;
        lIlIllIllIIl[58] = (191 ^ 135) ^ (118 ^ 101);
        lIlIllIllIIl[59] = (((144 + 105) - 206) + 116) ^ (((98 + 84) - 67) + 64);
        lIlIllIllIIl[60] = 142 ^ 163;
        lIlIllIllIIl[61] = (((24 + 95) - 87) + 104) ^ (((12 + 155) - 12) + 11);
        lIlIllIllIIl[62] = (((103 + 119) - 125) + 33) ^ (((71 + 114) - 66) + 54);
        lIlIllIllIIl[63] = 168 ^ 152;
        lIlIllIllIIl[64] = (((80 + 101) - 78) + 66) ^ (((56 + 34) - (-30)) + 32);
        lIlIllIllIIl[65] = (236 ^ 177) ^ (125 ^ 18);
        lIlIllIllIIl[66] = (((114 + 7) - 109) + 123) ^ (((20 + 163) - 91) + 88);
        lIlIllIllIIl[67] = 146 ^ 166;
        lIlIllIllIIl[68] = 158 ^ 171;
        lIlIllIllIIl[69] = 45 ^ 27;
        lIlIllIllIIl[70] = 94 ^ 105;
        lIlIllIllIIl[71] = 136 ^ 176;
        lIlIllIllIIl[72] = 47 ^ 22;
        lIlIllIllIIl[73] = (69 ^ 13) ^ (27 ^ 105);
    }

    private M(String str, int i, int i2, int i3, int i4) {
        this.baseX = i2;
        this.baseY = i3;
        this.plane = i4;
    }

    public int bT() {
        return this.baseY;
    }

    private static String lllIIIIIlIllIl(String lllllllllllllllIllIIlIIllIllllII, String lllllllllllllllIllIIlIIllIlllIll) {
        try {
            SecretKeySpec lllllllllllllllIllIIlIIllIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIIllIlllIll.getBytes(StandardCharsets.UTF_8)), lIlIllIllIIl[3]), "DES");
            Cipher lllllllllllllllIllIIlIIllIlllllI = Cipher.getInstance("DES");
            lllllllllllllllIllIIlIIllIlllllI.init(lIlIllIllIIl[12], lllllllllllllllIllIIlIIllIllllll);
            return new String(lllllllllllllllIllIIlIIllIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIIllIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIlIIllIllllIl) {
            lllllllllllllllIllIIlIIllIllllIl.printStackTrace();
            return null;
        }
    }

    static {
        lllIIIIIlllIlI();
        lllIIIIIlllIIl();
        RAIDS_LOBBY1 = new M(lIlIllIlIllI[lIlIllIllIIl[7]], lIlIllIllIIl[7], lIlIllIllIIl[9], lIlIllIllIIl[10], lIlIllIllIIl[7]);
        RAIDS_LOBBY2 = new M(lIlIllIlIllI[lIlIllIllIIl[0]], lIlIllIllIIl[0], lIlIllIllIIl[11], lIlIllIllIIl[10], lIlIllIllIIl[7]);
        RAIDS_LOBBY3 = new M(lIlIllIlIllI[lIlIllIllIIl[12]], lIlIllIllIIl[12], lIlIllIllIIl[13], lIlIllIllIIl[10], lIlIllIllIIl[7]);
        RAIDS_START1 = new M(lIlIllIlIllI[lIlIllIllIIl[1]], lIlIllIllIIl[1], lIlIllIllIIl[9], lIlIllIllIIl[14], lIlIllIllIIl[7]);
        RAIDS_START2 = new M(lIlIllIlIllI[lIlIllIllIIl[15]], lIlIllIllIIl[15], lIlIllIllIIl[11], lIlIllIllIIl[14], lIlIllIllIIl[7]);
        RAIDS_START3 = new M(lIlIllIlIllI[lIlIllIllIIl[16]], lIlIllIllIIl[16], lIlIllIllIIl[13], lIlIllIllIIl[14], lIlIllIllIIl[7]);
        RAIDS_END1 = new M(lIlIllIlIllI[lIlIllIllIIl[17]], lIlIllIllIIl[17], lIlIllIllIIl[9], lIlIllIllIIl[18], lIlIllIllIIl[7]);
        RAIDS_END2 = new M(lIlIllIlIllI[lIlIllIllIIl[19]], lIlIllIllIIl[19], lIlIllIllIIl[11], lIlIllIllIIl[18], lIlIllIllIIl[7]);
        RAIDS_END3 = new M(lIlIllIlIllI[lIlIllIllIIl[3]], lIlIllIllIIl[3], lIlIllIllIIl[13], lIlIllIllIIl[18], lIlIllIllIIl[7]);
        RAIDS_SCAVENGERS11 = new M(lIlIllIlIllI[lIlIllIllIIl[20]], lIlIllIllIIl[20], lIlIllIllIIl[9], lIlIllIllIIl[21], lIlIllIllIIl[7]);
        RAIDS_SCAVENGERS12 = new M(lIlIllIlIllI[lIlIllIllIIl[22]], lIlIllIllIIl[22], lIlIllIllIIl[11], lIlIllIllIIl[21], lIlIllIllIIl[7]);
        RAIDS_SCAVENGERS13 = new M(lIlIllIlIllI[lIlIllIllIIl[23]], lIlIllIllIIl[23], lIlIllIllIIl[13], lIlIllIllIIl[21], lIlIllIllIIl[7]);
        RAIDS_SHAMANS1 = new M(lIlIllIlIllI[lIlIllIllIIl[24]], lIlIllIllIIl[24], lIlIllIllIIl[9], lIlIllIllIIl[25], lIlIllIllIIl[7]);
        RAIDS_SHAMANS2 = new M(lIlIllIlIllI[lIlIllIllIIl[26]], lIlIllIllIIl[26], lIlIllIllIIl[11], lIlIllIllIIl[25], lIlIllIllIIl[7]);
        RAIDS_SHAMANS3 = new M(lIlIllIlIllI[lIlIllIllIIl[4]], lIlIllIllIIl[4], lIlIllIllIIl[13], lIlIllIllIIl[25], lIlIllIllIIl[7]);
        RAIDS_VASA1 = new M(lIlIllIlIllI[lIlIllIllIIl[27]], lIlIllIllIIl[27], lIlIllIllIIl[9], lIlIllIllIIl[28], lIlIllIllIIl[7]);
        RAIDS_VASA2 = new M(lIlIllIlIllI[lIlIllIllIIl[29]], lIlIllIllIIl[29], lIlIllIllIIl[11], lIlIllIllIIl[28], lIlIllIllIIl[7]);
        RAIDS_VASA3 = new M(lIlIllIlIllI[lIlIllIllIIl[30]], lIlIllIllIIl[30], lIlIllIllIIl[13], lIlIllIllIIl[28], lIlIllIllIIl[7]);
        RAIDS_VANGUARDS1 = new M(lIlIllIlIllI[lIlIllIllIIl[31]], lIlIllIllIIl[31], lIlIllIllIIl[9], lIlIllIllIIl[32], lIlIllIllIIl[7]);
        RAIDS_VANGUARDS2 = new M(lIlIllIlIllI[lIlIllIllIIl[33]], lIlIllIllIIl[33], lIlIllIllIIl[11], lIlIllIllIIl[32], lIlIllIllIIl[7]);
        RAIDS_VANGUARDS3 = new M(lIlIllIlIllI[lIlIllIllIIl[34]], lIlIllIllIIl[34], lIlIllIllIIl[13], lIlIllIllIIl[32], lIlIllIllIIl[7]);
        RAIDS_ICE_DEMON1 = new M(lIlIllIlIllI[lIlIllIllIIl[35]], lIlIllIllIIl[35], lIlIllIllIIl[9], lIlIllIllIIl[36], lIlIllIllIIl[7]);
        RAIDS_ICE_DEMON2 = new M(lIlIllIlIllI[lIlIllIllIIl[37]], lIlIllIllIIl[37], lIlIllIllIIl[11], lIlIllIllIIl[36], lIlIllIllIIl[7]);
        RAIDS_ICE_DEMON3 = new M(lIlIllIlIllI[lIlIllIllIIl[38]], lIlIllIllIIl[38], lIlIllIllIIl[13], lIlIllIllIIl[36], lIlIllIllIIl[7]);
        RAIDS_THIEVING1 = new M(lIlIllIlIllI[lIlIllIllIIl[6]], lIlIllIllIIl[6], lIlIllIllIIl[9], lIlIllIllIIl[39], lIlIllIllIIl[7]);
        RAIDS_THIEVING2 = new M(lIlIllIlIllI[lIlIllIllIIl[40]], lIlIllIllIIl[40], lIlIllIllIIl[11], lIlIllIllIIl[39], lIlIllIllIIl[7]);
        RAIDS_THIEVING3 = new M(lIlIllIlIllI[lIlIllIllIIl[41]], lIlIllIllIIl[41], lIlIllIllIIl[13], lIlIllIllIIl[39], lIlIllIllIIl[7]);
        RAIDS_FARMING11 = new M(lIlIllIlIllI[lIlIllIllIIl[42]], lIlIllIllIIl[42], lIlIllIllIIl[9], lIlIllIllIIl[43], lIlIllIllIIl[7]);
        RAIDS_FARMING12 = new M(lIlIllIlIllI[lIlIllIllIIl[44]], lIlIllIllIIl[44], lIlIllIllIIl[11], lIlIllIllIIl[43], lIlIllIllIIl[7]);
        RAIDS_FARMING13 = new M(lIlIllIlIllI[lIlIllIllIIl[45]], lIlIllIllIIl[45], lIlIllIllIIl[13], lIlIllIllIIl[43], lIlIllIllIIl[7]);
        RAIDS_SCAVENGERS21 = new M(lIlIllIlIllI[lIlIllIllIIl[46]], lIlIllIllIIl[46], lIlIllIllIIl[9], lIlIllIllIIl[21], lIlIllIllIIl[0]);
        RAIDS_SCAVENGERS22 = new M(lIlIllIlIllI[lIlIllIllIIl[47]], lIlIllIllIIl[47], lIlIllIllIIl[11], lIlIllIllIIl[21], lIlIllIllIIl[0]);
        RAIDS_SCAVENGERS23 = new M(lIlIllIlIllI[lIlIllIllIIl[8]], lIlIllIllIIl[8], lIlIllIllIIl[13], lIlIllIllIIl[21], lIlIllIllIIl[0]);
        RAIDS_MUTTADILES1 = new M(lIlIllIlIllI[lIlIllIllIIl[48]], lIlIllIllIIl[48], lIlIllIllIIl[9], lIlIllIllIIl[32], lIlIllIllIIl[0]);
        RAIDS_MUTTADILES2 = new M(lIlIllIlIllI[lIlIllIllIIl[49]], lIlIllIllIIl[49], lIlIllIllIIl[11], lIlIllIllIIl[32], lIlIllIllIIl[0]);
        RAIDS_MUTTADILES3 = new M(lIlIllIlIllI[lIlIllIllIIl[50]], lIlIllIllIIl[50], lIlIllIllIIl[13], lIlIllIllIIl[32], lIlIllIllIIl[0]);
        RAIDS_MYSTICS1 = new M(lIlIllIlIllI[lIlIllIllIIl[51]], lIlIllIllIIl[51], lIlIllIllIIl[9], lIlIllIllIIl[25], lIlIllIllIIl[0]);
        RAIDS_MYSTICS2 = new M(lIlIllIlIllI[lIlIllIllIIl[52]], lIlIllIllIIl[52], lIlIllIllIIl[11], lIlIllIllIIl[25], lIlIllIllIIl[0]);
        RAIDS_MYSTICS3 = new M(lIlIllIlIllI[lIlIllIllIIl[53]], lIlIllIllIIl[53], lIlIllIllIIl[13], lIlIllIllIIl[25], lIlIllIllIIl[0]);
        RAIDS_TEKTON1 = new M(lIlIllIlIllI[lIlIllIllIIl[54]], lIlIllIllIIl[54], lIlIllIllIIl[9], lIlIllIllIIl[28], lIlIllIllIIl[0]);
        RAIDS_TEKTON2 = new M(lIlIllIlIllI[lIlIllIllIIl[55]], lIlIllIllIIl[55], lIlIllIllIIl[11], lIlIllIllIIl[28], lIlIllIllIIl[0]);
        RAIDS_TEKTON3 = new M(lIlIllIlIllI[lIlIllIllIIl[56]], lIlIllIllIIl[56], lIlIllIllIIl[13], lIlIllIllIIl[28], lIlIllIllIIl[0]);
        RAIDS_TIGHTROPE1 = new M(lIlIllIlIllI[lIlIllIllIIl[57]], lIlIllIllIIl[57], lIlIllIllIIl[9], lIlIllIllIIl[36], lIlIllIllIIl[0]);
        RAIDS_TIGHTROPE2 = new M(lIlIllIlIllI[lIlIllIllIIl[58]], lIlIllIllIIl[58], lIlIllIllIIl[11], lIlIllIllIIl[36], lIlIllIllIIl[0]);
        RAIDS_TIGHTROPE3 = new M(lIlIllIlIllI[lIlIllIllIIl[59]], lIlIllIllIIl[59], lIlIllIllIIl[13], lIlIllIllIIl[36], lIlIllIllIIl[0]);
        RAIDS_FARMING21 = new M(lIlIllIlIllI[lIlIllIllIIl[60]], lIlIllIllIIl[60], lIlIllIllIIl[9], lIlIllIllIIl[43], lIlIllIllIIl[0]);
        RAIDS_FARMING22 = new M(lIlIllIlIllI[lIlIllIllIIl[61]], lIlIllIllIIl[61], lIlIllIllIIl[11], lIlIllIllIIl[43], lIlIllIllIIl[0]);
        RAIDS_FARMING23 = new M(lIlIllIlIllI[lIlIllIllIIl[62]], lIlIllIllIIl[62], lIlIllIllIIl[13], lIlIllIllIIl[43], lIlIllIllIIl[0]);
        RAIDS_GUARDIANS1 = new M(lIlIllIlIllI[lIlIllIllIIl[63]], lIlIllIllIIl[63], lIlIllIllIIl[9], lIlIllIllIIl[25], lIlIllIllIIl[12]);
        RAIDS_GUARDIANS2 = new M(lIlIllIlIllI[lIlIllIllIIl[64]], lIlIllIllIIl[64], lIlIllIllIIl[11], lIlIllIllIIl[25], lIlIllIllIIl[12]);
        RAIDS_GUARDIANS3 = new M(lIlIllIlIllI[lIlIllIllIIl[65]], lIlIllIllIIl[65], lIlIllIllIIl[13], lIlIllIllIIl[25], lIlIllIllIIl[12]);
        RAIDS_VESPULA1 = new M(lIlIllIlIllI[lIlIllIllIIl[66]], lIlIllIllIIl[66], lIlIllIllIIl[9], lIlIllIllIIl[28], lIlIllIllIIl[12]);
        RAIDS_VESPULA2 = new M(lIlIllIlIllI[lIlIllIllIIl[67]], lIlIllIllIIl[67], lIlIllIllIIl[11], lIlIllIllIIl[28], lIlIllIllIIl[12]);
        RAIDS_VESPULA3 = new M(lIlIllIlIllI[lIlIllIllIIl[68]], lIlIllIllIIl[68], lIlIllIllIIl[13], lIlIllIllIIl[28], lIlIllIllIIl[12]);
        RAIDS_CRABS1 = new M(lIlIllIlIllI[lIlIllIllIIl[69]], lIlIllIllIIl[69], lIlIllIllIIl[9], lIlIllIllIIl[36], lIlIllIllIIl[12]);
        RAIDS_CRABS2 = new M(lIlIllIlIllI[lIlIllIllIIl[70]], lIlIllIllIIl[70], lIlIllIllIIl[11], lIlIllIllIIl[36], lIlIllIllIIl[12]);
        RAIDS_CRABS3 = new M(lIlIllIlIllI[lIlIllIllIIl[71]], lIlIllIllIIl[71], lIlIllIllIIl[13], lIlIllIllIIl[36], lIlIllIllIIl[12]);
        RAIDS_EMPTY = new M(lIlIllIlIllI[lIlIllIllIIl[72]], lIlIllIllIIl[72], lIlIllIllIIl[7], lIlIllIllIIl[7], lIlIllIllIIl[7]);
        M[] mArr = new M[lIlIllIllIIl[73]];
        mArr[lIlIllIllIIl[7]] = RAIDS_LOBBY1;
        mArr[lIlIllIllIIl[0]] = RAIDS_LOBBY2;
        mArr[lIlIllIllIIl[12]] = RAIDS_LOBBY3;
        mArr[lIlIllIllIIl[1]] = RAIDS_START1;
        mArr[lIlIllIllIIl[15]] = RAIDS_START2;
        mArr[lIlIllIllIIl[16]] = RAIDS_START3;
        mArr[lIlIllIllIIl[17]] = RAIDS_END1;
        mArr[lIlIllIllIIl[19]] = RAIDS_END2;
        mArr[lIlIllIllIIl[3]] = RAIDS_END3;
        mArr[lIlIllIllIIl[20]] = RAIDS_SCAVENGERS11;
        mArr[lIlIllIllIIl[22]] = RAIDS_SCAVENGERS12;
        mArr[lIlIllIllIIl[23]] = RAIDS_SCAVENGERS13;
        mArr[lIlIllIllIIl[24]] = RAIDS_SHAMANS1;
        mArr[lIlIllIllIIl[26]] = RAIDS_SHAMANS2;
        mArr[lIlIllIllIIl[4]] = RAIDS_SHAMANS3;
        mArr[lIlIllIllIIl[27]] = RAIDS_VASA1;
        mArr[lIlIllIllIIl[29]] = RAIDS_VASA2;
        mArr[lIlIllIllIIl[30]] = RAIDS_VASA3;
        mArr[lIlIllIllIIl[31]] = RAIDS_VANGUARDS1;
        mArr[lIlIllIllIIl[33]] = RAIDS_VANGUARDS2;
        mArr[lIlIllIllIIl[34]] = RAIDS_VANGUARDS3;
        mArr[lIlIllIllIIl[35]] = RAIDS_ICE_DEMON1;
        mArr[lIlIllIllIIl[37]] = RAIDS_ICE_DEMON2;
        mArr[lIlIllIllIIl[38]] = RAIDS_ICE_DEMON3;
        mArr[lIlIllIllIIl[6]] = RAIDS_THIEVING1;
        mArr[lIlIllIllIIl[40]] = RAIDS_THIEVING2;
        mArr[lIlIllIllIIl[41]] = RAIDS_THIEVING3;
        mArr[lIlIllIllIIl[42]] = RAIDS_FARMING11;
        mArr[lIlIllIllIIl[44]] = RAIDS_FARMING12;
        mArr[lIlIllIllIIl[45]] = RAIDS_FARMING13;
        mArr[lIlIllIllIIl[46]] = RAIDS_SCAVENGERS21;
        mArr[lIlIllIllIIl[47]] = RAIDS_SCAVENGERS22;
        mArr[lIlIllIllIIl[8]] = RAIDS_SCAVENGERS23;
        mArr[lIlIllIllIIl[48]] = RAIDS_MUTTADILES1;
        mArr[lIlIllIllIIl[49]] = RAIDS_MUTTADILES2;
        mArr[lIlIllIllIIl[50]] = RAIDS_MUTTADILES3;
        mArr[lIlIllIllIIl[51]] = RAIDS_MYSTICS1;
        mArr[lIlIllIllIIl[52]] = RAIDS_MYSTICS2;
        mArr[lIlIllIllIIl[53]] = RAIDS_MYSTICS3;
        mArr[lIlIllIllIIl[54]] = RAIDS_TEKTON1;
        mArr[lIlIllIllIIl[55]] = RAIDS_TEKTON2;
        mArr[lIlIllIllIIl[56]] = RAIDS_TEKTON3;
        mArr[lIlIllIllIIl[57]] = RAIDS_TIGHTROPE1;
        mArr[lIlIllIllIIl[58]] = RAIDS_TIGHTROPE2;
        mArr[lIlIllIllIIl[59]] = RAIDS_TIGHTROPE3;
        mArr[lIlIllIllIIl[60]] = RAIDS_FARMING21;
        mArr[lIlIllIllIIl[61]] = RAIDS_FARMING22;
        mArr[lIlIllIllIIl[62]] = RAIDS_FARMING23;
        mArr[lIlIllIllIIl[63]] = RAIDS_GUARDIANS1;
        mArr[lIlIllIllIIl[64]] = RAIDS_GUARDIANS2;
        mArr[lIlIllIllIIl[65]] = RAIDS_GUARDIANS3;
        mArr[lIlIllIllIIl[66]] = RAIDS_VESPULA1;
        mArr[lIlIllIllIIl[67]] = RAIDS_VESPULA2;
        mArr[lIlIllIllIIl[68]] = RAIDS_VESPULA3;
        mArr[lIlIllIllIIl[69]] = RAIDS_CRABS1;
        mArr[lIlIllIllIIl[70]] = RAIDS_CRABS2;
        mArr[lIlIllIllIIl[71]] = RAIDS_CRABS3;
        mArr[lIlIllIllIIl[72]] = RAIDS_EMPTY;
        $VALUES = mArr;
    }

    private static boolean lllIIIIIllllII(int i, int i2) {
        return i == i2;
    }
}
