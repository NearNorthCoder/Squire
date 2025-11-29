package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.as  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/as.class */
public final class EnumC0019as implements InterfaceC0023aw {
    private final /* synthetic */ EnumC0022av produceSeed;
    private static /* synthetic */ int[] lIllllIlIlIl;
    public static final /* synthetic */ EnumC0019as NOTHING;
    private static /* synthetic */ String[] lIllllIlIIll;
    public static final /* synthetic */ EnumC0019as DEFAULT;
    public static final /* synthetic */ EnumC0019as GRAPES;
    private static final /* synthetic */ EnumC0019as[] $VALUES;

    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.InterfaceC0023aw
    public EnumC0022av bf() {
        return this.produceSeed;
    }

    public static EnumC0019as[] values() {
        return (EnumC0019as[]) $VALUES.clone();
    }

    private static void lllIlllIlIIlII() {
        lIllllIlIIll = new String[lIllllIlIlIl[3]];
        lIllllIlIIll[lIllllIlIlIl[0]] = lllIlllIlIIIII("wYMSkI22/pU=", "EuMHv");
        lIllllIlIIll[lIllllIlIlIl[1]] = lllIlllIlIIIlI("Kbpk51IlDvg=", "KhrUl");
        lIllllIlIIll[lIllllIlIlIl[2]] = lllIlllIlIIIll("NgonOw0i", "qXfkH");
    }

    private static String lllIlllIlIIIll(String lllllllllllllllIlIllIIlIIIlIlIII, String lllllllllllllllIlIllIIlIIIlIIlll) {
        String lllllllllllllllIlIllIIlIIIlIlIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIIlIIIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIllIIlIIIlIIlIl = lllllllllllllllIlIllIIlIIIlIIlll.toCharArray();
        int lllllllllllllllIlIllIIlIIIlIIlII = lIllllIlIlIl[0];
        char[] charArray = lllllllllllllllIlIllIIlIIIlIlIII2.toCharArray();
        int length = charArray.length;
        int i = lIllllIlIlIl[0];
        while (lllIlllIlIIllI(i, length)) {
            char lllllllllllllllIlIllIIlIIIlIlIIl = charArray[i];
            sb.append((char) (lllllllllllllllIlIllIIlIIIlIlIIl ^ lllllllllllllllIlIllIIlIIIlIIlIl[lllllllllllllllIlIllIIlIIIlIIlII % lllllllllllllllIlIllIIlIIIlIIlIl.length]));
            "".length();
            lllllllllllllllIlIllIIlIIIlIIlII++;
            i++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lllIlllIlIIlIl();
        lllIlllIlIIlII();
        NOTHING = new EnumC0019as(lIllllIlIIll[lIllllIlIlIl[0]], lIllllIlIlIl[0], null);
        DEFAULT = new EnumC0019as(lIllllIlIIll[lIllllIlIlIl[1]], lIllllIlIlIl[1], EnumC0022av.DEFAULT);
        GRAPES = new EnumC0019as(lIllllIlIIll[lIllllIlIlIl[2]], lIllllIlIlIl[2], EnumC0022av.GRAPES);
        EnumC0019as[] enumC0019asArr = new EnumC0019as[lIllllIlIlIl[3]];
        enumC0019asArr[lIllllIlIlIl[0]] = NOTHING;
        enumC0019asArr[lIllllIlIlIl[1]] = DEFAULT;
        enumC0019asArr[lIllllIlIlIl[2]] = GRAPES;
        $VALUES = enumC0019asArr;
    }

    private static void lllIlllIlIIlIl() {
        lIllllIlIlIl = new int[5];
        lIllllIlIlIl[0] = (91 ^ 57) & ((225 ^ 131) ^ (-1));
        lIllllIlIlIl[1] = " ".length();
        lIllllIlIlIl[2] = "  ".length();
        lIllllIlIlIl[3] = "   ".length();
        lIllllIlIlIl[4] = (((118 + 149) - 172) + 68) ^ (((6 + 165) - 47) + 47);
    }

    private static String lllIlllIlIIIII(String lllllllllllllllIlIllIIlIIlIIIlIl, String lllllllllllllllIlIllIIlIIlIIIlII) {
        try {
            SecretKeySpec lllllllllllllllIlIllIIlIIlIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIlIIlIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllllIlIlIl[2], lllllllllllllllIlIllIIlIIlIIlIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIlIIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIIlIIlIIIllI) {
            lllllllllllllllIlIllIIlIIlIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlllIlIIllI(int i, int i2) {
        return i < i2;
    }

    public static EnumC0019as valueOf(String str) {
        return (EnumC0019as) Enum.valueOf(EnumC0019as.class, str);
    }

    private static String lllIlllIlIIIlI(String lllllllllllllllIlIllIIlIIIlllIII, String lllllllllllllllIlIllIIlIIIllIlll) {
        try {
            SecretKeySpec lllllllllllllllIlIllIIlIIIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIlIIIllIlll.getBytes(StandardCharsets.UTF_8)), lIllllIlIlIl[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllllIlIlIl[2], lllllllllllllllIlIllIIlIIIlllIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIlIIIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIIlIIIlllIIl) {
            lllllllllllllllIlIllIIlIIIlllIIl.printStackTrace();
            return null;
        }
    }

    private EnumC0019as(String str, int i, EnumC0022av enumC0022av) {
        this.produceSeed = enumC0022av;
    }
}
