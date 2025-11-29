/*
 * Decompiled with CFR 0.152.
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class l
extends Enum<l> {
    public static final /* synthetic */ /* enum */ l APMEKEN;
    private static final /* synthetic */ l[] $VALUES;
    private final /* synthetic */ int doorId;
    private final /* synthetic */ String name;
    public static final /* synthetic */ /* enum */ l HET;
    private static /* synthetic */ String[] llIllIIIIII;
    public static final /* synthetic */ /* enum */ l CRONDIS;
    public static final /* synthetic */ /* enum */ l SCABARAS;
    private static /* synthetic */ int[] llIllIIIIIl;

    private static void lIlIlIIIlIIlIl() {
        llIllIIIIIl = new int[13];
        l.llIllIIIIIl[0] = (0x86 ^ 0xA4) & ~(0x78 ^ 0x5A);
        l.llIllIIIIIl[1] = " ".length();
        l.llIllIIIIIl[2] = -(0xFFFFBB3D & 0x46EB) & (0xFFFFBE7F & 0xF7F9);
        l.llIllIIIIIl[3] = "  ".length();
        l.llIllIIIIIl[4] = "   ".length();
        l.llIllIIIIIl[5] = -(0x47 ^ 0x66) & (0xFFFFFFEF & 0xB47B);
        l.llIllIIIIIl[6] = 0x79 ^ 0x38 ^ (0x50 ^ 0x15);
        l.llIllIIIIIl[7] = 0 ^ 5;
        l.llIllIIIIIl[8] = -(0xFFFFFFBF & 0x49E3) & (0xFFFFFDFE & 0xFFF7);
        l.llIllIIIIIl[9] = 0 ^ 6;
        l.llIllIIIIIl[10] = 0x97 ^ 0x90;
        l.llIllIIIIIl[11] = 0xFFFFBF5E & 0xF4EF;
        l.llIllIIIIIl[12] = 0x4C ^ 0x44;
    }

    public String l() {
        return this.name;
    }

    public int F() {
        return this.doorId;
    }

    static {
        l.lIlIlIIIlIIlIl();
        l.lIlIlIIIlIIlII();
        CRONDIS = new l(llIllIIIIII[llIllIIIIIl[1]], llIllIIIIIl[2]);
        SCABARAS = new l(llIllIIIIII[llIllIIIIIl[4]], llIllIIIIIl[5]);
        HET = new l(llIllIIIIII[llIllIIIIIl[7]], llIllIIIIIl[8]);
        APMEKEN = new l(llIllIIIIII[llIllIIIIIl[10]], llIllIIIIIl[11]);
        l[] lArray = new l[llIllIIIIIl[6]];
        lArray[l.llIllIIIIIl[0]] = CRONDIS;
        lArray[l.llIllIIIIIl[1]] = SCABARAS;
        lArray[l.llIllIIIIIl[3]] = HET;
        lArray[l.llIllIIIIIl[4]] = APMEKEN;
        $VALUES = lArray;
    }

    private static String lIlIlIIIlIIIlI(String llllllllllllllllIIlIlllllllIIlIl, String llllllllllllllllIIlIlllllllIIIlI) {
        try {
            SecretKeySpec llllllllllllllllIIlIlllllllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlllllllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlllllllIIlll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlllllllIIlll.init(llIllIIIIIl[3], llllllllllllllllIIlIlllllllIlIII);
            return new String(llllllllllllllllIIlIlllllllIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlllllllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlllllllIIllI) {
            llllllllllllllllIIlIlllllllIIllI.printStackTrace();
            return null;
        }
    }

    public static l valueOf(String string) {
        return Enum.valueOf(l.class, string);
    }

    private static String lIlIlIIIlIIIll(String llllllllllllllllIIlIllllllllIlIl, String llllllllllllllllIIlIlllllllllIIl) {
        llllllllllllllllIIlIllllllllIlIl = new String(Base64.getDecoder().decode(llllllllllllllllIIlIllllllllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIlllllllllIII = new StringBuilder();
        char[] llllllllllllllllIIlIllllllllIlll = llllllllllllllllIIlIlllllllllIIl.toCharArray();
        int llllllllllllllllIIlIllllllllIllI = llIllIIIIIl[0];
        char[] llllllllllllllllIIlIllllllllIIII = llllllllllllllllIIlIllllllllIlIl.toCharArray();
        int llllllllllllllllIIlIlllllllIllll = llllllllllllllllIIlIllllllllIIII.length;
        int llllllllllllllllIIlIlllllllIlllI = llIllIIIIIl[0];
        while (l.lIlIlIIIlIIllI(llllllllllllllllIIlIlllllllIlllI, llllllllllllllllIIlIlllllllIllll)) {
            char llllllllllllllllIIlIlllllllllIll = llllllllllllllllIIlIllllllllIIII[llllllllllllllllIIlIlllllllIlllI];
            llllllllllllllllIIlIlllllllllIII.append((char)(llllllllllllllllIIlIlllllllllIll ^ llllllllllllllllIIlIllllllllIlll[llllllllllllllllIIlIllllllllIllI % llllllllllllllllIIlIllllllllIlll.length]));
            "".length();
            ++llllllllllllllllIIlIllllllllIllI;
            ++llllllllllllllllIIlIlllllllIlllI;
            "".length();
            if (-" ".length() < ((0x4F ^ 0x21 ^ (5 ^ 0x53)) & ("   ".length() ^ (0x6D ^ 0x56) ^ -" ".length()))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIlllllllllIII);
    }

    private static boolean lIlIlIIIlIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIlIIIlIIlII() {
        llIllIIIIII = new String[llIllIIIIIl[12]];
        l.llIllIIIIII[l.llIllIIIIIl[0]] = l.lIlIlIIIlIIIIl("qOUBQim2/zo=", "xUTwH");
        l.llIllIIIIII[l.llIllIIIIIl[1]] = l.lIlIlIIIlIIIlI("s5OvGNUI8h8wtahCiPdijA==", "xjTCa");
        l.llIllIIIIII[l.llIllIIIIIl[3]] = l.lIlIlIIIlIIIll("JBciMQwlFTA=", "wTcsM");
        l.llIllIIIIII[l.llIllIIIIIl[4]] = l.lIlIlIIIlIIIlI("e8e1opYimylS/XG5Lnp5WZSZYSQPOiOR", "XbAzf");
        l.llIllIIIIII[l.llIllIIIIIl[6]] = l.lIlIlIIIlIIIIl("+OcvR1VL7tI=", "VdcMN");
        l.llIllIIIIII[l.llIllIIIIIl[7]] = l.lIlIlIIIlIIIll("HhgEJHchH1AEMjo=", "NypLW");
        l.llIllIIIIII[l.llIllIIIIIl[9]] = l.lIlIlIIIlIIIIl("JwUDPfxdeHs=", "Xednc");
        l.llIllIIIIII[l.llIllIIIIIl[10]] = l.lIlIlIIIlIIIlI("gWDrqpO6MchjJx4KE1dVYQ==", "EmPYP");
    }

    private l(String string2, int n3) {
        this.name = string2;
        this.doorId = n3;
    }

    public static l[] values() {
        return (l[])$VALUES.clone();
    }

    private static String lIlIlIIIlIIIIl(String llllllllllllllllIIllIIIIIIIIlIII, String llllllllllllllllIIllIIIIIIIIlIIl) {
        try {
            SecretKeySpec llllllllllllllllIIllIIIIIIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIIIIIIIlIIl.getBytes(StandardCharsets.UTF_8)), llIllIIIIIl[12]), "DES");
            Cipher llllllllllllllllIIllIIIIIIIIllII = Cipher.getInstance("DES");
            llllllllllllllllIIllIIIIIIIIllII.init(llIllIIIIIl[3], llllllllllllllllIIllIIIIIIIIllIl);
            return new String(llllllllllllllllIIllIIIIIIIIllII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIIIIIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllIIIIIIIIlIll) {
            llllllllllllllllIIllIIIIIIIIlIll.printStackTrace();
            return null;
        }
    }
}

