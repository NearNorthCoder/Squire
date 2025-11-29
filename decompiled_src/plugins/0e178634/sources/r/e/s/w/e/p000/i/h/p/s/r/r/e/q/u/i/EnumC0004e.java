package r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.e  reason: invalid package and case insensitive filesystem */
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:r/e/s/w/e/-/i/h/p/s/r/r/e/q/u/i/e.class */
public final class EnumC0004e {
    public static final /* synthetic */ EnumC0004e FEROX_ENCLAVE;
    private final /* synthetic */ int regionId;
    public static final /* synthetic */ EnumC0004e VARROCK_WEST;
    private static /* synthetic */ int[] lIlIlllIlllIl;
    private final /* synthetic */ WorldPoint location;
    public static final /* synthetic */ EnumC0004e CASTLE_WARS;
    public static final /* synthetic */ EnumC0004e FALADOR_WEST;
    private static /* synthetic */ String[] lIlIlllIllIlI;
    public static final /* synthetic */ EnumC0004e EDGEVILLE;
    public static final /* synthetic */ EnumC0004e GRAND_EXCHANGE;
    private static final /* synthetic */ EnumC0004e[] $VALUES;

    private static boolean llIIIIlIlIlIlII(int i, int i2) {
        return i < i2;
    }

    private EnumC0004e(String str, int i, int i2, WorldPoint worldPoint) {
        this.regionId = i2;
        this.location = worldPoint;
    }

    static {
        llIIIIlIlIlIIll();
        llIIIIlIlIIllII();
        GRAND_EXCHANGE = new EnumC0004e(lIlIlllIllIlI[lIlIlllIlllIl[0]], lIlIlllIlllIl[0], lIlIlllIlllIl[1], new WorldPoint(lIlIlllIlllIl[2], lIlIlllIlllIl[3], lIlIlllIlllIl[0]));
        FEROX_ENCLAVE = new EnumC0004e(lIlIlllIllIlI[lIlIlllIlllIl[4]], lIlIlllIlllIl[4], lIlIlllIlllIl[5], new WorldPoint(lIlIlllIlllIl[6], lIlIlllIlllIl[7], lIlIlllIlllIl[0]));
        EDGEVILLE = new EnumC0004e(lIlIlllIllIlI[lIlIlllIlllIl[8]], lIlIlllIlllIl[8], lIlIlllIlllIl[9], new WorldPoint(lIlIlllIlllIl[10], lIlIlllIlllIl[11], lIlIlllIlllIl[0]));
        VARROCK_WEST = new EnumC0004e(lIlIlllIllIlI[lIlIlllIlllIl[12]], lIlIlllIlllIl[12], lIlIlllIlllIl[13], new WorldPoint(lIlIlllIlllIl[14], lIlIlllIlllIl[15], lIlIlllIlllIl[0]));
        FALADOR_WEST = new EnumC0004e(lIlIlllIllIlI[lIlIlllIlllIl[16]], lIlIlllIlllIl[16], lIlIlllIlllIl[17], new WorldPoint(lIlIlllIlllIl[18], lIlIlllIlllIl[19], lIlIlllIlllIl[0]));
        CASTLE_WARS = new EnumC0004e(lIlIlllIllIlI[lIlIlllIlllIl[20]], lIlIlllIlllIl[20], lIlIlllIlllIl[21], new WorldPoint(lIlIlllIlllIl[22], lIlIlllIlllIl[23], lIlIlllIlllIl[0]));
        EnumC0004e[] enumC0004eArr = new EnumC0004e[lIlIlllIlllIl[24]];
        enumC0004eArr[lIlIlllIlllIl[0]] = GRAND_EXCHANGE;
        enumC0004eArr[lIlIlllIlllIl[4]] = FEROX_ENCLAVE;
        enumC0004eArr[lIlIlllIlllIl[8]] = EDGEVILLE;
        enumC0004eArr[lIlIlllIlllIl[12]] = VARROCK_WEST;
        enumC0004eArr[lIlIlllIlllIl[16]] = FALADOR_WEST;
        enumC0004eArr[lIlIlllIlllIl[20]] = CASTLE_WARS;
        $VALUES = enumC0004eArr;
    }

    private static String llIIIIlIlIIIlll(String llllllllllllllIllIIlllllIIIlllII, String llllllllllllllIllIIlllllIIIllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlllllIIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlllllIIIllllI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlllllIIIllllI.init(lIlIlllIlllIl[8], secretKeySpec);
            return new String(llllllllllllllIllIIlllllIIIllllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlllllIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlllllIIIlllIl) {
            llllllllllllllIllIIlllllIIIlllIl.printStackTrace();
            return null;
        }
    }

    private static void llIIIIlIlIlIIll() {
        lIlIlllIlllIl = new int[25];
        lIlIlllIlllIl[0] = ((0 ^ 81) ^ (41 ^ 112)) & (((2 ^ 42) ^ (137 ^ 169)) ^ (-" ".length()));
        lIlIlllIlllIl[1] = (-((-305) & 16698)) & (-1537) & 30527;
        lIlIlllIlllIl[2] = (-((-8971) & 13227)) & (-24579) & 31999;
        lIlIlllIlllIl[3] = (-577) & 4063;
        lIlIlllIlllIl[4] = " ".length();
        lIlIlllIlllIl[5] = (-17477) & 29820;
        lIlIlllIlllIl[6] = (-((-2209) & 23526)) & (-129) & 24575;
        lIlIlllIlllIl[7] = (-((-4713) & 29433)) & (-65) & 28415;
        lIlIlllIlllIl[8] = "  ".length();
        lIlIlllIlllIl[9] = (-16522) & 28863;
        lIlIlllIlllIl[10] = (-((-3075) & 19659)) & (-4129) & 23805;
        lIlIlllIlllIl[11] = (-20546) & 24041;
        lIlIlllIlllIl[12] = "   ".length();
        lIlIlllIlllIl[13] = (-2243) & 14839;
        lIlIlllIlllIl[14] = (-((-3177) & 15851)) & (-517) & 16375;
        lIlIlllIlllIl[15] = (-((-3649) & 28366)) & (-3) & 28159;
        lIlIlllIlllIl[16] = 137 ^ 141;
        lIlIlllIlllIl[17] = (-((-18517) & 22998)) & (-16393) & 32701;
        lIlIlllIlllIl[18] = (-16497) & 19442;
        lIlIlllIlllIl[19] = (-((-7179) & 32479)) & (-1) & 28668;
        lIlIlllIlllIl[20] = (((157 + 12) - 24) + 17) ^ (((107 + 104) - 165) + 121);
        lIlIlllIlllIl[21] = (-16525) & 26300;
        lIlIlllIlllIl[22] = (-((-14631) & 32567)) & (-12385) & 32763;
        lIlIlllIlllIl[23] = (-((-25711) & 30703)) & (-16437) & 24511;
        lIlIlllIlllIl[24] = 136 ^ 142;
    }

    public WorldPoint m() {
        return this.location;
    }

    private static String llIIIIlIlIIlIll(String llllllllllllllIllIIlllllIIIIllII, String llllllllllllllIllIIlllllIIIIlIll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIlllllIIIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIIlllllIIIIlIIl = llllllllllllllIllIIlllllIIIIlIll.toCharArray();
        int llllllllllllllIllIIlllllIIIIlIII = lIlIlllIlllIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIlllIlllIl[0];
        while (llIIIIlIlIlIlII(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIllIIlllllIIIIlIIl[llllllllllllllIllIIlllllIIIIlIII % llllllllllllllIllIIlllllIIIIlIIl.length]));
            "".length();
            llllllllllllllIllIIlllllIIIIlIII++;
            i++;
            "".length();
            if ((40 ^ 44) == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static EnumC0004e[] values() {
        return (EnumC0004e[]) $VALUES.clone();
    }

    public int d() {
        return this.regionId;
    }

    private static void llIIIIlIlIIllII() {
        lIlIlllIllIlI = new String[lIlIlllIlllIl[24]];
        lIlIlllIllIlI[lIlIlllIlllIl[0]] = llIIIIlIlIIIlll("U9HmBOb8P1xQ6eQijJjMsA==", "kcbMM");
        lIlIlllIllIlI[lIlIlllIlllIl[4]] = llIIIIlIlIIIlll("anm9gXATSeN/7koomPNI+Q==", "MAetV");
        lIlIlllIllIlI[lIlIlllIlllIl[8]] = llIIIIlIlIIlIll("AjYTEBcOPhgQ", "GrTUA");
        lIlIlllIllIlI[lIlIlllIlllIl[12]] = llIIIIlIlIIlIll("DAMxGy0ZCTweJwkW", "ZBcIb");
        lIlIlllIllIlI[lIlIlllIlllIl[16]] = llIIIIlIlIIlIll("HDEEFAwVIhcCDQkk", "ZpHUH");
        lIlIlllIllIlI[lIlIlllIlllIl[20]] = llIIIIlIlIIIlll("N5YXq4kRK1p635jGOE+B0Q==", "eUgQe");
    }

    public static EnumC0004e valueOf(String str) {
        return (EnumC0004e) Enum.valueOf(EnumC0004e.class, str);
    }
}
