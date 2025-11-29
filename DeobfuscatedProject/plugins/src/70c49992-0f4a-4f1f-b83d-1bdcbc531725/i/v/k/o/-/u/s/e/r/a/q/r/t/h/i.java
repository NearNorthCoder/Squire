/*
 * Decompiled with CFR 0.152.
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class i
extends Enum<i> {
    public static final /* synthetic */ /* enum */ i BLOWPIE;
    public static final /* synthetic */ /* enum */ i CBOW;
    public static final /* synthetic */ /* enum */ i NELEE;
    private static /* synthetic */ int[] lIlIllIIllIll;
    public static final /* synthetic */ /* enum */ i MELEE;
    public static final /* synthetic */ /* enum */ i OTHER;
    private static final /* synthetic */ i[] $VALUES;
    private static /* synthetic */ String[] lIlIllIIllIlI;

    public static i valueOf(String string) {
        return Enum.valueOf(i.class, string);
    }

    private static String llIIIIIIllIIIll(String llllllllllllllIllIlIIlIlIIIlllll, String llllllllllllllIllIlIIlIlIIIllIIl) {
        llllllllllllllIllIlIIlIlIIIlllll = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIlIlIIIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIIlIlIIIlllIl = new StringBuilder();
        char[] llllllllllllllIllIlIIlIlIIIlllII = llllllllllllllIllIlIIlIlIIIllIIl.toCharArray();
        int llllllllllllllIllIlIIlIlIIIllIll = lIlIllIIllIll[0];
        char[] llllllllllllllIllIlIIlIlIIIlIlIl = llllllllllllllIllIlIIlIlIIIlllll.toCharArray();
        int llllllllllllllIllIlIIlIlIIIlIlII = llllllllllllllIllIlIIlIlIIIlIlIl.length;
        int llllllllllllllIllIlIIlIlIIIlIIll = lIlIllIIllIll[0];
        while (i.llIIIIIIllIIllI(llllllllllllllIllIlIIlIlIIIlIIll, llllllllllllllIllIlIIlIlIIIlIlII)) {
            char llllllllllllllIllIlIIlIlIIlIIIII = llllllllllllllIllIlIIlIlIIIlIlIl[llllllllllllllIllIlIIlIlIIIlIIll];
            llllllllllllllIllIlIIlIlIIIlllIl.append((char)(llllllllllllllIllIlIIlIlIIlIIIII ^ llllllllllllllIllIlIIlIlIIIlllII[llllllllllllllIllIlIIlIlIIIllIll % llllllllllllllIllIlIIlIlIIIlllII.length]));
            "".length();
            ++llllllllllllllIllIlIIlIlIIIllIll;
            ++llllllllllllllIllIlIIlIlIIIlIIll;
            "".length();
            if (-" ".length() < 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIIlIlIIIlllIl);
    }

    private static String llIIIIIIllIIIlI(String llllllllllllllIllIlIIlIlIIIIlIlI, String llllllllllllllIllIlIIlIlIIIIIlll) {
        try {
            SecretKeySpec llllllllllllllIllIlIIlIlIIIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIlIlIIIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIIlIlIIIIllII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIIlIlIIIIllII.init(lIlIllIIllIll[2], llllllllllllllIllIlIIlIlIIIIllIl);
            return new String(llllllllllllllIllIlIIlIlIIIIllII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIlIlIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIlIlIIIIlIll) {
            llllllllllllllIllIlIIlIlIIIIlIll.printStackTrace();
            return null;
        }
    }

    static {
        i.llIIIIIIllIIlIl();
        i.llIIIIIIllIIlII();
        NELEE = new i();
        BLOWPIE = new i();
        CBOW = new i();
        MELEE = new i();
        OTHER = new i();
        i[] iArray = new i[lIlIllIIllIll[5]];
        iArray[i.lIlIllIIllIll[0]] = NELEE;
        iArray[i.lIlIllIIllIll[1]] = BLOWPIE;
        iArray[i.lIlIllIIllIll[2]] = CBOW;
        iArray[i.lIlIllIIllIll[3]] = MELEE;
        iArray[i.lIlIllIIllIll[4]] = OTHER;
        $VALUES = iArray;
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    private static boolean llIIIIIIllIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIIIIIllIIIIl(String llllllllllllllIllIlIIlIlIIlIllIl, String llllllllllllllIllIlIIlIlIIlIlllI) {
        try {
            SecretKeySpec llllllllllllllIllIlIIlIlIIllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIlIlIIlIlllI.getBytes(StandardCharsets.UTF_8)), lIlIllIIllIll[6]), "DES");
            Cipher llllllllllllllIllIlIIlIlIIllIIIl = Cipher.getInstance("DES");
            llllllllllllllIllIlIIlIlIIllIIIl.init(lIlIllIIllIll[2], llllllllllllllIllIlIIlIlIIllIIlI);
            return new String(llllllllllllllIllIlIIlIlIIllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIlIlIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIlIlIIllIIII) {
            llllllllllllllIllIlIIlIlIIllIIII.printStackTrace();
            return null;
        }
    }

    private static void llIIIIIIllIIlIl() {
        lIlIllIIllIll = new int[7];
        i.lIlIllIIllIll[0] = (0x64 ^ 0x57 ^ "  ".length()) & (0x12 ^ 0x54 ^ (0x14 ^ 0x63) ^ -" ".length());
        i.lIlIllIIllIll[1] = " ".length();
        i.lIlIllIIllIll[2] = "  ".length();
        i.lIlIllIIllIll[3] = "   ".length();
        i.lIlIllIIllIll[4] = 0xE9 ^ 0xB4 ^ (0x3A ^ 0x63);
        i.lIlIllIIllIll[5] = 0x3B ^ 0x3E;
        i.lIlIllIIllIll[6] = 2 ^ 0xA;
    }

    private static void llIIIIIIllIIlII() {
        lIlIllIIllIlI = new String[lIlIllIIllIll[5]];
        i.lIlIllIIllIlI[i.lIlIllIIllIll[0]] = i.llIIIIIIllIIIIl("XOj9tjdsm20=", "SXfSA");
        i.lIlIllIIllIlI[i.lIlIllIIllIll[1]] = i.llIIIIIIllIIIlI("FXyRmEaNqvc=", "zjQrV");
        i.lIlIllIIllIlI[i.lIlIllIIllIll[2]] = i.llIIIIIIllIIIlI("BgJhuEnsMbk=", "uuRVv");
        i.lIlIllIIllIlI[i.lIlIllIIllIll[3]] = i.llIIIIIIllIIIll("CS04Fg0=", "DhtSH");
        i.lIlIllIIllIlI[i.lIlIllIIllIll[4]] = i.llIIIIIIllIIIlI("9kkvQM4DMYU=", "UIwAy");
    }
}

