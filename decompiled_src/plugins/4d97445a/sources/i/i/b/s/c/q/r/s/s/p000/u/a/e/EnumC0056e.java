package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.e  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/e.class */
public final class EnumC0056e {
    private final /* synthetic */ Prayer prayer;
    public static final /* synthetic */ EnumC0056e MELEE;
    public static final /* synthetic */ EnumC0056e GHOST_RANGED;
    private static /* synthetic */ String[] lIlIlIll;
    public static final /* synthetic */ EnumC0056e GHOST_MELEE;
    public static final /* synthetic */ EnumC0056e LAVA;
    public static final /* synthetic */ EnumC0056e GHOST_MAGIC;
    private static final /* synthetic */ EnumC0056e[] $VALUES;
    public static final /* synthetic */ EnumC0056e GHOSTS;
    public static final /* synthetic */ EnumC0056e MAGIC;
    public static final /* synthetic */ EnumC0056e SPAWN;
    private static /* synthetic */ int[] lIlIllII;
    public static final /* synthetic */ EnumC0056e RANGED;
    public static final /* synthetic */ EnumC0056e AUTO;
    private final /* synthetic */ int priority;

    static {
        lIIllIlllI();
        lIIllIllIl();
        SPAWN = new EnumC0056e(lIlIlIll[lIlIllII[1]], lIlIllII[1], null, lIlIllII[1]);
        AUTO = new EnumC0056e(lIlIlIll[lIlIllII[0]], lIlIllII[0], null, lIlIllII[0]);
        MELEE = new EnumC0056e(lIlIlIll[lIlIllII[2]], lIlIllII[2], Prayer.PROTECT_FROM_MELEE, lIlIllII[0]);
        RANGED = new EnumC0056e(lIlIlIll[lIlIllII[3]], lIlIllII[3], Prayer.PROTECT_FROM_MISSILES, lIlIllII[0]);
        MAGIC = new EnumC0056e(lIlIlIll[lIlIllII[4]], lIlIllII[4], Prayer.PROTECT_FROM_MAGIC, lIlIllII[0]);
        LAVA = new EnumC0056e(lIlIlIll[lIlIllII[5]], lIlIllII[5], null, lIlIllII[1]);
        GHOSTS = new EnumC0056e(lIlIlIll[lIlIllII[6]], lIlIllII[6], null, lIlIllII[1]);
        GHOST_MELEE = new EnumC0056e(lIlIlIll[lIlIllII[7]], lIlIllII[7], Prayer.PROTECT_FROM_MELEE, lIlIllII[2]);
        GHOST_RANGED = new EnumC0056e(lIlIlIll[lIlIllII[8]], lIlIllII[8], Prayer.PROTECT_FROM_MISSILES, lIlIllII[2]);
        GHOST_MAGIC = new EnumC0056e(lIlIlIll[lIlIllII[9]], lIlIllII[9], Prayer.PROTECT_FROM_MAGIC, lIlIllII[2]);
        EnumC0056e[] enumC0056eArr = new EnumC0056e[lIlIllII[10]];
        enumC0056eArr[lIlIllII[1]] = SPAWN;
        enumC0056eArr[lIlIllII[0]] = AUTO;
        enumC0056eArr[lIlIllII[2]] = MELEE;
        enumC0056eArr[lIlIllII[3]] = RANGED;
        enumC0056eArr[lIlIllII[4]] = MAGIC;
        enumC0056eArr[lIlIllII[5]] = LAVA;
        enumC0056eArr[lIlIllII[6]] = GHOSTS;
        enumC0056eArr[lIlIllII[7]] = GHOST_MELEE;
        enumC0056eArr[lIlIllII[8]] = GHOST_RANGED;
        enumC0056eArr[lIlIllII[9]] = GHOST_MAGIC;
        $VALUES = enumC0056eArr;
    }

    private static boolean lIIlllIIIl(int i2, int i3) {
        return i2 < i3;
    }

    private EnumC0056e(String str, int i2, Prayer prayer, int i3) {
        this.prayer = prayer;
        this.priority = i3;
    }

    private static void lIIllIllIl() {
        lIlIlIll = new String[lIlIllII[10]];
        lIlIlIll[lIlIllII[1]] = lIIllIlIlI("iCSpqPJPH9w=", "JxYPu");
        lIlIlIll[lIlIllII[0]] = lIIllIlIll("CRY1Ag==", "HCaMQ");
        lIlIlIll[lIlIllII[2]] = lIIllIlIll("HQI1ABM=", "PGyEV");
        lIlIlIll[lIlIllII[3]] = lIIllIllII("RvH+4wYaysg=", "YhhgT");
        lIlIlIll[lIlIllII[4]] = lIIllIlIlI("nHGhNp3IG0U=", "ufCxs");
        lIlIlIll[lIlIllII[5]] = lIIllIllII("Myzi3pvHeGQ=", "rtRDG");
        lIlIlIll[lIlIllII[6]] = lIIllIlIll("FwQmFw4D", "PLiDZ");
        lIlIlIll[lIlIllII[7]] = lIIllIlIll("FT0fNCMNOBUrMhc=", "RuPgw");
        lIlIlIll[lIlIllII[8]] = lIIllIlIlI("GWj9GMxTP2lQb+d/Lq+PyA==", "nXHwQ");
        lIlIlIll[lIlIllII[9]] = lIIllIlIll("Eik3MTUKLDklKBY=", "Uaxba");
    }

    public int H() {
        return this.priority;
    }

    private static String lIIllIlIlI(String llIlllllIIIllIl, String llIlllllIIIllII) {
        try {
            SecretKeySpec llIlllllIIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlllllIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIllII[2], llIlllllIIlIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIlllllIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlllllIIIlllI) {
            llIlllllIIIlllI.printStackTrace();
            return null;
        }
    }

    public static EnumC0056e[] values() {
        return (EnumC0056e[]) $VALUES.clone();
    }

    private static String lIIllIllII(String llIlllllIIllIlI, String llIlllllIIllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlllllIIllIIl.getBytes(StandardCharsets.UTF_8)), lIlIllII[8]), "DES");
            Cipher llIlllllIIlllII = Cipher.getInstance("DES");
            llIlllllIIlllII.init(lIlIllII[2], secretKeySpec);
            return new String(llIlllllIIlllII.doFinal(Base64.getDecoder().decode(llIlllllIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlllllIIllIll) {
            llIlllllIIllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllIIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "Attack{prayer=" + this.prayer + ", priority=" + this.priority + "}";
    }

    private static String lIIllIlIll(String llIllllIlllllIl, String llIllllIlllllII) {
        String str = new String(Base64.getDecoder().decode(llIllllIlllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llIllllIlllllII.toCharArray();
        int llIllllIllllIIl = lIlIllII[1];
        char[] charArray2 = str.toCharArray();
        int llIllllIlllIIlI = charArray2.length;
        int i2 = lIlIllII[1];
        while (lIIlllIIIl(i2, llIllllIlllIIlI)) {
            char llIllllIllllllI = charArray2[i2];
            sb.append((char) (llIllllIllllllI ^ charArray[llIllllIllllIIl % charArray.length]));
            "".length();
            llIllllIllllIIl++;
            i2++;
            "".length();
            if ((((((93 + 132) - 147) + 95) ^ (((113 + 46) - 132) + 107)) & (((((196 + 19) - 100) + 121) ^ (((58 + 87) - (-8)) + 46)) ^ (-" ".length()))) < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIIllIlllI() {
        lIlIllII = new int[11];
        lIlIllII[0] = " ".length();
        lIlIllII[1] = ((((10 + 192) - 5) + 52) ^ (((78 + 81) - 83) + 87)) & ((" ".length() ^ (94 ^ 5)) ^ (-" ".length()));
        lIlIllII[2] = "  ".length();
        lIlIllII[3] = "   ".length();
        lIlIllII[4] = (46 ^ 65) ^ (21 ^ 126);
        lIlIllII[5] = (((102 + 134) - 137) + 71) ^ (((67 + 116) - 119) + 111);
        lIlIllII[6] = (((81 + 5) - 24) + 84) ^ (((84 + 83) - 114) + 95);
        lIlIllII[7] = (45 ^ 125) ^ (225 ^ 182);
        lIlIllII[8] = (132 ^ 153) ^ (97 ^ 116);
        lIlIllII[9] = 97 ^ 104;
        lIlIllII[10] = 110 ^ 100;
    }

    public static EnumC0056e valueOf(String str) {
        return (EnumC0056e) Enum.valueOf(EnumC0056e.class, str);
    }

    public Prayer j() {
        return this.prayer;
    }

    private static boolean lIIllIllll(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean G() {
        if (lIIllIllll(this, GHOST_MAGIC) && lIIllIllll(this, GHOST_RANGED) && !lIIlllIIII(this, GHOST_MELEE)) {
            return lIlIllII[1];
        }
        ?? r0 = lIlIllII[0];
        "".length();
        return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }
}
