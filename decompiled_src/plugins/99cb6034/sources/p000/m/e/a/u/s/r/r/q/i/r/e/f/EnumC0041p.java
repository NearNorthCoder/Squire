package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.p  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/p.class */
public final class EnumC0041p {
    private final /* synthetic */ int radius;
    public static final /* synthetic */ EnumC0041p FALADOR;
    private static final /* synthetic */ EnumC0041p[] $VALUES;
    private static /* synthetic */ int[] lIllllIIlIlI;
    public static final /* synthetic */ EnumC0041p WEISS;
    public static final /* synthetic */ EnumC0041p MONASTERY;
    public static final /* synthetic */ EnumC0041p FARMING_GUILD;
    public static final /* synthetic */ EnumC0041p MORYTANIA;
    public static final /* synthetic */ EnumC0041p GRAPE_VINE_KOUREND;
    public static final /* synthetic */ EnumC0041p CHAMPIONS_GUILD;
    private final /* synthetic */ WorldPoint worldPoint;
    public static final /* synthetic */ EnumC0041p ARDOUGNE;
    public static final /* synthetic */ EnumC0041p TROLLHEIM;
    public static final /* synthetic */ EnumC0041p FOSSIL_ISLAND_UNDERWATER;
    public static final /* synthetic */ EnumC0041p HARMONY;
    private static /* synthetic */ String[] lIllllIIlIIl;
    public static final /* synthetic */ EnumC0041p HOSIDIUS;
    public static final /* synthetic */ EnumC0041p CATHERBY;
    private final /* synthetic */ int regionID;

    private EnumC0041p(String str, int i, int i2, WorldPoint worldPoint) {
        this(str, i, i2, worldPoint, lIllllIIlIlI[0]);
    }

    private static String lllIlllIIIIIIl(String lllllllllllllllIlIllIIllIIlIlIll, String lllllllllllllllIlIllIIllIIlIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIllIIlIlIlI.getBytes(StandardCharsets.UTF_8)), lIllllIIlIlI[22]), "DES");
            Cipher lllllllllllllllIlIllIIllIIlIllIl = Cipher.getInstance("DES");
            lllllllllllllllIlIllIIllIIlIllIl.init(lIllllIIlIlI[10], secretKeySpec);
            return new String(lllllllllllllllIlIllIIllIIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIllIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIIllIIlIllII) {
            lllllllllllllllIlIllIIllIIlIllII.printStackTrace();
            return null;
        }
    }

    private static String lllIllIlllllll(String lllllllllllllllIlIllIIllIlIIllIl, String lllllllllllllllIlIllIIllIlIIllII) {
        String lllllllllllllllIlIllIIllIlIIllIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIIllIlIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIllIIllIlIIlIlI = lllllllllllllllIlIllIIllIlIIllII.toCharArray();
        int lllllllllllllllIlIllIIllIlIIlIIl = lIllllIIlIlI[1];
        char[] charArray = lllllllllllllllIlIllIIllIlIIllIl2.toCharArray();
        int length = charArray.length;
        int i = lIllllIIlIlI[1];
        while (lllIlllIIIIlII(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIlIllIIllIlIIlIlI[lllllllllllllllIlIllIIllIlIIlIIl % lllllllllllllllIlIllIIllIlIIlIlI.length]));
            "".length();
            lllllllllllllllIlIllIIllIlIIlIIl++;
            i++;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lllIlllIIIIIll() {
        lIllllIIlIlI = new int[55];
        lIllllIIlIlI[0] = 11 ^ 27;
        lIllllIIlIlI[1] = (145 ^ 132) & ((37 ^ 48) ^ (-1));
        lIllllIIlIlI[2] = (-((-1337) & 9529)) & (-18625) & 31738;
        lIllllIIlIlI[3] = (-6931) & 8178;
        lIllllIIlIlI[4] = (-12557) & 16287;
        lIllllIIlIlI[5] = 103 ^ 67;
        lIllllIIlIlI[6] = " ".length();
        lIllllIIlIlI[7] = (-65) & 7031;
        lIllllIIlIlI[8] = (-((-1467) & 7615)) & (-24835) & 32719;
        lIllllIIlIlI[9] = (-((-19973) & 28189)) & (-513) & 12285;
        lIllllIIlIlI[10] = "  ".length();
        lIllllIIlIlI[11] = (-16449) & 27769;
        lIllllIIlIlI[12] = (-((-3630) & 32367)) & (-133) & 31695;
        lIllllIIlIlI[13] = (-24578) & 28269;
        lIllllIIlIlI[14] = "   ".length();
        lIllllIIlIlI[15] = (-20931) & 32255;
        lIllllIIlIlI[16] = (-((-6962) & 32639)) & (-4099) & 32623;
        lIllllIIlIlI[17] = (-4097) & 8029;
        lIllllIIlIlI[18] = (146 ^ 166) ^ (137 ^ 185);
        lIllllIIlIlI[19] = (-17538) & 28599;
        lIllllIIlIlI[20] = (-((-19099) & 27295)) & (-16641) & 27647;
        lIllllIIlIlI[21] = (-((-7125) & 31709)) & (-4625) & 32671;
        lIllllIIlIlI[22] = 168 ^ 160;
        lIllllIIlIlI[23] = 143 ^ 138;
        lIllllIIlIlI[24] = (-((-21555) & 21875)) & (-17929) & 32639;
        lIllllIIlIlI[25] = (-((-10503) & 14695)) & (-141) & 7935;
        lIllllIIlIlI[26] = (-12851) & 16378;
        lIllllIIlIlI[27] = (1 ^ 15) ^ (76 ^ 68);
        lIllllIIlIlI[28] = (-(((145 + 82) - 80) + 46)) & (-16393) & 28667;
        lIllllIIlIlI[29] = (-((-18797) & 28015)) & (-20481) & 32751;
        lIllllIIlIlI[30] = (-((-7385) & 24539)) & (-2) & 20459;
        lIllllIIlIlI[31] = (((152 + 86) - 76) + 6) ^ (((55 + 149) - 40) + 11);
        lIllllIIlIlI[32] = (-((-16419) & 22126)) & (-1) & 16255;
        lIllllIIlIlI[33] = (-5387) & 8059;
        lIllllIIlIlI[34] = (-((-19471) & 32463)) & (-16391) & 32759;
        lIllllIIlIlI[35] = (-145) & 15292;
        lIllllIIlIlI[36] = (-16641) & 20428;
        lIllllIIlIlI[37] = (-((-23431) & 31663)) & (-4161) & 15230;
        lIllllIIlIlI[38] = 166 ^ 175;
        lIllllIIlIlI[39] = (-((-29265) & 29657)) & (-16965) & 27646;
        lIllllIIlIlI[40] = (-((-19099) & 24539)) & (-16521) & 24575;
        lIllllIIlIlI[41] = (-((-16466) & 21111)) & (-8449) & 16319;
        lIllllIIlIlI[42] = (((18 + 74) - (-56)) + 40) ^ (((23 + 22) - (-118)) + 19);
        lIllllIIlIlI[43] = (-((-10497) & 27019)) & (-1537) & 30654;
        lIllllIIlIlI[44] = (-4625) & 7807;
        lIllllIIlIlI[45] = (-((-1110) & 13399)) & (-16417) & 32063;
        lIllllIIlIlI[46] = 61 ^ 54;
        lIllllIIlIlI[47] = (-((-1183) & 9887)) & (-16713) & 32639;
        lIllllIIlIlI[48] = (-10247) & 12054;
        lIllllIIlIlI[49] = (-((-11747) & 16375)) & (-8201) & 16383;
        lIllllIIlIlI[50] = 103 ^ 107;
        lIllllIIlIlI[51] = (-((-4645) & 5733)) & (-16667) & 32762;
        lIllllIIlIlI[52] = (-((-7965) & 16159)) & (-4425) & 16351;
        lIllllIIlIlI[53] = (-((-26795) & 32427)) & (-290) & 16191;
        lIllllIIlIlI[54] = 144 ^ 157;
    }

    public int Z() {
        return this.radius;
    }

    private static boolean lllIlllIIIIllI(Object obj) {
        return obj == null;
    }

    public static EnumC0041p[] values() {
        return (EnumC0041p[]) $VALUES.clone();
    }

    static {
        lllIlllIIIIIll();
        lllIlllIIIIIlI();
        FARMING_GUILD = new EnumC0041p(lIllllIIlIIl[lIllllIIlIlI[1]], lIllllIIlIlI[1], lIllllIIlIlI[2], new WorldPoint(lIllllIIlIlI[3], lIllllIIlIlI[4], lIllllIIlIlI[1]), lIllllIIlIlI[5]);
        HOSIDIUS = new EnumC0041p(lIllllIIlIIl[lIllllIIlIlI[6]], lIllllIIlIlI[6], lIllllIIlIlI[7], new WorldPoint(lIllllIIlIlI[8], lIllllIIlIlI[9], lIllllIIlIlI[1]));
        TROLLHEIM = new EnumC0041p(lIllllIIlIIl[lIllllIIlIlI[10]], lIllllIIlIlI[10], lIllllIIlIlI[11], new WorldPoint(lIllllIIlIlI[12], lIllllIIlIlI[13], lIllllIIlIlI[1]));
        WEISS = new EnumC0041p(lIllllIIlIIl[lIllllIIlIlI[14]], lIllllIIlIlI[14], lIllllIIlIlI[15], new WorldPoint(lIllllIIlIlI[16], lIllllIIlIlI[17], lIllllIIlIlI[1]));
        CATHERBY = new EnumC0041p(lIllllIIlIIl[lIllllIIlIlI[18]], lIllllIIlIlI[18], lIllllIIlIlI[19], new WorldPoint(lIllllIIlIlI[20], lIllllIIlIlI[21], lIllllIIlIlI[1]), lIllllIIlIlI[22]);
        MORYTANIA = new EnumC0041p(lIllllIIlIIl[lIllllIIlIlI[23]], lIllllIIlIlI[23], lIllllIIlIlI[24], new WorldPoint(lIllllIIlIlI[25], lIllllIIlIlI[26], lIllllIIlIlI[1]));
        FALADOR = new EnumC0041p(lIllllIIlIIl[lIllllIIlIlI[27]], lIllllIIlIlI[27], lIllllIIlIlI[28], new WorldPoint(lIllllIIlIlI[29], lIllllIIlIlI[30], lIllllIIlIlI[1]));
        ARDOUGNE = new EnumC0041p(lIllllIIlIIl[lIllllIIlIlI[31]], lIllllIIlIlI[31], lIllllIIlIlI[32], new WorldPoint(lIllllIIlIlI[33], lIllllIIlIlI[34], lIllllIIlIlI[1]));
        HARMONY = new EnumC0041p(lIllllIIlIIl[lIllllIIlIlI[22]], lIllllIIlIlI[22], lIllllIIlIlI[35], new WorldPoint(lIllllIIlIlI[36], lIllllIIlIlI[37], lIllllIIlIlI[1]));
        MONASTERY = new EnumC0041p(lIllllIIlIIl[lIllllIIlIlI[38]], lIllllIIlIlI[38], lIllllIIlIlI[39], new WorldPoint(lIllllIIlIlI[40], lIllllIIlIlI[41], lIllllIIlIlI[1]), lIllllIIlIlI[22]);
        CHAMPIONS_GUILD = new EnumC0041p(lIllllIIlIIl[lIllllIIlIlI[42]], lIllllIIlIlI[42], lIllllIIlIlI[43], new WorldPoint(lIllllIIlIlI[44], lIllllIIlIlI[45], lIllllIIlIlI[1]), lIllllIIlIlI[22]);
        GRAPE_VINE_KOUREND = new EnumC0041p(lIllllIIlIIl[lIllllIIlIlI[46]], lIllllIIlIlI[46], lIllllIIlIlI[47], new WorldPoint(lIllllIIlIlI[48], lIllllIIlIlI[49], lIllllIIlIlI[1]), lIllllIIlIlI[0]);
        FOSSIL_ISLAND_UNDERWATER = new EnumC0041p(lIllllIIlIIl[lIllllIIlIlI[50]], lIllllIIlIlI[50], lIllllIIlIlI[51], new WorldPoint(lIllllIIlIlI[52], lIllllIIlIlI[53], lIllllIIlIlI[6]), lIllllIIlIlI[22]);
        EnumC0041p[] enumC0041pArr = new EnumC0041p[lIllllIIlIlI[54]];
        enumC0041pArr[lIllllIIlIlI[1]] = FARMING_GUILD;
        enumC0041pArr[lIllllIIlIlI[6]] = HOSIDIUS;
        enumC0041pArr[lIllllIIlIlI[10]] = TROLLHEIM;
        enumC0041pArr[lIllllIIlIlI[14]] = WEISS;
        enumC0041pArr[lIllllIIlIlI[18]] = CATHERBY;
        enumC0041pArr[lIllllIIlIlI[23]] = MORYTANIA;
        enumC0041pArr[lIllllIIlIlI[27]] = FALADOR;
        enumC0041pArr[lIllllIIlIlI[31]] = ARDOUGNE;
        enumC0041pArr[lIllllIIlIlI[22]] = HARMONY;
        enumC0041pArr[lIllllIIlIlI[38]] = MONASTERY;
        enumC0041pArr[lIllllIIlIlI[42]] = CHAMPIONS_GUILD;
        enumC0041pArr[lIllllIIlIlI[46]] = GRAPE_VINE_KOUREND;
        enumC0041pArr[lIllllIIlIlI[50]] = FOSSIL_ISLAND_UNDERWATER;
        $VALUES = enumC0041pArr;
    }

    public int X() {
        return this.regionID;
    }

    private EnumC0041p(String str, int i, int i2, WorldPoint worldPoint, int i3) {
        this.regionID = i2;
        this.worldPoint = worldPoint;
        this.radius = i3;
    }

    public static EnumC0041p b(int i) {
        EnumC0041p[] values = values();
        int length = values.length;
        int i2 = lIllllIIlIlI[1];
        while (lllIlllIIIIlII(i2, length)) {
            EnumC0041p enumC0041p = values[i2];
            if (lllIlllIIIIlIl(enumC0041p.X(), i)) {
                return enumC0041p;
            }
            i2++;
            "".length();
            if ("  ".length() > "   ".length()) {
                return null;
            }
        }
        return null;
    }

    private static String lllIlllIIIIIII(String lllllllllllllllIlIllIIllIIllIllI, String lllllllllllllllIlIllIIllIIllIlll) {
        try {
            SecretKeySpec lllllllllllllllIlIllIIllIIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIllIIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllllIIlIlI[10], lllllllllllllllIlIllIIllIIlllIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIllIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIIllIIllIlII) {
            lllllllllllllllIlIllIIllIIllIlII.printStackTrace();
            return null;
        }
    }

    public static EnumC0041p[] W() {
        Player local = Players.getLocal();
        if (lllIlllIIIIllI(local)) {
            return values();
        }
        WorldPoint worldLocation = local.getWorldLocation();
        EnumC0041p[] values = values();
        Arrays.sort(values, Comparator.comparingInt(enumC0041p -> {
            return enumC0041p.Y().distanceTo(worldLocation);
        }));
        return values;
    }

    public static EnumC0041p valueOf(String str) {
        return (EnumC0041p) Enum.valueOf(EnumC0041p.class, str);
    }

    private static boolean lllIlllIIIIlII(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIlllIIIIlIl(int i, int i2) {
        return i == i2;
    }

    private static void lllIlllIIIIIlI() {
        lIllllIIlIIl = new String[lIllllIIlIlI[54]];
        lIllllIIlIIl[lIllllIIlIlI[1]] = lllIllIlllllll("DjknOAoGPyoyFgE0MQ==", "HxuuC");
        lIllllIIlIIl[lIllllIIlIlI[6]] = lllIllIlllllll("KiwRICMrNhE=", "bcBig");
        lIllllIIlIIl[lIllllIIlIlI[10]] = lllIllIlllllll("HAAkJxoAFyIm", "HRkkV");
        lIllllIIlIIl[lIllllIIlIlI[14]] = lllIlllIIIIIII("GNH0eVjYXT4=", "rHaUD");
        lIllllIIlIIl[lIllllIIlIlI[18]] = lllIlllIIIIIII("gH+YZmrtqvO14lILClJtdw==", "uSztA");
        lIllllIIlIIl[lIllllIIlIlI[23]] = lllIlllIIIIIII("eTq+IrMOtuaGv23380492w==", "hvEmK");
        lIllllIIlIIl[lIllllIIlIlI[27]] = lllIlllIIIIIII("gB7B0hQ5FxA=", "finJY");
        lIllllIIlIIl[lIllllIIlIlI[31]] = lllIlllIIIIIIl("e591d9OjVpqTD7F7gaDU4g==", "PpaQH");
        lIllllIIlIIl[lIllllIIlIlI[22]] = lllIlllIIIIIIl("wmNq95ARGLY=", "gPxvN");
        lIllllIIlIIl[lIllllIIlIlI[38]] = lllIlllIIIIIIl("pmpYmvdhLaLNKae9B2Ox1A==", "oPMVL");
        lIllllIIlIIl[lIllllIIlIlI[42]] = lllIllIlllllll("ByIiJwkNJS05BgM/KiYd", "DjcjY");
        lIllllIIlIIl[lIllllIIlIlI[46]] = lllIlllIIIIIIl("cCQvj8SnzOgPCA3ToBiWgEUhj435FQ7h", "kxWdy");
        lIllllIIlIIl[lIllllIIlIlI[50]] = lllIlllIIIIIIl("+xPOAEDlDryj9gOYrYVmXUnlYsOycZMntsFph+LkNK0=", "UEfRX");
    }

    public WorldPoint Y() {
        return this.worldPoint;
    }
}
