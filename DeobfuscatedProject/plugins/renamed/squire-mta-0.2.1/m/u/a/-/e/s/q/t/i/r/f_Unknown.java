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

public class f_Unknown
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
        f.lllIllIIllII[1] = 1;
        f.lllIllIIllII[2] = 0x28 ^ 2;
        f.lllIllIIllII[3] = 2;
    }

    private static boolean lIIIllIIlllllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIllIIlllIlII(String var5, String var11) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(lllIllIIllII[3], var6);
            return new String(var13.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static void lIIIllIIllllIII() {
        lllIllIIIlll = new String[lllIllIIllII[3]];
        f.lllIllIIIlll[f.lllIllIIllII[0]] = f."Time until items swap";
        f.lllIllIIIlll[f.lllIllIIllII[1]] = f."/util/reset.png";
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

    private static String lIIIllIIlllIIll(String var2, String var14) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var4 = var14.toCharArray();
        int var3 = lllIllIIllII[0];
        char[] var9 = var2.toCharArray();
        int var10 = var9.length;
        int var7 = lllIllIIllII[0];
        while (f.lIIIllIIlllllIl(var7, var10)) {
            char var1 = var9[var7];
            var12.append((char)(var1 ^ var4[var3 % var4.length]));
            0;
            ++var3;
            ++var7;
            0;
            if (((0x7F ^ 0x70) & ~(0x5B ^ 0x54)) == 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    private static boolean lIIIllIIlllllII(Object object) {
        return object != null;
    }
}

