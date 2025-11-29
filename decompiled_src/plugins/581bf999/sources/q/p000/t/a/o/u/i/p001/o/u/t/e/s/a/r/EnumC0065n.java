package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.n  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/n.class */
public final class EnumC0065n {
    public static final /* synthetic */ EnumC0065n FIRE;
    private static /* synthetic */ String[] lIlllIIlllI;
    private final /* synthetic */ int regionX;
    private static final /* synthetic */ EnumC0065n[] $VALUES;
    public static final /* synthetic */ EnumC0065n DEATH;
    private final /* synthetic */ int regionY;
    private static /* synthetic */ int[] lIlllIIllll;
    public static final /* synthetic */ EnumC0065n LIGHTNING;
    private final /* synthetic */ int objectId;
    public static final /* synthetic */ EnumC0065n AIR;

    private static String lIIllIIlIIIllI(String llllllllllllllllIlIIllIlllIIlIII, String llllllllllllllllIlIIllIlllIIIlll) {
        try {
            SecretKeySpec llllllllllllllllIlIIllIlllIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIllIlllIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllIIllll[9], llllllllllllllllIlIIllIlllIIlIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIllIlllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIllIlllIIlIIl) {
            llllllllllllllllIlIIllIlllIIlIIl.printStackTrace();
            return null;
        }
    }

    private EnumC0065n(String str, int i, int i2, int i3, int i4) {
        this.objectId = i2;
        this.regionX = i3;
        this.regionY = i4;
    }

    private static void lIIllIIlIIlIII() {
        lIlllIIlllI = new String[lIlllIIllll[14]];
        lIlllIIlllI[lIlllIIllll[0]] = lIIllIIlIIIlIl("YOqmHdkVQ50=", "QbueQ");
        lIlllIIlllI[lIlllIIllll[2]] = lIIllIIlIIIllI("U7J1iKQ672I=", "WmnSd");
        lIlllIIlllI[lIlllIIllll[9]] = lIIllIIlIIIlIl("I8YghxRCHgJbhtO7Hr4Xfw==", "WTFHL");
        lIlllIIlllI[lIlllIIllll[12]] = lIIllIIlIIIllI("wq3yX6e+vt0=", "aQINU");
    }

    public static EnumC0065n e(int llllllllllllllllIlIIllIllllIlIII) {
        EnumC0065n[] values = values();
        int length = values.length;
        int i = lIlllIIllll[0];
        while (lIIllIIlIIlIlI(i, length)) {
            EnumC0065n enumC0065n = values[i];
            if (lIIllIIlIIlIll(enumC0065n.L(), llllllllllllllllIlIIllIllllIlIII)) {
                return enumC0065n;
            }
            i++;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        return null;
    }

    private static String lIIllIIlIIIlIl(String llllllllllllllllIlIIllIllIlllIll, String llllllllllllllllIlIIllIllIlllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIllIllIlllIlI.getBytes(StandardCharsets.UTF_8)), lIlllIIllll[15]), "DES");
            Cipher llllllllllllllllIlIIllIllIllllIl = Cipher.getInstance("DES");
            llllllllllllllllIlIIllIllIllllIl.init(lIlllIIllll[9], secretKeySpec);
            return new String(llllllllllllllllIlIIllIllIllllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIllIllIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIllIllIllllII) {
            llllllllllllllllIlIIllIllIllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIIlIIllII(Object obj) {
        return obj == null;
    }

    private static void lIIllIIlIIlIIl() {
        lIlllIIllll = new int[16];
        lIlllIIllll[0] = ((233 ^ 181) ^ (131 ^ 198)) & (((((78 + 59) - 58) + 97) ^ (((76 + 44) - 1) + 50)) ^ (-" ".length()));
        lIlllIIllll[1] = (-1) & Integer.MAX_VALUE;
        lIlllIIllll[2] = " ".length();
        lIlllIIllll[3] = (-((-7937) & 24356)) & (-129) & 31223;
        lIlllIIllll[4] = (-1105) & 46975;
        lIlllIIllll[5] = (168 ^ 147) ^ (85 ^ 76);
        lIlllIIllll[6] = 123 ^ 90;
        lIlllIIllll[7] = (-17427) & 63294;
        lIlllIIllll[8] = 112 ^ 111;
        lIlllIIllll[9] = "  ".length();
        lIlllIIllll[10] = (-((-5937) & 8115)) & (-65) & 48111;
        lIlllIIllll[11] = (4 ^ 42) ^ (18 ^ 34);
        lIlllIIllll[12] = "   ".length();
        lIlllIIllll[13] = (-3218) & 49087;
        lIlllIIllll[14] = (123 ^ 35) ^ (114 ^ 46);
        lIlllIIllll[15] = (((71 + 51) - 10) + 94) ^ (((138 + 142) - 186) + 104);
    }

    static {
        lIIllIIlIIlIIl();
        lIIllIIlIIlIII();
        DEATH = new EnumC0065n(lIlllIIlllI[lIlllIIllll[0]], lIlllIIllll[0], lIlllIIllll[4], lIlllIIllll[5], lIlllIIllll[6]);
        FIRE = new EnumC0065n(lIlllIIlllI[lIlllIIllll[2]], lIlllIIllll[2], lIlllIIllll[7], lIlllIIllll[8], lIlllIIllll[6]);
        LIGHTNING = new EnumC0065n(lIlllIIlllI[lIlllIIllll[9]], lIlllIIllll[9], lIlllIIllll[10], lIlllIIllll[5], lIlllIIllll[11]);
        AIR = new EnumC0065n(lIlllIIlllI[lIlllIIllll[12]], lIlllIIllll[12], lIlllIIllll[13], lIlllIIllll[8], lIlllIIllll[11]);
        EnumC0065n[] enumC0065nArr = new EnumC0065n[lIlllIIllll[14]];
        enumC0065nArr[lIlllIIllll[0]] = DEATH;
        enumC0065nArr[lIlllIIllll[2]] = FIRE;
        enumC0065nArr[lIlllIIllll[9]] = LIGHTNING;
        enumC0065nArr[lIlllIIllll[12]] = AIR;
        $VALUES = enumC0065nArr;
    }

    private static boolean lIIllIIlIIlIll(int i, int i2) {
        return i == i2;
    }

    public int L() {
        return this.objectId;
    }

    private static boolean lIIllIIlIIlIlI(int i, int i2) {
        return i < i2;
    }

    public static EnumC0065n a(Client client, WorldPoint worldPoint) {
        EnumC0065n enumC0065n = null;
        int i = lIlllIIllll[1];
        EnumC0065n[] values = values();
        int length = values.length;
        int i2 = lIlllIIllll[0];
        while (lIIllIIlIIlIlI(i2, length)) {
            EnumC0065n enumC0065n2 = values[i2];
            WorldPoint a = enumC0065n2.a(client);
            if (lIIllIIlIIllII(a)) {
                "".length();
                if (" ".length() == ((207 ^ 158) & ((196 ^ 149) ^ (-1)))) {
                    return null;
                }
            } else {
                int distanceTo = a.distanceTo(worldPoint);
                if (lIIllIIlIIlIlI(distanceTo, i)) {
                    enumC0065n = enumC0065n2;
                    i = distanceTo;
                }
            }
            i2++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return enumC0065n;
    }

    public WorldPoint a(Client client) {
        return (WorldPoint) WorldPoint.toLocalInstance(client, new RegionPoint(this.regionX, this.regionY, lIlllIIllll[2], lIlllIIllll[3]).toWorld()).stream().findFirst().orElse(null);
    }

    public static EnumC0065n valueOf(String str) {
        return (EnumC0065n) Enum.valueOf(EnumC0065n.class, str);
    }

    public static EnumC0065n[] values() {
        return (EnumC0065n[]) $VALUES.clone();
    }
}
