package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.l  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/l.class */
public final class EnumC0063l {
    public static final /* synthetic */ EnumC0063l APMEKEN;
    private static final /* synthetic */ EnumC0063l[] $VALUES;
    private final /* synthetic */ int doorId;
    private final /* synthetic */ String name;
    public static final /* synthetic */ EnumC0063l HET;
    private static /* synthetic */ String[] llIllIIIIII;
    public static final /* synthetic */ EnumC0063l CRONDIS;
    public static final /* synthetic */ EnumC0063l SCABARAS;
    private static /* synthetic */ int[] llIllIIIIIl;

    private static void lIlIlIIIlIIlIl() {
        llIllIIIIIl = new int[13];
        llIllIIIIIl[0] = (134 ^ 164) & ((120 ^ 90) ^ (-1));
        llIllIIIIIl[1] = " ".length();
        llIllIIIIIl[2] = (-((-17603) & 18155)) & (-16769) & 63481;
        llIllIIIIIl[3] = "  ".length();
        llIllIIIIIl[4] = "   ".length();
        llIllIIIIIl[5] = (-(71 ^ 102)) & (-17) & 46203;
        llIllIIIIIl[6] = (121 ^ 56) ^ (80 ^ 21);
        llIllIIIIIl[7] = 0 ^ 5;
        llIllIIIIIl[8] = (-((-65) & 18915)) & (-514) & 65527;
        llIllIIIIIl[9] = 0 ^ 6;
        llIllIIIIIl[10] = 151 ^ 144;
        llIllIIIIIl[11] = (-16546) & 62703;
        llIllIIIIIl[12] = 76 ^ 68;
    }

    public String l() {
        return this.name;
    }

    public int F() {
        return this.doorId;
    }

    static {
        lIlIlIIIlIIlIl();
        lIlIlIIIlIIlII();
        CRONDIS = new EnumC0063l(llIllIIIIII[llIllIIIIIl[0]], llIllIIIIIl[0], llIllIIIIII[llIllIIIIIl[1]], llIllIIIIIl[2]);
        SCABARAS = new EnumC0063l(llIllIIIIII[llIllIIIIIl[3]], llIllIIIIIl[1], llIllIIIIII[llIllIIIIIl[4]], llIllIIIIIl[5]);
        HET = new EnumC0063l(llIllIIIIII[llIllIIIIIl[6]], llIllIIIIIl[3], llIllIIIIII[llIllIIIIIl[7]], llIllIIIIIl[8]);
        APMEKEN = new EnumC0063l(llIllIIIIII[llIllIIIIIl[9]], llIllIIIIIl[4], llIllIIIIII[llIllIIIIIl[10]], llIllIIIIIl[11]);
        EnumC0063l[] enumC0063lArr = new EnumC0063l[llIllIIIIIl[6]];
        enumC0063lArr[llIllIIIIIl[0]] = CRONDIS;
        enumC0063lArr[llIllIIIIIl[1]] = SCABARAS;
        enumC0063lArr[llIllIIIIIl[3]] = HET;
        enumC0063lArr[llIllIIIIIl[4]] = APMEKEN;
        $VALUES = enumC0063lArr;
    }

    private static String lIlIlIIIlIIIlI(String llllllllllllllllIIlIlllllllIIlIl, String llllllllllllllllIIlIlllllllIIlII) {
        try {
            SecretKeySpec llllllllllllllllIIlIlllllllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlllllllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlllllllIIlll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlllllllIIlll.init(llIllIIIIIl[3], llllllllllllllllIIlIlllllllIlIII);
            return new String(llllllllllllllllIIlIlllllllIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlllllllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlllllllIIllI) {
            llllllllllllllllIIlIlllllllIIllI.printStackTrace();
            return null;
        }
    }

    public static EnumC0063l valueOf(String str) {
        return (EnumC0063l) Enum.valueOf(EnumC0063l.class, str);
    }

    private static String lIlIlIIIlIIIll(String llllllllllllllllIIlIlllllllllIlI, String llllllllllllllllIIlIllllllllIlII) {
        String llllllllllllllllIIlIlllllllllIlI2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlllllllllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIIlIllllllllIlll = llllllllllllllllIIlIllllllllIlII.toCharArray();
        int llllllllllllllllIIlIllllllllIllI = llIllIIIIIl[0];
        char[] charArray = llllllllllllllllIIlIlllllllllIlI2.toCharArray();
        int length = charArray.length;
        int i = llIllIIIIIl[0];
        while (lIlIlIIIlIIllI(i, length)) {
            char llllllllllllllllIIlIlllllllllIll = charArray[i];
            sb.append((char) (llllllllllllllllIIlIlllllllllIll ^ llllllllllllllllIIlIllllllllIlll[llllllllllllllllIIlIllllllllIllI % llllllllllllllllIIlIllllllllIlll.length]));
            "".length();
            llllllllllllllllIIlIllllllllIllI++;
            i++;
            "".length();
            if ((-" ".length()) >= (((79 ^ 33) ^ (5 ^ 83)) & (("   ".length() ^ (109 ^ 86)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIlIIIlIIllI(int i, int i2) {
        return i < i2;
    }

    private static void lIlIlIIIlIIlII() {
        llIllIIIIII = new String[llIllIIIIIl[12]];
        llIllIIIIII[llIllIIIIIl[0]] = lIlIlIIIlIIIIl("qOUBQim2/zo=", "xUTwH");
        llIllIIIIII[llIllIIIIIl[1]] = lIlIlIIIlIIIlI("s5OvGNUI8h8wtahCiPdijA==", "xjTCa");
        llIllIIIIII[llIllIIIIIl[3]] = lIlIlIIIlIIIll("JBciMQwlFTA=", "wTcsM");
        llIllIIIIII[llIllIIIIIl[4]] = lIlIlIIIlIIIlI("e8e1opYimylS/XG5Lnp5WZSZYSQPOiOR", "XbAzf");
        llIllIIIIII[llIllIIIIIl[6]] = lIlIlIIIlIIIIl("+OcvR1VL7tI=", "VdcMN");
        llIllIIIIII[llIllIIIIIl[7]] = lIlIlIIIlIIIll("HhgEJHchH1AEMjo=", "NypLW");
        llIllIIIIII[llIllIIIIIl[9]] = lIlIlIIIlIIIIl("JwUDPfxdeHs=", "Xednc");
        llIllIIIIII[llIllIIIIIl[10]] = lIlIlIIIlIIIlI("gWDrqpO6MchjJx4KE1dVYQ==", "EmPYP");
    }

    private EnumC0063l(String str, int i, String str2, int i2) {
        this.name = str2;
        this.doorId = i2;
    }

    public static EnumC0063l[] values() {
        return (EnumC0063l[]) $VALUES.clone();
    }

    private static String lIlIlIIIlIIIIl(String llllllllllllllllIIllIIIIIIIIlIlI, String llllllllllllllllIIllIIIIIIIIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIIIIIIIlIIl.getBytes(StandardCharsets.UTF_8)), llIllIIIIIl[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIllIIIIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIIIIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIIIIIIIIlIll) {
            llllllllllllllllIIllIIIIIIIIlIll.printStackTrace();
            return null;
        }
    }
}
