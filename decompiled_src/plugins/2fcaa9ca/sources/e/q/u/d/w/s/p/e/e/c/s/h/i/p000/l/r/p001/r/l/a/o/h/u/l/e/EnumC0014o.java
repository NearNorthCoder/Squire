package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.o  reason: invalid package and case insensitive filesystem */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/o.class */
public final class EnumC0014o {
    private static /* synthetic */ String[] lllIIIlIIlll;
    private static /* synthetic */ int[] lllIIIlIlIII;
    public static final /* synthetic */ EnumC0014o SOUTH;
    private static final /* synthetic */ EnumC0014o[] $VALUES;

    private static void lIIIlIIlIIIllll() {
        lllIIIlIlIII = new int[2];
        lllIIIlIlIII[0] = ((58 ^ 94) ^ (32 ^ 72)) & (((66 ^ 44) ^ (74 ^ 40)) ^ (-" ".length()));
        lllIIIlIlIII[1] = " ".length();
    }

    private static boolean lIIIlIIlIIlIIII(int i, int i2) {
        return i < i2;
    }

    private EnumC0014o(String str, int i) {
    }

    static {
        lIIIlIIlIIIllll();
        lIIIlIIlIIIlllI();
        SOUTH = new EnumC0014o(lllIIIlIIlll[lllIIIlIlIII[0]], lllIIIlIlIII[0]);
        EnumC0014o[] enumC0014oArr = new EnumC0014o[lllIIIlIlIII[1]];
        enumC0014oArr[lllIIIlIlIII[0]] = SOUTH;
        $VALUES = enumC0014oArr;
    }

    private static void lIIIlIIlIIIlllI() {
        lllIIIlIIlll = new String[lllIIIlIlIII[1]];
        lllIIIlIIlll[lllIIIlIlIII[0]] = lIIIlIIlIIIllIl("HSYlASc=", "NipUo");
    }

    public static EnumC0014o valueOf(String str) {
        return (EnumC0014o) Enum.valueOf(EnumC0014o.class, str);
    }

    public static EnumC0014o[] values() {
        return (EnumC0014o[]) $VALUES.clone();
    }

    private static String lIIIlIIlIIIllIl(String lllllllllllllllIIllIllllIIIIllII, String lllllllllllllllIIllIllllIIIIlIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIllIllllIIIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIllllIIIIlIll.toCharArray();
        int lllllllllllllllIIllIllllIIIIlIII = lllIIIlIlIII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int lllllllllllllllIIllIllllIIIIIIII = lllIIIlIlIII[0];
        while (lIIIlIIlIIlIIII(lllllllllllllllIIllIllllIIIIIIII, length)) {
            sb.append((char) (charArray2[lllllllllllllllIIllIllllIIIIIIII] ^ charArray[lllllllllllllllIIllIllllIIIIlIII % charArray.length]));
            "".length();
            lllllllllllllllIIllIllllIIIIlIII++;
            lllllllllllllllIIllIllllIIIIIIII++;
            "".length();
            if ((-"   ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
