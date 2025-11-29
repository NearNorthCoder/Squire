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
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.c  reason: invalid package and case insensitive filesystem */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/c.class */
public final class EnumC0002c {
    private static final /* synthetic */ EnumC0002c[] $VALUES;
    public static final /* synthetic */ EnumC0002c SOUTH_FOUR;
    private static /* synthetic */ String[] lllllIIlIIll;
    private final /* synthetic */ Point standing;
    private final /* synthetic */ WorldPoint[] rocks;
    private static /* synthetic */ int[] lllllIIlIlII;

    public static EnumC0002c[] values() {
        return (EnumC0002c[]) $VALUES.clone();
    }

    private static void lIIlIIlIlIllllI() {
        lllllIIlIlII = new int[12];
        lllllIIlIlII[0] = (78 ^ 92) & ((97 ^ 115) ^ (-1));
        lllllIIlIlII[1] = " ".length();
        lllllIIlIlII[2] = (-((-1126) & 26599)) & (-4129) & 32767;
        lllllIIlIlII[3] = (-16545) & 19454;
        lllllIIlIlII[4] = (229 ^ 194) ^ (124 ^ 95);
        lllllIIlIlII[5] = (-17187) & 20351;
        lllllIIlIlII[6] = (-24580) & 27487;
        lllllIIlIlII[7] = (-12289) & 15197;
        lllllIIlIlII[8] = "  ".length();
        lllllIIlIlII[9] = "   ".length();
        lllllIIlIlII[10] = (-24833) & 27999;
        lllllIIlIlII[11] = (-21505) & 24415;
    }

    static {
        lIIlIIlIlIllllI();
        lIIlIIlIlIlllIl();
        String str = lllllIIlIIll[lllllIIlIlII[0]];
        int i = lllllIIlIlII[0];
        Point point = new Point(lllllIIlIlII[2], lllllIIlIlII[3]);
        WorldPoint[] worldPointArr = new WorldPoint[lllllIIlIlII[4]];
        worldPointArr[lllllIIlIlII[0]] = new WorldPoint(lllllIIlIlII[5], lllllIIlIlII[6], lllllIIlIlII[0]);
        worldPointArr[lllllIIlIlII[1]] = new WorldPoint(lllllIIlIlII[5], lllllIIlIlII[7], lllllIIlIlII[0]);
        worldPointArr[lllllIIlIlII[8]] = new WorldPoint(lllllIIlIlII[5], lllllIIlIlII[3], lllllIIlIlII[0]);
        worldPointArr[lllllIIlIlII[9]] = new WorldPoint(lllllIIlIlII[10], lllllIIlIlII[11], lllllIIlIlII[0]);
        SOUTH_FOUR = new EnumC0002c(str, i, point, worldPointArr);
        EnumC0002c[] enumC0002cArr = new EnumC0002c[lllllIIlIlII[1]];
        enumC0002cArr[lllllIIlIlII[0]] = SOUTH_FOUR;
        $VALUES = enumC0002cArr;
    }

    private static String lIIlIIlIlIlllII(String lllllllllllllllIIlIIllIIIIIIlllI, String lllllllllllllllIIlIIllIIIIIIllIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIIIIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIIIIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIllIIIIIlIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIllIIIIIlIIII.init(lllllIIlIlII[8], lllllllllllllllIIlIIllIIIIIlIIIl);
            return new String(lllllllllllllllIIlIIllIIIIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIllIIIIIIllll) {
            lllllllllllllllIIlIIllIIIIIIllll.printStackTrace();
            return null;
        }
    }

    public static EnumC0002c valueOf(String str) {
        return (EnumC0002c) Enum.valueOf(EnumC0002c.class, str);
    }

    private static void lIIlIIlIlIlllIl() {
        lllllIIlIIll = new String[lllllIIlIlII[1]];
        lllllIIlIIll[lllllIIlIlII[0]] = lIIlIIlIlIlllII("D5IBcEpwUvK6MnDwJOQZsg==", "aGFOq");
    }

    private static boolean lIIlIIlIllIIIII(int i) {
        return i != 0;
    }

    private EnumC0002c(String str, int i, Point point, WorldPoint... worldPointArr) {
        this.standing = point;
        this.rocks = worldPointArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean a(WorldPoint worldPoint) {
        WorldPoint[] worldPointArr = this.rocks;
        int length = worldPointArr.length;
        int i = lllllIIlIlII[0];
        while (lIIlIIlIlIlllll(i, length)) {
            if (lIIlIIlIllIIIII(worldPointArr[i].equals(worldPoint) ? 1 : 0)) {
                return lllllIIlIlII[1];
            }
            i++;
            "".length();
            if (!(true ^ true)) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lllllIIlIlII[0];
    }

    public WorldPoint[] e() {
        return this.rocks;
    }

    public WorldPoint d() {
        return new WorldPoint(this.standing.getX(), this.standing.getY(), lllllIIlIlII[0]);
    }

    private static boolean lIIlIIlIlIlllll(int i, int i2) {
        return i < i2;
    }
}
