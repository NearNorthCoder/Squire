/*
 * Decompiled with CFR 0.152.
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class A
extends Enum<A> {
    public static final /* synthetic */ /* enum */ A RUNITE_ORE;
    public static final /* synthetic */ /* enum */ A IRON_BAR;
    public static final /* synthetic */ /* enum */ A ADAMANTITE_BAR;
    private static /* synthetic */ int[] lIIlllIlIIIl;
    public static final /* synthetic */ /* enum */ A TIN_ORE;
    public static final /* synthetic */ /* enum */ A SILVER_ORE;
    private final /* synthetic */ double weight;
    public static final /* synthetic */ /* enum */ A BRONZE_BAR;
    private final /* synthetic */ int itemID;
    public static final /* synthetic */ /* enum */ A RUNITE_BAR;
    public static final /* synthetic */ /* enum */ A ADAMANTITE_ORE;
    private final /* synthetic */ int varbit;
    public static final /* synthetic */ /* enum */ A MITHRIL_ORE;
    public static final /* synthetic */ /* enum */ A COPPER_ORE;
    private static final /* synthetic */ A[] $VALUES;
    public static final /* synthetic */ /* enum */ A SILVER_BAR;
    public static final /* synthetic */ /* enum */ A GOLD_ORE;
    public static final /* synthetic */ /* enum */ A COAL;
    public static final /* synthetic */ /* enum */ A GOLD_BAR;
    private static /* synthetic */ String[] lIIlllIIllIl;
    public static final /* synthetic */ /* enum */ A IRON_ORE;
    public static final /* synthetic */ /* enum */ A MITHRIL_BAR;
    public static final /* synthetic */ /* enum */ A STEEL_BAR;

    static {
        A.llIlIIIIlIllII();
        A.llIlIIIIlIlIll();
        COAL = new A(lIIlllIlIIIl[1], lIIlllIlIIIl[2], 2.267);
        COPPER_ORE = new A(lIIlllIlIIIl[4], lIIlllIlIIIl[5], 2.267);
        TIN_ORE = new A(lIIlllIlIIIl[7], lIIlllIlIIIl[8], 2.267);
        IRON_ORE = new A(lIIlllIlIIIl[10], lIIlllIlIIIl[11], 2.267);
        MITHRIL_ORE = new A(lIIlllIlIIIl[13], lIIlllIlIIIl[14], 1.814);
        ADAMANTITE_ORE = new A(lIIlllIlIIIl[16], lIIlllIlIIIl[17], 2.721);
        RUNITE_ORE = new A(lIIlllIlIIIl[19], lIIlllIlIIIl[20], 2.267);
        SILVER_ORE = new A(lIIlllIlIIIl[22], lIIlllIlIIIl[23], 2.267);
        GOLD_ORE = new A(lIIlllIlIIIl[25], lIIlllIlIIIl[26], 2.267);
        BRONZE_BAR = new A(lIIlllIlIIIl[28], lIIlllIlIIIl[29], 1.814);
        IRON_BAR = new A(lIIlllIlIIIl[31], lIIlllIlIIIl[32], 1.814);
        STEEL_BAR = new A(lIIlllIlIIIl[34], lIIlllIlIIIl[35], 1.814);
        MITHRIL_BAR = new A(lIIlllIlIIIl[37], lIIlllIlIIIl[38], 1.587);
        ADAMANTITE_BAR = new A(lIIlllIlIIIl[40], lIIlllIlIIIl[41], 2.041);
        RUNITE_BAR = new A(lIIlllIlIIIl[43], lIIlllIlIIIl[44], 1.814);
        SILVER_BAR = new A(lIIlllIlIIIl[46], lIIlllIlIIIl[47], 1.814);
        GOLD_BAR = new A(lIIlllIlIIIl[49], lIIlllIlIIIl[50], 1.814);
        A[] aArray = new A[lIIlllIlIIIl[51]];
        aArray[A.lIIlllIlIIIl[0]] = COAL;
        aArray[A.lIIlllIlIIIl[3]] = COPPER_ORE;
        aArray[A.lIIlllIlIIIl[6]] = TIN_ORE;
        aArray[A.lIIlllIlIIIl[9]] = IRON_ORE;
        aArray[A.lIIlllIlIIIl[12]] = MITHRIL_ORE;
        aArray[A.lIIlllIlIIIl[15]] = ADAMANTITE_ORE;
        aArray[A.lIIlllIlIIIl[18]] = RUNITE_ORE;
        aArray[A.lIIlllIlIIIl[21]] = SILVER_ORE;
        aArray[A.lIIlllIlIIIl[24]] = GOLD_ORE;
        aArray[A.lIIlllIlIIIl[27]] = BRONZE_BAR;
        aArray[A.lIIlllIlIIIl[30]] = IRON_BAR;
        aArray[A.lIIlllIlIIIl[33]] = STEEL_BAR;
        aArray[A.lIIlllIlIIIl[36]] = MITHRIL_BAR;
        aArray[A.lIIlllIlIIIl[39]] = ADAMANTITE_BAR;
        aArray[A.lIIlllIlIIIl[42]] = RUNITE_BAR;
        aArray[A.lIIlllIlIIIl[45]] = SILVER_BAR;
        aArray[A.lIIlllIlIIIl[48]] = GOLD_BAR;
        $VALUES = aArray;
    }

    public static int[] N() {
        int[] nArray = new int[A.values().length];
        int lllllllllllllllIlllIlIllIllllIlI = lIIlllIlIIIl[0];
        while (A.llIlIIIIlIllIl(lllllllllllllllIlllIlIllIllllIlI, A.values().length)) {
            lllllllllllllllIlllIlIllIllllIll[lllllllllllllllIlllIlIllIllllIlI] = A.values()[lllllllllllllllIlllIlIllIllllIlI].itemID;
            ++lllllllllllllllIlllIlIllIllllIlI;
            "".length();
            if (((0xA5 ^ 0x9C ^ (0x78 ^ 0x7F)) & (0x28 ^ 0x64 ^ (0xC3 ^ 0xB1) ^ -" ".length())) <= "   ".length()) continue;
            return null;
        }
        return nArray;
    }

    private static String llIlIIIIIlIlIl(String lllllllllllllllIlllIlIllIlIlIlIl, String lllllllllllllllIlllIlIllIlIlIlII) {
        lllllllllllllllIlllIlIllIlIlIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlIllIlIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIlIllIlIlIIll = new StringBuilder();
        char[] lllllllllllllllIlllIlIllIlIlIIlI = lllllllllllllllIlllIlIllIlIlIlII.toCharArray();
        int lllllllllllllllIlllIlIllIlIlIIIl = lIIlllIlIIIl[0];
        char[] lllllllllllllllIlllIlIllIlIIlIll = lllllllllllllllIlllIlIllIlIlIlIl.toCharArray();
        int lllllllllllllllIlllIlIllIlIIlIlI = lllllllllllllllIlllIlIllIlIIlIll.length;
        int lllllllllllllllIlllIlIllIlIIlIIl = lIIlllIlIIIl[0];
        while (A.llIlIIIIlIllIl(lllllllllllllllIlllIlIllIlIIlIIl, lllllllllllllllIlllIlIllIlIIlIlI)) {
            char lllllllllllllllIlllIlIllIlIlIllI = lllllllllllllllIlllIlIllIlIIlIll[lllllllllllllllIlllIlIllIlIIlIIl];
            lllllllllllllllIlllIlIllIlIlIIll.append((char)(lllllllllllllllIlllIlIllIlIlIllI ^ lllllllllllllllIlllIlIllIlIlIIlI[lllllllllllllllIlllIlIllIlIlIIIl % lllllllllllllllIlllIlIllIlIlIIlI.length]));
            "".length();
            ++lllllllllllllllIlllIlIllIlIlIIIl;
            ++lllllllllllllllIlllIlIllIlIIlIIl;
            "".length();
            if (" ".length() >= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIlIllIlIlIIll);
    }

    private static boolean llIlIIIIlIllIl(int n2, int n3) {
        return n2 < n3;
    }

    public static A[] values() {
        return (A[])$VALUES.clone();
    }

    public int P() {
        return this.itemID;
    }

    public int O() {
        return this.varbit;
    }

    private static String llIlIIIIIlIllI(String lllllllllllllllIlllIlIllIlllIIlI, String lllllllllllllllIlllIlIllIlllIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIllIlllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIllIlllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIllIlllIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIllIlllIlII.init(lIIlllIlIIIl[6], lllllllllllllllIlllIlIllIlllIlIl);
            return new String(lllllllllllllllIlllIlIllIlllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIllIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIllIlllIIll) {
            lllllllllllllllIlllIlIllIlllIIll.printStackTrace();
            return null;
        }
    }

    public double Q() {
        return this.weight;
    }

    private A(int n3, int n4, double d2) {
        this.varbit = n3;
        this.itemID = n4;
        this.weight = d2;
    }

    public static A valueOf(String string) {
        return Enum.valueOf(A.class, string);
    }

    private static void llIlIIIIlIlIll() {
        lIIlllIIllIl = new String[lIIlllIlIIIl[51]];
        A.lIIlllIIllIl[A.lIIlllIlIIIl[0]] = A.llIlIIIIIlIlIl("DSERBg==", "NnPJk");
        A.lIIlllIIllIl[A.lIIlllIlIIIl[3]] = A.llIlIIIIIlIllI("Oo3OupVy7No8vPW/W9c59w==", "xMhZA");
        A.lIIlllIIllIl[A.lIIlllIlIIIl[6]] = A.llIlIIIIIlIlIl("DQskNSULBw==", "YBjjj");
        A.lIIlllIIllIl[A.lIIlllIlIIIl[9]] = A.llIlIIIIIlIlIl("PT4IDSo7PgI=", "tlGCu");
        A.lIIlllIIllIl[A.lIIlllIlIIIl[12]] = A.llIlIIIIIlIllI("kMd63LaA8M4U/6DvIYxOLA==", "VngyF");
        A.lIIlllIIllIl[A.lIIlllIlIIIl[15]] = A.llIlIIIIIlIlll("3J3hx3jBqoracGH2lxTjBA==", "pVJnU");
        A.lIIlllIIllIl[A.lIIlllIlIIIl[18]] = A.llIlIIIIIlIlll("QKmIk6x/Dso/aVJrYQ8w2w==", "opFIr");
        A.lIIlllIIllIl[A.lIIlllIlIIIl[21]] = A.llIlIIIIIlIlll("RjUj4hl7XM+ZSbLOXMUk9w==", "qhqdk");
        A.lIIlllIIllIl[A.lIIlllIlIIIl[24]] = A.llIlIIIIIlIllI("CYT7XiBHv7tKv+JBrcuTRg==", "qVwVy");
        A.lIIlllIIllIl[A.lIIlllIlIIIl[27]] = A.llIlIIIIIlIlll("cQpNdKqKnEF4T9nNdPY1jQ==", "HsUsf");
        A.lIIlllIIllIl[A.lIIlllIlIIIl[30]] = A.llIlIIIIIlIllI("qzqT0rE1iz2gC8mCqF23tQ==", "BwWzV");
        A.lIIlllIIllIl[A.lIIlllIlIIIl[33]] = A.llIlIIIIIlIlIl("Ax0OEj0PCwoF", "PIKWq");
        A.lIIlllIIllIl[A.lIIlllIlIIIl[36]] = A.llIlIIIIIlIlll("EJrq1sDs8x6q0hyB35Mmig==", "abTaJ");
        A.lIIlllIIllIl[A.lIIlllIlIIIl[39]] = A.llIlIIIIIlIlIl("FgI1Cg8ZEj0TCwgENRU=", "WFtGN");
        A.lIIlllIIllIl[A.lIIlllIlIIIl[42]] = A.llIlIIIIIlIllI("RTuyjcKpZG4IQea9pfFI5A==", "yXAUu");
        A.lIIlllIIllIl[A.lIIlllIlIIIl[45]] = A.llIlIIIIIlIllI("ILeeluQufqrnx3Ieo08ang==", "EMOzH");
        A.lIIlllIIllIl[A.lIIlllIlIIIl[48]] = A.llIlIIIIIlIllI("zKuxUPNQYVJpM6Cb1PLUgg==", "ZFipT");
    }

    private static String llIlIIIIIlIlll(String lllllllllllllllIlllIlIllIllIIIll, String lllllllllllllllIlllIlIllIllIIlII) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIllIllIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIllIllIIlII.getBytes(StandardCharsets.UTF_8)), lIIlllIlIIIl[24]), "DES");
            Cipher lllllllllllllllIlllIlIllIllIIlll = Cipher.getInstance("DES");
            lllllllllllllllIlllIlIllIllIIlll.init(lIIlllIlIIIl[6], lllllllllllllllIlllIlIllIllIlIII);
            return new String(lllllllllllllllIlllIlIllIllIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIllIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIllIllIIllI) {
            lllllllllllllllIlllIlIllIllIIllI.printStackTrace();
            return null;
        }
    }

    private static void llIlIIIIlIllII() {
        lIIlllIlIIIl = new int[52];
        A.lIIlllIlIIIl[0] = (0x7B ^ 0x43) & ~(0x5C ^ 0x64);
        A.lIIlllIlIIIl[1] = 0xFFFFFFBD & 0x3F7;
        A.lIIlllIlIIIl[2] = -(0xFFFFBFFB & 0x723D) & (0xFFFFB3FF & 0x7FFD);
        A.lIIlllIlIIIl[3] = " ".length();
        A.lIIlllIlIIIl[4] = 0xFFFFEBBF & 0x17FF;
        A.lIIlllIlIIIl[5] = 0xFFFFA5F6 & 0x5BBD;
        A.lIIlllIlIIIl[6] = "  ".length();
        A.lIIlllIlIIIl[7] = -(0xFFFFBD5B & 0x7AAE) & (0xFFFFFFBF & 0x3BFF);
        A.lIIlllIlIIIl[8] = -(0xFFFFDABF & 0x7F4A) & (0xFFFFFFBF & 0x5BFF);
        A.lIIlllIlIIIl[9] = "   ".length();
        A.lIIlllIlIIIl[10] = 0xFFFFDBF7 & 0x27BF;
        A.lIIlllIlIIIl[11] = 0xFFFF9BBF & 0x65F8;
        A.lIIlllIlIIIl[12] = 0x66 ^ 0x22 ^ (0x27 ^ 0x67);
        A.lIIlllIlIIIl[13] = -(0xFFFFAD7E & 0x7289) & (0xFFFFEFBF & 0x33FF);
        A.lIIlllIlIIIl[14] = -(0xFFFFFB91 & 0x3E6F) & (0xFFFFFBFF & 0x3FBF);
        A.lIIlllIlIIIl[15] = 0x6B ^ 0x66 ^ (0x49 ^ 0x41);
        A.lIIlllIlIIIl[16] = -(0xFFFF9A47 & 0x6DFF) & (0xFFFF8BFF & Short.MAX_VALUE);
        A.lIIlllIlIIIl[17] = -(0xFFFFDEFF & 0x2713) & (0xFFFF9FFF & 0x67D3);
        A.lIIlllIlIIIl[18] = 104 + 183 - 142 + 48 ^ 107 + 148 - 170 + 114;
        A.lIIlllIlIIIl[19] = 0xFFFFCBBA & 0x37FF;
        A.lIIlllIlIIIl[20] = -(0xFFFFAFB5 & 0x7A4F) & (0xFFFFBBFF & 0x6FC7);
        A.lIIlllIlIIIl[21] = 0xE0 ^ 0xA3 ^ (0x20 ^ 0x64);
        A.lIIlllIlIIIl[22] = 0xFFFF8FFC & 0x73BF;
        A.lIIlllIlIIIl[23] = 0xFFFFA7FB & 0x59BE;
        A.lIIlllIlIIIl[24] = 0x95 ^ 0x9D;
        A.lIIlllIlIIIl[25] = -(0xFFFFFD45 & 0x3AFB) & (0xFFFFBBFB & Short.MAX_VALUE);
        A.lIIlllIlIIIl[26] = 0xFFFFF7FF & 0x9BC;
        A.lIIlllIlIIIl[27] = 0x7B ^ 0x72;
        A.lIIlllIlIIIl[28] = -(0xFFFFAFD3 & 0x546F) & (0xFFFF8FFF & 0x77EF);
        A.lIIlllIlIIIl[29] = 0xFFFF9F3F & 0x69ED;
        A.lIIlllIlIIIl[30] = 0x3E ^ 0x49 ^ (0xD5 ^ 0xA8);
        A.lIIlllIlIIIl[31] = 0xFFFFEFEF & 0x13BE;
        A.lIIlllIlIIIl[32] = 0xFFFFFF6F & 0x9BF;
        A.lIIlllIlIIIl[33] = 0xCE ^ 0xC5;
        A.lIIlllIlIIIl[34] = 0xFFFFC3EF & 0x3FBF;
        A.lIIlllIlIIIl[35] = -(0xFFFFB7CF & 0x5E73) & (0xFFFF9FFF & 0x7F73);
        A.lIIlllIlIIIl[36] = 0xBC ^ 0xB0;
        A.lIIlllIlIIIl[37] = 0xFFFFA7FB & 0x5BB4;
        A.lIIlllIlIIIl[38] = -(0xFFFFE27B & 0x5FCD) & (0xFFFFFBFF & 0x4F7F);
        A.lIIlllIlIIIl[39] = 2 ^ 0x6F ^ (0x72 ^ 0x12);
        A.lIIlllIlIIIl[40] = 0xFFFFC3BB & 0x3FF5;
        A.lIIlllIlIIIl[41] = 0xFFFFB9FD & 0x4F3B;
        A.lIIlllIlIIIl[42] = 27 + 85 - 98 + 114 ^ 90 + 110 - 160 + 102;
        A.lIIlllIlIIIl[43] = -(0xFFFFDC8F & 0x7771) & (0xFFFFF7BA & 0x5FF7);
        A.lIIlllIlIIIl[44] = 0xFFFFCB7B & 0x3DBF;
        A.lIIlllIlIIIl[45] = 0x50 ^ 0x5F;
        A.lIIlllIlIIIl[46] = -(0xFFFFFD2F & 0x3EDB) & (0xFFFFBFBF & 0x7FFE);
        A.lIIlllIlIIIl[47] = -(0xFFFFF629 & 0x69D7) & (0xFFFFE937 & 0x7FFB);
        A.lIIlllIlIIIl[48] = 0x5B ^ 0x4B;
        A.lIIlllIlIIIl[49] = -(0xFFFF9655 & 0x6DEF) & (0xFFFFD7F7 & 0x2FFF);
        A.lIIlllIlIIIl[50] = 0xFFFFEFFF & 0x1935;
        A.lIIlllIlIIIl[51] = 0x34 ^ 0x40 ^ (9 ^ 0x6C);
    }
}

