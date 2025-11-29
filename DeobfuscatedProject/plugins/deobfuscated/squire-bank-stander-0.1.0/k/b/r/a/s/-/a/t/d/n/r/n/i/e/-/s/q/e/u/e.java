/*
 * Decompiled with CFR 0.152.
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class e
extends Enum<e> {
    public static final /* synthetic */ /* enum */ e MITHRIL;
    private /* synthetic */ int bar;
    private /* synthetic */ int secondaryOre;
    private static /* synthetic */ int[] lllIlIIlllI;
    private /* synthetic */ int primaryOreRequired;
    public static final /* synthetic */ /* enum */ e GOLD;
    private static /* synthetic */ String[] lllIlIIllIl;
    public static final /* synthetic */ /* enum */ e RUNITE;
    private /* synthetic */ int productionOption;
    private /* synthetic */ int secondaryAmountToWithdraw;
    private /* synthetic */ int primaryAmountToWithdraw;
    private /* synthetic */ int secondaryAmountRequired;
    public static final /* synthetic */ /* enum */ e ADAMANT;
    public static final /* synthetic */ /* enum */ e SILVER;
    public static final /* synthetic */ /* enum */ e IRON;
    private static final /* synthetic */ e[] $VALUES;
    public static final /* synthetic */ /* enum */ e BLURITE;
    private /* synthetic */ int primaryOre;
    public static final /* synthetic */ /* enum */ e BRONZE;
    public static final /* synthetic */ /* enum */ e STEEL;

    private e(int n3, int n4, int n5, int n6) {
        this.bar = n3;
        this.primaryOre = n4;
        this.primaryOreRequired = lllIlIIlllI[0];
        this.primaryAmountToWithdraw = n5;
        this.secondaryOre = lllIlIIlllI[1];
        this.secondaryAmountRequired = lllIlIIlllI[1];
        this.secondaryAmountToWithdraw = lllIlIIlllI[1];
        this.productionOption = n6;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    private static void lIlIlllllIIIIl() {
        lllIlIIlllI = new int[35];
        e.lllIlIIlllI[0] = 1;
        e.lllIlIIlllI[1] = -1;
        e.lllIlIIlllI[2] = (0x4A ^ 0x6B ^ (0xC9 ^ 0xAB) & ~(0xB ^ 0x69)) & (0x75 ^ 0x14 ^ (0x38 ^ 0x78) ^ -1);
        e.lllIlIIlllI[3] = 0xFFFFFFBF & 0x96D;
        e.lllIlIIlllI[4] = 0xFFFFEDFF & 0x13B6;
        e.lllIlIIlllI[5] = 0x6D ^ 0x48 ^ (0x20 ^ 0xB);
        e.lllIlIIlllI[6] = -(0xFFFFE64F & 0x3FF4) & (0xFFFFBFF7 & 0x67FF);
        e.lllIlIIlllI[7] = 0xFFFFAEFB & 0x75FF;
        e.lllIlIIlllI[8] = -(0xFFFFFFE3 & 0x753D) & (0xFFFFF7BF & 0x7FFC);
        e.lllIlIIlllI[9] = 72 + 116 - 166 + 118 ^ 42 + 38 - 60 + 124;
        e.lllIlIIlllI[10] = 2;
        e.lllIlIIlllI[11] = 0xFFFFBDEF & 0x4B3F;
        e.lllIlIIlllI[12] = 0xFFFF85BA & 0x7BFD;
        e.lllIlIIlllI[13] = 3;
        e.lllIlIIlllI[14] = -(0xFFFFDF4F & 0x34B5) & (0xFFFF9FBF & 0x7D77);
        e.lllIlIIlllI[15] = -(0xFFFFCF4F & 0x7CF5) & (0xFFFFEFFF & 0x5DFE);
        e.lllIlIIlllI[16] = 94 + 30 - 114 + 156 ^ 79 + 132 - 118 + 69;
        e.lllIlIIlllI[17] = -(0xFFFFB4EF & 0x7FDF) & (0xFFFFBFFF & 0x7DFF);
        e.lllIlIIlllI[18] = 0x84 ^ 0x8D;
        e.lllIlIIlllI[19] = -(0xFFFFFA6F & 0x6DB9) & (0xFFFFEFED & 0x79FF);
        e.lllIlIIlllI[20] = 0xA3 ^ 0xBE ^ (0x4C ^ 0x42);
        e.lllIlIIlllI[21] = 0x99 ^ 0xB5 ^ (0x57 ^ 0x7E);
        e.lllIlIIlllI[22] = 0xFFFFBDF7 & 0x4B3D;
        e.lllIlIIlllI[23] = -(0xFFFFDFCD & 0x6673) & (0xFFFFDFFE & 0x67FD);
        e.lllIlIIlllI[24] = 0x60 ^ 0x66;
        e.lllIlIIlllI[25] = 0xFFFFFDF7 & 0xB3F;
        e.lllIlIIlllI[26] = -(0xFFFFE2ED & 0x5F53) & (0xFFFFDFFF & 0x63FF);
        e.lllIlIIlllI[27] = 0xCE ^ 0xA9 ^ (0xF7 ^ 0x98);
        e.lllIlIIlllI[28] = 9 ^ 0x1D;
        e.lllIlIIlllI[29] = 9 ^ 0xE;
        e.lllIlIIlllI[30] = 0xFFFFBDB9 & 0x4B7F;
        e.lllIlIIlllI[31] = -(0xFFFF9F3F & 0x66EF) & (0xFFFFB7EF & 0x4FFF);
        e.lllIlIIlllI[32] = 0x8A ^ 0x92;
        e.lllIlIIlllI[33] = -(0xFFFFF7D3 & 0x3EAD) & (0xFFFFFFFB & 0x3FBF);
        e.lllIlIIlllI[34] = -(0xFFFFFE75 & 0x3BAF) & (0xFFFFBBEF & 0x7FF7);
    }

    public int u() {
        return this.secondaryAmountRequired;
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private static String lIlIllllIllllI(String llllllllllllllllIIlIIlIllIllllII, String llllllllllllllllIIlIIlIllIlllIll) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlIllIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlIllIlllIll.getBytes(StandardCharsets.UTF_8)), lllIlIIlllI[27]), "DES");
            Cipher llllllllllllllllIIlIIlIllIlllllI = Cipher.getInstance("DES");
            llllllllllllllllIIlIIlIllIlllllI.init(lllIlIIlllI[10], llllllllllllllllIIlIIlIllIllllll);
            return new String(llllllllllllllllIIlIIlIllIlllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlIllIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIlIllIllllIl) {
            llllllllllllllllIIlIIlIllIllllIl.printStackTrace();
            return null;
        }
    }

    public int v() {
        return this.secondaryAmountToWithdraw;
    }

    public int s() {
        return this.primaryAmountToWithdraw;
    }

    private static boolean lIlIlllllIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIllllIlllIl(String llllllllllllllllIIlIIlIllIIllIlI, String llllllllllllllllIIlIIlIllIIllIIl) {
        llllllllllllllllIIlIIlIllIIllIlI = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIlIllIIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIIlIllIIlllIl = new StringBuilder();
        char[] llllllllllllllllIIlIIlIllIIlllII = llllllllllllllllIIlIIlIllIIllIIl.toCharArray();
        int llllllllllllllllIIlIIlIllIIllIll = lllIlIIlllI[2];
        char[] llllllllllllllllIIlIIlIllIIlIlIl = llllllllllllllllIIlIIlIllIIllIlI.toCharArray();
        int llllllllllllllllIIlIIlIllIIlIlII = llllllllllllllllIIlIIlIllIIlIlIl.length;
        int llllllllllllllllIIlIIlIllIIlIIll = lllIlIIlllI[2];
        while (e.lIlIlllllIIIlI(llllllllllllllllIIlIIlIllIIlIIll, llllllllllllllllIIlIIlIllIIlIlII)) {
            char llllllllllllllllIIlIIlIllIlIIIII = llllllllllllllllIIlIIlIllIIlIlIl[llllllllllllllllIIlIIlIllIIlIIll];
            llllllllllllllllIIlIIlIllIIlllIl.append((char)(llllllllllllllllIIlIIlIllIlIIIII ^ llllllllllllllllIIlIIlIllIIlllII[llllllllllllllllIIlIIlIllIIllIll % llllllllllllllllIIlIIlIllIIlllII.length]));
            0;
            ++llllllllllllllllIIlIIlIllIIllIll;
            ++llllllllllllllllIIlIIlIllIIlIIll;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIIlIllIIlllIl);
    }

    public int r() {
        return this.primaryOreRequired;
    }

    public int q() {
        return this.primaryOre;
    }

    private static String lIlIllllIlllll(String llllllllllllllllIIlIIlIllIlIllIl, String llllllllllllllllIIlIIlIllIlIlllI) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlIllIllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlIllIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIlIllIllIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIlIllIllIIIl.init(lllIlIIlllI[10], llllllllllllllllIIlIIlIllIllIIlI);
            return new String(llllllllllllllllIIlIIlIllIllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlIllIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIlIllIllIIII) {
            llllllllllllllllIIlIIlIllIllIIII.printStackTrace();
            return null;
        }
    }

    public int p() {
        return this.bar;
    }

    private e(int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        this.bar = n3;
        this.primaryOre = n4;
        this.primaryOreRequired = n5;
        this.primaryAmountToWithdraw = n6;
        this.secondaryOre = n7;
        this.secondaryAmountToWithdraw = n8;
        this.secondaryAmountRequired = n9;
        this.productionOption = n10;
    }

    private static void lIlIlllllIIIII() {
        lllIlIIllIl = new String[lllIlIIlllI[18]];
        e.lllIlIIllIl[e.lllIlIIlllI[2]] = e."BRONZE";
        e.lllIlIIllIl[e.lllIlIIlllI[0]] = e."BLURITE";
        e.lllIlIIllIl[e.lllIlIIlllI[10]] = e."IRON";
        e.lllIlIIllIl[e.lllIlIIlllI[13]] = e."SILVER";
        e.lllIlIIllIl[e.lllIlIIlllI[16]] = e."STEEL";
        e.lllIlIIllIl[e.lllIlIIlllI[21]] = e."GOLD";
        e.lllIlIIllIl[e.lllIlIIlllI[24]] = e."MITHRIL";
        e.lllIlIIllIl[e.lllIlIIlllI[29]] = e."ADAMANT";
        e.lllIlIIllIl[e.lllIlIIlllI[27]] = e."RUNITE";
    }

    public int w() {
        return this.productionOption;
    }

    static {
        e.lIlIlllllIIIIl();
        e.lIlIlllllIIIII();
        BRONZE = new e(lllIlIIlllI[3], lllIlIIlllI[4], lllIlIIlllI[0], lllIlIIlllI[5], lllIlIIlllI[6], lllIlIIlllI[5], lllIlIIlllI[0], lllIlIIlllI[0]);
        BLURITE = new e(lllIlIIlllI[7], lllIlIIlllI[8], lllIlIIlllI[9], lllIlIIlllI[10]);
        IRON = new e(lllIlIIlllI[11], lllIlIIlllI[12], lllIlIIlllI[9], lllIlIIlllI[13]);
        SILVER = new e(lllIlIIlllI[14], lllIlIIlllI[15], lllIlIIlllI[9], lllIlIIlllI[16]);
        STEEL = new e(lllIlIIlllI[17], lllIlIIlllI[12], lllIlIIlllI[0], lllIlIIlllI[18], lllIlIIlllI[19], lllIlIIlllI[20], lllIlIIlllI[10], lllIlIIlllI[21]);
        GOLD = new e(lllIlIIlllI[22], lllIlIIlllI[23], lllIlIIlllI[9], lllIlIIlllI[24]);
        MITHRIL = new e(lllIlIIlllI[25], lllIlIIlllI[26], lllIlIIlllI[0], lllIlIIlllI[27], lllIlIIlllI[19], lllIlIIlllI[28], lllIlIIlllI[16], lllIlIIlllI[29]);
        ADAMANT = new e(lllIlIIlllI[30], lllIlIIlllI[31], lllIlIIlllI[0], lllIlIIlllI[16], lllIlIIlllI[19], lllIlIIlllI[32], lllIlIIlllI[24], lllIlIIlllI[27]);
        RUNITE = new e(lllIlIIlllI[33], lllIlIIlllI[34], lllIlIIlllI[0], lllIlIIlllI[13], lllIlIIlllI[19], lllIlIIlllI[32], lllIlIIlllI[27], lllIlIIlllI[18]);
        e[] eArray = new e[lllIlIIlllI[18]];
        eArray[e.lllIlIIlllI[2]] = BRONZE;
        eArray[e.lllIlIIlllI[0]] = BLURITE;
        eArray[e.lllIlIIlllI[10]] = IRON;
        eArray[e.lllIlIIlllI[13]] = SILVER;
        eArray[e.lllIlIIlllI[16]] = STEEL;
        eArray[e.lllIlIIlllI[21]] = GOLD;
        eArray[e.lllIlIIlllI[24]] = MITHRIL;
        eArray[e.lllIlIIlllI[29]] = ADAMANT;
        eArray[e.lllIlIIlllI[27]] = RUNITE;
        $VALUES = eArray;
    }

    public int t() {
        return this.secondaryOre;
    }
}

