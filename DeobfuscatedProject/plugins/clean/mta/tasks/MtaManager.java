/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.plugins.Plugin
 *  net.runelite.client.ui.overlay.infobox.Timer
 *  net.runelite.client.util.ImageUtil
 */
package gg.squire.mta.tasks;

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

public class MtaManager
extends Timer {
    private static  BufferedImage K;
    
    private static final  int J;

    public MtaManager(Plugin plugin) {
        super(42L, ChronoUnit.SECONDS, f.q(), plugin);
        this.setTooltip(lllIllIIIlll[lllIllIIllII[0]]);
    }

    private static boolean lIIIllIIlllllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIllIIllllIII() {
        lllIllIIIlll = new String[lllIllIIllII[3]];
        f.lllIllIIIlll[f.lllIllIIllII[0]] = "Time until items swap";
        f.lllIllIIIlll[f.lllIllIIllII[1]] = "/util/reset.png";
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
        K = ImageUtil.loadImageResource(MtaManager.class, (String)lllIllIIIlll[lllIllIIllII[1]]);
        return K;
    }

        return String.valueOf(var1);
    }

    private static boolean lIIIllIIlllllII(Object object) {
        return object != null;
    }
}

