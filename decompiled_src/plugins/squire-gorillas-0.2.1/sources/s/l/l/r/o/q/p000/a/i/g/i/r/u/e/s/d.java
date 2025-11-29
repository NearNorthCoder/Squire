package s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d  reason: invalid package */
/* loaded from: squire-gorillas-0.2.1.jar:s/l/l/r/o/q/-/a/i/g/i/r/u/e/s/d.class */
public final class d {
    private static /* synthetic */ String[] llIIlIllIlIl;
    public static final /* synthetic */ d MAGIC;
    public static final /* synthetic */ d RANGED;
    private static final /* synthetic */ d[] $VALUES;
    private static /* synthetic */ int[] llIIlIllIllI;
    public static final /* synthetic */ d MELEE;
    public static final /* synthetic */ d BOULDER;

    private static boolean lllllIlllIIIII(int i, int i2) {
        return i < i2;
    }

    static {
        lllllIllIlllll();
        lllllIllIllllI();
        MAGIC = new d(llIIlIllIlIl[llIIlIllIllI[0]], llIIlIllIllI[0]);
        RANGED = new d(llIIlIllIlIl[llIIlIllIllI[1]], llIIlIllIllI[1]);
        MELEE = new d(llIIlIllIlIl[llIIlIllIllI[2]], llIIlIllIllI[2]);
        BOULDER = new d(llIIlIllIlIl[llIIlIllIllI[3]], llIIlIllIllI[3]);
        d[] dVarArr = new d[llIIlIllIllI[4]];
        dVarArr[llIIlIllIllI[0]] = MAGIC;
        dVarArr[llIIlIllIllI[1]] = RANGED;
        dVarArr[llIIlIllIllI[2]] = MELEE;
        dVarArr[llIIlIllIllI[3]] = BOULDER;
        $VALUES = dVarArr;
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    private static String lllllIllIlllII(String lllllllllllllllIlIIlllIllIIIlIII, String lllllllllllllllIlIIlllIllIIIIlll) {
        try {
            SecretKeySpec lllllllllllllllIlIIlllIllIIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlllIllIIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlllIllIIIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlllIllIIIlIlI.init(llIIlIllIllI[2], lllllllllllllllIlIIlllIllIIIlIll);
            return new String(lllllllllllllllIlIIlllIllIIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlllIllIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlllIllIIIlIIl) {
            lllllllllllllllIlIIlllIllIIIlIIl.printStackTrace();
            return null;
        }
    }

    private static String lllllIllIlllIl(String lllllllllllllllIlIIlllIllIlIllIl, String lllllllllllllllIlIIlllIllIlIllII) {
        try {
            SecretKeySpec lllllllllllllllIlIIlllIllIllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlllIllIlIllII.getBytes(StandardCharsets.UTF_8)), llIIlIllIllI[5]), "DES");
            Cipher lllllllllllllllIlIIlllIllIlIllll = Cipher.getInstance("DES");
            lllllllllllllllIlIIlllIllIlIllll.init(llIIlIllIllI[2], lllllllllllllllIlIIlllIllIllIIII);
            return new String(lllllllllllllllIlIIlllIllIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlllIllIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlllIllIlIlllI) {
            lllllllllllllllIlIIlllIllIlIlllI.printStackTrace();
            return null;
        }
    }

    private d(String str, int i) {
    }

    private static void lllllIllIlllll() {
        llIIlIllIllI = new int[6];
        llIIlIllIllI[0] = ((((181 + 200) - 196) + 41) ^ (((18 + 31) - (-26)) + 85)) & (((136 ^ 158) ^ (242 ^ 166)) ^ (-" ".length()));
        llIIlIllIllI[1] = " ".length();
        llIIlIllIllI[2] = "  ".length();
        llIIlIllIllI[3] = "   ".length();
        llIIlIllIllI[4] = 168 ^ 172;
        llIIlIllIllI[5] = 107 ^ 99;
    }

    private static void lllllIllIllllI() {
        llIIlIllIlIl = new String[llIIlIllIllI[4]];
        llIIlIllIlIl[llIIlIllIllI[0]] = lllllIllIllIll("GQkMCCs=", "THKAh");
        llIIlIllIlIl[llIIlIllIllI[1]] = lllllIllIlllII("rqRSXFJb9TE=", "rdNsu");
        llIIlIllIlIl[llIIlIllIllI[2]] = lllllIllIlllIl("s3so0nxeUFY=", "lmZfC");
        llIIlIllIlIl[llIIlIllIllI[3]] = lllllIllIlllIl("UYDduRrguiQ=", "LntjS");
    }

    private static String lllllIllIllIll(String lllllllllllllllIlIIlllIllIIlllIl, String lllllllllllllllIlIIlllIllIIlllII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlllIllIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlllIllIIllIll = new StringBuilder();
        char[] lllllllllllllllIlIIlllIllIIllIlI = lllllllllllllllIlIIlllIllIIlllII.toCharArray();
        int lllllllllllllllIlIIlllIllIIllIIl = llIIlIllIllI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIlIllIllI[0];
        while (lllllIlllIIIII(i, length)) {
            lllllllllllllllIlIIlllIllIIllIll.append((char) (charArray[i] ^ lllllllllllllllIlIIlllIllIIllIlI[lllllllllllllllIlIIlllIllIIllIIl % lllllllllllllllIlIIlllIllIIllIlI.length]));
            "".length();
            lllllllllllllllIlIIlllIllIIllIIl++;
            i++;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIlllIllIIllIll);
    }
}
