package m.e.i.q.u.r.p000.n.s.e.r.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.d  reason: invalid package and case insensitive filesystem */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/d.class */
public final class EnumC0003d {
    private final /* synthetic */ WorldPoint[] points;
    private static /* synthetic */ int[] lllllIlIlIlI;
    private static final /* synthetic */ EnumC0003d[] $VALUES;
    public static final /* synthetic */ EnumC0003d UPPER_FLOOR;
    private static /* synthetic */ String[] lllllIlIIlll;
    public static final /* synthetic */ EnumC0003d SOUTH_WEST;

    private EnumC0003d(String str, int i, WorldPoint... worldPointArr) {
        this.points = worldPointArr;
    }

    private static String lIIlIIllIlIIlII(String lllllllllllllllIIlIIlIlIIlllllII, String lllllllllllllllIIlIIlIlIIllllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIlIIllllIll.getBytes(StandardCharsets.UTF_8)), lllllIlIlIlI[19]), "DES");
            Cipher lllllllllllllllIIlIIlIlIIllllllI = Cipher.getInstance("DES");
            lllllllllllllllIIlIIlIlIIllllllI.init(lllllIlIlIlI[7], secretKeySpec);
            return new String(lllllllllllllllIIlIIlIlIIllllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIlIIlllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlIlIIlllllIl) {
            lllllllllllllllIIlIIlIlIIlllllIl.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIllIlIlllI() {
        lllllIlIlIlI = new int[41];
        lllllIlIlIlI[0] = ((((4 + 116) - 96) + 136) ^ (((143 + 47) - 65) + 63)) & (((84 ^ 48) ^ (53 ^ 77)) ^ (-" ".length()));
        lllllIlIlIlI[1] = (((98 + 16) - 40) + 66) ^ (((127 + 121) - 213) + 99);
        lllllIlIlIlI[2] = (-(48 ^ 101)) & (-16641) & 20479;
        lllllIlIlIlI[3] = (-((-5649) & 30675)) & (-2049) & 32751;
        lllllIlIlIlI[4] = " ".length();
        lllllIlIlIlI[5] = (-((-651) & 25563)) & (-5) & 28670;
        lllllIlIlIlI[6] = (-((-12578) & 31219)) & (-8193) & 32511;
        lllllIlIlIlI[7] = "  ".length();
        lllllIlIlIlI[8] = (-24579) & 28331;
        lllllIlIlIlI[9] = (-395) & 6074;
        lllllIlIlIlI[10] = "   ".length();
        lllllIlIlIlI[11] = 121 ^ 125;
        lllllIlIlIlI[12] = (-((-161) & 28919)) & (-257) & 32766;
        lllllIlIlIlI[13] = (-2058) & 7741;
        lllllIlIlIlI[14] = 177 ^ 180;
        lllllIlIlIlI[15] = (178 ^ 172) ^ (99 ^ 123);
        lllllIlIlIlI[16] = (-26757) & 32438;
        lllllIlIlIlI[17] = (232 ^ 193) ^ (152 ^ 182);
        lllllIlIlIlI[18] = (-((-5217) & 15853)) & (-16449) & 32767;
        lllllIlIlIlI[19] = 129 ^ 137;
        lllllIlIlIlI[20] = (-12617) & 16367;
        lllllIlIlIlI[21] = (-26701) & 32381;
        lllllIlIlIlI[22] = (127 ^ 74) ^ (16 ^ 44);
        lllllIlIlIlI[23] = (((136 + 104) - 233) + 133) ^ (((47 + 81) - 25) + 25);
        lllllIlIlIlI[24] = (-((-2705) & 31741)) & (-1) & 32766;
        lllllIlIlIlI[25] = (-((-7689) & 15981)) & (-2433) & 16383;
        lllllIlIlIlI[26] = (-((-16461) & 24942)) & (-16385) & 30525;
        lllllIlIlIlI[27] = (-8385) & 14045;
        lllllIlIlIlI[28] = (-2114) & 7775;
        lllllIlIlIlI[29] = (-8193) & 11921;
        lllllIlIlIlI[30] = (-2181) & 7846;
        lllllIlIlIlI[31] = (-((-2567) & 27343)) & (-2305) & 32747;
        lllllIlIlIlI[32] = (-24580) & 30247;
        lllllIlIlIlI[33] = (-18833) & 24501;
        lllllIlIlIlI[34] = (-8483) & 12219;
        lllllIlIlIlI[35] = (-((-17363) & 25587)) & (-16514) & 30395;
        lllllIlIlIlI[36] = (-((-11409) & 27899)) & (-4353) & 24575;
        lllllIlIlIlI[37] = (-16577) & 22239;
        lllllIlIlIlI[38] = (-((-2573) & 23151)) & (-8458) & 32767;
        lllllIlIlIlI[39] = (-((-1121) & 9595)) & (-69) & 14207;
        lllllIlIlIlI[40] = 57 ^ 50;
    }

    public WorldPoint[] g() {
        return this.points;
    }

    public List<WorldPoint> f() {
        return Arrays.asList(g());
    }

    public static EnumC0003d valueOf(String str) {
        return (EnumC0003d) Enum.valueOf(EnumC0003d.class, str);
    }

    private static void lIIlIIllIlIIllI() {
        lllllIlIIlll = new String[lllllIlIlIlI[7]];
        lllllIlIIlll[lllllIlIlIlI[0]] = lIIlIIllIlIIlII("ZkFvAEgX15IUtbu/mtkEnQ==", "VqrQJ");
        lllllIlIIlll[lllllIlIlIlI[4]] = lIIlIIllIlIIlIl("RQGHW6IcNICAp976D8587A==", "bpqAG");
    }

    static {
        lIIlIIllIlIlllI();
        lIIlIIllIlIIllI();
        String str = lllllIlIIlll[lllllIlIlIlI[0]];
        int i = lllllIlIlIlI[0];
        WorldPoint[] worldPointArr = new WorldPoint[lllllIlIlIlI[1]];
        worldPointArr[lllllIlIlIlI[0]] = new WorldPoint(lllllIlIlIlI[2], lllllIlIlIlI[3], lllllIlIlIlI[0]);
        worldPointArr[lllllIlIlIlI[4]] = new WorldPoint(lllllIlIlIlI[5], lllllIlIlIlI[6], lllllIlIlIlI[0]);
        worldPointArr[lllllIlIlIlI[7]] = new WorldPoint(lllllIlIlIlI[8], lllllIlIlIlI[9], lllllIlIlIlI[0]);
        worldPointArr[lllllIlIlIlI[10]] = new WorldPoint(lllllIlIlIlI[5], lllllIlIlIlI[6], lllllIlIlIlI[0]);
        worldPointArr[lllllIlIlIlI[11]] = new WorldPoint(lllllIlIlIlI[12], lllllIlIlIlI[13], lllllIlIlIlI[0]);
        worldPointArr[lllllIlIlIlI[14]] = new WorldPoint(lllllIlIlIlI[8], lllllIlIlIlI[13], lllllIlIlIlI[0]);
        worldPointArr[lllllIlIlIlI[15]] = new WorldPoint(lllllIlIlIlI[5], lllllIlIlIlI[16], lllllIlIlIlI[0]);
        worldPointArr[lllllIlIlIlI[17]] = new WorldPoint(lllllIlIlIlI[5], lllllIlIlIlI[18], lllllIlIlIlI[0]);
        worldPointArr[lllllIlIlIlI[19]] = new WorldPoint(lllllIlIlIlI[20], lllllIlIlIlI[21], lllllIlIlIlI[0]);
        worldPointArr[lllllIlIlIlI[22]] = new WorldPoint(lllllIlIlIlI[20], lllllIlIlIlI[9], lllllIlIlIlI[0]);
        UPPER_FLOOR = new EnumC0003d(str, i, worldPointArr);
        String str2 = lllllIlIIlll[lllllIlIlIlI[4]];
        int i2 = lllllIlIlIlI[4];
        WorldPoint[] worldPointArr2 = new WorldPoint[lllllIlIlIlI[23]];
        worldPointArr2[lllllIlIlIlI[0]] = new WorldPoint(lllllIlIlIlI[24], lllllIlIlIlI[25], lllllIlIlIlI[0]);
        worldPointArr2[lllllIlIlIlI[4]] = new WorldPoint(lllllIlIlIlI[24], lllllIlIlIlI[26], lllllIlIlIlI[0]);
        worldPointArr2[lllllIlIlIlI[7]] = new WorldPoint(lllllIlIlIlI[24], lllllIlIlIlI[27], lllllIlIlIlI[0]);
        worldPointArr2[lllllIlIlIlI[10]] = new WorldPoint(lllllIlIlIlI[24], lllllIlIlIlI[28], lllllIlIlIlI[0]);
        worldPointArr2[lllllIlIlIlI[11]] = new WorldPoint(lllllIlIlIlI[29], lllllIlIlIlI[30], lllllIlIlIlI[0]);
        worldPointArr2[lllllIlIlIlI[14]] = new WorldPoint(lllllIlIlIlI[29], lllllIlIlIlI[31], lllllIlIlIlI[0]);
        worldPointArr2[lllllIlIlIlI[15]] = new WorldPoint(lllllIlIlIlI[29], lllllIlIlIlI[32], lllllIlIlIlI[0]);
        worldPointArr2[lllllIlIlIlI[17]] = new WorldPoint(lllllIlIlIlI[29], lllllIlIlIlI[33], lllllIlIlIlI[0]);
        worldPointArr2[lllllIlIlIlI[19]] = new WorldPoint(lllllIlIlIlI[34], lllllIlIlIlI[35], lllllIlIlIlI[0]);
        worldPointArr2[lllllIlIlIlI[22]] = new WorldPoint(lllllIlIlIlI[36], lllllIlIlIlI[37], lllllIlIlIlI[0]);
        worldPointArr2[lllllIlIlIlI[1]] = new WorldPoint(lllllIlIlIlI[38], lllllIlIlIlI[39], lllllIlIlIlI[0]);
        worldPointArr2[lllllIlIlIlI[40]] = new WorldPoint(lllllIlIlIlI[36], lllllIlIlIlI[3], lllllIlIlIlI[0]);
        SOUTH_WEST = new EnumC0003d(str2, i2, worldPointArr2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[lllllIlIlIlI[7]];
        enumC0003dArr[lllllIlIlIlI[0]] = UPPER_FLOOR;
        enumC0003dArr[lllllIlIlIlI[4]] = SOUTH_WEST;
        $VALUES = enumC0003dArr;
    }

    private static String lIIlIIllIlIIlIl(String lllllllllllllllIIlIIlIlIIllIllll, String lllllllllllllllIIlIIlIlIIllIlllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlIlIIlllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIlIIllIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllllIlIlIlI[7], lllllllllllllllIIlIIlIlIIlllIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIlIIllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlIlIIlllIIII) {
            lllllllllllllllIIlIIlIlIIlllIIII.printStackTrace();
            return null;
        }
    }

    public static EnumC0003d[] values() {
        return (EnumC0003d[]) $VALUES.clone();
    }
}
