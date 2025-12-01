package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.E  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/E.class */
public final class E {
    private final /* synthetic */ WorldPoint location;
    private final /* synthetic */ String name;
    public static final /* synthetic */ E MEADOW_NORTH;
    private static /* synthetic */ String[] llIIIlIllllI;
    private static final /* synthetic */ E[] $VALUES;
    public static final /* synthetic */ E VALLEY_NORTH;
    private final /* synthetic */ int varp;
    public static final /* synthetic */ E MEADOW_SOUTH;
    private static /* synthetic */ int[] llIIIlIlllll;
    public static final /* synthetic */ E VALLEY_SOUTH;

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    private static String llllIlIllIIIII(String lllllllllllllllIlIlIIlIIllllllII, String lllllllllllllllIlIlIIlIIlllllIll) {
        String lllllllllllllllIlIlIIlIIllllllII2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIIllllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIlIIlIIlllllIIl = lllllllllllllllIlIlIIlIIlllllIll.toCharArray();
        int lllllllllllllllIlIlIIlIIlllllIII = llIIIlIlllll[0];
        char[] charArray = lllllllllllllllIlIlIIlIIllllllII2.toCharArray();
        int length = charArray.length;
        int i = llIIIlIlllll[0];
        while (llllIlIllIIlIl(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIlIlIIlIIlllllIIl[lllllllllllllllIlIlIIlIIlllllIII % lllllllllllllllIlIlIIlIIlllllIIl.length]));
            "".length();
            lllllllllllllllIlIlIIlIIlllllIII++;
            i++;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String llllIlIllIIIlI(String lllllllllllllllIlIlIIlIlIIIllIIl, String lllllllllllllllIlIlIIlIlIIIllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlIlIIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIlIlllll[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIlIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIlIlIIIllIlI) {
            lllllllllllllllIlIlIIlIlIIIllIlI.printStackTrace();
            return null;
        }
    }

    public static E[] values() {
        return (E[]) $VALUES.clone();
    }

    private E(String str, int i, String str2, int i2, WorldPoint worldPoint) {
        this.name = str2;
        this.varp = i2;
        this.location = worldPoint;
    }

    private static String llllIlIllIIIIl(String lllllllllllllllIlIlIIlIlIIIIllII, String lllllllllllllllIlIlIIlIlIIIIlIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlIlIIIIlIll.getBytes(StandardCharsets.UTF_8)), llIIIlIlllll[20]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIlIlllll[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIlIIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIlIlIIIIllIl) {
            lllllllllllllllIlIlIIlIlIIIIllIl.printStackTrace();
            return null;
        }
    }

    private static void llllIlIllIIlII() {
        llIIIlIlllll = new int[21];
        llIIIlIlllll[0] = ((27 ^ 119) ^ (46 ^ 106)) & (((22 ^ 41) ^ (96 ^ 119)) ^ (-" ".length()));
        llIIIlIlllll[1] = " ".length();
        llIIIlIlllll[2] = (-((-18) & 403)) & (-20481) & 22491;
        llIIIlIlllll[3] = (-3) & 3679;
        llIIIlIlllll[4] = (-((-9666) & 30167)) & (-8321) & 32703;
        llIIIlIlllll[5] = "  ".length();
        llIIIlIlllll[6] = "   ".length();
        llIIIlIlllll[7] = (-((-4101) & 30885)) & (-257) & 28667;
        llIIIlIlllll[8] = (-28961) & 32639;
        llIIIlIlllll[9] = (-((-3347) & 23827)) & (-8209) & 32503;
        llIIIlIlllll[10] = (((10 + 63) - (-1)) + 106) ^ (((156 + 143) - 268) + 145);
        llIIIlIlllll[11] = (89 ^ 47) ^ (5 ^ 118);
        llIIIlIlllll[12] = (-24706) & 26333;
        llIIIlIlllll[13] = (-20807) & 24574;
        llIIIlIlllll[14] = (-((-17795) & 30095)) & (-16385) & 32445;
        llIIIlIlllll[15] = 151 ^ 145;
        llIIIlIlllll[16] = (21 ^ 114) ^ (2 ^ 98);
        llIIIlIlllll[17] = (-((-1315) & 29987)) & (-2081) & 32381;
        llIIIlIlllll[18] = (-((-16451) & 16715)) & (-5) & 4031;
        llIIIlIlllll[19] = (-16641) & 20395;
        llIIIlIlllll[20] = (57 ^ 19) ^ (11 ^ 41);
    }

    public int ax() {
        return this.varp;
    }

    static {
        llllIlIllIIlII();
        llllIlIllIIIll();
        MEADOW_NORTH = new E(llIIIlIllllI[llIIIlIlllll[0]], llIIIlIlllll[0], llIIIlIllllI[llIIIlIlllll[1]], llIIIlIlllll[2], new WorldPoint(llIIIlIlllll[3], llIIIlIlllll[4], llIIIlIlllll[0]));
        MEADOW_SOUTH = new E(llIIIlIllllI[llIIIlIlllll[5]], llIIIlIlllll[1], llIIIlIllllI[llIIIlIlllll[6]], llIIIlIlllll[7], new WorldPoint(llIIIlIlllll[8], llIIIlIlllll[9], llIIIlIlllll[0]));
        VALLEY_NORTH = new E(llIIIlIllllI[llIIIlIlllll[10]], llIIIlIlllll[5], llIIIlIllllI[llIIIlIlllll[11]], llIIIlIlllll[12], new WorldPoint(llIIIlIlllll[13], llIIIlIlllll[14], llIIIlIlllll[0]));
        VALLEY_SOUTH = new E(llIIIlIllllI[llIIIlIlllll[15]], llIIIlIlllll[6], llIIIlIllllI[llIIIlIlllll[16]], llIIIlIlllll[17], new WorldPoint(llIIIlIlllll[18], llIIIlIlllll[19], llIIIlIlllll[0]));
        E[] eArr = new E[llIIIlIlllll[10]];
        eArr[llIIIlIlllll[0]] = MEADOW_NORTH;
        eArr[llIIIlIlllll[1]] = MEADOW_SOUTH;
        eArr[llIIIlIlllll[5]] = VALLEY_NORTH;
        eArr[llIIIlIlllll[6]] = VALLEY_SOUTH;
        $VALUES = eArr;
    }

    public String ac() {
        return this.name;
    }

    public WorldPoint az() {
        return this.location;
    }

    private static boolean llllIlIllIIlIl(int i, int i2) {
        return i < i2;
    }

    private static void llllIlIllIIIll() {
        llIIIlIllllI = new String[llIIIlIlllll[20]];
        llIIIlIllllI[llIIIlIlllll[0]] = llllIlIllIIIII("ACwREQQaNh4aGRkh", "MiPUK");
        llIIIlIllllI[llIIIlIlllll[1]] = llllIlIllIIIII("DCURIyQuPw9rGyQxBiQhYXgsJCQ1OEs=", "APbKV");
        llIIIlIllllI[llIIIlIlllll[5]] = llllIlIllIIIII("BwEzLwodGyEkEB4M", "JDrkE");
        llIIIlIllllI[llIIIlIlllll[6]] = llllIlIllIIIII("KwQlOT0JHjtxAgMQMj44RlkFPjoSGX8=", "fqVQO");
        llIIIlIllllI[llIIIlIlllll[10]] = llllIlIllIIIIl("y2CU7VmSYCrSavdzyuz8lw==", "gOcPy");
        llIIIlIllllI[llIIIlIlllll[11]] = llllIlIllIIIIl("c+UYGqBVn79N8lqFitCkERoZHSWBxLYDrJwqM7V+t84=", "OluuG");
        llIIIlIllllI[llIIIlIlllll[15]] = llllIlIllIIIIl("iYQEzAImBFlDVoRUMYHWuQ==", "neLUL");
        llIIIlIllllI[llIIIlIlllll[16]] = llllIlIllIIIlI("V6ULSo0MDjBHM/0vwL9ntlMb8SKs4MoteHMbYhDWUgY=", "bBLho");
    }
}
