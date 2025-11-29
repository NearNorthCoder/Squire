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
 */
package gg.squire.tempoross.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.tempoross.SquireTempoross;
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
import gg.squire.tempoross.overlay.TemporossManager;

public class TemporossInfoBox
extends OverlayPanel {
    private final  TaskManager ad;
    private final  a ac;
    private final  SquireTempoross ab;

    private static boolean lIllIIlIIIIllll(int n2) {
        return n2 != 0;
    }

    static {
        TemporossInfoBox.lIllIIlIIIIllIl();
        TemporossInfoBox.lIllIIlIIIIlIll();
    }

        return String.valueOf(var1);
    }

    private static boolean lIllIIlIIIIlllI(int n2) {
        return n2 == 0;
    }

    public double g(int n2) {
        Duration duration = Duration.between(this.ab.getStarted(), Instant.now());
        if (TemporossInfoBox.lIllIIlIIIIlllI(duration.isZero() ? 1 : 0)) {
            return (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (TemporossInfoBox.lIllIIlIIIIllll(this.ab.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIIlllIIIIIlI[0], lIIlllIIIIIlI[0], lIIlllIIIIIlI[0], lIIlllIIIIIlI[0]));
        String string = lIIlllIIIIIIl[lIIlllIIIIIlI[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());

        int n2 = lIIlllIIIIIlI[2];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIIlllIIIIIlI[3], lIIlllIIIIIlI[1]));
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIIIIIIl[lIIlllIIIIIlI[4]]).right(String.valueOf(this.ac.B().toElapsedString())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIIIIIIl[lIIlllIIIIIlI[5]]).right(this.ad.getCurrentTask()).build());

        Object[] objectArray = new Object[lIIlllIIIIIlI[5]];
        objectArray[TemporossInfoBox.lIIlllIIIIIlI[1]] = this.ac.D();
        objectArray[TemporossInfoBox.lIIlllIIIIIlI[4]] = this.g(this.ac.D());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIIIIIIl[lIIlllIIIIIlI[6]]).right(String.format(lIIlllIIIIIIl[lIIlllIIIIIlI[7]], objectArray)).build());

        Object[] objectArray2 = new Object[lIIlllIIIIIlI[5]];
        objectArray2[TemporossInfoBox.lIIlllIIIIIlI[1]] = this.ac.C();
        objectArray2[TemporossInfoBox.lIIlllIIIIIlI[4]] = this.g(this.ac.C());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIIIIIIl[lIIlllIIIIIlI[8]]).right(String.format(lIIlllIIIIIIl[lIIlllIIIIIlI[9]], objectArray2)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIIIIIIl[lIIlllIIIIIlI[10]]).right(String.valueOf(this.ac.E())).build());

        return super.render(graphics2D);
    }

    @Inject
    public TemporossInfoBox(SquireTempoross squireTempoross, a a2) {
        this.ab = squireTempoross;
        this.ac = a2;
        this.ad = squireTempoross.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lIllIIlIIIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIIlIIIIlIll() {
        lIIlllIIIIIIl = new String[lIIlllIIIIIlI[11]];
        TemporossInfoBox.lIIlllIIIIIIl[TemporossInfoBox.lIIlllIIIIIlI[1]] = "Squire Tempoross";
        TemporossInfoBox.lIIlllIIIIIIl[TemporossInfoBox.lIIlllIIIIIlI[4]] = "Runtime:";
        TemporossInfoBox.lIIlllIIIIIIl[TemporossInfoBox.lIIlllIIIIIlI[5]] = "Task: ";
        TemporossInfoBox.lIIlllIIIIIIl[TemporossInfoBox.lIIlllIIIIIlI[6]] = "Number of games:";
        TemporossInfoBox.lIIlllIIIIIIl[TemporossInfoBox.lIIlllIIIIIlI[7]] = "%d (%.1f/h)";
        TemporossInfoBox.lIIlllIIIIIIl[TemporossInfoBox.lIIlllIIIIIlI[8]] = "Permits gained:";
        TemporossInfoBox.lIIlllIIIIIIl[TemporossInfoBox.lIIlllIIIIIlI[9]] = "%d (%.1f/h)";
        TemporossInfoBox.lIIlllIIIIIIl[TemporossInfoBox.lIIlllIIIIIlI[10]] = "Phase: ";
    }
}

