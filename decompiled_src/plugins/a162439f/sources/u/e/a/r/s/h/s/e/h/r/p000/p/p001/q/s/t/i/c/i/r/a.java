package u.e.a.r.s.h.s.e.h.r.p000.p.p001.q.s.t.i.c.i.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.a  reason: invalid package */
/* loaded from: a162439f-48e7-4aeb-adb7-778d42249168.jar:u/e/a/r/s/h/s/e/h/r/-/p/-/q/s/t/i/c/i/r/a.class */
public final class a {
    private final /* synthetic */ boolean canSell;
    public static final /* synthetic */ a EMPTY_FISHBOWL;
    private static final /* synthetic */ a[] $VALUES;
    public static final /* synthetic */ a CANDLE_LANTERN;
    private final /* synthetic */ int itemId;
    private final /* synthetic */ int levelRequirement;
    private static /* synthetic */ String[] lIlIllIllIlI;
    public static final /* synthetic */ a UNPOWERED_ORB;
    public static final /* synthetic */ a VIAL;
    public static final /* synthetic */ a LANTERN_LENS;
    private static /* synthetic */ int[] lIlIllIllIll;
    public static final /* synthetic */ a EMPTY_OIL_LAMP;
    public static final /* synthetic */ a BEER_GLASS;
    public static final /* synthetic */ a EMPTY_LIGHT_ORB;

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public int a() {
        return ordinal() + lIlIllIllIll[0];
    }

    private static boolean lllIIIIlIIIlIl(Object obj) {
        return obj != null;
    }

    private static void lllIIIIlIIIIlI() {
        lIlIllIllIll = new int[23];
        lIlIllIllIll[0] = " ".length();
        lIlIllIllIll[1] = (62 ^ 28) & ((11 ^ 41) ^ (-1));
        lIlIllIllIll[2] = (-((-609) & 29409)) & (-1) & 30719;
        lIlIllIllIll[3] = (-8713) & 13241;
        lIlIllIllIll[4] = 194 ^ 198;
        lIlIllIllIll[5] = "  ".length();
        lIlIllIllIll[6] = (-26643) & 31167;
        lIlIllIllIll[7] = " ".length() ^ (42 ^ 39);
        lIlIllIllIll[8] = "   ".length();
        lIlIllIllIll[9] = (((195 ^ 175) + (195 ^ 157)) - (((22 + 52) - 28) + 138)) + ((199 + 176) - 352) + 188;
        lIlIllIllIll[10] = (((146 + 125) - 154) + 64) ^ (((14 + 0) - (-111)) + 23);
        lIlIllIllIll[11] = (-((-2845) & 11133)) & (-133) & 15087;
        lIlIllIllIll[12] = (75 ^ 42) ^ (66 ^ 9);
        lIlIllIllIll[13] = (140 ^ 153) ^ (170 ^ 186);
        lIlIllIllIll[14] = (-((-16903) & 32719)) & (-16385) & 32767;
        lIlIllIllIll[15] = 89 ^ 119;
        lIlIllIllIll[16] = (45 ^ 31) ^ (91 ^ 111);
        lIlIllIllIll[17] = (-26689) & 31230;
        lIlIllIllIll[18] = (27 ^ 110) ^ (60 ^ 120);
        lIlIllIllIll[19] = 167 ^ 160;
        lIlIllIllIll[20] = (-1292) & 12271;
        lIlIllIllIll[21] = 113 ^ 38;
        lIlIllIllIll[22] = 111 ^ 103;
    }

    public int d() {
        return this.levelRequirement;
    }

    public int c() {
        return this.itemId;
    }

    public boolean e() {
        return this.canSell;
    }

    private static String lllIIIIlIIIIII(String lllllllllllllllIllIIlIIlIlIIllIl, String lllllllllllllllIllIIlIIlIlIIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIIlIlIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIllIllIll[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIIlIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIlIIlIlIIlllI) {
            lllllllllllllllIllIIlIIlIlIIlllI.printStackTrace();
            return null;
        }
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    private static boolean lllIIIIlIIIllI(int i, int i2) {
        return i > i2;
    }

    private static String lllIIIIIllllll(String lllllllllllllllIllIIlIIlIllIIIlI, String lllllllllllllllIllIIlIIlIllIIIIl) {
        String lllllllllllllllIllIIlIIlIllIIIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIIlIIlIllIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIllIIlIIlIllIIIIl.toCharArray();
        int lllllllllllllllIllIIlIIlIlIllllI = lIlIllIllIll[1];
        char[] charArray2 = lllllllllllllllIllIIlIIlIllIIIlI2.toCharArray();
        int length = charArray2.length;
        int i = lIlIllIllIll[1];
        while (lllIIIIlIIIIll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIllIIlIIlIlIllllI % charArray.length]));
            "".length();
            lllllllllllllllIllIIlIIlIlIllllI++;
            i++;
            "".length();
            if ((-(88 ^ 92)) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lllIIIIIlllllI(String lllllllllllllllIllIIlIIlIlllIIlI, String lllllllllllllllIllIIlIIlIlllIIIl) {
        try {
            SecretKeySpec lllllllllllllllIllIIlIIlIlllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIIlIlllIIIl.getBytes(StandardCharsets.UTF_8)), lIlIllIllIll[22]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIllIllIll[5], lllllllllllllllIllIIlIIlIlllIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIIlIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIlIIlIlllIIll) {
            lllllllllllllllIllIIlIIlIlllIIll.printStackTrace();
            return null;
        }
    }

    private static void lllIIIIlIIIIIl() {
        lIlIllIllIlI = new String[lIlIllIllIll[22]];
        lIlIllIllIlI[lIlIllIllIll[1]] = lllIIIIIlllllI("B4W8fAy5XQoSuNJhK8iquA==", "eZoeE");
        lIlIllIllIlI[lIlIllIllIll[0]] = lllIIIIIllllll("CgoIAS4MFAoELB0OFAs=", "IKFEb");
        lIlIllIllIlI[lIlIllIllIll[5]] = lllIIIIlIIIIII("ri9fEYuYx1o0arR2cWOzVA==", "MHsKt");
        lIlIllIllIlI[lIlIllIllIll[8]] = lllIIIIIlllllI("kjQ6XxzNNhA=", "AZTOt");
        lIlIllIllIlI[lIlIllIllIll[4]] = lllIIIIIllllll("KCIzEQAyKSoWES8gNAk=", "mocEY");
        lIlIllIllIlI[lIlIllIllIll[13]] = lllIIIIIllllll("Aw8GFQETExMeCRkTFA==", "VAVZV");
        lIlIllIllIlI[lIlIllIllIll[16]] = lllIIIIIlllllI("1fDASXpmgiiotx6LTatxhA==", "SUobm");
        lIlIllIllIlI[lIlIllIllIll[19]] = lllIIIIIllllll("DgwfOzEUDQYoIB8eAD0q", "KAOoh");
    }

    private static boolean lllIIIIlIIIlII(int i, int i2) {
        return i >= i2;
    }

    private a(String str, int i, int i2, int i3, boolean z) {
        this.itemId = i2;
        this.levelRequirement = i3;
        this.canSell = z;
    }

    public static a b() {
        int level = Skills.getLevel(Skill.CRAFTING);
        a aVar = null;
        a[] values = values();
        int lllllllllllllllIllIIlIIlIlllllII = values.length;
        int i = lIlIllIllIll[1];
        while (lllIIIIlIIIIll(i, lllllllllllllllIllIIlIIlIlllllII)) {
            a aVar2 = values[i];
            if (lllIIIIlIIIlII(level, aVar2.levelRequirement) && (!lllIIIIlIIIlIl(aVar) || lllIIIIlIIIllI(aVar2.levelRequirement, aVar.levelRequirement))) {
                aVar = aVar2;
            }
            i++;
            "".length();
            if (" ".length() >= "   ".length()) {
                return null;
            }
        }
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean] */
    static {
        lllIIIIlIIIIlI();
        lllIIIIlIIIIIl();
        BEER_GLASS = new a(lIlIllIllIlI[lIlIllIllIll[1]], lIlIllIllIll[1], lIlIllIllIll[2], lIlIllIllIll[0], lIlIllIllIll[0]);
        CANDLE_LANTERN = new a(lIlIllIllIlI[lIlIllIllIll[0]], lIlIllIllIll[0], lIlIllIllIll[3], lIlIllIllIll[4], lIlIllIllIll[0]);
        EMPTY_OIL_LAMP = new a(lIlIllIllIlI[lIlIllIllIll[5]], lIlIllIllIll[5], lIlIllIllIll[6], lIlIllIllIll[7], lIlIllIllIll[0]);
        VIAL = new a(lIlIllIllIlI[lIlIllIllIll[8]], lIlIllIllIll[8], lIlIllIllIll[9], lIlIllIllIll[10], lIlIllIllIll[0]);
        EMPTY_FISHBOWL = new a(lIlIllIllIlI[lIlIllIllIll[4]], lIlIllIllIll[4], lIlIllIllIll[11], lIlIllIllIll[12], lIlIllIllIll[0]);
        UNPOWERED_ORB = new a(lIlIllIllIlI[lIlIllIllIll[13]], lIlIllIllIll[13], lIlIllIllIll[14], lIlIllIllIll[15], lIlIllIllIll[0]);
        LANTERN_LENS = new a(lIlIllIllIlI[lIlIllIllIll[16]], lIlIllIllIll[16], lIlIllIllIll[17], lIlIllIllIll[18], lIlIllIllIll[0]);
        EMPTY_LIGHT_ORB = new a(lIlIllIllIlI[lIlIllIllIll[19]], lIlIllIllIll[19], lIlIllIllIll[20], lIlIllIllIll[21], lIlIllIllIll[1]);
        a[] aVarArr = new a[lIlIllIllIll[22]];
        aVarArr[lIlIllIllIll[1]] = BEER_GLASS;
        aVarArr[lIlIllIllIll[0]] = CANDLE_LANTERN;
        aVarArr[lIlIllIllIll[5]] = EMPTY_OIL_LAMP;
        aVarArr[lIlIllIllIll[8]] = VIAL;
        aVarArr[lIlIllIllIll[4]] = EMPTY_FISHBOWL;
        aVarArr[lIlIllIllIll[13]] = UNPOWERED_ORB;
        aVarArr[lIlIllIllIll[16]] = LANTERN_LENS;
        aVarArr[lIlIllIllIll[19]] = EMPTY_LIGHT_ORB;
        $VALUES = aVarArr;
    }

    private static boolean lllIIIIlIIIIll(int i, int i2) {
        return i < i2;
    }
}
