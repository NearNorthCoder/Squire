package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.c  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/c.class */
public final class EnumC0002c {
    private static /* synthetic */ String[] lIIlllIIIIllI;
    private final /* synthetic */ WorldPoint anchor;
    private final /* synthetic */ WorldPoint curtainLocation;
    private static final /* synthetic */ EnumC0002c[] $VALUES;
    private final /* synthetic */ WorldPoint lureTo;
    private final /* synthetic */ WorldArea area;
    public static final /* synthetic */ EnumC0002c LADDER_HOUSE;
    public static final /* synthetic */ EnumC0002c MENAPHITE_HOUSE;
    private static /* synthetic */ int[] lIIlllIIIIlll;

    private static boolean lIllIIlIIllIIll(int i, int i2) {
        return i < i2;
    }

    public WorldPoint s() {
        return this.curtainLocation;
    }

    public static EnumC0002c[] values() {
        return (EnumC0002c[]) $VALUES.clone();
    }

    public static EnumC0002c valueOf(String str) {
        return (EnumC0002c) Enum.valueOf(EnumC0002c.class, str);
    }

    private EnumC0002c(String str, int i, WorldArea worldArea, WorldPoint worldPoint, WorldPoint worldPoint2, WorldPoint worldPoint3) {
        this.area = worldArea;
        this.lureTo = worldPoint;
        this.anchor = worldPoint2;
        this.curtainLocation = worldPoint3;
    }

    private static String lIllIIlIIllIIII(String llllllllllllllIlllIllIlIIIlIIIII, String llllllllllllllIlllIllIlIIIIlllIl) {
        try {
            SecretKeySpec llllllllllllllIlllIllIlIIIlIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIlIIIIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlllIIIIlll[18], llllllllllllllIlllIllIlIIIlIIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIlIIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIlIIIlIIIIl) {
            llllllllllllllIlllIllIlIIIlIIIIl.printStackTrace();
            return null;
        }
    }

    private static void lIllIIlIIllIIIl() {
        lIIlllIIIIllI = new String[lIIlllIIIIlll[18]];
        lIIlllIIIIllI[lIIlllIIIIlll[0]] = lIllIIlIIlIllll("Flk4K7s2ocDw5QuV+c4vHA==", "dLBoi");
        lIIlllIIIIllI[lIIlllIIIIlll[8]] = lIllIIlIIllIIII("HmuVINXNfSeo5zNEU5hWaw==", "vQhwK");
    }

    private static String lIllIIlIIlIllll(String llllllllllllllIlllIllIlIIIIlIIll, String llllllllllllllIlllIllIlIIIIlIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIlIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), lIIlllIIIIlll[19]), "DES");
            Cipher llllllllllllllIlllIllIlIIIIlIlIl = Cipher.getInstance("DES");
            llllllllllllllIlllIllIlIIIIlIlIl.init(lIIlllIIIIlll[18], secretKeySpec);
            return new String(llllllllllllllIlllIllIlIIIIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIlIIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIlIIIIlIlII) {
            llllllllllllllIlllIllIlIIIIlIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIIllIlII(int i) {
        return i != 0;
    }

    public WorldArea p() {
        return this.area;
    }

    public static EnumC0002c b(WorldPoint worldPoint) {
        EnumC0002c[] values = values();
        int length = values.length;
        int i = lIIlllIIIIlll[0];
        while (lIllIIlIIllIIll(i, length)) {
            EnumC0002c enumC0002c = values[i];
            if (lIllIIlIIllIlII(enumC0002c.p().contains(worldPoint) ? 1 : 0)) {
                return enumC0002c;
            }
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return null;
    }

    public WorldPoint q() {
        return this.lureTo;
    }

    static {
        lIllIIlIIllIIlI();
        lIllIIlIIllIIIl();
        LADDER_HOUSE = new EnumC0002c(lIIlllIIIIllI[lIIlllIIIIlll[0]], lIIlllIIIIlll[0], new WorldArea(lIIlllIIIIlll[1], lIIlllIIIIlll[2], lIIlllIIIIlll[3], lIIlllIIIIlll[4], lIIlllIIIIlll[0]), new WorldPoint(lIIlllIIIIlll[5], lIIlllIIIIlll[2], lIIlllIIIIlll[0]), new WorldPoint(lIIlllIIIIlll[1], lIIlllIIIIlll[6], lIIlllIIIIlll[0]), new WorldPoint(lIIlllIIIIlll[5], lIIlllIIIIlll[7], lIIlllIIIIlll[0]));
        MENAPHITE_HOUSE = new EnumC0002c(lIIlllIIIIllI[lIIlllIIIIlll[8]], lIIlllIIIIlll[8], new WorldArea(lIIlllIIIIlll[9], lIIlllIIIIlll[10], lIIlllIIIIlll[11], lIIlllIIIIlll[4], lIIlllIIIIlll[0]), new WorldPoint(lIIlllIIIIlll[12], lIIlllIIIIlll[13], lIIlllIIIIlll[0]), new WorldPoint(lIIlllIIIIlll[14], lIIlllIIIIlll[15], lIIlllIIIIlll[0]), new WorldPoint(lIIlllIIIIlll[16], lIIlllIIIIlll[17], lIIlllIIIIlll[0]));
        EnumC0002c[] enumC0002cArr = new EnumC0002c[lIIlllIIIIlll[18]];
        enumC0002cArr[lIIlllIIIIlll[0]] = LADDER_HOUSE;
        enumC0002cArr[lIIlllIIIIlll[8]] = MENAPHITE_HOUSE;
        $VALUES = enumC0002cArr;
    }

    private static void lIllIIlIIllIIlI() {
        lIIlllIIIIlll = new int[20];
        lIIlllIIIIlll[0] = ((90 ^ 57) ^ (8 ^ 83)) & (((162 ^ 198) ^ (59 ^ 103)) ^ (-" ".length()));
        lIIlllIIIIlll[1] = (-12313) & 15675;
        lIIlllIIIIlll[2] = (-20486) & 23485;
        lIIlllIIIIlll[3] = "   ".length();
        lIIlllIIIIlll[4] = (178 ^ 173) ^ (40 ^ 51);
        lIIlllIIIIlll[5] = (-((-17645) & 21759)) & (-25226) & 32703;
        lIIlllIIIIlll[6] = (-((-2165) & 27773)) & (-4097) & 32701;
        lIIlllIIIIlll[7] = (-((-4355) & 13643)) & (-16385) & 28671;
        lIIlllIIIIlll[8] = " ".length();
        lIIlllIIIIlll[9] = (-((-4129) & 28899)) & (-4610) & 32719;
        lIIlllIIIIlll[10] = (-((-21) & 20567)) & (-53) & 23551;
        lIIlllIIIIlll[11] = (((52 + 134) - 139) + 92) ^ (((57 + 127) - 45) + 3);
        lIIlllIIIIlll[12] = (-((-23559) & 32439)) & (-4161) & 16383;
        lIIlllIIIIlll[13] = (-((-4889) & 30589)) & (-4114) & 32767;
        lIIlllIIIIlll[14] = (-((-17906) & 22515)) & (-24649) & 32603;
        lIIlllIIIIlll[15] = (-5121) & 8077;
        lIIlllIIIIlll[16] = (-4331) & 7675;
        lIIlllIIIIlll[17] = (-1073) & 4027;
        lIIlllIIIIlll[18] = "  ".length();
        lIIlllIIIIlll[19] = (((121 + 139) - 244) + 189) ^ (((151 + 129) - 104) + 21);
    }

    public WorldPoint r() {
        return this.anchor;
    }
}
