package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.i  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/i.class */
public final class EnumC0008i {
    public static final /* synthetic */ EnumC0008i MONKFISH;
    public static final /* synthetic */ EnumC0008i LOBSTER;
    private final /* synthetic */ int materialId;
    private final /* synthetic */ int craftingOption;
    public static final /* synthetic */ EnumC0008i SHRIMP;
    public static final /* synthetic */ EnumC0008i KARAMBWAN;
    private static /* synthetic */ int[] lllIIlllIll;
    public static final /* synthetic */ EnumC0008i BASS;
    public static final /* synthetic */ EnumC0008i TROUT;
    private final /* synthetic */ int finishedId;
    public static final /* synthetic */ EnumC0008i SWORDFISH;
    public static final /* synthetic */ EnumC0008i ANCHOVIES;
    public static final /* synthetic */ EnumC0008i MANTA_RAY;
    public static final /* synthetic */ EnumC0008i SEA_TURTLE;
    private static /* synthetic */ String[] lllIIlllIlI;
    public static final /* synthetic */ EnumC0008i SHARK;
    private static final /* synthetic */ EnumC0008i[] $VALUES;
    public static final /* synthetic */ EnumC0008i DARK_CRAB;
    public static final /* synthetic */ EnumC0008i SARDINE;
    public static final /* synthetic */ EnumC0008i SALMON;
    public static final /* synthetic */ EnumC0008i ANGLERFISH;
    public static final /* synthetic */ EnumC0008i TUNA;

    private static String lIlIlllIlIllII(String llllllllllllllllIIlIIllIlllllllI, String llllllllllllllllIIlIIllIllllllIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlllIIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllIllllllIl.getBytes(StandardCharsets.UTF_8)), lllIIlllIll[23]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIlllIll[5], llllllllllllllllIIlIIlllIIIIIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllIlllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIllIllllllll) {
            llllllllllllllllIIlIIllIllllllll.printStackTrace();
            return null;
        }
    }

    public static EnumC0008i valueOf(String str) {
        return (EnumC0008i) Enum.valueOf(EnumC0008i.class, str);
    }

    private static boolean lIlIlllIlIllll(int i, int i2) {
        return i < i2;
    }

    private EnumC0008i(String str, int i, int i2, int i3, int i4) {
        this.materialId = i2;
        this.finishedId = i3;
        this.craftingOption = i4;
    }

    static {
        lIlIlllIlIlllI();
        lIlIlllIlIllIl();
        SHRIMP = new EnumC0008i(lllIIlllIlI[lllIIlllIll[0]], lllIIlllIll[0], lllIIlllIll[1], lllIIlllIll[1], lllIIlllIll[2]);
        ANCHOVIES = new EnumC0008i(lllIIlllIlI[lllIIlllIll[2]], lllIIlllIll[2], lllIIlllIll[3], lllIIlllIll[4], lllIIlllIll[2]);
        SARDINE = new EnumC0008i(lllIIlllIlI[lllIIlllIll[5]], lllIIlllIll[5], lllIIlllIll[6], lllIIlllIll[7], lllIIlllIll[2]);
        TROUT = new EnumC0008i(lllIIlllIlI[lllIIlllIll[8]], lllIIlllIll[8], lllIIlllIll[9], lllIIlllIll[10], lllIIlllIll[2]);
        SALMON = new EnumC0008i(lllIIlllIlI[lllIIlllIll[11]], lllIIlllIll[11], lllIIlllIll[12], lllIIlllIll[13], lllIIlllIll[2]);
        TUNA = new EnumC0008i(lllIIlllIlI[lllIIlllIll[14]], lllIIlllIll[14], lllIIlllIll[15], lllIIlllIll[16], lllIIlllIll[2]);
        KARAMBWAN = new EnumC0008i(lllIIlllIlI[lllIIlllIll[17]], lllIIlllIll[17], lllIIlllIll[18], lllIIlllIll[19], lllIIlllIll[2]);
        LOBSTER = new EnumC0008i(lllIIlllIlI[lllIIlllIll[20]], lllIIlllIll[20], lllIIlllIll[21], lllIIlllIll[22], lllIIlllIll[2]);
        BASS = new EnumC0008i(lllIIlllIlI[lllIIlllIll[23]], lllIIlllIll[23], lllIIlllIll[24], lllIIlllIll[25], lllIIlllIll[2]);
        SWORDFISH = new EnumC0008i(lllIIlllIlI[lllIIlllIll[26]], lllIIlllIll[26], lllIIlllIll[27], lllIIlllIll[28], lllIIlllIll[2]);
        MONKFISH = new EnumC0008i(lllIIlllIlI[lllIIlllIll[29]], lllIIlllIll[29], lllIIlllIll[30], lllIIlllIll[31], lllIIlllIll[2]);
        SHARK = new EnumC0008i(lllIIlllIlI[lllIIlllIll[32]], lllIIlllIll[32], lllIIlllIll[33], lllIIlllIll[34], lllIIlllIll[2]);
        SEA_TURTLE = new EnumC0008i(lllIIlllIlI[lllIIlllIll[35]], lllIIlllIll[35], lllIIlllIll[36], lllIIlllIll[37], lllIIlllIll[2]);
        ANGLERFISH = new EnumC0008i(lllIIlllIlI[lllIIlllIll[38]], lllIIlllIll[38], lllIIlllIll[39], lllIIlllIll[40], lllIIlllIll[2]);
        DARK_CRAB = new EnumC0008i(lllIIlllIlI[lllIIlllIll[41]], lllIIlllIll[41], lllIIlllIll[42], lllIIlllIll[43], lllIIlllIll[2]);
        MANTA_RAY = new EnumC0008i(lllIIlllIlI[lllIIlllIll[44]], lllIIlllIll[44], lllIIlllIll[45], lllIIlllIll[46], lllIIlllIll[2]);
        EnumC0008i[] enumC0008iArr = new EnumC0008i[lllIIlllIll[47]];
        enumC0008iArr[lllIIlllIll[0]] = SHRIMP;
        enumC0008iArr[lllIIlllIll[2]] = ANCHOVIES;
        enumC0008iArr[lllIIlllIll[5]] = SARDINE;
        enumC0008iArr[lllIIlllIll[8]] = TROUT;
        enumC0008iArr[lllIIlllIll[11]] = SALMON;
        enumC0008iArr[lllIIlllIll[14]] = TUNA;
        enumC0008iArr[lllIIlllIll[17]] = KARAMBWAN;
        enumC0008iArr[lllIIlllIll[20]] = LOBSTER;
        enumC0008iArr[lllIIlllIll[23]] = BASS;
        enumC0008iArr[lllIIlllIll[26]] = SWORDFISH;
        enumC0008iArr[lllIIlllIll[29]] = MONKFISH;
        enumC0008iArr[lllIIlllIll[32]] = SHARK;
        enumC0008iArr[lllIIlllIll[35]] = SEA_TURTLE;
        enumC0008iArr[lllIIlllIll[38]] = ANGLERFISH;
        enumC0008iArr[lllIIlllIll[41]] = DARK_CRAB;
        enumC0008iArr[lllIIlllIll[44]] = MANTA_RAY;
        $VALUES = enumC0008iArr;
    }

    public int C() {
        return this.craftingOption;
    }

    private static String lIlIlllIlIlIlI(String llllllllllllllllIIlIIlllIIIlIIll, String llllllllllllllllIIlIIlllIIIlIIlI) {
        String llllllllllllllllIIlIIlllIIIlIIll2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIlllIIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIIlllIIIlIIIl = new StringBuilder();
        char[] charArray = llllllllllllllllIIlIIlllIIIlIIlI.toCharArray();
        int llllllllllllllllIIlIIlllIIIIllll = lllIIlllIll[0];
        char[] charArray2 = llllllllllllllllIIlIIlllIIIlIIll2.toCharArray();
        int length = charArray2.length;
        int i = lllIIlllIll[0];
        while (lIlIlllIlIllll(i, length)) {
            char llllllllllllllllIIlIIlllIIIlIlII = charArray2[i];
            llllllllllllllllIIlIIlllIIIlIIIl.append((char) (llllllllllllllllIIlIIlllIIIlIlII ^ charArray[llllllllllllllllIIlIIlllIIIIllll % charArray.length]));
            "".length();
            llllllllllllllllIIlIIlllIIIIllll++;
            i++;
            "".length();
            if ((-((54 ^ 43) ^ (88 ^ 64))) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlIIlllIIIlIIIl);
    }

    private static void lIlIlllIlIlllI() {
        lllIIlllIll = new int[48];
        lllIIlllIll[0] = (93 ^ 67) & ((184 ^ 166) ^ (-1));
        lllIIlllIll[1] = (-30401) & 30717;
        lllIIlllIll[2] = " ".length();
        lllIIlllIll[3] = (-8207) & 8527;
        lllIIlllIll[4] = (-((-2485) & 12277)) & (-1) & 10111;
        lllIIlllIll[5] = "  ".length();
        lllIIlllIll[6] = (-((-67) & 24283)) & (-33) & 24575;
        lllIIlllIll[7] = (-4123) & 4447;
        lllIIlllIll[8] = "   ".length();
        lllIIlllIll[9] = (-3121) & 3455;
        lllIIlllIll[10] = (-((-1415) & 15799)) & (-3) & 14719;
        lllIIlllIll[11] = 155 ^ 159;
        lllIIlllIll[12] = (-1205) & 1535;
        lllIIlllIll[13] = (-19511) & 19839;
        lllIIlllIll[14] = (43 ^ 13) ^ (113 ^ 82);
        lllIIlllIll[15] = (-((-4323) & 29947)) & (-129) & 26111;
        lllIIlllIll[16] = (-((-33) & 16423)) & (-5649) & 22399;
        lllIIlllIll[17] = (((48 + 30) - 56) + 141) ^ (((48 + 45) - 1) + 73);
        lllIIlllIll[18] = (-28689) & 31830;
        lllIIlllIll[19] = (-((-6019) & 14243)) & (-4883) & 16250;
        lllIIlllIll[20] = (29 ^ 116) ^ (66 ^ 44);
        lllIIlllIll[21] = (-26243) & 26619;
        lllIIlllIll[22] = (-((-17451) & 32431)) & (-17409) & 32767;
        lllIIlllIll[23] = 143 ^ 135;
        lllIIlllIll[24] = (-12933) & 13295;
        lllIIlllIll[25] = (-((-4193) & 32499)) & (-1) & 28671;
        lllIIlllIll[26] = (237 ^ 169) ^ (76 ^ 1);
        lllIIlllIll[27] = (-((-4209) & 30845)) & (-5121) & 32127;
        lllIIlllIll[28] = (-14345) & 14717;
        lllIIlllIll[29] = (8 ^ 39) ^ (107 ^ 78);
        lllIIlllIll[30] = (-(88 ^ 75)) & (-24673) & 32634;
        lllIIlllIll[31] = (-((-21289) & 29677)) & (-16401) & 32734;
        lllIIlllIll[32] = 100 ^ 111;
        lllIIlllIll[33] = (-((-16763) & 21371)) & (-11393) & 16383;
        lllIIlllIll[34] = (-((-769) & 26493)) & (-513) & 26621;
        lllIIlllIll[35] = 145 ^ 157;
        lllIIlllIll[36] = (-((-8903) & 27367)) & (-8261) & 27119;
        lllIIlllIll[37] = (-((-10633) & 27115)) & (-5121) & 21999;
        lllIIlllIll[38] = (81 ^ 100) ^ (71 ^ 127);
        lllIIlllIll[39] = (-1) & 13439;
        lllIIlllIll[40] = (-17191) & 30631;
        lllIIlllIll[41] = 132 ^ 138;
        lllIIlllIll[42] = (-20801) & 32734;
        lllIIlllIll[43] = (-((-2071) & 18783)) & (-1) & 28648;
        lllIIlllIll[44] = 131 ^ 140;
        lllIIlllIll[45] = (-((-801) & 30585)) & (-2593) & 32765;
        lllIIlllIll[46] = (-12825) & 13215;
        lllIIlllIll[47] = (210 ^ 175) ^ (56 ^ 85);
    }

    public int B() {
        return this.finishedId;
    }

    private static void lIlIlllIlIllIl() {
        lllIIlllIlI = new String[lllIIlllIll[47]];
        lllIIlllIlI[lllIIlllIll[0]] = lIlIlllIlIlIlI("KgIlJBcp", "yJwmZ");
        lllIIlllIlI[lllIIlllIll[2]] = lIlIlllIlIlIlI("CRkwDzceHjYU", "HWsGx");
        lllIIlllIlI[lllIIlllIll[5]] = lIlIlllIlIlIlI("BTUXDycYMQ==", "VtEKn");
        lllIIlllIlI[lllIIlllIll[8]] = lIlIlllIlIlIlI("DScCOhw=", "YuMoH");
        lllIIlllIlI[lllIIlllIll[11]] = lIlIlllIlIlIlI("EDAcPgwN", "CqPsC");
        lllIIlllIlI[lllIIlllIll[14]] = lIlIlllIlIlIlI("ICUcEQ==", "tpRPA");
        lllIIlllIlI[lllIIlllIll[17]] = lIlIlllIlIlIll("4EK8fn2MKxbxTCK3Ca//Yw==", "UYCcx");
        lllIIlllIlI[lllIIlllIll[20]] = lIlIlllIlIlIll("T9MUDQX4smM=", "RpdAe");
        lllIIlllIlI[lllIIlllIll[23]] = lIlIlllIlIlIlI("JDIJGA==", "fsZKO");
        lllIIlllIlI[lllIIlllIll[26]] = lIlIlllIlIllII("2scgxssY6o2T2luMlo+KMA==", "ypNKI");
        lllIIlllIlI[lllIIlllIll[29]] = lIlIlllIlIllII("mc6HMe57agxvNntXb0uwEQ==", "cgLkV");
        lllIIlllIlI[lllIIlllIll[32]] = lIlIlllIlIllII("EmEpM6IxCrs=", "czHAC");
        lllIIlllIlI[lllIIlllIll[35]] = lIlIlllIlIllII("HOdOrerp8wVt724o03Ux2Q==", "iNWGH");
        lllIIlllIlI[lllIIlllIll[38]] = lIlIlllIlIlIll("4sbnnrt4VyVOpjqYGfpL7A==", "JMNoE");
        lllIIlllIlI[lllIIlllIll[41]] = lIlIlllIlIllII("gkHSQMYF5khzR+ET3dtkWg==", "kSvZc");
        lllIIlllIlI[lllIIlllIll[44]] = lIlIlllIlIllII("JhHIV5PB6s0isQP3JjRBrw==", "vPjpW");
    }

    private static String lIlIlllIlIlIll(String llllllllllllllllIIlIIlllIIlIIIll, String llllllllllllllllIIlIIlllIIlIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlllIIlIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIlllIll[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlllIIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIlllIIIlllll) {
            llllllllllllllllIIlIIlllIIIlllll.printStackTrace();
            return null;
        }
    }

    public int A() {
        return this.materialId;
    }

    public static EnumC0008i[] values() {
        return (EnumC0008i[]) $VALUES.clone();
    }
}
