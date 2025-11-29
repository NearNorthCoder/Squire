package e.t.r.i.s.h.q.n.r.u.p000.u.e;

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
/* renamed from: e.t.r.i.s.h.q.n.r.u.-.u.e.d  reason: invalid package and case insensitive filesystem */
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:e/t/r/i/s/h/q/n/r/u/-/u/e/d.class */
public final class EnumC0003d {
    public static final /* synthetic */ EnumC0003d FELDIP_HILLS_NORTH;
    public static final /* synthetic */ EnumC0003d WILDERNESS_NORTH;
    private static /* synthetic */ int[] lllIllllIlll;
    public static final /* synthetic */ EnumC0003d PISCATORIS_HUNTER_AREA;
    private static final /* synthetic */ EnumC0003d[] $VALUES;
    private final /* synthetic */ WorldPoint center;
    public static final /* synthetic */ EnumC0003d FELDIP_HILLS_SOUTH;
    public static final /* synthetic */ EnumC0003d RED_CHIN_HUNTING_GROUND;
    public static final /* synthetic */ EnumC0003d GWENITH_HUNTER_AREA;
    public static final /* synthetic */ EnumC0003d WILDERNESS_SOUTH;
    public static final /* synthetic */ EnumC0003d ISLE_OF_SOULS;
    private static /* synthetic */ String[] lllIllllIlIl;

    private static void lIIIlllIIIlIIll() {
        lllIllllIlIl = new String[lllIllllIlll[25]];
        lllIllllIlIl[lllIllllIlll[0]] = lIIIlllIIIIlIIl("Jj4jIS8jOSo2OS45IDc+OQ==", "qwoej");
        lllIllllIlIl[lllIllllIlll[1]] = lIIIlllIIIIlIlI("QvZ2XxxH2jo7mHb/08vMv0oWORonm7za", "Hdosl");
        lllIllllIlIl[lllIllllIlll[7]] = lIIIlllIIIIlIIl("GSE/Bg4dJz4MHBYgOQsbDDozBB0MKQ==", "IhlEO");
        lllIllllIlIl[lllIllllIlll[10]] = lIIIlllIIIIlIll("o5vmmuiGAG8YWHkpsQQ5vw==", "vxtlt");
        lllIllllIlIl[lllIllllIlll[13]] = lIIIlllIIIIlIIl("Cgs2DxgcETICHQAdJQUeHhoy", "LNzKQ");
        lllIllllIlIl[lllIllllIlll[16]] = lIIIlllIIIIlIIl("ET8mIS8HJSIsKhspNTYpAi4i", "Wzjef");
        lllIllllIlIl[lllIllllIlll[19]] = lIIIlllIIIIlIlI("khwPl7OB9WXe5j19DiSH6jNpiC5k73s9", "uouBi");
        lllIllllIlIl[lllIllllIlll[22]] = lIIIlllIIIIlIll("uHO30TGRWBBlVVZmZfcBQ+8mADtw/RTF", "pThuH");
    }

    private static boolean lIIIlllIIIlIlIl(int i, int i2) {
        return i < i2;
    }

    public static EnumC0003d valueOf(String str) {
        return (EnumC0003d) Enum.valueOf(EnumC0003d.class, str);
    }

    static {
        lIIIlllIIIlIlII();
        lIIIlllIIIlIIll();
        WILDERNESS_NORTH = new EnumC0003d(lllIllllIlIl[lllIllllIlll[0]], lllIllllIlll[0], new WorldPoint(lllIllllIlll[3], lllIllllIlll[4], lllIllllIlll[0]));
        WILDERNESS_SOUTH = new EnumC0003d(lllIllllIlIl[lllIllllIlll[1]], lllIllllIlll[1], new WorldPoint(lllIllllIlll[5], lllIllllIlll[6], lllIllllIlll[0]));
        PISCATORIS_HUNTER_AREA = new EnumC0003d(lllIllllIlIl[lllIllllIlll[7]], lllIllllIlll[7], new WorldPoint(lllIllllIlll[8], lllIllllIlll[9], lllIllllIlll[0]));
        ISLE_OF_SOULS = new EnumC0003d(lllIllllIlIl[lllIllllIlll[10]], lllIllllIlll[10], new WorldPoint(lllIllllIlll[11], lllIllllIlll[12], lllIllllIlll[0]));
        FELDIP_HILLS_NORTH = new EnumC0003d(lllIllllIlIl[lllIllllIlll[13]], lllIllllIlll[13], new WorldPoint(lllIllllIlll[14], lllIllllIlll[15], lllIllllIlll[0]));
        FELDIP_HILLS_SOUTH = new EnumC0003d(lllIllllIlIl[lllIllllIlll[16]], lllIllllIlll[16], new WorldPoint(lllIllllIlll[17], lllIllllIlll[18], lllIllllIlll[0]));
        GWENITH_HUNTER_AREA = new EnumC0003d(lllIllllIlIl[lllIllllIlll[19]], lllIllllIlll[19], new WorldPoint(lllIllllIlll[20], lllIllllIlll[21], lllIllllIlll[0]));
        RED_CHIN_HUNTING_GROUND = new EnumC0003d(lllIllllIlIl[lllIllllIlll[22]], lllIllllIlll[22], new WorldPoint(lllIllllIlll[23], lllIllllIlll[24], lllIllllIlll[0]));
        EnumC0003d[] enumC0003dArr = new EnumC0003d[lllIllllIlll[25]];
        enumC0003dArr[lllIllllIlll[0]] = WILDERNESS_NORTH;
        enumC0003dArr[lllIllllIlll[1]] = WILDERNESS_SOUTH;
        enumC0003dArr[lllIllllIlll[7]] = PISCATORIS_HUNTER_AREA;
        enumC0003dArr[lllIllllIlll[10]] = ISLE_OF_SOULS;
        enumC0003dArr[lllIllllIlll[13]] = FELDIP_HILLS_NORTH;
        enumC0003dArr[lllIllllIlll[16]] = FELDIP_HILLS_SOUTH;
        enumC0003dArr[lllIllllIlll[19]] = GWENITH_HUNTER_AREA;
        enumC0003dArr[lllIllllIlll[22]] = RED_CHIN_HUNTING_GROUND;
        $VALUES = enumC0003dArr;
    }

    private EnumC0003d(String str, int i, WorldPoint worldPoint) {
        this.center = worldPoint;
    }

    private static String lIIIlllIIIIlIlI(String lllllllllllllllIIlIllIlllIIIIlII, String lllllllllllllllIIlIllIlllIIIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIlllIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIlllIIIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIlllIIIIllI.init(lllIllllIlll[7], secretKeySpec);
            return new String(lllllllllllllllIIlIllIlllIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIlllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIlllIIIIlIl) {
            lllllllllllllllIIlIllIlllIIIIlIl.printStackTrace();
            return null;
        }
    }

    public static EnumC0003d[] values() {
        return (EnumC0003d[]) $VALUES.clone();
    }

    private static void lIIIlllIIIlIlII() {
        lllIllllIlll = new int[26];
        lllIllllIlll[0] = (183 ^ 187) & ((155 ^ 151) ^ (-1));
        lllIllllIlll[1] = " ".length();
        lllIllllIlll[2] = -" ".length();
        lllIllllIlll[3] = (-28698) & 31833;
        lllIllllIlll[4] = (-((-4449) & 29033)) & (-4385) & 32751;
        lllIllllIlll[5] = (-5009) & 8154;
        lllIllllIlll[6] = (-((-14561) & 31201)) & (-8195) & 28607;
        lllIllllIlll[7] = "  ".length();
        lllIllllIlll[8] = (-((-513) & 9885)) & (-20996) & 32703;
        lllIllllIlll[9] = (-((-1957) & 30653)) & (-67) & 32379;
        lllIllllIlll[10] = "   ".length();
        lllIllllIlll[11] = (-((-8269) & 30575)) & (-129) & 24558;
        lllIllllIlll[12] = (-8195) & 11142;
        lllIllllIlll[13] = 157 ^ 153;
        lllIllllIlll[14] = (-22018) & 24573;
        lllIllllIlll[15] = (-((-114) & 12539)) & (-17409) & 32767;
        lllIllllIlll[16] = (((110 + 94) - 162) + 104) ^ (((43 + 18) - (-85)) + 5);
        lllIllllIlll[17] = (-((-2787) & 24311)) & (-515) & 24542;
        lllIllllIlll[18] = (-((-10505) & 32057)) & (-141) & 24575;
        lllIllllIlll[19] = 79 ^ 73;
        lllIllllIlll[20] = (-((-5201) & 22363)) & (-12305) & 31742;
        lllIllllIlll[21] = (-25218) & 28621;
        lllIllllIlll[22] = 80 ^ 87;
        lllIllllIlll[23] = (-546) & 3059;
        lllIllllIlll[24] = (-(114 ^ 65)) & (-17281) & 26623;
        lllIllllIlll[25] = 104 ^ 96;
    }

    public List<WorldPoint> a(int i) {
        return List.of(this.center.dx(lllIllllIlll[0]).dy(lllIllllIlll[1]), this.center.dx(lllIllllIlll[0]).dy(lllIllllIlll[2]), this.center.dx(lllIllllIlll[1]).dy(lllIllllIlll[0]), this.center.dx(lllIllllIlll[2]).dy(lllIllllIlll[0]), this.center.dx(lllIllllIlll[1]).dy(lllIllllIlll[1]), this.center.dx(lllIllllIlll[2]).dy(lllIllllIlll[2])).subList(lllIllllIlll[0], i);
    }

    public WorldPoint l() {
        return this.center;
    }

    private static String lIIIlllIIIIlIll(String lllllllllllllllIIlIllIllIlllIlll, String lllllllllllllllIIlIllIllIlllIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIllIlllIllI.getBytes(StandardCharsets.UTF_8)), lllIllllIlll[25]), "DES");
            Cipher lllllllllllllllIIlIllIllIllllIIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIllIllllIIl.init(lllIllllIlll[7], secretKeySpec);
            return new String(lllllllllllllllIIlIllIllIllllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIllIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIllIllllIII) {
            lllllllllllllllIIlIllIllIllllIII.printStackTrace();
            return null;
        }
    }

    private static String lIIIlllIIIIlIIl(String lllllllllllllllIIlIllIllIllIIlll, String lllllllllllllllIIlIllIllIllIIllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIllIllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIllIllIllIIllI.toCharArray();
        int lllllllllllllllIIlIllIllIllIIIll = lllIllllIlll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lllIllllIlll[0];
        while (lIIIlllIIIlIlIl(i, length)) {
            char lllllllllllllllIIlIllIllIllIlIII = charArray2[i];
            sb.append((char) (lllllllllllllllIIlIllIllIllIlIII ^ charArray[lllllllllllllllIIlIllIllIllIIIll % charArray.length]));
            "".length();
            lllllllllllllllIIlIllIllIllIIIll++;
            i++;
            "".length();
            if ((true ^ true) != (true ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
