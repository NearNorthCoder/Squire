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
package gg.squire.construction.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.construction.SquirePlankerConfig;
import gg.squire.construction.SquirePlankerPlugin;
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

public class PlankerInfoBox
extends OverlayPanel {
    private final  SquirePlankerConfig k;

    private final  TaskManager j;
    private final  SquirePlankerPlugin i;

    private static void lIIlIIllllIllIl() {
        llllllIIIIIl = new String[llllllIIIIlI[8]];
        PlankerInfoBox.llllllIIIIIl[PlankerInfoBox.llllllIIIIlI[1]] = "Squire Planker";
        PlankerInfoBox.llllllIIIIIl[PlankerInfoBox.llllllIIIIlI[2]] = "Version";
        PlankerInfoBox.llllllIIIIIl[PlankerInfoBox.llllllIIIIlI[3]] = "0.1.1";
        PlankerInfoBox.llllllIIIIIl[PlankerInfoBox.llllllIIIIlI[4]] = "Runtime";
        PlankerInfoBox.llllllIIIIIl[PlankerInfoBox.llllllIIIIlI[5]] = "Task: ";
    }

        return String.valueOf(var1);
    }

    private static boolean lIIlIIlllllIIIl(int n, int n2) {
        return n < n2;
    }

    @Inject
    private PlankerInfoBox(SquirePlankerPlugin squirePlankerPlugin, SquirePlankerConfig squirePlankerConfig) {
        this.i = squirePlankerPlugin;
        this.j = squirePlankerPlugin.getManager();
        this.k = squirePlankerConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    public long a(int n) {
        Duration duration = Duration.between(this.i.getStarted(), Instant.now());
        if (PlankerInfoBox.lIIlIIlllllIIII(duration.isZero() ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean lIIlIIlllllIIII(int n) {
        return n == 0;
    }

    private static boolean lIIlIIllllIllll(int n) {
        return n != 0;
    }

    static {
        PlankerInfoBox.lIIlIIllllIlllI();
        PlankerInfoBox.lIIlIIllllIllIl();
    }

    public Dimension render(Graphics2D graphics2D) {
        if (PlankerInfoBox.lIIlIIllllIllll(this.i.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.i.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(llllllIIIIlI[0], llllllIIIIlI[0], llllllIIIIlI[0], llllllIIIIlI[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llllllIIIIIl[llllllIIIIlI[1]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(llllllIIIIIl[llllllIIIIlI[2]]).right(llllllIIIIIl[llllllIIIIlI[3]]).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(llllllIIIIIl[llllllIIIIlI[4]]).right(Time.format((Duration)duration)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(llllllIIIIIl[llllllIIIIlI[5]]).right(this.j.getCurrentTask()).build());

        int n = llllllIIIIlI[6];
        this.panelComponent.setPreferredSize(new Dimension(n + llllllIIIIlI[7], llllllIIIIlI[1]));
        return super.render(graphics2D);
    }
}

