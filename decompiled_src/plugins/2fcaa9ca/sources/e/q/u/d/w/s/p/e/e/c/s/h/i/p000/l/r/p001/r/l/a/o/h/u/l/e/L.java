package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.L  reason: invalid package */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/L.class */
public final class L {
    public static final /* synthetic */ L WALK;
    private static /* synthetic */ String[] lllIIlIlIIII;
    private static /* synthetic */ int[] lllIIlIlIIIl;
    private static final /* synthetic */ L[] $VALUES;

    private static boolean lIIIlIlIIIIllII(int i, int i2) {
        return i < i2;
    }

    static {
        lIIIlIlIIIIlIll();
        lIIIlIlIIIIlIlI();
        WALK = new L(lllIIlIlIIII[lllIIlIlIIIl[0]], lllIIlIlIIIl[0]);
        L[] lArr = new L[lllIIlIlIIIl[1]];
        lArr[lllIIlIlIIIl[0]] = WALK;
        $VALUES = lArr;
    }

    public static L[] values() {
        return (L[]) $VALUES.clone();
    }

    private L(String str, int i) {
    }

    private static void lIIIlIlIIIIlIll() {
        lllIIlIlIIIl = new int[2];
        lllIIlIlIIIl[0] = (64 ^ 7) & ((39 ^ 96) ^ (-1));
        lllIIlIlIIIl[1] = " ".length();
    }

    private static void lIIIlIlIIIIlIlI() {
        lllIIlIlIIII = new String[lllIIlIlIIIl[1]];
        lllIIlIlIIII[lllIIlIlIIIl[0]] = lIIIlIlIIIIlIIl("HS4hKg==", "Jomaa");
    }

    private static String lIIIlIlIIIIlIIl(String lllllllllllllllIIllIlIlIllIIIlII, String lllllllllllllllIIllIlIlIlIlllllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIlIllIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlIlIllIIIIlI = new StringBuilder();
        char[] lllllllllllllllIIllIlIlIllIIIIIl = lllllllllllllllIIllIlIlIlIlllllI.toCharArray();
        int lllllllllllllllIIllIlIlIllIIIIII = lllIIlIlIIIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIIlIlIIIl[0];
        while (lIIIlIlIIIIllII(i, length)) {
            char lllllllllllllllIIllIlIlIllIIIlIl = charArray[i];
            lllllllllllllllIIllIlIlIllIIIIlI.append((char) (lllllllllllllllIIllIlIlIllIIIlIl ^ lllllllllllllllIIllIlIlIllIIIIIl[lllllllllllllllIIllIlIlIllIIIIII % lllllllllllllllIIllIlIlIllIIIIIl.length]));
            "".length();
            lllllllllllllllIIllIlIlIllIIIIII++;
            i++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIlIlIllIIIIlI);
    }

    public static L valueOf(String str) {
        return (L) Enum.valueOf(L.class, str);
    }
}
