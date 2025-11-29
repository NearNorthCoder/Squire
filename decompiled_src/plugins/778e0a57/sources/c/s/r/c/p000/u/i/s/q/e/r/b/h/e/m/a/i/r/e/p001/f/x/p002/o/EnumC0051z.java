package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.common.collect.Maps;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.z  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/z.class */
public final class EnumC0051z {
    public static final /* synthetic */ EnumC0051z HEAD_ENRAGED_AUTO_RIGHT;
    public static final /* synthetic */ EnumC0051z LEFT_HAND_DYING;
    public static final /* synthetic */ EnumC0051z HEAD_ENRAGED_MIDDLE_TO_LEFT;
    public static final /* synthetic */ EnumC0051z HEAD_DYING;
    public static final /* synthetic */ EnumC0051z UNKNOWN;
    public static final /* synthetic */ EnumC0051z HEAD_ENRAGED_RIGHT_TO_LEFT;
    public static final /* synthetic */ EnumC0051z HEAD_ENRAGED_MIDDLE_TO_RIGHT;
    public static final /* synthetic */ EnumC0051z HEAD_ENRAGED_RIGHT;
    public static final /* synthetic */ EnumC0051z HEAD_MIDDLE_TO_RIGHT;
    public static final /* synthetic */ EnumC0051z HEAD_MIDDLE;
    public static final /* synthetic */ EnumC0051z LEFT_HAND_LIGHTNING1;
    public static final /* synthetic */ EnumC0051z LEFT_HAND_IDLE2;
    private static final /* synthetic */ EnumC0051z[] $VALUES;
    public static final /* synthetic */ EnumC0051z HEAD_ENRAGED_RISING_2;
    private static /* synthetic */ String[] lIIlllllIIlI;
    public static final /* synthetic */ EnumC0051z HEAD_ENRAGED_MIDDLE;
    public static final /* synthetic */ EnumC0051z LEFT_HAND_HEAL2;
    public static final /* synthetic */ EnumC0051z HEAD_ENRAGED_AUTO_LEFT;
    private static final /* synthetic */ Map<Integer, EnumC0051z> LOOKUP;
    public static final /* synthetic */ EnumC0051z HEAD_MIDDLE_TO_LEFT;
    private final /* synthetic */ boolean move;
    public static final /* synthetic */ EnumC0051z LEFT_HAND_PORTALS2;
    public static final /* synthetic */ EnumC0051z LEFT_HAND_HEAL1;
    public static final /* synthetic */ EnumC0051z LEFT_HAND_LIGHTNING2;
    private final /* synthetic */ int id;
    public static final /* synthetic */ EnumC0051z LEFT_HAND_PORTALS1;
    public static final /* synthetic */ EnumC0051z LEFT_HAND_CRYSTALS2;
    private static /* synthetic */ int[] lIIlllllIlll;
    public static final /* synthetic */ EnumC0051z HEAD_ENRAGED_LEFT_TO_RIGHT;
    public static final /* synthetic */ EnumC0051z HEAD_ENRAGED_RIGHT_TO_MIDDLE;
    public static final /* synthetic */ EnumC0051z HEAD_ENRAGED_LEFT_TO_MIDDLE;
    public static final /* synthetic */ EnumC0051z HEAD_RISING_2;
    public static final /* synthetic */ EnumC0051z HEAD_ENRAGED_LEFT;
    public static final /* synthetic */ EnumC0051z HEAD_RISING_1;
    public static final /* synthetic */ EnumC0051z HEAD_AUTO_RIGHT;
    public static final /* synthetic */ EnumC0051z HEAD_LEFT;
    public static final /* synthetic */ EnumC0051z LEFT_HAND_CRIPPLED;
    public static final /* synthetic */ EnumC0051z HEAD_AUTO_LEFT;
    public static final /* synthetic */ EnumC0051z HEAD_ENRAGED_AUTO_MIDDLE;
    public static final /* synthetic */ EnumC0051z LEFT_HAND_CRYSTALS1;
    public static final /* synthetic */ EnumC0051z HEAD_RIGHT_TO_MIDDLE;
    public static final /* synthetic */ EnumC0051z LEFT_HAND_CRIPPLING;
    public static final /* synthetic */ EnumC0051z LEFT_HAND_IDLE1;
    public static final /* synthetic */ EnumC0051z HEAD_AUTO_MIDDLE;
    public static final /* synthetic */ EnumC0051z LEFT_HAND_UNCRIPPLING1;
    public static final /* synthetic */ EnumC0051z HEAD_LEFT_TO_MIDDLE;
    public static final /* synthetic */ EnumC0051z HEAD_RIGHT;
    public static final /* synthetic */ EnumC0051z HEAD_LEFT_TO_RIGHT;
    public static final /* synthetic */ EnumC0051z HEAD_RIGHT_TO_LEFT;
    public static final /* synthetic */ EnumC0051z LEFT_HAND_UNCRIPPLING2;

    private static String llIlIIlIIlllII(String lllllllllllllllIlllIIlllllllIlIl, String lllllllllllllllIlllIIlllllllIlII) {
        try {
            SecretKeySpec lllllllllllllllIlllIIllllllllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlllllllIlII.getBytes(StandardCharsets.UTF_8)), lIIlllllIlll[16]), "DES");
            Cipher lllllllllllllllIlllIIlllllllIlll = Cipher.getInstance("DES");
            lllllllllllllllIlllIIlllllllIlll.init(lIIlllllIlll[4], lllllllllllllllIlllIIllllllllIII);
            return new String(lllllllllllllllIlllIIlllllllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlllllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIlllllllIllI) {
            lllllllllllllllIlllIIlllllllIllI.printStackTrace();
            return null;
        }
    }

    private EnumC0051z(String str, int i, int i2, boolean z) {
        this.id = i2;
        this.move = z;
    }

    private static boolean llIlIIlIllIIlI(Object obj) {
        return obj == null;
    }

    private static void llIlIIlIllIIIl() {
        lIIlllllIlll = new int[89];
        lIIlllllIlll[0] = (231 ^ 189) & ((230 ^ 188) ^ (-1));
        lIIlllllIlll[1] = -"  ".length();
        lIIlllllIlll[2] = " ".length();
        lIIlllllIlll[3] = (-((-23970) & 32179)) & (-16897) & 32439;
        lIIlllllIlll[4] = "  ".length();
        lIIlllllIlll[5] = (-((-7233) & 31833)) & (-833) & 32767;
        lIIlllllIlll[6] = "   ".length();
        lIIlllllIlll[7] = (-9030) & 16365;
        lIIlllllIlll[8] = (93 ^ 71) ^ (142 ^ 144);
        lIIlllllIlll[9] = (-8709) & 16045;
        lIIlllllIlll[10] = (((123 + 140) - 197) + 79) ^ (((121 + 59) - 117) + 85);
        lIIlllllIlll[11] = (-22) & 7359;
        lIIlllllIlll[12] = (147 ^ 163) ^ (29 ^ 43);
        lIIlllllIlll[13] = (-((-20481) & 28993)) & (-529) & 16379;
        lIIlllllIlll[14] = 71 ^ 64;
        lIIlllllIlll[15] = (-17218) & 24557;
        lIIlllllIlll[16] = 36 ^ 44;
        lIIlllllIlll[17] = (-((-4257) & 21427)) & (-8257) & 32767;
        lIIlllllIlll[18] = (((93 + 83) - 101) + 79) ^ (((3 + 97) - (-15)) + 32);
        lIIlllllIlll[19] = (-24897) & 32238;
        lIIlllllIlll[20] = (((38 + 109) - 137) + 143) ^ (((81 + 40) - (-10)) + 16);
        lIIlllllIlll[21] = (-((-23039) & 31231)) & (-17153) & 32687;
        lIIlllllIlll[22] = 57 ^ 50;
        lIIlllllIlll[23] = (-1) & 7344;
        lIIlllllIlll[24] = 53 ^ 57;
        lIIlllllIlll[25] = (-25155) & 32499;
        lIIlllllIlll[26] = 56 ^ 53;
        lIIlllllIlll[27] = (-270) & 7615;
        lIIlllllIlll[28] = 205 ^ 195;
        lIIlllllIlll[29] = (-8457) & 15803;
        lIIlllllIlll[30] = (108 ^ 113) ^ (6 ^ 20);
        lIIlllllIlll[31] = (-16450) & 23797;
        lIIlllllIlll[32] = 89 ^ 73;
        lIIlllllIlll[33] = (-325) & 7679;
        lIIlllllIlll[34] = 54 ^ 39;
        lIIlllllIlll[35] = (-((-21709) & 30669)) & (-65) & 16380;
        lIIlllllIlll[36] = 148 ^ 134;
        lIIlllllIlll[37] = (-((-11383) & 12151)) & (-16449) & 24573;
        lIIlllllIlll[38] = 65 ^ 82;
        lIIlllllIlll[39] = (-(238 ^ 175)) & (-514) & 7935;
        lIIlllllIlll[40] = (((76 + 29) - 59) + 81) ^ (99 ^ 8);
        lIIlllllIlll[41] = (-((-7281) & 32625)) & (-1) & 32703;
        lIIlllllIlll[42] = (((144 + 140) - 281) + 160) ^ (((90 + 14) - 59) + 137);
        lIIlllllIlll[43] = (-8219) & 15578;
        lIIlllllIlll[44] = " ".length() ^ (182 ^ 161);
        lIIlllllIlll[45] = (-((-1163) & 9915)) & (-1) & 16113;
        lIIlllllIlll[46] = 99 ^ 116;
        lIIlllllIlll[47] = (-((-387) & 25487)) & (-2) & 32463;
        lIIlllllIlll[48] = (((103 + 170) - 194) + 140) ^ (((68 + 79) - 129) + 177);
        lIIlllllIlll[49] = (-24884) & 32247;
        lIIlllllIlll[50] = (((102 + 102) - 97) + 24) ^ (((5 + 2) - (-15)) + 132);
        lIIlllllIlll[51] = (-((-11905) & 28595)) & (-521) & 24575;
        lIIlllllIlll[52] = (174 ^ 165) ^ (47 ^ 62);
        lIIlllllIlll[53] = (-((-30149) & 30701)) & (-16642) & 24559;
        lIIlllllIlll[54] = (71 ^ 123) ^ (38 ^ 1);
        lIIlllllIlll[55] = (-((-161) & 25273)) & (-33) & 32511;
        lIIlllllIlll[56] = 145 ^ 141;
        lIIlllllIlll[57] = (-((-1420) & 26559)) & (-257) & 32763;
        lIIlllllIlll[58] = 93 ^ 64;
        lIIlllllIlll[59] = (-25107) & 32475;
        lIIlllllIlll[60] = (((4 + 100) - 18) + 71) ^ (((82 + 95) - 46) + 0);
        lIIlllllIlll[61] = (-"  ".length()) & (-8197) & 15567;
        lIIlllllIlll[62] = 20 ^ 11;
        lIIlllllIlll[63] = (-16405) & 23775;
        lIIlllllIlll[64] = (206 ^ 165) ^ (247 ^ 188);
        lIIlllllIlll[65] = (-786) & 8157;
        lIIlllllIlll[66] = (((67 + 101) - 27) + 31) ^ (((116 + 46) - 63) + 42);
        lIIlllllIlll[67] = (-((-4173) & 29039)) & (-1) & 32239;
        lIIlllllIlll[68] = 226 ^ 192;
        lIIlllllIlll[69] = (-((-9629) & 26526)) & (-8497) & 32767;
        lIIlllllIlll[70] = (17 ^ 64) ^ (25 ^ 107);
        lIIlllllIlll[71] = (-((-5315) & 22259)) & (-8193) & 32511;
        lIIlllllIlll[72] = 19 ^ 55;
        lIIlllllIlll[73] = (-((-1099) & 9803)) & (-16417) & 32496;
        lIIlllllIlll[74] = 127 ^ 90;
        lIIlllllIlll[75] = (-25131) & 32507;
        lIIlllllIlll[76] = (((23 + 95) - (-3)) + 17) ^ (((55 + 105) - (-1)) + 11);
        lIIlllllIlll[77] = (-((-5041) & 29629)) & (-1) & 31966;
        lIIlllllIlll[78] = (127 ^ 80) ^ (80 ^ 88);
        lIIlllllIlll[79] = (-9005) & 16383;
        lIIlllllIlll[80] = 89 ^ 113;
        lIIlllllIlll[81] = (-803) & 8182;
        lIIlllllIlll[82] = (((157 + 153) - 301) + 162) ^ (((43 + 45) - (-18)) + 24);
        lIIlllllIlll[83] = (-547) & 7927;
        lIIlllllIlll[84] = 139 ^ 161;
        lIIlllllIlll[85] = (-258) & 7639;
        lIIlllllIlll[86] = 144 ^ 187;
        lIIlllllIlll[87] = (-((-11409) & 28601)) & (-8193) & 32767;
        lIIlllllIlll[88] = 104 ^ 68;
    }

    public static EnumC0051z[] values() {
        return (EnumC0051z[]) $VALUES.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean] */
    static {
        llIlIIlIllIIIl();
        llIlIIlIllIIII();
        UNKNOWN = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[0]], lIIlllllIlll[0], lIIlllllIlll[1]);
        HEAD_RISING_1 = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[2]], lIIlllllIlll[2], lIIlllllIlll[3]);
        HEAD_RISING_2 = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[4]], lIIlllllIlll[4], lIIlllllIlll[5]);
        HEAD_MIDDLE = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[6]], lIIlllllIlll[6], lIIlllllIlll[7]);
        HEAD_RIGHT = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[8]], lIIlllllIlll[8], lIIlllllIlll[9]);
        HEAD_LEFT = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[10]], lIIlllllIlll[10], lIIlllllIlll[11]);
        HEAD_MIDDLE_TO_RIGHT = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[12]], lIIlllllIlll[12], lIIlllllIlll[13], lIIlllllIlll[2]);
        HEAD_RIGHT_TO_MIDDLE = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[14]], lIIlllllIlll[14], lIIlllllIlll[15], lIIlllllIlll[2]);
        HEAD_MIDDLE_TO_LEFT = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[16]], lIIlllllIlll[16], lIIlllllIlll[17], lIIlllllIlll[2]);
        HEAD_LEFT_TO_MIDDLE = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[18]], lIIlllllIlll[18], lIIlllllIlll[19], lIIlllllIlll[2]);
        HEAD_LEFT_TO_RIGHT = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[20]], lIIlllllIlll[20], lIIlllllIlll[21], lIIlllllIlll[2]);
        HEAD_RIGHT_TO_LEFT = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[22]], lIIlllllIlll[22], lIIlllllIlll[23], lIIlllllIlll[2]);
        HEAD_AUTO_MIDDLE = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[24]], lIIlllllIlll[24], lIIlllllIlll[25]);
        HEAD_AUTO_RIGHT = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[26]], lIIlllllIlll[26], lIIlllllIlll[27]);
        HEAD_AUTO_LEFT = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[28]], lIIlllllIlll[28], lIIlllllIlll[29]);
        HEAD_DYING = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[30]], lIIlllllIlll[30], lIIlllllIlll[31]);
        LEFT_HAND_IDLE1 = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[32]], lIIlllllIlll[32], lIIlllllIlll[33]);
        LEFT_HAND_CRYSTALS1 = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[34]], lIIlllllIlll[34], lIIlllllIlll[35]);
        LEFT_HAND_HEAL1 = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[36]], lIIlllllIlll[36], lIIlllllIlll[37]);
        LEFT_HAND_LIGHTNING1 = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[38]], lIIlllllIlll[38], lIIlllllIlll[39]);
        LEFT_HAND_PORTALS1 = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[40]], lIIlllllIlll[40], lIIlllllIlll[41]);
        LEFT_HAND_CRIPPLING = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[42]], lIIlllllIlll[42], lIIlllllIlll[43]);
        LEFT_HAND_CRIPPLED = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[44]], lIIlllllIlll[44], lIIlllllIlll[45]);
        LEFT_HAND_UNCRIPPLING1 = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[46]], lIIlllllIlll[46], lIIlllllIlll[47]);
        LEFT_HAND_UNCRIPPLING2 = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[48]], lIIlllllIlll[48], lIIlllllIlll[49]);
        LEFT_HAND_IDLE2 = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[50]], lIIlllllIlll[50], lIIlllllIlll[51]);
        LEFT_HAND_CRYSTALS2 = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[52]], lIIlllllIlll[52], lIIlllllIlll[53]);
        LEFT_HAND_HEAL2 = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[54]], lIIlllllIlll[54], lIIlllllIlll[55]);
        LEFT_HAND_LIGHTNING2 = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[56]], lIIlllllIlll[56], lIIlllllIlll[57]);
        LEFT_HAND_PORTALS2 = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[58]], lIIlllllIlll[58], lIIlllllIlll[59]);
        LEFT_HAND_DYING = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[60]], lIIlllllIlll[60], lIIlllllIlll[61]);
        HEAD_ENRAGED_AUTO_MIDDLE = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[62]], lIIlllllIlll[62], lIIlllllIlll[63]);
        HEAD_ENRAGED_AUTO_LEFT = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[64]], lIIlllllIlll[64], lIIlllllIlll[65]);
        HEAD_ENRAGED_AUTO_RIGHT = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[66]], lIIlllllIlll[66], lIIlllllIlll[67]);
        HEAD_ENRAGED_MIDDLE = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[68]], lIIlllllIlll[68], lIIlllllIlll[69]);
        HEAD_ENRAGED_LEFT = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[70]], lIIlllllIlll[70], lIIlllllIlll[71]);
        HEAD_ENRAGED_RIGHT = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[72]], lIIlllllIlll[72], lIIlllllIlll[73]);
        HEAD_ENRAGED_MIDDLE_TO_LEFT = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[74]], lIIlllllIlll[74], lIIlllllIlll[75], lIIlllllIlll[2]);
        HEAD_ENRAGED_LEFT_TO_MIDDLE = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[76]], lIIlllllIlll[76], lIIlllllIlll[77], lIIlllllIlll[2]);
        HEAD_ENRAGED_LEFT_TO_RIGHT = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[78]], lIIlllllIlll[78], lIIlllllIlll[79], lIIlllllIlll[2]);
        HEAD_ENRAGED_RIGHT_TO_LEFT = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[80]], lIIlllllIlll[80], lIIlllllIlll[81], lIIlllllIlll[2]);
        HEAD_ENRAGED_MIDDLE_TO_RIGHT = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[82]], lIIlllllIlll[82], lIIlllllIlll[83], lIIlllllIlll[2]);
        HEAD_ENRAGED_RIGHT_TO_MIDDLE = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[84]], lIIlllllIlll[84], lIIlllllIlll[85], lIIlllllIlll[2]);
        HEAD_ENRAGED_RISING_2 = new EnumC0051z(lIIlllllIIlI[lIIlllllIlll[86]], lIIlllllIlll[86], lIIlllllIlll[87]);
        EnumC0051z[] enumC0051zArr = new EnumC0051z[lIIlllllIlll[88]];
        enumC0051zArr[lIIlllllIlll[0]] = UNKNOWN;
        enumC0051zArr[lIIlllllIlll[2]] = HEAD_RISING_1;
        enumC0051zArr[lIIlllllIlll[4]] = HEAD_RISING_2;
        enumC0051zArr[lIIlllllIlll[6]] = HEAD_MIDDLE;
        enumC0051zArr[lIIlllllIlll[8]] = HEAD_RIGHT;
        enumC0051zArr[lIIlllllIlll[10]] = HEAD_LEFT;
        enumC0051zArr[lIIlllllIlll[12]] = HEAD_MIDDLE_TO_RIGHT;
        enumC0051zArr[lIIlllllIlll[14]] = HEAD_RIGHT_TO_MIDDLE;
        enumC0051zArr[lIIlllllIlll[16]] = HEAD_MIDDLE_TO_LEFT;
        enumC0051zArr[lIIlllllIlll[18]] = HEAD_LEFT_TO_MIDDLE;
        enumC0051zArr[lIIlllllIlll[20]] = HEAD_LEFT_TO_RIGHT;
        enumC0051zArr[lIIlllllIlll[22]] = HEAD_RIGHT_TO_LEFT;
        enumC0051zArr[lIIlllllIlll[24]] = HEAD_AUTO_MIDDLE;
        enumC0051zArr[lIIlllllIlll[26]] = HEAD_AUTO_RIGHT;
        enumC0051zArr[lIIlllllIlll[28]] = HEAD_AUTO_LEFT;
        enumC0051zArr[lIIlllllIlll[30]] = HEAD_DYING;
        enumC0051zArr[lIIlllllIlll[32]] = LEFT_HAND_IDLE1;
        enumC0051zArr[lIIlllllIlll[34]] = LEFT_HAND_CRYSTALS1;
        enumC0051zArr[lIIlllllIlll[36]] = LEFT_HAND_HEAL1;
        enumC0051zArr[lIIlllllIlll[38]] = LEFT_HAND_LIGHTNING1;
        enumC0051zArr[lIIlllllIlll[40]] = LEFT_HAND_PORTALS1;
        enumC0051zArr[lIIlllllIlll[42]] = LEFT_HAND_CRIPPLING;
        enumC0051zArr[lIIlllllIlll[44]] = LEFT_HAND_CRIPPLED;
        enumC0051zArr[lIIlllllIlll[46]] = LEFT_HAND_UNCRIPPLING1;
        enumC0051zArr[lIIlllllIlll[48]] = LEFT_HAND_UNCRIPPLING2;
        enumC0051zArr[lIIlllllIlll[50]] = LEFT_HAND_IDLE2;
        enumC0051zArr[lIIlllllIlll[52]] = LEFT_HAND_CRYSTALS2;
        enumC0051zArr[lIIlllllIlll[54]] = LEFT_HAND_HEAL2;
        enumC0051zArr[lIIlllllIlll[56]] = LEFT_HAND_LIGHTNING2;
        enumC0051zArr[lIIlllllIlll[58]] = LEFT_HAND_PORTALS2;
        enumC0051zArr[lIIlllllIlll[60]] = LEFT_HAND_DYING;
        enumC0051zArr[lIIlllllIlll[62]] = HEAD_ENRAGED_AUTO_MIDDLE;
        enumC0051zArr[lIIlllllIlll[64]] = HEAD_ENRAGED_AUTO_LEFT;
        enumC0051zArr[lIIlllllIlll[66]] = HEAD_ENRAGED_AUTO_RIGHT;
        enumC0051zArr[lIIlllllIlll[68]] = HEAD_ENRAGED_MIDDLE;
        enumC0051zArr[lIIlllllIlll[70]] = HEAD_ENRAGED_LEFT;
        enumC0051zArr[lIIlllllIlll[72]] = HEAD_ENRAGED_RIGHT;
        enumC0051zArr[lIIlllllIlll[74]] = HEAD_ENRAGED_MIDDLE_TO_LEFT;
        enumC0051zArr[lIIlllllIlll[76]] = HEAD_ENRAGED_LEFT_TO_MIDDLE;
        enumC0051zArr[lIIlllllIlll[78]] = HEAD_ENRAGED_LEFT_TO_RIGHT;
        enumC0051zArr[lIIlllllIlll[80]] = HEAD_ENRAGED_RIGHT_TO_LEFT;
        enumC0051zArr[lIIlllllIlll[82]] = HEAD_ENRAGED_MIDDLE_TO_RIGHT;
        enumC0051zArr[lIIlllllIlll[84]] = HEAD_ENRAGED_RIGHT_TO_MIDDLE;
        enumC0051zArr[lIIlllllIlll[86]] = HEAD_ENRAGED_RISING_2;
        $VALUES = enumC0051zArr;
        LOOKUP = Maps.uniqueIndex(Arrays.asList(values()), (v0) -> {
            return v0.bw();
        });
    }

    private static String llIlIIlIIllIll(String lllllllllllllllIlllIlIIIIIIlIlll, String lllllllllllllllIlllIlIIIIIIlIllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIIIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlllIlIIIIIIlIllI.toCharArray();
        int lllllllllllllllIlllIlIIIIIIlIIll = lIIlllllIlll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIlllllIlll[0];
        while (llIlIIlIllIIll(i, length)) {
            char lllllllllllllllIlllIlIIIIIIllIII = charArray2[i];
            sb.append((char) (lllllllllllllllIlllIlIIIIIIllIII ^ charArray[lllllllllllllllIlllIlIIIIIIlIIll % charArray.length]));
            "".length();
            lllllllllllllllIlllIlIIIIIIlIIll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String llIlIIlIIllIlI(String lllllllllllllllIlllIlIIIIIIIIIII, String lllllllllllllllIlllIlIIIIIIIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIIIIIIIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIIIIIIIIlII.init(lIIlllllIlll[4], secretKeySpec);
            return new String(lllllllllllllllIlllIlIIIIIIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIIIIIIIIIll) {
            lllllllllllllllIlllIlIIIIIIIIIll.printStackTrace();
            return null;
        }
    }

    private static void llIlIIlIllIIII() {
        lIIlllllIIlI = new String[lIIlllllIlll[88]];
        lIIlllllIIlI[lIIlllllIlll[0]] = llIlIIlIIllIlI("+0YK1PNWvpA=", "NmQwP");
        lIIlllllIIlI[lIIlllllIlll[2]] = llIlIIlIIllIll("AycOKzcZKxwmJgw9fg==", "KbOoh");
        lIIlllllIIlI[lIIlllllIlll[4]] = llIlIIlIIlllII("pyGOgZoSxEFq3smuBm4caw==", "MdAui");
        lIIlllllIIlI[lIIlllllIlll[6]] = llIlIIlIIllIll("HjI0KzcbPjErJBM=", "Vwuoh");
        lIIlllllIIlI[lIIlllllIlll[8]] = llIlIIlIIlllII("4WVD8FiIxsdBZNhS7SeKMg==", "CoYcf");
        lIIlllllIIlI[lIIlllllIlll[10]] = llIlIIlIIlllII("UKD1jdGRbXN+RoPIx12wkQ==", "ngIfR");
        lIIlllllIIlI[lIIlllllIlll[12]] = llIlIIlIIllIlI("Jg6KaXpEbKoCVkK1Dj/Xz8x3HJ/C0zu8", "nQpFO");
        lIIlllllIIlI[lIIlllllIlll[14]] = llIlIIlIIlllII("W2ClOsH9vctx4RYmEWNnNBJn7x7SxDkV", "qHNnH");
        lIIlllllIIlI[lIIlllllIlll[16]] = llIlIIlIIllIlI("rRGSxovWWlD2Mek9M/UTbv+CinsUPwQB", "tjIHj");
        lIIlllllIIlI[lIIlllllIlll[18]] = llIlIIlIIllIlI("BpcU2kuUM5zPl8vO56lyj6LbHMKCrjWx", "yJKWl");
        lIIlllllIIlI[lIIlllllIlll[20]] = llIlIIlIIlllII("PLz5No1AbM3PkW3AEoVw0J+SxvjpIRvp", "cWfYd");
        lIIlllllIIlI[lIIlllllIlll[22]] = llIlIIlIIlllII("WKrk6qbPER03ojiUs7PoXwa/ZcDjhFbG", "yfbRe");
        lIIlllllIIlI[lIIlllllIlll[24]] = llIlIIlIIllIlI("xxZFApMdSh5l+oB2WfxStVzbcLvU+RuD", "fFFkX");
        lIIlllllIIlI[lIIlllllIlll[26]] = llIlIIlIIlllII("LH2tTjJ9qcoNEN6H6mt1Uw==", "Vspab");
        lIIlllllIIlI[lIIlllllIlll[28]] = llIlIIlIIllIll("PhELJRU3AR4uFToRDDU=", "vTJaJ");
        lIIlllllIIlI[lIIlllllIlll[30]] = llIlIIlIIllIll("HQIOKTERHgYjKQ==", "UGOmn");
        lIIlllllIIlI[lIIlllllIlll[32]] = llIlIIlIIllIlI("YT3FHbdjfTNZPo6rgY/QMA==", "xvdxZ");
        lIIlllllIIlI[lIIlllllIlll[34]] = llIlIIlIIlllII("EFcj6t0bYWWQxIJj0Aqk3XeSpzVXhBxM", "elxsO");
        lIIlllllIIlI[lIIlllllIlll[36]] = llIlIIlIIllIlI("wp4Ib4mNdzU43EL5jLj1mQ==", "SFAel");
        lIIlllllIIlI[lIIlllllIlll[38]] = llIlIIlIIlllII("DB+MhbTJPsDDhZzQ71SYPWMugNWS+i3G", "pooUS");
        lIIlllllIIlI[lIIlllllIlll[40]] = llIlIIlIIllIlI("FOfjcGNj1kbSB3EUyHIe+ttZUVcQuvdK", "UvxuL");
        lIIlllllIIlI[lIIlllllIlll[42]] = llIlIIlIIllIll("JwcxJh4jAzk2HigQPiIRJws5NQ==", "kBwrA");
        lIIlllllIIlI[lIIlllllIlll[44]] = llIlIIlIIllIlI("50ovEpBZYtnTehRRqm323dl1rxaf0QDz", "jOthV");
        lIIlllllIIlI[lIIlllllIlll[46]] = llIlIIlIIllIlI("qBe2gkgU5GhKaCrnqEtuvetJFRLxC9yK", "mqGkM");
        lIIlllllIIlI[lIIlllllIlll[48]] = llIlIIlIIllIll("FDcPIjcQMwcyNw08CiQhCCIFPyYfQA==", "XrIvh");
        lIIlllllIIlI[lIIlllllIlll[50]] = llIlIIlIIllIll("GCY1AR0cIj0RHR0nPxBw", "TcsUB");
        lIIlllllIIlI[lIIlllllIlll[52]] = llIlIIlIIlllII("2xB728s/B5FVouSincX9ylMBGWSluE0r", "xvnHV");
        lIIlllllIIlI[lIIlllllIlll[54]] = llIlIIlIIllIlI("0czUVzZ9Rev12QDe38KclA==", "hFpLv");
        lIIlllllIIlI[lIIlllllIlll[56]] = llIlIIlIIllIll("HScVFTgZIx0FOB0rFAkzHysdBlU=", "QbSAg");
        lIIlllllIIlI[lIIlllllIlll[58]] = llIlIIlIIllIll("JSMVHyghJx0PKDkpAR82JTVh", "ifSKw");
        lIIlllllIIlI[lIIlllllIlll[60]] = llIlIIlIIlllII("RmF22kIlhBWsu1pBqOZjBQ==", "UHuMy");
        lIIlllllIIlI[lIIlllllIlll[62]] = llIlIIlIIlllII("wgh45y0hsT/hG7qj/jw8J/EgVwIEWAAsJANoTHyDVaY=", "sGsMz");
        lIIlllllIIlI[lIIlllllIlll[64]] = llIlIIlIIllIll("AyswIBgOICMlAA4qLiUSHyEuKAINOg==", "KnqdG");
        lIIlllllIIlI[lIIlllllIlll[66]] = llIlIIlIIllIll("LjEWLgsjOgUrEyMwCCsBMjsIOB0hPAM=", "ftWjT");
        lIIlllllIIlI[lIIlllllIlll[68]] = llIlIIlIIllIlI("zlJjHsol8HejFqmmrUHzkryZuqC/fmxk", "yBavA");
        lIIlllllIIlI[lIIlllllIlll[70]] = llIlIIlIIllIlI("iXXwbdtloy0pzvSQXLr0eqcbFPQqr6wN", "luQEa");
        lIIlllllIIlI[lIIlllllIlll[72]] = llIlIIlIIllIll("Bi4UPjkLJQc7IQsvCigvCSMB", "NkUzf");
        lIIlllllIIlI[lIIlllllIlll[74]] = llIlIIlIIllIlI("v3AGQ+ieqz0E8UzcKcJ7DXdQuxMviGI+fnqSxasA47g=", "UwQrI");
        lIIlllllIIlI[lIIlllllIlll[76]] = llIlIIlIIllIlI("Rd34KbwDTUGTh6eHewq8pkDERuPSbjuGGzfIQlEBmhw=", "RHKUf");
        lIIlllllIIlI[lIIlllllIlll[78]] = llIlIIlIIlllII("s59pfsaM8FeQqrSQhdyhfwRvbWoDmDUTwXphG1QwbHs=", "blTvN");
        lIIlllllIIlI[lIIlllllIlll[80]] = llIlIIlIIllIlI("hAmJHOzjpcQu/oIutlXsUHkygQglhC3rWmBRvCm4QBE=", "XOiZm");
        lIIlllllIIlI[lIIlllllIlll[82]] = llIlIIlIIllIll("Jx81CTcqFCYMLyoeKwAhKx44CDc7FSsfISgSIA==", "oZtMh");
        lIIlllllIIlI[lIIlllllIlll[84]] = llIlIIlIIllIlI("zYK4FEF/Kto5oKSba9L338KEkkFY3z0/ywoAw0okhRQ=", "Wluig");
        lIIlllllIIlI[lIIlllllIlll[86]] = llIlIIlIIlllII("eZnWJoHzyPWs+7mnpgdF5NqPwr0jfAbt", "doOcE");
    }

    public static EnumC0051z r(int i) {
        EnumC0051z enumC0051z = LOOKUP.get(Integer.valueOf(i));
        return llIlIIlIllIIlI(enumC0051z) ? UNKNOWN : enumC0051z;
    }

    public static EnumC0051z valueOf(String str) {
        return (EnumC0051z) Enum.valueOf(EnumC0051z.class, str);
    }

    private static boolean llIlIIlIllIIll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    private EnumC0051z(String str, int i, int i2) {
        this.id = i2;
        this.move = lIIlllllIlll[0];
    }

    public int bw() {
        return this.id;
    }

    public boolean bx() {
        return this.move;
    }
}
