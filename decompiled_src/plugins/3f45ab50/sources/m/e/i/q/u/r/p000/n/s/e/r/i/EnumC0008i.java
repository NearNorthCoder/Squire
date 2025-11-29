package m.e.i.q.u.r.p000.n.s.e.r.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.i  reason: invalid package and case insensitive filesystem */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/i.class */
public final class EnumC0008i {
    private final /* synthetic */ WorldPoint location;
    public static final /* synthetic */ EnumC0008i LUMBRIDGE;
    private static final /* synthetic */ EnumC0008i[] $VALUES;
    private static /* synthetic */ int[] lllllIllllll;
    private static /* synthetic */ String[] lllllIlllllI;

    private static void lIIlIlIIIIIllIl() {
        lllllIlllllI = new String[lllllIllllll[3]];
        lllllIlllllI[lllllIllllll[0]] = lIIlIlIIIIIllII("AzeK5fR9YsW99Vvr0VGtbQ==", "qrDBL");
    }

    private static void lIIlIlIIIIIlllI() {
        lllllIllllll = new int[5];
        lllllIllllll[0] = ((((93 + 191) - 211) + 180) ^ (((16 + 176) - 30) + 15)) & (((((230 + 115) - 246) + 139) ^ (((6 + 81) - 62) + 137)) ^ (-" ".length()));
        lllllIllllll[1] = (-8257) & 11485;
        lllllIllllll[2] = (-20913) & 24059;
        lllllIllllll[3] = " ".length();
        lllllIllllll[4] = "  ".length();
    }

    public static EnumC0008i valueOf(String str) {
        return (EnumC0008i) Enum.valueOf(EnumC0008i.class, str);
    }

    private EnumC0008i(String str, int i, WorldPoint worldPoint) {
        this.location = worldPoint;
    }

    public WorldPoint i() {
        return this.location;
    }

    public static EnumC0008i[] values() {
        return (EnumC0008i[]) $VALUES.clone();
    }

    private static String lIIlIlIIIIIllII(String lllllllllllllllIIlIIlIIIIIIIIllI, String lllllllllllllllIIlIIlIIIIIIIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlIIIIIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIIIIIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIlIIIIIIIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIlIIIIIIIlIII.init(lllllIllllll[4], lllllllllllllllIIlIIlIIIIIIIlIIl);
            return new String(lllllllllllllllIIlIIlIIIIIIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIIIIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlIIIIIIIIlll) {
            lllllllllllllllIIlIIlIIIIIIIIlll.printStackTrace();
            return null;
        }
    }

    static {
        lIIlIlIIIIIlllI();
        lIIlIlIIIIIllIl();
        LUMBRIDGE = new EnumC0008i(lllllIlllllI[lllllIllllll[0]], lllllIllllll[0], new WorldPoint(lllllIllllll[1], lllllIllllll[2], lllllIllllll[0]));
        EnumC0008i[] enumC0008iArr = new EnumC0008i[lllllIllllll[3]];
        enumC0008iArr[lllllIllllll[0]] = LUMBRIDGE;
        $VALUES = enumC0008iArr;
    }
}
