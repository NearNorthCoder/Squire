package g.r.r.p000.t.q.i.u.o.e.s;

import java.awt.image.BufferedImage;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.game.ItemManager;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: g.r.r.-.t.q.i.u.o.e.s.d  reason: invalid package */
/* loaded from: squire-gotr-0.4.1.jar:g/r/r/-/t/q/i/u/o/e/s/d.class */
public final class d {
    public static final /* synthetic */ d WATER;
    public static final /* synthetic */ d LAW;
    public static final /* synthetic */ d NATURE;
    public static final /* synthetic */ d AIR;
    public static final /* synthetic */ d CHAOS;
    private final /* synthetic */ int runeId;
    private final /* synthetic */ EnumC0001b cellType;
    public static final /* synthetic */ d EARTH;
    public static final /* synthetic */ d FIRE;
    private final /* synthetic */ int talismanId;
    private static final /* synthetic */ d[] $VALUES;
    public static final /* synthetic */ d MIND;
    private final /* synthetic */ WorldPoint location;
    public static final /* synthetic */ d DEATH;
    private final /* synthetic */ int levelRequired;
    public static final /* synthetic */ d BLOOD;
    private static /* synthetic */ String[] llIIlllIIlII;
    public static final /* synthetic */ d COSMIC;
    private final /* synthetic */ boolean isCatalytic;
    private static /* synthetic */ int[] llIIlllIIlIl;
    private final /* synthetic */ int spriteId;
    public static final /* synthetic */ d BODY;

    private static void lllllllIIlIIII() {
        llIIlllIIlII = new String[llIIlllIIlIl[75]];
        llIIlllIIlII[llIIlllIIlIl[0]] = lllllllIIIllIl("/D57XyKa9xKJ/1qZ141a1Q==", "CkUPg");
        llIIlllIIlII[llIIlllIIlIl[1]] = lllllllIIIlllI("T9jQdXSBl8w=", "RlITH");
        llIIlllIIlII[llIIlllIIlIl[7]] = lllllllIIIllIl("85B3ji3699U=", "rnuIW");
        llIIlllIIlII[llIIlllIIlIl[12]] = lllllllIIIlllI("D3BoxKL02Rc=", "KLEaF");
        llIIlllIIlII[llIIlllIIlIl[19]] = lllllllIIIllIl("rMHpCLW8izI=", "FbozK");
        llIIlllIIlII[llIIlllIIlIl[13]] = lllllllIIIlllI("BEsiuHIh2BI=", "TUEDM");
        llIIlllIIlII[llIIlllIIlIl[30]] = lllllllIIIlllI("XsIeXYfMZ2o=", "jkQFx");
        llIIlllIIlII[llIIlllIIlIl[37]] = lllllllIIIllIl("xHHFM1/Awpw=", "FWFYF");
        llIIlllIIlII[llIIlllIIlIl[43]] = lllllllIIIlllI("JOXvQgZyiMg=", "pATcs");
        llIIlllIIlII[llIIlllIIlIl[20]] = lllllllIIIllll("Pgc4HBk1", "pFlIK");
        llIIlllIIlII[llIIlllIIlIl[56]] = lllllllIIIllll("Gy8C", "WnUeJ");
        llIIlllIIlII[llIIlllIIlIl[63]] = lllllllIIIllIl("efsY8p4o9vM=", "uayEg");
        llIIlllIIlII[llIIlllIIlIl[69]] = lllllllIIIllll("GyEVKBw=", "YmZgX");
    }

    public String U() {
        String str = super.toString();
        return str.charAt(llIIlllIIlIl[0]) + str.substring(llIIlllIIlIl[1]).toLowerCase();
    }

    public boolean Z() {
        return this.isCatalytic;
    }

    public EnumC0001b aa() {
        return this.cellType;
    }

    public BufferedImage b(ItemManager itemManager) {
        return itemManager.getImage(this.talismanId);
    }

    public String T() {
        String str = llIIlllIIlII[llIIlllIIlIl[0]];
        Object[] objArr = new Object[llIIlllIIlIl[1]];
        objArr[llIIlllIIlIl[0]] = U();
        return String.format(str, objArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public int W() {
        return this.runeId;
    }

    private static boolean lllllllIIlIIlI(int i, int i2) {
        return i < i2;
    }

    public int Y() {
        return this.spriteId;
    }

    public int X() {
        return this.talismanId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v8, types: [boolean] */
    static {
        lllllllIIlIIIl();
        lllllllIIlIIII();
        AIR = new d(llIIlllIIlII[llIIlllIIlIl[1]], llIIlllIIlIl[0], llIIlllIIlIl[1], llIIlllIIlIl[2], llIIlllIIlIl[3], llIIlllIIlIl[4], llIIlllIIlIl[0], EnumC0001b.WEAK, new WorldPoint(llIIlllIIlIl[5], llIIlllIIlIl[6], llIIlllIIlIl[0]));
        MIND = new d(llIIlllIIlII[llIIlllIIlIl[7]], llIIlllIIlIl[1], llIIlllIIlIl[7], llIIlllIIlIl[8], llIIlllIIlIl[9], llIIlllIIlIl[10], llIIlllIIlIl[1], EnumC0001b.WEAK, new WorldPoint(llIIlllIIlIl[11], llIIlllIIlIl[6], llIIlllIIlIl[0]));
        WATER = new d(llIIlllIIlII[llIIlllIIlIl[12]], llIIlllIIlIl[7], llIIlllIIlIl[13], llIIlllIIlIl[14], llIIlllIIlIl[15], llIIlllIIlIl[16], llIIlllIIlIl[0], EnumC0001b.MEDIUM, new WorldPoint(llIIlllIIlIl[17], llIIlllIIlIl[18], llIIlllIIlIl[0]));
        EARTH = new d(llIIlllIIlII[llIIlllIIlIl[19]], llIIlllIIlIl[12], llIIlllIIlIl[20], llIIlllIIlIl[21], llIIlllIIlIl[22], llIIlllIIlIl[23], llIIlllIIlIl[0], EnumC0001b.STRONG, new WorldPoint(llIIlllIIlIl[17], llIIlllIIlIl[24], llIIlllIIlIl[0]));
        FIRE = new d(llIIlllIIlII[llIIlllIIlIl[13]], llIIlllIIlIl[19], llIIlllIIlIl[25], llIIlllIIlIl[26], llIIlllIIlIl[27], llIIlllIIlIl[28], llIIlllIIlIl[0], EnumC0001b.OVERCHARGED, new WorldPoint(llIIlllIIlIl[5], llIIlllIIlIl[29], llIIlllIIlIl[0]));
        BODY = new d(llIIlllIIlII[llIIlllIIlIl[30]], llIIlllIIlIl[13], llIIlllIIlIl[31], llIIlllIIlIl[32], llIIlllIIlIl[33], llIIlllIIlIl[34], llIIlllIIlIl[1], EnumC0001b.WEAK, new WorldPoint(llIIlllIIlIl[35], llIIlllIIlIl[36], llIIlllIIlIl[0]));
        COSMIC = new d(llIIlllIIlII[llIIlllIIlIl[37]], llIIlllIIlIl[30], llIIlllIIlIl[38], llIIlllIIlIl[39], llIIlllIIlIl[40], llIIlllIIlIl[41], llIIlllIIlIl[1], EnumC0001b.MEDIUM, new WorldPoint(llIIlllIIlIl[42], llIIlllIIlIl[36], llIIlllIIlIl[0]));
        CHAOS = new d(llIIlllIIlII[llIIlllIIlIl[43]], llIIlllIIlIl[37], llIIlllIIlIl[44], llIIlllIIlIl[45], llIIlllIIlIl[46], llIIlllIIlIl[47], llIIlllIIlIl[1], EnumC0001b.MEDIUM, new WorldPoint(llIIlllIIlIl[48], llIIlllIIlIl[49], llIIlllIIlIl[0]));
        NATURE = new d(llIIlllIIlII[llIIlllIIlIl[20]], llIIlllIIlIl[43], llIIlllIIlIl[50], llIIlllIIlIl[51], llIIlllIIlIl[52], llIIlllIIlIl[53], llIIlllIIlIl[1], EnumC0001b.STRONG, new WorldPoint(llIIlllIIlIl[54], llIIlllIIlIl[55], llIIlllIIlIl[0]));
        LAW = new d(llIIlllIIlII[llIIlllIIlIl[56]], llIIlllIIlIl[20], llIIlllIIlIl[57], llIIlllIIlIl[58], llIIlllIIlIl[59], llIIlllIIlIl[60], llIIlllIIlIl[1], EnumC0001b.STRONG, new WorldPoint(llIIlllIIlIl[61], llIIlllIIlIl[62], llIIlllIIlIl[0]));
        DEATH = new d(llIIlllIIlII[llIIlllIIlIl[63]], llIIlllIIlIl[56], llIIlllIIlIl[64], llIIlllIIlIl[65], llIIlllIIlIl[66], llIIlllIIlIl[67], llIIlllIIlIl[1], EnumC0001b.OVERCHARGED, new WorldPoint(llIIlllIIlIl[48], llIIlllIIlIl[68], llIIlllIIlIl[0]));
        BLOOD = new d(llIIlllIIlII[llIIlllIIlIl[69]], llIIlllIIlIl[63], llIIlllIIlIl[70], llIIlllIIlIl[71], llIIlllIIlIl[72], llIIlllIIlIl[73], llIIlllIIlIl[1], EnumC0001b.OVERCHARGED, new WorldPoint(llIIlllIIlIl[74], llIIlllIIlIl[29], llIIlllIIlIl[0]));
        d[] dVarArr = new d[llIIlllIIlIl[69]];
        dVarArr[llIIlllIIlIl[0]] = AIR;
        dVarArr[llIIlllIIlIl[1]] = MIND;
        dVarArr[llIIlllIIlIl[7]] = WATER;
        dVarArr[llIIlllIIlIl[12]] = EARTH;
        dVarArr[llIIlllIIlIl[19]] = FIRE;
        dVarArr[llIIlllIIlIl[13]] = BODY;
        dVarArr[llIIlllIIlIl[30]] = COSMIC;
        dVarArr[llIIlllIIlIl[37]] = CHAOS;
        dVarArr[llIIlllIIlIl[43]] = NATURE;
        dVarArr[llIIlllIIlIl[20]] = LAW;
        dVarArr[llIIlllIIlIl[56]] = DEATH;
        dVarArr[llIIlllIIlIl[63]] = BLOOD;
        $VALUES = dVarArr;
    }

    private static String lllllllIIIlllI(String lllllllllllllllIlIIlIlllllllIllI, String lllllllllllllllIlIIlIlllllllIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlllllllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlllIIlIl[7], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlllllllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIlllllllIlll) {
            lllllllllllllllIlIIlIlllllllIlll.printStackTrace();
            return null;
        }
    }

    public WorldPoint ab() {
        return this.location;
    }

    private static void lllllllIIlIIIl() {
        llIIlllIIlIl = new int[76];
        llIIlllIIlIl[0] = "   ".length() & ("   ".length() ^ (-" ".length()));
        llIIlllIIlIl[1] = " ".length();
        llIIlllIIlIl[2] = (-((-1055) & 15775)) & (-1) & 15276;
        llIIlllIIlIl[3] = (-5353) & 32239;
        llIIlllIIlIl[4] = (-2075) & 6427;
        llIIlllIIlIl[5] = (-((-1577) & 14333)) & (-11) & 16383;
        llIIlllIIlIl[6] = (-((-599) & 21247)) & (-2563) & 32703;
        llIIlllIIlIl[7] = "  ".length();
        llIIlllIIlIl[8] = (-31169) & 31726;
        llIIlllIIlIl[9] = (-((-15) & 5823)) & (-69) & 32767;
        llIIlllIIlIl[10] = (-((-2185) & 20173)) & (-10369) & 32710;
        llIIlllIIlIl[11] = (-((-89) & 12795)) & (-16449) & 32767;
        llIIlllIIlIl[12] = "   ".length();
        llIIlllIIlIl[13] = (((55 + 136) - 175) + 157) ^ (((92 + 143) - 92) + 25);
        llIIlllIIlIl[14] = (-12357) & 12911;
        llIIlllIIlIl[15] = (-5362) & 32249;
        llIIlllIIlIl[16] = (-((-2579) & 27359)) & (-3633) & 32767;
        llIIlllIIlIl[17] = (-((-355) & 20987)) & (-1) & 24255;
        llIIlllIIlIl[18] = (-((-14625) & 31585)) & (-2049) & 28507;
        llIIlllIIlIl[19] = (126 ^ 61) ^ (5 ^ 66);
        llIIlllIIlIl[20] = 36 ^ 45;
        llIIlllIIlIl[21] = (-31123) & 31679;
        llIIlllIIlIl[22] = (-((-24665) & 28895)) & (-97) & 31215;
        llIIlllIIlIl[23] = (-18116) & 22471;
        llIIlllIIlIl[24] = (-6795) & 16298;
        llIIlllIIlIl[25] = (47 ^ 103) ^ (193 ^ 135);
        llIIlllIIlIl[26] = (-28118) & 28671;
        llIIlllIIlIl[27] = (-((-817) & 4981)) & (-1074) & 32127;
        llIIlllIIlIl[28] = (-8883) & 13239;
        llIIlllIIlIl[29] = (-((-6405) & 22877)) & (-4097) & 30078;
        llIIlllIIlIl[30] = 47 ^ 41;
        llIIlllIIlIl[31] = 176 ^ 164;
        llIIlllIIlIl[32] = (-((-837) & 24533)) & (-321) & 24575;
        llIIlllIIlIl[33] = (-1681) & 28575;
        llIIlllIIlIl[34] = (-((-8966) & 28639)) & (-8705) & 32735;
        llIIlllIIlIl[35] = (-7) & 3614;
        llIIlllIIlIl[36] = (-((-4467) & 20979)) & (-2153) & 28159;
        llIIlllIIlIl[37] = 17 ^ 22;
        llIIlllIIlIl[38] = 20 ^ 15;
        llIIlllIIlIl[39] = (-30083) & 30646;
        llIIlllIIlIl[40] = (-((-6205) & 7935)) & (-4102) & 32727;
        llIIlllIIlIl[41] = (-((-24581) & 28285)) & (-16385) & 24447;
        llIIlllIIlIl[42] = (-395) & 4015;
        llIIlllIIlIl[43] = (127 ^ 54) ^ (84 ^ 21);
        llIIlllIIlIl[44] = 136 ^ 171;
        llIIlllIIlIl[45] = (-17549) & 18110;
        llIIlllIIlIl[46] = (-((-4105) & 4857)) & (-3) & 27646;
        llIIlllIIlIl[47] = (-((-12711) & 29623)) & (-10275) & 31546;
        llIIlllIIlIl[48] = (-29091) & 32695;
        llIIlllIIlIl[49] = (-18628) & 28127;
        llIIlllIIlIl[50] = (206 ^ 170) ^ (196 ^ 140);
        llIIlllIIlIl[51] = (-21963) & 22523;
        llIIlllIIlIl[52] = (-((-10537) & 15851)) & (-1) & 32211;
        llIIlllIIlIl[53] = (-((-6425) & 32255)) & (-2577) & 32767;
        llIIlllIIlIl[54] = (-24708) & 28327;
        llIIlllIIlIl[55] = (-((-16805) & 23551)) & (-16513) & 32767;
        llIIlllIIlIl[56] = (((140 + 94) - 194) + 103) ^ (((13 + 22) - (-32)) + 66);
        llIIlllIIlIl[57] = " ".length() ^ (177 ^ 134);
        llIIlllIIlIl[58] = (-((-6499) & 31079)) & (-2121) & 27263;
        llIIlllIIlIl[59] = (-4166) & 31063;
        llIIlllIIlIl[60] = (-((-23059) & 32371)) & (-2181) & 15854;
        llIIlllIIlIl[61] = (-((-25) & 4541)) & (-16449) & 24573;
        llIIlllIIlIl[62] = (-2691) & 12198;
        llIIlllIIlIl[63] = 123 ^ 112;
        llIIlllIIlIl[64] = 108 ^ 45;
        llIIlllIIlIl[65] = (-1349) & 1908;
        llIIlllIIlIl[66] = (-5267) & 32159;
        llIIlllIIlIl[67] = (-18517) & 22879;
        llIIlllIIlIl[68] = (-22662) & 32167;
        llIIlllIIlIl[69] = 128 ^ 140;
        llIIlllIIlIl[70] = 87 ^ 26;
        llIIlllIIlIl[71] = (-((-9267) & 32059)) & (-65) & 23421;
        llIIlllIIlIl[72] = (-((-24869) & 30645)) & (-34) & 32703;
        llIIlllIIlIl[73] = (-((-8967) & 26615)) & (-2052) & 24063;
        llIIlllIIlIl[74] = (-((-3621) & 12263)) & (-4097) & 16350;
        llIIlllIIlIl[75] = (177 ^ 195) ^ (((36 + 78) - 41) + 54);
    }

    public int V() {
        return this.levelRequired;
    }

    private d(String str, int i, int i2, int i3, int i4, int i5, boolean z, EnumC0001b enumC0001b, WorldPoint worldPoint) {
        this.levelRequired = i2;
        this.runeId = i3;
        this.talismanId = i4;
        this.spriteId = i5;
        this.isCatalytic = z;
        this.cellType = enumC0001b;
        this.location = worldPoint;
    }

    private static String lllllllIIIllIl(String lllllllllllllllIlIIllIIIIIIllIll, String lllllllllllllllIlIIllIIIIIIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIIllIIIIIIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIIIIIllIlI.getBytes(StandardCharsets.UTF_8)), llIIlllIIlIl[43]), "DES");
            Cipher lllllllllllllllIlIIllIIIIIIlllIl = Cipher.getInstance("DES");
            lllllllllllllllIlIIllIIIIIIlllIl.init(llIIlllIIlIl[7], lllllllllllllllIlIIllIIIIIIllllI);
            return new String(lllllllllllllllIlIIllIIIIIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIIIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllIIIIIIlllII) {
            lllllllllllllllIlIIllIIIIIIlllII.printStackTrace();
            return null;
        }
    }

    public BufferedImage a(ItemManager itemManager) {
        return itemManager.getImage(this.runeId);
    }

    private static String lllllllIIIllll(String lllllllllllllllIlIIllIIIIIIIIllI, String lllllllllllllllIlIIllIIIIIIIlIlI) {
        String lllllllllllllllIlIIllIIIIIIIIllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIIIIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIllIIIIIIIlIIl = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIllIIIIIIIlIlI.toCharArray();
        int lllllllllllllllIlIIllIIIIIIIIlll = llIIlllIIlIl[0];
        char[] charArray2 = lllllllllllllllIlIIllIIIIIIIIllI2.toCharArray();
        int length = charArray2.length;
        int i = llIIlllIIlIl[0];
        while (lllllllIIlIIlI(i, length)) {
            lllllllllllllllIlIIllIIIIIIIlIIl.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIIllIIIIIIIIlll % charArray.length]));
            "".length();
            lllllllllllllllIlIIllIIIIIIIIlll++;
            i++;
            "".length();
            if (((68 ^ 31) ^ (114 ^ 45)) == (((92 ^ 53) ^ (9 ^ 43)) & (((((93 + 91) - 180) + 250) ^ (((51 + 176) - 137) + 91)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIllIIIIIIIlIIl);
    }
}
