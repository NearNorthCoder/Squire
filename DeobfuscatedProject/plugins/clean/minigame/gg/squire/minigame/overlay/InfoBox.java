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
    
    private final  SquirePestControl o;
    private final  TaskManager n;

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

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlIIlllIlI[lIIIlIIlllllI[1]]).right(Time.format((Duration)duration)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlIIlllIlI[lIIIlIIlllllI[2]]).right(String.valueOf(this.o.b())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlIIlllIlI[lIIIlIIlllllI[3]]).right(String.valueOf(this.o.c())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlIIlllIlI[lIIIlIIlllllI[4]]).right(String.valueOf(this.d(this.o.c()))).build());

        int n = lIIIlIIlllllI[5];
        this.panelComponent.setPreferredSize(new Dimension(n, lIIIlIIlllllI[0]));
        return super.render(graphics2D);
    }

    private static void lIIllllllIIIllI() {
        lIIIlIIlllIlI = new String[lIIIlIIlllllI[6]];
        InfoBox.lIIIlIIlllIlI[InfoBox.lIIIlIIlllllI[0]] = "Squire Pest Control";
        InfoBox.lIIIlIIlllIlI[InfoBox.lIIIlIIlllllI[1]] = "Runtime";
        InfoBox.lIIIlIIlllIlI[InfoBox.lIIIlIIlllllI[2]] = "Starting Points: ";
        InfoBox.lIIIlIIlllIlI[InfoBox.lIIIlIIlllllI[3]] = "Points Gained: ";
        InfoBox.lIIIlIIlllIlI[InfoBox.lIIIlIIlllllI[4]] = "Points Per Hour: ";
    }

    private static boolean lIIllllllIIlIIl(int n) {
        return n != 0;
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

}

