package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.A  reason: invalid package */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/A.class */
public final class A {
    public static final /* synthetic */ A RUNITE_ORE;
    public static final /* synthetic */ A IRON_BAR;
    public static final /* synthetic */ A ADAMANTITE_BAR;
    private static /* synthetic */ int[] lIIlllIlIIIl;
    public static final /* synthetic */ A TIN_ORE;
    public static final /* synthetic */ A SILVER_ORE;
    private final /* synthetic */ double weight;
    public static final /* synthetic */ A BRONZE_BAR;
    private final /* synthetic */ int itemID;
    public static final /* synthetic */ A RUNITE_BAR;
    public static final /* synthetic */ A ADAMANTITE_ORE;
    private final /* synthetic */ int varbit;
    public static final /* synthetic */ A MITHRIL_ORE;
    public static final /* synthetic */ A COPPER_ORE;
    private static final /* synthetic */ A[] $VALUES;
    public static final /* synthetic */ A SILVER_BAR;
    public static final /* synthetic */ A GOLD_ORE;
    public static final /* synthetic */ A COAL;
    public static final /* synthetic */ A GOLD_BAR;
    private static /* synthetic */ String[] lIIlllIIllIl;
    public static final /* synthetic */ A IRON_ORE;
    public static final /* synthetic */ A MITHRIL_BAR;
    public static final /* synthetic */ A STEEL_BAR;

    static {
        llIlIIIIlIllII();
        llIlIIIIlIlIll();
        COAL = new A(lIIlllIIllIl[lIIlllIlIIIl[0]], lIIlllIlIIIl[0], lIIlllIlIIIl[1], lIIlllIlIIIl[2], 2.267d);
        COPPER_ORE = new A(lIIlllIIllIl[lIIlllIlIIIl[3]], lIIlllIlIIIl[3], lIIlllIlIIIl[4], lIIlllIlIIIl[5], 2.267d);
        TIN_ORE = new A(lIIlllIIllIl[lIIlllIlIIIl[6]], lIIlllIlIIIl[6], lIIlllIlIIIl[7], lIIlllIlIIIl[8], 2.267d);
        IRON_ORE = new A(lIIlllIIllIl[lIIlllIlIIIl[9]], lIIlllIlIIIl[9], lIIlllIlIIIl[10], lIIlllIlIIIl[11], 2.267d);
        MITHRIL_ORE = new A(lIIlllIIllIl[lIIlllIlIIIl[12]], lIIlllIlIIIl[12], lIIlllIlIIIl[13], lIIlllIlIIIl[14], 1.814d);
        ADAMANTITE_ORE = new A(lIIlllIIllIl[lIIlllIlIIIl[15]], lIIlllIlIIIl[15], lIIlllIlIIIl[16], lIIlllIlIIIl[17], 2.721d);
        RUNITE_ORE = new A(lIIlllIIllIl[lIIlllIlIIIl[18]], lIIlllIlIIIl[18], lIIlllIlIIIl[19], lIIlllIlIIIl[20], 2.267d);
        SILVER_ORE = new A(lIIlllIIllIl[lIIlllIlIIIl[21]], lIIlllIlIIIl[21], lIIlllIlIIIl[22], lIIlllIlIIIl[23], 2.267d);
        GOLD_ORE = new A(lIIlllIIllIl[lIIlllIlIIIl[24]], lIIlllIlIIIl[24], lIIlllIlIIIl[25], lIIlllIlIIIl[26], 2.267d);
        BRONZE_BAR = new A(lIIlllIIllIl[lIIlllIlIIIl[27]], lIIlllIlIIIl[27], lIIlllIlIIIl[28], lIIlllIlIIIl[29], 1.814d);
        IRON_BAR = new A(lIIlllIIllIl[lIIlllIlIIIl[30]], lIIlllIlIIIl[30], lIIlllIlIIIl[31], lIIlllIlIIIl[32], 1.814d);
        STEEL_BAR = new A(lIIlllIIllIl[lIIlllIlIIIl[33]], lIIlllIlIIIl[33], lIIlllIlIIIl[34], lIIlllIlIIIl[35], 1.814d);
        MITHRIL_BAR = new A(lIIlllIIllIl[lIIlllIlIIIl[36]], lIIlllIlIIIl[36], lIIlllIlIIIl[37], lIIlllIlIIIl[38], 1.587d);
        ADAMANTITE_BAR = new A(lIIlllIIllIl[lIIlllIlIIIl[39]], lIIlllIlIIIl[39], lIIlllIlIIIl[40], lIIlllIlIIIl[41], 2.041d);
        RUNITE_BAR = new A(lIIlllIIllIl[lIIlllIlIIIl[42]], lIIlllIlIIIl[42], lIIlllIlIIIl[43], lIIlllIlIIIl[44], 1.814d);
        SILVER_BAR = new A(lIIlllIIllIl[lIIlllIlIIIl[45]], lIIlllIlIIIl[45], lIIlllIlIIIl[46], lIIlllIlIIIl[47], 1.814d);
        GOLD_BAR = new A(lIIlllIIllIl[lIIlllIlIIIl[48]], lIIlllIlIIIl[48], lIIlllIlIIIl[49], lIIlllIlIIIl[50], 1.814d);
        A[] aArr = new A[lIIlllIlIIIl[51]];
        aArr[lIIlllIlIIIl[0]] = COAL;
        aArr[lIIlllIlIIIl[3]] = COPPER_ORE;
        aArr[lIIlllIlIIIl[6]] = TIN_ORE;
        aArr[lIIlllIlIIIl[9]] = IRON_ORE;
        aArr[lIIlllIlIIIl[12]] = MITHRIL_ORE;
        aArr[lIIlllIlIIIl[15]] = ADAMANTITE_ORE;
        aArr[lIIlllIlIIIl[18]] = RUNITE_ORE;
        aArr[lIIlllIlIIIl[21]] = SILVER_ORE;
        aArr[lIIlllIlIIIl[24]] = GOLD_ORE;
        aArr[lIIlllIlIIIl[27]] = BRONZE_BAR;
        aArr[lIIlllIlIIIl[30]] = IRON_BAR;
        aArr[lIIlllIlIIIl[33]] = STEEL_BAR;
        aArr[lIIlllIlIIIl[36]] = MITHRIL_BAR;
        aArr[lIIlllIlIIIl[39]] = ADAMANTITE_BAR;
        aArr[lIIlllIlIIIl[42]] = RUNITE_BAR;
        aArr[lIIlllIlIIIl[45]] = SILVER_BAR;
        aArr[lIIlllIlIIIl[48]] = GOLD_BAR;
        $VALUES = aArr;
    }

    public static int[] N() {
        int[] iArr = new int[values().length];
        int i = lIIlllIlIIIl[0];
        while (llIlIIIIlIllIl(i, values().length)) {
            iArr[i] = values()[i].itemID;
            i++;
            "".length();
            if ((((165 ^ 156) ^ (120 ^ 127)) & (((40 ^ 100) ^ (195 ^ 177)) ^ (-" ".length()))) > "   ".length()) {
                return null;
            }
        }
        return iArr;
    }

    private static String llIlIIIIIlIlIl(String lllllllllllllllIlllIlIllIlIlIlIl, String lllllllllllllllIlllIlIllIlIlIlII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlIllIlIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlllIlIllIlIlIlII.toCharArray();
        int lllllllllllllllIlllIlIllIlIlIIIl = lIIlllIlIIIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int lllllllllllllllIlllIlIllIlIIlIIl = lIIlllIlIIIl[0];
        while (llIlIIIIlIllIl(lllllllllllllllIlllIlIllIlIIlIIl, length)) {
            sb.append((char) (charArray2[lllllllllllllllIlllIlIllIlIIlIIl] ^ charArray[lllllllllllllllIlllIlIllIlIlIIIl % charArray.length]));
            "".length();
            lllllllllllllllIlllIlIllIlIlIIIl++;
            lllllllllllllllIlllIlIllIlIIlIIl++;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIlIIIIlIllIl(int i, int i2) {
        return i < i2;
    }

    public static A[] values() {
        return (A[]) $VALUES.clone();
    }

    public int P() {
        return this.itemID;
    }

    public int O() {
        return this.varbit;
    }

    private static String llIlIIIIIlIllI(String lllllllllllllllIlllIlIllIlllIIII, String lllllllllllllllIlllIlIllIlllIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIllIlllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIllIlllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIllIlllIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIllIlllIlII.init(lIIlllIlIIIl[6], lllllllllllllllIlllIlIllIlllIlIl);
            return new String(lllllllllllllllIlllIlIllIlllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIllIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIllIlllIIll) {
            lllllllllllllllIlllIlIllIlllIIll.printStackTrace();
            return null;
        }
    }

    public double Q() {
        return this.weight;
    }

    private A(String str, int i, int i2, int i3, double d) {
        this.varbit = i2;
        this.itemID = i3;
        this.weight = d;
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    private static void llIlIIIIlIlIll() {
        lIIlllIIllIl = new String[lIIlllIlIIIl[51]];
        lIIlllIIllIl[lIIlllIlIIIl[0]] = llIlIIIIIlIlIl("DSERBg==", "NnPJk");
        lIIlllIIllIl[lIIlllIlIIIl[3]] = llIlIIIIIlIllI("Oo3OupVy7No8vPW/W9c59w==", "xMhZA");
        lIIlllIIllIl[lIIlllIlIIIl[6]] = llIlIIIIIlIlIl("DQskNSULBw==", "YBjjj");
        lIIlllIIllIl[lIIlllIlIIIl[9]] = llIlIIIIIlIlIl("PT4IDSo7PgI=", "tlGCu");
        lIIlllIIllIl[lIIlllIlIIIl[12]] = llIlIIIIIlIllI("kMd63LaA8M4U/6DvIYxOLA==", "VngyF");
        lIIlllIIllIl[lIIlllIlIIIl[15]] = llIlIIIIIlIlll("3J3hx3jBqoracGH2lxTjBA==", "pVJnU");
        lIIlllIIllIl[lIIlllIlIIIl[18]] = llIlIIIIIlIlll("QKmIk6x/Dso/aVJrYQ8w2w==", "opFIr");
        lIIlllIIllIl[lIIlllIlIIIl[21]] = llIlIIIIIlIlll("RjUj4hl7XM+ZSbLOXMUk9w==", "qhqdk");
        lIIlllIIllIl[lIIlllIlIIIl[24]] = llIlIIIIIlIllI("CYT7XiBHv7tKv+JBrcuTRg==", "qVwVy");
        lIIlllIIllIl[lIIlllIlIIIl[27]] = llIlIIIIIlIlll("cQpNdKqKnEF4T9nNdPY1jQ==", "HsUsf");
        lIIlllIIllIl[lIIlllIlIIIl[30]] = llIlIIIIIlIllI("qzqT0rE1iz2gC8mCqF23tQ==", "BwWzV");
        lIIlllIIllIl[lIIlllIlIIIl[33]] = llIlIIIIIlIlIl("Ax0OEj0PCwoF", "PIKWq");
        lIIlllIIllIl[lIIlllIlIIIl[36]] = llIlIIIIIlIlll("EJrq1sDs8x6q0hyB35Mmig==", "abTaJ");
        lIIlllIIllIl[lIIlllIlIIIl[39]] = llIlIIIIIlIlIl("FgI1Cg8ZEj0TCwgENRU=", "WFtGN");
        lIIlllIIllIl[lIIlllIlIIIl[42]] = llIlIIIIIlIllI("RTuyjcKpZG4IQea9pfFI5A==", "yXAUu");
        lIIlllIIllIl[lIIlllIlIIIl[45]] = llIlIIIIIlIllI("ILeeluQufqrnx3Ieo08ang==", "EMOzH");
        lIIlllIIllIl[lIIlllIlIIIl[48]] = llIlIIIIIlIllI("zKuxUPNQYVJpM6Cb1PLUgg==", "ZFipT");
    }

    private static String llIlIIIIIlIlll(String lllllllllllllllIlllIlIllIllIIlIl, String lllllllllllllllIlllIlIllIllIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIllIllIIlII.getBytes(StandardCharsets.UTF_8)), lIIlllIlIIIl[24]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlllIlIIIl[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIllIllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIllIllIIllI) {
            lllllllllllllllIlllIlIllIllIIllI.printStackTrace();
            return null;
        }
    }

    private static void llIlIIIIlIllII() {
        lIIlllIlIIIl = new int[52];
        lIIlllIlIIIl[0] = (123 ^ 67) & ((92 ^ 100) ^ (-1));
        lIIlllIlIIIl[1] = (-67) & 1015;
        lIIlllIlIIIl[2] = (-((-16389) & 29245)) & (-19457) & 32765;
        lIIlllIlIIIl[3] = " ".length();
        lIIlllIlIIIl[4] = (-5185) & 6143;
        lIIlllIlIIIl[5] = (-23050) & 23485;
        lIIlllIlIIIl[6] = "  ".length();
        lIIlllIlIIIl[7] = (-((-17061) & 31406)) & (-65) & 15359;
        lIIlllIlIIIl[8] = (-((-9537) & 32586)) & (-65) & 23551;
        lIIlllIlIIIl[9] = "   ".length();
        lIIlllIlIIIl[10] = (-9225) & 10175;
        lIIlllIlIIIl[11] = (-25665) & 26104;
        lIIlllIlIIIl[12] = (102 ^ 34) ^ (39 ^ 103);
        lIIlllIlIIIl[13] = (-((-21122) & 29321)) & (-4161) & 13311;
        lIIlllIlIIIl[14] = (-((-1135) & 15983)) & (-1025) & 16319;
        lIIlllIlIIIl[15] = (107 ^ 102) ^ (73 ^ 65);
        lIIlllIlIIIl[16] = (-((-26041) & 28159)) & (-29697) & 32767;
        lIIlllIlIIIl[17] = (-((-8449) & 10003)) & (-24577) & 26579;
        lIIlllIlIIIl[18] = (((104 + 183) - 142) + 48) ^ (((107 + 148) - 170) + 114);
        lIIlllIlIIIl[19] = (-13382) & 14335;
        lIIlllIlIIIl[20] = (-((-20555) & 31311)) & (-17409) & 28615;
        lIIlllIlIIIl[21] = (224 ^ 163) ^ (32 ^ 100);
        lIIlllIlIIIl[22] = (-28676) & 29631;
        lIIlllIlIIIl[23] = (-22533) & 22974;
        lIIlllIlIIIl[24] = 149 ^ 157;
        lIIlllIlIIIl[25] = (-((-699) & 15099)) & (-17413) & 32767;
        lIIlllIlIIIl[26] = (-2049) & 2492;
        lIIlllIlIIIl[27] = 123 ^ 114;
        lIIlllIlIIIl[28] = (-((-20525) & 21615)) & (-28673) & 30703;
        lIIlllIlIIIl[29] = (-24769) & 27117;
        lIIlllIlIIIl[30] = (62 ^ 73) ^ (213 ^ 168);
        lIIlllIlIIIl[31] = (-4113) & 5054;
        lIIlllIlIIIl[32] = (-145) & 2495;
        lIIlllIlIIIl[33] = 206 ^ 197;
        lIIlllIlIIIl[34] = (-15377) & 16319;
        lIIlllIlIIIl[35] = (-((-18481) & 24179)) & (-24577) & 32627;
        lIIlllIlIIIl[36] = 188 ^ 176;
        lIIlllIlIIIl[37] = (-22533) & 23476;
        lIIlllIlIIIl[38] = (-((-7557) & 24525)) & (-1025) & 20351;
        lIIlllIlIIIl[39] = (2 ^ 111) ^ (114 ^ 18);
        lIIlllIlIIIl[40] = (-15429) & 16373;
        lIIlllIlIIIl[41] = (-17923) & 20283;
        lIIlllIlIIIl[42] = (((27 + 85) - 98) + 114) ^ (((90 + 110) - 160) + 102);
        lIIlllIlIIIl[43] = (-((-9073) & 30577)) & (-2118) & 24567;
        lIIlllIlIIIl[44] = (-13445) & 15807;
        lIIlllIlIIIl[45] = 80 ^ 95;
        lIIlllIlIIIl[46] = (-((-721) & 16091)) & (-16449) & 32766;
        lIIlllIlIIIl[47] = (-((-2519) & 27095)) & (-5833) & 32763;
        lIIlllIlIIIl[48] = 91 ^ 75;
        lIIlllIlIIIl[49] = (-((-27051) & 28143)) & (-10249) & 12287;
        lIIlllIlIIIl[50] = (-4097) & 6453;
        lIIlllIlIIIl[51] = (52 ^ 64) ^ (9 ^ 108);
    }
}
