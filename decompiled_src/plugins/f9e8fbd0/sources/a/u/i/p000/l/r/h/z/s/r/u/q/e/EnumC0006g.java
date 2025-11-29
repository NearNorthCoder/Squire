package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Prayer;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.g  reason: invalid package and case insensitive filesystem */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/g.class */
public final class EnumC0006g {
    private static /* synthetic */ String[] lIllIlIlIIIII;
    public static final /* synthetic */ EnumC0006g MYSTIC_MIGHT;
    public static final /* synthetic */ EnumC0006g AUGURY;
    private final /* synthetic */ Prayer prayer;
    private static /* synthetic */ int[] lIllIlIlIIIIl;
    private static final /* synthetic */ EnumC0006g[] $VALUES;

    private static boolean llIIIllllllIIII(int i, int i2) {
        return i < i2;
    }

    private static void llIIIlllllIllll() {
        lIllIlIlIIIIl = new int[3];
        lIllIlIlIIIIl[0] = (10 ^ 45) & ((37 ^ 2) ^ (-1));
        lIllIlIlIIIIl[1] = " ".length();
        lIllIlIlIIIIl[2] = "  ".length();
    }

    public static EnumC0006g[] values() {
        return (EnumC0006g[]) $VALUES.clone();
    }

    public static EnumC0006g valueOf(String str) {
        return (EnumC0006g) Enum.valueOf(EnumC0006g.class, str);
    }

    private static void llIIIlllllIlllI() {
        lIllIlIlIIIII = new String[lIllIlIlIIIIl[2]];
        lIllIlIlIIIII[lIllIlIlIIIIl[0]] = llIIIlllllIllIl("AD43JhgOOCk7FgUz", "MgdrQ");
        lIllIlIlIIIII[lIllIlIlIIIIl[1]] = llIIIlllllIllIl("JRYdBDc9", "dCZQe");
    }

    private EnumC0006g(String str, int i, Prayer prayer) {
        this.prayer = prayer;
    }

    static {
        llIIIlllllIllll();
        llIIIlllllIlllI();
        MYSTIC_MIGHT = new EnumC0006g(lIllIlIlIIIII[lIllIlIlIIIIl[0]], lIllIlIlIIIIl[0], Prayer.MYSTIC_MIGHT);
        AUGURY = new EnumC0006g(lIllIlIlIIIII[lIllIlIlIIIIl[1]], lIllIlIlIIIIl[1], Prayer.AUGURY);
        EnumC0006g[] enumC0006gArr = new EnumC0006g[lIllIlIlIIIIl[2]];
        enumC0006gArr[lIllIlIlIIIIl[0]] = MYSTIC_MIGHT;
        enumC0006gArr[lIllIlIlIIIIl[1]] = AUGURY;
        $VALUES = enumC0006gArr;
    }

    private static String llIIIlllllIllIl(String llllllllllllllIllIIIlllIIllIllIl, String llllllllllllllIllIIIlllIIllIllII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIIlllIIllIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIIIlllIIllIlIlI = llllllllllllllIllIIIlllIIllIllII.toCharArray();
        int llllllllllllllIllIIIlllIIllIlIIl = lIllIlIlIIIIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int llllllllllllllIllIIIlllIIllIIIIl = lIllIlIlIIIIl[0];
        while (llIIIllllllIIII(llllllllllllllIllIIIlllIIllIIIIl, length)) {
            char llllllllllllllIllIIIlllIIllIlllI = charArray[llllllllllllllIllIIIlllIIllIIIIl];
            sb.append((char) (llllllllllllllIllIIIlllIIllIlllI ^ llllllllllllllIllIIIlllIIllIlIlI[llllllllllllllIllIIIlllIIllIlIIl % llllllllllllllIllIIIlllIIllIlIlI.length]));
            "".length();
            llllllllllllllIllIIIlllIIllIlIIl++;
            llllllllllllllIllIIIlllIIllIIIIl++;
            "".length();
            if ((94 ^ 90) < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public Prayer r() {
        return this.prayer;
    }
}
