package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bY  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bY.class */
public final class bY {
    private static /* synthetic */ String[] lllIIlIII;
    public static final /* synthetic */ bY GLORY;
    private final /* synthetic */ String action;
    private static /* synthetic */ int[] lllIIlIIl;
    private static final /* synthetic */ bY[] $VALUES;
    private final /* synthetic */ boolean equipment;
    public static final /* synthetic */ bY RING_OF_DUELING;
    public static final /* synthetic */ bY WEALTH;
    private final /* synthetic */ Predicate<Item> predicate;
    public static final /* synthetic */ bY ROYAL_SEED_POD;
    private final /* synthetic */ int wildy;

    public boolean db() {
        return this.equipment;
    }

    public int da() {
        return this.wildy;
    }

    public String cZ() {
        return this.action;
    }

    private bY(String str, int i2, Predicate predicate, String str2, int i3, boolean z) {
        this.predicate = predicate;
        this.action = str2;
        this.wildy = i3;
        this.equipment = z;
    }

    private static void llIIIIlllII() {
        lllIIlIIl = new int[15];
        lllIIlIIl[0] = (-786) & 20349;
        lllIIlIIl[1] = " ".length();
        lllIIlIIl[2] = ((50 ^ 83) ^ (234 ^ 168)) & (((124 ^ 114) ^ (6 ^ 43)) ^ (-" ".length()));
        lllIIlIIl[3] = "  ".length();
        lllIIlIIl[4] = "   ".length();
        lllIIlIIl[5] = (89 ^ 19) ^ (243 ^ 189);
        lllIIlIIl[6] = 222 ^ 192;
        lllIIlIIl[7] = (14 ^ 62) ^ (162 ^ 151);
        lllIIlIIl[8] = (((118 + 114) - 100) + 35) ^ (((77 + 103) - 139) + 120);
        lllIIlIIl[9] = 144 ^ 151;
        lllIIlIIl[10] = 157 ^ 149;
        lllIIlIIl[11] = (35 ^ 70) ^ (8 ^ 121);
        lllIIlIIl[12] = (((22 + 54) - (-52)) + 13) ^ (((92 + 117) - 123) + 46);
        lllIIlIIl[13] = (202 ^ 129) ^ (104 ^ 41);
        lllIIlIIl[14] = (((133 + 76) - 68) + 42) ^ (((111 + 131) - 241) + 187);
    }

    private static boolean llIIIIllllI(int i2, int i3) {
        return i2 < i3;
    }

    public static bY valueOf(String str) {
        return (bY) Enum.valueOf(bY.class, str);
    }

    public static bY[] values() {
        return (bY[]) $VALUES.clone();
    }

    private static String llIIIIllIIl(String lIlIllIIlIIlllI, String lIlIllIIlIIllIl) {
        try {
            SecretKeySpec lIlIllIIlIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIllIIlIIllIl.getBytes(StandardCharsets.UTF_8)), lllIIlIIl[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIlIIl[3], lIlIllIIlIlIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIllIIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIllIIlIIllll) {
            lIlIllIIlIIllll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v7, types: [boolean] */
    static {
        llIIIIlllII();
        llIIIIllIll();
        GLORY = new bY(lllIIlIII[lllIIlIIl[4]], lllIIlIIl[2], item -> {
            String[] strArr = new String[lllIIlIIl[1]];
            strArr[lllIIlIIl[2]] = lllIIlIII[lllIIlIIl[3]];
            return item.hasAction(strArr);
        }, lllIIlIII[lllIIlIIl[5]], lllIIlIIl[6], lllIIlIIl[1]);
        WEALTH = new bY(lllIIlIII[lllIIlIIl[7]], lllIIlIIl[1], item2 -> {
            String[] strArr = new String[lllIIlIIl[1]];
            strArr[lllIIlIIl[2]] = lllIIlIII[lllIIlIIl[1]];
            return item2.hasAction(strArr);
        }, lllIIlIII[lllIIlIIl[8]], lllIIlIIl[6], lllIIlIIl[1]);
        RING_OF_DUELING = new bY(lllIIlIII[lllIIlIIl[9]], lllIIlIIl[3], item3 -> {
            return item3.getName().toLowerCase().contains(lllIIlIII[lllIIlIIl[2]]);
        }, lllIIlIII[lllIIlIIl[10]], lllIIlIIl[11], lllIIlIIl[1]);
        ROYAL_SEED_POD = new bY(lllIIlIII[lllIIlIIl[12]], lllIIlIIl[4], item4 -> {
            if (llIIIIlllIl(item4.getId(), lllIIlIIl[0])) {
                ?? r0 = lllIIlIIl[1];
                "".length();
                return " ".length() >= ("   ".length() ^ (68 ^ 67)) ? ((142 ^ 193) ^ (45 ^ 91)) & (((193 ^ 131) ^ (32 ^ 91)) ^ (-" ".length())) : r0;
            }
            return lllIIlIIl[2];
        }, lllIIlIII[lllIIlIIl[13]], lllIIlIIl[6], lllIIlIIl[2]);
        bY[] bYVarArr = new bY[lllIIlIIl[5]];
        bYVarArr[lllIIlIIl[2]] = GLORY;
        bYVarArr[lllIIlIIl[1]] = WEALTH;
        bYVarArr[lllIIlIIl[3]] = RING_OF_DUELING;
        bYVarArr[lllIIlIIl[4]] = ROYAL_SEED_POD;
        $VALUES = bYVarArr;
    }

    private static String llIIIIllIII(String lIlIllIIIlIlIIl, String lIlIllIIIlIlIII) {
        try {
            SecretKeySpec lIlIllIIIlIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIllIIIlIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIllIIIlIlIll = Cipher.getInstance("Blowfish");
            lIlIllIIIlIlIll.init(lllIIlIIl[3], lIlIllIIIlIllII);
            return new String(lIlIllIIIlIlIll.doFinal(Base64.getDecoder().decode(lIlIllIIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIllIIIlIIlIl) {
            lIlIllIIIlIIlIl.printStackTrace();
            return null;
        }
    }

    public Predicate<Item> br() {
        return this.predicate;
    }

    private static void llIIIIllIll() {
        lllIIlIII = new String[lllIIlIIl[14]];
        lllIIlIII[lllIIlIIl[2]] = llIIIIllIII("fE+bbxtivEo=", "MmrHc");
        lllIIlIII[lllIIlIIl[1]] = llIIIIllIII("5fUraZssYB8FJKBZ4JOrfA==", "rarUq");
        lllIIlIII[lllIIlIIl[3]] = llIIIIllIII("5IYQFb2ZmmqyncqvmGy9nA==", "tNgvM");
        lllIIlIII[lllIIlIIl[4]] = llIIIIllIII("AS3q7bq/aiU=", "aDdMM");
        lllIIlIII[lllIIlIIl[5]] = llIIIIllIIl("a+Dw2BJc86ec06lQbff6+Q==", "vobZQ");
        lllIIlIII[lllIIlIIl[7]] = llIIIIllIII("KX3gnz/D6Sw=", "qhOzJ");
        lllIIlIII[lllIIlIIl[8]] = llIIIIllIII("469PZOEFNf4qX+lc1kYFXQ==", "HviUV");
        lllIIlIII[lllIIlIIl[9]] = llIIIIllIII("tSdKHKjg9VmwCJRqnm3Fwg==", "ippnF");
        lllIIlIII[lllIIlIIl[10]] = llIIIIllIlI("EQYUGiB3BggWNDYVAw==", "WcfuX");
        lllIIlIII[lllIIlIIl[12]] = llIIIIllIIl("ZZb0+aoGfZ5wafLJ1/JlZg==", "mAZaO");
        lllIIlIII[lllIIlIIl[13]] = llIIIIllIII("VvZzeCm2lHU=", "mmXRW");
    }

    private static boolean llIIIIlllIl(int i2, int i3) {
        return i2 == i3;
    }

    private static String llIIIIllIlI(String lIlIllIIIlllIIl, String lIlIllIIIllllIl) {
        String lIlIllIIIlllIIl2 = new String(Base64.getDecoder().decode(lIlIllIIIlllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIllIIIllllII = new StringBuilder();
        char[] charArray = lIlIllIIIllllIl.toCharArray();
        int lIlIllIIIlllIlI = lllIIlIIl[2];
        char[] charArray2 = lIlIllIIIlllIIl2.toCharArray();
        int length = charArray2.length;
        int i2 = lllIIlIIl[2];
        while (llIIIIllllI(i2, length)) {
            lIlIllIIIllllII.append((char) (charArray2[i2] ^ charArray[lIlIllIIIlllIlI % charArray.length]));
            "".length();
            lIlIllIIIlllIlI++;
            i2++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lIlIllIIIllllII);
    }
}
