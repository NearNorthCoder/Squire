package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.aq  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/aq.class */
public final class EnumC0017aq implements InterfaceC0023aw {
    private static /* synthetic */ int[] llIIIIlIIIII;
    public static final /* synthetic */ EnumC0017aq NOTHING;
    private static final /* synthetic */ EnumC0017aq[] $VALUES;
    public static final /* synthetic */ EnumC0017aq WHITE_BERRY;
    public static final /* synthetic */ EnumC0017aq POISON_IVY;
    private static /* synthetic */ String[] llIIIIIlllll;
    private final /* synthetic */ EnumC0022av produce;
    public static final /* synthetic */ EnumC0017aq DEFAULT;

    public static EnumC0017aq[] values() {
        return (EnumC0017aq[]) $VALUES.clone();
    }

    private static String llllIIlIIIIIIl(String lllllllllllllllIlIlIllIIlIIIIllI, String lllllllllllllllIlIlIllIIlIIIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlIllIIlIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIllIIlIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIIlIIIII[2], lllllllllllllllIlIlIllIIlIIIlIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIllIIlIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIllIIlIIIIlll) {
            lllllllllllllllIlIlIllIIlIIIIlll.printStackTrace();
            return null;
        }
    }

    private static void llllIIlIIIIlII() {
        llIIIIIlllll = new String[llIIIIlIIIII[4]];
        llIIIIIlllll[llIIIIlIIIII[0]] = llllIIlIIIIIIl("1rA1GUqzaOs=", "cGMqd");
        llIIIIIlllll[llIIIIlIIIII[1]] = llllIIlIIIIIlI("WpfrnjnP37A=", "LNCnq");
        llIIIIIlllll[llIIIIlIIIII[2]] = llllIIlIIIIIll("Bi8EJQAOJQgjFwg=", "QgMqE");
        llIIIIIlllll[llIIIIlIIIII[3]] = llllIIlIIIIIlI("n/z4/rx5Drj1QhjS0kThVw==", "cBNzX");
    }

    private static String llllIIlIIIIIll(String lllllllllllllllIlIlIllIIlIIllIll, String lllllllllllllllIlIlIllIIlIIllIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIllIIlIIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIlIllIIlIIllIII = lllllllllllllllIlIlIllIIlIIllIlI.toCharArray();
        int lllllllllllllllIlIlIllIIlIIlIIlI = llIIIIlIIIII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIIIlIIIII[0];
        while (llllIIlIIIIllI(i, length)) {
            char lllllllllllllllIlIlIllIIlIIlllII = charArray[i];
            sb.append((char) (lllllllllllllllIlIlIllIIlIIlllII ^ lllllllllllllllIlIlIllIIlIIllIII[lllllllllllllllIlIlIllIIlIIlIIlI % lllllllllllllllIlIlIllIIlIIllIII.length]));
            "".length();
            lllllllllllllllIlIlIllIIlIIlIIlI++;
            i++;
            "".length();
            if ((-" ".length()) >= ((41 ^ 50) & ((141 ^ 150) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llllIIlIIIIllI(int i, int i2) {
        return i < i2;
    }

    private EnumC0017aq(String str, int i, EnumC0022av enumC0022av) {
        this.produce = enumC0022av;
    }

    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.InterfaceC0023aw
    public EnumC0022av bf() {
        return this.produce;
    }

    public static EnumC0017aq valueOf(String str) {
        return (EnumC0017aq) Enum.valueOf(EnumC0017aq.class, str);
    }

    private static void llllIIlIIIIlIl() {
        llIIIIlIIIII = new int[6];
        llIIIIlIIIII[0] = (79 ^ 110) & ((45 ^ 12) ^ (-1));
        llIIIIlIIIII[1] = " ".length();
        llIIIIlIIIII[2] = "  ".length();
        llIIIIlIIIII[3] = "   ".length();
        llIIIIlIIIII[4] = (((123 + 86) - 205) + 147) ^ (((109 + 133) - 234) + 139);
        llIIIIlIIIII[5] = (3 ^ 9) ^ "  ".length();
    }

    private static String llllIIlIIIIIlI(String lllllllllllllllIlIlIllIIlIlIlIll, String lllllllllllllllIlIlIllIIlIlIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIlIllIIlIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIllIIlIlIlIlI.getBytes(StandardCharsets.UTF_8)), llIIIIlIIIII[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIIlIIIII[2], lllllllllllllllIlIlIllIIlIlIlllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIllIIlIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIllIIlIlIllII) {
            lllllllllllllllIlIlIllIIlIlIllII.printStackTrace();
            return null;
        }
    }

    static {
        llllIIlIIIIlIl();
        llllIIlIIIIlII();
        NOTHING = new EnumC0017aq(llIIIIIlllll[llIIIIlIIIII[0]], llIIIIlIIIII[0], null);
        DEFAULT = new EnumC0017aq(llIIIIIlllll[llIIIIlIIIII[1]], llIIIIlIIIII[1], EnumC0022av.DEFAULT);
        WHITE_BERRY = new EnumC0017aq(llIIIIIlllll[llIIIIlIIIII[2]], llIIIIlIIIII[2], EnumC0022av.WHITE_BERRY);
        POISON_IVY = new EnumC0017aq(llIIIIIlllll[llIIIIlIIIII[3]], llIIIIlIIIII[3], EnumC0022av.POISON_IVY);
        EnumC0017aq[] enumC0017aqArr = new EnumC0017aq[llIIIIlIIIII[4]];
        enumC0017aqArr[llIIIIlIIIII[0]] = NOTHING;
        enumC0017aqArr[llIIIIlIIIII[1]] = DEFAULT;
        enumC0017aqArr[llIIIIlIIIII[2]] = WHITE_BERRY;
        enumC0017aqArr[llIIIIlIIIII[3]] = POISON_IVY;
        $VALUES = enumC0017aqArr;
    }
}
