package m.e.i.q.u.r.p000.n.s.e.r.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.g  reason: invalid package and case insensitive filesystem */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/g.class */
public final class EnumC0006g {
    private final /* synthetic */ WorldPoint location;
    public static final /* synthetic */ EnumC0006g EAST;
    private static /* synthetic */ String[] lllllIIIIllI;
    public static final /* synthetic */ EnumC0006g NORTH;
    private final /* synthetic */ WorldPoint m2;
    private static /* synthetic */ int[] lllllIIIIlll;
    private final /* synthetic */ WorldPoint m1;
    private static final /* synthetic */ EnumC0006g[] $VALUES;
    public static final /* synthetic */ EnumC0006g SOUTH_2;
    public static final /* synthetic */ EnumC0006g SOUTH_1;

    static {
        lIIlIIlIIlIlIlI();
        lIIlIIlIIlIlIIl();
        NORTH = new EnumC0006g(lllllIIIIllI[lllllIIIIlll[2]], lllllIIIIlll[2], new WorldPoint(lllllIIIIlll[3], lllllIIIIlll[4], lllllIIIIlll[5]), new WorldPoint(lllllIIIIlll[3], lllllIIIIlll[6], lllllIIIIlll[5]), new WorldPoint(lllllIIIIlll[7], lllllIIIIlll[6], lllllIIIIlll[5]));
        EAST = new EnumC0006g(lllllIIIIllI[lllllIIIIlll[1]], lllllIIIIlll[1], new WorldPoint(lllllIIIIlll[8], lllllIIIIlll[9], lllllIIIIlll[5]), new WorldPoint(lllllIIIIlll[10], lllllIIIIlll[11], lllllIIIIlll[5]), new WorldPoint(lllllIIIIlll[10], lllllIIIIlll[12], lllllIIIIlll[5]));
        SOUTH_1 = new EnumC0006g(lllllIIIIllI[lllllIIIIlll[5]], lllllIIIIlll[5], new WorldPoint(lllllIIIIlll[13], lllllIIIIlll[14], lllllIIIIlll[5]), new WorldPoint(lllllIIIIlll[13], lllllIIIIlll[15], lllllIIIIlll[5]), new WorldPoint(lllllIIIIlll[16], lllllIIIIlll[15], lllllIIIIlll[5]));
        SOUTH_2 = new EnumC0006g(lllllIIIIllI[lllllIIIIlll[17]], lllllIIIIlll[17], new WorldPoint(lllllIIIIlll[13], lllllIIIIlll[14], lllllIIIIlll[5]), new WorldPoint(lllllIIIIlll[3], lllllIIIIlll[14], lllllIIIIlll[5]), new WorldPoint(lllllIIIIlll[3], lllllIIIIlll[18], lllllIIIIlll[5]));
        EnumC0006g[] enumC0006gArr = new EnumC0006g[lllllIIIIlll[19]];
        enumC0006gArr[lllllIIIIlll[2]] = NORTH;
        enumC0006gArr[lllllIIIIlll[1]] = EAST;
        enumC0006gArr[lllllIIIIlll[5]] = SOUTH_1;
        enumC0006gArr[lllllIIIIlll[17]] = SOUTH_2;
        $VALUES = enumC0006gArr;
    }

    public static EnumC0006g valueOf(String str) {
        return (EnumC0006g) Enum.valueOf(EnumC0006g.class, str);
    }

    public static TileObject h() {
        int i = lllllIIIIlll[0];
        int[] iArr = new int[lllllIIIIlll[1]];
        iArr[lllllIIIIlll[2]] = lllllIIIIlll[0];
        return TileObjects.getNearest(iArr);
    }

    public WorldPoint j() {
        return this.m1;
    }

    public WorldPoint k() {
        return this.m2;
    }

    private static void lIIlIIlIIlIlIlI() {
        lllllIIIIlll = new int[21];
        lllllIIIIlll[0] = (-25857) & 64951;
        lllllIIIIlll[1] = " ".length();
        lllllIIIIlll[2] = ((((91 + 115) - 135) + 101) ^ (((76 + 176) - 219) + 148)) & (((((113 + 61) - 152) + 127) ^ (((104 + 96) - 151) + 91)) ^ (-" ".length()));
        lllllIIIIlll[3] = (-((-2130) & 14679)) & (-16417) & 32639;
        lllllIIIIlll[4] = (-((-10309) & 27085)) & (-6209) & 32749;
        lllllIIIIlll[5] = "  ".length();
        lllllIIIIlll[6] = (-(((138 + 52) - 112) + 62)) & (-16385) & 26287;
        lllllIIIIlll[7] = (-12709) & 16383;
        lllllIIIIlll[8] = (-((-21619) & 29939)) & (-16401) & 28407;
        lllllIIIIlll[9] = (-481) & 10235;
        lllllIIIIlll[10] = (-((-1654) & 6143)) & (-24577) & 32751;
        lllllIIIIlll[11] = (-18563) & 28319;
        lllllIIIIlll[12] = (-20772) & 30527;
        lllllIIIIlll[13] = (-((-5) & 20781)) & (-8193) & 32639;
        lllllIIIIlll[14] = (-2249) & 11998;
        lllllIIIIlll[15] = (-16487) & 26239;
        lllllIIIIlll[16] = (-8359) & 12030;
        lllllIIIIlll[17] = "   ".length();
        lllllIIIIlll[18] = (-2409) & 12159;
        lllllIIIIlll[19] = (97 ^ 49) ^ (13 ^ 89);
        lllllIIIIlll[20] = (58 ^ 40) ^ (113 ^ 107);
    }

    private EnumC0006g(String str, int i, WorldPoint worldPoint, WorldPoint worldPoint2, WorldPoint worldPoint3) {
        this.location = worldPoint;
        this.m1 = worldPoint2;
        this.m2 = worldPoint3;
    }

    private static String lIIlIIlIIlIIlll(String lllllllllllllllIIlIIllIlIlIIIlIl, String lllllllllllllllIIlIIllIlIlIIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIlIlIIIlII.getBytes(StandardCharsets.UTF_8)), lllllIIIIlll[20]), "DES");
            Cipher lllllllllllllllIIlIIllIlIlIIIlll = Cipher.getInstance("DES");
            lllllllllllllllIIlIIllIlIlIIIlll.init(lllllIIIIlll[5], secretKeySpec);
            return new String(lllllllllllllllIIlIIllIlIlIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIlIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIllIlIlIIIllI) {
            lllllllllllllllIIlIIllIlIlIIIllI.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIlIIlIlIII(String lllllllllllllllIIlIIllIlIlIlIIlI, String lllllllllllllllIIlIIllIlIlIIllll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIlIlIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIlIlIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIllIlIlIlIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIllIlIlIlIlII.init(lllllIIIIlll[5], lllllllllllllllIIlIIllIlIlIlIlIl);
            return new String(lllllllllllllllIIlIIllIlIlIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIlIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIllIlIlIlIIll) {
            lllllllllllllllIIlIIllIlIlIlIIll.printStackTrace();
            return null;
        }
    }

    public WorldPoint i() {
        return this.location;
    }

    private static void lIIlIIlIIlIlIIl() {
        lllllIIIIllI = new String[lllllIIIIlll[19]];
        lllllIIIIllI[lllllIIIIlll[2]] = lIIlIIlIIlIIlll("5eAhYdUZwWQ=", "RfcnV");
        lllllIIIIllI[lllllIIIIlll[1]] = lIIlIIlIIlIlIII("RNCizfQc5HA=", "HVEVN");
        lllllIIIIllI[lllllIIIIlll[5]] = lIIlIIlIIlIlIII("V7JUBEgrzmA=", "OfXUL");
        lllllIIIIllI[lllllIIIIlll[17]] = lIIlIIlIIlIlIII("Is73Fl+b9vE=", "khykW");
    }

    public static EnumC0006g[] values() {
        return (EnumC0006g[]) $VALUES.clone();
    }
}
