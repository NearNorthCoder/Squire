package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.ax  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/ax.class */
public final class EnumC0024ax implements InterfaceC0023aw {
    private final /* synthetic */ EnumC0022av produceSeed;
    private static final /* synthetic */ EnumC0024ax[] $VALUES;
    public static final /* synthetic */ EnumC0024ax GIANT_SEAWEED;
    public static final /* synthetic */ EnumC0024ax NOTHING;
    private static /* synthetic */ String[] lIllllIlllII;
    private static /* synthetic */ int[] lIllllIlllIl;

    private static String lllIlllIllIlIl(String lllllllllllllllIlIllIIIlllIllllI, String lllllllllllllllIlIllIIIlllIllIll) {
        try {
            SecretKeySpec lllllllllllllllIlIllIIIllllIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIIlllIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllIIIllllIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllIIIllllIIIII.init(lIllllIlllIl[2], lllllllllllllllIlIllIIIllllIIIIl);
            return new String(lllllllllllllllIlIllIIIllllIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIIlllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIIIlllIlllll) {
            lllllllllllllllIlIllIIIlllIlllll.printStackTrace();
            return null;
        }
    }

    private EnumC0024ax(String str, int i, EnumC0022av enumC0022av) {
        this.produceSeed = enumC0022av;
    }

    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.InterfaceC0023aw
    public EnumC0022av bf() {
        return this.produceSeed;
    }

    static {
        lllIlllIllIlll();
        lllIlllIllIllI();
        NOTHING = new EnumC0024ax(lIllllIlllII[lIllllIlllIl[0]], lIllllIlllIl[0], null);
        GIANT_SEAWEED = new EnumC0024ax(lIllllIlllII[lIllllIlllIl[1]], lIllllIlllIl[1], EnumC0022av.SEAWEED);
        EnumC0024ax[] enumC0024axArr = new EnumC0024ax[lIllllIlllIl[2]];
        enumC0024axArr[lIllllIlllIl[0]] = NOTHING;
        enumC0024axArr[lIllllIlllIl[1]] = GIANT_SEAWEED;
        $VALUES = enumC0024axArr;
    }

    public static EnumC0024ax[] values() {
        return (EnumC0024ax[]) $VALUES.clone();
    }

    private static void lllIlllIllIllI() {
        lIllllIlllII = new String[lIllllIlllIl[2]];
        lIllllIlllII[lIllllIlllIl[0]] = lllIlllIllIlIl("7KHFsgWw+cA=", "gNiCr");
        lIllllIlllII[lIllllIlllIl[1]] = lllIlllIllIlIl("De+ssfE4XezHXGTTrUf86w==", "zbVzV");
    }

    public static EnumC0024ax valueOf(String str) {
        return (EnumC0024ax) Enum.valueOf(EnumC0024ax.class, str);
    }

    private static void lllIlllIllIlll() {
        lIllllIlllIl = new int[3];
        lIllllIlllIl[0] = (104 ^ 117) & ((54 ^ 43) ^ (-1));
        lIllllIlllIl[1] = " ".length();
        lIllllIlllIl[2] = "  ".length();
    }
}
