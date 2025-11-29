package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalAmount;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Skill;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.util.RSTimeUnit;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.H  reason: invalid package */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/H.class */
public class H {
    private /* synthetic */ double aP;
    @Inject
    private /* synthetic */ ConfigManager aN;
    private static /* synthetic */ String[] lIIlllIIIIlI;
    private /* synthetic */ Instant aO;
    @Inject
    private /* synthetic */ Client g;
    @Inject
    private /* synthetic */ C0014o j;
    private static /* synthetic */ int[] lIIlllIIlllI;
    @Inject
    private /* synthetic */ D aG;
    private static final /* synthetic */ Logger aM;

    private static String llIlIIIIIIlIIl(String lllllllllllllllIlllIlIlllllllIlI, String lllllllllllllllIlllIlIlllllllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIlllllllIIl.getBytes(StandardCharsets.UTF_8)), lIIlllIIlllI[13]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlllIIlllI[8], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIlllllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIlllllllIll) {
            lllllllllllllllIlllIlIlllllllIll.printStackTrace();
            return null;
        }
    }

    private void n(int i) {
        double d;
        double d2;
        long j;
        Duration of = Duration.of(10 * this.g.getVarbitValue(lIIlllIIlllI[30]), RSTimeUnit.GAME_TICKS);
        if (llIlIIIIIllIlI(al() ? 1 : 0)) {
            d = 0.85d;
            "".length();
            if (" ".length() >= (89 ^ 93)) {
                return;
            }
        } else {
            d = 1.0d;
        }
        double d3 = d;
        if (llIlIIIIIllIlI(of.isZero() ? 1 : 0)) {
            d2 = d3;
            "".length();
            if ((21 ^ 17) <= 0) {
                return;
            }
        } else {
            d2 = 0.3d;
        }
        this.aP = d2;
        int i2 = lIIlllIIlllI[31] + (i * lIIlllIIlllI[32]);
        if (llIlIIIIlIIIII(this.aO) && llIlIIIIIlllIl(of.isZero() ? 1 : 0) && llIlIIIIlIIIIl(llIlIIIIIlllll(of.toMillis(), 18000L))) {
            this.aO = Instant.now().plus((TemporalAmount) of);
            "".length();
            if (((((106 + 173) - 267) + 167) ^ (((75 + 94) - 10) + 24)) <= (-" ".length())) {
                return;
            }
        } else if (!llIlIIIIIlllIl(of.isZero() ? 1 : 0) || llIlIIIIlIIIlI(llIlIIIIIlllll(of.toMillis(), 18000L))) {
            this.aO = null;
        }
        if (llIlIIIIlIIIll(this.aO)) {
            j = Duration.between(Instant.now(), this.aO).toMillis();
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        } else {
            j = 0;
        }
        long j2 = j;
        if (llIlIIIIlIIIll(this.aO) && llIlIIIIlIIlII(llIlIIIIIlllll(j2, 0L)) && llIlIIIIlIIIIl(llIlIIIIIlllll(j2, i2))) {
            this.aP = d3 - (((d3 - 0.3d) * j2) / i2);
        }
    }

    private double l(int i) {
        return ((((Math.min(Math.max(i, lIIlllIIlllI[0]), lIIlllIIlllI[2]) * lIIlllIIlllI[3]) / 64.0d) + 67.0d) / 100.0d) * this.aP;
    }

    private int ak() {
        C0018s l = this.j.l();
        int[] iArr = new int[lIIlllIIlllI[6]];
        iArr[lIIlllIIlllI[0]] = lIIlllIIlllI[20];
        iArr[lIIlllIIlllI[1]] = lIIlllIIlllI[21];
        iArr[lIIlllIIlllI[8]] = lIIlllIIlllI[22];
        iArr[lIIlllIIlllI[9]] = lIIlllIIlllI[23];
        double a2 = 0.0d + (l.a(iArr) * A.GOLD_BAR.Q());
        C0018s l2 = this.j.l();
        int[] iArr2 = new int[lIIlllIIlllI[6]];
        iArr2[lIIlllIIlllI[0]] = lIIlllIIlllI[24];
        iArr2[lIIlllIIlllI[1]] = lIIlllIIlllI[19];
        iArr2[lIIlllIIlllI[8]] = lIIlllIIlllI[25];
        iArr2[lIIlllIIlllI[9]] = lIIlllIIlllI[18];
        double a3 = a2 + (l2.a(iArr2) * A.COAL.Q());
        C0018s l3 = this.j.l();
        int[] iArr3 = new int[lIIlllIIlllI[1]];
        iArr3[lIIlllIIlllI[0]] = lIIlllIIlllI[26];
        double a4 = a3 + (l3.a(iArr3) * A.ADAMANTITE_BAR.Q());
        C0018s l4 = this.j.l();
        int[] iArr4 = new int[lIIlllIIlllI[1]];
        iArr4[lIIlllIIlllI[0]] = lIIlllIIlllI[27];
        double a5 = a4 + (l4.a(iArr4) * A.ADAMANTITE_ORE.Q());
        C0018s l5 = this.j.l();
        int[] iArr5 = new int[lIIlllIIlllI[1]];
        iArr5[lIIlllIIlllI[0]] = lIIlllIIlllI[28];
        double a6 = a5 + (l5.a(iArr5) * A.MITHRIL_BAR.Q());
        C0018s l6 = this.j.l();
        int[] iArr6 = new int[lIIlllIIlllI[1]];
        iArr6[lIIlllIIlllI[0]] = lIIlllIIlllI[29];
        return (int) Math.round(a6 + (l6.a(iArr6) * A.MITHRIL_ORE.Q()));
    }

    private static boolean llIlIIIIIllIll(int i, int i2) {
        return i < i2;
    }

    private static void llIlIIIIIllIIl() {
        lIIlllIIlllI = new int[38];
        lIIlllIIlllI[0] = (17 ^ 82) & ((52 ^ 119) ^ (-1));
        lIIlllIIlllI[1] = " ".length();
        lIIlllIIlllI[2] = 108 ^ 44;
        lIIlllIIlllI[3] = 235 ^ 168;
        lIIlllIIlllI[4] = 68 ^ 116;
        lIIlllIIlllI[5] = (166 ^ 158) ^ (168 ^ 132);
        lIIlllIIlllI[6] = (((92 + 132) - 212) + 144) ^ (((65 + 121) - 60) + 26);
        lIIlllIIlllI[7] = 97 ^ 122;
        lIIlllIIlllI[8] = "  ".length();
        lIIlllIIlllI[9] = "   ".length();
        lIIlllIIlllI[10] = 51 ^ 54;
        lIIlllIIlllI[11] = 84 ^ 82;
        lIIlllIIlllI[12] = (66 ^ 97) ^ (43 ^ 15);
        lIIlllIIlllI[13] = (((159 + 21) - 126) + 114) ^ (((123 + 105) - 136) + 68);
        lIIlllIIlllI[14] = (64 ^ 24) ^ (255 ^ 174);
        lIIlllIIlllI[15] = 186 ^ 176;
        lIIlllIIlllI[16] = 102 ^ 109;
        lIIlllIIlllI[17] = 36 ^ 40;
        lIIlllIIlllI[18] = (-((-9107) & 11219)) & (-20482) & 23037;
        lIIlllIIlllI[19] = (-((-24871) & 27959)) & (-29217) & 32757;
        lIIlllIIlllI[20] = (-((-6585) & 32249)) & (-641) & 28655;
        lIIlllIIlllI[21] = (-21643) & 23995;
        lIIlllIIlllI[22] = (-25153) & 27515;
        lIIlllIIlllI[23] = (-4681) & 7037;
        lIIlllIIlllI[24] = (-((-4481) & 32135)) & (-4097) & 32190;
        lIIlllIIlllI[25] = (-((-13047) & 15103)) & (-4641) & 7147;
        lIIlllIIlllI[26] = (-((-17305) & 21469)) & (-17537) & 24061;
        lIIlllIIlllI[27] = (-((-4937) & 22399)) & (-12289) & 30199;
        lIIlllIIlllI[28] = (-4801) & 7159;
        lIIlllIIlllI[29] = (-((-8383) & 32447)) & (-8257) & 32767;
        lIIlllIIlllI[30] = 129 ^ 153;
        lIIlllIIlllI[31] = (-((-4961) & 6119)) & (-1) & 11958;
        lIIlllIIlllI[32] = (-((-24795) & 31231)) & (-16387) & 23422;
        lIIlllIIlllI[33] = 68 ^ 73;
        lIIlllIIlllI[34] = (((31 + 83) - (-25)) + 35) ^ (((37 + 109) - 45) + 59);
        lIIlllIIlllI[35] = (-((-2113) & 26697)) & (-7170) & 32253;
        lIIlllIIlllI[36] = (-((-24597) & 30495)) & (-2050) & 32683;
        lIIlllIIlllI[37] = 68 ^ 75;
    }

    private static boolean llIlIIIIIllIlI(int i) {
        return i != 0;
    }

    private static String llIlIIIIIIIlll(String lllllllllllllllIlllIlIllllIlllIl, String lllllllllllllllIlllIlIllllIlllII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlIllllIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlllIlIllllIllIlI = lllllllllllllllIlllIlIllllIlllII.toCharArray();
        int lllllllllllllllIlllIlIllllIllIIl = lIIlllIIlllI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIlllIIlllI[0];
        while (llIlIIIIIllIll(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIlllIlIllllIllIlI[lllllllllllllllIlllIlIllllIllIIl % lllllllllllllllIlllIlIllllIllIlI.length]));
            "".length();
            lllllllllllllllIlllIlIllllIllIIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIlIIIIlIIlIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIlIIIIlIIlII(int i) {
        return i >= 0;
    }

    private static boolean llIlIIIIlIIIIl(int i) {
        return i <= 0;
    }

    private int a(boolean z, String str) {
        int i = lIIlllIIlllI[6];
        boolean equals = str.equals(lIIlllIIIIlI[lIIlllIIlllI[0]]);
        if (llIlIIIIIlllIl(equals ? 1 : 0)) {
            i += 2;
        }
        if (llIlIIIIIlllIl(equals ? 1 : 0) && llIlIIIIIllllI(this.j.k().w(), lIIlllIIlllI[7])) {
            i += 2;
        }
        if (!llIlIIIIIllIlI(z ? 1 : 0) || llIlIIIIIllIlI(str.contains(lIIlllIIIIlI[lIIlllIIlllI[1]]) ? 1 : 0)) {
            i++;
        }
        return i;
    }

    private static void llIlIIIIIllIII() {
        lIIlllIIIIlI = new String[lIIlllIIlllI[37]];
        lIIlllIIIIlI[lIIlllIIlllI[0]] = llIlIIIIIIIllI("r5UOx44YqNyciEr6HERwiQ==", "rmcRW");
        lIIlllIIIIlI[lIIlllIIlllI[1]] = llIlIIIIIIIlll("KA4nCw==", "oaKog");
        lIIlllIIIIlI[lIIlllIIlllI[8]] = llIlIIIIIIIllI("euXObIUNj18=", "WdQrK");
        lIIlllIIIIlI[lIIlllIIlllI[9]] = llIlIIIIIIIlll("", "vGIHm");
        lIIlllIIIIlI[lIIlllIIlllI[6]] = llIlIIIIIIIlll("FyMnJio=", "Dwbcf");
        lIIlllIIIIlI[lIIlllIIlllI[10]] = llIlIIIIIIIlll("GzEaHA==", "RcURt");
        lIIlllIIIIlI[lIIlllIIlllI[11]] = llIlIIIIIIlIIl("K+VyGQobhzo=", "BggCQ");
        lIIlllIIIIlI[lIIlllIIlllI[12]] = llIlIIIIIIIlll("Mx0KKg==", "lRXot");
        lIIlllIIIIlI[lIIlllIIlllI[13]] = llIlIIIIIIIllI("Lx5UY1Oirkw=", "gavTb");
        lIIlllIIIIlI[lIIlllIIlllI[14]] = llIlIIIIIIlIIl("MiJXMzFURMo=", "FMGZI");
        lIIlllIIIIlI[lIIlllIIlllI[15]] = llIlIIIIIIlIIl("v36dIopV1jI=", "GTZce");
        lIIlllIIIIlI[lIIlllIIlllI[16]] = llIlIIIIIIIllI("+SP/xBIX7Ww=", "ekekX");
        lIIlllIIIIlI[lIIlllIIlllI[17]] = llIlIIIIIIIlll("NjceKw==", "qXrOz");
        lIIlllIIIIlI[lIIlllIIlllI[33]] = llIlIIIIIIIllI("wStOvahNQS1JYVWJgZM38A==", "eUBao");
        lIIlllIIIIlI[lIIlllIIlllI[34]] = llIlIIIIIIIlll("KwUrDBg/KSsPIisNKwgyGgQkGTA8Hw==", "YlEkW");
    }

    private static int llIlIIIIIlllll(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static boolean llIlIIIIIllllI(int i, int i2) {
        return i > i2;
    }

    private static boolean llIlIIIIlIIIll(Object obj) {
        return obj != null;
    }

    private static boolean llIlIIIIlIIIlI(int i) {
        return i > 0;
    }

    private double m(int i) {
        double boostedSkillLevel = (lIIlllIIlllI[4] + this.g.getBoostedSkillLevel(Skill.AGILITY)) / 360.0d;
        int i2 = lIIlllIIlllI[0];
        C[] values = C.values();
        int length = values.length;
        int i3 = lIIlllIIlllI[0];
        while (llIlIIIIIllIll(i3, length)) {
            C c = values[i3];
            if (llIlIIIIIllIlI(Equipment.contains(c.items) ? 1 : 0)) {
                i2 += c.boost;
            }
            i3++;
            "".length();
            if ((((((41 + 12) - 17) + 102) ^ (((135 + 119) - 237) + 131)) & (((135 ^ 152) ^ " ".length()) ^ (-" ".length()))) != 0) {
                return 0.0d;
            }
        }
        if (llIlIIIIIlllII(i2, lIIlllIIlllI[5])) {
            i2 += 10;
        }
        return boostedSkillLevel * (1.0d + (i2 / 100.0d)) * 0.6d * i;
    }

    private static boolean llIlIIIIlIIIII(Object obj) {
        return obj == null;
    }

    private static boolean llIlIIIIIlllIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    public double aj() {
        AbstractC0007h X = this.aG.X();
        int a2 = B.a(X.g());
        boolean d = this.j.p().d(a2);
        int weight = this.g.getWeight() - ak();
        int round = ((int) Math.round(a((boolean) lIIlllIIlllI[0], a2))) + weight;
        int round2 = ((int) Math.round(a((boolean) lIIlllIIlllI[1], a2))) + weight;
        int a3 = a(d, X.g());
        double m = m(a3);
        n(a3);
        return llIlIIIIIllIlI(d ? 1 : 0) ? Math.round(((l(weight) * 9.0d) + (l(round) * 9.0d)) - m) : Math.round((((l(round) * 9.0d) + (l(weight) * 5.0d)) + (l(round2) * 4.0d)) - m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean al() {
        Integer num = (Integer) this.aN.getRSProfileConfiguration(lIIlllIIIIlI[lIIlllIIlllI[33]], lIIlllIIIIlI[lIIlllIIlllI[34]], Integer.class);
        if (llIlIIIIlIIIll(num) && llIlIIIIlIIlIl(num.intValue(), lIIlllIIlllI[35])) {
            int[] iArr = new int[lIIlllIIlllI[1]];
            iArr[lIIlllIIlllI[0]] = lIIlllIIlllI[36];
            if (llIlIIIIIllIlI(Equipment.contains(iArr) ? 1 : 0)) {
                ?? r0 = lIIlllIIlllI[1];
                "".length();
                return 0 != 0 ? (true ^ true) & ((!true) ^ true) : r0;
            }
        }
        return lIIlllIIlllI[0];
    }

    private static String llIlIIIIIIIllI(String lllllllllllllllIlllIlIlllllIllIl, String lllllllllllllllIlllIlIlllllIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIlllllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlllIIlllI[8], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIlllllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIlllllIlllI) {
            lllllllllllllllIlllIlIlllllIlllI.printStackTrace();
            return null;
        }
    }

    static {
        llIlIIIIIllIIl();
        llIlIIIIIllIII();
        aM = LoggerFactory.getLogger(H.class);
    }

    private static boolean llIlIIIIIlllII(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private double a(boolean z, int i) {
        double Q;
        String str;
        int i2;
        AbstractC0007h X = this.aG.X();
        String replace = X.g().toUpperCase().replace(lIIlllIIIIlI[lIIlllIIlllI[8]], lIIlllIIIIlI[lIIlllIIlllI[9]]).replace(lIIlllIIIIlI[lIIlllIIlllI[6]], lIIlllIIIIlI[lIIlllIIlllI[10]]).replace(lIIlllIIIIlI[lIIlllIIlllI[11]], lIIlllIIIIlI[lIIlllIIlllI[12]]);
        String replace2 = replace.replace(lIIlllIIIIlI[lIIlllIIlllI[13]], lIIlllIIIIlI[lIIlllIIlllI[14]]).replace(lIIlllIIIIlI[lIIlllIIlllI[15]], lIIlllIIIIlI[lIIlllIIlllI[16]]);
        if (llIlIIIIIllIlI(z ? 1 : 0)) {
            Q = A.GOLD_BAR.Q();
            "".length();
            if (((210 ^ 138) & ((71 ^ 31) ^ (-1))) > ((130 ^ 151) & ((75 ^ 94) ^ (-1)))) {
                return 0.0d;
            }
        } else {
            Q = A.COAL.Q();
        }
        double d = Q;
        int D = this.j.l().D();
        if (llIlIIIIIllIlI(this.j.p().d(i) ? 1 : 0)) {
            int[] iArr = new int[lIIlllIIlllI[1]];
            int i3 = lIIlllIIlllI[0];
            if (llIlIIIIIllIlI(X.g().contains(lIIlllIIIIlI[lIIlllIIlllI[17]]) ? 1 : 0)) {
                i2 = lIIlllIIlllI[18];
                "".length();
                if ((-" ".length()) >= 0) {
                    return 0.0d;
                }
            } else {
                i2 = lIIlllIIlllI[19];
            }
            iArr[i3] = i2;
            return d * Math.min(D, Bank.getCount(iArr));
        }
        int[] iArr2 = new int[lIIlllIIlllI[1]];
        iArr2[lIIlllIIlllI[0]] = A.valueOf(replace).P();
        int min = Math.min(D, Bank.getCount(iArr2));
        if (llIlIIIIIllIlI(z ? 1 : 0)) {
            str = replace2;
            "".length();
            if ("  ".length() > "   ".length()) {
                return 0.0d;
            }
        } else {
            str = replace;
        }
        return A.valueOf(str).Q() * min;
    }
}
