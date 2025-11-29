package s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.h  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-tutorial-island-0.1.0.jar:s/r/s/o/l/t/t/l/r/a/-/i/n/d/u/-/q/i/i/e/a/u/h.class */
public final class EnumC0007h {
    private static /* synthetic */ int[] lIlIIIllllIlI;
    private static /* synthetic */ String[] lIlIIIllllIIl;
    public static final /* synthetic */ EnumC0007h TUTORIAL_ISLAND;
    private final /* synthetic */ String questName;
    private static final /* synthetic */ EnumC0007h[] $VALUES;

    private static String lIlllIIIlIlIlII(String llllllllllllllIlllIIIIllIllIllIl, String llllllllllllllIlllIIIIllIllIllII) {
        try {
            SecretKeySpec llllllllllllllIlllIIIIllIlllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIIllIllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIIIllIllIllll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIIIllIllIllll.init(lIlIIIllllIlI[2], llllllllllllllIlllIIIIllIlllIIII);
            return new String(llllllllllllllIlllIIIIllIllIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIIllIllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIIIllIllIlllI) {
            llllllllllllllIlllIIIIllIllIlllI.printStackTrace();
            return null;
        }
    }

    private static String lIlllIIIlIlIlIl(String llllllllllllllIlllIIIIllIllllIlI, String llllllllllllllIlllIIIIllIllllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIIllIllllIIl.getBytes(StandardCharsets.UTF_8)), lIlIIIllllIlI[3]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIIllllIlI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIIllIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIIIllIllllIll) {
            llllllllllllllIlllIIIIllIllllIll.printStackTrace();
            return null;
        }
    }

    public static EnumC0007h[] values() {
        return (EnumC0007h[]) $VALUES.clone();
    }

    private static void lIlllIIIlIlIlll() {
        lIlIIIllllIlI = new int[4];
        lIlIIIllllIlI[0] = (38 ^ 10) & ((96 ^ 76) ^ (-1));
        lIlIIIllllIlI[1] = " ".length();
        lIlIIIllllIlI[2] = "  ".length();
        lIlIIIllllIlI[3] = 121 ^ 113;
    }

    public static EnumC0007h valueOf(String str) {
        return (EnumC0007h) Enum.valueOf(EnumC0007h.class, str);
    }

    private static void lIlllIIIlIlIllI() {
        lIlIIIllllIIl = new String[lIlIIIllllIlI[2]];
        lIlIIIllllIIl[lIlIIIllllIlI[0]] = lIlllIIIlIlIlII("ESfYeJh/dXTaEkZovfXAiw==", "fUtws");
        lIlIIIllllIIl[lIlIIIllllIlI[1]] = lIlllIIIlIlIlIl("x8k/kn8P/NYMujql6JWVpA==", "QrvFE");
    }

    static {
        lIlllIIIlIlIlll();
        lIlllIIIlIlIllI();
        TUTORIAL_ISLAND = new EnumC0007h(lIlIIIllllIIl[lIlIIIllllIlI[0]], lIlIIIllllIlI[0], lIlIIIllllIIl[lIlIIIllllIlI[1]]);
        EnumC0007h[] enumC0007hArr = new EnumC0007h[lIlIIIllllIlI[1]];
        enumC0007hArr[lIlIIIllllIlI[0]] = TUTORIAL_ISLAND;
        $VALUES = enumC0007hArr;
    }

    private EnumC0007h(String str, int i, String str2) {
        this.questName = str2;
    }
}
