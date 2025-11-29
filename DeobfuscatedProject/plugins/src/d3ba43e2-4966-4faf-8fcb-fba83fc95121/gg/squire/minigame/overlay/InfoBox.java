/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.minigame.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.minigame.SquirePestControl;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class InfoBox
extends OverlayPanel {
    private static /* synthetic */ String[] lIIIlIIlllIlI;
    private final /* synthetic */ SquirePestControl o;
    private final /* synthetic */ TaskManager n;
    private static /* synthetic */ int[] lIIIlIIlllllI;

    static {
        InfoBox.lIIllllllIIlIII();
        InfoBox.lIIllllllIIIllI();
    }

    public long d(int n) {
        Duration duration = Duration.between(this.o.getStarted(), Instant.now());
        if (InfoBox.lIIllllllIIlIlI(duration.isZero() ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (InfoBox.lIIllllllIIlIIl(this.o.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.o.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIIlIIlllIlI[lIIIlIIlllllI[0]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlIIlllIlI[lIIIlIIlllllI[1]]).right(Time.format((Duration)duration)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlIIlllIlI[lIIIlIIlllllI[2]]).right(String.valueOf(this.o.b())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlIIlllIlI[lIIIlIIlllllI[3]]).right(String.valueOf(this.o.c())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlIIlllIlI[lIIIlIIlllllI[4]]).right(String.valueOf(this.d(this.o.c()))).build());
        "".length();
        int n = lIIIlIIlllllI[5];
        this.panelComponent.setPreferredSize(new Dimension(n, lIIIlIIlllllI[0]));
        return super.render(graphics2D);
    }

    private static void lIIllllllIIIllI() {
        lIIIlIIlllIlI = new String[lIIIlIIlllllI[6]];
        InfoBox.lIIIlIIlllIlI[InfoBox.lIIIlIIlllllI[0]] = InfoBox.lIIllllllIIIIlI("coTbrsLdYJ9lHe0Zxm1t6vqAf+DjrF0V", "wqIKx");
        InfoBox.lIIIlIIlllIlI[InfoBox.lIIIlIIlllllI[1]] = InfoBox.lIIllllllIIIIlI("E3x6lrQ2nAU=", "uVrVx");
        InfoBox.lIIIlIIlllIlI[InfoBox.lIIIlIIlllllI[2]] = InfoBox.lIIllllllIIIIlI("Wo3K+Pb7wZXidkd7m/cmV3wVb/0Abi/j", "pxsph");
        InfoBox.lIIIlIIlllIlI[InfoBox.lIIIlIIlllllI[3]] = InfoBox.lIIllllllIIIlIl("VYxFsmIncQcej4jkDPBnOg==", "vkReQ");
        InfoBox.lIIIlIIlllIlI[InfoBox.lIIIlIIlllllI[4]] = InfoBox.lIIllllllIIIlIl("njeOMZnJ8Ose5OjLfhOoweL0XnT/pqDw", "PaEem");
    }

    private static boolean lIIllllllIIlIIl(int n) {
        return n != 0;
    }

    private static String lIIllllllIIIIlI(String lllllllllllllllIIIIlllIllIlllIlI, String lllllllllllllllIIIIlllIllIllIlll) {
        try {
            SecretKeySpec lllllllllllllllIIIIlllIllIllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlllIllIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIlllIllIllllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIlllIllIllllII.init(lIIIlIIlllllI[2], lllllllllllllllIIIIlllIllIllllIl);
            return new String(lllllllllllllllIIIIlllIllIllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlllIllIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlllIllIlllIll) {
            lllllllllllllllIIIIlllIllIlllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllllllIIlIlI(int n) {
        return n == 0;
    }

    @Inject
    public InfoBox(TaskManager taskManager, SquirePestControl squirePestControl) {
        this.n = taskManager;
        this.o = squirePestControl;
        this.setPosition(OverlayPosition.TOP_LEFT);
    }

    private static String lIIllllllIIIlIl(String lllllllllllllllIIIIlllIllIlIlIll, String lllllllllllllllIIIIlllIllIlIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIIIIlllIllIllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlllIllIlIlIlI.getBytes(StandardCharsets.UTF_8)), lIIIlIIlllllI[7]), "DES");
            Cipher lllllllllllllllIIIIlllIllIlIllll = Cipher.getInstance("DES");
            lllllllllllllllIIIIlllIllIlIllll.init(lIIIlIIlllllI[2], lllllllllllllllIIIIlllIllIllIIII);
            return new String(lllllllllllllllIIIIlllIllIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlllIllIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlllIllIlIlllI) {
            lllllllllllllllIIIIlllIllIlIlllI.printStackTrace();
            return null;
        }
    }

    private static void lIIllllllIIlIII() {
        lIIIlIIlllllI = new int[8];
        InfoBox.lIIIlIIlllllI[0] = (146 + 7 - 104 + 164 ^ 70 + 35 - 67 + 110) & (6 + 197 - 67 + 83 ^ 91 + 57 - 49 + 55 ^ -" ".length());
        InfoBox.lIIIlIIlllllI[1] = " ".length();
        InfoBox.lIIIlIIlllllI[2] = "  ".length();
        InfoBox.lIIIlIIlllllI[3] = "   ".length();
        InfoBox.lIIIlIIlllllI[4] = 0x6C ^ 0x68;
        InfoBox.lIIIlIIlllllI[5] = 0xFFFFFFE7 & 0x11A;
        InfoBox.lIIIlIIlllllI[6] = 0x4B ^ 0x44 ^ (0x36 ^ 0x3C);
        InfoBox.lIIIlIIlllllI[7] = 17 + 53 - -22 + 35 ^ (0x14 ^ 0x63);
    }
}

