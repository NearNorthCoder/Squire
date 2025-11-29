package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.t  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/t.class */
public final class EnumC0071t {
    public static final /* synthetic */ EnumC0071t AUGURY;
    public static final /* synthetic */ EnumC0071t MYSTIC_MIGHT;
    private static /* synthetic */ int[] lIllIlIllIl;
    private static final /* synthetic */ EnumC0071t[] $VALUES;
    private final /* synthetic */ Prayer mapped;
    private static /* synthetic */ String[] lIllIlIllII;

    private static String lIIlIlllIlIIll(String llllllllllllllllIlIlIIIlIlIllIlI, String llllllllllllllllIlIlIIIlIlIllIIl) {
        try {
            SecretKeySpec llllllllllllllllIlIlIIIlIlIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIIlIlIllIIl.getBytes(StandardCharsets.UTF_8)), lIllIlIllIl[3]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIlIllIl[2], llllllllllllllllIlIlIIIlIlIlllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIIlIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIIIlIlIllIll) {
            llllllllllllllllIlIlIIIlIlIllIll.printStackTrace();
            return null;
        }
    }

    public static EnumC0071t[] values() {
        return (EnumC0071t[]) $VALUES.clone();
    }

    private EnumC0071t(String str, int i, Prayer prayer) {
        this.mapped = prayer;
    }

    static {
        lIIlIlllIlIlIl();
        lIIlIlllIlIlII();
        AUGURY = new EnumC0071t(lIllIlIllII[lIllIlIllIl[0]], lIllIlIllIl[0], Prayer.AUGURY);
        MYSTIC_MIGHT = new EnumC0071t(lIllIlIllII[lIllIlIllIl[1]], lIllIlIllIl[1], Prayer.MYSTIC_MIGHT);
        EnumC0071t[] enumC0071tArr = new EnumC0071t[lIllIlIllIl[2]];
        enumC0071tArr[lIllIlIllIl[0]] = AUGURY;
        enumC0071tArr[lIllIlIllIl[1]] = MYSTIC_MIGHT;
        $VALUES = enumC0071tArr;
    }

    private static String lIIlIlllIlIIlI(String llllllllllllllllIlIlIIIlIlIIllIl, String llllllllllllllllIlIlIIIlIlIIllII) {
        try {
            SecretKeySpec llllllllllllllllIlIlIIIlIlIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIIlIlIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIlIIIlIlIIllll = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIlIIIlIlIIllll.init(lIllIlIllIl[2], llllllllllllllllIlIlIIIlIlIlIIII);
            return new String(llllllllllllllllIlIlIIIlIlIIllll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIIlIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIIIlIlIIlllI) {
            llllllllllllllllIlIlIIIlIlIIlllI.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlllIlIlII() {
        lIllIlIllII = new String[lIllIlIllIl[2]];
        lIllIlIllII[lIllIlIllIl[0]] = lIIlIlllIlIIlI("fyxLdzm8u44=", "GKVoC");
        lIllIlIllII[lIllIlIllIl[1]] = lIIlIlllIlIIll("FTtSVjqONeaRm45GWn+KeA==", "PvSfR");
    }

    public Prayer ag() {
        return this.mapped;
    }

    private static void lIIlIlllIlIlIl() {
        lIllIlIllIl = new int[4];
        lIllIlIllIl[0] = (99 ^ 89) & ((84 ^ 110) ^ (-1));
        lIllIlIllIl[1] = " ".length();
        lIllIlIllIl[2] = "  ".length();
        lIllIlIllIl[3] = 93 ^ 85;
    }

    public static EnumC0071t valueOf(String str) {
        return (EnumC0071t) Enum.valueOf(EnumC0071t.class, str);
    }
}
