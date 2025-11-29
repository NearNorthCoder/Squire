/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Skill
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.util.RSTimeUnit
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.A;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.B;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.C;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.D;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.h;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.o;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
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

public class H {
    private /* synthetic */ double aP;
    @Inject
    private /* synthetic */ ConfigManager aN;
    private static /* synthetic */ String[] lIIlllIIIIlI;
    private /* synthetic */ Instant aO;
    @Inject
    private /* synthetic */ Client g;
    @Inject
    private /* synthetic */ o j;
    private static /* synthetic */ int[] lIIlllIIlllI;
    @Inject
    private /* synthetic */ D aG;
    private static final /* synthetic */ Logger aM;

    private static String llIlIIIIIIlIIl(String lllllllllllllllIlllIlIlllllllIII, String lllllllllllllllIlllIlIllllllIlll) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIllllllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIllllllIlll.getBytes(StandardCharsets.UTF_8)), lIIlllIIlllI[13]), "DES");
            Cipher lllllllllllllllIlllIlIllllllllII = Cipher.getInstance("DES");
            lllllllllllllllIlllIlIllllllllII.init(lIIlllIIlllI[8], lllllllllllllllIlllIlIllllllllIl);
            return new String(lllllllllllllllIlllIlIllllllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIlllllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIlllllllIll) {
            lllllllllllllllIlllIlIlllllllIll.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void n(int n2) {
        long lllllllllllllllIlllIllIIIIIIIllI;
        long l2;
        H lllllllllllllllIlllIllIIIIIIlIll;
        void lllllllllllllllIlllIllIIIIIIlIlI;
        double d2;
        void lllllllllllllllIlllIllIIIIIIlIIl;
        double lllllllllllllllIlllIllIIIIIIlIII;
        double d3;
        Duration duration = Duration.of(10L * (long)this.g.getVarbitValue(lIIlllIIlllI[30]), (TemporalUnit)RSTimeUnit.GAME_TICKS);
        if (H.llIlIIIIIllIlI(this.al() ? 1 : 0)) {
            d3 = 0.85;
            "".length();
            if (" ".length() >= (0x59 ^ 0x5D)) {
                return;
            }
        } else {
            d3 = lllllllllllllllIlllIllIIIIIIlIII = 1.0;
        }
        if (H.llIlIIIIIllIlI(lllllllllllllllIlllIllIIIIIIlIIl.isZero() ? 1 : 0)) {
            d2 = lllllllllllllllIlllIllIIIIIIlIII;
            "".length();
            if ((0x15 ^ 0x11) <= 0) {
                return;
            }
        } else {
            d2 = 0.3;
        }
        lllllllllllllllIlllIllIIIIIIlIll.aP = d2;
        int lllllllllllllllIlllIllIIIIIIIlll = lIIlllIIlllI[31] + lllllllllllllllIlllIllIIIIIIlIlI * lIIlllIIlllI[32];
        if (H.llIlIIIIlIIIII(lllllllllllllllIlllIllIIIIIIlIll.aO) && H.llIlIIIIIlllIl(lllllllllllllllIlllIllIIIIIIlIIl.isZero() ? 1 : 0) && H.llIlIIIIlIIIIl(H.llIlIIIIIlllll(lllllllllllllllIlllIllIIIIIIlIIl.toMillis(), 18000L))) {
            lllllllllllllllIlllIllIIIIIIlIll.aO = Instant.now().plus((TemporalAmount)lllllllllllllllIlllIllIIIIIIlIIl);
            "".length();
            if ((106 + 173 - 267 + 167 ^ 75 + 94 - 10 + 24) <= -" ".length()) {
                return;
            }
        } else if (!H.llIlIIIIIlllIl(lllllllllllllllIlllIllIIIIIIlIIl.isZero() ? 1 : 0) || H.llIlIIIIlIIIlI(H.llIlIIIIIlllll(lllllllllllllllIlllIllIIIIIIlIIl.toMillis(), 18000L))) {
            lllllllllllllllIlllIllIIIIIIlIll.aO = null;
        }
        if (H.llIlIIIIlIIIll(lllllllllllllllIlllIllIIIIIIlIll.aO)) {
            l2 = Duration.between(Instant.now(), lllllllllllllllIlllIllIIIIIIlIll.aO).toMillis();
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        } else {
            l2 = lllllllllllllllIlllIllIIIIIIIllI = 0L;
        }
        if (H.llIlIIIIlIIIll(lllllllllllllllIlllIllIIIIIIlIll.aO) && H.llIlIIIIlIIlII(H.llIlIIIIIlllll(lllllllllllllllIlllIllIIIIIIIllI, 0L)) && H.llIlIIIIlIIIIl(H.llIlIIIIIlllll(lllllllllllllllIlllIllIIIIIIIllI, lllllllllllllllIlllIllIIIIIIIlll))) {
            lllllllllllllllIlllIllIIIIIIlIll.aP = lllllllllllllllIlllIllIIIIIIlIII - (lllllllllllllllIlllIllIIIIIIlIII - 0.3) * (double)lllllllllllllllIlllIllIIIIIIIllI / (double)lllllllllllllllIlllIllIIIIIIIlll;
        }
    }

    private double l(int n2) {
        return ((double)(Math.min(Math.max(n2, lIIlllIIlllI[0]), lIIlllIIlllI[2]) * lIIlllIIlllI[3]) / 64.0 + 67.0) / 100.0 * this.aP;
    }

    private int ak() {
        double d2 = 0.0;
        int[] nArray = new int[lIIlllIIlllI[6]];
        nArray[H.lIIlllIIlllI[0]] = lIIlllIIlllI[20];
        nArray[H.lIIlllIIlllI[1]] = lIIlllIIlllI[21];
        nArray[H.lIIlllIIlllI[8]] = lIIlllIIlllI[22];
        nArray[H.lIIlllIIlllI[9]] = lIIlllIIlllI[23];
        d2 += (double)this.j.l().a(nArray) * A.GOLD_BAR.Q();
        int[] nArray2 = new int[lIIlllIIlllI[6]];
        nArray2[H.lIIlllIIlllI[0]] = lIIlllIIlllI[24];
        nArray2[H.lIIlllIIlllI[1]] = lIIlllIIlllI[19];
        nArray2[H.lIIlllIIlllI[8]] = lIIlllIIlllI[25];
        nArray2[H.lIIlllIIlllI[9]] = lIIlllIIlllI[18];
        d2 += (double)this.j.l().a(nArray2) * A.COAL.Q();
        int[] nArray3 = new int[lIIlllIIlllI[1]];
        nArray3[H.lIIlllIIlllI[0]] = lIIlllIIlllI[26];
        d2 += (double)this.j.l().a(nArray3) * A.ADAMANTITE_BAR.Q();
        int[] nArray4 = new int[lIIlllIIlllI[1]];
        nArray4[H.lIIlllIIlllI[0]] = lIIlllIIlllI[27];
        d2 += (double)this.j.l().a(nArray4) * A.ADAMANTITE_ORE.Q();
        int[] nArray5 = new int[lIIlllIIlllI[1]];
        nArray5[H.lIIlllIIlllI[0]] = lIIlllIIlllI[28];
        d2 += (double)this.j.l().a(nArray5) * A.MITHRIL_BAR.Q();
        int[] nArray6 = new int[lIIlllIIlllI[1]];
        nArray6[H.lIIlllIIlllI[0]] = lIIlllIIlllI[29];
        return (int)Math.round(d2 += (double)this.j.l().a(nArray6) * A.MITHRIL_ORE.Q());
    }

    private static boolean llIlIIIIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIlIIIIIllIIl() {
        lIIlllIIlllI = new int[38];
        H.lIIlllIIlllI[0] = (0x11 ^ 0x52) & ~(0x34 ^ 0x77);
        H.lIIlllIIlllI[1] = " ".length();
        H.lIIlllIIlllI[2] = 0x6C ^ 0x2C;
        H.lIIlllIIlllI[3] = 0xEB ^ 0xA8;
        H.lIIlllIIlllI[4] = 0x44 ^ 0x74;
        H.lIIlllIIlllI[5] = 0xA6 ^ 0x9E ^ (0xA8 ^ 0x84);
        H.lIIlllIIlllI[6] = 92 + 132 - 212 + 144 ^ 65 + 121 - 60 + 26;
        H.lIIlllIIlllI[7] = 0x61 ^ 0x7A;
        H.lIIlllIIlllI[8] = "  ".length();
        H.lIIlllIIlllI[9] = "   ".length();
        H.lIIlllIIlllI[10] = 0x33 ^ 0x36;
        H.lIIlllIIlllI[11] = 0x54 ^ 0x52;
        H.lIIlllIIlllI[12] = 0x42 ^ 0x61 ^ (0x2B ^ 0xF);
        H.lIIlllIIlllI[13] = 159 + 21 - 126 + 114 ^ 123 + 105 - 136 + 68;
        H.lIIlllIIlllI[14] = 0x40 ^ 0x18 ^ (0xFF ^ 0xAE);
        H.lIIlllIIlllI[15] = 0xBA ^ 0xB0;
        H.lIIlllIIlllI[16] = 0x66 ^ 0x6D;
        H.lIIlllIIlllI[17] = 0x24 ^ 0x28;
        H.lIIlllIIlllI[18] = -(0xFFFFDC6D & 0x2BD3) & (0xFFFFAFFE & 0x59FD);
        H.lIIlllIIlllI[19] = -(0xFFFF9ED9 & 0x6D37) & (0xFFFF8DDF & 0x7FF5);
        H.lIIlllIIlllI[20] = -(0xFFFFE647 & 0x7DF9) & (0xFFFFFD7F & 0x6FEF);
        H.lIIlllIIlllI[21] = 0xFFFFAB75 & 0x5DBB;
        H.lIIlllIIlllI[22] = 0xFFFF9DBF & 0x6B7B;
        H.lIIlllIIlllI[23] = 0xFFFFEDB7 & 0x1B7D;
        H.lIIlllIIlllI[24] = -(0xFFFFEE7F & 0x7D87) & (0xFFFFEFFF & 0x7DBE);
        H.lIIlllIIlllI[25] = -(0xFFFFCD09 & 0x3AFF) & (0xFFFFEDDF & 0x1BEB);
        H.lIIlllIIlllI[26] = -(0xFFFFBC67 & 0x53DD) & (0xFFFFBB7F & 0x5DFD);
        H.lIIlllIIlllI[27] = -(0xFFFFECB7 & 0x577F) & (0xFFFFCFFF & 0x75F7);
        H.lIIlllIIlllI[28] = 0xFFFFED3F & 0x1BF7;
        H.lIIlllIIlllI[29] = -(0xFFFFDF41 & 0x7EBF) & (0xFFFFDFBF & Short.MAX_VALUE);
        H.lIIlllIIlllI[30] = 0x81 ^ 0x99;
        H.lIIlllIIlllI[31] = -(0xFFFFEC9F & 0x17E7) & (0xFFFFFFFF & 0x2EB6);
        H.lIIlllIIlllI[32] = -(0xFFFF9F25 & 0x79FF) & (0xFFFFBFFD & 0x5B7E);
        H.lIIlllIIlllI[33] = 0x44 ^ 0x49;
        H.lIIlllIIlllI[34] = 31 + 83 - -25 + 35 ^ 37 + 109 - 45 + 59;
        H.lIIlllIIlllI[35] = -(0xFFFFF7BF & 0x6849) & (0xFFFFE3FE & 0x7DFD);
        H.lIIlllIIlllI[36] = -(0xFFFF9FEB & 0x771F) & (0xFFFFF7FE & 0x7FAB);
        H.lIIlllIIlllI[37] = 0x44 ^ 0x4B;
    }

    private static boolean llIlIIIIIllIlI(int n2) {
        return n2 != 0;
    }

    private static String llIlIIIIIIIlll(String lllllllllllllllIlllIlIllllIlllIl, String lllllllllllllllIlllIlIllllIlllII) {
        lllllllllllllllIlllIlIllllIlllIl = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlIllllIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIlIllllIllIll = new StringBuilder();
        char[] lllllllllllllllIlllIlIllllIllIlI = lllllllllllllllIlllIlIllllIlllII.toCharArray();
        int lllllllllllllllIlllIlIllllIllIIl = lIIlllIIlllI[0];
        char[] lllllllllllllllIlllIlIllllIlIIll = lllllllllllllllIlllIlIllllIlllIl.toCharArray();
        int lllllllllllllllIlllIlIllllIlIIlI = lllllllllllllllIlllIlIllllIlIIll.length;
        int lllllllllllllllIlllIlIllllIlIIIl = lIIlllIIlllI[0];
        while (H.llIlIIIIIllIll(lllllllllllllllIlllIlIllllIlIIIl, lllllllllllllllIlllIlIllllIlIIlI)) {
            char lllllllllllllllIlllIlIllllIllllI = lllllllllllllllIlllIlIllllIlIIll[lllllllllllllllIlllIlIllllIlIIIl];
            lllllllllllllllIlllIlIllllIllIll.append((char)(lllllllllllllllIlllIlIllllIllllI ^ lllllllllllllllIlllIlIllllIllIlI[lllllllllllllllIlllIlIllllIllIIl % lllllllllllllllIlllIlIllllIllIlI.length]));
            "".length();
            ++lllllllllllllllIlllIlIllllIllIIl;
            ++lllllllllllllllIlllIlIllllIlIIIl;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIlIllllIllIll);
    }

    private static boolean llIlIIIIlIIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlIIIIlIIlII(int n2) {
        return n2 >= 0;
    }

    private static boolean llIlIIIIlIIIIl(int n2) {
        return n2 <= 0;
    }

    /*
     * WARNING - void declaration
     */
    private int a(boolean bl, String string) {
        void lllllllllllllllIlllIllIIIIlIIlII;
        void lllllllllllllllIlllIllIIIIlIIlIl;
        H lllllllllllllllIlllIllIIIIlIIllI;
        void lllllllllllllllIlllIllIIIIlIIIlI;
        int n2 = lIIlllIIlllI[6];
        int n3 = string.equals(lIIlllIIIIlI[lIIlllIIlllI[0]]) ? 1 : 0;
        if (H.llIlIIIIIlllIl(n3)) {
            n2 += 2;
        }
        if (H.llIlIIIIIlllIl((int)lllllllllllllllIlllIllIIIIlIIIlI) && H.llIlIIIIIllllI(lllllllllllllllIlllIllIIIIlIIllI.j.k().w(), lIIlllIIlllI[7])) {
            lllllllllllllllIlllIllIIIIlIIIll += 2;
        }
        if (!H.llIlIIIIIllIlI((int)lllllllllllllllIlllIllIIIIlIIlIl) || H.llIlIIIIIllIlI(lllllllllllllllIlllIllIIIIlIIlII.contains(lIIlllIIIIlI[lIIlllIIlllI[1]]) ? 1 : 0)) {
            void lllllllllllllllIlllIllIIIIlIIIll;
            ++lllllllllllllllIlllIllIIIIlIIIll;
        }
        return n2;
    }

    private static void llIlIIIIIllIII() {
        lIIlllIIIIlI = new String[lIIlllIIlllI[37]];
        H.lIIlllIIIIlI[H.lIIlllIIlllI[0]] = H.llIlIIIIIIIllI("r5UOx44YqNyciEr6HERwiQ==", "rmcRW");
        H.lIIlllIIIIlI[H.lIIlllIIlllI[1]] = H.llIlIIIIIIIlll("KA4nCw==", "oaKog");
        H.lIIlllIIIIlI[H.lIIlllIIlllI[8]] = H.llIlIIIIIIIllI("euXObIUNj18=", "WdQrK");
        H.lIIlllIIIIlI[H.lIIlllIIlllI[9]] = H.llIlIIIIIIIlll("", "vGIHm");
        H.lIIlllIIIIlI[H.lIIlllIIlllI[6]] = H.llIlIIIIIIIlll("FyMnJio=", "Dwbcf");
        H.lIIlllIIIIlI[H.lIIlllIIlllI[10]] = H.llIlIIIIIIIlll("GzEaHA==", "RcURt");
        H.lIIlllIIIIlI[H.lIIlllIIlllI[11]] = H.llIlIIIIIIlIIl("K+VyGQobhzo=", "BggCQ");
        H.lIIlllIIIIlI[H.lIIlllIIlllI[12]] = H.llIlIIIIIIIlll("Mx0KKg==", "lRXot");
        H.lIIlllIIIIlI[H.lIIlllIIlllI[13]] = H.llIlIIIIIIIllI("Lx5UY1Oirkw=", "gavTb");
        H.lIIlllIIIIlI[H.lIIlllIIlllI[14]] = H.llIlIIIIIIlIIl("MiJXMzFURMo=", "FMGZI");
        H.lIIlllIIIIlI[H.lIIlllIIlllI[15]] = H.llIlIIIIIIlIIl("v36dIopV1jI=", "GTZce");
        H.lIIlllIIIIlI[H.lIIlllIIlllI[16]] = H.llIlIIIIIIIllI("+SP/xBIX7Ww=", "ekekX");
        H.lIIlllIIIIlI[H.lIIlllIIlllI[17]] = H.llIlIIIIIIIlll("NjceKw==", "qXrOz");
        H.lIIlllIIIIlI[H.lIIlllIIlllI[33]] = H.llIlIIIIIIIllI("wStOvahNQS1JYVWJgZM38A==", "eUBao");
        H.lIIlllIIIIlI[H.lIIlllIIlllI[34]] = H.llIlIIIIIIIlll("KwUrDBg/KSsPIisNKwgyGgQkGTA8Hw==", "YlEkW");
    }

    private static int llIlIIIIIlllll(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean llIlIIIIIllllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIlIIIIlIIIll(Object object) {
        return object != null;
    }

    private static boolean llIlIIIIlIIIlI(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    private double m(int n2) {
        void lllllllllllllllIlllIllIIIIllIIII;
        void lllllllllllllllIlllIllIIIIlIlllI;
        double d2 = (double)(lIIlllIIlllI[4] + this.g.getBoostedSkillLevel(Skill.AGILITY)) / 360.0;
        int n3 = lIIlllIIlllI[0];
        C[] cArray = C.values();
        int n4 = cArray.length;
        int lllllllllllllllIlllIllIIIIlIllIl = lIIlllIIlllI[0];
        while (H.llIlIIIIIllIll(lllllllllllllllIlllIllIIIIlIllIl, (int)lllllllllllllllIlllIllIIIIlIlllI)) {
            void lllllllllllllllIlllIllIIIIlIllll;
            void lllllllllllllllIlllIllIIIIlIllII = lllllllllllllllIlllIllIIIIlIllll[lllllllllllllllIlllIllIIIIlIllIl];
            if (H.llIlIIIIIllIlI(Equipment.contains((int[])lllllllllllllllIlllIllIIIIlIllII.items) ? 1 : 0)) {
                lllllllllllllllIlllIllIIIIllIIII += lllllllllllllllIlllIllIIIIlIllII.boost;
            }
            ++lllllllllllllllIlllIllIIIIlIllIl;
            "".length();
            if (((41 + 12 - 17 + 102 ^ 135 + 119 - 237 + 131) & (0x87 ^ 0x98 ^ " ".length() ^ -" ".length())) == 0) continue;
            return 0.0;
        }
        if (H.llIlIIIIIlllII((int)lllllllllllllllIlllIllIIIIllIIII, lIIlllIIlllI[5])) {
            lllllllllllllllIlllIllIIIIllIIII += 10;
        }
        return (d2 *= 1.0 + (double)n3 / 100.0) * 0.6 * (double)n2;
    }

    private static boolean llIlIIIIlIIIII(Object object) {
        return object == null;
    }

    private static boolean llIlIIIIIlllIl(int n2) {
        return n2 == 0;
    }

    public double aj() {
        h h2 = this.aG.X();
        int n2 = B.a(h2.g());
        int n3 = this.j.p().d(n2);
        int n4 = this.g.getWeight() - this.ak();
        int n5 = (int)Math.round(this.a(lIIlllIIlllI[0], n2)) + n4;
        int n6 = (int)Math.round(this.a(lIIlllIIlllI[1], n2)) + n4;
        int n7 = this.a(n3 != 0, h2.g());
        double d2 = this.m(n7);
        this.n(n7);
        if (H.llIlIIIIIllIlI(n3)) {
            return Math.round(this.l(n4) * 9.0 + this.l(n5) * 9.0 - d2);
        }
        return Math.round(this.l(n5) * 9.0 + this.l(n4) * 5.0 + this.l(n6) * 4.0 - d2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean al() {
        int n2;
        Integer n3 = (Integer)this.aN.getRSProfileConfiguration(lIIlllIIIIlI[lIIlllIIlllI[33]], lIIlllIIIIlI[lIIlllIIlllI[34]], Integer.class);
        if (H.llIlIIIIlIIIll(n3) && H.llIlIIIIlIIlIl(n3, lIIlllIIlllI[35])) {
            int[] nArray = new int[lIIlllIIlllI[1]];
            nArray[H.lIIlllIIlllI[0]] = lIIlllIIlllI[36];
            if (H.llIlIIIIIllIlI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                n2 = lIIlllIIlllI[1];
                "".length();
                if (null == null) return n2 != 0;
                return ((0x6A ^ 0x46) & ~(0x2D ^ 1)) != 0;
            }
        }
        n2 = lIIlllIIlllI[0];
        return n2 != 0;
    }

    private static String llIlIIIIIIIllI(String lllllllllllllllIlllIlIlllllIllIl, String lllllllllllllllIlllIlIlllllIllII) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIllllllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIlllllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIlllllIllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIlllllIllll.init(lIIlllIIlllI[8], lllllllllllllllIlllIlIllllllIIII);
            return new String(lllllllllllllllIlllIlIlllllIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIlllllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIlllllIlllI) {
            lllllllllllllllIlllIlIlllllIlllI.printStackTrace();
            return null;
        }
    }

    static {
        H.llIlIIIIIllIIl();
        H.llIlIIIIIllIII();
        aM = LoggerFactory.getLogger(H.class);
    }

    private static boolean llIlIIIIIlllII(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private double a(boolean bl, int n2) {
        void var8_7;
        void v5;
        void lllllllllllllllIlllIllIIIIIllIII;
        void lllllllllllllllIlllIllIIIIIlIlIl;
        void lllllllllllllllIlllIllIIIIIlIlll;
        H lllllllllllllllIlllIllIIIIIllIIl;
        double d2;
        h h2 = this.aG.X();
        String string = h2.g().toUpperCase().replace(lIIlllIIIIlI[lIIlllIIlllI[8]], lIIlllIIIIlI[lIIlllIIlllI[9]]).replace(lIIlllIIIIlI[lIIlllIIlllI[6]], lIIlllIIIIlI[lIIlllIIlllI[10]]).replace(lIIlllIIIIlI[lIIlllIIlllI[11]], lIIlllIIIIlI[lIIlllIIlllI[12]]);
        String string2 = string.replace(lIIlllIIIIlI[lIIlllIIlllI[13]], lIIlllIIIIlI[lIIlllIIlllI[14]]).replace(lIIlllIIIIlI[lIIlllIIlllI[15]], lIIlllIIIIlI[lIIlllIIlllI[16]]);
        if (H.llIlIIIIIllIlI(bl ? 1 : 0)) {
            d2 = A.GOLD_BAR.Q();
            "".length();
            if (((0xD2 ^ 0x8A) & ~(0x47 ^ 0x1F)) > ((0x82 ^ 0x97) & ~(0x4B ^ 0x5E))) {
                return 0.0;
            }
        } else {
            d2 = A.COAL.Q();
        }
        double lllllllllllllllIlllIllIIIIIlIIll = d2;
        int lllllllllllllllIlllIllIIIIIlIIlI = lllllllllllllllIlllIllIIIIIllIIl.j.l().D();
        if (H.llIlIIIIIllIlI(lllllllllllllllIlllIllIIIIIllIIl.j.p().d((int)lllllllllllllllIlllIllIIIIIlIlll) ? 1 : 0)) {
            int n3;
            void lllllllllllllllIlllIllIIIIIlIllI;
            int[] nArray = new int[lIIlllIIlllI[1]];
            int n4 = lIIlllIIlllI[0];
            if (H.llIlIIIIIllIlI(lllllllllllllllIlllIllIIIIIlIllI.g().contains(lIIlllIIIIlI[lIIlllIIlllI[17]]) ? 1 : 0)) {
                n3 = lIIlllIIlllI[18];
                "".length();
                if (-" ".length() >= 0) {
                    return 0.0;
                }
            } else {
                n3 = lIIlllIIlllI[19];
            }
            nArray[n4] = n3;
            lllllllllllllllIlllIllIIIIIlIIlI = Math.min(lllllllllllllllIlllIllIIIIIlIIlI, Bank.getCount((int[])nArray));
            return lllllllllllllllIlllIllIIIIIlIIll * (double)lllllllllllllllIlllIllIIIIIlIIlI;
        }
        int[] nArray = new int[lIIlllIIlllI[1]];
        nArray[H.lIIlllIIlllI[0]] = A.valueOf((String)lllllllllllllllIlllIllIIIIIlIlIl).P();
        lllllllllllllllIlllIllIIIIIlIIlI = Math.min(lllllllllllllllIlllIllIIIIIlIIlI, Bank.getCount((int[])nArray));
        if (H.llIlIIIIIllIlI((int)lllllllllllllllIlllIllIIIIIllIII)) {
            void lllllllllllllllIlllIllIIIIIlIlII;
            v5 = lllllllllllllllIlllIllIIIIIlIlII;
            "".length();
            if ("  ".length() > "   ".length()) {
                return 0.0;
            }
        } else {
            v5 = lllllllllllllllIlllIllIIIIIlIlIl;
        }
        return A.valueOf((String)v5).Q() * (double)var8_7;
    }
}

