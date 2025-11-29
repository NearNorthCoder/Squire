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

public final class i
extends Enum<i> {
    public static final /* synthetic */ /* enum */ i MONKFISH;
    public static final /* synthetic */ /* enum */ i LOBSTER;
    private final /* synthetic */ int materialId;
    private final /* synthetic */ int craftingOption;
    public static final /* synthetic */ /* enum */ i SHRIMP;
    public static final /* synthetic */ /* enum */ i KARAMBWAN;
    private static /* synthetic */ int[] lllIIlllIll;
    public static final /* synthetic */ /* enum */ i BASS;
    public static final /* synthetic */ /* enum */ i TROUT;
    private final /* synthetic */ int finishedId;
    public static final /* synthetic */ /* enum */ i SWORDFISH;
    public static final /* synthetic */ /* enum */ i ANCHOVIES;
    public static final /* synthetic */ /* enum */ i MANTA_RAY;
    public static final /* synthetic */ /* enum */ i SEA_TURTLE;
    private static /* synthetic */ String[] lllIIlllIlI;
    public static final /* synthetic */ /* enum */ i SHARK;
    private static final /* synthetic */ i[] $VALUES;
    public static final /* synthetic */ /* enum */ i DARK_CRAB;
    public static final /* synthetic */ /* enum */ i SARDINE;
    public static final /* synthetic */ /* enum */ i SALMON;
    public static final /* synthetic */ /* enum */ i ANGLERFISH;
    public static final /* synthetic */ /* enum */ i TUNA;

    private static String lIlIlllIlIllII(String llllllllllllllllIIlIIllIlllllllI, String llllllllllllllllIIlIIllIllllllIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlllIIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllIllllllIl.getBytes(StandardCharsets.UTF_8)), lllIIlllIll[23]), "DES");
            Cipher llllllllllllllllIIlIIlllIIIIIIII = Cipher.getInstance("DES");
            llllllllllllllllIIlIIlllIIIIIIII.init(lllIIlllIll[5], llllllllllllllllIIlIIlllIIIIIIIl);
            return new String(llllllllllllllllIIlIIlllIIIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllIlllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIllIllllllll) {
            llllllllllllllllIIlIIllIllllllll.printStackTrace();
            return null;
        }
    }

    public static i valueOf(String string) {
        return Enum.valueOf(i.class, string);
    }

    private static boolean lIlIlllIlIllll(int n2, int n3) {
        return n2 < n3;
    }

    private i(int n3, int n4, int n5) {
        this.materialId = n3;
        this.finishedId = n4;
        this.craftingOption = n5;
    }

    static {
        i.lIlIlllIlIlllI();
        i.lIlIlllIlIllIl();
        SHRIMP = new i(lllIIlllIll[1], lllIIlllIll[1], lllIIlllIll[2]);
        ANCHOVIES = new i(lllIIlllIll[3], lllIIlllIll[4], lllIIlllIll[2]);
        SARDINE = new i(lllIIlllIll[6], lllIIlllIll[7], lllIIlllIll[2]);
        TROUT = new i(lllIIlllIll[9], lllIIlllIll[10], lllIIlllIll[2]);
        SALMON = new i(lllIIlllIll[12], lllIIlllIll[13], lllIIlllIll[2]);
        TUNA = new i(lllIIlllIll[15], lllIIlllIll[16], lllIIlllIll[2]);
        KARAMBWAN = new i(lllIIlllIll[18], lllIIlllIll[19], lllIIlllIll[2]);
        LOBSTER = new i(lllIIlllIll[21], lllIIlllIll[22], lllIIlllIll[2]);
        BASS = new i(lllIIlllIll[24], lllIIlllIll[25], lllIIlllIll[2]);
        SWORDFISH = new i(lllIIlllIll[27], lllIIlllIll[28], lllIIlllIll[2]);
        MONKFISH = new i(lllIIlllIll[30], lllIIlllIll[31], lllIIlllIll[2]);
        SHARK = new i(lllIIlllIll[33], lllIIlllIll[34], lllIIlllIll[2]);
        SEA_TURTLE = new i(lllIIlllIll[36], lllIIlllIll[37], lllIIlllIll[2]);
        ANGLERFISH = new i(lllIIlllIll[39], lllIIlllIll[40], lllIIlllIll[2]);
        DARK_CRAB = new i(lllIIlllIll[42], lllIIlllIll[43], lllIIlllIll[2]);
        MANTA_RAY = new i(lllIIlllIll[45], lllIIlllIll[46], lllIIlllIll[2]);
        i[] iArray = new i[lllIIlllIll[47]];
        iArray[i.lllIIlllIll[0]] = SHRIMP;
        iArray[i.lllIIlllIll[2]] = ANCHOVIES;
        iArray[i.lllIIlllIll[5]] = SARDINE;
        iArray[i.lllIIlllIll[8]] = TROUT;
        iArray[i.lllIIlllIll[11]] = SALMON;
        iArray[i.lllIIlllIll[14]] = TUNA;
        iArray[i.lllIIlllIll[17]] = KARAMBWAN;
        iArray[i.lllIIlllIll[20]] = LOBSTER;
        iArray[i.lllIIlllIll[23]] = BASS;
        iArray[i.lllIIlllIll[26]] = SWORDFISH;
        iArray[i.lllIIlllIll[29]] = MONKFISH;
        iArray[i.lllIIlllIll[32]] = SHARK;
        iArray[i.lllIIlllIll[35]] = SEA_TURTLE;
        iArray[i.lllIIlllIll[38]] = ANGLERFISH;
        iArray[i.lllIIlllIll[41]] = DARK_CRAB;
        iArray[i.lllIIlllIll[44]] = MANTA_RAY;
        $VALUES = iArray;
    }

    public int C() {
        return this.craftingOption;
    }

    private static String lIlIlllIlIlIlI(String llllllllllllllllIIlIIlllIIIIlllI, String llllllllllllllllIIlIIlllIIIIllIl) {
        llllllllllllllllIIlIIlllIIIIlllI = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIlllIIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIIlllIIIlIIIl = new StringBuilder();
        char[] llllllllllllllllIIlIIlllIIIlIIII = llllllllllllllllIIlIIlllIIIIllIl.toCharArray();
        int llllllllllllllllIIlIIlllIIIIllll = lllIIlllIll[0];
        char[] llllllllllllllllIIlIIlllIIIIlIIl = llllllllllllllllIIlIIlllIIIIlllI.toCharArray();
        int llllllllllllllllIIlIIlllIIIIlIII = llllllllllllllllIIlIIlllIIIIlIIl.length;
        int llllllllllllllllIIlIIlllIIIIIlll = lllIIlllIll[0];
        while (i.lIlIlllIlIllll(llllllllllllllllIIlIIlllIIIIIlll, llllllllllllllllIIlIIlllIIIIlIII)) {
            char llllllllllllllllIIlIIlllIIIlIlII = llllllllllllllllIIlIIlllIIIIlIIl[llllllllllllllllIIlIIlllIIIIIlll];
            llllllllllllllllIIlIIlllIIIlIIIl.append((char)(llllllllllllllllIIlIIlllIIIlIlII ^ llllllllllllllllIIlIIlllIIIlIIII[llllllllllllllllIIlIIlllIIIIllll % llllllllllllllllIIlIIlllIIIlIIII.length]));
            "".length();
            ++llllllllllllllllIIlIIlllIIIIllll;
            ++llllllllllllllllIIlIIlllIIIIIlll;
            "".length();
            if (-(0x36 ^ 0x2B ^ (0x58 ^ 0x40)) < 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIIlllIIIlIIIl);
    }

    private static void lIlIlllIlIlllI() {
        lllIIlllIll = new int[48];
        i.lllIIlllIll[0] = (0x5D ^ 0x43) & ~(0xB8 ^ 0xA6);
        i.lllIIlllIll[1] = 0xFFFF893F & 0x77FD;
        i.lllIIlllIll[2] = " ".length();
        i.lllIIlllIll[3] = 0xFFFFDFF1 & 0x214F;
        i.lllIIlllIll[4] = -(0xFFFFF64B & 0x2FF5) & (0xFFFFFFFF & 0x277F);
        i.lllIIlllIll[5] = "  ".length();
        i.lllIIlllIll[6] = -(0xFFFFFFBD & 0x5EDB) & (0xFFFFFFDF & 0x5FFF);
        i.lllIIlllIll[7] = 0xFFFFEFE5 & 0x115F;
        i.lllIIlllIll[8] = "   ".length();
        i.lllIIlllIll[9] = 0xFFFFF3CF & 0xD7F;
        i.lllIIlllIll[10] = -(0xFFFFFA79 & 0x3DB7) & (0xFFFFFFFD & 0x397F);
        i.lllIIlllIll[11] = 0x9B ^ 0x9F;
        i.lllIIlllIll[12] = 0xFFFFFB4B & 0x5FF;
        i.lllIIlllIll[13] = 0xFFFFB3C9 & 0x4D7F;
        i.lllIIlllIll[14] = 0x2B ^ 0xD ^ (0x71 ^ 0x52);
        i.lllIIlllIll[15] = -(0xFFFFEF1D & 0x74FB) & (0xFFFFFF7F & 0x65FF);
        i.lllIIlllIll[16] = -(0xFFFFFFDF & 0x4027) & (0xFFFFE9EF & 0x577F);
        i.lllIIlllIll[17] = 48 + 30 - 56 + 141 ^ 48 + 45 - 1 + 73;
        i.lllIIlllIll[18] = 0xFFFF8FEF & 0x7C56;
        i.lllIIlllIll[19] = -(0xFFFFE87D & 0x37A3) & (0xFFFFECED & 0x3F7A);
        i.lllIIlllIll[20] = 0x1D ^ 0x74 ^ (0x42 ^ 0x2C);
        i.lllIIlllIll[21] = 0xFFFF997D & 0x67FB;
        i.lllIIlllIll[22] = -(0xFFFFBBD5 & 0x7EAF) & (0xFFFFBBFF & Short.MAX_VALUE);
        i.lllIIlllIll[23] = 0x8F ^ 0x87;
        i.lllIIlllIll[24] = 0xFFFFCD7B & 0x33EF;
        i.lllIIlllIll[25] = -(0xFFFFEF9F & 0x7EF3) & (0xFFFFFFFF & 0x6FFF);
        i.lllIIlllIll[26] = 0xED ^ 0xA9 ^ (0x4C ^ 1);
        i.lllIIlllIll[27] = -(0xFFFFEF8F & 0x787D) & (0xFFFFEBFF & 0x7D7F);
        i.lllIIlllIll[28] = 0xFFFFC7F7 & 0x397D;
        i.lllIIlllIll[29] = 8 ^ 0x27 ^ (0x6B ^ 0x4E);
        i.lllIIlllIll[30] = -(0x58 ^ 0x4B) & (0xFFFF9F9F & 0x7F7A);
        i.lllIIlllIll[31] = -(0xFFFFACD7 & 0x73ED) & (0xFFFFBFEF & 0x7FDE);
        i.lllIIlllIll[32] = 0x64 ^ 0x6F;
        i.lllIIlllIll[33] = -(0xFFFFBE85 & 0x537B) & (0xFFFFD37F & 0x3FFF);
        i.lllIIlllIll[34] = -(0xFFFFFCFF & 0x677D) & (0xFFFFFDFF & 0x67FD);
        i.lllIIlllIll[35] = 0x91 ^ 0x9D;
        i.lllIIlllIll[36] = -(0xFFFFDD39 & 0x6AE7) & (0xFFFFDFBB & 0x69EF);
        i.lllIIlllIll[37] = -(0xFFFFD677 & 0x69EB) & (0xFFFFEBFF & 0x55EF);
        i.lllIIlllIll[38] = 0x51 ^ 0x64 ^ (0x47 ^ 0x7F);
        i.lllIIlllIll[39] = 0xFFFFFFFF & 0x347F;
        i.lllIIlllIll[40] = 0xFFFFBCD9 & 0x77A7;
        i.lllIIlllIll[41] = 0x84 ^ 0x8A;
        i.lllIIlllIll[42] = 0xFFFFAEBF & 0x7FDE;
        i.lllIIlllIll[43] = -(0xFFFFF7E9 & 0x495F) & (0xFFFFFFFF & 0x6FE8);
        i.lllIIlllIll[44] = 0x83 ^ 0x8C;
        i.lllIIlllIll[45] = -(0xFFFFFCDF & 0x7779) & (0xFFFFF5DF & 0x7FFD);
        i.lllIIlllIll[46] = 0xFFFFCDE7 & 0x339F;
        i.lllIIlllIll[47] = 0xD2 ^ 0xAF ^ (0x38 ^ 0x55);
    }

    public int B() {
        return this.finishedId;
    }

    private static void lIlIlllIlIllIl() {
        lllIIlllIlI = new String[lllIIlllIll[47]];
        i.lllIIlllIlI[i.lllIIlllIll[0]] = i.lIlIlllIlIlIlI("KgIlJBcp", "yJwmZ");
        i.lllIIlllIlI[i.lllIIlllIll[2]] = i.lIlIlllIlIlIlI("CRkwDzceHjYU", "HWsGx");
        i.lllIIlllIlI[i.lllIIlllIll[5]] = i.lIlIlllIlIlIlI("BTUXDycYMQ==", "VtEKn");
        i.lllIIlllIlI[i.lllIIlllIll[8]] = i.lIlIlllIlIlIlI("DScCOhw=", "YuMoH");
        i.lllIIlllIlI[i.lllIIlllIll[11]] = i.lIlIlllIlIlIlI("EDAcPgwN", "CqPsC");
        i.lllIIlllIlI[i.lllIIlllIll[14]] = i.lIlIlllIlIlIlI("ICUcEQ==", "tpRPA");
        i.lllIIlllIlI[i.lllIIlllIll[17]] = i.lIlIlllIlIlIll("4EK8fn2MKxbxTCK3Ca//Yw==", "UYCcx");
        i.lllIIlllIlI[i.lllIIlllIll[20]] = i.lIlIlllIlIlIll("T9MUDQX4smM=", "RpdAe");
        i.lllIIlllIlI[i.lllIIlllIll[23]] = i.lIlIlllIlIlIlI("JDIJGA==", "fsZKO");
        i.lllIIlllIlI[i.lllIIlllIll[26]] = i.lIlIlllIlIllII("2scgxssY6o2T2luMlo+KMA==", "ypNKI");
        i.lllIIlllIlI[i.lllIIlllIll[29]] = i.lIlIlllIlIllII("mc6HMe57agxvNntXb0uwEQ==", "cgLkV");
        i.lllIIlllIlI[i.lllIIlllIll[32]] = i.lIlIlllIlIllII("EmEpM6IxCrs=", "czHAC");
        i.lllIIlllIlI[i.lllIIlllIll[35]] = i.lIlIlllIlIllII("HOdOrerp8wVt724o03Ux2Q==", "iNWGH");
        i.lllIIlllIlI[i.lllIIlllIll[38]] = i.lIlIlllIlIlIll("4sbnnrt4VyVOpjqYGfpL7A==", "JMNoE");
        i.lllIIlllIlI[i.lllIIlllIll[41]] = i.lIlIlllIlIllII("gkHSQMYF5khzR+ET3dtkWg==", "kSvZc");
        i.lllIIlllIlI[i.lllIIlllIll[44]] = i.lIlIlllIlIllII("JhHIV5PB6s0isQP3JjRBrw==", "vPjpW");
    }

    private static String lIlIlllIlIlIll(String llllllllllllllllIIlIIlllIIlIIIll, String llllllllllllllllIIlIIlllIIlIIIII) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlllIIlIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlllIIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIlllIIlIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIlllIIlIIlIl.init(lllIIlllIll[5], llllllllllllllllIIlIIlllIIlIIllI);
            return new String(llllllllllllllllIIlIIlllIIlIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlllIIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIlllIIlIIlII) {
            llllllllllllllllIIlIIlllIIlIIlII.printStackTrace();
            return null;
        }
    }

    public int A() {
        return this.materialId;
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }
}

