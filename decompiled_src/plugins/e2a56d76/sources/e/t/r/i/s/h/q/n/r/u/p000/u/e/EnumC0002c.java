package e.t.r.i.s.h.q.n.r.u.p000.u.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.t.r.i.s.h.q.n.r.u.-.u.e.c  reason: invalid package and case insensitive filesystem */
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:e/t/r/i/s/h/q/n/r/u/-/u/e/c.class */
public final class EnumC0002c {
    public static final /* synthetic */ EnumC0002c FELDIP_HILLS_SOUTH;
    private static /* synthetic */ String[] lllIllIllIII;
    private static /* synthetic */ int[] lllIllIllIIl;
    public static final /* synthetic */ EnumC0002c FELDIP_HILLS_NORTHWEST;
    private static final /* synthetic */ EnumC0002c[] $VALUES;
    public static final /* synthetic */ EnumC0002c ISLE_OF_SOULS;
    private final /* synthetic */ WorldPoint center;

    private static String lIIIllIlIlllIIl(String lllllllllllllllIIlIlllIllIlllIII, String lllllllllllllllIIlIlllIllIllIlll) {
        String lllllllllllllllIIlIlllIllIlllIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlllIllIlllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIlllIllIllIlll.toCharArray();
        int lllllllllllllllIIlIlllIllIllIlII = lllIllIllIIl[0];
        char[] charArray2 = lllllllllllllllIIlIlllIllIlllIII2.toCharArray();
        int length = charArray2.length;
        int i = lllIllIllIIl[0];
        while (lIIIllIlIllllII(i, length)) {
            char lllllllllllllllIIlIlllIllIlllIIl = charArray2[i];
            sb.append((char) (lllllllllllllllIIlIlllIllIlllIIl ^ charArray[lllllllllllllllIIlIlllIllIllIlII % charArray.length]));
            "".length();
            lllllllllllllllIIlIlllIllIllIlII++;
            i++;
            "".length();
            if (((0 ^ 64) ^ (76 ^ 8)) < "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIIIllIlIlllIll();
        lIIIllIlIlllIlI();
        FELDIP_HILLS_SOUTH = new EnumC0002c(lllIllIllIII[lllIllIllIIl[0]], lllIllIllIIl[0], new WorldPoint(lllIllIllIIl[3], lllIllIllIIl[4], lllIllIllIIl[0]));
        ISLE_OF_SOULS = new EnumC0002c(lllIllIllIII[lllIllIllIIl[1]], lllIllIllIIl[1], new WorldPoint(lllIllIllIIl[5], lllIllIllIIl[6], lllIllIllIIl[0]));
        FELDIP_HILLS_NORTHWEST = new EnumC0002c(lllIllIllIII[lllIllIllIIl[7]], lllIllIllIIl[7], new WorldPoint(lllIllIllIIl[8], lllIllIllIIl[9], lllIllIllIIl[0]));
        EnumC0002c[] enumC0002cArr = new EnumC0002c[lllIllIllIIl[10]];
        enumC0002cArr[lllIllIllIIl[0]] = FELDIP_HILLS_SOUTH;
        enumC0002cArr[lllIllIllIIl[1]] = ISLE_OF_SOULS;
        enumC0002cArr[lllIllIllIIl[7]] = FELDIP_HILLS_NORTHWEST;
        $VALUES = enumC0002cArr;
    }

    public WorldPoint l() {
        return this.center;
    }

    private static void lIIIllIlIlllIlI() {
        lllIllIllIII = new String[lllIllIllIIl[10]];
        lllIllIllIII[lllIllIllIIl[0]] = lIIIllIlIlllIII("rGztRdoEd+iz46hN7cUv7JY+wE7EW18R", "eZjdW");
        lllIllIllIII[lllIllIllIIl[1]] = lIIIllIlIlllIIl("GjwgHA8cKTMKHwYjPw==", "SolYP");
        lllIllIllIII[lllIllIllIIl[7]] = lIIIllIlIlllIII("5ci42GZvdgYYx0dVMfBypPAVx/CQqItH", "MbGKL");
    }

    private static boolean lIIIllIlIllllII(int i, int i2) {
        return i < i2;
    }

    private static void lIIIllIlIlllIll() {
        lllIllIllIIl = new int[11];
        lllIllIllIIl[0] = (247 ^ 173) & ((237 ^ 183) ^ (-1));
        lllIllIllIIl[1] = " ".length();
        lllIllIllIIl[2] = -" ".length();
        lllIllIllIIl[3] = (-((-11523) & 32083)) & (-9217) & 32383;
        lllIllIllIIl[4] = (-13317) & 16244;
        lllIllIllIIl[5] = (-((-3125) & 27957)) & (-577) & 27613;
        lllIllIllIIl[6] = (-((-3713) & 7885)) & (-25633) & 32766;
        lllIllIllIIl[7] = "  ".length();
        lllIllIllIIl[8] = (-13313) & 15839;
        lllIllIllIIl[9] = (-21513) & 24447;
        lllIllIllIIl[10] = "   ".length();
    }

    private static String lIIIllIlIlllIII(String lllllllllllllllIIlIlllIlllIIlIII, String lllllllllllllllIIlIlllIlllIIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIlllIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlllIlllIIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlllIlllIIlIlI.init(lllIllIllIIl[7], secretKeySpec);
            return new String(lllllllllllllllIIlIlllIlllIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIlllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlllIlllIIlIIl) {
            lllllllllllllllIIlIlllIlllIIlIIl.printStackTrace();
            return null;
        }
    }

    private EnumC0002c(String str, int i, WorldPoint worldPoint) {
        this.center = worldPoint;
    }

    public static EnumC0002c valueOf(String str) {
        return (EnumC0002c) Enum.valueOf(EnumC0002c.class, str);
    }

    public static EnumC0002c[] values() {
        return (EnumC0002c[]) $VALUES.clone();
    }

    public List<WorldPoint> a(int i) {
        return List.of(this.center.dx(lllIllIllIIl[0]).dy(lllIllIllIIl[1]), this.center.dx(lllIllIllIIl[0]).dy(lllIllIllIIl[2]), this.center.dx(lllIllIllIIl[1]).dy(lllIllIllIIl[0]), this.center.dx(lllIllIllIIl[2]).dy(lllIllIllIIl[0]), this.center.dx(lllIllIllIIl[1]).dy(lllIllIllIIl[1]), this.center.dx(lllIllIllIIl[2]).dy(lllIllIllIIl[2])).subList(lllIllIllIIl[0], i);
    }
}
