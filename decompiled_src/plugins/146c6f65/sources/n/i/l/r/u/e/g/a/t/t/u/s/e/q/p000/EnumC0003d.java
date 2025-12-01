package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d  reason: invalid package and case insensitive filesystem */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/d.class */
public final class EnumC0003d {
    public static final /* synthetic */ EnumC0003d DONE_EXPLORING_EVERYTHING;
    public static final /* synthetic */ EnumC0003d EXTRA_FOOD_EXPLORE;
    public static final /* synthetic */ EnumC0003d OUTSIDE;
    public static final /* synthetic */ EnumC0003d FIRST_ROTATION_EXPLORE;
    public static final /* synthetic */ EnumC0003d GIVE_UP;
    private static /* synthetic */ int[] llIlIIIIIlll;
    public static final /* synthetic */ EnumC0003d BOSS_FIGHT;
    public static final /* synthetic */ EnumC0003d PREPARE_BOSS_FIGHT;
    public static final /* synthetic */ EnumC0003d FIRST_ROTATION_CREATE;
    public static final /* synthetic */ EnumC0003d DEMI_BOSS_EXPLORE;
    private static /* synthetic */ String[] llIlIIIIIlIl;
    public static final /* synthetic */ EnumC0003d AFK;
    public static final /* synthetic */ EnumC0003d CREATING_T3_STAFF;
    public static final /* synthetic */ EnumC0003d WEAPON_FRAME_EXPLORE;
    private static final /* synthetic */ EnumC0003d[] $VALUES;

    @Override // java.lang.Enum
    public String toString() {
        String str = super.toString();
        return str.charAt(llIlIIIIIlll[0]) + str.substring(llIlIIIIIlll[1]).replaceAll(llIlIIIIIlIl[llIlIIIIIlll[0]], llIlIIIIIlIl[llIlIIIIIlll[1]]).trim().toLowerCase();
    }

    public static EnumC0003d valueOf(String str) {
        return (EnumC0003d) Enum.valueOf(EnumC0003d.class, str);
    }

    private static String lIIIIIIIlIllllI(String lllllllllllllllIlIIIlllIIIIlIIll, String lllllllllllllllIlIIIlllIIIIlIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIIIlllIIIIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIlllIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIlllIIIIlIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIlllIIIIlIlIl.init(llIlIIIIIlll[2], lllllllllllllllIlIIIlllIIIIlIllI);
            return new String(lllllllllllllllIlIIIlllIIIIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIlllIIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIlllIIIIlIlII) {
            lllllllllllllllIlIIIlllIIIIlIlII.printStackTrace();
            return null;
        }
    }

    private static void lIIIIIIIlIlllll() {
        llIlIIIIIlIl = new String[llIlIIIIIlll[14]];
        llIlIIIIIlIl[llIlIIIIIlll[0]] = lIIIIIIIlIlllII("Dg==", "Qgjke");
        llIlIIIIIlIl[llIlIIIIIlll[1]] = lIIIIIIIlIlllIl("l3rwPj8pmKw=", "JRegx");
        llIlIIIIIlIl[llIlIIIIIlll[2]] = lIIIIIIIlIllllI("WSgLCEiUGiw=", "YRYCu");
        llIlIIIIIlIl[llIlIIIIIlll[3]] = lIIIIIIIlIllllI("DEnXIVit1cs=", "LaFPs");
        llIlIIIIIlIl[llIlIIIIIlll[4]] = lIIIIIIIlIllllI("ygIRRHXtF+toH6gb3g6xfXddE9SGWSTt", "OJVbO");
        llIlIIIIIlIl[llIlIIIIIlll[5]] = lIIIIIIIlIlllII("EzArGzIKKzYcJwEwNgY5Fis8CTIQ", "UyyHf");
        llIlIIIIIlIl[llIlIIIIIlll[6]] = lIIIIIIIlIlllII("PT8cKjA7NQIwMDwiAS8gKz8=", "yzQco");
        llIlIIIIIlIl[llIlIIIIIlll[7]] = lIIIIIIIlIllllI("YsYw7xHkLe/L4KbuZsKqeJ+9BfCJqBZF", "natqp");
        llIlIIIIIlIl[llIlIIIIIlll[8]] = lIIIIIIIlIlllII("FBkkAjcWDj4QORcYPhQ/AwM1", "DKaRv");
        llIlIIIIIlIl[llIlIIIIIlll[9]] = lIIIIIIIlIllllI("7RmvYgQzxvRysbMiOsjTXLVNI12DLkb5", "cYLiK");
        llIlIIIIIlIl[llIlIIIIIlll[10]] = lIIIIIIIlIlllIl("slNoPWJVmHmyFO47seec2g==", "KUFyD");
        llIlIIIIIlIl[llIlIIIIIlll[11]] = lIIIIIIIlIlllIl("iLvofsNkqKM=", "bpZvZ");
        llIlIIIIIlIl[llIlIIIIIlll[12]] = lIIIIIIIlIlllIl("85IeTTvgC4vbrdMByJefyvK3jm6b/bqPIfeazaN4MQw=", "CbFvs");
        llIlIIIIIlIl[llIlIIIIIlll[13]] = lIIIIIIIlIlllIl("Jv/7+vCPLp3EEeWMPSfdHbPgYWGioQNf", "zGdwP");
    }

    private static boolean lIIIIIIIllIIlIl(int i, int i2) {
        return i < i2;
    }

    private static String lIIIIIIIlIlllII(String lllllllllllllllIlIIIlllIIIlIlIII, String lllllllllllllllIlIIIlllIIIlIIlll) {
        String lllllllllllllllIlIIIlllIIIlIlIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIlllIIIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIlllIIIlIIllI = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIIlllIIIlIIlll.toCharArray();
        int lllllllllllllllIlIIIlllIIIlIIlII = llIlIIIIIlll[0];
        char[] charArray2 = lllllllllllllllIlIIIlllIIIlIlIII2.toCharArray();
        int lllllllllllllllIlIIIlllIIIIlllIl = charArray2.length;
        int i = llIlIIIIIlll[0];
        while (lIIIIIIIllIIlIl(i, lllllllllllllllIlIIIlllIIIIlllIl)) {
            char lllllllllllllllIlIIIlllIIIIllIll = charArray2[i];
            lllllllllllllllIlIIIlllIIIlIIllI.append((char) (lllllllllllllllIlIIIlllIIIIllIll ^ charArray[lllllllllllllllIlIIIlllIIIlIIlII % charArray.length]));
            "".length();
            lllllllllllllllIlIIIlllIIIlIIlII++;
            i++;
            "".length();
            if ((-(108 ^ 105)) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIIlllIIIlIIllI);
    }

    public static EnumC0003d[] values() {
        return (EnumC0003d[]) $VALUES.clone();
    }

    private EnumC0003d(String str, int i) {
    }

    private static void lIIIIIIIllIIlII() {
        llIlIIIIIlll = new int[15];
        llIlIIIIIlll[0] = ((185 ^ 146) ^ (((51 + 37) - 23) + 62)) & (((((82 + 33) - (-106)) + 24) ^ (((92 + 108) - 51) + 12)) ^ (-" ".length()));
        llIlIIIIIlll[1] = " ".length();
        llIlIIIIIlll[2] = "  ".length();
        llIlIIIIIlll[3] = "   ".length();
        llIlIIIIIlll[4] = " ".length() ^ (88 ^ 93);
        llIlIIIIIlll[5] = 82 ^ 87;
        llIlIIIIIlll[6] = (208 ^ 152) ^ (221 ^ 147);
        llIlIIIIIlll[7] = 104 ^ 111;
        llIlIIIIIlll[8] = 21 ^ 29;
        llIlIIIIIlll[9] = (21 ^ 72) ^ (226 ^ 182);
        llIlIIIIIlll[10] = (87 ^ 60) ^ (91 ^ 58);
        llIlIIIIIlll[11] = 147 ^ 152;
        llIlIIIIIlll[12] = (((153 + 73) - 138) + 79) ^ (((91 + 3) - (-43)) + 34);
        llIlIIIIIlll[13] = (94 ^ 53) ^ (228 ^ 130);
        llIlIIIIIlll[14] = 79 ^ 65;
    }

    static {
        lIIIIIIIllIIlII();
        lIIIIIIIlIlllll();
        OUTSIDE = new EnumC0003d(llIlIIIIIlIl[llIlIIIIIlll[2]], llIlIIIIIlll[0]);
        GIVE_UP = new EnumC0003d(llIlIIIIIlIl[llIlIIIIIlll[3]], llIlIIIIIlll[1]);
        FIRST_ROTATION_EXPLORE = new EnumC0003d(llIlIIIIIlIl[llIlIIIIIlll[4]], llIlIIIIIlll[2]);
        FIRST_ROTATION_CREATE = new EnumC0003d(llIlIIIIIlIl[llIlIIIIIlll[5]], llIlIIIIIlll[3]);
        DEMI_BOSS_EXPLORE = new EnumC0003d(llIlIIIIIlIl[llIlIIIIIlll[6]], llIlIIIIIlll[4]);
        WEAPON_FRAME_EXPLORE = new EnumC0003d(llIlIIIIIlIl[llIlIIIIIlll[7]], llIlIIIIIlll[5]);
        PREPARE_BOSS_FIGHT = new EnumC0003d(llIlIIIIIlIl[llIlIIIIIlll[8]], llIlIIIIIlll[6]);
        EXTRA_FOOD_EXPLORE = new EnumC0003d(llIlIIIIIlIl[llIlIIIIIlll[9]], llIlIIIIIlll[7]);
        BOSS_FIGHT = new EnumC0003d(llIlIIIIIlIl[llIlIIIIIlll[10]], llIlIIIIIlll[8]);
        AFK = new EnumC0003d(llIlIIIIIlIl[llIlIIIIIlll[11]], llIlIIIIIlll[9]);
        DONE_EXPLORING_EVERYTHING = new EnumC0003d(llIlIIIIIlIl[llIlIIIIIlll[12]], llIlIIIIIlll[10]);
        CREATING_T3_STAFF = new EnumC0003d(llIlIIIIIlIl[llIlIIIIIlll[13]], llIlIIIIIlll[11]);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIlIIIIIlll[12]];
        enumC0003dArr[llIlIIIIIlll[0]] = OUTSIDE;
        enumC0003dArr[llIlIIIIIlll[1]] = GIVE_UP;
        enumC0003dArr[llIlIIIIIlll[2]] = FIRST_ROTATION_EXPLORE;
        enumC0003dArr[llIlIIIIIlll[3]] = FIRST_ROTATION_CREATE;
        enumC0003dArr[llIlIIIIIlll[4]] = DEMI_BOSS_EXPLORE;
        enumC0003dArr[llIlIIIIIlll[5]] = WEAPON_FRAME_EXPLORE;
        enumC0003dArr[llIlIIIIIlll[6]] = PREPARE_BOSS_FIGHT;
        enumC0003dArr[llIlIIIIIlll[7]] = EXTRA_FOOD_EXPLORE;
        enumC0003dArr[llIlIIIIIlll[8]] = BOSS_FIGHT;
        enumC0003dArr[llIlIIIIIlll[9]] = AFK;
        enumC0003dArr[llIlIIIIIlll[10]] = DONE_EXPLORING_EVERYTHING;
        enumC0003dArr[llIlIIIIIlll[11]] = CREATING_T3_STAFF;
        $VALUES = enumC0003dArr;
    }

    private static String lIIIIIIIlIlllIl(String lllllllllllllllIlIIIlllIIIlllIII, String lllllllllllllllIlIIIlllIIIllIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIlllIIIllIlll.getBytes(StandardCharsets.UTF_8)), llIlIIIIIlll[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIIIIIlll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIlllIIIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIlllIIIlllIIl) {
            lllllllllllllllIlIIIlllIIIlllIIl.printStackTrace();
            return null;
        }
    }
}
