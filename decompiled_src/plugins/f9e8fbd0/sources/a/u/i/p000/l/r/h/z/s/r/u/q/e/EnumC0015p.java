package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.p  reason: invalid package and case insensitive filesystem */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/p.class */
public final class EnumC0015p {
    public static final /* synthetic */ EnumC0015p WEST;
    private static /* synthetic */ String[] lIllIlIIlIlII;
    public static final /* synthetic */ EnumC0015p EAST;
    public static final /* synthetic */ EnumC0015p SOUTH;
    private final /* synthetic */ int y;
    private static /* synthetic */ int[] lIllIlIIlIlIl;
    private final /* synthetic */ int x;
    public static final /* synthetic */ EnumC0015p CENTER;
    private static final /* synthetic */ EnumC0015p[] $VALUES;

    public static EnumC0015p[] values() {
        return (EnumC0015p[]) $VALUES.clone();
    }

    private EnumC0015p(String str, int i, int i2, int i3) {
        this.x = i2;
        this.y = i3;
    }

    private static void llIIIllllIlIlIl() {
        lIllIlIIlIlIl = new int[11];
        lIllIlIIlIlIl[0] = (9 ^ 55) & ((113 ^ 79) ^ (-1));
        lIllIlIIlIlIl[1] = (79 ^ 60) ^ (219 ^ 162);
        lIllIlIIlIlIl[2] = 46 ^ 43;
        lIllIlIIlIlIl[3] = " ".length();
        lIllIlIIlIlIl[4] = -(131 ^ 137);
        lIllIlIIlIlIl[5] = "  ".length();
        lIllIlIIlIlIl[6] = (((57 + 83) - 83) + 112) ^ (((72 + 100) - 128) + 130);
        lIllIlIIlIlIl[7] = "   ".length();
        lIllIlIIlIlIl[8] = -((((126 + 56) - 122) + 75) ^ (((97 + 37) - 41) + 38));
        lIllIlIIlIlIl[9] = (87 ^ 122) ^ (134 ^ 175);
        lIllIlIIlIlIl[10] = 74 ^ 66;
    }

    private static boolean llIIIllllIlIlll(int i, int i2) {
        return i < i2;
    }

    private static String llIIIllllIlIIll(String llllllllllllllIllIIIlllIllllIIIl, String llllllllllllllIllIIIlllIllllIIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIIlllIllllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIIIlllIlllIlllI = llllllllllllllIllIIIlllIllllIIII.toCharArray();
        int llllllllllllllIllIIIlllIlllIllIl = lIllIlIIlIlIl[0];
        char[] charArray = str.toCharArray();
        int llllllllllllllIllIIIlllIlllIIllI = charArray.length;
        int i = lIllIlIIlIlIl[0];
        while (llIIIllllIlIlll(i, llllllllllllllIllIIIlllIlllIIllI)) {
            char llllllllllllllIllIIIlllIllllIIlI = charArray[i];
            sb.append((char) (llllllllllllllIllIIIlllIllllIIlI ^ llllllllllllllIllIIIlllIlllIlllI[llllllllllllllIllIIIlllIlllIllIl % llllllllllllllIllIIIlllIlllIlllI.length]));
            "".length();
            llllllllllllllIllIIIlllIlllIllIl++;
            i++;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        llIIIllllIlIlIl();
        llIIIllllIlIlII();
        EAST = new EnumC0015p(lIllIlIIlIlII[lIllIlIIlIlIl[0]], lIllIlIIlIlIl[0], lIllIlIIlIlIl[1], lIllIlIIlIlIl[2]);
        WEST = new EnumC0015p(lIllIlIIlIlII[lIllIlIIlIlIl[3]], lIllIlIIlIlIl[3], lIllIlIIlIlIl[4], lIllIlIIlIlIl[2]);
        CENTER = new EnumC0015p(lIllIlIIlIlII[lIllIlIIlIlIl[5]], lIllIlIIlIlIl[5], lIllIlIIlIlIl[0], lIllIlIIlIlIl[6]);
        SOUTH = new EnumC0015p(lIllIlIIlIlII[lIllIlIIlIlIl[7]], lIllIlIIlIlIl[7], lIllIlIIlIlIl[0], lIllIlIIlIlIl[8]);
        EnumC0015p[] enumC0015pArr = new EnumC0015p[lIllIlIIlIlIl[9]];
        enumC0015pArr[lIllIlIIlIlIl[0]] = EAST;
        enumC0015pArr[lIllIlIIlIlIl[3]] = WEST;
        enumC0015pArr[lIllIlIIlIlIl[5]] = CENTER;
        enumC0015pArr[lIllIlIIlIlIl[7]] = SOUTH;
        $VALUES = enumC0015pArr;
    }

    public int H() {
        return this.y;
    }

    private static void llIIIllllIlIlII() {
        lIllIlIIlIlII = new String[lIllIlIIlIlIl[9]];
        lIllIlIIlIlII[lIllIlIIlIlIl[0]] = llIIIllllIlIIlI("gyMDKyptqZM=", "VbcYc");
        lIllIlIIlIlII[lIllIlIIlIlIl[3]] = llIIIllllIlIIlI("52m55v+GmQ0=", "EfUIf");
        lIllIlIIlIlII[lIllIlIIlIlIl[5]] = llIIIllllIlIIll("Lzw9NjE+", "lysbt");
        lIllIlIIlIlII[lIllIlIIlIlIl[7]] = llIIIllllIlIIll("BysvOz8=", "Tdzow");
    }

    public int G() {
        return this.x;
    }

    public static EnumC0015p valueOf(String str) {
        return (EnumC0015p) Enum.valueOf(EnumC0015p.class, str);
    }

    private static String llIIIllllIlIIlI(String llllllllllllllIllIIIllllIIIIIIIl, String llllllllllllllIllIIIllllIIIIIIII) {
        try {
            SecretKeySpec llllllllllllllIllIIIllllIIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIllllIIIIIIII.getBytes(StandardCharsets.UTF_8)), lIllIlIIlIlIl[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIlIIlIlIl[5], llllllllllllllIllIIIllllIIIIIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIllllIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIllllIIIIIIlI) {
            llllllllllllllIllIIIllllIIIIIIlI.printStackTrace();
            return null;
        }
    }
}
