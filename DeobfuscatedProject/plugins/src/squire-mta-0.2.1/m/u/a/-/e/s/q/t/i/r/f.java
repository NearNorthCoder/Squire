/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.plugins.Plugin
 *  net.runelite.client.ui.overlay.infobox.Timer
 *  net.runelite.client.util.ImageUtil
 */
package m.u.a.-.e.s.q.t.i.r;

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

public class f
extends Timer {
    private static /* synthetic */ BufferedImage K;
    private static /* synthetic */ int[] lllIllIIllII;
    private static final /* synthetic */ int J;
    private static /* synthetic */ String[] lllIllIIIlll;

    public f(Plugin plugin) {
        super(42L, ChronoUnit.SECONDS, f.q(), plugin);
        this.setTooltip(lllIllIIIlll[lllIllIIllII[0]]);
    }

    private static void lIIIllIIllllIll() {
        lllIllIIllII = new int[4];
        f.lllIllIIllII[0] = (0xFB ^ 0xA8) & ~(0x28 ^ 0x7B);
        f.lllIllIIllII[1] = " ".length();
        f.lllIllIIllII[2] = 0x28 ^ 2;
        f.lllIllIIllII[3] = "  ".length();
    }

    private static boolean lIIIllIIlllllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIllIIlllIlII(String lllllllllllllllIIllIlIIIIIlIllIl, String lllllllllllllllIIllIlIIIIIlIllII) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIIIIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIIIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIlIIIIIlIllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlIIIIIlIllll.init(lllIllIIllII[3], lllllllllllllllIIllIlIIIIIllIIII);
            return new String(lllllllllllllllIIllIlIIIIIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIIIIIlIlllI) {
            lllllllllllllllIIllIlIIIIIlIlllI.printStackTrace();
            return null;
        }
    }

    private static void lIIIllIIllllIII() {
        lllIllIIIlll = new String[lllIllIIllII[3]];
        f.lllIllIIIlll[f.lllIllIIllII[0]] = f.lIIIllIIlllIIll("FQQXL0o0Aw4jBmEEDi8HMk0JPQsx", "AmzJj");
        f.lllIllIIIlll[f.lllIllIIllII[1]] = f.lIIIllIIlllIlII("rscTX6diuR0EqMcRKYHKgw==", "VvuDj");
    }

    static {
        f.lIIIllIIllllIll();
        f.lIIIllIIllllIII();
        J = lllIllIIllII[2];
    }

    private static BufferedImage q() {
        if (f.lIIIllIIlllllII(K)) {
            return K;
        }
        K = ImageUtil.loadImageResource(f.class, (String)lllIllIIIlll[lllIllIIllII[1]]);
        return K;
    }

    private static String lIIIllIIlllIIll(String lllllllllllllllIIllIlIIIIlIIIIlI, String lllllllllllllllIIllIlIIIIlIIIIIl) {
        lllllllllllllllIIllIlIIIIlIIIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIIlIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlIIIIlIIIIII = new StringBuilder();
        char[] lllllllllllllllIIllIlIIIIIllllll = lllllllllllllllIIllIlIIIIlIIIIIl.toCharArray();
        int lllllllllllllllIIllIlIIIIIlllllI = lllIllIIllII[0];
        char[] lllllllllllllllIIllIlIIIIIlllIII = lllllllllllllllIIllIlIIIIlIIIIlI.toCharArray();
        int lllllllllllllllIIllIlIIIIIllIlll = lllllllllllllllIIllIlIIIIIlllIII.length;
        int lllllllllllllllIIllIlIIIIIllIllI = lllIllIIllII[0];
        while (f.lIIIllIIlllllIl(lllllllllllllllIIllIlIIIIIllIllI, lllllllllllllllIIllIlIIIIIllIlll)) {
            char lllllllllllllllIIllIlIIIIlIIIIll = lllllllllllllllIIllIlIIIIIlllIII[lllllllllllllllIIllIlIIIIIllIllI];
            lllllllllllllllIIllIlIIIIlIIIIII.append((char)(lllllllllllllllIIllIlIIIIlIIIIll ^ lllllllllllllllIIllIlIIIIIllllll[lllllllllllllllIIllIlIIIIIlllllI % lllllllllllllllIIllIlIIIIIllllll.length]));
            "".length();
            ++lllllllllllllllIIllIlIIIIIlllllI;
            ++lllllllllllllllIIllIlIIIIIllIllI;
            "".length();
            if (((0x7F ^ 0x70) & ~(0x5B ^ 0x54)) == 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIlIIIIlIIIIII);
    }

    private static boolean lIIIllIIlllllII(Object object) {
        return object != null;
    }
}

