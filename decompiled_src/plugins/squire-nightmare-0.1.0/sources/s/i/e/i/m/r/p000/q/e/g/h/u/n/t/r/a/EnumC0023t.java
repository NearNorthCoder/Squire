package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.t  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/t.class */
public final class EnumC0023t {
    public static final /* synthetic */ EnumC0023t NONE;
    private static final /* synthetic */ EnumC0023t[] $VALUES;
    private static /* synthetic */ int[] llllIIllIIIl;
    private static /* synthetic */ String[] llllIIlIllll;
    public static final /* synthetic */ EnumC0023t GOBLIN_PAINT_CANNON;
    public static final /* synthetic */ EnumC0023t HAM_JOINT;
    private final /* synthetic */ int itemID;

    public int bH() {
        return this.itemID;
    }

    public static EnumC0023t valueOf(String str) {
        return (EnumC0023t) Enum.valueOf(EnumC0023t.class, str);
    }

    private static void lIIIllllllIllII() {
        llllIIllIIIl = new int[8];
        llllIIllIIIl[0] = " ".length() & (" ".length() ^ (-1));
        llllIIllIIIl[1] = (-((-13177) & 32633)) & (-585) & 32767;
        llllIIllIIIl[2] = " ".length();
        llllIIllIIIl[3] = (-9354) & 32713;
        llllIIllIIIl[4] = "  ".length();
        llllIIllIIIl[5] = -" ".length();
        llllIIllIIIl[6] = "   ".length();
        llllIIllIIIl[7] = "   ".length() ^ (44 ^ 39);
    }

    public static EnumC0023t[] values() {
        return (EnumC0023t[]) $VALUES.clone();
    }

    private static String lIIIllllllIIllI(String lllllllllllllllIIlIlllIlIlIllIIl, String lllllllllllllllIIlIlllIlIlIllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIlIlIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIllIIIl[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIlIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlllIlIlIllIlI) {
            lllllllllllllllIIlIlllIlIlIllIlI.printStackTrace();
            return null;
        }
    }

    private static String lIIIllllllIlIII(String lllllllllllllllIIlIlllIlIlIIllII, String lllllllllllllllIIlIlllIlIlIIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllIlIlIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIlIlIIlIlI.getBytes(StandardCharsets.UTF_8)), llllIIllIIIl[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIllIIIl[4], lllllllllllllllIIlIlllIlIlIIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIlIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlllIlIlIIllIl) {
            lllllllllllllllIIlIlllIlIlIIllIl.printStackTrace();
            return null;
        }
    }

    private EnumC0023t(String str, int i, int i2) {
        this.itemID = i2;
    }

    private static void lIIIllllllIlIIl() {
        llllIIlIllll = new String[llllIIllIIIl[6]];
        llllIIlIllll[llllIIllIIIl[0]] = lIIIllllllIIllI("GwNgQyfU5PmmDHGsEBzU+DIWA4Y8Roz7", "SyunI");
        llllIIlIllll[llllIIllIIIl[2]] = lIIIllllllIIllI("oOmRTyJpx3TB6FnQk/EwHg==", "bhPlL");
        llllIIlIllll[llllIIllIIIl[4]] = lIIIllllllIlIII("Ojmy7VdYUsY=", "XoETw");
    }

    static {
        lIIIllllllIllII();
        lIIIllllllIlIIl();
        GOBLIN_PAINT_CANNON = new EnumC0023t(llllIIlIllll[llllIIllIIIl[0]], llllIIllIIIl[0], llllIIllIIIl[1]);
        HAM_JOINT = new EnumC0023t(llllIIlIllll[llllIIllIIIl[2]], llllIIllIIIl[2], llllIIllIIIl[3]);
        NONE = new EnumC0023t(llllIIlIllll[llllIIllIIIl[4]], llllIIllIIIl[4], llllIIllIIIl[5]);
        EnumC0023t[] enumC0023tArr = new EnumC0023t[llllIIllIIIl[6]];
        enumC0023tArr[llllIIllIIIl[0]] = GOBLIN_PAINT_CANNON;
        enumC0023tArr[llllIIllIIIl[2]] = HAM_JOINT;
        enumC0023tArr[llllIIllIIIl[4]] = NONE;
        $VALUES = enumC0023tArr;
    }
}
