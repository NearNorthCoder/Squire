package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.f  reason: invalid package and case insensitive filesystem */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/f.class */
public final class EnumC0005f {
    private final /* synthetic */ int itemID;
    private static /* synthetic */ int[] lIllIlIIIlIll;
    public static final /* synthetic */ EnumC0005f SHARK;
    public static final /* synthetic */ EnumC0005f ANGLER_FISH;
    public static final /* synthetic */ EnumC0005f MANTA_RAY;
    private static final /* synthetic */ EnumC0005f[] $VALUES;
    public static final /* synthetic */ EnumC0005f KARAMBWAN;
    public static final /* synthetic */ EnumC0005f MONKFISH;
    private static /* synthetic */ String[] lIllIlIIIIlll;

    private EnumC0005f(String str, int i, int i2) {
        this.itemID = i2;
    }

    private static boolean llIIIlllIllllIl(int i, int i2) {
        return i < i2;
    }

    private static String llIIIlllIllIlll(String llllllllllllllIllIIIlllllIIIlllI, String llllllllllllllIllIIIlllllIIlIIlI) {
        String llllllllllllllIllIIIlllllIIIlllI2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIIlllllIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIlllllIIlIIIl = new StringBuilder();
        char[] charArray = llllllllllllllIllIIIlllllIIlIIlI.toCharArray();
        int llllllllllllllIllIIIlllllIIIllll = lIllIlIIIlIll[0];
        char[] charArray2 = llllllllllllllIllIIIlllllIIIlllI2.toCharArray();
        int length = charArray2.length;
        int i = lIllIlIIIlIll[0];
        while (llIIIlllIllllIl(i, length)) {
            char llllllllllllllIllIIIlllllIIlIlII = charArray2[i];
            llllllllllllllIllIIIlllllIIlIIIl.append((char) (llllllllllllllIllIIIlllllIIlIlII ^ charArray[llllllllllllllIllIIIlllllIIIllll % charArray.length]));
            "".length();
            llllllllllllllIllIIIlllllIIIllll++;
            i++;
            "".length();
            if ((186 ^ 190) > (59 ^ 63)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIIlllllIIlIIIl);
    }

    private static String llIIIlllIllIIIl(String llllllllllllllIllIIIlllllIlIIIll, String llllllllllllllIllIIIlllllIlIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlllllIlIIIlI.getBytes(StandardCharsets.UTF_8)), lIllIlIIIlIll[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIlIIIlIll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlllllIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlllllIlIIlII) {
            llllllllllllllIllIIIlllllIlIIlII.printStackTrace();
            return null;
        }
    }

    private static String llIIIlllIllIIlI(String llllllllllllllIllIIIlllllIllIIII, String llllllllllllllIllIIIlllllIlIllll) {
        try {
            SecretKeySpec llllllllllllllIllIIIlllllIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlllllIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIlllllIllIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIlllllIllIIlI.init(lIllIlIIIlIll[4], llllllllllllllIllIIIlllllIllIIll);
            return new String(llllllllllllllIllIIIlllllIllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlllllIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlllllIllIIIl) {
            llllllllllllllIllIIIlllllIllIIIl.printStackTrace();
            return null;
        }
    }

    private static void llIIIlllIlllIII() {
        lIllIlIIIIlll = new String[lIllIlIIIlIll[10]];
        lIllIlIIIIlll[lIllIlIIIlIll[0]] = llIIIlllIllIIIl("n8tZOn8jSZfyVoKQI9sO5w==", "epbGQ");
        lIllIlIIIIlll[lIllIlIIIlIll[2]] = llIIIlllIllIIlI("jYOclkcNQvc=", "GtOqn");
        lIllIlIIIIlll[lIllIlIIIlIll[4]] = llIIIlllIllIIIl("KlG5Tb8ztumwR1QWvY6R/g==", "oyVCN");
        lIllIlIIIIlll[lIllIlIIIlIll[6]] = llIIIlllIllIIlI("73TDkdpMVA0E5khCLuSYzQ==", "ArQem");
        lIllIlIIIIlll[lIllIlIIIlIll[8]] = llIIIlllIllIlll("LzsqMxwrJyw=", "btdxZ");
    }

    static {
        llIIIlllIllllII();
        llIIIlllIlllIII();
        MANTA_RAY = new EnumC0005f(lIllIlIIIIlll[lIllIlIIIlIll[0]], lIllIlIIIlIll[0], lIllIlIIIlIll[1]);
        SHARK = new EnumC0005f(lIllIlIIIIlll[lIllIlIIIlIll[2]], lIllIlIIIlIll[2], lIllIlIIIlIll[3]);
        KARAMBWAN = new EnumC0005f(lIllIlIIIIlll[lIllIlIIIlIll[4]], lIllIlIIIlIll[4], lIllIlIIIlIll[5]);
        ANGLER_FISH = new EnumC0005f(lIllIlIIIIlll[lIllIlIIIlIll[6]], lIllIlIIIlIll[6], lIllIlIIIlIll[7]);
        MONKFISH = new EnumC0005f(lIllIlIIIIlll[lIllIlIIIlIll[8]], lIllIlIIIlIll[8], lIllIlIIIlIll[9]);
        EnumC0005f[] enumC0005fArr = new EnumC0005f[lIllIlIIIlIll[10]];
        enumC0005fArr[lIllIlIIIlIll[0]] = MANTA_RAY;
        enumC0005fArr[lIllIlIIIlIll[2]] = SHARK;
        enumC0005fArr[lIllIlIIIlIll[4]] = KARAMBWAN;
        enumC0005fArr[lIllIlIIIlIll[6]] = ANGLER_FISH;
        enumC0005fArr[lIllIlIIIlIll[8]] = MONKFISH;
        $VALUES = enumC0005fArr;
    }

    public static EnumC0005f[] values() {
        return (EnumC0005f[]) $VALUES.clone();
    }

    public static EnumC0005f valueOf(String str) {
        return (EnumC0005f) Enum.valueOf(EnumC0005f.class, str);
    }

    private static void llIIIlllIllllII() {
        lIllIlIIIlIll = new int[12];
        lIllIlIIIlIll[0] = ((251 ^ 166) ^ (94 ^ 86)) & ((((82 ^ 76) & ((217 ^ 199) ^ (-1))) ^ (10 ^ 95)) ^ (-" ".length()));
        lIllIlIIIlIll[1] = (-((-16515) & 28395)) & (-4113) & 16383;
        lIllIlIIIlIll[2] = " ".length();
        lIllIlIIIlIll[3] = (-((-2433) & 20407)) & (-10249) & 28607;
        lIllIlIIIlIll[4] = "  ".length();
        lIllIlIIIlIll[5] = (-((-515) & 21427)) & (-520) & 24575;
        lIllIlIIIlIll[6] = "   ".length();
        lIllIlIIIlIll[7] = (-19041) & 32481;
        lIllIlIIIlIll[8] = 59 ^ 63;
        lIllIlIIIlIll[9] = (-((-24321) & 32629)) & (-129) & 16382;
        lIllIlIIIlIll[10] = (((109 + 173) - 114) + 20) ^ (((107 + 107) - 91) + 62);
        lIllIlIIIlIll[11] = (((41 + 32) - 11) + 115) ^ (((12 + 22) - (-119)) + 32);
    }

    public int q() {
        return this.itemID;
    }
}
