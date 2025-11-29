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
package gg.squire.sepulchre.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
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

public class SquireSepulchreInfoBox
extends OverlayPanel {
    private final  SquireSepulchre aa;

    private final  TaskManager ab;
    private final  SquireSepulchreConfig ac;

    private static boolean lIIIlIlIIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlIlIIIlIlll(int n2) {
        return n2 != 0;
    }

    static {
        SquireSepulchreInfoBox.lIIIlIlIIIlIllI();
        SquireSepulchreInfoBox.lIIIlIlIIIlIlIl();
    }

        return String.valueOf(var1);
    }

    private static void lIIIlIlIIIlIlIl() {
        lllIIlIllIII = new String[lllIIlIllIIl[8]];
        SquireSepulchreInfoBox.lllIIlIllIII[SquireSepulchreInfoBox.lllIIlIllIIl[1]] = "Squire Hallowed Sepulchre";
        SquireSepulchreInfoBox.lllIIlIllIII[SquireSepulchreInfoBox.lllIIlIllIIl[4]] = "Version:";
        SquireSepulchreInfoBox.lllIIlIllIII[SquireSepulchreInfoBox.lllIIlIllIIl[5]] = "1.2.10";
        SquireSepulchreInfoBox.lllIIlIllIII[SquireSepulchreInfoBox.lllIIlIllIIl[6]] = "Runtime:";
        SquireSepulchreInfoBox.lllIIlIllIII[SquireSepulchreInfoBox.lllIIlIllIIl[7]] = "Obstacle:";
    }

    @Inject
    public SquireSepulchreInfoBox(SquireSepulchre squireSepulchre, TaskManager taskManager, SquireSepulchreConfig squireSepulchreConfig) {
        this.aa = squireSepulchre;
        this.ab = squireSepulchre.getManager();
        this.ac = squireSepulchreConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    public long b(int n2) {
        Duration duration = Duration.between(this.aa.getStarted(), Instant.now());
        if (SquireSepulchreInfoBox.lIIIlIlIIIllIII(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean lIIIlIlIIIllIII(int n2) {
        return n2 == 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (SquireSepulchreInfoBox.lIIIlIlIIIlIlll(this.aa.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lllIIlIllIIl[0], lllIIlIllIIl[0], lllIIlIllIIl[0], lllIIlIllIIl[0]));
        String string = lllIIlIllIII[lllIIlIllIIl[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());

        int n2 = lllIIlIllIIl[2];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lllIIlIllIIl[3], lllIIlIllIIl[1]));
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIlIllIII[lllIIlIllIIl[4]]).right(lllIIlIllIII[lllIIlIllIIl[5]]).build());

        Duration duration = Duration.between(this.aa.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIlIllIII[lllIIlIllIIl[6]]).right(Time.format((Duration)duration)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIlIllIII[lllIIlIllIIl[7]]).right(this.aa.getName()).build());

        return super.render(graphics2D);
    }
}

