package i.e.u.e.s.r.a.l.q.p000.p0010.s.p0022.p0032.u.e.p004.g.p0055;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i.e.u.e.s.r.a.l.q.-.0.s.2.2.u.e.-.g.5.d  reason: invalid package */
/* loaded from: 21e931a2-dcd2-41bf-996b-cb50a8d5161d.jar:i/e/u/e/s/r/a/l/q/-/0/s/2/2/u/e/-/g/5/d.class */
public final class d {
    public static final /* synthetic */ d GOLD;
    public static final /* synthetic */ d IRON;
    public static final /* synthetic */ d MITHRIL;
    public static final /* synthetic */ d SOFTCLAY;
    private static final /* synthetic */ d[] $VALUES;
    private static /* synthetic */ String[] lIIIl;
    public static final /* synthetic */ d RUNE;
    public static final /* synthetic */ d COAL;
    public static final /* synthetic */ d SILVER;
    public static final /* synthetic */ d ADDY;
    private static /* synthetic */ int[] lIIlI;

    private d(String str, int i2) {
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    private static void lllIII() {
        lIIlI = new int[9];
        lIIlI[0] = ((((120 + 12) - 2) + 58) ^ (((38 + 143) - 19) + 10)) & (((107 ^ 8) ^ (180 ^ 199)) ^ (-" ".length()));
        lIIlI[1] = " ".length();
        lIIlI[2] = "  ".length();
        lIIlI[3] = "   ".length();
        lIIlI[4] = (130 ^ 157) ^ (18 ^ 9);
        lIIlI[5] = (54 ^ 48) ^ "   ".length();
        lIIlI[6] = 147 ^ 149;
        lIIlI[7] = 151 ^ 144;
        lIIlI[8] = (231 ^ 182) ^ (231 ^ 190);
    }

    private static String llIlIl(String llllllIIlllIIll, String llllllIIlllIIlI) {
        String llllllIIlllIIll2 = new String(Base64.getDecoder().decode(llllllIIlllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllIIlllIIII = llllllIIlllIIlI.toCharArray();
        int llllllIIllIllll = lIIlI[0];
        char[] charArray = llllllIIlllIIll2.toCharArray();
        int length = charArray.length;
        int i2 = lIIlI[0];
        while (lllIIl(i2, length)) {
            sb.append((char) (charArray[i2] ^ llllllIIlllIIII[llllllIIllIllll % llllllIIlllIIII.length]));
            "".length();
            llllllIIllIllll++;
            i2++;
            "".length();
            if ("  ".length() <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    private static String llIllI(String llllllIIlIllllI, String llllllIIlIlllIl) {
        try {
            SecretKeySpec llllllIIllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllIIlIlllIl.getBytes(StandardCharsets.UTF_8)), lIIlI[8]), "DES");
            Cipher llllllIIllIIIII = Cipher.getInstance("DES");
            llllllIIllIIIII.init(lIIlI[2], llllllIIllIIIIl);
            return new String(llllllIIllIIIII.doFinal(Base64.getDecoder().decode(llllllIIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllIIlIlllll) {
            llllllIIlIlllll.printStackTrace();
            return null;
        }
    }

    private static String llIIII(String llllllIlIIIIIIl, String llllllIlIIIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllIlIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllIlIIIIlIl = Cipher.getInstance("Blowfish");
            llllllIlIIIIlIl.init(lIIlI[2], secretKeySpec);
            return new String(llllllIlIIIIlIl.doFinal(Base64.getDecoder().decode(llllllIlIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllIlIIIIlII) {
            llllllIlIIIIlII.printStackTrace();
            return null;
        }
    }

    static {
        lllIII();
        llIlll();
        RUNE = new d(lIIIl[lIIlI[0]], lIIlI[0]);
        ADDY = new d(lIIIl[lIIlI[1]], lIIlI[1]);
        MITHRIL = new d(lIIIl[lIIlI[2]], lIIlI[2]);
        IRON = new d(lIIIl[lIIlI[3]], lIIlI[3]);
        COAL = new d(lIIIl[lIIlI[4]], lIIlI[4]);
        GOLD = new d(lIIIl[lIIlI[5]], lIIlI[5]);
        SOFTCLAY = new d(lIIIl[lIIlI[6]], lIIlI[6]);
        SILVER = new d(lIIIl[lIIlI[7]], lIIlI[7]);
        d[] dVarArr = new d[lIIlI[8]];
        dVarArr[lIIlI[0]] = RUNE;
        dVarArr[lIIlI[1]] = ADDY;
        dVarArr[lIIlI[2]] = MITHRIL;
        dVarArr[lIIlI[3]] = IRON;
        dVarArr[lIIlI[4]] = COAL;
        dVarArr[lIIlI[5]] = GOLD;
        dVarArr[lIIlI[6]] = SOFTCLAY;
        dVarArr[lIIlI[7]] = SILVER;
        $VALUES = dVarArr;
    }

    private static void llIlll() {
        lIIIl = new String[lIIlI[8]];
        lIIIl[lIIlI[0]] = llIIII("6IIHDVc7UG4=", "svnFz");
        lIIIl[lIIlI[1]] = llIlIl("FigiEA==", "WlfIQ");
        lIIIl[lIIlI[2]] = llIlIl("LyohIxUrLw==", "bcukG");
        lIIIl[lIIlI[3]] = llIllI("V3KsCxLK5M0=", "ATbMA");
        lIIIl[lIIlI[4]] = llIlIl("JhskJQ==", "eTeip");
        lIIIl[lIIlI[5]] = llIlIl("Kis+DA==", "mdrHn");
        lIIIl[lIIlI[6]] = llIlIl("MiAAGSwtLh8=", "aoFMo");
        lIIIl[lIIlI[7]] = llIIII("5LdbjxA+py8=", "OaJYk");
    }

    private static boolean lllIIl(int i2, int i3) {
        return i2 < i3;
    }
}
