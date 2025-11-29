package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.c  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/c.class */
public final class EnumC0054c {
    private final /* synthetic */ int x1;
    private final /* synthetic */ int y2;
    private static /* synthetic */ int[] lIlIIlIll;
    public static final /* synthetic */ EnumC0054c EAST;
    private final /* synthetic */ int x2;
    public static final /* synthetic */ EnumC0054c NORTH;
    private static final /* synthetic */ EnumC0054c[] $VALUES;
    private final /* synthetic */ int y1;
    public static final /* synthetic */ EnumC0054c WEST;
    private static /* synthetic */ String[] lIlIIlIlI;

    private static boolean lIIlIIIlllI(int i2, int i3) {
        return i2 < i3;
    }

    public int v() {
        return this.y2;
    }

    private static boolean lIIlIIIllll(int i2, int i3) {
        return i2 >= i3;
    }

    public int s() {
        return this.x1;
    }

    private static void lIIlIIIllIl() {
        lIlIIlIll = new int[16];
        lIlIIlIll[0] = (104 ^ 55) & ((38 ^ 121) ^ (-1));
        lIlIIlIll[1] = "  ".length();
        lIlIIlIll[2] = 108 ^ 100;
        lIlIIlIll[3] = (35 ^ 7) ^ (166 ^ 143);
        lIlIIlIll[4] = (-26673) & 27903;
        lIlIIlIll[5] = (-((-1063) & 1855)) & (-26631) & 28671;
        lIlIIlIll[6] = (-((-20547) & 31587)) & (-20485) & 32767;
        lIlIIlIll[7] = (-((-2249) & 30925)) & (-2579) & 32511;
        lIlIIlIll[8] = " ".length();
        lIlIIlIll[9] = (-((-3843) & 28643)) & (-513) & 26607;
        lIlIIlIll[10] = (-((-13665) & 32767)) & (-12353) & 32767;
        lIlIIlIll[11] = (-((-1409) & 24549)) & (-8321) & 32767;
        lIlIIlIll[12] = (-((-12027) & 28415)) & (-129) & 17837;
        lIlIIlIll[13] = (-12961) & 14319;
        lIlIIlIll[14] = (-(81 ^ 70)) & (-4737) & 6135;
        lIlIIlIll[15] = "   ".length();
    }

    private static String lIIlIIIlIll(String llIIIIIllIIIlIl, String llIIIIIllIIIlII) {
        String llIIIIIllIIIlIl2 = new String(Base64.getDecoder().decode(llIIIIIllIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIIIIllIIIIll = new StringBuilder();
        char[] llIIIIIllIIIIlI = llIIIIIllIIIlII.toCharArray();
        int llIIIIIllIIIIIl = lIlIIlIll[0];
        char[] charArray = llIIIIIllIIIlIl2.toCharArray();
        int llIIIIIlIlllIlI = charArray.length;
        int i2 = lIlIIlIll[0];
        while (lIIlIIIlllI(i2, llIIIIIlIlllIlI)) {
            llIIIIIllIIIIll.append((char) (charArray[i2] ^ llIIIIIllIIIIlI[llIIIIIllIIIIIl % llIIIIIllIIIIlI.length]));
            "".length();
            llIIIIIllIIIIIl++;
            i2++;
            "".length();
            if ((67 ^ 71) <= ((243 ^ 168) & ((250 ^ 161) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(llIIIIIllIIIIll);
    }

    public int t() {
        return this.x2;
    }

    private EnumC0054c(String str, int i2, int i3, int i4, int i5, int i6) {
        this.x1 = i3;
        this.x2 = i4;
        this.y1 = i5;
        this.y2 = i6;
    }

    public static EnumC0054c[] values() {
        return (EnumC0054c[]) $VALUES.clone();
    }

    static {
        lIIlIIIllIl();
        lIIlIIIllII();
        WEST = new EnumC0054c(lIlIIlIlI[lIlIIlIll[0]], lIlIIlIll[0], lIlIIlIll[4], lIlIIlIll[5], lIlIIlIll[6], lIlIIlIll[7]);
        NORTH = new EnumC0054c(lIlIIlIlI[lIlIIlIll[8]], lIlIIlIll[8], lIlIIlIll[9], lIlIIlIll[10], lIlIIlIll[11], lIlIIlIll[12]);
        EAST = new EnumC0054c(lIlIIlIlI[lIlIIlIll[1]], lIlIIlIll[1], lIlIIlIll[13], lIlIIlIll[14], lIlIIlIll[6], lIlIIlIll[7]);
        EnumC0054c[] enumC0054cArr = new EnumC0054c[lIlIIlIll[15]];
        enumC0054cArr[lIlIIlIll[0]] = WEST;
        enumC0054cArr[lIlIIlIll[8]] = NORTH;
        enumC0054cArr[lIlIIlIll[1]] = EAST;
        $VALUES = enumC0054cArr;
    }

    public int u() {
        return this.y1;
    }

    private static String lIIlIIIlIlI(String llIIIIIllIlIlIl, String llIIIIIllIlIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIIIllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIlIll[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIIIIllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIIIllIlIllI) {
            llIIIIIllIlIllI.printStackTrace();
            return null;
        }
    }

    public WorldPoint c(int i2) {
        if (!lIIlIIlIIII(i2, lIlIIlIll[1]) || lIIlIIlIIIl(i2)) {
            return null;
        }
        return new WorldPoint(this.x1 + lIlIIlIll[2] + i2, this.y1 + lIlIIlIll[3], lIlIIlIll[0]);
    }

    public static EnumC0054c valueOf(String str) {
        return (EnumC0054c) Enum.valueOf(EnumC0054c.class, str);
    }

    private static boolean lIIlIIlIIII(int i2, int i3) {
        return i2 <= i3;
    }

    @Nullable
    public static EnumC0054c a(WorldPoint worldPoint) {
        EnumC0054c[] values = values();
        int llIIIIIlllIIIll = values.length;
        int i2 = lIlIIlIll[0];
        while (lIIlIIIlllI(i2, llIIIIIlllIIIll)) {
            EnumC0054c enumC0054c = values[i2];
            if (lIIlIIIllll(worldPoint.getX(), enumC0054c.s()) && lIIlIIlIIII(worldPoint.getX(), enumC0054c.t()) && lIIlIIIllll(worldPoint.getY(), enumC0054c.u()) && lIIlIIlIIII(worldPoint.getY(), enumC0054c.v())) {
                return enumC0054c;
            }
            i2++;
            "".length();
            if ("   ".length() <= "  ".length()) {
                return null;
            }
        }
        return null;
    }

    private static boolean lIIlIIlIIIl(int i2) {
        return i2 < 0;
    }

    private static void lIIlIIIllII() {
        lIlIIlIlI = new String[lIlIIlIll[15]];
        lIlIIlIlI[lIlIIlIll[0]] = lIIlIIIlIlI("QTE3PuR8PEs=", "WfeCl");
        lIlIIlIlI[lIlIIlIll[8]] = lIIlIIIlIlI("XoP43WSZM9k=", "kcxcR");
        lIlIIlIlI[lIlIIlIll[1]] = lIIlIIIlIll("Ixs6MQ==", "fZieZ");
    }
}
