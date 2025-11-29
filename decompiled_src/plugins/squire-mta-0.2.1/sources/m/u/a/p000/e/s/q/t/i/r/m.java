package m.u.a.p000.e.s.q.t.i.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.LocalPoint;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m.u.a.-.e.s.q.t.i.r.m  reason: invalid package */
/* loaded from: squire-mta-0.2.1.jar:m/u/a/-/e/s/q/t/i/r/m.class */
public final class m {
    private static /* synthetic */ String[] lllIlIIlllIl;
    public static final /* synthetic */ m MAZE_7;
    public static final /* synthetic */ m MAZE_4;
    public static final /* synthetic */ m MAZE_1;
    public static final /* synthetic */ m MAZE_6;
    private final /* synthetic */ int walls;
    public static final /* synthetic */ m MAZE_2;
    private static final /* synthetic */ m[] $VALUES;
    private static /* synthetic */ int[] lllIlIIllllI;
    public static final /* synthetic */ m MAZE_5;
    public static final /* synthetic */ m MAZE_9;
    public static final /* synthetic */ m MAZE_3;
    public static final /* synthetic */ m MAZE_10;
    public static final /* synthetic */ m MAZE_8;
    private final /* synthetic */ LocalPoint start;

    public static m b(int i) {
        m[] values = values();
        int length = values.length;
        int i2 = lllIlIIllllI[0];
        while (lIIIlIllllIIIlI(i2, length)) {
            m mVar = values[i2];
            if (lIIIlIllllIIIll(mVar.C(), i)) {
                return mVar;
            }
            i2++;
            "".length();
            if ("   ".length() <= "  ".length()) {
                return null;
            }
        }
        return null;
    }

    private static String lIIIlIlllIlllIl(String lllllllllllllllIIllIllIlIllllIII, String lllllllllllllllIIllIllIlIlllIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIlIlllIlll.getBytes(StandardCharsets.UTF_8)), lllIlIIllllI[30]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIlIIllllI[7], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIlIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIllIlIllllIIl) {
            lllllllllllllllIIllIllIlIllllIIl.printStackTrace();
            return null;
        }
    }

    private m(String str, int i, int i2, LocalPoint localPoint) {
        this.walls = i2;
        this.start = localPoint;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    private static String lIIIlIlllIllllI(String lllllllllllllllIIllIllIllIIlllIl, String lllllllllllllllIIllIllIllIIlllII) {
        try {
            SecretKeySpec lllllllllllllllIIllIllIllIlIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIllIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIllIllIIlllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIllIllIIlllll.init(lllIlIIllllI[7], lllllllllllllllIIllIllIllIlIIIII);
            return new String(lllllllllllllllIIllIllIllIIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIllIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIllIllIIllllI) {
            lllllllllllllllIIllIllIllIIllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIllllIIIlI(int i, int i2) {
        return i < i2;
    }

    private static void lIIIlIllllIIIIl() {
        lllIlIIllllI = new int[36];
        lllIlIIllllI[0] = (85 ^ 123) & ((144 ^ 190) ^ (-1));
        lllIlIIllllI[1] = (76 ^ 104) ^ (9 ^ 73);
        lllIlIIllllI[2] = (-9255) & 16102;
        lllIlIIllllI[3] = (-4252) & 8155;
        lllIlIIllllI[4] = " ".length();
        lllIlIIllllI[5] = (((74 + 9) - 42) + 176) ^ (((36 + 141) - 157) + 145);
        lllIlIIllllI[6] = (-3085) & 8012;
        lllIlIIllllI[7] = "  ".length();
        lllIlIIllllI[8] = (((56 ^ 22) + (44 ^ 78)) - (90 ^ 115)) + (161 ^ 187);
        lllIlIIllllI[9] = (-((-29061) & 30126)) & (-24583) & 32751;
        lllIlIIllllI[10] = (-((-5121) & 30527)) & (-2050) & 32767;
        lllIlIIllllI[11] = "   ".length();
        lllIlIIllllI[12] = (123 ^ 75) ^ (123 ^ 126);
        lllIlIIllllI[13] = (-16916) & 23123;
        lllIlIIllllI[14] = (219 ^ 183) ^ (119 ^ 31);
        lllIlIIllllI[15] = 29 ^ 113;
        lllIlIIllllI[16] = (-((-12492) & 31967)) & (-33) & 24563;
        lllIlIIllllI[17] = (-2873) & 8056;
        lllIlIIllllI[18] = 67 ^ 70;
        lllIlIIllllI[19] = 123 ^ 2;
        lllIlIIllllI[20] = (-((-67) & 12638)) & (-161) & 16379;
        lllIlIIllllI[21] = (-((-21916) & 30655)) & (-18457) & 32635;
        lllIlIIllllI[22] = (((3 + 132) - 119) + 164) ^ (((139 + 118) - 240) + 161);
        lllIlIIllllI[23] = (191 ^ 185) ^ (248 ^ 185);
        lllIlIIllllI[24] = (-16435) & 22514;
        lllIlIIllllI[25] = (-((-5641) & 32445)) & (-2) & 32501;
        lllIlIIllllI[26] = 1 ^ 6;
        lllIlIIllllI[27] = 75 ^ 41;
        lllIlIIllllI[28] = (-((-3907) & 12159)) & (-4) & 14207;
        lllIlIIllllI[29] = (-8249) & 15608;
        lllIlIIllllI[30] = 182 ^ 190;
        lllIlIIllllI[31] = 148 ^ 195;
        lllIlIIllllI[32] = (90 ^ 122) ^ (43 ^ 2);
        lllIlIIllllI[33] = 13 ^ 86;
        lllIlIIllllI[34] = (-((-16945) & 23230)) & (-16387) & 31695;
        lllIlIIllllI[35] = (((112 + 14) - 48) + 97) ^ (((76 + 66) - 139) + 162);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }

    public LocalPoint D() {
        return this.start;
    }

    static {
        lIIIlIllllIIIIl();
        lIIIlIllllIIIII();
        MAZE_1 = new m(lllIlIIlllIl[lllIlIIllllI[0]], lllIlIIllllI[0], lllIlIIllllI[1], new LocalPoint(lllIlIIllllI[2], lllIlIIllllI[3]));
        MAZE_2 = new m(lllIlIIlllIl[lllIlIIllllI[4]], lllIlIIllllI[4], lllIlIIllllI[5], new LocalPoint(lllIlIIllllI[6], lllIlIIllllI[2]));
        MAZE_3 = new m(lllIlIIlllIl[lllIlIIllllI[7]], lllIlIIllllI[7], lllIlIIllllI[8], new LocalPoint(lllIlIIllllI[9], lllIlIIllllI[10]));
        MAZE_4 = new m(lllIlIIlllIl[lllIlIIllllI[11]], lllIlIIllllI[11], lllIlIIllllI[12], new LocalPoint(lllIlIIllllI[13], lllIlIIllllI[6]));
        MAZE_5 = new m(lllIlIIlllIl[lllIlIIllllI[14]], lllIlIIllllI[14], lllIlIIllllI[15], new LocalPoint(lllIlIIllllI[16], lllIlIIllllI[17]));
        MAZE_6 = new m(lllIlIIlllIl[lllIlIIllllI[18]], lllIlIIllllI[18], lllIlIIllllI[19], new LocalPoint(lllIlIIllllI[20], lllIlIIllllI[21]));
        MAZE_7 = new m(lllIlIIlllIl[lllIlIIllllI[22]], lllIlIIllllI[22], lllIlIIllllI[23], new LocalPoint(lllIlIIllllI[24], lllIlIIllllI[25]));
        MAZE_8 = new m(lllIlIIlllIl[lllIlIIllllI[26]], lllIlIIllllI[26], lllIlIIllllI[27], new LocalPoint(lllIlIIllllI[28], lllIlIIllllI[29]));
        MAZE_9 = new m(lllIlIIlllIl[lllIlIIllllI[30]], lllIlIIllllI[30], lllIlIIllllI[31], new LocalPoint(lllIlIIllllI[17], lllIlIIllllI[13]));
        MAZE_10 = new m(lllIlIIlllIl[lllIlIIllllI[32]], lllIlIIllllI[32], lllIlIIllllI[33], new LocalPoint(lllIlIIllllI[21], lllIlIIllllI[34]));
        m[] mVarArr = new m[lllIlIIllllI[35]];
        mVarArr[lllIlIIllllI[0]] = MAZE_1;
        mVarArr[lllIlIIllllI[4]] = MAZE_2;
        mVarArr[lllIlIIllllI[7]] = MAZE_3;
        mVarArr[lllIlIIllllI[11]] = MAZE_4;
        mVarArr[lllIlIIllllI[14]] = MAZE_5;
        mVarArr[lllIlIIllllI[18]] = MAZE_6;
        mVarArr[lllIlIIllllI[22]] = MAZE_7;
        mVarArr[lllIlIIllllI[26]] = MAZE_8;
        mVarArr[lllIlIIllllI[30]] = MAZE_9;
        mVarArr[lllIlIIllllI[32]] = MAZE_10;
        $VALUES = mVarArr;
    }

    public int C() {
        return this.walls;
    }

    private static String lIIIlIlllIlllll(String lllllllllllllllIIllIllIllIIIllIl, String lllllllllllllllIIllIllIllIIIllII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIllIllIllIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIllIllIIIlIll = new StringBuilder();
        char[] lllllllllllllllIIllIllIllIIIlIlI = lllllllllllllllIIllIllIllIIIllII.toCharArray();
        int lllllllllllllllIIllIllIllIIIlIIl = lllIlIIllllI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIlIIllllI[0];
        while (lIIIlIllllIIIlI(i, length)) {
            char lllllllllllllllIIllIllIllIIIlllI = charArray[i];
            lllllllllllllllIIllIllIllIIIlIll.append((char) (lllllllllllllllIIllIllIllIIIlllI ^ lllllllllllllllIIllIllIllIIIlIlI[lllllllllllllllIIllIllIllIIIlIIl % lllllllllllllllIIllIllIllIIIlIlI.length]));
            "".length();
            lllllllllllllllIIllIllIllIIIlIIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIllIllIIIlIll);
    }

    private static void lIIIlIllllIIIII() {
        lllIlIIlllIl = new String[lllIlIIllllI[35]];
        lllIlIIlllIl[lllIlIIllllI[0]] = lIIIlIlllIlllIl("UTM5L7anF/E=", "hZiir");
        lllIlIIlllIl[lllIlIIllllI[4]] = lIIIlIlllIllllI("/y/Bwh6jjFM=", "tdhcv");
        lllIlIIlllIl[lllIlIIllllI[7]] = lIIIlIlllIlllll("KQ05AhhX", "dLcGG");
        lllIlIIlllIl[lllIlIIllllI[11]] = lIIIlIlllIlllll("CAgWNw9x", "EILrP");
        lllIlIIlllIl[lllIlIIllllI[14]] = lIIIlIlllIllllI("NGAFG7DZ7b4=", "RsNpi");
        lllIlIIlllIl[lllIlIIllllI[18]] = lIIIlIlllIlllll("IggRETxZ", "oIKTc");
        lllIlIIlllIl[lllIlIIllllI[22]] = lIIIlIlllIllllI("BndmRh7nrCs=", "mNpIR");
        lllIlIIlllIl[lllIlIIllllI[26]] = lIIIlIlllIlllll("LgYdMjxb", "cGGwc");
        lllIlIIlllIl[lllIlIIllllI[30]] = lIIIlIlllIlllIl("l+oOWycyAXA=", "WTSuI");
        lllIlIIlllIl[lllIlIIllllI[32]] = lIIIlIlllIllllI("KLx45rpV+dY=", "Tmgvg");
    }

    private static boolean lIIIlIllllIIIll(int i, int i2) {
        return i == i2;
    }
}
