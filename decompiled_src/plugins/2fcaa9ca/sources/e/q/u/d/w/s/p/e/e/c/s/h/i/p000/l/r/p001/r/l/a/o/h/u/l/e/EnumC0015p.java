package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.p  reason: invalid package and case insensitive filesystem */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/p.class */
public final class EnumC0015p {
    private static /* synthetic */ String[] lllIIlIIlIII;
    private static /* synthetic */ int[] lllIIlIIlIIl;
    public static final /* synthetic */ EnumC0015p FINAL;
    private static final /* synthetic */ EnumC0015p[] $VALUES;

    public static EnumC0015p valueOf(String str) {
        return (EnumC0015p) Enum.valueOf(EnumC0015p.class, str);
    }

    static {
        lIIIlIIllllIlll();
        lIIIlIIllllIllI();
        FINAL = new EnumC0015p(lllIIlIIlIII[lllIIlIIlIIl[0]], lllIIlIIlIIl[0]);
        EnumC0015p[] enumC0015pArr = new EnumC0015p[lllIIlIIlIIl[1]];
        enumC0015pArr[lllIIlIIlIIl[0]] = FINAL;
        $VALUES = enumC0015pArr;
    }

    private static boolean lIIIlIIlllllIII(int i, int i2) {
        return i < i2;
    }

    private static void lIIIlIIllllIlll() {
        lllIIlIIlIIl = new int[2];
        lllIIlIIlIIl[0] = (97 ^ 104) & ((25 ^ 16) ^ (-1));
        lllIIlIIlIIl[1] = " ".length();
    }

    private static String lIIIlIIllllIlIl(String lllllllllllllllIIllIlIllIlIlIlll, String lllllllllllllllIIllIlIllIlIllIll) {
        String lllllllllllllllIIllIlIllIlIlIlll2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIllIlIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlIllIlIllIlI = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIlIllIlIllIll.toCharArray();
        int lllllllllllllllIIllIlIllIlIllIII = lllIIlIIlIIl[0];
        char[] charArray2 = lllllllllllllllIIllIlIllIlIlIlll2.toCharArray();
        int length = charArray2.length;
        int lllllllllllllllIIllIlIllIlIlIIII = lllIIlIIlIIl[0];
        while (lIIIlIIlllllIII(lllllllllllllllIIllIlIllIlIlIIII, length)) {
            lllllllllllllllIIllIlIllIlIllIlI.append((char) (charArray2[lllllllllllllllIIllIlIllIlIlIIII] ^ charArray[lllllllllllllllIIllIlIllIlIllIII % charArray.length]));
            "".length();
            lllllllllllllllIIllIlIllIlIllIII++;
            lllllllllllllllIIllIlIllIlIlIIII++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIlIllIlIllIlI);
    }

    public static EnumC0015p[] values() {
        return (EnumC0015p[]) $VALUES.clone();
    }

    private EnumC0015p(String str, int i) {
    }

    private static void lIIIlIIllllIllI() {
        lllIIlIIlIII = new String[lllIIlIIlIIl[1]];
        lllIIlIIlIII[lllIIlIIlIIl[0]] = lIIIlIIllllIlIl("KCIqLB0=", "nkdmQ");
    }
}
