package s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.h  reason: invalid package */
/* loaded from: squire-gorillas-0.2.1.jar:s/l/l/r/o/q/-/a/i/g/i/r/u/e/s/h.class */
public final class h {
    private static final /* synthetic */ h[] $VALUES;
    public static final /* synthetic */ h RIGOUR;
    private static /* synthetic */ String[] llIIlIIlIlII;
    private final /* synthetic */ Prayer mapped;
    public static final /* synthetic */ h EAGLE_EYE;
    private static /* synthetic */ int[] llIIlIIlIlIl;

    private static void lllllIIlllIIlI() {
        llIIlIIlIlII = new String[llIIlIIlIlIl[2]];
        llIIlIIlIlII[llIIlIIlIlIl[0]] = lllllIIlllIIII("LwagkjDnDjE=", "rpcVN");
        llIIlIIlIlII[llIIlIIlIlIl[1]] = lllllIIlllIIIl("+3nfHq+JXi2XYQGeqE8UzQ==", "uLipt");
    }

    private static String lllllIIlllIIIl(String lllllllllllllllIlIlIIIIIlIlIIIIl, String lllllllllllllllIlIlIIIIIlIlIIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIIIlIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIIIlIlIIIII.getBytes(StandardCharsets.UTF_8)), llIIlIIlIlIl[3]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlIIlIlIl[2], lllllllllllllllIlIlIIIIIlIlIIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIIlIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIIIIlIlIIIlI) {
            lllllllllllllllIlIlIIIIIlIlIIIlI.printStackTrace();
            return null;
        }
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    private h(String str, int i, Prayer prayer) {
        this.mapped = prayer;
    }

    private static String lllllIIlllIIII(String lllllllllllllllIlIlIIIIIlIlIlllI, String lllllllllllllllIlIlIIIIIlIlIllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIIIlIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIIIlIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIIIIIlIllIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIIIIlIllIIII.init(llIIlIIlIlIl[2], lllllllllllllllIlIlIIIIIlIllIIIl);
            return new String(lllllllllllllllIlIlIIIIIlIllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIIlIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIIIIlIlIllll) {
            lllllllllllllllIlIlIIIIIlIlIllll.printStackTrace();
            return null;
        }
    }

    public Prayer C() {
        return this.mapped;
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    static {
        lllllIIlllIIll();
        lllllIIlllIIlI();
        RIGOUR = new h(llIIlIIlIlII[llIIlIIlIlIl[0]], llIIlIIlIlIl[0], Prayer.RIGOUR);
        EAGLE_EYE = new h(llIIlIIlIlII[llIIlIIlIlIl[1]], llIIlIIlIlIl[1], Prayer.EAGLE_EYE);
        h[] hVarArr = new h[llIIlIIlIlIl[2]];
        hVarArr[llIIlIIlIlIl[0]] = RIGOUR;
        hVarArr[llIIlIIlIlIl[1]] = EAGLE_EYE;
        $VALUES = hVarArr;
    }

    private static void lllllIIlllIIll() {
        llIIlIIlIlIl = new int[4];
        llIIlIIlIlIl[0] = ((188 ^ 170) ^ (26 ^ 23)) & (((((162 + 9) - 31) + 32) ^ (((104 + 34) - 20) + 65)) ^ (-" ".length()));
        llIIlIIlIlIl[1] = " ".length();
        llIIlIIlIlIl[2] = "  ".length();
        llIIlIIlIlIl[3] = 0 ^ 8;
    }
}
