package m.u.a.p000.e.s.q.t.i.r;

import java.awt.image.BufferedImage;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.ui.overlay.infobox.Timer;
import net.runelite.client.util.ImageUtil;
/* renamed from: m.u.a.-.e.s.q.t.i.r.f  reason: invalid package */
/* loaded from: squire-mta-0.2.1.jar:m/u/a/-/e/s/q/t/i/r/f.class */
public class f extends Timer {
    private static /* synthetic */ BufferedImage K;
    private static /* synthetic */ int[] lllIllIIllII;
    private static final /* synthetic */ int J;
    private static /* synthetic */ String[] lllIllIIIlll;

    public f(Plugin plugin) {
        super(42L, ChronoUnit.SECONDS, q(), plugin);
        setTooltip(lllIllIIIlll[lllIllIIllII[0]]);
    }

    private static void lIIIllIIllllIll() {
        lllIllIIllII = new int[4];
        lllIllIIllII[0] = (251 ^ 168) & ((40 ^ 123) ^ (-1));
        lllIllIIllII[1] = " ".length();
        lllIllIIllII[2] = 40 ^ 2;
        lllIllIIllII[3] = "  ".length();
    }

    private static boolean lIIIllIIlllllIl(int i, int i2) {
        return i < i2;
    }

    private static String lIIIllIIlllIlII(String lllllllllllllllIIllIlIIIIIlIlIll, String lllllllllllllllIIllIlIIIIIlIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIIIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIlIIIIIlIllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlIIIIIlIllll.init(lllIllIIllII[3], secretKeySpec);
            return new String(lllllllllllllllIIllIlIIIIIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIIIIIlIlllI) {
            lllllllllllllllIIllIlIIIIIlIlllI.printStackTrace();
            return null;
        }
    }

    private static void lIIIllIIllllIII() {
        lllIllIIIlll = new String[lllIllIIllII[3]];
        lllIllIIIlll[lllIllIIllII[0]] = lIIIllIIlllIIll("FQQXL0o0Aw4jBmEEDi8HMk0JPQsx", "AmzJj");
        lllIllIIIlll[lllIllIIllII[1]] = lIIIllIIlllIlII("rscTX6diuR0EqMcRKYHKgw==", "VvuDj");
    }

    static {
        lIIIllIIllllIll();
        lIIIllIIllllIII();
        J = lllIllIIllII[2];
    }

    private static BufferedImage q() {
        if (lIIIllIIlllllII(K)) {
            return K;
        }
        K = ImageUtil.loadImageResource(f.class, lllIllIIIlll[lllIllIIllII[1]]);
        return K;
    }

    private static String lIIIllIIlllIIll(String lllllllllllllllIIllIlIIIIlIIIIlI, String lllllllllllllllIIllIlIIIIIllllII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIIlIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlIIIIlIIIIII = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIlIIIIIllllII.toCharArray();
        int lllllllllllllllIIllIlIIIIIlllllI = lllIllIIllII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lllIllIIllII[0];
        while (lIIIllIIlllllIl(i, length)) {
            lllllllllllllllIIllIlIIIIlIIIIII.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIllIlIIIIIlllllI % charArray.length]));
            "".length();
            lllllllllllllllIIllIlIIIIIlllllI++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIlIIIIlIIIIII);
    }

    private static boolean lIIIllIIlllllII(Object obj) {
        return obj != null;
    }
}
