package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.m  reason: invalid package and case insensitive filesystem */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/m.class */
public final class EnumC0012m {
    private static /* synthetic */ String[] llIlllllllIl;
    private static final /* synthetic */ EnumC0012m[] $VALUES;
    public static final /* synthetic */ EnumC0012m NORTH_BACK;
    private static /* synthetic */ int[] llIllllllllI;

    private EnumC0012m(String str, int i) {
    }

    private static void lIIIIlllllllIIl() {
        llIlllllllIl = new String[llIllllllllI[1]];
        llIlllllllIl[llIllllllllI[0]] = lIIIIlllllllIII("FiQFLD0HKRY7Pg==", "XkWxu");
    }

    public static EnumC0012m valueOf(String str) {
        return (EnumC0012m) Enum.valueOf(EnumC0012m.class, str);
    }

    private static void lIIIIlllllllIlI() {
        llIllllllllI = new int[2];
        llIllllllllI[0] = ((((101 + 65) - 88) + 143) ^ (((77 + 108) - 49) + 12)) & (((6 ^ 0) ^ (109 ^ 34)) ^ (-" ".length()));
        llIllllllllI[1] = " ".length();
    }

    private static boolean lIIIIlllllllIll(int i, int i2) {
        return i < i2;
    }

    public static EnumC0012m[] values() {
        return (EnumC0012m[]) $VALUES.clone();
    }

    static {
        lIIIIlllllllIlI();
        lIIIIlllllllIIl();
        NORTH_BACK = new EnumC0012m(llIlllllllIl[llIllllllllI[0]], llIllllllllI[0]);
        EnumC0012m[] enumC0012mArr = new EnumC0012m[llIllllllllI[1]];
        enumC0012mArr[llIllllllllI[0]] = NORTH_BACK;
        $VALUES = enumC0012mArr;
    }

    private static String lIIIIlllllllIII(String lllllllllllllllIIlllIIllllIllIII, String lllllllllllllllIIlllIIllllIlllII) {
        String lllllllllllllllIIlllIIllllIllIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIIllllIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlllIIllllIllIll = new StringBuilder();
        char[] charArray = lllllllllllllllIIlllIIllllIlllII.toCharArray();
        int lllllllllllllllIIlllIIllllIllIIl = llIllllllllI[0];
        char[] charArray2 = lllllllllllllllIIlllIIllllIllIII2.toCharArray();
        int length = charArray2.length;
        int i = llIllllllllI[0];
        while (lIIIIlllllllIll(i, length)) {
            lllllllllllllllIIlllIIllllIllIll.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlllIIllllIllIIl % charArray.length]));
            "".length();
            lllllllllllllllIIlllIIllllIllIIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlllIIllllIllIll);
    }
}
