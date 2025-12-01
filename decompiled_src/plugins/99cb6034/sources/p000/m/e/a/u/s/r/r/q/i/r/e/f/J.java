package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.J  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/J.class */
public final class J {
    private final /* synthetic */ EnumC0022av produceSeed;
    public static final /* synthetic */ J STRAWBERRIES;
    public static final /* synthetic */ J ONIONS;
    private static final /* synthetic */ J[] $VALUES;
    public static final /* synthetic */ J WATERMELON;
    private static /* synthetic */ int[] llIIIIlIIIlI;
    private final /* synthetic */ H type;
    private static /* synthetic */ String[] llIIIIlIIIIl;

    private static String llllIIlIIIIlll(String lllllllllllllllIlIlIllIIIlllIlIl, String lllllllllllllllIlIlIllIIIlllIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIllIIIlllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIIlIIIlI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIllIIIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIllIIIlllIllI) {
            lllllllllllllllIlIlIllIIIlllIllI.printStackTrace();
            return null;
        }
    }

    public static J[] values() {
        return (J[]) $VALUES.clone();
    }

    private J(String str, int i, H h, EnumC0022av enumC0022av) {
        this.type = h;
        this.produceSeed = enumC0022av;
    }

    public H aE() {
        return this.type;
    }

    private static void llllIIlIIIlIII() {
        llIIIIlIIIIl = new String[llIIIIlIIIlI[3]];
        llIIIIlIIIIl[llIIIIlIIIlI[0]] = llllIIlIIIIlll("tV1+PtRWkomdt6HxqrFSCQ==", "JLELm");
        llIIIIlIIIIl[llIIIIlIIIlI[1]] = llllIIlIIIIlll("mk4QHezWY2M=", "XMPSN");
        llIIIIlIIIIl[llIIIIlIIIlI[2]] = llllIIlIIIIlll("PattkUD8czRwLX4NqICc3w==", "EiNXF");
    }

    private static void llllIIlIIIlIIl() {
        llIIIIlIIIlI = new int[4];
        llIIIIlIIIlI[0] = ((220 ^ 160) ^ (49 ^ 110)) & (((97 ^ 119) ^ (52 ^ 1)) ^ (-" ".length()));
        llIIIIlIIIlI[1] = " ".length();
        llIIIIlIIIlI[2] = "  ".length();
        llIIIIlIIIlI[3] = "   ".length();
    }

    public EnumC0022av aD() {
        return this.produceSeed;
    }

    public static J valueOf(String str) {
        return (J) Enum.valueOf(J.class, str);
    }

    static {
        llllIIlIIIlIIl();
        llllIIlIIIlIII();
        WATERMELON = new J(llIIIIlIIIIl[llIIIIlIIIlI[0]], llIIIIlIIIlI[0], H.SUPERCOMPOST, EnumC0022av.WATERMELON);
        ONIONS = new J(llIIIIlIIIIl[llIIIIlIIIlI[1]], llIIIIlIIIlI[1], H.COMPOST, EnumC0022av.ONIONS);
        STRAWBERRIES = new J(llIIIIlIIIIl[llIIIIlIIIlI[2]], llIIIIlIIIlI[2], H.COMPOST, EnumC0022av.STRAWEBERRIES);
        J[] jArr = new J[llIIIIlIIIlI[3]];
        jArr[llIIIIlIIIlI[0]] = WATERMELON;
        jArr[llIIIIlIIIlI[1]] = ONIONS;
        jArr[llIIIIlIIIlI[2]] = STRAWBERRIES;
        $VALUES = jArr;
    }
}
