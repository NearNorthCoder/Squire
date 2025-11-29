package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.f  reason: invalid package and case insensitive filesystem */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/f.class */
public final class EnumC0005f {
    public static final /* synthetic */ EnumC0005f VARROCK_WEST;
    private static final /* synthetic */ EnumC0005f[] $VALUES;
    private static /* synthetic */ int[] lIlIlIIlIIlll;
    public static final /* synthetic */ EnumC0005f GRAND_EXCHANGE;
    private final /* synthetic */ int regionId;
    public static final /* synthetic */ EnumC0005f CASTLE_WARS;
    private final /* synthetic */ WorldPoint location;
    private static /* synthetic */ String[] lIlIlIIlIIllI;
    public static final /* synthetic */ EnumC0005f FALADOR_WEST;

    private static void lIllllIllllIIIl() {
        lIlIlIIlIIlll = new int[17];
        lIlIlIIlIIlll[0] = ((172 ^ 153) ^ (103 ^ 90)) & (((111 ^ 12) ^ (57 ^ 82)) ^ (-" ".length()));
        lIlIlIIlIIlll[1] = (-1225) & 13822;
        lIlIlIIlIIlll[2] = (-((-7205) & 32421)) & (-3) & 28383;
        lIlIlIIlIIlll[3] = (-25185) & 28671;
        lIlIlIIlIIlll[4] = " ".length();
        lIlIlIIlIIlll[5] = (-19649) & 32245;
        lIlIlIIlIIlll[6] = (-((-3335) & 27919)) & (-4737) & 32505;
        lIlIlIIlIIlll[7] = (-(47 ^ 40)) & (-21122) & 24567;
        lIlIlIIlIIlll[8] = "  ".length();
        lIlIlIIlIIlll[9] = (-((-12849) & 29691)) & (-1) & 28670;
        lIlIlIIlIIlll[10] = (-4222) & 7167;
        lIlIlIIlIIlll[11] = (-599) & 3966;
        lIlIlIIlIIlll[12] = "   ".length();
        lIlIlIIlIIlll[13] = (-20556) & 30331;
        lIlIlIIlIIlll[14] = (-5157) & 7599;
        lIlIlIIlIIlll[15] = (-((-3107) & 7911)) & (-1) & 7887;
        lIlIlIIlIIlll[16] = (29 ^ 3) ^ (60 ^ 38);
    }

    private static boolean lIllllIllllIIlI(int i, int i2) {
        return i < i2;
    }

    private static void lIllllIllllIIII() {
        lIlIlIIlIIllI = new String[lIlIlIIlIIlll[16]];
        lIlIlIIlIIllI[lIlIlIIlIIlll[0]] = lIllllIlllIlllI("xiJ/AN9RzMv+p8tMGFstcA==", "xVUPz");
        lIlIlIIlIIllI[lIlIlIIlIIlll[4]] = lIllllIlllIllll("FzEZBgICOxQDCBIk", "ApKTM");
        lIlIlIIlIIllI[lIlIlIIlIIlll[8]] = lIllllIlllIllll("DSQnMxIENzQlExgx", "KekrV");
        lIlIlIIlIIllI[lIlIlIIlIIlll[12]] = lIllllIlllIllll("BQcHEBQDGQMFChU=", "FFTDX");
    }

    private static String lIllllIlllIllll(String llllllllllllllIllIlIllllIllIlllI, String llllllllllllllIllIlIllllIllIllIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIlIllllIllIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIlIllllIllIllIl.toCharArray();
        int llllllllllllllIllIlIllllIllIlIlI = lIlIlIIlIIlll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIlIIlIIlll[0];
        while (lIllllIllllIIlI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllIllIlIllllIllIlIlI % charArray.length]));
            "".length();
            llllllllllllllIllIlIllllIllIlIlI++;
            i++;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIllllIllllIIIl();
        lIllllIllllIIII();
        GRAND_EXCHANGE = new EnumC0005f(lIlIlIIlIIllI[lIlIlIIlIIlll[0]], lIlIlIIlIIlll[0], lIlIlIIlIIlll[1], new WorldPoint(lIlIlIIlIIlll[2], lIlIlIIlIIlll[3], lIlIlIIlIIlll[0]));
        VARROCK_WEST = new EnumC0005f(lIlIlIIlIIllI[lIlIlIIlIIlll[4]], lIlIlIIlIIlll[4], lIlIlIIlIIlll[5], new WorldPoint(lIlIlIIlIIlll[6], lIlIlIIlIIlll[7], lIlIlIIlIIlll[0]));
        FALADOR_WEST = new EnumC0005f(lIlIlIIlIIllI[lIlIlIIlIIlll[8]], lIlIlIIlIIlll[8], lIlIlIIlIIlll[9], new WorldPoint(lIlIlIIlIIlll[10], lIlIlIIlIIlll[11], lIlIlIIlIIlll[0]));
        CASTLE_WARS = new EnumC0005f(lIlIlIIlIIllI[lIlIlIIlIIlll[12]], lIlIlIIlIIlll[12], lIlIlIIlIIlll[13], new WorldPoint(lIlIlIIlIIlll[14], lIlIlIIlIIlll[15], lIlIlIIlIIlll[0]));
        EnumC0005f[] enumC0005fArr = new EnumC0005f[lIlIlIIlIIlll[16]];
        enumC0005fArr[lIlIlIIlIIlll[0]] = GRAND_EXCHANGE;
        enumC0005fArr[lIlIlIIlIIlll[4]] = VARROCK_WEST;
        enumC0005fArr[lIlIlIIlIIlll[8]] = FALADOR_WEST;
        enumC0005fArr[lIlIlIIlIIlll[12]] = CASTLE_WARS;
        $VALUES = enumC0005fArr;
    }

    public static EnumC0005f[] values() {
        return (EnumC0005f[]) $VALUES.clone();
    }

    public static EnumC0005f valueOf(String str) {
        return (EnumC0005f) Enum.valueOf(EnumC0005f.class, str);
    }

    public WorldPoint F() {
        return this.location;
    }

    private EnumC0005f(String str, int i, int i2, WorldPoint worldPoint) {
        this.regionId = i2;
        this.location = worldPoint;
    }

    private static String lIllllIlllIlllI(String llllllllllllllIllIlIllllIllllllI, String llllllllllllllIllIlIllllIlllllIl) {
        try {
            SecretKeySpec llllllllllllllIllIlIlllllIIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIllllIlllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIIlIIlll[8], llllllllllllllIllIlIlllllIIIIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIllllIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIllllIlllllll) {
            llllllllllllllIllIlIllllIlllllll.printStackTrace();
            return null;
        }
    }

    public int E() {
        return this.regionId;
    }
}
