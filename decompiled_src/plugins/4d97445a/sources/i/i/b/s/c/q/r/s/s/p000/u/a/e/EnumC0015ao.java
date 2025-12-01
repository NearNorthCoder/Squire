package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.ao  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/ao.class */
public final class EnumC0015ao {
    private static /* synthetic */ String[] lIlIIIII;
    public static final /* synthetic */ EnumC0015ao DRAGON_BONES;
    public final /* synthetic */ int groundItemId;
    public final /* synthetic */ int itemId;
    private static /* synthetic */ int[] lIlIIIIl;
    private static final /* synthetic */ EnumC0015ao[] $VALUES;

    private static void lIIlIIlIlI() {
        lIlIIIII = new String[lIlIIIIl[3]];
        lIlIIIII[lIlIIIIl[0]] = lIIlIIlIIl("Wx0FlxwkfFhwQxk+wMY8Ng==", "tKrJs");
    }

    static {
        lIIlIIlIll();
        lIIlIIlIlI();
        DRAGON_BONES = new EnumC0015ao(lIlIIIII[lIlIIIIl[0]], lIlIIIIl[0], lIlIIIIl[1], lIlIIIIl[2]);
        EnumC0015ao[] enumC0015aoArr = new EnumC0015ao[lIlIIIIl[3]];
        enumC0015aoArr[lIlIIIIl[0]] = DRAGON_BONES;
        $VALUES = enumC0015aoArr;
    }

    public static EnumC0015ao[] values() {
        return (EnumC0015ao[]) $VALUES.clone();
    }

    private static void lIIlIIlIll() {
        lIlIIIIl = new int[6];
        lIlIIIIl[0] = (47 ^ 15) & ((45 ^ 13) ^ (-1));
        lIlIIIIl[1] = (-((-18203) & 24447)) & (-16641) & 23420;
        lIlIIIIl[2] = (-19995) & 24255;
        lIlIIIIl[3] = " ".length();
        lIlIIIIl[4] = (((27 + 108) - (-2)) + 14) ^ (((83 + 57) - 27) + 46);
        lIlIIIIl[5] = "  ".length();
    }

    public static EnumC0015ao valueOf(String str) {
        return (EnumC0015ao) Enum.valueOf(EnumC0015ao.class, str);
    }

    private EnumC0015ao(String str, int i2, int i3, int i4) {
        this.itemId = i3;
        this.groundItemId = i4;
    }

    private static String lIIlIIlIIl(String lllIIIIIlllIllI, String lllIIIIIlllIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIIIIlllIlIl.getBytes(StandardCharsets.UTF_8)), lIlIIIIl[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIIIl[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIIIIIlllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIIIIlllIlll) {
            lllIIIIIlllIlll.printStackTrace();
            return null;
        }
    }
}
