package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.d  reason: invalid package and case insensitive filesystem */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/d.class */
public final class EnumC0003d {
    private static final /* synthetic */ EnumC0003d[] $VALUES;
    public static final /* synthetic */ EnumC0003d FALADOR_WEST;
    private final /* synthetic */ WorldPoint location;
    private static /* synthetic */ String[] lIllIIlIlIIl;
    public static final /* synthetic */ EnumC0003d CASTLE_WARS;
    private static /* synthetic */ int[] lIllIIlIlIlI;
    public static final /* synthetic */ EnumC0003d GRAND_EXCHANGE;
    private final /* synthetic */ int regionId;
    public static final /* synthetic */ EnumC0003d VARROCK_WEST;

    private static void lllIIlIlIllIlI() {
        lIllIIlIlIIl = new String[lIllIIlIlIlI[16]];
        lIllIIlIlIIl[lIllIIlIlIlI[0]] = lllIIlIlIllIIl("FH4Myl563jwwjEYvCz85/A==", "hKORq");
        lIllIIlIlIIl[lIllIIlIlIlI[4]] = lllIIlIlIllIIl("MLWx9XHKxd1JXegXO5DaVA==", "cnGPA");
        lIllIIlIlIIl[lIllIIlIlIlI[8]] = lllIIlIlIllIIl("eqwZh5gFDG81w6Ei3vDQ4w==", "FOpqK");
        lIllIIlIlIIl[lIllIIlIlIlI[12]] = lllIIlIlIllIIl("ePlswORiEtgkpzpvrpS1zg==", "pviKK");
    }

    private static void lllIIlIlIllIll() {
        lIllIIlIlIlI = new int[18];
        lIllIIlIlIlI[0] = (166 ^ 199) & ((38 ^ 71) ^ (-1));
        lIllIIlIlIlI[1] = (-((-881) & 18297)) & (-66) & 30079;
        lIllIIlIlIlI[2] = (-((-4103) & 4999)) & (-8195) & 12255;
        lIllIIlIlIlI[3] = (-((-20891) & 29659)) & (-33) & 12287;
        lIllIIlIlIlI[4] = " ".length();
        lIllIIlIlIlI[5] = (-((-13125) & 32719)) & (-65) & 32255;
        lIllIIlIlIlI[6] = (-25355) & 28539;
        lIllIIlIlIlI[7] = (-((-1515) & 30202)) & (-641) & 32767;
        lIllIIlIlIlI[8] = "  ".length();
        lIllIIlIlIlI[9] = (-4554) & 16381;
        lIllIIlIlIlI[10] = (-8197) & 11142;
        lIllIIlIlIlI[11] = (-21188) & 24555;
        lIllIIlIlIlI[12] = "   ".length();
        lIllIIlIlIlI[13] = (-16641) & 26416;
        lIllIIlIlIlI[14] = (-17521) & 19963;
        lIllIIlIlIlI[15] = (-13205) & 16287;
        lIllIIlIlIlI[16] = 51 ^ 55;
        lIllIIlIlIlI[17] = 145 ^ 153;
    }

    private EnumC0003d(String str, int i, int i2, WorldPoint worldPoint) {
        this.regionId = i2;
        this.location = worldPoint;
    }

    public int G() {
        return this.regionId;
    }

    public WorldPoint H() {
        return this.location;
    }

    public static EnumC0003d[] values() {
        return (EnumC0003d[]) $VALUES.clone();
    }

    private static String lllIIlIlIllIIl(String lllllllllllllllIllIIIIlIIIlIlIll, String lllllllllllllllIllIIIIlIIIlIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIllIIIIlIIIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIIlIIIlIlIlI.getBytes(StandardCharsets.UTF_8)), lIllIIlIlIlI[17]), "DES");
            Cipher lllllllllllllllIllIIIIlIIIlIllIl = Cipher.getInstance("DES");
            lllllllllllllllIllIIIIlIIIlIllIl.init(lIllIIlIlIlI[8], lllllllllllllllIllIIIIlIIIlIlllI);
            return new String(lllllllllllllllIllIIIIlIIIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIIlIIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIIIlIIIlIllII) {
            lllllllllllllllIllIIIIlIIIlIllII.printStackTrace();
            return null;
        }
    }

    static {
        lllIIlIlIllIll();
        lllIIlIlIllIlI();
        GRAND_EXCHANGE = new EnumC0003d(lIllIIlIlIIl[lIllIIlIlIlI[0]], lIllIIlIlIlI[0], lIllIIlIlIlI[1], new WorldPoint(lIllIIlIlIlI[2], lIllIIlIlIlI[3], lIllIIlIlIlI[0]));
        VARROCK_WEST = new EnumC0003d(lIllIIlIlIIl[lIllIIlIlIlI[4]], lIllIIlIlIlI[4], lIllIIlIlIlI[5], new WorldPoint(lIllIIlIlIlI[6], lIllIIlIlIlI[7], lIllIIlIlIlI[0]));
        FALADOR_WEST = new EnumC0003d(lIllIIlIlIIl[lIllIIlIlIlI[8]], lIllIIlIlIlI[8], lIllIIlIlIlI[9], new WorldPoint(lIllIIlIlIlI[10], lIllIIlIlIlI[11], lIllIIlIlIlI[0]));
        CASTLE_WARS = new EnumC0003d(lIllIIlIlIIl[lIllIIlIlIlI[12]], lIllIIlIlIlI[12], lIllIIlIlIlI[13], new WorldPoint(lIllIIlIlIlI[14], lIllIIlIlIlI[15], lIllIIlIlIlI[0]));
        EnumC0003d[] enumC0003dArr = new EnumC0003d[lIllIIlIlIlI[16]];
        enumC0003dArr[lIllIIlIlIlI[0]] = GRAND_EXCHANGE;
        enumC0003dArr[lIllIIlIlIlI[4]] = VARROCK_WEST;
        enumC0003dArr[lIllIIlIlIlI[8]] = FALADOR_WEST;
        enumC0003dArr[lIllIIlIlIlI[12]] = CASTLE_WARS;
        $VALUES = enumC0003dArr;
    }

    public static EnumC0003d valueOf(String str) {
        return (EnumC0003d) Enum.valueOf(EnumC0003d.class, str);
    }
}
