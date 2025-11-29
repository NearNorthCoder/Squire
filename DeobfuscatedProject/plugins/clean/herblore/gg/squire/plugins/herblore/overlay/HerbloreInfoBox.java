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
package gg.squire.plugins.herblore.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.plugins.herblore.HerbloreConfig;
import gg.squire.plugins.herblore.SquireHerblore;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.Instant;
import java.util.Base64;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class HerbloreInfoBox
extends OverlayPanel {
    private final  HerbloreConfig m;

    private final  TaskManager l;
    private final  SquireHerblore k;

    private static boolean lIIIlIlllIlIlII(int n) {
        return n == 0;
    }

    private static boolean lIIIlIlllIlIIll(int n) {
        return n != 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (HerbloreInfoBox.lIIIlIlllIlIIll(this.k.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lllIlIIIllII[0], lllIlIIIllII[0], lllIlIIIllII[0], lllIlIIIllII[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIlIIIlIll[lllIlIIIllII[1]]).build());

        Duration duration = Duration.between(this.k.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIIIlIll[lllIlIIIllII[2]]).right(Time.format((Duration)duration)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIIIlIll[lllIlIIIllII[3]]).right(this.l.getCurrentTask()).build());

        int n = lllIlIIIllII[4];
        this.panelComponent.setPreferredSize(new Dimension(n + lllIlIIIllII[5], lllIlIIIllII[1]));
        return super.render(graphics2D);
    }

    @Inject
    private HerbloreInfoBox(SquireHerblore squireHerblore, HerbloreConfig herbloreConfig) {
        this.k = squireHerblore;
        this.l = squireHerblore.getManager();
        this.m = herbloreConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    public long c(int n) {
        Duration duration = Duration.between(this.k.getStarted(), Instant.now());
        if (HerbloreInfoBox.lIIIlIlllIlIlII(duration.isZero() ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean lIIIlIlllIlIlIl(int n, int n2) {
        return n < n2;
    }

    private static void lIIIlIlllIlIIIl() {
        lllIlIIIlIll = new String[lllIlIIIllII[6]];
        HerbloreInfoBox.lllIlIIIlIll[HerbloreInfoBox.lllIlIIIllII[1]] = "Squire Herblore";
        HerbloreInfoBox.lllIlIIIlIll[HerbloreInfoBox.lllIlIIIllII[2]] = "Runtime: ";
        HerbloreInfoBox.lllIlIIIlIll[HerbloreInfoBox.lllIlIIIllII[3]] = "Task: ";
    }

        return String.valueOf(var1);
    }

    static {
        HerbloreInfoBox.lIIIlIlllIlIIlI();
        HerbloreInfoBox.lIIIlIlllIlIIIl();
    }
}

