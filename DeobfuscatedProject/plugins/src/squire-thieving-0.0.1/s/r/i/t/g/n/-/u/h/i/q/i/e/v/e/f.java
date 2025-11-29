/*
 * Decompiled with CFR 0.152.
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class f
extends Enum<f> {
    public static final /* synthetic */ /* enum */ f VYRE;
    public static final /* synthetic */ /* enum */ f ELF;
    public static final /* synthetic */ /* enum */ f MAN;
    private static final /* synthetic */ f[] $VALUES;
    private static /* synthetic */ int[] lIIlllIIlIllI;
    private static /* synthetic */ String[] lIIlllIIlIlIl;
    public static final /* synthetic */ /* enum */ f ARDY_KNIGHT;
    private final /* synthetic */ String name;
    public static final /* synthetic */ /* enum */ f MASTER_FARMER;
    public static final /* synthetic */ /* enum */ f TZHAAR;

    static {
        f.lIllIIllIIIlIlI();
        f.lIllIIllIIIlIIl();
        ARDY_KNIGHT = new f(lIIlllIIlIlIl[lIIlllIIlIllI[1]]);
        MASTER_FARMER = new f(lIIlllIIlIlIl[lIIlllIIlIllI[3]]);
        MAN = new f(lIIlllIIlIlIl[lIIlllIIlIllI[5]]);
        VYRE = new f(lIIlllIIlIlIl[lIIlllIIlIllI[7]]);
        ELF = new f(lIIlllIIlIlIl[lIIlllIIlIllI[9]]);
        TZHAAR = new f(lIIlllIIlIlIl[lIIlllIIlIllI[11]]);
        f[] fArray = new f[lIIlllIIlIllI[6]];
        fArray[f.lIIlllIIlIllI[0]] = ARDY_KNIGHT;
        fArray[f.lIIlllIIlIllI[1]] = MASTER_FARMER;
        fArray[f.lIIlllIIlIllI[2]] = MAN;
        fArray[f.lIIlllIIlIllI[3]] = VYRE;
        fArray[f.lIIlllIIlIllI[4]] = ELF;
        fArray[f.lIIlllIIlIllI[5]] = TZHAAR;
        $VALUES = fArray;
    }

    private static void lIllIIllIIIlIlI() {
        lIIlllIIlIllI = new int[13];
        f.lIIlllIIlIllI[0] = (0xC4 ^ 0x99) & ~(0xC5 ^ 0x98);
        f.lIIlllIIlIllI[1] = " ".length();
        f.lIIlllIIlIllI[2] = "  ".length();
        f.lIIlllIIlIllI[3] = "   ".length();
        f.lIIlllIIlIllI[4] = 0xA ^ 0xE;
        f.lIIlllIIlIllI[5] = 0x47 ^ 0x42;
        f.lIIlllIIlIllI[6] = 0xA7 ^ 0xA1;
        f.lIIlllIIlIllI[7] = 91 + 90 - 91 + 41 ^ 22 + 65 - 42 + 87;
        f.lIIlllIIlIllI[8] = 0x8B ^ 0x83;
        f.lIIlllIIlIllI[9] = 0xCA ^ 0xC3;
        f.lIIlllIIlIllI[10] = 0x9D ^ 0x97;
        f.lIIlllIIlIllI[11] = 28 + 86 - 54 + 115 ^ 93 + 0 - 37 + 108;
        f.lIIlllIIlIllI[12] = 0x3B ^ 0x7E ^ (0x12 ^ 0x5B);
    }

    private f(String string2) {
        this.name = string2;
    }

    private static String lIllIIllIIIlIII(String llllllllllllllIlllIllIIIIIIlllIl, String llllllllllllllIlllIllIIIIIIllllI) {
        try {
            SecretKeySpec llllllllllllllIlllIllIIIIIlIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIIIIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllIIIIIlIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllIIIIIlIIIIl.init(lIIlllIIlIllI[2], llllllllllllllIlllIllIIIIIlIIIlI);
            return new String(llllllllllllllIlllIllIIIIIlIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIIIIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIIIIIlIIIII) {
            llllllllllllllIlllIllIIIIIlIIIII.printStackTrace();
            return null;
        }
    }

    public String v() {
        return this.name;
    }

    private static void lIllIIllIIIlIIl() {
        lIIlllIIlIlIl = new String[lIIlllIIlIllI[12]];
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[0]] = f.lIllIIllIIIIlll("FjElKy4cLSg1OQM=", "Wcarq");
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[1]] = f.lIllIIllIIIlIII("aJP5dbq8VidzpQ+o0u4PshTLYFXTeVbv", "vBheH");
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[2]] = f.lIllIIllIIIlIII("zdiyJQ3QKr0HBNq8rdB/mA==", "GXPCb");
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[3]] = f.lIllIIllIIIIlll("NAI7OhwLQw4vCxQGOg==", "ycHNy");
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[4]] = f.lIllIIllIIIIlll("JhIi", "kSlkL");
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[5]] = f.lIllIIllIIIIlll("LyUs", "bDBoz");
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[6]] = f.lIllIIllIIIIlll("Aw4DFQ==", "UWQPO");
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[7]] = f.lIllIIllIIIlIII("6+SL8sIT5+A=", "ywmNq");
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[8]] = f.lIllIIllIIIIlll("IyUS", "fiTAT");
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[9]] = f.lIllIIllIIIIlll("DRYk", "HzBGE");
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[10]] = f.lIllIIllIIIlIII("9jYt0aedJT4=", "mUwPX");
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[11]] = f.lIllIIllIIIlIII("eVLGWvPf28YQz3yBV0SjaQ==", "KzTNE");
    }

    private static boolean lIllIIllIIIlIll(int n2, int n3) {
        return n2 < n3;
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

    private static String lIllIIllIIIIlll(String llllllllllllllIlllIllIIIIIIIllll, String llllllllllllllIlllIllIIIIIIIlllI) {
        llllllllllllllIlllIllIIIIIIIllll = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIIIIIIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllIIIIIIIllIl = new StringBuilder();
        char[] llllllllllllllIlllIllIIIIIIIllII = llllllllllllllIlllIllIIIIIIIlllI.toCharArray();
        int llllllllllllllIlllIllIIIIIIIlIll = lIIlllIIlIllI[0];
        char[] llllllllllllllIlllIllIIIIIIIIlIl = llllllllllllllIlllIllIIIIIIIllll.toCharArray();
        int llllllllllllllIlllIllIIIIIIIIlII = llllllllllllllIlllIllIIIIIIIIlIl.length;
        int llllllllllllllIlllIllIIIIIIIIIll = lIIlllIIlIllI[0];
        while (f.lIllIIllIIIlIll(llllllllllllllIlllIllIIIIIIIIIll, llllllllllllllIlllIllIIIIIIIIlII)) {
            char llllllllllllllIlllIllIIIIIIlIIII = llllllllllllllIlllIllIIIIIIIIlIl[llllllllllllllIlllIllIIIIIIIIIll];
            llllllllllllllIlllIllIIIIIIIllIl.append((char)(llllllllllllllIlllIllIIIIIIlIIII ^ llllllllllllllIlllIllIIIIIIIllII[llllllllllllllIlllIllIIIIIIIlIll % llllllllllllllIlllIllIIIIIIIllII.length]));
            "".length();
            ++llllllllllllllIlllIllIIIIIIIlIll;
            ++llllllllllllllIlllIllIIIIIIIIIll;
            "".length();
            if ("  ".length() != 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIllIIIIIIIllIl);
    }

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }
}

