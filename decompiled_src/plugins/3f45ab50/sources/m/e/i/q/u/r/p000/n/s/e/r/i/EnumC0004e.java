package m.e.i.q.u.r.p000.n.s.e.r.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.e  reason: invalid package and case insensitive filesystem */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/e.class */
public final class EnumC0004e {
    private final /* synthetic */ WorldPoint[] rocks;
    private final /* synthetic */ Point standing;
    public static final /* synthetic */ EnumC0004e WEST_FOUR;
    private static /* synthetic */ String[] llllllIIIIlI;
    private static /* synthetic */ int[] llllllIIIIll;
    public static final /* synthetic */ EnumC0004e WEST_TWO;
    private static final /* synthetic */ EnumC0004e[] $VALUES;

    private static boolean lIIlIlIIIIllIll(int i, int i2) {
        return i < i2;
    }

    static {
        lIIlIlIIIIllIlI();
        lIIlIlIIIIllIIl();
        String str = llllllIIIIlI[llllllIIIIll[0]];
        int i = llllllIIIIll[0];
        Point point = new Point(llllllIIIIll[2], llllllIIIIll[3]);
        WorldPoint[] worldPointArr = new WorldPoint[llllllIIIIll[4]];
        worldPointArr[llllllIIIIll[0]] = new WorldPoint(llllllIIIIll[5], llllllIIIIll[6], llllllIIIIll[0]);
        worldPointArr[llllllIIIIll[1]] = new WorldPoint(llllllIIIIll[7], llllllIIIIll[6], llllllIIIIll[0]);
        worldPointArr[llllllIIIIll[8]] = new WorldPoint(llllllIIIIll[9], llllllIIIIll[3], llllllIIIIll[0]);
        worldPointArr[llllllIIIIll[10]] = new WorldPoint(llllllIIIIll[9], llllllIIIIll[11], llllllIIIIll[0]);
        WEST_FOUR = new EnumC0004e(str, i, point, worldPointArr);
        String str2 = llllllIIIIlI[llllllIIIIll[1]];
        int i2 = llllllIIIIll[1];
        Point point2 = new Point(llllllIIIIll[12], llllllIIIIll[3]);
        WorldPoint[] worldPointArr2 = new WorldPoint[llllllIIIIll[8]];
        worldPointArr2[llllllIIIIll[0]] = new WorldPoint(llllllIIIIll[9], llllllIIIIll[3], llllllIIIIll[0]);
        worldPointArr2[llllllIIIIll[1]] = new WorldPoint(llllllIIIIll[2], llllllIIIIll[11], llllllIIIIll[0]);
        WEST_TWO = new EnumC0004e(str2, i2, point2, worldPointArr2);
        EnumC0004e[] enumC0004eArr = new EnumC0004e[llllllIIIIll[8]];
        enumC0004eArr[llllllIIIIll[0]] = WEST_FOUR;
        enumC0004eArr[llllllIIIIll[1]] = WEST_TWO;
        $VALUES = enumC0004eArr;
    }

    private static String lIIlIlIIIIllIII(String lllllllllllllllIIlIIIlllllIIIllI, String lllllllllllllllIIlIIIlllllIIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIlllllIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIlllllIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIIlllllIIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIIlllllIIlIII.init(llllllIIIIll[8], lllllllllllllllIIlIIIlllllIIlIIl);
            return new String(lllllllllllllllIIlIIIlllllIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIlllllIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIlllllIIIlll) {
            lllllllllllllllIIlIIIlllllIIIlll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean a(WorldPoint worldPoint) {
        WorldPoint[] worldPointArr = this.rocks;
        int length = worldPointArr.length;
        int i = llllllIIIIll[0];
        while (lIIlIlIIIIllIll(i, length)) {
            if (lIIlIlIIIIlllII(worldPointArr[i].equals(worldPoint) ? 1 : 0)) {
                return llllllIIIIll[1];
            }
            i++;
            "".length();
            if (0 != 0) {
                return ((((170 + 0) - 38) + 40) ^ (((45 + 116) - 139) + 139)) & (((((38 + 176) - 80) + 56) ^ (((43 + 110) - 109) + 135)) ^ (-" ".length()));
            }
        }
        return llllllIIIIll[0];
    }

    public WorldPoint d() {
        return new WorldPoint(this.standing.getX(), this.standing.getY(), llllllIIIIll[0]);
    }

    private static void lIIlIlIIIIllIIl() {
        llllllIIIIlI = new String[llllllIIIIll[8]];
        llllllIIIIlI[llllllIIIIll[0]] = lIIlIlIIIIllIII("eKzOFm6JQXYkqWYzPeSDhA==", "FKEJQ");
        llllllIIIIlI[llllllIIIIll[1]] = lIIlIlIIIIllIII("5GMomENPMu5564d13Qx4sQ==", "WJPwf");
    }

    private static boolean lIIlIlIIIIlllII(int i) {
        return i != 0;
    }

    public WorldPoint[] e() {
        return this.rocks;
    }

    private EnumC0004e(String str, int i, Point point, WorldPoint... worldPointArr) {
        this.standing = point;
        this.rocks = worldPointArr;
    }

    public static EnumC0004e valueOf(String str) {
        return (EnumC0004e) Enum.valueOf(EnumC0004e.class, str);
    }

    public static EnumC0004e[] values() {
        return (EnumC0004e[]) $VALUES.clone();
    }

    private static void lIIlIlIIIIllIlI() {
        llllllIIIIll = new int[13];
        llllllIIIIll[0] = ((31 ^ 10) ^ (31 ^ 54)) & (((131 ^ 196) ^ (210 ^ 169)) ^ (-" ".length()));
        llllllIIIIll[1] = " ".length();
        llllllIIIIll[2] = (-9125) & 12287;
        llllllIIIIll[3] = (-((-2369) & 24014)) & (-17) & 24575;
        llllllIIIIll[4] = 169 ^ 173;
        llllllIIIIll[5] = (-16513) & 19679;
        llllllIIIIll[6] = (-17545) & 20457;
        llllllIIIIll[7] = (-((-4825) & 29402)) & (-129) & 27871;
        llllllIIIIll[8] = "  ".length();
        llllllIIIIll[9] = (-29185) & 32348;
        llllllIIIIll[10] = "   ".length();
        llllllIIIIll[11] = (-13469) & 16383;
        llllllIIIIll[12] = (-8227) & 11391;
    }
}
